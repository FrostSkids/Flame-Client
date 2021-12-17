// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.geom;

import org.newdawn.slick.ShapeFill;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.renderer.LineStripRenderer;
import org.newdawn.slick.opengl.renderer.SGL;

public final class ShapeRenderer
{
    private static final /* synthetic */ int[] lIIllllllIIIlI;
    private static /* synthetic */ SGL GL;
    private static /* synthetic */ LineStripRenderer LSR;
    
    public static final void textureFit(final Shape lllllllllllllIIlIIlIIIIllIllIllI, final Image lllllllllllllIIlIIlIIIIllIlIlIll, final float lllllllllllllIIlIIlIIIIllIllIlII, final float lllllllllllllIIlIIlIIIIllIlIlIIl) {
        if (llIllllIlllIlII(validFill(lllllllllllllIIlIIlIIIIllIllIllI) ? 1 : 0)) {
            return;
        }
        final float[] lllllllllllllIIlIIlIIIIllIllIIlI = lllllllllllllIIlIIlIIIIllIllIllI.getPoints();
        final Texture lllllllllllllIIlIIlIIIIllIllIIIl = TextureImpl.getLastBind();
        lllllllllllllIIlIIlIIIIllIlIlIll.getTexture().bind();
        final float lllllllllllllIIlIIlIIIIllIllIIII = lllllllllllllIIlIIlIIIIllIllIllI.getX();
        final float lllllllllllllIIlIIlIIIIllIlIllll = lllllllllllllIIlIIlIIIIllIllIllI.getY();
        final float lllllllllllllIIlIIlIIIIllIlIlllI = lllllllllllllIIlIIlIIIIllIllIllI.getMaxX() - lllllllllllllIIlIIlIIIIllIllIIII;
        final float lllllllllllllIIlIIlIIIIllIlIllIl = lllllllllllllIIlIIlIIIIllIllIllI.getMaxY() - lllllllllllllIIlIIlIIIIllIlIllll;
        fill(lllllllllllllIIlIIlIIIIllIllIllI, new PointCallback() {
            public float[] preRenderPoint(final Shape llllllllllllIllIllIIIIllIlIlIIIl, float llllllllllllIllIllIIIIllIlIIlIlI, float llllllllllllIllIllIIIIllIlIIlIIl) {
                llllllllllllIllIllIIIIllIlIIlIlI -= (int)llllllllllllIllIllIIIIllIlIlIIIl.getMinX();
                llllllllllllIllIllIIIIllIlIIlIIl -= (Exception)llllllllllllIllIllIIIIllIlIlIIIl.getMinY();
                llllllllllllIllIllIIIIllIlIIlIlI /= (int)(llllllllllllIllIllIIIIllIlIlIIIl.getMaxX() - llllllllllllIllIllIIIIllIlIlIIIl.getMinX());
                llllllllllllIllIllIIIIllIlIIlIIl /= (Exception)(llllllllllllIllIllIIIIllIlIlIIIl.getMaxY() - llllllllllllIllIllIIIIllIlIlIIIl.getMinY());
                float llllllllllllIllIllIIIIllIlIIlllI = llllllllllllIllIllIIIIllIlIIlIlI * lllllllllllllIIlIIlIIIIllIllIlII;
                float llllllllllllIllIllIIIIllIlIIllIl = (float)(llllllllllllIllIllIIIIllIlIIlIIl * lllllllllllllIIlIIlIIIIllIlIlIIl);
                llllllllllllIllIllIIIIllIlIIlllI = lllllllllllllIIlIIlIIIIllIlIlIll.getTextureOffsetX() + lllllllllllllIIlIIlIIIIllIlIlIll.getTextureWidth() * llllllllllllIllIllIIIIllIlIIlllI;
                llllllllllllIllIllIIIIllIlIIllIl = lllllllllllllIIlIIlIIIIllIlIlIll.getTextureOffsetY() + lllllllllllllIIlIIlIIIIllIlIlIll.getTextureHeight() * llllllllllllIllIllIIIIllIlIIllIl;
                ShapeRenderer.GL.glTexCoord2f(llllllllllllIllIllIIIIllIlIIlllI, llllllllllllIllIllIIIIllIlIIllIl);
                return null;
            }
        });
        if (llIllllIlllIIll(lllllllllllllIIlIIlIIIIllIllIIIl)) {
            TextureImpl.bindNone();
            "".length();
            if ((0x9B ^ 0x9F) <= " ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIlIIIIllIllIIIl.bind();
        }
    }
    
    static {
        llIllllIlllIIII();
        ShapeRenderer.GL = Renderer.get();
        ShapeRenderer.LSR = Renderer.getLineStripRenderer();
    }
    
    public static final void texture(final Shape lllllllllllllIIlIIlIIIIlllIllIlI, final Image lllllllllllllIIlIIlIIIIlllIllIIl) {
        texture(lllllllllllllIIlIIlIIIIlllIllIlI, lllllllllllllIIlIIlIIIIlllIllIIl, 0.01f, 0.01f);
    }
    
    private static void llIllllIlllIIII() {
        (lIIllllllIIIlI = new int[4])[0] = ((72 + 78 - 75 + 59 ^ 106 + 69 - 139 + 153) & (23 + 10 - 32 + 147 ^ 146 + 101 - 102 + 30 ^ -" ".length()));
        ShapeRenderer.lIIllllllIIIlI[1] = " ".length();
        ShapeRenderer.lIIllllllIIIlI[2] = "   ".length();
        ShapeRenderer.lIIllllllIIIlI[3] = (0x93 ^ 0x97);
    }
    
    public static final void texture(final Shape lllllllllllllIIlIIlIIIIlIlllllII, final Image lllllllllllllIIlIIlIIIIlIllllIll, final TexCoordGenerator lllllllllllllIIlIIlIIIIlIlllIlIl) {
        final Texture lllllllllllllIIlIIlIIIIlIllllIIl = TextureImpl.getLastBind();
        lllllllllllllIIlIIlIIIIlIllllIll.getTexture().bind();
        final float[] lllllllllllllIIlIIlIIIIlIllllIII = lllllllllllllIIlIIlIIIIlIlllllII.getCenter();
        fill(lllllllllllllIIlIIlIIIIlIlllllII, new PointCallback() {
            private static final /* synthetic */ int[] lIIlIlIlIIIllI;
            
            private static void llIlIIIIIlIlIll() {
                (lIIlIlIlIIIllI = new int[3])[0] = "  ".length();
                ShapeRenderer$6.lIIlIlIlIIIllI[1] = ((0x12 ^ 0x5) & ~(0x39 ^ 0x2E));
                ShapeRenderer$6.lIIlIlIlIIIllI[2] = " ".length();
            }
            
            static {
                llIlIIIIIlIlIll();
            }
            
            public float[] preRenderPoint(final Shape lllllllllllllIIllIlIIIIlIllIIIIl, final float lllllllllllllIIllIlIIIIlIlIlllII, final float lllllllllllllIIllIlIIIIlIlIlllll) {
                final Vector2f lllllllllllllIIllIlIIIIlIlIllllI = lllllllllllllIIlIIlIIIIlIlllIlIl.getCoordFor(lllllllllllllIIllIlIIIIlIlIlllII, lllllllllllllIIllIlIIIIlIlIlllll);
                ShapeRenderer.GL.glTexCoord2f(lllllllllllllIIllIlIIIIlIlIllllI.x, lllllllllllllIIllIlIIIIlIlIllllI.y);
                final float[] array = new float[ShapeRenderer$6.lIIlIlIlIIIllI[0]];
                array[ShapeRenderer$6.lIIlIlIlIIIllI[1]] = lllllllllllllIIllIlIIIIlIlIlllII;
                array[ShapeRenderer$6.lIIlIlIlIIIllI[2]] = lllllllllllllIIllIlIIIIlIlIlllll;
                return array;
            }
        });
        if (llIllllIlllIIll(lllllllllllllIIlIIlIIIIlIllllIIl)) {
            TextureImpl.bindNone();
            "".length();
            if (((0x55 ^ 0x49) & ~(0xB6 ^ 0xAA)) != 0x0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIlIIIIlIllllIIl.bind();
        }
    }
    
    private static boolean llIllllIlllIIIl(final int lllllllllllllIIlIIlIIIIlIlllIIII, final int lllllllllllllIIlIIlIIIIlIllIllll) {
        return lllllllllllllIIlIIlIIIIlIlllIIII < lllllllllllllIIlIIlIIIIlIllIllll;
    }
    
    private static boolean llIllllIlllIlII(final int lllllllllllllIIlIIlIIIIlIllIlIIl) {
        return lllllllllllllIIlIIlIIIIlIllIlIIl == 0;
    }
    
    public static final void textureFit(final Shape lllllllllllllIIlIIlIIIIlllIlIllI, final Image lllllllllllllIIlIIlIIIIlllIlIlIl) {
        textureFit(lllllllllllllIIlIIlIIIIlllIlIllI, lllllllllllllIIlIIlIIIIlllIlIlIl, 1.0f, 1.0f);
    }
    
    private static final void fill(final Shape lllllllllllllIIlIIlIIIIllllIlIII, final PointCallback lllllllllllllIIlIIlIIIIllllIIlll) {
        final Triangulator lllllllllllllIIlIIlIIIIllllIIllI = lllllllllllllIIlIIlIIIIllllIlIII.getTriangles();
        ShapeRenderer.GL.glBegin(ShapeRenderer.lIIllllllIIIlI[3]);
        int lllllllllllllIIlIIlIIIIllllIlIIl = ShapeRenderer.lIIllllllIIIlI[0];
        while (llIllllIlllIIIl(lllllllllllllIIlIIlIIIIllllIlIIl, lllllllllllllIIlIIlIIIIllllIIllI.getTriangleCount())) {
            int lllllllllllllIIlIIlIIIIllllIlIlI = ShapeRenderer.lIIllllllIIIlI[0];
            while (llIllllIlllIIIl(lllllllllllllIIlIIlIIIIllllIlIlI, ShapeRenderer.lIIllllllIIIlI[2])) {
                final float[] lllllllllllllIIlIIlIIIIllllIllII = lllllllllllllIIlIIlIIIIllllIIllI.getTrianglePoint(lllllllllllllIIlIIlIIIIllllIlIIl, lllllllllllllIIlIIlIIIIllllIlIlI);
                final float[] lllllllllllllIIlIIlIIIIllllIlIll = lllllllllllllIIlIIlIIIIllllIIlll.preRenderPoint(lllllllllllllIIlIIlIIIIllllIlIII, lllllllllllllIIlIIlIIIIllllIllII[ShapeRenderer.lIIllllllIIIlI[0]], lllllllllllllIIlIIlIIIIllllIllII[ShapeRenderer.lIIllllllIIIlI[1]]);
                if (llIllllIlllIIll(lllllllllllllIIlIIlIIIIllllIlIll)) {
                    ShapeRenderer.GL.glVertex2f(lllllllllllllIIlIIlIIIIllllIllII[ShapeRenderer.lIIllllllIIIlI[0]], lllllllllllllIIlIIlIIIIllllIllII[ShapeRenderer.lIIllllllIIIlI[1]]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    ShapeRenderer.GL.glVertex2f(lllllllllllllIIlIIlIIIIllllIlIll[ShapeRenderer.lIIllllllIIIlI[0]], lllllllllllllIIlIIlIIIIllllIlIll[ShapeRenderer.lIIllllllIIIlI[1]]);
                }
                ++lllllllllllllIIlIIlIIIIllllIlIlI;
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
            ++lllllllllllllIIlIIlIIIIllllIlIIl;
            "".length();
            if (-(0xAD ^ 0xA8) >= 0) {
                return;
            }
        }
        ShapeRenderer.GL.glEnd();
    }
    
    public static final void texture(final Shape lllllllllllllIIlIIlIIIIlllIIllII, final Image lllllllllllllIIlIIlIIIIlllIIlIll, final float lllllllllllllIIlIIlIIIIlllIIlIlI, final float lllllllllllllIIlIIlIIIIlllIIlIIl) {
        if (llIllllIlllIlII(validFill(lllllllllllllIIlIIlIIIIlllIIllII) ? 1 : 0)) {
            return;
        }
        final Texture lllllllllllllIIlIIlIIIIlllIIlIII = TextureImpl.getLastBind();
        lllllllllllllIIlIIlIIIIlllIIlIll.getTexture().bind();
        fill(lllllllllllllIIlIIlIIIIlllIIllII, new PointCallback() {
            public float[] preRenderPoint(final Shape lllllllllllllIIllIIlIIIllllIIIIl, final float lllllllllllllIIllIIlIIIlllIllIll, final float lllllllllllllIIllIIlIIIlllIllIlI) {
                float lllllllllllllIIllIIlIIIlllIllllI = lllllllllllllIIllIIlIIIlllIllIll * lllllllllllllIIlIIlIIIIlllIIlIlI;
                float lllllllllllllIIllIIlIIIlllIlllIl = lllllllllllllIIllIIlIIIlllIllIlI * lllllllllllllIIlIIlIIIIlllIIlIIl;
                lllllllllllllIIllIIlIIIlllIllllI = lllllllllllllIIlIIlIIIIlllIIlIll.getTextureOffsetX() + lllllllllllllIIlIIlIIIIlllIIlIll.getTextureWidth() * lllllllllllllIIllIIlIIIlllIllllI;
                lllllllllllllIIllIIlIIIlllIlllIl = lllllllllllllIIlIIlIIIIlllIIlIll.getTextureOffsetY() + lllllllllllllIIlIIlIIIIlllIIlIll.getTextureHeight() * lllllllllllllIIllIIlIIIlllIlllIl;
                ShapeRenderer.GL.glTexCoord2f(lllllllllllllIIllIIlIIIlllIllllI, lllllllllllllIIllIIlIIIlllIlllIl);
                return null;
            }
        });
        final float[] lllllllllllllIIlIIlIIIIlllIIIlll = lllllllllllllIIlIIlIIIIlllIIllII.getPoints();
        if (llIllllIlllIIll(lllllllllllllIIlIIlIIIIlllIIlIII)) {
            TextureImpl.bindNone();
            "".length();
            if (((187 + 75 - 182 + 122 ^ 4 + 48 + 17 + 81) & (0x61 ^ 0x2B ^ (0x3 ^ 0x15) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIlIIIIlllIIlIII.bind();
        }
    }
    
    public static final void fill(final Shape lllllllllllllIIlIIlIIIIllIIllIlI, final ShapeFill lllllllllllllIIlIIlIIIIllIIllIIl) {
        if (llIllllIlllIlII(validFill(lllllllllllllIIlIIlIIIIllIIllIlI) ? 1 : 0)) {
            return;
        }
        final Texture lllllllllllllIIlIIlIIIIllIIlllII = TextureImpl.getLastBind();
        TextureImpl.bindNone();
        final float[] lllllllllllllIIlIIlIIIIllIIllIll = lllllllllllllIIlIIlIIIIllIIllIlI.getCenter();
        fill(lllllllllllllIIlIIlIIIIllIIllIlI, new PointCallback() {
            private static final /* synthetic */ int[] llIIIlIIIIlIII;
            
            static {
                lIIIlIIIlIlIlIlI();
            }
            
            public float[] preRenderPoint(final Shape llllllllllllIlllIllIIlIIIlIlllIl, final float llllllllllllIlllIllIIlIIIlIlIlll, final float llllllllllllIlllIllIIlIIIlIlIllI) {
                lllllllllllllIIlIIlIIIIllIIllIIl.colorAt(llllllllllllIlllIllIIlIIIlIlllIl, llllllllllllIlllIllIIlIIIlIlIlll, llllllllllllIlllIllIIlIIIlIlIllI).bind();
                final Vector2f llllllllllllIlllIllIIlIIIlIllIlI = lllllllllllllIIlIIlIIIIllIIllIIl.getOffsetAt(llllllllllllIlllIllIIlIIIlIlllIl, llllllllllllIlllIllIIlIIIlIlIlll, llllllllllllIlllIllIIlIIIlIlIllI);
                final float[] array = new float[ShapeRenderer$4.llIIIlIIIIlIII[0]];
                array[ShapeRenderer$4.llIIIlIIIIlIII[1]] = llllllllllllIlllIllIIlIIIlIllIlI.x + llllllllllllIlllIllIIlIIIlIlIlll;
                array[ShapeRenderer$4.llIIIlIIIIlIII[2]] = llllllllllllIlllIllIIlIIIlIllIlI.y + llllllllllllIlllIllIIlIIIlIlIllI;
                return array;
            }
            
            private static void lIIIlIIIlIlIlIlI() {
                (llIIIlIIIIlIII = new int[3])[0] = "  ".length();
                ShapeRenderer$4.llIIIlIIIIlIII[1] = ((141 + 83 - 221 + 217 ^ 10 + 14 + 92 + 12) & (117 + 30 - 8 + 17 ^ 17 + 75 + 43 + 57 ^ -" ".length()));
                ShapeRenderer$4.llIIIlIIIIlIII[2] = " ".length();
            }
        });
        if (llIllllIlllIIll(lllllllllllllIIlIIlIIIIllIIlllII)) {
            TextureImpl.bindNone();
            "".length();
            if ("   ".length() < "  ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIlIIIIllIIlllII.bind();
        }
    }
    
    private static boolean llIllllIlllIIll(final Object lllllllllllllIIlIIlIIIIlIllIllIl) {
        return lllllllllllllIIlIIlIIIIlIllIllIl == null;
    }
    
    public static boolean validFill(final Shape lllllllllllllIIlIIlIIIIllllllIlI) {
        if (llIllllIlllIIll(lllllllllllllIIlIIlIIIIllllllIlI.getTriangles())) {
            return ShapeRenderer.lIIllllllIIIlI[0] != 0;
        }
        int n;
        if (llIllllIlllIIlI(lllllllllllllIIlIIlIIIIllllllIlI.getTriangles().getTriangleCount())) {
            n = ShapeRenderer.lIIllllllIIIlI[1];
            "".length();
            if (" ".length() >= "  ".length()) {
                return ((0x9C ^ 0xB9) & ~(0x12 ^ 0x37)) != 0x0;
            }
        }
        else {
            n = ShapeRenderer.lIIllllllIIIlI[0];
        }
        return n != 0;
    }
    
    public static final void draw(final Shape lllllllllllllIIlIIlIIIlIIIIIlIII, final ShapeFill lllllllllllllIIlIIlIIIlIIIIIIlll) {
        final float[] lllllllllllllIIlIIlIIIlIIIIIIllI = lllllllllllllIIlIIlIIIlIIIIIlIII.getPoints();
        final Texture lllllllllllllIIlIIlIIIlIIIIIIlIl = TextureImpl.getLastBind();
        TextureImpl.bindNone();
        final float[] lllllllllllllIIlIIlIIIlIIIIIIlII = lllllllllllllIIlIIlIIIlIIIIIlIII.getCenter();
        ShapeRenderer.GL.glBegin(ShapeRenderer.lIIllllllIIIlI[2]);
        int lllllllllllllIIlIIlIIIlIIIIIlIlI = ShapeRenderer.lIIllllllIIIlI[0];
        while (llIllllIlllIIIl(lllllllllllllIIlIIlIIIlIIIIIlIlI, lllllllllllllIIlIIlIIIlIIIIIIllI.length)) {
            lllllllllllllIIlIIlIIIlIIIIIIlll.colorAt(lllllllllllllIIlIIlIIIlIIIIIlIII, lllllllllllllIIlIIlIIIlIIIIIIllI[lllllllllllllIIlIIlIIIlIIIIIlIlI], lllllllllllllIIlIIlIIIlIIIIIIllI[lllllllllllllIIlIIlIIIlIIIIIlIlI + ShapeRenderer.lIIllllllIIIlI[1]]).bind();
            final Vector2f lllllllllllllIIlIIlIIIlIIIIIlIll = lllllllllllllIIlIIlIIIlIIIIIIlll.getOffsetAt(lllllllllllllIIlIIlIIIlIIIIIlIII, lllllllllllllIIlIIlIIIlIIIIIIllI[lllllllllllllIIlIIlIIIlIIIIIlIlI], lllllllllllllIIlIIlIIIlIIIIIIllI[lllllllllllllIIlIIlIIIlIIIIIlIlI + ShapeRenderer.lIIllllllIIIlI[1]]);
            ShapeRenderer.GL.glVertex2f(lllllllllllllIIlIIlIIIlIIIIIIllI[lllllllllllllIIlIIlIIIlIIIIIlIlI] + lllllllllllllIIlIIlIIIlIIIIIlIll.x, lllllllllllllIIlIIlIIIlIIIIIIllI[lllllllllllllIIlIIlIIIlIIIIIlIlI + ShapeRenderer.lIIllllllIIIlI[1]] + lllllllllllllIIlIIlIIIlIIIIIlIll.y);
            lllllllllllllIIlIIlIIIlIIIIIlIlI += 2;
            "".length();
            if (-(0x95 ^ 0xAF ^ (0x3A ^ 0x5)) >= 0) {
                return;
            }
        }
        if (llIllllIlllIIlI(lllllllllllllIIlIIlIIIlIIIIIlIII.closed() ? 1 : 0)) {
            lllllllllllllIIlIIlIIIlIIIIIIlll.colorAt(lllllllllllllIIlIIlIIIlIIIIIlIII, lllllllllllllIIlIIlIIIlIIIIIIllI[ShapeRenderer.lIIllllllIIIlI[0]], lllllllllllllIIlIIlIIIlIIIIIIllI[ShapeRenderer.lIIllllllIIIlI[1]]).bind();
            final Vector2f lllllllllllllIIlIIlIIIlIIIIIlIIl = lllllllllllllIIlIIlIIIlIIIIIIlll.getOffsetAt(lllllllllllllIIlIIlIIIlIIIIIlIII, lllllllllllllIIlIIlIIIlIIIIIIllI[ShapeRenderer.lIIllllllIIIlI[0]], lllllllllllllIIlIIlIIIlIIIIIIllI[ShapeRenderer.lIIllllllIIIlI[1]]);
            ShapeRenderer.GL.glVertex2f(lllllllllllllIIlIIlIIIlIIIIIIllI[ShapeRenderer.lIIllllllIIIlI[0]] + lllllllllllllIIlIIlIIIlIIIIIlIIl.x, lllllllllllllIIlIIlIIIlIIIIIIllI[ShapeRenderer.lIIllllllIIIlI[1]] + lllllllllllllIIlIIlIIIlIIIIIlIIl.y);
        }
        ShapeRenderer.GL.glEnd();
        if (llIllllIlllIIll(lllllllllllllIIlIIlIIIlIIIIIIlIl)) {
            TextureImpl.bindNone();
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIlIIIlIIIIIIlIl.bind();
        }
    }
    
    private static boolean llIllllIlllIIlI(final int lllllllllllllIIlIIlIIIIlIllIlIll) {
        return lllllllllllllIIlIIlIIIIlIllIlIll != 0;
    }
    
    public static final void fill(final Shape lllllllllllllIIlIIlIIIIlllllIlIl) {
        if (llIllllIlllIlII(validFill(lllllllllllllIIlIIlIIIIlllllIlIl) ? 1 : 0)) {
            return;
        }
        final Texture lllllllllllllIIlIIlIIIIlllllIllI = TextureImpl.getLastBind();
        TextureImpl.bindNone();
        fill(lllllllllllllIIlIIlIIIIlllllIlIl, new PointCallback() {
            public float[] preRenderPoint(final Shape lllllllllllllIIllIlIlIIIIlllllIl, final float lllllllllllllIIllIlIlIIIIlllllII, final float lllllllllllllIIllIlIlIIIIllllIll) {
                return null;
            }
        });
        if (llIllllIlllIIll(lllllllllllllIIlIIlIIIIlllllIllI)) {
            TextureImpl.bindNone();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIlIIIIlllllIllI.bind();
        }
    }
    
    public static final void draw(final Shape lllllllllllllIIlIIlIIIlIIIIlIllI) {
        final Texture lllllllllllllIIlIIlIIIlIIIIllIII = TextureImpl.getLastBind();
        TextureImpl.bindNone();
        final float[] lllllllllllllIIlIIlIIIlIIIIlIlll = lllllllllllllIIlIIlIIIlIIIIlIllI.getPoints();
        ShapeRenderer.LSR.start();
        int lllllllllllllIIlIIlIIIlIIIIllIlI = ShapeRenderer.lIIllllllIIIlI[0];
        while (llIllllIlllIIIl(lllllllllllllIIlIIlIIIlIIIIllIlI, lllllllllllllIIlIIlIIIlIIIIlIlll.length)) {
            ShapeRenderer.LSR.vertex(lllllllllllllIIlIIlIIIlIIIIlIlll[lllllllllllllIIlIIlIIIlIIIIllIlI], lllllllllllllIIlIIlIIIlIIIIlIlll[lllllllllllllIIlIIlIIIlIIIIllIlI + ShapeRenderer.lIIllllllIIIlI[1]]);
            lllllllllllllIIlIIlIIIlIIIIllIlI += 2;
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        if (llIllllIlllIIlI(lllllllllllllIIlIIlIIIlIIIIlIllI.closed() ? 1 : 0)) {
            ShapeRenderer.LSR.vertex(lllllllllllllIIlIIlIIIlIIIIlIlll[ShapeRenderer.lIIllllllIIIlI[0]], lllllllllllllIIlIIlIIIlIIIIlIlll[ShapeRenderer.lIIllllllIIIlI[1]]);
        }
        ShapeRenderer.LSR.end();
        if (llIllllIlllIIll(lllllllllllllIIlIIlIIIlIIIIllIII)) {
            TextureImpl.bindNone();
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIlIIIlIIIIllIII.bind();
        }
    }
    
    public static final void texture(final Shape lllllllllllllIIlIIlIIIIllIIIlIII, final Image lllllllllllllIIlIIlIIIIllIIIIlll, final float lllllllllllllIIlIIlIIIIllIIIllIl, final float lllllllllllllIIlIIlIIIIllIIIIlIl, final ShapeFill lllllllllllllIIlIIlIIIIllIIIIlII) {
        if (llIllllIlllIlII(validFill(lllllllllllllIIlIIlIIIIllIIIlIII) ? 1 : 0)) {
            return;
        }
        final Texture lllllllllllllIIlIIlIIIIllIIIlIlI = TextureImpl.getLastBind();
        lllllllllllllIIlIIlIIIIllIIIIlll.getTexture().bind();
        final float[] lllllllllllllIIlIIlIIIIllIIIlIIl = lllllllllllllIIlIIlIIIIllIIIlIII.getCenter();
        fill(lllllllllllllIIlIIlIIIIllIIIlIII, new PointCallback() {
            private static final /* synthetic */ int[] lIIlIllIIIlIlI;
            
            private static void llIlIIIlllIlIll() {
                (lIIlIllIIIlIlI = new int[3])[0] = ((0x31 ^ 0xF) & ~(0x67 ^ 0x59));
                ShapeRenderer$5.lIIlIllIIIlIlI[1] = " ".length();
                ShapeRenderer$5.lIIlIllIIIlIlI[2] = "  ".length();
            }
            
            static {
                llIlIIIlllIlIll();
            }
            
            public float[] preRenderPoint(final Shape lllllllllllllIIllIIlIlIllllIlIII, float lllllllllllllIIllIIlIlIllllIIlll, float lllllllllllllIIllIIlIlIllllIlllI) {
                lllllllllllllIIlIIlIIIIllIIIIlII.colorAt(lllllllllllllIIllIIlIlIllllIlIII, lllllllllllllIIllIIlIlIllllIIlll - lllllllllllllIIlIIlIIIIllIIIlIIl[ShapeRenderer$5.lIIlIllIIIlIlI[0]], lllllllllllllIIllIIlIlIllllIlllI - lllllllllllllIIlIIlIIIIllIIIlIIl[ShapeRenderer$5.lIIlIllIIIlIlI[1]]).bind();
                final Vector2f lllllllllllllIIllIIlIlIllllIllIl = lllllllllllllIIlIIlIIIIllIIIIlII.getOffsetAt(lllllllllllllIIllIIlIlIllllIlIII, lllllllllllllIIllIIlIlIllllIIlll, lllllllllllllIIllIIlIlIllllIlllI);
                lllllllllllllIIllIIlIlIllllIIlll += lllllllllllllIIllIIlIlIllllIllIl.x;
                lllllllllllllIIllIIlIlIllllIlllI += lllllllllllllIIllIIlIlIllllIllIl.y;
                float lllllllllllllIIllIIlIlIllllIllII = lllllllllllllIIllIIlIlIllllIIlll * lllllllllllllIIlIIlIIIIllIIIllIl;
                float lllllllllllllIIllIIlIlIllllIlIll = lllllllllllllIIllIIlIlIllllIlllI * lllllllllllllIIlIIlIIIIllIIIIlIl;
                lllllllllllllIIllIIlIlIllllIllII = lllllllllllllIIlIIlIIIIllIIIIlll.getTextureOffsetX() + lllllllllllllIIlIIlIIIIllIIIIlll.getTextureWidth() * lllllllllllllIIllIIlIlIllllIllII;
                lllllllllllllIIllIIlIlIllllIlIll = lllllllllllllIIlIIlIIIIllIIIIlll.getTextureOffsetY() + lllllllllllllIIlIIlIIIIllIIIIlll.getTextureHeight() * lllllllllllllIIllIIlIlIllllIlIll;
                ShapeRenderer.GL.glTexCoord2f(lllllllllllllIIllIIlIlIllllIllII, lllllllllllllIIllIIlIlIllllIlIll);
                final float[] array = new float[ShapeRenderer$5.lIIlIllIIIlIlI[2]];
                array[ShapeRenderer$5.lIIlIllIIIlIlI[0]] = lllllllllllllIIllIIlIlIllllIllIl.x + lllllllllllllIIllIIlIlIllllIIlll;
                array[ShapeRenderer$5.lIIlIllIIIlIlI[1]] = lllllllllllllIIllIIlIlIllllIllIl.y + lllllllllllllIIllIIlIlIllllIlllI;
                return array;
            }
        });
        if (llIllllIlllIIll(lllllllllllllIIlIIlIIIIllIIIlIlI)) {
            TextureImpl.bindNone();
            "".length();
            if (-(0x21 ^ 0x24) >= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIlIIIIllIIIlIlI.bind();
        }
    }
    
    private interface PointCallback
    {
        float[] preRenderPoint(final Shape p0, final float p1, final float p2);
    }
}
