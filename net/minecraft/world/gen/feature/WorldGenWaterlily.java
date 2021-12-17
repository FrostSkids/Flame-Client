// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenWaterlily extends WorldGenerator
{
    private static final /* synthetic */ int[] llIIIllllIIlII;
    
    private static void lIIIlIllIIIlIlll() {
        (llIIIllllIIlII = new int[6])[0] = ((0x7F ^ 0x56) & ~(0x46 ^ 0x6F));
        WorldGenWaterlily.llIIIllllIIlII[1] = (164 + 6 - 6 + 24 ^ 51 + 108 - 86 + 107);
        WorldGenWaterlily.llIIIllllIIlII[2] = (0x33 ^ 0x37);
        WorldGenWaterlily.llIIIllllIIlII[3] = "  ".length();
        WorldGenWaterlily.llIIIllllIIlII[4] = (0x76 ^ 0x78 ^ (0x9E ^ 0x9A));
        WorldGenWaterlily.llIIIllllIIlII[5] = " ".length();
    }
    
    private static boolean lIIIlIllIIIllIII(final int llllllllllllIlllIIlllllIIllIllll) {
        return llllllllllllIlllIIlllllIIllIllll != 0;
    }
    
    static {
        lIIIlIllIIIlIlll();
    }
    
    @Override
    public boolean generate(final World llllllllllllIlllIIlllllIlIIIIIlI, final Random llllllllllllIlllIIlllllIlIIIIIIl, final BlockPos llllllllllllIlllIIlllllIlIIIIIII) {
        int llllllllllllIlllIIlllllIIlllllll = WorldGenWaterlily.llIIIllllIIlII[0];
        "".length();
        if ((28 + 96 - 23 + 61 ^ 44 + 53 + 29 + 40) <= " ".length()) {
            return ((0x4D ^ 0x5F ^ (0x76 ^ 0x72)) & (126 + 10 - 120 + 138 ^ 37 + 70 - 3 + 36 ^ -" ".length())) != 0x0;
        }
        while (!lIIIlIllIIIllIIl(llllllllllllIlllIIlllllIIlllllll, WorldGenWaterlily.llIIIllllIIlII[4])) {
            final int llllllllllllIlllIIlllllIIllllllI = llllllllllllIlllIIlllllIlIIIIIII.getX() + llllllllllllIlllIIlllllIlIIIIIIl.nextInt(WorldGenWaterlily.llIIIllllIIlII[1]) - llllllllllllIlllIIlllllIlIIIIIIl.nextInt(WorldGenWaterlily.llIIIllllIIlII[1]);
            final int llllllllllllIlllIIlllllIIlllllIl = llllllllllllIlllIIlllllIlIIIIIII.getY() + llllllllllllIlllIIlllllIlIIIIIIl.nextInt(WorldGenWaterlily.llIIIllllIIlII[2]) - llllllllllllIlllIIlllllIlIIIIIIl.nextInt(WorldGenWaterlily.llIIIllllIIlII[2]);
            final int llllllllllllIlllIIlllllIIlllllII = llllllllllllIlllIIlllllIlIIIIIII.getZ() + llllllllllllIlllIIlllllIlIIIIIIl.nextInt(WorldGenWaterlily.llIIIllllIIlII[1]) - llllllllllllIlllIIlllllIlIIIIIIl.nextInt(WorldGenWaterlily.llIIIllllIIlII[1]);
            if (lIIIlIllIIIllIII(llllllllllllIlllIIlllllIlIIIIIlI.isAirBlock(new BlockPos(llllllllllllIlllIIlllllIIllllllI, llllllllllllIlllIIlllllIIlllllIl, llllllllllllIlllIIlllllIIlllllII)) ? 1 : 0) && lIIIlIllIIIllIII(Blocks.waterlily.canPlaceBlockAt(llllllllllllIlllIIlllllIlIIIIIlI, new BlockPos(llllllllllllIlllIIlllllIIllllllI, llllllllllllIlllIIlllllIIlllllIl, llllllllllllIlllIIlllllIIlllllII)) ? 1 : 0)) {
                llllllllllllIlllIIlllllIlIIIIIlI.setBlockState(new BlockPos(llllllllllllIlllIIlllllIIllllllI, llllllllllllIlllIIlllllIIlllllIl, llllllllllllIlllIIlllllIIlllllII), Blocks.waterlily.getDefaultState(), WorldGenWaterlily.llIIIllllIIlII[3]);
                "".length();
            }
            ++llllllllllllIlllIIlllllIIlllllll;
        }
        return WorldGenWaterlily.llIIIllllIIlII[5] != 0;
    }
    
    private static boolean lIIIlIllIIIllIIl(final int llllllllllllIlllIIlllllIIlllIIlI, final int llllllllllllIlllIIlllllIIlllIIIl) {
        return llllllllllllIlllIIlllllIIlllIIlI >= llllllllllllIlllIIlllllIIlllIIIl;
    }
}
