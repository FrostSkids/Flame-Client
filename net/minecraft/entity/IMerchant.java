// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import net.minecraft.village.MerchantRecipe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IChatComponent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.village.MerchantRecipeList;

public interface IMerchant
{
    void setRecipes(final MerchantRecipeList p0);
    
    void setCustomer(final EntityPlayer p0);
    
    IChatComponent getDisplayName();
    
    EntityPlayer getCustomer();
    
    void verifySellingItem(final ItemStack p0);
    
    void useRecipe(final MerchantRecipe p0);
    
    MerchantRecipeList getRecipes(final EntityPlayer p0);
}
