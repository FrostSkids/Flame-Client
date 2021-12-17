// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBufUtil;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

public class SnappyFramedEncoder extends MessageToByteEncoder<ByteBuf>
{
    private static final /* synthetic */ String[] lIllIlIlIIllIl;
    private static final /* synthetic */ byte[] STREAM_START;
    private /* synthetic */ boolean started;
    private final /* synthetic */ Snappy snappy;
    private static final /* synthetic */ int[] lIllIlIlIlIIII;
    
    private static String llllllIlIlllllI(final String llllllllllllIllllllllllIlIllIIll, final String llllllllllllIllllllllllIlIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllllllllllIlIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllllllIlIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllllllIlIllIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllllllllllIlIllIlll.init(SnappyFramedEncoder.lIllIlIlIlIIII[10], llllllllllllIllllllllllIlIlllIII);
            return new String(llllllllllllIllllllllllIlIllIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllllllIlIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllllllIlIllIllI) {
            llllllllllllIllllllllllIlIllIllI.printStackTrace();
            return null;
        }
    }
    
    private static void calculateAndWriteChecksum(final ByteBuf llllllllllllIllllllllllIllIIllII, final ByteBuf llllllllllllIllllllllllIllIIlIIl) {
        llllllllllllIllllllllllIllIIlIIl.writeInt(ByteBufUtil.swapInt(Snappy.calculateChecksum(llllllllllllIllllllllllIllIIllII)));
        "".length();
    }
    
    private static boolean llllllIllIIIlIl(final int llllllllllllIllllllllllIlIlIlIIl, final int llllllllllllIllllllllllIlIlIlIII) {
        return llllllllllllIllllllllllIlIlIlIIl > llllllllllllIllllllllllIlIlIlIII;
    }
    
    private static boolean llllllIllIIIlII(final int llllllllllllIllllllllllIlIlIIlII) {
        return llllllllllllIllllllllllIlIlIIlII == 0;
    }
    
    private static void writeUnencodedChunk(final ByteBuf llllllllllllIllllllllllIlllIIIll, final ByteBuf llllllllllllIllllllllllIllIlllll, final int llllllllllllIllllllllllIlllIIIIl) {
        llllllllllllIllllllllllIllIlllll.writeByte(SnappyFramedEncoder.lIllIlIlIlIIII[0]);
        "".length();
        writeChunkLength(llllllllllllIllllllllllIllIlllll, llllllllllllIllllllllllIlllIIIIl + SnappyFramedEncoder.lIllIlIlIlIIII[4]);
        calculateAndWriteChecksum(llllllllllllIllllllllllIlllIIIll, llllllllllllIllllllllllIllIlllll);
        llllllllllllIllllllllllIllIlllll.writeBytes(llllllllllllIllllllllllIlllIIIll, llllllllllllIllllllllllIlllIIIIl);
        "".length();
    }
    
    private static void llllllIllIIIIll() {
        (lIllIlIlIlIIII = new int[21])[0] = " ".length();
        SnappyFramedEncoder.lIllIlIlIlIIII[1] = (0xD4 ^ 0x81 ^ (0x4D ^ 0xA));
        SnappyFramedEncoder.lIllIlIlIlIIII[2] = ((0x94 ^ 0x9A) & ~(0xE ^ 0x0));
        SnappyFramedEncoder.lIllIlIlIlIIII[3] = (-1 & 0x7FFF);
        SnappyFramedEncoder.lIllIlIlIlIIII[4] = (0x7A ^ 0x7E);
        SnappyFramedEncoder.lIllIlIlIlIIII[5] = "   ".length();
        SnappyFramedEncoder.lIllIlIlIlIIII[6] = (93 + 5 - 40 + 72 ^ 86 + 51 + 16 + 1);
        SnappyFramedEncoder.lIllIlIlIlIIII[7] = (0x2B ^ 0x1B ^ (0x95 ^ 0xAF));
        SnappyFramedEncoder.lIllIlIlIlIIII[8] = -" ".length();
        SnappyFramedEncoder.lIllIlIlIlIIII[9] = (0xA3 ^ 0xA5);
        SnappyFramedEncoder.lIllIlIlIlIIII[10] = "  ".length();
        SnappyFramedEncoder.lIllIlIlIlIIII[11] = (0xA2 ^ 0xA8 ^ (0xB ^ 0x72));
        SnappyFramedEncoder.lIllIlIlIlIIII[12] = (0x39 ^ 0x79 ^ (0xCE ^ 0x8B));
        SnappyFramedEncoder.lIllIlIlIlIIII[13] = (92 + 46 + 59 + 9 ^ 7 + 81 + 39 + 1);
        SnappyFramedEncoder.lIllIlIlIlIIII[14] = (0x25 ^ 0x44);
        SnappyFramedEncoder.lIllIlIlIlIIII[15] = (0xC4 ^ 0xC3);
        SnappyFramedEncoder.lIllIlIlIlIIII[16] = (203 + 205 - 366 + 202 ^ 149 + 162 - 294 + 147);
        SnappyFramedEncoder.lIllIlIlIlIIII[17] = (109 + 88 - 41 + 13 ^ 124 + 1 - 58 + 94);
        SnappyFramedEncoder.lIllIlIlIlIIII[18] = (8 + 95 + 77 + 47 ^ 68 + 139 - 76 + 16);
        SnappyFramedEncoder.lIllIlIlIlIIII[19] = (0x87 ^ 0x8E);
        SnappyFramedEncoder.lIllIlIlIlIIII[20] = (0x7C ^ 0x1B ^ (0x7 ^ 0x39));
    }
    
    private static void setChunkLength(final ByteBuf llllllllllllIllllllllllIllIllIlI, final int llllllllllllIllllllllllIllIlIllI) {
        final int llllllllllllIllllllllllIllIllIII = llllllllllllIllllllllllIllIllIlI.writerIndex() - llllllllllllIllllllllllIllIlIllI - SnappyFramedEncoder.lIllIlIlIlIIII[5];
        if (llllllIllIIIlll(llllllllllllIllllllllllIllIllIII >>> SnappyFramedEncoder.lIllIlIlIlIIII[6])) {
            throw new CompressionException(String.valueOf(new StringBuilder().append(SnappyFramedEncoder.lIllIlIlIIllIl[SnappyFramedEncoder.lIllIlIlIlIIII[2]]).append(llllllllllllIllllllllllIllIllIII)));
        }
        llllllllllllIllllllllllIllIllIlI.setMedium(llllllllllllIllllllllllIllIlIllI, ByteBufUtil.swapMedium(llllllllllllIllllllllllIllIllIII));
        "".length();
    }
    
    public SnappyFramedEncoder() {
        this.snappy = new Snappy();
    }
    
    private static boolean llllllIllIIIllI(final int llllllllllllIllllllllllIlIlIllIl, final int llllllllllllIllllllllllIlIlIllII) {
        return llllllllllllIllllllllllIlIlIllIl < llllllllllllIllllllllllIlIlIllII;
    }
    
    private static void writeChunkLength(final ByteBuf llllllllllllIllllllllllIllIlIIlI, final int llllllllllllIllllllllllIllIlIIIl) {
        llllllllllllIllllllllllIllIlIIlI.writeMedium(ByteBufUtil.swapMedium(llllllllllllIllllllllllIllIlIIIl));
        "".length();
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIllllllllllIllllIIII, final ByteBuf llllllllllllIllllllllllIlllIlIll, final ByteBuf llllllllllllIllllllllllIlllIlllI) throws Exception {
        if (llllllIllIIIlII(llllllllllllIllllllllllIlllIlIll.isReadable() ? 1 : 0)) {
            return;
        }
        if (llllllIllIIIlII(this.started ? 1 : 0)) {
            this.started = (SnappyFramedEncoder.lIllIlIlIlIIII[0] != 0);
            llllllllllllIllllllllllIlllIlllI.writeBytes(SnappyFramedEncoder.STREAM_START);
            "".length();
        }
        int llllllllllllIllllllllllIlllIllIl = llllllllllllIllllllllllIlllIlIll.readableBytes();
        if (llllllIllIIIlIl(llllllllllllIllllllllllIlllIllIl, SnappyFramedEncoder.lIllIlIlIlIIII[1])) {
            do {
                final int llllllllllllIllllllllllIllllIIlI = llllllllllllIllllllllllIlllIlllI.writerIndex() + SnappyFramedEncoder.lIllIlIlIlIIII[0];
                if (llllllIllIIIllI(llllllllllllIllllllllllIlllIllIl, SnappyFramedEncoder.lIllIlIlIlIIII[1])) {
                    final ByteBuf llllllllllllIllllllllllIllllIlIl = llllllllllllIllllllllllIlllIlIll.readSlice(llllllllllllIllllllllllIlllIllIl);
                    writeUnencodedChunk(llllllllllllIllllllllllIllllIlIl, llllllllllllIllllllllllIlllIlllI, llllllllllllIllllllllllIlllIllIl);
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIllllllllllIlllIlllI.writeInt(SnappyFramedEncoder.lIllIlIlIlIIII[2]);
                    "".length();
                    if (llllllIllIIIlIl(llllllllllllIllllllllllIlllIllIl, SnappyFramedEncoder.lIllIlIlIlIIII[3])) {
                        final ByteBuf llllllllllllIllllllllllIllllIlII = llllllllllllIllllllllllIlllIlIll.readSlice(SnappyFramedEncoder.lIllIlIlIlIIII[3]);
                        calculateAndWriteChecksum(llllllllllllIllllllllllIllllIlII, llllllllllllIllllllllllIlllIlllI);
                        this.snappy.encode(llllllllllllIllllllllllIllllIlII, llllllllllllIllllllllllIlllIlllI, SnappyFramedEncoder.lIllIlIlIlIIII[3]);
                        setChunkLength(llllllllllllIllllllllllIlllIlllI, llllllllllllIllllllllllIllllIIlI);
                        llllllllllllIllllllllllIlllIllIl -= 32767;
                        "".length();
                        if (-" ".length() > "   ".length()) {
                            return;
                        }
                        "".length();
                    }
                    else {
                        final ByteBuf llllllllllllIllllllllllIllllIIll = llllllllllllIllllllllllIlllIlIll.readSlice(llllllllllllIllllllllllIlllIllIl);
                        calculateAndWriteChecksum(llllllllllllIllllllllllIllllIIll, llllllllllllIllllllllllIlllIlllI);
                        this.snappy.encode(llllllllllllIllllllllllIllllIIll, llllllllllllIllllllllllIlllIlllI, llllllllllllIllllllllllIlllIllIl);
                        setChunkLength(llllllllllllIllllllllllIlllIlllI, llllllllllllIllllllllllIllllIIlI);
                        "".length();
                        if ((" ".length() & (" ".length() ^ -" ".length())) > " ".length()) {
                            return;
                        }
                    }
                }
            } while (null == null);
            return;
        }
        writeUnencodedChunk(llllllllllllIllllllllllIlllIlIll, llllllllllllIllllllllllIlllIlllI, llllllllllllIllllllllllIlllIllIl);
    }
    
    private static boolean llllllIllIIIlll(final int llllllllllllIllllllllllIlIlIIllI) {
        return llllllllllllIllllllllllIlIlIIllI != 0;
    }
    
    static {
        llllllIllIIIIll();
        llllllIlIllllll();
        MIN_COMPRESSIBLE_LENGTH = SnappyFramedEncoder.lIllIlIlIlIIII[1];
        final byte[] stream_START = new byte[SnappyFramedEncoder.lIllIlIlIlIIII[7]];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[2]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[8];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[0]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[9];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[10]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[2];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[5]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[2];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[4]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[11];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[12]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[13];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[9]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[14];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[15]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[16];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[17]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[18];
        stream_START[SnappyFramedEncoder.lIllIlIlIlIIII[19]] = (byte)SnappyFramedEncoder.lIllIlIlIlIIII[20];
        STREAM_START = stream_START;
    }
    
    private static void llllllIlIllllll() {
        (lIllIlIlIIllIl = new String[SnappyFramedEncoder.lIllIlIlIlIIII[0]])[SnappyFramedEncoder.lIllIlIlIlIIII[2]] = llllllIlIlllllI("VYInLysBzGdlroK2Fv3WU2IDMcVC9cMArrmMv0rRnn0=", "XOqRh");
    }
}
