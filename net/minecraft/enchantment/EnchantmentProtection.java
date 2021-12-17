// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.MathHelper;
import net.minecraft.util.DamageSource;

public class EnchantmentProtection extends Enchantment
{
    public final /* synthetic */ int protectionType;
    private static final /* synthetic */ int[] baseEnchantability;
    private static final /* synthetic */ int[] levelEnchantability;
    private static final /* synthetic */ String[] lIlIIlllIIIllI;
    private static final /* synthetic */ int[] lIlIIlllIllIIl;
    private static final /* synthetic */ String[] protectionName;
    private static final /* synthetic */ int[] thresholdEnchantability;
    
    @Override
    public int calcModifierDamage(final int lllllllllllllIIIlIlllllIIlIlIIII, final DamageSource lllllllllllllIIIlIlllllIIlIIllll) {
        if (lllIlIIlIllIlIl(lllllllllllllIIIlIlllllIIlIIllll.canHarmInCreative() ? 1 : 0)) {
            return EnchantmentProtection.lIlIIlllIllIIl[1];
        }
        final float lllllllllllllIIIlIlllllIIlIIlllI = (EnchantmentProtection.lIlIIlllIllIIl[9] + lllllllllllllIIIlIlllllIIlIlIIII * lllllllllllllIIIlIlllllIIlIlIIII) / 3.0f;
        int n;
        if (lllIlIIlIllIllI(this.protectionType)) {
            n = MathHelper.floor_float(lllllllllllllIIIlIlllllIIlIIlllI * 0.75f);
            "".length();
            if (((0x7A ^ 0x2E) & ~(0x22 ^ 0x76)) != 0x0) {
                return (0x35 ^ 0x7D) & ~(0x59 ^ 0x11);
            }
        }
        else if (lllIlIIlIllIlII(this.protectionType, EnchantmentProtection.lIlIIlllIllIIl[2]) && lllIlIIlIllIlIl(lllllllllllllIIIlIlllllIIlIIllll.isFireDamage() ? 1 : 0)) {
            n = MathHelper.floor_float(lllllllllllllIIIlIlllllIIlIIlllI * 1.25f);
            "".length();
            if (" ".length() == "   ".length()) {
                return (0x5D ^ 0x32 ^ (0x7 ^ 0x39)) & (0x3A ^ 0xB ^ (0x41 ^ 0x21) ^ -" ".length());
            }
        }
        else if (lllIlIIlIllIlII(this.protectionType, EnchantmentProtection.lIlIIlllIllIIl[3]) && lllIlIIlIllIlll(lllllllllllllIIIlIlllllIIlIIllll, DamageSource.fall)) {
            n = MathHelper.floor_float(lllllllllllllIIIlIlllllIIlIIlllI * 2.5f);
            "".length();
            if (-("  ".length() ^ (0xAF ^ 0xA9)) >= 0) {
                return " ".length() & (" ".length() ^ -" ".length());
            }
        }
        else if (lllIlIIlIllIlII(this.protectionType, EnchantmentProtection.lIlIIlllIllIIl[4]) && lllIlIIlIllIlIl(lllllllllllllIIIlIlllllIIlIIllll.isExplosion() ? 1 : 0)) {
            n = MathHelper.floor_float(lllllllllllllIIIlIlllllIIlIIlllI * 1.5f);
            "".length();
            if (((0x9C ^ 0x98) & ~(0x7C ^ 0x78)) < -" ".length()) {
                return (0x3D ^ 0x29) & ~(0x19 ^ 0xD);
            }
        }
        else if (lllIlIIlIllIlII(this.protectionType, EnchantmentProtection.lIlIIlllIllIIl[5]) && lllIlIIlIllIlIl(lllllllllllllIIIlIlllllIIlIIllll.isProjectile() ? 1 : 0)) {
            n = MathHelper.floor_float(lllllllllllllIIIlIlllllIIlIIlllI * 1.5f);
            "".length();
            if (-" ".length() > "  ".length()) {
                return (0x3F ^ 0x6) & ~(0x35 ^ 0xC);
            }
        }
        else {
            n = EnchantmentProtection.lIlIIlllIllIIl[1];
        }
        return n;
    }
    
    public EnchantmentProtection(final int lllllllllllllIIIlIlllllIIllIIllI, final ResourceLocation lllllllllllllIIIlIlllllIIllIIlIl, final int lllllllllllllIIIlIlllllIIllIIlII, final int lllllllllllllIIIlIlllllIIllIlIII) {
        super(lllllllllllllIIIlIlllllIIllIIllI, lllllllllllllIIIlIlllllIIllIIlIl, lllllllllllllIIIlIlllllIIllIIlII, EnumEnchantmentType.ARMOR);
        this.protectionType = lllllllllllllIIIlIlllllIIllIlIII;
        if (lllIlIIlIllIlII(lllllllllllllIIIlIlllllIIllIlIII, EnchantmentProtection.lIlIIlllIllIIl[3])) {
            this.type = EnumEnchantmentType.ARMOR_FEET;
        }
    }
    
    private static void lllIlIIlIllIIll() {
        (lIlIIlllIllIIl = new int[13])[0] = (0xB9 ^ 0xBC);
        EnchantmentProtection.lIlIIlllIllIIl[1] = ((0x21 ^ 0x3B) & ~(0x35 ^ 0x2F));
        EnchantmentProtection.lIlIIlllIllIIl[2] = " ".length();
        EnchantmentProtection.lIlIIlllIllIIl[3] = "  ".length();
        EnchantmentProtection.lIlIIlllIllIIl[4] = "   ".length();
        EnchantmentProtection.lIlIIlllIllIIl[5] = (0x43 ^ 0x47);
        EnchantmentProtection.lIlIIlllIllIIl[6] = (0x65 ^ 0x6F);
        EnchantmentProtection.lIlIIlllIllIIl[7] = (0xCC ^ 0xC7);
        EnchantmentProtection.lIlIIlllIllIIl[8] = (0x8B ^ 0xA3 ^ (0x65 ^ 0x45));
        EnchantmentProtection.lIlIIlllIllIIl[9] = (0x77 ^ 0x71);
        EnchantmentProtection.lIlIIlllIllIIl[10] = (0x87 ^ 0x93);
        EnchantmentProtection.lIlIIlllIllIIl[11] = (0x7B ^ 0x77);
        EnchantmentProtection.lIlIIlllIllIIl[12] = (0x73 ^ 0x7C);
    }
    
    private static boolean lllIlIIlIllIlII(final int lllllllllllllIIIlIllllIlllllIlll, final int lllllllllllllIIIlIllllIlllllIllI) {
        return lllllllllllllIIIlIllllIlllllIlll == lllllllllllllIIIlIllllIlllllIllI;
    }
    
    private static boolean lllIlIIlIllIlIl(final int lllllllllllllIIIlIllllIllllIllII) {
        return lllllllllllllIIIlIllllIllllIllII != 0;
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentProtection.lIlIIlllIllIIl[5];
    }
    
    @Override
    public int getMinEnchantability(final int lllllllllllllIIIlIlllllIIlIlllll) {
        return EnchantmentProtection.baseEnchantability[this.protectionType] + (lllllllllllllIIIlIlllllIIlIlllll - EnchantmentProtection.lIlIIlllIllIIl[2]) * EnchantmentProtection.levelEnchantability[this.protectionType];
    }
    
    private static boolean lllIlIIlIlllIIl(final int lllllllllllllIIIlIllllIllllIlIII) {
        return lllllllllllllIIIlIllllIllllIlIII > 0;
    }
    
    @Override
    public int getMaxEnchantability(final int lllllllllllllIIIlIlllllIIlIlIlll) {
        return this.getMinEnchantability(lllllllllllllIIIlIlllllIIlIlIlll) + EnchantmentProtection.thresholdEnchantability[this.protectionType];
    }
    
    public static int getFireTimeForEntity(final Entity lllllllllllllIIIlIlllllIIIlllIlI, int lllllllllllllIIIlIlllllIIIllIllI) {
        final int lllllllllllllIIIlIlllllIIIlllIII = EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.fireProtection.effectId, lllllllllllllIIIlIlllllIIIlllIlI.getInventory());
        if (lllIlIIlIlllIIl(lllllllllllllIIIlIlllllIIIlllIII)) {
            lllllllllllllIIIlIlllllIIIllIllI -= MathHelper.floor_float(lllllllllllllIIIlIlllllIIIllIllI * (float)lllllllllllllIIIlIlllllIIIlllIII * 0.15f);
        }
        return lllllllllllllIIIlIlllllIIIllIllI;
    }
    
    private static String lllIlIIIllIlIlI(final String lllllllllllllIIIlIlllllIIIIIlIlI, final String lllllllllllllIIIlIlllllIIIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlllllIIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlllllIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), EnchantmentProtection.lIlIIlllIllIIl[8]), "DES");
            final Cipher lllllllllllllIIIlIlllllIIIIIlllI = Cipher.getInstance("DES");
            lllllllllllllIIIlIlllllIIIIIlllI.init(EnchantmentProtection.lIlIIlllIllIIl[3], lllllllllllllIIIlIlllllIIIIIllll);
            return new String(lllllllllllllIIIlIlllllIIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlllllIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlllllIIIIIllIl) {
            lllllllllllllIIIlIlllllIIIIIllIl.printStackTrace();
            return null;
        }
    }
    
    public static double func_92092_a(final Entity lllllllllllllIIIlIlllllIIIlIlllI, double lllllllllllllIIIlIlllllIIIlIllIl) {
        final int lllllllllllllIIIlIlllllIIIlIllll = EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.blastProtection.effectId, lllllllllllllIIIlIlllllIIIlIlllI.getInventory());
        if (lllIlIIlIlllIIl(lllllllllllllIIIlIlllllIIIlIllll)) {
            lllllllllllllIIIlIlllllIIIlIllIl -= MathHelper.floor_double((double)(lllllllllllllIIIlIlllllIIIlIllIl * (double)(lllllllllllllIIIlIlllllIIIlIllll * 0.15f)));
        }
        return (double)lllllllllllllIIIlIlllllIIIlIllIl;
    }
    
    static {
        lllIlIIlIllIIll();
        lllIlIIIllIllII();
        final String[] protectionName2 = new String[EnchantmentProtection.lIlIIlllIllIIl[0]];
        protectionName2[EnchantmentProtection.lIlIIlllIllIIl[1]] = EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[1]];
        protectionName2[EnchantmentProtection.lIlIIlllIllIIl[2]] = EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[2]];
        protectionName2[EnchantmentProtection.lIlIIlllIllIIl[3]] = EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[3]];
        protectionName2[EnchantmentProtection.lIlIIlllIllIIl[4]] = EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[4]];
        protectionName2[EnchantmentProtection.lIlIIlllIllIIl[5]] = EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[5]];
        protectionName = protectionName2;
        final int[] baseEnchantability2 = new int[EnchantmentProtection.lIlIIlllIllIIl[0]];
        baseEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[1]] = EnchantmentProtection.lIlIIlllIllIIl[2];
        baseEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[2]] = EnchantmentProtection.lIlIIlllIllIIl[6];
        baseEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[3]] = EnchantmentProtection.lIlIIlllIllIIl[0];
        baseEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[4]] = EnchantmentProtection.lIlIIlllIllIIl[0];
        baseEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[5]] = EnchantmentProtection.lIlIIlllIllIIl[4];
        baseEnchantability = baseEnchantability2;
        final int[] levelEnchantability2 = new int[EnchantmentProtection.lIlIIlllIllIIl[0]];
        levelEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[1]] = EnchantmentProtection.lIlIIlllIllIIl[7];
        levelEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[2]] = EnchantmentProtection.lIlIIlllIllIIl[8];
        levelEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[3]] = EnchantmentProtection.lIlIIlllIllIIl[9];
        levelEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[4]] = EnchantmentProtection.lIlIIlllIllIIl[8];
        levelEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[5]] = EnchantmentProtection.lIlIIlllIllIIl[9];
        levelEnchantability = levelEnchantability2;
        final int[] thresholdEnchantability2 = new int[EnchantmentProtection.lIlIIlllIllIIl[0]];
        thresholdEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[1]] = EnchantmentProtection.lIlIIlllIllIIl[10];
        thresholdEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[2]] = EnchantmentProtection.lIlIIlllIllIIl[11];
        thresholdEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[3]] = EnchantmentProtection.lIlIIlllIllIIl[6];
        thresholdEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[4]] = EnchantmentProtection.lIlIIlllIllIIl[11];
        thresholdEnchantability2[EnchantmentProtection.lIlIIlllIllIIl[5]] = EnchantmentProtection.lIlIIlllIllIIl[12];
        thresholdEnchantability = thresholdEnchantability2;
    }
    
    private static boolean lllIlIIlIllIlll(final Object lllllllllllllIIIlIllllIllllIllll, final Object lllllllllllllIIIlIllllIllllIlllI) {
        return lllllllllllllIIIlIllllIllllIllll == lllllllllllllIIIlIllllIllllIlllI;
    }
    
    private static String lllIlIIIllIlIll(final String lllllllllllllIIIlIllllIlllllllll, final String lllllllllllllIIIlIllllIlllllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlllllIIIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllllIlllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlllllIIIIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlllllIIIIIIIIl.init(EnchantmentProtection.lIlIIlllIllIIl[3], lllllllllllllIIIlIlllllIIIIIIIlI);
            return new String(lllllllllllllIIIlIlllllIIIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllllIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlllllIIIIIIIII) {
            lllllllllllllIIIlIlllllIIIIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lllIlIIIllIllII() {
        (lIlIIlllIIIllI = new String[EnchantmentProtection.lIlIIlllIllIIl[9]])[EnchantmentProtection.lIlIIlllIllIIl[1]] = lllIlIIIllIlIIl("JiE5", "GMUEe");
        EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[2]] = lllIlIIIllIlIlI("YwUhv5P7QGQ=", "LKegn");
        EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[3]] = lllIlIIIllIlIll("+XVQHyzjbmI=", "NKxdN");
        EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[4]] = lllIlIIIllIlIIl("JwggHh0xGT8c", "BpPrr");
        EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[5]] = lllIlIIIllIlIll("R1Lvit2Bx923vH492+cbLg==", "DDxQi");
        EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[0]] = lllIlIIIllIlIlI("3E2bQF7EdkIjzuwqx+tesThA4W6HfGau", "EqLbf");
    }
    
    @Override
    public boolean canApplyTogether(final Enchantment lllllllllllllIIIlIlllllIIIllllll) {
        if (lllIlIIlIllIlIl((lllllllllllllIIIlIlllllIIIllllll instanceof EnchantmentProtection) ? 1 : 0)) {
            final EnchantmentProtection lllllllllllllIIIlIlllllIIlIIIIIl = (EnchantmentProtection)lllllllllllllIIIlIlllllIIIllllll;
            int n;
            if (lllIlIIlIllIlII(lllllllllllllIIIlIlllllIIlIIIIIl.protectionType, this.protectionType)) {
                n = EnchantmentProtection.lIlIIlllIllIIl[1];
                "".length();
                if (null != null) {
                    return (("  ".length() ^ (0x11 ^ 0x4C)) & (0x6D ^ 0x3 ^ (0xA6 ^ 0x97) ^ -" ".length())) != 0x0;
                }
            }
            else if (lllIlIIlIlllIII(this.protectionType, EnchantmentProtection.lIlIIlllIllIIl[3]) && lllIlIIlIlllIII(lllllllllllllIIIlIlllllIIlIIIIIl.protectionType, EnchantmentProtection.lIlIIlllIllIIl[3])) {
                n = EnchantmentProtection.lIlIIlllIllIIl[1];
                "".length();
                if ("   ".length() <= 0) {
                    return ((0x34 ^ 0x52 ^ (0xCD ^ 0x97)) & (0x25 ^ 0x57 ^ (0x1A ^ 0x54) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = EnchantmentProtection.lIlIIlllIllIIl[2];
            }
            return n != 0;
        }
        return super.canApplyTogether(lllllllllllllIIIlIlllllIIIllllll);
    }
    
    private static String lllIlIIIllIlIIl(String lllllllllllllIIIlIlllllIIIIlllII, final String lllllllllllllIIIlIlllllIIIIllIll) {
        lllllllllllllIIIlIlllllIIIIlllII = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlllllIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlllllIIIIlllll = new StringBuilder();
        final char[] lllllllllllllIIIlIlllllIIIIllllI = lllllllllllllIIIlIlllllIIIIllIll.toCharArray();
        int lllllllllllllIIIlIlllllIIIIlllIl = EnchantmentProtection.lIlIIlllIllIIl[1];
        final char lllllllllllllIIIlIlllllIIIIlIlll = (Object)lllllllllllllIIIlIlllllIIIIlllII.toCharArray();
        final int lllllllllllllIIIlIlllllIIIIlIllI = lllllllllllllIIIlIlllllIIIIlIlll.length;
        Exception lllllllllllllIIIlIlllllIIIIlIlIl = (Exception)EnchantmentProtection.lIlIIlllIllIIl[1];
        while (lllIlIIlIlllIlI((int)lllllllllllllIIIlIlllllIIIIlIlIl, lllllllllllllIIIlIlllllIIIIlIllI)) {
            final char lllllllllllllIIIlIlllllIIIlIIIlI = lllllllllllllIIIlIlllllIIIIlIlll[lllllllllllllIIIlIlllllIIIIlIlIl];
            lllllllllllllIIIlIlllllIIIIlllll.append((char)(lllllllllllllIIIlIlllllIIIlIIIlI ^ lllllllllllllIIIlIlllllIIIIllllI[lllllllllllllIIIlIlllllIIIIlllIl % lllllllllllllIIIlIlllllIIIIllllI.length]));
            "".length();
            ++lllllllllllllIIIlIlllllIIIIlllIl;
            ++lllllllllllllIIIlIlllllIIIIlIlIl;
            "".length();
            if (-(0x4A ^ 0x4E) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlllllIIIIlllll);
    }
    
    private static boolean lllIlIIlIllIllI(final int lllllllllllllIIIlIllllIllllIlIlI) {
        return lllllllllllllIIIlIllllIllllIlIlI == 0;
    }
    
    @Override
    public String getName() {
        return String.valueOf(new StringBuilder(EnchantmentProtection.lIlIIlllIIIllI[EnchantmentProtection.lIlIIlllIllIIl[0]]).append(EnchantmentProtection.protectionName[this.protectionType]));
    }
    
    private static boolean lllIlIIlIlllIlI(final int lllllllllllllIIIlIllllIlllllIIll, final int lllllllllllllIIIlIllllIlllllIIlI) {
        return lllllllllllllIIIlIllllIlllllIIll < lllllllllllllIIIlIllllIlllllIIlI;
    }
    
    private static boolean lllIlIIlIlllIII(final int lllllllllllllIIIlIllllIllllIIlIl, final int lllllllllllllIIIlIllllIllllIIlII) {
        return lllllllllllllIIIlIllllIllllIIlIl != lllllllllllllIIIlIllllIllllIIlII;
    }
}
