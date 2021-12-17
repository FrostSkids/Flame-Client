// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.Color;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.AngelCodeFont;
import java.util.ArrayList;
import org.newdawn.slick.BasicGame;

public class FontPerformanceTest extends BasicGame
{
    private /* synthetic */ ArrayList lines;
    private /* synthetic */ AngelCodeFont font;
    private static final /* synthetic */ int[] lIlIllIIlIIIlI;
    private /* synthetic */ boolean visible;
    private /* synthetic */ String text;
    private static final /* synthetic */ String[] lIlIllIIlIIIIl;
    
    public FontPerformanceTest() {
        super(FontPerformanceTest.lIlIllIIlIIIIl[FontPerformanceTest.lIlIllIIlIIIlI[0]]);
        this.text = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin bibendum. Aliquam ac sapien a elit congue iaculis. Quisque et justo quis mi mattis euismod. Donec elementum, mi quis aliquet varius, nisi leo volutpat magna, quis ultricies eros augue at risus. Integer non magna at lorem sodales molestie. Integer diam nulla, ornare sit amet, mattis quis, euismod et, mauris. Proin eget tellus non nisl mattis laoreet. Nunc at nunc id elit pretium tempor. Duis vulputate, nibh eget rhoncus eleifend, tellus lectus sollicitudin mi, rhoncus tincidunt nisi massa vitae ipsum. Praesent tellus diam, luctus ut, eleifend nec, auctor et, orci. Praesent eu elit. Pellentesque ante orci, volutpat placerat, ornare eget, cursus sit amet, eros. Duis pede sapien, euismod a, volutpat pellentesque, convallis eu, mauris. Nunc eros. Ut eu risus et felis laoreet viverra. Curabitur a metus.";
        this.lines = new ArrayList();
        this.visible = (FontPerformanceTest.lIlIllIIlIIIlI[1] != 0);
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIIlllIIIllllIIlII, final int lllllllllllllIIIIlllIIIllllIIIll) throws SlickException {
    }
    
    private static boolean llllIIIIllIIIll(final int lllllllllllllIIIIlllIIIllIlIIlll, final int lllllllllllllIIIIlllIIIllIlIIllI) {
        return lllllllllllllIIIIlllIIIllIlIIlll > lllllllllllllIIIIlllIIIllIlIIllI;
    }
    
    private static boolean llllIIIIllIIllI(final int lllllllllllllIIIIlllIIIllIlIIIlI) {
        return lllllllllllllIIIIlllIIIllIlIIIlI == 0;
    }
    
    public void render(final GameContainer lllllllllllllIIIIlllIIIllllIlIlI, final Graphics lllllllllllllIIIIlllIIIllllIlIIl) {
        lllllllllllllIIIIlllIIIllllIlIIl.setFont(this.font);
        if (llllIIIIllIIlII(this.visible ? 1 : 0)) {
            int lllllllllllllIIIIlllIIIllllIllII = FontPerformanceTest.lIlIllIIlIIIlI[0];
            while (llllIIIIllIIIlI(lllllllllllllIIIIlllIIIllllIllII, this.lines.size())) {
                final AngelCodeFont font = this.font;
                final float lllllllllllllIIlIIIllllIllllIIII = 10.0f;
                final float lllllllllllllIIlIIIllllIlllIllll = (float)(FontPerformanceTest.lIlIllIIlIIIlI[5] + lllllllllllllIIIIlllIIIllllIllII * FontPerformanceTest.lIlIllIIlIIIlI[6]);
                final String lllllllllllllIIlIIIllllIllllIIll = this.lines.get(lllllllllllllIIIIlllIIIllllIllII);
                Color lllllllllllllIIlIIIllllIlllIllIl;
                if (llllIIIIllIIIll(lllllllllllllIIIIlllIIIllllIllII, FontPerformanceTest.lIlIllIIlIIIlI[7])) {
                    lllllllllllllIIlIIIllllIlllIllIl = Color.red;
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlIIIllllIlllIllIl = Color.green;
                }
                font.drawString(lllllllllllllIIlIIIllllIllllIIII, lllllllllllllIIlIIIllllIlllIllll, lllllllllllllIIlIIIllllIllllIIll, lllllllllllllIIlIIIllllIlllIllIl);
                ++lllllllllllllIIIIlllIIIllllIllII;
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
        }
    }
    
    private static boolean llllIIIIllIIlII(final int lllllllllllllIIIIlllIIIllIlIIlII) {
        return lllllllllllllIIIIlllIIIllIlIIlII != 0;
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIIIIlllIIIlllIlllll, final char lllllllllllllIIIIlllIIIlllIllllI) {
        if (llllIIIIllIIlIl(lllllllllllllIIIIlllIIIlllIlllll, FontPerformanceTest.lIlIllIIlIIIlI[1])) {
            System.exit(FontPerformanceTest.lIlIllIIlIIIlI[0]);
        }
        if (llllIIIIllIIlIl(lllllllllllllIIIIlllIIIlllIlllll, FontPerformanceTest.lIlIllIIlIIIlI[8])) {
            int visible;
            if (llllIIIIllIIllI(this.visible ? 1 : 0)) {
                visible = FontPerformanceTest.lIlIllIIlIIIlI[1];
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                visible = FontPerformanceTest.lIlIllIIlIIIlI[0];
            }
            this.visible = (visible != 0);
        }
    }
    
    private static String llllIIIIlIlllll(String lllllllllllllIIIIlllIIIllIlllIlI, final String lllllllllllllIIIIlllIIIllIlllIIl) {
        lllllllllllllIIIIlllIIIllIlllIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlllIIIllIllllIl = new StringBuilder();
        final char[] lllllllllllllIIIIlllIIIllIllllII = lllllllllllllIIIIlllIIIllIlllIIl.toCharArray();
        int lllllllllllllIIIIlllIIIllIlllIll = FontPerformanceTest.lIlIllIIlIIIlI[0];
        final String lllllllllllllIIIIlllIIIllIllIlIl = (Object)lllllllllllllIIIIlllIIIllIlllIlI.toCharArray();
        final int lllllllllllllIIIIlllIIIllIllIlII = lllllllllllllIIIIlllIIIllIllIlIl.length;
        char lllllllllllllIIIIlllIIIllIllIIll = (char)FontPerformanceTest.lIlIllIIlIIIlI[0];
        while (llllIIIIllIIIlI(lllllllllllllIIIIlllIIIllIllIIll, lllllllllllllIIIIlllIIIllIllIlII)) {
            final char lllllllllllllIIIIlllIIIlllIIIIII = lllllllllllllIIIIlllIIIllIllIlIl[lllllllllllllIIIIlllIIIllIllIIll];
            lllllllllllllIIIIlllIIIllIllllIl.append((char)(lllllllllllllIIIIlllIIIlllIIIIII ^ lllllllllllllIIIIlllIIIllIllllII[lllllllllllllIIIIlllIIIllIlllIll % lllllllllllllIIIIlllIIIllIllllII.length]));
            "".length();
            ++lllllllllllllIIIIlllIIIllIlllIll;
            ++lllllllllllllIIIIlllIIIllIllIIll;
            "".length();
            if ((7 + 18 + 102 + 21 ^ 57 + 143 - 104 + 48) <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlllIIIllIllllIl);
    }
    
    public static void main(final String[] lllllllllllllIIIIlllIIIlllIllIII) {
        try {
            final AppGameContainer lllllllllllllIIIIlllIIIlllIllIlI = new AppGameContainer(new FontPerformanceTest());
            lllllllllllllIIIIlllIIIlllIllIlI.setDisplayMode(FontPerformanceTest.lIlIllIIlIIIlI[9], FontPerformanceTest.lIlIllIIlIIIlI[10], (boolean)(FontPerformanceTest.lIlIllIIlIIIlI[0] != 0));
            lllllllllllllIIIIlllIIIlllIllIlI.start();
            "".length();
            if (((0x66 ^ 0x61) & ~(0x39 ^ 0x3E)) <= -" ".length()) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIIlllIIIlllIllIIl) {
            lllllllllllllIIIIlllIIIlllIllIIl.printStackTrace();
        }
    }
    
    private static boolean llllIIIIllIIlIl(final int lllllllllllllIIIIlllIIIllIlIllll, final int lllllllllllllIIIIlllIIIllIlIlllI) {
        return lllllllllllllIIIIlllIIIllIlIllll == lllllllllllllIIIIlllIIIllIlIlllI;
    }
    
    private static void llllIIIIllIIIIl() {
        (lIlIllIIlIIIlI = new int[13])[0] = ((0x4E ^ 0x1D) & ~(0x67 ^ 0x34));
        FontPerformanceTest.lIlIllIIlIIIlI[1] = " ".length();
        FontPerformanceTest.lIlIllIIlIIIlI[2] = "  ".length();
        FontPerformanceTest.lIlIllIIlIIIlI[3] = ("   ".length() ^ (0xCD ^ 0x94));
        FontPerformanceTest.lIlIllIIlIIIlI[4] = "   ".length();
        FontPerformanceTest.lIlIllIIlIIIlI[5] = (0x73 ^ 0x41);
        FontPerformanceTest.lIlIllIIlIIIlI[6] = (0xF ^ 0x1B);
        FontPerformanceTest.lIlIllIIlIIIlI[7] = (0x96 ^ 0x9C);
        FontPerformanceTest.lIlIllIIlIIIlI[8] = (153 + 47 - 102 + 65 ^ 148 + 37 - 73 + 42);
        FontPerformanceTest.lIlIllIIlIIIlI[9] = (-(0xFFFFFEF1 & 0x4D5E) & (0xFFFFCF6F & 0x7FFF));
        FontPerformanceTest.lIlIllIIlIIIlI[10] = (-(0xFFFFF8D5 & 0x67AB) & (0xFFFFEEF9 & 0x73DE));
        FontPerformanceTest.lIlIllIIlIIIlI[11] = (0x7A ^ 0xC ^ (0x4C ^ 0x3E));
        FontPerformanceTest.lIlIllIIlIIIlI[12] = (((0x56 ^ 0x69) & ~(0xB3 ^ 0x8C)) ^ (0x54 ^ 0x5C));
    }
    
    private static void llllIIIIllIIIII() {
        (lIlIllIIlIIIIl = new String[FontPerformanceTest.lIlIllIIlIIIlI[11]])[FontPerformanceTest.lIlIllIIlIIIlI[0]] = llllIIIIlIllllI("Vha09LiZ2sxnnkzb9Yuja463Vx1eowIA", "OxGLt");
        FontPerformanceTest.lIlIllIIlIIIIl[FontPerformanceTest.lIlIllIIlIIIlI[1]] = llllIIIIlIllllI("UWcLjIoNthLz+4BpJ9GZJGgjjzE+MKxq", "RlNGL");
        FontPerformanceTest.lIlIllIIlIIIIl[FontPerformanceTest.lIlIllIIlIIIlI[2]] = llllIIIIlIlllll("PRYWJTIoBwR+JiwBAzc5JwdLITgu", "IseQV");
        FontPerformanceTest.lIlIllIIlIIIIl[FontPerformanceTest.lIlIllIIlIIIlI[4]] = llllIIIIlIllllI("T+kEhKzweBk=", "FNsdo");
    }
    
    private static boolean llllIIIIllIIIlI(final int lllllllllllllIIIIlllIIIllIlIlIll, final int lllllllllllllIIIIlllIIIllIlIlIlI) {
        return lllllllllllllIIIIlllIIIllIlIlIll < lllllllllllllIIIIlllIIIllIlIlIlI;
    }
    
    static {
        llllIIIIllIIIIl();
        llllIIIIllIIIII();
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIIlllIIIlllllIlII) throws SlickException {
        this.font = new AngelCodeFont(FontPerformanceTest.lIlIllIIlIIIIl[FontPerformanceTest.lIlIllIIlIIIlI[1]], FontPerformanceTest.lIlIllIIlIIIIl[FontPerformanceTest.lIlIllIIlIIIlI[2]]);
        int lllllllllllllIIIIlllIIIlllllIllI = FontPerformanceTest.lIlIllIIlIIIlI[0];
        while (llllIIIIllIIIlI(lllllllllllllIIIIlllIIIlllllIllI, FontPerformanceTest.lIlIllIIlIIIlI[2])) {
            int lllllllllllllIIIIlllIIIlllllIlll = FontPerformanceTest.lIlIllIIlIIIlI[3];
            int lllllllllllllIIIIlllIIIllllllIII = FontPerformanceTest.lIlIllIIlIIIlI[0];
            while (llllIIIIllIIIlI(lllllllllllllIIIIlllIIIllllllIII, this.text.length())) {
                if (llllIIIIllIIIll(lllllllllllllIIIIlllIIIllllllIII + lllllllllllllIIIIlllIIIlllllIlll, this.text.length())) {
                    lllllllllllllIIIIlllIIIlllllIlll = this.text.length() - lllllllllllllIIIIlllIIIllllllIII;
                }
                this.lines.add(this.text.substring(lllllllllllllIIIIlllIIIllllllIII, lllllllllllllIIIIlllIIIllllllIII + lllllllllllllIIIIlllIIIlllllIlll));
                "".length();
                lllllllllllllIIIIlllIIIllllllIII += lllllllllllllIIIIlllIIIlllllIlll;
                "".length();
                if ("   ".length() < -" ".length()) {
                    return;
                }
            }
            this.lines.add(FontPerformanceTest.lIlIllIIlIIIIl[FontPerformanceTest.lIlIllIIlIIIlI[4]]);
            "".length();
            ++lllllllllllllIIIIlllIIIlllllIllI;
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
    }
    
    private static String llllIIIIlIllllI(final String lllllllllllllIIIIlllIIIlllIIllIl, final String lllllllllllllIIIIlllIIIlllIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIIIlllIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIIlllIIlllI.getBytes(StandardCharsets.UTF_8)), FontPerformanceTest.lIlIllIIlIIIlI[12]), "DES");
            final Cipher lllllllllllllIIIIlllIIIlllIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIlllIIIlllIlIIIl.init(FontPerformanceTest.lIlIllIIlIIIlI[2], lllllllllllllIIIIlllIIIlllIlIIlI);
            return new String(lllllllllllllIIIIlllIIIlllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIlllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIIIlllIlIIII) {
            lllllllllllllIIIIlllIIIlllIlIIII.printStackTrace();
            return null;
        }
    }
}
