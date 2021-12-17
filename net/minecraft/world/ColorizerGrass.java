// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

public class ColorizerGrass
{
    private static /* synthetic */ int[] grassBuffer;
    private static final /* synthetic */ int[] llIllllllllIII;
    
    public static int getGrassColor(final double llllllllllllIllIIIlIlIIlIIIllllI, double llllllllllllIllIIIlIlIIlIIIllIII) {
        llllllllllllIllIIIlIlIIlIIIllIII *= llllllllllllIllIIIlIlIIlIIIllllI;
        final int llllllllllllIllIIIlIlIIlIIIlllII = (int)((1.0 - llllllllllllIllIIIlIlIIlIIIllllI) * 255.0);
        final int llllllllllllIllIIIlIlIIlIIIllIll = (int)((1.0 - llllllllllllIllIIIlIlIIlIIIllIII) * 255.0);
        final int llllllllllllIllIIIlIlIIlIIIllIlI = llllllllllllIllIIIlIlIIlIIIllIll << ColorizerGrass.llIllllllllIII[1] | llllllllllllIllIIIlIlIIlIIIlllII;
        int n;
        if (lIIllIlllIlIIIIl(llllllllllllIllIIIlIlIIlIIIllIlI, ColorizerGrass.grassBuffer.length)) {
            n = ColorizerGrass.llIllllllllIII[2];
            "".length();
            if (-(0x40 ^ 0x79 ^ (0xB4 ^ 0x89)) > 0) {
                return (16 + 54 + 12 + 73 ^ 89 + 43 - 15 + 27) & (0x1 ^ 0x23 ^ (0x2 ^ 0x2B) ^ -" ".length());
            }
        }
        else {
            n = ColorizerGrass.grassBuffer[llllllllllllIllIIIlIlIIlIIIllIlI];
        }
        return n;
    }
    
    static {
        lIIllIlllIlIIIII();
        ColorizerGrass.grassBuffer = new int[ColorizerGrass.llIllllllllIII[0]];
    }
    
    private static void lIIllIlllIlIIIII() {
        (llIllllllllIII = new int[3])[0] = (-(0xFFFFFED6 & 0x7FBB) & (0xFFFFFFDB & 0x17EB5));
        ColorizerGrass.llIllllllllIII[1] = (8 + 10 + 129 + 32 ^ 87 + 49 - 109 + 160);
        ColorizerGrass.llIllllllllIII[2] = -(0xFFFFFFE7 & 0xFF19);
    }
    
    private static boolean lIIllIlllIlIIIIl(final int llllllllllllIllIIIlIlIIlIIIlIIlI, final int llllllllllllIllIIIlIlIIlIIIlIIIl) {
        return llllllllllllIllIIIlIlIIlIIIlIIlI > llllllllllllIllIIIlIlIIlIIIlIIIl;
    }
    
    public static void setGrassBiomeColorizer(final int[] llllllllllllIllIIIlIlIIlIIlIIlIl) {
        ColorizerGrass.grassBuffer = llllllllllllIllIIIlIlIIlIIlIIlIl;
    }
}
