// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.stats.StatList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemBucketMilk extends Item
{
    private static final /* synthetic */ int[] lllIIIllIIlIII;
    
    @Override
    public ItemStack onItemUseFinish(final ItemStack llllllllllllIllIIIIIIIIlIIIIIlII, final World llllllllllllIllIIIIIIIIlIIIIIIll, final EntityPlayer llllllllllllIllIIIIIIIIlIIIIIIlI) {
        if (lIIlllIllllIIIlI(llllllllllllIllIIIIIIIIlIIIIIIlI.capabilities.isCreativeMode ? 1 : 0)) {
            llllllllllllIllIIIIIIIIlIIIIIlII.stackSize -= ItemBucketMilk.lllIIIllIIlIII[0];
        }
        if (lIIlllIllllIIIlI(llllllllllllIllIIIIIIIIlIIIIIIll.isRemote ? 1 : 0)) {
            llllllllllllIllIIIIIIIIlIIIIIIlI.clearActivePotions();
        }
        llllllllllllIllIIIIIIIIlIIIIIIlI.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        ItemStack itemStack;
        if (lIIlllIllllIIIll(llllllllllllIllIIIIIIIIlIIIIIlII.stackSize)) {
            itemStack = new ItemStack(Items.bucket);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            itemStack = llllllllllllIllIIIIIIIIlIIIIIlII;
        }
        return itemStack;
    }
    
    private static void lIIlllIllllIIIIl() {
        (lllIIIllIIlIII = new int[2])[0] = " ".length();
        ItemBucketMilk.lllIIIllIIlIII[1] = (0x8 ^ 0x28);
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack llllllllllllIllIIIIIIIIIllllIIIl, final World llllllllllllIllIIIIIIIIIllllIlII, final EntityPlayer llllllllllllIllIIIIIIIIIllllIIII) {
        llllllllllllIllIIIIIIIIIllllIIII.setItemInUse(llllllllllllIllIIIIIIIIIllllIIIl, this.getMaxItemUseDuration(llllllllllllIllIIIIIIIIIllllIIIl));
        return llllllllllllIllIIIIIIIIIllllIIIl;
    }
    
    private static boolean lIIlllIllllIIIlI(final int llllllllllllIllIIIIIIIIIlllIlllI) {
        return llllllllllllIllIIIIIIIIIlllIlllI == 0;
    }
    
    public ItemBucketMilk() {
        this.setMaxStackSize(ItemBucketMilk.lllIIIllIIlIII[0]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
    
    private static boolean lIIlllIllllIIIll(final int llllllllllllIllIIIIIIIIIlllIllII) {
        return llllllllllllIllIIIIIIIIIlllIllII <= 0;
    }
    
    static {
        lIIlllIllllIIIIl();
    }
    
    @Override
    public int getMaxItemUseDuration(final ItemStack llllllllllllIllIIIIIIIIIllllllII) {
        return ItemBucketMilk.lllIIIllIIlIII[1];
    }
    
    @Override
    public EnumAction getItemUseAction(final ItemStack llllllllllllIllIIIIIIIIIlllllIlI) {
        return EnumAction.DRINK;
    }
}
