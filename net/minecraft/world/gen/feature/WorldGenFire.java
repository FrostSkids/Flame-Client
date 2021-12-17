// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenFire extends WorldGenerator
{
    private static final /* synthetic */ int[] lllIIlIIllllll;
    
    static {
        lIIllllllIIIlIIl();
    }
    
    private static boolean lIIllllllIIIlIlI(final int llllllllllllIlIllllIlIIllIlIlIll) {
        return llllllllllllIlIllllIlIIllIlIlIll != 0;
    }
    
    private static boolean lIIllllllIIIllII(final int llllllllllllIlIllllIlIIllIllIIlI, final int llllllllllllIlIllllIlIIllIllIIIl) {
        return llllllllllllIlIllllIlIIllIllIIlI >= llllllllllllIlIllllIlIIllIllIIIl;
    }
    
    @Override
    public boolean generate(final World llllllllllllIlIllllIlIIllIlllllI, final Random llllllllllllIlIllllIlIIllIlllIII, final BlockPos llllllllllllIlIllllIlIIllIllllII) {
        int llllllllllllIlIllllIlIIllIlllIll = WorldGenFire.lllIIlIIllllll[0];
        "".length();
        if (-"  ".length() > 0) {
            return ((0x7F ^ 0x5A) & ~(0x1E ^ 0x3B)) != 0x0;
        }
        while (!lIIllllllIIIllII(llllllllllllIlIllllIlIIllIlllIll, WorldGenFire.lllIIlIIllllll[4])) {
            final BlockPos llllllllllllIlIllllIlIIllIlllIlI = llllllllllllIlIllllIlIIllIllllII.add(llllllllllllIlIllllIlIIllIlllIII.nextInt(WorldGenFire.lllIIlIIllllll[1]) - llllllllllllIlIllllIlIIllIlllIII.nextInt(WorldGenFire.lllIIlIIllllll[1]), llllllllllllIlIllllIlIIllIlllIII.nextInt(WorldGenFire.lllIIlIIllllll[2]) - llllllllllllIlIllllIlIIllIlllIII.nextInt(WorldGenFire.lllIIlIIllllll[2]), llllllllllllIlIllllIlIIllIlllIII.nextInt(WorldGenFire.lllIIlIIllllll[1]) - llllllllllllIlIllllIlIIllIlllIII.nextInt(WorldGenFire.lllIIlIIllllll[1]));
            if (lIIllllllIIIlIlI(llllllllllllIlIllllIlIIllIlllllI.isAirBlock(llllllllllllIlIllllIlIIllIlllIlI) ? 1 : 0) && lIIllllllIIIlIll(llllllllllllIlIllllIlIIllIlllllI.getBlockState(llllllllllllIlIllllIlIIllIlllIlI.down()).getBlock(), Blocks.netherrack)) {
                llllllllllllIlIllllIlIIllIlllllI.setBlockState(llllllllllllIlIllllIlIIllIlllIlI, Blocks.fire.getDefaultState(), WorldGenFire.lllIIlIIllllll[3]);
                "".length();
            }
            ++llllllllllllIlIllllIlIIllIlllIll;
        }
        return WorldGenFire.lllIIlIIllllll[5] != 0;
    }
    
    private static void lIIllllllIIIlIIl() {
        (lllIIlIIllllll = new int[6])[0] = ((0x25 ^ 0xD) & ~(0x54 ^ 0x7C) & ~((0x98 ^ 0x83) & ~(0x60 ^ 0x7B)));
        WorldGenFire.lllIIlIIllllll[1] = (0x83 ^ 0x8B);
        WorldGenFire.lllIIlIIllllll[2] = (0x39 ^ 0x42 ^ 123 + 9 - 5 + 0);
        WorldGenFire.lllIIlIIllllll[3] = "  ".length();
        WorldGenFire.lllIIlIIllllll[4] = (0xEB ^ 0xAB);
        WorldGenFire.lllIIlIIllllll[5] = " ".length();
    }
    
    private static boolean lIIllllllIIIlIll(final Object llllllllllllIlIllllIlIIllIlIlllI, final Object llllllllllllIlIllllIlIIllIlIllIl) {
        return llllllllllllIlIllllIlIIllIlIlllI == llllllllllllIlIllllIlIIllIlIllIl;
    }
}
