// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Arrays;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.geom.Vector2f;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.geom.GeomUtil;
import java.util.ArrayList;
import org.newdawn.slick.geom.Circle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.GeomUtilListener;
import org.newdawn.slick.BasicGame;

public class GeomUtilTest extends BasicGame implements GeomUtilListener
{
    private static final /* synthetic */ int[] lIlIlIIlllIlIl;
    private static final /* synthetic */ String[] lIlIlIIlllIlII;
    private /* synthetic */ boolean dynamic;
    private /* synthetic */ Shape[] result;
    private /* synthetic */ int xp;
    private /* synthetic */ Circle circle;
    private /* synthetic */ Shape source;
    private /* synthetic */ ArrayList points;
    private /* synthetic */ boolean union;
    private /* synthetic */ ArrayList marks;
    private /* synthetic */ GeomUtil util;
    private /* synthetic */ ArrayList exclude;
    private /* synthetic */ int yp;
    private /* synthetic */ Shape rect;
    private /* synthetic */ Shape cut;
    private /* synthetic */ Polygon star;
    
    @Override
    public void update(final GameContainer lllllllllllllIIIlIIlIIlIlIlIllll, final int lllllllllllllIIIlIIlIIlIlIllIIIl) throws SlickException {
        if (lllIllIlIlIlIlI(lllllllllllllIIIlIIlIIlIlIlIllll.getInput().isKeyPressed(GeomUtilTest.lIlIlIIlllIlIl[3]) ? 1 : 0)) {
            int dynamic;
            if (lllIllIlIlIlIIl(this.dynamic ? 1 : 0)) {
                dynamic = GeomUtilTest.lIlIlIIlllIlIl[2];
                "".length();
                if ((0x88 ^ 0x8C) <= "  ".length()) {
                    return;
                }
            }
            else {
                dynamic = GeomUtilTest.lIlIlIIlllIlIl[0];
            }
            this.dynamic = (dynamic != 0);
        }
        if (lllIllIlIlIlIlI(lllllllllllllIIIlIIlIIlIlIlIllll.getInput().isKeyPressed(GeomUtilTest.lIlIlIIlllIlIl[4]) ? 1 : 0)) {
            int union;
            if (lllIllIlIlIlIIl(this.union ? 1 : 0)) {
                union = GeomUtilTest.lIlIlIIlllIlIl[2];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                union = GeomUtilTest.lIlIlIIlllIlIl[0];
            }
            this.union = (union != 0);
            this.makeBoolean();
        }
        if (lllIllIlIlIlIlI(lllllllllllllIIIlIIlIIlIlIlIllll.getInput().isKeyPressed(GeomUtilTest.lIlIlIIlllIlIl[5]) ? 1 : 0)) {
            this.cut = this.circle;
            this.circle.setCenterX((float)this.xp);
            this.circle.setCenterY((float)this.yp);
            this.makeBoolean();
        }
        if (lllIllIlIlIlIlI(lllllllllllllIIIlIIlIIlIlIlIllll.getInput().isKeyPressed(GeomUtilTest.lIlIlIIlllIlIl[6]) ? 1 : 0)) {
            this.cut = this.rect;
            this.rect.setCenterX((float)this.xp);
            this.rect.setCenterY((float)this.yp);
            this.makeBoolean();
        }
        if (lllIllIlIlIlIlI(lllllllllllllIIIlIIlIIlIlIlIllll.getInput().isKeyPressed(GeomUtilTest.lIlIlIIlllIlIl[7]) ? 1 : 0)) {
            this.cut = this.star;
            this.star.setCenterX((float)this.xp);
            this.star.setCenterY((float)this.yp);
            this.makeBoolean();
        }
        if (lllIllIlIlIlIlI(this.dynamic ? 1 : 0)) {
            this.xp = lllllllllllllIIIlIIlIIlIlIlIllll.getInput().getMouseX();
            this.yp = lllllllllllllIIIlIIlIIlIlIlIllll.getInput().getMouseY();
            this.makeBoolean();
        }
    }
    
    private static String lllIllIlIlIIlII(final String lllllllllllllIIIlIIlIIlIIlIIIlIl, final String lllllllllllllIIIlIIlIIlIIlIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIlIIlIIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIIlIIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIlIIlIIlIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIlIIlIIlIIlIIl.init(GeomUtilTest.lIlIlIIlllIlIl[5], lllllllllllllIIIlIIlIIlIIlIIlIlI);
            return new String(lllllllllllllIIIlIIlIIlIIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIlIIlIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIlIIlIIlIIlIII) {
            lllllllllllllIIIlIIlIIlIIlIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIllIlIlIlIlI(final int lllllllllllllIIIlIIlIIlIIIlllIlI) {
        return lllllllllllllIIIlIIlIIlIIIlllIlI != 0;
    }
    
    static {
        lllIllIlIlIIllI();
        lllIllIlIlIIlIl();
    }
    
    private void makeBoolean() {
        this.marks.clear();
        this.points.clear();
        this.exclude.clear();
        this.cut.setCenterX((float)this.xp);
        this.cut.setCenterY((float)this.yp);
        if (lllIllIlIlIlIlI(this.union ? 1 : 0)) {
            this.result = this.util.union(this.source, this.cut);
            "".length();
            if (-" ".length() == ((0x8B ^ 0x84) & ~(0xA9 ^ 0xA6))) {
                return;
            }
        }
        else {
            this.result = this.util.subtract(this.source, this.cut);
        }
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIlIIlIIlIlIlllIII) throws SlickException {
        this.util.setListener(this);
        this.init();
        lllllllllllllIIIlIIlIIlIlIlllIII.setVSync((boolean)(GeomUtilTest.lIlIlIIlllIlIl[2] != 0));
    }
    
    private static int lllIllIlIlIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void pointUsed(final float lllllllllllllIIIlIIlIIlIIllllllI, final float lllllllllllllIIIlIIlIIlIIllllIlI) {
        this.points.add(new Vector2f(lllllllllllllIIIlIIlIIlIIllllllI, lllllllllllllIIIlIIlIIlIIllllIlI));
        "".length();
    }
    
    public GeomUtilTest() {
        super(GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[0]]);
        this.points = new ArrayList();
        this.marks = new ArrayList();
        this.exclude = new ArrayList();
        this.util = new GeomUtil();
    }
    
    @Override
    public void mouseWheelMoved(final int lllllllllllllIIIlIIlIIlIIlllIllI) {
        if (lllIllIlIlIlIlI(this.dynamic ? 1 : 0)) {
            if (lllIllIlIlIllII(lllllllllllllIIIlIIlIIlIIlllIllI)) {
                this.cut = this.cut.transform(Transform.createRotateTransform((float)Math.toRadians(10.0), this.cut.getCenterX(), this.cut.getCenterY()));
                "".length();
                if ((0x14 ^ 0x4D ^ (0xC7 ^ 0x9A)) == 0x0) {
                    return;
                }
            }
            else {
                this.cut = this.cut.transform(Transform.createRotateTransform((float)Math.toRadians(-10.0), this.cut.getCenterX(), this.cut.getCenterY()));
            }
        }
    }
    
    public void render(final GameContainer lllllllllllllIIIlIIlIIlIlIIlllll, final Graphics lllllllllllllIIIlIIlIIlIlIIlllII) throws SlickException {
        lllllllllllllIIIlIIlIIlIlIIlllII.drawString(GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[2]], 530.0f, 10.0f);
        lllllllllllllIIIlIIlIIlIlIIlllII.drawString(GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[5]], 530.0f, 30.0f);
        lllllllllllllIIIlIIlIIlIlIIlllII.drawString(GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[6]], 530.0f, 50.0f);
        lllllllllllllIIIlIIlIIlIlIIlllII.drawString(GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[7]], 530.0f, 70.0f);
        final StringBuilder append = new StringBuilder().append(GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[8]]);
        String str;
        if (lllIllIlIlIlIlI(this.union ? 1 : 0)) {
            str = GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[9]];
            "".length();
            if ("  ".length() == " ".length()) {
                return;
            }
        }
        else {
            str = GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[10]];
        }
        lllllllllllllIIIlIIlIIlIlIIlllII.drawString(String.valueOf(append.append(str)), 530.0f, 200.0f);
        lllllllllllllIIIlIIlIIlIlIIlllII.setColor(Color.green);
        lllllllllllllIIIlIIlIIlIlIIlllII.draw(this.source);
        lllllllllllllIIIlIIlIIlIlIIlllII.setColor(Color.red);
        lllllllllllllIIIlIIlIIlIlIIlllII.draw(this.cut);
        lllllllllllllIIIlIIlIIlIlIIlllII.setColor(Color.white);
        int lllllllllllllIIIlIIlIIlIlIlIIllI = GeomUtilTest.lIlIlIIlllIlIl[0];
        while (lllIllIlIlIlIII(lllllllllllllIIIlIIlIIlIlIlIIllI, this.exclude.size())) {
            final Vector2f lllllllllllllIIIlIIlIIlIlIlIIlll = this.exclude.get(lllllllllllllIIIlIIlIIlIlIlIIllI);
            lllllllllllllIIIlIIlIIlIlIIlllII.drawOval(lllllllllllllIIIlIIlIIlIlIlIIlll.x - 3.0f, lllllllllllllIIIlIIlIIlIlIlIIlll.y - 3.0f, 7.0f, 7.0f);
            ++lllllllllllllIIIlIIlIIlIlIlIIllI;
            "".length();
            if (((86 + 52 - 80 + 136 ^ 19 + 98 - 74 + 88) & (0x6E ^ 0x50 ^ 36 + 119 - 66 + 38 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        lllllllllllllIIIlIIlIIlIlIIlllII.setColor(Color.yellow);
        int lllllllllllllIIIlIIlIIlIlIlIIlII = GeomUtilTest.lIlIlIIlllIlIl[0];
        while (lllIllIlIlIlIII(lllllllllllllIIIlIIlIIlIlIlIIlII, this.points.size())) {
            final Vector2f lllllllllllllIIIlIIlIIlIlIlIIlIl = this.points.get(lllllllllllllIIIlIIlIIlIlIlIIlII);
            lllllllllllllIIIlIIlIIlIlIIlllII.fillOval(lllllllllllllIIIlIIlIIlIlIlIIlIl.x - 1.0f, lllllllllllllIIIlIIlIIlIlIlIIlIl.y - 1.0f, 3.0f, 3.0f);
            ++lllllllllllllIIIlIIlIIlIlIlIIlII;
            "".length();
            if ("   ".length() == -" ".length()) {
                return;
            }
        }
        lllllllllllllIIIlIIlIIlIlIIlllII.setColor(Color.white);
        int lllllllllllllIIIlIIlIIlIlIlIIIlI = GeomUtilTest.lIlIlIIlllIlIl[0];
        while (lllIllIlIlIlIII(lllllllllllllIIIlIIlIIlIlIlIIIlI, this.marks.size())) {
            final Vector2f lllllllllllllIIIlIIlIIlIlIlIIIll = this.marks.get(lllllllllllllIIIlIIlIIlIlIlIIIlI);
            lllllllllllllIIIlIIlIIlIlIIlllII.fillOval(lllllllllllllIIIlIIlIIlIlIlIIIll.x - 1.0f, lllllllllllllIIIlIIlIIlIlIlIIIll.y - 1.0f, 3.0f, 3.0f);
            ++lllllllllllllIIIlIIlIIlIlIlIIIlI;
            "".length();
            if ("  ".length() <= ((0x57 ^ 0x39 ^ (0xD4 ^ 0xA5)) & (103 + 170 - 131 + 37 ^ 122 + 31 - 49 + 68 ^ -" ".length()))) {
                return;
            }
        }
        lllllllllllllIIIlIIlIIlIlIIlllII.translate(0.0f, 300.0f);
        lllllllllllllIIIlIIlIIlIlIIlllII.setColor(Color.white);
        if (lllIllIlIlIlIll(this.result)) {
            int lllllllllllllIIIlIIlIIlIlIlIIIIl = GeomUtilTest.lIlIlIIlllIlIl[0];
            while (lllIllIlIlIlIII(lllllllllllllIIIlIIlIIlIlIlIIIIl, this.result.length)) {
                lllllllllllllIIIlIIlIIlIlIIlllII.draw(this.result[lllllllllllllIIIlIIlIIlIlIlIIIIl]);
                ++lllllllllllllIIIlIIlIIlIlIlIIIIl;
                "".length();
                if (" ".length() > "   ".length()) {
                    return;
                }
            }
            lllllllllllllIIIlIIlIIlIlIIlllII.drawString(String.valueOf(new StringBuilder().append(GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[11]]).append(this.result.length)), 10.0f, 100.0f);
            lllllllllllllIIIlIIlIIlIlIIlllII.drawString(String.valueOf(new StringBuilder().append(GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[12]]).append(this.xp)), 10.0f, 120.0f);
            lllllllllllllIIIlIIlIIlIlIIlllII.drawString(String.valueOf(new StringBuilder().append(GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[13]]).append(this.yp)), 10.0f, 130.0f);
        }
    }
    
    public void pointExcluded(final float lllllllllllllIIIlIIlIIlIlIIIllIl, final float lllllllllllllIIIlIIlIIlIlIIIllII) {
        this.exclude.add(new Vector2f(lllllllllllllIIIlIIlIIlIlIIIllIl, lllllllllllllIIIlIIlIIlIlIIIllII));
        "".length();
    }
    
    private static boolean lllIllIlIlIlIIl(final int lllllllllllllIIIlIIlIIlIIIlllIII) {
        return lllllllllllllIIIlIIlIIlIIIlllIII == 0;
    }
    
    private static void lllIllIlIlIIlIl() {
        (lIlIlIIlllIlII = new String[GeomUtilTest.lIlIlIIlllIlIl[16]])[GeomUtilTest.lIlIlIIlllIlIl[0]] = lllIllIlIlIIIlI("RRwyQeIaQkbvqssincVk7g==", "RqCPU");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[2]] = lllIllIlIlIIIll("ADYKAQFza0sWCzQhBwdEPikdBwk2KB9CCzVmCBcQJy8FBUQgLgoSAQ==", "SFkbd");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[5]] = lllIllIlIlIIIll("Vn12f1dHfGQgAQs0JydEBCQwJw0JNmQgDAYhIQ==", "gQDSd");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[6]] = lllIllIlIlIIIll("PCsPNydRMxIhJx1kV2QwHjAbMCdRNxIlMhQ=", "qDzDB");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[7]] = lllIllIlIlIIlII("kEMEdviX3Tv4DdQJ6vo0gRh6tNWXBX9TZui0vssQdWU=", "WXtvK");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[8]] = lllIllIlIlIIIlI("weFNFkcs+Hk=", "AufGs");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[9]] = lllIllIlIlIIIlI("Ix5kD+gI24Q=", "ZSVLV");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[10]] = lllIllIlIlIIIlI("WAkss1fRw70=", "FZHGl");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[11]] = lllIllIlIlIIIlI("SdnOwYnC9Pw=", "LfiPR");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[12]] = lllIllIlIlIIIlI("IUdwttITa7U=", "qjTuQ");
        GeomUtilTest.lIlIlIIlllIlII[GeomUtilTest.lIlIlIIlllIlIl[13]] = lllIllIlIlIIlII("xlMbgkCGc50=", "iUKAJ");
    }
    
    private static boolean lllIllIlIlIllII(final int lllllllllllllIIIlIIlIIlIIIllIllI) {
        return lllllllllllllIIIlIIlIIlIIIllIllI < 0;
    }
    
    public void init() {
        final Polygon lllllllllllllIIIlIIlIIlIllIIIIll = new Polygon();
        lllllllllllllIIIlIIlIIlIllIIIIll.addPoint(100.0f, 100.0f);
        lllllllllllllIIIlIIlIIlIllIIIIll.addPoint(150.0f, 80.0f);
        lllllllllllllIIIlIIlIIlIllIIIIll.addPoint(210.0f, 120.0f);
        lllllllllllllIIIlIIlIIlIllIIIIll.addPoint(340.0f, 150.0f);
        lllllllllllllIIIlIIlIIlIllIIIIll.addPoint(150.0f, 200.0f);
        lllllllllllllIIIlIIlIIlIllIIIIll.addPoint(120.0f, 250.0f);
        this.source = lllllllllllllIIIlIIlIIlIllIIIIll;
        this.circle = new Circle(0.0f, 0.0f, 50.0f);
        this.rect = new Rectangle(-100.0f, -40.0f, 200.0f, 80.0f);
        this.star = new Polygon();
        float lllllllllllllIIIlIIlIIlIllIIIIlI = 40.0f;
        int lllllllllllllIIIlIIlIIlIllIIIlIl = GeomUtilTest.lIlIlIIlllIlIl[0];
        while (lllIllIlIlIlIII(lllllllllllllIIIlIIlIIlIllIIIlIl, GeomUtilTest.lIlIlIIlllIlIl[1])) {
            float n;
            if (lllIllIlIlIlIIl(lllIllIlIlIIlll(lllllllllllllIIIlIIlIIlIllIIIIlI, 40.0f))) {
                n = 60.0f;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                n = 40.0f;
            }
            lllllllllllllIIIlIIlIIlIllIIIIlI = n;
            final double lllllllllllllIIIlIIlIIlIllIIIlll = Math.cos(Math.toRadians(lllllllllllllIIIlIIlIIlIllIIIlIl)) * lllllllllllllIIIlIIlIIlIllIIIIlI;
            final double lllllllllllllIIIlIIlIIlIllIIIllI = Math.sin(Math.toRadians(lllllllllllllIIIlIIlIIlIllIIIlIl)) * lllllllllllllIIIlIIlIIlIllIIIIlI;
            this.star.addPoint((float)lllllllllllllIIIlIIlIIlIllIIIlll, (float)lllllllllllllIIIlIIlIIlIllIIIllI);
            lllllllllllllIIIlIIlIIlIllIIIlIl += 30;
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        this.cut = this.circle;
        this.cut.setLocation(203.0f, 78.0f);
        this.xp = (int)this.cut.getCenterX();
        this.yp = (int)this.cut.getCenterY();
        this.makeBoolean();
    }
    
    private static String lllIllIlIlIIIlI(final String lllllllllllllIIIlIIlIIlIIllIlIlI, final String lllllllllllllIIIlIIlIIlIIllIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIlIIlIIllIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIlIIlIIllIlIll.getBytes(StandardCharsets.UTF_8)), GeomUtilTest.lIlIlIIlllIlIl[11]), "DES");
            final Cipher lllllllllllllIIIlIIlIIlIIllIlllI = Cipher.getInstance("DES");
            lllllllllllllIIIlIIlIIlIIllIlllI.init(GeomUtilTest.lIlIlIIlllIlIl[5], lllllllllllllIIIlIIlIIlIIllIllll);
            return new String(lllllllllllllIIIlIIlIIlIIllIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIlIIlIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIlIIlIIllIllIl) {
            lllllllllllllIIIlIIlIIlIIllIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIllIlIlIlIII(final int lllllllllllllIIIlIIlIIlIIIllllll, final int lllllllllllllIIIlIIlIIlIIIlllllI) {
        return lllllllllllllIIIlIIlIIlIIIllllll < lllllllllllllIIIlIIlIIlIIIlllllI;
    }
    
    private static boolean lllIllIlIlIlIll(final Object lllllllllllllIIIlIIlIIlIIIllllII) {
        return lllllllllllllIIIlIIlIIlIIIllllII != null;
    }
    
    public static void main(final String[] lllllllllllllIIIlIIlIIlIlIIlIllI) {
        try {
            final AppGameContainer lllllllllllllIIIlIIlIIlIlIIllIII = new AppGameContainer(new GeomUtilTest());
            lllllllllllllIIIlIIlIIlIlIIllIII.setDisplayMode(GeomUtilTest.lIlIlIIlllIlIl[14], GeomUtilTest.lIlIlIIlllIlIl[15], (boolean)(GeomUtilTest.lIlIlIIlllIlIl[0] != 0));
            lllllllllllllIIIlIIlIIlIlIIllIII.start();
            "".length();
            if ((31 + 43 - 19 + 103 ^ 45 + 135 - 106 + 80) == 0x0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIlIIlIIlIlIIlIlll) {
            lllllllllllllIIIlIIlIIlIlIIlIlll.printStackTrace();
        }
    }
    
    public void pointIntersected(final float lllllllllllllIIIlIIlIIlIlIIIIlll, final float lllllllllllllIIIlIIlIIlIlIIIIllI) {
        this.marks.add(new Vector2f(lllllllllllllIIIlIIlIIlIlIIIIlll, lllllllllllllIIIlIIlIIlIlIIIIllI));
        "".length();
    }
    
    private static String lllIllIlIlIIIll(String lllllllllllllIIIlIIlIIlIIlIlIlll, final String lllllllllllllIIIlIIlIIlIIlIllIll) {
        lllllllllllllIIIlIIlIIlIIlIlIlll = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIlIIlIIlIlIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIlIIlIIlIllIlI = new StringBuilder();
        final char[] lllllllllllllIIIlIIlIIlIIlIllIIl = lllllllllllllIIIlIIlIIlIIlIllIll.toCharArray();
        int lllllllllllllIIIlIIlIIlIIlIllIII = GeomUtilTest.lIlIlIIlllIlIl[0];
        final boolean lllllllllllllIIIlIIlIIlIIlIlIIlI = (Object)((String)lllllllllllllIIIlIIlIIlIIlIlIlll).toCharArray();
        final double lllllllllllllIIIlIIlIIlIIlIlIIIl = lllllllllllllIIIlIIlIIlIIlIlIIlI.length;
        Exception lllllllllllllIIIlIIlIIlIIlIlIIII = (Exception)GeomUtilTest.lIlIlIIlllIlIl[0];
        while (lllIllIlIlIlIII((int)lllllllllllllIIIlIIlIIlIIlIlIIII, (int)lllllllllllllIIIlIIlIIlIIlIlIIIl)) {
            final char lllllllllllllIIIlIIlIIlIIlIlllIl = lllllllllllllIIIlIIlIIlIIlIlIIlI[lllllllllllllIIIlIIlIIlIIlIlIIII];
            lllllllllllllIIIlIIlIIlIIlIllIlI.append((char)(lllllllllllllIIIlIIlIIlIIlIlllIl ^ lllllllllllllIIIlIIlIIlIIlIllIIl[lllllllllllllIIIlIIlIIlIIlIllIII % lllllllllllllIIIlIIlIIlIIlIllIIl.length]));
            "".length();
            ++lllllllllllllIIIlIIlIIlIIlIllIII;
            ++lllllllllllllIIIlIIlIIlIIlIlIIII;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIlIIlIIlIllIlI);
    }
    
    private static void lllIllIlIlIIllI() {
        (lIlIlIIlllIlIl = new int[17])[0] = ((0x81 ^ 0x9A) & ~(0x8B ^ 0x90));
        GeomUtilTest.lIlIlIIlllIlIl[1] = (0xFFFFE3EC & 0x1D7B);
        GeomUtilTest.lIlIlIIlllIlIl[2] = " ".length();
        GeomUtilTest.lIlIlIIlllIlIl[3] = (0x68 ^ 0x51);
        GeomUtilTest.lIlIlIIlllIlIl[4] = (0x60 ^ 0x7C);
        GeomUtilTest.lIlIlIIlllIlIl[5] = "  ".length();
        GeomUtilTest.lIlIlIIlllIlIl[6] = "   ".length();
        GeomUtilTest.lIlIlIIlllIlIl[7] = (155 + 170 - 207 + 59 ^ 141 + 135 - 180 + 85);
        GeomUtilTest.lIlIlIIlllIlIl[8] = (0x37 ^ 0x32);
        GeomUtilTest.lIlIlIIlllIlIl[9] = (0x6A ^ 0x6C);
        GeomUtilTest.lIlIlIIlllIlIl[10] = (83 + 87 - 116 + 137 ^ 104 + 15 - 20 + 85);
        GeomUtilTest.lIlIlIIlllIlIl[11] = (0x2D ^ 0x25);
        GeomUtilTest.lIlIlIIlllIlIl[12] = (0x39 ^ 0x30);
        GeomUtilTest.lIlIlIIlllIlIl[13] = (0x2E ^ 0x24);
        GeomUtilTest.lIlIlIIlllIlIl[14] = (-(0xFFFFF5DE & 0xE7D) & (0xFFFFA7FB & 0x5F7F));
        GeomUtilTest.lIlIlIIlllIlIl[15] = (-(0xFFFFDFBB & 0x25CC) & (0xFFFFC7DF & 0x3FFF));
        GeomUtilTest.lIlIlIIlllIlIl[16] = (0x86 ^ 0x8D);
    }
}
