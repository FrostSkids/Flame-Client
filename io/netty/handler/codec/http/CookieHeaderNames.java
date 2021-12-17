// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

final class CookieHeaderNames
{
    private static final /* synthetic */ String[] lllllllllIlIl;
    private static final /* synthetic */ int[] lIIIIIIIIIIIll;
    
    private CookieHeaderNames() {
    }
    
    private static boolean lIllIIlIlIIIIlI(final int lllllllllllllIlIlIIlIlIIIlIIIlIl, final int lllllllllllllIlIlIIlIlIIIlIIIlII) {
        return lllllllllllllIlIlIIlIlIIIlIIIlIl < lllllllllllllIlIlIIlIlIIIlIIIlII;
    }
    
    static {
        lIllIIlIlIIIIIl();
        lIllIIlIIIlIlII();
        SECURE = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[0]];
        DOMAIN = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[1]];
        VERSION = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[2]];
        HTTPONLY = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[3]];
        MAX_AGE = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[4]];
        EXPIRES = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[5]];
        COMMENT = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[6]];
        COMMENTURL = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[7]];
        PATH = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[8]];
        DISCARD = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[9]];
        PORT = CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[10]];
    }
    
    private static String lIllIIlIIIlIIIl(final String lllllllllllllIlIlIIlIlIIIlIllIlI, final String lllllllllllllIlIlIIlIlIIIlIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIlIIIlIlllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIlIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), CookieHeaderNames.lIIIIIIIIIIIll[8]), "DES");
            final Cipher lllllllllllllIlIlIIlIlIIIlIlllII = Cipher.getInstance("DES");
            lllllllllllllIlIlIIlIlIIIlIlllII.init(CookieHeaderNames.lIIIIIIIIIIIll[2], lllllllllllllIlIlIIlIlIIIlIlllIl);
            return new String(lllllllllllllIlIlIIlIlIIIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIlIIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIlIIIlIllIll) {
            lllllllllllllIlIlIIlIlIIIlIllIll.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIIlIIIlIIlI(final String lllllllllllllIlIlIIlIlIIIlIIlIll, final String lllllllllllllIlIlIIlIlIIIlIIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIlIIIlIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIlIIIlIIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIlIlIIIlIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIlIlIIIlIIllll.init(CookieHeaderNames.lIIIIIIIIIIIll[2], lllllllllllllIlIlIIlIlIIIlIlIIII);
            return new String(lllllllllllllIlIlIIlIlIIIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIlIIIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIlIIIlIIlllI) {
            lllllllllllllIlIlIIlIlIIIlIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIIlIlIIIIIl() {
        (lIIIIIIIIIIIll = new int[12])[0] = ((0xB7 ^ 0xA3) & ~(0x8C ^ 0x98));
        CookieHeaderNames.lIIIIIIIIIIIll[1] = " ".length();
        CookieHeaderNames.lIIIIIIIIIIIll[2] = "  ".length();
        CookieHeaderNames.lIIIIIIIIIIIll[3] = "   ".length();
        CookieHeaderNames.lIIIIIIIIIIIll[4] = (0x5F ^ 0x18 ^ (0x1E ^ 0x5D));
        CookieHeaderNames.lIIIIIIIIIIIll[5] = (0x6F ^ 0x6A);
        CookieHeaderNames.lIIIIIIIIIIIll[6] = (0x22 ^ 0x24);
        CookieHeaderNames.lIIIIIIIIIIIll[7] = (0x61 ^ 0x65 ^ "   ".length());
        CookieHeaderNames.lIIIIIIIIIIIll[8] = (0xAD ^ 0xB4 ^ (0x29 ^ 0x38));
        CookieHeaderNames.lIIIIIIIIIIIll[9] = (0x76 ^ 0x5B ^ (0x63 ^ 0x47));
        CookieHeaderNames.lIIIIIIIIIIIll[10] = (0xBF ^ 0xB5);
        CookieHeaderNames.lIIIIIIIIIIIll[11] = (0x92 ^ 0x99);
    }
    
    private static String lIllIIlIIIlIIII(String lllllllllllllIlIlIIlIlIIIllIlIlI, final String lllllllllllllIlIlIIlIlIIIllIlIIl) {
        lllllllllllllIlIlIIlIlIIIllIlIlI = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIlIlIIIllIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIlIlIIIllIllIl = new StringBuilder();
        final char[] lllllllllllllIlIlIIlIlIIIllIllII = lllllllllllllIlIlIIlIlIIIllIlIIl.toCharArray();
        int lllllllllllllIlIlIIlIlIIIllIlIll = CookieHeaderNames.lIIIIIIIIIIIll[0];
        final short lllllllllllllIlIlIIlIlIIIllIIlIl = (Object)((String)lllllllllllllIlIlIIlIlIIIllIlIlI).toCharArray();
        final Exception lllllllllllllIlIlIIlIlIIIllIIlII = (Exception)lllllllllllllIlIlIIlIlIIIllIIlIl.length;
        long lllllllllllllIlIlIIlIlIIIllIIIll = CookieHeaderNames.lIIIIIIIIIIIll[0];
        while (lIllIIlIlIIIIlI((int)lllllllllllllIlIlIIlIlIIIllIIIll, (int)lllllllllllllIlIlIIlIlIIIllIIlII)) {
            final char lllllllllllllIlIlIIlIlIIIlllIIII = lllllllllllllIlIlIIlIlIIIllIIlIl[lllllllllllllIlIlIIlIlIIIllIIIll];
            lllllllllllllIlIlIIlIlIIIllIllIl.append((char)(lllllllllllllIlIlIIlIlIIIlllIIII ^ lllllllllllllIlIlIIlIlIIIllIllII[lllllllllllllIlIlIIlIlIIIllIlIll % lllllllllllllIlIlIIlIlIIIllIllII.length]));
            "".length();
            ++lllllllllllllIlIlIIlIlIIIllIlIll;
            ++lllllllllllllIlIlIIlIlIIIllIIIll;
            "".length();
            if ((0x93 ^ 0xBE ^ (0x6B ^ 0x42)) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIlIlIIIllIllIl);
    }
    
    private static void lIllIIlIIIlIlII() {
        (lllllllllIlIl = new String[CookieHeaderNames.lIIIIIIIIIIIll[11]])[CookieHeaderNames.lIIIIIIIIIIIll[0]] = lIllIIlIIIlIIII("HhUENyQo", "MpgBV");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[1]] = lIllIIlIIIlIIIl("u7Ax7BzwXFY=", "qMCSC");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[2]] = lIllIIlIIIlIIIl("ssZaKSyRLUs=", "EVzqa");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[3]] = lIllIIlIIIlIIlI("eYLFe+jlmLvSw4zwo/sNHA==", "MdUAk");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[4]] = lIllIIlIIIlIIII("AgA5VwAoBA==", "OaAzA");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[5]] = lIllIIlIIIlIIII("MDMDJzcQOA==", "uKsNE");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[6]] = lIllIIlIIIlIIII("LiomFAkDMQ==", "mEKyl");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[7]] = lIllIIlIIIlIIIl("iH0/+UXLE2NFMXYuX93UIA==", "AIgJg");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[8]] = lIllIIlIIIlIIII("Pxs3Cw==", "ozCcu");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[9]] = lIllIIlIIIlIIlI("PewXXNf00Mw=", "ZiRAv");
        CookieHeaderNames.lllllllllIlIl[CookieHeaderNames.lIIIIIIIIIIIll[10]] = lIllIIlIIIlIIIl("luORADha/qE=", "tMvUB");
    }
}
