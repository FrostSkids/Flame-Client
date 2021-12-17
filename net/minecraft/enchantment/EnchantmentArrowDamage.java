// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.util.ResourceLocation;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EnchantmentArrowDamage extends Enchantment
{
    private static final /* synthetic */ String[] lIlIllIlIllIlI;
    private static final /* synthetic */ int[] lIlIllIlIlllII;
    
    @Override
    public int getMaxLevel() {
        return EnchantmentArrowDamage.lIlIllIlIlllII[4];
    }
    
    static {
        llllIIIllllIIlI();
        llllIIIlllIllll();
    }
    
    private static String llllIIIlllIlllI(final String lllllllllllllIIIIllIlIIlIlllllll, final String lllllllllllllIIIIllIlIIllIIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlIIllIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIIllIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIlIIllIIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIlIIllIIIIIll.init(EnchantmentArrowDamage.lIlIllIlIlllII[5], lllllllllllllIIIIllIlIIllIIIIlII);
            return new String(lllllllllllllIIIIllIlIIllIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIIlIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlIIllIIIIIlI) {
            lllllllllllllIIIIllIlIIllIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMaxEnchantability(final int lllllllllllllIIIIllIlIIllIIIllII) {
        return this.getMinEnchantability(lllllllllllllIIIIllIlIIllIIIllII) + EnchantmentArrowDamage.lIlIllIlIlllII[3];
    }
    
    private static void llllIIIlllIllll() {
        (lIlIllIlIllIlI = new String[EnchantmentArrowDamage.lIlIllIlIlllII[1]])[EnchantmentArrowDamage.lIlIllIlIlllII[0]] = llllIIIlllIlllI("cy7LGHcqAC39Tv0Um5KqxQ==", "mPAhh");
    }
    
    @Override
    public int getMinEnchantability(final int lllllllllllllIIIIllIlIIllIIlIIIl) {
        return EnchantmentArrowDamage.lIlIllIlIlllII[1] + (lllllllllllllIIIIllIlIIllIIlIIIl - EnchantmentArrowDamage.lIlIllIlIlllII[1]) * EnchantmentArrowDamage.lIlIllIlIlllII[2];
    }
    
    private static void llllIIIllllIIlI() {
        (lIlIllIlIlllII = new int[6])[0] = ((0x79 ^ 0x4B) & ~(0x36 ^ 0x4));
        EnchantmentArrowDamage.lIlIllIlIlllII[1] = " ".length();
        EnchantmentArrowDamage.lIlIllIlIlllII[2] = (0x97 ^ 0x9D);
        EnchantmentArrowDamage.lIlIllIlIlllII[3] = (0x5E ^ 0x79 ^ (0x60 ^ 0x48));
        EnchantmentArrowDamage.lIlIllIlIlllII[4] = (0x87 ^ 0x82);
        EnchantmentArrowDamage.lIlIllIlIlllII[5] = "  ".length();
    }
    
    public EnchantmentArrowDamage(final int lllllllllllllIIIIllIlIIllIIllIlI, final ResourceLocation lllllllllllllIIIIllIlIIllIIllIIl, final int lllllllllllllIIIIllIlIIllIIllIII) {
        super(lllllllllllllIIIIllIlIIllIIllIlI, lllllllllllllIIIIllIlIIllIIllIIl, lllllllllllllIIIIllIlIIllIIllIII, EnumEnchantmentType.BOW);
        this.setName(EnchantmentArrowDamage.lIlIllIlIllIlI[EnchantmentArrowDamage.lIlIllIlIlllII[0]]);
        "".length();
    }
}
