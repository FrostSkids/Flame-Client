// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public class BlockBookshelf extends Block
{
    private static final /* synthetic */ int[] lIIlIIIlIlIlll;
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIlllIIllIIllIlIIII, final Random lllllllllllllIIlllIIllIIllIIllll, final int lllllllllllllIIlllIIllIIllIIlllI) {
        return Items.book;
    }
    
    public BlockBookshelf() {
        super(Material.wood);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    private static void llIIlIlIlllIlIl() {
        (lIIlIIIlIlIlll = new int[1])[0] = "   ".length();
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIlllIIllIIllIlIIlI) {
        return BlockBookshelf.lIIlIIIlIlIlll[0];
    }
    
    static {
        llIIlIlIlllIlIl();
    }
}
