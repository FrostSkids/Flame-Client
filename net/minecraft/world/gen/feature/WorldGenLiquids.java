// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class WorldGenLiquids extends WorldGenerator
{
    private /* synthetic */ Block block;
    private static final /* synthetic */ int[] llIIIlIIIlIllI;
    
    public WorldGenLiquids(final Block llllllllllllIlllIllIIIlIllIIIlll) {
        this.block = llllllllllllIlllIllIIIlIllIIIlll;
    }
    
    private static boolean lIIIlIIIllIlIIII(final Object llllllllllllIlllIllIIIlIlIIlIIII, final Object llllllllllllIlllIllIIIlIlIIIllll) {
        return llllllllllllIlllIllIIIlIlIIlIIII != llllllllllllIlllIllIIIlIlIIIllll;
    }
    
    private static boolean lIIIlIIIllIlIIlI(final int llllllllllllIlllIllIIIlIlIIIIlll) {
        return llllllllllllIlllIllIIIlIlIIIIlll != 0;
    }
    
    private static void lIIIlIIIllIIllll() {
        (llIIIlIIIlIllI = new int[4])[0] = ((0x84 ^ 0xC4) & ~(0xF3 ^ 0xB3));
        WorldGenLiquids.llIIIlIIIlIllI[1] = "   ".length();
        WorldGenLiquids.llIIIlIIIlIllI[2] = " ".length();
        WorldGenLiquids.llIIIlIIIlIllI[3] = "  ".length();
    }
    
    static {
        lIIIlIIIllIIllll();
    }
    
    private static boolean lIIIlIIIllIlIIIl(final Object llllllllllllIlllIllIIIlIlIIIlIlI, final Object llllllllllllIlllIllIIIlIlIIIlIIl) {
        return llllllllllllIlllIllIIIlIlIIIlIlI == llllllllllllIlllIllIIIlIlIIIlIIl;
    }
    
    @Override
    public boolean generate(final World llllllllllllIlllIllIIIlIlIlIIllI, final Random llllllllllllIlllIllIIIlIlIlIllII, final BlockPos llllllllllllIlllIllIIIlIlIlIlIll) {
        if (lIIIlIIIllIlIIII(llllllllllllIlllIllIIIlIlIlIIllI.getBlockState(llllllllllllIlllIllIIIlIlIlIlIll.up()).getBlock(), Blocks.stone)) {
            return WorldGenLiquids.llIIIlIIIlIllI[0] != 0;
        }
        if (lIIIlIIIllIlIIII(llllllllllllIlllIllIIIlIlIlIIllI.getBlockState(llllllllllllIlllIllIIIlIlIlIlIll.down()).getBlock(), Blocks.stone)) {
            return WorldGenLiquids.llIIIlIIIlIllI[0] != 0;
        }
        if (lIIIlIIIllIlIIII(llllllllllllIlllIllIIIlIlIlIIllI.getBlockState(llllllllllllIlllIllIIIlIlIlIlIll).getBlock().getMaterial(), Material.air) && lIIIlIIIllIlIIII(llllllllllllIlllIllIIIlIlIlIIllI.getBlockState(llllllllllllIlllIllIIIlIlIlIlIll).getBlock(), Blocks.stone)) {
            return WorldGenLiquids.llIIIlIIIlIllI[0] != 0;
        }
        int llllllllllllIlllIllIIIlIlIlIlIlI = WorldGenLiquids.llIIIlIIIlIllI[0];
        if (lIIIlIIIllIlIIIl(llllllllllllIlllIllIIIlIlIlIIllI.getBlockState(llllllllllllIlllIllIIIlIlIlIlIll.west()).getBlock(), Blocks.stone)) {
            ++llllllllllllIlllIllIIIlIlIlIlIlI;
        }
        if (lIIIlIIIllIlIIIl(llllllllllllIlllIllIIIlIlIlIIllI.getBlockState(llllllllllllIlllIllIIIlIlIlIlIll.east()).getBlock(), Blocks.stone)) {
            ++llllllllllllIlllIllIIIlIlIlIlIlI;
        }
        if (lIIIlIIIllIlIIIl(llllllllllllIlllIllIIIlIlIlIIllI.getBlockState(llllllllllllIlllIllIIIlIlIlIlIll.north()).getBlock(), Blocks.stone)) {
            ++llllllllllllIlllIllIIIlIlIlIlIlI;
        }
        if (lIIIlIIIllIlIIIl(llllllllllllIlllIllIIIlIlIlIIllI.getBlockState(llllllllllllIlllIllIIIlIlIlIlIll.south()).getBlock(), Blocks.stone)) {
            ++llllllllllllIlllIllIIIlIlIlIlIlI;
        }
        int llllllllllllIlllIllIIIlIlIlIlIIl = WorldGenLiquids.llIIIlIIIlIllI[0];
        if (lIIIlIIIllIlIIlI(llllllllllllIlllIllIIIlIlIlIIllI.isAirBlock(llllllllllllIlllIllIIIlIlIlIlIll.west()) ? 1 : 0)) {
            ++llllllllllllIlllIllIIIlIlIlIlIIl;
        }
        if (lIIIlIIIllIlIIlI(llllllllllllIlllIllIIIlIlIlIIllI.isAirBlock(llllllllllllIlllIllIIIlIlIlIlIll.east()) ? 1 : 0)) {
            ++llllllllllllIlllIllIIIlIlIlIlIIl;
        }
        if (lIIIlIIIllIlIIlI(llllllllllllIlllIllIIIlIlIlIIllI.isAirBlock(llllllllllllIlllIllIIIlIlIlIlIll.north()) ? 1 : 0)) {
            ++llllllllllllIlllIllIIIlIlIlIlIIl;
        }
        if (lIIIlIIIllIlIIlI(llllllllllllIlllIllIIIlIlIlIIllI.isAirBlock(llllllllllllIlllIllIIIlIlIlIlIll.south()) ? 1 : 0)) {
            ++llllllllllllIlllIllIIIlIlIlIlIIl;
        }
        if (lIIIlIIIllIlIIll(llllllllllllIlllIllIIIlIlIlIlIlI, WorldGenLiquids.llIIIlIIIlIllI[1]) && lIIIlIIIllIlIIll(llllllllllllIlllIllIIIlIlIlIlIIl, WorldGenLiquids.llIIIlIIIlIllI[2])) {
            llllllllllllIlllIllIIIlIlIlIIllI.setBlockState(llllllllllllIlllIllIIIlIlIlIlIll, this.block.getDefaultState(), WorldGenLiquids.llIIIlIIIlIllI[3]);
            "".length();
            llllllllllllIlllIllIIIlIlIlIIllI.forceBlockUpdateTick(this.block, llllllllllllIlllIllIIIlIlIlIlIll, llllllllllllIlllIllIIIlIlIlIllII);
        }
        return WorldGenLiquids.llIIIlIIIlIllI[2] != 0;
    }
    
    private static boolean lIIIlIIIllIlIIll(final int llllllllllllIlllIllIIIlIlIIllIII, final int llllllllllllIlllIllIIIlIlIIlIllI) {
        return llllllllllllIlllIllIIIlIlIIllIII == llllllllllllIlllIllIIIlIlIIlIllI;
    }
}
