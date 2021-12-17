// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import java.util.Random;
import net.minecraft.item.ItemStack;

public class EnchantmentDurability extends Enchantment
{
    private static final /* synthetic */ int[] lIlIIIlllIIllI;
    private static final /* synthetic */ String[] lIlIIIlllIIlIl;
    
    private static boolean lllIIlIIIIIIlll(final int lllllllllllllIIIlllIllllIllllllI) {
        return lllllllllllllIIIlllIllllIllllllI != 0;
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentDurability.lIlIIIlllIIllI[5];
    }
    
    public static boolean negateDamage(final ItemStack lllllllllllllIIIlllIlllllIIllllI, final int lllllllllllllIIIlllIlllllIIlllIl, final Random lllllllllllllIIIlllIlllllIIlllII) {
        int n;
        if (lllIIlIIIIIIlll((lllllllllllllIIIlllIlllllIIllllI.getItem() instanceof ItemArmor) ? 1 : 0) && lllIIlIIIIIlIIl(lllIIlIIIIIlIII(lllllllllllllIIIlllIlllllIIlllII.nextFloat(), 0.6f))) {
            n = EnchantmentDurability.lIlIIIlllIIllI[0];
            "".length();
            if (null != null) {
                return ((0x4E ^ 0x40) & ~(0x45 ^ 0x4B)) != 0x0;
            }
        }
        else if (lllIIlIIIIIlIlI(lllllllllllllIIIlllIlllllIIlllII.nextInt(lllllllllllllIIIlllIlllllIIlllIl + EnchantmentDurability.lIlIIIlllIIllI[2]))) {
            n = EnchantmentDurability.lIlIIIlllIIllI[2];
            "".length();
            if (((0xD9 ^ 0xAE ^ (0x49 ^ 0x6B)) & (0xA ^ 0x53 ^ (0xB4 ^ 0xB8) ^ -" ".length())) != 0x0) {
                return ((0x22 ^ 0x5F ^ (0x4 ^ 0x1A)) & (109 + 101 - 180 + 97 ^ (0x31 ^ 0x2D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EnchantmentDurability.lIlIIIlllIIllI[0];
        }
        return n != 0;
    }
    
    private static void lllIIlIIIIIIllI() {
        (lIlIIIlllIIllI = new int[6])[0] = ((0x9 ^ 0x27 ^ (0xD4 ^ 0xB4)) & (0xF ^ 0x2A ^ (0x76 ^ 0x1D) ^ -" ".length()));
        EnchantmentDurability.lIlIIIlllIIllI[1] = (0xA5 ^ 0x81 ^ (0x19 ^ 0x38));
        EnchantmentDurability.lIlIIIlllIIllI[2] = " ".length();
        EnchantmentDurability.lIlIIIlllIIllI[3] = (0x72 ^ 0x22 ^ (0x23 ^ 0x7B));
        EnchantmentDurability.lIlIIIlllIIllI[4] = (0x9F ^ 0x91 ^ (0x0 ^ 0x3C));
        EnchantmentDurability.lIlIIIlllIIllI[5] = "   ".length();
    }
    
    @Override
    public int getMaxEnchantability(final int lllllllllllllIIIlllIlllllIlIlllI) {
        return super.getMinEnchantability(lllllllllllllIIIlllIlllllIlIlllI) + EnchantmentDurability.lIlIIIlllIIllI[4];
    }
    
    @Override
    public boolean canApply(final ItemStack lllllllllllllIIIlllIlllllIlIIlll) {
        int canApply;
        if (lllIIlIIIIIIlll(lllllllllllllIIIlllIlllllIlIIlll.isItemStackDamageable() ? 1 : 0)) {
            canApply = EnchantmentDurability.lIlIIIlllIIllI[2];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x5E ^ 0x24 ^ (0x62 ^ 0x2B)) & (0xE3 ^ 0xC4 ^ (0x83 ^ 0x97) ^ -" ".length())) != 0x0;
            }
        }
        else {
            canApply = (super.canApply(lllllllllllllIIIlllIlllllIlIIlll) ? 1 : 0);
        }
        return canApply != 0;
    }
    
    private static int lllIIlIIIIIlIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    protected EnchantmentDurability(final int lllllllllllllIIIlllIlllllIlllIII, final ResourceLocation lllllllllllllIIIlllIlllllIlllIll, final int lllllllllllllIIIlllIlllllIllIllI) {
        super(lllllllllllllIIIlllIlllllIlllIII, lllllllllllllIIIlllIlllllIlllIll, lllllllllllllIIIlllIlllllIllIllI, EnumEnchantmentType.BREAKABLE);
        this.setName(EnchantmentDurability.lIlIIIlllIIlIl[EnchantmentDurability.lIlIIIlllIIllI[0]]);
        "".length();
    }
    
    private static boolean lllIIlIIIIIlIlI(final int lllllllllllllIIIlllIllllIllllIlI) {
        return lllllllllllllIIIlllIllllIllllIlI > 0;
    }
    
    private static boolean lllIIlIIIIIlIIl(final int lllllllllllllIIIlllIllllIlllllII) {
        return lllllllllllllIIIlllIllllIlllllII < 0;
    }
    
    private static boolean lllIIlIIIIIlIll(final int lllllllllllllIIIlllIlllllIIIIIIl, final int lllllllllllllIIIlllIlllllIIIIIII) {
        return lllllllllllllIIIlllIlllllIIIIIIl < lllllllllllllIIIlllIlllllIIIIIII;
    }
    
    private static void lllIIlIIIIIIlIl() {
        (lIlIIIlllIIlIl = new String[EnchantmentDurability.lIlIIIlllIIllI[2]])[EnchantmentDurability.lIlIIIlllIIllI[0]] = lllIIlIIIIIIlII("IQEfBhAsGAQTCw==", "Etmgr");
    }
    
    @Override
    public int getMinEnchantability(final int lllllllllllllIIIlllIlllllIllIIlI) {
        return EnchantmentDurability.lIlIIIlllIIllI[1] + (lllllllllllllIIIlllIlllllIllIIlI - EnchantmentDurability.lIlIIIlllIIllI[2]) * EnchantmentDurability.lIlIIIlllIIllI[3];
    }
    
    private static String lllIIlIIIIIIlII(String lllllllllllllIIIlllIlllllIIIllII, final String lllllllllllllIIIlllIlllllIIlIIII) {
        lllllllllllllIIIlllIlllllIIIllII = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIlllllIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIlllllIIIllll = new StringBuilder();
        final char[] lllllllllllllIIIlllIlllllIIIlllI = lllllllllllllIIIlllIlllllIIlIIII.toCharArray();
        int lllllllllllllIIIlllIlllllIIIllIl = EnchantmentDurability.lIlIIIlllIIllI[0];
        final char lllllllllllllIIIlllIlllllIIIIlll = (Object)lllllllllllllIIIlllIlllllIIIllII.toCharArray();
        final byte lllllllllllllIIIlllIlllllIIIIllI = (byte)lllllllllllllIIIlllIlllllIIIIlll.length;
        float lllllllllllllIIIlllIlllllIIIIlIl = EnchantmentDurability.lIlIIIlllIIllI[0];
        while (lllIIlIIIIIlIll((int)lllllllllllllIIIlllIlllllIIIIlIl, lllllllllllllIIIlllIlllllIIIIllI)) {
            final char lllllllllllllIIIlllIlllllIIlIIlI = lllllllllllllIIIlllIlllllIIIIlll[lllllllllllllIIIlllIlllllIIIIlIl];
            lllllllllllllIIIlllIlllllIIIllll.append((char)(lllllllllllllIIIlllIlllllIIlIIlI ^ lllllllllllllIIIlllIlllllIIIlllI[lllllllllllllIIIlllIlllllIIIllIl % lllllllllllllIIIlllIlllllIIIlllI.length]));
            "".length();
            ++lllllllllllllIIIlllIlllllIIIllIl;
            ++lllllllllllllIIIlllIlllllIIIIlIl;
            "".length();
            if ("   ".length() <= ((0x1B ^ 0x7E ^ (0x4B ^ 0x3F)) & (0xA3 ^ 0x8D ^ (0x0 ^ 0x3F) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIlllllIIIllll);
    }
    
    static {
        lllIIlIIIIIIllI();
        lllIIlIIIIIIlIl();
    }
}
