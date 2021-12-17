// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

public class Curve extends Shape
{
    private /* synthetic */ int segments;
    private /* synthetic */ Vector2f c2;
    private static final /* synthetic */ int[] lIIlIlIlIlIlII;
    private /* synthetic */ Vector2f p1;
    private /* synthetic */ Vector2f c1;
    private /* synthetic */ Vector2f p2;
    
    private static void llIlIIIIlIlIIll() {
        (lIIlIlIlIlIlII = new int[10])[0] = (5 + 136 - 6 + 22 ^ 70 + 43 - 2 + 26);
        Curve.lIIlIlIlIlIlII[1] = " ".length();
        Curve.lIIlIlIlIlIlII[2] = "  ".length();
        Curve.lIIlIlIlIlIlII[3] = ((0xB ^ 0x6A) & ~(0xDC ^ 0xBD));
        Curve.lIIlIlIlIlIlII[4] = (0x6E ^ 0x6A ^ (0x93 ^ 0x9F));
        Curve.lIIlIlIlIlIlII[5] = "   ".length();
        Curve.lIIlIlIlIlIlII[6] = (0x1E ^ 0x1A);
        Curve.lIIlIlIlIlIlII[7] = (0x27 ^ 0x2F ^ (0x79 ^ 0x74));
        Curve.lIIlIlIlIlIlII[8] = (0x30 ^ 0x36);
        Curve.lIIlIlIlIlIlII[9] = (0xB1 ^ 0xC5 ^ (0x37 ^ 0x44));
    }
    
    @Override
    protected void createPoints() {
        final float lllllllllllllIIllIIlllllIIIllIll = 1.0f / this.segments;
        this.points = new float[(this.segments + Curve.lIIlIlIlIlIlII[1]) * Curve.lIIlIlIlIlIlII[2]];
        int lllllllllllllIIllIIlllllIIIlllIl = Curve.lIIlIlIlIlIlII[3];
        while (llIlIIIIlIlIlII(lllllllllllllIIllIIlllllIIIlllIl, this.segments + Curve.lIIlIlIlIlIlII[1])) {
            final float lllllllllllllIIllIIlllllIIIlllll = lllllllllllllIIllIIlllllIIIlllIl * lllllllllllllIIllIIlllllIIIllIll;
            final Vector2f lllllllllllllIIllIIlllllIIIllllI = this.pointAt(lllllllllllllIIllIIlllllIIIlllll);
            this.points[lllllllllllllIIllIIlllllIIIlllIl * Curve.lIIlIlIlIlIlII[2]] = lllllllllllllIIllIIlllllIIIllllI.x;
            this.points[lllllllllllllIIllIIlllllIIIlllIl * Curve.lIIlIlIlIlIlII[2] + Curve.lIIlIlIlIlIlII[1]] = lllllllllllllIIllIIlllllIIIllllI.y;
            ++lllllllllllllIIllIIlllllIIIlllIl;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private static boolean llIlIIIIlIlIlII(final int lllllllllllllIIllIIlllllIIIIIllI, final int lllllllllllllIIllIIlllllIIIIIlIl) {
        return lllllllllllllIIllIIlllllIIIIIllI < lllllllllllllIIllIIlllllIIIIIlIl;
    }
    
    public Curve(final Vector2f lllllllllllllIIllIIlllllIlIIIlll, final Vector2f lllllllllllllIIllIIlllllIlIIIllI, final Vector2f lllllllllllllIIllIIlllllIlIIlIll, final Vector2f lllllllllllllIIllIIlllllIlIIlIlI, final int lllllllllllllIIllIIlllllIlIIlIIl) {
        this.p1 = new Vector2f(lllllllllllllIIllIIlllllIlIIIlll);
        this.c1 = new Vector2f(lllllllllllllIIllIIlllllIlIIIllI);
        this.c2 = new Vector2f(lllllllllllllIIllIIlllllIlIIlIll);
        this.p2 = new Vector2f(lllllllllllllIIllIIlllllIlIIlIlI);
        this.segments = lllllllllllllIIllIIlllllIlIIlIIl;
        this.pointsDirty = (Curve.lIIlIlIlIlIlII[1] != 0);
    }
    
    @Override
    public Shape transform(final Transform lllllllllllllIIllIIlllllIIIIllII) {
        final float[] lllllllllllllIIllIIlllllIIIIllll = new float[Curve.lIIlIlIlIlIlII[4]];
        final float[] lllllllllllllIIllIIlllllIIIIlllI = new float[Curve.lIIlIlIlIlIlII[4]];
        lllllllllllllIIllIIlllllIIIIllll[Curve.lIIlIlIlIlIlII[3]] = this.p1.x;
        lllllllllllllIIllIIlllllIIIIllll[Curve.lIIlIlIlIlIlII[1]] = this.p1.y;
        lllllllllllllIIllIIlllllIIIIllll[Curve.lIIlIlIlIlIlII[2]] = this.c1.x;
        lllllllllllllIIllIIlllllIIIIllll[Curve.lIIlIlIlIlIlII[5]] = this.c1.y;
        lllllllllllllIIllIIlllllIIIIllll[Curve.lIIlIlIlIlIlII[6]] = this.c2.x;
        lllllllllllllIIllIIlllllIIIIllll[Curve.lIIlIlIlIlIlII[7]] = this.c2.y;
        lllllllllllllIIllIIlllllIIIIllll[Curve.lIIlIlIlIlIlII[8]] = this.p2.x;
        lllllllllllllIIllIIlllllIIIIllll[Curve.lIIlIlIlIlIlII[9]] = this.p2.y;
        lllllllllllllIIllIIlllllIIIIllII.transform(lllllllllllllIIllIIlllllIIIIllll, Curve.lIIlIlIlIlIlII[3], lllllllllllllIIllIIlllllIIIIlllI, Curve.lIIlIlIlIlIlII[3], Curve.lIIlIlIlIlIlII[6]);
        return new Curve(new Vector2f(lllllllllllllIIllIIlllllIIIIlllI[Curve.lIIlIlIlIlIlII[3]], lllllllllllllIIllIIlllllIIIIlllI[Curve.lIIlIlIlIlIlII[1]]), new Vector2f(lllllllllllllIIllIIlllllIIIIlllI[Curve.lIIlIlIlIlIlII[2]], lllllllllllllIIllIIlllllIIIIlllI[Curve.lIIlIlIlIlIlII[5]]), new Vector2f(lllllllllllllIIllIIlllllIIIIlllI[Curve.lIIlIlIlIlIlII[6]], lllllllllllllIIllIIlllllIIIIlllI[Curve.lIIlIlIlIlIlII[7]]), new Vector2f(lllllllllllllIIllIIlllllIIIIlllI[Curve.lIIlIlIlIlIlII[8]], lllllllllllllIIllIIlllllIIIIlllI[Curve.lIIlIlIlIlIlII[9]]));
    }
    
    @Override
    public boolean closed() {
        return Curve.lIIlIlIlIlIlII[3] != 0;
    }
    
    public Curve(final Vector2f lllllllllllllIIllIIlllllIlIlllIl, final Vector2f lllllllllllllIIllIIlllllIlIlllII, final Vector2f lllllllllllllIIllIIlllllIlIlIllI, final Vector2f lllllllllllllIIllIIlllllIlIlIlIl) {
        this(lllllllllllllIIllIIlllllIlIlllIl, lllllllllllllIIllIIlllllIlIlllII, lllllllllllllIIllIIlllllIlIlIllI, lllllllllllllIIllIIlllllIlIlIlIl, Curve.lIIlIlIlIlIlII[0]);
    }
    
    static {
        llIlIIIIlIlIIll();
    }
    
    public Vector2f pointAt(final float lllllllllllllIIllIIlllllIIllIlll) {
        final float lllllllllllllIIllIIlllllIIllIllI = 1.0f - lllllllllllllIIllIIlllllIIllIlll;
        final float lllllllllllllIIllIIlllllIIllIlIl = lllllllllllllIIllIIlllllIIllIlll;
        final float lllllllllllllIIllIIlllllIIllIlII = lllllllllllllIIllIIlllllIIllIllI * lllllllllllllIIllIIlllllIIllIllI * lllllllllllllIIllIIlllllIIllIllI;
        final float lllllllllllllIIllIIlllllIIllIIll = 3.0f * lllllllllllllIIllIIlllllIIllIllI * lllllllllllllIIllIIlllllIIllIllI * lllllllllllllIIllIIlllllIIllIlIl;
        final float lllllllllllllIIllIIlllllIIllIIlI = 3.0f * lllllllllllllIIllIIlllllIIllIllI * lllllllllllllIIllIIlllllIIllIlIl * lllllllllllllIIllIIlllllIIllIlIl;
        final float lllllllllllllIIllIIlllllIIllIIIl = lllllllllllllIIllIIlllllIIllIlIl * lllllllllllllIIllIIlllllIIllIlIl * lllllllllllllIIllIIlllllIIllIlIl;
        final float lllllllllllllIIllIIlllllIIllIIII = this.p1.x * lllllllllllllIIllIIlllllIIllIlII + this.c1.x * lllllllllllllIIllIIlllllIIllIIll + this.c2.x * lllllllllllllIIllIIlllllIIllIIlI + this.p2.x * lllllllllllllIIllIIlllllIIllIIIl;
        final float lllllllllllllIIllIIlllllIIlIllll = this.p1.y * lllllllllllllIIllIIlllllIIllIlII + this.c1.y * lllllllllllllIIllIIlllllIIllIIll + this.c2.y * lllllllllllllIIllIIlllllIIllIIlI + this.p2.y * lllllllllllllIIllIIlllllIIllIIIl;
        return new Vector2f(lllllllllllllIIllIIlllllIIllIIII, lllllllllllllIIllIIlllllIIlIllll);
    }
}
