// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.util.ArrayList;

public class Path extends Shape
{
    private /* synthetic */ boolean closed;
    private /* synthetic */ float cx;
    private /* synthetic */ ArrayList localPoints;
    private /* synthetic */ ArrayList hole;
    private /* synthetic */ float cy;
    private static final /* synthetic */ int[] lIIIIlIlIIllII;
    private /* synthetic */ ArrayList holes;
    
    private static int lIlllIIllIlIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void startHole(final float lllllllllllllIlIIlIllIlIIlllIllI, final float lllllllllllllIlIIlIllIlIIlllIlIl) {
        this.hole = new ArrayList();
        this.holes.add(this.hole);
        "".length();
    }
    
    public void close() {
        this.closed = (Path.lIIIIlIlIIllII[2] != 0);
    }
    
    private static void lIlllIIllIlIIlI() {
        (lIIIIlIlIIllII = new int[4])[0] = "  ".length();
        Path.lIIIIlIlIIllII[1] = ((0x4C ^ 0x38 ^ (0xAA ^ 0x95)) & (0x11 ^ 0x6D ^ (0xB8 ^ 0x8F) ^ -" ".length()));
        Path.lIIIIlIlIIllII[2] = " ".length();
        Path.lIIIIlIlIIllII[3] = (0xB0 ^ 0xBA);
    }
    
    static {
        lIlllIIllIlIIlI();
    }
    
    private ArrayList transform(final ArrayList lllllllllllllIlIIlIllIlIIIIIllIl, final Transform lllllllllllllIlIIlIllIlIIIIIIlll) {
        final float[] lllllllllllllIlIIlIllIlIIIIIlIll = new float[lllllllllllllIlIIlIllIlIIIIIllIl.size() * Path.lIIIIlIlIIllII[0]];
        final float[] lllllllllllllIlIIlIllIlIIIIIlIlI = new float[lllllllllllllIlIIlIllIlIIIIIllIl.size() * Path.lIIIIlIlIIllII[0]];
        int lllllllllllllIlIIlIllIlIIIIlIIII = Path.lIIIIlIlIIllII[1];
        while (lIlllIIllIlIllI(lllllllllllllIlIIlIllIlIIIIlIIII, lllllllllllllIlIIlIllIlIIIIIllIl.size())) {
            lllllllllllllIlIIlIllIlIIIIIlIll[lllllllllllllIlIIlIllIlIIIIlIIII * Path.lIIIIlIlIIllII[0]] = ((float[])lllllllllllllIlIIlIllIlIIIIIllIl.get(lllllllllllllIlIIlIllIlIIIIlIIII))[Path.lIIIIlIlIIllII[1]];
            lllllllllllllIlIIlIllIlIIIIIlIll[lllllllllllllIlIIlIllIlIIIIlIIII * Path.lIIIIlIlIIllII[0] + Path.lIIIIlIlIIllII[2]] = ((float[])lllllllllllllIlIIlIllIlIIIIIllIl.get(lllllllllllllIlIIlIllIlIIIIlIIII))[Path.lIIIIlIlIIllII[2]];
            ++lllllllllllllIlIIlIllIlIIIIlIIII;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        lllllllllllllIlIIlIllIlIIIIIIlll.transform(lllllllllllllIlIIlIllIlIIIIIlIll, Path.lIIIIlIlIIllII[1], lllllllllllllIlIIlIllIlIIIIIlIlI, Path.lIIIIlIlIIllII[1], lllllllllllllIlIIlIllIlIIIIIllIl.size());
        final ArrayList lllllllllllllIlIIlIllIlIIIIIlIIl = new ArrayList();
        int lllllllllllllIlIIlIllIlIIIIIllll = Path.lIIIIlIlIIllII[1];
        while (lIlllIIllIlIllI(lllllllllllllIlIIlIllIlIIIIIllll, lllllllllllllIlIIlIllIlIIIIIllIl.size())) {
            final ArrayList list = lllllllllllllIlIIlIllIlIIIIIlIIl;
            final float[] e = new float[Path.lIIIIlIlIIllII[0]];
            e[Path.lIIIIlIlIIllII[1]] = lllllllllllllIlIIlIllIlIIIIIlIlI[lllllllllllllIlIIlIllIlIIIIIllll * Path.lIIIIlIlIIllII[0]];
            e[Path.lIIIIlIlIIllII[2]] = lllllllllllllIlIIlIllIlIIIIIlIlI[lllllllllllllIlIIlIllIlIIIIIllll * Path.lIIIIlIlIIllII[0] + Path.lIIIIlIlIIllII[2]];
            list.add(e);
            "".length();
            ++lllllllllllllIlIIlIllIlIIIIIllll;
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        return lllllllllllllIlIIlIllIlIIIIIlIIl;
    }
    
    public Path(final float lllllllllllllIlIIlIllIlIIlllllIl, final float lllllllllllllIlIIlIllIlIIlllllII) {
        this.localPoints = new ArrayList();
        this.holes = new ArrayList();
        final ArrayList localPoints = this.localPoints;
        final float[] e = new float[Path.lIIIIlIlIIllII[0]];
        e[Path.lIIIIlIlIIllII[1]] = lllllllllllllIlIIlIllIlIIlllllIl;
        e[Path.lIIIIlIlIIllII[2]] = lllllllllllllIlIIlIllIlIIlllllII;
        localPoints.add(e);
        "".length();
        this.cx = lllllllllllllIlIIlIllIlIIlllllIl;
        this.cy = lllllllllllllIlIIlIllIlIIlllllII;
        this.pointsDirty = (Path.lIIIIlIlIIllII[2] != 0);
    }
    
    private static boolean lIlllIIllIlIIll(final Object lllllllllllllIlIIlIllIIllllllIlI) {
        return lllllllllllllIlIIlIllIIllllllIlI != null;
    }
    
    public void curveTo(final float lllllllllllllIlIIlIllIlIIlIlllll, final float lllllllllllllIlIIlIllIlIIlIlIlll, final float lllllllllllllIlIIlIllIlIIlIlIllI, final float lllllllllllllIlIIlIllIlIIlIlIlIl, final float lllllllllllllIlIIlIllIlIIlIlIlII, final float lllllllllllllIlIIlIllIlIIlIlIIll) {
        this.curveTo(lllllllllllllIlIIlIllIlIIlIlllll, lllllllllllllIlIIlIllIlIIlIlIlll, lllllllllllllIlIIlIllIlIIlIlIllI, lllllllllllllIlIIlIllIlIIlIlIlIl, lllllllllllllIlIIlIllIlIIlIlIlII, lllllllllllllIlIIlIllIlIIlIlIIll, Path.lIIIIlIlIIllII[3]);
    }
    
    @Override
    protected void createPoints() {
        this.points = new float[this.localPoints.size() * Path.lIIIIlIlIIllII[0]];
        int lllllllllllllIlIIlIllIlIIIlIIlll = Path.lIIIIlIlIIllII[1];
        while (lIlllIIllIlIllI(lllllllllllllIlIIlIllIlIIIlIIlll, this.localPoints.size())) {
            final float[] lllllllllllllIlIIlIllIlIIIlIlIII = this.localPoints.get(lllllllllllllIlIIlIllIlIIIlIIlll);
            this.points[lllllllllllllIlIIlIllIlIIIlIIlll * Path.lIIIIlIlIIllII[0]] = lllllllllllllIlIIlIllIlIIIlIlIII[Path.lIIIIlIlIIllII[1]];
            this.points[lllllllllllllIlIIlIllIlIIIlIIlll * Path.lIIIIlIlIIllII[0] + Path.lIIIIlIlIIllII[2]] = lllllllllllllIlIIlIllIlIIIlIlIII[Path.lIIIIlIlIIllII[2]];
            ++lllllllllllllIlIIlIllIlIIIlIIlll;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
        }
    }
    
    public void lineTo(final float lllllllllllllIlIIlIllIlIIllIllll, final float lllllllllllllIlIIlIllIlIIllIlIll) {
        if (lIlllIIllIlIIll(this.hole)) {
            final ArrayList hole = this.hole;
            final float[] e = new float[Path.lIIIIlIlIIllII[0]];
            e[Path.lIIIIlIlIIllII[1]] = lllllllllllllIlIIlIllIlIIllIllll;
            e[Path.lIIIIlIlIIllII[2]] = lllllllllllllIlIIlIllIlIIllIlIll;
            hole.add(e);
            "".length();
            "".length();
            if (-" ".length() > " ".length()) {
                return;
            }
        }
        else {
            final ArrayList localPoints = this.localPoints;
            final float[] e2 = new float[Path.lIIIIlIlIIllII[0]];
            e2[Path.lIIIIlIlIIllII[1]] = lllllllllllllIlIIlIllIlIIllIllll;
            e2[Path.lIIIIlIlIIllII[2]] = lllllllllllllIlIIlIllIlIIllIlIll;
            localPoints.add(e2);
            "".length();
        }
        this.cx = lllllllllllllIlIIlIllIlIIllIllll;
        this.cy = lllllllllllllIlIIlIllIlIIllIlIll;
        this.pointsDirty = (Path.lIIIIlIlIIllII[2] != 0);
    }
    
    @Override
    public boolean closed() {
        return this.closed;
    }
    
    private static boolean lIlllIIllIlIlIl(final int lllllllllllllIlIIlIllIIllllllIII) {
        return lllllllllllllIlIIlIllIIllllllIII == 0;
    }
    
    public void curveTo(final float lllllllllllllIlIIlIllIlIIIllIlll, final float lllllllllllllIlIIlIllIlIIIllIllI, final float lllllllllllllIlIIlIllIlIIIllllll, final float lllllllllllllIlIIlIllIlIIIlllllI, final float lllllllllllllIlIIlIllIlIIIllllIl, final float lllllllllllllIlIIlIllIlIIIllllII, final int lllllllllllllIlIIlIllIlIIIlllIll) {
        if (lIlllIIllIlIlIl(lIlllIIllIlIlII(this.cx, lllllllllllllIlIIlIllIlIIIllIlll)) && lIlllIIllIlIlIl(lIlllIIllIlIlII(this.cy, lllllllllllllIlIIlIllIlIIIllIllI))) {
            return;
        }
        final Curve lllllllllllllIlIIlIllIlIIIlllIlI = new Curve(new Vector2f(this.cx, this.cy), new Vector2f(lllllllllllllIlIIlIllIlIIIllllll, lllllllllllllIlIIlIllIlIIIlllllI), new Vector2f(lllllllllllllIlIIlIllIlIIIllllIl, lllllllllllllIlIIlIllIlIIIllllII), new Vector2f(lllllllllllllIlIIlIllIlIIIllIlll, lllllllllllllIlIIlIllIlIIIllIllI));
        final float lllllllllllllIlIIlIllIlIIIlllIIl = 1.0f / lllllllllllllIlIIlIllIlIIIlllIll;
        int lllllllllllllIlIIlIllIlIIlIIIIll = Path.lIIIIlIlIIllII[2];
        while (lIlllIIllIlIllI(lllllllllllllIlIIlIllIlIIlIIIIll, lllllllllllllIlIIlIllIlIIIlllIll + Path.lIIIIlIlIIllII[2])) {
            final float lllllllllllllIlIIlIllIlIIlIIIlIl = lllllllllllllIlIIlIllIlIIlIIIIll * lllllllllllllIlIIlIllIlIIIlllIIl;
            final Vector2f lllllllllllllIlIIlIllIlIIlIIIlII = lllllllllllllIlIIlIllIlIIIlllIlI.pointAt(lllllllllllllIlIIlIllIlIIlIIIlIl);
            if (lIlllIIllIlIIll(this.hole)) {
                final ArrayList hole = this.hole;
                final float[] e = new float[Path.lIIIIlIlIIllII[0]];
                e[Path.lIIIIlIlIIllII[1]] = lllllllllllllIlIIlIllIlIIlIIIlII.x;
                e[Path.lIIIIlIlIIllII[2]] = lllllllllllllIlIIlIllIlIIlIIIlII.y;
                hole.add(e);
                "".length();
                "".length();
                if ((0xB8 ^ 0xBC) > (0x85 ^ 0x81)) {
                    return;
                }
            }
            else {
                final ArrayList localPoints = this.localPoints;
                final float[] e2 = new float[Path.lIIIIlIlIIllII[0]];
                e2[Path.lIIIIlIlIIllII[1]] = lllllllllllllIlIIlIllIlIIlIIIlII.x;
                e2[Path.lIIIIlIlIIllII[2]] = lllllllllllllIlIIlIllIlIIlIIIlII.y;
                localPoints.add(e2);
                "".length();
            }
            this.cx = lllllllllllllIlIIlIllIlIIlIIIlII.x;
            this.cy = lllllllllllllIlIIlIllIlIIlIIIlII.y;
            ++lllllllllllllIlIIlIllIlIIlIIIIll;
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
        this.pointsDirty = (Path.lIIIIlIlIIllII[2] != 0);
    }
    
    @Override
    public Shape transform(final Transform lllllllllllllIlIIlIllIlIIIIllIIl) {
        final Path lllllllllllllIlIIlIllIlIIIIllIll = new Path(this.cx, this.cy);
        lllllllllllllIlIIlIllIlIIIIllIll.localPoints = this.transform(this.localPoints, lllllllllllllIlIIlIllIlIIIIllIIl);
        int lllllllllllllIlIIlIllIlIIIIllllI = Path.lIIIIlIlIIllII[1];
        while (lIlllIIllIlIllI(lllllllllllllIlIIlIllIlIIIIllllI, this.holes.size())) {
            lllllllllllllIlIIlIllIlIIIIllIll.holes.add(this.transform(this.holes.get(lllllllllllllIlIIlIllIlIIIIllllI), lllllllllllllIlIIlIllIlIIIIllIIl));
            "".length();
            ++lllllllllllllIlIIlIllIlIIIIllllI;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        lllllllllllllIlIIlIllIlIIIIllIll.closed = this.closed;
        return lllllllllllllIlIIlIllIlIIIIllIll;
    }
    
    private static boolean lIlllIIllIlIllI(final int lllllllllllllIlIIlIllIIlllllllIl, final int lllllllllllllIlIIlIllIIlllllllII) {
        return lllllllllllllIlIIlIllIIlllllllIl < lllllllllllllIlIIlIllIIlllllllII;
    }
}
