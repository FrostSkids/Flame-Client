// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class WorldGenHellLava extends WorldGenerator
{
    private static final /* synthetic */ int[] lIlIIlIIIlllIl;
    private final /* synthetic */ boolean field_94524_b;
    private final /* synthetic */ Block field_150553_a;
    
    private static boolean lllIIlIlIllIIll(final int lllllllllllllIIIlllIIIllIlIIllll, final int lllllllllllllIIIlllIIIllIlIIlllI) {
        return lllllllllllllIIIlllIIIllIlIIllll == lllllllllllllIIIlllIIIllIlIIlllI;
    }
    
    static {
        lllIIlIlIlIlllI();
    }
    
    private static boolean lllIIlIlIllIIII(final Object lllllllllllllIIIlllIIIllIlIIIlll, final Object lllllllllllllIIIlllIIIllIlIIIllI) {
        return lllllllllllllIIIlllIIIllIlIIIlll == lllllllllllllIIIlllIIIllIlIIIllI;
    }
    
    private static boolean lllIIlIlIllIIlI(final int lllllllllllllIIIlllIIIllIlIIIIlI) {
        return lllllllllllllIIIlllIIIllIlIIIIlI == 0;
    }
    
    public WorldGenHellLava(final Block lllllllllllllIIIlllIIIllIllIIlIl, final boolean lllllllllllllIIIlllIIIllIllIIlll) {
        this.field_150553_a = lllllllllllllIIIlllIIIllIllIIlIl;
        this.field_94524_b = lllllllllllllIIIlllIIIllIllIIlll;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIIIlllIIIllIlIlllII, final Random lllllllllllllIIIlllIIIllIlIlIlIl, final BlockPos lllllllllllllIIIlllIIIllIlIllIlI) {
        if (lllIIlIlIlIllll(lllllllllllllIIIlllIIIllIlIlllII.getBlockState(lllllllllllllIIIlllIIIllIlIllIlI.up()).getBlock(), Blocks.netherrack)) {
            return WorldGenHellLava.lIlIIlIIIlllIl[0] != 0;
        }
        if (lllIIlIlIlIllll(lllllllllllllIIIlllIIIllIlIlllII.getBlockState(lllllllllllllIIIlllIIIllIlIllIlI).getBlock().getMaterial(), Material.air) && lllIIlIlIlIllll(lllllllllllllIIIlllIIIllIlIlllII.getBlockState(lllllllllllllIIIlllIIIllIlIllIlI).getBlock(), Blocks.netherrack)) {
            return WorldGenHellLava.lIlIIlIIIlllIl[0] != 0;
        }
        int lllllllllllllIIIlllIIIllIlIllIIl = WorldGenHellLava.lIlIIlIIIlllIl[0];
        if (lllIIlIlIllIIII(lllllllllllllIIIlllIIIllIlIlllII.getBlockState(lllllllllllllIIIlllIIIllIlIllIlI.west()).getBlock(), Blocks.netherrack)) {
            ++lllllllllllllIIIlllIIIllIlIllIIl;
        }
        if (lllIIlIlIllIIII(lllllllllllllIIIlllIIIllIlIlllII.getBlockState(lllllllllllllIIIlllIIIllIlIllIlI.east()).getBlock(), Blocks.netherrack)) {
            ++lllllllllllllIIIlllIIIllIlIllIIl;
        }
        if (lllIIlIlIllIIII(lllllllllllllIIIlllIIIllIlIlllII.getBlockState(lllllllllllllIIIlllIIIllIlIllIlI.north()).getBlock(), Blocks.netherrack)) {
            ++lllllllllllllIIIlllIIIllIlIllIIl;
        }
        if (lllIIlIlIllIIII(lllllllllllllIIIlllIIIllIlIlllII.getBlockState(lllllllllllllIIIlllIIIllIlIllIlI.south()).getBlock(), Blocks.netherrack)) {
            ++lllllllllllllIIIlllIIIllIlIllIIl;
        }
        if (lllIIlIlIllIIII(lllllllllllllIIIlllIIIllIlIlllII.getBlockState(lllllllllllllIIIlllIIIllIlIllIlI.down()).getBlock(), Blocks.netherrack)) {
            ++lllllllllllllIIIlllIIIllIlIllIIl;
        }
        int lllllllllllllIIIlllIIIllIlIllIII = WorldGenHellLava.lIlIIlIIIlllIl[0];
        if (lllIIlIlIllIIIl(lllllllllllllIIIlllIIIllIlIlllII.isAirBlock(lllllllllllllIIIlllIIIllIlIllIlI.west()) ? 1 : 0)) {
            ++lllllllllllllIIIlllIIIllIlIllIII;
        }
        if (lllIIlIlIllIIIl(lllllllllllllIIIlllIIIllIlIlllII.isAirBlock(lllllllllllllIIIlllIIIllIlIllIlI.east()) ? 1 : 0)) {
            ++lllllllllllllIIIlllIIIllIlIllIII;
        }
        if (lllIIlIlIllIIIl(lllllllllllllIIIlllIIIllIlIlllII.isAirBlock(lllllllllllllIIIlllIIIllIlIllIlI.north()) ? 1 : 0)) {
            ++lllllllllllllIIIlllIIIllIlIllIII;
        }
        if (lllIIlIlIllIIIl(lllllllllllllIIIlllIIIllIlIlllII.isAirBlock(lllllllllllllIIIlllIIIllIlIllIlI.south()) ? 1 : 0)) {
            ++lllllllllllllIIIlllIIIllIlIllIII;
        }
        if (lllIIlIlIllIIIl(lllllllllllllIIIlllIIIllIlIlllII.isAirBlock(lllllllllllllIIIlllIIIllIlIllIlI.down()) ? 1 : 0)) {
            ++lllllllllllllIIIlllIIIllIlIllIII;
        }
        if ((lllIIlIlIllIIlI(this.field_94524_b ? 1 : 0) && lllIIlIlIllIIll(lllllllllllllIIIlllIIIllIlIllIIl, WorldGenHellLava.lIlIIlIIIlllIl[1]) && !lllIIlIlIllIlII(lllllllllllllIIIlllIIIllIlIllIII, WorldGenHellLava.lIlIIlIIIlllIl[2])) || lllIIlIlIllIIll(lllllllllllllIIIlllIIIllIlIllIIl, WorldGenHellLava.lIlIIlIIIlllIl[3])) {
            lllllllllllllIIIlllIIIllIlIlllII.setBlockState(lllllllllllllIIIlllIIIllIlIllIlI, this.field_150553_a.getDefaultState(), WorldGenHellLava.lIlIIlIIIlllIl[4]);
            "".length();
            lllllllllllllIIIlllIIIllIlIlllII.forceBlockUpdateTick(this.field_150553_a, lllllllllllllIIIlllIIIllIlIllIlI, lllllllllllllIIIlllIIIllIlIlIlIl);
        }
        return WorldGenHellLava.lIlIIlIIIlllIl[2] != 0;
    }
    
    private static boolean lllIIlIlIllIlII(final int lllllllllllllIIIlllIIIllIIllllll, final int lllllllllllllIIIlllIIIllIIlllllI) {
        return lllllllllllllIIIlllIIIllIIllllll != lllllllllllllIIIlllIIIllIIlllllI;
    }
    
    private static boolean lllIIlIlIlIllll(final Object lllllllllllllIIIlllIIIllIlIIlIll, final Object lllllllllllllIIIlllIIIllIlIIlIlI) {
        return lllllllllllllIIIlllIIIllIlIIlIll != lllllllllllllIIIlllIIIllIlIIlIlI;
    }
    
    private static boolean lllIIlIlIllIIIl(final int lllllllllllllIIIlllIIIllIlIIIlII) {
        return lllllllllllllIIIlllIIIllIlIIIlII != 0;
    }
    
    private static void lllIIlIlIlIlllI() {
        (lIlIIlIIIlllIl = new int[5])[0] = ((69 + 37 - 53 + 99 ^ 58 + 45 - 27 + 91) & (0x78 ^ 0x67 ^ (0x47 ^ 0x67) ^ -" ".length()) & (((0x85 ^ 0xC1 ^ (0xAB ^ 0xC1)) & (93 + 95 - 182 + 170 ^ 111 + 154 - 206 + 99 ^ -" ".length())) ^ -" ".length()));
        WorldGenHellLava.lIlIIlIIIlllIl[1] = (0x4A ^ 0x4E);
        WorldGenHellLava.lIlIIlIIIlllIl[2] = " ".length();
        WorldGenHellLava.lIlIIlIIIlllIl[3] = (0x96 ^ 0x93);
        WorldGenHellLava.lIlIIlIIIlllIl[4] = "  ".length();
    }
}
