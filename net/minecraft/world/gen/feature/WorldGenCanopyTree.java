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
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;

public class WorldGenCanopyTree extends WorldGenAbstractTree
{
    private static final /* synthetic */ IBlockState field_181641_b;
    private static final /* synthetic */ int[] llIIllllIIlIIl;
    private static final /* synthetic */ IBlockState field_181640_a;
    
    private static boolean lIIlIIIIIIIllIlI(final int llllllllllllIllIlllIllIlIlIIllll, final int llllllllllllIllIlllIllIlIlIIlllI) {
        return llllllllllllIllIlllIllIlIlIIllll > llllllllllllIllIlllIllIlIlIIlllI;
    }
    
    private static boolean lIIlIIIIIIIlIllI(final int llllllllllllIllIlllIllIlIlIIIIlI) {
        return llllllllllllIllIlllIllIlIlIIIIlI == 0;
    }
    
    private static boolean lIIlIIIIIIIlIlIl(final Object llllllllllllIllIlllIllIlIlIIlIll, final Object llllllllllllIllIlllIllIlIlIIlIlI) {
        return llllllllllllIllIlllIllIlIlIIlIll != llllllllllllIllIlllIllIlIlIIlIlI;
    }
    
    private static boolean lIIlIIIIIIIlllll(final int llllllllllllIllIlllIllIlIIlllllI) {
        return llllllllllllIllIlllIllIlIIlllllI <= 0;
    }
    
    public WorldGenCanopyTree(final boolean llllllllllllIllIlllIllIlllllIIIl) {
        super(llllllllllllIllIlllIllIlllllIIIl);
    }
    
    private static boolean lIIlIIIIIIIllllI(final int llllllllllllIllIlllIllIlIlIIIIII) {
        return llllllllllllIllIlllIllIlIlIIIIII >= 0;
    }
    
    private static boolean lIIlIIIIIIIlIIll(final int llllllllllllIllIlllIllIlIlIllIll, final int llllllllllllIllIlllIllIlIlIllIlI) {
        return llllllllllllIllIlllIllIlIlIllIll >= llllllllllllIllIlllIllIlIlIllIlI;
    }
    
    private static boolean lIIlIIIIIIIlllII(final int llllllllllllIllIlllIllIlIIlllIIl, final int llllllllllllIllIlllIllIlIIlllIII) {
        return llllllllllllIllIlllIllIlIIlllIIl != llllllllllllIllIlllIllIlIIlllIII;
    }
    
    private static boolean lIIlIIIIIIIllIIl(final int llllllllllllIllIlllIllIlIlIlIIll, final int llllllllllllIllIlllIllIlIlIlIIlI) {
        return llllllllllllIllIlllIllIlIlIlIIll <= llllllllllllIllIlllIllIlIlIlIIlI;
    }
    
    @Override
    public boolean generate(final World llllllllllllIllIlllIllIllIllIlll, final Random llllllllllllIllIlllIllIlllIlIlll, final BlockPos llllllllllllIllIlllIllIlllIlIllI) {
        final int llllllllllllIllIlllIllIlllIlIlIl = llllllllllllIllIlllIllIlllIlIlll.nextInt(WorldGenCanopyTree.llIIllllIIlIIl[1]) + llllllllllllIllIlllIllIlllIlIlll.nextInt(WorldGenCanopyTree.llIIllllIIlIIl[2]) + WorldGenCanopyTree.llIIllllIIlIIl[3];
        final int llllllllllllIllIlllIllIlllIlIlII = llllllllllllIllIlllIllIlllIlIllI.getX();
        final int llllllllllllIllIlllIllIlllIlIIll = llllllllllllIllIlllIllIlllIlIllI.getY();
        final int llllllllllllIllIlllIllIlllIlIIlI = llllllllllllIllIlllIllIlllIlIllI.getZ();
        if (!lIIlIIIIIIIlIIll(llllllllllllIllIlllIllIlllIlIIll, WorldGenCanopyTree.llIIllllIIlIIl[4]) || !lIIlIIIIIIIlIlII(llllllllllllIllIlllIllIlllIlIIll + llllllllllllIllIlllIllIlllIlIlIl + WorldGenCanopyTree.llIIllllIIlIIl[4], WorldGenCanopyTree.llIIllllIIlIIl[5])) {
            return WorldGenCanopyTree.llIIllllIIlIIl[0] != 0;
        }
        final BlockPos llllllllllllIllIlllIllIlllIlIIIl = llllllllllllIllIlllIllIlllIlIllI.down();
        final Block llllllllllllIllIlllIllIlllIlIIII = llllllllllllIllIlllIllIllIllIlll.getBlockState(llllllllllllIllIlllIllIlllIlIIIl).getBlock();
        if (lIIlIIIIIIIlIlIl(llllllllllllIllIlllIllIlllIlIIII, Blocks.grass) && lIIlIIIIIIIlIlIl(llllllllllllIllIlllIllIlllIlIIII, Blocks.dirt)) {
            return WorldGenCanopyTree.llIIllllIIlIIl[0] != 0;
        }
        if (lIIlIIIIIIIlIllI(this.func_181638_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIlIllI, llllllllllllIllIlllIllIlllIlIlIl) ? 1 : 0)) {
            return WorldGenCanopyTree.llIIllllIIlIIl[0] != 0;
        }
        this.func_175921_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIlIIIl);
        this.func_175921_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIlIIIl.east());
        this.func_175921_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIlIIIl.south());
        this.func_175921_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIlIIIl.south().east());
        final EnumFacing llllllllllllIllIlllIllIlllIIllll = EnumFacing.Plane.HORIZONTAL.random(llllllllllllIllIlllIllIlllIlIlll);
        final int llllllllllllIllIlllIllIlllIIlllI = llllllllllllIllIlllIllIlllIlIlIl - llllllllllllIllIlllIllIlllIlIlll.nextInt(WorldGenCanopyTree.llIIllllIIlIIl[6]);
        int llllllllllllIllIlllIllIlllIIllIl = WorldGenCanopyTree.llIIllllIIlIIl[2] - llllllllllllIllIlllIllIlllIlIlll.nextInt(WorldGenCanopyTree.llIIllllIIlIIl[1]);
        int llllllllllllIllIlllIllIlllIIllII = llllllllllllIllIlllIllIlllIlIlII;
        int llllllllllllIllIlllIllIlllIIlIll = llllllllllllIllIlllIllIlllIlIIlI;
        final int llllllllllllIllIlllIllIlllIIlIlI = llllllllllllIllIlllIllIlllIlIIll + llllllllllllIllIlllIllIlllIlIlIl - WorldGenCanopyTree.llIIllllIIlIIl[4];
        int llllllllllllIllIlllIllIlllIIlIIl = WorldGenCanopyTree.llIIllllIIlIIl[0];
        "".length();
        if (null != null) {
            return ((75 + 138 - 170 + 124 ^ 42 + 54 + 57 + 38) & (0x5B ^ 0x3B ^ (0xF9 ^ 0x81) ^ -" ".length())) != 0x0;
        }
        while (!lIIlIIIIIIIlIIll(llllllllllllIllIlllIllIlllIIlIIl, llllllllllllIllIlllIllIlllIlIlIl)) {
            if (lIIlIIIIIIIlIIll(llllllllllllIllIlllIllIlllIIlIIl, llllllllllllIllIlllIllIlllIIlllI) && lIIlIIIIIIIlIlll(llllllllllllIllIlllIllIlllIIllIl)) {
                llllllllllllIllIlllIllIlllIIllII += llllllllllllIllIlllIllIlllIIllll.getFrontOffsetX();
                llllllllllllIllIlllIllIlllIIlIll += llllllllllllIllIlllIllIlllIIllll.getFrontOffsetZ();
                --llllllllllllIllIlllIllIlllIIllIl;
            }
            final int llllllllllllIllIlllIllIlllIIlIII = llllllllllllIllIlllIllIlllIlIIll + llllllllllllIllIlllIllIlllIIlIIl;
            final BlockPos llllllllllllIllIlllIllIlllIIIlll = new BlockPos(llllllllllllIllIlllIllIlllIIllII, llllllllllllIllIlllIllIlllIIlIII, llllllllllllIllIlllIllIlllIIlIll);
            final Material llllllllllllIllIlllIllIlllIIIllI = llllllllllllIllIlllIllIllIllIlll.getBlockState(llllllllllllIllIlllIllIlllIIIlll).getBlock().getMaterial();
            if (!lIIlIIIIIIIlIlIl(llllllllllllIllIlllIllIlllIIIllI, Material.air) || lIIlIIIIIIIllIII(llllllllllllIllIlllIllIlllIIIllI, Material.leaves)) {
                this.func_181639_b(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIIlll);
                this.func_181639_b(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIIlll.east());
                this.func_181639_b(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIIlll.south());
                this.func_181639_b(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIIlll.east().south());
            }
            ++llllllllllllIllIlllIllIlllIIlIIl;
        }
        int llllllllllllIllIlllIllIlllIIIlIl = WorldGenCanopyTree.llIIllllIIlIIl[7];
        "".length();
        if (" ".length() <= -" ".length()) {
            return ((0x87 ^ 0xBA) & ~(0xB ^ 0x36)) != 0x0;
        }
        while (!lIIlIIIIIIIlIlll(llllllllllllIllIlllIllIlllIIIlIl)) {
            int llllllllllllIllIlllIllIlllIIIlII = WorldGenCanopyTree.llIIllllIIlIIl[7];
            "".length();
            if (null != null) {
                return ((0xB ^ 0x55 ^ (0xE ^ 0x45)) & (0x7 ^ 0x61 ^ (0xE6 ^ 0x95) ^ -" ".length()) & (((110 + 47 - 150 + 170 ^ 112 + 140 - 217 + 146) & (0xEC ^ 0x8F ^ (0x16 ^ 0x71) ^ -" ".length())) ^ -" ".length())) != 0x0;
            }
            while (!lIIlIIIIIIIlIlll(llllllllllllIllIlllIllIlllIIIlII)) {
                int llllllllllllIllIlllIllIlllIIIIll = WorldGenCanopyTree.llIIllllIIlIIl[8];
                this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII + llllllllllllIllIlllIllIlllIIIlIl, llllllllllllIllIlllIllIlllIIlIlI + llllllllllllIllIlllIllIlllIIIIll, llllllllllllIllIlllIllIlllIIlIll + llllllllllllIllIlllIllIlllIIIlII);
                this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, WorldGenCanopyTree.llIIllllIIlIIl[4] + llllllllllllIllIlllIllIlllIIllII - llllllllllllIllIlllIllIlllIIIlIl, llllllllllllIllIlllIllIlllIIlIlI + llllllllllllIllIlllIllIlllIIIIll, llllllllllllIllIlllIllIlllIIlIll + llllllllllllIllIlllIllIlllIIIlII);
                this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII + llllllllllllIllIlllIllIlllIIIlIl, llllllllllllIllIlllIllIlllIIlIlI + llllllllllllIllIlllIllIlllIIIIll, WorldGenCanopyTree.llIIllllIIlIIl[4] + llllllllllllIllIlllIllIlllIIlIll - llllllllllllIllIlllIllIlllIIIlII);
                this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, WorldGenCanopyTree.llIIllllIIlIIl[4] + llllllllllllIllIlllIllIlllIIllII - llllllllllllIllIlllIllIlllIIIlIl, llllllllllllIllIlllIllIlllIIlIlI + llllllllllllIllIlllIllIlllIIIIll, WorldGenCanopyTree.llIIllllIIlIIl[4] + llllllllllllIllIlllIllIlllIIlIll - llllllllllllIllIlllIllIlllIIIlII);
                if ((!lIIlIIIIIIIllIIl(llllllllllllIllIlllIllIlllIIIlIl, WorldGenCanopyTree.llIIllllIIlIIl[7]) || lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIlllIIIlII, WorldGenCanopyTree.llIIllllIIlIIl[8])) && (!lIIlIIIIIIIllIll(llllllllllllIllIlllIllIlllIIIlIl, WorldGenCanopyTree.llIIllllIIlIIl[8]) || lIIlIIIIIIIlllII(llllllllllllIllIlllIllIlllIIIlII, WorldGenCanopyTree.llIIllllIIlIIl[7]))) {
                    llllllllllllIllIlllIllIlllIIIIll = WorldGenCanopyTree.llIIllllIIlIIl[4];
                    this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII + llllllllllllIllIlllIllIlllIIIlIl, llllllllllllIllIlllIllIlllIIlIlI + llllllllllllIllIlllIllIlllIIIIll, llllllllllllIllIlllIllIlllIIlIll + llllllllllllIllIlllIllIlllIIIlII);
                    this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, WorldGenCanopyTree.llIIllllIIlIIl[4] + llllllllllllIllIlllIllIlllIIllII - llllllllllllIllIlllIllIlllIIIlIl, llllllllllllIllIlllIllIlllIIlIlI + llllllllllllIllIlllIllIlllIIIIll, llllllllllllIllIlllIllIlllIIlIll + llllllllllllIllIlllIllIlllIIIlII);
                    this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII + llllllllllllIllIlllIllIlllIIIlIl, llllllllllllIllIlllIllIlllIIlIlI + llllllllllllIllIlllIllIlllIIIIll, WorldGenCanopyTree.llIIllllIIlIIl[4] + llllllllllllIllIlllIllIlllIIlIll - llllllllllllIllIlllIllIlllIIIlII);
                    this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, WorldGenCanopyTree.llIIllllIIlIIl[4] + llllllllllllIllIlllIllIlllIIllII - llllllllllllIllIlllIllIlllIIIlIl, llllllllllllIllIlllIllIlllIIlIlI + llllllllllllIllIlllIllIlllIIIIll, WorldGenCanopyTree.llIIllllIIlIIl[4] + llllllllllllIllIlllIllIlllIIlIll - llllllllllllIllIlllIllIlllIIIlII);
                }
                ++llllllllllllIllIlllIllIlllIIIlII;
            }
            ++llllllllllllIllIlllIllIlllIIIlIl;
        }
        if (lIIlIIIIIIIlllIl(llllllllllllIllIlllIllIlllIlIlll.nextBoolean() ? 1 : 0)) {
            this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII, llllllllllllIllIlllIllIlllIIlIlI + WorldGenCanopyTree.llIIllllIIlIIl[2], llllllllllllIllIlllIllIlllIIlIll);
            this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII + WorldGenCanopyTree.llIIllllIIlIIl[4], llllllllllllIllIlllIllIlllIIlIlI + WorldGenCanopyTree.llIIllllIIlIIl[2], llllllllllllIllIlllIllIlllIIlIll);
            this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII + WorldGenCanopyTree.llIIllllIIlIIl[4], llllllllllllIllIlllIllIlllIIlIlI + WorldGenCanopyTree.llIIllllIIlIIl[2], llllllllllllIllIlllIllIlllIIlIll + WorldGenCanopyTree.llIIllllIIlIIl[4]);
            this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII, llllllllllllIllIlllIllIlllIIlIlI + WorldGenCanopyTree.llIIllllIIlIIl[2], llllllllllllIllIlllIllIlllIIlIll + WorldGenCanopyTree.llIIllllIIlIIl[4]);
        }
        int llllllllllllIllIlllIllIlllIIIIlI = WorldGenCanopyTree.llIIllllIIlIIl[9];
        "".length();
        if ((66 + 153 - 201 + 140 ^ 9 + 1 + 61 + 83) == 0x0) {
            return ((0x12 ^ 0x51 ^ (0x56 ^ 0x26)) & (0x95 ^ 0xC2 ^ (0x2E ^ 0x4A) ^ -" ".length())) != 0x0;
        }
        while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIlllIIIIlI, WorldGenCanopyTree.llIIllllIIlIIl[6])) {
            int llllllllllllIllIlllIllIlllIIIIIl = WorldGenCanopyTree.llIIllllIIlIIl[9];
            "".length();
            if (((0x80 ^ 0xAA) & ~(0x2A ^ 0x0)) == "  ".length()) {
                return ((0xA9 ^ 0x9E) & ~(0x16 ^ 0x21)) != 0x0;
            }
            while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIlllIIIIIl, WorldGenCanopyTree.llIIllllIIlIIl[6])) {
                if ((!lIIlIIIIIIIllIll(llllllllllllIllIlllIllIlllIIIIlI, WorldGenCanopyTree.llIIllllIIlIIl[9]) || lIIlIIIIIIIlllII(llllllllllllIllIlllIllIlllIIIIIl, WorldGenCanopyTree.llIIllllIIlIIl[9])) && (!lIIlIIIIIIIllIll(llllllllllllIllIlllIllIlllIIIIlI, WorldGenCanopyTree.llIIllllIIlIIl[9]) || lIIlIIIIIIIlllII(llllllllllllIllIlllIllIlllIIIIIl, WorldGenCanopyTree.llIIllllIIlIIl[6])) && (!lIIlIIIIIIIllIll(llllllllllllIllIlllIllIlllIIIIlI, WorldGenCanopyTree.llIIllllIIlIIl[6]) || lIIlIIIIIIIlllII(llllllllllllIllIlllIllIlllIIIIIl, WorldGenCanopyTree.llIIllllIIlIIl[9])) && (!lIIlIIIIIIIllIll(llllllllllllIllIlllIllIlllIIIIlI, WorldGenCanopyTree.llIIllllIIlIIl[6]) || lIIlIIIIIIIlllII(llllllllllllIllIlllIllIlllIIIIIl, WorldGenCanopyTree.llIIllllIIlIIl[6])) && (!lIIlIIIIIIIlIIll(Math.abs(llllllllllllIllIlllIllIlllIIIIlI), WorldGenCanopyTree.llIIllllIIlIIl[1]) || lIIlIIIIIIIlIlII(Math.abs(llllllllllllIllIlllIllIlllIIIIIl), WorldGenCanopyTree.llIIllllIIlIIl[1]))) {
                    this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII + llllllllllllIllIlllIllIlllIIIIlI, llllllllllllIllIlllIllIlllIIlIlI, llllllllllllIllIlllIllIlllIIlIll + llllllllllllIllIlllIllIlllIIIIIl);
                }
                ++llllllllllllIllIlllIllIlllIIIIIl;
            }
            ++llllllllllllIllIlllIllIlllIIIIlI;
        }
        int llllllllllllIllIlllIllIlllIIIIII = WorldGenCanopyTree.llIIllllIIlIIl[8];
        "".length();
        if ("   ".length() >= (0xC ^ 0x37 ^ (0x4B ^ 0x74))) {
            return ((0x2D ^ 0x4C ^ ((0x67 ^ 0x41) & ~(0x30 ^ 0x16))) & (215 + 7 - 52 + 61 ^ 6 + 47 - 36 + 117 ^ -" ".length())) != 0x0;
        }
        while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIlllIIIIII, WorldGenCanopyTree.llIIllllIIlIIl[2])) {
            int llllllllllllIllIlllIllIllIllllll = WorldGenCanopyTree.llIIllllIIlIIl[8];
            "".length();
            if (-(121 + 118 - 157 + 86 ^ 55 + 158 - 163 + 123) >= 0) {
                return ((0x8D ^ 0x96 ^ (0x96 ^ 0xC6)) & (118 + 60 + 35 + 12 ^ 53 + 65 - 108 + 160 ^ -" ".length())) != 0x0;
            }
            while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIllIllllll, WorldGenCanopyTree.llIIllllIIlIIl[2])) {
                if ((!lIIlIIIIIIIllllI(llllllllllllIllIlllIllIlllIIIIII) || !lIIlIIIIIIIllIIl(llllllllllllIllIlllIllIlllIIIIII, WorldGenCanopyTree.llIIllllIIlIIl[4]) || !lIIlIIIIIIIllllI(llllllllllllIllIlllIllIllIllllll) || lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIllIllllll, WorldGenCanopyTree.llIIllllIIlIIl[4])) && lIIlIIIIIIIlllll(llllllllllllIllIlllIllIlllIlIlll.nextInt(WorldGenCanopyTree.llIIllllIIlIIl[1]))) {
                    final int llllllllllllIllIlllIllIllIlllllI = llllllllllllIllIlllIllIlllIlIlll.nextInt(WorldGenCanopyTree.llIIllllIIlIIl[1]) + WorldGenCanopyTree.llIIllllIIlIIl[2];
                    int llllllllllllIllIlllIllIllIllllIl = WorldGenCanopyTree.llIIllllIIlIIl[0];
                    "".length();
                    if (null != null) {
                        return ("  ".length() & ("  ".length() ^ -" ".length())) != 0x0;
                    }
                    while (!lIIlIIIIIIIlIIll(llllllllllllIllIlllIllIllIllllIl, llllllllllllIllIlllIllIllIlllllI)) {
                        this.func_181639_b(llllllllllllIllIlllIllIllIllIlll, new BlockPos(llllllllllllIllIlllIllIlllIlIlII + llllllllllllIllIlllIllIlllIIIIII, llllllllllllIllIlllIllIlllIIlIlI - llllllllllllIllIlllIllIllIllllIl - WorldGenCanopyTree.llIIllllIIlIIl[4], llllllllllllIllIlllIllIlllIlIIlI + llllllllllllIllIlllIllIllIllllll));
                        ++llllllllllllIllIlllIllIllIllllIl;
                    }
                    int llllllllllllIllIlllIllIllIllllII = WorldGenCanopyTree.llIIllllIIlIIl[8];
                    "".length();
                    if (null != null) {
                        return ((0xFA ^ 0xA3) & ~(0xC9 ^ 0x90)) != 0x0;
                    }
                    while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIllIllllII, WorldGenCanopyTree.llIIllllIIlIIl[4])) {
                        int llllllllllllIllIlllIllIllIlllIll = WorldGenCanopyTree.llIIllllIIlIIl[8];
                        "".length();
                        if ((0x20 ^ 0x6A ^ (0x5E ^ 0x10)) != (0xA7 ^ 0xB3 ^ (0x79 ^ 0x69))) {
                            return ((76 + 141 - 67 + 3 ^ 105 + 124 - 181 + 90) & (0x4D ^ 0xA ^ (0x16 ^ 0x42) ^ -" ".length())) != 0x0;
                        }
                        while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIllIlllIll, WorldGenCanopyTree.llIIllllIIlIIl[4])) {
                            this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII + llllllllllllIllIlllIllIlllIIIIII + llllllllllllIllIlllIllIllIllllII, llllllllllllIllIlllIllIlllIIlIlI, llllllllllllIllIlllIllIlllIIlIll + llllllllllllIllIlllIllIllIllllll + llllllllllllIllIlllIllIllIlllIll);
                            ++llllllllllllIllIlllIllIllIlllIll;
                        }
                        ++llllllllllllIllIlllIllIllIllllII;
                    }
                    int llllllllllllIllIlllIllIllIlllIlI = WorldGenCanopyTree.llIIllllIIlIIl[7];
                    "".length();
                    if (((0xB6 ^ 0x94 ^ (0xE2 ^ 0xC6)) & (0x4E ^ 0x1C ^ (0x7D ^ 0x29) ^ -" ".length())) == -" ".length()) {
                        return ((0x4C ^ 0xD ^ (0x67 ^ 0x6B)) & (0xC2 ^ 0xAF ^ (0xB ^ 0x2B) ^ -" ".length())) != 0x0;
                    }
                    while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIllIlllIlI, WorldGenCanopyTree.llIIllllIIlIIl[2])) {
                        int llllllllllllIllIlllIllIllIlllIIl = WorldGenCanopyTree.llIIllllIIlIIl[7];
                        "".length();
                        if (" ".length() >= (0x89 ^ 0x8D)) {
                            return ((0xA2 ^ 0x9C) & ~(0xB9 ^ 0x87)) != 0x0;
                        }
                        while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIllIlllIIl, WorldGenCanopyTree.llIIllllIIlIIl[2])) {
                            if (!lIIlIIIIIIIllIll(Math.abs(llllllllllllIllIlllIllIllIlllIlI), WorldGenCanopyTree.llIIllllIIlIIl[2]) || lIIlIIIIIIIlllII(Math.abs(llllllllllllIllIlllIllIllIlllIIl), WorldGenCanopyTree.llIIllllIIlIIl[2])) {
                                this.func_150526_a(llllllllllllIllIlllIllIllIllIlll, llllllllllllIllIlllIllIlllIIllII + llllllllllllIllIlllIllIlllIIIIII + llllllllllllIllIlllIllIllIlllIlI, llllllllllllIllIlllIllIlllIIlIlI - WorldGenCanopyTree.llIIllllIIlIIl[4], llllllllllllIllIlllIllIlllIIlIll + llllllllllllIllIlllIllIllIllllll + llllllllllllIllIlllIllIllIlllIIl);
                            }
                            ++llllllllllllIllIlllIllIllIlllIIl;
                        }
                        ++llllllllllllIllIlllIllIllIlllIlI;
                    }
                }
                ++llllllllllllIllIlllIllIllIllllll;
            }
            ++llllllllllllIllIlllIllIlllIIIIII;
        }
        return WorldGenCanopyTree.llIIllllIIlIIl[4] != 0;
    }
    
    private static boolean lIIlIIIIIIIlllIl(final int llllllllllllIllIlllIllIlIlIIIlII) {
        return llllllllllllIllIlllIllIlIlIIIlII != 0;
    }
    
    static {
        lIIlIIIIIIIlIIlI();
        field_181640_a = Blocks.log2.getDefaultState().withProperty(BlockNewLog.VARIANT, BlockPlanks.EnumType.DARK_OAK);
        field_181641_b = Blocks.leaves2.getDefaultState().withProperty(BlockNewLeaf.VARIANT, BlockPlanks.EnumType.DARK_OAK).withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(WorldGenCanopyTree.llIIllllIIlIIl[0] != 0));
    }
    
    private void func_181639_b(final World llllllllllllIllIlllIllIlIllllIll, final BlockPos llllllllllllIllIlllIllIlIlllIlll) {
        if (lIIlIIIIIIIlllIl(this.func_150523_a(llllllllllllIllIlllIllIlIllllIll.getBlockState(llllllllllllIllIlllIllIlIlllIlll).getBlock()) ? 1 : 0)) {
            this.setBlockAndNotifyAdequately(llllllllllllIllIlllIllIlIllllIll, llllllllllllIllIlllIllIlIlllIlll, WorldGenCanopyTree.field_181640_a);
        }
    }
    
    private static void lIIlIIIIIIIlIIlI() {
        (llIIllllIIlIIl = new int[10])[0] = ((0x10 ^ 0x52 ^ (0x1C ^ 0x12)) & (0x71 ^ 0x16 ^ (0x57 ^ 0x7C) ^ -" ".length()));
        WorldGenCanopyTree.llIIllllIIlIIl[1] = "   ".length();
        WorldGenCanopyTree.llIIllllIIlIIl[2] = "  ".length();
        WorldGenCanopyTree.llIIllllIIlIIl[3] = (0x6C ^ 0x6A);
        WorldGenCanopyTree.llIIllllIIlIIl[4] = " ".length();
        WorldGenCanopyTree.llIIllllIIlIIl[5] = (-(0xFFFFDEF6 & 0x6FF9) & (0xFFFFCFEF & 0x7FFF));
        WorldGenCanopyTree.llIIllllIIlIIl[6] = (0x40 ^ 0x44);
        WorldGenCanopyTree.llIIllllIIlIIl[7] = -"  ".length();
        WorldGenCanopyTree.llIIllllIIlIIl[8] = -" ".length();
        WorldGenCanopyTree.llIIllllIIlIIl[9] = -"   ".length();
    }
    
    private static boolean lIIlIIIIIIIllIll(final int llllllllllllIllIlllIllIlIlIlllll, final int llllllllllllIllIlllIllIlIlIllllI) {
        return llllllllllllIllIlllIllIlIlIlllll == llllllllllllIllIlllIllIlIlIllllI;
    }
    
    private boolean func_181638_a(final World llllllllllllIllIlllIllIllIIIlIlI, final BlockPos llllllllllllIllIlllIllIllIIlIlIl, final int llllllllllllIllIlllIllIllIIIlIII) {
        final int llllllllllllIllIlllIllIllIIlIIll = llllllllllllIllIlllIllIllIIlIlIl.getX();
        final int llllllllllllIllIlllIllIllIIlIIlI = llllllllllllIllIlllIllIllIIlIlIl.getY();
        final int llllllllllllIllIlllIllIllIIlIIIl = llllllllllllIllIlllIllIllIIlIlIl.getZ();
        final BlockPos.MutableBlockPos llllllllllllIllIlllIllIllIIlIIII = new BlockPos.MutableBlockPos();
        int llllllllllllIllIlllIllIllIIIllll = WorldGenCanopyTree.llIIllllIIlIIl[0];
        "".length();
        if (null != null) {
            return ((0x80 ^ 0xB0) & ~(0xF6 ^ 0xC6)) != 0x0;
        }
        while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIllIIIllll, llllllllllllIllIlllIllIllIIIlIII + WorldGenCanopyTree.llIIllllIIlIIl[4])) {
            int llllllllllllIllIlllIllIllIIIlllI = WorldGenCanopyTree.llIIllllIIlIIl[4];
            if (lIIlIIIIIIIlIllI(llllllllllllIllIlllIllIllIIIllll)) {
                llllllllllllIllIlllIllIllIIIlllI = WorldGenCanopyTree.llIIllllIIlIIl[0];
            }
            if (lIIlIIIIIIIlIIll(llllllllllllIllIlllIllIllIIIllll, llllllllllllIllIlllIllIllIIIlIII - WorldGenCanopyTree.llIIllllIIlIIl[4])) {
                llllllllllllIllIlllIllIllIIIlllI = WorldGenCanopyTree.llIIllllIIlIIl[2];
            }
            int llllllllllllIllIlllIllIllIIIllIl = -llllllllllllIllIlllIllIllIIIlllI;
            "".length();
            if (((64 + 31 - 29 + 150 ^ 32 + 25 - 27 + 116) & (0x75 ^ 0x59 ^ (0x65 ^ 0x3) ^ -" ".length())) > "  ".length()) {
                return ((0x13 ^ 0x6B ^ (0x4C ^ 0x67)) & (0x98 ^ 0xC2 ^ (0x37 ^ 0x3E) ^ -" ".length())) != 0x0;
            }
            while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIllIIIllIl, llllllllllllIllIlllIllIllIIIlllI)) {
                int llllllllllllIllIlllIllIllIIIllII = -llllllllllllIllIlllIllIllIIIlllI;
                "".length();
                if (-" ".length() > (0xA2 ^ 0xA6)) {
                    return ((0x3 ^ 0x63) & ~(0x74 ^ 0x14)) != 0x0;
                }
                while (!lIIlIIIIIIIllIlI(llllllllllllIllIlllIllIllIIIllII, llllllllllllIllIlllIllIllIIIlllI)) {
                    if (lIIlIIIIIIIlIllI(this.func_150523_a(llllllllllllIllIlllIllIllIIIlIlI.getBlockState(llllllllllllIllIlllIllIllIIlIIII.func_181079_c(llllllllllllIllIlllIllIllIIlIIll + llllllllllllIllIlllIllIllIIIllIl, llllllllllllIllIlllIllIllIIlIIlI + llllllllllllIllIlllIllIllIIIllll, llllllllllllIllIlllIllIllIIlIIIl + llllllllllllIllIlllIllIllIIIllII)).getBlock()) ? 1 : 0)) {
                        return WorldGenCanopyTree.llIIllllIIlIIl[0] != 0;
                    }
                    ++llllllllllllIllIlllIllIllIIIllII;
                }
                ++llllllllllllIllIlllIllIllIIIllIl;
            }
            ++llllllllllllIllIlllIllIllIIIllll;
        }
        return WorldGenCanopyTree.llIIllllIIlIIl[4] != 0;
    }
    
    private static boolean lIIlIIIIIIIllIII(final Object llllllllllllIllIlllIllIlIlIIIlll, final Object llllllllllllIllIlllIllIlIlIIIllI) {
        return llllllllllllIllIlllIllIlIlIIIlll == llllllllllllIllIlllIllIlIlIIIllI;
    }
    
    private void func_150526_a(final World llllllllllllIllIlllIllIlIllIlllI, final int llllllllllllIllIlllIllIlIllIllIl, final int llllllllllllIllIlllIllIlIllIIlIl, final int llllllllllllIllIlllIllIlIllIIlII) {
        final BlockPos llllllllllllIllIlllIllIlIllIlIlI = new BlockPos(llllllllllllIllIlllIllIlIllIllIl, llllllllllllIllIlllIllIlIllIIlIl, llllllllllllIllIlllIllIlIllIIlII);
        final Block llllllllllllIllIlllIllIlIllIlIIl = llllllllllllIllIlllIllIlIllIlllI.getBlockState(llllllllllllIllIlllIllIlIllIlIlI).getBlock();
        if (lIIlIIIIIIIllIII(llllllllllllIllIlllIllIlIllIlIIl.getMaterial(), Material.air)) {
            this.setBlockAndNotifyAdequately(llllllllllllIllIlllIllIlIllIlllI, llllllllllllIllIlllIllIlIllIlIlI, WorldGenCanopyTree.field_181641_b);
        }
    }
    
    private static boolean lIIlIIIIIIIlIlII(final int llllllllllllIllIlllIllIlIlIlIlll, final int llllllllllllIllIlllIllIlIlIlIllI) {
        return llllllllllllIllIlllIllIlIlIlIlll < llllllllllllIllIlllIllIlIlIlIllI;
    }
    
    private static boolean lIIlIIIIIIIlIlll(final int llllllllllllIllIlllIllIlIIllllII) {
        return llllllllllllIllIlllIllIlIIllllII > 0;
    }
}
