// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.BlockDoublePlant;

public class WorldGenDoublePlant extends WorldGenerator
{
    private static final /* synthetic */ int[] lllIlIllIIlIll;
    private /* synthetic */ BlockDoublePlant.EnumPlantType field_150549_a;
    
    @Override
    public boolean generate(final World llllllllllllIlIllIlIlllIIIIIIlIl, final Random llllllllllllIlIllIlIlllIIIIIlIll, final BlockPos llllllllllllIlIllIlIlllIIIIIIIll) {
        boolean llllllllllllIlIllIlIlllIIIIIlIIl = WorldGenDoublePlant.lllIlIllIIlIll[0] != 0;
        int llllllllllllIlIllIlIlllIIIIIlIII = WorldGenDoublePlant.lllIlIllIIlIll[0];
        "".length();
        if (-(0x15 ^ 0x10) >= 0) {
            return ((0xFD ^ 0xAE) & ~(0xF3 ^ 0xA0)) != 0x0;
        }
        while (!lIlIIIllIIllIlII(llllllllllllIlIllIlIlllIIIIIlIII, WorldGenDoublePlant.lllIlIllIIlIll[6])) {
            final BlockPos llllllllllllIlIllIlIlllIIIIIIlll = llllllllllllIlIllIlIlllIIIIIIIll.add(llllllllllllIlIllIlIlllIIIIIlIll.nextInt(WorldGenDoublePlant.lllIlIllIIlIll[1]) - llllllllllllIlIllIlIlllIIIIIlIll.nextInt(WorldGenDoublePlant.lllIlIllIIlIll[1]), llllllllllllIlIllIlIlllIIIIIlIll.nextInt(WorldGenDoublePlant.lllIlIllIIlIll[2]) - llllllllllllIlIllIlIlllIIIIIlIll.nextInt(WorldGenDoublePlant.lllIlIllIIlIll[2]), llllllllllllIlIllIlIlllIIIIIlIll.nextInt(WorldGenDoublePlant.lllIlIllIIlIll[1]) - llllllllllllIlIllIlIlllIIIIIlIll.nextInt(WorldGenDoublePlant.lllIlIllIIlIll[1]));
            if (lIlIIIllIIllIIlI(llllllllllllIlIllIlIlllIIIIIIlIl.isAirBlock(llllllllllllIlIllIlIlllIIIIIIlll) ? 1 : 0) && (!lIlIIIllIIllIIlI(llllllllllllIlIllIlIlllIIIIIIlIl.provider.getHasNoSky() ? 1 : 0) || lIlIIIllIIllIIll(llllllllllllIlIllIlIlllIIIIIIlll.getY(), WorldGenDoublePlant.lllIlIllIIlIll[3])) && lIlIIIllIIllIIlI(Blocks.double_plant.canPlaceBlockAt(llllllllllllIlIllIlIlllIIIIIIlIl, llllllllllllIlIllIlIlllIIIIIIlll) ? 1 : 0)) {
                Blocks.double_plant.placeAt(llllllllllllIlIllIlIlllIIIIIIlIl, llllllllllllIlIllIlIlllIIIIIIlll, this.field_150549_a, WorldGenDoublePlant.lllIlIllIIlIll[4]);
                llllllllllllIlIllIlIlllIIIIIlIIl = (WorldGenDoublePlant.lllIlIllIIlIll[5] != 0);
            }
            ++llllllllllllIlIllIlIlllIIIIIlIII;
        }
        return llllllllllllIlIllIlIlllIIIIIlIIl;
    }
    
    private static boolean lIlIIIllIIllIlII(final int llllllllllllIlIllIlIllIlllllllIl, final int llllllllllllIlIllIlIllIlllllllII) {
        return llllllllllllIlIllIlIllIlllllllIl >= llllllllllllIlIllIlIllIlllllllII;
    }
    
    private static boolean lIlIIIllIIllIIll(final int llllllllllllIlIllIlIllIllllllIIl, final int llllllllllllIlIllIlIllIllllllIII) {
        return llllllllllllIlIllIlIllIllllllIIl < llllllllllllIlIllIlIllIllllllIII;
    }
    
    private static void lIlIIIllIIllIIIl() {
        (lllIlIllIIlIll = new int[7])[0] = ((0xF4 ^ 0xC3) & ~(0xE ^ 0x39));
        WorldGenDoublePlant.lllIlIllIIlIll[1] = (0x44 ^ 0x32 ^ (0x16 ^ 0x68));
        WorldGenDoublePlant.lllIlIllIIlIll[2] = (0xB0 ^ 0xAD ^ (0xA ^ 0x13));
        WorldGenDoublePlant.lllIlIllIIlIll[3] = 218 + 176 - 184 + 44;
        WorldGenDoublePlant.lllIlIllIIlIll[4] = "  ".length();
        WorldGenDoublePlant.lllIlIllIIlIll[5] = " ".length();
        WorldGenDoublePlant.lllIlIllIIlIll[6] = (114 + 64 - 14 + 70 ^ 103 + 84 - 154 + 137);
    }
    
    public void setPlantType(final BlockDoublePlant.EnumPlantType llllllllllllIlIllIlIlllIIIIlIlll) {
        this.field_150549_a = llllllllllllIlIllIlIlllIIIIlIlll;
    }
    
    private static boolean lIlIIIllIIllIIlI(final int llllllllllllIlIllIlIllIlllllIllI) {
        return llllllllllllIlIllIlIllIlllllIllI != 0;
    }
    
    static {
        lIlIIIllIIllIIIl();
    }
}
