// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state.transition;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.GameState;

public class EmptyTransition implements Transition
{
    private static final /* synthetic */ int[] lIlllllIlllIll;
    
    public void init(final GameState llllllllllllIllllIIlIllIllIlllll, final GameState llllllllllllIllllIIlIllIllIllllI) {
    }
    
    public void preRender(final StateBasedGame llllllllllllIllllIIlIllIlllIIlll, final GameContainer llllllllllllIllllIIlIllIlllIIllI, final Graphics llllllllllllIllllIIlIllIlllIIlIl) throws SlickException {
    }
    
    private static void lIIIIlIllIIllllI() {
        (lIlllllIlllIll = new int[1])[0] = " ".length();
    }
    
    public void postRender(final StateBasedGame llllllllllllIllllIIlIllIlllIlIll, final GameContainer llllllllllllIllllIIlIllIlllIlIlI, final Graphics llllllllllllIllllIIlIllIlllIlIIl) throws SlickException {
    }
    
    public boolean isComplete() {
        return EmptyTransition.lIlllllIlllIll[0] != 0;
    }
    
    public void update(final StateBasedGame llllllllllllIllllIIlIllIlllIIIll, final GameContainer llllllllllllIllllIIlIllIlllIIIlI, final int llllllllllllIllllIIlIllIlllIIIIl) throws SlickException {
    }
    
    static {
        lIIIIlIllIIllllI();
    }
}
