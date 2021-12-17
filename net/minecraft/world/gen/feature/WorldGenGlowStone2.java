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

public class WorldGenGlowStone2 extends WorldGenerator
{
    private static final /* synthetic */ int[] llIllIlIIlllIl;
    
    private static boolean lIIlIlllllIIlIIl(final int llllllllllllIllIIllIllIlIllIIlIl, final int llllllllllllIllIIllIllIlIllIIlII) {
        return llllllllllllIllIIllIllIlIllIIlIl >= llllllllllllIllIIllIllIlIllIIlII;
    }
    
    private static boolean lIIlIlllllIIIllI(final Object llllllllllllIllIIllIllIlIlIlllIl, final Object llllllllllllIllIIllIllIlIlIlllII) {
        return llllllllllllIllIIllIllIlIlIlllIl != llllllllllllIllIIllIllIlIlIlllII;
    }
    
    @Override
    public boolean generate(final World llllllllllllIllIIllIllIlIlllIlIl, final Random llllllllllllIllIIllIllIlIlllIlII, final BlockPos llllllllllllIllIIllIllIlIllllIlI) {
        if (lIIlIlllllIIIlIl(llllllllllllIllIIllIllIlIlllIlIl.isAirBlock(llllllllllllIllIIllIllIlIllllIlI) ? 1 : 0)) {
            return WorldGenGlowStone2.llIllIlIIlllIl[0] != 0;
        }
        if (lIIlIlllllIIIllI(llllllllllllIllIIllIllIlIlllIlIl.getBlockState(llllllllllllIllIIllIllIlIllllIlI.up()).getBlock(), Blocks.netherrack)) {
            return WorldGenGlowStone2.llIllIlIIlllIl[0] != 0;
        }
        llllllllllllIllIIllIllIlIlllIlIl.setBlockState(llllllllllllIllIIllIllIlIllllIlI, Blocks.glowstone.getDefaultState(), WorldGenGlowStone2.llIllIlIIlllIl[1]);
        "".length();
        int llllllllllllIllIIllIllIlIllllIIl = WorldGenGlowStone2.llIllIlIIlllIl[0];
        "".length();
        if ("   ".length() != "   ".length()) {
            return ((2 + 69 - 27 + 107 ^ 3 + 19 + 79 + 33) & (82 + 46 - 91 + 134 ^ 115 + 52 - 136 + 155 ^ -" ".length())) != 0x0;
        }
        while (!lIIlIlllllIIlIIl(llllllllllllIllIIllIllIlIllllIIl, WorldGenGlowStone2.llIllIlIIlllIl[5])) {
            final BlockPos llllllllllllIllIIllIllIlIllllIII = llllllllllllIllIIllIllIlIllllIlI.add(llllllllllllIllIIllIllIlIlllIlII.nextInt(WorldGenGlowStone2.llIllIlIIlllIl[2]) - llllllllllllIllIIllIllIlIlllIlII.nextInt(WorldGenGlowStone2.llIllIlIIlllIl[2]), -llllllllllllIllIIllIllIlIlllIlII.nextInt(WorldGenGlowStone2.llIllIlIIlllIl[3]), llllllllllllIllIIllIllIlIlllIlII.nextInt(WorldGenGlowStone2.llIllIlIIlllIl[2]) - llllllllllllIllIIllIllIlIlllIlII.nextInt(WorldGenGlowStone2.llIllIlIIlllIl[2]));
            if (lIIlIlllllIIIlll(llllllllllllIllIIllIllIlIlllIlIl.getBlockState(llllllllllllIllIIllIllIlIllllIII).getBlock().getMaterial(), Material.air)) {
                int llllllllllllIllIIllIllIlIlllIlll = WorldGenGlowStone2.llIllIlIIlllIl[0];
                final char llllllllllllIllIIllIllIlIllIllII;
                final char llllllllllllIllIIllIllIlIllIllIl = (char)((EnumFacing[])(Object)(llllllllllllIllIIllIllIlIllIllII = (char)(Object)EnumFacing.values())).length;
                String llllllllllllIllIIllIllIlIllIlllI = (String)WorldGenGlowStone2.llIllIlIIlllIl[0];
                "".length();
                if ((0x77 ^ 0x2F ^ (0xC7 ^ 0x9B)) < -" ".length()) {
                    return ((130 + 62 - 103 + 74 ^ 134 + 63 - 140 + 93) & (0x33 ^ 0xE ^ (0x2 ^ 0xA) ^ -" ".length())) != 0x0;
                }
                while (!lIIlIlllllIIlIIl((int)llllllllllllIllIIllIllIlIllIlllI, llllllllllllIllIIllIllIlIllIllIl)) {
                    final EnumFacing llllllllllllIllIIllIllIlIlllIllI = llllllllllllIllIIllIllIlIllIllII[llllllllllllIllIIllIllIlIllIlllI];
                    if (lIIlIlllllIIIlll(llllllllllllIllIIllIllIlIlllIlIl.getBlockState(llllllllllllIllIIllIllIlIllllIII.offset(llllllllllllIllIIllIllIlIlllIllI)).getBlock(), Blocks.glowstone)) {
                        ++llllllllllllIllIIllIllIlIlllIlll;
                    }
                    if (lIIlIlllllIIlIII(llllllllllllIllIIllIllIlIlllIlll, WorldGenGlowStone2.llIllIlIIlllIl[4])) {
                        "".length();
                        if ("   ".length() < 0) {
                            return ((0x35 ^ 0x64) & ~(0x6F ^ 0x3E)) != 0x0;
                        }
                        break;
                    }
                    else {
                        ++llllllllllllIllIIllIllIlIllIlllI;
                    }
                }
                if (lIIlIlllllIIlIlI(llllllllllllIllIIllIllIlIlllIlll, WorldGenGlowStone2.llIllIlIIlllIl[4])) {
                    llllllllllllIllIIllIllIlIlllIlIl.setBlockState(llllllllllllIllIIllIllIlIllllIII, Blocks.glowstone.getDefaultState(), WorldGenGlowStone2.llIllIlIIlllIl[1]);
                    "".length();
                }
            }
            ++llllllllllllIllIIllIllIlIllllIIl;
        }
        return WorldGenGlowStone2.llIllIlIIlllIl[4] != 0;
    }
    
    private static boolean lIIlIlllllIIlIII(final int llllllllllllIllIIllIllIlIllIIIIl, final int llllllllllllIllIIllIllIlIllIIIII) {
        return llllllllllllIllIIllIllIlIllIIIIl > llllllllllllIllIIllIllIlIllIIIII;
    }
    
    static {
        lIIlIlllllIIIlII();
    }
    
    private static boolean lIIlIlllllIIIlll(final Object llllllllllllIllIIllIllIlIlIllIIl, final Object llllllllllllIllIIllIllIlIlIllIII) {
        return llllllllllllIllIIllIllIlIlIllIIl == llllllllllllIllIIllIllIlIlIllIII;
    }
    
    private static boolean lIIlIlllllIIlIlI(final int llllllllllllIllIIllIllIlIllIlIIl, final int llllllllllllIllIIllIllIlIllIlIII) {
        return llllllllllllIllIIllIllIlIllIlIIl == llllllllllllIllIIllIllIlIllIlIII;
    }
    
    private static void lIIlIlllllIIIlII() {
        (llIllIlIIlllIl = new int[6])[0] = ((24 + 128 + 13 + 31 ^ 115 + 140 - 192 + 89) & (0xCB ^ 0xBA ^ (0x99 ^ 0xB4) ^ -" ".length()));
        WorldGenGlowStone2.llIllIlIIlllIl[1] = "  ".length();
        WorldGenGlowStone2.llIllIlIIlllIl[2] = (0x38 ^ 0x30);
        WorldGenGlowStone2.llIllIlIIlllIl[3] = (0x51 ^ 0x5D);
        WorldGenGlowStone2.llIllIlIIlllIl[4] = " ".length();
        WorldGenGlowStone2.llIllIlIIlllIl[5] = (-(0xFFFFBEEE & 0x7315) & (0xFFFFF7DF & 0x3FFF));
    }
    
    private static boolean lIIlIlllllIIIlIl(final int llllllllllllIllIIllIllIlIlIlIllI) {
        return llllllllllllIllIIllIllIlIlIlIllI == 0;
    }
}
