// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public class BlockSnowBlock extends Block
{
    private static final /* synthetic */ int[] llIlIlllIIIIIl;
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIllIlIIlIIlIIlIIIIII, final Random llllllllllllIllIlIIlIIlIIIllllll, final int llllllllllllIllIlIIlIIlIIIlllllI) {
        return Items.snowball;
    }
    
    @Override
    public int quantityDropped(final Random llllllllllllIllIlIIlIIlIIIllllII) {
        return BlockSnowBlock.llIlIlllIIIIIl[1];
    }
    
    private static void lIIlIlIllIIIllIl() {
        (llIlIlllIIIIIl = new int[4])[0] = " ".length();
        BlockSnowBlock.llIlIlllIIIIIl[1] = (0x0 ^ 0x4);
        BlockSnowBlock.llIlIlllIIIIIl[2] = (0xB ^ 0x0);
        BlockSnowBlock.llIlIlllIIIIIl[3] = ((0x8B ^ 0xA7) & ~(0xB2 ^ 0x9E));
    }
    
    @Override
    public void updateTick(final World llllllllllllIllIlIIlIIlIIIllIlll, final BlockPos llllllllllllIllIlIIlIIlIIIllIllI, final IBlockState llllllllllllIllIlIIlIIlIIIllIlIl, final Random llllllllllllIllIlIIlIIlIIIllIlII) {
        if (lIIlIlIllIIIlllI(llllllllllllIllIlIIlIIlIIIllIlll.getLightFor(EnumSkyBlock.BLOCK, llllllllllllIllIlIIlIIlIIIllIllI), BlockSnowBlock.llIlIlllIIIIIl[2])) {
            this.dropBlockAsItem(llllllllllllIllIlIIlIIlIIIllIlll, llllllllllllIllIlIIlIIlIIIllIllI, llllllllllllIllIlIIlIIlIIIllIlll.getBlockState(llllllllllllIllIlIIlIIlIIIllIllI), BlockSnowBlock.llIlIlllIIIIIl[3]);
            llllllllllllIllIlIIlIIlIIIllIlll.setBlockToAir(llllllllllllIllIlIIlIIlIIIllIllI);
            "".length();
        }
    }
    
    static {
        lIIlIlIllIIIllIl();
    }
    
    private static boolean lIIlIlIllIIIlllI(final int llllllllllllIllIlIIlIIlIIIlIlllI, final int llllllllllllIllIlIIlIIlIIIlIllIl) {
        return llllllllllllIllIlIIlIIlIIIlIlllI > llllllllllllIllIlIIlIIlIIIlIllIl;
    }
    
    protected BlockSnowBlock() {
        super(Material.craftedSnow);
        this.setTickRandomly((boolean)(BlockSnowBlock.llIlIlllIIIIIl[0] != 0));
        "".length();
        this.setCreativeTab(CreativeTabs.tabBlock);
        "".length();
    }
}
