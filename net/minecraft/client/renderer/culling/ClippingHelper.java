// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.culling;

public class ClippingHelper
{
    public /* synthetic */ float[] clippingMatrix;
    public /* synthetic */ float[] projectionMatrix;
    public /* synthetic */ float[][] frustum;
    private static final /* synthetic */ int[] lllIllIlIllIlI;
    public /* synthetic */ float[] modelviewMatrix;
    
    private static int lIlIIlIIllllIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIlIIllllIlII(final int llllllllllllIlIllIIIllllllIllIIl) {
        return llllllllllllIlIllIIIllllllIllIIl <= 0;
    }
    
    public boolean isBoxInFrustum(final double llllllllllllIlIllIIIlllllllIllll, final double llllllllllllIlIllIIIlllllllIIlIl, final double llllllllllllIlIllIIIlllllllIIlII, final double llllllllllllIlIllIIIlllllllIIIll, final double llllllllllllIlIllIIIlllllllIlIll, final double llllllllllllIlIllIIIlllllllIlIlI) {
        int llllllllllllIlIllIIIlllllllIlIIl = ClippingHelper.lllIllIlIllIlI[3];
        "".length();
        if ("  ".length() == 0) {
            return ((0x21 ^ 0x39) & ~(0xAB ^ 0xB3)) != 0x0;
        }
        while (!lIlIIlIIllllIlIl(llllllllllllIlIllIIIlllllllIlIIl, ClippingHelper.lllIllIlIllIlI[0])) {
            final float[] llllllllllllIlIllIIIlllllllIlIII = this.frustum[llllllllllllIlIllIIIlllllllIlIIl];
            if (lIlIIlIIllllIlII(lIlIIlIIllllIIll(this.dot(llllllllllllIlIllIIIlllllllIlIII, llllllllllllIlIllIIIlllllllIllll, llllllllllllIlIllIIIlllllllIIlIl, llllllllllllIlIllIIIlllllllIIlII), 0.0)) && lIlIIlIIllllIlII(lIlIIlIIllllIIll(this.dot(llllllllllllIlIllIIIlllllllIlIII, llllllllllllIlIllIIIlllllllIIIll, llllllllllllIlIllIIIlllllllIIlIl, llllllllllllIlIllIIIlllllllIIlII), 0.0)) && lIlIIlIIllllIlII(lIlIIlIIllllIIll(this.dot(llllllllllllIlIllIIIlllllllIlIII, llllllllllllIlIllIIIlllllllIllll, llllllllllllIlIllIIIlllllllIlIll, llllllllllllIlIllIIIlllllllIIlII), 0.0)) && lIlIIlIIllllIlII(lIlIIlIIllllIIll(this.dot(llllllllllllIlIllIIIlllllllIlIII, llllllllllllIlIllIIIlllllllIIIll, llllllllllllIlIllIIIlllllllIlIll, llllllllllllIlIllIIIlllllllIIlII), 0.0)) && lIlIIlIIllllIlII(lIlIIlIIllllIIll(this.dot(llllllllllllIlIllIIIlllllllIlIII, llllllllllllIlIllIIIlllllllIllll, llllllllllllIlIllIIIlllllllIIlIl, llllllllllllIlIllIIIlllllllIlIlI), 0.0)) && lIlIIlIIllllIlII(lIlIIlIIllllIIll(this.dot(llllllllllllIlIllIIIlllllllIlIII, llllllllllllIlIllIIIlllllllIIIll, llllllllllllIlIllIIIlllllllIIlIl, llllllllllllIlIllIIIlllllllIlIlI), 0.0)) && lIlIIlIIllllIlII(lIlIIlIIllllIIll(this.dot(llllllllllllIlIllIIIlllllllIlIII, llllllllllllIlIllIIIlllllllIllll, llllllllllllIlIllIIIlllllllIlIll, llllllllllllIlIllIIIlllllllIlIlI), 0.0)) && lIlIIlIIllllIlII(lIlIIlIIllllIIll(this.dot(llllllllllllIlIllIIIlllllllIlIII, llllllllllllIlIllIIIlllllllIIIll, llllllllllllIlIllIIIlllllllIlIll, llllllllllllIlIllIIIlllllllIlIlI), 0.0))) {
                return ClippingHelper.lllIllIlIllIlI[3] != 0;
            }
            ++llllllllllllIlIllIIIlllllllIlIIl;
        }
        return ClippingHelper.lllIllIlIllIlI[4] != 0;
    }
    
    private double dot(final float[] llllllllllllIlIllIIIllllllllllIl, final double llllllllllllIlIllIIlIIIIIIIIIIII, final double llllllllllllIlIllIIIllllllllllll, final double llllllllllllIlIllIIIlllllllllllI) {
        return llllllllllllIlIllIIIllllllllllIl[ClippingHelper.lllIllIlIllIlI[3]] * llllllllllllIlIllIIlIIIIIIIIIIII + llllllllllllIlIllIIIllllllllllIl[ClippingHelper.lllIllIlIllIlI[4]] * llllllllllllIlIllIIIllllllllllll + llllllllllllIlIllIIIllllllllllIl[ClippingHelper.lllIllIlIllIlI[5]] * llllllllllllIlIllIIIlllllllllllI + llllllllllllIlIllIIIllllllllllIl[ClippingHelper.lllIllIlIllIlI[6]];
    }
    
    private static void lIlIIlIIllllIIlI() {
        (lllIllIlIllIlI = new int[7])[0] = (0x71 ^ 0x77);
        ClippingHelper.lllIllIlIllIlI[1] = (0x27 ^ 0x20 ^ "   ".length());
        ClippingHelper.lllIllIlIllIlI[2] = (0x8 ^ 0x18);
        ClippingHelper.lllIllIlIllIlI[3] = ((0x4F ^ 0xC ^ (0xB1 ^ 0xAA)) & (78 + 57 - 19 + 119 ^ 62 + 139 - 66 + 44 ^ -" ".length()));
        ClippingHelper.lllIllIlIllIlI[4] = " ".length();
        ClippingHelper.lllIllIlIllIlI[5] = "  ".length();
        ClippingHelper.lllIllIlIllIlI[6] = "   ".length();
    }
    
    public ClippingHelper() {
        this.frustum = new float[ClippingHelper.lllIllIlIllIlI[0]][ClippingHelper.lllIllIlIllIlI[1]];
        this.projectionMatrix = new float[ClippingHelper.lllIllIlIllIlI[2]];
        this.modelviewMatrix = new float[ClippingHelper.lllIllIlIllIlI[2]];
        this.clippingMatrix = new float[ClippingHelper.lllIllIlIllIlI[2]];
    }
    
    static {
        lIlIIlIIllllIIlI();
    }
    
    private static boolean lIlIIlIIllllIlIl(final int llllllllllllIlIllIIIllllllIlllII, final int llllllllllllIlIllIIIllllllIllIll) {
        return llllllllllllIlIllIIIllllllIlllII >= llllllllllllIlIllIIIllllllIllIll;
    }
}
