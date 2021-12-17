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
import java.util.ArrayList;

public class MorphShape extends Shape
{
    private /* synthetic */ Shape current;
    private /* synthetic */ ArrayList shapes;
    private /* synthetic */ float offset;
    private static final /* synthetic */ int[] llIlllIIllIlll;
    private /* synthetic */ Shape next;
    private static final /* synthetic */ String[] llIlllIIllIlIl;
    
    private static boolean lIIllIIllIIIIllI(final int llllllllllllIllIIlIIllIIIIlIlllI, final int llllllllllllIllIIlIIllIIIIlIllIl) {
        return llllllllllllIllIIlIIllIIIIlIlllI < llllllllllllIllIIlIIllIIIIlIllIl;
    }
    
    private int rational(int llllllllllllIllIIlIIllIIIllIIlIl) {
        while (lIIllIIllIIIlIll(llllllllllllIllIIlIIllIIIllIIlIl, this.shapes.size())) {
            llllllllllllIllIIlIIllIIIllIIlIl -= this.shapes.size();
            "".length();
            if (((0xAA ^ 0x85) & ~(0xED ^ 0xC2)) == "   ".length()) {
                return (0x14 ^ 0x5C) & ~(0x36 ^ 0x7E);
            }
        }
        while (lIIllIIllIIIlIIl(llllllllllllIllIIlIIllIIIllIIlIl)) {
            llllllllllllIllIIlIIllIIIllIIlIl += this.shapes.size();
            "".length();
            if (((78 + 1 + 70 + 10 ^ 119 + 82 - 90 + 32) & (121 + 9 - 89 + 110 ^ 113 + 109 - 111 + 24 ^ -" ".length())) != 0x0) {
                return (0x2A ^ 0x1E ^ (0xF4 ^ 0xA3)) & (0xBA ^ 0xB4 ^ (0x1C ^ 0x71) ^ -" ".length());
            }
        }
        return llllllllllllIllIIlIIllIIIllIIlIl;
    }
    
    private static boolean lIIllIIllIIIIIll(final int llllllllllllIllIIlIIllIIIIlIIlll) {
        return llllllllllllIllIIlIIllIIIIlIIlll != 0;
    }
    
    public void setExternalFrame(final Shape llllllllllllIllIIlIIllIIIllIlIll) {
        this.current = llllllllllllIllIIlIIllIIIllIlIll;
        this.next = this.shapes.get(MorphShape.llIlllIIllIlll[0]);
        this.offset = 0.0f;
    }
    
    private static boolean lIIllIIllIIIlIlI(final int llllllllllllIllIIlIIllIIIIlIIIll) {
        return llllllllllllIllIIlIIllIIIIlIIIll > 0;
    }
    
    private static void lIIllIIllIIIIIIl() {
        (llIlllIIllIlll = new int[3])[0] = ((0x7A ^ 0x34) & ~(0x2A ^ 0x64));
        MorphShape.llIlllIIllIlll[1] = " ".length();
        MorphShape.llIlllIIllIlll[2] = "  ".length();
    }
    
    private static boolean lIIllIIllIIIlIll(final int llllllllllllIllIIlIIllIIIIllIIlI, final int llllllllllllIllIIlIIllIIIIllIIIl) {
        return llllllllllllIllIIlIIllIIIIllIIlI >= llllllllllllIllIIlIIllIIIIllIIIl;
    }
    
    private static String lIIllIIlIllllIlI(final String llllllllllllIllIIlIIllIIIIllllII, final String llllllllllllIllIIlIIllIIIIlllIll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIllIIIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIllIIIIlllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIllIIIlIIIIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIllIIIlIIIIII.init(MorphShape.llIlllIIllIlll[2], llllllllllllIllIIlIIllIIIlIIIIIl);
            return new String(llllllllllllIllIIlIIllIIIlIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIllIIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIllIIIIllllll) {
            llllllllllllIllIIlIIllIIIIllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIllIIIlIIl(final int llllllllllllIllIIlIIllIIIIlIIlIl) {
        return llllllllllllIllIIlIIllIIIIlIIlIl < 0;
    }
    
    private static int lIIllIIllIIIIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIllIIllIIIllII(final Object llllllllllllIllIIlIIllIIIIlIlIlI, final Object llllllllllllIllIIlIIllIIIIlIlIIl) {
        return llllllllllllIllIIlIIllIIIIlIlIlI == llllllllllllIllIIlIIllIIIIlIlIIl;
    }
    
    private static boolean lIIllIIllIIIIIlI(final int llllllllllllIllIIlIIllIIIIlIIIII, final int llllllllllllIllIIlIIllIIIIIlllll) {
        return llllllllllllIllIIlIIllIIIIlIIIII != llllllllllllIllIIlIIllIIIIIlllll;
    }
    
    private void setFrame(final int llllllllllllIllIIlIIllIIIlIllIll, final int llllllllllllIllIIlIIllIIIlIllllI, final float llllllllllllIllIIlIIllIIIlIllIIl) {
        this.current = this.shapes.get(llllllllllllIllIIlIIllIIIlIllIll);
        this.next = this.shapes.get(llllllllllllIllIIlIIllIIIlIllllI);
        this.offset = llllllllllllIllIIlIIllIIIlIllIIl;
        this.pointsDirty = (MorphShape.llIlllIIllIlll[1] != 0);
    }
    
    private boolean equalShapes(final Shape llllllllllllIllIIlIIllIIlIIlIIII, final Shape llllllllllllIllIIlIIllIIlIIIllll) {
        llllllllllllIllIIlIIllIIlIIlIIII.checkPoints();
        llllllllllllIllIIlIIllIIlIIIllll.checkPoints();
        int llllllllllllIllIIlIIllIIlIIlIlII = MorphShape.llIlllIIllIlll[0];
        while (lIIllIIllIIIIllI(llllllllllllIllIIlIIllIIlIIlIlII, llllllllllllIllIIlIIllIIlIIlIIII.points.length)) {
            if (lIIllIIllIIIIIll(lIIllIIllIIIIlIl(llllllllllllIllIIlIIllIIlIIlIIII.points[llllllllllllIllIIlIIllIIlIIlIlII], llllllllllllIllIIlIIllIIlIIIllll.points[llllllllllllIllIIlIIllIIlIIlIlII]))) {
                return MorphShape.llIlllIIllIlll[0] != 0;
            }
            ++llllllllllllIllIIlIIllIIlIIlIlII;
            "".length();
            if ((0x22 ^ 0x27) == 0x0) {
                return ((0x57 ^ 0x6) & ~(0x2C ^ 0x7D)) != 0x0;
            }
        }
        return MorphShape.llIlllIIllIlll[1] != 0;
    }
    
    private static int lIIllIIllIIIIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void addShape(final Shape llllllllllllIllIIlIIllIIlIIlllII) {
        if (lIIllIIllIIIIIlI(llllllllllllIllIIlIIllIIlIIlllII.points.length, this.points.length)) {
            throw new RuntimeException(MorphShape.llIlllIIllIlIl[MorphShape.llIlllIIllIlll[0]]);
        }
        final Shape llllllllllllIllIIlIIllIIlIIllIll = this.shapes.get(this.shapes.size() - MorphShape.llIlllIIllIlll[1]);
        if (lIIllIIllIIIIIll(this.equalShapes(llllllllllllIllIIlIIllIIlIIllIll, llllllllllllIllIIlIIllIIlIIlllII) ? 1 : 0)) {
            this.shapes.add(llllllllllllIllIIlIIllIIlIIllIll);
            "".length();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.shapes.add(llllllllllllIllIIlIIllIIlIIlllII);
            "".length();
        }
        if (lIIllIIllIIIIlII(this.shapes.size(), MorphShape.llIlllIIllIlll[2])) {
            this.next = this.shapes.get(MorphShape.llIlllIIllIlll[1]);
        }
    }
    
    public MorphShape(final Shape llllllllllllIllIIlIIllIIlIlIIIlI) {
        this.shapes = new ArrayList();
        this.shapes.add(llllllllllllIllIIlIIllIIlIlIIIlI);
        "".length();
        final float[] llllllllllllIllIIlIIllIIlIlIIlII = llllllllllllIllIIlIIllIIlIlIIIlI.points;
        this.points = new float[llllllllllllIllIIlIIllIIlIlIIlII.length];
        this.current = llllllllllllIllIIlIIllIIlIlIIIlI;
        this.next = llllllllllllIllIIlIIllIIlIlIIIlI;
    }
    
    private static int lIIllIIllIIIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public Shape transform(final Transform llllllllllllIllIIlIIllIIIlIIlIIl) {
        this.createPoints();
        final Polygon llllllllllllIllIIlIIllIIIlIIlIII = new Polygon(this.points);
        return llllllllllllIllIIlIIllIIIlIIlIII;
    }
    
    @Override
    protected void createPoints() {
        if (lIIllIIllIIIllII(this.current, this.next)) {
            System.arraycopy(this.current.points, MorphShape.llIlllIIllIlll[0], this.points, MorphShape.llIlllIIllIlll[0], this.points.length);
            return;
        }
        final float[] llllllllllllIllIIlIIllIIIlIlIIlI = this.current.points;
        final float[] llllllllllllIllIIlIIllIIIlIlIIIl = this.next.points;
        int llllllllllllIllIIlIIllIIIlIlIlII = MorphShape.llIlllIIllIlll[0];
        while (lIIllIIllIIIIllI(llllllllllllIllIIlIIllIIIlIlIlII, this.points.length)) {
            this.points[llllllllllllIllIIlIIllIIIlIlIlII] = llllllllllllIllIIlIIllIIIlIlIIlI[llllllllllllIllIIlIIllIIIlIlIlII] * (1.0f - this.offset);
            final float[] points = this.points;
            final int n = llllllllllllIllIIlIIllIIIlIlIlII;
            points[n] += llllllllllllIllIIlIIllIIIlIlIIIl[llllllllllllIllIIlIIllIIIlIlIlII] * this.offset;
            ++llllllllllllIllIIlIIllIIIlIlIlII;
            "".length();
            if (((0x46 ^ 0x50) & ~(0xD0 ^ 0xC6)) != 0x0) {
                return;
            }
        }
    }
    
    static {
        lIIllIIllIIIIIIl();
        lIIllIIllIIIIIII();
    }
    
    public void updateMorphTime(final float llllllllllllIllIIlIIllIIIlllIIll) {
        this.offset += llllllllllllIllIIlIIllIIIlllIIll;
        if (lIIllIIllIIIlIIl(lIIllIIllIIIIlll(this.offset, 0.0f))) {
            int llllllllllllIllIIlIIllIIIllllIlI = this.shapes.indexOf(this.current);
            if (lIIllIIllIIIlIIl(llllllllllllIllIIlIIllIIIllllIlI)) {
                llllllllllllIllIIlIIllIIIllllIlI = this.shapes.size() - MorphShape.llIlllIIllIlll[1];
            }
            final int llllllllllllIllIIlIIllIIIllllIIl = this.rational(llllllllllllIllIIlIIllIIIllllIlI + MorphShape.llIlllIIllIlll[1]);
            this.setFrame(llllllllllllIllIIlIIllIIIllllIlI, llllllllllllIllIIlIIllIIIllllIIl, this.offset);
            ++this.offset;
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else if (lIIllIIllIIIlIlI(lIIllIIllIIIlIII(this.offset, 1.0f))) {
            int llllllllllllIllIIlIIllIIIllllIII = this.shapes.indexOf(this.next);
            if (lIIllIIllIIIIllI(llllllllllllIllIIlIIllIIIllllIII, MorphShape.llIlllIIllIlll[1])) {
                llllllllllllIllIIlIIllIIIllllIII = MorphShape.llIlllIIllIlll[0];
            }
            final int llllllllllllIllIIlIIllIIIlllIlll = this.rational(llllllllllllIllIIlIIllIIIllllIII + MorphShape.llIlllIIllIlll[1]);
            this.setFrame(llllllllllllIllIIlIIllIIIllllIII, llllllllllllIllIIlIIllIIIlllIlll, this.offset);
            --this.offset;
            "".length();
            if ((0x74 ^ 0x70) < 0) {
                return;
            }
        }
        else {
            this.pointsDirty = (MorphShape.llIlllIIllIlll[1] != 0);
        }
    }
    
    private static void lIIllIIllIIIIIII() {
        (llIlllIIllIlIl = new String[MorphShape.llIlllIIllIlll[1]])[MorphShape.llIlllIIllIlll[0]] = lIIllIIlIllllIlI("rN+1JE8Vk1rsCKZB10zIq4YDPO5C9F/m8PeXS2MabOUp4MFMFSjIV1/wxm2FY+CMMTTCJyGi6BDZ7PWhY2Ta1C47LyQo0d1x", "jBxOD");
    }
    
    private static boolean lIIllIIllIIIIlII(final int llllllllllllIllIIlIIllIIIIllIllI, final int llllllllllllIllIIlIIllIIIIllIlIl) {
        return llllllllllllIllIIlIIllIIIIllIllI == llllllllllllIllIIlIIllIIIIllIlIl;
    }
    
    public void setMorphTime(final float llllllllllllIllIIlIIllIIlIIIIIlI) {
        int llllllllllllIllIIlIIllIIlIIIIllI = (int)llllllllllllIllIIlIIllIIlIIIIIlI;
        int llllllllllllIllIIlIIllIIlIIIIlIl = llllllllllllIllIIlIIllIIlIIIIllI + MorphShape.llIlllIIllIlll[1];
        final float llllllllllllIllIIlIIllIIlIIIIlII = llllllllllllIllIIlIIllIIlIIIIIlI - llllllllllllIllIIlIIllIIlIIIIllI;
        llllllllllllIllIIlIIllIIlIIIIllI = this.rational(llllllllllllIllIIlIIllIIlIIIIllI);
        llllllllllllIllIIlIIllIIlIIIIlIl = this.rational(llllllllllllIllIIlIIllIIlIIIIlIl);
        this.setFrame(llllllllllllIllIIlIIllIIlIIIIllI, llllllllllllIllIIlIIllIIlIIIIlIl, llllllllllllIllIIlIIllIIlIIIIlII);
    }
}
