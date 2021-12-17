// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerBiomeEdge extends GenLayer
{
    private static final /* synthetic */ int[] llIllIIlIlIlIl;
    
    private static boolean lIIlIllIllllIlII(final int llllllllllllIllIIllllIlIlIIlIlIl, final int llllllllllllIllIIllllIlIlIIlIlII) {
        return llllllllllllIllIIllllIlIlIIlIlIl == llllllllllllIllIIllllIlIlIIlIlII;
    }
    
    private boolean replaceBiomeEdge(final int[] llllllllllllIllIIllllIlIlIllIllI, final int[] llllllllllllIllIIllllIlIllIIIIIl, final int llllllllllllIllIIllllIlIllIIIIII, final int llllllllllllIllIIllllIlIlIllIIll, final int llllllllllllIllIIllllIlIlIlllllI, final int llllllllllllIllIIllllIlIlIllllIl, final int llllllllllllIllIIllllIlIlIllllII, final int llllllllllllIllIIllllIlIlIlIllll) {
        if (lIIlIllIllllIlIl(llllllllllllIllIIllllIlIlIllllIl, llllllllllllIllIIllllIlIlIllllII)) {
            return GenLayerBiomeEdge.llIllIIlIlIlIl[2] != 0;
        }
        final int llllllllllllIllIIllllIlIlIlllIlI = llllllllllllIllIIllllIlIlIllIllI[llllllllllllIllIIllllIlIllIIIIII + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIlIlIllIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[0] - GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIlIlIlllllI + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
        final int llllllllllllIllIIllllIlIlIlllIIl = llllllllllllIllIIllllIlIlIllIllI[llllllllllllIllIIllllIlIllIIIIII + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIlIlIllIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIlIlIlllllI + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
        final int llllllllllllIllIIllllIlIlIlllIII = llllllllllllIllIIllllIlIlIllIllI[llllllllllllIllIIllllIlIllIIIIII + GenLayerBiomeEdge.llIllIIlIlIlIl[0] - GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIlIlIllIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIlIlIlllllI + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
        final int llllllllllllIllIIllllIlIlIllIlll = llllllllllllIllIIllllIlIlIllIllI[llllllllllllIllIIllllIlIllIIIIII + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIlIlIllIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIlIlIlllllI + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
        if (lIIlIllIllllIlll(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIllIIllllIlIlIlllIlI, llllllllllllIllIIllllIlIlIllllII) ? 1 : 0) && lIIlIllIllllIlll(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIllIIllllIlIlIlllIIl, llllllllllllIllIIllllIlIlIllllII) ? 1 : 0) && lIIlIllIllllIlll(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIllIIllllIlIlIlllIII, llllllllllllIllIIllllIlIlIllllII) ? 1 : 0) && lIIlIllIllllIlll(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIllIIllllIlIlIllIlll, llllllllllllIllIIllllIlIlIllllII) ? 1 : 0)) {
            llllllllllllIllIIllllIlIllIIIIIl[llllllllllllIllIIllllIlIllIIIIII + llllllllllllIllIIllllIlIlIllIIll * llllllllllllIllIIllllIlIlIlllllI] = llllllllllllIllIIllllIlIlIllllIl;
            "".length();
            if ("   ".length() > (0x4F ^ 0x59 ^ (0x7D ^ 0x6F))) {
                return ((0x37 ^ 0x78 ^ (0xA0 ^ 0x8F)) & (0xCC ^ 0xC2 ^ (0xAB ^ 0xC5) ^ -" ".length())) != 0x0;
            }
        }
        else {
            llllllllllllIllIIllllIlIllIIIIIl[llllllllllllIllIIllllIlIllIIIIII + llllllllllllIllIIllllIlIlIllIIll * llllllllllllIllIIllllIlIlIlllllI] = llllllllllllIllIIllllIlIlIlIllll;
        }
        return GenLayerBiomeEdge.llIllIIlIlIlIl[0] != 0;
    }
    
    private boolean canBiomesBeNeighbors(final int llllllllllllIllIIllllIlIlIlIIIll, final int llllllllllllIllIIllllIlIlIlIIIlI) {
        if (lIIlIllIllllIlll(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIllIIllllIlIlIlIIIll, llllllllllllIllIIllllIlIlIlIIIlI) ? 1 : 0)) {
            return GenLayerBiomeEdge.llIllIIlIlIlIl[0] != 0;
        }
        final BiomeGenBase llllllllllllIllIIllllIlIlIlIIIIl = BiomeGenBase.getBiome(llllllllllllIllIIllllIlIlIlIIIll);
        final BiomeGenBase llllllllllllIllIIllllIlIlIlIIIII = BiomeGenBase.getBiome(llllllllllllIllIIllllIlIlIlIIIlI);
        if (!lIIlIllIlllllIII(llllllllllllIllIIllllIlIlIlIIIIl) || !lIIlIllIlllllIII(llllllllllllIllIIllllIlIlIlIIIII)) {
            return GenLayerBiomeEdge.llIllIIlIlIlIl[2] != 0;
        }
        final BiomeGenBase.TempCategory llllllllllllIllIIllllIlIlIIlllll = llllllllllllIllIIllllIlIlIlIIIIl.getTempCategory();
        final BiomeGenBase.TempCategory llllllllllllIllIIllllIlIlIIllllI = llllllllllllIllIIllllIlIlIlIIIII.getTempCategory();
        if (lIIlIllIlllllIIl(llllllllllllIllIIllllIlIlIIlllll, llllllllllllIllIIllllIlIlIIllllI) && lIIlIllIlllllIIl(llllllllllllIllIIllllIlIlIIlllll, BiomeGenBase.TempCategory.MEDIUM) && lIIlIllIlllllIIl(llllllllllllIllIIllllIlIlIIllllI, BiomeGenBase.TempCategory.MEDIUM)) {
            return GenLayerBiomeEdge.llIllIIlIlIlIl[2] != 0;
        }
        return GenLayerBiomeEdge.llIllIIlIlIlIl[0] != 0;
    }
    
    private static boolean lIIlIllIllllIlIl(final int llllllllllllIllIIllllIlIlIIIIIll, final int llllllllllllIllIIllllIlIlIIIIIlI) {
        return llllllllllllIllIIllllIlIlIIIIIll != llllllllllllIllIIllllIlIlIIIIIlI;
    }
    
    static {
        lIIlIllIllllIIlI();
    }
    
    private static void lIIlIllIllllIIlI() {
        (llIllIIlIlIlIl = new int[3])[0] = " ".length();
        GenLayerBiomeEdge.llIllIIlIlIlIl[1] = "  ".length();
        GenLayerBiomeEdge.llIllIIlIlIlIl[2] = ((0x2A ^ 0x19) & ~(0x4C ^ 0x7F));
    }
    
    private static boolean lIIlIllIlllllIII(final Object llllllllllllIllIIllllIlIlIIIlIlI) {
        return llllllllllllIllIIllllIlIlIIIlIlI != null;
    }
    
    private static boolean lIIlIllIlllllIIl(final Object llllllllllllIllIIllllIlIlIIIllIl, final Object llllllllllllIllIIllllIlIlIIIllII) {
        return llllllllllllIllIIllllIlIlIIIllIl != llllllllllllIllIIllllIlIlIIIllII;
    }
    
    private boolean replaceBiomeEdgeIfNecessary(final int[] llllllllllllIllIIllllIlIllIllIll, final int[] llllllllllllIllIIllllIlIllIllIlI, final int llllllllllllIllIIllllIlIllIllIIl, final int llllllllllllIllIIllllIlIllIllIII, final int llllllllllllIllIIllllIlIlllIIlII, final int llllllllllllIllIIllllIlIllIlIllI, final int llllllllllllIllIIllllIlIllIlIlIl, final int llllllllllllIllIIllllIlIllIlIlII) {
        if (lIIlIllIllllIIll(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIllIIllllIlIllIlIllI, llllllllllllIllIIllllIlIllIlIlIl) ? 1 : 0)) {
            return GenLayerBiomeEdge.llIllIIlIlIlIl[2] != 0;
        }
        final int llllllllllllIllIIllllIlIlllIIIII = llllllllllllIllIIllllIlIllIllIll[llllllllllllIllIIllllIlIllIllIIl + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIlIllIllIII + GenLayerBiomeEdge.llIllIIlIlIlIl[0] - GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIlIlllIIlII + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
        final int llllllllllllIllIIllllIlIllIlllll = llllllllllllIllIIllllIlIllIllIll[llllllllllllIllIIllllIlIllIllIIl + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIlIllIllIII + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIlIlllIIlII + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
        final int llllllllllllIllIIllllIlIllIllllI = llllllllllllIllIIllllIlIllIllIll[llllllllllllIllIIllllIlIllIllIIl + GenLayerBiomeEdge.llIllIIlIlIlIl[0] - GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIlIllIllIII + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIlIlllIIlII + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
        final int llllllllllllIllIIllllIlIllIlllIl = llllllllllllIllIIllllIlIllIllIll[llllllllllllIllIIllllIlIllIllIIl + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIlIllIllIII + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIlIlllIIlII + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
        if (lIIlIllIllllIlll(this.canBiomesBeNeighbors(llllllllllllIllIIllllIlIlllIIIII, llllllllllllIllIIllllIlIllIlIlIl) ? 1 : 0) && lIIlIllIllllIlll(this.canBiomesBeNeighbors(llllllllllllIllIIllllIlIllIlllll, llllllllllllIllIIllllIlIllIlIlIl) ? 1 : 0) && lIIlIllIllllIlll(this.canBiomesBeNeighbors(llllllllllllIllIIllllIlIllIllllI, llllllllllllIllIIllllIlIllIlIlIl) ? 1 : 0) && lIIlIllIllllIlll(this.canBiomesBeNeighbors(llllllllllllIllIIllllIlIllIlllIl, llllllllllllIllIIllllIlIllIlIlIl) ? 1 : 0)) {
            llllllllllllIllIIllllIlIllIllIlI[llllllllllllIllIIllllIlIllIllIIl + llllllllllllIllIIllllIlIllIllIII * llllllllllllIllIIllllIlIlllIIlII] = llllllllllllIllIIllllIlIllIlIllI;
            "".length();
            if ("  ".length() == -" ".length()) {
                return ((0xF7 ^ 0xB4) & ~(0x1A ^ 0x59)) != 0x0;
            }
        }
        else {
            llllllllllllIllIIllllIlIllIllIlI[llllllllllllIllIIllllIlIllIllIIl + llllllllllllIllIIllllIlIllIllIII * llllllllllllIllIIllllIlIlllIIlII] = llllllllllllIllIIllllIlIllIlIlII;
        }
        return GenLayerBiomeEdge.llIllIIlIlIlIl[0] != 0;
    }
    
    public GenLayerBiomeEdge(final long llllllllllllIllIIllllIllIIlIlIIl, final GenLayer llllllllllllIllIIllllIllIIlIIlIl) {
        super(llllllllllllIllIIllllIllIIlIlIIl);
        this.parent = llllllllllllIllIIllllIllIIlIIlIl;
    }
    
    private static boolean lIIlIllIllllIllI(final int llllllllllllIllIIllllIlIlIIlIIIl, final int llllllllllllIllIIllllIlIlIIlIIII) {
        return llllllllllllIllIIllllIlIlIIlIIIl >= llllllllllllIllIIllllIlIlIIlIIII;
    }
    
    private static boolean lIIlIllIllllIIll(final int llllllllllllIllIIllllIlIlIIIIllI) {
        return llllllllllllIllIIllllIlIlIIIIllI == 0;
    }
    
    private static boolean lIIlIllIllllIlll(final int llllllllllllIllIIllllIlIlIIIlIII) {
        return llllllllllllIllIIllllIlIlIIIlIII != 0;
    }
    
    @Override
    public int[] getInts(final int llllllllllllIllIIllllIllIIIIIIll, final int llllllllllllIllIIllllIllIIIlIlII, final int llllllllllllIllIIllllIllIIIlIIll, final int llllllllllllIllIIllllIllIIIlIIlI) {
        final int[] llllllllllllIllIIllllIllIIIlIIIl = this.parent.getInts(llllllllllllIllIIllllIllIIIIIIll - GenLayerBiomeEdge.llIllIIlIlIlIl[0], llllllllllllIllIIllllIllIIIlIlII - GenLayerBiomeEdge.llIllIIlIlIlIl[0], llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1], llllllllllllIllIIllllIllIIIlIIlI + GenLayerBiomeEdge.llIllIIlIlIlIl[1]);
        final int[] llllllllllllIllIIllllIllIIIlIIII = IntCache.getIntCache(llllllllllllIllIIllllIllIIIlIIll * llllllllllllIllIIllllIllIIIlIIlI);
        int llllllllllllIllIIllllIllIIIIllll = GenLayerBiomeEdge.llIllIIlIlIlIl[2];
        "".length();
        if (" ".length() < " ".length()) {
            return null;
        }
        while (!lIIlIllIllllIllI(llllllllllllIllIIllllIllIIIIllll, llllllllllllIllIIllllIllIIIlIIlI)) {
            int llllllllllllIllIIllllIllIIIIlllI = GenLayerBiomeEdge.llIllIIlIlIlIl[2];
            "".length();
            if ("   ".length() >= (131 + 177 - 274 + 147 ^ 135 + 78 - 196 + 160)) {
                return null;
            }
            while (!lIIlIllIllllIllI(llllllllllllIllIIllllIllIIIIlllI, llllllllllllIllIIllllIllIIIlIIll)) {
                this.initChunkSeed(llllllllllllIllIIllllIllIIIIlllI + llllllllllllIllIIllllIllIIIIIIll, llllllllllllIllIIllllIllIIIIllll + llllllllllllIllIIllllIllIIIlIlII);
                final int llllllllllllIllIIllllIllIIIIllIl = llllllllllllIllIIllllIllIIIlIIIl[llllllllllllIllIIllllIllIIIIlllI + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIllIIIIllll + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
                if (lIIlIllIllllIIll(this.replaceBiomeEdgeIfNecessary(llllllllllllIllIIllllIllIIIlIIIl, llllllllllllIllIIllllIllIIIlIIII, llllllllllllIllIIllllIllIIIIlllI, llllllllllllIllIIllllIllIIIIllll, llllllllllllIllIIllllIllIIIlIIll, llllllllllllIllIIllllIllIIIIllIl, BiomeGenBase.extremeHills.biomeID, BiomeGenBase.extremeHillsEdge.biomeID) ? 1 : 0) && lIIlIllIllllIIll(this.replaceBiomeEdge(llllllllllllIllIIllllIllIIIlIIIl, llllllllllllIllIIllllIllIIIlIIII, llllllllllllIllIIllllIllIIIIlllI, llllllllllllIllIIllllIllIIIIllll, llllllllllllIllIIllllIllIIIlIIll, llllllllllllIllIIllllIllIIIIllIl, BiomeGenBase.mesaPlateau_F.biomeID, BiomeGenBase.mesa.biomeID) ? 1 : 0) && lIIlIllIllllIIll(this.replaceBiomeEdge(llllllllllllIllIIllllIllIIIlIIIl, llllllllllllIllIIllllIllIIIlIIII, llllllllllllIllIIllllIllIIIIlllI, llllllllllllIllIIllllIllIIIIllll, llllllllllllIllIIllllIllIIIlIIll, llllllllllllIllIIllllIllIIIIllIl, BiomeGenBase.mesaPlateau.biomeID, BiomeGenBase.mesa.biomeID) ? 1 : 0) && lIIlIllIllllIIll(this.replaceBiomeEdge(llllllllllllIllIIllllIllIIIlIIIl, llllllllllllIllIIllllIllIIIlIIII, llllllllllllIllIIllllIllIIIIlllI, llllllllllllIllIIllllIllIIIIllll, llllllllllllIllIIllllIllIIIlIIll, llllllllllllIllIIllllIllIIIIllIl, BiomeGenBase.megaTaiga.biomeID, BiomeGenBase.taiga.biomeID) ? 1 : 0)) {
                    if (lIIlIllIllllIlII(llllllllllllIllIIllllIllIIIIllIl, BiomeGenBase.desert.biomeID)) {
                        final int llllllllllllIllIIllllIllIIIIllII = llllllllllllIllIIllllIllIIIlIIIl[llllllllllllIllIIllllIllIIIIlllI + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIllIIIIllll + GenLayerBiomeEdge.llIllIIlIlIlIl[0] - GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
                        final int llllllllllllIllIIllllIllIIIIlIll = llllllllllllIllIIllllIllIIIlIIIl[llllllllllllIllIIllllIllIIIIlllI + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIllIIIIllll + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
                        final int llllllllllllIllIIllllIllIIIIlIlI = llllllllllllIllIIllllIllIIIlIIIl[llllllllllllIllIIllllIllIIIIlllI + GenLayerBiomeEdge.llIllIIlIlIlIl[0] - GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIllIIIIllll + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
                        final int llllllllllllIllIIllllIllIIIIlIIl = llllllllllllIllIIllllIllIIIlIIIl[llllllllllllIllIIllllIllIIIIlllI + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIllIIIIllll + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
                        if (lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIllII, BiomeGenBase.icePlains.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIlIll, BiomeGenBase.icePlains.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIlIlI, BiomeGenBase.icePlains.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIlIIl, BiomeGenBase.icePlains.biomeID)) {
                            llllllllllllIllIIllllIllIIIlIIII[llllllllllllIllIIllllIllIIIIlllI + llllllllllllIllIIllllIllIIIIllll * llllllllllllIllIIllllIllIIIlIIll] = llllllllllllIllIIllllIllIIIIllIl;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIllIIllllIllIIIlIIII[llllllllllllIllIIllllIllIIIIlllI + llllllllllllIllIIllllIllIIIIllll * llllllllllllIllIIllllIllIIIlIIll] = BiomeGenBase.extremeHillsPlus.biomeID;
                            "".length();
                            if (((0xF ^ 0x48) & ~(0xEF ^ 0xA8)) >= " ".length()) {
                                return null;
                            }
                        }
                    }
                    else if (lIIlIllIllllIlII(llllllllllllIllIIllllIllIIIIllIl, BiomeGenBase.swampland.biomeID)) {
                        final int llllllllllllIllIIllllIllIIIIlIII = llllllllllllIllIIllllIllIIIlIIIl[llllllllllllIllIIllllIllIIIIlllI + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIllIIIIllll + GenLayerBiomeEdge.llIllIIlIlIlIl[0] - GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
                        final int llllllllllllIllIIllllIllIIIIIlll = llllllllllllIllIIllllIllIIIlIIIl[llllllllllllIllIIllllIllIIIIlllI + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIllIIIIllll + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
                        final int llllllllllllIllIIllllIllIIIIIllI = llllllllllllIllIIllllIllIIIlIIIl[llllllllllllIllIIllllIllIIIIlllI + GenLayerBiomeEdge.llIllIIlIlIlIl[0] - GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIllIIIIllll + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
                        final int llllllllllllIllIIllllIllIIIIIlIl = llllllllllllIllIIllllIllIIIlIIIl[llllllllllllIllIIllllIllIIIIlllI + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + (llllllllllllIllIIllllIllIIIIllll + GenLayerBiomeEdge.llIllIIlIlIlIl[0] + GenLayerBiomeEdge.llIllIIlIlIlIl[0]) * (llllllllllllIllIIllllIllIIIlIIll + GenLayerBiomeEdge.llIllIIlIlIlIl[1])];
                        if (lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIlIII, BiomeGenBase.desert.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIlll, BiomeGenBase.desert.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIllI, BiomeGenBase.desert.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIlIl, BiomeGenBase.desert.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIlIII, BiomeGenBase.coldTaiga.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIlll, BiomeGenBase.coldTaiga.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIllI, BiomeGenBase.coldTaiga.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIlIl, BiomeGenBase.coldTaiga.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIlIII, BiomeGenBase.icePlains.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIlll, BiomeGenBase.icePlains.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIllI, BiomeGenBase.icePlains.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIlIl, BiomeGenBase.icePlains.biomeID)) {
                            if (lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIlIII, BiomeGenBase.jungle.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIlIl, BiomeGenBase.jungle.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIlll, BiomeGenBase.jungle.biomeID) && lIIlIllIllllIlIl(llllllllllllIllIIllllIllIIIIIllI, BiomeGenBase.jungle.biomeID)) {
                                llllllllllllIllIIllllIllIIIlIIII[llllllllllllIllIIllllIllIIIIlllI + llllllllllllIllIIllllIllIIIIllll * llllllllllllIllIIllllIllIIIlIIll] = llllllllllllIllIIllllIllIIIIllIl;
                                "".length();
                                if (((0xBF ^ 0xA5) & ~(0x26 ^ 0x3C)) != 0x0) {
                                    return null;
                                }
                            }
                            else {
                                llllllllllllIllIIllllIllIIIlIIII[llllllllllllIllIIllllIllIIIIlllI + llllllllllllIllIIllllIllIIIIllll * llllllllllllIllIIllllIllIIIlIIll] = BiomeGenBase.jungleEdge.biomeID;
                                "".length();
                                if (" ".length() != " ".length()) {
                                    return null;
                                }
                            }
                        }
                        else {
                            llllllllllllIllIIllllIllIIIlIIII[llllllllllllIllIIllllIllIIIIlllI + llllllllllllIllIIllllIllIIIIllll * llllllllllllIllIIllllIllIIIlIIll] = BiomeGenBase.plains.biomeID;
                            "".length();
                            if (((0xDC ^ 0x82) & ~(0x59 ^ 0x7)) > 0) {
                                return null;
                            }
                        }
                    }
                    else {
                        llllllllllllIllIIllllIllIIIlIIII[llllllllllllIllIIllllIllIIIIlllI + llllllllllllIllIIllllIllIIIIllll * llllllllllllIllIIllllIllIIIlIIll] = llllllllllllIllIIllllIllIIIIllIl;
                    }
                }
                ++llllllllllllIllIIllllIllIIIIlllI;
            }
            ++llllllllllllIllIIllllIllIIIIllll;
        }
        return llllllllllllIllIIllllIllIIIlIIII;
    }
}
