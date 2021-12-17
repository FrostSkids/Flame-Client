// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;

public abstract class WorldGenAbstractTree extends WorldGenerator
{
    private static final /* synthetic */ int[] lllIllIlIIlllI;
    
    private static void lIlIIlIIllIllIlI() {
        (lllIllIlIIlllI = new int[2])[0] = ((0x63 ^ 0x1D ^ (0xC4 ^ 0xA6)) & (0xE4 ^ 0xA1 ^ (0x4B ^ 0x12) ^ -" ".length()));
        WorldGenAbstractTree.lllIllIlIIlllI[1] = " ".length();
    }
    
    protected boolean func_150523_a(final Block llllllllllllIlIllIIlIIIlIlllIIlI) {
        final Material llllllllllllIlIllIIlIIIlIlllIIIl = llllllllllllIlIllIIlIIIlIlllIIlI.getMaterial();
        if (lIlIIlIIllIllIll(llllllllllllIlIllIIlIIIlIlllIIIl, Material.air) && lIlIIlIIllIllIll(llllllllllllIlIllIIlIIIlIlllIIIl, Material.leaves) && lIlIIlIIllIllIll(llllllllllllIlIllIIlIIIlIlllIIlI, Blocks.grass) && lIlIIlIIllIllIll(llllllllllllIlIllIIlIIIlIlllIIlI, Blocks.dirt) && lIlIIlIIllIllIll(llllllllllllIlIllIIlIIIlIlllIIlI, Blocks.log) && lIlIIlIIllIllIll(llllllllllllIlIllIIlIIIlIlllIIlI, Blocks.log2) && lIlIIlIIllIllIll(llllllllllllIlIllIIlIIIlIlllIIlI, Blocks.sapling) && lIlIIlIIllIllIll(llllllllllllIlIllIIlIIIlIlllIIlI, Blocks.vine)) {
            return WorldGenAbstractTree.lllIllIlIIlllI[0] != 0;
        }
        return WorldGenAbstractTree.lllIllIlIIlllI[1] != 0;
    }
    
    private static boolean lIlIIlIIllIllIll(final Object llllllllllllIlIllIIlIIIlIlIlllll, final Object llllllllllllIlIllIIlIIIlIlIllllI) {
        return llllllllllllIlIllIIlIIIlIlIlllll != llllllllllllIlIllIIlIIIlIlIllllI;
    }
    
    static {
        lIlIIlIIllIllIlI();
    }
    
    protected void func_175921_a(final World llllllllllllIlIllIIlIIIlIllIIIll, final BlockPos llllllllllllIlIllIIlIIIlIllIIlIl) {
        if (lIlIIlIIllIllIll(llllllllllllIlIllIIlIIIlIllIIIll.getBlockState(llllllllllllIlIllIIlIIIlIllIIlIl).getBlock(), Blocks.dirt)) {
            this.setBlockAndNotifyAdequately(llllllllllllIlIllIIlIIIlIllIIIll, llllllllllllIlIllIIlIIIlIllIIlIl, Blocks.dirt.getDefaultState());
        }
    }
    
    public void func_180711_a(final World llllllllllllIlIllIIlIIIlIllIllIl, final Random llllllllllllIlIllIIlIIIlIllIllII, final BlockPos llllllllllllIlIllIIlIIIlIllIlIll) {
    }
    
    public WorldGenAbstractTree(final boolean llllllllllllIlIllIIlIIIlIllllIII) {
        super(llllllllllllIlIllIIlIIIlIllllIII);
    }
}
