// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.util.BlockPos;
import net.minecraft.init.Items;
import net.minecraft.stats.StatList;
import net.minecraft.block.material.Material;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;

public class ItemGlassBottle extends Item
{
    private static final /* synthetic */ int[] lIlIIllllIIlIl;
    
    private static boolean lllIlIIlllIlllI(final Object lllllllllllllIIIlIlllIlllIlIIIll, final Object lllllllllllllIIIlIlllIlllIlIIIlI) {
        return lllllllllllllIIIlIlllIlllIlIIIll == lllllllllllllIIIlIlllIlllIlIIIlI;
    }
    
    private static boolean lllIlIIlllIllll(final int lllllllllllllIIIlIlllIlllIIlllII) {
        return lllllllllllllIIIlIlllIlllIIlllII == 0;
    }
    
    public ItemGlassBottle() {
        this.setCreativeTab(CreativeTabs.tabBrewing);
        "".length();
    }
    
    static {
        lllIlIIlllIllII();
    }
    
    private static void lllIlIIlllIllII() {
        (lIlIIllllIIlIl = new int[2])[0] = " ".length();
        ItemGlassBottle.lIlIIllllIIlIl[1] = ((0x8F ^ 0xA1) & ~(0x89 ^ 0xA7));
    }
    
    private static boolean lllIlIIlllIllIl(final Object lllllllllllllIIIlIlllIlllIIlllll) {
        return lllllllllllllIIIlIlllIlllIIlllll == null;
    }
    
    private static boolean lllIlIIllllIIII(final int lllllllllllllIIIlIlllIlllIIllIIl) {
        return lllllllllllllIIIlIlllIlllIIllIIl <= 0;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIIIlIlllIlllIllIIII, final World lllllllllllllIIIlIlllIlllIlIlIIl, final EntityPlayer lllllllllllllIIIlIlllIlllIlIlllI) {
        final MovingObjectPosition lllllllllllllIIIlIlllIlllIlIllIl = this.getMovingObjectPositionFromPlayer(lllllllllllllIIIlIlllIlllIlIlIIl, lllllllllllllIIIlIlllIlllIlIlllI, (boolean)(ItemGlassBottle.lIlIIllllIIlIl[0] != 0));
        if (lllIlIIlllIllIl(lllllllllllllIIIlIlllIlllIlIllIl)) {
            return lllllllllllllIIIlIlllIlllIllIIII;
        }
        if (lllIlIIlllIlllI(lllllllllllllIIIlIlllIlllIlIllIl.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
            final BlockPos lllllllllllllIIIlIlllIlllIlIllII = lllllllllllllIIIlIlllIlllIlIllIl.getBlockPos();
            if (lllIlIIlllIllll(lllllllllllllIIIlIlllIlllIlIlIIl.isBlockModifiable(lllllllllllllIIIlIlllIlllIlIlllI, lllllllllllllIIIlIlllIlllIlIllII) ? 1 : 0)) {
                return lllllllllllllIIIlIlllIlllIllIIII;
            }
            if (lllIlIIlllIllll(lllllllllllllIIIlIlllIlllIlIlllI.canPlayerEdit(lllllllllllllIIIlIlllIlllIlIllII.offset(lllllllllllllIIIlIlllIlllIlIllIl.sideHit), lllllllllllllIIIlIlllIlllIlIllIl.sideHit, lllllllllllllIIIlIlllIlllIllIIII) ? 1 : 0)) {
                return lllllllllllllIIIlIlllIlllIllIIII;
            }
            if (lllIlIIlllIlllI(lllllllllllllIIIlIlllIlllIlIlIIl.getBlockState(lllllllllllllIIIlIlllIlllIlIllII).getBlock().getMaterial(), Material.water)) {
                lllllllllllllIIIlIlllIlllIllIIII.stackSize -= ItemGlassBottle.lIlIIllllIIlIl[0];
                lllllllllllllIIIlIlllIlllIlIlllI.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
                if (lllIlIIllllIIII(lllllllllllllIIIlIlllIlllIllIIII.stackSize)) {
                    return new ItemStack(Items.potionitem);
                }
                if (lllIlIIlllIllll(lllllllllllllIIIlIlllIlllIlIlllI.inventory.addItemStackToInventory(new ItemStack(Items.potionitem)) ? 1 : 0)) {
                    lllllllllllllIIIlIlllIlllIlIlllI.dropPlayerItemWithRandomChoice(new ItemStack(Items.potionitem, ItemGlassBottle.lIlIIllllIIlIl[0], ItemGlassBottle.lIlIIllllIIlIl[1]), (boolean)(ItemGlassBottle.lIlIIllllIIlIl[1] != 0));
                    "".length();
                }
            }
        }
        return lllllllllllllIIIlIlllIlllIllIIII;
    }
}
