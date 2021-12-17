// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

public class GenLayerRemoveTooMuchOcean extends GenLayer
{
    private static final /* synthetic */ int[] lIIllIIllllllI;
    
    private static void llIllIIIIIIIIIl() {
        (lIIllIIllllllI = new int[3])[0] = " ".length();
        GenLayerRemoveTooMuchOcean.lIIllIIllllllI[1] = "  ".length();
        GenLayerRemoveTooMuchOcean.lIIllIIllllllI[2] = ((0x62 ^ 0x3E ^ (0x86 ^ 0x88)) & (95 + 160 - 245 + 195 ^ 38 + 119 - 101 + 103 ^ -" ".length()));
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIIlIlIlllIIIIllIIlI, final int lllllllllllllIIlIlIlllIIIIllIIIl, final int lllllllllllllIIlIlIlllIIIIllIIII, final int lllllllllllllIIlIlIlllIIIIIlllIl) {
        final int lllllllllllllIIlIlIlllIIIIlIlllI = lllllllllllllIIlIlIlllIIIIllIIlI - GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0];
        final int lllllllllllllIIlIlIlllIIIIlIllIl = lllllllllllllIIlIlIlllIIIIllIIIl - GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0];
        final int lllllllllllllIIlIlIlllIIIIlIllII = lllllllllllllIIlIlIlllIIIIllIIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[1];
        final int lllllllllllllIIlIlIlllIIIIlIlIll = lllllllllllllIIlIlIlllIIIIIlllIl + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[1];
        final int[] lllllllllllllIIlIlIlllIIIIlIlIlI = this.parent.getInts(lllllllllllllIIlIlIlllIIIIlIlllI, lllllllllllllIIlIlIlllIIIIlIllIl, lllllllllllllIIlIlIlllIIIIlIllII, lllllllllllllIIlIlIlllIIIIlIlIll);
        final int[] lllllllllllllIIlIlIlllIIIIlIlIIl = IntCache.getIntCache(lllllllllllllIIlIlIlllIIIIllIIII * lllllllllllllIIlIlIlllIIIIIlllIl);
        int lllllllllllllIIlIlIlllIIIIlIlIII = GenLayerRemoveTooMuchOcean.lIIllIIllllllI[2];
        "".length();
        if (((0xA0 ^ 0x80 ^ (0x3D ^ 0x5E)) & (180 + 84 - 112 + 92 ^ 104 + 145 - 197 + 131 ^ -" ".length())) > "  ".length()) {
            return null;
        }
        while (!llIllIIIIIIIIll(lllllllllllllIIlIlIlllIIIIlIlIII, lllllllllllllIIlIlIlllIIIIIlllIl)) {
            int lllllllllllllIIlIlIlllIIIIlIIlll = GenLayerRemoveTooMuchOcean.lIIllIIllllllI[2];
            "".length();
            if (((0x5 ^ 0x26 ^ (0x69 ^ 0x5A)) & (0xA ^ 0xC ^ (0x7F ^ 0x69) ^ -" ".length())) != 0x0) {
                return null;
            }
            while (!llIllIIIIIIIIll(lllllllllllllIIlIlIlllIIIIlIIlll, lllllllllllllIIlIlIlllIIIIllIIII)) {
                final int lllllllllllllIIlIlIlllIIIIlIIllI = lllllllllllllIIlIlIlllIIIIlIlIlI[lllllllllllllIIlIlIlllIIIIlIIlll + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0] + (lllllllllllllIIlIlIlllIIIIlIlIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0] - GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0]) * (lllllllllllllIIlIlIlllIIIIllIIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[1])];
                final int lllllllllllllIIlIlIlllIIIIlIIlIl = lllllllllllllIIlIlIlllIIIIlIlIlI[lllllllllllllIIlIlIlllIIIIlIIlll + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0] + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0] + (lllllllllllllIIlIlIlllIIIIlIlIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0]) * (lllllllllllllIIlIlIlllIIIIllIIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[1])];
                final int lllllllllllllIIlIlIlllIIIIlIIlII = lllllllllllllIIlIlIlllIIIIlIlIlI[lllllllllllllIIlIlIlllIIIIlIIlll + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0] - GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0] + (lllllllllllllIIlIlIlllIIIIlIlIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0]) * (lllllllllllllIIlIlIlllIIIIllIIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[1])];
                final int lllllllllllllIIlIlIlllIIIIlIIIll = lllllllllllllIIlIlIlllIIIIlIlIlI[lllllllllllllIIlIlIlllIIIIlIIlll + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0] + (lllllllllllllIIlIlIlllIIIIlIlIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0] + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0]) * (lllllllllllllIIlIlIlllIIIIllIIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[1])];
                final int lllllllllllllIIlIlIlllIIIIlIIIlI = lllllllllllllIIlIlIlllIIIIlIlIlI[lllllllllllllIIlIlIlllIIIIlIIlll + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0] + (lllllllllllllIIlIlIlllIIIIlIlIII + GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0]) * lllllllllllllIIlIlIlllIIIIlIllII];
                lllllllllllllIIlIlIlllIIIIlIlIIl[lllllllllllllIIlIlIlllIIIIlIIlll + lllllllllllllIIlIlIlllIIIIlIlIII * lllllllllllllIIlIlIlllIIIIllIIII] = lllllllllllllIIlIlIlllIIIIlIIIlI;
                this.initChunkSeed(lllllllllllllIIlIlIlllIIIIlIIlll + lllllllllllllIIlIlIlllIIIIllIIlI, lllllllllllllIIlIlIlllIIIIlIlIII + lllllllllllllIIlIlIlllIIIIllIIIl);
                if (llIllIIIIIIIIlI(lllllllllllllIIlIlIlllIIIIlIIIlI) && llIllIIIIIIIIlI(lllllllllllllIIlIlIlllIIIIlIIllI) && llIllIIIIIIIIlI(lllllllllllllIIlIlIlllIIIIlIIlIl) && llIllIIIIIIIIlI(lllllllllllllIIlIlIlllIIIIlIIlII) && llIllIIIIIIIIlI(lllllllllllllIIlIlIlllIIIIlIIIll) && llIllIIIIIIIIlI(this.nextInt(GenLayerRemoveTooMuchOcean.lIIllIIllllllI[1]))) {
                    lllllllllllllIIlIlIlllIIIIlIlIIl[lllllllllllllIIlIlIlllIIIIlIIlll + lllllllllllllIIlIlIlllIIIIlIlIII * lllllllllllllIIlIlIlllIIIIllIIII] = GenLayerRemoveTooMuchOcean.lIIllIIllllllI[0];
                }
                ++lllllllllllllIIlIlIlllIIIIlIIlll;
            }
            ++lllllllllllllIIlIlIlllIIIIlIlIII;
        }
        return lllllllllllllIIlIlIlllIIIIlIlIIl;
    }
    
    public GenLayerRemoveTooMuchOcean(final long lllllllllllllIIlIlIlllIIIlIIlIlI, final GenLayer lllllllllllllIIlIlIlllIIIlIIlIIl) {
        super(lllllllllllllIIlIlIlllIIIlIIlIlI);
        this.parent = lllllllllllllIIlIlIlllIIIlIIlIIl;
    }
    
    private static boolean llIllIIIIIIIIll(final int lllllllllllllIIlIlIlllIIIIIIllIl, final int lllllllllllllIIlIlIlllIIIIIIllII) {
        return lllllllllllllIIlIlIlllIIIIIIllIl >= lllllllllllllIIlIlIlllIIIIIIllII;
    }
    
    private static boolean llIllIIIIIIIIlI(final int lllllllllllllIIlIlIlllIIIIIIlIlI) {
        return lllllllllllllIIlIlIlllIIIIIIlIlI == 0;
    }
    
    static {
        llIllIIIIIIIIIl();
    }
}
