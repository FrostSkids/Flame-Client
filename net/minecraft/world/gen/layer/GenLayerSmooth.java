// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

public class GenLayerSmooth extends GenLayer
{
    private static final /* synthetic */ int[] lIIIlIllIIlIll;
    
    private static boolean llIIIIIllIllIII(final int lllllllllllllIlIIIIlIlllIIIlIlll, final int lllllllllllllIlIIIIlIlllIIIlIllI) {
        return lllllllllllllIlIIIIlIlllIIIlIlll >= lllllllllllllIlIIIIlIlllIIIlIllI;
    }
    
    private static void llIIIIIllIlIlIl() {
        (lIIIlIllIIlIll = new int[3])[0] = " ".length();
        GenLayerSmooth.lIIIlIllIIlIll[1] = "  ".length();
        GenLayerSmooth.lIIIlIllIIlIll[2] = ((0x1F ^ 0x29) & ~(0x62 ^ 0x54));
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIlIIIIlIlllIIlIlllI, final int lllllllllllllIlIIIIlIlllIIlIllIl, final int lllllllllllllIlIIIIlIlllIIlIllII, final int lllllllllllllIlIIIIlIlllIIllllIl) {
        final int lllllllllllllIlIIIIlIlllIIllllII = lllllllllllllIlIIIIlIlllIIlIlllI - GenLayerSmooth.lIIIlIllIIlIll[0];
        final int lllllllllllllIlIIIIlIlllIIlllIll = lllllllllllllIlIIIIlIlllIIlIllIl - GenLayerSmooth.lIIIlIllIIlIll[0];
        final int lllllllllllllIlIIIIlIlllIIlllIlI = lllllllllllllIlIIIIlIlllIIlIllII + GenLayerSmooth.lIIIlIllIIlIll[1];
        final int lllllllllllllIlIIIIlIlllIIlllIIl = lllllllllllllIlIIIIlIlllIIllllIl + GenLayerSmooth.lIIIlIllIIlIll[1];
        final int[] lllllllllllllIlIIIIlIlllIIlllIII = this.parent.getInts(lllllllllllllIlIIIIlIlllIIllllII, lllllllllllllIlIIIIlIlllIIlllIll, lllllllllllllIlIIIIlIlllIIlllIlI, lllllllllllllIlIIIIlIlllIIlllIIl);
        final int[] lllllllllllllIlIIIIlIlllIIllIlll = IntCache.getIntCache(lllllllllllllIlIIIIlIlllIIlIllII * lllllllllllllIlIIIIlIlllIIllllIl);
        int lllllllllllllIlIIIIlIlllIIllIllI = GenLayerSmooth.lIIIlIllIIlIll[2];
        "".length();
        if (-" ".length() > (0x13 ^ 0x61 ^ (0x4C ^ 0x3A))) {
            return null;
        }
        while (!llIIIIIllIllIII(lllllllllllllIlIIIIlIlllIIllIllI, lllllllllllllIlIIIIlIlllIIllllIl)) {
            int lllllllllllllIlIIIIlIlllIIllIlIl = GenLayerSmooth.lIIIlIllIIlIll[2];
            "".length();
            if (null != null) {
                return null;
            }
            while (!llIIIIIllIllIII(lllllllllllllIlIIIIlIlllIIllIlIl, lllllllllllllIlIIIIlIlllIIlIllII)) {
                final int lllllllllllllIlIIIIlIlllIIllIlII = lllllllllllllIlIIIIlIlllIIlllIII[lllllllllllllIlIIIIlIlllIIllIlIl + GenLayerSmooth.lIIIlIllIIlIll[2] + (lllllllllllllIlIIIIlIlllIIllIllI + GenLayerSmooth.lIIIlIllIIlIll[0]) * lllllllllllllIlIIIIlIlllIIlllIlI];
                final int lllllllllllllIlIIIIlIlllIIllIIll = lllllllllllllIlIIIIlIlllIIlllIII[lllllllllllllIlIIIIlIlllIIllIlIl + GenLayerSmooth.lIIIlIllIIlIll[1] + (lllllllllllllIlIIIIlIlllIIllIllI + GenLayerSmooth.lIIIlIllIIlIll[0]) * lllllllllllllIlIIIIlIlllIIlllIlI];
                final int lllllllllllllIlIIIIlIlllIIllIIlI = lllllllllllllIlIIIIlIlllIIlllIII[lllllllllllllIlIIIIlIlllIIllIlIl + GenLayerSmooth.lIIIlIllIIlIll[0] + (lllllllllllllIlIIIIlIlllIIllIllI + GenLayerSmooth.lIIIlIllIIlIll[2]) * lllllllllllllIlIIIIlIlllIIlllIlI];
                final int lllllllllllllIlIIIIlIlllIIllIIIl = lllllllllllllIlIIIIlIlllIIlllIII[lllllllllllllIlIIIIlIlllIIllIlIl + GenLayerSmooth.lIIIlIllIIlIll[0] + (lllllllllllllIlIIIIlIlllIIllIllI + GenLayerSmooth.lIIIlIllIIlIll[1]) * lllllllllllllIlIIIIlIlllIIlllIlI];
                int lllllllllllllIlIIIIlIlllIIllIIII = lllllllllllllIlIIIIlIlllIIlllIII[lllllllllllllIlIIIIlIlllIIllIlIl + GenLayerSmooth.lIIIlIllIIlIll[0] + (lllllllllllllIlIIIIlIlllIIllIllI + GenLayerSmooth.lIIIlIllIIlIll[0]) * lllllllllllllIlIIIIlIlllIIlllIlI];
                if (llIIIIIllIlIllI(lllllllllllllIlIIIIlIlllIIllIlII, lllllllllllllIlIIIIlIlllIIllIIll) && llIIIIIllIlIllI(lllllllllllllIlIIIIlIlllIIllIIlI, lllllllllllllIlIIIIlIlllIIllIIIl)) {
                    this.initChunkSeed(lllllllllllllIlIIIIlIlllIIllIlIl + lllllllllllllIlIIIIlIlllIIlIlllI, lllllllllllllIlIIIIlIlllIIllIllI + lllllllllllllIlIIIIlIlllIIlIllIl);
                    if (llIIIIIllIlIlll(this.nextInt(GenLayerSmooth.lIIIlIllIIlIll[1]))) {
                        lllllllllllllIlIIIIlIlllIIllIIII = lllllllllllllIlIIIIlIlllIIllIlII;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIlIIIIlIlllIIllIIII = lllllllllllllIlIIIIlIlllIIllIIlI;
                        "".length();
                        if ("  ".length() < 0) {
                            return null;
                        }
                    }
                }
                else {
                    if (llIIIIIllIlIllI(lllllllllllllIlIIIIlIlllIIllIlII, lllllllllllllIlIIIIlIlllIIllIIll)) {
                        lllllllllllllIlIIIIlIlllIIllIIII = lllllllllllllIlIIIIlIlllIIllIlII;
                    }
                    if (llIIIIIllIlIllI(lllllllllllllIlIIIIlIlllIIllIIlI, lllllllllllllIlIIIIlIlllIIllIIIl)) {
                        lllllllllllllIlIIIIlIlllIIllIIII = lllllllllllllIlIIIIlIlllIIllIIlI;
                    }
                }
                lllllllllllllIlIIIIlIlllIIllIlll[lllllllllllllIlIIIIlIlllIIllIlIl + lllllllllllllIlIIIIlIlllIIllIllI * lllllllllllllIlIIIIlIlllIIlIllII] = lllllllllllllIlIIIIlIlllIIllIIII;
                ++lllllllllllllIlIIIIlIlllIIllIlIl;
            }
            ++lllllllllllllIlIIIIlIlllIIllIllI;
        }
        return lllllllllllllIlIIIIlIlllIIllIlll;
    }
    
    private static boolean llIIIIIllIlIlll(final int lllllllllllllIlIIIIlIlllIIIlIlII) {
        return lllllllllllllIlIIIIlIlllIIIlIlII == 0;
    }
    
    static {
        llIIIIIllIlIlIl();
    }
    
    private static boolean llIIIIIllIlIllI(final int lllllllllllllIlIIIIlIlllIIIllIll, final int lllllllllllllIlIIIIlIlllIIIllIlI) {
        return lllllllllllllIlIIIIlIlllIIIllIll == lllllllllllllIlIIIIlIlllIIIllIlI;
    }
    
    public GenLayerSmooth(final long lllllllllllllIlIIIIlIlllIlIlIlIl, final GenLayer lllllllllllllIlIIIIlIlllIlIlIlII) {
        super(lllllllllllllIlIIIIlIlllIlIlIlIl);
        super.parent = lllllllllllllIlIIIIlIlllIlIlIlII;
    }
}
