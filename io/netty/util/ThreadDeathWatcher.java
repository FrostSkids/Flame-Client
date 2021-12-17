// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

import io.netty.util.internal.MpscLinkedQueueNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.concurrent.DefaultThreadFactory;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import io.netty.util.internal.logging.InternalLogger;

public final class ThreadDeathWatcher
{
    private static final /* synthetic */ String[] lIllIlIllIIllI;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ Watcher watcher;
    private static volatile /* synthetic */ Thread watcherThread;
    private static final /* synthetic */ AtomicBoolean started;
    private static final /* synthetic */ Queue<Entry> pendingEntries;
    private static final /* synthetic */ int[] lIllIlIllIlIll;
    private static final /* synthetic */ ThreadFactory threadFactory;
    
    private ThreadDeathWatcher() {
    }
    
    public static void watch(final Thread llllllllllllIllllllllIllIlIIIIlI, final Runnable llllllllllllIllllllllIllIlIIIIIl) {
        if (lllllllIIIIlIII(llllllllllllIllllllllIllIlIIIIlI)) {
            throw new NullPointerException(ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[0]]);
        }
        if (lllllllIIIIlIII(llllllllllllIllllllllIllIlIIIIIl)) {
            throw new NullPointerException(ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[1]]);
        }
        if (lllllllIIIIlIIl(llllllllllllIllllllllIllIlIIIIlI.isAlive() ? 1 : 0)) {
            throw new IllegalArgumentException(ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[2]]);
        }
        schedule(llllllllllllIllllllllIllIlIIIIlI, llllllllllllIllllllllIllIlIIIIIl, (boolean)(ThreadDeathWatcher.lIllIlIllIlIll[1] != 0));
    }
    
    private static boolean lllllllIIIIlIll(final Object llllllllllllIllllllllIlIlllIlIIl) {
        return llllllllllllIllllllllIlIlllIlIIl != null;
    }
    
    private static boolean lllllllIIIIllII(final int llllllllllllIllllllllIlIlllIllII, final int llllllllllllIllllllllIlIlllIlIll) {
        return llllllllllllIllllllllIlIlllIllII < llllllllllllIllllllllIlIlllIlIll;
    }
    
    public static boolean awaitInactivity(final long llllllllllllIllllllllIllIIlIlIIl, final TimeUnit llllllllllllIllllllllIllIIlIlIII) throws InterruptedException {
        if (lllllllIIIIlIII(llllllllllllIllllllllIllIIlIlIII)) {
            throw new NullPointerException(ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[5]]);
        }
        final Thread llllllllllllIllllllllIllIIlIIlll = ThreadDeathWatcher.watcherThread;
        if (lllllllIIIIlIll(llllllllllllIllllllllIllIIlIIlll)) {
            llllllllllllIllllllllIllIIlIIlll.join(llllllllllllIllllllllIllIIlIlIII.toMillis(llllllllllllIllllllllIllIIlIlIIl));
            int n;
            if (lllllllIIIIlIIl(llllllllllllIllllllllIllIIlIIlll.isAlive() ? 1 : 0)) {
                n = ThreadDeathWatcher.lIllIlIllIlIll[1];
                "".length();
                if (-(121 + 132 - 240 + 137 ^ 11 + 135 - 109 + 109) > 0) {
                    return ((0x47 ^ 0x55 ^ (0x46 ^ 0x5B)) & (0xFB ^ 0xC2 ^ (0x2F ^ 0x19) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = ThreadDeathWatcher.lIllIlIllIlIll[0];
            }
            return n != 0;
        }
        return ThreadDeathWatcher.lIllIlIllIlIll[1] != 0;
    }
    
    private static boolean lllllllIIIIlIII(final Object llllllllllllIllllllllIlIlllIIlll) {
        return llllllllllllIllllllllIlIlllIIlll == null;
    }
    
    public static void unwatch(final Thread llllllllllllIllllllllIllIIlllIlI, final Runnable llllllllllllIllllllllIllIIlllIIl) {
        if (lllllllIIIIlIII(llllllllllllIllllllllIllIIlllIlI)) {
            throw new NullPointerException(ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[3]]);
        }
        if (lllllllIIIIlIII(llllllllllllIllllllllIllIIlllIIl)) {
            throw new NullPointerException(ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[4]]);
        }
        schedule(llllllllllllIllllllllIllIIlllIlI, llllllllllllIllllllllIllIIlllIIl, (boolean)(ThreadDeathWatcher.lIllIlIllIlIll[0] != 0));
    }
    
    private static void llllllIlllllIlI() {
        (lIllIlIllIIllI = new String[ThreadDeathWatcher.lIllIlIllIlIll[6]])[ThreadDeathWatcher.lIllIlIllIlIll[0]] = llllllIllllIlll("1s6eSrYGAg8=", "KDVCm");
        ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[1]] = llllllIlllllIII("vlPzQSOL74w=", "cPlwB");
        ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[2]] = llllllIlllllIII("Ewi+BVURysFoPJoaRjLUeDSa5TX9XvE9", "jENub");
        ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[3]] = llllllIlllllIIl("Aj88IRYS", "vWNDw");
        ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[4]] = llllllIlllllIII("gsUq+pEfHNo=", "sPSfk");
        ThreadDeathWatcher.lIllIlIllIIllI[ThreadDeathWatcher.lIllIlIllIlIll[5]] = llllllIlllllIIl("ADoLPA==", "uTbHb");
    }
    
    private static boolean lllllllIIIIlIlI(final int llllllllllllIllllllllIlIlllIIlIl) {
        return llllllllllllIllllllllIlIlllIIlIl != 0;
    }
    
    private static void lllllllIIIIIlll() {
        (lIllIlIllIlIll = new int[8])[0] = ((0xE ^ 0x4) & ~(0x71 ^ 0x7B));
        ThreadDeathWatcher.lIllIlIllIlIll[1] = " ".length();
        ThreadDeathWatcher.lIllIlIllIlIll[2] = "  ".length();
        ThreadDeathWatcher.lIllIlIllIlIll[3] = "   ".length();
        ThreadDeathWatcher.lIllIlIllIlIll[4] = (75 + 114 - 100 + 64 ^ 13 + 63 - 34 + 115);
        ThreadDeathWatcher.lIllIlIllIlIll[5] = (0x69 ^ 0x72 ^ (0xB1 ^ 0xAF));
        ThreadDeathWatcher.lIllIlIllIlIll[6] = (0xC5 ^ 0xC3);
        ThreadDeathWatcher.lIllIlIllIlIll[7] = (0x6C ^ 0x64);
    }
    
    private static String llllllIllllIlll(final String llllllllllllIllllllllIllIIIllIIl, final String llllllllllllIllllllllIllIIIllIII) {
        try {
            final SecretKeySpec llllllllllllIllllllllIllIIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllllIllIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllllIllIIIllIll = Cipher.getInstance("Blowfish");
            llllllllllllIllllllllIllIIIllIll.init(ThreadDeathWatcher.lIllIlIllIlIll[2], llllllllllllIllllllllIllIIIlllII);
            return new String(llllllllllllIllllllllIllIIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllllIllIIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllllIllIIIllIlI) {
            llllllllllllIllllllllIllIIIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static void schedule(final Thread llllllllllllIllllllllIllIIllIIll, final Runnable llllllllllllIllllllllIllIIlIllll, final boolean llllllllllllIllllllllIllIIllIIIl) {
        ThreadDeathWatcher.pendingEntries.add(new Entry(llllllllllllIllllllllIllIIllIIll, llllllllllllIllllllllIllIIlIllll, llllllllllllIllllllllIllIIllIIIl));
        "".length();
        if (lllllllIIIIlIlI(ThreadDeathWatcher.started.compareAndSet((boolean)(ThreadDeathWatcher.lIllIlIllIlIll[0] != 0), (boolean)(ThreadDeathWatcher.lIllIlIllIlIll[1] != 0)) ? 1 : 0)) {
            final Thread llllllllllllIllllllllIllIIllIlII = ThreadDeathWatcher.threadFactory.newThread(ThreadDeathWatcher.watcher);
            llllllllllllIllllllllIllIIllIlII.start();
            ThreadDeathWatcher.watcherThread = llllllllllllIllllllllIllIIllIlII;
        }
    }
    
    static {
        lllllllIIIIIlll();
        llllllIlllllIlI();
        logger = InternalLoggerFactory.getInstance(ThreadDeathWatcher.class);
        threadFactory = new DefaultThreadFactory(ThreadDeathWatcher.class, (boolean)(ThreadDeathWatcher.lIllIlIllIlIll[1] != 0), ThreadDeathWatcher.lIllIlIllIlIll[1]);
        pendingEntries = PlatformDependent.newMpscQueue();
        watcher = new Watcher();
        started = new AtomicBoolean();
    }
    
    private static String llllllIlllllIIl(String llllllllllllIllllllllIllIIIIIlII, final String llllllllllllIllllllllIllIIIIIIll) {
        llllllllllllIllllllllIllIIIIIlII = new String(Base64.getDecoder().decode(llllllllllllIllllllllIllIIIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllllIllIIIIIlll = new StringBuilder();
        final char[] llllllllllllIllllllllIllIIIIIllI = llllllllllllIllllllllIllIIIIIIll.toCharArray();
        int llllllllllllIllllllllIllIIIIIlIl = ThreadDeathWatcher.lIllIlIllIlIll[0];
        final double llllllllllllIllllllllIlIllllllll = (Object)llllllllllllIllllllllIllIIIIIlII.toCharArray();
        final byte llllllllllllIllllllllIlIlllllllI = (byte)llllllllllllIllllllllIlIllllllll.length;
        short llllllllllllIllllllllIlIllllllIl = (short)ThreadDeathWatcher.lIllIlIllIlIll[0];
        while (lllllllIIIIllII(llllllllllllIllllllllIlIllllllIl, llllllllllllIllllllllIlIlllllllI)) {
            final char llllllllllllIllllllllIllIIIIlIlI = llllllllllllIllllllllIlIllllllll[llllllllllllIllllllllIlIllllllIl];
            llllllllllllIllllllllIllIIIIIlll.append((char)(llllllllllllIllllllllIllIIIIlIlI ^ llllllllllllIllllllllIllIIIIIllI[llllllllllllIllllllllIllIIIIIlIl % llllllllllllIllllllllIllIIIIIllI.length]));
            "".length();
            ++llllllllllllIllllllllIllIIIIIlIl;
            ++llllllllllllIllllllllIlIllllllIl;
            "".length();
            if (((0xC8 ^ 0x92 ^ (0xFF ^ 0x88)) & (0x4 ^ 0x4E ^ (0x22 ^ 0x45) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllllIllIIIIIlll);
    }
    
    private static boolean lllllllIIIIlIIl(final int llllllllllllIllllllllIlIlllIIIll) {
        return llllllllllllIllllllllIlIlllIIIll == 0;
    }
    
    private static String llllllIlllllIII(final String llllllllllllIllllllllIlIllllIIlI, final String llllllllllllIllllllllIlIllllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllllllllIlIllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllllIlIllllIIIl.getBytes(StandardCharsets.UTF_8)), ThreadDeathWatcher.lIllIlIllIlIll[7]), "DES");
            final Cipher llllllllllllIllllllllIlIllllIllI = Cipher.getInstance("DES");
            llllllllllllIllllllllIlIllllIllI.init(ThreadDeathWatcher.lIllIlIllIlIll[2], llllllllllllIllllllllIlIllllIlll);
            return new String(llllllllllllIllllllllIlIllllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllllIlIllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllllIlIllllIlIl) {
            llllllllllllIllllllllIlIllllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static final class Watcher implements Runnable
    {
        private static final /* synthetic */ int[] lIlIlllIlllIlI;
        private static final /* synthetic */ String[] lIlIlllIlllIII;
        static final /* synthetic */ boolean $assertionsDisabled;
        private final /* synthetic */ List<Entry> watchees;
        
        private Watcher() {
            this.watchees = new ArrayList<Entry>();
        }
        
        static {
            llllIlIIIIIllIl();
            llllIlIIIIIlIlI();
            int $assertionsDisabled2;
            if (llllIlIIIIIllll(ThreadDeathWatcher.class.desiredAssertionStatus() ? 1 : 0)) {
                $assertionsDisabled2 = Watcher.lIlIlllIlllIlI[0];
                "".length();
                if ("  ".length() == (14 + 119 + 28 + 9 ^ 149 + 46 - 72 + 51)) {
                    return;
                }
            }
            else {
                $assertionsDisabled2 = Watcher.lIlIlllIlllIlI[1];
            }
            $assertionsDisabled = ($assertionsDisabled2 != 0);
        }
        
        private static void llllIlIIIIIllIl() {
            (lIlIlllIlllIlI = new int[3])[0] = " ".length();
            Watcher.lIlIlllIlllIlI[1] = ((37 + 30 + 132 + 25 ^ 63 + 75 - 136 + 159) & (84 + 177 - 170 + 153 ^ 16 + 122 - 0 + 43 ^ -" ".length()));
            Watcher.lIlIlllIlllIlI[2] = "  ".length();
        }
        
        @Override
        public void run() {
            while (true) {
                this.fetchWatchees();
                this.notifyWatchees();
                this.fetchWatchees();
                this.notifyWatchees();
                try {
                    Thread.sleep(1000L);
                    "".length();
                    if ((0x10 ^ 0x15) <= 0) {
                        return;
                    }
                }
                catch (InterruptedException ex) {}
                if (llllIlIIIIIlllI(this.watchees.isEmpty() ? 1 : 0) && llllIlIIIIIlllI(ThreadDeathWatcher.pendingEntries.isEmpty() ? 1 : 0)) {
                    final boolean lllllllllllllIIIIlIlIllIlIIIlllI = ThreadDeathWatcher.started.compareAndSet((boolean)(Watcher.lIlIlllIlllIlI[0] != 0), (boolean)(Watcher.lIlIlllIlllIlI[1] != 0));
                    if (llllIlIIIIIllll(Watcher.$assertionsDisabled ? 1 : 0) && llllIlIIIIIllll(lllllllllllllIIIIlIlIllIlIIIlllI ? 1 : 0)) {
                        throw new AssertionError();
                    }
                    if (llllIlIIIIIlllI(ThreadDeathWatcher.pendingEntries.isEmpty() ? 1 : 0)) {
                        "".length();
                        if (-"   ".length() > 0) {
                            return;
                        }
                        break;
                    }
                    else if (llllIlIIIIIllll(ThreadDeathWatcher.started.compareAndSet((boolean)(Watcher.lIlIlllIlllIlI[1] != 0), (boolean)(Watcher.lIlIlllIlllIlI[0] != 0)) ? 1 : 0)) {
                        "".length();
                        if ("  ".length() < ((0xD8 ^ 0xC1) & ~(0x77 ^ 0x6E))) {
                            return;
                        }
                        break;
                    }
                    else {
                        "".length();
                        if (null != null) {
                            return;
                        }
                        continue;
                    }
                }
            }
        }
        
        private static boolean llllIlIIIIIllll(final int lllllllllllllIIIIlIlIllIIlIllIll) {
            return lllllllllllllIIIIlIlIllIIlIllIll == 0;
        }
        
        private static void llllIlIIIIIlIlI() {
            (lIlIlllIlllIII = new String[Watcher.lIlIlllIlllIlI[0]])[Watcher.lIlIlllIlllIlI[1]] = llllIlIIIIIIlll("78NqM4BuwE0ph6i/yC02MnGUzy3mYuXhBCUq5oGO7Ne9VhyiIr+4lKJyiHdnjirs", "xTxPl");
        }
        
        private void notifyWatchees() {
            final List<Entry> lllllllllllllIIIIlIlIllIIllllIll = this.watchees;
            int lllllllllllllIIIIlIlIllIIlllllIl = Watcher.lIlIlllIlllIlI[1];
            while (llllIlIIIIlIIIl(lllllllllllllIIIIlIlIllIIlllllIl, lllllllllllllIIIIlIlIllIIllllIll.size())) {
                final Entry lllllllllllllIIIIlIlIllIIllllllI = lllllllllllllIIIIlIlIllIIllllIll.get(lllllllllllllIIIIlIlIllIIlllllIl);
                Label_0116: {
                    if (llllIlIIIIIllll(lllllllllllllIIIIlIlIllIIllllllI.thread.isAlive() ? 1 : 0)) {
                        lllllllllllllIIIIlIlIllIIllllIll.remove(lllllllllllllIIIIlIlIllIIlllllIl);
                        "".length();
                        try {
                            lllllllllllllIIIIlIlIllIIllllllI.task.run();
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break Label_0116;
                        }
                        catch (Throwable lllllllllllllIIIIlIlIllIIlllllll) {
                            ThreadDeathWatcher.logger.warn(Watcher.lIlIlllIlllIII[Watcher.lIlIlllIlllIlI[1]], lllllllllllllIIIIlIlIllIIlllllll);
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break Label_0116;
                        }
                    }
                    ++lllllllllllllIIIIlIlIllIIlllllIl;
                }
                "".length();
                if (-(79 + 149 - 175 + 117 ^ 147 + 158 - 287 + 156) >= 0) {
                    return;
                }
            }
        }
        
        private static boolean llllIlIIIIIlllI(final int lllllllllllllIIIIlIlIllIIlIlllIl) {
            return lllllllllllllIIIIlIlIllIIlIlllIl != 0;
        }
        
        private static boolean llllIlIIIIlIIII(final Object lllllllllllllIIIIlIlIllIIlIlllll) {
            return lllllllllllllIIIIlIlIllIIlIlllll == null;
        }
        
        private static String llllIlIIIIIIlll(final String lllllllllllllIIIIlIlIllIIllIlIlI, final String lllllllllllllIIIIlIlIllIIllIlIIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIlIlIllIIllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIllIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIlIlIllIIllIllII = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIlIlIllIIllIllII.init(Watcher.lIlIlllIlllIlI[2], lllllllllllllIIIIlIlIllIIllIllIl);
                return new String(lllllllllllllIIIIlIlIllIIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIllIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlIlIllIIllIlIll) {
                lllllllllllllIIIIlIlIllIIllIlIll.printStackTrace();
                return null;
            }
        }
        
        private static boolean llllIlIIIIlIIIl(final int lllllllllllllIIIIlIlIllIIllIIIlI, final int lllllllllllllIIIIlIlIllIIllIIIIl) {
            return lllllllllllllIIIIlIlIllIIllIIIlI < lllllllllllllIIIIlIlIllIIllIIIIl;
        }
        
        private void fetchWatchees() {
            do {
                final Entry lllllllllllllIIIIlIlIllIlIIIlIII = ThreadDeathWatcher.pendingEntries.poll();
                if (llllIlIIIIlIIII(lllllllllllllIIIIlIlIllIlIIIlIII)) {
                    "".length();
                    if (((0x5B ^ 0x1 ^ (0xF ^ 0x72)) & (109 + 104 - 189 + 120 ^ 179 + 86 - 85 + 3 ^ -" ".length())) > 0) {
                        return;
                    }
                }
                else {
                    if (llllIlIIIIIlllI(lllllllllllllIIIIlIlIllIlIIIlIII.isWatch ? 1 : 0)) {
                        this.watchees.add(lllllllllllllIIIIlIlIllIlIIIlIII);
                        "".length();
                        "".length();
                        if (-" ".length() > "   ".length()) {
                            return;
                        }
                    }
                    else {
                        this.watchees.remove(lllllllllllllIIIIlIlIllIlIIIlIII);
                        "".length();
                    }
                    "".length();
                }
            } while (((0x2D ^ 0x6D ^ (0x96 ^ 0xC2)) & (0xDE ^ 0xB6 ^ (0x39 ^ 0x45) ^ -" ".length())) == 0x0);
        }
    }
    
    private static final class Entry extends MpscLinkedQueueNode<Entry>
    {
        final /* synthetic */ boolean isWatch;
        final /* synthetic */ Runnable task;
        private static final /* synthetic */ int[] lIIlIlllIIllIl;
        final /* synthetic */ Thread thread;
        
        @Override
        public boolean equals(final Object lllllllllllllIIllIIIIlIIIIlIIIII) {
            if (llIlIIlllllIIlI(lllllllllllllIIllIIIIlIIIIlIIIII, this)) {
                return Entry.lIIlIlllIIllIl[0] != 0;
            }
            if (llIlIIlllllIIll((lllllllllllllIIllIIIIlIIIIlIIIII instanceof Entry) ? 1 : 0)) {
                return Entry.lIIlIlllIIllIl[1] != 0;
            }
            final Entry lllllllllllllIIllIIIIlIIIIIllllI = (Entry)lllllllllllllIIllIIIIlIIIIlIIIII;
            int n;
            if (llIlIIlllllIIlI(this.thread, lllllllllllllIIllIIIIlIIIIIllllI.thread) && llIlIIlllllIIlI(this.task, lllllllllllllIIllIIIIlIIIIIllllI.task)) {
                n = Entry.lIIlIlllIIllIl[0];
                "".length();
                if (((0x45 ^ 0x14) & ~(0x62 ^ 0x33)) != ((0xC6 ^ 0xC3) & ~(0x41 ^ 0x44))) {
                    return ((0xA3 ^ 0x9E) & ~(0x52 ^ 0x6F)) != 0x0;
                }
            }
            else {
                n = Entry.lIIlIlllIIllIl[1];
            }
            return n != 0;
        }
        
        private static void llIlIIlllllIIIl() {
            (lIIlIlllIIllIl = new int[2])[0] = " ".length();
            Entry.lIIlIlllIIllIl[1] = ((0x1F ^ 0x45) & ~(0xF6 ^ 0xAC));
        }
        
        Entry(final Thread lllllllllllllIIllIIIIlIIIIlllIlI, final Runnable lllllllllllllIIllIIIIlIIIIlllIIl, final boolean lllllllllllllIIllIIIIlIIIIllllIl) {
            this.thread = lllllllllllllIIllIIIIlIIIIlllIlI;
            this.task = lllllllllllllIIllIIIIlIIIIlllIIl;
            this.isWatch = lllllllllllllIIllIIIIlIIIIllllIl;
        }
        
        private static boolean llIlIIlllllIIlI(final Object lllllllllllllIIllIIIIlIIIIIIllIl, final Object lllllllllllllIIllIIIIlIIIIIIllII) {
            return lllllllllllllIIllIIIIlIIIIIIllIl == lllllllllllllIIllIIIIlIIIIIIllII;
        }
        
        @Override
        public int hashCode() {
            return this.thread.hashCode() ^ this.task.hashCode();
        }
        
        private static boolean llIlIIlllllIIll(final int lllllllllllllIIllIIIIlIIIIIIIlll) {
            return lllllllllllllIIllIIIIlIIIIIIIlll == 0;
        }
        
        static {
            llIlIIlllllIIIl();
        }
        
        @Override
        public Entry value() {
            return this;
        }
    }
}
