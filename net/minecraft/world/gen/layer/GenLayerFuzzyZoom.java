// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

public class GenLayerFuzzyZoom extends GenLayerZoom
{
    private static final /* synthetic */ int[] llIlllIIllIlII;
    
    private static void lIIllIIlIllllIII() {
        (llIlllIIllIlII = new int[5])[0] = (0xE0 ^ 0xAB ^ (0x3E ^ 0x71));
        GenLayerFuzzyZoom.llIlllIIllIlII[1] = ((0x37 ^ 0x3B ^ (0x8 ^ 0x65)) & (147 + 96 - 135 + 119 ^ 114 + 88 - 175 + 103 ^ -" ".length()));
        GenLayerFuzzyZoom.llIlllIIllIlII[2] = " ".length();
        GenLayerFuzzyZoom.llIlllIIllIlII[3] = "  ".length();
        GenLayerFuzzyZoom.llIlllIIllIlII[4] = "   ".length();
    }
    
    public GenLayerFuzzyZoom(final long llllllllllllIllIIlIIllIlIIIIIlII, final GenLayer llllllllllllIllIIlIIllIlIIIIIllI) {
        super(llllllllllllIllIIlIIllIlIIIIIlII, llllllllllllIllIIlIIllIlIIIIIllI);
    }
    
    static {
        lIIllIIlIllllIII();
    }
    
    @Override
    protected int selectModeOrRandom(final int llllllllllllIllIIlIIllIIllllIlll, final int llllllllllllIllIIlIIllIIllllIllI, final int llllllllllllIllIIlIIllIIlllllIlI, final int llllllllllllIllIIlIIllIIllllIlII) {
        final int[] lllllllllllllIIIIIIIIIIllIIlIIII = new int[GenLayerFuzzyZoom.llIlllIIllIlII[0]];
        lllllllllllllIIIIIIIIIIllIIlIIII[GenLayerFuzzyZoom.llIlllIIllIlII[1]] = llllllllllllIllIIlIIllIIllllIlll;
        lllllllllllllIIIIIIIIIIllIIlIIII[GenLayerFuzzyZoom.llIlllIIllIlII[2]] = llllllllllllIllIIlIIllIIllllIllI;
        lllllllllllllIIIIIIIIIIllIIlIIII[GenLayerFuzzyZoom.llIlllIIllIlII[3]] = llllllllllllIllIIlIIllIIlllllIlI;
        lllllllllllllIIIIIIIIIIllIIlIIII[GenLayerFuzzyZoom.llIlllIIllIlII[4]] = llllllllllllIllIIlIIllIIllllIlII;
        return this.selectRandom(lllllllllllllIIIIIIIIIIllIIlIIII);
    }
}
