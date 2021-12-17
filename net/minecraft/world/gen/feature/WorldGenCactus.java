// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenCactus extends WorldGenerator
{
    private static final /* synthetic */ int[] lllIIIllllIIlI;
    
    @Override
    public boolean generate(final World llllllllllllIlIllllllIIlllIIlIIl, final Random llllllllllllIlIllllllIIlllIIllll, final BlockPos llllllllllllIlIllllllIIlllIIlllI) {
        int llllllllllllIlIllllllIIlllIIllIl = WorldGenCactus.lllIIIllllIIlI[0];
        "".length();
        if ("   ".length() <= "  ".length()) {
            return ((0x55 ^ 0xB ^ (0x44 ^ 0x31)) & (0x72 ^ 0x4 ^ (0xCF ^ 0x92) ^ -" ".length())) != 0x0;
        }
        while (!lIIllllIIlIllllI(llllllllllllIlIllllllIIlllIIllIl, WorldGenCactus.lllIIIllllIIlI[6])) {
            final BlockPos llllllllllllIlIllllllIIlllIIllII = llllllllllllIlIllllllIIlllIIlllI.add(llllllllllllIlIllllllIIlllIIllll.nextInt(WorldGenCactus.lllIIIllllIIlI[1]) - llllllllllllIlIllllllIIlllIIllll.nextInt(WorldGenCactus.lllIIIllllIIlI[1]), llllllllllllIlIllllllIIlllIIllll.nextInt(WorldGenCactus.lllIIIllllIIlI[2]) - llllllllllllIlIllllllIIlllIIllll.nextInt(WorldGenCactus.lllIIIllllIIlI[2]), llllllllllllIlIllllllIIlllIIllll.nextInt(WorldGenCactus.lllIIIllllIIlI[1]) - llllllllllllIlIllllllIIlllIIllll.nextInt(WorldGenCactus.lllIIIllllIIlI[1]));
            if (lIIllllIIlIlllIl(llllllllllllIlIllllllIIlllIIlIIl.isAirBlock(llllllllllllIlIllllllIIlllIIllII) ? 1 : 0)) {
                final int llllllllllllIlIllllllIIlllIIlIll = WorldGenCactus.lllIIIllllIIlI[3] + llllllllllllIlIllllllIIlllIIllll.nextInt(llllllllllllIlIllllllIIlllIIllll.nextInt(WorldGenCactus.lllIIIllllIIlI[4]) + WorldGenCactus.lllIIIllllIIlI[3]);
                int llllllllllllIlIllllllIIlllIIlIlI = WorldGenCactus.lllIIIllllIIlI[0];
                "".length();
                if ((0xA4 ^ 0xA0) == -" ".length()) {
                    return ((0x2E ^ 0x2A) & ~(0x3F ^ 0x3B)) != 0x0;
                }
                while (!lIIllllIIlIllllI(llllllllllllIlIllllllIIlllIIlIlI, llllllllllllIlIllllllIIlllIIlIll)) {
                    if (lIIllllIIlIlllIl(Blocks.cactus.canBlockStay(llllllllllllIlIllllllIIlllIIlIIl, llllllllllllIlIllllllIIlllIIllII) ? 1 : 0)) {
                        llllllllllllIlIllllllIIlllIIlIIl.setBlockState(llllllllllllIlIllllllIIlllIIllII.up(llllllllllllIlIllllllIIlllIIlIlI), Blocks.cactus.getDefaultState(), WorldGenCactus.lllIIIllllIIlI[5]);
                        "".length();
                    }
                    ++llllllllllllIlIllllllIIlllIIlIlI;
                }
            }
            ++llllllllllllIlIllllllIIlllIIllIl;
        }
        return WorldGenCactus.lllIIIllllIIlI[3] != 0;
    }
    
    static {
        lIIllllIIlIlllII();
    }
    
    private static void lIIllllIIlIlllII() {
        (lllIIIllllIIlI = new int[7])[0] = ((0xA4 ^ 0x8B) & ~(0x5A ^ 0x75));
        WorldGenCactus.lllIIIllllIIlI[1] = (154 + 119 - 153 + 54 ^ 161 + 62 - 80 + 23);
        WorldGenCactus.lllIIIllllIIlI[2] = (0x1F ^ 0x1B);
        WorldGenCactus.lllIIIllllIIlI[3] = " ".length();
        WorldGenCactus.lllIIIllllIIlI[4] = "   ".length();
        WorldGenCactus.lllIIIllllIIlI[5] = "  ".length();
        WorldGenCactus.lllIIIllllIIlI[6] = (0xA7 ^ 0xAD);
    }
    
    private static boolean lIIllllIIlIllllI(final int llllllllllllIlIllllllIIlllIIIIII, final int llllllllllllIlIllllllIIllIllllll) {
        return llllllllllllIlIllllllIIlllIIIIII >= llllllllllllIlIllllllIIllIllllll;
    }
    
    private static boolean lIIllllIIlIlllIl(final int llllllllllllIlIllllllIIllIllllIl) {
        return llllllllllllIlIllllllIIllIllllIl != 0;
    }
}
