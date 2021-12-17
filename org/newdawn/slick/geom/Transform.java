// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import org.newdawn.slick.util.FastTrig;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Transform
{
    private static final /* synthetic */ String[] llIlllllIlllII;
    private static final /* synthetic */ int[] llIllllllIIIII;
    private /* synthetic */ float[] matrixPosition;
    
    private static String lIIllIllIlIlIllI(String llllllllllllIllIIIlIllIIlllIIllI, final String llllllllllllIllIIIlIllIIlllIIlIl) {
        llllllllllllIllIIIlIllIIlllIIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIIlIllIIlllIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIllIIlllIlIIl = new StringBuilder();
        final char[] llllllllllllIllIIIlIllIIlllIlIII = llllllllllllIllIIIlIllIIlllIIlIl.toCharArray();
        int llllllllllllIllIIIlIllIIlllIIlll = Transform.llIllllllIIIII[1];
        final double llllllllllllIllIIIlIllIIlllIIIIl = (Object)llllllllllllIllIIIlIllIIlllIIllI.toCharArray();
        final String llllllllllllIllIIIlIllIIlllIIIII = (String)llllllllllllIllIIIlIllIIlllIIIIl.length;
        char llllllllllllIllIIIlIllIIllIlllll = (char)Transform.llIllllllIIIII[1];
        while (lIIllIllIllIIIII(llllllllllllIllIIIlIllIIllIlllll, (int)llllllllllllIllIIIlIllIIlllIIIII)) {
            final char llllllllllllIllIIIlIllIIlllIllII = llllllllllllIllIIIlIllIIlllIIIIl[llllllllllllIllIIIlIllIIllIlllll];
            llllllllllllIllIIIlIllIIlllIlIIl.append((char)(llllllllllllIllIIIlIllIIlllIllII ^ llllllllllllIllIIIlIllIIlllIlIII[llllllllllllIllIIIlIllIIlllIIlll % llllllllllllIllIIIlIllIIlllIlIII.length]));
            "".length();
            ++llllllllllllIllIIIlIllIIlllIIlll;
            ++llllllllllllIllIIIlIllIIllIlllll;
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIllIIlllIlIIl);
    }
    
    static {
        lIIllIllIlIlllll();
        lIIllIllIlIlIlll();
    }
    
    @Override
    public String toString() {
        final String llllllllllllIllIIIlIllIlIIllIlIl = String.valueOf(new StringBuilder().append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[2]]).append(this.matrixPosition[Transform.llIllllllIIIII[1]]).append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[3]]).append(this.matrixPosition[Transform.llIllllllIIIII[2]]).append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[4]]).append(this.matrixPosition[Transform.llIllllllIIIII[3]]).append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[5]]).append(this.matrixPosition[Transform.llIllllllIIIII[4]]).append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[6]]).append(this.matrixPosition[Transform.llIllllllIIIII[5]]).append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[7]]).append(this.matrixPosition[Transform.llIllllllIIIII[6]]).append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[8]]).append(this.matrixPosition[Transform.llIllllllIIIII[7]]).append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[9]]).append(this.matrixPosition[Transform.llIllllllIIIII[8]]).append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[0]]).append(this.matrixPosition[Transform.llIllllllIIIII[9]]).append(Transform.llIlllllIlllII[Transform.llIllllllIIIII[10]]));
        return llllllllllllIllIIIlIllIlIIllIlIl.toString();
    }
    
    public Transform concatenate(final Transform llllllllllllIllIIIlIllIlIlIIIIII) {
        final float[] llllllllllllIllIIIlIllIlIlIIlIII = new float[Transform.llIllllllIIIII[0]];
        final float llllllllllllIllIIIlIllIlIlIIIlll = this.matrixPosition[Transform.llIllllllIIIII[1]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[1]] + this.matrixPosition[Transform.llIllllllIIIII[2]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[4]];
        final float llllllllllllIllIIIlIllIlIlIIIllI = this.matrixPosition[Transform.llIllllllIIIII[1]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[2]] + this.matrixPosition[Transform.llIllllllIIIII[2]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[5]];
        final float llllllllllllIllIIIlIllIlIlIIIlIl = this.matrixPosition[Transform.llIllllllIIIII[1]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[3]] + this.matrixPosition[Transform.llIllllllIIIII[2]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[6]] + this.matrixPosition[Transform.llIllllllIIIII[3]];
        final float llllllllllllIllIIIlIllIlIlIIIlII = this.matrixPosition[Transform.llIllllllIIIII[4]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[1]] + this.matrixPosition[Transform.llIllllllIIIII[5]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[4]];
        final float llllllllllllIllIIIlIllIlIlIIIIll = this.matrixPosition[Transform.llIllllllIIIII[4]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[2]] + this.matrixPosition[Transform.llIllllllIIIII[5]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[5]];
        final float llllllllllllIllIIIlIllIlIlIIIIlI = this.matrixPosition[Transform.llIllllllIIIII[4]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[3]] + this.matrixPosition[Transform.llIllllllIIIII[5]] * llllllllllllIllIIIlIllIlIlIIIIII.matrixPosition[Transform.llIllllllIIIII[6]] + this.matrixPosition[Transform.llIllllllIIIII[6]];
        llllllllllllIllIIIlIllIlIlIIlIII[Transform.llIllllllIIIII[1]] = llllllllllllIllIIIlIllIlIlIIIlll;
        llllllllllllIllIIIlIllIlIlIIlIII[Transform.llIllllllIIIII[2]] = llllllllllllIllIIIlIllIlIlIIIllI;
        llllllllllllIllIIIlIllIlIlIIlIII[Transform.llIllllllIIIII[3]] = llllllllllllIllIIIlIllIlIlIIIlIl;
        llllllllllllIllIIIlIllIlIlIIlIII[Transform.llIllllllIIIII[4]] = llllllllllllIllIIIlIllIlIlIIIlII;
        llllllllllllIllIIIlIllIlIlIIlIII[Transform.llIllllllIIIII[5]] = llllllllllllIllIIIlIllIlIlIIIIll;
        llllllllllllIllIIIlIllIlIlIIlIII[Transform.llIllllllIIIII[6]] = llllllllllllIllIIIlIllIlIlIIIIlI;
        this.matrixPosition = llllllllllllIllIIIlIllIlIlIIlIII;
        return this;
    }
    
    private static void lIIllIllIlIlIlll() {
        (llIlllllIlllII = new String[Transform.llIllllllIIIII[11]])[Transform.llIllllllIIIII[1]] = lIIllIllIlIlIlII("k1l7k+xijoFRiXoBn51ofvKbboiS5p+N4xm/8ZA/WlgDfRZCA2gdG9p38e2D59AuUS6jAWdcrUg=", "aKzEz");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[2]] = lIIllIllIlIlIlII("rIUF36Hihcl2ie15AfD2Zg==", "NkHkZ");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[3]] = lIIllIllIlIlIlIl("mBwNQsR3VcU=", "OuKfS");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[4]] = lIIllIllIlIlIlII("TPT5GaATs60=", "vrEug");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[5]] = lIIllIllIlIlIlIl("5HYgfKcyGoE=", "mMYOv");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[6]] = lIIllIllIlIlIlII("77LTQCBjZws=", "ULGEK");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[7]] = lIIllIllIlIlIllI("fQ==", "QTIdF");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[8]] = lIIllIllIlIlIlII("ppMTsAzcCtI=", "iVquK");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[9]] = lIIllIllIlIlIlIl("Y4qwnGt9Ir0=", "tTMmZ");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[0]] = lIIllIllIlIlIlIl("X1vNyNRTtdI=", "qTupR");
        Transform.llIlllllIlllII[Transform.llIllllllIIIII[10]] = lIIllIllIlIlIllI("Gy8=", "FrNKZ");
    }
    
    private static String lIIllIllIlIlIlII(final String llllllllllllIllIIIlIllIIlllllIll, final String llllllllllllIllIIIlIllIIlllllIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIllIIlllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIllIIlllllIII.getBytes(StandardCharsets.UTF_8)), Transform.llIllllllIIIII[9]), "DES");
            final Cipher llllllllllllIllIIIlIllIIllllllIl = Cipher.getInstance("DES");
            llllllllllllIllIIIlIllIIllllllIl.init(Transform.llIllllllIIIII[3], llllllllllllIllIIIlIllIIlllllllI);
            return new String(llllllllllllIllIIIlIllIIllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIllIIlllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIllIIllllllII) {
            llllllllllllIllIIIlIllIIllllllII.printStackTrace();
            return null;
        }
    }
    
    public void transform(final float[] llllllllllllIllIIIlIllIlIlIllIll, final int llllllllllllIllIIIlIllIlIlIllIlI, final float[] llllllllllllIllIIIlIllIlIllIIIII, final int llllllllllllIllIIIlIllIlIlIllIII, final int llllllllllllIllIIIlIllIlIlIlIlll) {
        float[] array;
        if (lIIllIllIllIIIlI(llllllllllllIllIIIlIllIlIlIllIll, llllllllllllIllIIIlIllIlIllIIIII)) {
            array = new float[llllllllllllIllIIIlIllIlIlIlIlll * Transform.llIllllllIIIII[3]];
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
        }
        else {
            array = llllllllllllIllIIIlIllIlIllIIIII;
        }
        final float[] llllllllllllIllIIIlIllIlIlIlllIl = array;
        int llllllllllllIllIIIlIllIlIllIIlIl = Transform.llIllllllIIIII[1];
        while (lIIllIllIllIIIII(llllllllllllIllIIIlIllIlIllIIlIl, llllllllllllIllIIIlIllIlIlIlIlll * Transform.llIllllllIIIII[3])) {
            int llllllllllllIllIIIlIllIlIllIIllI = Transform.llIllllllIIIII[1];
            while (lIIllIllIllIIIII(llllllllllllIllIIIlIllIlIllIIllI, Transform.llIllllllIIIII[7])) {
                llllllllllllIllIIIlIllIlIlIlllIl[llllllllllllIllIIIlIllIlIllIIlIl + llllllllllllIllIIIlIllIlIllIIllI / Transform.llIllllllIIIII[4]] = llllllllllllIllIIIlIllIlIlIllIll[llllllllllllIllIIIlIllIlIllIIlIl + llllllllllllIllIIIlIllIlIlIllIlI] * this.matrixPosition[llllllllllllIllIIIlIllIlIllIIllI] + llllllllllllIllIIIlIllIlIlIllIll[llllllllllllIllIIIlIllIlIllIIlIl + llllllllllllIllIIIlIllIlIlIllIlI + Transform.llIllllllIIIII[2]] * this.matrixPosition[llllllllllllIllIIIlIllIlIllIIllI + Transform.llIllllllIIIII[2]] + 1.0f * this.matrixPosition[llllllllllllIllIIIlIllIlIllIIllI + Transform.llIllllllIIIII[3]];
                llllllllllllIllIIIlIllIlIllIIllI += 3;
                "".length();
                if (((72 + 42 + 97 + 31 ^ 69 + 112 - 125 + 134) & (190 + 191 - 184 + 10 ^ 75 + 1 + 19 + 36 ^ -" ".length())) < 0) {
                    return;
                }
            }
            llllllllllllIllIIIlIllIlIllIIlIl += 2;
            "".length();
            if ((0xB9 ^ 0xBD) != (0x77 ^ 0x73)) {
                return;
            }
        }
        if (lIIllIllIllIIIlI(llllllllllllIllIIIlIllIlIlIllIll, llllllllllllIllIIIlIllIlIllIIIII)) {
            int llllllllllllIllIIIlIllIlIllIIlII = Transform.llIllllllIIIII[1];
            while (lIIllIllIllIIIII(llllllllllllIllIIIlIllIlIllIIlII, llllllllllllIllIIIlIllIlIlIlIlll * Transform.llIllllllIIIII[3])) {
                llllllllllllIllIIIlIllIlIllIIIII[llllllllllllIllIIIlIllIlIllIIlII + llllllllllllIllIIIlIllIlIlIllIII] = llllllllllllIllIIIlIllIlIlIlllIl[llllllllllllIllIIIlIllIlIllIIlII];
                llllllllllllIllIIIlIllIlIllIIIII[llllllllllllIllIIIlIllIlIllIIlII + llllllllllllIllIIIlIllIlIlIllIII + Transform.llIllllllIIIII[2]] = llllllllllllIllIIIlIllIlIlIlllIl[llllllllllllIllIIIlIllIlIllIIlII + Transform.llIllllllIIIII[2]];
                llllllllllllIllIIIlIllIlIllIIlII += 2;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
        }
    }
    
    public static Transform createScaleTransform(final float llllllllllllIllIIIlIllIlIIIlIIII, final float llllllllllllIllIIIlIllIlIIIIllll) {
        return new Transform(llllllllllllIllIIIlIllIlIIIlIIII, 0.0f, 0.0f, 0.0f, llllllllllllIllIIIlIllIlIIIIllll, 0.0f);
    }
    
    public static Transform createTranslateTransform(final float llllllllllllIllIIIlIllIlIIIllIII, final float llllllllllllIllIIIlIllIlIIIlIlll) {
        return new Transform(1.0f, 0.0f, llllllllllllIllIIIlIllIlIIIllIII, 0.0f, 1.0f, llllllllllllIllIIIlIllIlIIIlIlll);
    }
    
    public static Transform createRotateTransform(final float llllllllllllIllIIIlIllIlIIlIlllI) {
        return new Transform((float)FastTrig.cos(llllllllllllIllIIIlIllIlIIlIlllI), -(float)FastTrig.sin(llllllllllllIllIIIlIllIlIIlIlllI), 0.0f, (float)FastTrig.sin(llllllllllllIllIIIlIllIlIIlIlllI), (float)FastTrig.cos(llllllllllllIllIIIlIllIlIIlIlllI), 0.0f);
    }
    
    private static boolean lIIllIllIllIIIlI(final Object llllllllllllIllIIIlIllIIllIIlIlI, final Object llllllllllllIllIIIlIllIIllIIlIIl) {
        return llllllllllllIllIIIlIllIIllIIlIlI == llllllllllllIllIIIlIllIIllIIlIIl;
    }
    
    public Vector2f transform(final Vector2f llllllllllllIllIIIlIllIlIIIIlIIl) {
        final float[] array = new float[Transform.llIllllllIIIII[3]];
        array[Transform.llIllllllIIIII[1]] = llllllllllllIllIIIlIllIlIIIIlIIl.x;
        array[Transform.llIllllllIIIII[2]] = llllllllllllIllIIIlIllIlIIIIlIIl.y;
        final float[] llllllllllllIllIIIlIllIlIIIIlIII = array;
        final float[] llllllllllllIllIIIlIllIlIIIIIlll = new float[Transform.llIllllllIIIII[3]];
        this.transform(llllllllllllIllIIIlIllIlIIIIlIII, Transform.llIllllllIIIII[1], llllllllllllIllIIIlIllIlIIIIIlll, Transform.llIllllllIIIII[1], Transform.llIllllllIIIII[2]);
        return new Vector2f(llllllllllllIllIIIlIllIlIIIIIlll[Transform.llIllllllIIIII[1]], llllllllllllIllIIIlIllIlIIIIIlll[Transform.llIllllllIIIII[2]]);
    }
    
    public Transform(final float llllllllllllIllIIIlIllIlIlllIlIl, final float llllllllllllIllIIIlIllIlIlllIlII, final float llllllllllllIllIIIlIllIlIlllIIll, final float llllllllllllIllIIIlIllIlIlllIIlI, final float llllllllllllIllIIIlIllIlIllllIII, final float llllllllllllIllIIIlIllIlIlllIlll) {
        final float[] matrixPosition = new float[Transform.llIllllllIIIII[0]];
        matrixPosition[Transform.llIllllllIIIII[1]] = llllllllllllIllIIIlIllIlIlllIlIl;
        matrixPosition[Transform.llIllllllIIIII[2]] = llllllllllllIllIIIlIllIlIlllIlII;
        matrixPosition[Transform.llIllllllIIIII[3]] = llllllllllllIllIIIlIllIlIlllIIll;
        matrixPosition[Transform.llIllllllIIIII[4]] = llllllllllllIllIIIlIllIlIlllIIlI;
        matrixPosition[Transform.llIllllllIIIII[5]] = llllllllllllIllIIIlIllIlIllllIII;
        matrixPosition[Transform.llIllllllIIIII[6]] = llllllllllllIllIIIlIllIlIlllIlll;
        matrixPosition[Transform.llIllllllIIIII[7]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[8]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[9]] = 1.0f;
        this.matrixPosition = matrixPosition;
    }
    
    public Transform(final Transform llllllllllllIllIIIlIllIllIIIllll, final Transform llllllllllllIllIIIlIllIllIIIlllI) {
        this(llllllllllllIllIIIlIllIllIIIllll);
        this.concatenate(llllllllllllIllIIIlIllIllIIIlllI);
        "".length();
    }
    
    public float[] getMatrixPosition() {
        return this.matrixPosition;
    }
    
    public Transform() {
        final float[] matrixPosition = new float[Transform.llIllllllIIIII[0]];
        matrixPosition[Transform.llIllllllIIIII[1]] = 1.0f;
        matrixPosition[Transform.llIllllllIIIII[2]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[3]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[4]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[5]] = 1.0f;
        matrixPosition[Transform.llIllllllIIIII[6]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[7]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[8]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[9]] = 1.0f;
        this.matrixPosition = matrixPosition;
    }
    
    private static boolean lIIllIllIllIIIII(final int llllllllllllIllIIIlIllIIllIIlllI, final int llllllllllllIllIIIlIllIIllIIllIl) {
        return llllllllllllIllIIIlIllIIllIIlllI < llllllllllllIllIIIlIllIIllIIllIl;
    }
    
    private static void lIIllIllIlIlllll() {
        (llIllllllIIIII = new int[12])[0] = (0x9A ^ 0x93);
        Transform.llIllllllIIIII[1] = ((0xF2 ^ 0x9B ^ (0x58 ^ 0x68)) & (134 + 185 - 157 + 51 ^ 54 + 103 - 50 + 33 ^ -" ".length()));
        Transform.llIllllllIIIII[2] = " ".length();
        Transform.llIllllllIIIII[3] = "  ".length();
        Transform.llIllllllIIIII[4] = "   ".length();
        Transform.llIllllllIIIII[5] = (0x53 ^ 0x1E ^ (0xE3 ^ 0xAA));
        Transform.llIllllllIIIII[6] = (153 + 111 - 153 + 53 ^ 152 + 91 - 201 + 119);
        Transform.llIllllllIIIII[7] = (0x18 ^ 0x1E);
        Transform.llIllllllIIIII[8] = (0x65 ^ 0x47 ^ (0xE6 ^ 0xC3));
        Transform.llIllllllIIIII[9] = (0xE ^ 0x46 ^ (0x85 ^ 0xC5));
        Transform.llIllllllIIIII[10] = (0x28 ^ 0xB ^ (0x2C ^ 0x5));
        Transform.llIllllllIIIII[11] = (0x8C ^ 0x87);
    }
    
    private static String lIIllIllIlIlIlIl(final String llllllllllllIllIIIlIllIIllIlIllI, final String llllllllllllIllIIIlIllIIllIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIllIIllIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIllIIllIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIllIIllIllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIllIIllIllIII.init(Transform.llIllllllIIIII[3], llllllllllllIllIIIlIllIIllIllIIl);
            return new String(llllllllllllIllIIIlIllIIllIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIllIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIllIIllIlIlll) {
            llllllllllllIllIIIlIllIIllIlIlll.printStackTrace();
            return null;
        }
    }
    
    public static Transform createRotateTransform(final float llllllllllllIllIIIlIllIlIIlIIllI, final float llllllllllllIllIIIlIllIlIIIlllll, final float llllllllllllIllIIIlIllIlIIlIIlII) {
        final Transform llllllllllllIllIIIlIllIlIIlIIIll = createRotateTransform(llllllllllllIllIIIlIllIlIIlIIllI);
        final float llllllllllllIllIIIlIllIlIIlIIIlI = llllllllllllIllIIIlIllIlIIlIIIll.matrixPosition[Transform.llIllllllIIIII[4]];
        final float llllllllllllIllIIIlIllIlIIlIIIIl = 1.0f - llllllllllllIllIIIlIllIlIIlIIIll.matrixPosition[Transform.llIllllllIIIII[5]];
        llllllllllllIllIIIlIllIlIIlIIIll.matrixPosition[Transform.llIllllllIIIII[3]] = llllllllllllIllIIIlIllIlIIIlllll * llllllllllllIllIIIlIllIlIIlIIIIl + llllllllllllIllIIIlIllIlIIlIIlII * llllllllllllIllIIIlIllIlIIlIIIlI;
        llllllllllllIllIIIlIllIlIIlIIIll.matrixPosition[Transform.llIllllllIIIII[6]] = llllllllllllIllIIIlIllIlIIlIIlII * llllllllllllIllIIIlIllIlIIlIIIIl - llllllllllllIllIIIlIllIlIIIlllll * llllllllllllIllIIIlIllIlIIlIIIlI;
        return llllllllllllIllIIIlIllIlIIlIIIll;
    }
    
    public Transform(final Transform llllllllllllIllIIIlIllIllIIlIlIl) {
        this.matrixPosition = new float[Transform.llIllllllIIIII[0]];
        int llllllllllllIllIIIlIllIllIIllIIl = Transform.llIllllllIIIII[1];
        while (lIIllIllIllIIIII(llllllllllllIllIIIlIllIllIIllIIl, Transform.llIllllllIIIII[0])) {
            this.matrixPosition[llllllllllllIllIIIlIllIllIIllIIl] = llllllllllllIllIIIlIllIllIIlIlIl.matrixPosition[llllllllllllIllIIIlIllIllIIllIIl];
            ++llllllllllllIllIIIlIllIllIIllIIl;
            "".length();
            if (-"  ".length() > 0) {
                throw null;
            }
        }
    }
    
    public Transform(final float[] llllllllllllIllIIIlIllIllIIIIlll) {
        if (lIIllIllIllIIIIl(llllllllllllIllIIIlIllIllIIIIlll.length, Transform.llIllllllIIIII[7])) {
            throw new RuntimeException(Transform.llIlllllIlllII[Transform.llIllllllIIIII[1]]);
        }
        final float[] matrixPosition = new float[Transform.llIllllllIIIII[0]];
        matrixPosition[Transform.llIllllllIIIII[1]] = llllllllllllIllIIIlIllIllIIIIlll[Transform.llIllllllIIIII[1]];
        matrixPosition[Transform.llIllllllIIIII[2]] = llllllllllllIllIIIlIllIllIIIIlll[Transform.llIllllllIIIII[2]];
        matrixPosition[Transform.llIllllllIIIII[3]] = llllllllllllIllIIIlIllIllIIIIlll[Transform.llIllllllIIIII[3]];
        matrixPosition[Transform.llIllllllIIIII[4]] = llllllllllllIllIIIlIllIllIIIIlll[Transform.llIllllllIIIII[4]];
        matrixPosition[Transform.llIllllllIIIII[5]] = llllllllllllIllIIIlIllIllIIIIlll[Transform.llIllllllIIIII[5]];
        matrixPosition[Transform.llIllllllIIIII[6]] = llllllllllllIllIIIlIllIllIIIIlll[Transform.llIllllllIIIII[6]];
        matrixPosition[Transform.llIllllllIIIII[7]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[8]] = 0.0f;
        matrixPosition[Transform.llIllllllIIIII[9]] = 1.0f;
        this.matrixPosition = matrixPosition;
    }
    
    private static boolean lIIllIllIllIIIIl(final int llllllllllllIllIIIlIllIIllIIIllI, final int llllllllllllIllIIIlIllIIllIIIlIl) {
        return llllllllllllIllIIIlIllIIllIIIllI != llllllllllllIllIIIlIllIIllIIIlIl;
    }
}
