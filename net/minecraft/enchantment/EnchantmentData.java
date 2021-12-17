// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.util.WeightedRandom;

public class EnchantmentData extends WeightedRandom.Item
{
    public final /* synthetic */ Enchantment enchantmentobj;
    public final /* synthetic */ int enchantmentLevel;
    
    public EnchantmentData(final Enchantment lllllllllllllIIIIIlllIllIlIIIlIl, final int lllllllllllllIIIIIlllIllIlIIIlll) {
        super(lllllllllllllIIIIIlllIllIlIIIlIl.getWeight());
        this.enchantmentobj = lllllllllllllIIIIIlllIllIlIIIlIl;
        this.enchantmentLevel = lllllllllllllIIIIIlllIllIlIIIlll;
    }
}
