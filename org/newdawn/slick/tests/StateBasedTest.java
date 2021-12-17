// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.tests.states.TestState3;
import org.newdawn.slick.tests.states.TestState2;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.tests.states.TestState1;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.state.StateBasedGame;

public class StateBasedTest extends StateBasedGame
{
    private static final /* synthetic */ String[] lllIllllllIllI;
    private static final /* synthetic */ int[] lllIlllllllIII;
    
    public static void main(final String[] llllllllllllIlIlIllllIlIlIIIIIIl) {
        try {
            final AppGameContainer llllllllllllIlIlIllllIlIlIIIIlIl = new AppGameContainer(new StateBasedTest());
            llllllllllllIlIlIllllIlIlIIIIlIl.setDisplayMode(StateBasedTest.lllIlllllllIII[1], StateBasedTest.lllIlllllllIII[2], (boolean)(StateBasedTest.lllIlllllllIII[0] != 0));
            llllllllllllIlIlIllllIlIlIIIIlIl.start();
            "".length();
            if (-(0x7E ^ 0x7B) >= 0) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIlIllllIlIlIIIIIll) {
            llllllllllllIlIlIllllIlIlIIIIIll.printStackTrace();
        }
    }
    
    static {
        lIlIIllIIlIlIIIl();
        lIlIIllIIlIIllIl();
    }
    
    @Override
    public void initStatesList(final GameContainer llllllllllllIlIlIllllIlIlIIIlllI) {
        this.addState(new TestState1());
        this.addState(new TestState2());
        this.addState(new TestState3());
    }
    
    private static void lIlIIllIIlIIllIl() {
        (lllIllllllIllI = new String[StateBasedTest.lllIlllllllIII[3]])[StateBasedTest.lllIlllllllIII[0]] = lIlIIllIIlIIIIII("4MKvqMtOBXl3nZuUK2kL95lPVDnv2JAe", "NWnkH");
    }
    
    private static String lIlIIllIIlIIIIII(final String llllllllllllIlIlIllllIlIIllIlIII, final String llllllllllllIlIlIllllIlIIllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlIlIllllIlIIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIllllIlIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlIllllIlIIllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIlIllllIlIIllIlllI.init(StateBasedTest.lllIlllllllIII[4], llllllllllllIlIlIllllIlIIlllIIII);
            return new String(llllllllllllIlIlIllllIlIIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIllllIlIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIllllIlIIllIllII) {
            llllllllllllIlIlIllllIlIIllIllII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIllIIlIlIIIl() {
        (lllIlllllllIII = new int[5])[0] = ((126 + 31 - 118 + 187 ^ 0 + 43 - 20 + 140) & (49 + 194 - 164 + 168 ^ 93 + 91 - 137 + 135 ^ -" ".length()));
        StateBasedTest.lllIlllllllIII[1] = (0xFFFFFFFE & 0x321);
        StateBasedTest.lllIlllllllIII[2] = (-(0xFFFFFFED & 0x6DB3) & (0xFFFFFFF9 & 0x6FFE));
        StateBasedTest.lllIlllllllIII[3] = " ".length();
        StateBasedTest.lllIlllllllIII[4] = "  ".length();
    }
    
    public StateBasedTest() {
        super(StateBasedTest.lllIllllllIllI[StateBasedTest.lllIlllllllIII[0]]);
    }
}
