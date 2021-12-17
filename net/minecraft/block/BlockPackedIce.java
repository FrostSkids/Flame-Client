// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import java.util.Random;

public class BlockPackedIce extends Block
{
    private static final /* synthetic */ int[] lIlIlIllIIIlll;
    
    static {
        lllIlllIlllllII();
    }
    
    private static void lllIlllIlllllII() {
        (lIlIlIllIIIlll = new int[1])[0] = ((0x3A ^ 0x5B) & ~(0x51 ^ 0x30));
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIIlIIIIIIIlIllllll) {
        return BlockPackedIce.lIlIlIllIIIlll[0];
    }
    
    public BlockPackedIce() {
        super(Material.packedIce);
        this.slipperiness = 0.98f;
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
}
