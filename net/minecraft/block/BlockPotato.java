// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.ItemStack;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockPotato extends BlockCrops
{
    private static final /* synthetic */ int[] lIlllIIIIlllII;
    
    @Override
    protected Item getCrop() {
        return Items.potato;
    }
    
    private static void lIIIIIIlIIIIlIlI() {
        (lIlllIIIIlllII = new int[2])[0] = (0x60 ^ 0x67);
        BlockPotato.lIlllIIIIlllII[1] = (0xB2 ^ 0xC5 ^ (0xF9 ^ 0xBC));
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World llllllllllllIlllllIlllIIllIllIll, final BlockPos llllllllllllIlllllIlllIIllIIlllI, final IBlockState llllllllllllIlllllIlllIIllIlIlll, final float llllllllllllIlllllIlllIIllIIllII, final int llllllllllllIlllllIlllIIllIlIlII) {
        super.dropBlockAsItemWithChance(llllllllllllIlllllIlllIIllIllIll, llllllllllllIlllllIlllIIllIIlllI, llllllllllllIlllllIlllIIllIlIlll, llllllllllllIlllllIlllIIllIIllII, llllllllllllIlllllIlllIIllIlIlII);
        if (lIIIIIIlIIIIlIll(llllllllllllIlllllIlllIIllIllIll.isRemote ? 1 : 0) && lIIIIIIlIIIIllII(llllllllllllIlllllIlllIIllIlIlll.getValue((IProperty<Integer>)BlockPotato.AGE), BlockPotato.lIlllIIIIlllII[0]) && lIIIIIIlIIIIlIll(llllllllllllIlllllIlllIIllIllIll.rand.nextInt(BlockPotato.lIlllIIIIlllII[1]))) {
            Block.spawnAsEntity(llllllllllllIlllllIlllIIllIllIll, llllllllllllIlllllIlllIIllIIlllI, new ItemStack(Items.poisonous_potato));
        }
    }
    
    @Override
    protected Item getSeed() {
        return Items.potato;
    }
    
    static {
        lIIIIIIlIIIIlIlI();
    }
    
    private static boolean lIIIIIIlIIIIllII(final int llllllllllllIlllllIlllIIllIIIlIl, final int llllllllllllIlllllIlllIIllIIIIll) {
        return llllllllllllIlllllIlllIIllIIIlIl >= llllllllllllIlllllIlllIIllIIIIll;
    }
    
    private static boolean lIIIIIIlIIIIlIll(final int llllllllllllIlllllIlllIIllIIIIII) {
        return llllllllllllIlllllIlllIIllIIIIII == 0;
    }
}
