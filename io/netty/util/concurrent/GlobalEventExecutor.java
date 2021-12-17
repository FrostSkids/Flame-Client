// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Iterator;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.PriorityQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.Queue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.BlockingQueue;
import io.netty.util.internal.logging.InternalLogger;

public final class GlobalEventExecutor extends AbstractEventExecutor
{
    private static final /* synthetic */ int[] lllIIllllIIlII;
    private final /* synthetic */ TaskRunner taskRunner;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ long SCHEDULE_PURGE_INTERVAL;
    final /* synthetic */ BlockingQueue<Runnable> taskQueue;
    private final /* synthetic */ AtomicBoolean started;
    private final /* synthetic */ ThreadFactory threadFactory;
    final /* synthetic */ Queue<ScheduledFutureTask<?>> delayedTaskQueue;
    private final /* synthetic */ Future<?> terminationFuture;
    private static final /* synthetic */ String[] lllIIllllIIIIl;
    final /* synthetic */ ScheduledFutureTask<Void> purgeTask;
    volatile /* synthetic */ Thread thread;
    
    private static int lIlIIIIIlllIIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public Future<?> shutdownGracefully(final long llllllllllllIlIlllIllIIlIIIlIlll, final long llllllllllllIlIlllIllIIlIIIlIllI, final TimeUnit llllllllllllIlIlllIllIIlIIIlIlIl) {
        return this.terminationFuture();
    }
    
    @Override
    public <V> ScheduledFuture<V> schedule(final Callable<V> llllllllllllIlIlllIllIIIlllIIllI, final long llllllllllllIlIlllIllIIIlllIIlIl, final TimeUnit llllllllllllIlIlllIllIIIlllIIlII) {
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIlllIIllI)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[7]]);
        }
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIlllIIlII)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[8]]);
        }
        if (lIlIIIIIlllIIIll(lIlIIIIIlllIIlII(llllllllllllIlIlllIllIIIlllIIlIl, 0L))) {
            final String format = GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[9]];
            final Object[] args = new Object[GlobalEventExecutor.lllIIllllIIlII[1]];
            args[GlobalEventExecutor.lllIIllllIIlII[0]] = llllllllllllIlIlllIllIIIlllIIlIl;
            throw new IllegalArgumentException(String.format(format, args));
        }
        return this.schedule(new ScheduledFutureTask<V>(this, this.delayedTaskQueue, llllllllllllIlIlllIllIIIlllIIllI, ScheduledFutureTask.deadlineNanos(llllllllllllIlIlllIllIIIlllIIlII.toNanos(llllllllllllIlIlllIllIIIlllIIlIl))));
    }
    
    public boolean awaitInactivity(final long llllllllllllIlIlllIllIIlIIIIIlII, final TimeUnit llllllllllllIlIlllIllIIIllllllll) throws InterruptedException {
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIllllllll)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[1]]);
        }
        final Thread llllllllllllIlIlllIllIIlIIIIIIlI = this.thread;
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIlIIIIIIlI)) {
            throw new IllegalStateException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[2]]);
        }
        llllllllllllIlIlllIllIIlIIIIIIlI.join(llllllllllllIlIlllIllIIIllllllll.toMillis(llllllllllllIlIlllIllIIlIIIIIlII));
        int n;
        if (lIlIIIIIllIlllll(llllllllllllIlIlllIllIIlIIIIIIlI.isAlive() ? 1 : 0)) {
            n = GlobalEventExecutor.lllIIllllIIlII[1];
            "".length();
            if (-(0x36 ^ 0x32) > 0) {
                return ((0xBF ^ 0x86) & ~(0x8 ^ 0x31)) != 0x0;
            }
        }
        else {
            n = GlobalEventExecutor.lllIIllllIIlII[0];
        }
        return n != 0;
    }
    
    @Override
    public ScheduledFuture<?> schedule(final Runnable llllllllllllIlIlllIllIIIlllIlllI, final long llllllllllllIlIlllIllIIIlllIllIl, final TimeUnit llllllllllllIlIlllIllIIIlllIllII) {
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIlllIlllI)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[4]]);
        }
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIlllIllII)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[5]]);
        }
        if (lIlIIIIIlllIIIll(lIlIIIIIlllIIIlI(llllllllllllIlIlllIllIIIlllIllIl, 0L))) {
            final String format = GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[6]];
            final Object[] args = new Object[GlobalEventExecutor.lllIIllllIIlII[1]];
            args[GlobalEventExecutor.lllIIllllIIlII[0]] = llllllllllllIlIlllIllIIIlllIllIl;
            throw new IllegalArgumentException(String.format(format, args));
        }
        return this.schedule((ScheduledFutureTask<?>)new ScheduledFutureTask<Object>(this, this.delayedTaskQueue, llllllllllllIlIlllIllIIIlllIlllI, null, ScheduledFutureTask.deadlineNanos(llllllllllllIlIlllIllIIIlllIllII.toNanos(llllllllllllIlIlllIllIIIlllIllIl))));
    }
    
    private static boolean lIlIIIIIlllIIlll(final int llllllllllllIlIlllIllIIIIIllllIl) {
        return llllllllllllIlIlllIllIIIIIllllIl != 0;
    }
    
    private static boolean lIlIIIIIlllIIIll(final int llllllllllllIlIlllIllIIIIIlllIIl) {
        return llllllllllllIlIlllIllIIIIIlllIIl < 0;
    }
    
    private static void lIlIIIIIllIlIlII() {
        (lllIIllllIIIIl = new String[GlobalEventExecutor.lllIIllllIIlII[19]])[GlobalEventExecutor.lllIIllllIIlII[0]] = lIlIIIIIllIIlIll("CwnPD6XaFbU=", "xfyci");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[1]] = lIlIIIIIllIIllII("oCOakqKxa1s=", "tKtgc");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[2]] = lIlIIIIIllIIllII("Z98XyKuVjQmeK221CVWBkDcusYIiHJwc", "pklsM");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[3]] = lIlIIIIIllIIllII("1NYwl/qPIm8=", "CufoI");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[4]] = lIlIIIIIllIIllII("Go+AqHUpmZk=", "DoVJy");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[5]] = lIlIIIIIllIIlIll("aCSEdTbLE5s=", "zOONR");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[6]] = lIlIIIIIllIIllII("PcCa79avUu3zcLb66f47zmfr7lem4Vj7PruOmCb2XM4=", "OJcVy");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[7]] = lIlIIIIIllIlIIll("LREqOCIsHCM=", "NpFTC");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[8]] = lIlIIIIIllIlIIll("DRwEHA==", "xrmhV");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[9]] = lIlIIIIIllIIlIll("a/qsXv1sML+NRN8F7WB3mfZgBoaYNEMExWqXc726qfM=", "XPmPy");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[10]] = lIlIIIIIllIIlIll("WuSZ+umYNmI=", "XRRZi");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[11]] = lIlIIIIIllIIlIll("0/iQuMsJQS8=", "BmEpA");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[12]] = lIlIIIIIllIIlIll("u6BklwfPpfhu8US1/UcoKZz51db9NizJyriwNQ5O4b4PfCc87cqvFw==", "ZiOlg");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[13]] = lIlIIIIIllIlIIll("CRQAKCIdS1JkKVlZFzk9HBIGJClDUUxhfVA=", "yqrAM");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[14]] = lIlIIIIIllIlIIll("Ih8qBCAvFA==", "ApGiA");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[15]] = lIlIIIIIllIIlIll("QBPzVPf1AJU=", "AArtB");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[16]] = lIlIIIIIllIIllII("nFYY4so40aqAwvPtH3nj3uZwTGP7Ukf83e+wpWTl+8qQWNUQpjzFxg==", "WdESs");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[17]] = lIlIIIIIllIlIIll("KB8+LhB2WncrSWQfKj8MLw43K1NsRHJ/QA==", "LzROi");
        GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[18]] = lIlIIIIIllIIllII("k2RJfMpw7EY=", "jCHCj");
    }
    
    private void addTask(final Runnable llllllllllllIlIlllIllIIlIIlIIIlI) {
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIlIIlIIIlI)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[0]]);
        }
        this.taskQueue.add(llllllllllllIlIlllIllIIlIIlIIIlI);
        "".length();
    }
    
    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable llllllllllllIlIlllIllIIIllIlIlII, final long llllllllllllIlIlllIllIIIllIlIIll, final long llllllllllllIlIlllIllIIIllIlIlll, final TimeUnit llllllllllllIlIlllIllIIIllIlIIIl) {
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIllIlIlII)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[10]]);
        }
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIllIlIIIl)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[11]]);
        }
        if (lIlIIIIIlllIIIll(lIlIIIIIlllIIlIl(llllllllllllIlIlllIllIIIllIlIIll, 0L))) {
            final String format = GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[12]];
            final Object[] args = new Object[GlobalEventExecutor.lllIIllllIIlII[1]];
            args[GlobalEventExecutor.lllIIllllIIlII[0]] = llllllllllllIlIlllIllIIIllIlIIll;
            throw new IllegalArgumentException(String.format(format, args));
        }
        if (lIlIIIIIlllIIIII(lIlIIIIIlllIIlIl(llllllllllllIlIlllIllIIIllIlIlll, 0L))) {
            final String format2 = GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[13]];
            final Object[] args2 = new Object[GlobalEventExecutor.lllIIllllIIlII[1]];
            args2[GlobalEventExecutor.lllIIllllIIlII[0]] = llllllllllllIlIlllIllIIIllIlIlll;
            throw new IllegalArgumentException(String.format(format2, args2));
        }
        return this.schedule((ScheduledFutureTask<?>)new ScheduledFutureTask<Object>(this, this.delayedTaskQueue, Executors.callable(llllllllllllIlIlllIllIIIllIlIlII, (V)null), ScheduledFutureTask.deadlineNanos(llllllllllllIlIlllIllIIIllIlIIIl.toNanos(llllllllllllIlIlllIllIIIllIlIIll)), llllllllllllIlIlllIllIIIllIlIIIl.toNanos(llllllllllllIlIlllIllIIIllIlIlll)));
    }
    
    private void fetchFromDelayedQueue() {
        long llllllllllllIlIlllIllIIlIIlIllII = 0L;
        do {
            final ScheduledFutureTask<?> llllllllllllIlIlllIllIIlIIlIlllI = this.delayedTaskQueue.peek();
            if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIlIIlIlllI)) {
                "".length();
                if (-(0x2B ^ 0x6E ^ (0xFF ^ 0xBF)) >= 0) {
                    return;
                }
            }
            else {
                if (lIlIIIIIllIlllll(lIlIIIIIllIllllI(llllllllllllIlIlllIllIIlIIlIllII, 0L))) {
                    llllllllllllIlIlllIllIIlIIlIllII = ScheduledFutureTask.nanoTime();
                }
                if (lIlIIIIIlllIIIII(lIlIIIIIllIllllI(llllllllllllIlIlllIllIIlIIlIlllI.deadlineNanos(), llllllllllllIlIlllIllIIlIIlIllII))) {
                    this.delayedTaskQueue.remove();
                    "".length();
                    this.taskQueue.add(llllllllllllIlIlllIllIIlIIlIlllI);
                    "".length();
                    "".length();
                    continue;
                }
            }
        } while (" ".length() != -" ".length());
    }
    
    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable llllllllllllIlIlllIllIIIllIIlIlI, final long llllllllllllIlIlllIllIIIllIIIlII, final long llllllllllllIlIlllIllIIIllIIIIll, final TimeUnit llllllllllllIlIlllIllIIIllIIIlll) {
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIllIIlIlI)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[14]]);
        }
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIllIIIlll)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[15]]);
        }
        if (lIlIIIIIlllIIIll(lIlIIIIIlllIIllI(llllllllllllIlIlllIllIIIllIIIlII, 0L))) {
            final String format = GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[16]];
            final Object[] args = new Object[GlobalEventExecutor.lllIIllllIIlII[1]];
            args[GlobalEventExecutor.lllIIllllIIlII[0]] = llllllllllllIlIlllIllIIIllIIIlII;
            throw new IllegalArgumentException(String.format(format, args));
        }
        if (lIlIIIIIlllIIIII(lIlIIIIIlllIIllI(llllllllllllIlIlllIllIIIllIIIIll, 0L))) {
            final String format2 = GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[17]];
            final Object[] args2 = new Object[GlobalEventExecutor.lllIIllllIIlII[1]];
            args2[GlobalEventExecutor.lllIIllllIIlII[0]] = llllllllllllIlIlllIllIIIllIIIIll;
            throw new IllegalArgumentException(String.format(format2, args2));
        }
        return this.schedule((ScheduledFutureTask<?>)new ScheduledFutureTask<Object>(this, this.delayedTaskQueue, Executors.callable(llllllllllllIlIlllIllIIIllIIlIlI, (V)null), ScheduledFutureTask.deadlineNanos(llllllllllllIlIlllIllIIIllIIIlll.toNanos(llllllllllllIlIlllIllIIIllIIIlII)), -llllllllllllIlIlllIllIIIllIIIlll.toNanos(llllllllllllIlIlllIllIIIllIIIIll)));
    }
    
    private static boolean lIlIIIIIlllIIIII(final int llllllllllllIlIlllIllIIIIIllIlll) {
        return llllllllllllIlIlllIllIIIIIllIlll <= 0;
    }
    
    private static boolean lIlIIIIIlllIIIIl(final Object llllllllllllIlIlllIllIIIIlIIIIlI, final Object llllllllllllIlIlllIllIIIIlIIIIIl) {
        return llllllllllllIlIlllIllIIIIlIIIIlI == llllllllllllIlIlllIllIIIIlIIIIIl;
    }
    
    @Override
    public boolean isTerminated() {
        return GlobalEventExecutor.lllIIllllIIlII[0] != 0;
    }
    
    public int pendingTasks() {
        return this.taskQueue.size();
    }
    
    private static boolean lIlIIIIIlllIlIII(final int llllllllllllIlIlllIllIIIIlIIlIII, final int llllllllllllIlIlllIllIIIIlIIIlll) {
        return llllllllllllIlIlllIllIIIIlIIlIII < llllllllllllIlIlllIllIIIIlIIIlll;
    }
    
    private static String lIlIIIIIllIlIIll(String llllllllllllIlIlllIllIIIIllIllIl, final String llllllllllllIlIlllIllIIIIllIllII) {
        llllllllllllIlIlllIllIIIIllIllIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllIllIIIIllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIllIIIIlllIIII = new StringBuilder();
        final char[] llllllllllllIlIlllIllIIIIllIllll = llllllllllllIlIlllIllIIIIllIllII.toCharArray();
        int llllllllllllIlIlllIllIIIIllIlllI = GlobalEventExecutor.lllIIllllIIlII[0];
        final char llllllllllllIlIlllIllIIIIllIlIII = (Object)llllllllllllIlIlllIllIIIIllIllIl.toCharArray();
        final double llllllllllllIlIlllIllIIIIllIIlll = llllllllllllIlIlllIllIIIIllIlIII.length;
        boolean llllllllllllIlIlllIllIIIIllIIllI = GlobalEventExecutor.lllIIllllIIlII[0] != 0;
        while (lIlIIIIIlllIlIII(llllllllllllIlIlllIllIIIIllIIllI ? 1 : 0, (int)llllllllllllIlIlllIllIIIIllIIlll)) {
            final char llllllllllllIlIlllIllIIIIlllIIll = llllllllllllIlIlllIllIIIIllIlIII[llllllllllllIlIlllIllIIIIllIIllI];
            llllllllllllIlIlllIllIIIIlllIIII.append((char)(llllllllllllIlIlllIllIIIIlllIIll ^ llllllllllllIlIlllIllIIIIllIllll[llllllllllllIlIlllIllIIIIllIlllI % llllllllllllIlIlllIllIIIIllIllll.length]));
            "".length();
            ++llllllllllllIlIlllIllIIIIllIlllI;
            ++llllllllllllIlIlllIllIIIIllIIllI;
            "".length();
            if ((0x9F ^ 0xBF ^ (0xB7 ^ 0x93)) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIllIIIIlllIIII);
    }
    
    private static int lIlIIIIIllIllllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lIlIIIIIlllIIIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public EventExecutorGroup parent() {
        return null;
    }
    
    private GlobalEventExecutor() {
        this.taskQueue = new LinkedBlockingQueue<Runnable>();
        this.delayedTaskQueue = new PriorityQueue<ScheduledFutureTask<?>>();
        this.purgeTask = new ScheduledFutureTask<Void>(this, this.delayedTaskQueue, Executors.callable(new PurgeTask(), (Void)null), ScheduledFutureTask.deadlineNanos(GlobalEventExecutor.SCHEDULE_PURGE_INTERVAL), -GlobalEventExecutor.SCHEDULE_PURGE_INTERVAL);
        this.threadFactory = new DefaultThreadFactory(this.getClass());
        this.taskRunner = new TaskRunner();
        this.started = new AtomicBoolean();
        this.terminationFuture = new FailedFuture<Object>(this, new UnsupportedOperationException());
        this.delayedTaskQueue.add(this.purgeTask);
        "".length();
    }
    
    Runnable takeTask() {
        final BlockingQueue<Runnable> llllllllllllIlIlllIllIIlIIlllIIl = this.taskQueue;
        do {
            final ScheduledFutureTask<?> llllllllllllIlIlllIllIIlIIlllIll = this.delayedTaskQueue.peek();
            if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIlIIlllIll)) {
                Runnable llllllllllllIlIlllIllIIlIIllllll = null;
                try {
                    llllllllllllIlIlllIllIIlIIllllll = llllllllllllIlIlllIllIIlIIlllIIl.take();
                    "".length();
                    if (((0x35 ^ 0x55 ^ (0xFB ^ 0xB4)) & (("  ".length() & ~"  ".length()) ^ (0x1 ^ 0x2E) ^ -" ".length())) == "   ".length()) {
                        return null;
                    }
                }
                catch (InterruptedException ex) {}
                return llllllllllllIlIlllIllIIlIIllllll;
            }
            final long llllllllllllIlIlllIllIIlIIllllIl = llllllllllllIlIlllIllIIlIIlllIll.delayNanos();
            Runnable llllllllllllIlIlllIllIIlIIllllII = null;
            Label_0188: {
                if (lIlIIIIIllIlllII(lIlIIIIIllIllIlI(llllllllllllIlIlllIllIIlIIllllIl, 0L))) {
                    try {
                        llllllllllllIlIlllIllIIlIIllllII = llllllllllllIlIlllIllIIlIIlllIIl.poll(llllllllllllIlIlllIllIIlIIllllIl, TimeUnit.NANOSECONDS);
                        "".length();
                        if (((0x2A ^ 0x23 ^ (0x47 ^ 0x51)) & (0x5D ^ 0x79 ^ (0x21 ^ 0x1A) ^ -" ".length())) != 0x0) {
                            return null;
                        }
                        break Label_0188;
                    }
                    catch (InterruptedException llllllllllllIlIlllIllIIlIIlllllI) {
                        return null;
                    }
                }
                llllllllllllIlIlllIllIIlIIllllII = llllllllllllIlIlllIllIIlIIlllIIl.poll();
            }
            if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIlIIllllII)) {
                this.fetchFromDelayedQueue();
                llllllllllllIlIlllIllIIlIIllllII = llllllllllllIlIlllIllIIlIIlllIIl.poll();
            }
            if (lIlIIIIIllIlllIl(llllllllllllIlIlllIllIIlIIllllII)) {
                return llllllllllllIlIlllIllIIlIIllllII;
            }
            "".length();
        } while (-" ".length() != " ".length());
        return null;
    }
    
    private static String lIlIIIIIllIIllII(final String llllllllllllIlIlllIllIIIIlIlIIII, final String llllllllllllIlIlllIllIIIIlIIllll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIIIIlIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIIIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIllIIIIlIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIllIIIIlIlIIlI.init(GlobalEventExecutor.lllIIllllIIlII[2], llllllllllllIlIlllIllIIIIlIlIIll);
            return new String(llllllllllllIlIlllIllIIIIlIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIIIIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIIIIlIlIIIl) {
            llllllllllllIlIlllIllIIIIlIlIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isShutdown() {
        return GlobalEventExecutor.lllIIllllIIlII[0] != 0;
    }
    
    private static int lIlIIIIIllIllIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public boolean isShuttingDown() {
        return GlobalEventExecutor.lllIIllllIIlII[0] != 0;
    }
    
    private static boolean lIlIIIIIllIllIll(final Object llllllllllllIlIlllIllIIIIIllllll) {
        return llllllllllllIlIlllIllIIIIIllllll == null;
    }
    
    private static boolean lIlIIIIIllIlllll(final int llllllllllllIlIlllIllIIIIIlllIll) {
        return llllllllllllIlIlllIllIIIIIlllIll == 0;
    }
    
    private static boolean lIlIIIIIllIlllII(final int llllllllllllIlIlllIllIIIIIllIlIl) {
        return llllllllllllIlIlllIllIIIIIllIlIl > 0;
    }
    
    @Override
    public Future<?> terminationFuture() {
        return this.terminationFuture;
    }
    
    private static void lIlIIIIIllIllIIl() {
        (lllIIllllIIlII = new int[20])[0] = ((0x9F ^ 0x87 ^ (0x7 ^ 0x1)) & (0xE6 ^ 0xB3 ^ (0xE ^ 0x45) ^ -" ".length()));
        GlobalEventExecutor.lllIIllllIIlII[1] = " ".length();
        GlobalEventExecutor.lllIIllllIIlII[2] = "  ".length();
        GlobalEventExecutor.lllIIllllIIlII[3] = "   ".length();
        GlobalEventExecutor.lllIIllllIIlII[4] = (0x41 ^ 0x45);
        GlobalEventExecutor.lllIIllllIIlII[5] = (0x55 ^ 0x50);
        GlobalEventExecutor.lllIIllllIIlII[6] = (0xE9 ^ 0x84 ^ (0xF2 ^ 0x99));
        GlobalEventExecutor.lllIIllllIIlII[7] = (0x67 ^ 0x60);
        GlobalEventExecutor.lllIIllllIIlII[8] = (0x14 ^ 0x69 ^ (0x76 ^ 0x3));
        GlobalEventExecutor.lllIIllllIIlII[9] = (0x94 ^ 0x9D);
        GlobalEventExecutor.lllIIllllIIlII[10] = (0xC ^ 0x6);
        GlobalEventExecutor.lllIIllllIIlII[11] = (0x9C ^ 0x97);
        GlobalEventExecutor.lllIIllllIIlII[12] = (0x34 ^ 0x38);
        GlobalEventExecutor.lllIIllllIIlII[13] = (136 + 52 - 40 + 1 ^ 84 + 134 - 117 + 51);
        GlobalEventExecutor.lllIIllllIIlII[14] = (0x14 ^ 0x1A);
        GlobalEventExecutor.lllIIllllIIlII[15] = (5 + 21 + 11 + 93 ^ 36 + 31 - 4 + 78);
        GlobalEventExecutor.lllIIllllIIlII[16] = (0x34 ^ 0x24);
        GlobalEventExecutor.lllIIllllIIlII[17] = (0x72 ^ 0x1E ^ (0xBA ^ 0xC7));
        GlobalEventExecutor.lllIIllllIIlII[18] = (0x9F ^ 0x8D);
        GlobalEventExecutor.lllIIllllIIlII[19] = (0x41 ^ 0x52);
    }
    
    @Override
    public void execute(final Runnable llllllllllllIlIlllIllIIIlllllIlI) {
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIlllllIlI)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[3]]);
        }
        this.addTask(llllllllllllIlIlllIllIIIlllllIlI);
        if (lIlIIIIIllIlllll(this.inEventLoop() ? 1 : 0)) {
            this.startThread();
        }
    }
    
    @Override
    public boolean inEventLoop(final Thread llllllllllllIlIlllIllIIlIIIlllII) {
        int n;
        if (lIlIIIIIlllIIIIl(llllllllllllIlIlllIllIIlIIIlllII, this.thread)) {
            n = GlobalEventExecutor.lllIIllllIIlII[1];
            "".length();
            if (-(0xD ^ 0x78 ^ (0x13 ^ 0x62)) >= 0) {
                return ((132 + 6 + 75 + 34 ^ 197 + 178 - 290 + 113) & (155 + 59 - 35 + 7 ^ 10 + 87 + 20 + 22 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = GlobalEventExecutor.lllIIllllIIlII[0];
        }
        return n != 0;
    }
    
    private static String lIlIIIIIllIIlIll(final String llllllllllllIlIlllIllIIIIlIllIll, final String llllllllllllIlIlllIllIIIIlIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIIIIllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), GlobalEventExecutor.lllIIllllIIlII[8]), "DES");
            final Cipher llllllllllllIlIlllIllIIIIlIlllll = Cipher.getInstance("DES");
            llllllllllllIlIlllIllIIIIlIlllll.init(GlobalEventExecutor.lllIIllllIIlII[2], llllllllllllIlIlllIllIIIIllIIIII);
            return new String(llllllllllllIlIlllIllIIIIlIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIIIIlIllllI) {
            llllllllllllIlIlllIllIIIIlIllllI.printStackTrace();
            return null;
        }
    }
    
    @Deprecated
    @Override
    public void shutdown() {
        throw new UnsupportedOperationException();
    }
    
    private void startThread() {
        if (lIlIIIIIlllIIlll(this.started.compareAndSet((boolean)(GlobalEventExecutor.lllIIllllIIlII[0] != 0), (boolean)(GlobalEventExecutor.lllIIllllIIlII[1] != 0)) ? 1 : 0)) {
            final Thread llllllllllllIlIlllIllIIIlIlllIIl = this.threadFactory.newThread(this.taskRunner);
            llllllllllllIlIlllIllIIIlIlllIIl.start();
            this.thread = llllllllllllIlIlllIllIIIlIlllIIl;
        }
    }
    
    static {
        lIlIIIIIllIllIIl();
        lIlIIIIIllIlIlII();
        logger = InternalLoggerFactory.getInstance(GlobalEventExecutor.class);
        SCHEDULE_PURGE_INTERVAL = TimeUnit.SECONDS.toNanos(1L);
        INSTANCE = new GlobalEventExecutor();
    }
    
    private static int lIlIIIIIlllIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private <V> ScheduledFuture<V> schedule(final ScheduledFutureTask<V> llllllllllllIlIlllIllIIIlIlllllI) {
        if (lIlIIIIIllIllIll(llllllllllllIlIlllIllIIIlIlllllI)) {
            throw new NullPointerException(GlobalEventExecutor.lllIIllllIIIIl[GlobalEventExecutor.lllIIllllIIlII[18]]);
        }
        if (lIlIIIIIlllIIlll(this.inEventLoop() ? 1 : 0)) {
            this.delayedTaskQueue.add(llllllllllllIlIlllIllIIIlIlllllI);
            "".length();
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        else {
            this.execute(new Runnable() {
                @Override
                public void run() {
                    GlobalEventExecutor.this.delayedTaskQueue.add(llllllllllllIlIlllIllIIIlIlllllI);
                    "".length();
                }
            });
        }
        return llllllllllllIlIlllIllIIIlIlllllI;
    }
    
    @Override
    public boolean awaitTermination(final long llllllllllllIlIlllIllIIlIIIIlIll, final TimeUnit llllllllllllIlIlllIllIIlIIIIlIlI) {
        return GlobalEventExecutor.lllIIllllIIlII[0] != 0;
    }
    
    private static int lIlIIIIIlllIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlIIIIIllIlllIl(final Object llllllllllllIlIlllIllIIIIlIIIlIl) {
        return llllllllllllIlIlllIllIIIIlIIIlIl != null;
    }
    
    final class TaskRunner implements Runnable
    {
        private static final /* synthetic */ String[] lIIllIlIIIIlII;
        private static final /* synthetic */ int[] lIIllIlIIIIlIl;
        static final /* synthetic */ boolean $assertionsDisabled;
        
        private static boolean llIllIIIIIllIll(final Object lllllllllllllIIlIlIllIllIIIIIIII) {
            return lllllllllllllIIlIlIllIllIIIIIIII != null;
        }
        
        private static void llIllIIIIIllIIl() {
            (lIIllIlIIIIlII = new String[TaskRunner.lIIllIlIIIIlIl[1]])[TaskRunner.lIIllIlIIIIlIl[0]] = llIllIIIIIllIII("5pK5rWvRTERBQdsTETLtiH+1c6x4ZpDFgKYM944Ns1nnVlJEc53rZAy3bGzRizkSl8BOcbohacI=", "AfYKB");
        }
        
        static {
            llIllIIIIIllIlI();
            llIllIIIIIllIIl();
            int $assertionsDisabled2;
            if (llIllIIIIIlllll(GlobalEventExecutor.class.desiredAssertionStatus() ? 1 : 0)) {
                $assertionsDisabled2 = TaskRunner.lIIllIlIIIIlIl[1];
                "".length();
                if ("   ".length() == ((0x1E ^ 0x47 ^ (0x1A ^ 0x51)) & (0xB1 ^ 0xB7 ^ (0x84 ^ 0x90) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                $assertionsDisabled2 = TaskRunner.lIIllIlIIIIlIl[0];
            }
            $assertionsDisabled = ($assertionsDisabled2 != 0);
        }
        
        private static void llIllIIIIIllIlI() {
            (lIIllIlIIIIlIl = new int[4])[0] = ((0x44 ^ 0x0) & ~(0x28 ^ 0x6C));
            TaskRunner.lIIllIlIIIIlIl[1] = " ".length();
            TaskRunner.lIIllIlIIIIlIl[2] = (0x35 ^ 0x4B ^ (0x49 ^ 0x3F));
            TaskRunner.lIIllIlIIIIlIl[3] = "  ".length();
        }
        
        private static String llIllIIIIIllIII(final String lllllllllllllIIlIlIllIllIIIIllIl, final String lllllllllllllIIlIlIllIllIIIIllII) {
            try {
                final SecretKeySpec lllllllllllllIIlIlIllIllIIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllIllIIIIllII.getBytes(StandardCharsets.UTF_8)), TaskRunner.lIIllIlIIIIlIl[2]), "DES");
                final Cipher lllllllllllllIIlIlIllIllIIIlIIIl = Cipher.getInstance("DES");
                lllllllllllllIIlIlIllIllIIIlIIIl.init(TaskRunner.lIIllIlIIIIlIl[3], lllllllllllllIIlIlIllIllIIIlIIlI);
                return new String(lllllllllllllIIlIlIllIllIIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllIllIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIlIllIllIIIlIIII) {
                lllllllllllllIIlIlIllIllIIIlIIII.printStackTrace();
                return null;
            }
        }
        
        private static boolean llIllIIIIIlllIl(final int lllllllllllllIIlIlIllIlIlllllllI) {
            return lllllllllllllIIlIlIllIlIlllllllI != 0;
        }
        
        private static boolean llIllIIIIIlllII(final Object lllllllllllllIIlIlIllIllIIIIIIll, final Object lllllllllllllIIlIlIllIllIIIIIIlI) {
            return lllllllllllllIIlIlIllIllIIIIIIll != lllllllllllllIIlIlIllIllIIIIIIlI;
        }
        
        private static boolean llIllIIIIIllllI(final int lllllllllllllIIlIlIllIllIIIIIlll, final int lllllllllllllIIlIlIllIllIIIIIllI) {
            return lllllllllllllIIlIlIllIllIIIIIlll == lllllllllllllIIlIlIllIllIIIIIllI;
        }
        
        @Override
        public void run() {
            while (true) {
                final Runnable lllllllllllllIIlIlIllIllIIIllIll = GlobalEventExecutor.this.takeTask();
                if (llIllIIIIIllIll(lllllllllllllIIlIlIllIllIIIllIll)) {
                    try {
                        lllllllllllllIIlIlIllIllIIIllIll.run();
                        "".length();
                        if (" ".length() < 0) {
                            return;
                        }
                    }
                    catch (Throwable lllllllllllllIIlIlIllIllIIIlllIl) {
                        GlobalEventExecutor.logger.warn(TaskRunner.lIIllIlIIIIlII[TaskRunner.lIIllIlIIIIlIl[0]], lllllllllllllIIlIlIllIllIIIlllIl);
                    }
                    if (llIllIIIIIlllII(lllllllllllllIIlIlIllIllIIIllIll, GlobalEventExecutor.this.purgeTask)) {
                        "".length();
                        if (-"  ".length() > 0) {
                            return;
                        }
                        continue;
                    }
                }
                if (llIllIIIIIlllIl(GlobalEventExecutor.this.taskQueue.isEmpty() ? 1 : 0) && llIllIIIIIllllI(GlobalEventExecutor.this.delayedTaskQueue.size(), TaskRunner.lIIllIlIIIIlIl[1])) {
                    final boolean lllllllllllllIIlIlIllIllIIIlllII = GlobalEventExecutor.this.started.compareAndSet((boolean)(TaskRunner.lIIllIlIIIIlIl[1] != 0), (boolean)(TaskRunner.lIIllIlIIIIlIl[0] != 0));
                    if (llIllIIIIIlllll(TaskRunner.$assertionsDisabled ? 1 : 0) && llIllIIIIIlllll(lllllllllllllIIlIlIllIllIIIlllII ? 1 : 0)) {
                        throw new AssertionError();
                    }
                    if (llIllIIIIIlllIl(GlobalEventExecutor.this.taskQueue.isEmpty() ? 1 : 0) && llIllIIIIIllllI(GlobalEventExecutor.this.delayedTaskQueue.size(), TaskRunner.lIIllIlIIIIlIl[1])) {
                        "".length();
                        if (-" ".length() > " ".length()) {
                            return;
                        }
                        break;
                    }
                    else if (llIllIIIIIlllll(GlobalEventExecutor.this.started.compareAndSet((boolean)(TaskRunner.lIIllIlIIIIlIl[0] != 0), (boolean)(TaskRunner.lIIllIlIIIIlIl[1] != 0)) ? 1 : 0)) {
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                        break;
                    }
                }
                "".length();
                if ((0x77 ^ 0x73) <= ((0x5E ^ 0x1E) & ~(0x7B ^ 0x3B))) {
                    return;
                }
            }
        }
        
        private static boolean llIllIIIIIlllll(final int lllllllllllllIIlIlIllIlIllllllII) {
            return lllllllllllllIIlIlIllIlIllllllII == 0;
        }
    }
    
    private final class PurgeTask implements Runnable
    {
        @Override
        public void run() {
            final Iterator<ScheduledFutureTask<?>> lllllllllllllIlIlIIlIIllIlIlIIlI = GlobalEventExecutor.this.delayedTaskQueue.iterator();
            while (lIllIIlIlIlIlII(lllllllllllllIlIlIIlIIllIlIlIIlI.hasNext() ? 1 : 0)) {
                final ScheduledFutureTask<?> lllllllllllllIlIlIIlIIllIlIlIlII = lllllllllllllIlIlIIlIIllIlIlIIlI.next();
                if (lIllIIlIlIlIlII(lllllllllllllIlIlIIlIIllIlIlIlII.isCancelled() ? 1 : 0)) {
                    lllllllllllllIlIlIIlIIllIlIlIIlI.remove();
                }
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        
        private static boolean lIllIIlIlIlIlII(final int lllllllllllllIlIlIIlIIllIlIIIllI) {
            return lllllllllllllIlIlIIlIIllIlIIIllI != 0;
        }
    }
}
