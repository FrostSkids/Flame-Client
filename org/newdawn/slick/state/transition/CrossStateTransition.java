// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state.transition;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.state.GameState;

public abstract class CrossStateTransition implements Transition
{
    private /* synthetic */ GameState secondState;
    
    public void preRenderSecondState(final StateBasedGame llllllllllllIllIIIlIlIlllIlllIII, final GameContainer llllllllllllIllIIIlIlIlllIllIlll, final Graphics llllllllllllIllIIIlIlIlllIllIllI) throws SlickException {
    }
    
    public void postRenderSecondState(final StateBasedGame llllllllllllIllIIIlIlIlllIllIlII, final GameContainer llllllllllllIllIIIlIlIlllIllIIll, final Graphics llllllllllllIllIIIlIlIlllIllIIlI) throws SlickException {
    }
    
    public CrossStateTransition(final GameState llllllllllllIllIIIlIlIllllIllIlI) {
        this.secondState = llllllllllllIllIIIlIlIllllIllIlI;
    }
    
    public void update(final StateBasedGame llllllllllllIllIIIlIlIllllIIIIII, final GameContainer llllllllllllIllIIIlIlIlllIllllll, final int llllllllllllIllIIIlIlIlllIlllllI) throws SlickException {
    }
    
    public void postRender(final StateBasedGame llllllllllllIllIIIlIlIllllIlIlII, final GameContainer llllllllllllIllIIIlIlIllllIlIIll, final Graphics llllllllllllIllIIIlIlIllllIlIIlI) throws SlickException {
        this.preRenderSecondState(llllllllllllIllIIIlIlIllllIlIlII, llllllllllllIllIIIlIlIllllIlIIll, llllllllllllIllIIIlIlIllllIlIIlI);
        this.secondState.render(llllllllllllIllIIIlIlIllllIlIIll, llllllllllllIllIIIlIlIllllIlIlII, llllllllllllIllIIIlIlIllllIlIIlI);
        this.postRenderSecondState(llllllllllllIllIIIlIlIllllIlIlII, llllllllllllIllIIIlIlIllllIlIIll, llllllllllllIllIIIlIlIllllIlIIlI);
    }
    
    public void preRender(final StateBasedGame llllllllllllIllIIIlIlIllllIIlIII, final GameContainer llllllllllllIllIIIlIlIllllIIIlll, final Graphics llllllllllllIllIIIlIlIllllIIIllI) throws SlickException {
        this.preRenderFirstState(llllllllllllIllIIIlIlIllllIIlIII, llllllllllllIllIIIlIlIllllIIIlll, llllllllllllIllIIIlIlIllllIIIllI);
    }
    
    public abstract boolean isComplete();
    
    public void preRenderFirstState(final StateBasedGame llllllllllllIllIIIlIlIlllIllllII, final GameContainer llllllllllllIllIIIlIlIlllIlllIll, final Graphics llllllllllllIllIIIlIlIlllIlllIlI) throws SlickException {
    }
}
