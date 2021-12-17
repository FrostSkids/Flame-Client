// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockOldLog;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;

public class WorldGenMegaPineTree extends WorldGenHugeTrees
{
    private static final /* synthetic */ IBlockState field_181634_f;
    private static final /* synthetic */ IBlockState field_181635_g;
    private static final /* synthetic */ int[] llIIIIIIlIlllI;
    private static final /* synthetic */ IBlockState field_181633_e;
    private /* synthetic */ boolean useBaseHeight;
    
    static {
        lIIIIllIlllllIII();
        field_181633_e = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.SPRUCE);
        field_181634_f = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.SPRUCE).withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(WorldGenMegaPineTree.llIIIIIIlIlllI[0] != 0));
        field_181635_g = Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.PODZOL);
    }
    
    private static boolean lIIIIllIllllllll(final int llllllllllllIlllIlllllIIIlIlIlII) {
        return llllllllllllIlllIlllllIIIlIlIlII > 0;
    }
    
    private static boolean lIIIIllIlllllllI(final int llllllllllllIlllIlllllIIIlIllIlI) {
        return llllllllllllIlllIlllllIIIlIllIlI != 0;
    }
    
    public WorldGenMegaPineTree(final boolean llllllllllllIlllIlllllIIlllIIlll, final boolean llllllllllllIlllIlllllIIlllIlIIl) {
        super(llllllllllllIlllIlllllIIlllIIlll, WorldGenMegaPineTree.llIIIIIIlIlllI[1], WorldGenMegaPineTree.llIIIIIIlIlllI[2], WorldGenMegaPineTree.field_181633_e, WorldGenMegaPineTree.field_181634_f);
        this.useBaseHeight = llllllllllllIlllIlllllIIlllIlIIl;
    }
    
    private static boolean lIIIIllIlllllIll(final Object llllllllllllIlllIlllllIIIlIlllIl, final Object llllllllllllIlllIlllllIIIlIlllII) {
        return llllllllllllIlllIlllllIIIlIlllIl == llllllllllllIlllIlllllIIIlIlllII;
    }
    
    private static boolean lIIIIlllIIIIIIII(final int llllllllllllIlllIlllllIIIlllIIIl, final int llllllllllllIlllIlllllIIIlllIIII) {
        return llllllllllllIlllIlllllIIIlllIIIl == llllllllllllIlllIlllllIIIlllIIII;
    }
    
    private void func_150541_c(final World llllllllllllIlllIlllllIIlIllIlll, final int llllllllllllIlllIlllllIIlIllIllI, final int llllllllllllIlllIlllllIIlIllIlIl, final int llllllllllllIlllIlllllIIlIllIlII, final int llllllllllllIlllIlllllIIlIllllll, final Random llllllllllllIlllIlllllIIlIlllllI) {
        final int nextInt = llllllllllllIlllIlllllIIlIlllllI.nextInt(WorldGenMegaPineTree.llIIIIIIlIlllI[4]);
        int baseHeight;
        if (lIIIIllIlllllllI(this.useBaseHeight ? 1 : 0)) {
            baseHeight = this.baseHeight;
            "".length();
            if (((0xFA ^ 0xC0 ^ (0x91 ^ 0x8C)) & (0x4D ^ 0x3B ^ (0x3F ^ 0x6E) ^ -" ".length())) > 0) {
                return;
            }
        }
        else {
            baseHeight = WorldGenMegaPineTree.llIIIIIIlIlllI[5];
        }
        final int llllllllllllIlllIlllllIIlIllllIl = nextInt + baseHeight;
        int llllllllllllIlllIlllllIIlIllllII = WorldGenMegaPineTree.llIIIIIIlIlllI[0];
        int llllllllllllIlllIlllllIIlIlllIll = llllllllllllIlllIlllllIIlIllIlII - llllllllllllIlllIlllllIIlIllllIl;
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIIIlllIIIIIIIl(llllllllllllIlllIlllllIIlIlllIll, llllllllllllIlllIlllllIIlIllIlII)) {
            final int llllllllllllIlllIlllllIIlIlllIlI = llllllllllllIlllIlllllIIlIllIlII - llllllllllllIlllIlllllIIlIlllIll;
            final int llllllllllllIlllIlllllIIlIlllIIl = llllllllllllIlllIlllllIIlIllllll + MathHelper.floor_float(llllllllllllIlllIlllllIIlIlllIlI / (float)llllllllllllIlllIlllllIIlIllllIl * 3.5f);
            final BlockPos llllllllllllIllIllIIIIlIlIlllIII = new BlockPos(llllllllllllIlllIlllllIIlIllIllI, llllllllllllIlllIlllllIIlIlllIll, llllllllllllIlllIlllllIIlIllIlIl);
            final int n = llllllllllllIlllIlllllIIlIlllIIl;
            int n2;
            if (lIIIIllIllllllll(llllllllllllIlllIlllllIIlIlllIlI) && lIIIIlllIIIIIIII(llllllllllllIlllIlllllIIlIlllIIl, llllllllllllIlllIlllllIIlIllllII) && lIIIIllIlllllIIl(llllllllllllIlllIlllllIIlIlllIll & WorldGenMegaPineTree.llIIIIIIlIlllI[3])) {
                n2 = WorldGenMegaPineTree.llIIIIIIlIlllI[3];
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else {
                n2 = WorldGenMegaPineTree.llIIIIIIlIlllI[0];
            }
            this.func_175925_a(llllllllllllIlllIlllllIIlIllIlll, llllllllllllIllIllIIIIlIlIlllIII, n + n2);
            llllllllllllIlllIlllllIIlIllllII = llllllllllllIlllIlllllIIlIlllIIl;
            ++llllllllllllIlllIlllllIIlIlllIll;
        }
    }
    
    private static boolean lIIIIlllIIIIIIll(final int llllllllllllIlllIlllllIIIlIlIllI) {
        return llllllllllllIlllIlllllIIIlIlIllI < 0;
    }
    
    private static boolean lIIIIllIllllllIl(final int llllllllllllIlllIlllllIIIllIllIl, final int llllllllllllIlllIlllllIIIllIllII) {
        return llllllllllllIlllIlllllIIIllIllIl >= llllllllllllIlllIlllllIIIllIllII;
    }
    
    @Override
    public boolean generate(final World llllllllllllIlllIlllllIIllIlIllI, final Random llllllllllllIlllIlllllIIllIlIlIl, final BlockPos llllllllllllIlllIlllllIIllIllIll) {
        final int llllllllllllIlllIlllllIIllIllIlI = this.func_150533_a(llllllllllllIlllIlllllIIllIlIlIl);
        if (lIIIIllIlllllIIl(this.func_175929_a(llllllllllllIlllIlllllIIllIlIllI, llllllllllllIlllIlllllIIllIlIlIl, llllllllllllIlllIlllllIIllIllIll, llllllllllllIlllIlllllIIllIllIlI) ? 1 : 0)) {
            return WorldGenMegaPineTree.llIIIIIIlIlllI[0] != 0;
        }
        this.func_150541_c(llllllllllllIlllIlllllIIllIlIllI, llllllllllllIlllIlllllIIllIllIll.getX(), llllllllllllIlllIlllllIIllIllIll.getZ(), llllllllllllIlllIlllllIIllIllIll.getY() + llllllllllllIlllIlllllIIllIllIlI, WorldGenMegaPineTree.llIIIIIIlIlllI[0], llllllllllllIlllIlllllIIllIlIlIl);
        int llllllllllllIlllIlllllIIllIllIIl = WorldGenMegaPineTree.llIIIIIIlIlllI[0];
        "".length();
        if (((0x5C ^ 0x3 ^ (0x56 ^ 0x38)) & (103 + 64 - 123 + 91 ^ 48 + 86 - 1 + 49 ^ -" ".length())) > 0) {
            return ((0x61 ^ 0x3F ^ (0xCC ^ 0xAE)) & (0x77 ^ 0x1E ^ (0x62 ^ 0x37) ^ -" ".length())) != 0x0;
        }
        while (!lIIIIllIllllllIl(llllllllllllIlllIlllllIIllIllIIl, llllllllllllIlllIlllllIIllIllIlI)) {
            Block llllllllllllIlllIlllllIIllIllIII = llllllllllllIlllIlllllIIllIlIllI.getBlockState(llllllllllllIlllIlllllIIllIllIll.up(llllllllllllIlllIlllllIIllIllIIl)).getBlock();
            if (!lIIIIllIlllllIlI(llllllllllllIlllIlllllIIllIllIII.getMaterial(), Material.air) || lIIIIllIlllllIll(llllllllllllIlllIlllllIIllIllIII.getMaterial(), Material.leaves)) {
                this.setBlockAndNotifyAdequately(llllllllllllIlllIlllllIIllIlIllI, llllllllllllIlllIlllllIIllIllIll.up(llllllllllllIlllIlllllIIllIllIIl), this.woodMetadata);
            }
            if (lIIIIllIllllllII(llllllllllllIlllIlllllIIllIllIIl, llllllllllllIlllIlllllIIllIllIlI - WorldGenMegaPineTree.llIIIIIIlIlllI[3])) {
                llllllllllllIlllIlllllIIllIllIII = llllllllllllIlllIlllllIIllIlIllI.getBlockState(llllllllllllIlllIlllllIIllIllIll.add(WorldGenMegaPineTree.llIIIIIIlIlllI[3], llllllllllllIlllIlllllIIllIllIIl, WorldGenMegaPineTree.llIIIIIIlIlllI[0])).getBlock();
                if (!lIIIIllIlllllIlI(llllllllllllIlllIlllllIIllIllIII.getMaterial(), Material.air) || lIIIIllIlllllIll(llllllllllllIlllIlllllIIllIllIII.getMaterial(), Material.leaves)) {
                    this.setBlockAndNotifyAdequately(llllllllllllIlllIlllllIIllIlIllI, llllllllllllIlllIlllllIIllIllIll.add(WorldGenMegaPineTree.llIIIIIIlIlllI[3], llllllllllllIlllIlllllIIllIllIIl, WorldGenMegaPineTree.llIIIIIIlIlllI[0]), this.woodMetadata);
                }
                llllllllllllIlllIlllllIIllIllIII = llllllllllllIlllIlllllIIllIlIllI.getBlockState(llllllllllllIlllIlllllIIllIllIll.add(WorldGenMegaPineTree.llIIIIIIlIlllI[3], llllllllllllIlllIlllllIIllIllIIl, WorldGenMegaPineTree.llIIIIIIlIlllI[3])).getBlock();
                if (!lIIIIllIlllllIlI(llllllllllllIlllIlllllIIllIllIII.getMaterial(), Material.air) || lIIIIllIlllllIll(llllllllllllIlllIlllllIIllIllIII.getMaterial(), Material.leaves)) {
                    this.setBlockAndNotifyAdequately(llllllllllllIlllIlllllIIllIlIllI, llllllllllllIlllIlllllIIllIllIll.add(WorldGenMegaPineTree.llIIIIIIlIlllI[3], llllllllllllIlllIlllllIIllIllIIl, WorldGenMegaPineTree.llIIIIIIlIlllI[3]), this.woodMetadata);
                }
                llllllllllllIlllIlllllIIllIllIII = llllllllllllIlllIlllllIIllIlIllI.getBlockState(llllllllllllIlllIlllllIIllIllIll.add(WorldGenMegaPineTree.llIIIIIIlIlllI[0], llllllllllllIlllIlllllIIllIllIIl, WorldGenMegaPineTree.llIIIIIIlIlllI[3])).getBlock();
                if (!lIIIIllIlllllIlI(llllllllllllIlllIlllllIIllIllIII.getMaterial(), Material.air) || lIIIIllIlllllIll(llllllllllllIlllIlllllIIllIllIII.getMaterial(), Material.leaves)) {
                    this.setBlockAndNotifyAdequately(llllllllllllIlllIlllllIIllIlIllI, llllllllllllIlllIlllllIIllIllIll.add(WorldGenMegaPineTree.llIIIIIIlIlllI[0], llllllllllllIlllIlllllIIllIllIIl, WorldGenMegaPineTree.llIIIIIIlIlllI[3]), this.woodMetadata);
                }
            }
            ++llllllllllllIlllIlllllIIllIllIIl;
        }
        return WorldGenMegaPineTree.llIIIIIIlIlllI[3] != 0;
    }
    
    private static boolean lIIIIlllIIIIIIlI(final int llllllllllllIlllIlllllIIIlIlIIIl, final int llllllllllllIlllIlllllIIIlIlIIII) {
        return llllllllllllIlllIlllllIIIlIlIIIl != llllllllllllIlllIlllllIIIlIlIIII;
    }
    
    private static boolean lIIIIlllIIIIIIIl(final int llllllllllllIlllIlllllIIIllIIlIl, final int llllllllllllIlllIlllllIIIllIIlII) {
        return llllllllllllIlllIlllllIIIllIIlIl > llllllllllllIlllIlllllIIIllIIlII;
    }
    
    private void func_175934_c(final World llllllllllllIlllIlllllIIIllllIII, final BlockPos llllllllllllIlllIlllllIIIlllIlll) {
        int llllllllllllIlllIlllllIIIlllllII = WorldGenMegaPineTree.llIIIIIIlIlllI[6];
        "".length();
        if (((0x5B ^ 0x72) & ~(0x52 ^ 0x7B)) != 0x0) {
            return;
        }
        while (!lIIIIllIllllllII(llllllllllllIlllIlllllIIIlllllII, WorldGenMegaPineTree.llIIIIIIlIlllI[10])) {
            final BlockPos llllllllllllIlllIlllllIIIllllIll = llllllllllllIlllIlllllIIIlllIlll.up(llllllllllllIlllIlllllIIIlllllII);
            final Block llllllllllllIlllIlllllIIIllllIlI = llllllllllllIlllIlllllIIIllllIII.getBlockState(llllllllllllIlllIlllllIIIllllIll).getBlock();
            if (!lIIIIllIlllllIlI(llllllllllllIlllIlllllIIIllllIlI, Blocks.grass) || lIIIIllIlllllIll(llllllllllllIlllIlllllIIIllllIlI, Blocks.dirt)) {
                this.setBlockAndNotifyAdequately(llllllllllllIlllIlllllIIIllllIII, llllllllllllIlllIlllllIIIllllIll, WorldGenMegaPineTree.field_181635_g);
                "".length();
                if ((106 + 81 - 66 + 57 ^ 7 + 112 - 65 + 128) < ((0x17 ^ 0x40 ^ (0x50 ^ 0x26)) & (0x32 ^ 0x4A ^ (0x14 ^ 0x4D) ^ -" ".length()))) {
                    return;
                }
                break;
            }
            else if (lIIIIllIlllllIlI(llllllllllllIlllIlllllIIIllllIlI.getMaterial(), Material.air) && lIIIIlllIIIIIIll(llllllllllllIlllIlllllIIIlllllII)) {
                "".length();
                if (-(0x3 ^ 0x7E ^ (0x8 ^ 0x71)) >= 0) {
                    return;
                }
                break;
            }
            else {
                --llllllllllllIlllIlllllIIIlllllII;
            }
        }
    }
    
    private static boolean lIIIIllIlllllIlI(final Object llllllllllllIlllIlllllIIIllIIIIl, final Object llllllllllllIlllIlllllIIIllIIIII) {
        return llllllllllllIlllIlllllIIIllIIIIl != llllllllllllIlllIlllllIIIllIIIII;
    }
    
    private static void lIIIIllIlllllIII() {
        (llIIIIIIlIlllI = new int[12])[0] = ((0x35 ^ 0x6C) & ~(0xE ^ 0x57));
        WorldGenMegaPineTree.llIIIIIIlIlllI[1] = (0x47 ^ 0x48 ^ "  ".length());
        WorldGenMegaPineTree.llIIIIIIlIlllI[2] = (0xB1 ^ 0xBE);
        WorldGenMegaPineTree.llIIIIIIlIlllI[3] = " ".length();
        WorldGenMegaPineTree.llIIIIIIlIlllI[4] = (((0x73 ^ 0x27) & ~(0x2C ^ 0x78)) ^ (0x68 ^ 0x6D));
        WorldGenMegaPineTree.llIIIIIIlIlllI[5] = "   ".length();
        WorldGenMegaPineTree.llIIIIIIlIlllI[6] = "  ".length();
        WorldGenMegaPineTree.llIIIIIIlIlllI[7] = (0x51 ^ 0x7C ^ (0xCD ^ 0xA0));
        WorldGenMegaPineTree.llIIIIIIlIlllI[8] = (0x4 ^ 0xC);
        WorldGenMegaPineTree.llIIIIIIlIlllI[9] = (0xE ^ 0x9);
        WorldGenMegaPineTree.llIIIIIIlIlllI[10] = -"   ".length();
        WorldGenMegaPineTree.llIIIIIIlIlllI[11] = -"  ".length();
    }
    
    @Override
    public void func_180711_a(final World llllllllllllIlllIlllllIIlIIllIll, final Random llllllllllllIlllIlllllIIlIIllIlI, final BlockPos llllllllllllIlllIlllllIIlIlIIIIl) {
        this.func_175933_b(llllllllllllIlllIlllllIIlIIllIll, llllllllllllIlllIlllllIIlIlIIIIl.west().north());
        this.func_175933_b(llllllllllllIlllIlllllIIlIIllIll, llllllllllllIlllIlllllIIlIlIIIIl.east(WorldGenMegaPineTree.llIIIIIIlIlllI[6]).north());
        this.func_175933_b(llllllllllllIlllIlllllIIlIIllIll, llllllllllllIlllIlllllIIlIlIIIIl.west().south(WorldGenMegaPineTree.llIIIIIIlIlllI[6]));
        this.func_175933_b(llllllllllllIlllIlllllIIlIIllIll, llllllllllllIlllIlllllIIlIlIIIIl.east(WorldGenMegaPineTree.llIIIIIIlIlllI[6]).south(WorldGenMegaPineTree.llIIIIIIlIlllI[6]));
        int llllllllllllIlllIlllllIIlIlIIIII = WorldGenMegaPineTree.llIIIIIIlIlllI[0];
        "".length();
        if ((0x3A ^ 0x58 ^ (0xF4 ^ 0x92)) < (0x6B ^ 0x55 ^ (0xB5 ^ 0x8F))) {
            return;
        }
        while (!lIIIIllIllllllIl(llllllllllllIlllIlllllIIlIlIIIII, WorldGenMegaPineTree.llIIIIIIlIlllI[4])) {
            final int llllllllllllIlllIlllllIIlIIlllll = llllllllllllIlllIlllllIIlIIllIlI.nextInt(WorldGenMegaPineTree.llIIIIIIlIlllI[7]);
            final int llllllllllllIlllIlllllIIlIIllllI = llllllllllllIlllIlllllIIlIIlllll % WorldGenMegaPineTree.llIIIIIIlIlllI[8];
            final int llllllllllllIlllIlllllIIlIIlllIl = llllllllllllIlllIlllllIIlIIlllll / WorldGenMegaPineTree.llIIIIIIlIlllI[8];
            if (!lIIIIllIlllllllI(llllllllllllIlllIlllllIIlIIllllI) || !lIIIIlllIIIIIIlI(llllllllllllIlllIlllllIIlIIllllI, WorldGenMegaPineTree.llIIIIIIlIlllI[9]) || !lIIIIllIlllllllI(llllllllllllIlllIlllllIIlIIlllIl) || lIIIIlllIIIIIIII(llllllllllllIlllIlllllIIlIIlllIl, WorldGenMegaPineTree.llIIIIIIlIlllI[9])) {
                this.func_175933_b(llllllllllllIlllIlllllIIlIIllIll, llllllllllllIlllIlllllIIlIlIIIIl.add(WorldGenMegaPineTree.llIIIIIIlIlllI[10] + llllllllllllIlllIlllllIIlIIllllI, WorldGenMegaPineTree.llIIIIIIlIlllI[0], WorldGenMegaPineTree.llIIIIIIlIlllI[10] + llllllllllllIlllIlllllIIlIIlllIl));
            }
            ++llllllllllllIlllIlllllIIlIlIIIII;
        }
    }
    
    private static boolean lIIIIllIlllllIIl(final int llllllllllllIlllIlllllIIIlIllIII) {
        return llllllllllllIlllIlllllIIIlIllIII == 0;
    }
    
    private void func_175933_b(final World llllllllllllIlllIlllllIIlIIIlllI, final BlockPos llllllllllllIlllIlllllIIlIIIllIl) {
        int llllllllllllIlllIlllllIIlIIIllII = WorldGenMegaPineTree.llIIIIIIlIlllI[11];
        "".length();
        if ("  ".length() > (0x6C ^ 0x68)) {
            return;
        }
        while (!lIIIIlllIIIIIIIl(llllllllllllIlllIlllllIIlIIIllII, WorldGenMegaPineTree.llIIIIIIlIlllI[6])) {
            int llllllllllllIlllIlllllIIlIIIlIll = WorldGenMegaPineTree.llIIIIIIlIlllI[11];
            "".length();
            if (" ".length() == "  ".length()) {
                return;
            }
            while (!lIIIIlllIIIIIIIl(llllllllllllIlllIlllllIIlIIIlIll, WorldGenMegaPineTree.llIIIIIIlIlllI[6])) {
                if (!lIIIIlllIIIIIIII(Math.abs(llllllllllllIlllIlllllIIlIIIllII), WorldGenMegaPineTree.llIIIIIIlIlllI[6]) || lIIIIlllIIIIIIlI(Math.abs(llllllllllllIlllIlllllIIlIIIlIll), WorldGenMegaPineTree.llIIIIIIlIlllI[6])) {
                    this.func_175934_c(llllllllllllIlllIlllllIIlIIIlllI, llllllllllllIlllIlllllIIlIIIllIl.add(llllllllllllIlllIlllllIIlIIIllII, WorldGenMegaPineTree.llIIIIIIlIlllI[0], llllllllllllIlllIlllllIIlIIIlIll));
                }
                ++llllllllllllIlllIlllllIIlIIIlIll;
            }
            ++llllllllllllIlllIlllllIIlIIIllII;
        }
    }
    
    private static boolean lIIIIllIllllllII(final int llllllllllllIlllIlllllIIIllIlIIl, final int llllllllllllIlllIlllllIIIllIlIII) {
        return llllllllllllIlllIlllllIIIllIlIIl < llllllllllllIlllIlllllIIIllIlIII;
    }
}
