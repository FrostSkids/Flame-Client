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

public class Line extends Shape
{
    private /* synthetic */ Vector2f closest;
    private /* synthetic */ Vector2f start;
    private /* synthetic */ float lenSquared;
    private /* synthetic */ Vector2f loc;
    private /* synthetic */ Vector2f other;
    private static final /* synthetic */ String[] llIIIIlIllllIl;
    private /* synthetic */ Vector2f vec;
    private static final /* synthetic */ int[] llIIIIllIIIlII;
    private /* synthetic */ Vector2f end;
    private /* synthetic */ Vector2f v2;
    private /* synthetic */ Vector2f v;
    private /* synthetic */ boolean innerEdge;
    private /* synthetic */ Vector2f proj;
    private /* synthetic */ boolean outerEdge;
    
    public Vector2f getEnd() {
        return this.end;
    }
    
    private static boolean lIIIlIIIIIIllllI(final int llllllllllllIlllIllIlIlllllIlllI) {
        return llllllllllllIlllIllIlIlllllIlllI <= 0;
    }
    
    private static void lIIIlIIIIIIIlIll() {
        (llIIIIlIllllIl = new String[Line.llIIIIllIIIlII[4]])[Line.llIIIIllIIIlII[1]] = lIIIlIIIIIIIIllI("QL0MaXijeF0=", "AGJdG");
        Line.llIIIIlIllllIl[Line.llIIIIllIIIlII[0]] = lIIIlIIIIIIIIllI("cThcIuyMq9g=", "YyZPl");
        Line.llIIIIlIllllIl[Line.llIIIIllIIIlII[2]] = lIIIlIIIIIIIlIlI("EsPw8WW7cU0=", "rTkud");
    }
    
    public float lengthSquared() {
        return this.vec.lengthSquared();
    }
    
    public Line(final float llllllllllllIlllIllIllIIlllIIlll, final float llllllllllllIlllIllIllIIlllIIllI, final float llllllllllllIlllIllIllIIlllIlIll, final float llllllllllllIlllIllIllIIlllIlIlI, final boolean llllllllllllIlllIllIllIIlllIlIIl) {
        this(new Vector2f(llllllllllllIlllIllIllIIlllIIlll, llllllllllllIlllIllIllIIlllIIllI), new Vector2f(llllllllllllIlllIllIllIIlllIIlll + llllllllllllIlllIllIllIIlllIlIll, llllllllllllIlllIllIllIIlllIIllI + llllllllllllIlllIllIllIIlllIlIlI));
    }
    
    public boolean intersect(final Line llllllllllllIlllIllIllIIIlIIIIIl, final boolean llllllllllllIlllIllIllIIIIllIIlI, final Vector2f llllllllllllIlllIllIllIIIIllIIIl) {
        final float llllllllllllIlllIllIllIIIIlllllI = this.end.getX() - this.start.getX();
        final float llllllllllllIlllIllIllIIIIllllIl = llllllllllllIlllIllIllIIIlIIIIIl.end.getX() - llllllllllllIlllIllIllIIIlIIIIIl.start.getX();
        final float llllllllllllIlllIllIllIIIIllllII = this.end.getY() - this.start.getY();
        final float llllllllllllIlllIllIllIIIIlllIll = llllllllllllIlllIllIllIIIlIIIIIl.end.getY() - llllllllllllIlllIllIllIIIlIIIIIl.start.getY();
        final float llllllllllllIlllIllIllIIIIlllIlI = llllllllllllIlllIllIllIIIIlllIll * llllllllllllIlllIllIllIIIIlllllI - llllllllllllIlllIllIllIIIIllllIl * llllllllllllIlllIllIllIIIIllllII;
        if (lIIIlIIIIIIllIIl(lIIIlIIIIIIllIlI(llllllllllllIlllIllIllIIIIlllIlI, 0.0f))) {
            return Line.llIIIIllIIIlII[1] != 0;
        }
        float llllllllllllIlllIllIllIIIIlllIIl = llllllllllllIlllIllIllIIIIllllIl * (this.start.getY() - llllllllllllIlllIllIllIIIlIIIIIl.start.getY()) - llllllllllllIlllIllIllIIIIlllIll * (this.start.getX() - llllllllllllIlllIllIllIIIlIIIIIl.start.getX());
        llllllllllllIlllIllIllIIIIlllIIl /= llllllllllllIlllIllIllIIIIlllIlI;
        float llllllllllllIlllIllIllIIIIlllIII = llllllllllllIlllIllIllIIIIlllllI * (this.start.getY() - llllllllllllIlllIllIllIIIlIIIIIl.start.getY()) - llllllllllllIlllIllIllIIIIllllII * (this.start.getX() - llllllllllllIlllIllIllIIIlIIIIIl.start.getX());
        llllllllllllIlllIllIllIIIIlllIII /= llllllllllllIlllIllIllIIIIlllIlI;
        if (lIIIlIIIIIIlllII(llllllllllllIlllIllIllIIIIllIIlI ? 1 : 0) && (!lIIIlIIIIIIlllIl(lIIIlIIIIIIllIll(llllllllllllIlllIllIllIIIIlllIIl, 0.0f)) || !lIIIlIIIIIIllllI(lIIIlIIIIIIllIlI(llllllllllllIlllIllIllIIIIlllIIl, 1.0f)) || !lIIIlIIIIIIlllIl(lIIIlIIIIIIllIll(llllllllllllIlllIllIllIIIIlllIII, 0.0f)) || lIIIlIIIIIIllIII(lIIIlIIIIIIllIlI(llllllllllllIlllIllIllIIIIlllIII, 1.0f)))) {
            return Line.llIIIIllIIIlII[1] != 0;
        }
        final float llllllllllllIlllIllIllIIIIllIlll = llllllllllllIlllIllIllIIIIlllIIl;
        final float llllllllllllIlllIllIllIIIIllIllI = this.start.getX() + llllllllllllIlllIllIllIIIIllIlll * (this.end.getX() - this.start.getX());
        final float llllllllllllIlllIllIllIIIIllIlIl = this.start.getY() + llllllllllllIlllIllIllIIIIllIlll * (this.end.getY() - this.start.getY());
        llllllllllllIlllIllIllIIIIllIIIl.set(llllllllllllIlllIllIllIIIIllIllI, llllllllllllIlllIllIllIIIIllIlIl);
        "".length();
        return Line.llIIIIllIIIlII[0] != 0;
    }
    
    private static int lIIIlIIIIIIllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public Vector2f intersect(final Line llllllllllllIlllIllIllIIIlIlllIl) {
        return this.intersect(llllllllllllIlllIllIllIIIlIlllIl, (boolean)(Line.llIIIIllIIIlII[1] != 0));
    }
    
    public boolean on(final Vector2f llllllllllllIlllIllIllIIIlllllIl) {
        this.getClosestPoint(llllllllllllIlllIllIllIIIlllllIl, this.closest);
        return llllllllllllIlllIllIllIIIlllllIl.equals(this.closest);
    }
    
    @Override
    public float getY() {
        return this.getY1();
    }
    
    public float distance(final Vector2f llllllllllllIlllIllIllIIlIIIIIll) {
        return (float)Math.sqrt(this.distanceSquared(llllllllllllIlllIllIllIIlIIIIIll));
    }
    
    private static boolean lIIIlIIIIIIllIII(final int llllllllllllIlllIllIlIlllllIllII) {
        return llllllllllllIlllIllIlIlllllIllII > 0;
    }
    
    public Line(final Vector2f llllllllllllIlllIllIllIIllIlIIll, final Vector2f llllllllllllIlllIllIllIIllIlIIlI) {
        this.loc = new Vector2f(0.0f, 0.0f);
        this.v = new Vector2f(0.0f, 0.0f);
        this.v2 = new Vector2f(0.0f, 0.0f);
        this.proj = new Vector2f(0.0f, 0.0f);
        this.closest = new Vector2f(0.0f, 0.0f);
        this.other = new Vector2f(0.0f, 0.0f);
        this.outerEdge = (Line.llIIIIllIIIlII[0] != 0);
        this.innerEdge = (Line.llIIIIllIIIlII[0] != 0);
        this.set(llllllllllllIlllIllIllIIllIlIIll, llllllllllllIlllIllIllIIllIlIIlI);
    }
    
    public void set(final Vector2f llllllllllllIlllIllIllIIlIllIlIl, final Vector2f llllllllllllIlllIllIllIIlIllIlll) {
        super.pointsDirty = (Line.llIIIIllIIIlII[0] != 0);
        if (lIIIlIIIIIIlIlII(this.start)) {
            this.start = new Vector2f();
        }
        this.start.set(llllllllllllIlllIllIllIIlIllIlIl);
        if (lIIIlIIIIIIlIlII(this.end)) {
            this.end = new Vector2f();
        }
        this.end.set(llllllllllllIlllIllIllIIlIllIlll);
        this.vec = new Vector2f(llllllllllllIlllIllIllIIlIllIlll);
        this.vec.sub(llllllllllllIlllIllIllIIlIllIlIl);
        "".length();
        this.lenSquared = this.vec.lengthSquared();
    }
    
    public float getDX() {
        return this.end.getX() - this.start.getX();
    }
    
    @Override
    public float getX() {
        return this.getX1();
    }
    
    private static void lIIIlIIIIIIlIIll() {
        (llIIIIllIIIlII = new int[6])[0] = " ".length();
        Line.llIIIIllIIIlII[1] = ((0xFA ^ 0xB5) & ~(0x79 ^ 0x36));
        Line.llIIIIllIIIlII[2] = "  ".length();
        Line.llIIIIllIIIlII[3] = (0x1B ^ 0x1F);
        Line.llIIIIllIIIlII[4] = "   ".length();
        Line.llIIIIllIIIlII[5] = (0xB7 ^ 0xBF);
    }
    
    public void set(final float[] llllllllllllIlllIllIllIIllIIllIl, final float[] llllllllllllIlllIllIllIIllIIllII) {
        this.set(llllllllllllIlllIllIllIIllIIllIl[Line.llIIIIllIIIlII[1]], llllllllllllIlllIllIllIIllIIllIl[Line.llIIIIllIIIlII[0]], llllllllllllIlllIllIllIIllIIllII[Line.llIIIIllIIIlII[1]], llllllllllllIlllIllIllIIllIIllII[Line.llIIIIllIIIlII[0]]);
    }
    
    @Override
    public boolean intersects(final Shape llllllllllllIlllIllIllIIIIIlIllI) {
        if (lIIIlIIIIIIlllII((llllllllllllIlllIllIllIIIIIlIllI instanceof Circle) ? 1 : 0)) {
            return llllllllllllIlllIllIllIIIIIlIllI.intersects(this);
        }
        return super.intersects(llllllllllllIlllIllIllIIIIIlIllI);
    }
    
    public float getX2() {
        return this.end.getX();
    }
    
    public float getY1() {
        return this.start.getY();
    }
    
    public Line(final float[] llllllllllllIlllIllIllIIllIlllll, final float[] llllllllllllIlllIllIllIIllIllIll) {
        this.loc = new Vector2f(0.0f, 0.0f);
        this.v = new Vector2f(0.0f, 0.0f);
        this.v2 = new Vector2f(0.0f, 0.0f);
        this.proj = new Vector2f(0.0f, 0.0f);
        this.closest = new Vector2f(0.0f, 0.0f);
        this.other = new Vector2f(0.0f, 0.0f);
        this.outerEdge = (Line.llIIIIllIIIlII[0] != 0);
        this.innerEdge = (Line.llIIIIllIIIlII[0] != 0);
        this.set(llllllllllllIlllIllIllIIllIlllll, llllllllllllIlllIllIllIIllIllIll);
    }
    
    private static int lIIIlIIIIIIlIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static String lIIIlIIIIIIIIllI(final String llllllllllllIlllIllIllIIIIIIlIlI, final String llllllllllllIlllIllIllIIIIIIlIll) {
        try {
            final SecretKeySpec llllllllllllIlllIllIllIIIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIllIIIIIIlIll.getBytes(StandardCharsets.UTF_8)), Line.llIIIIllIIIlII[5]), "DES");
            final Cipher llllllllllllIlllIllIllIIIIIIlllI = Cipher.getInstance("DES");
            llllllllllllIlllIllIllIIIIIIlllI.init(Line.llIIIIllIIIlII[2], llllllllllllIlllIllIllIIIIIIllll);
            return new String(llllllllllllIlllIllIllIIIIIIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIllIIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIllIIIIIIllIl) {
            llllllllllllIlllIllIllIIIIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static int lIIIlIIIIIIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIlIIIIIIlllII(final int llllllllllllIlllIllIlIllllllIllI) {
        return llllllllllllIlllIllIlIllllllIllI != 0;
    }
    
    private static boolean lIIIlIIIIIIlllIl(final int llllllllllllIlllIllIlIllllllIIlI) {
        return llllllllllllIlllIllIlIllllllIIlI >= 0;
    }
    
    private static boolean lIIIlIIIIIIllIIl(final int llllllllllllIlllIllIlIllllllIlII) {
        return llllllllllllIlllIllIlIllllllIlII == 0;
    }
    
    private static int lIIIlIIIIIIlIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void set(final float llllllllllllIlllIllIllIIlIlIIlII, final float llllllllllllIlllIllIllIIlIlIIIll, final float llllllllllllIlllIllIllIIlIlIlIIl, final float llllllllllllIlllIllIllIIlIlIIIIl) {
        super.pointsDirty = (Line.llIIIIllIIIlII[0] != 0);
        this.start.set(llllllllllllIlllIllIllIIlIlIIlII, llllllllllllIlllIllIllIIlIlIIIll);
        "".length();
        this.end.set(llllllllllllIlllIllIllIIlIlIlIIl, llllllllllllIlllIllIllIIlIlIIIIl);
        "".length();
        final float llllllllllllIlllIllIllIIlIlIIlll = llllllllllllIlllIllIllIIlIlIlIIl - llllllllllllIlllIllIllIIlIlIIlII;
        final float llllllllllllIlllIllIllIIlIlIIllI = llllllllllllIlllIllIllIIlIlIIIIl - llllllllllllIlllIllIllIIlIlIIIll;
        this.vec.set(llllllllllllIlllIllIllIIlIlIIlll, llllllllllllIlllIllIllIIlIlIIllI);
        "".length();
        this.lenSquared = llllllllllllIlllIllIllIIlIlIIlll * llllllllllllIlllIllIllIIlIlIIlll + llllllllllllIlllIllIllIIlIlIIllI * llllllllllllIlllIllIllIIlIlIIllI;
    }
    
    public Vector2f getStart() {
        return this.start;
    }
    
    public Line(final float llllllllllllIlllIllIllIIllllIlll, final float llllllllllllIlllIllIllIIlllllIll, final float llllllllllllIlllIllIllIIllllIlIl, final float llllllllllllIlllIllIllIIlllllIIl) {
        this(new Vector2f(llllllllllllIlllIllIllIIllllIlll, llllllllllllIlllIllIllIIlllllIll), new Vector2f(llllllllllllIlllIllIllIIllllIlIl, llllllllllllIlllIllIllIIlllllIIl));
    }
    
    public float getY2() {
        return this.end.getY();
    }
    
    private static boolean lIIIlIIIIIIlIlII(final Object llllllllllllIlllIllIlIlllllllIII) {
        return llllllllllllIlllIllIlIlllllllIII == null;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(Line.llIIIIlIllllIl[Line.llIIIIllIIIlII[1]]).append(this.start).append(Line.llIIIIlIllllIl[Line.llIIIIllIIIlII[0]]).append(this.end).append(Line.llIIIIlIllllIl[Line.llIIIIllIIIlII[2]]));
    }
    
    public float getDY() {
        return this.end.getY() - this.start.getY();
    }
    
    private static boolean lIIIlIIIIIIlIlll(final int llllllllllllIlllIllIlIllllllIIII) {
        return llllllllllllIlllIllIlIllllllIIII < 0;
    }
    
    public Line(final float llllllllllllIlllIllIllIlIIIIIlll, final float llllllllllllIlllIllIllIlIIIIIIll) {
        this(llllllllllllIlllIllIllIlIIIIIlll, llllllllllllIlllIllIllIlIIIIIIll, (boolean)(Line.llIIIIllIIIlII[0] != 0), (boolean)(Line.llIIIIllIIIlII[0] != 0));
    }
    
    public float distanceSquared(final Vector2f llllllllllllIlllIllIllIIIlllIIll) {
        this.getClosestPoint(llllllllllllIlllIllIllIIIlllIIll, this.closest);
        this.closest.sub(llllllllllllIlllIllIllIIIlllIIll);
        "".length();
        final float llllllllllllIlllIllIllIIIlllIlIl = this.closest.lengthSquared();
        return llllllllllllIlllIllIllIIIlllIlIl;
    }
    
    public Vector2f intersect(final Line llllllllllllIlllIllIllIIIlIlIlll, final boolean llllllllllllIlllIllIllIIIlIlIIlI) {
        final Vector2f llllllllllllIlllIllIllIIIlIlIlIl = new Vector2f();
        if (lIIIlIIIIIIllIIl(this.intersect(llllllllllllIlllIllIllIIIlIlIlll, llllllllllllIlllIllIllIIIlIlIIlI, llllllllllllIlllIllIllIIIlIlIlIl) ? 1 : 0)) {
            return null;
        }
        return llllllllllllIlllIllIllIIIlIlIlIl;
    }
    
    public float length() {
        return this.vec.length();
    }
    
    public Line(final float llllllllllllIlllIllIllIlIIIIllIl, final float llllllllllllIlllIllIllIlIIIIllII, final boolean llllllllllllIlllIllIllIlIIIlIIII, final boolean llllllllllllIlllIllIllIlIIIIllll) {
        this(0.0f, 0.0f, llllllllllllIlllIllIllIlIIIIllIl, llllllllllllIlllIllIllIlIIIIllII);
    }
    
    @Override
    protected void createPoints() {
        this.points = new float[Line.llIIIIllIIIlII[3]];
        this.points[Line.llIIIIllIIIlII[1]] = this.getX1();
        this.points[Line.llIIIIllIIIlII[0]] = this.getY1();
        this.points[Line.llIIIIllIIIlII[2]] = this.getX2();
        this.points[Line.llIIIIllIIIlII[4]] = this.getY2();
    }
    
    public void getClosestPoint(final Vector2f llllllllllllIlllIllIllIIIllIlIII, final Vector2f llllllllllllIlllIllIllIIIllIlIll) {
        this.loc.set(llllllllllllIlllIllIllIIIllIlIII);
        this.loc.sub(this.start);
        "".length();
        float llllllllllllIlllIllIllIIIllIlIlI = this.vec.dot(this.loc);
        llllllllllllIlllIllIllIIIllIlIlI /= this.vec.lengthSquared();
        if (lIIIlIIIIIIlIlll(lIIIlIIIIIIlIlIl(llllllllllllIlllIllIllIIIllIlIlI, 0.0f))) {
            llllllllllllIlllIllIllIIIllIlIll.set(this.start);
            return;
        }
        if (lIIIlIIIIIIllIII(lIIIlIIIIIIlIllI(llllllllllllIlllIllIllIIIllIlIlI, 1.0f))) {
            llllllllllllIlllIllIllIIIllIlIll.set(this.end);
            return;
        }
        llllllllllllIlllIllIllIIIllIlIll.x = this.start.getX() + llllllllllllIlllIllIllIIIllIlIlI * this.vec.getX();
        llllllllllllIlllIllIllIIIllIlIll.y = this.start.getY() + llllllllllllIlllIllIllIIIllIlIlI * this.vec.getY();
    }
    
    static {
        lIIIlIIIIIIlIIll();
        lIIIlIIIIIIIlIll();
    }
    
    @Override
    public boolean closed() {
        return Line.llIIIIllIIIlII[1] != 0;
    }
    
    private static String lIIIlIIIIIIIlIlI(final String llllllllllllIlllIllIlIllllllllll, final String llllllllllllIlllIllIlIllllllllII) {
        try {
            final SecretKeySpec llllllllllllIlllIllIllIIIIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIlIllllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIllIIIIIIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIllIIIIIIIIIl.init(Line.llIIIIllIIIlII[2], llllllllllllIlllIllIllIIIIIIIIlI);
            return new String(llllllllllllIlllIllIllIIIIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIlIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIllIIIIIIIIII) {
            llllllllllllIlllIllIllIIIIIIIIII.printStackTrace();
            return null;
        }
    }
    
    public float getX1() {
        return this.start.getX();
    }
    
    @Override
    public Shape transform(final Transform llllllllllllIlllIllIllIIIIIlllII) {
        final float[] llllllllllllIlllIllIllIIIIIllllI = new float[Line.llIIIIllIIIlII[3]];
        this.createPoints();
        llllllllllllIlllIllIllIIIIIlllII.transform(this.points, Line.llIIIIllIIIlII[1], llllllllllllIlllIllIllIIIIIllllI, Line.llIIIIllIIIlII[1], Line.llIIIIllIIIlII[2]);
        return new Line(llllllllllllIlllIllIllIIIIIllllI[Line.llIIIIllIIIlII[1]], llllllllllllIlllIllIllIIIIIllllI[Line.llIIIIllIIIlII[0]], llllllllllllIlllIllIllIIIIIllllI[Line.llIIIIllIIIlII[2]], llllllllllllIlllIllIllIIIIIllllI[Line.llIIIIllIIIlII[4]]);
    }
}
