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

public class EnchantmentFishingSpeed extends Enchantment
{
    private static final /* synthetic */ String[] lllIIllIIllllI;
    private static final /* synthetic */ int[] lllIIllIlIIIIl;
    
    @Override
    public int getMaxLevel() {
        return EnchantmentFishingSpeed.lllIIllIlIIIIl[5];
    }
    
    protected EnchantmentFishingSpeed(final int llllllllllllIlIllllIIIIIIlllIllI, final ResourceLocation llllllllllllIlIllllIIIIIIlllIIII, final int llllllllllllIlIllllIIIIIIlllIlII, final EnumEnchantmentType llllllllllllIlIllllIIIIIIllIlllI) {
        super(llllllllllllIlIllllIIIIIIlllIllI, llllllllllllIlIllllIIIIIIlllIIII, llllllllllllIlIllllIIIIIIlllIlII, llllllllllllIlIllllIIIIIIllIlllI);
        this.setName(EnchantmentFishingSpeed.lllIIllIIllllI[EnchantmentFishingSpeed.lllIIllIlIIIIl[0]]);
        "".length();
    }
    
    private static void lIlIIIIIIlIIlllI() {
        (lllIIllIlIIIIl = new int[7])[0] = ((0x84 ^ 0xB6) & ~(0x10 ^ 0x22));
        EnchantmentFishingSpeed.lllIIllIlIIIIl[1] = (0x3C ^ 0x1B ^ (0x74 ^ 0x5C));
        EnchantmentFishingSpeed.lllIIllIlIIIIl[2] = " ".length();
        EnchantmentFishingSpeed.lllIIllIlIIIIl[3] = (0x59 ^ 0x50);
        EnchantmentFishingSpeed.lllIIllIlIIIIl[4] = (0x4 ^ 0x36);
        EnchantmentFishingSpeed.lllIIllIlIIIIl[5] = "   ".length();
        EnchantmentFishingSpeed.lllIIllIlIIIIl[6] = "  ".length();
    }
    
    private static String lIlIIIIIIlIIlIIl(final String llllllllllllIlIllllIIIIIIlIllIll, final String llllllllllllIlIllllIIIIIIlIllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIIIIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIIIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIIIIIIlIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIIIIIIlIlllIl.init(EnchantmentFishingSpeed.lllIIllIlIIIIl[6], llllllllllllIlIllllIIIIIIlIllllI);
            return new String(llllllllllllIlIllllIIIIIIlIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIIIIIlIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIIIIIlIlllII) {
            llllllllllllIlIllllIIIIIIlIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMinEnchantability(final int llllllllllllIlIllllIIIIIIllIlIlI) {
        return EnchantmentFishingSpeed.lllIIllIlIIIIl[1] + (llllllllllllIlIllllIIIIIIllIlIlI - EnchantmentFishingSpeed.lllIIllIlIIIIl[2]) * EnchantmentFishingSpeed.lllIIllIlIIIIl[3];
    }
    
    private static void lIlIIIIIIlIIllII() {
        (lllIIllIIllllI = new String[EnchantmentFishingSpeed.lllIIllIlIIIIl[2]])[EnchantmentFishingSpeed.lllIIllIlIIIIl[0]] = lIlIIIIIIlIIlIIl("hpMW0HWa3dTLd8J4tdKelA==", "ylZxQ");
    }
    
    static {
        lIlIIIIIIlIIlllI();
        lIlIIIIIIlIIllII();
    }
    
    @Override
    public int getMaxEnchantability(final int llllllllllllIlIllllIIIIIIllIIlII) {
        return super.getMinEnchantability(llllllllllllIlIllllIIIIIIllIIlII) + EnchantmentFishingSpeed.lllIIllIlIIIIl[4];
    }
}
