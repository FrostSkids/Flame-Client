// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import org.newdawn.slick.SlickException;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.opengl.renderer.Renderer;

public abstract class SlickCallable
{
    private static /* synthetic */ Texture lastUsed;
    private static /* synthetic */ boolean inSafe;
    private static final /* synthetic */ int[] lIIIIIIlIIIlll;
    
    private static boolean lIllIIlllllIIlI(final int lllllllllllllIlIlIIIlIIIIIlIllII) {
        return lllllllllllllIlIlIIIlIIIIIlIllII == 0;
    }
    
    public static void enterSafeBlock() {
        if (lIllIIlllllIIIl(SlickCallable.inSafe ? 1 : 0)) {
            return;
        }
        Renderer.get().flush();
        SlickCallable.lastUsed = TextureImpl.getLastBind();
        TextureImpl.bindNone();
        GL11.glPushAttrib(SlickCallable.lIIIIIIlIIIlll[0]);
        GL11.glPushClientAttrib(SlickCallable.lIIIIIIlIIIlll[1]);
        GL11.glMatrixMode(SlickCallable.lIIIIIIlIIIlll[2]);
        GL11.glPushMatrix();
        GL11.glMatrixMode(SlickCallable.lIIIIIIlIIIlll[3]);
        GL11.glPushMatrix();
        GL11.glMatrixMode(SlickCallable.lIIIIIIlIIIlll[2]);
        SlickCallable.inSafe = (SlickCallable.lIIIIIIlIIIlll[4] != 0);
    }
    
    public static void leaveSafeBlock() {
        if (lIllIIlllllIIlI(SlickCallable.inSafe ? 1 : 0)) {
            return;
        }
        GL11.glMatrixMode(SlickCallable.lIIIIIIlIIIlll[3]);
        GL11.glPopMatrix();
        GL11.glMatrixMode(SlickCallable.lIIIIIIlIIIlll[2]);
        GL11.glPopMatrix();
        GL11.glPopClientAttrib();
        GL11.glPopAttrib();
        if (lIllIIlllllIIll(SlickCallable.lastUsed)) {
            SlickCallable.lastUsed.bind();
            "".length();
            if (((0x51 ^ 0x71) & ~(0x84 ^ 0xA4)) != 0x0) {
                return;
            }
        }
        else {
            TextureImpl.bindNone();
        }
        SlickCallable.inSafe = (SlickCallable.lIIIIIIlIIIlll[5] != 0);
    }
    
    private static boolean lIllIIlllllIIll(final Object lllllllllllllIlIlIIIlIIIIIllIIII) {
        return lllllllllllllIlIlIIIlIIIIIllIIII != null;
    }
    
    private static void lIllIIlllllIIII() {
        (lIIIIIIlIIIlll = new int[6])[0] = (-" ".length() & (-1 & 0xFFFFF));
        SlickCallable.lIIIIIIlIIIlll[1] = -" ".length();
        SlickCallable.lIIIIIIlIIIlll[2] = (0xFFFFBF29 & 0x57D6);
        SlickCallable.lIIIIIIlIIIlll[3] = (-(0xFFFFFE9F & 0x96B) & (0xFFFFFFDF & 0x1F2B));
        SlickCallable.lIIIIIIlIIIlll[4] = " ".length();
        SlickCallable.lIIIIIIlIIIlll[5] = ((0xB4 ^ 0xB3) & ~(0x46 ^ 0x41));
    }
    
    protected abstract void performGLOperations() throws SlickException;
    
    public final void call() throws SlickException {
        enterSafeBlock();
        this.performGLOperations();
        leaveSafeBlock();
    }
    
    private static boolean lIllIIlllllIIIl(final int lllllllllllllIlIlIIIlIIIIIlIlllI) {
        return lllllllllllllIlIlIIIlIIIIIlIlllI != 0;
    }
    
    static {
        lIllIIlllllIIII();
        SlickCallable.inSafe = (SlickCallable.lIIIIIIlIIIlll[5] != 0);
    }
}
