// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockOldLog;
import java.util.Iterator;
import net.minecraft.block.Block;
import net.minecraft.block.BlockVine;
import java.util.Random;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockCocoa;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;

public class WorldGenTrees extends WorldGenAbstractTree
{
    private final /* synthetic */ IBlockState metaLeaves;
    private final /* synthetic */ IBlockState metaWood;
    private static final /* synthetic */ IBlockState field_181654_b;
    private final /* synthetic */ int minTreeHeight;
    private static final /* synthetic */ int[] lllIIIIIlIIIII;
    private static final /* synthetic */ IBlockState field_181653_a;
    private final /* synthetic */ boolean vinesGrow;
    
    private static boolean lIIlllIIIIIIIlIl(final int llllllllllllIllIIIlIIIIIlIIlIlIl, final int llllllllllllIllIIIlIIIIIlIIlIlII) {
        return llllllllllllIllIIIlIIIIIlIIlIlIl > llllllllllllIllIIIlIIIIIlIIlIlII;
    }
    
    private static boolean lIIlllIIIIIIlIII(final int llllllllllllIllIIIlIIIIIlIIIlIlI) {
        return llllllllllllIllIIIlIIIIIlIIIlIlI != 0;
    }
    
    private static boolean lIIlllIIIIIIIlll(final Object llllllllllllIllIIIlIIIIIlIIIllIl, final Object llllllllllllIllIIIlIIIIIlIIIllII) {
        return llllllllllllIllIIIlIIIIIlIIIllIl == llllllllllllIllIIIlIIIIIlIIIllII;
    }
    
    private void func_181650_b(final World llllllllllllIllIIIlIIIIIlIlIlIll, BlockPos llllllllllllIllIIIlIIIIIlIlIlIlI, final PropertyBool llllllllllllIllIIIlIIIIIlIlIlIIl) {
        this.func_181651_a(llllllllllllIllIIIlIIIIIlIlIlIll, llllllllllllIllIIIlIIIIIlIlIlIlI, llllllllllllIllIIIlIIIIIlIlIlIIl);
        int llllllllllllIllIIIlIIIIIlIlIllIl = WorldGenTrees.lllIIIIIlIIIII[1];
        llllllllllllIllIIIlIIIIIlIlIlIlI = llllllllllllIllIIIlIIIIIlIlIlIlI.down();
        "".length();
        if ("   ".length() == "  ".length()) {
            return;
        }
        while (lIIlllIIIIIIIlll(llllllllllllIllIIIlIIIIIlIlIlIll.getBlockState(llllllllllllIllIIIlIIIIIlIlIlIlI).getBlock().getMaterial(), Material.air) && !lIIlllIIIIIIlIlI(llllllllllllIllIIIlIIIIIlIlIllIl)) {
            this.func_181651_a(llllllllllllIllIIIlIIIIIlIlIlIll, llllllllllllIllIIIlIIIIIlIlIlIlI, llllllllllllIllIIIlIIIIIlIlIlIIl);
            llllllllllllIllIIIlIIIIIlIlIlIlI = llllllllllllIllIIIlIIIIIlIlIlIlI.down();
            --llllllllllllIllIIIlIIIIIlIlIllIl;
        }
    }
    
    private void func_181652_a(final World llllllllllllIllIIIlIIIIIllIIIllI, final int llllllllllllIllIIIlIIIIIllIIIlIl, final BlockPos llllllllllllIllIIIlIIIIIllIIlIIl, final EnumFacing llllllllllllIllIIIlIIIIIllIIlIII) {
        this.setBlockAndNotifyAdequately(llllllllllllIllIIIlIIIIIllIIIllI, llllllllllllIllIIIlIIIIIllIIlIIl, Blocks.cocoa.getDefaultState().withProperty((IProperty<Comparable>)BlockCocoa.AGE, llllllllllllIllIIIlIIIIIllIIIlIl).withProperty((IProperty<Comparable>)BlockCocoa.FACING, llllllllllllIllIIIlIIIIIllIIlIII));
    }
    
    private static boolean lIIlllIIIIIIIIIl(final int llllllllllllIllIIIlIIIIIlIlIIlIl, final int llllllllllllIllIIIlIIIIIlIlIIlII) {
        return llllllllllllIllIIIlIIIIIlIlIIlIl == llllllllllllIllIIIlIIIIIlIlIIlII;
    }
    
    private static boolean lIIlllIIIIIIIIlI(final int llllllllllllIllIIIlIIIIIlIIIIllI) {
        return llllllllllllIllIIIlIIIIIlIIIIllI >= 0;
    }
    
    private static boolean lIIlllIIIIIIlIIl(final int llllllllllllIllIIIlIIIIIlIIIIIlI) {
        return llllllllllllIllIIIlIIIIIlIIIIIlI > 0;
    }
    
    private static void lIIllIlllllllllI() {
        (lllIIIIIlIIIII = new int[8])[0] = ((158 + 183 - 153 + 32 ^ 18 + 110 - 16 + 43) & (0x62 ^ 0x6A ^ (0x1C ^ 0x53) ^ -" ".length()));
        WorldGenTrees.lllIIIIIlIIIII[1] = (117 + 174 - 279 + 187 ^ 128 + 130 - 232 + 169);
        WorldGenTrees.lllIIIIIlIIIII[2] = "   ".length();
        WorldGenTrees.lllIIIIIlIIIII[3] = " ".length();
        WorldGenTrees.lllIIIIIlIIIII[4] = (-(0xFFFFEFEF & 0x7ED6) & (0xFFFFFFCF & 0x6FF5));
        WorldGenTrees.lllIIIIIlIIIII[5] = "  ".length();
        WorldGenTrees.lllIIIIIlIIIII[6] = -" ".length();
        WorldGenTrees.lllIIIIIlIIIII[7] = (0x32 ^ 0x37);
    }
    
    private static boolean lIIlllIIIIIIIlII(final int llllllllllllIllIIIlIIIIIlIIIlIII) {
        return llllllllllllIllIIIlIIIIIlIIIlIII == 0;
    }
    
    @Override
    public boolean generate(final World llllllllllllIllIIIlIIIIlIIIIlIIl, final Random llllllllllllIllIIIlIIIIIlllIIIlI, final BlockPos llllllllllllIllIIIlIIIIIlllIIIIl) {
        final int llllllllllllIllIIIlIIIIlIIIIIllI = llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[2]) + this.minTreeHeight;
        boolean llllllllllllIllIIIlIIIIlIIIIIlIl = WorldGenTrees.lllIIIIIlIIIII[3] != 0;
        if (!lIIllIllllllllll(llllllllllllIllIIIlIIIIIlllIIIIl.getY(), WorldGenTrees.lllIIIIIlIIIII[3]) || !lIIlllIIIIIIIIII(llllllllllllIllIIIlIIIIIlllIIIIl.getY() + llllllllllllIllIIIlIIIIlIIIIIllI + WorldGenTrees.lllIIIIIlIIIII[3], WorldGenTrees.lllIIIIIlIIIII[4])) {
            return WorldGenTrees.lllIIIIIlIIIII[0] != 0;
        }
        int llllllllllllIllIIIlIIIIlIIIIIlII = llllllllllllIllIIIlIIIIIlllIIIIl.getY();
        "".length();
        if (" ".length() <= -" ".length()) {
            return ((128 + 107 - 229 + 154 ^ 67 + 44 - 25 + 45) & (0xF7 ^ 0xAB ^ 52 + 62 - 5 + 18 ^ -" ".length())) != 0x0;
        }
        while (!lIIlllIIIIIIIlIl(llllllllllllIllIIIlIIIIlIIIIIlII, llllllllllllIllIIIlIIIIIlllIIIIl.getY() + WorldGenTrees.lllIIIIIlIIIII[3] + llllllllllllIllIIIlIIIIlIIIIIllI)) {
            int llllllllllllIllIIIlIIIIlIIIIIIll = WorldGenTrees.lllIIIIIlIIIII[3];
            if (lIIlllIIIIIIIIIl(llllllllllllIllIIIlIIIIlIIIIIlII, llllllllllllIllIIIlIIIIIlllIIIIl.getY())) {
                llllllllllllIllIIIlIIIIlIIIIIIll = WorldGenTrees.lllIIIIIlIIIII[0];
            }
            if (lIIllIllllllllll(llllllllllllIllIIIlIIIIlIIIIIlII, llllllllllllIllIIIlIIIIIlllIIIIl.getY() + WorldGenTrees.lllIIIIIlIIIII[3] + llllllllllllIllIIIlIIIIlIIIIIllI - WorldGenTrees.lllIIIIIlIIIII[5])) {
                llllllllllllIllIIIlIIIIlIIIIIIll = WorldGenTrees.lllIIIIIlIIIII[5];
            }
            final BlockPos.MutableBlockPos llllllllllllIllIIIlIIIIlIIIIIIlI = new BlockPos.MutableBlockPos();
            int llllllllllllIllIIIlIIIIlIIIIIIIl = llllllllllllIllIIIlIIIIIlllIIIIl.getX() - llllllllllllIllIIIlIIIIlIIIIIIll;
            "".length();
            if ((0x58 ^ 0x5C) != (0x91 ^ 0x95)) {
                return ((0x76 ^ 0x67) & ~(0x3D ^ 0x2C)) != 0x0;
            }
            while (lIIlllIIIIIIIIII(llllllllllllIllIIIlIIIIlIIIIIIIl, llllllllllllIllIIIlIIIIIlllIIIIl.getX() + llllllllllllIllIIIlIIIIlIIIIIIll) && !lIIlllIIIIIIIlII(llllllllllllIllIIIlIIIIlIIIIIlIl ? 1 : 0)) {
                int llllllllllllIllIIIlIIIIlIIIIIIII = llllllllllllIllIIIlIIIIIlllIIIIl.getZ() - llllllllllllIllIIIlIIIIlIIIIIIll;
                "".length();
                if (((0xFE ^ 0xBE) & ~(0x69 ^ 0x29)) > 0) {
                    return ((0x72 ^ 0x3C) & ~(0xC1 ^ 0x8F)) != 0x0;
                }
                while (lIIlllIIIIIIIIII(llllllllllllIllIIIlIIIIlIIIIIIII, llllllllllllIllIIIlIIIIIlllIIIIl.getZ() + llllllllllllIllIIIlIIIIlIIIIIIll) && !lIIlllIIIIIIIlII(llllllllllllIllIIIlIIIIlIIIIIlIl ? 1 : 0)) {
                    if (lIIlllIIIIIIIIlI(llllllllllllIllIIIlIIIIlIIIIIlII) && lIIlllIIIIIIIIll(llllllllllllIllIIIlIIIIlIIIIIlII, WorldGenTrees.lllIIIIIlIIIII[4])) {
                        if (lIIlllIIIIIIIlII(this.func_150523_a(llllllllllllIllIIIlIIIIlIIIIlIIl.getBlockState(llllllllllllIllIIIlIIIIlIIIIIIlI.func_181079_c(llllllllllllIllIIIlIIIIlIIIIIIIl, llllllllllllIllIIIlIIIIlIIIIIlII, llllllllllllIllIIIlIIIIlIIIIIIII)).getBlock()) ? 1 : 0)) {
                            llllllllllllIllIIIlIIIIlIIIIIlIl = (WorldGenTrees.lllIIIIIlIIIII[0] != 0);
                            "".length();
                            if (-(0x65 ^ 0x61) >= 0) {
                                return ((0x76 ^ 0x35) & ~(0x7F ^ 0x3C)) != 0x0;
                            }
                        }
                    }
                    else {
                        llllllllllllIllIIIlIIIIlIIIIIlIl = (WorldGenTrees.lllIIIIIlIIIII[0] != 0);
                    }
                    ++llllllllllllIllIIIlIIIIlIIIIIIII;
                }
                ++llllllllllllIllIIIlIIIIlIIIIIIIl;
            }
            ++llllllllllllIllIIIlIIIIlIIIIIlII;
        }
        if (lIIlllIIIIIIIlII(llllllllllllIllIIIlIIIIlIIIIIlIl ? 1 : 0)) {
            return WorldGenTrees.lllIIIIIlIIIII[0] != 0;
        }
        final Block llllllllllllIllIIIlIIIIIllllllll = llllllllllllIllIIIlIIIIlIIIIlIIl.getBlockState(llllllllllllIllIIIlIIIIIlllIIIIl.down()).getBlock();
        if ((lIIlllIIIIIIIllI(llllllllllllIllIIIlIIIIIllllllll, Blocks.grass) && lIIlllIIIIIIIllI(llllllllllllIllIIIlIIIIIllllllll, Blocks.dirt) && !lIIlllIIIIIIIlll(llllllllllllIllIIIlIIIIIllllllll, Blocks.farmland)) || !lIIlllIIIIIIIIll(llllllllllllIllIIIlIIIIIlllIIIIl.getY(), WorldGenTrees.lllIIIIIlIIIII[4] - llllllllllllIllIIIlIIIIlIIIIIllI - WorldGenTrees.lllIIIIIlIIIII[3])) {
            return WorldGenTrees.lllIIIIIlIIIII[0] != 0;
        }
        this.func_175921_a(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIIIIl.down());
        final int llllllllllllIllIIIlIIIIIlllllllI = WorldGenTrees.lllIIIIIlIIIII[2];
        final int llllllllllllIllIIIlIIIIIllllllIl = WorldGenTrees.lllIIIIIlIIIII[0];
        int llllllllllllIllIIIlIIIIIllllllII = llllllllllllIllIIIlIIIIIlllIIIIl.getY() - llllllllllllIllIIIlIIIIIlllllllI + llllllllllllIllIIIlIIIIlIIIIIllI;
        "".length();
        if (" ".length() == 0) {
            return ((75 + 181 - 95 + 93 ^ 45 + 40 + 66 + 31) & (0x7D ^ 0x1 ^ (0x19 ^ 0x2D) ^ -" ".length())) != 0x0;
        }
        while (!lIIlllIIIIIIIlIl(llllllllllllIllIIIlIIIIIllllllII, llllllllllllIllIIIlIIIIIlllIIIIl.getY() + llllllllllllIllIIIlIIIIlIIIIIllI)) {
            final int llllllllllllIllIIIlIIIIIlllllIll = llllllllllllIllIIIlIIIIIllllllII - (llllllllllllIllIIIlIIIIIlllIIIIl.getY() + llllllllllllIllIIIlIIIIlIIIIIllI);
            final int llllllllllllIllIIIlIIIIIlllllIlI = llllllllllllIllIIIlIIIIIllllllIl + WorldGenTrees.lllIIIIIlIIIII[3] - llllllllllllIllIIIlIIIIIlllllIll / WorldGenTrees.lllIIIIIlIIIII[5];
            int llllllllllllIllIIIlIIIIIlllllIIl = llllllllllllIllIIIlIIIIIlllIIIIl.getX() - llllllllllllIllIIIlIIIIIlllllIlI;
            "".length();
            if ("  ".length() < " ".length()) {
                return ((0x3B ^ 0x7 ^ (0x83 ^ 0xA1)) & (0x4F ^ 0x5F ^ (0x8F ^ 0x81) ^ -" ".length())) != 0x0;
            }
            while (!lIIlllIIIIIIIlIl(llllllllllllIllIIIlIIIIIlllllIIl, llllllllllllIllIIIlIIIIIlllIIIIl.getX() + llllllllllllIllIIIlIIIIIlllllIlI)) {
                final int llllllllllllIllIIIlIIIIIlllllIII = llllllllllllIllIIIlIIIIIlllllIIl - llllllllllllIllIIIlIIIIIlllIIIIl.getX();
                int llllllllllllIllIIIlIIIIIllllIlll = llllllllllllIllIIIlIIIIIlllIIIIl.getZ() - llllllllllllIllIIIlIIIIIlllllIlI;
                "".length();
                if (((0x61 ^ 0x44) & ~(0x27 ^ 0x2)) != 0x0) {
                    return ((0x26 ^ 0x36) & ~(0x57 ^ 0x47)) != 0x0;
                }
                while (!lIIlllIIIIIIIlIl(llllllllllllIllIIIlIIIIIllllIlll, llllllllllllIllIIIlIIIIIlllIIIIl.getZ() + llllllllllllIllIIIlIIIIIlllllIlI)) {
                    final int llllllllllllIllIIIlIIIIIllllIllI = llllllllllllIllIIIlIIIIIllllIlll - llllllllllllIllIIIlIIIIIlllIIIIl.getZ();
                    if (!lIIlllIIIIIIIIIl(Math.abs(llllllllllllIllIIIlIIIIIlllllIII), llllllllllllIllIIIlIIIIIlllllIlI) || !lIIlllIIIIIIIIIl(Math.abs(llllllllllllIllIIIlIIIIIllllIllI), llllllllllllIllIIIlIIIIIlllllIlI) || (lIIlllIIIIIIlIII(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[5])) && lIIlllIIIIIIlIII(llllllllllllIllIIIlIIIIIlllllIll))) {
                        final BlockPos llllllllllllIllIIIlIIIIIllllIlIl = new BlockPos(llllllllllllIllIIIlIIIIIlllllIIl, llllllllllllIllIIIlIIIIIllllllII, llllllllllllIllIIIlIIIIIllllIlll);
                        final Block llllllllllllIllIIIlIIIIIllllIlII = llllllllllllIllIIIlIIIIlIIIIlIIl.getBlockState(llllllllllllIllIIIlIIIIIllllIlIl).getBlock();
                        if (!lIIlllIIIIIIIllI(llllllllllllIllIIIlIIIIIllllIlII.getMaterial(), Material.air) || !lIIlllIIIIIIIllI(llllllllllllIllIIIlIIIIIllllIlII.getMaterial(), Material.leaves) || lIIlllIIIIIIIlll(llllllllllllIllIIIlIIIIIllllIlII.getMaterial(), Material.vine)) {
                            this.setBlockAndNotifyAdequately(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIllllIlIl, this.metaLeaves);
                        }
                    }
                    ++llllllllllllIllIIIlIIIIIllllIlll;
                }
                ++llllllllllllIllIIIlIIIIIlllllIIl;
            }
            ++llllllllllllIllIIIlIIIIIllllllII;
        }
        int llllllllllllIllIIIlIIIIIllllIIll = WorldGenTrees.lllIIIIIlIIIII[0];
        "".length();
        if (" ".length() != " ".length()) {
            return ((0x1E ^ 0x29 ^ (0x95 ^ 0xC1)) & (152 + 117 - 120 + 44 ^ 92 + 67 + 1 + 2 ^ -" ".length())) != 0x0;
        }
        while (!lIIllIllllllllll(llllllllllllIllIIIlIIIIIllllIIll, llllllllllllIllIIIlIIIIlIIIIIllI)) {
            final Block llllllllllllIllIIIlIIIIIllllIIlI = llllllllllllIllIIIlIIIIlIIIIlIIl.getBlockState(llllllllllllIllIIIlIIIIIlllIIIIl.up(llllllllllllIllIIIlIIIIIllllIIll)).getBlock();
            if (!lIIlllIIIIIIIllI(llllllllllllIllIIIlIIIIIllllIIlI.getMaterial(), Material.air) || !lIIlllIIIIIIIllI(llllllllllllIllIIIlIIIIIllllIIlI.getMaterial(), Material.leaves) || lIIlllIIIIIIIlll(llllllllllllIllIIIlIIIIIllllIIlI.getMaterial(), Material.vine)) {
                this.setBlockAndNotifyAdequately(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIIIIl.up(llllllllllllIllIIIlIIIIIllllIIll), this.metaWood);
                if (lIIlllIIIIIIlIII(this.vinesGrow ? 1 : 0) && lIIlllIIIIIIlIIl(llllllllllllIllIIIlIIIIIllllIIll)) {
                    if (lIIlllIIIIIIlIIl(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[2])) && lIIlllIIIIIIlIII(llllllllllllIllIIIlIIIIlIIIIlIIl.isAirBlock(llllllllllllIllIIIlIIIIIlllIIIIl.add(WorldGenTrees.lllIIIIIlIIIII[6], llllllllllllIllIIIlIIIIIllllIIll, WorldGenTrees.lllIIIIIlIIIII[0])) ? 1 : 0)) {
                        this.func_181651_a(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIIIIl.add(WorldGenTrees.lllIIIIIlIIIII[6], llllllllllllIllIIIlIIIIIllllIIll, WorldGenTrees.lllIIIIIlIIIII[0]), BlockVine.EAST);
                    }
                    if (lIIlllIIIIIIlIIl(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[2])) && lIIlllIIIIIIlIII(llllllllllllIllIIIlIIIIlIIIIlIIl.isAirBlock(llllllllllllIllIIIlIIIIIlllIIIIl.add(WorldGenTrees.lllIIIIIlIIIII[3], llllllllllllIllIIIlIIIIIllllIIll, WorldGenTrees.lllIIIIIlIIIII[0])) ? 1 : 0)) {
                        this.func_181651_a(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIIIIl.add(WorldGenTrees.lllIIIIIlIIIII[3], llllllllllllIllIIIlIIIIIllllIIll, WorldGenTrees.lllIIIIIlIIIII[0]), BlockVine.WEST);
                    }
                    if (lIIlllIIIIIIlIIl(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[2])) && lIIlllIIIIIIlIII(llllllllllllIllIIIlIIIIlIIIIlIIl.isAirBlock(llllllllllllIllIIIlIIIIIlllIIIIl.add(WorldGenTrees.lllIIIIIlIIIII[0], llllllllllllIllIIIlIIIIIllllIIll, WorldGenTrees.lllIIIIIlIIIII[6])) ? 1 : 0)) {
                        this.func_181651_a(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIIIIl.add(WorldGenTrees.lllIIIIIlIIIII[0], llllllllllllIllIIIlIIIIIllllIIll, WorldGenTrees.lllIIIIIlIIIII[6]), BlockVine.SOUTH);
                    }
                    if (lIIlllIIIIIIlIIl(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[2])) && lIIlllIIIIIIlIII(llllllllllllIllIIIlIIIIlIIIIlIIl.isAirBlock(llllllllllllIllIIIlIIIIIlllIIIIl.add(WorldGenTrees.lllIIIIIlIIIII[0], llllllllllllIllIIIlIIIIIllllIIll, WorldGenTrees.lllIIIIIlIIIII[3])) ? 1 : 0)) {
                        this.func_181651_a(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIIIIl.add(WorldGenTrees.lllIIIIIlIIIII[0], llllllllllllIllIIIlIIIIIllllIIll, WorldGenTrees.lllIIIIIlIIIII[3]), BlockVine.NORTH);
                    }
                }
            }
            ++llllllllllllIllIIIlIIIIIllllIIll;
        }
        if (lIIlllIIIIIIlIII(this.vinesGrow ? 1 : 0)) {
            int llllllllllllIllIIIlIIIIIllllIIIl = llllllllllllIllIIIlIIIIIlllIIIIl.getY() - WorldGenTrees.lllIIIIIlIIIII[2] + llllllllllllIllIIIlIIIIlIIIIIllI;
            "".length();
            if ("   ".length() < 0) {
                return ((0x4C ^ 0x65) & ~(0x4A ^ 0x63)) != 0x0;
            }
            while (!lIIlllIIIIIIIlIl(llllllllllllIllIIIlIIIIIllllIIIl, llllllllllllIllIIIlIIIIIlllIIIIl.getY() + llllllllllllIllIIIlIIIIlIIIIIllI)) {
                final int llllllllllllIllIIIlIIIIIllllIIII = llllllllllllIllIIIlIIIIIllllIIIl - (llllllllllllIllIIIlIIIIIlllIIIIl.getY() + llllllllllllIllIIIlIIIIlIIIIIllI);
                final int llllllllllllIllIIIlIIIIIlllIllll = WorldGenTrees.lllIIIIIlIIIII[5] - llllllllllllIllIIIlIIIIIllllIIII / WorldGenTrees.lllIIIIIlIIIII[5];
                final BlockPos.MutableBlockPos llllllllllllIllIIIlIIIIIlllIlllI = new BlockPos.MutableBlockPos();
                int llllllllllllIllIIIlIIIIIlllIllIl = llllllllllllIllIIIlIIIIIlllIIIIl.getX() - llllllllllllIllIIIlIIIIIlllIllll;
                "".length();
                if ("   ".length() <= 0) {
                    return ((0x1B ^ 0x32) & ~(0x35 ^ 0x1C)) != 0x0;
                }
                while (!lIIlllIIIIIIIlIl(llllllllllllIllIIIlIIIIIlllIllIl, llllllllllllIllIIIlIIIIIlllIIIIl.getX() + llllllllllllIllIIIlIIIIIlllIllll)) {
                    int llllllllllllIllIIIlIIIIIlllIllII = llllllllllllIllIIIlIIIIIlllIIIIl.getZ() - llllllllllllIllIIIlIIIIIlllIllll;
                    "".length();
                    if ((0x54 ^ 0x49 ^ (0xB4 ^ 0xAC)) <= 0) {
                        return ((0x22 ^ 0x1B ^ (0x15 ^ 0x21)) & (154 + 89 - 132 + 44 ^ 83 + 35 - 115 + 147 ^ -" ".length())) != 0x0;
                    }
                    while (!lIIlllIIIIIIIlIl(llllllllllllIllIIIlIIIIIlllIllII, llllllllllllIllIIIlIIIIIlllIIIIl.getZ() + llllllllllllIllIIIlIIIIIlllIllll)) {
                        llllllllllllIllIIIlIIIIIlllIlllI.func_181079_c(llllllllllllIllIIIlIIIIIlllIllIl, llllllllllllIllIIIlIIIIIllllIIIl, llllllllllllIllIIIlIIIIIlllIllII);
                        "".length();
                        if (lIIlllIIIIIIIlll(llllllllllllIllIIIlIIIIlIIIIlIIl.getBlockState(llllllllllllIllIIIlIIIIIlllIlllI).getBlock().getMaterial(), Material.leaves)) {
                            final BlockPos llllllllllllIllIIIlIIIIIlllIlIll = llllllllllllIllIIIlIIIIIlllIlllI.west();
                            final BlockPos llllllllllllIllIIIlIIIIIlllIlIlI = llllllllllllIllIIIlIIIIIlllIlllI.east();
                            final BlockPos llllllllllllIllIIIlIIIIIlllIlIIl = llllllllllllIllIIIlIIIIIlllIlllI.north();
                            final BlockPos llllllllllllIllIIIlIIIIIlllIlIII = llllllllllllIllIIIlIIIIIlllIlllI.south();
                            if (lIIlllIIIIIIIlII(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[1])) && lIIlllIIIIIIIlll(llllllllllllIllIIIlIIIIlIIIIlIIl.getBlockState(llllllllllllIllIIIlIIIIIlllIlIll).getBlock().getMaterial(), Material.air)) {
                                this.func_181650_b(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIlIll, BlockVine.EAST);
                            }
                            if (lIIlllIIIIIIIlII(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[1])) && lIIlllIIIIIIIlll(llllllllllllIllIIIlIIIIlIIIIlIIl.getBlockState(llllllllllllIllIIIlIIIIIlllIlIlI).getBlock().getMaterial(), Material.air)) {
                                this.func_181650_b(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIlIlI, BlockVine.WEST);
                            }
                            if (lIIlllIIIIIIIlII(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[1])) && lIIlllIIIIIIIlll(llllllllllllIllIIIlIIIIlIIIIlIIl.getBlockState(llllllllllllIllIIIlIIIIIlllIlIIl).getBlock().getMaterial(), Material.air)) {
                                this.func_181650_b(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIlIIl, BlockVine.SOUTH);
                            }
                            if (lIIlllIIIIIIIlII(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[1])) && lIIlllIIIIIIIlll(llllllllllllIllIIIlIIIIlIIIIlIIl.getBlockState(llllllllllllIllIIIlIIIIIlllIlIII).getBlock().getMaterial(), Material.air)) {
                                this.func_181650_b(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIlIII, BlockVine.NORTH);
                            }
                        }
                        ++llllllllllllIllIIIlIIIIIlllIllII;
                    }
                    ++llllllllllllIllIIIlIIIIIlllIllIl;
                }
                ++llllllllllllIllIIIlIIIIIllllIIIl;
            }
            if (lIIlllIIIIIIIlII(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[7])) && lIIlllIIIIIIIlIl(llllllllllllIllIIIlIIIIlIIIIIllI, WorldGenTrees.lllIIIIIlIIIII[7])) {
                int llllllllllllIllIIIlIIIIIlllIIlll = WorldGenTrees.lllIIIIIlIIIII[0];
                "".length();
                if (-" ".length() >= ((0x7C ^ 0x58) & ~(0x5C ^ 0x78))) {
                    return ((0x44 ^ 0xC) & ~(0x3E ^ 0x76)) != 0x0;
                }
                while (!lIIllIllllllllll(llllllllllllIllIIIlIIIIIlllIIlll, WorldGenTrees.lllIIIIIlIIIII[5])) {
                    final Iterator<EnumFacing> iterator = EnumFacing.Plane.HORIZONTAL.iterator();
                    "".length();
                    if (((0x22 ^ 0x34) & ~(0x26 ^ 0x30)) >= (0x98 ^ 0x9C)) {
                        return ((0xFE ^ 0xAC) & ~(0x2A ^ 0x78)) != 0x0;
                    }
                    while (!lIIlllIIIIIIIlII(iterator.hasNext() ? 1 : 0)) {
                        final EnumFacing llllllllllllIllIIIlIIIIIlllIIllI = iterator.next();
                        if (lIIlllIIIIIIIlII(llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[1] - llllllllllllIllIIIlIIIIIlllIIlll))) {
                            final EnumFacing llllllllllllIllIIIlIIIIIlllIIlIl = llllllllllllIllIIIlIIIIIlllIIllI.getOpposite();
                            this.func_181652_a(llllllllllllIllIIIlIIIIlIIIIlIIl, llllllllllllIllIIIlIIIIIlllIIIlI.nextInt(WorldGenTrees.lllIIIIIlIIIII[2]), llllllllllllIllIIIlIIIIIlllIIIIl.add(llllllllllllIllIIIlIIIIIlllIIlIl.getFrontOffsetX(), llllllllllllIllIIIlIIIIlIIIIIllI - WorldGenTrees.lllIIIIIlIIIII[7] + llllllllllllIllIIIlIIIIIlllIIlll, llllllllllllIllIIIlIIIIIlllIIlIl.getFrontOffsetZ()), llllllllllllIllIIIlIIIIIlllIIllI);
                        }
                    }
                    ++llllllllllllIllIIIlIIIIIlllIIlll;
                }
            }
        }
        return WorldGenTrees.lllIIIIIlIIIII[3] != 0;
    }
    
    public WorldGenTrees(final boolean llllllllllllIllIIIlIIIIlIIlIlIII, final int llllllllllllIllIIIlIIIIlIIlIIlll, final IBlockState llllllllllllIllIIIlIIIIlIIlIIllI, final IBlockState llllllllllllIllIIIlIIIIlIIIlllll, final boolean llllllllllllIllIIIlIIIIlIIIllllI) {
        super(llllllllllllIllIIIlIIIIlIIlIlIII);
        this.minTreeHeight = llllllllllllIllIIIlIIIIlIIlIIlll;
        this.metaWood = llllllllllllIllIIIlIIIIlIIlIIllI;
        this.metaLeaves = llllllllllllIllIIIlIIIIlIIIlllll;
        this.vinesGrow = llllllllllllIllIIIlIIIIlIIIllllI;
    }
    
    private void func_181651_a(final World llllllllllllIllIIIlIIIIIlIllllIl, final BlockPos llllllllllllIllIIIlIIIIIlIlllIII, final PropertyBool llllllllllllIllIIIlIIIIIlIllIlll) {
        this.setBlockAndNotifyAdequately(llllllllllllIllIIIlIIIIIlIllllIl, llllllllllllIllIIIlIIIIIlIlllIII, Blocks.vine.getDefaultState().withProperty((IProperty<Comparable>)llllllllllllIllIIIlIIIIIlIllIlll, (boolean)(WorldGenTrees.lllIIIIIlIIIII[3] != 0)));
    }
    
    private static boolean lIIlllIIIIIIIIII(final int llllllllllllIllIIIlIIIIIlIIllIIl, final int llllllllllllIllIIIlIIIIIlIIllIII) {
        return llllllllllllIllIIIlIIIIIlIIllIIl <= llllllllllllIllIIIlIIIIIlIIllIII;
    }
    
    public WorldGenTrees(final boolean llllllllllllIllIIIlIIIIlIIllIIII) {
        this(llllllllllllIllIIIlIIIIlIIllIIII, WorldGenTrees.lllIIIIIlIIIII[1], WorldGenTrees.field_181653_a, WorldGenTrees.field_181654_b, (boolean)(WorldGenTrees.lllIIIIIlIIIII[0] != 0));
    }
    
    private static boolean lIIlllIIIIIIlIlI(final int llllllllllllIllIIIlIIIIIlIIIIlII) {
        return llllllllllllIllIIIlIIIIIlIIIIlII <= 0;
    }
    
    private static boolean lIIlllIIIIIIIIll(final int llllllllllllIllIIIlIIIIIlIIlllIl, final int llllllllllllIllIIIlIIIIIlIIlllII) {
        return llllllllllllIllIIIlIIIIIlIIlllIl < llllllllllllIllIIIlIIIIIlIIlllII;
    }
    
    private static boolean lIIllIllllllllll(final int llllllllllllIllIIIlIIIIIlIlIIIIl, final int llllllllllllIllIIIlIIIIIlIlIIIII) {
        return llllllllllllIllIIIlIIIIIlIlIIIIl >= llllllllllllIllIIIlIIIIIlIlIIIII;
    }
    
    static {
        lIIllIlllllllllI();
        field_181653_a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.OAK);
        field_181654_b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(WorldGenTrees.lllIIIIIlIIIII[0] != 0));
    }
    
    private static boolean lIIlllIIIIIIIllI(final Object llllllllllllIllIIIlIIIIIlIIlIIIl, final Object llllllllllllIllIIIlIIIIIlIIlIIII) {
        return llllllllllllIllIIIlIIIIIlIIlIIIl != llllllllllllIllIIIlIIIIIlIIlIIII;
    }
}
