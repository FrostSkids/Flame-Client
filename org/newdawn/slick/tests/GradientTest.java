// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.ShapeFill;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.fills.GradientFill;
import org.newdawn.slick.geom.RoundedRectangle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.BasicGame;

public class GradientTest extends BasicGame
{
    private /* synthetic */ Rectangle rect;
    private /* synthetic */ RoundedRectangle round2;
    private /* synthetic */ RoundedRectangle round;
    private /* synthetic */ GradientFill gradient;
    private /* synthetic */ Rectangle center;
    private /* synthetic */ float ang;
    private static final /* synthetic */ String[] llIlIllIlIlIII;
    private /* synthetic */ GameContainer container;
    private /* synthetic */ GradientFill gradient2;
    private /* synthetic */ Polygon poly;
    private static final /* synthetic */ int[] llIlIllIlIlIIl;
    private /* synthetic */ GradientFill gradient4;
    
    private static void lIIlIlIlIlIIllll() {
        (llIlIllIlIlIIl = new int[5])[0] = ((64 + 94 - 40 + 14 ^ 15 + 2 - 13 + 177) & (117 + 103 - 169 + 77 ^ 152 + 32 - 52 + 45 ^ -" ".length()));
        GradientTest.llIlIllIlIlIIl[1] = " ".length();
        GradientTest.llIlIllIlIlIIl[2] = "  ".length();
        GradientTest.llIlIllIlIlIIl[3] = (0xFFFFCB3B & 0x37E4);
        GradientTest.llIlIllIlIlIIl[4] = (-(0xFFFFDD7E & 0x76A5) & (0xFFFFF7FF & 0x5E7B));
    }
    
    public static void main(final String[] llllllllllllIllIlIIlIlllIIllllIl) {
        try {
            Renderer.setRenderer(GradientTest.llIlIllIlIlIIl[2]);
            final AppGameContainer llllllllllllIllIlIIlIlllIIllllll = new AppGameContainer(new GradientTest());
            llllllllllllIllIlIIlIlllIIllllll.setDisplayMode(GradientTest.llIlIllIlIlIIl[3], GradientTest.llIlIllIlIlIIl[4], (boolean)(GradientTest.llIlIllIlIlIIl[0] != 0));
            llllllllllllIllIlIIlIlllIIllllll.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIlIIlIlllIIlllllI) {
            llllllllllllIllIlIIlIlllIIlllllI.printStackTrace();
        }
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIlIIlIlllIlIIIlII, final int llllllllllllIllIlIIlIlllIlIIIIll) {
        this.ang += llllllllllllIllIlIIlIlllIlIIIIll * 0.01f;
    }
    
    static {
        lIIlIlIlIlIIllll();
        lIIlIlIlIlIIllIl();
    }
    
    private static String lIIlIlIlIlIIllII(final String llllllllllllIllIlIIlIlllIIlIllIl, final String llllllllllllIllIlIIlIlllIIlIllII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIlllIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIlllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIlIlllIIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIlIlllIIlIllll.init(GradientTest.llIlIllIlIlIIl[2], llllllllllllIllIlIIlIlllIIllIIII);
            return new String(llllllllllllIllIlIIlIlllIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIlllIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIlllIIlIlllI) {
            llllllllllllIllIlIIlIlllIIlIlllI.printStackTrace();
            return null;
        }
    }
    
    public GradientTest() {
        super(GradientTest.llIlIllIlIlIII[GradientTest.llIlIllIlIlIIl[0]]);
    }
    
    private static void lIIlIlIlIlIIllIl() {
        (llIlIllIlIlIII = new String[GradientTest.llIlIllIlIlIIl[1]])[GradientTest.llIlIllIlIlIIl[0]] = lIIlIlIlIlIIllII("o9wwguzUao5mNnZL5aKDdA==", "ZUMMT");
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIlIIlIlllIlIlIIIl) throws SlickException {
        this.container = llllllllllllIllIlIIlIlllIlIlIIIl;
        this.rect = new Rectangle(400.0f, 100.0f, 200.0f, 150.0f);
        this.round = new RoundedRectangle(150.0f, 100.0f, 200.0f, 150.0f, 50.0f);
        this.round2 = new RoundedRectangle(150.0f, 300.0f, 200.0f, 150.0f, 50.0f);
        this.center = new Rectangle(350.0f, 250.0f, 100.0f, 100.0f);
        this.poly = new Polygon();
        this.poly.addPoint(400.0f, 350.0f);
        this.poly.addPoint(550.0f, 320.0f);
        this.poly.addPoint(600.0f, 380.0f);
        this.poly.addPoint(620.0f, 450.0f);
        this.poly.addPoint(500.0f, 450.0f);
        this.gradient = new GradientFill(0.0f, -75.0f, Color.red, 0.0f, 75.0f, Color.yellow, (boolean)(GradientTest.llIlIllIlIlIIl[1] != 0));
        this.gradient2 = new GradientFill(0.0f, -75.0f, Color.blue, 0.0f, 75.0f, Color.white, (boolean)(GradientTest.llIlIllIlIlIIl[1] != 0));
        this.gradient4 = new GradientFill(-50.0f, -40.0f, Color.green, 50.0f, 40.0f, Color.cyan, (boolean)(GradientTest.llIlIllIlIlIIl[1] != 0));
    }
    
    public void render(final GameContainer llllllllllllIllIlIIlIlllIlIIlIll, final Graphics llllllllllllIllIlIIlIlllIlIIlIII) {
        llllllllllllIllIlIIlIlllIlIIlIII.rotate(400.0f, 300.0f, this.ang);
        llllllllllllIllIlIIlIlllIlIIlIII.fill(this.rect, this.gradient);
        llllllllllllIllIlIIlIlllIlIIlIII.fill(this.round, this.gradient);
        llllllllllllIllIlIIlIlllIlIIlIII.fill(this.poly, this.gradient2);
        llllllllllllIllIlIIlIlllIlIIlIII.fill(this.center, this.gradient4);
        llllllllllllIllIlIIlIlllIlIIlIII.setAntiAlias((boolean)(GradientTest.llIlIllIlIlIIl[1] != 0));
        llllllllllllIllIlIIlIlllIlIIlIII.setLineWidth(10.0f);
        llllllllllllIllIlIIlIlllIlIIlIII.draw(this.round2, this.gradient2);
        llllllllllllIllIlIIlIlllIlIIlIII.setLineWidth(2.0f);
        llllllllllllIllIlIIlIlllIlIIlIII.draw(this.poly, this.gradient);
        llllllllllllIllIlIIlIlllIlIIlIII.setAntiAlias((boolean)(GradientTest.llIlIllIlIlIIl[0] != 0));
        llllllllllllIllIlIIlIlllIlIIlIII.fill(this.center, this.gradient4);
        llllllllllllIllIlIIlIlllIlIIlIII.setAntiAlias((boolean)(GradientTest.llIlIllIlIlIIl[1] != 0));
        llllllllllllIllIlIIlIlllIlIIlIII.setColor(Color.black);
        llllllllllllIllIlIIlIlllIlIIlIII.draw(this.center);
        llllllllllllIllIlIIlIlllIlIIlIII.setAntiAlias((boolean)(GradientTest.llIlIllIlIlIIl[0] != 0));
    }
    
    private static boolean lIIlIlIlIlIlIIII(final int llllllllllllIllIlIIlIlllIIlIIlIl, final int llllllllllllIllIlIIlIlllIIlIIlII) {
        return llllllllllllIllIlIIlIlllIIlIIlIl == llllllllllllIllIlIIlIlllIIlIIlII;
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllIlIIlIlllIIlllIII, final char llllllllllllIllIlIIlIlllIIllIlll) {
        if (lIIlIlIlIlIlIIII(llllllllllllIllIlIIlIlllIIlllIII, GradientTest.llIlIllIlIlIIl[1])) {
            this.container.exit();
        }
    }
}
