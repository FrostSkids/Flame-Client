// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnumChatFormatting;

public enum EnumRarity
{
    private static final /* synthetic */ int[] llIllIIIlIIlIl;
    
    EPIC(EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[6]], EnumRarity.llIllIIIlIIlIl[3], EnumChatFormatting.LIGHT_PURPLE, EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[7]]), 
    UNCOMMON(EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[2]], EnumRarity.llIllIIIlIIlIl[1], EnumChatFormatting.YELLOW, EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[3]]);
    
    private static final /* synthetic */ String[] llIllIIIlIIIll;
    
    RARE(EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[4]], EnumRarity.llIllIIIlIIlIl[2], EnumChatFormatting.AQUA, EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[5]]);
    
    public final /* synthetic */ EnumChatFormatting rarityColor;
    
    COMMON(EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[0]], EnumRarity.llIllIIIlIIlIl[0], EnumChatFormatting.WHITE, EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[1]]);
    
    public final /* synthetic */ String rarityName;
    
    private static boolean lIIlIllIIllllIlI(final int llllllllllllIllIlIIIIIIllllIllII, final int llllllllllllIllIlIIIIIIllllIlIll) {
        return llllllllllllIllIlIIIIIIllllIllII < llllllllllllIllIlIIIIIIllllIlIll;
    }
    
    private static String lIIlIllIIlllIlII(final String llllllllllllIllIlIIIIIIlllllIlII, final String llllllllllllIllIlIIIIIIlllllIIll) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIIIlllllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIIIlllllIIll.getBytes(StandardCharsets.UTF_8)), EnumRarity.llIllIIIlIIlIl[8]), "DES");
            final Cipher llllllllllllIllIlIIIIIIlllllIllI = Cipher.getInstance("DES");
            llllllllllllIllIlIIIIIIlllllIllI.init(EnumRarity.llIllIIIlIIlIl[2], llllllllllllIllIlIIIIIIlllllIlll);
            return new String(llllllllllllIllIlIIIIIIlllllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIIIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIIIlllllIlIl) {
            llllllllllllIllIlIIIIIIlllllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIllIIlllIIll(final String llllllllllllIllIlIIIIIlIIIIIIIIl, final String llllllllllllIllIlIIIIIlIIIIIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIIlIIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIIlIIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIIIIlIIIIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIIIIlIIIIIIIll.init(EnumRarity.llIllIIIlIIlIl[2], llllllllllllIllIlIIIIIlIIIIIIlII);
            return new String(llllllllllllIllIlIIIIIlIIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIIlIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIIlIIIIIIIlI) {
            llllllllllllIllIlIIIIIlIIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIllIIllllIIl();
        lIIlIllIIlllIllI();
        final EnumRarity[] enum$VALUES = new EnumRarity[EnumRarity.llIllIIIlIIlIl[4]];
        enum$VALUES[EnumRarity.llIllIIIlIIlIl[0]] = EnumRarity.COMMON;
        enum$VALUES[EnumRarity.llIllIIIlIIlIl[1]] = EnumRarity.UNCOMMON;
        enum$VALUES[EnumRarity.llIllIIIlIIlIl[2]] = EnumRarity.RARE;
        enum$VALUES[EnumRarity.llIllIIIlIIlIl[3]] = EnumRarity.EPIC;
        ENUM$VALUES = enum$VALUES;
    }
    
    private EnumRarity(final String llllllllllllIllIlIIIIIlIIIlIllII, final int llllllllllllIllIlIIIIIlIIIlIlIll, final EnumChatFormatting llllllllllllIllIlIIIIIlIIIlIlIlI, final String llllllllllllIllIlIIIIIlIIIlIlIIl) {
        this.rarityColor = llllllllllllIllIlIIIIIlIIIlIlIlI;
        this.rarityName = llllllllllllIllIlIIIIIlIIIlIlIIl;
    }
    
    private static void lIIlIllIIlllIllI() {
        (llIllIIIlIIIll = new String[EnumRarity.llIllIIIlIIlIl[8]])[EnumRarity.llIllIIIlIIlIl[0]] = lIIlIllIIlllIIll("gDKVFIP/h3E=", "lKOBr");
        EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[1]] = lIIlIllIIlllIIll("pp+uyeVqA5k=", "bIcNY");
        EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[2]] = lIIlIllIIlllIlII("53nCUMomaGePFx7Xb0ESFA==", "pccST");
        EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[3]] = lIIlIllIIlllIIll("BL5xgomOGoTzhLgm9vQ4Cw==", "zzEye");
        EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[4]] = lIIlIllIIlllIIll("xa/QCWCI6mg=", "jdxXC");
        EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[5]] = lIIlIllIIlllIlII("blHzS4ZobjE=", "uEOOy");
        EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[6]] = lIIlIllIIlllIlIl("BwkOFg==", "BYGUK");
        EnumRarity.llIllIIIlIIIll[EnumRarity.llIllIIIlIIlIl[7]] = lIIlIllIIlllIlIl("PxgNDQ==", "zhdnH");
    }
    
    private static void lIIlIllIIllllIIl() {
        (llIllIIIlIIlIl = new int[9])[0] = ((0x7E ^ 0x16 ^ (0x71 ^ 0x54)) & (53 + 78 - 101 + 107 ^ 15 + 23 + 43 + 115 ^ -" ".length()));
        EnumRarity.llIllIIIlIIlIl[1] = " ".length();
        EnumRarity.llIllIIIlIIlIl[2] = "  ".length();
        EnumRarity.llIllIIIlIIlIl[3] = "   ".length();
        EnumRarity.llIllIIIlIIlIl[4] = (0x4 ^ 0x35 ^ (0x56 ^ 0x63));
        EnumRarity.llIllIIIlIIlIl[5] = (" ".length() ^ (0x53 ^ 0x57));
        EnumRarity.llIllIIIlIIlIl[6] = (0x95 ^ 0x93);
        EnumRarity.llIllIIIlIIlIl[7] = ("   ".length() ^ (0xF ^ 0xB));
        EnumRarity.llIllIIIlIIlIl[8] = (0x5 ^ 0xD);
    }
    
    private static String lIIlIllIIlllIlIl(String llllllllllllIllIlIIIIIlIIIIlIIIl, final String llllllllllllIllIlIIIIIlIIIIlIlIl) {
        llllllllllllIllIlIIIIIlIIIIlIIIl = new String(Base64.getDecoder().decode(llllllllllllIllIlIIIIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIIIlIIIIlIlII = new StringBuilder();
        final char[] llllllllllllIllIlIIIIIlIIIIlIIll = llllllllllllIllIlIIIIIlIIIIlIlIl.toCharArray();
        int llllllllllllIllIlIIIIIlIIIIlIIlI = EnumRarity.llIllIIIlIIlIl[0];
        final float llllllllllllIllIlIIIIIlIIIIIllII = (Object)llllllllllllIllIlIIIIIlIIIIlIIIl.toCharArray();
        final char llllllllllllIllIlIIIIIlIIIIIlIll = (char)llllllllllllIllIlIIIIIlIIIIIllII.length;
        char llllllllllllIllIlIIIIIlIIIIIlIlI = (char)EnumRarity.llIllIIIlIIlIl[0];
        while (lIIlIllIIllllIlI(llllllllllllIllIlIIIIIlIIIIIlIlI, llllllllllllIllIlIIIIIlIIIIIlIll)) {
            final char llllllllllllIllIlIIIIIlIIIIlIlll = llllllllllllIllIlIIIIIlIIIIIllII[llllllllllllIllIlIIIIIlIIIIIlIlI];
            llllllllllllIllIlIIIIIlIIIIlIlII.append((char)(llllllllllllIllIlIIIIIlIIIIlIlll ^ llllllllllllIllIlIIIIIlIIIIlIIll[llllllllllllIllIlIIIIIlIIIIlIIlI % llllllllllllIllIlIIIIIlIIIIlIIll.length]));
            "".length();
            ++llllllllllllIllIlIIIIIlIIIIlIIlI;
            ++llllllllllllIllIlIIIIIlIIIIIlIlI;
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIIIlIIIIlIlII);
    }
}
