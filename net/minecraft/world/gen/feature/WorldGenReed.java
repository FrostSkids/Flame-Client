// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenReed extends WorldGenerator
{
    private static final /* synthetic */ int[] llIIIIlllIllII;
    
    static {
        lIIIlIIIIlIlllll();
    }
    
    private static boolean lIIIlIIIIllIIIll(final int llllllllllllIlllIllIIllllIllIIII, final int llllllllllllIlllIllIIllllIlIllll) {
        return llllllllllllIlllIllIIllllIllIIII >= llllllllllllIlllIllIIllllIlIllll;
    }
    
    @Override
    public boolean generate(final World llllllllllllIlllIllIIllllIlllIlI, final Random llllllllllllIlllIllIIllllIlllIIl, final BlockPos llllllllllllIlllIllIIlllllIIIIII) {
        int llllllllllllIlllIllIIllllIllllll = WorldGenReed.llIIIIlllIllII[0];
        "".length();
        if ("  ".length() >= "   ".length()) {
            return ((167 + 23 - 68 + 66 ^ 27 + 133 - 159 + 182) & (0xD2 ^ 0xC1 ^ (0x8F ^ 0x97) ^ -" ".length())) != 0x0;
        }
        while (!lIIIlIIIIllIIIll(llllllllllllIlllIllIIllllIllllll, WorldGenReed.llIIIIlllIllII[5])) {
            final BlockPos llllllllllllIlllIllIIllllIlllllI = llllllllllllIlllIllIIlllllIIIIII.add(llllllllllllIlllIllIIllllIlllIIl.nextInt(WorldGenReed.llIIIIlllIllII[1]) - llllllllllllIlllIllIIllllIlllIIl.nextInt(WorldGenReed.llIIIIlllIllII[1]), WorldGenReed.llIIIIlllIllII[0], llllllllllllIlllIllIIllllIlllIIl.nextInt(WorldGenReed.llIIIIlllIllII[1]) - llllllllllllIlllIllIIllllIlllIIl.nextInt(WorldGenReed.llIIIIlllIllII[1]));
            if (lIIIlIIIIllIIIII(llllllllllllIlllIllIIllllIlllIlI.isAirBlock(llllllllllllIlllIllIIllllIlllllI) ? 1 : 0)) {
                final BlockPos llllllllllllIlllIllIIllllIllllIl = llllllllllllIlllIllIIllllIlllllI.down();
                if (!lIIIlIIIIllIIIIl(llllllllllllIlllIllIIllllIlllIlI.getBlockState(llllllllllllIlllIllIIllllIllllIl.west()).getBlock().getMaterial(), Material.water) || !lIIIlIIIIllIIIIl(llllllllllllIlllIllIIllllIlllIlI.getBlockState(llllllllllllIlllIllIIllllIllllIl.east()).getBlock().getMaterial(), Material.water) || !lIIIlIIIIllIIIIl(llllllllllllIlllIllIIllllIlllIlI.getBlockState(llllllllllllIlllIllIIllllIllllIl.north()).getBlock().getMaterial(), Material.water) || lIIIlIIIIllIIIlI(llllllllllllIlllIllIIllllIlllIlI.getBlockState(llllllllllllIlllIllIIllllIllllIl.south()).getBlock().getMaterial(), Material.water)) {
                    final int llllllllllllIlllIllIIllllIllllII = WorldGenReed.llIIIIlllIllII[2] + llllllllllllIlllIllIIllllIlllIIl.nextInt(llllllllllllIlllIllIIllllIlllIIl.nextInt(WorldGenReed.llIIIIlllIllII[3]) + WorldGenReed.llIIIIlllIllII[4]);
                    int llllllllllllIlllIllIIllllIlllIll = WorldGenReed.llIIIIlllIllII[0];
                    "".length();
                    if ("   ".length() > (167 + 24 - 3 + 7 ^ 84 + 168 - 138 + 85)) {
                        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
                    }
                    while (!lIIIlIIIIllIIIll(llllllllllllIlllIllIIllllIlllIll, llllllllllllIlllIllIIllllIllllII)) {
                        if (lIIIlIIIIllIIIII(Blocks.reeds.canBlockStay(llllllllllllIlllIllIIllllIlllIlI, llllllllllllIlllIllIIllllIlllllI) ? 1 : 0)) {
                            llllllllllllIlllIllIIllllIlllIlI.setBlockState(llllllllllllIlllIllIIllllIlllllI.up(llllllllllllIlllIllIIllllIlllIll), Blocks.reeds.getDefaultState(), WorldGenReed.llIIIIlllIllII[2]);
                            "".length();
                        }
                        ++llllllllllllIlllIllIIllllIlllIll;
                    }
                }
            }
            ++llllllllllllIlllIllIIllllIllllll;
        }
        return WorldGenReed.llIIIIlllIllII[4] != 0;
    }
    
    private static boolean lIIIlIIIIllIIIII(final int llllllllllllIlllIllIIllllIlIIlIl) {
        return llllllllllllIlllIllIIllllIlIIlIl != 0;
    }
    
    private static void lIIIlIIIIlIlllll() {
        (llIIIIlllIllII = new int[6])[0] = ((0x81 ^ 0xBA) & ~(0xE ^ 0x35));
        WorldGenReed.llIIIIlllIllII[1] = (0xE ^ 0xA);
        WorldGenReed.llIIIIlllIllII[2] = "  ".length();
        WorldGenReed.llIIIIlllIllII[3] = "   ".length();
        WorldGenReed.llIIIIlllIllII[4] = " ".length();
        WorldGenReed.llIIIIlllIllII[5] = (0x5 ^ 0x11);
    }
    
    private static boolean lIIIlIIIIllIIIIl(final Object llllllllllllIlllIllIIllllIlIllII, final Object llllllllllllIlllIllIIllllIlIlIll) {
        return llllllllllllIlllIllIIllllIlIllII != llllllllllllIlllIllIIllllIlIlIll;
    }
    
    private static boolean lIIIlIIIIllIIIlI(final Object llllllllllllIlllIllIIllllIlIlIII, final Object llllllllllllIlllIllIIllllIlIIlll) {
        return llllllllllllIlllIllIIllllIlIlIII == llllllllllllIlllIllIIllllIlIIlll;
    }
}
