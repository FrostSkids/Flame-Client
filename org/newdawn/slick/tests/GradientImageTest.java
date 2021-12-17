// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.ShapeFill;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.Color;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.fills.GradientFill;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class GradientImageTest extends BasicGame
{
    private /* synthetic */ boolean rotating;
    private /* synthetic */ Image image1;
    private /* synthetic */ GameContainer container;
    private static final /* synthetic */ String[] lllIIIIlIIlIlI;
    private static final /* synthetic */ int[] lllIIIlIIIlIlI;
    private /* synthetic */ Image image2;
    private /* synthetic */ GradientFill fill;
    private /* synthetic */ float ang;
    private /* synthetic */ Polygon poly;
    private /* synthetic */ Shape shape;
    
    static {
        lIIlllIlIIlIlIIl();
        lIIlllIIlIIIIIlI();
    }
    
    private static String lIIlllIIlIIIIIII(String llllllllllllIllIIIIIllIlIIIIIIIl, final String llllllllllllIllIIIIIllIlIIIIIIII) {
        llllllllllllIllIIIIIllIlIIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIllIlIIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIllIIllllllll = new StringBuilder();
        final char[] llllllllllllIllIIIIIllIIlllllllI = llllllllllllIllIIIIIllIlIIIIIIII.toCharArray();
        int llllllllllllIllIIIIIllIIllllllIl = GradientImageTest.lllIIIlIIIlIlI[0];
        final char llllllllllllIllIIIIIllIIllllIlll = (Object)llllllllllllIllIIIIIllIlIIIIIIIl.toCharArray();
        final double llllllllllllIllIIIIIllIIllllIllI = llllllllllllIllIIIIIllIIllllIlll.length;
        String llllllllllllIllIIIIIllIIllllIlIl = (String)GradientImageTest.lllIIIlIIIlIlI[0];
        while (lIIlllIlIIlIllIl((int)llllllllllllIllIIIIIllIIllllIlIl, (int)llllllllllllIllIIIIIllIIllllIllI)) {
            final char llllllllllllIllIIIIIllIlIIIIIIlI = llllllllllllIllIIIIIllIIllllIlll[llllllllllllIllIIIIIllIIllllIlIl];
            llllllllllllIllIIIIIllIIllllllll.append((char)(llllllllllllIllIIIIIllIlIIIIIIlI ^ llllllllllllIllIIIIIllIIlllllllI[llllllllllllIllIIIIIllIIllllllIl % llllllllllllIllIIIIIllIIlllllllI.length]));
            "".length();
            ++llllllllllllIllIIIIIllIIllllllIl;
            ++llllllllllllIllIIIIIllIIllllIlIl;
            "".length();
            if ("  ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIllIIllllllll);
    }
    
    private static boolean lIIlllIlIIlIlIll(final int llllllllllllIllIIIIIllIIllllIIIl, final int llllllllllllIllIIIIIllIIllllIIII) {
        return llllllllllllIllIIIIIllIIllllIIIl == llllllllllllIllIIIIIllIIllllIIII;
    }
    
    private static void lIIlllIlIIlIlIIl() {
        (lllIIIlIIIlIlI = new int[8])[0] = ((0x61 ^ 0x0) & ~(0x5C ^ 0x3D));
        GradientImageTest.lllIIIlIIIlIlI[1] = " ".length();
        GradientImageTest.lllIIIlIIIlIlI[2] = "  ".length();
        GradientImageTest.lllIIIlIIIlIlI[3] = "   ".length();
        GradientImageTest.lllIIIlIIIlIlI[4] = (-(0xFFFFD4BB & 0x7FDF) & (0xFFFFFFBE & 0x57FB));
        GradientImageTest.lllIIIlIIIlIlI[5] = (0xFFFFE27B & 0x1FDC);
        GradientImageTest.lllIIIlIIIlIlI[6] = (90 + 163 - 177 + 91 ^ 102 + 117 - 180 + 141);
        GradientImageTest.lllIIIlIIIlIlI[7] = (0x2D ^ 0x29);
    }
    
    private static void lIIlllIIlIIIIIlI() {
        (lllIIIIlIIlIlI = new String[GradientImageTest.lllIIIlIIIlIlI[7]])[GradientImageTest.lllIIIlIIIlIlI[0]] = lIIlllIIIlllllll("jzP0ljJYa7pZ/tu15zgko5Poj7Prl6Pz", "cNYXl");
        GradientImageTest.lllIIIIlIIlIlI[GradientImageTest.lllIIIlIIIlIlI[1]] = lIIlllIIlIIIIIII("GAkjBhANGDFdEx4NIwFaHAI3", "llPrt");
        GradientImageTest.lllIIIIlIIlIlI[GradientImageTest.lllIIIlIIIlIlI[2]] = lIIlllIIIlllllll("nR8LoshdZ2SI8oNl8cbwrJmWPqM5yRgR", "GKdzy");
        GradientImageTest.lllIIIIlIIlIlI[GradientImageTest.lllIIIlIIIlIlI[3]] = lIIlllIIlIIIIIII("IWRAcj0cIwo+DFMWAiYIBy0CPA4=", "sDmRi");
    }
    
    private static boolean lIIlllIlIIlIllII(final int llllllllllllIllIIIIIllIIlllIlIII) {
        return llllllllllllIllIIIIIllIIlllIlIII == 0;
    }
    
    public static void main(final String[] llllllllllllIllIIIIIllIlIIlIIIIl) {
        try {
            final AppGameContainer llllllllllllIllIIIIIllIlIIlIIIll = new AppGameContainer(new GradientImageTest());
            llllllllllllIllIIIIIllIlIIlIIIll.setDisplayMode(GradientImageTest.lllIIIlIIIlIlI[4], GradientImageTest.lllIIIlIIIlIlI[5], (boolean)(GradientImageTest.lllIIIlIIIlIlI[0] != 0));
            llllllllllllIllIIIIIllIlIIlIIIll.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIIIIIllIlIIlIIIlI) {
            llllllllllllIllIIIIIllIlIIlIIIlI.printStackTrace();
        }
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIIIIIllIlIIlIlIII, final int llllllllllllIllIIIIIllIlIIlIIlIl) {
        if (lIIlllIlIIlIlIlI(this.rotating ? 1 : 0)) {
            this.ang += llllllllllllIllIIIIIllIlIIlIIlIl * 0.1f;
        }
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllIIIIIllIlIIIllIIl, final char llllllllllllIllIIIIIllIlIIIllIll) {
        if (lIIlllIlIIlIlIll(llllllllllllIllIIIIIllIlIIIllIIl, GradientImageTest.lllIIIlIIIlIlI[6])) {
            int rotating;
            if (lIIlllIlIIlIllII(this.rotating ? 1 : 0)) {
                rotating = GradientImageTest.lllIIIlIIIlIlI[1];
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            else {
                rotating = GradientImageTest.lllIIIlIIIlIlI[0];
            }
            this.rotating = (rotating != 0);
        }
        if (lIIlllIlIIlIlIll(llllllllllllIllIIIIIllIlIIIllIIl, GradientImageTest.lllIIIlIIIlIlI[1])) {
            this.container.exit();
        }
    }
    
    private static String lIIlllIIIlllllll(final String llllllllllllIllIIIIIllIlIIIlIIIl, final String llllllllllllIllIIIIIllIlIIIlIIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIllIlIIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIllIlIIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIllIlIIIlIIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIllIlIIIlIIll.init(GradientImageTest.lllIIIlIIIlIlI[2], llllllllllllIllIIIIIllIlIIIlIlII);
            return new String(llllllllllllIllIIIIIllIlIIIlIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIllIlIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIllIlIIIlIIlI) {
            llllllllllllIllIIIIIllIlIIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlllIlIIlIlIlI(final int llllllllllllIllIIIIIllIIlllIlIlI) {
        return llllllllllllIllIIIIIllIIlllIlIlI != 0;
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIIIIIllIlIIllIlIl) throws SlickException {
        this.container = llllllllllllIllIIIIIllIlIIllIlIl;
        this.image1 = new Image(GradientImageTest.lllIIIIlIIlIlI[GradientImageTest.lllIIIlIIIlIlI[1]]);
        this.image2 = new Image(GradientImageTest.lllIIIIlIIlIlI[GradientImageTest.lllIIIlIIIlIlI[2]]);
        this.fill = new GradientFill(-64.0f, 0.0f, new Color(1.0f, 1.0f, 1.0f, 1.0f), 64.0f, 0.0f, new Color(GradientImageTest.lllIIIlIIIlIlI[0], GradientImageTest.lllIIIlIIIlIlI[0], GradientImageTest.lllIIIlIIIlIlI[0], GradientImageTest.lllIIIlIIIlIlI[0]));
        this.shape = new Rectangle(336.0f, 236.0f, 128.0f, 128.0f);
        this.poly = new Polygon();
        this.poly.addPoint(320.0f, 220.0f);
        this.poly.addPoint(350.0f, 200.0f);
        this.poly.addPoint(450.0f, 200.0f);
        this.poly.addPoint(480.0f, 220.0f);
        this.poly.addPoint(420.0f, 400.0f);
        this.poly.addPoint(400.0f, 390.0f);
    }
    
    public GradientImageTest() {
        super(GradientImageTest.lllIIIIlIIlIlI[GradientImageTest.lllIIIlIIIlIlI[0]]);
        this.rotating = (GradientImageTest.lllIIIlIIIlIlI[0] != 0);
    }
    
    private static boolean lIIlllIlIIlIllIl(final int llllllllllllIllIIIIIllIIlllIllIl, final int llllllllllllIllIIIIIllIIlllIllII) {
        return llllllllllllIllIIIIIllIIlllIllIl < llllllllllllIllIIIIIllIIlllIllII;
    }
    
    public void render(final GameContainer llllllllllllIllIIIIIllIlIIlIllll, final Graphics llllllllllllIllIIIIIllIlIIlIllII) {
        llllllllllllIllIIIIIllIlIIlIllII.drawString(GradientImageTest.lllIIIIlIIlIlI[GradientImageTest.lllIIIlIIIlIlI[3]], 10.0f, 50.0f);
        llllllllllllIllIIIIIllIlIIlIllII.drawImage(this.image1, 100.0f, 236.0f);
        llllllllllllIllIIIIIllIlIIlIllII.drawImage(this.image2, 600.0f, 236.0f);
        llllllllllllIllIIIIIllIlIIlIllII.translate(0.0f, -150.0f);
        llllllllllllIllIIIIIllIlIIlIllII.rotate(400.0f, 300.0f, this.ang);
        llllllllllllIllIIIIIllIlIIlIllII.texture(this.shape, this.image2);
        llllllllllllIllIIIIIllIlIIlIllII.texture(this.shape, this.image1, this.fill);
        llllllllllllIllIIIIIllIlIIlIllII.resetTransform();
        llllllllllllIllIIIIIllIlIIlIllII.translate(0.0f, 150.0f);
        llllllllllllIllIIIIIllIlIIlIllII.rotate(400.0f, 300.0f, this.ang);
        llllllllllllIllIIIIIllIlIIlIllII.texture(this.poly, this.image2);
        llllllllllllIllIIIIIllIlIIlIllII.texture(this.poly, this.image1, this.fill);
        llllllllllllIllIIIIIllIlIIlIllII.resetTransform();
    }
}
