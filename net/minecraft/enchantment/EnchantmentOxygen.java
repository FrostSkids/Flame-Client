// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.util.ResourceLocation;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EnchantmentOxygen extends Enchantment
{
    private static final /* synthetic */ int[] lIlIlllllIllII;
    private static final /* synthetic */ String[] lIlIlllllIlIll;
    
    static {
        llllIlIlIIllIlI();
        llllIlIlIIllIIl();
    }
    
    private static String llllIlIlIIllIII(String lllllllllllllIIIIlIIllIllllllIll, final String lllllllllllllIIIIlIIllIllllllIlI) {
        lllllllllllllIIIIlIIllIllllllIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIIllIllllllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIllIllllllllI = new StringBuilder();
        final char[] lllllllllllllIIIIlIIllIlllllllIl = lllllllllllllIIIIlIIllIllllllIlI.toCharArray();
        int lllllllllllllIIIIlIIllIlllllllII = EnchantmentOxygen.lIlIlllllIllII[0];
        final double lllllllllllllIIIIlIIllIlllllIllI = (Object)((String)lllllllllllllIIIIlIIllIllllllIll).toCharArray();
        final double lllllllllllllIIIIlIIllIlllllIlIl = lllllllllllllIIIIlIIllIlllllIllI.length;
        short lllllllllllllIIIIlIIllIlllllIlII = (short)EnchantmentOxygen.lIlIlllllIllII[0];
        while (llllIlIlIIllIll(lllllllllllllIIIIlIIllIlllllIlII, (int)lllllllllllllIIIIlIIllIlllllIlIl)) {
            final char lllllllllllllIIIIlIIlllIIIIIIIIl = lllllllllllllIIIIlIIllIlllllIllI[lllllllllllllIIIIlIIllIlllllIlII];
            lllllllllllllIIIIlIIllIllllllllI.append((char)(lllllllllllllIIIIlIIlllIIIIIIIIl ^ lllllllllllllIIIIlIIllIlllllllIl[lllllllllllllIIIIlIIllIlllllllII % lllllllllllllIIIIlIIllIlllllllIl.length]));
            "".length();
            ++lllllllllllllIIIIlIIllIlllllllII;
            ++lllllllllllllIIIIlIIllIlllllIlII;
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIllIllllllllI);
    }
    
    @Override
    public int getMaxEnchantability(final int lllllllllllllIIIIlIIlllIIIIIllII) {
        return this.getMinEnchantability(lllllllllllllIIIIlIIlllIIIIIllII) + EnchantmentOxygen.lIlIlllllIllII[2];
    }
    
    private static void llllIlIlIIllIIl() {
        (lIlIlllllIlIll = new String[EnchantmentOxygen.lIlIlllllIllII[4]])[EnchantmentOxygen.lIlIlllllIllII[0]] = llllIlIlIIllIII("FhojNRwX", "ybZRy");
    }
    
    private static boolean llllIlIlIIllIll(final int lllllllllllllIIIIlIIllIlllllIIII, final int lllllllllllllIIIIlIIllIllllIllll) {
        return lllllllllllllIIIIlIIllIlllllIIII < lllllllllllllIIIIlIIllIllllIllll;
    }
    
    private static void llllIlIlIIllIlI() {
        (lIlIlllllIllII = new int[5])[0] = ((0xAC ^ 0xB9) & ~(0x7F ^ 0x6A));
        EnchantmentOxygen.lIlIlllllIllII[1] = (0xC6 ^ 0x84 ^ (0x39 ^ 0x71));
        EnchantmentOxygen.lIlIlllllIllII[2] = (0x9B ^ 0x96 ^ (0x56 ^ 0x45));
        EnchantmentOxygen.lIlIlllllIllII[3] = "   ".length();
        EnchantmentOxygen.lIlIlllllIllII[4] = " ".length();
    }
    
    @Override
    public int getMinEnchantability(final int lllllllllllllIIIIlIIlllIIIIlIIlI) {
        return EnchantmentOxygen.lIlIlllllIllII[1] * lllllllllllllIIIIlIIlllIIIIlIIlI;
    }
    
    public EnchantmentOxygen(final int lllllllllllllIIIIlIIlllIIIIllIII, final ResourceLocation lllllllllllllIIIIlIIlllIIIIlIlll, final int lllllllllllllIIIIlIIlllIIIIllIlI) {
        super(lllllllllllllIIIIlIIlllIIIIllIII, lllllllllllllIIIIlIIlllIIIIlIlll, lllllllllllllIIIIlIIlllIIIIllIlI, EnumEnchantmentType.ARMOR_HEAD);
        this.setName(EnchantmentOxygen.lIlIlllllIlIll[EnchantmentOxygen.lIlIlllllIllII[0]]);
        "".length();
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentOxygen.lIlIlllllIllII[3];
    }
}
