// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.renderer;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Renderer
{
    private static final /* synthetic */ int[] lIIlllllIIlIIl;
    private static final /* synthetic */ String[] lIIlllllIIlIII;
    private static /* synthetic */ LineStripRenderer lineStripRenderer;
    private static /* synthetic */ SGL renderer;
    
    private static String llIllllIlIIIIlI(String lllllllllllllIIlIIlIIlIIlIlIIlII, final String lllllllllllllIIlIIlIIlIIlIlIlIII) {
        lllllllllllllIIlIIlIIlIIlIlIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIlIIlIIlIIlIlIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIIlIIlIlIIlll = new StringBuilder();
        final char[] lllllllllllllIIlIIlIIlIIlIlIIllI = lllllllllllllIIlIIlIIlIIlIlIlIII.toCharArray();
        int lllllllllllllIIlIIlIIlIIlIlIIlIl = Renderer.lIIlllllIIlIIl[0];
        final int lllllllllllllIIlIIlIIlIIlIIlllll = (Object)lllllllllllllIIlIIlIIlIIlIlIIlII.toCharArray();
        final double lllllllllllllIIlIIlIIlIIlIIllllI = lllllllllllllIIlIIlIIlIIlIIlllll.length;
        boolean lllllllllllllIIlIIlIIlIIlIIlllIl = Renderer.lIIlllllIIlIIl[0] != 0;
        while (llIllllIlIIIlIl(lllllllllllllIIlIIlIIlIIlIIlllIl ? 1 : 0, (int)lllllllllllllIIlIIlIIlIIlIIllllI)) {
            final char lllllllllllllIIlIIlIIlIIlIlIlIlI = lllllllllllllIIlIIlIIlIIlIIlllll[lllllllllllllIIlIIlIIlIIlIIlllIl];
            lllllllllllllIIlIIlIIlIIlIlIIlll.append((char)(lllllllllllllIIlIIlIIlIIlIlIlIlI ^ lllllllllllllIIlIIlIIlIIlIlIIllI[lllllllllllllIIlIIlIIlIIlIlIIlIl % lllllllllllllIIlIIlIIlIIlIlIIllI.length]));
            "".length();
            ++lllllllllllllIIlIIlIIlIIlIlIIlIl;
            ++lllllllllllllIIlIIlIIlIIlIIlllIl;
            "".length();
            if (((0x88 ^ 0xA4 ^ (0xF ^ 0x30)) & (53 + 102 - 73 + 47 ^ 35 + 55 + 12 + 44 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIIlIIlIlIIlll);
    }
    
    public static LineStripRenderer getLineStripRenderer() {
        return Renderer.lineStripRenderer;
    }
    
    public static void setRenderer(final int lllllllllllllIIlIIlIIlIIlIlllllI) {
        switch (lllllllllllllIIlIIlIIlIIlIlllllI) {
            case 1: {
                setRenderer(new ImmediateModeOGLRenderer());
            }
            case 2: {
                setRenderer(new VAOGLRenderer());
            }
            default: {
                throw new RuntimeException(String.valueOf(new StringBuilder().append(Renderer.lIIlllllIIlIII[Renderer.lIIlllllIIlIIl[0]]).append(lllllllllllllIIlIIlIIlIIlIlllllI)));
            }
        }
    }
    
    private static void llIllllIlIIIIll() {
        (lIIlllllIIlIII = new String[Renderer.lIIlllllIIlIIl[3]])[Renderer.lIIlllllIIlIIl[0]] = llIllllIlIIIIlI("AgQgCDcgBGsUPTkOLhQ9JUo/HygyUGs=", "WjKfX");
        Renderer.lIIlllllIIlIII[Renderer.lIIlllllIIlIIl[1]] = llIllllIlIIIIlI("GiQhBQU4JGoHAyEvahgePSM6SxgqJC4OGCo4ah8TPy9wSw==", "OJJkj");
    }
    
    private static void llIllllIlIIIlII() {
        (lIIlllllIIlIIl = new int[5])[0] = ((0x41 ^ 0x7F) & ~(0x3 ^ 0x3D));
        Renderer.lIIlllllIIlIIl[1] = " ".length();
        Renderer.lIIlllllIIlIIl[2] = (0x41 ^ 0x45);
        Renderer.lIIlllllIIlIIl[3] = "  ".length();
        Renderer.lIIlllllIIlIIl[4] = "   ".length();
    }
    
    private static boolean llIllllIlIIIlIl(final int lllllllllllllIIlIIlIIlIIlIIllIIl, final int lllllllllllllIIlIIlIIlIIlIIllIII) {
        return lllllllllllllIIlIIlIIlIIlIIllIIl < lllllllllllllIIlIIlIIlIIlIIllIII;
    }
    
    public static void setRenderer(final SGL lllllllllllllIIlIIlIIlIIlIllIlIl) {
        Renderer.renderer = lllllllllllllIIlIIlIIlIIlIllIlIl;
    }
    
    static {
        llIllllIlIIIlII();
        llIllllIlIIIIll();
        QUAD_BASED_LINE_STRIP_RENDERER = Renderer.lIIlllllIIlIIl[2];
        IMMEDIATE_RENDERER = Renderer.lIIlllllIIlIIl[1];
        VERTEX_ARRAY_RENDERER = Renderer.lIIlllllIIlIIl[3];
        DEFAULT_LINE_STRIP_RENDERER = Renderer.lIIlllllIIlIIl[4];
        Renderer.renderer = new ImmediateModeOGLRenderer();
        Renderer.lineStripRenderer = new DefaultLineStripRenderer();
    }
    
    public static void setLineStripRenderer(final LineStripRenderer lllllllllllllIIlIIlIIlIIlIlllIII) {
        Renderer.lineStripRenderer = lllllllllllllIIlIIlIIlIIlIlllIII;
    }
    
    public static void setLineStripRenderer(final int lllllllllllllIIlIIlIIlIIlIlllIll) {
        switch (lllllllllllllIIlIIlIIlIIlIlllIll) {
            case 3: {
                setLineStripRenderer(new DefaultLineStripRenderer());
            }
            case 4: {
                setLineStripRenderer(new QuadBasedLineStripRenderer());
            }
            default: {
                throw new RuntimeException(String.valueOf(new StringBuilder().append(Renderer.lIIlllllIIlIII[Renderer.lIIlllllIIlIIl[1]]).append(lllllllllllllIIlIIlIIlIIlIlllIll)));
            }
        }
    }
    
    public static SGL get() {
        return Renderer.renderer;
    }
}
