// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.Path;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.BasicGame;

public class LineRenderTest extends BasicGame
{
    private /* synthetic */ Polygon polygon;
    private /* synthetic */ float width;
    private /* synthetic */ boolean antialias;
    private /* synthetic */ Path path;
    private static final /* synthetic */ int[] lllIIlIlIlllll;
    private static final /* synthetic */ String[] lllIIlIlIlIlll;
    
    private static boolean lIIllllllIllllIl(final int llllllllllllIlIllllIIlllIllIllll) {
        return llllllllllllIlIllllIIlllIllIllll != 0;
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlIllllIIllllIlIIlII, final int llllllllllllIlIllllIIllllIlIlIII) throws SlickException {
        if (lIIllllllIllllIl(llllllllllllIlIllllIIllllIlIIlII.getInput().isKeyPressed(LineRenderTest.lllIIlIlIlllll[2]) ? 1 : 0)) {
            int antialias;
            if (lIIllllllIlllllI(this.antialias ? 1 : 0)) {
                antialias = LineRenderTest.lllIIlIlIlllll[1];
                "".length();
                if (-(0x1A ^ 0x1E) >= 0) {
                    return;
                }
            }
            else {
                antialias = LineRenderTest.lllIIlIlIlllll[0];
            }
            this.antialias = (antialias != 0);
        }
    }
    
    private static String lIIllllllIlIIlll(final String llllllllllllIlIllllIIlllIlllllII, final String llllllllllllIlIllllIIlllIllllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIllllIIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIlllIllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIIllllIIIIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIIllllIIIIIIl.init(LineRenderTest.lllIIlIlIlllll[6], llllllllllllIlIllllIIllllIIIIIlI);
            return new String(llllllllllllIlIllllIIllllIIIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIlllIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIllllIIIIIII) {
            llllllllllllIlIllllIIllllIIIIIII.printStackTrace();
            return null;
        }
    }
    
    public void render(final GameContainer llllllllllllIlIllllIIllllIIlllII, final Graphics llllllllllllIlIllllIIllllIIlIlll) throws SlickException {
        llllllllllllIlIllllIIllllIIlIlll.setAntiAlias(this.antialias);
        llllllllllllIlIllllIIllllIIlIlll.setLineWidth(50.0f);
        llllllllllllIlIllllIIllllIIlIlll.setColor(Color.red);
        llllllllllllIlIllllIIllllIIlIlll.draw(this.path);
    }
    
    public static void main(final String[] llllllllllllIlIllllIIllllIIIllIl) {
        try {
            Renderer.setLineStripRenderer(LineRenderTest.lllIIlIlIlllll[3]);
            Renderer.getLineStripRenderer().setLineCaps((boolean)(LineRenderTest.lllIIlIlIlllll[1] != 0));
            final AppGameContainer llllllllllllIlIllllIIllllIIlIIIl = new AppGameContainer(new LineRenderTest());
            llllllllllllIlIllllIIllllIIlIIIl.setDisplayMode(LineRenderTest.lllIIlIlIlllll[4], LineRenderTest.lllIIlIlIlllll[5], (boolean)(LineRenderTest.lllIIlIlIlllll[0] != 0));
            llllllllllllIlIllllIIllllIIlIIIl.start();
            "".length();
            if (-" ".length() >= (0x2F ^ 0x43 ^ (0xF5 ^ 0x9D))) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIllllIIllllIIIllll) {
            llllllllllllIlIllllIIllllIIIllll.printStackTrace();
        }
    }
    
    private static void lIIllllllIlIllIl() {
        (lllIIlIlIlIlll = new String[LineRenderTest.lllIIlIlIlllll[1]])[LineRenderTest.lllIIlIlIlllll[0]] = lIIllllllIlIIlll("zqq4jnP0IdL2EErEwmn/ww==", "QXxZe");
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlIllllIIllllIllIIIl) throws SlickException {
        this.polygon.addPoint(100.0f, 100.0f);
        this.polygon.addPoint(200.0f, 80.0f);
        this.polygon.addPoint(320.0f, 150.0f);
        this.polygon.addPoint(230.0f, 210.0f);
        this.polygon.addPoint(170.0f, 260.0f);
        this.path.curveTo(200.0f, 200.0f, 200.0f, 100.0f, 100.0f, 200.0f);
        this.path.curveTo(400.0f, 100.0f, 400.0f, 200.0f, 200.0f, 100.0f);
        this.path.curveTo(500.0f, 500.0f, 400.0f, 200.0f, 200.0f, 100.0f);
    }
    
    private static boolean lIIllllllIlllllI(final int llllllllllllIlIllllIIlllIllIlIlI) {
        return llllllllllllIlIllllIIlllIllIlIlI == 0;
    }
    
    static {
        lIIllllllIlllIll();
        lIIllllllIlIllIl();
    }
    
    private static void lIIllllllIlllIll() {
        (lllIIlIlIlllll = new int[7])[0] = ((0x45 ^ 0x7E) & ~(0x9D ^ 0xA6));
        LineRenderTest.lllIIlIlIlllll[1] = " ".length();
        LineRenderTest.lllIIlIlIlllll[2] = (0x66 ^ 0x32 ^ (0x51 ^ 0x3C));
        LineRenderTest.lllIIlIlIlllll[3] = (0x6D ^ 0x69);
        LineRenderTest.lllIIlIlIlllll[4] = (-(0xFFFFF9E7 & 0x3E1B) & (0xFFFFFFF2 & 0x3B2F));
        LineRenderTest.lllIIlIlIlllll[5] = (-(0xFFFFBBA7 & 0x4CFC) & (0xFFFFBBFB & 0x4EFF));
        LineRenderTest.lllIIlIlIlllll[6] = "  ".length();
    }
    
    public LineRenderTest() {
        super(LineRenderTest.lllIIlIlIlIlll[LineRenderTest.lllIIlIlIlllll[0]]);
        this.polygon = new Polygon();
        this.path = new Path(100.0f, 100.0f);
        this.width = 10.0f;
        this.antialias = (LineRenderTest.lllIIlIlIlllll[1] != 0);
    }
}
