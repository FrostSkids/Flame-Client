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

public class SelectTransition implements Transition
{
    private /* synthetic */ boolean finish;
    private static final /* synthetic */ int[] llIIIIlIlIllII;
    private /* synthetic */ float scale1;
    private /* synthetic */ float scale2;
    private /* synthetic */ Color background;
    private /* synthetic */ float yp1;
    private /* synthetic */ GameState prev;
    protected static /* synthetic */ SGL GL;
    private /* synthetic */ float yp2;
    private /* synthetic */ boolean moveBackDone;
    private /* synthetic */ int pause;
    private /* synthetic */ float xp1;
    private /* synthetic */ float xp2;
    private /* synthetic */ boolean init;
    
    private static boolean lIIIIllllllIlIll(final int llllllllllllIlllIllIlllIlllIIlll) {
        return llllllllllllIlllIllIlllIlllIIlll <= 0;
    }
    
    public SelectTransition(final Color llllllllllllIlllIllIllllIIIlllIl) {
        this.scale1 = 1.0f;
        this.xp1 = 0.0f;
        this.yp1 = 0.0f;
        this.scale2 = 0.4f;
        this.xp2 = 0.0f;
        this.yp2 = 0.0f;
        this.init = (SelectTransition.llIIIIlIlIllII[0] != 0);
        this.moveBackDone = (SelectTransition.llIIIIlIlIllII[0] != 0);
        this.pause = SelectTransition.llIIIIlIlIllII[1];
        this.background = llllllllllllIlllIllIllllIIIlllIl;
    }
    
    private static int lIIIIllllllIlIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static void lIIIIllllllIIIll() {
        (llIIIIlIlIllII = new int[6])[0] = ((0x20 ^ 0x3C) & ~(0x59 ^ 0x45) & ~((0x34 ^ 0x38) & ~(0x4F ^ 0x43)));
        SelectTransition.llIIIIlIlIllII[1] = (-(0xFFFFC7B5 & 0x7CDB) & (0xFFFFDDBE & 0x67FD));
        SelectTransition.llIIIIlIlIllII[2] = " ".length();
        SelectTransition.llIIIIlIlIllII[3] = "  ".length();
        SelectTransition.llIIIIlIlIllII[4] = (0xF0 ^ 0xC2);
        SelectTransition.llIIIIlIlIllII[5] = (0x59 ^ 0x5D);
    }
    
    private static boolean lIIIIllllllIIlII(final int llllllllllllIlllIllIlllIlllIllIl) {
        return llllllllllllIlllIllIlllIlllIllIl == 0;
    }
    
    public void update(final StateBasedGame llllllllllllIlllIllIlllIllllIllI, final GameContainer llllllllllllIlllIllIlllIllllIIlI, final int llllllllllllIlllIllIlllIllllIlII) throws SlickException {
        if (lIIIIllllllIIlII(this.init ? 1 : 0)) {
            this.init = (SelectTransition.llIIIIlIlIllII[2] != 0);
            this.xp2 = (float)(llllllllllllIlllIllIlllIllllIIlI.getWidth() / SelectTransition.llIIIIlIlIllII[3] + SelectTransition.llIIIIlIlIllII[4]);
            this.yp2 = (float)(llllllllllllIlllIllIlllIllllIIlI.getHeight() / SelectTransition.llIIIIlIlIllII[5]);
        }
        if (lIIIIllllllIIlII(this.moveBackDone ? 1 : 0)) {
            if (lIIIIllllllIlIlI(lIIIIllllllIlIII(this.scale1, 0.4f))) {
                this.scale1 -= llllllllllllIlllIllIlllIllllIlII * 0.002f;
                if (lIIIIllllllIlIll(lIIIIllllllIlIIl(this.scale1, 0.4f))) {
                    this.scale1 = 0.4f;
                }
                this.xp1 += llllllllllllIlllIllIlllIllllIlII * 0.3f;
                if (lIIIIllllllIlIlI(lIIIIllllllIlIII(this.xp1, 50.0f))) {
                    this.xp1 = 50.0f;
                }
                this.yp1 += llllllllllllIlllIllIlllIllllIlII * 0.5f;
                if (lIIIIllllllIlIlI(lIIIIllllllIlIII(this.yp1, (float)(llllllllllllIlllIllIlllIllllIIlI.getHeight() / SelectTransition.llIIIIlIlIllII[5])))) {
                    this.yp1 = (float)(llllllllllllIlllIllIlllIllllIIlI.getHeight() / SelectTransition.llIIIIlIlIllII[5]);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
            }
            else {
                this.moveBackDone = (SelectTransition.llIIIIlIlIllII[2] != 0);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
        }
        else {
            this.pause -= llllllllllllIlllIllIlllIllllIlII;
            if (lIIIIllllllIlIlI(this.pause)) {
                return;
            }
            if (lIIIIllllllIllII(lIIIIllllllIlIIl(this.scale2, 1.0f))) {
                this.scale2 += llllllllllllIlllIllIlllIllllIlII * 0.002f;
                if (lIIIIllllllIllIl(lIIIIllllllIlIII(this.scale2, 1.0f))) {
                    this.scale2 = 1.0f;
                }
                this.xp2 -= llllllllllllIlllIllIlllIllllIlII * 1.5f;
                if (lIIIIllllllIllII(lIIIIllllllIlIIl(this.xp2, 0.0f))) {
                    this.xp2 = 0.0f;
                }
                this.yp2 -= llllllllllllIlllIllIlllIllllIlII * 0.5f;
                if (lIIIIllllllIllII(lIIIIllllllIlIIl(this.yp2, 0.0f))) {
                    this.yp2 = 0.0f;
                    "".length();
                    if ("   ".length() == "  ".length()) {
                        return;
                    }
                }
            }
            else {
                this.finish = (SelectTransition.llIIIIlIlIllII[2] != 0);
            }
        }
    }
    
    public void init(final GameState llllllllllllIlllIllIllllIIIllIIl, final GameState llllllllllllIlllIllIllllIIIllIII) {
        this.prev = llllllllllllIlllIllIllllIIIllIII;
    }
    
    public void postRender(final StateBasedGame llllllllllllIlllIllIllllIIIIlIIl, final GameContainer llllllllllllIlllIllIllllIIIIlIII, final Graphics llllllllllllIlllIllIllllIIIIlIll) throws SlickException {
        llllllllllllIlllIllIllllIIIIlIll.resetTransform();
        if (lIIIIllllllIIlII(this.moveBackDone ? 1 : 0)) {
            llllllllllllIlllIllIllllIIIIlIll.translate(this.xp1, this.yp1);
            llllllllllllIlllIllIllllIIIIlIll.scale(this.scale1, this.scale1);
            llllllllllllIlllIllIllllIIIIlIll.setClip((int)this.xp1, (int)this.yp1, (int)(this.scale1 * llllllllllllIlllIllIllllIIIIlIII.getWidth()), (int)(this.scale1 * llllllllllllIlllIllIllllIIIIlIII.getHeight()));
            this.prev.render(llllllllllllIlllIllIllllIIIIlIII, llllllllllllIlllIllIllllIIIIlIIl, llllllllllllIlllIllIllllIIIIlIll);
            llllllllllllIlllIllIllllIIIIlIll.resetTransform();
            llllllllllllIlllIllIllllIIIIlIll.clearClip();
        }
    }
    
    private static boolean lIIIIllllllIllIl(final int llllllllllllIlllIllIlllIlllIlIll) {
        return llllllllllllIlllIllIlllIlllIlIll >= 0;
    }
    
    static {
        lIIIIllllllIIIll();
        SelectTransition.GL = Renderer.get();
    }
    
    private static boolean lIIIIllllllIllII(final int llllllllllllIlllIllIlllIlllIlIIl) {
        return llllllllllllIlllIllIlllIlllIlIIl < 0;
    }
    
    public boolean isComplete() {
        return this.finish;
    }
    
    public void preRender(final StateBasedGame llllllllllllIlllIllIlllIllllllIl, final GameContainer llllllllllllIlllIllIlllIllllllII, final Graphics llllllllllllIlllIllIlllIllllllll) throws SlickException {
        if (lIIIIllllllIIllI(this.moveBackDone ? 1 : 0)) {
            llllllllllllIlllIllIlllIllllllll.translate(this.xp1, this.yp1);
            llllllllllllIlllIllIlllIllllllll.scale(this.scale1, this.scale1);
            llllllllllllIlllIllIlllIllllllll.setClip((int)this.xp1, (int)this.yp1, (int)(this.scale1 * llllllllllllIlllIllIlllIllllllII.getWidth()), (int)(this.scale1 * llllllllllllIlllIllIlllIllllllII.getHeight()));
            this.prev.render(llllllllllllIlllIllIlllIllllllII, llllllllllllIlllIllIlllIllllllIl, llllllllllllIlllIllIlllIllllllll);
            llllllllllllIlllIllIlllIllllllll.resetTransform();
            llllllllllllIlllIllIlllIllllllll.clearClip();
        }
        llllllllllllIlllIllIlllIllllllll.translate(this.xp2, this.yp2);
        llllllllllllIlllIllIlllIllllllll.scale(this.scale2, this.scale2);
        llllllllllllIlllIllIlllIllllllll.setClip((int)this.xp2, (int)this.yp2, (int)(this.scale2 * llllllllllllIlllIllIlllIllllllII.getWidth()), (int)(this.scale2 * llllllllllllIlllIllIlllIllllllII.getHeight()));
    }
    
    public SelectTransition() {
        this.scale1 = 1.0f;
        this.xp1 = 0.0f;
        this.yp1 = 0.0f;
        this.scale2 = 0.4f;
        this.xp2 = 0.0f;
        this.yp2 = 0.0f;
        this.init = (SelectTransition.llIIIIlIlIllII[0] != 0);
        this.moveBackDone = (SelectTransition.llIIIIlIlIllII[0] != 0);
        this.pause = SelectTransition.llIIIIlIlIllII[1];
    }
    
    private static int lIIIIllllllIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIIllllllIIllI(final int llllllllllllIlllIllIlllIlllIllll) {
        return llllllllllllIlllIllIlllIlllIllll != 0;
    }
    
    private static boolean lIIIIllllllIlIlI(final int llllllllllllIlllIllIlllIlllIIlIl) {
        return llllllllllllIlllIllIlllIlllIIlIl > 0;
    }
}
