// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.concurrent.RejectedExecutionException;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.BlockingQueue;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.Semaphore;
import java.util.Set;
import java.util.Queue;
import io.netty.util.internal.logging.InternalLogger;

public abstract class SingleThreadEventExecutor extends AbstractEventExecutor
{
    private volatile /* synthetic */ int state;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ Runnable WAKEUP_TASK;
    final /* synthetic */ Queue<ScheduledFutureTask<?>> delayedTaskQueue;
    private final /* synthetic */ boolean addTaskWakesUp;
    private volatile /* synthetic */ long gracefulShutdownTimeout;
    private final /* synthetic */ Set<Runnable> shutdownHooks;
    private static final /* synthetic */ long SCHEDULE_PURGE_INTERVAL;
    private static final /* synthetic */ int[] lIIlIllIlIlIll;
    private static final /* synthetic */ String[] lIIlIllIlIIlIl;
    private final /* synthetic */ Semaphore threadLock;
    private final /* synthetic */ Queue<Runnable> taskQueue;
    private volatile /* synthetic */ long gracefulShutdownQuietPeriod;
    static final /* synthetic */ boolean $assertionsDisabled;
    private final /* synthetic */ Thread thread;
    private final /* synthetic */ Promise<?> terminationFuture;
    private /* synthetic */ long gracefulShutdownStartTime;
    private final /* synthetic */ EventExecutorGroup parent;
    private static final /* synthetic */ AtomicIntegerFieldUpdater<SingleThreadEventExecutor> STATE_UPDATER;
    private /* synthetic */ long lastExecutionTime;
    
    private boolean runShutdownHooks() {
        boolean lllllllllllllIIllIIIllllIIIIIllI = SingleThreadEventExecutor.lIIlIllIlIlIll[0] != 0;
        while (llIlIIlIlIllllI(this.shutdownHooks.isEmpty() ? 1 : 0)) {
            final List<Runnable> lllllllllllllIIllIIIllllIIIIlIII = new ArrayList<Runnable>(this.shutdownHooks);
            this.shutdownHooks.clear();
            final Iterator lllllllllllllIIllIIIllllIIIIlIIl = lllllllllllllIIllIIIllllIIIIlIII.iterator();
            while (llIlIIlIllIIllI(lllllllllllllIIllIIIllllIIIIlIIl.hasNext() ? 1 : 0)) {
                final Runnable lllllllllllllIIllIIIllllIIIIlIlI = lllllllllllllIIllIIIllllIIIIlIIl.next();
                try {
                    lllllllllllllIIllIIIllllIIIIlIlI.run();
                    lllllllllllllIIllIIIllllIIIIIllI = (SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0);
                    "".length();
                    if (((0x58 ^ 0x6A) & ~(0x85 ^ 0xB7)) < 0) {
                        return ((0x8A ^ 0x82) & ~(0x29 ^ 0x21)) != 0x0;
                    }
                }
                catch (Throwable lllllllllllllIIllIIIllllIIIIlIll) {
                    SingleThreadEventExecutor.logger.warn(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[5]], lllllllllllllIIllIIIllllIIIIlIll);
                    lllllllllllllIIllIIIllllIIIIIllI = (SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0);
                    "".length();
                    if ("   ".length() == (0xD ^ 0x79 ^ (0xD2 ^ 0xA2))) {
                        return ((0xDB ^ 0x90 ^ (0x15 ^ 0xB)) & (0xFA ^ 0xC4 ^ (0x72 ^ 0x19) ^ -" ".length())) != 0x0;
                    }
                }
                finally {
                    lllllllllllllIIllIIIllllIIIIIllI = (SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0);
                }
                "".length();
                if (-" ".length() >= 0) {
                    return ((0x81 ^ 0xA1) & ~(0x5D ^ 0x7D)) != 0x0;
                }
            }
            "".length();
            if (null != null) {
                return ((0xDA ^ 0x84 ^ (0x87 ^ 0x89)) & (0x3B ^ 0x6A ^ " ".length() ^ -" ".length())) != 0x0;
            }
        }
        if (llIlIIlIllIIllI(lllllllllllllIIllIIIllllIIIIIllI ? 1 : 0)) {
            this.lastExecutionTime = ScheduledFutureTask.nanoTime();
        }
        return lllllllllllllIIllIIIllllIIIIIllI;
    }
    
    @Override
    public boolean isShutdown() {
        int n;
        if (llIlIIlIlllIIII(SingleThreadEventExecutor.STATE_UPDATER.get(this), SingleThreadEventExecutor.lIIlIllIlIlIll[4])) {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[1];
            "".length();
            if (((0x10 ^ 0x4B ^ (0x37 ^ 0x2D)) & (0x34 ^ 0x7B ^ (0xB2 ^ 0xBC) ^ -" ".length()) & (((0x54 ^ 0x5D ^ (0x6C ^ 0x7C)) & (0x49 ^ 0x8 ^ (0x6 ^ 0x5E) ^ -" ".length())) ^ -" ".length())) > " ".length()) {
                return ((117 + 32 - 40 + 65 ^ 69 + 25 + 48 + 2) & (28 + 214 - 77 + 89 ^ 87 + 41 - 29 + 93 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        }
        return n != 0;
    }
    
    private static int llIlIIlIlllIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int llIlIIlIlllIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected Runnable pollTask() {
        if (llIlIIlIlIllllI(SingleThreadEventExecutor.$assertionsDisabled ? 1 : 0) && llIlIIlIlIllllI(this.inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        do {
            final Runnable lllllllllllllIIllIIIlllllIIlIlII = this.taskQueue.poll();
            if (!llIlIIlIlIlllll(lllllllllllllIIllIIIlllllIIlIlII, SingleThreadEventExecutor.WAKEUP_TASK)) {
                return lllllllllllllIIllIIIlllllIIlIlII;
            }
            "".length();
        } while (-" ".length() <= 0);
        return null;
    }
    
    static {
        llIlIIlIlIlllII();
        llIlIIlIlIlIlIl();
        ST_NOT_STARTED = SingleThreadEventExecutor.lIIlIllIlIlIll[1];
        ST_STARTED = SingleThreadEventExecutor.lIIlIllIlIlIll[2];
        ST_TERMINATED = SingleThreadEventExecutor.lIIlIllIlIlIll[5];
        ST_SHUTTING_DOWN = SingleThreadEventExecutor.lIIlIllIlIlIll[3];
        ST_SHUTDOWN = SingleThreadEventExecutor.lIIlIllIlIlIll[4];
        int $assertionsDisabled2;
        if (llIlIIlIlIllllI(SingleThreadEventExecutor.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = SingleThreadEventExecutor.lIIlIllIlIlIll[1];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
        logger = InternalLoggerFactory.getInstance(SingleThreadEventExecutor.class);
        WAKEUP_TASK = new Runnable() {
            @Override
            public void run() {
            }
        };
        AtomicIntegerFieldUpdater<SingleThreadEventExecutor> lllllllllllllIIllIIIlllIIIIlIlIl = PlatformDependent.newAtomicIntegerFieldUpdater(SingleThreadEventExecutor.class, SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[32]]);
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIIIIlIlIl)) {
            lllllllllllllIIllIIIlllIIIIlIlIl = AtomicIntegerFieldUpdater.newUpdater(SingleThreadEventExecutor.class, SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[33]]);
        }
        STATE_UPDATER = lllllllllllllIIllIIIlllIIIIlIlIl;
        SCHEDULE_PURGE_INTERVAL = TimeUnit.SECONDS.toNanos(1L);
    }
    
    @Override
    public boolean inEventLoop(final Thread lllllllllllllIIllIIIllllIIIlllll) {
        int n;
        if (llIlIIlIlIlllll(lllllllllllllIIllIIIllllIIIlllll, this.thread)) {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[1];
            "".length();
            if ("  ".length() == 0) {
                return ((0x47 ^ 0x2E ^ (0xC3 ^ 0x89)) & (0x31 ^ 0x2 ^ (0x5 ^ 0x15) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        }
        return n != 0;
    }
    
    protected void cleanup() {
    }
    
    protected Queue<Runnable> newTaskQueue() {
        return new LinkedBlockingQueue<Runnable>();
    }
    
    @Override
    public EventExecutorGroup parent() {
        return this.parent;
    }
    
    public final int pendingTasks() {
        return this.taskQueue.size();
    }
    
    @Deprecated
    @Override
    public void shutdown() {
        if (llIlIIlIllIIllI(this.isShutdown() ? 1 : 0)) {
            return;
        }
        final boolean lllllllllllllIIllIIIlllIllIllIlI = this.inEventLoop();
        while (!llIlIIlIllIIllI(this.isShuttingDown() ? 1 : 0)) {
            boolean lllllllllllllIIllIIIlllIllIllIIl = SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0;
            final int lllllllllllllIIllIIIlllIllIllIII = SingleThreadEventExecutor.STATE_UPDATER.get(this);
            int lllllllllllllIIllIIIlllIllIlllII = 0;
            if (llIlIIlIllIIllI(lllllllllllllIIllIIIlllIllIllIlI ? 1 : 0)) {
                final int lllllllllllllIIllIIIlllIllIlllIl = SingleThreadEventExecutor.lIIlIllIlIlIll[4];
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                switch (lllllllllllllIIllIIIlllIllIllIII) {
                    case 1:
                    case 2:
                    case 3: {
                        lllllllllllllIIllIIIlllIllIlllII = SingleThreadEventExecutor.lIIlIllIlIlIll[4];
                        "".length();
                        if (" ".length() > " ".length()) {
                            return;
                        }
                        break;
                    }
                    default: {
                        lllllllllllllIIllIIIlllIllIlllII = lllllllllllllIIllIIIlllIllIllIII;
                        lllllllllllllIIllIIIlllIllIllIIl = (SingleThreadEventExecutor.lIIlIllIlIlIll[0] != 0);
                        break;
                    }
                }
            }
            if (llIlIIlIllIIllI(SingleThreadEventExecutor.STATE_UPDATER.compareAndSet(this, lllllllllllllIIllIIIlllIllIllIII, lllllllllllllIIllIIIlllIllIlllII) ? 1 : 0)) {
                "".length();
                if ("   ".length() > (149 + 70 - 134 + 114 ^ 143 + 76 - 36 + 12)) {
                    return;
                }
                if (llIlIIlIllIllII(lllllllllllllIIllIIIlllIllIllIII, SingleThreadEventExecutor.lIIlIllIlIlIll[1])) {
                    this.thread.start();
                }
                if (llIlIIlIllIIllI(lllllllllllllIIllIIIlllIllIllIIl ? 1 : 0)) {
                    this.wakeup(lllllllllllllIIllIIIlllIllIllIlI);
                }
            }
            else {
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
                continue;
            }
        }
    }
    
    private static int llIlIIlIllIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int llIlIIlIllIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected void wakeup(final boolean lllllllllllllIIllIIIllllIIlIIlIl) {
        if (!llIlIIlIllIIllI(lllllllllllllIIllIIIllllIIlIIlIl ? 1 : 0) || llIlIIlIllIllII(SingleThreadEventExecutor.STATE_UPDATER.get(this), SingleThreadEventExecutor.lIIlIllIlIlIll[3])) {
            this.taskQueue.add(SingleThreadEventExecutor.WAKEUP_TASK);
            "".length();
        }
    }
    
    private static boolean llIlIIlIlllIIlI(final int lllllllllllllIIllIIIllIlllIlIlll, final int lllllllllllllIIllIIIllIlllIlIllI) {
        return lllllllllllllIIllIIIllIlllIlIlll < lllllllllllllIIllIIIllIlllIlIllI;
    }
    
    protected boolean removeTask(final Runnable lllllllllllllIIllIIIllllIlIllIIl) {
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIllllIlIllIIl)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[2]]);
        }
        return this.taskQueue.remove(lllllllllllllIIllIIIllllIlIllIIl);
    }
    
    @Override
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable lllllllllllllIIllIIIlllIIllIlIII, final long lllllllllllllIIllIIIlllIIllIIlll, final long lllllllllllllIIllIIIlllIIllIlIll, final TimeUnit lllllllllllllIIllIIIlllIIllIlIlI) {
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIIllIlIII)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[27]]);
        }
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIIllIlIlI)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[28]]);
        }
        if (llIlIIlIllIllll(llIlIIlIlllIllI(lllllllllllllIIllIIIlllIIllIIlll, 0L))) {
            final String format = SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[29]];
            final Object[] args = new Object[SingleThreadEventExecutor.lIIlIllIlIlIll[1]];
            args[SingleThreadEventExecutor.lIIlIllIlIlIll[0]] = lllllllllllllIIllIIIlllIIllIIlll;
            throw new IllegalArgumentException(String.format(format, args));
        }
        if (llIlIIlIllIIlII(llIlIIlIlllIllI(lllllllllllllIIllIIIlllIIllIlIll, 0L))) {
            final String format2 = SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[30]];
            final Object[] args2 = new Object[SingleThreadEventExecutor.lIIlIllIlIlIll[1]];
            args2[SingleThreadEventExecutor.lIIlIllIlIlIll[0]] = lllllllllllllIIllIIIlllIIllIlIll;
            throw new IllegalArgumentException(String.format(format2, args2));
        }
        return this.schedule((ScheduledFutureTask<?>)new ScheduledFutureTask<Object>(this, this.delayedTaskQueue, Executors.callable(lllllllllllllIIllIIIlllIIllIlIII, (V)null), ScheduledFutureTask.deadlineNanos(lllllllllllllIIllIIIlllIIllIlIlI.toNanos(lllllllllllllIIllIIIlllIIllIIlll)), -lllllllllllllIIllIIIlllIIllIlIlI.toNanos(lllllllllllllIIllIIIlllIIllIlIll)));
    }
    
    private static boolean llIlIIlIllIllll(final int lllllllllllllIIllIIIllIlllIIIllI) {
        return lllllllllllllIIllIIIllIlllIIIllI < 0;
    }
    
    private static boolean llIlIIlIllIIIlI(final Object lllllllllllllIIllIIIllIlllIlIIII) {
        return lllllllllllllIIllIIIllIlllIlIIII != null;
    }
    
    @Override
    public boolean isTerminated() {
        int n;
        if (llIlIIlIllIllII(SingleThreadEventExecutor.STATE_UPDATER.get(this), SingleThreadEventExecutor.lIIlIllIlIlIll[5])) {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[1];
            "".length();
            if ("   ".length() == 0) {
                return ((0x72 ^ 0x4B) & ~(0xAD ^ 0x94)) != 0x0;
            }
        }
        else {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        }
        return n != 0;
    }
    
    private void cancelDelayedTasks() {
        if (llIlIIlIllIIllI(this.delayedTaskQueue.isEmpty() ? 1 : 0)) {
            return;
        }
        final ScheduledFutureTask[] lllllllllllllIIllIIIlllIlIlllIIl;
        final ScheduledFutureTask<?>[] lllllllllllllIIllIIIlllIlIllIlIl = (ScheduledFutureTask<?>[])(lllllllllllllIIllIIIlllIlIlllIIl = this.delayedTaskQueue.toArray(new ScheduledFutureTask[this.delayedTaskQueue.size()]));
        final int lllllllllllllIIllIIIlllIlIlllIII = lllllllllllllIIllIIIlllIlIlllIIl.length;
        int lllllllllllllIIllIIIlllIlIllIlll = SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        while (llIlIIlIlllIIlI(lllllllllllllIIllIIIlllIlIllIlll, lllllllllllllIIllIIIlllIlIlllIII)) {
            final ScheduledFutureTask<?> lllllllllllllIIllIIIlllIlIlllIlI = (ScheduledFutureTask<?>)lllllllllllllIIllIIIlllIlIlllIIl[lllllllllllllIIllIIIlllIlIllIlll];
            lllllllllllllIIllIIIlllIlIlllIlI.cancel((boolean)(SingleThreadEventExecutor.lIIlIllIlIlIll[0] != 0));
            "".length();
            ++lllllllllllllIIllIIIlllIlIllIlll;
            "".length();
            if ("   ".length() == " ".length()) {
                return;
            }
        }
        this.delayedTaskQueue.clear();
    }
    
    private <V> ScheduledFuture<V> schedule(final ScheduledFutureTask<V> lllllllllllllIIllIIIlllIIllIIIIl) {
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIIllIIIIl)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[31]]);
        }
        if (llIlIIlIllIIllI(this.inEventLoop() ? 1 : 0)) {
            this.delayedTaskQueue.add(lllllllllllllIIllIIIlllIIllIIIIl);
            "".length();
            "".length();
            if (((0x77 ^ 0x22 ^ (0x55 ^ 0x11)) & (0xB9 ^ 0xB4 ^ (0x3A ^ 0x26) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            this.execute(new Runnable() {
                @Override
                public void run() {
                    SingleThreadEventExecutor.this.delayedTaskQueue.add(lllllllllllllIIllIIIlllIIllIIIIl);
                    "".length();
                }
            });
        }
        return lllllllllllllIIllIIIlllIIllIIIIl;
    }
    
    protected boolean hasTasks() {
        if (llIlIIlIlIllllI(SingleThreadEventExecutor.$assertionsDisabled ? 1 : 0) && llIlIIlIlIllllI(this.inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        int n;
        if (llIlIIlIlIllllI(this.taskQueue.isEmpty() ? 1 : 0)) {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[1];
            "".length();
            if ((59 + 24 + 74 + 13 ^ 27 + 48 + 42 + 58) == 0x0) {
                return ((102 + 137 - 178 + 116 ^ 109 + 47 - 130 + 107) & (26 + 114 - 117 + 153 ^ 28 + 63 + 34 + 7 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        }
        return n != 0;
    }
    
    protected boolean hasScheduledTasks() {
        if (llIlIIlIlIllllI(SingleThreadEventExecutor.$assertionsDisabled ? 1 : 0) && llIlIIlIlIllllI(this.inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        final ScheduledFutureTask<?> lllllllllllllIIllIIIllllIllIlIII = this.delayedTaskQueue.peek();
        int n;
        if (llIlIIlIllIIIlI(lllllllllllllIIllIIIllllIllIlIII) && llIlIIlIllIIlII(llIlIIlIllIIlIl(lllllllllllllIIllIIIllllIllIlIII.deadlineNanos(), ScheduledFutureTask.nanoTime()))) {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[1];
            "".length();
            if ((0xBC ^ 0xB9) == 0x0) {
                return ((0x69 ^ 0x70) & ~(0x1F ^ 0x6)) != 0x0;
            }
        }
        else {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        }
        return n != 0;
    }
    
    private static boolean llIlIIlIllIllII(final int lllllllllllllIIllIIIllIlllIlllll, final int lllllllllllllIIllIIIllIlllIllllI) {
        return lllllllllllllIIllIIIllIlllIlllll == lllllllllllllIIllIIIllIlllIllllI;
    }
    
    private static boolean llIlIIlIlIlllll(final Object lllllllllllllIIllIIIllIlllIlIIll, final Object lllllllllllllIIllIIIllIlllIlIIlI) {
        return lllllllllllllIIllIIIllIlllIlIIll == lllllllllllllIIllIIIllIlllIlIIlI;
    }
    
    protected boolean confirmShutdown() {
        if (llIlIIlIlIllllI(this.isShuttingDown() ? 1 : 0)) {
            return SingleThreadEventExecutor.lIIlIllIlIlIll[0] != 0;
        }
        if (llIlIIlIlIllllI(this.inEventLoop() ? 1 : 0)) {
            throw new IllegalStateException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[12]]);
        }
        this.cancelDelayedTasks();
        if (llIlIIlIlIllllI(llIlIIlIlllIIIl(this.gracefulShutdownStartTime, 0L))) {
            this.gracefulShutdownStartTime = ScheduledFutureTask.nanoTime();
        }
        if (!llIlIIlIlIllllI(this.runAllTasks() ? 1 : 0) || llIlIIlIllIIllI(this.runShutdownHooks() ? 1 : 0)) {
            if (llIlIIlIllIIllI(this.isShutdown() ? 1 : 0)) {
                return SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0;
            }
            this.wakeup((boolean)(SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0));
            return SingleThreadEventExecutor.lIIlIllIlIlIll[0] != 0;
        }
        else {
            final long lllllllllllllIIllIIIlllIllIIIlII = ScheduledFutureTask.nanoTime();
            if (!llIlIIlIlIllllI(this.isShutdown() ? 1 : 0) || llIlIIlIllIIIIl(llIlIIlIlllIIIl(lllllllllllllIIllIIIlllIllIIIlII - this.gracefulShutdownStartTime, this.gracefulShutdownTimeout))) {
                return SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0;
            }
            if (llIlIIlIllIIlII(llIlIIlIlllIIIl(lllllllllllllIIllIIIlllIllIIIlII - this.lastExecutionTime, this.gracefulShutdownQuietPeriod))) {
                this.wakeup((boolean)(SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0));
                try {
                    Thread.sleep(100L);
                    "".length();
                    if (null != null) {
                        return ((0x53 ^ 0x58 ^ (0x86 ^ 0xA8)) & (0xC1 ^ 0xC4 ^ (0x3E ^ 0x1E) ^ -" ".length())) != 0x0;
                    }
                }
                catch (InterruptedException ex) {}
                return SingleThreadEventExecutor.lIIlIllIlIlIll[0] != 0;
            }
            return SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0;
        }
    }
    
    private static int llIlIIlIllIIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public void addShutdownHook(final Runnable lllllllllllllIIllIIIllllIIIllIIl) {
        if (llIlIIlIllIIllI(this.inEventLoop() ? 1 : 0)) {
            this.shutdownHooks.add(lllllllllllllIIllIIIllllIIIllIIl);
            "".length();
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            this.execute(new Runnable() {
                @Override
                public void run() {
                    SingleThreadEventExecutor.this.shutdownHooks.add(lllllllllllllIIllIIIllllIIIllIIl);
                    "".length();
                }
            });
        }
    }
    
    private static int llIlIIlIlllIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void llIlIIlIlIlllII() {
        (lIIlIllIlIlIll = new int[35])[0] = ((0x39 ^ 0x1E) & ~(0x4B ^ 0x6C));
        SingleThreadEventExecutor.lIIlIllIlIlIll[1] = " ".length();
        SingleThreadEventExecutor.lIIlIllIlIlIll[2] = "  ".length();
        SingleThreadEventExecutor.lIIlIllIlIlIll[3] = "   ".length();
        SingleThreadEventExecutor.lIIlIllIlIlIll[4] = (0x20 ^ 0x24);
        SingleThreadEventExecutor.lIIlIllIlIlIll[5] = (0xB4 ^ 0xB1);
        SingleThreadEventExecutor.lIIlIllIlIlIll[6] = (0x5F ^ 0x59);
        SingleThreadEventExecutor.lIIlIllIlIlIll[7] = (0x61 ^ 0x66);
        SingleThreadEventExecutor.lIIlIllIlIlIll[8] = (0x13 ^ 0x1B);
        SingleThreadEventExecutor.lIIlIllIlIlIll[9] = (0x72 ^ 0x7B);
        SingleThreadEventExecutor.lIIlIllIlIlIll[10] = (32 + 21 + 57 + 62 ^ 69 + 64 - 57 + 90);
        SingleThreadEventExecutor.lIIlIllIlIlIll[11] = (0x26 ^ 0x2D);
        SingleThreadEventExecutor.lIIlIllIlIlIll[12] = (0x2E ^ 0x42 ^ (0x68 ^ 0x8));
        SingleThreadEventExecutor.lIIlIllIlIlIll[13] = (0xB ^ 0x6);
        SingleThreadEventExecutor.lIIlIllIlIlIll[14] = (0xA2 ^ 0xAC);
        SingleThreadEventExecutor.lIIlIllIlIlIll[15] = (71 + 35 + 39 + 3 ^ 97 + 144 - 136 + 50);
        SingleThreadEventExecutor.lIIlIllIlIlIll[16] = (0x52 ^ 0x42);
        SingleThreadEventExecutor.lIIlIllIlIlIll[17] = (0x13 ^ 0x5D ^ (0xDD ^ 0x82));
        SingleThreadEventExecutor.lIIlIllIlIlIll[18] = (0x4F ^ 0x5E ^ "   ".length());
        SingleThreadEventExecutor.lIIlIllIlIlIll[19] = (0x52 ^ 0x41);
        SingleThreadEventExecutor.lIIlIllIlIlIll[20] = (49 + 99 - 20 + 18 ^ 82 + 89 - 65 + 28);
        SingleThreadEventExecutor.lIIlIllIlIlIll[21] = (0x63 ^ 0x76);
        SingleThreadEventExecutor.lIIlIllIlIlIll[22] = (0xB9 ^ 0xAF);
        SingleThreadEventExecutor.lIIlIllIlIlIll[23] = (0x1 ^ 0x10 ^ (0x50 ^ 0x56));
        SingleThreadEventExecutor.lIIlIllIlIlIll[24] = (0x5B ^ 0x43);
        SingleThreadEventExecutor.lIIlIllIlIlIll[25] = (0xA9 ^ 0xB0);
        SingleThreadEventExecutor.lIIlIllIlIlIll[26] = (0x4 ^ 0x2B ^ (0x88 ^ 0xBD));
        SingleThreadEventExecutor.lIIlIllIlIlIll[27] = (0x26 ^ 0xA ^ (0x64 ^ 0x53));
        SingleThreadEventExecutor.lIIlIllIlIlIll[28] = (0x4D ^ 0x1D ^ (0x2A ^ 0x66));
        SingleThreadEventExecutor.lIIlIllIlIlIll[29] = (0x26 ^ 0x3B);
        SingleThreadEventExecutor.lIIlIllIlIlIll[30] = (0xB ^ 0x77 ^ (0x73 ^ 0x11));
        SingleThreadEventExecutor.lIIlIllIlIlIll[31] = (104 + 51 - 1 + 69 ^ 139 + 164 - 199 + 88);
        SingleThreadEventExecutor.lIIlIllIlIlIll[32] = (0x59 ^ 0x4F ^ (0x6E ^ 0x58));
        SingleThreadEventExecutor.lIIlIllIlIlIll[33] = (0xB5 ^ 0x94);
        SingleThreadEventExecutor.lIIlIllIlIlIll[34] = (0xA8 ^ 0x8A);
    }
    
    protected abstract void run();
    
    @Override
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable lllllllllllllIIllIIIlllIIlllllII, final long lllllllllllllIIllIIIlllIIllllIll, final long lllllllllllllIIllIIIlllIIllllIlI, final TimeUnit lllllllllllllIIllIIIlllIIlllIlII) {
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIIlllllII)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[23]]);
        }
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIIlllIlII)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[24]]);
        }
        if (llIlIIlIllIllll(llIlIIlIlllIlIl(lllllllllllllIIllIIIlllIIllllIll, 0L))) {
            final String format = SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[25]];
            final Object[] args = new Object[SingleThreadEventExecutor.lIIlIllIlIlIll[1]];
            args[SingleThreadEventExecutor.lIIlIllIlIlIll[0]] = lllllllllllllIIllIIIlllIIllllIll;
            throw new IllegalArgumentException(String.format(format, args));
        }
        if (llIlIIlIllIIlII(llIlIIlIlllIlIl(lllllllllllllIIllIIIlllIIllllIlI, 0L))) {
            final String format2 = SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[26]];
            final Object[] args2 = new Object[SingleThreadEventExecutor.lIIlIllIlIlIll[1]];
            args2[SingleThreadEventExecutor.lIIlIllIlIlIll[0]] = lllllllllllllIIllIIIlllIIllllIlI;
            throw new IllegalArgumentException(String.format(format2, args2));
        }
        return this.schedule((ScheduledFutureTask<?>)new ScheduledFutureTask<Object>(this, this.delayedTaskQueue, Executors.callable(lllllllllllllIIllIIIlllIIlllllII, (V)null), ScheduledFutureTask.deadlineNanos(lllllllllllllIIllIIIlllIIlllIlII.toNanos(lllllllllllllIIllIIIlllIIllllIll)), lllllllllllllIIllIIIlllIIlllIlII.toNanos(lllllllllllllIIllIIIlllIIllllIlI)));
    }
    
    public void removeShutdownHook(final Runnable lllllllllllllIIllIIIllllIIIlIlIl) {
        if (llIlIIlIllIIllI(this.inEventLoop() ? 1 : 0)) {
            this.shutdownHooks.remove(lllllllllllllIIllIIIllllIIIlIlIl);
            "".length();
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            this.execute(new Runnable() {
                @Override
                public void run() {
                    SingleThreadEventExecutor.this.shutdownHooks.remove(lllllllllllllIIllIIIllllIIIlIlIl);
                    "".length();
                }
            });
        }
    }
    
    private static boolean llIlIIlIllIIIIl(final int lllllllllllllIIllIIIllIlllIIIIlI) {
        return lllllllllllllIIllIIIllIlllIIIIlI > 0;
    }
    
    @Override
    public ScheduledFuture<?> schedule(final Runnable lllllllllllllIIllIIIlllIlIIlIIIl, final long lllllllllllllIIllIIIlllIlIIlIlII, final TimeUnit lllllllllllllIIllIIIlllIlIIlIIll) {
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIlIIlIIIl)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[17]]);
        }
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIlIIlIIll)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[18]]);
        }
        if (llIlIIlIllIllll(llIlIIlIlllIIll(lllllllllllllIIllIIIlllIlIIlIlII, 0L))) {
            final String format = SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[19]];
            final Object[] args = new Object[SingleThreadEventExecutor.lIIlIllIlIlIll[1]];
            args[SingleThreadEventExecutor.lIIlIllIlIlIll[0]] = lllllllllllllIIllIIIlllIlIIlIlII;
            throw new IllegalArgumentException(String.format(format, args));
        }
        return this.schedule((ScheduledFutureTask<?>)new ScheduledFutureTask<Object>(this, this.delayedTaskQueue, lllllllllllllIIllIIIlllIlIIlIIIl, null, ScheduledFutureTask.deadlineNanos(lllllllllllllIIllIIIlllIlIIlIIll.toNanos(lllllllllllllIIllIIIlllIlIIlIlII))));
    }
    
    protected void updateLastExecutionTime() {
        this.lastExecutionTime = ScheduledFutureTask.nanoTime();
    }
    
    private static String llIlIIlIlIIlIIl(final String lllllllllllllIIllIIIllIllllIIlIl, final String lllllllllllllIIllIIIllIllllIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIllIllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIllIllllIIlII.getBytes(StandardCharsets.UTF_8)), SingleThreadEventExecutor.lIIlIllIlIlIll[8]), "DES");
            final Cipher lllllllllllllIIllIIIllIllllIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIllIIIllIllllIlIIl.init(SingleThreadEventExecutor.lIIlIllIlIlIll[2], lllllllllllllIIllIIIllIllllIlIlI);
            return new String(lllllllllllllIIllIIIllIllllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIllIllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIllIllllIlIII) {
            lllllllllllllIIllIIIllIllllIlIII.printStackTrace();
            return null;
        }
    }
    
    protected boolean wakesUpForTask(final Runnable lllllllllllllIIllIIIlllIlIIllIll) {
        return SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0;
    }
    
    private static int llIlIIlIlllIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public <V> ScheduledFuture<V> schedule(final Callable<V> lllllllllllllIIllIIIlllIlIIIlIIl, final long lllllllllllllIIllIIIlllIlIIIIlII, final TimeUnit lllllllllllllIIllIIIlllIlIIIIIll) {
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIlIIIlIIl)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[20]]);
        }
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIlIIIIIll)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[21]]);
        }
        if (llIlIIlIllIllll(llIlIIlIlllIlII(lllllllllllllIIllIIIlllIlIIIIlII, 0L))) {
            final String format = SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[22]];
            final Object[] args = new Object[SingleThreadEventExecutor.lIIlIllIlIlIll[1]];
            args[SingleThreadEventExecutor.lIIlIllIlIlIll[0]] = lllllllllllllIIllIIIlllIlIIIIlII;
            throw new IllegalArgumentException(String.format(format, args));
        }
        return this.schedule(new ScheduledFutureTask<V>(this, this.delayedTaskQueue, lllllllllllllIIllIIIlllIlIIIlIIl, ScheduledFutureTask.deadlineNanos(lllllllllllllIIllIIIlllIlIIIIIll.toNanos(lllllllllllllIIllIIIlllIlIIIIlII))));
    }
    
    private static String llIlIIlIlIIlIII(String lllllllllllllIIllIIIlllIIIIIIlII, final String lllllllllllllIIllIIIlllIIIIIlIII) {
        lllllllllllllIIllIIIlllIIIIIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIllIIIlllIIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIlllIIIIIIlll = new StringBuilder();
        final char[] lllllllllllllIIllIIIlllIIIIIIllI = lllllllllllllIIllIIIlllIIIIIlIII.toCharArray();
        int lllllllllllllIIllIIIlllIIIIIIlIl = SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        final float lllllllllllllIIllIIIllIlllllllll = (Object)lllllllllllllIIllIIIlllIIIIIIlII.toCharArray();
        final long lllllllllllllIIllIIIllIllllllllI = lllllllllllllIIllIIIllIlllllllll.length;
        char lllllllllllllIIllIIIllIlllllllIl = (char)SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        while (llIlIIlIlllIIlI(lllllllllllllIIllIIIllIlllllllIl, (int)lllllllllllllIIllIIIllIllllllllI)) {
            final char lllllllllllllIIllIIIlllIIIIIlIlI = lllllllllllllIIllIIIllIlllllllll[lllllllllllllIIllIIIllIlllllllIl];
            lllllllllllllIIllIIIlllIIIIIIlll.append((char)(lllllllllllllIIllIIIlllIIIIIlIlI ^ lllllllllllllIIllIIIlllIIIIIIllI[lllllllllllllIIllIIIlllIIIIIIlIl % lllllllllllllIIllIIIlllIIIIIIllI.length]));
            "".length();
            ++lllllllllllllIIllIIIlllIIIIIIlIl;
            ++lllllllllllllIIllIIIllIlllllllIl;
            "".length();
            if (((224 + 152 - 310 + 181 ^ 8 + 121 + 9 + 22) & (((0x6A ^ 0x77) & ~(0x43 ^ 0x5E)) ^ (0xFB ^ 0xAC) ^ -" ".length())) < ("  ".length() & ("  ".length() ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIlllIIIIIIlll);
    }
    
    @Override
    public Future<?> terminationFuture() {
        return this.terminationFuture;
    }
    
    @Override
    public boolean isShuttingDown() {
        int n;
        if (llIlIIlIlllIIII(SingleThreadEventExecutor.STATE_UPDATER.get(this), SingleThreadEventExecutor.lIIlIllIlIlIll[3])) {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[1];
            "".length();
            if (" ".length() <= ((0x47 ^ 0x52 ^ (0x52 ^ 0x68)) & (0x79 ^ 0x3C ^ (0x5D ^ 0x37) ^ -" ".length()))) {
                return ((0x5E ^ 0x29 ^ (0xFC ^ 0xA1)) & (0x87 ^ 0xB6 ^ (0x7B ^ 0x60) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SingleThreadEventExecutor.lIIlIllIlIlIll[0];
        }
        return n != 0;
    }
    
    @Override
    public Future<?> shutdownGracefully(final long lllllllllllllIIllIIIlllIlllIllII, final long lllllllllllllIIllIIIlllIllllIIlI, final TimeUnit lllllllllllllIIllIIIlllIlllIlIlI) {
        if (llIlIIlIllIllll(llIlIIlIllIlllI(lllllllllllllIIllIIIlllIlllIllII, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[6]]).append(lllllllllllllIIllIIIlllIlllIllII).append(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[7]])));
        }
        if (llIlIIlIllIllll(llIlIIlIllIlllI(lllllllllllllIIllIIIlllIllllIIlI, lllllllllllllIIllIIIlllIlllIllII))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[8]]).append(lllllllllllllIIllIIIlllIllllIIlI).append(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[9]]).append(lllllllllllllIIllIIIlllIlllIllII).append(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[10]])));
        }
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIlllIlIlI)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[11]]);
        }
        if (llIlIIlIllIIllI(this.isShuttingDown() ? 1 : 0)) {
            return this.terminationFuture();
        }
        final boolean lllllllllllllIIllIIIlllIllllIIII = this.inEventLoop();
        while (!llIlIIlIllIIllI(this.isShuttingDown() ? 1 : 0)) {
            boolean lllllllllllllIIllIIIlllIlllIllll = SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0;
            final int lllllllllllllIIllIIIlllIlllIlllI = SingleThreadEventExecutor.STATE_UPDATER.get(this);
            int lllllllllllllIIllIIIlllIllllIlIl = 0;
            if (llIlIIlIllIIllI(lllllllllllllIIllIIIlllIllllIIII ? 1 : 0)) {
                final int lllllllllllllIIllIIIlllIllllIllI = SingleThreadEventExecutor.lIIlIllIlIlIll[3];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                switch (lllllllllllllIIllIIIlllIlllIlllI) {
                    case 1:
                    case 2: {
                        lllllllllllllIIllIIIlllIllllIlIl = SingleThreadEventExecutor.lIIlIllIlIlIll[3];
                        "".length();
                        if (null != null) {
                            return null;
                        }
                        break;
                    }
                    default: {
                        lllllllllllllIIllIIIlllIllllIlIl = lllllllllllllIIllIIIlllIlllIlllI;
                        lllllllllllllIIllIIIlllIlllIllll = (SingleThreadEventExecutor.lIIlIllIlIlIll[0] != 0);
                        break;
                    }
                }
            }
            if (llIlIIlIllIIllI(SingleThreadEventExecutor.STATE_UPDATER.compareAndSet(this, lllllllllllllIIllIIIlllIlllIlllI, lllllllllllllIIllIIIlllIllllIlIl) ? 1 : 0)) {
                "".length();
                if ((0x98 ^ 0x9C) < " ".length()) {
                    return null;
                }
                this.gracefulShutdownQuietPeriod = lllllllllllllIIllIIIlllIlllIlIlI.toNanos(lllllllllllllIIllIIIlllIlllIllII);
                this.gracefulShutdownTimeout = lllllllllllllIIllIIIlllIlllIlIlI.toNanos(lllllllllllllIIllIIIlllIllllIIlI);
                if (llIlIIlIllIllII(lllllllllllllIIllIIIlllIlllIlllI, SingleThreadEventExecutor.lIIlIllIlIlIll[1])) {
                    this.thread.start();
                }
                if (llIlIIlIllIIllI(lllllllllllllIIllIIIlllIlllIllll ? 1 : 0)) {
                    this.wakeup(lllllllllllllIIllIIIlllIllllIIII);
                }
                return this.terminationFuture();
            }
            else {
                "".length();
                if (((0x29 ^ 0x75) & ~(0xCF ^ 0x93)) > ((0x23 ^ 0x3B) & ~(0x95 ^ 0x8D))) {
                    return null;
                }
                continue;
            }
        }
        return this.terminationFuture();
    }
    
    protected boolean runAllTasks(final long lllllllllllllIIllIIIllllIIllllIl) {
        this.fetchFromDelayedQueue();
        Runnable lllllllllllllIIllIIIllllIlIIIIlI = this.pollTask();
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIllllIlIIIIlI)) {
            return SingleThreadEventExecutor.lIIlIllIlIlIll[0] != 0;
        }
        final long lllllllllllllIIllIIIllllIlIIIIIl = ScheduledFutureTask.nanoTime() + lllllllllllllIIllIIIllllIIllllIl;
        long lllllllllllllIIllIIIllllIlIIIIII = 0L;
        long lllllllllllllIIllIIIllllIIllllll = 0L;
        while (true) {
            try {
                lllllllllllllIIllIIIllllIlIIIIlI.run();
                "".length();
                if (null != null) {
                    return ("   ".length() & ~"   ".length()) != 0x0;
                }
            }
            catch (Throwable lllllllllllllIIllIIIllllIlIIIllI) {
                SingleThreadEventExecutor.logger.warn(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[4]], lllllllllllllIIllIIIllllIlIIIllI);
            }
            ++lllllllllllllIIllIIIllllIlIIIIII;
            if (llIlIIlIlIllllI(llIlIIlIllIlIII(lllllllllllllIIllIIIllllIlIIIIII & 0x3FL, 0L))) {
                final long lllllllllllllIIllIIIllllIlIIIlIl = ScheduledFutureTask.nanoTime();
                if (llIlIIlIllIlIlI(llIlIIlIllIlIII(lllllllllllllIIllIIIllllIlIIIlIl, lllllllllllllIIllIIIllllIlIIIIIl))) {
                    "".length();
                    if (null != null) {
                        return ((0xB ^ 0x21) & ~(0x16 ^ 0x3C)) != 0x0;
                    }
                    break;
                }
            }
            lllllllllllllIIllIIIllllIlIIIIlI = this.pollTask();
            if (llIlIIlIlIlllIl(lllllllllllllIIllIIIllllIlIIIIlI)) {
                lllllllllllllIIllIIIllllIIllllll = ScheduledFutureTask.nanoTime();
                "".length();
                if (((0x33 ^ 0x17) & ~(0x34 ^ 0x10)) != ((0x37 ^ 0x14) & ~(0x57 ^ 0x74))) {
                    return ((0xE ^ 0x2B) & ~(0x3A ^ 0x1F)) != 0x0;
                }
                break;
            }
        }
        this.lastExecutionTime = lllllllllllllIIllIIIllllIIllllll;
        return SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0;
    }
    
    protected Runnable takeTask() {
        if (llIlIIlIlIllllI(SingleThreadEventExecutor.$assertionsDisabled ? 1 : 0) && llIlIIlIlIllllI(this.inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        if (llIlIIlIlIllllI((this.taskQueue instanceof BlockingQueue) ? 1 : 0)) {
            throw new UnsupportedOperationException();
        }
        final BlockingQueue<Runnable> lllllllllllllIIllIIIlllllIIIIIlI = (BlockingQueue<Runnable>)(BlockingQueue)this.taskQueue;
        do {
            final ScheduledFutureTask<?> lllllllllllllIIllIIIlllllIIIIlII = this.delayedTaskQueue.peek();
            if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllllIIIIlII)) {
                Runnable lllllllllllllIIllIIIlllllIIIlIII = null;
                try {
                    lllllllllllllIIllIIIlllllIIIlIII = lllllllllllllIIllIIIlllllIIIIIlI.take();
                    if (llIlIIlIlIlllll(lllllllllllllIIllIIIlllllIIIlIII, SingleThreadEventExecutor.WAKEUP_TASK)) {
                        lllllllllllllIIllIIIlllllIIIlIII = null;
                    }
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                catch (InterruptedException ex) {}
                return lllllllllllllIIllIIIlllllIIIlIII;
            }
            final long lllllllllllllIIllIIIlllllIIIIllI = lllllllllllllIIllIIIlllllIIIIlII.delayNanos();
            Runnable lllllllllllllIIllIIIlllllIIIIlIl = null;
            if (llIlIIlIllIIIIl(llIlIIlIllIIIII(lllllllllllllIIllIIIlllllIIIIllI, 0L))) {
                try {
                    lllllllllllllIIllIIIlllllIIIIlIl = lllllllllllllIIllIIIlllllIIIIIlI.poll(lllllllllllllIIllIIIlllllIIIIllI, TimeUnit.NANOSECONDS);
                    "".length();
                    if (" ".length() <= 0) {
                        return null;
                    }
                }
                catch (InterruptedException lllllllllllllIIllIIIlllllIIIIlll) {
                    return null;
                }
            }
            if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllllIIIIlIl)) {
                this.fetchFromDelayedQueue();
                lllllllllllllIIllIIIlllllIIIIlIl = lllllllllllllIIllIIIlllllIIIIIlI.poll();
            }
            if (llIlIIlIllIIIlI(lllllllllllllIIllIIIlllllIIIIlIl)) {
                return lllllllllllllIIllIIIlllllIIIIlIl;
            }
            "".length();
        } while ("   ".length() >= 0);
        return null;
    }
    
    protected SingleThreadEventExecutor(final EventExecutorGroup lllllllllllllIIllIIIlllllIlIIIII, final ThreadFactory lllllllllllllIIllIIIlllllIIlllll, final boolean lllllllllllllIIllIIIlllllIIllllI) {
        this.delayedTaskQueue = new PriorityQueue<ScheduledFutureTask<?>>();
        this.threadLock = new Semaphore(SingleThreadEventExecutor.lIIlIllIlIlIll[0]);
        this.shutdownHooks = new LinkedHashSet<Runnable>();
        this.state = SingleThreadEventExecutor.lIIlIllIlIlIll[1];
        this.terminationFuture = new DefaultPromise<Object>(GlobalEventExecutor.INSTANCE);
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllllIIlllll)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[0]]);
        }
        this.parent = lllllllllllllIIllIIIlllllIlIIIII;
        this.addTaskWakesUp = lllllllllllllIIllIIIlllllIIllllI;
        this.thread = lllllllllllllIIllIIIlllllIIlllll.newThread(new Runnable() {
            private static final /* synthetic */ int[] lIIIllllllllIl;
            private static final /* synthetic */ String[] lIIIlllllllIIl;
            
            private static boolean llIIlIIIllIlIIl(final int lllllllllllllIIlllIlllllllIIlIlI) {
                return lllllllllllllIIlllIlllllllIIlIlI != 0;
            }
            
            private static void llIIlIIIllIIlII() {
                (lIIIlllllllIIl = new String[SingleThreadEventExecutor$2.lIIIllllllllIl[26]])[SingleThreadEventExecutor$2.lIIIllllllllIl[0]] = llIIlIIIlIlllll("FzsqJhF1", "UNMAh");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[1]] = llIIlIIIlIlllll("biw6JjUrKDI4LS8xPjk3dWU=", "NEWVY");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[3]] = llIIlIIIllIIIII("0ywmNq5T+S6t2OKxWPHkzQ2Oh4x39xohEzCWd/xhCm+qm76jkUgUjA==", "mXUgG");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[2]] = llIIlIIIlIlllll("KSMXKSUuZgMzOWNvUS86OyoUKzIlMhAyPiQoUTIyOSsYKDY/IwJo", "KFqFW");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[5]] = llIIlIIIlIlllll("BR93KQchHyNsFDwUNDkFKwN3OBQ2HD4iEDAUM2wGLQU/bB8rH3opHDQFLmwFJQI8bAAxFCIpUWw=", "DqWLq");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[4]] = llIIlIIIllIIIII("kGbpEgmm8VwxPPNTJJpGbC06ohBd27j9BorqDPv43SnYwpuwlVqwFc7Ih3WRVfqHOrKVsUrYvjYFLuD8s4tStw==", "XlaSf");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[7]] = llIIlIIIllIIIIl("PpXfkUvqMP6UTMS8qHc1ME+bQGmXVzdCwBbZIxQiASppRxQbVdmvRQop4og6hIJ4vNTO0oQ+SEFqKPA08QoARA==", "SLBuo");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[8]] = llIIlIIIllIIIIl("lWv9w3ZDTJzkfGlETGryBngZT92IGMXvgiAkB29AA2t1DOXYsPTasD/tWqsn453LK9fDZmIY8xcxP7aRV0cOmA==", "qYtSn");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[9]] = llIIlIIIlIlllll("GigwKBQqJSE1AG8jLTMBPzI8PwpvICc/CW8nO3ABOSM7JEQqPjAzETspJ2pE", "OFUPd");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[10]] = llIIlIIIllIIIII("3D5kMHbQyA8=", "ezdLq");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[11]] = llIIlIIIllIIIIl("7vzsVXBZmTqJXvbeJL/VGsbkhG7MW4Kk", "SlSaQ");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[12]] = llIIlIIIlIlllll("RRIlIzACAycePh4FLiIhBVljbTseAj5tNA5RKSw6BxQubQ==", "kqJMV");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[13]] = llIIlIIIlIlllll("MiERGDU1ZAUCKXhtVx4qICgSGiI+MBYDLj8qVwMiIikeGSYkIQRZ", "PDwwG");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[14]] = llIIlIIIllIIIIl("pY/5M0a4v9+V7EPUe6UgZdU0vXm+YK+aHdXvSb7VmY0ohFI+y/hlCeTFCmSMBr8+CvrEXj9/X9zWhGR6icSnfA==", "Cvyzd");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[15]] = llIIlIIIlIlllll("AipzMQYmKid0FTshMCEELDZzIBUxKTo6ETchN3QHKjA7dB4sKn4xHTMwKnQEIjc4dAE2ISYxUGs=", "CDSTp");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[16]] = llIIlIIIlIlllll("Nh9KLB0SHx5pDg8UCTwfGANKPQ4FHAMnCgMUDmkcHgUCaQUYH0csBgcFE2kfFgIBaRoCFB8sS18=", "wqjIk");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[17]] = llIIlIIIllIIIII("1pih8E58J7S8AopkIZxIAJky9EVibYKok1ona1wco3YiYNSdNEbSVS7KGS+rCSacRSBTdLg18eepOLgi3/3Q2w==", "ljlUZ");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[18]] = llIIlIIIllIIIII("peW6O2WKI4Q=", "vSMMv");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[19]] = llIIlIIIlIlllll("ZyU0CQ0iITwXFSY4MBYPfGw=", "GLYya");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[20]] = llIIlIIIlIlllll("STsMPCQOKg4BKhIsBz01CXBKci8SKxdyIAJ4ADMuCz0Hcg==", "gXcRB");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[21]] = llIIlIIIlIlllll("Ew8tHB0USjkGAVlDaxoCAQYuHgofHioHBh4EawcKAwciHQ4FDzhd", "qjKso");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[22]] = llIIlIIIllIIIII("T92Buk1+PpvBl46g995vzs0IQoRkL/IsZe10h95aOOjcvjjhwOKNa5Hw10/Qprbs4mv4UGMP5N71GHtzaeTeTw==", "OxzLj");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[23]] = llIIlIIIlIlllll("AytGPzgnKxJ6KzogBS86LTdGLiswKA80LzYgAno5KzEOeiAtK0s/IzIxH3o6IzYNej83IBM/bmo=", "BEfZN");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[24]] = llIIlIIIllIIIII("VBQVZpNEC2lN/W3kQh1vGKJWgi1gM7Qjh0+4GMqq+U92FGLbAaECdbWMqZHPHj5ThN6FNCNWkLdVl6MXNzzwnQ==", "Wymdw");
                SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[25]] = llIIlIIIlIlllll("NSJ5EiERIi1XMgwpOgIjGz55AzIGITAZNgApPVcgHTgxVzkbInQSOgQ4IFcjFT8yVyYBKSwSd1w=", "tLYwW");
            }
            
            private static void llIIlIIIllIIllI() {
                (lIIIllllllllIl = new int[27])[0] = ((0x9B ^ 0x94) & ~(0x42 ^ 0x4D));
                SingleThreadEventExecutor$2.lIIIllllllllIl[1] = " ".length();
                SingleThreadEventExecutor$2.lIIIllllllllIl[2] = "   ".length();
                SingleThreadEventExecutor$2.lIIIllllllllIl[3] = "  ".length();
                SingleThreadEventExecutor$2.lIIIllllllllIl[4] = (0x16 ^ 0xD ^ (0xA0 ^ 0xBE));
                SingleThreadEventExecutor$2.lIIIllllllllIl[5] = (17 + 125 - 16 + 2 ^ 90 + 0 - 15 + 57);
                SingleThreadEventExecutor$2.lIIIllllllllIl[6] = (137 + 15 - 121 + 125 ^ 110 + 56 - 52 + 67);
                SingleThreadEventExecutor$2.lIIIllllllllIl[7] = (0x86 ^ 0x80);
                SingleThreadEventExecutor$2.lIIIllllllllIl[8] = (96 + 100 - 113 + 53 ^ 49 + 29 + 11 + 54);
                SingleThreadEventExecutor$2.lIIIllllllllIl[9] = (0xB8 ^ 0xB0);
                SingleThreadEventExecutor$2.lIIIllllllllIl[10] = (0xF ^ 0x5A ^ (0xCE ^ 0x92));
                SingleThreadEventExecutor$2.lIIIllllllllIl[11] = (0x38 ^ 0x32);
                SingleThreadEventExecutor$2.lIIIllllllllIl[12] = (0xA0 ^ 0xAB);
                SingleThreadEventExecutor$2.lIIIllllllllIl[13] = (0x6C ^ 0x41 ^ (0x74 ^ 0x55));
                SingleThreadEventExecutor$2.lIIIllllllllIl[14] = (0xA5 ^ 0xA8);
                SingleThreadEventExecutor$2.lIIIllllllllIl[15] = (0x78 ^ 0xD ^ (0xE6 ^ 0x9D));
                SingleThreadEventExecutor$2.lIIIllllllllIl[16] = (107 + 91 - 6 + 13 ^ 141 + 26 + 11 + 16);
                SingleThreadEventExecutor$2.lIIIllllllllIl[17] = (0x1E ^ 0x70 ^ (0x5C ^ 0x22));
                SingleThreadEventExecutor$2.lIIIllllllllIl[18] = (0x79 ^ 0x68);
                SingleThreadEventExecutor$2.lIIIllllllllIl[19] = (0x29 ^ 0x3B);
                SingleThreadEventExecutor$2.lIIIllllllllIl[20] = (0xE8 ^ 0xB9 ^ (0xD3 ^ 0x91));
                SingleThreadEventExecutor$2.lIIIllllllllIl[21] = (0x2 ^ 0x16);
                SingleThreadEventExecutor$2.lIIIllllllllIl[22] = (0xBF ^ 0xAA);
                SingleThreadEventExecutor$2.lIIIllllllllIl[23] = (41 + 115 - 92 + 97 ^ 70 + 73 + 13 + 27);
                SingleThreadEventExecutor$2.lIIIllllllllIl[24] = (0xA5 ^ 0xB2);
                SingleThreadEventExecutor$2.lIIIllllllllIl[25] = (0x35 ^ 0x5D ^ (0x2E ^ 0x5E));
                SingleThreadEventExecutor$2.lIIIllllllllIl[26] = (0x66 ^ 0x17 ^ (0xE8 ^ 0x80));
            }
            
            private static String llIIlIIIlIlllll(String lllllllllllllIIlllIlllllllllIIlI, final String lllllllllllllIIlllIlllllllllIllI) {
                lllllllllllllIIlllIlllllllllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlllIlllllllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder lllllllllllllIIlllIlllllllllIlIl = new StringBuilder();
                final char[] lllllllllllllIIlllIlllllllllIlII = lllllllllllllIIlllIlllllllllIllI.toCharArray();
                int lllllllllllllIIlllIlllllllllIIll = SingleThreadEventExecutor$2.lIIIllllllllIl[0];
                final String lllllllllllllIIlllIllllllllIllIl = (Object)lllllllllllllIIlllIlllllllllIIlI.toCharArray();
                final boolean lllllllllllllIIlllIllllllllIllII = lllllllllllllIIlllIllllllllIllIl.length != 0;
                float lllllllllllllIIlllIllllllllIlIll = SingleThreadEventExecutor$2.lIIIllllllllIl[0];
                while (llIIlIIIllIlIII((int)lllllllllllllIIlllIllllllllIlIll, lllllllllllllIIlllIllllllllIllII ? 1 : 0)) {
                    final char lllllllllllllIIlllIllllllllllIII = lllllllllllllIIlllIllllllllIllIl[lllllllllllllIIlllIllllllllIlIll];
                    lllllllllllllIIlllIlllllllllIlIl.append((char)(lllllllllllllIIlllIllllllllllIII ^ lllllllllllllIIlllIlllllllllIlII[lllllllllllllIIlllIlllllllllIIll % lllllllllllllIIlllIlllllllllIlII.length]));
                    "".length();
                    ++lllllllllllllIIlllIlllllllllIIll;
                    ++lllllllllllllIIlllIllllllllIlIll;
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return null;
                    }
                }
                return String.valueOf(lllllllllllllIIlllIlllllllllIlIl);
            }
            
            private static boolean llIIlIIIllIlIlI(final int lllllllllllllIIlllIlllllllIIlIII) {
                return lllllllllllllIIlllIlllllllIIlIII == 0;
            }
            
            private static String llIIlIIIllIIIII(final String lllllllllllllIIlllIlllllllIlIIll, final String lllllllllllllIIlllIlllllllIlIlII) {
                try {
                    final SecretKeySpec lllllllllllllIIlllIlllllllIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlllllllIlIlII.getBytes(StandardCharsets.UTF_8)), SingleThreadEventExecutor$2.lIIIllllllllIl[9]), "DES");
                    final Cipher lllllllllllllIIlllIlllllllIlIlll = Cipher.getInstance("DES");
                    lllllllllllllIIlllIlllllllIlIlll.init(SingleThreadEventExecutor$2.lIIIllllllllIl[3], lllllllllllllIIlllIlllllllIllIII);
                    return new String(lllllllllllllIIlllIlllllllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlllllllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlllIlllllllIlIllI) {
                    lllllllllllllIIlllIlllllllIlIllI.printStackTrace();
                    return null;
                }
            }
            
            private static int llIIlIIIllIIlll(final long n, final long n2) {
                return lcmp(n, n2);
            }
            
            static {
                llIIlIIIllIIllI();
                llIIlIIIllIIlII();
            }
            
            @Override
            public void run() {
                boolean lllllllllllllIIllllIIIIIIIIlIIII = SingleThreadEventExecutor$2.lIIIllllllllIl[0] != 0;
                SingleThreadEventExecutor.this.updateLastExecutionTime();
                try {
                    SingleThreadEventExecutor.this.run();
                    lllllllllllllIIllllIIIIIIIIlIIII = (SingleThreadEventExecutor$2.lIIIllllllllIl[1] != 0);
                    do {
                        final int lllllllllllllIIllllIIIIIIIIlIlIl = SingleThreadEventExecutor.STATE_UPDATER.get(SingleThreadEventExecutor.this);
                        if (llIIlIIIllIlIII(lllllllllllllIIllllIIIIIIIIlIlIl, SingleThreadEventExecutor$2.lIIIllllllllIl[2])) {
                            if (!llIIlIIIllIlIIl(SingleThreadEventExecutor.STATE_UPDATER.compareAndSet(SingleThreadEventExecutor.this, lllllllllllllIIllllIIIIIIIIlIlIl, SingleThreadEventExecutor$2.lIIIllllllllIl[2]) ? 1 : 0)) {
                                "".length();
                                continue;
                            }
                            "".length();
                            if (" ".length() <= 0) {
                                return;
                            }
                        }
                        if (llIIlIIIllIlIIl(lllllllllllllIIllllIIIIIIIIlIIII ? 1 : 0) && llIIlIIIllIlIlI(llIIlIIIllIIlll(SingleThreadEventExecutor.this.gracefulShutdownStartTime, 0L))) {
                            SingleThreadEventExecutor.logger.error(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[0]]).append(EventExecutor.class.getSimpleName()).append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[1]]).append(SingleThreadEventExecutor.class.getSimpleName()).append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[3]]).append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[2]])));
                        }
                        try {
                            while (!llIIlIIIllIlIIl(SingleThreadEventExecutor.this.confirmShutdown() ? 1 : 0)) {}
                            "".length();
                            if (" ".length() == "  ".length()) {
                                return;
                            }
                            try {
                                SingleThreadEventExecutor.this.cleanup();
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[5]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                                "".length();
                                if ("  ".length() == 0) {
                                    return;
                                }
                            }
                            finally {
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[4]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                            }
                            "".length();
                            if (((0xC7 ^ 0x9D) & ~(0x3C ^ 0x66)) != 0x0) {
                                return;
                            }
                        }
                        finally {
                            try {
                                SingleThreadEventExecutor.this.cleanup();
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[7]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                                "".length();
                                if (" ".length() >= "  ".length()) {
                                    return;
                                }
                            }
                            finally {
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[8]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                            }
                        }
                        "".length();
                        if (-(0xC8 ^ 0xBD ^ (0x59 ^ 0x29)) >= 0) {
                            return;
                        }
                    } while (((0x90 ^ 0x8C ^ (0x2F ^ 0x69)) & (0x54 ^ 0x38 ^ (0x6F ^ 0x59) ^ -" ".length())) <= " ".length());
                }
                catch (Throwable lllllllllllllIIllllIIIIIIIIlIlII) {
                    SingleThreadEventExecutor.logger.warn(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[9]], lllllllllllllIIllllIIIIIIIIlIlII);
                    do {
                        final int lllllllllllllIIllllIIIIIIIIlIIll = SingleThreadEventExecutor.STATE_UPDATER.get(SingleThreadEventExecutor.this);
                        if (llIIlIIIllIlIII(lllllllllllllIIllllIIIIIIIIlIIll, SingleThreadEventExecutor$2.lIIIllllllllIl[2])) {
                            if (!llIIlIIIllIlIIl(SingleThreadEventExecutor.STATE_UPDATER.compareAndSet(SingleThreadEventExecutor.this, lllllllllllllIIllllIIIIIIIIlIIll, SingleThreadEventExecutor$2.lIIIllllllllIl[2]) ? 1 : 0)) {
                                "".length();
                                continue;
                            }
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        if (llIIlIIIllIlIIl(lllllllllllllIIllllIIIIIIIIlIIII ? 1 : 0) && llIIlIIIllIlIlI(llIIlIIIllIIlll(SingleThreadEventExecutor.this.gracefulShutdownStartTime, 0L))) {
                            SingleThreadEventExecutor.logger.error(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[10]]).append(EventExecutor.class.getSimpleName()).append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[11]]).append(SingleThreadEventExecutor.class.getSimpleName()).append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[12]]).append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[13]])));
                        }
                        try {
                            while (!llIIlIIIllIlIIl(SingleThreadEventExecutor.this.confirmShutdown() ? 1 : 0)) {}
                            "".length();
                            if ("   ".length() <= " ".length()) {
                                return;
                            }
                            try {
                                SingleThreadEventExecutor.this.cleanup();
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[14]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                                "".length();
                                if (("   ".length() & ~"   ".length()) >= "  ".length()) {
                                    return;
                                }
                            }
                            finally {
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[15]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                            }
                            "".length();
                            if (" ".length() != " ".length()) {
                                return;
                            }
                        }
                        finally {
                            try {
                                SingleThreadEventExecutor.this.cleanup();
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[16]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                                "".length();
                                if (-"  ".length() > 0) {
                                    return;
                                }
                            }
                            finally {
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[17]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                            }
                        }
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                    } while (-(0xA4 ^ 0xA1) < 0);
                }
                finally {
                    do {
                        final int lllllllllllllIIllllIIIIIIIIlIIlI = SingleThreadEventExecutor.STATE_UPDATER.get(SingleThreadEventExecutor.this);
                        if (llIIlIIIllIlIII(lllllllllllllIIllllIIIIIIIIlIIlI, SingleThreadEventExecutor$2.lIIIllllllllIl[2])) {
                            if (!llIIlIIIllIlIIl(SingleThreadEventExecutor.STATE_UPDATER.compareAndSet(SingleThreadEventExecutor.this, lllllllllllllIIllllIIIIIIIIlIIlI, SingleThreadEventExecutor$2.lIIIllllllllIl[2]) ? 1 : 0)) {
                                "".length();
                                continue;
                            }
                            "".length();
                            if (((0xC6 ^ 0x90) & ~(0x5F ^ 0x9)) != 0x0) {
                                return;
                            }
                        }
                        if (llIIlIIIllIlIIl(lllllllllllllIIllllIIIIIIIIlIIII ? 1 : 0) && llIIlIIIllIlIlI(llIIlIIIllIIlll(SingleThreadEventExecutor.this.gracefulShutdownStartTime, 0L))) {
                            SingleThreadEventExecutor.logger.error(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[18]]).append(EventExecutor.class.getSimpleName()).append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[19]]).append(SingleThreadEventExecutor.class.getSimpleName()).append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[20]]).append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[21]])));
                        }
                        try {
                            while (!llIIlIIIllIlIIl(SingleThreadEventExecutor.this.confirmShutdown() ? 1 : 0)) {}
                            "".length();
                            if (null != null) {
                                return;
                            }
                            try {
                                SingleThreadEventExecutor.this.cleanup();
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[22]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            }
                            finally {
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[23]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                            }
                            "".length();
                            if (-(114 + 128 - 143 + 50 ^ 60 + 140 - 189 + 133) >= 0) {
                                return;
                            }
                        }
                        finally {
                            try {
                                SingleThreadEventExecutor.this.cleanup();
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[24]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            }
                            finally {
                                SingleThreadEventExecutor.STATE_UPDATER.set(SingleThreadEventExecutor.this, SingleThreadEventExecutor$2.lIIIllllllllIl[4]);
                                SingleThreadEventExecutor.this.threadLock.release();
                                if (llIIlIIIllIlIlI(SingleThreadEventExecutor.this.taskQueue.isEmpty() ? 1 : 0)) {
                                    SingleThreadEventExecutor.logger.warn(String.valueOf(new StringBuilder().append(SingleThreadEventExecutor$2.lIIIlllllllIIl[SingleThreadEventExecutor$2.lIIIllllllllIl[25]]).append(SingleThreadEventExecutor.this.taskQueue.size()).append((char)SingleThreadEventExecutor$2.lIIIllllllllIl[6])));
                                }
                                SingleThreadEventExecutor.this.terminationFuture.setSuccess(null);
                                "".length();
                            }
                        }
                    } while (" ".length() != 0);
                }
            }
            
            private static String llIIlIIIllIIIIl(final String lllllllllllllIIlllIllllllllIIIII, final String lllllllllllllIIlllIlllllllIlllll) {
                try {
                    final SecretKeySpec lllllllllllllIIlllIllllllllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlllllllIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlllIllllllllIIlII = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlllIllllllllIIlII.init(SingleThreadEventExecutor$2.lIIIllllllllIl[3], lllllllllllllIIlllIllllllllIIlIl);
                    return new String(lllllllllllllIIlllIllllllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllllllllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlllIllllllllIIIll) {
                    lllllllllllllIIlllIllllllllIIIll.printStackTrace();
                    return null;
                }
            }
            
            private static boolean llIIlIIIllIlIII(final int lllllllllllllIIlllIlllllllIIllIl, final int lllllllllllllIIlllIlllllllIIllII) {
                return lllllllllllllIIlllIlllllllIIllIl < lllllllllllllIIlllIlllllllIIllII;
            }
        });
        this.taskQueue = this.newTaskQueue();
    }
    
    private static void llIlIIlIlIlIlIl() {
        (lIIlIllIlIIlIl = new String[SingleThreadEventExecutor.lIIlIllIlIlIll[34]])[SingleThreadEventExecutor.lIIlIllIlIlIll[0]] = llIlIIlIlIIIlll("zHi2j3R5syCdoS+gZJBbeQ==", "XxjAm");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[1]] = llIlIIlIlIIlIII("LgAmIA==", "ZaUKl");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[2]] = llIlIIlIlIIlIII("BgcjHw==", "rfPtZ");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[3]] = llIlIIlIlIIIlll("oncYuMUKa04dRi9HgbVV20R0WhOXbUkBq7k4fLviVPA=", "evWMc");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[4]] = llIlIIlIlIIlIIl("ZLrwsic4AuLIPJz/xHZAgKAhTHO6Oq0ELGGIEa5/0hc=", "abfSG");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[5]] = llIlIIlIlIIIlll("B4Vo72FEhg2RjkC/6A6By+SrXm0sLP/SSwNspAJk/67960nnT54Nww==", "TctZG");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[6]] = llIlIIlIlIIIlll("vYHKX+yY4OtmnDGG6yQTOg==", "ryFcF");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[7]] = llIlIIlIlIIIlll("KW3YKw0BqcowGwimIrLEZTCZELinEZzy", "MnVGr");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[8]] = llIlIIlIlIIlIIl("UU/tI8CQjpNH0HDCf1J51g==", "mRqaz");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[9]] = llIlIIlIlIIIlll("BvOgPqpdDuBaV8Xj/jneBtqKjRLIgmSGe+tqbsIOB6Q=", "hDcAW");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[10]] = llIlIIlIlIIIlll("d4t05LB/RBM=", "Gfsku");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[11]] = llIlIIlIlIIIlll("ka1hRaAwJUw=", "MaGNO");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[12]] = llIlIIlIlIIlIII("HjERA3URIUIeOwUrCRIxUyIQGDhTJQxXMAUhDAN1HysNBw==", "sDbwU");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[13]] = llIlIIlIlIIIlll("Hqr3ATTX8JM=", "kToII");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[14]] = llIlIIlIlIIlIII("AQoePgkWSxEnBwsfUCQDEAYZPgcWAh8+Rg0NUCQOB0sTJRQQDh4kRhYDAjUHBg==", "bkpPf");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[15]] = llIlIIlIlIIlIIl("sjFM8j/maos=", "UxkXE");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[16]] = llIlIIlIlIIlIII("AiwzHABHPy4XFxIuOQBUEz8kHx0JOyIXEA==", "gZVrt");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[17]] = llIlIIlIlIIlIII("DCwFFRIBJw==", "oChxs");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[18]] = llIlIIlIlIIlIIl("XsvAPmW9ndw=", "GVaAm");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[19]] = llIlIIlIlIIlIII("JQEpLBN7RGApSmkBPT0PIhAgKVBhWnhtWmg=", "AdEMj");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[20]] = llIlIIlIlIIIlll("uUcGpo9tQsvsx3+sIfXZ3Q==", "aqczx");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[21]] = llIlIIlIlIIlIIl("XOQqp+Jd7eQ=", "ohQPe");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[22]] = llIlIIlIlIIIlll("xlj86AAL+2gu9PigqVOKpl+0Mxi2mJQSsh8+KB4uoKs=", "PPcKG");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[23]] = llIlIIlIlIIIlll("cDpd8w3C4Wo=", "VbYoa");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[24]] = llIlIIlIlIIIlll("jtCT9MkS4Jc=", "oEtnU");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[25]] = llIlIIlIlIIlIII("MSsOHx85KSMOGjk8XUtTPGVPDg4oIAQfEzx/R1VLeHVO", "XEgkv");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[26]] = llIlIIlIlIIlIII("ICswDCI0dGJAKXBmJx09NS02AClqbnxFfXk=", "PNBeM");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[27]] = llIlIIlIlIIIlll("PiTqkPP4cnI=", "sMyOF");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[28]] = llIlIIlIlIIlIII("DwMfOw==", "zmvOC");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[29]] = llIlIIlIlIIlIIl("8oj+dr/txTCZfR4Xvm19WvG+bw3H5ADV8aP11tVniNTFLMv4wamk1A==", "BjuNF");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[30]] = llIlIIlIlIIIlll("kPK+9sL+qEGn6kJCzESgozTYCzlYAJrTXeqEVkVUoiM=", "ToTPh");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[31]] = llIlIIlIlIIlIIl("uStUfCD1DYo=", "woyMu");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[32]] = llIlIIlIlIIlIIl("79VWnPP7YvU=", "seckL");
        SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[33]] = llIlIIlIlIIlIIl("9CokF7WqxCg=", "gGcJw");
    }
    
    private static boolean llIlIIlIlllIIII(final int lllllllllllllIIllIIIllIlllIllIll, final int lllllllllllllIIllIIIllIlllIllIlI) {
        return lllllllllllllIIllIIIllIlllIllIll >= lllllllllllllIIllIIIllIlllIllIlI;
    }
    
    private static boolean llIlIIlIlIlllIl(final Object lllllllllllllIIllIIIllIlllIIlllI) {
        return lllllllllllllIIllIIIllIlllIIlllI == null;
    }
    
    protected long delayNanos(final long lllllllllllllIIllIIIllllIIllIIll) {
        final ScheduledFutureTask<?> lllllllllllllIIllIIIllllIIllIIlI = this.delayedTaskQueue.peek();
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIllllIIllIIlI)) {
            return SingleThreadEventExecutor.SCHEDULE_PURGE_INTERVAL;
        }
        return lllllllllllllIIllIIIllllIIllIIlI.delayNanos(lllllllllllllIIllIIIllllIIllIIll);
    }
    
    protected void interruptThread() {
        this.thread.interrupt();
    }
    
    private void fetchFromDelayedQueue() {
        long lllllllllllllIIllIIIllllIlllIlIl = 0L;
        do {
            final ScheduledFutureTask<?> lllllllllllllIIllIIIllllIlllIlll = this.delayedTaskQueue.peek();
            if (llIlIIlIlIlllIl(lllllllllllllIIllIIIllllIlllIlll)) {
                "".length();
                if (" ".length() > (0x3A ^ 0x33 ^ (0x13 ^ 0x1E))) {
                    return;
                }
            }
            else {
                if (llIlIIlIlIllllI(llIlIIlIllIIIll(lllllllllllllIIllIIIllllIlllIlIl, 0L))) {
                    lllllllllllllIIllIIIllllIlllIlIl = ScheduledFutureTask.nanoTime();
                }
                if (llIlIIlIllIIlII(llIlIIlIllIIIll(lllllllllllllIIllIIIllllIlllIlll.deadlineNanos(), lllllllllllllIIllIIIllllIlllIlIl))) {
                    this.delayedTaskQueue.remove();
                    "".length();
                    this.taskQueue.add(lllllllllllllIIllIIIllllIlllIlll);
                    "".length();
                    "".length();
                    continue;
                }
            }
        } while ("   ".length() >= "  ".length());
    }
    
    private static int llIlIIlIlllIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public void execute(final Runnable lllllllllllllIIllIIIlllIlIlIIIIl) {
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIlIlIIIIl)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[15]]);
        }
        final boolean lllllllllllllIIllIIIlllIlIlIIIII = this.inEventLoop();
        if (llIlIIlIllIIllI(lllllllllllllIIllIIIlllIlIlIIIII ? 1 : 0)) {
            this.addTask(lllllllllllllIIllIIIlllIlIlIIIIl);
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            this.startThread();
            this.addTask(lllllllllllllIIllIIIlllIlIlIIIIl);
            if (llIlIIlIllIIllI(this.isShutdown() ? 1 : 0) && llIlIIlIllIIllI(this.removeTask(lllllllllllllIIllIIIlllIlIlIIIIl) ? 1 : 0)) {
                reject();
            }
        }
        if (llIlIIlIlIllllI(this.addTaskWakesUp ? 1 : 0) && llIlIIlIllIIllI(this.wakesUpForTask(lllllllllllllIIllIIIlllIlIlIIIIl) ? 1 : 0)) {
            this.wakeup(lllllllllllllIIllIIIlllIlIlIIIII);
        }
    }
    
    protected void addTask(final Runnable lllllllllllllIIllIIIllllIlIlllll) {
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIllllIlIlllll)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[1]]);
        }
        if (llIlIIlIllIIllI(this.isShutdown() ? 1 : 0)) {
            reject();
        }
        this.taskQueue.add(lllllllllllllIIllIIIllllIlIlllll);
        "".length();
    }
    
    protected boolean runAllTasks() {
        this.fetchFromDelayedQueue();
        Runnable lllllllllllllIIllIIIllllIlIlIIIl = this.pollTask();
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIllllIlIlIIIl)) {
            return SingleThreadEventExecutor.lIIlIllIlIlIll[0] != 0;
        }
        do {
            try {
                lllllllllllllIIllIIIllllIlIlIIIl.run();
                "".length();
                if (" ".length() <= 0) {
                    return ((200 + 19 - 140 + 138 ^ 93 + 34 - 11 + 17) & (59 + 88 - 66 + 171 ^ 141 + 134 - 137 + 22 ^ -" ".length())) != 0x0;
                }
            }
            catch (Throwable lllllllllllllIIllIIIllllIlIlIIll) {
                SingleThreadEventExecutor.logger.warn(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[3]], lllllllllllllIIllIIIllllIlIlIIll);
            }
            lllllllllllllIIllIIIllllIlIlIIIl = this.pollTask();
        } while (!llIlIIlIlIlllIl(lllllllllllllIIllIIIllllIlIlIIIl));
        this.lastExecutionTime = ScheduledFutureTask.nanoTime();
        return SingleThreadEventExecutor.lIIlIllIlIlIll[1] != 0;
    }
    
    private static int llIlIIlIllIIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIlIIlIllIlIlI(final int lllllllllllllIIllIIIllIlllIIlIII) {
        return lllllllllllllIIllIIIllIlllIIlIII >= 0;
    }
    
    private static boolean llIlIIlIllIIllI(final int lllllllllllllIIllIIIllIlllIIllII) {
        return lllllllllllllIIllIIIllIlllIIllII != 0;
    }
    
    @Override
    public boolean awaitTermination(final long lllllllllllllIIllIIIlllIlIlIlIlI, final TimeUnit lllllllllllllIIllIIIlllIlIlIIllI) throws InterruptedException {
        if (llIlIIlIlIlllIl(lllllllllllllIIllIIIlllIlIlIIllI)) {
            throw new NullPointerException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[13]]);
        }
        if (llIlIIlIllIIllI(this.inEventLoop() ? 1 : 0)) {
            throw new IllegalStateException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[14]]);
        }
        if (llIlIIlIllIIllI(this.threadLock.tryAcquire(lllllllllllllIIllIIIlllIlIlIlIlI, lllllllllllllIIllIIIlllIlIlIIllI) ? 1 : 0)) {
            this.threadLock.release();
        }
        return this.isTerminated();
    }
    
    private static String llIlIIlIlIIIlll(final String lllllllllllllIIllIIIllIlllllIlII, final String lllllllllllllIIllIIIllIlllllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIIIllIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIllIlllllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIIllIlllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIIllIlllllIllI.init(SingleThreadEventExecutor.lIIlIllIlIlIll[2], lllllllllllllIIllIIIllIlllllIlll);
            return new String(lllllllllllllIIllIIIllIlllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIllIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIIllIlllllIlIl) {
            lllllllllllllIIllIIIllIlllllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIlIlIllllI(final int lllllllllllllIIllIIIllIlllIIlIlI) {
        return lllllllllllllIIllIIIllIlllIIlIlI == 0;
    }
    
    private void startThread() {
        if (llIlIIlIllIllII(SingleThreadEventExecutor.STATE_UPDATER.get(this), SingleThreadEventExecutor.lIIlIllIlIlIll[1]) && llIlIIlIllIIllI(SingleThreadEventExecutor.STATE_UPDATER.compareAndSet(this, SingleThreadEventExecutor.lIIlIllIlIlIll[1], SingleThreadEventExecutor.lIIlIllIlIlIll[2]) ? 1 : 0)) {
            this.delayedTaskQueue.add(new ScheduledFutureTask<Object>(this, this.delayedTaskQueue, Executors.callable(new PurgeTask(), (Object)null), ScheduledFutureTask.deadlineNanos(SingleThreadEventExecutor.SCHEDULE_PURGE_INTERVAL), -SingleThreadEventExecutor.SCHEDULE_PURGE_INTERVAL));
            "".length();
            this.thread.start();
        }
    }
    
    private static boolean llIlIIlIllIIlII(final int lllllllllllllIIllIIIllIlllIIIlII) {
        return lllllllllllllIIllIIIllIlllIIIlII <= 0;
    }
    
    protected static void reject() {
        throw new RejectedExecutionException(SingleThreadEventExecutor.lIIlIllIlIIlIl[SingleThreadEventExecutor.lIIlIllIlIlIll[16]]);
    }
    
    private static int llIlIIlIllIlllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected Runnable peekTask() {
        if (llIlIIlIlIllllI(SingleThreadEventExecutor.$assertionsDisabled ? 1 : 0) && llIlIIlIlIllllI(this.inEventLoop() ? 1 : 0)) {
            throw new AssertionError();
        }
        return this.taskQueue.peek();
    }
    
    private final class PurgeTask implements Runnable
    {
        private static boolean lIlIIllIIIIIIIlI(final int llllllllllllIlIlIllllllllIlIlIIl) {
            return llllllllllllIlIlIllllllllIlIlIIl != 0;
        }
        
        @Override
        public void run() {
            final Iterator<ScheduledFutureTask<?>> llllllllllllIlIlIllllllllIllIlIl = SingleThreadEventExecutor.this.delayedTaskQueue.iterator();
            while (lIlIIllIIIIIIIlI(llllllllllllIlIlIllllllllIllIlIl.hasNext() ? 1 : 0)) {
                final ScheduledFutureTask<?> llllllllllllIlIlIllllllllIllIlll = llllllllllllIlIlIllllllllIllIlIl.next();
                if (lIlIIllIIIIIIIlI(llllllllllllIlIlIllllllllIllIlll.isCancelled() ? 1 : 0)) {
                    llllllllllllIlIlIllllllllIllIlIl.remove();
                }
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
        }
    }
}
