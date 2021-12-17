// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.transition.SelectTransition;
import org.newdawn.slick.state.transition.BlobbyTransition;
import org.newdawn.slick.state.transition.HorizontalSplitTransition;
import org.newdawn.slick.state.transition.RotateTransition;
import org.newdawn.slick.state.transition.FadeInTransition;
import org.newdawn.slick.state.transition.FadeOutTransition;
import org.newdawn.slick.state.transition.VerticalSplitTransition;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.state.transition.Transition;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.state.StateBasedGame;

public class TransitionTest extends StateBasedGame
{
    private /* synthetic */ int index;
    private static final /* synthetic */ int[] lIIlIIIlllllII;
    private static final /* synthetic */ String[] lIIlIIIllllIll;
    private /* synthetic */ Class[][] transitions;
    
    private static void llIIlIlllIlllII() {
        (lIIlIIIllllIll = new String[TransitionTest.lIIlIIIlllllII[5]])[TransitionTest.lIIlIIIlllllII[0]] = llIIlIlllIllIll("IzgiHgcePiofGlceJgMAV2djOB0DahAAFRQvYyQbVx4xERoEIzcZGxk=", "wJCpt");
        TransitionTest.lIIlIIIllllIll[TransitionTest.lIIlIIIlllllII[3]] = llIIlIlllIllIll("BykwGhcSOCJBBBIgLx4SAykxQQMSPCYcQl08LQk=", "sLCns");
        TransitionTest.lIIlIIIllllIll[TransitionTest.lIIlIIIlllllII[2]] = llIIlIlllIllIll("GQo7FSsMGylOOAwDJBEuHQo6Tj8MHy0TfUMfJgY=", "moHaO");
        TransitionTest.lIIlIIIllllIll[TransitionTest.lIIlIIIlllllII[4]] = llIIlIlllIllIll("HxI1NzwKAydsOgIQLy45DBJoNz8K", "kwFCX");
    }
    
    public static void main(final String[] lllllllllllllIIlllIIIllIllllIlIl) {
        try {
            final AppGameContainer lllllllllllllIIlllIIIllIllllIlll = new AppGameContainer(new TransitionTest());
            lllllllllllllIIlllIIIllIllllIlll.setDisplayMode(TransitionTest.lIIlIIIlllllII[7], TransitionTest.lIIlIIIlllllII[8], (boolean)(TransitionTest.lIIlIIIlllllII[0] != 0));
            lllllllllllllIIlllIIIllIllllIlll.start();
            "".length();
            if (" ".length() <= ((0xBF ^ 0x91 ^ (0x81 ^ 0x84)) & (0x2E ^ 0x44 ^ (0x8 ^ 0x49) ^ -" ".length()))) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIlllIIIllIllllIllI) {
            lllllllllllllIIlllIIIllIllllIllI.printStackTrace();
        }
    }
    
    @Override
    public void initStatesList(final GameContainer lllllllllllllIIlllIIIlllIIIIIIll) throws SlickException {
        this.addState(new ImageState(TransitionTest.lIIlIIIlllllII[0], TransitionTest.lIIlIIIllllIll[TransitionTest.lIIlIIIlllllII[3]], TransitionTest.lIIlIIIlllllII[3]));
        this.addState(new ImageState(TransitionTest.lIIlIIIlllllII[3], TransitionTest.lIIlIIIllllIll[TransitionTest.lIIlIIIlllllII[2]], TransitionTest.lIIlIIIlllllII[2]));
        this.addState(new ImageState(TransitionTest.lIIlIIIlllllII[2], TransitionTest.lIIlIIIllllIll[TransitionTest.lIIlIIIlllllII[4]], TransitionTest.lIIlIIIlllllII[0]));
    }
    
    private static boolean llIIlIlllIllllI(final Object lllllllllllllIIlllIIIllIllIlIIlI) {
        return lllllllllllllIIlllIIIllIllIlIIlI != null;
    }
    
    private static boolean llIIlIlllIlllll(final int lllllllllllllIIlllIIIllIllIllIIl, final int lllllllllllllIIlllIIIllIllIllIII) {
        return lllllllllllllIIlllIIIllIllIllIIl >= lllllllllllllIIlllIIIllIllIllIII;
    }
    
    public Transition[] getNextTransitionPair() {
        final Transition[] lllllllllllllIIlllIIIllIllllllII = new Transition[TransitionTest.lIIlIIIlllllII[2]];
        try {
            if (llIIlIlllIllllI(this.transitions[this.index][TransitionTest.lIIlIIIlllllII[0]])) {
                lllllllllllllIIlllIIIllIllllllII[TransitionTest.lIIlIIIlllllII[0]] = this.transitions[this.index][TransitionTest.lIIlIIIlllllII[0]].newInstance();
            }
            if (llIIlIlllIllllI(this.transitions[this.index][TransitionTest.lIIlIIIlllllII[3]])) {
                lllllllllllllIIlllIIIllIllllllII[TransitionTest.lIIlIIIlllllII[3]] = this.transitions[this.index][TransitionTest.lIIlIIIlllllII[3]].newInstance();
            }
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        catch (Throwable lllllllllllllIIlllIIIllIlllllllI) {
            Log.error(lllllllllllllIIlllIIIllIlllllllI);
        }
        this.index += TransitionTest.lIIlIIIlllllII[3];
        if (llIIlIlllIlllll(this.index, this.transitions.length)) {
            this.index = TransitionTest.lIIlIIIlllllII[0];
        }
        return lllllllllllllIIlllIIIllIllllllII;
    }
    
    static {
        llIIlIlllIlllIl();
        llIIlIlllIlllII();
    }
    
    private static boolean llIIlIllllIIIII(final int lllllllllllllIIlllIIIllIllIlIlIl, final int lllllllllllllIIlllIIIllIllIlIlII) {
        return lllllllllllllIIlllIIIllIllIlIlIl < lllllllllllllIIlllIIIllIllIlIlII;
    }
    
    private static String llIIlIlllIllIll(String lllllllllllllIIlllIIIllIlllIIlII, final String lllllllllllllIIlllIIIllIlllIlIII) {
        lllllllllllllIIlllIIIllIlllIIlII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIIIllIlllIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIIllIlllIIlll = new StringBuilder();
        final char[] lllllllllllllIIlllIIIllIlllIIllI = lllllllllllllIIlllIIIllIlllIlIII.toCharArray();
        int lllllllllllllIIlllIIIllIlllIIlIl = TransitionTest.lIIlIIIlllllII[0];
        final byte lllllllllllllIIlllIIIllIllIlllll = (Object)((String)lllllllllllllIIlllIIIllIlllIIlII).toCharArray();
        final float lllllllllllllIIlllIIIllIllIllllI = lllllllllllllIIlllIIIllIllIlllll.length;
        byte lllllllllllllIIlllIIIllIllIlllIl = (byte)TransitionTest.lIIlIIIlllllII[0];
        while (llIIlIllllIIIII(lllllllllllllIIlllIIIllIllIlllIl, (int)lllllllllllllIIlllIIIllIllIllllI)) {
            final char lllllllllllllIIlllIIIllIlllIlIlI = lllllllllllllIIlllIIIllIllIlllll[lllllllllllllIIlllIIIllIllIlllIl];
            lllllllllllllIIlllIIIllIlllIIlll.append((char)(lllllllllllllIIlllIIIllIlllIlIlI ^ lllllllllllllIIlllIIIllIlllIIllI[lllllllllllllIIlllIIIllIlllIIlIl % lllllllllllllIIlllIIIllIlllIIllI.length]));
            "".length();
            ++lllllllllllllIIlllIIIllIlllIIlIl;
            ++lllllllllllllIIlllIIIllIllIlllIl;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIIllIlllIIlll);
    }
    
    public TransitionTest() {
        super(TransitionTest.lIIlIIIllllIll[TransitionTest.lIIlIIIlllllII[0]]);
        final Class[][] transitions = new Class[TransitionTest.lIIlIIIlllllII[1]][];
        final int n = TransitionTest.lIIlIIIlllllII[0];
        final Class[] array = new Class[TransitionTest.lIIlIIIlllllII[2]];
        array[TransitionTest.lIIlIIIlllllII[0]] = null;
        array[TransitionTest.lIIlIIIlllllII[3]] = VerticalSplitTransition.class;
        transitions[n] = array;
        final int n2 = TransitionTest.lIIlIIIlllllII[3];
        final Class[] array2 = new Class[TransitionTest.lIIlIIIlllllII[2]];
        array2[TransitionTest.lIIlIIIlllllII[0]] = FadeOutTransition.class;
        array2[TransitionTest.lIIlIIIlllllII[3]] = FadeInTransition.class;
        transitions[n2] = array2;
        final int n3 = TransitionTest.lIIlIIIlllllII[2];
        final Class[] array3 = new Class[TransitionTest.lIIlIIIlllllII[2]];
        array3[TransitionTest.lIIlIIIlllllII[0]] = null;
        array3[TransitionTest.lIIlIIIlllllII[3]] = RotateTransition.class;
        transitions[n3] = array3;
        final int n4 = TransitionTest.lIIlIIIlllllII[4];
        final Class[] array4 = new Class[TransitionTest.lIIlIIIlllllII[2]];
        array4[TransitionTest.lIIlIIIlllllII[0]] = null;
        array4[TransitionTest.lIIlIIIlllllII[3]] = HorizontalSplitTransition.class;
        transitions[n4] = array4;
        final int n5 = TransitionTest.lIIlIIIlllllII[5];
        final Class[] array5 = new Class[TransitionTest.lIIlIIIlllllII[2]];
        array5[TransitionTest.lIIlIIIlllllII[0]] = null;
        array5[TransitionTest.lIIlIIIlllllII[3]] = BlobbyTransition.class;
        transitions[n5] = array5;
        final int n6 = TransitionTest.lIIlIIIlllllII[6];
        final Class[] array6 = new Class[TransitionTest.lIIlIIIlllllII[2]];
        array6[TransitionTest.lIIlIIIlllllII[0]] = null;
        array6[TransitionTest.lIIlIIIlllllII[3]] = SelectTransition.class;
        transitions[n6] = array6;
        this.transitions = transitions;
    }
    
    private static void llIIlIlllIlllIl() {
        (lIIlIIIlllllII = new int[9])[0] = ((45 + 101 - 53 + 44 ^ 56 + 60 - 72 + 134) & (101 + 141 - 136 + 149 ^ 153 + 86 - 74 + 31 ^ -" ".length()));
        TransitionTest.lIIlIIIlllllII[1] = (0xFB ^ 0xBD ^ (0x5 ^ 0x45));
        TransitionTest.lIIlIIIlllllII[2] = "  ".length();
        TransitionTest.lIIlIIIlllllII[3] = " ".length();
        TransitionTest.lIIlIIIlllllII[4] = "   ".length();
        TransitionTest.lIIlIIIlllllII[5] = (0x22 ^ 0x26);
        TransitionTest.lIIlIIIlllllII[6] = (0x2D ^ 0x28);
        TransitionTest.lIIlIIIlllllII[7] = (-(0xFFFF9F6D & 0x7C9B) & (0xFFFF9FFD & 0x7F2A));
        TransitionTest.lIIlIIIlllllII[8] = (0xFFFFAB5E & 0x56F9);
    }
    
    private class ImageState extends BasicGameState
    {
        private /* synthetic */ int id;
        private /* synthetic */ Image image;
        private static final /* synthetic */ int[] llIIllIIIIIlll;
        private /* synthetic */ String ref;
        private /* synthetic */ int next;
        
        private static void lIIIlllIIlIIlllI() {
            (llIIllIIIIIlll = new int[3])[0] = (0x71 ^ 0x28 ^ (0x1E ^ 0x7E));
            ImageState.llIIllIIIIIlll[1] = ((0xEA ^ 0xB4) & ~(0xFF ^ 0xA1));
            ImageState.llIIllIIIIIlll[2] = " ".length();
        }
        
        @Override
        public int getID() {
            return this.id;
        }
        
        public void render(final GameContainer llllllllllllIlllIIIIlIlIIIlIlIIl, final StateBasedGame llllllllllllIlllIIIIlIlIIIlIlIII, final Graphics llllllllllllIlllIIIIlIlIIIlIIlIl) throws SlickException {
            this.image.draw(0.0f, 0.0f, 800.0f, 600.0f);
            llllllllllllIlllIIIIlIlIIIlIIlIl.setColor(Color.red);
            llllllllllllIlllIIIIlIlIIIlIIlIl.fillRect(-50.0f, 200.0f, 50.0f, 50.0f);
        }
        
        public void update(final GameContainer llllllllllllIlllIIIIlIlIIIIllllI, final StateBasedGame llllllllllllIlllIIIIlIlIIIIlllIl, final int llllllllllllIlllIIIIlIlIIIIlllII) throws SlickException {
            if (lIIIlllIIlIIllll(llllllllllllIlllIIIIlIlIIIIllllI.getInput().isKeyPressed(ImageState.llIIllIIIIIlll[0]) ? 1 : 0)) {
                final Transition[] llllllllllllIlllIIIIlIlIIIlIIIII = TransitionTest.this.getNextTransitionPair();
                llllllllllllIlllIIIIlIlIIIIlllIl.enterState(this.next, llllllllllllIlllIIIIlIlIIIlIIIII[ImageState.llIIllIIIIIlll[1]], llllllllllllIlllIIIIlIlIIIlIIIII[ImageState.llIIllIIIIIlll[2]]);
            }
        }
        
        public ImageState(final int llllllllllllIlllIIIIlIlIIIllIlll, final String llllllllllllIlllIIIIlIlIIIlllIll, final int llllllllllllIlllIIIIlIlIIIlllIlI) {
            this.ref = llllllllllllIlllIIIIlIlIIIlllIll;
            this.id = llllllllllllIlllIIIIlIlIIIllIlll;
            this.next = llllllllllllIlllIIIIlIlIIIlllIlI;
        }
        
        static {
            lIIIlllIIlIIlllI();
        }
        
        public void init(final GameContainer llllllllllllIlllIIIIlIlIIIlIllll, final StateBasedGame llllllllllllIlllIIIIlIlIIIlIlllI) throws SlickException {
            this.image = new Image(this.ref);
        }
        
        private static boolean lIIIlllIIlIIllll(final int llllllllllllIlllIIIIlIlIIIIlIllI) {
            return llllllllllllIlllIIIIlIlIIIIlIllI != 0;
        }
    }
}
