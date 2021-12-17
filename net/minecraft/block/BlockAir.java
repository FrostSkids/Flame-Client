// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockAir extends Block
{
    private static final /* synthetic */ int[] llllIIllIIIIl;
    
    @Override
    public boolean isOpaqueCube() {
        return BlockAir.llllIIllIIIIl[1] != 0;
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World lllllllllllllIlIlllIIlIlIlIIIllI, final BlockPos lllllllllllllIlIlllIIlIlIlIIIlIl, final IBlockState lllllllllllllIlIlllIIlIlIlIIIlII, final float lllllllllllllIlIlllIIlIlIlIIIIll, final int lllllllllllllIlIlllIIlIlIlIIIIlI) {
    }
    
    private static void lIlIlIIIlIlllIl() {
        (llllIIllIIIIl = new int[3])[0] = -" ".length();
        BlockAir.llllIIllIIIIl[1] = ((0xF3 ^ 0xA3) & ~(0x4E ^ 0x1E));
        BlockAir.llllIIllIIIIl[2] = " ".length();
    }
    
    protected BlockAir() {
        super(Material.air);
    }
    
    @Override
    public int getRenderType() {
        return BlockAir.llllIIllIIIIl[0];
    }
    
    @Override
    public boolean isReplaceable(final World lllllllllllllIlIlllIIlIlIlIIIIII, final BlockPos lllllllllllllIlIlllIIlIlIIllllll) {
        return BlockAir.llllIIllIIIIl[2] != 0;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIlllIIlIlIlIIlllI, final BlockPos lllllllllllllIlIlllIIlIlIlIIllIl, final IBlockState lllllllllllllIlIlllIIlIlIlIIllII) {
        return null;
    }
    
    static {
        lIlIlIIIlIlllIl();
    }
    
    @Override
    public boolean canCollideCheck(final IBlockState lllllllllllllIlIlllIIlIlIlIIlIIl, final boolean lllllllllllllIlIlllIIlIlIlIIlIII) {
        return BlockAir.llllIIllIIIIl[1] != 0;
    }
}
