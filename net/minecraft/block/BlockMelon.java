// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.state.IBlockState;
import java.util.Random;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockMelon extends Block
{
    private static final /* synthetic */ int[] lIIIIIlIllllII;
    
    static {
        lIllIllIlIIllII();
    }
    
    private static void lIllIllIlIIllII() {
        (lIIIIIlIllllII = new int[4])[0] = "   ".length();
        BlockMelon.lIIIIIlIllllII[1] = (0x52 ^ 0x57);
        BlockMelon.lIIIIIlIllllII[2] = (196 + 28 - 89 + 69 ^ 179 + 18 - 125 + 125);
        BlockMelon.lIIIIIlIllllII[3] = " ".length();
    }
    
    protected BlockMelon() {
        super(Material.gourd, MapColor.limeColor);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public int quantityDroppedWithBonus(final int lllllllllllllIlIIlllIIlIlIIIllII, final Random lllllllllllllIlIIlllIIlIlIIIlIll) {
        return Math.min(BlockMelon.lIIIIIlIllllII[2], this.quantityDropped(lllllllllllllIlIIlllIIlIlIIIlIll) + lllllllllllllIlIIlllIIlIlIIIlIll.nextInt(BlockMelon.lIIIIIlIllllII[3] + lllllllllllllIlIIlllIIlIlIIIllII));
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIlIIlllIIlIlIIlIlIl) {
        return BlockMelon.lIIIIIlIllllII[0] + lllllllllllllIlIIlllIIlIlIIlIlIl.nextInt(BlockMelon.lIIIIIlIllllII[1]);
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIIlllIIlIlIIllIlI, final Random lllllllllllllIlIIlllIIlIlIIllIIl, final int lllllllllllllIlIIlllIIlIlIIllIII) {
        return Items.melon;
    }
}
