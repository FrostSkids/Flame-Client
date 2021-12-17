// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerRiver extends GenLayer
{
    private static final /* synthetic */ int[] llllIlIlllIll;
    
    static {
        lIlIlIlIllIIlII();
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIlIllIlIlIIIIlllIII, final int lllllllllllllIlIllIlIlIIIIllIlll, final int lllllllllllllIlIllIlIlIIIIlIIlII, final int lllllllllllllIlIllIlIlIIIIlIIIll) {
        final int lllllllllllllIlIllIlIlIIIIllIlII = lllllllllllllIlIllIlIlIIIIlllIII - GenLayerRiver.llllIlIlllIll[0];
        final int lllllllllllllIlIllIlIlIIIIllIIll = lllllllllllllIlIllIlIlIIIIllIlll - GenLayerRiver.llllIlIlllIll[0];
        final int lllllllllllllIlIllIlIlIIIIllIIlI = lllllllllllllIlIllIlIlIIIIlIIlII + GenLayerRiver.llllIlIlllIll[1];
        final int lllllllllllllIlIllIlIlIIIIllIIIl = lllllllllllllIlIllIlIlIIIIlIIIll + GenLayerRiver.llllIlIlllIll[1];
        final int[] lllllllllllllIlIllIlIlIIIIllIIII = this.parent.getInts(lllllllllllllIlIllIlIlIIIIllIlII, lllllllllllllIlIllIlIlIIIIllIIll, lllllllllllllIlIllIlIlIIIIllIIlI, lllllllllllllIlIllIlIlIIIIllIIIl);
        final int[] lllllllllllllIlIllIlIlIIIIlIllll = IntCache.getIntCache(lllllllllllllIlIllIlIlIIIIlIIlII * lllllllllllllIlIllIlIlIIIIlIIIll);
        int lllllllllllllIlIllIlIlIIIIlIlllI = GenLayerRiver.llllIlIlllIll[2];
        "".length();
        if (-" ".length() >= "  ".length()) {
            return null;
        }
        while (!lIlIlIlIllIIllI(lllllllllllllIlIllIlIlIIIIlIlllI, lllllllllllllIlIllIlIlIIIIlIIIll)) {
            int lllllllllllllIlIllIlIlIIIIlIllIl = GenLayerRiver.llllIlIlllIll[2];
            "".length();
            if ((0x11 ^ 0x6 ^ (0xAF ^ 0xBC)) <= "   ".length()) {
                return null;
            }
            while (!lIlIlIlIllIIllI(lllllllllllllIlIllIlIlIIIIlIllIl, lllllllllllllIlIllIlIlIIIIlIIlII)) {
                final int lllllllllllllIlIllIlIlIIIIlIllII = this.func_151630_c(lllllllllllllIlIllIlIlIIIIllIIII[lllllllllllllIlIllIlIlIIIIlIllIl + GenLayerRiver.llllIlIlllIll[2] + (lllllllllllllIlIllIlIlIIIIlIlllI + GenLayerRiver.llllIlIlllIll[0]) * lllllllllllllIlIllIlIlIIIIllIIlI]);
                final int lllllllllllllIlIllIlIlIIIIlIlIll = this.func_151630_c(lllllllllllllIlIllIlIlIIIIllIIII[lllllllllllllIlIllIlIlIIIIlIllIl + GenLayerRiver.llllIlIlllIll[1] + (lllllllllllllIlIllIlIlIIIIlIlllI + GenLayerRiver.llllIlIlllIll[0]) * lllllllllllllIlIllIlIlIIIIllIIlI]);
                final int lllllllllllllIlIllIlIlIIIIlIlIlI = this.func_151630_c(lllllllllllllIlIllIlIlIIIIllIIII[lllllllllllllIlIllIlIlIIIIlIllIl + GenLayerRiver.llllIlIlllIll[0] + (lllllllllllllIlIllIlIlIIIIlIlllI + GenLayerRiver.llllIlIlllIll[2]) * lllllllllllllIlIllIlIlIIIIllIIlI]);
                final int lllllllllllllIlIllIlIlIIIIlIlIIl = this.func_151630_c(lllllllllllllIlIllIlIlIIIIllIIII[lllllllllllllIlIllIlIlIIIIlIllIl + GenLayerRiver.llllIlIlllIll[0] + (lllllllllllllIlIllIlIlIIIIlIlllI + GenLayerRiver.llllIlIlllIll[1]) * lllllllllllllIlIllIlIlIIIIllIIlI]);
                final int lllllllllllllIlIllIlIlIIIIlIlIII = this.func_151630_c(lllllllllllllIlIllIlIlIIIIllIIII[lllllllllllllIlIllIlIlIIIIlIllIl + GenLayerRiver.llllIlIlllIll[0] + (lllllllllllllIlIllIlIlIIIIlIlllI + GenLayerRiver.llllIlIlllIll[0]) * lllllllllllllIlIllIlIlIIIIllIIlI]);
                if (lIlIlIlIllIIlIl(lllllllllllllIlIllIlIlIIIIlIlIII, lllllllllllllIlIllIlIlIIIIlIllII) && lIlIlIlIllIIlIl(lllllllllllllIlIllIlIlIIIIlIlIII, lllllllllllllIlIllIlIlIIIIlIlIlI) && lIlIlIlIllIIlIl(lllllllllllllIlIllIlIlIIIIlIlIII, lllllllllllllIlIllIlIlIIIIlIlIll) && lIlIlIlIllIIlIl(lllllllllllllIlIllIlIlIIIIlIlIII, lllllllllllllIlIllIlIlIIIIlIlIIl)) {
                    lllllllllllllIlIllIlIlIIIIlIllll[lllllllllllllIlIllIlIlIIIIlIllIl + lllllllllllllIlIllIlIlIIIIlIlllI * lllllllllllllIlIllIlIlIIIIlIIlII] = GenLayerRiver.llllIlIlllIll[3];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIlIllIlIlIIIIlIllll[lllllllllllllIlIllIlIlIIIIlIllIl + lllllllllllllIlIllIlIlIIIIlIlllI * lllllllllllllIlIllIlIlIIIIlIIlII] = BiomeGenBase.river.biomeID;
                }
                ++lllllllllllllIlIllIlIlIIIIlIllIl;
            }
            ++lllllllllllllIlIllIlIlIIIIlIlllI;
        }
        return lllllllllllllIlIllIlIlIIIIlIllll;
    }
    
    private static boolean lIlIlIlIllIIllI(final int lllllllllllllIlIllIlIlIIIIIIlIll, final int lllllllllllllIlIllIlIlIIIIIIlIlI) {
        return lllllllllllllIlIllIlIlIIIIIIlIll >= lllllllllllllIlIllIlIlIIIIIIlIlI;
    }
    
    private static void lIlIlIlIllIIlII() {
        (llllIlIlllIll = new int[4])[0] = " ".length();
        GenLayerRiver.llllIlIlllIll[1] = "  ".length();
        GenLayerRiver.llllIlIlllIll[2] = ((0xE2 ^ 0xC0) & ~(0x53 ^ 0x71));
        GenLayerRiver.llllIlIlllIll[3] = -" ".length();
    }
    
    public GenLayerRiver(final long lllllllllllllIlIllIlIlIIIlIIllIl, final GenLayer lllllllllllllIlIllIlIlIIIlIIllll) {
        super(lllllllllllllIlIllIlIlIIIlIIllIl);
        super.parent = lllllllllllllIlIllIlIlIIIlIIllll;
    }
    
    private int func_151630_c(final int lllllllllllllIlIllIlIlIIIIIlIIlI) {
        int n;
        if (lIlIlIlIllIIllI(lllllllllllllIlIllIlIlIIIIIlIIlI, GenLayerRiver.llllIlIlllIll[1])) {
            n = GenLayerRiver.llllIlIlllIll[1] + (lllllllllllllIlIllIlIlIIIIIlIIlI & GenLayerRiver.llllIlIlllIll[0]);
            "".length();
            if (((0x3A ^ 0x1F) & ~(0xE3 ^ 0xC6)) != 0x0) {
                return (0x32 ^ 0x78) & ~(0xB ^ 0x41);
            }
        }
        else {
            n = lllllllllllllIlIllIlIlIIIIIlIIlI;
        }
        return n;
    }
    
    private static boolean lIlIlIlIllIIlIl(final int lllllllllllllIlIllIlIlIIIIIIllll, final int lllllllllllllIlIllIlIlIIIIIIlllI) {
        return lllllllllllllIlIllIlIlIIIIIIllll == lllllllllllllIlIllIlIlIIIIIIlllI;
    }
}
