// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Queue;

public final class ChannelFlushPromiseNotifier
{
    private final /* synthetic */ boolean tryNotify;
    private final /* synthetic */ Queue<FlushCheckpoint> flushCheckpoints;
    private /* synthetic */ long writeCounter;
    private static final /* synthetic */ String[] lIIlIlIlIIlIII;
    private static final /* synthetic */ int[] lIIlIlIlIIlIIl;
    
    private static String llIlIIIIIlIllIl(String lllllllllllllIIllIlIIIIIlllIIIII, final String lllllllllllllIIllIlIIIIIllIlllll) {
        lllllllllllllIIllIlIIIIIlllIIIII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIlIIIIIlllIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIIIIIlllIIIll = new StringBuilder();
        final char[] lllllllllllllIIllIlIIIIIlllIIIlI = lllllllllllllIIllIlIIIIIllIlllll.toCharArray();
        int lllllllllllllIIllIlIIIIIlllIIIIl = ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[0];
        final Exception lllllllllllllIIllIlIIIIIllIllIll = (Object)((String)lllllllllllllIIllIlIIIIIlllIIIII).toCharArray();
        final long lllllllllllllIIllIlIIIIIllIllIlI = lllllllllllllIIllIlIIIIIllIllIll.length;
        int lllllllllllllIIllIlIIIIIllIllIIl = ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[0];
        while (llIlIIIIIllllII(lllllllllllllIIllIlIIIIIllIllIIl, (int)lllllllllllllIIllIlIIIIIllIllIlI)) {
            final char lllllllllllllIIllIlIIIIIlllIIllI = lllllllllllllIIllIlIIIIIllIllIll[lllllllllllllIIllIlIIIIIllIllIIl];
            lllllllllllllIIllIlIIIIIlllIIIll.append((char)(lllllllllllllIIllIlIIIIIlllIIllI ^ lllllllllllllIIllIlIIIIIlllIIIlI[lllllllllllllIIllIlIIIIIlllIIIIl % lllllllllllllIIllIlIIIIIlllIIIlI.length]));
            "".length();
            ++lllllllllllllIIllIlIIIIIlllIIIIl;
            ++lllllllllllllIIllIlIIIIIllIllIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIIIIIlllIIIll);
    }
    
    @Deprecated
    public ChannelFlushPromiseNotifier add(final ChannelPromise lllllllllllllIIllIlIIIIlIlIIlIIl, final int lllllllllllllIIllIlIIIIlIlIIlIll) {
        return this.add(lllllllllllllIIllIlIIIIlIlIIlIIl, (long)lllllllllllllIIllIlIIIIlIlIIlIll);
    }
    
    private static boolean llIlIIIIIlllIIl(final int lllllllllllllIIllIlIIIIIlIlllIIl) {
        return lllllllllllllIIllIlIIIIIlIlllIIl > 0;
    }
    
    private static String llIlIIIIIlIllll(final String lllllllllllllIIllIlIIIIIllIIlllI, final String lllllllllllllIIllIlIIIIIllIIllll) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIIIIIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIIIIllIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlIIIIIllIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlIIIIIllIlIIlI.init(ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[2], lllllllllllllIIllIlIIIIIllIlIIll);
            return new String(lllllllllllllIIllIlIIIIIllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIIIIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIIIIIllIlIIIl) {
            lllllllllllllIIllIlIIIIIllIlIIIl.printStackTrace();
            return null;
        }
    }
    
    public ChannelFlushPromiseNotifier notifyPromises() {
        this.notifyPromises0(null);
        return this;
    }
    
    private static void llIlIIIIIllIIIl() {
        (lIIlIlIlIIlIII = new String[ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[3]])[ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[0]] = llIlIIIIIlIllIl("MgcIIhkxEA==", "BugOp");
        ChannelFlushPromiseNotifier.lIIlIlIlIIlIII[ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[1]] = llIlIIIIIlIllll("ufWJqll+TRBJjmxQVW/iOGVEnR7+jswbVe1Z6h/l5uGFB3+Uur676Q==", "mySqo");
        ChannelFlushPromiseNotifier.lIIlIlIlIIlIII[ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[2]] = llIlIIIIIlIllll("PDtDb+lv68QeuXuQGx98c28iEsb/rsoAcxx7pcFI1p0=", "kIFBs");
    }
    
    private static int llIlIIIIIllIlll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIlIIIIIlllIlI(final int lllllllllllllIIllIlIIIIIllIIlIII, final int lllllllllllllIIllIlIIIIIllIIIlll) {
        return lllllllllllllIIllIlIIIIIllIIlIII == lllllllllllllIIllIlIIIIIllIIIlll;
    }
    
    private static boolean llIlIIIIIllIlII(final Object lllllllllllllIIllIlIIIIIllIIIIIl) {
        return lllllllllllllIIllIlIIIIIllIIIIIl == null;
    }
    
    private void notifyPromises0(final Throwable lllllllllllllIIllIlIIIIIlllllIIl) {
        if (llIlIIIIIllIllI(this.flushCheckpoints.isEmpty() ? 1 : 0)) {
            this.writeCounter = 0L;
            return;
        }
        final long lllllllllllllIIllIlIIIIIlllllIII = this.writeCounter;
        do {
            final FlushCheckpoint lllllllllllllIIllIlIIIIIlllllllI = this.flushCheckpoints.peek();
            if (llIlIIIIIllIlII(lllllllllllllIIllIlIIIIIlllllllI)) {
                this.writeCounter = 0L;
                "".length();
                if (-" ".length() > ((73 + 6 + 4 + 64 ^ 156 + 11 - 147 + 149) & (0x7A ^ 0x58 ^ (0x1B ^ 0x3) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                if (!llIlIIIIIlllIIl(llIlIIIIIlllIII(lllllllllllllIIllIlIIIIIlllllllI.flushCheckpoint(), lllllllllllllIIllIlIIIIIlllllIII))) {
                    this.flushCheckpoints.remove();
                    "".length();
                    final ChannelPromise lllllllllllllIIllIlIIIIIllllllIl = lllllllllllllIIllIlIIIIIlllllllI.promise();
                    if (llIlIIIIIllIlII(lllllllllllllIIllIlIIIIIlllllIIl)) {
                        if (llIlIIIIIllIllI(this.tryNotify ? 1 : 0)) {
                            lllllllllllllIIllIlIIIIIllllllIl.trySuccess();
                            "".length();
                            "".length();
                            if ("   ".length() <= 0) {
                                return;
                            }
                        }
                        else {
                            lllllllllllllIIllIlIIIIIllllllIl.setSuccess();
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                    }
                    else if (llIlIIIIIllIllI(this.tryNotify ? 1 : 0)) {
                        lllllllllllllIIllIlIIIIIllllllIl.tryFailure(lllllllllllllIIllIlIIIIIlllllIIl);
                        "".length();
                        "".length();
                        if ((0x65 ^ 0x61) == -" ".length()) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIllIlIIIIIllllllIl.setFailure(lllllllllllllIIllIlIIIIIlllllIIl);
                        "".length();
                    }
                    "".length();
                    continue;
                }
                if (llIlIIIIIlllIIl(llIlIIIIIlllIII(lllllllllllllIIllIlIIIIIlllllIII, 0L)) && llIlIIIIIlllIlI(this.flushCheckpoints.size(), ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[1])) {
                    this.writeCounter = 0L;
                    lllllllllllllIIllIlIIIIIlllllllI.flushCheckpoint(lllllllllllllIIllIlIIIIIlllllllI.flushCheckpoint() - lllllllllllllIIllIlIIIIIlllllIII);
                    "".length();
                    if (((0xCF ^ 0x80) & ~(0x63 ^ 0x2C)) < 0) {
                        return;
                    }
                }
            }
            final long lllllllllllllIIllIlIIIIIllllIlll = this.writeCounter;
            if (llIlIIIIIlllIll(llIlIIIIIlllIII(lllllllllllllIIllIlIIIIIllllIlll, 549755813888L))) {
                this.writeCounter = 0L;
                final Iterator lllllllllllllIIllIlIIIIIlllllIll = this.flushCheckpoints.iterator();
                while (llIlIIIIIllIllI(lllllllllllllIIllIlIIIIIlllllIll.hasNext() ? 1 : 0)) {
                    final FlushCheckpoint lllllllllllllIIllIlIIIIIllllllII = lllllllllllllIIllIlIIIIIlllllIll.next();
                    lllllllllllllIIllIlIIIIIllllllII.flushCheckpoint(lllllllllllllIIllIlIIIIIllllllII.flushCheckpoint() - lllllllllllllIIllIlIIIIIllllIlll);
                    "".length();
                    if (-" ".length() >= ((0x59 ^ 0x5E) & ~(0x1 ^ 0x6))) {
                        return;
                    }
                }
            }
        } while (((0x17 ^ 0x6C ^ (0xED ^ 0x9B)) & (0x2C ^ 0x18 ^ (0x30 ^ 0x9) ^ -" ".length())) == 0x0);
    }
    
    public ChannelFlushPromiseNotifier add(final ChannelPromise lllllllllllllIIllIlIIIIlIIllllII, final long lllllllllllllIIllIlIIIIlIIllllll) {
        if (llIlIIIIIllIlII(lllllllllllllIIllIlIIIIlIIllllII)) {
            throw new NullPointerException(ChannelFlushPromiseNotifier.lIIlIlIlIIlIII[ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[0]]);
        }
        if (llIlIIIIIllIlIl(llIlIIIIIllIIll(lllllllllllllIIllIlIIIIlIIllllll, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChannelFlushPromiseNotifier.lIIlIlIlIIlIII[ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[1]]).append(lllllllllllllIIllIlIIIIlIIllllll)));
        }
        final long lllllllllllllIIllIlIIIIlIIlllllI = this.writeCounter + lllllllllllllIIllIlIIIIlIIllllll;
        if (llIlIIIIIllIllI((lllllllllllllIIllIlIIIIlIIllllII instanceof FlushCheckpoint) ? 1 : 0)) {
            final FlushCheckpoint lllllllllllllIIllIlIIIIlIlIIIIlI = (FlushCheckpoint)lllllllllllllIIllIlIIIIlIIllllII;
            lllllllllllllIIllIlIIIIlIlIIIIlI.flushCheckpoint(lllllllllllllIIllIlIIIIlIIlllllI);
            this.flushCheckpoints.add(lllllllllllllIIllIlIIIIlIlIIIIlI);
            "".length();
            "".length();
            if (((0x4 ^ 0x1C) & ~(0xA4 ^ 0xBC)) == (0xAC ^ 0xA8)) {
                return null;
            }
        }
        else {
            this.flushCheckpoints.add(new DefaultFlushCheckpoint(lllllllllllllIIllIlIIIIlIIlllllI, lllllllllllllIIllIlIIIIlIIllllII));
            "".length();
        }
        return this;
    }
    
    @Deprecated
    public ChannelFlushPromiseNotifier notifyFlushFutures() {
        return this.notifyPromises();
    }
    
    private static int llIlIIIIIllIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public ChannelFlushPromiseNotifier() {
        this((boolean)(ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[0] != 0));
    }
    
    public ChannelFlushPromiseNotifier notifyPromises(final Throwable lllllllllllllIIllIlIIIIlIIlIIIlI) {
        this.notifyPromises();
        "".length();
        do {
            final FlushCheckpoint lllllllllllllIIllIlIIIIlIIlIIllI = this.flushCheckpoints.poll();
            if (llIlIIIIIllIlII(lllllllllllllIIllIlIIIIlIIlIIllI)) {
                "".length();
                if (-" ".length() == (0x7E ^ 0x7A)) {
                    return null;
                }
                return this;
            }
            else {
                if (llIlIIIIIllIllI(this.tryNotify ? 1 : 0)) {
                    lllllllllllllIIllIlIIIIlIIlIIllI.promise().tryFailure(lllllllllllllIIllIlIIIIlIIlIIIlI);
                    "".length();
                    "".length();
                    if (-"  ".length() > 0) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIllIlIIIIlIIlIIllI.promise().setFailure(lllllllllllllIIllIlIIIIlIIlIIIlI);
                    "".length();
                }
                "".length();
            }
        } while (" ".length() >= 0);
        return null;
    }
    
    public ChannelFlushPromiseNotifier increaseWriteCounter(final long lllllllllllllIIllIlIIIIlIIllIIll) {
        if (llIlIIIIIllIlIl(llIlIIIIIllIlll(lllllllllllllIIllIlIIIIlIIllIIll, 0L))) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ChannelFlushPromiseNotifier.lIIlIlIlIIlIII[ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[2]]).append(lllllllllllllIIllIlIIIIlIIllIIll)));
        }
        this.writeCounter += lllllllllllllIIllIlIIIIlIIllIIll;
        return this;
    }
    
    private static boolean llIlIIIIIllIllI(final int lllllllllllllIIllIlIIIIIlIllllll) {
        return lllllllllllllIIllIlIIIIIlIllllll != 0;
    }
    
    public long writeCounter() {
        return this.writeCounter;
    }
    
    public ChannelFlushPromiseNotifier(final boolean lllllllllllllIIllIlIIIIlIlIlIllI) {
        this.flushCheckpoints = new ArrayDeque<FlushCheckpoint>();
        this.tryNotify = lllllllllllllIIllIlIIIIlIlIlIllI;
    }
    
    public ChannelFlushPromiseNotifier notifyPromises(final Throwable lllllllllllllIIllIlIIIIlIIIlIIIl, final Throwable lllllllllllllIIllIlIIIIlIIIlIIII) {
        this.notifyPromises0(lllllllllllllIIllIlIIIIlIIIlIIIl);
        do {
            final FlushCheckpoint lllllllllllllIIllIlIIIIlIIIlIllI = this.flushCheckpoints.poll();
            if (llIlIIIIIllIlII(lllllllllllllIIllIlIIIIlIIIlIllI)) {
                "".length();
                if ("   ".length() >= (0xAE ^ 0xAA)) {
                    return null;
                }
                return this;
            }
            else {
                if (llIlIIIIIllIllI(this.tryNotify ? 1 : 0)) {
                    lllllllllllllIIllIlIIIIlIIIlIllI.promise().tryFailure(lllllllllllllIIllIlIIIIlIIIlIIII);
                    "".length();
                    "".length();
                    if (((233 + 2 - 197 + 205 ^ 124 + 96 - 53 + 3) & (0xBA ^ 0xAB ^ (0x18 ^ 0x50) ^ -" ".length())) > 0) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIllIlIIIIlIIIlIllI.promise().setFailure(lllllllllllllIIllIlIIIIlIIIlIIII);
                    "".length();
                }
                "".length();
            }
        } while ((0x57 ^ 0x53) > -" ".length());
        return null;
    }
    
    private static boolean llIlIIIIIllllII(final int lllllllllllllIIllIlIIIIIllIIIlII, final int lllllllllllllIIllIlIIIIIllIIIIll) {
        return lllllllllllllIIllIlIIIIIllIIIlII < lllllllllllllIIllIlIIIIIllIIIIll;
    }
    
    @Deprecated
    public ChannelFlushPromiseNotifier notifyFlushFutures(final Throwable lllllllllllllIIllIlIIIIlIIIIIlll, final Throwable lllllllllllllIIllIlIIIIlIIIIlIIl) {
        return this.notifyPromises(lllllllllllllIIllIlIIIIlIIIIIlll, lllllllllllllIIllIlIIIIlIIIIlIIl);
    }
    
    private static void llIlIIIIIllIIlI() {
        (lIIlIlIlIIlIIl = new int[4])[0] = ((" ".length() ^ (0x2A ^ 0x37)) & (97 + 83 - 156 + 133 ^ 86 + 71 - 43 + 15 ^ -" ".length()));
        ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[1] = " ".length();
        ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[2] = "  ".length();
        ChannelFlushPromiseNotifier.lIIlIlIlIIlIIl[3] = "   ".length();
    }
    
    private static int llIlIIIIIlllIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llIlIIIIIllIlIl(final int lllllllllllllIIllIlIIIIIlIlllIll) {
        return lllllllllllllIIllIlIIIIIlIlllIll < 0;
    }
    
    private static boolean llIlIIIIIlllIll(final int lllllllllllllIIllIlIIIIIlIllllIl) {
        return lllllllllllllIIllIlIIIIIlIllllIl >= 0;
    }
    
    static {
        llIlIIIIIllIIlI();
        llIlIIIIIllIIIl();
    }
    
    @Deprecated
    public ChannelFlushPromiseNotifier notifyFlushFutures(final Throwable lllllllllllllIIllIlIIIIlIIIllIll) {
        return this.notifyPromises(lllllllllllllIIllIlIIIIlIIIllIll);
    }
    
    private static class DefaultFlushCheckpoint implements FlushCheckpoint
    {
        private /* synthetic */ long checkpoint;
        private final /* synthetic */ ChannelPromise future;
        
        DefaultFlushCheckpoint(final long lllllllllllllIIllIIlIlllllIlIIlI, final ChannelPromise lllllllllllllIIllIIlIlllllIlIIIl) {
            this.checkpoint = lllllllllllllIIllIIlIlllllIlIIlI;
            this.future = lllllllllllllIIllIIlIlllllIlIIIl;
        }
        
        @Override
        public void flushCheckpoint(final long lllllllllllllIIllIIlIlllllIIlIlI) {
            this.checkpoint = lllllllllllllIIllIIlIlllllIIlIlI;
        }
        
        @Override
        public ChannelPromise promise() {
            return this.future;
        }
        
        @Override
        public long flushCheckpoint() {
            return this.checkpoint;
        }
    }
    
    interface FlushCheckpoint
    {
        ChannelPromise promise();
        
        void flushCheckpoint(final long p0);
        
        long flushCheckpoint();
    }
}
