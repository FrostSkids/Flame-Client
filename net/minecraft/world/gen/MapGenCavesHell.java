// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;

public class MapGenCavesHell extends MapGenBase
{
    private static final /* synthetic */ int[] lIIllllIIlIlIl;
    
    private static boolean llIlllIllIIlIIl(final int lllllllllllllIIlIIlIllIlIIllIIIl, final int lllllllllllllIIlIIlIllIlIIllIIII) {
        return lllllllllllllIIlIIlIllIlIIllIIIl != lllllllllllllIIlIIlIllIlIIllIIII;
    }
    
    private static boolean llIlllIllIIIIlI(final int lllllllllllllIIlIIlIllIlIIllIlII) {
        return lllllllllllllIIlIIlIllIlIIllIlII > 0;
    }
    
    private static boolean llIlllIllIIlIlI(final int lllllllllllllIIlIIlIllIlIlIlIlIl, final int lllllllllllllIIlIIlIllIlIlIlIlII) {
        return lllllllllllllIIlIIlIllIlIlIlIlIl >= lllllllllllllIIlIIlIllIlIlIlIlII;
    }
    
    protected void func_180705_a(final long lllllllllllllIIlIIlIlllIIIlIIllI, final int lllllllllllllIIlIIlIlllIIIlIIlIl, final int lllllllllllllIIlIIlIlllIIIIlllII, final ChunkPrimer lllllllllllllIIlIIlIlllIIIIllIll, final double lllllllllllllIIlIIlIlllIIIlIIIlI, final double lllllllllllllIIlIIlIlllIIIlIIIIl, final double lllllllllllllIIlIIlIlllIIIIllIII) {
        this.func_180704_a(lllllllllllllIIlIIlIlllIIIlIIllI, lllllllllllllIIlIIlIlllIIIlIIlIl, lllllllllllllIIlIIlIlllIIIIlllII, lllllllllllllIIlIIlIlllIIIIllIll, lllllllllllllIIlIIlIlllIIIlIIIlI, lllllllllllllIIlIIlIlllIIIlIIIIl, lllllllllllllIIlIIlIlllIIIIllIII, 1.0f + this.rand.nextFloat() * 6.0f, 0.0f, 0.0f, MapGenCavesHell.lIIllllIIlIlIl[0], MapGenCavesHell.lIIllllIIlIlIl[0], 0.5);
    }
    
    private static boolean llIlllIllIIlIII(final Object lllllllllllllIIlIIlIllIlIlIIIIIl, final Object lllllllllllllIIlIIlIllIlIlIIIIII) {
        return lllllllllllllIIlIIlIllIlIlIIIIIl == lllllllllllllIIlIIlIllIlIlIIIIII;
    }
    
    private static boolean llIlllIllIIIlIl(final int lllllllllllllIIlIIlIllIlIlIIlIIl, final int lllllllllllllIIlIIlIllIlIlIIlIII) {
        return lllllllllllllIIlIIlIllIlIlIIlIIl > lllllllllllllIIlIIlIllIlIlIIlIII;
    }
    
    private static int llIlllIlIllllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    protected void recursiveGenerate(final World lllllllllllllIIlIIlIllIlIllllIll, final int lllllllllllllIIlIIlIllIlIllllIlI, final int lllllllllllllIIlIIlIllIlIllIlIIl, final int lllllllllllllIIlIIlIllIlIllIlIII, final int lllllllllllllIIlIIlIllIlIlllIlll, final ChunkPrimer lllllllllllllIIlIIlIllIlIlllIllI) {
        int lllllllllllllIIlIIlIllIlIlllIlIl = this.rand.nextInt(this.rand.nextInt(this.rand.nextInt(MapGenCavesHell.lIIllllIIlIlIl[10]) + MapGenCavesHell.lIIllllIIlIlIl[6]) + MapGenCavesHell.lIIllllIIlIlIl[6]);
        if (llIlllIllIIIIIl(this.rand.nextInt(MapGenCavesHell.lIIllllIIlIlIl[11]))) {
            lllllllllllllIIlIIlIllIlIlllIlIl = MapGenCavesHell.lIIllllIIlIlIl[4];
        }
        int lllllllllllllIIlIIlIllIlIlllIlII = MapGenCavesHell.lIIllllIIlIlIl[4];
        "".length();
        if (((0x56 ^ 0x5B) & ~(0xCD ^ 0xC0)) > 0) {
            return;
        }
        while (!llIlllIllIIlIlI(lllllllllllllIIlIIlIllIlIlllIlII, lllllllllllllIIlIIlIllIlIlllIlIl)) {
            final double lllllllllllllIIlIIlIllIlIlllIIll = lllllllllllllIIlIIlIllIlIllllIlI * MapGenCavesHell.lIIllllIIlIlIl[1] + this.rand.nextInt(MapGenCavesHell.lIIllllIIlIlIl[1]);
            final double lllllllllllllIIlIIlIllIlIlllIIlI = this.rand.nextInt(MapGenCavesHell.lIIllllIIlIlIl[9]);
            final double lllllllllllllIIlIIlIllIlIlllIIIl = lllllllllllllIIlIIlIllIlIllIlIIl * MapGenCavesHell.lIIllllIIlIlIl[1] + this.rand.nextInt(MapGenCavesHell.lIIllllIIlIlIl[1]);
            int lllllllllllllIIlIIlIllIlIlllIIII = MapGenCavesHell.lIIllllIIlIlIl[6];
            if (llIlllIllIIIIII(this.rand.nextInt(MapGenCavesHell.lIIllllIIlIlIl[3]))) {
                this.func_180705_a(this.rand.nextLong(), lllllllllllllIIlIIlIllIlIllIlIII, lllllllllllllIIlIIlIllIlIlllIlll, lllllllllllllIIlIIlIllIlIlllIllI, lllllllllllllIIlIIlIllIlIlllIIll, lllllllllllllIIlIIlIllIlIlllIIlI, lllllllllllllIIlIIlIllIlIlllIIIl);
                lllllllllllllIIlIIlIllIlIlllIIII += this.rand.nextInt(MapGenCavesHell.lIIllllIIlIlIl[3]);
            }
            int lllllllllllllIIlIIlIllIlIllIllll = MapGenCavesHell.lIIllllIIlIlIl[4];
            "".length();
            if (null != null) {
                return;
            }
            while (!llIlllIllIIlIlI(lllllllllllllIIlIIlIllIlIllIllll, lllllllllllllIIlIIlIllIlIlllIIII)) {
                final float lllllllllllllIIlIIlIllIlIllIlllI = this.rand.nextFloat() * 3.1415927f * 2.0f;
                final float lllllllllllllIIlIIlIllIlIllIllIl = (this.rand.nextFloat() - 0.5f) * 2.0f / 8.0f;
                final float lllllllllllllIIlIIlIllIlIllIllII = this.rand.nextFloat() * 2.0f + this.rand.nextFloat();
                this.func_180704_a(this.rand.nextLong(), lllllllllllllIIlIIlIllIlIllIlIII, lllllllllllllIIlIIlIllIlIlllIlll, lllllllllllllIIlIIlIllIlIlllIllI, lllllllllllllIIlIIlIllIlIlllIIll, lllllllllllllIIlIIlIllIlIlllIIlI, lllllllllllllIIlIIlIllIlIlllIIIl, lllllllllllllIIlIIlIllIlIllIllII * 2.0f, lllllllllllllIIlIIlIllIlIllIlllI, lllllllllllllIIlIIlIllIlIllIllIl, MapGenCavesHell.lIIllllIIlIlIl[4], MapGenCavesHell.lIIllllIIlIlIl[4], 0.5);
                ++lllllllllllllIIlIIlIllIlIllIllll;
            }
            ++lllllllllllllIIlIIlIllIlIlllIlII;
        }
    }
    
    private static boolean llIlllIllIIlIll(final int lllllllllllllIIlIIlIllIlIlIIllIl, final int lllllllllllllIIlIIlIllIlIlIIllII) {
        return lllllllllllllIIlIIlIllIlIlIIllIl <= lllllllllllllIIlIIlIllIlIlIIllII;
    }
    
    private static int llIlllIlIlllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIlllIlIllllll(final int lllllllllllllIIlIIlIllIlIlIllIIl, final int lllllllllllllIIlIIlIllIlIlIllIII) {
        return lllllllllllllIIlIIlIllIlIlIllIIl == lllllllllllllIIlIIlIllIlIlIllIII;
    }
    
    private static int llIlllIlIllllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIlllIllIIIlll(final Object lllllllllllllIIlIIlIllIlIlIIIlIl, final Object lllllllllllllIIlIIlIllIlIlIIIlII) {
        return lllllllllllllIIlIIlIllIlIlIIIlIl != lllllllllllllIIlIIlIllIlIlIIIlII;
    }
    
    private static void llIlllIlIlllIlI() {
        (lIIllllIIlIlIl = new int[12])[0] = -" ".length();
        MapGenCavesHell.lIIllllIIlIlIl[1] = (0x81 ^ 0x91);
        MapGenCavesHell.lIIllllIIlIlIl[2] = (145 + 67 - 121 + 64 ^ 38 + 103 - 2 + 8);
        MapGenCavesHell.lIIllllIIlIlIl[3] = (0x5F ^ 0x5B);
        MapGenCavesHell.lIIllllIIlIlIl[4] = ((0x20 ^ 0x39) & ~(0x34 ^ 0x2D));
        MapGenCavesHell.lIIllllIIlIlIl[5] = "  ".length();
        MapGenCavesHell.lIIllllIIlIlIl[6] = " ".length();
        MapGenCavesHell.lIIllllIIlIlIl[7] = (0x8A ^ 0xA3 ^ (0x5C ^ 0x73));
        MapGenCavesHell.lIIllllIIlIlIl[8] = (0x6A ^ 0x12);
        MapGenCavesHell.lIIllllIIlIlIl[9] = (0x8B ^ 0x9E) + (0x91 ^ 0xB3) - (0xA6 ^ 0x8D) + (0x5B ^ 0x2F);
        MapGenCavesHell.lIIllllIIlIlIl[10] = (0x9D ^ 0x97);
        MapGenCavesHell.lIIllllIIlIlIl[11] = (103 + 42 - 36 + 30 ^ 141 + 100 - 183 + 84);
    }
    
    private static boolean llIlllIllIIIllI(final int lllllllllllllIIlIIlIllIlIlIlIIIl, final int lllllllllllllIIlIIlIllIlIlIlIIII) {
        return lllllllllllllIIlIIlIllIlIlIlIIIl < lllllllllllllIIlIIlIllIlIlIlIIII;
    }
    
    protected void func_180704_a(final long lllllllllllllIIlIIlIllIllIlllIII, final int lllllllllllllIIlIIlIllIllIllIlll, final int lllllllllllllIIlIIlIllIllllIIlll, final ChunkPrimer lllllllllllllIIlIIlIllIllIllIlIl, double lllllllllllllIIlIIlIllIllIllIlII, double lllllllllllllIIlIIlIllIllIllIIll, double lllllllllllllIIlIIlIllIllIllIIlI, final float lllllllllllllIIlIIlIllIllIllIIIl, float lllllllllllllIIlIIlIllIllIllIIII, float lllllllllllllIIlIIlIllIllIlIllll, int lllllllllllllIIlIIlIllIllIlIlllI, int lllllllllllllIIlIIlIllIllIlIllIl, final double lllllllllllllIIlIIlIllIllIlIllII) {
        final double lllllllllllllIIlIIlIllIlllIlllII = lllllllllllllIIlIIlIllIllIllIlll * MapGenCavesHell.lIIllllIIlIlIl[1] + MapGenCavesHell.lIIllllIIlIlIl[2];
        final double lllllllllllllIIlIIlIllIlllIllIll = lllllllllllllIIlIIlIllIllllIIlll * MapGenCavesHell.lIIllllIIlIlIl[1] + MapGenCavesHell.lIIllllIIlIlIl[2];
        float lllllllllllllIIlIIlIllIlllIllIlI = 0.0f;
        float lllllllllllllIIlIIlIllIlllIllIIl = 0.0f;
        final Random lllllllllllllIIlIIlIllIlllIllIII = new Random(lllllllllllllIIlIIlIllIllIlllIII);
        if (llIlllIlIlllllI(lllllllllllllIIlIIlIllIllIlIllIl)) {
            final int lllllllllllllIIlIIlIllIlllIlIlll = this.range * MapGenCavesHell.lIIllllIIlIlIl[1] - MapGenCavesHell.lIIllllIIlIlIl[1];
            lllllllllllllIIlIIlIllIllIlIllIl = lllllllllllllIIlIIlIllIlllIlIlll - lllllllllllllIIlIIlIllIlllIllIII.nextInt(lllllllllllllIIlIIlIllIlllIlIlll / MapGenCavesHell.lIIllllIIlIlIl[3]);
        }
        boolean lllllllllllllIIlIIlIllIlllIlIllI = MapGenCavesHell.lIIllllIIlIlIl[4] != 0;
        if (llIlllIlIllllll((int)lllllllllllllIIlIIlIllIllIlIlllI, MapGenCavesHell.lIIllllIIlIlIl[0])) {
            lllllllllllllIIlIIlIllIllIlIlllI = lllllllllllllIIlIIlIllIllIlIllIl / MapGenCavesHell.lIIllllIIlIlIl[5];
            lllllllllllllIIlIIlIllIlllIlIllI = (MapGenCavesHell.lIIllllIIlIlIl[6] != 0);
        }
        final int lllllllllllllIIlIIlIllIlllIlIlIl = lllllllllllllIIlIIlIllIlllIllIII.nextInt(lllllllllllllIIlIIlIllIllIlIllIl / MapGenCavesHell.lIIllllIIlIlIl[5]) + lllllllllllllIIlIIlIllIllIlIllIl / MapGenCavesHell.lIIllllIIlIlIl[3];
        int n;
        if (llIlllIllIIIIII(lllllllllllllIIlIIlIllIlllIllIII.nextInt(MapGenCavesHell.lIIllllIIlIlIl[7]))) {
            n = MapGenCavesHell.lIIllllIIlIlIl[6];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = MapGenCavesHell.lIIllllIIlIlIl[4];
        }
        final boolean lllllllllllllIIlIIlIllIlllIlIlII = n != 0;
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!llIlllIllIIlIlI((int)lllllllllllllIIlIIlIllIllIlIlllI, lllllllllllllIIlIIlIllIllIlIllIl)) {
            final double lllllllllllllIIlIIlIllIlllIlIIll = 1.5 + MathHelper.sin((float)lllllllllllllIIlIIlIllIllIlIlllI * 3.1415927f / lllllllllllllIIlIIlIllIllIlIllIl) * lllllllllllllIIlIIlIllIllIllIIIl * 1.0f;
            final double lllllllllllllIIlIIlIllIlllIlIIlI = lllllllllllllIIlIIlIllIlllIlIIll * lllllllllllllIIlIIlIllIllIlIllII;
            final float lllllllllllllIIlIIlIllIlllIlIIIl = MathHelper.cos((float)lllllllllllllIIlIIlIllIllIlIllll);
            final float lllllllllllllIIlIIlIllIlllIlIIII = MathHelper.sin((float)lllllllllllllIIlIIlIllIllIlIllll);
            lllllllllllllIIlIIlIllIllIllIlII += MathHelper.cos(lllllllllllllIIlIIlIllIllIllIIII) * lllllllllllllIIlIIlIllIlllIlIIIl;
            lllllllllllllIIlIIlIllIllIllIIll += lllllllllllllIIlIIlIllIlllIlIIII;
            lllllllllllllIIlIIlIllIllIllIIlI += MathHelper.sin(lllllllllllllIIlIIlIllIllIllIIII) * lllllllllllllIIlIIlIllIlllIlIIIl;
            if (llIlllIllIIIIIl(lllllllllllllIIlIIlIllIlllIlIlII ? 1 : 0)) {
                lllllllllllllIIlIIlIllIllIlIllll *= 0.92f;
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIIlIllIllIlIllll *= 0.7f;
            }
            lllllllllllllIIlIIlIllIllIlIllll += lllllllllllllIIlIIlIllIlllIllIIl * 0.1f;
            lllllllllllllIIlIIlIllIllIllIIII += lllllllllllllIIlIIlIllIlllIllIlI * 0.1f;
            lllllllllllllIIlIIlIllIlllIllIIl *= 0.9f;
            lllllllllllllIIlIIlIllIlllIllIlI *= 0.75f;
            lllllllllllllIIlIIlIllIlllIllIIl += (lllllllllllllIIlIIlIllIlllIllIII.nextFloat() - lllllllllllllIIlIIlIllIlllIllIII.nextFloat()) * lllllllllllllIIlIIlIllIlllIllIII.nextFloat() * 2.0f;
            lllllllllllllIIlIIlIllIlllIllIlI += (lllllllllllllIIlIIlIllIlllIllIII.nextFloat() - lllllllllllllIIlIIlIllIlllIllIII.nextFloat()) * lllllllllllllIIlIIlIllIlllIllIII.nextFloat() * 4.0f;
            if (llIlllIllIIIIII(lllllllllllllIIlIIlIllIlllIlIllI ? 1 : 0) && llIlllIlIllllll((int)lllllllllllllIIlIIlIllIllIlIlllI, lllllllllllllIIlIIlIllIlllIlIlIl) && llIlllIllIIIIlI(llIlllIlIlllIll(lllllllllllllIIlIIlIllIllIllIIIl, 1.0f))) {
                this.func_180704_a(lllllllllllllIIlIIlIllIlllIllIII.nextLong(), lllllllllllllIIlIIlIllIllIllIlll, lllllllllllllIIlIIlIllIllllIIlll, lllllllllllllIIlIIlIllIllIllIlIl, lllllllllllllIIlIIlIllIllIllIlII, lllllllllllllIIlIIlIllIllIllIIll, lllllllllllllIIlIIlIllIllIllIIlI, lllllllllllllIIlIIlIllIlllIllIII.nextFloat() * 0.5f + 0.5f, lllllllllllllIIlIIlIllIllIllIIII - 1.5707964f, (float)(lllllllllllllIIlIIlIllIllIlIllll / 3.0f), (int)lllllllllllllIIlIIlIllIllIlIlllI, lllllllllllllIIlIIlIllIllIlIllIl, 1.0);
                this.func_180704_a(lllllllllllllIIlIIlIllIlllIllIII.nextLong(), lllllllllllllIIlIIlIllIllIllIlll, lllllllllllllIIlIIlIllIllllIIlll, lllllllllllllIIlIIlIllIllIllIlIl, lllllllllllllIIlIIlIllIllIllIlII, lllllllllllllIIlIIlIllIllIllIIll, lllllllllllllIIlIIlIllIllIllIIlI, lllllllllllllIIlIIlIllIlllIllIII.nextFloat() * 0.5f + 0.5f, lllllllllllllIIlIIlIllIllIllIIII + 1.5707964f, (float)(lllllllllllllIIlIIlIllIllIlIllll / 3.0f), (int)lllllllllllllIIlIIlIllIllIlIlllI, lllllllllllllIIlIIlIllIllIlIllIl, 1.0);
                return;
            }
            if (!llIlllIllIIIIII(lllllllllllllIIlIIlIllIlllIlIllI ? 1 : 0) || llIlllIllIIIIIl(lllllllllllllIIlIIlIllIlllIllIII.nextInt(MapGenCavesHell.lIIllllIIlIlIl[3]))) {
                final double lllllllllllllIIlIIlIllIlllIIllll = lllllllllllllIIlIIlIllIllIllIlII - lllllllllllllIIlIIlIllIlllIlllII;
                final double lllllllllllllIIlIIlIllIlllIIlllI = lllllllllllllIIlIIlIllIllIllIIlI - lllllllllllllIIlIIlIllIlllIllIll;
                final double lllllllllllllIIlIIlIllIlllIIllIl = (double)(lllllllllllllIIlIIlIllIllIlIllIl - lllllllllllllIIlIIlIllIllIlIlllI);
                final double lllllllllllllIIlIIlIllIlllIIllII = lllllllllllllIIlIIlIllIllIllIIIl + 2.0f + 16.0f;
                if (llIlllIllIIIIlI(llIlllIlIllllII(lllllllllllllIIlIIlIllIlllIIllll * lllllllllllllIIlIIlIllIlllIIllll + lllllllllllllIIlIIlIllIlllIIlllI * lllllllllllllIIlIIlIllIlllIIlllI - lllllllllllllIIlIIlIllIlllIIllIl * lllllllllllllIIlIIlIllIlllIIllIl, lllllllllllllIIlIIlIllIlllIIllII * lllllllllllllIIlIIlIllIlllIIllII))) {
                    return;
                }
                if (llIlllIllIIIIll(llIlllIlIllllII(lllllllllllllIIlIIlIllIllIllIlII, lllllllllllllIIlIIlIllIlllIlllII - 16.0 - lllllllllllllIIlIIlIllIlllIlIIll * 2.0)) && llIlllIllIIIIll(llIlllIlIllllII(lllllllllllllIIlIIlIllIllIllIIlI, lllllllllllllIIlIIlIllIlllIllIll - 16.0 - lllllllllllllIIlIIlIllIlllIlIIll * 2.0)) && llIlllIlIlllllI(llIlllIlIllllIl(lllllllllllllIIlIIlIllIllIllIlII, lllllllllllllIIlIIlIllIlllIlllII + 16.0 + lllllllllllllIIlIIlIllIlllIlIIll * 2.0)) && llIlllIlIlllllI(llIlllIlIllllIl(lllllllllllllIIlIIlIllIllIllIIlI, lllllllllllllIIlIIlIllIlllIllIll + 16.0 + lllllllllllllIIlIIlIllIlllIlIIll * 2.0))) {
                    int lllllllllllllIIlIIlIllIlllIIlIll = MathHelper.floor_double(lllllllllllllIIlIIlIllIllIllIlII - lllllllllllllIIlIIlIllIlllIlIIll) - lllllllllllllIIlIIlIllIllIllIlll * MapGenCavesHell.lIIllllIIlIlIl[1] - MapGenCavesHell.lIIllllIIlIlIl[6];
                    int lllllllllllllIIlIIlIllIlllIIlIlI = MathHelper.floor_double(lllllllllllllIIlIIlIllIllIllIlII + lllllllllllllIIlIIlIllIlllIlIIll) - lllllllllllllIIlIIlIllIllIllIlll * MapGenCavesHell.lIIllllIIlIlIl[1] + MapGenCavesHell.lIIllllIIlIlIl[6];
                    int lllllllllllllIIlIIlIllIlllIIlIIl = MathHelper.floor_double(lllllllllllllIIlIIlIllIllIllIIll - lllllllllllllIIlIIlIllIlllIlIIlI) - MapGenCavesHell.lIIllllIIlIlIl[6];
                    int lllllllllllllIIlIIlIllIlllIIlIII = MathHelper.floor_double(lllllllllllllIIlIIlIllIllIllIIll + lllllllllllllIIlIIlIllIlllIlIIlI) + MapGenCavesHell.lIIllllIIlIlIl[6];
                    int lllllllllllllIIlIIlIllIlllIIIlll = MathHelper.floor_double(lllllllllllllIIlIIlIllIllIllIIlI - lllllllllllllIIlIIlIllIlllIlIIll) - lllllllllllllIIlIIlIllIllllIIlll * MapGenCavesHell.lIIllllIIlIlIl[1] - MapGenCavesHell.lIIllllIIlIlIl[6];
                    int lllllllllllllIIlIIlIllIlllIIIllI = MathHelper.floor_double(lllllllllllllIIlIIlIllIllIllIIlI + lllllllllllllIIlIIlIllIlllIlIIll) - lllllllllllllIIlIIlIllIllllIIlll * MapGenCavesHell.lIIllllIIlIlIl[1] + MapGenCavesHell.lIIllllIIlIlIl[6];
                    if (llIlllIllIIIlII(lllllllllllllIIlIIlIllIlllIIlIll)) {
                        lllllllllllllIIlIIlIllIlllIIlIll = MapGenCavesHell.lIIllllIIlIlIl[4];
                    }
                    if (llIlllIllIIIlIl(lllllllllllllIIlIIlIllIlllIIlIlI, MapGenCavesHell.lIIllllIIlIlIl[1])) {
                        lllllllllllllIIlIIlIllIlllIIlIlI = MapGenCavesHell.lIIllllIIlIlIl[1];
                    }
                    if (llIlllIllIIIllI(lllllllllllllIIlIIlIllIlllIIlIIl, MapGenCavesHell.lIIllllIIlIlIl[6])) {
                        lllllllllllllIIlIIlIllIlllIIlIIl = MapGenCavesHell.lIIllllIIlIlIl[6];
                    }
                    if (llIlllIllIIIlIl(lllllllllllllIIlIIlIllIlllIIlIII, MapGenCavesHell.lIIllllIIlIlIl[8])) {
                        lllllllllllllIIlIIlIllIlllIIlIII = MapGenCavesHell.lIIllllIIlIlIl[8];
                    }
                    if (llIlllIllIIIlII(lllllllllllllIIlIIlIllIlllIIIlll)) {
                        lllllllllllllIIlIIlIllIlllIIIlll = MapGenCavesHell.lIIllllIIlIlIl[4];
                    }
                    if (llIlllIllIIIlIl(lllllllllllllIIlIIlIllIlllIIIllI, MapGenCavesHell.lIIllllIIlIlIl[1])) {
                        lllllllllllllIIlIIlIllIlllIIIllI = MapGenCavesHell.lIIllllIIlIlIl[1];
                    }
                    boolean lllllllllllllIIlIIlIllIlllIIIlIl = MapGenCavesHell.lIIllllIIlIlIl[4] != 0;
                    int lllllllllllllIIlIIlIllIlllIIIlII = lllllllllllllIIlIIlIllIlllIIlIll;
                    "".length();
                    if (-(0xD3 ^ 0x8F ^ (0x20 ^ 0x79)) >= 0) {
                        return;
                    }
                    while (llIlllIllIIIIII(lllllllllllllIIlIIlIllIlllIIIlIl ? 1 : 0) && !llIlllIllIIlIlI(lllllllllllllIIlIIlIllIlllIIIlII, lllllllllllllIIlIIlIllIlllIIlIlI)) {
                        int lllllllllllllIIlIIlIllIlllIIIIll = lllllllllllllIIlIIlIllIlllIIIlll;
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                        while (llIlllIllIIIIII(lllllllllllllIIlIIlIllIlllIIIlIl ? 1 : 0) && !llIlllIllIIlIlI(lllllllllllllIIlIIlIllIlllIIIIll, lllllllllllllIIlIIlIllIlllIIIllI)) {
                            int lllllllllllllIIlIIlIllIlllIIIIlI = lllllllllllllIIlIIlIllIlllIIlIII + MapGenCavesHell.lIIllllIIlIlIl[6];
                            "".length();
                            if (((148 + 131 - 224 + 149 ^ 113 + 18 - 33 + 47) & (0x1D ^ 0x77 ^ (0xF2 ^ 0xC5) ^ -" ".length())) > 0) {
                                return;
                            }
                            while (llIlllIllIIIIII(lllllllllllllIIlIIlIllIlllIIIlIl ? 1 : 0) && !llIlllIllIIIllI(lllllllllllllIIlIIlIllIlllIIIIlI, lllllllllllllIIlIIlIllIlllIIlIIl - MapGenCavesHell.lIIllllIIlIlIl[6])) {
                                if (llIlllIllIIIIll(lllllllllllllIIlIIlIllIlllIIIIlI) && llIlllIllIIIllI(lllllllllllllIIlIIlIllIlllIIIIlI, MapGenCavesHell.lIIllllIIlIlIl[9])) {
                                    final IBlockState lllllllllllllIIlIIlIllIlllIIIIIl = lllllllllllllIIlIIlIllIllIllIlIl.getBlockState(lllllllllllllIIlIIlIllIlllIIIlII, lllllllllllllIIlIIlIllIlllIIIIlI, lllllllllllllIIlIIlIllIlllIIIIll);
                                    if (!llIlllIllIIIlll(lllllllllllllIIlIIlIllIlllIIIIIl.getBlock(), Blocks.flowing_lava) || llIlllIllIIlIII(lllllllllllllIIlIIlIllIlllIIIIIl.getBlock(), Blocks.lava)) {
                                        lllllllllllllIIlIIlIllIlllIIIlIl = (MapGenCavesHell.lIIllllIIlIlIl[6] != 0);
                                    }
                                    if (llIlllIllIIlIIl(lllllllllllllIIlIIlIllIlllIIIIlI, lllllllllllllIIlIIlIllIlllIIlIIl - MapGenCavesHell.lIIllllIIlIlIl[6]) && llIlllIllIIlIIl(lllllllllllllIIlIIlIllIlllIIIlII, lllllllllllllIIlIIlIllIlllIIlIll) && llIlllIllIIlIIl(lllllllllllllIIlIIlIllIlllIIIlII, lllllllllllllIIlIIlIllIlllIIlIlI - MapGenCavesHell.lIIllllIIlIlIl[6]) && llIlllIllIIlIIl(lllllllllllllIIlIIlIllIlllIIIIll, lllllllllllllIIlIIlIllIlllIIIlll) && llIlllIllIIlIIl(lllllllllllllIIlIIlIllIlllIIIIll, lllllllllllllIIlIIlIllIlllIIIllI - MapGenCavesHell.lIIllllIIlIlIl[6])) {
                                        lllllllllllllIIlIIlIllIlllIIIIlI = lllllllllllllIIlIIlIllIlllIIlIIl;
                                    }
                                }
                                --lllllllllllllIIlIIlIllIlllIIIIlI;
                            }
                            ++lllllllllllllIIlIIlIllIlllIIIIll;
                        }
                        ++lllllllllllllIIlIIlIllIlllIIIlII;
                    }
                    if (llIlllIllIIIIII(lllllllllllllIIlIIlIllIlllIIIlIl ? 1 : 0)) {
                        int lllllllllllllIIlIIlIllIlllIIIIII = lllllllllllllIIlIIlIllIlllIIlIll;
                        "".length();
                        if (-" ".length() >= " ".length()) {
                            return;
                        }
                        while (!llIlllIllIIlIlI(lllllllllllllIIlIIlIllIlllIIIIII, lllllllllllllIIlIIlIllIlllIIlIlI)) {
                            final double lllllllllllllIIlIIlIllIllIllllll = (lllllllllllllIIlIIlIllIlllIIIIII + lllllllllllllIIlIIlIllIllIllIlll * MapGenCavesHell.lIIllllIIlIlIl[1] + 0.5 - lllllllllllllIIlIIlIllIllIllIlII) / lllllllllllllIIlIIlIllIlllIlIIll;
                            int lllllllllllllIIlIIlIllIllIlllllI = lllllllllllllIIlIIlIllIlllIIIlll;
                            "".length();
                            if (-(0xC0 ^ 0xC5) >= 0) {
                                return;
                            }
                            while (!llIlllIllIIlIlI(lllllllllllllIIlIIlIllIllIlllllI, lllllllllllllIIlIIlIllIlllIIIllI)) {
                                final double lllllllllllllIIlIIlIllIllIllllIl = (lllllllllllllIIlIIlIllIllIlllllI + lllllllllllllIIlIIlIllIllllIIlll * MapGenCavesHell.lIIllllIIlIlIl[1] + 0.5 - lllllllllllllIIlIIlIllIllIllIIlI) / lllllllllllllIIlIIlIllIlllIlIIll;
                                int lllllllllllllIIlIIlIllIllIllllII = lllllllllllllIIlIIlIllIlllIIlIII;
                                "".length();
                                if (" ".length() == 0) {
                                    return;
                                }
                                while (!llIlllIllIIlIll(lllllllllllllIIlIIlIllIllIllllII, lllllllllllllIIlIIlIllIlllIIlIIl)) {
                                    final double lllllllllllllIIlIIlIllIllIlllIll = (lllllllllllllIIlIIlIllIllIllllII - MapGenCavesHell.lIIllllIIlIlIl[6] + 0.5 - lllllllllllllIIlIIlIllIllIllIIll) / lllllllllllllIIlIIlIllIlllIlIIlI;
                                    if (llIlllIllIIIIlI(llIlllIlIllllII(lllllllllllllIIlIIlIllIllIlllIll, -0.7)) && llIlllIllIIIlII(llIlllIlIllllIl(lllllllllllllIIlIIlIllIllIllllll * lllllllllllllIIlIIlIllIllIllllll + lllllllllllllIIlIIlIllIllIlllIll * lllllllllllllIIlIIlIllIllIlllIll + lllllllllllllIIlIIlIllIllIllllIl * lllllllllllllIIlIIlIllIllIllllIl, 1.0))) {
                                        final IBlockState lllllllllllllIIlIIlIllIllIlllIlI = lllllllllllllIIlIIlIllIllIllIlIl.getBlockState(lllllllllllllIIlIIlIllIlllIIIIII, lllllllllllllIIlIIlIllIllIllllII, lllllllllllllIIlIIlIllIllIlllllI);
                                        if (!llIlllIllIIIlll(lllllllllllllIIlIIlIllIllIlllIlI.getBlock(), Blocks.netherrack) || !llIlllIllIIIlll(lllllllllllllIIlIIlIllIllIlllIlI.getBlock(), Blocks.dirt) || llIlllIllIIlIII(lllllllllllllIIlIIlIllIllIlllIlI.getBlock(), Blocks.grass)) {
                                            lllllllllllllIIlIIlIllIllIllIlIl.setBlockState(lllllllllllllIIlIIlIllIlllIIIIII, lllllllllllllIIlIIlIllIllIllllII, lllllllllllllIIlIIlIllIllIlllllI, Blocks.air.getDefaultState());
                                        }
                                    }
                                    --lllllllllllllIIlIIlIllIllIllllII;
                                }
                                ++lllllllllllllIIlIIlIllIllIlllllI;
                            }
                            ++lllllllllllllIIlIIlIllIlllIIIIII;
                        }
                        if (llIlllIllIIIIIl(lllllllllllllIIlIIlIllIlllIlIllI ? 1 : 0)) {
                            "".length();
                            if ("  ".length() != "  ".length()) {
                                return;
                            }
                            break;
                        }
                    }
                }
            }
            ++lllllllllllllIIlIIlIllIllIlIlllI;
        }
    }
    
    static {
        llIlllIlIlllIlI();
    }
    
    private static boolean llIlllIllIIIIIl(final int lllllllllllllIIlIIlIllIlIIlllllI) {
        return lllllllllllllIIlIIlIllIlIIlllllI != 0;
    }
    
    private static boolean llIlllIllIIIlII(final int lllllllllllllIIlIIlIllIlIIlllIII) {
        return lllllllllllllIIlIIlIllIlIIlllIII < 0;
    }
    
    private static boolean llIlllIlIlllllI(final int lllllllllllllIIlIIlIllIlIIllIllI) {
        return lllllllllllllIIlIIlIllIlIIllIllI <= 0;
    }
    
    private static boolean llIlllIllIIIIll(final int lllllllllllllIIlIIlIllIlIIlllIlI) {
        return lllllllllllllIIlIIlIllIlIIlllIlI >= 0;
    }
    
    private static boolean llIlllIllIIIIII(final int lllllllllllllIIlIIlIllIlIIllllII) {
        return lllllllllllllIIlIIlIllIlIIllllII == 0;
    }
}
