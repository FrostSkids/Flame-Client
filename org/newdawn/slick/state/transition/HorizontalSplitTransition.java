// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state.transition;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.state.GameState;
import org.newdawn.slick.Color;

public class HorizontalSplitTransition implements Transition
{
    private static final /* synthetic */ int[] lIlllIIlIIIIII;
    private /* synthetic */ boolean finish;
    private /* synthetic */ float offset;
    private /* synthetic */ Color background;
    private /* synthetic */ GameState prev;
    protected static /* synthetic */ SGL GL;
    
    public boolean isComplete() {
        return this.finish;
    }
    
    private static boolean lIIIIIIllIIllIIl(final int llllllllllllIlllllIlIIllIlIllllI) {
        return llllllllllllIlllllIlIIllIlIllllI > 0;
    }
    
    private static int lIIIIIIllIIllIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        lIIIIIIllIIlIllI();
        HorizontalSplitTransition.GL = Renderer.get();
    }
    
    private static void lIIIIIIllIIlIllI() {
        (lIlllIIlIIIIII = new int[3])[0] = ((0x95 ^ 0xB3) & ~(0x16 ^ 0x30));
        HorizontalSplitTransition.lIlllIIlIIIIII[1] = "  ".length();
        HorizontalSplitTransition.lIlllIIlIIIIII[2] = " ".length();
    }
    
    public HorizontalSplitTransition(final Color llllllllllllIlllllIlIIlllIIIlIlI) {
        this.background = llllllllllllIlllllIlIIlllIIIlIlI;
    }
    
    public HorizontalSplitTransition() {
    }
    
    public void postRender(final StateBasedGame llllllllllllIlllllIlIIllIlllIIll, final GameContainer llllllllllllIlllllIlIIllIlllIIlI, final Graphics llllllllllllIlllllIlIIllIlllIIIl) throws SlickException {
        llllllllllllIlllllIlIIllIlllIIIl.translate(-this.offset, 0.0f);
        llllllllllllIlllllIlIIllIlllIIIl.setClip((int)(-this.offset), HorizontalSplitTransition.lIlllIIlIIIIII[0], llllllllllllIlllllIlIIllIlllIIlI.getWidth() / HorizontalSplitTransition.lIlllIIlIIIIII[1], llllllllllllIlllllIlIIllIlllIIlI.getHeight());
        if (lIIIIIIllIIlIlll(this.background)) {
            final Color llllllllllllIlllllIlIIllIllllIlI = llllllllllllIlllllIlIIllIlllIIIl.getColor();
            llllllllllllIlllllIlIIllIlllIIIl.setColor(this.background);
            llllllllllllIlllllIlIIllIlllIIIl.fillRect(0.0f, 0.0f, (float)llllllllllllIlllllIlIIllIlllIIlI.getWidth(), (float)llllllllllllIlllllIlIIllIlllIIlI.getHeight());
            llllllllllllIlllllIlIIllIlllIIIl.setColor(llllllllllllIlllllIlIIllIllllIlI);
        }
        HorizontalSplitTransition.GL.glPushMatrix();
        this.prev.render(llllllllllllIlllllIlIIllIlllIIlI, llllllllllllIlllllIlIIllIlllIIll, llllllllllllIlllllIlIIllIlllIIIl);
        HorizontalSplitTransition.GL.glPopMatrix();
        llllllllllllIlllllIlIIllIlllIIIl.clearClip();
        llllllllllllIlllllIlIIllIlllIIIl.translate(this.offset * 2.0f, 0.0f);
        llllllllllllIlllllIlIIllIlllIIIl.setClip((int)(llllllllllllIlllllIlIIllIlllIIlI.getWidth() / HorizontalSplitTransition.lIlllIIlIIIIII[1] + this.offset), HorizontalSplitTransition.lIlllIIlIIIIII[0], llllllllllllIlllllIlIIllIlllIIlI.getWidth() / HorizontalSplitTransition.lIlllIIlIIIIII[1], llllllllllllIlllllIlIIllIlllIIlI.getHeight());
        if (lIIIIIIllIIlIlll(this.background)) {
            final Color llllllllllllIlllllIlIIllIllllIIl = llllllllllllIlllllIlIIllIlllIIIl.getColor();
            llllllllllllIlllllIlIIllIlllIIIl.setColor(this.background);
            llllllllllllIlllllIlIIllIlllIIIl.fillRect(0.0f, 0.0f, (float)llllllllllllIlllllIlIIllIlllIIlI.getWidth(), (float)llllllllllllIlllllIlIIllIlllIIlI.getHeight());
            llllllllllllIlllllIlIIllIlllIIIl.setColor(llllllllllllIlllllIlIIllIllllIIl);
        }
        HorizontalSplitTransition.GL.glPushMatrix();
        this.prev.render(llllllllllllIlllllIlIIllIlllIIlI, llllllllllllIlllllIlIIllIlllIIll, llllllllllllIlllllIlIIllIlllIIIl);
        HorizontalSplitTransition.GL.glPopMatrix();
        llllllllllllIlllllIlIIllIlllIIIl.clearClip();
        llllllllllllIlllllIlIIllIlllIIIl.translate(-this.offset, 0.0f);
    }
    
    public void init(final GameState llllllllllllIlllllIlIIlllIIIIllI, final GameState llllllllllllIlllllIlIIlllIIIIlIl) {
        this.prev = llllllllllllIlllllIlIIlllIIIIlIl;
    }
    
    public void update(final StateBasedGame llllllllllllIlllllIlIIllIllIIlll, final GameContainer llllllllllllIlllllIlIIllIllIIllI, final int llllllllllllIlllllIlIIllIllIIlIl) throws SlickException {
        this.offset += llllllllllllIlllllIlIIllIllIIlIl * 1.0f;
        if (lIIIIIIllIIllIIl(lIIIIIIllIIllIII(this.offset, (float)(llllllllllllIlllllIlIIllIllIIllI.getWidth() / HorizontalSplitTransition.lIlllIIlIIIIII[1])))) {
            this.finish = (HorizontalSplitTransition.lIlllIIlIIIIII[2] != 0);
        }
    }
    
    private static boolean lIIIIIIllIIlIlll(final Object llllllllllllIlllllIlIIllIllIIIII) {
        return llllllllllllIlllllIlIIllIllIIIII != null;
    }
    
    public void preRender(final StateBasedGame llllllllllllIlllllIlIIllIllIlllI, final GameContainer llllllllllllIlllllIlIIllIllIllIl, final Graphics llllllllllllIlllllIlIIllIllIllII) throws SlickException {
    }
}
