// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

public strictfp class Circle extends Ellipse
{
    private static final /* synthetic */ int[] llIllIIlIIlllI;
    public /* synthetic */ float radius;
    
    @Override
    public strictfp float getCenterX() {
        return this.getX() + this.radius;
    }
    
    @Override
    public strictfp float[] getCenter() {
        final float[] array = new float[Circle.llIllIIlIIlllI[1]];
        array[Circle.llIllIIlIIlllI[2]] = this.getCenterX();
        array[Circle.llIllIIlIIlllI[3]] = this.getCenterY();
        return array;
    }
    
    private static boolean lIIlIllIllIlllIl(final int llllllllllllIllIIllllIlllllIllll) {
        return llllllllllllIllIIllllIlllllIllll > 0;
    }
    
    private static int lIIlIllIlllIIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected strictfp void findCenter() {
        this.center = new float[Circle.llIllIIlIIlllI[1]];
        this.center[Circle.llIllIIlIIlllI[2]] = this.x + this.radius;
        this.center[Circle.llIllIIlIIlllI[3]] = this.y + this.radius;
    }
    
    private static boolean lIIlIllIllIllIll(final int llllllllllllIllIIllllIllllllIlll) {
        return llllllllllllIllIIllllIllllllIlll != 0;
    }
    
    private static boolean lIIlIllIlllIIlIl(final int llllllllllllIllIIllllIllllllIIIl) {
        return llllllllllllIllIIllllIllllllIIIl <= 0;
    }
    
    private static boolean lIIlIllIlllIIIlI(final int llllllllllllIllIIllllIlllllllIlI, final int llllllllllllIllIIllllIlllllllIIl) {
        return llllllllllllIllIIllllIlllllllIlI < llllllllllllIllIIllllIlllllllIIl;
    }
    
    public strictfp void setRadius(final float llllllllllllIllIIlllllIIIllllIII) {
        if (lIIlIllIllIllIll(lIIlIllIllIllIlI(llllllllllllIllIIlllllIIIllllIII, this.radius))) {
            this.pointsDirty = (Circle.llIllIIlIIlllI[3] != 0);
            this.radius = llllllllllllIllIIlllllIIIllllIII;
            this.setRadii(llllllllllllIllIIlllllIIIllllIII, llllllllllllIllIIlllllIIIllllIII);
        }
    }
    
    @Override
    public strictfp boolean intersects(final Shape llllllllllllIllIIlllllIIIllIIlll) {
        if (lIIlIllIllIllIll((llllllllllllIllIIlllllIIIllIIlll instanceof Circle) ? 1 : 0)) {
            final Circle llllllllllllIllIIlllllIIIllIlllI = (Circle)llllllllllllIllIIlllllIIIllIIlll;
            float llllllllllllIllIIlllllIIIllIllIl = this.getRadius() + llllllllllllIllIIlllllIIIllIlllI.getRadius();
            if (lIIlIllIllIlllIl(lIIlIllIllIlllII(Math.abs(llllllllllllIllIIlllllIIIllIlllI.getCenterX() - this.getCenterX()), llllllllllllIllIIlllllIIIllIllIl))) {
                return Circle.llIllIIlIIlllI[2] != 0;
            }
            if (lIIlIllIllIlllIl(lIIlIllIllIlllII(Math.abs(llllllllllllIllIIlllllIIIllIlllI.getCenterY() - this.getCenterY()), llllllllllllIllIIlllllIIIllIllIl))) {
                return Circle.llIllIIlIIlllI[2] != 0;
            }
            llllllllllllIllIIlllllIIIllIllIl *= llllllllllllIllIIlllllIIIllIllIl;
            final float llllllllllllIllIIlllllIIIllIllII = Math.abs(llllllllllllIllIIlllllIIIllIlllI.getCenterX() - this.getCenterX());
            final float llllllllllllIllIIlllllIIIllIlIll = Math.abs(llllllllllllIllIIlllllIIIllIlllI.getCenterY() - this.getCenterY());
            int n;
            if (lIIlIllIllIllllI(lIIlIllIllIlllII(llllllllllllIllIIlllllIIIllIllIl, llllllllllllIllIIlllllIIIllIllII * llllllllllllIllIIlllllIIIllIllII + llllllllllllIllIIlllllIIIllIlIll * llllllllllllIllIIlllllIIIllIlIll))) {
                n = Circle.llIllIIlIIlllI[3];
                "".length();
                if (-" ".length() < -" ".length()) {
                    return ((0xF0 ^ 0x9E ^ (0x2E ^ 0x14)) & (0xAC ^ 0xB3 ^ (0x78 ^ 0x33) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = Circle.llIllIIlIIlllI[2];
            }
            return n != 0;
        }
        else {
            if (lIIlIllIllIllIll((llllllllllllIllIIlllllIIIllIIlll instanceof Rectangle) ? 1 : 0)) {
                return this.intersects((Rectangle)llllllllllllIllIIlllllIIIllIIlll);
            }
            return super.intersects(llllllllllllIllIIlllllIIIllIIlll);
        }
    }
    
    @Override
    public strictfp float getCenterY() {
        return this.getY() + this.radius;
    }
    
    public strictfp float getRadius() {
        return this.radius;
    }
    
    private static void lIIlIllIllIllIIl() {
        (llIllIIlIIlllI = new int[6])[0] = (0x77 ^ 0x45);
        Circle.llIllIIlIIlllI[1] = "  ".length();
        Circle.llIllIIlIIlllI[2] = ((0xF9 ^ 0xB6) & ~(0x34 ^ 0x7B));
        Circle.llIllIIlIIlllI[3] = " ".length();
        Circle.llIllIIlIIlllI[4] = (129 + 109 - 148 + 106 ^ 178 + 178 - 238 + 74);
        Circle.llIllIIlIIlllI[5] = "   ".length();
    }
    
    @Override
    public strictfp boolean contains(final float llllllllllllIllIIlllllIIIlIlllII, final float llllllllllllIllIIlllllIIIlIlIllI) {
        final float llllllllllllIllIIlllllIIIlIllIlI = llllllllllllIllIIlllllIIIlIlllII - this.getCenterX();
        final float llllllllllllIllIIlllllIIIlIllIIl = llllllllllllIllIIlllllIIIlIlIllI - this.getCenterY();
        int n;
        if (lIIlIllIlllIIIII(lIIlIllIllIlllll(llllllllllllIllIIlllllIIIlIllIlI * llllllllllllIllIIlllllIIIlIllIlI + llllllllllllIllIIlllllIIIlIllIIl * llllllllllllIllIIlllllIIIlIllIIl, this.getRadius() * this.getRadius()))) {
            n = Circle.llIllIIlIIlllI[3];
            "".length();
            if (" ".length() < 0) {
                return ((0xB7 ^ 0x90) & ~(0x67 ^ 0x40)) != 0x0;
            }
        }
        else {
            n = Circle.llIllIIlIIlllI[2];
        }
        return n != 0;
    }
    
    private strictfp boolean contains(final Line llllllllllllIllIIlllllIIIlIIlllI) {
        int n;
        if (lIIlIllIllIllIll(this.contains(llllllllllllIllIIlllllIIIlIIlllI.getX1(), llllllllllllIllIIlllllIIIlIIlllI.getY1()) ? 1 : 0) && lIIlIllIllIllIll(this.contains(llllllllllllIllIIlllllIIIlIIlllI.getX2(), llllllllllllIllIIlllllIIIlIIlllI.getY2()) ? 1 : 0)) {
            n = Circle.llIllIIlIIlllI[3];
            "".length();
            if (-"  ".length() >= 0) {
                return ((0xA8 ^ 0x94) & ~(0xE ^ 0x32)) != 0x0;
            }
        }
        else {
            n = Circle.llIllIIlIIlllI[2];
        }
        return n != 0;
    }
    
    private static int lIIlIllIlllIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIIlIllIllIlllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIlIllIllIllllI(final int llllllllllllIllIIllllIllllllIlIl) {
        return llllllllllllIllIIllllIllllllIlIl >= 0;
    }
    
    private static int lIIlIllIlllIIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected strictfp void calculateRadius() {
        this.boundingCircleRadius = this.radius;
    }
    
    private static int lIIlIllIllIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private strictfp boolean intersects(final Rectangle llllllllllllIllIIlllllIIIIlIllII) {
        final Rectangle llllllllllllIllIIlllllIIIIllIllI = llllllllllllIllIIlllllIIIIlIllII;
        final Circle llllllllllllIllIIlllllIIIIllIlIl = this;
        if (lIIlIllIllIllIll(llllllllllllIllIIlllllIIIIllIllI.contains(this.x + this.radius, this.y + this.radius) ? 1 : 0)) {
            return Circle.llIllIIlIIlllI[3] != 0;
        }
        final float llllllllllllIllIIlllllIIIIllIlII = llllllllllllIllIIlllllIIIIllIllI.getX();
        final float llllllllllllIllIIlllllIIIIllIIll = llllllllllllIllIIlllllIIIIllIllI.getY();
        final float llllllllllllIllIIlllllIIIIllIIlI = llllllllllllIllIIlllllIIIIllIllI.getX() + llllllllllllIllIIlllllIIIIllIllI.getWidth();
        final float llllllllllllIllIIlllllIIIIllIIIl = llllllllllllIllIIlllllIIIIllIllI.getY() + llllllllllllIllIIlllllIIIIllIllI.getHeight();
        final Line[] llllllllllllIllIIlllllIIIIllIIII = new Line[Circle.llIllIIlIIlllI[4]];
        llllllllllllIllIIlllllIIIIllIIII[Circle.llIllIIlIIlllI[2]] = new Line(llllllllllllIllIIlllllIIIIllIlII, llllllllllllIllIIlllllIIIIllIIll, llllllllllllIllIIlllllIIIIllIIlI, llllllllllllIllIIlllllIIIIllIIll);
        llllllllllllIllIIlllllIIIIllIIII[Circle.llIllIIlIIlllI[3]] = new Line(llllllllllllIllIIlllllIIIIllIIlI, llllllllllllIllIIlllllIIIIllIIll, llllllllllllIllIIlllllIIIIllIIlI, llllllllllllIllIIlllllIIIIllIIIl);
        llllllllllllIllIIlllllIIIIllIIII[Circle.llIllIIlIIlllI[1]] = new Line(llllllllllllIllIIlllllIIIIllIIlI, llllllllllllIllIIlllllIIIIllIIIl, llllllllllllIllIIlllllIIIIllIlII, llllllllllllIllIIlllllIIIIllIIIl);
        llllllllllllIllIIlllllIIIIllIIII[Circle.llIllIIlIIlllI[5]] = new Line(llllllllllllIllIIlllllIIIIllIlII, llllllllllllIllIIlllllIIIIllIIIl, llllllllllllIllIIlllllIIIIllIlII, llllllllllllIllIIlllllIIIIllIIll);
        final float llllllllllllIllIIlllllIIIIlIllll = llllllllllllIllIIlllllIIIIllIlIl.getRadius() * llllllllllllIllIIlllllIIIIllIlIl.getRadius();
        final Vector2f llllllllllllIllIIlllllIIIIlIlllI = new Vector2f(llllllllllllIllIIlllllIIIIllIlIl.getCenterX(), llllllllllllIllIIlllllIIIIllIlIl.getCenterY());
        int llllllllllllIllIIlllllIIIIlllIIl = Circle.llIllIIlIIlllI[2];
        while (lIIlIllIlllIIIlI(llllllllllllIllIIlllllIIIIlllIIl, Circle.llIllIIlIIlllI[4])) {
            final float llllllllllllIllIIlllllIIIIlllIlI = llllllllllllIllIIlllllIIIIllIIII[llllllllllllIllIIlllllIIIIlllIIl].distanceSquared(llllllllllllIllIIlllllIIIIlIlllI);
            if (lIIlIllIlllIIIII(lIIlIllIlllIIIIl(llllllllllllIllIIlllllIIIIlllIlI, llllllllllllIllIIlllllIIIIlIllll))) {
                return Circle.llIllIIlIIlllI[3] != 0;
            }
            ++llllllllllllIllIIlllllIIIIlllIIl;
            "".length();
            if (" ".length() == 0) {
                return ((0x56 ^ 0x4 ^ (0x76 ^ 0x7)) & (0x77 ^ 0x15 ^ (0xC6 ^ 0x87) ^ -" ".length())) != 0x0;
            }
        }
        return Circle.llIllIIlIIlllI[2] != 0;
    }
    
    static {
        lIIlIllIllIllIIl();
    }
    
    private strictfp boolean intersects(final Line llllllllllllIllIIlllllIIIIIlIIIl) {
        final Vector2f llllllllllllIllIIlllllIIIIIlIIII = new Vector2f(llllllllllllIllIIlllllIIIIIlIIIl.getX1(), llllllllllllIllIIlllllIIIIIlIIIl.getY1());
        final Vector2f llllllllllllIllIIlllllIIIIIIllll = new Vector2f(llllllllllllIllIIlllllIIIIIlIIIl.getX2(), llllllllllllIllIIlllllIIIIIlIIIl.getY2());
        final Vector2f llllllllllllIllIIlllllIIIIIIlllI = new Vector2f(this.getCenterX(), this.getCenterY());
        final Vector2f llllllllllllIllIIlllllIIIIIIllII = llllllllllllIllIIlllllIIIIIIllll.copy().sub(llllllllllllIllIIlllllIIIIIlIIII);
        final Vector2f llllllllllllIllIIlllllIIIIIIlIll = llllllllllllIllIIlllllIIIIIIlllI.copy().sub(llllllllllllIllIIlllllIIIIIlIIII);
        final float llllllllllllIllIIlllllIIIIIIlIlI = llllllllllllIllIIlllllIIIIIIllII.length();
        final float llllllllllllIllIIlllllIIIIIIlIIl = llllllllllllIllIIlllllIIIIIIlIll.dot(llllllllllllIllIIlllllIIIIIIllII) / llllllllllllIllIIlllllIIIIIIlIlI;
        Vector2f llllllllllllIllIIlllllIIIIIIllIl = null;
        if (lIIlIllIlllIIIII(lIIlIllIlllIIIll(llllllllllllIllIIlllllIIIIIIlIIl, 0.0f))) {
            final Vector2f llllllllllllIllIIlllllIIIIIlIlIl = llllllllllllIllIIlllllIIIIIlIIII;
            "".length();
            if (((0xF3 ^ 0xB7) & ~(0xDD ^ 0x99)) != ((0x8A ^ 0xAD) & ~(0x22 ^ 0x5))) {
                return ((0xD4 ^ 0xC1) & ~(0x75 ^ 0x60)) != 0x0;
            }
        }
        else if (lIIlIllIllIlllIl(lIIlIllIlllIIlII(llllllllllllIllIIlllllIIIIIIlIIl, llllllllllllIllIIlllllIIIIIIlIlI))) {
            final Vector2f llllllllllllIllIIlllllIIIIIlIlII = llllllllllllIllIIlllllIIIIIIllll;
            "".length();
            if ("  ".length() == 0) {
                return ((0x70 ^ 0x13) & ~(0x31 ^ 0x52)) != 0x0;
            }
        }
        else {
            final Vector2f llllllllllllIllIIlllllIIIIIlIIll = llllllllllllIllIIlllllIIIIIIllII.copy().scale(llllllllllllIllIIlllllIIIIIIlIIl / llllllllllllIllIIlllllIIIIIIlIlI);
            llllllllllllIllIIlllllIIIIIIllIl = llllllllllllIllIIlllllIIIIIlIIII.copy().add(llllllllllllIllIIlllllIIIIIlIIll);
        }
        int n;
        if (lIIlIllIlllIIlIl(lIIlIllIlllIIIll(llllllllllllIllIIlllllIIIIIIlllI.copy().sub(llllllllllllIllIIlllllIIIIIIllIl).lengthSquared(), this.getRadius() * this.getRadius()))) {
            n = Circle.llIllIIlIIlllI[3];
            "".length();
            if ("  ".length() <= 0) {
                return ((71 + 106 - 72 + 36 ^ 115 + 83 - 143 + 77) & (94 + 94 - 177 + 153 ^ 152 + 120 - 131 + 32 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Circle.llIllIIlIIlllI[2];
        }
        final boolean llllllllllllIllIIlllllIIIIIIlIII = n != 0;
        return llllllllllllIllIIlllllIIIIIIlIII;
    }
    
    public Circle(final float llllllllllllIllIIlllllIIlIIIllll, final float llllllllllllIllIIlllllIIlIIIlIIl, final float llllllllllllIllIIlllllIIlIIIllIl, final int llllllllllllIllIIlllllIIlIIIIlll) {
        super(llllllllllllIllIIlllllIIlIIIllll, llllllllllllIllIIlllllIIlIIIlIIl, llllllllllllIllIIlllllIIlIIIllIl, llllllllllllIllIIlllllIIlIIIllIl, llllllllllllIllIIlllllIIlIIIIlll);
        this.x = llllllllllllIllIIlllllIIlIIIllll - llllllllllllIllIIlllllIIlIIIllIl;
        this.y = llllllllllllIllIIlllllIIlIIIlIIl - llllllllllllIllIIlllllIIlIIIllIl;
        this.radius = llllllllllllIllIIlllllIIlIIIllIl;
        this.boundingCircleRadius = llllllllllllIllIIlllllIIlIIIllIl;
    }
    
    private static boolean lIIlIllIlllIIIII(final int llllllllllllIllIIllllIllllllIIll) {
        return llllllllllllIllIIllllIllllllIIll < 0;
    }
    
    private static int lIIlIllIllIlllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public Circle(final float llllllllllllIllIIlllllIIlIIlllII, final float llllllllllllIllIIlllllIIlIIlIlll, final float llllllllllllIllIIlllllIIlIIlIllI) {
        this(llllllllllllIllIIlllllIIlIIlllII, llllllllllllIllIIlllllIIlIIlIlll, llllllllllllIllIIlllllIIlIIlIllI, Circle.llIllIIlIIlllI[0]);
    }
}
