// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.TrueTypeFont;
import java.awt.Font;
import java.util.ArrayList;
import org.newdawn.slick.BasicGame;

public class TrueTypeFontPerformanceTest extends BasicGame
{
    private /* synthetic */ boolean visible;
    private static final /* synthetic */ int[] lllIIlIIIlllIl;
    private /* synthetic */ ArrayList lines;
    private static final /* synthetic */ String[] lllIIlIIIlIlll;
    private /* synthetic */ String text;
    private /* synthetic */ Font awtFont;
    private /* synthetic */ TrueTypeFont font;
    
    public static void main(final String[] llllllllllllIlIlllllIIIIIllllIII) {
        try {
            final AppGameContainer llllllllllllIlIlllllIIIIIllllIlI = new AppGameContainer(new TrueTypeFontPerformanceTest());
            llllllllllllIlIlllllIIIIIllllIlI.setDisplayMode(TrueTypeFontPerformanceTest.lllIIlIIIlllIl[9], TrueTypeFontPerformanceTest.lllIIlIIIlllIl[10], (boolean)(TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0] != 0));
            llllllllllllIlIlllllIIIIIllllIlI.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIlllllIIIIIllllIIl) {
            llllllllllllIlIlllllIIIIIllllIIl.printStackTrace();
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlIlllllIIIIlIIlIlII) throws SlickException {
        this.awtFont = new Font(TrueTypeFontPerformanceTest.lllIIlIIIlIlll[TrueTypeFontPerformanceTest.lllIIlIIIlllIl[1]], TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0], TrueTypeFontPerformanceTest.lllIIlIIIlllIl[2]);
        this.font = new TrueTypeFont(this.awtFont, (boolean)(TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0] != 0));
        int llllllllllllIlIlllllIIIIlIIlIllI = TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0];
        while (lIIlllllIIIIlIII(llllllllllllIlIlllllIIIIlIIlIllI, TrueTypeFontPerformanceTest.lllIIlIIIlllIl[3])) {
            int llllllllllllIlIlllllIIIIlIIlIlll = TrueTypeFontPerformanceTest.lllIIlIIIlllIl[4];
            int llllllllllllIlIlllllIIIIlIIllIII = TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0];
            while (lIIlllllIIIIlIII(llllllllllllIlIlllllIIIIlIIllIII, this.text.length())) {
                if (lIIlllllIIIIlIIl(llllllllllllIlIlllllIIIIlIIllIII + llllllllllllIlIlllllIIIIlIIlIlll, this.text.length())) {
                    llllllllllllIlIlllllIIIIlIIlIlll = this.text.length() - llllllllllllIlIlllllIIIIlIIllIII;
                }
                this.lines.add(this.text.substring(llllllllllllIlIlllllIIIIlIIllIII, llllllllllllIlIlllllIIIIlIIllIII + llllllllllllIlIlllllIIIIlIIlIlll));
                "".length();
                llllllllllllIlIlllllIIIIlIIllIII += llllllllllllIlIlllllIIIIlIIlIlll;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            this.lines.add(TrueTypeFontPerformanceTest.lllIIlIIIlIlll[TrueTypeFontPerformanceTest.lllIIlIIIlllIl[3]]);
            "".length();
            ++llllllllllllIlIlllllIIIIlIIlIllI;
            "".length();
            if ((0xAB ^ 0xAF) == 0x0) {
                return;
            }
        }
    }
    
    private static boolean lIIlllllIIIIlIll(final int llllllllllllIlIlllllIIIIIlIIllll, final int llllllllllllIlIlllllIIIIIlIIlllI) {
        return llllllllllllIlIlllllIIIIIlIIllll == llllllllllllIlIlllllIIIIIlIIlllI;
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlIlllllIIIIlIIIIlII, final int llllllllllllIlIlllllIIIIlIIIIIll) throws SlickException {
    }
    
    private static boolean lIIlllllIIIIlIIl(final int llllllllllllIlIlllllIIIIIlIIIlll, final int llllllllllllIlIlllllIIIIIlIIIllI) {
        return llllllllllllIlIlllllIIIIIlIIIlll > llllllllllllIlIlllllIIIIIlIIIllI;
    }
    
    private static void lIIllllIllllIIII() {
        (lllIIlIIIlIlll = new String[TrueTypeFontPerformanceTest.lllIIlIIIlllIl[11]])[TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0]] = lIIllllIlllIlllI("Ehk8Lk8EEyA8ACYbMzQMMVYGPxwg", "TvRZo");
        TrueTypeFontPerformanceTest.lllIIlIIIlIlll[TrueTypeFontPerformanceTest.lllIIlIIIlllIl[1]] = lIIllllIlllIllll("JP8ZHSzYQnE=", "ThErl");
        TrueTypeFontPerformanceTest.lllIIlIIIlIlll[TrueTypeFontPerformanceTest.lllIIlIIIlllIl[3]] = lIIllllIlllIllll("f0AwbyzKhTc=", "EFEMO");
    }
    
    private static String lIIllllIlllIlllI(String llllllllllllIlIlllllIIIIIllIIlll, final String llllllllllllIlIlllllIIIIIllIlIll) {
        llllllllllllIlIlllllIIIIIllIIlll = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIlIlllllIIIIIllIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllIIIIIllIlIlI = new StringBuilder();
        final char[] llllllllllllIlIlllllIIIIIllIlIIl = llllllllllllIlIlllllIIIIIllIlIll.toCharArray();
        int llllllllllllIlIlllllIIIIIllIlIII = TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0];
        final long llllllllllllIlIlllllIIIIIllIIIlI = (Object)((String)llllllllllllIlIlllllIIIIIllIIlll).toCharArray();
        final float llllllllllllIlIlllllIIIIIllIIIIl = llllllllllllIlIlllllIIIIIllIIIlI.length;
        char llllllllllllIlIlllllIIIIIllIIIII = (char)TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0];
        while (lIIlllllIIIIlIII(llllllllllllIlIlllllIIIIIllIIIII, (int)llllllllllllIlIlllllIIIIIllIIIIl)) {
            final char llllllllllllIlIlllllIIIIIllIllIl = llllllllllllIlIlllllIIIIIllIIIlI[llllllllllllIlIlllllIIIIIllIIIII];
            llllllllllllIlIlllllIIIIIllIlIlI.append((char)(llllllllllllIlIlllllIIIIIllIllIl ^ llllllllllllIlIlllllIIIIIllIlIIl[llllllllllllIlIlllllIIIIIllIlIII % llllllllllllIlIlllllIIIIIllIlIIl.length]));
            "".length();
            ++llllllllllllIlIlllllIIIIIllIlIII;
            ++llllllllllllIlIlllllIIIIIllIIIII;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllIIIIIllIlIlI);
    }
    
    public TrueTypeFontPerformanceTest() {
        super(TrueTypeFontPerformanceTest.lllIIlIIIlIlll[TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0]]);
        this.text = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Proin bibendum. Aliquam ac sapien a elit congue iaculis. Quisque et justo quis mi mattis euismod. Donec elementum, mi quis aliquet varius, nisi leo volutpat magna, quis ultricies eros augue at risus. Integer non magna at lorem sodales molestie. Integer diam nulla, ornare sit amet, mattis quis, euismod et, mauris. Proin eget tellus non nisl mattis laoreet. Nunc at nunc id elit pretium tempor. Duis vulputate, nibh eget rhoncus eleifend, tellus lectus sollicitudin mi, rhoncus tincidunt nisi massa vitae ipsum. Praesent tellus diam, luctus ut, eleifend nec, auctor et, orci. Praesent eu elit. Pellentesque ante orci, volutpat placerat, ornare eget, cursus sit amet, eros. Duis pede sapien, euismod a, volutpat pellentesque, convallis eu, mauris. Nunc eros. Ut eu risus et felis laoreet viverra. Curabitur a metus.";
        this.lines = new ArrayList();
        this.visible = (TrueTypeFontPerformanceTest.lllIIlIIIlllIl[1] != 0);
    }
    
    private static boolean lIIlllllIIIIlIlI(final int llllllllllllIlIlllllIIIIIlIIIlII) {
        return llllllllllllIlIlllllIIIIIlIIIlII != 0;
    }
    
    private static void lIIlllllIIIIIlll() {
        (lllIIlIIIlllIl = new int[12])[0] = ((0x67 ^ 0x49) & ~(0x31 ^ 0x1F));
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[1] = " ".length();
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[2] = (0xDC ^ 0x8A ^ (0x58 ^ 0x1E));
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[3] = "  ".length();
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[4] = (0x3B ^ 0x61);
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[5] = (0x5D ^ 0x6F);
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[6] = (0x74 ^ 0x60);
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[7] = (0xA5 ^ 0x85 ^ (0xB0 ^ 0x9A));
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[8] = (0x88 ^ 0xC7 ^ (0x28 ^ 0x5E));
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[9] = (0xFFFF83A0 & 0x7F7F);
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[10] = (0xFFFFB3DE & 0x4E79);
        TrueTypeFontPerformanceTest.lllIIlIIIlllIl[11] = "   ".length();
    }
    
    public void render(final GameContainer llllllllllllIlIlllllIIIIlIIIlIlI, final Graphics llllllllllllIlIlllllIIIIlIIIIlll) {
        llllllllllllIlIlllllIIIIlIIIIlll.setFont(this.font);
        if (lIIlllllIIIIlIlI(this.visible ? 1 : 0)) {
            int llllllllllllIlIlllllIIIIlIIIllII = TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0];
            while (lIIlllllIIIIlIII(llllllllllllIlIlllllIIIIlIIIllII, this.lines.size())) {
                final TrueTypeFont font = this.font;
                final float lllllllllllllIIIIlllllIIIlIIlIlI = 10.0f;
                final float lllllllllllllIIIIlllllIIIlIIllll = (float)(TrueTypeFontPerformanceTest.lllIIlIIIlllIl[5] + llllllllllllIlIlllllIIIIlIIIllII * TrueTypeFontPerformanceTest.lllIIlIIIlllIl[6]);
                final String lllllllllllllIIIIlllllIIIlIIllIl = this.lines.get(llllllllllllIlIlllllIIIIlIIIllII);
                Color lllllllllllllIIIIlllllIIIlIIIllI;
                if (lIIlllllIIIIlIIl(llllllllllllIlIlllllIIIIlIIIllII, TrueTypeFontPerformanceTest.lllIIlIIIlllIl[7])) {
                    lllllllllllllIIIIlllllIIIlIIIllI = Color.red;
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIIlllllIIIlIIIllI = Color.green;
                }
                font.drawString(lllllllllllllIIIIlllllIIIlIIlIlI, lllllllllllllIIIIlllllIIIlIIllll, lllllllllllllIIIIlllllIIIlIIllIl, lllllllllllllIIIIlllllIIIlIIIllI);
                ++llllllllllllIlIlllllIIIIlIIIllII;
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
    }
    
    @Override
    public void keyPressed(final int llllllllllllIlIlllllIIIIIlllllll, final char llllllllllllIlIlllllIIIIIllllllI) {
        if (lIIlllllIIIIlIll(llllllllllllIlIlllllIIIIIlllllll, TrueTypeFontPerformanceTest.lllIIlIIIlllIl[1])) {
            System.exit(TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0]);
        }
        if (lIIlllllIIIIlIll(llllllllllllIlIlllllIIIIIlllllll, TrueTypeFontPerformanceTest.lllIIlIIIlllIl[8])) {
            int visible;
            if (lIIlllllIIIIllII(this.visible ? 1 : 0)) {
                visible = TrueTypeFontPerformanceTest.lllIIlIIIlllIl[1];
                "".length();
                if (((0x78 ^ 0x74) & ~(0xB1 ^ 0xBD)) == " ".length()) {
                    return;
                }
            }
            else {
                visible = TrueTypeFontPerformanceTest.lllIIlIIIlllIl[0];
            }
            this.visible = (visible != 0);
        }
    }
    
    static {
        lIIlllllIIIIIlll();
        lIIllllIllllIIII();
    }
    
    private static boolean lIIlllllIIIIlIII(final int llllllllllllIlIlllllIIIIIlIIlIll, final int llllllllllllIlIlllllIIIIIlIIlIlI) {
        return llllllllllllIlIlllllIIIIIlIIlIll < llllllllllllIlIlllllIIIIIlIIlIlI;
    }
    
    private static String lIIllllIlllIllll(final String llllllllllllIlIlllllIIIIIlIlIlIl, final String llllllllllllIlIlllllIIIIIlIlIlII) {
        try {
            final SecretKeySpec llllllllllllIlIlllllIIIIIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllllIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllllIIIIIlIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllllIIIIIlIllIIl.init(TrueTypeFontPerformanceTest.lllIIlIIIlllIl[3], llllllllllllIlIlllllIIIIIlIllIlI);
            return new String(llllllllllllIlIlllllIIIIIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllllIIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllllIIIIIlIllIII) {
            llllllllllllIlIlllllIIIIIlIllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllllIIIIllII(final int llllllllllllIlIlllllIIIIIlIIIIlI) {
        return llllllllllllIlIlllllIIIIIlIIIIlI == 0;
    }
}
