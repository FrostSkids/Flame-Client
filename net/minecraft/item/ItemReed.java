// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockSnow;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

public class ItemReed extends Item
{
    private static final /* synthetic */ int[] lIlIllIIIIIIlI;
    private /* synthetic */ Block block;
    
    private static boolean llllIIIIIIIllll(final int lllllllllllllIIIIllllIIIIlllIIII) {
        return lllllllllllllIIIIllllIIIIlllIIII == 0;
    }
    
    static {
        llllIIIIIIIllII();
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIIIIllllIIIlIIIIllI, final EntityPlayer lllllllllllllIIIIllllIIIlIIIIlIl, final World lllllllllllllIIIIllllIIIlIIlIIII, BlockPos lllllllllllllIIIIllllIIIlIIIIIll, EnumFacing lllllllllllllIIIIllllIIIlIIIIIlI, final float lllllllllllllIIIIllllIIIlIIIllIl, final float lllllllllllllIIIIllllIIIlIIIllII, final float lllllllllllllIIIIllllIIIlIIIlIll) {
        final IBlockState lllllllllllllIIIIllllIIIlIIIlIlI = lllllllllllllIIIIllllIIIlIIlIIII.getBlockState(lllllllllllllIIIIllllIIIlIIIIIll);
        final Block lllllllllllllIIIIllllIIIlIIIlIIl = lllllllllllllIIIIllllIIIlIIIlIlI.getBlock();
        if (llllIIIIIIIllIl(lllllllllllllIIIIllllIIIlIIIlIIl, Blocks.snow_layer) && llllIIIIIIIlllI(lllllllllllllIIIIllllIIIlIIIlIlI.getValue((IProperty<Integer>)BlockSnow.LAYERS), ItemReed.lIlIllIIIIIIlI[0])) {
            lllllllllllllIIIIllllIIIlIIIIIlI = EnumFacing.UP;
            "".length();
            if (-" ".length() > "   ".length()) {
                return ((0xF0 ^ 0xA7 ^ (0x48 ^ 0x1A)) & (0xC6 ^ 0xA1 ^ (0x3D ^ 0x5F) ^ -" ".length())) != 0x0;
            }
        }
        else if (llllIIIIIIIllll(lllllllllllllIIIIllllIIIlIIIlIIl.isReplaceable(lllllllllllllIIIIllllIIIlIIlIIII, lllllllllllllIIIIllllIIIlIIIIIll) ? 1 : 0)) {
            lllllllllllllIIIIllllIIIlIIIIIll = lllllllllllllIIIIllllIIIlIIIIIll.offset((EnumFacing)lllllllllllllIIIIllllIIIlIIIIIlI);
        }
        if (llllIIIIIIIllll(lllllllllllllIIIIllllIIIlIIIIlIl.canPlayerEdit(lllllllllllllIIIIllllIIIlIIIIIll, (EnumFacing)lllllllllllllIIIIllllIIIlIIIIIlI, lllllllllllllIIIIllllIIIlIIIIllI) ? 1 : 0)) {
            return ItemReed.lIlIllIIIIIIlI[1] != 0;
        }
        if (llllIIIIIIIllll(lllllllllllllIIIIllllIIIlIIIIllI.stackSize)) {
            return ItemReed.lIlIllIIIIIIlI[1] != 0;
        }
        if (llllIIIIIIlIIII(lllllllllllllIIIIllllIIIlIIlIIII.canBlockBePlaced(this.block, lllllllllllllIIIIllllIIIlIIIIIll, (boolean)(ItemReed.lIlIllIIIIIIlI[1] != 0), (EnumFacing)lllllllllllllIIIIllllIIIlIIIIIlI, null, lllllllllllllIIIIllllIIIlIIIIllI) ? 1 : 0)) {
            IBlockState lllllllllllllIIIIllllIIIlIIIlIII = this.block.onBlockPlaced(lllllllllllllIIIIllllIIIlIIlIIII, lllllllllllllIIIIllllIIIlIIIIIll, (EnumFacing)lllllllllllllIIIIllllIIIlIIIIIlI, lllllllllllllIIIIllllIIIlIIIllIl, lllllllllllllIIIIllllIIIlIIIllII, lllllllllllllIIIIllllIIIlIIIlIll, ItemReed.lIlIllIIIIIIlI[1], lllllllllllllIIIIllllIIIlIIIIlIl);
            if (llllIIIIIIlIIII(lllllllllllllIIIIllllIIIlIIlIIII.setBlockState(lllllllllllllIIIIllllIIIlIIIIIll, lllllllllllllIIIIllllIIIlIIIlIII, ItemReed.lIlIllIIIIIIlI[2]) ? 1 : 0)) {
                lllllllllllllIIIIllllIIIlIIIlIII = lllllllllllllIIIIllllIIIlIIlIIII.getBlockState(lllllllllllllIIIIllllIIIlIIIIIll);
                if (llllIIIIIIIllIl(lllllllllllllIIIIllllIIIlIIIlIII.getBlock(), this.block)) {
                    ItemBlock.setTileEntityNBT(lllllllllllllIIIIllllIIIlIIlIIII, lllllllllllllIIIIllllIIIlIIIIlIl, lllllllllllllIIIIllllIIIlIIIIIll, lllllllllllllIIIIllllIIIlIIIIllI);
                    "".length();
                    lllllllllllllIIIIllllIIIlIIIlIII.getBlock().onBlockPlacedBy(lllllllllllllIIIIllllIIIlIIlIIII, lllllllllllllIIIIllllIIIlIIIIIll, lllllllllllllIIIIllllIIIlIIIlIII, lllllllllllllIIIIllllIIIlIIIIlIl, lllllllllllllIIIIllllIIIlIIIIllI);
                }
                lllllllllllllIIIIllllIIIlIIlIIII.playSoundEffect(lllllllllllllIIIIllllIIIlIIIIIll.getX() + 0.5f, lllllllllllllIIIIllllIIIlIIIIIll.getY() + 0.5f, lllllllllllllIIIIllllIIIlIIIIIll.getZ() + 0.5f, this.block.stepSound.getPlaceSound(), (this.block.stepSound.getVolume() + 1.0f) / 2.0f, this.block.stepSound.getFrequency() * 0.8f);
                lllllllllllllIIIIllllIIIlIIIIllI.stackSize -= ItemReed.lIlIllIIIIIIlI[0];
                return ItemReed.lIlIllIIIIIIlI[0] != 0;
            }
        }
        return ItemReed.lIlIllIIIIIIlI[1] != 0;
    }
    
    public ItemReed(final Block lllllllllllllIIIIllllIIIlIlIIIlI) {
        this.block = lllllllllllllIIIIllllIIIlIlIIIlI;
    }
    
    private static boolean llllIIIIIIlIIII(final int lllllllllllllIIIIllllIIIIlllIIlI) {
        return lllllllllllllIIIIllllIIIIlllIIlI != 0;
    }
    
    private static boolean llllIIIIIIIllIl(final Object lllllllllllllIIIIllllIIIIlllIlIl, final Object lllllllllllllIIIIllllIIIIlllIlII) {
        return lllllllllllllIIIIllllIIIIlllIlIl == lllllllllllllIIIIllllIIIIlllIlII;
    }
    
    private static boolean llllIIIIIIIlllI(final int lllllllllllllIIIIllllIIIIllllIIl, final int lllllllllllllIIIIllllIIIIllllIII) {
        return lllllllllllllIIIIllllIIIIllllIIl < lllllllllllllIIIIllllIIIIllllIII;
    }
    
    private static void llllIIIIIIIllII() {
        (lIlIllIIIIIIlI = new int[3])[0] = " ".length();
        ItemReed.lIlIllIIIIIIlI[1] = ((0xD3 ^ 0x8B) & ~(0x7B ^ 0x23));
        ItemReed.lIlIllIIIIIIlI[2] = "   ".length();
    }
}
