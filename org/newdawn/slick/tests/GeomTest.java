// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.RoundedRectangle;
import org.newdawn.slick.geom.Ellipse;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.BasicGame;

public class GeomTest extends BasicGame
{
    private /* synthetic */ Shape rect;
    private static final /* synthetic */ int[] lIllIlIlllllII;
    private /* synthetic */ Shape roundRect2;
    private /* synthetic */ Shape rect1;
    private /* synthetic */ Shape circle;
    private static final /* synthetic */ String[] lIllIlIllllIll;
    private /* synthetic */ Shape roundRect;
    private /* synthetic */ Shape rect2;
    private /* synthetic */ Shape circle2;
    private /* synthetic */ Shape circle4;
    private /* synthetic */ Shape circle1;
    private /* synthetic */ Shape circle3;
    
    private static String lllllllIlIlIlII(final String llllllllllllIlllllllIllIllIIlIII, final String llllllllllllIlllllllIllIllIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlllllllIllIllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllllIllIllIIlIIl.getBytes(StandardCharsets.UTF_8)), GeomTest.lIllIlIlllllII[8]), "DES");
            final Cipher llllllllllllIlllllllIllIllIIllII = Cipher.getInstance("DES");
            llllllllllllIlllllllIllIllIIllII.init(GeomTest.lIllIlIlllllII[4], llllllllllllIlllllllIllIllIIllIl);
            return new String(llllllllllllIlllllllIllIllIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllllIllIllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllllIllIllIIlIll) {
            llllllllllllIlllllllIllIllIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllllIlIllIIl(final int llllllllllllIlllllllIllIllIIIIlI, final int llllllllllllIlllllllIllIllIIIIIl) {
        return llllllllllllIlllllllIllIllIIIIlI == llllllllllllIlllllllIllIllIIIIIl;
    }
    
    private static void lllllllIlIlIllI() {
        (lIllIlIllllIll = new String[GeomTest.lIllIlIlllllII[7]])[GeomTest.lIllIlIlllllII[0]] = lllllllIlIlIlII("CuTb0iirMhFC51BdGutvdw==", "zACZf");
        GeomTest.lIllIlIllllIll[GeomTest.lIllIlIlllllII[3]] = lllllllIlIlIlII("0rFd7xJH/MmtRIfPgCHKhhACh5c/+90jv9A2mam8rETSbmmdvwZKob83dtroCk0ZHfkGZiBUS6c=", "GUocm");
        GeomTest.lIllIlIllllIll[GeomTest.lIllIlIlllllII[4]] = lllllllIlIlIlIl("BS8qOw9yJjEqSiYvJm8eMzUkKh4h", "RGCOj");
    }
    
    public void render(final GameContainer llllllllllllIlllllllIllIlllllIlI, final Graphics llllllllllllIlllllllIllIllllIlll) {
        llllllllllllIlllllllIllIllllIlll.setColor(Color.white);
        llllllllllllIlllllllIllIllllIlll.drawString(GeomTest.lIllIlIllllIll[GeomTest.lIllIlIlllllII[3]], 50.0f, 420.0f);
        llllllllllllIlllllllIllIllllIlll.drawString(GeomTest.lIllIlIllllIll[GeomTest.lIllIlIlllllII[4]], 50.0f, 435.0f);
        llllllllllllIlllllllIllIllllIlll.pushTransform();
        llllllllllllIlllllllIllIllllIlll.translate(100.0f, 100.0f);
        llllllllllllIlllllllIllIllllIlll.pushTransform();
        llllllllllllIlllllllIllIllllIlll.translate(-50.0f, -50.0f);
        llllllllllllIlllllllIllIllllIlll.scale(10.0f, 10.0f);
        llllllllllllIlllllllIllIllllIlll.setColor(Color.red);
        llllllllllllIlllllllIllIllllIlll.fillRect(0.0f, 0.0f, 5.0f, 5.0f);
        llllllllllllIlllllllIllIllllIlll.setColor(Color.white);
        llllllllllllIlllllllIllIllllIlll.drawRect(0.0f, 0.0f, 5.0f, 5.0f);
        llllllllllllIlllllllIllIllllIlll.popTransform();
        llllllllllllIlllllllIllIllllIlll.setColor(Color.green);
        llllllllllllIlllllllIllIllllIlll.fillRect(20.0f, 20.0f, 50.0f, 50.0f);
        llllllllllllIlllllllIllIllllIlll.popTransform();
        llllllllllllIlllllllIllIllllIlll.setColor(Color.white);
        llllllllllllIlllllllIllIllllIlll.draw(this.rect);
        llllllllllllIlllllllIllIllllIlll.draw(this.circle);
        Color color;
        if (lllllllIlIllIII(this.rect1.intersects(this.rect) ? 1 : 0)) {
            color = Color.red;
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            color = Color.green;
        }
        llllllllllllIlllllllIllIllllIlll.setColor(color);
        llllllllllllIlllllllIllIllllIlll.draw(this.rect1);
        Color color2;
        if (lllllllIlIllIII(this.rect2.intersects(this.rect) ? 1 : 0)) {
            color2 = Color.red;
            "".length();
            if (-(129 + 117 - 207 + 104 ^ 18 + 40 + 31 + 50) > 0) {
                return;
            }
        }
        else {
            color2 = Color.green;
        }
        llllllllllllIlllllllIllIllllIlll.setColor(color2);
        llllllllllllIlllllllIllIllllIlll.draw(this.rect2);
        Color color3;
        if (lllllllIlIllIII(this.roundRect.intersects(this.rect) ? 1 : 0)) {
            color3 = Color.red;
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else {
            color3 = Color.green;
        }
        llllllllllllIlllllllIllIllllIlll.setColor(color3);
        llllllllllllIlllllllIllIllllIlll.draw(this.roundRect);
        Color color4;
        if (lllllllIlIllIII(this.circle1.intersects(this.rect) ? 1 : 0)) {
            color4 = Color.red;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            color4 = Color.green;
        }
        llllllllllllIlllllllIllIllllIlll.setColor(color4);
        llllllllllllIlllllllIllIllllIlll.draw(this.circle1);
        Color color5;
        if (lllllllIlIllIII(this.circle2.intersects(this.rect) ? 1 : 0)) {
            color5 = Color.red;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            color5 = Color.green;
        }
        llllllllllllIlllllllIllIllllIlll.setColor(color5);
        llllllllllllIlllllllIllIllllIlll.draw(this.circle2);
        Color color6;
        if (lllllllIlIllIII(this.circle3.intersects(this.circle) ? 1 : 0)) {
            color6 = Color.red;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            color6 = Color.green;
        }
        llllllllllllIlllllllIllIllllIlll.setColor(color6);
        llllllllllllIlllllllIllIllllIlll.fill(this.circle3);
        Color color7;
        if (lllllllIlIllIII(this.circle4.intersects(this.circle) ? 1 : 0)) {
            color7 = Color.red;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            color7 = Color.green;
        }
        llllllllllllIlllllllIllIllllIlll.setColor(color7);
        llllllllllllIlllllllIllIllllIlll.draw(this.circle4);
        llllllllllllIlllllllIllIllllIlll.fill(this.roundRect2);
        llllllllllllIlllllllIllIllllIlll.setColor(Color.blue);
        llllllllllllIlllllllIllIllllIlll.draw(this.roundRect2);
        llllllllllllIlllllllIllIllllIlll.setColor(Color.blue);
        llllllllllllIlllllllIllIllllIlll.draw(new Circle(100.0f, 100.0f, 50.0f));
        llllllllllllIlllllllIllIllllIlll.drawRect(50.0f, 50.0f, 100.0f, 100.0f);
    }
    
    private static boolean lllllllIlIllIlI(final int llllllllllllIlllllllIllIlIlllllI, final int llllllllllllIlllllllIllIlIllllIl) {
        return llllllllllllIlllllllIllIlIlllllI < llllllllllllIlllllllIllIlIllllIl;
    }
    
    @Override
    public void keyPressed(final int llllllllllllIlllllllIllIlllIllll, final char llllllllllllIlllllllIllIllllIIII) {
        if (lllllllIlIllIIl(llllllllllllIlllllllIllIlllIllll, GeomTest.lIllIlIlllllII[3])) {
            System.exit(GeomTest.lIllIlIlllllII[0]);
        }
    }
    
    public GeomTest() {
        super(GeomTest.lIllIlIllllIll[GeomTest.lIllIlIlllllII[0]]);
        this.rect = new Rectangle(100.0f, 100.0f, 100.0f, 100.0f);
        this.circle = new Circle(500.0f, 200.0f, 50.0f);
        this.rect1 = new Rectangle(150.0f, 120.0f, 50.0f, 100.0f).transform(Transform.createTranslateTransform(50.0f, 50.0f));
        this.rect2 = new Rectangle(310.0f, 210.0f, 50.0f, 100.0f).transform(Transform.createRotateTransform((float)Math.toRadians(45.0), 335.0f, 260.0f));
        this.circle1 = new Circle(150.0f, 90.0f, 30.0f);
        this.circle2 = new Circle(310.0f, 110.0f, 70.0f);
        this.circle3 = new Ellipse(510.0f, 150.0f, 70.0f, 70.0f);
        this.circle4 = new Ellipse(510.0f, 350.0f, 30.0f, 30.0f).transform(Transform.createTranslateTransform(-510.0f, -350.0f)).transform(Transform.createScaleTransform(2.0f, 2.0f)).transform(Transform.createTranslateTransform(510.0f, 350.0f));
        this.roundRect = new RoundedRectangle(50.0f, 175.0f, 100.0f, 100.0f, 20.0f);
        this.roundRect2 = new RoundedRectangle(50.0f, 280.0f, 50.0f, 50.0f, 20.0f, GeomTest.lIllIlIlllllII[1], GeomTest.lIllIlIlllllII[2]);
    }
    
    private static String lllllllIlIlIlIl(String llllllllllllIlllllllIllIllIllIlI, final String llllllllllllIlllllllIllIllIllIIl) {
        llllllllllllIlllllllIllIllIllIlI = new String(Base64.getDecoder().decode(llllllllllllIlllllllIllIllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllllIllIllIlllIl = new StringBuilder();
        final char[] llllllllllllIlllllllIllIllIlllII = llllllllllllIlllllllIllIllIllIIl.toCharArray();
        int llllllllllllIlllllllIllIllIllIll = GeomTest.lIllIlIlllllII[0];
        final Exception llllllllllllIlllllllIllIllIlIlIl = (Object)llllllllllllIlllllllIllIllIllIlI.toCharArray();
        final short llllllllllllIlllllllIllIllIlIlII = (short)llllllllllllIlllllllIllIllIlIlIl.length;
        float llllllllllllIlllllllIllIllIlIIll = GeomTest.lIllIlIlllllII[0];
        while (lllllllIlIllIlI((int)llllllllllllIlllllllIllIllIlIIll, llllllllllllIlllllllIllIllIlIlII)) {
            final char llllllllllllIlllllllIllIlllIIIII = llllllllllllIlllllllIllIllIlIlIl[llllllllllllIlllllllIllIllIlIIll];
            llllllllllllIlllllllIllIllIlllIl.append((char)(llllllllllllIlllllllIllIlllIIIII ^ llllllllllllIlllllllIllIllIlllII[llllllllllllIlllllllIllIllIllIll % llllllllllllIlllllllIllIllIlllII.length]));
            "".length();
            ++llllllllllllIlllllllIllIllIllIll;
            ++llllllllllllIlllllllIllIllIlIIll;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllllIllIllIlllIl);
    }
    
    private static void lllllllIlIlIlll() {
        (lIllIlIlllllII = new int[9])[0] = ((0x23 ^ 0x46 ^ (0x27 ^ 0x1D)) & (98 + 99 - 189 + 188 ^ 30 + 106 - 79 + 98 ^ -" ".length()));
        GeomTest.lIllIlIlllllII[1] = (0x5E ^ 0x54 ^ (0xD9 ^ 0xC7));
        GeomTest.lIllIlIlllllII[2] = (0x48 ^ 0x4D);
        GeomTest.lIllIlIlllllII[3] = " ".length();
        GeomTest.lIllIlIlllllII[4] = "  ".length();
        GeomTest.lIllIlIlllllII[5] = (-(0xFFFFD7DF & 0x6CBE) & (0xFFFFC7BD & 0x7FFF));
        GeomTest.lIllIlIlllllII[6] = (-(0xFFFFEBB5 & 0x7DEF) & (0xFFFFEBFF & 0x7FFC));
        GeomTest.lIllIlIlllllII[7] = "   ".length();
        GeomTest.lIllIlIlllllII[8] = (0xA3 ^ 0xAB);
    }
    
    static {
        lllllllIlIlIlll();
        lllllllIlIlIllI();
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlllllllIllIlllllllI) throws SlickException {
    }
    
    private static boolean lllllllIlIllIII(final int llllllllllllIlllllllIllIlIlllIll) {
        return llllllllllllIlllllllIllIlIlllIll != 0;
    }
    
    public static void main(final String[] llllllllllllIlllllllIllIlllIlIll) {
        try {
            Renderer.setRenderer(GeomTest.lIllIlIlllllII[4]);
            final AppGameContainer llllllllllllIlllllllIllIlllIllIl = new AppGameContainer(new GeomTest());
            llllllllllllIlllllllIllIlllIllIl.setDisplayMode(GeomTest.lIllIlIlllllII[5], GeomTest.lIllIlIlllllII[6], (boolean)(GeomTest.lIllIlIlllllII[0] != 0));
            llllllllllllIlllllllIllIlllIllIl.start();
            "".length();
            if ("   ".length() >= (124 + 102 - 218 + 137 ^ 94 + 104 - 126 + 77)) {
                return;
            }
        }
        catch (SlickException llllllllllllIlllllllIllIlllIllII) {
            llllllllllllIlllllllIllIlllIllII.printStackTrace();
        }
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlllllllIllIllllIlIl, final int llllllllllllIlllllllIllIllllIlII) {
    }
}
