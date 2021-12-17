// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class BlockObsidian extends Block
{
    public BlockObsidian() {
        super(Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIlIIIIIlIIlIIIlll, final Random lllllllllllllIIIlIIIIIlIIlIIIllI, final int lllllllllllllIIIlIIIIIlIIlIIIlIl) {
        return Item.getItemFromBlock(Blocks.obsidian);
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIIlIIIIIlIIlIIIIll) {
        return MapColor.blackColor;
    }
}
