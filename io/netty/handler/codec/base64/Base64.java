// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.base64;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;

public final class Base64
{
    private static final /* synthetic */ String[] lIlllllIllllII;
    private static final /* synthetic */ int[] lIlllllIllllIl;
    
    private static boolean lIIIIlIllIlIIlll(final int llllllllllllIllllIIlIlIlIlIlllII) {
        return llllllllllllIllllIIlIlIlIlIlllII != 0;
    }
    
    static {
        lIIIIlIllIlIIlII();
        lIIIIlIllIlIIIlI();
        MAX_LINE_LENGTH = Base64.lIlllllIllllIl[6];
        NEW_LINE = (byte)Base64.lIlllllIllllIl[7];
        WHITE_SPACE_ENC = (byte)Base64.lIlllllIllllIl[18];
        EQUALS_SIGN = (byte)Base64.lIlllllIllllIl[15];
        EQUALS_SIGN_ENC = (byte)Base64.lIlllllIllllIl[19];
    }
    
    private static boolean lIIIIlIllIlIlIII(final int llllllllllllIllllIIlIlIlIlllIIIl, final int llllllllllllIllllIIlIlIlIllIllll) {
        return llllllllllllIllllIIlIlIlIlllIIIl < llllllllllllIllllIIlIlIlIllIllll;
    }
    
    public static ByteBuf encode(final ByteBuf llllllllllllIllllIIlIllIlIIIllIl, final int llllllllllllIllllIIlIllIlIIIIIIl, final int llllllllllllIllllIIlIllIlIIIIIII, final boolean llllllllllllIllllIIlIllIlIIIlIlI, final Base64Dialect llllllllllllIllllIIlIllIIllllllI) {
        if (lIIIIlIllIlIIlIl(llllllllllllIllllIIlIllIlIIIllIl)) {
            throw new NullPointerException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[4]]);
        }
        if (lIIIIlIllIlIIlIl(llllllllllllIllllIIlIllIIllllllI)) {
            throw new NullPointerException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[5]]);
        }
        final int n;
        final int llllllllllllIllllIIlIllIlIIIlIII = n = llllllllllllIllllIIlIllIlIIIIIII * Base64.lIlllllIllllIl[4] / Base64.lIlllllIllllIl[3];
        int n2;
        if (lIIIIlIllIlIIllI(llllllllllllIllllIIlIllIlIIIIIII % Base64.lIlllllIllllIl[3])) {
            n2 = Base64.lIlllllIllllIl[4];
            "".length();
            if (((0x9C ^ 0xB0 ^ (0xAB ^ 0xBC)) & (0x7B ^ 0x52 ^ (0x9D ^ 0x8F) ^ -" ".length())) >= "  ".length()) {
                return null;
            }
        }
        else {
            n2 = Base64.lIlllllIllllIl[0];
        }
        final int n3 = n + n2;
        int n4;
        if (lIIIIlIllIlIIlll(llllllllllllIllllIIlIllIlIIIlIlI ? 1 : 0)) {
            n4 = llllllllllllIllllIIlIllIlIIIlIII / Base64.lIlllllIllllIl[6];
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        else {
            n4 = Base64.lIlllllIllllIl[0];
        }
        final ByteBuf llllllllllllIllllIIlIllIlIIIIlll = Unpooled.buffer(n3 + n4).order(llllllllllllIllllIIlIllIlIIIllIl.order());
        int llllllllllllIllllIIlIllIlIIIIllI = Base64.lIlllllIllllIl[0];
        int llllllllllllIllllIIlIllIlIIIIlIl = Base64.lIlllllIllllIl[0];
        final int llllllllllllIllllIIlIllIlIIIIlII = llllllllllllIllllIIlIllIlIIIIIII - Base64.lIlllllIllllIl[2];
        int llllllllllllIllllIIlIllIlIIIIIll = Base64.lIlllllIllllIl[0];
        while (lIIIIlIllIlIlIII(llllllllllllIllllIIlIllIlIIIIllI, llllllllllllIllllIIlIllIlIIIIlII)) {
            encode3to4(llllllllllllIllllIIlIllIlIIIllIl, llllllllllllIllllIIlIllIlIIIIllI + llllllllllllIllllIIlIllIlIIIIIIl, Base64.lIlllllIllllIl[3], llllllllllllIllllIIlIllIlIIIIlll, llllllllllllIllllIIlIllIlIIIIlIl, llllllllllllIllllIIlIllIIllllllI);
            llllllllllllIllllIIlIllIlIIIIIll += 4;
            if (lIIIIlIllIlIIlll(llllllllllllIllllIIlIllIlIIIlIlI ? 1 : 0) && lIIIIlIllIlIlIIl(llllllllllllIllllIIlIllIlIIIIIll, Base64.lIlllllIllllIl[6])) {
                llllllllllllIllllIIlIllIlIIIIlll.setByte(llllllllllllIllllIIlIllIlIIIIlIl + Base64.lIlllllIllllIl[4], Base64.lIlllllIllllIl[7]);
                "".length();
                ++llllllllllllIllllIIlIllIlIIIIlIl;
                llllllllllllIllllIIlIllIlIIIIIll = Base64.lIlllllIllllIl[0];
            }
            llllllllllllIllllIIlIllIlIIIIllI += 3;
            llllllllllllIllllIIlIllIlIIIIlIl += 4;
            "".length();
            if (((104 + 130 - 36 + 41 ^ 49 + 127 - 37 + 27) & (168 + 208 - 344 + 213 ^ 19 + 78 - 13 + 104 ^ -" ".length())) < -" ".length()) {
                return null;
            }
        }
        if (lIIIIlIllIlIlIII(llllllllllllIllllIIlIllIlIIIIllI, llllllllllllIllllIIlIllIlIIIIIII)) {
            encode3to4(llllllllllllIllllIIlIllIlIIIllIl, llllllllllllIllllIIlIllIlIIIIllI + llllllllllllIllllIIlIllIlIIIIIIl, llllllllllllIllllIIlIllIlIIIIIII - llllllllllllIllllIIlIllIlIIIIllI, llllllllllllIllllIIlIllIlIIIIlll, llllllllllllIllllIIlIllIlIIIIlIl, llllllllllllIllllIIlIllIIllllllI);
            llllllllllllIllllIIlIllIlIIIIlIl += 4;
        }
        return llllllllllllIllllIIlIllIlIIIIlll.slice(Base64.lIlllllIllllIl[0], llllllllllllIllllIIlIllIlIIIIlIl);
    }
    
    private static boolean lIIIIlIllIlIlIIl(final int llllllllllllIllllIIlIlIllIIIIIll, final int llllllllllllIllllIIlIlIllIIIIIIl) {
        return llllllllllllIllllIIlIlIllIIIIIll == llllllllllllIllllIIlIlIllIIIIIIl;
    }
    
    public static ByteBuf decode(final ByteBuf llllllllllllIllllIIlIllIIlIlIIII, final int llllllllllllIllllIIlIllIIlIIllll, final int llllllllllllIllllIIlIllIIlIIlIll) {
        return decode(llllllllllllIllllIIlIllIIlIlIIII, llllllllllllIllllIIlIllIIlIIllll, llllllllllllIllllIIlIllIIlIIlIll, Base64Dialect.STANDARD);
    }
    
    private static boolean breakLines(final Base64Dialect llllllllllllIllllIIlIllIllIlIllI) {
        if (lIIIIlIllIlIIlIl(llllllllllllIllllIIlIllIllIlIllI)) {
            throw new NullPointerException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[2]]);
        }
        return llllllllllllIllllIIlIllIllIlIllI.breakLinesByDefault;
    }
    
    private static boolean lIIIIlIllIlIlIll(final int llllllllllllIllllIIlIlIlIllllIlI, final int llllllllllllIllllIIlIlIlIllllIII) {
        return llllllllllllIllllIIlIlIlIllllIlI >= llllllllllllIllllIIlIlIlIllllIII;
    }
    
    public static ByteBuf encode(final ByteBuf llllllllllllIllllIIlIllIllIIllll, final Base64Dialect llllllllllllIllllIIlIllIllIIllII) {
        return encode(llllllllllllIllllIIlIllIllIIllll, breakLines(llllllllllllIllllIIlIllIllIIllII), llllllllllllIllllIIlIllIllIIllII);
    }
    
    public static ByteBuf decode(final ByteBuf llllllllllllIllllIIlIllIIlIllIIl, final Base64Dialect llllllllllllIllllIIlIllIIlIlIlIl) {
        if (lIIIIlIllIlIIlIl(llllllllllllIllllIIlIllIIlIllIIl)) {
            throw new NullPointerException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[14]]);
        }
        final ByteBuf llllllllllllIllllIIlIllIIlIlIlll = decode(llllllllllllIllllIIlIllIIlIllIIl, llllllllllllIllllIIlIllIIlIllIIl.readerIndex(), llllllllllllIllllIIlIllIIlIllIIl.readableBytes(), llllllllllllIllllIIlIllIIlIlIlIl);
        llllllllllllIllllIIlIllIIlIllIIl.readerIndex(llllllllllllIllllIIlIllIIlIllIIl.writerIndex());
        "".length();
        return llllllllllllIllllIIlIllIIlIlIlll;
    }
    
    private Base64() {
    }
    
    public static ByteBuf encode(final ByteBuf llllllllllllIllllIIlIllIlIIlllII, final int llllllllllllIllllIIlIllIlIIllIll, final int llllllllllllIllllIIlIllIlIIllllI, final boolean llllllllllllIllllIIlIllIlIIlllIl) {
        return encode(llllllllllllIllllIIlIllIlIIlllII, llllllllllllIllllIIlIllIlIIllIll, llllllllllllIllllIIlIllIlIIllllI, llllllllllllIllllIIlIllIlIIlllIl, Base64Dialect.STANDARD);
    }
    
    private static void encode3to4(final ByteBuf llllllllllllIllllIIlIllIIllIllll, final int llllllllllllIllllIIlIllIIllIlllI, final int llllllllllllIllllIIlIllIIllIllIl, final ByteBuf llllllllllllIllllIIlIllIIllIllII, final int llllllllllllIllllIIlIllIIllIIIll, final Base64Dialect llllllllllllIllllIIlIllIIllIlIlI) {
        final byte[] llllllllllllIllllIIlIllIIllIlIIl = alphabet(llllllllllllIllllIIlIllIIllIlIlI);
        int n;
        if (lIIIIlIllIlIIllI(llllllllllllIllllIIlIllIIllIllIl)) {
            n = llllllllllllIllllIIlIllIIllIllll.getByte(llllllllllllIllllIIlIllIIllIlllI) << Base64.lIlllllIllllIl[8] >>> Base64.lIlllllIllllIl[9];
            "".length();
            if (((0x42 ^ 0x77) & ~(0x18 ^ 0x2D)) > 0) {
                return;
            }
        }
        else {
            n = Base64.lIlllllIllllIl[0];
        }
        int n2;
        if (lIIIIlIllIlIlIlI(llllllllllllIllllIIlIllIIllIllIl, Base64.lIlllllIllllIl[1])) {
            n2 = llllllllllllIllllIIlIllIIllIllll.getByte(llllllllllllIllllIIlIllIIllIlllI + Base64.lIlllllIllllIl[1]) << Base64.lIlllllIllllIl[8] >>> Base64.lIlllllIllllIl[10];
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            n2 = Base64.lIlllllIllllIl[0];
        }
        final int n3 = n | n2;
        int n4;
        if (lIIIIlIllIlIlIlI(llllllllllllIllllIIlIllIIllIllIl, Base64.lIlllllIllllIl[2])) {
            n4 = llllllllllllIllllIIlIllIIllIllll.getByte(llllllllllllIllllIIlIllIIllIlllI + Base64.lIlllllIllllIl[2]) << Base64.lIlllllIllllIl[8] >>> Base64.lIlllllIllllIl[8];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n4 = Base64.lIlllllIllllIl[0];
        }
        final int llllllllllllIllllIIlIllIIllIlIII = n3 | n4;
        switch (llllllllllllIllllIIlIllIIllIllIl) {
            case 3: {
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll, llllllllllllIllllIIlIllIIllIlIIl[llllllllllllIllllIIlIllIIllIlIII >>> Base64.lIlllllIllllIl[11]]);
                "".length();
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll + Base64.lIlllllIllllIl[1], llllllllllllIllllIIlIllIIllIlIIl[llllllllllllIllllIIlIllIIllIlIII >>> Base64.lIlllllIllllIl[12] & Base64.lIlllllIllllIl[13]]);
                "".length();
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll + Base64.lIlllllIllllIl[2], llllllllllllIllllIIlIllIIllIlIIl[llllllllllllIllllIIlIllIIllIlIII >>> Base64.lIlllllIllllIl[14] & Base64.lIlllllIllllIl[13]]);
                "".length();
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll + Base64.lIlllllIllllIl[3], llllllllllllIllllIIlIllIIllIlIIl[llllllllllllIllllIIlIllIIllIlIII & Base64.lIlllllIllllIl[13]]);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 2: {
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll, llllllllllllIllllIIlIllIIllIlIIl[llllllllllllIllllIIlIllIIllIlIII >>> Base64.lIlllllIllllIl[11]]);
                "".length();
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll + Base64.lIlllllIllllIl[1], llllllllllllIllllIIlIllIIllIlIIl[llllllllllllIllllIIlIllIIllIlIII >>> Base64.lIlllllIllllIl[12] & Base64.lIlllllIllllIl[13]]);
                "".length();
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll + Base64.lIlllllIllllIl[2], llllllllllllIllllIIlIllIIllIlIIl[llllllllllllIllllIIlIllIIllIlIII >>> Base64.lIlllllIllllIl[14] & Base64.lIlllllIllllIl[13]]);
                "".length();
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll + Base64.lIlllllIllllIl[3], Base64.lIlllllIllllIl[15]);
                "".length();
                "".length();
                if ("   ".length() == " ".length()) {
                    return;
                }
                break;
            }
            case 1: {
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll, llllllllllllIllllIIlIllIIllIlIIl[llllllllllllIllllIIlIllIIllIlIII >>> Base64.lIlllllIllllIl[11]]);
                "".length();
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll + Base64.lIlllllIllllIl[1], llllllllllllIllllIIlIllIIllIlIIl[llllllllllllIllllIIlIllIIllIlIII >>> Base64.lIlllllIllllIl[12] & Base64.lIlllllIllllIl[13]]);
                "".length();
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll + Base64.lIlllllIllllIl[2], Base64.lIlllllIllllIl[15]);
                "".length();
                llllllllllllIllllIIlIllIIllIllII.setByte(llllllllllllIllllIIlIllIIllIIIll + Base64.lIlllllIllllIl[3], Base64.lIlllllIllllIl[15]);
                "".length();
                break;
            }
        }
    }
    
    public static ByteBuf encode(final ByteBuf llllllllllllIllllIIlIllIllIlIIlI) {
        return encode(llllllllllllIllllIIlIllIllIlIIlI, Base64Dialect.STANDARD);
    }
    
    public static ByteBuf decode(final ByteBuf llllllllllllIllllIIlIllIIlIlllIl) {
        return decode(llllllllllllIllllIIlIllIIlIlllIl, Base64Dialect.STANDARD);
    }
    
    private static boolean lIIIIlIllIlIIlIl(final Object llllllllllllIllllIIlIlIlIllIIIIl) {
        return llllllllllllIllllIIlIlIlIllIIIIl == null;
    }
    
    private static String lIIIIlIllIIlllll(final String llllllllllllIllllIIlIlIllllIIlII, final String llllllllllllIllllIIlIlIlllIlllll) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIlIllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIlIlllIlllll.getBytes(StandardCharsets.UTF_8)), Base64.lIlllllIllllIl[9]), "DES");
            final Cipher llllllllllllIllllIIlIlIllllIlIII = Cipher.getInstance("DES");
            llllllllllllIllllIIlIlIllllIlIII.init(Base64.lIlllllIllllIl[2], llllllllllllIllllIIlIlIllllIlIlI);
            return new String(llllllllllllIllllIIlIlIllllIlIII.doFinal(java.util.Base64.getDecoder().decode(llllllllllllIllllIIlIlIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIlIllllIIllI) {
            llllllllllllIllllIIlIlIllllIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIllIlIIllI(final int llllllllllllIllllIIlIlIlIlIlIlll) {
        return llllllllllllIllllIIlIlIlIlIlIlll > 0;
    }
    
    public static ByteBuf encode(final ByteBuf llllllllllllIllllIIlIllIlIlIlIII, final int llllllllllllIllllIIlIllIlIlIIlll, final int llllllllllllIllllIIlIllIlIlIlIlI, final Base64Dialect llllllllllllIllllIIlIllIlIlIlIIl) {
        return encode(llllllllllllIllllIIlIllIlIlIlIII, llllllllllllIllllIIlIllIlIlIIlll, llllllllllllIllllIIlIllIlIlIlIlI, breakLines(llllllllllllIllllIIlIllIlIlIlIIl), llllllllllllIllllIIlIllIlIlIlIIl);
    }
    
    private static void lIIIIlIllIlIIlII() {
        (lIlllllIllllIl = new int[24])[0] = ((75 + 145 - 179 + 120 ^ 29 + 10 + 52 + 53) & (187 + 164 - 294 + 190 ^ 71 + 21 - 83 + 189 ^ -" ".length()));
        Base64.lIlllllIllllIl[1] = " ".length();
        Base64.lIlllllIllllIl[2] = "  ".length();
        Base64.lIlllllIllllIl[3] = "   ".length();
        Base64.lIlllllIllllIl[4] = (0x77 ^ 0x73);
        Base64.lIlllllIllllIl[5] = (0xA4 ^ 0xA1);
        Base64.lIlllllIllllIl[6] = (0x4D ^ 0x53 ^ (0x46 ^ 0x14));
        Base64.lIlllllIllllIl[7] = (50 + 142 - 56 + 29 ^ 38 + 166 - 99 + 70);
        Base64.lIlllllIllllIl[8] = (117 + 36 - 117 + 107 ^ 141 + 135 - 231 + 106);
        Base64.lIlllllIllllIl[9] = (0xAF ^ 0xA7);
        Base64.lIlllllIllllIl[10] = (0x53 ^ 0x28 ^ (0x9 ^ 0x62));
        Base64.lIlllllIllllIl[11] = (0x19 ^ 0xB);
        Base64.lIlllllIllllIl[12] = (0x13 ^ 0xD ^ (0x50 ^ 0x42));
        Base64.lIlllllIllllIl[13] = (65 + 135 - 183 + 168 ^ 96 + 111 - 82 + 9);
        Base64.lIlllllIllllIl[14] = (0x6 ^ 0x0);
        Base64.lIlllllIllllIl[15] = (0x40 ^ 0x49 ^ (0x7C ^ 0x48));
        Base64.lIlllllIllllIl[16] = (0x6 ^ 0x1);
        Base64.lIlllllIllllIl[17] = (0x0 ^ 0x50) + (0xA3 ^ 0xA6) - -(0x9C ^ 0xBE) + (0xA1 ^ 0xA9);
        Base64.lIlllllIllllIl[18] = -(0x7D ^ 0x78);
        Base64.lIlllllIllllIl[19] = -" ".length();
        Base64.lIlllllIllllIl[20] = (0x11 ^ 0x18);
        Base64.lIlllllIllllIl[21] = (0x8 ^ 0x3);
        Base64.lIlllllIllllIl[22] = (0xF9 ^ 0xAF) + (0x3D ^ 0x57) - (0xD3 ^ 0x9E) + (122 + 35 - 137 + 120);
        Base64.lIlllllIllllIl[23] = (18 + 162 - 23 + 15 ^ 23 + 66 - 35 + 107);
    }
    
    private static String lIIIIlIllIlIIIIl(String llllllllllllIllllIIlIlIllIlllIII, final String llllllllllllIllllIIlIlIlllIIIIII) {
        llllllllllllIllllIIlIlIllIlllIII = (char)new String(java.util.Base64.getDecoder().decode(((String)llllllllllllIllllIIlIlIllIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIlIlIllIlllllI = new StringBuilder();
        final char[] llllllllllllIllllIIlIlIllIllllII = llllllllllllIllllIIlIlIlllIIIIII.toCharArray();
        int llllllllllllIllllIIlIlIllIlllIlI = Base64.lIlllllIllllIl[0];
        final float llllllllllllIllllIIlIlIllIlIlllI = (Object)((String)llllllllllllIllllIIlIlIllIlllIII).toCharArray();
        final Exception llllllllllllIllllIIlIlIllIlIllIl = (Exception)llllllllllllIllllIIlIlIllIlIlllI.length;
        float llllllllllllIllllIIlIlIllIlIllII = Base64.lIlllllIllllIl[0];
        while (lIIIIlIllIlIlIII((int)llllllllllllIllllIIlIlIllIlIllII, (int)llllllllllllIllllIIlIlIllIlIllIl)) {
            final char llllllllllllIllllIIlIlIlllIIIlII = llllllllllllIllllIIlIlIllIlIlllI[llllllllllllIllllIIlIlIllIlIllII];
            llllllllllllIllllIIlIlIllIlllllI.append((char)(llllllllllllIllllIIlIlIlllIIIlII ^ llllllllllllIllllIIlIlIllIllllII[llllllllllllIllllIIlIlIllIlllIlI % llllllllllllIllllIIlIlIllIllllII.length]));
            "".length();
            ++llllllllllllIllllIIlIlIllIlllIlI;
            ++llllllllllllIllllIIlIlIllIlIllII;
            "".length();
            if ("   ".length() < "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIlIlIllIlllllI);
    }
    
    public static ByteBuf encode(final ByteBuf llllllllllllIllllIIlIllIlIllIllI, final int llllllllllllIllllIIlIllIlIllIlIl, final int llllllllllllIllllIIlIllIlIllIIIl) {
        return encode(llllllllllllIllllIIlIllIlIllIllI, llllllllllllIllllIIlIllIlIllIlIl, llllllllllllIllllIIlIllIlIllIIIl, Base64Dialect.STANDARD);
    }
    
    private static boolean lIIIIlIllIlIlIlI(final int llllllllllllIllllIIlIlIlIllIlIII, final int llllllllllllIllllIIlIlIlIllIIllI) {
        return llllllllllllIllllIIlIlIlIllIlIII > llllllllllllIllllIIlIlIlIllIIllI;
    }
    
    public static ByteBuf encode(final ByteBuf llllllllllllIllllIIlIllIllIIIlll, final boolean llllllllllllIllllIIlIllIllIIIllI) {
        return encode(llllllllllllIllllIIlIllIllIIIlll, llllllllllllIllllIIlIllIllIIIllI, Base64Dialect.STANDARD);
    }
    
    public static ByteBuf encode(final ByteBuf llllllllllllIllllIIlIllIlIllllIl, final boolean llllllllllllIllllIIlIllIllIIIIII, final Base64Dialect llllllllllllIllllIIlIllIlIllllll) {
        if (lIIIIlIllIlIIlIl(llllllllllllIllllIIlIllIlIllllIl)) {
            throw new NullPointerException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[3]]);
        }
        final ByteBuf llllllllllllIllllIIlIllIlIlllllI = encode(llllllllllllIllllIIlIllIlIllllIl, llllllllllllIllllIIlIllIlIllllIl.readerIndex(), llllllllllllIllllIIlIllIlIllllIl.readableBytes(), llllllllllllIllllIIlIllIllIIIIII, llllllllllllIllllIIlIllIlIllllll);
        llllllllllllIllllIIlIllIlIllllIl.readerIndex(llllllllllllIllllIIlIllIlIllllIl.writerIndex());
        "".length();
        return llllllllllllIllllIIlIllIlIlllllI;
    }
    
    private static void lIIIIlIllIlIIIlI() {
        (lIlllllIllllII = new String[Base64.lIlllllIllllIl[23]])[Base64.lIlllllIllllIl[0]] = lIIIIlIllIIlllll("qImuEnM3GJE=", "LATWf");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[1]] = lIIIIlIllIlIIIII("GmeGCwv53cs=", "iPTXM");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[2]] = lIIIIlIllIlIIIII("L9qUt2/a8KQ=", "juhvn");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[3]] = lIIIIlIllIlIIIIl("PTcl", "NEFqr");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[4]] = lIIIIlIllIlIIIII("eIETpTPaGfk=", "IVHbZ");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[5]] = lIIIIlIllIIlllll("AJMFT7Re3Kk=", "OgGOM");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[14]] = lIIIIlIllIlIIIII("oWA0dpnMPcY=", "yFtAJ");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[16]] = lIIIIlIllIlIIIII("8Yt0ltDdcng=", "dOzOT");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[9]] = lIIIIlIllIIlllll("u/pRFQEzrkg=", "egqYH");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[20]] = lIIIIlIllIlIIIII("XaV4tICON1FERr9vInR08fFBfBHJ1rzr/P7lBZaG+xE=", "ZiNmS");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[7]] = lIIIIlIllIlIIIIl("dmc=", "LGcNT");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[21]] = lIIIIlIllIlIIIIl("bmUQDSInIBUEaA==", "NMthA");
        Base64.lIlllllIllllII[Base64.lIlllllIllllIl[12]] = lIIIIlIllIlIIIII("KRyBbtbJyPr5ud0uS2EPVljCK00vOEwq", "ZVNkN");
    }
    
    private static int decode4to3(final byte[] llllllllllllIllllIIlIllIIIIIlllI, final int llllllllllllIllllIIlIllIIIIIllIl, final ByteBuf llllllllllllIllllIIlIllIIIIlIIlI, final int llllllllllllIllllIIlIllIIIIlIIIl, final Base64Dialect llllllllllllIllllIIlIllIIIIlIIII) {
        final byte[] llllllllllllIllllIIlIllIIIIIllll = decodabet(llllllllllllIllllIIlIllIIIIlIIII);
        if (lIIIIlIllIlIlIIl(llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl + Base64.lIlllllIllllIl[2]], Base64.lIlllllIllllIl[15])) {
            final int llllllllllllIllllIIlIllIIIIllIII = (llllllllllllIllllIIlIllIIIIIllll[llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl]] & Base64.lIlllllIllllIl[22]) << Base64.lIlllllIllllIl[11] | (llllllllllllIllllIIlIllIIIIIllll[llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl + Base64.lIlllllIllllIl[1]]] & Base64.lIlllllIllllIl[22]) << Base64.lIlllllIllllIl[12];
            llllllllllllIllllIIlIllIIIIlIIlI.setByte(llllllllllllIllllIIlIllIIIIlIIIl, (byte)(llllllllllllIllllIIlIllIIIIllIII >>> Base64.lIlllllIllllIl[10]));
            "".length();
            return Base64.lIlllllIllllIl[1];
        }
        if (lIIIIlIllIlIlIIl(llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl + Base64.lIlllllIllllIl[3]], Base64.lIlllllIllllIl[15])) {
            final int llllllllllllIllllIIlIllIIIIlIlll = (llllllllllllIllllIIlIllIIIIIllll[llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl]] & Base64.lIlllllIllllIl[22]) << Base64.lIlllllIllllIl[11] | (llllllllllllIllllIIlIllIIIIIllll[llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl + Base64.lIlllllIllllIl[1]]] & Base64.lIlllllIllllIl[22]) << Base64.lIlllllIllllIl[12] | (llllllllllllIllllIIlIllIIIIIllll[llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl + Base64.lIlllllIllllIl[2]]] & Base64.lIlllllIllllIl[22]) << Base64.lIlllllIllllIl[14];
            llllllllllllIllllIIlIllIIIIlIIlI.setByte(llllllllllllIllllIIlIllIIIIlIIIl, (byte)(llllllllllllIllllIIlIllIIIIlIlll >>> Base64.lIlllllIllllIl[10]));
            "".length();
            llllllllllllIllllIIlIllIIIIlIIlI.setByte(llllllllllllIllllIIlIllIIIIlIIIl + Base64.lIlllllIllllIl[1], (byte)(llllllllllllIllllIIlIllIIIIlIlll >>> Base64.lIlllllIllllIl[9]));
            "".length();
            return Base64.lIlllllIllllIl[2];
        }
        int llllllllllllIllllIIlIllIIIIlIlIl;
        try {
            llllllllllllIllllIIlIllIIIIlIlIl = ((llllllllllllIllllIIlIllIIIIIllll[llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl]] & Base64.lIlllllIllllIl[22]) << Base64.lIlllllIllllIl[11] | (llllllllllllIllllIIlIllIIIIIllll[llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl + Base64.lIlllllIllllIl[1]]] & Base64.lIlllllIllllIl[22]) << Base64.lIlllllIllllIl[12] | (llllllllllllIllllIIlIllIIIIIllll[llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl + Base64.lIlllllIllllIl[2]]] & Base64.lIlllllIllllIl[22]) << Base64.lIlllllIllllIl[14] | (llllllllllllIllllIIlIllIIIIIllll[llllllllllllIllllIIlIllIIIIIlllI[llllllllllllIllllIIlIllIIIIIllIl + Base64.lIlllllIllllIl[3]]] & Base64.lIlllllIllllIl[22]));
            "".length();
            if (" ".length() >= (135 + 89 - 177 + 102 ^ 40 + 38 - 36 + 103)) {
                return (0x21 ^ 0x27 ^ (0x5F ^ 0xE)) & (186 + 155 - 142 + 47 ^ 66 + 110 - 114 + 99 ^ -" ".length());
            }
        }
        catch (IndexOutOfBoundsException llllllllllllIllllIIlIllIIIIlIllI) {
            throw new IllegalArgumentException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[12]]);
        }
        llllllllllllIllllIIlIllIIIIlIIlI.setByte(llllllllllllIllllIIlIllIIIIlIIIl, (byte)(llllllllllllIllllIIlIllIIIIlIlIl >> Base64.lIlllllIllllIl[10]));
        "".length();
        llllllllllllIllllIIlIllIIIIlIIlI.setByte(llllllllllllIllllIIlIllIIIIlIIIl + Base64.lIlllllIllllIl[1], (byte)(llllllllllllIllllIIlIllIIIIlIlIl >> Base64.lIlllllIllllIl[9]));
        "".length();
        llllllllllllIllllIIlIllIIIIlIIlI.setByte(llllllllllllIllllIIlIllIIIIlIIIl + Base64.lIlllllIllllIl[2], (byte)llllllllllllIllllIIlIllIIIIlIlIl);
        "".length();
        return Base64.lIlllllIllllIl[3];
    }
    
    public static ByteBuf decode(final ByteBuf llllllllllllIllllIIlIllIIIlIllIl, final int llllllllllllIllllIIlIllIIIlllIlI, final int llllllllllllIllllIIlIllIIIlIlIll, final Base64Dialect llllllllllllIllllIIlIllIIIlIlIlI) {
        if (lIIIIlIllIlIIlIl(llllllllllllIllllIIlIllIIIlIllIl)) {
            throw new NullPointerException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[16]]);
        }
        if (lIIIIlIllIlIIlIl(llllllllllllIllllIIlIllIIIlIlIlI)) {
            throw new NullPointerException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[9]]);
        }
        final byte[] llllllllllllIllllIIlIllIIIllIllI = decodabet(llllllllllllIllllIIlIllIIIlIlIlI);
        final int llllllllllllIllllIIlIllIIIllIlIl = llllllllllllIllllIIlIllIIIlIlIll * Base64.lIlllllIllllIl[3] / Base64.lIlllllIllllIl[4];
        final ByteBuf llllllllllllIllllIIlIllIIIllIlII = llllllllllllIllllIIlIllIIIlIllIl.alloc().buffer(llllllllllllIllllIIlIllIIIllIlIl).order(llllllllllllIllllIIlIllIIIlIllIl.order());
        int llllllllllllIllllIIlIllIIIllIIlI = Base64.lIlllllIllllIl[0];
        final byte[] llllllllllllIllllIIlIllIIIllIIIl = new byte[Base64.lIlllllIllllIl[4]];
        int llllllllllllIllllIIlIllIIIllIIII = Base64.lIlllllIllllIl[0];
        int llllllllllllIllllIIlIllIIIlIlllI = llllllllllllIllllIIlIllIIIlllIlI;
        while (lIIIIlIllIlIlIII(llllllllllllIllllIIlIllIIIlIlllI, llllllllllllIllllIIlIllIIIlllIlI + llllllllllllIllllIIlIllIIIlIlIll)) {
            final byte llllllllllllIllllIIlIllIIIllllIl = (byte)(llllllllllllIllllIIlIllIIIlIllIl.getByte(llllllllllllIllllIIlIllIIIlIlllI) & Base64.lIlllllIllllIl[17]);
            final byte llllllllllllIllllIIlIllIIIllllII = llllllllllllIllllIIlIllIIIllIllI[llllllllllllIllllIIlIllIIIllllIl];
            if (!lIIIIlIllIlIlIll(llllllllllllIllllIIlIllIIIllllII, Base64.lIlllllIllllIl[18])) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[20]]).append(llllllllllllIllllIIlIllIIIlIlllI).append(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[7]]).append(llllllllllllIllllIIlIllIIIlIllIl.getUnsignedByte(llllllllllllIllllIIlIllIIIlIlllI)).append(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[21]])));
            }
            if (lIIIIlIllIlIlIll(llllllllllllIllllIIlIllIIIllllII, Base64.lIlllllIllllIl[19])) {
                llllllllllllIllllIIlIllIIIllIIIl[llllllllllllIllllIIlIllIIIllIIII++] = llllllllllllIllllIIlIllIIIllllIl;
                if (lIIIIlIllIlIlIlI(llllllllllllIllllIIlIllIIIllIIII, Base64.lIlllllIllllIl[3])) {
                    llllllllllllIllllIIlIllIIIllIIlI += decode4to3(llllllllllllIllllIIlIllIIIllIIIl, Base64.lIlllllIllllIl[0], llllllllllllIllllIIlIllIIIllIlII, llllllllllllIllllIIlIllIIIllIIlI, llllllllllllIllllIIlIllIIIlIlIlI);
                    llllllllllllIllllIIlIllIIIllIIII = Base64.lIlllllIllllIl[0];
                    if (lIIIIlIllIlIlIIl(llllllllllllIllllIIlIllIIIllllIl, Base64.lIlllllIllllIl[15])) {
                        "".length();
                        if (((0x5B ^ 0x7D) & ~(0xE5 ^ 0xC3)) >= " ".length()) {
                            return null;
                        }
                        break;
                    }
                }
            }
            ++llllllllllllIllllIIlIllIIIlIlllI;
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        return llllllllllllIllllIIlIllIIIllIlII.slice(Base64.lIlllllIllllIl[0], llllllllllllIllllIIlIllIIIllIIlI);
    }
    
    private static byte[] alphabet(final Base64Dialect llllllllllllIllllIIlIllIllIllIll) {
        if (lIIIIlIllIlIIlIl(llllllllllllIllllIIlIllIllIllIll)) {
            throw new NullPointerException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[0]]);
        }
        return llllllllllllIllllIIlIllIllIllIll.alphabet;
    }
    
    private static byte[] decodabet(final Base64Dialect llllllllllllIllllIIlIllIllIllIII) {
        if (lIIIIlIllIlIIlIl(llllllllllllIllllIIlIllIllIllIII)) {
            throw new NullPointerException(Base64.lIlllllIllllII[Base64.lIlllllIllllIl[1]]);
        }
        return llllllllllllIllllIIlIllIllIllIII.decodabet;
    }
    
    private static String lIIIIlIllIlIIIII(final String llllllllllllIllllIIlIlIllIIlIllI, final String llllllllllllIllllIIlIlIllIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIlIllIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIlIllIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlIlIllIIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlIlIllIIlllIl.init(Base64.lIlllllIllllIl[2], llllllllllllIllllIIlIlIllIIlllll);
            return new String(llllllllllllIllllIIlIlIllIIlllIl.doFinal(java.util.Base64.getDecoder().decode(llllllllllllIllllIIlIlIllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIlIllIIllIll) {
            llllllllllllIllllIIlIlIllIIllIll.printStackTrace();
            return null;
        }
    }
}
