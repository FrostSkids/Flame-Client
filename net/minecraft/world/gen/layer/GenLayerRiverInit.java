// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

public class GenLayerRiverInit extends GenLayer
{
    private static final /* synthetic */ int[] lllIIIIllllIIl;
    
    @Override
    public int[] getInts(final int llllllllllllIllIIIIIlllllIIIIIll, final int llllllllllllIllIIIIIlllllIIIIIlI, final int llllllllllllIllIIIIIlllllIIIIIIl, final int llllllllllllIllIIIIIlllllIIIlIIl) {
        final int[] llllllllllllIllIIIIIlllllIIIlIII = this.parent.getInts(llllllllllllIllIIIIIlllllIIIIIll, llllllllllllIllIIIIIlllllIIIIIlI, llllllllllllIllIIIIIlllllIIIIIIl, llllllllllllIllIIIIIlllllIIIlIIl);
        final int[] llllllllllllIllIIIIIlllllIIIIlll = IntCache.getIntCache(llllllllllllIllIIIIIlllllIIIIIIl * llllllllllllIllIIIIIlllllIIIlIIl);
        int llllllllllllIllIIIIIlllllIIIIllI = GenLayerRiverInit.lllIIIIllllIIl[0];
        "".length();
        if (-" ".length() > ((0xE7 ^ 0xC7 ^ (0x9 ^ 0x3B)) & (30 + 101 - 48 + 93 ^ 67 + 117 - 74 + 52 ^ -" ".length()))) {
            return null;
        }
        while (!lIIlllIlIIIIIllI(llllllllllllIllIIIIIlllllIIIIllI, llllllllllllIllIIIIIlllllIIIlIIl)) {
            int llllllllllllIllIIIIIlllllIIIIlIl = GenLayerRiverInit.lllIIIIllllIIl[0];
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
            while (!lIIlllIlIIIIIllI(llllllllllllIllIIIIIlllllIIIIlIl, llllllllllllIllIIIIIlllllIIIIIIl)) {
                this.initChunkSeed(llllllllllllIllIIIIIlllllIIIIlIl + llllllllllllIllIIIIIlllllIIIIIll, llllllllllllIllIIIIIlllllIIIIllI + llllllllllllIllIIIIIlllllIIIIIlI);
                final int[] array = llllllllllllIllIIIIIlllllIIIIlll;
                final int n = llllllllllllIllIIIIIlllllIIIIlIl + llllllllllllIllIIIIIlllllIIIIllI * llllllllllllIllIIIIIlllllIIIIIIl;
                int n2;
                if (lIIlllIlIIIIIlIl(llllllllllllIllIIIIIlllllIIIlIII[llllllllllllIllIIIIIlllllIIIIlIl + llllllllllllIllIIIIIlllllIIIIllI * llllllllllllIllIIIIIlllllIIIIIIl])) {
                    n2 = this.nextInt(GenLayerRiverInit.lllIIIIllllIIl[1]) + GenLayerRiverInit.lllIIIIllllIIl[2];
                    "".length();
                    if (-" ".length() >= 0) {
                        return null;
                    }
                }
                else {
                    n2 = GenLayerRiverInit.lllIIIIllllIIl[0];
                }
                array[n] = n2;
                ++llllllllllllIllIIIIIlllllIIIIlIl;
            }
            ++llllllllllllIllIIIIIlllllIIIIllI;
        }
        return llllllllllllIllIIIIIlllllIIIIlll;
    }
    
    static {
        lIIlllIlIIIIIlII();
    }
    
    public GenLayerRiverInit(final long llllllllllllIllIIIIIlllllIIllIll, final GenLayer llllllllllllIllIIIIIlllllIIlIlll) {
        super(llllllllllllIllIIIIIlllllIIllIll);
        this.parent = llllllllllllIllIIIIIlllllIIlIlll;
    }
    
    private static boolean lIIlllIlIIIIIlIl(final int llllllllllllIllIIIIIllllIlllIllI) {
        return llllllllllllIllIIIIIllllIlllIllI > 0;
    }
    
    private static void lIIlllIlIIIIIlII() {
        (lllIIIIllllIIl = new int[3])[0] = ((0x2D ^ 0x44 ^ (0x9 ^ 0x72)) & (0x7E ^ 0x6C ^ ((0x99 ^ 0x9E) & ~(0xAF ^ 0xA8)) ^ -" ".length()));
        GenLayerRiverInit.lllIIIIllllIIl[1] = (-(0xFFFFB7F9 & 0x6C27) & (-1 & 0x4B7FF));
        GenLayerRiverInit.lllIIIIllllIIl[2] = "  ".length();
    }
    
    private static boolean lIIlllIlIIIIIllI(final int llllllllllllIllIIIIIllllIllllIIl, final int llllllllllllIllIIIIIllllIllllIII) {
        return llllllllllllIllIIIIIllllIllllIIl >= llllllllllllIllIIIIIllllIllllIII;
    }
}
