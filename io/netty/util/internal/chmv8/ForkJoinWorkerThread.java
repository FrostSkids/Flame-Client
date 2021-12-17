// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal.chmv8;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ForkJoinWorkerThread extends Thread
{
    final /* synthetic */ ForkJoinPool.WorkQueue workQueue;
    final /* synthetic */ ForkJoinPool pool;
    private static final /* synthetic */ String[] llIIllIIIlIIlI;
    private static final /* synthetic */ int[] llIIllIIIlIIll;
    
    protected void onTermination(final Throwable llllllllllllIlllIIIIlIIlIlIlIIII) {
    }
    
    static {
        lIIIlllIIlIllllI();
        lIIIlllIIlIlllIl();
    }
    
    private static String lIIIlllIIlIlllII(final String llllllllllllIlllIIIIlIIlIIllIIII, final String llllllllllllIlllIIIIlIIlIIlIllll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIlIIlIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIlIIlIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIlIIlIIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIlIIlIIllIlII.init(ForkJoinWorkerThread.llIIllIIIlIIll[2], llllllllllllIlllIIIIlIIlIIllIlIl);
            return new String(llllllllllllIlllIIIIlIIlIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIlIIlIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIlIIlIIllIIll) {
            llllllllllllIlllIIIIlIIlIIllIIll.printStackTrace();
            return null;
        }
    }
    
    public ForkJoinPool getPool() {
        return this.pool;
    }
    
    protected void onStart() {
    }
    
    private static boolean lIIIlllIIlIlllll(final Object llllllllllllIlllIIIIlIIlIIlIlIll) {
        return llllllllllllIlllIIIIlIIlIIlIlIll == null;
    }
    
    protected ForkJoinWorkerThread(final ForkJoinPool llllllllllllIlllIIIIlIIlIlIllIIl) {
        super(ForkJoinWorkerThread.llIIllIIIlIIlI[ForkJoinWorkerThread.llIIllIIIlIIll[0]]);
        this.pool = llllllllllllIlllIIIIlIIlIlIllIIl;
        this.workQueue = llllllllllllIlllIIIIlIIlIlIllIIl.registerWorker(this);
    }
    
    private static void lIIIlllIIlIllllI() {
        (llIIllIIIlIIll = new int[3])[0] = ((0x80 ^ 0xC0) & ~(0x60 ^ 0x20));
        ForkJoinWorkerThread.llIIllIIIlIIll[1] = " ".length();
        ForkJoinWorkerThread.llIIllIIIlIIll[2] = "  ".length();
    }
    
    private static void lIIIlllIIlIlllIl() {
        (llIIllIIIlIIlI = new String[ForkJoinWorkerThread.llIIllIIIlIIll[1]])[ForkJoinWorkerThread.llIIllIIIlIIll[0]] = lIIIlllIIlIlllII("5+lSt+VmTIWd8+iYGzYtSXw/f0tuEqrB", "HBjrD");
    }
    
    public int getPoolIndex() {
        return this.workQueue.poolIndex >>> ForkJoinWorkerThread.llIIllIIIlIIll[1];
    }
    
    @Override
    public void run() {
        Throwable llllllllllllIlllIIIIlIIlIlIIIIlI = null;
        try {
            this.onStart();
            this.pool.runWorker(this.workQueue);
            try {
                this.onTermination(llllllllllllIlllIIIIlIIlIlIIIIlI);
                this.pool.deregisterWorker(this, llllllllllllIlllIIIIlIIlIlIIIIlI);
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Throwable llllllllllllIlllIIIIlIIlIlIIIlll) {
                if (lIIIlllIIlIlllll(llllllllllllIlllIIIIlIIlIlIIIIlI)) {
                    llllllllllllIlllIIIIlIIlIlIIIIlI = llllllllllllIlllIIIIlIIlIlIIIlll;
                }
                this.pool.deregisterWorker(this, llllllllllllIlllIIIIlIIlIlIIIIlI);
                "".length();
                if ((84 + 37 + 20 + 17 ^ 13 + 61 + 58 + 23) == 0x0) {
                    return;
                }
            }
            finally {
                this.pool.deregisterWorker(this, llllllllllllIlllIIIIlIIlIlIIIIlI);
            }
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllIIIIlIIlIlIIIllI) {
            llllllllllllIlllIIIIlIIlIlIIIIlI = llllllllllllIlllIIIIlIIlIlIIIllI;
            try {
                this.onTermination(llllllllllllIlllIIIIlIIlIlIIIIlI);
                this.pool.deregisterWorker(this, llllllllllllIlllIIIIlIIlIlIIIIlI);
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIlllIIIIlIIlIlIIIlIl) {
                if (lIIIlllIIlIlllll(llllllllllllIlllIIIIlIIlIlIIIIlI)) {
                    llllllllllllIlllIIIIlIIlIlIIIIlI = llllllllllllIlllIIIIlIIlIlIIIlIl;
                }
                this.pool.deregisterWorker(this, llllllllllllIlllIIIIlIIlIlIIIIlI);
                "".length();
                if (((140 + 161 - 168 + 36 ^ 18 + 26 - 6 + 129) & (0x1B ^ 0x2B ^ (0x69 ^ 0x57) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            finally {
                this.pool.deregisterWorker(this, llllllllllllIlllIIIIlIIlIlIIIIlI);
            }
            "".length();
            if (((0x1F ^ 0x7F ^ (0x11 ^ 0x27)) & (0xED ^ 0x90 ^ (0x76 ^ 0x5D) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        finally {
            try {
                this.onTermination(llllllllllllIlllIIIIlIIlIlIIIIlI);
                this.pool.deregisterWorker(this, llllllllllllIlllIIIIlIIlIlIIIIlI);
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Throwable llllllllllllIlllIIIIlIIlIlIIIlII) {
                if (lIIIlllIIlIlllll(llllllllllllIlllIIIIlIIlIlIIIIlI)) {
                    llllllllllllIlllIIIIlIIlIlIIIIlI = llllllllllllIlllIIIIlIIlIlIIIlII;
                }
                this.pool.deregisterWorker(this, llllllllllllIlllIIIIlIIlIlIIIIlI);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            finally {
                this.pool.deregisterWorker(this, llllllllllllIlllIIIIlIIlIlIIIIlI);
            }
        }
    }
}
