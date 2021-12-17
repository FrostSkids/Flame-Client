// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.stream;

import java.util.Arrays;
import net.minecraft.stats.Achievement;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class MetadataAchievement extends Metadata
{
    private static final /* synthetic */ String[] lIlIllllllllll;
    private static final /* synthetic */ int[] lIllIIIIIIIIII;
    
    private static String llllIlIllIllIIl(final String lllllllllllllIIIIlIIlIlIIIIIllII, final String lllllllllllllIIIIlIIlIlIIIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlIlIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlIlIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIIlIlIIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIIlIlIIIIlIIII.init(MetadataAchievement.lIllIIIIIIIIII[2], lllllllllllllIIIIlIIlIlIIIIlIIIl);
            return new String(lllllllllllllIIIIlIIlIlIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIlIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlIlIIIIIllll) {
            lllllllllllllIIIIlIIlIlIIIIIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIlIllIllllI(final int lllllllllllllIIIIlIIlIIllllllIIl, final int lllllllllllllIIIIlIIlIIllllllIII) {
        return lllllllllllllIIIIlIIlIIllllllIIl < lllllllllllllIIIIlIIlIIllllllIII;
    }
    
    public MetadataAchievement(final Achievement lllllllllllllIIIIlIIlIlIIIlIlllI) {
        super(MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[0]]);
        this.func_152808_a(MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[1]], lllllllllllllIIIIlIIlIlIIIlIlllI.statId);
        this.func_152808_a(MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[2]], lllllllllllllIIIIlIIlIlIIIlIlllI.getStatName().getUnformattedText());
        this.func_152808_a(MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[3]], lllllllllllllIIIIlIIlIlIIIlIlllI.getDescription());
        this.func_152807_a(String.valueOf(new StringBuilder(MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[4]]).append(lllllllllllllIIIIlIIlIlIIIlIlllI.getStatName().getUnformattedText()).append(MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[5]])));
    }
    
    private static void llllIlIllIlllIl() {
        (lIllIIIIIIIIII = new int[8])[0] = ((0x4C ^ 0x76) & ~(0x12 ^ 0x28));
        MetadataAchievement.lIllIIIIIIIIII[1] = " ".length();
        MetadataAchievement.lIllIIIIIIIIII[2] = "  ".length();
        MetadataAchievement.lIllIIIIIIIIII[3] = "   ".length();
        MetadataAchievement.lIllIIIIIIIIII[4] = (0xC9 ^ 0xB7 ^ (0xCF ^ 0xB5));
        MetadataAchievement.lIllIIIIIIIIII[5] = (0x10 ^ 0x7D ^ (0xE8 ^ 0x80));
        MetadataAchievement.lIllIIIIIIIIII[6] = (0xB6 ^ 0xB0);
        MetadataAchievement.lIllIIIIIIIIII[7] = (0x27 ^ 0x2F);
    }
    
    static {
        llllIlIllIlllIl();
        llllIlIllIlllII();
    }
    
    private static String llllIlIllIllIlI(String lllllllllllllIIIIlIIlIlIIIIllllI, final String lllllllllllllIIIIlIIlIlIIIIlllIl) {
        lllllllllllllIIIIlIIlIlIIIIllllI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIIlIlIIIIllllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIlIlIIIlIIIIl = new StringBuilder();
        final char[] lllllllllllllIIIIlIIlIlIIIlIIIII = lllllllllllllIIIIlIIlIlIIIIlllIl.toCharArray();
        int lllllllllllllIIIIlIIlIlIIIIlllll = MetadataAchievement.lIllIIIIIIIIII[0];
        final char lllllllllllllIIIIlIIlIlIIIIllIIl = (Object)((String)lllllllllllllIIIIlIIlIlIIIIllllI).toCharArray();
        final float lllllllllllllIIIIlIIlIlIIIIllIII = lllllllllllllIIIIlIIlIlIIIIllIIl.length;
        int lllllllllllllIIIIlIIlIlIIIIlIlll = MetadataAchievement.lIllIIIIIIIIII[0];
        while (llllIlIllIllllI(lllllllllllllIIIIlIIlIlIIIIlIlll, (int)lllllllllllllIIIIlIIlIlIIIIllIII)) {
            final char lllllllllllllIIIIlIIlIlIIIlIIlII = lllllllllllllIIIIlIIlIlIIIIllIIl[lllllllllllllIIIIlIIlIlIIIIlIlll];
            lllllllllllllIIIIlIIlIlIIIlIIIIl.append((char)(lllllllllllllIIIIlIIlIlIIIlIIlII ^ lllllllllllllIIIIlIIlIlIIIlIIIII[lllllllllllllIIIIlIIlIlIIIIlllll % lllllllllllllIIIIlIIlIlIIIlIIIII.length]));
            "".length();
            ++lllllllllllllIIIIlIIlIlIIIIlllll;
            ++lllllllllllllIIIIlIIlIlIIIIlIlll;
            "".length();
            if (-(0xA9 ^ 0xAD) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIlIlIIIlIIIIl);
    }
    
    private static String llllIlIllIllIll(final String lllllllllllllIIIIlIIlIlIIIIIIIIl, final String lllllllllllllIIIIlIIlIlIIIIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIlIlIIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIlIlIIIIIIIII.getBytes(StandardCharsets.UTF_8)), MetadataAchievement.lIllIIIIIIIIII[7]), "DES");
            final Cipher lllllllllllllIIIIlIIlIlIIIIIIIll = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIlIlIIIIIIIll.init(MetadataAchievement.lIllIIIIIIIIII[2], lllllllllllllIIIIlIIlIlIIIIIIlII);
            return new String(lllllllllllllIIIIlIIlIlIIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIlIlIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIlIlIIIIIIIlI) {
            lllllllllllllIIIIlIIlIlIIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void llllIlIllIlllII() {
        (lIlIllllllllll = new String[MetadataAchievement.lIllIIIIIIIIII[6]])[MetadataAchievement.lIllIIIIIIIIII[0]] = llllIlIllIllIIl("+tu5NTCLRWHhbRVHGG5yfg==", "KXQte");
        MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[1]] = llllIlIllIllIIl("tCEEZNXmlTWl9TPnhflTQA==", "OKhpi");
        MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[2]] = llllIlIllIllIlI("JCI9OSQzJDg1LzEeOzEsIA==", "EAUPA");
        MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[3]] = llllIlIllIllIIl("7rg0HE8ZcZK/iZaI1Uvngypavs3wMqME", "VIvTY");
        MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[4]] = llllIlIllIllIll("sbmWmEM/V9a97OBPNv7Xpw==", "qeVGm");
        MetadataAchievement.lIlIllllllllll[MetadataAchievement.lIllIIIIIIIIII[5]] = llllIlIllIllIll("VubjkEq6FmUBtYLn0P1qbw==", "Pdglo");
    }
}
