// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.geom.Line;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.TexCoordGenerator;

public class LinearGradientFill implements TexCoordGenerator
{
    private static final /* synthetic */ int[] lIlIlIlIIlllII;
    private /* synthetic */ Line line;
    private /* synthetic */ Vector2f end;
    private /* synthetic */ Gradient gradient;
    private /* synthetic */ Vector2f start;
    
    private static void lllIlllIIIlIIII() {
        (lIlIlIlIIlllII = new int[3])[0] = "  ".length();
        LinearGradientFill.lIlIlIlIIlllII[1] = ((95 + 64 - 152 + 177 ^ 86 + 17 - 14 + 80) & (16 + 104 - 75 + 100 ^ 126 + 79 - 188 + 111 ^ -" ".length()));
        LinearGradientFill.lIlIlIlIIlllII[2] = " ".length();
    }
    
    public LinearGradientFill(final Shape lllllllllllllIIIlIIIIllIIIlIIlII, final Transform lllllllllllllIIIlIIIIllIIIIllIII, final Gradient lllllllllllllIIIlIIIIllIIIIlIlll) {
        this.gradient = lllllllllllllIIIlIIIIllIIIIlIlll;
        final float lllllllllllllIIIlIIIIllIIIlIIIIl = lllllllllllllIIIlIIIIllIIIIlIlll.getX1();
        final float lllllllllllllIIIlIIIIllIIIlIIIII = lllllllllllllIIIlIIIIllIIIIlIlll.getY1();
        final float lllllllllllllIIIlIIIIllIIIIlllll = lllllllllllllIIIlIIIIllIIIIlIlll.getX2();
        final float lllllllllllllIIIlIIIIllIIIIllllI = lllllllllllllIIIlIIIIllIIIIlIlll.getY2();
        final float lllllllllllllIIIlIIIIllIIIIlllIl = lllllllllllllIIIlIIIIllIIIIllllI - lllllllllllllIIIlIIIIllIIIlIIIII;
        final float lllllllllllllIIIlIIIIllIIIIlllII = lllllllllllllIIIlIIIIllIIIIlllll - lllllllllllllIIIlIIIIllIIIlIIIIl;
        final float[] array = new float[LinearGradientFill.lIlIlIlIIlllII[0]];
        array[LinearGradientFill.lIlIlIlIIlllII[1]] = lllllllllllllIIIlIIIIllIIIlIIIIl;
        array[LinearGradientFill.lIlIlIlIIlllII[2]] = lllllllllllllIIIlIIIIllIIIlIIIII + lllllllllllllIIIlIIIIllIIIIlllIl / 2.0f;
        final float[] lllllllllllllIIIlIIIIllIIIIllIll = array;
        lllllllllllllIIIlIIIIllIIIIlIlll.getTransform().transform(lllllllllllllIIIlIIIIllIIIIllIll, LinearGradientFill.lIlIlIlIIlllII[1], lllllllllllllIIIlIIIIllIIIIllIll, LinearGradientFill.lIlIlIlIIlllII[1], LinearGradientFill.lIlIlIlIIlllII[2]);
        lllllllllllllIIIlIIIIllIIIIllIII.transform(lllllllllllllIIIlIIIIllIIIIllIll, LinearGradientFill.lIlIlIlIIlllII[1], lllllllllllllIIIlIIIIllIIIIllIll, LinearGradientFill.lIlIlIlIIlllII[1], LinearGradientFill.lIlIlIlIIlllII[2]);
        final float[] array2 = new float[LinearGradientFill.lIlIlIlIIlllII[0]];
        array2[LinearGradientFill.lIlIlIlIIlllII[1]] = lllllllllllllIIIlIIIIllIIIlIIIIl + lllllllllllllIIIlIIIIllIIIIlllII;
        array2[LinearGradientFill.lIlIlIlIIlllII[2]] = lllllllllllllIIIlIIIIllIIIlIIIII + lllllllllllllIIIlIIIIllIIIIlllIl / 2.0f;
        final float[] lllllllllllllIIIlIIIIllIIIIllIlI = array2;
        lllllllllllllIIIlIIIIllIIIIlIlll.getTransform().transform(lllllllllllllIIIlIIIIllIIIIllIlI, LinearGradientFill.lIlIlIlIIlllII[1], lllllllllllllIIIlIIIIllIIIIllIlI, LinearGradientFill.lIlIlIlIIlllII[1], LinearGradientFill.lIlIlIlIIlllII[2]);
        lllllllllllllIIIlIIIIllIIIIllIII.transform(lllllllllllllIIIlIIIIllIIIIllIlI, LinearGradientFill.lIlIlIlIIlllII[1], lllllllllllllIIIlIIIIllIIIIllIlI, LinearGradientFill.lIlIlIlIIlllII[1], LinearGradientFill.lIlIlIlIIlllII[2]);
        this.start = new Vector2f(lllllllllllllIIIlIIIIllIIIIllIll[LinearGradientFill.lIlIlIlIIlllII[1]], lllllllllllllIIIlIIIIllIIIIllIll[LinearGradientFill.lIlIlIlIIlllII[2]]);
        this.end = new Vector2f(lllllllllllllIIIlIIIIllIIIIllIlI[LinearGradientFill.lIlIlIlIIlllII[1]], lllllllllllllIIIlIIIIllIIIIllIlI[LinearGradientFill.lIlIlIlIIlllII[2]]);
        this.line = new Line(this.start, this.end);
    }
    
    static {
        lllIlllIIIlIIII();
    }
    
    public Vector2f getCoordFor(final float lllllllllllllIIIlIIIIllIIIIIlIII, final float lllllllllllllIIIlIIIIllIIIIIIlll) {
        final Vector2f lllllllllllllIIIlIIIIllIIIIIIllI = new Vector2f();
        this.line.getClosestPoint(new Vector2f(lllllllllllllIIIlIIIIllIIIIIlIII, lllllllllllllIIIlIIIIllIIIIIIlll), lllllllllllllIIIlIIIIllIIIIIIllI);
        float lllllllllllllIIIlIIIIllIIIIIIlIl = lllllllllllllIIIlIIIIllIIIIIIllI.distance(this.start);
        lllllllllllllIIIlIIIIllIIIIIIlIl /= this.line.length();
        return new Vector2f(lllllllllllllIIIlIIIIllIIIIIIlIl, 0.0f);
    }
}
