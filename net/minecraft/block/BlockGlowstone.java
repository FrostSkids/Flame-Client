// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MapColor;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.MathHelper;
import java.util.Random;

public class BlockGlowstone extends Block
{
    private static final /* synthetic */ int[] llllllIlIIIIl;
    
    @Override
    public int quantityDroppedWithBonus(final int lllllllllllllIlIlIlIlIIlIIllIIlI, final Random lllllllllllllIlIlIlIlIIlIIlIlllI) {
        return MathHelper.clamp_int(this.quantityDropped(lllllllllllllIlIlIlIlIIlIIlIlllI) + lllllllllllllIlIlIlIlIIlIIlIlllI.nextInt(lllllllllllllIlIlIlIlIIlIIllIIlI + BlockGlowstone.llllllIlIIIIl[0]), BlockGlowstone.llllllIlIIIIl[0], BlockGlowstone.llllllIlIIIIl[1]);
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIlIlIlIIlIIlIlIII, final Random lllllllllllllIlIlIlIlIIlIIlIIlll, final int lllllllllllllIlIlIlIlIIlIIlIIllI) {
        return Items.glowstone_dust;
    }
    
    private static void lIllIIIIIIIllIl() {
        (llllllIlIIIIl = new int[4])[0] = " ".length();
        BlockGlowstone.llllllIlIIIIl[1] = (0xE3 ^ 0xC0 ^ (0xB0 ^ 0x97));
        BlockGlowstone.llllllIlIIIIl[2] = "  ".length();
        BlockGlowstone.llllllIlIIIIl[3] = "   ".length();
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIlIlIlIlIIlIIlIIlII) {
        return MapColor.sandColor;
    }
    
    public BlockGlowstone(final Material lllllllllllllIlIlIlIlIIlIIllIlll) {
        super(lllllllllllllIlIlIlIlIIlIIllIlll);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    static {
        lIllIIIIIIIllIl();
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIlIlIlIlIIlIIlIlIll) {
        return BlockGlowstone.llllllIlIIIIl[2] + lllllllllllllIlIlIlIlIIlIIlIlIll.nextInt(BlockGlowstone.llllllIlIIIIl[3]);
    }
}
