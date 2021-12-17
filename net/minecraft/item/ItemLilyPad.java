// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.stats.StatList;
import net.minecraft.init.Blocks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ItemLilyPad extends ItemColored
{
    private static final /* synthetic */ int[] lIIIlIIlIIIIll;
    
    private static boolean lIllllllIIlIllI(final Object lllllllllllllIlIIIlIlIllIllIIIIl) {
        return lllllllllllllIlIIIlIlIllIllIIIIl == null;
    }
    
    private static void lIllllllIIlIlIl() {
        (lIIIlIIlIIIIll = new int[2])[0] = ((0xA1 ^ 0xB9) & ~(0x77 ^ 0x6F));
        ItemLilyPad.lIIIlIIlIIIIll[1] = " ".length();
    }
    
    private static boolean lIllllllIIllIIl(final int lllllllllllllIlIIIlIlIllIlIlllll) {
        return lllllllllllllIlIIIlIlIllIlIlllll != 0;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIlIIIlIlIllIlllIIlI, final World lllllllllllllIlIIIlIlIllIlllIIIl, final EntityPlayer lllllllllllllIlIIIlIlIllIlllIIII) {
        final MovingObjectPosition lllllllllllllIlIIIlIlIllIlllIlll = this.getMovingObjectPositionFromPlayer(lllllllllllllIlIIIlIlIllIlllIIIl, lllllllllllllIlIIIlIlIllIlllIIII, (boolean)(ItemLilyPad.lIIIlIIlIIIIll[1] != 0));
        if (lIllllllIIlIllI(lllllllllllllIlIIIlIlIllIlllIlll)) {
            return lllllllllllllIlIIIlIlIllIlllIIlI;
        }
        if (lIllllllIIlIlll(lllllllllllllIlIIIlIlIllIlllIlll.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
            final BlockPos lllllllllllllIlIIIlIlIllIlllIllI = lllllllllllllIlIIIlIlIllIlllIlll.getBlockPos();
            if (lIllllllIIllIII(lllllllllllllIlIIIlIlIllIlllIIIl.isBlockModifiable(lllllllllllllIlIIIlIlIllIlllIIII, lllllllllllllIlIIIlIlIllIlllIllI) ? 1 : 0)) {
                return lllllllllllllIlIIIlIlIllIlllIIlI;
            }
            if (lIllllllIIllIII(lllllllllllllIlIIIlIlIllIlllIIII.canPlayerEdit(lllllllllllllIlIIIlIlIllIlllIllI.offset(lllllllllllllIlIIIlIlIllIlllIlll.sideHit), lllllllllllllIlIIIlIlIllIlllIlll.sideHit, lllllllllllllIlIIIlIlIllIlllIIlI) ? 1 : 0)) {
                return lllllllllllllIlIIIlIlIllIlllIIlI;
            }
            final BlockPos lllllllllllllIlIIIlIlIllIlllIlIl = lllllllllllllIlIIIlIlIllIlllIllI.up();
            final IBlockState lllllllllllllIlIIIlIlIllIlllIlII = lllllllllllllIlIIIlIlIllIlllIIIl.getBlockState(lllllllllllllIlIIIlIlIllIlllIllI);
            if (lIllllllIIlIlll(lllllllllllllIlIIIlIlIllIlllIlII.getBlock().getMaterial(), Material.water) && lIllllllIIllIII(lllllllllllllIlIIIlIlIllIlllIlII.getValue((IProperty<Integer>)BlockLiquid.LEVEL)) && lIllllllIIllIIl(lllllllllllllIlIIIlIlIllIlllIIIl.isAirBlock(lllllllllllllIlIIIlIlIllIlllIlIl) ? 1 : 0)) {
                lllllllllllllIlIIIlIlIllIlllIIIl.setBlockState(lllllllllllllIlIIIlIlIllIlllIlIl, Blocks.waterlily.getDefaultState());
                "".length();
                if (lIllllllIIllIII(lllllllllllllIlIIIlIlIllIlllIIII.capabilities.isCreativeMode ? 1 : 0)) {
                    lllllllllllllIlIIIlIlIllIlllIIlI.stackSize -= ItemLilyPad.lIIIlIIlIIIIll[1];
                }
                lllllllllllllIlIIIlIlIllIlllIIII.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
            }
        }
        return lllllllllllllIlIIIlIlIllIlllIIlI;
    }
    
    public ItemLilyPad(final Block lllllllllllllIlIIIlIlIlllIIIIlII) {
        super(lllllllllllllIlIIIlIlIlllIIIIlII, (boolean)(ItemLilyPad.lIIIlIIlIIIIll[0] != 0));
    }
    
    private static boolean lIllllllIIlIlll(final Object lllllllllllllIlIIIlIlIllIllIIlII, final Object lllllllllllllIlIIIlIlIllIllIIIll) {
        return lllllllllllllIlIIIlIlIllIllIIlII == lllllllllllllIlIIIlIlIllIllIIIll;
    }
    
    @Override
    public int getColorFromItemStack(final ItemStack lllllllllllllIlIIIlIlIllIllIIlll, final int lllllllllllllIlIIIlIlIllIllIlIII) {
        return Blocks.waterlily.getRenderColor(Blocks.waterlily.getStateFromMeta(lllllllllllllIlIIIlIlIllIllIIlll.getMetadata()));
    }
    
    static {
        lIllllllIIlIlIl();
    }
    
    private static boolean lIllllllIIllIII(final int lllllllllllllIlIIIlIlIllIlIlllIl) {
        return lllllllllllllIlIIIlIlIllIlIlllIl == 0;
    }
}
