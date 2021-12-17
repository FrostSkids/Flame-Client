// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.util.ArrayList;

public class Polygon extends Shape
{
    private /* synthetic */ boolean allowDups;
    private /* synthetic */ boolean closed;
    private static final /* synthetic */ int[] llIIIlllllIlII;
    
    public void setAllowDuplicatePoints(final boolean llllllllllllIlllIIllllIIllIIIIIl) {
        this.allowDups = llllllllllllIlllIIllllIIllIIIIIl;
    }
    
    public void setClosed(final boolean llllllllllllIlllIIllllIIlIIIlllI) {
        this.closed = llllllllllllIlllIIllllIIlIIIlllI;
    }
    
    private static boolean lIIIlIllIlIIlIlI(final int llllllllllllIlllIIllllIIIllllIlI) {
        return llllllllllllIlllIIllllIIIllllIlI > 0;
    }
    
    private static int lIIIlIllIlIIIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public Polygon() {
        this.allowDups = (Polygon.llIIIlllllIlII[0] != 0);
        this.closed = (Polygon.llIIIlllllIlII[1] != 0);
        this.points = new float[Polygon.llIIIlllllIlII[0]];
        this.maxX = -1.4E-45f;
        this.maxY = -1.4E-45f;
        this.minX = Float.MAX_VALUE;
        this.minY = Float.MAX_VALUE;
    }
    
    private static void lIIIlIllIlIIIlIl() {
        (llIIIlllllIlII = new int[3])[0] = ((0xCD ^ 0x81 ^ (0x13 ^ 0x62)) & (0xBD ^ 0x8E ^ (0x49 ^ 0x47) ^ -" ".length()));
        Polygon.llIIIlllllIlII[1] = " ".length();
        Polygon.llIIIlllllIlII[2] = "  ".length();
    }
    
    private static int lIIIlIllIlIIIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public boolean closed() {
        return this.closed;
    }
    
    private static boolean lIIIlIllIlIIlIII(final int llllllllllllIlllIIllllIIlIIIIIll, final int llllllllllllIlllIIllllIIlIIIIIlI) {
        return llllllllllllIlllIIllllIIlIIIIIll < llllllllllllIlllIIllllIIlIIIIIlI;
    }
    
    @Override
    protected void createPoints() {
    }
    
    @Override
    public Shape transform(final Transform llllllllllllIlllIIllllIIlIlIIlII) {
        this.checkPoints();
        final Polygon llllllllllllIlllIIllllIIlIlIIlll = new Polygon();
        final float[] llllllllllllIlllIIllllIIlIlIIllI = new float[this.points.length];
        llllllllllllIlllIIllllIIlIlIIlII.transform(this.points, Polygon.llIIIlllllIlII[0], llllllllllllIlllIIllllIIlIlIIllI, Polygon.llIIIlllllIlII[0], this.points.length / Polygon.llIIIlllllIlII[2]);
        llllllllllllIlllIIllllIIlIlIIlll.points = llllllllllllIlllIIllllIIlIlIIllI;
        llllllllllllIlllIIllllIIlIlIIlll.findCenter();
        llllllllllllIlllIIllllIIlIlIIlll.closed = this.closed;
        return llllllllllllIlllIIllllIIlIlIIlll;
    }
    
    @Override
    public void setY(final float llllllllllllIlllIIllllIIlIIllIII) {
        super.setY(llllllllllllIlllIIllllIIlIIllIII);
        this.pointsDirty = (Polygon.llIIIlllllIlII[0] != 0);
    }
    
    private static int lIIIlIllIlIIllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIlIllIlIIlIIl(final int llllllllllllIlllIIllllIIIllllllI) {
        return llllllllllllIlllIIllllIIIllllllI == 0;
    }
    
    private static boolean lIIIlIllIlIIlIll(final int llllllllllllIlllIIllllIIIlllllII) {
        return llllllllllllIlllIIllllIIIlllllII < 0;
    }
    
    @Override
    public void setX(final float llllllllllllIlllIIllllIIlIIllllI) {
        super.setX(llllllllllllIlllIIllllIIlIIllllI);
        this.pointsDirty = (Polygon.llIIIlllllIlII[0] != 0);
    }
    
    static {
        lIIIlIllIlIIIlIl();
    }
    
    public Polygon(final float[] llllllllllllIlllIIllllIIllIIllll) {
        this.allowDups = (Polygon.llIIIlllllIlII[0] != 0);
        this.closed = (Polygon.llIIIlllllIlII[1] != 0);
        final int llllllllllllIlllIIllllIIllIIlllI = llllllllllllIlllIIllllIIllIIllll.length;
        this.points = new float[llllllllllllIlllIIllllIIllIIlllI];
        this.maxX = -1.4E-45f;
        this.maxY = -1.4E-45f;
        this.minX = Float.MAX_VALUE;
        this.minY = Float.MAX_VALUE;
        this.x = Float.MAX_VALUE;
        this.y = Float.MAX_VALUE;
        int llllllllllllIlllIIllllIIllIlIIIl = Polygon.llIIIlllllIlII[0];
        while (lIIIlIllIlIIlIII(llllllllllllIlllIIllllIIllIlIIIl, llllllllllllIlllIIllllIIllIIlllI)) {
            this.points[llllllllllllIlllIIllllIIllIlIIIl] = llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl];
            if (lIIIlIllIlIIlIIl(llllllllllllIlllIIllllIIllIlIIIl % Polygon.llIIIlllllIlII[2])) {
                if (lIIIlIllIlIIlIlI(lIIIlIllIlIIIllI(llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl], this.maxX))) {
                    this.maxX = llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl];
                }
                if (lIIIlIllIlIIlIll(lIIIlIllIlIIIlll(llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl], this.minX))) {
                    this.minX = llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl];
                }
                if (lIIIlIllIlIIlIll(lIIIlIllIlIIIlll(llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl], this.x))) {
                    this.x = llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl];
                    "".length();
                    if (" ".length() != " ".length()) {
                        throw null;
                    }
                }
            }
            else {
                if (lIIIlIllIlIIlIlI(lIIIlIllIlIIIllI(llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl], this.maxY))) {
                    this.maxY = llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl];
                }
                if (lIIIlIllIlIIlIll(lIIIlIllIlIIIlll(llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl], this.minY))) {
                    this.minY = llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl];
                }
                if (lIIIlIllIlIIlIll(lIIIlIllIlIIIlll(llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl], this.y))) {
                    this.y = llllllllllllIlllIIllllIIllIIllll[llllllllllllIlllIIllllIIllIlIIIl];
                }
            }
            ++llllllllllllIlllIIllllIIllIlIIIl;
            "".length();
            if (-" ".length() != -" ".length()) {
                throw null;
            }
        }
        this.findCenter();
        this.calculateRadius();
        this.pointsDirty = (Polygon.llIIIlllllIlII[1] != 0);
    }
    
    private static boolean lIIIlIllIlIIlllI(final int llllllllllllIlllIIllllIIlIIIIIII) {
        return llllllllllllIlllIIllllIIlIIIIIII != 0;
    }
    
    public void addPoint(final float llllllllllllIlllIIllllIIlIllIlll, final float llllllllllllIlllIIllllIIlIllIIIl) {
        if (lIIIlIllIlIIlllI(this.hasVertex(llllllllllllIlllIIllllIIlIllIlll, llllllllllllIlllIIllllIIlIllIIIl) ? 1 : 0) && lIIIlIllIlIIlIIl(this.allowDups ? 1 : 0)) {
            return;
        }
        final ArrayList llllllllllllIlllIIllllIIlIllIlIl = new ArrayList();
        int llllllllllllIlllIIllllIIlIlllIlI = Polygon.llIIIlllllIlII[0];
        while (lIIIlIllIlIIlIII(llllllllllllIlllIIllllIIlIlllIlI, this.points.length)) {
            llllllllllllIlllIIllllIIlIllIlIl.add(new Float(this.points[llllllllllllIlllIIllllIIlIlllIlI]));
            "".length();
            ++llllllllllllIlllIIllllIIlIlllIlI;
            "".length();
            if (((0x37 ^ 0x3D) & ~(0x6A ^ 0x60)) > " ".length()) {
                return;
            }
        }
        llllllllllllIlllIIllllIIlIllIlIl.add(new Float(llllllllllllIlllIIllllIIlIllIlll));
        "".length();
        llllllllllllIlllIIllllIIlIllIlIl.add(new Float(llllllllllllIlllIIllllIIlIllIIIl));
        "".length();
        final int llllllllllllIlllIIllllIIlIllIlII = llllllllllllIlllIIllllIIlIllIlIl.size();
        this.points = new float[llllllllllllIlllIIllllIIlIllIlII];
        int llllllllllllIlllIIllllIIlIlllIIl = Polygon.llIIIlllllIlII[0];
        while (lIIIlIllIlIIlIII(llllllllllllIlllIIllllIIlIlllIIl, llllllllllllIlllIIllllIIlIllIlII)) {
            this.points[llllllllllllIlllIIllllIIlIlllIIl] = llllllllllllIlllIIllllIIlIllIlIl.get(llllllllllllIlllIIllllIIlIlllIIl);
            ++llllllllllllIlllIIllllIIlIlllIIl;
            "".length();
            if (((0xEC ^ 0xB5) & ~(0x31 ^ 0x68)) != 0x0) {
                return;
            }
        }
        if (lIIIlIllIlIIlIlI(lIIIlIllIlIIllII(llllllllllllIlllIIllllIIlIllIlll, this.maxX))) {
            this.maxX = llllllllllllIlllIIllllIIlIllIlll;
        }
        if (lIIIlIllIlIIlIlI(lIIIlIllIlIIllII(llllllllllllIlllIIllllIIlIllIIIl, this.maxY))) {
            this.maxY = llllllllllllIlllIIllllIIlIllIIIl;
        }
        if (lIIIlIllIlIIlIll(lIIIlIllIlIIllIl(llllllllllllIlllIIllllIIlIllIlll, this.minX))) {
            this.minX = llllllllllllIlllIIllllIIlIllIlll;
        }
        if (lIIIlIllIlIIlIll(lIIIlIllIlIIllIl(llllllllllllIlllIIllllIIlIllIIIl, this.minY))) {
            this.minY = llllllllllllIlllIIllllIIlIllIIIl;
        }
        this.findCenter();
        this.calculateRadius();
        this.pointsDirty = (Polygon.llIIIlllllIlII[1] != 0);
    }
    
    public Polygon copy() {
        final float[] llllllllllllIlllIIllllIIlIIIlIII = new float[this.points.length];
        System.arraycopy(this.points, Polygon.llIIIlllllIlII[0], llllllllllllIlllIIllllIIlIIIlIII, Polygon.llIIIlllllIlII[0], llllllllllllIlllIIllllIIlIIIlIII.length);
        return new Polygon(llllllllllllIlllIIllllIIlIIIlIII);
    }
    
    private static int lIIIlIllIlIIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
}
