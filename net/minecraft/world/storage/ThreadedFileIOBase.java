// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Collections;
import com.google.common.collect.Lists;
import java.util.List;

public class ThreadedFileIOBase implements Runnable
{
    private /* synthetic */ List<IThreadedFileIO> threadedIOQueue;
    private volatile /* synthetic */ boolean isThreadWaiting;
    private volatile /* synthetic */ long writeQueuedCounter;
    private static final /* synthetic */ ThreadedFileIOBase threadedIOInstance;
    private static final /* synthetic */ String[] lIlllIlIlIlIlI;
    private volatile /* synthetic */ long savedIOCounter;
    private static final /* synthetic */ int[] lIlllIlIlIlIll;
    
    private void processQueue() {
        int llllllllllllIlllllIIIIIIlIlIIlIl = ThreadedFileIOBase.lIlllIlIlIlIll[0];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lIIIIIlIllIIllll(llllllllllllIlllllIIIIIIlIlIIlIl, this.threadedIOQueue.size())) {
            final IThreadedFileIO llllllllllllIlllllIIIIIIlIlIIlII = this.threadedIOQueue.get(llllllllllllIlllllIIIIIIlIlIIlIl);
            final boolean llllllllllllIlllllIIIIIIlIlIIIll = llllllllllllIlllllIIIIIIlIlIIlII.writeNextIO();
            if (lIIIIIlIllIIllIl(llllllllllllIlllllIIIIIIlIlIIIll ? 1 : 0)) {
                this.threadedIOQueue.remove(llllllllllllIlllllIIIIIIlIlIIlIl--);
                "".length();
                ++this.savedIOCounter;
            }
            try {
                long n;
                if (lIIIIIlIllIIlllI(this.isThreadWaiting ? 1 : 0)) {
                    n = 0L;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    n = 10L;
                }
                Thread.sleep(n);
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            catch (InterruptedException llllllllllllIlllllIIIIIIlIlIIIlI) {
                llllllllllllIlllllIIIIIIlIlIIIlI.printStackTrace();
            }
            ++llllllllllllIlllllIIIIIIlIlIIlIl;
        }
        if (lIIIIIlIllIIlllI(this.threadedIOQueue.isEmpty() ? 1 : 0)) {
            try {
                Thread.sleep(25L);
                "".length();
                if (-(0x15 ^ 0x1B ^ (0xCD ^ 0xC7)) >= 0) {
                    return;
                }
            }
            catch (InterruptedException llllllllllllIlllllIIIIIIlIlIIIIl) {
                llllllllllllIlllllIIIIIIlIlIIIIl.printStackTrace();
            }
        }
    }
    
    private ThreadedFileIOBase() {
        this.threadedIOQueue = Collections.synchronizedList((List<IThreadedFileIO>)Lists.newArrayList());
        final Thread llllllllllllIlllllIIIIIIlIllIIIl = new Thread(this, ThreadedFileIOBase.lIlllIlIlIlIlI[ThreadedFileIOBase.lIlllIlIlIlIll[0]]);
        llllllllllllIlllllIIIIIIlIllIIIl.setPriority(ThreadedFileIOBase.lIlllIlIlIlIll[1]);
        llllllllllllIlllllIIIIIIlIllIIIl.start();
    }
    
    private static void lIIIIIlIllIIlIlI() {
        (lIlllIlIlIlIlI = new String[ThreadedFileIOBase.lIlllIlIlIlIll[1]])[ThreadedFileIOBase.lIlllIlIlIlIll[0]] = lIIIIIlIllIIlIIl("JVlRhT2sIfsWE12EsCR4UQ==", "jAadR");
    }
    
    private static boolean lIIIIIlIllIIlllI(final int llllllllllllIlllllIIIIIIlIIIIIII) {
        return llllllllllllIlllllIIIIIIlIIIIIII != 0;
    }
    
    private static void lIIIIIlIllIIllII() {
        (lIlllIlIlIlIll = new int[4])[0] = ((121 + 57 - 117 + 74 ^ 73 + 18 + 24 + 63) & (0x2 ^ 0x56 ^ (0x40 ^ 0x21) ^ -" ".length()));
        ThreadedFileIOBase.lIlllIlIlIlIll[1] = " ".length();
        ThreadedFileIOBase.lIlllIlIlIlIll[2] = (0x28 ^ 0x20);
        ThreadedFileIOBase.lIlllIlIlIlIll[3] = "  ".length();
    }
    
    static {
        lIIIIIlIllIIllII();
        lIIIIIlIllIIlIlI();
        threadedIOInstance = new ThreadedFileIOBase();
    }
    
    private static boolean lIIIIIlIllIIllll(final int llllllllllllIlllllIIIIIIlIIIIIll, final int llllllllllllIlllllIIIIIIlIIIIIlI) {
        return llllllllllllIlllllIIIIIIlIIIIIll >= llllllllllllIlllllIIIIIIlIIIIIlI;
    }
    
    private static boolean lIIIIIlIllIIllIl(final int llllllllllllIlllllIIIIIIIllllllI) {
        return llllllllllllIlllllIIIIIIIllllllI == 0;
    }
    
    private static String lIIIIIlIllIIlIIl(final String llllllllllllIlllllIIIIIIlIIIlIIl, final String llllllllllllIlllllIIIIIIlIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIIIIlIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIIIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), ThreadedFileIOBase.lIlllIlIlIlIll[2]), "DES");
            final Cipher llllllllllllIlllllIIIIIIlIIIllIl = Cipher.getInstance("DES");
            llllllllllllIlllllIIIIIIlIIIllIl.init(ThreadedFileIOBase.lIlllIlIlIlIll[3], llllllllllllIlllllIIIIIIlIIIlllI);
            return new String(llllllllllllIlllllIIIIIIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIIIIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIIIIlIIIllII) {
            llllllllllllIlllllIIIIIIlIIIllII.printStackTrace();
            return null;
        }
    }
    
    public void waitForFinish() throws InterruptedException {
        this.isThreadWaiting = (ThreadedFileIOBase.lIlllIlIlIlIll[1] != 0);
        "".length();
        if (" ".length() >= "   ".length()) {
            return;
        }
        while (!lIIIIIlIllIIllIl(lIIIIIlIllIlIIII(this.writeQueuedCounter, this.savedIOCounter))) {
            Thread.sleep(10L);
        }
        this.isThreadWaiting = (ThreadedFileIOBase.lIlllIlIlIlIll[0] != 0);
    }
    
    @Override
    public void run() {
        do {
            this.processQueue();
            "".length();
        } while (" ".length() == " ".length());
    }
    
    private static int lIIIIIlIllIlIIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public static ThreadedFileIOBase getThreadedIOInstance() {
        return ThreadedFileIOBase.threadedIOInstance;
    }
    
    public void queueIO(final IThreadedFileIO llllllllllllIlllllIIIIIIlIIlIllI) {
        if (lIIIIIlIllIIllIl(this.threadedIOQueue.contains(llllllllllllIlllllIIIIIIlIIlIllI) ? 1 : 0)) {
            ++this.writeQueuedCounter;
            this.threadedIOQueue.add(llllllllllllIlllllIIIIIIlIIlIllI);
            "".length();
        }
    }
}
