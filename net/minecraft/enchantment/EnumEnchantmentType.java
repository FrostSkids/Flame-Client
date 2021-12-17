// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemTool;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public enum EnumEnchantmentType
{
    WEAPON(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[6]], EnumEnchantmentType.llIlllIllIlllI[6]), 
    BOW(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[10]], EnumEnchantmentType.llIlllIllIlllI[10]), 
    ALL(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[0]], EnumEnchantmentType.llIlllIllIlllI[0]), 
    ARMOR_TORSO(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[4]], EnumEnchantmentType.llIlllIllIlllI[4]), 
    ARMOR_HEAD(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[5]], EnumEnchantmentType.llIlllIllIlllI[5]);
    
    private static final /* synthetic */ String[] llIlllIllIllIl;
    
    BREAKABLE(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[9]], EnumEnchantmentType.llIlllIllIlllI[9]), 
    DIGGER(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[7]], EnumEnchantmentType.llIlllIllIlllI[7]);
    
    private static final /* synthetic */ int[] llIlllIllIlllI;
    
    ARMOR(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[1]], EnumEnchantmentType.llIlllIllIlllI[1]), 
    ARMOR_LEGS(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[3]], EnumEnchantmentType.llIlllIllIlllI[3]), 
    FISHING_ROD(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[8]], EnumEnchantmentType.llIlllIllIlllI[8]), 
    ARMOR_FEET(EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[2]], EnumEnchantmentType.llIlllIllIlllI[2]);
    
    static {
        lIIllIlIIIlIIIII();
        lIIllIlIIIIlllll();
        final EnumEnchantmentType[] enum$VALUES = new EnumEnchantmentType[EnumEnchantmentType.llIlllIllIlllI[11]];
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[0]] = EnumEnchantmentType.ALL;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[1]] = EnumEnchantmentType.ARMOR;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[2]] = EnumEnchantmentType.ARMOR_FEET;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[3]] = EnumEnchantmentType.ARMOR_LEGS;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[4]] = EnumEnchantmentType.ARMOR_TORSO;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[5]] = EnumEnchantmentType.ARMOR_HEAD;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[6]] = EnumEnchantmentType.WEAPON;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[7]] = EnumEnchantmentType.DIGGER;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[8]] = EnumEnchantmentType.FISHING_ROD;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[9]] = EnumEnchantmentType.BREAKABLE;
        enum$VALUES[EnumEnchantmentType.llIlllIllIlllI[10]] = EnumEnchantmentType.BOW;
        ENUM$VALUES = enum$VALUES;
    }
    
    private static boolean lIIllIlIIIlIIIIl(final Object llllllllllllIllIIlIIIIlIllllIIlI, final Object llllllllllllIllIIlIIIIlIllllIIIl) {
        return llllllllllllIllIIlIIIIlIllllIIlI == llllllllllllIllIIlIIIIlIllllIIIl;
    }
    
    private EnumEnchantmentType(final String llllllllllllIllIIlIIIIllIlIIIIIl, final int llllllllllllIllIIlIIIIllIlIIIIII) {
    }
    
    private static String lIIllIlIIIIlllII(final String llllllllllllIllIIlIIIIllIIlIIlll, final String llllllllllllIllIIlIIIIllIIlIIlII) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIIllIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIIllIIlIIlII.getBytes(StandardCharsets.UTF_8)), EnumEnchantmentType.llIlllIllIlllI[8]), "DES");
            final Cipher llllllllllllIllIIlIIIIllIIlIlIIl = Cipher.getInstance("DES");
            llllllllllllIllIIlIIIIllIIlIlIIl.init(EnumEnchantmentType.llIlllIllIlllI[2], llllllllllllIllIIlIIIIllIIlIlIlI);
            return new String(llllllllllllIllIIlIIIIllIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIIllIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIIllIIlIlIII) {
            llllllllllllIllIIlIIIIllIIlIlIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIllIlIIIIlllll() {
        (llIlllIllIllIl = new String[EnumEnchantmentType.llIlllIllIlllI[11]])[EnumEnchantmentType.llIlllIllIlllI[0]] = lIIllIlIIIIlllII("FUWMNN62G5k=", "dIOWk");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[1]] = lIIllIlIIIIlllII("9yTiCQfMqZM=", "WGpCn");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[2]] = lIIllIlIIIIlllIl("LCMOOCMyNwYyJQ==", "mqCwq");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[3]] = lIIllIlIIIIllllI("UEnsKXOcegggI+He8cWj1A==", "YKxeG");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[4]] = lIIllIlIIIIlllIl("GQAOGAsHBgwFChc=", "XRCWY");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[5]] = lIIllIlIIIIllllI("fedWFb1rrdLEYi3FdIyd1g==", "FPaal");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[6]] = lIIllIlIIIIlllIl("DRwFMxoU", "ZYDcU");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[7]] = lIIllIlIIIIlllIl("KCYTLgs+", "loTiN");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[8]] = lIIllIlIIIIllllI("QmSnV4chuIYKnh+ma78IPQ==", "xxvJd");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[9]] = lIIllIlIIIIlllIl("Oxs9MC44CzQ0", "yIxqe");
        EnumEnchantmentType.llIlllIllIllIl[EnumEnchantmentType.llIlllIllIlllI[10]] = lIIllIlIIIIllllI("MHLbCGBaobI=", "mFWeK");
    }
    
    private static boolean lIIllIlIIIlIIlII(final int llllllllllllIllIIlIIIIlIlllllIlI, final int llllllllllllIllIIlIIIIlIlllllIIl) {
        return llllllllllllIllIIlIIIIlIlllllIlI == llllllllllllIllIIlIIIIlIlllllIIl;
    }
    
    private static String lIIllIlIIIIllllI(final String llllllllllllIllIIlIIIIllIIIllIII, final String llllllllllllIllIIlIIIIllIIIllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIIllIIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIIllIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIIIllIIIlllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIIIllIIIlllII.init(EnumEnchantmentType.llIlllIllIlllI[2], llllllllllllIllIIlIIIIllIIIlllIl);
            return new String(llllllllllllIllIIlIIIIllIIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIIllIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIIllIIIllIll) {
            llllllllllllIllIIlIIIIllIIIllIll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIlIIIIlllIl(String llllllllllllIllIIlIIIIllIIIIIlIl, final String llllllllllllIllIIlIIIIllIIIIIlII) {
        llllllllllllIllIIlIIIIllIIIIIlIl = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIIIIllIIIIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIIIllIIIIlIII = new StringBuilder();
        final char[] llllllllllllIllIIlIIIIllIIIIIlll = llllllllllllIllIIlIIIIllIIIIIlII.toCharArray();
        int llllllllllllIllIIlIIIIllIIIIIllI = EnumEnchantmentType.llIlllIllIlllI[0];
        final char llllllllllllIllIIlIIIIllIIIIIIII = (Object)((String)llllllllllllIllIIlIIIIllIIIIIlIl).toCharArray();
        final boolean llllllllllllIllIIlIIIIlIllllllll = llllllllllllIllIIlIIIIllIIIIIIII.length != 0;
        short llllllllllllIllIIlIIIIlIlllllllI = (short)EnumEnchantmentType.llIlllIllIlllI[0];
        while (lIIllIlIIIlIIlIl(llllllllllllIllIIlIIIIlIlllllllI, llllllllllllIllIIlIIIIlIllllllll ? 1 : 0)) {
            final char llllllllllllIllIIlIIIIllIIIIlIll = llllllllllllIllIIlIIIIllIIIIIIII[llllllllllllIllIIlIIIIlIlllllllI];
            llllllllllllIllIIlIIIIllIIIIlIII.append((char)(llllllllllllIllIIlIIIIllIIIIlIll ^ llllllllllllIllIIlIIIIllIIIIIlll[llllllllllllIllIIlIIIIllIIIIIllI % llllllllllllIllIIlIIIIllIIIIIlll.length]));
            "".length();
            ++llllllllllllIllIIlIIIIllIIIIIllI;
            ++llllllllllllIllIIlIIIIlIlllllllI;
            "".length();
            if (((0x2E ^ 0x69) & ~(0x55 ^ 0x12)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIIIllIIIIlIII);
    }
    
    private static boolean lIIllIlIIIlIIIlI(final int llllllllllllIllIIlIIIIlIlllIllll) {
        return llllllllllllIllIIlIIIIlIlllIllll != 0;
    }
    
    public boolean canEnchantItem(final Item llllllllllllIllIIlIIIIllIIlllIII) {
        if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.ALL)) {
            return EnumEnchantmentType.llIlllIllIlllI[1] != 0;
        }
        if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.BREAKABLE) && lIIllIlIIIlIIIlI(llllllllllllIllIIlIIIIllIIlllIII.isDamageable() ? 1 : 0)) {
            return EnumEnchantmentType.llIlllIllIlllI[1] != 0;
        }
        if (!lIIllIlIIIlIIIlI((llllllllllllIllIIlIIIIllIIlllIII instanceof ItemArmor) ? 1 : 0)) {
            int n;
            if (lIIllIlIIIlIIIlI((llllllllllllIllIIlIIIIllIIlllIII instanceof ItemSword) ? 1 : 0)) {
                if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.WEAPON)) {
                    n = EnumEnchantmentType.llIlllIllIlllI[1];
                    "".length();
                    if ((0x7D ^ 0x69 ^ (0xB4 ^ 0xA5)) == 0x0) {
                        return ((0x3D ^ 0x2B ^ (0x0 ^ 0x5D)) & (0xBA ^ 0xBD ^ (0xCF ^ 0x83) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = EnumEnchantmentType.llIlllIllIlllI[0];
                    "".length();
                    if ("  ".length() == -" ".length()) {
                        return ((0x50 ^ 0x54) & ~(0x71 ^ 0x75)) != 0x0;
                    }
                }
            }
            else if (lIIllIlIIIlIIIlI((llllllllllllIllIIlIIIIllIIlllIII instanceof ItemTool) ? 1 : 0)) {
                if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.DIGGER)) {
                    n = EnumEnchantmentType.llIlllIllIlllI[1];
                    "".length();
                    if ("  ".length() <= 0) {
                        return ((0xC1 ^ 0x87) & ~(0x3B ^ 0x7D)) != 0x0;
                    }
                }
                else {
                    n = EnumEnchantmentType.llIlllIllIlllI[0];
                    "".length();
                    if (((0xB6 ^ 0x8B ^ (0x2A ^ 0x44)) & (0x25 ^ 0x41 ^ (0x17 ^ 0x20) ^ -" ".length())) != 0x0) {
                        return ((180 + 67 - 103 + 64 ^ 140 + 118 - 144 + 27) & (0xA ^ 0x31 ^ (0x1 ^ 0x67) ^ -" ".length())) != 0x0;
                    }
                }
            }
            else if (lIIllIlIIIlIIIlI((llllllllllllIllIIlIIIIllIIlllIII instanceof ItemBow) ? 1 : 0)) {
                if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.BOW)) {
                    n = EnumEnchantmentType.llIlllIllIlllI[1];
                    "".length();
                    if (((0x3A ^ 0x22) & ~(0x11 ^ 0x9)) != ((0x39 ^ 0x26) & ~(0xB9 ^ 0xA6))) {
                        return ((0x70 ^ 0x64) & ~(0x54 ^ 0x40)) != 0x0;
                    }
                }
                else {
                    n = EnumEnchantmentType.llIlllIllIlllI[0];
                    "".length();
                    if (-"   ".length() > 0) {
                        return ((9 + 167 - 34 + 26 ^ 125 + 166 - 180 + 66) & (0x73 ^ 0x6F ^ (0x36 ^ 0x33) ^ -" ".length())) != 0x0;
                    }
                }
            }
            else if (lIIllIlIIIlIIIlI((llllllllllllIllIIlIIIIllIIlllIII instanceof ItemFishingRod) ? 1 : 0)) {
                if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.FISHING_ROD)) {
                    n = EnumEnchantmentType.llIlllIllIlllI[1];
                    "".length();
                    if (" ".length() <= 0) {
                        return ((117 + 33 - 71 + 86 ^ 80 + 54 + 4 + 31) & (14 + 103 - 86 + 99 ^ 81 + 107 - 68 + 22 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = EnumEnchantmentType.llIlllIllIlllI[0];
                    "".length();
                    if (-"   ".length() > 0) {
                        return ((0x48 ^ 0x71) & ~(0x90 ^ 0xA9)) != 0x0;
                    }
                }
            }
            else {
                n = EnumEnchantmentType.llIlllIllIlllI[0];
            }
            return n != 0;
        }
        if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.ARMOR)) {
            return EnumEnchantmentType.llIlllIllIlllI[1] != 0;
        }
        final ItemArmor llllllllllllIllIIlIIIIllIIlllIlI = (ItemArmor)llllllllllllIllIIlIIIIllIIlllIII;
        int n2;
        if (lIIllIlIIIlIIIll(llllllllllllIllIIlIIIIllIIlllIlI.armorType)) {
            if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.ARMOR_HEAD)) {
                n2 = EnumEnchantmentType.llIlllIllIlllI[1];
                "".length();
                if ("   ".length() <= 0) {
                    return ((0x3A ^ 0x7C ^ (0x73 ^ 0x3B)) & (9 + 136 - 49 + 66 ^ 48 + 113 - 78 + 89 ^ -" ".length())) != 0x0;
                }
            }
            else {
                n2 = EnumEnchantmentType.llIlllIllIlllI[0];
                "".length();
                if (null != null) {
                    return ((0x73 ^ 0x61 ^ (0x19 ^ 0x26)) & (0xD9 ^ 0x81 ^ (0xF8 ^ 0x8D) ^ -" ".length())) != 0x0;
                }
            }
        }
        else if (lIIllIlIIIlIIlII(llllllllllllIllIIlIIIIllIIlllIlI.armorType, EnumEnchantmentType.llIlllIllIlllI[2])) {
            if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.ARMOR_LEGS)) {
                n2 = EnumEnchantmentType.llIlllIllIlllI[1];
                "".length();
                if (" ".length() >= "  ".length()) {
                    return ((0x30 ^ 0xE) & ~(0xAE ^ 0x90)) != 0x0;
                }
            }
            else {
                n2 = EnumEnchantmentType.llIlllIllIlllI[0];
                "".length();
                if (-" ".length() > 0) {
                    return ((0xCC ^ 0xAD ^ (0xBF ^ 0x88)) & (0x7 ^ 0x49 ^ (0x3A ^ 0x22) ^ -" ".length())) != 0x0;
                }
            }
        }
        else if (lIIllIlIIIlIIlII(llllllllllllIllIIlIIIIllIIlllIlI.armorType, EnumEnchantmentType.llIlllIllIlllI[1])) {
            if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.ARMOR_TORSO)) {
                n2 = EnumEnchantmentType.llIlllIllIlllI[1];
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0xA9 ^ 0xC3 ^ (0x6C ^ 0x19)) & (0x45 ^ 0x17 ^ (0xE4 ^ 0xA9) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n2 = EnumEnchantmentType.llIlllIllIlllI[0];
                "".length();
                if (((0x13 ^ 0x30) & ~(0x36 ^ 0x15)) < 0) {
                    return ((0xBA ^ 0xA2) & ~(0xBF ^ 0xA7)) != 0x0;
                }
            }
        }
        else if (lIIllIlIIIlIIlII(llllllllllllIllIIlIIIIllIIlllIlI.armorType, EnumEnchantmentType.llIlllIllIlllI[3])) {
            if (lIIllIlIIIlIIIIl(this, EnumEnchantmentType.ARMOR_FEET)) {
                n2 = EnumEnchantmentType.llIlllIllIlllI[1];
                "".length();
                if (((0x4B ^ 0x1C) & ~(0xC7 ^ 0x90)) != ((0x6C ^ 0x22) & ~(0xF1 ^ 0xBF))) {
                    return ((0x48 ^ 0x14) & ~(0x2F ^ 0x73)) != 0x0;
                }
            }
            else {
                n2 = EnumEnchantmentType.llIlllIllIlllI[0];
                "".length();
                if (((0x41 ^ 0x13 ^ (0x56 ^ 0x3E)) & (0xA2 ^ 0xB5 ^ (0x58 ^ 0x75) ^ -" ".length())) != 0x0) {
                    return ((41 + 1 + 22 + 78 ^ 9 + 59 - 35 + 162) & (0x3D ^ 0x39 ^ (0xDB ^ 0x92) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            n2 = EnumEnchantmentType.llIlllIllIlllI[0];
        }
        return n2 != 0;
    }
    
    private static void lIIllIlIIIlIIIII() {
        (llIlllIllIlllI = new int[12])[0] = ((127 + 168 - 183 + 139 ^ 4 + 18 - 18 + 173) & (34 + 26 + 35 + 127 ^ 144 + 26 - 162 + 140 ^ -" ".length()));
        EnumEnchantmentType.llIlllIllIlllI[1] = " ".length();
        EnumEnchantmentType.llIlllIllIlllI[2] = "  ".length();
        EnumEnchantmentType.llIlllIllIlllI[3] = "   ".length();
        EnumEnchantmentType.llIlllIllIlllI[4] = (0x63 ^ 0x67);
        EnumEnchantmentType.llIlllIllIlllI[5] = (0x8 ^ 0xD);
        EnumEnchantmentType.llIlllIllIlllI[6] = (0x58 ^ 0x5C ^ "  ".length());
        EnumEnchantmentType.llIlllIllIlllI[7] = (0x19 ^ 0x1E);
        EnumEnchantmentType.llIlllIllIlllI[8] = (97 + 39 - 31 + 61 ^ 75 + 14 + 17 + 68);
        EnumEnchantmentType.llIlllIllIlllI[9] = (0x5E ^ 0x3D ^ (0x4A ^ 0x20));
        EnumEnchantmentType.llIlllIllIlllI[10] = (0x54 ^ 0x5E);
        EnumEnchantmentType.llIlllIllIlllI[11] = (59 + 13 - 62 + 169 ^ 145 + 36 + 3 + 0);
    }
    
    private static boolean lIIllIlIIIlIIIll(final int llllllllllllIllIIlIIIIlIlllIllIl) {
        return llllllllllllIllIIlIIIIlIlllIllIl == 0;
    }
    
    private static boolean lIIllIlIIIlIIlIl(final int llllllllllllIllIIlIIIIlIllllIllI, final int llllllllllllIllIIlIIIIlIllllIlIl) {
        return llllllllllllIllIIlIIIIlIllllIllI < llllllllllllIllIIlIIIIlIllllIlIl;
    }
}
