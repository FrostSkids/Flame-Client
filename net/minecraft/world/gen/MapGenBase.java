// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.World;
import java.util.Random;

public class MapGenBase
{
    protected /* synthetic */ Random rand;
    protected /* synthetic */ int range;
    protected /* synthetic */ World worldObj;
    private static final /* synthetic */ int[] lIIlllIlIlIIIl;
    
    static {
        llIllIllllIIllI();
    }
    
    private static void llIllIllllIIllI() {
        (lIIlllIlIlIIIl = new int[1])[0] = (0x84 ^ 0x8C);
    }
    
    private static boolean llIllIllllIIlll(final int lllllllllllllIIlIIllllIIIlIIIIIl, final int lllllllllllllIIlIIllllIIIlIIIIII) {
        return lllllllllllllIIlIIllllIIIlIIIIIl > lllllllllllllIIlIIllllIIIlIIIIII;
    }
    
    public void generate(final IChunkProvider lllllllllllllIIlIIllllIIIllIIIlI, final World lllllllllllllIIlIIllllIIIllIIIIl, final int lllllllllllllIIlIIllllIIIllIIIII, final int lllllllllllllIIlIIllllIIIlIlllll, final ChunkPrimer lllllllllllllIIlIIllllIIIlIllllI) {
        final int lllllllllllllIIlIIllllIIIlIlllIl = this.range;
        this.worldObj = lllllllllllllIIlIIllllIIIllIIIIl;
        this.rand.setSeed(lllllllllllllIIlIIllllIIIllIIIIl.getSeed());
        final long lllllllllllllIIlIIllllIIIlIlllII = this.rand.nextLong();
        final long lllllllllllllIIlIIllllIIIlIllIll = this.rand.nextLong();
        int lllllllllllllIIlIIllllIIIlIllIlI = lllllllllllllIIlIIllllIIIllIIIII - lllllllllllllIIlIIllllIIIlIlllIl;
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!llIllIllllIIlll(lllllllllllllIIlIIllllIIIlIllIlI, lllllllllllllIIlIIllllIIIllIIIII + lllllllllllllIIlIIllllIIIlIlllIl)) {
            int lllllllllllllIIlIIllllIIIlIllIIl = lllllllllllllIIlIIllllIIIlIlllll - lllllllllllllIIlIIllllIIIlIlllIl;
            "".length();
            if ((0x92 ^ 0x96) != (0x8B ^ 0x8F)) {
                return;
            }
            while (!llIllIllllIIlll(lllllllllllllIIlIIllllIIIlIllIIl, lllllllllllllIIlIIllllIIIlIlllll + lllllllllllllIIlIIllllIIIlIlllIl)) {
                final long lllllllllllllIIlIIllllIIIlIllIII = lllllllllllllIIlIIllllIIIlIllIlI * lllllllllllllIIlIIllllIIIlIlllII;
                final long lllllllllllllIIlIIllllIIIlIlIlll = lllllllllllllIIlIIllllIIIlIllIIl * lllllllllllllIIlIIllllIIIlIllIll;
                this.rand.setSeed(lllllllllllllIIlIIllllIIIlIllIII ^ lllllllllllllIIlIIllllIIIlIlIlll ^ lllllllllllllIIlIIllllIIIllIIIIl.getSeed());
                this.recursiveGenerate(lllllllllllllIIlIIllllIIIllIIIIl, lllllllllllllIIlIIllllIIIlIllIlI, lllllllllllllIIlIIllllIIIlIllIIl, lllllllllllllIIlIIllllIIIllIIIII, lllllllllllllIIlIIllllIIIlIlllll, lllllllllllllIIlIIllllIIIlIllllI);
                ++lllllllllllllIIlIIllllIIIlIllIIl;
            }
            ++lllllllllllllIIlIIllllIIIlIllIlI;
        }
    }
    
    protected void recursiveGenerate(final World lllllllllllllIIlIIllllIIIlIIlIIl, final int lllllllllllllIIlIIllllIIIlIIlIII, final int lllllllllllllIIlIIllllIIIlIIIlll, final int lllllllllllllIIlIIllllIIIlIIIllI, final int lllllllllllllIIlIIllllIIIlIIIlIl, final ChunkPrimer lllllllllllllIIlIIllllIIIlIIIlII) {
    }
    
    public MapGenBase() {
        this.range = MapGenBase.lIIlllIlIlIIIl[0];
        this.rand = new Random();
    }
}
