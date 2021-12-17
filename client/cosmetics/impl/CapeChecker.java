// 
// Decompiled by Procyon v0.5.36
// 

package client.cosmetics.impl;

import net.minecraft.client.entity.AbstractClientPlayer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class CapeChecker
{
    private static final /* synthetic */ String[] llllIIlIIIlII;
    private static final /* synthetic */ int[] llllIIlIIIlll;
    
    private static boolean lIlIlIIIIlIlIII(final int lllllllllllllIlIlllIlIIIllllllII, final int lllllllllllllIlIlllIlIIIlllllIlI) {
        return lllllllllllllIlIlllIlIIIllllllII < lllllllllllllIlIlllIlIIIlllllIlI;
    }
    
    private static void lIlIlIIIIlIIllI() {
        (llllIIlIIIlll = new int[4])[0] = ((88 + 26 - 29 + 75 ^ 138 + 166 - 146 + 13) & (0xAD ^ 0x96 ^ (0xBE ^ 0x8E) ^ -" ".length()));
        CapeChecker.llllIIlIIIlll[1] = " ".length();
        CapeChecker.llllIIlIIIlll[2] = "  ".length();
        CapeChecker.llllIIlIIIlll[3] = (0x73 ^ 0x7B);
    }
    
    private static String lIlIlIIIIIlIlII(String lllllllllllllIlIlllIlIIlIIIIllll, final String lllllllllllllIlIlllIlIIlIIIlIlIl) {
        lllllllllllllIlIlllIlIIlIIIIllll = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIlIIlIIIIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIlIIlIIIlIIll = new StringBuilder();
        final char[] lllllllllllllIlIlllIlIIlIIIlIIIl = lllllllllllllIlIlllIlIIlIIIlIlIl.toCharArray();
        int lllllllllllllIlIlllIlIIlIIIlIIII = CapeChecker.llllIIlIIIlll[0];
        final short lllllllllllllIlIlllIlIIlIIIIIlIl = (Object)lllllllllllllIlIlllIlIIlIIIIllll.toCharArray();
        final float lllllllllllllIlIlllIlIIlIIIIIIll = lllllllllllllIlIlllIlIIlIIIIIlIl.length;
        char lllllllllllllIlIlllIlIIlIIIIIIlI = (char)CapeChecker.llllIIlIIIlll[0];
        while (lIlIlIIIIlIlIII(lllllllllllllIlIlllIlIIlIIIIIIlI, (int)lllllllllllllIlIlllIlIIlIIIIIIll)) {
            final char lllllllllllllIlIlllIlIIlIIIllIII = lllllllllllllIlIlllIlIIlIIIIIlIl[lllllllllllllIlIlllIlIIlIIIIIIlI];
            lllllllllllllIlIlllIlIIlIIIlIIll.append((char)(lllllllllllllIlIlllIlIIlIIIllIII ^ lllllllllllllIlIlllIlIIlIIIlIIIl[lllllllllllllIlIlllIlIIlIIIlIIII % lllllllllllllIlIlllIlIIlIIIlIIIl.length]));
            "".length();
            ++lllllllllllllIlIlllIlIIlIIIlIIII;
            ++lllllllllllllIlIlllIlIIlIIIIIIlI;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIlIIlIIIlIIll);
    }
    
    static {
        lIlIlIIIIlIIllI();
        lIlIlIIIIIlIllI();
    }
    
    private static boolean lIlIlIIIIlIIlll(final int lllllllllllllIlIlllIlIIIllllIlII) {
        return lllllllllllllIlIlllIlIIIllllIlII != 0;
    }
    
    private static String lIlIlIIIIIlIlIl(final String lllllllllllllIlIlllIlIIlIIlIllll, final String lllllllllllllIlIlllIlIIlIIlIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIlIIlIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIlIIlIIlIllII.getBytes(StandardCharsets.UTF_8)), CapeChecker.llllIIlIIIlll[3]), "DES");
            final Cipher lllllllllllllIlIlllIlIIlIIllIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlllIlIIlIIllIIIl.init(CapeChecker.llllIIlIIIlll[2], lllllllllllllIlIlllIlIIlIIllIIlI);
            return new String(lllllllllllllIlIlllIlIIlIIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIlIIlIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIlIIlIIllIIII) {
            lllllllllllllIlIlllIlIIlIIllIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIlIIIIIlIllI() {
        (llllIIlIIIlII = new String[CapeChecker.llllIIlIIIlll[2]])[CapeChecker.llllIIlIIIlll[0]] = lIlIlIIIIIlIlII("BCQjJxQ=", "gUPBm");
        CapeChecker.llllIIlIIIlII[CapeChecker.llllIIlIIIlll[1]] = lIlIlIIIIIlIlIl("JAABESHe5MCxCR+vWhVLJQ==", "AxxcT");
    }
    
    public static boolean ownsCape(final AbstractClientPlayer lllllllllllllIlIlllIlIIlIIlllIIl) {
        if (lIlIlIIIIlIIlll(lllllllllllllIlIlllIlIIlIIlllIIl.getName().equals(CapeChecker.llllIIlIIIlII[CapeChecker.llllIIlIIIlll[0]]) ? 1 : 0)) {
            return CapeChecker.llllIIlIIIlll[1] != 0;
        }
        if (lIlIlIIIIlIIlll(lllllllllllllIlIlllIlIIlIIlllIIl.getName().equals(CapeChecker.llllIIlIIIlII[CapeChecker.llllIIlIIIlll[1]]) ? 1 : 0)) {
            return CapeChecker.llllIIlIIIlll[1] != 0;
        }
        return CapeChecker.llllIIlIIIlll[0] != 0;
    }
}
