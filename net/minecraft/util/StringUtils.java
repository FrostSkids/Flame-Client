// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.regex.Pattern;

public class StringUtils
{
    private static final /* synthetic */ int[] llllIlIIllllI;
    private static final /* synthetic */ String[] llllIlIIlllII;
    private static final /* synthetic */ Pattern patternControlCode;
    
    static {
        lIlIlIlIIlIIllI();
        lIlIlIlIIlIIIlI();
        patternControlCode = Pattern.compile(StringUtils.llllIlIIlllII[StringUtils.llllIlIIllllI[0]]);
    }
    
    private static void lIlIlIlIIlIIllI() {
        (llllIlIIllllI = new int[9])[0] = ((0x77 ^ 0x26) & ~(0xEC ^ 0xBD));
        StringUtils.llllIlIIllllI[1] = (47 + 44 - 71 + 139 ^ 62 + 24 + 51 + 2);
        StringUtils.llllIlIIllllI[2] = ("  ".length() ^ (0x16 ^ 0x28));
        StringUtils.llllIlIIllllI[3] = (55 + 76 + 16 + 16 ^ 92 + 26 + 10 + 41);
        StringUtils.llllIlIIllllI[4] = " ".length();
        StringUtils.llllIlIIllllI[5] = "  ".length();
        StringUtils.llllIlIIllllI[6] = "   ".length();
        StringUtils.llllIlIIllllI[7] = (0xC7 ^ 0xC3);
        StringUtils.llllIlIIllllI[8] = (10 + 137 - 56 + 115 ^ 193 + 3 - 160 + 162);
    }
    
    private static boolean lIlIlIlIIlIIlll(final int lllllllllllllIlIllIllIlIlIIIIIII, final int lllllllllllllIlIllIllIlIIlllllll) {
        return lllllllllllllIlIllIllIlIlIIIIIII < lllllllllllllIlIllIllIlIIlllllll;
    }
    
    private static String lIlIlIlIIlIIIIl(final String lllllllllllllIlIllIllIlIlIIllllI, final String lllllllllllllIlIllIllIlIlIIlllll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIllIlIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIllIlIlIIlllll.getBytes(StandardCharsets.UTF_8)), StringUtils.llllIlIIllllI[8]), "DES");
            final Cipher lllllllllllllIlIllIllIlIlIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIllIllIlIlIlIIIlI.init(StringUtils.llllIlIIllllI[5], lllllllllllllIlIllIllIlIlIlIIIll);
            return new String(lllllllllllllIlIllIllIlIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIllIlIlIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIllIlIlIlIIIIl) {
            lllllllllllllIlIllIllIlIlIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIlIlIIlIIIII(String lllllllllllllIlIllIllIlIlIIIlIll, final String lllllllllllllIlIllIllIlIlIIIllll) {
        lllllllllllllIlIllIllIlIlIIIlIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIllIlIlIIIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIllIlIlIIIlllI = new StringBuilder();
        final char[] lllllllllllllIlIllIllIlIlIIIllIl = lllllllllllllIlIllIllIlIlIIIllll.toCharArray();
        int lllllllllllllIlIllIllIlIlIIIllII = StringUtils.llllIlIIllllI[0];
        final int lllllllllllllIlIllIllIlIlIIIIllI = (Object)((String)lllllllllllllIlIllIllIlIlIIIlIll).toCharArray();
        final long lllllllllllllIlIllIllIlIlIIIIlIl = lllllllllllllIlIllIllIlIlIIIIllI.length;
        boolean lllllllllllllIlIllIllIlIlIIIIlII = StringUtils.llllIlIIllllI[0] != 0;
        while (lIlIlIlIIlIIlll(lllllllllllllIlIllIllIlIlIIIIlII ? 1 : 0, (int)lllllllllllllIlIllIllIlIlIIIIlIl)) {
            final char lllllllllllllIlIllIllIlIlIIlIIIl = lllllllllllllIlIllIllIlIlIIIIllI[lllllllllllllIlIllIllIlIlIIIIlII];
            lllllllllllllIlIllIllIlIlIIIlllI.append((char)(lllllllllllllIlIllIllIlIlIIlIIIl ^ lllllllllllllIlIllIllIlIlIIIllIl[lllllllllllllIlIllIllIlIlIIIllII % lllllllllllllIlIllIllIlIlIIIllIl.length]));
            "".length();
            ++lllllllllllllIlIllIllIlIlIIIllII;
            ++lllllllllllllIlIllIllIlIlIIIIlII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIllIlIlIIIlllI);
    }
    
    public static boolean isNullOrEmpty(final String lllllllllllllIlIllIllIlIlIlIlIIl) {
        return org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)lllllllllllllIlIllIllIlIlIlIlIIl);
    }
    
    private static void lIlIlIlIIlIIIlI() {
        (llllIlIIlllII = new String[StringUtils.llllIlIIllllI[7]])[StringUtils.llllIlIIllllI[0]] = lIlIlIlIIlIIIII("eGsabSslZEMFQAtkXn02fRI4aTgCCQ==", "PTsDw");
        StringUtils.llllIlIIlllII[StringUtils.llllIlIIllllI[4]] = lIlIlIlIIlIIIIl("TNJpSc7yaZ0=", "itFBX");
        StringUtils.llllIlIIlllII[StringUtils.llllIlIIllllI[5]] = lIlIlIlIIlIIIIl("3UsOFf490UM=", "JZINl");
        StringUtils.llllIlIIlllII[StringUtils.llllIlIIllllI[6]] = lIlIlIlIIlIIIIl("3R5/xPfjHI8=", "YjHev");
    }
    
    public static String stripControlCodes(final String lllllllllllllIlIllIllIlIlIlIlIll) {
        return StringUtils.patternControlCode.matcher(lllllllllllllIlIllIllIlIlIlIlIll).replaceAll(StringUtils.llllIlIIlllII[StringUtils.llllIlIIllllI[6]]);
    }
    
    public static String ticksToElapsedTime(final int lllllllllllllIlIllIllIlIlIllIIll) {
        int lllllllllllllIlIllIllIlIlIllIIlI = lllllllllllllIlIllIllIlIlIllIIll / StringUtils.llllIlIIllllI[1];
        final int lllllllllllllIlIllIllIlIlIllIIIl = lllllllllllllIlIllIllIlIlIllIIlI / StringUtils.llllIlIIllllI[2];
        lllllllllllllIlIllIllIlIlIllIIlI %= StringUtils.llllIlIIllllI[2];
        String s;
        if (lIlIlIlIIlIIlll(lllllllllllllIlIllIllIlIlIllIIlI, StringUtils.llllIlIIllllI[3])) {
            s = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIllIlIlIllIIIl)).append(StringUtils.llllIlIIlllII[StringUtils.llllIlIIllllI[4]]).append(lllllllllllllIlIllIllIlIlIllIIlI));
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            s = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIlIllIllIlIlIllIIIl)).append(StringUtils.llllIlIIlllII[StringUtils.llllIlIIllllI[5]]).append(lllllllllllllIlIllIllIlIlIllIIlI));
        }
        return s;
    }
}
