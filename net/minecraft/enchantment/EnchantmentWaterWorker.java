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

public class EnchantmentWaterWorker extends Enchantment
{
    private static final /* synthetic */ String[] lIllIlIIlIllIl;
    private static final /* synthetic */ int[] lIllIlIIlIlllI;
    
    @Override
    public int getMinEnchantability(final int lllllllllllllIIIIIIIIIllIllIllII) {
        return EnchantmentWaterWorker.lIllIlIIlIlllI[1];
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentWaterWorker.lIllIlIIlIlllI[1];
    }
    
    private static String llllllIIllIIIll(final String lllllllllllllIIIIIIIIIllIlIlllIl, final String lllllllllllllIIIIIIIIIllIlIlllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIIllIllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIIllIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIIllIlIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIIllIlIlllll.init(EnchantmentWaterWorker.lIllIlIIlIlllI[3], lllllllllllllIIIIIIIIIllIllIIIII);
            return new String(lllllllllllllIIIIIIIIIllIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIIllIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIIllIlIllllI) {
            lllllllllllllIIIIIIIIIllIlIllllI.printStackTrace();
            return null;
        }
    }
    
    private static void llllllIIllIIlII() {
        (lIllIlIIlIllIl = new String[EnchantmentWaterWorker.lIllIlIIlIlllI[1]])[EnchantmentWaterWorker.lIllIlIIlIlllI[0]] = llllllIIllIIIll("VtrpWwh2Z5zS9PWPZWgt+Q==", "ZLiku");
    }
    
    @Override
    public int getMaxEnchantability(final int lllllllllllllIIIIIIIIIllIllIlIII) {
        return this.getMinEnchantability(lllllllllllllIIIIIIIIIllIllIlIII) + EnchantmentWaterWorker.lIllIlIIlIlllI[2];
    }
    
    public EnchantmentWaterWorker(final int lllllllllllllIIIIIIIIIllIlllIlII, final ResourceLocation lllllllllllllIIIIIIIIIllIllIllll, final int lllllllllllllIIIIIIIIIllIlllIIlI) {
        super(lllllllllllllIIIIIIIIIllIlllIlII, lllllllllllllIIIIIIIIIllIllIllll, lllllllllllllIIIIIIIIIllIlllIIlI, EnumEnchantmentType.ARMOR_HEAD);
        this.setName(EnchantmentWaterWorker.lIllIlIIlIllIl[EnchantmentWaterWorker.lIllIlIIlIlllI[0]]);
        "".length();
    }
    
    private static void llllllIIllIIlIl() {
        (lIllIlIIlIlllI = new int[4])[0] = ((0x3B ^ 0x2B) & ~(0x83 ^ 0x93));
        EnchantmentWaterWorker.lIllIlIIlIlllI[1] = " ".length();
        EnchantmentWaterWorker.lIllIlIIlIlllI[2] = (2 + 53 - 6 + 101 ^ 91 + 68 - 95 + 126);
        EnchantmentWaterWorker.lIllIlIIlIlllI[3] = "  ".length();
    }
    
    static {
        llllllIIllIIlIl();
        llllllIIllIIlII();
    }
}
