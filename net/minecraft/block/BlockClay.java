// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.state.IBlockState;
import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class BlockClay extends Block
{
    private static final /* synthetic */ int[] lIlIIIIlIIllII;
    
    private static void lllIIIIlIlIllII() {
        (lIlIIIIlIIllII = new int[1])[0] = (0x54 ^ 0x1D ^ (0xF4 ^ 0xB9));
    }
    
    public BlockClay() {
        super(Material.clay);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIlIIIIlIllIllIIIII) {
        return BlockClay.lIlIIIIlIIllII[0];
    }
    
    static {
        lllIIIIlIlIllII();
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIlIIIIlIllIllIIlII, final Random lllllllllllllIIlIIIIlIllIllIIIll, final int lllllllllllllIIlIIIIlIllIllIIIlI) {
        return Items.clay_ball;
    }
}
