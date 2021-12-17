// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.state.transition;

import org.newdawn.slick.state.GameState;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.state.StateBasedGame;
import java.util.ArrayList;

public class CombinedTransition implements Transition
{
    private static final /* synthetic */ int[] lIlIllIlIllllI;
    private /* synthetic */ ArrayList transitions;
    
    private static boolean llllIIIllllIlII(final int lllllllllllllIIIIllIlIIlIIIlIllI, final int lllllllllllllIIIIllIlIIlIIIlIlIl) {
        return lllllllllllllIIIIllIlIIlIIIlIllI < lllllllllllllIIIIllIlIIlIIIlIlIl;
    }
    
    private static boolean llllIIIllllIlIl(final int lllllllllllllIIIIllIlIIlIIIlIIll) {
        return lllllllllllllIIIIllIlIIlIIIlIIll == 0;
    }
    
    private static boolean llllIIIllllIllI(final int lllllllllllllIIIIllIlIIlIIIlIIIl) {
        return lllllllllllllIIIIllIlIIlIIIlIIIl >= 0;
    }
    
    static {
        llllIIIllllIIll();
    }
    
    public void postRender(final StateBasedGame lllllllllllllIIIIllIlIIlIlIIllIl, final GameContainer lllllllllllllIIIIllIlIIlIlIIlIII, final Graphics lllllllllllllIIIIllIlIIlIlIIIlll) throws SlickException {
        int lllllllllllllIIIIllIlIIlIlIIllll = this.transitions.size() - CombinedTransition.lIlIllIlIllllI[1];
        while (llllIIIllllIllI(lllllllllllllIIIIllIlIIlIlIIllll)) {
            this.transitions.get(lllllllllllllIIIIllIlIIlIlIIllll).postRender(lllllllllllllIIIIllIlIIlIlIIllIl, lllllllllllllIIIIllIlIIlIlIIlIII, lllllllllllllIIIIllIlIIlIlIIIlll);
            --lllllllllllllIIIIllIlIIlIlIIllll;
            "".length();
            if (("   ".length() & ~"   ".length()) != 0x0) {
                return;
            }
        }
    }
    
    public CombinedTransition() {
        this.transitions = new ArrayList();
    }
    
    public void init(final GameState lllllllllllllIIIIllIlIIlIIIllIll, final GameState lllllllllllllIIIIllIlIIlIIIllIlI) {
        int lllllllllllllIIIIllIlIIlIIlIIIII = this.transitions.size() - CombinedTransition.lIlIllIlIllllI[1];
        while (llllIIIllllIllI(lllllllllllllIIIIllIlIIlIIlIIIII)) {
            this.transitions.get(lllllllllllllIIIIllIlIIlIIlIIIII).init(lllllllllllllIIIIllIlIIlIIIllIll, lllllllllllllIIIIllIlIIlIIIllIlI);
            --lllllllllllllIIIIllIlIIlIIlIIIII;
            "".length();
            if (((0x83 ^ 0xAA ^ (0xC2 ^ 0xB0)) & (0xE0 ^ 0x9D ^ (0x2E ^ 0x8) ^ -" ".length())) > "  ".length()) {
                return;
            }
        }
    }
    
    public boolean isComplete() {
        int lllllllllllllIIIIllIlIIlIlIllIII = CombinedTransition.lIlIllIlIllllI[0];
        while (llllIIIllllIlII(lllllllllllllIIIIllIlIIlIlIllIII, this.transitions.size())) {
            if (llllIIIllllIlIl(this.transitions.get(lllllllllllllIIIIllIlIIlIlIllIII).isComplete() ? 1 : 0)) {
                return CombinedTransition.lIlIllIlIllllI[0] != 0;
            }
            ++lllllllllllllIIIIllIlIIlIlIllIII;
            "".length();
            if (((0x73 ^ 0x5B ^ (0xBC ^ 0xB3)) & (0x8E ^ 0xAA ^ "   ".length() ^ -" ".length())) != 0x0) {
                return ((0x11 ^ 0x60 ^ (0xF5 ^ 0xC3)) & (74 + 50 + 74 + 25 ^ 55 + 40 - 49 + 106 ^ -" ".length())) != 0x0;
            }
        }
        return CombinedTransition.lIlIllIlIllllI[1] != 0;
    }
    
    public void addTransition(final Transition lllllllllllllIIIIllIlIIlIlIllIll) {
        this.transitions.add(lllllllllllllIIIIllIlIIlIlIllIll);
        "".length();
    }
    
    public void update(final StateBasedGame lllllllllllllIIIIllIlIIlIIlIllIl, final GameContainer lllllllllllllIIIIllIlIIlIIlIlIII, final int lllllllllllllIIIIllIlIIlIIlIIlll) throws SlickException {
        int lllllllllllllIIIIllIlIIlIIlIllll = CombinedTransition.lIlIllIlIllllI[0];
        while (llllIIIllllIlII(lllllllllllllIIIIllIlIIlIIlIllll, this.transitions.size())) {
            final Transition lllllllllllllIIIIllIlIIlIIllIIII = this.transitions.get(lllllllllllllIIIIllIlIIlIIlIllll);
            if (llllIIIllllIlIl(lllllllllllllIIIIllIlIIlIIllIIII.isComplete() ? 1 : 0)) {
                lllllllllllllIIIIllIlIIlIIllIIII.update(lllllllllllllIIIIllIlIIlIIlIllIl, lllllllllllllIIIIllIlIIlIIlIlIII, lllllllllllllIIIIllIlIIlIIlIIlll);
            }
            ++lllllllllllllIIIIllIlIIlIIlIllll;
            "".length();
            if (((0x17 ^ 0x6A ^ (0x2D ^ 0x33)) & (144 + 36 + 30 + 21 ^ 72 + 124 - 144 + 80 ^ -" ".length())) != 0x0) {
                return;
            }
        }
    }
    
    public void preRender(final StateBasedGame lllllllllllllIIIIllIlIIlIIlllllI, final GameContainer lllllllllllllIIIIllIlIIlIIlllIIl, final Graphics lllllllllllllIIIIllIlIIlIIlllIII) throws SlickException {
        int lllllllllllllIIIIllIlIIlIlIIIIII = CombinedTransition.lIlIllIlIllllI[0];
        while (llllIIIllllIlII(lllllllllllllIIIIllIlIIlIlIIIIII, this.transitions.size())) {
            this.transitions.get(lllllllllllllIIIIllIlIIlIlIIIIII).postRender(lllllllllllllIIIIllIlIIlIIlllllI, lllllllllllllIIIIllIlIIlIIlllIIl, lllllllllllllIIIIllIlIIlIIlllIII);
            ++lllllllllllllIIIIllIlIIlIlIIIIII;
            "".length();
            if (((0x64 ^ 0x54) & ~(0x97 ^ 0xA7)) != 0x0) {
                return;
            }
        }
    }
    
    private static void llllIIIllllIIll() {
        (lIlIllIlIllllI = new int[2])[0] = ((0xEF ^ 0xBC) & ~(0x79 ^ 0x2A));
        CombinedTransition.lIlIllIlIllllI[1] = " ".length();
    }
}
