// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

public class GenLayerIsland extends GenLayer
{
    private static final /* synthetic */ int[] lIlIIIlIIIllII;
    
    static {
        lllIIIlIlIIIIll();
    }
    
    private static void lllIIIlIlIIIIll() {
        (lIlIIIlIIIllII = new int[3])[0] = ((0x70 ^ 0x67) & ~(0x46 ^ 0x51));
        GenLayerIsland.lIlIIIlIIIllII[1] = (0xDF ^ 0x92 ^ (0x60 ^ 0x27));
        GenLayerIsland.lIlIIIlIIIllII[2] = " ".length();
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIIIlllllIlllIIlllIl, final int lllllllllllllIIIlllllIlllIIlllII, final int lllllllllllllIIIlllllIlllIIllIll, final int lllllllllllllIIIlllllIlllIlIIIlI) {
        final int[] lllllllllllllIIIlllllIlllIlIIIIl = IntCache.getIntCache(lllllllllllllIIIlllllIlllIIllIll * lllllllllllllIIIlllllIlllIlIIIlI);
        int lllllllllllllIIIlllllIlllIlIIIII = GenLayerIsland.lIlIIIlIIIllII[0];
        "".length();
        if ((0x20 ^ 0x25) == 0x0) {
            return null;
        }
        while (!lllIIIlIlIIIlIl(lllllllllllllIIIlllllIlllIlIIIII, lllllllllllllIIIlllllIlllIlIIIlI)) {
            int lllllllllllllIIIlllllIlllIIlllll = GenLayerIsland.lIlIIIlIIIllII[0];
            "".length();
            if ((0x14 ^ 0x11) <= 0) {
                return null;
            }
            while (!lllIIIlIlIIIlIl(lllllllllllllIIIlllllIlllIIlllll, lllllllllllllIIIlllllIlllIIllIll)) {
                this.initChunkSeed(lllllllllllllIIIlllllIlllIIlllIl + lllllllllllllIIIlllllIlllIIlllll, lllllllllllllIIIlllllIlllIIlllII + lllllllllllllIIIlllllIlllIlIIIII);
                final int[] array = lllllllllllllIIIlllllIlllIlIIIIl;
                final int n = lllllllllllllIIIlllllIlllIIlllll + lllllllllllllIIIlllllIlllIlIIIII * lllllllllllllIIIlllllIlllIIllIll;
                int n2;
                if (lllIIIlIlIIIlII(this.nextInt(GenLayerIsland.lIlIIIlIIIllII[1]))) {
                    n2 = GenLayerIsland.lIlIIIlIIIllII[2];
                    "".length();
                    if ((0xB3 ^ 0xA6 ^ (0xA ^ 0x1B)) != (37 + 115 - 117 + 119 ^ 101 + 97 - 96 + 56)) {
                        return null;
                    }
                }
                else {
                    n2 = GenLayerIsland.lIlIIIlIIIllII[0];
                }
                array[n] = n2;
                ++lllllllllllllIIIlllllIlllIIlllll;
            }
            ++lllllllllllllIIIlllllIlllIlIIIII;
        }
        if (lllIIIlIlIIIllI(lllllllllllllIIIlllllIlllIIlllIl, -lllllllllllllIIIlllllIlllIIllIll) && lllIIIlIlIIIlll(lllllllllllllIIIlllllIlllIIlllIl) && lllIIIlIlIIIllI(lllllllllllllIIIlllllIlllIIlllII, -lllllllllllllIIIlllllIlllIlIIIlI) && lllIIIlIlIIIlll(lllllllllllllIIIlllllIlllIIlllII)) {
            lllllllllllllIIIlllllIlllIlIIIIl[-lllllllllllllIIIlllllIlllIIlllIl + -lllllllllllllIIIlllllIlllIIlllII * lllllllllllllIIIlllllIlllIIllIll] = GenLayerIsland.lIlIIIlIIIllII[2];
        }
        return lllllllllllllIIIlllllIlllIlIIIIl;
    }
    
    private static boolean lllIIIlIlIIIlIl(final int lllllllllllllIIIlllllIlllIIlIlII, final int lllllllllllllIIIlllllIlllIIlIIll) {
        return lllllllllllllIIIlllllIlllIIlIlII >= lllllllllllllIIIlllllIlllIIlIIll;
    }
    
    private static boolean lllIIIlIlIIIllI(final int lllllllllllllIIIlllllIlllIIlIIII, final int lllllllllllllIIIlllllIlllIIIllll) {
        return lllllllllllllIIIlllllIlllIIlIIII > lllllllllllllIIIlllllIlllIIIllll;
    }
    
    private static boolean lllIIIlIlIIIlII(final int lllllllllllllIIIlllllIlllIIIllIl) {
        return lllllllllllllIIIlllllIlllIIIllIl == 0;
    }
    
    public GenLayerIsland(final long lllllllllllllIIIlllllIlllIllIIIl) {
        super(lllllllllllllIIIlllllIlllIllIIIl);
    }
    
    private static boolean lllIIIlIlIIIlll(final int lllllllllllllIIIlllllIlllIIIlIll) {
        return lllllllllllllIIIlllllIlllIIIlIll <= 0;
    }
}
