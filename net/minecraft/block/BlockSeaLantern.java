// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import java.util.Random;

public class BlockSeaLantern extends Block
{
    private static final /* synthetic */ int[] lIlIlIlIllIllI;
    
    static {
        lllIlllIllIIIIl();
    }
    
    @Override
    protected boolean canSilkHarvest() {
        return BlockSeaLantern.lIlIlIlIllIllI[1] != 0;
    }
    
    @Override
    public int quantityDroppedWithBonus(final int lllllllllllllIIIlIIIIIlIIlIlIlll, final Random lllllllllllllIIIlIIIIIlIIlIlIllI) {
        return MathHelper.clamp_int(this.quantityDropped(lllllllllllllIIIlIIIIIlIIlIlIllI) + lllllllllllllIIIlIIIIIlIIlIlIllI.nextInt(lllllllllllllIIIlIIIIIlIIlIlIlll + BlockSeaLantern.lIlIlIlIllIllI[1]), BlockSeaLantern.lIlIlIlIllIllI[1], BlockSeaLantern.lIlIlIlIllIllI[2]);
    }
    
    public BlockSeaLantern(final Material lllllllllllllIIIlIIIIIlIIllIIIII) {
        super(lllllllllllllIIIlIIIIIlIIllIIIII);
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIlIIIIIlIIlIlIIIl, final Random lllllllllllllIIIlIIIIIlIIlIlIIII, final int lllllllllllllIIIlIIIIIlIIlIIllll) {
        return Items.prismarine_crystals;
    }
    
    private static void lllIlllIllIIIIl() {
        (lIlIlIlIllIllI = new int[3])[0] = "  ".length();
        BlockSeaLantern.lIlIlIlIllIllI[1] = " ".length();
        BlockSeaLantern.lIlIlIlIllIllI[2] = (0x47 ^ 0x42);
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIIIlIIIIIlIIlIIllIl) {
        return MapColor.quartzColor;
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIIIlIIIIIlIIlIlllII) {
        return BlockSeaLantern.lIlIlIlIllIllI[0] + lllllllllllllIIIlIIIIIlIIlIlllII.nextInt(BlockSeaLantern.lIlIlIlIllIllI[0]);
    }
}
