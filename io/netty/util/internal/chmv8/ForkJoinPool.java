// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.chmv8;

import java.util.concurrent.RejectedExecutionException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.security.Permission;
import io.netty.util.internal.ThreadLocalRandom;
import java.security.PrivilegedAction;
import java.util.concurrent.TimeUnit;
import java.security.PrivilegedActionException;
import java.security.AccessController;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.Callable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Future;
import sun.misc.Unsafe;
import java.util.concurrent.AbstractExecutorService;

public class ForkJoinPool extends AbstractExecutorService
{
    final /* synthetic */ short mode;
    static final /* synthetic */ ForkJoinPool common;
    private static final /* synthetic */ int[] lIllIIIIlIlIII;
    volatile /* synthetic */ long stealCount;
    private static final /* synthetic */ Unsafe U;
    private static final /* synthetic */ long CTL;
    public static final /* synthetic */ ForkJoinWorkerThreadFactory defaultForkJoinWorkerThreadFactory;
    private static final /* synthetic */ long QBASE;
    private static final /* synthetic */ int ABASE;
    static final /* synthetic */ int commonParallelism;
    private static final /* synthetic */ String[] lIllIIIIlIIlll;
    private static final /* synthetic */ long PLOCK;
    private static final /* synthetic */ long STEALCOUNT;
    private static final /* synthetic */ long INDEXSEED;
    final /* synthetic */ short parallelism;
    private static /* synthetic */ int poolNumberSequence;
    /* synthetic */ WorkQueue[] workQueues;
    final /* synthetic */ Thread.UncaughtExceptionHandler ueh;
    final /* synthetic */ String workerNamePrefix;
    volatile /* synthetic */ int plock;
    volatile /* synthetic */ long ctl;
    private static final /* synthetic */ long QLOCK;
    private static final /* synthetic */ int ASHIFT;
    private static final /* synthetic */ long PARKBLOCKER;
    volatile /* synthetic */ int indexSeed;
    private static final /* synthetic */ RuntimePermission modifyThreadPermission;
    final /* synthetic */ ForkJoinWorkerThreadFactory factory;
    static final /* synthetic */ ThreadLocal<Submitter> submitters;
    
    final void signalWork(final WorkQueue[] lllllllllllllIIIIlIIIIlIlllllIlI, final WorkQueue lllllllllllllIIIIlIIIIlIllllIllI) {
        long lllllllllllllIIIIlIIIIllIIIIIIlI;
        int lllllllllllllIIIIlIIIIllIIIIIIII;
        while (!llllIllIIllllII(lllllllllllllIIIIlIIIIllIIIIIIII = (int)((lllllllllllllIIIIlIIIIllIIIIIIlI = this.ctl) >>> ForkJoinPool.lIllIIIIlIlIII[3]))) {
            final int lllllllllllllIIIIlIIIIllIIIIIIIl;
            if (llllIllIlIIIllI(lllllllllllllIIIIlIIIIllIIIIIIIl = (int)lllllllllllllIIIIlIIIIllIIIIIIlI)) {
                if (llllIllIIllllIl((short)lllllllllllllIIIIlIIIIllIIIIIIII)) {
                    this.tryAddWorker();
                    "".length();
                    if (-(0x9E ^ 0xA2 ^ (0x76 ^ 0x4F)) >= 0) {
                        return;
                    }
                }
            }
            else {
                final int lllllllllllllIIIIlIIIIlIllllllll;
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIlllllIlI) && llllIllIlIIIlIl(lllllllllllllIIIIlIIIIlIlllllIlI.length, lllllllllllllIIIIlIIIIlIllllllll = (lllllllllllllIIIIlIIIIllIIIIIIIl & ForkJoinPool.lIllIIIIlIlIII[5]))) {
                    final WorkQueue lllllllllllllIIIIlIIIIlIlllllllI;
                    if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIlIlllllllI = lllllllllllllIIIIlIIIIlIlllllIlI[lllllllllllllIIIIlIIIIlIllllllll])) {
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        final long lllllllllllllIIIIlIIIIlIllllllIl = (long)(lllllllllllllIIIIlIIIIlIlllllllI.nextWait & ForkJoinPool.lIllIIIIlIlIII[9]) | (long)(lllllllllllllIIIIlIIIIllIIIIIIII + ForkJoinPool.lIllIIIIlIlIII[6]) << ForkJoinPool.lIllIIIIlIlIII[3];
                        final int lllllllllllllIIIIlIIIIlIllllllII = lllllllllllllIIIIlIIIIllIIIIIIIl + ForkJoinPool.lIllIIIIlIlIII[6] & ForkJoinPool.lIllIIIIlIlIII[9];
                        if (llllIllIlIIIlll(lllllllllllllIIIIlIIIIlIlllllllI.eventCount, lllllllllllllIIIIlIIIIllIIIIIIIl | Integer.MIN_VALUE) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIllIIIIIIlI, lllllllllllllIIIIlIIIIlIllllllIl) ? 1 : 0)) {
                            lllllllllllllIIIIlIIIIlIlllllllI.eventCount = lllllllllllllIIIIlIIIIlIllllllII;
                            final Thread lllllllllllllIIIIlIIIIllIIIIIIll;
                            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIllIIIIIIll = lllllllllllllIIIIlIIIIlIlllllllI.parker)) {
                                ForkJoinPool.U.unpark(lllllllllllllIIIIlIIIIllIIIIIIll);
                                "".length();
                                if (-(0xC5 ^ 0xC1) > 0) {
                                    return;
                                }
                            }
                        }
                        else if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIllllIllI) && llllIllIIllllll(lllllllllllllIIIIlIIIIlIllllIllI.base, lllllllllllllIIIIlIIIIlIllllIllI.top)) {
                            "".length();
                            if ("   ".length() <= " ".length()) {
                                return;
                            }
                        }
                        else {
                            "".length();
                            if ("   ".length() < 0) {
                                return;
                            }
                            continue;
                        }
                    }
                }
            }
            return;
        }
        "".length();
        if (((0x48 ^ 0x1F) & ~(0x59 ^ 0xE)) != 0x0) {
            return;
        }
    }
    
    public long getQueuedTaskCount() {
        long lllllllllllllIIIIlIIIIIIIIIlIIll = 0L;
        final WorkQueue[] lllllllllllllIIIIlIIIIIIIIIlIIlI;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIIIIlIIlI = this.workQueues)) {
            int lllllllllllllIIIIlIIIIIIIIIlIlIl = ForkJoinPool.lIllIIIIlIlIII[0];
            while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIIIIIlIlIl, lllllllllllllIIIIlIIIIIIIIIlIIlI.length)) {
                final WorkQueue lllllllllllllIIIIlIIIIIIIIIlIllI;
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIIIIlIllI = lllllllllllllIIIIlIIIIIIIIIlIIlI[lllllllllllllIIIIlIIIIIIIIIlIlIl])) {
                    lllllllllllllIIIIlIIIIIIIIIlIIll += lllllllllllllIIIIlIIIIIIIIIlIllI.queueSize();
                }
                lllllllllllllIIIIlIIIIIIIIIlIlIl += 2;
                "".length();
                if (((14 + 171 - 37 + 71 ^ 139 + 141 - 277 + 144) & (214 + 56 - 248 + 229 ^ 48 + 161 - 138 + 108 ^ -" ".length())) >= "  ".length()) {
                    return 0L;
                }
            }
        }
        return lllllllllllllIIIIlIIIIIIIIIlIIll;
    }
    
    private static boolean llllIllIlIIIllI(final int lllllllllllllIIIIIlllllIlIlIIIII) {
        return lllllllllllllIIIIIlllllIlIlIIIII <= 0;
    }
    
    @Override
    public boolean isShutdown() {
        int n;
        if (llllIllIIllllIl(this.plock)) {
            n = ForkJoinPool.lIllIIIIlIlIII[0];
            "".length();
            if (-"  ".length() > 0) {
                return ((58 + 70 - 120 + 165 ^ 127 + 86 - 210 + 145) & (0x78 ^ 0x55 ^ (0xAA ^ 0xBE) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ForkJoinPool.lIllIIIIlIlIII[10];
        }
        return n != 0;
    }
    
    final int awaitJoin(final WorkQueue lllllllllllllIIIIlIIIIIlllIlIllI, final ForkJoinTask<?> lllllllllllllIIIIlIIIIIlllIlIIIl) {
        int lllllllllllllIIIIlIIIIIlllIlIlII = ForkJoinPool.lIllIIIIlIlIII[10];
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlllIlIIIl) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlllIlIlII = lllllllllllllIIIIlIIIIIlllIlIIIl.status) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlllIlIllI)) {
            final ForkJoinTask<?> lllllllllllllIIIIlIIIIIlllIllIIl = lllllllllllllIIIIlIIIIIlllIlIllI.currentJoin;
            lllllllllllllIIIIlIIIIIlllIlIllI.currentJoin = lllllllllllllIIIIlIIIIIlllIlIIIl;
            while (llllIllIIlllIll(lllllllllllllIIIIlIIIIIlllIlIllI.tryRemoveAndExec(lllllllllllllIIIIlIIIIIlllIlIIIl) ? 1 : 0) && !llllIllIIllllIl(lllllllllllllIIIIlIIIIIlllIlIlII = lllllllllllllIIIIlIIIIIlllIlIIIl.status)) {}
            if (llllIllIIllllII(lllllllllllllIIIIlIIIIIlllIlIlII) && llllIllIIlllIll((lllllllllllllIIIIlIIIIIlllIlIIIl instanceof CountedCompleter) ? 1 : 0)) {
                lllllllllllllIIIIlIIIIIlllIlIlII = this.helpComplete(lllllllllllllIIIIlIIIIIlllIlIllI, (CountedCompleter)lllllllllllllIIIIlIIIIIlllIlIIIl);
            }
            long lllllllllllllIIIIlIIIIIlllIllIII = 0L;
            while (llllIllIIllllII(lllllllllllllIIIIlIIIIIlllIlIlII) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlllIlIlII = lllllllllllllIIIIlIIIIIlllIlIIIl.status)) {
                if (llllIllIIlllIlI(lllllllllllllIIIIlIIIIIlllIlIlII = this.tryHelpStealer(lllllllllllllIIIIlIIIIIlllIlIllI, lllllllllllllIIIIlIIIIIlllIlIIIl)) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlllIlIlII = lllllllllllllIIIIlIIIIIlllIlIIIl.status)) {
                    if (llllIllIIlllIlI(this.tryCompensate(lllllllllllllIIIIlIIIIIlllIllIII) ? 1 : 0)) {
                        lllllllllllllIIIIlIIIIIlllIllIII = this.ctl;
                        "".length();
                        if (null != null) {
                            return (3 + 157 - 154 + 167 ^ 111 + 119 - 182 + 122) & (104 + 5 - 32 + 73 ^ 81 + 32 - 1 + 33 ^ -" ".length());
                        }
                        continue;
                    }
                    else {
                        if (llllIllIIlllIll(lllllllllllllIIIIlIIIIIlllIlIIIl.trySetSignal() ? 1 : 0) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlllIlIlII = lllllllllllllIIIIlIIIIIlllIlIIIl.status)) {
                            final Exception lllllllllllllIIIIlIIIIIlllIIllIl = (Exception)lllllllllllllIIIIlIIIIIlllIlIIIl;
                            synchronized (lllllllllllllIIIIlIIIIIlllIlIIIl) {
                                Label_0373: {
                                    if (llllIllIIllllII(lllllllllllllIIIIlIIIIIlllIlIIIl.status)) {
                                        try {
                                            lllllllllllllIIIIlIIIIIlllIlIIIl.wait();
                                            "".length();
                                            if (-" ".length() >= "  ".length()) {
                                                return (0x28 ^ 0x4F ^ (0x46 ^ 0x42)) & (0x13 ^ 0x1 ^ (0xE5 ^ 0x94) ^ -" ".length());
                                            }
                                            break Label_0373;
                                        }
                                        catch (InterruptedException lllllllllllllIIIIlIIIIIlllIllIll) {
                                            "".length();
                                            if (-"   ".length() >= 0) {
                                                return (0x7E ^ 0x0 ^ (0x1A ^ 0x40)) & (0x96 ^ 0xB8 ^ (0x13 ^ 0x19) ^ -" ".length());
                                            }
                                            break Label_0373;
                                        }
                                    }
                                    lllllllllllllIIIIlIIIIIlllIlIIIl.notifyAll();
                                }
                                // monitorexit(lllllllllllllIIIIlIIIIIlllIlIIIl)
                                "".length();
                                if (-(0x6 ^ 0x2) >= 0) {
                                    return (0x1C ^ 0x4B) & ~(0x3B ^ 0x6C);
                                }
                            }
                        }
                        long lllllllllllllIIIIlIIIIIlllIllIlI;
                        while (!llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIIlllIllIlI = this.ctl, (lllllllllllllIIIIlIIIIIlllIllIlI & 0xFFFFFFFFFFFFL) | (lllllllllllllIIIIlIIIIIlllIllIlI & 0xFFFF000000000000L) + 281474976710656L) ? 1 : 0)) {}
                        "".length();
                        if (" ".length() >= "  ".length()) {
                            return (62 + 17 + 62 + 84 ^ 143 + 17 - 113 + 146) & (76 + 54 - 112 + 145 ^ 9 + 44 + 77 + 1 ^ -" ".length());
                        }
                        continue;
                    }
                }
            }
            lllllllllllllIIIIlIIIIIlllIlIllI.currentJoin = lllllllllllllIIIIlIIIIIlllIllIIl;
        }
        return lllllllllllllIIIIlIIIIIlllIlIlII;
    }
    
    private static int llllIllIlIlIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public ForkJoinPool(final int lllllllllllllIIIIlIIIIIIllIlllIl) {
        this(lllllllllllllIIIIlIIIIIIllIlllIl, ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, (boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0));
    }
    
    @Override
    public ForkJoinTask<?> submit(final Runnable lllllllllllllIIIIlIIIIIIIlllIlll) {
        if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIIIIlllIlll)) {
            throw new NullPointerException();
        }
        ForkJoinTask<?> lllllllllllllIIIIlIIIIIIIllllIIl = null;
        if (llllIllIIlllIll((lllllllllllllIIIIlIIIIIIIlllIlll instanceof ForkJoinTask) ? 1 : 0)) {
            final ForkJoinTask<?> lllllllllllllIIIIlIIIIIIIlllllII = (ForkJoinTask<?>)lllllllllllllIIIIlIIIIIIIlllIlll;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIIIIlIIIIIIIllllIIl = new ForkJoinTask.AdaptedRunnableAction(lllllllllllllIIIIlIIIIIIIlllIlll);
        }
        this.externalPush(lllllllllllllIIIIlIIIIIIIllllIIl);
        return lllllllllllllIIIIlIIIIIIIllllIIl;
    }
    
    private void fullExternalPush(final ForkJoinTask<?> lllllllllllllIIIIlIIIIllIIlIIIIl) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: bipush          10
        //     5: iaload         
        //     6: istore_2        /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //     7: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.submitters:Ljava/lang/ThreadLocal;
        //    10: invokevirtual   java/lang/ThreadLocal.get:()Ljava/lang/Object;
        //    13: checkcast       Lio/netty/util/internal/chmv8/ForkJoinPool$Submitter;
        //    16: astore_3        /* lllllllllllllIIIIlIIIIllIIIlllll */
        //    17: aload_3         /* lllllllllllllIIIIlIIIIllIIlIIllI */
        //    18: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIlIIIIll:(Ljava/lang/Object;)Z
        //    21: ifeq            99
        //    24: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.U:Lsun/misc/Unsafe;
        //    27: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //    28: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.INDEXSEED:J
        //    31: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //    32: getfield        io/netty/util/internal/chmv8/ForkJoinPool.indexSeed:I
        //    35: dup            
        //    36: istore_2        /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //    37: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //    38: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //    41: bipush          8
        //    43: iaload         
        //    44: iadd           
        //    45: istore_2        /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //    46: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //    47: invokevirtual   sun/misc/Unsafe.compareAndSwapInt:(Ljava/lang/Object;JII)Z
        //    50: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIll:(I)Z
        //    53: ifeq            149
        //    56: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //    57: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIll:(I)Z
        //    60: ifeq            149
        //    63: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.submitters:Ljava/lang/ThreadLocal;
        //    66: new             Lio/netty/util/internal/chmv8/ForkJoinPool$Submitter;
        //    69: dup            
        //    70: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //    71: invokespecial   io/netty/util/internal/chmv8/ForkJoinPool$Submitter.<init>:(I)V
        //    74: dup            
        //    75: astore_3        /* lllllllllllllIIIIlIIIIllIIlIIllI */
        //    76: invokevirtual   java/lang/ThreadLocal.set:(Ljava/lang/Object;)V
        //    79: ldc             ""
        //    81: invokevirtual   java/lang/String.length:()I
        //    84: pop            
        //    85: bipush          74
        //    87: bipush          78
        //    89: ixor           
        //    90: ldc             "   "
        //    92: invokevirtual   java/lang/String.length:()I
        //    95: if_icmpgt       149
        //    98: return         
        //    99: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   100: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //   103: ifeq            149
        //   106: aload_3         /* lllllllllllllIIIIlIIIIllIIlIIllI */
        //   107: getfield        io/netty/util/internal/chmv8/ForkJoinPool$Submitter.seed:I
        //   110: istore_2        /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   111: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   112: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   113: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   116: bipush          15
        //   118: iaload         
        //   119: ishl           
        //   120: ixor           
        //   121: istore_2        /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   122: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   123: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   124: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   127: bipush          16
        //   129: iaload         
        //   130: iushr          
        //   131: ixor           
        //   132: istore_2        /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   133: aload_3         /* lllllllllllllIIIIlIIIIllIIlIIllI */
        //   134: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   135: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   136: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   139: bipush          17
        //   141: iaload         
        //   142: ishl           
        //   143: ixor           
        //   144: dup            
        //   145: istore_2        /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   146: putfield        io/netty/util/internal/chmv8/ForkJoinPool$Submitter.seed:I
        //   149: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   150: getfield        io/netty/util/internal/chmv8/ForkJoinPool.plock:I
        //   153: dup            
        //   154: istore          lllllllllllllIIIIlIIIIllIIlIlIIl
        //   156: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIllllIl:(I)Z
        //   159: ifeq            170
        //   162: new             Ljava/util/concurrent/RejectedExecutionException;
        //   165: dup            
        //   166: invokespecial   java/util/concurrent/RejectedExecutionException.<init>:()V
        //   169: athrow         
        //   170: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //   172: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIll:(I)Z
        //   175: ifeq            209
        //   178: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   179: getfield        io/netty/util/internal/chmv8/ForkJoinPool.workQueues:[Lio/netty/util/internal/chmv8/ForkJoinPool$WorkQueue;
        //   182: dup            
        //   183: astore          lllllllllllllIIIIlIIIIllIIllIllI
        //   185: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIIl:(Ljava/lang/Object;)Z
        //   188: ifeq            209
        //   191: aload           lllllllllllllIIIIlIIIIllIIllIllI
        //   193: arraylength    
        //   194: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   197: iconst_0       
        //   198: iaload         
        //   199: isub           
        //   200: dup            
        //   201: istore          lllllllllllllIIIIlIIIIllIIllIlIl
        //   203: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIllllIl:(I)Z
        //   206: ifeq            643
        //   209: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   210: getfield        io/netty/util/internal/chmv8/ForkJoinPool.parallelism:S
        //   213: istore          lllllllllllllIIIIlIIIIllIIllIlII
        //   215: iload           lllllllllllllIIIIlIIIIllIIllIlII
        //   217: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   220: iconst_0       
        //   221: iaload         
        //   222: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIlIIIlIl:(II)Z
        //   225: ifeq            258
        //   228: iload           lllllllllllllIIIIlIIIIllIIllIlII
        //   230: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   233: iconst_0       
        //   234: iaload         
        //   235: isub           
        //   236: ldc             ""
        //   238: invokevirtual   java/lang/String.length:()I
        //   241: pop            
        //   242: ldc_w           "  "
        //   245: invokevirtual   java/lang/String.length:()I
        //   248: ldc_w           "  "
        //   251: invokevirtual   java/lang/String.length:()I
        //   254: if_icmpge       263
        //   257: return         
        //   258: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   261: iconst_0       
        //   262: iaload         
        //   263: istore          lllllllllllllIIIIlIIIIllIIllIIll
        //   265: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   267: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   269: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   272: iconst_0       
        //   273: iaload         
        //   274: iushr          
        //   275: ior            
        //   276: istore          lllllllllllllIIIIlIIIIllIIllIIll
        //   278: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   280: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   282: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   285: iconst_2       
        //   286: iaload         
        //   287: iushr          
        //   288: ior            
        //   289: istore          lllllllllllllIIIIlIIIIllIIllIIll
        //   291: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   293: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   295: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   298: bipush          11
        //   300: iaload         
        //   301: iushr          
        //   302: ior            
        //   303: istore          lllllllllllllIIIIlIIIIllIIllIIll
        //   305: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   307: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   309: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   312: bipush          18
        //   314: iaload         
        //   315: iushr          
        //   316: ior            
        //   317: istore          lllllllllllllIIIIlIIIIllIIllIIll
        //   319: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   321: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   323: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   326: bipush          19
        //   328: iaload         
        //   329: iushr          
        //   330: ior            
        //   331: istore          lllllllllllllIIIIlIIIIllIIllIIll
        //   333: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   335: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   338: iconst_0       
        //   339: iaload         
        //   340: iadd           
        //   341: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   344: iconst_0       
        //   345: iaload         
        //   346: ishl           
        //   347: istore          lllllllllllllIIIIlIIIIllIIllIIll
        //   349: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   350: getfield        io/netty/util/internal/chmv8/ForkJoinPool.workQueues:[Lio/netty/util/internal/chmv8/ForkJoinPool$WorkQueue;
        //   353: dup            
        //   354: astore          lllllllllllllIIIIlIIIIllIIlIlIll
        //   356: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIIl:(Ljava/lang/Object;)Z
        //   359: ifeq            371
        //   362: aload           lllllllllllllIIIIlIIIIllIIlIlIll
        //   364: arraylength    
        //   365: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //   368: ifeq            447
        //   371: iload           lllllllllllllIIIIlIIIIllIIllIIll
        //   373: anewarray       Lio/netty/util/internal/chmv8/ForkJoinPool$WorkQueue;
        //   376: ldc             ""
        //   378: invokevirtual   java/lang/String.length:()I
        //   381: pop            
        //   382: bipush          80
        //   384: sipush          172
        //   387: iadd           
        //   388: sipush          193
        //   391: isub           
        //   392: sipush          149
        //   395: iadd           
        //   396: bipush          102
        //   398: bipush          18
        //   400: iadd           
        //   401: bipush          10
        //   403: isub           
        //   404: bipush          41
        //   406: iadd           
        //   407: ixor           
        //   408: sipush          237
        //   411: sipush          223
        //   414: iadd           
        //   415: sipush          449
        //   418: isub           
        //   419: sipush          227
        //   422: iadd           
        //   423: bipush          65
        //   425: bipush          36
        //   427: iadd           
        //   428: bipush          -62
        //   430: isub           
        //   431: bipush          6
        //   433: iadd           
        //   434: ixor           
        //   435: ldc             " "
        //   437: invokevirtual   java/lang/String.length:()I
        //   440: ineg           
        //   441: ixor           
        //   442: iand           
        //   443: ifeq            448
        //   446: return         
        //   447: aconst_null    
        //   448: astore          lllllllllllllIIIIlIIIIllIIllIIlI
        //   450: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   451: getfield        io/netty/util/internal/chmv8/ForkJoinPool.plock:I
        //   454: dup            
        //   455: istore          lllllllllllllIIIIlIIIIllIIlIlIIl
        //   457: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   460: iconst_2       
        //   461: iaload         
        //   462: iand           
        //   463: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //   466: ifeq            492
        //   469: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.U:Lsun/misc/Unsafe;
        //   472: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   473: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.PLOCK:J
        //   476: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //   478: iinc            lllllllllllllIIIIlIIIIllIIlIlIIl, 2
        //   481: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //   483: invokevirtual   sun/misc/Unsafe.compareAndSwapInt:(Ljava/lang/Object;JII)Z
        //   486: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //   489: ifeq            498
        //   492: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   493: invokespecial   io/netty/util/internal/chmv8/ForkJoinPool.acquirePlock:()I
        //   496: istore          lllllllllllllIIIIlIIIIllIIlIlIIl
        //   498: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   499: getfield        io/netty/util/internal/chmv8/ForkJoinPool.workQueues:[Lio/netty/util/internal/chmv8/ForkJoinPool$WorkQueue;
        //   502: dup            
        //   503: astore          lllllllllllllIIIIlIIIIllIIlIlIll
        //   505: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIIl:(Ljava/lang/Object;)Z
        //   508: ifeq            520
        //   511: aload           lllllllllllllIIIIlIIIIllIIlIlIll
        //   513: arraylength    
        //   514: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //   517: ifeq            534
        //   520: aload           lllllllllllllIIIIlIIIIllIIllIIlI
        //   522: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIIl:(Ljava/lang/Object;)Z
        //   525: ifeq            534
        //   528: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   529: aload           lllllllllllllIIIIlIIIIllIIllIIlI
        //   531: putfield        io/netty/util/internal/chmv8/ForkJoinPool.workQueues:[Lio/netty/util/internal/chmv8/ForkJoinPool$WorkQueue;
        //   534: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //   536: ldc             -2147483648
        //   538: iand           
        //   539: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //   541: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   544: iconst_2       
        //   545: iaload         
        //   546: iadd           
        //   547: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   550: bipush          9
        //   552: iaload         
        //   553: iand           
        //   554: ior            
        //   555: istore          lllllllllllllIIIIlIIIIllIIllIIIl
        //   557: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.U:Lsun/misc/Unsafe;
        //   560: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   561: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.PLOCK:J
        //   564: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //   566: iload           lllllllllllllIIIIlIIIIllIIllIIIl
        //   568: invokevirtual   sun/misc/Unsafe.compareAndSwapInt:(Ljava/lang/Object;JII)Z
        //   571: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //   574: ifeq            583
        //   577: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   578: iload           lllllllllllllIIIIlIIIIllIIllIIIl
        //   580: invokespecial   io/netty/util/internal/chmv8/ForkJoinPool.releasePlock:(I)V
        //   583: ldc             ""
        //   585: invokevirtual   java/lang/String.length:()I
        //   588: pop            
        //   589: ldc             "   "
        //   591: invokevirtual   java/lang/String.length:()I
        //   594: bipush          11
        //   596: bipush          122
        //   598: ixor           
        //   599: bipush          120
        //   601: bipush          31
        //   603: ixor           
        //   604: ixor           
        //   605: bipush          94
        //   607: bipush          95
        //   609: iadd           
        //   610: bipush          29
        //   612: isub           
        //   613: bipush          14
        //   615: iadd           
        //   616: sipush          175
        //   619: bipush          121
        //   621: iadd           
        //   622: sipush          247
        //   625: isub           
        //   626: sipush          135
        //   629: iadd           
        //   630: ixor           
        //   631: ldc             " "
        //   633: invokevirtual   java/lang/String.length:()I
        //   636: ineg           
        //   637: ixor           
        //   638: iand           
        //   639: if_icmpgt       1198
        //   642: return         
        //   643: aload           lllllllllllllIIIIlIIIIllIIlIlIll
        //   645: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   646: iload           lllllllllllllIIIIlIIIIllIIlIlIII
        //   648: iand           
        //   649: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   652: bipush          14
        //   654: iaload         
        //   655: iand           
        //   656: dup            
        //   657: istore          lllllllllllllIIIIlIIIIllIIlIIlll
        //   659: aaload         
        //   660: dup            
        //   661: astore          lllllllllllllIIIIlIIIIllIIlIlIlI
        //   663: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIIl:(Ljava/lang/Object;)Z
        //   666: ifeq            984
        //   669: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   671: getfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.qlock:I
        //   674: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //   677: ifeq            952
        //   680: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.U:Lsun/misc/Unsafe;
        //   683: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   685: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.QLOCK:J
        //   688: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   691: bipush          10
        //   693: iaload         
        //   694: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   697: iconst_0       
        //   698: iaload         
        //   699: invokevirtual   sun/misc/Unsafe.compareAndSwapInt:(Ljava/lang/Object;JII)Z
        //   702: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIll:(I)Z
        //   705: ifeq            952
        //   708: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   710: getfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.array:[Lio/netty/util/internal/chmv8/ForkJoinTask;
        //   713: astore          lllllllllllllIIIIlIIIIllIIlIllll
        //   715: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   717: getfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.top:I
        //   720: istore          lllllllllllllIIIIlIIIIllIIlIlllI
        //   722: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   725: bipush          10
        //   727: iaload         
        //   728: istore          lllllllllllllIIIIlIIIIllIIlIllIl
        //   730: aload           lllllllllllllIIIIlIIIIllIIlIllll
        //   732: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIIl:(Ljava/lang/Object;)Z
        //   735: ifeq            761
        //   738: aload           lllllllllllllIIIIlIIIIllIIlIllll
        //   740: arraylength    
        //   741: iload           lllllllllllllIIIIlIIIIllIIlIlllI
        //   743: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   746: iconst_0       
        //   747: iaload         
        //   748: iadd           
        //   749: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   751: getfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.base:I
        //   754: isub           
        //   755: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllllI:(II)Z
        //   758: ifeq            775
        //   761: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   763: invokevirtual   io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.growArray:()[Lio/netty/util/internal/chmv8/ForkJoinTask;
        //   766: dup            
        //   767: astore          lllllllllllllIIIIlIIIIllIIlIllll
        //   769: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIIl:(Ljava/lang/Object;)Z
        //   772: ifeq            829
        //   775: aload           lllllllllllllIIIIlIIIIllIIlIllll
        //   777: arraylength    
        //   778: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   781: iconst_0       
        //   782: iaload         
        //   783: isub           
        //   784: iload           lllllllllllllIIIIlIIIIllIIlIlllI
        //   786: iand           
        //   787: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.ASHIFT:I
        //   790: ishl           
        //   791: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.ABASE:I
        //   794: iadd           
        //   795: istore          lllllllllllllIIIIlIIIIllIIllIIII
        //   797: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.U:Lsun/misc/Unsafe;
        //   800: aload           lllllllllllllIIIIlIIIIllIIlIllll
        //   802: iload           lllllllllllllIIIIlIIIIllIIllIIII
        //   804: i2l            
        //   805: aload_1         /* lllllllllllllIIIIlIIIIllIIlIIlII */
        //   806: invokevirtual   sun/misc/Unsafe.putOrderedObject:(Ljava/lang/Object;JLjava/lang/Object;)V
        //   809: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   811: iload           lllllllllllllIIIIlIIIIllIIlIlllI
        //   813: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   816: iconst_0       
        //   817: iaload         
        //   818: iadd           
        //   819: putfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.top:I
        //   822: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   825: iconst_0       
        //   826: iaload         
        //   827: istore          lllllllllllllIIIIlIIIIllIIlIllIl
        //   829: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   831: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   834: bipush          10
        //   836: iaload         
        //   837: putfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.qlock:I
        //   840: ldc             ""
        //   842: invokevirtual   java/lang/String.length:()I
        //   845: pop            
        //   846: sipush          159
        //   849: bipush          82
        //   851: iadd           
        //   852: sipush          144
        //   855: isub           
        //   856: bipush          100
        //   858: iadd           
        //   859: bipush          48
        //   861: bipush          32
        //   863: iadd           
        //   864: bipush          60
        //   866: isub           
        //   867: sipush          133
        //   870: iadd           
        //   871: ixor           
        //   872: sipush          175
        //   875: bipush          62
        //   877: iadd           
        //   878: sipush          160
        //   881: isub           
        //   882: sipush          149
        //   885: iadd           
        //   886: sipush          169
        //   889: bipush          64
        //   891: iadd           
        //   892: sipush          180
        //   895: isub           
        //   896: sipush          137
        //   899: iadd           
        //   900: ixor           
        //   901: ldc             " "
        //   903: invokevirtual   java/lang/String.length:()I
        //   906: ineg           
        //   907: ixor           
        //   908: iand           
        //   909: ldc             " "
        //   911: invokevirtual   java/lang/String.length:()I
        //   914: ineg           
        //   915: if_icmpgt       935
        //   918: return         
        //   919: astore          lllllllllllllIIIIlIIIIllIIIlIlIl
        //   921: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   923: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   926: bipush          10
        //   928: iaload         
        //   929: putfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.qlock:I
        //   932: aload           lllllllllllllIIIIlIIIIllIIIlIlIl
        //   934: athrow         
        //   935: iload           lllllllllllllIIIIlIIIIllIIlIllIl
        //   937: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIll:(I)Z
        //   940: ifeq            952
        //   943: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   944: aload           lllllllllllllIIIIlIIIIllIIlIlIll
        //   946: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //   948: invokevirtual   io/netty/util/internal/chmv8/ForkJoinPool.signalWork:([Lio/netty/util/internal/chmv8/ForkJoinPool$WorkQueue;Lio/netty/util/internal/chmv8/ForkJoinPool$WorkQueue;)V
        //   951: return         
        //   952: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   955: bipush          10
        //   957: iaload         
        //   958: istore_2        /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //   959: ldc             ""
        //   961: invokevirtual   java/lang/String.length:()I
        //   964: pop            
        //   965: sipush          215
        //   968: sipush          147
        //   971: ixor           
        //   972: bipush          21
        //   974: bipush          81
        //   976: ixor           
        //   977: iconst_m1      
        //   978: ixor           
        //   979: iand           
        //   980: ifeq            1198
        //   983: return         
        //   984: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //   985: getfield        io/netty/util/internal/chmv8/ForkJoinPool.plock:I
        //   988: dup            
        //   989: istore          lllllllllllllIIIIlIIIIllIIlIlIIl
        //   991: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //   994: iconst_2       
        //   995: iaload         
        //   996: iand           
        //   997: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //  1000: ifeq            1191
        //  1003: new             Lio/netty/util/internal/chmv8/ForkJoinPool$WorkQueue;
        //  1006: dup            
        //  1007: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //  1008: aconst_null    
        //  1009: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //  1012: bipush          13
        //  1014: iaload         
        //  1015: iload_2         /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //  1016: invokespecial   io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.<init>:(Lio/netty/util/internal/chmv8/ForkJoinPool;Lio/netty/util/internal/chmv8/ForkJoinWorkerThread;II)V
        //  1019: astore          lllllllllllllIIIIlIIIIllIIlIlIlI
        //  1021: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //  1023: iload           lllllllllllllIIIIlIIIIllIIlIIlll
        //  1025: i2s            
        //  1026: putfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.poolIndex:S
        //  1029: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //  1030: getfield        io/netty/util/internal/chmv8/ForkJoinPool.plock:I
        //  1033: dup            
        //  1034: istore          lllllllllllllIIIIlIIIIllIIlIlIIl
        //  1036: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //  1039: iconst_2       
        //  1040: iaload         
        //  1041: iand           
        //  1042: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //  1045: ifeq            1071
        //  1048: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.U:Lsun/misc/Unsafe;
        //  1051: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //  1052: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.PLOCK:J
        //  1055: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //  1057: iinc            lllllllllllllIIIIlIIIIllIIlIlIIl, 2
        //  1060: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //  1062: invokevirtual   sun/misc/Unsafe.compareAndSwapInt:(Ljava/lang/Object;JII)Z
        //  1065: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //  1068: ifeq            1077
        //  1071: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //  1072: invokespecial   io/netty/util/internal/chmv8/ForkJoinPool.acquirePlock:()I
        //  1075: istore          lllllllllllllIIIIlIIIIllIIlIlIIl
        //  1077: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //  1078: getfield        io/netty/util/internal/chmv8/ForkJoinPool.workQueues:[Lio/netty/util/internal/chmv8/ForkJoinPool$WorkQueue;
        //  1081: dup            
        //  1082: astore          lllllllllllllIIIIlIIIIllIIlIlIll
        //  1084: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIIl:(Ljava/lang/Object;)Z
        //  1087: ifeq            1119
        //  1090: iload           lllllllllllllIIIIlIIIIllIIlIIlll
        //  1092: aload           lllllllllllllIIIIlIIIIllIIlIlIll
        //  1094: arraylength    
        //  1095: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIlIIIIII:(II)Z
        //  1098: ifeq            1119
        //  1101: aload           lllllllllllllIIIIlIIIIllIIlIlIll
        //  1103: iload           lllllllllllllIIIIlIIIIllIIlIIlll
        //  1105: aaload         
        //  1106: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIlIIIIll:(Ljava/lang/Object;)Z
        //  1109: ifeq            1119
        //  1112: aload           lllllllllllllIIIIlIIIIllIIlIlIll
        //  1114: iload           lllllllllllllIIIIlIIIIllIIlIIlll
        //  1116: aload           lllllllllllllIIIIlIIIIllIIlIlIlI
        //  1118: aastore        
        //  1119: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //  1121: ldc             -2147483648
        //  1123: iand           
        //  1124: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //  1126: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //  1129: iconst_2       
        //  1130: iaload         
        //  1131: iadd           
        //  1132: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //  1135: bipush          9
        //  1137: iaload         
        //  1138: iand           
        //  1139: ior            
        //  1140: istore          lllllllllllllIIIIlIIIIllIIlIllII
        //  1142: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.U:Lsun/misc/Unsafe;
        //  1145: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //  1146: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.PLOCK:J
        //  1149: iload           lllllllllllllIIIIlIIIIllIIlIlIIl
        //  1151: iload           lllllllllllllIIIIlIIIIllIIlIllII
        //  1153: invokevirtual   sun/misc/Unsafe.compareAndSwapInt:(Ljava/lang/Object;JII)Z
        //  1156: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool.llllIllIIlllIlI:(I)Z
        //  1159: ifeq            1168
        //  1162: aload_0         /* lllllllllllllIIIIlIIIIllIIlIIlIl */
        //  1163: iload           lllllllllllllIIIIlIIIIllIIlIllII
        //  1165: invokespecial   io/netty/util/internal/chmv8/ForkJoinPool.releasePlock:(I)V
        //  1168: ldc             ""
        //  1170: invokevirtual   java/lang/String.length:()I
        //  1173: pop            
        //  1174: sipush          175
        //  1177: sipush          171
        //  1180: ixor           
        //  1181: ldc             " "
        //  1183: invokevirtual   java/lang/String.length:()I
        //  1186: ineg           
        //  1187: if_icmpne       1198
        //  1190: return         
        //  1191: getstatic       io/netty/util/internal/chmv8/ForkJoinPool.lIllIIIIlIlIII:[I
        //  1194: bipush          10
        //  1196: iaload         
        //  1197: istore_2        /* lllllllllllllIIIIlIIIIllIIlIIIll */
        //  1198: ldc             ""
        //  1200: invokevirtual   java/lang/String.length:()I
        //  1203: pop            
        //  1204: bipush          97
        //  1206: bipush          36
        //  1208: ixor           
        //  1209: bipush          85
        //  1211: bipush          16
        //  1213: ixor           
        //  1214: iconst_m1      
        //  1215: ixor           
        //  1216: iand           
        //  1217: ifeq            17
        //  1220: return         
        //    Signature:
        //  (Lio/netty/util/internal/chmv8/ForkJoinTask<*>;)V
        //    StackMapTable: 00 1D FD 00 11 01 07 00 14 FB 00 51 31 FE 00 14 00 00 01 26 FE 00 30 00 00 01 44 01 FF 00 6B 00 0B 07 00 02 07 00 08 01 07 00 14 07 00 BB 00 01 00 00 01 01 00 00 FB 00 4B 40 07 00 BB FC 00 2B 07 00 BB 05 15 0D FF 00 30 00 07 07 00 02 07 00 08 01 07 00 14 07 00 BB 00 01 00 00 FC 00 3B 01 FF 00 75 00 0C 07 00 02 07 00 08 01 07 00 14 07 00 BB 07 00 11 01 01 01 07 01 D1 01 01 00 00 0D 35 F7 00 59 07 01 68 0F F8 00 10 1F FB 00 56 05 29 30 16 FF 00 06 00 04 07 00 02 07 00 08 01 07 00 14 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  730    829    919    935    Any
        //  919    921    919    935    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final int scan(final WorkQueue lllllllllllllIIIIlIIIIlIllIIlIll, final int lllllllllllllIIIIlIIIIlIllIIIlIl) {
        final long lllllllllllllIIIIlIIIIlIllIIlIII = this.ctl;
        final WorkQueue[] lllllllllllllIIIIlIIIIlIllIIlIIl;
        final int lllllllllllllIIIIlIIIIlIllIIllIl;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIllIIlIIl = this.workQueues) && llllIllIIllllII(lllllllllllllIIIIlIIIIlIllIIllIl = lllllllllllllIIIIlIIIIlIllIIlIIl.length - ForkJoinPool.lIllIIIIlIlIII[0]) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIllIIlIll)) {
            int lllllllllllllIIIIlIIIIlIllIIllll = lllllllllllllIIIIlIIIIlIllIIllIl + lllllllllllllIIIIlIIIIlIllIIllIl + ForkJoinPool.lIllIIIIlIlIII[0];
            final int lllllllllllllIIIIlIIIIlIllIIlllI = lllllllllllllIIIIlIIIIlIllIIlIll.eventCount;
            WorkQueue lllllllllllllIIIIlIIIIlIllIlIIIl;
            int lllllllllllllIIIIlIIIIlIllIlIlIl;
            ForkJoinTask<?>[] lllllllllllllIIIIlIIIIlIllIlIlII;
            while (!llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIllIlIIIl = lllllllllllllIIIIlIIIIlIllIIlIIl[lllllllllllllIIIIlIIIIlIllIIIlIl - lllllllllllllIIIIlIIIIlIllIIllll & lllllllllllllIIIIlIIIIlIllIIllIl]) || !llllIllIIllllIl((lllllllllllllIIIIlIIIIlIllIlIlIl = lllllllllllllIIIIlIIIIlIllIlIIIl.base) - lllllllllllllIIIIlIIIIlIllIlIIIl.top) || !llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIllIlIlII = lllllllllllllIIIIlIIIIlIllIlIIIl.array)) {
                if (llllIllIIllllIl(--lllllllllllllIIIIlIIIIlIllIIllll)) {
                    final int lllllllllllllIIIIlIIIIlIllIlIIII;
                    if (llllIllIIllllIl(lllllllllllllIIIIlIIIIlIllIIlllI | (lllllllllllllIIIIlIIIIlIllIlIIII = (int)lllllllllllllIIIIlIIIIlIllIIlIII))) {
                        return this.awaitWork(lllllllllllllIIIIlIIIIlIllIIlIll, lllllllllllllIIIIlIIIIlIllIIlIII, lllllllllllllIIIIlIIIIlIllIIlllI);
                    }
                    if (!llllIllIIlllIlI(llllIllIlIIlIII(this.ctl, lllllllllllllIIIIlIIIIlIllIIlIII))) {
                        return ForkJoinPool.lIllIIIIlIlIII[10];
                    }
                    final long lllllllllllllIIIIlIIIIlIllIlIIlI = (long)lllllllllllllIIIIlIIIIlIllIIlllI | (lllllllllllllIIIIlIIIIlIllIIlIII - 281474976710656L & 0xFFFFFFFF00000000L);
                    lllllllllllllIIIIlIIIIlIllIIlIll.nextWait = lllllllllllllIIIIlIIIIlIllIlIIII;
                    lllllllllllllIIIIlIIIIlIllIIlIll.eventCount = (lllllllllllllIIIIlIIIIlIllIIlllI | Integer.MIN_VALUE);
                    if (llllIllIIlllIlI(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIlIllIIlIII, lllllllllllllIIIIlIIIIlIllIlIIlI) ? 1 : 0)) {
                        lllllllllllllIIIIlIIIIlIllIIlIll.eventCount = lllllllllllllIIIIlIIIIlIllIIlllI;
                    }
                    "".length();
                    if (((0xE6 ^ 0x89 ^ (0x21 ^ 0xF)) & (63 + 192 - 64 + 51 ^ 55 + 83 - 101 + 142 ^ -" ".length())) > 0) {
                        return (0x62 ^ 0x7D ^ (0x85 ^ 0xB4)) & (59 + 79 - 58 + 74 ^ 179 + 128 - 179 + 52 ^ -" ".length());
                    }
                    return ForkJoinPool.lIllIIIIlIlIII[10];
                }
                else {
                    "".length();
                    if (null != null) {
                        return (0x0 ^ 0x7E ^ (0x99 ^ 0xAE)) & (200 + 144 - 247 + 126 ^ 119 + 104 - 170 + 97 ^ -" ".length());
                    }
                    continue;
                }
            }
            final long lllllllllllllIIIIlIIIIlIllIlIllI = ((lllllllllllllIIIIlIIIIlIllIlIlII.length - ForkJoinPool.lIllIIIIlIlIII[0] & lllllllllllllIIIIlIIIIlIllIlIlIl) << ForkJoinPool.ASHIFT) + ForkJoinPool.ABASE;
            final ForkJoinTask<?> lllllllllllllIIIIlIIIIlIllIlIIll;
            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIllIlIIll = (ForkJoinTask<?>)ForkJoinPool.U.getObjectVolatile(lllllllllllllIIIIlIIIIlIllIlIlII, lllllllllllllIIIIlIIIIlIllIlIllI))) {
                if (llllIllIIllllIl(lllllllllllllIIIIlIIIIlIllIIlllI)) {
                    this.helpRelease(lllllllllllllIIIIlIIIIlIllIIlIII, lllllllllllllIIIIlIIIIlIllIIlIIl, lllllllllllllIIIIlIIIIlIllIIlIll, lllllllllllllIIIIlIIIIlIllIlIIIl, lllllllllllllIIIIlIIIIlIllIlIlIl);
                    "".length();
                    if (-" ".length() == "  ".length()) {
                        return (0x4A ^ 0x73) & ~(0x6F ^ 0x56);
                    }
                }
                else if (llllIllIlIIIlll(lllllllllllllIIIIlIIIIlIllIlIIIl.base, lllllllllllllIIIIlIIIIlIllIlIlIl) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapObject(lllllllllllllIIIIlIIIIlIllIlIlII, lllllllllllllIIIIlIIIIlIllIlIllI, lllllllllllllIIIIlIIIIlIllIlIIll, null) ? 1 : 0)) {
                    ForkJoinPool.U.putOrderedInt(lllllllllllllIIIIlIIIIlIllIlIIIl, ForkJoinPool.QBASE, lllllllllllllIIIIlIIIIlIllIlIlIl + ForkJoinPool.lIllIIIIlIlIII[0]);
                    if (llllIllIIllllIl(lllllllllllllIIIIlIIIIlIllIlIlIl + ForkJoinPool.lIllIIIIlIlIII[0] - lllllllllllllIIIIlIIIIlIllIlIIIl.top)) {
                        this.signalWork(lllllllllllllIIIIlIIIIlIllIIlIIl, lllllllllllllIIIIlIIIIlIllIlIIIl);
                    }
                    lllllllllllllIIIIlIIIIlIllIIlIll.runTask(lllllllllllllIIIIlIIIIlIllIlIIll);
                    "".length();
                    if (" ".length() == "   ".length()) {
                        return (0x2A ^ 0x76 ^ (0x26 ^ 0x4E)) & (0x3F ^ 0x0 ^ (0x36 ^ 0x3D) ^ -" ".length());
                    }
                }
            }
        }
        return ForkJoinPool.lIllIIIIlIlIII[10];
    }
    
    private static int llllIllIlIIllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int llllIllIlIlIIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public List<Runnable> shutdownNow() {
        checkPermission();
        this.tryTerminate((boolean)(ForkJoinPool.lIllIIIIlIlIII[0] != 0), (boolean)(ForkJoinPool.lIllIIIIlIlIII[0] != 0));
        "".length();
        return Collections.emptyList();
    }
    
    public ForkJoinWorkerThreadFactory getFactory() {
        return this.factory;
    }
    
    final void deregisterWorker(final ForkJoinWorkerThread lllllllllllllIIIIlIIIIllIlllIlll, final Throwable lllllllllllllIIIIlIIIIllIlllIllI) {
        WorkQueue lllllllllllllIIIIlIIIIllIllllIlI = null;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIllIlllIlll) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIllIllllIlI = lllllllllllllIIIIlIIIIllIlllIlll.workQueue)) {
            lllllllllllllIIIIlIIIIllIllllIlI.qlock = ForkJoinPool.lIllIIIIlIlIII[13];
            long lllllllllllllIIIIlIIIIlllIIIIllI;
            while (!llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.STEALCOUNT, lllllllllllllIIIIlIIIIlllIIIIllI = this.stealCount, lllllllllllllIIIIlIIIIlllIIIIllI + lllllllllllllIIIIlIIIIllIllllIlI.nsteals) ? 1 : 0)) {}
            int lllllllllllllIIIIlIIIIlllIIIIlll = 0;
            Label_0110: {
                if (llllIllIIlllIlI((lllllllllllllIIIIlIIIIlllIIIIlll = this.plock) & ForkJoinPool.lIllIIIIlIlIII[2])) {
                    final Unsafe u = ForkJoinPool.U;
                    final long plock = ForkJoinPool.PLOCK;
                    final int expected = lllllllllllllIIIIlIIIIlllIIIIlll;
                    lllllllllllllIIIIlIIIIlllIIIIlll += 2;
                    if (!llllIllIIlllIlI(u.compareAndSwapInt(this, plock, expected, lllllllllllllIIIIlIIIIlllIIIIlll) ? 1 : 0)) {
                        break Label_0110;
                    }
                }
                lllllllllllllIIIIlIIIIlllIIIIlll = this.acquirePlock();
            }
            final int lllllllllllllIIIIlIIIIlllIIIIlIl = (lllllllllllllIIIIlIIIIlllIIIIlll & Integer.MIN_VALUE) | (lllllllllllllIIIIlIIIIlllIIIIlll + ForkJoinPool.lIllIIIIlIlIII[2] & ForkJoinPool.lIllIIIIlIlIII[9]);
            try {
                final int lllllllllllllIIIIlIIIIlllIIIlIIl = lllllllllllllIIIIlIIIIllIllllIlI.poolIndex;
                final WorkQueue[] lllllllllllllIIIIlIIIIlllIIIlIII = this.workQueues;
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlllIIIlIII) && llllIllIIllllII(lllllllllllllIIIIlIIIIlllIIIlIIl) && llllIllIlIIIIII(lllllllllllllIIIIlIIIIlllIIIlIIl, lllllllllllllIIIIlIIIIlllIIIlIII.length) && llllIllIlIIIIIl(lllllllllllllIIIIlIIIIlllIIIlIII[lllllllllllllIIIIlIIIIlllIIIlIIl], lllllllllllllIIIIlIIIIllIllllIlI)) {
                    lllllllllllllIIIIlIIIIlllIIIlIII[lllllllllllllIIIIlIIIIlllIIIlIIl] = null;
                }
                if (llllIllIIlllIlI(ForkJoinPool.U.compareAndSwapInt(this, ForkJoinPool.PLOCK, lllllllllllllIIIIlIIIIlllIIIIlll, lllllllllllllIIIIlIIIIlllIIIIlIl) ? 1 : 0)) {
                    this.releasePlock(lllllllllllllIIIIlIIIIlllIIIIlIl);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            finally {
                if (llllIllIIlllIlI(ForkJoinPool.U.compareAndSwapInt(this, ForkJoinPool.PLOCK, lllllllllllllIIIIlIIIIlllIIIIlll, lllllllllllllIIIIlIIIIlllIIIIlIl) ? 1 : 0)) {
                    this.releasePlock(lllllllllllllIIIIlIIIIlllIIIIlIl);
                }
            }
        }
        long lllllllllllllIIIIlIIIIllIllllIIl;
        while (!llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIllIllllIIl = this.ctl, (lllllllllllllIIIIlIIIIllIllllIIl - 281474976710656L & 0xFFFF000000000000L) | (lllllllllllllIIIIlIIIIllIllllIIl - 4294967296L & 0xFFFF00000000L) | (lllllllllllllIIIIlIIIIllIllllIIl & 0xFFFFFFFFL)) ? 1 : 0)) {}
        if (llllIllIIlllIlI(this.tryTerminate((boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0), (boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0)) ? 1 : 0) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIllIllllIlI) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIllIllllIlI.array)) {
            lllllllllllllIIIIlIIIIllIllllIlI.cancelAll();
            int lllllllllllllIIIIlIIIIllIlllllll;
            int lllllllllllllIIIIlIIIIllIllllllI;
            while (llllIllIIllllIl(lllllllllllllIIIIlIIIIllIlllllll = (int)((lllllllllllllIIIIlIIIIllIllllIIl = this.ctl) >>> ForkJoinPool.lIllIIIIlIlIII[3])) && llllIllIIllllII(lllllllllllllIIIIlIIIIllIllllllI = (int)lllllllllllllIIIIlIIIIllIllllIIl)) {
                if (llllIllIlIIIIlI(lllllllllllllIIIIlIIIIllIllllllI)) {
                    final WorkQueue[] lllllllllllllIIIIlIIIIlllIIIIIlI;
                    final int lllllllllllllIIIIlIIIIlllIIIIIII;
                    if (!llllIllIIlllIIl(lllllllllllllIIIIlIIIIlllIIIIIlI = this.workQueues) || !llllIllIlIIIIII(lllllllllllllIIIIlIIIIlllIIIIIII = (lllllllllllllIIIIlIIIIllIllllllI & ForkJoinPool.lIllIIIIlIlIII[5]), lllllllllllllIIIIlIIIIlllIIIIIlI.length)) {
                        break;
                    }
                    final WorkQueue lllllllllllllIIIIlIIIIlllIIIIIIl;
                    if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIlllIIIIIIl = lllllllllllllIIIIlIIIIlllIIIIIlI[lllllllllllllIIIIlIIIIlllIIIIIII])) {
                        "".length();
                        if ("   ".length() <= 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        final long lllllllllllllIIIIlIIIIlllIIIIIll = (long)(lllllllllllllIIIIlIIIIlllIIIIIIl.nextWait & ForkJoinPool.lIllIIIIlIlIII[9]) | (long)(lllllllllllllIIIIlIIIIllIlllllll + ForkJoinPool.lIllIIIIlIlIII[6]) << ForkJoinPool.lIllIIIIlIlIII[3];
                        if (llllIllIlIIIlII(lllllllllllllIIIIlIIIIlllIIIIIIl.eventCount, lllllllllllllIIIIlIIIIllIllllllI | Integer.MIN_VALUE)) {
                            "".length();
                            if (-" ".length() > 0) {
                                return;
                            }
                            break;
                        }
                        else if (llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIllIllllIIl, lllllllllllllIIIIlIIIIlllIIIIIll) ? 1 : 0)) {
                            lllllllllllllIIIIlIIIIlllIIIIIIl.eventCount = (lllllllllllllIIIIlIIIIllIllllllI + ForkJoinPool.lIllIIIIlIlIII[6] & ForkJoinPool.lIllIIIIlIlIII[9]);
                            final Thread lllllllllllllIIIIlIIIIlllIIIIlII;
                            if (!llllIllIIlllIIl(lllllllllllllIIIIlIIIIlllIIIIlII = lllllllllllllIIIIlIIIIlllIIIIIIl.parker)) {
                                break;
                            }
                            ForkJoinPool.U.unpark(lllllllllllllIIIIlIIIIlllIIIIlII);
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                            break;
                        }
                        else {
                            "".length();
                            if (((14 + 134 - 37 + 125 ^ 150 + 106 - 113 + 36) & (84 + 162 - 171 + 122 ^ 25 + 141 - 119 + 107 ^ -" ".length())) != 0x0) {
                                return;
                            }
                            continue;
                        }
                    }
                }
                else {
                    if (!llllIllIIllllIl((short)lllllllllllllIIIIlIIIIllIlllllll)) {
                        break;
                    }
                    this.tryAddWorker();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
            }
        }
        if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIllIlllIllI)) {
            ForkJoinTask.helpExpungeStaleExceptions();
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            ForkJoinTask.rethrow(lllllllllllllIIIIlIIIIllIlllIllI);
        }
    }
    
    @Override
    protected <T> RunnableFuture<T> newTaskFor(final Callable<T> lllllllllllllIIIIIllllllIIlllIlI) {
        return new ForkJoinTask.AdaptedCallable<T>((Callable<? extends T>)lllllllllllllIIIIIllllllIIlllIlI);
    }
    
    final ForkJoinTask<?> nextTaskFor(final WorkQueue lllllllllllllIIIIlIIIIIllIIIIIII) {
        ForkJoinTask<?> lllllllllllllIIIIlIIIIIllIIIIIlI;
        while (!llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllIIIIIlI = lllllllllllllIIIIlIIIIIllIIIIIII.nextLocalTask())) {
            final WorkQueue lllllllllllllIIIIlIIIIIllIIIIlII;
            if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIIllIIIIlII = this.findNonEmptyStealQueue())) {
                return null;
            }
            final int lllllllllllllIIIIlIIIIIllIIIIIll;
            if (llllIllIIllllIl((lllllllllllllIIIIlIIIIIllIIIIIll = lllllllllllllIIIIlIIIIIllIIIIlII.base) - lllllllllllllIIIIlIIIIIllIIIIlII.top) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllIIIIIlI = lllllllllllllIIIIlIIIIIllIIIIlII.pollAt(lllllllllllllIIIIlIIIIIllIIIIIll))) {
                return lllllllllllllIIIIlIIIIIllIIIIIlI;
            }
            "".length();
            if (-(148 + 130 - 231 + 104 ^ 70 + 8 - 52 + 121) > 0) {
                return null;
            }
        }
        return lllllllllllllIIIIlIIIIIllIIIIIlI;
    }
    
    private static int llllIllIlIlIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    final WorkQueue registerWorker(final ForkJoinWorkerThread lllllllllllllIIIIlIIIIlllIlIlIll) {
        lllllllllllllIIIIlIIIIlllIlIlIll.setDaemon((boolean)(ForkJoinPool.lIllIIIIlIlIII[0] != 0));
        final Thread.UncaughtExceptionHandler lllllllllllllIIIIlIIIIlllIlIlIlI;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlllIlIlIlI = this.ueh)) {
            lllllllllllllIIIIlIIIIlllIlIlIll.setUncaughtExceptionHandler(lllllllllllllIIIIlIIIIlllIlIlIlI);
        }
        Unsafe u;
        long indexseed;
        int lllllllllllllIIIIlIIIIlllIlIlIII;
        do {
            u = ForkJoinPool.U;
            indexseed = ForkJoinPool.INDEXSEED;
            lllllllllllllIIIIlIIIIlllIlIlIII = this.indexSeed;
            lllllllllllllIIIIlIIIIlllIlIlIII += ForkJoinPool.lIllIIIIlIlIII[8];
        } while (!llllIllIIlllIll(u.compareAndSwapInt(this, indexseed, lllllllllllllIIIIlIIIIlllIlIlIII, lllllllllllllIIIIlIIIIlllIlIlIII) ? 1 : 0) || !llllIllIIlllIll(lllllllllllllIIIIlIIIIlllIlIlIII));
        final WorkQueue lllllllllllllIIIIlIIIIlllIlIIllI = new WorkQueue(this, lllllllllllllIIIIlIIIIlllIlIlIll, this.mode, lllllllllllllIIIIlIIIIlllIlIlIII);
        int lllllllllllllIIIIlIIIIlllIlIIlll = 0;
        Label_0135: {
            if (llllIllIIlllIlI((lllllllllllllIIIIlIIIIlllIlIIlll = this.plock) & ForkJoinPool.lIllIIIIlIlIII[2])) {
                final Unsafe u2 = ForkJoinPool.U;
                final long plock = ForkJoinPool.PLOCK;
                final int expected = lllllllllllllIIIIlIIIIlllIlIIlll;
                lllllllllllllIIIIlIIIIlllIlIIlll += 2;
                if (!llllIllIIlllIlI(u2.compareAndSwapInt(this, plock, expected, lllllllllllllIIIIlIIIIlllIlIIlll) ? 1 : 0)) {
                    break Label_0135;
                }
            }
            lllllllllllllIIIIlIIIIlllIlIIlll = this.acquirePlock();
        }
        final int lllllllllllllIIIIlIIIIlllIlIIlIl = (lllllllllllllIIIIlIIIIlllIlIIlll & Integer.MIN_VALUE) | (lllllllllllllIIIIlIIIIlllIlIIlll + ForkJoinPool.lIllIIIIlIlIII[2] & ForkJoinPool.lIllIIIIlIlIII[9]);
        try {
            WorkQueue[] lllllllllllllIIIIlIIIIlllIlIlIIl;
            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlllIlIlIIl = this.workQueues)) {
                int lllllllllllllIIIIlIIIIlllIlIllll = lllllllllllllIIIIlIIIIlllIlIlIIl.length;
                int lllllllllllllIIIIlIIIIlllIlIlllI = lllllllllllllIIIIlIIIIlllIlIllll - ForkJoinPool.lIllIIIIlIlIII[0];
                int lllllllllllllIIIIlIIIIlllIlIllIl = lllllllllllllIIIIlIIIIlllIlIlIII << ForkJoinPool.lIllIIIIlIlIII[0] | ForkJoinPool.lIllIIIIlIlIII[0];
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlllIlIlIIl[lllllllllllllIIIIlIIIIlllIlIllIl &= lllllllllllllIIIIlIIIIlllIlIlllI])) {
                    int lllllllllllllIIIIlIIIIlllIllIIIl = ForkJoinPool.lIllIIIIlIlIII[10];
                    int n;
                    if (llllIllIIlllllI(lllllllllllllIIIIlIIIIlllIlIllll, ForkJoinPool.lIllIIIIlIlIII[11])) {
                        n = ForkJoinPool.lIllIIIIlIlIII[2];
                        "".length();
                        if ("   ".length() > (0x3C ^ 0x38)) {
                            return null;
                        }
                    }
                    else {
                        n = (lllllllllllllIIIIlIIIIlllIlIllll >>> ForkJoinPool.lIllIIIIlIlIII[0] & ForkJoinPool.lIllIIIIlIlIII[12]) + ForkJoinPool.lIllIIIIlIlIII[2];
                    }
                    final int lllllllllllllIIIIlIIIIlllIllIIII = n;
                    while (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlllIlIlIIl[lllllllllllllIIIIlIIIIlllIlIllIl = (lllllllllllllIIIIlIIIIlllIlIllIl + lllllllllllllIIIIlIIIIlllIllIIII & lllllllllllllIIIIlIIIIlllIlIlllI)])) {
                        if (llllIllIIllllll(++lllllllllllllIIIIlIIIIlllIllIIIl, lllllllllllllIIIIlIIIIlllIlIllll)) {
                            lllllllllllllIIIIlIIIIlllIlIlIIl = (this.workQueues = Arrays.copyOf(lllllllllllllIIIIlIIIIlllIlIlIIl, lllllllllllllIIIIlIIIIlllIlIllll <<= ForkJoinPool.lIllIIIIlIlIII[0]));
                            lllllllllllllIIIIlIIIIlllIlIlllI = lllllllllllllIIIIlIIIIlllIlIllll - ForkJoinPool.lIllIIIIlIlIII[0];
                            lllllllllllllIIIIlIIIIlllIllIIIl = ForkJoinPool.lIllIIIIlIlIII[10];
                            "".length();
                            if ("  ".length() <= -" ".length()) {
                                return null;
                            }
                            continue;
                        }
                    }
                }
                lllllllllllllIIIIlIIIIlllIlIIllI.poolIndex = (short)lllllllllllllIIIIlIIIIlllIlIllIl;
                lllllllllllllIIIIlIIIIlllIlIIllI.eventCount = lllllllllllllIIIIlIIIIlllIlIllIl;
                lllllllllllllIIIIlIIIIlllIlIlIIl[lllllllllllllIIIIlIIIIlllIlIllIl] = lllllllllllllIIIIlIIIIlllIlIIllI;
            }
            if (llllIllIIlllIlI(ForkJoinPool.U.compareAndSwapInt(this, ForkJoinPool.PLOCK, lllllllllllllIIIIlIIIIlllIlIIlll, lllllllllllllIIIIlIIIIlllIlIIlIl) ? 1 : 0)) {
                this.releasePlock(lllllllllllllIIIIlIIIIlllIlIIlIl);
                "".length();
                if ((0x1 ^ 0x1F ^ (0xBF ^ 0xA5)) <= 0) {
                    return null;
                }
            }
        }
        finally {
            if (llllIllIIlllIlI(ForkJoinPool.U.compareAndSwapInt(this, ForkJoinPool.PLOCK, lllllllllllllIIIIlIIIIlllIlIIlll, lllllllllllllIIIIlIIIIlllIlIIlIl) ? 1 : 0)) {
                this.releasePlock(lllllllllllllIIIIlIIIIlllIlIIlIl);
            }
        }
        lllllllllllllIIIIlIIIIlllIlIlIll.setName(this.workerNamePrefix.concat(Integer.toString(lllllllllllllIIIIlIIIIlllIlIIllI.poolIndex >>> ForkJoinPool.lIllIIIIlIlIII[0])));
        return lllllllllllllIIIIlIIIIlllIlIIllI;
    }
    
    private final void helpRelease(final long lllllllllllllIIIIlIIIIlIIlllIlIl, final WorkQueue[] lllllllllllllIIIIlIIIIlIIlllIlII, final WorkQueue lllllllllllllIIIIlIIIIlIIllllIIl, final WorkQueue lllllllllllllIIIIlIIIIlIIllllIII, final int lllllllllllllIIIIlIIIIlIIlllIIIl) {
        final int lllllllllllllIIIIlIIIIlIIllllllI;
        final int lllllllllllllIIIIlIIIIlIIlllllIl;
        final WorkQueue lllllllllllllIIIIlIIIIlIIlllllll;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIllllIIl) && llllIllIIllllIl(lllllllllllllIIIIlIIIIlIIllllIIl.eventCount) && llllIllIlIIIIlI(lllllllllllllIIIIlIIIIlIIllllllI = (int)lllllllllllllIIIIlIIIIlIIlllIlIl) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIlllIlII) && llllIllIlIIIlIl(lllllllllllllIIIIlIIIIlIIlllIlII.length, lllllllllllllIIIIlIIIIlIIlllllIl = (lllllllllllllIIIIlIIIIlIIllllllI & ForkJoinPool.lIllIIIIlIlIII[5])) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIlllllll = lllllllllllllIIIIlIIIIlIIlllIlII[lllllllllllllIIIIlIIIIlIIlllllIl]) && llllIllIIlllIlI(llllIllIlIIlIlI(this.ctl, lllllllllllllIIIIlIIIIlIIlllIlIl))) {
            final long lllllllllllllIIIIlIIIIlIlIIIIIIl = (long)(lllllllllllllIIIIlIIIIlIIlllllll.nextWait & ForkJoinPool.lIllIIIIlIlIII[9]) | (long)((int)(lllllllllllllIIIIlIIIIlIIlllIlIl >>> ForkJoinPool.lIllIIIIlIlIII[3]) + ForkJoinPool.lIllIIIIlIlIII[6]) << ForkJoinPool.lIllIIIIlIlIII[3];
            final int lllllllllllllIIIIlIIIIlIlIIIIIII = lllllllllllllIIIIlIIIIlIIllllllI + ForkJoinPool.lIllIIIIlIlIII[6] & ForkJoinPool.lIllIIIIlIlIII[9];
            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIllllIII) && llllIllIlIIIlll(lllllllllllllIIIIlIIIIlIIllllIII.base, lllllllllllllIIIIlIIIIlIIlllIIIl) && llllIllIIllllIl(lllllllllllllIIIIlIIIIlIIllllIIl.eventCount) && llllIllIlIIIlll(lllllllllllllIIIIlIIIIlIIlllllll.eventCount, lllllllllllllIIIIlIIIIlIIllllllI | Integer.MIN_VALUE) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIlIIlllIlIl, lllllllllllllIIIIlIIIIlIlIIIIIIl) ? 1 : 0)) {
                lllllllllllllIIIIlIIIIlIIlllllll.eventCount = lllllllllllllIIIIlIIIIlIlIIIIIII;
                final Thread lllllllllllllIIIIlIIIIlIlIIIIIlI;
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIlIIIIIlI = lllllllllllllIIIIlIIIIlIIlllllll.parker)) {
                    ForkJoinPool.U.unpark(lllllllllllllIIIIlIIIIlIlIIIIIlI);
                }
            }
        }
    }
    
    private static Unsafe getUnsafe() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException lllllllllllllIIIIIllllllIIlIIlII) {
            try {
                return AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new PrivilegedExceptionAction<Unsafe>() {
                    private static final /* synthetic */ int[] lIlIlIlIIIlIll;
                    private static final /* synthetic */ String[] lIlIlIlIIIlIlI;
                    
                    private static boolean lllIllIllIIIllI(final int lllllllllllllIIIlIIIlllllIllIlII, final int lllllllllllllIIIlIIIlllllIllIIll) {
                        return lllllllllllllIIIlIIIlllllIllIlII < lllllllllllllIIIlIIIlllllIllIIll;
                    }
                    
                    private static void lllIllIllIIIlIl() {
                        (lIlIlIlIIIlIll = new int[2])[0] = ((0x5C ^ 0x4B) & ~(0x83 ^ 0x94));
                        ForkJoinPool$2.lIlIlIlIIIlIll[1] = " ".length();
                    }
                    
                    private static boolean lllIllIllIIIlll(final int lllllllllllllIIIlIIIlllllIllIIIl) {
                        return lllllllllllllIIIlIIIlllllIllIIIl != 0;
                    }
                    
                    private static void lllIllIllIIIlII() {
                        (lIlIlIlIIIlIlI = new String[ForkJoinPool$2.lIlIlIlIIIlIll[1]])[ForkJoinPool$2.lIlIlIlIIIlIll[0]] = lllIllIllIIIIll("MykiShspMiYMKw==", "GAGjN");
                    }
                    
                    @Override
                    public Unsafe run() throws Exception {
                        final Class<Unsafe> lllllllllllllIIIlIIIllllllIllIII = Unsafe.class;
                        final Field[] lllllllllllllIIIlIIIllllllIlllII = lllllllllllllIIIlIIIllllllIllIII.getDeclaredFields();
                        final int lllllllllllllIIIlIIIllllllIllIll = lllllllllllllIIIlIIIllllllIlllII.length;
                        int lllllllllllllIIIlIIIllllllIllIlI = ForkJoinPool$2.lIlIlIlIIIlIll[0];
                        while (lllIllIllIIIllI(lllllllllllllIIIlIIIllllllIllIlI, lllllllllllllIIIlIIIllllllIllIll)) {
                            final Field lllllllllllllIIIlIIIllllllIlllIl = lllllllllllllIIIlIIIllllllIlllII[lllllllllllllIIIlIIIllllllIllIlI];
                            lllllllllllllIIIlIIIllllllIlllIl.setAccessible((boolean)(ForkJoinPool$2.lIlIlIlIIIlIll[1] != 0));
                            final Object lllllllllllllIIIlIIIllllllIllllI = lllllllllllllIIIlIIIllllllIlllIl.get(null);
                            if (lllIllIllIIIlll(lllllllllllllIIIlIIIllllllIllIII.isInstance(lllllllllllllIIIlIIIllllllIllllI) ? 1 : 0)) {
                                return lllllllllllllIIIlIIIllllllIllIII.cast(lllllllllllllIIIlIIIllllllIllllI);
                            }
                            ++lllllllllllllIIIlIIIllllllIllIlI;
                            "".length();
                            if (-" ".length() < -" ".length()) {
                                return null;
                            }
                        }
                        throw new NoSuchFieldError(ForkJoinPool$2.lIlIlIlIIIlIlI[ForkJoinPool$2.lIlIlIlIIIlIll[0]]);
                    }
                    
                    private static String lllIllIllIIIIll(String lllllllllllllIIIlIIIlllllIllllll, final String lllllllllllllIIIlIIIllllllIIIIll) {
                        lllllllllllllIIIlIIIlllllIllllll = new String(Base64.getDecoder().decode(lllllllllllllIIIlIIIlllllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                        final StringBuilder lllllllllllllIIIlIIIllllllIIIIlI = new StringBuilder();
                        final char[] lllllllllllllIIIlIIIllllllIIIIIl = lllllllllllllIIIlIIIllllllIIIIll.toCharArray();
                        int lllllllllllllIIIlIIIllllllIIIIII = ForkJoinPool$2.lIlIlIlIIIlIll[0];
                        final float lllllllllllllIIIlIIIlllllIlllIlI = (Object)lllllllllllllIIIlIIIlllllIllllll.toCharArray();
                        final char lllllllllllllIIIlIIIlllllIlllIIl = (char)lllllllllllllIIIlIIIlllllIlllIlI.length;
                        boolean lllllllllllllIIIlIIIlllllIlllIII = ForkJoinPool$2.lIlIlIlIIIlIll[0] != 0;
                        while (lllIllIllIIIllI(lllllllllllllIIIlIIIlllllIlllIII ? 1 : 0, lllllllllllllIIIlIIIlllllIlllIIl)) {
                            final char lllllllllllllIIIlIIIllllllIIIlIl = lllllllllllllIIIlIIIlllllIlllIlI[lllllllllllllIIIlIIIlllllIlllIII];
                            lllllllllllllIIIlIIIllllllIIIIlI.append((char)(lllllllllllllIIIlIIIllllllIIIlIl ^ lllllllllllllIIIlIIIllllllIIIIIl[lllllllllllllIIIlIIIllllllIIIIII % lllllllllllllIIIlIIIllllllIIIIIl.length]));
                            "".length();
                            ++lllllllllllllIIIlIIIllllllIIIIII;
                            ++lllllllllllllIIIlIIIlllllIlllIII;
                            "".length();
                            if (" ".length() == (0x6D ^ 0x19 ^ (0x79 ^ 0x9))) {
                                return null;
                            }
                        }
                        return String.valueOf(lllllllllllllIIIlIIIllllllIIIIlI);
                    }
                    
                    static {
                        lllIllIllIIIlIl();
                        lllIllIllIIIlII();
                    }
                });
            }
            catch (PrivilegedActionException lllllllllllllIIIIIllllllIIlIIIll) {
                throw new RuntimeException(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[33]], lllllllllllllIIIIIllllllIIlIIIll.getCause());
            }
        }
    }
    
    private static boolean llllIllIlIIIlII(final int lllllllllllllIIIIIlllllIlIIllIll, final int lllllllllllllIIIIIlllllIlIIllIlI) {
        return lllllllllllllIIIIIlllllIlIIllIll != lllllllllllllIIIIIlllllIlIIllIlI;
    }
    
    static void quiesceCommonPool() {
        ForkJoinPool.common.awaitQuiescence(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        "".length();
    }
    
    final void runWorker(final WorkQueue lllllllllllllIIIIlIIIIlIlllIlIII) {
        lllllllllllllIIIIlIIIIlIlllIlIII.growArray();
        "".length();
        int lllllllllllllIIIIlIIIIlIlllIlIlI = lllllllllllllIIIIlIIIIlIlllIlIII.hint;
        while (llllIllIIlllIlI(this.scan(lllllllllllllIIIIlIIIIlIlllIlIII, lllllllllllllIIIIlIIIIlIlllIlIlI))) {
            lllllllllllllIIIIlIIIIlIlllIlIlI ^= lllllllllllllIIIIlIIIIlIlllIlIlI << ForkJoinPool.lIllIIIIlIlIII[15];
            lllllllllllllIIIIlIIIIlIlllIlIlI ^= lllllllllllllIIIIlIIIIlIlllIlIlI >>> ForkJoinPool.lIllIIIIlIlIII[16];
            lllllllllllllIIIIlIIIIlIlllIlIlI ^= lllllllllllllIIIIlIIIIlIlllIlIlI << ForkJoinPool.lIllIIIIlIlIII[17];
            "".length();
            if (-" ".length() >= ((0x39 ^ 0x13) & ~(0x76 ^ 0x5C))) {
                return;
            }
        }
    }
    
    private static ForkJoinPool makeCommonPool() {
        int lllllllllllllIIIIIllllllIIlIlllI = ForkJoinPool.lIllIIIIlIlIII[13];
        ForkJoinWorkerThreadFactory lllllllllllllIIIIIllllllIIlIllIl = ForkJoinPool.defaultForkJoinWorkerThreadFactory;
        Thread.UncaughtExceptionHandler lllllllllllllIIIIIllllllIIlIllII = null;
        try {
            final String lllllllllllllIIIIIllllllIIllIIlI = System.getProperty(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[20]]);
            final String lllllllllllllIIIIIllllllIIllIIIl = System.getProperty(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[19]]);
            final String lllllllllllllIIIIIllllllIIllIIII = System.getProperty(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[16]]);
            if (llllIllIIlllIIl(lllllllllllllIIIIIllllllIIllIIlI)) {
                lllllllllllllIIIIIllllllIIlIlllI = Integer.parseInt(lllllllllllllIIIIIllllllIIllIIlI);
            }
            if (llllIllIIlllIIl(lllllllllllllIIIIIllllllIIllIIIl)) {
                lllllllllllllIIIIIllllllIIlIllIl = (ForkJoinWorkerThreadFactory)ClassLoader.getSystemClassLoader().loadClass(lllllllllllllIIIIIllllllIIllIIIl).newInstance();
            }
            if (llllIllIIlllIIl(lllllllllllllIIIIIllllllIIllIIII)) {
                lllllllllllllIIIIIllllllIIlIllII = (Thread.UncaughtExceptionHandler)ClassLoader.getSystemClassLoader().loadClass(lllllllllllllIIIIIllllllIIllIIII).newInstance();
            }
            "".length();
            if ((0x1D ^ 0x19) < (0x8 ^ 0xC)) {
                return null;
            }
        }
        catch (Exception ex) {}
        if (llllIllIIllllIl(lllllllllllllIIIIIllllllIIlIlllI) && llllIllIIllllIl(lllllllllllllIIIIIllllllIIlIlllI = Runtime.getRuntime().availableProcessors() - ForkJoinPool.lIllIIIIlIlIII[0])) {
            lllllllllllllIIIIIllllllIIlIlllI = ForkJoinPool.lIllIIIIlIlIII[10];
        }
        if (llllIllIlIIIlIl(lllllllllllllIIIIIllllllIIlIlllI, ForkJoinPool.lIllIIIIlIlIII[23])) {
            lllllllllllllIIIIIllllllIIlIlllI = ForkJoinPool.lIllIIIIlIlIII[23];
        }
        return new ForkJoinPool(lllllllllllllIIIIIllllllIIlIlllI, lllllllllllllIIIIIllllllIIlIllIl, lllllllllllllIIIIIllllllIIlIllII, ForkJoinPool.lIllIIIIlIlIII[10], ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[32]]);
    }
    
    private int helpComplete(final WorkQueue lllllllllllllIIIIlIIIIlIIIIllIll, final CountedCompleter<?> lllllllllllllIIIIlIIIIlIIIIlllll) {
        int lllllllllllllIIIIlIIIIlIIIIlllIl = ForkJoinPool.lIllIIIIlIlIII[10];
        final WorkQueue[] lllllllllllllIIIIlIIIIlIIIIllllI;
        final int lllllllllllllIIIIlIIIIlIIIlIIIlI;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIIIllllI = this.workQueues) && llllIllIIllllII(lllllllllllllIIIIlIIIIlIIIlIIIlI = lllllllllllllIIIIlIIIIlIIIIllllI.length - ForkJoinPool.lIllIIIIlIlIII[0]) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIIIllIll) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIIIlllll)) {
            int lllllllllllllIIIIlIIIIlIIIlIIlIl = lllllllllllllIIIIlIIIIlIIIIllIll.poolIndex;
            final int lllllllllllllIIIIlIIIIlIIIlIIlII = lllllllllllllIIIIlIIIIlIIIlIIIlI + lllllllllllllIIIIlIIIIlIIIlIIIlI + ForkJoinPool.lIllIIIIlIlIII[0];
            long lllllllllllllIIIIlIIIIlIIIlIIIll = 0L;
            int lllllllllllllIIIIlIIIIlIIIlIIllI = lllllllllllllIIIIlIIIIlIIIlIIlII;
            while (!llllIllIIllllIl(lllllllllllllIIIIlIIIIlIIIIlllIl = lllllllllllllIIIIlIIIIlIIIIlllll.status)) {
                if (llllIllIIlllIll(lllllllllllllIIIIlIIIIlIIIIllIll.internalPopAndExecCC(lllllllllllllIIIIlIIIIlIIIIlllll) ? 1 : 0)) {
                    lllllllllllllIIIIlIIIIlIIIlIIllI = lllllllllllllIIIIlIIIIlIIIlIIlII;
                    "".length();
                    if (" ".length() > " ".length()) {
                        return (0xAA ^ 0xAC) & ~(0x1B ^ 0x1D);
                    }
                }
                else if (llllIllIIllllIl(lllllllllllllIIIIlIIIIlIIIIlllIl = lllllllllllllIIIIlIIIIlIIIIlllll.status)) {
                    "".length();
                    if ((0x50 ^ 0x54) <= 0) {
                        return (0xF4 ^ 0xB5) & ~(0x2A ^ 0x6B);
                    }
                    return lllllllllllllIIIIlIIIIlIIIIlllIl;
                }
                else {
                    final WorkQueue lllllllllllllIIIIlIIIIlIIIlIIlll;
                    if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIIlIIlll = lllllllllllllIIIIlIIIIlIIIIllllI[lllllllllllllIIIIlIIIIlIIIlIIlIl & lllllllllllllIIIIlIIIIlIIIlIIIlI]) && llllIllIIlllIll(lllllllllllllIIIIlIIIIlIIIlIIlll.pollAndExecCC(lllllllllllllIIIIlIIIIlIIIIlllll) ? 1 : 0)) {
                        lllllllllllllIIIIlIIIIlIIIlIIllI = lllllllllllllIIIIlIIIIlIIIlIIlII;
                        "".length();
                        if (null != null) {
                            return (0xC6 ^ 0x9F ^ (0x10 ^ 0x5D)) & (1 + 76 + 57 + 6 ^ 45 + 15 + 86 + 6 ^ -" ".length());
                        }
                    }
                    else if (llllIllIIllllIl(--lllllllllllllIIIIlIIIIlIIIlIIllI)) {
                        if (llllIllIIlllIlI(llllIllIlIIllII(lllllllllllllIIIIlIIIIlIIIlIIIll, lllllllllllllIIIIlIIIIlIIIlIIIll = this.ctl))) {
                            "".length();
                            if (null != null) {
                                return (95 + 61 - 142 + 117 ^ 121 + 51 - 133 + 112) & (12 + 122 - 70 + 86 ^ 65 + 35 - 51 + 81 ^ -" ".length());
                            }
                            return lllllllllllllIIIIlIIIIlIIIIlllIl;
                        }
                        else {
                            lllllllllllllIIIIlIIIIlIIIlIIllI = lllllllllllllIIIIlIIIIlIIIlIIlII;
                        }
                    }
                }
                lllllllllllllIIIIlIIIIlIIIlIIlIl += 2;
                "".length();
                if ("   ".length() < 0) {
                    return (0x6E ^ 0xC) & ~(0x4E ^ 0x2C);
                }
            }
            "".length();
            if ("  ".length() >= (0x42 ^ 0x46)) {
                return (0x4D ^ 0x51) & ~(0x88 ^ 0x94);
            }
        }
        return lllllllllllllIIIIlIIIIlIIIIlllIl;
    }
    
    static {
        llllIllIIlllIII();
        llllIllIIllIlll();
        UTC_UNIT = ForkJoinPool.lIllIIIIlIlIII[0];
        SHARED_QUEUE = ForkJoinPool.lIllIIIIlIlIII[13];
        UAC_MASK = ForkJoinPool.lIllIIIIlIlIII[7];
        SEED_INCREMENT = ForkJoinPool.lIllIIIIlIlIII[8];
        PL_SIGNAL = ForkJoinPool.lIllIIIIlIlIII[0];
        TC_SHIFT = ForkJoinPool.lIllIIIIlIlIII[3];
        SMASK = ForkJoinPool.lIllIIIIlIlIII[5];
        INT_SIGN = Integer.MIN_VALUE;
        ST_SHIFT = ForkJoinPool.lIllIIIIlIlIII[34];
        EC_SHIFT = ForkJoinPool.lIllIIIIlIlIII[19];
        UTC_MASK = ForkJoinPool.lIllIIIIlIlIII[5];
        SHUTDOWN = Integer.MIN_VALUE;
        LIFO_QUEUE = ForkJoinPool.lIllIIIIlIlIII[10];
        PL_SPINS = ForkJoinPool.lIllIIIIlIlIII[1];
        UAC_UNIT = ForkJoinPool.lIllIIIIlIlIII[6];
        PL_LOCK = ForkJoinPool.lIllIIIIlIlIII[2];
        EVENMASK = ForkJoinPool.lIllIIIIlIlIII[12];
        SHORT_SIGN = ForkJoinPool.lIllIIIIlIlIII[4];
        UTC_SHIFT = ForkJoinPool.lIllIIIIlIlIII[10];
        SQMASK = ForkJoinPool.lIllIIIIlIlIII[14];
        MAX_CAP = ForkJoinPool.lIllIIIIlIlIII[23];
        AC_SHIFT = ForkJoinPool.lIllIIIIlIlIII[22];
        E_MASK = ForkJoinPool.lIllIIIIlIlIII[9];
        FIFO_QUEUE = ForkJoinPool.lIllIIIIlIlIII[0];
        E_SEQ = ForkJoinPool.lIllIIIIlIlIII[6];
        MAX_HELP = ForkJoinPool.lIllIIIIlIlIII[21];
        UAC_SHIFT = ForkJoinPool.lIllIIIIlIlIII[19];
        try {
            U = getUnsafe();
            final Class<?> lllllllllllllIIIIIllllllIIIIIlll = ForkJoinPool.class;
            CTL = ForkJoinPool.U.objectFieldOffset(lllllllllllllIIIIIllllllIIIIIlll.getDeclaredField(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[35]]));
            STEALCOUNT = ForkJoinPool.U.objectFieldOffset(lllllllllllllIIIIIllllllIIIIIlll.getDeclaredField(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[36]]));
            PLOCK = ForkJoinPool.U.objectFieldOffset(lllllllllllllIIIIIllllllIIIIIlll.getDeclaredField(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[37]]));
            INDEXSEED = ForkJoinPool.U.objectFieldOffset(lllllllllllllIIIIIllllllIIIIIlll.getDeclaredField(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[38]]));
            final Class<?> lllllllllllllIIIIIllllllIIIIIllI = Thread.class;
            PARKBLOCKER = ForkJoinPool.U.objectFieldOffset(lllllllllllllIIIIIllllllIIIIIllI.getDeclaredField(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[39]]));
            final Class<?> lllllllllllllIIIIIllllllIIIIIlIl = WorkQueue.class;
            QBASE = ForkJoinPool.U.objectFieldOffset(lllllllllllllIIIIIllllllIIIIIlIl.getDeclaredField(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[40]]));
            QLOCK = ForkJoinPool.U.objectFieldOffset(lllllllllllllIIIIIllllllIIIIIlIl.getDeclaredField(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[41]]));
            final Class<?> lllllllllllllIIIIIllllllIIIIIlII = ForkJoinTask[].class;
            ABASE = ForkJoinPool.U.arrayBaseOffset(lllllllllllllIIIIIllllllIIIIIlII);
            final int lllllllllllllIIIIIllllllIIIIIIll = ForkJoinPool.U.arrayIndexScale(lllllllllllllIIIIIllllllIIIIIlII);
            if (llllIllIIlllIll(lllllllllllllIIIIIllllllIIIIIIll & lllllllllllllIIIIIllllllIIIIIIll - ForkJoinPool.lIllIIIIlIlIII[0])) {
                throw new Error(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[42]]);
            }
            ASHIFT = ForkJoinPool.lIllIIIIlIlIII[34] - Integer.numberOfLeadingZeros(lllllllllllllIIIIIllllllIIIIIIll);
            "".length();
            if ("  ".length() >= (0x88 ^ 0xB7 ^ (0x1D ^ 0x26))) {
                return;
            }
        }
        catch (Exception lllllllllllllIIIIIllllllIIIIIIlI) {
            throw new Error(lllllllllllllIIIIIllllllIIIIIIlI);
        }
        submitters = new ThreadLocal<Submitter>();
        defaultForkJoinWorkerThreadFactory = new DefaultForkJoinWorkerThreadFactory();
        modifyThreadPermission = new RuntimePermission(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[43]]);
        common = AccessController.doPrivileged((PrivilegedAction<ForkJoinPool>)new PrivilegedAction<ForkJoinPool>() {
            @Override
            public ForkJoinPool run() {
                return makeCommonPool();
            }
        });
        final int lllllllllllllIIIIIllllllIIIIIIIl = ForkJoinPool.common.parallelism;
        int commonParallelism2;
        if (llllIllIlIIIIlI(lllllllllllllIIIIIllllllIIIIIIIl)) {
            commonParallelism2 = lllllllllllllIIIIIllllllIIIIIIIl;
            "".length();
            if (-(0x5F ^ 0x5B) >= 0) {
                return;
            }
        }
        else {
            commonParallelism2 = ForkJoinPool.lIllIIIIlIlIII[0];
        }
        commonParallelism = commonParallelism2;
    }
    
    public boolean getAsyncMode() {
        int n;
        if (llllIllIlIIIlll(this.mode, ForkJoinPool.lIllIIIIlIlIII[0])) {
            n = ForkJoinPool.lIllIIIIlIlIII[0];
            "".length();
            if (((35 + 2 + 74 + 77 ^ 100 + 57 - 1 + 3) & (0x75 ^ 0x7C ^ (0x77 ^ 0x5D) ^ -" ".length())) >= (0x3A ^ 0x68 ^ (0x21 ^ 0x77))) {
                return ((194 + 201 - 328 + 182 ^ 140 + 61 - 74 + 61) & (0xB8 ^ 0xAC ^ (0x77 ^ 0x26) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ForkJoinPool.lIllIIIIlIlIII[10];
        }
        return n != 0;
    }
    
    public <T> ForkJoinTask<T> submit(final ForkJoinTask<T> lllllllllllllIIIIlIIIIIIlIIlIlll) {
        if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIIIlIIlIlll)) {
            throw new NullPointerException();
        }
        this.externalPush(lllllllllllllIIIIlIIIIIIlIIlIlll);
        return lllllllllllllIIIIlIIIIIIlIIlIlll;
    }
    
    private int acquirePlock() {
        int lllllllllllllIIIIlIIIIlllllIlllI = ForkJoinPool.lIllIIIIlIlIII[1];
        int lllllllllllllIIIIlIIIIlllllIllIl;
        int lllllllllllllIIIIlIIIIllllllIIlI;
        while (!llllIllIIlllIlI((lllllllllllllIIIIlIIIIlllllIllIl = this.plock) & ForkJoinPool.lIllIIIIlIlIII[2]) || !llllIllIIlllIll(ForkJoinPool.U.compareAndSwapInt(this, ForkJoinPool.PLOCK, lllllllllllllIIIIlIIIIlllllIllIl, lllllllllllllIIIIlIIIIllllllIIlI = lllllllllllllIIIIlIIIIlllllIllIl + ForkJoinPool.lIllIIIIlIlIII[2]) ? 1 : 0)) {
            if (llllIllIIllllII(lllllllllllllIIIIlIIIIlllllIlllI)) {
                if (!llllIllIIllllII(ThreadLocalRandom.current().nextInt())) {
                    continue;
                }
                --lllllllllllllIIIIlIIIIlllllIlllI;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return (0x73 ^ 0x28) & ~(0xF5 ^ 0xAE);
                }
                continue;
            }
            else {
                if (!llllIllIIlllIll(ForkJoinPool.U.compareAndSwapInt(this, ForkJoinPool.PLOCK, lllllllllllllIIIIlIIIIlllllIllIl, lllllllllllllIIIIlIIIIlllllIllIl | ForkJoinPool.lIllIIIIlIlIII[0]) ? 1 : 0)) {
                    continue;
                }
                final float lllllllllllllIIIIlIIIIlllllIlIII = (float)this;
                synchronized (this) {
                    Label_0357: {
                        if (llllIllIIlllIll(this.plock & ForkJoinPool.lIllIIIIlIlIII[0])) {
                            try {
                                this.wait();
                                "".length();
                                if (((128 + 237 - 142 + 17 ^ 104 + 93 - 190 + 181) & (0xB9 ^ 0x8E ^ (0x5C ^ 0x27) ^ -" ".length())) != 0x0) {
                                    return (209 + 42 - 231 + 195 ^ 145 + 145 - 193 + 59) & (8 + 11 + 76 + 41 ^ 115 + 173 - 232 + 139 ^ -" ".length());
                                }
                                break Label_0357;
                            }
                            catch (InterruptedException lllllllllllllIIIIlIIIIllllllIIII) {
                                try {
                                    Thread.currentThread().interrupt();
                                    "".length();
                                    if ((0x1 ^ 0x5) <= 0) {
                                        return (0x69 ^ 0x72) & ~(0x39 ^ 0x22);
                                    }
                                }
                                catch (SecurityException ex) {}
                                "".length();
                                if ("  ".length() <= -" ".length()) {
                                    return (0x5A ^ 0x73) & ~(0x31 ^ 0x18);
                                }
                                break Label_0357;
                            }
                        }
                        this.notifyAll();
                    }
                    // monitorexit(this)
                    "".length();
                    if (null != null) {
                        return (34 + 91 + 28 + 0 ^ 99 + 26 - 46 + 53) & (0x27 ^ 0x3F ^ (0x2 ^ 0x7) ^ -" ".length());
                    }
                }
                "".length();
                if (-(65 + 28 + 46 + 3 ^ 58 + 30 - 56 + 106) >= 0) {
                    return (95 + 124 - 89 + 122 ^ 5 + 40 - 30 + 152) & (0x3E ^ 0x3A ^ (0x53 ^ 0xC) ^ -" ".length());
                }
                continue;
            }
        }
        return lllllllllllllIIIIlIIIIllllllIIlI;
    }
    
    private static boolean llllIllIlIIlIll(final Object lllllllllllllIIIIIlllllIlIllIIll, final Object lllllllllllllIIIIIlllllIlIllIIlI) {
        return lllllllllllllIIIIIlllllIlIllIIll != lllllllllllllIIIIIlllllIlIllIIlI;
    }
    
    private static int llllIllIlIIlIlI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llllIllIlIIIIIl(final Object lllllllllllllIIIIIlllllIlIlIllIl, final Object lllllllllllllIIIIIlllllIlIlIllII) {
        return lllllllllllllIIIIIlllllIlIlIllIl == lllllllllllllIIIIIlllllIlIlIllII;
    }
    
    private static boolean llllIllIlIIIIII(final int lllllllllllllIIIIIlllllIlIllllll, final int lllllllllllllIIIIIlllllIlIlllllI) {
        return lllllllllllllIIIIIlllllIlIllllll < lllllllllllllIIIIIlllllIlIlllllI;
    }
    
    @Override
    public void execute(final Runnable lllllllllllllIIIIlIIIIIIlIIlllll) {
        if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIIIlIIlllll)) {
            throw new NullPointerException();
        }
        ForkJoinTask<?> lllllllllllllIIIIlIIIIIIlIIllllI = null;
        if (llllIllIIlllIll((lllllllllllllIIIIlIIIIIIlIIlllll instanceof ForkJoinTask) ? 1 : 0)) {
            final ForkJoinTask<?> lllllllllllllIIIIlIIIIIIlIlIIIIl = (ForkJoinTask<?>)lllllllllllllIIIIlIIIIIIlIIlllll;
            "".length();
            if (((63 + 56 - 114 + 145 ^ 109 + 34 - 60 + 86) & (0xD1 ^ 0xA4 ^ (0x62 ^ 0x28) ^ -" ".length())) > 0) {
                return;
            }
        }
        else {
            lllllllllllllIIIIlIIIIIIlIIllllI = new ForkJoinTask.RunnableExecuteAction(lllllllllllllIIIIlIIIIIIlIIlllll);
        }
        this.externalPush(lllllllllllllIIIIlIIIIIIlIIllllI);
    }
    
    @Override
    public void shutdown() {
        checkPermission();
        this.tryTerminate((boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0), (boolean)(ForkJoinPool.lIllIIIIlIlIII[0] != 0));
        "".length();
    }
    
    private static final synchronized int nextPoolId() {
        return ForkJoinPool.poolNumberSequence += ForkJoinPool.lIllIIIIlIlIII[0];
    }
    
    public static ForkJoinPool commonPool() {
        return ForkJoinPool.common;
    }
    
    private static boolean llllIllIlIIIIlI(final int lllllllllllllIIIIIlllllIlIIllllI) {
        return lllllllllllllIIIIIlllllIlIIllllI > 0;
    }
    
    private static int llllIllIlIIllIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    final void incrementActiveCount() {
        long lllllllllllllIIIIlIIIIllIIIlIIIl;
        while (!llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIllIIIlIIIl = this.ctl, (lllllllllllllIIIIlIIIIllIIIlIIIl & 0xFFFFFFFFFFFFL) | (lllllllllllllIIIIlIIIIllIIIlIIIl & 0xFFFF000000000000L) + 281474976710656L) ? 1 : 0)) {}
    }
    
    final void helpQuiescePool(final WorkQueue lllllllllllllIIIIlIIIIIllIIlIIIl) {
        final ForkJoinTask<?> lllllllllllllIIIIlIIIIIllIIlIIll = lllllllllllllIIIIlIIIIIllIIlIIIl.currentSteal;
        boolean lllllllllllllIIIIlIIIIIllIIlIllI = ForkJoinPool.lIllIIIIlIlIII[0] != 0;
        while (true) {
            ForkJoinTask<?> lllllllllllllIIIIlIIIIIllIIlIlll;
            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllIIlIlll = lllllllllllllIIIIlIIIIIllIIlIIIl.nextLocalTask())) {
                lllllllllllllIIIIlIIIIIllIIlIlll.doExec();
                "".length();
                "".length();
                if ((0x9 ^ 0x39 ^ (0x54 ^ 0x60)) < 0) {
                    return;
                }
                continue;
            }
            else {
                final WorkQueue lllllllllllllIIIIlIIIIIllIIllIII;
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllIIllIII = this.findNonEmptyStealQueue())) {
                    if (llllIllIIlllIlI(lllllllllllllIIIIlIIIIIllIIlIllI ? 1 : 0)) {
                        lllllllllllllIIIIlIIIIIllIIlIllI = (ForkJoinPool.lIllIIIIlIlIII[0] != 0);
                        long lllllllllllllIIIIlIIIIIllIIlllIl;
                        while (!llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIIllIIlllIl = this.ctl, (lllllllllllllIIIIlIIIIIllIIlllIl & 0xFFFFFFFFFFFFL) | (lllllllllllllIIIIlIIIIIllIIlllIl & 0xFFFF000000000000L) + 281474976710656L) ? 1 : 0)) {}
                    }
                    final int lllllllllllllIIIIlIIIIIllIIlllII;
                    if (llllIllIIllllIl((lllllllllllllIIIIlIIIIIllIIlllII = lllllllllllllIIIIlIIIIIllIIllIII.base) - lllllllllllllIIIIlIIIIIllIIllIII.top) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllIIlIlll = lllllllllllllIIIIlIIIIIllIIllIII.pollAt(lllllllllllllIIIIlIIIIIllIIlllII))) {
                        final ForkJoinTask<?> currentSteal = lllllllllllllIIIIlIIIIIllIIlIlll;
                        lllllllllllllIIIIlIIIIIllIIlIIIl.currentSteal = currentSteal;
                        currentSteal.doExec();
                        "".length();
                        lllllllllllllIIIIlIIIIIllIIlIIIl.currentSteal = lllllllllllllIIIIlIIIIIllIIlIIll;
                        "".length();
                        if ((0x62 ^ 0x66) == "   ".length()) {
                            return;
                        }
                    }
                }
                else if (llllIllIIlllIll(lllllllllllllIIIIlIIIIIllIIlIllI ? 1 : 0)) {
                    final long lllllllllllllIIIIlIIIIIllIIllIlI;
                    final long lllllllllllllIIIIlIIIIIllIIllIll = ((lllllllllllllIIIIlIIIIIllIIllIlI = this.ctl) & 0xFFFFFFFFFFFFL) | (lllllllllllllIIIIlIIIIIllIIllIlI & 0xFFFF000000000000L) - 281474976710656L;
                    if (llllIllIIlllIlI((int)(lllllllllllllIIIIlIIIIIllIIllIll >> ForkJoinPool.lIllIIIIlIlIII[22]) + this.parallelism)) {
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    else {
                        if (llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIIllIIllIlI, lllllllllllllIIIIlIIIIIllIIllIll) ? 1 : 0)) {
                            lllllllllllllIIIIlIIIIIllIIlIllI = (ForkJoinPool.lIllIIIIlIlIII[10] != 0);
                        }
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                }
                else {
                    final long lllllllllllllIIIIlIIIIIllIIllIIl;
                    if (llllIllIlIIIllI((int)((lllllllllllllIIIIlIIIIIllIIllIIl = this.ctl) >> ForkJoinPool.lIllIIIIlIlIII[22]) + this.parallelism) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIIllIIllIIl, (lllllllllllllIIIIlIIIIIllIIllIIl & 0xFFFFFFFFFFFFL) | (lllllllllllllIIIIlIIIIIllIIllIIl & 0xFFFF000000000000L) + 281474976710656L) ? 1 : 0)) {
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                        break;
                    }
                }
                "".length();
                if (null != null) {
                    return;
                }
                continue;
            }
        }
    }
    
    private static boolean llllIllIIlllIIl(final Object lllllllllllllIIIIIlllllIlIllIIII) {
        return lllllllllllllIIIIIlllllIlIllIIII != null;
    }
    
    private void releasePlock(final int lllllllllllllIIIIlIIIIllllIlllll) {
        this.plock = lllllllllllllIIIIlIIIIllllIlllll;
        final Exception lllllllllllllIIIIlIIIIllllIlllII = (Exception)this;
        synchronized (this) {
            this.notifyAll();
            // monitorexit(this)
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
    }
    
    private static boolean llllIllIlIIIlIl(final int lllllllllllllIIIIIlllllIlIllIlll, final int lllllllllllllIIIIIlllllIlIllIllI) {
        return lllllllllllllIIIIIlllllIlIllIlll > lllllllllllllIIIIIlllllIlIllIllI;
    }
    
    private static boolean llllIllIIlllIll(final int lllllllllllllIIIIIlllllIlIlIlIII) {
        return lllllllllllllIIIIIlllllIlIlIlIII != 0;
    }
    
    public int getPoolSize() {
        return this.parallelism + (short)(this.ctl >>> ForkJoinPool.lIllIIIIlIlIII[3]);
    }
    
    final boolean tryCompensate(final long lllllllllllllIIIIlIIIIIlllllIllI) {
        final WorkQueue[] lllllllllllllIIIIlIIIIIlllllIlIl = this.workQueues;
        final int lllllllllllllIIIIlIIIIIlllllIlII = this.parallelism;
        final int lllllllllllllIIIIlIIIIIlllllIIll = (int)lllllllllllllIIIIlIIIIIlllllIllI;
        final int lllllllllllllIIIIlIIIIIllllllIII;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlllllIlIl) && llllIllIIllllII(lllllllllllllIIIIlIIIIIllllllIII = lllllllllllllIIIIlIIIIIlllllIlIl.length - ForkJoinPool.lIllIIIIlIlIII[0]) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlllllIIll) && llllIllIIlllIlI(llllIllIlIIllIl(this.ctl, lllllllllllllIIIIlIIIIIlllllIllI))) {
            final WorkQueue lllllllllllllIIIIlIIIIIllllllIIl = lllllllllllllIIIIlIIIIIlllllIlIl[lllllllllllllIIIIlIIIIIlllllIIll & lllllllllllllIIIIlIIIIIllllllIII];
            if (llllIllIIlllIll(lllllllllllllIIIIlIIIIIlllllIIll) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllllllIIl)) {
                final long lllllllllllllIIIIlIIIIlIIIIIIIlI = (long)(lllllllllllllIIIIlIIIIIllllllIIl.nextWait & ForkJoinPool.lIllIIIIlIlIII[9]) | (lllllllllllllIIIIlIIIIIlllllIllI & 0xFFFFFFFF00000000L);
                final int lllllllllllllIIIIlIIIIlIIIIIIIIl = lllllllllllllIIIIlIIIIIlllllIIll + ForkJoinPool.lIllIIIIlIlIII[6] & ForkJoinPool.lIllIIIIlIlIII[9];
                if (llllIllIlIIIlll(lllllllllllllIIIIlIIIIIllllllIIl.eventCount, lllllllllllllIIIIlIIIIIlllllIIll | Integer.MIN_VALUE) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIIlllllIllI, lllllllllllllIIIIlIIIIlIIIIIIIlI) ? 1 : 0)) {
                    lllllllllllllIIIIlIIIIIllllllIIl.eventCount = lllllllllllllIIIIlIIIIlIIIIIIIIl;
                    final Thread lllllllllllllIIIIlIIIIlIIIIIIIll;
                    if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIIIIIIll = lllllllllllllIIIIlIIIIIllllllIIl.parker)) {
                        ForkJoinPool.U.unpark(lllllllllllllIIIIlIIIIlIIIIIIIll);
                    }
                    return ForkJoinPool.lIllIIIIlIlIII[0] != 0;
                }
                "".length();
                if (null != null) {
                    return ((0x60 ^ 0x40 ^ (0x5D ^ 0x65)) & (0x23 ^ 0x10 ^ (0xEB ^ 0xC0) ^ -" ".length())) != 0x0;
                }
            }
            else {
                final int lllllllllllllIIIIlIIIIIllllllIlI;
                if (llllIllIIllllII(lllllllllllllIIIIlIIIIIllllllIlI = (short)(lllllllllllllIIIIlIIIIIlllllIllI >>> ForkJoinPool.lIllIIIIlIlIII[3])) && llllIllIlIIIlIl((int)(lllllllllllllIIIIlIIIIIlllllIllI >> ForkJoinPool.lIllIIIIlIlIII[22]) + lllllllllllllIIIIlIIIIIlllllIlII, ForkJoinPool.lIllIIIIlIlIII[0])) {
                    final long lllllllllllllIIIIlIIIIlIIIIIIIII = (lllllllllllllIIIIlIIIIIlllllIllI - 281474976710656L & 0xFFFF000000000000L) | (lllllllllllllIIIIlIIIIIlllllIllI & 0xFFFFFFFFFFFFL);
                    if (llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIIlllllIllI, lllllllllllllIIIIlIIIIlIIIIIIIII) ? 1 : 0)) {
                        return ForkJoinPool.lIllIIIIlIlIII[0] != 0;
                    }
                    "".length();
                    if ((0x62 ^ 0x66) == 0x0) {
                        return ((0xE2 ^ 0xC6) & ~(0x82 ^ 0xA6)) != 0x0;
                    }
                }
                else if (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIllllllIlI + lllllllllllllIIIIlIIIIIlllllIlII, ForkJoinPool.lIllIIIIlIlIII[23])) {
                    final long lllllllllllllIIIIlIIIIIllllllIll = (lllllllllllllIIIIlIIIIIlllllIllI + 4294967296L & 0xFFFF00000000L) | (lllllllllllllIIIIlIIIIIlllllIllI & 0xFFFF0000FFFFFFFFL);
                    if (llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIIlllllIllI, lllllllllllllIIIIlIIIIIllllllIll) ? 1 : 0)) {
                        Throwable lllllllllllllIIIIlIIIIIlllllllIl = null;
                        ForkJoinWorkerThread lllllllllllllIIIIlIIIIIlllllllII = null;
                        try {
                            final ForkJoinWorkerThreadFactory lllllllllllllIIIIlIIIIIllllllllI;
                            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllllllllI = this.factory) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlllllllII = lllllllllllllIIIIlIIIIIllllllllI.newThread(this))) {
                                lllllllllllllIIIIlIIIIIlllllllII.start();
                                return ForkJoinPool.lIllIIIIlIlIII[0] != 0;
                            }
                            "".length();
                            if (((0xC4 ^ 0x8C ^ (0x26 ^ 0x7C)) & (90 + 129 - 90 + 8 ^ 29 + 14 + 86 + 26 ^ -" ".length())) != ((24 + 89 - 36 + 73 ^ 43 + 11 + 102 + 16) & (91 + 3 - 71 + 135 ^ 21 + 54 - 6 + 95 ^ -" ".length()))) {
                                return ((0xB ^ 0x61 ^ (0x41 ^ 0x1E)) & (0xA0 ^ 0x8D ^ (0x40 ^ 0x58) ^ -" ".length())) != 0x0;
                            }
                        }
                        catch (Throwable lllllllllllllIIIIlIIIIIlllllllll) {
                            lllllllllllllIIIIlIIIIIlllllllIl = lllllllllllllIIIIlIIIIIlllllllll;
                        }
                        this.deregisterWorker(lllllllllllllIIIIlIIIIIlllllllII, lllllllllllllIIIIlIIIIIlllllllIl);
                    }
                }
            }
        }
        return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
    }
    
    private static boolean llllIllIIlllIlI(final int lllllllllllllIIIIIlllllIlIlIIllI) {
        return lllllllllllllIIIIIlllllIlIlIIllI == 0;
    }
    
    public int getParallelism() {
        final int lllllllllllllIIIIlIIIIIIIlIIlIll;
        int n;
        if (llllIllIlIIIIlI(lllllllllllllIIIIlIIIIIIIlIIlIll = this.parallelism)) {
            n = lllllllllllllIIIIlIIIIIIIlIIlIll;
            "".length();
            if ("  ".length() == 0) {
                return (169 + 166 - 312 + 164 ^ 57 + 93 - 143 + 126) & (0x7 ^ 0x2D ^ (0x18 ^ 0xC) ^ -" ".length());
            }
        }
        else {
            n = ForkJoinPool.lIllIIIIlIlIII[0];
        }
        return n;
    }
    
    private static boolean llllIllIIllllII(final int lllllllllllllIIIIIlllllIlIlIIlII) {
        return lllllllllllllIIIIIlllllIlIlIIlII >= 0;
    }
    
    public boolean hasQueuedSubmissions() {
        final WorkQueue[] lllllllllllllIIIIIllllllllllIllI;
        if (llllIllIIlllIIl(lllllllllllllIIIIIllllllllllIllI = this.workQueues)) {
            int lllllllllllllIIIIIlllllllllllIII = ForkJoinPool.lIllIIIIlIlIII[10];
            while (llllIllIlIIIIII(lllllllllllllIIIIIlllllllllllIII, lllllllllllllIIIIIllllllllllIllI.length)) {
                final WorkQueue lllllllllllllIIIIIlllllllllllIIl;
                if (llllIllIIlllIIl(lllllllllllllIIIIIlllllllllllIIl = lllllllllllllIIIIIllllllllllIllI[lllllllllllllIIIIIlllllllllllIII]) && llllIllIIlllIlI(lllllllllllllIIIIIlllllllllllIIl.isEmpty() ? 1 : 0)) {
                    return ForkJoinPool.lIllIIIIlIlIII[0] != 0;
                }
                lllllllllllllIIIIIlllllllllllIII += 2;
                "".length();
                if (((139 + 136 - 114 + 64 ^ 14 + 10 + 159 + 3) & (105 + 103 - 105 + 141 ^ 45 + 7 + 116 + 7 ^ -" ".length())) > 0) {
                    return ((0x6C ^ 0x39 ^ (0x5C ^ 0x51)) & (0x99 ^ 0x80 ^ (0x2 ^ 0x43) ^ -" ".length())) != 0x0;
                }
            }
        }
        return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
    }
    
    private WorkQueue findNonEmptyStealQueue() {
        final int lllllllllllllIIIIlIIIIIllIlIlllI = ThreadLocalRandom.current().nextInt();
        do {
            final int lllllllllllllIIIIlIIIIIllIllIIIl = this.plock;
            final WorkQueue[] lllllllllllllIIIIlIIIIIllIllIIII;
            final int lllllllllllllIIIIlIIIIIllIllIIlI;
            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllIllIIII = this.workQueues) && llllIllIIllllII(lllllllllllllIIIIlIIIIIllIllIIlI = lllllllllllllIIIIlIIIIIllIllIIII.length - ForkJoinPool.lIllIIIIlIlIII[0])) {
                int lllllllllllllIIIIlIIIIIllIllIIll = lllllllllllllIIIIlIIIIIllIllIIlI + ForkJoinPool.lIllIIIIlIlIII[0] << ForkJoinPool.lIllIIIIlIlIII[2];
                while (llllIllIIllllII(lllllllllllllIIIIlIIIIIllIllIIll)) {
                    final WorkQueue lllllllllllllIIIIlIIIIIllIllIlII;
                    if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllIllIlII = lllllllllllllIIIIlIIIIIllIllIIII[(lllllllllllllIIIIlIIIIIllIlIlllI - lllllllllllllIIIIlIIIIIllIllIIll << ForkJoinPool.lIllIIIIlIlIII[0] | ForkJoinPool.lIllIIIIlIlIII[0]) & lllllllllllllIIIIlIIIIIllIllIIlI]) && llllIllIIllllIl(lllllllllllllIIIIlIIIIIllIllIlII.base - lllllllllllllIIIIlIIIIIllIllIlII.top)) {
                        return lllllllllllllIIIIlIIIIIllIllIlII;
                    }
                    --lllllllllllllIIIIlIIIIIllIllIIll;
                    "".length();
                    if ((0x7F ^ 0x7A) == 0x0) {
                        return null;
                    }
                }
            }
            if (llllIllIlIIIlll(this.plock, lllllllllllllIIIIlIIIIIllIllIIIl)) {
                return null;
            }
            "".length();
        } while ("  ".length() != ((132 + 104 - 214 + 118 ^ 111 + 80 - 13 + 17) & (0x11 ^ 0x27 ^ (0xFB ^ 0x82) ^ -" ".length())));
        return null;
    }
    
    static int getSurplusQueuedTaskCount() {
        final Thread lllllllllllllIIIIlIIIIIlIllIllIl;
        if (llllIllIIlllIll(((lllllllllllllIIIIlIIIIIlIllIllIl = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            final ForkJoinWorkerThread lllllllllllllIIIIlIIIIIlIlllIIII;
            final ForkJoinPool lllllllllllllIIIIlIIIIIlIllIllll;
            int lllllllllllllIIIIlIIIIIlIlllIIll = (lllllllllllllIIIIlIIIIIlIllIllll = (lllllllllllllIIIIlIIIIIlIlllIIII = (ForkJoinWorkerThread)lllllllllllllIIIIlIIIIIlIllIllIl).pool).parallelism;
            final WorkQueue lllllllllllllIIIIlIIIIIlIllIlllI;
            final int lllllllllllllIIIIlIIIIIlIlllIIlI = (lllllllllllllIIIIlIIIIIlIllIlllI = lllllllllllllIIIIlIIIIIlIlllIIII.workQueue).top - lllllllllllllIIIIlIIIIIlIllIlllI.base;
            final int lllllllllllllIIIIlIIIIIlIlllIIIl = (int)(lllllllllllllIIIIlIIIIIlIllIllll.ctl >> ForkJoinPool.lIllIIIIlIlIII[22]) + lllllllllllllIIIIlIIIIIlIlllIIll;
            final int n = lllllllllllllIIIIlIIIIIlIlllIIlI;
            int n2;
            if (llllIllIlIIIlIl(lllllllllllllIIIIlIIIIIlIlllIIIl, lllllllllllllIIIIlIIIIIlIlllIIll >>>= ForkJoinPool.lIllIIIIlIlIII[0])) {
                n2 = ForkJoinPool.lIllIIIIlIlIII[10];
                "".length();
                if (" ".length() < 0) {
                    return (16 + 95 - 94 + 133 ^ 66 + 6 + 95 + 31) & (0x6C ^ 0x1F ^ (0xBB ^ 0x98) ^ -" ".length());
                }
            }
            else if (llllIllIlIIIlIl(lllllllllllllIIIIlIIIIIlIlllIIIl, lllllllllllllIIIIlIIIIIlIlllIIll >>>= ForkJoinPool.lIllIIIIlIlIII[0])) {
                n2 = ForkJoinPool.lIllIIIIlIlIII[0];
                "".length();
                if (-" ".length() > 0) {
                    return (0x27 ^ 0x6A ^ (0xE3 ^ 0xBD)) & (98 + 105 - 164 + 123 ^ 19 + 129 - 95 + 124 ^ -" ".length());
                }
            }
            else if (llllIllIlIIIlIl(lllllllllllllIIIIlIIIIIlIlllIIIl, lllllllllllllIIIIlIIIIIlIlllIIll >>>= ForkJoinPool.lIllIIIIlIlIII[0])) {
                n2 = ForkJoinPool.lIllIIIIlIlIII[2];
                "".length();
                if (-(0x79 ^ 0x7D) >= 0) {
                    return (0x66 ^ 0x3E) & ~(0x7B ^ 0x23);
                }
            }
            else if (llllIllIlIIIlIl(lllllllllllllIIIIlIIIIIlIlllIIIl, lllllllllllllIIIIlIIIIIlIlllIIll >>>= ForkJoinPool.lIllIIIIlIlIII[0])) {
                n2 = ForkJoinPool.lIllIIIIlIlIII[11];
                "".length();
                if (-"   ".length() > 0) {
                    return (17 + 184 - 100 + 93 ^ 50 + 78 + 54 + 16) & (0x1D ^ 0x46 ^ (0x14 ^ 0x4B) ^ -" ".length());
                }
            }
            else {
                n2 = ForkJoinPool.lIllIIIIlIlIII[18];
            }
            return n - n2;
        }
        return ForkJoinPool.lIllIIIIlIlIII[10];
    }
    
    final boolean tryExternalUnpush(final ForkJoinTask<?> lllllllllllllIIIIlIIIIIlIIIlIlIl) {
        final Submitter lllllllllllllIIIIlIIIIIlIIIlIlII = ForkJoinPool.submitters.get();
        final WorkQueue[] lllllllllllllIIIIlIIIIIlIIIlIIll = this.workQueues;
        boolean lllllllllllllIIIIlIIIIIlIIIlIIlI = ForkJoinPool.lIllIIIIlIlIII[10] != 0;
        final int lllllllllllllIIIIlIIIIIlIIIllIII;
        final WorkQueue lllllllllllllIIIIlIIIIIlIIIllIlI;
        final int lllllllllllllIIIIlIIIIIlIIIlIlll;
        final ForkJoinTask<?>[] lllllllllllllIIIIlIIIIIlIIIllIIl;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIIIlIlII) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIIIlIIll) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlIIIllIII = lllllllllllllIIIIlIIIIIlIIIlIIll.length - ForkJoinPool.lIllIIIIlIlIII[0]) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIIIllIlI = lllllllllllllIIIIlIIIIIlIIIlIIll[lllllllllllllIIIIlIIIIIlIIIlIlII.seed & lllllllllllllIIIIlIIIIIlIIIllIII & ForkJoinPool.lIllIIIIlIlIII[14]]) && llllIllIlIIIlII(lllllllllllllIIIIlIIIIIlIIIllIlI.base, lllllllllllllIIIIlIIIIIlIIIlIlll = lllllllllllllIIIIlIIIIIlIIIllIlI.top) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIIIllIIl = lllllllllllllIIIIlIIIIIlIIIllIlI.array)) {
            final long lllllllllllllIIIIlIIIIIlIIIllIll = ((lllllllllllllIIIIlIIIIIlIIIllIIl.length - ForkJoinPool.lIllIIIIlIlIII[0] & lllllllllllllIIIIlIIIIIlIIIlIlll - ForkJoinPool.lIllIIIIlIlIII[0]) << ForkJoinPool.ASHIFT) + ForkJoinPool.ABASE;
            if (llllIllIlIIIIIl(ForkJoinPool.U.getObject(lllllllllllllIIIIlIIIIIlIIIllIIl, lllllllllllllIIIIlIIIIIlIIIllIll), lllllllllllllIIIIlIIIIIlIIIlIlIl) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapInt(lllllllllllllIIIIlIIIIIlIIIllIlI, ForkJoinPool.QLOCK, ForkJoinPool.lIllIIIIlIlIII[10], ForkJoinPool.lIllIIIIlIlIII[0]) ? 1 : 0)) {
                if (llllIllIlIIIlll(lllllllllllllIIIIlIIIIIlIIIllIlI.top, lllllllllllllIIIIlIIIIIlIIIlIlll) && llllIllIlIIIIIl(lllllllllllllIIIIlIIIIIlIIIllIlI.array, lllllllllllllIIIIlIIIIIlIIIllIIl) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapObject(lllllllllllllIIIIlIIIIIlIIIllIIl, lllllllllllllIIIIlIIIIIlIIIllIll, lllllllllllllIIIIlIIIIIlIIIlIlIl, null) ? 1 : 0)) {
                    lllllllllllllIIIIlIIIIIlIIIllIlI.top = lllllllllllllIIIIlIIIIIlIIIlIlll - ForkJoinPool.lIllIIIIlIlIII[0];
                    lllllllllllllIIIIlIIIIIlIIIlIIlI = (ForkJoinPool.lIllIIIIlIlIII[0] != 0);
                }
                lllllllllllllIIIIlIIIIIlIIIllIlI.qlock = ForkJoinPool.lIllIIIIlIlIII[10];
            }
        }
        return lllllllllllllIIIIlIIIIIlIIIlIIlI;
    }
    
    public Thread.UncaughtExceptionHandler getUncaughtExceptionHandler() {
        return this.ueh;
    }
    
    @Override
    public boolean awaitTermination(final long lllllllllllllIIIIIlllllllIIIIlll, final TimeUnit lllllllllllllIIIIIlllllllIIIIIIl) throws InterruptedException {
        if (llllIllIIlllIll(Thread.interrupted() ? 1 : 0)) {
            throw new InterruptedException();
        }
        if (llllIllIlIIIIIl(this, ForkJoinPool.common)) {
            this.awaitQuiescence(lllllllllllllIIIIIlllllllIIIIlll, lllllllllllllIIIIIlllllllIIIIIIl);
            "".length();
            return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
        }
        long lllllllllllllIIIIIlllllllIIIIlIl = lllllllllllllIIIIIlllllllIIIIIIl.toNanos(lllllllllllllIIIIIlllllllIIIIlll);
        if (llllIllIIlllIll(this.isTerminated() ? 1 : 0)) {
            return ForkJoinPool.lIllIIIIlIlIII[0] != 0;
        }
        if (llllIllIlIIIllI(llllIllIlIlIIll(lllllllllllllIIIIIlllllllIIIIlIl, 0L))) {
            return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
        }
        final long lllllllllllllIIIIIlllllllIIIIlII = System.nanoTime() + lllllllllllllIIIIIlllllllIIIIlIl;
        final short lllllllllllllIIIIIllllllIllllllI = (short)this;
        synchronized (this) {
            while (!llllIllIIlllIll(this.isTerminated() ? 1 : 0)) {
                if (llllIllIlIIIllI(llllIllIlIlIIll(lllllllllllllIIIIIlllllllIIIIlIl, 0L))) {
                    return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
                }
                final long lllllllllllllIIIIIlllllllIIIlIIl = TimeUnit.NANOSECONDS.toMillis(lllllllllllllIIIIIlllllllIIIIlIl);
                long n;
                if (llllIllIlIIIIlI(llllIllIlIlIIll(lllllllllllllIIIIIlllllllIIIlIIl, 0L))) {
                    n = lllllllllllllIIIIIlllllllIIIlIIl;
                    "".length();
                    if ("  ".length() < ((0x9 ^ 0x49) & ~(0x2F ^ 0x6F))) {
                        return ((0x10 ^ 0x9) & ~(0x67 ^ 0x7E)) != 0x0;
                    }
                }
                else {
                    n = 1L;
                }
                this.wait(n);
                lllllllllllllIIIIIlllllllIIIIlIl = lllllllllllllIIIIIlllllllIIIIlII - System.nanoTime();
                "".length();
                if (((0x41 ^ 0x4B) & ~(0x13 ^ 0x19)) == -" ".length()) {
                    return ((0x50 ^ 0x5A) & ~(0x2E ^ 0x24)) != 0x0;
                }
            }
            return ForkJoinPool.lIllIIIIlIlIII[0] != 0;
        }
    }
    
    public ForkJoinPool() {
        this(Math.min(ForkJoinPool.lIllIIIIlIlIII[23], Runtime.getRuntime().availableProcessors()), ForkJoinPool.defaultForkJoinWorkerThreadFactory, null, (boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0));
    }
    
    private static void checkPermission() {
        final SecurityManager lllllllllllllIIIIlIIIIllllllllII = System.getSecurityManager();
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIllllllllII)) {
            lllllllllllllIIIIlIIIIllllllllII.checkPermission(ForkJoinPool.modifyThreadPermission);
        }
    }
    
    public int getRunningThreadCount() {
        int lllllllllllllIIIIlIIIIIIIIlllIlI = ForkJoinPool.lIllIIIIlIlIII[10];
        final WorkQueue[] lllllllllllllIIIIlIIIIIIIIlllIIl;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIIIlllIIl = this.workQueues)) {
            int lllllllllllllIIIIlIIIIIIIIllllII = ForkJoinPool.lIllIIIIlIlIII[0];
            while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIIIIllllII, lllllllllllllIIIIlIIIIIIIIlllIIl.length)) {
                final WorkQueue lllllllllllllIIIIlIIIIIIIIllllIl;
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIIIllllIl = lllllllllllllIIIIlIIIIIIIIlllIIl[lllllllllllllIIIIlIIIIIIIIllllII]) && llllIllIIlllIll(lllllllllllllIIIIlIIIIIIIIllllIl.isApparentlyUnblocked() ? 1 : 0)) {
                    ++lllllllllllllIIIIlIIIIIIIIlllIlI;
                }
                lllllllllllllIIIIlIIIIIIIIllllII += 2;
                "".length();
                if (null != null) {
                    return (0x8B ^ 0xB6) & ~(0x77 ^ 0x4A);
                }
            }
        }
        return lllllllllllllIIIIlIIIIIIIIlllIlI;
    }
    
    protected ForkJoinTask<?> pollSubmission() {
        final WorkQueue[] lllllllllllllIIIIIlllllllllIlIII;
        if (llllIllIIlllIIl(lllllllllllllIIIIIlllllllllIlIII = this.workQueues)) {
            int lllllllllllllIIIIIlllllllllIlIlI = ForkJoinPool.lIllIIIIlIlIII[10];
            while (llllIllIlIIIIII(lllllllllllllIIIIIlllllllllIlIlI, lllllllllllllIIIIIlllllllllIlIII.length)) {
                final WorkQueue lllllllllllllIIIIIlllllllllIlIll;
                final ForkJoinTask<?> lllllllllllllIIIIIlllllllllIllII;
                if (llllIllIIlllIIl(lllllllllllllIIIIIlllllllllIlIll = lllllllllllllIIIIIlllllllllIlIII[lllllllllllllIIIIIlllllllllIlIlI]) && llllIllIIlllIIl(lllllllllllllIIIIIlllllllllIllII = lllllllllllllIIIIIlllllllllIlIll.poll())) {
                    return lllllllllllllIIIIIlllllllllIllII;
                }
                lllllllllllllIIIIIlllllllllIlIlI += 2;
                "".length();
                if (null != null) {
                    return null;
                }
            }
        }
        return null;
    }
    
    private static boolean llllIllIIllllll(final int lllllllllllllIIIIIlllllIllIIIIll, final int lllllllllllllIIIIIlllllIllIIIIlI) {
        return lllllllllllllIIIIIlllllIllIIIIll >= lllllllllllllIIIIIlllllIllIIIIlI;
    }
    
    private static int llllIllIlIIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    final void helpJoinOnce(final WorkQueue lllllllllllllIIIIlIIIIIllIllllll, final ForkJoinTask<?> lllllllllllllIIIIlIIIIIllIlllllI) {
        int lllllllllllllIIIIlIIIIIlllIIIlII;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllIllllll) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIllIlllllI) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlllIIIlII = lllllllllllllIIIIlIIIIIllIlllllI.status)) {
            final ForkJoinTask<?> lllllllllllllIIIIlIIIIIlllIIIlIl = lllllllllllllIIIIlIIIIIllIllllll.currentJoin;
            lllllllllllllIIIIlIIIIIllIllllll.currentJoin = lllllllllllllIIIIlIIIIIllIlllllI;
            while (llllIllIIlllIll(lllllllllllllIIIIlIIIIIllIllllll.tryRemoveAndExec(lllllllllllllIIIIlIIIIIllIlllllI) ? 1 : 0) && !llllIllIIllllIl(lllllllllllllIIIIlIIIIIlllIIIlII = lllllllllllllIIIIlIIIIIllIlllllI.status)) {}
            if (llllIllIIllllII(lllllllllllllIIIIlIIIIIlllIIIlII)) {
                if (llllIllIIlllIll((lllllllllllllIIIIlIIIIIllIlllllI instanceof CountedCompleter) ? 1 : 0)) {
                    this.helpComplete(lllllllllllllIIIIlIIIIIllIllllll, (CountedCompleter)lllllllllllllIIIIlIIIIIllIlllllI);
                    "".length();
                }
                while (llllIllIIllllII(lllllllllllllIIIIlIIIIIllIlllllI.status) && !llllIllIlIIIllI(this.tryHelpStealer(lllllllllllllIIIIlIIIIIllIllllll, lllllllllllllIIIIlIIIIIllIlllllI))) {}
            }
            lllllllllllllIIIIlIIIIIllIllllll.currentJoin = lllllllllllllIIIIlIIIIIlllIIIlIl;
        }
    }
    
    private final int awaitWork(final WorkQueue lllllllllllllIIIIlIIIIlIlIIllIlI, final long lllllllllllllIIIIlIIIIlIlIIllIIl, final int lllllllllllllIIIIlIIIIlIlIIllIII) {
        int lllllllllllllIIIIlIIIIlIlIIlllII;
        if (llllIllIIllllII(lllllllllllllIIIIlIIIIlIlIIlllII = lllllllllllllIIIIlIIIIlIlIIllIlI.qlock) && llllIllIlIIIlll(lllllllllllllIIIIlIIIIlIlIIllIlI.eventCount, lllllllllllllIIIIlIIIIlIlIIllIII) && llllIllIIlllIlI(llllIllIlIIlIIl(this.ctl, lllllllllllllIIIIlIIIIlIlIIllIIl)) && llllIllIIlllIlI(Thread.interrupted() ? 1 : 0)) {
            final int lllllllllllllIIIIlIIIIlIlIlIIIll = (int)lllllllllllllIIIIlIIIIlIlIIllIIl;
            final int lllllllllllllIIIIlIIIIlIlIlIIIlI = (int)(lllllllllllllIIIIlIIIIlIlIIllIIl >>> ForkJoinPool.lIllIIIIlIlIII[3]);
            final int lllllllllllllIIIIlIIIIlIlIlIIIIl = (lllllllllllllIIIIlIIIIlIlIlIIIlI >> ForkJoinPool.lIllIIIIlIlIII[19]) + this.parallelism;
            if (!llllIllIIllllII(lllllllllllllIIIIlIIIIlIlIlIIIll) || (llllIllIlIIIllI(lllllllllllllIIIIlIIIIlIlIlIIIIl) && llllIllIIlllIll(this.tryTerminate((boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0), (boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0)) ? 1 : 0))) {
                final int qlock = ForkJoinPool.lIllIIIIlIlIII[13];
                lllllllllllllIIIIlIIIIlIlIIllIlI.qlock = qlock;
                lllllllllllllIIIIlIIIIlIlIIlllII = qlock;
                "".length();
                if (" ".length() < 0) {
                    return (0xC4 ^ 0xA0 ^ (0x8 ^ 0x3D)) & (0x9E ^ 0x88 ^ (0x65 ^ 0x22) ^ -" ".length());
                }
            }
            else {
                final int lllllllllllllIIIIlIIIIlIlIlIIllI;
                if (llllIllIIlllIll(lllllllllllllIIIIlIIIIlIlIlIIllI = lllllllllllllIIIIlIIIIlIlIIllIlI.nsteals)) {
                    lllllllllllllIIIIlIIIIlIlIIllIlI.nsteals = ForkJoinPool.lIllIIIIlIlIII[10];
                    long lllllllllllllIIIIlIIIIlIlIlIllII;
                    while (!llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.STEALCOUNT, lllllllllllllIIIIlIIIIlIlIlIllII = this.stealCount, lllllllllllllIIIIlIIIIlIlIlIllII + lllllllllllllIIIIlIIIIlIlIlIIllI) ? 1 : 0)) {}
                    "".length();
                    if (null != null) {
                        return (0x2F ^ 0x27 ^ (0x8D ^ 0xB8)) & (0x32 ^ 0x12 ^ (0x95 ^ 0x88) ^ -" ".length());
                    }
                }
                else {
                    long n;
                    if (!llllIllIlIIIllI(lllllllllllllIIIIlIIIIlIlIlIIIIl) || llllIllIlIIIlII(lllllllllllllIIIIlIIIIlIlIIllIII, lllllllllllllIIIIlIIIIlIlIlIIIll | Integer.MIN_VALUE)) {
                        n = 0L;
                        "".length();
                        if (null != null) {
                            return (" ".length() ^ (0x17 ^ 0xB)) & (33 + 92 - 14 + 75 ^ 150 + 140 - 272 + 149 ^ -" ".length());
                        }
                    }
                    else {
                        n = ((long)(lllllllllllllIIIIlIIIIlIlIIllIlI.nextWait & ForkJoinPool.lIllIIIIlIlIII[9]) | (long)(lllllllllllllIIIIlIIIIlIlIlIIIlI + ForkJoinPool.lIllIIIIlIlIII[6]) << ForkJoinPool.lIllIIIIlIlIII[3]);
                    }
                    final long lllllllllllllIIIIlIIIIlIlIlIIlll = n;
                    long lllllllllllllIIIIlIIIIlIlIlIIlIl;
                    long lllllllllllllIIIIlIIIIlIlIlIIlII;
                    if (llllIllIIlllIll(llllIllIlIIlIIl(lllllllllllllIIIIlIIIIlIlIlIIlll, 0L))) {
                        final int lllllllllllllIIIIlIIIIlIlIlIlIll = -(short)(lllllllllllllIIIIlIIIIlIlIIllIIl >>> ForkJoinPool.lIllIIIIlIlIII[3]);
                        long n2;
                        if (llllIllIIllllIl(lllllllllllllIIIIlIIIIlIlIlIlIll)) {
                            n2 = 200000000L;
                            "".length();
                            if (((0x4D ^ 0x23 ^ (0xE0 ^ 0x93)) & (0xDF ^ 0x8B ^ (0x3C ^ 0x75) ^ -" ".length()) & (((0xEC ^ 0xBC ^ (0x13 ^ 0x1E)) & (78 + 241 - 244 + 175 ^ 113 + 52 - 75 + 77 ^ -" ".length())) ^ -" ".length())) >= (0xF3 ^ 0xC4 ^ (0xA9 ^ 0x9A))) {
                                return (0x6E ^ 0x59 ^ (0xB0 ^ 0x8E)) & (0x1D ^ 0x47 ^ (0xDE ^ 0x8D) ^ -" ".length());
                            }
                        }
                        else {
                            n2 = (lllllllllllllIIIIlIIIIlIlIlIlIll + ForkJoinPool.lIllIIIIlIlIII[0]) * 2000000000L;
                        }
                        final long lllllllllllllIIIIlIIIIlIlIlIlIlI = n2;
                        final long lllllllllllllIIIIlIIIIlIlIlIlIIl = System.nanoTime() + lllllllllllllIIIIlIIIIlIlIlIlIlI - 2000000L;
                        "".length();
                        if ("   ".length() >= (53 + 95 - 145 + 153 ^ 54 + 14 - 15 + 99)) {
                            return (0x2 ^ 0xD ^ (0x9F ^ 0xAE)) & (0x17 ^ 0x28 ^ " ".length() ^ -" ".length());
                        }
                    }
                    else {
                        lllllllllllllIIIIlIIIIlIlIlIIlII = (lllllllllllllIIIIlIIIIlIlIlIIlIl = 0L);
                    }
                    if (llllIllIlIIIlll(lllllllllllllIIIIlIIIIlIlIIllIlI.eventCount, lllllllllllllIIIIlIIIIlIlIIllIII) && llllIllIIlllIlI(llllIllIlIIlIIl(this.ctl, lllllllllllllIIIIlIIIIlIlIIllIIl))) {
                        final Thread lllllllllllllIIIIlIIIIlIlIlIlIII = Thread.currentThread();
                        ForkJoinPool.U.putObject(lllllllllllllIIIIlIIIIlIlIlIlIII, ForkJoinPool.PARKBLOCKER, this);
                        lllllllllllllIIIIlIIIIlIlIIllIlI.parker = lllllllllllllIIIIlIIIIlIlIlIlIII;
                        if (llllIllIlIIIlll(lllllllllllllIIIIlIIIIlIlIIllIlI.eventCount, lllllllllllllIIIIlIIIIlIlIIllIII) && llllIllIIlllIlI(llllIllIlIIlIIl(this.ctl, lllllllllllllIIIIlIIIIlIlIIllIIl))) {
                            ForkJoinPool.U.park((boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0), lllllllllllllIIIIlIIIIlIlIlIIlIl);
                        }
                        lllllllllllllIIIIlIIIIlIlIIllIlI.parker = null;
                        ForkJoinPool.U.putObject(lllllllllllllIIIIlIIIIlIlIlIlIII, ForkJoinPool.PARKBLOCKER, null);
                        if (llllIllIIlllIll(llllIllIlIIlIIl(lllllllllllllIIIIlIIIIlIlIlIIlIl, 0L)) && llllIllIIlllIlI(llllIllIlIIlIIl(this.ctl, lllllllllllllIIIIlIIIIlIlIIllIIl)) && llllIllIlIIIllI(llllIllIlIIlIIl(lllllllllllllIIIIlIIIIlIlIlIIlII - System.nanoTime(), 0L)) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIlIlIIllIIl, lllllllllllllIIIIlIIIIlIlIlIIlll) ? 1 : 0)) {
                            final int qlock2 = ForkJoinPool.lIllIIIIlIlIII[13];
                            lllllllllllllIIIIlIIIIlIlIIllIlI.qlock = qlock2;
                            lllllllllllllIIIIlIIIIlIlIIlllII = qlock2;
                        }
                    }
                }
            }
        }
        return lllllllllllllIIIIlIIIIlIlIIlllII;
    }
    
    @Override
    public <T> List<Future<T>> invokeAll(final Collection<? extends Callable<T>> lllllllllllllIIIIlIIIIIIIllIIIIl) {
        final ArrayList<Future<T>> lllllllllllllIIIIlIIIIIIIllIIIII = new ArrayList<Future<T>>(lllllllllllllIIIIlIIIIIIIllIIIIl.size());
        boolean lllllllllllllIIIIlIIIIIIIlIlllll = ForkJoinPool.lIllIIIIlIlIII[10] != 0;
        try {
            final Iterator lllllllllllllIIIIlIIIIIIIllIlIIl = lllllllllllllIIIIlIIIIIIIllIIIIl.iterator();
            while (llllIllIIlllIll(lllllllllllllIIIIlIIIIIIIllIlIIl.hasNext() ? 1 : 0)) {
                final Callable<T> lllllllllllllIIIIlIIIIIIIllIlIlI = lllllllllllllIIIIlIIIIIIIllIlIIl.next();
                final ForkJoinTask<T> lllllllllllllIIIIlIIIIIIIllIlIll = new ForkJoinTask.AdaptedCallable<T>((Callable<? extends T>)lllllllllllllIIIIlIIIIIIIllIlIlI);
                lllllllllllllIIIIlIIIIIIIllIIIII.add(lllllllllllllIIIIlIIIIIIIllIlIll);
                "".length();
                this.externalPush(lllllllllllllIIIIlIIIIIIIllIlIll);
                "".length();
                if (((0x27 ^ 0x3F) & ~(0x8C ^ 0x94)) < 0) {
                    return null;
                }
            }
            int lllllllllllllIIIIlIIIIIIIllIlIII = ForkJoinPool.lIllIIIIlIlIII[10];
            final int lllllllllllllIIIIlIIIIIIIllIIlll = lllllllllllllIIIIlIIIIIIIllIIIII.size();
            while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIIIllIlIII, lllllllllllllIIIIlIIIIIIIllIIlll)) {
                ((ForkJoinTask)lllllllllllllIIIIlIIIIIIIllIIIII.get(lllllllllllllIIIIlIIIIIIIllIlIII)).quietlyJoin();
                ++lllllllllllllIIIIlIIIIIIIllIlIII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            lllllllllllllIIIIlIIIIIIIlIlllll = (ForkJoinPool.lIllIIIIlIlIII[0] != 0);
            final ArrayList<Future<T>> list = lllllllllllllIIIIlIIIIIIIllIIIII;
            if (llllIllIIlllIlI(lllllllllllllIIIIlIIIIIIIlIlllll ? 1 : 0)) {
                int lllllllllllllIIIIlIIIIIIIllIIllI = ForkJoinPool.lIllIIIIlIlIII[10];
                final int lllllllllllllIIIIlIIIIIIIllIIlIl = lllllllllllllIIIIlIIIIIIIllIIIII.size();
                while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIIIllIIllI, lllllllllllllIIIIlIIIIIIIllIIlIl)) {
                    lllllllllllllIIIIlIIIIIIIllIIIII.get(lllllllllllllIIIIlIIIIIIIllIIllI).cancel((boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0));
                    "".length();
                    ++lllllllllllllIIIIlIIIIIIIllIIllI;
                    "".length();
                    if ((0x7A ^ 0x7F) <= 0) {
                        return null;
                    }
                }
            }
            return list;
        }
        finally {
            if (llllIllIIlllIlI(lllllllllllllIIIIlIIIIIIIlIlllll ? 1 : 0)) {
                int lllllllllllllIIIIlIIIIIIIllIIlII = ForkJoinPool.lIllIIIIlIlIII[10];
                final int lllllllllllllIIIIlIIIIIIIllIIIll = lllllllllllllIIIIlIIIIIIIllIIIII.size();
                while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIIIllIIlII, lllllllllllllIIIIlIIIIIIIllIIIll)) {
                    lllllllllllllIIIIlIIIIIIIllIIIII.get(lllllllllllllIIIIlIIIIIIIllIIlII).cancel((boolean)(ForkJoinPool.lIllIIIIlIlIII[10] != 0));
                    "".length();
                    ++lllllllllllllIIIIlIIIIIIIllIIlII;
                    "".length();
                    if (((0x88 ^ 0xAF) & ~(0x26 ^ 0x1)) != 0x0) {
                        return null;
                    }
                }
            }
        }
    }
    
    private ForkJoinPool(final int lllllllllllllIIIIlIIIIIIlIllllIl, final ForkJoinWorkerThreadFactory lllllllllllllIIIIlIIIIIIlIllIlIl, final Thread.UncaughtExceptionHandler lllllllllllllIIIIlIIIIIIlIllIlII, final int lllllllllllllIIIIlIIIIIIlIlllIlI, final String lllllllllllllIIIIlIIIIIIlIllIIlI) {
        this.workerNamePrefix = lllllllllllllIIIIlIIIIIIlIllIIlI;
        this.factory = lllllllllllllIIIIlIIIIIIlIllIlIl;
        this.ueh = lllllllllllllIIIIlIIIIIIlIllIlII;
        this.mode = (short)lllllllllllllIIIIlIIIIIIlIlllIlI;
        this.parallelism = (short)lllllllllllllIIIIlIIIIIIlIllllIl;
        final long lllllllllllllIIIIlIIIIIIlIlllIII = -lllllllllllllIIIIlIIIIIIlIllllIl;
        this.ctl = ((lllllllllllllIIIIlIIIIIIlIlllIII << ForkJoinPool.lIllIIIIlIlIII[22] & 0xFFFF000000000000L) | (lllllllllllllIIIIlIIIIIIlIlllIII << ForkJoinPool.lIllIIIIlIlIII[3] & 0xFFFF00000000L));
    }
    
    private static ForkJoinWorkerThreadFactory checkFactory(final ForkJoinWorkerThreadFactory lllllllllllllIIIIlIIIIIIllIIIlll) {
        if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIIIllIIIlll)) {
            throw new NullPointerException();
        }
        return lllllllllllllIIIIlIIIIIIllIIIlll;
    }
    
    private static int llllIllIlIIlllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public int getQueuedSubmissionCount() {
        int lllllllllllllIIIIlIIIIIIIIIIIlII = ForkJoinPool.lIllIIIIlIlIII[10];
        final WorkQueue[] lllllllllllllIIIIlIIIIIIIIIIIIll;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIIIIIIIll = this.workQueues)) {
            int lllllllllllllIIIIlIIIIIIIIIIIllI = ForkJoinPool.lIllIIIIlIlIII[10];
            while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIIIIIIIllI, lllllllllllllIIIIlIIIIIIIIIIIIll.length)) {
                final WorkQueue lllllllllllllIIIIlIIIIIIIIIIIlll;
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIIIIIIlll = lllllllllllllIIIIlIIIIIIIIIIIIll[lllllllllllllIIIIlIIIIIIIIIIIllI])) {
                    lllllllllllllIIIIlIIIIIIIIIIIlII += lllllllllllllIIIIlIIIIIIIIIIIlll.queueSize();
                }
                lllllllllllllIIIIlIIIIIIIIIIIllI += 2;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (0x32 ^ 0x78 ^ (0xF7 ^ 0x80)) & (0x4E ^ 0x50 ^ (0x2E ^ 0xD) ^ -" ".length());
                }
            }
        }
        return lllllllllllllIIIIlIIIIIIIIIIIlII;
    }
    
    public boolean isTerminating() {
        final long lllllllllllllIIIIIlllllllIIlIlll = this.ctl;
        int n;
        if (llllIllIIlllIll(llllIllIlIlIIlI(lllllllllllllIIIIIlllllllIIlIlll & 0x80000000L, 0L)) && llllIllIlIIIIlI((short)(lllllllllllllIIIIIlllllllIIlIlll >>> ForkJoinPool.lIllIIIIlIlIII[3]) + this.parallelism)) {
            n = ForkJoinPool.lIllIIIIlIlIII[0];
            "".length();
            if (" ".length() < ((0x92 ^ 0xBF ^ (0xA ^ 0x2)) & (0xB ^ 0x5A ^ (0xE4 ^ 0x90) ^ -" ".length()))) {
                return ((0x29 ^ 0x59 ^ (0x1E ^ 0x52)) & (3 + 164 - 87 + 95 ^ 103 + 83 - 126 + 87 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ForkJoinPool.lIllIIIIlIlIII[10];
        }
        return n != 0;
    }
    
    final void externalPush(final ForkJoinTask<?> lllllllllllllIIIIlIIIIllIlIlIIII) {
        final Submitter lllllllllllllIIIIlIIIIllIlIlIlII = ForkJoinPool.submitters.get();
        final int lllllllllllllIIIIlIIIIllIlIlIIll = this.plock;
        final WorkQueue[] lllllllllllllIIIIlIIIIllIlIlIIlI = this.workQueues;
        final int lllllllllllllIIIIlIIIIllIlIllIII;
        final int lllllllllllllIIIIlIIIIllIlIllIIl;
        final WorkQueue lllllllllllllIIIIlIIIIllIlIllIlI;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIllIlIlIlII) && llllIllIlIIIIlI(lllllllllllllIIIIlIIIIllIlIlIIll) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIllIlIlIIlI) && llllIllIIllllII(lllllllllllllIIIIlIIIIllIlIllIII = lllllllllllllIIIIlIIIIllIlIlIIlI.length - ForkJoinPool.lIllIIIIlIlIII[0]) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIllIlIllIlI = lllllllllllllIIIIlIIIIllIlIlIIlI[lllllllllllllIIIIlIIIIllIlIllIII & (lllllllllllllIIIIlIIIIllIlIllIIl = lllllllllllllIIIIlIIIIllIlIlIlII.seed) & ForkJoinPool.lIllIIIIlIlIII[14]]) && llllIllIIlllIll(lllllllllllllIIIIlIIIIllIlIllIIl) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapInt(lllllllllllllIIIIlIIIIllIlIllIlI, ForkJoinPool.QLOCK, ForkJoinPool.lIllIIIIlIlIII[10], ForkJoinPool.lIllIIIIlIlIII[0]) ? 1 : 0)) {
            final ForkJoinTask<?>[] lllllllllllllIIIIlIIIIllIlIlIlll;
            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIllIlIlIlll = lllllllllllllIIIIlIIIIllIlIllIlI.array)) {
                final int lllllllllllllIIIIlIIIIllIlIllIll = lllllllllllllIIIIlIIIIllIlIlIlll.length - ForkJoinPool.lIllIIIIlIlIII[0];
                final int lllllllllllllIIIIlIIIIllIlIlllIl;
                final int lllllllllllllIIIIlIIIIllIlIlllII;
                if (llllIllIlIIIlIl(lllllllllllllIIIIlIIIIllIlIllIll, lllllllllllllIIIIlIIIIllIlIlllII = (lllllllllllllIIIIlIIIIllIlIlllIl = lllllllllllllIIIIlIIIIllIlIllIlI.top) - lllllllllllllIIIIlIIIIllIlIllIlI.base)) {
                    final int lllllllllllllIIIIlIIIIllIlIllllI = ((lllllllllllllIIIIlIIIIllIlIllIll & lllllllllllllIIIIlIIIIllIlIlllIl) << ForkJoinPool.ASHIFT) + ForkJoinPool.ABASE;
                    ForkJoinPool.U.putOrderedObject(lllllllllllllIIIIlIIIIllIlIlIlll, lllllllllllllIIIIlIIIIllIlIllllI, lllllllllllllIIIIlIIIIllIlIlIIII);
                    lllllllllllllIIIIlIIIIllIlIllIlI.top = lllllllllllllIIIIlIIIIllIlIlllIl + ForkJoinPool.lIllIIIIlIlIII[0];
                    lllllllllllllIIIIlIIIIllIlIllIlI.qlock = ForkJoinPool.lIllIIIIlIlIII[10];
                    if (llllIllIIlllllI(lllllllllllllIIIIlIIIIllIlIlllII, ForkJoinPool.lIllIIIIlIlIII[0])) {
                        this.signalWork(lllllllllllllIIIIlIIIIllIlIlIIlI, lllllllllllllIIIIlIIIIllIlIllIlI);
                    }
                    return;
                }
            }
            lllllllllllllIIIIlIIIIllIlIllIlI.qlock = ForkJoinPool.lIllIIIIlIlIII[10];
        }
        this.fullExternalPush(lllllllllllllIIIIlIIIIllIlIlIIII);
    }
    
    protected int drainTasksTo(final Collection<? super ForkJoinTask<?>> lllllllllllllIIIIIllllllllIlIIll) {
        int lllllllllllllIIIIIllllllllIlIllI = ForkJoinPool.lIllIIIIlIlIII[10];
        final WorkQueue[] lllllllllllllIIIIIllllllllIlIlIl;
        if (llllIllIIlllIIl(lllllllllllllIIIIIllllllllIlIlIl = this.workQueues)) {
            int lllllllllllllIIIIIllllllllIllIIl = ForkJoinPool.lIllIIIIlIlIII[10];
            while (llllIllIlIIIIII(lllllllllllllIIIIIllllllllIllIIl, lllllllllllllIIIIIllllllllIlIlIl.length)) {
                final WorkQueue lllllllllllllIIIIIllllllllIllIlI;
                if (llllIllIIlllIIl(lllllllllllllIIIIIllllllllIllIlI = lllllllllllllIIIIIllllllllIlIlIl[lllllllllllllIIIIIllllllllIllIIl])) {
                    ForkJoinTask<?> lllllllllllllIIIIIllllllllIllIll;
                    while (llllIllIIlllIIl(lllllllllllllIIIIIllllllllIllIll = lllllllllllllIIIIIllllllllIllIlI.poll())) {
                        lllllllllllllIIIIIllllllllIlIIll.add(lllllllllllllIIIIIllllllllIllIll);
                        "".length();
                        ++lllllllllllllIIIIIllllllllIlIllI;
                        "".length();
                        if (" ".length() == "  ".length()) {
                            return (81 + 163 - 139 + 108 ^ 37 + 43 - 41 + 98) & (0x9F ^ 0xC5 ^ (0x32 ^ 0x34) ^ -" ".length());
                        }
                    }
                }
                ++lllllllllllllIIIIIllllllllIllIIl;
                "".length();
                if ("   ".length() == 0) {
                    return (0xBE ^ 0xA1 ^ (0x16 ^ 0x41)) & (154 + 115 - 111 + 76 ^ 24 + 23 - 27 + 142 ^ -" ".length());
                }
            }
        }
        return lllllllllllllIIIIIllllllllIlIllI;
    }
    
    private static int llllIllIlIIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public int getActiveThreadCount() {
        final int lllllllllllllIIIIlIIIIIIIIllIIII = this.parallelism + (int)(this.ctl >> ForkJoinPool.lIllIIIIlIlIII[22]);
        int n;
        if (llllIllIlIIIllI(lllllllllllllIIIIlIIIIIIIIllIIII)) {
            n = ForkJoinPool.lIllIIIIlIlIII[10];
            "".length();
            if (null != null) {
                return (0x9A ^ 0xBC) & ~(0x20 ^ 0x6);
            }
        }
        else {
            n = lllllllllllllIIIIlIIIIIIIIllIIII;
        }
        return n;
    }
    
    public boolean isQuiescent() {
        int n;
        if (llllIllIlIIIllI(this.parallelism + (int)(this.ctl >> ForkJoinPool.lIllIIIIlIlIII[22]))) {
            n = ForkJoinPool.lIllIIIIlIlIII[0];
            "".length();
            if ((0xCB ^ 0xB5 ^ (0xFE ^ 0x84)) < " ".length()) {
                return ((0x75 ^ 0x18 ^ (0x47 ^ 0x7F)) & (0x41 ^ 0x33 ^ (0xA0 ^ 0x87) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ForkJoinPool.lIllIIIIlIlIII[10];
        }
        return n != 0;
    }
    
    @Override
    protected <T> RunnableFuture<T> newTaskFor(final Runnable lllllllllllllIIIIIllllllIIlllllI, final T lllllllllllllIIIIIllllllIIllllIl) {
        return new ForkJoinTask.AdaptedRunnable<T>(lllllllllllllIIIIIllllllIIlllllI, lllllllllllllIIIIIllllllIIllllIl);
    }
    
    public void execute(final ForkJoinTask<?> lllllllllllllIIIIlIIIIIIlIlIIlIl) {
        if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIIIlIlIIlIl)) {
            throw new NullPointerException();
        }
        this.externalPush(lllllllllllllIIIIlIIIIIIlIlIIlIl);
    }
    
    private static boolean llllIllIIllllIl(final int lllllllllllllIIIIIlllllIlIlIIIlI) {
        return lllllllllllllIIIIIlllllIlIlIIIlI < 0;
    }
    
    private static int llllIllIlIlIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llllIllIlIIIlll(final int lllllllllllllIIIIIlllllIllIIIlll, final int lllllllllllllIIIIIlllllIllIIIllI) {
        return lllllllllllllIIIIIlllllIllIIIlll == lllllllllllllIIIIIlllllIllIIIllI;
    }
    
    private static boolean llllIllIIlllllI(final int lllllllllllllIIIIIlllllIlIlllIll, final int lllllllllllllIIIIIlllllIlIlllIlI) {
        return lllllllllllllIIIIIlllllIlIlllIll <= lllllllllllllIIIIIlllllIlIlllIlI;
    }
    
    static WorkQueue commonSubmitterQueue() {
        final Submitter lllllllllllllIIIIlIIIIIlIIlIlIlI;
        final ForkJoinPool lllllllllllllIIIIlIIIIIlIIlIllIl;
        final WorkQueue[] lllllllllllllIIIIlIIIIIlIIlIllII;
        final int lllllllllllllIIIIlIIIIIlIIlIlIll;
        WorkQueue workQueue;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIIlIlIlI = ForkJoinPool.submitters.get()) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIIlIllIl = ForkJoinPool.common) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIIlIllII = lllllllllllllIIIIlIIIIIlIIlIllIl.workQueues) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlIIlIlIll = lllllllllllllIIIIlIIIIIlIIlIllII.length - ForkJoinPool.lIllIIIIlIlIII[0])) {
            workQueue = lllllllllllllIIIIlIIIIIlIIlIllII[lllllllllllllIIIIlIIIIIlIIlIlIll & lllllllllllllIIIIlIIIIIlIIlIlIlI.seed & ForkJoinPool.lIllIIIIlIlIII[14]];
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        else {
            workQueue = null;
        }
        return workQueue;
    }
    
    private boolean tryTerminate(final boolean lllllllllllllIIIIlIIIIIlIIllllll, final boolean lllllllllllllIIIIlIIIIIlIlIIIIlI) {
        if (llllIllIlIIIIIl(this, ForkJoinPool.common)) {
            return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
        }
        int lllllllllllllIIIIlIIIIIlIlIIIIIl;
        if (llllIllIIllllII(lllllllllllllIIIIlIIIIIlIlIIIIIl = this.plock)) {
            if (llllIllIIlllIlI(lllllllllllllIIIIlIIIIIlIlIIIIlI ? 1 : 0)) {
                return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
            }
            Label_0082: {
                if (llllIllIIlllIlI(lllllllllllllIIIIlIIIIIlIlIIIIIl & ForkJoinPool.lIllIIIIlIlIII[2])) {
                    final Unsafe u = ForkJoinPool.U;
                    final long plock = ForkJoinPool.PLOCK;
                    final int expected = lllllllllllllIIIIlIIIIIlIlIIIIIl;
                    lllllllllllllIIIIlIIIIIlIlIIIIIl += 2;
                    if (!llllIllIIlllIlI(u.compareAndSwapInt(this, plock, expected, lllllllllllllIIIIlIIIIIlIlIIIIIl) ? 1 : 0)) {
                        break Label_0082;
                    }
                }
                lllllllllllllIIIIlIIIIIlIlIIIIIl = this.acquirePlock();
            }
            final int lllllllllllllIIIIlIIIIIlIlIlIllI = (lllllllllllllIIIIlIIIIIlIlIIIIIl + ForkJoinPool.lIllIIIIlIlIII[2] & ForkJoinPool.lIllIIIIlIlIII[9]) | Integer.MIN_VALUE;
            if (llllIllIIlllIlI(ForkJoinPool.U.compareAndSwapInt(this, ForkJoinPool.PLOCK, lllllllllllllIIIIlIIIIIlIlIIIIIl, lllllllllllllIIIIlIIIIIlIlIlIllI) ? 1 : 0)) {
                this.releasePlock(lllllllllllllIIIIlIIIIIlIlIlIllI);
            }
        }
        long lllllllllllllIIIIlIIIIIlIlIIIlIl;
        while (!llllIllIIlllIll(llllIllIlIIlllI((lllllllllllllIIIIlIIIIIlIlIIIlIl = this.ctl) & 0x80000000L, 0L))) {
            if (llllIllIIlllIlI(lllllllllllllIIIIlIIIIIlIIllllll ? 1 : 0)) {
                if (llllIllIlIIIIlI((int)(lllllllllllllIIIIlIIIIIlIlIIIlIl >> ForkJoinPool.lIllIIIIlIlIII[22]) + this.parallelism)) {
                    return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
                }
                final WorkQueue[] lllllllllllllIIIIlIIIIIlIlIlIIll;
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIlIlIIll = this.workQueues)) {
                    int lllllllllllllIIIIlIIIIIlIlIlIlII = ForkJoinPool.lIllIIIIlIlIII[10];
                    while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIlIlIlIlII, lllllllllllllIIIIlIIIIIlIlIlIIll.length)) {
                        final WorkQueue lllllllllllllIIIIlIIIIIlIlIlIlIl;
                        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIlIlIlIl = lllllllllllllIIIIlIIIIIlIlIlIIll[lllllllllllllIIIIlIIIIIlIlIlIlII]) && (!llllIllIIlllIll(lllllllllllllIIIIlIIIIIlIlIlIlIl.isEmpty() ? 1 : 0) || (llllIllIIlllIll(lllllllllllllIIIIlIIIIIlIlIlIlII & ForkJoinPool.lIllIIIIlIlIII[0]) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlIlIlIlIl.eventCount)))) {
                            this.signalWork(lllllllllllllIIIIlIIIIIlIlIlIIll, lllllllllllllIIIIlIIIIIlIlIlIlIl);
                            return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
                        }
                        ++lllllllllllllIIIIlIIIIIlIlIlIlII;
                        "".length();
                        if ("  ".length() == (0x93 ^ 0x97)) {
                            return ((0x44 ^ 0x26) & ~(0x15 ^ 0x77)) != 0x0;
                        }
                    }
                }
            }
            if (llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIIlIlIIIlIl, lllllllllllllIIIIlIIIIIlIlIIIlIl | 0x80000000L) ? 1 : 0)) {
                int lllllllllllllIIIIlIIIIIlIlIIIllI = ForkJoinPool.lIllIIIIlIlIII[10];
                while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIlIlIIIllI, ForkJoinPool.lIllIIIIlIlIII[24])) {
                    final WorkQueue[] lllllllllllllIIIIlIIIIIlIlIIIlll;
                    if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIlIIIlll = this.workQueues)) {
                        final int lllllllllllllIIIIlIIIIIlIlIIlIll = lllllllllllllIIIIlIIIIIlIlIIIlll.length;
                        int lllllllllllllIIIIlIIIIIlIlIIllll = ForkJoinPool.lIllIIIIlIlIII[10];
                        while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIlIlIIllll, lllllllllllllIIIIlIIIIIlIlIIlIll)) {
                            final WorkQueue lllllllllllllIIIIlIIIIIlIlIlIIII;
                            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIlIlIIII = lllllllllllllIIIIlIIIIIlIlIIIlll[lllllllllllllIIIIlIIIIIlIlIIllll])) {
                                lllllllllllllIIIIlIIIIIlIlIlIIII.qlock = ForkJoinPool.lIllIIIIlIlIII[13];
                                if (llllIllIlIIIIlI(lllllllllllllIIIIlIIIIIlIlIIIllI)) {
                                    lllllllllllllIIIIlIIIIIlIlIlIIII.cancelAll();
                                    final Thread lllllllllllllIIIIlIIIIIlIlIlIIIl;
                                    if (llllIllIlIIIlIl(lllllllllllllIIIIlIIIIIlIlIIIllI, ForkJoinPool.lIllIIIIlIlIII[0]) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIlIlIIIl = lllllllllllllIIIIlIIIIIlIlIlIIII.owner)) {
                                        if (llllIllIIlllIlI(lllllllllllllIIIIlIIIIIlIlIlIIIl.isInterrupted() ? 1 : 0)) {
                                            try {
                                                lllllllllllllIIIIlIIIIIlIlIlIIIl.interrupt();
                                                "".length();
                                                if (((0x54 ^ 0x67) & ~(0x94 ^ 0xA7)) != 0x0) {
                                                    return ((0x60 ^ 0x3A) & ~(0x2A ^ 0x70)) != 0x0;
                                                }
                                            }
                                            catch (Throwable t) {}
                                        }
                                        ForkJoinPool.U.unpark(lllllllllllllIIIIlIIIIIlIlIlIIIl);
                                    }
                                }
                            }
                            ++lllllllllllllIIIIlIIIIIlIlIIllll;
                            "".length();
                            if (null != null) {
                                return ((0x20 ^ 0x65) & ~(0xEF ^ 0xAA)) != 0x0;
                            }
                        }
                        long lllllllllllllIIIIlIIIIIlIlIIlIII;
                        int lllllllllllllIIIIlIIIIIlIlIIlIIl;
                        int lllllllllllllIIIIlIIIIIlIlIIlIlI;
                        WorkQueue lllllllllllllIIIIlIIIIIlIlIIllII;
                        while (llllIllIIlllIll(lllllllllllllIIIIlIIIIIlIlIIlIIl = ((int)(lllllllllllllIIIIlIIIIIlIlIIlIII = this.ctl) & ForkJoinPool.lIllIIIIlIlIII[9])) && llllIllIlIIIIII(lllllllllllllIIIIlIIIIIlIlIIlIlI = (lllllllllllllIIIIlIIIIIlIlIIlIIl & ForkJoinPool.lIllIIIIlIlIII[5]), lllllllllllllIIIIlIIIIIlIlIIlIll) && llllIllIIllllII(lllllllllllllIIIIlIIIIIlIlIIlIlI) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIlIIllII = lllllllllllllIIIIlIIIIIlIlIIIlll[lllllllllllllIIIIlIIIIIlIlIIlIlI])) {
                            final long lllllllllllllIIIIlIIIIIlIlIIllIl = (long)(lllllllllllllIIIIlIIIIIlIlIIllII.nextWait & ForkJoinPool.lIllIIIIlIlIII[9]) | (lllllllllllllIIIIlIIIIIlIlIIlIII + 281474976710656L & 0xFFFF000000000000L) | (lllllllllllllIIIIlIIIIIlIlIIlIII & 0xFFFF80000000L);
                            if (llllIllIlIIIlll(lllllllllllllIIIIlIIIIIlIlIIllII.eventCount, lllllllllllllIIIIlIIIIIlIlIIlIIl | Integer.MIN_VALUE) && llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIIlIlIIlIII, lllllllllllllIIIIlIIIIIlIlIIllIl) ? 1 : 0)) {
                                lllllllllllllIIIIlIIIIIlIlIIllII.eventCount = (lllllllllllllIIIIlIIIIIlIlIIlIIl + ForkJoinPool.lIllIIIIlIlIII[6] & ForkJoinPool.lIllIIIIlIlIII[9]);
                                lllllllllllllIIIIlIIIIIlIlIIllII.qlock = ForkJoinPool.lIllIIIIlIlIII[13];
                                final Thread lllllllllllllIIIIlIIIIIlIlIIlllI;
                                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIlIlIIlllI = lllllllllllllIIIIlIIIIIlIlIIllII.parker)) {
                                    ForkJoinPool.U.unpark(lllllllllllllIIIIlIIIIIlIlIIlllI);
                                }
                            }
                            "".length();
                            if ((0x25 ^ 0x21) <= "   ".length()) {
                                return ((0xA9 ^ 0x87) & ~(0x59 ^ 0x77)) != 0x0;
                            }
                        }
                    }
                    ++lllllllllllllIIIIlIIIIIlIlIIIllI;
                    "".length();
                    if (-(0x5 ^ 0x0) >= 0) {
                        return ((0x3C ^ 0x23) & ~(0x80 ^ 0x9F)) != 0x0;
                    }
                }
                "".length();
                if ("   ".length() <= 0) {
                    return ((0xE2 ^ 0xC2) & ~(0xD ^ 0x2D)) != 0x0;
                }
                continue;
            }
        }
        if (llllIllIlIIIllI((short)(lllllllllllllIIIIlIIIIIlIlIIIlIl >>> ForkJoinPool.lIllIIIIlIlIII[3]) + this.parallelism)) {
            final byte lllllllllllllIIIIlIIIIIlIIlllIll = (byte)this;
            synchronized (this) {
                this.notifyAll();
                // monitorexit(this)
                "".length();
                if (null != null) {
                    return ((0x45 ^ 0x68) & ~(0xA0 ^ 0x8D)) != 0x0;
                }
            }
        }
        return ForkJoinPool.lIllIIIIlIlIII[0] != 0;
    }
    
    public static void managedBlock(final ManagedBlocker lllllllllllllIIIIIllllllIlIIlIIl) throws InterruptedException {
        final Thread lllllllllllllIIIIIllllllIlIIlIII = Thread.currentThread();
        if (llllIllIIlllIll((lllllllllllllIIIIIllllllIlIIlIII instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            final ForkJoinPool lllllllllllllIIIIIllllllIlIIlIlI = ((ForkJoinWorkerThread)lllllllllllllIIIIIllllllIlIIlIII).pool;
            while (llllIllIIlllIlI(lllllllllllllIIIIIllllllIlIIlIIl.isReleasable() ? 1 : 0)) {
                if (llllIllIIlllIll(lllllllllllllIIIIIllllllIlIIlIlI.tryCompensate(lllllllllllllIIIIIllllllIlIIlIlI.ctl) ? 1 : 0)) {
                    try {
                        while (llllIllIIlllIlI(lllllllllllllIIIIIllllllIlIIlIIl.isReleasable() ? 1 : 0) && !llllIllIIlllIll(lllllllllllllIIIIIllllllIlIIlIIl.block() ? 1 : 0)) {}
                        lllllllllllllIIIIIllllllIlIIlIlI.incrementActiveCount();
                        "".length();
                        if (" ".length() > "  ".length()) {
                            return;
                        }
                    }
                    finally {
                        lllllllllllllIIIIIllllllIlIIlIlI.incrementActiveCount();
                    }
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
            }
            "".length();
            if ("  ".length() < -" ".length()) {
                return;
            }
        }
        else {
            while (llllIllIIlllIlI(lllllllllllllIIIIIllllllIlIIlIIl.isReleasable() ? 1 : 0) && !llllIllIIlllIll(lllllllllllllIIIIIllllllIlIIlIIl.block() ? 1 : 0)) {}
        }
    }
    
    @Override
    public boolean isTerminated() {
        final long lllllllllllllIIIIIlllllllIIlllIl = this.ctl;
        int n;
        if (llllIllIIlllIll(llllIllIlIlIIIl(lllllllllllllIIIIIlllllllIIlllIl & 0x80000000L, 0L)) && llllIllIlIIIllI((short)(lllllllllllllIIIIIlllllllIIlllIl >>> ForkJoinPool.lIllIIIIlIlIII[3]) + this.parallelism)) {
            n = ForkJoinPool.lIllIIIIlIlIII[0];
            "".length();
            if ("  ".length() == 0) {
                return ((0x9D ^ 0x89 ^ (0x75 ^ 0x22)) & (0x54 ^ 0x53 ^ (0xE4 ^ 0xA0) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ForkJoinPool.lIllIIIIlIlIII[10];
        }
        return n != 0;
    }
    
    private static boolean llllIllIlIIIIll(final Object lllllllllllllIIIIIlllllIlIlIlIlI) {
        return lllllllllllllIIIIIlllllIlIlIlIlI == null;
    }
    
    private int tryHelpStealer(final WorkQueue lllllllllllllIIIIlIIIIlIIlIIlIII, final ForkJoinTask<?> lllllllllllllIIIIlIIIIlIIlIIIIlI) {
        int lllllllllllllIIIIlIIIIlIIlIIIllI = ForkJoinPool.lIllIIIIlIlIII[10];
        int lllllllllllllIIIIlIIIIlIIlIIIlIl = ForkJoinPool.lIllIIIIlIlIII[10];
        Label_1318: {
            if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIlIIIIlI) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIlIIlIII) && llllIllIIllllII(lllllllllllllIIIIlIIIIlIIlIIlIII.base - lllllllllllllIIIIlIIIIlIIlIIlIII.top)) {
            Label_0044:
                while (true) {
                    ForkJoinTask<?> lllllllllllllIIIIlIIIIlIIlIIlIlI = lllllllllllllIIIIlIIIIlIIlIIIIlI;
                    WorkQueue lllllllllllllIIIIlIIIIlIIlIIllII = lllllllllllllIIIIlIIIIlIIlIIlIII;
                    int lllllllllllllIIIIlIIIIlIIlIIlllI = 0;
                Label_0050:
                    while (!llllIllIIllllIl(lllllllllllllIIIIlIIIIlIIlIIlllI = lllllllllllllIIIIlIIIIlIIlIIIIlI.status)) {
                        final WorkQueue[] lllllllllllllIIIIlIIIIlIIlIlIIII;
                        if (!llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIlIlIIII = this.workQueues)) {
                            break Label_1318;
                        }
                        final int lllllllllllllIIIIlIIIIlIIlIIllll;
                        if (llllIllIlIIIllI(lllllllllllllIIIIlIIIIlIIlIIllll = lllllllllllllIIIIlIIIIlIIlIlIIII.length - ForkJoinPool.lIllIIIIlIlIII[0])) {
                            "".length();
                            if (" ".length() < -" ".length()) {
                                return (0x35 ^ 0x30) & ~(0x47 ^ 0x42);
                            }
                            break Label_1318;
                        }
                        else {
                            WorkQueue lllllllllllllIIIIlIIIIlIIlIIlIll = null;
                            Label_0463: {
                                int lllllllllllllIIIIlIIIIlIIlIIllIl;
                                if (!llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIlIIlIll = lllllllllllllIIIIlIIIIlIIlIlIIII[lllllllllllllIIIIlIIIIlIIlIIllIl = ((lllllllllllllIIIIlIIIIlIIlIIllII.hint | ForkJoinPool.lIllIIIIlIlIII[0]) & lllllllllllllIIIIlIIIIlIIlIIllll)]) || llllIllIlIIlIll(lllllllllllllIIIIlIIIIlIIlIIlIll.currentSteal, lllllllllllllIIIIlIIIIlIIlIIlIlI)) {
                                    final int lllllllllllllIIIIlIIIIlIIlIllIII = lllllllllllllIIIIlIIIIlIIlIIllIl;
                                    do {
                                        if (llllIllIlIIIlll((lllllllllllllIIIIlIIIIlIIlIIllIl = (lllllllllllllIIIIlIIIIlIIlIIllIl + ForkJoinPool.lIllIIIIlIlIII[2] & lllllllllllllIIIIlIIIIlIIlIIllll)) & ForkJoinPool.lIllIIIIlIlIII[20], ForkJoinPool.lIllIIIIlIlIII[0])) {
                                            if (!llllIllIIllllII(lllllllllllllIIIIlIIIIlIIlIIlIlI.status)) {
                                                continue Label_0044;
                                            }
                                            if (llllIllIlIIlIll(lllllllllllllIIIIlIIIIlIIlIIllII.currentJoin, lllllllllllllIIIIlIIIIlIIlIIlIlI)) {
                                                "".length();
                                                if ("  ".length() <= -" ".length()) {
                                                    return (0x76 ^ 0x10 ^ (0x2B ^ 0x55)) & (15 + 26 + 91 + 58 ^ 112 + 94 - 40 + 0 ^ -" ".length());
                                                }
                                                continue Label_0044;
                                            }
                                        }
                                        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIlIIlIll = lllllllllllllIIIIlIIIIlIIlIlIIII[lllllllllllllIIIIlIIIIlIIlIIllIl]) && llllIllIlIIIIIl(lllllllllllllIIIIlIIIIlIIlIIlIll.currentSteal, lllllllllllllIIIIlIIIIlIIlIIlIlI)) {
                                            lllllllllllllIIIIlIIIIlIIlIIllII.hint = lllllllllllllIIIIlIIIIlIIlIIllIl;
                                            "".length();
                                            if (((0x66 ^ 0x49) & ~(0x5C ^ 0x73)) != ((0x54 ^ 0x65) & ~(0x4E ^ 0x7F))) {
                                                return (0x41 ^ 0x64) & ~(0x9A ^ 0xBF);
                                            }
                                            break Label_0463;
                                        }
                                    } while (!llllIllIlIIIlll(lllllllllllllIIIIlIIIIlIIlIIllIl, lllllllllllllIIIIlIIIIlIIlIllIII));
                                    "".length();
                                    if ((0x72 ^ 0x76) < "   ".length()) {
                                        return (0x3E ^ 0x37) & ~(0x11 ^ 0x18);
                                    }
                                    break Label_1318;
                                }
                            }
                            while (!llllIllIIllllIl(lllllllllllllIIIIlIIIIlIIlIIlIlI.status)) {
                                final int lllllllllllllIIIIlIIIIlIIlIlIIIl;
                                final ForkJoinTask[] lllllllllllllIIIIlIIIIlIIlIlIIll;
                                if (llllIllIIllllIl((lllllllllllllIIIIlIIIIlIIlIlIIIl = lllllllllllllIIIIlIIIIlIIlIIlIll.base) - lllllllllllllIIIIlIIIIlIIlIIlIll.top) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIlIlIIll = lllllllllllllIIIIlIIIIlIIlIIlIll.array)) {
                                    final int lllllllllllllIIIIlIIIIlIIlIlIlIl = ((lllllllllllllIIIIlIIIIlIIlIlIIll.length - ForkJoinPool.lIllIIIIlIlIII[0] & lllllllllllllIIIIlIIIIlIIlIlIIIl) << ForkJoinPool.ASHIFT) + ForkJoinPool.ABASE;
                                    ForkJoinTask<?> lllllllllllllIIIIlIIIIlIIlIlIlII = (ForkJoinTask<?>)ForkJoinPool.U.getObjectVolatile(lllllllllllllIIIIlIIIIlIIlIlIIll, lllllllllllllIIIIlIIIIlIIlIlIlIl);
                                    if (!llllIllIIllllII(lllllllllllllIIIIlIIIIlIIlIIlIlI.status) || !llllIllIlIIIIIl(lllllllllllllIIIIlIIIIlIIlIIllII.currentJoin, lllllllllllllIIIIlIIIIlIIlIIlIlI)) {
                                        continue Label_0044;
                                    }
                                    if (llllIllIlIIlIll(lllllllllllllIIIIlIIIIlIIlIIlIll.currentSteal, lllllllllllllIIIIlIIIIlIIlIIlIlI)) {
                                        "".length();
                                        if ("   ".length() <= "  ".length()) {
                                            return (0x9A ^ 0xC4) & ~(0x7B ^ 0x25);
                                        }
                                        continue Label_0044;
                                    }
                                    else {
                                        lllllllllllllIIIIlIIIIlIIlIIIllI = ForkJoinPool.lIllIIIIlIlIII[0];
                                        if (llllIllIlIIIlll(lllllllllllllIIIIlIIIIlIIlIIlIll.base, lllllllllllllIIIIlIIIIlIIlIlIIIl)) {
                                            if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIlIIlIlIlII)) {
                                                "".length();
                                                if (((0x2 ^ 0xE) & ~(0x6E ^ 0x62)) != 0x0) {
                                                    return (0x4E ^ 0x63) & ~(0x11 ^ 0x3C);
                                                }
                                                break Label_1318;
                                            }
                                            else if (llllIllIIlllIll(ForkJoinPool.U.compareAndSwapObject(lllllllllllllIIIIlIIIIlIIlIlIIll, lllllllllllllIIIIlIIIIlIIlIlIlIl, lllllllllllllIIIIlIIIIlIIlIlIlII, null) ? 1 : 0)) {
                                                ForkJoinPool.U.putOrderedInt(lllllllllllllIIIIlIIIIlIIlIIlIll, ForkJoinPool.QBASE, lllllllllllllIIIIlIIIIlIIlIlIIIl + ForkJoinPool.lIllIIIIlIlIII[0]);
                                                final ForkJoinTask<?> lllllllllllllIIIIlIIIIlIIlIlIlll = lllllllllllllIIIIlIIIIlIIlIIlIII.currentSteal;
                                                final int lllllllllllllIIIIlIIIIlIIlIlIllI = lllllllllllllIIIIlIIIIlIIlIIlIII.top;
                                                do {
                                                    lllllllllllllIIIIlIIIIlIIlIIlIII.currentSteal = lllllllllllllIIIIlIIIIlIIlIlIlII;
                                                    lllllllllllllIIIIlIIIIlIIlIlIlII.doExec();
                                                    "".length();
                                                } while (llllIllIIllllII(lllllllllllllIIIIlIIIIlIIlIIIIlI.status) && llllIllIlIIIlII(lllllllllllllIIIIlIIIIlIIlIIlIII.top, lllllllllllllIIIIlIIIIlIIlIlIllI) && !llllIllIlIIIIll(lllllllllllllIIIIlIIIIlIIlIlIlII = lllllllllllllIIIIlIIIIlIIlIIlIII.pop()));
                                                lllllllllllllIIIIlIIIIlIIlIIlIII.currentSteal = lllllllllllllIIIIlIIIIlIIlIlIlll;
                                                "".length();
                                                if ("  ".length() < ((0x42 ^ 0x8) & ~(0x37 ^ 0x7D))) {
                                                    return (0x85 ^ 0x9F) & ~(0xB1 ^ 0xAB);
                                                }
                                                break Label_1318;
                                            }
                                        }
                                        "".length();
                                        if ("   ".length() == 0) {
                                            return (0x98 ^ 0x9E ^ (0x1D ^ 0x59)) & (128 + 50 - 19 + 54 ^ 12 + 71 - 18 + 86 ^ -" ".length());
                                        }
                                        "".length();
                                        if ("  ".length() > "  ".length()) {
                                            return (0x79 ^ 0x4A ^ (0x68 ^ 0x65)) & (113 + 141 - 184 + 106 ^ 47 + 99 - 64 + 60 ^ -" ".length());
                                        }
                                        continue;
                                    }
                                }
                                else {
                                    final ForkJoinTask<?> lllllllllllllIIIIlIIIIlIIlIlIIlI = lllllllllllllIIIIlIIIIlIIlIIlIll.currentJoin;
                                    if (!llllIllIIllllII(lllllllllllllIIIIlIIIIlIIlIIlIlI.status) || !llllIllIlIIIIIl(lllllllllllllIIIIlIIIIlIIlIIllII.currentJoin, lllllllllllllIIIIlIIIIlIIlIIlIlI)) {
                                        continue Label_0044;
                                    }
                                    if (llllIllIlIIlIll(lllllllllllllIIIIlIIIIlIIlIIlIll.currentSteal, lllllllllllllIIIIlIIIIlIIlIIlIlI)) {
                                        "".length();
                                        if (-" ".length() >= ((0x1E ^ 0x0) & ~(0x14 ^ 0xA))) {
                                            return (0x93 ^ 0x86) & ~(0xA6 ^ 0xB3);
                                        }
                                        continue Label_0044;
                                    }
                                    else {
                                        if (!llllIllIIlllIIl(lllllllllllllIIIIlIIIIlIIlIlIIlI)) {
                                            break Label_1318;
                                        }
                                        if (llllIllIlIIIlll(++lllllllllllllIIIIlIIIIlIIlIIIlIl, ForkJoinPool.lIllIIIIlIlIII[21])) {
                                            "".length();
                                            if (" ".length() >= "   ".length()) {
                                                return (0x52 ^ 0x58) & ~(0xCE ^ 0xC4);
                                            }
                                            break Label_1318;
                                        }
                                        else {
                                            lllllllllllllIIIIlIIIIlIIlIIlIlI = lllllllllllllIIIIlIIIIlIIlIlIIlI;
                                            lllllllllllllIIIIlIIIIlIIlIIllII = lllllllllllllIIIIlIIIIlIIlIIlIll;
                                            "".length();
                                            if (((0x24 ^ 0x13 ^ (0xFE ^ 0x8C)) & (0x14 ^ 0x24 ^ (0xE8 ^ 0x9D) ^ -" ".length())) != 0x0) {
                                                return (71 + 110 - 90 + 115 ^ 78 + 34 - 51 + 133) & (70 + 97 - 147 + 117 ^ 25 + 11 + 55 + 42 ^ -" ".length());
                                            }
                                            "".length();
                                            if ((0x14 ^ 0x28 ^ (0x42 ^ 0x7A)) < 0) {
                                                return (0x3B ^ 0x4B ^ (0x57 ^ 0x12)) & (73 + 68 - 16 + 29 ^ 76 + 75 - 110 + 134 ^ -" ".length());
                                            }
                                            continue Label_0050;
                                        }
                                    }
                                }
                            }
                            "".length();
                            if (-" ".length() >= "  ".length()) {
                                return (0x5E ^ 0xE) & ~(0x5E ^ 0xE);
                            }
                            continue Label_0044;
                        }
                    }
                    lllllllllllllIIIIlIIIIlIIlIIIllI = lllllllllllllIIIIlIIIIlIIlIIlllI;
                    "".length();
                    if ((0x4C ^ 0x48) != (0xB3 ^ 0xB7)) {
                        return (0xF8 ^ 0xAE) & ~(0xCB ^ 0x9D);
                    }
                    break;
                }
            }
        }
        return lllllllllllllIIIIlIIIIlIIlIIIllI;
    }
    
    private static String llllIllIIllIlIl(String lllllllllllllIIIIIlllllIllIlIIlI, final String lllllllllllllIIIIIlllllIllIlIllI) {
        lllllllllllllIIIIIlllllIllIlIIlI = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIlllllIllIlIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlllllIllIlIlIl = new StringBuilder();
        final char[] lllllllllllllIIIIIlllllIllIlIlII = lllllllllllllIIIIIlllllIllIlIllI.toCharArray();
        int lllllllllllllIIIIIlllllIllIlIIll = ForkJoinPool.lIllIIIIlIlIII[10];
        final short lllllllllllllIIIIIlllllIllIIllIl = (Object)((String)lllllllllllllIIIIIlllllIllIlIIlI).toCharArray();
        final boolean lllllllllllllIIIIIlllllIllIIllII = lllllllllllllIIIIIlllllIllIIllIl.length != 0;
        boolean lllllllllllllIIIIIlllllIllIIlIll = ForkJoinPool.lIllIIIIlIlIII[10] != 0;
        while (llllIllIlIIIIII(lllllllllllllIIIIIlllllIllIIlIll ? 1 : 0, lllllllllllllIIIIIlllllIllIIllII ? 1 : 0)) {
            final char lllllllllllllIIIIIlllllIllIllIII = lllllllllllllIIIIIlllllIllIIllIl[lllllllllllllIIIIIlllllIllIIlIll];
            lllllllllllllIIIIIlllllIllIlIlIl.append((char)(lllllllllllllIIIIIlllllIllIllIII ^ lllllllllllllIIIIIlllllIllIlIlII[lllllllllllllIIIIIlllllIllIlIIll % lllllllllllllIIIIIlllllIllIlIlII.length]));
            "".length();
            ++lllllllllllllIIIIIlllllIllIlIIll;
            ++lllllllllllllIIIIIlllllIllIIlIll;
            "".length();
            if ("  ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlllllIllIlIlIl);
    }
    
    public ForkJoinPool(final int lllllllllllllIIIIlIIIIIIllIlIlII, final ForkJoinWorkerThreadFactory lllllllllllllIIIIlIIIIIIllIlIIll, final Thread.UncaughtExceptionHandler lllllllllllllIIIIlIIIIIIllIlIIlI, final boolean lllllllllllllIIIIlIIIIIIllIlIIIl) {
        final int checkParallelism = checkParallelism(lllllllllllllIIIIlIIIIIIllIlIlII);
        final ForkJoinWorkerThreadFactory checkFactory = checkFactory(lllllllllllllIIIIlIIIIIIllIlIIll);
        int lllllllllllllIIIIlIIIIIIlIlllIlI;
        if (llllIllIIlllIll(lllllllllllllIIIIlIIIIIIllIlIIIl ? 1 : 0)) {
            lllllllllllllIIIIlIIIIIIlIlllIlI = ForkJoinPool.lIllIIIIlIlIII[0];
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            lllllllllllllIIIIlIIIIIIlIlllIlI = ForkJoinPool.lIllIIIIlIlIII[10];
        }
        this(checkParallelism, checkFactory, lllllllllllllIIIIlIIIIIIllIlIIlI, lllllllllllllIIIIlIIIIIIlIlllIlI, String.valueOf(new StringBuilder().append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[10]]).append(nextPoolId()).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[0]])));
        checkPermission();
    }
    
    @Override
    public <T> ForkJoinTask<T> submit(final Callable<T> lllllllllllllIIIIlIIIIIIlIIIllIl) {
        final ForkJoinTask<T> lllllllllllllIIIIlIIIIIIlIIIllll = new ForkJoinTask.AdaptedCallable<T>((Callable<? extends T>)lllllllllllllIIIIlIIIIIIlIIIllIl);
        this.externalPush(lllllllllllllIIIIlIIIIIIlIIIllll);
        return lllllllllllllIIIIlIIIIIIlIIIllll;
    }
    
    private static int llllIllIlIIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public <T> T invoke(final ForkJoinTask<T> lllllllllllllIIIIlIIIIIIlIlIlIll) {
        if (llllIllIlIIIIll(lllllllllllllIIIIlIIIIIIlIlIlIll)) {
            throw new NullPointerException();
        }
        this.externalPush(lllllllllllllIIIIlIIIIIIlIlIlIll);
        return lllllllllllllIIIIlIIIIIIlIlIlIll.join();
    }
    
    public boolean awaitQuiescence(final long lllllllllllllIIIIIllllllIllIIlII, final TimeUnit lllllllllllllIIIIIllllllIlIllIll) {
        final long lllllllllllllIIIIIllllllIllIIIlI = lllllllllllllIIIIIllllllIlIllIll.toNanos(lllllllllllllIIIIIllllllIllIIlII);
        final Thread lllllllllllllIIIIIllllllIllIIIIl = Thread.currentThread();
        final ForkJoinWorkerThread lllllllllllllIIIIIllllllIllIllII;
        if (llllIllIIlllIll((lllllllllllllIIIIIllllllIllIIIIl instanceof ForkJoinWorkerThread) ? 1 : 0) && llllIllIlIIIIIl((lllllllllllllIIIIIllllllIllIllII = (ForkJoinWorkerThread)lllllllllllllIIIIIllllllIllIIIIl).pool, this)) {
            this.helpQuiescePool(lllllllllllllIIIIIllllllIllIllII.workQueue);
            return ForkJoinPool.lIllIIIIlIlIII[0] != 0;
        }
        final long lllllllllllllIIIIIllllllIllIIIII = System.nanoTime();
        int lllllllllllllIIIIIllllllIlIlllll = ForkJoinPool.lIllIIIIlIlIII[10];
        boolean lllllllllllllIIIIIllllllIlIllllI = ForkJoinPool.lIllIIIIlIlIII[0] != 0;
        WorkQueue[] lllllllllllllIIIIIllllllIllIIlll;
        int lllllllllllllIIIIIllllllIllIIllI;
        while (llllIllIIlllIlI(this.isQuiescent() ? 1 : 0) && llllIllIIlllIIl(lllllllllllllIIIIIllllllIllIIlll = this.workQueues) && llllIllIIllllII(lllllllllllllIIIIIllllllIllIIllI = lllllllllllllIIIIIllllllIllIIlll.length - ForkJoinPool.lIllIIIIlIlIII[0])) {
            if (llllIllIIlllIlI(lllllllllllllIIIIIllllllIlIllllI ? 1 : 0)) {
                if (llllIllIlIIIIlI(llllIllIlIlIlII(System.nanoTime() - lllllllllllllIIIIIllllllIllIIIII, lllllllllllllIIIIIllllllIllIIIlI))) {
                    return ForkJoinPool.lIllIIIIlIlIII[10] != 0;
                }
                Thread.yield();
            }
            lllllllllllllIIIIIllllllIlIllllI = (ForkJoinPool.lIllIIIIlIlIII[10] != 0);
            int lllllllllllllIIIIIllllllIllIlIII = lllllllllllllIIIIIllllllIllIIllI + ForkJoinPool.lIllIIIIlIlIII[0] << ForkJoinPool.lIllIIIIlIlIII[2];
            while (llllIllIIllllII(lllllllllllllIIIIIllllllIllIlIII)) {
                final WorkQueue lllllllllllllIIIIIllllllIllIlIlI;
                final int lllllllllllllIIIIIllllllIllIlIIl;
                if (llllIllIIlllIIl(lllllllllllllIIIIIllllllIllIlIlI = lllllllllllllIIIIIllllllIllIIlll[lllllllllllllIIIIIllllllIlIlllll++ & lllllllllllllIIIIIllllllIllIIllI]) && llllIllIIllllIl((lllllllllllllIIIIIllllllIllIlIIl = lllllllllllllIIIIIllllllIllIlIlI.base) - lllllllllllllIIIIIllllllIllIlIlI.top)) {
                    lllllllllllllIIIIIllllllIlIllllI = (ForkJoinPool.lIllIIIIlIlIII[0] != 0);
                    final ForkJoinTask<?> lllllllllllllIIIIIllllllIllIlIll;
                    if (!llllIllIIlllIIl(lllllllllllllIIIIIllllllIllIlIll = lllllllllllllIIIIIllllllIllIlIlI.pollAt(lllllllllllllIIIIIllllllIllIlIIl))) {
                        break;
                    }
                    lllllllllllllIIIIIllllllIllIlIll.doExec();
                    "".length();
                    "".length();
                    if (" ".length() > (0x5F ^ 0x65 ^ (0x61 ^ 0x5F))) {
                        return ((116 + 0 - 110 + 124 ^ 72 + 102 - 99 + 84) & (0xB5 ^ 0xB8 ^ (0xAF ^ 0xBF) ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                else {
                    --lllllllllllllIIIIIllllllIllIlIII;
                    "".length();
                    if (((0xE9 ^ 0xAE ^ (0x5C ^ 0x79)) & (0xEB ^ 0xA5 ^ (0x4F ^ 0x63) ^ -" ".length())) > ((87 + 113 - 188 + 124 ^ 56 + 105 - 123 + 109) & (0x4A ^ 0x7F ^ (0xAA ^ 0x84) ^ -" ".length()))) {
                        return ((0xD9 ^ 0xA0 ^ (0x92 ^ 0xA9)) & (0xFA ^ 0xA2 ^ (0x1F ^ 0x5) ^ -" ".length())) != 0x0;
                    }
                    continue;
                }
            }
            "".length();
            if (((0x26 ^ 0x62) & ~(0xC5 ^ 0x81)) > 0) {
                return ((0x52 ^ 0x4D) & ~(0xDC ^ 0xC3)) != 0x0;
            }
        }
        return ForkJoinPool.lIllIIIIlIlIII[0] != 0;
    }
    
    private static void llllIllIIlllIII() {
        (lIllIIIIlIlIII = new int[45])[0] = " ".length();
        ForkJoinPool.lIllIIIIlIlIII[1] = (-(0xFFFFBDFB & 0x4A8C) & (0xFFFFB997 & 0x4FEF));
        ForkJoinPool.lIllIIIIlIlIII[2] = "  ".length();
        ForkJoinPool.lIllIIIIlIlIII[3] = (144 + 98 - 142 + 81 ^ 54 + 20 - 65 + 140);
        ForkJoinPool.lIllIIIIlIlIII[4] = (-(0xFFFFDD3B & 0x2BDD) & (0xFFFFEFFE & 0x9919));
        ForkJoinPool.lIllIIIIlIlIII[5] = (-" ".length() & (-1 & 0xFFFF));
        ForkJoinPool.lIllIIIIlIlIII[6] = (0xFFFFAB15 & 0x154EA);
        ForkJoinPool.lIllIIIIlIlIII[7] = -(-(0xFFFF9FEB & 0x7EFC) & (0xFFFFFEF7 & 0x11FEF));
        ForkJoinPool.lIllIIIIlIlIII[8] = (-(0xFFFF857F & 0x7BB9) & (0xFFFFC77F & 0x61C8BFFF));
        ForkJoinPool.lIllIIIIlIlIII[9] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        ForkJoinPool.lIllIIIIlIlIII[10] = ((0x54 ^ 0x2C ^ (0x14 ^ 0x4B)) & (0x76 ^ 0x4C ^ (0x57 ^ 0x4A) ^ -" ".length()));
        ForkJoinPool.lIllIIIIlIlIII[11] = (0x35 ^ 0x31);
        ForkJoinPool.lIllIIIIlIlIII[12] = (-"  ".length() & (-1 & 0xFFFF));
        ForkJoinPool.lIllIIIIlIlIII[13] = -" ".length();
        ForkJoinPool.lIllIIIIlIlIII[14] = (113 + 225 - 289 + 191 ^ 117 + 59 - 137 + 103);
        ForkJoinPool.lIllIIIIlIlIII[15] = (0xCC ^ 0xC1);
        ForkJoinPool.lIllIIIIlIlIII[16] = (0x52 ^ 0x5A ^ (0x1D ^ 0x4));
        ForkJoinPool.lIllIIIIlIlIII[17] = (0x41 ^ 0x39 ^ (0x1C ^ 0x61));
        ForkJoinPool.lIllIIIIlIlIII[18] = (0x3B ^ 0x67 ^ (0x14 ^ 0x40));
        ForkJoinPool.lIllIIIIlIlIII[19] = (0x5B ^ 0x65 ^ (0x5B ^ 0x75));
        ForkJoinPool.lIllIIIIlIlIII[20] = (56 + 95 - 38 + 21 ^ 112 + 87 - 112 + 50);
        ForkJoinPool.lIllIIIIlIlIII[21] = (0x76 ^ 0x36);
        ForkJoinPool.lIllIIIIlIlIII[22] = (0x4E ^ 0x7E);
        ForkJoinPool.lIllIIIIlIlIII[23] = (-" ".length() & (-1 & 0x7FFF));
        ForkJoinPool.lIllIIIIlIlIII[24] = "   ".length();
        ForkJoinPool.lIllIIIIlIlIII[25] = (0x43 ^ 0x45);
        ForkJoinPool.lIllIIIIlIlIII[26] = (0x1 ^ 0x6);
        ForkJoinPool.lIllIIIIlIlIII[27] = (0x74 ^ 0x67 ^ (0x44 ^ 0x5E));
        ForkJoinPool.lIllIIIIlIlIII[28] = (0x70 ^ 0x7A);
        ForkJoinPool.lIllIIIIlIlIII[29] = (117 + 105 - 170 + 80 ^ 100 + 110 - 82 + 15);
        ForkJoinPool.lIllIIIIlIlIII[30] = (0x7A ^ 0x22 ^ (0x5B ^ 0xF));
        ForkJoinPool.lIllIIIIlIlIII[31] = (100 + 34 - 122 + 194 ^ 108 + 35 - 43 + 92);
        ForkJoinPool.lIllIIIIlIlIII[32] = (0xA ^ 0x18);
        ForkJoinPool.lIllIIIIlIlIII[33] = (0xBF ^ 0xAC);
        ForkJoinPool.lIllIIIIlIlIII[34] = (0x87 ^ 0x96 ^ (0x4D ^ 0x43));
        ForkJoinPool.lIllIIIIlIlIII[35] = (0xB9 ^ 0xAD);
        ForkJoinPool.lIllIIIIlIlIII[36] = (0x76 ^ 0x63);
        ForkJoinPool.lIllIIIIlIlIII[37] = (0x10 ^ 0x6);
        ForkJoinPool.lIllIIIIlIlIII[38] = (0x8F ^ 0xA1 ^ (0xE ^ 0x37));
        ForkJoinPool.lIllIIIIlIlIII[39] = (0x48 ^ 0x67 ^ (0x32 ^ 0x5));
        ForkJoinPool.lIllIIIIlIlIII[40] = (0xBA ^ 0xA3);
        ForkJoinPool.lIllIIIIlIlIII[41] = (0x44 ^ 0x5E);
        ForkJoinPool.lIllIIIIlIlIII[42] = (0x6 ^ 0x14 ^ (0xA5 ^ 0xAC));
        ForkJoinPool.lIllIIIIlIlIII[43] = (0xB0 ^ 0xAC);
        ForkJoinPool.lIllIIIIlIlIII[44] = (0x65 ^ 0x4E ^ (0xAF ^ 0x99));
    }
    
    private void tryAddWorker() {
        long lllllllllllllIIIIlIIIIllllIIlIlI;
        int lllllllllllllIIIIlIIIIllllIIlIIl;
        int lllllllllllllIIIIlIIIIllllIIllII;
        while (llllIllIIllllIl(lllllllllllllIIIIlIIIIllllIIlIIl = (int)((lllllllllllllIIIIlIIIIllllIIlIlI = this.ctl) >>> ForkJoinPool.lIllIIIIlIlIII[3])) && llllIllIIlllIll(lllllllllllllIIIIlIIIIllllIIlIIl & ForkJoinPool.lIllIIIIlIlIII[4]) && llllIllIIllllII(lllllllllllllIIIIlIIIIllllIIllII = (int)lllllllllllllIIIIlIIIIllllIIlIlI)) {
            final long lllllllllllllIIIIlIIIIllllIIllIl = (long)((lllllllllllllIIIIlIIIIllllIIlIIl + ForkJoinPool.lIllIIIIlIlIII[0] & ForkJoinPool.lIllIIIIlIlIII[5]) | (lllllllllllllIIIIlIIIIllllIIlIIl + ForkJoinPool.lIllIIIIlIlIII[6] & ForkJoinPool.lIllIIIIlIlIII[7])) << ForkJoinPool.lIllIIIIlIlIII[3] | (long)lllllllllllllIIIIlIIIIllllIIllII;
            if (llllIllIIlllIll(ForkJoinPool.U.compareAndSwapLong(this, ForkJoinPool.CTL, lllllllllllllIIIIlIIIIllllIIlIlI, lllllllllllllIIIIlIIIIllllIIllIl) ? 1 : 0)) {
                Throwable lllllllllllllIIIIlIIIIllllIIllll = null;
                ForkJoinWorkerThread lllllllllllllIIIIlIIIIllllIIlllI = null;
                try {
                    final ForkJoinWorkerThreadFactory lllllllllllllIIIIlIIIIllllIlIIII;
                    if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIllllIlIIII = this.factory) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIllllIIlllI = lllllllllllllIIIIlIIIIllllIlIIII.newThread(this))) {
                        lllllllllllllIIIIlIIIIllllIIlllI.start();
                        "".length();
                        if (((0x51 ^ 0x79) & ~(0x3C ^ 0x14)) != 0x0) {
                            return;
                        }
                        break;
                    }
                    else {
                        "".length();
                        if ((0x64 ^ 0x43 ^ (0xE0 ^ 0xC3)) == 0x0) {
                            return;
                        }
                    }
                }
                catch (Throwable lllllllllllllIIIIlIIIIllllIlIIIl) {
                    lllllllllllllIIIIlIIIIllllIIllll = lllllllllllllIIIIlIIIIllllIlIIIl;
                }
                this.deregisterWorker(lllllllllllllIIIIlIIIIllllIIlllI, lllllllllllllIIIIlIIIIllllIIllll);
                "".length();
                if (((0x2C ^ 0x17 ^ (0x42 ^ 0x3B)) & (101 + 162 - 89 + 33 ^ 53 + 97 - 35 + 26 ^ -" ".length())) > " ".length()) {
                    return;
                }
                break;
            }
            else {
                "".length();
                if (" ".length() < " ".length()) {
                    return;
                }
                continue;
            }
        }
    }
    
    final int externalHelpComplete(final CountedCompleter<?> lllllllllllllIIIIlIIIIIIllllIIll) {
        final Submitter lllllllllllllIIIIlIIIIIIllllIIlI = ForkJoinPool.submitters.get();
        final WorkQueue[] lllllllllllllIIIIlIIIIIIllllIIIl = this.workQueues;
        int lllllllllllllIIIIlIIIIIIllllIIII = ForkJoinPool.lIllIIIIlIlIII[10];
        final int lllllllllllllIIIIlIIIIIIllllIllI;
        int lllllllllllllIIIIlIIIIIIllllIlIl;
        final WorkQueue lllllllllllllIIIIlIIIIIIllllIlll;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIllllIIlI) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIllllIIIl) && llllIllIIllllII(lllllllllllllIIIIlIIIIIIllllIllI = lllllllllllllIIIIlIIIIIIllllIIIl.length - ForkJoinPool.lIllIIIIlIlIII[0]) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIllllIlll = lllllllllllllIIIIlIIIIIIllllIIIl[(lllllllllllllIIIIlIIIIIIllllIlIl = lllllllllllllIIIIlIIIIIIllllIIlI.seed) & lllllllllllllIIIIlIIIIIIllllIllI & ForkJoinPool.lIllIIIIlIlIII[14]]) && llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIllllIIll)) {
            final int lllllllllllllIIIIlIIIIIIlllllIIl = lllllllllllllIIIIlIIIIIIllllIllI + lllllllllllllIIIIlIIIIIIllllIllI + ForkJoinPool.lIllIIIIlIlIII[0];
            long lllllllllllllIIIIlIIIIIIlllllIII = 0L;
            lllllllllllllIIIIlIIIIIIllllIlIl |= ForkJoinPool.lIllIIIIlIlIII[0];
            int lllllllllllllIIIIlIIIIIIlllllIlI = lllllllllllllIIIIlIIIIIIlllllIIl;
            while (!llllIllIIllllIl(lllllllllllllIIIIlIIIIIIllllIIII = lllllllllllllIIIIlIIIIIIllllIIll.status)) {
                if (llllIllIIlllIll(lllllllllllllIIIIlIIIIIIllllIlll.externalPopAndExecCC(lllllllllllllIIIIlIIIIIIllllIIll) ? 1 : 0)) {
                    lllllllllllllIIIIlIIIIIIlllllIlI = lllllllllllllIIIIlIIIIIIlllllIIl;
                    "".length();
                    if ((0x7D ^ 0x55 ^ (0x41 ^ 0x6C)) == 0x0) {
                        return (197 + 3 - 141 + 141 ^ 13 + 88 - 77 + 127) & (0x78 ^ 0x6D ^ (0x37 ^ 0x7D) ^ -" ".length());
                    }
                }
                else if (llllIllIIllllIl(lllllllllllllIIIIlIIIIIIllllIIII = lllllllllllllIIIIlIIIIIIllllIIll.status)) {
                    "".length();
                    if (null != null) {
                        return (0xAE ^ 0x80) & ~(0xEF ^ 0xC1);
                    }
                    return lllllllllllllIIIIlIIIIIIllllIIII;
                }
                else {
                    final WorkQueue lllllllllllllIIIIlIIIIIIlllllIll;
                    if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIlllllIll = lllllllllllllIIIIlIIIIIIllllIIIl[lllllllllllllIIIIlIIIIIIllllIlIl & lllllllllllllIIIIlIIIIIIllllIllI]) && llllIllIIlllIll(lllllllllllllIIIIlIIIIIIlllllIll.pollAndExecCC(lllllllllllllIIIIlIIIIIIllllIIll) ? 1 : 0)) {
                        lllllllllllllIIIIlIIIIIIlllllIlI = lllllllllllllIIIIlIIIIIIlllllIIl;
                        "".length();
                        if (null != null) {
                            return (0x3A ^ 0x1A ^ (0x83 ^ 0x8B)) & (0xB3 ^ 0x87 ^ (0xBD ^ 0xA1) ^ -" ".length());
                        }
                    }
                    else if (llllIllIIllllIl(--lllllllllllllIIIIlIIIIIIlllllIlI)) {
                        if (llllIllIIlllIlI(llllIllIlIIllll(lllllllllllllIIIIlIIIIIIlllllIII, lllllllllllllIIIIlIIIIIIlllllIII = this.ctl))) {
                            "".length();
                            if (null != null) {
                                return (29 + 107 - 50 + 120 ^ 114 + 42 - 121 + 94) & (0x9A ^ 0x82 ^ (0x62 ^ 0x35) ^ -" ".length());
                            }
                            return lllllllllllllIIIIlIIIIIIllllIIII;
                        }
                        else {
                            lllllllllllllIIIIlIIIIIIlllllIlI = lllllllllllllIIIIlIIIIIIlllllIIl;
                        }
                    }
                }
                lllllllllllllIIIIlIIIIIIllllIlIl += 2;
                "".length();
                if ("  ".length() <= 0) {
                    return (0x61 ^ 0x42 ^ (0x11 ^ 0x77)) & ("   ".length() ^ (0x23 ^ 0x65) ^ -" ".length());
                }
            }
            "".length();
            if ("   ".length() < 0) {
                return (0xBB ^ 0xA1 ^ (0x55 ^ 0x19)) & (87 + 118 - 199 + 139 ^ 48 + 135 - 135 + 151 ^ -" ".length());
            }
        }
        return lllllllllllllIIIIlIIIIIIllllIIII;
    }
    
    private static String llllIllIIllIlII(final String lllllllllllllIIIIIlllllIlllIIlll, final String lllllllllllllIIIIIlllllIlllIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlllllIlllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlllllIlllIIllI.getBytes(StandardCharsets.UTF_8)), ForkJoinPool.lIllIIIIlIlIII[18]), "DES");
            final Cipher lllllllllllllIIIIIlllllIlllIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIlllllIlllIlIIl.init(ForkJoinPool.lIllIIIIlIlIII[2], lllllllllllllIIIIIlllllIlllIlIlI);
            return new String(lllllllllllllIIIIIlllllIlllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlllllIlllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlllllIlllIlIII) {
            lllllllllllllIIIIIlllllIlllIlIII.printStackTrace();
            return null;
        }
    }
    
    private static String llllIllIIllIllI(final String lllllllllllllIIIIIlllllIllllIlII, final String lllllllllllllIIIIIlllllIllllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlllllIllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlllllIllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlllllIllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlllllIllllIllI.init(ForkJoinPool.lIllIIIIlIlIII[2], lllllllllllllIIIIIlllllIllllIlll);
            return new String(lllllllllllllIIIIIlllllIllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlllllIllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlllllIllllIlIl) {
            lllllllllllllIIIIIlllllIllllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static int checkParallelism(final int lllllllllllllIIIIlIIIIIIllIIlIlI) {
        if (!llllIllIlIIIIlI(lllllllllllllIIIIlIIIIIIllIIlIlI) || llllIllIlIIIlIl(lllllllllllllIIIIlIIIIIIllIIlIlI, ForkJoinPool.lIllIIIIlIlIII[23])) {
            throw new IllegalArgumentException();
        }
        return lllllllllllllIIIIlIIIIIIllIIlIlI;
    }
    
    public long getStealCount() {
        long lllllllllllllIIIIlIIIIIIIIlIIIlI = this.stealCount;
        final WorkQueue[] lllllllllllllIIIIlIIIIIIIIlIIIIl;
        if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIIIlIIIIl = this.workQueues)) {
            int lllllllllllllIIIIlIIIIIIIIlIIlII = ForkJoinPool.lIllIIIIlIlIII[0];
            while (llllIllIlIIIIII(lllllllllllllIIIIlIIIIIIIIlIIlII, lllllllllllllIIIIlIIIIIIIIlIIIIl.length)) {
                final WorkQueue lllllllllllllIIIIlIIIIIIIIlIIlIl;
                if (llllIllIIlllIIl(lllllllllllllIIIIlIIIIIIIIlIIlIl = lllllllllllllIIIIlIIIIIIIIlIIIIl[lllllllllllllIIIIlIIIIIIIIlIIlII])) {
                    lllllllllllllIIIIlIIIIIIIIlIIIlI += lllllllllllllIIIIlIIIIIIIIlIIlIl.nsteals;
                }
                lllllllllllllIIIIlIIIIIIIIlIIlII += 2;
                "".length();
                if (-"  ".length() > 0) {
                    return 0L;
                }
            }
        }
        return lllllllllllllIIIIlIIIIIIIIlIIIlI;
    }
    
    @Override
    public String toString() {
        long lllllllllllllIIIIIlllllllIllllII = 0L;
        long lllllllllllllIIIIIlllllllIlllIll = 0L;
        int lllllllllllllIIIIIlllllllIlllIlI = ForkJoinPool.lIllIIIIlIlIII[10];
        long lllllllllllllIIIIIlllllllIlllIIl = this.stealCount;
        final long lllllllllllllIIIIIlllllllIlllIII = this.ctl;
        final WorkQueue[] lllllllllllllIIIIIlllllllIllIlll;
        if (llllIllIIlllIIl(lllllllllllllIIIIIlllllllIllIlll = this.workQueues)) {
            int lllllllllllllIIIIIlllllllIllllll = ForkJoinPool.lIllIIIIlIlIII[10];
            while (llllIllIlIIIIII(lllllllllllllIIIIIlllllllIllllll, lllllllllllllIIIIIlllllllIllIlll.length)) {
                final WorkQueue lllllllllllllIIIIIllllllllIIIIII;
                if (llllIllIIlllIIl(lllllllllllllIIIIIllllllllIIIIII = lllllllllllllIIIIIlllllllIllIlll[lllllllllllllIIIIIlllllllIllllll])) {
                    final int lllllllllllllIIIIIllllllllIIIIIl = lllllllllllllIIIIIllllllllIIIIII.queueSize();
                    if (llllIllIIlllIlI(lllllllllllllIIIIIlllllllIllllll & ForkJoinPool.lIllIIIIlIlIII[0])) {
                        lllllllllllllIIIIIlllllllIlllIll += lllllllllllllIIIIIllllllllIIIIIl;
                        "".length();
                        if ("   ".length() < -" ".length()) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIIIIlllllllIllllII += lllllllllllllIIIIIllllllllIIIIIl;
                        lllllllllllllIIIIIlllllllIlllIIl += lllllllllllllIIIIIllllllllIIIIII.nsteals;
                        if (llllIllIIlllIll(lllllllllllllIIIIIllllllllIIIIII.isApparentlyUnblocked() ? 1 : 0)) {
                            ++lllllllllllllIIIIIlllllllIlllIlI;
                        }
                    }
                }
                ++lllllllllllllIIIIIlllllllIllllll;
                "".length();
                if ("   ".length() == (3 + 48 + 16 + 86 ^ 41 + 99 - 3 + 20)) {
                    return null;
                }
            }
        }
        final int lllllllllllllIIIIIlllllllIllIllI = this.parallelism;
        final int lllllllllllllIIIIIlllllllIllIlIl = lllllllllllllIIIIIlllllllIllIllI + (short)(lllllllllllllIIIIIlllllllIlllIII >>> ForkJoinPool.lIllIIIIlIlIII[3]);
        int lllllllllllllIIIIIlllllllIllIlII = lllllllllllllIIIIIlllllllIllIllI + (int)(lllllllllllllIIIIIlllllllIlllIII >> ForkJoinPool.lIllIIIIlIlIII[22]);
        if (llllIllIIllllIl(lllllllllllllIIIIIlllllllIllIlII)) {
            lllllllllllllIIIIIlllllllIllIlII = ForkJoinPool.lIllIIIIlIlIII[10];
        }
        String lllllllllllllIIIIIlllllllIllIIll = null;
        if (llllIllIIlllIll(llllIllIlIlIIII(lllllllllllllIIIIIlllllllIlllIII & 0x80000000L, 0L))) {
            String s;
            if (llllIllIIlllIlI(lllllllllllllIIIIIlllllllIllIlIl)) {
                s = ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[2]];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                s = ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[24]];
            }
            final String lllllllllllllIIIIIlllllllIlllllI = s;
            "".length();
            if (-(0x52 ^ 0x30 ^ (0xE ^ 0x68)) >= 0) {
                return null;
            }
        }
        else {
            String s2;
            if (llllIllIIllllIl(this.plock)) {
                s2 = ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[11]];
                "".length();
                if (" ".length() < ((0x53 ^ 0x76 ^ (0x3B ^ 0x4F)) & (0xA1 ^ 0x8A ^ (0x1A ^ 0x60) ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                s2 = ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[17]];
            }
            lllllllllllllIIIIIlllllllIllIIll = s2;
        }
        return String.valueOf(new StringBuilder().append(super.toString()).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[25]]).append(lllllllllllllIIIIIlllllllIllIIll).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[26]]).append(lllllllllllllIIIIIlllllllIllIllI).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[18]]).append(lllllllllllllIIIIIlllllllIllIlIl).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[27]]).append(lllllllllllllIIIIIlllllllIllIlII).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[28]]).append(lllllllllllllIIIIIlllllllIlllIlI).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[29]]).append(lllllllllllllIIIIIlllllllIlllIIl).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[30]]).append(lllllllllllllIIIIIlllllllIllllII).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[15]]).append(lllllllllllllIIIIIlllllllIlllIll).append(ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[31]]));
    }
    
    @Override
    public <T> ForkJoinTask<T> submit(final Runnable lllllllllllllIIIIlIIIIIIlIIIIIlI, final T lllllllllllllIIIIlIIIIIIlIIIIIIl) {
        final ForkJoinTask<T> lllllllllllllIIIIlIIIIIIlIIIIlII = new ForkJoinTask.AdaptedRunnable<T>(lllllllllllllIIIIlIIIIIIlIIIIIlI, lllllllllllllIIIIlIIIIIIlIIIIIIl);
        this.externalPush(lllllllllllllIIIIlIIIIIIlIIIIlII);
        return lllllllllllllIIIIlIIIIIIlIIIIlII;
    }
    
    private static int llllIllIlIlIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void llllIllIIllIlll() {
        (lIllIIIIlIIlll = new String[ForkJoinPool.lIllIIIIlIlIII[44]])[ForkJoinPool.lIllIIIIlIlIII[10]] = llllIllIIllIlII("s1idiSU1xnnIfaYagU3KgQ==", "HOikS");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[0]] = llllIllIIllIlII("8D+j85bohbI/NohE98NaFQ==", "HKCrq");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[2]] = llllIllIIllIlIl("MgM8ADMIBzoIPg==", "ffNmZ");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[24]] = llllIllIIllIllI("gAgbFz03hf4ehY1LPLCxvw==", "WSglZ");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[11]] = llllIllIIllIlIl("PCYZOQYGIAttFgA5Ag==", "oNlMr");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[17]] = llllIllIIllIlII("Ebyrr6HVszE=", "uvBjJ");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[25]] = llllIllIIllIllI("8s3NbBTPbEg=", "szyvG");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[26]] = llllIllIIllIlIl("dEMbNAQ5DwcwGjEQBnVLeA==", "XckUv");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[18]] = llllIllIIllIlII("2FyVnHJ3kvFGHST2O2EOvw==", "vsGYT");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[27]] = llllIllIIllIlIl("flU5FiE7Az1VaHI=", "RuXuU");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[28]] = llllIllIIllIllI("xELGF+FIEBX8CWy+D051Bg==", "VHtAm");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[29]] = llllIllIIllIllI("1+qrXyFlq4wEvsgaTlynjw==", "uPjcY");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[30]] = llllIllIIllIlII("ndZP8OrS5huYQrNDCWt8AQ==", "igrOV");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[15]] = llllIllIIllIllI("vZyQzUT6uTxpb48+hb5S20l66aOUnhTa", "Izhds");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[31]] = llllIllIIllIlII("4hyp2CBnIMQ=", "CARjY");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[20]] = llllIllIIllIlIl("OzAOLVokJREgWjI+Fi8BIyMdIgB/Fxc+Hxs+ESIkPj4UYhc+PBUjGn8hGT4VPT0dIB0iPA==", "QQxLt");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[19]] = llllIllIIllIllI("fCCq+EHhdLEKNigZl5F1co2Yiwehr5uSf+a5HyT91I4NGLcyC9tBxwQCTPIjbRzLCZPqUQWV6GA=", "lqICv");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[16]] = llllIllIIllIllI("eLeSMltXPVgkp/SzJ/04QK6mzhdGjbIP8vaCpvse+lZmU/3yokugbEuGvTx0I/U04G3JE7S03Z6qEuPQqQcULA==", "SdlrX");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[32]] = llllIllIIllIlIl("DQ4ZAhMkCAU5NiQNRQo2JgwEBwkkDgdELiQTAAwrZg==", "KakiY");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[33]] = llllIllIIllIlII("SZn/zv43/CxM1Xz0rRfU2BWUIABinb4vBj/LZHaxExI=", "QFUpt");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[35]] = llllIllIIllIlII("tboqI3CUCm0=", "OcaPw");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[36]] = llllIllIIllIlIl("PCwhJQ0MNzEqFQ==", "OXDDa");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[37]] = llllIllIIllIlII("pCv8vR5YBJ8=", "hnTGW");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[38]] = llllIllIIllIlIl("IyYBLwkZLQAu", "JHeJq");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[39]] = llllIllIIllIlIl("OCoFPSgkJBQ9Dzo=", "HKwVj");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[40]] = llllIllIIllIlIl("NjAQNg==", "TQcSI");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[41]] = llllIllIIllIlIl("IAQtGwE=", "QhBxj");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[42]] = llllIllIIllIlIl("ETMiIGgBKyYkaAYxNy0tVTw5NWgUciYuPxAgdi4uVSYhLg==", "uRVAH");
        ForkJoinPool.lIllIIIIlIIlll[ForkJoinPool.lIllIIIIlIlIII[43]] = llllIllIIllIlIl("PyowJhQrETw9FzMh", "RETOr");
    }
    
    public static int getCommonPoolParallelism() {
        return ForkJoinPool.commonParallelism;
    }
    
    static final class WorkQueue
    {
        /* synthetic */ int top;
        volatile /* synthetic */ int base;
        final /* synthetic */ ForkJoinWorkerThread owner;
        private static final /* synthetic */ String[] lIlIIlIlIIIlIl;
        /* synthetic */ int hint;
        volatile /* synthetic */ Thread parker;
        final /* synthetic */ ForkJoinPool pool;
        volatile /* synthetic */ int eventCount;
        private static final /* synthetic */ long QBASE;
        /* synthetic */ short poolIndex;
        private static final /* synthetic */ Unsafe U;
        /* synthetic */ int nextWait;
        volatile /* synthetic */ ForkJoinTask<?> currentJoin;
        private static final /* synthetic */ long QLOCK;
        /* synthetic */ int nsteals;
        private static final /* synthetic */ int[] lIlIIlIlIIlIll;
        /* synthetic */ ForkJoinTask<?> currentSteal;
        final /* synthetic */ short mode;
        volatile /* synthetic */ int qlock;
        private static final /* synthetic */ int ABASE;
        /* synthetic */ ForkJoinTask<?>[] array;
        private static final /* synthetic */ int ASHIFT;
        
        WorkQueue(final ForkJoinWorkerThread lllllllllllllIIIllIlllIIlIlIIIII, final int lllllllllllllIIIllIlllIIlIIlllll, final int lllllllllllllIIIllIlllIIlIIllllI) {
            this.owner = lllllllllllllIIIllIlllIIlIlIIIII;
            this.mode = (short)lllllllllllllIIIllIlllIIlIIlllll;
            this.hint = lllllllllllllIIIllIlllIIlIIllllI;
            final int n = WorkQueue.lIlIIlIlIIlIll[0];
            this.top = n;
            this.base = n;
        }
        
        final int queueSize() {
            final int lllllllllllllIIIllIlllIIlIIlIlIl = this.base - this.top;
            int n;
            if (lllIIllIIIIIIll(lllllllllllllIIIllIlllIIlIIlIlIl)) {
                n = WorkQueue.lIlIIlIlIIlIll[1];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (0x6D ^ 0x78) & ~(0x12 ^ 0x7);
                }
            }
            else {
                n = -lllllllllllllIIIllIlllIIlIIlIlIl;
            }
            return n;
        }
        
        final ForkJoinTask<?>[] growArray() {
            final ForkJoinTask<?>[] lllllllllllllIIIllIlllIIIlIllIll = this.array;
            int n;
            if (lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIlIllIll)) {
                n = lllllllllllllIIIllIlllIIIlIllIll.length << WorkQueue.lIlIIlIlIIlIll[3];
                "".length();
                if ("   ".length() <= " ".length()) {
                    return null;
                }
            }
            else {
                n = WorkQueue.lIlIIlIlIIlIll[5];
            }
            final int lllllllllllllIIIllIlllIIIlIllIlI = n;
            if (lllIIllIIIIlIlI(lllllllllllllIIIllIlllIIIlIllIlI, WorkQueue.lIlIIlIlIIlIll[6])) {
                throw new RejectedExecutionException(WorkQueue.lIlIIlIlIIIlIl[WorkQueue.lIlIIlIlIIlIll[1]]);
            }
            final ForkJoinTask<?>[] array = (ForkJoinTask<?>[])new ForkJoinTask[lllllllllllllIIIllIlllIIIlIllIlI];
            this.array = array;
            final ForkJoinTask<?>[] lllllllllllllIIIllIlllIIIlIllIIl = array;
            final int lllllllllllllIIIllIlllIIIlIlllll;
            if (lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIlIllIll) && lllIIllIIIIIIll(lllllllllllllIIIllIlllIIIlIlllll = lllllllllllllIIIllIlllIIIlIllIll.length - WorkQueue.lIlIIlIlIIlIll[3])) {
                final int lllllllllllllIIIllIlllIIIlIllllI = this.top;
                int lllllllllllllIIIllIlllIIIlIlllIl;
                if (lllIIllIIIIlIll(lllllllllllllIIIllIlllIIIlIllllI - (lllllllllllllIIIllIlllIIIlIlllIl = this.base))) {
                    final int lllllllllllllIIIllIlllIIIllIIIII = lllllllllllllIIIllIlllIIIlIllIlI - WorkQueue.lIlIIlIlIIlIll[3];
                    do {
                        final int lllllllllllllIIIllIlllIIIllIIIlI = ((lllllllllllllIIIllIlllIIIlIlllIl & lllllllllllllIIIllIlllIIIlIlllll) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                        final int lllllllllllllIIIllIlllIIIllIIIIl = ((lllllllllllllIIIllIlllIIIlIlllIl & lllllllllllllIIIllIlllIIIllIIIII) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                        final ForkJoinTask<?> lllllllllllllIIIllIlllIIIllIIIll = (ForkJoinTask<?>)WorkQueue.U.getObjectVolatile(lllllllllllllIIIllIlllIIIlIllIll, lllllllllllllIIIllIlllIIIllIIIlI);
                        if (lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIllIIIll) && lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIlllIIIlIllIll, lllllllllllllIIIllIlllIIIllIIIlI, lllllllllllllIIIllIlllIIIllIIIll, null) ? 1 : 0)) {
                            WorkQueue.U.putObjectVolatile(lllllllllllllIIIllIlllIIIlIllIIl, lllllllllllllIIIllIlllIIIllIIIIl, lllllllllllllIIIllIlllIIIllIIIll);
                        }
                    } while (!lllIIllIIIIIlIl(++lllllllllllllIIIllIlllIIIlIlllIl, lllllllllllllIIIllIlllIIIlIllllI));
                }
            }
            return lllllllllllllIIIllIlllIIIlIllIIl;
        }
        
        final void push(final ForkJoinTask<?> lllllllllllllIIIllIlllIIIlllIlII) {
            final int lllllllllllllIIIllIlllIIIlllIllI = this.top;
            final ForkJoinTask<?>[] lllllllllllllIIIllIlllIIIlllIlll;
            if (lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIlllIlll = this.array)) {
                final int lllllllllllllIIIllIlllIIIllllIll = lllllllllllllIIIllIlllIIIlllIlll.length - WorkQueue.lIlIIlIlIIlIll[3];
                WorkQueue.U.putOrderedObject(lllllllllllllIIIllIlllIIIlllIlll, ((lllllllllllllIIIllIlllIIIllllIll & lllllllllllllIIIllIlllIIIlllIllI) << WorkQueue.ASHIFT) + WorkQueue.ABASE, lllllllllllllIIIllIlllIIIlllIlII);
                final int top = lllllllllllllIIIllIlllIIIlllIllI + WorkQueue.lIlIIlIlIIlIll[3];
                this.top = top;
                final int lllllllllllllIIIllIlllIIIllllIlI;
                if (lllIIllIIIIlIII(lllllllllllllIIIllIlllIIIllllIlI = top - this.base, WorkQueue.lIlIIlIlIIlIll[4])) {
                    final ForkJoinPool lllllllllllllIIIllIlllIIIlllllII;
                    (lllllllllllllIIIllIlllIIIlllllII = this.pool).signalWork(lllllllllllllIIIllIlllIIIlllllII.workQueues, this);
                    "".length();
                    if ("  ".length() == "   ".length()) {
                        return;
                    }
                }
                else if (lllIIllIIIIlIIl(lllllllllllllIIIllIlllIIIllllIlI, lllllllllllllIIIllIlllIIIllllIll)) {
                    this.growArray();
                    "".length();
                }
            }
        }
        
        private static boolean lllIIllIIIIllll(final int lllllllllllllIIIllIllIllIIIllIII, final int lllllllllllllIIIllIllIllIIIlIlll) {
            return lllllllllllllIIIllIllIllIIIllIII != lllllllllllllIIIllIllIllIIIlIlll;
        }
        
        final ForkJoinTask<?> peek() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.array:[Lio/netty/util/internal/chmv8/ForkJoinTask;
            //     4: astore_1        /* lllllllllllllIIIllIlllIIIIIIlllI */
            //     5: aload_1         /* lllllllllllllIIIllIlllIIIIIlIIll */
            //     6: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.lllIIllIIIIIllI:(Ljava/lang/Object;)Z
            //     9: ifeq            28
            //    12: aload_1         /* lllllllllllllIIIllIlllIIIIIlIIll */
            //    13: arraylength    
            //    14: getstatic       io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.lIlIIlIlIIlIll:[I
            //    17: iconst_3       
            //    18: iaload         
            //    19: isub           
            //    20: dup            
            //    21: istore_2        /* lllllllllllllIIIllIlllIIIIIlIlIl */
            //    22: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.lllIIllIIIIIlII:(I)Z
            //    25: ifeq            30
            //    28: aconst_null    
            //    29: areturn        
            //    30: aload_0         /* lllllllllllllIIIllIlllIIIIIIllll */
            //    31: getfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.mode:S
            //    34: invokestatic    io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.lllIIllIIIIlllI:(I)Z
            //    37: ifeq            66
            //    40: aload_0         /* lllllllllllllIIIllIlllIIIIIIllll */
            //    41: getfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.top:I
            //    44: getstatic       io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.lIlIIlIlIIlIll:[I
            //    47: iconst_3       
            //    48: iaload         
            //    49: isub           
            //    50: ldc             ""
            //    52: invokevirtual   java/lang/String.length:()I
            //    55: pop            
            //    56: ldc             "   "
            //    58: invokevirtual   java/lang/String.length:()I
            //    61: ifge            70
            //    64: aconst_null    
            //    65: areturn        
            //    66: aload_0         /* lllllllllllllIIIllIlllIIIIIIllll */
            //    67: getfield        io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.base:I
            //    70: istore_3        /* lllllllllllllIIIllIlllIIIIIIllII */
            //    71: iload_3         /* lllllllllllllIIIllIlllIIIIIlIIIl */
            //    72: iload_2         /* lllllllllllllIIIllIlllIIIIIlIIlI */
            //    73: iand           
            //    74: getstatic       io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.ASHIFT:I
            //    77: ishl           
            //    78: getstatic       io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.ABASE:I
            //    81: iadd           
            //    82: istore          lllllllllllllIIIllIlllIIIIIlIIII
            //    84: getstatic       io/netty/util/internal/chmv8/ForkJoinPool$WorkQueue.U:Lsun/misc/Unsafe;
            //    87: aload_1         /* lllllllllllllIIIllIlllIIIIIlIIll */
            //    88: iload           lllllllllllllIIIllIlllIIIIIlIIII
            //    90: i2l            
            //    91: invokevirtual   sun/misc/Unsafe.getObjectVolatile:(Ljava/lang/Object;J)Ljava/lang/Object;
            //    94: checkcast       Lio/netty/util/internal/chmv8/ForkJoinTask;
            //    97: areturn        
            //    Signature:
            //  ()Lio/netty/util/internal/chmv8/ForkJoinTask<*>;
            //    StackMapTable: 00 04 FC 00 1C 07 00 CD FC 00 01 01 23 43 01
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        private static boolean lllIIllIIIIlIII(final int lllllllllllllIIIllIllIllIIllIllI, final int lllllllllllllIIIllIllIllIIllIlIl) {
            return lllllllllllllIIIllIllIllIIllIllI <= lllllllllllllIIIllIllIllIIllIlIl;
        }
        
        private static boolean lllIIllIIIIIlll(final Object lllllllllllllIIIllIllIllIIlIIlIl) {
            return lllllllllllllIIIllIllIllIIlIIlIl == null;
        }
        
        private static boolean lllIIllIIIIIllI(final Object lllllllllllllIIIllIllIllIIlIlIll) {
            return lllllllllllllIIIllIllIllIIlIlIll != null;
        }
        
        final void pollAndExecAll() {
            ForkJoinTask<?> lllllllllllllIIIllIllIllllllIllI;
            while (lllIIllIIIIIllI(lllllllllllllIIIllIllIllllllIllI = this.poll())) {
                lllllllllllllIIIllIllIllllllIllI.doExec();
                "".length();
                "".length();
                if ("  ".length() < " ".length()) {
                    return;
                }
            }
        }
        
        final boolean isApparentlyUnblocked() {
            final Thread lllllllllllllIIIllIllIllIllIlIlI;
            final Thread.State lllllllllllllIIIllIllIllIllIlIIl;
            int n;
            if (lllIIllIIIIIIll(this.eventCount) && lllIIllIIIIIllI(lllllllllllllIIIllIllIllIllIlIlI = this.owner) && lllIIllIIIlIIIl(lllllllllllllIIIllIllIllIllIlIIl = lllllllllllllIIIllIllIllIllIlIlI.getState(), Thread.State.BLOCKED) && lllIIllIIIlIIIl(lllllllllllllIIIllIllIllIllIlIIl, Thread.State.WAITING) && lllIIllIIIlIIIl(lllllllllllllIIIllIllIllIllIlIIl, Thread.State.TIMED_WAITING)) {
                n = WorkQueue.lIlIIlIlIIlIll[3];
                "".length();
                if (" ".length() < " ".length()) {
                    return ((0x4E ^ 0x42) & ~(0xBB ^ 0xB7)) != 0x0;
                }
            }
            else {
                n = WorkQueue.lIlIIlIlIIlIll[1];
            }
            return n != 0;
        }
        
        private static boolean lllIIllIIIIllIl(final int lllllllllllllIIIllIllIllIIlIIIll) {
            return lllllllllllllIIIllIllIllIIlIIIll != 0;
        }
        
        private static String lllIIlIllllllll(final String lllllllllllllIIIllIllIllIlIIIlII, final String lllllllllllllIIIllIllIllIlIIIlIl) {
            try {
                final SecretKeySpec lllllllllllllIIIllIllIllIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIllIlIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIllIllIllIlIIlIII = Cipher.getInstance("Blowfish");
                lllllllllllllIIIllIllIllIlIIlIII.init(WorkQueue.lIlIIlIlIIlIll[4], lllllllllllllIIIllIllIllIlIIlIIl);
                return new String(lllllllllllllIIIllIllIllIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIllIlIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIllIllIllIlIIIlll) {
                lllllllllllllIIIllIllIllIlIIIlll.printStackTrace();
                return null;
            }
        }
        
        final ForkJoinTask<?> nextLocalTask() {
            ForkJoinTask<?> forkJoinTask;
            if (lllIIllIIIIlllI(this.mode)) {
                forkJoinTask = this.pop();
                "".length();
                if (((0xF1 ^ 0x90) & ~(0x41 ^ 0x20)) > " ".length()) {
                    return null;
                }
            }
            else {
                forkJoinTask = this.poll();
            }
            return forkJoinTask;
        }
        
        final ForkJoinTask<?> pollAt(final int lllllllllllllIIIllIlllIIIIllIIII) {
            final ForkJoinTask<?>[] lllllllllllllIIIllIlllIIIIllIIlI;
            if (lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIIllIIlI = this.array)) {
                final int lllllllllllllIIIllIlllIIIIllIllI = ((lllllllllllllIIIllIlllIIIIllIIlI.length - WorkQueue.lIlIIlIlIIlIll[3] & lllllllllllllIIIllIlllIIIIllIIII) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                final ForkJoinTask<?> lllllllllllllIIIllIlllIIIIllIlIl;
                if (lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIIllIlIl = (ForkJoinTask<?>)WorkQueue.U.getObjectVolatile(lllllllllllllIIIllIlllIIIIllIIlI, lllllllllllllIIIllIlllIIIIllIllI)) && lllIIllIIIIIlIl(this.base, lllllllllllllIIIllIlllIIIIllIIII) && lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIlllIIIIllIIlI, lllllllllllllIIIllIlllIIIIllIllI, lllllllllllllIIIllIlllIIIIllIlIl, null) ? 1 : 0)) {
                    WorkQueue.U.putOrderedInt(this, WorkQueue.QBASE, lllllllllllllIIIllIlllIIIIllIIII + WorkQueue.lIlIIlIlIIlIll[3]);
                    return lllllllllllllIIIllIlllIIIIllIlIl;
                }
            }
            return null;
        }
        
        private static void lllIIllIIIIIIlI() {
            (lIlIIlIlIIlIll = new int[11])[0] = (0xFFFFBE05 & 0x51FA);
            WorkQueue.lIlIIlIlIIlIll[1] = ((0x41 ^ 0xE) & ~(0xFF ^ 0xB0));
            WorkQueue.lIlIIlIlIIlIll[2] = -" ".length();
            WorkQueue.lIlIIlIlIIlIll[3] = " ".length();
            WorkQueue.lIlIIlIlIIlIll[4] = "  ".length();
            WorkQueue.lIlIIlIlIIlIll[5] = (-(0xFFFFEF7F & 0x57AB) & (0xFFFFE7FB & 0x7F2E));
            WorkQueue.lIlIIlIlIIlIll[6] = (0xFFFFFBCE & 0x4000431);
            WorkQueue.lIlIIlIlIIlIll[7] = "   ".length();
            WorkQueue.lIlIIlIlIIlIll[8] = (0xCF ^ 0x88 ^ (0x57 ^ 0xF));
            WorkQueue.lIlIIlIlIIlIll[9] = (0x8F ^ 0x8B);
            WorkQueue.lIlIIlIlIIlIll[10] = (0x54 ^ 0x72 ^ (0x51 ^ 0x7F));
        }
        
        private static boolean lllIIllIIIlIIIl(final Object lllllllllllllIIIllIllIllIIlIlllI, final Object lllllllllllllIIIllIllIllIIlIllIl) {
            return lllllllllllllIIIllIllIllIIlIlllI != lllllllllllllIIIllIllIllIIlIllIl;
        }
        
        static {
            lllIIllIIIIIIlI();
            lllIIllIIIIIIII();
            MAXIMUM_QUEUE_CAPACITY = WorkQueue.lIlIIlIlIIlIll[6];
            INITIAL_QUEUE_CAPACITY = WorkQueue.lIlIIlIlIIlIll[5];
            try {
                U = getUnsafe();
                final Class<?> lllllllllllllIIIllIllIllIllIIIIl = WorkQueue.class;
                final Class<?> lllllllllllllIIIllIllIllIllIIIII = ForkJoinTask[].class;
                QBASE = WorkQueue.U.objectFieldOffset(lllllllllllllIIIllIllIllIllIIIIl.getDeclaredField(WorkQueue.lIlIIlIlIIIlIl[WorkQueue.lIlIIlIlIIlIll[3]]));
                QLOCK = WorkQueue.U.objectFieldOffset(lllllllllllllIIIllIllIllIllIIIIl.getDeclaredField(WorkQueue.lIlIIlIlIIIlIl[WorkQueue.lIlIIlIlIIlIll[4]]));
                ABASE = WorkQueue.U.arrayBaseOffset(lllllllllllllIIIllIllIllIllIIIII);
                final int lllllllllllllIIIllIllIllIlIlllll = WorkQueue.U.arrayIndexScale(lllllllllllllIIIllIllIllIllIIIII);
                if (lllIIllIIIIllIl(lllllllllllllIIIllIllIllIlIlllll & lllllllllllllIIIllIllIllIlIlllll - WorkQueue.lIlIIlIlIIlIll[3])) {
                    throw new Error(WorkQueue.lIlIIlIlIIIlIl[WorkQueue.lIlIIlIlIIlIll[7]]);
                }
                ASHIFT = WorkQueue.lIlIIlIlIIlIll[8] - Integer.numberOfLeadingZeros(lllllllllllllIIIllIllIllIlIlllll);
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Exception lllllllllllllIIIllIllIllIlIllllI) {
                throw new Error(lllllllllllllIIIllIllIllIlIllllI);
            }
        }
        
        final void cancelAll() {
            ForkJoinTask.cancelIgnoringExceptions(this.currentJoin);
            ForkJoinTask.cancelIgnoringExceptions(this.currentSteal);
            ForkJoinTask<?> lllllllllllllIIIllIllIllllllllII;
            while (lllIIllIIIIIllI(lllllllllllllIIIllIllIllllllllII = this.poll())) {
                ForkJoinTask.cancelIgnoringExceptions(lllllllllllllIIIllIllIllllllllII);
                "".length();
                if ("  ".length() >= (0x66 ^ 0x62)) {
                    return;
                }
            }
        }
        
        private static void lllIIllIIIIIIII() {
            (lIlIIlIlIIIlIl = new String[WorkQueue.lIlIIlIlIIlIll[9]])[WorkQueue.lIlIIlIlIIlIll[1]] = lllIIlIlllllllI("XjR5aPgkpmwhEu7ViN2katOFwCiszcSS", "wqgwl");
            WorkQueue.lIlIIlIlIIIlIl[WorkQueue.lIlIIlIlIIlIll[3]] = lllIIlIllllllll("pFzsRXv7RzM=", "giymr");
            WorkQueue.lIlIIlIlIIIlIl[WorkQueue.lIlIIlIlIIlIll[4]] = lllIIlIllllllll("orH2kfWIS6I=", "AuakE");
            WorkQueue.lIlIIlIlIIIlIl[WorkQueue.lIlIIlIlIIlIll[7]] = lllIIlIllllllll("qd7JI7CPlpKMRQRx8FSZrN58SStdF49cb72L3pxMNSLQVjUGjTakBg==", "mCGaN");
        }
        
        final ForkJoinTask<?> pop() {
            final ForkJoinTask<?>[] lllllllllllllIIIllIlllIIIlIIIIlI;
            final int lllllllllllllIIIllIlllIIIlIIIlII;
            if (lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIlIIIIlI = this.array) && lllIIllIIIIIIll(lllllllllllllIIIllIlllIIIlIIIlII = lllllllllllllIIIllIlllIIIlIIIIlI.length - WorkQueue.lIlIIlIlIIlIll[3])) {
                int lllllllllllllIIIllIlllIIIlIIIlIl;
                while (lllIIllIIIIIIll((lllllllllllllIIIllIlllIIIlIIIlIl = this.top - WorkQueue.lIlIIlIlIIlIll[3]) - this.base)) {
                    final long lllllllllllllIIIllIlllIIIlIIIlll = ((lllllllllllllIIIllIlllIIIlIIIlII & lllllllllllllIIIllIlllIIIlIIIlIl) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                    final ForkJoinTask<?> lllllllllllllIIIllIlllIIIlIIIllI;
                    if (lllIIllIIIIIlll(lllllllllllllIIIllIlllIIIlIIIllI = (ForkJoinTask<?>)WorkQueue.U.getObject(lllllllllllllIIIllIlllIIIlIIIIlI, lllllllllllllIIIllIlllIIIlIIIlll))) {
                        "".length();
                        if ("   ".length() < 0) {
                            return null;
                        }
                        break;
                    }
                    else {
                        if (lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIlllIIIlIIIIlI, lllllllllllllIIIllIlllIIIlIIIlll, lllllllllllllIIIllIlllIIIlIIIllI, null) ? 1 : 0)) {
                            this.top = lllllllllllllIIIllIlllIIIlIIIlIl;
                            return lllllllllllllIIIllIlllIIIlIIIllI;
                        }
                        "".length();
                        if ("   ".length() == 0) {
                            return null;
                        }
                        continue;
                    }
                }
            }
            return null;
        }
        
        private static boolean lllIIllIIIIlIIl(final int lllllllllllllIIIllIllIllIIlllIlI, final int lllllllllllllIIIllIllIllIIlllIIl) {
            return lllllllllllllIIIllIllIllIIlllIlI >= lllllllllllllIIIllIllIllIIlllIIl;
        }
        
        private static boolean lllIIllIIIIlIlI(final int lllllllllllllIIIllIllIllIIllIIlI, final int lllllllllllllIIIllIllIllIIllIIIl) {
            return lllllllllllllIIIllIllIllIIllIIlI > lllllllllllllIIIllIllIllIIllIIIl;
        }
        
        final boolean internalPopAndExecCC(final CountedCompleter<?> lllllllllllllIIIllIllIllIlllIlll) {
            final int lllllllllllllIIIllIllIllIlllIllI;
            final ForkJoinTask<?>[] lllllllllllllIIIllIllIllIllllIlI;
            if (lllIIllIIIIIlII(this.base - (lllllllllllllIIIllIllIllIlllIllI = this.top)) && lllIIllIIIIIllI(lllllllllllllIIIllIllIllIllllIlI = this.array)) {
                final long lllllllllllllIIIllIllIllIllllIll = ((lllllllllllllIIIllIllIllIllllIlI.length - WorkQueue.lIlIIlIlIIlIll[3] & lllllllllllllIIIllIllIllIlllIllI - WorkQueue.lIlIIlIlIIlIll[3]) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                final Object lllllllllllllIIIllIllIllIllllIIl;
                if (lllIIllIIIIllIl(((lllllllllllllIIIllIllIllIllllIIl = WorkQueue.U.getObject(lllllllllllllIIIllIllIllIllllIlI, lllllllllllllIIIllIllIllIllllIll)) instanceof CountedCompleter) ? 1 : 0)) {
                    CountedCompleter<?> lllllllllllllIIIllIllIllIlllllII;
                    final CountedCompleter<?> lllllllllllllIIIllIllIllIlllllIl = lllllllllllllIIIllIllIllIlllllII = (CountedCompleter<?>)lllllllllllllIIIllIllIllIllllIIl;
                    while (!lllIIllIIIlIIII(lllllllllllllIIIllIllIllIlllllII, lllllllllllllIIIllIllIllIlllIlll)) {
                        if (lllIIllIIIIIlll(lllllllllllllIIIllIllIllIlllllII = lllllllllllllIIIllIllIllIlllllII.completer)) {
                            "".length();
                            if (((0x2E ^ 0x3A) & ~(0x5D ^ 0x49)) < 0) {
                                return ((0x31 ^ 0x62) & ~(0x2F ^ 0x7C)) != 0x0;
                            }
                            return WorkQueue.lIlIIlIlIIlIll[1] != 0;
                        }
                    }
                    if (lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIllIllIllllIlI, lllllllllllllIIIllIllIllIllllIll, lllllllllllllIIIllIllIllIlllllIl, null) ? 1 : 0)) {
                        this.top = lllllllllllllIIIllIllIllIlllIllI - WorkQueue.lIlIIlIlIIlIll[3];
                        lllllllllllllIIIllIllIllIlllllIl.doExec();
                        "".length();
                    }
                    return WorkQueue.lIlIIlIlIIlIll[3] != 0;
                }
            }
            return WorkQueue.lIlIIlIlIIlIll[1] != 0;
        }
        
        private static boolean lllIIllIIIIIlIl(final int lllllllllllllIIIllIllIllIIlllllI, final int lllllllllllllIIIllIllIllIIllllIl) {
            return lllllllllllllIIIllIllIllIIlllllI == lllllllllllllIIIllIllIllIIllllIl;
        }
        
        final boolean isEmpty() {
            final int lllllllllllllIIIllIlllIIlIIIlIlI;
            final int lllllllllllllIIIllIlllIIlIIIlIIl = this.base - (lllllllllllllIIIllIlllIIlIIIlIlI = this.top);
            final ForkJoinTask<?>[] lllllllllllllIIIllIlllIIlIIIllIl;
            final int lllllllllllllIIIllIlllIIlIIIllII;
            int n;
            if (!lllIIllIIIIIlII(lllllllllllllIIIllIlllIIlIIIlIIl) || (lllIIllIIIIIlIl(lllllllllllllIIIllIlllIIlIIIlIIl, WorkQueue.lIlIIlIlIIlIll[2]) && (!lllIIllIIIIIllI(lllllllllllllIIIllIlllIIlIIIllIl = this.array) || !lllIIllIIIIIIll(lllllllllllllIIIllIlllIIlIIIllII = lllllllllllllIIIllIlllIIlIIIllIl.length - WorkQueue.lIlIIlIlIIlIll[3]) || lllIIllIIIIIlll(WorkQueue.U.getObject(lllllllllllllIIIllIlllIIlIIIllIl, ((lllllllllllllIIIllIlllIIlIIIllII & lllllllllllllIIIllIlllIIlIIIlIlI - WorkQueue.lIlIIlIlIIlIll[3]) << WorkQueue.ASHIFT) + (long)WorkQueue.ABASE))))) {
                n = WorkQueue.lIlIIlIlIIlIll[3];
                "".length();
                if (((0xB7 ^ 0x8A) & ~(0x1B ^ 0x26)) != 0x0) {
                    return ((0x58 ^ 0x17) & ~(0x4A ^ 0x5)) != 0x0;
                }
            }
            else {
                n = WorkQueue.lIlIIlIlIIlIll[1];
            }
            return n != 0;
        }
        
        final void runTask(final ForkJoinTask<?> lllllllllllllIIIllIllIlllllIIIIl) {
            this.currentSteal = lllllllllllllIIIllIllIlllllIIIIl;
            if (lllIIllIIIIIllI(lllllllllllllIIIllIllIlllllIIIIl)) {
                lllllllllllllIIIllIllIlllllIIIIl.doExec();
                "".length();
                final ForkJoinTask<?>[] lllllllllllllIIIllIllIlllllIIllI = this.array;
                final int lllllllllllllIIIllIllIlllllIIlIl = this.mode;
                this.nsteals += WorkQueue.lIlIIlIlIIlIll[3];
                this.currentSteal = null;
                if (lllIIllIIIIllIl(lllllllllllllIIIllIllIlllllIIlIl)) {
                    this.pollAndExecAll();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lllIIllIIIIIllI(lllllllllllllIIIllIllIlllllIIllI)) {
                    final int lllllllllllllIIIllIllIlllllIIlll = lllllllllllllIIIllIllIlllllIIllI.length - WorkQueue.lIlIIlIlIIlIll[3];
                    int lllllllllllllIIIllIllIlllllIlIII;
                    while (lllIIllIIIIIIll((lllllllllllllIIIllIllIlllllIlIII = this.top - WorkQueue.lIlIIlIlIIlIll[3]) - this.base)) {
                        final long lllllllllllllIIIllIllIlllllIlIlI = ((lllllllllllllIIIllIllIlllllIIlll & lllllllllllllIIIllIllIlllllIlIII) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                        final ForkJoinTask<?> lllllllllllllIIIllIllIlllllIlIIl = (ForkJoinTask<?>)WorkQueue.U.getObject(lllllllllllllIIIllIllIlllllIIllI, lllllllllllllIIIllIllIlllllIlIlI);
                        if (lllIIllIIIIIlll(lllllllllllllIIIllIllIlllllIlIIl)) {
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        else {
                            if (lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIllIlllllIIllI, lllllllllllllIIIllIllIlllllIlIlI, lllllllllllllIIIllIllIlllllIlIIl, null) ? 1 : 0)) {
                                this.top = lllllllllllllIIIllIllIlllllIlIII;
                                lllllllllllllIIIllIllIlllllIlIIl.doExec();
                                "".length();
                            }
                            "".length();
                            if ((94 + 129 - 78 + 12 ^ 141 + 32 - 110 + 90) == 0x0) {
                                return;
                            }
                            continue;
                        }
                    }
                }
            }
        }
        
        final boolean tryUnpush(final ForkJoinTask<?> lllllllllllllIIIllIlllIIIIIIIlII) {
            final ForkJoinTask<?>[] lllllllllllllIIIllIlllIIIIIIIIll;
            int lllllllllllllIIIllIlllIIIIIIIllI;
            if (lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIIIIIIll = this.array) && lllIIllIIIIllll(lllllllllllllIIIllIlllIIIIIIIllI = this.top, this.base) && lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIlllIIIIIIIIll, ((lllllllllllllIIIllIlllIIIIIIIIll.length - WorkQueue.lIlIIlIlIIlIll[3] & --lllllllllllllIIIllIlllIIIIIIIllI) << WorkQueue.ASHIFT) + WorkQueue.ABASE, lllllllllllllIIIllIlllIIIIIIIlII, null) ? 1 : 0)) {
                this.top = lllllllllllllIIIllIlllIIIIIIIllI;
                return WorkQueue.lIlIIlIlIIlIll[3] != 0;
            }
            return WorkQueue.lIlIIlIlIIlIll[1] != 0;
        }
        
        private static String lllIIlIlllllllI(final String lllllllllllllIIIllIllIllIlIlIIIl, final String lllllllllllllIIIllIllIllIlIlIIII) {
            try {
                final SecretKeySpec lllllllllllllIIIllIllIllIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIllIlIlIIII.getBytes(StandardCharsets.UTF_8)), WorkQueue.lIlIIlIlIIlIll[10]), "DES");
                final Cipher lllllllllllllIIIllIllIllIlIlIlIl = Cipher.getInstance("DES");
                lllllllllllllIIIllIllIllIlIlIlIl.init(WorkQueue.lIlIIlIlIIlIll[4], lllllllllllllIIIllIllIllIlIlIllI);
                return new String(lllllllllllllIIIllIllIllIlIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIllIlIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIllIllIllIlIlIlII) {
                lllllllllllllIIIllIllIllIlIlIlII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lllIIllIIIIlllI(final int lllllllllllllIIIllIllIllIIlIIIIl) {
            return lllllllllllllIIIllIllIllIIlIIIIl == 0;
        }
        
        private static boolean lllIIllIIIIlIll(final int lllllllllllllIIIllIllIllIIIllIll) {
            return lllllllllllllIIIllIllIllIIIllIll > 0;
        }
        
        private static boolean lllIIllIIIlIIII(final Object lllllllllllllIIIllIllIllIIlIlIII, final Object lllllllllllllIIIllIllIllIIlIIlll) {
            return lllllllllllllIIIllIllIllIIlIlIII == lllllllllllllIIIllIllIllIIlIIlll;
        }
        
        final boolean pollAndExecCC(final CountedCompleter<?> lllllllllllllIIIllIllIlllIlIIlII) {
            final int lllllllllllllIIIllIllIlllIlIIllI;
            final ForkJoinTask<?>[] lllllllllllllIIIllIllIlllIlIlIlI;
            if (lllIIllIIIIIlII((lllllllllllllIIIllIllIlllIlIIllI = this.base) - this.top) && lllIIllIIIIIllI(lllllllllllllIIIllIllIlllIlIlIlI = this.array)) {
                final long lllllllllllllIIIllIllIlllIlIlIll = ((lllllllllllllIIIllIllIlllIlIlIlI.length - WorkQueue.lIlIIlIlIIlIll[3] & lllllllllllllIIIllIllIlllIlIIllI) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                final Object lllllllllllllIIIllIllIlllIlIlIIl;
                if (lllIIllIIIIIlll(lllllllllllllIIIllIllIlllIlIlIIl = WorkQueue.U.getObjectVolatile(lllllllllllllIIIllIllIlllIlIlIlI, lllllllllllllIIIllIllIlllIlIlIll))) {
                    return WorkQueue.lIlIIlIlIIlIll[3] != 0;
                }
                if (lllIIllIIIIllIl((lllllllllllllIIIllIllIlllIlIlIIl instanceof CountedCompleter) ? 1 : 0)) {
                    CountedCompleter<?> lllllllllllllIIIllIllIlllIlIllII;
                    final CountedCompleter<?> lllllllllllllIIIllIllIlllIlIllIl = lllllllllllllIIIllIllIlllIlIllII = (CountedCompleter<?>)lllllllllllllIIIllIllIlllIlIlIIl;
                    while (!lllIIllIIIlIIII(lllllllllllllIIIllIllIlllIlIllII, lllllllllllllIIIllIllIlllIlIIlII)) {
                        if (lllIIllIIIIIlll(lllllllllllllIIIllIllIlllIlIllII = lllllllllllllIIIllIllIlllIlIllII.completer)) {
                            "".length();
                            if ("  ".length() < 0) {
                                return ((0x56 ^ 0x41 ^ "   ".length()) & (0x49 ^ 0x25 ^ (0x69 ^ 0x11) ^ -" ".length())) != 0x0;
                            }
                            return WorkQueue.lIlIIlIlIIlIll[1] != 0;
                        }
                    }
                    if (lllIIllIIIIIlIl(this.base, lllllllllllllIIIllIllIlllIlIIllI) && lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIllIlllIlIlIlI, lllllllllllllIIIllIllIlllIlIlIll, lllllllllllllIIIllIllIlllIlIllIl, null) ? 1 : 0)) {
                        WorkQueue.U.putOrderedInt(this, WorkQueue.QBASE, lllllllllllllIIIllIllIlllIlIIllI + WorkQueue.lIlIIlIlIIlIll[3]);
                        lllllllllllllIIIllIllIlllIlIllIl.doExec();
                        "".length();
                    }
                    return WorkQueue.lIlIIlIlIIlIll[3] != 0;
                }
            }
            return WorkQueue.lIlIIlIlIIlIll[1] != 0;
        }
        
        final boolean tryRemoveAndExec(final ForkJoinTask<?> lllllllllllllIIIllIllIllllIIIIII) {
            final ForkJoinTask<?>[] lllllllllllllIIIllIllIllllIIlIIl;
            final int lllllllllllllIIIllIllIllllIIlIII;
            int lllllllllllllIIIllIllIllllIIIlll;
            final int lllllllllllllIIIllIllIllllIIIllI;
            int lllllllllllllIIIllIllIllllIIIlIl;
            if (lllIIllIIIIIllI(lllllllllllllIIIllIllIllllIIIIII) && lllIIllIIIIIllI(lllllllllllllIIIllIllIllllIIlIIl = this.array) && lllIIllIIIIIIll(lllllllllllllIIIllIllIllllIIlIII = lllllllllllllIIIllIllIllllIIlIIl.length - WorkQueue.lIlIIlIlIIlIll[3]) && lllIIllIIIIlIll(lllllllllllllIIIllIllIllllIIIlIl = (lllllllllllllIIIllIllIllllIIIlll = this.top) - (lllllllllllllIIIllIllIllllIIIllI = this.base))) {
                boolean lllllllllllllIIIllIllIllllIIllII = WorkQueue.lIlIIlIlIIlIll[1] != 0;
                boolean lllllllllllllIIIllIllIllllIIlIll = WorkQueue.lIlIIlIlIIlIll[3] != 0;
                boolean lllllllllllllIIIllIllIllllIIlIlI = WorkQueue.lIlIIlIlIIlIll[3] != 0;
                do {
                    final long lllllllllllllIIIllIllIllllIIlllI = ((--lllllllllllllIIIllIllIllllIIIlll & lllllllllllllIIIllIllIllllIIlIII) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                    final ForkJoinTask<?> lllllllllllllIIIllIllIllllIIllIl = (ForkJoinTask<?>)WorkQueue.U.getObject(lllllllllllllIIIllIllIllllIIlIIl, lllllllllllllIIIllIllIllllIIlllI);
                    Label_0633: {
                        if (lllIIllIIIIIlll(lllllllllllllIIIllIllIllllIIllIl)) {
                            "".length();
                            if (" ".length() < 0) {
                                return ((0x61 ^ 0x4E) & ~(0x27 ^ 0x8)) != 0x0;
                            }
                        }
                        else if (lllIIllIIIlIIII(lllllllllllllIIIllIllIllllIIllIl, lllllllllllllIIIllIllIllllIIIIII)) {
                            if (lllIIllIIIIIlIl(lllllllllllllIIIllIllIllllIIIlll + WorkQueue.lIlIIlIlIIlIll[3], this.top)) {
                                if (lllIIllIIIIlllI(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIllIllllIIlIIl, lllllllllllllIIIllIllIllllIIlllI, lllllllllllllIIIllIllIllllIIIIII, null) ? 1 : 0)) {
                                    "".length();
                                    if (-(83 + 76 - 117 + 93 ^ 87 + 102 - 112 + 54) >= 0) {
                                        return ((0x1E ^ 0x14 ^ (0xBD ^ 0x8D)) & (0xCE ^ 0xC0 ^ (0x46 ^ 0x72) ^ -" ".length())) != 0x0;
                                    }
                                }
                                else {
                                    this.top = lllllllllllllIIIllIllIllllIIIlll;
                                    lllllllllllllIIIllIllIllllIIllII = (WorkQueue.lIlIIlIlIIlIll[3] != 0);
                                    "".length();
                                    if (-"  ".length() > 0) {
                                        return ((103 + 162 - 179 + 102 ^ 43 + 115 - 111 + 96) & (67 + 94 - 106 + 78 ^ 96 + 176 - 244 + 154 ^ -" ".length())) != 0x0;
                                    }
                                }
                            }
                            else if (lllIIllIIIIIlIl(this.base, lllllllllllllIIIllIllIllllIIIllI)) {
                                lllllllllllllIIIllIllIllllIIllII = WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIllIllllIIlIIl, lllllllllllllIIIllIllIllllIIlllI, lllllllllllllIIIllIllIllllIIIIII, new EmptyTask());
                                "".length();
                                if (((0x7A ^ 0x69) & ~(0x66 ^ 0x75)) != 0x0) {
                                    return ((0x1A ^ 0x9) & ~(0x93 ^ 0x80)) != 0x0;
                                }
                            }
                        }
                        else {
                            if (lllIIllIIIIIIll(lllllllllllllIIIllIllIllllIIllIl.status)) {
                                lllllllllllllIIIllIllIllllIIlIll = (WorkQueue.lIlIIlIlIIlIll[1] != 0);
                                "".length();
                                if (-" ".length() >= 0) {
                                    return ((0x2F ^ 0x75) & ~(0x4E ^ 0x14)) != 0x0;
                                }
                            }
                            else if (lllIIllIIIIIlIl(lllllllllllllIIIllIllIllllIIIlll + WorkQueue.lIlIIlIlIIlIll[3], this.top)) {
                                if (!lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIllIllllIIlIIl, lllllllllllllIIIllIllIllllIIlllI, lllllllllllllIIIllIllIllllIIllIl, null) ? 1 : 0)) {
                                    break Label_0633;
                                }
                                this.top = lllllllllllllIIIllIllIllllIIIlll;
                                "".length();
                                if ("  ".length() == 0) {
                                    return ((0x81 ^ 0xB8) & ~(0x5F ^ 0x66)) != 0x0;
                                }
                                break Label_0633;
                            }
                            if (!lllIIllIIIIlllI(--lllllllllllllIIIllIllIllllIIIlIl)) {
                                "".length();
                                continue;
                            }
                            if (lllIIllIIIIlllI(lllllllllllllIIIllIllIllllIIlIll ? 1 : 0) && lllIIllIIIIIlIl(this.base, lllllllllllllIIIllIllIllllIIIllI)) {
                                lllllllllllllIIIllIllIllllIIlIlI = (WorkQueue.lIlIIlIlIIlIll[1] != 0);
                                "".length();
                                if (-(0x32 ^ 0x36) > 0) {
                                    return ((0xE0 ^ 0xBE) & ~(0x27 ^ 0x79)) != 0x0;
                                }
                            }
                        }
                    }
                    if (lllIIllIIIIllIl(lllllllllllllIIIllIllIllllIIllII ? 1 : 0)) {
                        lllllllllllllIIIllIllIllllIIIIII.doExec();
                        "".length();
                    }
                    "".length();
                    if (null != null) {
                        return ((0x4C ^ 0x1D ^ (0x7D ^ 0x38)) & (0xF3 ^ 0x81 ^ (0x4C ^ 0x2A) ^ -" ".length())) != 0x0;
                    }
                    final boolean lllllllllllllIIIllIllIllllIIIIlI;
                    return lllllllllllllIIIllIllIllllIIIIlI;
                } while ("   ".length() >= 0);
                return ((0x15 ^ 0x46) & ~(0x21 ^ 0x72)) != 0x0;
            }
            final boolean lllllllllllllIIIllIllIllllIIIIlI = WorkQueue.lIlIIlIlIIlIll[1] != 0;
            return lllllllllllllIIIllIllIllllIIIIlI;
        }
        
        private static boolean lllIIllIIIIIIll(final int lllllllllllllIIIllIllIllIIIlllll) {
            return lllllllllllllIIIllIllIllIIIlllll >= 0;
        }
        
        final ForkJoinTask<?> poll() {
            int lllllllllllllIIIllIlllIIIIlIIIll;
            ForkJoinTask<?>[] lllllllllllllIIIllIlllIIIIlIIllI;
            while (lllIIllIIIIIlII((lllllllllllllIIIllIlllIIIIlIIIll = this.base) - this.top) && lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIIlIIllI = this.array)) {
                final int lllllllllllllIIIllIlllIIIIlIIlll = ((lllllllllllllIIIllIlllIIIIlIIllI.length - WorkQueue.lIlIIlIlIIlIll[3] & lllllllllllllIIIllIlllIIIIlIIIll) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                final ForkJoinTask<?> lllllllllllllIIIllIlllIIIIlIIlIl = (ForkJoinTask<?>)WorkQueue.U.getObjectVolatile(lllllllllllllIIIllIlllIIIIlIIllI, lllllllllllllIIIllIlllIIIIlIIlll);
                if (lllIIllIIIIIllI(lllllllllllllIIIllIlllIIIIlIIlIl)) {
                    if (lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIlllIIIIlIIllI, lllllllllllllIIIllIlllIIIIlIIlll, lllllllllllllIIIllIlllIIIIlIIlIl, null) ? 1 : 0)) {
                        WorkQueue.U.putOrderedInt(this, WorkQueue.QBASE, lllllllllllllIIIllIlllIIIIlIIIll + WorkQueue.lIlIIlIlIIlIll[3]);
                        return lllllllllllllIIIllIlllIIIIlIIlIl;
                    }
                }
                else if (lllIIllIIIIIlIl(this.base, lllllllllllllIIIllIlllIIIIlIIIll)) {
                    if (lllIIllIIIIIlIl(lllllllllllllIIIllIlllIIIIlIIIll + WorkQueue.lIlIIlIlIIlIll[3], this.top)) {
                        "".length();
                        if (" ".length() == ((0x4 ^ 0x34) & ~(0x75 ^ 0x45))) {
                            return null;
                        }
                        break;
                    }
                    else {
                        Thread.yield();
                    }
                }
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return null;
        }
        
        private static boolean lllIIllIIIIIlII(final int lllllllllllllIIIllIllIllIIIlllIl) {
            return lllllllllllllIIIllIllIllIIIlllIl < 0;
        }
        
        final boolean externalPopAndExecCC(final CountedCompleter<?> lllllllllllllIIIllIllIlllIIIllII) {
            final int lllllllllllllIIIllIllIlllIIIlllI;
            final ForkJoinTask<?>[] lllllllllllllIIIllIllIlllIIlIIlI;
            if (lllIIllIIIIIlII(this.base - (lllllllllllllIIIllIllIlllIIIlllI = this.top)) && lllIIllIIIIIllI(lllllllllllllIIIllIllIlllIIlIIlI = this.array)) {
                final long lllllllllllllIIIllIllIlllIIlIIll = ((lllllllllllllIIIllIllIlllIIlIIlI.length - WorkQueue.lIlIIlIlIIlIll[3] & lllllllllllllIIIllIllIlllIIIlllI - WorkQueue.lIlIIlIlIIlIll[3]) << WorkQueue.ASHIFT) + WorkQueue.ABASE;
                final Object lllllllllllllIIIllIllIlllIIlIIIl;
                if (lllIIllIIIIllIl(((lllllllllllllIIIllIllIlllIIlIIIl = WorkQueue.U.getObject(lllllllllllllIIIllIllIlllIIlIIlI, lllllllllllllIIIllIllIlllIIlIIll)) instanceof CountedCompleter) ? 1 : 0)) {
                    CountedCompleter<?> lllllllllllllIIIllIllIlllIIlIlII;
                    final CountedCompleter<?> lllllllllllllIIIllIllIlllIIlIlIl = lllllllllllllIIIllIllIlllIIlIlII = (CountedCompleter<?>)lllllllllllllIIIllIllIlllIIlIIIl;
                    while (!lllIIllIIIlIIII(lllllllllllllIIIllIllIlllIIlIlII, lllllllllllllIIIllIllIlllIIIllII)) {
                        if (lllIIllIIIIIlll(lllllllllllllIIIllIllIlllIIlIlII = lllllllllllllIIIllIllIlllIIlIlII.completer)) {
                            "".length();
                            if ("  ".length() < 0) {
                                return ((0x2B ^ 0x2F) & ~(0x30 ^ 0x34)) != 0x0;
                            }
                            return WorkQueue.lIlIIlIlIIlIll[1] != 0;
                        }
                    }
                    if (lllIIllIIIIllIl(WorkQueue.U.compareAndSwapInt(this, WorkQueue.QLOCK, WorkQueue.lIlIIlIlIIlIll[1], WorkQueue.lIlIIlIlIIlIll[3]) ? 1 : 0)) {
                        if (lllIIllIIIIIlIl(this.top, lllllllllllllIIIllIllIlllIIIlllI) && lllIIllIIIlIIII(this.array, lllllllllllllIIIllIllIlllIIlIIlI) && lllIIllIIIIllIl(WorkQueue.U.compareAndSwapObject(lllllllllllllIIIllIllIlllIIlIIlI, lllllllllllllIIIllIllIlllIIlIIll, lllllllllllllIIIllIllIlllIIlIlIl, null) ? 1 : 0)) {
                            this.top = lllllllllllllIIIllIllIlllIIIlllI - WorkQueue.lIlIIlIlIIlIll[3];
                            this.qlock = WorkQueue.lIlIIlIlIIlIll[1];
                            lllllllllllllIIIllIllIlllIIlIlIl.doExec();
                            "".length();
                            "".length();
                            if (((0x48 ^ 0x7A) & ~(0x4A ^ 0x78)) != 0x0) {
                                return ((0x1A ^ 0xE) & ~(0x62 ^ 0x76)) != 0x0;
                            }
                        }
                        else {
                            this.qlock = WorkQueue.lIlIIlIlIIlIll[1];
                        }
                    }
                    return WorkQueue.lIlIIlIlIIlIll[3] != 0;
                }
            }
            return WorkQueue.lIlIIlIlIIlIll[1] != 0;
        }
    }
    
    static final class EmptyTask extends ForkJoinTask<Void>
    {
        private static final /* synthetic */ int[] llIIlIllllIlIl;
        
        public final boolean exec() {
            return EmptyTask.llIIlIllllIlIl[1] != 0;
        }
        
        EmptyTask() {
            this.status = EmptyTask.llIIlIllllIlIl[0];
        }
        
        static {
            lIIIlllIIIIlIlll();
        }
        
        @Override
        public final Void getRawResult() {
            return null;
        }
        
        public final void setRawResult(final Void llllllllllllIlllIIIIlllIlIIlIIll) {
        }
        
        private static void lIIIlllIIIIlIlll() {
            (llIIlIllllIlIl = new int[2])[0] = -(0xFFFFCBAC & 0x10003453);
            EmptyTask.llIIlIllllIlIl[1] = " ".length();
        }
    }
    
    static final class DefaultForkJoinWorkerThreadFactory implements ForkJoinWorkerThreadFactory
    {
        @Override
        public final ForkJoinWorkerThread newThread(final ForkJoinPool llllllllllllIllIIlIIIIIlIlllllII) {
            return new ForkJoinWorkerThread(llllllllllllIllIIlIIIIIlIlllllII);
        }
    }
    
    public interface ForkJoinWorkerThreadFactory
    {
        ForkJoinWorkerThread newThread(final ForkJoinPool p0);
    }
    
    public interface ManagedBlocker
    {
        boolean isReleasable();
        
        boolean block() throws InterruptedException;
    }
    
    static final class Submitter
    {
        /* synthetic */ int seed;
        
        Submitter(final int llllllllllllIllIIIllIIIIIlllllIl) {
            this.seed = llllllllllllIllIIIllIIIIIlllllIl;
        }
    }
}
