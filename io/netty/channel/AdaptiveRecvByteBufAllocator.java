// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import java.util.ArrayList;

public class AdaptiveRecvByteBufAllocator implements RecvByteBufAllocator
{
    private static final /* synthetic */ String[] lIlIlIIIlIIIII;
    private final /* synthetic */ int initial;
    private static final /* synthetic */ int[] SIZE_TABLE;
    private final /* synthetic */ int minIndex;
    private final /* synthetic */ int maxIndex;
    private static final /* synthetic */ int[] lIlIlIIIlIIIIl;
    
    static {
        lllIlIllIIllllI();
        lllIlIllIIlllIl();
        DEFAULT_INITIAL = AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[3];
        DEFAULT_MINIMUM = AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[2];
        INDEX_INCREMENT = AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[6];
        INDEX_DECREMENT = AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1];
        DEFAULT_MAXIMUM = AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[4];
        final List<Integer> lllllllllllllIIIlIlIllIIlIIlllll = new ArrayList<Integer>();
        int lllllllllllllIIIlIlIllIIlIlIIIlI = AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[7];
        while (lllIlIllIIlllll(lllllllllllllIIIlIlIllIIlIlIIIlI, AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[8])) {
            lllllllllllllIIIlIlIllIIlIIlllll.add(lllllllllllllIIIlIlIllIIlIlIIIlI);
            "".length();
            lllllllllllllIIIlIlIllIIlIlIIIlI += 16;
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        int lllllllllllllIIIlIlIllIIlIlIIIIl = AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[8];
        while (lllIlIllIlIIIll(lllllllllllllIIIlIlIllIIlIlIIIIl)) {
            lllllllllllllIIIlIlIllIIlIIlllll.add(lllllllllllllIIIlIlIllIIlIlIIIIl);
            "".length();
            lllllllllllllIIIlIlIllIIlIlIIIIl <<= AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1];
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        SIZE_TABLE = new int[lllllllllllllIIIlIlIllIIlIIlllll.size()];
        int lllllllllllllIIIlIlIllIIlIlIIIII = AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[0];
        while (lllIlIllIIlllll(lllllllllllllIIIlIlIllIIlIlIIIII, AdaptiveRecvByteBufAllocator.SIZE_TABLE.length)) {
            AdaptiveRecvByteBufAllocator.SIZE_TABLE[lllllllllllllIIIlIlIllIIlIlIIIII] = lllllllllllllIIIlIlIllIIlIIlllll.get(lllllllllllllIIIlIlIllIIlIlIIIII);
            ++lllllllllllllIIIlIlIllIIlIlIIIII;
            "".length();
            if ((0x16 ^ 0xB ^ (0x43 ^ 0x5B)) == 0x0) {
                return;
            }
        }
        DEFAULT = new AdaptiveRecvByteBufAllocator();
    }
    
    private static boolean lllIlIllIIlllll(final int lllllllllllllIIIlIlIllIIlIIIlIIl, final int lllllllllllllIIIlIlIllIIlIIIlIII) {
        return lllllllllllllIIIlIlIllIIlIIIlIIl < lllllllllllllIIIlIlIllIIlIIIlIII;
    }
    
    private static boolean lllIlIllIlIIIII(final int lllllllllllllIIIlIlIllIIlIIIllIl, final int lllllllllllllIIIlIlIllIIlIIIllII) {
        return lllllllllllllIIIlIlIllIIlIIIllIl == lllllllllllllIIIlIlIllIIlIIIllII;
    }
    
    private AdaptiveRecvByteBufAllocator() {
        this(AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[2], AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[3], AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[4]);
    }
    
    private static String lllIlIllIIlllII(final String lllllllllllllIIIlIlIllIIlIIlIlIl, final String lllllllllllllIIIlIlIllIIlIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIllIIlIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIllIIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[10]), "DES");
            final Cipher lllllllllllllIIIlIlIllIIlIIlIlll = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIllIIlIIlIlll.init(AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[5], lllllllllllllIIIlIlIllIIlIIllIII);
            return new String(lllllllllllllIIIlIlIllIIlIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIllIIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIllIIlIIlIllI) {
            lllllllllllllIIIlIlIllIIlIIlIllI.printStackTrace();
            return null;
        }
    }
    
    public AdaptiveRecvByteBufAllocator(final int lllllllllllllIIIlIlIllIIlIlIllll, final int lllllllllllllIIIlIlIllIIlIlIlllI, final int lllllllllllllIIIlIlIllIIlIllIIll) {
        if (lllIlIllIlIIIlI(lllllllllllllIIIlIlIllIIlIlIllll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIII[AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[0]]).append(lllllllllllllIIIlIlIllIIlIlIllll)));
        }
        if (lllIlIllIIlllll(lllllllllllllIIIlIlIllIIlIlIlllI, lllllllllllllIIIlIlIllIIlIlIllll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIII[AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1]]).append(lllllllllllllIIIlIlIllIIlIlIlllI)));
        }
        if (lllIlIllIIlllll(lllllllllllllIIIlIlIllIIlIllIIll, lllllllllllllIIIlIlIllIIlIlIlllI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIII[AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[5]]).append(lllllllllllllIIIlIlIllIIlIllIIll)));
        }
        final int lllllllllllllIIIlIlIllIIlIllIIlI = getSizeTableIndex(lllllllllllllIIIlIlIllIIlIlIllll);
        if (lllIlIllIIlllll(AdaptiveRecvByteBufAllocator.SIZE_TABLE[lllllllllllllIIIlIlIllIIlIllIIlI], lllllllllllllIIIlIlIllIIlIlIllll)) {
            this.minIndex = lllllllllllllIIIlIlIllIIlIllIIlI + AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1];
            "".length();
            if ((0x56 ^ 0x79 ^ (0x45 ^ 0x6E)) == 0x0) {
                throw null;
            }
        }
        else {
            this.minIndex = lllllllllllllIIIlIlIllIIlIllIIlI;
        }
        final int lllllllllllllIIIlIlIllIIlIllIIIl = getSizeTableIndex(lllllllllllllIIIlIlIllIIlIllIIll);
        if (lllIlIllIlIIIIl(AdaptiveRecvByteBufAllocator.SIZE_TABLE[lllllllllllllIIIlIlIllIIlIllIIIl], lllllllllllllIIIlIlIllIIlIllIIll)) {
            this.maxIndex = lllllllllllllIIIlIlIllIIlIllIIIl - AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1];
            "".length();
            if (" ".length() > " ".length()) {
                throw null;
            }
        }
        else {
            this.maxIndex = lllllllllllllIIIlIlIllIIlIllIIIl;
        }
        this.initial = lllllllllllllIIIlIlIllIIlIlIlllI;
    }
    
    private static boolean lllIlIllIlIIIll(final int lllllllllllllIIIlIlIllIIlIIIIIII) {
        return lllllllllllllIIIlIlIllIIlIIIIIII > 0;
    }
    
    private static boolean lllIlIllIlIIIIl(final int lllllllllllllIIIlIlIllIIlIIIIlIl, final int lllllllllllllIIIlIlIllIIlIIIIlII) {
        return lllllllllllllIIIlIlIllIIlIIIIlIl > lllllllllllllIIIlIlIllIIlIIIIlII;
    }
    
    private static int getSizeTableIndex(final int lllllllllllllIIIlIlIllIIllIIIllI) {
        int lllllllllllllIIIlIlIllIIllIIlIII = AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[0];
        int lllllllllllllIIIlIlIllIIllIIIlll = AdaptiveRecvByteBufAllocator.SIZE_TABLE.length - AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1];
        while (!lllIlIllIIlllll(lllllllllllllIIIlIlIllIIllIIIlll, lllllllllllllIIIlIlIllIIllIIlIII)) {
            if (lllIlIllIlIIIII(lllllllllllllIIIlIlIllIIllIIIlll, lllllllllllllIIIlIlIllIIllIIlIII)) {
                return lllllllllllllIIIlIlIllIIllIIIlll;
            }
            final int lllllllllllllIIIlIlIllIIllIIlIll = lllllllllllllIIIlIlIllIIllIIlIII + lllllllllllllIIIlIlIllIIllIIIlll >>> AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1];
            final int lllllllllllllIIIlIlIllIIllIIlIlI = AdaptiveRecvByteBufAllocator.SIZE_TABLE[lllllllllllllIIIlIlIllIIllIIlIll];
            final int lllllllllllllIIIlIlIllIIllIIlIIl = AdaptiveRecvByteBufAllocator.SIZE_TABLE[lllllllllllllIIIlIlIllIIllIIlIll + AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1]];
            if (lllIlIllIlIIIIl(lllllllllllllIIIlIlIllIIllIIIllI, lllllllllllllIIIlIlIllIIllIIlIIl)) {
                lllllllllllllIIIlIlIllIIllIIlIII = lllllllllllllIIIlIlIllIIllIIlIll + AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1];
                "".length();
                if (-(0x1E ^ 0x1A) >= 0) {
                    return (0xA1 ^ 0xB2) & ~(0x3E ^ 0x2D);
                }
            }
            else if (lllIlIllIIlllll(lllllllllllllIIIlIlIllIIllIIIllI, lllllllllllllIIIlIlIllIIllIIlIlI)) {
                lllllllllllllIIIlIlIllIIllIIIlll = lllllllllllllIIIlIlIllIIllIIlIll - AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1];
                "".length();
                if ((0xBE ^ 0xBA) <= "  ".length()) {
                    return (0x9B ^ 0x96) & ~(0xC9 ^ 0xC4);
                }
            }
            else {
                if (lllIlIllIlIIIII(lllllllllllllIIIlIlIllIIllIIIllI, lllllllllllllIIIlIlIllIIllIIlIlI)) {
                    return lllllllllllllIIIlIlIllIIllIIlIll;
                }
                return lllllllllllllIIIlIlIllIIllIIlIll + AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1];
            }
            "".length();
            if (" ".length() == 0) {
                return (0xAD ^ 0xB7 ^ (0x5B ^ 0x50)) & (10 + 133 - 119 + 110 ^ 142 + 99 - 193 + 103 ^ -" ".length());
            }
        }
        return lllllllllllllIIIlIlIllIIllIIlIII;
    }
    
    private static void lllIlIllIIllllI() {
        (lIlIlIIIlIIIIl = new int[11])[0] = ((0x4B ^ 0x5) & ~(0x5E ^ 0x10));
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1] = " ".length();
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[2] = (222 + 211 - 317 + 136 ^ 8 + 142 - 19 + 57);
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[3] = (-(0xFFFFFBFD & 0x6DE7) & (0xFFFFFFEC & 0x6DF7));
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[4] = (0xFFFFC98A & 0x13675);
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[5] = "  ".length();
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[6] = (0xB4 ^ 0xB0);
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[7] = (0x86 ^ 0x96);
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[8] = (-(0xFFFFF1FF & 0x7F6F) & (0xFFFFF3FF & 0x7F6E));
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[9] = "   ".length();
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[10] = (45 + 65 + 18 + 6 ^ 116 + 96 - 89 + 19);
    }
    
    private static void lllIlIllIIlllIl() {
        (lIlIlIIIlIIIII = new String[AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[9]])[AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[0]] = lllIlIllIIlllII("pq+j46nngF3Qcdyra4ESmw==", "MklHx");
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIII[AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[1]] = lllIlIllIIlllII("P04NaIdwFPQJbwjqrkuVZg==", "lKxBq");
        AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIII[AdaptiveRecvByteBufAllocator.lIlIlIIIlIIIIl[5]] = lllIlIllIIlllII("0La8lPDXvNBq8GfLGS+oqQ==", "HZlcj");
    }
    
    @Override
    public Handle newHandle() {
        return new HandleImpl(this.minIndex, this.maxIndex, this.initial);
    }
    
    private static boolean lllIlIllIlIIIlI(final int lllllllllllllIIIlIlIllIIlIIIIIlI) {
        return lllllllllllllIIIlIlIllIIlIIIIIlI <= 0;
    }
    
    private static final class HandleImpl implements Handle
    {
        private final /* synthetic */ int maxIndex;
        private /* synthetic */ int index;
        private static final /* synthetic */ int[] lIIlIllIlIlIIl;
        private final /* synthetic */ int minIndex;
        private /* synthetic */ int nextReceiveBufferSize;
        private /* synthetic */ boolean decreaseNow;
        
        private static boolean llIlIIlIlIllIIl(final int lllllllllllllIIllIIIlllllllIlIlI, final int lllllllllllllIIllIIIlllllllIlIIl) {
            return lllllllllllllIIllIIIlllllllIlIlI >= lllllllllllllIIllIIIlllllllIlIIl;
        }
        
        static {
            llIlIIlIlIlIllI();
        }
        
        private static boolean llIlIIlIlIllIII(final int lllllllllllllIIllIIIlllllllIIIll) {
            return lllllllllllllIIllIIIlllllllIIIll != 0;
        }
        
        @Override
        public ByteBuf allocate(final ByteBufAllocator lllllllllllllIIllIIIllllllllIllI) {
            return lllllllllllllIIllIIIllllllllIllI.ioBuffer(this.nextReceiveBufferSize);
        }
        
        @Override
        public void record(final int lllllllllllllIIllIIIlllllllIllll) {
            if (llIlIIlIlIlIlll(lllllllllllllIIllIIIlllllllIllll, AdaptiveRecvByteBufAllocator.SIZE_TABLE[Math.max(HandleImpl.lIIlIllIlIlIIl[0], this.index - HandleImpl.lIIlIllIlIlIIl[1] - HandleImpl.lIIlIllIlIlIIl[1])])) {
                if (llIlIIlIlIllIII(this.decreaseNow ? 1 : 0)) {
                    this.index = Math.max(this.index - HandleImpl.lIIlIllIlIlIIl[1], this.minIndex);
                    this.nextReceiveBufferSize = AdaptiveRecvByteBufAllocator.SIZE_TABLE[this.index];
                    this.decreaseNow = (HandleImpl.lIIlIllIlIlIIl[0] != 0);
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
                else {
                    this.decreaseNow = (HandleImpl.lIIlIllIlIlIIl[1] != 0);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else if (llIlIIlIlIllIIl(lllllllllllllIIllIIIlllllllIllll, this.nextReceiveBufferSize)) {
                this.index = Math.min(this.index + HandleImpl.lIIlIllIlIlIIl[2], this.maxIndex);
                this.nextReceiveBufferSize = AdaptiveRecvByteBufAllocator.SIZE_TABLE[this.index];
                this.decreaseNow = (HandleImpl.lIIlIllIlIlIIl[0] != 0);
            }
        }
        
        @Override
        public int guess() {
            return this.nextReceiveBufferSize;
        }
        
        private static boolean llIlIIlIlIlIlll(final int lllllllllllllIIllIIIlllllllIIllI, final int lllllllllllllIIllIIIlllllllIIlIl) {
            return lllllllllllllIIllIIIlllllllIIllI <= lllllllllllllIIllIIIlllllllIIlIl;
        }
        
        private static void llIlIIlIlIlIllI() {
            (lIIlIllIlIlIIl = new int[3])[0] = ((0x48 ^ 0x5) & ~(0x1D ^ 0x50));
            HandleImpl.lIIlIllIlIlIIl[1] = " ".length();
            HandleImpl.lIIlIllIlIlIIl[2] = (0x3C ^ 0x38);
        }
        
        HandleImpl(final int lllllllllllllIIllIIlIIIIIIIIIIlI, final int lllllllllllllIIllIIIllllllllllIl, final int lllllllllllllIIllIIIllllllllllII) {
            this.minIndex = lllllllllllllIIllIIlIIIIIIIIIIlI;
            this.maxIndex = lllllllllllllIIllIIIllllllllllIl;
            this.index = getSizeTableIndex(lllllllllllllIIllIIIllllllllllII);
            this.nextReceiveBufferSize = AdaptiveRecvByteBufAllocator.SIZE_TABLE[this.index];
        }
    }
}
