// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenMelon extends WorldGenerator
{
    private static final /* synthetic */ int[] lllIIlIllIIlll;
    
    private static void lIIlllllllIIlIlI() {
        (lllIIlIllIIlll = new int[6])[0] = ((0x6F ^ 0x23) & ~(0x68 ^ 0x24));
        WorldGenMelon.lllIIlIllIIlll[1] = (0x4A ^ 0x42 ^ ((0x5F ^ 0xA) & ~(0x7B ^ 0x2E)));
        WorldGenMelon.lllIIlIllIIlll[2] = (0x26 ^ 0x22);
        WorldGenMelon.lllIIlIllIIlll[3] = "  ".length();
        WorldGenMelon.lllIIlIllIIlll[4] = (83 + 82 - 39 + 110 ^ 82 + 62 - 77 + 105);
        WorldGenMelon.lllIIlIllIIlll[5] = " ".length();
    }
    
    @Override
    public boolean generate(final World llllllllllllIlIllllIIllIlIlIlIlI, final Random llllllllllllIlIllllIIllIlIlIlIIl, final BlockPos llllllllllllIlIllllIIllIlIlIllIl) {
        int llllllllllllIlIllllIIllIlIlIllII = WorldGenMelon.lllIIlIllIIlll[0];
        "".length();
        if (-" ".length() != -" ".length()) {
            return ((0xC ^ 0x44) & ~(0x11 ^ 0x59)) != 0x0;
        }
        while (!lIIlllllllIlIIll(llllllllllllIlIllllIIllIlIlIllII, WorldGenMelon.lllIIlIllIIlll[4])) {
            final BlockPos llllllllllllIlIllllIIllIlIlIlIll = llllllllllllIlIllllIIllIlIlIllIl.add(llllllllllllIlIllllIIllIlIlIlIIl.nextInt(WorldGenMelon.lllIIlIllIIlll[1]) - llllllllllllIlIllllIIllIlIlIlIIl.nextInt(WorldGenMelon.lllIIlIllIIlll[1]), llllllllllllIlIllllIIllIlIlIlIIl.nextInt(WorldGenMelon.lllIIlIllIIlll[2]) - llllllllllllIlIllllIIllIlIlIlIIl.nextInt(WorldGenMelon.lllIIlIllIIlll[2]), llllllllllllIlIllllIIllIlIlIlIIl.nextInt(WorldGenMelon.lllIIlIllIIlll[1]) - llllllllllllIlIllllIIllIlIlIlIIl.nextInt(WorldGenMelon.lllIIlIllIIlll[1]));
            if (lIIlllllllIlIIII(Blocks.melon_block.canPlaceBlockAt(llllllllllllIlIllllIIllIlIlIlIlI, llllllllllllIlIllllIIllIlIlIlIll) ? 1 : 0) && lIIlllllllIlIIlI(llllllllllllIlIllllIIllIlIlIlIlI.getBlockState(llllllllllllIlIllllIIllIlIlIlIll.down()).getBlock(), Blocks.grass)) {
                llllllllllllIlIllllIIllIlIlIlIlI.setBlockState(llllllllllllIlIllllIIllIlIlIlIll, Blocks.melon_block.getDefaultState(), WorldGenMelon.lllIIlIllIIlll[3]);
                "".length();
            }
            ++llllllllllllIlIllllIIllIlIlIllII;
        }
        return WorldGenMelon.lllIIlIllIIlll[5] != 0;
    }
    
    private static boolean lIIlllllllIlIIlI(final Object llllllllllllIlIllllIIllIlIIlllll, final Object llllllllllllIlIllllIIllIlIIllllI) {
        return llllllllllllIlIllllIIllIlIIlllll == llllllllllllIlIllllIIllIlIIllllI;
    }
    
    private static boolean lIIlllllllIlIIll(final int llllllllllllIlIllllIIllIlIlIIIll, final int llllllllllllIlIllllIIllIlIlIIIlI) {
        return llllllllllllIlIllllIIllIlIlIIIll >= llllllllllllIlIllllIIllIlIlIIIlI;
    }
    
    private static boolean lIIlllllllIlIIII(final int llllllllllllIlIllllIIllIlIIlllII) {
        return llllllllllllIlIllllIIllIlIIlllII != 0;
    }
    
    static {
        lIIlllllllIIlIlI();
    }
}
