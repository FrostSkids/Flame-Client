// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;

public class EnchantmentArrowKnockback extends Enchantment
{
    private static final /* synthetic */ String[] llIIlIllIIllll;
    private static final /* synthetic */ int[] llIIlIllIlIIII;
    
    @Override
    public int getMaxEnchantability(final int llllllllllllIlllIIIlIlIIllIIIlll) {
        return this.getMinEnchantability(llllllllllllIlllIIIlIlIIllIIIlll) + EnchantmentArrowKnockback.llIIlIllIlIIII[4];
    }
    
    public EnchantmentArrowKnockback(final int llllllllllllIlllIIIlIlIIllIlIIll, final ResourceLocation llllllllllllIlllIIIlIlIIllIlIllI, final int llllllllllllIlllIIIlIlIIllIlIlIl) {
        super(llllllllllllIlllIIIlIlIIllIlIIll, llllllllllllIlllIIIlIlIIllIlIllI, llllllllllllIlllIIIlIlIIllIlIlIl, EnumEnchantmentType.BOW);
        this.setName(EnchantmentArrowKnockback.llIIlIllIIllll[EnchantmentArrowKnockback.llIIlIllIlIIII[0]]);
        "".length();
    }
    
    private static void lIIIllIllIlIIIll() {
        (llIIlIllIIllll = new String[EnchantmentArrowKnockback.llIIlIllIlIIII[2]])[EnchantmentArrowKnockback.llIIlIllIlIIII[0]] = lIIIllIllIlIIIlI("kLAv6XlWHfaXMgk00KEJ2Q==", "LdmOY");
    }
    
    static {
        lIIIllIllIlIIlII();
        lIIIllIllIlIIIll();
    }
    
    private static String lIIIllIllIlIIIlI(final String llllllllllllIlllIIIlIlIIlIlllllI, final String llllllllllllIlllIIIlIlIIlIlllIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlIlIIllIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIlIIlIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIlIlIIllIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIlIlIIllIIIIII.init(EnchantmentArrowKnockback.llIIlIllIlIIII[5], llllllllllllIlllIIIlIlIIllIIIIIl);
            return new String(llllllllllllIlllIIIlIlIIllIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIlIIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlIlIIlIllllll) {
            llllllllllllIlllIIIlIlIIlIllllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMinEnchantability(final int llllllllllllIlllIIIlIlIIllIIlllI) {
        return EnchantmentArrowKnockback.llIIlIllIlIIII[1] + (llllllllllllIlllIIIlIlIIllIIlllI - EnchantmentArrowKnockback.llIIlIllIlIIII[2]) * EnchantmentArrowKnockback.llIIlIllIlIIII[3];
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentArrowKnockback.llIIlIllIlIIII[5];
    }
    
    private static void lIIIllIllIlIIlII() {
        (llIIlIllIlIIII = new int[6])[0] = ((0x50 ^ 0x17) & ~(0xC1 ^ 0x86));
        EnchantmentArrowKnockback.llIIlIllIlIIII[1] = (0x84 ^ 0x92 ^ (0x2F ^ 0x35));
        EnchantmentArrowKnockback.llIIlIllIlIIII[2] = " ".length();
        EnchantmentArrowKnockback.llIIlIllIlIIII[3] = (0x14 ^ 0x0);
        EnchantmentArrowKnockback.llIIlIllIlIIII[4] = (0x8F ^ 0x96);
        EnchantmentArrowKnockback.llIIlIllIlIIII[5] = "  ".length();
    }
}
