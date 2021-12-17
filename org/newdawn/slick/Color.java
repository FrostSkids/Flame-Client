// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.FloatBuffer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import java.io.Serializable;

public class Color implements Serializable
{
    protected transient /* synthetic */ SGL GL;
    public /* synthetic */ float a;
    private static final /* synthetic */ String[] lllIIIIllIlIlI;
    public /* synthetic */ float g;
    public /* synthetic */ float b;
    public /* synthetic */ float r;
    private static final /* synthetic */ int[] lllIIIIllIllII;
    
    public Color(final int llllllllllllIllIIIIlIIlIIllIIllI) {
        this.GL = Renderer.get();
        this.a = 1.0f;
        final int llllllllllllIllIIIIlIIlIIllIlIll = (llllllllllllIllIIIIlIIlIIllIIllI & Color.lllIIIIllIllII[0]) >> Color.lllIIIIllIllII[1];
        final int llllllllllllIllIIIIlIIlIIllIlIlI = (llllllllllllIllIIIIlIIlIIllIIllI & Color.lllIIIIllIllII[2]) >> Color.lllIIIIllIllII[3];
        final int llllllllllllIllIIIIlIIlIIllIlIIl = llllllllllllIllIIIIlIIlIIllIIllI & Color.lllIIIIllIllII[4];
        int llllllllllllIllIIIIlIIlIIllIlIII = (llllllllllllIllIIIIlIIlIIllIIllI & Color.lllIIIIllIllII[5]) >> Color.lllIIIIllIllII[6];
        if (lIIlllIIlllIIIIl(llllllllllllIllIIIIlIIlIIllIlIII)) {
            llllllllllllIllIIIIlIIlIIllIlIII += 256;
        }
        if (lIIlllIIlllIIIlI(llllllllllllIllIIIIlIIlIIllIlIII)) {
            llllllllllllIllIIIIlIIlIIllIlIII = Color.lllIIIIllIllII[4];
        }
        this.r = llllllllllllIllIIIIlIIlIIllIlIll / 255.0f;
        this.g = llllllllllllIllIIIIlIIlIIllIlIlI / 255.0f;
        this.b = llllllllllllIllIIIIlIIlIIllIlIIl / 255.0f;
        this.a = llllllllllllIllIIIIlIIlIIllIlIII / 255.0f;
    }
    
    public static Color decode(final String llllllllllllIllIIIIlIIlIIlIlllll) {
        return new Color(Integer.decode(llllllllllllIllIIIIlIIlIIlIlllll));
    }
    
    public Color(final FloatBuffer llllllllllllIllIIIIlIIlIlIlIllII) {
        this.GL = Renderer.get();
        this.a = 1.0f;
        this.r = llllllllllllIllIIIIlIIlIlIlIllII.get();
        this.g = llllllllllllIllIIIIlIIlIlIlIllII.get();
        this.b = llllllllllllIllIIIIlIIlIlIlIllII.get();
        this.a = llllllllllllIllIIIIlIIlIlIlIllII.get();
    }
    
    public void scale(final float llllllllllllIllIIIIlIIlIIIIIlIll) {
        this.r *= llllllllllllIllIIIIlIIlIIIIIlIll;
        this.g *= llllllllllllIllIIIIlIIlIIIIIlIll;
        this.b *= llllllllllllIllIIIIlIIlIIIIIlIll;
        this.a *= llllllllllllIllIIIIlIIlIIIIIlIll;
    }
    
    public Color(final int llllllllllllIllIIIIlIIlIlIIIlIIl, final int llllllllllllIllIIIIlIIlIlIIIIlII, final int llllllllllllIllIIIIlIIlIlIIIIIll) {
        this.GL = Renderer.get();
        this.a = 1.0f;
        this.r = llllllllllllIllIIIIlIIlIlIIIlIIl / 255.0f;
        this.g = llllllllllllIllIIIIlIIlIlIIIIlII / 255.0f;
        this.b = llllllllllllIllIIIIlIIlIlIIIIIll / 255.0f;
        this.a = 1.0f;
    }
    
    public Color brighter(float llllllllllllIllIIIIlIIlIIIIllllI) {
        ++llllllllllllIllIIIIlIIlIIIIllllI;
        final Color llllllllllllIllIIIIlIIlIIIlIIIII = new Color(this.r * llllllllllllIllIIIIlIIlIIIIllllI, this.g * llllllllllllIllIIIIlIIlIIIIllllI, this.b * llllllllllllIllIIIIlIIlIIIIllllI, this.a);
        return llllllllllllIllIIIIlIIlIIIlIIIII;
    }
    
    public Color brighter() {
        return this.brighter(0.2f);
    }
    
    public Color(final float llllllllllllIllIIIIlIIlIlIIlIIlI, final float llllllllllllIllIIIIlIIlIlIIlIllI, final float llllllllllllIllIIIIlIIlIlIIlIlIl, final float llllllllllllIllIIIIlIIlIlIIlIlII) {
        this.GL = Renderer.get();
        this.a = 1.0f;
        this.r = Math.min(llllllllllllIllIIIIlIIlIlIIlIIlI, 1.0f);
        this.g = Math.min(llllllllllllIllIIIIlIIlIlIIlIllI, 1.0f);
        this.b = Math.min(llllllllllllIllIIIIlIIlIlIIlIlIl, 1.0f);
        this.a = Math.min(llllllllllllIllIIIIlIIlIlIIlIlII, 1.0f);
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(Color.lllIIIIllIlIlI[Color.lllIIIIllIllII[8]]).append(this.r).append(Color.lllIIIIllIlIlI[Color.lllIIIIllIllII[7]]).append(this.g).append(Color.lllIIIIllIlIlI[Color.lllIIIIllIllII[9]]).append(this.b).append(Color.lllIIIIllIlIlI[Color.lllIIIIllIllII[10]]).append(this.a).append(Color.lllIIIIllIlIlI[Color.lllIIIIllIllII[11]]));
    }
    
    private static void lIIlllIIllIllIll() {
        (lllIIIIllIlIlI = new String[Color.lllIIIIllIllII[14]])[Color.lllIIIIllIllII[8]] = lIIlllIIllIllIIl("CwsBLCBoTA==", "HdmCR");
        Color.lllIIIIllIlIlI[Color.lllIIIIllIllII[7]] = lIIlllIIllIllIlI("DbZNIH2GVKw=", "fedNW");
        Color.lllIIIIllIlIlI[Color.lllIIIIllIllII[9]] = lIIlllIIllIllIlI("LrqblDMbhY4=", "FBacy");
        Color.lllIIIIllIlIlI[Color.lllIIIIllIllII[10]] = lIIlllIIllIllIIl("Rw==", "kYlSN");
        Color.lllIIIIllIlIlI[Color.lllIIIIllIllII[11]] = lIIlllIIllIllIlI("7niG/59ZmNw=", "nAQWe");
    }
    
    public void bind() {
        this.GL.glColor4f(this.r, this.g, this.b, this.a);
    }
    
    public Color darker(float llllllllllllIllIIIIlIIlIIlIIIIlI) {
        llllllllllllIllIIIIlIIlIIlIIIIlI = 1.0f - llllllllllllIllIIIIlIIlIIlIIIIlI;
        final Color llllllllllllIllIIIIlIIlIIlIIIlII = new Color(this.r * llllllllllllIllIIIIlIIlIIlIIIIlI, this.g * llllllllllllIllIIIIlIIlIIlIIIIlI, this.b * llllllllllllIllIIIIlIIlIIlIIIIlI, this.a);
        return llllllllllllIllIIIIlIIlIIlIIIlII;
    }
    
    public int getRedByte() {
        return (int)(this.r * 255.0f);
    }
    
    private static String lIIlllIIllIllIlI(final String llllllllllllIllIIIIlIIIlllIlIlll, final String llllllllllllIllIIIIlIIIlllIlIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIIIlllIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIIIlllIlIllI.getBytes(StandardCharsets.UTF_8)), Color.lllIIIIllIllII[3]), "DES");
            final Cipher llllllllllllIllIIIIlIIIlllIllIll = Cipher.getInstance("DES");
            llllllllllllIllIIIIlIIIlllIllIll.init(Color.lllIIIIllIllII[9], llllllllllllIllIIIIlIIIlllIlllII);
            return new String(llllllllllllIllIIIIlIIIlllIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIIIlllIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIIIlllIllIlI) {
            llllllllllllIllIIIIlIIIlllIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIIlllIIlII(final int llllllllllllIllIIIIlIIIlllIIlllI) {
        return llllllllllllIllIIIIlIIIlllIIlllI != 0;
    }
    
    private static String lIIlllIIllIllIIl(String llllllllllllIllIIIIlIIIllllIlIIl, final String llllllllllllIllIIIIlIIIllllIlIII) {
        llllllllllllIllIIIIlIIIllllIlIIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIIlIIIllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlIIIllllIllII = new StringBuilder();
        final char[] llllllllllllIllIIIIlIIIllllIlIll = llllllllllllIllIIIIlIIIllllIlIII.toCharArray();
        int llllllllllllIllIIIIlIIIllllIlIlI = Color.lllIIIIllIllII[8];
        final short llllllllllllIllIIIIlIIIllllIIlII = (Object)llllllllllllIllIIIIlIIIllllIlIIl.toCharArray();
        final double llllllllllllIllIIIIlIIIllllIIIll = llllllllllllIllIIIIlIIIllllIIlII.length;
        char llllllllllllIllIIIIlIIIllllIIIlI = (char)Color.lllIIIIllIllII[8];
        while (lIIlllIIlllIIlIl(llllllllllllIllIIIIlIIIllllIIIlI, (int)llllllllllllIllIIIIlIIIllllIIIll)) {
            final char llllllllllllIllIIIIlIIIllllIllll = llllllllllllIllIIIIlIIIllllIIlII[llllllllllllIllIIIIlIIIllllIIIlI];
            llllllllllllIllIIIIlIIIllllIllII.append((char)(llllllllllllIllIIIIlIIIllllIllll ^ llllllllllllIllIIIIlIIIllllIlIll[llllllllllllIllIIIIlIIIllllIlIlI % llllllllllllIllIIIIlIIIllllIlIll.length]));
            "".length();
            ++llllllllllllIllIIIIlIIIllllIlIlI;
            ++llllllllllllIllIIIIlIIIllllIIIlI;
            "".length();
            if (((54 + 105 + 13 + 69 ^ 163 + 107 - 147 + 41) & (72 + 134 - 13 + 50 ^ 38 + 47 - 28 + 109 ^ -" ".length())) > ((60 + 89 - 103 + 141 ^ 94 + 25 - 95 + 105) & (158 + 166 - 279 + 139 ^ 65 + 115 - 122 + 72 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlIIIllllIllII);
    }
    
    private static boolean lIIlllIIlllIIlIl(final int llllllllllllIllIIIIlIIIlllIlIIIl, final int llllllllllllIllIIIIlIIIlllIlIIII) {
        return llllllllllllIllIIIIlIIIlllIlIIIl < llllllllllllIllIIIIlIIIlllIlIIII;
    }
    
    public Color(final int llllllllllllIllIIIIlIIlIIlllIlll, final int llllllllllllIllIIIIlIIlIIlllIllI, final int llllllllllllIllIIIIlIIlIIllllIlI, final int llllllllllllIllIIIIlIIlIIllllIIl) {
        this.GL = Renderer.get();
        this.a = 1.0f;
        this.r = llllllllllllIllIIIIlIIlIIlllIlll / 255.0f;
        this.g = llllllllllllIllIIIIlIIlIIlllIllI / 255.0f;
        this.b = llllllllllllIllIIIIlIIlIIllllIlI / 255.0f;
        this.a = llllllllllllIllIIIIlIIlIIllllIIl / 255.0f;
    }
    
    public Color(final float llllllllllllIllIIIIlIIlIlIlIIlII, final float llllllllllllIllIIIIlIIlIlIlIIIll, final float llllllllllllIllIIIIlIIlIlIlIIIlI) {
        this.GL = Renderer.get();
        this.a = 1.0f;
        this.r = llllllllllllIllIIIIlIIlIlIlIIlII;
        this.g = llllllllllllIllIIIIlIIlIlIlIIIll;
        this.b = llllllllllllIllIIIIlIIlIlIlIIIlI;
        this.a = 1.0f;
    }
    
    private static boolean lIIlllIIlllIIIlI(final int llllllllllllIllIIIIlIIIlllIIllII) {
        return llllllllllllIllIIIIlIIIlllIIllII == 0;
    }
    
    @Override
    public int hashCode() {
        return (int)(this.r + this.g + this.b + this.a) * Color.lllIIIIllIllII[4];
    }
    
    private static int lIIlllIIlllIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIIlllIIlllIIIII() {
        (lllIIIIllIllII = new int[15])[0] = (-(0xFFFFDBFA & 0x6CAD) & (0xFFFFC8A7 & 0xFF7FFF));
        Color.lllIIIIllIllII[1] = (0x16 ^ 0x5E ^ (0x31 ^ 0x69));
        Color.lllIIIIllIllII[2] = (-(102 + 68 - 142 + 110) & (0xFFFFFF8F & 0xFFF9));
        Color.lllIIIIllIllII[3] = (0xB3 ^ 0xBB);
        Color.lllIIIIllIllII[4] = 159 + 169 - 93 + 20;
        Color.lllIIIIllIllII[5] = -(0xFFFFC740 & 0x10038BF);
        Color.lllIIIIllIllII[6] = (0x3B ^ 0x23);
        Color.lllIIIIllIllII[7] = " ".length();
        Color.lllIIIIllIllII[8] = ((41 + 102 - 35 + 47 ^ 102 + 76 - 167 + 165) & ("   ".length() ^ (0x6F ^ 0x47) ^ -" ".length()));
        Color.lllIIIIllIllII[9] = "  ".length();
        Color.lllIIIIllIllII[10] = "   ".length();
        Color.lllIIIIllIllII[11] = (0xB7 ^ 0xB3);
        Color.lllIIIIllIllII[12] = 129 + 57 - 165 + 154;
        Color.lllIIIIllIllII[13] = 157 + 156 - 189 + 76;
        Color.lllIIIIllIllII[14] = (0x98 ^ 0x9D);
    }
    
    static {
        lIIlllIIlllIIIII();
        lIIlllIIllIllIll();
        transparent = new Color(0.0f, 0.0f, 0.0f, 0.0f);
        white = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        yellow = new Color(1.0f, 1.0f, 0.0f, 1.0f);
        red = new Color(1.0f, 0.0f, 0.0f, 1.0f);
        blue = new Color(0.0f, 0.0f, 1.0f, 1.0f);
        green = new Color(0.0f, 1.0f, 0.0f, 1.0f);
        black = new Color(0.0f, 0.0f, 0.0f, 1.0f);
        gray = new Color(0.5f, 0.5f, 0.5f, 1.0f);
        cyan = new Color(0.0f, 1.0f, 1.0f, 1.0f);
        darkGray = new Color(0.3f, 0.3f, 0.3f, 1.0f);
        lightGray = new Color(0.7f, 0.7f, 0.7f, 1.0f);
        pink = new Color(Color.lllIIIIllIllII[4], Color.lllIIIIllIllII[12], Color.lllIIIIllIllII[12], Color.lllIIIIllIllII[4]);
        orange = new Color(Color.lllIIIIllIllII[4], Color.lllIIIIllIllII[13], Color.lllIIIIllIllII[8], Color.lllIIIIllIllII[4]);
        magenta = new Color(Color.lllIIIIllIllII[4], Color.lllIIIIllIllII[8], Color.lllIIIIllIllII[4], Color.lllIIIIllIllII[4]);
    }
    
    public int getGreenByte() {
        return (int)(this.g * 255.0f);
    }
    
    public Color addToCopy(final Color llllllllllllIllIIIIlIIlIIIIIIllI) {
        final Color color;
        final Color llllllllllllIllIIIIlIIlIIIIIIlIl = color = new Color(this.r, this.g, this.b, this.a);
        color.r += llllllllllllIllIIIIlIIlIIIIIIllI.r;
        final Color color2 = llllllllllllIllIIIIlIIlIIIIIIlIl;
        color2.g += llllllllllllIllIIIIlIIlIIIIIIllI.g;
        final Color color3 = llllllllllllIllIIIIlIIlIIIIIIlIl;
        color3.b += llllllllllllIllIIIIlIIlIIIIIIllI.b;
        final Color color4 = llllllllllllIllIIIIlIIlIIIIIIlIl;
        color4.a += llllllllllllIllIIIIlIIlIIIIIIllI.a;
        return llllllllllllIllIIIIlIIlIIIIIIlIl;
    }
    
    public Color(final Color llllllllllllIllIIIIlIIlIlIllIIII) {
        this.GL = Renderer.get();
        this.a = 1.0f;
        this.r = llllllllllllIllIIIIlIIlIlIllIIII.r;
        this.g = llllllllllllIllIIIIlIIlIlIllIIII.g;
        this.b = llllllllllllIllIIIIlIIlIlIllIIII.b;
        this.a = llllllllllllIllIIIIlIIlIlIllIIII.a;
    }
    
    public int getBlue() {
        return (int)(this.b * 255.0f);
    }
    
    public int getBlueByte() {
        return (int)(this.b * 255.0f);
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIIIIlIIlIIlIlIIll) {
        if (lIIlllIIlllIIlII((llllllllllllIllIIIIlIIlIIlIlIIll instanceof Color) ? 1 : 0)) {
            final Color llllllllllllIllIIIIlIIlIIlIlIlIl = (Color)llllllllllllIllIIIIlIIlIIlIlIIll;
            int n;
            if (lIIlllIIlllIIIlI(lIIlllIIlllIIIll(llllllllllllIllIIIIlIIlIIlIlIlIl.r, this.r)) && lIIlllIIlllIIIlI(lIIlllIIlllIIIll(llllllllllllIllIIIIlIIlIIlIlIlIl.g, this.g)) && lIIlllIIlllIIIlI(lIIlllIIlllIIIll(llllllllllllIllIIIIlIIlIIlIlIlIl.b, this.b)) && lIIlllIIlllIIIlI(lIIlllIIlllIIIll(llllllllllllIllIIIIlIIlIIlIlIlIl.a, this.a))) {
                n = Color.lllIIIIllIllII[7];
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return ((0x2B ^ 0x4F ^ (0xE3 ^ 0x91)) & (0x3B ^ 0x14 ^ (0x5B ^ 0x62) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = Color.lllIIIIllIllII[8];
            }
            return n != 0;
        }
        return Color.lllIIIIllIllII[8] != 0;
    }
    
    public void add(final Color llllllllllllIllIIIIlIIlIIIIlIIll) {
        this.r += llllllllllllIllIIIIlIIlIIIIlIIll.r;
        this.g += llllllllllllIllIIIIlIIlIIIIlIIll.g;
        this.b += llllllllllllIllIIIIlIIlIIIIlIIll.b;
        this.a += llllllllllllIllIIIIlIIlIIIIlIIll.a;
    }
    
    public int getAlphaByte() {
        return (int)(this.a * 255.0f);
    }
    
    public int getGreen() {
        return (int)(this.g * 255.0f);
    }
    
    public int getAlpha() {
        return (int)(this.a * 255.0f);
    }
    
    public Color multiply(final Color llllllllllllIllIIIIlIIlIIIIlIlll) {
        return new Color(this.r * llllllllllllIllIIIIlIIlIIIIlIlll.r, this.g * llllllllllllIllIIIIlIIlIIIIlIlll.g, this.b * llllllllllllIllIIIIlIIlIIIIlIlll.b, this.a * llllllllllllIllIIIIlIIlIIIIlIlll.a);
    }
    
    public int getRed() {
        return (int)(this.r * 255.0f);
    }
    
    private static boolean lIIlllIIlllIIIIl(final int llllllllllllIllIIIIlIIIlllIIlIlI) {
        return llllllllllllIllIIIIlIIIlllIIlIlI < 0;
    }
    
    public Color scaleCopy(final float llllllllllllIllIIIIlIIIllllllIlI) {
        final Color color;
        final Color llllllllllllIllIIIIlIIIlllllllII = color = new Color(this.r, this.g, this.b, this.a);
        color.r *= llllllllllllIllIIIIlIIIllllllIlI;
        final Color color2 = llllllllllllIllIIIIlIIIlllllllII;
        color2.g *= llllllllllllIllIIIIlIIIllllllIlI;
        final Color color3 = llllllllllllIllIIIIlIIIlllllllII;
        color3.b *= llllllllllllIllIIIIlIIIllllllIlI;
        final Color color4 = llllllllllllIllIIIIlIIIlllllllII;
        color4.a *= llllllllllllIllIIIIlIIIllllllIlI;
        return llllllllllllIllIIIIlIIIlllllllII;
    }
    
    public Color darker() {
        return this.darker(0.5f);
    }
}
