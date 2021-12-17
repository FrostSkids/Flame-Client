// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.ArrayDeque;
import io.netty.util.internal.StringUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.InternalThreadLocalMap;
import java.util.concurrent.TimeUnit;
import io.netty.util.internal.EmptyArrays;
import java.util.concurrent.CancellationException;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.Signal;

public class DefaultPromise<V> extends AbstractFuture<V> implements Promise<V>
{
    private static final /* synthetic */ Signal SUCCESS;
    private /* synthetic */ Object listeners;
    private /* synthetic */ short waiters;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ CauseHolder CANCELLATION_CAUSE_HOLDER;
    private volatile /* synthetic */ Object result;
    private static final /* synthetic */ String[] llIIlIIIIIlIlI;
    private /* synthetic */ LateListeners lateListeners;
    private final /* synthetic */ EventExecutor executor;
    private static final /* synthetic */ InternalLogger rejectedExecutionLogger;
    private static final /* synthetic */ Signal UNCANCELLABLE;
    private static final /* synthetic */ int[] llIIlIIIIlIIIl;
    
    private boolean setFailure0(final Throwable llllllllllllIlllIIllIllIIIIlllll) {
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIllIIIIlllll)) {
            throw new NullPointerException(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[7]]);
        }
        if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
            return DefaultPromise.llIIlIIIIlIIIl[0] != 0;
        }
        final Exception llllllllllllIlllIIllIllIIIIllllI = (Exception)this;
        synchronized (this) {
            if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
                return DefaultPromise.llIIlIIIIlIIIl[0] != 0;
            }
            this.result = new CauseHolder(llllllllllllIlllIIllIllIIIIlllll);
            if (lIIIlIlllIIlIlll(this.hasWaiters() ? 1 : 0)) {
                this.notifyAll();
            }
            // monitorexit(this)
            "".length();
            if (" ".length() <= 0) {
                return ((0xAE ^ 0xBE) & ~(0xD0 ^ 0xC0)) != 0x0;
            }
        }
        return DefaultPromise.llIIlIIIIlIIIl[1] != 0;
    }
    
    private boolean hasWaiters() {
        int n;
        if (lIIIlIlllIlIIIlI(this.waiters)) {
            n = DefaultPromise.llIIlIIIIlIIIl[1];
            "".length();
            if (-" ".length() >= ((0x5F ^ 0x10) & ~(0x19 ^ 0x56))) {
                return ((0x3F ^ 0x5) & ~(0x7D ^ 0x47)) != 0x0;
            }
        }
        else {
            n = DefaultPromise.llIIlIIIIlIIIl[0];
        }
        return n != 0;
    }
    
    private static String lIIIlIlllIIIlIIl(final String llllllllllllIlllIIllIlIIlIlllIll, final String llllllllllllIlllIIllIlIIlIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIlIIlIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIlIIlIlllIlI.getBytes(StandardCharsets.UTF_8)), DefaultPromise.llIIlIIIIlIIIl[9]), "DES");
            final Cipher llllllllllllIlllIIllIlIIlIllllIl = Cipher.getInstance("DES");
            llllllllllllIlllIIllIlIIlIllllIl.init(DefaultPromise.llIIlIIIIlIIIl[2], llllllllllllIlllIIllIlIIlIlllllI);
            return new String(llllllllllllIlllIIllIlIIlIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIlIIlIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIlIIlIllllII) {
            llllllllllllIlllIIllIlIIlIllllII.printStackTrace();
            return null;
        }
    }
    
    private static void execute(final EventExecutor llllllllllllIlllIIllIlIllIllIlIl, final Runnable llllllllllllIlllIIllIlIllIllIlII) {
        try {
            llllllllllllIlllIIllIlIllIllIlIl.execute(llllllllllllIlllIIllIlIllIllIlII);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllIIllIlIllIlllIII) {
            DefaultPromise.rejectedExecutionLogger.error(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[10]], llllllllllllIlllIIllIlIllIlllIII);
        }
    }
    
    private static void notifyListeners0(final Future<?> llllllllllllIlllIIllIlIllllIIIll, final DefaultFutureListeners llllllllllllIlllIIllIlIllllIIllI) {
        final GenericFutureListener<?>[] llllllllllllIlllIIllIlIllllIIlIl = llllllllllllIlllIIllIlIllllIIllI.listeners();
        final int llllllllllllIlllIIllIlIllllIIlII = llllllllllllIlllIIllIlIllllIIllI.size();
        int llllllllllllIlllIIllIlIllllIlIII = DefaultPromise.llIIlIIIIlIIIl[0];
        while (lIIIlIlllIIllllI(llllllllllllIlllIIllIlIllllIlIII, llllllllllllIlllIIllIlIllllIIlII)) {
            notifyListener0(llllllllllllIlllIIllIlIllllIIIll, llllllllllllIlllIIllIlIllllIIlIl[llllllllllllIlllIIllIlIllllIlIII]);
            ++llllllllllllIlllIIllIlIllllIlIII;
            "".length();
            if (-(0x7F ^ 0x7A) >= 0) {
                return;
            }
        }
    }
    
    static {
        lIIIlIlllIIlIlIl();
        lIIIlIlllIIlIIIl();
        MAX_LISTENER_STACK_DEPTH = DefaultPromise.llIIlIIIIlIIIl[9];
        logger = InternalLoggerFactory.getInstance(DefaultPromise.class);
        rejectedExecutionLogger = InternalLoggerFactory.getInstance(String.valueOf(new StringBuilder().append(DefaultPromise.class.getName()).append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[21]])));
        SUCCESS = Signal.valueOf(String.valueOf(new StringBuilder().append(DefaultPromise.class.getName()).append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[22]])));
        UNCANCELLABLE = Signal.valueOf(String.valueOf(new StringBuilder().append(DefaultPromise.class.getName()).append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[23]])));
        CANCELLATION_CAUSE_HOLDER = new CauseHolder(new CancellationException());
        DefaultPromise.CANCELLATION_CAUSE_HOLDER.cause.setStackTrace(EmptyArrays.EMPTY_STACK_TRACE);
    }
    
    private static void notifyProgressiveListener0(final ProgressiveFuture llllllllllllIlllIIllIlIlIlIlIllI, final GenericProgressiveFutureListener llllllllllllIlllIIllIlIlIlIlIlIl, final long llllllllllllIlllIIllIlIlIlIlIIII, final long llllllllllllIlllIIllIlIlIlIIllll) {
        try {
            llllllllllllIlllIIllIlIlIlIlIlIl.operationProgressed(llllllllllllIlllIIllIlIlIlIlIllI, llllllllllllIlllIIllIlIlIlIlIIII, llllllllllllIlllIIllIlIlIlIIllll);
            "".length();
            if (-(0x41 ^ 0x45) > 0) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllIIllIlIlIlIlIlll) {
            if (lIIIlIlllIIlIlll(DefaultPromise.logger.isWarnEnabled() ? 1 : 0)) {
                DefaultPromise.logger.warn(String.valueOf(new StringBuilder().append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[13]]).append(llllllllllllIlllIIllIlIlIlIlIlIl.getClass().getName()).append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[14]])), llllllllllllIlllIIllIlIlIlIlIlll);
            }
        }
    }
    
    @Override
    public Promise<V> addListener(final GenericFutureListener<? extends Future<? super V>> llllllllllllIlllIIllIllIllllIIlI) {
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIllIllllIIlI)) {
            throw new NullPointerException(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[1]]);
        }
        if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
            this.notifyLateListener(llllllllllllIlllIIllIllIllllIIlI);
            return this;
        }
        final short llllllllllllIlllIIllIllIlllIllll = (short)this;
        synchronized (this) {
            if (lIIIlIlllIIlllII(this.isDone() ? 1 : 0)) {
                if (lIIIlIlllIIlIllI(this.listeners)) {
                    this.listeners = llllllllllllIlllIIllIllIllllIIlI;
                    "".length();
                    if ("  ".length() <= 0) {
                        return null;
                    }
                }
                else if (lIIIlIlllIIlIlll((this.listeners instanceof DefaultFutureListeners) ? 1 : 0)) {
                    ((DefaultFutureListeners)this.listeners).add(llllllllllllIlllIIllIllIllllIIlI);
                    "".length();
                    if (-(0x5A ^ 0x4B ^ (0x35 ^ 0x21)) >= 0) {
                        return null;
                    }
                }
                else {
                    final GenericFutureListener<? extends Future<V>> llllllllllllIlllIIllIllIllllIlII = (GenericFutureListener<? extends Future<V>>)this.listeners;
                    this.listeners = new DefaultFutureListeners(llllllllllllIlllIIllIllIllllIlII, llllllllllllIlllIIllIllIllllIIlI);
                }
                return this;
            }
            // monitorexit(this)
            "".length();
            if (null != null) {
                return null;
            }
        }
        this.notifyLateListener(llllllllllllIlllIIllIllIllllIIlI);
        return this;
    }
    
    private static boolean lIIIlIlllIIllIll(final Object llllllllllllIlllIIllIlIIlIlIIlIl, final Object llllllllllllIlllIIllIlIIlIlIIlII) {
        return llllllllllllIlllIIllIlIIlIlIIlIl == llllllllllllIlllIIllIlIIlIlIIlII;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.toStringBuilder());
    }
    
    private static boolean lIIIlIlllIIllIlI(final Object llllllllllllIlllIIllIlIIlIlIlIll, final Object llllllllllllIlllIIllIlIIlIlIlIlI) {
        return llllllllllllIlllIIllIlIIlIlIlIll != llllllllllllIlllIIllIlIIlIlIlIlI;
    }
    
    @Override
    public Promise<V> awaitUninterruptibly() {
        if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
            return this;
        }
        boolean llllllllllllIlllIIllIllIlIIlIIlI = DefaultPromise.llIIlIIIIlIIIl[0] != 0;
        final boolean llllllllllllIlllIIllIllIlIIIllll = (boolean)this;
        synchronized (this) {
            while (lIIIlIlllIIlllII(this.isDone() ? 1 : 0)) {
                this.checkDeadLock();
                this.incWaiters();
                try {
                    this.wait();
                    this.decWaiters();
                    "".length();
                    if (" ".length() >= "   ".length()) {
                        return null;
                    }
                }
                catch (InterruptedException llllllllllllIlllIIllIllIlIIlIlII) {
                    llllllllllllIlllIIllIllIlIIlIIlI = (DefaultPromise.llIIlIIIIlIIIl[1] != 0);
                    this.decWaiters();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                finally {
                    this.decWaiters();
                }
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            // monitorexit(this)
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        if (lIIIlIlllIIlIlll(llllllllllllIlllIIllIllIlIIlIIlI ? 1 : 0)) {
            Thread.currentThread().interrupt();
        }
        return this;
    }
    
    private static void lIIIlIlllIIlIlIl() {
        (llIIlIIIIlIIIl = new int[25])[0] = ((118 + 7 - 80 + 84 ^ 8 + 48 + 3 + 79) & (142 + 162 - 130 + 3 ^ 152 + 39 - 144 + 139 ^ -" ".length()));
        DefaultPromise.llIIlIIIIlIIIl[1] = " ".length();
        DefaultPromise.llIIlIIIIlIIIl[2] = "  ".length();
        DefaultPromise.llIIlIIIIlIIIl[3] = "   ".length();
        DefaultPromise.llIIlIIIIlIIIl[4] = (0x2C ^ 0x28);
        DefaultPromise.llIIlIIIIlIIIl[5] = (62 + 46 + 41 + 26 ^ 61 + 73 - 64 + 100);
        DefaultPromise.llIIlIIIIlIIIl[6] = (133 + 100 - 228 + 177 ^ 43 + 102 - 70 + 101);
        DefaultPromise.llIIlIIIIlIIIl[7] = (0xC4 ^ 0xC3);
        DefaultPromise.llIIlIIIIlIIIl[8] = (-1 & 0x7FFF);
        DefaultPromise.llIIlIIIIlIIIl[9] = (0xDE ^ 0x97 ^ (0x3C ^ 0x7D));
        DefaultPromise.llIIlIIIIlIIIl[10] = (0xC5 ^ 0xB6 ^ (0xF7 ^ 0x8D));
        DefaultPromise.llIIlIIIIlIIIl[11] = (0x62 ^ 0x0 ^ (0x17 ^ 0x7F));
        DefaultPromise.llIIlIIIIlIIIl[12] = (144 + 24 - 105 + 83 ^ 99 + 135 - 138 + 57);
        DefaultPromise.llIIlIIIIlIIIl[13] = (0xD ^ 0x7B ^ (0xD9 ^ 0xA3));
        DefaultPromise.llIIlIIIIlIIIl[14] = (0x1E ^ 0x13);
        DefaultPromise.llIIlIIIIlIIIl[15] = (0x26 ^ 0x66);
        DefaultPromise.llIIlIIIIlIIIl[16] = (0x54 ^ 0x65 ^ (0x69 ^ 0x56));
        DefaultPromise.llIIlIIIIlIIIl[17] = (26 + 181 - 65 + 61 ^ 176 + 190 - 324 + 154);
        DefaultPromise.llIIlIIIIlIIIl[18] = (29 + 151 - 179 + 168 ^ 57 + 41 - 61 + 148);
        DefaultPromise.llIIlIIIIlIIIl[19] = (0x8F ^ 0xC7 ^ (0xD0 ^ 0xB1));
        DefaultPromise.llIIlIIIIlIIIl[20] = (0x6F ^ 0x7E);
        DefaultPromise.llIIlIIIIlIIIl[21] = (0x63 ^ 0x71);
        DefaultPromise.llIIlIIIIlIIIl[22] = (0xC1 ^ 0x9C ^ (0xEB ^ 0xA5));
        DefaultPromise.llIIlIIIIlIIIl[23] = (0x41 ^ 0x55);
        DefaultPromise.llIIlIIIIlIIIl[24] = (0x9A ^ 0x8A ^ (0x91 ^ 0x94));
    }
    
    private static boolean lIIIlIlllIIlIlll(final int llllllllllllIlllIIllIlIIlIlIIIII) {
        return llllllllllllIlllIIllIlIIlIlIIIII != 0;
    }
    
    public DefaultPromise(final EventExecutor llllllllllllIlllIIllIlllIIIlllIl) {
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIlllIIIlllIl)) {
            throw new NullPointerException(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[0]]);
        }
        this.executor = llllllllllllIlllIIllIlllIIIlllIl;
    }
    
    @Override
    public boolean trySuccess(final V llllllllllllIlllIIllIllIIlIIlIlI) {
        if (lIIIlIlllIIlIlll(this.setSuccess0(llllllllllllIlllIIllIllIIlIIlIlI) ? 1 : 0)) {
            this.notifyListeners();
            return DefaultPromise.llIIlIIIIlIIIl[1] != 0;
        }
        return DefaultPromise.llIIlIIIIlIIIl[0] != 0;
    }
    
    @Override
    public boolean tryFailure(final Throwable llllllllllllIlllIIllIllIIIllllII) {
        if (lIIIlIlllIIlIlll(this.setFailure0(llllllllllllIlllIIllIllIIIllllII) ? 1 : 0)) {
            this.notifyListeners();
            return DefaultPromise.llIIlIIIIlIIIl[1] != 0;
        }
        return DefaultPromise.llIIlIIIIlIIIl[0] != 0;
    }
    
    protected DefaultPromise() {
        this.executor = null;
    }
    
    private static String lIIIlIlllIIIlIII(String llllllllllllIlllIIllIlIIllIIlIll, final String llllllllllllIlllIIllIlIIllIIlIlI) {
        llllllllllllIlllIIllIlIIllIIlIll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIllIlIIllIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIllIlIIllIIlllI = new StringBuilder();
        final char[] llllllllllllIlllIIllIlIIllIIllIl = llllllllllllIlllIIllIlIIllIIlIlI.toCharArray();
        int llllllllllllIlllIIllIlIIllIIllII = DefaultPromise.llIIlIIIIlIIIl[0];
        final float llllllllllllIlllIIllIlIIllIIIllI = (Object)((String)llllllllllllIlllIIllIlIIllIIlIll).toCharArray();
        final long llllllllllllIlllIIllIlIIllIIIlIl = llllllllllllIlllIIllIlIIllIIIllI.length;
        boolean llllllllllllIlllIIllIlIIllIIIlII = DefaultPromise.llIIlIIIIlIIIl[0] != 0;
        while (lIIIlIlllIIllllI(llllllllllllIlllIIllIlIIllIIIlII ? 1 : 0, (int)llllllllllllIlllIIllIlIIllIIIlIl)) {
            final char llllllllllllIlllIIllIlIIllIlIIIl = llllllllllllIlllIIllIlIIllIIIllI[llllllllllllIlllIIllIlIIllIIIlII];
            llllllllllllIlllIIllIlIIllIIlllI.append((char)(llllllllllllIlllIIllIlIIllIlIIIl ^ llllllllllllIlllIIllIlIIllIIllIl[llllllllllllIlllIIllIlIIllIIllII % llllllllllllIlllIIllIlIIllIIllIl.length]));
            "".length();
            ++llllllllllllIlllIIllIlIIllIIllII;
            ++llllllllllllIlllIIllIlIIllIIIlII;
            "".length();
            if ("   ".length() >= (0x38 ^ 0x3C)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIllIlIIllIIlllI);
    }
    
    private boolean setSuccess0(final V llllllllllllIlllIIllIllIIIIlIlIl) {
        if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
            return DefaultPromise.llIIlIIIIlIIIl[0] != 0;
        }
        final short llllllllllllIlllIIllIllIIIIlIlII = (short)this;
        synchronized (this) {
            if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
                return DefaultPromise.llIIlIIIIlIIIl[0] != 0;
            }
            if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIllIIIIlIlIl)) {
                this.result = DefaultPromise.SUCCESS;
                "".length();
                if ("   ".length() == 0) {
                    return ((0x37 ^ 0x38) & ~(0xC ^ 0x3)) != 0x0;
                }
            }
            else {
                this.result = llllllllllllIlllIIllIllIIIIlIlIl;
            }
            if (lIIIlIlllIIlIlll(this.hasWaiters() ? 1 : 0)) {
                this.notifyAll();
            }
            // monitorexit(this)
            "".length();
            if ("  ".length() == 0) {
                return ((0x1A ^ 0x25) & ~(0xFC ^ 0xC3)) != 0x0;
            }
        }
        return DefaultPromise.llIIlIIIIlIIIl[1] != 0;
    }
    
    @Override
    public boolean await(final long llllllllllllIlllIIllIllIlIlIIIlI, final TimeUnit llllllllllllIlllIIllIllIlIlIIIIl) throws InterruptedException {
        return this.await0(llllllllllllIlllIIllIllIlIlIIIIl.toNanos(llllllllllllIlllIIllIllIlIlIIIlI), (boolean)(DefaultPromise.llIIlIIIIlIIIl[1] != 0));
    }
    
    @Override
    public boolean isCancelled() {
        return isCancelled0(this.result);
    }
    
    private synchronized Object progressiveListeners() {
        final Object llllllllllllIlllIIllIlIllIIlIlII = this.listeners;
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIlIllIIlIlII)) {
            return null;
        }
        if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlIllIIlIlII instanceof DefaultFutureListeners) ? 1 : 0)) {
            final DefaultFutureListeners llllllllllllIlllIIllIlIllIIllIIl = (DefaultFutureListeners)llllllllllllIlllIIllIlIllIIlIlII;
            final int llllllllllllIlllIIllIlIllIIllIII = llllllllllllIlllIIllIlIllIIllIIl.progressiveSize();
            switch (llllllllllllIlllIIllIlIllIIllIII) {
                case 0: {
                    return null;
                }
                case 1: {
                    final GenericFutureListener[] llllllllllllIlllIIllIlIllIIlllll = llllllllllllIlllIIllIlIllIIllIIl.listeners();
                    final int llllllllllllIlllIIllIlIllIIllllI = llllllllllllIlllIIllIlIllIIlllll.length;
                    int llllllllllllIlllIIllIlIllIIlllIl = DefaultPromise.llIIlIIIIlIIIl[0];
                    while (lIIIlIlllIIllllI(llllllllllllIlllIIllIlIllIIlllIl, llllllllllllIlllIIllIlIllIIllllI)) {
                        final GenericFutureListener<?> llllllllllllIlllIIllIlIllIlIIIII = (GenericFutureListener<?>)llllllllllllIlllIIllIlIllIIlllll[llllllllllllIlllIIllIlIllIIlllIl];
                        if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlIllIlIIIII instanceof GenericProgressiveFutureListener) ? 1 : 0)) {
                            return llllllllllllIlllIIllIlIllIlIIIII;
                        }
                        ++llllllllllllIlllIIllIlIllIIlllIl;
                        "".length();
                        if ("   ".length() <= -" ".length()) {
                            return null;
                        }
                    }
                    return null;
                }
                default: {
                    final GenericFutureListener<?>[] llllllllllllIlllIIllIlIllIIlIlll = llllllllllllIlllIIllIlIllIIllIIl.listeners();
                    final GenericProgressiveFutureListener<?>[] llllllllllllIlllIIllIlIllIIlIllI = (GenericProgressiveFutureListener<?>[])new GenericProgressiveFutureListener[llllllllllllIlllIIllIlIllIIllIII];
                    int llllllllllllIlllIIllIlIllIIllIll = DefaultPromise.llIIlIIIIlIIIl[0];
                    int llllllllllllIlllIIllIlIllIIllIlI = DefaultPromise.llIIlIIIIlIIIl[0];
                    while (lIIIlIlllIIllllI(llllllllllllIlllIIllIlIllIIllIlI, llllllllllllIlllIIllIlIllIIllIII)) {
                        final GenericFutureListener<?> llllllllllllIlllIIllIlIllIIlllII = llllllllllllIlllIIllIlIllIIlIlll[llllllllllllIlllIIllIlIllIIllIll];
                        if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlIllIIlllII instanceof GenericProgressiveFutureListener) ? 1 : 0)) {
                            llllllllllllIlllIIllIlIllIIlIllI[llllllllllllIlllIIllIlIllIIllIlI++] = (GenericProgressiveFutureListener<?>)(GenericProgressiveFutureListener)llllllllllllIlllIIllIlIllIIlllII;
                        }
                        ++llllllllllllIlllIIllIlIllIIllIll;
                        "".length();
                        if (" ".length() != " ".length()) {
                            return null;
                        }
                    }
                    return llllllllllllIlllIIllIlIllIIlIllI;
                }
            }
        }
        else {
            if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlIllIIlIlII instanceof GenericProgressiveFutureListener) ? 1 : 0)) {
                return llllllllllllIlllIIllIlIllIIlIlII;
            }
            return null;
        }
    }
    
    @Override
    public Promise<V> await() throws InterruptedException {
        if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
            return this;
        }
        if (lIIIlIlllIIlIlll(Thread.interrupted() ? 1 : 0)) {
            throw new InterruptedException(this.toString());
        }
        final Exception llllllllllllIlllIIllIllIlIlIllII = (Exception)this;
        synchronized (this) {
            while (lIIIlIlllIIlllII(this.isDone() ? 1 : 0)) {
                this.checkDeadLock();
                this.incWaiters();
                try {
                    this.wait();
                    this.decWaiters();
                    "".length();
                    if (-"   ".length() >= 0) {
                        return null;
                    }
                }
                finally {
                    this.decWaiters();
                }
                "".length();
                if (null != null) {
                    return null;
                }
            }
            // monitorexit(this)
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public boolean awaitUninterruptibly(final long llllllllllllIlllIIllIllIlIIIIlIl, final TimeUnit llllllllllllIlllIIllIllIlIIIIlII) {
        try {
            return this.await0(llllllllllllIlllIIllIllIlIIIIlII.toNanos(llllllllllllIlllIIllIllIlIIIIlIl), (boolean)(DefaultPromise.llIIlIIIIlIIIl[0] != 0));
        }
        catch (InterruptedException llllllllllllIlllIIllIllIlIIIIlll) {
            throw new InternalError();
        }
    }
    
    @Override
    public Promise<V> removeListeners(final GenericFutureListener<? extends Future<? super V>>... llllllllllllIlllIIllIllIllIIIIll) {
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIllIllIIIIll)) {
            throw new NullPointerException(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[4]]);
        }
        final GenericFutureListener[] llllllllllllIlllIIllIllIllIIlIIl = llllllllllllIlllIIllIllIllIIIIll;
        final int llllllllllllIlllIIllIllIllIIlIII = llllllllllllIlllIIllIllIllIIlIIl.length;
        int llllllllllllIlllIIllIllIllIIIlll = DefaultPromise.llIIlIIIIlIIIl[0];
        while (lIIIlIlllIIllllI(llllllllllllIlllIIllIllIllIIIlll, llllllllllllIlllIIllIllIllIIlIII)) {
            final GenericFutureListener<? extends Future<? super V>> llllllllllllIlllIIllIllIllIIlIlI = (GenericFutureListener<? extends Future<? super V>>)llllllllllllIlllIIllIllIllIIlIIl[llllllllllllIlllIIllIllIllIIIlll];
            if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIllIllIIlIlI)) {
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
                break;
            }
            else {
                this.removeListener(llllllllllllIlllIIllIllIllIIlIlI);
                "".length();
                ++llllllllllllIlllIIllIllIllIIIlll;
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
                continue;
            }
        }
        return this;
    }
    
    private void notifyListeners() {
        final Object llllllllllllIlllIIllIlIlllllIllI = this.listeners;
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIlIlllllIllI)) {
            return;
        }
        final EventExecutor llllllllllllIlllIIllIlIlllllIlIl = this.executor();
        if (lIIIlIlllIIlIlll(llllllllllllIlllIIllIlIlllllIlIl.inEventLoop() ? 1 : 0)) {
            final InternalThreadLocalMap llllllllllllIlllIIllIlIllllllIll = InternalThreadLocalMap.get();
            final int llllllllllllIlllIIllIlIllllllIlI = llllllllllllIlllIIllIlIllllllIll.futureListenerStackDepth();
            if (lIIIlIlllIIllllI(llllllllllllIlllIIllIlIllllllIlI, DefaultPromise.llIIlIIIIlIIIl[9])) {
                llllllllllllIlllIIllIlIllllllIll.setFutureListenerStackDepth(llllllllllllIlllIIllIlIllllllIlI + DefaultPromise.llIIlIIIIlIIIl[1]);
                try {
                    if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlIlllllIllI instanceof DefaultFutureListeners) ? 1 : 0)) {
                        notifyListeners0(this, (DefaultFutureListeners)llllllllllllIlllIIllIlIlllllIllI);
                        "".length();
                        if (" ".length() > "  ".length()) {
                            return;
                        }
                    }
                    else {
                        final GenericFutureListener<? extends Future<V>> llllllllllllIlllIIllIlIlllllllII = (GenericFutureListener<? extends Future<V>>)llllllllllllIlllIIllIlIlllllIllI;
                        notifyListener0(this, llllllllllllIlllIIllIlIlllllllII);
                    }
                    this.listeners = null;
                    llllllllllllIlllIIllIlIllllllIll.setFutureListenerStackDepth(llllllllllllIlllIIllIlIllllllIlI);
                    "".length();
                    if ((0x60 ^ 0x64) == 0x0) {
                        return;
                    }
                }
                finally {
                    this.listeners = null;
                    llllllllllllIlllIIllIlIllllllIll.setFutureListenerStackDepth(llllllllllllIlllIIllIlIllllllIlI);
                }
                return;
            }
        }
        if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlIlllllIllI instanceof DefaultFutureListeners) ? 1 : 0)) {
            final DefaultFutureListeners llllllllllllIlllIIllIlIllllllIIl = (DefaultFutureListeners)llllllllllllIlllIIllIlIlllllIllI;
            execute(llllllllllllIlllIIllIlIlllllIlIl, new Runnable() {
                @Override
                public void run() {
                    notifyListeners0(DefaultPromise.this, llllllllllllIlllIIllIlIllllllIIl);
                    DefaultPromise.this.listeners = null;
                    "".length();
                }
            });
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
        else {
            final GenericFutureListener<? extends Future<V>> llllllllllllIlllIIllIlIllllllIII = (GenericFutureListener<? extends Future<V>>)llllllllllllIlllIIllIlIlllllIllI;
            execute(llllllllllllIlllIIllIlIlllllIlIl, new Runnable() {
                @Override
                public void run() {
                    DefaultPromise.notifyListener0(DefaultPromise.this, llllllllllllIlllIIllIlIllllllIII);
                    DefaultPromise.this.listeners = null;
                    "".length();
                }
            });
        }
    }
    
    private static boolean lIIIlIlllIIlllII(final int llllllllllllIlllIIllIlIIlIIllllI) {
        return llllllllllllIlllIIllIlIIlIIllllI == 0;
    }
    
    private static String lIIIlIlllIIIllII(final String llllllllllllIlllIIllIlIIlllIIIII, final String llllllllllllIlllIIllIlIIllIlllll) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIlIIlllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIlIIllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIllIlIIlllIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIllIlIIlllIIIlI.init(DefaultPromise.llIIlIIIIlIIIl[2], llllllllllllIlllIIllIlIIlllIIIll);
            return new String(llllllllllllIlllIIllIlIIlllIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIlIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIlIIlllIIIIl) {
            llllllllllllIlllIIllIlIIlllIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Throwable cause() {
        final Object llllllllllllIlllIIllIllIllllllII = this.result;
        if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIllIllllllII instanceof CauseHolder) ? 1 : 0)) {
            return ((CauseHolder)llllllllllllIlllIIllIllIllllllII).cause;
        }
        return null;
    }
    
    @Override
    public Promise<V> syncUninterruptibly() {
        this.awaitUninterruptibly();
        "".length();
        this.rethrowIfFailed();
        return this;
    }
    
    @Override
    public Promise<V> setFailure(final Throwable llllllllllllIlllIIllIllIIlIIIIlI) {
        if (lIIIlIlllIIlIlll(this.setFailure0(llllllllllllIlllIIllIllIIlIIIIlI) ? 1 : 0)) {
            this.notifyListeners();
            return this;
        }
        throw new IllegalStateException(String.valueOf(new StringBuilder().append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[6]]).append(this)), llllllllllllIlllIIllIllIIlIIIIlI);
    }
    
    @Override
    public boolean cancel(final boolean llllllllllllIlllIIllIllIIIllIllI) {
        Object llllllllllllIlllIIllIllIIIllIlIl = this.result;
        if (!lIIIlIlllIIlllII(isDone0(llllllllllllIlllIIllIllIIIllIlIl) ? 1 : 0) || lIIIlIlllIIllIll(llllllllllllIlllIIllIllIIIllIlIl, DefaultPromise.UNCANCELLABLE)) {
            return DefaultPromise.llIIlIIIIlIIIl[0] != 0;
        }
        final short llllllllllllIlllIIllIllIIIllIIlI = (short)this;
        synchronized (this) {
            llllllllllllIlllIIllIllIIIllIlIl = this.result;
            if (!lIIIlIlllIIlllII(isDone0(llllllllllllIlllIIllIllIIIllIlIl) ? 1 : 0) || lIIIlIlllIIllIll(llllllllllllIlllIIllIllIIIllIlIl, DefaultPromise.UNCANCELLABLE)) {
                return DefaultPromise.llIIlIIIIlIIIl[0] != 0;
            }
            this.result = DefaultPromise.CANCELLATION_CAUSE_HOLDER;
            if (lIIIlIlllIIlIlll(this.hasWaiters() ? 1 : 0)) {
                this.notifyAll();
            }
            // monitorexit(this)
            "".length();
            if (-" ".length() > 0) {
                return ((0xF5 ^ 0xC3) & ~(0x29 ^ 0x1F)) != 0x0;
            }
        }
        this.notifyListeners();
        return DefaultPromise.llIIlIIIIlIIIl[1] != 0;
    }
    
    void notifyProgressiveListeners(final long llllllllllllIlllIIllIlIllIIIIIII, final long llllllllllllIlllIIllIlIlIlllllll) {
        final Object llllllllllllIlllIIllIlIlIllllllI = this.progressiveListeners();
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIlIlIllllllI)) {
            return;
        }
        final ProgressiveFuture<V> llllllllllllIlllIIllIlIlIlllllIl = (ProgressiveFuture<V>)this;
        final EventExecutor llllllllllllIlllIIllIlIlIlllllII = this.executor();
        if (lIIIlIlllIIlIlll(llllllllllllIlllIIllIlIlIlllllII.inEventLoop() ? 1 : 0)) {
            if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlIlIllllllI instanceof GenericProgressiveFutureListener[]) ? 1 : 0)) {
                notifyProgressiveListeners0(llllllllllllIlllIIllIlIlIlllllIl, (GenericProgressiveFutureListener<?>[])llllllllllllIlllIIllIlIlIllllllI, llllllllllllIlllIIllIlIllIIIIIII, llllllllllllIlllIIllIlIlIlllllll);
                "".length();
                if ((0x7 ^ 0x3) < 0) {
                    return;
                }
            }
            else {
                notifyProgressiveListener0(llllllllllllIlllIIllIlIlIlllllIl, (GenericProgressiveFutureListener)llllllllllllIlllIIllIlIlIllllllI, llllllllllllIlllIIllIlIllIIIIIII, llllllllllllIlllIIllIlIlIlllllll);
                "".length();
                if (-(0x51 ^ 0x54) >= 0) {
                    return;
                }
            }
        }
        else if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlIlIllllllI instanceof GenericProgressiveFutureListener[]) ? 1 : 0)) {
            final GenericProgressiveFutureListener<?>[] llllllllllllIlllIIllIlIllIIIIIll = (GenericProgressiveFutureListener<?>[])llllllllllllIlllIIllIlIlIllllllI;
            execute(llllllllllllIlllIIllIlIlIlllllII, new Runnable() {
                @Override
                public void run() {
                    notifyProgressiveListeners0(llllllllllllIlllIIllIlIlIlllllIl, llllllllllllIlllIIllIlIllIIIIIll, llllllllllllIlllIIllIlIllIIIIIII, llllllllllllIlllIIllIlIlIlllllll);
                }
            });
            "".length();
            if ((0x10 ^ 0x2 ^ (0x1D ^ 0xB)) < (0x7B ^ 0x47 ^ (0x44 ^ 0x7C))) {
                return;
            }
        }
        else {
            final GenericProgressiveFutureListener<ProgressiveFuture<V>> llllllllllllIlllIIllIlIllIIIIIlI = (GenericProgressiveFutureListener<ProgressiveFuture<V>>)llllllllllllIlllIIllIlIlIllllllI;
            execute(llllllllllllIlllIIllIlIlIlllllII, new Runnable() {
                @Override
                public void run() {
                    notifyProgressiveListener0(llllllllllllIlllIIllIlIlIlllllIl, llllllllllllIlllIIllIlIllIIIIIlI, llllllllllllIlllIIllIlIllIIIIIII, llllllllllllIlllIIllIlIlIlllllll);
                }
            });
        }
    }
    
    @Override
    public boolean await(final long llllllllllllIlllIIllIllIlIIllIll) throws InterruptedException {
        return this.await0(TimeUnit.MILLISECONDS.toNanos(llllllllllllIlllIIllIllIlIIllIll), (boolean)(DefaultPromise.llIIlIIIIlIIIl[1] != 0));
    }
    
    private static void lIIIlIlllIIlIIIl() {
        (llIIlIIIIIlIlI = new String[DefaultPromise.llIIlIIIIlIIIl[24]])[DefaultPromise.llIIlIIIIlIIIl[0]] = lIIIlIlllIIIlIII("DC8oKzkdOD8=", "iWMHL");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[1]] = lIIIlIlllIIIlIIl("EtO7OJwbPFr8W4ysU5Kljw==", "PrFxq");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[2]] = lIIIlIlllIIIlIII("GBEjIRIaHSIm", "txPUw");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[3]] = lIIIlIlllIIIlIII("IB41GTciEjQ=", "LwFmR");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[4]] = lIIIlIlllIIIlIII("BT45GgkHMjgd", "iWJnl");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[5]] = lIIIlIlllIIIllII("hLM8fZbT9pX2grtWKvm8MNvaJKrLw8EW", "zsEvr");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[6]] = lIIIlIlllIIIlIIl("8yyhr+fSc2MZejUV30T61rskdisYZOR1", "cKcfu");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[7]] = lIIIlIlllIIIlIIl("kHjaH6jvOJA=", "yLPMq");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[9]] = lIIIlIlllIIIlIII("Ej0NViAHPBtWOgc7FhM/FWhC", "fRbvM");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[10]] = lIIIlIlllIIIlIII("HzUlPyw9dDg8aSohLj4gLXQtcyUwJzg2JzwmbD0mLT0qOio4ICU8J3kgLSAid3QJJSw3IGw/JjYkbCAhLCBsNyYuOnM=", "YTLSI");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[11]] = lIIIlIlllIIIlIIl("seB6gWTzsq1gzKYBKb3AnzfqSboBNIOOVIi038Zz6LQ=", "vsFJx");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[12]] = lIIIlIlllIIIllII("cMTvz7le7DMp0hFP6T9PR5gvEuiZpGWd", "LQWeZ");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[13]] = lIIIlIlllIIIlIII("Gz1DMx05NhMiDDU9QyEEKXMXPhc1JA12ByNz", "ZScVe");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[14]] = lIIIlIlllIIIlIII("XC0bMD4TNgI6IiIwBDI+FzEYMChaaw==", "rBkUL");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[16]] = lIIIlIlllIIIlIII("QyQACzIOJAZB", "kWuhQ");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[17]] = lIIIlIlllIIIllII("FHR57m2waQz5cfoSaTBWXQ==", "WUgsI");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[18]] = lIIIlIlllIIIlIIl("7tayMu5uXUB23rzLJaBNLA==", "CdmhU");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[20]] = lIIIlIlllIIIlIII("cAgsOSk1ES4/Mj1I", "XaBZF");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[21]] = lIIIlIlllIIIllII("BgyE9uMajmt5ORrKoZKi3e9yrze24Uib", "FXXmy");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[22]] = lIIIlIlllIIIlIII("diETDDodIRU=", "XrFOy");
        DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[23]] = lIIIlIlllIIIllII("ofUx5aV89TQMj0rR0qnZZg==", "RDmHf");
    }
    
    private static boolean isDone0(final Object llllllllllllIlllIIllIlllIIIIIlll) {
        int n;
        if (lIIIlIlllIIllIII(llllllllllllIlllIIllIlllIIIIIlll) && lIIIlIlllIIllIlI(llllllllllllIlllIIllIlllIIIIIlll, DefaultPromise.UNCANCELLABLE)) {
            n = DefaultPromise.llIIlIIIIlIIIl[1];
            "".length();
            if (null != null) {
                return ((0x7D ^ 0x17 ^ (0xE2 ^ 0x9E)) & (125 + 121 - 198 + 139 ^ 42 + 168 - 202 + 165 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DefaultPromise.llIIlIIIIlIIIl[0];
        }
        return n != 0;
    }
    
    private void rethrowIfFailed() {
        final Throwable llllllllllllIlllIIllIllIlIllIlIl = this.cause();
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIllIlIllIlIl)) {
            return;
        }
        PlatformDependent.throwException(llllllllllllIlllIIllIllIlIllIlIl);
    }
    
    private boolean await0(final long llllllllllllIlllIIllIllIIllIIIll, final boolean llllllllllllIlllIIllIllIIllIlIII) throws InterruptedException {
        if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
            return DefaultPromise.llIIlIIIIlIIIl[1] != 0;
        }
        if (lIIIlIlllIlIIIIl(lIIIlIlllIlIIIII(llllllllllllIlllIIllIllIIllIIIll, 0L))) {
            return this.isDone();
        }
        if (lIIIlIlllIIlIlll(llllllllllllIlllIIllIllIIllIlIII ? 1 : 0) && lIIIlIlllIIlIlll(Thread.interrupted() ? 1 : 0)) {
            throw new InterruptedException(this.toString());
        }
        final long llllllllllllIlllIIllIllIIllIIlll = System.nanoTime();
        long llllllllllllIlllIIllIllIIllIIllI = llllllllllllIlllIIllIllIIllIIIll;
        boolean llllllllllllIlllIIllIllIIllIIlIl = DefaultPromise.llIIlIIIIlIIIl[0] != 0;
        try {
            final byte llllllllllllIlllIIllIllIIlIllllI = (byte)this;
            synchronized (this) {
                if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
                    final char llllllllllllIlllIIllIllIIlIlllIl = (char)DefaultPromise.llIIlIIIIlIIIl[1];
                    return llllllllllllIlllIIllIllIIlIlllIl != '\0';
                }
                if (lIIIlIlllIlIIIIl(lIIIlIlllIlIIIII(llllllllllllIlllIIllIllIIllIIllI, 0L))) {
                    final char llllllllllllIlllIIllIllIIlIlllIl = (char)(this.isDone() ? 1 : 0);
                    return llllllllllllIlllIIllIllIIlIlllIl != '\0';
                }
                this.checkDeadLock();
                this.incWaiters();
                try {
                    while (true) {
                        try {
                            this.wait(llllllllllllIlllIIllIllIIllIIllI / 1000000L, (int)(llllllllllllIlllIIllIllIIllIIllI % 1000000L));
                            "".length();
                            if ("   ".length() > (18 + 9 - 8 + 145 ^ 84 + 109 - 51 + 18)) {
                                return ((0xB7 ^ 0xC5 ^ (0x2D ^ 0x11)) & (128 + 145 - 250 + 198 ^ 122 + 135 - 193 + 83 ^ -" ".length())) != 0x0;
                            }
                        }
                        catch (InterruptedException llllllllllllIlllIIllIllIIllIlIll) {
                            if (lIIIlIlllIIlIlll(llllllllllllIlllIIllIllIIllIlIII ? 1 : 0)) {
                                throw llllllllllllIlllIIllIllIIllIlIll;
                            }
                            llllllllllllIlllIIllIllIIllIIlIl = (DefaultPromise.llIIlIIIIlIIIl[1] != 0);
                        }
                        if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
                            final char llllllllllllIlllIIllIllIIlIlllIl = (char)DefaultPromise.llIIlIIIIlIIIl[1];
                            return llllllllllllIlllIIllIllIIlIlllIl != '\0';
                        }
                        llllllllllllIlllIIllIllIIllIIllI = llllllllllllIlllIIllIllIIllIIIll - (System.nanoTime() - llllllllllllIlllIIllIllIIllIIlll);
                        if (lIIIlIlllIlIIIIl(lIIIlIlllIlIIIII(llllllllllllIlllIIllIllIIllIIllI, 0L))) {
                            final char llllllllllllIlllIIllIllIIlIlllIl = (char)(this.isDone() ? 1 : 0);
                            return llllllllllllIlllIIllIllIIlIlllIl != '\0';
                        }
                    }
                }
                finally {
                    this.decWaiters();
                }
            }
        }
        finally {
            if (lIIIlIlllIIlIlll(llllllllllllIlllIIllIllIIllIIlIl ? 1 : 0)) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    private static boolean isCancelled0(final Object llllllllllllIlllIIllIlllIIIIllll) {
        int n;
        if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlllIIIIllll instanceof CauseHolder) ? 1 : 0) && lIIIlIlllIIlIlll((((CauseHolder)llllllllllllIlllIIllIlllIIIIllll).cause instanceof CancellationException) ? 1 : 0)) {
            n = DefaultPromise.llIIlIIIIlIIIl[1];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((0x44 ^ 0x77) & ~(0xA4 ^ 0x97)) != 0x0;
            }
        }
        else {
            n = DefaultPromise.llIIlIIIIlIIIl[0];
        }
        return n != 0;
    }
    
    private static boolean lIIIlIlllIlIIIIl(final int llllllllllllIlllIIllIlIIlIIlllII) {
        return llllllllllllIlllIIllIlIIlIIlllII <= 0;
    }
    
    private void incWaiters() {
        if (lIIIlIlllIlIIIll(this.waiters, DefaultPromise.llIIlIIIIlIIIl[8])) {
            throw new IllegalStateException(String.valueOf(new StringBuilder().append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[9]]).append(this)));
        }
        this.waiters += (short)DefaultPromise.llIIlIIIIlIIIl[1];
    }
    
    protected static void notifyListener(final EventExecutor llllllllllllIlllIIllIlIlllIIIIIl, final Future<?> llllllllllllIlllIIllIlIlllIIIIll, final GenericFutureListener<?> llllllllllllIlllIIllIlIllIllllll) {
        if (lIIIlIlllIIlIlll(llllllllllllIlllIIllIlIlllIIIIIl.inEventLoop() ? 1 : 0)) {
            final InternalThreadLocalMap llllllllllllIlllIIllIlIlllIIIllI = InternalThreadLocalMap.get();
            final int llllllllllllIlllIIllIlIlllIIIlIl = llllllllllllIlllIIllIlIlllIIIllI.futureListenerStackDepth();
            if (lIIIlIlllIIllllI(llllllllllllIlllIIllIlIlllIIIlIl, DefaultPromise.llIIlIIIIlIIIl[9])) {
                llllllllllllIlllIIllIlIlllIIIllI.setFutureListenerStackDepth(llllllllllllIlllIIllIlIlllIIIlIl + DefaultPromise.llIIlIIIIlIIIl[1]);
                try {
                    notifyListener0(llllllllllllIlllIIllIlIlllIIIIll, llllllllllllIlllIIllIlIllIllllll);
                    llllllllllllIlllIIllIlIlllIIIllI.setFutureListenerStackDepth(llllllllllllIlllIIllIlIlllIIIlIl);
                    "".length();
                    if (" ".length() == "   ".length()) {
                        return;
                    }
                }
                finally {
                    llllllllllllIlllIIllIlIlllIIIllI.setFutureListenerStackDepth(llllllllllllIlllIIllIlIlllIIIlIl);
                }
                return;
            }
        }
        execute(llllllllllllIlllIIllIlIlllIIIIIl, new Runnable() {
            @Override
            public void run() {
                DefaultPromise.notifyListener0(llllllllllllIlllIIllIlIlllIIIIll, llllllllllllIlllIIllIlIllIllllll);
            }
        });
    }
    
    @Override
    public boolean setUncancellable() {
        Object llllllllllllIlllIIllIllIIIlIlIll = this.result;
        if (lIIIlIlllIIlIlll(isDone0(llllllllllllIlllIIllIllIIIlIlIll) ? 1 : 0)) {
            int n;
            if (lIIIlIlllIIlllII(isCancelled0(llllllllllllIlllIIllIllIIIlIlIll) ? 1 : 0)) {
                n = DefaultPromise.llIIlIIIIlIIIl[1];
                "".length();
                if ("  ".length() == ((0x44 ^ 0x31 ^ (0xF0 ^ 0x83)) & (0x12 ^ 0x37 ^ (0x6D ^ 0x4E) ^ -" ".length()))) {
                    return ((0x30 ^ 0x2A ^ (0x9D ^ 0xC6)) & (0x56 ^ 0x32 ^ (0xE ^ 0x2B) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = DefaultPromise.llIIlIIIIlIIIl[0];
            }
            return n != 0;
        }
        final long llllllllllllIlllIIllIllIIIlIlIII = (long)this;
        synchronized (this) {
            llllllllllllIlllIIllIllIIIlIlIll = this.result;
            if (lIIIlIlllIIlIlll(isDone0(llllllllllllIlllIIllIllIIIlIlIll) ? 1 : 0)) {
                int n2;
                if (lIIIlIlllIIlllII(isCancelled0(llllllllllllIlllIIllIllIIIlIlIll) ? 1 : 0)) {
                    n2 = DefaultPromise.llIIlIIIIlIIIl[1];
                    "".length();
                    if (" ".length() < 0) {
                        return ((0x55 ^ 0x50 ^ (0x1B ^ 0x3F)) & (0xC5 ^ 0xAA ^ (0x8E ^ 0xC0) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n2 = DefaultPromise.llIIlIIIIlIIIl[0];
                }
                return n2 != 0;
            }
            this.result = DefaultPromise.UNCANCELLABLE;
            // monitorexit(this)
            "".length();
            if (" ".length() <= 0) {
                return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
            }
        }
        return DefaultPromise.llIIlIIIIlIIIl[1] != 0;
    }
    
    static void notifyListener0(final Future llllllllllllIlllIIllIlIllIlIlllI, final GenericFutureListener llllllllllllIlllIIllIlIllIlIlIll) {
        try {
            llllllllllllIlllIIllIlIllIlIlIll.operationComplete(llllllllllllIlllIIllIlIllIlIlllI);
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllIIllIlIllIlIllll) {
            if (lIIIlIlllIIlIlll(DefaultPromise.logger.isWarnEnabled() ? 1 : 0)) {
                DefaultPromise.logger.warn(String.valueOf(new StringBuilder().append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[11]]).append(llllllllllllIlllIIllIlIllIlIlIll.getClass().getName()).append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[12]])), llllllllllllIlllIIllIlIllIlIllll);
            }
        }
    }
    
    @Override
    public Promise<V> sync() throws InterruptedException {
        this.await();
        "".length();
        this.rethrowIfFailed();
        return this;
    }
    
    private static boolean lIIIlIlllIlIIIlI(final int llllllllllllIlllIIllIlIIlIIllIlI) {
        return llllllllllllIlllIIllIlIIlIIllIlI > 0;
    }
    
    @Override
    public V getNow() {
        final Object llllllllllllIlllIIllIllIIIIIllll = this.result;
        if (!lIIIlIlllIIlllII((llllllllllllIlllIIllIllIIIIIllll instanceof CauseHolder) ? 1 : 0) || lIIIlIlllIIllIll(llllllllllllIlllIIllIllIIIIIllll, DefaultPromise.SUCCESS)) {
            return null;
        }
        return (V)llllllllllllIlllIIllIllIIIIIllll;
    }
    
    @Override
    public Promise<V> addListeners(final GenericFutureListener<? extends Future<? super V>>... llllllllllllIlllIIllIllIlllIIIIl) {
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIllIlllIIIIl)) {
            throw new NullPointerException(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[2]]);
        }
        final GenericFutureListener[] llllllllllllIlllIIllIllIlllIIlIl = llllllllllllIlllIIllIllIlllIIIIl;
        final int llllllllllllIlllIIllIllIlllIIlII = llllllllllllIlllIIllIllIlllIIlIl.length;
        int llllllllllllIlllIIllIllIlllIIIll = DefaultPromise.llIIlIIIIlIIIl[0];
        while (lIIIlIlllIIllllI(llllllllllllIlllIIllIllIlllIIIll, llllllllllllIlllIIllIllIlllIIlII)) {
            final GenericFutureListener<? extends Future<? super V>> llllllllllllIlllIIllIllIlllIIllI = (GenericFutureListener<? extends Future<? super V>>)llllllllllllIlllIIllIllIlllIIlIl[llllllllllllIlllIIllIllIlllIIIll];
            if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIllIlllIIllI)) {
                "".length();
                if (" ".length() >= (0x7B ^ 0x7F)) {
                    return null;
                }
                break;
            }
            else {
                this.addListener(llllllllllllIlllIIllIllIlllIIllI);
                "".length();
                ++llllllllllllIlllIIllIllIlllIIIll;
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
                continue;
            }
        }
        return this;
    }
    
    @Override
    public Promise<V> setSuccess(final V llllllllllllIlllIIllIllIIlIIlllI) {
        if (lIIIlIlllIIlIlll(this.setSuccess0(llllllllllllIlllIIllIllIIlIIlllI) ? 1 : 0)) {
            this.notifyListeners();
            return this;
        }
        throw new IllegalStateException(String.valueOf(new StringBuilder().append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[5]]).append(this)));
    }
    
    protected EventExecutor executor() {
        return this.executor;
    }
    
    protected StringBuilder toStringBuilder() {
        final StringBuilder llllllllllllIlllIIllIlIlIlIIIllI = new StringBuilder(DefaultPromise.llIIlIIIIlIIIl[15]);
        llllllllllllIlllIIllIlIlIlIIIllI.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIlllIIllIlIlIlIIIllI.append((char)DefaultPromise.llIIlIIIIlIIIl[15]);
        "".length();
        llllllllllllIlllIIllIlIlIlIIIllI.append(Integer.toHexString(this.hashCode()));
        "".length();
        final Object llllllllllllIlllIIllIlIlIlIIIlIl = this.result;
        if (lIIIlIlllIIllIll(llllllllllllIlllIIllIlIlIlIIIlIl, DefaultPromise.SUCCESS)) {
            llllllllllllIlllIIllIlIlIlIIIllI.append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[16]]);
            "".length();
            "".length();
            if (-" ".length() > "  ".length()) {
                return null;
            }
        }
        else if (lIIIlIlllIIllIll(llllllllllllIlllIIllIlIlIlIIIlIl, DefaultPromise.UNCANCELLABLE)) {
            llllllllllllIlllIIllIlIlIlIIIllI.append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[17]]);
            "".length();
            "".length();
            if ((176 + 102 - 115 + 31 ^ 192 + 196 - 311 + 121) <= 0) {
                return null;
            }
        }
        else if (lIIIlIlllIIlIlll((llllllllllllIlllIIllIlIlIlIIIlIl instanceof CauseHolder) ? 1 : 0)) {
            llllllllllllIlllIIllIlIlIlIIIllI.append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[18]]);
            "".length();
            llllllllllllIlllIIllIlIlIlIIIllI.append(((CauseHolder)llllllllllllIlllIIllIlIlIlIIIlIl).cause);
            "".length();
            llllllllllllIlllIIllIlIlIlIIIllI.append((char)DefaultPromise.llIIlIIIIlIIIl[19]);
            "".length();
            "".length();
            if ((0xE5 ^ 0xA0 ^ (0x32 ^ 0x72)) == 0x0) {
                return null;
            }
        }
        else {
            llllllllllllIlllIIllIlIlIlIIIllI.append(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[20]]);
            "".length();
        }
        return llllllllllllIlllIIllIlIlIlIIIllI;
    }
    
    @Override
    public boolean isCancellable() {
        int n;
        if (lIIIlIlllIIlIllI(this.result)) {
            n = DefaultPromise.llIIlIIIIlIIIl[1];
            "".length();
            if (-(0x72 ^ 0x76) > 0) {
                return ((0x33 ^ 0x7F) & ~(0x13 ^ 0x5F)) != 0x0;
            }
        }
        else {
            n = DefaultPromise.llIIlIIIIlIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    public Promise<V> removeListener(final GenericFutureListener<? extends Future<? super V>> llllllllllllIlllIIllIllIllIlIlIl) {
        if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIllIllIlIlIl)) {
            throw new NullPointerException(DefaultPromise.llIIlIIIIIlIlI[DefaultPromise.llIIlIIIIlIIIl[3]]);
        }
        if (lIIIlIlllIIlIlll(this.isDone() ? 1 : 0)) {
            return this;
        }
        final float llllllllllllIlllIIllIllIllIlIIlI = (float)this;
        synchronized (this) {
            if (lIIIlIlllIIlllII(this.isDone() ? 1 : 0)) {
                if (lIIIlIlllIIlIlll((this.listeners instanceof DefaultFutureListeners) ? 1 : 0)) {
                    ((DefaultFutureListeners)this.listeners).remove(llllllllllllIlllIIllIllIllIlIlIl);
                    "".length();
                    if ((0x42 ^ 0x46) != (0x9A ^ 0x9E)) {
                        return null;
                    }
                }
                else if (lIIIlIlllIIllIll(this.listeners, llllllllllllIlllIIllIllIllIlIlIl)) {
                    this.listeners = null;
                }
            }
            // monitorexit(this)
            "".length();
            if (((0x3C ^ 0x56 ^ (0x23 ^ 0x19)) & (135 + 102 - 113 + 79 ^ 99 + 135 - 134 + 55 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return this;
    }
    
    @Override
    public boolean isSuccess() {
        final Object llllllllllllIlllIIllIlllIIIIIIlI = this.result;
        if (!lIIIlIlllIIllIII(llllllllllllIlllIIllIlllIIIIIIlI) || lIIIlIlllIIllIll(llllllllllllIlllIIllIlllIIIIIIlI, DefaultPromise.UNCANCELLABLE)) {
            return DefaultPromise.llIIlIIIIlIIIl[0] != 0;
        }
        int n;
        if (lIIIlIlllIIlllII((llllllllllllIlllIIllIlllIIIIIIlI instanceof CauseHolder) ? 1 : 0)) {
            n = DefaultPromise.llIIlIIIIlIIIl[1];
            "".length();
            if ("   ".length() < "  ".length()) {
                return ((0x6B ^ 0x6C) & ~(0x0 ^ 0x7)) != 0x0;
            }
        }
        else {
            n = DefaultPromise.llIIlIIIIlIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    public boolean awaitUninterruptibly(final long llllllllllllIlllIIllIllIIllllIII) {
        try {
            return this.await0(TimeUnit.MILLISECONDS.toNanos(llllllllllllIlllIIllIllIIllllIII), (boolean)(DefaultPromise.llIIlIIIIlIIIl[0] != 0));
        }
        catch (InterruptedException llllllllllllIlllIIllIllIIlllllII) {
            throw new InternalError();
        }
    }
    
    private void decWaiters() {
        this.waiters -= (short)DefaultPromise.llIIlIIIIlIIIl[1];
    }
    
    protected void checkDeadLock() {
        final EventExecutor llllllllllllIlllIIllIllIIlIlIllI = this.executor();
        if (lIIIlIlllIIllIII(llllllllllllIlllIIllIllIIlIlIllI) && lIIIlIlllIIlIlll(llllllllllllIlllIIllIllIIlIlIllI.inEventLoop() ? 1 : 0)) {
            throw new BlockingOperationException(this.toString());
        }
    }
    
    @Override
    public boolean isDone() {
        return isDone0(this.result);
    }
    
    private static boolean lIIIlIlllIIllIII(final Object llllllllllllIlllIIllIlIIlIlIlIII) {
        return llllllllllllIlllIIllIlIIlIlIlIII != null;
    }
    
    private void notifyLateListener(final GenericFutureListener<?> llllllllllllIlllIIllIlIlllIlIlII) {
        final EventExecutor llllllllllllIlllIIllIlIlllIlIIll = this.executor();
        if (lIIIlIlllIIlIlll(llllllllllllIlllIIllIlIlllIlIIll.inEventLoop() ? 1 : 0)) {
            if (!lIIIlIlllIIlIllI(this.listeners) || !lIIIlIlllIIlIllI(this.lateListeners)) {
                LateListeners llllllllllllIlllIIllIlIlllIlIllI = this.lateListeners;
                if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIlIlllIlIllI)) {
                    llllllllllllIlllIIllIlIlllIlIllI = (this.lateListeners = new LateListeners());
                }
                llllllllllllIlllIIllIlIlllIlIllI.add(llllllllllllIlllIIllIlIlllIlIlII);
                "".length();
                execute(llllllllllllIlllIIllIlIlllIlIIll, llllllllllllIlllIIllIlIlllIlIllI);
                return;
            }
            final InternalThreadLocalMap llllllllllllIlllIIllIlIlllIllIII = InternalThreadLocalMap.get();
            final int llllllllllllIlllIIllIlIlllIlIlll = llllllllllllIlllIIllIlIlllIllIII.futureListenerStackDepth();
            if (lIIIlIlllIIllllI(llllllllllllIlllIIllIlIlllIlIlll, DefaultPromise.llIIlIIIIlIIIl[9])) {
                llllllllllllIlllIIllIlIlllIllIII.setFutureListenerStackDepth(llllllllllllIlllIIllIlIlllIlIlll + DefaultPromise.llIIlIIIIlIIIl[1]);
                try {
                    notifyListener0(this, llllllllllllIlllIIllIlIlllIlIlII);
                    llllllllllllIlllIIllIlIlllIllIII.setFutureListenerStackDepth(llllllllllllIlllIIllIlIlllIlIlll);
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        return;
                    }
                }
                finally {
                    llllllllllllIlllIIllIlIlllIllIII.setFutureListenerStackDepth(llllllllllllIlllIIllIlIlllIlIlll);
                }
                return;
            }
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
        }
        execute(llllllllllllIlllIIllIlIlllIlIIll, new LateListenerNotifier(llllllllllllIlllIIllIlIlllIlIlII));
    }
    
    private static boolean lIIIlIlllIIllllI(final int llllllllllllIlllIIllIlIIlIlIllll, final int llllllllllllIlllIIllIlIIlIlIlllI) {
        return llllllllllllIlllIIllIlIIlIlIllll < llllllllllllIlllIIllIlIIlIlIlllI;
    }
    
    private static int lIIIlIlllIlIIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void notifyProgressiveListeners0(final ProgressiveFuture<?> llllllllllllIlllIIllIlIlIllIlIII, final GenericProgressiveFutureListener<?>[] llllllllllllIlllIIllIlIlIllIIIll, final long llllllllllllIlllIIllIlIlIllIIllI, final long llllllllllllIlllIIllIlIlIllIIIIl) {
        final GenericProgressiveFutureListener[] llllllllllllIlllIIllIlIlIllIlIll = llllllllllllIlllIIllIlIlIllIIIll;
        final int llllllllllllIlllIIllIlIlIllIlIlI = llllllllllllIlllIIllIlIlIllIlIll.length;
        int llllllllllllIlllIIllIlIlIllIlIIl = DefaultPromise.llIIlIIIIlIIIl[0];
        while (lIIIlIlllIIllllI(llllllllllllIlllIIllIlIlIllIlIIl, llllllllllllIlllIIllIlIlIllIlIlI)) {
            final GenericProgressiveFutureListener<?> llllllllllllIlllIIllIlIlIllIllII = (GenericProgressiveFutureListener<?>)llllllllllllIlllIIllIlIlIllIlIll[llllllllllllIlllIIllIlIlIllIlIIl];
            if (lIIIlIlllIIlIllI(llllllllllllIlllIIllIlIlIllIllII)) {
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
                break;
            }
            else {
                notifyProgressiveListener0(llllllllllllIlllIIllIlIlIllIlIII, llllllllllllIlllIIllIlIlIllIllII, llllllllllllIlllIIllIlIlIllIIllI, llllllllllllIlllIIllIlIlIllIIIIl);
                ++llllllllllllIlllIIllIlIlIllIlIIl;
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                continue;
            }
        }
    }
    
    private static boolean lIIIlIlllIIlIllI(final Object llllllllllllIlllIIllIlIIlIlIIIlI) {
        return llllllllllllIlllIIllIlIIlIlIIIlI == null;
    }
    
    private static boolean lIIIlIlllIlIIIll(final int llllllllllllIlllIIllIlIIlIllIIll, final int llllllllllllIlllIIllIlIIlIllIIlI) {
        return llllllllllllIlllIIllIlIIlIllIIll == llllllllllllIlllIIllIlIIlIllIIlI;
    }
    
    private static final class CauseHolder
    {
        final /* synthetic */ Throwable cause;
        
        CauseHolder(final Throwable lllllllllllllIlIllIlIllllIlIIIII) {
            this.cause = lllllllllllllIlIllIlIllllIlIIIII;
        }
    }
    
    private final class LateListenerNotifier implements Runnable
    {
        private /* synthetic */ GenericFutureListener<?> l;
        
        LateListenerNotifier(final GenericFutureListener<?> lllllllllllllIIIllllIIIIlllIllll) {
            this.l = lllllllllllllIIIllllIIIIlllIllll;
        }
        
        private static boolean lllIIIllllIllll(final Object lllllllllllllIIIllllIIIIlllIIlII) {
            return lllllllllllllIIIllllIIIIlllIIlII != null;
        }
        
        @Override
        public void run() {
            LateListeners lllllllllllllIIIllllIIIIlllIlIII = DefaultPromise.this.lateListeners;
            if (lllIIIllllIllll(this.l)) {
                if (lllIIIlllllIIII(lllllllllllllIIIllllIIIIlllIlIII)) {
                    DefaultPromise.this.lateListeners = (lllllllllllllIIIllllIIIIlllIlIII = new LateListeners());
                    "".length();
                }
                lllllllllllllIIIllllIIIIlllIlIII.add(this.l);
                "".length();
                this.l = null;
            }
            lllllllllllllIIIllllIIIIlllIlIII.run();
        }
        
        private static boolean lllIIIlllllIIII(final Object lllllllllllllIIIllllIIIIlllIIIlI) {
            return lllllllllllllIIIllllIIIIlllIIIlI == null;
        }
    }
    
    private final class LateListeners extends ArrayDeque<GenericFutureListener<?>> implements Runnable
    {
        private static final /* synthetic */ int[] llIllIlIlIIIll;
        
        private static void lIIlIlllllIIllII() {
            (llIllIlIlIIIll = new int[1])[0] = "  ".length();
        }
        
        LateListeners() {
            super(LateListeners.llIllIlIlIIIll[0]);
        }
        
        static {
            lIIlIlllllIIllII();
        }
        
        private static boolean lIIlIlllllIIllIl(final Object llllllllllllIllIIllIllIlIIIllIII) {
            return llllllllllllIllIIllIllIlIIIllIII == null;
        }
        
        @Override
        public void run() {
            if (lIIlIlllllIIllIl(DefaultPromise.this.listeners)) {
                do {
                    final GenericFutureListener<?> llllllllllllIllIIllIllIlIIIlllIl = this.poll();
                    if (lIIlIlllllIIllIl(llllllllllllIllIIllIllIlIIIlllIl)) {
                        "".length();
                        if (((32 + 57 - 66 + 121 ^ 51 + 82 + 32 + 16) & (153 + 27 - 110 + 114 ^ 59 + 68 - 101 + 131 ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                    else {
                        DefaultPromise.notifyListener0(DefaultPromise.this, llllllllllllIllIIllIllIlIIIlllIl);
                        "".length();
                    }
                } while ("  ".length() > " ".length());
                return;
            }
            execute(DefaultPromise.this.executor(), this);
        }
    }
}
