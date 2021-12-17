// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.properties.IProperty;
import net.minecraft.init.Blocks;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.BlockVine;
import net.minecraft.util.MathHelper;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenMegaJungle extends WorldGenHugeTrees
{
    private static final /* synthetic */ int[] llIIllllIlllIl;
    
    private static boolean lIIlIIIIIlllIlII(final int llllllllllllIllIlllIlIIIIIIIlllI) {
        return llllllllllllIllIlllIlIIIIIIIlllI > 0;
    }
    
    private static boolean lIIlIIIIIlllIIll(final int llllllllllllIllIlllIlIIIIIIlIIlI) {
        return llllllllllllIllIlllIlIIIIIIlIIlI != 0;
    }
    
    @Override
    public boolean generate(final World llllllllllllIllIlllIlIIIIllIIIll, final Random llllllllllllIllIlllIlIIIIllIIIlI, final BlockPos llllllllllllIllIlllIlIIIIllIIIIl) {
        final int llllllllllllIllIlllIlIIIIllIIIII = this.func_150533_a(llllllllllllIllIlllIlIIIIllIIIlI);
        if (lIIlIIIIIllIllll(this.func_175929_a(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIlI, llllllllllllIllIlllIlIIIIllIIIIl, llllllllllllIllIlllIlIIIIllIIIII) ? 1 : 0)) {
            return WorldGenMegaJungle.llIIllllIlllIl[0] != 0;
        }
        this.func_175930_c(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIIl.up(llllllllllllIllIlllIlIIIIllIIIII), WorldGenMegaJungle.llIIllllIlllIl[1]);
        int llllllllllllIllIlllIlIIIIlIlllll = llllllllllllIllIlllIlIIIIllIIIIl.getY() + llllllllllllIllIlllIlIIIIllIIIII - WorldGenMegaJungle.llIIllllIlllIl[1] - llllllllllllIllIlllIlIIIIllIIIlI.nextInt(WorldGenMegaJungle.llIIllllIlllIl[2]);
        "".length();
        if (" ".length() < 0) {
            return ((0x80 ^ 0xBE) & ~(0x6 ^ 0x38)) != 0x0;
        }
        while (!lIIlIIIIIlllIIlI(llllllllllllIllIlllIlIIIIlIlllll, llllllllllllIllIlllIlIIIIllIIIIl.getY() + llllllllllllIllIlllIlIIIIllIIIII / WorldGenMegaJungle.llIIllllIlllIl[1])) {
            final float llllllllllllIllIlllIlIIIIlIllllI = llllllllllllIllIlllIlIIIIllIIIlI.nextFloat() * 3.1415927f * 2.0f;
            int llllllllllllIllIlllIlIIIIlIlllIl = llllllllllllIllIlllIlIIIIllIIIIl.getX() + (int)(0.5f + MathHelper.cos(llllllllllllIllIlllIlIIIIlIllllI) * 4.0f);
            int llllllllllllIllIlllIlIIIIlIlllII = llllllllllllIllIlllIlIIIIllIIIIl.getZ() + (int)(0.5f + MathHelper.sin(llllllllllllIllIlllIlIIIIlIllllI) * 4.0f);
            int llllllllllllIllIlllIlIIIIlIllIll = WorldGenMegaJungle.llIIllllIlllIl[0];
            "".length();
            if (-" ".length() > (0xC0 ^ 0xC4)) {
                return ((0x3D ^ 0x33) & ~(0x34 ^ 0x3A)) != 0x0;
            }
            while (!lIIlIIIIIlllIIII(llllllllllllIllIlllIlIIIIlIllIll, WorldGenMegaJungle.llIIllllIlllIl[4])) {
                llllllllllllIllIlllIlIIIIlIlllIl = llllllllllllIllIlllIlIIIIllIIIIl.getX() + (int)(1.5f + MathHelper.cos(llllllllllllIllIlllIlIIIIlIllllI) * llllllllllllIllIlllIlIIIIlIllIll);
                llllllllllllIllIlllIlIIIIlIlllII = llllllllllllIllIlllIlIIIIllIIIIl.getZ() + (int)(1.5f + MathHelper.sin(llllllllllllIllIlllIlIIIIlIllllI) * llllllllllllIllIlllIlIIIIlIllIll);
                this.setBlockAndNotifyAdequately(llllllllllllIllIlllIlIIIIllIIIll, new BlockPos(llllllllllllIllIlllIlIIIIlIlllIl, llllllllllllIllIlllIlIIIIlIlllll - WorldGenMegaJungle.llIIllllIlllIl[3] + llllllllllllIllIlllIlIIIIlIllIll / WorldGenMegaJungle.llIIllllIlllIl[1], llllllllllllIllIlllIlIIIIlIlllII), this.woodMetadata);
                ++llllllllllllIllIlllIlIIIIlIllIll;
            }
            final int llllllllllllIllIlllIlIIIIlIllIlI = WorldGenMegaJungle.llIIllllIlllIl[5] + llllllllllllIllIlllIlIIIIllIIIlI.nextInt(WorldGenMegaJungle.llIIllllIlllIl[1]);
            final int llllllllllllIllIlllIlIIIIlIllIIl = llllllllllllIllIlllIlIIIIlIlllll;
            int llllllllllllIllIlllIlIIIIlIllIII = llllllllllllIllIlllIlIIIIlIlllll - llllllllllllIllIlllIlIIIIlIllIlI;
            "".length();
            if ((11 + 51 + 22 + 57 ^ 9 + 103 - 75 + 100) <= -" ".length()) {
                return ((0x66 ^ 0x3 ^ (0xAA ^ 0x86)) & (53 + 96 + 22 + 49 ^ 27 + 63 - 60 + 119 ^ -" ".length())) != 0x0;
            }
            while (!lIIlIIIIIlllIIIl(llllllllllllIllIlllIlIIIIlIllIII, llllllllllllIllIlllIlIIIIlIllIIl)) {
                final int llllllllllllIllIlllIlIIIIlIlIlll = llllllllllllIllIlllIlIIIIlIllIII - llllllllllllIllIlllIlIIIIlIllIIl;
                this.func_175928_b(llllllllllllIllIlllIlIIIIllIIIll, new BlockPos(llllllllllllIllIlllIlIIIIlIlllIl, llllllllllllIllIlllIlIIIIlIllIII, llllllllllllIllIlllIlIIIIlIlllII), WorldGenMegaJungle.llIIllllIlllIl[5] - llllllllllllIllIlllIlIIIIlIlIlll);
                ++llllllllllllIllIlllIlIIIIlIllIII;
            }
            llllllllllllIllIlllIlIIIIlIlllll -= WorldGenMegaJungle.llIIllllIlllIl[1] + llllllllllllIllIlllIlIIIIllIIIlI.nextInt(WorldGenMegaJungle.llIIllllIlllIl[2]);
        }
        int llllllllllllIllIlllIlIIIIlIlIllI = WorldGenMegaJungle.llIIllllIlllIl[0];
        "".length();
        if (((0xBF ^ 0xA8) & ~(0xB3 ^ 0xA4)) != 0x0) {
            return ((0xA ^ 0x19) & ~(0x19 ^ 0xA)) != 0x0;
        }
        while (!lIIlIIIIIlllIIII(llllllllllllIllIlllIlIIIIlIlIllI, llllllllllllIllIlllIlIIIIllIIIII)) {
            final BlockPos llllllllllllIllIlllIlIIIIlIlIlIl = llllllllllllIllIlllIlIIIIllIIIIl.up(llllllllllllIllIlllIlIIIIlIlIllI);
            if (lIIlIIIIIlllIIll(this.func_150523_a(llllllllllllIllIlllIlIIIIllIIIll.getBlockState(llllllllllllIllIlllIlIIIIlIlIlIl).getBlock()) ? 1 : 0)) {
                this.setBlockAndNotifyAdequately(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIlIlIlIl, this.woodMetadata);
                if (lIIlIIIIIlllIlII(llllllllllllIllIlllIlIIIIlIlIllI)) {
                    this.func_181632_a(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIlI, llllllllllllIllIlllIlIIIIlIlIlIl.west(), BlockVine.EAST);
                    this.func_181632_a(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIlI, llllllllllllIllIlllIlIIIIlIlIlIl.north(), BlockVine.SOUTH);
                }
            }
            if (lIIlIIIIIlllIlIl(llllllllllllIllIlllIlIIIIlIlIllI, llllllllllllIllIlllIlIIIIllIIIII - WorldGenMegaJungle.llIIllllIlllIl[5])) {
                final BlockPos llllllllllllIllIlllIlIIIIlIlIlII = llllllllllllIllIlllIlIIIIlIlIlIl.east();
                if (lIIlIIIIIlllIIll(this.func_150523_a(llllllllllllIllIlllIlIIIIllIIIll.getBlockState(llllllllllllIllIlllIlIIIIlIlIlII).getBlock()) ? 1 : 0)) {
                    this.setBlockAndNotifyAdequately(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIlIlIlII, this.woodMetadata);
                    if (lIIlIIIIIlllIlII(llllllllllllIllIlllIlIIIIlIlIllI)) {
                        this.func_181632_a(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIlI, llllllllllllIllIlllIlIIIIlIlIlII.east(), BlockVine.WEST);
                        this.func_181632_a(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIlI, llllllllllllIllIlllIlIIIIlIlIlII.north(), BlockVine.SOUTH);
                    }
                }
                final BlockPos llllllllllllIllIlllIlIIIIlIlIIll = llllllllllllIllIlllIlIIIIlIlIlIl.south().east();
                if (lIIlIIIIIlllIIll(this.func_150523_a(llllllllllllIllIlllIlIIIIllIIIll.getBlockState(llllllllllllIllIlllIlIIIIlIlIIll).getBlock()) ? 1 : 0)) {
                    this.setBlockAndNotifyAdequately(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIlIlIIll, this.woodMetadata);
                    if (lIIlIIIIIlllIlII(llllllllllllIllIlllIlIIIIlIlIllI)) {
                        this.func_181632_a(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIlI, llllllllllllIllIlllIlIIIIlIlIIll.east(), BlockVine.WEST);
                        this.func_181632_a(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIlI, llllllllllllIllIlllIlIIIIlIlIIll.south(), BlockVine.NORTH);
                    }
                }
                final BlockPos llllllllllllIllIlllIlIIIIlIlIIlI = llllllllllllIllIlllIlIIIIlIlIlIl.south();
                if (lIIlIIIIIlllIIll(this.func_150523_a(llllllllllllIllIlllIlIIIIllIIIll.getBlockState(llllllllllllIllIlllIlIIIIlIlIIlI).getBlock()) ? 1 : 0)) {
                    this.setBlockAndNotifyAdequately(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIlIlIIlI, this.woodMetadata);
                    if (lIIlIIIIIlllIlII(llllllllllllIllIlllIlIIIIlIlIllI)) {
                        this.func_181632_a(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIlI, llllllllllllIllIlllIlIIIIlIlIIlI.west(), BlockVine.EAST);
                        this.func_181632_a(llllllllllllIllIlllIlIIIIllIIIll, llllllllllllIllIlllIlIIIIllIIIlI, llllllllllllIllIlllIlIIIIlIlIIlI.south(), BlockVine.NORTH);
                    }
                }
            }
            ++llllllllllllIllIlllIlIIIIlIlIllI;
        }
        return WorldGenMegaJungle.llIIllllIlllIl[5] != 0;
    }
    
    static {
        lIIlIIIIIllIlllI();
    }
    
    private static boolean lIIlIIIIIlllIlIl(final int llllllllllllIllIlllIlIIIIIIlllIl, final int llllllllllllIllIlllIlIIIIIIlllII) {
        return llllllllllllIllIlllIlIIIIIIlllIl < llllllllllllIllIlllIlIIIIIIlllII;
    }
    
    private static boolean lIIlIIIIIlllIIII(final int llllllllllllIllIlllIlIIIIIlIIIIl, final int llllllllllllIllIlllIlIIIIIlIIIII) {
        return llllllllllllIllIlllIlIIIIIlIIIIl >= llllllllllllIllIlllIlIIIIIlIIIII;
    }
    
    public WorldGenMegaJungle(final boolean llllllllllllIllIlllIlIIIIlllllII, final int llllllllllllIllIlllIlIIIIllllIll, final int llllllllllllIllIlllIlIIIIlllIlII, final IBlockState llllllllllllIllIlllIlIIIIlllIIll, final IBlockState llllllllllllIllIlllIlIIIIllllIII) {
        super(llllllllllllIllIlllIlIIIIlllllII, llllllllllllIllIlllIlIIIIllllIll, llllllllllllIllIlllIlIIIIlllIlII, llllllllllllIllIlllIlIIIIlllIIll, llllllllllllIllIlllIlIIIIllllIII);
    }
    
    private static boolean lIIlIIIIIllIllll(final int llllllllllllIllIlllIlIIIIIIlIIII) {
        return llllllllllllIllIlllIlIIIIIIlIIII == 0;
    }
    
    private void func_175930_c(final World llllllllllllIllIlllIlIIIIIlIlIII, final BlockPos llllllllllllIllIlllIlIIIIIlIIlll, final int llllllllllllIllIlllIlIIIIIlIllII) {
        final int llllllllllllIllIlllIlIIIIIlIlIll = WorldGenMegaJungle.llIIllllIlllIl[1];
        int llllllllllllIllIlllIlIIIIIlIlIlI = -llllllllllllIllIlllIlIIIIIlIlIll;
        "".length();
        if (((118 + 56 - 153 + 107 ^ 61 + 135 - 112 + 102) & (79 + 99 - 159 + 169 ^ 123 + 91 - 105 + 25 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIlIIIIIlllIlII(llllllllllllIllIlllIlIIIIIlIlIlI)) {
            this.func_175925_a(llllllllllllIllIlllIlIIIIIlIlIII, llllllllllllIllIlllIlIIIIIlIIlll.up(llllllllllllIllIlllIlIIIIIlIlIlI), llllllllllllIllIlllIlIIIIIlIllII + WorldGenMegaJungle.llIIllllIlllIl[5] - llllllllllllIllIlllIlIIIIIlIlIlI);
            ++llllllllllllIllIlllIlIIIIIlIlIlI;
        }
    }
    
    private static void lIIlIIIIIllIlllI() {
        (llIIllllIlllIl = new int[6])[0] = ((117 + 12 - 60 + 67 ^ 101 + 107 - 99 + 36) & (0x24 ^ 0x34 ^ (0x7E ^ 0x77) ^ -" ".length()));
        WorldGenMegaJungle.llIIllllIlllIl[1] = "  ".length();
        WorldGenMegaJungle.llIIllllIlllIl[2] = (0x73 ^ 0x77);
        WorldGenMegaJungle.llIIllllIlllIl[3] = "   ".length();
        WorldGenMegaJungle.llIIllllIlllIl[4] = (0xC1 ^ 0xC4);
        WorldGenMegaJungle.llIIllllIlllIl[5] = " ".length();
    }
    
    private static boolean lIIlIIIIIlllIIlI(final int llllllllllllIllIlllIlIIIIIIllIIl, final int llllllllllllIllIlllIlIIIIIIllIII) {
        return llllllllllllIllIlllIlIIIIIIllIIl <= llllllllllllIllIlllIlIIIIIIllIII;
    }
    
    private void func_181632_a(final World llllllllllllIllIlllIlIIIIIlllllI, final Random llllllllllllIllIlllIlIIIIIlllIII, final BlockPos llllllllllllIllIlllIlIIIIIllllII, final PropertyBool llllllllllllIllIlllIlIIIIIlllIll) {
        if (lIIlIIIIIlllIlII(llllllllllllIllIlllIlIIIIIlllIII.nextInt(WorldGenMegaJungle.llIIllllIlllIl[3])) && lIIlIIIIIlllIIll(llllllllllllIllIlllIlIIIIIlllllI.isAirBlock(llllllllllllIllIlllIlIIIIIllllII) ? 1 : 0)) {
            this.setBlockAndNotifyAdequately(llllllllllllIllIlllIlIIIIIlllllI, llllllllllllIllIlllIlIIIIIllllII, Blocks.vine.getDefaultState().withProperty((IProperty<Comparable>)llllllllllllIllIlllIlIIIIIlllIll, (boolean)(WorldGenMegaJungle.llIIllllIlllIl[5] != 0)));
        }
    }
    
    private static boolean lIIlIIIIIlllIIIl(final int llllllllllllIllIlllIlIIIIIIlIlIl, final int llllllllllllIllIlllIlIIIIIIlIlII) {
        return llllllllllllIllIlllIlIIIIIIlIlIl > llllllllllllIllIlllIlIIIIIIlIlII;
    }
}
