// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

public class GenLayerAddIsland extends GenLayer
{
    private static final /* synthetic */ int[] lIIIIlIllIIlII;
    
    static {
        lIlllIlIIlIlIII();
    }
    
    private static boolean lIlllIlIIlIlIll(final int lllllllllllllIlIIlIlIlIIIIllIIlI) {
        return lllllllllllllIlIIlIlIlIIIIllIIlI != 0;
    }
    
    private static boolean lIlllIlIIlIlIlI(final int lllllllllllllIlIIlIlIlIIIIlIlllI) {
        return lllllllllllllIlIIlIlIlIIIIlIlllI > 0;
    }
    
    private static boolean lIlllIlIIlIllIl(final int lllllllllllllIlIIlIlIlIIIIllIlIl, final int lllllllllllllIlIIlIlIlIIIIllIlII) {
        return lllllllllllllIlIIlIlIlIIIIllIlIl >= lllllllllllllIlIIlIlIlIIIIllIlII;
    }
    
    public GenLayerAddIsland(final long lllllllllllllIlIIlIlIlIIIllllIIl, final GenLayer lllllllllllllIlIIlIlIlIIIllllIll) {
        super(lllllllllllllIlIIlIlIlIIIllllIIl);
        this.parent = lllllllllllllIlIIlIlIlIIIllllIll;
    }
    
    private static boolean lIlllIlIIlIllII(final int lllllllllllllIlIIlIlIlIIIIlllIIl, final int lllllllllllllIlIIlIlIlIIIIlllIII) {
        return lllllllllllllIlIIlIlIlIIIIlllIIl == lllllllllllllIlIIlIlIlIIIIlllIII;
    }
    
    private static void lIlllIlIIlIlIII() {
        (lIIIIlIllIIlII = new int[6])[0] = " ".length();
        GenLayerAddIsland.lIIIIlIllIIlII[1] = "  ".length();
        GenLayerAddIsland.lIIIIlIllIIlII[2] = ((0x2E ^ 0x3D) & ~(0x3D ^ 0x2E));
        GenLayerAddIsland.lIIIIlIllIIlII[3] = (99 + 28 - 46 + 46 ^ (0xDB ^ 0xA1));
        GenLayerAddIsland.lIIIIlIllIIlII[4] = (0x1E ^ 0x49 ^ (0x40 ^ 0x13));
        GenLayerAddIsland.lIIIIlIllIIlII[5] = "   ".length();
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIlIIlIlIlIIIlIIlllI, final int lllllllllllllIlIIlIlIlIIIllIIIIl, final int lllllllllllllIlIIlIlIlIIIllIIIII, final int lllllllllllllIlIIlIlIlIIIlIIlIll) {
        final int lllllllllllllIlIIlIlIlIIIlIllllI = lllllllllllllIlIIlIlIlIIIlIIlllI - GenLayerAddIsland.lIIIIlIllIIlII[0];
        final int lllllllllllllIlIIlIlIlIIIlIlllIl = lllllllllllllIlIIlIlIlIIIllIIIIl - GenLayerAddIsland.lIIIIlIllIIlII[0];
        final int lllllllllllllIlIIlIlIlIIIlIlllII = lllllllllllllIlIIlIlIlIIIllIIIII + GenLayerAddIsland.lIIIIlIllIIlII[1];
        final int lllllllllllllIlIIlIlIlIIIlIllIll = lllllllllllllIlIIlIlIlIIIlIIlIll + GenLayerAddIsland.lIIIIlIllIIlII[1];
        final int[] lllllllllllllIlIIlIlIlIIIlIllIlI = this.parent.getInts(lllllllllllllIlIIlIlIlIIIlIllllI, lllllllllllllIlIIlIlIlIIIlIlllIl, lllllllllllllIlIIlIlIlIIIlIlllII, lllllllllllllIlIIlIlIlIIIlIllIll);
        final int[] lllllllllllllIlIIlIlIlIIIlIllIIl = IntCache.getIntCache(lllllllllllllIlIIlIlIlIIIllIIIII * lllllllllllllIlIIlIlIlIIIlIIlIll);
        int lllllllllllllIlIIlIlIlIIIlIllIII = GenLayerAddIsland.lIIIIlIllIIlII[2];
        "".length();
        if (((0x84 ^ 0xA8) & ~(0x9E ^ 0xB2)) > 0) {
            return null;
        }
        while (!lIlllIlIIlIllIl(lllllllllllllIlIIlIlIlIIIlIllIII, lllllllllllllIlIIlIlIlIIIlIIlIll)) {
            int lllllllllllllIlIIlIlIlIIIlIlIlll = GenLayerAddIsland.lIIIIlIllIIlII[2];
            "".length();
            if ((0xBE ^ 0xBA) == -" ".length()) {
                return null;
            }
            while (!lIlllIlIIlIllIl(lllllllllllllIlIIlIlIlIIIlIlIlll, lllllllllllllIlIIlIlIlIIIllIIIII)) {
                final int lllllllllllllIlIIlIlIlIIIlIlIllI = lllllllllllllIlIIlIlIlIIIlIllIlI[lllllllllllllIlIIlIlIlIIIlIlIlll + GenLayerAddIsland.lIIIIlIllIIlII[2] + (lllllllllllllIlIIlIlIlIIIlIllIII + GenLayerAddIsland.lIIIIlIllIIlII[2]) * lllllllllllllIlIIlIlIlIIIlIlllII];
                final int lllllllllllllIlIIlIlIlIIIlIlIlIl = lllllllllllllIlIIlIlIlIIIlIllIlI[lllllllllllllIlIIlIlIlIIIlIlIlll + GenLayerAddIsland.lIIIIlIllIIlII[1] + (lllllllllllllIlIIlIlIlIIIlIllIII + GenLayerAddIsland.lIIIIlIllIIlII[2]) * lllllllllllllIlIIlIlIlIIIlIlllII];
                final int lllllllllllllIlIIlIlIlIIIlIlIlII = lllllllllllllIlIIlIlIlIIIlIllIlI[lllllllllllllIlIIlIlIlIIIlIlIlll + GenLayerAddIsland.lIIIIlIllIIlII[2] + (lllllllllllllIlIIlIlIlIIIlIllIII + GenLayerAddIsland.lIIIIlIllIIlII[1]) * lllllllllllllIlIIlIlIlIIIlIlllII];
                final int lllllllllllllIlIIlIlIlIIIlIlIIll = lllllllllllllIlIIlIlIlIIIlIllIlI[lllllllllllllIlIIlIlIlIIIlIlIlll + GenLayerAddIsland.lIIIIlIllIIlII[1] + (lllllllllllllIlIIlIlIlIIIlIllIII + GenLayerAddIsland.lIIIIlIllIIlII[1]) * lllllllllllllIlIIlIlIlIIIlIlllII];
                final int lllllllllllllIlIIlIlIlIIIlIlIIlI = lllllllllllllIlIIlIlIlIIIlIllIlI[lllllllllllllIlIIlIlIlIIIlIlIlll + GenLayerAddIsland.lIIIIlIllIIlII[0] + (lllllllllllllIlIIlIlIlIIIlIllIII + GenLayerAddIsland.lIIIIlIllIIlII[0]) * lllllllllllllIlIIlIlIlIIIlIlllII];
                this.initChunkSeed(lllllllllllllIlIIlIlIlIIIlIlIlll + lllllllllllllIlIIlIlIlIIIlIIlllI, lllllllllllllIlIIlIlIlIIIlIllIII + lllllllllllllIlIIlIlIlIIIllIIIIl);
                if (!lIlllIlIIlIlIIl(lllllllllllllIlIIlIlIlIIIlIlIIlI) || (lIlllIlIIlIlIIl(lllllllllllllIlIIlIlIlIIIlIlIllI) && lIlllIlIIlIlIIl(lllllllllllllIlIIlIlIlIIIlIlIlIl) && lIlllIlIIlIlIIl(lllllllllllllIlIIlIlIlIIIlIlIlII) && lIlllIlIIlIlIIl(lllllllllllllIlIIlIlIlIIIlIlIIll))) {
                    if (lIlllIlIIlIlIlI(lllllllllllllIlIIlIlIlIIIlIlIIlI) && (!lIlllIlIIlIlIll(lllllllllllllIlIIlIlIlIIIlIlIllI) || !lIlllIlIIlIlIll(lllllllllllllIlIIlIlIlIIIlIlIlIl) || !lIlllIlIIlIlIll(lllllllllllllIlIIlIlIlIIIlIlIlII) || lIlllIlIIlIlIIl(lllllllllllllIlIIlIlIlIIIlIlIIll))) {
                        if (lIlllIlIIlIlIIl(this.nextInt(GenLayerAddIsland.lIIIIlIllIIlII[3]))) {
                            if (lIlllIlIIlIllII(lllllllllllllIlIIlIlIlIIIlIlIIlI, GenLayerAddIsland.lIIIIlIllIIlII[4])) {
                                lllllllllllllIlIIlIlIlIIIlIllIIl[lllllllllllllIlIIlIlIlIIIlIlIlll + lllllllllllllIlIIlIlIlIIIlIllIII * lllllllllllllIlIIlIlIlIIIllIIIII] = GenLayerAddIsland.lIIIIlIllIIlII[4];
                                "".length();
                                if ("   ".length() < ((0xFC ^ 0xB0) & ~(0xF3 ^ 0xBF))) {
                                    return null;
                                }
                            }
                            else {
                                lllllllllllllIlIIlIlIlIIIlIllIIl[lllllllllllllIlIIlIlIlIIIlIlIlll + lllllllllllllIlIIlIlIlIIIlIllIII * lllllllllllllIlIIlIlIlIIIllIIIII] = GenLayerAddIsland.lIIIIlIllIIlII[2];
                                "".length();
                                if (-"   ".length() > 0) {
                                    return null;
                                }
                            }
                        }
                        else {
                            lllllllllllllIlIIlIlIlIIIlIllIIl[lllllllllllllIlIIlIlIlIIIlIlIlll + lllllllllllllIlIIlIlIlIIIlIllIII * lllllllllllllIlIIlIlIlIIIllIIIII] = lllllllllllllIlIIlIlIlIIIlIlIIlI;
                            "".length();
                            if (((0xFF ^ 0xBD ^ (0xDD ^ 0x8E)) & (0x15 ^ 0x55 ^ (0xFD ^ 0xAC) ^ -" ".length())) > "   ".length()) {
                                return null;
                            }
                        }
                    }
                    else {
                        lllllllllllllIlIIlIlIlIIIlIllIIl[lllllllllllllIlIIlIlIlIIIlIlIlll + lllllllllllllIlIIlIlIlIIIlIllIII * lllllllllllllIlIIlIlIlIIIllIIIII] = lllllllllllllIlIIlIlIlIIIlIlIIlI;
                        "".length();
                        if ("   ".length() == 0) {
                            return null;
                        }
                    }
                }
                else {
                    int lllllllllllllIlIIlIlIlIIIlIlIIIl = GenLayerAddIsland.lIIIIlIllIIlII[0];
                    int lllllllllllllIlIIlIlIlIIIlIlIIII = GenLayerAddIsland.lIIIIlIllIIlII[0];
                    if (lIlllIlIIlIlIll(lllllllllllllIlIIlIlIlIIIlIlIllI) && lIlllIlIIlIlIIl(this.nextInt(lllllllllllllIlIIlIlIlIIIlIlIIIl++))) {
                        lllllllllllllIlIIlIlIlIIIlIlIIII = lllllllllllllIlIIlIlIlIIIlIlIllI;
                    }
                    if (lIlllIlIIlIlIll(lllllllllllllIlIIlIlIlIIIlIlIlIl) && lIlllIlIIlIlIIl(this.nextInt(lllllllllllllIlIIlIlIlIIIlIlIIIl++))) {
                        lllllllllllllIlIIlIlIlIIIlIlIIII = lllllllllllllIlIIlIlIlIIIlIlIlIl;
                    }
                    if (lIlllIlIIlIlIll(lllllllllllllIlIIlIlIlIIIlIlIlII) && lIlllIlIIlIlIIl(this.nextInt(lllllllllllllIlIIlIlIlIIIlIlIIIl++))) {
                        lllllllllllllIlIIlIlIlIIIlIlIIII = lllllllllllllIlIIlIlIlIIIlIlIlII;
                    }
                    if (lIlllIlIIlIlIll(lllllllllllllIlIIlIlIlIIIlIlIIll) && lIlllIlIIlIlIIl(this.nextInt(lllllllllllllIlIIlIlIlIIIlIlIIIl++))) {
                        lllllllllllllIlIIlIlIlIIIlIlIIII = lllllllllllllIlIIlIlIlIIIlIlIIll;
                    }
                    if (lIlllIlIIlIlIIl(this.nextInt(GenLayerAddIsland.lIIIIlIllIIlII[5]))) {
                        lllllllllllllIlIIlIlIlIIIlIllIIl[lllllllllllllIlIIlIlIlIIIlIlIlll + lllllllllllllIlIIlIlIlIIIlIllIII * lllllllllllllIlIIlIlIlIIIllIIIII] = lllllllllllllIlIIlIlIlIIIlIlIIII;
                        "".length();
                        if ((0xF8 ^ 0x9C ^ (0x14 ^ 0x74)) == 0x0) {
                            return null;
                        }
                    }
                    else if (lIlllIlIIlIllII(lllllllllllllIlIIlIlIlIIIlIlIIII, GenLayerAddIsland.lIIIIlIllIIlII[4])) {
                        lllllllllllllIlIIlIlIlIIIlIllIIl[lllllllllllllIlIIlIlIlIIIlIlIlll + lllllllllllllIlIIlIlIlIIIlIllIII * lllllllllllllIlIIlIlIlIIIllIIIII] = GenLayerAddIsland.lIIIIlIllIIlII[4];
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIlIIlIlIlIIIlIllIIl[lllllllllllllIlIIlIlIlIIIlIlIlll + lllllllllllllIlIIlIlIlIIIlIllIII * lllllllllllllIlIIlIlIlIIIllIIIII] = GenLayerAddIsland.lIIIIlIllIIlII[2];
                    }
                }
                ++lllllllllllllIlIIlIlIlIIIlIlIlll;
            }
            ++lllllllllllllIlIIlIlIlIIIlIllIII;
        }
        return lllllllllllllIlIIlIlIlIIIlIllIIl;
    }
    
    private static boolean lIlllIlIIlIlIIl(final int lllllllllllllIlIIlIlIlIIIIllIIII) {
        return lllllllllllllIlIIlIlIlIIIIllIIII == 0;
    }
}
