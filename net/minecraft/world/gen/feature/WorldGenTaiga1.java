// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockOldLog;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;

public class WorldGenTaiga1 extends WorldGenAbstractTree
{
    private static final /* synthetic */ int[] lIIIIIIlIllIlI;
    private static final /* synthetic */ IBlockState field_181636_a;
    private static final /* synthetic */ IBlockState field_181637_b;
    
    private static boolean lIllIlIIIIlIlIl(final int lllllllllllllIlIlIIIIllIIIllIllI, final int lllllllllllllIlIlIIIIllIIIllIlIl) {
        return lllllllllllllIlIlIIIIllIIIllIllI >= lllllllllllllIlIlIIIIllIIIllIlIl;
    }
    
    private static boolean lIllIlIIIIlllIl(final int lllllllllllllIlIlIIIIllIIIIllIll) {
        return lllllllllllllIlIlIIIIllIIIIllIll <= 0;
    }
    
    private static boolean lIllIlIIIIlllII(final int lllllllllllllIlIlIIIIllIIIlllIlI, final int lllllllllllllIlIlIIIIllIIIlllIIl) {
        return lllllllllllllIlIlIIIIllIIIlllIlI == lllllllllllllIlIlIIIIllIIIlllIIl;
    }
    
    private static boolean lIllIlIIIIllIII(final int lllllllllllllIlIlIIIIllIIIIlllIl) {
        return lllllllllllllIlIlIIIIllIIIIlllIl >= 0;
    }
    
    private static boolean lIllIlIIIIlIlll(final int lllllllllllllIlIlIIIIllIIIllIIlI, final int lllllllllllllIlIlIIIIllIIIllIIIl) {
        return lllllllllllllIlIlIIIIllIIIllIIlI < lllllllllllllIlIlIIIIllIIIllIIIl;
    }
    
    private static void lIllIlIIIIlIlII() {
        (lIIIIIIlIllIlI = new int[7])[0] = ((0x5E ^ 0x6A) & ~(0xD ^ 0x39));
        WorldGenTaiga1.lIIIIIIlIllIlI[1] = (0x3E ^ 0x3B);
        WorldGenTaiga1.lIIIIIIlIllIlI[2] = (0x84 ^ 0x83);
        WorldGenTaiga1.lIIIIIIlIllIlI[3] = "  ".length();
        WorldGenTaiga1.lIIIIIIlIllIlI[4] = "   ".length();
        WorldGenTaiga1.lIIIIIIlIllIlI[5] = " ".length();
        WorldGenTaiga1.lIIIIIIlIllIlI[6] = (0xFFFFD997 & 0x2768);
    }
    
    private static boolean lIllIlIIIIllIlI(final Object lllllllllllllIlIlIIIIllIIIlIIllI, final Object lllllllllllllIlIlIIIIllIIIlIIlIl) {
        return lllllllllllllIlIlIIIIllIIIlIIllI != lllllllllllllIlIlIIIIllIIIlIIlIl;
    }
    
    private static boolean lIllIlIIIIlIllI(final int lllllllllllllIlIlIIIIllIIIlIlllI, final int lllllllllllllIlIlIIIIllIIIlIllIl) {
        return lllllllllllllIlIlIIIIllIIIlIlllI <= lllllllllllllIlIlIIIIllIIIlIllIl;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIlIlIIIIllIIllIIlII, final Random lllllllllllllIlIlIIIIllIIlIIlIll, final BlockPos lllllllllllllIlIlIIIIllIIlIIlIlI) {
        final int lllllllllllllIlIlIIIIllIIllIIIIl = lllllllllllllIlIlIIIIllIIlIIlIll.nextInt(WorldGenTaiga1.lIIIIIIlIllIlI[1]) + WorldGenTaiga1.lIIIIIIlIllIlI[2];
        final int lllllllllllllIlIlIIIIllIIllIIIII = lllllllllllllIlIlIIIIllIIllIIIIl - lllllllllllllIlIlIIIIllIIlIIlIll.nextInt(WorldGenTaiga1.lIIIIIIlIllIlI[3]) - WorldGenTaiga1.lIIIIIIlIllIlI[4];
        final int lllllllllllllIlIlIIIIllIIlIlllll = lllllllllllllIlIlIIIIllIIllIIIIl - lllllllllllllIlIlIIIIllIIllIIIII;
        final int lllllllllllllIlIlIIIIllIIlIllllI = WorldGenTaiga1.lIIIIIIlIllIlI[5] + lllllllllllllIlIlIIIIllIIlIIlIll.nextInt(lllllllllllllIlIlIIIIllIIlIlllll + WorldGenTaiga1.lIIIIIIlIllIlI[5]);
        boolean lllllllllllllIlIlIIIIllIIlIlllIl = WorldGenTaiga1.lIIIIIIlIllIlI[5] != 0;
        if (!lIllIlIIIIlIlIl(lllllllllllllIlIlIIIIllIIlIIlIlI.getY(), WorldGenTaiga1.lIIIIIIlIllIlI[5]) || !lIllIlIIIIlIllI(lllllllllllllIlIlIIIIllIIlIIlIlI.getY() + lllllllllllllIlIlIIIIllIIllIIIIl + WorldGenTaiga1.lIIIIIIlIllIlI[5], WorldGenTaiga1.lIIIIIIlIllIlI[6])) {
            return WorldGenTaiga1.lIIIIIIlIllIlI[0] != 0;
        }
        int lllllllllllllIlIlIIIIllIIlIlllII = lllllllllllllIlIlIIIIllIIlIIlIlI.getY();
        "".length();
        if ((70 + 129 - 101 + 42 ^ 83 + 79 - 138 + 112) <= "  ".length()) {
            return ((0x64 ^ 0x33 ^ (0x1 ^ 0x64)) & (0x43 ^ 0x2C ^ (0x2B ^ 0x76) ^ -" ".length())) != 0x0;
        }
        while (lIllIlIIIIlIllI(lllllllllllllIlIlIIIIllIIlIlllII, lllllllllllllIlIlIIIIllIIlIIlIlI.getY() + WorldGenTaiga1.lIIIIIIlIllIlI[5] + lllllllllllllIlIlIIIIllIIllIIIIl) && !lIllIlIIIIllIIl(lllllllllllllIlIlIIIIllIIlIlllIl ? 1 : 0)) {
            int lllllllllllllIlIlIIIIllIIlIllIll = WorldGenTaiga1.lIIIIIIlIllIlI[5];
            if (lIllIlIIIIlIlll(lllllllllllllIlIlIIIIllIIlIlllII - lllllllllllllIlIlIIIIllIIlIIlIlI.getY(), lllllllllllllIlIlIIIIllIIllIIIII)) {
                lllllllllllllIlIlIIIIllIIlIllIll = WorldGenTaiga1.lIIIIIIlIllIlI[0];
                "".length();
                if ("  ".length() <= 0) {
                    return ((0x8 ^ 0x4B) & ~(0x20 ^ 0x63)) != 0x0;
                }
            }
            else {
                lllllllllllllIlIlIIIIllIIlIllIll = lllllllllllllIlIlIIIIllIIlIllllI;
            }
            final BlockPos.MutableBlockPos lllllllllllllIlIlIIIIllIIlIllIlI = new BlockPos.MutableBlockPos();
            int lllllllllllllIlIlIIIIllIIlIllIIl = lllllllllllllIlIlIIIIllIIlIIlIlI.getX() - lllllllllllllIlIlIIIIllIIlIllIll;
            "".length();
            if ("   ".length() == 0) {
                return ((0xB ^ 0x41) & ~(0xC7 ^ 0x8D)) != 0x0;
            }
            while (lIllIlIIIIlIllI(lllllllllllllIlIlIIIIllIIlIllIIl, lllllllllllllIlIlIIIIllIIlIIlIlI.getX() + lllllllllllllIlIlIIIIllIIlIllIll) && !lIllIlIIIIllIIl(lllllllllllllIlIlIIIIllIIlIlllIl ? 1 : 0)) {
                int lllllllllllllIlIlIIIIllIIlIllIII = lllllllllllllIlIlIIIIllIIlIIlIlI.getZ() - lllllllllllllIlIlIIIIllIIlIllIll;
                "".length();
                if (null != null) {
                    return ((0x2C ^ 0x17 ^ (0x9E ^ 0xAA)) & (0xB9 ^ 0xB0 ^ (0xB ^ 0xD) ^ -" ".length())) != 0x0;
                }
                while (lIllIlIIIIlIllI(lllllllllllllIlIlIIIIllIIlIllIII, lllllllllllllIlIlIIIIllIIlIIlIlI.getZ() + lllllllllllllIlIlIIIIllIIlIllIll) && !lIllIlIIIIllIIl(lllllllllllllIlIlIIIIllIIlIlllIl ? 1 : 0)) {
                    if (lIllIlIIIIllIII(lllllllllllllIlIlIIIIllIIlIlllII) && lIllIlIIIIlIlll(lllllllllllllIlIlIIIIllIIlIlllII, WorldGenTaiga1.lIIIIIIlIllIlI[6])) {
                        if (lIllIlIIIIllIIl(this.func_150523_a(lllllllllllllIlIlIIIIllIIllIIlII.getBlockState(lllllllllllllIlIlIIIIllIIlIllIlI.func_181079_c(lllllllllllllIlIlIIIIllIIlIllIIl, lllllllllllllIlIlIIIIllIIlIlllII, lllllllllllllIlIlIIIIllIIlIllIII)).getBlock()) ? 1 : 0)) {
                            lllllllllllllIlIlIIIIllIIlIlllIl = (WorldGenTaiga1.lIIIIIIlIllIlI[0] != 0);
                            "".length();
                            if (null != null) {
                                return ((0xB ^ 0x12) & ~(0x4D ^ 0x54)) != 0x0;
                            }
                        }
                    }
                    else {
                        lllllllllllllIlIlIIIIllIIlIlllIl = (WorldGenTaiga1.lIIIIIIlIllIlI[0] != 0);
                    }
                    ++lllllllllllllIlIlIIIIllIIlIllIII;
                }
                ++lllllllllllllIlIlIIIIllIIlIllIIl;
            }
            ++lllllllllllllIlIlIIIIllIIlIlllII;
        }
        if (lIllIlIIIIllIIl(lllllllllllllIlIlIIIIllIIlIlllIl ? 1 : 0)) {
            return WorldGenTaiga1.lIIIIIIlIllIlI[0] != 0;
        }
        final Block lllllllllllllIlIlIIIIllIIlIlIlll = lllllllllllllIlIlIIIIllIIllIIlII.getBlockState(lllllllllllllIlIlIIIIllIIlIIlIlI.down()).getBlock();
        if ((lIllIlIIIIllIlI(lllllllllllllIlIlIIIIllIIlIlIlll, Blocks.grass) && !lIllIlIIIIllIll(lllllllllllllIlIlIIIIllIIlIlIlll, Blocks.dirt)) || !lIllIlIIIIlIlll(lllllllllllllIlIlIIIIllIIlIIlIlI.getY(), WorldGenTaiga1.lIIIIIIlIllIlI[6] - lllllllllllllIlIlIIIIllIIllIIIIl - WorldGenTaiga1.lIIIIIIlIllIlI[5])) {
            return WorldGenTaiga1.lIIIIIIlIllIlI[0] != 0;
        }
        this.func_175921_a(lllllllllllllIlIlIIIIllIIllIIlII, lllllllllllllIlIlIIIIllIIlIIlIlI.down());
        int lllllllllllllIlIlIIIIllIIlIlIllI = WorldGenTaiga1.lIIIIIIlIllIlI[0];
        int lllllllllllllIlIlIIIIllIIlIlIlIl = lllllllllllllIlIlIIIIllIIlIIlIlI.getY() + lllllllllllllIlIlIIIIllIIllIIIIl;
        "".length();
        if ("  ".length() == " ".length()) {
            return ((0x38 ^ 0x17 ^ (0x26 ^ 0x52)) & (0x72 ^ 0xF ^ (0x9E ^ 0xB8) ^ -" ".length())) != 0x0;
        }
        while (!lIllIlIIIIlIlll(lllllllllllllIlIlIIIIllIIlIlIlIl, lllllllllllllIlIlIIIIllIIlIIlIlI.getY() + lllllllllllllIlIlIIIIllIIllIIIII)) {
            int lllllllllllllIlIlIIIIllIIlIlIlII = lllllllllllllIlIlIIIIllIIlIIlIlI.getX() - lllllllllllllIlIlIIIIllIIlIlIllI;
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0x3E ^ 0x79) & ~(0x3A ^ 0x7D)) != 0x0;
            }
            while (!lIllIlIIIIllllI(lllllllllllllIlIlIIIIllIIlIlIlII, lllllllllllllIlIlIIIIllIIlIIlIlI.getX() + lllllllllllllIlIlIIIIllIIlIlIllI)) {
                final int lllllllllllllIlIlIIIIllIIlIlIIll = lllllllllllllIlIlIIIIllIIlIlIlII - lllllllllllllIlIlIIIIllIIlIIlIlI.getX();
                int lllllllllllllIlIlIIIIllIIlIlIIlI = lllllllllllllIlIlIIIIllIIlIIlIlI.getZ() - lllllllllllllIlIlIIIIllIIlIlIllI;
                "".length();
                if ((0x44 ^ 0x40) < 0) {
                    return ((0xE9 ^ 0xA9) & ~(0x3 ^ 0x43)) != 0x0;
                }
                while (!lIllIlIIIIllllI(lllllllllllllIlIlIIIIllIIlIlIIlI, lllllllllllllIlIlIIIIllIIlIIlIlI.getZ() + lllllllllllllIlIlIIIIllIIlIlIllI)) {
                    final int lllllllllllllIlIlIIIIllIIlIlIIIl = lllllllllllllIlIlIIIIllIIlIlIIlI - lllllllllllllIlIlIIIIllIIlIIlIlI.getZ();
                    if (!lIllIlIIIIlllII(Math.abs(lllllllllllllIlIlIIIIllIIlIlIIll), lllllllllllllIlIlIIIIllIIlIlIllI) || !lIllIlIIIIlllII(Math.abs(lllllllllllllIlIlIIIIllIIlIlIIIl), lllllllllllllIlIlIIIIllIIlIlIllI) || lIllIlIIIIlllIl(lllllllllllllIlIlIIIIllIIlIlIllI)) {
                        final BlockPos lllllllllllllIlIlIIIIllIIlIlIIII = new BlockPos(lllllllllllllIlIlIIIIllIIlIlIlII, lllllllllllllIlIlIIIIllIIlIlIlIl, lllllllllllllIlIlIIIIllIIlIlIIlI);
                        if (lIllIlIIIIllIIl(lllllllllllllIlIlIIIIllIIllIIlII.getBlockState(lllllllllllllIlIlIIIIllIIlIlIIII).getBlock().isFullBlock() ? 1 : 0)) {
                            this.setBlockAndNotifyAdequately(lllllllllllllIlIlIIIIllIIllIIlII, lllllllllllllIlIlIIIIllIIlIlIIII, WorldGenTaiga1.field_181637_b);
                        }
                    }
                    ++lllllllllllllIlIlIIIIllIIlIlIIlI;
                }
                ++lllllllllllllIlIlIIIIllIIlIlIlII;
            }
            if (lIllIlIIIIlIlIl(lllllllllllllIlIlIIIIllIIlIlIllI, WorldGenTaiga1.lIIIIIIlIllIlI[5]) && lIllIlIIIIlllII(lllllllllllllIlIlIIIIllIIlIlIlIl, lllllllllllllIlIlIIIIllIIlIIlIlI.getY() + lllllllllllllIlIlIIIIllIIllIIIII + WorldGenTaiga1.lIIIIIIlIllIlI[5])) {
                --lllllllllllllIlIlIIIIllIIlIlIllI;
                "".length();
                if ((0x27 ^ 0x23) == 0x0) {
                    return ((0x2A ^ 0x69) & ~(0x46 ^ 0x5)) != 0x0;
                }
            }
            else if (lIllIlIIIIlIlll(lllllllllllllIlIlIIIIllIIlIlIllI, lllllllllllllIlIlIIIIllIIlIllllI)) {
                ++lllllllllllllIlIlIIIIllIIlIlIllI;
            }
            --lllllllllllllIlIlIIIIllIIlIlIlIl;
        }
        int lllllllllllllIlIlIIIIllIIlIIllll = WorldGenTaiga1.lIIIIIIlIllIlI[0];
        "".length();
        if (((0x11 ^ 0x5A ^ (0x69 ^ 0x33)) & (0x75 ^ 0x23 ^ (0x2C ^ 0x6B) ^ -" ".length())) > (150 + 67 - 152 + 131 ^ 35 + 99 + 48 + 10)) {
            return ((42 + 174 - 126 + 124 ^ 165 + 122 - 124 + 35) & (117 + 2 - 81 + 133 ^ 170 + 21 - 43 + 39 ^ -" ".length())) != 0x0;
        }
        while (!lIllIlIIIIlIlIl(lllllllllllllIlIlIIIIllIIlIIllll, lllllllllllllIlIlIIIIllIIllIIIIl - WorldGenTaiga1.lIIIIIIlIllIlI[5])) {
            final Block lllllllllllllIlIlIIIIllIIlIIlllI = lllllllllllllIlIlIIIIllIIllIIlII.getBlockState(lllllllllllllIlIlIIIIllIIlIIlIlI.up(lllllllllllllIlIlIIIIllIIlIIllll)).getBlock();
            if (!lIllIlIIIIllIlI(lllllllllllllIlIlIIIIllIIlIIlllI.getMaterial(), Material.air) || lIllIlIIIIllIll(lllllllllllllIlIlIIIIllIIlIIlllI.getMaterial(), Material.leaves)) {
                this.setBlockAndNotifyAdequately(lllllllllllllIlIlIIIIllIIllIIlII, lllllllllllllIlIlIIIIllIIlIIlIlI.up(lllllllllllllIlIlIIIIllIIlIIllll), WorldGenTaiga1.field_181636_a);
            }
            ++lllllllllllllIlIlIIIIllIIlIIllll;
        }
        return WorldGenTaiga1.lIIIIIIlIllIlI[5] != 0;
    }
    
    private static boolean lIllIlIIIIllllI(final int lllllllllllllIlIlIIIIllIIIlIlIlI, final int lllllllllllllIlIlIIIIllIIIlIlIIl) {
        return lllllllllllllIlIlIIIIllIIIlIlIlI > lllllllllllllIlIlIIIIllIIIlIlIIl;
    }
    
    public WorldGenTaiga1() {
        super((boolean)(WorldGenTaiga1.lIIIIIIlIllIlI[0] != 0));
    }
    
    private static boolean lIllIlIIIIllIIl(final int lllllllllllllIlIlIIIIllIIIIlllll) {
        return lllllllllllllIlIlIIIIllIIIIlllll == 0;
    }
    
    static {
        lIllIlIIIIlIlII();
        field_181636_a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE);
        field_181637_b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.SPRUCE).withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(WorldGenTaiga1.lIIIIIIlIllIlI[0] != 0));
    }
    
    private static boolean lIllIlIIIIllIll(final Object lllllllllllllIlIlIIIIllIIIlIIIlI, final Object lllllllllllllIlIlIIIIllIIIlIIIIl) {
        return lllllllllllllIlIlIIIIllIIIlIIIlI == lllllllllllllIlIlIIIIllIIIlIIIIl;
    }
}
