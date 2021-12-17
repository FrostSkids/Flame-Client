// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class WorldGenSpikes extends WorldGenerator
{
    private /* synthetic */ Block baseBlockRequired;
    private static final /* synthetic */ int[] lIIIllIIIlIlIl;
    
    private static boolean llIIIIlIllllIIl(final int lllllllllllllIlIIIIIllIlllIIlIII, final int lllllllllllllIlIIIIIllIlllIIIlll) {
        return lllllllllllllIlIIIIIllIlllIIlIII >= lllllllllllllIlIIIIIllIlllIIIlll;
    }
    
    private static boolean llIIIIlIlllIllI(final Object lllllllllllllIlIIIIIllIllIlllIII, final Object lllllllllllllIlIIIIIllIllIllIlll) {
        return lllllllllllllIlIIIIIllIllIlllIII != lllllllllllllIlIIIIIllIllIllIlll;
    }
    
    static {
        llIIIIlIlllIIlI();
    }
    
    private static boolean llIIIIlIlllIlII(final Object lllllllllllllIlIIIIIllIllIllIlII, final Object lllllllllllllIlIIIIIllIllIllIIll) {
        return lllllllllllllIlIIIIIllIllIllIlII == lllllllllllllIlIIIIIllIllIllIIll;
    }
    
    private static boolean llIIIIlIllllIII(final int lllllllllllllIlIIIIIllIlllIIIlII, final int lllllllllllllIlIIIIIllIlllIIIIll) {
        return lllllllllllllIlIIIIIllIlllIIIlII < lllllllllllllIlIIIIIllIlllIIIIll;
    }
    
    private static boolean llIIIIlIlllIIll(final int lllllllllllllIlIIIIIllIllIllIIIl) {
        return lllllllllllllIlIIIIIllIllIllIIIl != 0;
    }
    
    public WorldGenSpikes(final Block lllllllllllllIlIIIIIllIlllllIllI) {
        this.baseBlockRequired = lllllllllllllIlIIIIIllIlllllIllI;
    }
    
    private static boolean llIIIIlIlllIlll(final int lllllllllllllIlIIIIIllIllIllllII, final int lllllllllllllIlIIIIIllIllIlllIll) {
        return lllllllllllllIlIIIIIllIllIllllII > lllllllllllllIlIIIIIllIllIlllIll;
    }
    
    private static void llIIIIlIlllIIlI() {
        (lIIIllIIIlIlIl = new int[7])[0] = (87 + 28 - 77 + 135 ^ 127 + 105 - 206 + 115);
        WorldGenSpikes.lIIIllIIIlIlIl[1] = (128 + 112 - 237 + 141 ^ 58 + 16 - 41 + 117);
        WorldGenSpikes.lIIIllIIIlIlIl[2] = (0x2F ^ 0x2B);
        WorldGenSpikes.lIIIllIIIlIlIl[3] = " ".length();
        WorldGenSpikes.lIIIllIIIlIlIl[4] = ((0x28 ^ 0x5C ^ (0x8 ^ 0x33)) & (0xC4 ^ 0x9F ^ (0xA1 ^ 0xB5) ^ -" ".length()));
        WorldGenSpikes.lIIIllIIIlIlIl[5] = "  ".length();
        WorldGenSpikes.lIIIllIIIlIlIl[6] = (-(0xFFFFEC36 & 0x5FFF) & (0xFFFFCD3F & 0x7FF5));
    }
    
    private static boolean llIIIIlIlllIlIl(final int lllllllllllllIlIIIIIllIlllIIIIII, final int lllllllllllllIlIIIIIllIllIllllll) {
        return lllllllllllllIlIIIIIllIlllIIIIII <= lllllllllllllIlIIIIIllIllIllllll;
    }
    
    @Override
    public boolean generate(final World lllllllllllllIlIIIIIllIlllIlIlIl, final Random lllllllllllllIlIIIIIllIlllIlIlII, final BlockPos lllllllllllllIlIIIIIllIllllIIlII) {
        if (!llIIIIlIlllIIll(lllllllllllllIlIIIIIllIlllIlIlIl.isAirBlock(lllllllllllllIlIIIIIllIllllIIlII) ? 1 : 0) || !llIIIIlIlllIlII(lllllllllllllIlIIIIIllIlllIlIlIl.getBlockState(lllllllllllllIlIIIIIllIllllIIlII.down()).getBlock(), this.baseBlockRequired)) {
            return WorldGenSpikes.lIIIllIIIlIlIl[4] != 0;
        }
        final int lllllllllllllIlIIIIIllIllllIIIll = lllllllllllllIlIIIIIllIlllIlIlII.nextInt(WorldGenSpikes.lIIIllIIIlIlIl[0]) + WorldGenSpikes.lIIIllIIIlIlIl[1];
        final int lllllllllllllIlIIIIIllIllllIIIlI = lllllllllllllIlIIIIIllIlllIlIlII.nextInt(WorldGenSpikes.lIIIllIIIlIlIl[2]) + WorldGenSpikes.lIIIllIIIlIlIl[3];
        final BlockPos.MutableBlockPos lllllllllllllIlIIIIIllIllllIIIIl = new BlockPos.MutableBlockPos();
        int lllllllllllllIlIIIIIllIllllIIIII = lllllllllllllIlIIIIIllIllllIIlII.getX() - lllllllllllllIlIIIIIllIllllIIIlI;
        "".length();
        if ("   ".length() <= 0) {
            return ((0x49 ^ 0x7D) & ~(0xB0 ^ 0x84)) != 0x0;
        }
        while (!llIIIIlIlllIlll(lllllllllllllIlIIIIIllIllllIIIII, lllllllllllllIlIIIIIllIllllIIlII.getX() + lllllllllllllIlIIIIIllIllllIIIlI)) {
            int lllllllllllllIlIIIIIllIlllIlllll = lllllllllllllIlIIIIIllIllllIIlII.getZ() - lllllllllllllIlIIIIIllIllllIIIlI;
            "".length();
            if (((0xB4 ^ 0x84) & ~(0xA2 ^ 0x92)) != ((0x97 ^ 0xBD) & ~(0x11 ^ 0x3B))) {
                return ((0x85 ^ 0x9D) & ~(0xD8 ^ 0xC0)) != 0x0;
            }
            while (!llIIIIlIlllIlll(lllllllllllllIlIIIIIllIlllIlllll, lllllllllllllIlIIIIIllIllllIIlII.getZ() + lllllllllllllIlIIIIIllIllllIIIlI)) {
                final int lllllllllllllIlIIIIIllIlllIllllI = lllllllllllllIlIIIIIllIllllIIIII - lllllllllllllIlIIIIIllIllllIIlII.getX();
                final int lllllllllllllIlIIIIIllIlllIlllIl = lllllllllllllIlIIIIIllIlllIlllll - lllllllllllllIlIIIIIllIllllIIlII.getZ();
                if (llIIIIlIlllIlIl(lllllllllllllIlIIIIIllIlllIllllI * lllllllllllllIlIIIIIllIlllIllllI + lllllllllllllIlIIIIIllIlllIlllIl * lllllllllllllIlIIIIIllIlllIlllIl, lllllllllllllIlIIIIIllIllllIIIlI * lllllllllllllIlIIIIIllIllllIIIlI + WorldGenSpikes.lIIIllIIIlIlIl[3]) && llIIIIlIlllIllI(lllllllllllllIlIIIIIllIlllIlIlIl.getBlockState(lllllllllllllIlIIIIIllIllllIIIIl.func_181079_c(lllllllllllllIlIIIIIllIllllIIIII, lllllllllllllIlIIIIIllIllllIIlII.getY() - WorldGenSpikes.lIIIllIIIlIlIl[3], lllllllllllllIlIIIIIllIlllIlllll)).getBlock(), this.baseBlockRequired)) {
                    return WorldGenSpikes.lIIIllIIIlIlIl[4] != 0;
                }
                ++lllllllllllllIlIIIIIllIlllIlllll;
            }
            ++lllllllllllllIlIIIIIllIllllIIIII;
        }
        int lllllllllllllIlIIIIIllIlllIlllII = lllllllllllllIlIIIIIllIllllIIlII.getY();
        "".length();
        if ("   ".length() >= (0x33 ^ 0x8 ^ (0xFC ^ 0xC3))) {
            return ((0x45 ^ 0x7D ^ (0xBC ^ 0x90)) & (165 + 53 - 112 + 68 ^ 150 + 85 - 213 + 164 ^ -" ".length())) != 0x0;
        }
        while (llIIIIlIllllIII(lllllllllllllIlIIIIIllIlllIlllII, lllllllllllllIlIIIIIllIllllIIlII.getY() + lllllllllllllIlIIIIIllIllllIIIll) && !llIIIIlIllllIIl(lllllllllllllIlIIIIIllIlllIlllII, WorldGenSpikes.lIIIllIIIlIlIl[6])) {
            int lllllllllllllIlIIIIIllIlllIllIll = lllllllllllllIlIIIIIllIllllIIlII.getX() - lllllllllllllIlIIIIIllIllllIIIlI;
            "".length();
            if ("  ".length() == "   ".length()) {
                return ((0xEE ^ 0xA8) & ~(0x29 ^ 0x6F)) != 0x0;
            }
            while (!llIIIIlIlllIlll(lllllllllllllIlIIIIIllIlllIllIll, lllllllllllllIlIIIIIllIllllIIlII.getX() + lllllllllllllIlIIIIIllIllllIIIlI)) {
                int lllllllllllllIlIIIIIllIlllIllIlI = lllllllllllllIlIIIIIllIllllIIlII.getZ() - lllllllllllllIlIIIIIllIllllIIIlI;
                "".length();
                if (((0x80 ^ 0xA8) & ~(0xAB ^ 0x83)) > 0) {
                    return ((0x3E ^ 0x2F) & ~(0x2 ^ 0x13)) != 0x0;
                }
                while (!llIIIIlIlllIlll(lllllllllllllIlIIIIIllIlllIllIlI, lllllllllllllIlIIIIIllIllllIIlII.getZ() + lllllllllllllIlIIIIIllIllllIIIlI)) {
                    final int lllllllllllllIlIIIIIllIlllIllIIl = lllllllllllllIlIIIIIllIlllIllIll - lllllllllllllIlIIIIIllIllllIIlII.getX();
                    final int lllllllllllllIlIIIIIllIlllIllIII = lllllllllllllIlIIIIIllIlllIllIlI - lllllllllllllIlIIIIIllIllllIIlII.getZ();
                    if (llIIIIlIlllIlIl(lllllllllllllIlIIIIIllIlllIllIIl * lllllllllllllIlIIIIIllIlllIllIIl + lllllllllllllIlIIIIIllIlllIllIII * lllllllllllllIlIIIIIllIlllIllIII, lllllllllllllIlIIIIIllIllllIIIlI * lllllllllllllIlIIIIIllIllllIIIlI + WorldGenSpikes.lIIIllIIIlIlIl[3])) {
                        lllllllllllllIlIIIIIllIlllIlIlIl.setBlockState(new BlockPos(lllllllllllllIlIIIIIllIlllIllIll, lllllllllllllIlIIIIIllIlllIlllII, lllllllllllllIlIIIIIllIlllIllIlI), Blocks.obsidian.getDefaultState(), WorldGenSpikes.lIIIllIIIlIlIl[5]);
                        "".length();
                    }
                    ++lllllllllllllIlIIIIIllIlllIllIlI;
                }
                ++lllllllllllllIlIIIIIllIlllIllIll;
            }
            ++lllllllllllllIlIIIIIllIlllIlllII;
        }
        final Entity lllllllllllllIlIIIIIllIlllIlIlll = new EntityEnderCrystal(lllllllllllllIlIIIIIllIlllIlIlIl);
        lllllllllllllIlIIIIIllIlllIlIlll.setLocationAndAngles(lllllllllllllIlIIIIIllIllllIIlII.getX() + 0.5f, lllllllllllllIlIIIIIllIllllIIlII.getY() + lllllllllllllIlIIIIIllIllllIIIll, lllllllllllllIlIIIIIllIllllIIlII.getZ() + 0.5f, lllllllllllllIlIIIIIllIlllIlIlII.nextFloat() * 360.0f, 0.0f);
        lllllllllllllIlIIIIIllIlllIlIlIl.spawnEntityInWorld(lllllllllllllIlIIIIIllIlllIlIlll);
        "".length();
        lllllllllllllIlIIIIIllIlllIlIlIl.setBlockState(lllllllllllllIlIIIIIllIllllIIlII.up(lllllllllllllIlIIIIIllIllllIIIll), Blocks.bedrock.getDefaultState(), WorldGenSpikes.lIIIllIIIlIlIl[5]);
        "".length();
        return WorldGenSpikes.lIIIllIIIlIlIl[3] != 0;
    }
}
