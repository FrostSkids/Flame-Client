// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

public class Point extends Shape
{
    private static final /* synthetic */ int[] llllllIllIlIl;
    
    @Override
    public Shape transform(final Transform lllllllllllllIlIlIlIIlllIlIIIIlI) {
        final float[] lllllllllllllIlIlIlIIlllIlIIIIIl = new float[this.points.length];
        lllllllllllllIlIlIlIIlllIlIIIIlI.transform(this.points, Point.llllllIllIlIl[0], lllllllllllllIlIlIlIIlllIlIIIIIl, Point.llllllIllIlIl[0], this.points.length / Point.llllllIllIlIl[1]);
        return new Point(this.points[Point.llllllIllIlIl[0]], this.points[Point.llllllIllIlIl[2]]);
    }
    
    @Override
    protected void calculateRadius() {
        this.boundingCircleRadius = 0.0f;
    }
    
    private static void lIllIIIIIlIlllI() {
        (llllllIllIlIl = new int[3])[0] = ((0xC2 ^ 0x8F) & ~(0x4C ^ 0x1));
        Point.llllllIllIlIl[1] = "  ".length();
        Point.llllllIllIlIl[2] = " ".length();
    }
    
    @Override
    protected void findCenter() {
        this.center = new float[Point.llllllIllIlIl[1]];
        this.center[Point.llllllIllIlIl[0]] = this.points[Point.llllllIllIlIl[0]];
        this.center[Point.llllllIllIlIl[2]] = this.points[Point.llllllIllIlIl[2]];
    }
    
    public Point(final float lllllllllllllIlIlIlIIlllIlIIlIII, final float lllllllllllllIlIlIlIIlllIlIIIlll) {
        this.x = lllllllllllllIlIlIlIIlllIlIIlIII;
        this.y = lllllllllllllIlIlIlIIlllIlIIIlll;
        this.checkPoints();
    }
    
    @Override
    protected void createPoints() {
        this.points = new float[Point.llllllIllIlIl[1]];
        this.points[Point.llllllIllIlIl[0]] = this.getX();
        this.points[Point.llllllIllIlIl[2]] = this.getY();
        this.maxX = this.x;
        this.maxY = this.y;
        this.minX = this.x;
        this.minY = this.y;
        this.findCenter();
        this.calculateRadius();
    }
    
    static {
        lIllIIIIIlIlllI();
    }
}
