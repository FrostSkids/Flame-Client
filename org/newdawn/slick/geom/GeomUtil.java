// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.util.ArrayList;

public class GeomUtil
{
    public /* synthetic */ float EPSILON;
    private static final /* synthetic */ int[] lIlllIIlIlIIIl;
    public /* synthetic */ float EDGE_SCALE;
    public /* synthetic */ int MAX_POINTS;
    public /* synthetic */ GeomUtilListener listener;
    
    public Line getLine(final Shape llllllllllllIlllllIlIIIIIllIlllI, final float llllllllllllIlllllIlIIIIIllIllIl, final float llllllllllllIlllllIlIIIIIllIllII, final int llllllllllllIlllllIlIIIIIllIIlIl) {
        final float[] llllllllllllIlllllIlIIIIIllIlIlI = llllllllllllIlllllIlIIIIIllIlllI.getPoint(llllllllllllIlllllIlIIIIIllIIlIl);
        final Line llllllllllllIlllllIlIIIIIllIlIIl = new Line(llllllllllllIlllllIlIIIIIllIllIl, llllllllllllIlllllIlIIIIIllIllII, llllllllllllIlllllIlIIIIIllIlIlI[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIIIllIlIlI[GeomUtil.lIlllIIlIlIIIl[2]]);
        return llllllllllllIlllllIlIIIIIllIlIIl;
    }
    
    public static int rationalPoint(final Shape llllllllllllIlllllIlIIIIlIIIllII, int llllllllllllIlllllIlIIIIlIIIlIIl) {
        while (lIIIIIIlllIIllIl(llllllllllllIlllllIlIIIIlIIIlIIl)) {
            llllllllllllIlllllIlIIIIlIIIlIIl += llllllllllllIlllllIlIIIIlIIIllII.getPointCount();
            "".length();
            if (((0x53 ^ 0x18) & ~(0x5B ^ 0x10)) != ((0x8E ^ 0x89) & ~(0x31 ^ 0x36))) {
                return (0x74 ^ 0x25) & ~(0xA ^ 0x5B);
            }
        }
        while (lIIIIIIlllIlIlIl(llllllllllllIlllllIlIIIIlIIIlIIl, llllllllllllIlllllIlIIIIlIIIllII.getPointCount())) {
            llllllllllllIlllllIlIIIIlIIIlIIl -= llllllllllllIlllllIlIIIIlIIIllII.getPointCount();
            "".length();
            if (((0xC0 ^ 0x8E) & ~(0xD ^ 0x43)) == " ".length()) {
                return (0x45 ^ 0x7C) & ~(0xB8 ^ 0x81);
            }
        }
        return llllllllllllIlllllIlIIIIlIIIlIIl;
    }
    
    private Shape[] combine(final Shape llllllllllllIlllllIlIIIIlllllllI, final Shape llllllllllllIlllllIlIIIIllllllIl, final boolean llllllllllllIlllllIlIIIIlllllIII) {
        if (lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIIlllllIII ? 1 : 0)) {
            final ArrayList llllllllllllIlllllIlIIIlIIIIIIll = new ArrayList();
            final ArrayList llllllllllllIlllllIlIIIlIIIIIIlI = new ArrayList();
            int llllllllllllIlllllIlIIIlIIIIlIll = GeomUtil.lIlllIIlIlIIIl[1];
            while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIIIIlIll, llllllllllllIlllllIlIIIIlllllllI.getPointCount())) {
                final float[] llllllllllllIlllllIlIIIlIIIIllII = llllllllllllIlllllIlIIIIlllllllI.getPoint(llllllllllllIlllllIlIIIlIIIIlIll);
                if (lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIIllllllIl.contains(llllllllllllIlllllIlIIIlIIIIllII[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIlIIIIllII[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0)) {
                    llllllllllllIlllllIlIIIlIIIIIIlI.add(new Vector2f(llllllllllllIlllllIlIIIlIIIIllII[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIlIIIIllII[GeomUtil.lIlllIIlIlIIIl[2]]));
                    "".length();
                    if (lIIIIIIlllIIlllI(this.listener)) {
                        this.listener.pointExcluded(llllllllllllIlllllIlIIIlIIIIllII[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIlIIIIllII[GeomUtil.lIlllIIlIlIIIl[2]]);
                    }
                }
                ++llllllllllllIlllllIlIIIlIIIIlIll;
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            int llllllllllllIlllllIlIIIlIIIIIlII = GeomUtil.lIlllIIlIlIIIl[1];
            while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIIIIIlII, llllllllllllIlllllIlIIIIlllllllI.getPointCount())) {
                final float[] llllllllllllIlllllIlIIIlIIIIIllI = llllllllllllIlllllIlIIIIlllllllI.getPoint(llllllllllllIlllllIlIIIlIIIIIlII);
                final Vector2f llllllllllllIlllllIlIIIlIIIIIlIl = new Vector2f(llllllllllllIlllllIlIIIlIIIIIllI[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIlIIIIIllI[GeomUtil.lIlllIIlIlIIIl[2]]);
                if (lIIIIIIlllIIlIll(llllllllllllIlllllIlIIIlIIIIIIlI.contains(llllllllllllIlllllIlIIIlIIIIIlIl) ? 1 : 0)) {
                    final Shape llllllllllllIlllllIlIIIlIIIIIlll = this.combineSingle(llllllllllllIlllllIlIIIIlllllllI, llllllllllllIlllllIlIIIIllllllIl, (boolean)(GeomUtil.lIlllIIlIlIIIl[2] != 0), llllllllllllIlllllIlIIIlIIIIIlII);
                    llllllllllllIlllllIlIIIlIIIIIIll.add(llllllllllllIlllllIlIIIlIIIIIlll);
                    "".length();
                    int llllllllllllIlllllIlIIIlIIIIlIII = GeomUtil.lIlllIIlIlIIIl[1];
                    while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIIIIlIII, llllllllllllIlllllIlIIIlIIIIIlll.getPointCount())) {
                        final float[] llllllllllllIlllllIlIIIlIIIIlIlI = llllllllllllIlllllIlIIIlIIIIIlll.getPoint(llllllllllllIlllllIlIIIlIIIIlIII);
                        final Vector2f llllllllllllIlllllIlIIIlIIIIlIIl = new Vector2f(llllllllllllIlllllIlIIIlIIIIlIlI[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIlIIIIlIlI[GeomUtil.lIlllIIlIlIIIl[2]]);
                        llllllllllllIlllllIlIIIlIIIIIIlI.add(llllllllllllIlllllIlIIIlIIIIlIIl);
                        "".length();
                        ++llllllllllllIlllllIlIIIlIIIIlIII;
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return null;
                        }
                    }
                }
                ++llllllllllllIlllllIlIIIlIIIIIlII;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return llllllllllllIlllllIlIIIlIIIIIIll.toArray(new Shape[GeomUtil.lIlllIIlIlIIIl[1]]);
        }
        int llllllllllllIlllllIlIIIlIIIIIIII = GeomUtil.lIlllIIlIlIIIl[1];
        while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIIIIIIII, llllllllllllIlllllIlIIIIlllllllI.getPointCount())) {
            if (lIIIIIIlllIIlIll(llllllllllllIlllllIlIIIIllllllIl.contains(llllllllllllIlllllIlIIIIlllllllI.getPoint(llllllllllllIlllllIlIIIlIIIIIIII)[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIIlllllllI.getPoint(llllllllllllIlllllIlIIIlIIIIIIII)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0) && lIIIIIIlllIIlIll(llllllllllllIlllllIlIIIIllllllIl.hasVertex(llllllllllllIlllllIlIIIIlllllllI.getPoint(llllllllllllIlllllIlIIIlIIIIIIII)[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIIlllllllI.getPoint(llllllllllllIlllllIlIIIlIIIIIIII)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0)) {
                final Shape llllllllllllIlllllIlIIIlIIIIIIIl = this.combineSingle(llllllllllllIlllllIlIIIIlllllllI, llllllllllllIlllllIlIIIIllllllIl, (boolean)(GeomUtil.lIlllIIlIlIIIl[1] != 0), llllllllllllIlllllIlIIIlIIIIIIII);
                final Shape[] array = new Shape[GeomUtil.lIlllIIlIlIIIl[2]];
                array[GeomUtil.lIlllIIlIlIIIl[1]] = llllllllllllIlllllIlIIIlIIIIIIIl;
                return array;
            }
            ++llllllllllllIlllllIlIIIlIIIIIIII;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        final Shape[] array2 = new Shape[GeomUtil.lIlllIIlIlIIIl[2]];
        array2[GeomUtil.lIlllIIlIlIIIl[1]] = llllllllllllIlllllIlIIIIllllllIl;
        return array2;
    }
    
    public Line getLine(final Shape llllllllllllIlllllIlIIIIIllllIll, final int llllllllllllIlllllIlIIIIIllllIlI, final int llllllllllllIlllllIlIIIIIllllIIl) {
        final float[] llllllllllllIlllllIlIIIIIllllllI = llllllllllllIlllllIlIIIIIllllIll.getPoint(llllllllllllIlllllIlIIIIIllllIlI);
        final float[] llllllllllllIlllllIlIIIIIlllllIl = llllllllllllIlllllIlIIIIIllllIll.getPoint(llllllllllllIlllllIlIIIIIllllIIl);
        final Line llllllllllllIlllllIlIIIIIlllllII = new Line(llllllllllllIlllllIlIIIIIllllllI[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIIIllllllI[GeomUtil.lIlllIIlIlIIIl[2]], llllllllllllIlllllIlIIIIIlllllIl[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIIIlllllIl[GeomUtil.lIlllIIlIlIIIl[2]]);
        return llllllllllllIlllllIlIIIIIlllllII;
    }
    
    private static boolean lIIIIIIlllIlIlII(final int llllllllllllIlllllIlIIIIIlIIIIIl) {
        return llllllllllllIlllllIlIIIIIlIIIIIl > 0;
    }
    
    public void setListener(final GeomUtilListener llllllllllllIlllllIlIIIlIIlIllIl) {
        this.listener = llllllllllllIlllllIlIIIlIIlIllIl;
    }
    
    private static boolean lIIIIIIlllIIlIIl(final int llllllllllllIlllllIlIIIIIlIIIlll) {
        return llllllllllllIlllllIlIIIIIlIIIlll != 0;
    }
    
    public Shape[] subtract(Shape llllllllllllIlllllIlIIIlIlIIllII, Shape llllllllllllIlllllIlIIIlIlIIlIll) {
        llllllllllllIlllllIlIIIlIlIIllII = llllllllllllIlllllIlIIIlIlIIllII.transform(new Transform());
        llllllllllllIlllllIlIIIlIlIIlIll = (Exception)((Shape)llllllllllllIlllllIlIIIlIlIIlIll).transform(new Transform());
        int llllllllllllIlllllIlIIIlIlIIllll = GeomUtil.lIlllIIlIlIIIl[1];
        int llllllllllllIlllllIlIIIlIlIlIlIl = GeomUtil.lIlllIIlIlIIIl[1];
        while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIlIlIlIl, llllllllllllIlllllIlIIIlIlIIllII.getPointCount())) {
            if (lIIIIIIlllIIlIIl(((Shape)llllllllllllIlllllIlIIIlIlIIlIll).contains(llllllllllllIlllllIlIIIlIlIIllII.getPoint(llllllllllllIlllllIlIIIlIlIlIlIl)[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIlIlIIllII.getPoint(llllllllllllIlllllIlIIIlIlIlIlIl)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0)) {
                ++llllllllllllIlllllIlIIIlIlIIllll;
            }
            ++llllllllllllIlllllIlIIIlIlIlIlIl;
            "".length();
            if ((0x1B ^ 0x1C ^ "   ".length()) < (164 + 19 - 46 + 48 ^ 59 + 25 - 19 + 124)) {
                return null;
            }
        }
        if (lIIIIIIlllIIlIlI(llllllllllllIlllllIlIIIlIlIIllll, llllllllllllIlllllIlIIIlIlIIllII.getPointCount())) {
            return new Shape[GeomUtil.lIlllIIlIlIIIl[1]];
        }
        if (lIIIIIIlllIIlIll(llllllllllllIlllllIlIIIlIlIIllII.intersects((Shape)llllllllllllIlllllIlIIIlIlIIlIll) ? 1 : 0)) {
            final Shape[] array = new Shape[GeomUtil.lIlllIIlIlIIIl[2]];
            array[GeomUtil.lIlllIIlIlIIIl[1]] = llllllllllllIlllllIlIIIlIlIIllII;
            return array;
        }
        int llllllllllllIlllllIlIIIlIlIIlllI = GeomUtil.lIlllIIlIlIIIl[1];
        int llllllllllllIlllllIlIIIlIlIlIlII = GeomUtil.lIlllIIlIlIIIl[1];
        while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIlIlIlII, ((Shape)llllllllllllIlllllIlIIIlIlIIlIll).getPointCount())) {
            if (lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIlIlIIllII.contains(((Shape)llllllllllllIlllllIlIIIlIlIIlIll).getPoint(llllllllllllIlllllIlIIIlIlIlIlII)[GeomUtil.lIlllIIlIlIIIl[1]], ((Shape)llllllllllllIlllllIlIIIlIlIIlIll).getPoint(llllllllllllIlllllIlIIIlIlIlIlII)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0) && lIIIIIIlllIIlIll(this.onPath(llllllllllllIlllllIlIIIlIlIIllII, ((Shape)llllllllllllIlllllIlIIIlIlIIlIll).getPoint(llllllllllllIlllllIlIIIlIlIlIlII)[GeomUtil.lIlllIIlIlIIIl[1]], ((Shape)llllllllllllIlllllIlIIIlIlIIlIll).getPoint(llllllllllllIlllllIlIIIlIlIlIlII)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0)) {
                ++llllllllllllIlllllIlIIIlIlIIlllI;
            }
            ++llllllllllllIlllllIlIIIlIlIlIlII;
            "".length();
            if (" ".length() == ("  ".length() ^ (0x88 ^ 0x8E))) {
                return null;
            }
        }
        int llllllllllllIlllllIlIIIlIlIlIIll = GeomUtil.lIlllIIlIlIIIl[1];
        while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIlIlIIll, llllllllllllIlllllIlIIIlIlIIllII.getPointCount())) {
            if (lIIIIIIlllIIlIIl(((Shape)llllllllllllIlllllIlIIIlIlIIlIll).contains(llllllllllllIlllllIlIIIlIlIIllII.getPoint(llllllllllllIlllllIlIIIlIlIlIIll)[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIlIlIIllII.getPoint(llllllllllllIlllllIlIIIlIlIlIIll)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0) && lIIIIIIlllIIlIll(this.onPath((Shape)llllllllllllIlllllIlIIIlIlIIlIll, llllllllllllIlllllIlIIIlIlIIllII.getPoint(llllllllllllIlllllIlIIIlIlIlIIll)[GeomUtil.lIlllIIlIlIIIl[1]], llllllllllllIlllllIlIIIlIlIIllII.getPoint(llllllllllllIlllllIlIIIlIlIlIIll)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0)) {
                ++llllllllllllIlllllIlIIIlIlIIlllI;
            }
            ++llllllllllllIlllllIlIIIlIlIlIIll;
            "".length();
            if (((68 + 98 + 13 + 13 ^ 44 + 66 + 20 + 9) & (0xBA ^ 0xA2 ^ (0xD ^ 0x5E) ^ -" ".length())) == -" ".length()) {
                return null;
            }
        }
        if (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIlIIlllI, GeomUtil.lIlllIIlIlIIIl[2])) {
            final Shape[] array2 = new Shape[GeomUtil.lIlllIIlIlIIIl[2]];
            array2[GeomUtil.lIlllIIlIlIIIl[1]] = llllllllllllIlllllIlIIIlIlIIllII;
            return array2;
        }
        return this.combine(llllllllllllIlllllIlIIIlIlIIllII, (Shape)llllllllllllIlllllIlIIIlIlIIlIll, (boolean)(GeomUtil.lIlllIIlIlIIIl[2] != 0));
    }
    
    private static boolean lIIIIIIlllIIlIlI(final int llllllllllllIlllllIlIIIIIllIIIII, final int llllllllllllIlllllIlIIIIIlIlllll) {
        return llllllllllllIlllllIlIIIIIllIIIII == llllllllllllIlllllIlIIIIIlIlllll;
    }
    
    private static int lIIIIIIlllIIllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public GeomUtil() {
        this.EPSILON = 1.0E-4f;
        this.EDGE_SCALE = 1.0f;
        this.MAX_POINTS = GeomUtil.lIlllIIlIlIIIl[0];
    }
    
    private static boolean lIIIIIIlllIIlIII(final int llllllllllllIlllllIlIIIIIlIllIII, final int llllllllllllIlllllIlIIIIIlIlIlll) {
        return llllllllllllIlllllIlIIIIIlIllIII < llllllllllllIlllllIlIIIIIlIlIlll;
    }
    
    private static boolean lIIIIIIlllIIlIll(final int llllllllllllIlllllIlIIIIIlIIIlIl) {
        return llllllllllllIlllllIlIIIIIlIIIlIl == 0;
    }
    
    public HitResult intersect(final Shape llllllllllllIlllllIlIIIIlIIlllII, final Line llllllllllllIlllllIlIIIIlIIlIllI) {
        float llllllllllllIlllllIlIIIIlIIllIlI = Float.MAX_VALUE;
        HitResult llllllllllllIlllllIlIIIIlIIllIIl = null;
        int llllllllllllIlllllIlIIIIlIIllllI = GeomUtil.lIlllIIlIlIIIl[1];
        while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIIlIIllllI, llllllllllllIlllllIlIIIIlIIlllII.getPointCount())) {
            final int llllllllllllIlllllIlIIIIlIlIIIIl = rationalPoint(llllllllllllIlllllIlIIIIlIIlllII, llllllllllllIlllllIlIIIIlIIllllI + GeomUtil.lIlllIIlIlIIIl[2]);
            final Line llllllllllllIlllllIlIIIIlIlIIIII = this.getLine(llllllllllllIlllllIlIIIIlIIlllII, llllllllllllIlllllIlIIIIlIIllllI, llllllllllllIlllllIlIIIIlIlIIIIl);
            final Vector2f llllllllllllIlllllIlIIIIlIIlllll = llllllllllllIlllllIlIIIIlIIlIllI.intersect(llllllllllllIlllllIlIIIIlIlIIIII, (boolean)(GeomUtil.lIlllIIlIlIIIl[2] != 0));
            if (lIIIIIIlllIIlllI(llllllllllllIlllllIlIIIIlIIlllll)) {
                final float llllllllllllIlllllIlIIIIlIlIIIlI = llllllllllllIlllllIlIIIIlIIlllll.distance(llllllllllllIlllllIlIIIIlIIlIllI.getStart());
                if (lIIIIIIlllIIllIl(lIIIIIIlllIlIIlI(llllllllllllIlllllIlIIIIlIlIIIlI, llllllllllllIlllllIlIIIIlIIllIlI)) && lIIIIIIlllIlIlII(lIIIIIIlllIlIIll(llllllllllllIlllllIlIIIIlIlIIIlI, this.EPSILON))) {
                    llllllllllllIlllllIlIIIIlIIllIIl = new HitResult();
                    llllllllllllIlllllIlIIIIlIIllIIl.pt = llllllllllllIlllllIlIIIIlIIlllll;
                    llllllllllllIlllllIlIIIIlIIllIIl.line = llllllllllllIlllllIlIIIIlIlIIIII;
                    llllllllllllIlllllIlIIIIlIIllIIl.p1 = llllllllllllIlllllIlIIIIlIIllllI;
                    llllllllllllIlllllIlIIIIlIIllIIl.p2 = llllllllllllIlllllIlIIIIlIlIIIIl;
                    llllllllllllIlllllIlIIIIlIIllIlI = llllllllllllIlllllIlIIIIlIlIIIlI;
                }
            }
            ++llllllllllllIlllllIlIIIIlIIllllI;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return llllllllllllIlllllIlIIIIlIIllIIl;
    }
    
    public Shape[] union(Shape llllllllllllIlllllIlIIIlIIIllllI, Shape llllllllllllIlllllIlIIIlIIIlllIl) {
        llllllllllllIlllllIlIIIlIIIllllI = (byte)((Shape)llllllllllllIlllllIlIIIlIIIllllI).transform(new Transform());
        llllllllllllIlllllIlIIIlIIIlllIl = (int)((Shape)llllllllllllIlllllIlIIIlIIIlllIl).transform(new Transform());
        if (lIIIIIIlllIIlIll(((Shape)llllllllllllIlllllIlIIIlIIIllllI).intersects((Shape)llllllllllllIlllllIlIIIlIIIlllIl) ? 1 : 0)) {
            final Shape[] array = new Shape[GeomUtil.lIlllIIlIlIIIl[3]];
            array[GeomUtil.lIlllIIlIlIIIl[1]] = (Shape)llllllllllllIlllllIlIIIlIIIllllI;
            array[GeomUtil.lIlllIIlIlIIIl[2]] = (Shape)llllllllllllIlllllIlIIIlIIIlllIl;
            return array;
        }
        boolean llllllllllllIlllllIlIIIlIIlIIIIl = GeomUtil.lIlllIIlIlIIIl[1] != 0;
        int llllllllllllIlllllIlIIIlIIlIIIII = GeomUtil.lIlllIIlIlIIIl[1];
        int llllllllllllIlllllIlIIIlIIlIIllI = GeomUtil.lIlllIIlIlIIIl[1];
        while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIIlIIllI, ((Shape)llllllllllllIlllllIlIIIlIIIllllI).getPointCount())) {
            if (lIIIIIIlllIIlIIl(((Shape)llllllllllllIlllllIlIIIlIIIlllIl).contains(((Shape)llllllllllllIlllllIlIIIlIIIllllI).getPoint(llllllllllllIlllllIlIIIlIIlIIllI)[GeomUtil.lIlllIIlIlIIIl[1]], ((Shape)llllllllllllIlllllIlIIIlIIIllllI).getPoint(llllllllllllIlllllIlIIIlIIlIIllI)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0) && lIIIIIIlllIIlIll(((Shape)llllllllllllIlllllIlIIIlIIIlllIl).hasVertex(((Shape)llllllllllllIlllllIlIIIlIIIllllI).getPoint(llllllllllllIlllllIlIIIlIIlIIllI)[GeomUtil.lIlllIIlIlIIIl[1]], ((Shape)llllllllllllIlllllIlIIIlIIIllllI).getPoint(llllllllllllIlllllIlIIIlIIlIIllI)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0)) {
                llllllllllllIlllllIlIIIlIIlIIIIl = (GeomUtil.lIlllIIlIlIIIl[2] != 0);
                "".length();
                if ((0x87 ^ 0x83) <= 0) {
                    return null;
                }
                break;
            }
            else {
                if (lIIIIIIlllIIlIIl(((Shape)llllllllllllIlllllIlIIIlIIIlllIl).hasVertex(((Shape)llllllllllllIlllllIlIIIlIIIllllI).getPoint(llllllllllllIlllllIlIIIlIIlIIllI)[GeomUtil.lIlllIIlIlIIIl[1]], ((Shape)llllllllllllIlllllIlIIIlIIIllllI).getPoint(llllllllllllIlllllIlIIIlIIlIIllI)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0)) {
                    ++llllllllllllIlllllIlIIIlIIlIIIII;
                }
                ++llllllllllllIlllllIlIIIlIIlIIllI;
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return null;
                }
                continue;
            }
        }
        int llllllllllllIlllllIlIIIlIIlIIlIl = GeomUtil.lIlllIIlIlIIIl[1];
        while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIIlIIlIl, ((Shape)llllllllllllIlllllIlIIIlIIIlllIl).getPointCount())) {
            if (lIIIIIIlllIIlIIl(((Shape)llllllllllllIlllllIlIIIlIIIllllI).contains(((Shape)llllllllllllIlllllIlIIIlIIIlllIl).getPoint(llllllllllllIlllllIlIIIlIIlIIlIl)[GeomUtil.lIlllIIlIlIIIl[1]], ((Shape)llllllllllllIlllllIlIIIlIIIlllIl).getPoint(llllllllllllIlllllIlIIIlIIlIIlIl)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0) && lIIIIIIlllIIlIll(((Shape)llllllllllllIlllllIlIIIlIIIllllI).hasVertex(((Shape)llllllllllllIlllllIlIIIlIIIlllIl).getPoint(llllllllllllIlllllIlIIIlIIlIIlIl)[GeomUtil.lIlllIIlIlIIIl[1]], ((Shape)llllllllllllIlllllIlIIIlIIIlllIl).getPoint(llllllllllllIlllllIlIIIlIIlIIlIl)[GeomUtil.lIlllIIlIlIIIl[2]]) ? 1 : 0)) {
                llllllllllllIlllllIlIIIlIIlIIIIl = (GeomUtil.lIlllIIlIlIIIl[2] != 0);
                "".length();
                if (null != null) {
                    return null;
                }
                break;
            }
            else {
                ++llllllllllllIlllllIlIIIlIIlIIlIl;
                "".length();
                if ((0x17 ^ 0x75 ^ (0x1C ^ 0x7A)) < 0) {
                    return null;
                }
                continue;
            }
        }
        if (lIIIIIIlllIIlIll(llllllllllllIlllllIlIIIlIIlIIIIl ? 1 : 0) && lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIIlIIIII, GeomUtil.lIlllIIlIlIIIl[3])) {
            final Shape[] array2 = new Shape[GeomUtil.lIlllIIlIlIIIl[3]];
            array2[GeomUtil.lIlllIIlIlIIIl[1]] = (Shape)llllllllllllIlllllIlIIIlIIIllllI;
            array2[GeomUtil.lIlllIIlIlIIIl[2]] = (Shape)llllllllllllIlllllIlIIIlIIIlllIl;
            return array2;
        }
        return this.combine((Shape)llllllllllllIlllllIlIIIlIIIllllI, (Shape)llllllllllllIlllllIlIIIlIIIlllIl, (boolean)(GeomUtil.lIlllIIlIlIIIl[1] != 0));
    }
    
    private static boolean lIIIIIIlllIIlllI(final Object llllllllllllIlllllIlIIIIIlIIllIl) {
        return llllllllllllIlllllIlIIIIIlIIllIl != null;
    }
    
    private static boolean lIIIIIIlllIIllIl(final int llllllllllllIlllllIlIIIIIlIIIIll) {
        return llllllllllllIlllllIlIIIIIlIIIIll < 0;
    }
    
    private static int lIIIIIIlllIlIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private Shape combineSingle(final Shape llllllllllllIlllllIlIIIIllIIIIII, final Shape llllllllllllIlllllIlIIIIlIllllll, final boolean llllllllllllIlllllIlIIIIllIIllII, final int llllllllllllIlllllIlIIIIllIIlIll) {
        Shape llllllllllllIlllllIlIIIIllIIlIlI = llllllllllllIlllllIlIIIIllIIIIII;
        Shape llllllllllllIlllllIlIIIIllIIlIIl = llllllllllllIlllllIlIIIIlIllllll;
        int llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIIlIll;
        int llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[2];
        final Polygon llllllllllllIlllllIlIIIIllIIIllI = new Polygon();
        boolean llllllllllllIlllllIlIIIIllIIIlIl = GeomUtil.lIlllIIlIlIIIl[2] != 0;
        int llllllllllllIlllllIlIIIIllIIIlII = GeomUtil.lIlllIIlIlIIIl[1];
        float llllllllllllIlllllIlIIIIllIIIIll = llllllllllllIlllllIlIIIIllIIlIlI.getPoint(llllllllllllIlllllIlIIIIllIIlIII)[GeomUtil.lIlllIIlIlIIIl[1]];
        float llllllllllllIlllllIlIIIIllIIIIlI = llllllllllllIlllllIlIIIIllIIlIlI.getPoint(llllllllllllIlllllIlIIIIllIIlIII)[GeomUtil.lIlllIIlIlIIIl[2]];
        while (!lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIIllIIIllI.hasVertex(llllllllllllIlllllIlIIIIllIIIIll, llllllllllllIlllllIlIIIIllIIIIlI) ? 1 : 0) || !lIIIIIIlllIIlIll(llllllllllllIlllllIlIIIIllIIIlIl ? 1 : 0) || lIIIIIIlllIIllll(llllllllllllIlllllIlIIIIllIIlIlI, llllllllllllIlllllIlIIIIllIIIIII)) {
            llllllllllllIlllllIlIIIIllIIIlIl = (GeomUtil.lIlllIIlIlIIIl[1] != 0);
            if (lIIIIIIlllIlIIII(++llllllllllllIlllllIlIIIIllIIIlII, this.MAX_POINTS)) {
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
                break;
            }
            else {
                llllllllllllIlllllIlIIIIllIIIllI.addPoint(llllllllllllIlllllIlIIIIllIIIIll, llllllllllllIlllllIlIIIIllIIIIlI);
                if (lIIIIIIlllIIlllI(this.listener)) {
                    this.listener.pointUsed(llllllllllllIlllllIlIIIIllIIIIll, llllllllllllIlllllIlIIIIllIIIIlI);
                }
                final Line llllllllllllIlllllIlIIIIllIlIIIl = this.getLine(llllllllllllIlllllIlIIIIllIIlIlI, llllllllllllIlllllIlIIIIllIIIIll, llllllllllllIlllllIlIIIIllIIIIlI, rationalPoint(llllllllllllIlllllIlIIIIllIIlIlI, llllllllllllIlllllIlIIIIllIIlIII + llllllllllllIlllllIlIIIIllIIIlll));
                final HitResult llllllllllllIlllllIlIIIIllIlIIII = this.intersect(llllllllllllIlllllIlIIIIllIIlIIl, llllllllllllIlllllIlIIIIllIlIIIl);
                if (lIIIIIIlllIIlllI(llllllllllllIlllllIlIIIIllIlIIII)) {
                    final Line llllllllllllIlllllIlIIIIllIlIlIl = llllllllllllIlllllIlIIIIllIlIIII.line;
                    final Vector2f llllllllllllIlllllIlIIIIllIlIlII = llllllllllllIlllllIlIIIIllIlIIII.pt;
                    llllllllllllIlllllIlIIIIllIIIIll = llllllllllllIlllllIlIIIIllIlIlII.x;
                    llllllllllllIlllllIlIIIIllIIIIlI = llllllllllllIlllllIlIIIIllIlIlII.y;
                    if (lIIIIIIlllIIlllI(this.listener)) {
                        this.listener.pointIntersected(llllllllllllIlllllIlIIIIllIIIIll, llllllllllllIlllllIlIIIIllIIIIlI);
                    }
                    if (lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIIllIIlIIl.hasVertex(llllllllllllIlllllIlIIIIllIIIIll, llllllllllllIlllllIlIIIIllIIIIlI) ? 1 : 0)) {
                        llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIIlIIl.indexOf(llllllllllllIlllllIlIIIIllIlIlII.x, llllllllllllIlllllIlIIIIllIlIlII.y);
                        llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[2];
                        llllllllllllIlllllIlIIIIllIIIIll = llllllllllllIlllllIlIIIIllIlIlII.x;
                        llllllllllllIlllllIlIIIIllIIIIlI = llllllllllllIlllllIlIIIIllIlIlII.y;
                        final Shape llllllllllllIlllllIlIIIIllIllIIl = llllllllllllIlllllIlIIIIllIIlIlI;
                        llllllllllllIlllllIlIIIIllIIlIlI = llllllllllllIlllllIlIIIIllIIlIIl;
                        llllllllllllIlllllIlIIIIllIIlIIl = llllllllllllIlllllIlIIIIllIllIIl;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                        continue;
                    }
                    else {
                        float llllllllllllIlllllIlIIIIllIlIIll = llllllllllllIlllllIlIIIIllIlIlIl.getDX() / llllllllllllIlllllIlIIIIllIlIlIl.length();
                        float llllllllllllIlllllIlIIIIllIlIIlI = llllllllllllIlllllIlIIIIllIlIlIl.getDY() / llllllllllllIlllllIlIIIIllIlIlIl.length();
                        llllllllllllIlllllIlIIIIllIlIIll *= this.EDGE_SCALE;
                        llllllllllllIlllllIlIIIIllIlIIlI *= this.EDGE_SCALE;
                        if (lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIIllIIlIlI.contains(llllllllllllIlllllIlIIIIllIlIlII.x + llllllllllllIlllllIlIIIIllIlIIll, llllllllllllIlllllIlIIIIllIlIlII.y + llllllllllllIlllllIlIIIIllIlIIlI) ? 1 : 0)) {
                            if (lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIIllIIllII ? 1 : 0)) {
                                if (lIIIIIIlllIlIIIl(llllllllllllIlllllIlIIIIllIIlIlI, llllllllllllIlllllIlIIIIlIllllll)) {
                                    llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIlIIII.p2;
                                    llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[4];
                                    "".length();
                                    if ("  ".length() > "   ".length()) {
                                        return null;
                                    }
                                }
                                else {
                                    llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIlIIII.p1;
                                    llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[2];
                                    "".length();
                                    if (" ".length() > "  ".length()) {
                                        return null;
                                    }
                                }
                            }
                            else if (lIIIIIIlllIlIIIl(llllllllllllIlllllIlIIIIllIIlIlI, llllllllllllIlllllIlIIIIllIIIIII)) {
                                llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIlIIII.p2;
                                llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[4];
                                "".length();
                                if ((0x13 ^ 0x2E ^ (0x22 ^ 0x1B)) != (6 + 34 + 70 + 58 ^ 123 + 81 - 164 + 132)) {
                                    return null;
                                }
                            }
                            else {
                                llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIlIIII.p2;
                                llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[4];
                            }
                            final Shape llllllllllllIlllllIlIIIIllIllIII = llllllllllllIlllllIlIIIIllIIlIlI;
                            llllllllllllIlllllIlIIIIllIIlIlI = llllllllllllIlllllIlIIIIllIIlIIl;
                            llllllllllllIlllllIlIIIIllIIlIIl = llllllllllllIlllllIlIIIIllIllIII;
                            "".length();
                            if (-(0xD8 ^ 0xA9 ^ (0x65 ^ 0x10)) > 0) {
                                return null;
                            }
                        }
                        else if (lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIIllIIlIlI.contains(llllllllllllIlllllIlIIIIllIlIlII.x - llllllllllllIlllllIlIIIIllIlIIll, llllllllllllIlllllIlIIIIllIlIlII.y - llllllllllllIlllllIlIIIIllIlIIlI) ? 1 : 0)) {
                            if (lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIIllIIllII ? 1 : 0)) {
                                if (lIIIIIIlllIlIIIl(llllllllllllIlllllIlIIIIllIIlIlI, llllllllllllIlllllIlIIIIllIIIIII)) {
                                    llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIlIIII.p2;
                                    llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[4];
                                    "".length();
                                    if (((0x69 ^ 0x71 ^ (0xE2 ^ 0xA4)) & (222 + 134 - 238 + 118 ^ 144 + 160 - 206 + 80 ^ -" ".length())) <= -" ".length()) {
                                        return null;
                                    }
                                }
                                else {
                                    llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIlIIII.p1;
                                    llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[2];
                                    "".length();
                                    if ("   ".length() < "  ".length()) {
                                        return null;
                                    }
                                }
                            }
                            else if (lIIIIIIlllIlIIIl(llllllllllllIlllllIlIIIIllIIlIlI, llllllllllllIlllllIlIIIIlIllllll)) {
                                llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIlIIII.p1;
                                llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[2];
                                "".length();
                                if (((0x1E ^ 0x4C) & ~(0x68 ^ 0x3A)) > 0) {
                                    return null;
                                }
                            }
                            else {
                                llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIlIIII.p1;
                                llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[2];
                            }
                            final Shape llllllllllllIlllllIlIIIIllIlIlll = llllllllllllIlllllIlIIIIllIIlIlI;
                            llllllllllllIlllllIlIIIIllIIlIlI = llllllllllllIlllllIlIIIIllIIlIIl;
                            llllllllllllIlllllIlIIIIllIIlIIl = llllllllllllIlllllIlIIIIllIlIlll;
                            "".length();
                            if (((0x52 ^ 0x3 ^ (0x1F ^ 0x17)) & (0x6B ^ 0x31 ^ "   ".length() ^ -" ".length())) <= -" ".length()) {
                                return null;
                            }
                        }
                        else if (lIIIIIIlllIIlIIl(llllllllllllIlllllIlIIIIllIIllII ? 1 : 0)) {
                            "".length();
                            if (" ".length() < ((0x51 ^ 0x78 ^ (0x33 ^ 0x37)) & (0x53 ^ 0xA ^ (0x9 ^ 0x7D) ^ -" ".length()))) {
                                return null;
                            }
                            break;
                        }
                        else {
                            llllllllllllIlllllIlIIIIllIIlIII = llllllllllllIlllllIlIIIIllIlIIII.p1;
                            llllllllllllIlllllIlIIIIllIIIlll = GeomUtil.lIlllIIlIlIIIl[2];
                            final Shape llllllllllllIlllllIlIIIIllIlIllI = llllllllllllIlllllIlIIIIllIIlIlI;
                            llllllllllllIlllllIlIIIIllIIlIlI = llllllllllllIlllllIlIIIIllIIlIIl;
                            llllllllllllIlllllIlIIIIllIIlIIl = llllllllllllIlllllIlIIIIllIlIllI;
                            llllllllllllIlllllIlIIIIllIIlIII = rationalPoint(llllllllllllIlllllIlIIIIllIIlIlI, llllllllllllIlllllIlIIIIllIIlIII + llllllllllllIlllllIlIIIIllIIIlll);
                            llllllllllllIlllllIlIIIIllIIIIll = llllllllllllIlllllIlIIIIllIIlIlI.getPoint(llllllllllllIlllllIlIIIIllIIlIII)[GeomUtil.lIlllIIlIlIIIl[1]];
                            llllllllllllIlllllIlIIIIllIIIIlI = llllllllllllIlllllIlIIIIllIIlIlI.getPoint(llllllllllllIlllllIlIIIIllIIlIII)[GeomUtil.lIlllIIlIlIIIl[2]];
                        }
                        "".length();
                        if (-(0x16 ^ 0x2A ^ (0x90 ^ 0xA9)) >= 0) {
                            return null;
                        }
                    }
                }
                else {
                    llllllllllllIlllllIlIIIIllIIlIII = rationalPoint(llllllllllllIlllllIlIIIIllIIlIlI, llllllllllllIlllllIlIIIIllIIlIII + llllllllllllIlllllIlIIIIllIIIlll);
                    llllllllllllIlllllIlIIIIllIIIIll = llllllllllllIlllllIlIIIIllIIlIlI.getPoint(llllllllllllIlllllIlIIIIllIIlIII)[GeomUtil.lIlllIIlIlIIIl[1]];
                    llllllllllllIlllllIlIIIIllIIIIlI = llllllllllllIlllllIlIIIIllIIlIlI.getPoint(llllllllllllIlllllIlIIIIllIIlIII)[GeomUtil.lIlllIIlIlIIIl[2]];
                }
                "".length();
                if (null != null) {
                    return null;
                }
                continue;
            }
        }
        llllllllllllIlllllIlIIIIllIIIllI.addPoint(llllllllllllIlllllIlIIIIllIIIIll, llllllllllllIlllllIlIIIIllIIIIlI);
        if (lIIIIIIlllIIlllI(this.listener)) {
            this.listener.pointUsed(llllllllllllIlllllIlIIIIllIIIIll, llllllllllllIlllllIlIIIIllIIIIlI);
        }
        return llllllllllllIlllllIlIIIIllIIIllI;
    }
    
    private static int lIIIIIIlllIlIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIIIIlllIIllll(final Object llllllllllllIlllllIlIIIIIlIlIIII, final Object llllllllllllIlllllIlIIIIIlIIllll) {
        return llllllllllllIlllllIlIIIIIlIlIIII != llllllllllllIlllllIlIIIIIlIIllll;
    }
    
    private static boolean lIIIIIIlllIlIIII(final int llllllllllllIlllllIlIIIIIlIlIlII, final int llllllllllllIlllllIlIIIIIlIlIIll) {
        return llllllllllllIlllllIlIIIIIlIlIlII > llllllllllllIlllllIlIIIIIlIlIIll;
    }
    
    private static boolean lIIIIIIlllIlIlIl(final int llllllllllllIlllllIlIIIIIlIlllII, final int llllllllllllIlllllIlIIIIIlIllIll) {
        return llllllllllllIlllllIlIIIIIlIlllII >= llllllllllllIlllllIlIIIIIlIllIll;
    }
    
    static {
        lIIIIIIlllIIIlll();
    }
    
    private boolean onPath(final Shape llllllllllllIlllllIlIIIlIIlllIII, final float llllllllllllIlllllIlIIIlIIlllIll, final float llllllllllllIlllllIlIIIlIIlllIlI) {
        int llllllllllllIlllllIlIIIlIIlllllI = GeomUtil.lIlllIIlIlIIIl[1];
        while (lIIIIIIlllIIlIII(llllllllllllIlllllIlIIIlIIlllllI, llllllllllllIlllllIlIIIlIIlllIII.getPointCount() + GeomUtil.lIlllIIlIlIIIl[2])) {
            final int llllllllllllIlllllIlIIIlIlIIIIII = rationalPoint(llllllllllllIlllllIlIIIlIIlllIII, llllllllllllIlllllIlIIIlIIlllllI + GeomUtil.lIlllIIlIlIIIl[2]);
            final Line llllllllllllIlllllIlIIIlIIllllll = this.getLine(llllllllllllIlllllIlIIIlIIlllIII, rationalPoint(llllllllllllIlllllIlIIIlIIlllIII, llllllllllllIlllllIlIIIlIIlllllI), llllllllllllIlllllIlIIIlIlIIIIII);
            if (lIIIIIIlllIIllIl(lIIIIIIlllIIllII(llllllllllllIlllllIlIIIlIIllllll.distance(new Vector2f(llllllllllllIlllllIlIIIlIIlllIll, llllllllllllIlllllIlIIIlIIlllIlI)), this.EPSILON * 100.0f))) {
                return GeomUtil.lIlllIIlIlIIIl[2] != 0;
            }
            ++llllllllllllIlllllIlIIIlIIlllllI;
            "".length();
            if ("   ".length() == -" ".length()) {
                return ((0x5D ^ 0x46 ^ (0x5E ^ 0x6F)) & (104 + 29 - 122 + 118 ^ 12 + 133 - 118 + 144 ^ -" ".length())) != 0x0;
            }
        }
        return GeomUtil.lIlllIIlIlIIIl[1] != 0;
    }
    
    private static void lIIIIIIlllIIIlll() {
        (lIlllIIlIlIIIl = new int[5])[0] = (-(0xFFFFFEEE & 0x599F) & (0xFFFFFFBF & 0x7FDD));
        GeomUtil.lIlllIIlIlIIIl[1] = ((0xE ^ 0x3D) & ~(0x9A ^ 0xA9));
        GeomUtil.lIlllIIlIlIIIl[2] = " ".length();
        GeomUtil.lIlllIIlIlIIIl[3] = "  ".length();
        GeomUtil.lIlllIIlIlIIIl[4] = -" ".length();
    }
    
    private static boolean lIIIIIIlllIlIIIl(final Object llllllllllllIlllllIlIIIIIlIIlIlI, final Object llllllllllllIlllllIlIIIIIlIIlIIl) {
        return llllllllllllIlllllIlIIIIIlIIlIlI == llllllllllllIlllllIlIIIIIlIIlIIl;
    }
    
    public class HitResult
    {
        public /* synthetic */ int p2;
        public /* synthetic */ int p1;
        public /* synthetic */ Vector2f pt;
        public /* synthetic */ Line line;
    }
}
