// 
// Decompiled by Procyon v0.5.36
// 

package client.mod;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum Category
{
    COSMETIC(Category.lIIlIllIIIlIll[Category.lIIlIllIIIllll[2]], Category.lIIlIllIIIllll[2]);
    
    private static final /* synthetic */ int[] lIIlIllIIIllll;
    private static final /* synthetic */ String[] lIIlIllIIIlIll;
    
    MISC(Category.lIIlIllIIIlIll[Category.lIIlIllIIIllll[3]], Category.lIIlIllIIIllll[3]), 
    HUD(Category.lIIlIllIIIlIll[Category.lIIlIllIIIllll[0]], Category.lIIlIllIIIllll[0]), 
    WORLD(Category.lIIlIllIIIlIll[Category.lIIlIllIIIllll[1]], Category.lIIlIllIIIllll[1]);
    
    private static void llIlIIIllllIIll() {
        (lIIlIllIIIllll = new int[6])[0] = ((0xD2 ^ 0x99 ^ (0x10 ^ 0x0)) & (25 + 32 - 7 + 153 ^ 80 + 67 - 14 + 11 ^ -" ".length()));
        Category.lIIlIllIIIllll[1] = " ".length();
        Category.lIIlIllIIIllll[2] = "  ".length();
        Category.lIIlIllIIIllll[3] = "   ".length();
        Category.lIIlIllIIIllll[4] = (0x6C ^ 0x68);
        Category.lIIlIllIIIllll[5] = (0x26 ^ 0x14 ^ (0x9F ^ 0xA5));
    }
    
    private static void llIlIIIlllIlllI() {
        (lIIlIllIIIlIll = new String[Category.lIIlIllIIIllll[4]])[Category.lIIlIllIIIllll[0]] = llIlIIIlllIllII("Ve1Ns01SawA=", "PXVjC");
        Category.lIIlIllIIIlIll[Category.lIIlIllIIIllll[1]] = llIlIIIlllIllII("28x2Lqgo+Kc=", "kOGcy");
        Category.lIIlIllIIIlIll[Category.lIIlIllIIIllll[2]] = llIlIIIlllIllIl("66mBxqUBoPTqIpeRCDDc/Q==", "aZfiy");
        Category.lIIlIllIIIlIll[Category.lIIlIllIIIllll[3]] = llIlIIIlllIllII("2iWpmmrodzU=", "laKwO");
    }
    
    private static String llIlIIIlllIllII(final String lllllllllllllIIllIIlIlIlIllIlIII, final String lllllllllllllIIllIIlIlIlIllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIlIlIllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIlIlIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlIlIlIllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlIlIlIllIllII.init(Category.lIIlIllIIIllll[2], lllllllllllllIIllIIlIlIlIllIllIl);
            return new String(lllllllllllllIIllIIlIlIlIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIlIlIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIlIlIllIlIll) {
            lllllllllllllIIllIIlIlIlIllIlIll.printStackTrace();
            return null;
        }
    }
    
    private static String llIlIIIlllIllIl(final String lllllllllllllIIllIIlIlIlIlllIlIl, final String lllllllllllllIIllIIlIlIlIlllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIlIlIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIlIlIlllIllI.getBytes(StandardCharsets.UTF_8)), Category.lIIlIllIIIllll[5]), "DES");
            final Cipher lllllllllllllIIllIIlIlIlIllllIIl = Cipher.getInstance("DES");
            lllllllllllllIIllIIlIlIlIllllIIl.init(Category.lIIlIllIIIllll[2], lllllllllllllIIllIIlIlIlIllllIlI);
            return new String(lllllllllllllIIllIIlIlIlIllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIlIlIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIlIlIllllIII) {
            lllllllllllllIIllIIlIlIlIllllIII.printStackTrace();
            return null;
        }
    }
    
    private Category(final String lllllllllllllIIllIIlIlIllIIIlIII, final int lllllllllllllIIllIIlIlIllIIIIlll) {
    }
    
    static {
        llIlIIIllllIIll();
        llIlIIIlllIlllI();
        final Category[] enum$VALUES = new Category[Category.lIIlIllIIIllll[4]];
        enum$VALUES[Category.lIIlIllIIIllll[0]] = Category.HUD;
        enum$VALUES[Category.lIIlIllIIIllll[1]] = Category.WORLD;
        enum$VALUES[Category.lIIlIllIIIllll[2]] = Category.COSMETIC;
        enum$VALUES[Category.lIIlIllIIIllll[3]] = Category.MISC;
        ENUM$VALUES = enum$VALUES;
    }
}
