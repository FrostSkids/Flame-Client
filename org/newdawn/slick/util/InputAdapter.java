// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import org.newdawn.slick.Input;
import org.newdawn.slick.InputListener;

public class InputAdapter implements InputListener
{
    private /* synthetic */ boolean acceptingInput;
    private static final /* synthetic */ int[] llIIlIlIIIlIIl;
    
    public void controllerRightPressed(final int llllllllllllIlllIIlIIIIlIIlIIIII) {
    }
    
    public void controllerLeftReleased(final int llllllllllllIlllIIlIIIIlIIlIIIlI) {
    }
    
    public void mousePressed(final int llllllllllllIlllIIlIIIIlIIIIIIll, final int llllllllllllIlllIIlIIIIlIIIIIIlI, final int llllllllllllIlllIIlIIIIlIIIIIIIl) {
    }
    
    public InputAdapter() {
        this.acceptingInput = (InputAdapter.llIIlIlIIIlIIl[0] != 0);
    }
    
    public void inputEnded() {
    }
    
    public void controllerDownPressed(final int llllllllllllIlllIIlIIIIlIIlIlIII) {
    }
    
    public void mouseClicked(final int llllllllllllIlllIIlIIIIIllllIlll, final int llllllllllllIlllIIlIIIIIllllIllI, final int llllllllllllIlllIIlIIIIIllllIlIl, final int llllllllllllIlllIIlIIIIIllllIlII) {
    }
    
    public void controllerUpReleased(final int llllllllllllIlllIIlIIIIlIIIllIlI) {
    }
    
    static {
        lIIIllIIllIllIlI();
    }
    
    public void controllerLeftPressed(final int llllllllllllIlllIIlIIIIlIIlIIlII) {
    }
    
    public boolean isAcceptingInput() {
        return this.acceptingInput;
    }
    
    public void setInput(final Input llllllllllllIlllIIlIIIIIlllllIIl) {
    }
    
    public void mouseMoved(final int llllllllllllIlllIIlIIIIlIIIIlIII, final int llllllllllllIlllIIlIIIIlIIIIIlll, final int llllllllllllIlllIIlIIIIlIIIIIllI, final int llllllllllllIlllIIlIIIIlIIIIIlIl) {
    }
    
    private static void lIIIllIIllIllIlI() {
        (llIIlIlIIIlIIl = new int[1])[0] = " ".length();
    }
    
    public void controllerUpPressed(final int llllllllllllIlllIIlIIIIlIIIlllII) {
    }
    
    public void keyReleased(final int llllllllllllIlllIIlIIIIlIIIIlIll, final char llllllllllllIlllIIlIIIIlIIIIlIlI) {
    }
    
    public void controllerRightReleased(final int llllllllllllIlllIIlIIIIlIIIllllI) {
    }
    
    public void mouseWheelMoved(final int llllllllllllIlllIIlIIIIIlllllIll) {
    }
    
    public void controllerDownReleased(final int llllllllllllIlllIIlIIIIlIIlIIllI) {
    }
    
    public void keyPressed(final int llllllllllllIlllIIlIIIIlIIIIlllI, final char llllllllllllIlllIIlIIIIlIIIIllIl) {
    }
    
    public void controllerButtonPressed(final int llllllllllllIlllIIlIIIIlIIlIlllI, final int llllllllllllIlllIIlIIIIlIIlIllIl) {
    }
    
    public void inputStarted() {
    }
    
    public void controllerButtonReleased(final int llllllllllllIlllIIlIIIIlIIlIlIll, final int llllllllllllIlllIIlIIIIlIIlIlIlI) {
    }
    
    public void mouseDragged(final int llllllllllllIlllIIlIIIIIllllIIlI, final int llllllllllllIlllIIlIIIIIllllIIIl, final int llllllllllllIlllIIlIIIIIllllIIII, final int llllllllllllIlllIIlIIIIIlllIllll) {
    }
    
    public void setAcceptingInput(final boolean llllllllllllIlllIIlIIIIlIIIlIIII) {
        this.acceptingInput = llllllllllllIlllIIlIIIIlIIIlIIII;
    }
    
    public void mouseReleased(final int llllllllllllIlllIIlIIIIIllllllll, final int llllllllllllIlllIIlIIIIIlllllllI, final int llllllllllllIlllIIlIIIIIllllllIl) {
    }
}
