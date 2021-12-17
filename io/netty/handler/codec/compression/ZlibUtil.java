// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.compression;

import com.jcraft.jzlib.JZlib;
import com.jcraft.jzlib.Deflater;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.jcraft.jzlib.Inflater;

final class ZlibUtil
{
    private static final /* synthetic */ String[] lIIIlllllIIIII;
    private static final /* synthetic */ int[] lIIIlllllIIIIl;
    
    static void fail(final Inflater lllllllllllllIIllllIIlIlIIllIIlI, final String lllllllllllllIIllllIIlIlIIllIIIl, final int lllllllllllllIIllllIIlIlIIllIIII) {
        throw inflaterException(lllllllllllllIIllllIIlIlIIllIIlI, lllllllllllllIIllllIIlIlIIllIIIl, lllllllllllllIIllllIIlIlIIllIIII);
    }
    
    private static boolean llIIlIIIIIllIll(final int lllllllllllllIIllllIIlIIllIllIll, final int lllllllllllllIIllllIIlIIllIllIlI) {
        return lllllllllllllIIllllIIlIIllIllIll < lllllllllllllIIllllIIlIIllIllIlI;
    }
    
    private static void llIIlIIIIIllIIl() {
        (lIIIlllllIIIIl = new int[9])[0] = ((92 + 96 - 159 + 118 ^ 112 + 141 - 131 + 60) & (0x6B ^ 0x35 ^ (0xF8 ^ 0x83) ^ -" ".length()));
        ZlibUtil.lIIIlllllIIIIl[1] = (0x65 ^ 0x4C);
        ZlibUtil.lIIIlllllIIIIl[2] = " ".length();
        ZlibUtil.lIIIlllllIIIIl[3] = "  ".length();
        ZlibUtil.lIIIlllllIIIIl[4] = "   ".length();
        ZlibUtil.lIIIlllllIIIIl[5] = (0x72 ^ 0x76);
        ZlibUtil.lIIIlllllIIIIl[6] = (0x21 ^ 0x24);
        ZlibUtil.lIIIlllllIIIIl[7] = (0xD ^ 0x7);
        ZlibUtil.lIIIlllllIIIIl[8] = (54 + 136 - 93 + 58 ^ 149 + 67 - 188 + 129);
    }
    
    private static void llIIlIIIIIllIII() {
        (lIIIlllllIIIII = new String[ZlibUtil.lIIIlllllIIIIl[8]])[ZlibUtil.lIIIlllllIIIIl[0]] = llIIlIIIIIlIlIl("Q4FDmIMGLM8=", "zEDGe");
        ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[2]] = llIIlIIIIIlIlIl("uBRNlhFkTYQ=", "LDmtO");
        ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[3]] = llIIlIIIIIlIlIl("4DLTi4fxXCE=", "ZQgIy");
        ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[4]] = llIIlIIIIIlIlIl("LyTn+cVt03c=", "TkQPc");
        ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[5]] = llIIlIIIIIlIlIl("+r8bvodteSY=", "mlSMg");
        ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[6]] = llIIlIIIIIlIlll("", "YZRcn");
    }
    
    static DecompressionException inflaterException(final Inflater lllllllllllllIIllllIIlIlIIlIIIII, final String lllllllllllllIIllllIIlIlIIIlllll, final int lllllllllllllIIllllIIlIlIIIllIll) {
        final StringBuilder append = new StringBuilder().append(lllllllllllllIIllllIIlIlIIIlllll).append(ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[0]]).append(lllllllllllllIIllllIIlIlIIIllIll).append((char)ZlibUtil.lIIIlllllIIIIl[1]);
        String value;
        if (llIIlIIIIIllIlI(lllllllllllllIIllllIIlIlIIlIIIII.msg)) {
            value = String.valueOf(new StringBuilder().append(ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[2]]).append(lllllllllllllIIllllIIlIlIIlIIIII.msg));
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        else {
            value = ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[3]];
        }
        return new DecompressionException(String.valueOf(append.append(value)));
    }
    
    private static String llIIlIIIIIlIlIl(final String lllllllllllllIIllllIIlIIlllllIll, final String lllllllllllllIIllllIIlIIlllllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIlIIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIlIIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIlIIllllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIlIIllllllIl.init(ZlibUtil.lIIIlllllIIIIl[3], lllllllllllllIIllllIIlIIlllllllI);
            return new String(lllllllllllllIIllllIIlIIllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIlIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIlIIllllllII) {
            lllllllllllllIIllllIIlIIllllllII.printStackTrace();
            return null;
        }
    }
    
    static void fail(final Deflater lllllllllllllIIllllIIlIlIIlIIllI, final String lllllllllllllIIllllIIlIlIIlIIlIl, final int lllllllllllllIIllllIIlIlIIlIIlII) {
        throw deflaterException(lllllllllllllIIllllIIlIlIIlIIllI, lllllllllllllIIllllIIlIlIIlIIlIl, lllllllllllllIIllllIIlIlIIlIIlII);
    }
    
    private static boolean llIIlIIIIIllIlI(final Object lllllllllllllIIllllIIlIIllIllIII) {
        return lllllllllllllIIllllIIlIIllIllIII != null;
    }
    
    private static String llIIlIIIIIlIlll(String lllllllllllllIIllllIIlIIlllIIllI, final String lllllllllllllIIllllIIlIIlllIIlIl) {
        lllllllllllllIIllllIIlIIlllIIllI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIIlIIlllIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIIlIIlllIlIIl = new StringBuilder();
        final char[] lllllllllllllIIllllIIlIIlllIlIII = lllllllllllllIIllllIIlIIlllIIlIl.toCharArray();
        int lllllllllllllIIllllIIlIIlllIIlll = ZlibUtil.lIIIlllllIIIIl[0];
        final float lllllllllllllIIllllIIlIIlllIIIIl = (Object)((String)lllllllllllllIIllllIIlIIlllIIllI).toCharArray();
        final boolean lllllllllllllIIllllIIlIIlllIIIII = lllllllllllllIIllllIIlIIlllIIIIl.length != 0;
        int lllllllllllllIIllllIIlIIllIlllll = ZlibUtil.lIIIlllllIIIIl[0];
        while (llIIlIIIIIllIll(lllllllllllllIIllllIIlIIllIlllll, lllllllllllllIIllllIIlIIlllIIIII ? 1 : 0)) {
            final char lllllllllllllIIllllIIlIIlllIllII = lllllllllllllIIllllIIlIIlllIIIIl[lllllllllllllIIllllIIlIIllIlllll];
            lllllllllllllIIllllIIlIIlllIlIIl.append((char)(lllllllllllllIIllllIIlIIlllIllII ^ lllllllllllllIIllllIIlIIlllIlIII[lllllllllllllIIllllIIlIIlllIIlll % lllllllllllllIIllllIIlIIlllIlIII.length]));
            "".length();
            ++lllllllllllllIIllllIIlIIlllIIlll;
            ++lllllllllllllIIllllIIlIIllIlllll;
            "".length();
            if (((0x45 ^ 0x40) & ~(0x5D ^ 0x58)) != ((0x53 ^ 0x7) & ~(0x34 ^ 0x60))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIIlIIlllIlIIl);
    }
    
    static int wrapperOverhead(final ZlibWrapper lllllllllllllIIllllIIlIlIIIIIlll) {
        int lllllllllllllIIllllIIlIlIIIIlIII = 0;
        switch (ZlibUtil$1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper[lllllllllllllIIllllIIlIlIIIIIlll.ordinal()]) {
            case 1: {
                lllllllllllllIIllllIIlIlIIIIlIII = ZlibUtil.lIIIlllllIIIIl[0];
                "".length();
                if (" ".length() > (0x3 ^ 0x7)) {
                    return (0xAE ^ 0xA4) & ~(0x15 ^ 0x1F);
                }
                break;
            }
            case 2:
            case 4: {
                lllllllllllllIIllllIIlIlIIIIlIII = ZlibUtil.lIIIlllllIIIIl[3];
                "".length();
                if (" ".length() > "   ".length()) {
                    return (151 + 162 - 202 + 87 ^ 51 + 58 + 11 + 32) & (0x53 ^ 0x71 ^ (0x3A ^ 0x46) ^ -" ".length());
                }
                break;
            }
            case 3: {
                lllllllllllllIIllllIIlIlIIIIlIII = ZlibUtil.lIIIlllllIIIIl[7];
                "".length();
                if (((0x52 ^ 0xF ^ (0x1 ^ 0x50)) & (105 + 114 - 84 + 17 ^ 128 + 109 - 169 + 80 ^ -" ".length())) != 0x0) {
                    return (129 + 96 - 51 + 31 ^ 147 + 117 - 143 + 28) & (0x2 ^ 0x34 ^ (0x65 ^ 0xB) ^ -" ".length());
                }
                break;
            }
            default: {
                throw new Error();
            }
        }
        return lllllllllllllIIllllIIlIlIIIIlIII;
    }
    
    private ZlibUtil() {
    }
    
    static JZlib.WrapperType convertWrapperType(final ZlibWrapper lllllllllllllIIllllIIlIlIIIIllIl) {
        JZlib.WrapperType lllllllllllllIIllllIIlIlIIIIlllI = null;
        switch (ZlibUtil$1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper[lllllllllllllIIllllIIlIlIIIIllIl.ordinal()]) {
            case 1: {
                lllllllllllllIIllllIIlIlIIIIlllI = JZlib.W_NONE;
                "".length();
                if (" ".length() >= "  ".length()) {
                    return null;
                }
                break;
            }
            case 2: {
                lllllllllllllIIllllIIlIlIIIIlllI = JZlib.W_ZLIB;
                "".length();
                if ((71 + 160 - 102 + 66 ^ 93 + 182 - 127 + 51) <= "  ".length()) {
                    return null;
                }
                break;
            }
            case 3: {
                lllllllllllllIIllllIIlIlIIIIlllI = JZlib.W_GZIP;
                "".length();
                if (((0x52 ^ 0x57) & ~(0x2C ^ 0x29)) > 0) {
                    return null;
                }
                break;
            }
            case 4: {
                lllllllllllllIIllllIIlIlIIIIlllI = JZlib.W_ANY;
                "".length();
                if (" ".length() >= "  ".length()) {
                    return null;
                }
                break;
            }
            default: {
                throw new Error();
            }
        }
        return lllllllllllllIIllllIIlIlIIIIlllI;
    }
    
    static CompressionException deflaterException(final Deflater lllllllllllllIIllllIIlIlIIIlIlII, final String lllllllllllllIIllllIIlIlIIIlIllI, final int lllllllllllllIIllllIIlIlIIIlIIlI) {
        final StringBuilder append = new StringBuilder().append(lllllllllllllIIllllIIlIlIIIlIllI).append(ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[4]]).append(lllllllllllllIIllllIIlIlIIIlIIlI).append((char)ZlibUtil.lIIIlllllIIIIl[1]);
        String value;
        if (llIIlIIIIIllIlI(lllllllllllllIIllllIIlIlIIIlIlII.msg)) {
            value = String.valueOf(new StringBuilder().append(ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[5]]).append(lllllllllllllIIllllIIlIlIIIlIlII.msg));
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        else {
            value = ZlibUtil.lIIIlllllIIIII[ZlibUtil.lIIIlllllIIIIl[6]];
        }
        return new CompressionException(String.valueOf(append.append(value)));
    }
    
    static {
        llIIlIIIIIllIIl();
        llIIlIIIIIllIII();
    }
}
