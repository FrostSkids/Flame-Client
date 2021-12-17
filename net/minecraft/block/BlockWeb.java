// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.entity.Entity;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.util.EnumWorldBlockLayer;

public class BlockWeb extends Block
{
    private static final /* synthetic */ int[] lllIIlIllIllIl;
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World llllllllllllIlIllllIIlIllIlIIIII, final BlockPos llllllllllllIlIllllIIlIllIIlllll, final IBlockState llllllllllllIlIllllIIlIllIIllllI) {
        return null;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockWeb.lllIIlIllIllIl[0] != 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockWeb.lllIIlIllIllIl[0] != 0;
    }
    
    static {
        lIIlllllllIlllII();
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlIllllIIlIllIIllIll, final Random llllllllllllIlIllllIIlIllIIllIlI, final int llllllllllllIlIllllIIlIllIIllIIl) {
        return Items.string;
    }
    
    public BlockWeb() {
        super(Material.web);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
    }
    
    @Override
    protected boolean canSilkHarvest() {
        return BlockWeb.lllIIlIllIllIl[1] != 0;
    }
    
    private static void lIIlllllllIlllII() {
        (lllIIlIllIllIl = new int[2])[0] = ((0x4C ^ 0x5B) & ~(0x96 ^ 0x81));
        BlockWeb.lllIIlIllIllIl[1] = " ".length();
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World llllllllllllIlIllllIIlIllIlIIlll, final BlockPos llllllllllllIlIllllIIlIllIlIIllI, final IBlockState llllllllllllIlIllllIIlIllIlIIlIl, final Entity llllllllllllIlIllllIIlIllIlIIIll) {
        llllllllllllIlIllllIIlIllIlIIIll.setInWeb();
    }
}
