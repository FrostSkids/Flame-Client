// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockOldLog;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;

public class WorldGenTaiga2 extends WorldGenAbstractTree
{
    private static final /* synthetic */ int[] lIIIllIlIIIIlI;
    private static final /* synthetic */ IBlockState field_181646_b;
    private static final /* synthetic */ IBlockState field_181645_a;
    
    private static void llIIIlIIIIIllII() {
        (lIIIllIlIIIIlI = new int[7])[0] = ((0x65 ^ 0x29) & ~(0x76 ^ 0x3A));
        WorldGenTaiga2.lIIIllIlIIIIlI[1] = (0x58 ^ 0x5C);
        WorldGenTaiga2.lIIIllIlIIIIlI[2] = (0x25 ^ 0x58 ^ (0x50 ^ 0x2B));
        WorldGenTaiga2.lIIIllIlIIIIlI[3] = " ".length();
        WorldGenTaiga2.lIIIllIlIIIIlI[4] = "  ".length();
        WorldGenTaiga2.lIIIllIlIIIIlI[5] = (-(0xFFFFF675 & 0x5FDA) & (0xFFFFF75F & 0x5FEF));
        WorldGenTaiga2.lIIIllIlIIIIlI[6] = "   ".length();
    }
    
    static {
        llIIIlIIIIIllII();
        field_181645_a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE);
        field_181646_b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.SPRUCE).withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(WorldGenTaiga2.lIIIllIlIIIIlI[0] != 0));
    }
    
    private static boolean llIIIlIIIIlIlII(final int lllllllllllllIlIIIIIIlIlIIIlIlII, final int lllllllllllllIlIIIIIIlIlIIIlIIll) {
        return lllllllllllllIlIIIIIIlIlIIIlIlII == lllllllllllllIlIIIIIIlIlIIIlIIll;
    }
    
    private static boolean llIIIlIIIIIlllI(final int lllllllllllllIlIIIIIIlIlIIIIlIII, final int lllllllllllllIlIIIIIIlIlIIIIIlll) {
        return lllllllllllllIlIIIIIIlIlIIIIlIII <= lllllllllllllIlIIIIIIlIlIIIIIlll;
    }
    
    private static boolean llIIIlIIIIlIlIl(final int lllllllllllllIlIIIIIIlIIllllIlIl) {
        return lllllllllllllIlIIIIIIlIIllllIlIl <= 0;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIlIIIIIIlIlIlIIIllI, final Random lllllllllllllIlIIIIIIlIlIlIIIlIl, final BlockPos lllllllllllllIlIIIIIIlIlIlIIIlII) {
        final int lllllllllllllIlIIIIIIlIlIlIIIIll = lllllllllllllIlIIIIIIlIlIlIIIlIl.nextInt(WorldGenTaiga2.lIIIllIlIIIIlI[1]) + WorldGenTaiga2.lIIIllIlIIIIlI[2];
        final int lllllllllllllIlIIIIIIlIlIlIIIIlI = WorldGenTaiga2.lIIIllIlIIIIlI[3] + lllllllllllllIlIIIIIIlIlIlIIIlIl.nextInt(WorldGenTaiga2.lIIIllIlIIIIlI[4]);
        final int lllllllllllllIlIIIIIIlIlIlIIIIIl = lllllllllllllIlIIIIIIlIlIlIIIIll - lllllllllllllIlIIIIIIlIlIlIIIIlI;
        final int lllllllllllllIlIIIIIIlIlIlIIIIII = WorldGenTaiga2.lIIIllIlIIIIlI[4] + lllllllllllllIlIIIIIIlIlIlIIIlIl.nextInt(WorldGenTaiga2.lIIIllIlIIIIlI[4]);
        boolean lllllllllllllIlIIIIIIlIlIIllllll = WorldGenTaiga2.lIIIllIlIIIIlI[3] != 0;
        if (!llIIIlIIIIIllIl(lllllllllllllIlIIIIIIlIlIlIIIlII.getY(), WorldGenTaiga2.lIIIllIlIIIIlI[3]) || !llIIIlIIIIIlllI(lllllllllllllIlIIIIIIlIlIlIIIlII.getY() + lllllllllllllIlIIIIIIlIlIlIIIIll + WorldGenTaiga2.lIIIllIlIIIIlI[3], WorldGenTaiga2.lIIIllIlIIIIlI[5])) {
            return WorldGenTaiga2.lIIIllIlIIIIlI[0] != 0;
        }
        int lllllllllllllIlIIIIIIlIlIIlllllI = lllllllllllllIlIIIIIIlIlIlIIIlII.getY();
        "".length();
        if (((0x60 ^ 0x0) & ~(0x70 ^ 0x10)) != 0x0) {
            return ((0x1B ^ 0x50) & ~(0x6B ^ 0x20)) != 0x0;
        }
        while (llIIIlIIIIIlllI(lllllllllllllIlIIIIIIlIlIIlllllI, lllllllllllllIlIIIIIIlIlIlIIIlII.getY() + WorldGenTaiga2.lIIIllIlIIIIlI[3] + lllllllllllllIlIIIIIIlIlIlIIIIll) && !llIIIlIIIIlIIlI(lllllllllllllIlIIIIIIlIlIIllllll ? 1 : 0)) {
            int lllllllllllllIlIIIIIIlIlIIllllIl = WorldGenTaiga2.lIIIllIlIIIIlI[3];
            if (llIIIlIIIIIllll(lllllllllllllIlIIIIIIlIlIIlllllI - lllllllllllllIlIIIIIIlIlIlIIIlII.getY(), lllllllllllllIlIIIIIIlIlIlIIIIlI)) {
                lllllllllllllIlIIIIIIlIlIIllllIl = WorldGenTaiga2.lIIIllIlIIIIlI[0];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0x4A ^ 0x1E ^ (0xB6 ^ 0xC4)) & (202 + 145 - 322 + 202 ^ 104 + 150 - 77 + 20 ^ -" ".length())) != 0x0;
                }
            }
            else {
                lllllllllllllIlIIIIIIlIlIIllllIl = lllllllllllllIlIIIIIIlIlIlIIIIII;
            }
            final BlockPos.MutableBlockPos lllllllllllllIlIIIIIIlIlIIllllII = new BlockPos.MutableBlockPos();
            int lllllllllllllIlIIIIIIlIlIIlllIll = lllllllllllllIlIIIIIIlIlIlIIIlII.getX() - lllllllllllllIlIIIIIIlIlIIllllIl;
            "".length();
            if (((0xAE ^ 0xB5) & ~(0x96 ^ 0x8D)) != 0x0) {
                return ((0x7E ^ 0x20) & ~(0x5C ^ 0x2)) != 0x0;
            }
            while (llIIIlIIIIIlllI(lllllllllllllIlIIIIIIlIlIIlllIll, lllllllllllllIlIIIIIIlIlIlIIIlII.getX() + lllllllllllllIlIIIIIIlIlIIllllIl) && !llIIIlIIIIlIIlI(lllllllllllllIlIIIIIIlIlIIllllll ? 1 : 0)) {
                int lllllllllllllIlIIIIIIlIlIIlllIlI = lllllllllllllIlIIIIIIlIlIlIIIlII.getZ() - lllllllllllllIlIIIIIIlIlIIllllIl;
                "".length();
                if (null != null) {
                    return ((9 + 75 - 50 + 106 ^ 60 + 87 - 114 + 142) & (0xCD ^ 0x8C ^ (0xD5 ^ 0xB7) ^ -" ".length())) != 0x0;
                }
                while (llIIIlIIIIIlllI(lllllllllllllIlIIIIIIlIlIIlllIlI, lllllllllllllIlIIIIIIlIlIlIIIlII.getZ() + lllllllllllllIlIIIIIIlIlIIllllIl) && !llIIIlIIIIlIIlI(lllllllllllllIlIIIIIIlIlIIllllll ? 1 : 0)) {
                    if (llIIIlIIIIlIIII(lllllllllllllIlIIIIIIlIlIIlllllI) && llIIIlIIIIIllll(lllllllllllllIlIIIIIIlIlIIlllllI, WorldGenTaiga2.lIIIllIlIIIIlI[5])) {
                        final Block lllllllllllllIlIIIIIIlIlIIlllIIl = lllllllllllllIlIIIIIIlIlIlIIIllI.getBlockState(lllllllllllllIlIIIIIIlIlIIllllII.func_181079_c(lllllllllllllIlIIIIIIlIlIIlllIll, lllllllllllllIlIIIIIIlIlIIlllllI, lllllllllllllIlIIIIIIlIlIIlllIlI)).getBlock();
                        if (llIIIlIIIIlIIIl(lllllllllllllIlIIIIIIlIlIIlllIIl.getMaterial(), Material.air) && llIIIlIIIIlIIIl(lllllllllllllIlIIIIIIlIlIIlllIIl.getMaterial(), Material.leaves)) {
                            lllllllllllllIlIIIIIIlIlIIllllll = (WorldGenTaiga2.lIIIllIlIIIIlI[0] != 0);
                            "".length();
                            if (null != null) {
                                return ((110 + 45 - 19 + 80 ^ 106 + 110 - 100 + 79) & (94 + 92 - 97 + 44 ^ 82 + 117 - 155 + 114 ^ -" ".length())) != 0x0;
                            }
                        }
                    }
                    else {
                        lllllllllllllIlIIIIIIlIlIIllllll = (WorldGenTaiga2.lIIIllIlIIIIlI[0] != 0);
                    }
                    ++lllllllllllllIlIIIIIIlIlIIlllIlI;
                }
                ++lllllllllllllIlIIIIIIlIlIIlllIll;
            }
            ++lllllllllllllIlIIIIIIlIlIIlllllI;
        }
        if (llIIIlIIIIlIIlI(lllllllllllllIlIIIIIIlIlIIllllll ? 1 : 0)) {
            return WorldGenTaiga2.lIIIllIlIIIIlI[0] != 0;
        }
        final Block lllllllllllllIlIIIIIIlIlIIlllIII = lllllllllllllIlIIIIIIlIlIlIIIllI.getBlockState(lllllllllllllIlIIIIIIlIlIlIIIlII.down()).getBlock();
        if ((llIIIlIIIIlIIIl(lllllllllllllIlIIIIIIlIlIIlllIII, Blocks.grass) && llIIIlIIIIlIIIl(lllllllllllllIlIIIIIIlIlIIlllIII, Blocks.dirt) && !llIIIlIIIIlIIll(lllllllllllllIlIIIIIIlIlIIlllIII, Blocks.farmland)) || !llIIIlIIIIIllll(lllllllllllllIlIIIIIIlIlIlIIIlII.getY(), WorldGenTaiga2.lIIIllIlIIIIlI[5] - lllllllllllllIlIIIIIIlIlIlIIIIll - WorldGenTaiga2.lIIIllIlIIIIlI[3])) {
            return WorldGenTaiga2.lIIIllIlIIIIlI[0] != 0;
        }
        this.func_175921_a(lllllllllllllIlIIIIIIlIlIlIIIllI, lllllllllllllIlIIIIIIlIlIlIIIlII.down());
        int lllllllllllllIlIIIIIIlIlIIllIlll = lllllllllllllIlIIIIIIlIlIlIIIlIl.nextInt(WorldGenTaiga2.lIIIllIlIIIIlI[4]);
        int lllllllllllllIlIIIIIIlIlIIllIllI = WorldGenTaiga2.lIIIllIlIIIIlI[3];
        int lllllllllllllIlIIIIIIlIlIIllIlIl = WorldGenTaiga2.lIIIllIlIIIIlI[0];
        int lllllllllllllIlIIIIIIlIlIIllIlII = WorldGenTaiga2.lIIIllIlIIIIlI[0];
        "".length();
        if ((0xD8 ^ 0xB9 ^ (0xDF ^ 0xBB)) == 0x0) {
            return ((91 + 93 - 149 + 128 ^ 42 + 93 - 98 + 100) & (46 + 108 - 102 + 111 ^ 100 + 12 - 70 + 95 ^ -" ".length())) != 0x0;
        }
        while (!llIIIlIIIIlIllI(lllllllllllllIlIIIIIIlIlIIllIlII, lllllllllllllIlIIIIIIlIlIlIIIIIl)) {
            final int lllllllllllllIlIIIIIIlIlIIllIIll = lllllllllllllIlIIIIIIlIlIlIIIlII.getY() + lllllllllllllIlIIIIIIlIlIlIIIIll - lllllllllllllIlIIIIIIlIlIIllIlII;
            int lllllllllllllIlIIIIIIlIlIIllIIlI = lllllllllllllIlIIIIIIlIlIlIIIlII.getX() - lllllllllllllIlIIIIIIlIlIIllIlll;
            "".length();
            if ("  ".length() > "   ".length()) {
                return ((100 + 125 - 189 + 177 ^ 30 + 152 - 115 + 125) & (77 + 108 - 73 + 61 ^ 38 + 151 - 39 + 34 ^ -" ".length())) != 0x0;
            }
            while (!llIIIlIIIIlIllI(lllllllllllllIlIIIIIIlIlIIllIIlI, lllllllllllllIlIIIIIIlIlIlIIIlII.getX() + lllllllllllllIlIIIIIIlIlIIllIlll)) {
                final int lllllllllllllIlIIIIIIlIlIIllIIIl = lllllllllllllIlIIIIIIlIlIIllIIlI - lllllllllllllIlIIIIIIlIlIlIIIlII.getX();
                int lllllllllllllIlIIIIIIlIlIIllIIII = lllllllllllllIlIIIIIIlIlIlIIIlII.getZ() - lllllllllllllIlIIIIIIlIlIIllIlll;
                "".length();
                if (((0x3B ^ 0x75) & ~(0x15 ^ 0x5B)) < 0) {
                    return ((0x1B ^ 0x53) & ~(0xD ^ 0x45)) != 0x0;
                }
                while (!llIIIlIIIIlIllI(lllllllllllllIlIIIIIIlIlIIllIIII, lllllllllllllIlIIIIIIlIlIlIIIlII.getZ() + lllllllllllllIlIIIIIIlIlIIllIlll)) {
                    final int lllllllllllllIlIIIIIIlIlIIlIllll = lllllllllllllIlIIIIIIlIlIIllIIII - lllllllllllllIlIIIIIIlIlIlIIIlII.getZ();
                    if (!llIIIlIIIIlIlII(Math.abs(lllllllllllllIlIIIIIIlIlIIllIIIl), lllllllllllllIlIIIIIIlIlIIllIlll) || !llIIIlIIIIlIlII(Math.abs(lllllllllllllIlIIIIIIlIlIIlIllll), lllllllllllllIlIIIIIIlIlIIllIlll) || llIIIlIIIIlIlIl(lllllllllllllIlIIIIIIlIlIIllIlll)) {
                        final BlockPos lllllllllllllIlIIIIIIlIlIIlIlllI = new BlockPos(lllllllllllllIlIIIIIIlIlIIllIIlI, lllllllllllllIlIIIIIIlIlIIllIIll, lllllllllllllIlIIIIIIlIlIIllIIII);
                        if (llIIIlIIIIlIIlI(lllllllllllllIlIIIIIIlIlIlIIIllI.getBlockState(lllllllllllllIlIIIIIIlIlIIlIlllI).getBlock().isFullBlock() ? 1 : 0)) {
                            this.setBlockAndNotifyAdequately(lllllllllllllIlIIIIIIlIlIlIIIllI, lllllllllllllIlIIIIIIlIlIIlIlllI, WorldGenTaiga2.field_181646_b);
                        }
                    }
                    ++lllllllllllllIlIIIIIIlIlIIllIIII;
                }
                ++lllllllllllllIlIIIIIIlIlIIllIIlI;
            }
            if (llIIIlIIIIIllIl(lllllllllllllIlIIIIIIlIlIIllIlll, lllllllllllllIlIIIIIIlIlIIllIllI)) {
                lllllllllllllIlIIIIIIlIlIIllIlll = lllllllllllllIlIIIIIIlIlIIllIlIl;
                lllllllllllllIlIIIIIIlIlIIllIlIl = WorldGenTaiga2.lIIIllIlIIIIlI[3];
                if (llIIIlIIIIlIllI(++lllllllllllllIlIIIIIIlIlIIllIllI, lllllllllllllIlIIIIIIlIlIlIIIIII)) {
                    lllllllllllllIlIIIIIIlIlIIllIllI = lllllllllllllIlIIIIIIlIlIlIIIIII;
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return ((0x43 ^ 0x21 ^ (0x20 ^ 0x66)) & (138 + 12 - 69 + 74 ^ 23 + 79 + 55 + 34 ^ -" ".length())) != 0x0;
                    }
                }
            }
            else {
                ++lllllllllllllIlIIIIIIlIlIIllIlll;
            }
            ++lllllllllllllIlIIIIIIlIlIIllIlII;
        }
        final int lllllllllllllIlIIIIIIlIlIIlIllIl = lllllllllllllIlIIIIIIlIlIlIIIlIl.nextInt(WorldGenTaiga2.lIIIllIlIIIIlI[6]);
        int lllllllllllllIlIIIIIIlIlIIlIllII = WorldGenTaiga2.lIIIllIlIIIIlI[0];
        "".length();
        if ("  ".length() < 0) {
            return ((0x88 ^ 0x87 ^ "  ".length()) & (0xD9 ^ 0x95 ^ (0x29 ^ 0x68) ^ -" ".length())) != 0x0;
        }
        while (!llIIIlIIIIIllIl(lllllllllllllIlIIIIIIlIlIIlIllII, lllllllllllllIlIIIIIIlIlIlIIIIll - lllllllllllllIlIIIIIIlIlIIlIllIl)) {
            final Block lllllllllllllIlIIIIIIlIlIIlIlIll = lllllllllllllIlIIIIIIlIlIlIIIllI.getBlockState(lllllllllllllIlIIIIIIlIlIlIIIlII.up(lllllllllllllIlIIIIIIlIlIIlIllII)).getBlock();
            if (!llIIIlIIIIlIIIl(lllllllllllllIlIIIIIIlIlIIlIlIll.getMaterial(), Material.air) || llIIIlIIIIlIIll(lllllllllllllIlIIIIIIlIlIIlIlIll.getMaterial(), Material.leaves)) {
                this.setBlockAndNotifyAdequately(lllllllllllllIlIIIIIIlIlIlIIIllI, lllllllllllllIlIIIIIIlIlIlIIIlII.up(lllllllllllllIlIIIIIIlIlIIlIllII), WorldGenTaiga2.field_181645_a);
            }
            ++lllllllllllllIlIIIIIIlIlIIlIllII;
        }
        return WorldGenTaiga2.lIIIllIlIIIIlI[3] != 0;
    }
    
    private static boolean llIIIlIIIIlIllI(final int lllllllllllllIlIIIIIIlIlIIIIIlII, final int lllllllllllllIlIIIIIIlIlIIIIIIll) {
        return lllllllllllllIlIIIIIIlIlIIIIIlII > lllllllllllllIlIIIIIIlIlIIIIIIll;
    }
    
    private static boolean llIIIlIIIIIllIl(final int lllllllllllllIlIIIIIIlIlIIIlIIII, final int lllllllllllllIlIIIIIIlIlIIIIllll) {
        return lllllllllllllIlIIIIIIlIlIIIlIIII >= lllllllllllllIlIIIIIIlIlIIIIllll;
    }
    
    private static boolean llIIIlIIIIlIIII(final int lllllllllllllIlIIIIIIlIIllllIlll) {
        return lllllllllllllIlIIIIIIlIIllllIlll >= 0;
    }
    
    private static boolean llIIIlIIIIIllll(final int lllllllllllllIlIIIIIIlIlIIIIllII, final int lllllllllllllIlIIIIIIlIlIIIIlIll) {
        return lllllllllllllIlIIIIIIlIlIIIIllII < lllllllllllllIlIIIIIIlIlIIIIlIll;
    }
    
    private static boolean llIIIlIIIIlIIll(final Object lllllllllllllIlIIIIIIlIIllllllII, final Object lllllllllllllIlIIIIIIlIIlllllIll) {
        return lllllllllllllIlIIIIIIlIIllllllII == lllllllllllllIlIIIIIIlIIlllllIll;
    }
    
    private static boolean llIIIlIIIIlIIlI(final int lllllllllllllIlIIIIIIlIIlllllIIl) {
        return lllllllllllllIlIIIIIIlIIlllllIIl == 0;
    }
    
    public WorldGenTaiga2(final boolean lllllllllllllIlIIIIIIlIlIlIlllII) {
        super(lllllllllllllIlIIIIIIlIlIlIlllII);
    }
    
    private static boolean llIIIlIIIIlIIIl(final Object lllllllllllllIlIIIIIIlIlIIIIIIII, final Object lllllllllllllIlIIIIIIlIIllllllll) {
        return lllllllllllllIlIIIIIIlIlIIIIIIII != lllllllllllllIlIIIIIIlIIllllllll;
    }
}
