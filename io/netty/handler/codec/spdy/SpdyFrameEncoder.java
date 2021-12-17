// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Iterator;
import java.util.Set;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteOrder;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;

public class SpdyFrameEncoder
{
    private static final /* synthetic */ String[] lIIIlllIIlllll;
    private final /* synthetic */ int version;
    private static final /* synthetic */ int[] lIIIlllIllIllI;
    
    public ByteBuf encodeSynReplyFrame(final ByteBufAllocator lllllllllllllIIllllIllIlIIIlIlIl, final int lllllllllllllIIllllIllIlIIIIlIll, final boolean lllllllllllllIIllllIllIlIIIIlIlI, final ByteBuf lllllllllllllIIllllIllIlIIIIlIIl) {
        final int lllllllllllllIIllllIllIlIIIlIIIl = lllllllllllllIIllllIllIlIIIIlIIl.readableBytes();
        int n;
        if (llIIIlllIIlIlII(lllllllllllllIIllllIllIlIIIIlIlI ? 1 : 0)) {
            n = SpdyFrameEncoder.lIIIlllIllIllI[2];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        else {
            n = SpdyFrameEncoder.lIIIlllIllIllI[0];
        }
        final byte lllllllllllllIIllllIllIlIIIlIIII = (byte)n;
        final int lllllllllllllIIllllIllIlIIIIllll = SpdyFrameEncoder.lIIIlllIllIllI[9] + lllllllllllllIIllllIllIlIIIlIIIl;
        final ByteBuf lllllllllllllIIllllIllIlIIIIlllI = lllllllllllllIIllllIllIlIIIlIlIl.ioBuffer(SpdyFrameEncoder.lIIIlllIllIllI[3] + lllllllllllllIIllllIllIlIIIIllll).order(ByteOrder.BIG_ENDIAN);
        this.writeControlFrameHeader(lllllllllllllIIllllIllIlIIIIlllI, SpdyFrameEncoder.lIIIlllIllIllI[5], lllllllllllllIIllllIllIlIIIlIIII, lllllllllllllIIllllIllIlIIIIllll);
        lllllllllllllIIllllIllIlIIIIlllI.writeInt(lllllllllllllIIllllIllIlIIIIlIll);
        "".length();
        lllllllllllllIIllllIllIlIIIIlllI.writeBytes(lllllllllllllIIllllIllIlIIIIlIIl, lllllllllllllIIllllIllIlIIIIlIIl.readerIndex(), lllllllllllllIIllllIllIlIIIlIIIl);
        "".length();
        return lllllllllllllIIllllIllIlIIIIlllI;
    }
    
    public ByteBuf encodePingFrame(final ByteBufAllocator lllllllllllllIIllllIllIIllIIlIlI, final int lllllllllllllIIllllIllIIllIIIIll) {
        final byte lllllllllllllIIllllIllIIllIIlIII = (byte)SpdyFrameEncoder.lIIIlllIllIllI[0];
        final int lllllllllllllIIllllIllIIllIIIlll = SpdyFrameEncoder.lIIIlllIllIllI[9];
        final ByteBuf lllllllllllllIIllllIllIIllIIIllI = lllllllllllllIIllllIllIIllIIlIlI.ioBuffer(SpdyFrameEncoder.lIIIlllIllIllI[3] + lllllllllllllIIllllIllIIllIIIlll).order(ByteOrder.BIG_ENDIAN);
        this.writeControlFrameHeader(lllllllllllllIIllllIllIIllIIIllI, SpdyFrameEncoder.lIIIlllIllIllI[11], lllllllllllllIIllllIllIIllIIlIII, lllllllllllllIIllllIllIIllIIIlll);
        lllllllllllllIIllllIllIIllIIIllI.writeInt(lllllllllllllIIllllIllIIllIIIIll);
        "".length();
        return lllllllllllllIIllllIllIIllIIIllI;
    }
    
    public SpdyFrameEncoder(final SpdyVersion lllllllllllllIIllllIllIlIllIlIIl) {
        if (llIIIlllIIlIIll(lllllllllllllIIllllIllIlIllIlIIl)) {
            throw new NullPointerException(SpdyFrameEncoder.lIIIlllIIlllll[SpdyFrameEncoder.lIIIlllIllIllI[0]]);
        }
        this.version = lllllllllllllIIllllIllIlIllIlIIl.getVersion();
    }
    
    private static String llIIIllIIlllIlI(final String lllllllllllllIIllllIllIIIlllIIIl, final String lllllllllllllIIllllIllIIIlllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIllIIIlllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIllIIIlllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIllIIIlllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIllIIIlllIlIl.init(SpdyFrameEncoder.lIIIlllIllIllI[5], lllllllllllllIIllllIllIIIlllIllI);
            return new String(lllllllllllllIIllllIllIIIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIllIIIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIllIIIlllIlII) {
            lllllllllllllIIllllIllIIIlllIlII.printStackTrace();
            return null;
        }
    }
    
    private static void llIIIlllIIlIIlI() {
        (lIIIlllIllIllI = new int[14])[0] = ((0x74 ^ 0x48 ^ (0x88 ^ 0xAC)) & (122 + 70 - 76 + 20 ^ 40 + 114 - 107 + 97 ^ -" ".length()));
        SpdyFrameEncoder.lIIIlllIllIllI[1] = (-(0xFFFFEFEF & 0x7E5C) & (0xFFFFEFDB & 0xFE6F));
        SpdyFrameEncoder.lIIIlllIllIllI[2] = " ".length();
        SpdyFrameEncoder.lIIIlllIllIllI[3] = (0x29 ^ 0x39 ^ (0xDA ^ 0xC2));
        SpdyFrameEncoder.lIIIlllIllIllI[4] = (-1 & Integer.MAX_VALUE);
        SpdyFrameEncoder.lIIIlllIllIllI[5] = "  ".length();
        SpdyFrameEncoder.lIIIlllIllIllI[6] = (0x7C ^ 0x76);
        SpdyFrameEncoder.lIIIlllIllIllI[7] = 70 + 83 - 134 + 147 + (95 + 159 - 241 + 161) - (131 + 26 - 139 + 178) + (0x71 ^ 0x1E);
        SpdyFrameEncoder.lIIIlllIllIllI[8] = (0x78 ^ 0x34 ^ (0xFD ^ 0xBC));
        SpdyFrameEncoder.lIIIlllIllIllI[9] = (0x97 ^ 0xAB ^ (0x3B ^ 0x3));
        SpdyFrameEncoder.lIIIlllIllIllI[10] = "   ".length();
        SpdyFrameEncoder.lIIIlllIllIllI[11] = (0x3 ^ 0x5);
        SpdyFrameEncoder.lIIIlllIllIllI[12] = (0x5D ^ 0x5A);
        SpdyFrameEncoder.lIIIlllIllIllI[13] = (114 + 84 - 168 + 131 ^ 105 + 149 - 185 + 99);
    }
    
    private static boolean llIIIlllIIlIIll(final Object lllllllllllllIIllllIllIIIllIllII) {
        return lllllllllllllIIllllIllIIIllIllII == null;
    }
    
    public ByteBuf encodeGoAwayFrame(final ByteBufAllocator lllllllllllllIIllllIllIIlIllIlll, final int lllllllllllllIIllllIllIIlIlIllll, final int lllllllllllllIIllllIllIIlIlIlllI) {
        final byte lllllllllllllIIllllIllIIlIllIlII = (byte)SpdyFrameEncoder.lIIIlllIllIllI[0];
        final int lllllllllllllIIllllIllIIlIllIIll = SpdyFrameEncoder.lIIIlllIllIllI[3];
        final ByteBuf lllllllllllllIIllllIllIIlIllIIlI = lllllllllllllIIllllIllIIlIllIlll.ioBuffer(SpdyFrameEncoder.lIIIlllIllIllI[3] + lllllllllllllIIllllIllIIlIllIIll).order(ByteOrder.BIG_ENDIAN);
        this.writeControlFrameHeader(lllllllllllllIIllllIllIIlIllIIlI, SpdyFrameEncoder.lIIIlllIllIllI[12], lllllllllllllIIllllIllIIlIllIlII, lllllllllllllIIllllIllIIlIllIIll);
        lllllllllllllIIllllIllIIlIllIIlI.writeInt(lllllllllllllIIllllIllIIlIlIllll);
        "".length();
        lllllllllllllIIllllIllIIlIllIIlI.writeInt(lllllllllllllIIllllIllIIlIlIlllI);
        "".length();
        return lllllllllllllIIllllIllIIlIllIIlI;
    }
    
    private void writeControlFrameHeader(final ByteBuf lllllllllllllIIllllIllIlIlIlllIl, final int lllllllllllllIIllllIllIlIllIIIIl, final byte lllllllllllllIIllllIllIlIlIllIll, final int lllllllllllllIIllllIllIlIlIllIlI) {
        lllllllllllllIIllllIllIlIlIlllIl.writeShort(this.version | SpdyFrameEncoder.lIIIlllIllIllI[1]);
        "".length();
        lllllllllllllIIllllIllIlIlIlllIl.writeShort(lllllllllllllIIllllIllIlIllIIIIl);
        "".length();
        lllllllllllllIIllllIllIlIlIlllIl.writeByte(lllllllllllllIIllllIllIlIlIllIll);
        "".length();
        lllllllllllllIIllllIllIlIlIlllIl.writeMedium(lllllllllllllIIllllIllIlIlIllIlI);
        "".length();
    }
    
    public ByteBuf encodeHeadersFrame(final ByteBufAllocator lllllllllllllIIllllIllIIlIIlIlll, final int lllllllllllllIIllllIllIIlIIlllll, final boolean lllllllllllllIIllllIllIIlIIllllI, final ByteBuf lllllllllllllIIllllIllIIlIIlIlII) {
        final int lllllllllllllIIllllIllIIlIIlllII = lllllllllllllIIllllIllIIlIIlIlII.readableBytes();
        int n;
        if (llIIIlllIIlIlII(lllllllllllllIIllllIllIIlIIllllI ? 1 : 0)) {
            n = SpdyFrameEncoder.lIIIlllIllIllI[2];
            "".length();
            if (-" ".length() > ((0x16 ^ 0x29) & ~(0xB ^ 0x34))) {
                return null;
            }
        }
        else {
            n = SpdyFrameEncoder.lIIIlllIllIllI[0];
        }
        final byte lllllllllllllIIllllIllIIlIIllIll = (byte)n;
        final int lllllllllllllIIllllIllIIlIIllIlI = SpdyFrameEncoder.lIIIlllIllIllI[9] + lllllllllllllIIllllIllIIlIIlllII;
        final ByteBuf lllllllllllllIIllllIllIIlIIllIIl = lllllllllllllIIllllIllIIlIIlIlll.ioBuffer(SpdyFrameEncoder.lIIIlllIllIllI[3] + lllllllllllllIIllllIllIIlIIllIlI).order(ByteOrder.BIG_ENDIAN);
        this.writeControlFrameHeader(lllllllllllllIIllllIllIIlIIllIIl, SpdyFrameEncoder.lIIIlllIllIllI[3], lllllllllllllIIllllIllIIlIIllIll, lllllllllllllIIllllIllIIlIIllIlI);
        lllllllllllllIIllllIllIIlIIllIIl.writeInt(lllllllllllllIIllllIllIIlIIlllll);
        "".length();
        lllllllllllllIIllllIllIIlIIllIIl.writeBytes(lllllllllllllIIllllIllIIlIIlIlII, lllllllllllllIIllllIllIIlIIlIlII.readerIndex(), lllllllllllllIIllllIllIIlIIlllII);
        "".length();
        return lllllllllllllIIllllIllIIlIIllIIl;
    }
    
    public ByteBuf encodeRstStreamFrame(final ByteBufAllocator lllllllllllllIIllllIllIIllllllII, final int lllllllllllllIIllllIllIIllllIlII, final int lllllllllllllIIllllIllIIlllllIlI) {
        final byte lllllllllllllIIllllIllIIlllllIIl = (byte)SpdyFrameEncoder.lIIIlllIllIllI[0];
        final int lllllllllllllIIllllIllIIlllllIII = SpdyFrameEncoder.lIIIlllIllIllI[3];
        final ByteBuf lllllllllllllIIllllIllIIllllIlll = lllllllllllllIIllllIllIIllllllII.ioBuffer(SpdyFrameEncoder.lIIIlllIllIllI[3] + lllllllllllllIIllllIllIIlllllIII).order(ByteOrder.BIG_ENDIAN);
        this.writeControlFrameHeader(lllllllllllllIIllllIllIIllllIlll, SpdyFrameEncoder.lIIIlllIllIllI[10], lllllllllllllIIllllIllIIlllllIIl, lllllllllllllIIllllIllIIlllllIII);
        lllllllllllllIIllllIllIIllllIlll.writeInt(lllllllllllllIIllllIllIIllllIlII);
        "".length();
        lllllllllllllIIllllIllIIllllIlll.writeInt(lllllllllllllIIllllIllIIlllllIlI);
        "".length();
        return lllllllllllllIIllllIllIIllllIlll;
    }
    
    public ByteBuf encodeSynStreamFrame(final ByteBufAllocator lllllllllllllIIllllIllIlIIllIllI, final int lllllllllllllIIllllIllIlIIllIlIl, final int lllllllllllllIIllllIllIlIIllIlII, final byte lllllllllllllIIllllIllIlIIlIIlll, final boolean lllllllllllllIIllllIllIlIIllIIlI, final boolean lllllllllllllIIllllIllIlIIllIIIl, final ByteBuf lllllllllllllIIllllIllIlIIllIIII) {
        final int lllllllllllllIIllllIllIlIIlIllll = lllllllllllllIIllllIllIlIIllIIII.readableBytes();
        int n;
        if (llIIIlllIIlIlII(lllllllllllllIIllllIllIlIIllIIlI ? 1 : 0)) {
            n = SpdyFrameEncoder.lIIIlllIllIllI[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            n = SpdyFrameEncoder.lIIIlllIllIllI[0];
        }
        byte lllllllllllllIIllllIllIlIIlIlllI = (byte)n;
        if (llIIIlllIIlIlII(lllllllllllllIIllllIllIlIIllIIIl ? 1 : 0)) {
            lllllllllllllIIllllIllIlIIlIlllI |= (byte)SpdyFrameEncoder.lIIIlllIllIllI[5];
        }
        final int lllllllllllllIIllllIllIlIIlIllIl = SpdyFrameEncoder.lIIIlllIllIllI[6] + lllllllllllllIIllllIllIlIIlIllll;
        final ByteBuf lllllllllllllIIllllIllIlIIlIllII = lllllllllllllIIllllIllIlIIllIllI.ioBuffer(SpdyFrameEncoder.lIIIlllIllIllI[3] + lllllllllllllIIllllIllIlIIlIllIl).order(ByteOrder.BIG_ENDIAN);
        this.writeControlFrameHeader(lllllllllllllIIllllIllIlIIlIllII, SpdyFrameEncoder.lIIIlllIllIllI[2], lllllllllllllIIllllIllIlIIlIlllI, lllllllllllllIIllllIllIlIIlIllIl);
        lllllllllllllIIllllIllIlIIlIllII.writeInt(lllllllllllllIIllllIllIlIIllIlIl);
        "".length();
        lllllllllllllIIllllIllIlIIlIllII.writeInt(lllllllllllllIIllllIllIlIIllIlII);
        "".length();
        lllllllllllllIIllllIllIlIIlIllII.writeShort((lllllllllllllIIllllIllIlIIlIIlll & SpdyFrameEncoder.lIIIlllIllIllI[7]) << SpdyFrameEncoder.lIIIlllIllIllI[8]);
        "".length();
        lllllllllllllIIllllIllIlIIlIllII.writeBytes(lllllllllllllIIllllIllIlIIllIIII, lllllllllllllIIllllIllIlIIllIIII.readerIndex(), lllllllllllllIIllllIllIlIIlIllll);
        "".length();
        return lllllllllllllIIllllIllIlIIlIllII;
    }
    
    public ByteBuf encodeWindowUpdateFrame(final ByteBufAllocator lllllllllllllIIllllIllIIlIIIIlll, final int lllllllllllllIIllllIllIIIlllllll, final int lllllllllllllIIllllIllIIlIIIIlIl) {
        final byte lllllllllllllIIllllIllIIlIIIIlII = (byte)SpdyFrameEncoder.lIIIlllIllIllI[0];
        final int lllllllllllllIIllllIllIIlIIIIIll = SpdyFrameEncoder.lIIIlllIllIllI[3];
        final ByteBuf lllllllllllllIIllllIllIIlIIIIIlI = lllllllllllllIIllllIllIIlIIIIlll.ioBuffer(SpdyFrameEncoder.lIIIlllIllIllI[3] + lllllllllllllIIllllIllIIlIIIIIll).order(ByteOrder.BIG_ENDIAN);
        this.writeControlFrameHeader(lllllllllllllIIllllIllIIlIIIIIlI, SpdyFrameEncoder.lIIIlllIllIllI[13], lllllllllllllIIllllIllIIlIIIIlII, lllllllllllllIIllllIllIIlIIIIIll);
        lllllllllllllIIllllIllIIlIIIIIlI.writeInt(lllllllllllllIIllllIllIIIlllllll);
        "".length();
        lllllllllllllIIllllIllIIlIIIIIlI.writeInt(lllllllllllllIIllllIllIIlIIIIlIl);
        "".length();
        return lllllllllllllIIllllIllIIlIIIIIlI;
    }
    
    public ByteBuf encodeDataFrame(final ByteBufAllocator lllllllllllllIIllllIllIlIlIlIIIl, final int lllllllllllllIIllllIllIlIlIlIIII, final boolean lllllllllllllIIllllIllIlIlIIllll, final ByteBuf lllllllllllllIIllllIllIlIlIIlllI) {
        int n;
        if (llIIIlllIIlIlII(lllllllllllllIIllllIllIlIlIIllll ? 1 : 0)) {
            n = SpdyFrameEncoder.lIIIlllIllIllI[2];
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
        }
        else {
            n = SpdyFrameEncoder.lIIIlllIllIllI[0];
        }
        final byte lllllllllllllIIllllIllIlIlIIllIl = (byte)n;
        final int lllllllllllllIIllllIllIlIlIIllII = lllllllllllllIIllllIllIlIlIIlllI.readableBytes();
        final ByteBuf lllllllllllllIIllllIllIlIlIIlIll = lllllllllllllIIllllIllIlIlIlIIIl.ioBuffer(SpdyFrameEncoder.lIIIlllIllIllI[3] + lllllllllllllIIllllIllIlIlIIllII).order(ByteOrder.BIG_ENDIAN);
        lllllllllllllIIllllIllIlIlIIlIll.writeInt(lllllllllllllIIllllIllIlIlIlIIII & SpdyFrameEncoder.lIIIlllIllIllI[4]);
        "".length();
        lllllllllllllIIllllIllIlIlIIlIll.writeByte(lllllllllllllIIllllIllIlIlIIllIl);
        "".length();
        lllllllllllllIIllllIllIlIlIIlIll.writeMedium(lllllllllllllIIllllIllIlIlIIllII);
        "".length();
        lllllllllllllIIllllIllIlIlIIlIll.writeBytes(lllllllllllllIIllllIllIlIlIIlllI, lllllllllllllIIllllIllIlIlIIlllI.readerIndex(), lllllllllllllIIllllIllIlIlIIllII);
        "".length();
        return lllllllllllllIIllllIllIlIlIIlIll;
    }
    
    public ByteBuf encodeSettingsFrame(final ByteBufAllocator lllllllllllllIIllllIllIIllIllIlI, final SpdySettingsFrame lllllllllllllIIllllIllIIlllIIIIl) {
        final Set<Integer> lllllllllllllIIllllIllIIlllIIIII = lllllllllllllIIllllIllIIlllIIIIl.ids();
        final int lllllllllllllIIllllIllIIllIlllll = lllllllllllllIIllllIllIIlllIIIII.size();
        int n;
        if (llIIIlllIIlIlII(lllllllllllllIIllllIllIIlllIIIIl.clearPreviouslyPersistedSettings() ? 1 : 0)) {
            n = SpdyFrameEncoder.lIIIlllIllIllI[2];
            "".length();
            if (-" ".length() >= ((0x9F ^ 0xB0) & ~(0xAE ^ 0x81))) {
                return null;
            }
        }
        else {
            n = SpdyFrameEncoder.lIIIlllIllIllI[0];
        }
        byte lllllllllllllIIllllIllIIllIllllI = (byte)n;
        final int lllllllllllllIIllllIllIIllIlllIl = SpdyFrameEncoder.lIIIlllIllIllI[9] + SpdyFrameEncoder.lIIIlllIllIllI[3] * lllllllllllllIIllllIllIIllIlllll;
        final ByteBuf lllllllllllllIIllllIllIIllIlllII = lllllllllllllIIllllIllIIllIllIlI.ioBuffer(SpdyFrameEncoder.lIIIlllIllIllI[3] + lllllllllllllIIllllIllIIllIlllIl).order(ByteOrder.BIG_ENDIAN);
        this.writeControlFrameHeader(lllllllllllllIIllllIllIIllIlllII, SpdyFrameEncoder.lIIIlllIllIllI[9], lllllllllllllIIllllIllIIllIllllI, lllllllllllllIIllllIllIIllIlllIl);
        lllllllllllllIIllllIllIIllIlllII.writeInt(lllllllllllllIIllllIllIIllIlllll);
        "".length();
        final Iterator lllllllllllllIIllllIllIIlllIIlII = lllllllllllllIIllllIllIIlllIIIII.iterator();
        while (llIIIlllIIlIlII(lllllllllllllIIllllIllIIlllIIlII.hasNext() ? 1 : 0)) {
            final Integer lllllllllllllIIllllIllIIlllIIlIl = lllllllllllllIIllllIllIIlllIIlII.next();
            lllllllllllllIIllllIllIIllIllllI = (byte)SpdyFrameEncoder.lIIIlllIllIllI[0];
            if (llIIIlllIIlIlII(lllllllllllllIIllllIllIIlllIIIIl.isPersistValue(lllllllllllllIIllllIllIIlllIIlIl) ? 1 : 0)) {
                lllllllllllllIIllllIllIIllIllllI |= (byte)SpdyFrameEncoder.lIIIlllIllIllI[2];
            }
            if (llIIIlllIIlIlII(lllllllllllllIIllllIllIIlllIIIIl.isPersisted(lllllllllllllIIllllIllIIlllIIlIl) ? 1 : 0)) {
                lllllllllllllIIllllIllIIllIllllI |= (byte)SpdyFrameEncoder.lIIIlllIllIllI[5];
            }
            lllllllllllllIIllllIllIIllIlllII.writeByte(lllllllllllllIIllllIllIIllIllllI);
            "".length();
            lllllllllllllIIllllIllIIllIlllII.writeMedium(lllllllllllllIIllllIllIIlllIIlIl);
            "".length();
            lllllllllllllIIllllIllIIllIlllII.writeInt(lllllllllllllIIllllIllIIlllIIIIl.getValue(lllllllllllllIIllllIllIIlllIIlIl));
            "".length();
            "".length();
            if (null != null) {
                return null;
            }
        }
        return lllllllllllllIIllllIllIIllIlllII;
    }
    
    static {
        llIIIlllIIlIIlI();
        llIIIllIIlllIll();
    }
    
    private static void llIIIllIIlllIll() {
        (lIIIlllIIlllll = new String[SpdyFrameEncoder.lIIIlllIllIllI[2]])[SpdyFrameEncoder.lIIIlllIllIllI[0]] = llIIIllIIlllIlI("04HXVRHROOuvo0bkMqXy+g==", "Oldgx");
    }
    
    private static boolean llIIIlllIIlIlII(final int lllllllllllllIIllllIllIIIllIlIlI) {
        return lllllllllllllIIllllIllIIIllIlIlI != 0;
    }
}
