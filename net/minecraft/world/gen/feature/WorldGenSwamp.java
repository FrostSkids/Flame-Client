// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;

public class WorldGenSwamp extends WorldGenAbstractTree
{
    private static final /* synthetic */ IBlockState field_181648_a;
    private static final /* synthetic */ IBlockState field_181649_b;
    private static final /* synthetic */ int[] lllIlllllllIll;
    
    private static boolean lIlIIllIIllIlIII(final int llllllllllllIlIlIllllIIIlllIIlIl) {
        return llllllllllllIlIlIllllIIIlllIIlIl <= 0;
    }
    
    private static boolean lIlIIllIIllIIlll(final int llllllllllllIlIlIllllIIIlllIlIll) {
        return llllllllllllIlIlIllllIIIlllIlIll != 0;
    }
    
    public WorldGenSwamp() {
        super((boolean)(WorldGenSwamp.lllIlllllllIll[0] != 0));
    }
    
    private static boolean lIlIIllIIllIIllI(final Object llllllllllllIlIlIllllIIIlllIlllI, final Object llllllllllllIlIlIllllIIIlllIllIl) {
        return llllllllllllIlIlIllllIIIlllIlllI == llllllllllllIlIlIllllIIIlllIllIl;
    }
    
    private static boolean lIlIIllIIllIIlIl(final int llllllllllllIlIlIllllIIIlllIlIIl) {
        return llllllllllllIlIlIllllIIIlllIlIIl == 0;
    }
    
    @Override
    public boolean generate(final World llllllllllllIlIlIllllIIlIIlIlIlI, final Random llllllllllllIlIlIllllIIlIIlIlIIl, BlockPos llllllllllllIlIlIllllIIlIIlIlIII) {
        final int llllllllllllIlIlIllllIIlIlIIlIII = llllllllllllIlIlIllllIIlIIlIlIIl.nextInt(WorldGenSwamp.lllIlllllllIll[1]) + WorldGenSwamp.lllIlllllllIll[2];
        "".length();
        if (null != null) {
            return ((0x1A ^ 0x8 ^ (0x7B ^ 0x61)) & (18 + 155 - 50 + 47 ^ 90 + 114 - 57 + 15 ^ -" ".length())) != 0x0;
        }
        while (!lIlIIllIIlIllllI(llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIIlIlIII.down()).getBlock().getMaterial(), Material.water)) {
            llllllllllllIlIlIllllIIlIIlIlIII = llllllllllllIlIlIllllIIlIIlIlIII.down();
        }
        boolean llllllllllllIlIlIllllIIlIlIIIlll = WorldGenSwamp.lllIlllllllIll[3] != 0;
        if (!lIlIIllIIlIlllll(llllllllllllIlIlIllllIIlIIlIlIII.getY(), WorldGenSwamp.lllIlllllllIll[3]) || !lIlIIllIIllIIIII(llllllllllllIlIlIllllIIlIIlIlIII.getY() + llllllllllllIlIlIllllIIlIlIIlIII + WorldGenSwamp.lllIlllllllIll[3], WorldGenSwamp.lllIlllllllIll[4])) {
            return WorldGenSwamp.lllIlllllllIll[0] != 0;
        }
        int llllllllllllIlIlIllllIIlIlIIIllI = llllllllllllIlIlIllllIIlIIlIlIII.getY();
        "".length();
        if (" ".length() == ((0xED ^ 0xBD ^ (0x52 ^ 0x9)) & (0x5C ^ 0x1A ^ (0xDC ^ 0x91) ^ -" ".length()))) {
            return ((0x54 ^ 0x9 ^ (0x47 ^ 0x2)) & (67 + 43 + 71 + 4 ^ 117 + 149 - 168 + 63 ^ -" ".length())) != 0x0;
        }
        while (!lIlIIllIIllIIlII(llllllllllllIlIlIllllIIlIlIIIllI, llllllllllllIlIlIllllIIlIIlIlIII.getY() + WorldGenSwamp.lllIlllllllIll[3] + llllllllllllIlIlIllllIIlIlIIlIII)) {
            int llllllllllllIlIlIllllIIlIlIIIlIl = WorldGenSwamp.lllIlllllllIll[3];
            if (lIlIIllIIllIIIIl(llllllllllllIlIlIllllIIlIlIIIllI, llllllllllllIlIlIllllIIlIIlIlIII.getY())) {
                llllllllllllIlIlIllllIIlIlIIIlIl = WorldGenSwamp.lllIlllllllIll[0];
            }
            if (lIlIIllIIlIlllll(llllllllllllIlIlIllllIIlIlIIIllI, llllllllllllIlIlIllllIIlIIlIlIII.getY() + WorldGenSwamp.lllIlllllllIll[3] + llllllllllllIlIlIllllIIlIlIIlIII - WorldGenSwamp.lllIlllllllIll[5])) {
                llllllllllllIlIlIllllIIlIlIIIlIl = WorldGenSwamp.lllIlllllllIll[6];
            }
            final BlockPos.MutableBlockPos llllllllllllIlIlIllllIIlIlIIIlII = new BlockPos.MutableBlockPos();
            int llllllllllllIlIlIllllIIlIlIIIIll = llllllllllllIlIlIllllIIlIIlIlIII.getX() - llllllllllllIlIlIllllIIlIlIIIlIl;
            "".length();
            if ((6 + 77 - 35 + 125 ^ 54 + 104 - 53 + 63) <= 0) {
                return ((170 + 210 - 373 + 204 ^ 27 + 136 - 85 + 117) & (68 + 74 - 94 + 128 ^ 42 + 44 + 17 + 57 ^ -" ".length())) != 0x0;
            }
            while (lIlIIllIIllIIIII(llllllllllllIlIlIllllIIlIlIIIIll, llllllllllllIlIlIllllIIlIIlIlIII.getX() + llllllllllllIlIlIllllIIlIlIIIlIl) && !lIlIIllIIllIIlIl(llllllllllllIlIlIllllIIlIlIIIlll ? 1 : 0)) {
                int llllllllllllIlIlIllllIIlIlIIIIlI = llllllllllllIlIlIllllIIlIIlIlIII.getZ() - llllllllllllIlIlIllllIIlIlIIIlIl;
                "".length();
                if (" ".length() < 0) {
                    return ((0x82 ^ 0xB0) & ~(0x6C ^ 0x5E)) != 0x0;
                }
                while (lIlIIllIIllIIIII(llllllllllllIlIlIllllIIlIlIIIIlI, llllllllllllIlIlIllllIIlIIlIlIII.getZ() + llllllllllllIlIlIllllIIlIlIIIlIl) && !lIlIIllIIllIIlIl(llllllllllllIlIlIllllIIlIlIIIlll ? 1 : 0)) {
                    if (lIlIIllIIllIIIlI(llllllllllllIlIlIllllIIlIlIIIllI) && lIlIIllIIllIIIll(llllllllllllIlIlIllllIIlIlIIIllI, WorldGenSwamp.lllIlllllllIll[4])) {
                        final Block llllllllllllIlIlIllllIIlIlIIIIIl = llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIlIIIlII.func_181079_c(llllllllllllIlIlIllllIIlIlIIIIll, llllllllllllIlIlIllllIIlIlIIIllI, llllllllllllIlIlIllllIIlIlIIIIlI)).getBlock();
                        if (lIlIIllIIlIllllI(llllllllllllIlIlIllllIIlIlIIIIIl.getMaterial(), Material.air) && lIlIIllIIlIllllI(llllllllllllIlIlIllllIIlIlIIIIIl.getMaterial(), Material.leaves)) {
                            if (lIlIIllIIlIllllI(llllllllllllIlIlIllllIIlIlIIIIIl, Blocks.water) && lIlIIllIIlIllllI(llllllllllllIlIlIllllIIlIlIIIIIl, Blocks.flowing_water)) {
                                llllllllllllIlIlIllllIIlIlIIIlll = (WorldGenSwamp.lllIlllllllIll[0] != 0);
                                "".length();
                                if (((0xCE ^ 0xAD) & ~(0xD3 ^ 0xB0)) != 0x0) {
                                    return (" ".length() & ~" ".length()) != 0x0;
                                }
                            }
                            else if (lIlIIllIIllIIlII(llllllllllllIlIlIllllIIlIlIIIllI, llllllllllllIlIlIllllIIlIIlIlIII.getY())) {
                                llllllllllllIlIlIllllIIlIlIIIlll = (WorldGenSwamp.lllIlllllllIll[0] != 0);
                                "".length();
                                if (-("   ".length() ^ (0xAD ^ 0xAA)) > 0) {
                                    return ((0x84 ^ 0x9F ^ (0x2F ^ 0x1F)) & (0xB7 ^ 0x99 ^ (0x2 ^ 0x7) ^ -" ".length())) != 0x0;
                                }
                            }
                        }
                    }
                    else {
                        llllllllllllIlIlIllllIIlIlIIIlll = (WorldGenSwamp.lllIlllllllIll[0] != 0);
                    }
                    ++llllllllllllIlIlIllllIIlIlIIIIlI;
                }
                ++llllllllllllIlIlIllllIIlIlIIIIll;
            }
            ++llllllllllllIlIlIllllIIlIlIIIllI;
        }
        if (lIlIIllIIllIIlIl(llllllllllllIlIlIllllIIlIlIIIlll ? 1 : 0)) {
            return WorldGenSwamp.lllIlllllllIll[0] != 0;
        }
        final Block llllllllllllIlIlIllllIIlIlIIIIII = llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIIlIlIII.down()).getBlock();
        if ((lIlIIllIIlIllllI(llllllllllllIlIlIllllIIlIlIIIIII, Blocks.grass) && !lIlIIllIIllIIllI(llllllllllllIlIlIllllIIlIlIIIIII, Blocks.dirt)) || !lIlIIllIIllIIIll(llllllllllllIlIlIllllIIlIIlIlIII.getY(), WorldGenSwamp.lllIlllllllIll[4] - llllllllllllIlIlIllllIIlIlIIlIII - WorldGenSwamp.lllIlllllllIll[3])) {
            return WorldGenSwamp.lllIlllllllIll[0] != 0;
        }
        this.func_175921_a(llllllllllllIlIlIllllIIlIIlIlIlI, llllllllllllIlIlIllllIIlIIlIlIII.down());
        int llllllllllllIlIlIllllIIlIIllllll = llllllllllllIlIlIllllIIlIIlIlIII.getY() - WorldGenSwamp.lllIlllllllIll[6] + llllllllllllIlIlIllllIIlIlIIlIII;
        "".length();
        if (null != null) {
            return ((0x58 ^ 0xD) & ~(0x5C ^ 0x9)) != 0x0;
        }
        while (!lIlIIllIIllIIlII(llllllllllllIlIlIllllIIlIIllllll, llllllllllllIlIlIllllIIlIIlIlIII.getY() + llllllllllllIlIlIllllIIlIlIIlIII)) {
            final int llllllllllllIlIlIllllIIlIIlllllI = llllllllllllIlIlIllllIIlIIllllll - (llllllllllllIlIlIllllIIlIIlIlIII.getY() + llllllllllllIlIlIllllIIlIlIIlIII);
            final int llllllllllllIlIlIllllIIlIIllllIl = WorldGenSwamp.lllIlllllllIll[5] - llllllllllllIlIlIllllIIlIIlllllI / WorldGenSwamp.lllIlllllllIll[5];
            int llllllllllllIlIlIllllIIlIIllllII = llllllllllllIlIlIllllIIlIIlIlIII.getX() - llllllllllllIlIlIllllIIlIIllllIl;
            "".length();
            if ((0x6B ^ 0x57 ^ (0xB7 ^ 0x8F)) <= " ".length()) {
                return ((28 + 101 + 30 + 20 ^ 98 + 27 + 27 + 15) & (8 + 72 - 71 + 142 ^ 90 + 30 + 2 + 9 ^ -" ".length())) != 0x0;
            }
            while (!lIlIIllIIllIIlII(llllllllllllIlIlIllllIIlIIllllII, llllllllllllIlIlIllllIIlIIlIlIII.getX() + llllllllllllIlIlIllllIIlIIllllIl)) {
                final int llllllllllllIlIlIllllIIlIIlllIll = llllllllllllIlIlIllllIIlIIllllII - llllllllllllIlIlIllllIIlIIlIlIII.getX();
                int llllllllllllIlIlIllllIIlIIlllIlI = llllllllllllIlIlIllllIIlIIlIlIII.getZ() - llllllllllllIlIlIllllIIlIIllllIl;
                "".length();
                if (-" ".length() >= 0) {
                    return ((0x3B ^ 0x6E ^ 63 + 70 - 32 + 26) & (0x4B ^ 0x67 ^ (0x1F ^ 0x19) ^ -" ".length())) != 0x0;
                }
                while (!lIlIIllIIllIIlII(llllllllllllIlIlIllllIIlIIlllIlI, llllllllllllIlIlIllllIIlIIlIlIII.getZ() + llllllllllllIlIlIllllIIlIIllllIl)) {
                    final int llllllllllllIlIlIllllIIlIIlllIIl = llllllllllllIlIlIllllIIlIIlllIlI - llllllllllllIlIlIllllIIlIIlIlIII.getZ();
                    if (!lIlIIllIIllIIIIl(Math.abs(llllllllllllIlIlIllllIIlIIlllIll), llllllllllllIlIlIllllIIlIIllllIl) || !lIlIIllIIllIIIIl(Math.abs(llllllllllllIlIlIllllIIlIIlllIIl), llllllllllllIlIlIllllIIlIIllllIl) || (lIlIIllIIllIIlll(llllllllllllIlIlIllllIIlIIlIlIIl.nextInt(WorldGenSwamp.lllIlllllllIll[5])) && lIlIIllIIllIIlll(llllllllllllIlIlIllllIIlIIlllllI))) {
                        final BlockPos llllllllllllIlIlIllllIIlIIlllIII = new BlockPos(llllllllllllIlIlIllllIIlIIllllII, llllllllllllIlIlIllllIIlIIllllll, llllllllllllIlIlIllllIIlIIlllIlI);
                        if (lIlIIllIIllIIlIl(llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIIlllIII).getBlock().isFullBlock() ? 1 : 0)) {
                            this.setBlockAndNotifyAdequately(llllllllllllIlIlIllllIIlIIlIlIlI, llllllllllllIlIlIllllIIlIIlllIII, WorldGenSwamp.field_181649_b);
                        }
                    }
                    ++llllllllllllIlIlIllllIIlIIlllIlI;
                }
                ++llllllllllllIlIlIllllIIlIIllllII;
            }
            ++llllllllllllIlIlIllllIIlIIllllll;
        }
        int llllllllllllIlIlIllllIIlIIllIlll = WorldGenSwamp.lllIlllllllIll[0];
        "".length();
        if ("   ".length() < -" ".length()) {
            return ((0x7F ^ 0x30 ^ (0x89 ^ 0x93)) & (0x1 ^ 0x5D ^ (0x15 ^ 0x1C) ^ -" ".length())) != 0x0;
        }
        while (!lIlIIllIIlIlllll(llllllllllllIlIlIllllIIlIIllIlll, llllllllllllIlIlIllllIIlIlIIlIII)) {
            final Block llllllllllllIlIlIllllIIlIIllIllI = llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIIlIlIII.up(llllllllllllIlIlIllllIIlIIllIlll)).getBlock();
            if (!lIlIIllIIlIllllI(llllllllllllIlIlIllllIIlIIllIllI.getMaterial(), Material.air) || !lIlIIllIIlIllllI(llllllllllllIlIlIllllIIlIIllIllI.getMaterial(), Material.leaves) || !lIlIIllIIlIllllI(llllllllllllIlIlIllllIIlIIllIllI, Blocks.flowing_water) || lIlIIllIIllIIllI(llllllllllllIlIlIllllIIlIIllIllI, Blocks.water)) {
                this.setBlockAndNotifyAdequately(llllllllllllIlIlIllllIIlIIlIlIlI, llllllllllllIlIlIllllIIlIIlIlIII.up(llllllllllllIlIlIllllIIlIIllIlll), WorldGenSwamp.field_181648_a);
            }
            ++llllllllllllIlIlIllllIIlIIllIlll;
        }
        int llllllllllllIlIlIllllIIlIIllIlIl = llllllllllllIlIlIllllIIlIIlIlIII.getY() - WorldGenSwamp.lllIlllllllIll[6] + llllllllllllIlIlIllllIIlIlIIlIII;
        "".length();
        if ("   ".length() >= (0xC4 ^ 0xB8 ^ (0x5A ^ 0x22))) {
            return ((19 + 177 - 191 + 179 ^ 137 + 138 - 149 + 16) & (0x89 ^ 0x9C ^ (0xE7 ^ 0xC4) ^ -" ".length())) != 0x0;
        }
        while (!lIlIIllIIllIIlII(llllllllllllIlIlIllllIIlIIllIlIl, llllllllllllIlIlIllllIIlIIlIlIII.getY() + llllllllllllIlIlIllllIIlIlIIlIII)) {
            final int llllllllllllIlIlIllllIIlIIllIlII = llllllllllllIlIlIllllIIlIIllIlIl - (llllllllllllIlIlIllllIIlIIlIlIII.getY() + llllllllllllIlIlIllllIIlIlIIlIII);
            final int llllllllllllIlIlIllllIIlIIllIIll = WorldGenSwamp.lllIlllllllIll[5] - llllllllllllIlIlIllllIIlIIllIlII / WorldGenSwamp.lllIlllllllIll[5];
            final BlockPos.MutableBlockPos llllllllllllIlIlIllllIIlIIllIIlI = new BlockPos.MutableBlockPos();
            int llllllllllllIlIlIllllIIlIIllIIIl = llllllllllllIlIlIllllIIlIIlIlIII.getX() - llllllllllllIlIlIllllIIlIIllIIll;
            "".length();
            if (((0x8D ^ 0x9F ^ (0x6D ^ 0x50)) & (" ".length() ^ (0x72 ^ 0x5C) ^ -" ".length())) == "  ".length()) {
                return ((0xE6 ^ 0xAF ^ (0x92 ^ 0x99)) & (0x20 ^ 0xF ^ (0xC2 ^ 0xAF) ^ -" ".length())) != 0x0;
            }
            while (!lIlIIllIIllIIlII(llllllllllllIlIlIllllIIlIIllIIIl, llllllllllllIlIlIllllIIlIIlIlIII.getX() + llllllllllllIlIlIllllIIlIIllIIll)) {
                int llllllllllllIlIlIllllIIlIIllIIII = llllllllllllIlIlIllllIIlIIlIlIII.getZ() - llllllllllllIlIlIllllIIlIIllIIll;
                "".length();
                if (-"  ".length() >= 0) {
                    return ((0xF7 ^ 0x9C ^ (0xC4 ^ 0xA9)) & (0x56 ^ 0x7C ^ (0x1D ^ 0x31) ^ -" ".length())) != 0x0;
                }
                while (!lIlIIllIIllIIlII(llllllllllllIlIlIllllIIlIIllIIII, llllllllllllIlIlIllllIIlIIlIlIII.getZ() + llllllllllllIlIlIllllIIlIIllIIll)) {
                    llllllllllllIlIlIllllIIlIIllIIlI.func_181079_c(llllllllllllIlIlIllllIIlIIllIIIl, llllllllllllIlIlIllllIIlIIllIlIl, llllllllllllIlIlIllllIIlIIllIIII);
                    "".length();
                    if (lIlIIllIIllIIllI(llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIIllIIlI).getBlock().getMaterial(), Material.leaves)) {
                        final BlockPos llllllllllllIlIlIllllIIlIIlIllll = llllllllllllIlIlIllllIIlIIllIIlI.west();
                        final BlockPos llllllllllllIlIlIllllIIlIIlIlllI = llllllllllllIlIlIllllIIlIIllIIlI.east();
                        final BlockPos llllllllllllIlIlIllllIIlIIlIllIl = llllllllllllIlIlIllllIIlIIllIIlI.north();
                        final BlockPos llllllllllllIlIlIllllIIlIIlIllII = llllllllllllIlIlIllllIIlIIllIIlI.south();
                        if (lIlIIllIIllIIlIl(llllllllllllIlIlIllllIIlIIlIlIIl.nextInt(WorldGenSwamp.lllIlllllllIll[1])) && lIlIIllIIllIIllI(llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIIlIllll).getBlock().getMaterial(), Material.air)) {
                            this.func_181647_a(llllllllllllIlIlIllllIIlIIlIlIlI, llllllllllllIlIlIllllIIlIIlIllll, BlockVine.EAST);
                        }
                        if (lIlIIllIIllIIlIl(llllllllllllIlIlIllllIIlIIlIlIIl.nextInt(WorldGenSwamp.lllIlllllllIll[1])) && lIlIIllIIllIIllI(llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIIlIlllI).getBlock().getMaterial(), Material.air)) {
                            this.func_181647_a(llllllllllllIlIlIllllIIlIIlIlIlI, llllllllllllIlIlIllllIIlIIlIlllI, BlockVine.WEST);
                        }
                        if (lIlIIllIIllIIlIl(llllllllllllIlIlIllllIIlIIlIlIIl.nextInt(WorldGenSwamp.lllIlllllllIll[1])) && lIlIIllIIllIIllI(llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIIlIllIl).getBlock().getMaterial(), Material.air)) {
                            this.func_181647_a(llllllllllllIlIlIllllIIlIIlIlIlI, llllllllllllIlIlIllllIIlIIlIllIl, BlockVine.SOUTH);
                        }
                        if (lIlIIllIIllIIlIl(llllllllllllIlIlIllllIIlIIlIlIIl.nextInt(WorldGenSwamp.lllIlllllllIll[1])) && lIlIIllIIllIIllI(llllllllllllIlIlIllllIIlIIlIlIlI.getBlockState(llllllllllllIlIlIllllIIlIIlIllII).getBlock().getMaterial(), Material.air)) {
                            this.func_181647_a(llllllllllllIlIlIllllIIlIIlIlIlI, llllllllllllIlIlIllllIIlIIlIllII, BlockVine.NORTH);
                        }
                    }
                    ++llllllllllllIlIlIllllIIlIIllIIII;
                }
                ++llllllllllllIlIlIllllIIlIIllIIIl;
            }
            ++llllllllllllIlIlIllllIIlIIllIlIl;
        }
        return WorldGenSwamp.lllIlllllllIll[3] != 0;
    }
    
    private static boolean lIlIIllIIllIIIlI(final int llllllllllllIlIlIllllIIIlllIIlll) {
        return llllllllllllIlIlIllllIIIlllIIlll >= 0;
    }
    
    private static boolean lIlIIllIIllIIIll(final int llllllllllllIlIlIllllIIIlllllllI, final int llllllllllllIlIlIllllIIIllllllIl) {
        return llllllllllllIlIlIllllIIIlllllllI < llllllllllllIlIlIllllIIIllllllIl;
    }
    
    private void func_181647_a(final World llllllllllllIlIlIllllIIlIIIlIIll, BlockPos llllllllllllIlIlIllllIIlIIIlIIlI, final PropertyBool llllllllllllIlIlIllllIIlIIIIlIll) {
        final IBlockState llllllllllllIlIlIllllIIlIIIlIIII = Blocks.vine.getDefaultState().withProperty((IProperty<Comparable>)llllllllllllIlIlIllllIIlIIIIlIll, (boolean)(WorldGenSwamp.lllIlllllllIll[3] != 0));
        this.setBlockAndNotifyAdequately(llllllllllllIlIlIllllIIlIIIlIIll, llllllllllllIlIlIllllIIlIIIlIIlI, llllllllllllIlIlIllllIIlIIIlIIII);
        int llllllllllllIlIlIllllIIlIIIIllll = WorldGenSwamp.lllIlllllllIll[1];
        llllllllllllIlIlIllllIIlIIIlIIlI = llllllllllllIlIlIllllIIlIIIlIIlI.down();
        "".length();
        if (" ".length() <= ((0x64 ^ 0x6E) & ~(0x9 ^ 0x3))) {
            return;
        }
        while (lIlIIllIIllIIllI(llllllllllllIlIlIllllIIlIIIlIIll.getBlockState(llllllllllllIlIlIllllIIlIIIlIIlI).getBlock().getMaterial(), Material.air) && !lIlIIllIIllIlIII(llllllllllllIlIlIllllIIlIIIIllll)) {
            this.setBlockAndNotifyAdequately(llllllllllllIlIlIllllIIlIIIlIIll, llllllllllllIlIlIllllIIlIIIlIIlI, llllllllllllIlIlIllllIIlIIIlIIII);
            llllllllllllIlIlIllllIIlIIIlIIlI = llllllllllllIlIlIllllIIlIIIlIIlI.down();
            --llllllllllllIlIlIllllIIlIIIIllll;
        }
    }
    
    private static boolean lIlIIllIIlIllllI(final Object llllllllllllIlIlIllllIIIllllIIlI, final Object llllllllllllIlIlIllllIIIllllIIIl) {
        return llllllllllllIlIlIllllIIIllllIIlI != llllllllllllIlIlIllllIIIllllIIIl;
    }
    
    private static boolean lIlIIllIIllIIIII(final int llllllllllllIlIlIllllIIIlllllIlI, final int llllllllllllIlIlIllllIIIlllllIIl) {
        return llllllllllllIlIlIllllIIIlllllIlI <= llllllllllllIlIlIllllIIIlllllIIl;
    }
    
    private static boolean lIlIIllIIllIIlII(final int llllllllllllIlIlIllllIIIllllIllI, final int llllllllllllIlIlIllllIIIllllIlIl) {
        return llllllllllllIlIlIllllIIIllllIllI > llllllllllllIlIlIllllIIIllllIlIl;
    }
    
    private static boolean lIlIIllIIllIIIIl(final int llllllllllllIlIlIllllIIlIIIIIllI, final int llllllllllllIlIlIllllIIlIIIIIlIl) {
        return llllllllllllIlIlIllllIIlIIIIIllI == llllllllllllIlIlIllllIIlIIIIIlIl;
    }
    
    private static void lIlIIllIIlIlllIl() {
        (lllIlllllllIll = new int[7])[0] = ((0x7D ^ 0x9 ^ (0x6A ^ 0x9)) & (0xA7 ^ 0x91 ^ (0xC ^ 0x2D) ^ -" ".length()));
        WorldGenSwamp.lllIlllllllIll[1] = (0x12 ^ 0x5C ^ (0xDB ^ 0x91));
        WorldGenSwamp.lllIlllllllIll[2] = (0x2C ^ 0x31 ^ (0x51 ^ 0x49));
        WorldGenSwamp.lllIlllllllIll[3] = " ".length();
        WorldGenSwamp.lllIlllllllIll[4] = (-(0xFFFFFDFF & 0x4AA7) & (0xFFFFFBAE & 0x4DF7));
        WorldGenSwamp.lllIlllllllIll[5] = "  ".length();
        WorldGenSwamp.lllIlllllllIll[6] = "   ".length();
    }
    
    private static boolean lIlIIllIIlIlllll(final int llllllllllllIlIlIllllIIlIIIIIIlI, final int llllllllllllIlIlIllllIIlIIIIIIIl) {
        return llllllllllllIlIlIllllIIlIIIIIIlI >= llllllllllllIlIlIllllIIlIIIIIIIl;
    }
    
    static {
        lIlIIllIIlIlllIl();
        field_181648_a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        field_181649_b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty((IProperty<Comparable>)BlockOldLeaf.CHECK_DECAY, (boolean)(WorldGenSwamp.lllIlllllllIll[0] != 0));
    }
}
