// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockSoulSand extends Block
{
    private static final /* synthetic */ int[] lIlIIlIlIIllll;
    
    public BlockSoulSand() {
        super(Material.sand, MapColor.brownColor);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    static {
        lllIIllIIIlIlll();
    }
    
    private static void lllIIllIIIlIlll() {
        (lIlIIlIlIIllll = new int[1])[0] = " ".length();
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIIllIllIlIllIIllII, final BlockPos lllllllllllllIIIllIllIlIllIIlIII, final IBlockState lllllllllllllIIIllIllIlIllIIlIlI) {
        final float lllllllllllllIIIllIllIlIllIIlIIl = 0.125f;
        return new AxisAlignedBB(lllllllllllllIIIllIllIlIllIIlIII.getX(), lllllllllllllIIIllIllIlIllIIlIII.getY(), lllllllllllllIIIllIllIlIllIIlIII.getZ(), lllllllllllllIIIllIllIlIllIIlIII.getX() + BlockSoulSand.lIlIIlIlIIllll[0], lllllllllllllIIIllIllIlIllIIlIII.getY() + BlockSoulSand.lIlIIlIlIIllll[0] - lllllllllllllIIIllIllIlIllIIlIIl, lllllllllllllIIIllIllIlIllIIlIII.getZ() + BlockSoulSand.lIlIIlIlIIllll[0]);
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World lllllllllllllIIIllIllIlIllIIIIlI, final BlockPos lllllllllllllIIIllIllIlIllIIIIII, final IBlockState lllllllllllllIIIllIllIlIlIlllllI, final Entity lllllllllllllIIIllIllIlIlIllllII) {
        lllllllllllllIIIllIllIlIlIllllII.motionX *= 0.4;
        lllllllllllllIIIllIllIlIlIllllII.motionZ *= 0.4;
    }
}
