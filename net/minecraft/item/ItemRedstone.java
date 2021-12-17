// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;

public class ItemRedstone extends Item
{
    private static final /* synthetic */ int[] lllllIlIlIlll;
    
    static {
        lIlIlllIlIlllIl();
    }
    
    private static boolean lIlIlllIlIllllI(final int lllllllllllllIlIlIllIlIlIIlIIlIl) {
        return lllllllllllllIlIlIllIlIlIIlIIlIl != 0;
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIlIlIllIlIlIIlIlllI, final EntityPlayer lllllllllllllIlIlIllIlIlIIlllIII, final World lllllllllllllIlIlIllIlIlIIlIllII, final BlockPos lllllllllllllIlIlIllIlIlIIllIllI, final EnumFacing lllllllllllllIlIlIllIlIlIIlIlIlI, final float lllllllllllllIlIlIllIlIlIIllIlII, final float lllllllllllllIlIlIllIlIlIIllIIll, final float lllllllllllllIlIlIllIlIlIIllIIlI) {
        final boolean lllllllllllllIlIlIllIlIlIIllIIIl = lllllllllllllIlIlIllIlIlIIlIllII.getBlockState(lllllllllllllIlIlIllIlIlIIllIllI).getBlock().isReplaceable(lllllllllllllIlIlIllIlIlIIlIllII, lllllllllllllIlIlIllIlIlIIllIllI);
        BlockPos offset;
        if (lIlIlllIlIllllI(lllllllllllllIlIlIllIlIlIIllIIIl ? 1 : 0)) {
            offset = lllllllllllllIlIlIllIlIlIIllIllI;
            "".length();
            if (null != null) {
                return ((0xD8 ^ 0x92) & ~(0xE9 ^ 0xA3)) != 0x0;
            }
        }
        else {
            offset = lllllllllllllIlIlIllIlIlIIllIllI.offset(lllllllllllllIlIlIllIlIlIIlIlIlI);
        }
        final BlockPos lllllllllllllIlIlIllIlIlIIllIIII = offset;
        if (lIlIlllIlIlllll(lllllllllllllIlIlIllIlIlIIlllIII.canPlayerEdit(lllllllllllllIlIlIllIlIlIIllIIII, lllllllllllllIlIlIllIlIlIIlIlIlI, lllllllllllllIlIlIllIlIlIIlIlllI) ? 1 : 0)) {
            return ItemRedstone.lllllIlIlIlll[0] != 0;
        }
        final Block lllllllllllllIlIlIllIlIlIIlIllll = lllllllllllllIlIlIllIlIlIIlIllII.getBlockState(lllllllllllllIlIlIllIlIlIIllIIII).getBlock();
        if (lIlIlllIlIlllll(lllllllllllllIlIlIllIlIlIIlIllII.canBlockBePlaced(lllllllllllllIlIlIllIlIlIIlIllll, lllllllllllllIlIlIllIlIlIIllIIII, (boolean)(ItemRedstone.lllllIlIlIlll[0] != 0), lllllllllllllIlIlIllIlIlIIlIlIlI, null, lllllllllllllIlIlIllIlIlIIlIlllI) ? 1 : 0)) {
            return ItemRedstone.lllllIlIlIlll[0] != 0;
        }
        if (lIlIlllIlIllllI(Blocks.redstone_wire.canPlaceBlockAt(lllllllllllllIlIlIllIlIlIIlIllII, lllllllllllllIlIlIllIlIlIIllIIII) ? 1 : 0)) {
            lllllllllllllIlIlIllIlIlIIlIlllI.stackSize -= ItemRedstone.lllllIlIlIlll[1];
            lllllllllllllIlIlIllIlIlIIlIllII.setBlockState(lllllllllllllIlIlIllIlIlIIllIIII, Blocks.redstone_wire.getDefaultState());
            "".length();
            return ItemRedstone.lllllIlIlIlll[1] != 0;
        }
        return ItemRedstone.lllllIlIlIlll[0] != 0;
    }
    
    private static void lIlIlllIlIlllIl() {
        (lllllIlIlIlll = new int[2])[0] = ((0x5A ^ 0x7B) & ~(0x2E ^ 0xF));
        ItemRedstone.lllllIlIlIlll[1] = " ".length();
    }
    
    public ItemRedstone() {
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
    }
    
    private static boolean lIlIlllIlIlllll(final int lllllllllllllIlIlIllIlIlIIlIIIll) {
        return lllllllllllllIlIlIllIlIlIIlIIIll == 0;
    }
}
