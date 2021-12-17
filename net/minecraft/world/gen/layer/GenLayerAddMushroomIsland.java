// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerAddMushroomIsland extends GenLayer
{
    private static final /* synthetic */ int[] lIlllIlllIllIl;
    
    public GenLayerAddMushroomIsland(final long llllllllllllIllllIllIlIllIllIllI, final GenLayer llllllllllllIllllIllIlIllIllIIlI) {
        super(llllllllllllIllllIllIlIllIllIllI);
        this.parent = llllllllllllIllllIllIlIllIllIIlI;
    }
    
    private static boolean lIIIIIlllIIIlIIl(final int llllllllllllIllllIllIlIlIllllIIl, final int llllllllllllIllllIllIlIlIllllIII) {
        return llllllllllllIllllIllIlIlIllllIIl >= llllllllllllIllllIllIlIlIllllIII;
    }
    
    @Override
    public int[] getInts(final int llllllllllllIllllIllIlIllIIllllI, final int llllllllllllIllllIllIlIllIIIlIll, final int llllllllllllIllllIllIlIllIIlllII, final int llllllllllllIllllIllIlIllIIIlIIl) {
        final int llllllllllllIllllIllIlIllIIllIlI = llllllllllllIllllIllIlIllIIllllI - GenLayerAddMushroomIsland.lIlllIlllIllIl[0];
        final int llllllllllllIllllIllIlIllIIllIIl = llllllllllllIllllIllIlIllIIIlIll - GenLayerAddMushroomIsland.lIlllIlllIllIl[0];
        final int llllllllllllIllllIllIlIllIIllIII = llllllllllllIllllIllIlIllIIlllII + GenLayerAddMushroomIsland.lIlllIlllIllIl[1];
        final int llllllllllllIllllIllIlIllIIlIlll = llllllllllllIllllIllIlIllIIIlIIl + GenLayerAddMushroomIsland.lIlllIlllIllIl[1];
        final int[] llllllllllllIllllIllIlIllIIlIllI = this.parent.getInts(llllllllllllIllllIllIlIllIIllIlI, llllllllllllIllllIllIlIllIIllIIl, llllllllllllIllllIllIlIllIIllIII, llllllllllllIllllIllIlIllIIlIlll);
        final int[] llllllllllllIllllIllIlIllIIlIlIl = IntCache.getIntCache(llllllllllllIllllIllIlIllIIlllII * llllllllllllIllllIllIlIllIIIlIIl);
        int llllllllllllIllllIllIlIllIIlIlII = GenLayerAddMushroomIsland.lIlllIlllIllIl[2];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIIIIlllIIIlIIl(llllllllllllIllllIllIlIllIIlIlII, llllllllllllIllllIllIlIllIIIlIIl)) {
            int llllllllllllIllllIllIlIllIIlIIll = GenLayerAddMushroomIsland.lIlllIlllIllIl[2];
            "".length();
            if ((0xAB ^ 0x8B ^ (0x3D ^ 0x18)) == 0x0) {
                return null;
            }
            while (!lIIIIIlllIIIlIIl(llllllllllllIllllIllIlIllIIlIIll, llllllllllllIllllIllIlIllIIlllII)) {
                final int llllllllllllIllllIllIlIllIIlIIlI = llllllllllllIllllIllIlIllIIlIllI[llllllllllllIllllIllIlIllIIlIIll + GenLayerAddMushroomIsland.lIlllIlllIllIl[2] + (llllllllllllIllllIllIlIllIIlIlII + GenLayerAddMushroomIsland.lIlllIlllIllIl[2]) * llllllllllllIllllIllIlIllIIllIII];
                final int llllllllllllIllllIllIlIllIIlIIIl = llllllllllllIllllIllIlIllIIlIllI[llllllllllllIllllIllIlIllIIlIIll + GenLayerAddMushroomIsland.lIlllIlllIllIl[1] + (llllllllllllIllllIllIlIllIIlIlII + GenLayerAddMushroomIsland.lIlllIlllIllIl[2]) * llllllllllllIllllIllIlIllIIllIII];
                final int llllllllllllIllllIllIlIllIIlIIII = llllllllllllIllllIllIlIllIIlIllI[llllllllllllIllllIllIlIllIIlIIll + GenLayerAddMushroomIsland.lIlllIlllIllIl[2] + (llllllllllllIllllIllIlIllIIlIlII + GenLayerAddMushroomIsland.lIlllIlllIllIl[1]) * llllllllllllIllllIllIlIllIIllIII];
                final int llllllllllllIllllIllIlIllIIIllll = llllllllllllIllllIllIlIllIIlIllI[llllllllllllIllllIllIlIllIIlIIll + GenLayerAddMushroomIsland.lIlllIlllIllIl[1] + (llllllllllllIllllIllIlIllIIlIlII + GenLayerAddMushroomIsland.lIlllIlllIllIl[1]) * llllllllllllIllllIllIlIllIIllIII];
                final int llllllllllllIllllIllIlIllIIIlllI = llllllllllllIllllIllIlIllIIlIllI[llllllllllllIllllIllIlIllIIlIIll + GenLayerAddMushroomIsland.lIlllIlllIllIl[0] + (llllllllllllIllllIllIlIllIIlIlII + GenLayerAddMushroomIsland.lIlllIlllIllIl[0]) * llllllllllllIllllIllIlIllIIllIII];
                this.initChunkSeed(llllllllllllIllllIllIlIllIIlIIll + llllllllllllIllllIllIlIllIIllllI, llllllllllllIllllIllIlIllIIlIlII + llllllllllllIllllIllIlIllIIIlIll);
                if (lIIIIIlllIIIlIII(llllllllllllIllllIllIlIllIIIlllI) && lIIIIIlllIIIlIII(llllllllllllIllllIllIlIllIIlIIlI) && lIIIIIlllIIIlIII(llllllllllllIllllIllIlIllIIlIIIl) && lIIIIIlllIIIlIII(llllllllllllIllllIllIlIllIIlIIII) && lIIIIIlllIIIlIII(llllllllllllIllllIllIlIllIIIllll) && lIIIIIlllIIIlIII(this.nextInt(GenLayerAddMushroomIsland.lIlllIlllIllIl[3]))) {
                    llllllllllllIllllIllIlIllIIlIlIl[llllllllllllIllllIllIlIllIIlIIll + llllllllllllIllllIllIlIllIIlIlII * llllllllllllIllllIllIlIllIIlllII] = BiomeGenBase.mushroomIsland.biomeID;
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return null;
                    }
                }
                else {
                    llllllllllllIllllIllIlIllIIlIlIl[llllllllllllIllllIllIlIllIIlIIll + llllllllllllIllllIllIlIllIIlIlII * llllllllllllIllllIllIlIllIIlllII] = llllllllllllIllllIllIlIllIIIlllI;
                }
                ++llllllllllllIllllIllIlIllIIlIIll;
            }
            ++llllllllllllIllllIllIlIllIIlIlII;
        }
        return llllllllllllIllllIllIlIllIIlIlIl;
    }
    
    private static void lIIIIIlllIIIIlll() {
        (lIlllIlllIllIl = new int[4])[0] = " ".length();
        GenLayerAddMushroomIsland.lIlllIlllIllIl[1] = "  ".length();
        GenLayerAddMushroomIsland.lIlllIlllIllIl[2] = ((95 + 75 - 89 + 64 ^ 28 + 70 + 15 + 35) & (0xC9 ^ 0xC7 ^ (0x36 ^ 0x3D) ^ -" ".length()));
        GenLayerAddMushroomIsland.lIlllIlllIllIl[3] = (0xE7 ^ 0x83);
    }
    
    private static boolean lIIIIIlllIIIlIII(final int llllllllllllIllllIllIlIlIlllIllI) {
        return llllllllllllIllllIllIlIlIlllIllI == 0;
    }
    
    static {
        lIIIIIlllIIIIlll();
    }
}
