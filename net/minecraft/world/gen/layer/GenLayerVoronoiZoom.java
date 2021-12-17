// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

public class GenLayerVoronoiZoom extends GenLayer
{
    private static final /* synthetic */ int[] lIIlllllIIIlll;
    
    private static boolean llIllllIlIIIIII(final int lllllllllllllIIlIIlIIlIIllIIIIll) {
        return lllllllllllllIIlIIlIIlIIllIIIIll < 0;
    }
    
    @Override
    public int[] getInts(int lllllllllllllIIlIIlIIlIlIIIIllll, int lllllllllllllIIlIIlIIlIlIIIIlllI, final int lllllllllllllIIlIIlIIlIlIIIIllIl, final int lllllllllllllIIlIIlIIlIIlllIIlll) {
        lllllllllllllIIlIIlIIlIlIIIIllll -= 2;
        lllllllllllllIIlIIlIIlIlIIIIlllI -= 2;
        final int lllllllllllllIIlIIlIIlIlIIIIlIll = lllllllllllllIIlIIlIIlIlIIIIllll >> GenLayerVoronoiZoom.lIIlllllIIIlll[0];
        final int lllllllllllllIIlIIlIIlIlIIIIlIlI = lllllllllllllIIlIIlIIlIlIIIIlllI >> GenLayerVoronoiZoom.lIIlllllIIIlll[0];
        final int lllllllllllllIIlIIlIIlIlIIIIlIIl = (lllllllllllllIIlIIlIIlIlIIIIllIl >> GenLayerVoronoiZoom.lIIlllllIIIlll[0]) + GenLayerVoronoiZoom.lIIlllllIIIlll[0];
        final int lllllllllllllIIlIIlIIlIlIIIIlIII = (lllllllllllllIIlIIlIIlIIlllIIlll >> GenLayerVoronoiZoom.lIIlllllIIIlll[0]) + GenLayerVoronoiZoom.lIIlllllIIIlll[0];
        final int[] lllllllllllllIIlIIlIIlIlIIIIIlll = this.parent.getInts(lllllllllllllIIlIIlIIlIlIIIIlIll, lllllllllllllIIlIIlIIlIlIIIIlIlI, lllllllllllllIIlIIlIIlIlIIIIlIIl, lllllllllllllIIlIIlIIlIlIIIIlIII);
        final int lllllllllllllIIlIIlIIlIlIIIIIllI = lllllllllllllIIlIIlIIlIlIIIIlIIl - GenLayerVoronoiZoom.lIIlllllIIIlll[1] << GenLayerVoronoiZoom.lIIlllllIIIlll[0];
        final int lllllllllllllIIlIIlIIlIlIIIIIlIl = lllllllllllllIIlIIlIIlIlIIIIlIII - GenLayerVoronoiZoom.lIIlllllIIIlll[1] << GenLayerVoronoiZoom.lIIlllllIIIlll[0];
        final int[] lllllllllllllIIlIIlIIlIlIIIIIlII = IntCache.getIntCache(lllllllllllllIIlIIlIIlIlIIIIIllI * lllllllllllllIIlIIlIIlIlIIIIIlIl);
        int lllllllllllllIIlIIlIIlIlIIIIIIll = GenLayerVoronoiZoom.lIIlllllIIIlll[2];
        "".length();
        if ("  ".length() > "   ".length()) {
            return null;
        }
        while (!llIllllIlIIIIIl(lllllllllllllIIlIIlIIlIlIIIIIIll, lllllllllllllIIlIIlIIlIlIIIIlIII - GenLayerVoronoiZoom.lIIlllllIIIlll[1])) {
            int lllllllllllllIIlIIlIIlIlIIIIIIlI = GenLayerVoronoiZoom.lIIlllllIIIlll[2];
            int lllllllllllllIIlIIlIIlIlIIIIIIIl = lllllllllllllIIlIIlIIlIlIIIIIlll[lllllllllllllIIlIIlIIlIlIIIIIIlI + GenLayerVoronoiZoom.lIIlllllIIIlll[2] + (lllllllllllllIIlIIlIIlIlIIIIIIll + GenLayerVoronoiZoom.lIIlllllIIIlll[2]) * lllllllllllllIIlIIlIIlIlIIIIlIIl];
            int lllllllllllllIIlIIlIIlIlIIIIIIII = lllllllllllllIIlIIlIIlIlIIIIIlll[lllllllllllllIIlIIlIIlIlIIIIIIlI + GenLayerVoronoiZoom.lIIlllllIIIlll[2] + (lllllllllllllIIlIIlIIlIlIIIIIIll + GenLayerVoronoiZoom.lIIlllllIIIlll[1]) * lllllllllllllIIlIIlIIlIlIIIIlIIl];
            "".length();
            if ((10 + 4 + 89 + 96 ^ 98 + 108 - 57 + 45) <= 0) {
                return null;
            }
            while (!llIllllIlIIIIIl(lllllllllllllIIlIIlIIlIlIIIIIIlI, lllllllllllllIIlIIlIIlIlIIIIlIIl - GenLayerVoronoiZoom.lIIlllllIIIlll[1])) {
                final double lllllllllllllIIlIIlIIlIIllllllll = 3.6;
                this.initChunkSeed(lllllllllllllIIlIIlIIlIlIIIIIIlI + lllllllllllllIIlIIlIIlIlIIIIlIll << GenLayerVoronoiZoom.lIIlllllIIIlll[0], lllllllllllllIIlIIlIIlIlIIIIIIll + lllllllllllllIIlIIlIIlIlIIIIlIlI << GenLayerVoronoiZoom.lIIlllllIIIlll[0]);
                final double lllllllllllllIIlIIlIIlIIlllllllI = (this.nextInt(GenLayerVoronoiZoom.lIIlllllIIIlll[3]) / 1024.0 - 0.5) * 3.6;
                final double lllllllllllllIIlIIlIIlIIllllllIl = (this.nextInt(GenLayerVoronoiZoom.lIIlllllIIIlll[3]) / 1024.0 - 0.5) * 3.6;
                this.initChunkSeed(lllllllllllllIIlIIlIIlIlIIIIIIlI + lllllllllllllIIlIIlIIlIlIIIIlIll + GenLayerVoronoiZoom.lIIlllllIIIlll[1] << GenLayerVoronoiZoom.lIIlllllIIIlll[0], lllllllllllllIIlIIlIIlIlIIIIIIll + lllllllllllllIIlIIlIIlIlIIIIlIlI << GenLayerVoronoiZoom.lIIlllllIIIlll[0]);
                final double lllllllllllllIIlIIlIIlIIllllllII = (this.nextInt(GenLayerVoronoiZoom.lIIlllllIIIlll[3]) / 1024.0 - 0.5) * 3.6 + 4.0;
                final double lllllllllllllIIlIIlIIlIIlllllIll = (this.nextInt(GenLayerVoronoiZoom.lIIlllllIIIlll[3]) / 1024.0 - 0.5) * 3.6;
                this.initChunkSeed(lllllllllllllIIlIIlIIlIlIIIIIIlI + lllllllllllllIIlIIlIIlIlIIIIlIll << GenLayerVoronoiZoom.lIIlllllIIIlll[0], lllllllllllllIIlIIlIIlIlIIIIIIll + lllllllllllllIIlIIlIIlIlIIIIlIlI + GenLayerVoronoiZoom.lIIlllllIIIlll[1] << GenLayerVoronoiZoom.lIIlllllIIIlll[0]);
                final double lllllllllllllIIlIIlIIlIIlllllIlI = (this.nextInt(GenLayerVoronoiZoom.lIIlllllIIIlll[3]) / 1024.0 - 0.5) * 3.6;
                final double lllllllllllllIIlIIlIIlIIlllllIIl = (this.nextInt(GenLayerVoronoiZoom.lIIlllllIIIlll[3]) / 1024.0 - 0.5) * 3.6 + 4.0;
                this.initChunkSeed(lllllllllllllIIlIIlIIlIlIIIIIIlI + lllllllllllllIIlIIlIIlIlIIIIlIll + GenLayerVoronoiZoom.lIIlllllIIIlll[1] << GenLayerVoronoiZoom.lIIlllllIIIlll[0], lllllllllllllIIlIIlIIlIlIIIIIIll + lllllllllllllIIlIIlIIlIlIIIIlIlI + GenLayerVoronoiZoom.lIIlllllIIIlll[1] << GenLayerVoronoiZoom.lIIlllllIIIlll[0]);
                final double lllllllllllllIIlIIlIIlIIlllllIII = (this.nextInt(GenLayerVoronoiZoom.lIIlllllIIIlll[3]) / 1024.0 - 0.5) * 3.6 + 4.0;
                final double lllllllllllllIIlIIlIIlIIllllIlll = (this.nextInt(GenLayerVoronoiZoom.lIIlllllIIIlll[3]) / 1024.0 - 0.5) * 3.6 + 4.0;
                final int lllllllllllllIIlIIlIIlIIllllIllI = lllllllllllllIIlIIlIIlIlIIIIIlll[lllllllllllllIIlIIlIIlIlIIIIIIlI + GenLayerVoronoiZoom.lIIlllllIIIlll[1] + (lllllllllllllIIlIIlIIlIlIIIIIIll + GenLayerVoronoiZoom.lIIlllllIIIlll[2]) * lllllllllllllIIlIIlIIlIlIIIIlIIl] & GenLayerVoronoiZoom.lIIlllllIIIlll[4];
                final int lllllllllllllIIlIIlIIlIIllllIlIl = lllllllllllllIIlIIlIIlIlIIIIIlll[lllllllllllllIIlIIlIIlIlIIIIIIlI + GenLayerVoronoiZoom.lIIlllllIIIlll[1] + (lllllllllllllIIlIIlIIlIlIIIIIIll + GenLayerVoronoiZoom.lIIlllllIIIlll[1]) * lllllllllllllIIlIIlIIlIlIIIIlIIl] & GenLayerVoronoiZoom.lIIlllllIIIlll[4];
                int lllllllllllllIIlIIlIIlIIllllIlII = GenLayerVoronoiZoom.lIIlllllIIIlll[2];
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
                while (!llIllllIlIIIIIl(lllllllllllllIIlIIlIIlIIllllIlII, GenLayerVoronoiZoom.lIIlllllIIIlll[5])) {
                    int lllllllllllllIIlIIlIIlIIllllIIll = ((lllllllllllllIIlIIlIIlIlIIIIIIll << GenLayerVoronoiZoom.lIIlllllIIIlll[0]) + lllllllllllllIIlIIlIIlIIllllIlII) * lllllllllllllIIlIIlIIlIlIIIIIllI + (lllllllllllllIIlIIlIIlIlIIIIIIlI << GenLayerVoronoiZoom.lIIlllllIIIlll[0]);
                    int lllllllllllllIIlIIlIIlIIllllIIlI = GenLayerVoronoiZoom.lIIlllllIIIlll[2];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return null;
                    }
                    while (!llIllllIlIIIIIl(lllllllllllllIIlIIlIIlIIllllIIlI, GenLayerVoronoiZoom.lIIlllllIIIlll[5])) {
                        final double lllllllllllllIIlIIlIIlIIllllIIIl = (lllllllllllllIIlIIlIIlIIllllIlII - lllllllllllllIIlIIlIIlIIllllllIl) * (lllllllllllllIIlIIlIIlIIllllIlII - lllllllllllllIIlIIlIIlIIllllllIl) + (lllllllllllllIIlIIlIIlIIllllIIlI - lllllllllllllIIlIIlIIlIIlllllllI) * (lllllllllllllIIlIIlIIlIIllllIIlI - lllllllllllllIIlIIlIIlIIlllllllI);
                        final double lllllllllllllIIlIIlIIlIIllllIIII = (lllllllllllllIIlIIlIIlIIllllIlII - lllllllllllllIIlIIlIIlIIlllllIll) * (lllllllllllllIIlIIlIIlIIllllIlII - lllllllllllllIIlIIlIIlIIlllllIll) + (lllllllllllllIIlIIlIIlIIllllIIlI - lllllllllllllIIlIIlIIlIIllllllII) * (lllllllllllllIIlIIlIIlIIllllIIlI - lllllllllllllIIlIIlIIlIIllllllII);
                        final double lllllllllllllIIlIIlIIlIIlllIllll = (lllllllllllllIIlIIlIIlIIllllIlII - lllllllllllllIIlIIlIIlIIlllllIIl) * (lllllllllllllIIlIIlIIlIIllllIlII - lllllllllllllIIlIIlIIlIIlllllIIl) + (lllllllllllllIIlIIlIIlIIllllIIlI - lllllllllllllIIlIIlIIlIIlllllIlI) * (lllllllllllllIIlIIlIIlIIllllIIlI - lllllllllllllIIlIIlIIlIIlllllIlI);
                        final double lllllllllllllIIlIIlIIlIIlllIlllI = (lllllllllllllIIlIIlIIlIIllllIlII - lllllllllllllIIlIIlIIlIIllllIlll) * (lllllllllllllIIlIIlIIlIIllllIlII - lllllllllllllIIlIIlIIlIIllllIlll) + (lllllllllllllIIlIIlIIlIIllllIIlI - lllllllllllllIIlIIlIIlIIlllllIII) * (lllllllllllllIIlIIlIIlIIllllIIlI - lllllllllllllIIlIIlIIlIIlllllIII);
                        if (llIllllIlIIIIII(llIllllIIllllll(lllllllllllllIIlIIlIIlIIllllIIIl, lllllllllllllIIlIIlIIlIIllllIIII)) && llIllllIlIIIIII(llIllllIIllllll(lllllllllllllIIlIIlIIlIIllllIIIl, lllllllllllllIIlIIlIIlIIlllIllll)) && llIllllIlIIIIII(llIllllIIllllll(lllllllllllllIIlIIlIIlIIllllIIIl, lllllllllllllIIlIIlIIlIIlllIlllI))) {
                            lllllllllllllIIlIIlIIlIlIIIIIlII[lllllllllllllIIlIIlIIlIIllllIIll++] = lllllllllllllIIlIIlIIlIlIIIIIIIl;
                            "".length();
                            if (((0x54 ^ 0x1B) & ~(0x65 ^ 0x2A)) != ((0x64 ^ 0x43) & ~(0x13 ^ 0x34))) {
                                return null;
                            }
                        }
                        else if (llIllllIlIIIIII(llIllllIIllllll(lllllllllllllIIlIIlIIlIIllllIIII, lllllllllllllIIlIIlIIlIIllllIIIl)) && llIllllIlIIIIII(llIllllIIllllll(lllllllllllllIIlIIlIIlIIllllIIII, lllllllllllllIIlIIlIIlIIlllIllll)) && llIllllIlIIIIII(llIllllIIllllll(lllllllllllllIIlIIlIIlIIllllIIII, lllllllllllllIIlIIlIIlIIlllIlllI))) {
                            lllllllllllllIIlIIlIIlIlIIIIIlII[lllllllllllllIIlIIlIIlIIllllIIll++] = lllllllllllllIIlIIlIIlIIllllIllI;
                            "".length();
                            if (" ".length() < 0) {
                                return null;
                            }
                        }
                        else if (llIllllIlIIIIII(llIllllIIllllll(lllllllllllllIIlIIlIIlIIlllIllll, lllllllllllllIIlIIlIIlIIllllIIIl)) && llIllllIlIIIIII(llIllllIIllllll(lllllllllllllIIlIIlIIlIIlllIllll, lllllllllllllIIlIIlIIlIIllllIIII)) && llIllllIlIIIIII(llIllllIIllllll(lllllllllllllIIlIIlIIlIIlllIllll, lllllllllllllIIlIIlIIlIIlllIlllI))) {
                            lllllllllllllIIlIIlIIlIlIIIIIlII[lllllllllllllIIlIIlIIlIIllllIIll++] = lllllllllllllIIlIIlIIlIlIIIIIIII;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        else {
                            lllllllllllllIIlIIlIIlIlIIIIIlII[lllllllllllllIIlIIlIIlIIllllIIll++] = lllllllllllllIIlIIlIIlIIllllIlIl;
                        }
                        ++lllllllllllllIIlIIlIIlIIllllIIlI;
                    }
                    ++lllllllllllllIIlIIlIIlIIllllIlII;
                }
                lllllllllllllIIlIIlIIlIlIIIIIIIl = lllllllllllllIIlIIlIIlIIllllIllI;
                lllllllllllllIIlIIlIIlIlIIIIIIII = lllllllllllllIIlIIlIIlIIllllIlIl;
                ++lllllllllllllIIlIIlIIlIlIIIIIIlI;
            }
            ++lllllllllllllIIlIIlIIlIlIIIIIIll;
        }
        final int[] lllllllllllllIIlIIlIIlIIlllIllIl = IntCache.getIntCache(lllllllllllllIIlIIlIIlIlIIIIllIl * lllllllllllllIIlIIlIIlIIlllIIlll);
        int lllllllllllllIIlIIlIIlIIlllIllII = GenLayerVoronoiZoom.lIIlllllIIIlll[2];
        "".length();
        if (((0xCA ^ 0xA4 ^ (0xF5 ^ 0xA8)) & (0x90 ^ 0xA9 ^ (0x24 ^ 0x2E) ^ -" ".length())) > ((134 + 30 - 72 + 81 ^ 85 + 105 - 71 + 31) & (0x77 ^ 0x54 ^ (0xBF ^ 0xA7) ^ -" ".length()))) {
            return null;
        }
        while (!llIllllIlIIIIIl(lllllllllllllIIlIIlIIlIIlllIllII, lllllllllllllIIlIIlIIlIIlllIIlll)) {
            System.arraycopy(lllllllllllllIIlIIlIIlIlIIIIIlII, (lllllllllllllIIlIIlIIlIIlllIllII + (lllllllllllllIIlIIlIIlIlIIIIlllI & GenLayerVoronoiZoom.lIIlllllIIIlll[6])) * lllllllllllllIIlIIlIIlIlIIIIIllI + (lllllllllllllIIlIIlIIlIlIIIIllll & GenLayerVoronoiZoom.lIIlllllIIIlll[6]), lllllllllllllIIlIIlIIlIIlllIllIl, lllllllllllllIIlIIlIIlIIlllIllII * lllllllllllllIIlIIlIIlIlIIIIllIl, lllllllllllllIIlIIlIIlIlIIIIllIl);
            ++lllllllllllllIIlIIlIIlIIlllIllII;
        }
        return lllllllllllllIIlIIlIIlIIlllIllIl;
    }
    
    private static void llIllllIIlllllI() {
        (lIIlllllIIIlll = new int[7])[0] = "  ".length();
        GenLayerVoronoiZoom.lIIlllllIIIlll[1] = " ".length();
        GenLayerVoronoiZoom.lIIlllllIIIlll[2] = ((0xA4 ^ 0x8A ^ (0x87 ^ 0x83)) & (56 + 37 - 39 + 109 ^ 92 + 51 - 59 + 53 ^ -" ".length()));
        GenLayerVoronoiZoom.lIIlllllIIIlll[3] = (0xFFFFD642 & 0x2DBD);
        GenLayerVoronoiZoom.lIIlllllIIIlll[4] = 3 + 235 - 35 + 52;
        GenLayerVoronoiZoom.lIIlllllIIIlll[5] = (102 + 28 - 25 + 38 ^ 3 + 76 - 39 + 99);
        GenLayerVoronoiZoom.lIIlllllIIIlll[6] = "   ".length();
    }
    
    private static boolean llIllllIlIIIIIl(final int lllllllllllllIIlIIlIIlIIllIIIllI, final int lllllllllllllIIlIIlIIlIIllIIIlIl) {
        return lllllllllllllIIlIIlIIlIIllIIIllI >= lllllllllllllIIlIIlIIlIIllIIIlIl;
    }
    
    static {
        llIllllIIlllllI();
    }
    
    private static int llIllllIIllllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public GenLayerVoronoiZoom(final long lllllllllllllIIlIIlIIlIlIIllIlIl, final GenLayer lllllllllllllIIlIIlIIlIlIIllIlll) {
        super(lllllllllllllIIlIIlIIlIlIIllIlIl);
        super.parent = lllllllllllllIIlIIlIIlIlIIllIlll;
    }
}
