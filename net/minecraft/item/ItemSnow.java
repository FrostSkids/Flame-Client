// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockSnow;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;

public class ItemSnow extends ItemBlock
{
    private static final /* synthetic */ int[] lIlIIIllIIIIlI;
    
    @Override
    public int getMetadata(final int lllllllllllllIIIllllIlIlIlIlIIIl) {
        return lllllllllllllIIIllllIlIlIlIlIIIl;
    }
    
    private static boolean lllIIIllIllIlIl(final Object lllllllllllllIIIllllIlIlIlIIIlII, final Object lllllllllllllIIIllllIlIlIlIIIIlI) {
        return lllllllllllllIIIllllIlIlIlIIIlII != lllllllllllllIIIllllIlIlIlIIIIlI;
    }
    
    private static boolean lllIIIllIllIIll(final int lllllllllllllIIIllllIlIlIIllIIII) {
        return lllllllllllllIIIllllIlIlIIllIIII == 0;
    }
    
    public ItemSnow(final Block lllllllllllllIIIllllIlIllIlIlIll) {
        super(lllllllllllllIIIllllIlIllIlIlIll);
        this.setMaxDamage(ItemSnow.lIlIIIllIIIIlI[0]);
        "".length();
        this.setHasSubtypes((boolean)(ItemSnow.lIlIIIllIIIIlI[1] != 0));
        "".length();
    }
    
    static {
        lllIIIllIllIIlI();
    }
    
    private static boolean lllIIIllIlllIII(final int lllllllllllllIIIllllIlIlIIllIlII) {
        return lllllllllllllIIIllllIlIlIIllIlII != 0;
    }
    
    private static boolean lllIIIllIllIlII(final Object lllllllllllllIIIllllIlIlIIlllIll, final Object lllllllllllllIIIllllIlIlIIlllIIl) {
        return lllllllllllllIIIllllIlIlIIlllIll == lllllllllllllIIIllllIlIlIIlllIIl;
    }
    
    private static void lllIIIllIllIIlI() {
        (lIlIIIllIIIIlI = new int[4])[0] = ((0x3F ^ 0x35) & ~(0x4D ^ 0x47));
        ItemSnow.lIlIIIllIIIIlI[1] = " ".length();
        ItemSnow.lIlIIIllIIIIlI[2] = (0x22 ^ 0x25);
        ItemSnow.lIlIIIllIIIIlI[3] = "  ".length();
    }
    
    private static boolean lllIIIllIllIlll(final Object lllllllllllllIIIllllIlIlIIllIllI) {
        return lllllllllllllIIIllllIlIlIIllIllI != null;
    }
    
    private static boolean lllIIIllIllIllI(final int lllllllllllllIIIllllIlIlIlIIllIl, final int lllllllllllllIIIllllIlIlIlIIlIll) {
        return lllllllllllllIIIllllIlIlIlIIllIl <= lllllllllllllIIIllllIlIlIlIIlIll;
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIIIllllIlIllIIIIlIl, final EntityPlayer lllllllllllllIIIllllIlIllIIIIIll, final World lllllllllllllIIIllllIlIllIIIIIIl, final BlockPos lllllllllllllIIIllllIlIlIlllllll, final EnumFacing lllllllllllllIIIllllIlIlIllIIlII, final float lllllllllllllIIIllllIlIlIllIIIll, final float lllllllllllllIIIllllIlIlIllIIIIl, final float lllllllllllllIIIllllIlIlIllIIIII) {
        if (lllIIIllIllIIll(lllllllllllllIIIllllIlIllIIIIlIl.stackSize)) {
            return ItemSnow.lIlIIIllIIIIlI[0] != 0;
        }
        if (lllIIIllIllIIll(lllllllllllllIIIllllIlIllIIIIIll.canPlayerEdit(lllllllllllllIIIllllIlIlIlllllll, lllllllllllllIIIllllIlIlIllIIlII, lllllllllllllIIIllllIlIllIIIIlIl) ? 1 : 0)) {
            return ItemSnow.lIlIIIllIIIIlI[0] != 0;
        }
        IBlockState lllllllllllllIIIllllIlIlIlllIlll = lllllllllllllIIIllllIlIllIIIIIIl.getBlockState(lllllllllllllIIIllllIlIlIlllllll);
        Block lllllllllllllIIIllllIlIlIlllIllI = lllllllllllllIIIllllIlIlIlllIlll.getBlock();
        BlockPos lllllllllllllIIIllllIlIlIlllIlII = lllllllllllllIIIllllIlIlIlllllll;
        if ((!lllIIIllIllIlII(lllllllllllllIIIllllIlIlIllIIlII, EnumFacing.UP) || lllIIIllIllIlIl(lllllllllllllIIIllllIlIlIlllIllI, this.block)) && lllIIIllIllIIll(lllllllllllllIIIllllIlIlIlllIllI.isReplaceable(lllllllllllllIIIllllIlIllIIIIIIl, lllllllllllllIIIllllIlIlIlllllll) ? 1 : 0)) {
            lllllllllllllIIIllllIlIlIlllIlII = lllllllllllllIIIllllIlIlIlllllll.offset(lllllllllllllIIIllllIlIlIllIIlII);
            lllllllllllllIIIllllIlIlIlllIlll = lllllllllllllIIIllllIlIllIIIIIIl.getBlockState(lllllllllllllIIIllllIlIlIlllIlII);
            lllllllllllllIIIllllIlIlIlllIllI = lllllllllllllIIIllllIlIlIlllIlll.getBlock();
        }
        if (lllIIIllIllIlII(lllllllllllllIIIllllIlIlIlllIllI, this.block)) {
            final int lllllllllllllIIIllllIlIlIlllIIlI = lllllllllllllIIIllllIlIlIlllIlll.getValue((IProperty<Integer>)BlockSnow.LAYERS);
            if (lllIIIllIllIllI(lllllllllllllIIIllllIlIlIlllIIlI, ItemSnow.lIlIIIllIIIIlI[2])) {
                final IBlockState lllllllllllllIIIllllIlIlIlllIIII = lllllllllllllIIIllllIlIlIlllIlll.withProperty((IProperty<Comparable>)BlockSnow.LAYERS, lllllllllllllIIIllllIlIlIlllIIlI + ItemSnow.lIlIIIllIIIIlI[1]);
                final AxisAlignedBB lllllllllllllIIIllllIlIlIllIlllI = this.block.getCollisionBoundingBox(lllllllllllllIIIllllIlIllIIIIIIl, lllllllllllllIIIllllIlIlIlllIlII, lllllllllllllIIIllllIlIlIlllIIII);
                if (lllIIIllIllIlll(lllllllllllllIIIllllIlIlIllIlllI) && lllIIIllIlllIII(lllllllllllllIIIllllIlIllIIIIIIl.checkNoEntityCollision(lllllllllllllIIIllllIlIlIllIlllI) ? 1 : 0) && lllIIIllIlllIII(lllllllllllllIIIllllIlIllIIIIIIl.setBlockState(lllllllllllllIIIllllIlIlIlllIlII, lllllllllllllIIIllllIlIlIlllIIII, ItemSnow.lIlIIIllIIIIlI[3]) ? 1 : 0)) {
                    lllllllllllllIIIllllIlIllIIIIIIl.playSoundEffect(lllllllllllllIIIllllIlIlIlllIlII.getX() + 0.5f, lllllllllllllIIIllllIlIlIlllIlII.getY() + 0.5f, lllllllllllllIIIllllIlIlIlllIlII.getZ() + 0.5f, this.block.stepSound.getPlaceSound(), (this.block.stepSound.getVolume() + 1.0f) / 2.0f, this.block.stepSound.getFrequency() * 0.8f);
                    lllllllllllllIIIllllIlIllIIIIlIl.stackSize -= ItemSnow.lIlIIIllIIIIlI[1];
                    return ItemSnow.lIlIIIllIIIIlI[1] != 0;
                }
            }
        }
        return super.onItemUse(lllllllllllllIIIllllIlIllIIIIlIl, lllllllllllllIIIllllIlIllIIIIIll, lllllllllllllIIIllllIlIllIIIIIIl, lllllllllllllIIIllllIlIlIlllIlII, lllllllllllllIIIllllIlIlIllIIlII, lllllllllllllIIIllllIlIlIllIIIll, lllllllllllllIIIllllIlIlIllIIIIl, lllllllllllllIIIllllIlIlIllIIIII);
    }
}
