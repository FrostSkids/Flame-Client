// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

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

public class WorldGenForest extends WorldGenAbstractTree
{
    private static final /* synthetic */ IBlockState field_181630_b;
    private /* synthetic */ boolean useExtraRandomHeight;
    private static final /* synthetic */ int[] llIlIIIIlIlIlI;
    private static final /* synthetic */ IBlockState field_181629_a;
    
    private static boolean lIIlIIIlIllIIIIl(final int llllllllllllIllIllIlIllllIIllIll) {
        return llllllllllllIllIllIlIllllIIllIll == 0;
    }
    
    public WorldGenForest(final boolean llllllllllllIllIllIlIlllllllIllI, final boolean llllllllllllIllIllIlIlllllllIlIl) {
        super(llllllllllllIllIllIlIlllllllIllI);
        this.useExtraRandomHeight = llllllllllllIllIllIlIlllllllIlIl;
    }
    
    private static boolean lIIlIIIlIllIIlII(final Object llllllllllllIllIllIlIllllIlIIIII, final Object llllllllllllIllIllIlIllllIIlllll) {
        return llllllllllllIllIllIlIllllIlIIIII == llllllllllllIllIllIlIllllIIlllll;
    }
    
    private static boolean lIIlIIIlIlIllllI(final int llllllllllllIllIllIlIllllIlllIII, final int llllllllllllIllIllIlIllllIllIlll) {
        return llllllllllllIllIllIlIllllIlllIII == llllllllllllIllIllIlIllllIllIlll;
    }
    
    @Override
    public boolean generate(final World llllllllllllIllIllIlIllllllIIIII, final Random llllllllllllIllIllIlIlllllIlllll, final BlockPos llllllllllllIllIllIlIlllllIllllI) {
        int llllllllllllIllIllIlIlllllIlllIl = llllllllllllIllIllIlIlllllIlllll.nextInt(WorldGenForest.llIlIIIIlIlIlI[1]) + WorldGenForest.llIlIIIIlIlIlI[2];
        if (lIIlIIIlIlIllIll(this.useExtraRandomHeight ? 1 : 0)) {
            llllllllllllIllIllIlIlllllIlllIl += llllllllllllIllIllIlIlllllIlllll.nextInt(WorldGenForest.llIlIIIIlIlIlI[3]);
        }
        boolean llllllllllllIllIllIlIlllllIlllII = WorldGenForest.llIlIIIIlIlIlI[4] != 0;
        if (!lIIlIIIlIlIlllII(llllllllllllIllIllIlIlllllIllllI.getY(), WorldGenForest.llIlIIIIlIlIlI[4]) || !lIIlIIIlIlIlllIl(llllllllllllIllIllIlIlllllIllllI.getY() + llllllllllllIllIllIlIlllllIlllIl + WorldGenForest.llIlIIIIlIlIlI[4], WorldGenForest.llIlIIIIlIlIlI[5])) {
            return WorldGenForest.llIlIIIIlIlIlI[0] != 0;
        }
        int llllllllllllIllIllIlIlllllIllIll = llllllllllllIllIllIlIlllllIllllI.getY();
        "".length();
        if ("   ".length() <= ((0x25 ^ 0x31) & ~(0x6D ^ 0x79))) {
            return ((0xFA ^ 0xBA) & ~(0x1 ^ 0x41)) != 0x0;
        }
        while (!lIIlIIIlIllIIIlI(llllllllllllIllIllIlIlllllIllIll, llllllllllllIllIllIlIlllllIllllI.getY() + WorldGenForest.llIlIIIIlIlIlI[4] + llllllllllllIllIllIlIlllllIlllIl)) {
            int llllllllllllIllIllIlIlllllIllIlI = WorldGenForest.llIlIIIIlIlIlI[4];
            if (lIIlIIIlIlIllllI(llllllllllllIllIllIlIlllllIllIll, llllllllllllIllIllIlIlllllIllllI.getY())) {
                llllllllllllIllIllIlIlllllIllIlI = WorldGenForest.llIlIIIIlIlIlI[0];
            }
            if (lIIlIIIlIlIlllII(llllllllllllIllIllIlIlllllIllIll, llllllllllllIllIllIlIlllllIllllI.getY() + WorldGenForest.llIlIIIIlIlIlI[4] + llllllllllllIllIllIlIlllllIlllIl - WorldGenForest.llIlIIIIlIlIlI[6])) {
                llllllllllllIllIllIlIlllllIllIlI = WorldGenForest.llIlIIIIlIlIlI[6];
            }
            final BlockPos.MutableBlockPos llllllllllllIllIllIlIlllllIllIIl = new BlockPos.MutableBlockPos();
            int llllllllllllIllIllIlIlllllIllIII = llllllllllllIllIllIlIlllllIllllI.getX() - llllllllllllIllIllIlIlllllIllIlI;
            "".length();
            if ((0x1A ^ 0x29 ^ (0x73 ^ 0x44)) <= 0) {
                return ((0xA3 ^ 0xC5 ^ (0x60 ^ 0x36)) & (0x54 ^ 0x13 ^ (0x54 ^ 0x23) ^ -" ".length())) != 0x0;
            }
            while (lIIlIIIlIlIlllIl(llllllllllllIllIllIlIlllllIllIII, llllllllllllIllIllIlIlllllIllllI.getX() + llllllllllllIllIllIlIlllllIllIlI) && !lIIlIIIlIllIIIIl(llllllllllllIllIllIlIlllllIlllII ? 1 : 0)) {
                int llllllllllllIllIllIlIlllllIlIlll = llllllllllllIllIllIlIlllllIllllI.getZ() - llllllllllllIllIllIlIlllllIllIlI;
                "".length();
                if (((0xB6 ^ 0x86) & ~(0xB0 ^ 0x80)) != 0x0) {
                    return ((0x52 ^ 0x16) & ~(0x75 ^ 0x31)) != 0x0;
                }
                while (lIIlIIIlIlIlllIl(llllllllllllIllIllIlIlllllIlIlll, llllllllllllIllIllIlIlllllIllllI.getZ() + llllllllllllIllIllIlIlllllIllIlI) && !lIIlIIIlIllIIIIl(llllllllllllIllIllIlIlllllIlllII ? 1 : 0)) {
                    if (lIIlIIIlIlIlllll(llllllllllllIllIllIlIlllllIllIll) && lIIlIIIlIllIIIII(llllllllllllIllIllIlIlllllIllIll, WorldGenForest.llIlIIIIlIlIlI[5])) {
                        if (lIIlIIIlIllIIIIl(this.func_150523_a(llllllllllllIllIllIlIllllllIIIII.getBlockState(llllllllllllIllIllIlIlllllIllIIl.func_181079_c(llllllllllllIllIllIlIlllllIllIII, llllllllllllIllIllIlIlllllIllIll, llllllllllllIllIllIlIlllllIlIlll)).getBlock()) ? 1 : 0)) {
                            llllllllllllIllIllIlIlllllIlllII = (WorldGenForest.llIlIIIIlIlIlI[0] != 0);
                            "".length();
                            if (-(0x1C ^ 0x19) >= 0) {
                                return ((0x21 ^ 0x41) & ~(0x42 ^ 0x22)) != 0x0;
                            }
                        }
                    }
                    else {
                        llllllllllllIllIllIlIlllllIlllII = (WorldGenForest.llIlIIIIlIlIlI[0] != 0);
                    }
                    ++llllllllllllIllIllIlIlllllIlIlll;
                }
                ++llllllllllllIllIllIlIlllllIllIII;
            }
            ++llllllllllllIllIllIlIlllllIllIll;
        }
        if (lIIlIIIlIllIIIIl(llllllllllllIllIllIlIlllllIlllII ? 1 : 0)) {
            return WorldGenForest.llIlIIIIlIlIlI[0] != 0;
        }
        final Block llllllllllllIllIllIlIlllllIlIllI = llllllllllllIllIllIlIllllllIIIII.getBlockState(llllllllllllIllIllIlIlllllIllllI.down()).getBlock();
        if ((lIIlIIIlIllIIIll(llllllllllllIllIllIlIlllllIlIllI, Blocks.grass) && lIIlIIIlIllIIIll(llllllllllllIllIllIlIlllllIlIllI, Blocks.dirt) && !lIIlIIIlIllIIlII(llllllllllllIllIllIlIlllllIlIllI, Blocks.farmland)) || !lIIlIIIlIllIIIII(llllllllllllIllIllIlIlllllIllllI.getY(), WorldGenForest.llIlIIIIlIlIlI[5] - llllllllllllIllIllIlIlllllIlllIl - WorldGenForest.llIlIIIIlIlIlI[4])) {
            return WorldGenForest.llIlIIIIlIlIlI[0] != 0;
        }
        this.func_175921_a(llllllllllllIllIllIlIllllllIIIII, llllllllllllIllIllIlIlllllIllllI.down());
        int llllllllllllIllIllIlIlllllIlIlIl = llllllllllllIllIllIlIlllllIllllI.getY() - WorldGenForest.llIlIIIIlIlIlI[1] + llllllllllllIllIllIlIlllllIlllIl;
        "".length();
        if ((0xC1 ^ 0xC4) == 0x0) {
            return ((0x36 ^ 0x56) & ~(0xFA ^ 0x9A)) != 0x0;
        }
        while (!lIIlIIIlIllIIIlI(llllllllllllIllIllIlIlllllIlIlIl, llllllllllllIllIllIlIlllllIllllI.getY() + llllllllllllIllIllIlIlllllIlllIl)) {
            final int llllllllllllIllIllIlIlllllIlIlII = llllllllllllIllIllIlIlllllIlIlIl - (llllllllllllIllIllIlIlllllIllllI.getY() + llllllllllllIllIllIlIlllllIlllIl);
            final int llllllllllllIllIllIlIlllllIlIIll = WorldGenForest.llIlIIIIlIlIlI[4] - llllllllllllIllIllIlIlllllIlIlII / WorldGenForest.llIlIIIIlIlIlI[6];
            int llllllllllllIllIllIlIlllllIlIIlI = llllllllllllIllIllIlIlllllIllllI.getX() - llllllllllllIllIllIlIlllllIlIIll;
            "".length();
            if (((0x17 ^ 0x62 ^ (0x45 ^ 0x75)) & (63 + 34 - 94 + 216 ^ 43 + 109 - 127 + 133 ^ -" ".length())) != 0x0) {
                return ((111 + 141 - 97 + 29 ^ 79 + 119 - 132 + 110) & (0x6E ^ 0x46 ^ (0x90 ^ 0xB0) ^ -" ".length())) != 0x0;
            }
            while (!lIIlIIIlIllIIIlI(llllllllllllIllIllIlIlllllIlIIlI, llllllllllllIllIllIlIlllllIllllI.getX() + llllllllllllIllIllIlIlllllIlIIll)) {
                final int llllllllllllIllIllIlIlllllIlIIIl = llllllllllllIllIllIlIlllllIlIIlI - llllllllllllIllIllIlIlllllIllllI.getX();
                int llllllllllllIllIllIlIlllllIlIIII = llllllllllllIllIllIlIlllllIllllI.getZ() - llllllllllllIllIllIlIlllllIlIIll;
                "".length();
                if ("  ".length() <= " ".length()) {
                    return ((151 + 141 - 255 + 147 ^ 165 + 161 - 229 + 81) & (0xE3 ^ 0xAD ^ (0x27 ^ 0x63) ^ -" ".length())) != 0x0;
                }
                while (!lIIlIIIlIllIIIlI(llllllllllllIllIllIlIlllllIlIIII, llllllllllllIllIllIlIlllllIllllI.getZ() + llllllllllllIllIllIlIlllllIlIIll)) {
                    final int llllllllllllIllIllIlIlllllIIllll = llllllllllllIllIllIlIlllllIlIIII - llllllllllllIllIllIlIlllllIllllI.getZ();
                    if (!lIIlIIIlIlIllllI(Math.abs(llllllllllllIllIllIlIlllllIlIIIl), llllllllllllIllIllIlIlllllIlIIll) || !lIIlIIIlIlIllllI(Math.abs(llllllllllllIllIllIlIlllllIIllll), llllllllllllIllIllIlIlllllIlIIll) || (lIIlIIIlIlIllIll(llllllllllllIllIllIlIlllllIlllll.nextInt(WorldGenForest.llIlIIIIlIlIlI[6])) && lIIlIIIlIlIllIll(llllllllllllIllIllIlIlllllIlIlII))) {
                        final BlockPos llllllllllllIllIllIlIlllllIIlllI = new BlockPos(llllllllllllIllIllIlIlllllIlIIlI, llllllllllllIllIllIlIlllllIlIlIl, llllllllllllIllIllIlIlllllIlIIII);
                        final Block llllllllllllIllIllIlIlllllIIllIl = llllllllllllIllIllIlIllllllIIIII.getBlockState(llllllllllllIllIllIlIlllllIIlllI).getBlock();
                        if (!lIIlIIIlIllIIIll(llllllllllllIllIllIlIlllllIIllIl.getMaterial(), Material.air) || lIIlIIIlIllIIlII(llllllllllllIllIllIlIlllllIIllIl.getMaterial(), Material.leaves)) {
                            this.setBlockAndNotifyAdequately(llllllllllllIllIllIlIllllllIIIII, llllllllllllIllIllIlIlllllIIlllI, WorldGenForest.field_181630_b);
                        }
                    }
                    ++llllllllllllIllIllIlIlllllIlIIII;
                }
                ++llllllllllllIllIllIlIlllllIlIIlI;
            }
            ++llllllllllllIllIllIlIlllllIlIlIl;
        }
        int llllllllllllIllIllIlIlllllIIllII = WorldGenForest.llIlIIIIlIlIlI[0];
        "".length();
        if (((0xA2 ^ 0x8D) & ~(0x11 ^ 0x3E)) != 0x0) {
            return ((0xF8 ^ 0xA2) & ~(0xF1 ^ 0xAB)) != 0x0;
        }
        while (!lIIlIIIlIlIlllII(llllllllllllIllIllIlIlllllIIllII, llllllllllllIllIllIlIlllllIlllIl)) {
            final Block llllllllllllIllIllIlIlllllIIlIll = llllllllllllIllIllIlIllllllIIIII.getBlockState(llllllllllllIllIllIlIlllllIllllI.up(llllllllllllIllIllIlIlllllIIllII)).getBlock();
            if (!lIIlIIIlIllIIIll(llllllllllllIllIllIlIlllllIIlIll.getMaterial(), Material.air) || lIIlIIIlIllIIlII(llllllllllllIllIllIlIlllllIIlIll.getMaterial(), Material.leaves)) {
                this.setBlockAndNotifyAdequately(llllllllllllIllIllIlIllllllIIIII, llllllllllllIllIllIlIlllllIllllI.up(llllllllllllIllIllIlIlllllIIllII), WorldGenForest.field_181629_a);
            }
            ++llllllllllllIllIllIlIlllllIIllII;
        }
        return WorldGenForest.llIlIIIIlIlIlI[4] != 0;
    }
    
    private static boolean lIIlIIIlIllIIIII(final int llllllllllllIllIllIlIllllIllIIII, final int llllllllllllIllIllIlIllllIlIllll) {
        return llllllllllllIllIllIlIllllIllIIII < llllllllllllIllIllIlIllllIlIllll;
    }
    
    private static boolean lIIlIIIlIlIlllIl(final int llllllllllllIllIllIlIllllIlIllII, final int llllllllllllIllIllIlIllllIlIlIll) {
        return llllllllllllIllIllIlIllllIlIllII <= llllllllllllIllIllIlIllllIlIlIll;
    }
    
    private static boolean lIIlIIIlIlIlllII(final int llllllllllllIllIllIlIllllIllIlII, final int llllllllllllIllIllIlIllllIllIIll) {
        return llllllllllllIllIllIlIllllIllIlII >= llllllllllllIllIllIlIllllIllIIll;
    }
    
    private static void lIIlIIIlIlIllIIl() {
        (llIlIIIIlIlIlI = new int[7])[0] = ("   ".length() & ~"   ".length());
        WorldGenForest.llIlIIIIlIlIlI[1] = "   ".length();
        WorldGenForest.llIlIIIIlIlIlI[2] = (0x4B ^ 0x4E);
        WorldGenForest.llIlIIIIlIlIlI[3] = (0x10 ^ 0x3A ^ (0x77 ^ 0x5A));
        WorldGenForest.llIlIIIIlIlIlI[4] = " ".length();
        WorldGenForest.llIlIIIIlIlIlI[5] = (-(0xFFFFA79A & 0x7E7F) & (0xFFFFE7FD & 0x3F1B));
        WorldGenForest.llIlIIIIlIlIlI[6] = "  ".length();
    }
    
    private static boolean lIIlIIIlIlIlllll(final int llllllllllllIllIllIlIllllIIllIIl) {
        return llllllllllllIllIllIlIllllIIllIIl >= 0;
    }
    
    private static boolean lIIlIIIlIllIIIlI(final int llllllllllllIllIllIlIllllIlIlIII, final int llllllllllllIllIllIlIllllIlIIlll) {
        return llllllllllllIllIllIlIllllIlIlIII > llllllllllllIllIllIlIllllIlIIlll;
    }
    
    private static boolean lIIlIIIlIlIllIll(final int llllllllllllIllIllIlIllllIIlllIl) {
        return llllllllllllIllIllIlIllllIIlllIl != 0;
    }
    
    private static boolean lIIlIIIlIllIIIll(final Object llllllllllllIllIllIlIllllIlIIlII, final Object llllllllllllIllIllIlIllllIlIIIll) {
        return llllllllllllIllIllIlIllllIlIIlII != llllllllllllIllIllIlIllllIlIIIll;
    }
    
    static {
        lIIlIIIlIlIllIIl();
        field_181629_a = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.BIRCH);
        field_181630_b = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.BIRCH).withProperty((IProperty<Comparable>)BlockOldLeaf.CHECK_DECAY, (boolean)(WorldGenForest.llIlIIIIlIlIlI[0] != 0));
    }
}
