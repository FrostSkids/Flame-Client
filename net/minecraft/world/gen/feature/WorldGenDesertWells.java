// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import java.util.Iterator;
import net.minecraft.util.Vec3i;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import com.google.common.base.Predicate;
import net.minecraft.block.properties.IProperty;
import com.google.common.base.Predicates;
import net.minecraft.block.BlockSand;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.pattern.BlockStateHelper;
import net.minecraft.block.state.IBlockState;

public class WorldGenDesertWells extends WorldGenerator
{
    private final /* synthetic */ IBlockState field_175912_c;
    private static final /* synthetic */ int[] llIIIllIllIllI;
    private final /* synthetic */ IBlockState field_175910_d;
    private final /* synthetic */ IBlockState field_175911_b;
    private static final /* synthetic */ BlockStateHelper field_175913_a;
    
    private static boolean lIIIlIlIlIIlIlll(final int llllllllllllIlllIlIIIlllllIlIlIl, final int llllllllllllIlllIlIIIlllllIlIlII) {
        return llllllllllllIlllIlIIIlllllIlIlIl != llllllllllllIlllIlIIIlllllIlIlII;
    }
    
    static {
        lIIIlIlIlIIlIIII();
        field_175913_a = BlockStateHelper.forBlock(Blocks.sand).where(BlockSand.VARIANT, (com.google.common.base.Predicate<? extends BlockSand.EnumType>)Predicates.equalTo((Object)BlockSand.EnumType.SAND));
    }
    
    private static boolean lIIIlIlIlIIlIlII(final int llllllllllllIlllIlIIIlllllIllIlI) {
        return llllllllllllIlllIlIIIlllllIllIlI == 0;
    }
    
    private static boolean lIIIlIlIlIIlIIll(final int llllllllllllIlllIlIIIllllllIIIll, final int llllllllllllIlllIlIIIllllllIIIlI) {
        return llllllllllllIlllIlIIIllllllIIIll <= llllllllllllIlllIlIIIllllllIIIlI;
    }
    
    private static boolean lIIIlIlIlIIlIlIl(final int llllllllllllIlllIlIIIlllllIlllll, final int llllllllllllIlllIlIIIlllllIllllI) {
        return llllllllllllIlllIlIIIlllllIlllll > llllllllllllIlllIlIIIlllllIllllI;
    }
    
    private static void lIIIlIlIlIIlIIII() {
        (llIIIllIllIllI = new int[7])[0] = "  ".length();
        WorldGenDesertWells.llIIIllIllIllI[1] = ((116 + 30 - 42 + 134 ^ 72 + 73 - 61 + 110) & (124 + 139 - 167 + 86 ^ 67 + 97 - 22 + 12 ^ -" ".length()));
        WorldGenDesertWells.llIIIllIllIllI[2] = -"  ".length();
        WorldGenDesertWells.llIIIllIllIllI[3] = -" ".length();
        WorldGenDesertWells.llIIIllIllIllI[4] = " ".length();
        WorldGenDesertWells.llIIIllIllIllI[5] = (0x5F ^ 0x5B);
        WorldGenDesertWells.llIIIllIllIllI[6] = "   ".length();
    }
    
    private static boolean lIIIlIlIlIIlIIlI(final int llllllllllllIlllIlIIIlllllIlllII) {
        return llllllllllllIlllIlIIIlllllIlllII != 0;
    }
    
    private static boolean lIIIlIlIlIIlIllI(final int llllllllllllIlllIlIIIlllllIllIII) {
        return llllllllllllIlllIlIIIlllllIllIII > 0;
    }
    
    @Override
    public boolean generate(final World llllllllllllIlllIlIIIllllllIlllI, final Random llllllllllllIlllIlIIIlllllllllII, BlockPos llllllllllllIlllIlIIIllllllIllIl) {
        "".length();
        if ("   ".length() <= -" ".length()) {
            return ((119 + 20 - 49 + 119 ^ 34 + 24 + 57 + 17) & (0x69 ^ 0x5B ^ (0x66 ^ 0x1) ^ -" ".length())) != 0x0;
        }
        while (lIIIlIlIlIIlIIlI(llllllllllllIlllIlIIIllllllIlllI.isAirBlock((BlockPos)llllllllllllIlllIlIIIllllllIllIl) ? 1 : 0) && !lIIIlIlIlIIlIIll(((Vec3i)llllllllllllIlllIlIIIllllllIllIl).getY(), WorldGenDesertWells.llIIIllIllIllI[0])) {
            llllllllllllIlllIlIIIllllllIllIl = ((BlockPos)llllllllllllIlllIlIIIllllllIllIl).down();
        }
        if (lIIIlIlIlIIlIlII(WorldGenDesertWells.field_175913_a.apply(llllllllllllIlllIlIIIllllllIlllI.getBlockState((BlockPos)llllllllllllIlllIlIIIllllllIllIl)) ? 1 : 0)) {
            return WorldGenDesertWells.llIIIllIllIllI[1] != 0;
        }
        int llllllllllllIlllIlIIIllllllllIlI = WorldGenDesertWells.llIIIllIllIllI[2];
        "".length();
        if (null != null) {
            return ((0x1D ^ 0xA ^ "  ".length()) & (54 + 6 - 51 + 120 ^ 43 + 31 + 18 + 56 ^ -" ".length())) != 0x0;
        }
        while (!lIIIlIlIlIIlIlIl(llllllllllllIlllIlIIIllllllllIlI, WorldGenDesertWells.llIIIllIllIllI[0])) {
            int llllllllllllIlllIlIIIllllllllIIl = WorldGenDesertWells.llIIIllIllIllI[2];
            "".length();
            if (null != null) {
                return ((0xCA ^ 0x81) & ~(0xDF ^ 0x94)) != 0x0;
            }
            while (!lIIIlIlIlIIlIlIl(llllllllllllIlllIlIIIllllllllIIl, WorldGenDesertWells.llIIIllIllIllI[0])) {
                if (lIIIlIlIlIIlIIlI(llllllllllllIlllIlIIIllllllIlllI.isAirBlock(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(llllllllllllIlllIlIIIllllllllIlI, WorldGenDesertWells.llIIIllIllIllI[3], llllllllllllIlllIlIIIllllllllIIl)) ? 1 : 0) && lIIIlIlIlIIlIIlI(llllllllllllIlllIlIIIllllllIlllI.isAirBlock(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(llllllllllllIlllIlIIIllllllllIlI, WorldGenDesertWells.llIIIllIllIllI[2], llllllllllllIlllIlIIIllllllllIIl)) ? 1 : 0)) {
                    return WorldGenDesertWells.llIIIllIllIllI[1] != 0;
                }
                ++llllllllllllIlllIlIIIllllllllIIl;
            }
            ++llllllllllllIlllIlIIIllllllllIlI;
        }
        int llllllllllllIlllIlIIIllllllllIII = WorldGenDesertWells.llIIIllIllIllI[3];
        "".length();
        if (null != null) {
            return ((117 + 12 - 124 + 138 ^ 41 + 119 - 73 + 63) & (0x3A ^ 0x72 ^ (0x59 ^ 0x8) ^ -" ".length())) != 0x0;
        }
        while (!lIIIlIlIlIIlIllI(llllllllllllIlllIlIIIllllllllIII)) {
            int llllllllllllIlllIlIIIlllllllIlll = WorldGenDesertWells.llIIIllIllIllI[2];
            "".length();
            if ("   ".length() == 0) {
                return ((0x6E ^ 0x27 ^ (0x80 ^ 0x96)) & (0x7F ^ 0x60 ^ (0x44 ^ 0x4) ^ -" ".length())) != 0x0;
            }
            while (!lIIIlIlIlIIlIlIl(llllllllllllIlllIlIIIlllllllIlll, WorldGenDesertWells.llIIIllIllIllI[0])) {
                int llllllllllllIlllIlIIIlllllllIllI = WorldGenDesertWells.llIIIllIllIllI[2];
                "".length();
                if (-" ".length() >= 0) {
                    return ((0xBF ^ 0xBA) & ~(0xB7 ^ 0xB2)) != 0x0;
                }
                while (!lIIIlIlIlIIlIlIl(llllllllllllIlllIlIIIlllllllIllI, WorldGenDesertWells.llIIIllIllIllI[0])) {
                    llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(llllllllllllIlllIlIIIlllllllIlll, llllllllllllIlllIlIIIllllllllIII, llllllllllllIlllIlIIIlllllllIllI), this.field_175912_c, WorldGenDesertWells.llIIIllIllIllI[0]);
                    "".length();
                    ++llllllllllllIlllIlIIIlllllllIllI;
                }
                ++llllllllllllIlllIlIIIlllllllIlll;
            }
            ++llllllllllllIlllIlIIIllllllllIII;
        }
        llllllllllllIlllIlIIIllllllIlllI.setBlockState((BlockPos)llllllllllllIlllIlIIIllllllIllIl, this.field_175910_d, WorldGenDesertWells.llIIIllIllIllI[0]);
        "".length();
        final float llllllllllllIlllIlIIIllllllIlIll = (float)EnumFacing.Plane.HORIZONTAL.iterator();
        "".length();
        if (" ".length() != " ".length()) {
            return ((0xC2 ^ 0x90) & ~(0x45 ^ 0x17)) != 0x0;
        }
        while (!lIIIlIlIlIIlIlII(((Iterator)llllllllllllIlllIlIIIllllllIlIll).hasNext() ? 1 : 0)) {
            final EnumFacing llllllllllllIlllIlIIIlllllllIlIl = ((Iterator<EnumFacing>)llllllllllllIlllIlIIIllllllIlIll).next();
            llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).offset(llllllllllllIlllIlIIIlllllllIlIl), this.field_175910_d, WorldGenDesertWells.llIIIllIllIllI[0]);
            "".length();
        }
        int llllllllllllIlllIlIIIlllllllIlII = WorldGenDesertWells.llIIIllIllIllI[2];
        "".length();
        if (((0x7 ^ 0x1A) & ~(0x15 ^ 0x8) & ~((0x4F ^ 0x14) & ~(0x10 ^ 0x4B))) != 0x0) {
            return ((0x28 ^ 0x65) & ~(0x73 ^ 0x3E)) != 0x0;
        }
        while (!lIIIlIlIlIIlIlIl(llllllllllllIlllIlIIIlllllllIlII, WorldGenDesertWells.llIIIllIllIllI[0])) {
            int llllllllllllIlllIlIIIlllllllIIll = WorldGenDesertWells.llIIIllIllIllI[2];
            "".length();
            if (null != null) {
                return ((0x67 ^ 0x7C) & ~(0xAF ^ 0xB4)) != 0x0;
            }
            while (!lIIIlIlIlIIlIlIl(llllllllllllIlllIlIIIlllllllIIll, WorldGenDesertWells.llIIIllIllIllI[0])) {
                if (!lIIIlIlIlIIlIlll(llllllllllllIlllIlIIIlllllllIlII, WorldGenDesertWells.llIIIllIllIllI[2]) || !lIIIlIlIlIIlIlll(llllllllllllIlllIlIIIlllllllIlII, WorldGenDesertWells.llIIIllIllIllI[0]) || !lIIIlIlIlIIlIlll(llllllllllllIlllIlIIIlllllllIIll, WorldGenDesertWells.llIIIllIllIllI[2]) || lIIIlIlIlIIllIII(llllllllllllIlllIlIIIlllllllIIll, WorldGenDesertWells.llIIIllIllIllI[0])) {
                    llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(llllllllllllIlllIlIIIlllllllIlII, WorldGenDesertWells.llIIIllIllIllI[4], llllllllllllIlllIlIIIlllllllIIll), this.field_175912_c, WorldGenDesertWells.llIIIllIllIllI[0]);
                    "".length();
                }
                ++llllllllllllIlllIlIIIlllllllIIll;
            }
            ++llllllllllllIlllIlIIIlllllllIlII;
        }
        llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(WorldGenDesertWells.llIIIllIllIllI[0], WorldGenDesertWells.llIIIllIllIllI[4], WorldGenDesertWells.llIIIllIllIllI[1]), this.field_175911_b, WorldGenDesertWells.llIIIllIllIllI[0]);
        "".length();
        llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(WorldGenDesertWells.llIIIllIllIllI[2], WorldGenDesertWells.llIIIllIllIllI[4], WorldGenDesertWells.llIIIllIllIllI[1]), this.field_175911_b, WorldGenDesertWells.llIIIllIllIllI[0]);
        "".length();
        llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(WorldGenDesertWells.llIIIllIllIllI[1], WorldGenDesertWells.llIIIllIllIllI[4], WorldGenDesertWells.llIIIllIllIllI[0]), this.field_175911_b, WorldGenDesertWells.llIIIllIllIllI[0]);
        "".length();
        llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(WorldGenDesertWells.llIIIllIllIllI[1], WorldGenDesertWells.llIIIllIllIllI[4], WorldGenDesertWells.llIIIllIllIllI[2]), this.field_175911_b, WorldGenDesertWells.llIIIllIllIllI[0]);
        "".length();
        int llllllllllllIlllIlIIIlllllllIIlI = WorldGenDesertWells.llIIIllIllIllI[3];
        "".length();
        if ("   ".length() > "   ".length()) {
            return ((0xA5 ^ 0xAE ^ (0x75 ^ 0x25)) & (0x35 ^ 0x4E ^ (0xB0 ^ 0x90) ^ -" ".length())) != 0x0;
        }
        while (!lIIIlIlIlIIlIlIl(llllllllllllIlllIlIIIlllllllIIlI, WorldGenDesertWells.llIIIllIllIllI[4])) {
            int llllllllllllIlllIlIIIlllllllIIIl = WorldGenDesertWells.llIIIllIllIllI[3];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((0x39 ^ 0x33 ^ (0x9C ^ 0xAD)) & (120 + 120 - 220 + 116 ^ 41 + 126 + 1 + 11 ^ -" ".length())) != 0x0;
            }
            while (!lIIIlIlIlIIlIlIl(llllllllllllIlllIlIIIlllllllIIIl, WorldGenDesertWells.llIIIllIllIllI[4])) {
                if (lIIIlIlIlIIlIlII(llllllllllllIlllIlIIIlllllllIIlI) && lIIIlIlIlIIlIlII(llllllllllllIlllIlIIIlllllllIIIl)) {
                    llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(llllllllllllIlllIlIIIlllllllIIlI, WorldGenDesertWells.llIIIllIllIllI[5], llllllllllllIlllIlIIIlllllllIIIl), this.field_175912_c, WorldGenDesertWells.llIIIllIllIllI[0]);
                    "".length();
                    "".length();
                    if ("   ".length() < " ".length()) {
                        return ((0x6E ^ 0xE) & ~(0x2A ^ 0x4A)) != 0x0;
                    }
                }
                else {
                    llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(llllllllllllIlllIlIIIlllllllIIlI, WorldGenDesertWells.llIIIllIllIllI[5], llllllllllllIlllIlIIIlllllllIIIl), this.field_175911_b, WorldGenDesertWells.llIIIllIllIllI[0]);
                    "".length();
                }
                ++llllllllllllIlllIlIIIlllllllIIIl;
            }
            ++llllllllllllIlllIlIIIlllllllIIlI;
        }
        int llllllllllllIlllIlIIIlllllllIIII = WorldGenDesertWells.llIIIllIllIllI[4];
        "".length();
        if (" ".length() < " ".length()) {
            return ((51 + 135 - 108 + 119 ^ 5 + 27 + 66 + 94) & (14 + 87 - 5 + 51 ^ 135 + 133 - 189 + 71 ^ -" ".length())) != 0x0;
        }
        while (!lIIIlIlIlIIlIlIl(llllllllllllIlllIlIIIlllllllIIII, WorldGenDesertWells.llIIIllIllIllI[6])) {
            llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(WorldGenDesertWells.llIIIllIllIllI[3], llllllllllllIlllIlIIIlllllllIIII, WorldGenDesertWells.llIIIllIllIllI[3]), this.field_175912_c, WorldGenDesertWells.llIIIllIllIllI[0]);
            "".length();
            llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(WorldGenDesertWells.llIIIllIllIllI[3], llllllllllllIlllIlIIIlllllllIIII, WorldGenDesertWells.llIIIllIllIllI[4]), this.field_175912_c, WorldGenDesertWells.llIIIllIllIllI[0]);
            "".length();
            llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(WorldGenDesertWells.llIIIllIllIllI[4], llllllllllllIlllIlIIIlllllllIIII, WorldGenDesertWells.llIIIllIllIllI[3]), this.field_175912_c, WorldGenDesertWells.llIIIllIllIllI[0]);
            "".length();
            llllllllllllIlllIlIIIllllllIlllI.setBlockState(((BlockPos)llllllllllllIlllIlIIIllllllIllIl).add(WorldGenDesertWells.llIIIllIllIllI[4], llllllllllllIlllIlIIIlllllllIIII, WorldGenDesertWells.llIIIllIllIllI[4]), this.field_175912_c, WorldGenDesertWells.llIIIllIllIllI[0]);
            "".length();
            ++llllllllllllIlllIlIIIlllllllIIII;
        }
        return WorldGenDesertWells.llIIIllIllIllI[4] != 0;
    }
    
    public WorldGenDesertWells() {
        this.field_175911_b = Blocks.stone_slab.getDefaultState().withProperty(BlockStoneSlab.VARIANT, BlockStoneSlab.EnumType.SAND).withProperty(BlockSlab.HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        this.field_175912_c = Blocks.sandstone.getDefaultState();
        this.field_175910_d = Blocks.flowing_water.getDefaultState();
    }
    
    private static boolean lIIIlIlIlIIllIII(final int llllllllllllIlllIlIIIllllllIIlll, final int llllllllllllIlllIlIIIllllllIIllI) {
        return llllllllllllIlllIlIIIllllllIIlll == llllllllllllIlllIlIIIllllllIIllI;
    }
}
