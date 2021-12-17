// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockNewLeaf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;

public class WorldGenSavannaTree extends WorldGenAbstractTree
{
    private static final /* synthetic */ int[] lIlllIlIlllllI;
    private static final /* synthetic */ IBlockState field_181643_a;
    private static final /* synthetic */ IBlockState field_181644_b;
    
    private void func_181642_b(final World llllllllllllIllllIllllIIIIIIllIl, final BlockPos llllllllllllIllllIllllIIIIIIlIIl) {
        this.setBlockAndNotifyAdequately(llllllllllllIllllIllllIIIIIIllIl, llllllllllllIllllIllllIIIIIIlIIl, WorldGenSavannaTree.field_181643_a);
    }
    
    private static boolean lIIIIIllIIIIllII(final int llllllllllllIllllIlllIllllllIllI, final int llllllllllllIllllIlllIllllllIlIl) {
        return llllllllllllIllllIlllIllllllIllI >= llllllllllllIllllIlllIllllllIlIl;
    }
    
    private static void lIIIIIllIIIIlIll() {
        (lIlllIlIlllllI = new int[10])[0] = ((38 + 126 - 17 + 32 ^ 112 + 119 - 193 + 117) & (0x3F ^ 0x77 ^ (0x4A ^ 0x2A) ^ -" ".length()));
        WorldGenSavannaTree.lIlllIlIlllllI[1] = "   ".length();
        WorldGenSavannaTree.lIlllIlIlllllI[2] = (0x42 ^ 0x47);
        WorldGenSavannaTree.lIlllIlIlllllI[3] = " ".length();
        WorldGenSavannaTree.lIlllIlIlllllI[4] = (-(0xFFFFFAEA & 0x153F) & (0xFFFFB1BB & 0x5F6D));
        WorldGenSavannaTree.lIlllIlIlllllI[5] = "  ".length();
        WorldGenSavannaTree.lIlllIlIlllllI[6] = (174 + 82 - 141 + 79 ^ 115 + 31 - 122 + 174);
        WorldGenSavannaTree.lIlllIlIlllllI[7] = -"   ".length();
        WorldGenSavannaTree.lIlllIlIlllllI[8] = -" ".length();
        WorldGenSavannaTree.lIlllIlIlllllI[9] = -"  ".length();
    }
    
    private void func_175924_b(final World llllllllllllIllllIllllIIIIIIIIll, final BlockPos llllllllllllIllllIllllIIIIIIIIlI) {
        final Material llllllllllllIllllIllllIIIIIIIIIl = llllllllllllIllllIllllIIIIIIIIll.getBlockState(llllllllllllIllllIllllIIIIIIIIlI).getBlock().getMaterial();
        if (!lIIIIIllIIIlIIll(llllllllllllIllllIllllIIIIIIIIIl, Material.air) || lIIIIIllIIIlIlII(llllllllllllIllllIllllIIIIIIIIIl, Material.leaves)) {
            this.setBlockAndNotifyAdequately(llllllllllllIllllIllllIIIIIIIIll, llllllllllllIllllIllllIIIIIIIIlI, WorldGenSavannaTree.field_181644_b);
        }
    }
    
    private static boolean lIIIIIllIIIllIII(final int llllllllllllIllllIlllIllllIllIll) {
        return llllllllllllIllllIlllIllllIllIll <= 0;
    }
    
    private static boolean lIIIIIllIIIlIIll(final Object llllllllllllIllllIlllIlllllIIllI, final Object llllllllllllIllllIlllIlllllIIlIl) {
        return llllllllllllIllllIlllIlllllIIllI != llllllllllllIllllIlllIlllllIIlIl;
    }
    
    private static boolean lIIIIIllIIIIllIl(final int llllllllllllIllllIlllIlllllIlllI, final int llllllllllllIllllIlllIlllllIllIl) {
        return llllllllllllIllllIlllIlllllIlllI <= llllllllllllIllllIlllIlllllIllIl;
    }
    
    private static boolean lIIIIIllIIIlIlIl(final int llllllllllllIllllIlllIllllIllIIl) {
        return llllllllllllIllllIlllIllllIllIIl > 0;
    }
    
    private static boolean lIIIIIllIIIIlllI(final int llllllllllllIllllIlllIlllllllIlI, final int llllllllllllIllllIlllIlllllllIIl) {
        return llllllllllllIllllIlllIlllllllIlI == llllllllllllIllllIlllIlllllllIIl;
    }
    
    private static boolean lIIIIIllIIIIllll(final int llllllllllllIllllIlllIllllIlllIl) {
        return llllllllllllIllllIlllIllllIlllIl >= 0;
    }
    
    private static boolean lIIIIIllIIIlIlII(final Object llllllllllllIllllIlllIlllllIIIlI, final Object llllllllllllIllllIlllIlllllIIIIl) {
        return llllllllllllIllllIlllIlllllIIIlI == llllllllllllIllllIlllIlllllIIIIl;
    }
    
    private static boolean lIIIIIllIIIlIllI(final int llllllllllllIllllIlllIllllIlIllI, final int llllllllllllIllllIlllIllllIlIlIl) {
        return llllllllllllIllllIlllIllllIlIllI != llllllllllllIllllIlllIllllIlIlIl;
    }
    
    private static boolean lIIIIIllIIIlIIlI(final int llllllllllllIllllIlllIlllllIlIlI, final int llllllllllllIllllIlllIlllllIlIIl) {
        return llllllllllllIllllIlllIlllllIlIlI > llllllllllllIllllIlllIlllllIlIIl;
    }
    
    private static boolean lIIIIIllIIIlIIII(final int llllllllllllIllllIlllIllllllIIlI, final int llllllllllllIllllIlllIllllllIIIl) {
        return llllllllllllIllllIlllIllllllIIlI < llllllllllllIllllIlllIllllllIIIl;
    }
    
    @Override
    public boolean generate(final World llllllllllllIllllIllllIIIlIIllII, final Random llllllllllllIllllIllllIIIlIIlIll, final BlockPos llllllllllllIllllIllllIIIlIIlIlI) {
        final int llllllllllllIllllIllllIIIlIIlIIl = llllllllllllIllllIllllIIIlIIlIll.nextInt(WorldGenSavannaTree.lIlllIlIlllllI[1]) + llllllllllllIllllIllllIIIlIIlIll.nextInt(WorldGenSavannaTree.lIlllIlIlllllI[1]) + WorldGenSavannaTree.lIlllIlIlllllI[2];
        boolean llllllllllllIllllIllllIIIlIIlIII = WorldGenSavannaTree.lIlllIlIlllllI[3] != 0;
        if (!lIIIIIllIIIIllII(llllllllllllIllllIllllIIIlIIlIlI.getY(), WorldGenSavannaTree.lIlllIlIlllllI[3]) || !lIIIIIllIIIIllIl(llllllllllllIllllIllllIIIlIIlIlI.getY() + llllllllllllIllllIllllIIIlIIlIIl + WorldGenSavannaTree.lIlllIlIlllllI[3], WorldGenSavannaTree.lIlllIlIlllllI[4])) {
            return WorldGenSavannaTree.lIlllIlIlllllI[0] != 0;
        }
        int llllllllllllIllllIllllIIIlIIIlll = llllllllllllIllllIllllIIIlIIlIlI.getY();
        "".length();
        if (-" ".length() != -" ".length()) {
            return ((0x72 ^ 0x5E) & ~(0x37 ^ 0x1B)) != 0x0;
        }
        while (!lIIIIIllIIIlIIlI(llllllllllllIllllIllllIIIlIIIlll, llllllllllllIllllIllllIIIlIIlIlI.getY() + WorldGenSavannaTree.lIlllIlIlllllI[3] + llllllllllllIllllIllllIIIlIIlIIl)) {
            int llllllllllllIllllIllllIIIlIIIllI = WorldGenSavannaTree.lIlllIlIlllllI[3];
            if (lIIIIIllIIIIlllI(llllllllllllIllllIllllIIIlIIIlll, llllllllllllIllllIllllIIIlIIlIlI.getY())) {
                llllllllllllIllllIllllIIIlIIIllI = WorldGenSavannaTree.lIlllIlIlllllI[0];
            }
            if (lIIIIIllIIIIllII(llllllllllllIllllIllllIIIlIIIlll, llllllllllllIllllIllllIIIlIIlIlI.getY() + WorldGenSavannaTree.lIlllIlIlllllI[3] + llllllllllllIllllIllllIIIlIIlIIl - WorldGenSavannaTree.lIlllIlIlllllI[5])) {
                llllllllllllIllllIllllIIIlIIIllI = WorldGenSavannaTree.lIlllIlIlllllI[5];
            }
            final BlockPos.MutableBlockPos llllllllllllIllllIllllIIIlIIIlIl = new BlockPos.MutableBlockPos();
            int llllllllllllIllllIllllIIIlIIIlII = llllllllllllIllllIllllIIIlIIlIlI.getX() - llllllllllllIllllIllllIIIlIIIllI;
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x1F ^ 0x73 ^ (0xE ^ 0x20)) & (0xDE ^ 0xB0 ^ (0x23 ^ 0xF) ^ -" ".length())) != 0x0;
            }
            while (lIIIIIllIIIIllIl(llllllllllllIllllIllllIIIlIIIlII, llllllllllllIllllIllllIIIlIIlIlI.getX() + llllllllllllIllllIllllIIIlIIIllI) && !lIIIIIllIIIlIIIl(llllllllllllIllllIllllIIIlIIlIII ? 1 : 0)) {
                int llllllllllllIllllIllllIIIlIIIIll = llllllllllllIllllIllllIIIlIIlIlI.getZ() - llllllllllllIllllIllllIIIlIIIllI;
                "".length();
                if ((0x96 ^ 0xB0 ^ (0x1B ^ 0x39)) <= -" ".length()) {
                    return ((0x9F ^ 0xAA ^ (0x4C ^ 0x6A)) & (108 + 96 - 163 + 99 ^ 72 + 111 - 116 + 92 ^ -" ".length())) != 0x0;
                }
                while (lIIIIIllIIIIllIl(llllllllllllIllllIllllIIIlIIIIll, llllllllllllIllllIllllIIIlIIlIlI.getZ() + llllllllllllIllllIllllIIIlIIIllI) && !lIIIIIllIIIlIIIl(llllllllllllIllllIllllIIIlIIlIII ? 1 : 0)) {
                    if (lIIIIIllIIIIllll(llllllllllllIllllIllllIIIlIIIlll) && lIIIIIllIIIlIIII(llllllllllllIllllIllllIIIlIIIlll, WorldGenSavannaTree.lIlllIlIlllllI[4])) {
                        if (lIIIIIllIIIlIIIl(this.func_150523_a(llllllllllllIllllIllllIIIlIIllII.getBlockState(llllllllllllIllllIllllIIIlIIIlIl.func_181079_c(llllllllllllIllllIllllIIIlIIIlII, llllllllllllIllllIllllIIIlIIIlll, llllllllllllIllllIllllIIIlIIIIll)).getBlock()) ? 1 : 0)) {
                            llllllllllllIllllIllllIIIlIIlIII = (WorldGenSavannaTree.lIlllIlIlllllI[0] != 0);
                            "".length();
                            if (null != null) {
                                return ((0x19 ^ 0x2) & ~(0x3 ^ 0x18)) != 0x0;
                            }
                        }
                    }
                    else {
                        llllllllllllIllllIllllIIIlIIlIII = (WorldGenSavannaTree.lIlllIlIlllllI[0] != 0);
                    }
                    ++llllllllllllIllllIllllIIIlIIIIll;
                }
                ++llllllllllllIllllIllllIIIlIIIlII;
            }
            ++llllllllllllIllllIllllIIIlIIIlll;
        }
        if (lIIIIIllIIIlIIIl(llllllllllllIllllIllllIIIlIIlIII ? 1 : 0)) {
            return WorldGenSavannaTree.lIlllIlIlllllI[0] != 0;
        }
        final Block llllllllllllIllllIllllIIIlIIIIlI = llllllllllllIllllIllllIIIlIIllII.getBlockState(llllllllllllIllllIllllIIIlIIlIlI.down()).getBlock();
        if ((lIIIIIllIIIlIIll(llllllllllllIllllIllllIIIlIIIIlI, Blocks.grass) && !lIIIIIllIIIlIlII(llllllllllllIllllIllllIIIlIIIIlI, Blocks.dirt)) || !lIIIIIllIIIlIIII(llllllllllllIllllIllllIIIlIIlIlI.getY(), WorldGenSavannaTree.lIlllIlIlllllI[4] - llllllllllllIllllIllllIIIlIIlIIl - WorldGenSavannaTree.lIlllIlIlllllI[3])) {
            return WorldGenSavannaTree.lIlllIlIlllllI[0] != 0;
        }
        this.func_175921_a(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIlIIlIlI.down());
        final EnumFacing llllllllllllIllllIllllIIIlIIIIIl = EnumFacing.Plane.HORIZONTAL.random(llllllllllllIllllIllllIIIlIIlIll);
        final int llllllllllllIllllIllllIIIlIIIIII = llllllllllllIllllIllllIIIlIIlIIl - llllllllllllIllllIllllIIIlIIlIll.nextInt(WorldGenSavannaTree.lIlllIlIlllllI[6]) - WorldGenSavannaTree.lIlllIlIlllllI[3];
        int llllllllllllIllllIllllIIIIllllll = WorldGenSavannaTree.lIlllIlIlllllI[1] - llllllllllllIllllIllllIIIlIIlIll.nextInt(WorldGenSavannaTree.lIlllIlIlllllI[1]);
        int llllllllllllIllllIllllIIIIlllllI = llllllllllllIllllIllllIIIlIIlIlI.getX();
        int llllllllllllIllllIllllIIIIllllIl = llllllllllllIllllIllllIIIlIIlIlI.getZ();
        int llllllllllllIllllIllllIIIIllllII = WorldGenSavannaTree.lIlllIlIlllllI[0];
        int llllllllllllIllllIllllIIIIlllIll = WorldGenSavannaTree.lIlllIlIlllllI[0];
        "".length();
        if ("  ".length() != "  ".length()) {
            return ((0x52 ^ 0x58 ^ " ".length()) & (0xF8 ^ 0xBE ^ (0xCF ^ 0x82) ^ -" ".length())) != 0x0;
        }
        while (!lIIIIIllIIIIllII(llllllllllllIllllIllllIIIIlllIll, llllllllllllIllllIllllIIIlIIlIIl)) {
            final int llllllllllllIllllIllllIIIIlllIlI = llllllllllllIllllIllllIIIlIIlIlI.getY() + llllllllllllIllllIllllIIIIlllIll;
            if (lIIIIIllIIIIllII(llllllllllllIllllIllllIIIIlllIll, llllllllllllIllllIllllIIIlIIIIII) && lIIIIIllIIIlIlIl(llllllllllllIllllIllllIIIIllllll)) {
                llllllllllllIllllIllllIIIIlllllI += llllllllllllIllllIllllIIIlIIIIIl.getFrontOffsetX();
                llllllllllllIllllIllllIIIIllllIl += llllllllllllIllllIllllIIIlIIIIIl.getFrontOffsetZ();
                --llllllllllllIllllIllllIIIIllllll;
            }
            final BlockPos llllllllllllIllllIllllIIIIlllIIl = new BlockPos(llllllllllllIllllIllllIIIIlllllI, llllllllllllIllllIllllIIIIlllIlI, llllllllllllIllllIllllIIIIllllIl);
            final Material llllllllllllIllllIllllIIIIlllIII = llllllllllllIllllIllllIIIlIIllII.getBlockState(llllllllllllIllllIllllIIIIlllIIl).getBlock().getMaterial();
            if (!lIIIIIllIIIlIIll(llllllllllllIllllIllllIIIIlllIII, Material.air) || lIIIIIllIIIlIlII(llllllllllllIllllIllllIIIIlllIII, Material.leaves)) {
                this.func_181642_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIlllIIl);
                llllllllllllIllllIllllIIIIllllII = llllllllllllIllllIllllIIIIlllIlI;
            }
            ++llllllllllllIllllIllllIIIIlllIll;
        }
        BlockPos llllllllllllIllllIllllIIIIllIlll = new BlockPos(llllllllllllIllllIllllIIIIlllllI, llllllllllllIllllIllllIIIIllllII, llllllllllllIllllIllllIIIIllllIl);
        int llllllllllllIllllIllllIIIIllIllI = WorldGenSavannaTree.lIlllIlIlllllI[7];
        "".length();
        if ((0x59 ^ 0x7F ^ (0x4E ^ 0x6C)) != (0xB7 ^ 0x89 ^ (0x60 ^ 0x5A))) {
            return ((55 + 93 - 134 + 123 ^ 25 + 81 - 43 + 68) & (0x99 ^ 0xC3 ^ (0x3A ^ 0x6A) ^ -" ".length())) != 0x0;
        }
        while (!lIIIIIllIIIlIIlI(llllllllllllIllllIllllIIIIllIllI, WorldGenSavannaTree.lIlllIlIlllllI[1])) {
            int llllllllllllIllllIllllIIIIllIlIl = WorldGenSavannaTree.lIlllIlIlllllI[7];
            "".length();
            if ("   ".length() == ((0xC3 ^ 0xC7) & ~(0xB0 ^ 0xB4))) {
                return ((0xD ^ 0x40) & ~(0x47 ^ 0xA)) != 0x0;
            }
            while (!lIIIIIllIIIlIIlI(llllllllllllIllllIllllIIIIllIlIl, WorldGenSavannaTree.lIlllIlIlllllI[1])) {
                if (!lIIIIIllIIIIlllI(Math.abs(llllllllllllIllllIllllIIIIllIllI), WorldGenSavannaTree.lIlllIlIlllllI[1]) || lIIIIIllIIIlIllI(Math.abs(llllllllllllIllllIllllIIIIllIlIl), WorldGenSavannaTree.lIlllIlIlllllI[1])) {
                    this.func_175924_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIllIlll.add(llllllllllllIllllIllllIIIIllIllI, WorldGenSavannaTree.lIlllIlIlllllI[0], llllllllllllIllllIllllIIIIllIlIl));
                }
                ++llllllllllllIllllIllllIIIIllIlIl;
            }
            ++llllllllllllIllllIllllIIIIllIllI;
        }
        llllllllllllIllllIllllIIIIllIlll = llllllllllllIllllIllllIIIIllIlll.up();
        int llllllllllllIllllIllllIIIIllIlII = WorldGenSavannaTree.lIlllIlIlllllI[8];
        "".length();
        if (-" ".length() > 0) {
            return ((0xC ^ 0x5B) & ~(0x75 ^ 0x22)) != 0x0;
        }
        while (!lIIIIIllIIIlIIlI(llllllllllllIllllIllllIIIIllIlII, WorldGenSavannaTree.lIlllIlIlllllI[3])) {
            int llllllllllllIllllIllllIIIIllIIll = WorldGenSavannaTree.lIlllIlIlllllI[8];
            "".length();
            if ((0x1A ^ 0x1E) <= 0) {
                return ((0x4B ^ 0x72) & ~(0xFB ^ 0xC2)) != 0x0;
            }
            while (!lIIIIIllIIIlIIlI(llllllllllllIllllIllllIIIIllIIll, WorldGenSavannaTree.lIlllIlIlllllI[3])) {
                this.func_175924_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIllIlll.add(llllllllllllIllllIllllIIIIllIlII, WorldGenSavannaTree.lIlllIlIlllllI[0], llllllllllllIllllIllllIIIIllIIll));
                ++llllllllllllIllllIllllIIIIllIIll;
            }
            ++llllllllllllIllllIllllIIIIllIlII;
        }
        this.func_175924_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIllIlll.east(WorldGenSavannaTree.lIlllIlIlllllI[5]));
        this.func_175924_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIllIlll.west(WorldGenSavannaTree.lIlllIlIlllllI[5]));
        this.func_175924_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIllIlll.south(WorldGenSavannaTree.lIlllIlIlllllI[5]));
        this.func_175924_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIllIlll.north(WorldGenSavannaTree.lIlllIlIlllllI[5]));
        llllllllllllIllllIllllIIIIlllllI = llllllllllllIllllIllllIIIlIIlIlI.getX();
        llllllllllllIllllIllllIIIIllllIl = llllllllllllIllllIllllIIIlIIlIlI.getZ();
        final EnumFacing llllllllllllIllllIllllIIIIllIIlI = EnumFacing.Plane.HORIZONTAL.random(llllllllllllIllllIllllIIIlIIlIll);
        if (lIIIIIllIIIlIIll(llllllllllllIllllIllllIIIIllIIlI, llllllllllllIllllIllllIIIlIIIIIl)) {
            final int llllllllllllIllllIllllIIIIllIIIl = llllllllllllIllllIllllIIIlIIIIII - llllllllllllIllllIllllIIIlIIlIll.nextInt(WorldGenSavannaTree.lIlllIlIlllllI[5]) - WorldGenSavannaTree.lIlllIlIlllllI[3];
            int llllllllllllIllllIllllIIIIllIIII = WorldGenSavannaTree.lIlllIlIlllllI[3] + llllllllllllIllllIllllIIIlIIlIll.nextInt(WorldGenSavannaTree.lIlllIlIlllllI[1]);
            llllllllllllIllllIllllIIIIllllII = WorldGenSavannaTree.lIlllIlIlllllI[0];
            int llllllllllllIllllIllllIIIIlIllll = llllllllllllIllllIllllIIIIllIIIl;
            "".length();
            if (" ".length() == ((0x73 ^ 0x4B) & ~(0x33 ^ 0xB))) {
                return ((0x2 ^ 0x63) & ~(0xD8 ^ 0xB9)) != 0x0;
            }
            while (lIIIIIllIIIlIIII(llllllllllllIllllIllllIIIIlIllll, llllllllllllIllllIllllIIIlIIlIIl) && !lIIIIIllIIIllIII(llllllllllllIllllIllllIIIIllIIII)) {
                if (lIIIIIllIIIIllII(llllllllllllIllllIllllIIIIlIllll, WorldGenSavannaTree.lIlllIlIlllllI[3])) {
                    final int llllllllllllIllllIllllIIIIlIlllI = llllllllllllIllllIllllIIIlIIlIlI.getY() + llllllllllllIllllIllllIIIIlIllll;
                    llllllllllllIllllIllllIIIIlllllI += llllllllllllIllllIllllIIIIllIIlI.getFrontOffsetX();
                    llllllllllllIllllIllllIIIIllllIl += llllllllllllIllllIllllIIIIllIIlI.getFrontOffsetZ();
                    final BlockPos llllllllllllIllllIllllIIIIlIllIl = new BlockPos(llllllllllllIllllIllllIIIIlllllI, llllllllllllIllllIllllIIIIlIlllI, llllllllllllIllllIllllIIIIllllIl);
                    final Material llllllllllllIllllIllllIIIIlIllII = llllllllllllIllllIllllIIIlIIllII.getBlockState(llllllllllllIllllIllllIIIIlIllIl).getBlock().getMaterial();
                    if (!lIIIIIllIIIlIIll(llllllllllllIllllIllllIIIIlIllII, Material.air) || lIIIIIllIIIlIlII(llllllllllllIllllIllllIIIIlIllII, Material.leaves)) {
                        this.func_181642_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIlIllIl);
                        llllllllllllIllllIllllIIIIllllII = llllllllllllIllllIllllIIIIlIlllI;
                    }
                }
                ++llllllllllllIllllIllllIIIIlIllll;
                --llllllllllllIllllIllllIIIIllIIII;
            }
            if (lIIIIIllIIIlIlIl(llllllllllllIllllIllllIIIIllllII)) {
                BlockPos llllllllllllIllllIllllIIIIlIlIll = new BlockPos(llllllllllllIllllIllllIIIIlllllI, llllllllllllIllllIllllIIIIllllII, llllllllllllIllllIllllIIIIllllIl);
                int llllllllllllIllllIllllIIIIlIlIlI = WorldGenSavannaTree.lIlllIlIlllllI[9];
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return ((0x43 ^ 0x7A ^ (0x8C ^ 0x9F)) & (79 + 103 - 160 + 111 ^ 151 + 91 - 138 + 71 ^ -" ".length())) != 0x0;
                }
                while (!lIIIIIllIIIlIIlI(llllllllllllIllllIllllIIIIlIlIlI, WorldGenSavannaTree.lIlllIlIlllllI[5])) {
                    int llllllllllllIllllIllllIIIIlIlIIl = WorldGenSavannaTree.lIlllIlIlllllI[9];
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return ((159 + 215 - 276 + 155 ^ 11 + 113 + 9 + 58) & (0x43 ^ 0x5F ^ (0x1F ^ 0x41) ^ -" ".length())) != 0x0;
                    }
                    while (!lIIIIIllIIIlIIlI(llllllllllllIllllIllllIIIIlIlIIl, WorldGenSavannaTree.lIlllIlIlllllI[5])) {
                        if (!lIIIIIllIIIIlllI(Math.abs(llllllllllllIllllIllllIIIIlIlIlI), WorldGenSavannaTree.lIlllIlIlllllI[5]) || lIIIIIllIIIlIllI(Math.abs(llllllllllllIllllIllllIIIIlIlIIl), WorldGenSavannaTree.lIlllIlIlllllI[5])) {
                            this.func_175924_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIlIlIll.add(llllllllllllIllllIllllIIIIlIlIlI, WorldGenSavannaTree.lIlllIlIlllllI[0], llllllllllllIllllIllllIIIIlIlIIl));
                        }
                        ++llllllllllllIllllIllllIIIIlIlIIl;
                    }
                    ++llllllllllllIllllIllllIIIIlIlIlI;
                }
                llllllllllllIllllIllllIIIIlIlIll = llllllllllllIllllIllllIIIIlIlIll.up();
                int llllllllllllIllllIllllIIIIlIlIII = WorldGenSavannaTree.lIlllIlIlllllI[8];
                "".length();
                if (null != null) {
                    return ((0x6D ^ 0x2C) & ~(0x8 ^ 0x49)) != 0x0;
                }
                while (!lIIIIIllIIIlIIlI(llllllllllllIllllIllllIIIIlIlIII, WorldGenSavannaTree.lIlllIlIlllllI[3])) {
                    int llllllllllllIllllIllllIIIIlIIlll = WorldGenSavannaTree.lIlllIlIlllllI[8];
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return ((0x8B ^ 0x82 ^ (0x1D ^ 0x47)) & (240 + 43 - 183 + 150 ^ 121 + 158 - 196 + 86 ^ -" ".length())) != 0x0;
                    }
                    while (!lIIIIIllIIIlIIlI(llllllllllllIllllIllllIIIIlIIlll, WorldGenSavannaTree.lIlllIlIlllllI[3])) {
                        this.func_175924_b(llllllllllllIllllIllllIIIlIIllII, llllllllllllIllllIllllIIIIlIlIll.add(llllllllllllIllllIllllIIIIlIlIII, WorldGenSavannaTree.lIlllIlIlllllI[0], llllllllllllIllllIllllIIIIlIIlll));
                        ++llllllllllllIllllIllllIIIIlIIlll;
                    }
                    ++llllllllllllIllllIllllIIIIlIlIII;
                }
            }
        }
        return WorldGenSavannaTree.lIlllIlIlllllI[3] != 0;
    }
    
    private static boolean lIIIIIllIIIlIIIl(final int llllllllllllIllllIlllIllllIlllll) {
        return llllllllllllIllllIlllIllllIlllll == 0;
    }
    
    static {
        lIIIIIllIIIIlIll();
        field_181643_a = Blocks.log2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.ACACIA);
        field_181644_b = Blocks.leaves2.getDefaultState().withProperty(BlockNewLeaf.VARIANT, BlockPlanks.EnumType.ACACIA).withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(WorldGenSavannaTree.lIlllIlIlllllI[0] != 0));
    }
    
    public WorldGenSavannaTree(final boolean llllllllllllIllllIllllIIIllIIlIl) {
        super(llllllllllllIllllIllllIIIllIIlIl);
    }
}
