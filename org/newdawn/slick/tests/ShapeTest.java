// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.geom.RoundedRectangle;
import org.newdawn.slick.geom.Ellipse;
import org.newdawn.slick.geom.Polygon;
import java.util.ArrayList;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.BasicGame;

public class ShapeTest extends BasicGame
{
    private static final /* synthetic */ String[] lIIIIIIlIlIIII;
    private /* synthetic */ Circle circle;
    private /* synthetic */ Rectangle rect;
    private /* synthetic */ ArrayList shapes;
    private /* synthetic */ Polygon polygon;
    private /* synthetic */ Ellipse ellipse;
    private /* synthetic */ char[] lastChar;
    private /* synthetic */ RoundedRectangle roundRect;
    private static final /* synthetic */ int[] lIIIIIIlIlIIIl;
    private /* synthetic */ boolean[] keys;
    private /* synthetic */ Polygon randomShape;
    
    private static boolean lIllIlIIIIIllII(final int lllllllllllllIlIlIIIIllIlIlIIIIl, final int lllllllllllllIlIlIIIIllIlIlIIIII) {
        return lllllllllllllIlIlIIIIllIlIlIIIIl == lllllllllllllIlIlIIIIllIlIlIIIII;
    }
    
    private static boolean lIllIlIIIIIlIlI(final int lllllllllllllIlIlIIIIllIlIIlllIl, final int lllllllllllllIlIlIIIIllIlIIlllII) {
        return lllllllllllllIlIlIIIIllIlIIlllIl < lllllllllllllIlIlIIIIllIlIIlllII;
    }
    
    public static void main(final String[] lllllllllllllIlIlIIIIllIllIlIlll) {
        try {
            Renderer.setRenderer(ShapeTest.lIIIIIIlIlIIIl[5]);
            final AppGameContainer lllllllllllllIlIlIIIIllIllIllIIl = new AppGameContainer(new ShapeTest());
            lllllllllllllIlIlIIIIllIllIllIIl.setDisplayMode(ShapeTest.lIIIIIIlIlIIIl[49], ShapeTest.lIIIIIIlIlIIIl[50], (boolean)(ShapeTest.lIIIIIIlIlIIIl[0] != 0));
            lllllllllllllIlIlIIIIllIllIllIIl.start();
            "".length();
            if ("   ".length() > (0x3E ^ 0x3A)) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIlIIIIllIllIllIII) {
            lllllllllllllIlIlIIIIllIllIllIII.printStackTrace();
        }
    }
    
    public void createPoly(final float lllllllllllllIlIlIIIIlllIIIIIIIl, final float lllllllllllllIlIlIIIIlllIIIIIlIl) {
        final int lllllllllllllIlIlIIIIlllIIIIIlII = ShapeTest.lIIIIIIlIlIIIl[1];
        final int lllllllllllllIlIlIIIIlllIIIIIIll = ShapeTest.lIIIIIIlIlIIIl[2];
        this.randomShape = new Polygon();
        this.randomShape.addPoint((float)(ShapeTest.lIIIIIIlIlIIIl[0] + (int)(Math.random() * lllllllllllllIlIlIIIIlllIIIIIIll)), (float)(ShapeTest.lIIIIIIlIlIIIl[0] + (int)(Math.random() * lllllllllllllIlIlIIIIlllIIIIIIll)));
        this.randomShape.addPoint((float)(lllllllllllllIlIlIIIIlllIIIIIlII - (int)(Math.random() * lllllllllllllIlIlIIIIlllIIIIIIll)), (float)(ShapeTest.lIIIIIIlIlIIIl[0] + (int)(Math.random() * lllllllllllllIlIlIIIIlllIIIIIIll)));
        this.randomShape.addPoint((float)(lllllllllllllIlIlIIIIlllIIIIIlII - (int)(Math.random() * lllllllllllllIlIlIIIIlllIIIIIIll)), (float)(lllllllllllllIlIlIIIIlllIIIIIlII - (int)(Math.random() * lllllllllllllIlIlIIIIlllIIIIIIll)));
        this.randomShape.addPoint((float)(ShapeTest.lIIIIIIlIlIIIl[0] + (int)(Math.random() * lllllllllllllIlIlIIIIlllIIIIIIll)), (float)(lllllllllllllIlIlIIIIlllIIIIIlII - (int)(Math.random() * lllllllllllllIlIlIIIIlllIIIIIIll)));
        this.randomShape.setCenterX(lllllllllllllIlIlIIIIlllIIIIIIIl);
        this.randomShape.setCenterY(lllllllllllllIlIlIIIIlllIIIIIlIl);
    }
    
    private static void lIllIlIIIIIlIII() {
        (lIIIIIIlIlIIII = new String[ShapeTest.lIIIIIIlIlIIIl[51]])[ShapeTest.lIIIIIIlIlIIIl[0]] = lIllIlIIIIIIlIl("EwsOI2gACxI6", "TnaNH");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[4]] = lIllIlIIIIIIlIl("IyoWIQ==", "HOoRA");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[5]] = lIllIlIIIIIIlIl("HxA9JXpFUSMuLA1RPCQ5HBAgJjYN", "hqNAZ");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[6]] = lIllIlIIIIIIlIl("FBEdC0FucDwqEioqK28TJjM6Lg8kPCs=", "CPNOa");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[7]] = lIllIlIIIIIIllI("4Rqr1FVfqwEprs4IAmMteXBSZfbS4ZNWVW9SrWDpVCE=", "zbsRS");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[8]] = lIllIlIIIIIIllI("x+7ukxqF+Qpk89uxVaUXZQUUB/8RwBd0lJbSLAH2Tq4=", "HhesP");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[9]] = lIllIlIIIIIIllI("ts5r3tpDo9BR91iZepiKpkXa6cn+jBDUXTOz4WoryCrAEQhp9iTrhcY7jY3Lhwqz", "zrqnz");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[10]] = lIllIlIIIIIIlll("fSz6cwqw2zgYHyiGAP3Nb5ToTtnetJ5M", "nIxVM");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[3]] = lIllIlIIIIIIllI("EmHxFifwLpDyAws8MNVCLodP6qtfCdku", "vwYNU");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[12]] = lIllIlIIIIIIlIl("IBQ3Kh8SRmhlBQ4QIGULCBQmKQ0=", "afEEh");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[2]] = lIllIlIIIIIIllI("XO3hVC8k0CgVgb4BRyzMHB3ys83GcI+roMZFMMu+r0qg1fFNGU9ZOQ==", "acgmO");
        ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[13]] = lIllIlIIIIIIllI("gq6pPE23rbM9qS1CimgXU+Cp9J2gWoG5d67X6DuBHSA=", "DeezL");
    }
    
    private static String lIllIlIIIIIIlIl(String lllllllllllllIlIlIIIIllIlIlllIIl, final String lllllllllllllIlIlIIIIllIlIlllIII) {
        lllllllllllllIlIlIIIIllIlIlllIIl = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIIIllIlIlllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIIllIlIllllII = new StringBuilder();
        final char[] lllllllllllllIlIlIIIIllIlIlllIll = lllllllllllllIlIlIIIIllIlIlllIII.toCharArray();
        int lllllllllllllIlIlIIIIllIlIlllIlI = ShapeTest.lIIIIIIlIlIIIl[0];
        final long lllllllllllllIlIlIIIIllIlIllIlII = (Object)((String)lllllllllllllIlIlIIIIllIlIlllIIl).toCharArray();
        final double lllllllllllllIlIlIIIIllIlIllIIll = lllllllllllllIlIlIIIIllIlIllIlII.length;
        long lllllllllllllIlIlIIIIllIlIllIIlI = ShapeTest.lIIIIIIlIlIIIl[0];
        while (lIllIlIIIIIlIlI((int)lllllllllllllIlIlIIIIllIlIllIIlI, (int)lllllllllllllIlIlIIIIllIlIllIIll)) {
            final char lllllllllllllIlIlIIIIllIlIllllll = lllllllllllllIlIlIIIIllIlIllIlII[lllllllllllllIlIlIIIIllIlIllIIlI];
            lllllllllllllIlIlIIIIllIlIllllII.append((char)(lllllllllllllIlIlIIIIllIlIllllll ^ lllllllllllllIlIlIIIIllIlIlllIll[lllllllllllllIlIlIIIIllIlIlllIlI % lllllllllllllIlIlIIIIllIlIlllIll.length]));
            "".length();
            ++lllllllllllllIlIlIIIIllIlIlllIlI;
            ++lllllllllllllIlIlIIIIllIlIllIIlI;
            "".length();
            if ((4 + 139 - 16 + 57 ^ 163 + 187 - 241 + 79) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIIllIlIllllII);
    }
    
    static {
        lIllIlIIIIIlIIl();
        lIllIlIIIIIlIII();
    }
    
    public ShapeTest() {
        super(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[0]]);
        this.randomShape = new Polygon();
    }
    
    public void render(final GameContainer lllllllllllllIlIlIIIIllIllllIlII, final Graphics lllllllllllllIlIlIIIIllIllllIIll) {
        lllllllllllllIlIlIIIIllIllllIIll.setColor(Color.green);
        int lllllllllllllIlIlIIIIllIllllIllI = ShapeTest.lIIIIIIlIlIIIl[0];
        while (lIllIlIIIIIlIlI(lllllllllllllIlIlIIIIllIllllIllI, this.shapes.size())) {
            lllllllllllllIlIlIIIIllIllllIIll.fill(this.shapes.get(lllllllllllllIlIlIIIIllIllllIllI));
            ++lllllllllllllIlIlIIIIllIllllIllI;
            "".length();
            if ("  ".length() > (0x84 ^ 0x80)) {
                return;
            }
        }
        lllllllllllllIlIlIIIIllIllllIIll.fill(this.randomShape);
        lllllllllllllIlIlIIIIllIllllIIll.setColor(Color.black);
        lllllllllllllIlIlIIIIllIllllIIll.setAntiAlias((boolean)(ShapeTest.lIIIIIIlIlIIIl[4] != 0));
        lllllllllllllIlIlIIIIllIllllIIll.draw(this.randomShape);
        lllllllllllllIlIlIIIIllIllllIIll.setAntiAlias((boolean)(ShapeTest.lIIIIIIlIlIIIl[0] != 0));
        lllllllllllllIlIlIIIIllIllllIIll.setColor(Color.white);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[4]], 10.0f, 300.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[5]], 10.0f, 315.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[6]], 10.0f, 330.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[7]], 10.0f, 345.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[8]], 10.0f, 360.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[9]], 10.0f, 375.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[10]], 10.0f, 390.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[3]], 10.0f, 405.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[12]], 10.0f, 420.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[2]], 10.0f, 435.0f);
        lllllllllllllIlIlIIIIllIllllIIll.drawString(ShapeTest.lIIIIIIlIlIIII[ShapeTest.lIIIIIIlIlIIIl[13]], 10.0f, 450.0f);
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIlIIIIllIlllIllIl, final int lllllllllllllIlIlIIIIllIlllIllII) {
        this.createPoly(200.0f, 200.0f);
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[4]] ? 1 : 0)) {
            System.exit(ShapeTest.lIIIIIIlIlIIIl[0]);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[14]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[14]], ShapeTest.lIIIIIIlIlIIIl[15])) {
                this.rect.setY(this.rect.getY() - 1.0f);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.rect.setHeight(this.rect.getHeight() - 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[16]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[16]], ShapeTest.lIIIIIIlIlIIIl[17])) {
                this.rect.setY(this.rect.getY() + 1.0f);
                "".length();
                if ("   ".length() < -" ".length()) {
                    return;
                }
            }
            else {
                this.rect.setHeight(this.rect.getHeight() + 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[18]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[18]], ShapeTest.lIIIIIIlIlIIIl[19])) {
                this.rect.setX(this.rect.getX() - 1.0f);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.rect.setWidth(this.rect.getWidth() - 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[20]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[20]], ShapeTest.lIIIIIIlIlIIIl[21])) {
                this.rect.setX(this.rect.getX() + 1.0f);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
            else {
                this.rect.setWidth(this.rect.getWidth() + 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[1]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[1]], ShapeTest.lIIIIIIlIlIIIl[22])) {
                this.roundRect.setY(this.roundRect.getY() - 1.0f);
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            else {
                this.roundRect.setHeight(this.roundRect.getHeight() - 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[23]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[23]], ShapeTest.lIIIIIIlIlIIIl[24])) {
                this.roundRect.setY(this.roundRect.getY() + 1.0f);
                "".length();
                if ((0x66 ^ 0x63) == 0x0) {
                    return;
                }
            }
            else {
                this.roundRect.setHeight(this.roundRect.getHeight() + 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[25]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[25]], ShapeTest.lIIIIIIlIlIIIl[26])) {
                this.roundRect.setX(this.roundRect.getX() - 1.0f);
                "".length();
                if ("   ".length() >= (0x81 ^ 0x85)) {
                    return;
                }
            }
            else {
                this.roundRect.setWidth(this.roundRect.getWidth() - 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[27]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[27]], ShapeTest.lIIIIIIlIlIIIl[28])) {
                this.roundRect.setX(this.roundRect.getX() + 1.0f);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.roundRect.setWidth(this.roundRect.getWidth() + 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[29]] ? 1 : 0)) {
            this.roundRect.setCornerRadius(this.roundRect.getCornerRadius() - 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[30]] ? 1 : 0)) {
            this.roundRect.setCornerRadius(this.roundRect.getCornerRadius() + 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[31]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[31]], ShapeTest.lIIIIIIlIlIIIl[32])) {
                this.ellipse.setCenterY(this.ellipse.getCenterY() - 1.0f);
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
            else {
                this.ellipse.setRadius2(this.ellipse.getRadius2() - 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[33]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[33]], ShapeTest.lIIIIIIlIlIIIl[34])) {
                this.ellipse.setCenterY(this.ellipse.getCenterY() + 1.0f);
                "".length();
                if ((0xB8 ^ 0x8C ^ (0x1 ^ 0x31)) != (0x62 ^ 0x4D ^ (0x17 ^ 0x3C))) {
                    return;
                }
            }
            else {
                this.ellipse.setRadius2(this.ellipse.getRadius2() + 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[35]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[35]], ShapeTest.lIIIIIIlIlIIIl[36])) {
                this.ellipse.setCenterX(this.ellipse.getCenterX() - 1.0f);
                "".length();
                if (" ".length() <= ((0x3F ^ 0x1D) & ~(0xAF ^ 0x8D))) {
                    return;
                }
            }
            else {
                this.ellipse.setRadius1(this.ellipse.getRadius1() - 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[37]] ? 1 : 0)) {
            if (lIllIlIIIIIllII(this.lastChar[ShapeTest.lIIIIIIlIlIIIl[37]], ShapeTest.lIIIIIIlIlIIIl[38])) {
                this.ellipse.setCenterX(this.ellipse.getCenterX() + 1.0f);
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                this.ellipse.setRadius1(this.ellipse.getRadius1() + 1.0f);
            }
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[39]] ? 1 : 0)) {
            this.circle.setCenterY(this.circle.getCenterY() - 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[40]] ? 1 : 0)) {
            this.circle.setCenterY(this.circle.getCenterY() + 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[41]] ? 1 : 0)) {
            this.circle.setCenterX(this.circle.getCenterX() - 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[42]] ? 1 : 0)) {
            this.circle.setCenterX(this.circle.getCenterX() + 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[43]] ? 1 : 0)) {
            this.circle.setRadius(this.circle.getRadius() - 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[44]] ? 1 : 0)) {
            this.circle.setRadius(this.circle.getRadius() + 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[45]] ? 1 : 0)) {
            this.polygon.setY(this.polygon.getY() - 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[46]] ? 1 : 0)) {
            this.polygon.setY(this.polygon.getY() + 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[47]] ? 1 : 0)) {
            this.polygon.setX(this.polygon.getX() - 1.0f);
        }
        if (lIllIlIIIIIlIll(this.keys[ShapeTest.lIIIIIIlIlIIIl[48]] ? 1 : 0)) {
            this.polygon.setX(this.polygon.getX() + 1.0f);
        }
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIlIlIIIIllIlllIIllI, final char lllllllllllllIlIlIIIIllIlllIIlIl) {
        this.keys[lllllllllllllIlIlIIIIllIlllIIllI] = (ShapeTest.lIIIIIIlIlIIIl[4] != 0);
        this.lastChar[lllllllllllllIlIlIIIIllIlllIIllI] = lllllllllllllIlIlIIIIllIlllIIlIl;
    }
    
    private static boolean lIllIlIIIIIlIll(final int lllllllllllllIlIlIIIIllIlIIllIlI) {
        return lllllllllllllIlIlIIIIllIlIIllIlI != 0;
    }
    
    @Override
    public void keyReleased(final int lllllllllllllIlIlIIIIllIllIllllI, final char lllllllllllllIlIlIIIIllIllIlllIl) {
        this.keys[lllllllllllllIlIlIIIIllIllIllllI] = (ShapeTest.lIIIIIIlIlIIIl[0] != 0);
    }
    
    private static String lIllIlIIIIIIlll(final String lllllllllllllIlIlIIIIllIllIIlllI, final String lllllllllllllIlIlIIIIllIllIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIIllIllIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIllIllIIllIl.getBytes(StandardCharsets.UTF_8)), ShapeTest.lIIIIIIlIlIIIl[3]), "DES");
            final Cipher lllllllllllllIlIlIIIIllIllIlIIII = Cipher.getInstance("DES");
            lllllllllllllIlIlIIIIllIllIlIIII.init(ShapeTest.lIIIIIIlIlIIIl[5], lllllllllllllIlIlIIIIllIllIlIIIl);
            return new String(lllllllllllllIlIlIIIIllIllIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIllIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIIllIllIIllll) {
            lllllllllllllIlIlIIIIllIllIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIlIIIIllIlllllIll) throws SlickException {
        this.shapes = new ArrayList();
        this.rect = new Rectangle(10.0f, 10.0f, 100.0f, 80.0f);
        this.shapes.add(this.rect);
        "".length();
        this.roundRect = new RoundedRectangle(150.0f, 10.0f, 60.0f, 80.0f, 20.0f);
        this.shapes.add(this.roundRect);
        "".length();
        this.ellipse = new Ellipse(350.0f, 40.0f, 50.0f, 30.0f);
        this.shapes.add(this.ellipse);
        "".length();
        this.circle = new Circle(470.0f, 60.0f, 50.0f);
        this.shapes.add(this.circle);
        "".length();
        final float[] llllllllllllIlllIIllllIIllIIllll = new float[ShapeTest.lIIIIIIlIlIIIl[3]];
        llllllllllllIlllIIllllIIllIIllll[ShapeTest.lIIIIIIlIlIIIl[0]] = 550.0f;
        llllllllllllIlllIIllllIIllIIllll[ShapeTest.lIIIIIIlIlIIIl[4]] = 10.0f;
        llllllllllllIlllIIllllIIllIIllll[ShapeTest.lIIIIIIlIlIIIl[5]] = 600.0f;
        llllllllllllIlllIIllllIIllIIllll[ShapeTest.lIIIIIIlIlIIIl[6]] = 40.0f;
        llllllllllllIlllIIllllIIllIIllll[ShapeTest.lIIIIIIlIlIIIl[7]] = 620.0f;
        llllllllllllIlllIIllllIIllIIllll[ShapeTest.lIIIIIIlIlIIIl[8]] = 100.0f;
        llllllllllllIlllIIllllIIllIIllll[ShapeTest.lIIIIIIlIlIIIl[9]] = 570.0f;
        llllllllllllIlllIIllllIIllIIllll[ShapeTest.lIIIIIIlIlIIIl[10]] = 130.0f;
        this.polygon = new Polygon(llllllllllllIlllIIllllIIllIIllll);
        this.shapes.add(this.polygon);
        "".length();
        this.keys = new boolean[ShapeTest.lIIIIIIlIlIIIl[11]];
        this.lastChar = new char[ShapeTest.lIIIIIIlIlIIIl[11]];
        this.createPoly(200.0f, 200.0f);
    }
    
    private static void lIllIlIIIIIlIIl() {
        (lIIIIIIlIlIIIl = new int[52])[0] = ((0x1B ^ 0x17) & ~(0x38 ^ 0x34));
        ShapeTest.lIIIIIIlIlIIIl[1] = (0x51 ^ 0x5F ^ (0xA2 ^ 0xB8));
        ShapeTest.lIIIIIIlIlIIIl[2] = (45 + 59 + 62 + 9 ^ 157 + 21 - 34 + 21);
        ShapeTest.lIIIIIIlIlIIIl[3] = (0x74 ^ 0x7C);
        ShapeTest.lIIIIIIlIlIIIl[4] = " ".length();
        ShapeTest.lIIIIIIlIlIIIl[5] = "  ".length();
        ShapeTest.lIIIIIIlIlIIIl[6] = "   ".length();
        ShapeTest.lIIIIIIlIlIIIl[7] = (0x8F ^ 0x8B);
        ShapeTest.lIIIIIIlIlIIIl[8] = (22 + 123 - 5 + 7 ^ 46 + 70 - 73 + 107);
        ShapeTest.lIIIIIIlIlIIIl[9] = (0x27 ^ 0x21);
        ShapeTest.lIIIIIIlIlIIIl[10] = (0x8E ^ 0x89);
        ShapeTest.lIIIIIIlIlIIIl[11] = (0xFFFF9746 & 0x69B9);
        ShapeTest.lIIIIIIlIlIIIl[12] = (0xB6 ^ 0xBF);
        ShapeTest.lIIIIIIlIlIIIl[13] = (105 + 17 - 53 + 80 ^ 11 + 61 - 63 + 149);
        ShapeTest.lIIIIIIlIlIIIl[14] = (0x98 ^ 0x89);
        ShapeTest.lIIIIIIlIlIIIl[15] = (0x5C ^ 0x34 ^ (0x42 ^ 0x5D));
        ShapeTest.lIIIIIIlIlIIIl[16] = (0x10 ^ 0x74 ^ (0x50 ^ 0x2B));
        ShapeTest.lIIIIIIlIlIIIl[17] = (0x2A ^ 0x59);
        ShapeTest.lIIIIIIlIlIIIl[18] = (0x2E ^ 0x6E ^ (0xFD ^ 0xA3));
        ShapeTest.lIIIIIIlIlIIIl[19] = (0xA ^ 0x6B);
        ShapeTest.lIIIIIIlIlIIIl[20] = (0x38 ^ 0x2C ^ (0x5 ^ 0x31));
        ShapeTest.lIIIIIIlIlIIIl[21] = (0xD0 ^ 0xB4);
        ShapeTest.lIIIIIIlIlIIIl[22] = (0x9D ^ 0xAE ^ (0x7 ^ 0x40));
        ShapeTest.lIIIIIIlIlIIIl[23] = (0x3B ^ 0x19);
        ShapeTest.lIIIIIIlIlIIIl[24] = (0xE5 ^ 0xA3 ^ (0x40 ^ 0x61));
        ShapeTest.lIIIIIIlIlIIIl[25] = (0x5A ^ 0x14 ^ (0xF1 ^ 0x9E));
        ShapeTest.lIIIIIIlIlIIIl[26] = (0xC7 ^ 0xA1);
        ShapeTest.lIIIIIIlIlIIIl[27] = (0x2D ^ 0x72 ^ (0xE0 ^ 0x9C));
        ShapeTest.lIIIIIIlIlIIIl[28] = (0x7 ^ 0x6F);
        ShapeTest.lIIIIIIlIlIIIl[29] = (0x6D ^ 0x7E);
        ShapeTest.lIIIIIIlIlIIIl[30] = (0x90 ^ 0x85);
        ShapeTest.lIIIIIIlIlIIIl[31] = (0x71 ^ 0x38 ^ (0x4E ^ 0x10));
        ShapeTest.lIIIIIIlIlIIIl[32] = (0x13 ^ 0x58 ^ (0x36 ^ 0x14));
        ShapeTest.lIIIIIIlIlIIIl[33] = (0xAD ^ 0x9B ^ (0x28 ^ 0x3B));
        ShapeTest.lIIIIIIlIlIIIl[34] = (0x5A ^ 0x31);
        ShapeTest.lIIIIIIlIlIIIl[35] = (0x7E ^ 0x5A);
        ShapeTest.lIIIIIIlIlIIIl[36] = (0xB8 ^ 0x8D ^ (0x7F ^ 0x20));
        ShapeTest.lIIIIIIlIlIIIl[37] = (0xCC ^ 0xB1 ^ (0x38 ^ 0x63));
        ShapeTest.lIIIIIIlIlIIIl[38] = (0x10 ^ 0x7C);
        ShapeTest.lIIIIIIlIlIIIl[39] = (0xD0 ^ 0xA6) + (0xE5 ^ 0xBB) - (0xD0 ^ 0x9C) + (0x31 ^ 0x71);
        ShapeTest.lIIIIIIlIlIIIl[40] = 89 + 7 + 108 + 4;
        ShapeTest.lIIIIIIlIlIIIl[41] = 124 + 28 - 2 + 18 + (0x88 ^ 0x82) - (0x0 ^ 0x5F) + (0x72 ^ 0xA);
        ShapeTest.lIIIIIIlIlIIIl[42] = 190 + 26 - 163 + 152;
        ShapeTest.lIIIIIIlIlIIIl[43] = 140 + 164 - 296 + 193;
        ShapeTest.lIIIIIIlIlIIIl[44] = 206 + 48 - 134 + 89;
        ShapeTest.lIIIIIIlIlIIIl[45] = (0x18 ^ 0x6 ^ (0x77 ^ 0x21));
        ShapeTest.lIIIIIIlIlIIIl[46] = (0x61 ^ 0x3E ^ (0x12 ^ 0x1));
        ShapeTest.lIIIIIIlIlIIIl[47] = (0xE4 ^ 0xAF);
        ShapeTest.lIIIIIIlIlIIIl[48] = (0x10 ^ 0x5D);
        ShapeTest.lIIIIIIlIlIIIl[49] = (0xFFFF876C & 0x7BB3);
        ShapeTest.lIIIIIIlIlIIIl[50] = (0xFFFFC7DA & 0x3A7D);
        ShapeTest.lIIIIIIlIlIIIl[51] = (0x55 ^ 0x59);
    }
    
    private static String lIllIlIIIIIIllI(final String lllllllllllllIlIlIIIIllIlIlIlIIl, final String lllllllllllllIlIlIIIIllIlIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIIllIlIlIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIllIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIIIllIlIlIlIll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIIIllIlIlIlIll.init(ShapeTest.lIIIIIIlIlIIIl[5], lllllllllllllIlIlIIIIllIlIlIllII);
            return new String(lllllllllllllIlIlIIIIllIlIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIllIlIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIIllIlIlIlIlI) {
            lllllllllllllIlIlIIIIllIlIlIlIlI.printStackTrace();
            return null;
        }
    }
}
