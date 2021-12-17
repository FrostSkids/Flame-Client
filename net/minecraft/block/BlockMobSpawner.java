// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public class BlockMobSpawner extends BlockContainer
{
    private static final /* synthetic */ int[] llIllIIIlIlIll;
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllIlIIIIIIllIllIIll, final Random llllllllllllIllIlIIIIIIllIllIIlI, final int llllllllllllIllIlIIIIIIllIllIIIl) {
        return null;
    }
    
    private static void lIIlIllIIllllIll() {
        (llIllIIIlIlIll = new int[3])[0] = ((0x30 ^ 0x7B) & ~(0x6C ^ 0x27));
        BlockMobSpawner.llIllIIIlIlIll[1] = (0x69 ^ 0x66);
        BlockMobSpawner.llIllIIIlIlIll[2] = "   ".length();
    }
    
    @Override
    public int quantityDropped(final Random llllllllllllIllIlIIIIIIllIlIllll) {
        return BlockMobSpawner.llIllIIIlIlIll[0];
    }
    
    @Override
    public Item getItem(final World llllllllllllIllIlIIIIIIllIIlIlIl, final BlockPos llllllllllllIllIlIIIIIIllIIlIlII) {
        return null;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World llllllllllllIllIlIIIIIIllIllIllI, final int llllllllllllIllIlIIIIIIllIllIlIl) {
        return new TileEntityMobSpawner();
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World llllllllllllIllIlIIIIIIllIIlllll, final BlockPos llllllllllllIllIlIIIIIIllIlIIlIl, final IBlockState llllllllllllIllIlIIIIIIllIlIIlII, final float llllllllllllIllIlIIIIIIllIIlllII, final int llllllllllllIllIlIIIIIIllIIllIll) {
        super.dropBlockAsItemWithChance(llllllllllllIllIlIIIIIIllIIlllll, llllllllllllIllIlIIIIIIllIlIIlIl, llllllllllllIllIlIIIIIIllIlIIlII, llllllllllllIllIlIIIIIIllIIlllII, llllllllllllIllIlIIIIIIllIIllIll);
        final int llllllllllllIllIlIIIIIIllIlIIIIl = BlockMobSpawner.llIllIIIlIlIll[1] + llllllllllllIllIlIIIIIIllIIlllll.rand.nextInt(BlockMobSpawner.llIllIIIlIlIll[1]) + llllllllllllIllIlIIIIIIllIIlllll.rand.nextInt(BlockMobSpawner.llIllIIIlIlIll[1]);
        this.dropXpOnBlockBreak(llllllllllllIllIlIIIIIIllIIlllll, llllllllllllIllIlIIIIIIllIlIIlIl, llllllllllllIllIlIIIIIIllIlIIIIl);
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockMobSpawner.llIllIIIlIlIll[0] != 0;
    }
    
    static {
        lIIlIllIIllllIll();
    }
    
    protected BlockMobSpawner() {
        super(Material.rock);
    }
    
    @Override
    public int getRenderType() {
        return BlockMobSpawner.llIllIIIlIlIll[2];
    }
}
