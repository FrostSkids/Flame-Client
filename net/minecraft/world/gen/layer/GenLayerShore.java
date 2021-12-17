// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.BiomeGenMesa;
import net.minecraft.world.biome.BiomeGenJungle;
import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerShore extends GenLayer
{
    private static final /* synthetic */ int[] lIlIIlIIIllIll;
    
    private static boolean lllIIlIlIlIlIIl(final Object lllllllllllllIIIlllIIIllIllllIIl) {
        return lllllllllllllIIIlllIIIllIllllIIl != null;
    }
    
    public GenLayerShore(final long lllllllllllllIIIlllIIIlllllIlIlI, final GenLayer lllllllllllllIIIlllIIIlllllIlIIl) {
        super(lllllllllllllIIIlllIIIlllllIlIlI);
        this.parent = lllllllllllllIIIlllIIIlllllIlIIl;
    }
    
    private void func_151632_a(final int[] lllllllllllllIIIlllIIIlllIlIIIII, final int[] lllllllllllllIIIlllIIIlllIIlllll, final int lllllllllllllIIIlllIIIlllIIllllI, final int lllllllllllllIIIlllIIIlllIIlIIlI, final int lllllllllllllIIIlllIIIlllIIlIIIl, final int lllllllllllllIIIlllIIIlllIIlIIII, final int lllllllllllllIIIlllIIIlllIIIllll) {
        if (lllIIlIlIlIlIll(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIIlIIII) ? 1 : 0)) {
            lllllllllllllIIIlllIIIlllIIlllll[lllllllllllllIIIlllIIIlllIIllllI + lllllllllllllIIIlllIIIlllIIlIIlI * lllllllllllllIIIlllIIIlllIIlIIIl] = lllllllllllllIIIlllIIIlllIIlIIII;
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        else {
            final int lllllllllllllIIIlllIIIlllIIllIIl = lllllllllllllIIIlllIIIlllIlIIIII[lllllllllllllIIIlllIIIlllIIllllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIlllIIlIIlI + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIIlIIIl + GenLayerShore.lIlIIlIIIllIll[1])];
            final int lllllllllllllIIIlllIIIlllIIllIII = lllllllllllllIIIlllIIIlllIlIIIII[lllllllllllllIIIlllIIIlllIIllllI + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIlllIIlIIlI + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIIlIIIl + GenLayerShore.lIlIIlIIIllIll[1])];
            final int lllllllllllllIIIlllIIIlllIIlIlll = lllllllllllllIIIlllIIIlllIlIIIII[lllllllllllllIIIlllIIIlllIIllllI + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIlllIIlIIlI + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIIlIIIl + GenLayerShore.lIlIIlIIIllIll[1])];
            final int lllllllllllllIIIlllIIIlllIIlIllI = lllllllllllllIIIlllIIIlllIlIIIII[lllllllllllllIIIlllIIIlllIIllllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIlllIIlIIlI + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIIlIIIl + GenLayerShore.lIlIIlIIIllIll[1])];
            if (lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIIllIIl) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIIllIII) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIIlIlll) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIIlIllI) ? 1 : 0)) {
                lllllllllllllIIIlllIIIlllIIlllll[lllllllllllllIIIlllIIIlllIIllllI + lllllllllllllIIIlllIIIlllIIlIIlI * lllllllllllllIIIlllIIIlllIIlIIIl] = lllllllllllllIIIlllIIIlllIIlIIII;
                "".length();
                if (-" ".length() >= ((102 + 48 - 144 + 151 ^ 61 + 6 + 50 + 29) & (38 + 105 - 9 + 20 ^ 74 + 91 - 18 + 2 ^ -" ".length()))) {
                    return;
                }
            }
            else {
                lllllllllllllIIIlllIIIlllIIlllll[lllllllllllllIIIlllIIIlllIIllllI + lllllllllllllIIIlllIIIlllIIlIIlI * lllllllllllllIIIlllIIIlllIIlIIIl] = lllllllllllllIIIlllIIIlllIIIllll;
            }
        }
    }
    
    static {
        lllIIlIlIlIIllI();
    }
    
    private static void lllIIlIlIlIIllI() {
        (lIlIIlIIIllIll = new int[3])[0] = " ".length();
        GenLayerShore.lIlIIlIIIllIll[1] = "  ".length();
        GenLayerShore.lIlIIlIIIllIll[2] = ((0x2B ^ 0x77) & ~(0xDA ^ 0x86));
    }
    
    private static boolean lllIIlIlIlIlIII(final int lllllllllllllIIIlllIIIllIllIlllI, final int lllllllllllllIIIlllIIIllIllIllIl) {
        return lllllllllllllIIIlllIIIllIllIlllI != lllllllllllllIIIlllIIIllIllIllIl;
    }
    
    private static boolean lllIIlIlIlIIlll(final int lllllllllllllIIIlllIIIlllIIIIIII, final int lllllllllllllIIIlllIIIllIlllllll) {
        return lllllllllllllIIIlllIIIlllIIIIIII == lllllllllllllIIIlllIIIllIlllllll;
    }
    
    private static boolean lllIIlIlIlIlIll(final int lllllllllllllIIIlllIIIllIlllIIll) {
        return lllllllllllllIIIlllIIIllIlllIIll != 0;
    }
    
    private static boolean lllIIlIlIlIllII(final int lllllllllllllIIIlllIIIllIlllIIIl) {
        return lllllllllllllIIIlllIIIllIlllIIIl == 0;
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIIIlllIIIllllIlIlIl, final int lllllllllllllIIIlllIIIlllIlllIIl, final int lllllllllllllIIIlllIIIlllIlllIII, final int lllllllllllllIIIlllIIIllllIlIIlI) {
        final int[] lllllllllllllIIIlllIIIllllIlIIIl = this.parent.getInts(lllllllllllllIIIlllIIIllllIlIlIl - GenLayerShore.lIlIIlIIIllIll[0], lllllllllllllIIIlllIIIlllIlllIIl - GenLayerShore.lIlIIlIIIllIll[0], lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1], lllllllllllllIIIlllIIIllllIlIIlI + GenLayerShore.lIlIIlIIIllIll[1]);
        final int[] lllllllllllllIIIlllIIIllllIlIIII = IntCache.getIntCache(lllllllllllllIIIlllIIIlllIlllIII * lllllllllllllIIIlllIIIllllIlIIlI);
        int lllllllllllllIIIlllIIIllllIIllll = GenLayerShore.lIlIIlIIIllIll[2];
        "".length();
        if (" ".length() < 0) {
            return null;
        }
        while (!lllIIlIlIlIllIl(lllllllllllllIIIlllIIIllllIIllll, lllllllllllllIIIlllIIIllllIlIIlI)) {
            int lllllllllllllIIIlllIIIllllIIlllI = GenLayerShore.lIlIIlIIIllIll[2];
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
            while (!lllIIlIlIlIllIl(lllllllllllllIIIlllIIIllllIIlllI, lllllllllllllIIIlllIIIlllIlllIII)) {
                this.initChunkSeed(lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIlIlIl, lllllllllllllIIIlllIIIllllIIllll + lllllllllllllIIIlllIIIlllIlllIIl);
                final int lllllllllllllIIIlllIIIllllIIllIl = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                final BiomeGenBase lllllllllllllIIIlllIIIllllIIllII = BiomeGenBase.getBiome(lllllllllllllIIIlllIIIllllIIllIl);
                if (lllIIlIlIlIIlll(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.mushroomIsland.biomeID)) {
                    final int lllllllllllllIIIlllIIIllllIIlIll = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                    final int lllllllllllllIIIlllIIIllllIIlIlI = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                    final int lllllllllllllIIIlllIIIllllIIlIIl = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                    final int lllllllllllllIIIlllIIIllllIIlIII = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                    if (lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIlIll, BiomeGenBase.ocean.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIlIlI, BiomeGenBase.ocean.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIlIIl, BiomeGenBase.ocean.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIlIII, BiomeGenBase.ocean.biomeID)) {
                        lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = lllllllllllllIIIlllIIIllllIIllIl;
                        "".length();
                        if ((0x55 ^ 0x51) <= -" ".length()) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = BiomeGenBase.mushroomIslandShore.biomeID;
                        "".length();
                        if ("   ".length() <= 0) {
                            return null;
                        }
                    }
                }
                else if (lllIIlIlIlIlIIl(lllllllllllllIIIlllIIIllllIIllII) && lllIIlIlIlIlIlI(lllllllllllllIIIlllIIIllllIIllII.getBiomeClass(), BiomeGenJungle.class)) {
                    final int lllllllllllllIIIlllIIIllllIIIlll = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                    final int lllllllllllllIIIlllIIIllllIIIllI = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                    final int lllllllllllllIIIlllIIIllllIIIlIl = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                    final int lllllllllllllIIIlllIIIllllIIIlII = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                    if (lllIIlIlIlIlIll(this.func_151631_c(lllllllllllllIIIlllIIIllllIIIlll) ? 1 : 0) && lllIIlIlIlIlIll(this.func_151631_c(lllllllllllllIIIlllIIIllllIIIllI) ? 1 : 0) && lllIIlIlIlIlIll(this.func_151631_c(lllllllllllllIIIlllIIIllllIIIlIl) ? 1 : 0) && lllIIlIlIlIlIll(this.func_151631_c(lllllllllllllIIIlllIIIllllIIIlII) ? 1 : 0)) {
                        if (lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIllllIIIlll) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIllllIIIllI) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIllllIIIlIl) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIllllIIIlII) ? 1 : 0)) {
                            lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = lllllllllllllIIIlllIIIllllIIllIl;
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return null;
                            }
                        }
                        else {
                            lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = BiomeGenBase.beach.biomeID;
                            "".length();
                            if (-(0xF ^ 0xB) >= 0) {
                                return null;
                            }
                        }
                    }
                    else {
                        lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = BiomeGenBase.jungleEdge.biomeID;
                        "".length();
                        if ("  ".length() < " ".length()) {
                            return null;
                        }
                    }
                }
                else if (lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.extremeHills.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.extremeHillsPlus.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.extremeHillsEdge.biomeID)) {
                    if (lllIIlIlIlIlIIl(lllllllllllllIIIlllIIIllllIIllII) && lllIIlIlIlIlIll(lllllllllllllIIIlllIIIllllIIllII.isSnowyBiome() ? 1 : 0)) {
                        this.func_151632_a(lllllllllllllIIIlllIIIllllIlIIIl, lllllllllllllIIIlllIIIllllIlIIII, lllllllllllllIIIlllIIIllllIIlllI, lllllllllllllIIIlllIIIllllIIllll, lllllllllllllIIIlllIIIlllIlllIII, lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.coldBeach.biomeID);
                        "".length();
                        if (((0x2D ^ 0x20) & ~(0x8F ^ 0x82)) > " ".length()) {
                            return null;
                        }
                    }
                    else if (lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.mesa.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.mesaPlateau_F.biomeID)) {
                        if (lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.ocean.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.deepOcean.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.river.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.swampland.biomeID)) {
                            final int lllllllllllllIIIlllIIIllllIIIIll = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                            final int lllllllllllllIIIlllIIIllllIIIIlI = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                            final int lllllllllllllIIIlllIIIllllIIIIIl = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                            final int lllllllllllllIIIlllIIIllllIIIIII = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                            if (lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIllllIIIIll) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIllllIIIIlI) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIllllIIIIIl) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIllllIIIIII) ? 1 : 0)) {
                                lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = lllllllllllllIIIlllIIIllllIIllIl;
                                "".length();
                                if ((0xF0 ^ 0x94 ^ (0x3 ^ 0x63)) == 0x0) {
                                    return null;
                                }
                            }
                            else {
                                lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = BiomeGenBase.beach.biomeID;
                                "".length();
                                if (((0x5D ^ 0x4A) & ~(0xD4 ^ 0xC3)) < 0) {
                                    return null;
                                }
                            }
                        }
                        else {
                            lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = lllllllllllllIIIlllIIIllllIIllIl;
                            "".length();
                            if ("  ".length() < 0) {
                                return null;
                            }
                        }
                    }
                    else {
                        final int lllllllllllllIIIlllIIIlllIllllll = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                        final int lllllllllllllIIIlllIIIlllIlllllI = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                        final int lllllllllllllIIIlllIIIlllIllllIl = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] - GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                        final int lllllllllllllIIIlllIIIlllIllllII = lllllllllllllIIIlllIIIllllIlIIIl[lllllllllllllIIIlllIIIllllIIlllI + GenLayerShore.lIlIIlIIIllIll[0] + (lllllllllllllIIIlllIIIllllIIllll + GenLayerShore.lIlIIlIIIllIll[0] + GenLayerShore.lIlIIlIIIllIll[0]) * (lllllllllllllIIIlllIIIlllIlllIII + GenLayerShore.lIlIIlIIIllIll[1])];
                        if (lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIllllll) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIlllllI) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIllllIl) ? 1 : 0) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIllllII) ? 1 : 0)) {
                            if (lllIIlIlIlIlIll(this.func_151633_d(lllllllllllllIIIlllIIIlllIllllll) ? 1 : 0) && lllIIlIlIlIlIll(this.func_151633_d(lllllllllllllIIIlllIIIlllIlllllI) ? 1 : 0) && lllIIlIlIlIlIll(this.func_151633_d(lllllllllllllIIIlllIIIlllIllllIl) ? 1 : 0) && lllIIlIlIlIlIll(this.func_151633_d(lllllllllllllIIIlllIIIlllIllllII) ? 1 : 0)) {
                                lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = lllllllllllllIIIlllIIIllllIIllIl;
                                "".length();
                                if (" ".length() <= 0) {
                                    return null;
                                }
                            }
                            else {
                                lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = BiomeGenBase.desert.biomeID;
                                "".length();
                                if ("   ".length() < "   ".length()) {
                                    return null;
                                }
                            }
                        }
                        else {
                            lllllllllllllIIIlllIIIllllIlIIII[lllllllllllllIIIlllIIIllllIIlllI + lllllllllllllIIIlllIIIllllIIllll * lllllllllllllIIIlllIIIlllIlllIII] = lllllllllllllIIIlllIIIllllIIllIl;
                            "".length();
                            if (((0x2 ^ 0xC) & ~(0x5B ^ 0x55)) != 0x0) {
                                return null;
                            }
                        }
                    }
                }
                else {
                    this.func_151632_a(lllllllllllllIIIlllIIIllllIlIIIl, lllllllllllllIIIlllIIIllllIlIIII, lllllllllllllIIIlllIIIllllIIlllI, lllllllllllllIIIlllIIIllllIIllll, lllllllllllllIIIlllIIIlllIlllIII, lllllllllllllIIIlllIIIllllIIllIl, BiomeGenBase.stoneBeach.biomeID);
                }
                ++lllllllllllllIIIlllIIIllllIIlllI;
            }
            ++lllllllllllllIIIlllIIIllllIIllll;
        }
        return lllllllllllllIIIlllIIIllllIlIIII;
    }
    
    private static boolean lllIIlIlIlIllIl(final int lllllllllllllIIIlllIIIllIlllllII, final int lllllllllllllIIIlllIIIllIllllIll) {
        return lllllllllllllIIIlllIIIllIlllllII >= lllllllllllllIIIlllIIIllIllllIll;
    }
    
    private static boolean lllIIlIlIlIlIlI(final Object lllllllllllllIIIlllIIIllIlllIllI, final Object lllllllllllllIIIlllIIIllIlllIlIl) {
        return lllllllllllllIIIlllIIIllIlllIllI == lllllllllllllIIIlllIIIllIlllIlIl;
    }
    
    private boolean func_151631_c(final int lllllllllllllIIIlllIIIlllIIIlIII) {
        int n;
        if (lllIIlIlIlIlIIl(BiomeGenBase.getBiome(lllllllllllllIIIlllIIIlllIIIlIII)) && lllIIlIlIlIlIlI(BiomeGenBase.getBiome(lllllllllllllIIIlllIIIlllIIIlIII).getBiomeClass(), BiomeGenJungle.class)) {
            n = GenLayerShore.lIlIIlIIIllIll[0];
            "".length();
            if (" ".length() != " ".length()) {
                return ((0x9B ^ 0x9F ^ (0x4D ^ 0x7)) & (0x98 ^ 0xB2 ^ (0x31 ^ 0x55) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllIIlIlIlIlIII(lllllllllllllIIIlllIIIlllIIIlIII, BiomeGenBase.jungleEdge.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIlllIIIlIII, BiomeGenBase.jungle.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIlllIIIlIII, BiomeGenBase.jungleHills.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIlllIIIlIII, BiomeGenBase.forest.biomeID) && lllIIlIlIlIlIII(lllllllllllllIIIlllIIIlllIIIlIII, BiomeGenBase.taiga.biomeID) && lllIIlIlIlIllII(GenLayer.isBiomeOceanic(lllllllllllllIIIlllIIIlllIIIlIII) ? 1 : 0)) {
            n = GenLayerShore.lIlIIlIIIllIll[2];
            "".length();
            if (-" ".length() >= 0) {
                return ((0x1D ^ 0x31) & ~(0x36 ^ 0x1A)) != 0x0;
            }
        }
        else {
            n = GenLayerShore.lIlIIlIIIllIll[0];
        }
        return n != 0;
    }
    
    private boolean func_151633_d(final int lllllllllllllIIIlllIIIlllIIIIIll) {
        return BiomeGenBase.getBiome(lllllllllllllIIIlllIIIlllIIIIIll) instanceof BiomeGenMesa;
    }
}
