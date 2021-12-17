// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import io.netty.util.internal.StringUtil;
import io.netty.util.internal.MpscLinkedQueueNode;
import java.util.HashSet;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.PlatformDependent;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import io.netty.util.internal.logging.InternalLogger;
import java.util.concurrent.CountDownLatch;
import java.util.Queue;

public class HashedWheelTimer implements Timer
{
    private static final /* synthetic */ String[] lIIIIIIlllllII;
    private final /* synthetic */ Queue<Runnable> cancelledTimeouts;
    private final /* synthetic */ Thread workerThread;
    private final /* synthetic */ CountDownLatch startTimeInitialized;
    static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ ResourceLeakDetector<HashedWheelTimer> leakDetector;
    private static final /* synthetic */ AtomicIntegerFieldUpdater<HashedWheelTimer> WORKER_STATE_UPDATER;
    private final /* synthetic */ long tickDuration;
    private final /* synthetic */ Worker worker;
    private volatile /* synthetic */ int workerState;
    private final /* synthetic */ ResourceLeak leak;
    private volatile /* synthetic */ long startTime;
    private final /* synthetic */ int mask;
    private final /* synthetic */ Queue<HashedWheelTimeout> timeouts;
    private final /* synthetic */ HashedWheelBucket[] wheel;
    private static final /* synthetic */ int[] lIIIIIlIIIIlll;
    
    private static boolean lIllIlIlIlllIIl(final int lllllllllllllIlIIlllllIIIIIIlllI) {
        return lllllllllllllIlIIlllllIIIIIIlllI >= 0;
    }
    
    private static boolean lIllIlIlIllllll(final Object lllllllllllllIlIIlllllIIIIIllIIl, final Object lllllllllllllIlIIlllllIIIIIllIII) {
        return lllllllllllllIlIIlllllIIIIIllIIl == lllllllllllllIlIIlllllIIIIIllIII;
    }
    
    private static int lIllIlIlIllIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public HashedWheelTimer(final ThreadFactory lllllllllllllIlIIlllllIIlIllllll) {
        this(lllllllllllllIlIIlllllIIlIllllll, 100L, TimeUnit.MILLISECONDS);
    }
    
    private static boolean lIllIlIlIlllIll(final int lllllllllllllIlIIlllllIIIIlIIIIl, final int lllllllllllllIlIIlllllIIIIlIIIII) {
        return lllllllllllllIlIIlllllIIIIlIIIIl < lllllllllllllIlIIlllllIIIIlIIIII;
    }
    
    private static boolean lIllIlIlIllIlll(final Object lllllllllllllIlIIlllllIIIIIlIlII) {
        return lllllllllllllIlIIlllllIIIIIlIlII == null;
    }
    
    private static void lIllIlIlIlIlIll() {
        (lIIIIIIlllllII = new String[HashedWheelTimer.lIIIIIlIIIIlll[16]])[HashedWheelTimer.lIIIIIlIIIIlll[1]] = lIllIlIlIIllIll("NhEGCg4mPxUMGy0LDQ==", "Bytoo");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[2]] = lIllIlIlIIlllII("t2T1HL/NtmA=", "bNAtx");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[3]] = lIllIlIlIIlllIl("m5OV8Y/+hZOL4g0bAvgznez3OeLIcKyVNlhz90nJUi2Bv/pZb/NOwQ==", "fpdkv");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[4]] = lIllIlIlIIlllII("apaba/lKrGtTVagv5UshJVoxSAJMA/EPrWH5lSucrjmASVd64mj4VQ==", "eQZwm");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[5]] = lIllIlIlIIlllII("cps81y5Z5ftt1j6RNIbxuChQrTo/5+925e5KYrH5b5xymzzXLlnl+9IMbQJfl3Q/XW6T++24aaNr+RnHzDZRtQ==", "tQDuP");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[6]] = lIllIlIlIIlllII("zJhnYMw34v/LrY7PP9DX2zg06gtBanGooLx64IvyUYZ1c64Z30NjlQ==", "aSQZj");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[8]] = lIllIlIlIIllIll("NR0SIj0REQMeJiQRHWkjIA1RJyE1VBMsbiYGFCg6JAZRPSYgGlF7EHJES2k=", "AtqIN");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[9]] = lIllIlIlIIlllII("HgLopiH35U3GX33dlTD3J55krpJmLVzBbOtmZxzcnqM=", "jXWDk");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[10]] = lIllIlIlIIlllIl("8SW6Ctk//nJvEcRGfOCm0I0WM7rdCJ1p", "syuVg");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[11]] = lIllIlIlIIlllII("YylCq2FdXNS6CflDMHBkhtW/jkJwizOpIBOdb/UX3bM=", "WthpS");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[12]] = lIllIlIlIIllIll("AQYYCQ==", "ugkbp");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[13]] = lIllIlIlIIlllII("S8iwISjXf+E=", "YFXiW");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[14]] = lIllIlIlIIlllIl("1iT3sxc+DLpN4e/wr/vzKg==", "OLLXE");
        HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[15]] = lIllIlIlIIlllII("lH8KKK8AMtVpnnB+SD/ZlA==", "qeYcT");
    }
    
    private static void lIllIlIlIllIlIl() {
        (lIIIIIlIIIIlll = new int[17])[0] = (-(0xFFFFF86F & 0x57BD) & (0xFFFFDA6C & 0x77BF));
        HashedWheelTimer.lIIIIIlIIIIlll[1] = ((0xF9 ^ 0xAA) & ~(0x33 ^ 0x60));
        HashedWheelTimer.lIIIIIlIIIIlll[2] = " ".length();
        HashedWheelTimer.lIIIIIlIIIIlll[3] = "  ".length();
        HashedWheelTimer.lIIIIIlIIIIlll[4] = "   ".length();
        HashedWheelTimer.lIIIIIlIIIIlll[5] = (0x70 ^ 0x74);
        HashedWheelTimer.lIIIIIlIIIIlll[6] = (0x6B ^ 0x12 ^ (0xD ^ 0x71));
        HashedWheelTimer.lIIIIIlIIIIlll[7] = (-(0xFFFFBFF7 & 0x7DFB) & (0xFFFFBFF6 & 0x40007DFB));
        HashedWheelTimer.lIIIIIlIIIIlll[8] = (0x57 ^ 0xF ^ (0xD8 ^ 0x86));
        HashedWheelTimer.lIIIIIlIIIIlll[9] = (111 + 43 - 148 + 147 ^ 29 + 55 + 72 + 2);
        HashedWheelTimer.lIIIIIlIIIIlll[10] = (29 + 128 - 61 + 59 ^ 127 + 26 - 118 + 112);
        HashedWheelTimer.lIIIIIlIIIIlll[11] = (0x68 ^ 0x61);
        HashedWheelTimer.lIIIIIlIIIIlll[12] = (0x1C ^ 0x16);
        HashedWheelTimer.lIIIIIlIIIIlll[13] = (0x8A ^ 0x81);
        HashedWheelTimer.lIIIIIlIIIIlll[14] = (0x63 ^ 0x28 ^ (0xE ^ 0x49));
        HashedWheelTimer.lIIIIIlIIIIlll[15] = (0x38 ^ 0xF ^ (0x34 ^ 0xE));
        HashedWheelTimer.lIIIIIlIIIIlll[16] = (0x6E ^ 0x60);
    }
    
    public HashedWheelTimer(final long lllllllllllllIlIIlllllIIllIIIlll, final TimeUnit lllllllllllllIlIIlllllIIllIIlIlI, final int lllllllllllllIlIIlllllIIllIIlIIl) {
        this(Executors.defaultThreadFactory(), lllllllllllllIlIIlllllIIllIIIlll, lllllllllllllIlIIlllllIIllIIlIlI, lllllllllllllIlIIlllllIIllIIlIIl);
    }
    
    @Override
    public Set<Timeout> stop() {
        if (lIllIlIlIllllll(Thread.currentThread(), this.workerThread)) {
            throw new IllegalStateException(String.valueOf(new StringBuilder().append(HashedWheelTimer.class.getSimpleName()).append(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[11]]).append(TimerTask.class.getSimpleName())));
        }
        if (lIllIlIlIlllllI(HashedWheelTimer.WORKER_STATE_UPDATER.compareAndSet(this, HashedWheelTimer.lIIIIIlIIIIlll[2], HashedWheelTimer.lIIIIIlIIIIlll[3]) ? 1 : 0)) {
            HashedWheelTimer.WORKER_STATE_UPDATER.set(this, HashedWheelTimer.lIIIIIlIIIIlll[3]);
            if (lIllIlIllIIIIII(this.leak)) {
                this.leak.close();
                "".length();
            }
            return Collections.emptySet();
        }
        boolean lllllllllllllIlIIlllllIIlIIIlIIl = HashedWheelTimer.lIIIIIlIIIIlll[1] != 0;
        while (lIllIlIlIllllIl(this.workerThread.isAlive() ? 1 : 0)) {
            this.workerThread.interrupt();
            try {
                this.workerThread.join(100L);
                "".length();
                if ((0x4C ^ 0x48) < 0) {
                    return null;
                }
                continue;
            }
            catch (InterruptedException lllllllllllllIlIIlllllIIlIIIlIll) {
                lllllllllllllIlIIlllllIIlIIIlIIl = (HashedWheelTimer.lIIIIIlIIIIlll[2] != 0);
                "".length();
                if (((0x4A ^ 0x41 ^ (0xB1 ^ 0x89)) & (0xF5 ^ 0x8C ^ (0xD7 ^ 0x9D) ^ -" ".length())) != 0x0) {
                    return null;
                }
                continue;
            }
            break;
        }
        if (lIllIlIlIllllIl(lllllllllllllIlIIlllllIIlIIIlIIl ? 1 : 0)) {
            Thread.currentThread().interrupt();
        }
        if (lIllIlIllIIIIII(this.leak)) {
            this.leak.close();
            "".length();
        }
        return this.worker.unprocessedTimeouts();
    }
    
    public HashedWheelTimer(final ThreadFactory lllllllllllllIlIIlllllIIlIlIIlll, final long lllllllllllllIlIIlllllIIlIlIlIll, final TimeUnit lllllllllllllIlIIlllllIIlIlIIlIl, final int lllllllllllllIlIIlllllIIlIlIlIIl) {
        this.worker = new Worker();
        this.workerState = HashedWheelTimer.lIIIIIlIIIIlll[1];
        this.startTimeInitialized = new CountDownLatch(HashedWheelTimer.lIIIIIlIIIIlll[2]);
        this.timeouts = PlatformDependent.newMpscQueue();
        this.cancelledTimeouts = PlatformDependent.newMpscQueue();
        if (lIllIlIlIllIlll(lllllllllllllIlIIlllllIIlIlIIlll)) {
            throw new NullPointerException(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[1]]);
        }
        if (lIllIlIlIllIlll(lllllllllllllIlIIlllllIIlIlIIlIl)) {
            throw new NullPointerException(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[2]]);
        }
        if (lIllIlIlIlllIII(lIllIlIlIllIllI(lllllllllllllIlIIlllllIIlIlIlIll, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[3]]).append(lllllllllllllIlIIlllllIIlIlIlIll)));
        }
        if (lIllIlIlIlllIII(lllllllllllllIlIIlllllIIlIlIlIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[4]]).append(lllllllllllllIlIIlllllIIlIlIlIIl)));
        }
        this.wheel = createWheel(lllllllllllllIlIIlllllIIlIlIlIIl);
        this.mask = this.wheel.length - HashedWheelTimer.lIIIIIlIIIIlll[2];
        this.tickDuration = lllllllllllllIlIIlllllIIlIlIIlIl.toNanos(lllllllllllllIlIIlllllIIlIlIlIll);
        if (lIllIlIlIlllIIl(lIllIlIlIllIllI(this.tickDuration, Long.MAX_VALUE / this.wheel.length))) {
            final String format = HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[5]];
            final Object[] args = new Object[HashedWheelTimer.lIIIIIlIIIIlll[3]];
            args[HashedWheelTimer.lIIIIIlIIIIlll[1]] = lllllllllllllIlIIlllllIIlIlIlIll;
            args[HashedWheelTimer.lIIIIIlIIIIlll[2]] = Long.MAX_VALUE / this.wheel.length;
            throw new IllegalArgumentException(String.format(format, args));
        }
        this.workerThread = lllllllllllllIlIIlllllIIlIlIIlll.newThread(this.worker);
        this.leak = HashedWheelTimer.leakDetector.open(this);
    }
    
    private static boolean lIllIlIlIlllIlI(final int lllllllllllllIlIIlllllIIIIIlllIl, final int lllllllllllllIlIIlllllIIIIIlllII) {
        return lllllllllllllIlIIlllllIIIIIlllIl > lllllllllllllIlIIlllllIIIIIlllII;
    }
    
    private static String lIllIlIlIIlllII(final String lllllllllllllIlIIlllllIIIlIIllII, final String lllllllllllllIlIIlllllIIIlIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllllIIIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllllIIIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlllllIIIlIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlllllIIIlIlIIII.init(HashedWheelTimer.lIIIIIlIIIIlll[3], lllllllllllllIlIIlllllIIIlIlIIIl);
            return new String(lllllllllllllIlIIlllllIIIlIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllllIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllllIIIlIIllll) {
            lllllllllllllIlIIlllllIIIlIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Timeout newTimeout(final TimerTask lllllllllllllIlIIlllllIIIllllllI, final long lllllllllllllIlIIlllllIIIlllllIl, final TimeUnit lllllllllllllIlIIlllllIIIlllIllI) {
        if (lIllIlIlIllIlll(lllllllllllllIlIIlllllIIIllllllI)) {
            throw new NullPointerException(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[12]]);
        }
        if (lIllIlIlIllIlll(lllllllllllllIlIIlllllIIIlllIllI)) {
            throw new NullPointerException(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[13]]);
        }
        this.start();
        final long lllllllllllllIlIIlllllIIIllllIll = System.nanoTime() + lllllllllllllIlIIlllllIIIlllIllI.toNanos(lllllllllllllIlIIlllllIIIlllllIl) - this.startTime;
        final HashedWheelTimeout lllllllllllllIlIIlllllIIIllllIlI = new HashedWheelTimeout(this, lllllllllllllIlIIlllllIIIllllllI, lllllllllllllIlIIlllllIIIllllIll);
        this.timeouts.add(lllllllllllllIlIIlllllIIIllllIlI);
        "".length();
        return lllllllllllllIlIIlllllIIIllllIlI;
    }
    
    public void start() {
        switch (HashedWheelTimer.WORKER_STATE_UPDATER.get(this)) {
            case 0: {
                if (!lIllIlIlIllllIl(HashedWheelTimer.WORKER_STATE_UPDATER.compareAndSet(this, HashedWheelTimer.lIIIIIlIIIIlll[1], HashedWheelTimer.lIIIIIlIIIIlll[2]) ? 1 : 0)) {
                    break;
                }
                this.workerThread.start();
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 1: {
                "".length();
                if (-" ".length() > ((0x5F ^ 0x9) & ~(0x3D ^ 0x6B))) {
                    return;
                }
                break;
            }
            case 2: {
                throw new IllegalStateException(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[9]]);
            }
            default: {
                throw new Error(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[10]]);
            }
        }
        while (lIllIlIlIlllllI(lIllIlIlIllllII(this.startTime, 0L))) {
            try {
                this.startTimeInitialized.await();
                "".length();
                if ((0xA6 ^ 0xA2) <= "  ".length()) {
                    return;
                }
                continue;
            }
            catch (InterruptedException lllllllllllllIlIIlllllIIlIIlIIlI) {
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
                continue;
            }
            break;
        }
    }
    
    private static boolean lIllIlIllIIIIII(final Object lllllllllllllIlIIlllllIIIIIlIllI) {
        return lllllllllllllIlIIlllllIIIIIlIllI != null;
    }
    
    private static int lIllIlIlIllllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public HashedWheelTimer() {
        this(Executors.defaultThreadFactory());
    }
    
    private static String lIllIlIlIIlllIl(final String lllllllllllllIlIIlllllIIIlIIIIIl, final String lllllllllllllIlIIlllllIIIlIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllllIIIlIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllllIIIlIIIIII.getBytes(StandardCharsets.UTF_8)), HashedWheelTimer.lIIIIIlIIIIlll[10]), "DES");
            final Cipher lllllllllllllIlIIlllllIIIlIIIIll = Cipher.getInstance("DES");
            lllllllllllllIlIIlllllIIIlIIIIll.init(HashedWheelTimer.lIIIIIlIIIIlll[3], lllllllllllllIlIIlllllIIIlIIIlII);
            return new String(lllllllllllllIlIIlllllIIIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllllIIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllllIIIlIIIIlI) {
            lllllllllllllIlIIlllllIIIlIIIIlI.printStackTrace();
            return null;
        }
    }
    
    public HashedWheelTimer(final ThreadFactory lllllllllllllIlIIlllllIIlIllIlIl, final long lllllllllllllIlIIlllllIIlIlllIII, final TimeUnit lllllllllllllIlIIlllllIIlIllIIll) {
        this(lllllllllllllIlIIlllllIIlIllIlIl, lllllllllllllIlIIlllllIIlIlllIII, lllllllllllllIlIIlllllIIlIllIIll, HashedWheelTimer.lIIIIIlIIIIlll[0]);
    }
    
    private static boolean lIllIlIlIlllllI(final int lllllllllllllIlIIlllllIIIIIlIIII) {
        return lllllllllllllIlIIlllllIIIIIlIIII == 0;
    }
    
    private static HashedWheelBucket[] createWheel(int lllllllllllllIlIIlllllIIlIIlllIl) {
        if (lIllIlIlIlllIII(lllllllllllllIlIIlllllIIlIIlllIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[6]]).append(lllllllllllllIlIIlllllIIlIIlllIl)));
        }
        if (lIllIlIlIlllIlI(lllllllllllllIlIIlllllIIlIIlllIl, HashedWheelTimer.lIIIIIlIIIIlll[7])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[8]]).append(lllllllllllllIlIIlllllIIlIIlllIl)));
        }
        lllllllllllllIlIIlllllIIlIIlllIl = normalizeTicksPerWheel(lllllllllllllIlIIlllllIIlIIlllIl);
        final HashedWheelBucket[] lllllllllllllIlIIlllllIIlIIllllI = new HashedWheelBucket[lllllllllllllIlIIlllllIIlIIlllIl];
        int lllllllllllllIlIIlllllIIlIlIIIII = HashedWheelTimer.lIIIIIlIIIIlll[1];
        while (lIllIlIlIlllIll(lllllllllllllIlIIlllllIIlIlIIIII, lllllllllllllIlIIlllllIIlIIllllI.length)) {
            lllllllllllllIlIIlllllIIlIIllllI[lllllllllllllIlIIlllllIIlIlIIIII] = new HashedWheelBucket();
            ++lllllllllllllIlIIlllllIIlIlIIIII;
            "".length();
            if (((0x78 ^ 0x25 ^ (0x11 ^ 0x17)) & (0xEA ^ 0x86 ^ (0x19 ^ 0x2E) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return lllllllllllllIlIIlllllIIlIIllllI;
    }
    
    public HashedWheelTimer(final long lllllllllllllIlIIlllllIIllIlIIlI, final TimeUnit lllllllllllllIlIIlllllIIllIlIlII) {
        this(Executors.defaultThreadFactory(), lllllllllllllIlIIlllllIIllIlIIlI, lllllllllllllIlIIlllllIIllIlIlII);
    }
    
    private static boolean lIllIlIlIllllIl(final int lllllllllllllIlIIlllllIIIIIlIIlI) {
        return lllllllllllllIlIIlllllIIIIIlIIlI != 0;
    }
    
    private static boolean lIllIlIlIlllIII(final int lllllllllllllIlIIlllllIIIIIIllII) {
        return lllllllllllllIlIIlllllIIIIIIllII <= 0;
    }
    
    private static String lIllIlIlIIllIll(String lllllllllllllIlIIlllllIIIIlIllII, final String lllllllllllllIlIIlllllIIIIllIIII) {
        lllllllllllllIlIIlllllIIIIlIllII = new String(Base64.getDecoder().decode(lllllllllllllIlIIlllllIIIIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlllllIIIIlIllll = new StringBuilder();
        final char[] lllllllllllllIlIIlllllIIIIlIlllI = lllllllllllllIlIIlllllIIIIllIIII.toCharArray();
        int lllllllllllllIlIIlllllIIIIlIllIl = HashedWheelTimer.lIIIIIlIIIIlll[1];
        final int lllllllllllllIlIIlllllIIIIlIIlll = (Object)lllllllllllllIlIIlllllIIIIlIllII.toCharArray();
        final int lllllllllllllIlIIlllllIIIIlIIllI = lllllllllllllIlIIlllllIIIIlIIlll.length;
        long lllllllllllllIlIIlllllIIIIlIIlIl = HashedWheelTimer.lIIIIIlIIIIlll[1];
        while (lIllIlIlIlllIll((int)lllllllllllllIlIIlllllIIIIlIIlIl, lllllllllllllIlIIlllllIIIIlIIllI)) {
            final char lllllllllllllIlIIlllllIIIIllIIlI = lllllllllllllIlIIlllllIIIIlIIlll[lllllllllllllIlIIlllllIIIIlIIlIl];
            lllllllllllllIlIIlllllIIIIlIllll.append((char)(lllllllllllllIlIIlllllIIIIllIIlI ^ lllllllllllllIlIIlllllIIIIlIlllI[lllllllllllllIlIIlllllIIIIlIllIl % lllllllllllllIlIIlllllIIIIlIlllI.length]));
            "".length();
            ++lllllllllllllIlIIlllllIIIIlIllIl;
            ++lllllllllllllIlIIlllllIIIIlIIlIl;
            "".length();
            if (" ".length() < ((0x15 ^ 0x37) & ~(0xBB ^ 0x99))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlllllIIIIlIllll);
    }
    
    static {
        lIllIlIlIllIlIl();
        lIllIlIlIlIlIll();
        WORKER_STATE_STARTED = HashedWheelTimer.lIIIIIlIIIIlll[2];
        WORKER_STATE_INIT = HashedWheelTimer.lIIIIIlIIIIlll[1];
        WORKER_STATE_SHUTDOWN = HashedWheelTimer.lIIIIIlIIIIlll[3];
        logger = InternalLoggerFactory.getInstance(HashedWheelTimer.class);
        leakDetector = new ResourceLeakDetector<HashedWheelTimer>(HashedWheelTimer.class, HashedWheelTimer.lIIIIIlIIIIlll[2], Runtime.getRuntime().availableProcessors() * HashedWheelTimer.lIIIIIlIIIIlll[5]);
        AtomicIntegerFieldUpdater<HashedWheelTimer> lllllllllllllIlIIlllllIIIlIlIlll = PlatformDependent.newAtomicIntegerFieldUpdater(HashedWheelTimer.class, HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[14]]);
        if (lIllIlIlIllIlll(lllllllllllllIlIIlllllIIIlIlIlll)) {
            lllllllllllllIlIIlllllIIIlIlIlll = AtomicIntegerFieldUpdater.newUpdater(HashedWheelTimer.class, HashedWheelTimer.lIIIIIIlllllII[HashedWheelTimer.lIIIIIlIIIIlll[15]]);
        }
        WORKER_STATE_UPDATER = lllllllllllllIlIIlllllIIIlIlIlll;
    }
    
    private static int normalizeTicksPerWheel(final int lllllllllllllIlIIlllllIIlIIlIllI) {
        int lllllllllllllIlIIlllllIIlIIlIlll = HashedWheelTimer.lIIIIIlIIIIlll[2];
        while (lIllIlIlIlllIll(lllllllllllllIlIIlllllIIlIIlIlll, lllllllllllllIlIIlllllIIlIIlIllI)) {
            lllllllllllllIlIIlllllIIlIIlIlll <<= HashedWheelTimer.lIIIIIlIIIIlll[2];
            "".length();
            if (-(0x2 ^ 0x58 ^ (0x14 ^ 0x4A)) > 0) {
                return (183 + 38 + 8 + 6 ^ 119 + 6 - 48 + 86) & (0xA2 ^ 0xAF ^ (0x47 ^ 0x2) ^ -" ".length());
            }
        }
        return lllllllllllllIlIIlllllIIlIIlIlll;
    }
    
    private final class Worker implements Runnable
    {
        private static final /* synthetic */ int[] lllIlIIlIIllIl;
        private static final /* synthetic */ String[] lllIlIIlIIllII;
        private /* synthetic */ long tick;
        private final /* synthetic */ Set<Timeout> unprocessedTimeouts;
        
        private static boolean lIlIIIlIIIlIIIIl(final int llllllllllllIlIllIlllllIIlllllIl) {
            return llllllllllllIlIllIlllllIIlllllIl == 0;
        }
        
        private static boolean lIlIIIlIIIlIIIlI(final int llllllllllllIlIllIlllllIIllllIIl) {
            return llllllllllllIlIllIlllllIIllllIIl > 0;
        }
        
        private static void lIlIIIlIIIIllllI() {
            (lllIlIIlIIllII = new String[Worker.lllIlIIlIIllIl[0]])[Worker.lllIlIIlIIllIl[1]] = lIlIIIlIIIIllIIl("cZdv0Q8AUgpBCAnAKBF4GiZGETHh87yAQ5oPzjzpZ8oZK6WjTCUSUK1/Usqmc1GVPwkQYfoTgtl0L/WJOKSUyQ==", "WloBG");
        }
        
        private static void lIlIIIlIIIIlllll() {
            (lllIlIIlIIllIl = new int[4])[0] = " ".length();
            Worker.lllIlIIlIIllIl[1] = ("   ".length() & ("   ".length() ^ -" ".length()));
            Worker.lllIlIIlIIllIl[2] = (0xFFFF8FBA & 0x1F6E5);
            Worker.lllIlIIlIIllIl[3] = "  ".length();
        }
        
        private static boolean lIlIIIlIIIlIlIIl(final int llllllllllllIlIllIlllllIIllllIll) {
            return llllllllllllIlIllIlllllIIllllIll <= 0;
        }
        
        @Override
        public void run() {
            HashedWheelTimer.this.startTime = System.nanoTime();
            if (lIlIIIlIIIlIIIIl(lIlIIIlIIIlIIIII(HashedWheelTimer.this.startTime, 0L))) {
                HashedWheelTimer.this.startTime = 1L;
            }
            HashedWheelTimer.this.startTimeInitialized.countDown();
            do {
                final long llllllllllllIlIllIlllllIllIllIlI = this.waitForNextTick();
                if (lIlIIIlIIIlIIIlI(lIlIIIlIIIlIIIII(llllllllllllIlIllIlllllIllIllIlI, 0L))) {
                    final int llllllllllllIlIllIlllllIllIlllII = (int)(this.tick & (long)HashedWheelTimer.this.mask);
                    this.processCancelledTasks();
                    final HashedWheelBucket llllllllllllIlIllIlllllIllIllIll = HashedWheelTimer.this.wheel[llllllllllllIlIllIlllllIllIlllII];
                    this.transferTimeoutsToBuckets();
                    llllllllllllIlIllIlllllIllIllIll.expireTimeouts(llllllllllllIlIllIlllllIllIllIlI);
                    ++this.tick;
                }
            } while (!lIlIIIlIIIlIIIll(HashedWheelTimer.WORKER_STATE_UPDATER.get(HashedWheelTimer.this), Worker.lllIlIIlIIllIl[0]));
            final HashedWheelBucket[] llllllllllllIlIllIlllllIllIllIII = HashedWheelTimer.this.wheel;
            final int llllllllllllIlIllIlllllIllIlIlll = llllllllllllIlIllIlllllIllIllIII.length;
            int llllllllllllIlIllIlllllIllIlIllI = Worker.lllIlIIlIIllIl[1];
            while (lIlIIIlIIIlIIlII(llllllllllllIlIllIlllllIllIlIllI, llllllllllllIlIllIlllllIllIlIlll)) {
                final HashedWheelBucket llllllllllllIlIllIlllllIllIllIIl = llllllllllllIlIllIlllllIllIllIII[llllllllllllIlIllIlllllIllIlIllI];
                llllllllllllIlIllIlllllIllIllIIl.clearTimeouts(this.unprocessedTimeouts);
                ++llllllllllllIlIllIlllllIllIlIllI;
                "".length();
                if (((0x47 ^ 0x4F) & ~(0x9D ^ 0x95)) != 0x0) {
                    return;
                }
            }
            do {
                final HashedWheelTimeout llllllllllllIlIllIlllllIllIlIlIl = HashedWheelTimer.this.timeouts.poll();
                if (lIlIIIlIIIlIIlIl(llllllllllllIlIllIlllllIllIlIlIl)) {
                    "".length();
                    if (null != null) {
                        return;
                    }
                    this.processCancelledTasks();
                }
                else {
                    if (lIlIIIlIIIlIIIIl(llllllllllllIlIllIlllllIllIlIlIl.isCancelled() ? 1 : 0)) {
                        this.unprocessedTimeouts.add(llllllllllllIlIllIlllllIllIlIlIl);
                        "".length();
                    }
                    "".length();
                }
            } while (-" ".length() < "   ".length());
        }
        
        private static boolean lIlIIIlIIIlIIlIl(final Object llllllllllllIlIllIlllllIlIIIIIIl) {
            return llllllllllllIlIllIlllllIlIIIIIIl == null;
        }
        
        private long waitForNextTick() {
            final long llllllllllllIlIllIlllllIlIlIIlll = HashedWheelTimer.this.tickDuration * (this.tick + 1L);
            do {
                final long llllllllllllIlIllIlllllIlIlIlIlI = System.nanoTime() - HashedWheelTimer.this.startTime;
                long llllllllllllIlIllIlllllIlIlIlIIl = (llllllllllllIlIllIlllllIlIlIIlll - llllllllllllIlIllIlllllIlIlIlIlI + 999999L) / 1000000L;
                if (lIlIIIlIIIlIlIIl(lIlIIIlIIIlIlIII(llllllllllllIlIllIlllllIlIlIlIIl, 0L))) {
                    if (lIlIIIlIIIlIIIIl(lIlIIIlIIIlIlIII(llllllllllllIlIllIlllllIlIlIlIlI, Long.MIN_VALUE))) {
                        return -9223372036854775807L;
                    }
                    return llllllllllllIlIllIlllllIlIlIlIlI;
                }
                else {
                    if (lIlIIIlIIIlIIlll(PlatformDependent.isWindows() ? 1 : 0)) {
                        llllllllllllIlIllIlllllIlIlIlIIl = llllllllllllIlIllIlllllIlIlIlIIl / 10L * 10L;
                    }
                    try {
                        Thread.sleep(llllllllllllIlIllIlllllIlIlIlIIl);
                        "".length();
                        if ("   ".length() == 0) {
                            return 0L;
                        }
                    }
                    catch (InterruptedException llllllllllllIlIllIlllllIlIlIlIll) {
                        if (lIlIIIlIIIlIIllI(HashedWheelTimer.WORKER_STATE_UPDATER.get(HashedWheelTimer.this), Worker.lllIlIIlIIllIl[3])) {
                            return Long.MIN_VALUE;
                        }
                    }
                    "".length();
                }
            } while (-(0x3B ^ 0x72 ^ (0xFA ^ 0xB7)) <= 0);
            return 0L;
        }
        
        private static int lIlIIIlIIIlIIIII(final long n, final long n2) {
            return lcmp(n, n2);
        }
        
        private static boolean lIlIIIlIIIlIIIll(final int llllllllllllIlIllIlllllIIlllIllI, final int llllllllllllIlIllIlllllIIlllIlIl) {
            return llllllllllllIlIllIlllllIIlllIllI != llllllllllllIlIllIlllllIIlllIlIl;
        }
        
        private static boolean lIlIIIlIIIlIIllI(final int llllllllllllIlIllIlllllIlIIIlIII, final int llllllllllllIlIllIlllllIlIIIIlll) {
            return llllllllllllIlIllIlllllIlIIIlIII == llllllllllllIlIllIlllllIlIIIIlll;
        }
        
        private static int lIlIIIlIIIlIlIII(final long n, final long n2) {
            return lcmp(n, n2);
        }
        
        private static boolean lIlIIIlIIIlIIlII(final int llllllllllllIlIllIlllllIlIIIIlII, final int llllllllllllIlIllIlllllIlIIIIIll) {
            return llllllllllllIlIllIlllllIlIIIIlII < llllllllllllIlIllIlllllIlIIIIIll;
        }
        
        private static String lIlIIIlIIIIllIIl(final String llllllllllllIlIllIlllllIlIIlIIII, final String llllllllllllIlIllIlllllIlIIIllIl) {
            try {
                final SecretKeySpec llllllllllllIlIllIlllllIlIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllllIlIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlIllIlllllIlIIlIIlI = Cipher.getInstance("Blowfish");
                llllllllllllIlIllIlllllIlIIlIIlI.init(Worker.lllIlIIlIIllIl[3], llllllllllllIlIllIlllllIlIIlIIll);
                return new String(llllllllllllIlIllIlllllIlIIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllllIlIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIlllllIlIIlIIIl) {
                llllllllllllIlIllIlllllIlIIlIIIl.printStackTrace();
                return null;
            }
        }
        
        public Set<Timeout> unprocessedTimeouts() {
            return Collections.unmodifiableSet((Set<? extends Timeout>)this.unprocessedTimeouts);
        }
        
        private void transferTimeoutsToBuckets() {
            int llllllllllllIlIllIlllllIllIIIIlI = Worker.lllIlIIlIIllIl[1];
            while (lIlIIIlIIIlIIlII(llllllllllllIlIllIlllllIllIIIIlI, Worker.lllIlIIlIIllIl[2])) {
                final HashedWheelTimeout llllllllllllIlIllIlllllIllIIIlll = HashedWheelTimer.this.timeouts.poll();
                if (lIlIIIlIIIlIIlIl(llllllllllllIlIllIlllllIllIIIlll)) {
                    "".length();
                    if ((0x7F ^ 0x5D ^ (0x81 ^ 0xA6)) <= 0) {
                        return;
                    }
                    break;
                }
                else {
                    if (lIlIIIlIIIlIIllI(llllllllllllIlIllIlllllIllIIIlll.state(), Worker.lllIlIIlIIllIl[0])) {
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        final long llllllllllllIlIllIlllllIllIIIllI = llllllllllllIlIllIlllllIllIIIlll.deadline / HashedWheelTimer.this.tickDuration;
                        llllllllllllIlIllIlllllIllIIIlll.remainingRounds = (llllllllllllIlIllIlllllIllIIIllI - this.tick) / HashedWheelTimer.this.wheel.length;
                        final long llllllllllllIlIllIlllllIllIIIlIl = Math.max(llllllllllllIlIllIlllllIllIIIllI, this.tick);
                        final int llllllllllllIlIllIlllllIllIIIlII = (int)(llllllllllllIlIllIlllllIllIIIlIl & (long)HashedWheelTimer.this.mask);
                        final HashedWheelBucket llllllllllllIlIllIlllllIllIIIIll = HashedWheelTimer.this.wheel[llllllllllllIlIllIlllllIllIIIlII];
                        llllllllllllIlIllIlllllIllIIIIll.addTimeout(llllllllllllIlIllIlllllIllIIIlll);
                    }
                    ++llllllllllllIlIllIlllllIllIIIIlI;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
            }
        }
        
        private Worker() {
            this.unprocessedTimeouts = new HashSet<Timeout>();
        }
        
        private void processCancelledTasks() {
            do {
                final Runnable llllllllllllIlIllIlllllIlIllIlIl = HashedWheelTimer.this.cancelledTimeouts.poll();
                if (lIlIIIlIIIlIIlIl(llllllllllllIlIllIlllllIlIllIlIl)) {
                    "".length();
                    if (" ".length() < -" ".length()) {
                        return;
                    }
                }
                else {
                    try {
                        llllllllllllIlIllIlllllIlIllIlIl.run();
                        "".length();
                        if ("   ".length() < 0) {
                            return;
                        }
                    }
                    catch (Throwable llllllllllllIlIllIlllllIlIllIllI) {
                        if (lIlIIIlIIIlIIlll(HashedWheelTimer.logger.isWarnEnabled() ? 1 : 0)) {
                            HashedWheelTimer.logger.warn(Worker.lllIlIIlIIllII[Worker.lllIlIIlIIllIl[1]], llllllllllllIlIllIlllllIlIllIllI);
                        }
                    }
                    "".length();
                }
            } while ((75 + 64 - 119 + 169 ^ 90 + 126 - 163 + 132) >= 0);
        }
        
        static {
            lIlIIIlIIIIlllll();
            lIlIIIlIIIIllllI();
        }
        
        private static boolean lIlIIIlIIIlIIlll(final int llllllllllllIlIllIlllllIIlllllll) {
            return llllllllllllIlIllIlllllIIlllllll != 0;
        }
    }
    
    private static final class HashedWheelTimeout extends MpscLinkedQueueNode<Timeout> implements Timeout
    {
        private final /* synthetic */ HashedWheelTimer timer;
        private volatile /* synthetic */ int state;
        private static final /* synthetic */ String[] lIIlIlIIllllIl;
        private final /* synthetic */ TimerTask task;
        /* synthetic */ HashedWheelTimeout prev;
        private static final /* synthetic */ AtomicIntegerFieldUpdater<HashedWheelTimeout> STATE_UPDATER;
        /* synthetic */ HashedWheelTimeout next;
        /* synthetic */ HashedWheelBucket bucket;
        /* synthetic */ long remainingRounds;
        private static final /* synthetic */ int[] lIIlIlIIllllll;
        private final /* synthetic */ long deadline;
        
        private static void llIlIIIIIIllIll() {
            (lIIlIlIIllllll = new int[14])[0] = ((0x96 ^ 0x86 ^ (0x34 ^ 0x19)) & (45 + 37 - 49 + 102 ^ 6 + 23 + 34 + 123 ^ -" ".length()));
            HashedWheelTimeout.lIIlIlIIllllll[1] = " ".length();
            HashedWheelTimeout.lIIlIlIIllllll[2] = "  ".length();
            HashedWheelTimeout.lIIlIlIIllllll[3] = (0x8E ^ 0xA0);
            HashedWheelTimeout.lIIlIlIIllllll[4] = 151 + 130 - 274 + 185;
            HashedWheelTimeout.lIIlIlIIllllll[5] = (164 + 22 - 114 + 165 ^ 6 + 43 - 3 + 151);
            HashedWheelTimeout.lIIlIlIIllllll[6] = "   ".length();
            HashedWheelTimeout.lIIlIlIIllllll[7] = (0x6A ^ 0x6E);
            HashedWheelTimeout.lIIlIlIIllllll[8] = (0x51 ^ 0x54);
            HashedWheelTimeout.lIIlIlIIllllll[9] = (0x8 ^ 0x68 ^ (0x50 ^ 0x36));
            HashedWheelTimeout.lIIlIlIIllllll[10] = (0x7E ^ 0x57);
            HashedWheelTimeout.lIIlIlIIllllll[11] = (0xAD ^ 0xAA);
            HashedWheelTimeout.lIIlIlIIllllll[12] = (0xB2 ^ 0xBA);
            HashedWheelTimeout.lIIlIlIIllllll[13] = (11 + 149 - 127 + 132 ^ 41 + 169 - 63 + 25);
        }
        
        private static boolean llIlIIIIIlIIIIl(final int lllllllllllllIIllIlIIIIlllIIIIII) {
            return lllllllllllllIIllIlIIIIlllIIIIII < 0;
        }
        
        @Override
        public Timer timer() {
            return this.timer;
        }
        
        HashedWheelTimeout(final TimerTask lllllllllllllIIllIlIIIlIIlIIIIII, final long lllllllllllllIIllIlIIIlIIIllllll) {
            this.state = HashedWheelTimeout.lIIlIlIIllllll[0];
            this.task = lllllllllllllIIllIlIIIlIIlIIIIII;
            this.deadline = lllllllllllllIIllIlIIIlIIIllllll;
        }
        
        public void expire() {
            if (llIlIIIIIIlllII(this.compareAndSetState(HashedWheelTimeout.lIIlIlIIllllll[0], HashedWheelTimeout.lIIlIlIIllllll[2]) ? 1 : 0)) {
                return;
            }
            try {
                this.task.run(this);
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIllIlIIIlIIIIllIlI) {
                if (llIlIIIIIIllllI(HashedWheelTimer.logger.isWarnEnabled() ? 1 : 0)) {
                    HashedWheelTimer.logger.warn(String.valueOf(new StringBuilder().append(HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[0]]).append(TimerTask.class.getSimpleName()).append((char)HashedWheelTimeout.lIIlIlIIllllll[3])), lllllllllllllIIllIlIIIlIIIIllIlI);
                }
            }
        }
        
        private static boolean llIlIIIIIIlllIl(final int lllllllllllllIIllIlIIIIlllIIllIl, final int lllllllllllllIIllIlIIIIlllIIllII) {
            return lllllllllllllIIllIlIIIIlllIIllIl == lllllllllllllIIllIlIIIIlllIIllII;
        }
        
        private static boolean llIlIIIIIlIIIlI(final Object lllllllllllllIIllIlIIIIlllIIIllI) {
            return lllllllllllllIIllIlIIIIlllIIIllI == null;
        }
        
        @Override
        public TimerTask task() {
            return this.task;
        }
        
        private static void llIlIIIIIIllIlI() {
            (lIIlIlIIllllIl = new String[HashedWheelTimeout.lIIlIlIIllllll[13]])[HashedWheelTimeout.lIIlIlIIllllll[0]] = llIlIIIIIIIlllI("FhRjMR80HzMgDjgUYyMGJFo3PBU4DS10BS5a", "WzCTg");
            HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[1]] = llIlIIIIIIIllll("VRBMnHtSQP9JCAD0gNiDmA==", "Rtzui");
            HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[2]] = llIlIIIIIIIlllI("SQoUVzwIEAIF", "idgwP");
            HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[6]] = llIlIIIIIIlIIII("zCta86+k7Co=", "LQqaI");
            HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[7]] = llIlIIIIIIIlllI("JC0D", "JBtxu");
            HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[8]] = llIlIIIIIIIllll("pixly68/PUpRSZFZdH4WfA==", "Mqqxa");
            HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[9]] = llIlIIIIIIIllll("iPhGHx74WVKuThceZ05tgw==", "NjdVs");
            HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[11]] = llIlIIIIIIlIIII("NFdrzl7ncSA=", "HMQrH");
            HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[12]] = llIlIIIIIIIllll("raEh3VP6YxU=", "KiKQP");
        }
        
        private static String llIlIIIIIIlIIII(final String lllllllllllllIIllIlIIIIlllIlIlIl, final String lllllllllllllIIllIlIIIIlllIlIlII) {
            try {
                final SecretKeySpec lllllllllllllIIllIlIIIIlllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIIIlllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllIlIIIIlllIlIlll = Cipher.getInstance("Blowfish");
                lllllllllllllIIllIlIIIIlllIlIlll.init(HashedWheelTimeout.lIIlIlIIllllll[2], lllllllllllllIIllIlIIIIlllIllIII);
                return new String(lllllllllllllIIllIlIIIIlllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIIIlllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIlIIIIlllIlIllI) {
                lllllllllllllIIllIlIIIIlllIlIllI.printStackTrace();
                return null;
            }
        }
        
        @Override
        public boolean isCancelled() {
            int n;
            if (llIlIIIIIIlllIl(this.state(), HashedWheelTimeout.lIIlIlIIllllll[1])) {
                n = HashedWheelTimeout.lIIlIlIIllllll[1];
                "".length();
                if ((0xAE ^ 0xAA) <= -" ".length()) {
                    return ((0xC0 ^ 0x9C) & ~(0xFB ^ 0xA7)) != 0x0;
                }
            }
            else {
                n = HashedWheelTimeout.lIIlIlIIllllll[0];
            }
            return n != 0;
        }
        
        private static boolean llIlIIIIIlIIIII(final int lllllllllllllIIllIlIIIIllIlllllI) {
            return lllllllllllllIIllIlIIIIllIlllllI > 0;
        }
        
        @Override
        public HashedWheelTimeout value() {
            return this;
        }
        
        public boolean compareAndSetState(final int lllllllllllllIIllIlIIIlIIIlIlIlI, final int lllllllllllllIIllIlIIIlIIIlIllII) {
            return HashedWheelTimeout.STATE_UPDATER.compareAndSet(this, lllllllllllllIIllIlIIIlIIIlIlIlI, lllllllllllllIIllIlIIIlIIIlIllII);
        }
        
        private static String llIlIIIIIIIllll(final String lllllllllllllIIllIlIIIIllllIIIII, final String lllllllllllllIIllIlIIIIlllIlllll) {
            try {
                final SecretKeySpec lllllllllllllIIllIlIIIIllllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIIIlllIlllll.getBytes(StandardCharsets.UTF_8)), HashedWheelTimeout.lIIlIlIIllllll[12]), "DES");
                final Cipher lllllllllllllIIllIlIIIIllllIIlII = Cipher.getInstance("DES");
                lllllllllllllIIllIlIIIIllllIIlII.init(HashedWheelTimeout.lIIlIlIIllllll[2], lllllllllllllIIllIlIIIIllllIIlIl);
                return new String(lllllllllllllIIllIlIIIIllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIIIllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIlIIIIllllIIIll) {
                lllllllllllllIIllIlIIIIllllIIIll.printStackTrace();
                return null;
            }
        }
        
        public int state() {
            return this.state;
        }
        
        private static int llIlIIIIIIlllll(final long n, final long n2) {
            return lcmp(n, n2);
        }
        
        private static boolean llIlIIIIIlIIIll(final int lllllllllllllIIllIlIIIIlllIIlIIl, final int lllllllllllllIIllIlIIIIlllIIlIII) {
            return lllllllllllllIIllIlIIIIlllIIlIIl < lllllllllllllIIllIlIIIIlllIIlIII;
        }
        
        @Override
        public String toString() {
            final long lllllllllllllIIllIlIIIlIIIIlIIIl = System.nanoTime();
            final long lllllllllllllIIllIlIIIlIIIIlIIII = this.deadline - lllllllllllllIIllIlIIIlIIIIlIIIl + this.timer.startTime;
            final StringBuilder lllllllllllllIIllIlIIIlIIIIIllll = new StringBuilder(HashedWheelTimeout.lIIlIlIIllllll[4]);
            lllllllllllllIIllIlIIIlIIIIIllll.append(StringUtil.simpleClassName(this));
            "".length();
            lllllllllllllIIllIlIIIlIIIIIllll.append((char)HashedWheelTimeout.lIIlIlIIllllll[5]);
            "".length();
            lllllllllllllIIllIlIIIlIIIIIllll.append(HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[1]]);
            "".length();
            if (llIlIIIIIlIIIII(llIlIIIIIIlllll(lllllllllllllIIllIlIIIlIIIIlIIII, 0L))) {
                lllllllllllllIIllIlIIIlIIIIIllll.append(lllllllllllllIIllIlIIIlIIIIlIIII);
                "".length();
                lllllllllllllIIllIlIIIlIIIIIllll.append(HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[2]]);
                "".length();
                "".length();
                if ("  ".length() < " ".length()) {
                    return null;
                }
            }
            else if (llIlIIIIIlIIIIl(llIlIIIIIIlllll(lllllllllllllIIllIlIIIlIIIIlIIII, 0L))) {
                lllllllllllllIIllIlIIIlIIIIIllll.append(-lllllllllllllIIllIlIIIlIIIIlIIII);
                "".length();
                lllllllllllllIIllIlIIIlIIIIIllll.append(HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[6]]);
                "".length();
                "".length();
                if ((63 + 43 - 87 + 113 ^ 86 + 122 - 153 + 73) != (106 + 101 - 195 + 151 ^ 162 + 37 - 124 + 92)) {
                    return null;
                }
            }
            else {
                lllllllllllllIIllIlIIIlIIIIIllll.append(HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[7]]);
                "".length();
            }
            if (llIlIIIIIIllllI(this.isCancelled() ? 1 : 0)) {
                lllllllllllllIIllIlIIIlIIIIIllll.append(HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[8]]);
                "".length();
            }
            lllllllllllllIIllIlIIIlIIIIIllll.append(HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[9]]);
            "".length();
            lllllllllllllIIllIlIIIlIIIIIllll.append(this.task());
            "".length();
            return String.valueOf(lllllllllllllIIllIlIIIlIIIIIllll.append((char)HashedWheelTimeout.lIIlIlIIllllll[10]));
        }
        
        @Override
        public boolean isExpired() {
            int n;
            if (llIlIIIIIIlllIl(this.state(), HashedWheelTimeout.lIIlIlIIllllll[2])) {
                n = HashedWheelTimeout.lIIlIlIIllllll[1];
                "".length();
                if ("  ".length() <= 0) {
                    return ((0x4A ^ 0x18 ^ (0xF0 ^ 0x93)) & (0x8D ^ 0xBF ^ "   ".length() ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = HashedWheelTimeout.lIIlIlIIllllll[0];
            }
            return n != 0;
        }
        
        private static boolean llIlIIIIIIllllI(final int lllllllllllllIIllIlIIIIlllIIIlII) {
            return lllllllllllllIIllIlIIIIlllIIIlII != 0;
        }
        
        private static String llIlIIIIIIIlllI(String lllllllllllllIIllIlIIIIlllllIIlI, final String lllllllllllllIIllIlIIIIlllllIIIl) {
            lllllllllllllIIllIlIIIIlllllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIllIlIIIIlllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllIlIIIIlllllIlIl = new StringBuilder();
            final char[] lllllllllllllIIllIlIIIIlllllIlII = lllllllllllllIIllIlIIIIlllllIIIl.toCharArray();
            int lllllllllllllIIllIlIIIIlllllIIll = HashedWheelTimeout.lIIlIlIIllllll[0];
            final Exception lllllllllllllIIllIlIIIIllllIllIl = (Object)lllllllllllllIIllIlIIIIlllllIIlI.toCharArray();
            final byte lllllllllllllIIllIlIIIIllllIllII = (byte)lllllllllllllIIllIlIIIIllllIllIl.length;
            byte lllllllllllllIIllIlIIIIllllIlIll = (byte)HashedWheelTimeout.lIIlIlIIllllll[0];
            while (llIlIIIIIlIIIll(lllllllllllllIIllIlIIIIllllIlIll, lllllllllllllIIllIlIIIIllllIllII)) {
                final char lllllllllllllIIllIlIIIIllllllIII = lllllllllllllIIllIlIIIIllllIllIl[lllllllllllllIIllIlIIIIllllIlIll];
                lllllllllllllIIllIlIIIIlllllIlIl.append((char)(lllllllllllllIIllIlIIIIllllllIII ^ lllllllllllllIIllIlIIIIlllllIlII[lllllllllllllIIllIlIIIIlllllIIll % lllllllllllllIIllIlIIIIlllllIlII.length]));
                "".length();
                ++lllllllllllllIIllIlIIIIlllllIIll;
                ++lllllllllllllIIllIlIIIIllllIlIll;
                "".length();
                if (((0x52 ^ 0x4B) & ~(0x62 ^ 0x7B)) != 0x0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllIlIIIIlllllIlIl);
        }
        
        static {
            llIlIIIIIIllIll();
            llIlIIIIIIllIlI();
            ST_EXPIRED = HashedWheelTimeout.lIIlIlIIllllll[2];
            ST_INIT = HashedWheelTimeout.lIIlIlIIllllll[0];
            ST_CANCELLED = HashedWheelTimeout.lIIlIlIIllllll[1];
            AtomicIntegerFieldUpdater<HashedWheelTimeout> lllllllllllllIIllIlIIIlIIIIIIIll = PlatformDependent.newAtomicIntegerFieldUpdater(HashedWheelTimeout.class, HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[11]]);
            if (llIlIIIIIlIIIlI(lllllllllllllIIllIlIIIlIIIIIIIll)) {
                lllllllllllllIIllIlIIIlIIIIIIIll = AtomicIntegerFieldUpdater.newUpdater(HashedWheelTimeout.class, HashedWheelTimeout.lIIlIlIIllllIl[HashedWheelTimeout.lIIlIlIIllllll[12]]);
            }
            STATE_UPDATER = lllllllllllllIIllIlIIIlIIIIIIIll;
        }
        
        @Override
        public boolean cancel() {
            if (llIlIIIIIIlllII(this.compareAndSetState(HashedWheelTimeout.lIIlIlIIllllll[0], HashedWheelTimeout.lIIlIlIIllllll[1]) ? 1 : 0)) {
                return HashedWheelTimeout.lIIlIlIIllllll[0] != 0;
            }
            this.timer.cancelledTimeouts.add(new Runnable() {
                @Override
                public void run() {
                    final HashedWheelBucket lllllllllllllIIIlIlIIIIllIIlIllI = HashedWheelTimeout.this.bucket;
                    if (lllIllIIllIIlll(lllllllllllllIIIlIlIIIIllIIlIllI)) {
                        lllllllllllllIIIlIlIIIIllIIlIllI.remove(HashedWheelTimeout.this);
                    }
                }
                
                private static boolean lllIllIIllIIlll(final Object lllllllllllllIIIlIlIIIIllIIlIIlI) {
                    return lllllllllllllIIIlIlIIIIllIIlIIlI != null;
                }
            });
            "".length();
            return HashedWheelTimeout.lIIlIlIIllllll[1] != 0;
        }
        
        private static boolean llIlIIIIIIlllII(final int lllllllllllllIIllIlIIIIlllIIIIlI) {
            return lllllllllllllIIllIlIIIIlllIIIIlI == 0;
        }
    }
    
    private static final class HashedWheelBucket
    {
        static final /* synthetic */ boolean $assertionsDisabled;
        private static final /* synthetic */ String[] lIIlIlllIIIlII;
        private static final /* synthetic */ int[] lIIlIlllIIIlIl;
        private /* synthetic */ HashedWheelTimeout tail;
        private /* synthetic */ HashedWheelTimeout head;
        
        private static boolean llIlIIlllIlIlll(final int lllllllllllllIIllIIIIlIllIlIlIIl) {
            return lllllllllllllIIllIIIIlIllIlIlIIl <= 0;
        }
        
        private static int llIlIIlllIlIllI(final long n, final long n2) {
            return lcmp(n, n2);
        }
        
        private static boolean llIlIIlllIllIII(final int lllllllllllllIIllIIIIlIllIlIllIl) {
            return lllllllllllllIIllIIIIlIllIlIllIl != 0;
        }
        
        private static String llIlIIlllIlIIII(String lllllllllllllIIllIIIIlIlllIIIIll, final String lllllllllllllIIllIIIIlIlllIIIIlI) {
            lllllllllllllIIllIIIIlIlllIIIIll = new String(Base64.getDecoder().decode(lllllllllllllIIllIIIIlIlllIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllIIIIlIlllIIIllI = new StringBuilder();
            final char[] lllllllllllllIIllIIIIlIlllIIIlIl = lllllllllllllIIllIIIIlIlllIIIIlI.toCharArray();
            int lllllllllllllIIllIIIIlIlllIIIlII = HashedWheelBucket.lIIlIlllIIIlIl[0];
            final long lllllllllllllIIllIIIIlIllIlllllI = (Object)lllllllllllllIIllIIIIlIlllIIIIll.toCharArray();
            final Exception lllllllllllllIIllIIIIlIllIllllIl = (Exception)lllllllllllllIIllIIIIlIllIlllllI.length;
            Exception lllllllllllllIIllIIIIlIllIllllII = (Exception)HashedWheelBucket.lIIlIlllIIIlIl[0];
            while (llIlIIlllIllIlI((int)lllllllllllllIIllIIIIlIllIllllII, (int)lllllllllllllIIllIIIIlIllIllllIl)) {
                final char lllllllllllllIIllIIIIlIlllIIlIIl = lllllllllllllIIllIIIIlIllIlllllI[lllllllllllllIIllIIIIlIllIllllII];
                lllllllllllllIIllIIIIlIlllIIIllI.append((char)(lllllllllllllIIllIIIIlIlllIIlIIl ^ lllllllllllllIIllIIIIlIlllIIIlIl[lllllllllllllIIllIIIIlIlllIIIlII % lllllllllllllIIllIIIIlIlllIIIlIl.length]));
                "".length();
                ++lllllllllllllIIllIIIIlIlllIIIlII;
                ++lllllllllllllIIllIIIIlIllIllllII;
                "".length();
                if ("   ".length() == 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllIIIIlIlllIIIllI);
        }
        
        static {
            llIlIIlllIlIIlI();
            llIlIIlllIlIIIl();
            int $assertionsDisabled2;
            if (llIlIIlllIlIIll(HashedWheelTimer.class.desiredAssertionStatus() ? 1 : 0)) {
                $assertionsDisabled2 = HashedWheelBucket.lIIlIlllIIIlIl[2];
                "".length();
                if (((0x4D ^ 0x3F ^ (0x30 ^ 0x62)) & (0x7 ^ 0x11 ^ (0x4D ^ 0x7B) ^ -" ".length())) == "   ".length()) {
                    return;
                }
            }
            else {
                $assertionsDisabled2 = HashedWheelBucket.lIIlIlllIIIlIl[0];
            }
            $assertionsDisabled = ($assertionsDisabled2 != 0);
        }
        
        private static boolean llIlIIlllIlIlII(final Object lllllllllllllIIllIIIIlIllIllIlIl) {
            return lllllllllllllIIllIIIIlIllIllIlIl != null;
        }
        
        private static void llIlIIlllIlIIlI() {
            (lIIlIlllIIIlIl = new int[3])[0] = ((0x40 ^ 0x1B) & ~(0x17 ^ 0x4C));
            HashedWheelBucket.lIIlIlllIIIlIl[1] = "  ".length();
            HashedWheelBucket.lIIlIlllIIIlIl[2] = " ".length();
        }
        
        private static void llIlIIlllIlIIIl() {
            (lIIlIlllIIIlII = new String[HashedWheelBucket.lIIlIlllIIIlIl[2]])[HashedWheelBucket.lIIlIlllIIIlIl[0]] = llIlIIlllIlIIII("ERggBwEQBWMGCwQVIQsAAFFlRwpMUXNCCgAQKQ4HCxRtSksBWA==", "eqMbn");
        }
        
        private static boolean llIlIIlllIlIIll(final int lllllllllllllIIllIIIIlIllIlIlIll) {
            return lllllllllllllIIllIIIIlIllIlIlIll == 0;
        }
        
        public void expireTimeouts(final long lllllllllllllIIllIIIIlIllllllIII) {
            HashedWheelTimeout lllllllllllllIIllIIIIlIlllllIlll = this.head;
            while (llIlIIlllIlIlII(lllllllllllllIIllIIIIlIlllllIlll)) {
                boolean lllllllllllllIIllIIIIlIllllllIll = HashedWheelBucket.lIIlIlllIIIlIl[0] != 0;
                if (llIlIIlllIlIlll(llIlIIlllIlIllI(lllllllllllllIIllIIIIlIlllllIlll.remainingRounds, 0L))) {
                    if (!llIlIIlllIlIlll(llIlIIlllIlIllI(lllllllllllllIIllIIIIlIlllllIlll.deadline, lllllllllllllIIllIIIIlIllllllIII))) {
                        final String format = HashedWheelBucket.lIIlIlllIIIlII[HashedWheelBucket.lIIlIlllIIIlIl[0]];
                        final Object[] args = new Object[HashedWheelBucket.lIIlIlllIIIlIl[1]];
                        args[HashedWheelBucket.lIIlIlllIIIlIl[0]] = lllllllllllllIIllIIIIlIlllllIlll.deadline;
                        args[HashedWheelBucket.lIIlIlllIIIlIl[2]] = lllllllllllllIIllIIIIlIllllllIII;
                        throw new IllegalStateException(String.format(format, args));
                    }
                    lllllllllllllIIllIIIIlIlllllIlll.expire();
                    "".length();
                    if (((0x81 ^ 0x93) & ~(0x43 ^ 0x51)) >= "  ".length()) {
                        return;
                    }
                    lllllllllllllIIllIIIIlIllllllIll = (HashedWheelBucket.lIIlIlllIIIlIl[2] != 0);
                    "".length();
                    if (((0xF ^ 0x72 ^ (0x99 ^ 0xBB)) & (0x71 ^ 0x1C ^ (0x9B ^ 0xA9) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else if (llIlIIlllIllIII(lllllllllllllIIllIIIIlIlllllIlll.isCancelled() ? 1 : 0)) {
                    lllllllllllllIIllIIIIlIllllllIll = (HashedWheelBucket.lIIlIlllIIIlIl[2] != 0);
                    "".length();
                    if ((0xAD ^ 0xA9) == -" ".length()) {
                        return;
                    }
                }
                else {
                    final HashedWheelTimeout hashedWheelTimeout = lllllllllllllIIllIIIIlIlllllIlll;
                    --hashedWheelTimeout.remainingRounds;
                }
                final HashedWheelTimeout lllllllllllllIIllIIIIlIllllllIlI = lllllllllllllIIllIIIIlIlllllIlll.next;
                if (llIlIIlllIllIII(lllllllllllllIIllIIIIlIllllllIll ? 1 : 0)) {
                    this.remove(lllllllllllllIIllIIIIlIlllllIlll);
                }
                lllllllllllllIIllIIIIlIlllllIlll = lllllllllllllIIllIIIIlIllllllIlI;
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
        }
        
        private static boolean llIlIIlllIllIIl(final Object lllllllllllllIIllIIIIlIllIllIIlI, final Object lllllllllllllIIllIIIIlIllIllIIIl) {
            return lllllllllllllIIllIIIIlIllIllIIlI == lllllllllllllIIllIIIIlIllIllIIIl;
        }
        
        public void clearTimeouts(final Set<Timeout> lllllllllllllIIllIIIIlIllllIIIll) {
            while (true) {
                final HashedWheelTimeout lllllllllllllIIllIIIIlIllllIIlIl = this.pollTimeout();
                if (llIlIIlllIlIlIl(lllllllllllllIIllIIIIlIllllIIlIl)) {
                    return;
                }
                if (!llIlIIlllIlIIll(lllllllllllllIIllIIIIlIllllIIlIl.isExpired() ? 1 : 0)) {
                    continue;
                }
                if (llIlIIlllIllIII(lllllllllllllIIllIIIIlIllllIIlIl.isCancelled() ? 1 : 0)) {
                    "".length();
                    if (((0xDB ^ 0xC3) & ~(0x34 ^ 0x2C)) != 0x0) {
                        return;
                    }
                    continue;
                }
                else {
                    lllllllllllllIIllIIIIlIllllIIIll.add(lllllllllllllIIllIIIIlIllllIIlIl);
                    "".length();
                    "".length();
                    if ("  ".length() == -" ".length()) {
                        return;
                    }
                    continue;
                }
            }
        }
        
        public void remove(final HashedWheelTimeout lllllllllllllIIllIIIIlIllllIlIlI) {
            final HashedWheelTimeout lllllllllllllIIllIIIIlIllllIllII = lllllllllllllIIllIIIIlIllllIlIlI.next;
            if (llIlIIlllIlIlII(lllllllllllllIIllIIIIlIllllIlIlI.prev)) {
                lllllllllllllIIllIIIIlIllllIlIlI.prev.next = lllllllllllllIIllIIIIlIllllIllII;
            }
            if (llIlIIlllIlIlII(lllllllllllllIIllIIIIlIllllIlIlI.next)) {
                lllllllllllllIIllIIIIlIllllIlIlI.next.prev = lllllllllllllIIllIIIIlIllllIlIlI.prev;
            }
            if (llIlIIlllIllIIl(lllllllllllllIIllIIIIlIllllIlIlI, this.head)) {
                if (llIlIIlllIllIIl(lllllllllllllIIllIIIIlIllllIlIlI, this.tail)) {
                    this.tail = null;
                    this.head = null;
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
                else {
                    this.head = lllllllllllllIIllIIIIlIllllIllII;
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
            }
            else if (llIlIIlllIllIIl(lllllllllllllIIllIIIIlIllllIlIlI, this.tail)) {
                this.tail = lllllllllllllIIllIIIIlIllllIlIlI.prev;
            }
            lllllllllllllIIllIIIIlIllllIlIlI.prev = null;
            lllllllllllllIIllIIIIlIllllIlIlI.next = null;
            lllllllllllllIIllIIIIlIllllIlIlI.bucket = null;
        }
        
        private static boolean llIlIIlllIllIlI(final int lllllllllllllIIllIIIIlIllIlllIII, final int lllllllllllllIIllIIIIlIllIllIlll) {
            return lllllllllllllIIllIIIIlIllIlllIII < lllllllllllllIIllIIIIlIllIllIlll;
        }
        
        private static boolean llIlIIlllIlIlIl(final Object lllllllllllllIIllIIIIlIllIlIllll) {
            return lllllllllllllIIllIIIIlIllIlIllll == null;
        }
        
        public void addTimeout(final HashedWheelTimeout lllllllllllllIIllIIIIllIIIIIIIIl) {
            if (llIlIIlllIlIIll(HashedWheelBucket.$assertionsDisabled ? 1 : 0) && llIlIIlllIlIlII(lllllllllllllIIllIIIIllIIIIIIIIl.bucket)) {
                throw new AssertionError();
            }
            lllllllllllllIIllIIIIllIIIIIIIIl.bucket = this;
            if (llIlIIlllIlIlIl(this.head)) {
                this.tail = lllllllllllllIIllIIIIllIIIIIIIIl;
                this.head = lllllllllllllIIllIIIIllIIIIIIIIl;
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else {
                this.tail.next = lllllllllllllIIllIIIIllIIIIIIIIl;
                lllllllllllllIIllIIIIllIIIIIIIIl.prev = this.tail;
                this.tail = lllllllllllllIIllIIIIllIIIIIIIIl;
            }
        }
        
        private HashedWheelTimeout pollTimeout() {
            final HashedWheelTimeout lllllllllllllIIllIIIIlIlllIllIll = this.head;
            if (llIlIIlllIlIlIl(lllllllllllllIIllIIIIlIlllIllIll)) {
                return null;
            }
            final HashedWheelTimeout lllllllllllllIIllIIIIlIlllIllIlI = lllllllllllllIIllIIIIlIlllIllIll.next;
            if (llIlIIlllIlIlIl(lllllllllllllIIllIIIIlIlllIllIlI)) {
                final HashedWheelTimeout hashedWheelTimeout = null;
                this.head = hashedWheelTimeout;
                this.tail = hashedWheelTimeout;
                "".length();
                if (" ".length() >= (0x41 ^ 0x45)) {
                    return null;
                }
            }
            else {
                this.head = lllllllllllllIIllIIIIlIlllIllIlI;
                lllllllllllllIIllIIIIlIlllIllIlI.prev = null;
            }
            lllllllllllllIIllIIIIlIlllIllIll.next = null;
            lllllllllllllIIllIIIIlIlllIllIll.prev = null;
            lllllllllllllIIllIIIIlIlllIllIll.bucket = null;
            return lllllllllllllIIllIIIIlIlllIllIll;
        }
    }
}
