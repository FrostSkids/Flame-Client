// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests.states;

import org.newdawn.slick.state.transition.Transition;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AngelCodeFont;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.Image;
import org.newdawn.slick.Font;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.BasicGameState;

public class TestState2 extends BasicGameState
{
    private /* synthetic */ StateBasedGame game;
    private /* synthetic */ Font font;
    private /* synthetic */ Image image;
    private static final /* synthetic */ String[] lIlIIlllIIlIll;
    private static final /* synthetic */ int[] lIlIIlllIIllII;
    private /* synthetic */ float ang;
    
    private static String lllIlIIIlllIlIl(String lllllllllllllIIIllIIIIIllIllIlll, final String lllllllllllllIIIllIIIIIllIlllIll) {
        lllllllllllllIIIllIIIIIllIllIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIIIIllIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIIIIllIlllIlI = new StringBuilder();
        final char[] lllllllllllllIIIllIIIIIllIlllIIl = lllllllllllllIIIllIIIIIllIlllIll.toCharArray();
        int lllllllllllllIIIllIIIIIllIlllIII = TestState2.lIlIIlllIIllII[1];
        final byte lllllllllllllIIIllIIIIIllIllIIlI = (Object)lllllllllllllIIIllIIIIIllIllIlll.toCharArray();
        final boolean lllllllllllllIIIllIIIIIllIllIIIl = lllllllllllllIIIllIIIIIllIllIIlI.length != 0;
        float lllllllllllllIIIllIIIIIllIllIIII = TestState2.lIlIIlllIIllII[1];
        while (lllIlIIIllllIIl((int)lllllllllllllIIIllIIIIIllIllIIII, lllllllllllllIIIllIIIIIllIllIIIl ? 1 : 0)) {
            final char lllllllllllllIIIllIIIIIllIllllIl = lllllllllllllIIIllIIIIIllIllIIlI[lllllllllllllIIIllIIIIIllIllIIII];
            lllllllllllllIIIllIIIIIllIlllIlI.append((char)(lllllllllllllIIIllIIIIIllIllllIl ^ lllllllllllllIIIllIIIIIllIlllIIl[lllllllllllllIIIllIIIIIllIlllIII % lllllllllllllIIIllIIIIIllIlllIIl.length]));
            "".length();
            ++lllllllllllllIIIllIIIIIllIlllIII;
            ++lllllllllllllIIIllIIIIIllIllIIII;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIIIIllIlllIlI);
    }
    
    public void update(final GameContainer lllllllllllllIIIllIIIIIlllIlIIlI, final StateBasedGame lllllllllllllIIIllIIIIIlllIlIIIl, final int lllllllllllllIIIllIIIIIlllIIlllI) {
        this.ang += lllllllllllllIIIllIIIIIlllIIlllI * 0.1f;
    }
    
    private static void lllIlIIIlllIllI() {
        (lIlIIlllIIlIll = new String[TestState2.lIlIIlllIIllII[6]])[TestState2.lIlIIlllIIllII[1]] = lllIlIIIlllIlII("w9jszGrQ2BBcD0yzb+5X38otQUdifYKC", "CnXLV");
        TestState2.lIlIIlllIIlIll[TestState2.lIlIIlllIIllII[2]] = lllIlIIIlllIlIl("PAwGMwMpHRRoAy0EGnU4eFlbMwAp", "HiuGg");
        TestState2.lIlIIlllIIlIll[TestState2.lIlIIlllIIllII[0]] = lllIlIIIlllIlIl("Hi86DQMLPihWCwUtJlcTDSs=", "jJIyg");
        TestState2.lIlIIlllIIlIll[TestState2.lIlIIlllIIllII[3]] = lllIlIIIlllIlIl("Fz8QImsqJFkCPyIjHHF5", "CWyQK");
    }
    
    private static boolean lllIlIIIllllIIl(final int lllllllllllllIIIllIIIIIllIIllIll, final int lllllllllllllIIIllIIIIIllIIllIlI) {
        return lllllllllllllIIIllIIIIIllIIllIll < lllllllllllllIIIllIIIIIllIIllIlI;
    }
    
    public void render(final GameContainer lllllllllllllIIIllIIIIIlllIllIlI, final StateBasedGame lllllllllllllIIIllIIIIIlllIllIIl, final Graphics lllllllllllllIIIllIIIIIlllIllIII) {
        lllllllllllllIIIllIIIIIlllIllIII.setFont(this.font);
        lllllllllllllIIIllIIIIIlllIllIII.setColor(Color.green);
        lllllllllllllIIIllIIIIIlllIllIII.drawString(TestState2.lIlIIlllIIlIll[TestState2.lIlIIlllIIllII[3]], 200.0f, 50.0f);
        lllllllllllllIIIllIIIIIlllIllIII.rotate(400.0f, 300.0f, this.ang);
        lllllllllllllIIIllIIIIIlllIllIII.drawImage(this.image, (float)(TestState2.lIlIIlllIIllII[4] - this.image.getWidth() / TestState2.lIlIIlllIIllII[0]), (float)(TestState2.lIlIIlllIIllII[5] - this.image.getHeight() / TestState2.lIlIIlllIIllII[0]));
    }
    
    private static String lllIlIIIlllIlII(final String lllllllllllllIIIllIIIIIllIlIIlll, final String lllllllllllllIIIllIIIIIllIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIIIIIllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIIIIIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIIIIIllIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIIIIIllIlIlIIl.init(TestState2.lIlIIlllIIllII[0], lllllllllllllIIIllIIIIIllIlIlIlI);
            return new String(lllllllllllllIIIllIIIIIllIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIIIIIllIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIIIIIllIlIlIII) {
            lllllllllllllIIIllIIIIIllIlIlIII.printStackTrace();
            return null;
        }
    }
    
    public void init(final GameContainer lllllllllllllIIIllIIIIIllllIIIIl, final StateBasedGame lllllllllllllIIIllIIIIIlllIllllI) throws SlickException {
        this.game = lllllllllllllIIIllIIIIIlllIllllI;
        this.font = new AngelCodeFont(TestState2.lIlIIlllIIlIll[TestState2.lIlIIlllIIllII[1]], TestState2.lIlIIlllIIlIll[TestState2.lIlIIlllIIllII[2]]);
        this.image = new Image(TestState2.lIlIIlllIIlIll[TestState2.lIlIIlllIIllII[0]]);
    }
    
    static {
        lllIlIIIlllIlll();
        lllIlIIIlllIllI();
        ID = TestState2.lIlIIlllIIllII[0];
    }
    
    @Override
    public int getID() {
        return TestState2.lIlIIlllIIllII[0];
    }
    
    @Override
    public void keyReleased(final int lllllllllllllIIIllIIIIIlllIIIlll, final char lllllllllllllIIIllIIIIIlllIIlIIl) {
        if (lllIlIIIllllIII(lllllllllllllIIIllIIIIIlllIIIlll, TestState2.lIlIIlllIIllII[0])) {
            this.game.enterState(TestState2.lIlIIlllIIllII[2], new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
        }
        if (lllIlIIIllllIII(lllllllllllllIIIllIIIIIlllIIIlll, TestState2.lIlIIlllIIllII[6])) {
            this.game.enterState(TestState2.lIlIIlllIIllII[3], new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
        }
    }
    
    private static boolean lllIlIIIllllIII(final int lllllllllllllIIIllIIIIIllIIlllll, final int lllllllllllllIIIllIIIIIllIIllllI) {
        return lllllllllllllIIIllIIIIIllIIlllll == lllllllllllllIIIllIIIIIllIIllllI;
    }
    
    private static void lllIlIIIlllIlll() {
        (lIlIIlllIIllII = new int[7])[0] = "  ".length();
        TestState2.lIlIIlllIIllII[1] = ((49 + 21 + 120 + 15 ^ 63 + 99 - 87 + 99) & (190 + 34 - 133 + 144 ^ 1 + 126 - 124 + 133 ^ -" ".length()));
        TestState2.lIlIIlllIIllII[2] = " ".length();
        TestState2.lIlIIlllIIllII[3] = "   ".length();
        TestState2.lIlIIlllIIllII[4] = (-(0xFFFFF76F & 0x5EB8) & (0xFFFFDFB7 & 0x77FF));
        TestState2.lIlIIlllIIllII[5] = (0xFFFF993D & 0x67EE);
        TestState2.lIlIIlllIIllII[6] = (0x2F ^ 0x66 ^ (0xEF ^ 0xA2));
    }
}
