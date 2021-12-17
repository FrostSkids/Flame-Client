// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.util.FastTrig;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.Image;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.BasicGame;

public class GraphicsTest extends BasicGame
{
    private /* synthetic */ GameContainer container;
    private /* synthetic */ float ang;
    private static final /* synthetic */ int[] lIIIIlllIlIlII;
    private /* synthetic */ Image image;
    private /* synthetic */ Polygon poly;
    private static final /* synthetic */ String[] lIIIIlllIIllll;
    private /* synthetic */ boolean clip;
    
    public static void main(final String[] lllllllllllllIlIIlIIIIIIIlIlIlIl) {
        try {
            final AppGameContainer lllllllllllllIlIIlIIIIIIIlIlIlll = new AppGameContainer(new GraphicsTest());
            lllllllllllllIlIIlIIIIIIIlIlIlll.setDisplayMode(GraphicsTest.lIIIIlllIlIlII[13], GraphicsTest.lIIIIlllIlIlII[14], (boolean)(GraphicsTest.lIIIIlllIlIlII[0] != 0));
            lllllllllllllIlIIlIIIIIIIlIlIlll.start();
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIIlIIIIIIIlIlIllI) {
            lllllllllllllIlIIlIIIIIIIlIlIllI.printStackTrace();
        }
    }
    
    private static boolean lIllllIIlIlllII(final int lllllllllllllIlIIlIIIIIIIIIllIII) {
        return lllllllllllllIlIIlIIIIIIIIIllIII != 0;
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIIlIIIIIIIllIIIll, final int lllllllllllllIlIIlIIIIIIIllIIIlI) {
        this.ang += lllllllllllllIlIIlIIIIIIIllIIIlI * 0.1f;
    }
    
    private static String lIllllIIlIlIIII(String lllllllllllllIlIIlIIIIIIIIllIlll, final String lllllllllllllIlIIlIIIIIIIIllIllI) {
        lllllllllllllIlIIlIIIIIIIIllIlll = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIIIIIIIIllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIIIIIIIlllIlI = new StringBuilder();
        final char[] lllllllllllllIlIIlIIIIIIIIlllIIl = lllllllllllllIlIIlIIIIIIIIllIllI.toCharArray();
        int lllllllllllllIlIIlIIIIIIIIlllIII = GraphicsTest.lIIIIlllIlIlII[0];
        final Exception lllllllllllllIlIIlIIIIIIIIllIIlI = (Object)((String)lllllllllllllIlIIlIIIIIIIIllIlll).toCharArray();
        final char lllllllllllllIlIIlIIIIIIIIllIIIl = (char)lllllllllllllIlIIlIIIIIIIIllIIlI.length;
        char lllllllllllllIlIIlIIIIIIIIllIIII = (char)GraphicsTest.lIIIIlllIlIlII[0];
        while (lIllllIIlIllIlI(lllllllllllllIlIIlIIIIIIIIllIIII, lllllllllllllIlIIlIIIIIIIIllIIIl)) {
            final char lllllllllllllIlIIlIIIIIIIIllllIl = lllllllllllllIlIIlIIIIIIIIllIIlI[lllllllllllllIlIIlIIIIIIIIllIIII];
            lllllllllllllIlIIlIIIIIIIIlllIlI.append((char)(lllllllllllllIlIIlIIIIIIIIllllIl ^ lllllllllllllIlIIlIIIIIIIIlllIIl[lllllllllllllIlIIlIIIIIIIIlllIII % lllllllllllllIlIIlIIIIIIIIlllIIl.length]));
            "".length();
            ++lllllllllllllIlIIlIIIIIIIIlllIII;
            ++lllllllllllllIlIIlIIIIIIIIllIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIIIIIIIlllIlI);
    }
    
    private static void lIllllIIlIllIII() {
        (lIIIIlllIlIlII = new int[17])[0] = ((0x3D ^ 0x7) & ~(0x1B ^ 0x21));
        GraphicsTest.lIIIIlllIlIlII[1] = " ".length();
        GraphicsTest.lIIIIlllIlIlII[2] = "  ".length();
        GraphicsTest.lIIIIlllIlIlII[3] = "   ".length();
        GraphicsTest.lIIIIlllIlIlII[4] = (123 + 114 - 175 + 171 ^ 129 + 12 - 60 + 60);
        GraphicsTest.lIIIIlllIlIlII[5] = (0xFFFFA97A & 0x57ED);
        GraphicsTest.lIIIIlllIlIlII[6] = (0x3E ^ 0x3A);
        GraphicsTest.lIIIIlllIlIlII[7] = (106 + 16 - 52 + 84 ^ 17 + 41 - 55 + 156);
        GraphicsTest.lIIIIlllIlIlII[8] = (0x9E ^ 0x98);
        GraphicsTest.lIIIIlllIlIlII[9] = (-(0xFFFFD9FC & 0x36B7) & (0xFFFFB1FF & 0x5FB7));
        GraphicsTest.lIIIIlllIlIlII[10] = (-(0xFFFFF2FB & 0x5D4C) & (0xFFFFDFD7 & 0x71FF));
        GraphicsTest.lIIIIlllIlIlII[11] = (0x1B ^ 0x11);
        GraphicsTest.lIIIIlllIlIlII[12] = (116 + 54 - 85 + 67 ^ 5 + 10 + 10 + 136);
        GraphicsTest.lIIIIlllIlIlII[13] = (0xFFFF9BFF & 0x6720);
        GraphicsTest.lIIIIlllIlIlII[14] = (-(0xFFFFC92A & 0x76FD) & (0xFFFFCA7F & 0x77FF));
        GraphicsTest.lIIIIlllIlIlII[15] = (0x9D ^ 0x9A);
        GraphicsTest.lIIIIlllIlIlII[16] = (49 + 153 - 197 + 165 ^ 14 + 60 - 70 + 158);
    }
    
    private static boolean lIllllIIlIlllIl(final int lllllllllllllIlIIlIIIIIIIIIlllll, final int lllllllllllllIlIIlIIIIIIIIIllllI) {
        return lllllllllllllIlIIlIIIIIIIIIlllll == lllllllllllllIlIIlIIIIIIIIIllllI;
    }
    
    private static int lIllllIIlIllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIllllIIlIllIll(final int lllllllllllllIlIIlIIIIIIIIIlIllI) {
        return lllllllllllllIlIIlIIIIIIIIIlIllI == 0;
    }
    
    static {
        lIllllIIlIllIII();
        lIllllIIlIlIIlI();
    }
    
    public void render(final GameContainer lllllllllllllIlIIlIIIIIIIllIlIll, final Graphics lllllllllllllIlIIlIIIIIIIllIlIII) throws SlickException {
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.white);
        lllllllllllllIlIIlIIIIIIIllIlIII.setAntiAlias((boolean)(GraphicsTest.lIIIIlllIlIlII[1] != 0));
        int lllllllllllllIlIIlIIIIIIIllIllIl = GraphicsTest.lIIIIlllIlIlII[0];
        while (lIllllIIlIllIlI(lllllllllllllIlIIlIIIIIIIllIllIl, GraphicsTest.lIIIIlllIlIlII[5])) {
            lllllllllllllIlIIlIIIIIIIllIlIII.drawLine(700.0f, 100.0f, (float)(int)(700.0 + Math.cos(Math.toRadians(lllllllllllllIlIIlIIIIIIIllIllIl)) * 100.0), (float)(int)(100.0 + Math.sin(Math.toRadians(lllllllllllllIlIIlIIIIIIIllIllIl)) * 100.0));
            lllllllllllllIlIIlIIIIIIIllIllIl += 10;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        lllllllllllllIlIIlIIIIIIIllIlIII.setAntiAlias((boolean)(GraphicsTest.lIIIIlllIlIlII[0] != 0));
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.yellow);
        lllllllllllllIlIIlIIIIIIIllIlIII.drawString(GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[6]], 300.0f, 50.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.white);
        lllllllllllllIlIIlIIIIIIIllIlIII.drawString(GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[7]], 400.0f, 80.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.drawString(GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[8]], 400.0f, 120.0f);
        if (lIllllIIlIlllII(this.clip ? 1 : 0)) {
            lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.gray);
            lllllllllllllIlIIlIIIIIIIllIlIII.drawRect(100.0f, 260.0f, 400.0f, 100.0f);
            lllllllllllllIlIIlIIIIIIIllIlIII.setClip(GraphicsTest.lIIIIlllIlIlII[4], GraphicsTest.lIIIIlllIlIlII[9], GraphicsTest.lIIIIlllIlIlII[10], GraphicsTest.lIIIIlllIlIlII[4]);
        }
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.yellow);
        lllllllllllllIlIIlIIIIIIIllIlIII.translate(100.0f, 120.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.fill(this.poly);
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.blue);
        lllllllllllllIlIIlIIIIIIIllIlIII.setLineWidth(3.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.draw(this.poly);
        lllllllllllllIlIIlIIIIIIIllIlIII.setLineWidth(1.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.translate(0.0f, 230.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.draw(this.poly);
        lllllllllllllIlIIlIIIIIIIllIlIII.resetTransform();
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.magenta);
        lllllllllllllIlIIlIIIIIIIllIlIII.drawRoundRect(10.0f, 10.0f, 100.0f, 100.0f, GraphicsTest.lIIIIlllIlIlII[11]);
        lllllllllllllIlIIlIIIIIIIllIlIII.fillRoundRect(10.0f, 210.0f, 100.0f, 100.0f, GraphicsTest.lIIIIlllIlIlII[11]);
        lllllllllllllIlIIlIIIIIIIllIlIII.rotate(400.0f, 300.0f, this.ang);
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.green);
        lllllllllllllIlIIlIIIIIIIllIlIII.drawRect(200.0f, 200.0f, 200.0f, 200.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.blue);
        lllllllllllllIlIIlIIIIIIIllIlIII.fillRect(250.0f, 250.0f, 100.0f, 100.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.drawImage(this.image, 300.0f, 270.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.red);
        lllllllllllllIlIIlIIIIIIIllIlIII.drawOval(100.0f, 100.0f, 200.0f, 200.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.red.darker());
        lllllllllllllIlIIlIIIIIIIllIlIII.fillOval(300.0f, 300.0f, 150.0f, 100.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.setAntiAlias((boolean)(GraphicsTest.lIIIIlllIlIlII[1] != 0));
        lllllllllllllIlIIlIIIIIIIllIlIII.setColor(Color.white);
        lllllllllllllIlIIlIIIIIIIllIlIII.setLineWidth(5.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.drawOval(300.0f, 300.0f, 150.0f, 100.0f);
        lllllllllllllIlIIlIIIIIIIllIlIII.setAntiAlias((boolean)(GraphicsTest.lIIIIlllIlIlII[1] != 0));
        lllllllllllllIlIIlIIIIIIIllIlIII.resetTransform();
        if (lIllllIIlIlllII(this.clip ? 1 : 0)) {
            lllllllllllllIlIIlIIIIIIIllIlIII.clearClip();
        }
    }
    
    public GraphicsTest() {
        super(GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[0]]);
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIIlIIIIIIIllllIII) throws SlickException {
        this.container = lllllllllllllIlIIlIIIIIIIllllIII;
        this.image = new Image(GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[1]], (boolean)(GraphicsTest.lIIIIlllIlIlII[1] != 0));
        final Image lllllllllllllIlIIlIIIIIIIlllIlll = new Image(GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[2]]);
        lllllllllllllIlIIlIIIIIIIllllIII.setMouseCursor(lllllllllllllIlIIlIIIIIIIlllIlll, GraphicsTest.lIIIIlllIlIlII[0], GraphicsTest.lIIIIlllIlIlII[0]);
        final String[] icons = new String[GraphicsTest.lIIIIlllIlIlII[1]];
        icons[GraphicsTest.lIIIIlllIlIlII[0]] = GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[3]];
        lllllllllllllIlIIlIIIIIIIllllIII.setIcons(icons);
        lllllllllllllIlIIlIIIIIIIllllIII.setTargetFrameRate(GraphicsTest.lIIIIlllIlIlII[4]);
        this.poly = new Polygon();
        float lllllllllllllIlIIlIIIIIIIlllIllI = 100.0f;
        int lllllllllllllIlIIlIIIIIIIllllIlI = GraphicsTest.lIIIIlllIlIlII[0];
        while (lIllllIIlIllIlI(lllllllllllllIlIIlIIIIIIIllllIlI, GraphicsTest.lIIIIlllIlIlII[5])) {
            if (lIllllIIlIllIll(lIllllIIlIllIIl(lllllllllllllIlIIlIIIIIIIlllIllI, 100.0f))) {
                lllllllllllllIlIIlIIIIIIIlllIllI = 50.0f;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                lllllllllllllIlIIlIIIIIIIlllIllI = 100.0f;
            }
            this.poly.addPoint((float)FastTrig.cos(Math.toRadians(lllllllllllllIlIIlIIIIIIIllllIlI)) * lllllllllllllIlIIlIIIIIIIlllIllI, (float)FastTrig.sin(Math.toRadians(lllllllllllllIlIIlIIIIIIIllllIlI)) * lllllllllllllIlIIlIIIIIIIlllIllI);
            lllllllllllllIlIIlIIIIIIIllllIlI += 30;
            "".length();
            if ((0x89 ^ 0x8D) != (0x76 ^ 0x72)) {
                return;
            }
        }
    }
    
    private static String lIllllIIlIIllll(final String lllllllllllllIlIIlIIIIIIIIlIIlIl, final String lllllllllllllIlIIlIIIIIIIIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIIIIIIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIIIIIIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIIIIIIIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIIIIIIIlIlIIl.init(GraphicsTest.lIIIIlllIlIlII[2], lllllllllllllIlIIlIIIIIIIIlIlIlI);
            return new String(lllllllllllllIlIIlIIIIIIIIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIIIIIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIIIIIIlIlIII) {
            lllllllllllllIlIIlIIIIIIIIlIlIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIlIIlIIIIIIIlIlllII, final char lllllllllllllIlIIlIIIIIIIlIllIll) {
        if (lIllllIIlIlllIl(lllllllllllllIlIIlIIIIIIIlIlllII, GraphicsTest.lIIIIlllIlIlII[1])) {
            System.exit(GraphicsTest.lIIIIlllIlIlII[0]);
        }
        if (lIllllIIlIlllIl(lllllllllllllIlIIlIIIIIIIlIlllII, GraphicsTest.lIIIIlllIlIlII[12])) {
            int clip;
            if (lIllllIIlIllIll(this.clip ? 1 : 0)) {
                clip = GraphicsTest.lIIIIlllIlIlII[1];
                "".length();
                if ((102 + 56 - 97 + 125 ^ 133 + 100 - 139 + 96) < ((152 + 186 - 285 + 135 ^ 114 + 13 - 89 + 135) & (108 + 50 - 57 + 61 ^ 53 + 17 - 40 + 149 ^ -" ".length()))) {
                    return;
                }
            }
            else {
                clip = GraphicsTest.lIIIIlllIlIlII[0];
            }
            this.clip = (clip != 0);
        }
    }
    
    private static boolean lIllllIIlIllIlI(final int lllllllllllllIlIIlIIIIIIIIIllIll, final int lllllllllllllIlIIlIIIIIIIIIllIlI) {
        return lllllllllllllIlIIlIIIIIIIIIllIll < lllllllllllllIlIIlIIIIIIIIIllIlI;
    }
    
    private static void lIllllIIlIlIIlI() {
        (lIIIIlllIIllll = new String[GraphicsTest.lIIIIlllIlIlII[15]])[GraphicsTest.lIIIIlllIlIlII[0]] = lIllllIIlIIlllI("UVMd8eERmGvn5DLGNKzBfQ==", "QegYC");
        GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[1]] = lIllllIIlIIllll("oCbxjOvH4KMFBXQ++XlgjBv4MTDQWg7+", "frgmA");
        GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[2]] = lIllllIIlIlIIII("MAAlGTElETdCJSUJMxkhIToiAjooSyYDMg==", "DeVmU");
        GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[3]] = lIllllIIlIIlllI("54CFM67Wfl7QY7KuxsoESGSHq//xe+q/", "wkCnX");
        GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[6]] = lIllllIIlIIlllI("dHmI9VZ7OIbK+gQw30rWDn6EO444Ycc3", "gALUX");
        GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[7]] = lIllllIIlIIlllI("so7LAiDnwNRrQ+s8K+xXLZ4d9ZRTiQRXYOj/MA9wIiM=", "BJDqt");
        GraphicsTest.lIIIIlllIIllll[GraphicsTest.lIIIIlllIlIlII[8]] = lIllllIIlIIlllI("LYs6lYoDFXTM4e0UdnmIE/C/PzLTsLR3czIqIfjYTK4=", "svEbb");
    }
    
    private static String lIllllIIlIIlllI(final String lllllllllllllIlIIlIIIIIIIlIIllII, final String lllllllllllllIlIIlIIIIIIIlIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIIIIIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIIIIIlIIlIIl.getBytes(StandardCharsets.UTF_8)), GraphicsTest.lIIIIlllIlIlII[16]), "DES");
            final Cipher lllllllllllllIlIIlIIIIIIIlIIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIIIIIIlIIlllI.init(GraphicsTest.lIIIIlllIlIlII[2], lllllllllllllIlIIlIIIIIIIlIIllll);
            return new String(lllllllllllllIlIIlIIIIIIIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIIIIIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIIIIIlIIllIl) {
            lllllllllllllIlIIlIIIIIIIlIIllIl.printStackTrace();
            return null;
        }
    }
}
