// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.util.ResourceLocation;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EnchantmentArrowInfinite extends Enchantment
{
    private static final /* synthetic */ String[] lIIIIlIIlllIll;
    private static final /* synthetic */ int[] lIIIIlIlIIIIII;
    
    private static String lIlllIIlIIIlIII(final String lllllllllllllIlIIlIllllIIIlIlIIl, final String lllllllllllllIlIIlIllllIIIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIllllIIIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllllIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), EnchantmentArrowInfinite.lIIIIlIlIIIIII[4]), "DES");
            final Cipher lllllllllllllIlIIlIllllIIIlIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIIlIllllIIIlIlllI.init(EnchantmentArrowInfinite.lIIIIlIlIIIIII[5], lllllllllllllIlIIlIllllIIIllIIII);
            return new String(lllllllllllllIlIIlIllllIIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllllIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIllllIIIlIllII) {
            lllllllllllllIlIIlIllllIIIlIllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentArrowInfinite.lIIIIlIlIIIIII[3];
    }
    
    static {
        lIlllIIlIIlIlII();
        lIlllIIlIIIlIll();
    }
    
    public EnchantmentArrowInfinite(final int lllllllllllllIlIIlIllllIIlIIllll, final ResourceLocation lllllllllllllIlIIlIllllIIlIIllIl, final int lllllllllllllIlIIlIllllIIlIlIIll) {
        super(lllllllllllllIlIIlIllllIIlIIllll, lllllllllllllIlIIlIllllIIlIIllIl, lllllllllllllIlIIlIllllIIlIlIIll, EnumEnchantmentType.BOW);
        this.setName(EnchantmentArrowInfinite.lIIIIlIIlllIll[EnchantmentArrowInfinite.lIIIIlIlIIIIII[0]]);
        "".length();
    }
    
    private static void lIlllIIlIIIlIll() {
        (lIIIIlIIlllIll = new String[EnchantmentArrowInfinite.lIIIIlIlIIIIII[3]])[EnchantmentArrowInfinite.lIIIIlIlIIIIII[0]] = lIlllIIlIIIlIII("HrnKiMteF8v1Qd5QV5oKYg==", "ytzQM");
    }
    
    @Override
    public int getMaxEnchantability(final int lllllllllllllIlIIlIllllIIlIIIIlI) {
        return EnchantmentArrowInfinite.lIIIIlIlIIIIII[2];
    }
    
    private static void lIlllIIlIIlIlII() {
        (lIIIIlIlIIIIII = new int[6])[0] = ((0xF8 ^ 0xAC ^ (0x8F ^ 0x8A)) & (197 + 181 - 230 + 87 ^ 64 + 182 - 207 + 147 ^ -" ".length()));
        EnchantmentArrowInfinite.lIIIIlIlIIIIII[1] = (((0xD3 ^ 0x8D) & ~(0x35 ^ 0x6B)) ^ (0x9D ^ 0x89));
        EnchantmentArrowInfinite.lIIIIlIlIIIIII[2] = (0xB0 ^ 0x82);
        EnchantmentArrowInfinite.lIIIIlIlIIIIII[3] = " ".length();
        EnchantmentArrowInfinite.lIIIIlIlIIIIII[4] = (0x11 ^ 0x19);
        EnchantmentArrowInfinite.lIIIIlIlIIIIII[5] = "  ".length();
    }
    
    @Override
    public int getMinEnchantability(final int lllllllllllllIlIIlIllllIIlIIIllI) {
        return EnchantmentArrowInfinite.lIIIIlIlIIIIII[1];
    }
}
