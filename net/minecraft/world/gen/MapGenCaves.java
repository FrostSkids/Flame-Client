// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockSand;
import com.google.common.base.Objects;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import java.util.Random;
import net.minecraft.world.chunk.ChunkPrimer;

public class MapGenCaves extends MapGenBase
{
    private static final /* synthetic */ int[] lIlIlIlIlIIIll;
    
    private static int lllIlllIIIllllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lllIlllIIlIIIII(final int lllllllllllllIIIlIIIIlIIIllllllI, final int lllllllllllllIIIlIIIIlIIIlllllIl) {
        return lllllllllllllIIIlIIIIlIIIllllllI == lllllllllllllIIIlIIIIlIIIlllllIl;
    }
    
    private static boolean lllIlllIIlIIlll(final int lllllllllllllIIIlIIIIlIIIlllIllI, final int lllllllllllllIIIlIIIIlIIIlllIlIl) {
        return lllllllllllllIIIlIIIIlIIIlllIllI < lllllllllllllIIIlIIIIlIIIlllIlIl;
    }
    
    private static boolean lllIlllIIlIlIlI(final int lllllllllllllIIIlIIIIlIIIlIlIllI, final int lllllllllllllIIIlIIIIlIIIlIlIlIl) {
        return lllllllllllllIIIlIIIIlIIIlIlIllI != lllllllllllllIIIlIIIIlIIIlIlIlIl;
    }
    
    private static boolean lllIlllIIlIIIll(final int lllllllllllllIIIlIIIIlIIIlIllIIl) {
        return lllllllllllllIIIlIIIIlIIIlIllIIl > 0;
    }
    
    private static boolean lllIlllIIlIIlIl(final int lllllllllllllIIIlIIIIlIIIlIlllIl) {
        return lllllllllllllIIIlIIIIlIIIlIlllIl < 0;
    }
    
    private static boolean lllIlllIIlIlIII(final Object lllllllllllllIIIlIIIIlIIIllIlIlI, final Object lllllllllllllIIIlIIIIlIIIllIlIIl) {
        return lllllllllllllIIIlIIIIlIIIllIlIlI != lllllllllllllIIIlIIIIlIIIllIlIIl;
    }
    
    private static void lllIlllIIIllIll() {
        (lIlIlIlIlIIIll = new int[14])[0] = -" ".length();
        MapGenCaves.lIlIlIlIlIIIll[1] = (0x8C ^ 0x9C);
        MapGenCaves.lIlIlIlIlIIIll[2] = (38 + 102 - 112 + 141 ^ 116 + 104 - 144 + 85);
        MapGenCaves.lIlIlIlIlIIIll[3] = (0x9F ^ 0x9B);
        MapGenCaves.lIlIlIlIlIIIll[4] = ((0x82 ^ 0x89 ^ (0x94 ^ 0xA2)) & (100 + 115 - 126 + 88 ^ 81 + 38 - 42 + 63 ^ -" ".length()));
        MapGenCaves.lIlIlIlIlIIIll[5] = "  ".length();
        MapGenCaves.lIlIlIlIlIIIll[6] = " ".length();
        MapGenCaves.lIlIlIlIlIIIll[7] = (0xC ^ 0xA);
        MapGenCaves.lIlIlIlIlIIIll[8] = (0xDA ^ 0xAA) + (0x11 ^ 0x2A) - (0x2B ^ 0x7A) + (42 + 156 - 193 + 153);
        MapGenCaves.lIlIlIlIlIIIll[9] = (-(0xFFFFE7EF & 0x58DF) & (0xFFFFCFCE & 0x71FF));
        MapGenCaves.lIlIlIlIlIIIll[10] = (155 + 93 - 123 + 39 ^ 8 + 113 - 66 + 119);
        MapGenCaves.lIlIlIlIlIIIll[11] = (82 + 85 - 58 + 29 ^ 69 + 20 + 38 + 6);
        MapGenCaves.lIlIlIlIlIIIll[12] = (0x3B ^ 0x3C);
        MapGenCaves.lIlIlIlIlIIIll[13] = (0xBC ^ 0xC4);
    }
    
    private static boolean lllIlllIIlIIlII(final int lllllllllllllIIIlIIIIlIIIlIlllll) {
        return lllllllllllllIIIlIIIIlIIIlIlllll >= 0;
    }
    
    private static boolean lllIlllIIlIlIll(final int lllllllllllllIIIlIIIIlIIIllllIlI, final int lllllllllllllIIIlIIIIlIIIllllIIl) {
        return lllllllllllllIIIlIIIIlIIIllllIlI >= lllllllllllllIIIlIIIIlIIIllllIIl;
    }
    
    private static boolean lllIlllIIlIllII(final int lllllllllllllIIIlIIIIlIIIlllIIlI, final int lllllllllllllIIIlIIIIlIIIlllIIIl) {
        return lllllllllllllIIIlIIIIlIIIlllIIlI <= lllllllllllllIIIlIIIIlIIIlllIIIl;
    }
    
    protected void func_180702_a(final long lllllllllllllIIIlIIIIlIIlllIIlll, final int lllllllllllllIIIlIIIIlIIlllIIllI, final int lllllllllllllIIIlIIIIlIlIIIllIIl, final ChunkPrimer lllllllllllllIIIlIIIIlIlIIIllIII, double lllllllllllllIIIlIIIIlIIlllIIIll, double lllllllllllllIIIlIIIIlIIlllIIIlI, double lllllllllllllIIIlIIIIlIIlllIIIIl, final float lllllllllllllIIIlIIIIlIIlllIIIII, float lllllllllllllIIIlIIIIlIIllIlllll, float lllllllllllllIIIlIIIIlIIllIllllI, int lllllllllllllIIIlIIIIlIIllIlllIl, int lllllllllllllIIIlIIIIlIIllIlllII, final double lllllllllllllIIIlIIIIlIIllIllIll) {
        final double lllllllllllllIIIlIIIIlIlIIIIlllI = lllllllllllllIIIlIIIIlIIlllIIllI * MapGenCaves.lIlIlIlIlIIIll[1] + MapGenCaves.lIlIlIlIlIIIll[2];
        final double lllllllllllllIIIlIIIIlIlIIIIllIl = lllllllllllllIIIlIIIIlIlIIIllIIl * MapGenCaves.lIlIlIlIlIIIll[1] + MapGenCaves.lIlIlIlIlIIIll[2];
        float lllllllllllllIIIlIIIIlIlIIIIllII = 0.0f;
        float lllllllllllllIIIlIIIIlIlIIIIlIll = 0.0f;
        final Random lllllllllllllIIIlIIIIlIlIIIIlIlI = new Random(lllllllllllllIIIlIIIIlIIlllIIlll);
        if (lllIlllIIIlllll((int)lllllllllllllIIIlIIIIlIIllIlllII)) {
            final int lllllllllllllIIIlIIIIlIlIIIIlIIl = this.range * MapGenCaves.lIlIlIlIlIIIll[1] - MapGenCaves.lIlIlIlIlIIIll[1];
            lllllllllllllIIIlIIIIlIIllIlllII = lllllllllllllIIIlIIIIlIlIIIIlIIl - lllllllllllllIIIlIIIIlIlIIIIlIlI.nextInt(lllllllllllllIIIlIIIIlIlIIIIlIIl / MapGenCaves.lIlIlIlIlIIIll[3]);
        }
        boolean lllllllllllllIIIlIIIIlIlIIIIlIII = MapGenCaves.lIlIlIlIlIIIll[4] != 0;
        if (lllIlllIIlIIIII(lllllllllllllIIIlIIIIlIIllIlllIl, MapGenCaves.lIlIlIlIlIIIll[0])) {
            lllllllllllllIIIlIIIIlIIllIlllIl = (int)(lllllllllllllIIIlIIIIlIIllIlllII / MapGenCaves.lIlIlIlIlIIIll[5]);
            lllllllllllllIIIlIIIIlIlIIIIlIII = (MapGenCaves.lIlIlIlIlIIIll[6] != 0);
        }
        final int lllllllllllllIIIlIIIIlIlIIIIIlll = (int)(lllllllllllllIIIlIIIIlIlIIIIlIlI.nextInt((int)(lllllllllllllIIIlIIIIlIIllIlllII / MapGenCaves.lIlIlIlIlIIIll[5])) + lllllllllllllIIIlIIIIlIIllIlllII / MapGenCaves.lIlIlIlIlIIIll[3]);
        int n;
        if (lllIlllIIlIIIIl(lllllllllllllIIIlIIIIlIlIIIIlIlI.nextInt(MapGenCaves.lIlIlIlIlIIIll[7]))) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if ((0x4 ^ 0x0) < (0x48 ^ 0x4C)) {
                return;
            }
        }
        else {
            n = MapGenCaves.lIlIlIlIlIIIll[4];
        }
        final boolean lllllllllllllIIIlIIIIlIlIIIIIllI = n != 0;
        "".length();
        if (-" ".length() == "   ".length()) {
            return;
        }
        while (!lllIlllIIlIlIll(lllllllllllllIIIlIIIIlIIllIlllIl, (int)lllllllllllllIIIlIIIIlIIllIlllII)) {
            final double lllllllllllllIIIlIIIIlIlIIIIIlIl = 1.5 + MathHelper.sin(lllllllllllllIIIlIIIIlIIllIlllIl * 3.1415927f / (float)lllllllllllllIIIlIIIIlIIllIlllII) * lllllllllllllIIIlIIIIlIIlllIIIII * 1.0f;
            final double lllllllllllllIIIlIIIIlIlIIIIIlII = lllllllllllllIIIlIIIIlIlIIIIIlIl * lllllllllllllIIIlIIIIlIIllIllIll;
            final float lllllllllllllIIIlIIIIlIlIIIIIIll = MathHelper.cos(lllllllllllllIIIlIIIIlIIllIllllI);
            final float lllllllllllllIIIlIIIIlIlIIIIIIlI = MathHelper.sin(lllllllllllllIIIlIIIIlIIllIllllI);
            lllllllllllllIIIlIIIIlIIlllIIIll += MathHelper.cos(lllllllllllllIIIlIIIIlIIllIlllll) * lllllllllllllIIIlIIIIlIlIIIIIIll;
            lllllllllllllIIIlIIIIlIIlllIIIlI += lllllllllllllIIIlIIIIlIlIIIIIIlI;
            lllllllllllllIIIlIIIIlIIlllIIIIl += MathHelper.sin(lllllllllllllIIIlIIIIlIIllIlllll) * lllllllllllllIIIlIIIIlIlIIIIIIll;
            if (lllIlllIIlIIIlI(lllllllllllllIIIlIIIIlIlIIIIIllI ? 1 : 0)) {
                lllllllllllllIIIlIIIIlIIllIllllI *= 0.92f;
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlIIIIlIIllIllllI *= 0.7f;
            }
            lllllllllllllIIIlIIIIlIIllIllllI += lllllllllllllIIIlIIIIlIlIIIIlIll * 0.1f;
            lllllllllllllIIIlIIIIlIIllIlllll += lllllllllllllIIIlIIIIlIlIIIIllII * 0.1f;
            lllllllllllllIIIlIIIIlIlIIIIlIll *= 0.9f;
            lllllllllllllIIIlIIIIlIlIIIIllII *= 0.75f;
            lllllllllllllIIIlIIIIlIlIIIIlIll += (lllllllllllllIIIlIIIIlIlIIIIlIlI.nextFloat() - lllllllllllllIIIlIIIIlIlIIIIlIlI.nextFloat()) * lllllllllllllIIIlIIIIlIlIIIIlIlI.nextFloat() * 2.0f;
            lllllllllllllIIIlIIIIlIlIIIIllII += (lllllllllllllIIIlIIIIlIlIIIIlIlI.nextFloat() - lllllllllllllIIIlIIIIlIlIIIIlIlI.nextFloat()) * lllllllllllllIIIlIIIIlIlIIIIlIlI.nextFloat() * 4.0f;
            if (lllIlllIIlIIIIl(lllllllllllllIIIlIIIIlIlIIIIlIII ? 1 : 0) && lllIlllIIlIIIII(lllllllllllllIIIlIIIIlIIllIlllIl, lllllllllllllIIIlIIIIlIlIIIIIlll) && lllIlllIIlIIIll(lllIlllIIIlllII(lllllllllllllIIIlIIIIlIIlllIIIII, 1.0f)) && lllIlllIIlIIIll((int)lllllllllllllIIIlIIIIlIIllIlllII)) {
                this.func_180702_a(lllllllllllllIIIlIIIIlIlIIIIlIlI.nextLong(), lllllllllllllIIIlIIIIlIIlllIIllI, lllllllllllllIIIlIIIIlIlIIIllIIl, lllllllllllllIIIlIIIIlIlIIIllIII, lllllllllllllIIIlIIIIlIIlllIIIll, lllllllllllllIIIlIIIIlIIlllIIIlI, (double)lllllllllllllIIIlIIIIlIIlllIIIIl, lllllllllllllIIIlIIIIlIlIIIIlIlI.nextFloat() * 0.5f + 0.5f, lllllllllllllIIIlIIIIlIIllIlllll - 1.5707964f, lllllllllllllIIIlIIIIlIIllIllllI / 3.0f, lllllllllllllIIIlIIIIlIIllIlllIl, (int)lllllllllllllIIIlIIIIlIIllIlllII, 1.0);
                this.func_180702_a(lllllllllllllIIIlIIIIlIlIIIIlIlI.nextLong(), lllllllllllllIIIlIIIIlIIlllIIllI, lllllllllllllIIIlIIIIlIlIIIllIIl, lllllllllllllIIIlIIIIlIlIIIllIII, lllllllllllllIIIlIIIIlIIlllIIIll, lllllllllllllIIIlIIIIlIIlllIIIlI, (double)lllllllllllllIIIlIIIIlIIlllIIIIl, lllllllllllllIIIlIIIIlIlIIIIlIlI.nextFloat() * 0.5f + 0.5f, lllllllllllllIIIlIIIIlIIllIlllll + 1.5707964f, lllllllllllllIIIlIIIIlIIllIllllI / 3.0f, lllllllllllllIIIlIIIIlIIllIlllIl, (int)lllllllllllllIIIlIIIIlIIllIlllII, 1.0);
                return;
            }
            if (!lllIlllIIlIIIIl(lllllllllllllIIIlIIIIlIlIIIIlIII ? 1 : 0) || lllIlllIIlIIIlI(lllllllllllllIIIlIIIIlIlIIIIlIlI.nextInt(MapGenCaves.lIlIlIlIlIIIll[3]))) {
                final double lllllllllllllIIIlIIIIlIlIIIIIIIl = lllllllllllllIIIlIIIIlIIlllIIIll - lllllllllllllIIIlIIIIlIlIIIIlllI;
                final double lllllllllllllIIIlIIIIlIlIIIIIIII = (double)(lllllllllllllIIIlIIIIlIIlllIIIIl - lllllllllllllIIIlIIIIlIlIIIIllIl);
                final double lllllllllllllIIIlIIIIlIIllllllll = (double)(lllllllllllllIIIlIIIIlIIllIlllII - lllllllllllllIIIlIIIIlIIllIlllIl);
                final double lllllllllllllIIIlIIIIlIIlllllllI = lllllllllllllIIIlIIIIlIIlllIIIII + 2.0f + 16.0f;
                if (lllIlllIIlIIIll(lllIlllIIIlllIl(lllllllllllllIIIlIIIIlIlIIIIIIIl * lllllllllllllIIIlIIIIlIlIIIIIIIl + lllllllllllllIIIlIIIIlIlIIIIIIII * lllllllllllllIIIlIIIIlIlIIIIIIII - lllllllllllllIIIlIIIIlIIllllllll * lllllllllllllIIIlIIIIlIIllllllll, lllllllllllllIIIlIIIIlIIlllllllI * lllllllllllllIIIlIIIIlIIlllllllI))) {
                    return;
                }
                if (lllIlllIIlIIlII(lllIlllIIIlllIl(lllllllllllllIIIlIIIIlIIlllIIIll, lllllllllllllIIIlIIIIlIlIIIIlllI - 16.0 - lllllllllllllIIIlIIIIlIlIIIIIlIl * 2.0)) && lllIlllIIlIIlII(lllIlllIIIlllIl((double)lllllllllllllIIIlIIIIlIIlllIIIIl, lllllllllllllIIIlIIIIlIlIIIIllIl - 16.0 - lllllllllllllIIIlIIIIlIlIIIIIlIl * 2.0)) && lllIlllIIIlllll(lllIlllIIIllllI(lllllllllllllIIIlIIIIlIIlllIIIll, lllllllllllllIIIlIIIIlIlIIIIlllI + 16.0 + lllllllllllllIIIlIIIIlIlIIIIIlIl * 2.0)) && lllIlllIIIlllll(lllIlllIIIllllI((double)lllllllllllllIIIlIIIIlIIlllIIIIl, lllllllllllllIIIlIIIIlIlIIIIllIl + 16.0 + lllllllllllllIIIlIIIIlIlIIIIIlIl * 2.0))) {
                    int lllllllllllllIIIlIIIIlIIllllllIl = MathHelper.floor_double(lllllllllllllIIIlIIIIlIIlllIIIll - lllllllllllllIIIlIIIIlIlIIIIIlIl) - lllllllllllllIIIlIIIIlIIlllIIllI * MapGenCaves.lIlIlIlIlIIIll[1] - MapGenCaves.lIlIlIlIlIIIll[6];
                    int lllllllllllllIIIlIIIIlIIllllllII = MathHelper.floor_double(lllllllllllllIIIlIIIIlIIlllIIIll + lllllllllllllIIIlIIIIlIlIIIIIlIl) - lllllllllllllIIIlIIIIlIIlllIIllI * MapGenCaves.lIlIlIlIlIIIll[1] + MapGenCaves.lIlIlIlIlIIIll[6];
                    int lllllllllllllIIIlIIIIlIIlllllIll = MathHelper.floor_double(lllllllllllllIIIlIIIIlIIlllIIIlI - lllllllllllllIIIlIIIIlIlIIIIIlII) - MapGenCaves.lIlIlIlIlIIIll[6];
                    int lllllllllllllIIIlIIIIlIIlllllIlI = MathHelper.floor_double(lllllllllllllIIIlIIIIlIIlllIIIlI + lllllllllllllIIIlIIIIlIlIIIIIlII) + MapGenCaves.lIlIlIlIlIIIll[6];
                    int lllllllllllllIIIlIIIIlIIlllllIIl = MathHelper.floor_double((double)(lllllllllllllIIIlIIIIlIIlllIIIIl - lllllllllllllIIIlIIIIlIlIIIIIlIl)) - lllllllllllllIIIlIIIIlIlIIIllIIl * MapGenCaves.lIlIlIlIlIIIll[1] - MapGenCaves.lIlIlIlIlIIIll[6];
                    int lllllllllllllIIIlIIIIlIIlllllIII = MathHelper.floor_double((double)(lllllllllllllIIIlIIIIlIIlllIIIIl + lllllllllllllIIIlIIIIlIlIIIIIlIl)) - lllllllllllllIIIlIIIIlIlIIIllIIl * MapGenCaves.lIlIlIlIlIIIll[1] + MapGenCaves.lIlIlIlIlIIIll[6];
                    if (lllIlllIIlIIlIl(lllllllllllllIIIlIIIIlIIllllllIl)) {
                        lllllllllllllIIIlIIIIlIIllllllIl = MapGenCaves.lIlIlIlIlIIIll[4];
                    }
                    if (lllIlllIIlIIllI(lllllllllllllIIIlIIIIlIIllllllII, MapGenCaves.lIlIlIlIlIIIll[1])) {
                        lllllllllllllIIIlIIIIlIIllllllII = MapGenCaves.lIlIlIlIlIIIll[1];
                    }
                    if (lllIlllIIlIIlll(lllllllllllllIIIlIIIIlIIlllllIll, MapGenCaves.lIlIlIlIlIIIll[6])) {
                        lllllllllllllIIIlIIIIlIIlllllIll = MapGenCaves.lIlIlIlIlIIIll[6];
                    }
                    if (lllIlllIIlIIllI(lllllllllllllIIIlIIIIlIIlllllIlI, MapGenCaves.lIlIlIlIlIIIll[8])) {
                        lllllllllllllIIIlIIIIlIIlllllIlI = MapGenCaves.lIlIlIlIlIIIll[8];
                    }
                    if (lllIlllIIlIIlIl(lllllllllllllIIIlIIIIlIIlllllIIl)) {
                        lllllllllllllIIIlIIIIlIIlllllIIl = MapGenCaves.lIlIlIlIlIIIll[4];
                    }
                    if (lllIlllIIlIIllI(lllllllllllllIIIlIIIIlIIlllllIII, MapGenCaves.lIlIlIlIlIIIll[1])) {
                        lllllllllllllIIIlIIIIlIIlllllIII = MapGenCaves.lIlIlIlIlIIIll[1];
                    }
                    boolean lllllllllllllIIIlIIIIlIIllllIlll = MapGenCaves.lIlIlIlIlIIIll[4] != 0;
                    int lllllllllllllIIIlIIIIlIIllllIllI = lllllllllllllIIIlIIIIlIIllllllIl;
                    "".length();
                    if (-(0xD1 ^ 0xA2 ^ (0xFE ^ 0x89)) >= 0) {
                        return;
                    }
                    while (lllIlllIIlIIIIl(lllllllllllllIIIlIIIIlIIllllIlll ? 1 : 0) && !lllIlllIIlIlIll(lllllllllllllIIIlIIIIlIIllllIllI, lllllllllllllIIIlIIIIlIIllllllII)) {
                        int lllllllllllllIIIlIIIIlIIllllIlIl = lllllllllllllIIIlIIIIlIIlllllIIl;
                        "".length();
                        if ((0xBD ^ 0xB9) <= ((0x15 ^ 0x43) & ~(0x21 ^ 0x77))) {
                            return;
                        }
                        while (lllIlllIIlIIIIl(lllllllllllllIIIlIIIIlIIllllIlll ? 1 : 0) && !lllIlllIIlIlIll(lllllllllllllIIIlIIIIlIIllllIlIl, lllllllllllllIIIlIIIIlIIlllllIII)) {
                            int lllllllllllllIIIlIIIIlIIllllIlII = lllllllllllllIIIlIIIIlIIlllllIlI + MapGenCaves.lIlIlIlIlIIIll[6];
                            "".length();
                            if (((0x44 ^ 0x65 ^ (0x21 ^ 0x54)) & (0xC6 ^ 0xB8 ^ (0x32 ^ 0x18) ^ -" ".length())) > ((0xD1 ^ 0xAA ^ (0x33 ^ 0x1B)) & (0x3E ^ 0x5 ^ (0x3 ^ 0x6B) ^ -" ".length()))) {
                                return;
                            }
                            while (lllIlllIIlIIIIl(lllllllllllllIIIlIIIIlIIllllIlll ? 1 : 0) && !lllIlllIIlIIlll(lllllllllllllIIIlIIIIlIIllllIlII, lllllllllllllIIIlIIIIlIIlllllIll - MapGenCaves.lIlIlIlIlIIIll[6])) {
                                if (lllIlllIIlIIlII(lllllllllllllIIIlIIIIlIIllllIlII) && lllIlllIIlIIlll(lllllllllllllIIIlIIIIlIIllllIlII, MapGenCaves.lIlIlIlIlIIIll[9])) {
                                    final IBlockState lllllllllllllIIIlIIIIlIIllllIIll = lllllllllllllIIIlIIIIlIlIIIllIII.getBlockState(lllllllllllllIIIlIIIIlIIllllIllI, lllllllllllllIIIlIIIIlIIllllIlII, lllllllllllllIIIlIIIIlIIllllIlIl);
                                    if (!lllIlllIIlIlIII(lllllllllllllIIIlIIIIlIIllllIIll.getBlock(), Blocks.flowing_water) || lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIllllIIll.getBlock(), Blocks.water)) {
                                        lllllllllllllIIIlIIIIlIIllllIlll = (MapGenCaves.lIlIlIlIlIIIll[6] != 0);
                                    }
                                    if (lllIlllIIlIlIlI(lllllllllllllIIIlIIIIlIIllllIlII, lllllllllllllIIIlIIIIlIIlllllIll - MapGenCaves.lIlIlIlIlIIIll[6]) && lllIlllIIlIlIlI(lllllllllllllIIIlIIIIlIIllllIllI, lllllllllllllIIIlIIIIlIIllllllIl) && lllIlllIIlIlIlI(lllllllllllllIIIlIIIIlIIllllIllI, lllllllllllllIIIlIIIIlIIllllllII - MapGenCaves.lIlIlIlIlIIIll[6]) && lllIlllIIlIlIlI(lllllllllllllIIIlIIIIlIIllllIlIl, lllllllllllllIIIlIIIIlIIlllllIIl) && lllIlllIIlIlIlI(lllllllllllllIIIlIIIIlIIllllIlIl, lllllllllllllIIIlIIIIlIIlllllIII - MapGenCaves.lIlIlIlIlIIIll[6])) {
                                        lllllllllllllIIIlIIIIlIIllllIlII = lllllllllllllIIIlIIIIlIIlllllIll;
                                    }
                                }
                                --lllllllllllllIIIlIIIIlIIllllIlII;
                            }
                            ++lllllllllllllIIIlIIIIlIIllllIlIl;
                        }
                        ++lllllllllllllIIIlIIIIlIIllllIllI;
                    }
                    if (lllIlllIIlIIIIl(lllllllllllllIIIlIIIIlIIllllIlll ? 1 : 0)) {
                        final BlockPos.MutableBlockPos lllllllllllllIIIlIIIIlIIllllIIlI = new BlockPos.MutableBlockPos();
                        int lllllllllllllIIIlIIIIlIIllllIIIl = lllllllllllllIIIlIIIIlIIllllllIl;
                        "".length();
                        if ("   ".length() > "   ".length()) {
                            return;
                        }
                        while (!lllIlllIIlIlIll(lllllllllllllIIIlIIIIlIIllllIIIl, lllllllllllllIIIlIIIIlIIllllllII)) {
                            final double lllllllllllllIIIlIIIIlIIllllIIII = (lllllllllllllIIIlIIIIlIIllllIIIl + lllllllllllllIIIlIIIIlIIlllIIllI * MapGenCaves.lIlIlIlIlIIIll[1] + 0.5 - lllllllllllllIIIlIIIIlIIlllIIIll) / lllllllllllllIIIlIIIIlIlIIIIIlIl;
                            int lllllllllllllIIIlIIIIlIIlllIllll = lllllllllllllIIIlIIIIlIIlllllIIl;
                            "".length();
                            if (((30 + 87 - 65 + 76 ^ 140 + 9 - 115 + 135) & (0x1 ^ 0x49 ^ (0xF2 ^ 0x93) ^ -" ".length())) >= "   ".length()) {
                                return;
                            }
                            while (!lllIlllIIlIlIll(lllllllllllllIIIlIIIIlIIlllIllll, lllllllllllllIIIlIIIIlIIlllllIII)) {
                                final double lllllllllllllIIIlIIIIlIIlllIlllI = (double)((lllllllllllllIIIlIIIIlIIlllIllll + lllllllllllllIIIlIIIIlIlIIIllIIl * MapGenCaves.lIlIlIlIlIIIll[1] + 0.5 - lllllllllllllIIIlIIIIlIIlllIIIIl) / lllllllllllllIIIlIIIIlIlIIIIIlIl);
                                boolean lllllllllllllIIIlIIIIlIIlllIllIl = MapGenCaves.lIlIlIlIlIIIll[4] != 0;
                                if (lllIlllIIlIIlIl(lllIlllIIIllllI(lllllllllllllIIIlIIIIlIIllllIIII * lllllllllllllIIIlIIIIlIIllllIIII + lllllllllllllIIIlIIIIlIIlllIlllI * lllllllllllllIIIlIIIIlIIlllIlllI, 1.0))) {
                                    int lllllllllllllIIIlIIIIlIIlllIllII = lllllllllllllIIIlIIIIlIIlllllIlI;
                                    "".length();
                                    if ((0x75 ^ 0x71) < 0) {
                                        return;
                                    }
                                    while (!lllIlllIIlIllII(lllllllllllllIIIlIIIIlIIlllIllII, lllllllllllllIIIlIIIIlIIlllllIll)) {
                                        final double lllllllllllllIIIlIIIIlIIlllIlIll = (lllllllllllllIIIlIIIIlIIlllIllII - MapGenCaves.lIlIlIlIlIIIll[6] + 0.5 - lllllllllllllIIIlIIIIlIIlllIIIlI) / lllllllllllllIIIlIIIIlIlIIIIIlII;
                                        if (lllIlllIIlIIIll(lllIlllIIIlllIl(lllllllllllllIIIlIIIIlIIlllIlIll, -0.7)) && lllIlllIIlIIlIl(lllIlllIIIllllI(lllllllllllllIIIlIIIIlIIllllIIII * lllllllllllllIIIlIIIIlIIllllIIII + lllllllllllllIIIlIIIIlIIlllIlIll * lllllllllllllIIIlIIIIlIIlllIlIll + lllllllllllllIIIlIIIIlIIlllIlllI * lllllllllllllIIIlIIIIlIIlllIlllI, 1.0))) {
                                            final IBlockState lllllllllllllIIIlIIIIlIIlllIlIlI = lllllllllllllIIIlIIIIlIlIIIllIII.getBlockState(lllllllllllllIIIlIIIIlIIllllIIIl, lllllllllllllIIIlIIIIlIIlllIllII, lllllllllllllIIIlIIIIlIIlllIllll);
                                            final IBlockState lllllllllllllIIIlIIIIlIIlllIlIIl = (IBlockState)Objects.firstNonNull((Object)lllllllllllllIIIlIIIIlIlIIIllIII.getBlockState(lllllllllllllIIIlIIIIlIIllllIIIl, lllllllllllllIIIlIIIIlIIlllIllII + MapGenCaves.lIlIlIlIlIIIll[6], lllllllllllllIIIlIIIIlIIlllIllll), (Object)Blocks.air.getDefaultState());
                                            if (!lllIlllIIlIlIII(lllllllllllllIIIlIIIIlIIlllIlIlI.getBlock(), Blocks.grass) || lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlllIlIlI.getBlock(), Blocks.mycelium)) {
                                                lllllllllllllIIIlIIIIlIIlllIllIl = (MapGenCaves.lIlIlIlIlIIIll[6] != 0);
                                            }
                                            if (lllIlllIIlIIIlI(this.func_175793_a(lllllllllllllIIIlIIIIlIIlllIlIlI, lllllllllllllIIIlIIIIlIIlllIlIIl) ? 1 : 0)) {
                                                if (lllIlllIIlIIlll(lllllllllllllIIIlIIIIlIIlllIllII - MapGenCaves.lIlIlIlIlIIIll[6], MapGenCaves.lIlIlIlIlIIIll[10])) {
                                                    lllllllllllllIIIlIIIIlIlIIIllIII.setBlockState(lllllllllllllIIIlIIIIlIIllllIIIl, lllllllllllllIIIlIIIIlIIlllIllII, lllllllllllllIIIlIIIIlIIlllIllll, Blocks.lava.getDefaultState());
                                                    "".length();
                                                    if ("   ".length() >= (0x63 ^ 0x67)) {
                                                        return;
                                                    }
                                                }
                                                else {
                                                    lllllllllllllIIIlIIIIlIlIIIllIII.setBlockState(lllllllllllllIIIlIIIIlIIllllIIIl, lllllllllllllIIIlIIIIlIIlllIllII, lllllllllllllIIIlIIIIlIIlllIllll, Blocks.air.getDefaultState());
                                                    if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlllIlIIl.getBlock(), Blocks.sand)) {
                                                        final int lllllllllllllIIIIlIIlIIllIllIIII = lllllllllllllIIIlIIIIlIIllllIIIl;
                                                        final int lllllllllllllIIIIlIIlIIllIlIlIIl = lllllllllllllIIIlIIIIlIIlllIllII + MapGenCaves.lIlIlIlIlIIIll[6];
                                                        final int lllllllllllllIIIIlIIlIIllIlIlllI = lllllllllllllIIIlIIIIlIIlllIllll;
                                                        IBlockState lllllllllllllIIIIlIIlIIllIlIllIl;
                                                        if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlllIlIIl.getValue(BlockSand.VARIANT), BlockSand.EnumType.RED_SAND)) {
                                                            lllllllllllllIIIIlIIlIIllIlIllIl = Blocks.red_sandstone.getDefaultState();
                                                            "".length();
                                                            if (-"  ".length() >= 0) {
                                                                return;
                                                            }
                                                        }
                                                        else {
                                                            lllllllllllllIIIIlIIlIIllIlIllIl = Blocks.sandstone.getDefaultState();
                                                        }
                                                        lllllllllllllIIIlIIIIlIlIIIllIII.setBlockState(lllllllllllllIIIIlIIlIIllIllIIII, lllllllllllllIIIIlIIlIIllIlIlIIl, lllllllllllllIIIIlIIlIIllIlIlllI, lllllllllllllIIIIlIIlIIllIlIllIl);
                                                    }
                                                    if (lllIlllIIlIIIlI(lllllllllllllIIIlIIIIlIIlllIllIl ? 1 : 0) && lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIlIIIllIII.getBlockState(lllllllllllllIIIlIIIIlIIllllIIIl, lllllllllllllIIIlIIIIlIIlllIllII - MapGenCaves.lIlIlIlIlIIIll[6], lllllllllllllIIIlIIIIlIIlllIllll).getBlock(), Blocks.dirt)) {
                                                        lllllllllllllIIIlIIIIlIIllllIIlI.func_181079_c(lllllllllllllIIIlIIIIlIIllllIIIl + lllllllllllllIIIlIIIIlIIlllIIllI * MapGenCaves.lIlIlIlIlIIIll[1], MapGenCaves.lIlIlIlIlIIIll[4], lllllllllllllIIIlIIIIlIIlllIllll + lllllllllllllIIIlIIIIlIlIIIllIIl * MapGenCaves.lIlIlIlIlIIIll[1]);
                                                        "".length();
                                                        lllllllllllllIIIlIIIIlIlIIIllIII.setBlockState(lllllllllllllIIIlIIIIlIIllllIIIl, lllllllllllllIIIlIIIIlIIlllIllII - MapGenCaves.lIlIlIlIlIIIll[6], lllllllllllllIIIlIIIIlIIlllIllll, this.worldObj.getBiomeGenForCoords(lllllllllllllIIIlIIIIlIIllllIIlI).topBlock.getBlock().getDefaultState());
                                                    }
                                                }
                                            }
                                        }
                                        --lllllllllllllIIIlIIIIlIIlllIllII;
                                    }
                                }
                                ++lllllllllllllIIIlIIIIlIIlllIllll;
                            }
                            ++lllllllllllllIIIlIIIIlIIllllIIIl;
                        }
                        if (lllIlllIIlIIIlI(lllllllllllllIIIlIIIIlIlIIIIlIII ? 1 : 0)) {
                            "".length();
                            if (" ".length() != " ".length()) {
                                return;
                            }
                            break;
                        }
                    }
                }
            }
            ++lllllllllllllIIIlIIIIlIIllIlllIl;
        }
    }
    
    private static boolean lllIlllIIIlllll(final int lllllllllllllIIIlIIIIlIIIlIllIll) {
        return lllllllllllllIIIlIIIIlIIIlIllIll <= 0;
    }
    
    private static boolean lllIlllIIlIlIIl(final Object lllllllllllllIIIlIIIIlIIIllIIllI, final Object lllllllllllllIIIlIIIIlIIIllIIlIl) {
        return lllllllllllllIIIlIIIIlIIIllIIllI == lllllllllllllIIIlIIIIlIIIllIIlIl;
    }
    
    private static boolean lllIlllIIlIIIIl(final int lllllllllllllIIIlIIIIlIIIllIIIIl) {
        return lllllllllllllIIIlIIIIlIIIllIIIIl == 0;
    }
    
    @Override
    protected void recursiveGenerate(final World lllllllllllllIIIlIIIIlIIlIlIIIII, final int lllllllllllllIIIlIIIIlIIlIIlllll, final int lllllllllllllIIIlIIIIlIIlIIIlllI, final int lllllllllllllIIIlIIIIlIIlIIIllIl, final int lllllllllllllIIIlIIIIlIIlIIlllII, final ChunkPrimer lllllllllllllIIIlIIIIlIIlIIIlIll) {
        int lllllllllllllIIIlIIIIlIIlIIllIlI = this.rand.nextInt(this.rand.nextInt(this.rand.nextInt(MapGenCaves.lIlIlIlIlIIIll[11]) + MapGenCaves.lIlIlIlIlIIIll[6]) + MapGenCaves.lIlIlIlIlIIIll[6]);
        if (lllIlllIIlIIIlI(this.rand.nextInt(MapGenCaves.lIlIlIlIlIIIll[12]))) {
            lllllllllllllIIIlIIIIlIIlIIllIlI = MapGenCaves.lIlIlIlIlIIIll[4];
        }
        int lllllllllllllIIIlIIIIlIIlIIllIIl = MapGenCaves.lIlIlIlIlIIIll[4];
        "".length();
        if (((0x57 ^ 0x1) & ~(0xF7 ^ 0xA1)) != 0x0) {
            return;
        }
        while (!lllIlllIIlIlIll(lllllllllllllIIIlIIIIlIIlIIllIIl, lllllllllllllIIIlIIIIlIIlIIllIlI)) {
            final double lllllllllllllIIIlIIIIlIIlIIllIII = lllllllllllllIIIlIIIIlIIlIIlllll * MapGenCaves.lIlIlIlIlIIIll[1] + this.rand.nextInt(MapGenCaves.lIlIlIlIlIIIll[1]);
            final double lllllllllllllIIIlIIIIlIIlIIlIlll = this.rand.nextInt(this.rand.nextInt(MapGenCaves.lIlIlIlIlIIIll[13]) + MapGenCaves.lIlIlIlIlIIIll[2]);
            final double lllllllllllllIIIlIIIIlIIlIIlIllI = lllllllllllllIIIlIIIIlIIlIIIlllI * MapGenCaves.lIlIlIlIlIIIll[1] + this.rand.nextInt(MapGenCaves.lIlIlIlIlIIIll[1]);
            int lllllllllllllIIIlIIIIlIIlIIlIlIl = MapGenCaves.lIlIlIlIlIIIll[6];
            if (lllIlllIIlIIIIl(this.rand.nextInt(MapGenCaves.lIlIlIlIlIIIll[3]))) {
                this.func_180703_a(this.rand.nextLong(), lllllllllllllIIIlIIIIlIIlIIIllIl, lllllllllllllIIIlIIIIlIIlIIlllII, lllllllllllllIIIlIIIIlIIlIIIlIll, lllllllllllllIIIlIIIIlIIlIIllIII, lllllllllllllIIIlIIIIlIIlIIlIlll, lllllllllllllIIIlIIIIlIIlIIlIllI);
                lllllllllllllIIIlIIIIlIIlIIlIlIl += this.rand.nextInt(MapGenCaves.lIlIlIlIlIIIll[3]);
            }
            int lllllllllllllIIIlIIIIlIIlIIlIlII = MapGenCaves.lIlIlIlIlIIIll[4];
            "".length();
            if ("  ".length() < 0) {
                return;
            }
            while (!lllIlllIIlIlIll(lllllllllllllIIIlIIIIlIIlIIlIlII, lllllllllllllIIIlIIIIlIIlIIlIlIl)) {
                final float lllllllllllllIIIlIIIIlIIlIIlIIll = this.rand.nextFloat() * 3.1415927f * 2.0f;
                final float lllllllllllllIIIlIIIIlIIlIIlIIlI = (this.rand.nextFloat() - 0.5f) * 2.0f / 8.0f;
                float lllllllllllllIIIlIIIIlIIlIIlIIIl = this.rand.nextFloat() * 2.0f + this.rand.nextFloat();
                if (lllIlllIIlIIIIl(this.rand.nextInt(MapGenCaves.lIlIlIlIlIIIll[10]))) {
                    lllllllllllllIIIlIIIIlIIlIIlIIIl *= this.rand.nextFloat() * this.rand.nextFloat() * 3.0f + 1.0f;
                }
                this.func_180702_a(this.rand.nextLong(), lllllllllllllIIIlIIIIlIIlIIIllIl, lllllllllllllIIIlIIIIlIIlIIlllII, lllllllllllllIIIlIIIIlIIlIIIlIll, lllllllllllllIIIlIIIIlIIlIIllIII, lllllllllllllIIIlIIIIlIIlIIlIlll, lllllllllllllIIIlIIIIlIIlIIlIllI, lllllllllllllIIIlIIIIlIIlIIlIIIl, lllllllllllllIIIlIIIIlIIlIIlIIll, lllllllllllllIIIlIIIIlIIlIIlIIlI, MapGenCaves.lIlIlIlIlIIIll[4], MapGenCaves.lIlIlIlIlIIIll[4], 1.0);
                ++lllllllllllllIIIlIIIIlIIlIIlIlII;
            }
            ++lllllllllllllIIIlIIIIlIIlIIllIIl;
        }
    }
    
    protected boolean func_175793_a(final IBlockState lllllllllllllIIIlIIIIlIIlIllIlIl, final IBlockState lllllllllllllIIIlIIIIlIIlIllIIlI) {
        int n;
        if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.stone)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if (((0x32 ^ 0x1F) & ~(0x36 ^ 0x1B)) != 0x0) {
                return ((0x86 ^ 0x9C) & ~(0x85 ^ 0x9F)) != 0x0;
            }
        }
        else if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.dirt)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if (null != null) {
                return ((0x82 ^ 0x9E ^ (0x24 ^ 0x3D)) & (0x9D ^ 0xB7 ^ (0x28 ^ 0x7) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.grass)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x82 ^ 0x84) & ~(0x6 ^ 0x0)) != 0x0;
            }
        }
        else if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.hardened_clay)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if ((0x85 ^ 0x81) == 0x0) {
                return ((0x74 ^ 0x62) & ~(0x4 ^ 0x12)) != 0x0;
            }
        }
        else if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.stained_hardened_clay)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if ("   ".length() <= 0) {
                return ("  ".length() & ~"  ".length()) != 0x0;
            }
        }
        else if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.sandstone)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if (-(0x4B ^ 0x28 ^ (0x6C ^ 0xB)) > 0) {
                return ((0x72 ^ 0x41 ^ (0x67 ^ 0x5C)) & (112 + 180 - 185 + 77 ^ 116 + 147 - 159 + 72 ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.red_sandstone)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if (" ".length() <= 0) {
                return ((0x25 ^ 0x7) & ~(0x64 ^ 0x46)) != 0x0;
            }
        }
        else if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.mycelium)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if (" ".length() < 0) {
                return ((131 + 107 - 177 + 157 ^ 18 + 62 - 18 + 92) & (2 + 86 + 48 + 63 ^ 10 + 114 - 53 + 64 ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.snow_layer)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if (((0xE1 ^ 0xBA) & ~(0xFC ^ 0xA7)) > ((0x4B ^ 0x2B) & ~(0x6C ^ 0xC))) {
                return ((0xAF ^ 0x9C) & ~(0x7B ^ 0x48)) != 0x0;
            }
        }
        else if ((!lllIlllIIlIlIII(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.sand) || lllIlllIIlIlIIl(lllllllllllllIIIlIIIIlIIlIllIlIl.getBlock(), Blocks.gravel)) && lllIlllIIlIlIII(lllllllllllllIIIlIIIIlIIlIllIIlI.getBlock().getMaterial(), Material.water)) {
            n = MapGenCaves.lIlIlIlIlIIIll[6];
            "".length();
            if (" ".length() < -" ".length()) {
                return ((0xD4 ^ 0x89) & ~(0xDB ^ 0x86)) != 0x0;
            }
        }
        else {
            n = MapGenCaves.lIlIlIlIlIIIll[4];
        }
        return n != 0;
    }
    
    private static int lllIlllIIIlllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    protected void func_180703_a(final long lllllllllllllIIIlIIIIlIlIlIllIll, final int lllllllllllllIIIlIIIIlIlIlIlIIlI, final int lllllllllllllIIIlIIIIlIlIlIllIIl, final ChunkPrimer lllllllllllllIIIlIIIIlIlIlIllIII, final double lllllllllllllIIIlIIIIlIlIlIlIlll, final double lllllllllllllIIIlIIIIlIlIlIIlllI, final double lllllllllllllIIIlIIIIlIlIlIIllIl) {
        this.func_180702_a(lllllllllllllIIIlIIIIlIlIlIllIll, lllllllllllllIIIlIIIIlIlIlIlIIlI, lllllllllllllIIIlIIIIlIlIlIllIIl, lllllllllllllIIIlIIIIlIlIlIllIII, lllllllllllllIIIlIIIIlIlIlIlIlll, lllllllllllllIIIlIIIIlIlIlIIlllI, lllllllllllllIIIlIIIIlIlIlIIllIl, 1.0f + this.rand.nextFloat() * 6.0f, 0.0f, 0.0f, MapGenCaves.lIlIlIlIlIIIll[0], MapGenCaves.lIlIlIlIlIIIll[0], 0.5);
    }
    
    private static boolean lllIlllIIlIIllI(final int lllllllllllllIIIlIIIIlIIIllIlllI, final int lllllllllllllIIIlIIIIlIIIllIllIl) {
        return lllllllllllllIIIlIIIIlIIIllIlllI > lllllllllllllIIIlIIIIlIIIllIllIl;
    }
    
    static {
        lllIlllIIIllIll();
    }
    
    private static int lllIlllIIIlllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllIlllIIlIIIlI(final int lllllllllllllIIIlIIIIlIIIllIIIll) {
        return lllllllllllllIIIlIIIIlIIIllIIIll != 0;
    }
}
