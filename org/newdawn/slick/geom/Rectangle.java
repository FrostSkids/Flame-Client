// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class Rectangle extends Shape
{
    protected /* synthetic */ float width;
    protected /* synthetic */ float height;
    private static final /* synthetic */ int[] lIIlIIllIllIlI;
    private static final /* synthetic */ String[] lIIlIIllIllIIl;
    
    private static int llIIlllIIIlIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIIlllIIIllIII(final int lllllllllllllIIllIllIIllIIIllIll) {
        return lllllllllllllIIllIllIIllIIIllIll != 0;
    }
    
    private static boolean llIIlllIIIlIlIl(final int lllllllllllllIIllIllIIllIIIlIlIl) {
        return lllllllllllllIIllIllIIllIIIlIlIl <= 0;
    }
    
    @Override
    public boolean intersects(final Shape lllllllllllllIIllIllIIllIlllIlll) {
        if (llIIlllIIIllIII((lllllllllllllIIllIllIIllIlllIlll instanceof Rectangle) ? 1 : 0)) {
            final Rectangle lllllllllllllIIllIllIIllIllllIll = (Rectangle)lllllllllllllIIllIllIIllIlllIlll;
            if (!llIIlllIIIlIlIl(llIIlllIIIllIlI(this.x, lllllllllllllIIllIllIIllIllllIll.x + lllllllllllllIIllIllIIllIllllIll.width)) || llIIlllIIIlllII(llIIlllIIIllIll(this.x + this.width, lllllllllllllIIllIllIIllIllllIll.x))) {
                return Rectangle.lIIlIIllIllIlI[0] != 0;
            }
            if (!llIIlllIIIlIlIl(llIIlllIIIllIlI(this.y, lllllllllllllIIllIllIIllIllllIll.y + lllllllllllllIIllIllIIllIllllIll.height)) || llIIlllIIIlllII(llIIlllIIIllIll(this.y + this.height, lllllllllllllIIllIllIIllIllllIll.y))) {
                return Rectangle.lIIlIIllIllIlI[0] != 0;
            }
            return Rectangle.lIIlIIllIllIlI[1] != 0;
        }
        else {
            if (llIIlllIIIllIII((lllllllllllllIIllIllIIllIlllIlll instanceof Circle) ? 1 : 0)) {
                return this.intersects((Circle)lllllllllllllIIllIllIIllIlllIlll);
            }
            return super.intersects(lllllllllllllIIllIllIIllIlllIlll);
        }
    }
    
    private static String llIIlllIIIIllII(final String lllllllllllllIIllIllIIllIIllllII, final String lllllllllllllIIllIllIIllIIlllIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIllIIllIlIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIIllIIlllIll.getBytes(StandardCharsets.UTF_8)), Rectangle.lIIlIIllIllIlI[2]), "DES");
            final Cipher lllllllllllllIIllIllIIllIlIIIIII = Cipher.getInstance("DES");
            lllllllllllllIIllIllIIllIlIIIIII.init(Rectangle.lIIlIIllIllIlI[3], lllllllllllllIIllIllIIllIlIIIIIl);
            return new String(lllllllllllllIIllIllIIllIlIIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIIllIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIllIIllIIllllll) {
            lllllllllllllIIllIllIIllIIllllll.printStackTrace();
            return null;
        }
    }
    
    public void scaleGrow(final float lllllllllllllIIllIllIIlllIIIllII, final float lllllllllllllIIllIllIIlllIIIlllI) {
        this.grow(this.getWidth() * (lllllllllllllIIllIllIIlllIIIllII - 1.0f), this.getHeight() * (lllllllllllllIIllIllIIlllIIIlllI - 1.0f));
    }
    
    private static void llIIlllIIIlIIlI() {
        (lIIlIIllIllIlI = new int[9])[0] = ((0x9D ^ 0x81) & ~(0x41 ^ 0x5D));
        Rectangle.lIIlIIllIllIlI[1] = " ".length();
        Rectangle.lIIlIIllIllIlI[2] = (0x4 ^ 0xC);
        Rectangle.lIIlIIllIllIlI[3] = "  ".length();
        Rectangle.lIIlIIllIllIlI[4] = "   ".length();
        Rectangle.lIIlIIllIllIlI[5] = (0xC5 ^ 0x9A ^ (0xF3 ^ 0xA8));
        Rectangle.lIIlIIllIllIlI[6] = (0x2B ^ 0x65 ^ (0xDB ^ 0x90));
        Rectangle.lIIlIIllIllIlI[7] = (0x64 ^ 0x62);
        Rectangle.lIIlIIllIllIlI[8] = (38 + 60 - 6 + 64 ^ 143 + 113 - 221 + 120);
    }
    
    private static String llIIlllIIIIlIll(String lllllllllllllIIllIllIIllIIlIlIIl, final String lllllllllllllIIllIllIIllIIlIllIl) {
        lllllllllllllIIllIllIIllIIlIlIIl = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIllIIllIIlIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIllIIllIIlIllII = new StringBuilder();
        final char[] lllllllllllllIIllIllIIllIIlIlIll = lllllllllllllIIllIllIIllIIlIllIl.toCharArray();
        int lllllllllllllIIllIllIIllIIlIlIlI = Rectangle.lIIlIIllIllIlI[0];
        final short lllllllllllllIIllIllIIllIIlIIlII = (Object)((String)lllllllllllllIIllIllIIllIIlIlIIl).toCharArray();
        final long lllllllllllllIIllIllIIllIIlIIIll = lllllllllllllIIllIllIIllIIlIIlII.length;
        char lllllllllllllIIllIllIIllIIlIIIlI = (char)Rectangle.lIIlIIllIllIlI[0];
        while (llIIlllIIIlllll(lllllllllllllIIllIllIIllIIlIIIlI, (int)lllllllllllllIIllIllIIllIIlIIIll)) {
            final char lllllllllllllIIllIllIIllIIlIllll = lllllllllllllIIllIllIIllIIlIIlII[lllllllllllllIIllIllIIllIIlIIIlI];
            lllllllllllllIIllIllIIllIIlIllII.append((char)(lllllllllllllIIllIllIIllIIlIllll ^ lllllllllllllIIllIllIIllIIlIlIll[lllllllllllllIIllIllIIllIIlIlIlI % lllllllllllllIIllIllIIllIIlIlIll.length]));
            "".length();
            ++lllllllllllllIIllIllIIllIIlIlIlI;
            ++lllllllllllllIIllIllIIllIIlIIIlI;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIllIIllIIlIllII);
    }
    
    @Override
    public float getHeight() {
        return this.height;
    }
    
    private static boolean llIIlllIIIlllll(final int lllllllllllllIIllIllIIllIIIllllI, final int lllllllllllllIIllIllIIllIIIlllIl) {
        return lllllllllllllIIllIllIIllIIIllllI < lllllllllllllIIllIllIIllIIIlllIl;
    }
    
    private static boolean llIIlllIIIlllII(final int lllllllllllllIIllIllIIllIIIlIlll) {
        return lllllllllllllIIllIllIIllIIIlIlll < 0;
    }
    
    private static int llIIlllIIIllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private boolean intersects(final Circle lllllllllllllIIllIllIIllIllIlIIl) {
        return lllllllllllllIIllIllIIllIllIlIIl.intersects((Shape)this);
    }
    
    public void setBounds(final Rectangle lllllllllllllIIllIllIIlllIlllIll) {
        this.setBounds(lllllllllllllIIllIllIIlllIlllIll.getX(), lllllllllllllIIllIllIIlllIlllIll.getY(), lllllllllllllIIllIllIIlllIlllIll.getWidth(), lllllllllllllIIllIllIIlllIlllIll.getHeight());
    }
    
    private static int llIIlllIIIlIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void setHeight(final float lllllllllllllIIllIllIIlllIIIIIIl) {
        if (llIIlllIIIllIII(llIIlllIIIllIIl(lllllllllllllIIllIllIIlllIIIIIIl, this.height))) {
            this.pointsDirty = (Rectangle.lIIlIIllIllIlI[1] != 0);
            this.height = lllllllllllllIIllIllIIlllIIIIIIl;
            this.maxY = this.y + lllllllllllllIIllIllIIlllIIIIIIl;
        }
    }
    
    @Override
    public Shape transform(final Transform lllllllllllllIIllIllIIllIlIIlIII) {
        this.checkPoints();
        final Polygon lllllllllllllIIllIllIIllIlIIlIll = new Polygon();
        final float[] lllllllllllllIIllIllIIllIlIIlIlI = new float[this.points.length];
        lllllllllllllIIllIllIIllIlIIlIII.transform(this.points, Rectangle.lIIlIIllIllIlI[0], lllllllllllllIIllIllIIllIlIIlIlI, Rectangle.lIIlIIllIllIlI[0], this.points.length / Rectangle.lIIlIIllIllIlI[3]);
        lllllllllllllIIllIllIIllIlIIlIll.points = lllllllllllllIIllIllIIllIlIIlIlI;
        lllllllllllllIIllIllIIllIlIIlIll.findCenter();
        lllllllllllllIIllIllIIllIlIIlIll.checkPoints();
        return lllllllllllllIIllIllIIllIlIIlIll;
    }
    
    private static int llIIlllIIIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void grow(final float lllllllllllllIIllIllIIlllIIlIlIl, final float lllllllllllllIIllIllIIlllIIlIlll) {
        this.setX(this.getX() - lllllllllllllIIllIllIIlllIIlIlIl);
        this.setY(this.getY() - lllllllllllllIIllIllIIlllIIlIlll);
        this.setWidth(this.getWidth() + lllllllllllllIIllIllIIlllIIlIlIl * 2.0f);
        this.setHeight(this.getHeight() + lllllllllllllIIllIllIIlllIIlIlll * 2.0f);
    }
    
    public void setSize(final float lllllllllllllIIllIllIIlllIlIIlII, final float lllllllllllllIIllIllIIlllIlIIllI) {
        this.setWidth(lllllllllllllIIllIllIIlllIlIIlII);
        this.setHeight(lllllllllllllIIllIllIIlllIlIIllI);
    }
    
    private static boolean llIIlllIIIlIllI(final int lllllllllllllIIllIllIIllIIIllIIl) {
        return lllllllllllllIIllIllIIllIIIllIIl >= 0;
    }
    
    @Override
    public float getWidth() {
        return this.width;
    }
    
    public Rectangle(final float lllllllllllllIIllIllIIllllIlIIlI, final float lllllllllllllIIllIllIIllllIlIIIl, final float lllllllllllllIIllIllIIllllIlIIII, final float lllllllllllllIIllIllIIllllIIllll) {
        this.x = lllllllllllllIIllIllIIllllIlIIlI;
        this.y = lllllllllllllIIllIllIIllllIlIIIl;
        this.width = lllllllllllllIIllIllIIllllIlIIII;
        this.height = lllllllllllllIIllIllIIllllIIllll;
        this.maxX = lllllllllllllIIllIllIIllllIlIIlI + lllllllllllllIIllIllIIllllIlIIII;
        this.maxY = lllllllllllllIIllIllIIllllIlIIIl + lllllllllllllIIllIllIIllllIIllll;
        this.checkPoints();
    }
    
    private static void llIIlllIIIIllIl() {
        (lIIlIIllIllIIl = new String[Rectangle.lIIlIIllIllIlI[4]])[Rectangle.lIIlIIllIllIlI[0]] = llIIlllIIIIlIll("DDMwFTU2DzIaJHc=", "WaUvA");
        Rectangle.lIIlIIllIllIIl[Rectangle.lIIlIIllIllIlI[1]] = llIIlllIIIIllII("5bOf8n74RRU=", "fXoGC");
        Rectangle.lIIlIIllIllIIl[Rectangle.lIIlIIllIllIlI[3]] = llIIlllIIIIlIll("Pw==", "bkxHl");
    }
    
    private static int llIIlllIIIllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    static {
        llIIlllIIIlIIlI();
        llIIlllIIIIllIl();
    }
    
    private static int llIIlllIIIllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int llIIlllIIIlIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setBounds(final float lllllllllllllIIllIllIIlllIlIllll, final float lllllllllllllIIllIllIIlllIllIIll, final float lllllllllllllIIllIllIIlllIlIllIl, final float lllllllllllllIIllIllIIlllIlIllII) {
        this.setX(lllllllllllllIIllIllIIlllIlIllll);
        this.setY(lllllllllllllIIllIllIIlllIllIIll);
        this.setSize(lllllllllllllIIllIllIIlllIlIllIl, lllllllllllllIIllIllIIlllIlIllII);
    }
    
    @Override
    protected void createPoints() {
        final float lllllllllllllIIllIllIIllIlllIIIl = this.width;
        final float lllllllllllllIIllIllIIllIlllIIII = this.height;
        this.points = new float[Rectangle.lIIlIIllIllIlI[2]];
        this.points[Rectangle.lIIlIIllIllIlI[0]] = this.x;
        this.points[Rectangle.lIIlIIllIllIlI[1]] = this.y;
        this.points[Rectangle.lIIlIIllIllIlI[3]] = this.x + lllllllllllllIIllIllIIllIlllIIIl;
        this.points[Rectangle.lIIlIIllIllIlI[4]] = this.y;
        this.points[Rectangle.lIIlIIllIllIlI[5]] = this.x + lllllllllllllIIllIllIIllIlllIIIl;
        this.points[Rectangle.lIIlIIllIllIlI[6]] = this.y + lllllllllllllIIllIllIIllIlllIIII;
        this.points[Rectangle.lIIlIIllIllIlI[7]] = this.x;
        this.points[Rectangle.lIIlIIllIllIlI[8]] = this.y + lllllllllllllIIllIllIIllIlllIIII;
        this.maxX = this.points[Rectangle.lIIlIIllIllIlI[3]];
        this.maxY = this.points[Rectangle.lIIlIIllIllIlI[6]];
        this.minX = this.points[Rectangle.lIIlIIllIllIlI[0]];
        this.minY = this.points[Rectangle.lIIlIIllIllIlI[1]];
        this.findCenter();
        this.calculateRadius();
    }
    
    public void setWidth(final float lllllllllllllIIllIllIIlllIIIIlll) {
        if (llIIlllIIIllIII(llIIlllIIIlIlll(lllllllllllllIIllIllIIlllIIIIlll, this.width))) {
            this.pointsDirty = (Rectangle.lIIlIIllIllIlI[1] != 0);
            this.width = lllllllllllllIIllIllIIlllIIIIlll;
            this.maxX = this.x + lllllllllllllIIllIllIIlllIIIIlll;
        }
    }
    
    public static boolean contains(final float lllllllllllllIIllIllIIllIlIlIlll, final float lllllllllllllIIllIllIIllIlIlllII, final float lllllllllllllIIllIllIIllIlIlIlIl, final float lllllllllllllIIllIllIIllIlIllIlI, final float lllllllllllllIIllIllIIllIlIlIIll, final float lllllllllllllIIllIllIIllIlIlIIlI) {
        int n;
        if (llIIlllIIIlIllI(llIIlllIIIlllIl(lllllllllllllIIllIllIIllIlIlIlll, lllllllllllllIIllIllIIllIlIlIlIl)) && llIIlllIIIlIllI(llIIlllIIIlllIl(lllllllllllllIIllIllIIllIlIlllII, lllllllllllllIIllIllIIllIlIllIlI)) && llIIlllIIIlIlIl(llIIlllIIIllllI(lllllllllllllIIllIllIIllIlIlIlll, lllllllllllllIIllIllIIllIlIlIlIl + lllllllllllllIIllIllIIllIlIlIIll)) && llIIlllIIIlIlIl(llIIlllIIIllllI(lllllllllllllIIllIllIIllIlIlllII, lllllllllllllIIllIllIIllIlIllIlI + lllllllllllllIIllIllIIllIlIlIIlI))) {
            n = Rectangle.lIIlIIllIllIlI[1];
            "".length();
            if ("   ".length() > "   ".length()) {
                return ((18 + 130 - 46 + 50 ^ 124 + 72 - 112 + 49) & (3 + 108 - 104 + 142 ^ 105 + 15 - 94 + 110 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = Rectangle.lIIlIIllIllIlI[0];
        }
        return n != 0;
    }
    
    @Override
    public boolean contains(final float lllllllllllllIIllIllIIllllIIIlIl, final float lllllllllllllIIllIllIIllllIIIlII) {
        if (llIIlllIIIlIlIl(llIIlllIIIlIIll(lllllllllllllIIllIllIIllllIIIlIl, this.getX()))) {
            return Rectangle.lIIlIIllIllIlI[0] != 0;
        }
        if (llIIlllIIIlIlIl(llIIlllIIIlIIll(lllllllllllllIIllIllIIllllIIIlII, this.getY()))) {
            return Rectangle.lIIlIIllIllIlI[0] != 0;
        }
        if (llIIlllIIIlIllI(llIIlllIIIlIlII(lllllllllllllIIllIllIIllllIIIlIl, this.maxX))) {
            return Rectangle.lIIlIIllIllIlI[0] != 0;
        }
        if (llIIlllIIIlIllI(llIIlllIIIlIlII(lllllllllllllIIllIllIIllllIIIlII, this.maxY))) {
            return Rectangle.lIIlIIllIllIlI[0] != 0;
        }
        return Rectangle.lIIlIIllIllIlI[1] != 0;
    }
    
    private static int llIIlllIIIlllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(Rectangle.lIIlIIllIllIIl[Rectangle.lIIlIIllIllIlI[0]]).append(this.width).append(Rectangle.lIIlIIllIllIIl[Rectangle.lIIlIIllIllIlI[1]]).append(this.height).append(Rectangle.lIIlIIllIllIIl[Rectangle.lIIlIIllIllIlI[3]]));
    }
}
