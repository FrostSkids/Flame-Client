// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

public class GenLayerAddSnow extends GenLayer
{
    private static final /* synthetic */ int[] lIIllIlIIlIIll;
    
    public GenLayerAddSnow(final long lllllllllllllIIlIlIlIllllllIIIIl, final GenLayer lllllllllllllIIlIlIlIllllllIIIII) {
        super(lllllllllllllIIlIlIlIllllllIIIIl);
        this.parent = lllllllllllllIIlIlIlIllllllIIIII;
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIIlIlIlIlllllIIllll, final int lllllllllllllIIlIlIlIlllllIIlllI, final int lllllllllllllIIlIlIlIllllIlllllI, final int lllllllllllllIIlIlIlIllllIllllIl) {
        final int lllllllllllllIIlIlIlIlllllIIlIll = lllllllllllllIIlIlIlIlllllIIllll - GenLayerAddSnow.lIIllIlIIlIIll[0];
        final int lllllllllllllIIlIlIlIlllllIIlIlI = lllllllllllllIIlIlIlIlllllIIlllI - GenLayerAddSnow.lIIllIlIIlIIll[0];
        final int lllllllllllllIIlIlIlIlllllIIlIIl = lllllllllllllIIlIlIlIllllIlllllI + GenLayerAddSnow.lIIllIlIIlIIll[1];
        final int lllllllllllllIIlIlIlIlllllIIlIII = lllllllllllllIIlIlIlIllllIllllIl + GenLayerAddSnow.lIIllIlIIlIIll[1];
        final int[] lllllllllllllIIlIlIlIlllllIIIlll = this.parent.getInts(lllllllllllllIIlIlIlIlllllIIlIll, lllllllllllllIIlIlIlIlllllIIlIlI, lllllllllllllIIlIlIlIlllllIIlIIl, lllllllllllllIIlIlIlIlllllIIlIII);
        final int[] lllllllllllllIIlIlIlIlllllIIIllI = IntCache.getIntCache(lllllllllllllIIlIlIlIllllIlllllI * lllllllllllllIIlIlIlIllllIllllIl);
        int lllllllllllllIIlIlIlIlllllIIIlIl = GenLayerAddSnow.lIIllIlIIlIIll[2];
        "".length();
        if ("   ".length() <= "  ".length()) {
            return null;
        }
        while (!llIllIIIlIIlIIl(lllllllllllllIIlIlIlIlllllIIIlIl, lllllllllllllIIlIlIlIllllIllllIl)) {
            int lllllllllllllIIlIlIlIlllllIIIlII = GenLayerAddSnow.lIIllIlIIlIIll[2];
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
            while (!llIllIIIlIIlIIl(lllllllllllllIIlIlIlIlllllIIIlII, lllllllllllllIIlIlIlIllllIlllllI)) {
                final int lllllllllllllIIlIlIlIlllllIIIIll = lllllllllllllIIlIlIlIlllllIIIlll[lllllllllllllIIlIlIlIlllllIIIlII + GenLayerAddSnow.lIIllIlIIlIIll[0] + (lllllllllllllIIlIlIlIlllllIIIlIl + GenLayerAddSnow.lIIllIlIIlIIll[0]) * lllllllllllllIIlIlIlIlllllIIlIIl];
                this.initChunkSeed(lllllllllllllIIlIlIlIlllllIIIlII + lllllllllllllIIlIlIlIlllllIIllll, lllllllllllllIIlIlIlIlllllIIIlIl + lllllllllllllIIlIlIlIlllllIIlllI);
                if (llIllIIIlIIIlll(lllllllllllllIIlIlIlIlllllIIIIll)) {
                    lllllllllllllIIlIlIlIlllllIIIllI[lllllllllllllIIlIlIlIlllllIIIlII + lllllllllllllIIlIlIlIlllllIIIlIl * lllllllllllllIIlIlIlIllllIlllllI] = GenLayerAddSnow.lIIllIlIIlIIll[2];
                    "".length();
                    if (-" ".length() > ((0xD7 ^ 0xC7) & ~(0x51 ^ 0x41))) {
                        return null;
                    }
                }
                else {
                    int lllllllllllllIIlIlIlIlllllIIIIlI = this.nextInt(GenLayerAddSnow.lIIllIlIIlIIll[3]);
                    if (llIllIIIlIIIlll(lllllllllllllIIlIlIlIlllllIIIIlI)) {
                        lllllllllllllIIlIlIlIlllllIIIIlI = GenLayerAddSnow.lIIllIlIIlIIll[4];
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else if (llIllIIIlIIlIII(lllllllllllllIIlIlIlIlllllIIIIlI, GenLayerAddSnow.lIIllIlIIlIIll[0])) {
                        lllllllllllllIIlIlIlIlllllIIIIlI = GenLayerAddSnow.lIIllIlIIlIIll[5];
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIlIlIlIlllllIIIIlI = GenLayerAddSnow.lIIllIlIIlIIll[0];
                    }
                    lllllllllllllIIlIlIlIlllllIIIllI[lllllllllllllIIlIlIlIlllllIIIlII + lllllllllllllIIlIlIlIlllllIIIlIl * lllllllllllllIIlIlIlIllllIlllllI] = lllllllllllllIIlIlIlIlllllIIIIlI;
                }
                ++lllllllllllllIIlIlIlIlllllIIIlII;
            }
            ++lllllllllllllIIlIlIlIlllllIIIlIl;
        }
        return lllllllllllllIIlIlIlIlllllIIIllI;
    }
    
    private static void llIllIIIlIIIllI() {
        (lIIllIlIIlIIll = new int[6])[0] = " ".length();
        GenLayerAddSnow.lIIllIlIIlIIll[1] = "  ".length();
        GenLayerAddSnow.lIIllIlIIlIIll[2] = ((0x8 ^ 0x57) & ~(0x48 ^ 0x17));
        GenLayerAddSnow.lIIllIlIIlIIll[3] = (0x39 ^ 0x3F);
        GenLayerAddSnow.lIIllIlIIlIIll[4] = (0x92 ^ 0x86 ^ (0x26 ^ 0x36));
        GenLayerAddSnow.lIIllIlIIlIIll[5] = "   ".length();
    }
    
    private static boolean llIllIIIlIIlIII(final int lllllllllllllIIlIlIlIllllIlIllII, final int lllllllllllllIIlIlIlIllllIlIlIll) {
        return lllllllllllllIIlIlIlIllllIlIllII <= lllllllllllllIIlIlIlIllllIlIlIll;
    }
    
    static {
        llIllIIIlIIIllI();
    }
    
    private static boolean llIllIIIlIIlIIl(final int lllllllllllllIIlIlIlIllllIllIIII, final int lllllllllllllIIlIlIlIllllIlIllll) {
        return lllllllllllllIIlIlIlIllllIllIIII >= lllllllllllllIIlIlIlIllllIlIllll;
    }
    
    private static boolean llIllIIIlIIIlll(final int lllllllllllllIIlIlIlIllllIlIlIIl) {
        return lllllllllllllIIlIlIlIllllIlIlIIl == 0;
    }
}
