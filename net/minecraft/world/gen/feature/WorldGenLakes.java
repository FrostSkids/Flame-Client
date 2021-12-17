// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.world.EnumSkyBlock;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class WorldGenLakes extends WorldGenerator
{
    private /* synthetic */ Block block;
    private static final /* synthetic */ int[] lllIIlIlllllll;
    
    private static boolean lIlIIIIIIIIIIIlI(final int llllllllllllIlIllllIIIllIlllllll) {
        return llllllllllllIlIllllIIIllIlllllll != 0;
    }
    
    private static int lIIllllllllllIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIIIIIIIIIIll(final Object llllllllllllIlIllllIIIlllIIIIllI, final Object llllllllllllIlIllllIIIlllIIIIlIl) {
        return llllllllllllIlIllllIIIlllIIIIllI != llllllllllllIlIllllIIIlllIIIIlIl;
    }
    
    private static boolean lIIlllllllllllIl(final int llllllllllllIlIllllIIIlllIIIlllI, final int llllllllllllIlIllllIIIlllIIIllIl) {
        return llllllllllllIlIllllIIIlllIIIlllI <= llllllllllllIlIllllIIIlllIIIllIl;
    }
    
    @Override
    public boolean generate(final World llllllllllllIlIllllIIIlllIlIllIl, final Random llllllllllllIlIllllIIIllllIlIlII, BlockPos llllllllllllIlIllllIIIlllIlIlIll) {
        llllllllllllIlIllllIIIlllIlIlIll = llllllllllllIlIllllIIIlllIlIlIll.add(WorldGenLakes.lllIIlIlllllll[0], WorldGenLakes.lllIIlIlllllll[1], WorldGenLakes.lllIIlIlllllll[0]);
        "".length();
        if (((0x68 ^ 0x2C) & ~(0x81 ^ 0xC5)) != 0x0) {
            return ((0xAA ^ 0xA1) & ~(0x72 ^ 0x79)) != 0x0;
        }
        while (lIIllllllllllIll(llllllllllllIlIllllIIIlllIlIlIll.getY(), WorldGenLakes.lllIIlIlllllll[2]) && !lIIlllllllllllII(llllllllllllIlIllllIIIlllIlIllIl.isAirBlock(llllllllllllIlIllllIIIlllIlIlIll) ? 1 : 0)) {
            llllllllllllIlIllllIIIlllIlIlIll = llllllllllllIlIllllIIIlllIlIlIll.down();
        }
        if (lIIlllllllllllIl(llllllllllllIlIllllIIIlllIlIlIll.getY(), WorldGenLakes.lllIIlIlllllll[3])) {
            return WorldGenLakes.lllIIlIlllllll[1] != 0;
        }
        llllllllllllIlIllllIIIlllIlIlIll = llllllllllllIlIllllIIIlllIlIlIll.down(WorldGenLakes.lllIIlIlllllll[3]);
        final boolean[] llllllllllllIlIllllIIIllllIlIIlI = new boolean[WorldGenLakes.lllIIlIlllllll[4]];
        final int llllllllllllIlIllllIIIllllIlIIIl = llllllllllllIlIllllIIIllllIlIlII.nextInt(WorldGenLakes.lllIIlIlllllll[3]) + WorldGenLakes.lllIIlIlllllll[3];
        int llllllllllllIlIllllIIIllllIlIIII = WorldGenLakes.lllIIlIlllllll[1];
        "".length();
        if (((0x61 ^ 0x42) & ~(0x8C ^ 0xAF)) > ((0x7 ^ 0x36) & ~(0xBC ^ 0x8D))) {
            return ((0x95 ^ 0x8A) & ~(0x1C ^ 0x3)) != 0x0;
        }
        while (!lIIlllllllllllll(llllllllllllIlIllllIIIllllIlIIII, llllllllllllIlIllllIIIllllIlIIIl)) {
            final double llllllllllllIlIllllIIIllllIIllll = llllllllllllIlIllllIIIllllIlIlII.nextDouble() * 6.0 + 3.0;
            final double llllllllllllIlIllllIIIllllIIlllI = llllllllllllIlIllllIIIllllIlIlII.nextDouble() * 4.0 + 2.0;
            final double llllllllllllIlIllllIIIllllIIllIl = llllllllllllIlIllllIIIllllIlIlII.nextDouble() * 6.0 + 3.0;
            final double llllllllllllIlIllllIIIllllIIllII = llllllllllllIlIllllIIIllllIlIlII.nextDouble() * (16.0 - llllllllllllIlIllllIIIllllIIllll - 2.0) + 1.0 + llllllllllllIlIllllIIIllllIIllll / 2.0;
            final double llllllllllllIlIllllIIIllllIIlIll = llllllllllllIlIllllIIIllllIlIlII.nextDouble() * (8.0 - llllllllllllIlIllllIIIllllIIlllI - 4.0) + 2.0 + llllllllllllIlIllllIIIllllIIlllI / 2.0;
            final double llllllllllllIlIllllIIIllllIIlIlI = llllllllllllIlIllllIIIllllIlIlII.nextDouble() * (16.0 - llllllllllllIlIllllIIIllllIIllIl - 2.0) + 1.0 + llllllllllllIlIllllIIIllllIIllIl / 2.0;
            int llllllllllllIlIllllIIIllllIIlIIl = WorldGenLakes.lllIIlIlllllll[5];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x19 ^ 0xC) & ~(0xD0 ^ 0xC5)) != 0x0;
            }
            while (!lIIlllllllllllll(llllllllllllIlIllllIIIllllIIlIIl, WorldGenLakes.lllIIlIlllllll[9])) {
                int llllllllllllIlIllllIIIllllIIlIII = WorldGenLakes.lllIIlIlllllll[5];
                "".length();
                if ((0x54 ^ 0x50) < " ".length()) {
                    return ((0x0 ^ 0xB) & ~(0x15 ^ 0x1E)) != 0x0;
                }
                while (!lIIlllllllllllll(llllllllllllIlIllllIIIllllIIlIII, WorldGenLakes.lllIIlIlllllll[9])) {
                    int llllllllllllIlIllllIIIllllIIIlll = WorldGenLakes.lllIIlIlllllll[5];
                    "".length();
                    if ("   ".length() <= "  ".length()) {
                        return ((0xC7 ^ 0x82) & ~(0x27 ^ 0x62)) != 0x0;
                    }
                    while (!lIIlllllllllllll(llllllllllllIlIllllIIIllllIIIlll, WorldGenLakes.lllIIlIlllllll[8])) {
                        final double llllllllllllIlIllllIIIllllIIIllI = (llllllllllllIlIllllIIIllllIIlIIl - llllllllllllIlIllllIIIllllIIllII) / (llllllllllllIlIllllIIIllllIIllll / 2.0);
                        final double llllllllllllIlIllllIIIllllIIIlIl = (llllllllllllIlIllllIIIllllIIIlll - llllllllllllIlIllllIIIllllIIlIll) / (llllllllllllIlIllllIIIllllIIlllI / 2.0);
                        final double llllllllllllIlIllllIIIllllIIIlII = (llllllllllllIlIllllIIIllllIIlIII - llllllllllllIlIllllIIIllllIIlIlI) / (llllllllllllIlIllllIIIllllIIllIl / 2.0);
                        final double llllllllllllIlIllllIIIllllIIIIll = llllllllllllIlIllllIIIllllIIIllI * llllllllllllIlIllllIIIllllIIIllI + llllllllllllIlIllllIIIllllIIIlIl * llllllllllllIlIllllIIIllllIIIlIl + llllllllllllIlIllllIIIllllIIIlII * llllllllllllIlIllllIIIllllIIIlII;
                        if (lIIllllllllllllI(lIIllllllllllIlI(llllllllllllIlIllllIIIllllIIIIll, 1.0))) {
                            llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIllllIIlIIl * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIllllIIlIII) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIllllIIIlll] = (WorldGenLakes.lllIIlIlllllll[5] != 0);
                        }
                        ++llllllllllllIlIllllIIIllllIIIlll;
                    }
                    ++llllllllllllIlIllllIIIllllIIlIII;
                }
                ++llllllllllllIlIllllIIIllllIIlIIl;
            }
            ++llllllllllllIlIllllIIIllllIlIIII;
        }
        int llllllllllllIlIllllIIIllllIIIIlI = WorldGenLakes.lllIIlIlllllll[1];
        "".length();
        if (((0x3E ^ 0x46 ^ (0x46 ^ 0x16)) & (15 + 89 - 34 + 67 ^ 97 + 155 - 173 + 82 ^ -" ".length())) != ((0x70 ^ 0x6B ^ (0x9D ^ 0x81)) & (0xD3 ^ 0xB9 ^ (0x21 ^ 0x4C) ^ -" ".length()))) {
            return ((0xAF ^ 0xAB ^ (0x70 ^ 0x16)) & (0x9E ^ 0xBC ^ (0xCE ^ 0x8E) ^ -" ".length())) != 0x0;
        }
        while (!lIIlllllllllllll(llllllllllllIlIllllIIIllllIIIIlI, WorldGenLakes.lllIIlIlllllll[6])) {
            int llllllllllllIlIllllIIIllllIIIIIl = WorldGenLakes.lllIIlIlllllll[1];
            "".length();
            if ("  ".length() < ((165 + 152 - 289 + 143 ^ 52 + 139 - 154 + 146) & (0x63 ^ 0x7B ^ (0x88 ^ 0x8C) ^ -" ".length()))) {
                return ((0xF5 ^ 0x88 ^ (0x33 ^ 0x40)) & (0x55 ^ 0xA ^ (0x1A ^ 0x4B) ^ -" ".length())) != 0x0;
            }
            while (!lIIlllllllllllll(llllllllllllIlIllllIIIllllIIIIIl, WorldGenLakes.lllIIlIlllllll[6])) {
                int llllllllllllIlIllllIIIllllIIIIII = WorldGenLakes.lllIIlIlllllll[1];
                "".length();
                if (((0xB3 ^ 0x8A) & ~(0x66 ^ 0x5F)) != ((0x5C ^ 0x10) & ~(0x2C ^ 0x60))) {
                    return ((0x63 ^ 0x68) & ~(0x87 ^ 0x8C)) != 0x0;
                }
                while (!lIIlllllllllllll(llllllllllllIlIllllIIIllllIIIIII, WorldGenLakes.lllIIlIlllllll[7])) {
                    int n;
                    if (lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIllllIIIIlI * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIllllIIIIIl) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIllllIIIIII] ? 1 : 0) && ((lIlIIIIIIIIIIIII(llllllllllllIlIllllIIIllllIIIIlI, WorldGenLakes.lllIIlIlllllll[9]) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[((llllllllllllIlIllllIIIllllIIIIlI + WorldGenLakes.lllIIlIlllllll[5]) * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIllllIIIIIl) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIllllIIIIII] ? 1 : 0)) || (lIlIIIIIIIIIIIIl(llllllllllllIlIllllIIIllllIIIIlI) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[((llllllllllllIlIllllIIIllllIIIIlI - WorldGenLakes.lllIIlIlllllll[5]) * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIllllIIIIIl) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIllllIIIIII] ? 1 : 0)) || (lIlIIIIIIIIIIIII(llllllllllllIlIllllIIIllllIIIIIl, WorldGenLakes.lllIIlIlllllll[9]) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIllllIIIIlI * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIllllIIIIIl + WorldGenLakes.lllIIlIlllllll[5]) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIllllIIIIII] ? 1 : 0)) || (lIlIIIIIIIIIIIIl(llllllllllllIlIllllIIIllllIIIIIl) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIllllIIIIlI * WorldGenLakes.lllIIlIlllllll[6] + (llllllllllllIlIllllIIIllllIIIIIl - WorldGenLakes.lllIIlIlllllll[5])) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIllllIIIIII] ? 1 : 0)) || (lIlIIIIIIIIIIIII(llllllllllllIlIllllIIIllllIIIIII, WorldGenLakes.lllIIlIlllllll[8]) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIllllIIIIlI * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIllllIIIIIl) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIllllIIIIII + WorldGenLakes.lllIIlIlllllll[5]] ? 1 : 0)) || (lIlIIIIIIIIIIIIl(llllllllllllIlIllllIIIllllIIIIII) && lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIllllIIIIlI * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIllllIIIIIl) * WorldGenLakes.lllIIlIlllllll[7] + (llllllllllllIlIllllIIIllllIIIIII - WorldGenLakes.lllIIlIlllllll[5])] ? 1 : 0)))) {
                        n = WorldGenLakes.lllIIlIlllllll[5];
                        "".length();
                        if ("   ".length() <= "  ".length()) {
                            return ((0xFD ^ 0xAD) & ~(0x17 ^ 0x47)) != 0x0;
                        }
                    }
                    else {
                        n = WorldGenLakes.lllIIlIlllllll[1];
                    }
                    final boolean llllllllllllIlIllllIIIlllIllllll = n != 0;
                    if (lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIlllIllllll ? 1 : 0)) {
                        final Material llllllllllllIlIllllIIIlllIlllllI = llllllllllllIlIllllIIIlllIlIllIl.getBlockState(llllllllllllIlIllllIIIlllIlIlIll.add(llllllllllllIlIllllIIIllllIIIIlI, llllllllllllIlIllllIIIllllIIIIII, llllllllllllIlIllllIIIllllIIIIIl)).getBlock().getMaterial();
                        if (lIIlllllllllllll(llllllllllllIlIllllIIIllllIIIIII, WorldGenLakes.lllIIlIlllllll[3]) && lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIlllIlllllI.isLiquid() ? 1 : 0)) {
                            return WorldGenLakes.lllIIlIlllllll[1] != 0;
                        }
                        if (lIlIIIIIIIIIIIII(llllllllllllIlIllllIIIllllIIIIII, WorldGenLakes.lllIIlIlllllll[3]) && lIIlllllllllllII(llllllllllllIlIllllIIIlllIlllllI.isSolid() ? 1 : 0) && lIlIIIIIIIIIIIll(llllllllllllIlIllllIIIlllIlIllIl.getBlockState(llllllllllllIlIllllIIIlllIlIlIll.add(llllllllllllIlIllllIIIllllIIIIlI, llllllllllllIlIllllIIIllllIIIIII, llllllllllllIlIllllIIIllllIIIIIl)).getBlock(), this.block)) {
                            return WorldGenLakes.lllIIlIlllllll[1] != 0;
                        }
                    }
                    ++llllllllllllIlIllllIIIllllIIIIII;
                }
                ++llllllllllllIlIllllIIIllllIIIIIl;
            }
            ++llllllllllllIlIllllIIIllllIIIIlI;
        }
        int llllllllllllIlIllllIIIlllIllllIl = WorldGenLakes.lllIIlIlllllll[1];
        "".length();
        if (((0x47 ^ 0x6) & ~(0xFD ^ 0xBC)) >= "   ".length()) {
            return ((0x4D ^ 0x77) & ~(0xFB ^ 0xC1)) != 0x0;
        }
        while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIllllIl, WorldGenLakes.lllIIlIlllllll[6])) {
            int llllllllllllIlIllllIIIlllIllllII = WorldGenLakes.lllIIlIlllllll[1];
            "".length();
            if ("  ".length() <= ((0x23 ^ 0x4C ^ (0x76 ^ 0x3D)) & (100 + 153 - 173 + 89 ^ 41 + 130 - 54 + 24 ^ -" ".length()))) {
                return ((0x2B ^ 0x48 ^ (0x2A ^ 0xC)) & (0xE2 ^ 0xAF ^ (0x1F ^ 0x17) ^ -" ".length())) != 0x0;
            }
            while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIllllII, WorldGenLakes.lllIIlIlllllll[6])) {
                int llllllllllllIlIllllIIIlllIlllIll = WorldGenLakes.lllIIlIlllllll[1];
                "".length();
                if (-" ".length() >= 0) {
                    return ((0x38 ^ 0x3F) & ~(0x5A ^ 0x5D) & ~((0xC0 ^ 0x8A) & ~(0xCF ^ 0x85))) != 0x0;
                }
                while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIlllIll, WorldGenLakes.lllIIlIlllllll[7])) {
                    if (lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIlllIllllIl * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIlllIllllII) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIlllIlllIll] ? 1 : 0)) {
                        final BlockPos add = llllllllllllIlIllllIIIlllIlIlIll.add(llllllllllllIlIllllIIIlllIllllIl, llllllllllllIlIllllIIIlllIlllIll, llllllllllllIlIllllIIIlllIllllII);
                        IBlockState lllllllllllllIIIlIlIIIIIlIIIIIIl;
                        if (lIIlllllllllllll(llllllllllllIlIllllIIIlllIlllIll, WorldGenLakes.lllIIlIlllllll[3])) {
                            lllllllllllllIIIlIlIIIIIlIIIIIIl = Blocks.air.getDefaultState();
                            "".length();
                            if (" ".length() <= 0) {
                                return ((0x9F ^ 0xAD) & ~(0x7B ^ 0x49)) != 0x0;
                            }
                        }
                        else {
                            lllllllllllllIIIlIlIIIIIlIIIIIIl = this.block.getDefaultState();
                        }
                        llllllllllllIlIllllIIIlllIlIllIl.setBlockState(add, lllllllllllllIIIlIlIIIIIlIIIIIIl, WorldGenLakes.lllIIlIlllllll[10]);
                        "".length();
                    }
                    ++llllllllllllIlIllllIIIlllIlllIll;
                }
                ++llllllllllllIlIllllIIIlllIllllII;
            }
            ++llllllllllllIlIllllIIIlllIllllIl;
        }
        int llllllllllllIlIllllIIIlllIlllIlI = WorldGenLakes.lllIIlIlllllll[1];
        "".length();
        if (null != null) {
            return ((0x6 ^ 0x33 ^ (0xBB ^ 0x87)) & (29 + 90 - 95 + 183 ^ 110 + 82 - 86 + 92 ^ -" ".length())) != 0x0;
        }
        while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIlllIlI, WorldGenLakes.lllIIlIlllllll[6])) {
            int llllllllllllIlIllllIIIlllIlllIIl = WorldGenLakes.lllIIlIlllllll[1];
            "".length();
            if (null != null) {
                return ((24 + 90 + 11 + 6 ^ 40 + 93 + 4 + 15) & (0x8B ^ 0xA4 ^ (0x2B ^ 0x1F) ^ -" ".length())) != 0x0;
            }
            while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIlllIIl, WorldGenLakes.lllIIlIlllllll[6])) {
                int llllllllllllIlIllllIIIlllIlllIII = WorldGenLakes.lllIIlIlllllll[3];
                "".length();
                if ("   ".length() > (0xFE ^ 0x9C ^ (0xDB ^ 0xBD))) {
                    return ((0x18 ^ 0x37 ^ (0x16 ^ 0x1)) & (54 + 31 - 72 + 168 ^ 120 + 88 - 148 + 81 ^ -" ".length())) != 0x0;
                }
                while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIlllIII, WorldGenLakes.lllIIlIlllllll[7])) {
                    if (lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIlllIlllIlI * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIlllIlllIIl) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIlllIlllIII] ? 1 : 0)) {
                        final BlockPos llllllllllllIlIllllIIIlllIllIlll = llllllllllllIlIllllIIIlllIlIlIll.add(llllllllllllIlIllllIIIlllIlllIlI, llllllllllllIlIllllIIIlllIlllIII - WorldGenLakes.lllIIlIlllllll[5], llllllllllllIlIllllIIIlllIlllIIl);
                        if (lIlIIIIIIIIIIlII(llllllllllllIlIllllIIIlllIlIllIl.getBlockState(llllllllllllIlIllllIIIlllIllIlll).getBlock(), Blocks.dirt) && lIlIIIIIIIIIIIIl(llllllllllllIlIllllIIIlllIlIllIl.getLightFor(EnumSkyBlock.SKY, llllllllllllIlIllllIIIlllIlIlIll.add(llllllllllllIlIllllIIIlllIlllIlI, llllllllllllIlIllllIIIlllIlllIII, llllllllllllIlIllllIIIlllIlllIIl)))) {
                            final BiomeGenBase llllllllllllIlIllllIIIlllIllIllI = llllllllllllIlIllllIIIlllIlIllIl.getBiomeGenForCoords(llllllllllllIlIllllIIIlllIllIlll);
                            if (lIlIIIIIIIIIIlII(llllllllllllIlIllllIIIlllIllIllI.topBlock.getBlock(), Blocks.mycelium)) {
                                llllllllllllIlIllllIIIlllIlIllIl.setBlockState(llllllllllllIlIllllIIIlllIllIlll, Blocks.mycelium.getDefaultState(), WorldGenLakes.lllIIlIlllllll[10]);
                                "".length();
                                "".length();
                                if ("   ".length() != "   ".length()) {
                                    return ((0x8C ^ 0x93 ^ (0x7E ^ 0x53)) & (0xF4 ^ 0xA0 ^ (0xC8 ^ 0xAE) ^ -" ".length())) != 0x0;
                                }
                            }
                            else {
                                llllllllllllIlIllllIIIlllIlIllIl.setBlockState(llllllllllllIlIllllIIIlllIllIlll, Blocks.grass.getDefaultState(), WorldGenLakes.lllIIlIlllllll[10]);
                                "".length();
                            }
                        }
                    }
                    ++llllllllllllIlIllllIIIlllIlllIII;
                }
                ++llllllllllllIlIllllIIIlllIlllIIl;
            }
            ++llllllllllllIlIllllIIIlllIlllIlI;
        }
        if (lIlIIIIIIIIIIlII(this.block.getMaterial(), Material.lava)) {
            int llllllllllllIlIllllIIIlllIllIlIl = WorldGenLakes.lllIIlIlllllll[1];
            "".length();
            if (null != null) {
                return ((0x42 ^ 0xF) & ~(0x27 ^ 0x6A)) != 0x0;
            }
            while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIllIlIl, WorldGenLakes.lllIIlIlllllll[6])) {
                int llllllllllllIlIllllIIIlllIllIlII = WorldGenLakes.lllIIlIlllllll[1];
                "".length();
                if ("   ".length() == 0) {
                    return ((0x87 ^ 0x9B) & ~(0xB9 ^ 0xA5)) != 0x0;
                }
                while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIllIlII, WorldGenLakes.lllIIlIlllllll[6])) {
                    int llllllllllllIlIllllIIIlllIllIIll = WorldGenLakes.lllIIlIlllllll[1];
                    "".length();
                    if (-(0x96 ^ 0x92) > 0) {
                        return ((0x13 ^ 0x6) & ~(0xAF ^ 0xBA)) != 0x0;
                    }
                    while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIllIIll, WorldGenLakes.lllIIlIlllllll[7])) {
                        int n2;
                        if (lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIlllIllIlIl * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIlllIllIlII) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIlllIllIIll] ? 1 : 0) && ((lIlIIIIIIIIIIIII(llllllllllllIlIllllIIIlllIllIlIl, WorldGenLakes.lllIIlIlllllll[9]) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[((llllllllllllIlIllllIIIlllIllIlIl + WorldGenLakes.lllIIlIlllllll[5]) * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIlllIllIlII) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIlllIllIIll] ? 1 : 0)) || (lIlIIIIIIIIIIIIl(llllllllllllIlIllllIIIlllIllIlIl) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[((llllllllllllIlIllllIIIlllIllIlIl - WorldGenLakes.lllIIlIlllllll[5]) * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIlllIllIlII) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIlllIllIIll] ? 1 : 0)) || (lIlIIIIIIIIIIIII(llllllllllllIlIllllIIIlllIllIlII, WorldGenLakes.lllIIlIlllllll[9]) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIlllIllIlIl * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIlllIllIlII + WorldGenLakes.lllIIlIlllllll[5]) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIlllIllIIll] ? 1 : 0)) || (lIlIIIIIIIIIIIIl(llllllllllllIlIllllIIIlllIllIlII) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIlllIllIlIl * WorldGenLakes.lllIIlIlllllll[6] + (llllllllllllIlIllllIIIlllIllIlII - WorldGenLakes.lllIIlIlllllll[5])) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIlllIllIIll] ? 1 : 0)) || (lIlIIIIIIIIIIIII(llllllllllllIlIllllIIIlllIllIIll, WorldGenLakes.lllIIlIlllllll[8]) && !lIIlllllllllllII(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIlllIllIlIl * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIlllIllIlII) * WorldGenLakes.lllIIlIlllllll[7] + llllllllllllIlIllllIIIlllIllIIll + WorldGenLakes.lllIIlIlllllll[5]] ? 1 : 0)) || (lIlIIIIIIIIIIIIl(llllllllllllIlIllllIIIlllIllIIll) && lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIllllIlIIlI[(llllllllllllIlIllllIIIlllIllIlIl * WorldGenLakes.lllIIlIlllllll[6] + llllllllllllIlIllllIIIlllIllIlII) * WorldGenLakes.lllIIlIlllllll[7] + (llllllllllllIlIllllIIIlllIllIIll - WorldGenLakes.lllIIlIlllllll[5])] ? 1 : 0)))) {
                            n2 = WorldGenLakes.lllIIlIlllllll[5];
                            "".length();
                            if ("   ".length() < 0) {
                                return ((0x16 ^ 0x2 ^ (0x6D ^ 0x5B)) & (114 + 6 - 104 + 152 ^ 107 + 21 - 34 + 44 ^ -" ".length())) != 0x0;
                            }
                        }
                        else {
                            n2 = WorldGenLakes.lllIIlIlllllll[1];
                        }
                        final boolean llllllllllllIlIllllIIIlllIllIIlI = n2 != 0;
                        if (lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIlllIllIIlI ? 1 : 0) && (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIllIIll, WorldGenLakes.lllIIlIlllllll[3]) || lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIllllIlIlII.nextInt(WorldGenLakes.lllIIlIlllllll[10]))) && lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIlllIlIllIl.getBlockState(llllllllllllIlIllllIIIlllIlIlIll.add(llllllllllllIlIllllIIIlllIllIlIl, llllllllllllIlIllllIIIlllIllIIll, llllllllllllIlIllllIIIlllIllIlII)).getBlock().getMaterial().isSolid() ? 1 : 0)) {
                            llllllllllllIlIllllIIIlllIlIllIl.setBlockState(llllllllllllIlIllllIIIlllIlIlIll.add(llllllllllllIlIllllIIIlllIllIlIl, llllllllllllIlIllllIIIlllIllIIll, llllllllllllIlIllllIIIlllIllIlII), Blocks.stone.getDefaultState(), WorldGenLakes.lllIIlIlllllll[10]);
                            "".length();
                        }
                        ++llllllllllllIlIllllIIIlllIllIIll;
                    }
                    ++llllllllllllIlIllllIIIlllIllIlII;
                }
                ++llllllllllllIlIllllIIIlllIllIlIl;
            }
        }
        if (lIlIIIIIIIIIIlII(this.block.getMaterial(), Material.water)) {
            int llllllllllllIlIllllIIIlllIllIIIl = WorldGenLakes.lllIIlIlllllll[1];
            "".length();
            if (-(0x61 ^ 0x65) >= 0) {
                return ((0x37 ^ 0x3B) & ~(0x67 ^ 0x6B)) != 0x0;
            }
            while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIllIIIl, WorldGenLakes.lllIIlIlllllll[6])) {
                int llllllllllllIlIllllIIIlllIllIIII = WorldGenLakes.lllIIlIlllllll[1];
                "".length();
                if ("   ".length() == 0) {
                    return ((0xAE ^ 0xBF ^ (0x67 ^ 0x6B)) & (47 + 100 - 84 + 84 ^ 12 + 86 + 4 + 40 ^ -" ".length())) != 0x0;
                }
                while (!lIIlllllllllllll(llllllllllllIlIllllIIIlllIllIIII, WorldGenLakes.lllIIlIlllllll[6])) {
                    final int llllllllllllIlIllllIIIlllIlIllll = WorldGenLakes.lllIIlIlllllll[3];
                    if (lIlIIIIIIIIIIIlI(llllllllllllIlIllllIIIlllIlIllIl.canBlockFreezeWater(llllllllllllIlIllllIIIlllIlIlIll.add(llllllllllllIlIllllIIIlllIllIIIl, llllllllllllIlIllllIIIlllIlIllll, llllllllllllIlIllllIIIlllIllIIII)) ? 1 : 0)) {
                        llllllllllllIlIllllIIIlllIlIllIl.setBlockState(llllllllllllIlIllllIIIlllIlIlIll.add(llllllllllllIlIllllIIIlllIllIIIl, llllllllllllIlIllllIIIlllIlIllll, llllllllllllIlIllllIIIlllIllIIII), Blocks.ice.getDefaultState(), WorldGenLakes.lllIIlIlllllll[10]);
                        "".length();
                    }
                    ++llllllllllllIlIllllIIIlllIllIIII;
                }
                ++llllllllllllIlIllllIIIlllIllIIIl;
            }
        }
        return WorldGenLakes.lllIIlIlllllll[5] != 0;
    }
    
    private static boolean lIIllllllllllllI(final int llllllllllllIlIllllIIIllIllllIll) {
        return llllllllllllIlIllllIIIllIllllIll < 0;
    }
    
    private static boolean lIlIIIIIIIIIIlII(final Object llllllllllllIlIllllIIIlllIIIIIlI, final Object llllllllllllIlIllllIIIlllIIIIIIl) {
        return llllllllllllIlIllllIIIlllIIIIIlI == llllllllllllIlIllllIIIlllIIIIIIl;
    }
    
    private static boolean lIlIIIIIIIIIIIIl(final int llllllllllllIlIllllIIIllIllllIIl) {
        return llllllllllllIlIllllIIIllIllllIIl > 0;
    }
    
    static {
        lIIllllllllllIIl();
    }
    
    public WorldGenLakes(final Block llllllllllllIlIllllIIlIIIIlIIIII) {
        this.block = llllllllllllIlIllllIIlIIIIlIIIII;
    }
    
    private static boolean lIIllllllllllIll(final int llllllllllllIlIllllIIIlllIIIlIlI, final int llllllllllllIlIllllIIIlllIIIlIIl) {
        return llllllllllllIlIllllIIIlllIIIlIlI > llllllllllllIlIllllIIIlllIIIlIIl;
    }
    
    private static boolean lIlIIIIIIIIIIIII(final int llllllllllllIlIllllIIIlllIIlIIlI, final int llllllllllllIlIllllIIIlllIIlIIIl) {
        return llllllllllllIlIllllIIIlllIIlIIlI < llllllllllllIlIllllIIIlllIIlIIIl;
    }
    
    private static boolean lIIlllllllllllll(final int llllllllllllIlIllllIIIlllIIlIllI, final int llllllllllllIlIllllIIIlllIIlIlIl) {
        return llllllllllllIlIllllIIIlllIIlIllI >= llllllllllllIlIllllIIIlllIIlIlIl;
    }
    
    private static boolean lIIlllllllllllII(final int llllllllllllIlIllllIIIllIlllllIl) {
        return llllllllllllIlIllllIIIllIlllllIl == 0;
    }
    
    private static void lIIllllllllllIIl() {
        (lllIIlIlllllll = new int[11])[0] = -(0x9 ^ 0x39 ^ (0x87 ^ 0xBF));
        WorldGenLakes.lllIIlIlllllll[1] = ((0xA0 ^ 0x9A) & ~(0xB7 ^ 0x8D));
        WorldGenLakes.lllIIlIlllllll[2] = (" ".length() ^ (0x21 ^ 0x25));
        WorldGenLakes.lllIIlIlllllll[3] = (0xAF ^ 0xAB);
        WorldGenLakes.lllIIlIlllllll[4] = (0xFFFF9E8D & 0x6972);
        WorldGenLakes.lllIIlIlllllll[5] = " ".length();
        WorldGenLakes.lllIIlIlllllll[6] = (0x5E ^ 0x4E);
        WorldGenLakes.lllIIlIlllllll[7] = (0x5B ^ 0x53);
        WorldGenLakes.lllIIlIlllllll[8] = (0xBD ^ 0x91 ^ (0xAF ^ 0x84));
        WorldGenLakes.lllIIlIlllllll[9] = (0x2D ^ 0x1D ^ (0x61 ^ 0x5E));
        WorldGenLakes.lllIIlIlllllll[10] = "  ".length();
    }
}
