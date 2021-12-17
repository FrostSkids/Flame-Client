// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.SlickCallable;
import org.newdawn.slick.opengl.renderer.SGL;

public class ScalableGame implements Game
{
    private static /* synthetic */ SGL GL;
    private /* synthetic */ int targetWidth;
    private /* synthetic */ int targetHeight;
    private /* synthetic */ float normalHeight;
    private /* synthetic */ float normalWidth;
    private /* synthetic */ GameContainer container;
    private static final /* synthetic */ int[] llIIIlllIllIll;
    private /* synthetic */ boolean maintainAspect;
    private /* synthetic */ Game held;
    
    private static boolean lIIIlIlIlllllIII(final int llllllllllllIlllIlIIIIIIIIlllIll) {
        return llllllllllllIlllIlIIIIIIIIlllIll != 0;
    }
    
    public String getTitle() {
        return this.held.getTitle();
    }
    
    private static boolean lIIIlIlIllllllII(final int llllllllllllIlllIlIIIIIIIIlllllI, final int llllllllllllIlllIlIIIIIIIIllllIl) {
        return llllllllllllIlllIlIIIIIIIIlllllI < llllllllllllIlllIlIIIIIIIIllllIl;
    }
    
    private static boolean lIIIlIlIlllllIlI(final int llllllllllllIlllIlIIIIIIIIllIlll) {
        return llllllllllllIlllIlIIIIIIIIllIlll < 0;
    }
    
    public boolean closeRequested() {
        return this.held.closeRequested();
    }
    
    public void recalculateScale() throws SlickException {
        this.targetWidth = this.container.getWidth();
        this.targetHeight = this.container.getHeight();
        if (lIIIlIlIlllllIII(this.maintainAspect ? 1 : 0)) {
            int n;
            if (lIIIlIlIlllllIIl(lIIIlIlIllllIllI(this.normalWidth / this.normalHeight, 1.6))) {
                n = ScalableGame.llIIIlllIllIll[1];
                "".length();
                if (((0x96 ^ 0xC3) & ~(0xFD ^ 0xA8)) != 0x0) {
                    return;
                }
            }
            else {
                n = ScalableGame.llIIIlllIllIll[0];
            }
            final boolean llllllllllllIlllIlIIIIIIIlllIIlI = n != 0;
            int n2;
            if (lIIIlIlIlllllIIl(lIIIlIlIllllIllI(this.targetWidth / (float)this.targetHeight, 1.6))) {
                n2 = ScalableGame.llIIIlllIllIll[1];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                n2 = ScalableGame.llIIIlllIllIll[0];
            }
            final boolean llllllllllllIlllIlIIIIIIIlllIIIl = n2 != 0;
            final float llllllllllllIlllIlIIIIIIIlllIIII = this.targetWidth / this.normalWidth;
            final float llllllllllllIlllIlIIIIIIIllIllll = this.targetHeight / this.normalHeight;
            if (lIIIlIlIlllllIII((llllllllllllIlllIlIIIIIIIlllIIlI & llllllllllllIlllIlIIIIIIIlllIIIl) ? 1 : 0)) {
                float n3;
                if (lIIIlIlIlllllIlI(lIIIlIlIllllIlll(llllllllllllIlllIlIIIIIIIlllIIII, llllllllllllIlllIlIIIIIIIllIllll))) {
                    n3 = llllllllllllIlllIlIIIIIIIlllIIII;
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                else {
                    n3 = llllllllllllIlllIlIIIIIIIllIllll;
                }
                final float llllllllllllIlllIlIIIIIIIlllIlII = n3;
                this.targetWidth = (int)(this.normalWidth * llllllllllllIlllIlIIIIIIIlllIlII);
                this.targetHeight = (int)(this.normalHeight * llllllllllllIlllIlIIIIIIIlllIlII);
                "".length();
                if (((0x34 ^ 0x46 ^ (0x9 ^ 0x31)) & (0xD0 ^ 0x9A ^ ((0x1A ^ 0x25) & ~(0x70 ^ 0x4F)) ^ -" ".length())) > 0) {
                    return;
                }
            }
            else {
                final boolean b = llllllllllllIlllIlIIIIIIIlllIIlI;
                int n4;
                if (lIIIlIlIlllllIll(llllllllllllIlllIlIIIIIIIlllIIIl ? 1 : 0)) {
                    n4 = ScalableGame.llIIIlllIllIll[1];
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return;
                    }
                }
                else {
                    n4 = ScalableGame.llIIIlllIllIll[0];
                }
                if (lIIIlIlIlllllIII((b ? 1 : 0) & n4)) {
                    this.targetWidth = (int)(this.normalWidth * llllllllllllIlllIlIIIIIIIlllIIII);
                    this.targetHeight = (int)(this.normalHeight * llllllllllllIlllIlIIIIIIIlllIIII);
                    "".length();
                    if ((0xA5 ^ 0x9A ^ (0x3B ^ 0x0)) < -" ".length()) {
                        return;
                    }
                }
                else {
                    int n5;
                    if (lIIIlIlIlllllIll(llllllllllllIlllIlIIIIIIIlllIIlI ? 1 : 0)) {
                        n5 = ScalableGame.llIIIlllIllIll[1];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        n5 = ScalableGame.llIIIlllIllIll[0];
                    }
                    if (lIIIlIlIlllllIII(n5 & (llllllllllllIlllIlIIIIIIIlllIIIl ? 1 : 0))) {
                        this.targetWidth = (int)(this.normalWidth * llllllllllllIlllIlIIIIIIIllIllll);
                        this.targetHeight = (int)(this.normalHeight * llllllllllllIlllIlIIIIIIIllIllll);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        float n6;
                        if (lIIIlIlIlllllIlI(lIIIlIlIllllIlll(llllllllllllIlllIlIIIIIIIlllIIII, llllllllllllIlllIlIIIIIIIllIllll))) {
                            n6 = llllllllllllIlllIlIIIIIIIlllIIII;
                            "".length();
                            if (((0x31 ^ 0x19) & ~(0x15 ^ 0x3D)) <= -" ".length()) {
                                return;
                            }
                        }
                        else {
                            n6 = llllllllllllIlllIlIIIIIIIllIllll;
                        }
                        final float llllllllllllIlllIlIIIIIIIlllIIll = n6;
                        this.targetWidth = (int)(this.normalWidth * llllllllllllIlllIlIIIIIIIlllIIll);
                        this.targetHeight = (int)(this.normalHeight * llllllllllllIlllIlIIIIIIIlllIIll);
                    }
                }
            }
        }
        if (lIIIlIlIlllllIII((this.held instanceof InputListener) ? 1 : 0)) {
            this.container.getInput().addListener((InputListener)this.held);
        }
        this.container.getInput().setScale(this.normalWidth / this.targetWidth, this.normalHeight / this.targetHeight);
        int llllllllllllIlllIlIIIIIIIllIllIl = ScalableGame.llIIIlllIllIll[0];
        int llllllllllllIlllIlIIIIIIIllIllII = ScalableGame.llIIIlllIllIll[0];
        if (lIIIlIlIllllllII(this.targetHeight, this.container.getHeight())) {
            llllllllllllIlllIlIIIIIIIllIllIl = (this.container.getHeight() - this.targetHeight) / ScalableGame.llIIIlllIllIll[2];
        }
        if (lIIIlIlIllllllII(this.targetWidth, this.container.getWidth())) {
            llllllllllllIlllIlIIIIIIIllIllII = (this.container.getWidth() - this.targetWidth) / ScalableGame.llIIIlllIllIll[2];
        }
        this.container.getInput().setOffset(-llllllllllllIlllIlIIIIIIIllIllII / (this.targetWidth / this.normalWidth), -llllllllllllIlllIlIIIIIIIllIllIl / (this.targetHeight / this.normalHeight));
    }
    
    public void update(final GameContainer llllllllllllIlllIlIIIIIIIllIIIIl, final int llllllllllllIlllIlIIIIIIIllIIIII) throws SlickException {
        if (!lIIIlIlIllllllIl(this.targetHeight, llllllllllllIlllIlIIIIIIIllIIIIl.getHeight()) || lIIIlIlIlllllllI(this.targetWidth, llllllllllllIlllIlIIIIIIIllIIIIl.getWidth())) {
            this.recalculateScale();
        }
        this.held.update(llllllllllllIlllIlIIIIIIIllIIIIl, llllllllllllIlllIlIIIIIIIllIIIII);
    }
    
    public final void render(final GameContainer llllllllllllIlllIlIIIIIIIlIlIllI, final Graphics llllllllllllIlllIlIIIIIIIlIlIlIl) throws SlickException {
        int llllllllllllIlllIlIIIIIIIlIlIlII = ScalableGame.llIIIlllIllIll[0];
        int llllllllllllIlllIlIIIIIIIlIlIIll = ScalableGame.llIIIlllIllIll[0];
        if (lIIIlIlIllllllII(this.targetHeight, llllllllllllIlllIlIIIIIIIlIlIllI.getHeight())) {
            llllllllllllIlllIlIIIIIIIlIlIlII = (llllllllllllIlllIlIIIIIIIlIlIllI.getHeight() - this.targetHeight) / ScalableGame.llIIIlllIllIll[2];
        }
        if (lIIIlIlIllllllII(this.targetWidth, llllllllllllIlllIlIIIIIIIlIlIllI.getWidth())) {
            llllllllllllIlllIlIIIIIIIlIlIIll = (llllllllllllIlllIlIIIIIIIlIlIllI.getWidth() - this.targetWidth) / ScalableGame.llIIIlllIllIll[2];
        }
        SlickCallable.enterSafeBlock();
        llllllllllllIlllIlIIIIIIIlIlIlIl.setClip(llllllllllllIlllIlIIIIIIIlIlIIll, llllllllllllIlllIlIIIIIIIlIlIlII, this.targetWidth, this.targetHeight);
        ScalableGame.GL.glTranslatef((float)llllllllllllIlllIlIIIIIIIlIlIIll, (float)llllllllllllIlllIlIIIIIIIlIlIlII, 0.0f);
        llllllllllllIlllIlIIIIIIIlIlIlIl.scale(this.targetWidth / this.normalWidth, this.targetHeight / this.normalHeight);
        ScalableGame.GL.glPushMatrix();
        this.held.render(llllllllllllIlllIlIIIIIIIlIlIllI, llllllllllllIlllIlIIIIIIIlIlIlIl);
        ScalableGame.GL.glPopMatrix();
        llllllllllllIlllIlIIIIIIIlIlIlIl.clearClip();
        SlickCallable.leaveSafeBlock();
        this.renderOverlay(llllllllllllIlllIlIIIIIIIlIlIllI, llllllllllllIlllIlIIIIIIIlIlIlIl);
    }
    
    public ScalableGame(final Game llllllllllllIlllIlIIIIIIlIIlIllI, final int llllllllllllIlllIlIIIIIIlIIlIIIl, final int llllllllllllIlllIlIIIIIIlIIlIIII) {
        this(llllllllllllIlllIlIIIIIIlIIlIllI, llllllllllllIlllIlIIIIIIlIIlIIIl, llllllllllllIlllIlIIIIIIlIIlIIII, (boolean)(ScalableGame.llIIIlllIllIll[0] != 0));
    }
    
    private static boolean lIIIlIlIlllllIll(final int llllllllllllIlllIlIIIIIIIIlllIIl) {
        return llllllllllllIlllIlIIIIIIIIlllIIl == 0;
    }
    
    static {
        lIIIlIlIllllIlIl();
        ScalableGame.GL = Renderer.get();
    }
    
    public void init(final GameContainer llllllllllllIlllIlIIIIIIIlllllIl) throws SlickException {
        this.container = llllllllllllIlllIlIIIIIIIlllllIl;
        this.recalculateScale();
        this.held.init(llllllllllllIlllIlIIIIIIIlllllIl);
    }
    
    private static boolean lIIIlIlIlllllllI(final int llllllllllllIlllIlIIIIIIIIllIIlI, final int llllllllllllIlllIlIIIIIIIIllIIIl) {
        return llllllllllllIlllIlIIIIIIIIllIIlI != llllllllllllIlllIlIIIIIIIIllIIIl;
    }
    
    private static void lIIIlIlIllllIlIl() {
        (llIIIlllIllIll = new int[3])[0] = ((0x1E ^ 0x7B ^ (0xA9 ^ 0xAC)) & (0xAF ^ 0x94 ^ (0x58 ^ 0x3) ^ -" ".length()));
        ScalableGame.llIIIlllIllIll[1] = " ".length();
        ScalableGame.llIIIlllIllIll[2] = "  ".length();
    }
    
    private static boolean lIIIlIlIllllllIl(final int llllllllllllIlllIlIIIIIIIlIIIIlI, final int llllllllllllIlllIlIIIIIIIlIIIIIl) {
        return llllllllllllIlllIlIIIIIIIlIIIIlI == llllllllllllIlllIlIIIIIIIlIIIIIl;
    }
    
    private static int lIIIlIlIllllIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public ScalableGame(final Game llllllllllllIlllIlIIIIIIlIIIIlII, final int llllllllllllIlllIlIIIIIIlIIIIIll, final int llllllllllllIlllIlIIIIIIlIIIIIlI, final boolean llllllllllllIlllIlIIIIIIlIIIIllI) {
        this.held = llllllllllllIlllIlIIIIIIlIIIIlII;
        this.normalWidth = (float)llllllllllllIlllIlIIIIIIlIIIIIll;
        this.normalHeight = (float)llllllllllllIlllIlIIIIIIlIIIIIlI;
        this.maintainAspect = llllllllllllIlllIlIIIIIIlIIIIllI;
    }
    
    private static boolean lIIIlIlIlllllIIl(final int llllllllllllIlllIlIIIIIIIIllIlIl) {
        return llllllllllllIlllIlIIIIIIIIllIlIl > 0;
    }
    
    protected void renderOverlay(final GameContainer llllllllllllIlllIlIIIIIIIlIIllII, final Graphics llllllllllllIlllIlIIIIIIIlIIlIll) {
    }
    
    private static int lIIIlIlIllllIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
}
