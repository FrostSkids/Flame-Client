// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import java.util.ArrayList;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class BasicTriangulator implements Triangulator
{
    private static final /* synthetic */ int[] lIIIIlIlIIIlII;
    private static final /* synthetic */ String[] lIIIIlIIlIllII;
    private /* synthetic */ PointList tris;
    private /* synthetic */ boolean tried;
    private /* synthetic */ PointList poly;
    
    public float[] getPolyPoint(final int lllllllllllllIlIIlIlllIllIlIIIll) {
        final float[] array = new float[BasicTriangulator.lIIIIlIlIIIlII[0]];
        array[BasicTriangulator.lIIIIlIlIIIlII[1]] = this.poly.get(lllllllllllllIlIIlIlllIllIlIIIll).x;
        array[BasicTriangulator.lIIIIlIlIIIlII[2]] = this.poly.get(lllllllllllllIlIIlIlllIllIlIIIll).y;
        return array;
    }
    
    private static boolean lIlllIIlIlIlIlI(final int lllllllllllllIlIIlIlllIIlIIlIIIl) {
        return lllllllllllllIlIIlIlllIIlIIlIIIl < 0;
    }
    
    private boolean snip(final PointList lllllllllllllIlIIlIlllIlIIIlIIll, final int lllllllllllllIlIIlIlllIlIIIlIIlI, final int lllllllllllllIlIIlIlllIlIIIlllll, final int lllllllllllllIlIIlIlllIlIIIlIIII, final int lllllllllllllIlIIlIlllIlIIIIllll, final int[] lllllllllllllIlIIlIlllIlIIIlllII) {
        final float lllllllllllllIlIIlIlllIlIIIllIlI = lllllllllllllIlIIlIlllIlIIIlIIll.get(lllllllllllllIlIIlIlllIlIIIlllII[lllllllllllllIlIIlIlllIlIIIlIIlI]).getX();
        final float lllllllllllllIlIIlIlllIlIIIllIIl = lllllllllllllIlIIlIlllIlIIIlIIll.get(lllllllllllllIlIIlIlllIlIIIlllII[lllllllllllllIlIIlIlllIlIIIlIIlI]).getY();
        final float lllllllllllllIlIIlIlllIlIIIllIII = lllllllllllllIlIIlIlllIlIIIlIIll.get(lllllllllllllIlIIlIlllIlIIIlllII[lllllllllllllIlIIlIlllIlIIIlllll]).getX();
        final float lllllllllllllIlIIlIlllIlIIIlIlll = lllllllllllllIlIIlIlllIlIIIlIIll.get(lllllllllllllIlIIlIlllIlIIIlllII[lllllllllllllIlIIlIlllIlIIIlllll]).getY();
        final float lllllllllllllIlIIlIlllIlIIIlIllI = lllllllllllllIlIIlIlllIlIIIlIIll.get(lllllllllllllIlIIlIlllIlIIIlllII[lllllllllllllIlIIlIlllIlIIIlIIII]).getX();
        final float lllllllllllllIlIIlIlllIlIIIlIlIl = lllllllllllllIlIIlIlllIlIIIlIIll.get(lllllllllllllIlIIlIlllIlIIIlllII[lllllllllllllIlIIlIlllIlIIIlIIII]).getY();
        if (lIlllIIlIlIIlIl(lIlllIIlIlIIlII(1.0E-10f, (lllllllllllllIlIIlIlllIlIIIllIII - lllllllllllllIlIIlIlllIlIIIllIlI) * (lllllllllllllIlIIlIlllIlIIIlIlIl - lllllllllllllIlIIlIlllIlIIIllIIl) - (lllllllllllllIlIIlIlllIlIIIlIlll - lllllllllllllIlIIlIlllIlIIIllIIl) * (lllllllllllllIlIIlIlllIlIIIlIllI - lllllllllllllIlIIlIlllIlIIIllIlI)))) {
            return BasicTriangulator.lIIIIlIlIIIlII[1] != 0;
        }
        int lllllllllllllIlIIlIlllIlIIIllIll = BasicTriangulator.lIIIIlIlIIIlII[1];
        while (lIlllIIlIlIIIIl(lllllllllllllIlIIlIlllIlIIIllIll, lllllllllllllIlIIlIlllIlIIIIllll)) {
            if (lIlllIIlIlIIllI(lllllllllllllIlIIlIlllIlIIIllIll, lllllllllllllIlIIlIlllIlIIIlIIlI) && lIlllIIlIlIIllI(lllllllllllllIlIIlIlllIlIIIllIll, lllllllllllllIlIIlIlllIlIIIlllll)) {
                if (lIlllIIlIlIIlll(lllllllllllllIlIIlIlllIlIIIllIll, lllllllllllllIlIIlIlllIlIIIlIIII)) {
                    "".length();
                    if (null != null) {
                        return ((0x21 ^ 0x7A ^ (0xFB ^ 0x9C)) & (0xCD ^ 0x87 ^ (0xD6 ^ 0xA0) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    final float lllllllllllllIlIIlIlllIlIIlIIlII = lllllllllllllIlIIlIlllIlIIIlIIll.get(lllllllllllllIlIIlIlllIlIIIlllII[lllllllllllllIlIIlIlllIlIIIllIll]).getX();
                    final float lllllllllllllIlIIlIlllIlIIlIIIll = lllllllllllllIlIIlIlllIlIIIlIIll.get(lllllllllllllIlIIlIlllIlIIIlllII[lllllllllllllIlIIlIlllIlIIIllIll]).getY();
                    if (lIlllIIlIlIlIII(this.insideTriangle(lllllllllllllIlIIlIlllIlIIIllIlI, lllllllllllllIlIIlIlllIlIIIllIIl, lllllllllllllIlIIlIlllIlIIIllIII, lllllllllllllIlIIlIlllIlIIIlIlll, lllllllllllllIlIIlIlllIlIIIlIllI, lllllllllllllIlIIlIlllIlIIIlIlIl, lllllllllllllIlIIlIlllIlIIlIIlII, lllllllllllllIlIIlIlllIlIIlIIIll) ? 1 : 0)) {
                        return BasicTriangulator.lIIIIlIlIIIlII[1] != 0;
                    }
                }
            }
            ++lllllllllllllIlIIlIlllIlIIIllIll;
            "".length();
            if (-" ".length() > 0) {
                return ((0x54 ^ 0x34 ^ (0xB0 ^ 0x95)) & (0x46 ^ 0x50 ^ (0x5 ^ 0x56) ^ -" ".length())) != 0x0;
            }
        }
        return BasicTriangulator.lIIIIlIlIIIlII[2] != 0;
    }
    
    private static boolean lIlllIIlIlIlIII(final int lllllllllllllIlIIlIlllIIlIIlIlll) {
        return lllllllllllllIlIIlIlllIIlIIlIlll != 0;
    }
    
    private static boolean lIlllIIlIlIlIll(final int lllllllllllllIlIIlIlllIIlIIllIlI, final int lllllllllllllIlIIlIlllIIlIIllIIl) {
        return lllllllllllllIlIIlIlllIIlIIllIlI > lllllllllllllIlIIlIlllIIlIIllIIl;
    }
    
    public float[] getTrianglePoint(final int lllllllllllllIlIIlIlllIllIIlIlIl, final int lllllllllllllIlIIlIlllIllIIlIlII) {
        if (lIlllIIlIlIIIII(this.tried ? 1 : 0)) {
            throw new RuntimeException(BasicTriangulator.lIIIIlIIlIllII[BasicTriangulator.lIIIIlIlIIIlII[2]]);
        }
        return this.tris.get(lllllllllllllIlIIlIlllIllIIlIlIl * BasicTriangulator.lIIIIlIlIIIlII[3] + lllllllllllllIlIIlIlllIllIIlIlII).toArray();
    }
    
    public BasicTriangulator() {
        this.poly = new PointList();
        this.tris = new PointList();
    }
    
    private static boolean lIlllIIlIlIllIl(final int lllllllllllllIlIIlIlllIIlIIllllI, final int lllllllllllllIlIIlIlllIIlIIlllIl) {
        return lllllllllllllIlIIlIlllIIlIIllllI <= lllllllllllllIlIIlIlllIIlIIlllIl;
    }
    
    public int getTriangleCount() {
        if (lIlllIIlIlIIIII(this.tried ? 1 : 0)) {
            throw new RuntimeException(BasicTriangulator.lIIIIlIIlIllII[BasicTriangulator.lIIIIlIlIIIlII[1]]);
        }
        return this.tris.size() / BasicTriangulator.lIIIIlIlIIIlII[3];
    }
    
    private static boolean lIlllIIlIlIllII(final int lllllllllllllIlIIlIlllIIlIlIIllI, final int lllllllllllllIlIIlIlllIIlIlIIlIl) {
        return lllllllllllllIlIIlIlllIIlIlIIllI >= lllllllllllllIlIIlIlllIIlIlIIlIl;
    }
    
    public boolean triangulate() {
        this.tried = (BasicTriangulator.lIIIIlIlIIIlII[2] != 0);
        final boolean lllllllllllllIlIIlIlllIllIIlllll = this.process(this.poly, this.tris);
        return lllllllllllllIlIIlIlllIllIIlllll;
    }
    
    private static int lIlllIIlIlIlIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private float area(final PointList lllllllllllllIlIIlIlllIllIIIIlII) {
        final int lllllllllllllIlIIlIlllIllIIIIIll = lllllllllllllIlIIlIlllIllIIIIlII.size();
        float lllllllllllllIlIIlIlllIllIIIIIlI = 0.0f;
        int lllllllllllllIlIIlIlllIllIIIIlll = lllllllllllllIlIIlIlllIllIIIIIll - BasicTriangulator.lIIIIlIlIIIlII[2];
        int lllllllllllllIlIIlIlllIllIIIIllI = BasicTriangulator.lIIIIlIlIIIlII[1];
        while (lIlllIIlIlIIIIl(lllllllllllllIlIIlIlllIllIIIIllI, lllllllllllllIlIIlIlllIllIIIIIll)) {
            final Point lllllllllllllIlIIlIlllIllIIIlIIl = lllllllllllllIlIIlIlllIllIIIIlII.get(lllllllllllllIlIIlIlllIllIIIIlll);
            final Point lllllllllllllIlIIlIlllIllIIIlIII = lllllllllllllIlIIlIlllIllIIIIlII.get(lllllllllllllIlIIlIlllIllIIIIllI);
            lllllllllllllIlIIlIlllIllIIIIIlI += lllllllllllllIlIIlIlllIllIIIlIIl.getX() * lllllllllllllIlIIlIlllIllIIIlIII.getY() - lllllllllllllIlIIlIlllIllIIIlIII.getX() * lllllllllllllIlIIlIlllIllIIIlIIl.getY();
            lllllllllllllIlIIlIlllIllIIIIlll = lllllllllllllIlIIlIlllIllIIIIllI++;
            "".length();
            if (((0x80 ^ 0xAE ^ (0x6A ^ 0x1E)) & (24 + 162 - 128 + 189 ^ 91 + 134 - 189 + 137 ^ -" ".length())) == " ".length()) {
                return 0.0f;
            }
        }
        return lllllllllllllIlIIlIlllIllIIIIIlI * 0.5f;
    }
    
    private static int lIlllIIlIlIIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private boolean insideTriangle(final float lllllllllllllIlIIlIlllIlIllIIIlI, final float lllllllllllllIlIIlIlllIlIllIIIIl, final float lllllllllllllIlIIlIlllIlIllIIIII, final float lllllllllllllIlIIlIlllIlIlIlllll, final float lllllllllllllIlIIlIlllIlIlIIIlll, final float lllllllllllllIlIIlIlllIlIlIlllIl, final float lllllllllllllIlIIlIlllIlIlIlllII, final float lllllllllllllIlIIlIlllIlIlIllIll) {
        final float lllllllllllllIlIIlIlllIlIlIllIlI = lllllllllllllIlIIlIlllIlIlIIIlll - lllllllllllllIlIIlIlllIlIllIIIII;
        final float lllllllllllllIlIIlIlllIlIlIllIIl = lllllllllllllIlIIlIlllIlIlIlllIl - lllllllllllllIlIIlIlllIlIlIlllll;
        final float lllllllllllllIlIIlIlllIlIlIllIII = lllllllllllllIlIIlIlllIlIllIIIlI - lllllllllllllIlIIlIlllIlIlIIIlll;
        final float lllllllllllllIlIIlIlllIlIlIlIlll = lllllllllllllIlIIlIlllIlIllIIIIl - lllllllllllllIlIIlIlllIlIlIlllIl;
        final float lllllllllllllIlIIlIlllIlIlIlIllI = lllllllllllllIlIIlIlllIlIllIIIII - lllllllllllllIlIIlIlllIlIllIIIlI;
        final float lllllllllllllIlIIlIlllIlIlIlIlIl = lllllllllllllIlIIlIlllIlIlIlllll - lllllllllllllIlIIlIlllIlIllIIIIl;
        final float lllllllllllllIlIIlIlllIlIlIlIlII = lllllllllllllIlIIlIlllIlIlIlllII - lllllllllllllIlIIlIlllIlIllIIIlI;
        final float lllllllllllllIlIIlIlllIlIlIlIIll = lllllllllllllIlIIlIlllIlIlIllIll - lllllllllllllIlIIlIlllIlIllIIIIl;
        final float lllllllllllllIlIIlIlllIlIlIlIIlI = lllllllllllllIlIIlIlllIlIlIlllII - lllllllllllllIlIIlIlllIlIllIIIII;
        final float lllllllllllllIlIIlIlllIlIlIlIIIl = lllllllllllllIlIIlIlllIlIlIllIll - lllllllllllllIlIIlIlllIlIlIlllll;
        final float lllllllllllllIlIIlIlllIlIlIlIIII = lllllllllllllIlIIlIlllIlIlIlllII - lllllllllllllIlIIlIlllIlIlIIIlll;
        final float lllllllllllllIlIIlIlllIlIlIIllll = lllllllllllllIlIIlIlllIlIlIllIll - lllllllllllllIlIIlIlllIlIlIlllIl;
        final float lllllllllllllIlIIlIlllIlIlIIllII = lllllllllllllIlIIlIlllIlIlIllIlI * lllllllllllllIlIIlIlllIlIlIlIIIl - lllllllllllllIlIIlIlllIlIlIllIIl * lllllllllllllIlIIlIlllIlIlIlIIlI;
        final float lllllllllllllIlIIlIlllIlIlIIlllI = lllllllllllllIlIIlIlllIlIlIlIllI * lllllllllllllIlIIlIlllIlIlIlIIll - lllllllllllllIlIIlIlllIlIlIlIlIl * lllllllllllllIlIIlIlllIlIlIlIlII;
        final float lllllllllllllIlIIlIlllIlIlIIllIl = lllllllllllllIlIIlIlllIlIlIllIII * lllllllllllllIlIIlIlllIlIlIIllll - lllllllllllllIlIIlIlllIlIlIlIlll * lllllllllllllIlIIlIlllIlIlIlIIII;
        int n;
        if (lIlllIIlIlIIIll(lIlllIIlIlIIIlI(lllllllllllllIlIIlIlllIlIlIIllII, 0.0f)) && lIlllIIlIlIIIll(lIlllIIlIlIIIlI(lllllllllllllIlIIlIlllIlIlIIllIl, 0.0f)) && lIlllIIlIlIIIll(lIlllIIlIlIIIlI(lllllllllllllIlIIlIlllIlIlIIlllI, 0.0f))) {
            n = BasicTriangulator.lIIIIlIlIIIlII[2];
            "".length();
            if (("   ".length() ^ (0xAE ^ 0xA9)) > (0xC9 ^ 0x80 ^ (0x54 ^ 0x19))) {
                return ((0x3F ^ 0x49 ^ (0x54 ^ 0x3C)) & (0x27 ^ 0xC ^ (0x98 ^ 0xAD) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BasicTriangulator.lIIIIlIlIIIlII[1];
        }
        return n != 0;
    }
    
    private static boolean lIlllIIlIlIIlll(final int lllllllllllllIlIIlIlllIIlIlIlIlI, final int lllllllllllllIlIIlIlllIIlIlIlIIl) {
        return lllllllllllllIlIIlIlllIIlIlIlIlI == lllllllllllllIlIIlIlllIIlIlIlIIl;
    }
    
    private static boolean lIlllIIlIlIIlIl(final int lllllllllllllIlIIlIlllIIlIIIllll) {
        return lllllllllllllIlIIlIlllIIlIIIllll > 0;
    }
    
    public void addPolyPoint(final float lllllllllllllIlIIlIlllIllIllIIlI, final float lllllllllllllIlIIlIlllIllIllIIIl) {
        final Point lllllllllllllIlIIlIlllIllIllIIII = new Point(lllllllllllllIlIIlIlllIllIllIIlI, lllllllllllllIlIIlIlllIllIllIIIl);
        if (lIlllIIlIlIIIII(this.poly.contains(lllllllllllllIlIIlIlllIllIllIIII) ? 1 : 0)) {
            this.poly.add(lllllllllllllIlIIlIlllIllIllIIII);
        }
    }
    
    private static String lIlllIIIlIlIllI(final String lllllllllllllIlIIlIlllIIllIIlIII, final String lllllllllllllIlIIlIlllIIllIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlllIIllIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlllIIllIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlllIIllIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlllIIllIIllII.init(BasicTriangulator.lIIIIlIlIIIlII[0], lllllllllllllIlIIlIlllIIllIIllIl);
            return new String(lllllllllllllIlIIlIlllIIllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlllIIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlllIIllIIlIll) {
            lllllllllllllIlIIlIlllIIllIIlIll.printStackTrace();
            return null;
        }
    }
    
    public int getPolyPointCount() {
        return this.poly.size();
    }
    
    public void startHole() {
    }
    
    private static void lIlllIIIlIlllll() {
        (lIIIIlIIlIllII = new String[BasicTriangulator.lIIIIlIlIIIlII[0]])[BasicTriangulator.lIIIIlIlIIIlII[1]] = lIlllIIIlIlIlIl("NDINK3cDIQgmORAmDSYjEntIZzUSNQ41MlcyAiQyBCAIKTBXJxMuNhk0DSIk", "wSaGW");
        BasicTriangulator.lIIIIlIIlIllII[BasicTriangulator.lIIIIlIlIIIlII[2]] = lIlllIIIlIlIllI("3ENCKH88yOqj/OP2G3OE3rNWZDryTUoZeXwOCtFoYLNS7uBf+aqmsDS3IiJRHYsa", "CmFze");
    }
    
    private static boolean lIlllIIlIlIIIIl(final int lllllllllllllIlIIlIlllIIlIlIIIlI, final int lllllllllllllIlIIlIlllIIlIlIIIIl) {
        return lllllllllllllIlIIlIlllIIlIlIIIlI < lllllllllllllIlIIlIlllIIlIlIIIIl;
    }
    
    private static int lIlllIIlIlIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIlllIIlIIlllll() {
        (lIIIIlIlIIIlII = new int[4])[0] = "  ".length();
        BasicTriangulator.lIIIIlIlIIIlII[1] = ((0x45 ^ 0x54) & ~(0x38 ^ 0x29));
        BasicTriangulator.lIIIIlIlIIIlII[2] = " ".length();
        BasicTriangulator.lIIIIlIlIIIlII[3] = "   ".length();
    }
    
    private static String lIlllIIIlIlIlIl(String lllllllllllllIlIIlIlllIIlIllIlIl, final String lllllllllllllIlIIlIlllIIlIlllIIl) {
        lllllllllllllIlIIlIlllIIlIllIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIlllIIlIllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIlllIIlIlllIII = new StringBuilder();
        final char[] lllllllllllllIlIIlIlllIIlIllIlll = lllllllllllllIlIIlIlllIIlIlllIIl.toCharArray();
        int lllllllllllllIlIIlIlllIIlIllIllI = BasicTriangulator.lIIIIlIlIIIlII[1];
        final float lllllllllllllIlIIlIlllIIlIllIIII = (Object)lllllllllllllIlIIlIlllIIlIllIlIl.toCharArray();
        final int lllllllllllllIlIIlIlllIIlIlIllll = lllllllllllllIlIIlIlllIIlIllIIII.length;
        String lllllllllllllIlIIlIlllIIlIlIlllI = (String)BasicTriangulator.lIIIIlIlIIIlII[1];
        while (lIlllIIlIlIIIIl((int)lllllllllllllIlIIlIlllIIlIlIlllI, lllllllllllllIlIIlIlllIIlIlIllll)) {
            final char lllllllllllllIlIIlIlllIIlIlllIll = lllllllllllllIlIIlIlllIIlIllIIII[lllllllllllllIlIIlIlllIIlIlIlllI];
            lllllllllllllIlIIlIlllIIlIlllIII.append((char)(lllllllllllllIlIIlIlllIIlIlllIll ^ lllllllllllllIlIIlIlllIIlIllIlll[lllllllllllllIlIIlIlllIIlIllIllI % lllllllllllllIlIIlIlllIIlIllIlll.length]));
            "".length();
            ++lllllllllllllIlIIlIlllIIlIllIllI;
            ++lllllllllllllIlIIlIlllIIlIlIlllI;
            "".length();
            if (((0x37 ^ 0x2E) & ~(0x3C ^ 0x25)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIlllIIlIlllIII);
    }
    
    private static boolean lIlllIIlIlIIllI(final int lllllllllllllIlIIlIlllIIlIIIllII, final int lllllllllllllIlIIlIlllIIlIIIlIll) {
        return lllllllllllllIlIIlIlllIIlIIIllII != lllllllllllllIlIIlIlllIIlIIIlIll;
    }
    
    private boolean process(final PointList lllllllllllllIlIIlIlllIIlllIIIIl, final PointList lllllllllllllIlIIlIlllIIlllIIIII) {
        lllllllllllllIlIIlIlllIIlllIIIII.clear();
        final int lllllllllllllIlIIlIlllIIlllIIllI = lllllllllllllIlIIlIlllIIlllIIIIl.size();
        if (lIlllIIlIlIIIIl(lllllllllllllIlIIlIlllIIlllIIllI, BasicTriangulator.lIIIIlIlIIIlII[3])) {
            return BasicTriangulator.lIIIIlIlIIIlII[1] != 0;
        }
        final int[] lllllllllllllIlIIlIlllIIlllIIlIl = new int[lllllllllllllIlIIlIlllIIlllIIllI];
        if (lIlllIIlIlIlIlI(lIlllIIlIlIlIIl(0.0f, this.area(lllllllllllllIlIIlIlllIIlllIIIIl)))) {
            int lllllllllllllIlIIlIlllIIllllIlII = BasicTriangulator.lIIIIlIlIIIlII[1];
            while (lIlllIIlIlIIIIl(lllllllllllllIlIIlIlllIIllllIlII, lllllllllllllIlIIlIlllIIlllIIllI)) {
                lllllllllllllIlIIlIlllIIlllIIlIl[lllllllllllllIlIIlIlllIIllllIlII] = lllllllllllllIlIIlIlllIIllllIlII;
                ++lllllllllllllIlIIlIlllIIllllIlII;
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return ((57 + 59 + 23 + 114 ^ 160 + 86 - 171 + 116) & (0x6C ^ 0x19 ^ (0x66 ^ 0x51) ^ -" ".length())) != 0x0;
                }
            }
            "".length();
            if ("  ".length() < " ".length()) {
                return ((0x4A ^ 0x19) & ~(0x37 ^ 0x64)) != 0x0;
            }
        }
        else {
            int lllllllllllllIlIIlIlllIIllllIIll = BasicTriangulator.lIIIIlIlIIIlII[1];
            while (lIlllIIlIlIIIIl(lllllllllllllIlIIlIlllIIllllIIll, lllllllllllllIlIIlIlllIIlllIIllI)) {
                lllllllllllllIlIIlIlllIIlllIIlIl[lllllllllllllIlIIlIlllIIllllIIll] = lllllllllllllIlIIlIlllIIlllIIllI - BasicTriangulator.lIIIIlIlIIIlII[2] - lllllllllllllIlIIlIlllIIllllIIll;
                ++lllllllllllllIlIIlIlllIIllllIIll;
                "".length();
                if (null != null) {
                    return ((0xF0 ^ 0xB5 ^ (0xFA ^ 0xA5)) & (0x90 ^ 0x86 ^ (0xE ^ 0x2) ^ -" ".length())) != 0x0;
                }
            }
        }
        int lllllllllllllIlIIlIlllIIlllIIlII = lllllllllllllIlIIlIlllIIlllIIllI;
        int lllllllllllllIlIIlIlllIIlllIIIll = BasicTriangulator.lIIIIlIlIIIlII[0] * lllllllllllllIlIIlIlllIIlllIIlII;
        int lllllllllllllIlIIlIlllIIlllIlIll = BasicTriangulator.lIIIIlIlIIIlII[1];
        int lllllllllllllIlIIlIlllIIlllIlIlI = lllllllllllllIlIIlIlllIIlllIIlII - BasicTriangulator.lIIIIlIlIIIlII[2];
        while (lIlllIIlIlIlIll(lllllllllllllIlIIlIlllIIlllIIlII, BasicTriangulator.lIIIIlIlIIIlII[0])) {
            if (lIlllIIlIlIllII(BasicTriangulator.lIIIIlIlIIIlII[1], lllllllllllllIlIIlIlllIIlllIIIll--)) {
                return BasicTriangulator.lIIIIlIlIIIlII[1] != 0;
            }
            int lllllllllllllIlIIlIlllIIlllIllIl = lllllllllllllIlIIlIlllIIlllIlIlI;
            if (lIlllIIlIlIllIl(lllllllllllllIlIIlIlllIIlllIIlII, lllllllllllllIlIIlIlllIIlllIllIl)) {
                lllllllllllllIlIIlIlllIIlllIllIl = BasicTriangulator.lIIIIlIlIIIlII[1];
            }
            lllllllllllllIlIIlIlllIIlllIlIlI = lllllllllllllIlIIlIlllIIlllIllIl + BasicTriangulator.lIIIIlIlIIIlII[2];
            if (lIlllIIlIlIllIl(lllllllllllllIlIIlIlllIIlllIIlII, lllllllllllllIlIIlIlllIIlllIlIlI)) {
                lllllllllllllIlIIlIlllIIlllIlIlI = BasicTriangulator.lIIIIlIlIIIlII[1];
            }
            int lllllllllllllIlIIlIlllIIlllIllII = lllllllllllllIlIIlIlllIIlllIlIlI + BasicTriangulator.lIIIIlIlIIIlII[2];
            if (lIlllIIlIlIllIl(lllllllllllllIlIIlIlllIIlllIIlII, lllllllllllllIlIIlIlllIIlllIllII)) {
                lllllllllllllIlIIlIlllIIlllIllII = BasicTriangulator.lIIIIlIlIIIlII[1];
            }
            if (lIlllIIlIlIlIII(this.snip(lllllllllllllIlIIlIlllIIlllIIIIl, lllllllllllllIlIIlIlllIIlllIllIl, lllllllllllllIlIIlIlllIIlllIlIlI, lllllllllllllIlIIlIlllIIlllIllII, lllllllllllllIlIIlIlllIIlllIIlII, lllllllllllllIlIIlIlllIIlllIIlIl) ? 1 : 0)) {
                final int lllllllllllllIlIIlIlllIIllllIIlI = lllllllllllllIlIIlIlllIIlllIIlIl[lllllllllllllIlIIlIlllIIlllIllIl];
                final int lllllllllllllIlIIlIlllIIllllIIIl = lllllllllllllIlIIlIlllIIlllIIlIl[lllllllllllllIlIIlIlllIIlllIlIlI];
                final int lllllllllllllIlIIlIlllIIllllIIII = lllllllllllllIlIIlIlllIIlllIIlIl[lllllllllllllIlIIlIlllIIlllIllII];
                lllllllllllllIlIIlIlllIIlllIIIII.add(lllllllllllllIlIIlIlllIIlllIIIIl.get(lllllllllllllIlIIlIlllIIllllIIlI));
                lllllllllllllIlIIlIlllIIlllIIIII.add(lllllllllllllIlIIlIlllIIlllIIIIl.get(lllllllllllllIlIIlIlllIIllllIIIl));
                lllllllllllllIlIIlIlllIIlllIIIII.add(lllllllllllllIlIIlIlllIIlllIIIIl.get(lllllllllllllIlIIlIlllIIllllIIII));
                ++lllllllllllllIlIIlIlllIIlllIlIll;
                int lllllllllllllIlIIlIlllIIlllIllll = lllllllllllllIlIIlIlllIIlllIlIlI;
                int lllllllllllllIlIIlIlllIIlllIlllI = lllllllllllllIlIIlIlllIIlllIlIlI + BasicTriangulator.lIIIIlIlIIIlII[2];
                while (lIlllIIlIlIIIIl(lllllllllllllIlIIlIlllIIlllIlllI, lllllllllllllIlIIlIlllIIlllIIlII)) {
                    lllllllllllllIlIIlIlllIIlllIIlIl[lllllllllllllIlIIlIlllIIlllIllll] = lllllllllllllIlIIlIlllIIlllIIlIl[lllllllllllllIlIIlIlllIIlllIlllI];
                    ++lllllllllllllIlIIlIlllIIlllIllll;
                    ++lllllllllllllIlIIlIlllIIlllIlllI;
                    "".length();
                    if (null != null) {
                        return ((0x4 ^ 0xC) & ~(0x71 ^ 0x79)) != 0x0;
                    }
                }
                --lllllllllllllIlIIlIlllIIlllIIlII;
                lllllllllllllIlIIlIlllIIlllIIIll = BasicTriangulator.lIIIIlIlIIIlII[0] * lllllllllllllIlIIlIlllIIlllIIlII;
            }
            "".length();
            if (-" ".length() > " ".length()) {
                return ((27 + 34 + 96 + 4 ^ 0 + 86 - 48 + 113) & (91 + 110 - 148 + 114 ^ 70 + 61 - 46 + 60 ^ -" ".length())) != 0x0;
            }
        }
        return BasicTriangulator.lIIIIlIlIIIlII[2] != 0;
    }
    
    private static boolean lIlllIIlIlIIIll(final int lllllllllllllIlIIlIlllIIlIIlIIll) {
        return lllllllllllllIlIIlIlllIIlIIlIIll >= 0;
    }
    
    private static boolean lIlllIIlIlIIIII(final int lllllllllllllIlIIlIlllIIlIIlIlIl) {
        return lllllllllllllIlIIlIlllIIlIIlIlIl == 0;
    }
    
    static {
        lIlllIIlIIlllll();
        lIlllIIIlIlllll();
    }
    
    private class Point
    {
        private /* synthetic */ float y;
        private /* synthetic */ float x;
        private /* synthetic */ float[] array;
        private static final /* synthetic */ int[] lIIlllIIlIllll;
        
        private static int llIllIllIIIIllI(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        public float getX() {
            return this.x;
        }
        
        @Override
        public int hashCode() {
            return (int)(this.x * this.y * 31.0f);
        }
        
        private static boolean llIllIllIIIIlll(final int lllllllllllllIIlIlIIIIlIllIIIlll) {
            return lllllllllllllIIlIlIIIIlIllIIIlll != 0;
        }
        
        public float getY() {
            return this.y;
        }
        
        private static void llIllIllIIIIlIl() {
            (lIIlllIIlIllll = new int[3])[0] = "  ".length();
            Point.lIIlllIIlIllll[1] = ((0x94 ^ 0xA3 ^ (0x65 ^ 0x5D)) & (60 + 107 + 2 + 10 ^ 57 + 131 - 7 + 7 ^ -" ".length()));
            Point.lIIlllIIlIllll[2] = " ".length();
        }
        
        private static boolean llIllIllIIIlIII(final int lllllllllllllIIlIlIIIIlIllIIIlIl) {
            return lllllllllllllIIlIlIIIIlIllIIIlIl == 0;
        }
        
        static {
            llIllIllIIIIlIl();
        }
        
        public float[] toArray() {
            return this.array;
        }
        
        @Override
        public boolean equals(final Object lllllllllllllIIlIlIIIIlIllIlIIlI) {
            if (llIllIllIIIIlll((lllllllllllllIIlIlIIIIlIllIlIIlI instanceof Point) ? 1 : 0)) {
                final Point lllllllllllllIIlIlIIIIlIllIlIlII = (Point)lllllllllllllIIlIlIIIIlIllIlIIlI;
                int n;
                if (llIllIllIIIlIII(llIllIllIIIIllI(lllllllllllllIIlIlIIIIlIllIlIlII.x, this.x)) && llIllIllIIIlIII(llIllIllIIIIllI(lllllllllllllIIlIlIIIIlIllIlIlII.y, this.y))) {
                    n = Point.lIIlllIIlIllll[2];
                    "".length();
                    if (((0xD ^ 0x5B) & ~(0x96 ^ 0xC0)) < 0) {
                        return ((0x31 ^ 0x1E) & ~(0x4C ^ 0x63)) != 0x0;
                    }
                }
                else {
                    n = Point.lIIlllIIlIllll[1];
                }
                return n != 0;
            }
            return Point.lIIlllIIlIllll[1] != 0;
        }
        
        public Point(final float lllllllllllllIIlIlIIIIlIlllIlIIl, final float lllllllllllllIIlIlIIIIlIlllIIlII) {
            this.x = lllllllllllllIIlIlIIIIlIlllIlIIl;
            this.y = lllllllllllllIIlIlIIIIlIlllIIlII;
            final float[] array = new float[Point.lIIlllIIlIllll[0]];
            array[Point.lIIlllIIlIllll[1]] = lllllllllllllIIlIlIIIIlIlllIlIIl;
            array[Point.lIIlllIIlIllll[2]] = lllllllllllllIIlIlIIIIlIlllIIlII;
            this.array = array;
        }
    }
    
    private class PointList
    {
        private /* synthetic */ ArrayList points;
        
        public PointList() {
            this.points = new ArrayList();
        }
        
        public void add(final Point lllllllllllllIIlllIIIIIlIIlllIII) {
            this.points.add(lllllllllllllIIlllIIIIIlIIlllIII);
            "".length();
        }
        
        public int size() {
            return this.points.size();
        }
        
        public boolean contains(final Point lllllllllllllIIlllIIIIIlIlIIIIll) {
            return this.points.contains(lllllllllllllIIlllIIIIIlIlIIIIll);
        }
        
        public void remove(final Point lllllllllllllIIlllIIIIIlIIlIllII) {
            this.points.remove(lllllllllllllIIlllIIIIIlIIlIllII);
            "".length();
        }
        
        public Point get(final int lllllllllllllIIlllIIIIIlIIIlIlll) {
            return this.points.get(lllllllllllllIIlllIIIIIlIIIlIlll);
        }
        
        public void clear() {
            this.points.clear();
        }
    }
}
