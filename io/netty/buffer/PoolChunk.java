// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

final class PoolChunk<T>
{
    private final /* synthetic */ byte[] memoryMap;
    private static final /* synthetic */ String[] lllIIIlIllllIl;
    private final /* synthetic */ byte[] depthMap;
    private final /* synthetic */ int pageShifts;
    private final /* synthetic */ int subpageOverflowMask;
    final /* synthetic */ PoolArena<T> arena;
    private final /* synthetic */ PoolSubpage<T>[] subpages;
    final /* synthetic */ boolean unpooled;
    private static final /* synthetic */ int[] lllIIIllIIllIl;
    private final /* synthetic */ int log2ChunkSize;
    private final /* synthetic */ int maxSubpageAllocs;
    final /* synthetic */ T memory;
    static final /* synthetic */ boolean $assertionsDisabled;
    private final /* synthetic */ byte unusable;
    private final /* synthetic */ int maxOrder;
    private /* synthetic */ int freeBytes;
    private final /* synthetic */ int pageSize;
    private final /* synthetic */ int chunkSize;
    
    PoolChunk(final PoolArena<T> llllllllllllIllIIIIIIIIIlIIIIllI, final T llllllllllllIllIIIIIIIIIlIIIIlII, final int llllllllllllIllIIIIIIIIIIlllIIll, final int llllllllllllIllIIIIIIIIIIlllllll, final int llllllllllllIllIIIIIIIIIIllllllI, final int llllllllllllIllIIIIIIIIIIlllllII) {
        this.unpooled = (PoolChunk.lllIIIllIIllIl[0] != 0);
        this.arena = llllllllllllIllIIIIIIIIIlIIIIllI;
        this.memory = llllllllllllIllIIIIIIIIIlIIIIlII;
        this.pageSize = llllllllllllIllIIIIIIIIIIlllIIll;
        this.pageShifts = llllllllllllIllIIIIIIIIIIllllllI;
        this.maxOrder = llllllllllllIllIIIIIIIIIIlllllll;
        this.chunkSize = llllllllllllIllIIIIIIIIIIlllllII;
        this.unusable = (byte)(llllllllllllIllIIIIIIIIIIlllllll + PoolChunk.lllIIIllIIllIl[1]);
        this.log2ChunkSize = log2(llllllllllllIllIIIIIIIIIIlllllII);
        this.subpageOverflowMask = (llllllllllllIllIIIIIIIIIIlllIIll - PoolChunk.lllIIIllIIllIl[1] ^ PoolChunk.lllIIIllIIllIl[2]);
        this.freeBytes = llllllllllllIllIIIIIIIIIIlllllII;
        if (lIIlllIllllIllIl(PoolChunk.$assertionsDisabled ? 1 : 0) && lIIlllIllllIlllI(llllllllllllIllIIIIIIIIIIlllllll, PoolChunk.lllIIIllIIllIl[3])) {
            throw new AssertionError((Object)String.valueOf(new StringBuilder().append(PoolChunk.lllIIIlIllllIl[PoolChunk.lllIIIllIIllIl[0]]).append(llllllllllllIllIIIIIIIIIIlllllll)));
        }
        this.maxSubpageAllocs = PoolChunk.lllIIIllIIllIl[1] << llllllllllllIllIIIIIIIIIIlllllll;
        this.memoryMap = new byte[this.maxSubpageAllocs << PoolChunk.lllIIIllIIllIl[1]];
        this.depthMap = new byte[this.memoryMap.length];
        int llllllllllllIllIIIIIIIIIIllllIlI = PoolChunk.lllIIIllIIllIl[1];
        int llllllllllllIllIIIIIIIIIlIIIlIlI = PoolChunk.lllIIIllIIllIl[0];
        while (lIIlllIllllIllll(llllllllllllIllIIIIIIIIIlIIIlIlI, llllllllllllIllIIIIIIIIIIlllllll)) {
            final int llllllllllllIllIIIIIIIIIlIIIllII = PoolChunk.lllIIIllIIllIl[1] << llllllllllllIllIIIIIIIIIlIIIlIlI;
            int llllllllllllIllIIIIIIIIIlIIIllll = PoolChunk.lllIIIllIIllIl[0];
            while (lIIlllIlllllIIII(llllllllllllIllIIIIIIIIIlIIIllll, llllllllllllIllIIIIIIIIIlIIIllII)) {
                this.memoryMap[llllllllllllIllIIIIIIIIIIllllIlI] = (byte)llllllllllllIllIIIIIIIIIlIIIlIlI;
                this.depthMap[llllllllllllIllIIIIIIIIIIllllIlI] = (byte)llllllllllllIllIIIIIIIIIlIIIlIlI;
                ++llllllllllllIllIIIIIIIIIIllllIlI;
                ++llllllllllllIllIIIIIIIIIlIIIllll;
                "".length();
                if (((0x12 ^ 0x4) & ~(0xA6 ^ 0xB0)) != 0x0) {
                    throw null;
                }
            }
            ++llllllllllllIllIIIIIIIIIlIIIlIlI;
            "".length();
            if ("  ".length() != "  ".length()) {
                throw null;
            }
        }
        this.subpages = this.newSubpageArray(this.maxSubpageAllocs);
    }
    
    private int subpageIdx(final int llllllllllllIlIlllllllllIlIIIllI) {
        return llllllllllllIlIlllllllllIlIIIllI ^ this.maxSubpageAllocs;
    }
    
    private int allocateNode(final int llllllllllllIlIllllllllllllIIIII) {
        int llllllllllllIlIllllllllllllIIlIl = PoolChunk.lllIIIllIIllIl[1];
        final int llllllllllllIlIllllllllllllIIlII = -(PoolChunk.lllIIIllIIllIl[1] << llllllllllllIlIllllllllllllIIIII);
        byte llllllllllllIlIllllllllllllIIIll = this.value(llllllllllllIlIllllllllllllIIlIl);
        if (lIIlllIlllllIIlI(llllllllllllIlIllllllllllllIIIll, llllllllllllIlIllllllllllllIIIII)) {
            return PoolChunk.lllIIIllIIllIl[2];
        }
        while (!lIIlllIllllIlllI(llllllllllllIlIllllllllllllIIIll, llllllllllllIlIllllllllllllIIIII) || lIIlllIllllIllIl(llllllllllllIlIllllllllllllIIlIl & llllllllllllIlIllllllllllllIIlII)) {
            llllllllllllIlIllllllllllllIIlIl <<= PoolChunk.lllIIIllIIllIl[1];
            llllllllllllIlIllllllllllllIIIll = this.value(llllllllllllIlIllllllllllllIIlIl);
            if (lIIlllIlllllIIlI(llllllllllllIlIllllllllllllIIIll, llllllllllllIlIllllllllllllIIIII)) {
                llllllllllllIlIllllllllllllIIlIl ^= PoolChunk.lllIIIllIIllIl[1];
                llllllllllllIlIllllllllllllIIIll = this.value(llllllllllllIlIllllllllllllIIlIl);
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return (0xA1 ^ 0xA8 ^ (0x67 ^ 0x5F)) & (0x54 ^ 0x11 ^ (0xB5 ^ 0xC1) ^ -" ".length());
                }
                continue;
            }
        }
        final byte llllllllllllIlIllllllllllllIIIlI = this.value(llllllllllllIlIllllllllllllIIlIl);
        if (lIIlllIllllIllIl(PoolChunk.$assertionsDisabled ? 1 : 0) && (!lIIlllIlllllIlII(llllllllllllIlIllllllllllllIIIlI, llllllllllllIlIllllllllllllIIIII) || lIIlllIlllllIlll(llllllllllllIlIllllllllllllIIlIl & llllllllllllIlIllllllllllllIIlII, PoolChunk.lllIIIllIIllIl[1] << llllllllllllIlIllllllllllllIIIII))) {
            final String format = PoolChunk.lllIIIlIllllIl[PoolChunk.lllIIIllIIllIl[1]];
            final Object[] args = new Object[PoolChunk.lllIIIllIIllIl[6]];
            args[PoolChunk.lllIIIllIIllIl[0]] = llllllllllllIlIllllllllllllIIIlI;
            args[PoolChunk.lllIIIllIIllIl[1]] = (llllllllllllIlIllllllllllllIIlIl & llllllllllllIlIllllllllllllIIlII);
            args[PoolChunk.lllIIIllIIllIl[7]] = llllllllllllIlIllllllllllllIIIII;
            throw new AssertionError((Object)String.format(format, args));
        }
        this.setValue(llllllllllllIlIllllllllllllIIlIl, this.unusable);
        this.updateParentsAlloc(llllllllllllIlIllllllllllllIIlIl);
        return llllllllllllIlIllllllllllllIIlIl;
    }
    
    private void updateParentsAlloc(int llllllllllllIllIIIIIIIIIIIIIllll) {
        while (lIIlllIlllllIIlI(llllllllllllIllIIIIIIIIIIIIIllll, PoolChunk.lllIIIllIIllIl[1])) {
            final int llllllllllllIllIIIIIIIIIIIIllIll = llllllllllllIllIIIIIIIIIIIIIllll >>> PoolChunk.lllIIIllIIllIl[1];
            final byte llllllllllllIllIIIIIIIIIIIIllIIl = this.value(llllllllllllIllIIIIIIIIIIIIIllll);
            final byte llllllllllllIllIIIIIIIIIIIIlIlll = this.value(llllllllllllIllIIIIIIIIIIIIIllll ^ PoolChunk.lllIIIllIIllIl[1]);
            byte b;
            if (lIIlllIlllllIIII(llllllllllllIllIIIIIIIIIIIIllIIl, llllllllllllIllIIIIIIIIIIIIlIlll)) {
                b = llllllllllllIllIIIIIIIIIIIIllIIl;
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            else {
                b = llllllllllllIllIIIIIIIIIIIIlIlll;
            }
            final byte llllllllllllIllIIIIIIIIIIIIlIllI = b;
            this.setValue(llllllllllllIllIIIIIIIIIIIIllIll, llllllllllllIllIIIIIIIIIIIIlIllI);
            llllllllllllIllIIIIIIIIIIIIIllll = llllllllllllIllIIIIIIIIIIIIllIll;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private static boolean lIIlllIlllllIlll(final int llllllllllllIlIllllllllIlllllIlI, final int llllllllllllIlIllllllllIlllllIIl) {
        return llllllllllllIlIllllllllIlllllIlI != llllllllllllIlIllllllllIlllllIIl;
    }
    
    private static String lIIlllIllIllIIll(String llllllllllllIlIlllllllllIIllIIII, final String llllllllllllIlIlllllllllIIllIlII) {
        llllllllllllIlIlllllllllIIllIIII = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllllllllIIllIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllllllIIllIIll = new StringBuilder();
        final char[] llllllllllllIlIlllllllllIIllIIlI = llllllllllllIlIlllllllllIIllIlII.toCharArray();
        int llllllllllllIlIlllllllllIIllIIIl = PoolChunk.lllIIIllIIllIl[0];
        final double llllllllllllIlIlllllllllIIlIlIll = (Object)((String)llllllllllllIlIlllllllllIIllIIII).toCharArray();
        final double llllllllllllIlIlllllllllIIlIlIlI = llllllllllllIlIlllllllllIIlIlIll.length;
        char llllllllllllIlIlllllllllIIlIlIIl = (char)PoolChunk.lllIIIllIIllIl[0];
        while (lIIlllIlllllIIII(llllllllllllIlIlllllllllIIlIlIIl, (int)llllllllllllIlIlllllllllIIlIlIlI)) {
            final char llllllllllllIlIlllllllllIIllIllI = llllllllllllIlIlllllllllIIlIlIll[llllllllllllIlIlllllllllIIlIlIIl];
            llllllllllllIlIlllllllllIIllIIll.append((char)(llllllllllllIlIlllllllllIIllIllI ^ llllllllllllIlIlllllllllIIllIIlI[llllllllllllIlIlllllllllIIllIIIl % llllllllllllIlIlllllllllIIllIIlI.length]));
            "".length();
            ++llllllllllllIlIlllllllllIIllIIIl;
            ++llllllllllllIlIlllllllllIIlIlIIl;
            "".length();
            if (((0xEF ^ 0xA3 ^ (0xE3 ^ 0x9E)) & (178 + 127 - 230 + 166 ^ 165 + 34 - 10 + 3 ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllllllIIllIIll);
    }
    
    void free(final long llllllllllllIlIllllllllllIlIllII) {
        final int llllllllllllIlIllllllllllIlIllll = (int)llllllllllllIlIllllllllllIlIllII;
        final int llllllllllllIlIllllllllllIlIlllI = (int)(llllllllllllIlIllllllllllIlIllII >>> PoolChunk.lllIIIllIIllIl[8]);
        if (lIIlllIlllllIIIl(llllllllllllIlIllllllllllIlIlllI)) {
            final PoolSubpage<T> llllllllllllIlIllllllllllIllIIlI = this.subpages[this.subpageIdx(llllllllllllIlIllllllllllIlIllll)];
            if (lIIlllIllllIllIl(PoolChunk.$assertionsDisabled ? 1 : 0) && (!lIIlllIlllllllII(llllllllllllIlIllllllllllIllIIlI) || lIIlllIllllIllIl(llllllllllllIlIllllllllllIllIIlI.doNotDestroy ? 1 : 0))) {
                throw new AssertionError();
            }
            if (lIIlllIlllllIIIl(llllllllllllIlIllllllllllIllIIlI.free(llllllllllllIlIllllllllllIlIlllI & PoolChunk.lllIIIllIIllIl[9]) ? 1 : 0)) {
                return;
            }
        }
        this.freeBytes += this.runLength(llllllllllllIlIllllllllllIlIllll);
        this.setValue(llllllllllllIlIllllllllllIlIllll, this.depth(llllllllllllIlIllllllllllIlIllll));
        this.updateParentsFree(llllllllllllIlIllllllllllIlIllll);
    }
    
    private static boolean lIIlllIlllllIIII(final int llllllllllllIlIlllllllllIIIlIIII, final int llllllllllllIlIlllllllllIIIIllll) {
        return llllllllllllIlIlllllllllIIIlIIII < llllllllllllIlIlllllllllIIIIllll;
    }
    
    void initBufWithSubpage(final PooledByteBuf<T> llllllllllllIlIllllllllllIIIlllI, final long llllllllllllIlIllllllllllIIIllIl, final int llllllllllllIlIllllllllllIIIllII) {
        this.initBufWithSubpage(llllllllllllIlIllllllllllIIIlllI, llllllllllllIlIllllllllllIIIllIl, (int)(llllllllllllIlIllllllllllIIIllIl >>> PoolChunk.lllIIIllIIllIl[8]), llllllllllllIlIllllllllllIIIllII);
    }
    
    private static String lIIlllIllIllIlII(final String llllllllllllIlIlllllllllIIlIIIII, final String llllllllllllIlIlllllllllIIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllllllllIIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllllllIIIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllllllIIlIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllllllIIlIIIlI.init(PoolChunk.lllIIIllIIllIl[7], llllllllllllIlIlllllllllIIlIIIll);
            return new String(llllllllllllIlIlllllllllIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllllllIIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllllllIIlIIIIl) {
            llllllllllllIlIlllllllllIIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIllllllIll(final Object llllllllllllIlIlllllllllIIIIIIll) {
        return llllllllllllIlIlllllllllIIIIIIll == null;
    }
    
    private static int log2(final int llllllllllllIlIlllllllllIlIllIll) {
        return PoolChunk.lllIIIllIIllIl[10] - Integer.numberOfLeadingZeros(llllllllllllIlIlllllllllIlIllIll);
    }
    
    private long allocateRun(final int llllllllllllIlIlllllllllllIlIllI) {
        final int llllllllllllIlIlllllllllllIlIlIl = this.maxOrder - (log2(llllllllllllIlIlllllllllllIlIllI) - this.pageShifts);
        final int llllllllllllIlIlllllllllllIlIlII = this.allocateNode(llllllllllllIlIlllllllllllIlIlIl);
        if (lIIlllIllllllIIl(llllllllllllIlIlllllllllllIlIlII)) {
            return llllllllllllIlIlllllllllllIlIlII;
        }
        this.freeBytes -= this.runLength(llllllllllllIlIlllllllllllIlIlII);
        return llllllllllllIlIlllllllllllIlIlII;
    }
    
    private void setValue(final int llllllllllllIlIlllllllllIllIlIII, final byte llllllllllllIlIlllllllllIllIIlII) {
        this.memoryMap[llllllllllllIlIlllllllllIllIlIII] = llllllllllllIlIlllllllllIllIIlII;
    }
    
    int usage() {
        final int llllllllllllIllIIIIIIIIIIIlllIlI = this.freeBytes;
        if (lIIlllIllllIllIl(llllllllllllIllIIIIIIIIIIIlllIlI)) {
            return PoolChunk.lllIIIllIIllIl[4];
        }
        final int llllllllllllIllIIIIIIIIIIIlllIIl = (int)(llllllllllllIllIIIIIIIIIIIlllIlI * 100L / this.chunkSize);
        if (lIIlllIllllIllIl(llllllllllllIllIIIIIIIIIIIlllIIl)) {
            return PoolChunk.lllIIIllIIllIl[5];
        }
        return PoolChunk.lllIIIllIIllIl[4] - llllllllllllIllIIIIIIIIIIIlllIIl;
    }
    
    private static boolean lIIlllIlllllIlII(final int llllllllllllIlIlllllllllIIIllIII, final int llllllllllllIlIlllllllllIIIlIlll) {
        return llllllllllllIlIlllllllllIIIllIII == llllllllllllIlIlllllllllIIIlIlll;
    }
    
    private static void lIIlllIllIllIlIl() {
        (lllIIIlIllllIl = new String[PoolChunk.lllIIIllIIllIl[14]])[PoolChunk.lllIIIllIIllIl[0]] = lIIlllIllIllIIll("CjQbLiIDMBFBIw86Fg00RzcGQWxHZlNNcAUgF0E5FG9D", "gUcaP");
        PoolChunk.lllIIIlIllllIl[PoolChunk.lllIIIllIIllIl[1]] = lIIlllIllIllIlII("YGj6T+KwzuAv87Q1soGfCOPxe2OYsM7pVlig26NkHZhAMYjlaeOQBg==", "fbRef");
        PoolChunk.lllIIIlIllllIl[PoolChunk.lllIIIllIIllIl[7]] = lIIlllIllIllIIll("JA4bCxlP", "gfner");
        PoolChunk.lllIIIlIllllIl[PoolChunk.lllIIIllIIllIl[6]] = lIIlllIllIllIIll("YE4=", "ZnAqV");
        PoolChunk.lllIIIlIllllIl[PoolChunk.lllIIIllIIllIl[11]] = lIIlllIllIllIIll("TURl", "hhEGV");
    }
    
    private int runOffset(final int llllllllllllIlIlllllllllIlIIllIl) {
        final int llllllllllllIlIlllllllllIlIIllll = llllllllllllIlIlllllllllIlIIllIl ^ PoolChunk.lllIIIllIIllIl[1] << this.depth(llllllllllllIlIlllllllllIlIIllIl);
        return llllllllllllIlIlllllllllIlIIllll * this.runLength(llllllllllllIlIlllllllllIlIIllIl);
    }
    
    private PoolSubpage<T>[] newSubpageArray(final int llllllllllllIllIIIIIIIIIIlIIlIII) {
        return (PoolSubpage<T>[])new PoolSubpage[llllllllllllIllIIIIIIIIIIlIIlIII];
    }
    
    private static boolean lIIlllIllllllIIl(final int llllllllllllIlIllllllllIllllllIl) {
        return llllllllllllIlIllllllllIllllllIl < 0;
    }
    
    private static boolean lIIlllIllllIllIl(final int llllllllllllIlIllllllllIllllllll) {
        return llllllllllllIlIllllllllIllllllll == 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlIlllllllllIlIIIIlI = new StringBuilder();
        llllllllllllIlIlllllllllIlIIIIlI.append(PoolChunk.lllIIIlIllllIl[PoolChunk.lllIIIllIIllIl[7]]);
        "".length();
        llllllllllllIlIlllllllllIlIIIIlI.append(Integer.toHexString(System.identityHashCode(this)));
        "".length();
        llllllllllllIlIlllllllllIlIIIIlI.append(PoolChunk.lllIIIlIllllIl[PoolChunk.lllIIIllIIllIl[6]]);
        "".length();
        llllllllllllIlIlllllllllIlIIIIlI.append(this.usage());
        "".length();
        llllllllllllIlIlllllllllIlIIIIlI.append(PoolChunk.lllIIIlIllllIl[PoolChunk.lllIIIllIIllIl[11]]);
        "".length();
        llllllllllllIlIlllllllllIlIIIIlI.append(this.chunkSize - this.freeBytes);
        "".length();
        llllllllllllIlIlllllllllIlIIIIlI.append((char)PoolChunk.lllIIIllIIllIl[12]);
        "".length();
        llllllllllllIlIlllllllllIlIIIIlI.append(this.chunkSize);
        "".length();
        llllllllllllIlIlllllllllIlIIIIlI.append((char)PoolChunk.lllIIIllIIllIl[13]);
        "".length();
        return String.valueOf(llllllllllllIlIlllllllllIlIIIIlI);
    }
    
    private static boolean lIIlllIlllllIIlI(final int llllllllllllIlIlllllllllIIIIlIII, final int llllllllllllIlIlllllllllIIIIIlll) {
        return llllllllllllIlIlllllllllIIIIlIII > llllllllllllIlIlllllllllIIIIIlll;
    }
    
    private int runLength(final int llllllllllllIlIlllllllllIlIlIlIl) {
        return PoolChunk.lllIIIllIIllIl[1] << this.log2ChunkSize - this.depth(llllllllllllIlIlllllllllIlIlIlIl);
    }
    
    static {
        lIIlllIllllIllII();
        lIIlllIllIllIlIl();
        int $assertionsDisabled2;
        if (lIIlllIllllIllIl(PoolChunk.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = PoolChunk.lllIIIllIIllIl[1];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = PoolChunk.lllIIIllIIllIl[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
    
    private static boolean lIIlllIlllllllII(final Object llllllllllllIlIlllllllllIIIIIlIl) {
        return llllllllllllIlIlllllllllIIIIIlIl != null;
    }
    
    long allocate(final int llllllllllllIllIIIIIIIIIIIlIllIl) {
        if (lIIlllIlllllIIIl(llllllllllllIllIIIIIIIIIIIlIllIl & this.subpageOverflowMask)) {
            return this.allocateRun(llllllllllllIllIIIIIIIIIIIlIllIl);
        }
        return this.allocateSubpage(llllllllllllIllIIIIIIIIIIIlIllIl);
    }
    
    private static boolean lIIlllIllllIlllI(final int llllllllllllIlIlllllllllIIIlIlII, final int llllllllllllIlIlllllllllIIIlIIll) {
        return llllllllllllIlIlllllllllIIIlIlII >= llllllllllllIlIlllllllllIIIlIIll;
    }
    
    private static void lIIlllIllllIllII() {
        (lllIIIllIIllIl = new int[15])[0] = ((0x31 ^ 0x3A ^ (0x7E ^ 0x15)) & (0x5C ^ 0x2B ^ (0xB1 ^ 0xA6) ^ -" ".length()));
        PoolChunk.lllIIIllIIllIl[1] = " ".length();
        PoolChunk.lllIIIllIIllIl[2] = -" ".length();
        PoolChunk.lllIIIllIIllIl[3] = (0xFA ^ 0x9E ^ (0xE6 ^ 0x9C));
        PoolChunk.lllIIIllIIllIl[4] = (0x6C ^ 0x8);
        PoolChunk.lllIIIllIIllIl[5] = (159 + 13 + 24 + 4 ^ 42 + 108 - 123 + 144);
        PoolChunk.lllIIIllIIllIl[6] = "   ".length();
        PoolChunk.lllIIIllIIllIl[7] = "  ".length();
        PoolChunk.lllIIIllIIllIl[8] = (0x38 ^ 0x5D ^ (0x3D ^ 0x78));
        PoolChunk.lllIIIllIIllIl[9] = (-" ".length() & (-1 & 0x3FFFFFFF));
        PoolChunk.lllIIIllIIllIl[10] = (0x73 ^ 0x2D ^ (0xC6 ^ 0x87));
        PoolChunk.lllIIIllIIllIl[11] = (0xC1 ^ 0xC5);
        PoolChunk.lllIIIllIIllIl[12] = (0x46 ^ 0x69);
        PoolChunk.lllIIIllIIllIl[13] = (0x72 ^ 0x7 ^ (0x32 ^ 0x6E));
        PoolChunk.lllIIIllIIllIl[14] = (0x69 ^ 0x49 ^ (0xBF ^ 0x9A));
    }
    
    PoolChunk(final PoolArena<T> llllllllllllIllIIIIIIIIIIlIlIllI, final T llllllllllllIllIIIIIIIIIIlIlIlIl, final int llllllllllllIllIIIIIIIIIIlIlIlII) {
        this.unpooled = (PoolChunk.lllIIIllIIllIl[1] != 0);
        this.arena = llllllllllllIllIIIIIIIIIIlIlIllI;
        this.memory = llllllllllllIllIIIIIIIIIIlIlIlIl;
        this.memoryMap = null;
        this.depthMap = null;
        this.subpages = null;
        this.subpageOverflowMask = PoolChunk.lllIIIllIIllIl[0];
        this.pageSize = PoolChunk.lllIIIllIIllIl[0];
        this.pageShifts = PoolChunk.lllIIIllIIllIl[0];
        this.maxOrder = PoolChunk.lllIIIllIIllIl[0];
        this.unusable = (byte)(this.maxOrder + PoolChunk.lllIIIllIIllIl[1]);
        this.chunkSize = llllllllllllIllIIIIIIIIIIlIlIlII;
        this.log2ChunkSize = log2(this.chunkSize);
        this.maxSubpageAllocs = PoolChunk.lllIIIllIIllIl[0];
    }
    
    private static boolean lIIlllIlllllIIIl(final int llllllllllllIlIlllllllllIIIIIIIl) {
        return llllllllllllIlIlllllllllIIIIIIIl != 0;
    }
    
    private void initBufWithSubpage(final PooledByteBuf<T> llllllllllllIlIlllllllllIllllIII, final long llllllllllllIlIlllllllllIlllIlll, final int llllllllllllIlIlllllllllIlllllIl, final int llllllllllllIlIlllllllllIlllIlIl) {
        if (lIIlllIllllIllIl(PoolChunk.$assertionsDisabled ? 1 : 0) && lIIlllIllllIllIl(llllllllllllIlIlllllllllIlllllIl)) {
            throw new AssertionError();
        }
        final int llllllllllllIlIlllllllllIllllIll = (int)llllllllllllIlIlllllllllIlllIlll;
        final PoolSubpage<T> llllllllllllIlIlllllllllIllllIlI = this.subpages[this.subpageIdx(llllllllllllIlIlllllllllIllllIll)];
        if (lIIlllIllllIllIl(PoolChunk.$assertionsDisabled ? 1 : 0) && lIIlllIllllIllIl(llllllllllllIlIlllllllllIllllIlI.doNotDestroy ? 1 : 0)) {
            throw new AssertionError();
        }
        if (lIIlllIllllIllIl(PoolChunk.$assertionsDisabled ? 1 : 0) && lIIlllIlllllIIlI(llllllllllllIlIlllllllllIlllIlIl, llllllllllllIlIlllllllllIllllIlI.elemSize)) {
            throw new AssertionError();
        }
        llllllllllllIlIlllllllllIllllIII.init(this, llllllllllllIlIlllllllllIlllIlll, this.runOffset(llllllllllllIlIlllllllllIllllIll) + (llllllllllllIlIlllllllllIlllllIl & PoolChunk.lllIIIllIIllIl[9]) * llllllllllllIlIlllllllllIllllIlI.elemSize, llllllllllllIlIlllllllllIlllIlIl, llllllllllllIlIlllllllllIllllIlI.elemSize);
    }
    
    private static boolean lIIlllIllllIllll(final int llllllllllllIlIlllllllllIIIIllII, final int llllllllllllIlIlllllllllIIIIlIll) {
        return llllllllllllIlIlllllllllIIIIllII <= llllllllllllIlIlllllllllIIIIlIll;
    }
    
    void initBuf(final PooledByteBuf<T> llllllllllllIlIllllllllllIIllIIl, final long llllllllllllIlIllllllllllIIllIII, final int llllllllllllIlIllllllllllIIlIlll) {
        final int llllllllllllIlIllllllllllIIlllII = (int)llllllllllllIlIllllllllllIIllIII;
        final int llllllllllllIlIllllllllllIIllIll = (int)(llllllllllllIlIllllllllllIIllIII >>> PoolChunk.lllIIIllIIllIl[8]);
        if (lIIlllIllllIllIl(llllllllllllIlIllllllllllIIllIll)) {
            final byte llllllllllllIlIllllllllllIlIIIIl = this.value(llllllllllllIlIllllllllllIIlllII);
            if (lIIlllIllllIllIl(PoolChunk.$assertionsDisabled ? 1 : 0) && lIIlllIlllllIlll(llllllllllllIlIllllllllllIlIIIIl, this.unusable)) {
                throw new AssertionError((Object)String.valueOf(llllllllllllIlIllllllllllIlIIIIl));
            }
            llllllllllllIlIllllllllllIIllIIl.init(this, llllllllllllIlIllllllllllIIllIII, this.runOffset(llllllllllllIlIllllllllllIIlllII), llllllllllllIlIllllllllllIIlIlll, this.runLength(llllllllllllIlIllllllllllIIlllII));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.initBufWithSubpage(llllllllllllIlIllllllllllIIllIIl, llllllllllllIlIllllllllllIIllIII, llllllllllllIlIllllllllllIIllIll, llllllllllllIlIllllllllllIIlIlll);
        }
    }
    
    private void updateParentsFree(int llllllllllllIlIlllllllllllllIIll) {
        int llllllllllllIlIlllllllllllllIlIl = this.depth(llllllllllllIlIlllllllllllllIIll) + PoolChunk.lllIIIllIIllIl[1];
        while (lIIlllIlllllIIlI(llllllllllllIlIlllllllllllllIIll, PoolChunk.lllIIIllIIllIl[1])) {
            final int llllllllllllIlIllllllllllllllIlI = llllllllllllIlIlllllllllllllIIll >>> PoolChunk.lllIIIllIIllIl[1];
            final byte llllllllllllIlIllllllllllllllIIl = this.value(llllllllllllIlIlllllllllllllIIll);
            final byte llllllllllllIlIllllllllllllllIII = this.value(llllllllllllIlIlllllllllllllIIll ^ PoolChunk.lllIIIllIIllIl[1]);
            --llllllllllllIlIlllllllllllllIlIl;
            if (lIIlllIlllllIlII(llllllllllllIlIllllllllllllllIIl, llllllllllllIlIlllllllllllllIlIl) && lIIlllIlllllIlII(llllllllllllIlIllllllllllllllIII, llllllllllllIlIlllllllllllllIlIl)) {
                this.setValue(llllllllllllIlIllllllllllllllIlI, (byte)(llllllllllllIlIlllllllllllllIlIl - PoolChunk.lllIIIllIIllIl[1]));
                "".length();
                if (-" ".length() >= ((0x3B ^ 0x64) & ~(0x3F ^ 0x60))) {
                    return;
                }
            }
            else {
                byte b;
                if (lIIlllIlllllIIII(llllllllllllIlIllllllllllllllIIl, llllllllllllIlIllllllllllllllIII)) {
                    b = llllllllllllIlIllllllllllllllIIl;
                    "".length();
                    if (-" ".length() == ((0x56 ^ 0x1D) & ~(0x7C ^ 0x37))) {
                        return;
                    }
                }
                else {
                    b = llllllllllllIlIllllllllllllllIII;
                }
                final byte llllllllllllIlIllllllllllllllIll = b;
                this.setValue(llllllllllllIlIllllllllllllllIlI, llllllllllllIlIllllllllllllllIll);
            }
            llllllllllllIlIlllllllllllllIIll = llllllllllllIlIllllllllllllllIlI;
            "".length();
            if (((0x31 ^ 0x6F) & ~(0x1B ^ 0x45)) != 0x0) {
                return;
            }
        }
    }
    
    private byte depth(final int llllllllllllIlIlllllllllIlIllllI) {
        return this.depthMap[llllllllllllIlIlllllllllIlIllllI];
    }
    
    private long allocateSubpage(final int llllllllllllIlIlllllllllllIIIllI) {
        final int llllllllllllIlIlllllllllllIIIlIl = this.maxOrder;
        final int llllllllllllIlIlllllllllllIIIlII = this.allocateNode(llllllllllllIlIlllllllllllIIIlIl);
        if (lIIlllIllllllIIl(llllllllllllIlIlllllllllllIIIlII)) {
            return llllllllllllIlIlllllllllllIIIlII;
        }
        final PoolSubpage<T>[] llllllllllllIlIlllllllllllIIIIll = this.subpages;
        final int llllllllllllIlIlllllllllllIIIIlI = this.pageSize;
        this.freeBytes -= llllllllllllIlIlllllllllllIIIIlI;
        final int llllllllllllIlIlllllllllllIIIIIl = this.subpageIdx(llllllllllllIlIlllllllllllIIIlII);
        PoolSubpage<T> llllllllllllIlIlllllllllllIIIIII = llllllllllllIlIlllllllllllIIIIll[llllllllllllIlIlllllllllllIIIIIl];
        if (lIIlllIllllllIll(llllllllllllIlIlllllllllllIIIIII)) {
            llllllllllllIlIlllllllllllIIIIII = new PoolSubpage<T>(this, llllllllllllIlIlllllllllllIIIlII, this.runOffset(llllllllllllIlIlllllllllllIIIlII), llllllllllllIlIlllllllllllIIIIlI, llllllllllllIlIlllllllllllIIIllI);
            llllllllllllIlIlllllllllllIIIIll[llllllllllllIlIlllllllllllIIIIIl] = llllllllllllIlIlllllllllllIIIIII;
            "".length();
            if ("   ".length() <= 0) {
                return 0L;
            }
        }
        else {
            llllllllllllIlIlllllllllllIIIIII.init(llllllllllllIlIlllllllllllIIIllI);
        }
        return llllllllllllIlIlllllllllllIIIIII.allocate();
    }
    
    private byte value(final int llllllllllllIlIlllllllllIllIllIl) {
        return this.memoryMap[llllllllllllIlIlllllllllIllIllIl];
    }
}
