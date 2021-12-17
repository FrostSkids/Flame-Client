// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.item.ItemStack;
import java.util.Random;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class EnchantmentThorns extends Enchantment
{
    private static final /* synthetic */ String[] lIlIlllIlIlIll;
    private static final /* synthetic */ int[] lIlIlllIlIllII;
    
    private static void llllIIllllllIII() {
        (lIlIlllIlIllII = new int[8])[0] = ((0x44 ^ 0x57) & ~(0x49 ^ 0x5A));
        EnchantmentThorns.lIlIlllIlIllII[1] = (0x47 ^ 0x4D);
        EnchantmentThorns.lIlIlllIlIllII[2] = (0x47 ^ 0x53);
        EnchantmentThorns.lIlIlllIlIllII[3] = " ".length();
        EnchantmentThorns.lIlIlllIlIllII[4] = (0x45 ^ 0x5B ^ (0xED ^ 0xC1));
        EnchantmentThorns.lIlIlllIlIllII[5] = "   ".length();
        EnchantmentThorns.lIlIlllIlIllII[6] = (0x14 ^ 0x55 ^ (0xC2 ^ 0x87));
        EnchantmentThorns.lIlIlllIlIllII[7] = "  ".length();
    }
    
    @Override
    public void onUserHurt(final EntityLivingBase lllllllllllllIIIIlIlIlllIlIIIlIl, final Entity lllllllllllllIIIIlIlIlllIlIIIlII, final int lllllllllllllIIIIlIlIlllIIlllllI) {
        final Random lllllllllllllIIIIlIlIlllIlIIIIlI = lllllllllllllIIIIlIlIlllIlIIIlIl.getRNG();
        final ItemStack lllllllllllllIIIIlIlIlllIlIIIIIl = EnchantmentHelper.getEnchantedItem(Enchantment.thorns, lllllllllllllIIIIlIlIlllIlIIIlIl);
        if (llllIIllllllIIl(func_92094_a(lllllllllllllIIIIlIlIlllIIlllllI, lllllllllllllIIIIlIlIlllIlIIIIlI) ? 1 : 0)) {
            if (llllIIllllllIlI(lllllllllllllIIIIlIlIlllIlIIIlII)) {
                lllllllllllllIIIIlIlIlllIlIIIlII.attackEntityFrom(DamageSource.causeThornsDamage(lllllllllllllIIIIlIlIlllIlIIIlIl), (float)func_92095_b(lllllllllllllIIIIlIlIlllIIlllllI, lllllllllllllIIIIlIlIlllIlIIIIlI));
                "".length();
                lllllllllllllIIIIlIlIlllIlIIIlII.playSound(EnchantmentThorns.lIlIlllIlIlIll[EnchantmentThorns.lIlIlllIlIllII[3]], 0.5f, 1.0f);
            }
            if (llllIIllllllIlI(lllllllllllllIIIIlIlIlllIlIIIIIl)) {
                lllllllllllllIIIIlIlIlllIlIIIIIl.damageItem(EnchantmentThorns.lIlIlllIlIllII[5], lllllllllllllIIIIlIlIlllIlIIIlIl);
                "".length();
                if (((0x3C ^ 0x3B) & ~(0x11 ^ 0x16)) < -" ".length()) {
                    return;
                }
            }
        }
        else if (llllIIllllllIlI(lllllllllllllIIIIlIlIlllIlIIIIIl)) {
            lllllllllllllIIIIlIlIlllIlIIIIIl.damageItem(EnchantmentThorns.lIlIlllIlIllII[3], lllllllllllllIIIIlIlIlllIlIIIlIl);
        }
    }
    
    private static String llllIIlllllIllI(String lllllllllllllIIIIlIlIlllIIlIIIII, final String lllllllllllllIIIIlIlIlllIIIlllll) {
        lllllllllllllIIIIlIlIlllIIlIIIII = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIlIlllIIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIlIlllIIlIIIll = new StringBuilder();
        final char[] lllllllllllllIIIIlIlIlllIIlIIIlI = lllllllllllllIIIIlIlIlllIIIlllll.toCharArray();
        int lllllllllllllIIIIlIlIlllIIlIIIIl = EnchantmentThorns.lIlIlllIlIllII[0];
        final int lllllllllllllIIIIlIlIlllIIIllIll = (Object)lllllllllllllIIIIlIlIlllIIlIIIII.toCharArray();
        final short lllllllllllllIIIIlIlIlllIIIllIlI = (short)lllllllllllllIIIIlIlIlllIIIllIll.length;
        String lllllllllllllIIIIlIlIlllIIIllIIl = (String)EnchantmentThorns.lIlIlllIlIllII[0];
        while (llllIIlllllllll((int)lllllllllllllIIIIlIlIlllIIIllIIl, lllllllllllllIIIIlIlIlllIIIllIlI)) {
            final char lllllllllllllIIIIlIlIlllIIlIIllI = lllllllllllllIIIIlIlIlllIIIllIll[lllllllllllllIIIIlIlIlllIIIllIIl];
            lllllllllllllIIIIlIlIlllIIlIIIll.append((char)(lllllllllllllIIIIlIlIlllIIlIIllI ^ lllllllllllllIIIIlIlIlllIIlIIIlI[lllllllllllllIIIIlIlIlllIIlIIIIl % lllllllllllllIIIIlIlIlllIIlIIIlI.length]));
            "".length();
            ++lllllllllllllIIIIlIlIlllIIlIIIIl;
            ++lllllllllllllIIIIlIlIlllIIIllIIl;
            "".length();
            if ((0x47 ^ 0x17 ^ (0x38 ^ 0x6C)) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIlIlllIIlIIIll);
    }
    
    private static int llllIIllllllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public static boolean func_92094_a(final int lllllllllllllIIIIlIlIlllIIlllIIl, final Random lllllllllllllIIIIlIlIlllIIlllIII) {
        int n;
        if (llllIIlllllllII(lllllllllllllIIIIlIlIlllIIlllIIl)) {
            n = EnchantmentThorns.lIlIlllIlIllII[0];
            "".length();
            if ((0x5F ^ 0x5B) < 0) {
                return ((0x43 ^ 0x9) & ~(0xE3 ^ 0xA9)) != 0x0;
            }
        }
        else if (llllIIlllllllIl(llllIIllllllIll(lllllllllllllIIIIlIlIlllIIlllIII.nextFloat(), 0.15f * lllllllllllllIIIIlIlIlllIIlllIIl))) {
            n = EnchantmentThorns.lIlIlllIlIllII[3];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0x5E ^ 0x52 ^ (0x19 ^ 0x5)) & (101 + 64 - 145 + 141 ^ 106 + 173 - 127 + 25 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EnchantmentThorns.lIlIlllIlIllII[0];
        }
        return n != 0;
    }
    
    private static boolean llllIIllllllIlI(final Object lllllllllllllIIIIlIlIlllIIIIlllI) {
        return lllllllllllllIIIIlIlIlllIIIIlllI != null;
    }
    
    private static boolean llllIIlllllllll(final int lllllllllllllIIIIlIlIlllIIIlIlIl, final int lllllllllllllIIIIlIlIlllIIIlIlII) {
        return lllllllllllllIIIIlIlIlllIIIlIlIl < lllllllllllllIIIIlIlIlllIIIlIlII;
    }
    
    private static void llllIIlllllIlll() {
        (lIlIlllIlIlIll = new String[EnchantmentThorns.lIlIlllIlIllII[7]])[EnchantmentThorns.lIlIlllIlIllII[0]] = llllIIlllllIllI("MQAqHww2", "EhEmb");
        EnchantmentThorns.lIlIlllIlIlIll[EnchantmentThorns.lIlIlllIlIllII[3]] = llllIIlllllIllI("MC0DLQ8xYhokByYiHQ==", "TLnLh");
    }
    
    private static boolean llllIIlllllllIl(final int lllllllllllllIIIIlIlIlllIIIIlIlI) {
        return lllllllllllllIIIIlIlIlllIIIIlIlI < 0;
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentThorns.lIlIlllIlIllII[5];
    }
    
    private static boolean llllIIllllllIIl(final int lllllllllllllIIIIlIlIlllIIIIllII) {
        return lllllllllllllIIIIlIlIlllIIIIllII != 0;
    }
    
    @Override
    public int getMaxEnchantability(final int lllllllllllllIIIIlIlIlllIlIlIIll) {
        return super.getMinEnchantability(lllllllllllllIIIIlIlIlllIlIlIIll) + EnchantmentThorns.lIlIlllIlIllII[4];
    }
    
    private static boolean llllIIlllllllII(final int lllllllllllllIIIIlIlIlllIIIIlIII) {
        return lllllllllllllIIIIlIlIlllIIIIlIII <= 0;
    }
    
    static {
        llllIIllllllIII();
        llllIIlllllIlll();
    }
    
    public EnchantmentThorns(final int lllllllllllllIIIIlIlIlllIlIlllll, final ResourceLocation lllllllllllllIIIIlIlIlllIllIIIlI, final int lllllllllllllIIIIlIlIlllIllIIIIl) {
        super(lllllllllllllIIIIlIlIlllIlIlllll, lllllllllllllIIIIlIlIlllIllIIIlI, lllllllllllllIIIIlIlIlllIllIIIIl, EnumEnchantmentType.ARMOR_TORSO);
        this.setName(EnchantmentThorns.lIlIlllIlIlIll[EnchantmentThorns.lIlIlllIlIllII[0]]);
        "".length();
    }
    
    public static int func_92095_b(final int lllllllllllllIIIIlIlIlllIIllIIll, final Random lllllllllllllIIIIlIlIlllIIllIIII) {
        int n;
        if (llllIIllllllllI(lllllllllllllIIIIlIlIlllIIllIIll, EnchantmentThorns.lIlIlllIlIllII[1])) {
            n = lllllllllllllIIIIlIlIlllIIllIIll - EnchantmentThorns.lIlIlllIlIllII[1];
            "".length();
            if (null != null) {
                return (117 + 14 - 108 + 144 ^ 160 + 80 - 229 + 167) & (0x7E ^ 0x2A ^ (0xF7 ^ 0xB6) ^ -" ".length());
            }
        }
        else {
            n = EnchantmentThorns.lIlIlllIlIllII[3] + lllllllllllllIIIIlIlIlllIIllIIII.nextInt(EnchantmentThorns.lIlIlllIlIllII[6]);
        }
        return n;
    }
    
    @Override
    public int getMinEnchantability(final int lllllllllllllIIIIlIlIlllIlIllIIl) {
        return EnchantmentThorns.lIlIlllIlIllII[1] + EnchantmentThorns.lIlIlllIlIllII[2] * (lllllllllllllIIIIlIlIlllIlIllIIl - EnchantmentThorns.lIlIlllIlIllII[3]);
    }
    
    @Override
    public boolean canApply(final ItemStack lllllllllllllIIIIlIlIlllIlIIlllI) {
        int canApply;
        if (llllIIllllllIIl((lllllllllllllIIIIlIlIlllIlIIlllI.getItem() instanceof ItemArmor) ? 1 : 0)) {
            canApply = EnchantmentThorns.lIlIlllIlIllII[3];
            "".length();
            if (" ".length() < 0) {
                return ((0x97 ^ 0x8F) & ~(0xA7 ^ 0xBF)) != 0x0;
            }
        }
        else {
            canApply = (super.canApply(lllllllllllllIIIIlIlIlllIlIIlllI) ? 1 : 0);
        }
        return canApply != 0;
    }
    
    private static boolean llllIIllllllllI(final int lllllllllllllIIIIlIlIlllIIIlIIIl, final int lllllllllllllIIIIlIlIlllIIIlIIII) {
        return lllllllllllllIIIIlIlIlllIIIlIIIl > lllllllllllllIIIIlIlIlllIIIlIIII;
    }
}
