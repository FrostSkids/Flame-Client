// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

public class MaskUtil
{
    private static final /* synthetic */ int[] lIIIIlllIIllIl;
    protected static /* synthetic */ SGL GL;
    
    public static void finishDefineMask() {
        MaskUtil.GL.glDepthMask((boolean)(MaskUtil.lIIIIlllIIllIl[4] != 0));
        MaskUtil.GL.glColorMask((boolean)(MaskUtil.lIIIIlllIIllIl[0] != 0), (boolean)(MaskUtil.lIIIIlllIIllIl[0] != 0), (boolean)(MaskUtil.lIIIIlllIIllIl[0] != 0), (boolean)(MaskUtil.lIIIIlllIIllIl[0] != 0));
    }
    
    public static void drawOffMask() {
        MaskUtil.GL.glDepthFunc(MaskUtil.lIIIIlllIIllIl[6]);
    }
    
    public static void resetMask() {
        MaskUtil.GL.glDepthMask((boolean)(MaskUtil.lIIIIlllIIllIl[0] != 0));
        MaskUtil.GL.glClearDepth(0.0f);
        MaskUtil.GL.glClear(MaskUtil.lIIIIlllIIllIl[1]);
        MaskUtil.GL.glDepthMask((boolean)(MaskUtil.lIIIIlllIIllIl[4] != 0));
        MaskUtil.GL.glDisable(MaskUtil.lIIIIlllIIllIl[3]);
    }
    
    public static void drawOnMask() {
        MaskUtil.GL.glDepthFunc(MaskUtil.lIIIIlllIIllIl[5]);
    }
    
    static {
        lIllllIIlIIlIll();
        MaskUtil.GL = Renderer.get();
    }
    
    public static void defineMask() {
        MaskUtil.GL.glDepthMask((boolean)(MaskUtil.lIIIIlllIIllIl[0] != 0));
        MaskUtil.GL.glClearDepth(1.0f);
        MaskUtil.GL.glClear(MaskUtil.lIIIIlllIIllIl[1]);
        MaskUtil.GL.glDepthFunc(MaskUtil.lIIIIlllIIllIl[2]);
        MaskUtil.GL.glEnable(MaskUtil.lIIIIlllIIllIl[3]);
        MaskUtil.GL.glDepthMask((boolean)(MaskUtil.lIIIIlllIIllIl[0] != 0));
        MaskUtil.GL.glColorMask((boolean)(MaskUtil.lIIIIlllIIllIl[4] != 0), (boolean)(MaskUtil.lIIIIlllIIllIl[4] != 0), (boolean)(MaskUtil.lIIIIlllIIllIl[4] != 0), (boolean)(MaskUtil.lIIIIlllIIllIl[4] != 0));
    }
    
    private static void lIllllIIlIIlIll() {
        (lIIIIlllIIllIl = new int[7])[0] = " ".length();
        MaskUtil.lIIIIlllIIllIl[1] = (-(0xFFFFFEBE & 0xF6F) & (0xFFFFEF7F & 0x1FAD));
        MaskUtil.lIIIIlllIIllIl[2] = (-(0xFFFFE971 & 0x7FEF) & (0xFFFFFF67 & 0x6BFF));
        MaskUtil.lIIIIlllIIllIl[3] = (0xFFFFDFF3 & 0x2B7D);
        MaskUtil.lIIIIlllIIllIl[4] = ((0xF ^ 0x5D) & ~(0x63 ^ 0x31));
        MaskUtil.lIIIIlllIIllIl[5] = (-(0xFFFFBDF9 & 0x5BEF) & (0xFFFF9BFF & 0x7FEA));
        MaskUtil.lIIIIlllIIllIl[6] = (-(0xFFFFFF7F & 0x75B3) & (0xFFFFF7F7 & 0x7F3F));
    }
}
