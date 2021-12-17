// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.util.ResourceLocation;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EnchantmentLootBonus extends Enchantment
{
    private static final /* synthetic */ String[] llIIIIlIIllIIl;
    private static final /* synthetic */ int[] llIIIIlIIlllII;
    
    private static void lIIIIlllllIlIlll() {
        (llIIIIlIIlllII = new int[8])[0] = ((0x66 ^ 0x29 ^ (0x8A ^ 0x9D)) & (101 + 41 + 12 + 79 ^ 76 + 164 - 153 + 90 ^ -" ".length()));
        EnchantmentLootBonus.llIIIIlIIlllII[1] = " ".length();
        EnchantmentLootBonus.llIIIIlIIlllII[2] = "  ".length();
        EnchantmentLootBonus.llIIIIlIIlllII[3] = (0x3D ^ 0x32);
        EnchantmentLootBonus.llIIIIlIIlllII[4] = (70 + 101 - 42 + 8 ^ 5 + 48 + 47 + 28);
        EnchantmentLootBonus.llIIIIlIIlllII[5] = (0x4F ^ 0x7D);
        EnchantmentLootBonus.llIIIIlIIlllII[6] = "   ".length();
        EnchantmentLootBonus.llIIIIlIIlllII[7] = (0xCE ^ 0xC6 ^ ((0x54 ^ 0x49) & ~(0x19 ^ 0x4)));
    }
    
    @Override
    public int getMinEnchantability(final int llllllllllllIlllIllIlllllllllIIl) {
        return EnchantmentLootBonus.llIIIIlIIlllII[3] + (llllllllllllIlllIllIlllllllllIIl - EnchantmentLootBonus.llIIIIlIIlllII[1]) * EnchantmentLootBonus.llIIIIlIIlllII[4];
    }
    
    private static String lIIIIlllllIIllII(final String llllllllllllIlllIllIllllllIlIlll, final String llllllllllllIlllIllIllllllIlIllI) {
        try {
            final SecretKeySpec llllllllllllIlllIllIllllllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIllllllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIllllllIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIllllllIllIIl.init(EnchantmentLootBonus.llIIIIlIIlllII[2], llllllllllllIlllIllIllllllIllIlI);
            return new String(llllllllllllIlllIllIllllllIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIllllllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIllllllIllIII) {
            llllllllllllIlllIllIllllllIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentLootBonus.llIIIIlIIlllII[6];
    }
    
    private static void lIIIIlllllIIllIl() {
        (llIIIIlIIllIIl = new String[EnchantmentLootBonus.llIIIIlIIlllII[6]])[EnchantmentLootBonus.llIIIIlIIlllII[0]] = lIIIIlllllIIlIll("M62J5YaOENBXsX2aosdL4g==", "jcezX");
        EnchantmentLootBonus.llIIIIlIIllIIl[EnchantmentLootBonus.llIIIIlIIlllII[1]] = lIIIIlllllIIlIll("lCY+RakUDI4A/gyX63SLFc2IjwNyDs82", "hhlvT");
        EnchantmentLootBonus.llIIIIlIIllIIl[EnchantmentLootBonus.llIIIIlIIlllII[2]] = lIIIIlllllIIllII("Fh0+6BV4iNorDdW94ArE1w==", "WJJXG");
    }
    
    private static String lIIIIlllllIIlIll(final String llllllllllllIlllIllIlllllllIIIlI, final String llllllllllllIlllIllIlllllllIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllIlllllllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIlllllllIIIIl.getBytes(StandardCharsets.UTF_8)), EnchantmentLootBonus.llIIIIlIIlllII[7]), "DES");
            final Cipher llllllllllllIlllIllIlllllllIIllI = Cipher.getInstance("DES");
            llllllllllllIlllIllIlllllllIIllI.init(EnchantmentLootBonus.llIIIIlIIlllII[2], llllllllllllIlllIllIlllllllIIlll);
            return new String(llllllllllllIlllIllIlllllllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIlllllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIlllllllIIlIl) {
            llllllllllllIlllIllIlllllllIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlllllIllIII(final Object llllllllllllIlllIllIllllllIIllll, final Object llllllllllllIlllIllIllllllIIlllI) {
        return llllllllllllIlllIllIllllllIIllll == llllllllllllIlllIllIllllllIIlllI;
    }
    
    static {
        lIIIIlllllIlIlll();
        lIIIIlllllIIllIl();
    }
    
    protected EnchantmentLootBonus(final int llllllllllllIlllIlllIIIIIIIIIlIl, final ResourceLocation llllllllllllIlllIllIllllllllllll, final int llllllllllllIlllIlllIIIIIIIIIIll, final EnumEnchantmentType llllllllllllIlllIllIllllllllllIl) {
        super(llllllllllllIlllIlllIIIIIIIIIlIl, llllllllllllIlllIllIllllllllllll, llllllllllllIlllIlllIIIIIIIIIIll, llllllllllllIlllIllIllllllllllIl);
        if (lIIIIlllllIllIII(llllllllllllIlllIllIllllllllllIl, EnumEnchantmentType.DIGGER)) {
            this.setName(EnchantmentLootBonus.llIIIIlIIllIIl[EnchantmentLootBonus.llIIIIlIIlllII[0]]);
            "".length();
            "".length();
            if (" ".length() == 0) {
                throw null;
            }
        }
        else if (lIIIIlllllIllIII(llllllllllllIlllIllIllllllllllIl, EnumEnchantmentType.FISHING_ROD)) {
            this.setName(EnchantmentLootBonus.llIIIIlIIllIIl[EnchantmentLootBonus.llIIIIlIIlllII[1]]);
            "".length();
            "".length();
            if ((0x67 ^ 0x63) < 0) {
                throw null;
            }
        }
        else {
            this.setName(EnchantmentLootBonus.llIIIIlIIllIIl[EnchantmentLootBonus.llIIIIlIIlllII[2]]);
            "".length();
        }
    }
    
    private static boolean lIIIIlllllIllIlI(final int llllllllllllIlllIllIllllllIIlIIl, final int llllllllllllIlllIllIllllllIIlIII) {
        return llllllllllllIlllIllIllllllIIlIIl != llllllllllllIlllIllIllllllIIlIII;
    }
    
    @Override
    public boolean canApplyTogether(final Enchantment llllllllllllIlllIllIlllllllIlllI) {
        if (lIIIIlllllIllIIl(super.canApplyTogether(llllllllllllIlllIllIlllllllIlllI) ? 1 : 0) && lIIIIlllllIllIlI(llllllllllllIlllIllIlllllllIlllI.effectId, EnchantmentLootBonus.silkTouch.effectId)) {
            return EnchantmentLootBonus.llIIIIlIIlllII[1] != 0;
        }
        return EnchantmentLootBonus.llIIIIlIIlllII[0] != 0;
    }
    
    @Override
    public int getMaxEnchantability(final int llllllllllllIlllIllIllllllllIlIl) {
        return super.getMinEnchantability(llllllllllllIlllIllIllllllllIlIl) + EnchantmentLootBonus.llIIIIlIIlllII[5];
    }
    
    private static boolean lIIIIlllllIllIIl(final int llllllllllllIlllIllIllllllIIllII) {
        return llllllllllllIlllIllIllllllIIllII != 0;
    }
}
