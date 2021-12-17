// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.compression.CompressionException;
import com.jcraft.jzlib.JZlib;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.jcraft.jzlib.Deflater;

class SpdyHeaderBlockJZlibEncoder extends SpdyHeaderBlockRawEncoder
{
    private static final /* synthetic */ int[] lllllIIIllIIl;
    private static final /* synthetic */ String[] lllllIIIlIllI;
    private /* synthetic */ boolean finished;
    private final /* synthetic */ Deflater z;
    
    static {
        lIlIllIlIIlIlll();
        lIlIllIlIIlIIII();
    }
    
    private static boolean lIlIllIlIIllIll(final int lllllllllllllIlIllIIIIIllIIlIIlI) {
        return lllllllllllllIlIllIIIIIllIIlIIlI != 0;
    }
    
    private static String lIlIllIlIIIllIl(String lllllllllllllIlIllIIIIIllIlIlIlI, final String lllllllllllllIlIllIIIIIllIlIlllI) {
        lllllllllllllIlIllIIIIIllIlIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIIIIllIlIllIl = new StringBuilder();
        final char[] lllllllllllllIlIllIIIIIllIlIllII = lllllllllllllIlIllIIIIIllIlIlllI.toCharArray();
        int lllllllllllllIlIllIIIIIllIlIlIll = SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[1];
        final char lllllllllllllIlIllIIIIIllIlIIlIl = (Object)lllllllllllllIlIllIIIIIllIlIlIlI.toCharArray();
        final char lllllllllllllIlIllIIIIIllIlIIlII = (char)lllllllllllllIlIllIIIIIllIlIIlIl.length;
        byte lllllllllllllIlIllIIIIIllIlIIIll = (byte)SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[1];
        while (lIlIllIlIIlllll(lllllllllllllIlIllIIIIIllIlIIIll, lllllllllllllIlIllIIIIIllIlIIlII)) {
            final char lllllllllllllIlIllIIIIIllIllIIII = lllllllllllllIlIllIIIIIllIlIIlIl[lllllllllllllIlIllIIIIIllIlIIIll];
            lllllllllllllIlIllIIIIIllIlIllIl.append((char)(lllllllllllllIlIllIIIIIllIllIIII ^ lllllllllllllIlIllIIIIIllIlIllII[lllllllllllllIlIllIIIIIllIlIlIll % lllllllllllllIlIllIIIIIllIlIllII.length]));
            "".length();
            ++lllllllllllllIlIllIIIIIllIlIlIll;
            ++lllllllllllllIlIllIIIIIllIlIIIll;
            "".length();
            if (((0x1B ^ 0x52 ^ (0x4E ^ 0x36)) & (0xB7 ^ 0x86 ^ ((0x8 ^ 0x57) & ~(0x1C ^ 0x43)) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIIIIllIlIllIl);
    }
    
    SpdyHeaderBlockJZlibEncoder(final SpdyVersion lllllllllllllIlIllIIIIlIIIIIIlII, final int lllllllllllllIlIllIIIIlIIIIIIIll, final int lllllllllllllIlIllIIIIlIIIIIIIlI, final int lllllllllllllIlIllIIIIlIIIIIIIIl) {
        super(lllllllllllllIlIllIIIIlIIIIIIlII);
        this.z = new Deflater();
        if (!lIlIllIlIIllIII(lllllllllllllIlIllIIIIlIIIIIIIll) || lIlIllIlIIllIIl(lllllllllllllIlIllIIIIlIIIIIIIll, SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[0])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[1]]).append(lllllllllllllIlIllIIIIlIIIIIIIll).append(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[2]])));
        }
        if (!lIlIllIlIIllIlI(lllllllllllllIlIllIIIIlIIIIIIIlI, SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[0]) || lIlIllIlIIllIIl(lllllllllllllIlIllIIIIlIIIIIIIlI, SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[3])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[4]]).append(lllllllllllllIlIllIIIIlIIIIIIIlI).append(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[5]])));
        }
        if (!lIlIllIlIIllIlI(lllllllllllllIlIllIIIIlIIIIIIIIl, SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[2]) || lIlIllIlIIllIIl(lllllllllllllIlIllIIIIlIIIIIIIIl, SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[0])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[6]]).append(lllllllllllllIlIllIIIIlIIIIIIIIl).append(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[7]])));
        }
        int lllllllllllllIlIllIIIIlIIIIIIIII = this.z.deflateInit(lllllllllllllIlIllIIIIlIIIIIIIll, lllllllllllllIlIllIIIIlIIIIIIIlI, lllllllllllllIlIllIIIIlIIIIIIIIl, JZlib.W_ZLIB);
        if (lIlIllIlIIllIll(lllllllllllllIlIllIIIIlIIIIIIIII)) {
            throw new CompressionException(String.valueOf(new StringBuilder().append(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[8]]).append(lllllllllllllIlIllIIIIlIIIIIIIII)));
        }
        lllllllllllllIlIllIIIIlIIIIIIIII = this.z.deflateSetDictionary(SpdyCodecUtil.SPDY_DICT, SpdyCodecUtil.SPDY_DICT.length);
        if (lIlIllIlIIllIll(lllllllllllllIlIllIIIIlIIIIIIIII)) {
            throw new CompressionException(String.valueOf(new StringBuilder().append(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[9]]).append(lllllllllllllIlIllIIIIlIIIIIIIII)));
        }
    }
    
    private static void lIlIllIlIIlIlll() {
        (lllllIIIllIIl = new int[13])[0] = (0x60 ^ 0x69);
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[1] = ("  ".length() & ~"  ".length());
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[2] = " ".length();
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[3] = (0x8B ^ 0x84);
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[4] = "  ".length();
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[5] = "   ".length();
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[6] = (30 + 162 - 52 + 33 ^ 44 + 95 - 102 + 132);
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[7] = (0x1C ^ 0x7A ^ (0x14 ^ 0x77));
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[8] = (0xA7 ^ 0xA1);
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[9] = (169 + 102 - 100 + 14 ^ 4 + 132 + 18 + 36);
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[10] = (0x42 ^ 0x4E);
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[11] = (128 + 48 - 167 + 180 ^ 108 + 142 - 242 + 173);
        SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[12] = (0x91 ^ 0x9B);
    }
    
    private static boolean lIlIllIlIIllIlI(final int lllllllllllllIlIllIIIIIllIIlllll, final int lllllllllllllIlIllIIIIIllIIllllI) {
        return lllllllllllllIlIllIIIIIllIIlllll >= lllllllllllllIlIllIIIIIllIIllllI;
    }
    
    private static boolean lIlIllIlIIlllIl(final int lllllllllllllIlIllIIIIIllIIlIIII) {
        return lllllllllllllIlIllIIIIIllIIlIIII == 0;
    }
    
    @Override
    public ByteBuf encode(final SpdyHeadersFrame lllllllllllllIlIllIIIIIlllIlllIl) throws Exception {
        if (lIlIllIlIIlllII(lllllllllllllIlIllIIIIIlllIlllIl)) {
            throw new IllegalArgumentException(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[0]]);
        }
        if (lIlIllIlIIllIll(this.finished ? 1 : 0)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIllIIIIIlllIlllII = super.encode(lllllllllllllIlIllIIIIIlllIlllIl);
        if (lIlIllIlIIlllIl(lllllllllllllIlIllIIIIIlllIlllII.readableBytes())) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIlIllIIIIIlllIllIll = lllllllllllllIlIllIIIIIlllIlllII.alloc().buffer();
        this.setInput(lllllllllllllIlIllIIIIIlllIlllII);
        this.encode(lllllllllllllIlIllIIIIIlllIllIll);
        return lllllllllllllIlIllIIIIIlllIllIll;
    }
    
    private static boolean lIlIllIlIIlllll(final int lllllllllllllIlIllIIIIIllIIllIll, final int lllllllllllllIlIllIIIIIllIIllIlI) {
        return lllllllllllllIlIllIIIIIllIIllIll < lllllllllllllIlIllIIIIIllIIllIlI;
    }
    
    private static boolean lIlIllIlIIllIIl(final int lllllllllllllIlIllIIIIIllIIlIlll, final int lllllllllllllIlIllIIIIIllIIlIllI) {
        return lllllllllllllIlIllIIIIIllIIlIlll > lllllllllllllIlIllIIIIIllIIlIllI;
    }
    
    private static String lIlIllIlIIIllll(final String lllllllllllllIlIllIIIIIllIllllIl, final String lllllllllllllIlIllIIIIIllIllllII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIIIlllIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIIllIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIIIIlllIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIIIIlllIIIIIl.init(SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[4], lllllllllllllIlIllIIIIIlllIIIIlI);
            return new String(lllllllllllllIlIllIIIIIlllIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIIllIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIIIlllIIIIII) {
            lllllllllllllIlIllIIIIIlllIIIIII.printStackTrace();
            return null;
        }
    }
    
    private void encode(final ByteBuf lllllllllllllIlIllIIIIIllllIlIII) {
        try {
            final byte[] lllllllllllllIlIllIIIIIllllIlIll = new byte[(int)Math.ceil(this.z.next_in.length * 1.001) + SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[10]];
            this.z.next_out = lllllllllllllIlIllIIIIIllllIlIll;
            this.z.next_out_index = SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[1];
            this.z.avail_out = lllllllllllllIlIllIIIIIllllIlIll.length;
            final int lllllllllllllIlIllIIIIIllllIlIlI = this.z.deflate(SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[4]);
            if (lIlIllIlIIllIll(lllllllllllllIlIllIIIIIllllIlIlI)) {
                throw new CompressionException(String.valueOf(new StringBuilder().append(SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[11]]).append(lllllllllllllIlIllIIIIIllllIlIlI)));
            }
            if (lIlIllIlIIllIll(this.z.next_out_index)) {
                lllllllllllllIlIllIIIIIllllIlIII.writeBytes(lllllllllllllIlIllIIIIIllllIlIll, SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[1], this.z.next_out_index);
                "".length();
            }
            this.z.next_in = null;
            this.z.next_out = null;
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        finally {
            this.z.next_in = null;
            this.z.next_out = null;
        }
    }
    
    private static void lIlIllIlIIlIIII() {
        (lllllIIIlIllI = new String[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[12]])[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[1]] = lIlIllIlIIIllIl("Ez4XFBEVIgkNDB4dHxIGHGta", "pQzdc");
        SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[2]] = lIlIllIlIIIlllI("4+vi85wK3vajMK+qMVuCkD91DUm3S5S1", "cAPeK");
        SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[4]] = lIlIllIlIIIllIl("JSIBHCQlCQYMOGhr", "RKoxK");
        SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[5]] = lIlIllIlIIIlllI("xGB+vHVGqtBT3t9aeLBr6j60NexkL76j", "XveWu");
        SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[6]] = lIlIllIlIIIllIl("IyoDNAI4KgJCRw==", "NOnxg");
        SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[7]] = lIlIllIlIIIlllI("OYqmcN4kR6cpgAj7ADtp4tPv5MblA8d2", "xGuht");
        SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[8]] = lIlIllIlIIIlllI("bxCAEkEV1De4bs6hugTl4YrQAphXyXqZ4T5CqDwFU7vOXuTeFyEkX74O0yfCSw/U0kvgcmR2ov8=", "yPDFR");
        SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[9]] = lIlIllIlIIIllll("1QOJ7Q3LYt8OYAVvSS4chBNXQ0jBHIFlv6zdBNF25KBmoxWI5A6UAw==", "tqVDV");
        SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[11]] = lIlIllIlIIIllIl("DTsCIxkLJxw6BAB0CTICAiEdNlFO", "nToSk");
        SpdyHeaderBlockJZlibEncoder.lllllIIIlIllI[SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[0]] = lIlIllIlIIIllll("5kamay1xuuk=", "wNVql");
    }
    
    public void end() {
        if (lIlIllIlIIllIll(this.finished ? 1 : 0)) {
            return;
        }
        this.finished = (SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[2] != 0);
        this.z.deflateEnd();
        "".length();
        this.z.next_in = null;
        this.z.next_out = null;
    }
    
    private static String lIlIllIlIIIlllI(final String lllllllllllllIlIllIIIIIlllIIlIlI, final String lllllllllllllIlIllIIIIIlllIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIIIlllIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIIIlllIIlIll.getBytes(StandardCharsets.UTF_8)), SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[11]), "DES");
            final Cipher lllllllllllllIlIllIIIIIlllIIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIllIIIIIlllIIlllI.init(SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[4], lllllllllllllIlIllIIIIIlllIIllll);
            return new String(lllllllllllllIlIllIIIIIlllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIIIlllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIIIlllIIllIl) {
            lllllllllllllIlIllIIIIIlllIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIllIlIIlllII(final Object lllllllllllllIlIllIIIIIllIIlIlII) {
        return lllllllllllllIlIllIIIIIllIIlIlII == null;
    }
    
    private static boolean lIlIllIlIIllIII(final int lllllllllllllIlIllIIIIIllIIIlllI) {
        return lllllllllllllIlIllIIIIIllIIIlllI >= 0;
    }
    
    private void setInput(final ByteBuf lllllllllllllIlIllIIIIIlllllIIlI) {
        final byte[] lllllllllllllIlIllIIIIIlllllIlII = new byte[lllllllllllllIlIllIIIIIlllllIIlI.readableBytes()];
        lllllllllllllIlIllIIIIIlllllIIlI.readBytes(lllllllllllllIlIllIIIIIlllllIlII);
        "".length();
        this.z.next_in = lllllllllllllIlIllIIIIIlllllIlII;
        this.z.next_in_index = SpdyHeaderBlockJZlibEncoder.lllllIIIllIIl[1];
        this.z.avail_in = lllllllllllllIlIllIIIIIlllllIlII.length;
    }
}
