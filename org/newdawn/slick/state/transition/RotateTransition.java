// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state.transition;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.state.GameState;

public class RotateTransition implements Transition
{
    private /* synthetic */ GameState prev;
    private static final /* synthetic */ int[] lIIlIlIllIllII;
    private /* synthetic */ Color background;
    private /* synthetic */ float scale;
    private /* synthetic */ boolean finish;
    private /* synthetic */ float ang;
    
    public void postRender(final StateBasedGame lllllllllllllIIllIIllIlIllIIIIII, final GameContainer lllllllllllllIIllIIllIlIlIlllIll, final Graphics lllllllllllllIIllIIllIlIlIlllllI) throws SlickException {
        lllllllllllllIIllIIllIlIlIlllllI.translate((float)(lllllllllllllIIllIIllIlIlIlllIll.getWidth() / RotateTransition.lIIlIlIllIllII[0]), (float)(lllllllllllllIIllIIllIlIlIlllIll.getHeight() / RotateTransition.lIIlIlIllIllII[0]));
        lllllllllllllIIllIIllIlIlIlllllI.scale(this.scale, this.scale);
        lllllllllllllIIllIIllIlIlIlllllI.rotate(0.0f, 0.0f, this.ang);
        lllllllllllllIIllIIllIlIlIlllllI.translate((float)(-lllllllllllllIIllIIllIlIlIlllIll.getWidth() / RotateTransition.lIIlIlIllIllII[0]), (float)(-lllllllllllllIIllIIllIlIlIlllIll.getHeight() / RotateTransition.lIIlIlIllIllII[0]));
        if (llIlIIIlIIllIIl(this.background)) {
            final Color lllllllllllllIIllIIllIlIllIIIIlI = lllllllllllllIIllIIllIlIlIlllllI.getColor();
            lllllllllllllIIllIIllIlIlIlllllI.setColor(this.background);
            lllllllllllllIIllIIllIlIlIlllllI.fillRect(0.0f, 0.0f, (float)lllllllllllllIIllIIllIlIlIlllIll.getWidth(), (float)lllllllllllllIIllIIllIlIlIlllIll.getHeight());
            lllllllllllllIIllIIllIlIlIlllllI.setColor(lllllllllllllIIllIIllIlIllIIIIlI);
        }
        this.prev.render(lllllllllllllIIllIIllIlIlIlllIll, lllllllllllllIIllIIllIlIllIIIIII, lllllllllllllIIllIIllIlIlIlllllI);
        lllllllllllllIIllIIllIlIlIlllllI.translate((float)(lllllllllllllIIllIIllIlIlIlllIll.getWidth() / RotateTransition.lIIlIlIllIllII[0]), (float)(lllllllllllllIIllIIllIlIlIlllIll.getHeight() / RotateTransition.lIIlIlIllIllII[0]));
        lllllllllllllIIllIIllIlIlIlllllI.rotate(0.0f, 0.0f, -this.ang);
        lllllllllllllIIllIIllIlIlIlllllI.scale(1.0f / this.scale, 1.0f / this.scale);
        lllllllllllllIIllIIllIlIlIlllllI.translate((float)(-lllllllllllllIIllIIllIlIlIlllIll.getWidth() / RotateTransition.lIIlIlIllIllII[0]), (float)(-lllllllllllllIIllIIllIlIlIlllIll.getHeight() / RotateTransition.lIIlIlIllIllII[0]));
    }
    
    public RotateTransition(final Color lllllllllllllIIllIIllIlIllIlIIlI) {
        this.scale = 1.0f;
        this.background = lllllllllllllIIllIIllIlIllIlIIlI;
    }
    
    static {
        llIlIIIlIIllIII();
    }
    
    private static boolean llIlIIIlIIllIIl(final Object lllllllllllllIIllIIllIlIlIlIlIll) {
        return lllllllllllllIIllIIllIlIlIlIlIll != null;
    }
    
    private static int llIlIIIlIIllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int llIlIIIlIIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIlIIIlIIlllIl(final int lllllllllllllIIllIIllIlIlIlIlIIl) {
        return lllllllllllllIIllIIllIlIlIlIlIIl < 0;
    }
    
    private static void llIlIIIlIIllIII() {
        (lIIlIlIllIllII = new int[2])[0] = "  ".length();
        RotateTransition.lIIlIlIllIllII[1] = " ".length();
    }
    
    private static boolean llIlIIIlIIlllII(final int lllllllllllllIIllIIllIlIlIlIIlll) {
        return lllllllllllllIIllIIllIlIlIlIIlll > 0;
    }
    
    public void update(final StateBasedGame lllllllllllllIIllIIllIlIlIllIIIl, final GameContainer lllllllllllllIIllIIllIlIlIllIIII, final int lllllllllllllIIllIIllIlIlIlIllll) throws SlickException {
        this.ang += lllllllllllllIIllIIllIlIlIlIllll * 0.5f;
        if (llIlIIIlIIlllII(llIlIIIlIIllIlI(this.ang, 500.0f))) {
            this.finish = (RotateTransition.lIIlIlIllIllII[1] != 0);
        }
        this.scale -= lllllllllllllIIllIIllIlIlIlIllll * 0.001f;
        if (llIlIIIlIIlllIl(llIlIIIlIIllIll(this.scale, 0.0f))) {
            this.scale = 0.0f;
        }
    }
    
    public void preRender(final StateBasedGame lllllllllllllIIllIIllIlIlIllIlll, final GameContainer lllllllllllllIIllIIllIlIlIllIllI, final Graphics lllllllllllllIIllIIllIlIlIllIlIl) throws SlickException {
    }
    
    public boolean isComplete() {
        return this.finish;
    }
    
    public RotateTransition() {
        this.scale = 1.0f;
    }
    
    public void init(final GameState lllllllllllllIIllIIllIlIllIIlllI, final GameState lllllllllllllIIllIIllIlIllIIllIl) {
        this.prev = lllllllllllllIIllIIllIlIllIIllIl;
    }
}
