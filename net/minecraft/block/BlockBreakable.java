// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBreakable extends Block
{
    private static final /* synthetic */ int[] lIIllIlllIlIII;
    private /* synthetic */ boolean ignoreSimilarity;
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIIlIlIIlIlllIIIIlII, final BlockPos lllllllllllllIIlIlIIlIlllIIIlIIl, final EnumFacing lllllllllllllIIlIlIIlIlllIIIlIII) {
        final IBlockState lllllllllllllIIlIlIIlIlllIIIIlll = lllllllllllllIIlIlIIlIlllIIIIlII.getBlockState(lllllllllllllIIlIlIIlIlllIIIlIIl);
        final Block lllllllllllllIIlIlIIlIlllIIIIllI = lllllllllllllIIlIlIIlIlllIIIIlll.getBlock();
        if (!llIllIlIIIIIIIl(this, Blocks.glass) || llIllIlIIIIIIlI(this, Blocks.stained_glass)) {
            if (llIllIlIIIIIIIl(lllllllllllllIIlIlIIlIlllIIIIlII.getBlockState(lllllllllllllIIlIlIIlIlllIIIlIIl.offset(lllllllllllllIIlIlIIlIlllIIIlIII.getOpposite())), lllllllllllllIIlIlIIlIlllIIIIlll)) {
                return BlockBreakable.lIIllIlllIlIII[1] != 0;
            }
            if (llIllIlIIIIIIlI(lllllllllllllIIlIlIIlIlllIIIIllI, this)) {
                return BlockBreakable.lIIllIlllIlIII[0] != 0;
            }
        }
        int shouldSideBeRendered;
        if (llIllIlIIIIIIll(this.ignoreSimilarity ? 1 : 0) && llIllIlIIIIIIlI(lllllllllllllIIlIlIIlIlllIIIIllI, this)) {
            shouldSideBeRendered = BlockBreakable.lIIllIlllIlIII[0];
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x15 ^ 0x3B) & ~(0x46 ^ 0x68)) != 0x0;
            }
        }
        else {
            shouldSideBeRendered = (super.shouldSideBeRendered(lllllllllllllIIlIlIIlIlllIIIIlII, lllllllllllllIIlIlIIlIlllIIIlIIl, lllllllllllllIIlIlIIlIlllIIIlIII) ? 1 : 0);
        }
        return shouldSideBeRendered != 0;
    }
    
    static {
        llIllIlIIIIIIII();
    }
    
    private static boolean llIllIlIIIIIIll(final int lllllllllllllIIlIlIIlIllIlllIllI) {
        return lllllllllllllIIlIlIIlIllIlllIllI == 0;
    }
    
    protected BlockBreakable(final Material lllllllllllllIIlIlIIlIlllIIllIIl, final boolean lllllllllllllIIlIlIIlIlllIIlIlII, final MapColor lllllllllllllIIlIlIIlIlllIIlIIll) {
        super(lllllllllllllIIlIlIIlIlllIIllIIl, lllllllllllllIIlIlIIlIlllIIlIIll);
        this.ignoreSimilarity = lllllllllllllIIlIlIIlIlllIIlIlII;
    }
    
    private static void llIllIlIIIIIIII() {
        (lIIllIlllIlIII = new int[2])[0] = ((0xD6 ^ 0x9A) & ~(0x79 ^ 0x35));
        BlockBreakable.lIIllIlllIlIII[1] = " ".length();
    }
    
    private static boolean llIllIlIIIIIIIl(final Object lllllllllllllIIlIlIIlIllIlllllIl, final Object lllllllllllllIIlIlIIlIllIlllllII) {
        return lllllllllllllIIlIlIIlIllIlllllIl != lllllllllllllIIlIlIIlIllIlllllII;
    }
    
    private static boolean llIllIlIIIIIIlI(final Object lllllllllllllIIlIlIIlIllIllllIIl, final Object lllllllllllllIIlIlIIlIllIllllIII) {
        return lllllllllllllIIlIlIIlIllIllllIIl == lllllllllllllIIlIlIIlIllIllllIII;
    }
    
    protected BlockBreakable(final Material lllllllllllllIIlIlIIlIlllIlIIIII, final boolean lllllllllllllIIlIlIIlIlllIIlllll) {
        this(lllllllllllllIIlIlIIlIlllIlIIIII, lllllllllllllIIlIlIIlIlllIIlllll, lllllllllllllIIlIlIIlIlllIlIIIII.getMaterialMapColor());
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockBreakable.lIIllIlllIlIII[0] != 0;
    }
}
