// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import org.newdawn.slick.util.FastTrig;
import java.util.ArrayList;

public class Ellipse extends Shape
{
    private /* synthetic */ float radius2;
    private static final /* synthetic */ int[] lllIlIIlllIlII;
    private /* synthetic */ int segmentCount;
    private /* synthetic */ float radius1;
    
    public Ellipse(final float llllllllllllIlIllIlllIlIIIlIlIIl, final float llllllllllllIlIllIlllIlIIIlIlIII, final float llllllllllllIlIllIlllIlIIIlIIIlI, final float llllllllllllIlIllIlllIlIIIlIIllI) {
        this(llllllllllllIlIllIlllIlIIIlIlIIl, llllllllllllIlIllIlllIlIIIlIlIII, llllllllllllIlIllIlllIlIIIlIIIlI, llllllllllllIlIllIlllIlIIIlIIllI, Ellipse.lllIlIIlllIlII[0]);
    }
    
    @Override
    protected void calculateRadius() {
        float boundingCircleRadius;
        if (lIlIIIlIlIIIIllI(lIlIIIlIlIIIlIIl(this.radius1, this.radius2))) {
            boundingCircleRadius = this.radius1;
            "".length();
            if ("   ".length() < ("  ".length() & ~"  ".length())) {
                return;
            }
        }
        else {
            boundingCircleRadius = this.radius2;
        }
        this.boundingCircleRadius = boundingCircleRadius;
    }
    
    private static boolean lIlIIIlIlIIIIlIl(final int llllllllllllIlIllIlllIIllIllIllI) {
        return llllllllllllIlIllIlllIIllIllIllI <= 0;
    }
    
    private static boolean lIlIIIlIlIIIlIII(final int llllllllllllIlIllIlllIIllIllllIl, final int llllllllllllIlIllIlllIIllIllllII) {
        return llllllllllllIlIllIlllIIllIllllIl < llllllllllllIlIllIlllIIllIllllII;
    }
    
    private static boolean lIlIIIlIlIIIIllI(final int llllllllllllIlIllIlllIIllIllIlII) {
        return llllllllllllIlIllIlllIIllIllIlII > 0;
    }
    
    private static int lIlIIIlIlIIIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIlIIIlIIlllllll() {
        (lllIlIIlllIlII = new int[5])[0] = (0x4E ^ 0xC ^ (0x9 ^ 0x79));
        Ellipse.lllIlIIlllIlII[1] = " ".length();
        Ellipse.lllIlIIlllIlII[2] = (-(0xFFFFD69F & 0x3FF3) & (0xFFFFF7FA & 0x1FFF));
        Ellipse.lllIlIIlllIlII[3] = ((0xE9 ^ 0xAC ^ (0x70 ^ 0x14)) & (159 + 20 + 6 + 6 ^ 134 + 13 - 146 + 157 ^ -" ".length()));
        Ellipse.lllIlIIlllIlII[4] = "  ".length();
    }
    
    public Ellipse(final float llllllllllllIlIllIlllIlIIIIlIIll, final float llllllllllllIlIllIlllIlIIIIllIII, final float llllllllllllIlIllIlllIlIIIIlIlll, final float llllllllllllIlIllIlllIlIIIIlIllI, final int llllllllllllIlIllIlllIlIIIIlIlIl) {
        this.x = llllllllllllIlIllIlllIlIIIIlIIll - llllllllllllIlIllIlllIlIIIIlIlll;
        this.y = llllllllllllIlIllIlllIlIIIIllIII - llllllllllllIlIllIlllIlIIIIlIllI;
        this.radius1 = llllllllllllIlIllIlllIlIIIIlIlll;
        this.radius2 = llllllllllllIlIllIlllIlIIIIlIllI;
        this.segmentCount = llllllllllllIlIllIlllIlIIIIlIlIl;
        this.checkPoints();
    }
    
    public void setRadii(final float llllllllllllIlIllIlllIlIIIIIlIlI, final float llllllllllllIlIllIlllIlIIIIIlIIl) {
        this.setRadius1(llllllllllllIlIllIlllIlIIIIIlIlI);
        this.setRadius2(llllllllllllIlIllIlllIlIIIIIlIIl);
    }
    
    @Override
    protected void createPoints() {
        final ArrayList llllllllllllIlIllIlllIIllllIIIlI = new ArrayList();
        this.maxX = -1.4E-45f;
        this.maxY = -1.4E-45f;
        this.minX = Float.MAX_VALUE;
        this.minY = Float.MAX_VALUE;
        final float llllllllllllIlIllIlllIIllllIIIIl = 0.0f;
        final float llllllllllllIlIllIlllIIllllIIIII = 359.0f;
        final float llllllllllllIlIllIlllIIlllIlllll = this.x + this.radius1;
        final float llllllllllllIlIllIlllIIlllIllllI = this.y + this.radius2;
        final int llllllllllllIlIllIlllIIlllIlllIl = Ellipse.lllIlIIlllIlII[2] / this.segmentCount;
        float llllllllllllIlIllIlllIIllllIIlIl = llllllllllllIlIllIlllIIllllIIIIl;
        while (lIlIIIlIlIIIIlIl(lIlIIIlIlIIIIIll(llllllllllllIlIllIlllIIllllIIlIl, llllllllllllIlIllIlllIIllllIIIII + llllllllllllIlIllIlllIIlllIlllIl))) {
            float llllllllllllIlIllIlllIIllllIlIII = llllllllllllIlIllIlllIIllllIIlIl;
            if (lIlIIIlIlIIIIllI(lIlIIIlIlIIIIlII(llllllllllllIlIllIlllIIllllIlIII, llllllllllllIlIllIlllIIllllIIIII))) {
                llllllllllllIlIllIlllIIllllIlIII = llllllllllllIlIllIlllIIllllIIIII;
            }
            final float llllllllllllIlIllIlllIIllllIIlll = (float)(llllllllllllIlIllIlllIIlllIlllll + FastTrig.cos(Math.toRadians(llllllllllllIlIllIlllIIllllIlIII)) * this.radius1);
            final float llllllllllllIlIllIlllIIllllIIllI = (float)(llllllllllllIlIllIlllIIlllIllllI + FastTrig.sin(Math.toRadians(llllllllllllIlIllIlllIIllllIlIII)) * this.radius2);
            if (lIlIIIlIlIIIIllI(lIlIIIlIlIIIIlII(llllllllllllIlIllIlllIIllllIIlll, this.maxX))) {
                this.maxX = llllllllllllIlIllIlllIIllllIIlll;
            }
            if (lIlIIIlIlIIIIllI(lIlIIIlIlIIIIlII(llllllllllllIlIllIlllIIllllIIllI, this.maxY))) {
                this.maxY = llllllllllllIlIllIlllIIllllIIllI;
            }
            if (lIlIIIlIlIIIIlll(lIlIIIlIlIIIIIll(llllllllllllIlIllIlllIIllllIIlll, this.minX))) {
                this.minX = llllllllllllIlIllIlllIIllllIIlll;
            }
            if (lIlIIIlIlIIIIlll(lIlIIIlIlIIIIIll(llllllllllllIlIllIlllIIllllIIllI, this.minY))) {
                this.minY = llllllllllllIlIllIlllIIllllIIllI;
            }
            llllllllllllIlIllIlllIIllllIIIlI.add(new Float(llllllllllllIlIllIlllIIllllIIlll));
            "".length();
            llllllllllllIlIllIlllIIllllIIIlI.add(new Float(llllllllllllIlIllIlllIIllllIIllI));
            "".length();
            llllllllllllIlIllIlllIIllllIIlIl += llllllllllllIlIllIlllIIlllIlllIl;
            "".length();
            if (" ".length() <= ((0xBC ^ 0xA1 ^ (0xB8 ^ 0x95)) & (0x11 ^ 0x26 ^ (0x2F ^ 0x28) ^ -" ".length()))) {
                return;
            }
        }
        this.points = new float[llllllllllllIlIllIlllIIllllIIIlI.size()];
        int llllllllllllIlIllIlllIIllllIIlII = Ellipse.lllIlIIlllIlII[3];
        while (lIlIIIlIlIIIlIII(llllllllllllIlIllIlllIIllllIIlII, this.points.length)) {
            this.points[llllllllllllIlIllIlllIIllllIIlII] = llllllllllllIlIllIlllIIllllIIIlI.get(llllllllllllIlIllIlllIIllllIIlII);
            ++llllllllllllIlIllIlllIIllllIIlII;
            "".length();
            if ((0x47 ^ 0x42) == 0x0) {
                return;
            }
        }
    }
    
    public float getRadius1() {
        return this.radius1;
    }
    
    private static int lIlIIIlIlIIIlIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setRadius1(final float llllllllllllIlIllIlllIIlllllllll) {
        if (lIlIIIlIlIIIIIIl(lIlIIIlIlIIIIIII(llllllllllllIlIllIlllIIlllllllll, this.radius1))) {
            this.radius1 = llllllllllllIlIllIlllIIlllllllll;
            this.pointsDirty = (Ellipse.lllIlIIlllIlII[1] != 0);
        }
    }
    
    private static boolean lIlIIIlIlIIIIIIl(final int llllllllllllIlIllIlllIIllIlllIlI) {
        return llllllllllllIlIllIlllIIllIlllIlI != 0;
    }
    
    public void setRadius2(final float llllllllllllIlIllIlllIIlllllIllI) {
        if (lIlIIIlIlIIIIIIl(lIlIIIlIlIIIIIlI(llllllllllllIlIllIlllIIlllllIllI, this.radius2))) {
            this.radius2 = llllllllllllIlIllIlllIIlllllIllI;
            this.pointsDirty = (Ellipse.lllIlIIlllIlII[1] != 0);
        }
    }
    
    private static int lIlIIIlIlIIIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        lIlIIIlIIlllllll();
        DEFAULT_SEGMENT_COUNT = Ellipse.lllIlIIlllIlII[0];
    }
    
    @Override
    protected void findCenter() {
        this.center = new float[Ellipse.lllIlIIlllIlII[4]];
        this.center[Ellipse.lllIlIIlllIlII[3]] = this.x + this.radius1;
        this.center[Ellipse.lllIlIIlllIlII[1]] = this.y + this.radius2;
    }
    
    private static boolean lIlIIIlIlIIIIlll(final int llllllllllllIlIllIlllIIllIlllIII) {
        return llllllllllllIlIllIlllIIllIlllIII < 0;
    }
    
    public float getRadius2() {
        return this.radius2;
    }
    
    private static int lIlIIIlIlIIIIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public Shape transform(final Transform llllllllllllIlIllIlllIIlllIIlIII) {
        this.checkPoints();
        final Polygon llllllllllllIlIllIlllIIlllIIlIll = new Polygon();
        final float[] llllllllllllIlIllIlllIIlllIIlIlI = new float[this.points.length];
        llllllllllllIlIllIlllIIlllIIlIII.transform(this.points, Ellipse.lllIlIIlllIlII[3], llllllllllllIlIllIlllIIlllIIlIlI, Ellipse.lllIlIIlllIlII[3], this.points.length / Ellipse.lllIlIIlllIlII[4]);
        llllllllllllIlIllIlllIIlllIIlIll.points = llllllllllllIlIllIlllIIlllIIlIlI;
        llllllllllllIlIllIlllIIlllIIlIll.checkPoints();
        return llllllllllllIlIllIlllIIlllIIlIll;
    }
    
    private static int lIlIIIlIlIIIIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
}
