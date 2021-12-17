// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.geom.TexCoordGenerator;

public class RadialGradientFill implements TexCoordGenerator
{
    private /* synthetic */ Gradient gradient;
    private /* synthetic */ Vector2f centre;
    private /* synthetic */ float radius;
    private static final /* synthetic */ int[] lIIlIlllIlIlIl;
    
    static {
        llIlIlIIIIIIIII();
    }
    
    public Vector2f getCoordFor(final float lllllllllllllIIllIIIIIlIlllIIIll, final float lllllllllllllIIllIIIIIlIlllIIIlI) {
        float lllllllllllllIIllIIIIIlIlllIIIIl = this.centre.distance(new Vector2f(lllllllllllllIIllIIIIIlIlllIIIll, lllllllllllllIIllIIIIIlIlllIIIlI));
        lllllllllllllIIllIIIIIlIlllIIIIl /= this.radius;
        if (llIlIlIIIIIIIlI(llIlIlIIIIIIIIl(lllllllllllllIIllIIIIIlIlllIIIIl, 0.99f))) {
            lllllllllllllIIllIIIIIlIlllIIIIl = 0.99f;
        }
        return new Vector2f(lllllllllllllIIllIIIIIlIlllIIIIl, 0.0f);
    }
    
    public RadialGradientFill(final Shape lllllllllllllIIllIIIIIlIlllllIII, final Transform lllllllllllllIIllIIIIIlIlllIllll, final Gradient lllllllllllllIIllIIIIIlIllllIllI) {
        this.gradient = lllllllllllllIIllIIIIIlIllllIllI;
        this.radius = lllllllllllllIIllIIIIIlIllllIllI.getR();
        final float lllllllllllllIIllIIIIIlIllllIlIl = lllllllllllllIIllIIIIIlIllllIllI.getX1();
        final float lllllllllllllIIllIIIIIlIllllIlII = lllllllllllllIIllIIIIIlIllllIllI.getY1();
        final float[] array = new float[RadialGradientFill.lIIlIlllIlIlIl[0]];
        array[RadialGradientFill.lIIlIlllIlIlIl[1]] = lllllllllllllIIllIIIIIlIllllIlIl;
        array[RadialGradientFill.lIIlIlllIlIlIl[2]] = lllllllllllllIIllIIIIIlIllllIlII;
        final float[] lllllllllllllIIllIIIIIlIllllIIll = array;
        lllllllllllllIIllIIIIIlIllllIllI.getTransform().transform(lllllllllllllIIllIIIIIlIllllIIll, RadialGradientFill.lIIlIlllIlIlIl[1], lllllllllllllIIllIIIIIlIllllIIll, RadialGradientFill.lIIlIlllIlIlIl[1], RadialGradientFill.lIIlIlllIlIlIl[2]);
        lllllllllllllIIllIIIIIlIlllIllll.transform(lllllllllllllIIllIIIIIlIllllIIll, RadialGradientFill.lIIlIlllIlIlIl[1], lllllllllllllIIllIIIIIlIllllIIll, RadialGradientFill.lIIlIlllIlIlIl[1], RadialGradientFill.lIIlIlllIlIlIl[2]);
        final float[] array2 = new float[RadialGradientFill.lIIlIlllIlIlIl[0]];
        array2[RadialGradientFill.lIIlIlllIlIlIl[1]] = lllllllllllllIIllIIIIIlIllllIlIl;
        array2[RadialGradientFill.lIIlIlllIlIlIl[2]] = lllllllllllllIIllIIIIIlIllllIlII - this.radius;
        final float[] lllllllllllllIIllIIIIIlIllllIIlI = array2;
        lllllllllllllIIllIIIIIlIllllIllI.getTransform().transform(lllllllllllllIIllIIIIIlIllllIIlI, RadialGradientFill.lIIlIlllIlIlIl[1], lllllllllllllIIllIIIIIlIllllIIlI, RadialGradientFill.lIIlIlllIlIlIl[1], RadialGradientFill.lIIlIlllIlIlIl[2]);
        lllllllllllllIIllIIIIIlIlllIllll.transform(lllllllllllllIIllIIIIIlIllllIIlI, RadialGradientFill.lIIlIlllIlIlIl[1], lllllllllllllIIllIIIIIlIllllIIlI, RadialGradientFill.lIIlIlllIlIlIl[1], RadialGradientFill.lIIlIlllIlIlIl[2]);
        this.centre = new Vector2f(lllllllllllllIIllIIIIIlIllllIIll[RadialGradientFill.lIIlIlllIlIlIl[1]], lllllllllllllIIllIIIIIlIllllIIll[RadialGradientFill.lIIlIlllIlIlIl[2]]);
        final Vector2f lllllllllllllIIllIIIIIlIllllIIIl = new Vector2f(lllllllllllllIIllIIIIIlIllllIIlI[RadialGradientFill.lIIlIlllIlIlIl[1]], lllllllllllllIIllIIIIIlIllllIIlI[RadialGradientFill.lIIlIlllIlIlIl[2]]);
        this.radius = lllllllllllllIIllIIIIIlIllllIIIl.distance(this.centre);
    }
    
    private static int llIlIlIIIIIIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void llIlIlIIIIIIIII() {
        (lIIlIlllIlIlIl = new int[3])[0] = "  ".length();
        RadialGradientFill.lIIlIlllIlIlIl[1] = ((0xD0 ^ 0xB1) & ~(0xD9 ^ 0xB8));
        RadialGradientFill.lIIlIlllIlIlIl[2] = " ".length();
    }
    
    private static boolean llIlIlIIIIIIIlI(final int lllllllllllllIIllIIIIIlIllIllIll) {
        return lllllllllllllIIllIIIIIlIllIllIll > 0;
    }
}
