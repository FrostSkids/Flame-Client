// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.chmv8;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.concurrent.RunnableFuture;
import java.util.List;
import java.util.RandomAccess;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.io.ObjectOutputStream;
import java.security.PrivilegedActionException;
import java.security.AccessController;
import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import sun.misc.Unsafe;
import java.util.concurrent.locks.ReentrantLock;
import java.lang.ref.ReferenceQueue;
import java.io.Serializable;
import java.util.concurrent.Future;

public abstract class ForkJoinTask<V> implements Future<V>, Serializable
{
    volatile /* synthetic */ int status;
    private static final /* synthetic */ int[] llIIIllIIIlIll;
    private static final /* synthetic */ ReferenceQueue<Object> exceptionTableRefQueue;
    private static final /* synthetic */ ReentrantLock exceptionTableLock;
    private static final /* synthetic */ Unsafe U;
    private static final /* synthetic */ ExceptionNode[] exceptionTable;
    private static final /* synthetic */ String[] llIIIllIIIlIlI;
    private static final /* synthetic */ long STATUS;
    
    static final void cancelIgnoringExceptions(final ForkJoinTask<?> llllllllllllIlllIlIIllllllIlIIII) {
        if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIllllllIlIIII) && lIIIlIlIIIIIlIll(llllllllllllIlllIlIIllllllIlIIII.status)) {
            try {
                llllllllllllIlllIlIIllllllIlIIII.cancel((boolean)(ForkJoinTask.llIIIllIIIlIll[4] != 0));
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Throwable t) {}
        }
    }
    
    public boolean tryUnfork() {
        final Thread llllllllllllIlllIlIIlllIllIIIIII;
        boolean b;
        if (lIIIlIlIIIIIlIlI(((llllllllllllIlllIlIIlllIllIIIIII = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            b = ((ForkJoinWorkerThread)llllllllllllIlllIlIIlllIllIIIIII).workQueue.tryUnpush(this);
            "".length();
            if ((0xAF ^ 0xAA) == 0x0) {
                return ((0x8D ^ 0xC7) & ~(0x25 ^ 0x6F)) != 0x0;
            }
        }
        else {
            b = ForkJoinPool.common.tryExternalUnpush(this);
        }
        return b;
    }
    
    public abstract V getRawResult();
    
    protected static ForkJoinTask<?> pollNextLocalTask() {
        final Thread llllllllllllIlllIlIIlllIlIlIlllI;
        ForkJoinTask<?> nextLocalTask;
        if (lIIIlIlIIIIIlIlI(((llllllllllllIlllIlIIlllIlIlIlllI = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            nextLocalTask = ((ForkJoinWorkerThread)llllllllllllIlllIlIIlllIlIlIlllI).workQueue.nextLocalTask();
            "".length();
            if ((0x50 ^ 0x54) <= -" ".length()) {
                return null;
            }
        }
        else {
            nextLocalTask = null;
        }
        return nextLocalTask;
    }
    
    public static boolean inForkJoinPool() {
        return Thread.currentThread() instanceof ForkJoinWorkerThread;
    }
    
    private static String lIIIlIlIIIIIIllI(final String llllllllllllIlllIlIIlllIIllIIIlI, final String llllllllllllIlllIlIIlllIIllIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIlllIIllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIlllIIllIIIIl.getBytes(StandardCharsets.UTF_8)), ForkJoinTask.llIIIllIIIlIll[10]), "DES");
            final Cipher llllllllllllIlllIlIIlllIIllIIllI = Cipher.getInstance("DES");
            llllllllllllIlllIlIIlllIIllIIllI.init(ForkJoinTask.llIIIllIIIlIll[9], llllllllllllIlllIlIIlllIIllIIlll);
            return new String(llllllllllllIlllIlIIlllIIllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIlllIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIlllIIllIIlIl) {
            llllllllllllIlllIlIIlllIIllIIlIl.printStackTrace();
            return null;
        }
    }
    
    public final V invoke() {
        final int llllllllllllIlllIlIIllllIllIllII;
        if (lIIIlIlIIIIlIIII(llllllllllllIlllIlIIllllIllIllII = (this.doInvoke() & ForkJoinTask.llIIIllIIIlIll[1]), ForkJoinTask.llIIIllIIIlIll[1])) {
            this.reportException(llllllllllllIlllIlIIllllIllIllII);
        }
        return this.getRawResult();
    }
    
    private Throwable getThrowableException() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        io/netty/util/internal/chmv8/ForkJoinTask.status:I
        //     4: getstatic       io/netty/util/internal/chmv8/ForkJoinTask.llIIIllIIIlIll:[I
        //     7: iconst_1       
        //     8: iaload         
        //     9: iand           
        //    10: ldc             -2147483648
        //    12: invokestatic    io/netty/util/internal/chmv8/ForkJoinTask.lIIIlIlIIIIlIIII:(II)Z
        //    15: ifeq            20
        //    18: aconst_null    
        //    19: areturn        
        //    20: aload_0         /* llllllllllllIlllIlIIlllllIlIllII */
        //    21: invokestatic    java/lang/System.identityHashCode:(Ljava/lang/Object;)I
        //    24: istore_1        /* llllllllllllIlllIlIIlllllIlIIllI */
        //    25: getstatic       io/netty/util/internal/chmv8/ForkJoinTask.exceptionTableLock:Ljava/util/concurrent/locks/ReentrantLock;
        //    28: astore_3        /* llllllllllllIlllIlIIlllllIlIlIIl */
        //    29: aload_3         /* llllllllllllIlllIlIIlllllIlIlIIl */
        //    30: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //    33: invokestatic    io/netty/util/internal/chmv8/ForkJoinTask.expungeStaleExceptions:()V
        //    36: getstatic       io/netty/util/internal/chmv8/ForkJoinTask.exceptionTable:[Lio/netty/util/internal/chmv8/ForkJoinTask$ExceptionNode;
        //    39: astore          llllllllllllIlllIlIIlllllIlIlllI
        //    41: aload           llllllllllllIlllIlIIlllllIlIlllI
        //    43: iload_1         /* llllllllllllIlllIlIIlllllIlIlIll */
        //    44: aload           llllllllllllIlllIlIIlllllIlIlllI
        //    46: arraylength    
        //    47: getstatic       io/netty/util/internal/chmv8/ForkJoinTask.llIIIllIIIlIll:[I
        //    50: iconst_3       
        //    51: iaload         
        //    52: isub           
        //    53: iand           
        //    54: aaload         
        //    55: astore_2        /* llllllllllllIlllIlIIlllllIlIIlIl */
        //    56: aload_2         /* llllllllllllIlllIlIIlllllIlIlIlI */
        //    57: invokestatic    io/netty/util/internal/chmv8/ForkJoinTask.lIIIlIlIIIIIllII:(Ljava/lang/Object;)Z
        //    60: ifeq            130
        //    63: aload_2         /* llllllllllllIlllIlIIlllllIlIlIlI */
        //    64: invokevirtual   io/netty/util/internal/chmv8/ForkJoinTask$ExceptionNode.get:()Ljava/lang/Object;
        //    67: aload_0         /* llllllllllllIlllIlIIlllllIlIllII */
        //    68: invokestatic    io/netty/util/internal/chmv8/ForkJoinTask.lIIIlIlIIIIlIIIl:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    71: ifeq            130
        //    74: aload_2         /* llllllllllllIlllIlIIlllllIlIlIlI */
        //    75: getfield        io/netty/util/internal/chmv8/ForkJoinTask$ExceptionNode.next:Lio/netty/util/internal/chmv8/ForkJoinTask$ExceptionNode;
        //    78: astore_2        /* llllllllllllIlllIlIIlllllIlIlIlI */
        //    79: ldc             ""
        //    81: invokevirtual   java/lang/String.length:()I
        //    84: pop            
        //    85: bipush          94
        //    87: bipush          6
        //    89: ixor           
        //    90: sipush          143
        //    93: sipush          197
        //    96: ixor           
        //    97: ixor           
        //    98: sipush          147
        //   101: sipush          169
        //   104: ixor           
        //   105: bipush          57
        //   107: bipush          17
        //   109: ixor           
        //   110: ixor           
        //   111: ldc             " "
        //   113: invokevirtual   java/lang/String.length:()I
        //   116: ineg           
        //   117: ixor           
        //   118: iand           
        //   119: ldc             " "
        //   121: invokevirtual   java/lang/String.length:()I
        //   124: ineg           
        //   125: if_icmpgt       56
        //   128: aconst_null    
        //   129: areturn        
        //   130: aload_3         /* llllllllllllIlllIlIIlllllIlIlIIl */
        //   131: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   134: ldc             ""
        //   136: invokevirtual   java/lang/String.length:()I
        //   139: pop            
        //   140: ldc             " "
        //   142: invokevirtual   java/lang/String.length:()I
        //   145: ineg           
        //   146: iflt            160
        //   149: aconst_null    
        //   150: areturn        
        //   151: astore          llllllllllllIlllIlIIlllllIlIIIlI
        //   153: aload_3         /* llllllllllllIlllIlIIlllllIlIlIIl */
        //   154: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   157: aload           llllllllllllIlllIlIIlllllIlIIIlI
        //   159: athrow         
        //   160: aload_2         /* llllllllllllIlllIlIIlllllIlIlIlI */
        //   161: invokestatic    io/netty/util/internal/chmv8/ForkJoinTask.lIIIlIlIIIIIllII:(Ljava/lang/Object;)Z
        //   164: ifeq            180
        //   167: aload_2         /* llllllllllllIlllIlIIlllllIlIlIlI */
        //   168: getfield        io/netty/util/internal/chmv8/ForkJoinTask$ExceptionNode.ex:Ljava/lang/Throwable;
        //   171: dup            
        //   172: astore          llllllllllllIlllIlIIlllllIlIllIl
        //   174: invokestatic    io/netty/util/internal/chmv8/ForkJoinTask.lIIIlIlIIIIIllIl:(Ljava/lang/Object;)Z
        //   177: ifeq            182
        //   180: aconst_null    
        //   181: areturn        
        //   182: aload           llllllllllllIlllIlIIlllllIlIlIII
        //   184: areturn        
        //    StackMapTable: 00 07 14 FF 00 23 00 05 07 00 02 01 07 00 1B 07 01 04 07 01 2F 00 00 FB 00 49 FF 00 14 00 04 07 00 02 01 00 07 01 04 00 01 07 00 3F FF 00 08 00 05 07 00 02 01 07 00 1B 07 01 04 07 01 2F 00 00 FF 00 13 00 05 07 00 02 01 07 00 1B 07 01 04 07 00 05 00 00 FF 00 01 00 05 07 00 02 01 07 00 1B 07 01 04 07 00 3F 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  33     130    151    160    Any
        //  151    153    151    160    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static boolean lIIIlIlIIIIlIlII(final int llllllllllllIlllIlIIlllIIIlIIlll) {
        return llllllllllllIlllIlIIlllIIIlIIlll == 0;
    }
    
    public static void helpQuiesce() {
        final Thread llllllllllllIlllIlIIlllIllIIllII;
        if (lIIIlIlIIIIIlIlI(((llllllllllllIlllIlIIlllIllIIllII = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            final ForkJoinWorkerThread llllllllllllIlllIlIIlllIllIIllIl = (ForkJoinWorkerThread)llllllllllllIlllIlIIlllIllIIllII;
            llllllllllllIlllIlIIlllIllIIllIl.pool.helpQuiescePool(llllllllllllIlllIlIIlllIllIIllIl.workQueue);
            "".length();
            if (" ".length() >= (0x14 ^ 0x10)) {
                return;
            }
        }
        else {
            ForkJoinPool.quiesceCommonPool();
        }
    }
    
    private static boolean lIIIlIlIIIIIllII(final Object llllllllllllIlllIlIIlllIIIllIIIl) {
        return llllllllllllIlllIlIIlllIIIllIIIl != null;
    }
    
    private int doJoin() {
        int llllllllllllIlllIlIlIIIIIIIIlIll;
        int n;
        if (lIIIlIlIIIIIlIIl(llllllllllllIlllIlIlIIIIIIIIlIll = this.status)) {
            n = llllllllllllIlllIlIlIIIIIIIIlIll;
            "".length();
            if (((0x66 ^ 0x11 ^ (0x24 ^ 0x19)) & (0x3F ^ 0x57 ^ (0x12 ^ 0x30) ^ -" ".length())) > 0) {
                return (16 + 143 - 23 + 13 ^ 67 + 8 - 67 + 123) & (64 + 87 - 32 + 89 ^ 53 + 4 + 59 + 82 ^ -" ".length());
            }
        }
        else {
            final Thread llllllllllllIlllIlIlIIIIIIIIllIl;
            if (lIIIlIlIIIIIlIlI(((llllllllllllIlllIlIlIIIIIIIIllIl = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
                final ForkJoinWorkerThread llllllllllllIlllIlIlIIIIIIIIllll;
                final ForkJoinPool.WorkQueue llllllllllllIlllIlIlIIIIIIIIlllI;
                if (lIIIlIlIIIIIlIlI((llllllllllllIlllIlIlIIIIIIIIlllI = (llllllllllllIlllIlIlIIIIIIIIllll = (ForkJoinWorkerThread)llllllllllllIlllIlIlIIIIIIIIllIl).workQueue).tryUnpush(this) ? 1 : 0) && lIIIlIlIIIIIlIIl(llllllllllllIlllIlIlIIIIIIIIlIll = this.doExec())) {
                    n = llllllllllllIlllIlIlIIIIIIIIlIll;
                    "".length();
                    if (null != null) {
                        return (0x84 ^ 0x97) & ~(0xBF ^ 0xAC);
                    }
                }
                else {
                    n = llllllllllllIlllIlIlIIIIIIIIllll.pool.awaitJoin(llllllllllllIlllIlIlIIIIIIIIlllI, this);
                    "".length();
                    if (" ".length() >= (0x3A ^ 0x1B ^ (0x84 ^ 0xA1))) {
                        return (75 + 96 - 60 + 50 ^ 96 + 112 - 111 + 70) & (92 + 17 + 58 + 0 ^ 139 + 145 - 264 + 141 ^ -" ".length());
                    }
                }
            }
            else {
                n = this.externalAwaitDone();
            }
        }
        return n;
    }
    
    public final short getForkJoinTaskTag() {
        return (short)this.status;
    }
    
    public void complete(final V llllllllllllIlllIlIIllllIIIlIlll) {
        try {
            this.setRawResult(llllllllllllIlllIlIIllllIIIlIlll);
            "".length();
            if ((0xAA ^ 0x89 ^ (0xA0 ^ 0x87)) <= 0) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllIlIIllllIIIllIIl) {
            this.setExceptionalCompletion(llllllllllllIlllIlIIllllIIIllIIl);
            "".length();
            return;
        }
        this.setCompletion(ForkJoinTask.llIIIllIIIlIll[1]);
        "".length();
    }
    
    void internalPropagateException(final Throwable llllllllllllIlllIlIIllllllIlIlIl) {
    }
    
    protected static ForkJoinTask<?> peekNextLocalTask() {
        final Thread llllllllllllIlllIlIIlllIlIllIIll;
        ForkJoinPool.WorkQueue llllllllllllIlllIlIIlllIlIllIIlI = null;
        if (lIIIlIlIIIIIlIlI(((llllllllllllIlllIlIIlllIlIllIIll = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            final ForkJoinPool.WorkQueue llllllllllllIlllIlIIlllIlIllIlII = ((ForkJoinWorkerThread)llllllllllllIlllIlIIlllIlIllIIll).workQueue;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        else {
            llllllllllllIlllIlIIlllIlIllIIlI = ForkJoinPool.commonSubmitterQueue();
        }
        ForkJoinTask<?> peek;
        if (lIIIlIlIIIIIllIl(llllllllllllIlllIlIIlllIlIllIIlI)) {
            peek = null;
            "".length();
            if (((173 + 58 - 64 + 75 ^ 123 + 78 - 72 + 48) & (0x83 ^ 0xB4 ^ (0x37 ^ 0x43) ^ -" ".length())) > 0) {
                return null;
            }
        }
        else {
            peek = llllllllllllIlllIlIIlllIlIllIIlI.peek();
        }
        return peek;
    }
    
    private void readObject(final ObjectInputStream llllllllllllIlllIlIIlllIIlllIlIl) throws IOException, ClassNotFoundException {
        llllllllllllIlllIlIIlllIIlllIlIl.defaultReadObject();
        final Object llllllllllllIlllIlIIlllIIlllIlll = llllllllllllIlllIlIIlllIIlllIlIl.readObject();
        if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllIIlllIlll)) {
            this.setExceptionalCompletion((Throwable)llllllllllllIlllIlIIlllIIlllIlll);
            "".length();
        }
    }
    
    private int externalInterruptibleAwaitDone() throws InterruptedException {
        final ForkJoinPool llllllllllllIlllIlIlIIIIIIIllIlI = ForkJoinPool.common;
        if (lIIIlIlIIIIIlIlI(Thread.interrupted() ? 1 : 0)) {
            throw new InterruptedException();
        }
        int llllllllllllIlllIlIlIIIIIIIllIll;
        if (lIIIlIlIIIIIlIll(llllllllllllIlllIlIlIIIIIIIllIll = this.status) && lIIIlIlIIIIIllII(llllllllllllIlllIlIlIIIIIIIllIlI)) {
            if (lIIIlIlIIIIIlIlI((this instanceof CountedCompleter) ? 1 : 0)) {
                llllllllllllIlllIlIlIIIIIIIllIlI.externalHelpComplete((CountedCompleter<?>)this);
                "".length();
                "".length();
                if (" ".length() <= -" ".length()) {
                    return (0xAF ^ 0x92 ^ (0x85 ^ 0x9D)) & (8 + 28 + 68 + 82 ^ 36 + 158 - 77 + 42 ^ -" ".length());
                }
            }
            else if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIlIIIIIIIllIlI.tryExternalUnpush(this) ? 1 : 0)) {
                this.doExec();
                "".length();
            }
        }
        while (lIIIlIlIIIIIlIll(llllllllllllIlllIlIlIIIIIIIllIll = this.status)) {
            if (lIIIlIlIIIIIlIlI(ForkJoinTask.U.compareAndSwapInt(this, ForkJoinTask.STATUS, llllllllllllIlllIlIlIIIIIIIllIll, llllllllllllIlllIlIlIIIIIIIllIll | ForkJoinTask.llIIIllIIIlIll[2]) ? 1 : 0)) {
                final boolean llllllllllllIlllIlIlIIIIIIIlIllI = (boolean)this;
                synchronized (this) {
                    if (lIIIlIlIIIIIlIll(this.status)) {
                        this.wait();
                        "".length();
                        if (-"  ".length() >= 0) {
                            return (0x9C ^ 0xBD) & ~(0xD ^ 0x2C);
                        }
                    }
                    else {
                        this.notifyAll();
                    }
                    // monitorexit(this)
                    "".length();
                    if ((0x23 ^ 0x27) == 0x0) {
                        return (0xE4 ^ 0xBB) & ~(0x71 ^ 0x2E);
                    }
                }
                "".length();
                if (" ".length() <= 0) {
                    return (0xD1 ^ 0x88 ^ (0x29 ^ 0x3C)) & (53 + 146 - 108 + 138 ^ 28 + 152 - 155 + 144 ^ -" ".length());
                }
                continue;
            }
        }
        return llllllllllllIlllIlIlIIIIIIIllIll;
    }
    
    private void clearExceptionalCompletion() {
        final int llllllllllllIlllIlIIlllllIllllll = System.identityHashCode(this);
        final ReentrantLock llllllllllllIlllIlIIlllllIlllllI = ForkJoinTask.exceptionTableLock;
        llllllllllllIlllIlIIlllllIlllllI.lock();
        try {
            final ExceptionNode[] llllllllllllIlllIlIIllllllIIIlII = ForkJoinTask.exceptionTable;
            final int llllllllllllIlllIlIIllllllIIIIll = llllllllllllIlllIlIIlllllIllllll & llllllllllllIlllIlIIllllllIIIlII.length - ForkJoinTask.llIIIllIIIlIll[3];
            ExceptionNode llllllllllllIlllIlIIllllllIIIIlI = llllllllllllIlllIlIIllllllIIIlII[llllllllllllIlllIlIIllllllIIIIll];
            ExceptionNode llllllllllllIlllIlIIllllllIIIIIl = null;
            while (lIIIlIlIIIIIllII(llllllllllllIlllIlIIllllllIIIIlI)) {
                final ExceptionNode llllllllllllIlllIlIIllllllIIIlIl = llllllllllllIlllIlIIllllllIIIIlI.next;
                if (lIIIlIlIIIIIlllI(((Reference<Object>)llllllllllllIlllIlIIllllllIIIIlI).get(), this)) {
                    if (lIIIlIlIIIIIllIl(llllllllllllIlllIlIIllllllIIIIIl)) {
                        llllllllllllIlllIlIIllllllIIIlII[llllllllllllIlllIlIIllllllIIIIll] = llllllllllllIlllIlIIllllllIIIlIl;
                        "".length();
                        if ((0x9F ^ 0x9B) < 0) {
                            return;
                        }
                        break;
                    }
                    else {
                        llllllllllllIlllIlIIllllllIIIIIl.next = llllllllllllIlllIlIIllllllIIIlIl;
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                }
                else {
                    llllllllllllIlllIlIIllllllIIIIIl = llllllllllllIlllIlIIllllllIIIIlI;
                    llllllllllllIlllIlIIllllllIIIIlI = llllllllllllIlllIlIIllllllIIIlIl;
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return;
                    }
                    continue;
                }
            }
            expungeStaleExceptions();
            this.status = ForkJoinTask.llIIIllIIIlIll[4];
            llllllllllllIlllIlIIlllllIlllllI.unlock();
            "".length();
            if (null != null) {
                return;
            }
        }
        finally {
            llllllllllllIlllIlIIlllllIlllllI.unlock();
        }
    }
    
    private int setCompletion(final int llllllllllllIlllIlIlIIIIIlIIllII) {
        int llllllllllllIlllIlIlIIIIIlIIlllI;
        while (!lIIIlIlIIIIIlIIl(llllllllllllIlllIlIlIIIIIlIIlllI = this.status)) {
            if (lIIIlIlIIIIIlIlI(ForkJoinTask.U.compareAndSwapInt(this, ForkJoinTask.STATUS, llllllllllllIlllIlIlIIIIIlIIlllI, llllllllllllIlllIlIlIIIIIlIIlllI | llllllllllllIlllIlIlIIIIIlIIllII) ? 1 : 0)) {
                if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIlIIIIIlIIlllI >>> ForkJoinTask.llIIIllIIIlIll[0])) {
                    final double llllllllllllIlllIlIlIIIIIlIIlIII = (double)this;
                    synchronized (this) {
                        this.notifyAll();
                        // monitorexit(this)
                        "".length();
                        if ((0xB6 ^ 0xB2) < (0xBB ^ 0xBF)) {
                            return (0x35 ^ 0x1A) & ~(0x2D ^ 0x2);
                        }
                    }
                }
                return llllllllllllIlllIlIlIIIIIlIIllII;
            }
        }
        return llllllllllllIlllIlIlIIIIIlIIlllI;
    }
    
    protected abstract void setRawResult(final V p0);
    
    private static boolean lIIIlIlIIIIIlIll(final int llllllllllllIlllIlIIlllIIIlIIlIl) {
        return llllllllllllIlllIlIIlllIIIlIIlIl >= 0;
    }
    
    private static boolean lIIIlIlIIIIlIIII(final int llllllllllllIlllIlIIlllIIIIlllII, final int llllllllllllIlllIlIIlllIIIIllIll) {
        return llllllllllllIlllIlIIlllIIIIlllII != llllllllllllIlllIlIIlllIIIIllIll;
    }
    
    @Override
    public final boolean isCancelled() {
        int n;
        if (lIIIlIlIIIIIllll(this.status & ForkJoinTask.llIIIllIIIlIll[1], ForkJoinTask.llIIIllIIIlIll[5])) {
            n = ForkJoinTask.llIIIllIIIlIll[3];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0xFF ^ 0xB9) & ~(0xFF ^ 0xB9)) != 0x0;
            }
        }
        else {
            n = ForkJoinTask.llIIIllIIIlIll[4];
        }
        return n != 0;
    }
    
    public static <T> ForkJoinTask<T> adapt(final Runnable llllllllllllIlllIlIIlllIlIIIIlll, final T llllllllllllIlllIlIIlllIlIIIIllI) {
        return new AdaptedRunnable<T>(llllllllllllIlllIlIIlllIlIIIIlll, llllllllllllIlllIlIIlllIlIIIIllI);
    }
    
    @Override
    public final V get() throws InterruptedException, ExecutionException {
        int n;
        if (lIIIlIlIIIIIlIlI((Thread.currentThread() instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            n = this.doJoin();
            "".length();
            if ("  ".length() < ((151 + 177 - 152 + 13 ^ 117 + 73 - 53 + 6) & (30 + 143 - 68 + 79 ^ 64 + 65 - 94 + 103 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            n = this.externalInterruptibleAwaitDone();
        }
        int llllllllllllIlllIlIIllllIIIIlIll = n;
        if (lIIIlIlIIIIIllll(llllllllllllIlllIlIIllllIIIIlIll &= ForkJoinTask.llIIIllIIIlIll[1], ForkJoinTask.llIIIllIIIlIll[5])) {
            throw new CancellationException();
        }
        final Throwable llllllllllllIlllIlIIllllIIIIllIl;
        if (lIIIlIlIIIIIllll(llllllllllllIlllIlIIllllIIIIlIll, Integer.MIN_VALUE) && lIIIlIlIIIIIllII(llllllllllllIlllIlIIllllIIIIllIl = this.getThrowableException())) {
            throw new ExecutionException(llllllllllllIlllIlIIllllIIIIllIl);
        }
        return this.getRawResult();
    }
    
    public final ForkJoinTask<V> fork() {
        final Thread llllllllllllIlllIlIIllllIllllIII;
        if (lIIIlIlIIIIIlIlI(((llllllllllllIlllIlIIllllIllllIII = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            ((ForkJoinWorkerThread)llllllllllllIlllIlIIllllIllllIII).workQueue.push(this);
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        else {
            ForkJoinPool.common.externalPush(this);
        }
        return this;
    }
    
    public final boolean compareAndSetForkJoinTaskTag(final short llllllllllllIlllIlIIlllIlIIlIIIl, final short llllllllllllIlllIlIIlllIlIIlIIll) {
        int llllllllllllIlllIlIIlllIlIIlIllI;
        while (!lIIIlIlIIIIlIIII((short)(llllllllllllIlllIlIIlllIlIIlIllI = this.status), llllllllllllIlllIlIIlllIlIIlIIIl)) {
            if (lIIIlIlIIIIIlIlI(ForkJoinTask.U.compareAndSwapInt(this, ForkJoinTask.STATUS, llllllllllllIlllIlIIlllIlIIlIllI, (llllllllllllIlllIlIIlllIlIIlIllI & ForkJoinTask.llIIIllIIIlIll[6]) | (llllllllllllIlllIlIIlllIlIIlIIll & ForkJoinTask.llIIIllIIIlIll[7])) ? 1 : 0)) {
                return ForkJoinTask.llIIIllIIIlIll[3] != 0;
            }
        }
        return ForkJoinTask.llIIIllIIIlIll[4] != 0;
    }
    
    private static Unsafe getUnsafe() {
        try {
            return Unsafe.getUnsafe();
        }
        catch (SecurityException llllllllllllIlllIlIIlllIIlllIIlI) {
            try {
                return AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new PrivilegedExceptionAction<Unsafe>() {
                    private static final /* synthetic */ String[] llIllIlIIllIII;
                    private static final /* synthetic */ int[] llIllIlIIllIIl;
                    
                    private static void lIIlIlllllIIIIIl() {
                        (llIllIlIIllIIl = new int[3])[0] = ((153 + 122 - 95 + 52 ^ 7 + 90 - 92 + 160) & (142 + 133 - 126 + 103 ^ 9 + 26 + 117 + 25 ^ -" ".length()) & (((0xAD ^ 0x9C ^ (0xE ^ 0x63)) & (48 + 73 + 45 + 80 ^ 49 + 78 + 24 + 19 ^ -" ".length())) ^ -" ".length()));
                        ForkJoinTask$1.llIllIlIIllIIl[1] = " ".length();
                        ForkJoinTask$1.llIllIlIIllIIl[2] = "  ".length();
                    }
                    
                    private static void lIIlIlllllIIIIII() {
                        (llIllIlIIllIII = new String[ForkJoinTask$1.llIllIlIIllIIl[1]])[ForkJoinTask$1.llIllIlIIllIIl[0]] = lIIlIllllIllllll("X9ZbYnHjchusobxuE5PO+w==", "fBBSg");
                    }
                    
                    private static String lIIlIllllIllllll(final String llllllllllllIllIIllIllIllIlIlIll, final String llllllllllllIllIIllIllIllIlIlIlI) {
                        try {
                            final SecretKeySpec llllllllllllIllIIllIllIllIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIllIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                            final Cipher llllllllllllIllIIllIllIllIlIllll = Cipher.getInstance("Blowfish");
                            llllllllllllIllIIllIllIllIlIllll.init(ForkJoinTask$1.llIllIlIIllIIl[2], llllllllllllIllIIllIllIllIllIIII);
                            return new String(llllllllllllIllIIllIllIllIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIllIllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception llllllllllllIllIIllIllIllIlIlllI) {
                            llllllllllllIllIIllIllIllIlIlllI.printStackTrace();
                            return null;
                        }
                    }
                    
                    @Override
                    public Unsafe run() throws Exception {
                        final Class<Unsafe> llllllllllllIllIIllIllIllIlllllI = Unsafe.class;
                        final Field[] llllllllllllIllIIllIllIlllIIIIlI = llllllllllllIllIIllIllIllIlllllI.getDeclaredFields();
                        final int llllllllllllIllIIllIllIlllIIIIIl = llllllllllllIllIIllIllIlllIIIIlI.length;
                        int llllllllllllIllIIllIllIlllIIIIII = ForkJoinTask$1.llIllIlIIllIIl[0];
                        while (lIIlIlllllIIIIlI(llllllllllllIllIIllIllIlllIIIIII, llllllllllllIllIIllIllIlllIIIIIl)) {
                            final Field llllllllllllIllIIllIllIlllIIIIll = llllllllllllIllIIllIllIlllIIIIlI[llllllllllllIllIIllIllIlllIIIIII];
                            llllllllllllIllIIllIllIlllIIIIll.setAccessible((boolean)(ForkJoinTask$1.llIllIlIIllIIl[1] != 0));
                            final Object llllllllllllIllIIllIllIlllIIIlII = llllllllllllIllIIllIllIlllIIIIll.get(null);
                            if (lIIlIlllllIIIIll(llllllllllllIllIIllIllIllIlllllI.isInstance(llllllllllllIllIIllIllIlllIIIlII) ? 1 : 0)) {
                                return llllllllllllIllIIllIllIllIlllllI.cast(llllllllllllIllIIllIllIlllIIIlII);
                            }
                            ++llllllllllllIllIIllIllIlllIIIIII;
                            "".length();
                            if ((0xAD ^ 0xA9) == -" ".length()) {
                                return null;
                            }
                        }
                        throw new NoSuchFieldError(ForkJoinTask$1.llIllIlIIllIII[ForkJoinTask$1.llIllIlIIllIIl[0]]);
                    }
                    
                    private static boolean lIIlIlllllIIIIll(final int llllllllllllIllIIllIllIllIlIIIlI) {
                        return llllllllllllIllIIllIllIllIlIIIlI != 0;
                    }
                    
                    private static boolean lIIlIlllllIIIIlI(final int llllllllllllIllIIllIllIllIlIIlIl, final int llllllllllllIllIIllIllIllIlIIlII) {
                        return llllllllllllIllIIllIllIllIlIIlIl < llllllllllllIllIIllIllIllIlIIlII;
                    }
                    
                    static {
                        lIIlIlllllIIIIIl();
                        lIIlIlllllIIIIII();
                    }
                });
            }
            catch (PrivilegedActionException llllllllllllIlllIlIIlllIIlllIIIl) {
                throw new RuntimeException(ForkJoinTask.llIIIllIIIlIlI[ForkJoinTask.llIIIllIIIlIll[4]], llllllllllllIlllIlIIlllIIlllIIIl.getCause());
            }
        }
    }
    
    static void rethrow(final Throwable llllllllllllIlllIlIIlllllIIIIllI) {
        if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllllIIIIllI)) {
            uncheckedThrow(llllllllllllIlllIlIIlllllIIIIllI);
        }
    }
    
    private static String lIIIlIlIIIIIIlIl(String llllllllllllIlllIlIIlllIIlIIllll, final String llllllllllllIlllIlIIlllIIlIlIIll) {
        llllllllllllIlllIlIIlllIIlIIllll = new String(Base64.getDecoder().decode(llllllllllllIlllIlIIlllIIlIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIlllIIlIlIIlI = new StringBuilder();
        final char[] llllllllllllIlllIlIIlllIIlIlIIIl = llllllllllllIlllIlIIlllIIlIlIIll.toCharArray();
        int llllllllllllIlllIlIIlllIIlIlIIII = ForkJoinTask.llIIIllIIIlIll[4];
        final byte llllllllllllIlllIlIIlllIIlIIlIlI = (Object)llllllllllllIlllIlIIlllIIlIIllll.toCharArray();
        final Exception llllllllllllIlllIlIIlllIIlIIlIIl = (Exception)llllllllllllIlllIlIIlllIIlIIlIlI.length;
        short llllllllllllIlllIlIIlllIIlIIlIII = (short)ForkJoinTask.llIIIllIIIlIll[4];
        while (lIIIlIlIIIIlIIlI(llllllllllllIlllIlIIlllIIlIIlIII, (int)llllllllllllIlllIlIIlllIIlIIlIIl)) {
            final char llllllllllllIlllIlIIlllIIlIlIlIl = llllllllllllIlllIlIIlllIIlIIlIlI[llllllllllllIlllIlIIlllIIlIIlIII];
            llllllllllllIlllIlIIlllIIlIlIIlI.append((char)(llllllllllllIlllIlIIlllIIlIlIlIl ^ llllllllllllIlllIlIIlllIIlIlIIIl[llllllllllllIlllIlIIlllIIlIlIIII % llllllllllllIlllIlIIlllIIlIlIIIl.length]));
            "".length();
            ++llllllllllllIlllIlIIlllIIlIlIIII;
            ++llllllllllllIlllIlIIlllIIlIIlIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIlllIIlIlIIlI);
    }
    
    private static boolean lIIIlIlIIIIIllll(final int llllllllllllIlllIlIIlllIIlIIIlII, final int llllllllllllIlllIlIIlllIIlIIIIll) {
        return llllllllllllIlllIlIIlllIIlIIIlII == llllllllllllIlllIlIIlllIIlIIIIll;
    }
    
    private static boolean lIIIlIlIIIIIllIl(final Object llllllllllllIlllIlIIlllIIIlIlIll) {
        return llllllllllllIlllIlIIlllIIIlIlIll == null;
    }
    
    static {
        lIIIlIlIIIIIlIII();
        lIIIlIlIIIIIIlll();
        CANCELLED = ForkJoinTask.llIIIllIIIlIll[5];
        DONE_MASK = ForkJoinTask.llIIIllIIIlIll[1];
        NORMAL = ForkJoinTask.llIIIllIIIlIll[1];
        SMASK = ForkJoinTask.llIIIllIIIlIll[7];
        EXCEPTIONAL = Integer.MIN_VALUE;
        SIGNAL = ForkJoinTask.llIIIllIIIlIll[2];
        EXCEPTION_MAP_CAPACITY = ForkJoinTask.llIIIllIIIlIll[8];
        exceptionTableLock = new ReentrantLock();
        exceptionTableRefQueue = new ReferenceQueue<Object>();
        exceptionTable = new ExceptionNode[ForkJoinTask.llIIIllIIIlIll[8]];
        try {
            U = getUnsafe();
            final Class<?> llllllllllllIlllIlIIlllIIllIlllI = ForkJoinTask.class;
            STATUS = ForkJoinTask.U.objectFieldOffset(llllllllllllIlllIlIIlllIIllIlllI.getDeclaredField(ForkJoinTask.llIIIllIIIlIlI[ForkJoinTask.llIIIllIIIlIll[3]]));
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        catch (Exception llllllllllllIlllIlIIlllIIllIllIl) {
            throw new Error(llllllllllllIlllIlIIlllIIllIllIl);
        }
    }
    
    private void writeObject(final ObjectOutputStream llllllllllllIlllIlIIlllIIlllllIl) throws IOException {
        llllllllllllIlllIlIIlllIIlllllIl.defaultWriteObject();
        llllllllllllIlllIlIIlllIIlllllIl.writeObject(this.getException());
    }
    
    @Override
    public final V get(final long llllllllllllIlllIlIIlllIlllIIlIl, final TimeUnit llllllllllllIlllIlIIlllIlllIIlII) throws TimeoutException, ExecutionException, InterruptedException {
        if (lIIIlIlIIIIIlIlI(Thread.interrupted() ? 1 : 0)) {
            throw new InterruptedException();
        }
        long llllllllllllIlllIlIIlllIlllIIlll = llllllllllllIlllIlIIlllIlllIIlII.toNanos(llllllllllllIlllIlIIlllIlllIIlIl);
        int llllllllllllIlllIlIIlllIlllIlIII;
        if (lIIIlIlIIIIIlIll(llllllllllllIlllIlIIlllIlllIlIII = this.status) && lIIIlIlIIIIlIlll(lIIIlIlIIIIlIllI(llllllllllllIlllIlIIlllIlllIIlll, 0L))) {
            final long llllllllllllIlllIlIIlllIllllIIlI = System.nanoTime() + llllllllllllIlllIlIIlllIlllIIlll;
            ForkJoinPool llllllllllllIlllIlIIlllIllllIIIl = null;
            ForkJoinPool.WorkQueue llllllllllllIlllIlIIlllIllllIIII = null;
            final Thread llllllllllllIlllIlIIlllIlllIllll = Thread.currentThread();
            if (lIIIlIlIIIIIlIlI((llllllllllllIlllIlIIlllIlllIllll instanceof ForkJoinWorkerThread) ? 1 : 0)) {
                final ForkJoinWorkerThread llllllllllllIlllIlIIlllIllllIllI = (ForkJoinWorkerThread)llllllllllllIlllIlIIlllIlllIllll;
                llllllllllllIlllIlIIlllIllllIIIl = llllllllllllIlllIlIIlllIllllIllI.pool;
                llllllllllllIlllIlIIlllIllllIIII = llllllllllllIlllIlIIlllIllllIllI.workQueue;
                llllllllllllIlllIlIIlllIllllIIIl.helpJoinOnce(llllllllllllIlllIlIIlllIllllIIII, this);
                "".length();
                if (-("   ".length() ^ (0x14 ^ 0x13)) >= 0) {
                    return null;
                }
            }
            else {
                final ForkJoinPool llllllllllllIlllIlIIlllIllllIlIl;
                if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllIllllIlIl = ForkJoinPool.common)) {
                    if (lIIIlIlIIIIIlIlI((this instanceof CountedCompleter) ? 1 : 0)) {
                        llllllllllllIlllIlIIlllIllllIlIl.externalHelpComplete((CountedCompleter<?>)this);
                        "".length();
                        "".length();
                        if (-" ".length() >= 0) {
                            return null;
                        }
                    }
                    else if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIIlllIllllIlIl.tryExternalUnpush(this) ? 1 : 0)) {
                        this.doExec();
                        "".length();
                    }
                }
            }
            boolean llllllllllllIlllIlIIlllIlllIlllI = ForkJoinTask.llIIIllIIIlIll[4] != 0;
            boolean llllllllllllIlllIlIIlllIlllIllIl = ForkJoinTask.llIIIllIIIlIll[4] != 0;
            try {
                while (lIIIlIlIIIIIlIll(llllllllllllIlllIlIIlllIlllIlIII = this.status)) {
                    if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllIllllIIII) && lIIIlIlIIIIIlIIl(llllllllllllIlllIlIIlllIllllIIII.qlock)) {
                        cancelIgnoringExceptions(this);
                        "".length();
                        if (" ".length() == 0) {
                            return null;
                        }
                        continue;
                    }
                    else if (lIIIlIlIIIIlIlII(llllllllllllIlllIlIIlllIlllIlllI ? 1 : 0)) {
                        if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllIllllIIIl) && !lIIIlIlIIIIIlIlI(llllllllllllIlllIlIIlllIllllIIIl.tryCompensate(llllllllllllIlllIlIIlllIllllIIIl.ctl) ? 1 : 0)) {
                            continue;
                        }
                        llllllllllllIlllIlIIlllIlllIlllI = (ForkJoinTask.llIIIllIIIlIll[3] != 0);
                        "".length();
                        if (-" ".length() >= 0) {
                            return null;
                        }
                        continue;
                    }
                    else {
                        final long llllllllllllIlllIlIIlllIllllIIll;
                        if (lIIIlIlIIIIlIlll(lIIIlIlIIIIlIllI(llllllllllllIlllIlIIlllIllllIIll = TimeUnit.NANOSECONDS.toMillis(llllllllllllIlllIlIIlllIlllIIlll), 0L)) && lIIIlIlIIIIIlIlI(ForkJoinTask.U.compareAndSwapInt(this, ForkJoinTask.STATUS, llllllllllllIlllIlIIlllIlllIlIII, llllllllllllIlllIlIIlllIlllIlIII | ForkJoinTask.llIIIllIIIlIll[2]) ? 1 : 0)) {
                            final int llllllllllllIlllIlIIlllIllIllIIl = (int)this;
                            synchronized (this) {
                                Label_0458: {
                                    if (lIIIlIlIIIIIlIll(this.status)) {
                                        try {
                                            this.wait(llllllllllllIlllIlIIlllIllllIIll);
                                            "".length();
                                            if (" ".length() <= 0) {
                                                return null;
                                            }
                                            break Label_0458;
                                        }
                                        catch (InterruptedException llllllllllllIlllIlIIlllIllllIlII) {
                                            if (lIIIlIlIIIIIllIl(llllllllllllIlllIlIIlllIllllIIIl)) {
                                                llllllllllllIlllIlIIlllIlllIllIl = (ForkJoinTask.llIIIllIIIlIll[3] != 0);
                                            }
                                            "".length();
                                            if (-" ".length() >= "  ".length()) {
                                                return null;
                                            }
                                            break Label_0458;
                                        }
                                    }
                                    this.notifyAll();
                                }
                                // monitorexit(this)
                                "".length();
                                if (-" ".length() >= ((0x4E ^ 0x16) & ~(0xFF ^ 0xA7))) {
                                    return null;
                                }
                            }
                        }
                        if (!lIIIlIlIIIIIlIll(llllllllllllIlllIlIIlllIlllIlIII = this.status) || !lIIIlIlIIIIlIlII(llllllllllllIlllIlIIlllIlllIllIl ? 1 : 0)) {
                            break;
                        }
                        if (!lIIIlIlIIIIllIII(lIIIlIlIIIIlIllI(llllllllllllIlllIlIIlllIlllIIlll = llllllllllllIlllIlIIlllIllllIIlI - System.nanoTime(), 0L))) {
                            continue;
                        }
                        "".length();
                        if (-(1 + 125 + 33 + 3 ^ 136 + 155 - 128 + 3) > 0) {
                            return null;
                        }
                        break;
                    }
                }
                if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllIllllIIIl) && lIIIlIlIIIIIlIlI(llllllllllllIlllIlIIlllIlllIlllI ? 1 : 0)) {
                    llllllllllllIlllIlIIlllIllllIIIl.incrementActiveCount();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
            }
            finally {
                if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllIllllIIIl) && lIIIlIlIIIIIlIlI(llllllllllllIlllIlIIlllIlllIlllI ? 1 : 0)) {
                    llllllllllllIlllIlIIlllIllllIIIl.incrementActiveCount();
                }
            }
            if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIIlllIlllIllIl ? 1 : 0)) {
                throw new InterruptedException();
            }
        }
        if (lIIIlIlIIIIlIIII(llllllllllllIlllIlIIlllIlllIlIII &= ForkJoinTask.llIIIllIIIlIll[1], ForkJoinTask.llIIIllIIIlIll[1])) {
            if (lIIIlIlIIIIIllll(llllllllllllIlllIlIIlllIlllIlIII, ForkJoinTask.llIIIllIIIlIll[5])) {
                throw new CancellationException();
            }
            if (lIIIlIlIIIIlIIII(llllllllllllIlllIlIIlllIlllIlIII, Integer.MIN_VALUE)) {
                throw new TimeoutException();
            }
            final Throwable llllllllllllIlllIlIIlllIlllIllII;
            if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllIlllIllII = this.getThrowableException())) {
                throw new ExecutionException(llllllllllllIlllIlIIlllIlllIllII);
            }
        }
        return this.getRawResult();
    }
    
    private static boolean lIIIlIlIIIIllIII(final int llllllllllllIlllIlIIlllIIIlIIIIl) {
        return llllllllllllIlllIlIIlllIIIlIIIIl <= 0;
    }
    
    public final void quietlyJoin() {
        this.doJoin();
        "".length();
    }
    
    public final boolean isCompletedAbnormally() {
        int n;
        if (lIIIlIlIIIIlIIlI(this.status, ForkJoinTask.llIIIllIIIlIll[1])) {
            n = ForkJoinTask.llIIIllIIIlIll[3];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x47 ^ 0x77 ^ (0xAE ^ 0xA0)) & (0x1 ^ 0x1D ^ (0x56 ^ 0x74) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ForkJoinTask.llIIIllIIIlIll[4];
        }
        return n != 0;
    }
    
    private static boolean lIIIlIlIIIIIlllI(final Object llllllllllllIlllIlIIlllIIIlIlllI, final Object llllllllllllIlllIlIIlllIIIlIllIl) {
        return llllllllllllIlllIlIIlllIIIlIlllI == llllllllllllIlllIlIIlllIIIlIllIl;
    }
    
    private int externalAwaitDone() {
        final ForkJoinPool llllllllllllIlllIlIlIIIIIIlIlIIl = ForkJoinPool.common;
        int llllllllllllIlllIlIlIIIIIIlIlIlI;
        if (lIIIlIlIIIIIlIll(llllllllllllIlllIlIlIIIIIIlIlIlI = this.status)) {
            if (lIIIlIlIIIIIllII(llllllllllllIlllIlIlIIIIIIlIlIIl)) {
                if (lIIIlIlIIIIIlIlI((this instanceof CountedCompleter) ? 1 : 0)) {
                    llllllllllllIlllIlIlIIIIIIlIlIlI = llllllllllllIlllIlIlIIIIIIlIlIIl.externalHelpComplete((CountedCompleter<?>)this);
                    "".length();
                    if (((0x1B ^ 0x32 ^ (0x16 ^ 0x60)) & (0xA ^ 0x69 ^ (0xAF ^ 0x93) ^ -" ".length())) == -" ".length()) {
                        return (0x16 ^ 0x78 ^ (0x31 ^ 0x61)) & (0x78 ^ 0x72 ^ (0xC ^ 0x38) ^ -" ".length());
                    }
                }
                else if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIlIIIIIIlIlIIl.tryExternalUnpush(this) ? 1 : 0)) {
                    llllllllllllIlllIlIlIIIIIIlIlIlI = this.doExec();
                }
            }
            if (lIIIlIlIIIIIlIll(llllllllllllIlllIlIlIIIIIIlIlIlI) && lIIIlIlIIIIIlIll(llllllllllllIlllIlIlIIIIIIlIlIlI = this.status)) {
                boolean llllllllllllIlllIlIlIIIIIIlIllII = ForkJoinTask.llIIIllIIIlIll[4] != 0;
                do {
                    if (lIIIlIlIIIIIlIlI(ForkJoinTask.U.compareAndSwapInt(this, ForkJoinTask.STATUS, llllllllllllIlllIlIlIIIIIIlIlIlI, llllllllllllIlllIlIlIIIIIIlIlIlI | ForkJoinTask.llIIIllIIIlIll[2]) ? 1 : 0)) {
                        final double llllllllllllIlllIlIlIIIIIIlIIlII = (double)this;
                        synchronized (this) {
                            Label_0302: {
                                if (lIIIlIlIIIIIlIll(this.status)) {
                                    try {
                                        this.wait();
                                        "".length();
                                        if ("  ".length() <= 0) {
                                            return (0x88 ^ 0xAF) & ~(0x15 ^ 0x32);
                                        }
                                        break Label_0302;
                                    }
                                    catch (InterruptedException llllllllllllIlllIlIlIIIIIIlIllIl) {
                                        llllllllllllIlllIlIlIIIIIIlIllII = (ForkJoinTask.llIIIllIIIlIll[3] != 0);
                                        "".length();
                                        if (null != null) {
                                            return (0x6 ^ 0x50 ^ (0x4E ^ 0x3F)) & (123 + 43 - 77 + 65 ^ 73 + 126 - 163 + 153 ^ -" ".length());
                                        }
                                        break Label_0302;
                                    }
                                }
                                this.notifyAll();
                            }
                            // monitorexit(this)
                            "".length();
                            if (null != null) {
                                return (129 + 142 - 211 + 88 ^ 82 + 131 - 58 + 9) & (0x5 ^ 0x5D ^ (0x78 ^ 0x10) ^ -" ".length());
                            }
                            continue;
                        }
                    }
                } while (!lIIIlIlIIIIIlIIl(llllllllllllIlllIlIlIIIIIIlIlIlI = this.status));
                if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIlIIIIIIlIllII ? 1 : 0)) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return llllllllllllIlllIlIlIIIIIIlIlIlI;
    }
    
    private static int lIIIlIlIIIIlIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static void lIIIlIlIIIIIIlll() {
        (llIIIllIIIlIlI = new String[ForkJoinTask.llIIIllIIIlIll[9]])[ForkJoinTask.llIIIllIIIlIll[4]] = lIIIlIlIIIIIIlIl("DSQBDRBuJRsVVCclHRUdLycdGxFuIhoVBiclBwgXPQ==", "NKtat");
        ForkJoinTask.llIIIllIIIlIlI[ForkJoinTask.llIIIllIIIlIll[3]] = lIIIlIlIIIIIIllI("IsMArbp+u4w=", "OIxQq");
    }
    
    private static boolean lIIIlIlIIIIIlIIl(final int llllllllllllIlllIlIIlllIIIlIIIll) {
        return llllllllllllIlllIlIIlllIIIlIIIll < 0;
    }
    
    static final void helpExpungeStaleExceptions() {
        final ReentrantLock llllllllllllIlllIlIIlllllIIIlIlI = ForkJoinTask.exceptionTableLock;
        if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIIlllllIIIlIlI.tryLock() ? 1 : 0)) {
            try {
                expungeStaleExceptions();
                llllllllllllIlllIlIIlllllIIIlIlI.unlock();
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            finally {
                llllllllllllIlllIlIIlllllIIIlIlI.unlock();
            }
        }
    }
    
    private static boolean lIIIlIlIIIIIlIlI(final int llllllllllllIlllIlIIlllIIIlIlIIl) {
        return llllllllllllIlllIlIIlllIIIlIlIIl != 0;
    }
    
    private static boolean lIIIlIlIIIIlIIll(final int llllllllllllIlllIlIIlllIIIlllIII, final int llllllllllllIlllIlIIlllIIIllIlll) {
        return llllllllllllIlllIlIIlllIIIlllIII <= llllllllllllIlllIlIIlllIIIllIlll;
    }
    
    private int doInvoke() {
        final int llllllllllllIlllIlIIlllllllllllI;
        int n;
        if (lIIIlIlIIIIIlIIl(llllllllllllIlllIlIIlllllllllllI = this.doExec())) {
            n = llllllllllllIlllIlIIlllllllllllI;
            "".length();
            if ((0xB3 ^ 0xB6) == 0x0) {
                return (0x70 ^ 0x74) & ~(0xAA ^ 0xAE);
            }
        }
        else {
            final Thread llllllllllllIlllIlIlIIIIIIIIIIII;
            if (lIIIlIlIIIIIlIlI(((llllllllllllIlllIlIlIIIIIIIIIIII = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
                final ForkJoinWorkerThread llllllllllllIlllIlIlIIIIIIIIIIIl;
                n = (llllllllllllIlllIlIlIIIIIIIIIIIl = (ForkJoinWorkerThread)llllllllllllIlllIlIlIIIIIIIIIIII).pool.awaitJoin(llllllllllllIlllIlIlIIIIIIIIIIIl.workQueue, this);
                "".length();
                if ("  ".length() == (0x3A ^ 0x3E)) {
                    return (0xDF ^ 0x8D) & ~(0xC ^ 0x5E);
                }
            }
            else {
                n = this.externalAwaitDone();
            }
        }
        return n;
    }
    
    public static <T> ForkJoinTask<T> adapt(final Callable<? extends T> llllllllllllIlllIlIIlllIlIIIIIll) {
        return new AdaptedCallable<T>(llllllllllllIlllIlIIlllIlIIIIIll);
    }
    
    private static void lIIIlIlIIIIIlIII() {
        (llIIIllIIIlIll = new int[11])[0] = (0x8C ^ 0x9C);
        ForkJoinTask.llIIIllIIIlIll[1] = -(0xFFFFA7D6 & 0x10005829);
        ForkJoinTask.llIIIllIIIlIll[2] = (-(0xFFFFBB8F & 0x5CFA) & (0xFFFFF9AB & 0x11EDD));
        ForkJoinTask.llIIIllIIIlIll[3] = " ".length();
        ForkJoinTask.llIIIllIIIlIll[4] = ((0xAD ^ 0xB1 ^ (0x63 ^ 0x51)) & (159 + 110 - 195 + 110 ^ 98 + 122 - 174 + 104 ^ -" ".length()));
        ForkJoinTask.llIIIllIIIlIll[5] = -(-(0xFFFFFFBF & 0x5766) & (0xFFFFFFA5 & 0x4000577F));
        ForkJoinTask.llIIIllIIIlIll[6] = -(-(0xFFFFFDFD & 0x5FEE) & (0xFFFFFDFF & 0x15FEB));
        ForkJoinTask.llIIIllIIIlIll[7] = (-1 & 0xFFFF);
        ForkJoinTask.llIIIllIIIlIll[8] = (0x65 ^ 0x41 ^ (0x39 ^ 0x3D));
        ForkJoinTask.llIIIllIIIlIll[9] = "  ".length();
        ForkJoinTask.llIIIllIIIlIll[10] = (0xC ^ 0x4);
    }
    
    protected static ForkJoinTask<?> pollTask() {
        final Thread llllllllllllIlllIlIIlllIlIlIlIIl;
        ForkJoinTask<?> nextTask;
        if (lIIIlIlIIIIIlIlI(((llllllllllllIlllIlIIlllIlIlIlIIl = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            final ForkJoinWorkerThread llllllllllllIlllIlIIlllIlIlIlIlI;
            nextTask = (llllllllllllIlllIlIIlllIlIlIlIlI = (ForkJoinWorkerThread)llllllllllllIlllIlIIlllIlIlIlIIl).pool.nextTaskFor(llllllllllllIlllIlIIlllIlIlIlIlI.workQueue);
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        else {
            nextTask = null;
        }
        return nextTask;
    }
    
    public void completeExceptionally(final Throwable llllllllllllIlllIlIIllllIIIlllll) {
        Throwable exceptionalCompletion;
        if (!lIIIlIlIIIIlIlII((llllllllllllIlllIlIIllllIIIlllll instanceof RuntimeException) ? 1 : 0) || lIIIlIlIIIIIlIlI((llllllllllllIlllIlIIllllIIIlllll instanceof Error) ? 1 : 0)) {
            exceptionalCompletion = llllllllllllIlllIlIIllllIIIlllll;
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            exceptionalCompletion = new RuntimeException(llllllllllllIlllIlIIllllIIIlllll);
        }
        this.setExceptionalCompletion(exceptionalCompletion);
        "".length();
    }
    
    private static boolean lIIIlIlIIIIlIlll(final int llllllllllllIlllIlIIlllIIIIlllll) {
        return llllllllllllIlllIlIIlllIIIIlllll > 0;
    }
    
    final boolean trySetSignal() {
        final int llllllllllllIlllIlIlIIIIIIllIlll = this.status;
        int n;
        if (lIIIlIlIIIIIlIll(llllllllllllIlllIlIlIIIIIIllIlll) && lIIIlIlIIIIIlIlI(ForkJoinTask.U.compareAndSwapInt(this, ForkJoinTask.STATUS, llllllllllllIlllIlIlIIIIIIllIlll, llllllllllllIlllIlIlIIIIIIllIlll | ForkJoinTask.llIIIllIIIlIll[2]) ? 1 : 0)) {
            n = ForkJoinTask.llIIIllIIIlIll[3];
            "".length();
            if ("   ".length() < 0) {
                return ((0x56 ^ 0x68 ^ (0x7F ^ 0x12)) & (0x2 ^ 0x20 ^ (0x53 ^ 0x22) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ForkJoinTask.llIIIllIIIlIll[4];
        }
        return n != 0;
    }
    
    private static void expungeStaleExceptions() {
        Object llllllllllllIlllIlIIlllllIIlIlII;
        while (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllllIIlIlII = ForkJoinTask.exceptionTableRefQueue.poll())) {
            if (lIIIlIlIIIIIlIlI((llllllllllllIlllIlIIlllllIIlIlII instanceof ExceptionNode) ? 1 : 0)) {
                final ForkJoinTask<?> llllllllllllIlllIlIIlllllIIllIIl = ((ExceptionNode)llllllllllllIlllIlIIlllllIIlIlII).get();
                final ExceptionNode[] llllllllllllIlllIlIIlllllIIllIII = ForkJoinTask.exceptionTable;
                final int llllllllllllIlllIlIIlllllIIlIlll = System.identityHashCode(llllllllllllIlllIlIIlllllIIllIIl) & llllllllllllIlllIlIIlllllIIllIII.length - ForkJoinTask.llIIIllIIIlIll[3];
                ExceptionNode llllllllllllIlllIlIIlllllIIlIllI = llllllllllllIlllIlIIlllllIIllIII[llllllllllllIlllIlIIlllllIIlIlll];
                ExceptionNode llllllllllllIlllIlIIlllllIIlIlIl = null;
                while (lIIIlIlIIIIIllII(llllllllllllIlllIlIIlllllIIlIllI)) {
                    final ExceptionNode llllllllllllIlllIlIIlllllIIllIlI = llllllllllllIlllIlIIlllllIIlIllI.next;
                    if (lIIIlIlIIIIIlllI(llllllllllllIlllIlIIlllllIIlIllI, llllllllllllIlllIlIIlllllIIlIlII)) {
                        if (lIIIlIlIIIIIllIl(llllllllllllIlllIlIIlllllIIlIlIl)) {
                            llllllllllllIlllIlIIlllllIIllIII[llllllllllllIlllIlIIlllllIIlIlll] = llllllllllllIlllIlIIlllllIIllIlI;
                            "".length();
                            if (" ".length() <= ((0x3D ^ 0x66) & ~(0x75 ^ 0x2E))) {
                                return;
                            }
                            break;
                        }
                        else {
                            llllllllllllIlllIlIIlllllIIlIlIl.next = llllllllllllIlllIlIIlllllIIllIlI;
                            "".length();
                            if ("  ".length() == " ".length()) {
                                return;
                            }
                            break;
                        }
                    }
                    else {
                        llllllllllllIlllIlIIlllllIIlIlIl = llllllllllllIlllIlIIlllllIIlIllI;
                        llllllllllllIlllIlIIlllllIIlIllI = llllllllllllIlllIlIIlllllIIllIlI;
                        "".length();
                        if (((0xEA ^ 0xA5) & ~(0xCC ^ 0x83)) != 0x0) {
                            return;
                        }
                        continue;
                    }
                }
                "".length();
                if ("   ".length() < " ".length()) {
                    return;
                }
                continue;
            }
        }
    }
    
    public final void quietlyComplete() {
        this.setCompletion(ForkJoinTask.llIIIllIIIlIll[1]);
        "".length();
    }
    
    @Override
    public final boolean isDone() {
        int n;
        if (lIIIlIlIIIIIlIIl(this.status)) {
            n = ForkJoinTask.llIIIllIIIlIll[3];
            "".length();
            if (null != null) {
                return ((0x90 ^ 0xA5) & ~(0x8E ^ 0xBB)) != 0x0;
            }
        }
        else {
            n = ForkJoinTask.llIIIllIIIlIll[4];
        }
        return n != 0;
    }
    
    private static boolean lIIIlIlIIIIlIIIl(final Object llllllllllllIlllIlIIlllIIIllIlII, final Object llllllllllllIlllIlIIlllIIIllIIll) {
        return llllllllllllIlllIlIIlllIIIllIlII != llllllllllllIlllIlIIlllIIIllIIll;
    }
    
    public final Throwable getException() {
        final int llllllllllllIlllIlIIllllIIlIIlIl = this.status & ForkJoinTask.llIIIllIIIlIll[1];
        Throwable throwableException;
        if (lIIIlIlIIIIlIlIl(llllllllllllIlllIlIIllllIIlIIlIl, ForkJoinTask.llIIIllIIIlIll[1])) {
            throwableException = null;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else if (lIIIlIlIIIIIllll(llllllllllllIlllIlIIllllIIlIIlIl, ForkJoinTask.llIIIllIIIlIll[5])) {
            throwableException = new CancellationException();
            "".length();
            if (((0xA1 ^ 0x96) & ~(0x86 ^ 0xB1)) != 0x0) {
                return null;
            }
        }
        else {
            throwableException = this.getThrowableException();
        }
        return throwableException;
    }
    
    private static boolean lIIIlIlIIIIlIlIl(final int llllllllllllIlllIlIIlllIIlIIIIII, final int llllllllllllIlllIlIIlllIIIllllll) {
        return llllllllllllIlllIlIIlllIIlIIIIII >= llllllllllllIlllIlIIlllIIIllllll;
    }
    
    @Override
    public boolean cancel(final boolean llllllllllllIlllIlIIllllIIllIllI) {
        int n;
        if (lIIIlIlIIIIIllll(this.setCompletion(ForkJoinTask.llIIIllIIIlIll[5]) & ForkJoinTask.llIIIllIIIlIll[1], ForkJoinTask.llIIIllIIIlIll[5])) {
            n = ForkJoinTask.llIIIllIIIlIll[3];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0xC5 ^ 0x94) & ~(0x52 ^ 0x3)) != 0x0;
            }
        }
        else {
            n = ForkJoinTask.llIIIllIIIlIll[4];
        }
        return n != 0;
    }
    
    public final short setForkJoinTaskTag(final short llllllllllllIlllIlIIlllIlIIlllII) {
        int llllllllllllIlllIlIIlllIlIlIIIII;
        while (!lIIIlIlIIIIIlIlI(ForkJoinTask.U.compareAndSwapInt(this, ForkJoinTask.STATUS, llllllllllllIlllIlIIlllIlIlIIIII = this.status, (llllllllllllIlllIlIIlllIlIlIIIII & ForkJoinTask.llIIIllIIIlIll[6]) | (llllllllllllIlllIlIIlllIlIIlllII & ForkJoinTask.llIIIllIIIlIll[7])) ? 1 : 0)) {}
        return (short)llllllllllllIlllIlIIlllIlIlIIIII;
    }
    
    private static boolean lIIIlIlIIIIlIIlI(final int llllllllllllIlllIlIIlllIIIllllII, final int llllllllllllIlllIlIIlllIIIlllIll) {
        return llllllllllllIlllIlIIlllIIIllllII < llllllllllllIlllIlIIlllIIIlllIll;
    }
    
    public static void invokeAll(final ForkJoinTask<?> llllllllllllIlllIlIIllllIllIIIIl, final ForkJoinTask<?> llllllllllllIlllIlIIllllIllIIIII) {
        llllllllllllIlllIlIIllllIllIIIII.fork();
        "".length();
        final int llllllllllllIlllIlIIllllIllIIIll;
        if (lIIIlIlIIIIlIIII(llllllllllllIlllIlIIllllIllIIIll = (llllllllllllIlllIlIIllllIllIIIIl.doInvoke() & ForkJoinTask.llIIIllIIIlIll[1]), ForkJoinTask.llIIIllIIIlIll[1])) {
            llllllllllllIlllIlIIllllIllIIIIl.reportException(llllllllllllIlllIlIIllllIllIIIll);
        }
        final int llllllllllllIlllIlIIllllIllIIIlI;
        if (lIIIlIlIIIIlIIII(llllllllllllIlllIlIIllllIllIIIlI = (llllllllllllIlllIlIIllllIllIIIII.doJoin() & ForkJoinTask.llIIIllIIIlIll[1]), ForkJoinTask.llIIIllIIIlIll[1])) {
            llllllllllllIlllIlIIllllIllIIIII.reportException(llllllllllllIlllIlIIllllIllIIIlI);
        }
    }
    
    static <T extends Throwable> void uncheckedThrow(final Throwable llllllllllllIlllIlIIlllllIIIIIll) throws T, Throwable {
        throw llllllllllllIlllIlIIlllllIIIIIll;
    }
    
    final int recordExceptionalCompletion(final Throwable llllllllllllIlllIlIIlllllllIIlll) {
        int llllllllllllIlllIlIIlllllllIlIIl;
        if (lIIIlIlIIIIIlIll(llllllllllllIlllIlIIlllllllIlIIl = this.status)) {
            final int llllllllllllIlllIlIIlllllllIllIl = System.identityHashCode(this);
            final ReentrantLock llllllllllllIlllIlIIlllllllIllII = ForkJoinTask.exceptionTableLock;
            llllllllllllIlllIlIIlllllllIllII.lock();
            Label_0346: {
                try {
                    expungeStaleExceptions();
                    final ExceptionNode[] llllllllllllIlllIlIIlllllllIllll = ForkJoinTask.exceptionTable;
                    final int llllllllllllIlllIlIIlllllllIlllI = llllllllllllIlllIlIIlllllllIllIl & llllllllllllIlllIlIIlllllllIllll.length - ForkJoinTask.llIIIllIIIlIll[3];
                    ExceptionNode llllllllllllIlllIlIIllllllllIIII = llllllllllllIlllIlIIlllllllIllll[llllllllllllIlllIlIIlllllllIlllI];
                    while (true) {
                        while (!lIIIlIlIIIIIllIl(llllllllllllIlllIlIIllllllllIIII)) {
                            if (lIIIlIlIIIIIlllI(((Reference<Object>)llllllllllllIlllIlIIllllllllIIII).get(), this)) {
                                "".length();
                                if ("   ".length() <= -" ".length()) {
                                    return (0x70 ^ 0x78 ^ (0xA9 ^ 0xAC)) & (0x72 ^ 0x1 ^ (0xDD ^ 0xA3) ^ -" ".length());
                                }
                                llllllllllllIlllIlIIlllllllIllII.unlock();
                                "".length();
                                if (((0xCB ^ 0x90 ^ (0x5C ^ 0x17)) & (132 + 118 - 167 + 52 ^ 137 + 33 - 61 + 42 ^ -" ".length())) >= " ".length()) {
                                    return (0xFC ^ 0xAB ^ (0x15 ^ 0x4F)) & (0x9D ^ 0xAC ^ (0x8E ^ 0xB2) ^ -" ".length());
                                }
                                break Label_0346;
                            }
                            else {
                                llllllllllllIlllIlIIllllllllIIII = llllllllllllIlllIlIIllllllllIIII.next;
                                "".length();
                                if (-" ".length() >= 0) {
                                    return (0x8E ^ 0xA9) & ~(0x28 ^ 0xF);
                                }
                                continue;
                            }
                        }
                        llllllllllllIlllIlIIlllllllIllll[llllllllllllIlllIlIIlllllllIlllI] = new ExceptionNode(this, llllllllllllIlllIlIIlllllllIIlll, llllllllllllIlllIlIIlllllllIllll[llllllllllllIlllIlIIlllllllIlllI]);
                        "".length();
                        if (((0x69 ^ 0x77) & ~(0x34 ^ 0x2A)) > "   ".length()) {
                            return (0xDA ^ 0x93) & ~(0xF1 ^ 0xB8);
                        }
                        continue;
                    }
                }
                finally {
                    llllllllllllIlllIlIIlllllllIllII.unlock();
                }
            }
            llllllllllllIlllIlIIlllllllIlIIl = this.setCompletion(Integer.MIN_VALUE);
        }
        return llllllllllllIlllIlIIlllllllIlIIl;
    }
    
    public static void invokeAll(final ForkJoinTask<?>... llllllllllllIlllIlIIllllIlIlIIIl) {
        Throwable llllllllllllIlllIlIIllllIlIlIIll = null;
        int llllllllllllIlllIlIIllllIlIlIlll;
        final int llllllllllllIlllIlIIllllIlIlIIlI = llllllllllllIlllIlIIllllIlIlIlll = llllllllllllIlllIlIIllllIlIlIIIl.length - ForkJoinTask.llIIIllIIIlIll[3];
        while (lIIIlIlIIIIIlIll(llllllllllllIlllIlIIllllIlIlIlll)) {
            final ForkJoinTask<?> llllllllllllIlllIlIIllllIlIllIII = llllllllllllIlllIlIIllllIlIlIIIl[llllllllllllIlllIlIIllllIlIlIlll];
            if (lIIIlIlIIIIIllIl(llllllllllllIlllIlIIllllIlIllIII)) {
                if (lIIIlIlIIIIIllIl(llllllllllllIlllIlIIllllIlIlIIll)) {
                    llllllllllllIlllIlIIllllIlIlIIll = new NullPointerException();
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
            }
            else if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIIllllIlIlIlll)) {
                llllllllllllIlllIlIIllllIlIllIII.fork();
                "".length();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else if (lIIIlIlIIIIlIIlI(llllllllllllIlllIlIIllllIlIllIII.doInvoke(), ForkJoinTask.llIIIllIIIlIll[1]) && lIIIlIlIIIIIllIl(llllllllllllIlllIlIIllllIlIlIIll)) {
                llllllllllllIlllIlIIllllIlIlIIll = llllllllllllIlllIlIIllllIlIllIII.getException();
            }
            --llllllllllllIlllIlIIllllIlIlIlll;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        int llllllllllllIlllIlIIllllIlIlIlIl = ForkJoinTask.llIIIllIIIlIll[3];
        while (lIIIlIlIIIIlIIll(llllllllllllIlllIlIIllllIlIlIlIl, llllllllllllIlllIlIIllllIlIlIIlI)) {
            final ForkJoinTask<?> llllllllllllIlllIlIIllllIlIlIllI = llllllllllllIlllIlIIllllIlIlIIIl[llllllllllllIlllIlIIllllIlIlIlIl];
            if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIllllIlIlIllI)) {
                if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIllllIlIlIIll)) {
                    llllllllllllIlllIlIIllllIlIlIllI.cancel((boolean)(ForkJoinTask.llIIIllIIIlIll[4] != 0));
                    "".length();
                    "".length();
                    if ((0x51 ^ 0x55) < "  ".length()) {
                        return;
                    }
                }
                else if (lIIIlIlIIIIlIIlI(llllllllllllIlllIlIIllllIlIlIllI.doJoin(), ForkJoinTask.llIIIllIIIlIll[1])) {
                    llllllllllllIlllIlIIllllIlIlIIll = llllllllllllIlllIlIIllllIlIlIllI.getException();
                }
            }
            ++llllllllllllIlllIlIIllllIlIlIlIl;
            "".length();
            if (null != null) {
                return;
            }
        }
        if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIllllIlIlIIll)) {
            rethrow(llllllllllllIlllIlIIllllIlIlIIll);
        }
    }
    
    private int setExceptionalCompletion(final Throwable llllllllllllIlllIlIIllllllIllIII) {
        final int llllllllllllIlllIlIIllllllIllIlI = this.recordExceptionalCompletion(llllllllllllIlllIlIIllllllIllIII);
        if (lIIIlIlIIIIIllll(llllllllllllIlllIlIIllllllIllIlI & ForkJoinTask.llIIIllIIIlIll[1], Integer.MIN_VALUE)) {
            this.internalPropagateException(llllllllllllIlllIlIIllllllIllIII);
        }
        return llllllllllllIlllIlIIllllllIllIlI;
    }
    
    final int doExec() {
        int llllllllllllIlllIlIlIIIIIIllllll;
        if (lIIIlIlIIIIIlIll(llllllllllllIlllIlIlIIIIIIllllll = this.status)) {
            boolean llllllllllllIlllIlIlIIIIIlIIIIIl;
            try {
                llllllllllllIlllIlIlIIIIIlIIIIIl = this.exec();
                "".length();
                if (((176 + 90 - 83 + 35 ^ 62 + 103 - 26 + 2) & (0xB2 ^ 0x92 ^ (0x51 ^ 0x26) ^ -" ".length())) != 0x0) {
                    return (47 + 27 + 6 + 67 ^ 176 + 133 - 195 + 63) & (6 + 122 + 58 + 1 ^ 143 + 78 - 108 + 40 ^ -" ".length());
                }
            }
            catch (Throwable llllllllllllIlllIlIlIIIIIlIIIIlI) {
                return this.setExceptionalCompletion(llllllllllllIlllIlIlIIIIIlIIIIlI);
            }
            if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIlIIIIIlIIIIIl ? 1 : 0)) {
                llllllllllllIlllIlIlIIIIIIllllll = this.setCompletion(ForkJoinTask.llIIIllIIIlIll[1]);
            }
        }
        return llllllllllllIlllIlIlIIIIIIllllll;
    }
    
    public static ForkJoinTask<?> adapt(final Runnable llllllllllllIlllIlIIlllIlIIIllII) {
        return new AdaptedRunnableAction(llllllllllllIlllIlIIlllIlIIIllII);
    }
    
    public static <T extends ForkJoinTask<?>> Collection<T> invokeAll(final Collection<T> llllllllllllIlllIlIIllllIIlllllI) {
        if (!lIIIlIlIIIIIlIlI((llllllllllllIlllIlIIllllIIlllllI instanceof RandomAccess) ? 1 : 0) || lIIIlIlIIIIlIlII((llllllllllllIlllIlIIllllIIlllllI instanceof List) ? 1 : 0)) {
            invokeAll((ForkJoinTask<?>[])llllllllllllIlllIlIIllllIIlllllI.toArray(new ForkJoinTask[llllllllllllIlllIlIIllllIIlllllI.size()]));
            return llllllllllllIlllIlIIllllIIlllllI;
        }
        final List<? extends ForkJoinTask<?>> llllllllllllIlllIlIIllllIlIIIIIl = (List<? extends ForkJoinTask<?>>)(List)llllllllllllIlllIlIIllllIIlllllI;
        Throwable llllllllllllIlllIlIIllllIlIIIIII = null;
        int llllllllllllIlllIlIIllllIlIIIlIl;
        final int llllllllllllIlllIlIIllllIIllllll = llllllllllllIlllIlIIllllIlIIIlIl = llllllllllllIlllIlIIllllIlIIIIIl.size() - ForkJoinTask.llIIIllIIIlIll[3];
        while (lIIIlIlIIIIIlIll(llllllllllllIlllIlIIllllIlIIIlIl)) {
            final ForkJoinTask<?> llllllllllllIlllIlIIllllIlIIIllI = (ForkJoinTask<?>)llllllllllllIlllIlIIllllIlIIIIIl.get(llllllllllllIlllIlIIllllIlIIIlIl);
            if (lIIIlIlIIIIIllIl(llllllllllllIlllIlIIllllIlIIIllI)) {
                if (lIIIlIlIIIIIllIl(llllllllllllIlllIlIIllllIlIIIIII)) {
                    llllllllllllIlllIlIIllllIlIIIIII = new NullPointerException();
                    "".length();
                    if (((0x60 ^ 0x68) & ~(0x71 ^ 0x79)) != ((0x96 ^ 0xBE) & ~(0x7F ^ 0x57))) {
                        return null;
                    }
                }
            }
            else if (lIIIlIlIIIIIlIlI(llllllllllllIlllIlIIllllIlIIIlIl)) {
                llllllllllllIlllIlIIllllIlIIIllI.fork();
                "".length();
                "".length();
                if ((0x6C ^ 0x68) == 0x0) {
                    return null;
                }
            }
            else if (lIIIlIlIIIIlIIlI(llllllllllllIlllIlIIllllIlIIIllI.doInvoke(), ForkJoinTask.llIIIllIIIlIll[1]) && lIIIlIlIIIIIllIl(llllllllllllIlllIlIIllllIlIIIIII)) {
                llllllllllllIlllIlIIllllIlIIIIII = llllllllllllIlllIlIIllllIlIIIllI.getException();
            }
            --llllllllllllIlllIlIIllllIlIIIlIl;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        int llllllllllllIlllIlIIllllIlIIIIll = ForkJoinTask.llIIIllIIIlIll[3];
        while (lIIIlIlIIIIlIIll(llllllllllllIlllIlIIllllIlIIIIll, llllllllllllIlllIlIIllllIIllllll)) {
            final ForkJoinTask<?> llllllllllllIlllIlIIllllIlIIIlII = (ForkJoinTask<?>)llllllllllllIlllIlIIllllIlIIIIIl.get(llllllllllllIlllIlIIllllIlIIIIll);
            if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIllllIlIIIlII)) {
                if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIllllIlIIIIII)) {
                    llllllllllllIlllIlIIllllIlIIIlII.cancel((boolean)(ForkJoinTask.llIIIllIIIlIll[4] != 0));
                    "".length();
                    "".length();
                    if (" ".length() > " ".length()) {
                        return null;
                    }
                }
                else if (lIIIlIlIIIIlIIlI(llllllllllllIlllIlIIllllIlIIIlII.doJoin(), ForkJoinTask.llIIIllIIIlIll[1])) {
                    llllllllllllIlllIlIIllllIlIIIIII = llllllllllllIlllIlIIllllIlIIIlII.getException();
                }
            }
            ++llllllllllllIlllIlIIllllIlIIIIll;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        if (lIIIlIlIIIIIllII(llllllllllllIlllIlIIllllIlIIIIII)) {
            rethrow(llllllllllllIlllIlIIllllIlIIIIII);
        }
        return llllllllllllIlllIlIIllllIIlllllI;
    }
    
    public final void quietlyInvoke() {
        this.doInvoke();
        "".length();
    }
    
    public final V join() {
        final int llllllllllllIlllIlIIllllIlllIIlI;
        if (lIIIlIlIIIIlIIII(llllllllllllIlllIlIIllllIlllIIlI = (this.doJoin() & ForkJoinTask.llIIIllIIIlIll[1]), ForkJoinTask.llIIIllIIIlIll[1])) {
            this.reportException(llllllllllllIlllIlIIllllIlllIIlI);
        }
        return this.getRawResult();
    }
    
    public void reinitialize() {
        if (lIIIlIlIIIIIllll(this.status & ForkJoinTask.llIIIllIIIlIll[1], Integer.MIN_VALUE)) {
            this.clearExceptionalCompletion();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.status = ForkJoinTask.llIIIllIIIlIll[4];
        }
    }
    
    protected abstract boolean exec();
    
    public static ForkJoinPool getPool() {
        final Thread llllllllllllIlllIlIIlllIllIIIlIl = Thread.currentThread();
        ForkJoinPool pool;
        if (lIIIlIlIIIIIlIlI((llllllllllllIlllIlIIlllIllIIIlIl instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            pool = ((ForkJoinWorkerThread)llllllllllllIlllIlIIlllIllIIIlIl).pool;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else {
            pool = null;
        }
        return pool;
    }
    
    public final boolean isCompletedNormally() {
        int n;
        if (lIIIlIlIIIIIllll(this.status & ForkJoinTask.llIIIllIIIlIll[1], ForkJoinTask.llIIIllIIIlIll[1])) {
            n = ForkJoinTask.llIIIllIIIlIll[3];
            "".length();
            if (null != null) {
                return ((4 + 137 + 67 + 46 ^ 84 + 65 - 56 + 100) & (0x63 ^ 0x70 ^ (0xB1 ^ 0x9D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ForkJoinTask.llIIIllIIIlIll[4];
        }
        return n != 0;
    }
    
    public static int getSurplusQueuedTaskCount() {
        return ForkJoinPool.getSurplusQueuedTaskCount();
    }
    
    public static int getQueuedTaskCount() {
        final Thread llllllllllllIlllIlIIlllIlIlllIlI;
        ForkJoinPool.WorkQueue llllllllllllIlllIlIIlllIlIlllIIl = null;
        if (lIIIlIlIIIIIlIlI(((llllllllllllIlllIlIIlllIlIlllIlI = Thread.currentThread()) instanceof ForkJoinWorkerThread) ? 1 : 0)) {
            final ForkJoinPool.WorkQueue llllllllllllIlllIlIIlllIlIlllIll = ((ForkJoinWorkerThread)llllllllllllIlllIlIIlllIlIlllIlI).workQueue;
            "".length();
            if ("  ".length() == 0) {
                return " ".length() & (" ".length() ^ -" ".length());
            }
        }
        else {
            llllllllllllIlllIlIIlllIlIlllIIl = ForkJoinPool.commonSubmitterQueue();
        }
        int queueSize;
        if (lIIIlIlIIIIIllIl(llllllllllllIlllIlIIlllIlIlllIIl)) {
            queueSize = ForkJoinTask.llIIIllIIIlIll[4];
            "".length();
            if (-(0xB6 ^ 0xB3) >= 0) {
                return (0x41 ^ 0x5A) & ~(0x18 ^ 0x3);
            }
        }
        else {
            queueSize = llllllllllllIlllIlIIlllIlIlllIIl.queueSize();
        }
        return queueSize;
    }
    
    private void reportException(final int llllllllllllIlllIlIIllllIllllllI) {
        if (lIIIlIlIIIIIllll(llllllllllllIlllIlIIllllIllllllI, ForkJoinTask.llIIIllIIIlIll[5])) {
            throw new CancellationException();
        }
        if (lIIIlIlIIIIIllll(llllllllllllIlllIlIIllllIllllllI, Integer.MIN_VALUE)) {
            rethrow(this.getThrowableException());
        }
    }
    
    static final class RunnableExecuteAction extends ForkJoinTask<Void>
    {
        final /* synthetic */ Runnable runnable;
        private static final /* synthetic */ int[] lllIllllllIIIl;
        
        RunnableExecuteAction(final Runnable llllllllllllIlIlIlllllIIIIlIIIII) {
            if (lIlIIllIIIlllIll(llllllllllllIlIlIlllllIIIIlIIIII)) {
                throw new NullPointerException();
            }
            this.runnable = llllllllllllIlIlIlllllIIIIlIIIII;
        }
        
        public final void setRawResult(final Void llllllllllllIlIlIlllllIIIIIlllIl) {
        }
        
        @Override
        void internalPropagateException(final Throwable llllllllllllIlIlIlllllIIIIIlIllI) {
            ForkJoinTask.rethrow(llllllllllllIlIlIlllllIIIIIlIllI);
        }
        
        static {
            lIlIIllIIIlllIlI();
        }
        
        public final boolean exec() {
            this.runnable.run();
            return RunnableExecuteAction.lllIllllllIIIl[0] != 0;
        }
        
        private static void lIlIIllIIIlllIlI() {
            (lllIllllllIIIl = new int[1])[0] = " ".length();
        }
        
        private static boolean lIlIIllIIIlllIll(final Object llllllllllllIlIlIlllllIIIIIIlIll) {
            return llllllllllllIlIlIlllllIIIIIIlIll == null;
        }
        
        @Override
        public final Void getRawResult() {
            return null;
        }
    }
    
    static final class AdaptedCallable<T> extends ForkJoinTask<T> implements RunnableFuture<T>
    {
        private static final /* synthetic */ int[] lIlIlIlIIllIlI;
        final /* synthetic */ Callable<? extends T> callable;
        /* synthetic */ T result;
        
        private static void lllIlllIIIIlllI() {
            (lIlIlIlIIllIlI = new int[1])[0] = " ".length();
        }
        
        @Override
        public final void run() {
            this.invoke();
            "".length();
        }
        
        static {
            lllIlllIIIIlllI();
        }
        
        @Override
        public final T getRawResult() {
            return this.result;
        }
        
        AdaptedCallable(final Callable<? extends T> lllllllllllllIIIlIIIIllIIlIIIlll) {
            if (lllIlllIIIIllll(lllllllllllllIIIlIIIIllIIlIIIlll)) {
                throw new NullPointerException();
            }
            this.callable = lllllllllllllIIIlIIIIllIIlIIIlll;
        }
        
        public final boolean exec() {
            try {
                this.result = (T)this.callable.call();
                return AdaptedCallable.lIlIlIlIIllIlI[0] != 0;
            }
            catch (Error lllllllllllllIIIlIIIIllIIIlllIll) {
                throw lllllllllllllIIIlIIIIllIIIlllIll;
            }
            catch (RuntimeException lllllllllllllIIIlIIIIllIIIlllIlI) {
                throw lllllllllllllIIIlIIIIllIIIlllIlI;
            }
            catch (Exception lllllllllllllIIIlIIIIllIIIlllIIl) {
                throw new RuntimeException(lllllllllllllIIIlIIIIllIIIlllIIl);
            }
        }
        
        public final void setRawResult(final T lllllllllllllIIIlIIIIllIIIlllllI) {
            this.result = lllllllllllllIIIlIIIIllIIIlllllI;
        }
        
        private static boolean lllIlllIIIIllll(final Object lllllllllllllIIIlIIIIllIIIllIIIl) {
            return lllllllllllllIIIlIIIIllIIIllIIIl == null;
        }
    }
    
    static final class AdaptedRunnable<T> extends ForkJoinTask<T> implements RunnableFuture<T>
    {
        /* synthetic */ T result;
        private static final /* synthetic */ int[] lIIlIIIlIlIIlI;
        final /* synthetic */ Runnable runnable;
        
        static {
            llIIlIlIllIllII();
        }
        
        @Override
        public final void run() {
            this.invoke();
            "".length();
        }
        
        private static void llIIlIlIllIllII() {
            (lIIlIIIlIlIIlI = new int[1])[0] = " ".length();
        }
        
        private static boolean llIIlIlIllIllIl(final Object lllllllllllllIIlllIIllIllIlIIllI) {
            return lllllllllllllIIlllIIllIllIlIIllI == null;
        }
        
        @Override
        public final T getRawResult() {
            return this.result;
        }
        
        public final void setRawResult(final T lllllllllllllIIlllIIllIllIllIIII) {
            this.result = lllllllllllllIIlllIIllIllIllIIII;
        }
        
        public final boolean exec() {
            this.runnable.run();
            return AdaptedRunnable.lIIlIIIlIlIIlI[0] != 0;
        }
        
        AdaptedRunnable(final Runnable lllllllllllllIIlllIIllIllIlllIll, final T lllllllllllllIIlllIIllIllIllIlll) {
            if (llIIlIlIllIllIl(lllllllllllllIIlllIIllIllIlllIll)) {
                throw new NullPointerException();
            }
            this.runnable = lllllllllllllIIlllIIllIllIlllIll;
            this.result = lllllllllllllIIlllIIllIllIllIlll;
        }
    }
    
    static final class AdaptedRunnableAction extends ForkJoinTask<Void> implements RunnableFuture<Void>
    {
        private static final /* synthetic */ int[] lllIIlIlIllIIl;
        final /* synthetic */ Runnable runnable;
        
        private static void lIIllllllIlIlIII() {
            (lllIIlIlIllIIl = new int[1])[0] = " ".length();
        }
        
        AdaptedRunnableAction(final Runnable llllllllllllIlIllllIlIIIIIlllIII) {
            if (lIIllllllIlIlIIl(llllllllllllIlIllllIlIIIIIlllIII)) {
                throw new NullPointerException();
            }
            this.runnable = llllllllllllIlIllllIlIIIIIlllIII;
        }
        
        public final boolean exec() {
            this.runnable.run();
            return AdaptedRunnableAction.lllIIlIlIllIIl[0] != 0;
        }
        
        @Override
        public final Void getRawResult() {
            return null;
        }
        
        @Override
        public final void run() {
            this.invoke();
            "".length();
        }
        
        private static boolean lIIllllllIlIlIIl(final Object llllllllllllIlIllllIlIIIIIlIIIlI) {
            return llllllllllllIlIllllIlIIIIIlIIIlI == null;
        }
        
        static {
            lIIllllllIlIlIII();
        }
        
        public final void setRawResult(final Void llllllllllllIlIllllIlIIIIIllIIll) {
        }
    }
    
    static final class ExceptionNode extends WeakReference<ForkJoinTask<?>>
    {
        /* synthetic */ ExceptionNode next;
        final /* synthetic */ Throwable ex;
        final /* synthetic */ long thrower;
        
        ExceptionNode(final ForkJoinTask<?> llllllllllllIlIllIlllllIIllIlIll, final Throwable llllllllllllIlIllIlllllIIllIlllI, final ExceptionNode llllllllllllIlIllIlllllIIllIllIl) {
            super(llllllllllllIlIllIlllllIIllIlIll, ForkJoinTask.exceptionTableRefQueue);
            this.ex = llllllllllllIlIllIlllllIIllIlllI;
            this.next = llllllllllllIlIllIlllllIIllIllIl;
            this.thrower = Thread.currentThread().getId();
        }
    }
}
