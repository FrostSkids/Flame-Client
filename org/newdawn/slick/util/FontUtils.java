// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;

public class FontUtils
{
    private static final /* synthetic */ String[] lIIIIlIlllIIlI;
    private static final /* synthetic */ int[] lIIIIlIlllIIll;
    
    private static boolean lIlllIlIlIlIlll(final int lllllllllllllIlIIlIlIIIllIlIlIlI, final int lllllllllllllIlIIlIlIIIllIlIlIIl) {
        return lllllllllllllIlIIlIlIIIllIlIlIlI == lllllllllllllIlIIlIlIIIllIlIlIIl;
    }
    
    private static boolean lIlllIlIlIllIIl(final int lllllllllllllIlIIlIlIIIllIlIIllI, final int lllllllllllllIlIIlIlIIIllIlIIlII) {
        return lllllllllllllIlIIlIlIIIllIlIIllI < lllllllllllllIlIIlIlIIIllIlIIlII;
    }
    
    public static void drawRight(final Font lllllllllllllIlIIlIlIIlIIlIIllII, final String lllllllllllllIlIIlIlIIlIIlIIIllI, final int lllllllllllllIlIIlIlIIlIIlIIIlIl, final int lllllllllllllIlIIlIlIIlIIlIIIlII, final int lllllllllllllIlIIlIlIIlIIlIIlIII) {
        drawString(lllllllllllllIlIIlIlIIlIIlIIllII, lllllllllllllIlIIlIlIIlIIlIIIllI, FontUtils.lIIIIlIlllIIll[3], lllllllllllllIlIIlIlIIlIIlIIIlIl, lllllllllllllIlIIlIlIIlIIlIIIlII, lllllllllllllIlIIlIlIIlIIlIIlIII, Color.white);
        "".length();
    }
    
    private static void lIlllIlIlIlIlIl() {
        (lIIIIlIlllIIlI = new String[FontUtils.lIIIIlIlllIIll[0]])[FontUtils.lIIIIlIlllIIll[1]] = lIlllIlIlIlIlII("tZukuQ46CTU=", "cPZJx");
    }
    
    public static void drawCenter(final Font lllllllllllllIlIIlIlIIlIIlIlllIl, final String lllllllllllllIlIIlIlIIlIIlIlIllI, final int lllllllllllllIlIIlIlIIlIIlIllIll, final int lllllllllllllIlIIlIlIIlIIlIllIlI, final int lllllllllllllIlIIlIlIIlIIlIllIIl, final Color lllllllllllllIlIIlIlIIlIIlIllIII) {
        drawString(lllllllllllllIlIIlIlIIlIIlIlllIl, lllllllllllllIlIIlIlIIlIIlIlIllI, FontUtils.lIIIIlIlllIIll[2], lllllllllllllIlIIlIlIIlIIlIllIll, lllllllllllllIlIIlIlIIlIIlIllIlI, lllllllllllllIlIIlIlIIlIIlIllIIl, lllllllllllllIlIIlIlIIlIIlIllIII);
        "".length();
    }
    
    private static boolean lIlllIlIlIllIII(final int lllllllllllllIlIIlIlIIIllIlIIIII) {
        return lllllllllllllIlIIlIlIIIllIlIIIII <= 0;
    }
    
    public static void drawRight(final Font lllllllllllllIlIIlIlIIlIIIllllII, final String lllllllllllllIlIIlIlIIlIIIllIlIl, final int lllllllllllllIlIIlIlIIlIIIlllIlI, final int lllllllllllllIlIIlIlIIlIIIlllIIl, final int lllllllllllllIlIIlIlIIlIIIlllIII, final Color lllllllllllllIlIIlIlIIlIIIllIIIl) {
        drawString(lllllllllllllIlIIlIlIIlIIIllllII, lllllllllllllIlIIlIlIIlIIIllIlIl, FontUtils.lIIIIlIlllIIll[3], lllllllllllllIlIIlIlIIlIIIlllIlI, lllllllllllllIlIIlIlIIlIIIlllIIl, lllllllllllllIlIIlIlIIlIIIlllIII, lllllllllllllIlIIlIlIIlIIIllIIIl);
        "".length();
    }
    
    static {
        lIlllIlIlIlIllI();
        lIlllIlIlIlIlIl();
    }
    
    public static final int drawString(final Font lllllllllllllIlIIlIlIIlIIIIllllI, final String lllllllllllllIlIIlIlIIlIIIlIIlIl, final int lllllllllllllIlIIlIlIIlIIIIlllII, final int lllllllllllllIlIIlIlIIlIIIIllIll, final int lllllllllllllIlIIlIlIIlIIIIllIlI, final int lllllllllllllIlIIlIlIIlIIIlIIIIl, final Color lllllllllllllIlIIlIlIIlIIIlIIIII) {
        final int lllllllllllllIlIIlIlIIlIIIIlllll = FontUtils.lIIIIlIlllIIll[1];
        if (lIlllIlIlIlIlll(lllllllllllllIlIIlIlIIlIIIIlllII, FontUtils.lIIIIlIlllIIll[0])) {
            lllllllllllllIlIIlIlIIlIIIIllllI.drawString((float)lllllllllllllIlIIlIlIIlIIIIllIll, (float)lllllllllllllIlIIlIlIIlIIIIllIlI, lllllllllllllIlIIlIlIIlIIIlIIlIl, lllllllllllllIlIIlIlIIlIIIlIIIII);
            "".length();
            if (((0xA7 ^ 0x9F) & ~(0x58 ^ 0x60)) != 0x0) {
                return (0x68 ^ 0x49) & ~(0xB3 ^ 0x92);
            }
        }
        else if (lIlllIlIlIlIlll(lllllllllllllIlIIlIlIIlIIIIlllII, FontUtils.lIIIIlIlllIIll[2])) {
            lllllllllllllIlIIlIlIIlIIIIllllI.drawString((float)(lllllllllllllIlIIlIlIIlIIIIllIll + lllllllllllllIlIIlIlIIlIIIlIIIIl / FontUtils.lIIIIlIlllIIll[2] - lllllllllllllIlIIlIlIIlIIIIllllI.getWidth(lllllllllllllIlIIlIlIIlIIIlIIlIl) / FontUtils.lIIIIlIlllIIll[2]), (float)lllllllllllllIlIIlIlIIlIIIIllIlI, lllllllllllllIlIIlIlIIlIIIlIIlIl, lllllllllllllIlIIlIlIIlIIIlIIIII);
            "".length();
            if ("   ".length() >= (68 + 133 - 69 + 4 ^ 63 + 4 - 8 + 81)) {
                return (72 + 133 - 61 + 7 ^ 96 + 11 - 72 + 119) & (138 + 41 - 85 + 55 ^ 151 + 34 - 61 + 28 ^ -" ".length());
            }
        }
        else if (lIlllIlIlIlIlll(lllllllllllllIlIIlIlIIlIIIIlllII, FontUtils.lIIIIlIlllIIll[3])) {
            lllllllllllllIlIIlIlIIlIIIIllllI.drawString((float)(lllllllllllllIlIIlIlIIlIIIIllIll + lllllllllllllIlIIlIlIIlIIIlIIIIl - lllllllllllllIlIIlIlIIlIIIIllllI.getWidth(lllllllllllllIlIIlIlIIlIIIlIIlIl)), (float)lllllllllllllIlIIlIlIIlIIIIllIlI, lllllllllllllIlIIlIlIIlIIIlIIlIl, lllllllllllllIlIIlIlIIlIIIlIIIII);
            "".length();
            if ("   ".length() < ((0x27 ^ 0x72 ^ (0xFE ^ 0xBB)) & (148 + 158 - 172 + 38 ^ 184 + 56 - 73 + 21 ^ -" ".length()))) {
                return (0x23 ^ 0x53 ^ (0x9D ^ 0xC3)) & (0x87 ^ 0xB1 ^ (0xB1 ^ 0xA9) ^ -" ".length());
            }
        }
        else if (lIlllIlIlIlIlll(lllllllllllllIlIIlIlIIlIIIIlllII, FontUtils.lIIIIlIlllIIll[4])) {
            final int lllllllllllllIlIIlIlIIlIIIlIIlll = lllllllllllllIlIIlIlIIlIIIlIIIIl - lllllllllllllIlIIlIlIIlIIIIllllI.getWidth(lllllllllllllIlIIlIlIIlIIIlIIlIl);
            if (lIlllIlIlIllIII(lllllllllllllIlIIlIlIIlIIIlIIlll)) {
                lllllllllllllIlIIlIlIIlIIIIllllI.drawString((float)lllllllllllllIlIIlIlIIlIIIIllIll, (float)lllllllllllllIlIIlIlIIlIIIIllIlI, lllllllllllllIlIIlIlIIlIIIlIIlIl, lllllllllllllIlIIlIlIIlIIIlIIIII);
            }
            return drawJustifiedSpaceSeparatedSubstrings(lllllllllllllIlIIlIlIIlIIIIllllI, lllllllllllllIlIIlIlIIlIIIlIIlIl, lllllllllllllIlIIlIlIIlIIIIllIll, lllllllllllllIlIIlIlIIlIIIIllIlI, calculateWidthOfJustifiedSpaceInPixels(lllllllllllllIlIIlIlIIlIIIIllllI, lllllllllllllIlIIlIlIIlIIIlIIlIl, lllllllllllllIlIIlIlIIlIIIlIIlll));
        }
        return lllllllllllllIlIIlIlIIlIIIIlllll;
    }
    
    private static int calculateWidthOfJustifiedSpaceInPixels(final Font lllllllllllllIlIIlIlIIlIIIIIllII, final String lllllllllllllIlIIlIlIIlIIIIIIIll, final int lllllllllllllIlIIlIlIIlIIIIIIIlI) {
        int lllllllllllllIlIIlIlIIlIIIIIIlll = FontUtils.lIIIIlIlllIIll[1];
        int lllllllllllllIlIIlIlIIlIIIIIIlIl = FontUtils.lIIIIlIlllIIll[1];
        while (lIlllIlIlIllIIl(lllllllllllllIlIIlIlIIlIIIIIIlIl, lllllllllllllIlIIlIlIIlIIIIIIIll.length())) {
            if (lIlllIlIlIlIlll(lllllllllllllIlIIlIlIIlIIIIIIIll.charAt(lllllllllllllIlIIlIlIIlIIIIIIlIl++), FontUtils.lIIIIlIlllIIll[5])) {
                ++lllllllllllllIlIIlIlIIlIIIIIIlll;
                "".length();
                if (-(0x84 ^ 0x81) >= 0) {
                    return (0xA7 ^ 0x95) & ~(0xF7 ^ 0xC5);
                }
                continue;
            }
        }
        if (lIlllIlIlIllIlI(lllllllllllllIlIIlIlIIlIIIIIIlll)) {
            lllllllllllllIlIIlIlIIlIIIIIIlll = (lllllllllllllIlIIlIlIIlIIIIIIIlI + lllllllllllllIlIIlIlIIlIIIIIllII.getWidth(FontUtils.lIIIIlIlllIIlI[FontUtils.lIIIIlIlllIIll[1]]) * lllllllllllllIlIIlIlIIlIIIIIIlll) / lllllllllllllIlIIlIlIIlIIIIIIlll;
        }
        return lllllllllllllIlIIlIlIIlIIIIIIlll;
    }
    
    private static int drawJustifiedSpaceSeparatedSubstrings(final Font lllllllllllllIlIIlIlIIIllllIIlII, final String lllllllllllllIlIIlIlIIIlllIlIIll, final int lllllllllllllIlIIlIlIIIllllIIIII, final int lllllllllllllIlIIlIlIIIlllIlIIII, final int lllllllllllllIlIIlIlIIIlllIIllll) {
        int lllllllllllllIlIIlIlIIIlllIllIlI = FontUtils.lIIIIlIlllIIll[1];
        int lllllllllllllIlIIlIlIIIlllIllIII = FontUtils.lIIIIlIlllIIll[1];
        int lllllllllllllIlIIlIlIIIlllIlIllI = lllllllllllllIlIIlIlIIIllllIIIII;
        while (lIlllIlIlIllIIl(lllllllllllllIlIIlIlIIIlllIllIlI, lllllllllllllIlIIlIlIIIlllIlIIll.length())) {
            lllllllllllllIlIIlIlIIIlllIllIII = lllllllllllllIlIIlIlIIIlllIlIIll.indexOf(FontUtils.lIIIIlIlllIIll[5], lllllllllllllIlIIlIlIIIlllIllIlI);
            if (lIlllIlIlIlIlll(lllllllllllllIlIIlIlIIIlllIllIII, FontUtils.lIIIIlIlllIIll[6])) {
                lllllllllllllIlIIlIlIIIlllIllIII = lllllllllllllIlIIlIlIIIlllIlIIll.length();
            }
            final String lllllllllllllIlIIlIlIIIllllIIllI = lllllllllllllIlIIlIlIIIlllIlIIll.substring(lllllllllllllIlIIlIlIIIlllIllIlI, lllllllllllllIlIIlIlIIIlllIllIII);
            lllllllllllllIlIIlIlIIIllllIIlII.drawString((float)lllllllllllllIlIIlIlIIIlllIlIllI, (float)lllllllllllllIlIIlIlIIIlllIlIIII, lllllllllllllIlIIlIlIIIllllIIllI);
            lllllllllllllIlIIlIlIIIlllIlIllI += lllllllllllllIlIIlIlIIIllllIIlII.getWidth(lllllllllllllIlIIlIlIIIllllIIllI) + lllllllllllllIlIIlIlIIIlllIIllll;
            lllllllllllllIlIIlIlIIIlllIllIlI = lllllllllllllIlIIlIlIIIlllIllIII + FontUtils.lIIIIlIlllIIll[0];
            "".length();
            if ("  ".length() < 0) {
                return (0x2D ^ 0x65) & ~(0xF1 ^ 0xB9);
            }
        }
        return lllllllllllllIlIIlIlIIIlllIlIllI;
    }
    
    private static boolean lIlllIlIlIllIlI(final int lllllllllllllIlIIlIlIIIllIIllIll) {
        return lllllllllllllIlIIlIlIIIllIIllIll > 0;
    }
    
    private static void lIlllIlIlIlIllI() {
        (lIIIIlIlllIIll = new int[8])[0] = " ".length();
        FontUtils.lIIIIlIlllIIll[1] = ("   ".length() & ~"   ".length());
        FontUtils.lIIIIlIlllIIll[2] = "  ".length();
        FontUtils.lIIIIlIlllIIll[3] = "   ".length();
        FontUtils.lIIIIlIlllIIll[4] = (0x43 ^ 0x1E ^ (0x3 ^ 0x5A));
        FontUtils.lIIIIlIlllIIll[5] = (164 + 25 - 135 + 123 ^ 104 + 107 - 124 + 58);
        FontUtils.lIIIIlIlllIIll[6] = -" ".length();
        FontUtils.lIIIIlIlllIIll[7] = (0xD5 ^ 0x93 ^ (0x3C ^ 0x72));
    }
    
    private static String lIlllIlIlIlIlII(final String lllllllllllllIlIIlIlIIIllIlllIII, final String lllllllllllllIlIIlIlIIIllIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIIIllIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIIllIllIlll.getBytes(StandardCharsets.UTF_8)), FontUtils.lIIIIlIlllIIll[7]), "DES");
            final Cipher lllllllllllllIlIIlIlIIIllIllllII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlIIIllIllllII.init(FontUtils.lIIIIlIlllIIll[2], lllllllllllllIlIIlIlIIIllIllllIl);
            return new String(lllllllllllllIlIIlIlIIIllIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIIllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIIIllIlllIlI) {
            lllllllllllllIlIIlIlIIIllIlllIlI.printStackTrace();
            return null;
        }
    }
    
    public static void drawCenter(final Font lllllllllllllIlIIlIlIIlIIllIlIII, final String lllllllllllllIlIIlIlIIlIIllIllII, final int lllllllllllllIlIIlIlIIlIIllIlIll, final int lllllllllllllIlIIlIlIIlIIllIlIlI, final int lllllllllllllIlIIlIlIIlIIllIlIIl) {
        drawString(lllllllllllllIlIIlIlIIlIIllIlIII, lllllllllllllIlIIlIlIIlIIllIllII, FontUtils.lIIIIlIlllIIll[2], lllllllllllllIlIIlIlIIlIIllIlIll, lllllllllllllIlIIlIlIIlIIllIlIlI, lllllllllllllIlIIlIlIIlIIllIlIIl, Color.white);
        "".length();
    }
    
    public static void drawLeft(final Font lllllllllllllIlIIlIlIIlIIlllIllI, final String lllllllllllllIlIIlIlIIlIIlllIlIl, final int lllllllllllllIlIIlIlIIlIIllllIII, final int lllllllllllllIlIIlIlIIlIIlllIIll) {
        drawString(lllllllllllllIlIIlIlIIlIIlllIllI, lllllllllllllIlIIlIlIIlIIlllIlIl, FontUtils.lIIIIlIlllIIll[0], lllllllllllllIlIIlIlIIlIIllllIII, lllllllllllllIlIIlIlIIlIIlllIIll, FontUtils.lIIIIlIlllIIll[1], Color.white);
        "".length();
    }
    
    public class Alignment
    {
        private static final /* synthetic */ int[] lIIlIIIIIlIIlI;
        
        static {
            llIIlIIlIIIllII();
            JUSTIFY = Alignment.lIIlIIIIIlIIlI[0];
            RIGHT = Alignment.lIIlIIIIIlIIlI[1];
            LEFT = Alignment.lIIlIIIIIlIIlI[2];
            CENTER = Alignment.lIIlIIIIIlIIlI[3];
        }
        
        private static void llIIlIIlIIIllII() {
            (lIIlIIIIIlIIlI = new int[4])[0] = (76 + 44 - 111 + 161 ^ 158 + 68 - 116 + 64);
            Alignment.lIIlIIIIIlIIlI[1] = "   ".length();
            Alignment.lIIlIIIIIlIIlI[2] = " ".length();
            Alignment.lIIlIIIIIlIIlI[3] = "  ".length();
        }
    }
}
