// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.util.Vec3i;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;

public class WorldGenShrub extends WorldGenTrees
{
    private final /* synthetic */ IBlockState woodMetadata;
    private static final /* synthetic */ int[] lIIlllIIIIIIIl;
    private final /* synthetic */ IBlockState leavesMetadata;
    
    private static boolean llIllIlIIlllIll(final int lllllllllllllIIlIlIIlIIIIlIIllll) {
        return lllllllllllllIIlIlIIlIIIIlIIllll <= 0;
    }
    
    public WorldGenShrub(final IBlockState lllllllllllllIIlIlIIlIIIlIIlIIIl, final IBlockState lllllllllllllIIlIlIIlIIIlIIlIIll) {
        super((boolean)(WorldGenShrub.lIIlllIIIIIIIl[0] != 0));
        this.woodMetadata = lllllllllllllIIlIlIIlIIIlIIlIIIl;
        this.leavesMetadata = lllllllllllllIIlIlIIlIIIlIIlIIll;
    }
    
    static {
        llIllIlIIlllIII();
    }
    
    private static boolean llIllIlIIllllIl(final int lllllllllllllIIlIlIIlIIIIlIlIIll) {
        return lllllllllllllIIlIlIIlIIIIlIlIIll != 0;
    }
    
    private static boolean llIllIlIIlllIlI(final Object lllllllllllllIIlIlIIlIIIIlIlIllI, final Object lllllllllllllIIlIlIIlIIIIlIlIlIl) {
        return lllllllllllllIIlIlIIlIIIIlIlIllI == lllllllllllllIIlIlIIlIIIIlIlIlIl;
    }
    
    private static boolean llIllIlIIllllll(final int lllllllllllllIIlIlIIlIIIIlIllllI, final int lllllllllllllIIlIlIIlIIIIlIlllIl) {
        return lllllllllllllIIlIlIIlIIIIlIllllI > lllllllllllllIIlIlIIlIIIIlIlllIl;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIIlIlIIlIIIlIIIIIII, final Random lllllllllllllIIlIlIIlIIIIlllIIII, BlockPos lllllllllllllIIlIlIIlIIIIllIllll) {
        "".length();
        if (((0xD ^ 0x13) & ~(0x0 ^ 0x1E)) != 0x0) {
            return ((0x31 ^ 0x36) & ~(0x8D ^ 0x8A)) != 0x0;
        }
        Block lllllllllllllIIlIlIIlIIIIlllllII;
        while ((!llIllIlIIlllIIl((lllllllllllllIIlIlIIlIIIIlllllII = lllllllllllllIIlIlIIlIIIlIIIIIII.getBlockState((BlockPos)lllllllllllllIIlIlIIlIIIIllIllll).getBlock()).getMaterial(), Material.air) || llIllIlIIlllIlI(lllllllllllllIIlIlIIlIIIIlllllII.getMaterial(), Material.leaves)) && !llIllIlIIlllIll(((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getY())) {
            lllllllllllllIIlIlIIlIIIIllIllll = ((BlockPos)lllllllllllllIIlIlIIlIIIIllIllll).down();
        }
        final Block lllllllllllllIIlIlIIlIIIIllllIll = lllllllllllllIIlIlIIlIIIlIIIIIII.getBlockState((BlockPos)lllllllllllllIIlIlIIlIIIIllIllll).getBlock();
        if (!llIllIlIIlllIIl(lllllllllllllIIlIlIIlIIIIllllIll, Blocks.dirt) || llIllIlIIlllIlI(lllllllllllllIIlIlIIlIIIIllllIll, Blocks.grass)) {
            lllllllllllllIIlIlIIlIIIIllIllll = ((BlockPos)lllllllllllllIIlIlIIlIIIIllIllll).up();
            this.setBlockAndNotifyAdequately(lllllllllllllIIlIlIIlIIIlIIIIIII, (BlockPos)lllllllllllllIIlIlIIlIIIIllIllll, this.woodMetadata);
            int lllllllllllllIIlIlIIlIIIIllllIlI = ((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getY();
            "".length();
            if (-"   ".length() >= 0) {
                return ((0x1E ^ 0x34) & ~(0x9B ^ 0xB1)) != 0x0;
            }
            while (!llIllIlIIllllll(lllllllllllllIIlIlIIlIIIIllllIlI, ((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getY() + WorldGenShrub.lIIlllIIIIIIIl[1])) {
                final int lllllllllllllIIlIlIIlIIIIllllIIl = lllllllllllllIIlIlIIlIIIIllllIlI - ((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getY();
                final int lllllllllllllIIlIlIIlIIIIllllIII = WorldGenShrub.lIIlllIIIIIIIl[1] - lllllllllllllIIlIlIIlIIIIllllIIl;
                int lllllllllllllIIlIlIIlIIIIlllIlll = ((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getX() - lllllllllllllIIlIlIIlIIIIllllIII;
                "".length();
                if ("  ".length() == 0) {
                    return ((81 + 131 - 103 + 59 ^ 127 + 13 - 129 + 130) & (0x75 ^ 0x18 ^ (0x3B ^ 0x73) ^ -" ".length())) != 0x0;
                }
                while (!llIllIlIIllllll(lllllllllllllIIlIlIIlIIIIlllIlll, ((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getX() + lllllllllllllIIlIlIIlIIIIllllIII)) {
                    final int lllllllllllllIIlIlIIlIIIIlllIllI = lllllllllllllIIlIlIIlIIIIlllIlll - ((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getX();
                    int lllllllllllllIIlIlIIlIIIIlllIlIl = ((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getZ() - lllllllllllllIIlIlIIlIIIIllllIII;
                    "".length();
                    if ("  ".length() <= ((0xE4 ^ 0x87 ^ (0x71 ^ 0x2E)) & (0x16 ^ 0x7A ^ (0x12 ^ 0x42) ^ -" ".length()))) {
                        return ((0xF5 ^ 0xC4 ^ (0x9C ^ 0x9B)) & (108 + 134 - 159 + 67 ^ 148 + 63 - 177 + 126 ^ -" ".length())) != 0x0;
                    }
                    while (!llIllIlIIllllll(lllllllllllllIIlIlIIlIIIIlllIlIl, ((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getZ() + lllllllllllllIIlIlIIlIIIIllllIII)) {
                        final int lllllllllllllIIlIlIIlIIIIlllIlII = lllllllllllllIIlIlIIlIIIIlllIlIl - ((Vec3i)lllllllllllllIIlIlIIlIIIIllIllll).getZ();
                        if (!llIllIlIIllllII(Math.abs(lllllllllllllIIlIlIIlIIIIlllIllI), lllllllllllllIIlIlIIlIIIIllllIII) || !llIllIlIIllllII(Math.abs(lllllllllllllIIlIlIIlIIIIlllIlII), lllllllllllllIIlIlIIlIIIIllllIII) || llIllIlIIllllIl(lllllllllllllIIlIlIIlIIIIlllIIII.nextInt(WorldGenShrub.lIIlllIIIIIIIl[1]))) {
                            final BlockPos lllllllllllllIIlIlIIlIIIIlllIIll = new BlockPos(lllllllllllllIIlIlIIlIIIIlllIlll, lllllllllllllIIlIlIIlIIIIllllIlI, lllllllllllllIIlIlIIlIIIIlllIlIl);
                            if (llIllIlIIlllllI(lllllllllllllIIlIlIIlIIIlIIIIIII.getBlockState(lllllllllllllIIlIlIIlIIIIlllIIll).getBlock().isFullBlock() ? 1 : 0)) {
                                this.setBlockAndNotifyAdequately(lllllllllllllIIlIlIIlIIIlIIIIIII, lllllllllllllIIlIlIIlIIIIlllIIll, this.leavesMetadata);
                            }
                        }
                        ++lllllllllllllIIlIlIIlIIIIlllIlIl;
                    }
                    ++lllllllllllllIIlIlIIlIIIIlllIlll;
                }
                ++lllllllllllllIIlIlIIlIIIIllllIlI;
            }
        }
        return WorldGenShrub.lIIlllIIIIIIIl[2] != 0;
    }
    
    private static void llIllIlIIlllIII() {
        (lIIlllIIIIIIIl = new int[3])[0] = ((0xC6 ^ 0x96) & ~(0xD9 ^ 0x89));
        WorldGenShrub.lIIlllIIIIIIIl[1] = "  ".length();
        WorldGenShrub.lIIlllIIIIIIIl[2] = " ".length();
    }
    
    private static boolean llIllIlIIllllII(final int lllllllllllllIIlIlIIlIIIIllIIIlI, final int lllllllllllllIIlIlIIlIIIIllIIIIl) {
        return lllllllllllllIIlIlIIlIIIIllIIIlI == lllllllllllllIIlIlIIlIIIIllIIIIl;
    }
    
    private static boolean llIllIlIIlllIIl(final Object lllllllllllllIIlIlIIlIIIIlIllIlI, final Object lllllllllllllIIlIlIIlIIIIlIllIIl) {
        return lllllllllllllIIlIlIIlIIIIlIllIlI != lllllllllllllIIlIlIIlIIIIlIllIIl;
    }
    
    private static boolean llIllIlIIlllllI(final int lllllllllllllIIlIlIIlIIIIlIlIIIl) {
        return lllllllllllllIIlIlIIlIIIIlIlIIIl == 0;
    }
}
