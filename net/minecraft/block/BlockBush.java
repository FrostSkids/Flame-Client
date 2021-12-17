// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.init.Blocks;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;

public class BlockBush extends Block
{
    private static final /* synthetic */ int[] llIIllllIlllll;
    
    protected BlockBush(final Material llllllllllllIllIlllIlIIIIIIIIlll) {
        this(llllllllllllIllIlllIlIIIIIIIIlll, llllllllllllIllIlllIlIIIIIIIIlll.getMaterialMapColor());
    }
    
    @Override
    public boolean canPlaceBlockAt(final World llllllllllllIllIlllIIlllllllIlII, final BlockPos llllllllllllIllIlllIIlllllllIIll) {
        if (lIIlIIIIIlllIlll(super.canPlaceBlockAt(llllllllllllIllIlllIIlllllllIlII, llllllllllllIllIlllIIlllllllIIll) ? 1 : 0) && lIIlIIIIIlllIlll(this.canPlaceBlockOn(llllllllllllIllIlllIIlllllllIlII.getBlockState(llllllllllllIllIlllIIlllllllIIll.down()).getBlock()) ? 1 : 0)) {
            return BlockBush.llIIllllIlllll[0] != 0;
        }
        return BlockBush.llIIllllIlllll[1] != 0;
    }
    
    private static void lIIlIIIIIlllIllI() {
        (llIIllllIlllll = new int[3])[0] = " ".length();
        BlockBush.llIIllllIlllll[1] = ((0x61 ^ 0x54) & ~(0x86 ^ 0xB3));
        BlockBush.llIIllllIlllll[2] = "   ".length();
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockBush.llIIllllIlllll[1] != 0;
    }
    
    @Override
    public void updateTick(final World llllllllllllIllIlllIIlllllIlIlll, final BlockPos llllllllllllIllIlllIIlllllIlIllI, final IBlockState llllllllllllIllIlllIIlllllIlIlIl, final Random llllllllllllIllIlllIIlllllIlIlII) {
        this.checkAndDropBlock(llllllllllllIllIlllIIlllllIlIlll, llllllllllllIllIlllIIlllllIlIllI, llllllllllllIllIlllIIlllllIlIlIl);
    }
    
    public boolean canBlockStay(final World llllllllllllIllIlllIIllllIllllll, final BlockPos llllllllllllIllIlllIIllllIlllllI, final IBlockState llllllllllllIllIlllIIllllIllllIl) {
        return this.canPlaceBlockOn(llllllllllllIllIlllIIllllIllllll.getBlockState(llllllllllllIllIlllIIllllIlllllI.down()).getBlock());
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllIlllIIllllllIIIII, final BlockPos llllllllllllIllIlllIIllllllIIlII, final IBlockState llllllllllllIllIlllIIllllllIIIll, final Block llllllllllllIllIlllIIlllllIlllIl) {
        super.onNeighborBlockChange(llllllllllllIllIlllIIllllllIIIII, llllllllllllIllIlllIIllllllIIlII, llllllllllllIllIlllIIllllllIIIll, llllllllllllIllIlllIIlllllIlllIl);
        this.checkAndDropBlock(llllllllllllIllIlllIIllllllIIIII, llllllllllllIllIlllIIllllllIIlII, llllllllllllIllIlllIIllllllIIIll);
    }
    
    private static boolean lIIlIIIIIlllIlll(final int llllllllllllIllIlllIIllllIlIllIl) {
        return llllllllllllIllIlllIIllllIlIllIl != 0;
    }
    
    protected BlockBush(final Material llllllllllllIllIlllIIllllllllIll, final MapColor llllllllllllIllIlllIIllllllllllI) {
        super(llllllllllllIllIlllIIllllllllIll, llllllllllllIllIlllIIllllllllllI);
        this.setTickRandomly((boolean)(BlockBush.llIIllllIlllll[0] != 0));
        "".length();
        final float llllllllllllIllIlllIIlllllllllIl = 0.2f;
        this.setBlockBounds(0.5f - llllllllllllIllIlllIIlllllllllIl, 0.0f, 0.5f - llllllllllllIllIlllIIlllllllllIl, 0.5f + llllllllllllIllIlllIIlllllllllIl, llllllllllllIllIlllIIlllllllllIl * 3.0f, 0.5f + llllllllllllIllIlllIIlllllllllIl);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    protected BlockBush() {
        this(Material.plants);
    }
    
    private static boolean lIIlIIIIIllllIII(final Object llllllllllllIllIlllIIllllIllIIII, final Object llllllllllllIllIlllIIllllIlIllll) {
        return llllllllllllIllIlllIIllllIllIIII != llllllllllllIllIlllIIllllIlIllll;
    }
    
    private static boolean lIIlIIIIIllllIIl(final int llllllllllllIllIlllIIllllIlIlIll) {
        return llllllllllllIllIlllIIllllIlIlIll == 0;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIllIlllIIllllIlllIII, final BlockPos llllllllllllIllIlllIIllllIllIlll, final IBlockState llllllllllllIllIlllIIllllIllIllI) {
        return null;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockBush.llIIllllIlllll[1] != 0;
    }
    
    static {
        lIIlIIIIIlllIllI();
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    protected boolean canPlaceBlockOn(final Block llllllllllllIllIlllIIllllllIllII) {
        if (lIIlIIIIIllllIII(llllllllllllIllIlllIIllllllIllII, Blocks.grass) && lIIlIIIIIllllIII(llllllllllllIllIlllIIllllllIllII, Blocks.dirt) && lIIlIIIIIllllIII(llllllllllllIllIlllIIllllllIllII, Blocks.farmland)) {
            return BlockBush.llIIllllIlllll[1] != 0;
        }
        return BlockBush.llIIllllIlllll[0] != 0;
    }
    
    protected void checkAndDropBlock(final World llllllllllllIllIlllIIlllllIIlIlI, final BlockPos llllllllllllIllIlllIIlllllIIIlIl, final IBlockState llllllllllllIllIlllIIlllllIIIlII) {
        if (lIIlIIIIIllllIIl(this.canBlockStay(llllllllllllIllIlllIIlllllIIlIlI, llllllllllllIllIlllIIlllllIIIlIl, llllllllllllIllIlllIIlllllIIIlII) ? 1 : 0)) {
            this.dropBlockAsItem(llllllllllllIllIlllIIlllllIIlIlI, llllllllllllIllIlllIIlllllIIIlIl, llllllllllllIllIlllIIlllllIIIlII, BlockBush.llIIllllIlllll[1]);
            llllllllllllIllIlllIIlllllIIlIlI.setBlockState(llllllllllllIllIlllIIlllllIIIlIl, Blocks.air.getDefaultState(), BlockBush.llIIllllIlllll[2]);
            "".length();
        }
    }
}
