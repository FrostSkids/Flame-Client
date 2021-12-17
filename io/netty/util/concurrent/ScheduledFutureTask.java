// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

final class ScheduledFutureTask<V> extends PromiseTask<V> implements ScheduledFuture<V>
{
    private /* synthetic */ long deadlineNanos;
    private static final /* synthetic */ int[] llIIIllIlIlIII;
    private static final /* synthetic */ String[] llIIIllIlIIIll;
    static final /* synthetic */ boolean $assertionsDisabled;
    private final /* synthetic */ long id;
    private static final /* synthetic */ AtomicLong nextTaskId;
    private final /* synthetic */ long periodNanos;
    private static final /* synthetic */ long START_TIME;
    private final /* synthetic */ Queue<ScheduledFutureTask<?>> delayedTaskQueue;
    
    private static boolean lIIIlIlIIlllIIII(final int llllllllllllIlllIlIIlIIllIIlIIII) {
        return llllllllllllIlllIlIIlIIllIIlIIII > 0;
    }
    
    @Override
    public long getDelay(final TimeUnit llllllllllllIlllIlIIlIIllllIIlll) {
        return llllllllllllIlllIlIIlIIllllIIlll.convert(this.delayNanos(), TimeUnit.NANOSECONDS);
    }
    
    private static String lIIIlIlIIlIllllI(final String llllllllllllIlllIlIIlIIllIlllIll, final String llllllllllllIlllIlIIlIIllIllllII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIlIIlllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIlIIllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIlIIllIllllll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIlIIllIllllll.init(ScheduledFutureTask.llIIIllIlIlIII[4], llllllllllllIlllIlIIlIIlllIIIIII);
            return new String(llllllllllllIlllIlIIlIIllIllllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIlIIllIlllllI) {
            llllllllllllIlllIlIIlIIllIlllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIlIIllIllII(final int llllllllllllIlllIlIIlIIllIIlIlII) {
        return llllllllllllIlllIlIIlIIllIIlIlII == 0;
    }
    
    private static int lIIIlIlIIllIllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    protected StringBuilder toStringBuilder() {
        final StringBuilder llllllllllllIlllIlIIlIIlllIIllIl = super.toStringBuilder();
        llllllllllllIlllIlIIlIIlllIIllIl.setCharAt(llllllllllllIlllIlIIlIIlllIIllIl.length() - ScheduledFutureTask.llIIIllIlIlIII[2], (char)ScheduledFutureTask.llIIIllIlIlIII[3]);
        llllllllllllIlllIlIIlIIlllIIllIl.append(ScheduledFutureTask.llIIIllIlIIIll[ScheduledFutureTask.llIIIllIlIlIII[2]]);
        "".length();
        llllllllllllIlllIlIIlIIlllIIllIl.append(this.id);
        "".length();
        llllllllllllIlllIlIIlIIlllIIllIl.append(ScheduledFutureTask.llIIIllIlIIIll[ScheduledFutureTask.llIIIllIlIlIII[4]]);
        "".length();
        llllllllllllIlllIlIIlIIlllIIllIl.append(this.deadlineNanos);
        "".length();
        llllllllllllIlllIlIIlIIlllIIllIl.append(ScheduledFutureTask.llIIIllIlIIIll[ScheduledFutureTask.llIIIllIlIlIII[5]]);
        "".length();
        llllllllllllIlllIlIIlIIlllIIllIl.append(this.periodNanos);
        "".length();
        llllllllllllIlllIlIIlIIlllIIllIl.append((char)ScheduledFutureTask.llIIIllIlIlIII[6]);
        "".length();
        return llllllllllllIlllIlIIlIIlllIIllIl;
    }
    
    public long delayNanos() {
        return Math.max(0L, this.deadlineNanos() - nanoTime());
    }
    
    private static int lIIIlIlIIlllIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void run() {
        if (lIIIlIlIIllIllII(ScheduledFutureTask.$assertionsDisabled ? 1 : 0) && lIIIlIlIIllIllII(this.executor().inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        try {
            if (lIIIlIlIIllIllII(lIIIlIlIIlllIIIl(this.periodNanos, 0L))) {
                if (lIIIlIlIIlllIIlI(this.setUncancellableInternal() ? 1 : 0)) {
                    final V llllllllllllIlllIlIIlIIlllIlIllI = this.task.call();
                    this.setSuccessInternal(llllllllllllIlllIlIIlIIlllIlIllI);
                    "".length();
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
            }
            else if (lIIIlIlIIllIllII(this.isCancelled() ? 1 : 0)) {
                this.task.call();
                "".length();
                if (lIIIlIlIIllIllII(this.executor().isShutdown() ? 1 : 0)) {
                    final long llllllllllllIlllIlIIlIIlllIlIlIl = this.periodNanos;
                    if (lIIIlIlIIlllIIII(lIIIlIlIIlllIIIl(llllllllllllIlllIlIIlIIlllIlIlIl, 0L))) {
                        this.deadlineNanos += llllllllllllIlllIlIIlIIlllIlIlIl;
                        "".length();
                        if ((0xBF ^ 0xBB) < (0xBD ^ 0xB9)) {
                            return;
                        }
                    }
                    else {
                        this.deadlineNanos = nanoTime() - llllllllllllIlllIlIIlIIlllIlIlIl;
                    }
                    if (lIIIlIlIIllIllII(this.isCancelled() ? 1 : 0)) {
                        this.delayedTaskQueue.add(this);
                        "".length();
                    }
                }
            }
            "".length();
            if (-" ".length() >= (42 + 48 + 56 + 25 ^ 144 + 104 - 152 + 79)) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllIlIIlIIlllIlIlII) {
            this.setFailureInternal(llllllllllllIlllIlIIlIIlllIlIlII);
            "".length();
        }
    }
    
    ScheduledFutureTask(final EventExecutor llllllllllllIlllIlIIlIlIIIIlllll, final Queue<ScheduledFutureTask<?>> llllllllllllIlllIlIIlIlIIIIllllI, final Runnable llllllllllllIlllIlIIlIlIIIIlllIl, final V llllllllllllIlllIlIIlIlIIIIlllII, final long llllllllllllIlllIlIIlIlIIIIllIll) {
        this(llllllllllllIlllIlIIlIlIIIIlllll, llllllllllllIlllIlIIlIlIIIIllllI, PromiseTask.toCallable(llllllllllllIlllIlIIlIlIIIIlllIl, llllllllllllIlllIlIIlIlIIIIlllII), llllllllllllIlllIlIIlIlIIIIllIll);
    }
    
    private static boolean lIIIlIlIIlllIIll(final int llllllllllllIlllIlIIlIIllIIlllIl, final int llllllllllllIlllIlIIlIIllIIlllII) {
        return llllllllllllIlllIlIIlIIllIIlllIl < llllllllllllIlllIlIIlIIllIIlllII;
    }
    
    @Override
    protected EventExecutor executor() {
        return super.executor();
    }
    
    private static String lIIIlIlIIlIlllIl(String llllllllllllIlllIlIIlIIllIlIlIII, final String llllllllllllIlllIlIIlIIllIlIllII) {
        llllllllllllIlllIlIIlIIllIlIlIII = new String(Base64.getDecoder().decode(llllllllllllIlllIlIIlIIllIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIlIIllIlIlIll = new StringBuilder();
        final char[] llllllllllllIlllIlIIlIIllIlIlIlI = llllllllllllIlllIlIIlIIllIlIllII.toCharArray();
        int llllllllllllIlllIlIIlIIllIlIlIIl = ScheduledFutureTask.llIIIllIlIlIII[0];
        final byte llllllllllllIlllIlIIlIIllIlIIIll = (Object)llllllllllllIlllIlIIlIIllIlIlIII.toCharArray();
        final boolean llllllllllllIlllIlIIlIIllIlIIIlI = llllllllllllIlllIlIIlIIllIlIIIll.length != 0;
        byte llllllllllllIlllIlIIlIIllIlIIIIl = (byte)ScheduledFutureTask.llIIIllIlIlIII[0];
        while (lIIIlIlIIlllIIll(llllllllllllIlllIlIIlIIllIlIIIIl, llllllllllllIlllIlIIlIIllIlIIIlI ? 1 : 0)) {
            final char llllllllllllIlllIlIIlIIllIlIlllI = llllllllllllIlllIlIIlIIllIlIIIll[llllllllllllIlllIlIIlIIllIlIIIIl];
            llllllllllllIlllIlIIlIIllIlIlIll.append((char)(llllllllllllIlllIlIIlIIllIlIlllI ^ llllllllllllIlllIlIIlIIllIlIlIlI[llllllllllllIlllIlIIlIIllIlIlIIl % llllllllllllIlllIlIIlIIllIlIlIlI.length]));
            "".length();
            ++llllllllllllIlllIlIIlIIllIlIlIIl;
            ++llllllllllllIlllIlIIlIIllIlIIIIl;
            "".length();
            if (((0x55 ^ 0x71 ^ (0x2B ^ 0x3F)) & (0xE5 ^ 0x93 ^ (0xF8 ^ 0xBE) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIlIIllIlIlIll);
    }
    
    ScheduledFutureTask(final EventExecutor llllllllllllIlllIlIIlIIlllllllIl, final Queue<ScheduledFutureTask<?>> llllllllllllIlllIlIIlIIlllllllII, final Callable<V> llllllllllllIlllIlIIlIIllllllIll, final long llllllllllllIlllIlIIlIIllllllIlI) {
        super(llllllllllllIlllIlIIlIIlllllllIl, llllllllllllIlllIlIIlIIllllllIll);
        this.id = ScheduledFutureTask.nextTaskId.getAndIncrement();
        this.delayedTaskQueue = llllllllllllIlllIlIIlIIlllllllII;
        this.deadlineNanos = llllllllllllIlllIlIIlIIllllllIlI;
        this.periodNanos = 0L;
    }
    
    private static boolean lIIIlIlIIllIllll(final int llllllllllllIlllIlIIlIIllIIlIIlI) {
        return llllllllllllIlllIlIIlIIllIIlIIlI < 0;
    }
    
    public long deadlineNanos() {
        return this.deadlineNanos;
    }
    
    @Override
    public int compareTo(final Delayed llllllllllllIlllIlIIlIIlllIllIll) {
        if (lIIIlIlIIllIlllI(this, llllllllllllIlllIlIIlIIlllIllIll)) {
            return ScheduledFutureTask.llIIIllIlIlIII[0];
        }
        final ScheduledFutureTask<?> llllllllllllIlllIlIIlIIlllIllllI = (ScheduledFutureTask<?>)llllllllllllIlllIlIIlIIlllIllIll;
        final long llllllllllllIlllIlIIlIIlllIlllIl = this.deadlineNanos() - llllllllllllIlllIlIIlIIlllIllllI.deadlineNanos();
        if (lIIIlIlIIllIllll(lIIIlIlIIllIllIl(llllllllllllIlllIlIIlIIlllIlllIl, 0L))) {
            return ScheduledFutureTask.llIIIllIlIlIII[1];
        }
        if (lIIIlIlIIlllIIII(lIIIlIlIIllIllIl(llllllllllllIlllIlIIlIIlllIlllIl, 0L))) {
            return ScheduledFutureTask.llIIIllIlIlIII[2];
        }
        if (lIIIlIlIIllIllll(lIIIlIlIIllIllIl(this.id, llllllllllllIlllIlIIlIIlllIllllI.id))) {
            return ScheduledFutureTask.llIIIllIlIlIII[1];
        }
        if (lIIIlIlIIllIllII(lIIIlIlIIllIllIl(this.id, llllllllllllIlllIlIIlIIlllIllllI.id))) {
            throw new Error();
        }
        return ScheduledFutureTask.llIIIllIlIlIII[2];
    }
    
    static long deadlineNanos(final long llllllllllllIlllIlIIlIlIIIlIlllI) {
        return nanoTime() + llllllllllllIlllIlIIlIlIIIlIlllI;
    }
    
    private static boolean lIIIlIlIIllIlllI(final Object llllllllllllIlllIlIIlIIllIIllIIl, final Object llllllllllllIlllIlIIlIIllIIllIII) {
        return llllllllllllIlllIlIIlIIllIIllIIl == llllllllllllIlllIlIIlIIllIIllIII;
    }
    
    private static boolean lIIIlIlIIlllIIlI(final int llllllllllllIlllIlIIlIIllIIlIllI) {
        return llllllllllllIlllIlIIlIIllIIlIllI != 0;
    }
    
    public long delayNanos(final long llllllllllllIlllIlIIlIIllllIlIll) {
        return Math.max(0L, this.deadlineNanos() - (llllllllllllIlllIlIIlIIllllIlIll - ScheduledFutureTask.START_TIME));
    }
    
    private static void lIIIlIlIIllIIIIl() {
        (llIIIllIlIIIll = new String[ScheduledFutureTask.llIIIllIlIlIII[7]])[ScheduledFutureTask.llIIIllIlIlIII[0]] = lIIIlIlIIlIlllIl("OSQdOzgte09id2EkFyIyKjUKNm1pYFJyZ2A=", "IAoRW");
        ScheduledFutureTask.llIIIllIlIIIll[ScheduledFutureTask.llIIIllIlIlIII[2]] = lIIIlIlIIlIllllI("n/IJXJ6mJec=", "iDZan");
        ScheduledFutureTask.llIIIllIlIIIll[ScheduledFutureTask.llIIIllIlIlIII[4]] = lIIIlIlIIlIlllIl("e1o2LgUzFjslAW1a", "WzRKd");
        ScheduledFutureTask.llIIIllIlIIIll[ScheduledFutureTask.llIIIllIlIlIII[5]] = lIIIlIlIIlIllllI("vVRt7YFJI6XillHY4sIRiA==", "NgWSx");
    }
    
    static {
        lIIIlIlIIllIlIlI();
        lIIIlIlIIllIIIIl();
        int $assertionsDisabled2;
        if (lIIIlIlIIllIllII(ScheduledFutureTask.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = ScheduledFutureTask.llIIIllIlIlIII[2];
            "".length();
            if ((0xE4 ^ 0xAA ^ (0x15 ^ 0x5F)) == 0x0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = ScheduledFutureTask.llIIIllIlIlIII[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        nextTaskId = new AtomicLong();
        START_TIME = System.nanoTime();
    }
    
    static long nanoTime() {
        return System.nanoTime() - ScheduledFutureTask.START_TIME;
    }
    
    ScheduledFutureTask(final EventExecutor llllllllllllIlllIlIIlIlIIIIIllIl, final Queue<ScheduledFutureTask<?>> llllllllllllIlllIlIIlIlIIIIIllII, final Callable<V> llllllllllllIlllIlIIlIlIIIIlIIIl, final long llllllllllllIlllIlIIlIlIIIIlIIII, final long llllllllllllIlllIlIIlIlIIIIIllll) {
        super(llllllllllllIlllIlIIlIlIIIIIllIl, llllllllllllIlllIlIIlIlIIIIlIIIl);
        this.id = ScheduledFutureTask.nextTaskId.getAndIncrement();
        if (lIIIlIlIIllIllII(lIIIlIlIIllIlIll(llllllllllllIlllIlIIlIlIIIIIllll, 0L))) {
            throw new IllegalArgumentException(ScheduledFutureTask.llIIIllIlIIIll[ScheduledFutureTask.llIIIllIlIlIII[0]]);
        }
        this.delayedTaskQueue = llllllllllllIlllIlIIlIlIIIIIllII;
        this.deadlineNanos = llllllllllllIlllIlIIlIlIIIIlIIII;
        this.periodNanos = llllllllllllIlllIlIIlIlIIIIIllll;
    }
    
    private static void lIIIlIlIIllIlIlI() {
        (llIIIllIlIlIII = new int[8])[0] = ((0x81 ^ 0xA8) & ~(0x7D ^ 0x54));
        ScheduledFutureTask.llIIIllIlIlIII[1] = -" ".length();
        ScheduledFutureTask.llIIIllIlIlIII[2] = " ".length();
        ScheduledFutureTask.llIIIllIlIlIII[3] = (149 + 166 - 161 + 34 ^ 65 + 134 - 185 + 130);
        ScheduledFutureTask.llIIIllIlIlIII[4] = "  ".length();
        ScheduledFutureTask.llIIIllIlIlIII[5] = "   ".length();
        ScheduledFutureTask.llIIIllIlIlIII[6] = (123 + 45 - 86 + 60 ^ 0 + 121 + 26 + 20);
        ScheduledFutureTask.llIIIllIlIlIII[7] = (0xAF ^ 0xAB);
    }
    
    private static int lIIIlIlIIllIlIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
}
