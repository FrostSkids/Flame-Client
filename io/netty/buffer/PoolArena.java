// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import io.netty.util.internal.StringUtil;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

abstract class PoolArena<T>
{
    private static final /* synthetic */ String[] lIlIlllllIlIIl;
    private final /* synthetic */ PoolChunkList<T> q000;
    private final /* synthetic */ PoolSubpage<T>[] smallSubpagePools;
    private final /* synthetic */ PoolSubpage<T>[] tinySubpagePools;
    final /* synthetic */ int pageShifts;
    final /* synthetic */ int pageSize;
    final /* synthetic */ PooledByteBufAllocator parent;
    private final /* synthetic */ PoolChunkList<T> q075;
    final /* synthetic */ int chunkSize;
    static final /* synthetic */ boolean $assertionsDisabled;
    private final /* synthetic */ PoolChunkList<T> q025;
    private final /* synthetic */ PoolChunkList<T> qInit;
    private final /* synthetic */ PoolChunkList<T> q100;
    private final /* synthetic */ int maxOrder;
    private final /* synthetic */ PoolChunkList<T> q050;
    private static final /* synthetic */ int[] lIlIlllllIlllI;
    final /* synthetic */ int numSmallSubpagePools;
    final /* synthetic */ int subpageOverflowMask;
    
    private PoolSubpage<T> newSubpagePoolHead(final int lllllllllllllIIIIlIIllIlllIlIlIl) {
        final PoolSubpage<T> lllllllllllllIIIIlIIllIlllIlIlII = new PoolSubpage<T>(lllllllllllllIIIIlIIllIlllIlIlIl);
        lllllllllllllIIIIlIIllIlllIlIlII.prev = lllllllllllllIIIIlIIllIlllIlIlII;
        lllllllllllllIIIIlIIllIlllIlIlII.next = lllllllllllllIIIIlIIllIlllIlIlII;
        return lllllllllllllIIIIlIIllIlllIlIlII;
    }
    
    static int smallIdx(final int lllllllllllllIIIIlIIllIllIllIlIl) {
        int lllllllllllllIIIIlIIllIllIllIlll = PoolArena.lIlIlllllIlllI[3];
        int lllllllllllllIIIIlIIllIllIllIllI = lllllllllllllIIIIlIIllIllIllIlIl >>> PoolArena.lIlIlllllIlllI[11];
        while (llllIlIlIIlllll(lllllllllllllIIIIlIIllIllIllIllI)) {
            lllllllllllllIIIIlIIllIllIllIllI >>>= PoolArena.lIlIlllllIlllI[0];
            ++lllllllllllllIIIIlIIllIllIllIlll;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return (0x3E ^ 0x35 ^ (0x0 ^ 0x25)) & (80 + 194 - 216 + 176 ^ 155 + 119 - 191 + 113 ^ -" ".length());
            }
        }
        return lllllllllllllIIIIlIIllIllIllIlll;
    }
    
    private static boolean llllIlIlIlIlIII(final int lllllllllllllIIIIlIIllIIllIlIIlI, final int lllllllllllllIIIIlIIllIIllIlIIIl) {
        return lllllllllllllIIIIlIIllIIllIlIIlI >= lllllllllllllIIIIlIIllIIllIlIIIl;
    }
    
    private static String llllIlIlIIlIIll(final String lllllllllllllIIIIlIIllIIllIlllII, final String lllllllllllllIIIIlIIllIIllIllIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIllIIlllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIllIIllIllIll.getBytes(StandardCharsets.UTF_8)), PoolArena.lIlIlllllIlllI[14]), "DES");
            final Cipher lllllllllllllIIIIlIIllIIlllIIIII = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIllIIlllIIIII.init(PoolArena.lIlIlllllIlllI[13], lllllllllllllIIIIlIIllIIlllIIIIl);
            return new String(lllllllllllllIIIIlIIllIIlllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIllIIllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIllIIllIlllll) {
            lllllllllllllIIIIlIIllIIllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static String llllIlIlIIlIIlI(String lllllllllllllIIIIlIIllIIlllllIll, final String lllllllllllllIIIIlIIllIIllllllll) {
        lllllllllllllIIIIlIIllIIlllllIll = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIIllIIlllllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIllIIlllllllI = new StringBuilder();
        final char[] lllllllllllllIIIIlIIllIIllllllIl = lllllllllllllIIIIlIIllIIllllllll.toCharArray();
        int lllllllllllllIIIIlIIllIIllllllII = PoolArena.lIlIlllllIlllI[3];
        final String lllllllllllllIIIIlIIllIIllllIllI = (Object)lllllllllllllIIIIlIIllIIlllllIll.toCharArray();
        final String lllllllllllllIIIIlIIllIIllllIlIl = (String)lllllllllllllIIIIlIIllIIllllIllI.length;
        double lllllllllllllIIIIlIIllIIllllIlII = PoolArena.lIlIlllllIlllI[3];
        while (llllIlIlIIllllI((int)lllllllllllllIIIIlIIllIIllllIlII, (int)lllllllllllllIIIIlIIllIIllllIlIl)) {
            final char lllllllllllllIIIIlIIllIlIIIIIIIl = lllllllllllllIIIIlIIllIIllllIllI[lllllllllllllIIIIlIIllIIllllIlII];
            lllllllllllllIIIIlIIllIIlllllllI.append((char)(lllllllllllllIIIIlIIllIlIIIIIIIl ^ lllllllllllllIIIIlIIllIIllllllIl[lllllllllllllIIIIlIIllIIllllllII % lllllllllllllIIIIlIIllIIllllllIl.length]));
            "".length();
            ++lllllllllllllIIIIlIIllIIllllllII;
            ++lllllllllllllIIIIlIIllIIllllIlII;
            "".length();
            if (((0x2D ^ 0xF) & ~(0xAA ^ 0x88)) > (0x73 ^ 0x77)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIllIIlllllllI);
    }
    
    private static int llllIlIlIlIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean llllIlIlIlIlIll(final int lllllllllllllIIIIlIIllIIllIlIllI, final int lllllllllllllIIIIlIIllIIllIlIlIl) {
        return lllllllllllllIIIIlIIllIIllIlIllI == lllllllllllllIIIIlIIllIIllIlIlIl;
    }
    
    protected abstract PooledByteBuf<T> newByteBuf(final int p0);
    
    private void allocateHuge(final PooledByteBuf<T> lllllllllllllIIIIlIIllIlIllIllll, final int lllllllllllllIIIIlIIllIlIllIlIll) {
        lllllllllllllIIIIlIIllIlIllIllll.initUnpooled(this.newUnpooledChunk(lllllllllllllIIIIlIIllIlIllIlIll), lllllllllllllIIIIlIIllIlIllIlIll);
    }
    
    private static boolean llllIlIlIIllllI(final int lllllllllllllIIIIlIIllIIllIIlllI, final int lllllllllllllIIIIlIIllIIllIIllIl) {
        return lllllllllllllIIIIlIIllIIllIIlllI < lllllllllllllIIIIlIIllIIllIIllIl;
    }
    
    int normalizeCapacity(final int lllllllllllllIIIIlIIllIlIlIIIIlI) {
        if (llllIlIlIlIIlII(lllllllllllllIIIIlIIllIlIlIIIIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[3]]).append(lllllllllllllIIIIlIIllIlIlIIIIlI).append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[0]])));
        }
        if (llllIlIlIlIlIII(lllllllllllllIIIIlIIllIlIlIIIIlI, this.chunkSize)) {
            return lllllllllllllIIIIlIIllIlIlIIIIlI;
        }
        if (llllIlIlIlIIIII(isTiny(lllllllllllllIIIIlIIllIlIlIIIIlI) ? 1 : 0)) {
            int lllllllllllllIIIIlIIllIlIlIIIllI = lllllllllllllIIIIlIIllIlIlIIIIlI;
            lllllllllllllIIIIlIIllIlIlIIIllI = (--lllllllllllllIIIIlIIllIlIlIIIllI | lllllllllllllIIIIlIIllIlIlIIIllI >>> PoolArena.lIlIlllllIlllI[0]);
            lllllllllllllIIIIlIIllIlIlIIIllI |= lllllllllllllIIIIlIIllIlIlIIIllI >>> PoolArena.lIlIlllllIlllI[13];
            lllllllllllllIIIIlIIllIlIlIIIllI |= lllllllllllllIIIIlIIllIlIlIIIllI >>> PoolArena.lIlIlllllIlllI[10];
            lllllllllllllIIIIlIIllIlIlIIIllI |= lllllllllllllIIIIlIIllIlIlIIIllI >>> PoolArena.lIlIlllllIlllI[14];
            lllllllllllllIIIIlIIllIlIlIIIllI |= lllllllllllllIIIIlIIllIlIlIIIllI >>> PoolArena.lIlIlllllIlllI[15];
            if (llllIlIlIlIIlII(++lllllllllllllIIIIlIIllIlIlIIIllI)) {
                lllllllllllllIIIIlIIllIlIlIIIllI >>>= PoolArena.lIlIlllllIlllI[0];
            }
            return lllllllllllllIIIIlIIllIlIlIIIllI;
        }
        if (llllIlIlIlIIIII(lllllllllllllIIIIlIIllIlIlIIIIlI & PoolArena.lIlIlllllIlllI[16])) {
            return lllllllllllllIIIIlIIllIlIlIIIIlI;
        }
        return (lllllllllllllIIIIlIIllIlIlIIIIlI & PoolArena.lIlIlllllIlllI[17]) + PoolArena.lIlIlllllIlllI[15];
    }
    
    private static boolean llllIlIlIlIlIIl(final int lllllllllllllIIIIlIIllIIlIllIlll) {
        return lllllllllllllIIIIlIIllIIlIllIlll >= 0;
    }
    
    protected PoolArena(final PooledByteBufAllocator lllllllllllllIIIIlIIllIllllIIlII, final int lllllllllllllIIIIlIIllIllllIIIll, final int lllllllllllllIIIIlIIllIllllIIIlI, final int lllllllllllllIIIIlIIllIlllIllIll, final int lllllllllllllIIIIlIIllIlllIllIlI) {
        this.parent = lllllllllllllIIIIlIIllIllllIIlII;
        this.pageSize = lllllllllllllIIIIlIIllIllllIIIll;
        this.maxOrder = lllllllllllllIIIIlIIllIllllIIIlI;
        this.pageShifts = lllllllllllllIIIIlIIllIlllIllIll;
        this.chunkSize = lllllllllllllIIIIlIIllIlllIllIlI;
        this.subpageOverflowMask = (lllllllllllllIIIIlIIllIllllIIIll - PoolArena.lIlIlllllIlllI[0] ^ PoolArena.lIlIlllllIlllI[1]);
        this.tinySubpagePools = this.newSubpagePoolArray(PoolArena.lIlIlllllIlllI[2]);
        int lllllllllllllIIIIlIIllIllllIIlll = PoolArena.lIlIlllllIlllI[3];
        while (llllIlIlIIllllI(lllllllllllllIIIIlIIllIllllIIlll, this.tinySubpagePools.length)) {
            this.tinySubpagePools[lllllllllllllIIIIlIIllIllllIIlll] = this.newSubpagePoolHead(lllllllllllllIIIIlIIllIllllIIIll);
            ++lllllllllllllIIIIlIIllIllllIIlll;
            "".length();
            if (((0xA6 ^ 0xC5) & ~(0x75 ^ 0x16)) == "  ".length()) {
                throw null;
            }
        }
        this.numSmallSubpagePools = lllllllllllllIIIIlIIllIlllIllIll - PoolArena.lIlIlllllIlllI[4];
        this.smallSubpagePools = this.newSubpagePoolArray(this.numSmallSubpagePools);
        int lllllllllllllIIIIlIIllIllllIIllI = PoolArena.lIlIlllllIlllI[3];
        while (llllIlIlIIllllI(lllllllllllllIIIIlIIllIllllIIllI, this.smallSubpagePools.length)) {
            this.smallSubpagePools[lllllllllllllIIIIlIIllIllllIIllI] = this.newSubpagePoolHead(lllllllllllllIIIIlIIllIllllIIIll);
            ++lllllllllllllIIIIlIIllIllllIIllI;
            "".length();
            if ("  ".length() == 0) {
                throw null;
            }
        }
        this.q100 = new PoolChunkList<T>(this, null, PoolArena.lIlIlllllIlllI[5], PoolArena.lIlIlllllIlllI[6]);
        this.q075 = new PoolChunkList<T>(this, this.q100, PoolArena.lIlIlllllIlllI[7], PoolArena.lIlIlllllIlllI[5]);
        this.q050 = new PoolChunkList<T>(this, this.q075, PoolArena.lIlIlllllIlllI[8], PoolArena.lIlIlllllIlllI[5]);
        this.q025 = new PoolChunkList<T>(this, this.q050, PoolArena.lIlIlllllIlllI[9], PoolArena.lIlIlllllIlllI[7]);
        this.q000 = new PoolChunkList<T>(this, this.q025, PoolArena.lIlIlllllIlllI[0], PoolArena.lIlIlllllIlllI[8]);
        this.qInit = new PoolChunkList<T>(this, this.q000, Integer.MIN_VALUE, PoolArena.lIlIlllllIlllI[9]);
        this.q100.prevList = this.q075;
        this.q075.prevList = this.q050;
        this.q050.prevList = this.q025;
        this.q025.prevList = this.q000;
        this.q000.prevList = null;
        this.qInit.prevList = this.qInit;
    }
    
    private synchronized void allocateNormal(final PooledByteBuf<T> lllllllllllllIIIIlIIllIlIllllllI, final int lllllllllllllIIIIlIIllIlIlllllIl, final int lllllllllllllIIIIlIIllIlIlllllII) {
        if (!llllIlIlIlIIIII(this.q050.allocate(lllllllllllllIIIIlIIllIlIllllllI, lllllllllllllIIIIlIIllIlIlllllIl, lllllllllllllIIIIlIIllIlIlllllII) ? 1 : 0) || !llllIlIlIlIIIII(this.q025.allocate(lllllllllllllIIIIlIIllIlIllllllI, lllllllllllllIIIIlIIllIlIlllllIl, lllllllllllllIIIIlIIllIlIlllllII) ? 1 : 0) || !llllIlIlIlIIIII(this.q000.allocate(lllllllllllllIIIIlIIllIlIllllllI, lllllllllllllIIIIlIIllIlIlllllIl, lllllllllllllIIIIlIIllIlIlllllII) ? 1 : 0) || !llllIlIlIlIIIII(this.qInit.allocate(lllllllllllllIIIIlIIllIlIllllllI, lllllllllllllIIIIlIIllIlIlllllIl, lllllllllllllIIIIlIIllIlIlllllII) ? 1 : 0) || !llllIlIlIlIIIII(this.q075.allocate(lllllllllllllIIIIlIIllIlIllllllI, lllllllllllllIIIIlIIllIlIlllllIl, lllllllllllllIIIIlIIllIlIlllllII) ? 1 : 0) || llllIlIlIIlllll(this.q100.allocate(lllllllllllllIIIIlIIllIlIllllllI, lllllllllllllIIIIlIIllIlIlllllIl, lllllllllllllIIIIlIIllIlIlllllII) ? 1 : 0)) {
            return;
        }
        final PoolChunk<T> lllllllllllllIIIIlIIllIlIllllIll = this.newChunk(this.pageSize, this.maxOrder, this.pageShifts, this.chunkSize);
        final long lllllllllllllIIIIlIIllIlIllllIlI = lllllllllllllIIIIlIIllIlIllllIll.allocate(lllllllllllllIIIIlIIllIlIlllllII);
        if (llllIlIlIlIIIII(PoolArena.$assertionsDisabled ? 1 : 0) && llllIlIlIlIIlll(llllIlIlIlIIllI(lllllllllllllIIIIlIIllIlIllllIlI, 0L))) {
            throw new AssertionError();
        }
        lllllllllllllIIIIlIIllIlIllllIll.initBuf(lllllllllllllIIIIlIIllIlIllllllI, lllllllllllllIIIIlIIllIlIllllIlI, lllllllllllllIIIIlIIllIlIlllllIl);
        this.qInit.add(lllllllllllllIIIIlIIllIlIllllIll);
    }
    
    private static boolean llllIlIlIlIIIlI(final Object lllllllllllllIIIIlIIllIIllIIIIlI, final Object lllllllllllllIIIIlIIllIIllIIIIIl) {
        return lllllllllllllIIIIlIIllIIllIIIIlI != lllllllllllllIIIIlIIllIIllIIIIIl;
    }
    
    static boolean isTiny(final int lllllllllllllIIIIlIIllIllIlIlIlI) {
        int n;
        if (llllIlIlIlIIIII(lllllllllllllIIIIlIIllIllIlIlIlI & PoolArena.lIlIlllllIlllI[12])) {
            n = PoolArena.lIlIlllllIlllI[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return (("  ".length() ^ (0x7D ^ 0x2E)) & (123 + 221 - 299 + 194 ^ 9 + 140 - 54 + 95 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = PoolArena.lIlIlllllIlllI[3];
        }
        return n != 0;
    }
    
    abstract boolean isDirect();
    
    private static boolean llllIlIlIIlllll(final int lllllllllllllIIIIlIIllIIlIlllIll) {
        return lllllllllllllIIIIlIIllIIlIlllIll != 0;
    }
    
    private PoolSubpage<T>[] newSubpagePoolArray(final int lllllllllllllIIIIlIIllIlllIIllll) {
        return (PoolSubpage<T>[])new PoolSubpage[lllllllllllllIIIIlIIllIlllIIllll];
    }
    
    private static boolean llllIlIlIlIIlIl(final int lllllllllllllIIIIlIIllIIllIIlIlI, final int lllllllllllllIIIIlIIllIIllIIlIIl) {
        return lllllllllllllIIIIlIIllIIllIIlIlI <= lllllllllllllIIIIlIIllIIllIIlIIl;
    }
    
    private static boolean llllIlIlIlIIlII(final int lllllllllllllIIIIlIIllIIlIllIlIl) {
        return lllllllllllllIIIIlIIllIIlIllIlIl < 0;
    }
    
    private static boolean llllIlIlIlIlIlI(final int lllllllllllllIIIIlIIllIIllIIIllI, final int lllllllllllllIIIIlIIllIIllIIIlIl) {
        return lllllllllllllIIIIlIIllIIllIIIllI > lllllllllllllIIIIlIIllIIllIIIlIl;
    }
    
    static {
        llllIlIlIIlllIl();
        llllIlIlIIlIlll();
        numTinySubpagePools = PoolArena.lIlIlllllIlllI[2];
        int $assertionsDisabled2;
        if (llllIlIlIlIIIII(PoolArena.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = PoolArena.lIlIlllllIlllI[0];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = PoolArena.lIlIlllllIlllI[3];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
    
    private static boolean llllIlIlIlIIlll(final int lllllllllllllIIIIlIIllIIlIllIIll) {
        return lllllllllllllIIIIlIIllIIlIllIIll <= 0;
    }
    
    private static int llllIlIlIlIIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static int tinyIdx(final int lllllllllllllIIIIlIIllIllIllllIl) {
        return lllllllllllllIIIIlIIllIllIllllIl >>> PoolArena.lIlIlllllIlllI[10];
    }
    
    protected abstract PoolChunk<T> newChunk(final int p0, final int p1, final int p2, final int p3);
    
    private static void llllIlIlIIlllIl() {
        (lIlIlllllIlllI = new int[25])[0] = " ".length();
        PoolArena.lIlIlllllIlllI[1] = -" ".length();
        PoolArena.lIlIlllllIlllI[2] = (0xE2 ^ 0xC2);
        PoolArena.lIlIlllllIlllI[3] = ((0x1F ^ 0x29 ^ (0xD8 ^ 0xBD)) & (0x11 ^ 0x2F ^ (0x5F ^ 0x32) ^ -" ".length()));
        PoolArena.lIlIlllllIlllI[4] = (0x57 ^ 0x5E);
        PoolArena.lIlIlllllIlllI[5] = (0xEA ^ 0x8E);
        PoolArena.lIlIlllllIlllI[6] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        PoolArena.lIlIlllllIlllI[7] = (0x62 ^ 0x78 ^ (0xE2 ^ 0xB3));
        PoolArena.lIlIlllllIlllI[8] = (0x11 ^ 0x23);
        PoolArena.lIlIlllllIlllI[9] = (0x5F ^ 0x46);
        PoolArena.lIlIlllllIlllI[10] = (0x78 ^ 0x7C);
        PoolArena.lIlIlllllIlllI[11] = (0x52 ^ 0x58);
        PoolArena.lIlIlllllIlllI[12] = -(-(0xFFFFF971 & 0x4EDF) & (0xFFFFDFF8 & 0x6A57));
        PoolArena.lIlIlllllIlllI[13] = "  ".length();
        PoolArena.lIlIlllllIlllI[14] = (0x31 ^ 0x39);
        PoolArena.lIlIlllllIlllI[15] = (0xA5 ^ 0x91 ^ (0xE6 ^ 0xC2));
        PoolArena.lIlIlllllIlllI[16] = (0x3E ^ 0x10 ^ (0x9E ^ 0xBF));
        PoolArena.lIlIlllllIlllI[17] = -(0x25 ^ 0x35);
        PoolArena.lIlIlllllIlllI[18] = "   ".length();
        PoolArena.lIlIlllllIlllI[19] = (0xB2 ^ 0xC1 ^ (0x38 ^ 0x4E));
        PoolArena.lIlIlllllIlllI[20] = (0xEE ^ 0x8A ^ (0x7E ^ 0x1C));
        PoolArena.lIlIlllllIlllI[21] = (0x9D ^ 0x9A);
        PoolArena.lIlIlllllIlllI[22] = (0x51 ^ 0x5A);
        PoolArena.lIlIlllllIlllI[23] = (0x83 ^ 0x8F);
        PoolArena.lIlIlllllIlllI[24] = (0x22 ^ 0x2F);
    }
    
    boolean isTinyOrSmall(final int lllllllllllllIIIIlIIllIllIlIllll) {
        int n;
        if (llllIlIlIlIIIII(lllllllllllllIIIIlIIllIllIlIllll & this.subpageOverflowMask)) {
            n = PoolArena.lIlIlllllIlllI[0];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0xAF ^ 0x8B) & ~(0x40 ^ 0x64)) != 0x0;
            }
        }
        else {
            n = PoolArena.lIlIlllllIlllI[3];
        }
        return n != 0;
    }
    
    private static boolean llllIlIlIlIllII(final Object lllllllllllllIIIIlIIllIIlIlllllI, final Object lllllllllllllIIIIlIIllIIlIllllIl) {
        return lllllllllllllIIIIlIIllIIlIlllllI == lllllllllllllIIIIlIIllIIlIllllIl;
    }
    
    void reallocate(final PooledByteBuf<T> lllllllllllllIIIIlIIllIlIIlIIlll, final int lllllllllllllIIIIlIIllIlIIlIIllI, final boolean lllllllllllllIIIIlIIllIlIIllIIIl) {
        if (!llllIlIlIlIlIIl(lllllllllllllIIIIlIIllIlIIlIIllI) || llllIlIlIlIlIlI(lllllllllllllIIIIlIIllIlIIlIIllI, lllllllllllllIIIIlIIllIlIIlIIlll.maxCapacity())) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[13]]).append(lllllllllllllIIIIlIIllIlIIlIIllI)));
        }
        final int lllllllllllllIIIIlIIllIlIIllIIII = lllllllllllllIIIIlIIllIlIIlIIlll.length;
        if (llllIlIlIlIlIll(lllllllllllllIIIIlIIllIlIIllIIII, lllllllllllllIIIIlIIllIlIIlIIllI)) {
            return;
        }
        final PoolChunk<T> lllllllllllllIIIIlIIllIlIIlIllll = lllllllllllllIIIIlIIllIlIIlIIlll.chunk;
        final long lllllllllllllIIIIlIIllIlIIlIlllI = lllllllllllllIIIIlIIllIlIIlIIlll.handle;
        final T lllllllllllllIIIIlIIllIlIIlIllIl = lllllllllllllIIIIlIIllIlIIlIIlll.memory;
        final int lllllllllllllIIIIlIIllIlIIlIllII = lllllllllllllIIIIlIIllIlIIlIIlll.offset;
        final int lllllllllllllIIIIlIIllIlIIlIlIll = lllllllllllllIIIIlIIllIlIIlIIlll.maxLength;
        int lllllllllllllIIIIlIIllIlIIlIlIlI = lllllllllllllIIIIlIIllIlIIlIIlll.readerIndex();
        int lllllllllllllIIIIlIIllIlIIlIlIIl = lllllllllllllIIIIlIIllIlIIlIIlll.writerIndex();
        this.allocate(this.parent.threadCache.get(), lllllllllllllIIIIlIIllIlIIlIIlll, lllllllllllllIIIIlIIllIlIIlIIllI);
        if (llllIlIlIlIlIlI(lllllllllllllIIIIlIIllIlIIlIIllI, lllllllllllllIIIIlIIllIlIIllIIII)) {
            this.memoryCopy(lllllllllllllIIIIlIIllIlIIlIllIl, lllllllllllllIIIIlIIllIlIIlIllII, lllllllllllllIIIIlIIllIlIIlIIlll.memory, lllllllllllllIIIIlIIllIlIIlIIlll.offset, lllllllllllllIIIIlIIllIlIIllIIII);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (llllIlIlIIllllI(lllllllllllllIIIIlIIllIlIIlIIllI, lllllllllllllIIIIlIIllIlIIllIIII)) {
            if (llllIlIlIIllllI(lllllllllllllIIIIlIIllIlIIlIlIlI, lllllllllllllIIIIlIIllIlIIlIIllI)) {
                if (llllIlIlIlIlIlI(lllllllllllllIIIIlIIllIlIIlIlIIl, lllllllllllllIIIIlIIllIlIIlIIllI)) {
                    lllllllllllllIIIIlIIllIlIIlIlIIl = lllllllllllllIIIIlIIllIlIIlIIllI;
                }
                this.memoryCopy(lllllllllllllIIIIlIIllIlIIlIllIl, lllllllllllllIIIIlIIllIlIIlIllII + lllllllllllllIIIIlIIllIlIIlIlIlI, lllllllllllllIIIIlIIllIlIIlIIlll.memory, lllllllllllllIIIIlIIllIlIIlIIlll.offset + lllllllllllllIIIIlIIllIlIIlIlIlI, lllllllllllllIIIIlIIllIlIIlIlIIl - lllllllllllllIIIIlIIllIlIIlIlIlI);
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIIIlIIllIlIIlIlIIl = lllllllllllllIIIIlIIllIlIIlIIllI;
                lllllllllllllIIIIlIIllIlIIlIlIlI = lllllllllllllIIIIlIIllIlIIlIIllI;
            }
        }
        lllllllllllllIIIIlIIllIlIIlIIlll.setIndex(lllllllllllllIIIIlIIllIlIIlIlIlI, lllllllllllllIIIIlIIllIlIIlIlIIl);
        "".length();
        if (llllIlIlIIlllll(lllllllllllllIIIIlIIllIlIIllIIIl ? 1 : 0)) {
            this.free(lllllllllllllIIIIlIIllIlIIlIllll, lllllllllllllIIIIlIIllIlIIlIlllI, lllllllllllllIIIIlIIllIlIIlIlIll);
        }
    }
    
    protected abstract void destroyChunk(final PoolChunk<T> p0);
    
    private void allocate(final PoolThreadCache lllllllllllllIIIIlIIllIllIIlIIII, final PooledByteBuf<T> lllllllllllllIIIIlIIllIllIIlIlII, final int lllllllllllllIIIIlIIllIllIIIlllI) {
        final int lllllllllllllIIIIlIIllIllIIlIIlI = this.normalizeCapacity(lllllllllllllIIIIlIIllIllIIIlllI);
        if (llllIlIlIIlllll(this.isTinyOrSmall(lllllllllllllIIIIlIIllIllIIlIIlI) ? 1 : 0)) {
            int lllllllllllllIIIIlIIllIllIIllIII;
            PoolSubpage<T>[] lllllllllllllIIIIlIIllIllIIlIlll;
            if (llllIlIlIIlllll(isTiny(lllllllllllllIIIIlIIllIllIIlIIlI) ? 1 : 0)) {
                if (llllIlIlIIlllll(lllllllllllllIIIIlIIllIllIIlIIII.allocateTiny(this, lllllllllllllIIIIlIIllIllIIlIlII, lllllllllllllIIIIlIIllIllIIIlllI, lllllllllllllIIIIlIIllIllIIlIIlI) ? 1 : 0)) {
                    return;
                }
                final int lllllllllllllIIIIlIIllIllIIlllIl = tinyIdx(lllllllllllllIIIIlIIllIllIIlIIlI);
                final PoolSubpage<T>[] lllllllllllllIIIIlIIllIllIIlllII = this.tinySubpagePools;
                "".length();
                if (-(0x8F ^ 0x8B) > 0) {
                    return;
                }
            }
            else {
                if (llllIlIlIIlllll(lllllllllllllIIIIlIIllIllIIlIIII.allocateSmall(this, lllllllllllllIIIIlIIllIllIIlIlII, lllllllllllllIIIIlIIllIllIIIlllI, lllllllllllllIIIIlIIllIllIIlIIlI) ? 1 : 0)) {
                    return;
                }
                lllllllllllllIIIIlIIllIllIIllIII = smallIdx(lllllllllllllIIIIlIIllIllIIlIIlI);
                lllllllllllllIIIIlIIllIllIIlIlll = this.smallSubpagePools;
            }
            final byte lllllllllllllIIIIlIIllIllIIIlIlI = (byte)this;
            synchronized (this) {
                final PoolSubpage<T> lllllllllllllIIIIlIIllIllIIllIlI = lllllllllllllIIIIlIIllIllIIlIlll[lllllllllllllIIIIlIIllIllIIllIII];
                final PoolSubpage<T> lllllllllllllIIIIlIIllIllIIllIIl = lllllllllllllIIIIlIIllIllIIllIlI.next;
                if (llllIlIlIlIIIlI(lllllllllllllIIIIlIIllIllIIllIIl, lllllllllllllIIIIlIIllIllIIllIlI)) {
                    if (llllIlIlIlIIIII(PoolArena.$assertionsDisabled ? 1 : 0) && (!llllIlIlIIlllll(lllllllllllllIIIIlIIllIllIIllIIl.doNotDestroy ? 1 : 0) || llllIlIlIlIIIll(lllllllllllllIIIIlIIllIllIIllIIl.elemSize, lllllllllllllIIIIlIIllIllIIlIIlI))) {
                        throw new AssertionError();
                    }
                    final long lllllllllllllIIIIlIIllIllIIllIll = lllllllllllllIIIIlIIllIllIIllIIl.allocate();
                    if (llllIlIlIlIIIII(PoolArena.$assertionsDisabled ? 1 : 0) && llllIlIlIlIIlII(llllIlIlIlIIIIl(lllllllllllllIIIIlIIllIllIIllIll, 0L))) {
                        throw new AssertionError();
                    }
                    lllllllllllllIIIIlIIllIllIIllIIl.chunk.initBufWithSubpage(lllllllllllllIIIIlIIllIllIIlIlII, lllllllllllllIIIIlIIllIllIIllIll, lllllllllllllIIIIlIIllIllIIIlllI);
                    return;
                }
                else {
                    // monitorexit(this)
                    "".length();
                    if ("   ".length() < "   ".length()) {
                        return;
                    }
                }
            }
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            if (!llllIlIlIlIIlIl(lllllllllllllIIIIlIIllIllIIlIIlI, this.chunkSize)) {
                this.allocateHuge(lllllllllllllIIIIlIIllIllIIlIlII, lllllllllllllIIIIlIIllIllIIIlllI);
                return;
            }
            if (llllIlIlIIlllll(lllllllllllllIIIIlIIllIllIIlIIII.allocateNormal(this, lllllllllllllIIIIlIIllIllIIlIlII, lllllllllllllIIIIlIIllIllIIIlllI, lllllllllllllIIIIlIIllIllIIlIIlI) ? 1 : 0)) {
                return;
            }
        }
        this.allocateNormal(lllllllllllllIIIIlIIllIllIIlIlII, lllllllllllllIIIIlIIllIllIIIlllI, lllllllllllllIIIIlIIllIllIIlIIlI);
    }
    
    protected abstract PoolChunk<T> newUnpooledChunk(final int p0);
    
    private static String llllIlIlIIlIlII(final String lllllllllllllIIIIlIIllIIlllIlIIl, final String lllllllllllllIIIIlIIllIIlllIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIllIIlllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIllIIlllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIIllIIlllIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIIllIIlllIllIl.init(PoolArena.lIlIlllllIlllI[13], lllllllllllllIIIIlIIllIIlllIlllI);
            return new String(lllllllllllllIIIIlIIllIIlllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIllIIlllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIllIIlllIllII) {
            lllllllllllllIIIIlIIllIIlllIllII.printStackTrace();
            return null;
        }
    }
    
    PooledByteBuf<T> allocate(final PoolThreadCache lllllllllllllIIIIlIIllIlllIIIlll, final int lllllllllllllIIIIlIIllIlllIIIllI, final int lllllllllllllIIIIlIIllIlllIIIlIl) {
        final PooledByteBuf<T> lllllllllllllIIIIlIIllIlllIIIlII = this.newByteBuf(lllllllllllllIIIIlIIllIlllIIIlIl);
        this.allocate(lllllllllllllIIIIlIIllIlllIIIlll, lllllllllllllIIIIlIIllIlllIIIlII, lllllllllllllIIIIlIIllIlllIIIllI);
        return lllllllllllllIIIIlIIllIlllIIIlII;
    }
    
    PoolSubpage<T> findSubpagePoolHead(int lllllllllllllIIIIlIIllIlIlIlIIII) {
        int lllllllllllllIIIIlIIllIlIlIIllll = 0;
        PoolSubpage<T>[] lllllllllllllIIIIlIIllIlIlIIlllI = null;
        if (llllIlIlIIlllll(isTiny(lllllllllllllIIIIlIIllIlIlIlIIII) ? 1 : 0)) {
            final int lllllllllllllIIIIlIIllIlIlIlIIll = lllllllllllllIIIIlIIllIlIlIlIIII >>> PoolArena.lIlIlllllIlllI[10];
            final PoolSubpage<T>[] lllllllllllllIIIIlIIllIlIlIlIIlI = this.tinySubpagePools;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            lllllllllllllIIIIlIIllIlIlIIllll = PoolArena.lIlIlllllIlllI[3];
            lllllllllllllIIIIlIIllIlIlIlIIII >>>= PoolArena.lIlIlllllIlllI[11];
            while (llllIlIlIIlllll(lllllllllllllIIIIlIIllIlIlIlIIII)) {
                lllllllllllllIIIIlIIllIlIlIlIIII >>>= PoolArena.lIlIlllllIlllI[0];
                ++lllllllllllllIIIIlIIllIlIlIIllll;
                "".length();
                if (((0x8B ^ 0xB9 ^ (0x74 ^ 0x1D)) & (0x2C ^ 0x3C ^ (0x76 ^ 0x3D) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            lllllllllllllIIIIlIIllIlIlIIlllI = this.smallSubpagePools;
        }
        return lllllllllllllIIIIlIIllIlIlIIlllI[lllllllllllllIIIIlIIllIlIlIIllll];
    }
    
    protected abstract void memoryCopy(final T p0, final int p1, final T p2, final int p3, final int p4);
    
    private static boolean llllIlIlIlIIIII(final int lllllllllllllIIIIlIIllIIlIlllIIl) {
        return lllllllllllllIIIIlIIllIIlIlllIIl == 0;
    }
    
    private static void llllIlIlIIlIlll() {
        (lIlIlllllIlIIl = new String[PoolArena.lIlIlllllIlllI[24]])[PoolArena.lIlIlllllIlllI[3]] = llllIlIlIIlIIlI("EQQoJgIbESF9QQ==", "reXGa");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[0]] = llllIlIlIIlIIlI("ZnsjIRQjMDI8AHxzdnJN", "FSFYd");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[13]] = llllIlIlIIlIIlI("AQMvDA4fBzsmGxZceA==", "ofXOo");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[18]] = llllIlIlIIlIIll("9TxPA6MTCvm2DhA6+TyxqtFtqzsuvDKc", "hKCVu");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[10]] = llllIlIlIIlIlII("bS6hpzotbxuL9MqBdn2au77kX8wKvLa1", "jBOGB");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[19]] = llllIlIlIIlIIll("lkM5Z6ITIipLHsYtvGPge+GHXdFX3oqy", "GqRMm");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[20]] = llllIlIlIIlIIlI("IR0lBAlKBnlKAxZVZVocU0VgT1g=", "buPjb");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[21]] = llllIlIlIIlIIll("66ZQn5a6rcmgM9ygJ/wyHj0TBYp5Fozi", "lomRm");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[14]] = llllIlIlIIlIIlI("MAokOSRbEXh3LgdCYGd/Vlg=", "sbQWO");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[4]] = llllIlIlIIlIIll("ukax6/d1zRC8iN+6EiF4RA==", "jmpCl");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[11]] = llllIlIlIIlIIlI("SUw=", "slIgx");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[22]] = llllIlIlIIlIlII("FZxKB/aZ6OinoWnbWE1bSQ==", "Cipve");
        PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[23]] = llllIlIlIIlIIll("JowUrmK5kVc=", "jMRMp");
    }
    
    private static boolean llllIlIlIlIIIll(final int lllllllllllllIIIIlIIllIIlIllIIII, final int lllllllllllllIIIIlIIllIIlIlIllll) {
        return lllllllllllllIIIIlIIllIIlIllIIII != lllllllllllllIIIIlIIllIIlIlIllll;
    }
    
    @Override
    public synchronized String toString() {
        final StringBuilder lllllllllllllIIIIlIIllIlIIIlIIII = new StringBuilder();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[18]]);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(this.qInit);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[10]]);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(this.q000);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[19]]);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(this.q025);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[20]]);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(this.q050);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[21]]);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(this.q075);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[14]]);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(this.q100);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[4]]);
        "".length();
        int lllllllllllllIIIIlIIllIlIIIlIlIl = PoolArena.lIlIlllllIlllI[0];
        while (llllIlIlIIllllI(lllllllllllllIIIIlIIllIlIIIlIlIl, this.tinySubpagePools.length)) {
            final PoolSubpage<T> lllllllllllllIIIIlIIllIlIIIlIlll = this.tinySubpagePools[lllllllllllllIIIIlIIllIlIIIlIlIl];
            if (llllIlIlIlIllII(lllllllllllllIIIIlIIllIlIIIlIlll.next, lllllllllllllIIIIlIIllIlIIIlIlll)) {
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
                "".length();
                lllllllllllllIIIIlIIllIlIIIlIIII.append(lllllllllllllIIIIlIIllIlIIIlIlIl);
                "".length();
                lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[11]]);
                "".length();
                PoolSubpage<T> lllllllllllllIIIIlIIllIlIIIlIllI = lllllllllllllIIIIlIIllIlIIIlIlll.next;
                do {
                    lllllllllllllIIIIlIIllIlIIIlIIII.append(lllllllllllllIIIIlIIllIlIIIlIllI);
                    "".length();
                    lllllllllllllIIIIlIIllIlIIIlIllI = lllllllllllllIIIIlIIllIlIIIlIllI.next;
                } while (!llllIlIlIlIllII(lllllllllllllIIIIlIIllIlIIIlIllI, lllllllllllllIIIIlIIllIlIIIlIlll));
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return null;
                }
            }
            ++lllllllllllllIIIIlIIllIlIIIlIlIl;
            "".length();
            if (((0xAA ^ 0xC7 ^ (0x65 ^ 0x1B)) & (92 + 83 - 89 + 95 ^ 59 + 75 - 110 + 142 ^ -" ".length())) > "   ".length()) {
                return null;
            }
        }
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[22]]);
        "".length();
        int lllllllllllllIIIIlIIllIlIIIlIIlI = PoolArena.lIlIlllllIlllI[0];
        while (llllIlIlIIllllI(lllllllllllllIIIIlIIllIlIIIlIIlI, this.smallSubpagePools.length)) {
            final PoolSubpage<T> lllllllllllllIIIIlIIllIlIIIlIlII = this.smallSubpagePools[lllllllllllllIIIIlIIllIlIIIlIIlI];
            if (llllIlIlIlIllII(lllllllllllllIIIIlIIllIlIIIlIlII.next, lllllllllllllIIIIlIIllIlIIIlIlII)) {
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
                "".length();
                lllllllllllllIIIIlIIllIlIIIlIIII.append(lllllllllllllIIIIlIIllIlIIIlIIlI);
                "".length();
                lllllllllllllIIIIlIIllIlIIIlIIII.append(PoolArena.lIlIlllllIlIIl[PoolArena.lIlIlllllIlllI[23]]);
                "".length();
                PoolSubpage<T> lllllllllllllIIIIlIIllIlIIIlIIll = lllllllllllllIIIIlIIllIlIIIlIlII.next;
                do {
                    lllllllllllllIIIIlIIllIlIIIlIIII.append(lllllllllllllIIIIlIIllIlIIIlIIll);
                    "".length();
                    lllllllllllllIIIIlIIllIlIIIlIIll = lllllllllllllIIIIlIIllIlIIIlIIll.next;
                } while (!llllIlIlIlIllII(lllllllllllllIIIIlIIllIlIIIlIIll, lllllllllllllIIIIlIIllIlIIIlIlII));
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return null;
                }
            }
            ++lllllllllllllIIIIlIIllIlIIIlIIlI;
            "".length();
            if (-(0xBE ^ 0x94 ^ (0x41 ^ 0x6E)) >= 0) {
                return null;
            }
        }
        lllllllllllllIIIIlIIllIlIIIlIIII.append(StringUtil.NEWLINE);
        "".length();
        return String.valueOf(lllllllllllllIIIIlIIllIlIIIlIIII);
    }
    
    void free(final PoolChunk<T> lllllllllllllIIIIlIIllIlIlIlllIl, final long lllllllllllllIIIIlIIllIlIllIIIII, final int lllllllllllllIIIIlIIllIlIlIlllll) {
        if (llllIlIlIIlllll(lllllllllllllIIIIlIIllIlIlIlllIl.unpooled ? 1 : 0)) {
            this.destroyChunk(lllllllllllllIIIIlIIllIlIlIlllIl);
            "".length();
            if ((0x1E ^ 0x7F ^ (0xF7 ^ 0x92)) < " ".length()) {
                return;
            }
        }
        else {
            final PoolThreadCache lllllllllllllIIIIlIIllIlIllIIIll = this.parent.threadCache.get();
            if (llllIlIlIIlllll(lllllllllllllIIIIlIIllIlIllIIIll.add(this, lllllllllllllIIIIlIIllIlIlIlllIl, lllllllllllllIIIIlIIllIlIllIIIII, lllllllllllllIIIIlIIllIlIlIlllll) ? 1 : 0)) {
                return;
            }
            final float lllllllllllllIIIIlIIllIlIlIllIIl = (float)this;
            synchronized (this) {
                lllllllllllllIIIIlIIllIlIlIlllIl.parent.free(lllllllllllllIIIIlIIllIlIlIlllIl, lllllllllllllIIIIlIIllIlIllIIIII);
                // monitorexit(this)
                "".length();
                if ((0x3C ^ 0x39) == 0x0) {
                    return;
                }
            }
        }
    }
    
    static final class HeapArena extends PoolArena<byte[]>
    {
        private static final /* synthetic */ int[] llIlllIllIlIlI;
        
        @Override
        protected PoolChunk<byte[]> newChunk(final int llllllllllllIllIIlIIIIllllIIIIll, final int llllllllllllIllIIlIIIIllllIIIlll, final int llllllllllllIllIIlIIIIllllIIIIIl, final int llllllllllllIllIIlIIIIllllIIIlIl) {
            return new PoolChunk<byte[]>(this, new byte[llllllllllllIllIIlIIIIllllIIIlIl], llllllllllllIllIIlIIIIllllIIIIll, llllllllllllIllIIlIIIIllllIIIlll, llllllllllllIllIIlIIIIllllIIIIIl, llllllllllllIllIIlIIIIllllIIIlIl);
        }
        
        @Override
        protected PoolChunk<byte[]> newUnpooledChunk(final int llllllllllllIllIIlIIIIlllIlllIlI) {
            return new PoolChunk<byte[]>(this, new byte[llllllllllllIllIIlIIIIlllIlllIlI], llllllllllllIllIIlIIIIlllIlllIlI);
        }
        
        private static void lIIllIlIIIIlIlII() {
            (llIlllIllIlIlI = new int[1])[0] = ((0x7A ^ 0x23) & ~(0x78 ^ 0x21));
        }
        
        @Override
        protected void destroyChunk(final PoolChunk<byte[]> llllllllllllIllIIlIIIIlllIlllIII) {
        }
        
        @Override
        boolean isDirect() {
            return HeapArena.llIlllIllIlIlI[0] != 0;
        }
        
        private static boolean lIIllIlIIIIlIlIl(final int llllllllllllIllIIlIIIIlllIIlIIII) {
            return llllllllllllIllIIlIIIIlllIIlIIII == 0;
        }
        
        static {
            lIIllIlIIIIlIlII();
        }
        
        @Override
        protected PooledByteBuf<byte[]> newByteBuf(final int llllllllllllIllIIlIIIIlllIllIlII) {
            return PooledHeapByteBuf.newInstance(llllllllllllIllIIlIIIIlllIllIlII);
        }
        
        @Override
        protected void memoryCopy(final byte[] llllllllllllIllIIlIIIIlllIlIllIl, final int llllllllllllIllIIlIIIIlllIlIllII, final byte[] llllllllllllIllIIlIIIIlllIlIlIll, final int llllllllllllIllIIlIIIIlllIlIIlIl, final int llllllllllllIllIIlIIIIlllIlIIlII) {
            if (lIIllIlIIIIlIlIl(llllllllllllIllIIlIIIIlllIlIIlII)) {
                return;
            }
            System.arraycopy(llllllllllllIllIIlIIIIlllIlIllIl, llllllllllllIllIIlIIIIlllIlIllII, llllllllllllIllIIlIIIIlllIlIlIll, llllllllllllIllIIlIIIIlllIlIIlIl, llllllllllllIllIIlIIIIlllIlIIlII);
        }
        
        HeapArena(final PooledByteBufAllocator llllllllllllIllIIlIIIIllllIlIlII, final int llllllllllllIllIIlIIIIllllIllIIl, final int llllllllllllIllIIlIIIIllllIllIII, final int llllllllllllIllIIlIIIIllllIlIIIl, final int llllllllllllIllIIlIIIIllllIlIllI) {
            super(llllllllllllIllIIlIIIIllllIlIlII, llllllllllllIllIIlIIIIllllIllIIl, llllllllllllIllIIlIIIIllllIllIII, llllllllllllIllIIlIIIIllllIlIIIl, llllllllllllIllIIlIIIIllllIlIllI);
        }
    }
    
    static final class DirectArena extends PoolArena<ByteBuffer>
    {
        private static final /* synthetic */ int[] lIIIllIIlIIlIl;
        private static final /* synthetic */ boolean HAS_UNSAFE;
        
        private static void llIIIIllIlIlIll() {
            (lIIIllIIlIIlIl = new int[1])[0] = " ".length();
        }
        
        @Override
        protected void memoryCopy(ByteBuffer lllllllllllllIlIIIIIlIlIlIIIllII, final int lllllllllllllIlIIIIIlIlIlIIIlIll, ByteBuffer lllllllllllllIlIIIIIlIlIlIIIllll, final int lllllllllllllIlIIIIIlIlIlIIIlIIl, final int lllllllllllllIlIIIIIlIlIlIIIllIl) {
            if (llIIIIllIlIllIl(lllllllllllllIlIIIIIlIlIlIIIllIl)) {
                return;
            }
            if (llIIIIllIlIllII(DirectArena.HAS_UNSAFE ? 1 : 0)) {
                PlatformDependent.copyMemory(PlatformDependent.directBufferAddress(lllllllllllllIlIIIIIlIlIlIIIllII) + lllllllllllllIlIIIIIlIlIlIIIlIll, PlatformDependent.directBufferAddress(lllllllllllllIlIIIIIlIlIlIIIllll) + lllllllllllllIlIIIIIlIlIlIIIlIIl, lllllllllllllIlIIIIIlIlIlIIIllIl);
                "".length();
                if ((0xC2 ^ 0x83 ^ (0x7C ^ 0x39)) <= ((98 + 159 - 247 + 188 ^ 90 + 63 - 70 + 48) & (0x65 ^ 0x3D ^ (0x16 ^ 0xB) ^ -" ".length()))) {
                    return;
                }
            }
            else {
                lllllllllllllIlIIIIIlIlIlIIIllII = lllllllllllllIlIIIIIlIlIlIIIllII.duplicate();
                lllllllllllllIlIIIIIlIlIlIIIllll = lllllllllllllIlIIIIIlIlIlIIIllll.duplicate();
                lllllllllllllIlIIIIIlIlIlIIIllII.position(lllllllllllllIlIIIIIlIlIlIIIlIll).limit(lllllllllllllIlIIIIIlIlIlIIIlIll + lllllllllllllIlIIIIIlIlIlIIIllIl);
                "".length();
                lllllllllllllIlIIIIIlIlIlIIIllll.position(lllllllllllllIlIIIIIlIlIlIIIlIIl);
                "".length();
                lllllllllllllIlIIIIIlIlIlIIIllll.put(lllllllllllllIlIIIIIlIlIlIIIllII);
                "".length();
            }
        }
        
        @Override
        protected PooledByteBuf<ByteBuffer> newByteBuf(final int lllllllllllllIlIIIIIlIlIlIIllIIl) {
            if (llIIIIllIlIllII(DirectArena.HAS_UNSAFE ? 1 : 0)) {
                return PooledUnsafeDirectByteBuf.newInstance(lllllllllllllIlIIIIIlIlIlIIllIIl);
            }
            return PooledDirectByteBuf.newInstance(lllllllllllllIlIIIIIlIlIlIIllIIl);
        }
        
        @Override
        boolean isDirect() {
            return DirectArena.lIIIllIIlIIlIl[0] != 0;
        }
        
        static {
            llIIIIllIlIlIll();
            HAS_UNSAFE = PlatformDependent.hasUnsafe();
        }
        
        DirectArena(final PooledByteBufAllocator lllllllllllllIlIIIIIlIlIllIIIIII, final int lllllllllllllIlIIIIIlIlIlIllllll, final int lllllllllllllIlIIIIIlIlIlIlllIII, final int lllllllllllllIlIIIIIlIlIlIllllIl, final int lllllllllllllIlIIIIIlIlIlIllIllI) {
            super(lllllllllllllIlIIIIIlIlIllIIIIII, lllllllllllllIlIIIIIlIlIlIllllll, lllllllllllllIlIIIIIlIlIlIlllIII, lllllllllllllIlIIIIIlIlIlIllllIl, lllllllllllllIlIIIIIlIlIlIllIllI);
        }
        
        @Override
        protected PoolChunk<ByteBuffer> newChunk(final int lllllllllllllIlIIIIIlIlIlIlIlllI, final int lllllllllllllIlIIIIIlIlIlIlIlIII, final int lllllllllllllIlIIIIIlIlIlIlIllII, final int lllllllllllllIlIIIIIlIlIlIlIIllI) {
            return new PoolChunk<ByteBuffer>(this, ByteBuffer.allocateDirect(lllllllllllllIlIIIIIlIlIlIlIIllI), lllllllllllllIlIIIIIlIlIlIlIlllI, lllllllllllllIlIIIIIlIlIlIlIlIII, lllllllllllllIlIIIIIlIlIlIlIllII, lllllllllllllIlIIIIIlIlIlIlIIllI);
        }
        
        private static boolean llIIIIllIlIllII(final int lllllllllllllIlIIIIIlIlIIlllIlII) {
            return lllllllllllllIlIIIIIlIlIIlllIlII != 0;
        }
        
        private static boolean llIIIIllIlIllIl(final int lllllllllllllIlIIIIIlIlIIlllIIlI) {
            return lllllllllllllIlIIIIIlIlIIlllIIlI == 0;
        }
        
        @Override
        protected void destroyChunk(final PoolChunk<ByteBuffer> lllllllllllllIlIIIIIlIlIlIIlllIl) {
            PlatformDependent.freeDirectBuffer(lllllllllllllIlIIIIIlIlIlIIlllIl.memory);
        }
        
        @Override
        protected PoolChunk<ByteBuffer> newUnpooledChunk(final int lllllllllllllIlIIIIIlIlIlIlIIIII) {
            return new PoolChunk<ByteBuffer>(this, ByteBuffer.allocateDirect(lllllllllllllIlIIIIIlIlIlIlIIIII), lllllllllllllIlIIIIIlIlIlIlIIIII);
        }
    }
}
