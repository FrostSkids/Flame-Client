// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state.transition;

import org.newdawn.slick.state.GameState;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Color;

public class FadeInTransition implements Transition
{
    private static final /* synthetic */ int[] llllIlIIllIII;
    private /* synthetic */ int fadeTime;
    private /* synthetic */ Color color;
    
    public void update(final StateBasedGame lllllllllllllIlIllIllIllIlIIIIlI, final GameContainer lllllllllllllIlIllIllIllIlIIIIIl, final int lllllllllllllIlIllIllIllIIlllllI) {
        final Color color = this.color;
        color.a -= lllllllllllllIlIllIllIllIIlllllI * (1.0f / this.fadeTime);
        if (lIlIlIlIIIlIIII(lIlIlIlIIIIllll(this.color.a, 0.0f))) {
            this.color.a = 0.0f;
        }
    }
    
    private static void lIlIlIlIIIIllII() {
        (llllIlIIllIII = new int[4])[0] = (-(0xFFFFC65F & 0x3DAB) & (0xFFFFCFFF & 0x35FE));
        FadeInTransition.llllIlIIllIII[1] = " ".length();
        FadeInTransition.llllIlIIllIII[2] = ((0x84 ^ 0xC5) & ~(0xE7 ^ 0xA6));
        FadeInTransition.llllIlIIllIII[3] = "  ".length();
    }
    
    public void preRender(final StateBasedGame lllllllllllllIlIllIllIllIIllllII, final GameContainer lllllllllllllIlIllIllIllIIlllIll, final Graphics lllllllllllllIlIllIllIllIIlllIlI) {
    }
    
    private static boolean lIlIlIlIIIlIIII(final int lllllllllllllIlIllIllIllIIllIlIl) {
        return lllllllllllllIlIllIllIllIIllIlIl < 0;
    }
    
    static {
        lIlIlIlIIIIllII();
    }
    
    public FadeInTransition(final Color lllllllllllllIlIllIllIllIlIllIlI, final int lllllllllllllIlIllIllIllIlIllIIl) {
        this.fadeTime = FadeInTransition.llllIlIIllIII[0];
        this.color = new Color(lllllllllllllIlIllIllIllIlIllIlI);
        this.color.a = 1.0f;
        this.fadeTime = lllllllllllllIlIllIllIllIlIllIIl;
    }
    
    public FadeInTransition(final Color lllllllllllllIlIllIllIllIlIlllll) {
        this(lllllllllllllIlIllIllIllIlIlllll, FadeInTransition.llllIlIIllIII[0]);
    }
    
    public boolean isComplete() {
        int n;
        if (lIlIlIlIIIIlllI(lIlIlIlIIIIllIl(this.color.a, 0.0f))) {
            n = FadeInTransition.llllIlIIllIII[1];
            "".length();
            if (null != null) {
                return ((0x3 ^ 0x57 ^ " ".length()) & (3 + 60 - 21 + 165 ^ 1 + 119 - 23 + 57 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = FadeInTransition.llllIlIIllIII[2];
        }
        return n != 0;
    }
    
    private static int lIlIlIlIIIIllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void postRender(final StateBasedGame lllllllllllllIlIllIllIllIlIIllIl, final GameContainer lllllllllllllIlIllIllIllIlIIllII, final Graphics lllllllllllllIlIllIllIllIlIIIlll) {
        final Color lllllllllllllIlIllIllIllIlIIlIlI = lllllllllllllIlIllIllIllIlIIIlll.getColor();
        lllllllllllllIlIllIllIllIlIIIlll.setColor(this.color);
        lllllllllllllIlIllIllIllIlIIIlll.fillRect(0.0f, 0.0f, (float)(lllllllllllllIlIllIllIllIlIIllII.getWidth() * FadeInTransition.llllIlIIllIII[3]), (float)(lllllllllllllIlIllIllIllIlIIllII.getHeight() * FadeInTransition.llllIlIIllIII[3]));
        lllllllllllllIlIllIllIllIlIIIlll.setColor(lllllllllllllIlIllIllIllIlIIlIlI);
    }
    
    private static boolean lIlIlIlIIIIlllI(final int lllllllllllllIlIllIllIllIIllIIll) {
        return lllllllllllllIlIllIllIllIIllIIll <= 0;
    }
    
    public FadeInTransition() {
        this(Color.black, FadeInTransition.llllIlIIllIII[0]);
    }
    
    private static int lIlIlIlIIIIllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void init(final GameState lllllllllllllIlIllIllIllIIlllIII, final GameState lllllllllllllIlIllIllIllIIllIlll) {
    }
}
