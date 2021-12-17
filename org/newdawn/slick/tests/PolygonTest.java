// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.BasicGame;

public class PolygonTest extends BasicGame
{
    private static final /* synthetic */ String[] llIIlIIllllIlI;
    private static final /* synthetic */ int[] llIIlIIllllIll;
    private /* synthetic */ boolean in;
    private /* synthetic */ Polygon poly;
    
    public static void main(final String[] llllllllllllIlllIIlIIIllIlllIllI) {
        try {
            final AppGameContainer llllllllllllIlllIIlIIIllIllllIII = new AppGameContainer(new PolygonTest(), PolygonTest.llIIlIIllllIll[1], PolygonTest.llIIlIIllllIll[2], (boolean)(PolygonTest.llIIlIIllllIll[0] != 0));
            llllllllllllIlllIIlIIIllIllllIII.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (Exception llllllllllllIlllIIlIIIllIlllIlll) {
            llllllllllllIlllIIlIIIllIlllIlll.printStackTrace();
        }
    }
    
    private static void lIIIllIIlIlllIll() {
        (llIIlIIllllIll = new int[6])[0] = ((0xF ^ 0x1E ^ (0xEF ^ 0xB5)) & (4 + 1 + 50 + 72 ^ (0xF7 ^ 0xC3) ^ -" ".length()));
        PolygonTest.llIIlIIllllIll[1] = (-(0xFFFFBDC7 & 0x7B7D) & (0xFFFFFBD4 & 0x3FEF));
        PolygonTest.llIIlIIllllIll[2] = (0xFFFFA3FB & 0x5DE4);
        PolygonTest.llIIlIIllllIll[3] = " ".length();
        PolygonTest.llIIlIIllllIll[4] = (0xAD ^ 0xB8 ^ (0x1E ^ 0x3));
        PolygonTest.llIIlIIllllIll[5] = "  ".length();
    }
    
    public PolygonTest() {
        super(PolygonTest.llIIlIIllllIlI[PolygonTest.llIIlIIllllIll[0]]);
    }
    
    static {
        lIIIllIIlIlllIll();
        lIIIllIIlIlllIlI();
    }
    
    private static String lIIIllIIlIlllIIl(final String llllllllllllIlllIIlIIIllIllIllIl, final String llllllllllllIlllIIlIIIllIllIlIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIIIllIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIIllIllIlIlI.getBytes(StandardCharsets.UTF_8)), PolygonTest.llIIlIIllllIll[4]), "DES");
            final Cipher llllllllllllIlllIIlIIIllIllIllll = Cipher.getInstance("DES");
            llllllllllllIlllIIlIIIllIllIllll.init(PolygonTest.llIIlIIllllIll[5], llllllllllllIlllIIlIIIllIlllIIII);
            return new String(llllllllllllIlllIIlIIIllIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIIllIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIIIllIllIlllI) {
            llllllllllllIlllIIlIIIllIllIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlllIIlIIIlllIIIIIIl, final int llllllllllllIlllIIlIIIlllIIIIIll) throws SlickException {
        this.in = this.poly.contains((float)llllllllllllIlllIIlIIIlllIIIIIIl.getInput().getMouseX(), (float)llllllllllllIlllIIlIIIlllIIIIIIl.getInput().getMouseY());
        this.poly.setCenterY(0.0f);
    }
    
    private static boolean lIIIllIIlIllllII(final int llllllllllllIlllIIlIIIllIllIIllI) {
        return llllllllllllIlllIIlIIIllIllIIllI != 0;
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlllIIlIIIlllIIIlIIl) throws SlickException {
        this.poly = new Polygon();
        this.poly.addPoint(300.0f, 100.0f);
        this.poly.addPoint(320.0f, 200.0f);
        this.poly.addPoint(350.0f, 210.0f);
        this.poly.addPoint(280.0f, 250.0f);
        this.poly.addPoint(300.0f, 200.0f);
        this.poly.addPoint(240.0f, 150.0f);
    }
    
    private static void lIIIllIIlIlllIlI() {
        (llIIlIIllllIlI = new String[PolygonTest.llIIlIIllllIll[3]])[PolygonTest.llIIlIIllllIll[0]] = lIIIllIIlIlllIIl("m/sUc6GCeujGeLr6pwAW8Q==", "iChEL");
    }
    
    public void render(final GameContainer llllllllllllIlllIIlIIIllIlllllIl, final Graphics llllllllllllIlllIIlIIIllIllllIlI) throws SlickException {
        if (lIIIllIIlIllllII(this.in ? 1 : 0)) {
            llllllllllllIlllIIlIIIllIllllIlI.setColor(Color.red);
            llllllllllllIlllIIlIIIllIllllIlI.fill(this.poly);
        }
        llllllllllllIlllIIlIIIllIllllIlI.setColor(Color.yellow);
        llllllllllllIlllIIlIIIllIllllIlI.fillOval(this.poly.getCenterX() - 3.0f, this.poly.getCenterY() - 3.0f, 6.0f, 6.0f);
        llllllllllllIlllIIlIIIllIllllIlI.setColor(Color.white);
        llllllllllllIlllIIlIIIllIllllIlI.draw(this.poly);
    }
}
