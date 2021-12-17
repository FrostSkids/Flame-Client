// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.util.Arrays;
import org.newdawn.slick.util.FastTrig;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.Serializable;

public strictfp class Vector2f implements Serializable
{
    private static final /* synthetic */ int[] lIllIlIlllIllI;
    private static final /* synthetic */ String[] lIllIlIlllIIlI;
    public /* synthetic */ float y;
    public /* synthetic */ float x;
    
    @Override
    public strictfp String toString() {
        return String.valueOf(new StringBuilder().append(Vector2f.lIllIlIlllIIlI[Vector2f.lIllIlIlllIllI[0]]).append(this.x).append(Vector2f.lIllIlIlllIIlI[Vector2f.lIllIlIlllIllI[1]]).append(this.y).append(Vector2f.lIllIlIlllIIlI[Vector2f.lIllIlIlllIllI[2]]).append(this.length()).append(Vector2f.lIllIlIlllIIlI[Vector2f.lIllIlIlllIllI[3]]));
    }
    
    private static int lllllllIIllllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllllllIIlllIll(final int llllllllllllIllllllllIIIIIlllIll) {
        return llllllllllllIllllllllIIIIIlllIll < 0;
    }
    
    public strictfp Vector2f add(final double llllllllllllIllllllllIIIllllIllI) {
        this.setTheta(this.getTheta() + llllllllllllIllllllllIIIllllIllI);
        return this;
    }
    
    private static String lllllllIIlIllll(final String llllllllllllIllllllllIIIIlIlIIll, final String llllllllllllIllllllllIIIIlIlIlII) {
        try {
            final SecretKeySpec llllllllllllIllllllllIIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllllIIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllllIIIIlIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllllllllIIIIlIlIlll.init(Vector2f.lIllIlIlllIllI[2], llllllllllllIllllllllIIIIlIllIII);
            return new String(llllllllllllIllllllllIIIIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllllllIIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllllIIIIlIlIllI) {
            llllllllllllIllllllllIIIIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    public strictfp float length() {
        return (float)Math.sqrt(this.lengthSquared());
    }
    
    public strictfp void setTheta(double llllllllllllIllllllllIIIlllllllI) {
        if (!lllllllIIlllIIl(lllllllIIllIlll(llllllllllllIllllllllIIIlllllllI, -360.0)) || lllllllIIlllIlI(lllllllIIlllIII(llllllllllllIllllllllIIIlllllllI, 360.0))) {
            llllllllllllIllllllllIIIlllllllI %= 360.0;
        }
        if (lllllllIIlllIll(lllllllIIllIlll(llllllllllllIllllllllIIIlllllllI, 0.0))) {
            llllllllllllIllllllllIIIlllllllI += 360.0;
        }
        double llllllllllllIllllllllIIlIIIIIIIl = this.getTheta();
        if (!lllllllIIlllIIl(lllllllIIllIlll(llllllllllllIllllllllIIIlllllllI, -360.0)) || lllllllIIlllIlI(lllllllIIlllIII(llllllllllllIllllllllIIIlllllllI, 360.0))) {
            llllllllllllIllllllllIIlIIIIIIIl %= 360.0;
        }
        if (lllllllIIlllIll(lllllllIIllIlll(llllllllllllIllllllllIIIlllllllI, 0.0))) {
            llllllllllllIllllllllIIlIIIIIIIl += 360.0;
        }
        final float llllllllllllIllllllllIIlIIIIIIII = this.length();
        this.x = llllllllllllIllllllllIIlIIIIIIII * (float)FastTrig.cos(StrictMath.toRadians(llllllllllllIllllllllIIIlllllllI));
        this.y = llllllllllllIllllllllIIlIIIIIIII * (float)FastTrig.sin(StrictMath.toRadians(llllllllllllIllllllllIIIlllllllI));
    }
    
    public Vector2f(final Vector2f llllllllllllIllllllllIIIlllIIIII) {
        this(llllllllllllIllllllllIIIlllIIIII.getX(), llllllllllllIllllllllIIIlllIIIII.getY());
    }
    
    public strictfp Vector2f copy() {
        return new Vector2f(this.x, this.y);
    }
    
    public strictfp Vector2f negate() {
        return new Vector2f(-this.x, -this.y);
    }
    
    private static boolean lllllllIIlllIlI(final int llllllllllllIllllllllIIIIIlllIIl) {
        return llllllllllllIllllllllIIIIIlllIIl > 0;
    }
    
    @Override
    public strictfp int hashCode() {
        return Vector2f.lIllIlIlllIllI[4] * (int)this.x ^ Vector2f.lIllIlIlllIllI[5] * (int)this.y;
    }
    
    private static int lllllllIIllllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public strictfp float dot(final Vector2f llllllllllllIllllllllIIIllIIlIll) {
        return this.x * llllllllllllIllllllllIIIllIIlIll.getX() + this.y * llllllllllllIllllllllIIIllIIlIll.getY();
    }
    
    private static boolean lllllllIlIIIIIl(final int llllllllllllIllllllllIIIIlIIIIIl) {
        return llllllllllllIllllllllIIIIlIIIIIl != 0;
    }
    
    public strictfp void set(final Vector2f llllllllllllIllllllllIIIllIIllll) {
        this.set(llllllllllllIllllllllIIIllIIllll.getX(), llllllllllllIllllllllIIIllIIllll.getY());
        "".length();
    }
    
    public strictfp double getTheta() {
        double llllllllllllIllllllllIIIlllIllII = StrictMath.toDegrees(StrictMath.atan2(this.y, this.x));
        if (!lllllllIIlllIIl(lllllllIIllllII(llllllllllllIllllllllIIIlllIllII, -360.0)) || lllllllIIlllIlI(lllllllIIllllIl(llllllllllllIllllllllIIIlllIllII, 360.0))) {
            llllllllllllIllllllllIIIlllIllII %= 360.0;
        }
        if (lllllllIIlllIll(lllllllIIllllII(llllllllllllIllllllllIIIlllIllII, 0.0))) {
            llllllllllllIllllllllIIIlllIllII += 360.0;
        }
        return llllllllllllIllllllllIIIlllIllII;
    }
    
    public strictfp float getY() {
        return this.y;
    }
    
    public strictfp Vector2f set(final float[] llllllllllllIllllllllIIIlIllIlll) {
        return this.set(llllllllllllIllllllllIIIlIllIlll[Vector2f.lIllIlIlllIllI[0]], llllllllllllIllllllllIIIlIllIlll[Vector2f.lIllIlIlllIllI[1]]);
    }
    
    public strictfp Vector2f negateLocal() {
        this.x = -this.x;
        this.y = -this.y;
        return this;
    }
    
    public strictfp Vector2f getPerpendicular() {
        return new Vector2f(-this.y, this.x);
    }
    
    static {
        lllllllIIllIllI();
        lllllllIIllIIlI();
    }
    
    private static int lllllllIlIIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public strictfp Vector2f add(final Vector2f llllllllllllIllllllllIIIlIlIllIl) {
        this.x += llllllllllllIllllllllIIIlIlIllIl.getX();
        this.y += llllllllllllIllllllllIIIlIlIllIl.getY();
        return this;
    }
    
    private static int lllllllIIllIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void lllllllIIllIIlI() {
        (lIllIlIlllIIlI = new String[Vector2f.lIllIlIlllIllI[6]])[Vector2f.lIllIlIlllIllI[0]] = lllllllIIlIllll("9UfMugK9fW6f1PhyHl4IAw==", "xvFwR");
        Vector2f.lIllIlIlllIIlI[Vector2f.lIllIlIlllIllI[1]] = lllllllIIlIllll("/ylGt/i9pek=", "SZLso");
        Vector2f.lIllIlIlllIIlI[Vector2f.lIllIlIlllIllI[2]] = lllllllIIllIIII("X06J9xqHPj0=", "RzvNA");
        Vector2f.lIllIlIlllIIlI[Vector2f.lIllIlIlllIllI[3]] = lllllllIIlIllll("fpXrE1i5W+A=", "ntTvi");
    }
    
    @Override
    public strictfp boolean equals(final Object llllllllllllIllllllllIIIIlIllllI) {
        if (lllllllIlIIIIIl((llllllllllllIllllllllIIIIlIllllI instanceof Vector2f) ? 1 : 0)) {
            final Vector2f llllllllllllIllllllllIIIIllIIIlI = (Vector2f)llllllllllllIllllllllIIIIlIllllI;
            int n;
            if (lllllllIIllllll(lllllllIlIIIIII(llllllllllllIllllllllIIIIllIIIlI.x, this.x)) && lllllllIIllllll(lllllllIlIIIIII(llllllllllllIllllllllIIIIllIIIlI.y, this.y))) {
                n = Vector2f.lIllIlIlllIllI[1];
                "".length();
                if ((0x1C ^ 0x18) == 0x0) {
                    return ((0x3B ^ 0xA) & ~(0x56 ^ 0x67)) != 0x0;
                }
            }
            else {
                n = Vector2f.lIllIlIlllIllI[0];
            }
            return n != 0;
        }
        return Vector2f.lIllIlIlllIllI[0] != 0;
    }
    
    public strictfp Vector2f scale(final float llllllllllllIllllllllIIIlIIlllll) {
        this.x *= llllllllllllIllllllllIIIlIIlllll;
        this.y *= llllllllllllIllllllllIIIlIIlllll;
        return this;
    }
    
    public Vector2f(final double llllllllllllIllllllllIIlIIIIlIlI) {
        this.x = 1.0f;
        this.y = 0.0f;
        this.setTheta(llllllllllllIllllllllIIlIIIIlIlI);
    }
    
    public Vector2f() {
    }
    
    public strictfp Vector2f normalise() {
        final float llllllllllllIllllllllIIIlIIllIll = this.length();
        if (lllllllIIllllll(lllllllIIlllllI(llllllllllllIllllllllIIIlIIllIll, 0.0f))) {
            return this;
        }
        this.x /= llllllllllllIllllllllIIIlIIllIll;
        this.y /= llllllllllllIllllllllIIIlIIllIll;
        return this;
    }
    
    private static String lllllllIIllIIII(final String llllllllllllIllllllllIIIIlIIIllI, final String llllllllllllIllllllllIIIIlIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllllllllIIIIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllllIIIIlIIIlll.getBytes(StandardCharsets.UTF_8)), Vector2f.lIllIlIlllIllI[7]), "DES");
            final Cipher llllllllllllIllllllllIIIIlIIlIlI = Cipher.getInstance("DES");
            llllllllllllIllllllllIIIIlIIlIlI.init(Vector2f.lIllIlIlllIllI[2], llllllllllllIllllllllIIIIlIIlIll);
            return new String(llllllllllllIllllllllIIIIlIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllllIIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllllIIIIlIIlIIl) {
            llllllllllllIllllllllIIIIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllllIIlllIIl(final int llllllllllllIllllllllIIIIIllllIl) {
        return llllllllllllIllllllllIIIIIllllIl >= 0;
    }
    
    private static boolean lllllllIIllllll(final int llllllllllllIllllllllIIIIIllllll) {
        return llllllllllllIllllllllIIIIIllllll == 0;
    }
    
    public Vector2f(final float llllllllllllIllllllllIIIllIlIllI, final float llllllllllllIllllllllIIIllIllIII) {
        this.x = llllllllllllIllllllllIIIllIlIllI;
        this.y = llllllllllllIllllllllIIIllIllIII;
    }
    
    public strictfp Vector2f sub(final Vector2f llllllllllllIllllllllIIIlIlIIlll) {
        this.x -= llllllllllllIllllllllIIIlIlIIlll.getX();
        this.y -= llllllllllllIllllllllIIIlIlIIlll.getY();
        return this;
    }
    
    public strictfp Vector2f set(final float llllllllllllIllllllllIIIllIIIIIl, final float llllllllllllIllllllllIIIllIIIIll) {
        this.x = llllllllllllIllllllllIIIllIIIIIl;
        this.y = llllllllllllIllllllllIIIllIIIIll;
        return this;
    }
    
    public strictfp Vector2f sub(final double llllllllllllIllllllllIIIllllIIII) {
        this.setTheta(this.getTheta() - llllllllllllIllllllllIIIllllIIII);
        return this;
    }
    
    public Vector2f(final float[] llllllllllllIllllllllIIlIIIlIIII) {
        this.x = llllllllllllIllllllllIIlIIIlIIII[Vector2f.lIllIlIlllIllI[0]];
        this.y = llllllllllllIllllllllIIlIIIlIIII[Vector2f.lIllIlIlllIllI[1]];
    }
    
    public strictfp void projectOntoUnit(final Vector2f llllllllllllIllllllllIIIlIIIIlll, final Vector2f llllllllllllIllllllllIIIlIIIIIlI) {
        final float llllllllllllIllllllllIIIlIIIIlIl = llllllllllllIllllllllIIIlIIIIlll.dot(this);
        llllllllllllIllllllllIIIlIIIIIlI.x = llllllllllllIllllllllIIIlIIIIlIl * llllllllllllIllllllllIIIlIIIIlll.getX();
        llllllllllllIllllllllIIIlIIIIIlI.y = llllllllllllIllllllllIIIlIIIIlIl * llllllllllllIllllllllIIIlIIIIlll.getY();
    }
    
    public strictfp float lengthSquared() {
        return this.x * this.x + this.y * this.y;
    }
    
    private static int lllllllIIlllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void lllllllIIllIllI() {
        (lIllIlIlllIllI = new int[8])[0] = ((0x25 ^ 0x1E) & ~(0x26 ^ 0x1D));
        Vector2f.lIllIlIlllIllI[1] = " ".length();
        Vector2f.lIllIlIlllIllI[2] = "  ".length();
        Vector2f.lIllIlIlllIllI[3] = "   ".length();
        Vector2f.lIllIlIlllIllI[4] = (-(0xFFFFF5FD & 0x6E13) & (0xFFFFEFF5 & 0x77FF));
        Vector2f.lIllIlIlllIllI[5] = (0xFFFFEFDF & 0x13FF);
        Vector2f.lIllIlIlllIllI[6] = (0x1E ^ 0x1A);
        Vector2f.lIllIlIlllIllI[7] = (0x9B ^ 0xA8 ^ (0x7C ^ 0x47));
    }
    
    public strictfp float distance(final Vector2f llllllllllllIllllllllIIIIlllIlll) {
        return (float)Math.sqrt(this.distanceSquared(llllllllllllIllllllllIIIIlllIlll));
    }
    
    public strictfp float getX() {
        return this.x;
    }
    
    public strictfp float distanceSquared(final Vector2f llllllllllllIllllllllIIIIllIlIll) {
        final float llllllllllllIllllllllIIIIllIlllI = llllllllllllIllllllllIIIIllIlIll.getX() - this.getX();
        final float llllllllllllIllllllllIIIIllIllIl = llllllllllllIllllllllIIIIllIlIll.getY() - this.getY();
        return llllllllllllIllllllllIIIIllIlllI * llllllllllllIllllllllIIIIllIlllI + llllllllllllIllllllllIIIIllIllIl * llllllllllllIllllllllIIIIllIllIl;
    }
    
    private static int lllllllIIlllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public strictfp Vector2f getNormal() {
        final Vector2f llllllllllllIllllllllIIIlIIlIlIl = this.copy();
        llllllllllllIllllllllIIIlIIlIlIl.normalise();
        "".length();
        return llllllllllllIllllllllIIIlIIlIlIl;
    }
}
