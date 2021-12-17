// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.geom.Transform;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.geom.MorphShape;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.BasicGame;

public class MorphShapeTest extends BasicGame
{
    private static final /* synthetic */ int[] lIIlIlIIIIllIl;
    private /* synthetic */ Shape c;
    private /* synthetic */ Shape b;
    private /* synthetic */ float time;
    private /* synthetic */ MorphShape morph;
    private static final /* synthetic */ String[] lIIlIlIIIIIlll;
    private /* synthetic */ Shape a;
    
    public void render(final GameContainer lllllllllllllIIllIlIIllllllIIlII, final Graphics lllllllllllllIIllIlIIllllllIIIIl) throws SlickException {
        lllllllllllllIIllIlIIllllllIIIIl.setColor(Color.green);
        lllllllllllllIIllIlIIllllllIIIIl.draw(this.a);
        lllllllllllllIIllIlIIllllllIIIIl.setColor(Color.red);
        lllllllllllllIIllIlIIllllllIIIIl.draw(this.b);
        lllllllllllllIIllIlIIllllllIIIIl.setColor(Color.blue);
        lllllllllllllIIllIlIIllllllIIIIl.draw(this.c);
        lllllllllllllIIllIlIIllllllIIIIl.setColor(Color.white);
        lllllllllllllIIllIlIIllllllIIIIl.draw(this.morph);
    }
    
    public MorphShapeTest() {
        super(MorphShapeTest.lIIlIlIIIIIlll[MorphShapeTest.lIIlIlIIIIllIl[0]]);
    }
    
    private static String llIIllllIlIIlIl(final String lllllllllllllIIllIlIIlllllIlIlII, final String lllllllllllllIIllIlIIlllllIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIIlllllIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIlllllIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlIIlllllIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlIIlllllIlIllI.init(MorphShapeTest.lIIlIlIIIIllIl[4], lllllllllllllIIllIlIIlllllIlIlll);
            return new String(lllllllllllllIIllIlIIlllllIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIlllllIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIIlllllIlIlIl) {
            lllllllllllllIIllIlIIlllllIlIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIllIlIIllllllIlIll, final int lllllllllllllIIllIlIIllllllIlIII) throws SlickException {
        this.time += lllllllllllllIIllIlIIllllllIlIII * 0.001f;
        this.morph.setMorphTime(this.time);
    }
    
    public static void main(final String[] lllllllllllllIIllIlIIlllllIlllIl) {
        try {
            final AppGameContainer lllllllllllllIIllIlIIlllllIlllll = new AppGameContainer(new MorphShapeTest());
            lllllllllllllIIllIlIIlllllIlllll.setDisplayMode(MorphShapeTest.lIIlIlIIIIllIl[2], MorphShapeTest.lIIlIlIIIIllIl[3], (boolean)(MorphShapeTest.lIIlIlIIIIllIl[0] != 0));
            lllllllllllllIIllIlIIlllllIlllll.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIllIlIIlllllIllllI) {
            lllllllllllllIIllIlIIlllllIllllI.printStackTrace();
        }
    }
    
    private static void llIIllllIlIlllI() {
        (lIIlIlIIIIllIl = new int[5])[0] = ((0x73 ^ 0x66 ^ (0x40 ^ 0x1D)) & (153 + 84 - 134 + 116 ^ 119 + 85 - 139 + 82 ^ -" ".length()));
        MorphShapeTest.lIIlIlIIIIllIl[1] = " ".length();
        MorphShapeTest.lIIlIlIIIIllIl[2] = (-(0xFFFFFF1B & 0x4CFF) & (0xFFFFEFFA & 0x5F3F));
        MorphShapeTest.lIIlIlIIIIllIl[3] = (0xFFFF9B5E & 0x66F9);
        MorphShapeTest.lIIlIlIIIIllIl[4] = "  ".length();
    }
    
    private static void llIIllllIlIlIll() {
        (lIIlIlIIIIIlll = new String[MorphShapeTest.lIIlIlIIIIllIl[1]])[MorphShapeTest.lIIlIlIIIIllIl[0]] = llIIllllIlIIlIl("sv1L3/a/iRtkye0T6TYDAA==", "Dbcsn");
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIllIlIIllllllIllll) throws SlickException {
        this.a = new Rectangle(100.0f, 100.0f, 50.0f, 200.0f);
        this.a = this.a.transform(Transform.createRotateTransform(0.1f, 100.0f, 100.0f));
        this.b = new Rectangle(200.0f, 100.0f, 50.0f, 200.0f);
        this.b = this.b.transform(Transform.createRotateTransform(-0.6f, 100.0f, 100.0f));
        this.c = new Rectangle(300.0f, 100.0f, 50.0f, 200.0f);
        this.c = this.c.transform(Transform.createRotateTransform(-0.2f, 100.0f, 100.0f));
        this.morph = new MorphShape(this.a);
        this.morph.addShape(this.b);
        this.morph.addShape(this.c);
        lllllllllllllIIllIlIIllllllIllll.setVSync((boolean)(MorphShapeTest.lIIlIlIIIIllIl[1] != 0));
    }
    
    static {
        llIIllllIlIlllI();
        llIIllllIlIlIll();
    }
}
