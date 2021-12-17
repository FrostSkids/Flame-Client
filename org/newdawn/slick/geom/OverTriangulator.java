// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

public class OverTriangulator implements Triangulator
{
    private static final /* synthetic */ int[] lIlIIllllIlIIl;
    private /* synthetic */ float[][] triangles;
    
    private static boolean lllIlIIlllllllI(final int lllllllllllllIIIlIlllIIIIllIIIII, final int lllllllllllllIIIlIlllIIIIlIlllll) {
        return lllllllllllllIIIlIlllIIIIllIIIII < lllllllllllllIIIlIlllIIIIlIlllll;
    }
    
    static {
        lllIlIIllllllIl();
    }
    
    public OverTriangulator(final Triangulator lllllllllllllIIIlIlllIIIIlllllll) {
        this.triangles = new float[lllllllllllllIIIlIlllIIIIlllllll.getTriangleCount() * OverTriangulator.lIlIIllllIlIIl[0] * OverTriangulator.lIlIIllllIlIIl[1]][OverTriangulator.lIlIIllllIlIIl[2]];
        int lllllllllllllIIIlIlllIIIlIIIIIIl = OverTriangulator.lIlIIllllIlIIl[3];
        int lllllllllllllIIIlIlllIIIlIIIIlII = OverTriangulator.lIlIIllllIlIIl[3];
        while (lllIlIIlllllllI(lllllllllllllIIIlIlllIIIlIIIIlII, lllllllllllllIIIlIlllIIIIlllllll.getTriangleCount())) {
            float lllllllllllllIIIlIlllIIIlIIIIllI = 0.0f;
            float lllllllllllllIIIlIlllIIIlIIIIlIl = 0.0f;
            int lllllllllllllIIIlIlllIIIlIIIllll = OverTriangulator.lIlIIllllIlIIl[3];
            while (lllIlIIlllllllI(lllllllllllllIIIlIlllIIIlIIIllll, OverTriangulator.lIlIIllllIlIIl[1])) {
                final float[] lllllllllllllIIIlIlllIIIlIIlIIII = lllllllllllllIIIlIlllIIIIlllllll.getTrianglePoint(lllllllllllllIIIlIlllIIIlIIIIlII, lllllllllllllIIIlIlllIIIlIIIllll);
                lllllllllllllIIIlIlllIIIlIIIIllI += lllllllllllllIIIlIlllIIIlIIlIIII[OverTriangulator.lIlIIllllIlIIl[3]];
                lllllllllllllIIIlIlllIIIlIIIIlIl += lllllllllllllIIIlIlllIIIlIIlIIII[OverTriangulator.lIlIIllllIlIIl[4]];
                ++lllllllllllllIIIlIlllIIIlIIIllll;
                "".length();
                if (-(0x57 ^ 0x4D ^ (0x20 ^ 0x3E)) >= 0) {
                    throw null;
                }
            }
            lllllllllllllIIIlIlllIIIlIIIIllI /= 3.0f;
            lllllllllllllIIIlIlllIIIlIIIIlIl /= 3.0f;
            int lllllllllllllIIIlIlllIIIlIIIlIll = OverTriangulator.lIlIIllllIlIIl[3];
            while (lllIlIIlllllllI(lllllllllllllIIIlIlllIIIlIIIlIll, OverTriangulator.lIlIIllllIlIIl[1])) {
                int lllllllllllllIIIlIlllIIIlIIIlllI = lllllllllllllIIIlIlllIIIlIIIlIll + OverTriangulator.lIlIIllllIlIIl[4];
                if (lllIlIIllllllll(lllllllllllllIIIlIlllIIIlIIIlllI, OverTriangulator.lIlIIllllIlIIl[2])) {
                    lllllllllllllIIIlIlllIIIlIIIlllI = OverTriangulator.lIlIIllllIlIIl[3];
                }
                final float[] lllllllllllllIIIlIlllIIIlIIIllIl = lllllllllllllIIIlIlllIIIIlllllll.getTrianglePoint(lllllllllllllIIIlIlllIIIlIIIIlII, lllllllllllllIIIlIlllIIIlIIIlIll);
                final float[] lllllllllllllIIIlIlllIIIlIIIllII = lllllllllllllIIIlIlllIIIIlllllll.getTrianglePoint(lllllllllllllIIIlIlllIIIlIIIIlII, lllllllllllllIIIlIlllIIIlIIIlllI);
                lllllllllllllIIIlIlllIIIlIIIllIl[OverTriangulator.lIlIIllllIlIIl[3]] = (lllllllllllllIIIlIlllIIIlIIIllIl[OverTriangulator.lIlIIllllIlIIl[3]] + lllllllllllllIIIlIlllIIIlIIIllII[OverTriangulator.lIlIIllllIlIIl[3]]) / 2.0f;
                lllllllllllllIIIlIlllIIIlIIIllIl[OverTriangulator.lIlIIllllIlIIl[4]] = (lllllllllllllIIIlIlllIIIlIIIllIl[OverTriangulator.lIlIIllllIlIIl[4]] + lllllllllllllIIIlIlllIIIlIIIllII[OverTriangulator.lIlIIllllIlIIl[4]]) / 2.0f;
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[3]][OverTriangulator.lIlIIllllIlIIl[3]] = lllllllllllllIIIlIlllIIIlIIIIllI;
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[3]][OverTriangulator.lIlIIllllIlIIl[4]] = lllllllllllllIIIlIlllIIIlIIIIlIl;
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[4]][OverTriangulator.lIlIIllllIlIIl[3]] = lllllllllllllIIIlIlllIIIlIIIllIl[OverTriangulator.lIlIIllllIlIIl[3]];
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[4]][OverTriangulator.lIlIIllllIlIIl[4]] = lllllllllllllIIIlIlllIIIlIIIllIl[OverTriangulator.lIlIIllllIlIIl[4]];
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[2]][OverTriangulator.lIlIIllllIlIIl[3]] = lllllllllllllIIIlIlllIIIlIIIllII[OverTriangulator.lIlIIllllIlIIl[3]];
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[2]][OverTriangulator.lIlIIllllIlIIl[4]] = lllllllllllllIIIlIlllIIIlIIIllII[OverTriangulator.lIlIIllllIlIIl[4]];
                ++lllllllllllllIIIlIlllIIIlIIIIIIl;
                ++lllllllllllllIIIlIlllIIIlIIIlIll;
                "".length();
                if (-" ".length() < -" ".length()) {
                    throw null;
                }
            }
            int lllllllllllllIIIlIlllIIIlIIIIlll = OverTriangulator.lIlIIllllIlIIl[3];
            while (lllIlIIlllllllI(lllllllllllllIIIlIlllIIIlIIIIlll, OverTriangulator.lIlIIllllIlIIl[1])) {
                int lllllllllllllIIIlIlllIIIlIIIlIlI = lllllllllllllIIIlIlllIIIlIIIIlll + OverTriangulator.lIlIIllllIlIIl[4];
                if (lllIlIIllllllll(lllllllllllllIIIlIlllIIIlIIIlIlI, OverTriangulator.lIlIIllllIlIIl[2])) {
                    lllllllllllllIIIlIlllIIIlIIIlIlI = OverTriangulator.lIlIIllllIlIIl[3];
                }
                final float[] lllllllllllllIIIlIlllIIIlIIIlIIl = lllllllllllllIIIlIlllIIIIlllllll.getTrianglePoint(lllllllllllllIIIlIlllIIIlIIIIlII, lllllllllllllIIIlIlllIIIlIIIIlll);
                final float[] lllllllllllllIIIlIlllIIIlIIIlIII = lllllllllllllIIIlIlllIIIIlllllll.getTrianglePoint(lllllllllllllIIIlIlllIIIlIIIIlII, lllllllllllllIIIlIlllIIIlIIIlIlI);
                lllllllllllllIIIlIlllIIIlIIIlIII[OverTriangulator.lIlIIllllIlIIl[3]] = (lllllllllllllIIIlIlllIIIlIIIlIIl[OverTriangulator.lIlIIllllIlIIl[3]] + lllllllllllllIIIlIlllIIIlIIIlIII[OverTriangulator.lIlIIllllIlIIl[3]]) / 2.0f;
                lllllllllllllIIIlIlllIIIlIIIlIII[OverTriangulator.lIlIIllllIlIIl[4]] = (lllllllllllllIIIlIlllIIIlIIIlIIl[OverTriangulator.lIlIIllllIlIIl[4]] + lllllllllllllIIIlIlllIIIlIIIlIII[OverTriangulator.lIlIIllllIlIIl[4]]) / 2.0f;
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[3]][OverTriangulator.lIlIIllllIlIIl[3]] = lllllllllllllIIIlIlllIIIlIIIIllI;
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[3]][OverTriangulator.lIlIIllllIlIIl[4]] = lllllllllllllIIIlIlllIIIlIIIIlIl;
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[4]][OverTriangulator.lIlIIllllIlIIl[3]] = lllllllllllllIIIlIlllIIIlIIIlIIl[OverTriangulator.lIlIIllllIlIIl[3]];
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[4]][OverTriangulator.lIlIIllllIlIIl[4]] = lllllllllllllIIIlIlllIIIlIIIlIIl[OverTriangulator.lIlIIllllIlIIl[4]];
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[2]][OverTriangulator.lIlIIllllIlIIl[3]] = lllllllllllllIIIlIlllIIIlIIIlIII[OverTriangulator.lIlIIllllIlIIl[3]];
                this.triangles[lllllllllllllIIIlIlllIIIlIIIIIIl * OverTriangulator.lIlIIllllIlIIl[1] + OverTriangulator.lIlIIllllIlIIl[2]][OverTriangulator.lIlIIllllIlIIl[4]] = lllllllllllllIIIlIlllIIIlIIIlIII[OverTriangulator.lIlIIllllIlIIl[4]];
                ++lllllllllllllIIIlIlllIIIlIIIIIIl;
                ++lllllllllllllIIIlIlllIIIlIIIIlll;
                "".length();
                if (((0x90 ^ 0xA7) & ~(0x6B ^ 0x5C)) == "  ".length()) {
                    throw null;
                }
            }
            ++lllllllllllllIIIlIlllIIIlIIIIlII;
            "".length();
            if ("  ".length() <= 0) {
                throw null;
            }
        }
    }
    
    public void addPolyPoint(final float lllllllllllllIIIlIlllIIIIlllIlIl, final float lllllllllllllIIIlIlllIIIIlllIlII) {
    }
    
    public int getTriangleCount() {
        return this.triangles.length / OverTriangulator.lIlIIllllIlIIl[1];
    }
    
    public float[] getTrianglePoint(final int lllllllllllllIIIlIlllIIIIllIIlll, final int lllllllllllllIIIlIlllIIIIllIIllI) {
        final float[] lllllllllllllIIIlIlllIIIIllIlIIl = this.triangles[lllllllllllllIIIlIlllIIIIllIIlll * OverTriangulator.lIlIIllllIlIIl[1] + lllllllllllllIIIlIlllIIIIllIIllI];
        final float[] array = new float[OverTriangulator.lIlIIllllIlIIl[2]];
        array[OverTriangulator.lIlIIllllIlIIl[3]] = lllllllllllllIIIlIlllIIIIllIlIIl[OverTriangulator.lIlIIllllIlIIl[3]];
        array[OverTriangulator.lIlIIllllIlIIl[4]] = lllllllllllllIIIlIlllIIIIllIlIIl[OverTriangulator.lIlIIllllIlIIl[4]];
        return array;
    }
    
    private static boolean lllIlIIllllllll(final int lllllllllllllIIIlIlllIIIIlIlllII, final int lllllllllllllIIIlIlllIIIIlIllIll) {
        return lllllllllllllIIIlIlllIIIIlIlllII > lllllllllllllIIIlIlllIIIIlIllIll;
    }
    
    public void startHole() {
    }
    
    private static void lllIlIIllllllIl() {
        (lIlIIllllIlIIl = new int[5])[0] = (0x73 ^ 0x1E ^ (0x58 ^ 0x33));
        OverTriangulator.lIlIIllllIlIIl[1] = "   ".length();
        OverTriangulator.lIlIIllllIlIIl[2] = "  ".length();
        OverTriangulator.lIlIIllllIlIIl[3] = ((0xAF ^ 0xB5) & ~(0x8E ^ 0x94));
        OverTriangulator.lIlIIllllIlIIl[4] = " ".length();
    }
    
    public boolean triangulate() {
        return OverTriangulator.lIlIIllllIlIIl[4] != 0;
    }
}
