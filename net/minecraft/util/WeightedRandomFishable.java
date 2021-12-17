// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.enchantment.EnchantmentHelper;
import java.util.Random;
import net.minecraft.item.ItemStack;

public class WeightedRandomFishable extends WeightedRandom.Item
{
    private final /* synthetic */ ItemStack returnStack;
    private static final /* synthetic */ int[] llIlIIIIlllIll;
    private /* synthetic */ float maxDamagePercent;
    private /* synthetic */ boolean enchantable;
    
    private static int lIIlIIIlIllllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIlIIIlIlllllIl(final int llllllllllllIllIllIlIllIIIIIIIII) {
        return llllllllllllIllIllIlIllIIIIIIIII > 0;
    }
    
    public ItemStack getItemStack(final Random llllllllllllIllIllIlIllIIIIlllIl) {
        final ItemStack llllllllllllIllIllIlIllIIIIlllII = this.returnStack.copy();
        if (lIIlIIIlIlllllIl(lIIlIIIlIllllIll(this.maxDamagePercent, 0.0f))) {
            final int llllllllllllIllIllIlIllIIIIllIll = (int)(this.maxDamagePercent * this.returnStack.getMaxDamage());
            int llllllllllllIllIllIlIllIIIIllIlI = llllllllllllIllIllIlIllIIIIlllII.getMaxDamage() - llllllllllllIllIllIlIllIIIIlllIl.nextInt(llllllllllllIllIllIlIllIIIIlllIl.nextInt(llllllllllllIllIllIlIllIIIIllIll) + WeightedRandomFishable.llIlIIIIlllIll[0]);
            if (lIIlIIIlIllllllI(llllllllllllIllIllIlIllIIIIllIlI, llllllllllllIllIllIlIllIIIIllIll)) {
                llllllllllllIllIllIlIllIIIIllIlI = llllllllllllIllIllIlIllIIIIllIll;
            }
            if (lIIlIIIlIlllllll(llllllllllllIllIllIlIllIIIIllIlI, WeightedRandomFishable.llIlIIIIlllIll[0])) {
                llllllllllllIllIllIlIllIIIIllIlI = WeightedRandomFishable.llIlIIIIlllIll[0];
            }
            llllllllllllIllIllIlIllIIIIlllII.setItemDamage(llllllllllllIllIllIlIllIIIIllIlI);
        }
        if (lIIlIIIllIIIIIII(this.enchantable ? 1 : 0)) {
            EnchantmentHelper.addRandomEnchantment(llllllllllllIllIllIlIllIIIIlllIl, llllllllllllIllIllIlIllIIIIlllII, WeightedRandomFishable.llIlIIIIlllIll[1]);
            "".length();
        }
        return llllllllllllIllIllIlIllIIIIlllII;
    }
    
    public WeightedRandomFishable(final ItemStack llllllllllllIllIllIlIllIIIlIIlIl, final int llllllllllllIllIllIlIllIIIlIIlll) {
        super(llllllllllllIllIllIlIllIIIlIIlll);
        this.returnStack = llllllllllllIllIllIlIllIIIlIIlIl;
    }
    
    static {
        lIIlIIIlIllllIlI();
    }
    
    private static boolean lIIlIIIlIlllllll(final int llllllllllllIllIllIlIllIIIIIlIIl, final int llllllllllllIllIllIlIllIIIIIlIII) {
        return llllllllllllIllIllIlIllIIIIIlIIl < llllllllllllIllIllIlIllIIIIIlIII;
    }
    
    private static void lIIlIIIlIllllIlI() {
        (llIlIIIIlllIll = new int[2])[0] = " ".length();
        WeightedRandomFishable.llIlIIIIlllIll[1] = (133 + 123 - 176 + 62 ^ 141 + 92 - 128 + 39);
    }
    
    public WeightedRandomFishable setEnchantable() {
        this.enchantable = (WeightedRandomFishable.llIlIIIIlllIll[0] != 0);
        return this;
    }
    
    private static boolean lIIlIIIllIIIIIII(final int llllllllllllIllIllIlIllIIIIIIIlI) {
        return llllllllllllIllIllIlIllIIIIIIIlI != 0;
    }
    
    private static boolean lIIlIIIlIllllllI(final int llllllllllllIllIllIlIllIIIIIIlIl, final int llllllllllllIllIllIlIllIIIIIIlII) {
        return llllllllllllIllIllIlIllIIIIIIlIl > llllllllllllIllIllIlIllIIIIIIlII;
    }
    
    public WeightedRandomFishable setMaxDamagePercent(final float llllllllllllIllIllIlIllIIIIIllll) {
        this.maxDamagePercent = llllllllllllIllIllIlIllIIIIIllll;
        return this;
    }
}
