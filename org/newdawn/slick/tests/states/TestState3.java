// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests.states;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.AngelCodeFont;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.state.transition.Transition;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Font;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.BasicGameState;

public class TestState3 extends BasicGameState
{
    private /* synthetic */ StateBasedGame game;
    private /* synthetic */ String[] options;
    private /* synthetic */ Font font;
    private static final /* synthetic */ String[] lIllllIIlIIIll;
    private /* synthetic */ int selected;
    private static final /* synthetic */ int[] lIllllIIlIIlIl;
    
    private static boolean lIIIIlIIIIIlIIIl(final int llllllllllllIllllIlIllIIlIlIIlIl, final int llllllllllllIllllIlIllIIlIlIIlII) {
        return llllllllllllIllllIlIllIIlIlIIlIl == llllllllllllIllllIlIllIIlIlIIlII;
    }
    
    public void render(final GameContainer llllllllllllIllllIlIllIIllIlIIlI, final StateBasedGame llllllllllllIllllIlIllIIllIlIIIl, final Graphics llllllllllllIllllIlIllIIllIlIIII) {
        llllllllllllIllllIlIllIIllIlIIII.setFont(this.font);
        llllllllllllIllllIlIllIIllIlIIII.setColor(Color.blue);
        llllllllllllIllllIlIllIIllIlIIII.drawString(TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[7]], 200.0f, 50.0f);
        llllllllllllIllllIlIllIIllIlIIII.setColor(Color.white);
        int llllllllllllIllllIlIllIIllIlIlII = TestState3.lIllllIIlIIlIl[1];
        while (lIIIIlIIIIIlIIII(llllllllllllIllllIlIllIIllIlIlII, this.options.length)) {
            llllllllllllIllllIlIllIIllIlIIII.drawString(this.options[llllllllllllIllllIlIllIIllIlIlII], (float)(TestState3.lIllllIIlIIlIl[8] - this.font.getWidth(this.options[llllllllllllIllllIlIllIIllIlIlII]) / TestState3.lIllllIIlIIlIl[3]), (float)(TestState3.lIllllIIlIIlIl[9] + llllllllllllIllllIlIllIIllIlIlII * TestState3.lIllllIIlIIlIl[10]));
            if (lIIIIlIIIIIlIIIl(this.selected, llllllllllllIllllIlIllIIllIlIlII)) {
                llllllllllllIllllIlIllIIllIlIIII.drawRect(200.0f, (float)(TestState3.lIllllIIlIIlIl[11] + llllllllllllIllllIlIllIIllIlIlII * TestState3.lIllllIIlIIlIl[10]), 400.0f, 50.0f);
            }
            ++llllllllllllIllllIlIllIIllIlIlII;
            "".length();
            if (((0x7F ^ 0x5A) & ~(0x11 ^ 0x34)) != 0x0) {
                return;
            }
        }
    }
    
    public TestState3() {
        final String[] options = new String[TestState3.lIllllIIlIIlIl[0]];
        options[TestState3.lIllllIIlIIlIl[1]] = TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[1]];
        options[TestState3.lIllllIIlIIlIl[2]] = TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[2]];
        options[TestState3.lIllllIIlIIlIl[3]] = TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[3]];
        options[TestState3.lIllllIIlIIlIl[4]] = TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[4]];
        options[TestState3.lIllllIIlIIlIl[5]] = TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[5]];
        this.options = options;
    }
    
    @Override
    public void keyReleased(final int llllllllllllIllllIlIllIIllIIIlIl, final char llllllllllllIllllIlIllIIllIIIlII) {
        if (lIIIIlIIIIIlIIIl(llllllllllllIllllIlIllIIllIIIlIl, TestState3.lIllllIIlIIlIl[12])) {
            this.selected += TestState3.lIllllIIlIIlIl[2];
            if (lIIIIlIIIIIlIIlI(this.selected, this.options.length)) {
                this.selected = TestState3.lIllllIIlIIlIl[1];
            }
        }
        if (lIIIIlIIIIIlIIIl(llllllllllllIllllIlIllIIllIIIlIl, TestState3.lIllllIIlIIlIl[9])) {
            this.selected -= TestState3.lIllllIIlIIlIl[2];
            if (lIIIIlIIIIIlIIll(this.selected)) {
                this.selected = this.options.length - TestState3.lIllllIIlIIlIl[2];
            }
        }
        if (lIIIIlIIIIIlIIIl(llllllllllllIllllIlIllIIllIIIlIl, TestState3.lIllllIIlIIlIl[3])) {
            this.game.enterState(TestState3.lIllllIIlIIlIl[2], new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
        }
        if (lIIIIlIIIIIlIIIl(llllllllllllIllllIlIllIIllIIIlIl, TestState3.lIllllIIlIIlIl[4])) {
            this.game.enterState(TestState3.lIllllIIlIIlIl[3], new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
        }
    }
    
    public void update(final GameContainer llllllllllllIllllIlIllIIllIIlIll, final StateBasedGame llllllllllllIllllIlIllIIllIIlIlI, final int llllllllllllIllllIlIllIIllIIlIIl) {
    }
    
    static {
        lIIIIlIIIIIIllll();
        lIIIIlIIIIIIlllI();
        ID = TestState3.lIllllIIlIIlIl[4];
    }
    
    @Override
    public int getID() {
        return TestState3.lIllllIIlIIlIl[4];
    }
    
    private static String lIIIIlIIIIIIlIIl(final String llllllllllllIllllIlIllIIlIlIllIl, final String llllllllllllIllllIlIllIIlIlIllII) {
        try {
            final SecretKeySpec llllllllllllIllllIlIllIIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIllIIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIllIIlIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIllIIlIlIllll.init(TestState3.lIllllIIlIIlIl[3], llllllllllllIllllIlIllIIlIllIIII);
            return new String(llllllllllllIllllIlIllIIlIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIllIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIllIIlIlIlllI) {
            llllllllllllIllllIlIllIIlIlIlllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIlIIIIIIlIll(final String llllllllllllIllllIlIllIIlIlllIII, final String llllllllllllIllllIlIllIIlIllIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIlIllIIlIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIllIIlIllIlll.getBytes(StandardCharsets.UTF_8)), TestState3.lIllllIIlIIlIl[13]), "DES");
            final Cipher llllllllllllIllllIlIllIIlIllllII = Cipher.getInstance("DES");
            llllllllllllIllllIlIllIIlIllllII.init(TestState3.lIllllIIlIIlIl[3], llllllllllllIllllIlIllIIlIllllIl);
            return new String(llllllllllllIllllIlIllIIlIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIllIIlIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIllIIlIlllIll) {
            llllllllllllIllllIlIllIIlIlllIll.printStackTrace();
            return null;
        }
    }
    
    public void init(final GameContainer llllllllllllIllllIlIllIIllIllIll, final StateBasedGame llllllllllllIllllIlIllIIllIllIII) throws SlickException {
        this.font = new AngelCodeFont(TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[0]], TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[6]]);
        this.game = llllllllllllIllllIlIllIIllIllIII;
    }
    
    private static boolean lIIIIlIIIIIlIIII(final int llllllllllllIllllIlIllIIlIIlllIl, final int llllllllllllIllllIlIllIIlIIlllII) {
        return llllllllllllIllllIlIllIIlIIlllIl < llllllllllllIllllIlIllIIlIIlllII;
    }
    
    private static boolean lIIIIlIIIIIlIIlI(final int llllllllllllIllllIlIllIIlIlIIIIl, final int llllllllllllIllllIlIllIIlIlIIIII) {
        return llllllllllllIllllIlIllIIlIlIIIIl >= llllllllllllIllllIlIllIIlIlIIIII;
    }
    
    private static void lIIIIlIIIIIIlllI() {
        (lIllllIIlIIIll = new String[TestState3.lIllllIIlIIlIl[13]])[TestState3.lIllllIIlIIlIl[1]] = lIIIIlIIIIIIlIIl("bvnlHau/gfgCXK0nl1LAuw==", "KAjcj");
        TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[2]] = lIIIIlIIIIIIlIll("UyasfmfbGI8=", "GWtcw");
        TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[3]] = lIIIIlIIIIIIlIIl("S3jZVAwuGN0EkyegLX1FKg==", "POotV");
        TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[4]] = lIIIIlIIIIIIlIll("eoeORQOmUzgYoxvnj+O+tA==", "mDvhB");
        TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[5]] = lIIIIlIIIIIIlIIl("kf6I4M26OZ8=", "bfLXX");
        TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[0]] = lIIIIlIIIIIIlIIl("Egk/P62TQTNDqgAGEjkpjO8JTZuX85o4", "RJhcv");
        TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[6]] = lIIIIlIIIIIIlIIl("rvRVURNAEMgTugRLRg4jR06swWg1hQmu", "EvFKE");
        TestState3.lIllllIIlIIIll[TestState3.lIllllIIlIIlIl[7]] = lIIIIlIIIIIIlIll("Lwsue8dyHgmGSSr9i9mybQ==", "dQvHV");
    }
    
    private static boolean lIIIIlIIIIIlIIll(final int llllllllllllIllllIlIllIIlIIllIlI) {
        return llllllllllllIllllIlIllIIlIIllIlI < 0;
    }
    
    private static void lIIIIlIIIIIIllll() {
        (lIllllIIlIIlIl = new int[14])[0] = (((0x54 ^ 0xF) & ~(0x2C ^ 0x77)) ^ (0xD ^ 0x8));
        TestState3.lIllllIIlIIlIl[1] = ((0x64 ^ 0x59 ^ (0xEA ^ 0xB7)) & (108 + 79 - 62 + 127 ^ 125 + 69 - 39 + 1 ^ -" ".length()));
        TestState3.lIllllIIlIIlIl[2] = " ".length();
        TestState3.lIllllIIlIIlIl[3] = "  ".length();
        TestState3.lIllllIIlIIlIl[4] = "   ".length();
        TestState3.lIllllIIlIIlIl[5] = (0x3 ^ 0x7);
        TestState3.lIllllIIlIIlIl[6] = (0x6E ^ 0x68);
        TestState3.lIllllIIlIIlIl[7] = (0x78 ^ 0x45 ^ (0x33 ^ 0x9));
        TestState3.lIllllIIlIIlIl[8] = (0xFFFFE1BF & 0x1FD0);
        TestState3.lIllllIIlIIlIl[9] = (0xFF ^ 0xA4) + (37 + 83 - 76 + 101) - (49 + 44 + 50 + 44) + (42 + 103 - 139 + 145);
        TestState3.lIllllIIlIIlIl[10] = (0x30 ^ 0x2);
        TestState3.lIllllIIlIIlIl[11] = 140 + 88 - 98 + 60;
        TestState3.lIllllIIlIIlIl[12] = 96 + 34 - 56 + 134;
        TestState3.lIllllIIlIIlIl[13] = (186 + 79 - 244 + 167 ^ 60 + 170 - 53 + 3);
    }
}
