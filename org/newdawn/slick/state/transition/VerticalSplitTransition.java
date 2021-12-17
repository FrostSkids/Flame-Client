// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state.transition;

import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.Color;

public class VerticalSplitTransition implements Transition
{
    private /* synthetic */ float offset;
    private /* synthetic */ Color background;
    private /* synthetic */ GameState prev;
    private /* synthetic */ boolean finish;
    protected static /* synthetic */ SGL GL;
    private static final /* synthetic */ int[] llIlIIIIIIlIIl;
    
    public void update(final StateBasedGame llllllllllllIllIllIlllIllllllllI, final GameContainer llllllllllllIllIllIlllIlllllllIl, final int llllllllllllIllIllIlllIlllllllII) throws SlickException {
        this.offset += llllllllllllIllIllIlllIlllllllII * 1.0f;
        if (lIIlIIIlIIIllIII(lIIlIIIlIIIlIlll(this.offset, (float)(llllllllllllIllIllIlllIlllllllIl.getHeight() / VerticalSplitTransition.llIlIIIIIIlIIl[1])))) {
            this.finish = (VerticalSplitTransition.llIlIIIIIIlIIl[2] != 0);
        }
    }
    
    public VerticalSplitTransition() {
    }
    
    private static void lIIlIIIlIIIlIlIl() {
        (llIlIIIIIIlIIl = new int[3])[0] = ((0xD1 ^ 0x8C) & ~(0xC6 ^ 0x9B));
        VerticalSplitTransition.llIlIIIIIIlIIl[1] = "  ".length();
        VerticalSplitTransition.llIlIIIIIIlIIl[2] = " ".length();
    }
    
    public void postRender(final StateBasedGame llllllllllllIllIllIllllIIIIIlIlI, final GameContainer llllllllllllIllIllIllllIIIIIlIIl, final Graphics llllllllllllIllIllIllllIIIIIllII) throws SlickException {
        llllllllllllIllIllIllllIIIIIllII.translate(0.0f, -this.offset);
        llllllllllllIllIllIllllIIIIIllII.setClip(VerticalSplitTransition.llIlIIIIIIlIIl[0], (int)(-this.offset), llllllllllllIllIllIllllIIIIIlIIl.getWidth(), llllllllllllIllIllIllllIIIIIlIIl.getHeight() / VerticalSplitTransition.llIlIIIIIIlIIl[1]);
        if (lIIlIIIlIIIlIllI(this.background)) {
            final Color llllllllllllIllIllIllllIIIIlIIIl = llllllllllllIllIllIllllIIIIIllII.getColor();
            llllllllllllIllIllIllllIIIIIllII.setColor(this.background);
            llllllllllllIllIllIllllIIIIIllII.fillRect(0.0f, 0.0f, (float)llllllllllllIllIllIllllIIIIIlIIl.getWidth(), (float)llllllllllllIllIllIllllIIIIIlIIl.getHeight());
            llllllllllllIllIllIllllIIIIIllII.setColor(llllllllllllIllIllIllllIIIIlIIIl);
        }
        VerticalSplitTransition.GL.glPushMatrix();
        this.prev.render(llllllllllllIllIllIllllIIIIIlIIl, llllllllllllIllIllIllllIIIIIlIlI, llllllllllllIllIllIllllIIIIIllII);
        VerticalSplitTransition.GL.glPopMatrix();
        llllllllllllIllIllIllllIIIIIllII.clearClip();
        llllllllllllIllIllIllllIIIIIllII.resetTransform();
        llllllllllllIllIllIllllIIIIIllII.translate(0.0f, this.offset);
        llllllllllllIllIllIllllIIIIIllII.setClip(VerticalSplitTransition.llIlIIIIIIlIIl[0], (int)(llllllllllllIllIllIllllIIIIIlIIl.getHeight() / VerticalSplitTransition.llIlIIIIIIlIIl[1] + this.offset), llllllllllllIllIllIllllIIIIIlIIl.getWidth(), llllllllllllIllIllIllllIIIIIlIIl.getHeight() / VerticalSplitTransition.llIlIIIIIIlIIl[1]);
        if (lIIlIIIlIIIlIllI(this.background)) {
            final Color llllllllllllIllIllIllllIIIIlIIII = llllllllllllIllIllIllllIIIIIllII.getColor();
            llllllllllllIllIllIllllIIIIIllII.setColor(this.background);
            llllllllllllIllIllIllllIIIIIllII.fillRect(0.0f, 0.0f, (float)llllllllllllIllIllIllllIIIIIlIIl.getWidth(), (float)llllllllllllIllIllIllllIIIIIlIIl.getHeight());
            llllllllllllIllIllIllllIIIIIllII.setColor(llllllllllllIllIllIllllIIIIlIIII);
        }
        VerticalSplitTransition.GL.glPushMatrix();
        this.prev.render(llllllllllllIllIllIllllIIIIIlIIl, llllllllllllIllIllIllllIIIIIlIlI, llllllllllllIllIllIllllIIIIIllII);
        VerticalSplitTransition.GL.glPopMatrix();
        llllllllllllIllIllIllllIIIIIllII.clearClip();
        llllllllllllIllIllIllllIIIIIllII.translate(0.0f, -this.offset);
    }
    
    public boolean isComplete() {
        return this.finish;
    }
    
    private static int lIIlIIIlIIIlIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIlIIIlIIIllIII(final int llllllllllllIllIllIlllIlllllIlIl) {
        return llllllllllllIllIllIlllIlllllIlIl > 0;
    }
    
    private static boolean lIIlIIIlIIIlIllI(final Object llllllllllllIllIllIlllIlllllIlll) {
        return llllllllllllIllIllIlllIlllllIlll != null;
    }
    
    public VerticalSplitTransition(final Color llllllllllllIllIllIllllIIIlIIIll) {
        this.background = llllllllllllIllIllIllllIIIlIIIll;
    }
    
    static {
        lIIlIIIlIIIlIlIl();
        VerticalSplitTransition.GL = Renderer.get();
    }
    
    public void init(final GameState llllllllllllIllIllIllllIIIIlllIl, final GameState llllllllllllIllIllIllllIIIIlllII) {
        this.prev = llllllllllllIllIllIllllIIIIlllII;
    }
    
    public void preRender(final StateBasedGame llllllllllllIllIllIllllIIIIIIlIl, final GameContainer llllllllllllIllIllIllllIIIIIIlII, final Graphics llllllllllllIllIllIllllIIIIIIIll) throws SlickException {
    }
}
