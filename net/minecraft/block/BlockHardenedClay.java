// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class BlockHardenedClay extends Block
{
    public BlockHardenedClay() {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public MapColor getMapColor(final IBlockState llllllllllllIllIIlllIlllIIllIlIl) {
        return MapColor.adobeColor;
    }
}