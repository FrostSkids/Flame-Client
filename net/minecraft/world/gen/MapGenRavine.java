// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import java.util.Random;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.World;

public class MapGenRavine extends MapGenBase
{
    private /* synthetic */ float[] field_75046_d;
    private static final /* synthetic */ int[] lIIIlIIIllIIll;
    
    private static boolean lIlllllIllIIlIl(final int lllllllllllllIlIIIlIllllIIIIIlll, final int lllllllllllllIlIIIlIllllIIIIIllI) {
        return lllllllllllllIlIIIlIllllIIIIIlll <= lllllllllllllIlIIIlIllllIIIIIllI;
    }
    
    private static boolean lIlllllIllIIIll(final Object lllllllllllllIlIIIlIlllIllllIIll, final Object lllllllllllllIlIIIlIlllIllllIIIl) {
        return lllllllllllllIlIIIlIlllIllllIIll == lllllllllllllIlIIIlIlllIllllIIIl;
    }
    
    @Override
    protected void recursiveGenerate(final World lllllllllllllIlIIIlIllllIlIIIlIl, final int lllllllllllllIlIIIlIllllIlIIIIll, final int lllllllllllllIlIIIlIllllIIlIllll, final int lllllllllllllIlIIIlIllllIIlIllIl, final int lllllllllllllIlIIIlIllllIIllllll, final ChunkPrimer lllllllllllllIlIIIlIllllIIlIlIlI) {
        if (lIlllllIlIllIll(this.rand.nextInt(MapGenRavine.lIIIlIIIllIIll[12]))) {
            final double lllllllllllllIlIIIlIllllIIllllII = lllllllllllllIlIIIlIllllIlIIIIll * MapGenRavine.lIIIlIIIllIIll[1] + this.rand.nextInt(MapGenRavine.lIIIlIIIllIIll[1]);
            final double lllllllllllllIlIIIlIllllIIlllIll = this.rand.nextInt(this.rand.nextInt(MapGenRavine.lIIIlIIIllIIll[13]) + MapGenRavine.lIIIlIIIllIIll[2]) + MapGenRavine.lIIIlIIIllIIll[14];
            final double lllllllllllllIlIIIlIllllIIlllIlI = lllllllllllllIlIIIlIllllIIlIllll * MapGenRavine.lIIIlIIIllIIll[1] + this.rand.nextInt(MapGenRavine.lIIIlIIIllIIll[1]);
            final int lllllllllllllIlIIIlIllllIIlllIIl = MapGenRavine.lIIIlIIIllIIll[7];
            int lllllllllllllIlIIIlIllllIIlllIII = MapGenRavine.lIIIlIIIllIIll[4];
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
            while (!lIlllllIlIlllII(lllllllllllllIlIIIlIllllIIlllIII, lllllllllllllIlIIIlIllllIIlllIIl)) {
                final float lllllllllllllIlIIIlIllllIIllIlll = this.rand.nextFloat() * 3.1415927f * 2.0f;
                final float lllllllllllllIlIIIlIllllIIllIlIl = (this.rand.nextFloat() - 0.5f) * 2.0f / 8.0f;
                final float lllllllllllllIlIIIlIllllIIllIIll = (this.rand.nextFloat() * 2.0f + this.rand.nextFloat()) * 2.0f;
                this.func_180707_a(this.rand.nextLong(), lllllllllllllIlIIIlIllllIIlIllIl, lllllllllllllIlIIIlIllllIIllllll, lllllllllllllIlIIIlIllllIIlIlIlI, lllllllllllllIlIIIlIllllIIllllII, lllllllllllllIlIIIlIllllIIlllIll, lllllllllllllIlIIIlIllllIIlllIlI, lllllllllllllIlIIIlIllllIIllIIll, lllllllllllllIlIIIlIllllIIllIlll, lllllllllllllIlIIIlIllllIIllIlIl, MapGenRavine.lIIIlIIIllIIll[4], MapGenRavine.lIIIlIIIllIIll[4], 3.0);
                ++lllllllllllllIlIIIlIllllIIlllIII;
            }
        }
    }
    
    private static boolean lIlllllIlIllIIl(final int lllllllllllllIlIIIlIllllIIIlIlIl, final int lllllllllllllIlIIIlIllllIIIlIlII) {
        return lllllllllllllIlIIIlIllllIIIlIlIl == lllllllllllllIlIIIlIllllIIIlIlII;
    }
    
    public MapGenRavine() {
        this.field_75046_d = new float[MapGenRavine.lIIIlIIIllIIll[0]];
    }
    
    private static int lIlllllIlIlIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlllllIlIlllII(final int lllllllllllllIlIIIlIllllIIIlIIIl, final int lllllllllllllIlIIIlIllllIIIlIIII) {
        return lllllllllllllIlIIIlIllllIIIlIIIl >= lllllllllllllIlIIIlIllllIIIlIIII;
    }
    
    private static boolean lIlllllIllIIIIl(final int lllllllllllllIlIIIlIllllIIIIlIll, final int lllllllllllllIlIIIlIllllIIIIlIlI) {
        return lllllllllllllIlIIIlIllllIIIIlIll < lllllllllllllIlIIIlIllllIIIIlIlI;
    }
    
    protected void func_180707_a(final long lllllllllllllIlIIIlIlllllIIllIlI, final int lllllllllllllIlIIIlIlllllllIIIll, final int lllllllllllllIlIIIlIlllllIIllIII, final ChunkPrimer lllllllllllllIlIIIlIlllllllIIIII, double lllllllllllllIlIIIlIlllllIIlIlIl, double lllllllllllllIlIIIlIlllllIIlIlII, double lllllllllllllIlIIIlIlllllIIlIIlI, final float lllllllllllllIlIIIlIllllllIllIIl, float lllllllllllllIlIIIlIlllllIIlIIII, float lllllllllllllIlIIIlIlllllIIIlllI, int lllllllllllllIlIIIlIlllllIIIllII, int lllllllllllllIlIIIlIlllllIIIlIlI, final double lllllllllllllIlIIIlIllllllIlIlII) {
        final Random lllllllllllllIlIIIlIllllllIlIIlI = new Random(lllllllllllllIlIIIlIlllllIIllIlI);
        final double lllllllllllllIlIIIlIllllllIlIIII = lllllllllllllIlIIIlIlllllllIIIll * MapGenRavine.lIIIlIIIllIIll[1] + MapGenRavine.lIIIlIIIllIIll[2];
        final double lllllllllllllIlIIIlIllllllIIlllI = lllllllllllllIlIIIlIlllllIIllIII * MapGenRavine.lIIIlIIIllIIll[1] + MapGenRavine.lIIIlIIIllIIll[2];
        float lllllllllllllIlIIIlIllllllIIllIl = 0.0f;
        float lllllllllllllIlIIIlIllllllIIllII = 0.0f;
        if (lIlllllIlIllIII((int)lllllllllllllIlIIIlIlllllIIIlIlI)) {
            final int lllllllllllllIlIIIlIllllllIIlIlI = this.range * MapGenRavine.lIIIlIIIllIIll[1] - MapGenRavine.lIIIlIIIllIIll[1];
            lllllllllllllIlIIIlIlllllIIIlIlI = lllllllllllllIlIIIlIllllllIIlIlI - lllllllllllllIlIIIlIllllllIlIIlI.nextInt(lllllllllllllIlIIIlIllllllIIlIlI / MapGenRavine.lIIIlIIIllIIll[3]);
        }
        boolean lllllllllllllIlIIIlIllllllIIlIII = MapGenRavine.lIIIlIIIllIIll[4] != 0;
        if (lIlllllIlIllIIl((int)lllllllllllllIlIIIlIlllllIIIllII, MapGenRavine.lIIIlIIIllIIll[5])) {
            lllllllllllllIlIIIlIlllllIIIllII = lllllllllllllIlIIIlIlllllIIIlIlI / MapGenRavine.lIIIlIIIllIIll[6];
            lllllllllllllIlIIIlIllllllIIlIII = (MapGenRavine.lIIIlIIIllIIll[7] != 0);
        }
        float lllllllllllllIlIIIlIllllllIIIllI = 1.0f;
        int lllllllllllllIlIIIlIllllllIIIlII = MapGenRavine.lIIIlIIIllIIll[4];
        "".length();
        if ((0x66 ^ 0x62) <= "  ".length()) {
            return;
        }
        while (!lIlllllIlIlllII(lllllllllllllIlIIIlIllllllIIIlII, MapGenRavine.lIIIlIIIllIIll[9])) {
            if (!lIlllllIlIllIlI(lllllllllllllIlIIIlIllllllIIIlII) || lIlllllIlIllIll(lllllllllllllIlIIIlIllllllIlIIlI.nextInt(MapGenRavine.lIIIlIIIllIIll[8]))) {
                lllllllllllllIlIIIlIllllllIIIllI = 1.0f + lllllllllllllIlIIIlIllllllIlIIlI.nextFloat() * lllllllllllllIlIIIlIllllllIlIIlI.nextFloat() * 1.0f;
            }
            this.field_75046_d[lllllllllllllIlIIIlIllllllIIIlII] = lllllllllllllIlIIIlIllllllIIIllI * lllllllllllllIlIIIlIllllllIIIllI;
            ++lllllllllllllIlIIIlIllllllIIIlII;
        }
        "".length();
        if (-" ".length() > -" ".length()) {
            return;
        }
        while (!lIlllllIlIlllII((int)lllllllllllllIlIIIlIlllllIIIllII, (int)lllllllllllllIlIIIlIlllllIIIlIlI)) {
            double lllllllllllllIlIIIlIllllllIIIIlI = 1.5 + MathHelper.sin((float)lllllllllllllIlIIIlIlllllIIIllII * 3.1415927f / (float)lllllllllllllIlIIIlIlllllIIIlIlI) * lllllllllllllIlIIIlIllllllIllIIl * 1.0f;
            double lllllllllllllIlIIIlIllllllIIIIIl = lllllllllllllIlIIIlIllllllIIIIlI * lllllllllllllIlIIIlIllllllIlIlII;
            lllllllllllllIlIIIlIllllllIIIIlI *= lllllllllllllIlIIIlIllllllIlIIlI.nextFloat() * 0.25 + 0.75;
            lllllllllllllIlIIIlIllllllIIIIIl *= lllllllllllllIlIIIlIllllllIlIIlI.nextFloat() * 0.25 + 0.75;
            final float lllllllllllllIlIIIlIllllllIIIIII = MathHelper.cos(lllllllllllllIlIIIlIlllllIIIlllI);
            final float lllllllllllllIlIIIlIlllllIllllll = MathHelper.sin(lllllllllllllIlIIIlIlllllIIIlllI);
            lllllllllllllIlIIIlIlllllIIlIlIl += MathHelper.cos(lllllllllllllIlIIIlIlllllIIlIIII) * lllllllllllllIlIIIlIllllllIIIIII;
            lllllllllllllIlIIIlIlllllIIlIlII += lllllllllllllIlIIIlIlllllIllllll;
            lllllllllllllIlIIIlIlllllIIlIIlI += MathHelper.sin(lllllllllllllIlIIIlIlllllIIlIIII) * lllllllllllllIlIIIlIllllllIIIIII;
            lllllllllllllIlIIIlIlllllIIIlllI *= 0.7f;
            lllllllllllllIlIIIlIlllllIIIlllI += lllllllllllllIlIIIlIllllllIIllII * 0.05f;
            lllllllllllllIlIIIlIlllllIIlIIII += lllllllllllllIlIIIlIllllllIIllIl * 0.05f;
            lllllllllllllIlIIIlIllllllIIllII *= 0.8f;
            lllllllllllllIlIIIlIllllllIIllIl *= 0.5f;
            lllllllllllllIlIIIlIllllllIIllII += (lllllllllllllIlIIIlIllllllIlIIlI.nextFloat() - lllllllllllllIlIIIlIllllllIlIIlI.nextFloat()) * lllllllllllllIlIIIlIllllllIlIIlI.nextFloat() * 2.0f;
            lllllllllllllIlIIIlIllllllIIllIl += (lllllllllllllIlIIIlIllllllIlIIlI.nextFloat() - lllllllllllllIlIIIlIllllllIlIIlI.nextFloat()) * lllllllllllllIlIIIlIllllllIlIIlI.nextFloat() * 4.0f;
            if (!lIlllllIlIllIll(lllllllllllllIlIIIlIllllllIIlIII ? 1 : 0) || lIlllllIlIllIlI(lllllllllllllIlIIIlIllllllIlIIlI.nextInt(MapGenRavine.lIIIlIIIllIIll[3]))) {
                final double lllllllllllllIlIIIlIlllllIlllllI = lllllllllllllIlIIIlIlllllIIlIlIl - lllllllllllllIlIIIlIllllllIlIIII;
                final double lllllllllllllIlIIIlIlllllIllllIl = lllllllllllllIlIIIlIlllllIIlIIlI - lllllllllllllIlIIIlIllllllIIlllI;
                final double lllllllllllllIlIIIlIlllllIllllII = (double)(lllllllllllllIlIIIlIlllllIIIlIlI - lllllllllllllIlIIIlIlllllIIIllII);
                final double lllllllllllllIlIIIlIlllllIlllIll = lllllllllllllIlIIIlIllllllIllIIl + 2.0f + 16.0f;
                if (lIlllllIlIlllIl(lIlllllIlIlIllI(lllllllllllllIlIIIlIlllllIlllllI * lllllllllllllIlIIIlIlllllIlllllI + lllllllllllllIlIIIlIlllllIllllIl * lllllllllllllIlIIIlIlllllIllllIl - lllllllllllllIlIIIlIlllllIllllII * lllllllllllllIlIIIlIlllllIllllII, lllllllllllllIlIIIlIlllllIlllIll * lllllllllllllIlIIIlIlllllIlllIll))) {
                    return;
                }
                if (lIlllllIlIllllI(lIlllllIlIlIllI(lllllllllllllIlIIIlIlllllIIlIlIl, lllllllllllllIlIIIlIllllllIlIIII - 16.0 - lllllllllllllIlIIIlIllllllIIIIlI * 2.0)) && lIlllllIlIllllI(lIlllllIlIlIllI(lllllllllllllIlIIIlIlllllIIlIIlI, lllllllllllllIlIIIlIllllllIIlllI - 16.0 - lllllllllllllIlIIIlIllllllIIIIlI * 2.0)) && lIlllllIlIllIII(lIlllllIlIlIlll(lllllllllllllIlIIIlIlllllIIlIlIl, lllllllllllllIlIIIlIllllllIlIIII + 16.0 + lllllllllllllIlIIIlIllllllIIIIlI * 2.0)) && lIlllllIlIllIII(lIlllllIlIlIlll(lllllllllllllIlIIIlIlllllIIlIIlI, lllllllllllllIlIIIlIllllllIIlllI + 16.0 + lllllllllllllIlIIIlIllllllIIIIlI * 2.0))) {
                    int lllllllllllllIlIIIlIlllllIlllIlI = MathHelper.floor_double(lllllllllllllIlIIIlIlllllIIlIlIl - lllllllllllllIlIIIlIllllllIIIIlI) - lllllllllllllIlIIIlIlllllllIIIll * MapGenRavine.lIIIlIIIllIIll[1] - MapGenRavine.lIIIlIIIllIIll[7];
                    int lllllllllllllIlIIIlIlllllIlllIIl = MathHelper.floor_double(lllllllllllllIlIIIlIlllllIIlIlIl + lllllllllllllIlIIIlIllllllIIIIlI) - lllllllllllllIlIIIlIlllllllIIIll * MapGenRavine.lIIIlIIIllIIll[1] + MapGenRavine.lIIIlIIIllIIll[7];
                    int lllllllllllllIlIIIlIlllllIlllIII = MathHelper.floor_double(lllllllllllllIlIIIlIlllllIIlIlII - lllllllllllllIlIIIlIllllllIIIIIl) - MapGenRavine.lIIIlIIIllIIll[7];
                    int lllllllllllllIlIIIlIlllllIllIllI = MathHelper.floor_double(lllllllllllllIlIIIlIlllllIIlIlII + lllllllllllllIlIIIlIllllllIIIIIl) + MapGenRavine.lIIIlIIIllIIll[7];
                    int lllllllllllllIlIIIlIlllllIllIlII = MathHelper.floor_double(lllllllllllllIlIIIlIlllllIIlIIlI - lllllllllllllIlIIIlIllllllIIIIlI) - lllllllllllllIlIIIlIlllllIIllIII * MapGenRavine.lIIIlIIIllIIll[1] - MapGenRavine.lIIIlIIIllIIll[7];
                    int lllllllllllllIlIIIlIlllllIllIIll = MathHelper.floor_double(lllllllllllllIlIIIlIlllllIIlIIlI + lllllllllllllIlIIIlIllllllIIIIlI) - lllllllllllllIlIIIlIlllllIIllIII * MapGenRavine.lIIIlIIIllIIll[1] + MapGenRavine.lIIIlIIIllIIll[7];
                    if (lIlllllIlIlllll(lllllllllllllIlIIIlIlllllIlllIlI)) {
                        lllllllllllllIlIIIlIlllllIlllIlI = MapGenRavine.lIIIlIIIllIIll[4];
                    }
                    if (lIlllllIllIIIII(lllllllllllllIlIIIlIlllllIlllIIl, MapGenRavine.lIIIlIIIllIIll[1])) {
                        lllllllllllllIlIIIlIlllllIlllIIl = MapGenRavine.lIIIlIIIllIIll[1];
                    }
                    if (lIlllllIllIIIIl(lllllllllllllIlIIIlIlllllIlllIII, MapGenRavine.lIIIlIIIllIIll[7])) {
                        lllllllllllllIlIIIlIlllllIlllIII = MapGenRavine.lIIIlIIIllIIll[7];
                    }
                    if (lIlllllIllIIIII(lllllllllllllIlIIIlIlllllIllIllI, MapGenRavine.lIIIlIIIllIIll[10])) {
                        lllllllllllllIlIIIlIlllllIllIllI = MapGenRavine.lIIIlIIIllIIll[10];
                    }
                    if (lIlllllIlIlllll(lllllllllllllIlIIIlIlllllIllIlII)) {
                        lllllllllllllIlIIIlIlllllIllIlII = MapGenRavine.lIIIlIIIllIIll[4];
                    }
                    if (lIlllllIllIIIII(lllllllllllllIlIIIlIlllllIllIIll, MapGenRavine.lIIIlIIIllIIll[1])) {
                        lllllllllllllIlIIIlIlllllIllIIll = MapGenRavine.lIIIlIIIllIIll[1];
                    }
                    boolean lllllllllllllIlIIIlIlllllIllIIIl = MapGenRavine.lIIIlIIIllIIll[4] != 0;
                    int lllllllllllllIlIIIlIlllllIlIllll = lllllllllllllIlIIIlIlllllIlllIlI;
                    "".length();
                    if (" ".length() <= 0) {
                        return;
                    }
                    while (lIlllllIlIllIll(lllllllllllllIlIIIlIlllllIllIIIl ? 1 : 0) && !lIlllllIlIlllII(lllllllllllllIlIIIlIlllllIlIllll, lllllllllllllIlIIIlIlllllIlllIIl)) {
                        int lllllllllllllIlIIIlIlllllIlIllIl = lllllllllllllIlIIIlIlllllIllIlII;
                        "".length();
                        if (((0x4B ^ 0x70 ^ (0x4B ^ 0x6A)) & (0x58 ^ 0x7B ^ (0x2D ^ 0x14) ^ -" ".length())) < ((45 + 57 + 15 + 94 ^ 67 + 10 + 30 + 90) & (8 + 125 - 116 + 118 ^ 88 + 48 - 1 + 10 ^ -" ".length()))) {
                            return;
                        }
                        while (lIlllllIlIllIll(lllllllllllllIlIIIlIlllllIllIIIl ? 1 : 0) && !lIlllllIlIlllII(lllllllllllllIlIIIlIlllllIlIllIl, lllllllllllllIlIIIlIlllllIllIIll)) {
                            int lllllllllllllIlIIIlIlllllIlIlIll = lllllllllllllIlIIIlIlllllIllIllI + MapGenRavine.lIIIlIIIllIIll[7];
                            "".length();
                            if (" ".length() == ((0x7E ^ 0x2E ^ (0x1E ^ 0x2E)) & (0xAC ^ 0x8C ^ (0x7F ^ 0x3F) ^ -" ".length()))) {
                                return;
                            }
                            while (lIlllllIlIllIll(lllllllllllllIlIIIlIlllllIllIIIl ? 1 : 0) && !lIlllllIllIIIIl(lllllllllllllIlIIIlIlllllIlIlIll, lllllllllllllIlIIIlIlllllIlllIII - MapGenRavine.lIIIlIIIllIIll[7])) {
                                if (lIlllllIlIllllI(lllllllllllllIlIIIlIlllllIlIlIll) && lIlllllIllIIIIl(lllllllllllllIlIIIlIlllllIlIlIll, MapGenRavine.lIIIlIIIllIIll[9])) {
                                    final IBlockState lllllllllllllIlIIIlIlllllIlIlIIl = lllllllllllllIlIIIlIlllllllIIIII.getBlockState(lllllllllllllIlIIIlIlllllIlIllll, lllllllllllllIlIIIlIlllllIlIlIll, lllllllllllllIlIIIlIlllllIlIllIl);
                                    if (!lIlllllIllIIIlI(lllllllllllllIlIIIlIlllllIlIlIIl.getBlock(), Blocks.flowing_water) || lIlllllIllIIIll(lllllllllllllIlIIIlIlllllIlIlIIl.getBlock(), Blocks.water)) {
                                        lllllllllllllIlIIIlIlllllIllIIIl = (MapGenRavine.lIIIlIIIllIIll[7] != 0);
                                    }
                                    if (lIlllllIllIIlII(lllllllllllllIlIIIlIlllllIlIlIll, lllllllllllllIlIIIlIlllllIlllIII - MapGenRavine.lIIIlIIIllIIll[7]) && lIlllllIllIIlII(lllllllllllllIlIIIlIlllllIlIllll, lllllllllllllIlIIIlIlllllIlllIlI) && lIlllllIllIIlII(lllllllllllllIlIIIlIlllllIlIllll, lllllllllllllIlIIIlIlllllIlllIIl - MapGenRavine.lIIIlIIIllIIll[7]) && lIlllllIllIIlII(lllllllllllllIlIIIlIlllllIlIllIl, lllllllllllllIlIIIlIlllllIllIlII) && lIlllllIllIIlII(lllllllllllllIlIIIlIlllllIlIllIl, lllllllllllllIlIIIlIlllllIllIIll - MapGenRavine.lIIIlIIIllIIll[7])) {
                                        lllllllllllllIlIIIlIlllllIlIlIll = lllllllllllllIlIIIlIlllllIlllIII;
                                    }
                                }
                                --lllllllllllllIlIIIlIlllllIlIlIll;
                            }
                            ++lllllllllllllIlIIIlIlllllIlIllIl;
                        }
                        ++lllllllllllllIlIIIlIlllllIlIllll;
                    }
                    if (lIlllllIlIllIll(lllllllllllllIlIIIlIlllllIllIIIl ? 1 : 0)) {
                        final BlockPos.MutableBlockPos lllllllllllllIlIIIlIlllllIlIIlll = new BlockPos.MutableBlockPos();
                        int lllllllllllllIlIIIlIlllllIlIIllI = lllllllllllllIlIIIlIlllllIlllIlI;
                        "".length();
                        if ("   ".length() >= (0x2 ^ 0x6)) {
                            return;
                        }
                        while (!lIlllllIlIlllII(lllllllllllllIlIIIlIlllllIlIIllI, lllllllllllllIlIIIlIlllllIlllIIl)) {
                            final double lllllllllllllIlIIIlIlllllIlIIlIl = (lllllllllllllIlIIIlIlllllIlIIllI + lllllllllllllIlIIIlIlllllllIIIll * MapGenRavine.lIIIlIIIllIIll[1] + 0.5 - lllllllllllllIlIIIlIlllllIIlIlIl) / lllllllllllllIlIIIlIllllllIIIIlI;
                            int lllllllllllllIlIIIlIlllllIlIIIll = lllllllllllllIlIIIlIlllllIllIlII;
                            "".length();
                            if (-(0xB5 ^ 0xB0) >= 0) {
                                return;
                            }
                            while (!lIlllllIlIlllII(lllllllllllllIlIIIlIlllllIlIIIll, lllllllllllllIlIIIlIlllllIllIIll)) {
                                final double lllllllllllllIlIIIlIlllllIlIIIIl = (lllllllllllllIlIIIlIlllllIlIIIll + lllllllllllllIlIIIlIlllllIIllIII * MapGenRavine.lIIIlIIIllIIll[1] + 0.5 - lllllllllllllIlIIIlIlllllIIlIIlI) / lllllllllllllIlIIIlIllllllIIIIlI;
                                boolean lllllllllllllIlIIIlIlllllIIlllll = MapGenRavine.lIIIlIIIllIIll[4] != 0;
                                if (lIlllllIlIlllll(lIlllllIlIlIlll(lllllllllllllIlIIIlIlllllIlIIlIl * lllllllllllllIlIIIlIlllllIlIIlIl + lllllllllllllIlIIIlIlllllIlIIIIl * lllllllllllllIlIIIlIlllllIlIIIIl, 1.0))) {
                                    int lllllllllllllIlIIIlIlllllIIllllI = lllllllllllllIlIIIlIlllllIllIllI;
                                    "".length();
                                    if (((0x1C ^ 0x4D) & ~(0xC6 ^ 0x97)) < 0) {
                                        return;
                                    }
                                    while (!lIlllllIllIIlIl(lllllllllllllIlIIIlIlllllIIllllI, lllllllllllllIlIIIlIlllllIlllIII)) {
                                        final double lllllllllllllIlIIIlIlllllIIlllIl = (lllllllllllllIlIIIlIlllllIIllllI - MapGenRavine.lIIIlIIIllIIll[7] + 0.5 - lllllllllllllIlIIIlIlllllIIlIlII) / lllllllllllllIlIIIlIllllllIIIIIl;
                                        if (lIlllllIlIlllll(lIlllllIlIlIlll((lllllllllllllIlIIIlIlllllIlIIlIl * lllllllllllllIlIIIlIlllllIlIIlIl + lllllllllllllIlIIIlIlllllIlIIIIl * lllllllllllllIlIIIlIlllllIlIIIIl) * this.field_75046_d[lllllllllllllIlIIIlIlllllIIllllI - MapGenRavine.lIIIlIIIllIIll[7]] + lllllllllllllIlIIIlIlllllIIlllIl * lllllllllllllIlIIIlIlllllIIlllIl / 6.0, 1.0))) {
                                            final IBlockState lllllllllllllIlIIIlIlllllIIlllII = lllllllllllllIlIIIlIlllllllIIIII.getBlockState(lllllllllllllIlIIIlIlllllIlIIllI, lllllllllllllIlIIIlIlllllIIllllI, lllllllllllllIlIIIlIlllllIlIIIll);
                                            if (lIlllllIllIIIll(lllllllllllllIlIIIlIlllllIIlllII.getBlock(), Blocks.grass)) {
                                                lllllllllllllIlIIIlIlllllIIlllll = (MapGenRavine.lIIIlIIIllIIll[7] != 0);
                                            }
                                            if (!lIlllllIllIIIlI(lllllllllllllIlIIIlIlllllIIlllII.getBlock(), Blocks.stone) || !lIlllllIllIIIlI(lllllllllllllIlIIIlIlllllIIlllII.getBlock(), Blocks.dirt) || lIlllllIllIIIll(lllllllllllllIlIIIlIlllllIIlllII.getBlock(), Blocks.grass)) {
                                                if (lIlllllIllIIIIl(lllllllllllllIlIIIlIlllllIIllllI - MapGenRavine.lIIIlIIIllIIll[7], MapGenRavine.lIIIlIIIllIIll[11])) {
                                                    lllllllllllllIlIIIlIlllllllIIIII.setBlockState(lllllllllllllIlIIIlIlllllIlIIllI, lllllllllllllIlIIIlIlllllIIllllI, lllllllllllllIlIIIlIlllllIlIIIll, Blocks.flowing_lava.getDefaultState());
                                                    "".length();
                                                    if ("  ".length() != "  ".length()) {
                                                        return;
                                                    }
                                                }
                                                else {
                                                    lllllllllllllIlIIIlIlllllllIIIII.setBlockState(lllllllllllllIlIIIlIlllllIlIIllI, lllllllllllllIlIIIlIlllllIIllllI, lllllllllllllIlIIIlIlllllIlIIIll, Blocks.air.getDefaultState());
                                                    if (lIlllllIlIllIlI(lllllllllllllIlIIIlIlllllIIlllll ? 1 : 0) && lIlllllIllIIIll(lllllllllllllIlIIIlIlllllllIIIII.getBlockState(lllllllllllllIlIIIlIlllllIlIIllI, lllllllllllllIlIIIlIlllllIIllllI - MapGenRavine.lIIIlIIIllIIll[7], lllllllllllllIlIIIlIlllllIlIIIll).getBlock(), Blocks.dirt)) {
                                                        lllllllllllllIlIIIlIlllllIlIIlll.func_181079_c(lllllllllllllIlIIIlIlllllIlIIllI + lllllllllllllIlIIIlIlllllllIIIll * MapGenRavine.lIIIlIIIllIIll[1], MapGenRavine.lIIIlIIIllIIll[4], lllllllllllllIlIIIlIlllllIlIIIll + lllllllllllllIlIIIlIlllllIIllIII * MapGenRavine.lIIIlIIIllIIll[1]);
                                                        "".length();
                                                        lllllllllllllIlIIIlIlllllllIIIII.setBlockState(lllllllllllllIlIIIlIlllllIlIIllI, lllllllllllllIlIIIlIlllllIIllllI - MapGenRavine.lIIIlIIIllIIll[7], lllllllllllllIlIIIlIlllllIlIIIll, this.worldObj.getBiomeGenForCoords(lllllllllllllIlIIIlIlllllIlIIlll).topBlock);
                                                    }
                                                }
                                            }
                                        }
                                        --lllllllllllllIlIIIlIlllllIIllllI;
                                    }
                                }
                                ++lllllllllllllIlIIIlIlllllIlIIIll;
                            }
                            ++lllllllllllllIlIIIlIlllllIlIIllI;
                        }
                        if (lIlllllIlIllIlI(lllllllllllllIlIIIlIllllllIIlIII ? 1 : 0)) {
                            "".length();
                            if (-" ".length() == "   ".length()) {
                                return;
                            }
                            break;
                        }
                    }
                }
            }
            ++lllllllllllllIlIIIlIlllllIIIllII;
        }
    }
    
    private static boolean lIlllllIllIIIlI(final Object lllllllllllllIlIIIlIlllIllllllIl, final Object lllllllllllllIlIIIlIlllIlllllIll) {
        return lllllllllllllIlIIIlIlllIllllllIl != lllllllllllllIlIIIlIlllIlllllIll;
    }
    
    private static void lIlllllIlIlIlIl() {
        (lIIIlIIIllIIll = new int[15])[0] = (-(0xFFFFED55 & 0x1BAF) & (0xFFFFEF2C & 0x1DD7));
        MapGenRavine.lIIIlIIIllIIll[1] = (182 + 130 - 299 + 171 ^ 144 + 133 - 258 + 149);
        MapGenRavine.lIIIlIIIllIIll[2] = (0x8F ^ 0x87);
        MapGenRavine.lIIIlIIIllIIll[3] = (0x96 ^ 0xC7 ^ (0x95 ^ 0xC0));
        MapGenRavine.lIIIlIIIllIIll[4] = ((0x93 ^ 0xA2 ^ (0x35 ^ 0x12)) & (74 + 91 - 148 + 131 ^ 97 + 118 - 96 + 11 ^ -" ".length()));
        MapGenRavine.lIIIlIIIllIIll[5] = -" ".length();
        MapGenRavine.lIIIlIIIllIIll[6] = "  ".length();
        MapGenRavine.lIIIlIIIllIIll[7] = " ".length();
        MapGenRavine.lIIIlIIIllIIll[8] = "   ".length();
        MapGenRavine.lIIIlIIIllIIll[9] = (-(0xFFFFCEFC & 0x3F67) & (0xFFFFCF73 & 0x3FEF));
        MapGenRavine.lIIIlIIIllIIll[10] = 53 + 146 - 45 + 49 + (0xB9 ^ 0x9B) - (0x0 ^ 0x22) + (0x66 ^ 0x4B);
        MapGenRavine.lIIIlIIIllIIll[11] = (0x41 ^ 0x4B);
        MapGenRavine.lIIIlIIIllIIll[12] = (140 + 180 - 267 + 128 ^ 19 + 17 + 64 + 35);
        MapGenRavine.lIIIlIIIllIIll[13] = (41 + 43 - 0 + 77 ^ 113 + 92 - 97 + 29);
        MapGenRavine.lIIIlIIIllIIll[14] = (0xA5 ^ 0xB1);
    }
    
    private static boolean lIlllllIllIIlII(final int lllllllllllllIlIIIlIlllIllIlIIlI, final int lllllllllllllIlIIIlIlllIllIlIIII) {
        return lllllllllllllIlIIIlIlllIllIlIIlI != lllllllllllllIlIIIlIlllIllIlIIII;
    }
    
    private static boolean lIlllllIllIIIII(final int lllllllllllllIlIIIlIllllIIIIIIll, final int lllllllllllllIlIIIlIllllIIIIIIlI) {
        return lllllllllllllIlIIIlIllllIIIIIIll > lllllllllllllIlIIIlIllllIIIIIIlI;
    }
    
    private static boolean lIlllllIlIllIlI(final int lllllllllllllIlIIIlIlllIlllIllII) {
        return lllllllllllllIlIIIlIlllIlllIllII != 0;
    }
    
    private static boolean lIlllllIlIllllI(final int lllllllllllllIlIIIlIlllIlllIIIll) {
        return lllllllllllllIlIIIlIlllIlllIIIll >= 0;
    }
    
    static {
        lIlllllIlIlIlIl();
    }
    
    private static boolean lIlllllIlIlllll(final int lllllllllllllIlIIIlIlllIllIlllll) {
        return lllllllllllllIlIIIlIlllIllIlllll < 0;
    }
    
    private static int lIlllllIlIlIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlllllIlIllIll(final int lllllllllllllIlIIIlIlllIlllIlIII) {
        return lllllllllllllIlIIIlIlllIlllIlIII == 0;
    }
    
    private static boolean lIlllllIlIllIII(final int lllllllllllllIlIIIlIlllIllIlllII) {
        return lllllllllllllIlIIIlIlllIllIlllII <= 0;
    }
    
    private static boolean lIlllllIlIlllIl(final int lllllllllllllIlIIIlIlllIllIllIIl) {
        return lllllllllllllIlIIIlIlllIllIllIIl > 0;
    }
}
