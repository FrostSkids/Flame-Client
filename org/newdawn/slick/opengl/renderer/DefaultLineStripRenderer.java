// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.renderer;

public class DefaultLineStripRenderer implements LineStripRenderer
{
    private static final /* synthetic */ int[] lIllIlllllIlIl;
    private /* synthetic */ SGL GL;
    
    public void color(final float llllllllllllIllllllIIIlIIlIIIlIl, final float llllllllllllIllllllIIIlIIlIIIlII, final float llllllllllllIllllllIIIlIIlIIIIll, final float llllllllllllIllllllIIIlIIlIIIIlI) {
        this.GL.glColor4f(llllllllllllIllllllIIIlIIlIIIlIl, llllllllllllIllllllIIIlIIlIIIlII, llllllllllllIllllllIIIlIIlIIIIll, llllllllllllIllllllIIIlIIlIIIIlI);
    }
    
    public void vertex(final float llllllllllllIllllllIIIlIIlIlIIII, final float llllllllllllIllllllIIIlIIlIIllII) {
        this.GL.glVertex2f(llllllllllllIllllllIIIlIIlIlIIII, llllllllllllIllllllIIIlIIlIIllII);
    }
    
    public void setAntiAlias(final boolean llllllllllllIllllllIIIlIIlIllllI) {
        if (lIIIIIIIlIIlIIll(llllllllllllIllllllIIIlIIlIllllI ? 1 : 0)) {
            this.GL.glEnable(DefaultLineStripRenderer.lIllIlllllIlIl[0]);
            "".length();
            if (-" ".length() > (0x58 ^ 0x5C)) {
                return;
            }
        }
        else {
            this.GL.glDisable(DefaultLineStripRenderer.lIllIlllllIlIl[0]);
        }
    }
    
    public boolean applyGLLineFixes() {
        return DefaultLineStripRenderer.lIllIlllllIlIl[2] != 0;
    }
    
    static {
        lIIIIIIIlIIlIIlI();
    }
    
    private static boolean lIIIIIIIlIIlIIll(final int llllllllllllIllllllIIIlIIIlllIII) {
        return llllllllllllIllllllIIIlIIIlllIII != 0;
    }
    
    public void setLineCaps(final boolean llllllllllllIllllllIIIlIIIlllIll) {
    }
    
    private static void lIIIIIIIlIIlIIlI() {
        (lIllIlllllIlIl = new int[3])[0] = (-(0xFFFFF5F9 & 0xED7) & (0xFFFFAFFF & 0x5FF0));
        DefaultLineStripRenderer.lIllIlllllIlIl[1] = "   ".length();
        DefaultLineStripRenderer.lIllIlllllIlIl[2] = " ".length();
    }
    
    public DefaultLineStripRenderer() {
        this.GL = Renderer.get();
    }
    
    public void setWidth(final float llllllllllllIllllllIIIlIIlIllIlI) {
        this.GL.glLineWidth(llllllllllllIllllllIIIlIIlIllIlI);
    }
    
    public void start() {
        this.GL.glBegin(DefaultLineStripRenderer.lIllIlllllIlIl[1]);
    }
    
    public void end() {
        this.GL.glEnd();
    }
}
