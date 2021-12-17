// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.util.Vec3i;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenDeadBush extends WorldGenerator
{
    private static final /* synthetic */ int[] lIlIllIIlllIII;
    
    static {
        llllIIIlIIlllll();
    }
    
    private static boolean llllIIIlIlIIIIl(final Object lllllllllllllIIIIllIlllIlIIlIlII, final Object lllllllllllllIIIIllIlllIlIIlIIll) {
        return lllllllllllllIIIIllIlllIlIIlIlII == lllllllllllllIIIIllIlllIlIIlIIll;
    }
    
    private static boolean llllIIIlIlIIIlI(final int lllllllllllllIIIIllIlllIlIIIllll) {
        return lllllllllllllIIIIllIlllIlIIIllll <= 0;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIIIIllIlllIlIlIIlII, final Random lllllllllllllIIIIllIlllIlIlIIIll, BlockPos lllllllllllllIIIIllIlllIlIlIIIlI) {
        "".length();
        if (null != null) {
            return ((0x48 ^ 0x1E) & ~(0x6A ^ 0x3C)) != 0x0;
        }
        Block lllllllllllllIIIIllIlllIlIlIIlll;
        while ((!llllIIIlIlIIIII((lllllllllllllIIIIllIlllIlIlIIlll = lllllllllllllIIIIllIlllIlIlIIlII.getBlockState((BlockPos)lllllllllllllIIIIllIlllIlIlIIIlI).getBlock()).getMaterial(), Material.air) || llllIIIlIlIIIIl(lllllllllllllIIIIllIlllIlIlIIlll.getMaterial(), Material.leaves)) && !llllIIIlIlIIIlI(((Vec3i)lllllllllllllIIIIllIlllIlIlIIIlI).getY())) {
            lllllllllllllIIIIllIlllIlIlIIIlI = ((BlockPos)lllllllllllllIIIIllIlllIlIlIIIlI).down();
        }
        int lllllllllllllIIIIllIlllIlIlIIllI = WorldGenDeadBush.lIlIllIIlllIII[0];
        "".length();
        if (-" ".length() >= "  ".length()) {
            return ((121 + 71 - 143 + 79 ^ 174 + 68 - 94 + 31) & (0x96 ^ 0xA6 ^ "   ".length() ^ -" ".length())) != 0x0;
        }
        while (!llllIIIlIlIIlII(lllllllllllllIIIIllIlllIlIlIIllI, WorldGenDeadBush.lIlIllIIlllIII[2])) {
            final BlockPos lllllllllllllIIIIllIlllIlIlIIlIl = ((BlockPos)lllllllllllllIIIIllIlllIlIlIIIlI).add(lllllllllllllIIIIllIlllIlIlIIIll.nextInt(WorldGenDeadBush.lIlIllIIlllIII[1]) - lllllllllllllIIIIllIlllIlIlIIIll.nextInt(WorldGenDeadBush.lIlIllIIlllIII[1]), lllllllllllllIIIIllIlllIlIlIIIll.nextInt(WorldGenDeadBush.lIlIllIIlllIII[2]) - lllllllllllllIIIIllIlllIlIlIIIll.nextInt(WorldGenDeadBush.lIlIllIIlllIII[2]), lllllllllllllIIIIllIlllIlIlIIIll.nextInt(WorldGenDeadBush.lIlIllIIlllIII[1]) - lllllllllllllIIIIllIlllIlIlIIIll.nextInt(WorldGenDeadBush.lIlIllIIlllIII[1]));
            if (llllIIIlIlIIIll(lllllllllllllIIIIllIlllIlIlIIlII.isAirBlock(lllllllllllllIIIIllIlllIlIlIIlIl) ? 1 : 0) && llllIIIlIlIIIll(Blocks.deadbush.canBlockStay(lllllllllllllIIIIllIlllIlIlIIlII, lllllllllllllIIIIllIlllIlIlIIlIl, Blocks.deadbush.getDefaultState()) ? 1 : 0)) {
                lllllllllllllIIIIllIlllIlIlIIlII.setBlockState(lllllllllllllIIIIllIlllIlIlIIlIl, Blocks.deadbush.getDefaultState(), WorldGenDeadBush.lIlIllIIlllIII[3]);
                "".length();
            }
            ++lllllllllllllIIIIllIlllIlIlIIllI;
        }
        return WorldGenDeadBush.lIlIllIIlllIII[4] != 0;
    }
    
    private static boolean llllIIIlIlIIIll(final int lllllllllllllIIIIllIlllIlIIlIIIl) {
        return lllllllllllllIIIIllIlllIlIIlIIIl != 0;
    }
    
    private static boolean llllIIIlIlIIIII(final Object lllllllllllllIIIIllIlllIlIIllIII, final Object lllllllllllllIIIIllIlllIlIIlIlll) {
        return lllllllllllllIIIIllIlllIlIIllIII != lllllllllllllIIIIllIlllIlIIlIlll;
    }
    
    private static boolean llllIIIlIlIIlII(final int lllllllllllllIIIIllIlllIlIIlllII, final int lllllllllllllIIIIllIlllIlIIllIll) {
        return lllllllllllllIIIIllIlllIlIIlllII >= lllllllllllllIIIIllIlllIlIIllIll;
    }
    
    private static void llllIIIlIIlllll() {
        (lIlIllIIlllIII = new int[5])[0] = ((21 + 49 - 35 + 123 ^ 146 + 71 - 213 + 151) & (0xF4 ^ 0xC3 ^ (0x37 ^ 0x5) ^ -" ".length()));
        WorldGenDeadBush.lIlIllIIlllIII[1] = (0x11 ^ 0x1 ^ (0x84 ^ 0x9C));
        WorldGenDeadBush.lIlIllIIlllIII[2] = (0x43 ^ 0x47);
        WorldGenDeadBush.lIlIllIIlllIII[3] = "  ".length();
        WorldGenDeadBush.lIlIllIIlllIII[4] = " ".length();
    }
}
