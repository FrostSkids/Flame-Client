// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

public class GenLayerZoom extends GenLayer
{
    private static final /* synthetic */ int[] llIIIlllIlIIlI;
    
    private static void lIIIlIlIlllIlIIl() {
        (llIIIlllIlIIlI = new int[3])[0] = " ".length();
        GenLayerZoom.llIIIlllIlIIlI[1] = "  ".length();
        GenLayerZoom.llIIIlllIlIIlI[2] = ((0xD8 ^ 0xB6 ^ (0xC4 ^ 0xA6)) & (0x8D ^ 0xC0 ^ (0xF3 ^ 0xB2) ^ -" ".length()));
    }
    
    @Override
    public int[] getInts(final int llllllllllllIlllIlIIIIIlIlIIlllI, final int llllllllllllIlllIlIIIIIlIllIIIll, final int llllllllllllIlllIlIIIIIlIlIIllII, final int llllllllllllIlllIlIIIIIlIllIIIIl) {
        final int llllllllllllIlllIlIIIIIlIllIIIII = llllllllllllIlllIlIIIIIlIlIIlllI >> GenLayerZoom.llIIIlllIlIIlI[0];
        final int llllllllllllIlllIlIIIIIlIlIlllll = llllllllllllIlllIlIIIIIlIllIIIll >> GenLayerZoom.llIIIlllIlIIlI[0];
        final int llllllllllllIlllIlIIIIIlIlIllllI = (llllllllllllIlllIlIIIIIlIlIIllII >> GenLayerZoom.llIIIlllIlIIlI[0]) + GenLayerZoom.llIIIlllIlIIlI[1];
        final int llllllllllllIlllIlIIIIIlIlIlllIl = (llllllllllllIlllIlIIIIIlIllIIIIl >> GenLayerZoom.llIIIlllIlIIlI[0]) + GenLayerZoom.llIIIlllIlIIlI[1];
        final int[] llllllllllllIlllIlIIIIIlIlIlllII = this.parent.getInts(llllllllllllIlllIlIIIIIlIllIIIII, llllllllllllIlllIlIIIIIlIlIlllll, llllllllllllIlllIlIIIIIlIlIllllI, llllllllllllIlllIlIIIIIlIlIlllIl);
        final int llllllllllllIlllIlIIIIIlIlIllIll = llllllllllllIlllIlIIIIIlIlIllllI - GenLayerZoom.llIIIlllIlIIlI[0] << GenLayerZoom.llIIIlllIlIIlI[0];
        final int llllllllllllIlllIlIIIIIlIlIllIlI = llllllllllllIlllIlIIIIIlIlIlllIl - GenLayerZoom.llIIIlllIlIIlI[0] << GenLayerZoom.llIIIlllIlIIlI[0];
        final int[] llllllllllllIlllIlIIIIIlIlIllIIl = IntCache.getIntCache(llllllllllllIlllIlIIIIIlIlIllIll * llllllllllllIlllIlIIIIIlIlIllIlI);
        int llllllllllllIlllIlIIIIIlIlIllIII = GenLayerZoom.llIIIlllIlIIlI[2];
        "".length();
        if (((0x6E ^ 0x35) & ~(0x52 ^ 0x9)) != 0x0) {
            return null;
        }
        while (!lIIIlIlIlllIlIlI(llllllllllllIlllIlIIIIIlIlIllIII, llllllllllllIlllIlIIIIIlIlIlllIl - GenLayerZoom.llIIIlllIlIIlI[0])) {
            int llllllllllllIlllIlIIIIIlIlIlIlll = (llllllllllllIlllIlIIIIIlIlIllIII << GenLayerZoom.llIIIlllIlIIlI[0]) * llllllllllllIlllIlIIIIIlIlIllIll;
            int llllllllllllIlllIlIIIIIlIlIlIllI = GenLayerZoom.llIIIlllIlIIlI[2];
            int llllllllllllIlllIlIIIIIlIlIlIlIl = llllllllllllIlllIlIIIIIlIlIlllII[llllllllllllIlllIlIIIIIlIlIlIllI + GenLayerZoom.llIIIlllIlIIlI[2] + (llllllllllllIlllIlIIIIIlIlIllIII + GenLayerZoom.llIIIlllIlIIlI[2]) * llllllllllllIlllIlIIIIIlIlIllllI];
            int llllllllllllIlllIlIIIIIlIlIlIlII = llllllllllllIlllIlIIIIIlIlIlllII[llllllllllllIlllIlIIIIIlIlIlIllI + GenLayerZoom.llIIIlllIlIIlI[2] + (llllllllllllIlllIlIIIIIlIlIllIII + GenLayerZoom.llIIIlllIlIIlI[0]) * llllllllllllIlllIlIIIIIlIlIllllI];
            "".length();
            if (" ".length() < 0) {
                return null;
            }
            while (!lIIIlIlIlllIlIlI(llllllllllllIlllIlIIIIIlIlIlIllI, llllllllllllIlllIlIIIIIlIlIllllI - GenLayerZoom.llIIIlllIlIIlI[0])) {
                this.initChunkSeed(llllllllllllIlllIlIIIIIlIlIlIllI + llllllllllllIlllIlIIIIIlIllIIIII << GenLayerZoom.llIIIlllIlIIlI[0], llllllllllllIlllIlIIIIIlIlIllIII + llllllllllllIlllIlIIIIIlIlIlllll << GenLayerZoom.llIIIlllIlIIlI[0]);
                final int llllllllllllIlllIlIIIIIlIlIlIIll = llllllllllllIlllIlIIIIIlIlIlllII[llllllllllllIlllIlIIIIIlIlIlIllI + GenLayerZoom.llIIIlllIlIIlI[0] + (llllllllllllIlllIlIIIIIlIlIllIII + GenLayerZoom.llIIIlllIlIIlI[2]) * llllllllllllIlllIlIIIIIlIlIllllI];
                final int llllllllllllIlllIlIIIIIlIlIlIIlI = llllllllllllIlllIlIIIIIlIlIlllII[llllllllllllIlllIlIIIIIlIlIlIllI + GenLayerZoom.llIIIlllIlIIlI[0] + (llllllllllllIlllIlIIIIIlIlIllIII + GenLayerZoom.llIIIlllIlIIlI[0]) * llllllllllllIlllIlIIIIIlIlIllllI];
                llllllllllllIlllIlIIIIIlIlIllIIl[llllllllllllIlllIlIIIIIlIlIlIlll] = llllllllllllIlllIlIIIIIlIlIlIlIl;
                final int[] array = llllllllllllIlllIlIIIIIlIlIllIIl;
                final int n = llllllllllllIlllIlIIIIIlIlIlIlll++ + llllllllllllIlllIlIIIIIlIlIllIll;
                final int[] lllllllllllllIIIIIIIIIIllIIlIIII = new int[GenLayerZoom.llIIIlllIlIIlI[1]];
                lllllllllllllIIIIIIIIIIllIIlIIII[GenLayerZoom.llIIIlllIlIIlI[2]] = llllllllllllIlllIlIIIIIlIlIlIlIl;
                lllllllllllllIIIIIIIIIIllIIlIIII[GenLayerZoom.llIIIlllIlIIlI[0]] = llllllllllllIlllIlIIIIIlIlIlIlII;
                array[n] = this.selectRandom(lllllllllllllIIIIIIIIIIllIIlIIII);
                final int[] array2 = llllllllllllIlllIlIIIIIlIlIllIIl;
                final int n2 = llllllllllllIlllIlIIIIIlIlIlIlll;
                final int[] lllllllllllllIIIIIIIIIIllIIlIIII2 = new int[GenLayerZoom.llIIIlllIlIIlI[1]];
                lllllllllllllIIIIIIIIIIllIIlIIII2[GenLayerZoom.llIIIlllIlIIlI[2]] = llllllllllllIlllIlIIIIIlIlIlIlIl;
                lllllllllllllIIIIIIIIIIllIIlIIII2[GenLayerZoom.llIIIlllIlIIlI[0]] = llllllllllllIlllIlIIIIIlIlIlIIll;
                array2[n2] = this.selectRandom(lllllllllllllIIIIIIIIIIllIIlIIII2);
                llllllllllllIlllIlIIIIIlIlIllIIl[llllllllllllIlllIlIIIIIlIlIlIlll++ + llllllllllllIlllIlIIIIIlIlIllIll] = this.selectModeOrRandom(llllllllllllIlllIlIIIIIlIlIlIlIl, llllllllllllIlllIlIIIIIlIlIlIIll, llllllllllllIlllIlIIIIIlIlIlIlII, llllllllllllIlllIlIIIIIlIlIlIIlI);
                llllllllllllIlllIlIIIIIlIlIlIlIl = llllllllllllIlllIlIIIIIlIlIlIIll;
                llllllllllllIlllIlIIIIIlIlIlIlII = llllllllllllIlllIlIIIIIlIlIlIIlI;
                ++llllllllllllIlllIlIIIIIlIlIlIllI;
            }
            ++llllllllllllIlllIlIIIIIlIlIllIII;
        }
        final int[] llllllllllllIlllIlIIIIIlIlIlIIIl = IntCache.getIntCache(llllllllllllIlllIlIIIIIlIlIIllII * llllllllllllIlllIlIIIIIlIllIIIIl);
        int llllllllllllIlllIlIIIIIlIlIlIIII = GenLayerZoom.llIIIlllIlIIlI[2];
        "".length();
        if (" ".length() == "   ".length()) {
            return null;
        }
        while (!lIIIlIlIlllIlIlI(llllllllllllIlllIlIIIIIlIlIlIIII, llllllllllllIlllIlIIIIIlIllIIIIl)) {
            System.arraycopy(llllllllllllIlllIlIIIIIlIlIllIIl, (llllllllllllIlllIlIIIIIlIlIlIIII + (llllllllllllIlllIlIIIIIlIllIIIll & GenLayerZoom.llIIIlllIlIIlI[0])) * llllllllllllIlllIlIIIIIlIlIllIll + (llllllllllllIlllIlIIIIIlIlIIlllI & GenLayerZoom.llIIIlllIlIIlI[0]), llllllllllllIlllIlIIIIIlIlIlIIIl, llllllllllllIlllIlIIIIIlIlIlIIII * llllllllllllIlllIlIIIIIlIlIIllII, llllllllllllIlllIlIIIIIlIlIIllII);
            ++llllllllllllIlllIlIIIIIlIlIlIIII;
        }
        return llllllllllllIlllIlIIIIIlIlIlIIIl;
    }
    
    public GenLayerZoom(final long llllllllllllIlllIlIIIIIlIllllIll, final GenLayer llllllllllllIlllIlIIIIIlIllllIlI) {
        super(llllllllllllIlllIlIIIIIlIllllIll);
        super.parent = llllllllllllIlllIlIIIIIlIllllIlI;
    }
    
    public static GenLayer magnify(final long llllllllllllIlllIlIIIIIlIIllIIIl, final GenLayer llllllllllllIlllIlIIIIIlIIllIIII, final int llllllllllllIlllIlIIIIIlIIllIlII) {
        GenLayer llllllllllllIlllIlIIIIIlIIllIIll = llllllllllllIlllIlIIIIIlIIllIIII;
        int llllllllllllIlllIlIIIIIlIIllIIlI = GenLayerZoom.llIIIlllIlIIlI[2];
        "".length();
        if (((0x47 ^ 0x68) & ~(0x27 ^ 0x8)) != 0x0) {
            return null;
        }
        while (!lIIIlIlIlllIlIlI(llllllllllllIlllIlIIIIIlIIllIIlI, llllllllllllIlllIlIIIIIlIIllIlII)) {
            llllllllllllIlllIlIIIIIlIIllIIll = new GenLayerZoom(llllllllllllIlllIlIIIIIlIIllIIIl + llllllllllllIlllIlIIIIIlIIllIIlI, llllllllllllIlllIlIIIIIlIIllIIll);
            ++llllllllllllIlllIlIIIIIlIIllIIlI;
        }
        return llllllllllllIlllIlIIIIIlIIllIIll;
    }
    
    static {
        lIIIlIlIlllIlIIl();
    }
    
    private static boolean lIIIlIlIlllIlIlI(final int llllllllllllIlllIlIIIIIlIIlIlIlI, final int llllllllllllIlllIlIIIIIlIIlIlIIl) {
        return llllllllllllIlllIlIIIIIlIIlIlIlI >= llllllllllllIlllIlIIIIIlIIlIlIIl;
    }
}
