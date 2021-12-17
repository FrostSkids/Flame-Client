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

public class EnchantmentWaterWalker extends Enchantment
{
    private static final /* synthetic */ String[] llllIllIIIllI;
    private static final /* synthetic */ int[] llllIllIIIlll;
    
    @Override
    public int getMaxEnchantability(final int lllllllllllllIlIllIlIIllIIIlIlIl) {
        return this.getMinEnchantability(lllllllllllllIlIllIlIIllIIIlIlIl) + EnchantmentWaterWalker.llllIllIIIlll[2];
    }
    
    public EnchantmentWaterWalker(final int lllllllllllllIlIllIlIIllIIlIIlIl, final ResourceLocation lllllllllllllIlIllIlIIllIIlIIIII, final int lllllllllllllIlIllIlIIllIIlIIIll) {
        super(lllllllllllllIlIllIlIIllIIlIIlIl, lllllllllllllIlIllIlIIllIIlIIIII, lllllllllllllIlIllIlIIllIIlIIIll, EnumEnchantmentType.ARMOR_FEET);
        this.setName(EnchantmentWaterWalker.llllIllIIIllI[EnchantmentWaterWalker.llllIllIIIlll[0]]);
        "".length();
    }
    
    private static void lIlIlIlIlllllIl() {
        (llllIllIIIllI = new String[EnchantmentWaterWalker.llllIllIIIlll[4]])[EnchantmentWaterWalker.llllIllIIIlll[0]] = lIlIlIlIlllllII("9GrR8UWhu9J65iUXEZ7GFw==", "xsGmt");
    }
    
    static {
        lIlIlIlIllllllI();
        lIlIlIlIlllllIl();
    }
    
    private static void lIlIlIlIllllllI() {
        (llllIllIIIlll = new int[6])[0] = ((0x75 ^ 0x5C) & ~(0x31 ^ 0x18));
        EnchantmentWaterWalker.llllIllIIIlll[1] = (0x9 ^ 0x2B ^ (0x72 ^ 0x5A));
        EnchantmentWaterWalker.llllIllIIIlll[2] = (0x8C ^ 0xA8 ^ (0x0 ^ 0x2B));
        EnchantmentWaterWalker.llllIllIIIlll[3] = "   ".length();
        EnchantmentWaterWalker.llllIllIIIlll[4] = " ".length();
        EnchantmentWaterWalker.llllIllIIIlll[5] = "  ".length();
    }
    
    @Override
    public int getMinEnchantability(final int lllllllllllllIlIllIlIIllIIIllIll) {
        return lllllllllllllIlIllIlIIllIIIllIll * EnchantmentWaterWalker.llllIllIIIlll[1];
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentWaterWalker.llllIllIIIlll[3];
    }
    
    private static String lIlIlIlIlllllII(final String lllllllllllllIlIllIlIIllIIIIlIlI, final String lllllllllllllIlIllIlIIllIIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIllIIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIllIIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlIIllIIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlIIllIIIIlllI.init(EnchantmentWaterWalker.llllIllIIIlll[5], lllllllllllllIlIllIlIIllIIIIllll);
            return new String(lllllllllllllIlIllIlIIllIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIllIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIllIIIIllIl) {
            lllllllllllllIlIllIlIIllIIIIllIl.printStackTrace();
            return null;
        }
    }
}
