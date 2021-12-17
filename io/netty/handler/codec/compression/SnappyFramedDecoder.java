// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import io.netty.buffer.ByteBufUtil;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.handler.codec.ByteToMessageDecoder;

public class SnappyFramedDecoder extends ByteToMessageDecoder
{
    private /* synthetic */ boolean corrupted;
    private static final /* synthetic */ byte[] SNAPPY;
    private static final /* synthetic */ int[] lIlIllIIIlIlII;
    private static final /* synthetic */ String[] lIlIllIIIlIIll;
    private final /* synthetic */ boolean validateChecksums;
    private final /* synthetic */ Snappy snappy;
    private /* synthetic */ boolean started;
    
    public SnappyFramedDecoder(final boolean lllllllllllllIIIIlllIlIllIllIIlI) {
        this.snappy = new Snappy();
        this.validateChecksums = lllllllllllllIIIIlllIlIllIllIIlI;
    }
    
    private static void llllIIIIIllIllI() {
        (lIlIllIIIlIIll = new String[SnappyFramedDecoder.lIlIllIIIlIlII[16]])[SnappyFramedDecoder.lIlIllIIIlIlII[0]] = llllIIIIIllIlII("DRoxDRY9FyAQAngYMRsBLBx0GgB4ByAHAzkZdBwCPRogHAAxESZPRg==", "XtTuf");
        SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[2]] = llllIIIIIllIlIl("YQ+EB0jkN4x1WON7ZtfWFGnMuHGieRHxOLqFQVreUXrKapwjpsyD5GZgqhSFQe6VL1S8NlwUWArxUMWpSZiV35mkZ8NVNUNdMN/pGiRL+VY=", "CIiBR");
        SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[3]] = llllIIIIIllIlIl("X+9l4xxrgMQVHf6fJz3E2we7u6NwK8iORUF4KqkxvUpO2ZTlrsXaNpkv7nABmP5VtSxaqY7jBEJmZiGlFHGzcw==", "udsEa");
        SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[4]] = llllIIIIIllIlII("LQIXJgxLHwc7DRkbByxIHgMRIwEbHQMqBA5NASAdBQZCPBEbCFhoWBM=", "kmbHh");
        SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[1]] = llllIIIIIllIlII("BxQPHSMjFAhYHxsyIzUaBzQ/Kw8RLig5HhRRGBktdRMJHiUnFEwrHgc0LTUVHDUpNh4cNyU9GA==", "UqlxJ");
        SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[6]] = llllIIIIIllIlII("KCQsECEMJCtVHTQCADgYKAQcJg0+Hgs0HDthIxQ6HSQ9VTwSICFVfk90e0VoGDg7EDs=", "zAOuH");
        SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[7]] = llllIIIIIllIlII("Ki4rEhMOLixXOTcGGCU/KxgNMyU8Chw2WgwqL1cYHS0nBR9YGBwlPzkGFz4+PQUcPjwxDho=", "xKHwz");
    }
    
    private static boolean llllIIIIIlllIlI(final int lllllllllllllIIIIlllIlIlIlIIlIlI, final int lllllllllllllIIIIlllIlIlIlIIlIIl) {
        return lllllllllllllIIIIlllIlIlIlIIlIlI != lllllllllllllIIIIlllIlIlIlIIlIIl;
    }
    
    private static boolean llllIIIIIlllIll(final int lllllllllllllIIIIlllIlIlIlIIllIl) {
        return lllllllllllllIIIIlllIlIlIlIIllIl == 0;
    }
    
    private static boolean llllIIIIIllllII(final int lllllllllllllIIIIlllIlIlIlIlIIlI, final int lllllllllllllIIIIlllIlIlIlIlIIIl) {
        return lllllllllllllIIIIlllIlIlIlIlIIlI > lllllllllllllIIIIlllIlIlIlIlIIIl;
    }
    
    private static boolean llllIIIIIllllIl(final int lllllllllllllIIIIlllIlIlIlIllIlI, final int lllllllllllllIIIIlllIlIlIlIllIIl) {
        return lllllllllllllIIIIlllIlIlIlIllIlI == lllllllllllllIIIIlllIlIlIlIllIIl;
    }
    
    private static String llllIIIIIllIlIl(final String lllllllllllllIIIIlllIlIlIllIIIlI, final String lllllllllllllIIIIlllIlIlIllIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIlIlIllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIlIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), SnappyFramedDecoder.lIlIllIIIlIlII[17]), "DES");
            final Cipher lllllllllllllIIIIlllIlIlIllIIlII = Cipher.getInstance("DES");
            lllllllllllllIIIIlllIlIlIllIIlII.init(SnappyFramedDecoder.lIlIllIIIlIlII[3], lllllllllllllIIIIlllIlIlIllIIlIl);
            return new String(lllllllllllllIIIIlllIlIlIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIlIlIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIlIlIllIIIll) {
            lllllllllllllIIIIlllIlIlIllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static void llllIIIIIllIlll() {
        (lIlIllIIIlIlII = new int[18])[0] = ((0xD7 ^ 0xC4) & ~(0x99 ^ 0x8A));
        SnappyFramedDecoder.lIlIllIIIlIlII[1] = (0xE8 ^ 0x96 ^ (0xC7 ^ 0xBD));
        SnappyFramedDecoder.lIlIllIIIlIlII[2] = " ".length();
        SnappyFramedDecoder.lIlIllIIIlIlII[3] = "  ".length();
        SnappyFramedDecoder.lIlIllIIIlIlII[4] = "   ".length();
        SnappyFramedDecoder.lIlIllIIIlIlII[5] = (0xFFFFE596 & 0x11A6D);
        SnappyFramedDecoder.lIlIllIIIlIlII[6] = (84 + 139 - 110 + 27 ^ 45 + 120 - 51 + 23);
        SnappyFramedDecoder.lIlIllIIIlIlII[7] = (0x8E ^ 0x88);
        SnappyFramedDecoder.lIlIllIIIlIlII[8] = -" ".length();
        SnappyFramedDecoder.lIlIllIIIlIlII[9] = 102 + 8 - 74 + 92;
        SnappyFramedDecoder.lIlIllIIIlIlII[10] = (0x26 ^ 0x0 ^ (0xD9 ^ 0x8C));
        SnappyFramedDecoder.lIlIllIIIlIlII[11] = (20 + 12 + 1 + 166 ^ 22 + 65 - 54 + 104);
        SnappyFramedDecoder.lIlIllIIIlIlII[12] = (137 + 143 - 217 + 184 ^ 100 + 79 - 39 + 10);
        SnappyFramedDecoder.lIlIllIIIlIlII[13] = (0x2D ^ 0x7D);
        SnappyFramedDecoder.lIlIllIIIlIlII[14] = (144 + 31 + 23 + 4 ^ 96 + 55 - 27 + 62);
        SnappyFramedDecoder.lIlIllIIIlIlII[15] = (0x5A ^ 0x3);
        SnappyFramedDecoder.lIlIllIIIlIlII[16] = (0x4F ^ 0x48);
        SnappyFramedDecoder.lIlIllIIIlIlII[17] = (11 + 116 - 4 + 9 ^ 84 + 59 - 94 + 91);
    }
    
    private static boolean llllIIIIIlllIII(final int lllllllllllllIIIIlllIlIlIlIIllll) {
        return lllllllllllllIIIIlllIlIlIlIIllll != 0;
    }
    
    private static boolean llllIIIIIlllIIl(final int lllllllllllllIIIIlllIlIlIlIlIllI, final int lllllllllllllIIIIlllIlIlIlIlIlIl) {
        return lllllllllllllIIIIlllIlIlIlIlIllI < lllllllllllllIIIIlllIlIlIlIlIlIl;
    }
    
    public SnappyFramedDecoder() {
        this((boolean)(SnappyFramedDecoder.lIlIllIIIlIlII[0] != 0));
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIIIlllIlIllIIlIlIl, final ByteBuf lllllllllllllIIIIlllIlIllIIlIIII, final List<Object> lllllllllllllIIIIlllIlIllIIlIIll) throws Exception {
        if (llllIIIIIlllIII(this.corrupted ? 1 : 0)) {
            lllllllllllllIIIIlllIlIllIIlIIII.skipBytes(lllllllllllllIIIIlllIlIllIIlIIII.readableBytes());
            "".length();
            return;
        }
        try {
            final int lllllllllllllIIIIlllIlIllIIlllII = lllllllllllllIIIIlllIlIllIIlIIII.readerIndex();
            final int lllllllllllllIIIIlllIlIllIIllIll = lllllllllllllIIIIlllIlIllIIlIIII.readableBytes();
            if (llllIIIIIlllIIl(lllllllllllllIIIIlllIlIllIIllIll, SnappyFramedDecoder.lIlIllIIIlIlII[1])) {
                return;
            }
            final int lllllllllllllIIIIlllIlIllIIllIlI = lllllllllllllIIIIlllIlIllIIlIIII.getUnsignedByte(lllllllllllllIIIIlllIlIllIIlllII);
            final ChunkType lllllllllllllIIIIlllIlIllIIllIIl = mapChunkType((byte)lllllllllllllIIIIlllIlIllIIllIlI);
            final int lllllllllllllIIIIlllIlIllIIllIII = ByteBufUtil.swapMedium(lllllllllllllIIIIlllIlIllIIlIIII.getUnsignedMedium(lllllllllllllIIIIlllIlIllIIlllII + SnappyFramedDecoder.lIlIllIIIlIlII[2]));
            switch (SnappyFramedDecoder$1.$SwitchMap$io$netty$handler$codec$compression$SnappyFramedDecoder$ChunkType[lllllllllllllIIIIlllIlIllIIllIIl.ordinal()]) {
                case 1: {
                    if (llllIIIIIlllIlI(lllllllllllllIIIIlllIlIllIIllIII, SnappyFramedDecoder.SNAPPY.length)) {
                        throw new DecompressionException(String.valueOf(new StringBuilder().append(SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[0]]).append(lllllllllllllIIIIlllIlIllIIllIII)));
                    }
                    if (llllIIIIIlllIIl(lllllllllllllIIIIlllIlIllIIllIll, SnappyFramedDecoder.lIlIllIIIlIlII[1] + SnappyFramedDecoder.SNAPPY.length)) {
                        "".length();
                        if ((0x53 ^ 0x57) < ((0x2B ^ 0x3B) & ~(0x17 ^ 0x7))) {
                            return;
                        }
                        break;
                    }
                    else {
                        final byte[] lllllllllllllIIIIlllIlIllIIlllIl = new byte[lllllllllllllIIIIlllIlIllIIllIII];
                        lllllllllllllIIIIlllIlIllIIlIIII.skipBytes(SnappyFramedDecoder.lIlIllIIIlIlII[1]).readBytes(lllllllllllllIIIIlllIlIllIIlllIl);
                        "".length();
                        if (llllIIIIIlllIll(Arrays.equals(lllllllllllllIIIIlllIlIllIIlllIl, SnappyFramedDecoder.SNAPPY) ? 1 : 0)) {
                            throw new DecompressionException(SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[2]]);
                        }
                        this.started = (SnappyFramedDecoder.lIlIllIIIlIlII[2] != 0);
                        "".length();
                        if (" ".length() == "  ".length()) {
                            return;
                        }
                        break;
                    }
                    break;
                }
                case 2: {
                    if (llllIIIIIlllIll(this.started ? 1 : 0)) {
                        throw new DecompressionException(SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[3]]);
                    }
                    if (llllIIIIIlllIIl(lllllllllllllIIIIlllIlIllIIllIll, SnappyFramedDecoder.lIlIllIIIlIlII[1] + lllllllllllllIIIIlllIlIllIIllIII)) {
                        return;
                    }
                    lllllllllllllIIIIlllIlIllIIlIIII.skipBytes(SnappyFramedDecoder.lIlIllIIIlIlII[1] + lllllllllllllIIIIlllIlIllIIllIII);
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 3: {
                    throw new DecompressionException(String.valueOf(new StringBuilder().append(SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[4]]).append(Integer.toHexString(lllllllllllllIIIIlllIlIllIIllIlI))));
                }
                case 4: {
                    if (llllIIIIIlllIll(this.started ? 1 : 0)) {
                        throw new DecompressionException(SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[1]]);
                    }
                    if (llllIIIIIllllII(lllllllllllllIIIIlllIlIllIIllIII, SnappyFramedDecoder.lIlIllIIIlIlII[5])) {
                        throw new DecompressionException(SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[6]]);
                    }
                    if (llllIIIIIlllIIl(lllllllllllllIIIIlllIlIllIIllIll, SnappyFramedDecoder.lIlIllIIIlIlII[1] + lllllllllllllIIIIlllIlIllIIllIII)) {
                        return;
                    }
                    lllllllllllllIIIIlllIlIllIIlIIII.skipBytes(SnappyFramedDecoder.lIlIllIIIlIlII[1]);
                    "".length();
                    if (llllIIIIIlllIII(this.validateChecksums ? 1 : 0)) {
                        final int lllllllllllllIIIIlllIlIllIlIIIIl = ByteBufUtil.swapInt(lllllllllllllIIIIlllIlIllIIlIIII.readInt());
                        Snappy.validateChecksum(lllllllllllllIIIIlllIlIllIlIIIIl, lllllllllllllIIIIlllIlIllIIlIIII, lllllllllllllIIIIlllIlIllIIlIIII.readerIndex(), lllllllllllllIIIIlllIlIllIIllIII - SnappyFramedDecoder.lIlIllIIIlIlII[1]);
                        "".length();
                        if (-(0xB4 ^ 0xB0) > 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIIIlllIlIllIIlIIII.skipBytes(SnappyFramedDecoder.lIlIllIIIlIlII[1]);
                        "".length();
                    }
                    lllllllllllllIIIIlllIlIllIIlIIll.add(lllllllllllllIIIIlllIlIllIIlIIII.readSlice(lllllllllllllIIIIlllIlIllIIllIII - SnappyFramedDecoder.lIlIllIIIlIlII[1]).retain());
                    "".length();
                    "".length();
                    if (-" ".length() < -" ".length()) {
                        return;
                    }
                    break;
                }
                case 5: {
                    if (llllIIIIIlllIll(this.started ? 1 : 0)) {
                        throw new DecompressionException(SnappyFramedDecoder.lIlIllIIIlIIll[SnappyFramedDecoder.lIlIllIIIlIlII[7]]);
                    }
                    if (llllIIIIIlllIIl(lllllllllllllIIIIlllIlIllIIllIll, SnappyFramedDecoder.lIlIllIIIlIlII[1] + lllllllllllllIIIIlllIlIllIIllIII)) {
                        return;
                    }
                    lllllllllllllIIIIlllIlIllIIlIIII.skipBytes(SnappyFramedDecoder.lIlIllIIIlIlII[1]);
                    "".length();
                    final int lllllllllllllIIIIlllIlIllIIlllll = ByteBufUtil.swapInt(lllllllllllllIIIIlllIlIllIIlIIII.readInt());
                    final ByteBuf lllllllllllllIIIIlllIlIllIIllllI = lllllllllllllIIIIlllIlIllIIlIlIl.alloc().buffer(SnappyFramedDecoder.lIlIllIIIlIlII[0]);
                    if (llllIIIIIlllIII(this.validateChecksums ? 1 : 0)) {
                        final int lllllllllllllIIIIlllIlIllIlIIIII = lllllllllllllIIIIlllIlIllIIlIIII.writerIndex();
                        try {
                            lllllllllllllIIIIlllIlIllIIlIIII.writerIndex(lllllllllllllIIIIlllIlIllIIlIIII.readerIndex() + lllllllllllllIIIIlllIlIllIIllIII - SnappyFramedDecoder.lIlIllIIIlIlII[1]);
                            "".length();
                            this.snappy.decode(lllllllllllllIIIIlllIlIllIIlIIII, lllllllllllllIIIIlllIlIllIIllllI);
                            lllllllllllllIIIIlllIlIllIIlIIII.writerIndex(lllllllllllllIIIIlllIlIllIlIIIII);
                            "".length();
                            "".length();
                            if (-" ".length() >= " ".length()) {
                                return;
                            }
                        }
                        finally {
                            lllllllllllllIIIIlllIlIllIIlIIII.writerIndex(lllllllllllllIIIIlllIlIllIlIIIII);
                            "".length();
                        }
                        Snappy.validateChecksum(lllllllllllllIIIIlllIlIllIIlllll, lllllllllllllIIIIlllIlIllIIllllI, SnappyFramedDecoder.lIlIllIIIlIlII[0], lllllllllllllIIIIlllIlIllIIllllI.writerIndex());
                        "".length();
                        if (" ".length() == (0x3C ^ 0x38)) {
                            return;
                        }
                    }
                    else {
                        this.snappy.decode(lllllllllllllIIIIlllIlIllIIlIIII.readSlice(lllllllllllllIIIIlllIlIllIIllIII - SnappyFramedDecoder.lIlIllIIIlIlII[1]), lllllllllllllIIIIlllIlIllIIllllI);
                    }
                    lllllllllllllIIIIlllIlIllIIlIIll.add(lllllllllllllIIIIlllIlIllIIllllI);
                    "".length();
                    this.snappy.reset();
                    break;
                }
            }
            "".length();
            if ((96 + 41 - 58 + 66 ^ 10 + 37 + 72 + 30) < -" ".length()) {
                return;
            }
        }
        catch (Exception lllllllllllllIIIIlllIlIllIIlIlll) {
            this.corrupted = (SnappyFramedDecoder.lIlIllIIIlIlII[2] != 0);
            throw lllllllllllllIIIIlllIlIllIIlIlll;
        }
    }
    
    private static ChunkType mapChunkType(final byte lllllllllllllIIIIlllIlIllIIIIIlI) {
        if (llllIIIIIlllIll(lllllllllllllIIIIlllIlIllIIIIIlI)) {
            return ChunkType.COMPRESSED_DATA;
        }
        if (llllIIIIIllllIl(lllllllllllllIIIIlllIlIllIIIIIlI, SnappyFramedDecoder.lIlIllIIIlIlII[2])) {
            return ChunkType.UNCOMPRESSED_DATA;
        }
        if (llllIIIIIllllIl(lllllllllllllIIIIlllIlIllIIIIIlI, SnappyFramedDecoder.lIlIllIIIlIlII[8])) {
            return ChunkType.STREAM_IDENTIFIER;
        }
        if (llllIIIIIllllIl(lllllllllllllIIIIlllIlIllIIIIIlI & SnappyFramedDecoder.lIlIllIIIlIlII[9], SnappyFramedDecoder.lIlIllIIIlIlII[9])) {
            return ChunkType.RESERVED_SKIPPABLE;
        }
        return ChunkType.RESERVED_UNSKIPPABLE;
    }
    
    private static String llllIIIIIllIlII(String lllllllllllllIIIIlllIlIlIlllIIlI, final String lllllllllllllIIIIlllIlIlIlllIIIl) {
        lllllllllllllIIIIlllIlIlIlllIIlI = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlllIlIlIlllIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlllIlIlIlllIlIl = new StringBuilder();
        final char[] lllllllllllllIIIIlllIlIlIlllIlII = lllllllllllllIIIIlllIlIlIlllIIIl.toCharArray();
        int lllllllllllllIIIIlllIlIlIlllIIll = SnappyFramedDecoder.lIlIllIIIlIlII[0];
        final char lllllllllllllIIIIlllIlIlIllIllIl = (Object)((String)lllllllllllllIIIIlllIlIlIlllIIlI).toCharArray();
        final int lllllllllllllIIIIlllIlIlIllIllII = lllllllllllllIIIIlllIlIlIllIllIl.length;
        long lllllllllllllIIIIlllIlIlIllIlIll = SnappyFramedDecoder.lIlIllIIIlIlII[0];
        while (llllIIIIIlllIIl((int)lllllllllllllIIIIlllIlIlIllIlIll, lllllllllllllIIIIlllIlIlIllIllII)) {
            final char lllllllllllllIIIIlllIlIlIllllIII = lllllllllllllIIIIlllIlIlIllIllIl[lllllllllllllIIIIlllIlIlIllIlIll];
            lllllllllllllIIIIlllIlIlIlllIlIl.append((char)(lllllllllllllIIIIlllIlIlIllllIII ^ lllllllllllllIIIIlllIlIlIlllIlII[lllllllllllllIIIIlllIlIlIlllIIll % lllllllllllllIIIIlllIlIlIlllIlII.length]));
            "".length();
            ++lllllllllllllIIIIlllIlIlIlllIIll;
            ++lllllllllllllIIIIlllIlIlIllIlIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlllIlIlIlllIlIl);
    }
    
    static {
        llllIIIIIllIlll();
        llllIIIIIllIllI();
        MAX_UNCOMPRESSED_DATA_SIZE = SnappyFramedDecoder.lIlIllIIIlIlII[5];
        final byte[] snappy = new byte[SnappyFramedDecoder.lIlIllIIIlIlII[7]];
        snappy[SnappyFramedDecoder.lIlIllIIIlIlII[0]] = (byte)SnappyFramedDecoder.lIlIllIIIlIlII[10];
        snappy[SnappyFramedDecoder.lIlIllIIIlIlII[2]] = (byte)SnappyFramedDecoder.lIlIllIIIlIlII[11];
        snappy[SnappyFramedDecoder.lIlIllIIIlIlII[3]] = (byte)SnappyFramedDecoder.lIlIllIIIlIlII[12];
        snappy[SnappyFramedDecoder.lIlIllIIIlIlII[4]] = (byte)SnappyFramedDecoder.lIlIllIIIlIlII[13];
        snappy[SnappyFramedDecoder.lIlIllIIIlIlII[1]] = (byte)SnappyFramedDecoder.lIlIllIIIlIlII[14];
        snappy[SnappyFramedDecoder.lIlIllIIIlIlII[6]] = (byte)SnappyFramedDecoder.lIlIllIIIlIlII[15];
        SNAPPY = snappy;
    }
    
    private enum ChunkType
    {
        private static final /* synthetic */ int[] lIllIIIlIlIIll;
        private static final /* synthetic */ String[] lIllIIIlIlIIIl;
        
        UNCOMPRESSED_DATA, 
        STREAM_IDENTIFIER, 
        RESERVED_SKIPPABLE, 
        COMPRESSED_DATA, 
        RESERVED_UNSKIPPABLE;
        
        private static void lllllIIIIIIIllI() {
            (lIllIIIlIlIIll = new int[7])[0] = ((59 + 42 + 50 + 22 ^ 93 + 118 - 178 + 106) & (0x15 ^ 0x6F ^ (0x77 ^ 0x2B) ^ -" ".length()));
            ChunkType.lIllIIIlIlIIll[1] = " ".length();
            ChunkType.lIllIIIlIlIIll[2] = "  ".length();
            ChunkType.lIllIIIlIlIIll[3] = "   ".length();
            ChunkType.lIllIIIlIlIIll[4] = (0x83 ^ 0x87);
            ChunkType.lIllIIIlIlIIll[5] = (0xA ^ 0xF);
            ChunkType.lIllIIIlIlIIll[6] = (0xC3 ^ 0xC5 ^ (0x7E ^ 0x70));
        }
        
        private static String llllIllllllIlll(final String lllllllllllllIIIIIllIIlIIIlllIlI, final String lllllllllllllIIIIIllIIlIIIlllIIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIIllIIlIIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), ChunkType.lIllIIIlIlIIll[6]), "DES");
                final Cipher lllllllllllllIIIIIllIIlIIIllllII = Cipher.getInstance("DES");
                lllllllllllllIIIIIllIIlIIIllllII.init(ChunkType.lIllIIIlIlIIll[2], lllllllllllllIIIIIllIIlIIIllllIl);
                return new String(lllllllllllllIIIIIllIIlIIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIlIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIIllIIlIIIlllIll) {
                lllllllllllllIIIIIllIIlIIIlllIll.printStackTrace();
                return null;
            }
        }
        
        private static void llllIlllllllIll() {
            (lIllIIIlIlIIIl = new String[ChunkType.lIllIIIlIlIIll[5]])[ChunkType.lIllIIIlIlIIll[0]] = llllIllllllIlll("gBA8CURfpNuuyjm0cq5Ou8Xk2Pb4QNLS", "CmOEI");
            ChunkType.lIllIIIlIlIIIl[ChunkType.lIllIIIlIlIIll[1]] = llllIlllllllIII("601WyHRxxbSLc3rHo8uBoQ==", "jasxR");
            ChunkType.lIllIIIlIlIIIl[ChunkType.lIllIIIlIlIIll[2]] = llllIlllllllIIl("NgQkKBUzGCI0CyYOOCMZNws=", "cJggX");
            ChunkType.lIllIIIlIlIIIl[ChunkType.lIllIIIlIlIIll[3]] = llllIllllllIlll("l6uinNyFe3kGO8YU5jdviBFYVgucCoDq", "hdcPT");
            ChunkType.lIllIIIlIlIIIl[ChunkType.lIllIIIlIlIIll[4]] = llllIlllllllIII("WBvNDHZ2X45k9PjQT+sUBXsWOkPflkcq", "KQFOM");
        }
        
        private static String llllIlllllllIIl(String lllllllllllllIIIIIllIIlIIIlIIlIl, final String lllllllllllllIIIIIllIIlIIIlIIlII) {
            lllllllllllllIIIIIllIIlIIIlIIlIl = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIllIIlIIIlIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIIllIIlIIIlIlIII = new StringBuilder();
            final char[] lllllllllllllIIIIIllIIlIIIlIIlll = lllllllllllllIIIIIllIIlIIIlIIlII.toCharArray();
            int lllllllllllllIIIIIllIIlIIIlIIllI = ChunkType.lIllIIIlIlIIll[0];
            final float lllllllllllllIIIIIllIIlIIIlIIIII = (Object)((String)lllllllllllllIIIIIllIIlIIIlIIlIl).toCharArray();
            final char lllllllllllllIIIIIllIIlIIIIlllll = (char)lllllllllllllIIIIIllIIlIIIlIIIII.length;
            short lllllllllllllIIIIIllIIlIIIIllllI = (short)ChunkType.lIllIIIlIlIIll[0];
            while (lllllIIIIIIIlll(lllllllllllllIIIIIllIIlIIIIllllI, lllllllllllllIIIIIllIIlIIIIlllll)) {
                final char lllllllllllllIIIIIllIIlIIIlIlIll = lllllllllllllIIIIIllIIlIIIlIIIII[lllllllllllllIIIIIllIIlIIIIllllI];
                lllllllllllllIIIIIllIIlIIIlIlIII.append((char)(lllllllllllllIIIIIllIIlIIIlIlIll ^ lllllllllllllIIIIIllIIlIIIlIIlll[lllllllllllllIIIIIllIIlIIIlIIllI % lllllllllllllIIIIIllIIlIIIlIIlll.length]));
                "".length();
                ++lllllllllllllIIIIIllIIlIIIlIIllI;
                ++lllllllllllllIIIIIllIIlIIIIllllI;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIIllIIlIIIlIlIII);
        }
        
        static {
            lllllIIIIIIIllI();
            llllIlllllllIll();
            final ChunkType[] $values = new ChunkType[ChunkType.lIllIIIlIlIIll[5]];
            $values[ChunkType.lIllIIIlIlIIll[0]] = ChunkType.STREAM_IDENTIFIER;
            $values[ChunkType.lIllIIIlIlIIll[1]] = ChunkType.COMPRESSED_DATA;
            $values[ChunkType.lIllIIIlIlIIll[2]] = ChunkType.UNCOMPRESSED_DATA;
            $values[ChunkType.lIllIIIlIlIIll[3]] = ChunkType.RESERVED_UNSKIPPABLE;
            $values[ChunkType.lIllIIIlIlIIll[4]] = ChunkType.RESERVED_SKIPPABLE;
            $VALUES = $values;
        }
        
        private static String llllIlllllllIII(final String lllllllllllllIIIIIllIIlIIlIIIlll, final String lllllllllllllIIIIIllIIlIIlIIIlII) {
            try {
                final SecretKeySpec lllllllllllllIIIIIllIIlIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIlIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIIllIIlIIlIIlIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIIllIIlIIlIIlIIl.init(ChunkType.lIllIIIlIlIIll[2], lllllllllllllIIIIIllIIlIIlIIlIlI);
                return new String(lllllllllllllIIIIIllIIlIIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIlIIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIIllIIlIIlIIlIII) {
                lllllllllllllIIIIIllIIlIIlIIlIII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lllllIIIIIIIlll(final int lllllllllllllIIIIIllIIlIIIIllIlI, final int lllllllllllllIIIIIllIIlIIIIllIIl) {
            return lllllllllllllIIIIIllIIlIIIIllIlI < lllllllllllllIIIIIllIIlIIIIllIIl;
        }
    }
}
