// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.io.Serializable;

public abstract class Shape implements Serializable
{
    protected /* synthetic */ boolean pointsDirty;
    protected /* synthetic */ float x;
    protected /* synthetic */ float maxY;
    protected transient /* synthetic */ Triangulator tris;
    protected /* synthetic */ boolean trianglesDirty;
    protected /* synthetic */ float boundingCircleRadius;
    protected /* synthetic */ float minX;
    protected /* synthetic */ float minY;
    protected /* synthetic */ float[] points;
    protected /* synthetic */ float[] center;
    private static final /* synthetic */ int[] lIIlIIlllIlIll;
    protected /* synthetic */ float y;
    protected /* synthetic */ float maxX;
    
    public boolean hasVertex(final float lllllllllllllIIllIllIIIIlIIIllII, final float lllllllllllllIIllIllIIIIlIIIlIII) {
        if (llIIlllIIllIlll(this.points.length)) {
            return Shape.lIIlIIlllIlIll[1] != 0;
        }
        this.checkPoints();
        int lllllllllllllIIllIllIIIIlIIIlllI = Shape.lIIlIIlllIlIll[1];
        while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIlIIIlllI, this.points.length)) {
            if (llIIlllIIllIlll(llIIlllIlIIIIll(this.points[lllllllllllllIIllIllIIIIlIIIlllI], lllllllllllllIIllIllIIIIlIIIllII)) && llIIlllIIllIlll(llIIlllIlIIIIll(this.points[lllllllllllllIIllIllIIIIlIIIlllI + Shape.lIIlIIlllIlIll[0]], lllllllllllllIIllIllIIIIlIIIlIII))) {
                return Shape.lIIlIIlllIlIll[0] != 0;
            }
            lllllllllllllIIllIllIIIIlIIIlllI += 2;
            "".length();
            if (" ".length() > "  ".length()) {
                return ((0x7A ^ 0x4F ^ (0x6C ^ 0x7E)) & (0xF5 ^ 0x80 ^ (0xFA ^ 0xA8) ^ -" ".length())) != 0x0;
            }
        }
        return Shape.lIIlIIlllIlIll[1] != 0;
    }
    
    protected void findCenter() {
        final float[] center = new float[Shape.lIIlIIlllIlIll[2]];
        center[Shape.lIIlIIlllIlIll[1]] = 0.0f;
        center[Shape.lIIlIIlllIlIll[0]] = 0.0f;
        this.center = center;
        final int lllllllllllllIIllIllIIIIlIIIIIIl = this.points.length;
        int lllllllllllllIIllIllIIIIlIIIIIll = Shape.lIIlIIlllIlIll[1];
        while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIlIIIIIll, lllllllllllllIIllIllIIIIlIIIIIIl)) {
            final float[] center2 = this.center;
            final int n = Shape.lIIlIIlllIlIll[1];
            center2[n] += this.points[lllllllllllllIIllIllIIIIlIIIIIll];
            final float[] center3 = this.center;
            final int n2 = Shape.lIIlIIlllIlIll[0];
            center3[n2] += this.points[lllllllllllllIIllIllIIIIlIIIIIll + Shape.lIIlIIlllIlIll[0]];
            lllllllllllllIIllIllIIIIlIIIIIll += 2;
            "".length();
            if ("   ".length() == " ".length()) {
                return;
            }
        }
        final float[] center4 = this.center;
        final int n3 = Shape.lIIlIIlllIlIll[1];
        center4[n3] /= lllllllllllllIIllIllIIIIlIIIIIIl / Shape.lIIlIIlllIlIll[2];
        final float[] center5 = this.center;
        final int n4 = Shape.lIIlIIlllIlIll[0];
        center5[n4] /= lllllllllllllIIllIllIIIIlIIIIIIl / Shape.lIIlIIlllIlIll[2];
    }
    
    public float getMinY() {
        this.checkPoints();
        return this.minY;
    }
    
    public Shape[] union(final Shape lllllllllllllIIllIllIIIIIIlIIIIl) {
        return new GeomUtil().union(this, lllllllllllllIIllIllIIIIIIlIIIIl);
    }
    
    public float[] getCenter() {
        this.checkPoints();
        return this.center;
    }
    
    private static boolean llIIlllIIllIIll(final int lllllllllllllIIllIllIIIIIIIIlllI, final int lllllllllllllIIllIllIIIIIIIIllIl) {
        return lllllllllllllIIllIllIIIIIIIIlllI < lllllllllllllIIllIllIIIIIIIIllIl;
    }
    
    private static boolean llIIlllIlIIIIlI(final int lllllllllllllIIllIllIIIIIIIIIIll) {
        return lllllllllllllIIllIllIIIIIIIIIIll >= 0;
    }
    
    public float getHeight() {
        return this.maxY - this.minY;
    }
    
    public boolean contains(final float lllllllllllllIIllIllIIIIllIIllIl, final float lllllllllllllIIllIllIIIIllIIIlIl) {
        this.checkPoints();
        if (llIIlllIIllIlll(this.points.length)) {
            return Shape.lIIlIIlllIlIll[1] != 0;
        }
        boolean lllllllllllllIIllIllIIIIllIIlIll = Shape.lIIlIIlllIlIll[1] != 0;
        final int lllllllllllllIIllIllIIIIllIIlIII = this.points.length;
        float lllllllllllllIIllIllIIIIllIIlIlI = this.points[lllllllllllllIIllIllIIIIllIIlIII - Shape.lIIlIIlllIlIll[2]];
        float lllllllllllllIIllIllIIIIllIIlIIl = this.points[lllllllllllllIIllIllIIIIllIIlIII - Shape.lIIlIIlllIlIll[0]];
        int lllllllllllllIIllIllIIIIllIIllll = Shape.lIIlIIlllIlIll[1];
        while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIllIIllll, lllllllllllllIIllIllIIIIllIIlIII)) {
            final float lllllllllllllIIllIllIIIIllIlIlIl = this.points[lllllllllllllIIllIllIIIIllIIllll];
            final float lllllllllllllIIllIllIIIIllIlIlII = this.points[lllllllllllllIIllIllIIIIllIIllll + Shape.lIIlIIlllIlIll[0]];
            float lllllllllllllIIllIllIIIIllIlIIll;
            float lllllllllllllIIllIllIIIIllIlIIIl;
            float lllllllllllllIIllIllIIIIllIlIIlI;
            float lllllllllllllIIllIllIIIIllIlIIII;
            if (llIIlllIIlllllI(llIIlllIIlllIll(lllllllllllllIIllIllIIIIllIlIlIl, lllllllllllllIIllIllIIIIllIIlIlI))) {
                final float lllllllllllllIIllIllIIIIllIllIIl = lllllllllllllIIllIllIIIIllIIlIlI;
                final float lllllllllllllIIllIllIIIIllIlIlll = lllllllllllllIIllIllIIIIllIlIlIl;
                final float lllllllllllllIIllIllIIIIllIllIII = lllllllllllllIIllIllIIIIllIIlIIl;
                final float lllllllllllllIIllIllIIIIllIlIllI = lllllllllllllIIllIllIIIIllIlIlII;
                "".length();
                if (-"   ".length() > 0) {
                    return ((0x70 ^ 0x14 ^ (0x18 ^ 0x32)) & (0x34 ^ 0x56 ^ (0xA7 ^ 0x8B) ^ -" ".length())) != 0x0;
                }
            }
            else {
                lllllllllllllIIllIllIIIIllIlIIll = lllllllllllllIIllIllIIIIllIlIlIl;
                lllllllllllllIIllIllIIIIllIlIIIl = lllllllllllllIIllIllIIIIllIIlIlI;
                lllllllllllllIIllIllIIIIllIlIIlI = lllllllllllllIIllIllIIIIllIlIlII;
                lllllllllllllIIllIllIIIIllIlIIII = lllllllllllllIIllIllIIIIllIIlIIl;
            }
            int lllllllllllllIIllIllIIIIIIIlIllI;
            if (llIIlllIIllIlIl(llIIlllIIllllII(lllllllllllllIIllIllIIIIllIlIlIl, lllllllllllllIIllIllIIIIllIIllIl))) {
                lllllllllllllIIllIllIIIIIIIlIllI = Shape.lIIlIIlllIlIll[0];
                "".length();
                if (null != null) {
                    return ((0x42 ^ 0x6D) & ~(0x18 ^ 0x37)) != 0x0;
                }
            }
            else {
                lllllllllllllIIllIllIIIIIIIlIllI = Shape.lIIlIIlllIlIll[1];
            }
            int lllllllllllllIIllIllIIIIIIIlIlIl;
            if (llIIlllIIllllll(llIIlllIIllllII(lllllllllllllIIllIllIIIIllIIllIl, lllllllllllllIIllIllIIIIllIIlIlI))) {
                lllllllllllllIIllIllIIIIIIIlIlIl = Shape.lIIlIIlllIlIll[0];
                "".length();
                if (((0x8B ^ 0xC4) & ~(0xFB ^ 0xB4)) != 0x0) {
                    return ((0xA ^ 0x42) & ~(0xED ^ 0xA5)) != 0x0;
                }
            }
            else {
                lllllllllllllIIllIllIIIIIIIlIlIl = Shape.lIIlIIlllIlIll[1];
            }
            if (llIIlllIIlllIII(lllllllllllllIIllIllIIIIIIIlIllI, lllllllllllllIIllIllIIIIIIIlIlIl) && llIIlllIIllIlIl(llIIlllIIllllIl((lllllllllllllIIllIllIIIIllIIIlIl - (double)lllllllllllllIIllIllIIIIllIlIIlI) * (lllllllllllllIIllIllIIIIllIlIIIl - lllllllllllllIIllIllIIIIllIlIIll), (lllllllllllllIIllIllIIIIllIlIIII - (double)lllllllllllllIIllIllIIIIllIlIIlI) * (lllllllllllllIIllIllIIIIllIIllIl - lllllllllllllIIllIllIIIIllIlIIll)))) {
                int n;
                if (llIIlllIIllIlll(lllllllllllllIIllIllIIIIllIIlIll ? 1 : 0)) {
                    n = Shape.lIIlIIlllIlIll[0];
                    "".length();
                    if (" ".length() > (0x27 ^ 0x66 ^ (0xD8 ^ 0x9D))) {
                        return ((55 + 59 - 54 + 78 ^ 19 + 173 - 59 + 44) & (136 + 11 - 118 + 109 ^ 25 + 68 - 90 + 174 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n = Shape.lIIlIIlllIlIll[1];
                }
                lllllllllllllIIllIllIIIIllIIlIll = (n != 0);
            }
            lllllllllllllIIllIllIIIIllIIlIlI = lllllllllllllIIllIllIIIIllIlIlIl;
            lllllllllllllIIllIllIIIIllIIlIIl = lllllllllllllIIllIllIIIIllIlIlII;
            lllllllllllllIIllIllIIIIllIIllll += 2;
            "".length();
            if (null != null) {
                return ((0x13 ^ 0x58) & ~(0x4B ^ 0x0)) != 0x0;
            }
        }
        return lllllllllllllIIllIllIIIIllIIlIll;
    }
    
    public float getY() {
        return this.y;
    }
    
    private static int llIIlllIlIIIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIIlllIIlllllI(final int lllllllllllllIIllIlIllllllllllIl) {
        return lllllllllllllIIllIlIllllllllllIl > 0;
    }
    
    private static int llIIlllIlIIIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIIlllIIllIIlI(final Object lllllllllllllIIllIllIIIIIIIIlIIl) {
        return lllllllllllllIIllIllIIIIIIIIlIIl == null;
    }
    
    public int indexOf(final float lllllllllllllIIllIllIIIIlllIlIlI, final float lllllllllllllIIllIllIIIIlllIlIIl) {
        int lllllllllllllIIllIllIIIIlllIllll = Shape.lIIlIIlllIlIll[1];
        while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIlllIllll, this.points.length)) {
            if (llIIlllIIllIlll(llIIlllIIlllIlI(this.points[lllllllllllllIIllIllIIIIlllIllll], lllllllllllllIIllIllIIIIlllIlIlI)) && llIIlllIIllIlll(llIIlllIIlllIlI(this.points[lllllllllllllIIllIllIIIIlllIllll + Shape.lIIlIIlllIlIll[0]], lllllllllllllIIllIllIIIIlllIlIIl))) {
                return lllllllllllllIIllIllIIIIlllIllll / Shape.lIIlIIlllIlIll[2];
            }
            lllllllllllllIIllIllIIIIlllIllll += 2;
            "".length();
            if (-(138 + 95 - 230 + 140 ^ 9 + 125 - 79 + 84) >= 0) {
                return (0x61 ^ 0xD ^ (0x4E ^ 0x3D)) & (24 + 44 + 25 + 61 ^ 46 + 16 + 53 + 18 ^ -" ".length());
            }
        }
        return Shape.lIIlIIlllIlIll[3];
    }
    
    public float[] getPoint(final int lllllllllllllIIllIllIIIlIlIIIlll) {
        this.checkPoints();
        final float[] lllllllllllllIIllIllIIIlIlIIIllI = new float[Shape.lIIlIIlllIlIll[2]];
        lllllllllllllIIllIllIIIlIlIIIllI[Shape.lIIlIIlllIlIll[1]] = this.points[lllllllllllllIIllIllIIIlIlIIIlll * Shape.lIIlIIlllIlIll[2]];
        lllllllllllllIIllIllIIIlIlIIIllI[Shape.lIIlIIlllIlIll[0]] = this.points[lllllllllllllIIllIllIIIlIlIIIlll * Shape.lIIlIIlllIlIll[2] + Shape.lIIlIIlllIlIll[0]];
        return lllllllllllllIIllIllIIIlIlIIIllI;
    }
    
    private static int llIIlllIIlllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        llIIlllIIlIlllI();
    }
    
    public float getWidth() {
        return this.maxX - this.minX;
    }
    
    private static int llIIlllIIllllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public float getCenterY() {
        this.checkPoints();
        return this.center[Shape.lIIlIIlllIlIll[0]];
    }
    
    public boolean contains(final Shape lllllllllllllIIllIllIIIlIIIllIll) {
        if (llIIlllIIllIIII(lllllllllllllIIllIllIIIlIIIllIll.intersects(this) ? 1 : 0)) {
            return Shape.lIIlIIlllIlIll[1] != 0;
        }
        int lllllllllllllIIllIllIIIlIIIlllll = Shape.lIIlIIlllIlIll[1];
        while (llIIlllIIllIIll(lllllllllllllIIllIllIIIlIIIlllll, lllllllllllllIIllIllIIIlIIIllIll.getPointCount())) {
            final float[] lllllllllllllIIllIllIIIlIIlIIIII = lllllllllllllIIllIllIIIlIIIllIll.getPoint(lllllllllllllIIllIllIIIlIIIlllll);
            if (llIIlllIIllIlll(this.contains(lllllllllllllIIllIllIIIlIIlIIIII[Shape.lIIlIIlllIlIll[1]], lllllllllllllIIllIllIIIlIIlIIIII[Shape.lIIlIIlllIlIll[0]]) ? 1 : 0)) {
                return Shape.lIIlIIlllIlIll[1] != 0;
            }
            ++lllllllllllllIIllIllIIIlIIIlllll;
            "".length();
            if ((0xBF ^ 0xBB) == 0x0) {
                return ((0x65 ^ 0x60) & ~(0xB ^ 0xE)) != 0x0;
            }
        }
        return Shape.lIIlIIlllIlIll[0] != 0;
    }
    
    public void increaseTriangulation() {
        this.checkPoints();
        this.calculateTriangles();
        this.tris = new OverTriangulator(this.tris);
    }
    
    public float getMaxX() {
        this.checkPoints();
        return this.maxX;
    }
    
    protected void calculateTriangles() {
        if (llIIlllIIllIlll(this.trianglesDirty ? 1 : 0) && llIIlllIIllIIIl(this.tris)) {
            return;
        }
        if (llIIlllIIllIllI(this.points.length, Shape.lIIlIIlllIlIll[4])) {
            boolean lllllllllllllIIllIllIIIIIllIIllI = Shape.lIIlIIlllIlIll[0] != 0;
            float lllllllllllllIIllIllIIIIIllIIlIl = 0.0f;
            int lllllllllllllIIllIllIIIIIllIlIII = Shape.lIIlIIlllIlIll[1];
            while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIIllIlIII, this.points.length / Shape.lIIlIIlllIlIll[2] - Shape.lIIlIIlllIlIll[0])) {
                final float lllllllllllllIIllIllIIIIIllIllII = this.points[lllllllllllllIIllIllIIIIIllIlIII * Shape.lIIlIIlllIlIll[2]];
                final float lllllllllllllIIllIllIIIIIllIlIll = this.points[lllllllllllllIIllIllIIIIIllIlIII * Shape.lIIlIIlllIlIll[2] + Shape.lIIlIIlllIlIll[0]];
                final float lllllllllllllIIllIllIIIIIllIlIlI = this.points[lllllllllllllIIllIllIIIIIllIlIII * Shape.lIIlIIlllIlIll[2] + Shape.lIIlIIlllIlIll[2]];
                final float lllllllllllllIIllIllIIIIIllIlIIl = this.points[lllllllllllllIIllIllIIIIIllIlIII * Shape.lIIlIIlllIlIll[2] + Shape.lIIlIIlllIlIll[5]];
                lllllllllllllIIllIllIIIIIllIIlIl += lllllllllllllIIllIllIIIIIllIllII * lllllllllllllIIllIllIIIIIllIlIIl - lllllllllllllIIllIllIIIIIllIlIll * lllllllllllllIIllIllIIIIIllIlIlI;
                ++lllllllllllllIIllIllIIIIIllIlIII;
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            lllllllllllllIIllIllIIIIIllIIlIl /= 2.0f;
            int n;
            if (llIIlllIIlllllI(llIIlllIlIIIlIl(lllllllllllllIIllIllIIIIIllIIlIl, 0.0f))) {
                n = Shape.lIIlIIlllIlIll[0];
                "".length();
                if ((190 + 91 - 223 + 133 ^ 61 + 12 + 45 + 69) < -" ".length()) {
                    return;
                }
            }
            else {
                n = Shape.lIIlIIlllIlIll[1];
            }
            lllllllllllllIIllIllIIIIIllIIllI = (n != 0);
            this.tris = new NeatTriangulator();
            int lllllllllllllIIllIllIIIIIllIIlll = Shape.lIIlIIlllIlIll[1];
            while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIIllIIlll, this.points.length)) {
                this.tris.addPolyPoint(this.points[lllllllllllllIIllIllIIIIIllIIlll], this.points[lllllllllllllIIllIllIIIIIllIIlll + Shape.lIIlIIlllIlIll[0]]);
                lllllllllllllIIllIllIIIIIllIIlll += 2;
                "".length();
                if ("  ".length() == "   ".length()) {
                    return;
                }
            }
            this.tris.triangulate();
            "".length();
        }
        this.trianglesDirty = (Shape.lIIlIIlllIlIll[1] != 0);
    }
    
    private static int llIIlllIlIIIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public int getPointCount() {
        this.checkPoints();
        return this.points.length / Shape.lIIlIIlllIlIll[2];
    }
    
    public void setCenterX(final float lllllllllllllIIllIllIIIlIlllIIIl) {
        if (!llIIlllIIllIIIl(this.points) || llIIlllIIllIIlI(this.center)) {
            this.checkPoints();
        }
        final float lllllllllllllIIllIllIIIlIlllIIll = lllllllllllllIIllIllIIIlIlllIIIl - this.getCenterX();
        this.setX(this.x + lllllllllllllIIllIllIIIlIlllIIll);
    }
    
    public float getMinX() {
        this.checkPoints();
        return this.minX;
    }
    
    private static boolean llIIlllIIlllIII(final int lllllllllllllIIllIllIIIIIIIlIllI, final int lllllllllllllIIllIllIIIIIIIlIlIl) {
        return lllllllllllllIIllIllIIIIIIIlIllI == lllllllllllllIIllIllIIIIIIIlIlIl;
    }
    
    public float getBoundingCircleRadius() {
        this.checkPoints();
        return this.boundingCircleRadius;
    }
    
    private static boolean llIIlllIIllIlll(final int lllllllllllllIIllIllIIIIIIIIIlIl) {
        return lllllllllllllIIllIllIIIIIIIIIlIl == 0;
    }
    
    public float[] getPoints() {
        this.checkPoints();
        return this.points;
    }
    
    protected final void checkPoints() {
        if (llIIlllIIllIIII(this.pointsDirty ? 1 : 0)) {
            this.createPoints();
            this.findCenter();
            this.calculateRadius();
            if (llIIlllIIlllllI(this.points.length)) {
                this.maxX = this.points[Shape.lIIlIIlllIlIll[1]];
                this.maxY = this.points[Shape.lIIlIIlllIlIll[0]];
                this.minX = this.points[Shape.lIIlIIlllIlIll[1]];
                this.minY = this.points[Shape.lIIlIIlllIlIll[0]];
                int lllllllllllllIIllIllIIIIIlIlIIll = Shape.lIIlIIlllIlIll[1];
                while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIIlIlIIll, this.points.length / Shape.lIIlIIlllIlIll[2])) {
                    this.maxX = Math.max(this.points[lllllllllllllIIllIllIIIIIlIlIIll * Shape.lIIlIIlllIlIll[2]], this.maxX);
                    this.maxY = Math.max(this.points[lllllllllllllIIllIllIIIIIlIlIIll * Shape.lIIlIIlllIlIll[2] + Shape.lIIlIIlllIlIll[0]], this.maxY);
                    this.minX = Math.min(this.points[lllllllllllllIIllIllIIIIIlIlIIll * Shape.lIIlIIlllIlIll[2]], this.minX);
                    this.minY = Math.min(this.points[lllllllllllllIIllIllIIIIIlIlIIll * Shape.lIIlIIlllIlIll[2] + Shape.lIIlIIlllIlIll[0]], this.minY);
                    ++lllllllllllllIIllIllIIIIIlIlIIll;
                    "".length();
                    if (((0xF4 ^ 0xC7 ^ (0x48 ^ 0x25)) & (0x7D ^ 0x56 ^ (0xE0 ^ 0x95) ^ -" ".length())) != ((0xD6 ^ 0xAD ^ (0xE2 ^ 0x9F)) & (0x61 ^ 0x67 ^ ((0x65 ^ 0x21) & ~(0xD9 ^ 0x9D)) ^ -" ".length()))) {
                        return;
                    }
                }
            }
            this.pointsDirty = (Shape.lIIlIIlllIlIll[1] != 0);
            this.trianglesDirty = (Shape.lIIlIIlllIlIll[0] != 0);
        }
    }
    
    public boolean intersects(final Shape lllllllllllllIIllIllIIIIlIIllllI) {
        this.checkPoints();
        boolean lllllllllllllIIllIllIIIIlIlIIlII = Shape.lIIlIIlllIlIll[1] != 0;
        final float[] lllllllllllllIIllIllIIIIlIlIIIll = this.getPoints();
        final float[] lllllllllllllIIllIllIIIIlIlIIIlI = lllllllllllllIIllIllIIIIlIIllllI.getPoints();
        int lllllllllllllIIllIllIIIIlIlIIIIl = lllllllllllllIIllIllIIIIlIlIIIll.length;
        int lllllllllllllIIllIllIIIIlIlIIIII = lllllllllllllIIllIllIIIIlIlIIIlI.length;
        if (llIIlllIIllIlll(this.closed() ? 1 : 0)) {
            lllllllllllllIIllIllIIIIlIlIIIIl -= 2;
        }
        if (llIIlllIIllIlll(lllllllllllllIIllIllIIIIlIIllllI.closed() ? 1 : 0)) {
            lllllllllllllIIllIllIIIIlIlIIIII -= 2;
        }
        int lllllllllllllIIllIllIIIIlIlIIlll = Shape.lIIlIIlllIlIll[1];
        while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIlIlIIlll, lllllllllllllIIllIllIIIIlIlIIIIl)) {
            int lllllllllllllIIllIllIIIIlIlIlIII = lllllllllllllIIllIllIIIIlIlIIlll + Shape.lIIlIIlllIlIll[2];
            if (llIIlllIIllIllI(lllllllllllllIIllIllIIIIlIlIlIII, lllllllllllllIIllIllIIIIlIlIIIll.length)) {
                lllllllllllllIIllIllIIIIlIlIlIII = Shape.lIIlIIlllIlIll[1];
            }
            int lllllllllllllIIllIllIIIIlIlIlIIl = Shape.lIIlIIlllIlIll[1];
            while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIlIlIlIIl, lllllllllllllIIllIllIIIIlIlIIIII)) {
                int lllllllllllllIIllIllIIIIlIlIllII = lllllllllllllIIllIllIIIIlIlIlIIl + Shape.lIIlIIlllIlIll[2];
                if (llIIlllIIllIllI(lllllllllllllIIllIllIIIIlIlIllII, lllllllllllllIIllIllIIIIlIlIIIlI.length)) {
                    lllllllllllllIIllIllIIIIlIlIllII = Shape.lIIlIIlllIlIll[1];
                }
                final double lllllllllllllIIllIllIIIIlIlIlIll = ((lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIlIII] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll]) * (double)(lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl + Shape.lIIlIIlllIlIll[0]] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll + Shape.lIIlIIlllIlIll[0]]) - (lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIlIII + Shape.lIIlIIlllIlIll[0]] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll + Shape.lIIlIIlllIlIll[0]]) * (lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll])) / ((lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIlIII + Shape.lIIlIIlllIlIll[0]] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll + Shape.lIIlIIlllIlIll[0]]) * (lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIllII] - lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl]) - (lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIlIII] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll]) * (lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIllII + Shape.lIIlIIlllIlIll[0]] - lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl + Shape.lIIlIIlllIlIll[0]]));
                final double lllllllllllllIIllIllIIIIlIlIlIlI = ((lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIllII] - lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl]) * (double)(lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl + Shape.lIIlIIlllIlIll[0]] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll + Shape.lIIlIIlllIlIll[0]]) - (lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIllII + Shape.lIIlIIlllIlIll[0]] - lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl + Shape.lIIlIIlllIlIll[0]]) * (lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll])) / ((lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIlIII + Shape.lIIlIIlllIlIll[0]] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll + Shape.lIIlIIlllIlIll[0]]) * (lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIllII] - lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl]) - (lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIlIII] - lllllllllllllIIllIllIIIIlIlIIIll[lllllllllllllIIllIllIIIIlIlIIlll]) * (lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIllII + Shape.lIIlIIlllIlIll[0]] - lllllllllllllIIllIllIIIIlIlIIIlI[lllllllllllllIIllIllIIIIlIlIlIIl + Shape.lIIlIIlllIlIll[0]]));
                if (llIIlllIlIIIIlI(llIIlllIlIIIIII(lllllllllllllIIllIllIIIIlIlIlIll, 0.0)) && llIIlllIIllllll(llIIlllIlIIIIIl(lllllllllllllIIllIllIIIIlIlIlIll, 1.0)) && llIIlllIlIIIIlI(llIIlllIlIIIIII(lllllllllllllIIllIllIIIIlIlIlIlI, 0.0)) && llIIlllIIllllll(llIIlllIlIIIIIl(lllllllllllllIIllIllIIIIlIlIlIlI, 1.0))) {
                    lllllllllllllIIllIllIIIIlIlIIlII = (Shape.lIIlIIlllIlIll[0] != 0);
                    "".length();
                    if ("   ".length() <= ((125 + 24 - 95 + 87 ^ 172 + 165 - 192 + 53) & (0x70 ^ 0x54 ^ (0xC4 ^ 0xAB) ^ -" ".length()))) {
                        return ((0x6D ^ 0x68 ^ (0xD4 ^ 0xC3)) & (0x20 ^ 0x61 ^ (0xF2 ^ 0xA1) ^ -" ".length())) != 0x0;
                    }
                    break;
                }
                else {
                    lllllllllllllIIllIllIIIIlIlIlIIl += 2;
                    "".length();
                    if (((0x75 ^ 0x67 ^ (0x8 ^ 0x0)) & (0x96 ^ 0x8E ^ "  ".length() ^ -" ".length())) != 0x0) {
                        return ((0x90 ^ 0x82 ^ (0xC4 ^ 0x80)) & (141 + 1 - 9 + 13 ^ 191 + 76 - 219 + 148 ^ -" ".length())) != 0x0;
                    }
                    continue;
                }
            }
            if (llIIlllIIllIIII(lllllllllllllIIllIllIIIIlIlIIlII ? 1 : 0)) {
                "".length();
                if ((0x32 ^ 0x37) == 0x0) {
                    return ((0x2 ^ 0x63) & ~(0x32 ^ 0x53)) != 0x0;
                }
                break;
            }
            else {
                lllllllllllllIIllIllIIIIlIlIIlll += 2;
                "".length();
                if (null != null) {
                    return ((0x91 ^ 0xB0 ^ (0x72 ^ 0x46)) & (0x6C ^ 0x1F ^ (0x30 ^ 0x56) ^ -" ".length())) != 0x0;
                }
                continue;
            }
        }
        return lllllllllllllIIllIllIIIIlIlIIlII;
    }
    
    public Triangulator getTriangles() {
        this.checkPoints();
        this.calculateTriangles();
        return this.tris;
    }
    
    protected void calculateRadius() {
        this.boundingCircleRadius = 0.0f;
        int lllllllllllllIIllIllIIIIIllllIIl = Shape.lIIlIIlllIlIll[1];
        while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIIllllIIl, this.points.length)) {
            final float lllllllllllllIIllIllIIIIIllllIlI = (this.points[lllllllllllllIIllIllIIIIIllllIIl] - this.center[Shape.lIIlIIlllIlIll[1]]) * (this.points[lllllllllllllIIllIllIIIIIllllIIl] - this.center[Shape.lIIlIIlllIlIll[1]]) + (this.points[lllllllllllllIIllIllIIIIIllllIIl + Shape.lIIlIIlllIlIll[0]] - this.center[Shape.lIIlIIlllIlIll[0]]) * (this.points[lllllllllllllIIllIllIIIIIllllIIl + Shape.lIIlIIlllIlIll[0]] - this.center[Shape.lIIlIIlllIlIll[0]]);
            float boundingCircleRadius;
            if (llIIlllIIlllllI(llIIlllIlIIIlII(this.boundingCircleRadius, lllllllllllllIIllIllIIIIIllllIlI))) {
                boundingCircleRadius = this.boundingCircleRadius;
                "".length();
                if (" ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                boundingCircleRadius = lllllllllllllIIllIllIIIIIllllIlI;
            }
            this.boundingCircleRadius = boundingCircleRadius;
            lllllllllllllIIllIllIIIIIllllIIl += 2;
            "".length();
            if (((0xE5 ^ 0xB6 ^ (0xC4 ^ 0x9B)) & (0xF9 ^ 0x9A ^ (0xD3 ^ 0xBC) ^ -" ".length())) > ((0x3C ^ 0x27 ^ (0x1B ^ 0x17)) & ("  ".length() ^ (0x4F ^ 0x5A) ^ -" ".length()))) {
                return;
            }
        }
        this.boundingCircleRadius = (float)Math.sqrt(this.boundingCircleRadius);
    }
    
    private static void llIIlllIIlIlllI() {
        (lIIlIIlllIlIll = new int[6])[0] = " ".length();
        Shape.lIIlIIlllIlIll[1] = (" ".length() & (" ".length() ^ -" ".length()));
        Shape.lIIlIIlllIlIll[2] = "  ".length();
        Shape.lIIlIIlllIlIll[3] = -" ".length();
        Shape.lIIlIIlllIlIll[4] = (0x33 ^ 0x5F ^ (0xCA ^ 0xA0));
        Shape.lIIlIIlllIlIll[5] = "   ".length();
    }
    
    public float[] getNormal(final int lllllllllllllIIllIllIIIlIIlIllIl) {
        final float[] lllllllllllllIIllIllIIIlIIllIllI = this.getPoint(lllllllllllllIIllIllIIIlIIlIllIl);
        int lllllllllllllIIllIllIIIlIlIIIlll;
        if (llIIlllIIllIlIl(lllllllllllllIIllIllIIIlIIlIllIl - Shape.lIIlIIlllIlIll[0])) {
            lllllllllllllIIllIllIIIlIlIIIlll = this.getPointCount() - Shape.lIIlIIlllIlIll[0];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIIllIllIIIlIlIIIlll = lllllllllllllIIllIllIIIlIIlIllIl - Shape.lIIlIIlllIlIll[0];
        }
        final float[] lllllllllllllIIllIllIIIlIIllIlIl = this.getPoint(lllllllllllllIIllIllIIIlIlIIIlll);
        int lllllllllllllIIllIllIIIlIlIIIlll2;
        if (llIIlllIIllIllI(lllllllllllllIIllIllIIIlIIlIllIl + Shape.lIIlIIlllIlIll[0], this.getPointCount())) {
            lllllllllllllIIllIllIIIlIlIIIlll2 = Shape.lIIlIIlllIlIll[1];
            "".length();
            if (((0xEC ^ 0xC7 ^ (0x43 ^ 0x76)) & (0x3B ^ 0x10 ^ (0x0 ^ 0x35) ^ -" ".length())) != ((0x5E ^ 0x6A ^ (0xE2 ^ 0x83)) & (0x8F ^ 0x9F ^ (0x36 ^ 0x73) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            lllllllllllllIIllIllIIIlIlIIIlll2 = lllllllllllllIIllIllIIIlIIlIllIl + Shape.lIIlIIlllIlIll[0];
        }
        final float[] lllllllllllllIIllIllIIIlIIllIlII = this.getPoint(lllllllllllllIIllIllIIIlIlIIIlll2);
        final float[] lllllllllllllIIllIllIIIlIIllIIll = this.getNormal(lllllllllllllIIllIllIIIlIIllIlIl, lllllllllllllIIllIllIIIlIIllIllI);
        final float[] lllllllllllllIIllIllIIIlIIllIIlI = this.getNormal(lllllllllllllIIllIllIIIlIIllIllI, lllllllllllllIIllIllIIIlIIllIlII);
        if (llIIlllIIllIlll(lllllllllllllIIllIllIIIlIIlIllIl) && llIIlllIIllIlll(this.closed() ? 1 : 0)) {
            return lllllllllllllIIllIllIIIlIIllIIlI;
        }
        if (llIIlllIIlllIII(lllllllllllllIIllIllIIIlIIlIllIl, this.getPointCount() - Shape.lIIlIIlllIlIll[0]) && llIIlllIIllIlll(this.closed() ? 1 : 0)) {
            return lllllllllllllIIllIllIIIlIIllIIll;
        }
        final float lllllllllllllIIllIllIIIlIIllIIIl = (lllllllllllllIIllIllIIIlIIllIIll[Shape.lIIlIIlllIlIll[1]] + lllllllllllllIIllIllIIIlIIllIIlI[Shape.lIIlIIlllIlIll[1]]) / 2.0f;
        final float lllllllllllllIIllIllIIIlIIllIIII = (lllllllllllllIIllIllIIIlIIllIIll[Shape.lIIlIIlllIlIll[0]] + lllllllllllllIIllIllIIIlIIllIIlI[Shape.lIIlIIlllIlIll[0]]) / 2.0f;
        final float lllllllllllllIIllIllIIIlIIlIllll = (float)Math.sqrt(lllllllllllllIIllIllIIIlIIllIIIl * lllllllllllllIIllIllIIIlIIllIIIl + lllllllllllllIIllIllIIIlIIllIIII * lllllllllllllIIllIllIIIlIIllIIII);
        final float[] array = new float[Shape.lIIlIIlllIlIll[2]];
        array[Shape.lIIlIIlllIlIll[1]] = lllllllllllllIIllIllIIIlIIllIIIl / lllllllllllllIIllIllIIIlIIlIllll;
        array[Shape.lIIlIIlllIlIll[0]] = lllllllllllllIIllIllIIIlIIllIIII / lllllllllllllIIllIllIIIlIIlIllll;
        return array;
    }
    
    public void setLocation(final Vector2f lllllllllllllIIllIllIIIlIlllllII) {
        this.setX(lllllllllllllIIllIllIIIlIlllllII.x);
        this.setY(lllllllllllllIIllIllIIIlIlllllII.y);
    }
    
    protected abstract void createPoints();
    
    private static int llIIlllIIlIllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIIlllIIllllll(final int lllllllllllllIIllIlIllllllllllll) {
        return lllllllllllllIIllIlIllllllllllll <= 0;
    }
    
    private static int llIIlllIIlllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public Vector2f getLocation() {
        return new Vector2f(this.getX(), this.getY());
    }
    
    private float[] getNormal(final float[] lllllllllllllIIllIllIIIlIIIlIIlI, final float[] lllllllllllllIIllIllIIIlIIIIllII) {
        float lllllllllllllIIllIllIIIlIIIlIIII = lllllllllllllIIllIllIIIlIIIlIIlI[Shape.lIIlIIlllIlIll[1]] - lllllllllllllIIllIllIIIlIIIIllII[Shape.lIIlIIlllIlIll[1]];
        float lllllllllllllIIllIllIIIlIIIIllll = lllllllllllllIIllIllIIIlIIIlIIlI[Shape.lIIlIIlllIlIll[0]] - lllllllllllllIIllIllIIIlIIIIllII[Shape.lIIlIIlllIlIll[0]];
        final float lllllllllllllIIllIllIIIlIIIIlllI = (float)Math.sqrt(lllllllllllllIIllIllIIIlIIIlIIII * lllllllllllllIIllIllIIIlIIIlIIII + lllllllllllllIIllIllIIIlIIIIllll * lllllllllllllIIllIllIIIlIIIIllll);
        lllllllllllllIIllIllIIIlIIIlIIII /= lllllllllllllIIllIllIIIlIIIIlllI;
        lllllllllllllIIllIllIIIlIIIIllll /= lllllllllllllIIllIllIIIlIIIIlllI;
        final float[] array = new float[Shape.lIIlIIlllIlIll[2]];
        array[Shape.lIIlIIlllIlIll[1]] = -lllllllllllllIIllIllIIIlIIIIllll;
        array[Shape.lIIlIIlllIlIll[0]] = lllllllllllllIIllIllIIIlIIIlIIII;
        return array;
    }
    
    public float getX() {
        return this.x;
    }
    
    private static int llIIlllIlIIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public float getMaxY() {
        this.checkPoints();
        return this.maxY;
    }
    
    public float getCenterX() {
        this.checkPoints();
        return this.center[Shape.lIIlIIlllIlIll[1]];
    }
    
    private static boolean llIIlllIIllIIII(final int lllllllllllllIIllIllIIIIIIIIIlll) {
        return lllllllllllllIIllIllIIIIIIIIIlll != 0;
    }
    
    public Shape prune() {
        final Polygon lllllllllllllIIllIllIIIIIIllIllI = new Polygon();
        int lllllllllllllIIllIllIIIIIIlllIII = Shape.lIIlIIlllIlIll[1];
        while (llIIlllIIllIIll(lllllllllllllIIllIllIIIIIIlllIII, this.getPointCount())) {
            int n;
            if (llIIlllIIllIllI(lllllllllllllIIllIllIIIIIIlllIII + Shape.lIIlIIlllIlIll[0], this.getPointCount())) {
                n = Shape.lIIlIIlllIlIll[1];
                "".length();
                if (" ".length() <= 0) {
                    return null;
                }
            }
            else {
                n = lllllllllllllIIllIllIIIIIIlllIII + Shape.lIIlIIlllIlIll[0];
            }
            final int lllllllllllllIIllIllIIIIIlIIIIII = n;
            int n2;
            if (llIIlllIIllIlIl(lllllllllllllIIllIllIIIIIIlllIII - Shape.lIIlIIlllIlIll[0])) {
                n2 = this.getPointCount() - Shape.lIIlIIlllIlIll[0];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                n2 = lllllllllllllIIllIllIIIIIIlllIII - Shape.lIIlIIlllIlIll[0];
            }
            final int lllllllllllllIIllIllIIIIIIllllll = n2;
            float lllllllllllllIIllIllIIIIIIlllllI = this.getPoint(lllllllllllllIIllIllIIIIIIlllIII)[Shape.lIIlIIlllIlIll[1]] - this.getPoint(lllllllllllllIIllIllIIIIIIllllll)[Shape.lIIlIIlllIlIll[1]];
            float lllllllllllllIIllIllIIIIIIllllIl = this.getPoint(lllllllllllllIIllIllIIIIIIlllIII)[Shape.lIIlIIlllIlIll[0]] - this.getPoint(lllllllllllllIIllIllIIIIIIllllll)[Shape.lIIlIIlllIlIll[0]];
            float lllllllllllllIIllIllIIIIIIllllII = this.getPoint(lllllllllllllIIllIllIIIIIlIIIIII)[Shape.lIIlIIlllIlIll[1]] - this.getPoint(lllllllllllllIIllIllIIIIIIlllIII)[Shape.lIIlIIlllIlIll[1]];
            float lllllllllllllIIllIllIIIIIIlllIll = this.getPoint(lllllllllllllIIllIllIIIIIlIIIIII)[Shape.lIIlIIlllIlIll[0]] - this.getPoint(lllllllllllllIIllIllIIIIIIlllIII)[Shape.lIIlIIlllIlIll[0]];
            final float lllllllllllllIIllIllIIIIIIlllIlI = (float)Math.sqrt(lllllllllllllIIllIllIIIIIIlllllI * lllllllllllllIIllIllIIIIIIlllllI + lllllllllllllIIllIllIIIIIIllllIl * lllllllllllllIIllIllIIIIIIllllIl);
            final float lllllllllllllIIllIllIIIIIIlllIIl = (float)Math.sqrt(lllllllllllllIIllIllIIIIIIllllII * lllllllllllllIIllIllIIIIIIllllII + lllllllllllllIIllIllIIIIIIlllIll * lllllllllllllIIllIllIIIIIIlllIll);
            lllllllllllllIIllIllIIIIIIlllllI /= lllllllllllllIIllIllIIIIIIlllIlI;
            lllllllllllllIIllIllIIIIIIllllIl /= lllllllllllllIIllIllIIIIIIlllIlI;
            lllllllllllllIIllIllIIIIIIllllII /= lllllllllllllIIllIllIIIIIIlllIIl;
            lllllllllllllIIllIllIIIIIIlllIll /= lllllllllllllIIllIllIIIIIIlllIIl;
            if (!llIIlllIIllIlll(llIIlllIlIIIlll(lllllllllllllIIllIllIIIIIIlllllI, lllllllllllllIIllIllIIIIIIllllII)) || llIIlllIIllIIII(llIIlllIlIIIlll(lllllllllllllIIllIllIIIIIIllllIl, lllllllllllllIIllIllIIIIIIlllIll))) {
                lllllllllllllIIllIllIIIIIIllIllI.addPoint(this.getPoint(lllllllllllllIIllIllIIIIIIlllIII)[Shape.lIIlIIlllIlIll[1]], this.getPoint(lllllllllllllIIllIllIIIIIIlllIII)[Shape.lIIlIIlllIlIll[0]]);
            }
            ++lllllllllllllIIllIllIIIIIIlllIII;
            "".length();
            if (" ".length() < ((0xA4 ^ 0xB6) & ~(0x93 ^ 0x81))) {
                return null;
            }
        }
        return lllllllllllllIIllIllIIIIIIllIllI;
    }
    
    public void setLocation(final float lllllllllllllIIllIllIIIllIlIIlll, final float lllllllllllllIIllIllIIIllIlIIllI) {
        this.setX(lllllllllllllIIllIllIIIllIlIIlll);
        this.setY(lllllllllllllIIllIllIIIllIlIIllI);
    }
    
    public void setX(float lllllllllllllIIllIllIIIllIIlIllI) {
        if (llIIlllIIllIIII(llIIlllIIlIllll(lllllllllllllIIllIllIIIllIIlIllI, this.x))) {
            final float lllllllllllllIIllIllIIIllIIllIlI = lllllllllllllIIllIllIIIllIIlIllI - this.x;
            this.x = lllllllllllllIIllIllIIIllIIlIllI;
            if (!llIIlllIIllIIIl(this.points) || llIIlllIIllIIlI(this.center)) {
                this.checkPoints();
            }
            int lllllllllllllIIllIllIIIllIIllIll = Shape.lIIlIIlllIlIll[1];
            while (llIIlllIIllIIll(lllllllllllllIIllIllIIIllIIllIll, this.points.length / Shape.lIIlIIlllIlIll[2])) {
                final float[] points = this.points;
                final int n = lllllllllllllIIllIllIIIllIIllIll * Shape.lIIlIIlllIlIll[2];
                points[n] += lllllllllllllIIllIllIIIllIIllIlI;
                ++lllllllllllllIIllIllIIIllIIllIll;
                "".length();
                if (null != null) {
                    return;
                }
            }
            final float[] center = this.center;
            final int n2 = Shape.lIIlIIlllIlIll[1];
            center[n2] += lllllllllllllIIllIllIIIllIIllIlI;
            lllllllllllllIIllIllIIIllIIlIllI += lllllllllllllIIllIllIIIllIIllIlI;
            this.maxX += lllllllllllllIIllIllIIIllIIllIlI;
            this.minX += lllllllllllllIIllIllIIIllIIllIlI;
            this.trianglesDirty = (Shape.lIIlIIlllIlIll[0] != 0);
        }
    }
    
    private static int llIIlllIIllllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int llIIlllIlIIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIIlllIIllIlIl(final int lllllllllllllIIllIllIIIIIIIIIIIl) {
        return lllllllllllllIIllIllIIIIIIIIIIIl < 0;
    }
    
    public void preCache() {
        this.checkPoints();
        this.getTriangles();
        "".length();
    }
    
    private static boolean llIIlllIIllIIIl(final Object lllllllllllllIIllIllIIIIIIIIlIll) {
        return lllllllllllllIIllIllIIIIIIIIlIll != null;
    }
    
    public boolean closed() {
        return Shape.lIIlIIlllIlIll[0] != 0;
    }
    
    public Shape[] subtract(final Shape lllllllllllllIIllIllIIIIIIlIIlIl) {
        return new GeomUtil().subtract(this, lllllllllllllIIllIllIIIIIIlIIlIl);
    }
    
    public boolean includes(final float lllllllllllllIIllIllIIIIlllllllI, final float lllllllllllllIIllIllIIIIllllllIl) {
        if (llIIlllIIllIlll(this.points.length)) {
            return Shape.lIIlIIlllIlIll[1] != 0;
        }
        this.checkPoints();
        final Line lllllllllllllIIllIllIIIIllllllII = new Line(0.0f, 0.0f, 0.0f, 0.0f);
        final Vector2f lllllllllllllIIllIllIIIIlllllIll = new Vector2f(lllllllllllllIIllIllIIIIlllllllI, lllllllllllllIIllIllIIIIllllllIl);
        int lllllllllllllIIllIllIIIlIIIIIIII = Shape.lIIlIIlllIlIll[1];
        while (llIIlllIIllIIll(lllllllllllllIIllIllIIIlIIIIIIII, this.points.length)) {
            int lllllllllllllIIllIllIIIlIIIIIIIl = lllllllllllllIIllIllIIIlIIIIIIII + Shape.lIIlIIlllIlIll[2];
            if (llIIlllIIllIllI(lllllllllllllIIllIllIIIlIIIIIIIl, this.points.length)) {
                lllllllllllllIIllIllIIIlIIIIIIIl = Shape.lIIlIIlllIlIll[1];
            }
            lllllllllllllIIllIllIIIIllllllII.set(this.points[lllllllllllllIIllIllIIIlIIIIIIII], this.points[lllllllllllllIIllIllIIIlIIIIIIII + Shape.lIIlIIlllIlIll[0]], this.points[lllllllllllllIIllIllIIIlIIIIIIIl], this.points[lllllllllllllIIllIllIIIlIIIIIIIl + Shape.lIIlIIlllIlIll[0]]);
            if (llIIlllIIllIIII(lllllllllllllIIllIllIIIIllllllII.on(lllllllllllllIIllIllIIIIlllllIll) ? 1 : 0)) {
                return Shape.lIIlIIlllIlIll[0] != 0;
            }
            lllllllllllllIIllIllIIIlIIIIIIII += 2;
            "".length();
            if ("  ".length() <= ((0x47 ^ 0xB ^ (0xFD ^ 0xBB)) & (151 + 122 - 253 + 134 ^ 104 + 129 - 206 + 117 ^ -" ".length()))) {
                return ((25 + 129 - 140 + 140 ^ 28 + 110 - 58 + 117) & (0x5C ^ 0x1D ^ (0xDF ^ 0xC1) ^ -" ".length())) != 0x0;
            }
        }
        return Shape.lIIlIIlllIlIll[1] != 0;
    }
    
    private static int llIIlllIIllIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public Shape() {
        this.pointsDirty = (Shape.lIIlIIlllIlIll[0] != 0);
    }
    
    public void setY(float lllllllllllllIIllIllIIIllIIIlIlI) {
        if (llIIlllIIllIIII(llIIlllIIllIlII(lllllllllllllIIllIllIIIllIIIlIlI, this.y))) {
            final float lllllllllllllIIllIllIIIllIIIlllI = lllllllllllllIIllIllIIIllIIIlIlI - this.y;
            this.y = lllllllllllllIIllIllIIIllIIIlIlI;
            if (!llIIlllIIllIIIl(this.points) || llIIlllIIllIIlI(this.center)) {
                this.checkPoints();
            }
            int lllllllllllllIIllIllIIIllIIIllll = Shape.lIIlIIlllIlIll[1];
            while (llIIlllIIllIIll(lllllllllllllIIllIllIIIllIIIllll, this.points.length / Shape.lIIlIIlllIlIll[2])) {
                final float[] points = this.points;
                final int n = lllllllllllllIIllIllIIIllIIIllll * Shape.lIIlIIlllIlIll[2] + Shape.lIIlIIlllIlIll[0];
                points[n] += lllllllllllllIIllIllIIIllIIIlllI;
                ++lllllllllllllIIllIllIIIllIIIllll;
                "".length();
                if (null != null) {
                    return;
                }
            }
            final float[] center = this.center;
            final int n2 = Shape.lIIlIIlllIlIll[0];
            center[n2] += lllllllllllllIIllIllIIIllIIIlllI;
            lllllllllllllIIllIllIIIllIIIlIlI += lllllllllllllIIllIllIIIllIIIlllI;
            this.maxY += lllllllllllllIIllIllIIIllIIIlllI;
            this.minY += lllllllllllllIIllIllIIIllIIIlllI;
            this.trianglesDirty = (Shape.lIIlIIlllIlIll[0] != 0);
        }
    }
    
    public abstract Shape transform(final Transform p0);
    
    public void setCenterY(final float lllllllllllllIIllIllIIIlIllIIlIl) {
        if (!llIIlllIIllIIIl(this.points) || llIIlllIIllIIlI(this.center)) {
            this.checkPoints();
        }
        final float lllllllllllllIIllIllIIIlIllIIlll = lllllllllllllIIllIllIIIlIllIIlIl - this.getCenterY();
        this.setY(this.y + lllllllllllllIIllIllIIIlIllIIlll);
    }
    
    private static boolean llIIlllIIllIllI(final int lllllllllllllIIllIllIIIIIIIlIIlI, final int lllllllllllllIIllIllIIIIIIIlIIIl) {
        return lllllllllllllIIllIllIIIIIIIlIIlI >= lllllllllllllIIllIllIIIIIIIlIIIl;
    }
    
    private static int llIIlllIlIIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
}
