// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Iterator;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.state.transition.EmptyTransition;
import java.util.HashMap;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.transition.Transition;
import org.newdawn.slick.Game;
import org.newdawn.slick.InputListener;

public abstract class StateBasedGame implements InputListener, Game
{
    private /* synthetic */ Transition enterTransition;
    private static final /* synthetic */ int[] llIIIlIlIlllII;
    private /* synthetic */ GameContainer container;
    private /* synthetic */ HashMap states;
    private /* synthetic */ Transition leaveTransition;
    private /* synthetic */ GameState nextState;
    private static final /* synthetic */ String[] llIIIlIlIllIll;
    private /* synthetic */ GameState currentState;
    private /* synthetic */ String title;
    
    public void controllerLeftPressed(final int llllllllllllIlllIlIllIIlIIIlIllI) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerLeftPressed(llllllllllllIlllIlIllIIlIIIlIllI);
    }
    
    public void enterState(final int llllllllllllIlllIlIllIIlIlllllIl) {
        this.enterState(llllllllllllIlllIlIllIIlIlllllIl, new EmptyTransition(), new EmptyTransition());
    }
    
    public void addState(final GameState llllllllllllIlllIlIllIIllIIIlIIl) {
        this.states.put(new Integer(llllllllllllIlllIlIllIIllIIIlIIl.getID()), llllllllllllIlllIlIllIIllIIIlIIl);
        "".length();
        if (lIIIlIIlIllllIll(this.currentState.getID(), StateBasedGame.llIIIlIlIlllII[0])) {
            this.currentState = llllllllllllIlllIlIllIIllIIIlIIl;
        }
    }
    
    public StateBasedGame(final String llllllllllllIlllIlIllIIllIIllIll) {
        this.states = new HashMap();
        this.title = llllllllllllIlllIlIllIIllIIllIll;
        this.currentState = new BasicGameState() {
            private static final /* synthetic */ int[] lIIllIIIIIIlIl;
            
            private static void llIlIlIlIIIIIlI() {
                (lIIllIIIIIIlIl = new int[1])[0] = -" ".length();
            }
            
            public void render(final StateBasedGame lllllllllllllIIlIllllIllllIllIlI, final Graphics lllllllllllllIIlIllllIllllIllIIl) throws SlickException {
            }
            
            static {
                llIlIlIlIIIIIlI();
            }
            
            public void init(final GameContainer lllllllllllllIIlIllllIllllIlllIl, final StateBasedGame lllllllllllllIIlIllllIllllIlllII) throws SlickException {
            }
            
            @Override
            public int getID() {
                return StateBasedGame$1.lIIllIIIIIIlIl[0];
            }
            
            public void render(final GameContainer lllllllllllllIIlIllllIllllIlIIll, final StateBasedGame lllllllllllllIIlIllllIllllIlIIlI, final Graphics lllllllllllllIIlIllllIllllIlIIIl) throws SlickException {
            }
            
            public void update(final GameContainer lllllllllllllIIlIllllIllllIlIlll, final StateBasedGame lllllllllllllIIlIllllIllllIlIllI, final int lllllllllllllIIlIllllIllllIlIlIl) throws SlickException {
            }
        };
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void mousePressed(final int llllllllllllIlllIlIllIIIlIlIllIl, final int llllllllllllIlllIlIllIIIlIlIllII, final int llllllllllllIlllIlIllIIIlIlIllll) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.mousePressed(llllllllllllIlllIlIllIIIlIlIllIl, llllllllllllIlllIlIllIIIlIlIllII, llllllllllllIlllIlIllIIIlIlIllll);
    }
    
    public void enterState(final int llllllllllllIlllIlIllIIlIlllIIIl, Transition llllllllllllIlllIlIllIIlIlllIIII, Transition llllllllllllIlllIlIllIIlIllIllll) {
        if (lIIIlIIlIlllllII(llllllllllllIlllIlIllIIlIlllIIII)) {
            llllllllllllIlllIlIllIIlIlllIIII = new EmptyTransition();
        }
        if (lIIIlIIlIlllllII(llllllllllllIlllIlIllIIlIllIllll)) {
            llllllllllllIlllIlIllIIlIllIllll = new EmptyTransition();
        }
        this.leaveTransition = (Transition)llllllllllllIlllIlIllIIlIlllIIII;
        this.enterTransition = (Transition)llllllllllllIlllIlIllIIlIllIllll;
        this.nextState = this.getState(llllllllllllIlllIlIllIIlIlllIIIl);
        if (lIIIlIIlIlllllII(this.nextState)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(StateBasedGame.llIIIlIlIllIll[StateBasedGame.llIIIlIlIlllII[1]]).append(llllllllllllIlllIlIllIIlIlllIIIl)));
        }
        this.leaveTransition.init(this.currentState, this.nextState);
    }
    
    private static boolean lIIIlIIlIlllllIl(final int llllllllllllIlllIlIllIIIIllIllll) {
        return llllllllllllIlllIlIllIIIIllIllll != 0;
    }
    
    public final void update(final GameContainer llllllllllllIlllIlIllIIlIlIIlIlI, final int llllllllllllIlllIlIllIIlIlIIlIIl) throws SlickException {
        this.preUpdateState(llllllllllllIlllIlIllIIlIlIIlIlI, llllllllllllIlllIlIllIIlIlIIlIIl);
        if (lIIIlIIlIllllllI(this.leaveTransition)) {
            this.leaveTransition.update(this, llllllllllllIlllIlIllIIlIlIIlIlI, llllllllllllIlllIlIllIIlIlIIlIIl);
            if (!lIIIlIIlIlllllIl(this.leaveTransition.isComplete() ? 1 : 0)) {
                return;
            }
            this.currentState.leave(llllllllllllIlllIlIllIIlIlIIlIlI, this);
            final GameState llllllllllllIlllIlIllIIlIlIIllll = this.currentState;
            this.currentState = this.nextState;
            this.nextState = null;
            this.leaveTransition = null;
            this.currentState.enter(llllllllllllIlllIlIllIIlIlIIlIlI, this);
            if (lIIIlIIlIllllllI(this.enterTransition)) {
                this.enterTransition.init(this.currentState, llllllllllllIlllIlIllIIlIlIIllll);
            }
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        if (lIIIlIIlIllllllI(this.enterTransition)) {
            this.enterTransition.update(this, llllllllllllIlllIlIllIIlIlIIlIlI, llllllllllllIlllIlIllIIlIlIIlIIl);
            if (!lIIIlIIlIlllllIl(this.enterTransition.isComplete() ? 1 : 0)) {
                return;
            }
            this.enterTransition = null;
            "".length();
            if (-" ".length() == "  ".length()) {
                return;
            }
        }
        this.currentState.update(llllllllllllIlllIlIllIIlIlIIlIlI, this, llllllllllllIlllIlIllIIlIlIIlIIl);
        this.postUpdateState(llllllllllllIlllIlIllIIlIlIIlIlI, llllllllllllIlllIlIllIIlIlIIlIIl);
    }
    
    static {
        lIIIlIIlIllllIlI();
        lIIIlIIlIllllIII();
    }
    
    public void mouseWheelMoved(final int llllllllllllIlllIlIllIIIlIIlIlIl) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.mouseWheelMoved(llllllllllllIlllIlIllIIIlIIlIlIl);
    }
    
    public void controllerButtonPressed(final int llllllllllllIlllIlIllIIlIIllIIll, final int llllllllllllIlllIlIllIIlIIlIllll) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerButtonPressed(llllllllllllIlllIlIllIIlIIllIIll, llllllllllllIlllIlIllIIlIIlIllll);
    }
    
    public void setInput(final Input llllllllllllIlllIlIllIIllIIIllIl) {
    }
    
    public void mouseClicked(final int llllllllllllIlllIlIllIIIlIlllIlI, final int llllllllllllIlllIlIllIIIlIlllllI, final int llllllllllllIlllIlIllIIIlIlllIII, final int llllllllllllIlllIlIllIIIlIllIlll) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.mouseClicked(llllllllllllIlllIlIllIIIlIlllIlI, llllllllllllIlllIlIllIIIlIlllllI, llllllllllllIlllIlIllIIIlIlllIII, llllllllllllIlllIlIllIIIlIllIlll);
    }
    
    public GameState getCurrentState() {
        return this.currentState;
    }
    
    protected void preRenderState(final GameContainer llllllllllllIlllIlIllIIlIlIllIII, final Graphics llllllllllllIlllIlIllIIlIlIlIlll) throws SlickException {
    }
    
    public int getStateCount() {
        return this.states.keySet().size();
    }
    
    public void inputEnded() {
    }
    
    public final void init(final GameContainer llllllllllllIlllIlIllIIlIllIIlIl) throws SlickException {
        this.container = llllllllllllIlllIlIllIIlIllIIlIl;
        this.initStatesList(llllllllllllIlllIlIllIIlIllIIlIl);
        final Iterator llllllllllllIlllIlIllIIlIllIIlll = this.states.values().iterator();
        while (lIIIlIIlIlllllIl(llllllllllllIlllIlIllIIlIllIIlll.hasNext() ? 1 : 0)) {
            final GameState llllllllllllIlllIlIllIIlIllIlIlI = llllllllllllIlllIlIllIIlIllIIlll.next();
            llllllllllllIlllIlIllIIlIllIlIlI.init(llllllllllllIlllIlIllIIlIllIIlIl, this);
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        if (lIIIlIIlIllllllI(this.currentState)) {
            this.currentState.enter(llllllllllllIlllIlIllIIlIllIIlIl, this);
        }
    }
    
    public void controllerRightPressed(final int llllllllllllIlllIlIllIIlIIIIlIlI) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerRightPressed(llllllllllllIlllIlIllIIlIIIIlIlI);
    }
    
    public void controllerRightReleased(final int llllllllllllIlllIlIllIIlIIIIIIlI) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerRightReleased(llllllllllllIlllIlIllIIlIIIIIIlI);
    }
    
    public GameState getState(final int llllllllllllIlllIlIllIIllIIIIIIl) {
        return this.states.get(new Integer(llllllllllllIlllIlIllIIllIIIIIIl));
    }
    
    protected void postRenderState(final GameContainer llllllllllllIlllIlIllIIlIlIlIlIl, final Graphics llllllllllllIlllIlIllIIlIlIlIlII) throws SlickException {
    }
    
    private static void lIIIlIIlIllllIII() {
        (llIIIlIlIllIll = new String[StateBasedGame.llIIIlIlIlllII[2]])[StateBasedGame.llIIIlIlIlllII[1]] = lIIIlIIlIlllIlll("HzVPARI8P08VBzAuCkYBND0GFQc0KAoCUyYzGw5TJTIKRjoVYE8=", "QZofs");
    }
    
    public void mouseReleased(final int llllllllllllIlllIlIllIIIlIlIIlIl, final int llllllllllllIlllIlIllIIIlIlIIlII, final int llllllllllllIlllIlIllIIIlIIlllll) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.mouseReleased(llllllllllllIlllIlIllIIIlIlIIlIl, llllllllllllIlllIlIllIIIlIlIIlII, llllllllllllIlllIlIllIIIlIIlllll);
    }
    
    private boolean transitioning() {
        int n;
        if (!lIIIlIIlIlllllII(this.leaveTransition) || lIIIlIIlIllllllI(this.enterTransition)) {
            n = StateBasedGame.llIIIlIlIlllII[2];
            "".length();
            if (-"  ".length() >= 0) {
                return ((83 + 103 - 143 + 200 ^ 100 + 60 - 159 + 161) & (0x2E ^ 0x63 ^ (0xB5 ^ 0xA9) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = StateBasedGame.llIIIlIlIlllII[1];
        }
        return n != 0;
    }
    
    public void controllerUpReleased(final int llllllllllllIlllIlIllIIIllllIllI) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerUpReleased(llllllllllllIlllIlIllIIIllllIllI);
    }
    
    private static boolean lIIIlIIlIllllllI(final Object llllllllllllIlllIlIllIIIIlllIIll) {
        return llllllllllllIlllIlIllIIIIlllIIll != null;
    }
    
    public void inputStarted() {
    }
    
    private static boolean lIIIlIIlIlllllll(final int llllllllllllIlllIlIllIIIIlllIllI, final int llllllllllllIlllIlIllIIIIlllIlIl) {
        return llllllllllllIlllIlIllIIIIlllIllI < llllllllllllIlllIlIllIIIIlllIlIl;
    }
    
    private static void lIIIlIIlIllllIlI() {
        (llIIIlIlIlllII = new int[3])[0] = -" ".length();
        StateBasedGame.llIIIlIlIlllII[1] = ((46 + 128 + 34 + 47 ^ 152 + 95 - 71 + 6) & (149 + 34 - 76 + 126 ^ 92 + 15 - 49 + 102 ^ -" ".length()));
        StateBasedGame.llIIIlIlIlllII[2] = " ".length();
    }
    
    public void controllerDownReleased(final int llllllllllllIlllIlIllIIlIIIllIlI) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerDownReleased(llllllllllllIlllIlIllIIlIIIllIlI);
    }
    
    public void mouseDragged(final int llllllllllllIlllIlIllIIIllIIlIIl, final int llllllllllllIlllIlIllIIIllIIlIII, final int llllllllllllIlllIlIllIIIllIIllII, final int llllllllllllIlllIlIllIIIllIIIllI) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.mouseDragged(llllllllllllIlllIlIllIIIllIIlIIl, llllllllllllIlllIlIllIIIllIIlIII, llllllllllllIlllIlIllIIIllIIllII, llllllllllllIlllIlIllIIIllIIIllI);
    }
    
    public boolean closeRequested() {
        return StateBasedGame.llIIIlIlIlllII[2] != 0;
    }
    
    public GameContainer getContainer() {
        return this.container;
    }
    
    public void keyPressed(final int llllllllllllIlllIlIllIIIllllIIIl, final char llllllllllllIlllIlIllIIIllllIIII) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.keyPressed(llllllllllllIlllIlIllIIIllllIIIl, llllllllllllIlllIlIllIIIllllIIII);
    }
    
    public abstract void initStatesList(final GameContainer p0) throws SlickException;
    
    public void controllerButtonReleased(final int llllllllllllIlllIlIllIIlIIlIlIlI, final int llllllllllllIlllIlIllIIlIIlIlIIl) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerButtonReleased(llllllllllllIlllIlIllIIlIIlIlIlI, llllllllllllIlllIlIllIIlIIlIlIIl);
    }
    
    public void keyReleased(final int llllllllllllIlllIlIllIIIlllIIlIl, final char llllllllllllIlllIlIllIIIlllIIlll) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.keyReleased(llllllllllllIlllIlIllIIIlllIIlIl, llllllllllllIlllIlIllIIIlllIIlll);
    }
    
    public final void render(final GameContainer llllllllllllIlllIlIllIIlIlIllIll, final Graphics llllllllllllIlllIlIllIIlIlIlllIl) throws SlickException {
        this.preRenderState(llllllllllllIlllIlIllIIlIlIllIll, llllllllllllIlllIlIllIIlIlIlllIl);
        if (lIIIlIIlIllllllI(this.leaveTransition)) {
            this.leaveTransition.preRender(this, llllllllllllIlllIlIllIIlIlIllIll, llllllllllllIlllIlIllIIlIlIlllIl);
            "".length();
            if (-(0x5 ^ 0x1) > 0) {
                return;
            }
        }
        else if (lIIIlIIlIllllllI(this.enterTransition)) {
            this.enterTransition.preRender(this, llllllllllllIlllIlIllIIlIlIllIll, llllllllllllIlllIlIllIIlIlIlllIl);
        }
        this.currentState.render(llllllllllllIlllIlIllIIlIlIllIll, this, llllllllllllIlllIlIllIIlIlIlllIl);
        if (lIIIlIIlIllllllI(this.leaveTransition)) {
            this.leaveTransition.postRender(this, llllllllllllIlllIlIllIIlIlIllIll, llllllllllllIlllIlIllIIlIlIlllIl);
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        else if (lIIIlIIlIllllllI(this.enterTransition)) {
            this.enterTransition.postRender(this, llllllllllllIlllIlIllIIlIlIllIll, llllllllllllIlllIlIllIIlIlIlllIl);
        }
        this.postRenderState(llllllllllllIlllIlIllIIlIlIllIll, llllllllllllIlllIlIllIIlIlIlllIl);
    }
    
    public void controllerLeftReleased(final int llllllllllllIlllIlIllIIlIIIIlllI) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerLeftReleased(llllllllllllIlllIlIllIIlIIIIlllI);
    }
    
    public int getCurrentStateID() {
        return this.currentState.getID();
    }
    
    public void controllerDownPressed(final int llllllllllllIlllIlIllIIlIIlIIIlI) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerDownPressed(llllllllllllIlllIlIllIIlIIlIIIlI);
    }
    
    private static boolean lIIIlIIlIlllllII(final Object llllllllllllIlllIlIllIIIIlllIIIl) {
        return llllllllllllIlllIlIllIIIIlllIIIl == null;
    }
    
    protected void postUpdateState(final GameContainer llllllllllllIlllIlIllIIlIlIIIIll, final int llllllllllllIlllIlIllIIlIlIIIIlI) throws SlickException {
    }
    
    public void controllerUpPressed(final int llllllllllllIlllIlIllIIIllllllII) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.controllerUpPressed(llllllllllllIlllIlIllIIIllllllII);
    }
    
    public boolean isAcceptingInput() {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return StateBasedGame.llIIIlIlIlllII[1] != 0;
        }
        return this.currentState.isAcceptingInput();
    }
    
    private static boolean lIIIlIIlIllllIll(final int llllllllllllIlllIlIllIIIIllllIlI, final int llllllllllllIlllIlIllIIIIllllIIl) {
        return llllllllllllIlllIlIllIIIIllllIlI == llllllllllllIlllIlIllIIIIllllIIl;
    }
    
    public void mouseMoved(final int llllllllllllIlllIlIllIIIllIlllIl, final int llllllllllllIlllIlIllIIIllIlIlll, final int llllllllllllIlllIlIllIIIllIllIll, final int llllllllllllIlllIlIllIIIllIlIlIl) {
        if (lIIIlIIlIlllllIl(this.transitioning() ? 1 : 0)) {
            return;
        }
        this.currentState.mouseMoved(llllllllllllIlllIlIllIIIllIlllIl, llllllllllllIlllIlIllIIIllIlIlll, llllllllllllIlllIlIllIIIllIllIll, llllllllllllIlllIlIllIIIllIlIlIl);
    }
    
    private static String lIIIlIIlIlllIlll(String llllllllllllIlllIlIllIIIlIIIlIlI, final String llllllllllllIlllIlIllIIIlIIIlIIl) {
        llllllllllllIlllIlIllIIIlIIIlIlI = new String(Base64.getDecoder().decode(llllllllllllIlllIlIllIIIlIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIllIIIlIIIlIII = new StringBuilder();
        final char[] llllllllllllIlllIlIllIIIlIIIIlll = llllllllllllIlllIlIllIIIlIIIlIIl.toCharArray();
        int llllllllllllIlllIlIllIIIlIIIIllI = StateBasedGame.llIIIlIlIlllII[1];
        final char llllllllllllIlllIlIllIIIlIIIIIII = (Object)llllllllllllIlllIlIllIIIlIIIlIlI.toCharArray();
        final byte llllllllllllIlllIlIllIIIIlllllll = (byte)llllllllllllIlllIlIllIIIlIIIIIII.length;
        byte llllllllllllIlllIlIllIIIIllllllI = (byte)StateBasedGame.llIIIlIlIlllII[1];
        while (lIIIlIIlIlllllll(llllllllllllIlllIlIllIIIIllllllI, llllllllllllIlllIlIllIIIIlllllll)) {
            final char llllllllllllIlllIlIllIIIlIIIlIll = llllllllllllIlllIlIllIIIlIIIIIII[llllllllllllIlllIlIllIIIIllllllI];
            llllllllllllIlllIlIllIIIlIIIlIII.append((char)(llllllllllllIlllIlIllIIIlIIIlIll ^ llllllllllllIlllIlIllIIIlIIIIlll[llllllllllllIlllIlIllIIIlIIIIllI % llllllllllllIlllIlIllIIIlIIIIlll.length]));
            "".length();
            ++llllllllllllIlllIlIllIIIlIIIIllI;
            ++llllllllllllIlllIlIllIIIIllllllI;
            "".length();
            if ((0x46 ^ 0x42) < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIllIIIlIIIlIII);
    }
    
    protected void preUpdateState(final GameContainer llllllllllllIlllIlIllIIlIlIIIllI, final int llllllllllllIlllIlIllIIlIlIIIlIl) throws SlickException {
    }
}
