// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class WorldGenIcePath extends WorldGenerator
{
    private /* synthetic */ int basePathWidth;
    private static final /* synthetic */ int[] lIIIlIlllIIIlI;
    private /* synthetic */ Block block;
    
    private static boolean llIIIIlIIIIIIII(final Object lllllllllllllIlIIIIlIlIIllIIIIll, final Object lllllllllllllIlIIIIlIlIIllIIIIlI) {
        return lllllllllllllIlIIIIlIlIIllIIIIll != lllllllllllllIlIIIIlIlIIllIIIIlI;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIlIIIIlIlIIllIllIIl, final Random lllllllllllllIlIIIIlIlIIlllIIlIl, BlockPos lllllllllllllIlIIIIlIlIIllIlIlll) {
        "".length();
        if (-(0x90 ^ 0x95) >= 0) {
            return ((0xCC ^ 0x97) & ~(0xD6 ^ 0x8D)) != 0x0;
        }
        while (llIIIIIlllllllI(lllllllllllllIlIIIIlIlIIllIllIIl.isAirBlock(lllllllllllllIlIIIIlIlIIllIlIlll) ? 1 : 0) && !llIIIIIllllllll(lllllllllllllIlIIIIlIlIIllIlIlll.getY(), WorldGenIcePath.lIIIlIlllIIIlI[0])) {
            lllllllllllllIlIIIIlIlIIllIlIlll = lllllllllllllIlIIIIlIlIIllIlIlll.down();
        }
        if (llIIIIlIIIIIIII(lllllllllllllIlIIIIlIlIIllIllIIl.getBlockState(lllllllllllllIlIIIIlIlIIllIlIlll).getBlock(), Blocks.snow)) {
            return WorldGenIcePath.lIIIlIlllIIIlI[1] != 0;
        }
        final int lllllllllllllIlIIIIlIlIIlllIIIll = lllllllllllllIlIIIIlIlIIlllIIlIl.nextInt(this.basePathWidth - WorldGenIcePath.lIIIlIlllIIIlI[0]) + WorldGenIcePath.lIIIlIlllIIIlI[0];
        final int lllllllllllllIlIIIIlIlIIlllIIIlI = WorldGenIcePath.lIIIlIlllIIIlI[2];
        int lllllllllllllIlIIIIlIlIIlllIIIIl = lllllllllllllIlIIIIlIlIIllIlIlll.getX() - lllllllllllllIlIIIIlIlIIlllIIIll;
        "".length();
        if (-" ".length() == "  ".length()) {
            return ((0xA5 ^ 0x8A) & ~(0x48 ^ 0x67)) != 0x0;
        }
        while (!llIIIIlIIIIIIlI(lllllllllllllIlIIIIlIlIIlllIIIIl, lllllllllllllIlIIIIlIlIIllIlIlll.getX() + lllllllllllllIlIIIIlIlIIlllIIIll)) {
            int lllllllllllllIlIIIIlIlIIlllIIIII = lllllllllllllIlIIIIlIlIIllIlIlll.getZ() - lllllllllllllIlIIIIlIlIIlllIIIll;
            "".length();
            if ((0x5C ^ 0x58) <= ((0xE ^ 0x9) & ~(0x3C ^ 0x3B))) {
                return ((0x4E ^ 0x51) & ~(0x7D ^ 0x62)) != 0x0;
            }
            while (!llIIIIlIIIIIIlI(lllllllllllllIlIIIIlIlIIlllIIIII, lllllllllllllIlIIIIlIlIIllIlIlll.getZ() + lllllllllllllIlIIIIlIlIIlllIIIll)) {
                final int lllllllllllllIlIIIIlIlIIllIlllll = lllllllllllllIlIIIIlIlIIlllIIIIl - lllllllllllllIlIIIIlIlIIllIlIlll.getX();
                final int lllllllllllllIlIIIIlIlIIllIllllI = lllllllllllllIlIIIIlIlIIlllIIIII - lllllllllllllIlIIIIlIlIIllIlIlll.getZ();
                if (llIIIIIllllllll(lllllllllllllIlIIIIlIlIIllIlllll * lllllllllllllIlIIIIlIlIIllIlllll + lllllllllllllIlIIIIlIlIIllIllllI * lllllllllllllIlIIIIlIlIIllIllllI, lllllllllllllIlIIIIlIlIIlllIIIll * lllllllllllllIlIIIIlIlIIlllIIIll)) {
                    int lllllllllllllIlIIIIlIlIIllIlllIl = lllllllllllllIlIIIIlIlIIllIlIlll.getY() - lllllllllllllIlIIIIlIlIIlllIIIlI;
                    "".length();
                    if ("   ".length() < "  ".length()) {
                        return ((0x62 ^ 0x22) & ~(0x7A ^ 0x3A)) != 0x0;
                    }
                    while (!llIIIIlIIIIIIlI(lllllllllllllIlIIIIlIlIIllIlllIl, lllllllllllllIlIIIIlIlIIllIlIlll.getY() + lllllllllllllIlIIIIlIlIIlllIIIlI)) {
                        final BlockPos lllllllllllllIlIIIIlIlIIllIlllII = new BlockPos(lllllllllllllIlIIIIlIlIIlllIIIIl, lllllllllllllIlIIIIlIlIIllIlllIl, lllllllllllllIlIIIIlIlIIlllIIIII);
                        final Block lllllllllllllIlIIIIlIlIIllIllIll = lllllllllllllIlIIIIlIlIIllIllIIl.getBlockState(lllllllllllllIlIIIIlIlIIllIlllII).getBlock();
                        if (!llIIIIlIIIIIIII(lllllllllllllIlIIIIlIlIIllIllIll, Blocks.dirt) || !llIIIIlIIIIIIII(lllllllllllllIlIIIIlIlIIllIllIll, Blocks.snow) || llIIIIlIIIIIIIl(lllllllllllllIlIIIIlIlIIllIllIll, Blocks.ice)) {
                            lllllllllllllIlIIIIlIlIIllIllIIl.setBlockState(lllllllllllllIlIIIIlIlIIllIlllII, this.block.getDefaultState(), WorldGenIcePath.lIIIlIlllIIIlI[0]);
                            "".length();
                        }
                        ++lllllllllllllIlIIIIlIlIIllIlllIl;
                    }
                }
                ++lllllllllllllIlIIIIlIlIIlllIIIII;
            }
            ++lllllllllllllIlIIIIlIlIIlllIIIIl;
        }
        return WorldGenIcePath.lIIIlIlllIIIlI[2] != 0;
    }
    
    private static boolean llIIIIIlllllllI(final int lllllllllllllIlIIIIlIlIIlIllllII) {
        return lllllllllllllIlIIIIlIlIIlIllllII != 0;
    }
    
    public WorldGenIcePath(final int lllllllllllllIlIIIIlIlIIllllIlll) {
        this.block = Blocks.packed_ice;
        this.basePathWidth = lllllllllllllIlIIIIlIlIIllllIlll;
    }
    
    private static boolean llIIIIIllllllll(final int lllllllllllllIlIIIIlIlIIllIIlIll, final int lllllllllllllIlIIIIlIlIIllIIlIlI) {
        return lllllllllllllIlIIIIlIlIIllIIlIll <= lllllllllllllIlIIIIlIlIIllIIlIlI;
    }
    
    private static void llIIIIIllllllIl() {
        (lIIIlIlllIIIlI = new int[3])[0] = "  ".length();
        WorldGenIcePath.lIIIlIlllIIIlI[1] = ((0x69 ^ 0x35) & ~(0xCC ^ 0x90) & ~((0x77 ^ 0x2A) & ~(0x9B ^ 0xC6)));
        WorldGenIcePath.lIIIlIlllIIIlI[2] = " ".length();
    }
    
    private static boolean llIIIIlIIIIIIlI(final int lllllllllllllIlIIIIlIlIIllIIIlll, final int lllllllllllllIlIIIIlIlIIllIIIllI) {
        return lllllllllllllIlIIIIlIlIIllIIIlll > lllllllllllllIlIIIIlIlIIllIIIllI;
    }
    
    static {
        llIIIIIllllllIl();
    }
    
    private static boolean llIIIIlIIIIIIIl(final Object lllllllllllllIlIIIIlIlIIlIllllll, final Object lllllllllllllIlIIIIlIlIIlIlllllI) {
        return lllllllllllllIlIIIIlIlIIlIllllll == lllllllllllllIlIIIIlIlIIlIlllllI;
    }
}
