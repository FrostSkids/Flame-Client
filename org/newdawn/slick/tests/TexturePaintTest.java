// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.geom.Vector2f;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.geom.ShapeRenderer;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.geom.TexCoordGenerator;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class TexturePaintTest extends BasicGame
{
    private /* synthetic */ Image image;
    private /* synthetic */ Polygon poly;
    private static final /* synthetic */ String[] lIlIIIllIIllll;
    private static final /* synthetic */ int[] lIlIIIlllIllII;
    private /* synthetic */ Rectangle texRect;
    private /* synthetic */ TexCoordGenerator texPaint;
    
    public static void main(final String[] lllllllllllllIIIlllIllllIlIIIlll) {
        try {
            final AppGameContainer lllllllllllllIIIlllIllllIlIIlIIl = new AppGameContainer(new TexturePaintTest());
            lllllllllllllIIIlllIllllIlIIlIIl.setDisplayMode(TexturePaintTest.lIlIIIlllIllII[2], TexturePaintTest.lIlIIIlllIllII[3], (boolean)(TexturePaintTest.lIlIIIlllIllII[0] != 0));
            lllllllllllllIIIlllIllllIlIIlIIl.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIlllIllllIlIIlIII) {
            lllllllllllllIIIlllIllllIlIIlIII.printStackTrace();
        }
    }
    
    public void render(final GameContainer lllllllllllllIIIlllIllllIlIIlllI, final Graphics lllllllllllllIIIlllIllllIlIIlIll) throws SlickException {
        lllllllllllllIIIlllIllllIlIIlIll.setColor(Color.white);
        lllllllllllllIIIlllIllllIlIIlIll.texture(this.poly, this.image);
        ShapeRenderer.texture(this.poly, this.image, this.texPaint);
    }
    
    private static String lllIIIlllIIllIl(final String lllllllllllllIIIlllIllllIIlllIll, final String lllllllllllllIIIlllIllllIIlllIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIllllIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIllllIIlllIII.getBytes(StandardCharsets.UTF_8)), TexturePaintTest.lIlIIIlllIllII[5]), "DES");
            final Cipher lllllllllllllIIIlllIllllIIllllIl = Cipher.getInstance("DES");
            lllllllllllllIIIlllIllllIIllllIl.init(TexturePaintTest.lIlIIIlllIllII[4], lllllllllllllIIIlllIllllIIlllllI);
            return new String(lllllllllllllIIIlllIllllIIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIllllIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIllllIIllllII) {
            lllllllllllllIIIlllIllllIIllllII.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIIlllIIlllI() {
        (lIlIIIllIIllll = new String[TexturePaintTest.lIlIIIlllIllII[4]])[TexturePaintTest.lIlIIIlllIllII[0]] = lllIIIlllIIllIl("kZc6fhT+jXfG4c7HTuGbo1MEOR+8nfvn", "srmtH");
        TexturePaintTest.lIlIIIllIIllll[TexturePaintTest.lIlIIIlllIllII[1]] = lllIIIlllIIllIl("KL9us95ao+sxr9d3k0Ez5lbWoykEv7M6", "qgjTD");
    }
    
    static {
        lllIIlIIIIIllll();
        lllIIIlllIIlllI();
    }
    
    public TexturePaintTest() {
        super(TexturePaintTest.lIlIIIllIIllll[TexturePaintTest.lIlIIIlllIllII[0]]);
        this.poly = new Polygon();
        this.texRect = new Rectangle(50.0f, 50.0f, 100.0f, 100.0f);
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIlllIllllIlIlIllI) throws SlickException {
        this.poly.addPoint(120.0f, 120.0f);
        this.poly.addPoint(420.0f, 100.0f);
        this.poly.addPoint(620.0f, 420.0f);
        this.poly.addPoint(300.0f, 320.0f);
        this.image = new Image(TexturePaintTest.lIlIIIllIIllll[TexturePaintTest.lIlIIIlllIllII[1]]);
        this.texPaint = new TexCoordGenerator() {
            public Vector2f getCoordFor(final float llllllllllllIlllIIIIIIlllllIIIII, final float llllllllllllIlllIIIIIIlllllIIlII) {
                final float llllllllllllIlllIIIIIIlllllIIIll = (TexturePaintTest.this.texRect.getX() - llllllllllllIlllIIIIIIlllllIIIII) / TexturePaintTest.this.texRect.getWidth();
                final float llllllllllllIlllIIIIIIlllllIIIlI = (TexturePaintTest.this.texRect.getY() - llllllllllllIlllIIIIIIlllllIIlII) / TexturePaintTest.this.texRect.getHeight();
                return new Vector2f(llllllllllllIlllIIIIIIlllllIIIll, llllllllllllIlllIIIIIIlllllIIIlI);
            }
        };
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIlllIllllIlIlIIll, final int lllllllllllllIIIlllIllllIlIlIIlI) throws SlickException {
    }
    
    private static void lllIIlIIIIIllll() {
        (lIlIIIlllIllII = new int[6])[0] = ((0x2D ^ 0x6E ^ (0xD2 ^ 0xA4)) & (77 + 111 - 134 + 87 ^ 56 + 138 - 89 + 79 ^ -" ".length()));
        TexturePaintTest.lIlIIIlllIllII[1] = " ".length();
        TexturePaintTest.lIlIIIlllIllII[2] = (0xFFFFEB3A & 0x17E5);
        TexturePaintTest.lIlIIIlllIllII[3] = (-(0xFFFFFC6C & 0x3F97) & (0xFFFFBF7B & 0x7EDF));
        TexturePaintTest.lIlIIIlllIllII[4] = "  ".length();
        TexturePaintTest.lIlIIIlllIllII[5] = (0x82 ^ 0x89 ^ "   ".length());
    }
}
