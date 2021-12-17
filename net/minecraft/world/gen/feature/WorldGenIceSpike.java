// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.util.Vec3i;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenIceSpike extends WorldGenerator
{
    private static final /* synthetic */ int[] lIIIIllIlIIIII;
    
    private static boolean lIlllIllIllllIl(final int lllllllllllllIlIIlIIllIIlIIlIIIl, final int lllllllllllllIlIIlIIllIIlIIlIIII) {
        return lllllllllllllIlIIlIIllIIlIIlIIIl <= lllllllllllllIlIIlIIllIIlIIlIIII;
    }
    
    private static int lIlllIllIlllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIlllIllIlllllI(final Object lllllllllllllIlIIlIIllIIlIIIlIIl, final Object lllllllllllllIlIIlIIllIIlIIIlIII) {
        return lllllllllllllIlIIlIIllIIlIIIlIIl != lllllllllllllIlIIlIIllIIlIIIlIII;
    }
    
    private static boolean lIlllIlllIIIlII(final Object lllllllllllllIlIIlIIllIIlIIIIlIl, final Object lllllllllllllIlIIlIIllIIlIIIIlII) {
        return lllllllllllllIlIIlIIllIIlIIIIlIl == lllllllllllllIlIIlIIllIIlIIIIlII;
    }
    
    private static boolean lIlllIlllIIIlIl(final int lllllllllllllIlIIlIIllIIlIIlIlIl, final int lllllllllllllIlIIlIIllIIlIIlIlII) {
        return lllllllllllllIlIIlIIllIIlIIlIlIl >= lllllllllllllIlIIlIIllIIlIIlIlII;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIlIIlIIllIIlIllllII, final Random lllllllllllllIlIIlIIllIIlIlllIll, BlockPos lllllllllllllIlIIlIIllIIlIlIIllI) {
        "".length();
        if (-" ".length() > "  ".length()) {
            return ((0x11 ^ 0x8) & ~(0x84 ^ 0x9D)) != 0x0;
        }
        while (lIlllIllIllllII(lllllllllllllIlIIlIIllIIlIllllII.isAirBlock((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI) ? 1 : 0) && !lIlllIllIllllIl(((Vec3i)lllllllllllllIlIIlIIllIIlIlIIllI).getY(), WorldGenIceSpike.lIIIIllIlIIIII[0])) {
            lllllllllllllIlIIlIIllIIlIlIIllI = ((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI).down();
        }
        if (lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIllllII.getBlockState((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI).getBlock(), Blocks.snow)) {
            return WorldGenIceSpike.lIIIIllIlIIIII[1] != 0;
        }
        lllllllllllllIlIIlIIllIIlIlIIllI = ((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI).up(lllllllllllllIlIIlIIllIIlIlllIll.nextInt(WorldGenIceSpike.lIIIIllIlIIIII[2]));
        final int lllllllllllllIlIIlIIllIIlIlllIIl = lllllllllllllIlIIlIIllIIlIlllIll.nextInt(WorldGenIceSpike.lIIIIllIlIIIII[2]) + WorldGenIceSpike.lIIIIllIlIIIII[3];
        final int lllllllllllllIlIIlIIllIIlIlllIII = lllllllllllllIlIIlIIllIIlIlllIIl / WorldGenIceSpike.lIIIIllIlIIIII[2] + lllllllllllllIlIIlIIllIIlIlllIll.nextInt(WorldGenIceSpike.lIIIIllIlIIIII[0]);
        if (lIlllIllIllllll(lllllllllllllIlIIlIIllIIlIlllIII, WorldGenIceSpike.lIIIIllIlIIIII[4]) && lIlllIlllIIIIII(lllllllllllllIlIIlIIllIIlIlllIll.nextInt(WorldGenIceSpike.lIIIIllIlIIIII[5]))) {
            lllllllllllllIlIIlIIllIIlIlIIllI = ((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI).up(WorldGenIceSpike.lIIIIllIlIIIII[6] + lllllllllllllIlIIlIIllIIlIlllIll.nextInt(WorldGenIceSpike.lIIIIllIlIIIII[7]));
        }
        int lllllllllllllIlIIlIIllIIlIllIlll = WorldGenIceSpike.lIIIIllIlIIIII[1];
        "".length();
        if (((92 + 12 + 49 + 28 ^ 131 + 162 - 130 + 27) & (110 + 85 - 69 + 32 ^ 10 + 141 - 61 + 59 ^ -" ".length())) > "  ".length()) {
            return ((204 + 95 - 105 + 19 ^ 149 + 48 - 61 + 14) & (0x9 ^ 0x35 ^ 116 + 78 - 191 + 124 ^ -" ".length())) != 0x0;
        }
        while (!lIlllIlllIIIlIl(lllllllllllllIlIIlIIllIIlIllIlll, lllllllllllllIlIIlIIllIIlIlllIIl)) {
            final float lllllllllllllIlIIlIIllIIlIllIllI = (1.0f - lllllllllllllIlIIlIIllIIlIllIlll / (float)lllllllllllllIlIIlIIllIIlIlllIIl) * lllllllllllllIlIIlIIllIIlIlllIII;
            final int lllllllllllllIlIIlIIllIIlIllIlIl = MathHelper.ceiling_float_int(lllllllllllllIlIIlIIllIIlIllIllI);
            int lllllllllllllIlIIlIIllIIlIllIlII = -lllllllllllllIlIIlIIllIIlIllIlIl;
            "".length();
            if (-" ".length() > 0) {
                return ((0xF5 ^ 0xB4) & ~(0xFC ^ 0xBD)) != 0x0;
            }
            while (!lIlllIllIllllll(lllllllllllllIlIIlIIllIIlIllIlII, lllllllllllllIlIIlIIllIIlIllIlIl)) {
                final float lllllllllllllIlIIlIIllIIlIllIIll = MathHelper.abs_int(lllllllllllllIlIIlIIllIIlIllIlII) - 0.25f;
                int lllllllllllllIlIIlIIllIIlIllIIlI = -lllllllllllllIlIIlIIllIIlIllIlIl;
                "".length();
                if (((0x52 ^ 0x79 ^ (0xFD ^ 0x80)) & (0x2D ^ 0x5A ^ (0x38 ^ 0x19) ^ -" ".length())) != 0x0) {
                    return ((0x26 ^ 0x73 ^ (0x76 ^ 0x6D)) & (0x18 ^ 0x13 ^ (0x56 ^ 0x13) ^ -" ".length())) != 0x0;
                }
                while (!lIlllIllIllllll(lllllllllllllIlIIlIIllIIlIllIIlI, lllllllllllllIlIIlIIllIIlIllIlIl)) {
                    final float lllllllllllllIlIIlIIllIIlIllIIIl = MathHelper.abs_int(lllllllllllllIlIIlIIllIIlIllIIlI) - 0.25f;
                    if (((lIlllIlllIIIIII(lllllllllllllIlIIlIIllIIlIllIlII) && !lIlllIllIllllII(lllllllllllllIlIIlIIllIIlIllIIlI)) || lIlllIlllIIIIIl(lIlllIllIlllIll(lllllllllllllIlIIlIIllIIlIllIIll * lllllllllllllIlIIlIIllIIlIllIIll + lllllllllllllIlIIlIIllIIlIllIIIl * lllllllllllllIlIIlIIllIIlIllIIIl, lllllllllllllIlIIlIIllIIlIllIllI * lllllllllllllIlIIlIIllIIlIllIllI))) && ((lIlllIlllIIIIlI(lllllllllllllIlIIlIIllIIlIllIlII, -lllllllllllllIlIIlIIllIIlIllIlIl) && lIlllIlllIIIIlI(lllllllllllllIlIIlIIllIIlIllIlII, lllllllllllllIlIIlIIllIIlIllIlIl) && lIlllIlllIIIIlI(lllllllllllllIlIIlIIllIIlIllIIlI, -lllllllllllllIlIIlIIllIIlIllIlIl) && !lIlllIlllIIIIll(lllllllllllllIlIIlIIllIIlIllIIlI, lllllllllllllIlIIlIIllIIlIllIlIl)) || lIlllIlllIIIIIl(lIlllIllIlllIll(lllllllllllllIlIIlIIllIIlIlllIll.nextFloat(), 0.75f)))) {
                        Block lllllllllllllIlIIlIIllIIlIllIIII = lllllllllllllIlIIlIIllIIlIllllII.getBlockState(((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI).add(lllllllllllllIlIIlIIllIIlIllIlII, lllllllllllllIlIIlIIllIIlIllIlll, lllllllllllllIlIIlIIllIIlIllIIlI)).getBlock();
                        if (!lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIllIIII.getMaterial(), Material.air) || !lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIllIIII, Blocks.dirt) || !lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIllIIII, Blocks.snow) || lIlllIlllIIIlII(lllllllllllllIlIIlIIllIIlIllIIII, Blocks.ice)) {
                            this.setBlockAndNotifyAdequately(lllllllllllllIlIIlIIllIIlIllllII, ((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI).add(lllllllllllllIlIIlIIllIIlIllIlII, lllllllllllllIlIIlIIllIIlIllIlll, lllllllllllllIlIIlIIllIIlIllIIlI), Blocks.packed_ice.getDefaultState());
                        }
                        if (lIlllIllIllllII(lllllllllllllIlIIlIIllIIlIllIlll) && lIlllIllIllllll(lllllllllllllIlIIlIIllIIlIllIlIl, WorldGenIceSpike.lIIIIllIlIIIII[4])) {
                            lllllllllllllIlIIlIIllIIlIllIIII = lllllllllllllIlIIlIIllIIlIllllII.getBlockState(((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI).add(lllllllllllllIlIIlIIllIIlIllIlII, -lllllllllllllIlIIlIIllIIlIllIlll, lllllllllllllIlIIlIIllIIlIllIIlI)).getBlock();
                            if (!lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIllIIII.getMaterial(), Material.air) || !lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIllIIII, Blocks.dirt) || !lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIllIIII, Blocks.snow) || lIlllIlllIIIlII(lllllllllllllIlIIlIIllIIlIllIIII, Blocks.ice)) {
                                this.setBlockAndNotifyAdequately(lllllllllllllIlIIlIIllIIlIllllII, ((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI).add(lllllllllllllIlIIlIIllIIlIllIlII, -lllllllllllllIlIIlIIllIIlIllIlll, lllllllllllllIlIIlIIllIIlIllIIlI), Blocks.packed_ice.getDefaultState());
                            }
                        }
                    }
                    ++lllllllllllllIlIIlIIllIIlIllIIlI;
                }
                ++lllllllllllllIlIIlIIllIIlIllIlII;
            }
            ++lllllllllllllIlIIlIIllIIlIllIlll;
        }
        int lllllllllllllIlIIlIIllIIlIlIllll = lllllllllllllIlIIlIIllIIlIlllIII - WorldGenIceSpike.lIIIIllIlIIIII[4];
        if (lIlllIlllIIIllI(lllllllllllllIlIIlIIllIIlIlIllll)) {
            lllllllllllllIlIIlIIllIIlIlIllll = WorldGenIceSpike.lIIIIllIlIIIII[1];
            "".length();
            if (-(0x38 ^ 0x3C) >= 0) {
                return ((0x51 ^ 0x7) & ~(0xC3 ^ 0x95)) != 0x0;
            }
        }
        else if (lIlllIllIllllll(lllllllllllllIlIIlIIllIIlIlIllll, WorldGenIceSpike.lIIIIllIlIIIII[4])) {
            lllllllllllllIlIIlIIllIIlIlIllll = WorldGenIceSpike.lIIIIllIlIIIII[4];
        }
        int lllllllllllllIlIIlIIllIIlIlIlllI = -lllllllllllllIlIIlIIllIIlIlIllll;
        "".length();
        if (((60 + 170 - 96 + 79 ^ 14 + 151 - 36 + 24) & (0x9 ^ 0x0 ^ (0x61 ^ 0x24) ^ -" ".length())) != 0x0) {
            return ((0xCD ^ 0xB6 ^ (0x5B ^ 0x34)) & (107 + 91 - 133 + 82 ^ 7 + 79 + 28 + 21 ^ -" ".length())) != 0x0;
        }
        while (!lIlllIllIllllll(lllllllllllllIlIIlIIllIIlIlIlllI, lllllllllllllIlIIlIIllIIlIlIllll)) {
            int lllllllllllllIlIIlIIllIIlIlIllIl = -lllllllllllllIlIIlIIllIIlIlIllll;
            "".length();
            if (((0x91 ^ 0xB4) & ~(0x9D ^ 0xB8)) >= "   ".length()) {
                return ((0x3D ^ 0x1) & ~(0x95 ^ 0xA9)) != 0x0;
            }
            while (!lIlllIllIllllll(lllllllllllllIlIIlIIllIIlIlIllIl, lllllllllllllIlIIlIIllIIlIlIllll)) {
                BlockPos lllllllllllllIlIIlIIllIIlIlIllII = ((BlockPos)lllllllllllllIlIIlIIllIIlIlIIllI).add(lllllllllllllIlIIlIIllIIlIlIlllI, WorldGenIceSpike.lIIIIllIlIIIII[8], lllllllllllllIlIIlIIllIIlIlIllIl);
                int lllllllllllllIlIIlIIllIIlIlIlIll = WorldGenIceSpike.lIIIIllIlIIIII[9];
                if (lIlllIlllIIIIll(Math.abs(lllllllllllllIlIIlIIllIIlIlIlllI), WorldGenIceSpike.lIIIIllIlIIIII[4]) && lIlllIlllIIIIll(Math.abs(lllllllllllllIlIIlIIllIIlIlIllIl), WorldGenIceSpike.lIIIIllIlIIIII[4])) {
                    lllllllllllllIlIIlIIllIIlIlIlIll = lllllllllllllIlIIlIIllIIlIlllIll.nextInt(WorldGenIceSpike.lIIIIllIlIIIII[10]);
                    "".length();
                    if (null != null) {
                        return ((205 + 95 - 185 + 128 ^ 61 + 27 - 61 + 119) & (0x5F ^ 0x2F ^ (0x42 ^ 0x53) ^ -" ".length())) != 0x0;
                    }
                }
                while (!lIlllIllIllllIl(lllllllllllllIlIIlIIllIIlIlIllII.getY(), WorldGenIceSpike.lIIIIllIlIIIII[9])) {
                    final Block lllllllllllllIlIIlIIllIIlIlIlIlI = lllllllllllllIlIIlIIllIIlIllllII.getBlockState(lllllllllllllIlIIlIIllIIlIlIllII).getBlock();
                    if (lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIlIlIlI.getMaterial(), Material.air) && lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIlIlIlI, Blocks.dirt) && lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIlIlIlI, Blocks.snow) && lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIlIlIlI, Blocks.ice) && lIlllIllIlllllI(lllllllllllllIlIIlIIllIIlIlIlIlI, Blocks.packed_ice)) {
                        "".length();
                        if ((3 + 104 - 40 + 113 ^ 171 + 80 - 160 + 85) < 0) {
                            return ((0x9A ^ 0x8C ^ (0x81 ^ 0xA5)) & (0x46 ^ 0x48 ^ (0xA7 ^ 0x9B) ^ -" ".length()) & (((0xD5 ^ 0x8C ^ (0x1 ^ 0x48)) & (0x3B ^ 0xC ^ (0x5A ^ 0x7D) ^ -" ".length())) ^ -" ".length())) != 0x0;
                        }
                        break;
                    }
                    else {
                        this.setBlockAndNotifyAdequately(lllllllllllllIlIIlIIllIIlIllllII, lllllllllllllIlIIlIIllIIlIlIllII, Blocks.packed_ice.getDefaultState());
                        lllllllllllllIlIIlIIllIIlIlIllII = lllllllllllllIlIIlIIllIIlIlIllII.down();
                        if (!lIlllIlllIIIIIl(--lllllllllllllIlIIlIIllIIlIlIlIll)) {
                            continue;
                        }
                        lllllllllllllIlIIlIIllIIlIlIllII = lllllllllllllIlIIlIIllIIlIlIllII.down(lllllllllllllIlIIlIIllIIlIlllIll.nextInt(WorldGenIceSpike.lIIIIllIlIIIII[10]) + WorldGenIceSpike.lIIIIllIlIIIII[4]);
                        lllllllllllllIlIIlIIllIIlIlIlIll = lllllllllllllIlIIlIIllIIlIlllIll.nextInt(WorldGenIceSpike.lIIIIllIlIIIII[10]);
                    }
                }
                ++lllllllllllllIlIIlIIllIIlIlIllIl;
            }
            ++lllllllllllllIlIIlIIllIIlIlIlllI;
        }
        return WorldGenIceSpike.lIIIIllIlIIIII[4] != 0;
    }
    
    private static boolean lIlllIlllIIIllI(final int lllllllllllllIlIIlIIllIIIllllllI) {
        return lllllllllllllIlIIlIIllIIIllllllI < 0;
    }
    
    static {
        lIlllIllIlllIlI();
    }
    
    private static boolean lIlllIlllIIIIll(final int lllllllllllllIlIIlIIllIIlIIllIIl, final int lllllllllllllIlIIlIIllIIlIIllIII) {
        return lllllllllllllIlIIlIIllIIlIIllIIl == lllllllllllllIlIIlIIllIIlIIllIII;
    }
    
    private static boolean lIlllIlllIIIIIl(final int lllllllllllllIlIIlIIllIIIlllllII) {
        return lllllllllllllIlIIlIIllIIIlllllII <= 0;
    }
    
    private static boolean lIlllIllIllllll(final int lllllllllllllIlIIlIIllIIlIIIllIl, final int lllllllllllllIlIIlIIllIIlIIIllII) {
        return lllllllllllllIlIIlIIllIIlIIIllIl > lllllllllllllIlIIlIIllIIlIIIllII;
    }
    
    private static boolean lIlllIlllIIIIlI(final int lllllllllllllIlIIlIIllIIIllllIIl, final int lllllllllllllIlIIlIIllIIIllllIII) {
        return lllllllllllllIlIIlIIllIIIllllIIl != lllllllllllllIlIIlIIllIIIllllIII;
    }
    
    private static boolean lIlllIllIllllII(final int lllllllllllllIlIIlIIllIIlIIIIIlI) {
        return lllllllllllllIlIIlIIllIIlIIIIIlI != 0;
    }
    
    private static boolean lIlllIlllIIIIII(final int lllllllllllllIlIIlIIllIIlIIIIIII) {
        return lllllllllllllIlIIlIIllIIlIIIIIII == 0;
    }
    
    private static void lIlllIllIlllIlI() {
        (lIIIIllIlIIIII = new int[11])[0] = "  ".length();
        WorldGenIceSpike.lIIIIllIlIIIII[1] = ((0x17 ^ 0x43) & ~(0x39 ^ 0x6D));
        WorldGenIceSpike.lIIIIllIlIIIII[2] = (0x5B ^ 0x5F);
        WorldGenIceSpike.lIIIIllIlIIIII[3] = (0x81 ^ 0x86);
        WorldGenIceSpike.lIIIIllIlIIIII[4] = " ".length();
        WorldGenIceSpike.lIIIIllIlIIIII[5] = (0x1F ^ 0x18 ^ (0x67 ^ 0x5C));
        WorldGenIceSpike.lIIIIllIlIIIII[6] = (0x4C ^ 0x7B ^ (0xB ^ 0x36));
        WorldGenIceSpike.lIIIIllIlIIIII[7] = (0x72 ^ 0x0 ^ (0x26 ^ 0x4A));
        WorldGenIceSpike.lIIIIllIlIIIII[8] = -" ".length();
        WorldGenIceSpike.lIIIIllIlIIIII[9] = (0x71 ^ 0x10 ^ (0x4E ^ 0x1D));
        WorldGenIceSpike.lIIIIllIlIIIII[10] = (0xBE ^ 0xBB);
    }
}
