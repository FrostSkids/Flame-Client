// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerRareBiome extends GenLayer
{
    private static final /* synthetic */ int[] lIIllllIIIIIll;
    
    private static boolean llIlllIIllIlIlI(final int lllllllllllllIIlIIllIIlIlIlllIII, final int lllllllllllllIIlIIllIIlIlIllIlll) {
        return lllllllllllllIIlIIllIIlIlIlllIII >= lllllllllllllIIlIIllIIlIlIllIlll;
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIIlIIllIIlIllIlIIIl, final int lllllllllllllIIlIIllIIlIllIlIIII, final int lllllllllllllIIlIIllIIlIllIIllll, final int lllllllllllllIIlIIllIIlIllIIlllI) {
        final int[] lllllllllllllIIlIIllIIlIllIIllIl = this.parent.getInts(lllllllllllllIIlIIllIIlIllIlIIIl - GenLayerRareBiome.lIIllllIIIIIll[0], lllllllllllllIIlIIllIIlIllIlIIII - GenLayerRareBiome.lIIllllIIIIIll[0], lllllllllllllIIlIIllIIlIllIIllll + GenLayerRareBiome.lIIllllIIIIIll[1], lllllllllllllIIlIIllIIlIllIIlllI + GenLayerRareBiome.lIIllllIIIIIll[1]);
        final int[] lllllllllllllIIlIIllIIlIllIIllII = IntCache.getIntCache(lllllllllllllIIlIIllIIlIllIIllll * lllllllllllllIIlIIllIIlIllIIlllI);
        int lllllllllllllIIlIIllIIlIllIIlIll = GenLayerRareBiome.lIIllllIIIIIll[2];
        "".length();
        if ("   ".length() != "   ".length()) {
            return null;
        }
        while (!llIlllIIllIlIlI(lllllllllllllIIlIIllIIlIllIIlIll, lllllllllllllIIlIIllIIlIllIIlllI)) {
            int lllllllllllllIIlIIllIIlIllIIlIlI = GenLayerRareBiome.lIIllllIIIIIll[2];
            "".length();
            if (" ".length() == 0) {
                return null;
            }
            while (!llIlllIIllIlIlI(lllllllllllllIIlIIllIIlIllIIlIlI, lllllllllllllIIlIIllIIlIllIIllll)) {
                this.initChunkSeed(lllllllllllllIIlIIllIIlIllIIlIlI + lllllllllllllIIlIIllIIlIllIlIIIl, lllllllllllllIIlIIllIIlIllIIlIll + lllllllllllllIIlIIllIIlIllIlIIII);
                final int lllllllllllllIIlIIllIIlIllIIlIIl = lllllllllllllIIlIIllIIlIllIIllIl[lllllllllllllIIlIIllIIlIllIIlIlI + GenLayerRareBiome.lIIllllIIIIIll[0] + (lllllllllllllIIlIIllIIlIllIIlIll + GenLayerRareBiome.lIIllllIIIIIll[0]) * (lllllllllllllIIlIIllIIlIllIIllll + GenLayerRareBiome.lIIllllIIIIIll[1])];
                if (llIlllIIllIlIII(this.nextInt(GenLayerRareBiome.lIIllllIIIIIll[3]))) {
                    if (llIlllIIllIlIIl(lllllllllllllIIlIIllIIlIllIIlIIl, BiomeGenBase.plains.biomeID)) {
                        lllllllllllllIIlIIllIIlIllIIllII[lllllllllllllIIlIIllIIlIllIIlIlI + lllllllllllllIIlIIllIIlIllIIlIll * lllllllllllllIIlIIllIIlIllIIllll] = BiomeGenBase.plains.biomeID + GenLayerRareBiome.lIIllllIIIIIll[4];
                        "".length();
                        if ((0x70 ^ 0x2B ^ (0x4C ^ 0x13)) == "   ".length()) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIlIIllIIlIllIIllII[lllllllllllllIIlIIllIIlIllIIlIlI + lllllllllllllIIlIIllIIlIllIIlIll * lllllllllllllIIlIIllIIlIllIIllll] = lllllllllllllIIlIIllIIlIllIIlIIl;
                        "".length();
                        if (((0x67 ^ 0x54) & ~(0x90 ^ 0xA3)) != ((0x49 ^ 0x51) & ~(0x1A ^ 0x2))) {
                            return null;
                        }
                    }
                }
                else {
                    lllllllllllllIIlIIllIIlIllIIllII[lllllllllllllIIlIIllIIlIllIIlIlI + lllllllllllllIIlIIllIIlIllIIlIll * lllllllllllllIIlIIllIIlIllIIllll] = lllllllllllllIIlIIllIIlIllIIlIIl;
                }
                ++lllllllllllllIIlIIllIIlIllIIlIlI;
            }
            ++lllllllllllllIIlIIllIIlIllIIlIll;
        }
        return lllllllllllllIIlIIllIIlIllIIllII;
    }
    
    private static boolean llIlllIIllIlIIl(final int lllllllllllllIIlIIllIIlIlIllllII, final int lllllllllllllIIlIIllIIlIlIlllIll) {
        return lllllllllllllIIlIIllIIlIlIllllII == lllllllllllllIIlIIllIIlIlIlllIll;
    }
    
    private static void llIlllIIllIIlll() {
        (lIIllllIIIIIll = new int[5])[0] = " ".length();
        GenLayerRareBiome.lIIllllIIIIIll[1] = "  ".length();
        GenLayerRareBiome.lIIllllIIIIIll[2] = ((0x33 ^ 0x2D ^ (0x67 ^ 0x34)) & (110 + 125 - 165 + 72 ^ 11 + 141 - 93 + 136 ^ -" ".length()));
        GenLayerRareBiome.lIIllllIIIIIll[3] = (0x6D ^ 0x42 ^ (0x68 ^ 0x7E));
        GenLayerRareBiome.lIIllllIIIIIll[4] = (0x27 ^ 0x29) + (0x28 ^ 0x14) - -(0x6E ^ 0x40) + (0x1D ^ 0x15);
    }
    
    static {
        llIlllIIllIIlll();
    }
    
    private static boolean llIlllIIllIlIII(final int lllllllllllllIIlIIllIIlIlIllIlIl) {
        return lllllllllllllIIlIIllIIlIlIllIlIl == 0;
    }
    
    public GenLayerRareBiome(final long lllllllllllllIIlIIllIIlIlllIIIIl, final GenLayer lllllllllllllIIlIIllIIlIllIlllIl) {
        super(lllllllllllllIIlIIllIIlIlllIIIIl);
        this.parent = lllllllllllllIIlIIllIIlIllIlllIl;
    }
}
