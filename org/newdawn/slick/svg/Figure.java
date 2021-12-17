// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Transform;

public class Figure
{
    private /* synthetic */ Transform transform;
    private /* synthetic */ NonGeometricData data;
    private /* synthetic */ Shape shape;
    private /* synthetic */ int type;
    private static final /* synthetic */ int[] lllllIIlllIll;
    
    public NonGeometricData getData() {
        return this.data;
    }
    
    private static void lIlIlllIIIIIlll() {
        (lllllIIlllIll = new int[5])[0] = (0x56 ^ 0x53);
        Figure.lllllIIlllIll[1] = "  ".length();
        Figure.lllllIIlllIll[2] = " ".length();
        Figure.lllllIIlllIll[3] = (0x13 ^ 0x37 ^ (0x38 ^ 0x18));
        Figure.lllllIIlllIll[4] = "   ".length();
    }
    
    public Figure(final int lllllllllllllIlIlIlllIlIlIIllIII, final Shape lllllllllllllIlIlIlllIlIlIIlIIlI, final NonGeometricData lllllllllllllIlIlIlllIlIlIIlIIIl, final Transform lllllllllllllIlIlIlllIlIlIIlIIII) {
        this.shape = lllllllllllllIlIlIlllIlIlIIlIIlI;
        this.data = lllllllllllllIlIlIlllIlIlIIlIIIl;
        this.type = lllllllllllllIlIlIlllIlIlIIllIII;
        this.transform = lllllllllllllIlIlIlllIlIlIIlIIII;
    }
    
    static {
        lIlIlllIIIIIlll();
        POLYGON = Figure.lllllIIlllIll[0];
        LINE = Figure.lllllIIlllIll[1];
        ELLIPSE = Figure.lllllIIlllIll[2];
        PATH = Figure.lllllIIlllIll[3];
        RECTANGLE = Figure.lllllIIlllIll[4];
    }
    
    public Transform getTransform() {
        return this.transform;
    }
    
    public int getType() {
        return this.type;
    }
    
    public Shape getShape() {
        return this.shape;
    }
}
