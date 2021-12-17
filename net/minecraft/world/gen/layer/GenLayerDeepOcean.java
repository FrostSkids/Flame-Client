// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerDeepOcean extends GenLayer
{
    private static final /* synthetic */ int[] llIllIlIlllIlI;
    
    private static boolean lIIllIIIIIIlIIlI(final int llllllllllllIllIIllIlIIIlIlIlIll, final int llllllllllllIllIIllIlIIIlIlIlIlI) {
        return llllllllllllIllIIllIlIIIlIlIlIll >= llllllllllllIllIIllIlIIIlIlIlIlI;
    }
    
    private static void lIIllIIIIIIIllll() {
        (llIllIlIlllIlI = new int[4])[0] = " ".length();
        GenLayerDeepOcean.llIllIlIlllIlI[1] = "  ".length();
        GenLayerDeepOcean.llIllIlIlllIlI[2] = ((0x11 ^ 0x73 ^ (0xCD ^ 0x8E)) & (0x53 ^ 0x3C ^ (0xF0 ^ 0xBE) ^ -" ".length()));
        GenLayerDeepOcean.llIllIlIlllIlI[3] = "   ".length();
    }
    
    private static boolean lIIllIIIIIIlIIIl(final int llllllllllllIllIIllIlIIIlIlIIlll, final int llllllllllllIllIIllIlIIIlIlIIllI) {
        return llllllllllllIllIIllIlIIIlIlIIlll > llllllllllllIllIIllIlIIIlIlIIllI;
    }
    
    @Override
    public int[] getInts(final int llllllllllllIllIIllIlIIIllIlIIlI, final int llllllllllllIllIIllIlIIIllIlIIIl, final int llllllllllllIllIIllIlIIIllIlIIII, final int llllllllllllIllIIllIlIIIlIllllII) {
        final int llllllllllllIllIIllIlIIIllIIlllI = llllllllllllIllIIllIlIIIllIlIIlI - GenLayerDeepOcean.llIllIlIlllIlI[0];
        final int llllllllllllIllIIllIlIIIllIIllIl = llllllllllllIllIIllIlIIIllIlIIIl - GenLayerDeepOcean.llIllIlIlllIlI[0];
        final int llllllllllllIllIIllIlIIIllIIllII = llllllllllllIllIIllIlIIIllIlIIII + GenLayerDeepOcean.llIllIlIlllIlI[1];
        final int llllllllllllIllIIllIlIIIllIIlIll = llllllllllllIllIIllIlIIIlIllllII + GenLayerDeepOcean.llIllIlIlllIlI[1];
        final int[] llllllllllllIllIIllIlIIIllIIlIlI = this.parent.getInts(llllllllllllIllIIllIlIIIllIIlllI, llllllllllllIllIIllIlIIIllIIllIl, llllllllllllIllIIllIlIIIllIIllII, llllllllllllIllIIllIlIIIllIIlIll);
        final int[] llllllllllllIllIIllIlIIIllIIlIIl = IntCache.getIntCache(llllllllllllIllIIllIlIIIllIlIIII * llllllllllllIllIIllIlIIIlIllllII);
        int llllllllllllIllIIllIlIIIllIIlIII = GenLayerDeepOcean.llIllIlIlllIlI[2];
        "".length();
        if (" ".length() == -" ".length()) {
            return null;
        }
        while (!lIIllIIIIIIlIIlI(llllllllllllIllIIllIlIIIllIIlIII, llllllllllllIllIIllIlIIIlIllllII)) {
            int llllllllllllIllIIllIlIIIllIIIlll = GenLayerDeepOcean.llIllIlIlllIlI[2];
            "".length();
            if (null != null) {
                return null;
            }
            while (!lIIllIIIIIIlIIlI(llllllllllllIllIIllIlIIIllIIIlll, llllllllllllIllIIllIlIIIllIlIIII)) {
                final int llllllllllllIllIIllIlIIIllIIIllI = llllllllllllIllIIllIlIIIllIIlIlI[llllllllllllIllIIllIlIIIllIIIlll + GenLayerDeepOcean.llIllIlIlllIlI[0] + (llllllllllllIllIIllIlIIIllIIlIII + GenLayerDeepOcean.llIllIlIlllIlI[0] - GenLayerDeepOcean.llIllIlIlllIlI[0]) * (llllllllllllIllIIllIlIIIllIlIIII + GenLayerDeepOcean.llIllIlIlllIlI[1])];
                final int llllllllllllIllIIllIlIIIllIIIlIl = llllllllllllIllIIllIlIIIllIIlIlI[llllllllllllIllIIllIlIIIllIIIlll + GenLayerDeepOcean.llIllIlIlllIlI[0] + GenLayerDeepOcean.llIllIlIlllIlI[0] + (llllllllllllIllIIllIlIIIllIIlIII + GenLayerDeepOcean.llIllIlIlllIlI[0]) * (llllllllllllIllIIllIlIIIllIlIIII + GenLayerDeepOcean.llIllIlIlllIlI[1])];
                final int llllllllllllIllIIllIlIIIllIIIlII = llllllllllllIllIIllIlIIIllIIlIlI[llllllllllllIllIIllIlIIIllIIIlll + GenLayerDeepOcean.llIllIlIlllIlI[0] - GenLayerDeepOcean.llIllIlIlllIlI[0] + (llllllllllllIllIIllIlIIIllIIlIII + GenLayerDeepOcean.llIllIlIlllIlI[0]) * (llllllllllllIllIIllIlIIIllIlIIII + GenLayerDeepOcean.llIllIlIlllIlI[1])];
                final int llllllllllllIllIIllIlIIIllIIIIll = llllllllllllIllIIllIlIIIllIIlIlI[llllllllllllIllIIllIlIIIllIIIlll + GenLayerDeepOcean.llIllIlIlllIlI[0] + (llllllllllllIllIIllIlIIIllIIlIII + GenLayerDeepOcean.llIllIlIlllIlI[0] + GenLayerDeepOcean.llIllIlIlllIlI[0]) * (llllllllllllIllIIllIlIIIllIlIIII + GenLayerDeepOcean.llIllIlIlllIlI[1])];
                final int llllllllllllIllIIllIlIIIllIIIIlI = llllllllllllIllIIllIlIIIllIIlIlI[llllllllllllIllIIllIlIIIllIIIlll + GenLayerDeepOcean.llIllIlIlllIlI[0] + (llllllllllllIllIIllIlIIIllIIlIII + GenLayerDeepOcean.llIllIlIlllIlI[0]) * llllllllllllIllIIllIlIIIllIIllII];
                int llllllllllllIllIIllIlIIIllIIIIIl = GenLayerDeepOcean.llIllIlIlllIlI[2];
                if (lIIllIIIIIIlIIII(llllllllllllIllIIllIlIIIllIIIllI)) {
                    ++llllllllllllIllIIllIlIIIllIIIIIl;
                }
                if (lIIllIIIIIIlIIII(llllllllllllIllIIllIlIIIllIIIlIl)) {
                    ++llllllllllllIllIIllIlIIIllIIIIIl;
                }
                if (lIIllIIIIIIlIIII(llllllllllllIllIIllIlIIIllIIIlII)) {
                    ++llllllllllllIllIIllIlIIIllIIIIIl;
                }
                if (lIIllIIIIIIlIIII(llllllllllllIllIIllIlIIIllIIIIll)) {
                    ++llllllllllllIllIIllIlIIIllIIIIIl;
                }
                if (lIIllIIIIIIlIIII(llllllllllllIllIIllIlIIIllIIIIlI) && lIIllIIIIIIlIIIl(llllllllllllIllIIllIlIIIllIIIIIl, GenLayerDeepOcean.llIllIlIlllIlI[3])) {
                    llllllllllllIllIIllIlIIIllIIlIIl[llllllllllllIllIIllIlIIIllIIIlll + llllllllllllIllIIllIlIIIllIIlIII * llllllllllllIllIIllIlIIIllIlIIII] = BiomeGenBase.deepOcean.biomeID;
                    "".length();
                    if (-(0x43 ^ 0x1C ^ (0x5E ^ 0x5)) >= 0) {
                        return null;
                    }
                }
                else {
                    llllllllllllIllIIllIlIIIllIIlIIl[llllllllllllIllIIllIlIIIllIIIlll + llllllllllllIllIIllIlIIIllIIlIII * llllllllllllIllIIllIlIIIllIlIIII] = llllllllllllIllIIllIlIIIllIIIIlI;
                }
                ++llllllllllllIllIIllIlIIIllIIIlll;
            }
            ++llllllllllllIllIIllIlIIIllIIlIII;
        }
        return llllllllllllIllIIllIlIIIllIIlIIl;
    }
    
    public GenLayerDeepOcean(final long llllllllllllIllIIllIlIIIlllIlIll, final GenLayer llllllllllllIllIIllIlIIIlllIIlll) {
        super(llllllllllllIllIIllIlIIIlllIlIll);
        this.parent = llllllllllllIllIIllIlIIIlllIIlll;
    }
    
    static {
        lIIllIIIIIIIllll();
    }
    
    private static boolean lIIllIIIIIIlIIII(final int llllllllllllIllIIllIlIIIlIlIIlII) {
        return llllllllllllIllIIllIlIIIlIlIIlII == 0;
    }
}
