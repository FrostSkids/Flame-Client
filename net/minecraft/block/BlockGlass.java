// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import java.util.Random;

public class BlockGlass extends BlockBreakable
{
    private static final /* synthetic */ int[] lIIIIIllllllII;
    
    private static void lIllIlllllIIIII() {
        (lIIIIIllllllII = new int[2])[0] = ((0x12 ^ 0x7) & ~(0x9 ^ 0x1C));
        BlockGlass.lIIIIIllllllII[1] = " ".length();
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIlIIllIlIlIlllIIIIl) {
        return BlockGlass.lIIIIIllllllII[0];
    }
    
    static {
        lIllIlllllIIIII();
    }
    
    public BlockGlass(final Material lllllllllllllIlIIllIlIlIlllIIlII, final boolean lllllllllllllIlIIllIlIlIlllIIIll) {
        super(lllllllllllllIlIIllIlIlIlllIIlII, lllllllllllllIlIIllIlIlIlllIIIll);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public boolean isFullCube() {
        return BlockGlass.lIIIIIllllllII[0] != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    protected boolean canSilkHarvest() {
        return BlockGlass.lIIIIIllllllII[1] != 0;
    }
}
