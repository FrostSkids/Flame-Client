// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state.transition;

import org.newdawn.slick.state.GameState;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import org.newdawn.slick.Color;

public class FadeOutTransition implements Transition
{
    private /* synthetic */ Color color;
    private /* synthetic */ int fadeTime;
    private static final /* synthetic */ int[] llIIIllllIIIIl;
    
    public void postRender(final StateBasedGame llllllllllllIlllIIlllllIlIlIlIII, final GameContainer llllllllllllIlllIIlllllIlIlIIlll, final Graphics llllllllllllIlllIIlllllIlIlIIllI) {
        final Color llllllllllllIlllIIlllllIlIlIIlIl = llllllllllllIlllIIlllllIlIlIIllI.getColor();
        llllllllllllIlllIIlllllIlIlIIllI.setColor(this.color);
        llllllllllllIlllIIlllllIlIlIIllI.fillRect(0.0f, 0.0f, (float)(llllllllllllIlllIIlllllIlIlIIlll.getWidth() * FadeOutTransition.llIIIllllIIIIl[3]), (float)(llllllllllllIlllIIlllllIlIlIIlll.getHeight() * FadeOutTransition.llIIIllllIIIIl[3]));
        llllllllllllIlllIIlllllIlIlIIllI.setColor(llllllllllllIlllIIlllllIlIlIIlIl);
    }
    
    public FadeOutTransition(final Color llllllllllllIlllIIlllllIlIllIIlI, final int llllllllllllIlllIIlllllIlIllIIIl) {
        this.color = new Color(llllllllllllIlllIIlllllIlIllIIlI);
        this.color.a = 0.0f;
        this.fadeTime = llllllllllllIlllIIlllllIlIllIIIl;
    }
    
    public FadeOutTransition(final Color llllllllllllIlllIIlllllIlIllllII) {
        this(llllllllllllIlllIIlllllIlIllllII, FadeOutTransition.llIIIllllIIIIl[0]);
    }
    
    public void preRender(final StateBasedGame llllllllllllIlllIIlllllIlIIlIlll, final GameContainer llllllllllllIlllIIlllllIlIIlIllI, final Graphics llllllllllllIlllIIlllllIlIIlIlIl) {
    }
    
    static {
        lIIIlIllIIIlIIlI();
    }
    
    private static void lIIIlIllIIIlIIlI() {
        (llIIIllllIIIIl = new int[4])[0] = (0xFFFFE9FC & 0x17F7);
        FadeOutTransition.llIIIllllIIIIl[1] = " ".length();
        FadeOutTransition.llIIIllllIIIIl[2] = ((181 + 21 - 63 + 50 ^ 122 + 118 - 220 + 128) & (0x13 ^ 0x17 ^ (0xA9 ^ 0x84) ^ -" ".length()));
        FadeOutTransition.llIIIllllIIIIl[3] = "  ".length();
    }
    
    private static boolean lIIIlIllIIIlIllI(final int llllllllllllIlllIIlllllIlIIIlllI) {
        return llllllllllllIlllIIlllllIlIIIlllI > 0;
    }
    
    private static int lIIIlIllIIIlIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIlIllIIIlIlII(final int llllllllllllIlllIIlllllIlIIlIIII) {
        return llllllllllllIlllIIlllllIlIIlIIII >= 0;
    }
    
    public boolean isComplete() {
        int n;
        if (lIIIlIllIIIlIlII(lIIIlIllIIIlIIll(this.color.a, 1.0f))) {
            n = FadeOutTransition.llIIIllllIIIIl[1];
            "".length();
            if ((69 + 46 - 76 + 157 ^ 44 + 100 - 110 + 158) < ((132 + 32 - 142 + 127 ^ 38 + 172 - 45 + 15) & (0x6B ^ 0x72 ^ (0x33 ^ 0xB) ^ -" ".length()))) {
                return ((38 + 67 - 97 + 199 ^ 132 + 76 - 63 + 6) & (199 + 119 - 168 + 60 ^ 82 + 68 - 37 + 25 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = FadeOutTransition.llIIIllllIIIIl[2];
        }
        return n != 0;
    }
    
    private static int lIIIlIllIIIlIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public FadeOutTransition() {
        this(Color.black, FadeOutTransition.llIIIllllIIIIl[0]);
    }
    
    public void init(final GameState llllllllllllIlllIIlllllIlIIlIIll, final GameState llllllllllllIlllIIlllllIlIIlIIlI) {
    }
    
    public void update(final StateBasedGame llllllllllllIlllIIlllllIlIIlllIl, final GameContainer llllllllllllIlllIIlllllIlIIlllII, final int llllllllllllIlllIIlllllIlIIllIIl) {
        final Color color = this.color;
        color.a += llllllllllllIlllIIlllllIlIIllIIl * (1.0f / this.fadeTime);
        if (lIIIlIllIIIlIllI(lIIIlIllIIIlIlIl(this.color.a, 1.0f))) {
            this.color.a = 1.0f;
        }
    }
}
