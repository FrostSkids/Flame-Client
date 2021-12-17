// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Collection;
import org.newdawn.slick.util.FastTrig;
import java.util.ArrayList;
import java.util.List;

public class RoundedRectangle extends Rectangle
{
    private /* synthetic */ float cornerRadius;
    private static final /* synthetic */ int[] llIIIlIlllIlII;
    private /* synthetic */ int cornerFlags;
    private static final /* synthetic */ String[] llIIIlIlllIIll;
    private /* synthetic */ int segmentCount;
    
    @Override
    public void setWidth(final float llllllllllllIlllIlIlIlIIIlIIIIlI) {
        if (lIIIlIIlllIIIIlI(lIIIlIIlllIIIlII(llllllllllllIlllIlIlIlIIIlIIIIlI, this.width))) {
            this.width = llllllllllllIlllIlIlIlIIIlIIIIlI;
            this.pointsDirty = (RoundedRectangle.llIIIlIlllIlII[3] != 0);
        }
    }
    
    @Override
    public float getHeight() {
        return this.height;
    }
    
    private static boolean lIIIlIIlllIIIIIl(final int llllllllllllIlllIlIlIIlllllIlIII) {
        return llllllllllllIlllIlIlIIlllllIlIII >= 0;
    }
    
    @Override
    public Shape transform(final Transform llllllllllllIlllIlIlIlIIIIIIIlIl) {
        this.checkPoints();
        final Polygon llllllllllllIlllIlIlIlIIIIIIIlII = new Polygon();
        final float[] llllllllllllIlllIlIlIlIIIIIIIIll = new float[this.points.length];
        llllllllllllIlllIlIlIlIIIIIIIlIl.transform(this.points, RoundedRectangle.llIIIlIlllIlII[2], llllllllllllIlllIlIlIlIIIIIIIIll, RoundedRectangle.llIIIlIlllIlII[2], this.points.length / RoundedRectangle.llIIIlIlllIlII[5]);
        llllllllllllIlllIlIlIlIIIIIIIlII.points = llllllllllllIlllIlIlIlIIIIIIIIll;
        llllllllllllIlllIlIlIlIIIIIIIlII.findCenter();
        return llllllllllllIlllIlIlIlIIIIIIIlII;
    }
    
    @Override
    public void setHeight(final float llllllllllllIlllIlIlIlIIIlIIlIll) {
        if (lIIIlIIlllIIIIlI(lIIIlIIlllIIIIll(this.height, llllllllllllIlllIlIlIlIIIlIIlIll))) {
            this.height = llllllllllllIlllIlIlIlIIIlIIlIll;
            this.pointsDirty = (RoundedRectangle.llIIIlIlllIlII[3] != 0);
        }
    }
    
    @Override
    public float getWidth() {
        return this.width;
    }
    
    private static boolean lIIIlIIlllIIIlll(final int llllllllllllIlllIlIlIIlllllIIIlI) {
        return llllllllllllIlllIlIlIIlllllIIIlI > 0;
    }
    
    static {
        lIIIlIIllIllllIl();
        lIIIlIIllIllllII();
        BOTTOM_LEFT = RoundedRectangle.llIIIlIlllIlII[4];
        DEFAULT_SEGMENT_COUNT = RoundedRectangle.llIIIlIlllIlII[0];
        ALL = RoundedRectangle.llIIIlIlllIlII[1];
        BOTTOM_RIGHT = RoundedRectangle.llIIIlIlllIlII[7];
        TOP_RIGHT = RoundedRectangle.llIIIlIlllIlII[5];
        TOP_LEFT = RoundedRectangle.llIIIlIlllIlII[3];
    }
    
    private static int lIIIlIIlllIIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIlIIllIllllll(final int llllllllllllIlllIlIlIIlllllIIllI) {
        return llllllllllllIlllIlIlIIlllllIIllI < 0;
    }
    
    private static int lIIIlIIllIlllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public RoundedRectangle(final float llllllllllllIlllIlIlIlIIlIIIlllI, final float llllllllllllIlllIlIlIlIIlIIIllIl, final float llllllllllllIlllIlIlIlIIlIIIllII, final float llllllllllllIlllIlIlIlIIlIIIlIll, final float llllllllllllIlllIlIlIlIIlIIIlIlI) {
        this(llllllllllllIlllIlIlIlIIlIIIlllI, llllllllllllIlllIlIlIlIIlIIIllIl, llllllllllllIlllIlIlIlIIlIIIllII, llllllllllllIlllIlIlIlIIlIIIlIll, llllllllllllIlllIlIlIlIIlIIIlIlI, RoundedRectangle.llIIIlIlllIlII[0]);
    }
    
    private static int lIIIlIIlllIIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private List createPoints(final int llllllllllllIlllIlIlIlIIIIIlIllI, final float llllllllllllIlllIlIlIlIIIIIlllIl, final float llllllllllllIlllIlIlIlIIIIIlllII, final float llllllllllllIlllIlIlIlIIIIIllIll, final float llllllllllllIlllIlIlIlIIIIIlIIlI, final float llllllllllllIlllIlIlIlIIIIIllIIl) {
        final ArrayList llllllllllllIlllIlIlIlIIIIIllIII = new ArrayList();
        final int llllllllllllIlllIlIlIlIIIIIlIlll = RoundedRectangle.llIIIlIlllIlII[11] / llllllllllllIlllIlIlIlIIIIIlIllI;
        float llllllllllllIlllIlIlIlIIIIlIIIII = llllllllllllIlllIlIlIlIIIIIlIIlI;
        while (lIIIlIIlllIIlIll(lIIIlIIlllIIlIIl(llllllllllllIlllIlIlIlIIIIlIIIII, llllllllllllIlllIlIlIlIIIIIllIIl + llllllllllllIlllIlIlIlIIIIIlIlll))) {
            float llllllllllllIlllIlIlIlIIIIlIIIll = llllllllllllIlllIlIlIlIIIIlIIIII;
            if (lIIIlIIlllIIIlll(lIIIlIIlllIIlIlI(llllllllllllIlllIlIlIlIIIIlIIIll, llllllllllllIlllIlIlIlIIIIIllIIl))) {
                llllllllllllIlllIlIlIlIIIIlIIIll = llllllllllllIlllIlIlIlIIIIIllIIl;
            }
            final float llllllllllllIlllIlIlIlIIIIlIIIlI = (float)(llllllllllllIlllIlIlIlIIIIIlllII + FastTrig.cos(Math.toRadians(llllllllllllIlllIlIlIlIIIIlIIIll)) * llllllllllllIlllIlIlIlIIIIIlllIl);
            final float llllllllllllIlllIlIlIlIIIIlIIIIl = (float)(llllllllllllIlllIlIlIlIIIIIllIll + FastTrig.sin(Math.toRadians(llllllllllllIlllIlIlIlIIIIlIIIll)) * llllllllllllIlllIlIlIlIIIIIlllIl);
            llllllllllllIlllIlIlIlIIIIIllIII.add(new Float(llllllllllllIlllIlIlIlIIIIlIIIlI));
            "".length();
            llllllllllllIlllIlIlIlIIIIIllIII.add(new Float(llllllllllllIlllIlIlIlIIIIlIIIIl));
            "".length();
            llllllllllllIlllIlIlIlIIIIlIIIII += llllllllllllIlllIlIlIlIIIIIlIlll;
            "".length();
            if ("  ".length() >= (0x5E ^ 0xA ^ (0x12 ^ 0x42))) {
                return null;
            }
        }
        return llllllllllllIlllIlIlIlIIIIIllIII;
    }
    
    @Override
    protected void createPoints() {
        this.maxX = this.x + this.width;
        this.maxY = this.y + this.height;
        this.minX = this.x;
        this.minY = this.y;
        final float llllllllllllIlllIlIlIlIIIIllIlll = this.width - 1.0f;
        final float llllllllllllIlllIlIlIlIIIIllIllI = this.height - 1.0f;
        if (lIIIlIIlllIIIllI(lIIIlIIlllIIIlIl(this.cornerRadius, 0.0f))) {
            this.points = new float[RoundedRectangle.llIIIlIlllIlII[4]];
            this.points[RoundedRectangle.llIIIlIlllIlII[2]] = this.x;
            this.points[RoundedRectangle.llIIIlIlllIlII[3]] = this.y;
            this.points[RoundedRectangle.llIIIlIlllIlII[5]] = this.x + llllllllllllIlllIlIlIlIIIIllIlll;
            this.points[RoundedRectangle.llIIIlIlllIlII[6]] = this.y;
            this.points[RoundedRectangle.llIIIlIlllIlII[7]] = this.x + llllllllllllIlllIlIlIlIIIIllIlll;
            this.points[RoundedRectangle.llIIIlIlllIlII[8]] = this.y + llllllllllllIlllIlIlIlIIIIllIllI;
            this.points[RoundedRectangle.llIIIlIlllIlII[9]] = this.x;
            this.points[RoundedRectangle.llIIIlIlllIlII[10]] = this.y + llllllllllllIlllIlIlIlIIIIllIllI;
            "".length();
            if ("   ".length() == " ".length()) {
                return;
            }
        }
        else {
            float llllllllllllIlllIlIlIlIIIIlllIlI = this.cornerRadius * 2.0f;
            if (lIIIlIIlllIIIlll(lIIIlIIlllIIIlIl(llllllllllllIlllIlIlIlIIIIlllIlI, llllllllllllIlllIlIlIlIIIIllIlll))) {
                llllllllllllIlllIlIlIlIIIIlllIlI = llllllllllllIlllIlIlIlIIIIllIlll;
                this.cornerRadius = llllllllllllIlllIlIlIlIIIIlllIlI / 2.0f;
            }
            if (lIIIlIIlllIIIlll(lIIIlIIlllIIIlIl(llllllllllllIlllIlIlIlIIIIlllIlI, llllllllllllIlllIlIlIlIIIIllIllI))) {
                llllllllllllIlllIlIlIlIIIIlllIlI = llllllllllllIlllIlIlIlIIIIllIllI;
                this.cornerRadius = llllllllllllIlllIlIlIlIIIIlllIlI / 2.0f;
            }
            final ArrayList llllllllllllIlllIlIlIlIIIIlllIIl = new ArrayList();
            if (lIIIlIIlllIIIIlI(this.cornerFlags & RoundedRectangle.llIIIlIlllIlII[3])) {
                llllllllllllIlllIlIlIlIIIIlllIIl.addAll(this.createPoints(this.segmentCount, this.cornerRadius, this.x + this.cornerRadius, this.y + this.cornerRadius, 180.0f, 270.0f));
                "".length();
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlIlIIIIlllIIl.add(new Float(this.x));
                "".length();
                llllllllllllIlllIlIlIlIIIIlllIIl.add(new Float(this.y));
                "".length();
            }
            if (lIIIlIIlllIIIIlI(this.cornerFlags & RoundedRectangle.llIIIlIlllIlII[5])) {
                llllllllllllIlllIlIlIlIIIIlllIIl.addAll(this.createPoints(this.segmentCount, this.cornerRadius, this.x + llllllllllllIlllIlIlIlIIIIllIlll - this.cornerRadius, this.y + this.cornerRadius, 270.0f, 360.0f));
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlIlIIIIlllIIl.add(new Float(this.x + llllllllllllIlllIlIlIlIIIIllIlll));
                "".length();
                llllllllllllIlllIlIlIlIIIIlllIIl.add(new Float(this.y));
                "".length();
            }
            if (lIIIlIIlllIIIIlI(this.cornerFlags & RoundedRectangle.llIIIlIlllIlII[7])) {
                llllllllllllIlllIlIlIlIIIIlllIIl.addAll(this.createPoints(this.segmentCount, this.cornerRadius, this.x + llllllllllllIlllIlIlIlIIIIllIlll - this.cornerRadius, this.y + llllllllllllIlllIlIlIlIIIIllIllI - this.cornerRadius, 0.0f, 90.0f));
                "".length();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlIlIIIIlllIIl.add(new Float(this.x + llllllllllllIlllIlIlIlIIIIllIlll));
                "".length();
                llllllllllllIlllIlIlIlIIIIlllIIl.add(new Float(this.y + llllllllllllIlllIlIlIlIIIIllIllI));
                "".length();
            }
            if (lIIIlIIlllIIIIlI(this.cornerFlags & RoundedRectangle.llIIIlIlllIlII[4])) {
                llllllllllllIlllIlIlIlIIIIlllIIl.addAll(this.createPoints(this.segmentCount, this.cornerRadius, this.x + this.cornerRadius, this.y + llllllllllllIlllIlIlIlIIIIllIllI - this.cornerRadius, 90.0f, 180.0f));
                "".length();
                "".length();
                if ((0xA6 ^ 0xA2) == 0x0) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlIlIIIIlllIIl.add(new Float(this.x));
                "".length();
                llllllllllllIlllIlIlIlIIIIlllIIl.add(new Float(this.y + llllllllllllIlllIlIlIlIIIIllIllI));
                "".length();
            }
            this.points = new float[llllllllllllIlllIlIlIlIIIIlllIIl.size()];
            int llllllllllllIlllIlIlIlIIIIlllIll = RoundedRectangle.llIIIlIlllIlII[2];
            while (lIIIlIIlllIIlIII(llllllllllllIlllIlIlIlIIIIlllIll, llllllllllllIlllIlIlIlIIIIlllIIl.size())) {
                this.points[llllllllllllIlllIlIlIlIIIIlllIll] = llllllllllllIlllIlIlIlIIIIlllIIl.get(llllllllllllIlllIlIlIlIIIIlllIll);
                ++llllllllllllIlllIlIlIlIIIIlllIll;
                "".length();
                if (-" ".length() > "  ".length()) {
                    return;
                }
            }
        }
        this.findCenter();
        this.calculateRadius();
    }
    
    public void setCornerRadius(final float llllllllllllIlllIlIlIlIIIlIlIllI) {
        if (lIIIlIIlllIIIIIl(lIIIlIIlllIIIIII(llllllllllllIlllIlIlIlIIIlIlIllI, 0.0f)) && lIIIlIIlllIIIIlI(lIIIlIIlllIIIIII(llllllllllllIlllIlIlIlIIIlIlIllI, this.cornerRadius))) {
            this.cornerRadius = llllllllllllIlllIlIlIlIIIlIlIllI;
            this.pointsDirty = (RoundedRectangle.llIIIlIlllIlII[3] != 0);
        }
    }
    
    private static int lIIIlIIlllIIlIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIIIlIIlllIIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIlIIlllIIIllI(final int llllllllllllIlllIlIlIIlllllIlIlI) {
        return llllllllllllIlllIlIlIIlllllIlIlI == 0;
    }
    
    private static boolean lIIIlIIlllIIIIlI(final int llllllllllllIlllIlIlIIlllllIllII) {
        return llllllllllllIlllIlIlIIlllllIllII != 0;
    }
    
    private static boolean lIIIlIIlllIIlIII(final int llllllllllllIlllIlIlIIlllllIllll, final int llllllllllllIlllIlIlIIlllllIlllI) {
        return llllllllllllIlllIlIlIIlllllIllll < llllllllllllIlllIlIlIIlllllIlllI;
    }
    
    public RoundedRectangle(final float llllllllllllIlllIlIlIlIIIllIIIll, final float llllllllllllIlllIlIlIlIIIllIIIlI, final float llllllllllllIlllIlIlIlIIIllIIIIl, final float llllllllllllIlllIlIlIlIIIllIlIII, final float llllllllllllIlllIlIlIlIIIllIIlll, final int llllllllllllIlllIlIlIlIIIlIllllI, final int llllllllllllIlllIlIlIlIIIllIIlIl) {
        super(llllllllllllIlllIlIlIlIIIllIIIll, llllllllllllIlllIlIlIlIIIllIIIlI, llllllllllllIlllIlIlIlIIIllIIIIl, llllllllllllIlllIlIlIlIIIllIlIII);
        if (lIIIlIIllIllllll(lIIIlIIllIlllllI(llllllllllllIlllIlIlIlIIIllIIlll, 0.0f))) {
            throw new IllegalArgumentException(RoundedRectangle.llIIIlIlllIIll[RoundedRectangle.llIIIlIlllIlII[2]]);
        }
        this.x = llllllllllllIlllIlIlIlIIIllIIIll;
        this.y = llllllllllllIlllIlIlIlIIIllIIIlI;
        this.width = llllllllllllIlllIlIlIlIIIllIIIIl;
        this.height = llllllllllllIlllIlIlIlIIIllIlIII;
        this.cornerRadius = llllllllllllIlllIlIlIlIIIllIIlll;
        this.segmentCount = llllllllllllIlllIlIlIlIIIlIllllI;
        this.pointsDirty = (RoundedRectangle.llIIIlIlllIlII[3] != 0);
        this.cornerFlags = llllllllllllIlllIlIlIlIIIllIIlIl;
    }
    
    public RoundedRectangle(final float llllllllllllIlllIlIlIlIIIllllIlI, final float llllllllllllIlllIlIlIlIIIllllIIl, final float llllllllllllIlllIlIlIlIIIllllIII, final float llllllllllllIlllIlIlIlIIIllllllI, final float llllllllllllIlllIlIlIlIIIlllIllI, final int llllllllllllIlllIlIlIlIIIlllIlIl) {
        this(llllllllllllIlllIlIlIlIIIllllIlI, llllllllllllIlllIlIlIlIIIllllIIl, llllllllllllIlllIlIlIlIIIllllIII, llllllllllllIlllIlIlIlIIIllllllI, llllllllllllIlllIlIlIlIIIlllIllI, llllllllllllIlllIlIlIlIIIlllIlIl, RoundedRectangle.llIIIlIlllIlII[1]);
    }
    
    private static void lIIIlIIllIllllII() {
        (llIIIlIlllIIll = new String[RoundedRectangle.llIIIlIlllIlII[3]])[RoundedRectangle.llIIIlIlllIlII[2]] = lIIIlIIllIlllIll("QLwAnOlZO1bcJi81Z7G4mKFSG4d6DkRWpuk/C9Cj9dU=", "qSKym");
    }
    
    private static int lIIIlIIlllIIIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIlIIlllIIlIll(final int llllllllllllIlllIlIlIIlllllIIlII) {
        return llllllllllllIlllIlIlIIlllllIIlII <= 0;
    }
    
    private static int lIIIlIIlllIIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIIIlIIllIllllIl() {
        (llIIIlIlllIlII = new int[12])[0] = (0xA4 ^ 0xBD);
        RoundedRectangle.llIIIlIlllIlII[1] = (0x39 ^ 0x36);
        RoundedRectangle.llIIIlIlllIlII[2] = ((0xDD ^ 0x89 ^ (0x65 ^ 0x25)) & (121 + 39 - 19 + 0 ^ 35 + 92 - 23 + 49 ^ -" ".length()));
        RoundedRectangle.llIIIlIlllIlII[3] = " ".length();
        RoundedRectangle.llIIIlIlllIlII[4] = (0x72 ^ 0x8 ^ (0x18 ^ 0x6A));
        RoundedRectangle.llIIIlIlllIlII[5] = "  ".length();
        RoundedRectangle.llIIIlIlllIlII[6] = "   ".length();
        RoundedRectangle.llIIIlIlllIlII[7] = (111 + 109 - 170 + 81 ^ 109 + 22 - 12 + 16);
        RoundedRectangle.llIIIlIlllIlII[8] = (0x50 ^ 0x55);
        RoundedRectangle.llIIIlIlllIlII[9] = (0xB0 ^ 0xB6);
        RoundedRectangle.llIIIlIlllIlII[10] = (62 + 101 - 50 + 41 ^ 154 + 25 - 56 + 34);
        RoundedRectangle.llIIIlIlllIlII[11] = (0xFFFFE7EB & 0x197C);
    }
    
    public float getCornerRadius() {
        return this.cornerRadius;
    }
    
    private static String lIIIlIIllIlllIll(final String llllllllllllIlllIlIlIIllllllIlll, final String llllllllllllIlllIlIlIIllllllIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIlllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIllllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIlIIlllllllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIlIIlllllllIIl.init(RoundedRectangle.llIIIlIlllIlII[5], llllllllllllIlllIlIlIIlllllllIlI);
            return new String(llllllllllllIlllIlIlIIlllllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIllllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIlllllllIII) {
            llllllllllllIlllIlIlIIlllllllIII.printStackTrace();
            return null;
        }
    }
}
