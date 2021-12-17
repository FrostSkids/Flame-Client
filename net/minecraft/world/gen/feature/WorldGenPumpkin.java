// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.BlockPumpkin;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public class WorldGenPumpkin extends WorldGenerator
{
    private static final /* synthetic */ int[] llllIllIIIIIl;
    
    @Override
    public boolean generate(final World lllllllllllllIlIllIlIIlllIlIlllI, final Random lllllllllllllIlIllIlIIlllIlIlIII, final BlockPos lllllllllllllIlIllIlIIlllIlIIlll) {
        int lllllllllllllIlIllIlIIlllIlIlIll = WorldGenPumpkin.llllIllIIIIIl[0];
        "".length();
        if ("  ".length() <= " ".length()) {
            return ((0x36 ^ 0x6B) & ~(0x31 ^ 0x6C)) != 0x0;
        }
        while (!lIlIlIlIlllIIlI(lllllllllllllIlIllIlIIlllIlIlIll, WorldGenPumpkin.llllIllIIIIIl[4])) {
            final BlockPos lllllllllllllIlIllIlIIlllIlIlIlI = lllllllllllllIlIllIlIIlllIlIIlll.add(lllllllllllllIlIllIlIIlllIlIlIII.nextInt(WorldGenPumpkin.llllIllIIIIIl[1]) - lllllllllllllIlIllIlIIlllIlIlIII.nextInt(WorldGenPumpkin.llllIllIIIIIl[1]), lllllllllllllIlIllIlIIlllIlIlIII.nextInt(WorldGenPumpkin.llllIllIIIIIl[2]) - lllllllllllllIlIllIlIIlllIlIlIII.nextInt(WorldGenPumpkin.llllIllIIIIIl[2]), lllllllllllllIlIllIlIIlllIlIlIII.nextInt(WorldGenPumpkin.llllIllIIIIIl[1]) - lllllllllllllIlIllIlIIlllIlIlIII.nextInt(WorldGenPumpkin.llllIllIIIIIl[1]));
            if (lIlIlIlIlllIIII(lllllllllllllIlIllIlIIlllIlIlllI.isAirBlock(lllllllllllllIlIllIlIIlllIlIlIlI) ? 1 : 0) && lIlIlIlIlllIIIl(lllllllllllllIlIllIlIIlllIlIlllI.getBlockState(lllllllllllllIlIllIlIIlllIlIlIlI.down()).getBlock(), Blocks.grass) && lIlIlIlIlllIIII(Blocks.pumpkin.canPlaceBlockAt(lllllllllllllIlIllIlIIlllIlIlllI, lllllllllllllIlIllIlIIlllIlIlIlI) ? 1 : 0)) {
                lllllllllllllIlIllIlIIlllIlIlllI.setBlockState(lllllllllllllIlIllIlIIlllIlIlIlI, Blocks.pumpkin.getDefaultState().withProperty((IProperty<Comparable>)BlockPumpkin.FACING, EnumFacing.Plane.HORIZONTAL.random(lllllllllllllIlIllIlIIlllIlIlIII)), WorldGenPumpkin.llllIllIIIIIl[3]);
                "".length();
            }
            ++lllllllllllllIlIllIlIIlllIlIlIll;
        }
        return WorldGenPumpkin.llllIllIIIIIl[5] != 0;
    }
    
    private static boolean lIlIlIlIlllIIIl(final Object lllllllllllllIlIllIlIIlllIIllllI, final Object lllllllllllllIlIllIlIIlllIIlllIl) {
        return lllllllllllllIlIllIlIIlllIIllllI == lllllllllllllIlIllIlIIlllIIlllIl;
    }
    
    private static void lIlIlIlIllIllll() {
        (llllIllIIIIIl = new int[6])[0] = ((0x1C ^ 0x3A) & ~(0x85 ^ 0xA3));
        WorldGenPumpkin.llllIllIIIIIl[1] = (116 + 26 - 51 + 79 ^ 141 + 137 - 197 + 81);
        WorldGenPumpkin.llllIllIIIIIl[2] = (0xA ^ 0xE);
        WorldGenPumpkin.llllIllIIIIIl[3] = "  ".length();
        WorldGenPumpkin.llllIllIIIIIl[4] = (0x97 ^ 0xC6 ^ (0x5B ^ 0x4A));
        WorldGenPumpkin.llllIllIIIIIl[5] = " ".length();
    }
    
    private static boolean lIlIlIlIlllIIlI(final int lllllllllllllIlIllIlIIlllIlIIIlI, final int lllllllllllllIlIllIlIIlllIlIIIIl) {
        return lllllllllllllIlIllIlIIlllIlIIIlI >= lllllllllllllIlIllIlIIlllIlIIIIl;
    }
    
    static {
        lIlIlIlIllIllll();
    }
    
    private static boolean lIlIlIlIlllIIII(final int lllllllllllllIlIllIlIIlllIIllIll) {
        return lllllllllllllIlIllIlIIlllIIllIll != 0;
    }
}
