// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockLilyPad extends BlockBush
{
    private static final /* synthetic */ int[] lIllIIlIIlIIIl;
    
    static {
        lllllIIlIlllllI();
    }
    
    private static boolean lllllIIllIIIIll(final int lllllllllllllIIIIIlIIIllllllIIIl, final int lllllllllllllIIIIIlIIIllllllIIII) {
        return lllllllllllllIIIIIlIIIllllllIIIl < lllllllllllllIIIIIlIIIllllllIIII;
    }
    
    @Override
    public int colorMultiplier(final IBlockAccess lllllllllllllIIIIIlIIlIIIIIIIlll, final BlockPos lllllllllllllIIIIIlIIlIIIIIIIllI, final int lllllllllllllIIIIIlIIlIIIIIIIlIl) {
        return BlockLilyPad.lIllIIlIIlIIIl[1];
    }
    
    private static boolean lllllIIllIIIIIl(final Object lllllllllllllIIIIIlIIIlllllIlIll, final Object lllllllllllllIIIIIlIIIlllllIlIlI) {
        return lllllllllllllIIIIIlIIIlllllIlIll == lllllllllllllIIIIIlIIIlllllIlIlI;
    }
    
    private static boolean lllllIIllIIIIlI(final int lllllllllllllIIIIIlIIIlllllIIllI) {
        return lllllllllllllIIIIIlIIIlllllIIllI >= 0;
    }
    
    private static boolean lllllIIllIIIIII(final int lllllllllllllIIIIIlIIIlllllIlIII) {
        return lllllllllllllIIIIIlIIIlllllIlIII == 0;
    }
    
    @Override
    public void addCollisionBoxesToList(final World lllllllllllllIIIIIlIIlIIIIIllIIl, final BlockPos lllllllllllllIIIIIlIIlIIIIIllIII, final IBlockState lllllllllllllIIIIIlIIlIIIIIllllI, final AxisAlignedBB lllllllllllllIIIIIlIIlIIIIIlIllI, final List<AxisAlignedBB> lllllllllllllIIIIIlIIlIIIIIlllII, final Entity lllllllllllllIIIIIlIIlIIIIIlIlII) {
        if (!lllllIIlIllllll(lllllllllllllIIIIIlIIlIIIIIlIlII) || lllllIIllIIIIII((lllllllllllllIIIIIlIIlIIIIIlIlII instanceof EntityBoat) ? 1 : 0)) {
            super.addCollisionBoxesToList(lllllllllllllIIIIIlIIlIIIIIllIIl, lllllllllllllIIIIIlIIlIIIIIllIII, lllllllllllllIIIIIlIIlIIIIIllllI, lllllllllllllIIIIIlIIlIIIIIlIllI, lllllllllllllIIIIIlIIlIIIIIlllII, lllllllllllllIIIIIlIIlIIIIIlIlII);
        }
    }
    
    @Override
    protected boolean canPlaceBlockOn(final Block lllllllllllllIIIIIlIIlIIIIIIIIlI) {
        if (lllllIIllIIIIIl(lllllllllllllIIIIIlIIlIIIIIIIIlI, Blocks.water)) {
            return BlockLilyPad.lIllIIlIIlIIIl[2] != 0;
        }
        return BlockLilyPad.lIllIIlIIlIIIl[3] != 0;
    }
    
    @Override
    public boolean canBlockStay(final World lllllllllllllIIIIIlIIIlllllllIII, final BlockPos lllllllllllllIIIIIlIIIlllllllIll, final IBlockState lllllllllllllIIIIIlIIIlllllllIlI) {
        if (!lllllIIllIIIIlI(lllllllllllllIIIIIlIIIlllllllIll.getY()) || !lllllIIllIIIIll(lllllllllllllIIIIIlIIIlllllllIll.getY(), BlockLilyPad.lIllIIlIIlIIIl[4])) {
            return BlockLilyPad.lIllIIlIIlIIIl[3] != 0;
        }
        final IBlockState lllllllllllllIIIIIlIIIlllllllIIl = lllllllllllllIIIIIlIIIlllllllIII.getBlockState(lllllllllllllIIIIIlIIIlllllllIll.down());
        if (lllllIIllIIIIIl(lllllllllllllIIIIIlIIIlllllllIIl.getBlock().getMaterial(), Material.water) && lllllIIllIIIIII(lllllllllllllIIIIIlIIIlllllllIIl.getValue((IProperty<Integer>)BlockLiquid.LEVEL))) {
            return BlockLilyPad.lIllIIlIIlIIIl[2] != 0;
        }
        return BlockLilyPad.lIllIIlIIlIIIl[3] != 0;
    }
    
    @Override
    public int getRenderColor(final IBlockState lllllllllllllIIIIIlIIlIIIIIIlIIl) {
        return BlockLilyPad.lIllIIlIIlIIIl[0];
    }
    
    private static boolean lllllIIlIllllll(final Object lllllllllllllIIIIIlIIIlllllIlllI) {
        return lllllllllllllIIIIIlIIIlllllIlllI != null;
    }
    
    @Override
    public int getBlockColor() {
        return BlockLilyPad.lIllIIlIIlIIIl[0];
    }
    
    private static void lllllIIlIlllllI() {
        (lIllIIlIIlIIIl = new int[5])[0] = (0xFFFFE7DE & 0x71DB7D);
        BlockLilyPad.lIllIIlIIlIIIl[1] = (0xFFFFC57F & 0x20BAB0);
        BlockLilyPad.lIllIIlIIlIIIl[2] = " ".length();
        BlockLilyPad.lIllIIlIIlIIIl[3] = ((0x27 ^ 0x63) & ~(0x54 ^ 0x10));
        BlockLilyPad.lIllIIlIIlIIIl[4] = (0xFFFFB1DD & 0x4F22);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIIIlIIIllllllIlII) {
        return BlockLilyPad.lIllIIlIIlIIIl[3];
    }
    
    protected BlockLilyPad() {
        final float lllllllllllllIIIIIlIIlIIIIlIllIl = 0.5f;
        final float lllllllllllllIIIIIlIIlIIIIlIllII = 0.015625f;
        this.setBlockBounds(0.5f - lllllllllllllIIIIIlIIlIIIIlIllIl, 0.0f, 0.5f - lllllllllllllIIIIIlIIlIIIIlIllIl, 0.5f + lllllllllllllIIIIIlIIlIIIIlIllIl, lllllllllllllIIIIIlIIlIIIIlIllII, 0.5f + lllllllllllllIIIIIlIIlIIIIlIllIl);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIIIIlIIlIIIIIlIIII, final BlockPos lllllllllllllIIIIIlIIlIIIIIIllll, final IBlockState lllllllllllllIIIIIlIIlIIIIIIlllI) {
        return new AxisAlignedBB(lllllllllllllIIIIIlIIlIIIIIIllll.getX() + this.minX, lllllllllllllIIIIIlIIlIIIIIIllll.getY() + this.minY, lllllllllllllIIIIIlIIlIIIIIIllll.getZ() + this.minZ, lllllllllllllIIIIIlIIlIIIIIIllll.getX() + this.maxX, lllllllllllllIIIIIlIIlIIIIIIllll.getY() + this.maxY, lllllllllllllIIIIIlIIlIIIIIIllll.getZ() + this.maxZ);
    }
}
