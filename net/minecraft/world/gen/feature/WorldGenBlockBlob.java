// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import java.util.Iterator;
import net.minecraft.util.Vec3i;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class WorldGenBlockBlob extends WorldGenerator
{
    private final /* synthetic */ int field_150544_b;
    private final /* synthetic */ Block field_150545_a;
    private static final /* synthetic */ int[] llIIlIlIlllIll;
    
    private static boolean lIIIllIlIlllIIII(final int llllllllllllIlllIIIlIllllIIIlIlI) {
        return llllllllllllIlllIIIlIllllIIIlIlI <= 0;
    }
    
    private static boolean lIIIllIlIllIlllI(final Object llllllllllllIlllIIIlIllllIIlIIll, final Object llllllllllllIlllIIIlIllllIIlIIlI) {
        return llllllllllllIlllIIIlIllllIIlIIll != llllllllllllIlllIIIlIllllIIlIIlI;
    }
    
    private static void lIIIllIlIllIlIlI() {
        (llIIlIlIlllIll = new int[5])[0] = ((0x65 ^ 0x31 ^ (0xFC ^ 0x92)) & (0xA ^ 0x10 ^ (0x49 ^ 0x69) ^ -" ".length()));
        WorldGenBlockBlob.llIIlIlIlllIll[1] = "   ".length();
        WorldGenBlockBlob.llIIlIlIlllIll[2] = "  ".length();
        WorldGenBlockBlob.llIIlIlIlllIll[3] = (0xA2 ^ 0xC5 ^ (0xCF ^ 0xAC));
        WorldGenBlockBlob.llIIlIlIlllIll[4] = " ".length();
    }
    
    static {
        lIIIllIlIllIlIlI();
    }
    
    private static boolean lIIIllIlIllIllIl(final int llllllllllllIlllIIIlIllllIIlIIII) {
        return llllllllllllIlllIIIlIllllIIlIIII != 0;
    }
    
    private static int lIIIllIlIllIlIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIIllIlIlllIIll(final int llllllllllllIlllIIIlIllllIIlllll, final int llllllllllllIlllIIIlIllllIIllllI) {
        return llllllllllllIlllIIIlIllllIIlllll >= llllllllllllIlllIIIlIllllIIllllI;
    }
    
    @Override
    public boolean generate(final World llllllllllllIlllIIIlIllllIlllIII, final Random llllllllllllIlllIIIlIllllIllIlll, BlockPos llllllllllllIlllIIIlIllllIlIlIlI) {
        while (lIIIllIlIllIllII(llllllllllllIlllIIIlIllllIlIlIlI.getY(), WorldGenBlockBlob.llIIlIlIlllIll[1])) {
            if (lIIIllIlIllIllIl(llllllllllllIlllIIIlIllllIlllIII.isAirBlock(llllllllllllIlllIIIlIllllIlIlIlI.down()) ? 1 : 0)) {
                "".length();
                if (null != null) {
                    return ((0x48 ^ 0x57) & ~(0xA4 ^ 0xBB)) != 0x0;
                }
            }
            else {
                final Block llllllllllllIlllIIIlIllllIllIlIl = llllllllllllIlllIIIlIllllIlllIII.getBlockState(llllllllllllIlllIIIlIllllIlIlIlI.down()).getBlock();
                if (!lIIIllIlIllIlllI(llllllllllllIlllIIIlIllllIllIlIl, Blocks.grass) || !lIIIllIlIllIlllI(llllllllllllIlllIIIlIllllIllIlIl, Blocks.dirt) || !lIIIllIlIllIlllI(llllllllllllIlllIIIlIllllIllIlIl, Blocks.stone)) {
                    break;
                }
                "".length();
                if (null != null) {
                    return ((0xEC ^ 0x8D) & ~(0xA2 ^ 0xC3)) != 0x0;
                }
            }
            llllllllllllIlllIIIlIllllIlIlIlI = llllllllllllIlllIIIlIllllIlIlIlI.down();
            "".length();
            if (" ".length() < ((0x5A ^ 0x6) & ~(0xD6 ^ 0x8A))) {
                return ((0x1E ^ 0x7F) & ~(0xEA ^ 0x8B)) != 0x0;
            }
        }
        if (lIIIllIlIllIllll(llllllllllllIlllIIIlIllllIlIlIlI.getY(), WorldGenBlockBlob.llIIlIlIlllIll[1])) {
            return WorldGenBlockBlob.llIIlIlIlllIll[0] != 0;
        }
        final int llllllllllllIlllIIIlIllllIllIlII = this.field_150544_b;
        int llllllllllllIlllIIIlIllllIllIIll = WorldGenBlockBlob.llIIlIlIlllIll[0];
        "".length();
        if (null != null) {
            return ((0x2E ^ 0x7F) & ~(0xE6 ^ 0xB7)) != 0x0;
        }
        while (lIIIllIlIlllIIlI(llllllllllllIlllIIIlIllllIllIlII) && !lIIIllIlIlllIIll(llllllllllllIlllIIIlIllllIllIIll, WorldGenBlockBlob.llIIlIlIlllIll[1])) {
            final int llllllllllllIlllIIIlIllllIllIIlI = llllllllllllIlllIIIlIllllIllIlII + llllllllllllIlllIIIlIllllIllIlll.nextInt(WorldGenBlockBlob.llIIlIlIlllIll[2]);
            final int llllllllllllIlllIIIlIllllIllIIIl = llllllllllllIlllIIIlIllllIllIlII + llllllllllllIlllIIIlIllllIllIlll.nextInt(WorldGenBlockBlob.llIIlIlIlllIll[2]);
            final int llllllllllllIlllIIIlIllllIllIIII = llllllllllllIlllIIIlIllllIllIlII + llllllllllllIlllIIIlIllllIllIlll.nextInt(WorldGenBlockBlob.llIIlIlIlllIll[2]);
            final float llllllllllllIlllIIIlIllllIlIllll = (llllllllllllIlllIIIlIllllIllIIlI + llllllllllllIlllIIIlIllllIllIIIl + llllllllllllIlllIIIlIllllIllIIII) * 0.333f + 0.5f;
            final byte llllllllllllIlllIIIlIllllIlIIIlI = (byte)BlockPos.getAllInBox(llllllllllllIlllIIIlIllllIlIlIlI.add(-llllllllllllIlllIIIlIllllIllIIlI, -llllllllllllIlllIIIlIllllIllIIIl, -llllllllllllIlllIIIlIllllIllIIII), llllllllllllIlllIIIlIllllIlIlIlI.add(llllllllllllIlllIIIlIllllIllIIlI, llllllllllllIlllIIIlIllllIllIIIl, llllllllllllIlllIIIlIllllIllIIII)).iterator();
            "".length();
            if ("   ".length() < 0) {
                return ((0x14 ^ 0x2D ^ (0xC5 ^ 0xAD)) & (0x69 ^ 0x70 ^ (0x31 ^ 0x79) ^ -" ".length())) != 0x0;
            }
            while (!lIIIllIlIlllIIIl(((Iterator)llllllllllllIlllIIIlIllllIlIIIlI).hasNext() ? 1 : 0)) {
                final BlockPos llllllllllllIlllIIIlIllllIlIlllI = ((Iterator<BlockPos>)llllllllllllIlllIIIlIllllIlIIIlI).next();
                if (lIIIllIlIlllIIII(lIIIllIlIllIlIll(llllllllllllIlllIIIlIllllIlIlllI.distanceSq(llllllllllllIlllIIIlIllllIlIlIlI), llllllllllllIlllIIIlIllllIlIllll * llllllllllllIlllIIIlIllllIlIllll))) {
                    llllllllllllIlllIIIlIllllIlllIII.setBlockState(llllllllllllIlllIIIlIllllIlIlllI, this.field_150545_a.getDefaultState(), WorldGenBlockBlob.llIIlIlIlllIll[3]);
                    "".length();
                }
            }
            llllllllllllIlllIIIlIllllIlIlIlI = llllllllllllIlllIIIlIllllIlIlIlI.add(-(llllllllllllIlllIIIlIllllIllIlII + WorldGenBlockBlob.llIIlIlIlllIll[4]) + llllllllllllIlllIIIlIllllIllIlll.nextInt(WorldGenBlockBlob.llIIlIlIlllIll[2] + llllllllllllIlllIIIlIllllIllIlII * WorldGenBlockBlob.llIIlIlIlllIll[2]), WorldGenBlockBlob.llIIlIlIlllIll[0] - llllllllllllIlllIIIlIllllIllIlll.nextInt(WorldGenBlockBlob.llIIlIlIlllIll[2]), -(llllllllllllIlllIIIlIllllIllIlII + WorldGenBlockBlob.llIIlIlIlllIll[4]) + llllllllllllIlllIIIlIllllIllIlll.nextInt(WorldGenBlockBlob.llIIlIlIlllIll[2] + llllllllllllIlllIIIlIllllIllIlII * WorldGenBlockBlob.llIIlIlIlllIll[2]));
            ++llllllllllllIlllIIIlIllllIllIIll;
        }
        return WorldGenBlockBlob.llIIlIlIlllIll[4] != 0;
    }
    
    private static boolean lIIIllIlIllIllll(final int llllllllllllIlllIIIlIllllIIllIll, final int llllllllllllIlllIIIlIllllIIllIlI) {
        return llllllllllllIlllIIIlIllllIIllIll <= llllllllllllIlllIIIlIllllIIllIlI;
    }
    
    public WorldGenBlockBlob(final Block llllllllllllIlllIIIlIlllllIIIlll, final int llllllllllllIlllIIIlIlllllIIlIIl) {
        super((boolean)(WorldGenBlockBlob.llIIlIlIlllIll[0] != 0));
        this.field_150545_a = llllllllllllIlllIIIlIlllllIIIlll;
        this.field_150544_b = llllllllllllIlllIIIlIlllllIIlIIl;
    }
    
    private static boolean lIIIllIlIlllIIIl(final int llllllllllllIlllIIIlIllllIIIlllI) {
        return llllllllllllIlllIIIlIllllIIIlllI == 0;
    }
    
    private static boolean lIIIllIlIlllIIlI(final int llllllllllllIlllIIIlIllllIIIllII) {
        return llllllllllllIlllIIIlIllllIIIllII >= 0;
    }
    
    private static boolean lIIIllIlIllIllII(final int llllllllllllIlllIIIlIllllIIlIlll, final int llllllllllllIlllIIIlIllllIIlIllI) {
        return llllllllllllIlllIIIlIllllIIlIlll > llllllllllllIlllIIIlIllllIIlIllI;
    }
}
