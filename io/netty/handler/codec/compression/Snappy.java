// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.buffer.ByteBufUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.buffer.ByteBuf;

class Snappy
{
    private static final /* synthetic */ String[] lIIIllIIllIIlI;
    private /* synthetic */ int written;
    private static final /* synthetic */ int[] lIIIllIlIIlIII;
    private /* synthetic */ byte tag;
    private /* synthetic */ State state;
    
    public void decode(final ByteBuf lllllllllllllIlIIIIIIIllIIlIIIIl, final ByteBuf lllllllllllllIlIIIIIIIllIIlIIIII) {
        while (llIIIlIIIlIlIII(lllllllllllllIlIIIIIIIllIIlIIIIl.isReadable() ? 1 : 0)) {
            Label_0614: {
                switch (Snappy$1.$SwitchMap$io$netty$handler$codec$compression$Snappy$State[this.state.ordinal()]) {
                    case 1: {
                        this.state = State.READING_PREAMBLE;
                    }
                    case 2: {
                        final int lllllllllllllIlIIIIIIIllIIlIlIII = readPreamble(lllllllllllllIlIIIIIIIllIIlIIIIl);
                        if (llIIIlIIIlIlIll(lllllllllllllIlIIIIIIIllIIlIlIII, Snappy.lIIIllIlIIlIII[23])) {
                            return;
                        }
                        if (llIIIlIIIllIIIl(lllllllllllllIlIIIIIIIllIIlIlIII)) {
                            this.state = State.READY;
                            return;
                        }
                        lllllllllllllIlIIIIIIIllIIlIIIII.ensureWritable(lllllllllllllIlIIIIIIIllIIlIlIII);
                        "".length();
                        this.state = State.READING_TAG;
                    }
                    case 3: {
                        if (llIIIlIIIllIIIl(lllllllllllllIlIIIIIIIllIIlIIIIl.isReadable() ? 1 : 0)) {
                            return;
                        }
                        this.tag = lllllllllllllIlIIIIIIIllIIlIIIIl.readByte();
                        switch (this.tag & Snappy.lIIIllIlIIlIII[24]) {
                            case 0: {
                                this.state = State.READING_LITERAL;
                                "".length();
                                if ("   ".length() <= "  ".length()) {
                                    return;
                                }
                                break;
                            }
                            case 1:
                            case 2:
                            case 3: {
                                this.state = State.READING_COPY;
                                break;
                            }
                        }
                        "".length();
                        if ((0x66 ^ 0x62) != (0xBB ^ 0xBF)) {
                            return;
                        }
                        break;
                    }
                    case 4: {
                        final int lllllllllllllIlIIIIIIIllIIlIIlll = decodeLiteral(this.tag, lllllllllllllIlIIIIIIIllIIlIIIIl, lllllllllllllIlIIIIIIIllIIlIIIII);
                        if (!llIIIlIIIlIllII(lllllllllllllIlIIIIIIIllIIlIIlll, Snappy.lIIIllIlIIlIII[23])) {
                            return;
                        }
                        this.state = State.READING_TAG;
                        this.written += lllllllllllllIlIIIIIIIllIIlIIlll;
                        "".length();
                        if ((0x26 ^ 0x23) == 0x0) {
                            return;
                        }
                        break;
                    }
                    case 5: {
                        switch (this.tag & Snappy.lIIIllIlIIlIII[24]) {
                            case 1: {
                                final int lllllllllllllIlIIIIIIIllIIlIIllI = decodeCopyWith1ByteOffset(this.tag, lllllllllllllIlIIIIIIIllIIlIIIIl, lllllllllllllIlIIIIIIIllIIlIIIII, this.written);
                                if (!llIIIlIIIlIllII(lllllllllllllIlIIIIIIIllIIlIIllI, Snappy.lIIIllIlIIlIII[23])) {
                                    return;
                                }
                                this.state = State.READING_TAG;
                                this.written += lllllllllllllIlIIIIIIIllIIlIIllI;
                                "".length();
                                if ("  ".length() <= 0) {
                                    return;
                                }
                                break Label_0614;
                            }
                            case 2: {
                                final int lllllllllllllIlIIIIIIIllIIlIIllI = decodeCopyWith2ByteOffset(this.tag, lllllllllllllIlIIIIIIIllIIlIIIIl, lllllllllllllIlIIIIIIIllIIlIIIII, this.written);
                                if (!llIIIlIIIlIllII(lllllllllllllIlIIIIIIIllIIlIIllI, Snappy.lIIIllIlIIlIII[23])) {
                                    return;
                                }
                                this.state = State.READING_TAG;
                                this.written += lllllllllllllIlIIIIIIIllIIlIIllI;
                                "".length();
                                if (-" ".length() >= 0) {
                                    return;
                                }
                                break Label_0614;
                            }
                            case 3: {
                                final int lllllllllllllIlIIIIIIIllIIlIIllI = decodeCopyWith4ByteOffset(this.tag, lllllllllllllIlIIIIIIIllIIlIIIIl, lllllllllllllIlIIIIIIIllIIlIIIII, this.written);
                                if (!llIIIlIIIlIllII(lllllllllllllIlIIIIIIIllIIlIIllI, Snappy.lIIIllIlIIlIII[23])) {
                                    return;
                                }
                                this.state = State.READING_TAG;
                                this.written += lllllllllllllIlIIIIIIIllIIlIIllI;
                                "".length();
                                if (((211 + 122 - 115 + 14 ^ 9 + 82 + 35 + 41) & (85 + 61 - 44 + 148 ^ 109 + 98 - 100 + 74 ^ -" ".length())) > ((37 + 85 - 103 + 231 ^ 82 + 149 - 204 + 126) & (0x5E ^ 0x38 ^ (0x4C ^ 0x49) ^ -" ".length()))) {
                                    return;
                                }
                                break Label_0614;
                            }
                        }
                        break;
                    }
                }
            }
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
    }
    
    private static boolean llIIIlIIIlIllII(final int lllllllllllllIlIIIIIIIlIIIlllIlI, final int lllllllllllllIlIIIIIIIlIIIlllIIl) {
        return lllllllllllllIlIIIIIIIlIIIlllIlI != lllllllllllllIlIIIIIIIlIIIlllIIl;
    }
    
    private static String llIIIIlllIIllll(String lllllllllllllIlIIIIIIIlIIlllIIll, final String lllllllllllllIlIIIIIIIlIIllIllIl) {
        lllllllllllllIlIIIIIIIlIIlllIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIIIlIIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIIIlIIlllIIIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIIIIlIIlllIIII = lllllllllllllIlIIIIIIIlIIllIllIl.toCharArray();
        int lllllllllllllIlIIIIIIIlIIllIllll = Snappy.lIIIllIlIIlIII[0];
        final double lllllllllllllIlIIIIIIIlIIllIlIIl = (Object)lllllllllllllIlIIIIIIIlIIlllIIll.toCharArray();
        final boolean lllllllllllllIlIIIIIIIlIIllIlIII = lllllllllllllIlIIIIIIIlIIllIlIIl.length != 0;
        int lllllllllllllIlIIIIIIIlIIllIIlll = Snappy.lIIIllIlIIlIII[0];
        while (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIlIIllIIlll, lllllllllllllIlIIIIIIIlIIllIlIII ? 1 : 0)) {
            final char lllllllllllllIlIIIIIIIlIIlllIlII = lllllllllllllIlIIIIIIIlIIllIlIIl[lllllllllllllIlIIIIIIIlIIllIIlll];
            lllllllllllllIlIIIIIIIlIIlllIIIl.append((char)(lllllllllllllIlIIIIIIIlIIlllIlII ^ lllllllllllllIlIIIIIIIlIIlllIIII[lllllllllllllIlIIIIIIIlIIllIllll % lllllllllllllIlIIIIIIIlIIlllIIII.length]));
            "".length();
            ++lllllllllllllIlIIIIIIIlIIllIllll;
            ++lllllllllllllIlIIIIIIIlIIllIIlll;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIIIlIIlllIIIl);
    }
    
    private static int decodeCopyWith2ByteOffset(final byte lllllllllllllIlIIIIIIIlIllIlllII, final ByteBuf lllllllllllllIlIIIIIIIlIlllIIIlI, final ByteBuf lllllllllllllIlIIIIIIIlIlllIIIIl, final int lllllllllllllIlIIIIIIIlIllIllIIl) {
        if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIlIlllIIIlI.readableBytes(), Snappy.lIIIllIlIIlIII[10])) {
            return Snappy.lIIIllIlIIlIII[23];
        }
        final int lllllllllllllIlIIIIIIIlIllIlllll = lllllllllllllIlIIIIIIIlIlllIIIIl.writerIndex();
        final int lllllllllllllIlIIIIIIIlIllIllllI = Snappy.lIIIllIlIIlIII[9] + (lllllllllllllIlIIIIIIIlIllIlllII >> Snappy.lIIIllIlIIlIII[10] & Snappy.lIIIllIlIIlIII[25]);
        final int lllllllllllllIlIIIIIIIlIllIlllIl = ByteBufUtil.swapShort(lllllllllllllIlIIIIIIIlIlllIIIlI.readShort());
        validateOffset(lllllllllllllIlIIIIIIIlIllIlllIl, lllllllllllllIlIIIIIIIlIllIllIIl);
        lllllllllllllIlIIIIIIIlIlllIIIIl.markReaderIndex();
        "".length();
        if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIlIllIlllIl, lllllllllllllIlIIIIIIIlIllIllllI)) {
            int lllllllllllllIlIIIIIIIlIlllIIlII = lllllllllllllIlIIIIIIIlIllIllllI / lllllllllllllIlIIIIIIIlIllIlllIl;
            while (llIIIlIIIllIIlI(lllllllllllllIlIIIIIIIlIlllIIlII)) {
                lllllllllllllIlIIIIIIIlIlllIIIIl.readerIndex(lllllllllllllIlIIIIIIIlIllIlllll - lllllllllllllIlIIIIIIIlIllIlllIl);
                "".length();
                lllllllllllllIlIIIIIIIlIlllIIIIl.readBytes(lllllllllllllIlIIIIIIIlIlllIIIIl, lllllllllllllIlIIIIIIIlIllIlllIl);
                "".length();
                --lllllllllllllIlIIIIIIIlIlllIIlII;
                "".length();
                if (-"   ".length() > 0) {
                    return (0x50 ^ 0x6A) & ~(0x20 ^ 0x1A);
                }
            }
            if (llIIIlIIIlIlIII(lllllllllllllIlIIIIIIIlIllIllllI % lllllllllllllIlIIIIIIIlIllIlllIl)) {
                lllllllllllllIlIIIIIIIlIlllIIIIl.readerIndex(lllllllllllllIlIIIIIIIlIllIlllll - lllllllllllllIlIIIIIIIlIllIlllIl);
                "".length();
                lllllllllllllIlIIIIIIIlIlllIIIIl.readBytes(lllllllllllllIlIIIIIIIlIlllIIIIl, lllllllllllllIlIIIIIIIlIllIllllI % lllllllllllllIlIIIIIIIlIllIlllIl);
                "".length();
            }
            "".length();
            if (null != null) {
                return (39 + 121 - 36 + 51 ^ 79 + 120 - 107 + 68) & (93 + 144 - 207 + 121 ^ 41 + 128 - 126 + 109 ^ -" ".length());
            }
        }
        else {
            lllllllllllllIlIIIIIIIlIlllIIIIl.readerIndex(lllllllllllllIlIIIIIIIlIllIlllll - lllllllllllllIlIIIIIIIlIllIlllIl);
            "".length();
            lllllllllllllIlIIIIIIIlIlllIIIIl.readBytes(lllllllllllllIlIIIIIIIlIlllIIIIl, lllllllllllllIlIIIIIIIlIllIllllI);
            "".length();
        }
        lllllllllllllIlIIIIIIIlIlllIIIIl.resetReaderIndex();
        "".length();
        return lllllllllllllIlIIIIIIIlIllIllllI;
    }
    
    private static int decodeCopyWith4ByteOffset(final byte lllllllllllllIlIIIIIIIlIllIIIlII, final ByteBuf lllllllllllllIlIIIIIIIlIllIIIIll, final ByteBuf lllllllllllllIlIIIIIIIlIllIIlIIl, final int lllllllllllllIlIIIIIIIlIllIIlIII) {
        if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIlIllIIIIll.readableBytes(), Snappy.lIIIllIlIIlIII[8])) {
            return Snappy.lIIIllIlIIlIII[23];
        }
        final int lllllllllllllIlIIIIIIIlIllIIIlll = lllllllllllllIlIIIIIIIlIllIIlIIl.writerIndex();
        final int lllllllllllllIlIIIIIIIlIllIIIllI = Snappy.lIIIllIlIIlIII[9] + (lllllllllllllIlIIIIIIIlIllIIIlII >> Snappy.lIIIllIlIIlIII[10] & Snappy.lIIIllIlIIlIII[25]);
        final int lllllllllllllIlIIIIIIIlIllIIIlIl = ByteBufUtil.swapInt(lllllllllllllIlIIIIIIIlIllIIIIll.readInt());
        validateOffset(lllllllllllllIlIIIIIIIlIllIIIlIl, lllllllllllllIlIIIIIIIlIllIIlIII);
        lllllllllllllIlIIIIIIIlIllIIlIIl.markReaderIndex();
        "".length();
        if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIlIllIIIlIl, lllllllllllllIlIIIIIIIlIllIIIllI)) {
            int lllllllllllllIlIIIIIIIlIllIIllII = lllllllllllllIlIIIIIIIlIllIIIllI / lllllllllllllIlIIIIIIIlIllIIIlIl;
            while (llIIIlIIIllIIlI(lllllllllllllIlIIIIIIIlIllIIllII)) {
                lllllllllllllIlIIIIIIIlIllIIlIIl.readerIndex(lllllllllllllIlIIIIIIIlIllIIIlll - lllllllllllllIlIIIIIIIlIllIIIlIl);
                "".length();
                lllllllllllllIlIIIIIIIlIllIIlIIl.readBytes(lllllllllllllIlIIIIIIIlIllIIlIIl, lllllllllllllIlIIIIIIIlIllIIIlIl);
                "".length();
                --lllllllllllllIlIIIIIIIlIllIIllII;
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return (52 + 138 - 176 + 146 ^ 86 + 93 - 126 + 138) & (0x6D ^ 0x65 ^ (0x20 ^ 0x37) ^ -" ".length());
                }
            }
            if (llIIIlIIIlIlIII(lllllllllllllIlIIIIIIIlIllIIIllI % lllllllllllllIlIIIIIIIlIllIIIlIl)) {
                lllllllllllllIlIIIIIIIlIllIIlIIl.readerIndex(lllllllllllllIlIIIIIIIlIllIIIlll - lllllllllllllIlIIIIIIIlIllIIIlIl);
                "".length();
                lllllllllllllIlIIIIIIIlIllIIlIIl.readBytes(lllllllllllllIlIIIIIIIlIllIIlIIl, lllllllllllllIlIIIIIIIlIllIIIllI % lllllllllllllIlIIIIIIIlIllIIIlIl);
                "".length();
            }
            "".length();
            if (((124 + 43 - 103 + 95 ^ 24 + 68 + 10 + 28) & (0x29 ^ 0x5E ^ (0x59 ^ 0x33) ^ -" ".length())) != 0x0) {
                return (201 + 77 - 140 + 107 ^ 61 + 48 - 85 + 144) & (73 + 156 - 24 + 34 ^ 22 + 38 - 30 + 148 ^ -" ".length());
            }
        }
        else {
            lllllllllllllIlIIIIIIIlIllIIlIIl.readerIndex(lllllllllllllIlIIIIIIIlIllIIIlll - lllllllllllllIlIIIIIIIlIllIIIlIl);
            "".length();
            lllllllllllllIlIIIIIIIlIllIIlIIl.readBytes(lllllllllllllIlIIIIIIIlIllIIlIIl, lllllllllllllIlIIIIIIIlIllIIIllI);
            "".length();
        }
        lllllllllllllIlIIIIIIIlIllIIlIIl.resetReaderIndex();
        "".length();
        return lllllllllllllIlIIIIIIIlIllIIIllI;
    }
    
    static void validateChecksum(final int lllllllllllllIlIIIIIIIlIlIIlIIlI, final ByteBuf lllllllllllllIlIIIIIIIlIlIIlIIIl, final int lllllllllllllIlIIIIIIIlIlIIlIIII, final int lllllllllllllIlIIIIIIIlIlIIlIlII) {
        final int lllllllllllllIlIIIIIIIlIlIIlIIll = calculateChecksum(lllllllllllllIlIIIIIIIlIlIIlIIIl, lllllllllllllIlIIIIIIIlIlIIlIIII, lllllllllllllIlIIIIIIIlIlIIlIlII);
        if (llIIIlIIIlIllII(lllllllllllllIlIIIIIIIlIlIIlIIll, lllllllllllllIlIIIIIIIlIlIIlIIlI)) {
            throw new DecompressionException(String.valueOf(new StringBuilder().append(Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[8]]).append(Integer.toHexString(lllllllllllllIlIIIIIIIlIlIIlIIll)).append(Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[7]]).append(Integer.toHexString(lllllllllllllIlIIIIIIIlIlIIlIIlI)).append((char)Snappy.lIIIllIlIIlIII[29])));
        }
    }
    
    private static int bitsToEncode(final int lllllllllllllIlIIIIIIIllIlIllIII) {
        int lllllllllllllIlIIIIIIIllIlIlIlll = Integer.highestOneBit(lllllllllllllIlIIIIIIIllIlIllIII);
        int lllllllllllllIlIIIIIIIllIlIlIllI = Snappy.lIIIllIlIIlIII[0];
        while (llIIIlIIIlIlIII(lllllllllllllIlIIIIIIIllIlIlIlll >>= Snappy.lIIIllIlIIlIII[9])) {
            ++lllllllllllllIlIIIIIIIllIlIlIllI;
            "".length();
            if ("  ".length() <= 0) {
                return (0x91 ^ 0xAD) & ~(0x37 ^ 0xB);
            }
        }
        return lllllllllllllIlIIIIIIIllIlIlIllI;
    }
    
    private static int hash(final ByteBuf lllllllllllllIlIIIIIIIllIlllIlll, final int lllllllllllllIlIIIIIIIllIlllIllI, final int lllllllllllllIlIIIIIIIllIllllIII) {
        return lllllllllllllIlIIIIIIIllIlllIlll.getInt(lllllllllllllIlIIIIIIIllIlllIllI) + Snappy.lIIIllIlIIlIII[11] >>> lllllllllllllIlIIIIIIIllIllllIII;
    }
    
    public static int calculateChecksum(final ByteBuf lllllllllllllIlIIIIIIIlIlIlIlIII, final int lllllllllllllIlIIIIIIIlIlIlIlIll, final int lllllllllllllIlIIIIIIIlIlIlIlIlI) {
        final Crc32c lllllllllllllIlIIIIIIIlIlIlIlIIl = new Crc32c();
        try {
            if (llIIIlIIIlIlIII(lllllllllllllIlIIIIIIIlIlIlIlIII.hasArray() ? 1 : 0)) {
                lllllllllllllIlIIIIIIIlIlIlIlIIl.update(lllllllllllllIlIIIIIIIlIlIlIlIII.array(), lllllllllllllIlIIIIIIIlIlIlIlIII.arrayOffset() + lllllllllllllIlIIIIIIIlIlIlIlIll, lllllllllllllIlIIIIIIIlIlIlIlIlI);
                "".length();
                if ((0x8A ^ 0x8E) <= 0) {
                    return (0x8C ^ 0x83) & ~(0xAA ^ 0xA5);
                }
            }
            else {
                final byte[] lllllllllllllIlIIIIIIIlIlIlIllIl = new byte[lllllllllllllIlIIIIIIIlIlIlIlIlI];
                lllllllllllllIlIIIIIIIlIlIlIlIII.getBytes(lllllllllllllIlIIIIIIIlIlIlIlIll, lllllllllllllIlIIIIIIIlIlIlIllIl);
                "".length();
                lllllllllllllIlIIIIIIIlIlIlIlIIl.update(lllllllllllllIlIIIIIIIlIlIlIllIl, Snappy.lIIIllIlIIlIII[0], lllllllllllllIlIIIIIIIlIlIlIlIlI);
            }
            return maskChecksum((int)lllllllllllllIlIIIIIIIlIlIlIlIIl.getValue());
        }
        finally {
            lllllllllllllIlIIIIIIIlIlIlIlIIl.reset();
        }
    }
    
    private static int readPreamble(final ByteBuf lllllllllllllIlIIIIIIIllIIIlIlII) {
        int lllllllllllllIlIIIIIIIllIIIlIllI = Snappy.lIIIllIlIIlIII[0];
        int lllllllllllllIlIIIIIIIllIIIlIlIl = Snappy.lIIIllIlIIlIII[0];
        while (llIIIlIIIlIlIII(lllllllllllllIlIIIIIIIllIIIlIlII.isReadable() ? 1 : 0)) {
            final int lllllllllllllIlIIIIIIIllIIIllIII = lllllllllllllIlIIIIIIIllIIIlIlII.readUnsignedByte();
            lllllllllllllIlIIIIIIIllIIIlIllI |= (lllllllllllllIlIIIIIIIllIIIllIII & Snappy.lIIIllIlIIlIII[3]) << lllllllllllllIlIIIIIIIllIIIlIlIl++ * Snappy.lIIIllIlIIlIII[1];
            if (llIIIlIIIllIIIl(lllllllllllllIlIIIIIIIllIIIllIII & Snappy.lIIIllIlIIlIII[4])) {
                return lllllllllllllIlIIIIIIIllIIIlIllI;
            }
            if (llIIIlIIIlIlIIl(lllllllllllllIlIIIIIIIllIIIlIlIl, Snappy.lIIIllIlIIlIII[8])) {
                throw new DecompressionException(Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[0]]);
            }
            "".length();
            if (-(0x1F ^ 0x5C ^ (0x13 ^ 0x55)) >= 0) {
                return (0xD ^ 0x44 ^ (0x3B ^ 0x3E)) & (131 + 146 - 166 + 122 ^ 5 + 26 + 96 + 38 ^ -" ".length());
            }
        }
        return Snappy.lIIIllIlIIlIII[0];
    }
    
    private static short[] getHashTable(final int lllllllllllllIlIIIIIIIllIlllIIII) {
        int lllllllllllllIlIIIIIIIllIllIllll = Snappy.lIIIllIlIIlIII[12];
        while (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIllIllll, Snappy.lIIIllIlIIlIII[13]) && llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIllIllll, lllllllllllllIlIIIIIIIllIlllIIII)) {
            lllllllllllllIlIIIIIIIllIllIllll <<= Snappy.lIIIllIlIIlIII[9];
            "".length();
            if (((0x27 ^ 0x0 ^ (0xBE ^ 0xB1)) & (0xCB ^ 0xB1 ^ (0xD0 ^ 0x82) ^ -" ".length())) < -" ".length()) {
                return null;
            }
        }
        short[] lllllllllllllIlIIIIIIIllIllIlllI = null;
        if (llIIIlIIIllIIII(lllllllllllllIlIIIIIIIllIllIllll, Snappy.lIIIllIlIIlIII[12])) {
            final short[] lllllllllllllIlIIIIIIIllIlllIIIl = new short[Snappy.lIIIllIlIIlIII[12]];
            "".length();
            if (((0x56 ^ 0x2D ^ 90 + 89 - 98 + 46) & (147 + 149 - 211 + 74 ^ 12 + 129 + 3 + 11 ^ -" ".length())) < -" ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIIIIIIllIllIlllI = new short[Snappy.lIIIllIlIIlIII[13]];
        }
        return lllllllllllllIlIIIIIIIllIllIlllI;
    }
    
    private static boolean llIIIlIIIllIIlI(final int lllllllllllllIlIIIIIIIlIIIllllIl) {
        return lllllllllllllIlIIIIIIIlIIIllllIl > 0;
    }
    
    private static boolean llIIIlIIIllIIII(final int lllllllllllllIlIIIIIIIlIIlIIlIlI, final int lllllllllllllIlIIIIIIIlIIlIIlIIl) {
        return lllllllllllllIlIIIIIIIlIIlIIlIlI <= lllllllllllllIlIIIIIIIlIIlIIlIIl;
    }
    
    static void validateChecksum(final int lllllllllllllIlIIIIIIIlIlIIllllI, final ByteBuf lllllllllllllIlIIIIIIIlIlIIlllll) {
        validateChecksum(lllllllllllllIlIIIIIIIlIlIIllllI, lllllllllllllIlIIIIIIIlIlIIlllll, lllllllllllllIlIIIIIIIlIlIIlllll.readerIndex(), lllllllllllllIlIIIIIIIlIlIIlllll.readableBytes());
    }
    
    private static boolean llIIIlIIIllIIIl(final int lllllllllllllIlIIIIIIIlIIlIIIIIl) {
        return lllllllllllllIlIIIIIIIlIIlIIIIIl == 0;
    }
    
    private static void encodeCopy(final ByteBuf lllllllllllllIlIIIIIIIllIIllIlII, final int lllllllllllllIlIIIIIIIllIIllIIII, int lllllllllllllIlIIIIIIIllIIllIIlI) {
        while (llIIIlIIIlIlIIl(lllllllllllllIlIIIIIIIllIIllIIlI, Snappy.lIIIllIlIIlIII[20])) {
            encodeCopyWithOffset(lllllllllllllIlIIIIIIIllIIllIlII, lllllllllllllIlIIIIIIIllIIllIIII, Snappy.lIIIllIlIIlIII[21]);
            lllllllllllllIlIIIIIIIllIIllIIlI -= 64;
            "".length();
            if (null != null) {
                return;
            }
        }
        if (llIIIlIIIlIlIlI(lllllllllllllIlIIIIIIIllIIllIIlI, Snappy.lIIIllIlIIlIII[21])) {
            encodeCopyWithOffset(lllllllllllllIlIIIIIIIllIIllIlII, lllllllllllllIlIIIIIIIllIIllIIII, Snappy.lIIIllIlIIlIII[22]);
            lllllllllllllIlIIIIIIIllIIllIIlI -= 60;
        }
        encodeCopyWithOffset(lllllllllllllIlIIIIIIIllIIllIlII, lllllllllllllIlIIIIIIIllIIllIIII, lllllllllllllIlIIIIIIIllIIllIIlI);
    }
    
    private static String llIIIIlllIIlllI(final String lllllllllllllIlIIIIIIIlIIlIlllII, final String lllllllllllllIlIIIIIIIlIIlIllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIIlIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIIlIIlIllIll.getBytes(StandardCharsets.UTF_8)), Snappy.lIIIllIlIIlIII[15]), "DES");
            final Cipher lllllllllllllIlIIIIIIIlIIllIIIII = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIIIlIIllIIIII.init(Snappy.lIIIllIlIIlIII[10], lllllllllllllIlIIIIIIIlIIllIIIIl);
            return new String(lllllllllllllIlIIIIIIIlIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIIlIIlIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIIlIIlIlllll) {
            lllllllllllllIlIIIIIIIlIIlIlllll.printStackTrace();
            return null;
        }
    }
    
    private static void encodeCopyWithOffset(final ByteBuf lllllllllllllIlIIIIIIIllIIllllIl, final int lllllllllllllIlIIIIIIIllIIlllIIl, final int lllllllllllllIlIIIIIIIllIIlllIII) {
        if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIIlllIII, Snappy.lIIIllIlIIlIII[18]) && llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIIlllIIl, Snappy.lIIIllIlIIlIII[19])) {
            lllllllllllllIlIIIIIIIllIIllllIl.writeByte(Snappy.lIIIllIlIIlIII[9] | lllllllllllllIlIIIIIIIllIIlllIII - Snappy.lIIIllIlIIlIII[8] << Snappy.lIIIllIlIIlIII[10] | lllllllllllllIlIIIIIIIllIIlllIIl >> Snappy.lIIIllIlIIlIII[15] << Snappy.lIIIllIlIIlIII[7]);
            "".length();
            lllllllllllllIlIIIIIIIllIIllllIl.writeByte(lllllllllllllIlIIIIIIIllIIlllIIl & Snappy.lIIIllIlIIlIII[17]);
            "".length();
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIlIIIIIIIllIIllllIl.writeByte(Snappy.lIIIllIlIIlIII[10] | lllllllllllllIlIIIIIIIllIIlllIII - Snappy.lIIIllIlIIlIII[9] << Snappy.lIIIllIlIIlIII[10]);
            "".length();
            lllllllllllllIlIIIIIIIllIIllllIl.writeByte(lllllllllllllIlIIIIIIIllIIlllIIl & Snappy.lIIIllIlIIlIII[17]);
            "".length();
            lllllllllllllIlIIIIIIIllIIllllIl.writeByte(lllllllllllllIlIIIIIIIllIIlllIIl >> Snappy.lIIIllIlIIlIII[15] & Snappy.lIIIllIlIIlIII[17]);
            "".length();
        }
    }
    
    public static int calculateChecksum(final ByteBuf lllllllllllllIlIIIIIIIlIlIllIlII) {
        return calculateChecksum(lllllllllllllIlIIIIIIIlIlIllIlII, lllllllllllllIlIIIIIIIlIlIllIlII.readerIndex(), lllllllllllllIlIIIIIIIlIlIllIlII.readableBytes());
    }
    
    private static int decodeLiteral(final byte lllllllllllllIlIIIIIIIllIIIIllII, final ByteBuf lllllllllllllIlIIIIIIIllIIIIlIll, final ByteBuf lllllllllllllIlIIIIIIIllIIIIlIlI) {
        lllllllllllllIlIIIIIIIllIIIIlIll.markReaderIndex();
        "".length();
        int lllllllllllllIlIIIIIIIllIIIIlIIl = 0;
        switch (lllllllllllllIlIIIIIIIllIIIIllII >> Snappy.lIIIllIlIIlIII[10] & Snappy.lIIIllIlIIlIII[25]) {
            case 60: {
                if (llIIIlIIIllIIIl(lllllllllllllIlIIIIIIIllIIIIlIll.isReadable() ? 1 : 0)) {
                    return Snappy.lIIIllIlIIlIII[23];
                }
                lllllllllllllIlIIIIIIIllIIIIlIIl = lllllllllllllIlIIIIIIIllIIIIlIll.readUnsignedByte();
                "".length();
                if (((0xC ^ 0x55 ^ (0x16 ^ 0x59)) & (0x26 ^ 0x32 ^ "  ".length() ^ -" ".length())) > " ".length()) {
                    return (0x98 ^ 0xAE ^ (0xAC ^ 0xA8)) & (109 + 100 - 121 + 60 ^ 65 + 163 - 113 + 51 ^ -" ".length());
                }
                break;
            }
            case 61: {
                if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIIIIlIll.readableBytes(), Snappy.lIIIllIlIIlIII[10])) {
                    return Snappy.lIIIllIlIIlIII[23];
                }
                lllllllllllllIlIIIIIIIllIIIIlIIl = ByteBufUtil.swapShort(lllllllllllllIlIIIIIIIllIIIIlIll.readShort());
                "".length();
                if (null != null) {
                    return (0xF3 ^ 0xB3) & ~(0x84 ^ 0xC4);
                }
                break;
            }
            case 62: {
                if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIIIIlIll.readableBytes(), Snappy.lIIIllIlIIlIII[24])) {
                    return Snappy.lIIIllIlIIlIII[23];
                }
                lllllllllllllIlIIIIIIIllIIIIlIIl = ByteBufUtil.swapMedium(lllllllllllllIlIIIIIIIllIIIIlIll.readUnsignedMedium());
                "".length();
                if (null != null) {
                    return (0x63 ^ 0x10 ^ (0x4F ^ 0x33)) & (0x64 ^ 0xD ^ (0x5A ^ 0x3C) ^ -" ".length());
                }
                break;
            }
            case 64: {
                if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIIIIlIll.readableBytes(), Snappy.lIIIllIlIIlIII[8])) {
                    return Snappy.lIIIllIlIIlIII[23];
                }
                lllllllllllllIlIIIIIIIllIIIIlIIl = ByteBufUtil.swapInt(lllllllllllllIlIIIIIIIllIIIIlIll.readInt());
                "".length();
                if (" ".length() == 0) {
                    return (0x15 ^ 0x5C ^ ((0x76 ^ 0x3C) & ~(0xC ^ 0x46))) & (213 + 196 - 278 + 90 ^ 35 + 46 + 53 + 14 ^ -" ".length());
                }
                break;
            }
            default: {
                lllllllllllllIlIIIIIIIllIIIIlIIl = (lllllllllllllIlIIIIIIIllIIIIllII >> Snappy.lIIIllIlIIlIII[10] & Snappy.lIIIllIlIIlIII[25]);
                break;
            }
        }
        ++lllllllllllllIlIIIIIIIllIIIIlIIl;
        if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIIIIlIll.readableBytes(), lllllllllllllIlIIIIIIIllIIIIlIIl)) {
            lllllllllllllIlIIIIIIIllIIIIlIll.resetReaderIndex();
            "".length();
            return Snappy.lIIIllIlIIlIII[23];
        }
        lllllllllllllIlIIIIIIIllIIIIlIlI.writeBytes(lllllllllllllIlIIIIIIIllIIIIlIll, lllllllllllllIlIIIIIIIllIIIIlIIl);
        "".length();
        return lllllllllllllIlIIIIIIIllIIIIlIIl;
    }
    
    public void encode(final ByteBuf lllllllllllllIlIIIIIIIlllIIIllll, final ByteBuf lllllllllllllIlIIIIIIIlllIIlIllI, final int lllllllllllllIlIIIIIIIlllIIlIlIl) {
        int lllllllllllllIlIIIIIIIlllIlIIlIl = Snappy.lIIIllIlIIlIII[0];
        do {
            final int lllllllllllllIlIIIIIIIlllIlIIllI = lllllllllllllIlIIIIIIIlllIIlIlIl >>> lllllllllllllIlIIIIIIIlllIlIIlIl * Snappy.lIIIllIlIIlIII[1];
            if (llIIIlIIIlIlIII(lllllllllllllIlIIIIIIIlllIlIIllI & Snappy.lIIIllIlIIlIII[2])) {
                lllllllllllllIlIIIIIIIlllIIlIllI.writeByte((lllllllllllllIlIIIIIIIlllIlIIllI & Snappy.lIIIllIlIIlIII[3]) | Snappy.lIIIllIlIIlIII[4]);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
                ++lllllllllllllIlIIIIIIIlllIlIIlIl;
                "".length();
            }
            else {
                lllllllllllllIlIIIIIIIlllIIlIllI.writeByte(lllllllllllllIlIIIIIIIlllIlIIllI);
                "".length();
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
                final int lllllllllllllIlIIIIIIIlllIIlIIll;
                int lllllllllllllIlIIIIIIIlllIIlIlII = lllllllllllllIlIIIIIIIlllIIlIIll = lllllllllllllIlIIIIIIIlllIIIllll.readerIndex();
                final short[] lllllllllllllIlIIIIIIIlllIIlIIlI = getHashTable(lllllllllllllIlIIIIIIIlllIIlIlIl);
                final int lllllllllllllIlIIIIIIIlllIIlIIIl = Snappy.lIIIllIlIIlIII[5] - (int)Math.floor(Math.log(lllllllllllllIlIIIIIIIlllIIlIIlI.length) / Math.log(2.0));
                int lllllllllllllIlIIIIIIIlllIIlIIII = lllllllllllllIlIIIIIIIlllIIlIlII;
                Label_0581: {
                    if (llIIIlIIIlIlIIl(lllllllllllllIlIIIIIIIlllIIlIlIl - lllllllllllllIlIIIIIIIlllIIlIlII, Snappy.lIIIllIlIIlIII[6])) {
                        int lllllllllllllIlIIIIIIIlllIIllIIl = hash(lllllllllllllIlIIIIIIIlllIIIllll, ++lllllllllllllIlIIIIIIIlllIIlIlII, lllllllllllllIlIIIIIIIlllIIlIIIl);
                        do {
                            int lllllllllllllIlIIIIIIIlllIIlllIl = Snappy.lIIIllIlIIlIII[5];
                            int lllllllllllllIlIIIIIIIlllIIllIll = lllllllllllllIlIIIIIIIlllIIlIlII;
                            int lllllllllllllIlIIIIIIIlllIIlllII;
                            do {
                                lllllllllllllIlIIIIIIIlllIIlIlII = lllllllllllllIlIIIIIIIlllIIllIll;
                                final int lllllllllllllIlIIIIIIIlllIlIIlII = lllllllllllllIlIIIIIIIlllIIllIIl;
                                final int lllllllllllllIlIIIIIIIlllIlIIIll = lllllllllllllIlIIIIIIIlllIIlllIl++ >> Snappy.lIIIllIlIIlIII[7];
                                lllllllllllllIlIIIIIIIlllIIllIll = lllllllllllllIlIIIIIIIlllIIlIlII + lllllllllllllIlIIIIIIIlllIlIIIll;
                                if (llIIIlIIIlIlIlI(lllllllllllllIlIIIIIIIlllIIllIll, lllllllllllllIlIIIIIIIlllIIlIlIl - Snappy.lIIIllIlIIlIII[8])) {
                                    "".length();
                                    if (-" ".length() >= 0) {
                                        return;
                                    }
                                    break Label_0581;
                                }
                                else {
                                    lllllllllllllIlIIIIIIIlllIIllIIl = hash(lllllllllllllIlIIIIIIIlllIIIllll, lllllllllllllIlIIIIIIIlllIIllIll, lllllllllllllIlIIIIIIIlllIIlIIIl);
                                    lllllllllllllIlIIIIIIIlllIIlllII = lllllllllllllIlIIIIIIIlllIIlIIll + lllllllllllllIlIIIIIIIlllIIlIIlI[lllllllllllllIlIIIIIIIlllIlIIlII];
                                    lllllllllllllIlIIIIIIIlllIIlIIlI[lllllllllllllIlIIIIIIIlllIlIIlII] = (short)(lllllllllllllIlIIIIIIIlllIIlIlII - lllllllllllllIlIIIIIIIlllIIlIIll);
                                }
                            } while (!llIIIlIIIlIlIll(lllllllllllllIlIIIIIIIlllIIIllll.getInt(lllllllllllllIlIIIIIIIlllIIlIlII), lllllllllllllIlIIIIIIIlllIIIllll.getInt(lllllllllllllIlIIIIIIIlllIIlllII)));
                            encodeLiteral(lllllllllllllIlIIIIIIIlllIIIllll, lllllllllllllIlIIIIIIIlllIIlIllI, lllllllllllllIlIIIIIIIlllIIlIlII - lllllllllllllIlIIIIIIIlllIIlIIII);
                            int lllllllllllllIlIIIIIIIlllIIllIlI;
                            do {
                                final int lllllllllllllIlIIIIIIIlllIlIIIlI = lllllllllllllIlIIIIIIIlllIIlIlII;
                                final int lllllllllllllIlIIIIIIIlllIlIIIIl = Snappy.lIIIllIlIIlIII[8] + findMatchingLength(lllllllllllllIlIIIIIIIlllIIIllll, lllllllllllllIlIIIIIIIlllIIlllII + Snappy.lIIIllIlIIlIII[8], lllllllllllllIlIIIIIIIlllIIlIlII + Snappy.lIIIllIlIIlIII[8], lllllllllllllIlIIIIIIIlllIIlIlIl);
                                lllllllllllllIlIIIIIIIlllIIlIlII += lllllllllllllIlIIIIIIIlllIlIIIIl;
                                final int lllllllllllllIlIIIIIIIlllIlIIIII = lllllllllllllIlIIIIIIIlllIlIIIlI - lllllllllllllIlIIIIIIIlllIIlllII;
                                encodeCopy(lllllllllllllIlIIIIIIIlllIIlIllI, lllllllllllllIlIIIIIIIlllIlIIIII, lllllllllllllIlIIIIIIIlllIlIIIIl);
                                lllllllllllllIlIIIIIIIlllIIIllll.readerIndex(lllllllllllllIlIIIIIIIlllIIIllll.readerIndex() + lllllllllllllIlIIIIIIIlllIlIIIIl);
                                "".length();
                                lllllllllllllIlIIIIIIIlllIIllIlI = lllllllllllllIlIIIIIIIlllIIlIlII - Snappy.lIIIllIlIIlIII[9];
                                lllllllllllllIlIIIIIIIlllIIlIIII = lllllllllllllIlIIIIIIIlllIIlIlII;
                                if (llIIIlIIIlIlIIl(lllllllllllllIlIIIIIIIlllIIlIlII, lllllllllllllIlIIIIIIIlllIIlIlIl - Snappy.lIIIllIlIIlIII[8])) {
                                    "".length();
                                    if (((0x55 ^ 0x69) & ~(0xA8 ^ 0x94)) != 0x0) {
                                        return;
                                    }
                                    break Label_0581;
                                }
                                else {
                                    final int lllllllllllllIlIIIIIIIlllIIlllll = hash(lllllllllllllIlIIIIIIIlllIIIllll, lllllllllllllIlIIIIIIIlllIIllIlI, lllllllllllllIlIIIIIIIlllIIlIIIl);
                                    lllllllllllllIlIIIIIIIlllIIlIIlI[lllllllllllllIlIIIIIIIlllIIlllll] = (short)(lllllllllllllIlIIIIIIIlllIIlIlII - lllllllllllllIlIIIIIIIlllIIlIIll - Snappy.lIIIllIlIIlIII[9]);
                                    final int lllllllllllllIlIIIIIIIlllIIllllI = hash(lllllllllllllIlIIIIIIIlllIIIllll, lllllllllllllIlIIIIIIIlllIIllIlI + Snappy.lIIIllIlIIlIII[9], lllllllllllllIlIIIIIIIlllIIlIIIl);
                                    lllllllllllllIlIIIIIIIlllIIlllII = lllllllllllllIlIIIIIIIlllIIlIIll + lllllllllllllIlIIIIIIIlllIIlIIlI[lllllllllllllIlIIIIIIIlllIIllllI];
                                    lllllllllllllIlIIIIIIIlllIIlIIlI[lllllllllllllIlIIIIIIIlllIIllllI] = (short)(lllllllllllllIlIIIIIIIlllIIlIlII - lllllllllllllIlIIIIIIIlllIIlIIll);
                                }
                            } while (!llIIIlIIIlIllII(lllllllllllllIlIIIIIIIlllIIIllll.getInt(lllllllllllllIlIIIIIIIlllIIllIlI + Snappy.lIIIllIlIIlIII[9]), lllllllllllllIlIIIIIIIlllIIIllll.getInt(lllllllllllllIlIIIIIIIlllIIlllII)));
                            lllllllllllllIlIIIIIIIlllIIllIIl = hash(lllllllllllllIlIIIIIIIlllIIIllll, lllllllllllllIlIIIIIIIlllIIllIlI + Snappy.lIIIllIlIIlIII[10], lllllllllllllIlIIIIIIIlllIIlIIIl);
                            ++lllllllllllllIlIIIIIIIlllIIlIlII;
                            "".length();
                        } while (" ".length() == " ".length());
                        return;
                    }
                }
                if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIlllIIlIIII, lllllllllllllIlIIIIIIIlllIIlIlIl)) {
                    encodeLiteral(lllllllllllllIlIIIIIIIlllIIIllll, lllllllllllllIlIIIIIIIlllIIlIllI, lllllllllllllIlIIIIIIIlllIIlIlIl - lllllllllllllIlIIIIIIIlllIIlIIII);
                }
            }
        } while (" ".length() != 0);
    }
    
    private static boolean llIIIlIIIlIlIlI(final int lllllllllllllIlIIIIIIIlIIlIIIllI, final int lllllllllllllIlIIIIIIIlIIlIIIlIl) {
        return lllllllllllllIlIIIIIIIlIIlIIIllI > lllllllllllllIlIIIIIIIlIIlIIIlIl;
    }
    
    private static int decodeCopyWith1ByteOffset(final byte lllllllllllllIlIIIIIIIlIlllllIll, final ByteBuf lllllllllllllIlIIIIIIIlIlllllIlI, final ByteBuf lllllllllllllIlIIIIIIIlIlllllIIl, final int lllllllllllllIlIIIIIIIlIlllllIII) {
        if (llIIIlIIIllIIIl(lllllllllllllIlIIIIIIIlIlllllIlI.isReadable() ? 1 : 0)) {
            return Snappy.lIIIllIlIIlIII[23];
        }
        final int lllllllllllllIlIIIIIIIlIllllIlll = lllllllllllllIlIIIIIIIlIlllllIIl.writerIndex();
        final int lllllllllllllIlIIIIIIIlIllllIllI = Snappy.lIIIllIlIIlIII[8] + ((lllllllllllllIlIIIIIIIlIlllllIll & Snappy.lIIIllIlIIlIII[26]) >> Snappy.lIIIllIlIIlIII[10]);
        final int lllllllllllllIlIIIIIIIlIllllIlIl = (lllllllllllllIlIIIIIIIlIlllllIll & Snappy.lIIIllIlIIlIII[27]) << Snappy.lIIIllIlIIlIII[15] >> Snappy.lIIIllIlIIlIII[7] | lllllllllllllIlIIIIIIIlIlllllIlI.readUnsignedByte();
        validateOffset(lllllllllllllIlIIIIIIIlIllllIlIl, lllllllllllllIlIIIIIIIlIlllllIII);
        lllllllllllllIlIIIIIIIlIlllllIIl.markReaderIndex();
        "".length();
        if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIlIllllIlIl, lllllllllllllIlIIIIIIIlIllllIllI)) {
            int lllllllllllllIlIIIIIIIlIllllllII = lllllllllllllIlIIIIIIIlIllllIllI / lllllllllllllIlIIIIIIIlIllllIlIl;
            while (llIIIlIIIllIIlI(lllllllllllllIlIIIIIIIlIllllllII)) {
                lllllllllllllIlIIIIIIIlIlllllIIl.readerIndex(lllllllllllllIlIIIIIIIlIllllIlll - lllllllllllllIlIIIIIIIlIllllIlIl);
                "".length();
                lllllllllllllIlIIIIIIIlIlllllIIl.readBytes(lllllllllllllIlIIIIIIIlIlllllIIl, lllllllllllllIlIIIIIIIlIllllIlIl);
                "".length();
                --lllllllllllllIlIIIIIIIlIllllllII;
                "".length();
                if (-(0x5C ^ 0x59) >= 0) {
                    return (0x19 ^ 0x7B) & ~(0xFB ^ 0x99);
                }
            }
            if (llIIIlIIIlIlIII(lllllllllllllIlIIIIIIIlIllllIllI % lllllllllllllIlIIIIIIIlIllllIlIl)) {
                lllllllllllllIlIIIIIIIlIlllllIIl.readerIndex(lllllllllllllIlIIIIIIIlIllllIlll - lllllllllllllIlIIIIIIIlIllllIlIl);
                "".length();
                lllllllllllllIlIIIIIIIlIlllllIIl.readBytes(lllllllllllllIlIIIIIIIlIlllllIIl, lllllllllllllIlIIIIIIIlIllllIllI % lllllllllllllIlIIIIIIIlIllllIlIl);
                "".length();
            }
            "".length();
            if (null != null) {
                return (0x9 ^ 0x3A) & ~(0xD ^ 0x3E);
            }
        }
        else {
            lllllllllllllIlIIIIIIIlIlllllIIl.readerIndex(lllllllllllllIlIIIIIIIlIllllIlll - lllllllllllllIlIIIIIIIlIllllIlIl);
            "".length();
            lllllllllllllIlIIIIIIIlIlllllIIl.readBytes(lllllllllllllIlIIIIIIIlIlllllIIl, lllllllllllllIlIIIIIIIlIllllIllI);
            "".length();
        }
        lllllllllllllIlIIIIIIIlIlllllIIl.resetReaderIndex();
        "".length();
        return lllllllllllllIlIIIIIIIlIllllIllI;
    }
    
    private static boolean llIIIlIIIllIIll(final int lllllllllllllIlIIIIIIIlIIIllllll) {
        return lllllllllllllIlIIIIIIIlIIIllllll <= 0;
    }
    
    static int maskChecksum(final int lllllllllllllIlIIIIIIIlIlIIIllII) {
        return (lllllllllllllIlIIIIIIIlIlIIIllII >> Snappy.lIIIllIlIIlIII[6] | lllllllllllllIlIIIIIIIlIlIIIllII << Snappy.lIIIllIlIIlIII[30]) + Snappy.lIIIllIlIIlIII[31];
    }
    
    private static void encodeLiteral(final ByteBuf lllllllllllllIlIIIIIIIllIlIIIllI, final ByteBuf lllllllllllllIlIIIIIIIllIlIIlIII, final int lllllllllllllIlIIIIIIIllIlIIIlII) {
        if (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIlIIIlII, Snappy.lIIIllIlIIlIII[14])) {
            lllllllllllllIlIIIIIIIllIlIIlIII.writeByte(lllllllllllllIlIIIIIIIllIlIIIlII - Snappy.lIIIllIlIIlIII[9] << Snappy.lIIIllIlIIlIII[10]);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final int lllllllllllllIlIIIIIIIllIlIIlIll = bitsToEncode(lllllllllllllIlIIIIIIIllIlIIIlII - Snappy.lIIIllIlIIlIII[9]);
            final int lllllllllllllIlIIIIIIIllIlIIlIlI = Snappy.lIIIllIlIIlIII[9] + lllllllllllllIlIIIIIIIllIlIIlIll / Snappy.lIIIllIlIIlIII[15];
            lllllllllllllIlIIIIIIIllIlIIlIII.writeByte(Snappy.lIIIllIlIIlIII[16] + lllllllllllllIlIIIIIIIllIlIIlIlI << Snappy.lIIIllIlIIlIII[10]);
            "".length();
            int lllllllllllllIlIIIIIIIllIlIIllII = Snappy.lIIIllIlIIlIII[0];
            while (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIlIIllII, lllllllllllllIlIIIIIIIllIlIIlIlI)) {
                lllllllllllllIlIIIIIIIllIlIIlIII.writeByte(lllllllllllllIlIIIIIIIllIlIIIlII - Snappy.lIIIllIlIIlIII[9] >> lllllllllllllIlIIIIIIIllIlIIllII * Snappy.lIIIllIlIIlIII[15] & Snappy.lIIIllIlIIlIII[17]);
                "".length();
                ++lllllllllllllIlIIIIIIIllIlIIllII;
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
        lllllllllllllIlIIIIIIIllIlIIlIII.writeBytes(lllllllllllllIlIIIIIIIllIlIIIllI, lllllllllllllIlIIIIIIIllIlIIIlII);
        "".length();
    }
    
    private static void llIIIlIIIlIIlll() {
        (lIIIllIlIIlIII = new int[33])[0] = ((0x72 ^ 0x2C) & ~(0x53 ^ 0xD));
        Snappy.lIIIllIlIIlIII[1] = (0x58 ^ 0x5F);
        Snappy.lIIIllIlIIlIII[2] = -(72 + 61 - 70 + 65);
        Snappy.lIIIllIlIIlIII[3] = (0x3F ^ 0x78) + (0x38 ^ 0x40) - (11 + 88 - 34 + 91) + (0x5 ^ 0x59);
        Snappy.lIIIllIlIIlIII[4] = (0x10 ^ 0x79) + (0x9C ^ 0xA5) - (109 + 104 - 117 + 51) + (0xD1 ^ 0xA0);
        Snappy.lIIIllIlIIlIII[5] = (0xAD ^ 0x8D);
        Snappy.lIIIllIlIIlIII[6] = (0x4A ^ 0x45);
        Snappy.lIIIllIlIIlIII[7] = (0xF ^ 0x17 ^ (0x20 ^ 0x3D));
        Snappy.lIIIllIlIIlIII[8] = (0xC5 ^ 0xC1);
        Snappy.lIIIllIlIIlIII[9] = " ".length();
        Snappy.lIIIllIlIIlIII[10] = "  ".length();
        Snappy.lIIIllIlIIlIII[11] = (0xFFFFFFBD & 0x1E35A7FF);
        Snappy.lIIIllIlIIlIII[12] = (-(0xFFFFBF8F & 0x7AFE) & (0xFFFFFBAD & 0x3FDF));
        Snappy.lIIIllIlIIlIII[13] = (0xFFFFD9E5 & 0x661A);
        Snappy.lIIIllIlIIlIII[14] = (103 + 14 - 33 + 49 ^ 104 + 77 - 123 + 126);
        Snappy.lIIIllIlIIlIII[15] = (10 + 102 - 93 + 118 ^ 28 + 23 + 34 + 44);
        Snappy.lIIIllIlIIlIII[16] = (0x9B ^ 0xA0);
        Snappy.lIIIllIlIIlIII[17] = 87 + 189 - 275 + 230 + (0xAA ^ 0xA2) - (0x8E ^ 0x95) + (0xEB ^ 0xC0);
        Snappy.lIIIllIlIIlIII[18] = (0xB7 ^ 0xBB);
        Snappy.lIIIllIlIIlIII[19] = (-(0xFFFFAFAF & 0x57D7) & (0xFFFF8FB7 & 0x7FCE));
        Snappy.lIIIllIlIIlIII[20] = (0xF1 ^ 0xB5);
        Snappy.lIIIllIlIIlIII[21] = (0x51 ^ 0x11);
        Snappy.lIIIllIlIIlIII[22] = (0x1E ^ 0x22);
        Snappy.lIIIllIlIIlIII[23] = -" ".length();
        Snappy.lIIIllIlIIlIII[24] = "   ".length();
        Snappy.lIIIllIlIIlIII[25] = (0x55 ^ 0x34 ^ (0x29 ^ 0x77));
        Snappy.lIIIllIlIIlIII[26] = (0x3C ^ 0x15 ^ (0xD ^ 0x38));
        Snappy.lIIIllIlIIlIII[27] = 38 + 77 - 98 + 207;
        Snappy.lIIIllIlIIlIII[28] = (-1 & 0x7FFF);
        Snappy.lIIIllIlIIlIII[29] = (0x93 ^ 0xBA);
        Snappy.lIIIllIlIIlIII[30] = (0x47 ^ 0x6E ^ (0xE ^ 0x36));
        Snappy.lIIIllIlIIlIII[31] = -(0xFFFFF729 & 0x5D7D1DFE);
        Snappy.lIIIllIlIIlIII[32] = (0x10 ^ 0x16);
    }
    
    static {
        llIIIlIIIlIIlll();
        llIIIIlllIlIIIl();
        MIN_COMPRESSIBLE_BYTES = Snappy.lIIIllIlIIlIII[6];
        NOT_ENOUGH_INPUT = Snappy.lIIIllIlIIlIII[23];
        COPY_4_BYTE_OFFSET = Snappy.lIIIllIlIIlIII[24];
        MAX_HT_SIZE = Snappy.lIIIllIlIIlIII[13];
        COPY_1_BYTE_OFFSET = Snappy.lIIIllIlIIlIII[9];
        LITERAL = Snappy.lIIIllIlIIlIII[0];
        PREAMBLE_NOT_FULL = Snappy.lIIIllIlIIlIII[23];
        COPY_2_BYTE_OFFSET = Snappy.lIIIllIlIIlIII[10];
    }
    
    private static boolean llIIIlIIIlIlIII(final int lllllllllllllIlIIIIIIIlIIlIIIIll) {
        return lllllllllllllIlIIIIIIIlIIlIIIIll != 0;
    }
    
    private static void llIIIIlllIlIIIl() {
        (lIIIllIIllIIlI = new String[Snappy.lIIIllIlIIlIII[32]])[Snappy.lIIIllIlIIlIII[0]] = llIIIIlllIIlllI("r82ibC6NAp1eYH5+43bf0Gxwu2fBezwW0TIABpUrL1+p7SgSKh5PCQ==", "vwPOE");
        Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[9]] = llIIIIlllIIllll("Px8fIy0EWRwoKxUcHSNoHRgBOSUFFFkgLQIUECM7GRsVNWgGGBUlLQ==", "pyyPH");
        Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[10]] = llIIIIlllIIlllI("c/F/8ZrTBsMFL2KjyWbxEuNjn0K5y+wOpjk8Cq85CwZOBtqipFqwW/BZyUa6j/lq", "JgUiS");
        Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[24]] = llIIIIlllIlIIII("UAIoJOIFtb7mhpGTqto1IJ6kmNC1Of0EQktkmpsLdcQ=", "SdvIc");
        Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[8]] = llIIIIlllIlIIII("XLS+SPxqSbJP4mGZmAPushXStIra09EY", "jMosq");
        Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[7]] = llIIIIlllIIllll("cHw/CyE1Ny4WNWp0", "PTZsQ");
    }
    
    private static boolean llIIIlIIIlIllIl(final int lllllllllllllIlIIIIIIIlIIlIIlllI, final int lllllllllllllIlIIIIIIIlIIlIIllIl) {
        return lllllllllllllIlIIIIIIIlIIlIIlllI < lllllllllllllIlIIIIIIIlIIlIIllIl;
    }
    
    public void reset() {
        this.state = State.READY;
        this.tag = (byte)Snappy.lIIIllIlIIlIII[0];
        this.written = Snappy.lIIIllIlIIlIII[0];
    }
    
    private static int findMatchingLength(final ByteBuf lllllllllllllIlIIIIIIIllIllIIlIl, final int lllllllllllllIlIIIIIIIllIllIIlII, int lllllllllllllIlIIIIIIIllIllIIIll, final int lllllllllllllIlIIIIIIIllIlIlllIl) {
        int lllllllllllllIlIIIIIIIllIllIIIIl = Snappy.lIIIllIlIIlIII[0];
        while (llIIIlIIIllIIII(lllllllllllllIlIIIIIIIllIllIIIll, lllllllllllllIlIIIIIIIllIlIlllIl - Snappy.lIIIllIlIIlIII[8]) && llIIIlIIIlIlIll(lllllllllllllIlIIIIIIIllIllIIlIl.getInt(lllllllllllllIlIIIIIIIllIllIIIll), lllllllllllllIlIIIIIIIllIllIIlIl.getInt(lllllllllllllIlIIIIIIIllIllIIlII + lllllllllllllIlIIIIIIIllIllIIIIl))) {
            lllllllllllllIlIIIIIIIllIllIIIll += 4;
            lllllllllllllIlIIIIIIIllIllIIIIl += 4;
            "".length();
            if (((22 + 144 - 165 + 193 ^ 130 + 1 + 15 + 10) & (0x4D ^ 0x56 ^ (0xD4 ^ 0x91) ^ -" ".length())) > " ".length()) {
                return (123 + 148 - 197 + 76 ^ 28 + 153 - 154 + 128) & (174 + 68 - 89 + 31 ^ 139 + 62 - 70 + 50 ^ -" ".length());
            }
        }
        while (llIIIlIIIlIllIl(lllllllllllllIlIIIIIIIllIllIIIll, lllllllllllllIlIIIIIIIllIlIlllIl) && llIIIlIIIlIlIll(lllllllllllllIlIIIIIIIllIllIIlIl.getByte(lllllllllllllIlIIIIIIIllIllIIlII + lllllllllllllIlIIIIIIIllIllIIIIl), lllllllllllllIlIIIIIIIllIllIIlIl.getByte(lllllllllllllIlIIIIIIIllIllIIIll))) {
            ++lllllllllllllIlIIIIIIIllIllIIIll;
            ++lllllllllllllIlIIIIIIIllIllIIIIl;
            "".length();
            if (null != null) {
                return (0x9 ^ 0x3D) & ~(0x2D ^ 0x19);
            }
        }
        return lllllllllllllIlIIIIIIIllIllIIIIl;
    }
    
    private static String llIIIIlllIlIIII(final String lllllllllllllIlIIIIIIIlIlIIIIIIl, final String lllllllllllllIlIIIIIIIlIlIIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIIlIlIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIIlIlIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIIIlIlIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIIIlIlIIIIlIl.init(Snappy.lIIIllIlIIlIII[10], lllllllllllllIlIIIIIIIlIlIIIIllI);
            return new String(lllllllllllllIlIIIIIIIlIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIIlIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIIlIlIIIIlII) {
            lllllllllllllIlIIIIIIIlIlIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIlIIIlIlIll(final int lllllllllllllIlIIIIIIIlIIlIlIllI, final int lllllllllllllIlIIIIIIIlIIlIlIlIl) {
        return lllllllllllllIlIIIIIIIlIIlIlIllI == lllllllllllllIlIIIIIIIlIIlIlIlIl;
    }
    
    private static boolean llIIIlIIIlIlIIl(final int lllllllllllllIlIIIIIIIlIIlIlIIlI, final int lllllllllllllIlIIIIIIIlIIlIlIIIl) {
        return lllllllllllllIlIIIIIIIlIIlIlIIlI >= lllllllllllllIlIIIIIIIlIIlIlIIIl;
    }
    
    Snappy() {
        this.state = State.READY;
    }
    
    private static void validateOffset(final int lllllllllllllIlIIIIIIIlIlIlllIII, final int lllllllllllllIlIIIIIIIlIlIlllIIl) {
        if (llIIIlIIIlIlIlI(lllllllllllllIlIIIIIIIlIlIlllIII, Snappy.lIIIllIlIIlIII[28])) {
            throw new DecompressionException(Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[9]]);
        }
        if (llIIIlIIIllIIll(lllllllllllllIlIIIIIIIlIlIlllIII)) {
            throw new DecompressionException(Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[10]]);
        }
        if (llIIIlIIIlIlIlI(lllllllllllllIlIIIIIIIlIlIlllIII, lllllllllllllIlIIIIIIIlIlIlllIIl)) {
            throw new DecompressionException(Snappy.lIIIllIIllIIlI[Snappy.lIIIllIlIIlIII[24]]);
        }
    }
    
    private enum State
    {
        READING_TAG, 
        READING_COPY, 
        READING_LITERAL;
        
        private static final /* synthetic */ String[] lIIIlIllIIIlIl;
        
        READING_PREAMBLE, 
        READY;
        
        private static final /* synthetic */ int[] lIIIlIllIIlIII;
        
        static {
            llIIIIIllIlIIll();
            llIIIIIllIIlllI();
            final State[] $values = new State[State.lIIIlIllIIlIII[5]];
            $values[State.lIIIlIllIIlIII[0]] = State.READY;
            $values[State.lIIIlIllIIlIII[1]] = State.READING_PREAMBLE;
            $values[State.lIIIlIllIIlIII[2]] = State.READING_TAG;
            $values[State.lIIIlIllIIlIII[3]] = State.READING_LITERAL;
            $values[State.lIIIlIllIIlIII[4]] = State.READING_COPY;
            $VALUES = $values;
        }
        
        private static String llIIIIIllIIllIl(String lllllllllllllIlIIIIlIllllIIIIIll, final String lllllllllllllIlIIIIlIllllIIIIIlI) {
            lllllllllllllIlIIIIlIllllIIIIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIlIllllIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIIIlIllllIIIIllI = new StringBuilder();
            final char[] lllllllllllllIlIIIIlIllllIIIIlIl = lllllllllllllIlIIIIlIllllIIIIIlI.toCharArray();
            int lllllllllllllIlIIIIlIllllIIIIlII = State.lIIIlIllIIlIII[0];
            final byte lllllllllllllIlIIIIlIlllIllllllI = (Object)lllllllllllllIlIIIIlIllllIIIIIll.toCharArray();
            final double lllllllllllllIlIIIIlIlllIlllllIl = lllllllllllllIlIIIIlIlllIllllllI.length;
            double lllllllllllllIlIIIIlIlllIlllllII = State.lIIIlIllIIlIII[0];
            while (llIIIIIllIlIlII((int)lllllllllllllIlIIIIlIlllIlllllII, (int)lllllllllllllIlIIIIlIlllIlllllIl)) {
                final char lllllllllllllIlIIIIlIllllIIIlIIl = lllllllllllllIlIIIIlIlllIllllllI[lllllllllllllIlIIIIlIlllIlllllII];
                lllllllllllllIlIIIIlIllllIIIIllI.append((char)(lllllllllllllIlIIIIlIllllIIIlIIl ^ lllllllllllllIlIIIIlIllllIIIIlIl[lllllllllllllIlIIIIlIllllIIIIlII % lllllllllllllIlIIIIlIllllIIIIlIl.length]));
                "".length();
                ++lllllllllllllIlIIIIlIllllIIIIlII;
                ++lllllllllllllIlIIIIlIlllIlllllII;
                "".length();
                if (-(0xA8 ^ 0xAC) > 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIIIlIllllIIIIllI);
        }
        
        private static boolean llIIIIIllIlIlII(final int lllllllllllllIlIIIIlIlllIlIllllI, final int lllllllllllllIlIIIIlIlllIlIlllIl) {
            return lllllllllllllIlIIIIlIlllIlIllllI < lllllllllllllIlIIIIlIlllIlIlllIl;
        }
        
        private static String llIIIIIllIIlIll(final String lllllllllllllIlIIIIlIlllIlllIIll, final String lllllllllllllIlIIIIlIlllIlllIIII) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIlIlllIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIlllIlllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIIIlIlllIlllIlIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIIIlIlllIlllIlIl.init(State.lIIIlIllIIlIII[2], lllllllllllllIlIIIIlIlllIlllIllI);
                return new String(lllllllllllllIlIIIIlIlllIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIlllIlllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIlIlllIlllIlII) {
                lllllllllllllIlIIIIlIlllIlllIlII.printStackTrace();
                return null;
            }
        }
        
        private static void llIIIIIllIlIIll() {
            (lIIIlIllIIlIII = new int[7])[0] = ((0x5E ^ 0x5A ^ "  ".length()) & (0x52 ^ 0x6A ^ (0x2A ^ 0x14) ^ -" ".length()));
            State.lIIIlIllIIlIII[1] = " ".length();
            State.lIIIlIllIIlIII[2] = "  ".length();
            State.lIIIlIllIIlIII[3] = "   ".length();
            State.lIIIlIllIIlIII[4] = (0x62 ^ 0x66);
            State.lIIIlIllIIlIII[5] = (0xA2 ^ 0xA7);
            State.lIIIlIllIIlIII[6] = (0xB ^ 0x27 ^ (0xBF ^ 0x9B));
        }
        
        private static String llIIIIIllIIllII(final String lllllllllllllIlIIIIlIlllIllIIllI, final String lllllllllllllIlIIIIlIlllIllIIIll) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIlIlllIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIlllIllIIIll.getBytes(StandardCharsets.UTF_8)), State.lIIIlIllIIlIII[6]), "DES");
                final Cipher lllllllllllllIlIIIIlIlllIllIlIII = Cipher.getInstance("DES");
                lllllllllllllIlIIIIlIlllIllIlIII.init(State.lIIIlIllIIlIII[2], lllllllllllllIlIIIIlIlllIllIlIIl);
                return new String(lllllllllllllIlIIIIlIlllIllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIlllIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIlIlllIllIIlll) {
                lllllllllllllIlIIIIlIlllIllIIlll.printStackTrace();
                return null;
            }
        }
        
        private static void llIIIIIllIIlllI() {
            (lIIIlIllIIIlIl = new String[State.lIIIlIllIIlIII[5]])[State.lIIIlIllIIlIII[0]] = llIIIIIllIIlIll("r8Q3IIryhBE=", "Awatv");
            State.lIIIlIllIIIlIl[State.lIIIlIllIIlIII[1]] = llIIIIIllIIllII("vtohAJgzqVrp9njU+BaX0fPVFGhZ9/Bt", "xigKn");
            State.lIIIlIllIIIlIl[State.lIIIlIllIIlIII[2]] = llIIIIIllIIlIll("laHxxy6iKYkoh2gXht+xsg==", "MAtlL");
            State.lIIIlIllIIIlIl[State.lIIIlIllIIlIII[3]] = llIIIIIllIIllII("B1GrR43qahm2Cl/lFJgvAg==", "uFjwH");
            State.lIIIlIllIIIlIl[State.lIIIlIllIIlIII[4]] = llIIIIIllIIllIl("Ix8QCSs/HQ4OLSED", "qZQMb");
        }
    }
}
