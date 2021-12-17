// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import com.google.common.base.Predicate;

public class WorldGenMinable extends WorldGenerator
{
    private final /* synthetic */ Predicate<IBlockState> predicate;
    private final /* synthetic */ int numberOfBlocks;
    private final /* synthetic */ IBlockState oreBlock;
    private static final /* synthetic */ int[] lIIlIIlIllIllI;
    
    private static int llIIllIlIllIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIIllIlIlllIII(final int lllllllllllllIIllIlllIIIIIlIIIII, final int lllllllllllllIIllIlllIIIIIIlllll) {
        return lllllllllllllIIllIlllIIIIIlIIIII > lllllllllllllIIllIlllIIIIIIlllll;
    }
    
    public WorldGenMinable(final IBlockState lllllllllllllIIllIlllIIIlIIIlIIl, final int lllllllllllllIIllIlllIIIlIIIlIII, final Predicate<IBlockState> lllllllllllllIIllIlllIIIlIIIIlll) {
        this.oreBlock = lllllllllllllIIllIlllIIIlIIIlIIl;
        this.numberOfBlocks = lllllllllllllIIllIlllIIIlIIIlIII;
        this.predicate = lllllllllllllIIllIlllIIIlIIIIlll;
    }
    
    private static void llIIllIlIllIlII() {
        (lIIlIIlIllIllI = new int[5])[0] = (0xBC ^ 0xB4);
        WorldGenMinable.lIIlIIlIllIllI[1] = "   ".length();
        WorldGenMinable.lIIlIIlIllIllI[2] = "  ".length();
        WorldGenMinable.lIIlIIlIllIllI[3] = ((0x75 ^ 0x4D ^ (0x75 ^ 0x7E)) & (133 + 108 - 229 + 173 ^ 91 + 125 - 138 + 60 ^ -" ".length()));
        WorldGenMinable.lIIlIIlIllIllI[4] = " ".length();
    }
    
    @Override
    public boolean generate(final World lllllllllllllIIllIlllIIIIlIIIlIl, final Random lllllllllllllIIllIlllIIIIlIIIlII, final BlockPos lllllllllllllIIllIlllIIIIlIIIIll) {
        final float lllllllllllllIIllIlllIIIIllIIIlI = lllllllllllllIIllIlllIIIIlIIIlII.nextFloat() * 3.1415927f;
        final double lllllllllllllIIllIlllIIIIllIIIIl = lllllllllllllIIllIlllIIIIlIIIIll.getX() + WorldGenMinable.lIIlIIlIllIllI[0] + MathHelper.sin(lllllllllllllIIllIlllIIIIllIIIlI) * this.numberOfBlocks / 8.0f;
        final double lllllllllllllIIllIlllIIIIllIIIII = lllllllllllllIIllIlllIIIIlIIIIll.getX() + WorldGenMinable.lIIlIIlIllIllI[0] - MathHelper.sin(lllllllllllllIIllIlllIIIIllIIIlI) * this.numberOfBlocks / 8.0f;
        final double lllllllllllllIIllIlllIIIIlIlllll = lllllllllllllIIllIlllIIIIlIIIIll.getZ() + WorldGenMinable.lIIlIIlIllIllI[0] + MathHelper.cos(lllllllllllllIIllIlllIIIIllIIIlI) * this.numberOfBlocks / 8.0f;
        final double lllllllllllllIIllIlllIIIIlIllllI = lllllllllllllIIllIlllIIIIlIIIIll.getZ() + WorldGenMinable.lIIlIIlIllIllI[0] - MathHelper.cos(lllllllllllllIIllIlllIIIIllIIIlI) * this.numberOfBlocks / 8.0f;
        final double lllllllllllllIIllIlllIIIIlIlllIl = lllllllllllllIIllIlllIIIIlIIIIll.getY() + lllllllllllllIIllIlllIIIIlIIIlII.nextInt(WorldGenMinable.lIIlIIlIllIllI[1]) - WorldGenMinable.lIIlIIlIllIllI[2];
        final double lllllllllllllIIllIlllIIIIlIlllII = lllllllllllllIIllIlllIIIIlIIIIll.getY() + lllllllllllllIIllIlllIIIIlIIIlII.nextInt(WorldGenMinable.lIIlIIlIllIllI[1]) - WorldGenMinable.lIIlIIlIllIllI[2];
        int lllllllllllllIIllIlllIIIIlIllIll = WorldGenMinable.lIIlIIlIllIllI[3];
        "".length();
        if (((0x60 ^ 0x6F) & ~(0xB ^ 0x4)) >= "  ".length()) {
            return ((0xBE ^ 0x95) & ~(0x2B ^ 0x0)) != 0x0;
        }
        while (!llIIllIlIlllIIl(lllllllllllllIIllIlllIIIIlIllIll, this.numberOfBlocks)) {
            final float lllllllllllllIIllIlllIIIIlIllIlI = lllllllllllllIIllIlllIIIIlIllIll / (float)this.numberOfBlocks;
            final double lllllllllllllIIllIlllIIIIlIllIIl = lllllllllllllIIllIlllIIIIllIIIIl + (lllllllllllllIIllIlllIIIIllIIIII - lllllllllllllIIllIlllIIIIllIIIIl) * lllllllllllllIIllIlllIIIIlIllIlI;
            final double lllllllllllllIIllIlllIIIIlIllIII = lllllllllllllIIllIlllIIIIlIlllIl + (lllllllllllllIIllIlllIIIIlIlllII - lllllllllllllIIllIlllIIIIlIlllIl) * lllllllllllllIIllIlllIIIIlIllIlI;
            final double lllllllllllllIIllIlllIIIIlIlIlll = lllllllllllllIIllIlllIIIIlIlllll + (lllllllllllllIIllIlllIIIIlIllllI - lllllllllllllIIllIlllIIIIlIlllll) * lllllllllllllIIllIlllIIIIlIllIlI;
            final double lllllllllllllIIllIlllIIIIlIlIllI = lllllllllllllIIllIlllIIIIlIIIlII.nextDouble() * this.numberOfBlocks / 16.0;
            final double lllllllllllllIIllIlllIIIIlIlIlIl = (MathHelper.sin(3.1415927f * lllllllllllllIIllIlllIIIIlIllIlI) + 1.0f) * lllllllllllllIIllIlllIIIIlIlIllI + 1.0;
            final double lllllllllllllIIllIlllIIIIlIlIlII = (MathHelper.sin(3.1415927f * lllllllllllllIIllIlllIIIIlIllIlI) + 1.0f) * lllllllllllllIIllIlllIIIIlIlIllI + 1.0;
            final int lllllllllllllIIllIlllIIIIlIlIIll = MathHelper.floor_double(lllllllllllllIIllIlllIIIIlIllIIl - lllllllllllllIIllIlllIIIIlIlIlIl / 2.0);
            final int lllllllllllllIIllIlllIIIIlIlIIlI = MathHelper.floor_double(lllllllllllllIIllIlllIIIIlIllIII - lllllllllllllIIllIlllIIIIlIlIlII / 2.0);
            final int lllllllllllllIIllIlllIIIIlIlIIIl = MathHelper.floor_double(lllllllllllllIIllIlllIIIIlIlIlll - lllllllllllllIIllIlllIIIIlIlIlIl / 2.0);
            final int lllllllllllllIIllIlllIIIIlIlIIII = MathHelper.floor_double(lllllllllllllIIllIlllIIIIlIllIIl + lllllllllllllIIllIlllIIIIlIlIlIl / 2.0);
            final int lllllllllllllIIllIlllIIIIlIIllll = MathHelper.floor_double(lllllllllllllIIllIlllIIIIlIllIII + lllllllllllllIIllIlllIIIIlIlIlII / 2.0);
            final int lllllllllllllIIllIlllIIIIlIIlllI = MathHelper.floor_double(lllllllllllllIIllIlllIIIIlIlIlll + lllllllllllllIIllIlllIIIIlIlIlIl / 2.0);
            int lllllllllllllIIllIlllIIIIlIIllIl = lllllllllllllIIllIlllIIIIlIlIIll;
            "".length();
            if ("   ".length() < "  ".length()) {
                return ((0x86 ^ 0xBC) & ~(0x56 ^ 0x6C)) != 0x0;
            }
            while (!llIIllIlIlllIII(lllllllllllllIIllIlllIIIIlIIllIl, lllllllllllllIIllIlllIIIIlIlIIII)) {
                final double lllllllllllllIIllIlllIIIIlIIllII = (lllllllllllllIIllIlllIIIIlIIllIl + 0.5 - lllllllllllllIIllIlllIIIIlIllIIl) / (lllllllllllllIIllIlllIIIIlIlIlIl / 2.0);
                if (llIIllIlIllIllI(llIIllIlIllIlIl(lllllllllllllIIllIlllIIIIlIIllII * lllllllllllllIIllIlllIIIIlIIllII, 1.0))) {
                    int lllllllllllllIIllIlllIIIIlIIlIll = lllllllllllllIIllIlllIIIIlIlIIlI;
                    "".length();
                    if (-"   ".length() >= 0) {
                        return ((43 + 31 - 51 + 141 ^ 106 + 36 - 127 + 137) & (" ".length() ^ (0x7 ^ 0x3A) ^ -" ".length())) != 0x0;
                    }
                    while (!llIIllIlIlllIII(lllllllllllllIIllIlllIIIIlIIlIll, lllllllllllllIIllIlllIIIIlIIllll)) {
                        final double lllllllllllllIIllIlllIIIIlIIlIlI = (lllllllllllllIIllIlllIIIIlIIlIll + 0.5 - lllllllllllllIIllIlllIIIIlIllIII) / (lllllllllllllIIllIlllIIIIlIlIlII / 2.0);
                        if (llIIllIlIllIllI(llIIllIlIllIlIl(lllllllllllllIIllIlllIIIIlIIllII * lllllllllllllIIllIlllIIIIlIIllII + lllllllllllllIIllIlllIIIIlIIlIlI * lllllllllllllIIllIlllIIIIlIIlIlI, 1.0))) {
                            int lllllllllllllIIllIlllIIIIlIIlIIl = lllllllllllllIIllIlllIIIIlIlIIIl;
                            "".length();
                            if ("   ".length() <= " ".length()) {
                                return ((0x6A ^ 0x6F ^ (0x6A ^ 0xF)) & (0x80 ^ 0xA8 ^ (0xE ^ 0x46) ^ -" ".length())) != 0x0;
                            }
                            while (!llIIllIlIlllIII(lllllllllllllIIllIlllIIIIlIIlIIl, lllllllllllllIIllIlllIIIIlIIlllI)) {
                                final double lllllllllllllIIllIlllIIIIlIIlIII = (lllllllllllllIIllIlllIIIIlIIlIIl + 0.5 - lllllllllllllIIllIlllIIIIlIlIlll) / (lllllllllllllIIllIlllIIIIlIlIlIl / 2.0);
                                if (llIIllIlIllIllI(llIIllIlIllIlIl(lllllllllllllIIllIlllIIIIlIIllII * lllllllllllllIIllIlllIIIIlIIllII + lllllllllllllIIllIlllIIIIlIIlIlI * lllllllllllllIIllIlllIIIIlIIlIlI + lllllllllllllIIllIlllIIIIlIIlIII * lllllllllllllIIllIlllIIIIlIIlIII, 1.0))) {
                                    final BlockPos lllllllllllllIIllIlllIIIIlIIIlll = new BlockPos(lllllllllllllIIllIlllIIIIlIIllIl, lllllllllllllIIllIlllIIIIlIIlIll, lllllllllllllIIllIlllIIIIlIIlIIl);
                                    if (llIIllIlIllIlll(this.predicate.apply((Object)lllllllllllllIIllIlllIIIIlIIIlIl.getBlockState(lllllllllllllIIllIlllIIIIlIIIlll)) ? 1 : 0)) {
                                        lllllllllllllIIllIlllIIIIlIIIlIl.setBlockState(lllllllllllllIIllIlllIIIIlIIIlll, this.oreBlock, WorldGenMinable.lIIlIIlIllIllI[2]);
                                        "".length();
                                    }
                                }
                                ++lllllllllllllIIllIlllIIIIlIIlIIl;
                            }
                        }
                        ++lllllllllllllIIllIlllIIIIlIIlIll;
                    }
                }
                ++lllllllllllllIIllIlllIIIIlIIllIl;
            }
            ++lllllllllllllIIllIlllIIIIlIllIll;
        }
        return WorldGenMinable.lIIlIIlIllIllI[4] != 0;
    }
    
    private static boolean llIIllIlIllIllI(final int lllllllllllllIIllIlllIIIIIIllIll) {
        return lllllllllllllIIllIlllIIIIIIllIll < 0;
    }
    
    public WorldGenMinable(final IBlockState lllllllllllllIIllIlllIIIlIIlIlll, final int lllllllllllllIIllIlllIIIlIIlIIll) {
        this(lllllllllllllIIllIlllIIIlIIlIlll, lllllllllllllIIllIlllIIIlIIlIIll, (Predicate<IBlockState>)BlockHelper.forBlock(Blocks.stone));
    }
    
    static {
        llIIllIlIllIlII();
    }
    
    private static boolean llIIllIlIllIlll(final int lllllllllllllIIllIlllIIIIIIlllIl) {
        return lllllllllllllIIllIlllIIIIIIlllIl != 0;
    }
    
    private static boolean llIIllIlIlllIIl(final int lllllllllllllIIllIlllIIIIIlIIlII, final int lllllllllllllIIllIlllIIIIIlIIIll) {
        return lllllllllllllIIllIlllIIIIIlIIlII >= lllllllllllllIIllIlllIIIIIlIIIll;
    }
}
