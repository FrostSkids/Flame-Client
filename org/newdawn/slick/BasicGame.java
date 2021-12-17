// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

public abstract class BasicGame implements InputListener, Game
{
    private /* synthetic */ String title;
    protected /* synthetic */ boolean[] controllerUp;
    protected /* synthetic */ boolean[][] controllerButton;
    protected /* synthetic */ boolean[] controllerDown;
    private static final /* synthetic */ int[] llllIIIIlIIII;
    protected /* synthetic */ boolean[] controllerRight;
    protected /* synthetic */ boolean[] controllerLeft;
    
    public String getTitle() {
        return this.title;
    }
    
    public void mouseMoved(final int lllllllllllllIlIllllIlIlIlIllIII, final int lllllllllllllIlIllllIlIlIlIlIlll, final int lllllllllllllIlIllllIlIlIlIlIllI, final int lllllllllllllIlIllllIlIlIlIlIlIl) {
    }
    
    public BasicGame(final String lllllllllllllIlIllllIlIlIllIlIII) {
        this.controllerLeft = new boolean[BasicGame.llllIIIIlIIII[0]];
        this.controllerRight = new boolean[BasicGame.llllIIIIlIIII[0]];
        this.controllerUp = new boolean[BasicGame.llllIIIIlIIII[0]];
        this.controllerDown = new boolean[BasicGame.llllIIIIlIIII[0]];
        this.controllerButton = new boolean[BasicGame.llllIIIIlIIII[0]][BasicGame.llllIIIIlIIII[1]];
        this.title = lllllllllllllIlIllllIlIlIllIlIII;
    }
    
    public boolean isAcceptingInput() {
        return BasicGame.llllIIIIlIIII[2] != 0;
    }
    
    public void controllerRightReleased(final int lllllllllllllIlIllllIlIlIIIlIIll) {
        this.controllerRight[lllllllllllllIlIllllIlIlIIIlIIll] = (BasicGame.llllIIIIlIIII[3] != 0);
    }
    
    public void controllerDownReleased(final int lllllllllllllIlIllllIlIlIIlIlIll) {
        this.controllerDown[lllllllllllllIlIllllIlIlIIlIlIll] = (BasicGame.llllIIIIlIIII[3] != 0);
    }
    
    public boolean closeRequested() {
        return BasicGame.llllIIIIlIIII[2] != 0;
    }
    
    public void controllerButtonPressed(final int lllllllllllllIlIllllIlIlIlIIIIlI, final int lllllllllllllIlIllllIlIlIlIIIIIl) {
        this.controllerButton[lllllllllllllIlIllllIlIlIlIIIIlI][lllllllllllllIlIllllIlIlIlIIIIIl] = (BasicGame.llllIIIIlIIII[2] != 0);
    }
    
    public void inputEnded() {
    }
    
    private static void lIlIIlllIIIlIII() {
        (llllIIIIlIIII = new int[4])[0] = (0x67 ^ 0x21 ^ (0xCC ^ 0x9E));
        BasicGame.llllIIIIlIIII[1] = (138 + 119 - 125 + 64 ^ 23 + 57 - 71 + 151);
        BasicGame.llllIIIIlIIII[2] = " ".length();
        BasicGame.llllIIIIlIIII[3] = ((90 + 137 - 70 + 90 ^ 140 + 161 - 247 + 129) & (0x36 ^ 0x5F ^ (0x6B ^ 0x42) ^ -" ".length()));
    }
    
    public void mouseReleased(final int lllllllllllllIlIllllIlIlIIIIIIll, final int lllllllllllllIlIllllIlIlIIIIIIlI, final int lllllllllllllIlIllllIlIlIIIIIIIl) {
    }
    
    public void setInput(final Input lllllllllllllIlIllllIlIlIllIIlII) {
    }
    
    public void mouseDragged(final int lllllllllllllIlIllllIlIlIlIlIIll, final int lllllllllllllIlIllllIlIlIlIlIIlI, final int lllllllllllllIlIllllIlIlIlIlIIIl, final int lllllllllllllIlIllllIlIlIlIlIIII) {
    }
    
    public void controllerLeftPressed(final int lllllllllllllIlIllllIlIlIIlIIlIl) {
        this.controllerLeft[lllllllllllllIlIllllIlIlIIlIIlIl] = (BasicGame.llllIIIIlIIII[2] != 0);
    }
    
    public void controllerDownPressed(final int lllllllllllllIlIllllIlIlIIllIIIl) {
        this.controllerDown[lllllllllllllIlIllllIlIlIIllIIIl] = (BasicGame.llllIIIIlIIII[2] != 0);
    }
    
    public abstract void init(final GameContainer p0) throws SlickException;
    
    public void controllerUpReleased(final int lllllllllllllIlIllllIlIlIIIIIlll) {
        this.controllerUp[lllllllllllllIlIllllIlIlIIIIIlll] = (BasicGame.llllIIIIlIIII[3] != 0);
    }
    
    static {
        lIlIIlllIIIlIII();
        MAX_CONTROLLERS = BasicGame.llllIIIIlIIII[0];
        MAX_CONTROLLER_BUTTONS = BasicGame.llllIIIIlIIII[1];
    }
    
    public void controllerLeftReleased(final int lllllllllllllIlIllllIlIlIIIlllll) {
        this.controllerLeft[lllllllllllllIlIllllIlIlIIIlllll] = (BasicGame.llllIIIIlIIII[3] != 0);
    }
    
    public void mousePressed(final int lllllllllllllIlIllllIlIlIlIIlIIl, final int lllllllllllllIlIllllIlIlIlIIlIII, final int lllllllllllllIlIllllIlIlIlIIIlll) {
    }
    
    public void controllerUpPressed(final int lllllllllllllIlIllllIlIlIIIIllIl) {
        this.controllerUp[lllllllllllllIlIllllIlIlIIIIllIl] = (BasicGame.llllIIIIlIIII[2] != 0);
    }
    
    public void controllerButtonReleased(final int lllllllllllllIlIllllIlIlIIllIllI, final int lllllllllllllIlIllllIlIlIIllIlIl) {
        this.controllerButton[lllllllllllllIlIllllIlIlIIllIllI][lllllllllllllIlIllllIlIlIIllIlIl] = (BasicGame.llllIIIIlIIII[3] != 0);
    }
    
    public void mouseWheelMoved(final int lllllllllllllIlIllllIlIIllllllll) {
    }
    
    public void controllerRightPressed(final int lllllllllllllIlIllllIlIlIIIllIIl) {
        this.controllerRight[lllllllllllllIlIllllIlIlIIIllIIl] = (BasicGame.llllIIIIlIIII[2] != 0);
    }
    
    public void keyPressed(final int lllllllllllllIlIllllIlIlIlIllllI, final char lllllllllllllIlIllllIlIlIlIlllIl) {
    }
    
    public void mouseClicked(final int lllllllllllllIlIllllIlIlIlIIlllI, final int lllllllllllllIlIllllIlIlIlIIllIl, final int lllllllllllllIlIllllIlIlIlIIllII, final int lllllllllllllIlIllllIlIlIlIIlIll) {
    }
    
    public void inputStarted() {
    }
    
    public abstract void update(final GameContainer p0, final int p1) throws SlickException;
    
    public void keyReleased(final int lllllllllllllIlIllllIlIlIlIllIll, final char lllllllllllllIlIllllIlIlIlIllIlI) {
    }
}
