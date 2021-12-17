// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockHugeMushroom;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class WorldGenBigMushroom extends WorldGenerator
{
    private /* synthetic */ Block mushroomType;
    private static final /* synthetic */ int[] lIIlIlIlllIIll;
    
    private static boolean llIlIIIlIlIIlII(final int lllllllllllllIIllIIllIIllllllIIl) {
        return lllllllllllllIIllIIllIIllllllIIl != 0;
    }
    
    static {
        llIlIIIlIlIIIlI();
    }
    
    private static boolean llIlIIIlIlIIlIl(final int lllllllllllllIIllIIllIlIIIIlIIlI, final int lllllllllllllIIllIIllIlIIIIlIIIl) {
        return lllllllllllllIIllIIllIlIIIIlIIlI >= lllllllllllllIIllIIllIlIIIIlIIIl;
    }
    
    private static boolean llIlIIIlIlIlllI(final int lllllllllllllIIllIIllIIlllllIIlI, final int lllllllllllllIIllIIllIIlllllIIIl) {
        return lllllllllllllIIllIIllIIlllllIIlI != lllllllllllllIIllIIllIIlllllIIIl;
    }
    
    private static boolean llIlIIIlIlIlIlI(final int lllllllllllllIIllIIllIIlllllIlll) {
        return lllllllllllllIIllIIllIIlllllIlll == 0;
    }
    
    public WorldGenBigMushroom(final Block lllllllllllllIIllIIllIlIIlIlllll) {
        super((boolean)(WorldGenBigMushroom.lIIlIlIlllIIll[0] != 0));
        this.mushroomType = lllllllllllllIIllIIllIlIIlIlllll;
    }
    
    private static boolean llIlIIIlIlIllII(final Object lllllllllllllIIllIIllIIllllllllI, final Object lllllllllllllIIllIIllIIlllllllIl) {
        return lllllllllllllIIllIIllIIllllllllI == lllllllllllllIIllIIllIIlllllllIl;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIIllIIllIlIIlIIIlIl, final Random lllllllllllllIIllIIllIlIIIlIlIIl, final BlockPos lllllllllllllIIllIIllIlIIIlIlIII) {
        if (llIlIIIlIlIIIll(this.mushroomType)) {
            Block mushroomType;
            if (llIlIIIlIlIIlII(lllllllllllllIIllIIllIlIIIlIlIIl.nextBoolean() ? 1 : 0)) {
                mushroomType = Blocks.brown_mushroom_block;
                "".length();
                if (((0x2 ^ 0x4A) & ~(0xCD ^ 0x85)) >= "  ".length()) {
                    return ((0xC1 ^ 0xA1) & ~(0xA5 ^ 0xC5)) != 0x0;
                }
            }
            else {
                mushroomType = Blocks.red_mushroom_block;
            }
            this.mushroomType = mushroomType;
        }
        final int lllllllllllllIIllIIllIlIIlIIIIlI = lllllllllllllIIllIIllIlIIIlIlIIl.nextInt(WorldGenBigMushroom.lIIlIlIlllIIll[2]) + WorldGenBigMushroom.lIIlIlIlllIIll[3];
        boolean lllllllllllllIIllIIllIlIIlIIIIIl = WorldGenBigMushroom.lIIlIlIlllIIll[0] != 0;
        if (!llIlIIIlIlIIlIl(lllllllllllllIIllIIllIlIIIlIlIII.getY(), WorldGenBigMushroom.lIIlIlIlllIIll[0]) || !llIlIIIlIlIIllI(lllllllllllllIIllIIllIlIIIlIlIII.getY() + lllllllllllllIIllIIllIlIIlIIIIlI + WorldGenBigMushroom.lIIlIlIlllIIll[0], WorldGenBigMushroom.lIIlIlIlllIIll[4])) {
            return WorldGenBigMushroom.lIIlIlIlllIIll[1] != 0;
        }
        int lllllllllllllIIllIIllIlIIlIIIIII = lllllllllllllIIllIIllIlIIIlIlIII.getY();
        "".length();
        if ((0xAB ^ 0xAF) < 0) {
            return ((0x92 ^ 0xAA) & ~(0x5E ^ 0x66)) != 0x0;
        }
        while (!llIlIIIlIlIlIll(lllllllllllllIIllIIllIlIIlIIIIII, lllllllllllllIIllIIllIlIIIlIlIII.getY() + WorldGenBigMushroom.lIIlIlIlllIIll[0] + lllllllllllllIIllIIllIlIIlIIIIlI)) {
            int lllllllllllllIIllIIllIlIIIllllll = WorldGenBigMushroom.lIIlIlIlllIIll[2];
            if (llIlIIIlIlIIlll(lllllllllllllIIllIIllIlIIlIIIIII, lllllllllllllIIllIIllIlIIIlIlIII.getY() + WorldGenBigMushroom.lIIlIlIlllIIll[2])) {
                lllllllllllllIIllIIllIlIIIllllll = WorldGenBigMushroom.lIIlIlIlllIIll[1];
            }
            final BlockPos.MutableBlockPos lllllllllllllIIllIIllIlIIIlllllI = new BlockPos.MutableBlockPos();
            int lllllllllllllIIllIIllIlIIIllllIl = lllllllllllllIIllIIllIlIIIlIlIII.getX() - lllllllllllllIIllIIllIlIIIllllll;
            "".length();
            if (((0x40 ^ 0x1E) & ~(0xFD ^ 0xA3)) != 0x0) {
                return ((0x58 ^ 0x4) & ~(0x8 ^ 0x54)) != 0x0;
            }
            while (llIlIIIlIlIIlll(lllllllllllllIIllIIllIlIIIllllIl, lllllllllllllIIllIIllIlIIIlIlIII.getX() + lllllllllllllIIllIIllIlIIIllllll) && !llIlIIIlIlIlIlI(lllllllllllllIIllIIllIlIIlIIIIIl ? 1 : 0)) {
                int lllllllllllllIIllIIllIlIIIllllII = lllllllllllllIIllIIllIlIIIlIlIII.getZ() - lllllllllllllIIllIIllIlIIIllllll;
                "".length();
                if (null != null) {
                    return ((0x72 ^ 0x38) & ~(0x4E ^ 0x4)) != 0x0;
                }
                while (llIlIIIlIlIIlll(lllllllllllllIIllIIllIlIIIllllII, lllllllllllllIIllIIllIlIIIlIlIII.getZ() + lllllllllllllIIllIIllIlIIIllllll) && !llIlIIIlIlIlIlI(lllllllllllllIIllIIllIlIIlIIIIIl ? 1 : 0)) {
                    if (llIlIIIlIlIlIII(lllllllllllllIIllIIllIlIIlIIIIII) && llIlIIIlIlIIllI(lllllllllllllIIllIIllIlIIlIIIIII, WorldGenBigMushroom.lIIlIlIlllIIll[4])) {
                        final Block lllllllllllllIIllIIllIlIIIlllIll = lllllllllllllIIllIIllIlIIlIIIlIl.getBlockState(lllllllllllllIIllIIllIlIIIlllllI.func_181079_c(lllllllllllllIIllIIllIlIIIllllIl, lllllllllllllIIllIIllIlIIlIIIIII, lllllllllllllIIllIIllIlIIIllllII)).getBlock();
                        if (llIlIIIlIlIlIIl(lllllllllllllIIllIIllIlIIIlllIll.getMaterial(), Material.air) && llIlIIIlIlIlIIl(lllllllllllllIIllIIllIlIIIlllIll.getMaterial(), Material.leaves)) {
                            lllllllllllllIIllIIllIlIIlIIIIIl = (WorldGenBigMushroom.lIIlIlIlllIIll[1] != 0);
                            "".length();
                            if (((0xEC ^ 0xBE ^ (0x78 ^ 0x38)) & (0x20 ^ 0x40 ^ (0x50 ^ 0x22) ^ -" ".length())) <= -" ".length()) {
                                return ((0x64 ^ 0x6A ^ (0x81 ^ 0xBF)) & (0xC ^ 0x7E ^ (0x24 ^ 0x66) ^ -" ".length())) != 0x0;
                            }
                        }
                    }
                    else {
                        lllllllllllllIIllIIllIlIIlIIIIIl = (WorldGenBigMushroom.lIIlIlIlllIIll[1] != 0);
                    }
                    ++lllllllllllllIIllIIllIlIIIllllII;
                }
                ++lllllllllllllIIllIIllIlIIIllllIl;
            }
            ++lllllllllllllIIllIIllIlIIlIIIIII;
        }
        if (llIlIIIlIlIlIlI(lllllllllllllIIllIIllIlIIlIIIIIl ? 1 : 0)) {
            return WorldGenBigMushroom.lIIlIlIlllIIll[1] != 0;
        }
        final Block lllllllllllllIIllIIllIlIIIlllIlI = lllllllllllllIIllIIllIlIIlIIIlIl.getBlockState(lllllllllllllIIllIIllIlIIIlIlIII.down()).getBlock();
        if (llIlIIIlIlIlIIl(lllllllllllllIIllIIllIlIIIlllIlI, Blocks.dirt) && llIlIIIlIlIlIIl(lllllllllllllIIllIIllIlIIIlllIlI, Blocks.grass) && llIlIIIlIlIlIIl(lllllllllllllIIllIIllIlIIIlllIlI, Blocks.mycelium)) {
            return WorldGenBigMushroom.lIIlIlIlllIIll[1] != 0;
        }
        int lllllllllllllIIllIIllIlIIIlllIIl = lllllllllllllIIllIIllIlIIIlIlIII.getY() + lllllllllllllIIllIIllIlIIlIIIIlI;
        if (llIlIIIlIlIllII(this.mushroomType, Blocks.red_mushroom_block)) {
            lllllllllllllIIllIIllIlIIIlllIIl = lllllllllllllIIllIIllIlIIIlIlIII.getY() + lllllllllllllIIllIIllIlIIlIIIIlI - WorldGenBigMushroom.lIIlIlIlllIIll[2];
        }
        int lllllllllllllIIllIIllIlIIIlllIII = lllllllllllllIIllIIllIlIIIlllIIl;
        "".length();
        if (-"   ".length() > 0) {
            return ((0xA4 ^ 0x8D) & ~(0x76 ^ 0x5F)) != 0x0;
        }
        while (!llIlIIIlIlIlIll(lllllllllllllIIllIIllIlIIIlllIII, lllllllllllllIIllIIllIlIIIlIlIII.getY() + lllllllllllllIIllIIllIlIIlIIIIlI)) {
            int lllllllllllllIIllIIllIlIIIllIlll = WorldGenBigMushroom.lIIlIlIlllIIll[0];
            if (llIlIIIlIlIIllI(lllllllllllllIIllIIllIlIIIlllIII, lllllllllllllIIllIIllIlIIIlIlIII.getY() + lllllllllllllIIllIIllIlIIlIIIIlI)) {
                ++lllllllllllllIIllIIllIlIIIllIlll;
            }
            if (llIlIIIlIlIllII(this.mushroomType, Blocks.brown_mushroom_block)) {
                lllllllllllllIIllIIllIlIIIllIlll = WorldGenBigMushroom.lIIlIlIlllIIll[2];
            }
            final int lllllllllllllIIllIIllIlIIIllIllI = lllllllllllllIIllIIllIlIIIlIlIII.getX() - lllllllllllllIIllIIllIlIIIllIlll;
            final int lllllllllllllIIllIIllIlIIIllIlIl = lllllllllllllIIllIIllIlIIIlIlIII.getX() + lllllllllllllIIllIIllIlIIIllIlll;
            final int lllllllllllllIIllIIllIlIIIllIlII = lllllllllllllIIllIIllIlIIIlIlIII.getZ() - lllllllllllllIIllIIllIlIIIllIlll;
            final int lllllllllllllIIllIIllIlIIIllIIll = lllllllllllllIIllIIllIlIIIlIlIII.getZ() + lllllllllllllIIllIIllIlIIIllIlll;
            int lllllllllllllIIllIIllIlIIIllIIlI = lllllllllllllIIllIIllIlIIIllIllI;
            "".length();
            if ("  ".length() == 0) {
                return ((0x24 ^ 0x71) & ~(0x3F ^ 0x6A)) != 0x0;
            }
            while (!llIlIIIlIlIlIll(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIllIlIl)) {
                int lllllllllllllIIllIIllIlIIIllIIIl = lllllllllllllIIllIIllIlIIIllIlII;
                "".length();
                if ("   ".length() < " ".length()) {
                    return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
                }
                while (!llIlIIIlIlIlIll(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIllIIll)) {
                    int lllllllllllllIIllIIllIlIIIllIIII = WorldGenBigMushroom.lIIlIlIlllIIll[5];
                    if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIllIllI)) {
                        --lllllllllllllIIllIIllIlIIIllIIII;
                        "".length();
                        if (-"  ".length() >= 0) {
                            return ((0x13 ^ 0xF ^ (0xC ^ 0x2E)) & (0xEE ^ 0xC3 ^ (0x48 ^ 0x5B) ^ -" ".length())) != 0x0;
                        }
                    }
                    else if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIllIlIl)) {
                        ++lllllllllllllIIllIIllIlIIIllIIII;
                    }
                    if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIllIlII)) {
                        lllllllllllllIIllIIllIlIIIllIIII -= 3;
                        "".length();
                        if (null != null) {
                            return ((0xF ^ 0x40) & ~(0x31 ^ 0x7E)) != 0x0;
                        }
                    }
                    else if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIllIIll)) {
                        lllllllllllllIIllIIllIlIIIllIIII += 3;
                    }
                    BlockHugeMushroom.EnumType lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.byMetadata(lllllllllllllIIllIIllIlIIIllIIII);
                    Label_1498: {
                        if (!llIlIIIlIlIlIIl(this.mushroomType, Blocks.brown_mushroom_block) || llIlIIIlIlIIllI(lllllllllllllIIllIIllIlIIIlllIII, lllllllllllllIIllIIllIlIIIlIlIII.getY() + lllllllllllllIIllIIllIlIIlIIIIlI)) {
                            if (!llIlIIIlIlIlllI(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIllIllI) || llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIllIlIl)) {
                                if (!llIlIIIlIlIlllI(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIllIlII)) {
                                    break Label_1498;
                                }
                                if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIllIIll)) {
                                    "".length();
                                    if (-" ".length() >= 0) {
                                        return ((0x65 ^ 0x13 ^ (0xDA ^ 0x91)) & (0x3A ^ 0x7C ^ (0x5F ^ 0x24) ^ -" ".length())) != 0x0;
                                    }
                                    break Label_1498;
                                }
                            }
                            if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIlIlIII.getX() - (lllllllllllllIIllIIllIlIIIllIlll - WorldGenBigMushroom.lIIlIlIlllIIll[0])) && llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIllIlII)) {
                                lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.NORTH_WEST;
                            }
                            if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIllIllI) && llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIlIlIII.getZ() - (lllllllllllllIIllIIllIlIIIllIlll - WorldGenBigMushroom.lIIlIlIlllIIll[0]))) {
                                lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.NORTH_WEST;
                            }
                            if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIlIlIII.getX() + (lllllllllllllIIllIIllIlIIIllIlll - WorldGenBigMushroom.lIIlIlIlllIIll[0])) && llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIllIlII)) {
                                lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.NORTH_EAST;
                            }
                            if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIllIlIl) && llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIlIlIII.getZ() - (lllllllllllllIIllIIllIlIIIllIlll - WorldGenBigMushroom.lIIlIlIlllIIll[0]))) {
                                lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.NORTH_EAST;
                            }
                            if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIlIlIII.getX() - (lllllllllllllIIllIIllIlIIIllIlll - WorldGenBigMushroom.lIIlIlIlllIIll[0])) && llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIllIIll)) {
                                lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.SOUTH_WEST;
                            }
                            if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIllIllI) && llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIlIlIII.getZ() + (lllllllllllllIIllIIllIlIIIllIlll - WorldGenBigMushroom.lIIlIlIlllIIll[0]))) {
                                lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.SOUTH_WEST;
                            }
                            if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIlIlIII.getX() + (lllllllllllllIIllIIllIlIIIllIlll - WorldGenBigMushroom.lIIlIlIlllIIll[0])) && llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIllIIll)) {
                                lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.SOUTH_EAST;
                            }
                            if (llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIllIlIl) && llIlIIIlIlIllIl(lllllllllllllIIllIIllIlIIIllIIIl, lllllllllllllIIllIIllIlIIIlIlIII.getZ() + (lllllllllllllIIllIIllIlIIIllIlll - WorldGenBigMushroom.lIIlIlIlllIIll[0]))) {
                                lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.SOUTH_EAST;
                            }
                        }
                        if (llIlIIIlIlIllII(lllllllllllllIIllIIllIlIIIlIllll, BlockHugeMushroom.EnumType.CENTER) && llIlIIIlIlIIllI(lllllllllllllIIllIIllIlIIIlllIII, lllllllllllllIIllIIllIlIIIlIlIII.getY() + lllllllllllllIIllIIllIlIIlIIIIlI)) {
                            lllllllllllllIIllIIllIlIIIlIllll = BlockHugeMushroom.EnumType.ALL_INSIDE;
                        }
                        if (!llIlIIIlIlIIllI(lllllllllllllIIllIIllIlIIIlIlIII.getY(), lllllllllllllIIllIIllIlIIIlIlIII.getY() + lllllllllllllIIllIIllIlIIlIIIIlI - WorldGenBigMushroom.lIIlIlIlllIIll[0]) || llIlIIIlIlIlIIl(lllllllllllllIIllIIllIlIIIlIllll, BlockHugeMushroom.EnumType.ALL_INSIDE)) {
                            final BlockPos lllllllllllllIIllIIllIlIIIlIlllI = new BlockPos(lllllllllllllIIllIIllIlIIIllIIlI, lllllllllllllIIllIIllIlIIIlllIII, lllllllllllllIIllIIllIlIIIllIIIl);
                            if (llIlIIIlIlIlIlI(lllllllllllllIIllIIllIlIIlIIIlIl.getBlockState(lllllllllllllIIllIIllIlIIIlIlllI).getBlock().isFullBlock() ? 1 : 0)) {
                                this.setBlockAndNotifyAdequately(lllllllllllllIIllIIllIlIIlIIIlIl, lllllllllllllIIllIIllIlIIIlIlllI, this.mushroomType.getDefaultState().withProperty(BlockHugeMushroom.VARIANT, lllllllllllllIIllIIllIlIIIlIllll));
                            }
                        }
                    }
                    ++lllllllllllllIIllIIllIlIIIllIIIl;
                }
                ++lllllllllllllIIllIIllIlIIIllIIlI;
            }
            ++lllllllllllllIIllIIllIlIIIlllIII;
        }
        int lllllllllllllIIllIIllIlIIIlIllIl = WorldGenBigMushroom.lIIlIlIlllIIll[1];
        "".length();
        if (((0xB6 ^ 0xB0 ^ (0x6C ^ 0x2D)) & (162 + 66 - 82 + 101 ^ 20 + 41 + 4 + 111 ^ -" ".length())) != 0x0) {
            return ((8 + 19 - 15 + 128 ^ 108 + 115 - 98 + 54) & (0x62 ^ 0x53 ^ (0x1E ^ 0x10) ^ -" ".length())) != 0x0;
        }
        while (!llIlIIIlIlIIlIl(lllllllllllllIIllIIllIlIIIlIllIl, lllllllllllllIIllIIllIlIIlIIIIlI)) {
            final Block lllllllllllllIIllIIllIlIIIlIllII = lllllllllllllIIllIIllIlIIlIIIlIl.getBlockState(lllllllllllllIIllIIllIlIIIlIlIII.up(lllllllllllllIIllIIllIlIIIlIllIl)).getBlock();
            if (llIlIIIlIlIlIlI(lllllllllllllIIllIIllIlIIIlIllII.isFullBlock() ? 1 : 0)) {
                this.setBlockAndNotifyAdequately(lllllllllllllIIllIIllIlIIlIIIlIl, lllllllllllllIIllIIllIlIIIlIlIII.up(lllllllllllllIIllIIllIlIIIlIllIl), this.mushroomType.getDefaultState().withProperty(BlockHugeMushroom.VARIANT, BlockHugeMushroom.EnumType.STEM));
            }
            ++lllllllllllllIIllIIllIlIIIlIllIl;
        }
        return WorldGenBigMushroom.lIIlIlIlllIIll[0] != 0;
    }
    
    public WorldGenBigMushroom() {
        super((boolean)(WorldGenBigMushroom.lIIlIlIlllIIll[1] != 0));
    }
    
    private static boolean llIlIIIlIlIlIIl(final Object lllllllllllllIIllIIllIlIIIIIIIlI, final Object lllllllllllllIIllIIllIlIIIIIIIIl) {
        return lllllllllllllIIllIIllIlIIIIIIIlI != lllllllllllllIIllIIllIlIIIIIIIIl;
    }
    
    private static boolean llIlIIIlIlIIllI(final int lllllllllllllIIllIIllIlIIIIIlllI, final int lllllllllllllIIllIIllIlIIIIIllIl) {
        return lllllllllllllIIllIIllIlIIIIIlllI < lllllllllllllIIllIIllIlIIIIIllIl;
    }
    
    private static boolean llIlIIIlIlIIIll(final Object lllllllllllllIIllIIllIIllllllIll) {
        return lllllllllllllIIllIIllIIllllllIll == null;
    }
    
    private static boolean llIlIIIlIlIIlll(final int lllllllllllllIIllIIllIlIIIIIlIlI, final int lllllllllllllIIllIIllIlIIIIIlIIl) {
        return lllllllllllllIIllIIllIlIIIIIlIlI <= lllllllllllllIIllIIllIlIIIIIlIIl;
    }
    
    private static boolean llIlIIIlIlIllIl(final int lllllllllllllIIllIIllIlIIIIlIllI, final int lllllllllllllIIllIIllIlIIIIlIlIl) {
        return lllllllllllllIIllIIllIlIIIIlIllI == lllllllllllllIIllIIllIlIIIIlIlIl;
    }
    
    private static void llIlIIIlIlIIIlI() {
        (lIIlIlIlllIIll = new int[6])[0] = " ".length();
        WorldGenBigMushroom.lIIlIlIlllIIll[1] = ((0xBE ^ 0x9C ^ (0xAE ^ 0xA6)) & (0xC1 ^ 0xB3 ^ (0x1E ^ 0x46) ^ -" ".length()));
        WorldGenBigMushroom.lIIlIlIlllIIll[2] = "   ".length();
        WorldGenBigMushroom.lIIlIlIlllIIll[3] = (0x2D ^ 0x29);
        WorldGenBigMushroom.lIIlIlIlllIIll[4] = (0xFFFFF558 & 0xBA7);
        WorldGenBigMushroom.lIIlIlIlllIIll[5] = (0x1C ^ 0x4C ^ (0x94 ^ 0xC1));
    }
    
    private static boolean llIlIIIlIlIlIll(final int lllllllllllllIIllIIllIlIIIIIIllI, final int lllllllllllllIIllIIllIlIIIIIIlIl) {
        return lllllllllllllIIllIIllIlIIIIIIllI > lllllllllllllIIllIIllIlIIIIIIlIl;
    }
    
    private static boolean llIlIIIlIlIlIII(final int lllllllllllllIIllIIllIIlllllIlIl) {
        return lllllllllllllIIllIIllIIlllllIlIl >= 0;
    }
}
