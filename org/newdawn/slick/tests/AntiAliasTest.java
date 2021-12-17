// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.BasicGame;

public class AntiAliasTest extends BasicGame
{
    private static final /* synthetic */ int[] lIllllllIIIIIl;
    private static final /* synthetic */ String[] lIlllllIllllll;
    
    public void render(final GameContainer llllllllllllIllllIIlIlIIllllIIlI, final Graphics llllllllllllIllllIIlIlIIllllIIII) throws SlickException {
        llllllllllllIllllIIlIlIIllllIIII.setAntiAlias((boolean)(AntiAliasTest.lIllllllIIIIIl[1] != 0));
        llllllllllllIllllIIlIlIIllllIIII.setColor(Color.red);
        llllllllllllIllllIIlIlIIllllIIII.drawOval(100.0f, 100.0f, 100.0f, 100.0f);
        llllllllllllIllllIIlIlIIllllIIII.fillOval(300.0f, 100.0f, 100.0f, 100.0f);
        llllllllllllIllllIIlIlIIllllIIII.setAntiAlias((boolean)(AntiAliasTest.lIllllllIIIIIl[0] != 0));
        llllllllllllIllllIIlIlIIllllIIII.setColor(Color.red);
        llllllllllllIllllIIlIlIIllllIIII.drawOval(100.0f, 300.0f, 100.0f, 100.0f);
        llllllllllllIllllIIlIlIIllllIIII.fillOval(300.0f, 300.0f, 100.0f, 100.0f);
    }
    
    static {
        lIIIIlIllIllIlIl();
        lIIIIlIllIllIIlI();
    }
    
    public static void main(final String[] llllllllllllIllllIIlIlIIlllIllII) {
        try {
            final AppGameContainer llllllllllllIllllIIlIlIIlllIlllI = new AppGameContainer(new AntiAliasTest());
            llllllllllllIllllIIlIlIIlllIlllI.setDisplayMode(AntiAliasTest.lIllllllIIIIIl[2], AntiAliasTest.lIllllllIIIIIl[3], (boolean)(AntiAliasTest.lIllllllIIIIIl[0] != 0));
            llllllllllllIllllIIlIlIIlllIlllI.start();
            "".length();
            if ((("  ".length() ^ (0x3F ^ 0x60)) & (0x7A ^ 0x5F ^ (0x32 ^ 0x4A) ^ -" ".length())) < ((0x46 ^ 0x65 ^ (0x28 ^ 0x56)) & (0x50 ^ 0x7C ^ (0xC ^ 0x7D) ^ -" ".length()))) {
                return;
            }
        }
        catch (SlickException llllllllllllIllllIIlIlIIlllIllIl) {
            llllllllllllIllllIIlIlIIlllIllIl.printStackTrace();
        }
    }
    
    private static void lIIIIlIllIllIlIl() {
        (lIllllllIIIIIl = new int[4])[0] = ("  ".length() & ~"  ".length());
        AntiAliasTest.lIllllllIIIIIl[1] = " ".length();
        AntiAliasTest.lIllllllIIIIIl[2] = (0xFFFFEFF6 & 0x1329);
        AntiAliasTest.lIllllllIIIIIl[3] = (-(0xFFFFDDA9 & 0x3FFE) & (0xFFFFDFFF & 0x3FFF));
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllllIIlIlIIllllIllI, final int llllllllllllIllllIIlIlIIllllIlIl) throws SlickException {
    }
    
    private static boolean lIIIIlIllIllIllI(final int llllllllllllIllllIIlIlIIllIlIIII, final int llllllllllllIllllIIlIlIIllIIllll) {
        return llllllllllllIllllIIlIlIIllIlIIII < llllllllllllIllllIIlIlIIllIIllll;
    }
    
    private static void lIIIIlIllIllIIlI() {
        (lIlllllIllllll = new String[AntiAliasTest.lIllllllIIIIIl[1]])[AntiAliasTest.lIllllllIIIIIl[0]] = lIIIIlIllIllIIIl("ACYeLQAtIQs3YRUtGTA=", "AHjDA");
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllllIIlIlIIlllllIII) throws SlickException {
        llllllllllllIllllIIlIlIIlllllIII.getGraphics().setBackground(Color.green);
    }
    
    public AntiAliasTest() {
        super(AntiAliasTest.lIlllllIllllll[AntiAliasTest.lIllllllIIIIIl[0]]);
    }
    
    private static String lIIIIlIllIllIIIl(String llllllllllllIllllIIlIlIIllIllIll, final String llllllllllllIllllIIlIlIIllIlllll) {
        llllllllllllIllllIIlIlIIllIllIll = new String(Base64.getDecoder().decode(llllllllllllIllllIIlIlIIllIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIlIlIIllIllllI = new StringBuilder();
        final char[] llllllllllllIllllIIlIlIIllIlllIl = llllllllllllIllllIIlIlIIllIlllll.toCharArray();
        int llllllllllllIllllIIlIlIIllIlllII = AntiAliasTest.lIllllllIIIIIl[0];
        final byte llllllllllllIllllIIlIlIIllIlIllI = (Object)llllllllllllIllllIIlIlIIllIllIll.toCharArray();
        final boolean llllllllllllIllllIIlIlIIllIlIlIl = llllllllllllIllllIIlIlIIllIlIllI.length != 0;
        int llllllllllllIllllIIlIlIIllIlIlII = AntiAliasTest.lIllllllIIIIIl[0];
        while (lIIIIlIllIllIllI(llllllllllllIllllIIlIlIIllIlIlII, llllllllllllIllllIIlIlIIllIlIlIl ? 1 : 0)) {
            final char llllllllllllIllllIIlIlIIlllIIIIl = llllllllllllIllllIIlIlIIllIlIllI[llllllllllllIllllIIlIlIIllIlIlII];
            llllllllllllIllllIIlIlIIllIllllI.append((char)(llllllllllllIllllIIlIlIIlllIIIIl ^ llllllllllllIllllIIlIlIIllIlllIl[llllllllllllIllllIIlIlIIllIlllII % llllllllllllIllllIIlIlIIllIlllIl.length]));
            "".length();
            ++llllllllllllIllllIIlIlIIllIlllII;
            ++llllllllllllIllllIIlIlIIllIlIlII;
            "".length();
            if ((("   ".length() ^ (0x90 ^ 0x9E)) & (0x3 ^ 0x7D ^ (0xD0 ^ 0xA3) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIlIlIIllIllllI);
    }
}
