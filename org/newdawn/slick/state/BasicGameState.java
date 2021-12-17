// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state;

import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;

public abstract class BasicGameState implements GameState
{
    private static final /* synthetic */ int[] lIIIIIlllIIIII;
    
    public void leave(final GameContainer lllllllllllllIlIIllIllIllIlIIlIl, final StateBasedGame lllllllllllllIlIIllIllIllIlIIlII) throws SlickException {
    }
    
    public abstract int getID();
    
    public void controllerLeftPressed(final int lllllllllllllIlIIllIllIlllIlllIl) {
    }
    
    public void mouseMoved(final int lllllllllllllIlIIllIllIlllIIlIll, final int lllllllllllllIlIIllIllIlllIIlIlI, final int lllllllllllllIlIIllIllIlllIIlIIl, final int lllllllllllllIlIIllIllIlllIIlIII) {
    }
    
    public void mouseReleased(final int lllllllllllllIlIIllIllIllIllIIII, final int lllllllllllllIlIIllIllIllIlIlllI, final int lllllllllllllIlIIllIllIllIlIllII) {
    }
    
    public void controllerButtonReleased(final int lllllllllllllIlIIllIllIllllIIlII, final int lllllllllllllIlIIllIllIllllIIIll) {
    }
    
    private static void lIllIlllIllIIII() {
        (lIIIIIlllIIIII = new int[1])[0] = " ".length();
    }
    
    public void controllerButtonPressed(final int lllllllllllllIlIIllIllIllllIIlll, final int lllllllllllllIlIIllIllIllllIIllI) {
    }
    
    public void controllerRightReleased(final int lllllllllllllIlIIllIllIlllIlIlll) {
    }
    
    public void controllerRightPressed(final int lllllllllllllIlIIllIllIlllIllIIl) {
    }
    
    public void inputStarted() {
    }
    
    public void controllerUpPressed(final int lllllllllllllIlIIllIllIlllIlIlIl) {
    }
    
    public void keyPressed(final int lllllllllllllIlIIllIllIlllIlIIIl, final char lllllllllllllIlIIllIllIlllIlIIII) {
    }
    
    public void mouseWheelMoved(final int lllllllllllllIlIIllIllIllIlIIIII) {
    }
    
    public void keyReleased(final int lllllllllllllIlIIllIllIlllIIlllI, final char lllllllllllllIlIIllIllIlllIIllIl) {
    }
    
    public void mousePressed(final int lllllllllllllIlIIllIllIllIlllIII, final int lllllllllllllIlIIllIllIllIllIllI, final int lllllllllllllIlIIllIllIllIllIlII) {
    }
    
    public void controllerLeftReleased(final int lllllllllllllIlIIllIllIlllIllIll) {
    }
    
    public void setInput(final Input lllllllllllllIlIIllIllIllllIllII) {
    }
    
    public void controllerDownPressed(final int lllllllllllllIlIIllIllIllllIIIIl) {
    }
    
    static {
        lIllIlllIllIIII();
    }
    
    public boolean isAcceptingInput() {
        return BasicGameState.lIIIIIlllIIIII[0] != 0;
    }
    
    public void controllerDownReleased(final int lllllllllllllIlIIllIllIlllIlllll) {
    }
    
    public void enter(final GameContainer lllllllllllllIlIIllIllIllIlIlIIl, final StateBasedGame lllllllllllllIlIIllIllIllIlIlIII) throws SlickException {
    }
    
    public void mouseDragged(final int lllllllllllllIlIIllIllIlllIIIllI, final int lllllllllllllIlIIllIllIlllIIIlIl, final int lllllllllllllIlIIllIllIlllIIIlII, final int lllllllllllllIlIIllIllIlllIIIIll) {
    }
    
    public void inputEnded() {
    }
    
    public void mouseClicked(final int lllllllllllllIlIIllIllIlllIIIIII, final int lllllllllllllIlIIllIllIllIllllll, final int lllllllllllllIlIIllIllIllIllllIl, final int lllllllllllllIlIIllIllIllIlllIll) {
    }
    
    public void controllerUpReleased(final int lllllllllllllIlIIllIllIlllIlIIll) {
    }
}
