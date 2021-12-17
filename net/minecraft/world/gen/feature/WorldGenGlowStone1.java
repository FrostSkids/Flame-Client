// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.util.EnumFacing;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenGlowStone1 extends WorldGenerator
{
    private static final /* synthetic */ int[] llllIlIIIlIll;
    
    private static boolean lIlIlIIlllIlIII(final Object lllllllllllllIlIllIllllIIIIIllll, final Object lllllllllllllIlIllIllllIIIIIlllI) {
        return lllllllllllllIlIllIllllIIIIIllll != lllllllllllllIlIllIllllIIIIIlllI;
    }
    
    private static boolean lIlIlIIlllIlIlI(final int lllllllllllllIlIllIllllIIIIlIIll, final int lllllllllllllIlIllIllllIIIIlIIlI) {
        return lllllllllllllIlIllIllllIIIIlIIll > lllllllllllllIlIllIllllIIIIlIIlI;
    }
    
    private static boolean lIlIlIIlllIIlll(final int lllllllllllllIlIllIllllIIIIIlIII) {
        return lllllllllllllIlIllIllllIIIIIlIII == 0;
    }
    
    private static boolean lIlIlIIlllIllII(final int lllllllllllllIlIllIllllIIIIllIll, final int lllllllllllllIlIllIllllIIIIllIlI) {
        return lllllllllllllIlIllIllllIIIIllIll == lllllllllllllIlIllIllllIIIIllIlI;
    }
    
    private static boolean lIlIlIIlllIlIIl(final Object lllllllllllllIlIllIllllIIIIIlIll, final Object lllllllllllllIlIllIllllIIIIIlIlI) {
        return lllllllllllllIlIllIllllIIIIIlIll == lllllllllllllIlIllIllllIIIIIlIlI;
    }
    
    private static boolean lIlIlIIlllIlIll(final int lllllllllllllIlIllIllllIIIIlIlll, final int lllllllllllllIlIllIllllIIIIlIllI) {
        return lllllllllllllIlIllIllllIIIIlIlll >= lllllllllllllIlIllIllllIIIIlIllI;
    }
    
    static {
        lIlIlIIlllIIllI();
    }
    
    private static void lIlIlIIlllIIllI() {
        (llllIlIIIlIll = new int[6])[0] = ((65 + 107 - 24 + 93 ^ 50 + 100 - 6 + 40) & (0xC7 ^ 0x84 ^ (0x40 ^ 0x4A) ^ -" ".length()));
        WorldGenGlowStone1.llllIlIIIlIll[1] = "  ".length();
        WorldGenGlowStone1.llllIlIIIlIll[2] = (0xA1 ^ 0x98 ^ (0xB2 ^ 0x83));
        WorldGenGlowStone1.llllIlIIIlIll[3] = (0xF ^ 0x3);
        WorldGenGlowStone1.llllIlIIIlIll[4] = " ".length();
        WorldGenGlowStone1.llllIlIIIlIll[5] = (0xFFFFA5FF & 0x5FDC);
    }
    
    @Override
    public boolean generate(final World lllllllllllllIlIllIllllIIIlIIlll, final Random lllllllllllllIlIllIllllIIIlIllIl, final BlockPos lllllllllllllIlIllIllllIIIlIIlIl) {
        if (lIlIlIIlllIIlll(lllllllllllllIlIllIllllIIIlIIlll.isAirBlock(lllllllllllllIlIllIllllIIIlIIlIl) ? 1 : 0)) {
            return WorldGenGlowStone1.llllIlIIIlIll[0] != 0;
        }
        if (lIlIlIIlllIlIII(lllllllllllllIlIllIllllIIIlIIlll.getBlockState(lllllllllllllIlIllIllllIIIlIIlIl.up()).getBlock(), Blocks.netherrack)) {
            return WorldGenGlowStone1.llllIlIIIlIll[0] != 0;
        }
        lllllllllllllIlIllIllllIIIlIIlll.setBlockState(lllllllllllllIlIllIllllIIIlIIlIl, Blocks.glowstone.getDefaultState(), WorldGenGlowStone1.llllIlIIIlIll[1]);
        "".length();
        int lllllllllllllIlIllIllllIIIlIlIll = WorldGenGlowStone1.llllIlIIIlIll[0];
        "".length();
        if (-" ".length() < -" ".length()) {
            return ((0x7 ^ 0x1) & ~(0xB8 ^ 0xBE)) != 0x0;
        }
        while (!lIlIlIIlllIlIll(lllllllllllllIlIllIllllIIIlIlIll, WorldGenGlowStone1.llllIlIIIlIll[5])) {
            final BlockPos lllllllllllllIlIllIllllIIIlIlIlI = lllllllllllllIlIllIllllIIIlIIlIl.add(lllllllllllllIlIllIllllIIIlIllIl.nextInt(WorldGenGlowStone1.llllIlIIIlIll[2]) - lllllllllllllIlIllIllllIIIlIllIl.nextInt(WorldGenGlowStone1.llllIlIIIlIll[2]), -lllllllllllllIlIllIllllIIIlIllIl.nextInt(WorldGenGlowStone1.llllIlIIIlIll[3]), lllllllllllllIlIllIllllIIIlIllIl.nextInt(WorldGenGlowStone1.llllIlIIIlIll[2]) - lllllllllllllIlIllIllllIIIlIllIl.nextInt(WorldGenGlowStone1.llllIlIIIlIll[2]));
            if (lIlIlIIlllIlIIl(lllllllllllllIlIllIllllIIIlIIlll.getBlockState(lllllllllllllIlIllIllllIIIlIlIlI).getBlock().getMaterial(), Material.air)) {
                int lllllllllllllIlIllIllllIIIlIlIIl = WorldGenGlowStone1.llllIlIIIlIll[0];
                final int lllllllllllllIlIllIllllIIIIllllI;
                final String lllllllllllllIlIllIllllIIIIlllll = (String)((EnumFacing[])(Object)(lllllllllllllIlIllIllllIIIIllllI = (int)(Object)EnumFacing.values())).length;
                byte lllllllllllllIlIllIllllIIIlIIIII = (byte)WorldGenGlowStone1.llllIlIIIlIll[0];
                "".length();
                if (((0x1E ^ 0x64 ^ (0x71 ^ 0x3B)) & (11 + 88 + 58 + 8 ^ 13 + 0 - 8 + 144 ^ -" ".length())) != 0x0) {
                    return ((38 + 88 + 16 + 12 ^ 126 + 126 - 239 + 120) & (11 + 127 - 83 + 74 ^ 95 + 6 - 67 + 124 ^ -" ".length())) != 0x0;
                }
                while (!lIlIlIIlllIlIll(lllllllllllllIlIllIllllIIIlIIIII, (int)lllllllllllllIlIllIllllIIIIlllll)) {
                    final EnumFacing lllllllllllllIlIllIllllIIIlIlIII = lllllllllllllIlIllIllllIIIIllllI[lllllllllllllIlIllIllllIIIlIIIII];
                    if (lIlIlIIlllIlIIl(lllllllllllllIlIllIllllIIIlIIlll.getBlockState(lllllllllllllIlIllIllllIIIlIlIlI.offset(lllllllllllllIlIllIllllIIIlIlIII)).getBlock(), Blocks.glowstone)) {
                        ++lllllllllllllIlIllIllllIIIlIlIIl;
                    }
                    if (lIlIlIIlllIlIlI(lllllllllllllIlIllIllllIIIlIlIIl, WorldGenGlowStone1.llllIlIIIlIll[4])) {
                        "".length();
                        if (null != null) {
                            return ((0xAF ^ 0x8B) & ~(0xB5 ^ 0x91)) != 0x0;
                        }
                        break;
                    }
                    else {
                        ++lllllllllllllIlIllIllllIIIlIIIII;
                    }
                }
                if (lIlIlIIlllIllII(lllllllllllllIlIllIllllIIIlIlIIl, WorldGenGlowStone1.llllIlIIIlIll[4])) {
                    lllllllllllllIlIllIllllIIIlIIlll.setBlockState(lllllllllllllIlIllIllllIIIlIlIlI, Blocks.glowstone.getDefaultState(), WorldGenGlowStone1.llllIlIIIlIll[1]);
                    "".length();
                }
            }
            ++lllllllllllllIlIllIllllIIIlIlIll;
        }
        return WorldGenGlowStone1.llllIlIIIlIll[4] != 0;
    }
}
