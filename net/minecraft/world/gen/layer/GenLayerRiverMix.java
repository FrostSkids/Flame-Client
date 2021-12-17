// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerRiverMix extends GenLayer
{
    private static final /* synthetic */ int[] lIIlIllIIlllII;
    private /* synthetic */ GenLayer biomePatternGeneratorChain;
    private /* synthetic */ GenLayer riverPatternGeneratorChain;
    
    static {
        llIlIIlIIlIIlll();
    }
    
    private static void llIlIIlIIlIIlll() {
        (lIIlIllIIlllII = new int[2])[0] = ((0xB6 ^ 0xB3) & ~(0xB9 ^ 0xBC));
        GenLayerRiverMix.lIIlIllIIlllII[1] = 97 + 219 - 113 + 52;
    }
    
    private static boolean llIlIIlIIlIlIII(final int lllllllllllllIIllIIlIIllIIIIIIIl, final int lllllllllllllIIllIIlIIllIIIIIIII) {
        return lllllllllllllIIllIIlIIllIIIIIIIl != lllllllllllllIIllIIlIIllIIIIIIII;
    }
    
    @Override
    public void initWorldGenSeed(final long lllllllllllllIIllIIlIIllIIlIIlll) {
        this.biomePatternGeneratorChain.initWorldGenSeed(lllllllllllllIIllIIlIIllIIlIIlll);
        this.riverPatternGeneratorChain.initWorldGenSeed(lllllllllllllIIllIIlIIllIIlIIlll);
        super.initWorldGenSeed(lllllllllllllIIllIIlIIllIIlIIlll);
    }
    
    private static boolean llIlIIlIIlIlIll(final int lllllllllllllIIllIIlIIllIIIIIlIl, final int lllllllllllllIIllIIlIIllIIIIIlII) {
        return lllllllllllllIIllIIlIIllIIIIIlIl >= lllllllllllllIIllIIlIIllIIIIIlII;
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIIllIIlIIllIIIlllII, final int lllllllllllllIIllIIlIIllIIIllIll, final int lllllllllllllIIllIIlIIllIIIlIIIl, final int lllllllllllllIIllIIlIIllIIIlIIII) {
        final int[] lllllllllllllIIllIIlIIllIIIllIII = this.biomePatternGeneratorChain.getInts(lllllllllllllIIllIIlIIllIIIlllII, lllllllllllllIIllIIlIIllIIIllIll, lllllllllllllIIllIIlIIllIIIlIIIl, lllllllllllllIIllIIlIIllIIIlIIII);
        final int[] lllllllllllllIIllIIlIIllIIIlIlll = this.riverPatternGeneratorChain.getInts(lllllllllllllIIllIIlIIllIIIlllII, lllllllllllllIIllIIlIIllIIIllIll, lllllllllllllIIllIIlIIllIIIlIIIl, lllllllllllllIIllIIlIIllIIIlIIII);
        final int[] lllllllllllllIIllIIlIIllIIIlIllI = IntCache.getIntCache(lllllllllllllIIllIIlIIllIIIlIIIl * lllllllllllllIIllIIlIIllIIIlIIII);
        int lllllllllllllIIllIIlIIllIIIlIlIl = GenLayerRiverMix.lIIlIllIIlllII[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIlIIlIIlIlIll(lllllllllllllIIllIIlIIllIIIlIlIl, lllllllllllllIIllIIlIIllIIIlIIIl * lllllllllllllIIllIIlIIllIIIlIIII)) {
            if (llIlIIlIIlIlIII(lllllllllllllIIllIIlIIllIIIllIII[lllllllllllllIIllIIlIIllIIIlIlIl], BiomeGenBase.ocean.biomeID) && llIlIIlIIlIlIII(lllllllllllllIIllIIlIIllIIIllIII[lllllllllllllIIllIIlIIllIIIlIlIl], BiomeGenBase.deepOcean.biomeID)) {
                if (llIlIIlIIlIlIlI(lllllllllllllIIllIIlIIllIIIlIlll[lllllllllllllIIllIIlIIllIIIlIlIl], BiomeGenBase.river.biomeID)) {
                    if (llIlIIlIIlIlIlI(lllllllllllllIIllIIlIIllIIIllIII[lllllllllllllIIllIIlIIllIIIlIlIl], BiomeGenBase.icePlains.biomeID)) {
                        lllllllllllllIIllIIlIIllIIIlIllI[lllllllllllllIIllIIlIIllIIIlIlIl] = BiomeGenBase.frozenRiver.biomeID;
                        "".length();
                        if ((0x71 ^ 0x75) < 0) {
                            return null;
                        }
                    }
                    else if (llIlIIlIIlIlIII(lllllllllllllIIllIIlIIllIIIllIII[lllllllllllllIIllIIlIIllIIIlIlIl], BiomeGenBase.mushroomIsland.biomeID) && llIlIIlIIlIlIII(lllllllllllllIIllIIlIIllIIIllIII[lllllllllllllIIllIIlIIllIIIlIlIl], BiomeGenBase.mushroomIslandShore.biomeID)) {
                        lllllllllllllIIllIIlIIllIIIlIllI[lllllllllllllIIllIIlIIllIIIlIlIl] = (lllllllllllllIIllIIlIIllIIIlIlll[lllllllllllllIIllIIlIIllIIIlIlIl] & GenLayerRiverMix.lIIlIllIIlllII[1]);
                        "".length();
                        if ("   ".length() > (0x4E ^ 0x4A)) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIllIIlIIllIIIlIllI[lllllllllllllIIllIIlIIllIIIlIlIl] = BiomeGenBase.mushroomIslandShore.biomeID;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                }
                else {
                    lllllllllllllIIllIIlIIllIIIlIllI[lllllllllllllIIllIIlIIllIIIlIlIl] = lllllllllllllIIllIIlIIllIIIllIII[lllllllllllllIIllIIlIIllIIIlIlIl];
                    "".length();
                    if (" ".length() <= 0) {
                        return null;
                    }
                }
            }
            else {
                lllllllllllllIIllIIlIIllIIIlIllI[lllllllllllllIIllIIlIIllIIIlIlIl] = lllllllllllllIIllIIlIIllIIIllIII[lllllllllllllIIllIIlIIllIIIlIlIl];
            }
            ++lllllllllllllIIllIIlIIllIIIlIlIl;
        }
        return lllllllllllllIIllIIlIIllIIIlIllI;
    }
    
    private static boolean llIlIIlIIlIlIlI(final int lllllllllllllIIllIIlIIllIIIIlIIl, final int lllllllllllllIIllIIlIIllIIIIlIII) {
        return lllllllllllllIIllIIlIIllIIIIlIIl == lllllllllllllIIllIIlIIllIIIIlIII;
    }
    
    public GenLayerRiverMix(final long lllllllllllllIIllIIlIIllIIlIllll, final GenLayer lllllllllllllIIllIIlIIllIIllIIlI, final GenLayer lllllllllllllIIllIIlIIllIIlIllIl) {
        super(lllllllllllllIIllIIlIIllIIlIllll);
        this.biomePatternGeneratorChain = lllllllllllllIIllIIlIIllIIllIIlI;
        this.riverPatternGeneratorChain = lllllllllllllIIllIIlIIllIIlIllIl;
    }
}
