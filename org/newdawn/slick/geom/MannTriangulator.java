// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.io.Serializable;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.List;

public class MannTriangulator implements Triangulator
{
    protected /* synthetic */ PointBag contour;
    private /* synthetic */ List triangles;
    protected /* synthetic */ PointBag holes;
    private /* synthetic */ PointBag nextFreePointBag;
    private static final /* synthetic */ int[] lIlIIIIIlIlIIl;
    private /* synthetic */ Point nextFreePoint;
    
    private static boolean lllIIIIIlIIIllI(final Object lllllllllllllIIlIIIIllllllIIllIl) {
        return lllllllllllllIIlIIIIllllllIIllIl == null;
    }
    
    public void reset() {
        while (lllIIIIIlIIIlIl(this.holes)) {
            this.holes = this.freePointBag(this.holes);
            "".length();
            if ((0xB2 ^ 0xB6) <= "   ".length()) {
                return;
            }
        }
        this.contour.clear();
        this.holes = null;
    }
    
    private static boolean lllIIIIIlIIlIll(final int lllllllllllllIIlIIIIllllllIIlIIl) {
        return lllllllllllllIIlIIIIllllllIIlIIl == 0;
    }
    
    private Vector2f[] triangulate(Vector2f[] lllllllllllllIIlIIIlIIIIIIlIIlIl) {
        this.contour.computeAngles();
        PointBag lllllllllllllIIlIIIlIIIIIIllIllI = this.holes;
        while (lllIIIIIlIIIlIl(lllllllllllllIIlIIIlIIIIIIllIllI)) {
            lllllllllllllIIlIIIlIIIIIIllIllI.computeAngles();
            lllllllllllllIIlIIIlIIIIIIllIllI = lllllllllllllIIlIIIlIIIIIIllIllI.next;
            "".length();
            if ((0x94 ^ 0x91) == 0x0) {
                return null;
            }
        }
        while (lllIIIIIlIIIlIl(this.holes)) {
            Point lllllllllllllIIlIIIlIIIIIIllIIIl = this.holes.first;
        Label_0373:
            do {
                if (lllIIIIIlIIlIIl(lllIIIIIlIIIlll(lllllllllllllIIlIIIlIIIIIIllIIIl.angle, 0.0))) {
                    Point lllllllllllllIIlIIIlIIIIIIllIIlI = this.contour.first;
                    do {
                        if (lllIIIIIlIIlIlI(lllllllllllllIIlIIIlIIIIIIllIIIl.isInfront(lllllllllllllIIlIIIlIIIIIIllIIlI) ? 1 : 0) && lllIIIIIlIIlIlI(lllllllllllllIIlIIIlIIIIIIllIIlI.isInfront(lllllllllllllIIlIIIlIIIIIIllIIIl) ? 1 : 0) && lllIIIIIlIIlIll(this.contour.doesIntersectSegment(lllllllllllllIIlIIIlIIIIIIllIIIl.pt, lllllllllllllIIlIIIlIIIIIIllIIlI.pt) ? 1 : 0)) {
                            PointBag lllllllllllllIIlIIIlIIIIIIllIlIl = this.holes;
                            while (!lllIIIIIlIIlIlI(lllllllllllllIIlIIIlIIIIIIllIlIl.doesIntersectSegment(lllllllllllllIIlIIIlIIIIIIllIIIl.pt, lllllllllllllIIlIIIlIIIIIIllIIlI.pt) ? 1 : 0)) {
                                if (lllIIIIIlIIIllI(lllllllllllllIIlIIIlIIIIIIllIlIl = lllllllllllllIIlIIIlIIIIIIllIlIl.next)) {
                                    final Point lllllllllllllIIlIIIlIIIIIIllIlII = this.getPoint(lllllllllllllIIlIIIlIIIIIIllIIlI.pt);
                                    lllllllllllllIIlIIIlIIIIIIllIIlI.insertAfter(lllllllllllllIIlIIIlIIIIIIllIlII);
                                    final Point lllllllllllllIIlIIIlIIIIIIllIIll = this.getPoint(lllllllllllllIIlIIIlIIIIIIllIIIl.pt);
                                    lllllllllllllIIlIIIlIIIIIIllIIIl.insertBefore(lllllllllllllIIlIIIlIIIIIIllIIll);
                                    lllllllllllllIIlIIIlIIIIIIllIIlI.next = lllllllllllllIIlIIIlIIIIIIllIIIl;
                                    lllllllllllllIIlIIIlIIIIIIllIIIl.prev = lllllllllllllIIlIIIlIIIIIIllIIlI;
                                    lllllllllllllIIlIIIlIIIIIIllIIll.next = lllllllllllllIIlIIIlIIIIIIllIlII;
                                    lllllllllllllIIlIIIlIIIIIIllIlII.prev = lllllllllllllIIlIIIlIIIIIIllIIll;
                                    lllllllllllllIIlIIIlIIIIIIllIIlI.computeAngle();
                                    lllllllllllllIIlIIIlIIIIIIllIIIl.computeAngle();
                                    lllllllllllllIIlIIIlIIIIIIllIlII.computeAngle();
                                    lllllllllllllIIlIIIlIIIIIIllIIll.computeAngle();
                                    this.holes.first = null;
                                    "".length();
                                    if (((42 + 105 - 22 + 79 ^ 144 + 149 - 266 + 126) & (169 + 13 + 10 + 28 ^ 95 + 49 - 62 + 55 ^ -" ".length())) != 0x0) {
                                        return null;
                                    }
                                    break Label_0373;
                                }
                            }
                            "".length();
                            if ("   ".length() == 0) {
                                return null;
                            }
                            continue;
                        }
                    } while (!lllIIIIIlIIllII(lllllllllllllIIlIIIlIIIIIIllIIlI = lllllllllllllIIlIIIlIIIIIIllIIlI.next, this.contour.first));
                }
            } while (!lllIIIIIlIIllII(lllllllllllllIIlIIIlIIIIIIllIIIl = lllllllllllllIIlIIIlIIIIIIllIIIl.next, this.holes.first));
            this.holes = this.freePointBag(this.holes);
            "".length();
            if ((0x97 ^ 0x93) == ((0x7B ^ 0x39) & ~(0xD8 ^ 0x9A))) {
                return null;
            }
        }
        final int lllllllllllllIIlIIIlIIIIIIlIlIIl = this.contour.countPoints() - MannTriangulator.lIlIIIIIlIlIIl[0];
        final int lllllllllllllIIlIIIlIIIIIIlIlIII = lllllllllllllIIlIIIlIIIIIIlIlIIl * MannTriangulator.lIlIIIIIlIlIIl[1] + MannTriangulator.lIlIIIIIlIlIIl[2];
        if (lllIIIIIlIIllIl(lllllllllllllIIlIIIlIIIIIIlIIlIl.length, lllllllllllllIIlIIIlIIIIIIlIlIII)) {
            lllllllllllllIIlIIIlIIIIIIlIIlIl = (Vector2f[])Array.newInstance(lllllllllllllIIlIIIlIIIIIIlIIlIl.getClass().getComponentType(), lllllllllllllIIlIIIlIIIIIIlIlIII);
        }
        int lllllllllllllIIlIIIlIIIIIIlIIlll = MannTriangulator.lIlIIIIIlIlIIl[3];
        do {
            Point lllllllllllllIIlIIIlIIIIIIlIlllI = this.contour.first;
            if (lllIIIIIlIIIllI(lllllllllllllIIlIIIlIIIIIIlIlllI)) {
                "".length();
                if (((151 + 71 - 216 + 168 ^ 73 + 175 - 200 + 140) & (145 + 145 - 123 + 24 ^ 43 + 33 + 67 + 30 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                if (!lllIIIIIlIIllII(lllllllllllllIIlIIIlIIIIIIlIlllI.next, lllllllllllllIIlIIIlIIIIIIlIlllI.prev)) {
                    do {
                        if (lllIIIIIlIIlllI(lllIIIIIlIIlIII(lllllllllllllIIlIIIlIIIIIIlIlllI.angle, 0.0))) {
                            final Point lllllllllllllIIlIIIlIIIIIIllIIII = lllllllllllllIIlIIIlIIIIIIlIlllI.prev;
                            final Point lllllllllllllIIlIIIlIIIIIIlIllll = lllllllllllllIIlIIIlIIIIIIlIlllI.next;
                            if ((lllIIIIIlIIllll(lllllllllllllIIlIIIlIIIIIIlIllll.next, lllllllllllllIIlIIIlIIIIIIllIIII) && (!lllIIIIIlIIlIlI(lllllllllllllIIlIIIlIIIIIIllIIII.isInfront(lllllllllllllIIlIIIlIIIIIIlIllll) ? 1 : 0) || !lllIIIIIlIIlIlI(lllllllllllllIIlIIIlIIIIIIlIllll.isInfront(lllllllllllllIIlIIIlIIIIIIllIIII) ? 1 : 0))) || !lllIIIIIlIIlIll(this.contour.doesIntersectSegment(lllllllllllllIIlIIIlIIIIIIllIIII.pt, lllllllllllllIIlIIIlIIIIIIlIllll.pt) ? 1 : 0)) {
                                continue;
                            }
                            lllllllllllllIIlIIIlIIIIIIlIIlIl[lllllllllllllIIlIIIlIIIIIIlIIlll++] = lllllllllllllIIlIIIlIIIIIIlIlllI.pt;
                            lllllllllllllIIlIIIlIIIIIIlIIlIl[lllllllllllllIIlIIIlIIIIIIlIIlll++] = lllllllllllllIIlIIIlIIIIIIlIllll.pt;
                            lllllllllllllIIlIIIlIIIIIIlIIlIl[lllllllllllllIIlIIIlIIIIIIlIIlll++] = lllllllllllllIIlIIIlIIIIIIllIIII.pt;
                            "".length();
                            if (" ".length() < ((0x93 ^ 0xB7) & ~(0x98 ^ 0xBC))) {
                                return null;
                            }
                            break;
                        }
                    } while (!lllIIIIIlIIllII(lllllllllllllIIlIIIlIIIIIIlIlllI = lllllllllllllIIlIIIlIIIIIIlIlllI.next, this.contour.first));
                    final Point lllllllllllllIIlIIIlIIIIIIlIllIl = lllllllllllllIIlIIIlIIIIIIlIlllI.prev;
                    final Point lllllllllllllIIlIIIlIIIIIIlIllII = lllllllllllllIIlIIIlIIIIIIlIlllI.next;
                    this.contour.first = lllllllllllllIIlIIIlIIIIIIlIllIl;
                    lllllllllllllIIlIIIlIIIIIIlIlllI.unlink();
                    this.freePoint(lllllllllllllIIlIIIlIIIIIIlIlllI);
                    lllllllllllllIIlIIIlIIIIIIlIllII.computeAngle();
                    lllllllllllllIIlIIIlIIIIIIlIllIl.computeAngle();
                    "".length();
                    continue;
                }
                "".length();
                if ("   ".length() < "   ".length()) {
                    return null;
                }
            }
            lllllllllllllIIlIIIlIIIIIIlIIlIl[lllllllllllllIIlIIIlIIIIIIlIIlll] = null;
            this.contour.clear();
            return lllllllllllllIIlIIIlIIIIIIlIIlIl;
        } while ((35 + 109 - 141 + 196 ^ 29 + 92 + 56 + 18) >= (86 + 65 - 58 + 50 ^ 87 + 123 - 87 + 16));
        return null;
    }
    
    public int getTriangleCount() {
        return this.triangles.size() / MannTriangulator.lIlIIIIIlIlIIl[1];
    }
    
    public void addPolyPoint(final float lllllllllllllIIlIIIlIIIIIlIlIIll, final float lllllllllllllIIlIIIlIIIIIlIlIIlI) {
        this.addPoint(new Vector2f(lllllllllllllIIlIIIlIIIIIlIlIIll, lllllllllllllIIlIIIlIIIIIlIlIIlI));
    }
    
    private void addPoint(final Vector2f lllllllllllllIIlIIIlIIIIIlIIIIII) {
        if (lllIIIIIlIIIllI(this.holes)) {
            final Point lllllllllllllIIlIIIlIIIIIlIIIlIl = this.getPoint(lllllllllllllIIlIIIlIIIIIlIIIIII);
            this.contour.add(lllllllllllllIIlIIIlIIIIIlIIIlIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final Point lllllllllllllIIlIIIlIIIIIlIIIlII = this.getPoint(lllllllllllllIIlIIIlIIIIIlIIIIII);
            this.holes.add(lllllllllllllIIlIIIlIIIIIlIIIlII);
        }
    }
    
    static {
        lllIIIIIlIIIlII();
    }
    
    private static boolean lllIIIIIlIIllII(final Object lllllllllllllIIlIIIIllllllIlIIII, final Object lllllllllllllIIlIIIIllllllIIllll) {
        return lllllllllllllIIlIIIIllllllIlIIII == lllllllllllllIIlIIIIllllllIIllll;
    }
    
    private static int lllIIIIIlIIIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private void freePoint(final Point lllllllllllllIIlIIIlIIIIIIIIIIIl) {
        lllllllllllllIIlIIIlIIIIIIIIIIIl.next = this.nextFreePoint;
        this.nextFreePoint = lllllllllllllIIlIIIlIIIIIIIIIIIl;
    }
    
    private PointBag getPointBag() {
        final PointBag lllllllllllllIIlIIIlIIIIIIIllIll = this.nextFreePointBag;
        if (lllIIIIIlIIIlIl(lllllllllllllIIlIIIlIIIIIIIllIll)) {
            this.nextFreePointBag = lllllllllllllIIlIIIlIIIIIIIllIll.next;
            lllllllllllllIIlIIIlIIIIIIIllIll.next = null;
            return lllllllllllllIIlIIIlIIIIIIIllIll;
        }
        return new PointBag();
    }
    
    private static boolean lllIIIIIlIIlIlI(final int lllllllllllllIIlIIIIllllllIIlIll) {
        return lllllllllllllIIlIIIIllllllIIlIll != 0;
    }
    
    public boolean triangulate() {
        final Vector2f[] lllllllllllllIIlIIIIllllllllIlIl = this.triangulate(new Vector2f[MannTriangulator.lIlIIIIIlIlIIl[3]]);
        int lllllllllllllIIlIIIIllllllllIlll = MannTriangulator.lIlIIIIIlIlIIl[3];
        while (lllIIIIIlIIllIl(lllllllllllllIIlIIIIllllllllIlll, lllllllllllllIIlIIIIllllllllIlIl.length)) {
            if (lllIIIIIlIIIllI(lllllllllllllIIlIIIIllllllllIlIl[lllllllllllllIIlIIIIllllllllIlll])) {
                "".length();
                if ((0x56 ^ 0x52) < 0) {
                    return ((0xCD ^ 0x83) & ~(0xCD ^ 0x83)) != 0x0;
                }
                break;
            }
            else {
                this.triangles.add(lllllllllllllIIlIIIIllllllllIlIl[lllllllllllllIIlIIIIllllllllIlll]);
                "".length();
                ++lllllllllllllIIlIIIIllllllllIlll;
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0x83 ^ 0x9B ^ (0xE5 ^ 0xAB)) & (0x8B ^ 0xA9 ^ (0xC9 ^ 0xBD) ^ -" ".length())) != 0x0;
                }
                continue;
            }
        }
        return MannTriangulator.lIlIIIIIlIlIIl[2] != 0;
    }
    
    private PointBag freePointBag(final PointBag lllllllllllllIIlIIIlIIIIIIIlIlII) {
        final PointBag lllllllllllllIIlIIIlIIIIIIIlIIll = lllllllllllllIIlIIIlIIIIIIIlIlII.next;
        lllllllllllllIIlIIIlIIIIIIIlIlII.clear();
        lllllllllllllIIlIIIlIIIIIIIlIlII.next = this.nextFreePointBag;
        this.nextFreePointBag = lllllllllllllIIlIIIlIIIIIIIlIlII;
        return lllllllllllllIIlIIIlIIIIIIIlIIll;
    }
    
    private static boolean lllIIIIIlIIllll(final Object lllllllllllllIIlIIIIllllllIlIllI, final Object lllllllllllllIIlIIIIllllllIlIlIl) {
        return lllllllllllllIIlIIIIllllllIlIllI != lllllllllllllIIlIIIIllllllIlIlIl;
    }
    
    private Point getPoint(final Vector2f lllllllllllllIIlIIIlIIIIIIIIlIII) {
        final Point lllllllllllllIIlIIIlIIIIIIIIlIlI = this.nextFreePoint;
        if (lllIIIIIlIIIlIl(lllllllllllllIIlIIIlIIIIIIIIlIlI)) {
            this.nextFreePoint = lllllllllllllIIlIIIlIIIIIIIIlIlI.next;
            lllllllllllllIIlIIIlIIIIIIIIlIlI.next = null;
            lllllllllllllIIlIIIlIIIIIIIIlIlI.prev = null;
            lllllllllllllIIlIIIlIIIIIIIIlIlI.pt = lllllllllllllIIlIIIlIIIIIIIIlIII;
            return lllllllllllllIIlIIIlIIIIIIIIlIlI;
        }
        return new Point(lllllllllllllIIlIIIlIIIIIIIIlIII);
    }
    
    public float[] getTrianglePoint(final int lllllllllllllIIlIIIIlllllllIIlIl, final int lllllllllllllIIlIIIIlllllllIIlII) {
        final Vector2f lllllllllllllIIlIIIIlllllllIIlll = this.triangles.get(lllllllllllllIIlIIIIlllllllIIlIl * MannTriangulator.lIlIIIIIlIlIIl[1] + lllllllllllllIIlIIIIlllllllIIlII);
        final float[] array = new float[MannTriangulator.lIlIIIIIlIlIIl[0]];
        array[MannTriangulator.lIlIIIIIlIlIIl[3]] = lllllllllllllIIlIIIIlllllllIIlll.x;
        array[MannTriangulator.lIlIIIIIlIlIIl[2]] = lllllllllllllIIlIIIIlllllllIIlll.y;
        return array;
    }
    
    private static int lllIIIIIlIIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void lllIIIIIlIIIlII() {
        (lIlIIIIIlIlIIl = new int[4])[0] = "  ".length();
        MannTriangulator.lIlIIIIIlIlIIl[1] = "   ".length();
        MannTriangulator.lIlIIIIIlIlIIl[2] = " ".length();
        MannTriangulator.lIlIIIIIlIlIIl[3] = ((0xC7 ^ 0x81 ^ (0xD9 ^ 0xC4)) & (0x53 ^ 0xE ^ (0x4D ^ 0x4B) ^ -" ".length()));
    }
    
    private void freePoints(final Point lllllllllllllIIlIIIIllllllllllIl) {
        lllllllllllllIIlIIIIllllllllllIl.prev.next = this.nextFreePoint;
        lllllllllllllIIlIIIIllllllllllIl.prev = null;
        this.nextFreePoint = lllllllllllllIIlIIIIllllllllllIl;
    }
    
    private static boolean lllIIIIIlIIlIIl(final int lllllllllllllIIlIIIIllllllIIIlll) {
        return lllllllllllllIIlIIIIllllllIIIlll <= 0;
    }
    
    private static boolean lllIIIIIlIIIlIl(final Object lllllllllllllIIlIIIIllllllIlIIll) {
        return lllllllllllllIIlIIIIllllllIlIIll != null;
    }
    
    public MannTriangulator() {
        this.triangles = new ArrayList();
        this.contour = this.getPointBag();
    }
    
    private static boolean lllIIIIIlIIllIl(final int lllllllllllllIIlIIIIllllllIllIlI, final int lllllllllllllIIlIIIIllllllIllIIl) {
        return lllllllllllllIIlIIIIllllllIllIlI < lllllllllllllIIlIIIIllllllIllIIl;
    }
    
    public void startHole() {
        final PointBag lllllllllllllIIlIIIlIIIIIlIIlIll = this.getPointBag();
        lllllllllllllIIlIIIlIIIIIlIIlIll.next = this.holes;
        this.holes = lllllllllllllIIlIIIlIIIIIlIIlIll;
    }
    
    private static boolean lllIIIIIlIIlllI(final int lllllllllllllIIlIIIIllllllIIIlIl) {
        return lllllllllllllIIlIIIIllllllIIIlIl > 0;
    }
    
    protected class PointBag implements Serializable
    {
        private static final /* synthetic */ int[] lIlIllIIIllIlI;
        protected /* synthetic */ Point first;
        protected /* synthetic */ PointBag next;
        
        public boolean doesIntersectSegment(final Vector2f lllllllllllllIIIIlllIlIIllIlllIl, final Vector2f lllllllllllllIIIIlllIlIIlllIIIIl) {
            final double lllllllllllllIIIIlllIlIIlllIIIII = lllllllllllllIIIIlllIlIIlllIIIIl.x - lllllllllllllIIIIlllIlIIllIlllIl.x;
            final double lllllllllllllIIIIlllIlIIllIlllll = lllllllllllllIIIIlllIlIIlllIIIIl.y - lllllllllllllIIIIlllIlIIllIlllIl.y;
            Point lllllllllllllIIIIlllIlIIlllIIlII = this.first;
            do {
                final Point lllllllllllllIIIIlllIlIIlllIIlIl = lllllllllllllIIIIlllIlIIlllIIlII.next;
                if (llllIIIIlIIIlll(lllllllllllllIIIIlllIlIIlllIIlII.pt, lllllllllllllIIIIlllIlIIllIlllIl) && llllIIIIlIIIlll(lllllllllllllIIIIlllIlIIlllIIlIl.pt, lllllllllllllIIIIlllIlIIllIlllIl) && llllIIIIlIIIlll(lllllllllllllIIIIlllIlIIlllIIlII.pt, lllllllllllllIIIIlllIlIIlllIIIIl) && llllIIIIlIIIlll(lllllllllllllIIIIlllIlIIlllIIlIl.pt, lllllllllllllIIIIlllIlIIlllIIIIl)) {
                    final double lllllllllllllIIIIlllIlIIlllIlIII = lllllllllllllIIIIlllIlIIlllIIlIl.pt.x - lllllllllllllIIIIlllIlIIlllIIlII.pt.x;
                    final double lllllllllllllIIIIlllIlIIlllIIlll = lllllllllllllIIIIlllIlIIlllIIlIl.pt.y - lllllllllllllIIIIlllIlIIlllIIlII.pt.y;
                    final double lllllllllllllIIIIlllIlIIlllIIllI = lllllllllllllIIIIlllIlIIlllIIIII * lllllllllllllIIIIlllIlIIlllIIlll - lllllllllllllIIIIlllIlIIllIlllll * lllllllllllllIIIIlllIlIIlllIlIII;
                    if (llllIIIIlIIlIII(llllIIIIlIIIlIl(Math.abs(lllllllllllllIIIIlllIlIIlllIIllI), 1.0E-5))) {
                        final double lllllllllllllIIIIlllIlIIlllIllII = lllllllllllllIIIIlllIlIIlllIIlII.pt.x - lllllllllllllIIIIlllIlIIllIlllIl.x;
                        final double lllllllllllllIIIIlllIlIIlllIlIll = lllllllllllllIIIIlllIlIIlllIIlII.pt.y - lllllllllllllIIIIlllIlIIllIlllIl.y;
                        final double lllllllllllllIIIIlllIlIIlllIlIlI = (lllllllllllllIIIIlllIlIIlllIIlll * lllllllllllllIIIIlllIlIIlllIllII - lllllllllllllIIIIlllIlIIlllIlIII * lllllllllllllIIIIlllIlIIlllIlIll) / lllllllllllllIIIIlllIlIIlllIIllI;
                        final double lllllllllllllIIIIlllIlIIlllIlIIl = (lllllllllllllIIIIlllIlIIllIlllll * lllllllllllllIIIIlllIlIIlllIllII - lllllllllllllIIIIlllIlIIlllIIIII * lllllllllllllIIIIlllIlIIlllIlIll) / lllllllllllllIIIIlllIlIIlllIIllI;
                        if (llllIIIIlIIlIIl(llllIIIIlIIIlIl(lllllllllllllIIIIlllIlIIlllIlIlI, 0.0)) && llllIIIIlIIlIlI(llllIIIIlIIIllI(lllllllllllllIIIIlllIlIIlllIlIlI, 1.0)) && llllIIIIlIIlIIl(llllIIIIlIIIlIl(lllllllllllllIIIIlllIlIIlllIlIIl, 0.0)) && llllIIIIlIIlIlI(llllIIIIlIIIllI(lllllllllllllIIIIlllIlIIlllIlIIl, 1.0))) {
                            return PointBag.lIlIllIIIllIlI[0] != 0;
                        }
                    }
                }
                if (llllIIIIlIIIlII(lllllllllllllIIIIlllIlIIlllIIlIl, this.first)) {
                    return PointBag.lIlIllIIIllIlI[1] != 0;
                }
                lllllllllllllIIIIlllIlIIlllIIlII = lllllllllllllIIIIlllIlIIlllIIlIl;
                "".length();
            } while (((16 + 140 - 81 + 71 ^ 72 + 138 - 151 + 81) & (0x9E ^ 0xA4 ^ (0xA ^ 0x2E) ^ -" ".length())) == 0x0);
            return ((142 + 82 - 182 + 185 ^ 121 + 4 - 112 + 159) & (0x6C ^ 0x3D ^ (0x4E ^ 0x50) ^ -" ".length())) != 0x0;
        }
        
        private static boolean llllIIIIlIIlIII(final int lllllllllllllIIIIlllIlIIlIlIlllI) {
            return lllllllllllllIIIIlllIlIIlIlIlllI > 0;
        }
        
        private static int llllIIIIlIIIllI(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        public int countPoints() {
            if (llllIIIIlIIIIll(this.first)) {
                return PointBag.lIlIllIIIllIlI[1];
            }
            int lllllllllllllIIIIlllIlIIllIIllII = PointBag.lIlIllIIIllIlI[1];
            Point lllllllllllllIIIIlllIlIIllIIlIll = this.first;
            do {
                ++lllllllllllllIIIIlllIlIIllIIllII;
            } while (!llllIIIIlIIIlII(lllllllllllllIIIIlllIlIIllIIlIll = lllllllllllllIIIIlllIlIIllIIlIll.next, this.first));
            return lllllllllllllIIIIlllIlIIllIIllII;
        }
        
        static {
            llllIIIIlIIIIIl();
        }
        
        private static boolean llllIIIIlIIlIIl(final int lllllllllllllIIIIlllIlIIlIllIIlI) {
            return lllllllllllllIIIIlllIlIIlIllIIlI >= 0;
        }
        
        private static boolean llllIIIIlIIIlll(final Object lllllllllllllIIIIlllIlIIlIllllll, final Object lllllllllllllIIIIlllIlIIlIlllllI) {
            return lllllllllllllIIIIlllIlIIlIllllll != lllllllllllllIIIIlllIlIIlIlllllI;
        }
        
        private static boolean llllIIIIlIIlIll(final int lllllllllllllIIIIlllIlIIlIllIlII) {
            return lllllllllllllIIIIlllIlIIlIllIlII != 0;
        }
        
        private static boolean llllIIIIlIIlIlI(final int lllllllllllllIIIIlllIlIIlIllIIII) {
            return lllllllllllllIIIIlllIlIIlIllIIII <= 0;
        }
        
        private static int llllIIIIlIIIlIl(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        public void clear() {
            if (llllIIIIlIIIIlI(this.first)) {
                MannTriangulator.this.freePoints(this.first);
                this.first = null;
            }
        }
        
        public boolean contains(final Vector2f lllllllllllllIIIIlllIlIIllIIIlII) {
            if (llllIIIIlIIIIll(this.first)) {
                return PointBag.lIlIllIIIllIlI[1] != 0;
            }
            if (llllIIIIlIIlIll(this.first.prev.pt.equals(lllllllllllllIIIIlllIlIIllIIIlII) ? 1 : 0)) {
                return PointBag.lIlIllIIIllIlI[0] != 0;
            }
            if (llllIIIIlIIlIll(this.first.pt.equals(lllllllllllllIIIIlllIlIIllIIIlII) ? 1 : 0)) {
                return PointBag.lIlIllIIIllIlI[0] != 0;
            }
            return PointBag.lIlIllIIIllIlI[1] != 0;
        }
        
        public void add(final Point lllllllllllllIIIIlllIlIlIIIIIIll) {
            if (llllIIIIlIIIIlI(this.first)) {
                this.first.insertBefore(lllllllllllllIIIIlllIlIlIIIIIIll);
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else {
                this.first = lllllllllllllIIIIlllIlIlIIIIIIll;
                lllllllllllllIIIIlllIlIlIIIIIIll.next = lllllllllllllIIIIlllIlIlIIIIIIll;
                lllllllllllllIIIIlllIlIlIIIIIIll.prev = lllllllllllllIIIIlllIlIlIIIIIIll;
            }
        }
        
        private static void llllIIIIlIIIIIl() {
            (lIlIllIIIllIlI = new int[2])[0] = " ".length();
            PointBag.lIlIllIIIllIlI[1] = ((0x3B ^ 0xD) & ~(0x44 ^ 0x72));
        }
        
        private static boolean llllIIIIlIIIlII(final Object lllllllllllllIIIIlllIlIIlIlllIIl, final Object lllllllllllllIIIIlllIlIIlIlllIII) {
            return lllllllllllllIIIIlllIlIIlIlllIIl == lllllllllllllIIIIlllIlIIlIlllIII;
        }
        
        private static boolean llllIIIIlIIIIll(final Object lllllllllllllIIIIlllIlIIlIllIllI) {
            return lllllllllllllIIIIlllIlIIlIllIllI == null;
        }
        
        private static boolean llllIIIIlIIIIlI(final Object lllllllllllllIIIIlllIlIIlIllllII) {
            return lllllllllllllIIIIlllIlIIlIllllII != null;
        }
        
        public void computeAngles() {
            if (llllIIIIlIIIIll(this.first)) {
                return;
            }
            Point lllllllllllllIIIIlllIlIIllllllIl = this.first;
            do {
                lllllllllllllIIIIlllIlIIllllllIl.computeAngle();
            } while (!llllIIIIlIIIlII(lllllllllllllIIIIlllIlIIllllllIl = lllllllllllllIIIIlllIlIIllllllIl.next, this.first));
        }
    }
    
    private static class Point implements Serializable
    {
        protected /* synthetic */ Point next;
        private static final /* synthetic */ int[] lIlIIlIllllIll;
        protected /* synthetic */ Vector2f pt;
        protected /* synthetic */ double ny;
        protected /* synthetic */ double nx;
        protected /* synthetic */ double angle;
        protected /* synthetic */ Point prev;
        
        private static int lllIIlllIIIIlII(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        public void insertBefore(final Point lllllllllllllIIIllIlIlIIlllIlllI) {
            this.prev.next = lllllllllllllIIIllIlIlIIlllIlllI;
            lllllllllllllIIIllIlIlIIlllIlllI.prev = this.prev;
            lllllllllllllIIIllIlIlIIlllIlllI.next = this;
            this.prev = lllllllllllllIIIllIlIlIIlllIlllI;
        }
        
        public boolean isInfront(final Point lllllllllllllIIIllIlIlIIlIlIIIIl) {
            return this.isInfront(lllllllllllllIIIllIlIlIIlIlIIIIl.pt.x - this.pt.x, lllllllllllllIIIllIlIlIIlIlIIIIl.pt.y - this.pt.y);
        }
        
        public void insertAfter(final Point lllllllllllllIIIllIlIlIIlllIlIII) {
            this.next.prev = lllllllllllllIIIllIlIlIIlllIlIII;
            lllllllllllllIIIllIlIlIIlllIlIII.prev = this;
            lllllllllllllIIIllIlIlIIlllIlIII.next = this.next;
            this.next = lllllllllllllIIIllIlIlIIlllIlIII;
        }
        
        public boolean isConcave() {
            int n;
            if (lllIIlllIIIIIlI(lllIIlllIIIIlII(this.angle, 0.0))) {
                n = Point.lIlIIlIllllIll[0];
                "".length();
                if ("  ".length() <= ((0x77 ^ 0x69) & ~(0xDF ^ 0xC1))) {
                    return ((0x9E ^ 0x81) & ~(0x6F ^ 0x70)) != 0x0;
                }
            }
            else {
                n = Point.lIlIIlIllllIll[1];
            }
            return n != 0;
        }
        
        private static boolean lllIIlllIIIIlll(final int lllllllllllllIIIllIlIlIIlIIllIll) {
            return lllllllllllllIIIllIlIlIIlIIllIll >= 0;
        }
        
        private static boolean lllIIlllIIIIIIl(final int lllllllllllllIIIllIlIlIIlIIlllIl) {
            return lllllllllllllIIIllIlIlIIlIIlllIl != 0;
        }
        
        private static boolean lllIIlllIIIIIll(final int lllllllllllllIIIllIlIlIIlIIlIlll) {
            return lllllllllllllIIIllIlIlIIlIIlIlll > 0;
        }
        
        private static int lllIIlllIIIIIII(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        public boolean isInfront(final double lllllllllllllIIIllIlIlIIlIlIllIl, final double lllllllllllllIIIllIlIlIIlIlIIlll) {
            int n;
            if (lllIIlllIIIIlll(lllIIlllIIIIlIl((this.prev.pt.y - this.pt.y) * lllllllllllllIIIllIlIlIIlIlIllIl + (this.pt.x - this.prev.pt.x) * lllllllllllllIIIllIlIlIIlIlIIlll, 0.0))) {
                n = Point.lIlIIlIllllIll[0];
                "".length();
                if ((0xA5 ^ 0xA1) == 0x0) {
                    return ((0xDA ^ 0x9D) & ~(0x57 ^ 0x10)) != 0x0;
                }
            }
            else {
                n = Point.lIlIIlIllllIll[1];
            }
            final boolean lllllllllllllIIIllIlIlIIlIlIlIll = n != 0;
            int n2;
            if (lllIIlllIIIIlll(lllIIlllIIIIlIl((this.pt.y - this.next.pt.y) * lllllllllllllIIIllIlIlIIlIlIllIl + (this.next.pt.x - this.pt.x) * lllllllllllllIIIllIlIlIIlIlIIlll, 0.0))) {
                n2 = Point.lIlIIlIllllIll[0];
                "".length();
                if (((0x36 ^ 0x6) & ~(0x52 ^ 0x62)) != 0x0) {
                    return ((0x88 ^ 0x9B) & ~(0x2F ^ 0x3C)) != 0x0;
                }
            }
            else {
                n2 = Point.lIlIIlIllllIll[1];
            }
            final boolean lllllllllllllIIIllIlIlIIlIlIlIlI = n2 != 0;
            boolean b;
            if (lllIIlllIIIIIlI(lllIIlllIIIIllI(this.angle, 0.0))) {
                b = (lllllllllllllIIIllIlIlIIlIlIlIll | lllllllllllllIIIllIlIlIIlIlIlIlI);
                "".length();
                if (((0x0 ^ 0x30) & ~(0x97 ^ 0xA7)) != 0x0) {
                    return ((0x49 ^ 0x5D) & ~(0x9D ^ 0x89)) != 0x0;
                }
            }
            else {
                b = (lllllllllllllIIIllIlIlIIlIlIlIll & lllllllllllllIIIllIlIlIIlIlIlIlI);
            }
            return b;
        }
        
        private static boolean lllIIlllIIIIIlI(final int lllllllllllllIIIllIlIlIIlIIllIIl) {
            return lllllllllllllIIIllIlIlIIlIIllIIl < 0;
        }
        
        private static void lllIIllIllllllI() {
            (lIlIIlIllllIll = new int[2])[0] = " ".length();
            Point.lIlIIlIllllIll[1] = ((190 + 1 - 35 + 35 ^ 42 + 139 - 137 + 120) & (0xB2 ^ 0x98 ^ (0x94 ^ 0xA5) ^ -" ".length()));
        }
        
        public void unlink() {
            this.prev.next = this.next;
            this.next.prev = this.prev;
            this.next = null;
            this.prev = null;
        }
        
        private static int lllIIlllIIIIlIl(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        private static int lllIIllIlllllll(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        private double hypot(final double lllllllllllllIIIllIlIlIIlllIIIlI, final double lllllllllllllIIIllIlIlIIlllIIIIl) {
            return Math.sqrt(lllllllllllllIIIllIlIlIIlllIIIlI * lllllllllllllIIIllIlIlIIlllIIIlI + lllllllllllllIIIllIlIlIIlllIIIIl * lllllllllllllIIIllIlIlIIlllIIIIl);
        }
        
        static {
            lllIIllIllllllI();
        }
        
        private static int lllIIlllIIIIllI(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        public Point(final Vector2f lllllllllllllIIIllIlIlIIllllIlll) {
            this.pt = lllllllllllllIIIllIlIlIIllllIlll;
        }
        
        public void computeAngle() {
            if (lllIIlllIIIIIIl(this.prev.pt.equals(this.pt) ? 1 : 0)) {
                final Vector2f pt = this.pt;
                pt.x += 0.01f;
            }
            double lllllllllllllIIIllIlIlIIllIlIllI = this.pt.x - this.prev.pt.x;
            double lllllllllllllIIIllIlIlIIllIlIlIl = this.pt.y - this.prev.pt.y;
            final double lllllllllllllIIIllIlIlIIllIlIlII = this.hypot(lllllllllllllIIIllIlIlIIllIlIllI, lllllllllllllIIIllIlIlIIllIlIlIl);
            lllllllllllllIIIllIlIlIIllIlIllI /= lllllllllllllIIIllIlIlIIllIlIlII;
            lllllllllllllIIIllIlIlIIllIlIlIl /= lllllllllllllIIIllIlIlIIllIlIlII;
            if (lllIIlllIIIIIIl(this.next.pt.equals(this.pt) ? 1 : 0)) {
                final Vector2f pt2 = this.pt;
                pt2.y += 0.01f;
            }
            double lllllllllllllIIIllIlIlIIllIlIIll = this.next.pt.x - this.pt.x;
            double lllllllllllllIIIllIlIlIIllIlIIlI = this.next.pt.y - this.pt.y;
            final double lllllllllllllIIIllIlIlIIllIlIIIl = this.hypot(lllllllllllllIIIllIlIlIIllIlIIll, lllllllllllllIIIllIlIlIIllIlIIlI);
            lllllllllllllIIIllIlIlIIllIlIIll /= lllllllllllllIIIllIlIlIIllIlIIIl;
            lllllllllllllIIIllIlIlIIllIlIIlI /= lllllllllllllIIIllIlIlIIllIlIIIl;
            final double lllllllllllllIIIllIlIlIIllIlIIII = -lllllllllllllIIIllIlIlIIllIlIlIl;
            final double lllllllllllllIIIllIlIlIIllIIllll = lllllllllllllIIIllIlIlIIllIlIllI;
            this.nx = (lllllllllllllIIIllIlIlIIllIlIIII - lllllllllllllIIIllIlIlIIllIlIIlI) * 0.5;
            this.ny = (lllllllllllllIIIllIlIlIIllIIllll + lllllllllllllIIIllIlIlIIllIlIIll) * 0.5;
            if (lllIIlllIIIIIlI(lllIIllIlllllll(this.nx * this.nx + this.ny * this.ny, 1.0E-5))) {
                this.nx = lllllllllllllIIIllIlIlIIllIlIllI;
                this.ny = lllllllllllllIIIllIlIlIIllIlIIlI;
                this.angle = 1.0;
                if (lllIIlllIIIIIll(lllIIlllIIIIIII(lllllllllllllIIIllIlIlIIllIlIllI * lllllllllllllIIIllIlIlIIllIlIIll + lllllllllllllIIIllIlIlIIllIlIlIl * lllllllllllllIIIllIlIlIIllIlIIlI, 0.0))) {
                    this.nx = -lllllllllllllIIIllIlIlIIllIlIllI;
                    this.ny = -lllllllllllllIIIllIlIlIIllIlIlIl;
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                }
            }
            else {
                this.angle = this.nx * lllllllllllllIIIllIlIlIIllIlIIll + this.ny * lllllllllllllIIIllIlIlIIllIlIIlI;
            }
        }
        
        public double getAngle(final Point lllllllllllllIIIllIlIlIIlIllllll) {
            final double lllllllllllllIIIllIlIlIIlIlllllI = lllllllllllllIIIllIlIlIIlIllllll.pt.x - this.pt.x;
            final double lllllllllllllIIIllIlIlIIlIllllIl = lllllllllllllIIIllIlIlIIlIllllll.pt.y - this.pt.y;
            final double lllllllllllllIIIllIlIlIIlIllllII = this.hypot(lllllllllllllIIIllIlIlIIlIlllllI, lllllllllllllIIIllIlIlIIlIllllIl);
            return (this.nx * lllllllllllllIIIllIlIlIIlIlllllI + this.ny * lllllllllllllIIIllIlIlIIlIllllIl) / lllllllllllllIIIllIlIlIIlIllllII;
        }
    }
}
