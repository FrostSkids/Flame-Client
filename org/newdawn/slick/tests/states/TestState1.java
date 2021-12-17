// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests.states;

import java.util.Arrays;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.Color;
import org.newdawn.slick.state.transition.Transition;
import org.newdawn.slick.state.transition.EmptyTransition;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.state.transition.CrossStateTransition;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.GameContainer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.Font;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.BasicGameState;

public class TestState1 extends BasicGameState
{
    private static final /* synthetic */ String[] llIlllllIIIIlI;
    private static final /* synthetic */ int[] llIlllllIIIIll;
    private /* synthetic */ StateBasedGame game;
    private /* synthetic */ Font font;
    
    private static boolean lIIllIlIllllIllI(final int llllllllllllIllIIIllIIlIlIIIIIII, final int llllllllllllIllIIIllIIlIIlllllll) {
        return llllllllllllIllIIIllIIlIlIIIIIII == llllllllllllIllIIIllIIlIIlllllll;
    }
    
    private static String lIIllIlIllllIIlI(String llllllllllllIllIIIllIIlIlIIllIII, final String llllllllllllIllIIIllIIlIlIIlllII) {
        llllllllllllIllIIIllIIlIlIIllIII = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIllIIlIlIIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllIIlIlIIllIll = new StringBuilder();
        final char[] llllllllllllIllIIIllIIlIlIIllIlI = llllllllllllIllIIIllIIlIlIIlllII.toCharArray();
        int llllllllllllIllIIIllIIlIlIIllIIl = TestState1.llIlllllIIIIll[1];
        final byte llllllllllllIllIIIllIIlIlIIlIIll = (Object)((String)llllllllllllIllIIIllIIlIlIIllIII).toCharArray();
        final short llllllllllllIllIIIllIIlIlIIlIIlI = (short)llllllllllllIllIIIllIIlIlIIlIIll.length;
        float llllllllllllIllIIIllIIlIlIIlIIIl = TestState1.llIlllllIIIIll[1];
        while (lIIllIlIllllIlll((int)llllllllllllIllIIIllIIlIlIIlIIIl, llllllllllllIllIIIllIIlIlIIlIIlI)) {
            final char llllllllllllIllIIIllIIlIlIIllllI = llllllllllllIllIIIllIIlIlIIlIIll[llllllllllllIllIIIllIIlIlIIlIIIl];
            llllllllllllIllIIIllIIlIlIIllIll.append((char)(llllllllllllIllIIIllIIlIlIIllllI ^ llllllllllllIllIIIllIIlIlIIllIlI[llllllllllllIllIIIllIIlIlIIllIIl % llllllllllllIllIIIllIIlIlIIllIlI.length]));
            "".length();
            ++llllllllllllIllIIIllIIlIlIIllIIl;
            ++llllllllllllIllIIIllIIlIlIIlIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllIIlIlIIllIll);
    }
    
    @Override
    public int getID() {
        return TestState1.llIlllllIIIIll[0];
    }
    
    public void update(final GameContainer llllllllllllIllIIIllIIlIllIIIlll, final StateBasedGame llllllllllllIllIIIllIIlIllIIIllI, final int llllllllllllIllIIIllIIlIllIIIlIl) {
    }
    
    public void init(final GameContainer llllllllllllIllIIIllIIlIllIlIlII, final StateBasedGame llllllllllllIllIIIllIIlIllIlIIIl) throws SlickException {
        this.game = llllllllllllIllIIIllIIlIllIlIIIl;
        this.font = new AngelCodeFont(TestState1.llIlllllIIIIlI[TestState1.llIlllllIIIIll[1]], TestState1.llIlllllIIIIlI[TestState1.llIlllllIIIIll[0]]);
    }
    
    private static String lIIllIlIllllIIll(final String llllllllllllIllIIIllIIlIlIIIIllI, final String llllllllllllIllIIIllIIlIlIIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIlIlIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIlIlIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllIIlIlIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllIIlIlIIIlIlI.init(TestState1.llIlllllIIIIll[2], llllllllllllIllIIIllIIlIlIIIlIll);
            return new String(llllllllllllIllIIIllIIlIlIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIlIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIlIlIIIlIIl) {
            llllllllllllIllIIIllIIlIlIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void keyReleased(final int llllllllllllIllIIIllIIlIlIlllIll, final char llllllllllllIllIIIllIIlIlIlllIlI) {
        if (lIIllIlIllllIllI(llllllllllllIllIIIllIIlIlIlllIll, TestState1.llIlllllIIIIll[3])) {
            final GameState llllllllllllIllIIIllIIlIlIllllll = this.game.getState(TestState1.llIlllllIIIIll[2]);
            final long llllllllllllIllIIIllIIlIlIlllllI = System.currentTimeMillis();
            final CrossStateTransition llllllllllllIllIIIllIIlIlIllllIl = new CrossStateTransition(llllllllllllIllIIIllIIlIlIllllll) {
                private static final /* synthetic */ int[] llIIIIIIlllIll;
                
                @Override
                public boolean isComplete() {
                    int n;
                    if (lIIIIlllIIIlIIll(lIIIIlllIIIlIIlI(System.currentTimeMillis() - llllllllllllIllIIIllIIlIlIlllllI, 2000L))) {
                        n = TestState1$1.llIIIIIIlllIll[0];
                        "".length();
                        if (" ".length() > " ".length()) {
                            return ((0x5F ^ 0x1F) & ~(0xDC ^ 0x9C)) != 0x0;
                        }
                    }
                    else {
                        n = TestState1$1.llIIIIIIlllIll[1];
                    }
                    return n != 0;
                }
                
                private static boolean lIIIIlllIIIlIIll(final int llllllllllllIlllIllllIllIIllIlIl) {
                    return llllllllllllIlllIllllIllIIllIlIl > 0;
                }
                
                private static void lIIIIlllIIIlIIIl() {
                    (llIIIIIIlllIll = new int[2])[0] = " ".length();
                    TestState1$1.llIIIIIIlllIll[1] = ((0x31 ^ 0x2A) & ~(0x90 ^ 0x8B));
                }
                
                static {
                    lIIIIlllIIIlIIIl();
                }
                
                private static int lIIIIlllIIIlIIlI(final long n, final long n2) {
                    return lcmp(n, n2);
                }
                
                public void init(final GameState llllllllllllIlllIllllIllIIlllIII, final GameState llllllllllllIlllIllllIllIIllIlll) {
                }
            };
            this.game.enterState(TestState1.llIlllllIIIIll[2], llllllllllllIllIIIllIIlIlIllllIl, new EmptyTransition());
        }
        if (lIIllIlIllllIllI(llllllllllllIllIIIllIIlIlIlllIll, TestState1.llIlllllIIIIll[4])) {
            this.game.enterState(TestState1.llIlllllIIIIll[3], new FadeOutTransition(Color.black), new FadeInTransition(Color.black));
        }
    }
    
    private static void lIIllIlIllllIlIl() {
        (llIlllllIIIIll = new int[7])[0] = " ".length();
        TestState1.llIlllllIIIIll[1] = ((0xE7 ^ 0xA3 ^ (0x6 ^ 0x67)) & (0x76 ^ 0x12 ^ (0x5C ^ 0x1D) ^ -" ".length()));
        TestState1.llIlllllIIIIll[2] = "  ".length();
        TestState1.llIlllllIIIIll[3] = "   ".length();
        TestState1.llIlllllIIIIll[4] = (72 + 125 - 96 + 44 ^ 102 + 23 - 49 + 73);
        TestState1.llIlllllIIIIll[5] = (0x5F ^ 0x5A);
        TestState1.llIlllllIIIIll[6] = (0x85 ^ 0x8D);
    }
    
    private static boolean lIIllIlIllllIlll(final int llllllllllllIllIIIllIIlIIlllllII, final int llllllllllllIllIIIllIIlIIllllIll) {
        return llllllllllllIllIIIllIIlIIlllllII < llllllllllllIllIIIllIIlIIllllIll;
    }
    
    public void render(final GameContainer llllllllllllIllIIIllIIlIllIIllIl, final StateBasedGame llllllllllllIllIIIllIIlIllIIllII, final Graphics llllllllllllIllIIIllIIlIllIIlIll) {
        llllllllllllIllIIIllIIlIllIIlIll.setFont(this.font);
        llllllllllllIllIIIllIIlIllIIlIll.setColor(Color.white);
        llllllllllllIllIIIllIIlIllIIlIll.drawString(TestState1.llIlllllIIIIlI[TestState1.llIlllllIIIIll[2]], 100.0f, 100.0f);
        llllllllllllIllIIIllIIlIllIIlIll.drawString(TestState1.llIlllllIIIIlI[TestState1.llIlllllIIIIll[3]], 150.0f, 300.0f);
        llllllllllllIllIIIllIIlIllIIlIll.setColor(Color.red);
        llllllllllllIllIIIllIIlIllIIlIll.drawString(TestState1.llIlllllIIIIlI[TestState1.llIlllllIIIIll[4]], 200.0f, 50.0f);
    }
    
    static {
        lIIllIlIllllIlIl();
        lIIllIlIllllIlII();
        ID = TestState1.llIlllllIIIIll[0];
    }
    
    private static void lIIllIlIllllIlII() {
        (llIlllllIIIIlI = new String[TestState1.llIlllllIIIIll[5]])[TestState1.llIlllllIIIIll[1]] = lIIllIlIllllIIIl("BaB+arv9t0r6ss++d6XXNz/Xn8CLYjQs", "thSiU");
        TestState1.llIlllllIIIIlI[TestState1.llIlllllIIIIll[0]] = lIIllIlIllllIIIl("iS2Av3gDkqZzea/ALnfLLktrPSRhwSJV", "naGeQ");
        TestState1.llIlllllIIIIlI[TestState1.llIlllllIIIIll[2]] = lIIllIlIllllIIlI("AQAUMStyNhQ2KzZUMiQjN1QhID0m", "RtuEN");
        TestState1.llIlllllIIIIlI[TestState1.llIlllllIIIIll[3]] = lIIllIlIllllIIll("v3Rp1NrbrmfOSJvTwCCFXAHqTnKFjNwxcbQtqTwINeV0aL4iA0SoAA==", "XrmfN");
        TestState1.llIlllllIIIIlI[TestState1.llIlllllIIIIll[4]] = lIIllIlIllllIIlI("LRsnNWMQAG4VNxgHK2Zy", "ysNFC");
    }
    
    private static String lIIllIlIllllIIIl(final String llllllllllllIllIIIllIIlIlIlIlIll, final String llllllllllllIllIIIllIIlIlIlIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIlIlIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIlIlIlIlIlI.getBytes(StandardCharsets.UTF_8)), TestState1.llIlllllIIIIll[6]), "DES");
            final Cipher llllllllllllIllIIIllIIlIlIlIllll = Cipher.getInstance("DES");
            llllllllllllIllIIIllIIlIlIlIllll.init(TestState1.llIlllllIIIIll[2], llllllllllllIllIIIllIIlIlIllIIII);
            return new String(llllllllllllIllIIIllIIlIlIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIlIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIlIlIlIlllI) {
            llllllllllllIllIIIllIIlIlIlIlllI.printStackTrace();
            return null;
        }
    }
}
