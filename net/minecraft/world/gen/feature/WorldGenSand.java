// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class WorldGenSand extends WorldGenerator
{
    private /* synthetic */ int radius;
    private /* synthetic */ Block block;
    private static final /* synthetic */ int[] llIIlIlIIllIll;
    
    private static boolean lIIIllIlIIIIIIII(final int llllllllllllIlllIIIllllIIllIlIII, final int llllllllllllIlllIIIllllIIllIIlll) {
        return llllllllllllIlllIIIllllIIllIlIII <= llllllllllllIlllIIIllllIIllIIlll;
    }
    
    public WorldGenSand(final Block llllllllllllIlllIIIllllIlIIlIIll, final int llllllllllllIlllIIIllllIlIIlIIlI) {
        this.block = llllllllllllIlllIIIllllIlIIlIIll;
        this.radius = llllllllllllIlllIIIllllIlIIlIIlI;
    }
    
    private static boolean lIIIllIlIIIIIIlI(final int llllllllllllIlllIIIllllIIllIIlII, final int llllllllllllIlllIIIllllIIllIIIll) {
        return llllllllllllIlllIIIllllIIllIIlII > llllllllllllIlllIIIllllIIllIIIll;
    }
    
    private static void lIIIllIIlllllllI() {
        (llIIlIlIIllIll = new int[3])[0] = ((0xE1 ^ 0xA7) & ~(0xE0 ^ 0xA6));
        WorldGenSand.llIIlIlIIllIll[1] = "  ".length();
        WorldGenSand.llIIlIlIIllIll[2] = " ".length();
    }
    
    static {
        lIIIllIIlllllllI();
    }
    
    private static boolean lIIIllIIllllllll(final Object llllllllllllIlllIIIllllIIllIIIII, final Object llllllllllllIlllIIIllllIIlIlllll) {
        return llllllllllllIlllIIIllllIIllIIIII != llllllllllllIlllIIIllllIIlIlllll;
    }
    
    @Override
    public boolean generate(final World llllllllllllIlllIIIllllIlIIIIIll, final Random llllllllllllIlllIIIllllIIlllIlIl, final BlockPos llllllllllllIlllIIIllllIIlllIlII) {
        if (lIIIllIIllllllll(llllllllllllIlllIIIllllIlIIIIIll.getBlockState(llllllllllllIlllIIIllllIIlllIlII).getBlock().getMaterial(), Material.water)) {
            return WorldGenSand.llIIlIlIIllIll[0] != 0;
        }
        final int llllllllllllIlllIIIllllIlIIIIIII = llllllllllllIlllIIIllllIIlllIlIl.nextInt(this.radius - WorldGenSand.llIIlIlIIllIll[1]) + WorldGenSand.llIIlIlIIllIll[1];
        final int llllllllllllIlllIIIllllIIlllllll = WorldGenSand.llIIlIlIIllIll[1];
        int llllllllllllIlllIIIllllIIllllllI = llllllllllllIlllIIIllllIIlllIlII.getX() - llllllllllllIlllIIIllllIlIIIIIII;
        "".length();
        if (-" ".length() != -" ".length()) {
            return ((0x5C ^ 0x25 ^ (0x65 ^ 0x15)) & (0x84 ^ 0xBB ^ (0x4C ^ 0x7A) ^ -" ".length())) != 0x0;
        }
        while (!lIIIllIlIIIIIIlI(llllllllllllIlllIIIllllIIllllllI, llllllllllllIlllIIIllllIIlllIlII.getX() + llllllllllllIlllIIIllllIlIIIIIII)) {
            int llllllllllllIlllIIIllllIIlllllIl = llllllllllllIlllIIIllllIIlllIlII.getZ() - llllllllllllIlllIIIllllIlIIIIIII;
            "".length();
            if (((0xCD ^ 0x9E) & ~(0x50 ^ 0x3)) != 0x0) {
                return ((0x8D ^ 0xA6) & ~(0x2D ^ 0x6)) != 0x0;
            }
            while (!lIIIllIlIIIIIIlI(llllllllllllIlllIIIllllIIlllllIl, llllllllllllIlllIIIllllIIlllIlII.getZ() + llllllllllllIlllIIIllllIlIIIIIII)) {
                final int llllllllllllIlllIIIllllIIlllllII = llllllllllllIlllIIIllllIIllllllI - llllllllllllIlllIIIllllIIlllIlII.getX();
                final int llllllllllllIlllIIIllllIIllllIll = llllllllllllIlllIIIllllIIlllllIl - llllllllllllIlllIIIllllIIlllIlII.getZ();
                if (lIIIllIlIIIIIIII(llllllllllllIlllIIIllllIIlllllII * llllllllllllIlllIIIllllIIlllllII + llllllllllllIlllIIIllllIIllllIll * llllllllllllIlllIIIllllIIllllIll, llllllllllllIlllIIIllllIlIIIIIII * llllllllllllIlllIIIllllIlIIIIIII)) {
                    int llllllllllllIlllIIIllllIIllllIlI = llllllllllllIlllIIIllllIIlllIlII.getY() - llllllllllllIlllIIIllllIIlllllll;
                    "".length();
                    if (" ".length() <= 0) {
                        return ((0x44 ^ 0x4D) & ~(0xBA ^ 0xB3)) != 0x0;
                    }
                    while (!lIIIllIlIIIIIIlI(llllllllllllIlllIIIllllIIllllIlI, llllllllllllIlllIIIllllIIlllIlII.getY() + llllllllllllIlllIIIllllIIlllllll)) {
                        final BlockPos llllllllllllIlllIIIllllIIllllIIl = new BlockPos(llllllllllllIlllIIIllllIIllllllI, llllllllllllIlllIIIllllIIllllIlI, llllllllllllIlllIIIllllIIlllllIl);
                        final Block llllllllllllIlllIIIllllIIllllIII = llllllllllllIlllIIIllllIlIIIIIll.getBlockState(llllllllllllIlllIIIllllIIllllIIl).getBlock();
                        if (!lIIIllIIllllllll(llllllllllllIlllIIIllllIIllllIII, Blocks.dirt) || lIIIllIlIIIIIIIl(llllllllllllIlllIIIllllIIllllIII, Blocks.grass)) {
                            llllllllllllIlllIIIllllIlIIIIIll.setBlockState(llllllllllllIlllIIIllllIIllllIIl, this.block.getDefaultState(), WorldGenSand.llIIlIlIIllIll[1]);
                            "".length();
                        }
                        ++llllllllllllIlllIIIllllIIllllIlI;
                    }
                }
                ++llllllllllllIlllIIIllllIIlllllIl;
            }
            ++llllllllllllIlllIIIllllIIllllllI;
        }
        return WorldGenSand.llIIlIlIIllIll[2] != 0;
    }
    
    private static boolean lIIIllIlIIIIIIIl(final Object llllllllllllIlllIIIllllIIlIlllII, final Object llllllllllllIlllIIIllllIIlIllIll) {
        return llllllllllllIlllIIIllllIIlIlllII == llllllllllllIlllIIIllllIIlIllIll;
    }
}
