// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import java.util.Iterator;
import com.google.common.collect.Lists;
import net.minecraft.block.BlockLog;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockLeaves;
import net.minecraft.util.MathHelper;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import java.util.Random;
import java.util.List;

public class WorldGenBigTree extends WorldGenAbstractTree
{
    /* synthetic */ List<FoliageCoordinates> field_175948_j;
    /* synthetic */ double heightAttenuation;
    /* synthetic */ int leafDistanceLimit;
    /* synthetic */ double scaleWidth;
    private static final /* synthetic */ int[] lllllIlIIIlII;
    /* synthetic */ int trunkSize;
    /* synthetic */ int height;
    /* synthetic */ double branchSlope;
    /* synthetic */ int heightLimit;
    /* synthetic */ double leafDensity;
    private /* synthetic */ Random rand;
    /* synthetic */ int heightLimitLimit;
    private /* synthetic */ BlockPos basePos;
    private /* synthetic */ World world;
    
    private static boolean lIlIlllIIlIlIll(final int lllllllllllllIlIlIllIlllIIIIlIlI, final int lllllllllllllIlIlIllIlllIIIIlIIl) {
        return lllllllllllllIlIlIllIlllIIIIlIlI < lllllllllllllIlIlIllIlllIIIIlIIl;
    }
    
    void generateTrunk() {
        final BlockPos lllllllllllllIlIlIllIllllIIllIlI = this.basePos;
        final BlockPos lllllllllllllIlIlIllIllllIIllIIl = this.basePos.up(this.height);
        final Block lllllllllllllIlIlIllIllllIIllIII = Blocks.log;
        this.func_175937_a(lllllllllllllIlIlIllIllllIIllIlI, lllllllllllllIlIlIllIllllIIllIIl, lllllllllllllIlIlIllIllllIIllIII);
        if (lIlIlllIIlIlllI(this.trunkSize, WorldGenBigTree.lllllIlIIIlII[5])) {
            this.func_175937_a(lllllllllllllIlIlIllIllllIIllIlI.east(), lllllllllllllIlIlIllIllllIIllIIl.east(), lllllllllllllIlIlIllIllllIIllIII);
            this.func_175937_a(lllllllllllllIlIlIllIllllIIllIlI.east().south(), lllllllllllllIlIlIllIllllIIllIIl.east().south(), lllllllllllllIlIlIllIllllIIllIII);
            this.func_175937_a(lllllllllllllIlIlIllIllllIIllIlI.south(), lllllllllllllIlIlIllIllllIIllIIl.south(), lllllllllllllIlIlIllIllllIIllIII);
        }
    }
    
    private int getGreatestDistance(final BlockPos lllllllllllllIlIlIllIlllllIIlIII) {
        final int lllllllllllllIlIlIllIlllllIIIlll = MathHelper.abs_int(lllllllllllllIlIlIllIlllllIIlIII.getX());
        final int lllllllllllllIlIlIllIlllllIIIllI = MathHelper.abs_int(lllllllllllllIlIlIllIlllllIIlIII.getY());
        final int lllllllllllllIlIlIllIlllllIIIlIl = MathHelper.abs_int(lllllllllllllIlIlIllIlllllIIlIII.getZ());
        int n;
        if (lIlIlllIIllIlIl(lllllllllllllIlIlIllIlllllIIIlIl, lllllllllllllIlIlIllIlllllIIIlll) && lIlIlllIIllIlIl(lllllllllllllIlIlIllIlllllIIIlIl, lllllllllllllIlIlIllIlllllIIIllI)) {
            n = lllllllllllllIlIlIllIlllllIIIlIl;
            "".length();
            if ("   ".length() <= 0) {
                return (0x59 ^ 0x3C ^ (0x38 ^ 0x4F)) & (20 + 45 + 52 + 12 ^ 113 + 36 - 87 + 85 ^ -" ".length());
            }
        }
        else if (lIlIlllIIllIlIl(lllllllllllllIlIlIllIlllllIIIllI, lllllllllllllIlIlIllIlllllIIIlll)) {
            n = lllllllllllllIlIlIllIlllllIIIllI;
            "".length();
            if (-" ".length() > (0x60 ^ 0x64)) {
                return (0xDB ^ 0x9C) & ~(0xC4 ^ 0x83);
            }
        }
        else {
            n = lllllllllllllIlIlIllIlllllIIIlll;
        }
        return n;
    }
    
    void generateLeafNode(final BlockPos lllllllllllllIlIlIllIlllllllIIll) {
        int lllllllllllllIlIlIllIlllllllIlIl = WorldGenBigTree.lllllIlIIIlII[3];
        "".length();
        if (-(0x88 ^ 0x8C) >= 0) {
            return;
        }
        while (!lIlIlllIIlIlIlI(lllllllllllllIlIlIllIlllllllIlIl, this.leafDistanceLimit)) {
            this.func_181631_a(lllllllllllllIlIlIllIlllllllIIll.up(lllllllllllllIlIlIllIlllllllIlIl), this.leafSize(lllllllllllllIlIlIllIlllllllIlIl), Blocks.leaves.getDefaultState().withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(WorldGenBigTree.lllllIlIIIlII[3] != 0)));
            ++lllllllllllllIlIlIllIlllllllIlIl;
        }
    }
    
    private static int lIlIlllIIlIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    void func_181631_a(final BlockPos lllllllllllllIlIlIlllIIIIIIlIlll, final float lllllllllllllIlIlIlllIIIIIIlIllI, final IBlockState lllllllllllllIlIlIlllIIIIIIlIlIl) {
        final int lllllllllllllIlIlIlllIIIIIIlllIl = (int)(lllllllllllllIlIlIlllIIIIIIlIllI + 0.618);
        int lllllllllllllIlIlIlllIIIIIIlllII = -lllllllllllllIlIlIlllIIIIIIlllIl;
        "".length();
        if (-" ".length() >= "   ".length()) {
            return;
        }
        while (!lIlIlllIIllIlIl(lllllllllllllIlIlIlllIIIIIIlllII, lllllllllllllIlIlIlllIIIIIIlllIl)) {
            int lllllllllllllIlIlIlllIIIIIIllIll = -lllllllllllllIlIlIlllIIIIIIlllIl;
            "".length();
            if (((0xC0 ^ 0x8F ^ (0x19 ^ 0x6A)) & (61 + 220 - 194 + 165 ^ 179 + 175 - 234 + 72 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIlIlllIIllIlIl(lllllllllllllIlIlIlllIIIIIIllIll, lllllllllllllIlIlIlllIIIIIIlllIl)) {
                if (lIlIlllIIllIIlI(lIlIlllIIllIIIl(Math.pow(Math.abs(lllllllllllllIlIlIlllIIIIIIlllII) + 0.5, 2.0) + Math.pow(Math.abs(lllllllllllllIlIlIlllIIIIIIllIll) + 0.5, 2.0), lllllllllllllIlIlIlllIIIIIIlIllI * lllllllllllllIlIlIlllIIIIIIlIllI))) {
                    final BlockPos lllllllllllllIlIlIlllIIIIIIllIlI = lllllllllllllIlIlIlllIIIIIIlIlll.add(lllllllllllllIlIlIlllIIIIIIlllII, WorldGenBigTree.lllllIlIIIlII[3], lllllllllllllIlIlIlllIIIIIIllIll);
                    final Material lllllllllllllIlIlIlllIIIIIIllIIl = this.world.getBlockState(lllllllllllllIlIlIlllIIIIIIllIlI).getBlock().getMaterial();
                    if (!lIlIlllIIllIIll(lllllllllllllIlIlIlllIIIIIIllIIl, Material.air) || lIlIlllIIllIlII(lllllllllllllIlIlIlllIIIIIIllIIl, Material.leaves)) {
                        this.setBlockAndNotifyAdequately(this.world, lllllllllllllIlIlIlllIIIIIIllIlI, lllllllllllllIlIlIlllIIIIIIlIlIl);
                    }
                }
                ++lllllllllllllIlIlIlllIIIIIIllIll;
            }
            ++lllllllllllllIlIlIlllIIIIIIlllII;
        }
    }
    
    private static boolean lIlIlllIIllIlIl(final int lllllllllllllIlIlIllIlllIIIIIllI, final int lllllllllllllIlIlIllIlllIIIIIlIl) {
        return lllllllllllllIlIlIllIlllIIIIIllI > lllllllllllllIlIlIllIlllIIIIIlIl;
    }
    
    int checkBlockLine(final BlockPos lllllllllllllIlIlIllIlllIlIllIIl, final BlockPos lllllllllllllIlIlIllIlllIlIllIII) {
        final BlockPos lllllllllllllIlIlIllIlllIlIlIlll = lllllllllllllIlIlIllIlllIlIllIII.add(-lllllllllllllIlIlIllIlllIlIllIIl.getX(), -lllllllllllllIlIlIllIlllIlIllIIl.getY(), -lllllllllllllIlIlIllIlllIlIllIIl.getZ());
        final int lllllllllllllIlIlIllIlllIlIlIllI = this.getGreatestDistance(lllllllllllllIlIlIllIlllIlIlIlll);
        final float lllllllllllllIlIlIllIlllIlIlIlIl = lllllllllllllIlIlIllIlllIlIlIlll.getX() / (float)lllllllllllllIlIlIllIlllIlIlIllI;
        final float lllllllllllllIlIlIllIlllIlIlIlII = lllllllllllllIlIlIllIlllIlIlIlll.getY() / (float)lllllllllllllIlIlIllIlllIlIlIllI;
        final float lllllllllllllIlIlIllIlllIlIlIIll = lllllllllllllIlIlIllIlllIlIlIlll.getZ() / (float)lllllllllllllIlIlIllIlllIlIlIllI;
        if (lIlIlllIIlllIII(lllllllllllllIlIlIllIlllIlIlIllI)) {
            return WorldGenBigTree.lllllIlIIIlII[4];
        }
        int lllllllllllllIlIlIllIlllIlIlIIlI = WorldGenBigTree.lllllIlIIIlII[3];
        "".length();
        if (" ".length() >= (0x17 ^ 0x4 ^ (0x1C ^ 0xB))) {
            return (0xAD ^ 0x85 ^ (0x28 ^ 0x4C)) & (29 + 197 - 223 + 242 ^ 128 + 47 - 130 + 140 ^ -" ".length());
        }
        while (!lIlIlllIIllIlIl(lllllllllllllIlIlIllIlllIlIlIIlI, lllllllllllllIlIlIllIlllIlIlIllI)) {
            final BlockPos lllllllllllllIlIlIllIlllIlIlIIIl = lllllllllllllIlIlIllIlllIlIllIIl.add(0.5f + lllllllllllllIlIlIllIlllIlIlIIlI * lllllllllllllIlIlIllIlllIlIlIlIl, 0.5f + lllllllllllllIlIlIllIlllIlIlIIlI * lllllllllllllIlIlIllIlllIlIlIlII, 0.5f + lllllllllllllIlIlIllIlllIlIlIIlI * lllllllllllllIlIlIllIlllIlIlIIll);
            if (lIlIlllIIlllIII(this.func_150523_a(this.world.getBlockState(lllllllllllllIlIlIllIlllIlIlIIIl).getBlock()) ? 1 : 0)) {
                return lllllllllllllIlIlIllIlllIlIlIIlI;
            }
            ++lllllllllllllIlIlIllIlllIlIlIIlI;
        }
        return WorldGenBigTree.lllllIlIIIlII[4];
    }
    
    @Override
    public void func_175904_e() {
        this.leafDistanceLimit = WorldGenBigTree.lllllIlIIIlII[6];
    }
    
    private BlockLog.EnumAxis func_175938_b(final BlockPos lllllllllllllIlIlIllIllllIlllIIl, final BlockPos lllllllllllllIlIlIllIllllIlllIII) {
        BlockLog.EnumAxis lllllllllllllIlIlIllIllllIllIlll = BlockLog.EnumAxis.Y;
        final int lllllllllllllIlIlIllIllllIllIllI = Math.abs(lllllllllllllIlIlIllIllllIlllIII.getX() - lllllllllllllIlIlIllIllllIlllIIl.getX());
        final int lllllllllllllIlIlIllIllllIllIlIl = Math.abs(lllllllllllllIlIlIllIllllIlllIII.getZ() - lllllllllllllIlIlIllIllllIlllIIl.getZ());
        final int lllllllllllllIlIlIllIllllIllIlII = Math.max(lllllllllllllIlIlIllIllllIllIllI, lllllllllllllIlIlIllIllllIllIlIl);
        if (lIlIlllIIlIllll(lllllllllllllIlIlIllIllllIllIlII)) {
            if (lIlIlllIIlIlllI(lllllllllllllIlIlIllIllllIllIllI, lllllllllllllIlIlIllIllllIllIlII)) {
                lllllllllllllIlIlIllIllllIllIlll = BlockLog.EnumAxis.X;
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            else if (lIlIlllIIlIlllI(lllllllllllllIlIlIllIllllIllIlIl, lllllllllllllIlIlIllIllllIllIlII)) {
                lllllllllllllIlIlIllIllllIllIlll = BlockLog.EnumAxis.Z;
            }
        }
        return lllllllllllllIlIlIllIllllIllIlll;
    }
    
    void generateLeafNodeList() {
        this.height = (int)(this.heightLimit * this.heightAttenuation);
        if (lIlIlllIIlIlIlI(this.height, this.heightLimit)) {
            this.height = this.heightLimit - WorldGenBigTree.lllllIlIIIlII[0];
        }
        int lllllllllllllIlIlIlllIIIIlIIlIll = (int)(1.382 + Math.pow(this.leafDensity * this.heightLimit / 13.0, 2.0));
        if (lIlIlllIIlIlIll(lllllllllllllIlIlIlllIIIIlIIlIll, WorldGenBigTree.lllllIlIIIlII[0])) {
            lllllllllllllIlIlIlllIIIIlIIlIll = WorldGenBigTree.lllllIlIIIlII[0];
        }
        final int lllllllllllllIlIlIlllIIIIlIIlIlI = this.basePos.getY() + this.height;
        int lllllllllllllIlIlIlllIIIIlIIlIIl = this.heightLimit - this.leafDistanceLimit;
        this.field_175948_j = (List<FoliageCoordinates>)Lists.newArrayList();
        this.field_175948_j.add(new FoliageCoordinates(this.basePos.up(lllllllllllllIlIlIlllIIIIlIIlIIl), lllllllllllllIlIlIlllIIIIlIIlIlI));
        "".length();
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!lIlIlllIIllIIII(lllllllllllllIlIlIlllIIIIlIIlIIl)) {
            final float lllllllllllllIlIlIlllIIIIlIIlIII = this.layerSize(lllllllllllllIlIlIlllIIIIlIIlIIl);
            if (lIlIlllIIlIllII(lIlIlllIIlIlIII(lllllllllllllIlIlIlllIIIIlIIlIII, 0.0f))) {
                int lllllllllllllIlIlIlllIIIIlIIIlll = WorldGenBigTree.lllllIlIIIlII[3];
                "".length();
                if (" ".length() < 0) {
                    return;
                }
                while (!lIlIlllIIlIlIlI(lllllllllllllIlIlIlllIIIIlIIIlll, lllllllllllllIlIlIlllIIIIlIIlIll)) {
                    final double lllllllllllllIlIlIlllIIIIlIIIllI = this.scaleWidth * lllllllllllllIlIlIlllIIIIlIIlIII * (this.rand.nextFloat() + 0.328);
                    final double lllllllllllllIlIlIlllIIIIlIIIlIl = this.rand.nextFloat() * 2.0f * 3.141592653589793;
                    final double lllllllllllllIlIlIlllIIIIlIIIlII = lllllllllllllIlIlIlllIIIIlIIIllI * Math.sin(lllllllllllllIlIlIlllIIIIlIIIlIl) + 0.5;
                    final double lllllllllllllIlIlIlllIIIIlIIIIll = lllllllllllllIlIlIlllIIIIlIIIllI * Math.cos(lllllllllllllIlIlIlllIIIIlIIIlIl) + 0.5;
                    final BlockPos lllllllllllllIlIlIlllIIIIlIIIIlI = this.basePos.add(lllllllllllllIlIlIlllIIIIlIIIlII, lllllllllllllIlIlIlllIIIIlIIlIIl - WorldGenBigTree.lllllIlIIIlII[0], lllllllllllllIlIlIlllIIIIlIIIIll);
                    final BlockPos lllllllllllllIlIlIlllIIIIlIIIIIl = lllllllllllllIlIlIlllIIIIlIIIIlI.up(this.leafDistanceLimit);
                    if (lIlIlllIIlIlllI(this.checkBlockLine(lllllllllllllIlIlIlllIIIIlIIIIlI, lllllllllllllIlIlIlllIIIIlIIIIIl), WorldGenBigTree.lllllIlIIIlII[4])) {
                        final int lllllllllllllIlIlIlllIIIIlIIIIII = this.basePos.getX() - lllllllllllllIlIlIlllIIIIlIIIIlI.getX();
                        final int lllllllllllllIlIlIlllIIIIIllllll = this.basePos.getZ() - lllllllllllllIlIlIlllIIIIlIIIIlI.getZ();
                        final double lllllllllllllIlIlIlllIIIIIlllllI = lllllllllllllIlIlIlllIIIIlIIIIlI.getY() - Math.sqrt(lllllllllllllIlIlIlllIIIIlIIIIII * lllllllllllllIlIlIlllIIIIlIIIIII + lllllllllllllIlIlIlllIIIIIllllll * lllllllllllllIlIlIlllIIIIIllllll) * this.branchSlope;
                        int n;
                        if (lIlIlllIIlIllll(lIlIlllIIlIlIIl(lllllllllllllIlIlIlllIIIIIlllllI, lllllllllllllIlIlIlllIIIIlIIlIlI))) {
                            n = lllllllllllllIlIlIlllIIIIlIIlIlI;
                            "".length();
                            if (-"   ".length() > 0) {
                                return;
                            }
                        }
                        else {
                            n = (int)lllllllllllllIlIlIlllIIIIIlllllI;
                        }
                        final int lllllllllllllIlIlIlllIIIIIllllIl = n;
                        final BlockPos lllllllllllllIlIlIlllIIIIIllllII = new BlockPos(this.basePos.getX(), lllllllllllllIlIlIlllIIIIIllllIl, this.basePos.getZ());
                        if (lIlIlllIIlIlllI(this.checkBlockLine(lllllllllllllIlIlIlllIIIIIllllII, lllllllllllllIlIlIlllIIIIlIIIIlI), WorldGenBigTree.lllllIlIIIlII[4])) {
                            this.field_175948_j.add(new FoliageCoordinates(lllllllllllllIlIlIlllIIIIlIIIIlI, lllllllllllllIlIlIlllIIIIIllllII.getY()));
                            "".length();
                        }
                    }
                    ++lllllllllllllIlIlIlllIIIIlIIIlll;
                }
            }
            --lllllllllllllIlIlIlllIIIIlIIlIIl;
        }
    }
    
    private static int lIlIlllIIllIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIlIlllIIllIIll(final Object lllllllllllllIlIlIllIlllIIIIIIlI, final Object lllllllllllllIlIlIllIlllIIIIIIIl) {
        return lllllllllllllIlIlIllIlllIIIIIIlI != lllllllllllllIlIlIllIlllIIIIIIIl;
    }
    
    private static int lIlIlllIIlllIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIlllIIlllIIl(final int lllllllllllllIlIlIllIllIlllllIll) {
        return lllllllllllllIlIlIllIllIlllllIll != 0;
    }
    
    void generateLeaves() {
        final boolean lllllllllllllIlIlIllIllllIlIIllI = (boolean)this.field_175948_j.iterator();
        "".length();
        if (-"  ".length() > 0) {
            return;
        }
        while (!lIlIlllIIlllIII(((Iterator)lllllllllllllIlIlIllIllllIlIIllI).hasNext() ? 1 : 0)) {
            final FoliageCoordinates lllllllllllllIlIlIllIllllIlIlIIl = ((Iterator<FoliageCoordinates>)lllllllllllllIlIlIllIllllIlIIllI).next();
            this.generateLeafNode(lllllllllllllIlIlIllIllllIlIlIIl);
        }
    }
    
    private static boolean lIlIlllIIllIlII(final Object lllllllllllllIlIlIllIllIlllllllI, final Object lllllllllllllIlIlIllIllIllllllIl) {
        return lllllllllllllIlIlIllIllIlllllllI == lllllllllllllIlIlIllIllIllllllIl;
    }
    
    private static boolean lIlIlllIIlIlllI(final int lllllllllllllIlIlIllIlllIIIlIIlI, final int lllllllllllllIlIlIllIlllIIIlIIIl) {
        return lllllllllllllIlIlIllIlllIIIlIIlI == lllllllllllllIlIlIllIlllIIIlIIIl;
    }
    
    static {
        lIlIlllIIlIIlll();
    }
    
    private static boolean lIlIlllIIlIllII(final int lllllllllllllIlIlIllIllIllllIlll) {
        return lllllllllllllIlIlIllIllIllllIlll >= 0;
    }
    
    private static int lIlIlllIIllIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIlIlllIIlIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIlllIIlllIII(final int lllllllllllllIlIlIllIllIlllllIIl) {
        return lllllllllllllIlIlIllIllIlllllIIl == 0;
    }
    
    float leafSize(final int lllllllllllllIlIlIllIlllllllllIl) {
        float n;
        if (lIlIlllIIlIllII(lllllllllllllIlIlIllIlllllllllIl) && lIlIlllIIlIlIll(lllllllllllllIlIlIllIlllllllllIl, this.leafDistanceLimit)) {
            if (lIlIlllIIlllIIl(lllllllllllllIlIlIllIlllllllllIl) && lIlIlllIIlllIlI(lllllllllllllIlIlIllIlllllllllIl, this.leafDistanceLimit - WorldGenBigTree.lllllIlIIIlII[0])) {
                n = 3.0f;
                "".length();
                if (-" ".length() > 0) {
                    return 0.0f;
                }
            }
            else {
                n = 2.0f;
                "".length();
                if (-(0x16 ^ 0x31 ^ (0x5D ^ 0x7E)) >= 0) {
                    return 0.0f;
                }
            }
        }
        else {
            n = -1.0f;
        }
        return n;
    }
    
    private static int lIlIlllIIllIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void lIlIlllIIlIIlll() {
        (lllllIlIIIlII = new int[8])[0] = " ".length();
        WorldGenBigTree.lllllIlIIIlII[1] = (0x7E ^ 0x72);
        WorldGenBigTree.lllllIlIIIlII[2] = (0x5C ^ 0x58);
        WorldGenBigTree.lllllIlIIIlII[3] = ((0x36 ^ 0x6E) & ~(0xDD ^ 0x85));
        WorldGenBigTree.lllllIlIIIlII[4] = -" ".length();
        WorldGenBigTree.lllllIlIIIlII[5] = "  ".length();
        WorldGenBigTree.lllllIlIIIlII[6] = (0x12 ^ 0x17);
        WorldGenBigTree.lllllIlIIIlII[7] = (0xD6 ^ 0x96 ^ (0xF4 ^ 0xB2));
    }
    
    void func_175937_a(final BlockPos lllllllllllllIlIlIllIllllllIIlII, final BlockPos lllllllllllllIlIlIllIllllllIIIll, final Block lllllllllllllIlIlIllIllllllIIIlI) {
        final BlockPos lllllllllllllIlIlIllIllllllIIIIl = lllllllllllllIlIlIllIllllllIIIll.add(-lllllllllllllIlIlIllIllllllIIlII.getX(), -lllllllllllllIlIlIllIllllllIIlII.getY(), -lllllllllllllIlIlIllIllllllIIlII.getZ());
        final int lllllllllllllIlIlIllIllllllIIIII = this.getGreatestDistance(lllllllllllllIlIlIllIllllllIIIIl);
        final float lllllllllllllIlIlIllIlllllIlllll = lllllllllllllIlIlIllIllllllIIIIl.getX() / (float)lllllllllllllIlIlIllIllllllIIIII;
        final float lllllllllllllIlIlIllIlllllIllllI = lllllllllllllIlIlIllIllllllIIIIl.getY() / (float)lllllllllllllIlIlIllIllllllIIIII;
        final float lllllllllllllIlIlIllIlllllIlllIl = lllllllllllllIlIlIllIllllllIIIIl.getZ() / (float)lllllllllllllIlIlIllIllllllIIIII;
        int lllllllllllllIlIlIllIlllllIlllII = WorldGenBigTree.lllllIlIIIlII[3];
        "".length();
        if (((0x44 ^ 0x48) & ~(0xBB ^ 0xB7)) != (" ".length() & ~" ".length())) {
            return;
        }
        while (!lIlIlllIIllIlIl(lllllllllllllIlIlIllIlllllIlllII, lllllllllllllIlIlIllIllllllIIIII)) {
            final BlockPos lllllllllllllIlIlIllIlllllIllIll = lllllllllllllIlIlIllIllllllIIlII.add(0.5f + lllllllllllllIlIlIllIlllllIlllII * lllllllllllllIlIlIllIlllllIlllll, 0.5f + lllllllllllllIlIlIllIlllllIlllII * lllllllllllllIlIlIllIlllllIllllI, 0.5f + lllllllllllllIlIlIllIlllllIlllII * lllllllllllllIlIlIllIlllllIlllIl);
            final BlockLog.EnumAxis lllllllllllllIlIlIllIlllllIllIlI = this.func_175938_b(lllllllllllllIlIlIllIllllllIIlII, lllllllllllllIlIlIllIlllllIllIll);
            this.setBlockAndNotifyAdequately(this.world, lllllllllllllIlIlIllIlllllIllIll, lllllllllllllIlIlIllIllllllIIIlI.getDefaultState().withProperty(BlockLog.LOG_AXIS, lllllllllllllIlIlIllIlllllIllIlI));
            ++lllllllllllllIlIlIllIlllllIlllII;
        }
    }
    
    float layerSize(final int lllllllllllllIlIlIlllIIIIIIIlIIl) {
        if (lIlIlllIIllIIII(lIlIlllIIllIllI((float)lllllllllllllIlIlIlllIIIIIIIlIIl, this.heightLimit * 0.3f))) {
            return -1.0f;
        }
        final float lllllllllllllIlIlIlllIIIIIIIlIII = this.heightLimit / 2.0f;
        final float lllllllllllllIlIlIlllIIIIIIIIlll = lllllllllllllIlIlIlllIIIIIIIlIII - lllllllllllllIlIlIlllIIIIIIIlIIl;
        float lllllllllllllIlIlIlllIIIIIIIIllI = MathHelper.sqrt_float(lllllllllllllIlIlIlllIIIIIIIlIII * lllllllllllllIlIlIlllIIIIIIIlIII - lllllllllllllIlIlIlllIIIIIIIIlll * lllllllllllllIlIlIlllIIIIIIIIlll);
        if (lIlIlllIIlllIII(lIlIlllIIllIlll(lllllllllllllIlIlIlllIIIIIIIIlll, 0.0f))) {
            lllllllllllllIlIlIlllIIIIIIIIllI = lllllllllllllIlIlIlllIIIIIIIlIII;
            "".length();
            if (null != null) {
                return 0.0f;
            }
        }
        else if (lIlIlllIIlIllII(lIlIlllIIllIlll(Math.abs(lllllllllllllIlIlIlllIIIIIIIIlll), lllllllllllllIlIlIlllIIIIIIIlIII))) {
            return 0.0f;
        }
        return lllllllllllllIlIlIlllIIIIIIIIllI * 0.5f;
    }
    
    private static boolean lIlIlllIIllIIlI(final int lllllllllllllIlIlIllIllIllllIIll) {
        return lllllllllllllIlIlIllIllIllllIIll <= 0;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIlIlIllIlllIIlIIllI, final Random lllllllllllllIlIlIllIlllIIlIllII, final BlockPos lllllllllllllIlIlIllIlllIIlIlIlI) {
        this.world = lllllllllllllIlIlIllIlllIIlIIllI;
        this.basePos = lllllllllllllIlIlIllIlllIIlIlIlI;
        this.rand = new Random(lllllllllllllIlIlIllIlllIIlIllII.nextLong());
        if (lIlIlllIIlllIII(this.heightLimit)) {
            this.heightLimit = WorldGenBigTree.lllllIlIIIlII[6] + this.rand.nextInt(this.heightLimitLimit);
        }
        if (lIlIlllIIlllIII(this.validTreeLocation() ? 1 : 0)) {
            return WorldGenBigTree.lllllIlIIIlII[3] != 0;
        }
        this.generateLeafNodeList();
        this.generateLeaves();
        this.generateTrunk();
        this.generateLeafNodeBases();
        return WorldGenBigTree.lllllIlIIIlII[0] != 0;
    }
    
    private static boolean lIlIlllIIlIlIlI(final int lllllllllllllIlIlIllIlllIIIIlllI, final int lllllllllllllIlIlIllIlllIIIIllIl) {
        return lllllllllllllIlIlIllIlllIIIIlllI >= lllllllllllllIlIlIllIlllIIIIllIl;
    }
    
    private static boolean lIlIlllIIllIIII(final int lllllllllllllIlIlIllIllIllllIlIl) {
        return lllllllllllllIlIlIllIllIllllIlIl < 0;
    }
    
    void generateLeafNodeBases() {
        final short lllllllllllllIlIlIllIlllIlllllII = (short)this.field_175948_j.iterator();
        "".length();
        if (((0xC ^ 0x2E ^ (0x64 ^ 0x51)) & (0x1B ^ 0x56 ^ (0xE5 ^ 0xBF) ^ -" ".length()) & (((0xF2 ^ 0xA7 ^ (0x31 ^ 0x6E)) & (0xDB ^ 0xA2 ^ (0xF8 ^ 0x8B) ^ -" ".length())) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIlIlllIIlllIII(((Iterator)lllllllllllllIlIlIllIlllIlllllII).hasNext() ? 1 : 0)) {
            final FoliageCoordinates lllllllllllllIlIlIllIllllIIIllIl = ((Iterator<FoliageCoordinates>)lllllllllllllIlIlIllIlllIlllllII).next();
            final int lllllllllllllIlIlIllIllllIIIllII = lllllllllllllIlIlIllIllllIIIllIl.func_177999_q();
            final BlockPos lllllllllllllIlIlIllIllllIIIIIIl = new BlockPos(this.basePos.getX(), lllllllllllllIlIlIllIllllIIIllII, this.basePos.getZ());
            if (lIlIlllIIlllIII(lllllllllllllIlIlIllIllllIIIIIIl.equals(lllllllllllllIlIlIllIllllIIIllIl) ? 1 : 0) && lIlIlllIIlllIIl(this.leafNodeNeedsBase(lllllllllllllIlIlIllIllllIIIllII - this.basePos.getY()) ? 1 : 0)) {
                this.func_175937_a(lllllllllllllIlIlIllIllllIIIIIIl, lllllllllllllIlIlIllIllllIIIllIl, Blocks.log);
            }
        }
    }
    
    private static boolean lIlIlllIIlllIlI(final int lllllllllllllIlIlIllIllIlllIlllI, final int lllllllllllllIlIlIllIllIlllIllIl) {
        return lllllllllllllIlIlIllIllIlllIlllI != lllllllllllllIlIlIllIllIlllIllIl;
    }
    
    boolean leafNodeNeedsBase(final int lllllllllllllIlIlIllIllllIlIIIlI) {
        if (lIlIlllIIlIllII(lIlIlllIIlllIll(lllllllllllllIlIlIllIllllIlIIIlI, this.heightLimit * 0.2))) {
            return WorldGenBigTree.lllllIlIIIlII[0] != 0;
        }
        return WorldGenBigTree.lllllIlIIIlII[3] != 0;
    }
    
    public WorldGenBigTree(final boolean lllllllllllllIlIlIlllIIIIllIIIII) {
        super(lllllllllllllIlIlIlllIIIIllIIIII);
        this.basePos = BlockPos.ORIGIN;
        this.heightAttenuation = 0.618;
        this.branchSlope = 0.381;
        this.scaleWidth = 1.0;
        this.leafDensity = 1.0;
        this.trunkSize = WorldGenBigTree.lllllIlIIIlII[0];
        this.heightLimitLimit = WorldGenBigTree.lllllIlIIIlII[1];
        this.leafDistanceLimit = WorldGenBigTree.lllllIlIIIlII[2];
    }
    
    private static boolean lIlIlllIIlIllll(final int lllllllllllllIlIlIllIllIllllIIIl) {
        return lllllllllllllIlIlIllIllIllllIIIl > 0;
    }
    
    private boolean validTreeLocation() {
        final Block lllllllllllllIlIlIllIlllIIIllIIl = this.world.getBlockState(this.basePos.down()).getBlock();
        if (lIlIlllIIllIIll(lllllllllllllIlIlIllIlllIIIllIIl, Blocks.dirt) && lIlIlllIIllIIll(lllllllllllllIlIlIllIlllIIIllIIl, Blocks.grass) && lIlIlllIIllIIll(lllllllllllllIlIlIllIlllIIIllIIl, Blocks.farmland)) {
            return WorldGenBigTree.lllllIlIIIlII[3] != 0;
        }
        final int lllllllllllllIlIlIllIlllIIIllIII = this.checkBlockLine(this.basePos, this.basePos.up(this.heightLimit - WorldGenBigTree.lllllIlIIIlII[0]));
        if (lIlIlllIIlIlllI(lllllllllllllIlIlIllIlllIIIllIII, WorldGenBigTree.lllllIlIIIlII[4])) {
            return WorldGenBigTree.lllllIlIIIlII[0] != 0;
        }
        if (lIlIlllIIlIlIll(lllllllllllllIlIlIllIlllIIIllIII, WorldGenBigTree.lllllIlIIIlII[7])) {
            return WorldGenBigTree.lllllIlIIIlII[3] != 0;
        }
        this.heightLimit = lllllllllllllIlIlIllIlllIIIllIII;
        return WorldGenBigTree.lllllIlIIIlII[0] != 0;
    }
    
    static class FoliageCoordinates extends BlockPos
    {
        private final /* synthetic */ int field_178000_b;
        
        public int func_177999_q() {
            return this.field_178000_b;
        }
        
        public FoliageCoordinates(final BlockPos llllllllllllIllIlIlIIlIIIIlIlllI, final int llllllllllllIllIlIlIIlIIIIlIllIl) {
            super(llllllllllllIllIlIlIIlIIIIlIlllI.getX(), llllllllllllIllIlIlIIlIIIIlIlllI.getY(), llllllllllllIllIlIlIIlIIIIlIlllI.getZ());
            this.field_178000_b = llllllllllllIllIlIlIIlIIIIlIllIl;
        }
    }
}
