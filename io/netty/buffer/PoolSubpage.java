// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

final class PoolSubpage<T>
{
    /* synthetic */ int elemSize;
    private final /* synthetic */ int runOffset;
    private static final /* synthetic */ String[] llIIlIIlIIlIII;
    /* synthetic */ PoolSubpage<T> next;
    final /* synthetic */ PoolChunk<T> chunk;
    private final /* synthetic */ int pageSize;
    private /* synthetic */ int bitmapLength;
    private final /* synthetic */ long[] bitmap;
    private final /* synthetic */ int memoryMapIdx;
    /* synthetic */ PoolSubpage<T> prev;
    static final /* synthetic */ boolean $assertionsDisabled;
    private /* synthetic */ int maxNumElems;
    private static final /* synthetic */ int[] llIIlIIlIIlIIl;
    private /* synthetic */ int nextAvail;
    private /* synthetic */ int numAvail;
    /* synthetic */ boolean doNotDestroy;
    
    static {
        lIIIllIIIlIIIIII();
        lIIIllIIIIllllll();
        int $assertionsDisabled2;
        if (lIIIllIIIlIIIlII(PoolSubpage.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = PoolSubpage.llIIlIIlIIlIIl[2];
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = PoolSubpage.llIIlIIlIIlIIl[3];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
    
    private int findNextAvail() {
        final long[] llllllllllllIlllIIlIlIlllIlIllll = this.bitmap;
        final int llllllllllllIlllIIlIlIlllIlIlllI = this.bitmapLength;
        int llllllllllllIlllIIlIlIlllIllIIIl = PoolSubpage.llIIlIIlIIlIIl[3];
        while (lIIIllIIIlIIIIlI(llllllllllllIlllIIlIlIlllIllIIIl, llllllllllllIlllIIlIlIlllIlIlllI)) {
            final long llllllllllllIlllIIlIlIlllIllIIlI = llllllllllllIlllIIlIlIlllIlIllll[llllllllllllIlllIIlIlIlllIllIIIl];
            if (lIIIllIIIlIIIIIl(lIIIllIIIlIIlIll(~llllllllllllIlllIIlIlIlllIllIIlI, 0L))) {
                return this.findNextAvail0(llllllllllllIlllIIlIlIlllIllIIIl, llllllllllllIlllIIlIlIlllIllIIlI);
            }
            ++llllllllllllIlllIIlIlIlllIllIIIl;
            "".length();
            if (null != null) {
                return (20 + 30 + 53 + 51 ^ 101 + 77 - 113 + 66) & (0x79 ^ 0x4C ^ (0x3C ^ 0x10) ^ -" ".length());
            }
        }
        return PoolSubpage.llIIlIIlIIlIIl[0];
    }
    
    private long toHandle(final int llllllllllllIlllIIlIlIlllIIlIIII) {
        return 0x4000000000000000L | (long)llllllllllllIlllIIlIlIlllIIlIIII << PoolSubpage.llIIlIIlIIlIIl[7] | (long)this.memoryMapIdx;
    }
    
    private static boolean lIIIllIIIlIIlIII(final Object llllllllllllIlllIIlIlIllIllIIlIl) {
        return llllllllllllIlllIIlIlIllIllIIlIl == null;
    }
    
    private static boolean lIIIllIIIlIIIlII(final int llllllllllllIlllIIlIlIllIllIIIIl) {
        return llllllllllllIlllIIlIlIllIllIIIIl == 0;
    }
    
    private static boolean lIIIllIIIlIIlIlI(final int llllllllllllIlllIIlIlIllIlIlllll) {
        return llllllllllllIlllIIlIlIllIlIlllll >= 0;
    }
    
    private int getNextAvail() {
        final int llllllllllllIlllIIlIlIlllIlllIlI = this.nextAvail;
        if (lIIIllIIIlIIlIlI(llllllllllllIlllIIlIlIlllIlllIlI)) {
            this.nextAvail = PoolSubpage.llIIlIIlIIlIIl[0];
            return llllllllllllIlllIIlIlIlllIlllIlI;
        }
        return this.findNextAvail();
    }
    
    private static boolean lIIIllIIIlIIIIIl(final int llllllllllllIlllIIlIlIllIllIIIll) {
        return llllllllllllIlllIIlIlIllIllIIIll != 0;
    }
    
    private void setNextAvail(final int llllllllllllIlllIIlIlIlllIlllllI) {
        this.nextAvail = llllllllllllIlllIIlIlIlllIlllllI;
    }
    
    private void removeFromPool() {
        if (lIIIllIIIlIIIlII(PoolSubpage.$assertionsDisabled ? 1 : 0) && (!lIIIllIIIlIIlIIl(this.prev) || lIIIllIIIlIIlIII(this.next))) {
            throw new AssertionError();
        }
        this.prev.next = this.next;
        this.next.prev = this.prev;
        this.next = null;
        this.prev = null;
    }
    
    private static String lIIIllIIIIllllIl(final String llllllllllllIlllIIlIlIlllIIIIIIl, final String llllllllllllIlllIIlIlIlllIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIlIlllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIlIlllIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIlIlllIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIlIlllIIIIlIl.init(PoolSubpage.llIIlIIlIIlIIl[9], llllllllllllIlllIIlIlIlllIIIIllI);
            return new String(llllllllllllIlllIIlIlIlllIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlIlllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIlIlllIIIIlII) {
            llllllllllllIlllIIlIlIlllIIIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        if (lIIIllIIIlIIIlII(this.doNotDestroy ? 1 : 0)) {
            return String.valueOf(new StringBuilder().append(PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[3]]).append(this.memoryMapIdx).append(PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[2]]));
        }
        return String.valueOf(new StringBuilder().append(String.valueOf((char)PoolSubpage.llIIlIIlIIlIIl[8])).append(this.memoryMapIdx).append(PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[9]]).append(this.maxNumElems - this.numAvail).append((char)PoolSubpage.llIIlIIlIIlIIl[10]).append(this.maxNumElems).append(PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[11]]).append(this.runOffset).append(PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[12]]).append(this.pageSize).append(PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[13]]).append(this.elemSize).append((char)PoolSubpage.llIIlIIlIIlIIl[14]));
    }
    
    long allocate() {
        if (lIIIllIIIlIIIlII(this.elemSize)) {
            return this.toHandle(PoolSubpage.llIIlIIlIIlIIl[3]);
        }
        if (!lIIIllIIIlIIIIIl(this.numAvail) || lIIIllIIIlIIIlII(this.doNotDestroy ? 1 : 0)) {
            return -1L;
        }
        final int llllllllllllIlllIIlIlIllllIlllll = this.getNextAvail();
        final int llllllllllllIlllIIlIlIllllIllllI = llllllllllllIlllIIlIlIllllIlllll >>> PoolSubpage.llIIlIIlIIlIIl[4];
        final int llllllllllllIlllIIlIlIllllIlllIl = llllllllllllIlllIIlIlIllllIlllll & PoolSubpage.llIIlIIlIIlIIl[5];
        if (lIIIllIIIlIIIlII(PoolSubpage.$assertionsDisabled ? 1 : 0) && lIIIllIIIlIIIIIl(lIIIllIIIlIIIIll(this.bitmap[llllllllllllIlllIIlIlIllllIllllI] >>> llllllllllllIlllIIlIlIllllIlllIl & 0x1L, 0L))) {
            throw new AssertionError();
        }
        final long[] bitmap = this.bitmap;
        final int n = llllllllllllIlllIIlIlIllllIllllI;
        bitmap[n] |= 1L << llllllllllllIlllIIlIlIllllIlllIl;
        final int n2 = this.numAvail - PoolSubpage.llIIlIIlIIlIIl[2];
        this.numAvail = n2;
        if (lIIIllIIIlIIIlII(n2)) {
            this.removeFromPool();
        }
        return this.toHandle(llllllllllllIlllIIlIlIllllIlllll);
    }
    
    private static boolean lIIIllIIIlIIIIlI(final int llllllllllllIlllIIlIlIllIllIlllI, final int llllllllllllIlllIIlIlIllIllIllIl) {
        return llllllllllllIlllIIlIlIllIllIlllI < llllllllllllIlllIIlIlIllIllIllIl;
    }
    
    private static int lIIIllIIIlIIllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIllIIIlIIIllI(final int llllllllllllIlllIIlIlIllIlIlllII, final int llllllllllllIlllIIlIlIllIlIllIll) {
        return llllllllllllIlllIIlIlIllIlIlllII != llllllllllllIlllIIlIlIllIlIllIll;
    }
    
    private static boolean lIIIllIIIlIIIlll(final Object llllllllllllIlllIIlIlIllIllIlIlI, final Object llllllllllllIlllIIlIlIllIllIlIIl) {
        return llllllllllllIlllIIlIlIllIllIlIlI == llllllllllllIlllIIlIlIllIllIlIIl;
    }
    
    private void addToPool() {
        final PoolSubpage<T> llllllllllllIlllIIlIlIllllIIlIIl = this.chunk.arena.findSubpagePoolHead(this.elemSize);
        if (lIIIllIIIlIIIlII(PoolSubpage.$assertionsDisabled ? 1 : 0) && (!lIIIllIIIlIIlIII(this.prev) || lIIIllIIIlIIlIIl(this.next))) {
            throw new AssertionError();
        }
        this.prev = llllllllllllIlllIIlIlIllllIIlIIl;
        this.next = llllllllllllIlllIIlIlIllllIIlIIl.next;
        this.next.prev = this;
        llllllllllllIlllIIlIlIllllIIlIIl.next = this;
    }
    
    boolean free(final int llllllllllllIlllIIlIlIllllIlIIll) {
        if (lIIIllIIIlIIIlII(this.elemSize)) {
            return PoolSubpage.llIIlIIlIIlIIl[2] != 0;
        }
        final int llllllllllllIlllIIlIlIllllIlIIlI = llllllllllllIlllIIlIlIllllIlIIll >>> PoolSubpage.llIIlIIlIIlIIl[4];
        final int llllllllllllIlllIIlIlIllllIlIIIl = llllllllllllIlllIIlIlIllllIlIIll & PoolSubpage.llIIlIIlIIlIIl[5];
        if (lIIIllIIIlIIIlII(PoolSubpage.$assertionsDisabled ? 1 : 0) && lIIIllIIIlIIIlII(lIIIllIIIlIIIlIl(this.bitmap[llllllllllllIlllIIlIlIllllIlIIlI] >>> llllllllllllIlllIIlIlIllllIlIIIl & 0x1L, 0L))) {
            throw new AssertionError();
        }
        final long[] bitmap = this.bitmap;
        final int n = llllllllllllIlllIIlIlIllllIlIIlI;
        bitmap[n] ^= 1L << llllllllllllIlllIIlIlIllllIlIIIl;
        this.setNextAvail(llllllllllllIlllIIlIlIllllIlIIll);
        final int numAvail = this.numAvail;
        this.numAvail = numAvail + PoolSubpage.llIIlIIlIIlIIl[2];
        if (lIIIllIIIlIIIlII(numAvail)) {
            this.addToPool();
            return PoolSubpage.llIIlIIlIIlIIl[2] != 0;
        }
        if (lIIIllIIIlIIIllI(this.numAvail, this.maxNumElems)) {
            return PoolSubpage.llIIlIIlIIlIIl[2] != 0;
        }
        if (lIIIllIIIlIIIlll(this.prev, this.next)) {
            return PoolSubpage.llIIlIIlIIlIIl[2] != 0;
        }
        this.doNotDestroy = (PoolSubpage.llIIlIIlIIlIIl[3] != 0);
        this.removeFromPool();
        return PoolSubpage.llIIlIIlIIlIIl[3] != 0;
    }
    
    private int findNextAvail0(final int llllllllllllIlllIIlIlIlllIIllIIl, long llllllllllllIlllIIlIlIlllIIllIII) {
        final int llllllllllllIlllIIlIlIlllIIlllII = this.maxNumElems;
        final int llllllllllllIlllIIlIlIlllIIllIll = llllllllllllIlllIIlIlIlllIIllIIl << PoolSubpage.llIIlIIlIIlIIl[4];
        int llllllllllllIlllIIlIlIlllIlIIIII = PoolSubpage.llIIlIIlIIlIIl[3];
        while (lIIIllIIIlIIIIlI(llllllllllllIlllIIlIlIlllIlIIIII, PoolSubpage.llIIlIIlIIlIIl[6])) {
            if (lIIIllIIIlIIIlII(lIIIllIIIlIIllII(llllllllllllIlllIIlIlIlllIIllIII & 0x1L, 0L))) {
                final int llllllllllllIlllIIlIlIlllIlIIIIl = llllllllllllIlllIIlIlIlllIIllIll | llllllllllllIlllIIlIlIlllIlIIIII;
                if (lIIIllIIIlIIIIlI(llllllllllllIlllIIlIlIlllIlIIIIl, llllllllllllIlllIIlIlIlllIIlllII)) {
                    return llllllllllllIlllIIlIlIlllIlIIIIl;
                }
                break;
            }
            else {
                llllllllllllIlllIIlIlIlllIIllIII >>>= PoolSubpage.llIIlIIlIIlIIl[2];
                ++llllllllllllIlllIIlIlIlllIlIIIII;
                "".length();
                if ("   ".length() == 0) {
                    return (0x50 ^ 0x1C ^ (0xF2 ^ 0x86)) & (61 + 36 + 17 + 31 ^ 150 + 153 - 301 + 167 ^ -" ".length());
                }
                continue;
            }
        }
        return PoolSubpage.llIIlIIlIIlIIl[0];
    }
    
    private static void lIIIllIIIIllllll() {
        (llIIlIIlIIlIII = new String[PoolSubpage.llIIlIIlIIlIIl[4]])[PoolSubpage.llIIlIIlIIlIIl[3]] = lIIIllIIIIllllIl("d+hUODuS47U=", "SEPbb");
        PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[2]] = lIIIllIIIIlllllI("sfbykAMbP58YM4uTQCLEQw==", "fAknm");
        PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[9]] = lIIIllIIIIllllIl("CQEoIBfQf7c=", "FfAnt");
        PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[11]] = lIIIllIIIIlllllI("8TBDQ8hdfJBMonmxBfKRiA==", "klHzB");
        PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[12]] = lIIIllIIIIlllllI("gJTesDGvM11aIE1+esO4hw==", "HhBsr");
        PoolSubpage.llIIlIIlIIlIII[PoolSubpage.llIIlIIlIIlIIl[13]] = lIIIllIIIIlllllI("QZsQ6TnCqlFGO/aoXJaJHQ==", "LMHsM");
    }
    
    PoolSubpage(final PoolChunk<T> llllllllllllIlllIIlIlIllllllIIlI, final int llllllllllllIlllIIlIlIllllllIlll, final int llllllllllllIlllIIlIlIllllllIllI, final int llllllllllllIlllIIlIlIllllllIlIl, final int llllllllllllIlllIIlIlIlllllIlllI) {
        this.chunk = llllllllllllIlllIIlIlIllllllIIlI;
        this.memoryMapIdx = llllllllllllIlllIIlIlIllllllIlll;
        this.runOffset = llllllllllllIlllIIlIlIllllllIllI;
        this.pageSize = llllllllllllIlllIIlIlIllllllIlIl;
        this.bitmap = new long[llllllllllllIlllIIlIlIllllllIlIl >>> PoolSubpage.llIIlIIlIIlIIl[1]];
        this.init(llllllllllllIlllIIlIlIlllllIlllI);
    }
    
    private static int lIIIllIIIlIIIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String lIIIllIIIIlllllI(final String llllllllllllIlllIIlIlIllIlllIlII, final String llllllllllllIlllIIlIlIllIlllIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIlIllIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIlIllIlllIlIl.getBytes(StandardCharsets.UTF_8)), PoolSubpage.llIIlIIlIIlIIl[15]), "DES");
            final Cipher llllllllllllIlllIIlIlIllIllllIII = Cipher.getInstance("DES");
            llllllllllllIlllIIlIlIllIllllIII.init(PoolSubpage.llIIlIIlIIlIIl[9], llllllllllllIlllIIlIlIllIllllIIl);
            return new String(llllllllllllIlllIIlIlIllIllllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlIllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIlIllIlllIlll) {
            llllllllllllIlllIIlIlIllIlllIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIllIIIlIIIIII() {
        (llIIlIIlIIlIIl = new int[16])[0] = -" ".length();
        PoolSubpage.llIIlIIlIIlIIl[1] = (170 + 75 - 148 + 80 ^ 173 + 74 - 170 + 110);
        PoolSubpage.llIIlIIlIIlIIl[2] = " ".length();
        PoolSubpage.llIIlIIlIIlIIl[3] = ((0x74 ^ 0x7E) & ~(0x9A ^ 0x90));
        PoolSubpage.llIIlIIlIIlIIl[4] = (92 + 134 - 149 + 109 ^ 115 + 26 - 57 + 104);
        PoolSubpage.llIIlIIlIIlIIl[5] = (0x22 ^ 0x1D);
        PoolSubpage.llIIlIIlIIlIIl[6] = (224 + 129 - 163 + 58 ^ 31 + 39 - 31 + 145);
        PoolSubpage.llIIlIIlIIlIIl[7] = (0x9B ^ 0xBB ^ ((0xE4 ^ 0xAF) & ~(0x19 ^ 0x52)));
        PoolSubpage.llIIlIIlIIlIIl[8] = (0x2C ^ 0x4);
        PoolSubpage.llIIlIIlIIlIIl[9] = "  ".length();
        PoolSubpage.llIIlIIlIIlIIl[10] = (0x8B ^ 0xA4);
        PoolSubpage.llIIlIIlIIlIIl[11] = "   ".length();
        PoolSubpage.llIIlIIlIIlIIl[12] = (0xAF ^ 0xAB);
        PoolSubpage.llIIlIIlIIlIIl[13] = (0x92 ^ 0x97);
        PoolSubpage.llIIlIIlIIlIIl[14] = (0x78 ^ 0x42 ^ (0xA6 ^ 0xB5));
        PoolSubpage.llIIlIIlIIlIIl[15] = (0xE ^ 0x3A ^ (0x56 ^ 0x6A));
    }
    
    private static int lIIIllIIIlIIlIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    void init(final int llllllllllllIlllIIlIlIlllllIlIII) {
        this.doNotDestroy = (PoolSubpage.llIIlIIlIIlIIl[2] != 0);
        this.elemSize = llllllllllllIlllIIlIlIlllllIlIII;
        if (lIIIllIIIlIIIIIl(llllllllllllIlllIIlIlIlllllIlIII)) {
            final int n = this.pageSize / llllllllllllIlllIIlIlIlllllIlIII;
            this.numAvail = n;
            this.maxNumElems = n;
            this.nextAvail = PoolSubpage.llIIlIIlIIlIIl[3];
            this.bitmapLength = this.maxNumElems >>> PoolSubpage.llIIlIIlIIlIIl[4];
            if (lIIIllIIIlIIIIIl(this.maxNumElems & PoolSubpage.llIIlIIlIIlIIl[5])) {
                this.bitmapLength += PoolSubpage.llIIlIIlIIlIIl[2];
            }
            int llllllllllllIlllIIlIlIlllllIlIlI = PoolSubpage.llIIlIIlIIlIIl[3];
            while (lIIIllIIIlIIIIlI(llllllllllllIlllIIlIlIlllllIlIlI, this.bitmapLength)) {
                this.bitmap[llllllllllllIlllIIlIlIlllllIlIlI] = 0L;
                ++llllllllllllIlllIIlIlIlllllIlIlI;
                "".length();
                if (((0x2 ^ 0x5C) & ~(0x67 ^ 0x39)) != 0x0) {
                    return;
                }
            }
        }
        this.addToPool();
    }
    
    PoolSubpage(final int llllllllllllIlllIIlIllIIIIIIIIlI) {
        this.chunk = null;
        this.memoryMapIdx = PoolSubpage.llIIlIIlIIlIIl[0];
        this.runOffset = PoolSubpage.llIIlIIlIIlIIl[0];
        this.elemSize = PoolSubpage.llIIlIIlIIlIIl[0];
        this.pageSize = llllllllllllIlllIIlIllIIIIIIIIlI;
        this.bitmap = null;
    }
    
    private static int lIIIllIIIlIIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIIllIIIlIIlIIl(final Object llllllllllllIlllIIlIlIllIllIIlll) {
        return llllllllllllIlllIIlIlIllIllIIlll != null;
    }
}
