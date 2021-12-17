// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.geom.Curve;
import org.newdawn.slick.BasicGame;

public class CurveTest extends BasicGame
{
    private /* synthetic */ Curve curve;
    private /* synthetic */ Vector2f c1;
    private /* synthetic */ Vector2f c2;
    private static final /* synthetic */ String[] lllIIllIllIIII;
    private static final /* synthetic */ int[] lllIIllIllIIIl;
    private /* synthetic */ Vector2f p2;
    private /* synthetic */ Vector2f p1;
    private /* synthetic */ Polygon poly;
    
    private static void lIlIIIIIIlllllII() {
        (lllIIllIllIIIl = new int[6])[0] = ((93 + 72 - 49 + 13 ^ 16 + 95 - 41 + 75) & (0 + 132 + 5 + 45 ^ 31 + 19 + 100 + 16 ^ -" ".length()));
        CurveTest.lllIIllIllIIIl[1] = (-(0xFFFFF9DF & 0x6EBA) & (0xFFFFEBBB & 0x7FFD));
        CurveTest.lllIIllIllIIIl[2] = (-(0xFFFFEB7F & 0x7D87) & (0xFFFFEB5E & 0x7FFF));
        CurveTest.lllIIllIllIIIl[3] = " ".length();
        CurveTest.lllIIllIllIIIl[4] = (0x1C ^ 0x14);
        CurveTest.lllIIllIllIIIl[5] = "  ".length();
    }
    
    public void render(final GameContainer llllllllllllIlIlllIllllIIllIIIII, final Graphics llllllllllllIlIlllIllllIIlIlllll) throws SlickException {
        llllllllllllIlIlllIllllIIlIlllll.setColor(Color.gray);
        this.drawMarker(llllllllllllIlIlllIllllIIlIlllll, this.p1);
        this.drawMarker(llllllllllllIlIlllIllllIIlIlllll, this.p2);
        llllllllllllIlIlllIllllIIlIlllll.setColor(Color.red);
        this.drawMarker(llllllllllllIlIlllIllllIIlIlllll, this.c1);
        this.drawMarker(llllllllllllIlIlllIllllIIlIlllll, this.c2);
        llllllllllllIlIlllIllllIIlIlllll.setColor(Color.black);
        llllllllllllIlIlllIllllIIlIlllll.draw(this.curve);
        llllllllllllIlIlllIllllIIlIlllll.fill(this.curve);
        llllllllllllIlIlllIllllIIlIlllll.draw(this.poly);
        llllllllllllIlIlllIllllIIlIlllll.fill(this.poly);
    }
    
    private static String lIlIIIIIIllllIlI(final String llllllllllllIlIlllIllllIIlIIlllI, final String llllllllllllIlIlllIllllIIlIIllll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllllIIlIlIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllllIIlIIllll.getBytes(StandardCharsets.UTF_8)), CurveTest.lllIIllIllIIIl[4]), "DES");
            final Cipher llllllllllllIlIlllIllllIIlIlIIlI = Cipher.getInstance("DES");
            llllllllllllIlIlllIllllIIlIlIIlI.init(CurveTest.lllIIllIllIIIl[5], llllllllllllIlIlllIllllIIlIlIIll);
            return new String(llllllllllllIlIlllIllllIIlIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllllIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllllIIlIlIIIl) {
            llllllllllllIlIlllIllllIIlIlIIIl.printStackTrace();
            return null;
        }
    }
    
    public CurveTest() {
        super(CurveTest.lllIIllIllIIII[CurveTest.lllIIllIllIIIl[0]]);
        this.p1 = new Vector2f(100.0f, 300.0f);
        this.c1 = new Vector2f(100.0f, 100.0f);
        this.c2 = new Vector2f(300.0f, 100.0f);
        this.p2 = new Vector2f(300.0f, 300.0f);
    }
    
    private static void lIlIIIIIIllllIll() {
        (lllIIllIllIIII = new String[CurveTest.lllIIllIllIIIl[3]])[CurveTest.lllIIllIllIIIl[0]] = lIlIIIIIIllllIlI("49UsIExg18IlhtFRs7yATw==", "YYIav");
    }
    
    private void drawMarker(final Graphics llllllllllllIlIlllIllllIIllIIlIl, final Vector2f llllllllllllIlIlllIllllIIllIIlII) {
        llllllllllllIlIlllIllllIIllIIlIl.drawRect(llllllllllllIlIlllIllllIIllIIlII.x - 5.0f, llllllllllllIlIlllIllllIIllIIlII.y - 5.0f, 10.0f, 10.0f);
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlIlllIllllIIllIlllI) throws SlickException {
        llllllllllllIlIlllIllllIIllIlllI.getGraphics().setBackground(Color.white);
        this.curve = new Curve(this.p2, this.c2, this.c1, this.p1);
        this.poly = new Polygon();
        this.poly.addPoint(500.0f, 200.0f);
        this.poly.addPoint(600.0f, 200.0f);
        this.poly.addPoint(700.0f, 300.0f);
        this.poly.addPoint(400.0f, 300.0f);
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlIlllIllllIIllIllII, final int llllllllllllIlIlllIllllIIllIlIll) throws SlickException {
    }
    
    public static void main(final String[] llllllllllllIlIlllIllllIIlIllIIl) {
        try {
            final AppGameContainer llllllllllllIlIlllIllllIIlIllIll = new AppGameContainer(new CurveTest());
            llllllllllllIlIlllIllllIIlIllIll.setDisplayMode(CurveTest.lllIIllIllIIIl[1], CurveTest.lllIIllIllIIIl[2], (boolean)(CurveTest.lllIIllIllIIIl[0] != 0));
            llllllllllllIlIlllIllllIIlIllIll.start();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIlllIllllIIlIllIlI) {
            llllllllllllIlIlllIllllIIlIllIlI.printStackTrace();
        }
    }
    
    static {
        lIlIIIIIIlllllII();
        lIlIIIIIIllllIll();
    }
}
