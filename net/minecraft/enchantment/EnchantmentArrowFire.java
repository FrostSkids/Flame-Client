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

public class EnchantmentArrowFire extends Enchantment
{
    private static final /* synthetic */ String[] llIllIIIIIIlIl;
    private static final /* synthetic */ int[] llIllIIIIllIll;
    
    @Override
    public int getMaxEnchantability(final int llllllllllllIllIlIIIIlIIlIllIIlI) {
        return EnchantmentArrowFire.llIllIIIIllIll[2];
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentArrowFire.llIllIIIIllIll[3];
    }
    
    private static void lIIlIllIIlIllIll() {
        (llIllIIIIllIll = new int[5])[0] = ((0x48 ^ 0x7E) & ~(0x37 ^ 0x1));
        EnchantmentArrowFire.llIllIIIIllIll[1] = (29 + 11 + 44 + 51 ^ 80 + 40 - 88 + 115);
        EnchantmentArrowFire.llIllIIIIllIll[2] = (0x60 ^ 0x36 ^ (0x16 ^ 0x72));
        EnchantmentArrowFire.llIllIIIIllIll[3] = " ".length();
        EnchantmentArrowFire.llIllIIIIllIll[4] = "  ".length();
    }
    
    static {
        lIIlIllIIlIllIll();
        lIIlIllIIIllIllI();
    }
    
    @Override
    public int getMinEnchantability(final int llllllllllllIllIlIIIIlIIlIllIlII) {
        return EnchantmentArrowFire.llIllIIIIllIll[1];
    }
    
    private static String lIIlIllIIIllIlIl(final String llllllllllllIllIlIIIIlIIlIlIIlll, final String llllllllllllIllIlIIIIlIIlIlIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIlIIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIlIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIIIlIIlIlIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIIIlIIlIlIlIll.init(EnchantmentArrowFire.llIllIIIIllIll[4], llllllllllllIllIlIIIIlIIlIlIllII);
            return new String(llllllllllllIllIlIIIIlIIlIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIlIIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIlIIlIlIlIlI) {
            llllllllllllIllIlIIIIlIIlIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIllIIIllIllI() {
        (llIllIIIIIIlIl = new String[EnchantmentArrowFire.llIllIIIIllIll[3]])[EnchantmentArrowFire.llIllIIIIllIll[0]] = lIIlIllIIIllIlIl("b62KY4HSumaTXflPgHE+ew==", "kKfVf");
    }
    
    public EnchantmentArrowFire(final int llllllllllllIllIlIIIIlIIlIllllII, final ResourceLocation llllllllllllIllIlIIIIlIIlIllIlll, final int llllllllllllIllIlIIIIlIIlIlllIlI) {
        super(llllllllllllIllIlIIIIlIIlIllllII, llllllllllllIllIlIIIIlIIlIllIlll, llllllllllllIllIlIIIIlIIlIlllIlI, EnumEnchantmentType.BOW);
        this.setName(EnchantmentArrowFire.llIllIIIIIIlIl[EnchantmentArrowFire.llIllIIIIllIll[0]]);
        "".length();
    }
}
