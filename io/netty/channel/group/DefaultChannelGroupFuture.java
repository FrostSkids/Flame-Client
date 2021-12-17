// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.group;

import java.util.LinkedHashMap;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.BlockingOperationException;
import io.netty.util.concurrent.ImmediateEventExecutor;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.Promise;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFuture;
import io.netty.channel.Channel;
import java.util.Map;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.DefaultPromise;

final class DefaultChannelGroupFuture extends DefaultPromise<Void> implements ChannelGroupFuture
{
    private final /* synthetic */ ChannelFutureListener childListener;
    private static final /* synthetic */ String[] lllllIllllIll;
    private static final /* synthetic */ int[] lllllIlllllII;
    private final /* synthetic */ Map<Channel, ChannelFuture> futures;
    private /* synthetic */ int successCount;
    private final /* synthetic */ ChannelGroup group;
    private /* synthetic */ int failureCount;
    
    private static boolean lIlIllllIlllIII(final int lllllllllllllIlIlIlIlllllIIIIlll) {
        return lllllllllllllIlIlIlIlllllIIIIlll != 0;
    }
    
    @Override
    public boolean tryFailure(final Throwable lllllllllllllIlIlIllIIIIIlllllll) {
        throw new IllegalStateException();
    }
    
    private static boolean lIlIllllIlllIIl(final int lllllllllllllIlIlIlIlllllIIIIlII, final int lllllllllllllIlIlIlIlllllIIIIIll) {
        return lllllllllllllIlIlIlIlllllIIIIlII != lllllllllllllIlIlIlIlllllIIIIIll;
    }
    
    DefaultChannelGroupFuture(final ChannelGroup lllllllllllllIlIlIllIIIIllIIllIl, final Map<Channel, ChannelFuture> lllllllllllllIlIlIllIIIIllIlIIII, final EventExecutor lllllllllllllIlIlIllIIIIllIIllll) {
        super(lllllllllllllIlIlIllIIIIllIIllll);
        this.childListener = new ChannelFutureListener() {
            static final /* synthetic */ boolean $assertionsDisabled;
            private static final /* synthetic */ int[] lllllllIllIll;
            
            private static void lIllIIIlIlIllIl() {
                (lllllllIllIll = new int[2])[0] = " ".length();
                DefaultChannelGroupFuture$1.lllllllIllIll[1] = ((0x16 ^ 0x1E) & ~(0x41 ^ 0x49));
            }
            
            private static boolean lIllIIIlIllIIlI(final int lllllllllllllIlIlIIlllIlIlIllllI, final int lllllllllllllIlIlIIlllIlIlIlllIl) {
                return lllllllllllllIlIlIIlllIlIlIllllI > lllllllllllllIlIlIIlllIlIlIlllIl;
            }
            
            private static boolean lIllIIIlIlIllll(final int lllllllllllllIlIlIIlllIlIlIllIll) {
                return lllllllllllllIlIlIIlllIlIlIllIll != 0;
            }
            
            private static boolean lIllIIIlIllIIll(final int lllllllllllllIlIlIIlllIlIlIlIlll) {
                return lllllllllllllIlIlIIlllIlIlIlIlll > 0;
            }
            
            private static boolean lIllIIIlIllIIIl(final int lllllllllllllIlIlIIlllIlIlIllIIl) {
                return lllllllllllllIlIlIIlllIlIlIllIIl == 0;
            }
            
            static {
                lIllIIIlIlIllIl();
                int $assertionsDisabled2;
                if (lIllIIIlIllIIIl(DefaultChannelGroupFuture.class.desiredAssertionStatus() ? 1 : 0)) {
                    $assertionsDisabled2 = DefaultChannelGroupFuture$1.lllllllIllIll[0];
                    "".length();
                    if (-(0xA3 ^ 0x91 ^ (0x3F ^ 0x9)) >= 0) {
                        return;
                    }
                }
                else {
                    $assertionsDisabled2 = DefaultChannelGroupFuture$1.lllllllIllIll[1];
                }
                $assertionsDisabled = ($assertionsDisabled2 != 0);
            }
            
            private static boolean lIllIIIlIllIIII(final int lllllllllllllIlIlIIlllIlIllIIIlI, final int lllllllllllllIlIlIIlllIlIllIIIIl) {
                return lllllllllllllIlIlIIlllIlIllIIIlI == lllllllllllllIlIlIIlllIlIllIIIIl;
            }
            
            @Override
            public void operationComplete(final ChannelFuture lllllllllllllIlIlIIlllIlIlllIlII) throws Exception {
                final boolean lllllllllllllIlIlIIlllIlIlllIIll = lllllllllllllIlIlIIlllIlIlllIlII.isSuccess();
                final boolean lllllllllllllIlIlIIlllIlIlllIIlI;
                synchronized (DefaultChannelGroupFuture.this) {
                    if (lIllIIIlIlIllll(lllllllllllllIlIlIIlllIlIlllIIll ? 1 : 0)) {
                        DefaultChannelGroupFuture.this.successCount = DefaultChannelGroupFuture.this.successCount;
                        "".length();
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return;
                        }
                    }
                    else {
                        DefaultChannelGroupFuture.this.failureCount = DefaultChannelGroupFuture.this.failureCount;
                        "".length();
                    }
                    int n;
                    if (lIllIIIlIllIIII(DefaultChannelGroupFuture.this.successCount + DefaultChannelGroupFuture.this.failureCount, DefaultChannelGroupFuture.this.futures.size())) {
                        n = DefaultChannelGroupFuture$1.lllllllIllIll[0];
                        "".length();
                        if (-(0x0 ^ 0x5) >= 0) {
                            return;
                        }
                    }
                    else {
                        n = DefaultChannelGroupFuture$1.lllllllIllIll[1];
                    }
                    lllllllllllllIlIlIIlllIlIlllIIlI = (n != 0);
                    if (lIllIIIlIllIIIl(DefaultChannelGroupFuture$1.$assertionsDisabled ? 1 : 0) && lIllIIIlIllIIlI(DefaultChannelGroupFuture.this.successCount + DefaultChannelGroupFuture.this.failureCount, DefaultChannelGroupFuture.this.futures.size())) {
                        throw new AssertionError();
                    }
                    // monitorexit(this.this$0)
                    "".length();
                    if ((0x65 ^ 0x70 ^ (0x90 ^ 0x81)) < 0) {
                        return;
                    }
                }
                if (lIllIIIlIlIllll(lllllllllllllIlIlIIlllIlIlllIIlI ? 1 : 0)) {
                    if (lIllIIIlIllIIll(DefaultChannelGroupFuture.this.failureCount)) {
                        final List<Map.Entry<Channel, Throwable>> lllllllllllllIlIlIIlllIlIlllIllI = new ArrayList<Map.Entry<Channel, Throwable>>(DefaultChannelGroupFuture.this.failureCount);
                        final Iterator lllllllllllllIlIlIIlllIlIlllIlll = DefaultChannelGroupFuture.this.futures.values().iterator();
                        while (lIllIIIlIlIllll(lllllllllllllIlIlIIlllIlIlllIlll.hasNext() ? 1 : 0)) {
                            final ChannelFuture lllllllllllllIlIlIIlllIlIllllIII = lllllllllllllIlIlIIlllIlIlllIlll.next();
                            if (lIllIIIlIllIIIl(lllllllllllllIlIlIIlllIlIllllIII.isSuccess() ? 1 : 0)) {
                                lllllllllllllIlIlIIlllIlIlllIllI.add(new DefaultEntry<Channel, Throwable>(lllllllllllllIlIlIIlllIlIllllIII.channel(), lllllllllllllIlIlIIlllIlIllllIII.cause()));
                                "".length();
                            }
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        DefaultChannelGroupFuture.this.setFailure0(new ChannelGroupException(lllllllllllllIlIlIIlllIlIlllIllI));
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    }
                    else {
                        DefaultChannelGroupFuture.this.setSuccess0();
                    }
                }
            }
        };
        this.group = lllllllllllllIlIlIllIIIIllIIllIl;
        this.futures = Collections.unmodifiableMap((Map<? extends Channel, ? extends ChannelFuture>)lllllllllllllIlIlIllIIIIllIlIIII);
        final Iterator lllllllllllllIlIlIllIIIIllIlIIll = this.futures.values().iterator();
        while (lIlIllllIlllIII(lllllllllllllIlIlIllIIIIllIlIIll.hasNext() ? 1 : 0)) {
            final ChannelFuture lllllllllllllIlIlIllIIIIllIlIlII = lllllllllllllIlIlIllIIIIllIlIIll.next();
            lllllllllllllIlIlIllIIIIllIlIlII.addListener((GenericFutureListener<? extends Future<? super Void>>)this.childListener);
            "".length();
            "".length();
            if ((0x5 ^ 0x0) == 0x0) {
                throw null;
            }
        }
        if (lIlIllllIlllIII(this.futures.isEmpty() ? 1 : 0)) {
            this.setSuccess0();
        }
    }
    
    private static boolean lIlIllllIlllIll(final Object lllllllllllllIlIlIlIlllllIIIlllI, final Object lllllllllllllIlIlIlIlllllIIIllIl) {
        return lllllllllllllIlIlIlIlllllIIIlllI != lllllllllllllIlIlIlIlllllIIIllIl;
    }
    
    @Override
    public synchronized boolean isPartialSuccess() {
        int n;
        if (lIlIllllIlllIII(this.successCount) && lIlIllllIlllIIl(this.successCount, this.futures.size())) {
            n = DefaultChannelGroupFuture.lllllIlllllII[1];
            "".length();
            if ((0x13 ^ 0x9 ^ (0x0 ^ 0x1E)) <= 0) {
                return ((0x52 ^ 0x11 ^ (0x64 ^ 0x6B)) & (0x22 ^ 0x38 ^ (0x47 ^ 0x11) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DefaultChannelGroupFuture.lllllIlllllII[0];
        }
        return n != 0;
    }
    
    @Override
    public Iterator<ChannelFuture> iterator() {
        return this.futures.values().iterator();
    }
    
    private static boolean lIlIllllIllllII(final int lllllllllllllIlIlIlIlllllIIlIIlI, final int lllllllllllllIlIlIlIlllllIIlIIIl) {
        return lllllllllllllIlIlIlIlllllIIlIIlI < lllllllllllllIlIlIlIlllllIIlIIIl;
    }
    
    @Override
    public ChannelGroup group() {
        return this.group;
    }
    
    @Override
    public synchronized boolean isPartialFailure() {
        int n;
        if (lIlIllllIlllIII(this.failureCount) && lIlIllllIlllIIl(this.failureCount, this.futures.size())) {
            n = DefaultChannelGroupFuture.lllllIlllllII[1];
            "".length();
            if (((0xF6 ^ 0xBA ^ (0xBD ^ 0xAC)) & (0xFA ^ 0xAA ^ (0x10 ^ 0x1D) ^ -" ".length())) < 0) {
                return ((0x4E ^ 0x2B ^ (0xE2 ^ 0x9F)) & (155 + 29 - 53 + 42 ^ 53 + 149 - 42 + 21 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = DefaultChannelGroupFuture.lllllIlllllII[0];
        }
        return n != 0;
    }
    
    private static void lIlIllllIllIlIl() {
        (lllllIllllIll = new String[DefaultChannelGroupFuture.lllllIlllllII[2]])[DefaultChannelGroupFuture.lllllIlllllII[0]] = lIlIllllIllIIll("JQYBNDc=", "BtnAG");
        DefaultChannelGroupFuture.lllllIllllIll[DefaultChannelGroupFuture.lllllIlllllII[1]] = lIlIllllIllIlII("NRFXXE2HMvI=", "fyBwY");
    }
    
    private static boolean lIlIllllIlllIlI(final Object lllllllllllllIlIlIlIlllllIIIlIll) {
        return lllllllllllllIlIlIlIlllllIIIlIll != null;
    }
    
    @Override
    public DefaultChannelGroupFuture awaitUninterruptibly() {
        super.awaitUninterruptibly();
        "".length();
        return this;
    }
    
    @Override
    public DefaultChannelGroupFuture addListener(final GenericFutureListener<? extends Future<? super Void>> lllllllllllllIlIlIllIIIIlIllIIIl) {
        super.addListener(lllllllllllllIlIlIllIIIIlIllIIIl);
        "".length();
        return this;
    }
    
    private void setSuccess0() {
        super.setSuccess(null);
        "".length();
    }
    
    @Override
    public DefaultChannelGroupFuture setSuccess(final Void lllllllllllllIlIlIllIIIIlIIIIlIl) {
        throw new IllegalStateException();
    }
    
    @Override
    public DefaultChannelGroupFuture addListeners(final GenericFutureListener<? extends Future<? super Void>>... lllllllllllllIlIlIllIIIIlIlIllIl) {
        super.addListeners(lllllllllllllIlIlIllIIIIlIlIllIl);
        "".length();
        return this;
    }
    
    @Override
    public DefaultChannelGroupFuture syncUninterruptibly() {
        super.syncUninterruptibly();
        "".length();
        return this;
    }
    
    private static void lIlIllllIllIllI() {
        (lllllIlllllII = new int[4])[0] = ((0x6C ^ 0x7D) & ~(0xB4 ^ 0xA5));
        DefaultChannelGroupFuture.lllllIlllllII[1] = " ".length();
        DefaultChannelGroupFuture.lllllIlllllII[2] = "  ".length();
        DefaultChannelGroupFuture.lllllIlllllII[3] = (0x5 ^ 0xD);
    }
    
    @Override
    public boolean trySuccess(final Void lllllllllllllIlIlIllIIIIlIIIIIll) {
        throw new IllegalStateException();
    }
    
    private void setFailure0(final ChannelGroupException lllllllllllllIlIlIllIIIIlIIIIlll) {
        super.setFailure(lllllllllllllIlIlIllIIIIlIIIIlll);
        "".length();
    }
    
    @Override
    public ChannelGroupException cause() {
        return (ChannelGroupException)super.cause();
    }
    
    @Override
    protected void checkDeadLock() {
        final EventExecutor lllllllllllllIlIlIllIIIIIllllIll = this.executor();
        if (lIlIllllIlllIlI(lllllllllllllIlIlIllIIIIIllllIll) && lIlIllllIlllIll(lllllllllllllIlIlIllIIIIIllllIll, ImmediateEventExecutor.INSTANCE) && lIlIllllIlllIII(lllllllllllllIlIlIllIIIIIllllIll.inEventLoop() ? 1 : 0)) {
            throw new BlockingOperationException();
        }
    }
    
    private static String lIlIllllIllIlII(final String lllllllllllllIlIlIlIlllllIIllIII, final String lllllllllllllIlIlIlIlllllIIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlllllIIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlllllIIlIlll.getBytes(StandardCharsets.UTF_8)), DefaultChannelGroupFuture.lllllIlllllII[3]), "DES");
            final Cipher lllllllllllllIlIlIlIlllllIIlllII = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIlllllIIlllII.init(DefaultChannelGroupFuture.lllllIlllllII[2], lllllllllllllIlIlIlIlllllIIlllIl);
            return new String(lllllllllllllIlIlIlIlllllIIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlllllIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlllllIIllIll) {
            lllllllllllllIlIlIlIlllllIIllIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public DefaultChannelGroupFuture sync() throws InterruptedException {
        super.sync();
        "".length();
        return this;
    }
    
    @Override
    public DefaultChannelGroupFuture await() throws InterruptedException {
        super.await();
        "".length();
        return this;
    }
    
    private static String lIlIllllIllIIll(String lllllllllllllIlIlIlIlllllIlIlIlI, final String lllllllllllllIlIlIlIlllllIlIlllI) {
        lllllllllllllIlIlIlIlllllIlIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIlllllIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIlllllIlIllIl = new StringBuilder();
        final char[] lllllllllllllIlIlIlIlllllIlIllII = lllllllllllllIlIlIlIlllllIlIlllI.toCharArray();
        int lllllllllllllIlIlIlIlllllIlIlIll = DefaultChannelGroupFuture.lllllIlllllII[0];
        final Exception lllllllllllllIlIlIlIlllllIlIIlIl = (Object)lllllllllllllIlIlIlIlllllIlIlIlI.toCharArray();
        final float lllllllllllllIlIlIlIlllllIlIIlII = lllllllllllllIlIlIlIlllllIlIIlIl.length;
        long lllllllllllllIlIlIlIlllllIlIIIll = DefaultChannelGroupFuture.lllllIlllllII[0];
        while (lIlIllllIllllII((int)lllllllllllllIlIlIlIlllllIlIIIll, (int)lllllllllllllIlIlIlIlllllIlIIlII)) {
            final char lllllllllllllIlIlIlIlllllIllIIII = lllllllllllllIlIlIlIlllllIlIIlIl[lllllllllllllIlIlIlIlllllIlIIIll];
            lllllllllllllIlIlIlIlllllIlIllIl.append((char)(lllllllllllllIlIlIlIlllllIllIIII ^ lllllllllllllIlIlIlIlllllIlIllII[lllllllllllllIlIlIlIlllllIlIlIll % lllllllllllllIlIlIlIlllllIlIllII.length]));
            "".length();
            ++lllllllllllllIlIlIlIlllllIlIlIll;
            ++lllllllllllllIlIlIlIlllllIlIIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIlllllIlIllIl);
    }
    
    @Override
    public DefaultChannelGroupFuture removeListeners(final GenericFutureListener<? extends Future<? super Void>>... lllllllllllllIlIlIllIIIIlIIlllll) {
        super.removeListeners(lllllllllllllIlIlIllIIIIlIIlllll);
        "".length();
        return this;
    }
    
    private static boolean lIlIllllIllIlll(final Object lllllllllllllIlIlIlIlllllIIIlIIl) {
        return lllllllllllllIlIlIlIlllllIIIlIIl == null;
    }
    
    @Override
    public DefaultChannelGroupFuture removeListener(final GenericFutureListener<? extends Future<? super Void>> lllllllllllllIlIlIllIIIIlIlIIlIl) {
        super.removeListener(lllllllllllllIlIlIllIIIIlIlIIlIl);
        "".length();
        return this;
    }
    
    DefaultChannelGroupFuture(final ChannelGroup lllllllllllllIlIlIllIIIIlllIIIII, final Collection<ChannelFuture> lllllllllllllIlIlIllIIIIllIlllll, final EventExecutor lllllllllllllIlIlIllIIIIlllIIIll) {
        super(lllllllllllllIlIlIllIIIIlllIIIll);
        this.childListener = new ChannelFutureListener() {
            static final /* synthetic */ boolean $assertionsDisabled;
            private static final /* synthetic */ int[] lllllllIllIll;
            
            private static void lIllIIIlIlIllIl() {
                (lllllllIllIll = new int[2])[0] = " ".length();
                DefaultChannelGroupFuture$1.lllllllIllIll[1] = ((0x16 ^ 0x1E) & ~(0x41 ^ 0x49));
            }
            
            private static boolean lIllIIIlIllIIlI(final int lllllllllllllIlIlIIlllIlIlIllllI, final int lllllllllllllIlIlIIlllIlIlIlllIl) {
                return lllllllllllllIlIlIIlllIlIlIllllI > lllllllllllllIlIlIIlllIlIlIlllIl;
            }
            
            private static boolean lIllIIIlIlIllll(final int lllllllllllllIlIlIIlllIlIlIllIll) {
                return lllllllllllllIlIlIIlllIlIlIllIll != 0;
            }
            
            private static boolean lIllIIIlIllIIll(final int lllllllllllllIlIlIIlllIlIlIlIlll) {
                return lllllllllllllIlIlIIlllIlIlIlIlll > 0;
            }
            
            private static boolean lIllIIIlIllIIIl(final int lllllllllllllIlIlIIlllIlIlIllIIl) {
                return lllllllllllllIlIlIIlllIlIlIllIIl == 0;
            }
            
            static {
                lIllIIIlIlIllIl();
                int $assertionsDisabled2;
                if (lIllIIIlIllIIIl(DefaultChannelGroupFuture.class.desiredAssertionStatus() ? 1 : 0)) {
                    $assertionsDisabled2 = DefaultChannelGroupFuture$1.lllllllIllIll[0];
                    "".length();
                    if (-(0xA3 ^ 0x91 ^ (0x3F ^ 0x9)) >= 0) {
                        return;
                    }
                }
                else {
                    $assertionsDisabled2 = DefaultChannelGroupFuture$1.lllllllIllIll[1];
                }
                $assertionsDisabled = ($assertionsDisabled2 != 0);
            }
            
            private static boolean lIllIIIlIllIIII(final int lllllllllllllIlIlIIlllIlIllIIIlI, final int lllllllllllllIlIlIIlllIlIllIIIIl) {
                return lllllllllllllIlIlIIlllIlIllIIIlI == lllllllllllllIlIlIIlllIlIllIIIIl;
            }
            
            @Override
            public void operationComplete(final ChannelFuture lllllllllllllIlIlIIlllIlIlllIlII) throws Exception {
                final boolean lllllllllllllIlIlIIlllIlIlllIIll = lllllllllllllIlIlIIlllIlIlllIlII.isSuccess();
                final boolean lllllllllllllIlIlIIlllIlIlllIIlI;
                synchronized (DefaultChannelGroupFuture.this) {
                    if (lIllIIIlIlIllll(lllllllllllllIlIlIIlllIlIlllIIll ? 1 : 0)) {
                        DefaultChannelGroupFuture.this.successCount = DefaultChannelGroupFuture.this.successCount;
                        "".length();
                        "".length();
                        if ("   ".length() <= " ".length()) {
                            return;
                        }
                    }
                    else {
                        DefaultChannelGroupFuture.this.failureCount = DefaultChannelGroupFuture.this.failureCount;
                        "".length();
                    }
                    int n;
                    if (lIllIIIlIllIIII(DefaultChannelGroupFuture.this.successCount + DefaultChannelGroupFuture.this.failureCount, DefaultChannelGroupFuture.this.futures.size())) {
                        n = DefaultChannelGroupFuture$1.lllllllIllIll[0];
                        "".length();
                        if (-(0x0 ^ 0x5) >= 0) {
                            return;
                        }
                    }
                    else {
                        n = DefaultChannelGroupFuture$1.lllllllIllIll[1];
                    }
                    lllllllllllllIlIlIIlllIlIlllIIlI = (n != 0);
                    if (lIllIIIlIllIIIl(DefaultChannelGroupFuture$1.$assertionsDisabled ? 1 : 0) && lIllIIIlIllIIlI(DefaultChannelGroupFuture.this.successCount + DefaultChannelGroupFuture.this.failureCount, DefaultChannelGroupFuture.this.futures.size())) {
                        throw new AssertionError();
                    }
                    // monitorexit(this.this$0)
                    "".length();
                    if ((0x65 ^ 0x70 ^ (0x90 ^ 0x81)) < 0) {
                        return;
                    }
                }
                if (lIllIIIlIlIllll(lllllllllllllIlIlIIlllIlIlllIIlI ? 1 : 0)) {
                    if (lIllIIIlIllIIll(DefaultChannelGroupFuture.this.failureCount)) {
                        final List<Map.Entry<Channel, Throwable>> lllllllllllllIlIlIIlllIlIlllIllI = new ArrayList<Map.Entry<Channel, Throwable>>(DefaultChannelGroupFuture.this.failureCount);
                        final Iterator lllllllllllllIlIlIIlllIlIlllIlll = DefaultChannelGroupFuture.this.futures.values().iterator();
                        while (lIllIIIlIlIllll(lllllllllllllIlIlIIlllIlIlllIlll.hasNext() ? 1 : 0)) {
                            final ChannelFuture lllllllllllllIlIlIIlllIlIllllIII = lllllllllllllIlIlIIlllIlIlllIlll.next();
                            if (lIllIIIlIllIIIl(lllllllllllllIlIlIIlllIlIllllIII.isSuccess() ? 1 : 0)) {
                                lllllllllllllIlIlIIlllIlIlllIllI.add(new DefaultEntry<Channel, Throwable>(lllllllllllllIlIlIIlllIlIllllIII.channel(), lllllllllllllIlIlIIlllIlIllllIII.cause()));
                                "".length();
                            }
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        DefaultChannelGroupFuture.this.setFailure0(new ChannelGroupException(lllllllllllllIlIlIIlllIlIlllIllI));
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                    }
                    else {
                        DefaultChannelGroupFuture.this.setSuccess0();
                    }
                }
            }
        };
        if (lIlIllllIllIlll(lllllllllllllIlIlIllIIIIlllIIIII)) {
            throw new NullPointerException(DefaultChannelGroupFuture.lllllIllllIll[DefaultChannelGroupFuture.lllllIlllllII[0]]);
        }
        if (lIlIllllIllIlll(lllllllllllllIlIlIllIIIIllIlllll)) {
            throw new NullPointerException(DefaultChannelGroupFuture.lllllIllllIll[DefaultChannelGroupFuture.lllllIlllllII[1]]);
        }
        this.group = lllllllllllllIlIlIllIIIIlllIIIII;
        final Map<Channel, ChannelFuture> lllllllllllllIlIlIllIIIIlllIIIlI = new LinkedHashMap<Channel, ChannelFuture>();
        final Iterator lllllllllllllIlIlIllIIIIlllIlIIl = lllllllllllllIlIlIllIIIIllIlllll.iterator();
        while (lIlIllllIlllIII(lllllllllllllIlIlIllIIIIlllIlIIl.hasNext() ? 1 : 0)) {
            final ChannelFuture lllllllllllllIlIlIllIIIIlllIlIlI = lllllllllllllIlIlIllIIIIlllIlIIl.next();
            lllllllllllllIlIlIllIIIIlllIIIlI.put(lllllllllllllIlIlIllIIIIlllIlIlI.channel(), lllllllllllllIlIlIllIIIIlllIlIlI);
            "".length();
            "".length();
            if (((0x71 ^ 0x2D) & ~(0xF8 ^ 0xA4)) != 0x0) {
                throw null;
            }
        }
        this.futures = Collections.unmodifiableMap((Map<? extends Channel, ? extends ChannelFuture>)lllllllllllllIlIlIllIIIIlllIIIlI);
        final Iterator lllllllllllllIlIlIllIIIIlllIIlll = this.futures.values().iterator();
        while (lIlIllllIlllIII(lllllllllllllIlIlIllIIIIlllIIlll.hasNext() ? 1 : 0)) {
            final ChannelFuture lllllllllllllIlIlIllIIIIlllIlIII = lllllllllllllIlIlIllIIIIlllIIlll.next();
            lllllllllllllIlIlIllIIIIlllIlIII.addListener((GenericFutureListener<? extends Future<? super Void>>)this.childListener);
            "".length();
            "".length();
            if (((55 + 77 - 38 + 155 ^ 93 + 58 - 149 + 153) & (18 + 168 - 93 + 100 ^ 100 + 130 - 123 + 56 ^ -" ".length())) >= " ".length()) {
                throw null;
            }
        }
        if (lIlIllllIlllIII(this.futures.isEmpty() ? 1 : 0)) {
            this.setSuccess0();
        }
    }
    
    @Override
    public DefaultChannelGroupFuture setFailure(final Throwable lllllllllllllIlIlIllIIIIlIIIIIIl) {
        throw new IllegalStateException();
    }
    
    @Override
    public ChannelFuture find(final Channel lllllllllllllIlIlIllIIIIllIIIIlI) {
        return this.futures.get(lllllllllllllIlIlIllIIIIllIIIIlI);
    }
    
    static {
        lIlIllllIllIllI();
        lIlIllllIllIlIl();
    }
    
    private static final class DefaultEntry<K, V> implements Map.Entry<K, V>
    {
        private final /* synthetic */ K key;
        private final /* synthetic */ V value;
        private static final /* synthetic */ String[] lIlllIlIllIlII;
        private static final /* synthetic */ int[] lIlllIlIllIllI;
        
        @Override
        public V getValue() {
            return this.value;
        }
        
        static {
            lIIIIIlIlllIllII();
            lIIIIIlIlllIlIIl();
        }
        
        private static String lIIIIIlIlllIlIII(final String llllllllllllIllllIlllllIIllIllIl, final String llllllllllllIllllIlllllIIllIlIlI) {
            try {
                final SecretKeySpec llllllllllllIllllIlllllIIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllllIIllIlIlI.getBytes(StandardCharsets.UTF_8)), DefaultEntry.lIlllIlIllIllI[2]), "DES");
                final Cipher llllllllllllIllllIlllllIIllIllll = Cipher.getInstance("DES");
                llllllllllllIllllIlllllIIllIllll.init(DefaultEntry.lIlllIlIllIllI[3], llllllllllllIllllIlllllIIlllIIII);
                return new String(llllllllllllIllllIlllllIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllllIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlllllIIllIlllI) {
                llllllllllllIllllIlllllIIllIlllI.printStackTrace();
                return null;
            }
        }
        
        private static void lIIIIIlIlllIllII() {
            (lIlllIlIllIllI = new int[4])[0] = ((0x59 ^ 0x71) & ~(0xBC ^ 0x94));
            DefaultEntry.lIlllIlIllIllI[1] = " ".length();
            DefaultEntry.lIlllIlIllIllI[2] = (0x27 ^ 0x2F);
            DefaultEntry.lIlllIlIllIllI[3] = "  ".length();
        }
        
        @Override
        public V setValue(final V llllllllllllIllllIlllllIIlllIlIl) {
            throw new UnsupportedOperationException(DefaultEntry.lIlllIlIllIlII[DefaultEntry.lIlllIlIllIllI[0]]);
        }
        
        private static void lIIIIIlIlllIlIIl() {
            (lIlllIlIllIlII = new String[DefaultEntry.lIlllIlIllIllI[1]])[DefaultEntry.lIlllIlIllIllI[0]] = lIIIIIlIlllIlIII("2NnOJXHeHSLyjzUdm/bRTw==", "FrVgv");
        }
        
        @Override
        public K getKey() {
            return this.key;
        }
        
        DefaultEntry(final K llllllllllllIllllIlllllIlIIIIIIl, final V llllllllllllIllllIlllllIIlllllIl) {
            this.key = llllllllllllIllllIlllllIlIIIIIIl;
            this.value = llllllllllllIllllIlllllIIlllllIl;
        }
    }
}
