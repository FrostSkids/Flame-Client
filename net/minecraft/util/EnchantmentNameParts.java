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
import java.util.Random;

public class EnchantmentNameParts
{
    private /* synthetic */ String[] namePartsArray;
    private static final /* synthetic */ EnchantmentNameParts instance;
    private static final /* synthetic */ int[] llIIIIIIlIlIll;
    private /* synthetic */ Random rand;
    private static final /* synthetic */ String[] llIIIIIIlIlIlI;
    
    public EnchantmentNameParts() {
        this.rand = new Random();
        this.namePartsArray = EnchantmentNameParts.llIIIIIIlIlIlI[EnchantmentNameParts.llIIIIIIlIlIll[0]].split(EnchantmentNameParts.llIIIIIIlIlIlI[EnchantmentNameParts.llIIIIIIlIlIll[1]]);
    }
    
    public static EnchantmentNameParts getInstance() {
        return EnchantmentNameParts.instance;
    }
    
    public String generateNewRandomName() {
        final int llllllllllllIlllIlllllIlIIlIlIlI = this.rand.nextInt(EnchantmentNameParts.llIIIIIIlIlIll[2]) + EnchantmentNameParts.llIIIIIIlIlIll[3];
        String llllllllllllIlllIlllllIlIIlIlIIl = EnchantmentNameParts.llIIIIIIlIlIlI[EnchantmentNameParts.llIIIIIIlIlIll[2]];
        int llllllllllllIlllIlllllIlIIlIlIII = EnchantmentNameParts.llIIIIIIlIlIll[0];
        "".length();
        if (((0x91 ^ 0x8E ^ (0xA3 ^ 0xBA)) & (138 + 94 - 140 + 56 ^ 50 + 58 + 38 + 0 ^ -" ".length())) < 0) {
            return null;
        }
        while (!lIIIIllIllllIlII(llllllllllllIlllIlllllIlIIlIlIII, llllllllllllIlllIlllllIlIIlIlIlI)) {
            if (lIIIIllIllllIIll(llllllllllllIlllIlllllIlIIlIlIII)) {
                llllllllllllIlllIlllllIlIIlIlIIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllIlllllIlIIlIlIIl)).append(EnchantmentNameParts.llIIIIIIlIlIlI[EnchantmentNameParts.llIIIIIIlIlIll[3]]));
            }
            llllllllllllIlllIlllllIlIIlIlIIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllIlllllIlIIlIlIIl)).append(this.namePartsArray[this.rand.nextInt(this.namePartsArray.length)]));
            ++llllllllllllIlllIlllllIlIIlIlIII;
        }
        return llllllllllllIlllIlllllIlIIlIlIIl;
    }
    
    private static boolean lIIIIllIllllIlIl(final int llllllllllllIlllIlllllIIllllIIlI, final int llllllllllllIlllIlllllIIllllIIIl) {
        return llllllllllllIlllIlllllIIllllIIlI < llllllllllllIlllIlllllIIllllIIIl;
    }
    
    static {
        lIIIIllIllllIIlI();
        lIIIIllIllllIIIl();
        instance = new EnchantmentNameParts();
    }
    
    private static void lIIIIllIllllIIIl() {
        (llIIIIIIlIlIlI = new String[EnchantmentNameParts.llIIIIIIlIlIll[4]])[EnchantmentNameParts.llIIIIIIlIlIll[0]] = lIIIIllIlllIllll("ISA2eC05LDYqaCYrITckOTtzMyQ0KSctaDctITk8NGg9MSMhPXMgMS8yKngqOS0gK2g2PSErLXUkOj8gIWg3OTo+JjYrO3UuOiotdSk6KmgwKSEsIHU/MiwtJ2g7Nzx1LCEhaDYnPzxoIi0neCEyJjosLXU7PS0uM2g2NSo8LzQ9JnU8JDE7IWggMCcnPDY2aCY8IT08NiBzPiExLD89aDEtICw6OjFzMSU3PTZ4LzQkJTkmPDI2eC07Kzs5JiFoNSotMGg/MSU8PDY8aCcpPT8tdSc1eDw6PzIqLCZoOjY7PCw2eDslIDYqLXUrJjotdTs2NC51JycwLSdoMTkkOWg+PSYhKT94OD0xIDErNCRzPzo6P3MrICchPTNoMS0+NyZ1LT89JTAmJzkkdTsjMTo8PHM5JjwlMjRoNjo2OTwgOjZ4KjApICxoPT0+OSY6ITd4PTssNjksdS4hPTs9aCAsKTktcw==", "UHSXH");
        EnchantmentNameParts.llIIIIIIlIlIlI[EnchantmentNameParts.llIIIIIIlIlIll[1]] = lIIIIllIllllIIII("mXPP3/5W1vE=", "NfNca");
        EnchantmentNameParts.llIIIIIIlIlIlI[EnchantmentNameParts.llIIIIIIlIlIll[2]] = lIIIIllIlllIllll("", "KaVUI");
        EnchantmentNameParts.llIIIIIIlIlIlI[EnchantmentNameParts.llIIIIIIlIlIll[3]] = lIIIIllIllllIIII("3SAP5CWhgoo=", "ktlXc");
    }
    
    private static String lIIIIllIllllIIII(final String llllllllllllIlllIlllllIIllllllII, final String llllllllllllIlllIlllllIIllllllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlllllIlIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllllIIllllllIl.getBytes(StandardCharsets.UTF_8)), EnchantmentNameParts.llIIIIIIlIlIll[5]), "DES");
            final Cipher llllllllllllIlllIlllllIlIIIIIIII = Cipher.getInstance("DES");
            llllllllllllIlllIlllllIlIIIIIIII.init(EnchantmentNameParts.llIIIIIIlIlIll[2], llllllllllllIlllIlllllIlIIIIIIIl);
            return new String(llllllllllllIlllIlllllIlIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllllIIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllllIIllllllll) {
            llllllllllllIlllIlllllIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIllIlllIllll(String llllllllllllIlllIlllllIlIIIIlllI, final String llllllllllllIlllIlllllIlIIIlIIlI) {
        llllllllllllIlllIlllllIlIIIIlllI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlllllIlIIIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlllllIlIIIlIIIl = new StringBuilder();
        final char[] llllllllllllIlllIlllllIlIIIlIIII = llllllllllllIlllIlllllIlIIIlIIlI.toCharArray();
        int llllllllllllIlllIlllllIlIIIIllll = EnchantmentNameParts.llIIIIIIlIlIll[0];
        final int llllllllllllIlllIlllllIlIIIIlIIl = (Object)((String)llllllllllllIlllIlllllIlIIIIlllI).toCharArray();
        final double llllllllllllIlllIlllllIlIIIIlIII = llllllllllllIlllIlllllIlIIIIlIIl.length;
        float llllllllllllIlllIlllllIlIIIIIlll = EnchantmentNameParts.llIIIIIIlIlIll[0];
        while (lIIIIllIllllIlIl((int)llllllllllllIlllIlllllIlIIIIIlll, (int)llllllllllllIlllIlllllIlIIIIlIII)) {
            final char llllllllllllIlllIlllllIlIIIlIlII = llllllllllllIlllIlllllIlIIIIlIIl[llllllllllllIlllIlllllIlIIIIIlll];
            llllllllllllIlllIlllllIlIIIlIIIl.append((char)(llllllllllllIlllIlllllIlIIIlIlII ^ llllllllllllIlllIlllllIlIIIlIIII[llllllllllllIlllIlllllIlIIIIllll % llllllllllllIlllIlllllIlIIIlIIII.length]));
            "".length();
            ++llllllllllllIlllIlllllIlIIIIllll;
            ++llllllllllllIlllIlllllIlIIIIIlll;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllllIlIIIlIIIl);
    }
    
    private static boolean lIIIIllIllllIIll(final int llllllllllllIlllIlllllIIlllIllll) {
        return llllllllllllIlllIlllllIIlllIllll > 0;
    }
    
    private static boolean lIIIIllIllllIlII(final int llllllllllllIlllIlllllIIllllIllI, final int llllllllllllIlllIlllllIIllllIlIl) {
        return llllllllllllIlllIlllllIIllllIllI >= llllllllllllIlllIlllllIIllllIlIl;
    }
    
    private static void lIIIIllIllllIIlI() {
        (llIIIIIIlIlIll = new int[6])[0] = ((0x4F ^ 0x7D ^ (0x96 ^ 0xBE)) & (0x71 ^ 0x1C ^ (0xEB ^ 0x9C) ^ -" ".length()));
        EnchantmentNameParts.llIIIIIIlIlIll[1] = " ".length();
        EnchantmentNameParts.llIIIIIIlIlIll[2] = "  ".length();
        EnchantmentNameParts.llIIIIIIlIlIll[3] = "   ".length();
        EnchantmentNameParts.llIIIIIIlIlIll[4] = (0x7B ^ 0x2F ^ (0xD9 ^ 0x89));
        EnchantmentNameParts.llIIIIIIlIlIll[5] = (0x9C ^ 0x94);
    }
    
    public void reseedRandomGenerator(final long llllllllllllIlllIlllllIlIIlIIIII) {
        this.rand.setSeed(llllllllllllIlllIlllllIlIIlIIIII);
    }
}
