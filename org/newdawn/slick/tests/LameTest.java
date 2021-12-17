// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Polygon;
import org.newdawn.slick.BasicGame;

public class LameTest extends BasicGame
{
    private /* synthetic */ Polygon poly;
    private /* synthetic */ Image image;
    private static final /* synthetic */ int[] llIIIIIIIIIIll;
    private static final /* synthetic */ String[] llIIIIIIIIIIlI;
    
    static {
        lIIIIllIlIIIIIll();
        lIIIIllIlIIIIIlI();
    }
    
    private static String lIIIIllIlIIIIIII(final String llllllllllllIllllIIIIllIllIIIIlI, final String llllllllllllIllllIIIIllIllIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIIIllIllIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIllIllIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIIllIllIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIIllIllIIIllI.init(LameTest.llIIIIIIIIIIll[4], llllllllllllIllllIIIIllIllIIIlll);
            return new String(llllllllllllIllllIIIIllIllIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIllIllIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIIllIllIIIlIl) {
            llllllllllllIllllIIIIllIllIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIllIlIIIIIlI() {
        (llIIIIIIIIIIlI = new String[LameTest.llIIIIIIIIIIll[4]])[LameTest.llIIIIIIIIIIll[0]] = lIIIIllIlIIIIIII("nfjXJkrPHKT6OXG2q0baEg==", "OSmOL");
        LameTest.llIIIIIIIIIIlI[LameTest.llIIIIIIIIIIll[1]] = lIIIIllIlIIIIIIl("BhM8AgkTAi5ZHx0VJAVDAhgo", "rvOvm");
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllllIIIIllIllIllIIl, final int llllllllllllIllllIIIIllIllIllIII) throws SlickException {
    }
    
    private static String lIIIIllIlIIIIIIl(String llllllllllllIllllIIIIllIlIlIllll, final String llllllllllllIllllIIIIllIlIlIlllI) {
        llllllllllllIllllIIIIllIlIlIllll = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIIIllIlIlIllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIIIllIlIllIIlI = new StringBuilder();
        final char[] llllllllllllIllllIIIIllIlIllIIIl = llllllllllllIllllIIIIllIlIlIlllI.toCharArray();
        int llllllllllllIllllIIIIllIlIllIIII = LameTest.llIIIIIIIIIIll[0];
        final Exception llllllllllllIllllIIIIllIlIlIlIlI = (Object)((String)llllllllllllIllllIIIIllIlIlIllll).toCharArray();
        final char llllllllllllIllllIIIIllIlIlIlIIl = (char)llllllllllllIllllIIIIllIlIlIlIlI.length;
        int llllllllllllIllllIIIIllIlIlIlIII = LameTest.llIIIIIIIIIIll[0];
        while (lIIIIllIlIIIIlII(llllllllllllIllllIIIIllIlIlIlIII, llllllllllllIllllIIIIllIlIlIlIIl)) {
            final char llllllllllllIllllIIIIllIlIllIlIl = llllllllllllIllllIIIIllIlIlIlIlI[llllllllllllIllllIIIIllIlIlIlIII];
            llllllllllllIllllIIIIllIlIllIIlI.append((char)(llllllllllllIllllIIIIllIlIllIlIl ^ llllllllllllIllllIIIIllIlIllIIIl[llllllllllllIllllIIIIllIlIllIIII % llllllllllllIllllIIIIllIlIllIIIl.length]));
            "".length();
            ++llllllllllllIllllIIIIllIlIllIIII;
            ++llllllllllllIllllIIIIllIlIlIlIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIIIllIlIllIIlI);
    }
    
    private static boolean lIIIIllIlIIIIlII(final int llllllllllllIllllIIIIllIlIlIIlII, final int llllllllllllIllllIIIIllIlIlIIIll) {
        return llllllllllllIllllIIIIllIlIlIIlII < llllllllllllIllllIIIIllIlIlIIIll;
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllllIIIIllIllIlllII) throws SlickException {
        this.poly.addPoint(100.0f, 100.0f);
        this.poly.addPoint(120.0f, 100.0f);
        this.poly.addPoint(120.0f, 120.0f);
        this.poly.addPoint(100.0f, 120.0f);
        this.image = new Image(LameTest.llIIIIIIIIIIlI[LameTest.llIIIIIIIIIIll[1]]);
    }
    
    private static void lIIIIllIlIIIIIll() {
        (llIIIIIIIIIIll = new int[5])[0] = ((0x8D ^ 0xC7 ^ (0xE1 ^ 0xA2)) & (0x63 ^ 0x7F ^ (0xA2 ^ 0xB7) ^ -" ".length()));
        LameTest.llIIIIIIIIIIll[1] = " ".length();
        LameTest.llIIIIIIIIIIll[2] = (-(0xFFFFA4FE & 0x7F1D) & (0xFFFFB77F & 0x6FBB));
        LameTest.llIIIIIIIIIIll[3] = (-(0xFFFF9FFF & 0x7925) & (0xFFFF9F7C & 0x7BFF));
        LameTest.llIIIIIIIIIIll[4] = "  ".length();
    }
    
    public void render(final GameContainer llllllllllllIllllIIIIllIllIlIlII, final Graphics llllllllllllIllllIIIIllIllIlIIIl) throws SlickException {
        llllllllllllIllllIIIIllIllIlIIIl.setColor(Color.white);
        llllllllllllIllllIIIIllIllIlIIIl.texture(this.poly, this.image);
    }
    
    public static void main(final String[] llllllllllllIllllIIIIllIllIIllIl) {
        try {
            final AppGameContainer llllllllllllIllllIIIIllIllIIllll = new AppGameContainer(new LameTest());
            llllllllllllIllllIIIIllIllIIllll.setDisplayMode(LameTest.llIIIIIIIIIIll[2], LameTest.llIIIIIIIIIIll[3], (boolean)(LameTest.llIIIIIIIIIIll[0] != 0));
            llllllllllllIllllIIIIllIllIIllll.start();
            "".length();
            if (((167 + 160 - 133 + 54 ^ 145 + 146 - 128 + 25) & (118 + 137 - 200 + 168 ^ 0 + 5 + 66 + 84 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (SlickException llllllllllllIllllIIIIllIllIIlllI) {
            llllllllllllIllllIIIIllIllIIlllI.printStackTrace();
        }
    }
    
    public LameTest() {
        super(LameTest.llIIIIIIIIIIlI[LameTest.llIIIIIIIIIIll[0]]);
        this.poly = new Polygon();
    }
}
