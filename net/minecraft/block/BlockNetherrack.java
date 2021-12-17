// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;

public class BlockNetherrack extends Block
{
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIlIIlIIllIIlIIIIlI) {
        return MapColor.netherrackColor;
    }
    
    public BlockNetherrack() {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
}
