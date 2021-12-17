// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.security.AccessController;
import org.newdawn.slick.util.Log;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.security.PrivilegedAction;
import org.newdawn.slick.util.FastTrig;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.geom.ShapeRenderer;
import org.newdawn.slick.opengl.TextureImpl;
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.geom.Shape;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.opengl.renderer.LineStripRenderer;
import java.nio.DoubleBuffer;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.geom.Rectangle;

public class Graphics
{
    private /* synthetic */ Rectangle worldClipRecord;
    private /* synthetic */ boolean antialias;
    private static final /* synthetic */ int[] llIIIIIIIllllI;
    protected static /* synthetic */ SGL GL;
    private /* synthetic */ Rectangle clip;
    protected /* synthetic */ int screenWidth;
    private static final /* synthetic */ String[] llIIIIIIIlllIl;
    private /* synthetic */ ByteBuffer readBuffer;
    private /* synthetic */ ArrayList stack;
    public static /* synthetic */ int MODE_ALPHA_BLEND;
    private /* synthetic */ Color currentColor;
    private /* synthetic */ Font font;
    private /* synthetic */ int stackIndex;
    public static /* synthetic */ int MODE_COLOR_MULTIPLY;
    public static /* synthetic */ int MODE_SCREEN;
    private /* synthetic */ int currentDrawingMode;
    public static /* synthetic */ int MODE_NORMAL;
    private /* synthetic */ DoubleBuffer worldClip;
    protected /* synthetic */ int screenHeight;
    private /* synthetic */ boolean pushed;
    private static /* synthetic */ LineStripRenderer LSR;
    private /* synthetic */ float lineWidth;
    private /* synthetic */ float sy;
    protected static /* synthetic */ Font DEFAULT_FONT;
    public static /* synthetic */ int MODE_ALPHA_MAP;
    private /* synthetic */ float sx;
    public static /* synthetic */ int MODE_ADD;
    protected static /* synthetic */ Graphics currentGraphics;
    
    private void predraw() {
        setCurrent(this);
    }
    
    public void setDrawMode(final int llllllllllllIllllIIIIIllllIlIlII) {
        this.predraw();
        this.currentDrawingMode = llllllllllllIllllIIIIIllllIlIlII;
        if (lIIIIllIlIlllIII(this.currentDrawingMode, Graphics.MODE_NORMAL)) {
            Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[1]);
            Graphics.GL.glColorMask((boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0));
            Graphics.GL.glBlendFunc(Graphics.llIIIIIIIllllI[3], Graphics.llIIIIIIIllllI[4]);
        }
        if (lIIIIllIlIlllIII(this.currentDrawingMode, Graphics.MODE_ALPHA_MAP)) {
            Graphics.GL.glDisable(Graphics.llIIIIIIIllllI[1]);
            Graphics.GL.glColorMask((boolean)(Graphics.llIIIIIIIllllI[5] != 0), (boolean)(Graphics.llIIIIIIIllllI[5] != 0), (boolean)(Graphics.llIIIIIIIllllI[5] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0));
        }
        if (lIIIIllIlIlllIII(this.currentDrawingMode, Graphics.MODE_ALPHA_BLEND)) {
            Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[1]);
            Graphics.GL.glColorMask((boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[5] != 0));
            Graphics.GL.glBlendFunc(Graphics.llIIIIIIIllllI[6], Graphics.llIIIIIIIllllI[7]);
        }
        if (lIIIIllIlIlllIII(this.currentDrawingMode, Graphics.MODE_COLOR_MULTIPLY)) {
            Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[1]);
            Graphics.GL.glColorMask((boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0));
            Graphics.GL.glBlendFunc(Graphics.llIIIIIIIllllI[8], Graphics.llIIIIIIIllllI[9]);
        }
        if (lIIIIllIlIlllIII(this.currentDrawingMode, Graphics.MODE_ADD)) {
            Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[1]);
            Graphics.GL.glColorMask((boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0));
            Graphics.GL.glBlendFunc(Graphics.llIIIIIIIllllI[2], Graphics.llIIIIIIIllllI[2]);
        }
        if (lIIIIllIlIlllIII(this.currentDrawingMode, Graphics.MODE_SCREEN)) {
            Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[1]);
            Graphics.GL.glColorMask((boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0), (boolean)(Graphics.llIIIIIIIllllI[2] != 0));
            Graphics.GL.glBlendFunc(Graphics.llIIIIIIIllllI[2], Graphics.llIIIIIIIllllI[8]);
        }
        this.postdraw();
    }
    
    private static String lIIIIllIlIllIIlI(String llllllllllllIlllIlllllllllllIIIl, final String llllllllllllIlllIlllllllllllIlIl) {
        llllllllllllIlllIlllllllllllIIIl = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlllllllllllIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlllllllllllIlII = new StringBuilder();
        final char[] llllllllllllIlllIlllllllllllIIll = llllllllllllIlllIlllllllllllIlIl.toCharArray();
        int llllllllllllIlllIlllllllllllIIlI = Graphics.llIIIIIIIllllI[5];
        final boolean llllllllllllIlllIllllllllllIllII = (Object)((String)llllllllllllIlllIlllllllllllIIIl).toCharArray();
        final double llllllllllllIlllIllllllllllIlIll = llllllllllllIlllIllllllllllIllII.length;
        byte llllllllllllIlllIllllllllllIlIlI = (byte)Graphics.llIIIIIIIllllI[5];
        while (lIIIIllIlIlllllI(llllllllllllIlllIllllllllllIlIlI, (int)llllllllllllIlllIllllllllllIlIll)) {
            final char llllllllllllIlllIlllllllllllIlll = llllllllllllIlllIllllllllllIllII[llllllllllllIlllIllllllllllIlIlI];
            llllllllllllIlllIlllllllllllIlII.append((char)(llllllllllllIlllIlllllllllllIlll ^ llllllllllllIlllIlllllllllllIIll[llllllllllllIlllIlllllllllllIIlI % llllllllllllIlllIlllllllllllIIll.length]));
            "".length();
            ++llllllllllllIlllIlllllllllllIIlI;
            ++llllllllllllIlllIllllllllllIlIlI;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllllllllllIlII);
    }
    
    protected void enable() {
    }
    
    public void clearAlphaMap() {
        this.pushTransform();
        Graphics.GL.glLoadIdentity();
        final int llllllllllllIllllIIIIIllllIIlllI = this.currentDrawingMode;
        this.setDrawMode(Graphics.MODE_ALPHA_MAP);
        this.setColor(new Color(Graphics.llIIIIIIIllllI[5], Graphics.llIIIIIIIllllI[5], Graphics.llIIIIIIIllllI[5], Graphics.llIIIIIIIllllI[5]));
        this.fillRect(0.0f, 0.0f, (float)this.screenWidth, (float)this.screenHeight);
        this.setColor(this.currentColor);
        this.setDrawMode(llllllllllllIllllIIIIIllllIIlllI);
        this.popTransform();
    }
    
    void setDimensions(final int llllllllllllIllllIIIIIllllIllIIl, final int llllllllllllIllllIIIIIllllIllIII) {
        this.screenWidth = llllllllllllIllllIIIIIllllIllIIl;
        this.screenHeight = llllllllllllIllllIIIIIllllIllIII;
    }
    
    public void copyArea(final Image llllllllllllIllllIIIIIIIlIllIllI, final int llllllllllllIllllIIIIIIIlIlllIlI, final int llllllllllllIllllIIIIIIIlIlllIIl) {
        int n;
        if (lIIIIllIlIlllIlI(llllllllllllIllllIIIIIIIlIllIllI.getTexture().hasAlpha() ? 1 : 0)) {
            n = Graphics.llIIIIIIIllllI[24];
            "".length();
            if (((0x9B ^ 0x9C) & ~(0x27 ^ 0x20)) < -" ".length()) {
                return;
            }
        }
        else {
            n = Graphics.llIIIIIIIllllI[25];
        }
        final int llllllllllllIllllIIIIIIIlIlllIII = n;
        llllllllllllIllllIIIIIIIlIllIllI.bind();
        Graphics.GL.glCopyTexImage2D(Graphics.llIIIIIIIllllI[26], Graphics.llIIIIIIIllllI[5], llllllllllllIllllIIIIIIIlIlllIII, llllllllllllIllllIIIIIIIlIlllIlI, this.screenHeight - (llllllllllllIllllIIIIIIIlIlllIIl + llllllllllllIllllIIIIIIIlIllIllI.getHeight()), llllllllllllIllllIIIIIIIlIllIllI.getTexture().getTextureWidth(), llllllllllllIllllIIIIIIIlIllIllI.getTexture().getTextureHeight(), Graphics.llIIIIIIIllllI[5]);
        llllllllllllIllllIIIIIIIlIllIllI.ensureInverted();
    }
    
    public float getLineWidth() {
        return this.lineWidth;
    }
    
    public void scale(final float llllllllllllIllllIIIIIlllIlIIllI, final float llllllllllllIllllIIIIIlllIlIIlIl) {
        this.sx *= llllllllllllIllllIIIIIlllIlIIllI;
        this.sy *= llllllllllllIllllIIIIIlllIlIIlIl;
        this.checkPush();
        this.predraw();
        Graphics.GL.glScalef(llllllllllllIllllIIIIIlllIlIIllI, llllllllllllIllllIIIIIlllIlIIlIl, 1.0f);
        this.postdraw();
    }
    
    private static int lIIIIllIllIIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void texture(final Shape llllllllllllIllllIIIIIllIIllllIl, final Image llllllllllllIllllIIIIIllIIllllII) {
        this.texture(llllllllllllIllllIIIIIllIIllllIl, llllllllllllIllllIIIIIllIIllllII, 0.01f, 0.01f, (boolean)(Graphics.llIIIIIIIllllI[5] != 0));
    }
    
    public void drawOval(final float llllllllllllIllllIIIIIlIIllIllII, final float llllllllllllIllllIIIIIlIIllIIllI, final float llllllllllllIllllIIIIIlIIllIlIlI, final float llllllllllllIllllIIIIIlIIllIlIIl) {
        this.drawOval(llllllllllllIllllIIIIIlIIllIllII, llllllllllllIllllIIIIIlIIllIIllI, llllllllllllIllllIIIIIlIIllIlIlI, llllllllllllIllllIIIIIlIIllIlIIl, Graphics.llIIIIIIIllllI[20]);
    }
    
    public Rectangle getWorldClip() {
        return this.worldClipRecord;
    }
    
    public void setFont(final Font llllllllllllIllllIIIIIlllIIIlIIl) {
        this.font = llllllllllllIllllIIIIIlllIIIlIIl;
    }
    
    public Color getBackground() {
        this.predraw();
        final FloatBuffer llllllllllllIllllIIIIIlllIllIllI = BufferUtils.createFloatBuffer(Graphics.llIIIIIIIllllI[10]);
        Graphics.GL.glGetFloat(Graphics.llIIIIIIIllllI[11], llllllllllllIllllIIIIIlllIllIllI);
        this.postdraw();
        return new Color(llllllllllllIllllIIIIIlllIllIllI);
    }
    
    public void resetTransform() {
        this.sx = 1.0f;
        this.sy = 1.0f;
        if (lIIIIllIlIlllIlI(this.pushed ? 1 : 0)) {
            this.predraw();
            Graphics.GL.glPopMatrix();
            this.pushed = (Graphics.llIIIIIIIllllI[5] != 0);
            this.postdraw();
        }
    }
    
    private static boolean lIIIIllIlIlllIIl(final Object llllllllllllIlllIlllllllllIlIIII, final Object llllllllllllIlllIlllllllllIIllll) {
        return llllllllllllIlllIlllllllllIlIIII == llllllllllllIlllIlllllllllIIllll;
    }
    
    private static boolean lIIIIllIllIIIlIl(final int llllllllllllIlllIllllllllllIIIlI, final int llllllllllllIlllIllllllllllIIIIl) {
        return llllllllllllIlllIllllllllllIIIlI >= llllllllllllIlllIllllllllllIIIIl;
    }
    
    public static void setCurrent(final Graphics llllllllllllIllllIIIIIlllllIllIl) {
        if (lIIIIllIlIllIlIl(Graphics.currentGraphics, llllllllllllIllllIIIIIlllllIllIl)) {
            if (lIIIIllIlIllIllI(Graphics.currentGraphics)) {
                Graphics.currentGraphics.disable();
            }
            (Graphics.currentGraphics = llllllllllllIllllIIIIIlllllIllIl).enable();
        }
    }
    
    public void popTransform() {
        if (lIIIIllIlIlllIll(this.stackIndex)) {
            throw new RuntimeException(Graphics.llIIIIIIIlllIl[Graphics.llIIIIIIIllllI[29]]);
        }
        this.predraw();
        this.stackIndex -= Graphics.llIIIIIIIllllI[2];
        final FloatBuffer llllllllllllIllllIIIIIIIIIIlIIIl = this.stack.get(this.stackIndex);
        Graphics.GL.glLoadMatrix(llllllllllllIllllIIIIIIIIIIlIIIl);
        this.sx = llllllllllllIllllIIIIIIIIIIlIIIl.get(Graphics.llIIIIIIIllllI[10]);
        this.sy = llllllllllllIllllIIIIIIIIIIlIIIl.get(Graphics.llIIIIIIIllllI[32]);
        this.postdraw();
    }
    
    public void draw(final Shape llllllllllllIllllIIIIIllIlIIlIll) {
        this.predraw();
        TextureImpl.bindNone();
        this.currentColor.bind();
        ShapeRenderer.draw(llllllllllllIllllIIIIIllIlIIlIll);
        this.postdraw();
    }
    
    private static int lIIIIllIlIllllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setWorldClip(final Rectangle llllllllllllIllllIIIIIlIllIIIlII) {
        if (lIIIIllIlIllIlll(llllllllllllIllllIIIIIlIllIIIlII)) {
            this.clearWorldClip();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            this.setWorldClip(llllllllllllIllllIIIIIlIllIIIlII.getX(), llllllllllllIllllIIIIIlIllIIIlII.getY(), llllllllllllIllllIIIIIlIllIIIlII.getWidth(), llllllllllllIllllIIIIIlIllIIIlII.getHeight());
        }
    }
    
    public Color getPixel(final int llllllllllllIllllIIIIIIIlIlIIlll, final int llllllllllllIllllIIIIIIIlIlIIllI) {
        this.predraw();
        Graphics.GL.glReadPixels(llllllllllllIllllIIIIIIIlIlIIlll, this.screenHeight - llllllllllllIllllIIIIIIIlIlIIllI, Graphics.llIIIIIIIllllI[2], Graphics.llIIIIIIIllllI[2], Graphics.llIIIIIIIllllI[24], Graphics.llIIIIIIIllllI[28], this.readBuffer);
        this.postdraw();
        return new Color(this.translate(this.readBuffer.get(Graphics.llIIIIIIIllllI[5])), this.translate(this.readBuffer.get(Graphics.llIIIIIIIllllI[2])), this.translate(this.readBuffer.get(Graphics.llIIIIIIIllllI[18])), this.translate(this.readBuffer.get(Graphics.llIIIIIIIllllI[29])));
    }
    
    private static boolean lIIIIllIlIlllIII(final int llllllllllllIlllIllllllllllIIllI, final int llllllllllllIlllIllllllllllIIlIl) {
        return llllllllllllIlllIllllllllllIIllI == llllllllllllIlllIllllllllllIIlIl;
    }
    
    public void fillRoundRect(final float llllllllllllIllllIIIIIIlIlllIlII, final float llllllllllllIllllIIIIIIlIllIllIl, final float llllllllllllIllllIIIIIIlIllIllII, final float llllllllllllIllllIIIIIIlIlllIIIl, final int llllllllllllIllllIIIIIIlIllIlIlI) {
        this.fillRoundRect(llllllllllllIllllIIIIIIlIlllIlII, llllllllllllIllllIIIIIIlIllIllIl, llllllllllllIllllIIIIIIlIllIllII, llllllllllllIllllIIIIIIlIlllIIIl, llllllllllllIllllIIIIIIlIllIlIlI, Graphics.llIIIIIIIllllI[20]);
    }
    
    public void setLineWidth(final float llllllllllllIllllIIIIIIlIlIIlIll) {
        this.predraw();
        this.lineWidth = llllllllllllIllllIIIIIIlIlIIlIll;
        Graphics.LSR.setWidth(llllllllllllIllllIIIIIIlIlIIlIll);
        Graphics.GL.glPointSize(llllllllllllIllllIIIIIIlIlIIlIll);
        this.postdraw();
    }
    
    private static boolean lIIIIllIllIIIlII(final int llllllllllllIlllIlllllllllIllIlI, final int llllllllllllIlllIlllllllllIllIIl) {
        return llllllllllllIlllIlllllllllIllIlI > llllllllllllIlllIlllllllllIllIIl;
    }
    
    public void drawOval(final float llllllllllllIllllIIIIIlIIlIlIllI, final float llllllllllllIllllIIIIIlIIlIlIlIl, final float llllllllllllIllllIIIIIlIIlIlIlII, final float llllllllllllIllllIIIIIlIIlIlIIll, final int llllllllllllIllllIIIIIlIIlIllIII) {
        this.drawArc(llllllllllllIllllIIIIIlIIlIlIllI, llllllllllllIllllIIIIIlIIlIlIlIl, llllllllllllIllllIIIIIlIIlIlIlII, llllllllllllIllllIIIIIlIIlIlIIll, llllllllllllIllllIIIIIlIIlIllIII, 0.0f, 360.0f);
    }
    
    private static int lIIIIllIllIIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setClip(final Rectangle llllllllllllIllllIIIIIlIlIlIllII) {
        if (lIIIIllIlIllIlll(llllllllllllIllllIIIIIlIlIlIllII)) {
            this.clearClip();
            return;
        }
        this.setClip((int)llllllllllllIllllIIIIIlIlIlIllII.getX(), (int)llllllllllllIllllIIIIIlIlIlIllII.getY(), (int)llllllllllllIllllIIIIIlIlIlIllII.getWidth(), (int)llllllllllllIllllIIIIIlIlIlIllII.getHeight());
    }
    
    public void drawAnimation(final Animation llllllllllllIllllIIIIIIlIIIIllII, final float llllllllllllIllllIIIIIIlIIIIlIll, final float llllllllllllIllllIIIIIIlIIIIIlIl, final Color llllllllllllIllllIIIIIIlIIIIlIIl) {
        this.predraw();
        llllllllllllIllllIIIIIIlIIIIllII.draw(llllllllllllIllllIIIIIIlIIIIlIll, llllllllllllIllllIIIIIIlIIIIIlIl, llllllllllllIllllIIIIIIlIIIIlIIl);
        this.currentColor.bind();
        this.postdraw();
    }
    
    public void drawArc(final float llllllllllllIllllIIIIIlIIlIIIIlI, final float llllllllllllIllllIIIIIlIIlIIlIII, final float llllllllllllIllllIIIIIlIIlIIIIII, final float llllllllllllIllllIIIIIlIIlIIIllI, final float llllllllllllIllllIIIIIlIIlIIIlIl, final float llllllllllllIllllIIIIIlIIIllllIl) {
        this.drawArc(llllllllllllIllllIIIIIlIIlIIIIlI, llllllllllllIllllIIIIIlIIlIIlIII, llllllllllllIllllIIIIIlIIlIIIIII, llllllllllllIllllIIIIIlIIlIIIllI, Graphics.llIIIIIIIllllI[20], llllllllllllIllllIIIIIlIIlIIIlIl, llllllllllllIllllIIIIIlIIIllllIl);
    }
    
    public Graphics() {
        this.sx = 1.0f;
        this.sy = 1.0f;
        this.currentColor = Color.white;
        this.worldClip = BufferUtils.createDoubleBuffer(Graphics.llIIIIIIIllllI[0]);
        this.readBuffer = BufferUtils.createByteBuffer(Graphics.llIIIIIIIllllI[0]);
        this.currentDrawingMode = Graphics.MODE_NORMAL;
        this.lineWidth = 1.0f;
        this.stack = new ArrayList();
    }
    
    public void texture(final Shape llllllllllllIllllIIIIIllIIIIIlll, final Image llllllllllllIllllIIIIIllIIIIIllI, final float llllllllllllIllllIIIIIllIIIIIlIl, final float llllllllllllIllllIIIIIllIIIIIlII, final boolean llllllllllllIllllIIIIIllIIIIIIll) {
        this.predraw();
        TextureImpl.bindNone();
        this.currentColor.bind();
        if (lIIIIllIlIlllIlI(llllllllllllIllllIIIIIllIIIIIIll ? 1 : 0)) {
            ShapeRenderer.textureFit(llllllllllllIllllIIIIIllIIIIIlll, llllllllllllIllllIIIIIllIIIIIllI, llllllllllllIllllIIIIIllIIIIIlIl, llllllllllllIllllIIIIIllIIIIIlII);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            ShapeRenderer.texture(llllllllllllIllllIIIIIllIIIIIlll, llllllllllllIllllIIIIIllIIIIIllI, llllllllllllIllllIIIIIllIIIIIlIl, llllllllllllIllllIIIIIllIIIIIlII);
        }
        this.postdraw();
    }
    
    public void clearWorldClip() {
        this.predraw();
        this.worldClipRecord = null;
        Graphics.GL.glDisable(Graphics.llIIIIIIIllllI[14]);
        Graphics.GL.glDisable(Graphics.llIIIIIIIllllI[15]);
        Graphics.GL.glDisable(Graphics.llIIIIIIIllllI[16]);
        Graphics.GL.glDisable(Graphics.llIIIIIIIllllI[17]);
        this.postdraw();
    }
    
    public Color getColor() {
        return new Color(this.currentColor);
    }
    
    static {
        lIIIIllIlIllIlII();
        lIIIIllIlIllIIll();
        DEFAULT_SEGMENTS = Graphics.llIIIIIIIllllI[20];
        Graphics.GL = Renderer.get();
        Graphics.LSR = Renderer.getLineStripRenderer();
        Graphics.MODE_NORMAL = Graphics.llIIIIIIIllllI[2];
        Graphics.MODE_ALPHA_MAP = Graphics.llIIIIIIIllllI[18];
        Graphics.MODE_ALPHA_BLEND = Graphics.llIIIIIIIllllI[29];
        Graphics.MODE_COLOR_MULTIPLY = Graphics.llIIIIIIIllllI[0];
        Graphics.MODE_ADD = Graphics.llIIIIIIIllllI[33];
        Graphics.MODE_SCREEN = Graphics.llIIIIIIIllllI[22];
        Graphics.currentGraphics = null;
    }
    
    private static boolean lIIIIllIlIlllIlI(final int llllllllllllIlllIlllllllllIIlIll) {
        return llllllllllllIlllIlllllllllIIlIll != 0;
    }
    
    public void setColor(final Color llllllllllllIllllIIIIIlllIIIIIII) {
        if (lIIIIllIlIllIlll(llllllllllllIllllIIIIIlllIIIIIII)) {
            return;
        }
        this.currentColor = new Color(llllllllllllIllllIIIIIlllIIIIIII);
        this.predraw();
        this.currentColor.bind();
        this.postdraw();
    }
    
    public void drawImage(final Image llllllllllllIllllIIIIIIIlllIIIlI, final float llllllllllllIllllIIIIIIIlllIIIIl, final float llllllllllllIllllIIIIIIIlllIlIlI, final float llllllllllllIllllIIIIIIIllIlllll, final float llllllllllllIllllIIIIIIIllIllllI, final float llllllllllllIllllIIIIIIIlllIIlll, final float llllllllllllIllllIIIIIIIlllIIllI, final float llllllllllllIllllIIIIIIIlllIIlIl, final float llllllllllllIllllIIIIIIIlllIIlII) {
        this.predraw();
        llllllllllllIllllIIIIIIIlllIIIlI.draw(llllllllllllIllllIIIIIIIlllIIIIl, llllllllllllIllllIIIIIIIlllIlIlI, llllllllllllIllllIIIIIIIllIlllll, llllllllllllIllllIIIIIIIllIllllI, llllllllllllIllllIIIIIIIlllIIlll, llllllllllllIllllIIIIIIIlllIIllI, llllllllllllIllllIIIIIIIlllIIlIl, llllllllllllIllllIIIIIIIlllIIlII);
        this.currentColor.bind();
        this.postdraw();
    }
    
    public void setWorldClip(final float llllllllllllIllllIIIIIlIllIlIIII, final float llllllllllllIllllIIIIIlIllIIllll, final float llllllllllllIllllIIIIIlIllIlIIll, final float llllllllllllIllllIIIIIlIllIlIIlI) {
        this.predraw();
        this.worldClipRecord = new Rectangle(llllllllllllIllllIIIIIlIllIlIIII, llllllllllllIllllIIIIIlIllIIllll, llllllllllllIllllIIIIIlIllIlIIll, llllllllllllIllllIIIIIlIllIlIIlI);
        Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[14]);
        this.worldClip.put(1.0).put(0.0).put(0.0).put(-llllllllllllIllllIIIIIlIllIlIIII).flip();
        "".length();
        Graphics.GL.glClipPlane(Graphics.llIIIIIIIllllI[14], this.worldClip);
        Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[15]);
        this.worldClip.put(-1.0).put(0.0).put(0.0).put(llllllllllllIllllIIIIIlIllIlIIII + llllllllllllIllllIIIIIlIllIlIIll).flip();
        "".length();
        Graphics.GL.glClipPlane(Graphics.llIIIIIIIllllI[15], this.worldClip);
        Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[16]);
        this.worldClip.put(0.0).put(1.0).put(0.0).put(-llllllllllllIllllIIIIIlIllIIllll).flip();
        "".length();
        Graphics.GL.glClipPlane(Graphics.llIIIIIIIllllI[16], this.worldClip);
        Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[17]);
        this.worldClip.put(0.0).put(-1.0).put(0.0).put(llllllllllllIllllIIIIIlIllIIllll + llllllllllllIllllIIIIIlIllIlIIlI).flip();
        "".length();
        Graphics.GL.glClipPlane(Graphics.llIIIIIIIllllI[17], this.worldClip);
        this.postdraw();
    }
    
    public void drawLine(float llllllllllllIllllIIIIIllIllIlIII, float llllllllllllIllllIIIIIllIllIIlll, float llllllllllllIllllIIIIIllIllIIllI, float llllllllllllIllllIIIIIllIllIIlIl) {
        float llllllllllllIllllIIIIIllIllIlIlI = this.lineWidth - 1.0f;
        if (lIIIIllIlIlllIlI(Graphics.LSR.applyGLLineFixes() ? 1 : 0)) {
            if (lIIIIllIlIlllIll(lIIIIllIlIllllII(llllllllllllIllllIIIIIllIllIlIII, llllllllllllIllllIIIIIllIllIIllI))) {
                if (lIIIIllIlIllllIl(lIIIIllIlIllllII(llllllllllllIllllIIIIIllIllIIlll, llllllllllllIllllIIIIIllIllIIlIl))) {
                    final float llllllllllllIllllIIIIIllIlllIIll = llllllllllllIllllIIIIIllIllIIlIl;
                    llllllllllllIllllIIIIIllIllIIlIl = llllllllllllIllllIIIIIllIllIIlll;
                    llllllllllllIllllIIIIIllIllIIlll = llllllllllllIllllIIIIIllIlllIIll;
                }
                final float llllllllllllIllllIIIIIllIlllIIlI = 1.0f / this.sy;
                llllllllllllIllllIIIIIllIllIlIlI /= this.sy;
                this.fillRect(llllllllllllIllllIIIIIllIllIlIII - llllllllllllIllllIIIIIllIllIlIlI / 2.0f, llllllllllllIllllIIIIIllIllIIlll - llllllllllllIllllIIIIIllIllIlIlI / 2.0f, llllllllllllIllllIIIIIllIllIlIlI + llllllllllllIllllIIIIIllIlllIIlI, llllllllllllIllllIIIIIllIllIIlIl - llllllllllllIllllIIIIIllIllIIlll + llllllllllllIllllIIIIIllIllIlIlI + llllllllllllIllllIIIIIllIlllIIlI);
                return;
            }
            if (lIIIIllIlIlllIll(lIIIIllIlIllllII(llllllllllllIllllIIIIIllIllIIlll, llllllllllllIllllIIIIIllIllIIlIl))) {
                if (lIIIIllIlIllllIl(lIIIIllIlIllllII(llllllllllllIllllIIIIIllIllIlIII, llllllllllllIllllIIIIIllIllIIllI))) {
                    final float llllllllllllIllllIIIIIllIlllIIIl = llllllllllllIllllIIIIIllIllIIllI;
                    llllllllllllIllllIIIIIllIllIIllI = llllllllllllIllllIIIIIllIllIlIII;
                    llllllllllllIllllIIIIIllIllIlIII = llllllllllllIllllIIIIIllIlllIIIl;
                }
                final float llllllllllllIllllIIIIIllIlllIIII = 1.0f / this.sx;
                llllllllllllIllllIIIIIllIllIlIlI /= this.sx;
                this.fillRect(llllllllllllIllllIIIIIllIllIlIII - llllllllllllIllllIIIIIllIllIlIlI / 2.0f, llllllllllllIllllIIIIIllIllIIlll - llllllllllllIllllIIIIIllIllIlIlI / 2.0f, llllllllllllIllllIIIIIllIllIIllI - llllllllllllIllllIIIIIllIllIlIII + llllllllllllIllllIIIIIllIllIlIlI + llllllllllllIllllIIIIIllIlllIIII, llllllllllllIllllIIIIIllIllIlIlI + llllllllllllIllllIIIIIllIlllIIII);
                return;
            }
        }
        this.predraw();
        this.currentColor.bind();
        TextureImpl.bindNone();
        Graphics.LSR.start();
        Graphics.LSR.vertex(llllllllllllIllllIIIIIllIllIlIII, llllllllllllIllllIIIIIllIllIIlll);
        Graphics.LSR.vertex(llllllllllllIllllIIIIIllIllIIllI, llllllllllllIllllIIIIIllIllIIlIl);
        Graphics.LSR.end();
        this.postdraw();
    }
    
    private void postdraw() {
    }
    
    private static boolean lIIIIllIlIllllIl(final int llllllllllllIlllIlllllllllIIIlIl) {
        return llllllllllllIlllIlllllllllIIIlIl > 0;
    }
    
    public void setAntiAlias(final boolean llllllllllllIllllIIIIIIlIIllllll) {
        this.predraw();
        this.antialias = llllllllllllIllllIIIIIIlIIllllll;
        Graphics.LSR.setAntiAlias(llllllllllllIllllIIIIIIlIIllllll);
        if (lIIIIllIlIlllIlI(llllllllllllIllllIIIIIIlIIllllll ? 1 : 0)) {
            Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[23]);
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            Graphics.GL.glDisable(Graphics.llIIIIIIIllllI[23]);
        }
        this.postdraw();
    }
    
    public void fillRect(final float llllllllllllIllllIIIIIlIlIIIllIl, final float llllllllllllIllllIIIIIlIlIIlIlll, final float llllllllllllIllllIIIIIlIlIIIlIll, final float llllllllllllIllllIIIIIlIlIIIlIlI, final Image llllllllllllIllllIIIIIlIlIIlIlII, final float llllllllllllIllllIIIIIlIlIIlIIll, final float llllllllllllIllllIIIIIlIlIIIIlll) {
        final int llllllllllllIllllIIIIIlIlIIlIIIl = (int)Math.ceil(llllllllllllIllllIIIIIlIlIIIlIll / llllllllllllIllllIIIIIlIlIIlIlII.getWidth()) + Graphics.llIIIIIIIllllI[18];
        final int llllllllllllIllllIIIIIlIlIIlIIII = (int)Math.ceil(llllllllllllIllllIIIIIlIlIIIlIlI / llllllllllllIllllIIIIIlIlIIlIlII.getHeight()) + Graphics.llIIIIIIIllllI[18];
        final Rectangle llllllllllllIllllIIIIIlIlIIIllll = this.getWorldClip();
        this.setWorldClip(llllllllllllIllllIIIIIlIlIIIllIl, llllllllllllIllllIIIIIlIlIIlIlll, llllllllllllIllllIIIIIlIlIIIlIll, llllllllllllIllllIIIIIlIlIIIlIlI);
        this.predraw();
        int llllllllllllIllllIIIIIlIlIIllIlI = Graphics.llIIIIIIIllllI[5];
        while (lIIIIllIlIlllllI(llllllllllllIllllIIIIIlIlIIllIlI, llllllllllllIllllIIIIIlIlIIlIIIl)) {
            int llllllllllllIllllIIIIIlIlIIllIll = Graphics.llIIIIIIIllllI[5];
            while (lIIIIllIlIlllllI(llllllllllllIllllIIIIIlIlIIllIll, llllllllllllIllllIIIIIlIlIIlIIII)) {
                llllllllllllIllllIIIIIlIlIIlIlII.draw(llllllllllllIllllIIIIIlIlIIllIlI * llllllllllllIllllIIIIIlIlIIlIlII.getWidth() + llllllllllllIllllIIIIIlIlIIIllIl - llllllllllllIllllIIIIIlIlIIlIIll, llllllllllllIllllIIIIIlIlIIllIll * llllllllllllIllllIIIIIlIlIIlIlII.getHeight() + llllllllllllIllllIIIIIlIlIIlIlll - llllllllllllIllllIIIIIlIlIIIIlll);
                ++llllllllllllIllllIIIIIlIlIIllIll;
                "".length();
                if ((("   ".length() ^ (0x85 ^ 0xBB)) & (176 + 51 - 185 + 141 ^ 59 + 51 - 69 + 97 ^ -" ".length())) >= "   ".length()) {
                    return;
                }
            }
            ++llllllllllllIllllIIIIIlIlIIllIlI;
            "".length();
            if (" ".length() == ((0x3D ^ 0x11) & ~(0xEF ^ 0xC3))) {
                return;
            }
        }
        this.postdraw();
        this.setWorldClip(llllllllllllIllllIIIIIlIlIIIllll);
    }
    
    public void drawRoundRect(final float llllllllllllIllllIIIIIIllIIllIll, final float llllllllllllIllllIIIIIIllIlIIIII, final float llllllllllllIllllIIIIIIllIIlllll, final float llllllllllllIllllIIIIIIllIIllIII, final int llllllllllllIllllIIIIIIllIIlIlll) {
        this.drawRoundRect(llllllllllllIllllIIIIIIllIIllIll, llllllllllllIllllIIIIIIllIlIIIII, llllllllllllIllllIIIIIIllIIlllll, llllllllllllIllllIIIIIIllIIllIII, llllllllllllIllllIIIIIIllIIlIlll, Graphics.llIIIIIIIllllI[20]);
    }
    
    private static boolean lIIIIllIllIIIIIl(final int llllllllllllIlllIlllllllllIIIlll) {
        return llllllllllllIlllIlllllllllIIIlll < 0;
    }
    
    private static boolean lIIIIllIlIllIllI(final Object llllllllllllIlllIlllllllllIlIIll) {
        return llllllllllllIlllIlllllllllIlIIll != null;
    }
    
    protected void disable() {
    }
    
    public void flush() {
        if (lIIIIllIlIlllIIl(Graphics.currentGraphics, this)) {
            Graphics.currentGraphics.disable();
            Graphics.currentGraphics = null;
        }
    }
    
    private static int lIIIIllIllIIIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIIllIlIllIlll(final Object llllllllllllIlllIlllllllllIIllIl) {
        return llllllllllllIlllIlllllllllIIllIl == null;
    }
    
    public void setClip(final int llllllllllllIllllIIIIIlIlIlllIlI, final int llllllllllllIllllIIIIIlIlIlllIIl, final int llllllllllllIllllIIIIIlIlIlllIII, final int llllllllllllIllllIIIIIlIlIllIIlI) {
        this.predraw();
        if (lIIIIllIlIllIlll(this.clip)) {
            Graphics.GL.glEnable(Graphics.llIIIIIIIllllI[13]);
            this.clip = new Rectangle((float)llllllllllllIllllIIIIIlIlIlllIlI, (float)llllllllllllIllllIIIIIlIlIlllIIl, (float)llllllllllllIllllIIIIIlIlIlllIII, (float)llllllllllllIllllIIIIIlIlIllIIlI);
            "".length();
            if ((0xAE ^ 0xAA) != (0x39 ^ 0x3D)) {
                return;
            }
        }
        else {
            this.clip.setBounds((float)llllllllllllIllllIIIIIlIlIlllIlI, (float)llllllllllllIllllIIIIIlIlIlllIIl, (float)llllllllllllIllllIIIIIlIlIlllIII, (float)llllllllllllIllllIIIIIlIlIllIIlI);
        }
        Graphics.GL.glScissor(llllllllllllIllllIIIIIlIlIlllIlI, this.screenHeight - llllllllllllIllllIIIIIlIlIlllIIl - llllllllllllIllllIIIIIlIlIllIIlI, llllllllllllIllllIIIIIlIlIlllIII, llllllllllllIllllIIIIIlIlIllIIlI);
        this.postdraw();
    }
    
    public void fillArc(final float llllllllllllIllllIIIIIIllllIIllI, final float llllllllllllIllllIIIIIIllllIIlIl, final float llllllllllllIllllIIIIIIllllIIlII, final float llllllllllllIllllIIIIIIlllIlllII, final float llllllllllllIllllIIIIIIllllIIIlI, final float llllllllllllIllllIIIIIIllllIIIIl) {
        this.fillArc(llllllllllllIllllIIIIIIllllIIllI, llllllllllllIllllIIIIIIllllIIlIl, llllllllllllIllllIIIIIIllllIIlII, llllllllllllIllllIIIIIIlllIlllII, Graphics.llIIIIIIIllllI[20], llllllllllllIllllIIIIIIllllIIIlI, llllllllllllIllllIIIIIIllllIIIIl);
    }
    
    public void getArea(final int llllllllllllIllllIIIIIIIlIIllIII, final int llllllllllllIllllIIIIIIIlIIlIlll, final int llllllllllllIllllIIIIIIIlIIlllII, final int llllllllllllIllllIIIIIIIlIIlIlIl, final ByteBuffer llllllllllllIllllIIIIIIIlIIllIlI) {
        if (lIIIIllIlIlllllI(llllllllllllIllllIIIIIIIlIIllIlI.capacity(), llllllllllllIllllIIIIIIIlIIlllII * llllllllllllIllllIIIIIIIlIIlIlIl * Graphics.llIIIIIIIllllI[0])) {
            throw new IllegalArgumentException(Graphics.llIIIIIIIlllIl[Graphics.llIIIIIIIllllI[18]]);
        }
        this.predraw();
        Graphics.GL.glReadPixels(llllllllllllIllllIIIIIIIlIIllIII, this.screenHeight - llllllllllllIllllIIIIIIIlIIlIlll - llllllllllllIllllIIIIIIIlIIlIlIl, llllllllllllIllllIIIIIIIlIIlllII, llllllllllllIllllIIIIIIIlIIlIlIl, Graphics.llIIIIIIIllllI[24], Graphics.llIIIIIIIllllI[28], llllllllllllIllllIIIIIIIlIIllIlI);
        this.postdraw();
    }
    
    public void drawAnimation(final Animation llllllllllllIllllIIIIIIlIIIllIIl, final float llllllllllllIllllIIIIIIlIIIlIlII, final float llllllllllllIllllIIIIIIlIIIlIlll) {
        this.drawAnimation(llllllllllllIllllIIIIIIlIIIllIIl, llllllllllllIllllIIIIIIlIIIlIlII, llllllllllllIllllIIIIIIlIIIlIlll, Color.white);
    }
    
    private static boolean lIIIIllIlIlllIll(final int llllllllllllIlllIlllllllllIIlIIl) {
        return llllllllllllIlllIlllllllllIIlIIl == 0;
    }
    
    public void drawGradientLine(final float llllllllllllIllllIIIIIIIIlIIlIIl, final float llllllllllllIllllIIIIIIIIlIIlIII, final float llllllllllllIllllIIIIIIIIIlllIlI, final float llllllllllllIllllIIIIIIIIIlllIIl, final float llllllllllllIllllIIIIIIIIIlllIII, final float llllllllllllIllllIIIIIIIIlIIIlII, final float llllllllllllIllllIIIIIIIIIllIllI, final float llllllllllllIllllIIIIIIIIlIIIIlI, final float llllllllllllIllllIIIIIIIIIllIlII, final float llllllllllllIllllIIIIIIIIlIIIIII, final float llllllllllllIllllIIIIIIIIIllllll, final float llllllllllllIllllIIIIIIIIIlllllI) {
        this.predraw();
        TextureImpl.bindNone();
        Graphics.GL.glBegin(Graphics.llIIIIIIIllllI[2]);
        Graphics.GL.glColor4f(llllllllllllIllllIIIIIIIIIlllIlI, llllllllllllIllllIIIIIIIIIlllIIl, llllllllllllIllllIIIIIIIIIlllIII, llllllllllllIllllIIIIIIIIlIIIlII);
        Graphics.GL.glVertex2f(llllllllllllIllllIIIIIIIIlIIlIIl, llllllllllllIllllIIIIIIIIlIIlIII);
        Graphics.GL.glColor4f(llllllllllllIllllIIIIIIIIIllIlII, llllllllllllIllllIIIIIIIIlIIIIII, llllllllllllIllllIIIIIIIIIllllll, llllllllllllIllllIIIIIIIIIlllllI);
        Graphics.GL.glVertex2f(llllllllllllIllllIIIIIIIIIllIllI, llllllllllllIllllIIIIIIIIlIIIIlI);
        Graphics.GL.glEnd();
        this.postdraw();
    }
    
    private int translate(final byte llllllllllllIllllIIIIIIIlIlIllll) {
        if (lIIIIllIllIIIIIl(llllllllllllIllllIIIIIIIlIlIllll)) {
            return Graphics.llIIIIIIIllllI[27] + llllllllllllIllllIIIIIIIlIlIllll;
        }
        return llllllllllllIllllIIIIIIIlIlIllll;
    }
    
    public void fill(final Shape llllllllllllIllllIIIIIllIlIIIlIl) {
        this.predraw();
        TextureImpl.bindNone();
        this.currentColor.bind();
        ShapeRenderer.fill(llllllllllllIllllIIIIIllIlIIIlIl);
        this.postdraw();
    }
    
    public void fillOval(final float llllllllllllIllllIIIIIlIIIIIIlII, final float llllllllllllIllllIIIIIlIIIIIIIll, final float llllllllllllIllllIIIIIlIIIIIIlll, final float llllllllllllIllllIIIIIlIIIIIIllI) {
        this.fillOval(llllllllllllIllllIIIIIlIIIIIIlII, llllllllllllIllllIIIIIlIIIIIIIll, llllllllllllIllllIIIIIlIIIIIIlll, llllllllllllIllllIIIIIlIIIIIIllI, Graphics.llIIIIIIIllllI[20]);
    }
    
    public void fill(final Shape llllllllllllIllllIIIIIllIlIlIIlI, final ShapeFill llllllllllllIllllIIIIIllIlIlIlII) {
        this.predraw();
        TextureImpl.bindNone();
        ShapeRenderer.fill(llllllllllllIllllIIIIIllIlIlIIlI, llllllllllllIllllIIIIIllIlIlIlII);
        this.currentColor.bind();
        this.postdraw();
    }
    
    private static void lIIIIllIlIllIlII() {
        (llIIIIIIIllllI = new int[34])[0] = (0x11 ^ 0x1A ^ (0x82 ^ 0x8D));
        Graphics.llIIIIIIIllllI[1] = (-(0xFFFFFE5E & 0x75B7) & (-1 & 0x7FF7));
        Graphics.llIIIIIIIllllI[2] = " ".length();
        Graphics.llIIIIIIIllllI[3] = (-(0xFFFFFCDD & 0x3FB7) & (0xFFFFFFFE & 0x3F97));
        Graphics.llIIIIIIIllllI[4] = (-(0xFFFFFDED & 0xEDB) & (0xFFFFFFDF & 0xFEB));
        Graphics.llIIIIIIIllllI[5] = ((0x3B ^ 0x71 ^ (0x50 ^ 0x21)) & ("  ".length() ^ (0xB4 ^ 0x8D) ^ -" ".length()));
        Graphics.llIIIIIIIllllI[6] = (0xFFFFBB66 & 0x479D);
        Graphics.llIIIIIIIllllI[7] = (-(0xFFFFFDF9 & 0x3EBF) & (-1 & 0x3FBD));
        Graphics.llIIIIIIIllllI[8] = (0xFFFFFBC5 & 0x73B);
        Graphics.llIIIIIIIllllI[9] = (0xFFFFFB7A & 0x785);
        Graphics.llIIIIIIIllllI[10] = (0x50 ^ 0xD ^ (0x7E ^ 0x33));
        Graphics.llIIIIIIIllllI[11] = (-(0xFFFFF2FF & 0x5DCA) & (0xFFFFDFEB & 0x7CFF));
        Graphics.llIIIIIIIllllI[12] = (0xFFFFD088 & 0x6F77);
        Graphics.llIIIIIIIllllI[13] = (0xFFFFDD7D & 0x2E93);
        Graphics.llIIIIIIIllllI[14] = (0xFFFFF569 & 0x3A96);
        Graphics.llIIIIIIIllllI[15] = (-(0xFFFFDFF3 & 0x2F5F) & (0xFFFFBF7F & 0x7FD3));
        Graphics.llIIIIIIIllllI[16] = (-(0xFFFFC38E & 0x7FF7) & (0xFFFFF3B7 & 0x7FCF));
        Graphics.llIIIIIIIllllI[17] = (-(0xFFFFDAEF & 0x6595) & (0xFFFFFC87 & 0x73FF));
        Graphics.llIIIIIIIllllI[18] = "  ".length();
        Graphics.llIIIIIIIllllI[19] = (0x0 ^ 0x7);
        Graphics.llIIIIIIIllllI[20] = (0x28 ^ 0x1A);
        Graphics.llIIIIIIIllllI[21] = (-(0xFFFFFED7 & 0x69AB) & (-1 & 0x69EA));
        Graphics.llIIIIIIIllllI[22] = (0x8 ^ 0x1 ^ (0x65 ^ 0x6A));
        Graphics.llIIIIIIIllllI[23] = (0xFFFFBF45 & 0x4BFB);
        Graphics.llIIIIIIIllllI[24] = (-(0xFFFFFE9F & 0x67E2) & (0xFFFFFF8D & 0x7FFB));
        Graphics.llIIIIIIIllllI[25] = (0xFFFFDD07 & 0x3BFF);
        Graphics.llIIIIIIIllllI[26] = (-(0xFFFFBA49 & 0x65BF) & (0xFFFFEDEF & 0x3FF9));
        Graphics.llIIIIIIIllllI[27] = (-(0xFFFFFAFC & 0x7FB7) & (-1 & 0x7BB3));
        Graphics.llIIIIIIIllllI[28] = (-(0xFFFFEABD & 0x75EF) & (0xFFFFF6ED & 0x7DBF));
        Graphics.llIIIIIIIllllI[29] = "   ".length();
        Graphics.llIIIIIIIllllI[30] = (94 + 28 + 25 + 5 ^ 83 + 48 - 103 + 110);
        Graphics.llIIIIIIIllllI[31] = (-"  ".length() & (0xFFFFFFE7 & 0xBBF));
        Graphics.llIIIIIIIllllI[32] = (0x80 ^ 0xC1 ^ (0x41 ^ 0x11));
        Graphics.llIIIIIIIllllI[33] = (0x34 ^ 0x31);
    }
    
    public void fillOval(final float llllllllllllIllllIIIIIIlllllIIll, final float llllllllllllIllllIIIIIIllllllIII, final float llllllllllllIllllIIIIIIlllllIIIl, final float llllllllllllIllllIIIIIIlllllIllI, final int llllllllllllIllllIIIIIIllllIllll) {
        this.fillArc(llllllllllllIllllIIIIIIlllllIIll, llllllllllllIllllIIIIIIllllllIII, llllllllllllIllllIIIIIIlllllIIIl, llllllllllllIllllIIIIIIlllllIllI, llllllllllllIllllIIIIIIllllIllll, 0.0f, 360.0f);
    }
    
    public void destroy() {
    }
    
    public void texture(final Shape llllllllllllIllllIIIIIllIIllIllI, final Image llllllllllllIllllIIIIIllIIllIIIl, final ShapeFill llllllllllllIllllIIIIIllIIllIlII) {
        this.texture(llllllllllllIllllIIIIIllIIllIllI, llllllllllllIllllIIIIIllIIllIIIl, 0.01f, 0.01f, llllllllllllIllllIIIIIllIIllIlII);
    }
    
    public void drawArc(final float llllllllllllIllllIIIIIlIIIlIlIII, final float llllllllllllIllllIIIIIlIIIIlllII, final float llllllllllllIllllIIIIIlIIIlIIllI, final float llllllllllllIllllIIIIIlIIIlIIlIl, final int llllllllllllIllllIIIIIlIIIIllIIl, final float llllllllllllIllllIIIIIlIIIIllIII, float llllllllllllIllllIIIIIlIIIIlIlll) {
        this.predraw();
        TextureImpl.bindNone();
        this.currentColor.bind();
        while (lIIIIllIllIIIIIl(lIIIIllIlIllllll(llllllllllllIllllIIIIIlIIIIlIlll, llllllllllllIllllIIIIIlIIIIllIII))) {
            llllllllllllIllllIIIIIlIIIIlIlll += 360.0f;
            "".length();
            if (((0x18 ^ 0x11) & ~(0x56 ^ 0x5F)) != 0x0) {
                return;
            }
        }
        final float llllllllllllIllllIIIIIlIIIlIIIIl = llllllllllllIllllIIIIIlIIIlIlIII + llllllllllllIllllIIIIIlIIIlIIllI / 2.0f;
        final float llllllllllllIllllIIIIIlIIIlIIIII = llllllllllllIllllIIIIIlIIIIlllII + llllllllllllIllllIIIIIlIIIlIIlIl / 2.0f;
        Graphics.LSR.start();
        final int llllllllllllIllllIIIIIlIIIIlllll = Graphics.llIIIIIIIllllI[21] / llllllllllllIllllIIIIIlIIIIllIIl;
        int llllllllllllIllllIIIIIlIIIlIlIlI = (int)llllllllllllIllllIIIIIlIIIIllIII;
        while (lIIIIllIlIlllllI(llllllllllllIllllIIIIIlIIIlIlIlI, (int)(llllllllllllIllllIIIIIlIIIIlIlll + llllllllllllIllllIIIIIlIIIIlllll))) {
            float llllllllllllIllllIIIIIlIIIlIllIl = (float)llllllllllllIllllIIIIIlIIIlIlIlI;
            if (lIIIIllIlIllllIl(lIIIIllIllIIIIII(llllllllllllIllllIIIIIlIIIlIllIl, llllllllllllIllllIIIIIlIIIIlIlll))) {
                llllllllllllIllllIIIIIlIIIlIllIl = llllllllllllIllllIIIIIlIIIIlIlll;
            }
            final float llllllllllllIllllIIIIIlIIIlIllII = (float)(llllllllllllIllllIIIIIlIIIlIIIIl + FastTrig.cos(Math.toRadians(llllllllllllIllllIIIIIlIIIlIllIl)) * llllllllllllIllllIIIIIlIIIlIIllI / 2.0);
            final float llllllllllllIllllIIIIIlIIIlIlIll = (float)(llllllllllllIllllIIIIIlIIIlIIIII + FastTrig.sin(Math.toRadians(llllllllllllIllllIIIIIlIIIlIllIl)) * llllllllllllIllllIIIIIlIIIlIIlIl / 2.0);
            Graphics.LSR.vertex(llllllllllllIllllIIIIIlIIIlIllII, llllllllllllIllllIIIIIlIIIlIlIll);
            llllllllllllIllllIIIIIlIIIlIlIlI += llllllllllllIllllIIIIIlIIIIlllll;
            "".length();
            if (null != null) {
                return;
            }
        }
        Graphics.LSR.end();
        this.postdraw();
    }
    
    public void drawRect(final float llllllllllllIllllIIIIIlIlllIIIll, final float llllllllllllIllllIIIIIlIlllIIIlI, final float llllllllllllIllllIIIIIlIlllIIlll, final float llllllllllllIllllIIIIIlIlllIIllI) {
        final float llllllllllllIllllIIIIIlIlllIIlIl = this.getLineWidth();
        this.drawLine(llllllllllllIllllIIIIIlIlllIIIll, llllllllllllIllllIIIIIlIlllIIIlI, llllllllllllIllllIIIIIlIlllIIIll + llllllllllllIllllIIIIIlIlllIIlll, llllllllllllIllllIIIIIlIlllIIIlI);
        this.drawLine(llllllllllllIllllIIIIIlIlllIIIll + llllllllllllIllllIIIIIlIlllIIlll, llllllllllllIllllIIIIIlIlllIIIlI, llllllllllllIllllIIIIIlIlllIIIll + llllllllllllIllllIIIIIlIlllIIlll, llllllllllllIllllIIIIIlIlllIIIlI + llllllllllllIllllIIIIIlIlllIIllI);
        this.drawLine(llllllllllllIllllIIIIIlIlllIIIll + llllllllllllIllllIIIIIlIlllIIlll, llllllllllllIllllIIIIIlIlllIIIlI + llllllllllllIllllIIIIIlIlllIIllI, llllllllllllIllllIIIIIlIlllIIIll, llllllllllllIllllIIIIIlIlllIIIlI + llllllllllllIllllIIIIIlIlllIIllI);
        this.drawLine(llllllllllllIllllIIIIIlIlllIIIll, llllllllllllIllllIIIIIlIlllIIIlI + llllllllllllIllllIIIIIlIlllIIllI, llllllllllllIllllIIIIIlIlllIIIll, llllllllllllIllllIIIIIlIlllIIIlI);
    }
    
    public void pushTransform() {
        this.predraw();
        FloatBuffer llllllllllllIllllIIIIIIIIIIlIlll = null;
        if (lIIIIllIllIIIlIl(this.stackIndex, this.stack.size())) {
            final FloatBuffer llllllllllllIllllIIIIIIIIIIllIIl = BufferUtils.createFloatBuffer(Graphics.llIIIIIIIllllI[30]);
            this.stack.add(llllllllllllIllllIIIIIIIIIIllIIl);
            "".length();
            "".length();
            if ((0x52 ^ 0x59 ^ (0xB1 ^ 0xBE)) < " ".length()) {
                return;
            }
        }
        else {
            llllllllllllIllllIIIIIIIIIIlIlll = this.stack.get(this.stackIndex);
        }
        Graphics.GL.glGetFloat(Graphics.llIIIIIIIllllI[31], llllllllllllIllllIIIIIIIIIIlIlll);
        llllllllllllIllllIIIIIIIIIIlIlll.put(Graphics.llIIIIIIIllllI[10], this.sx);
        "".length();
        llllllllllllIllllIIIIIIIIIIlIlll.put(Graphics.llIIIIIIIllllI[32], this.sy);
        "".length();
        this.stackIndex += Graphics.llIIIIIIIllllI[2];
        this.postdraw();
    }
    
    public void texture(final Shape llllllllllllIllllIIIIIllIIlIlIlI, final Image llllllllllllIllllIIIIIllIIlIlIIl, final boolean llllllllllllIllllIIIIIllIIlIIlII) {
        if (lIIIIllIlIlllIlI(llllllllllllIllllIIIIIllIIlIIlII ? 1 : 0)) {
            this.texture(llllllllllllIllllIIIIIllIIlIlIlI, llllllllllllIllllIIIIIllIIlIlIIl, 1.0f, 1.0f, (boolean)(Graphics.llIIIIIIIllllI[2] != 0));
            "".length();
            if (-(0x86 ^ 0x82) > 0) {
                return;
            }
        }
        else {
            this.texture(llllllllllllIllllIIIIIllIIlIlIlI, llllllllllllIllllIIIIIllIIlIlIIl, 0.01f, 0.01f, (boolean)(Graphics.llIIIIIIIllllI[5] != 0));
        }
    }
    
    public void drawString(final String llllllllllllIllllIIIIIIlIIllIIII, final float llllllllllllIllllIIIIIIlIIlIllll, final float llllllllllllIllllIIIIIIlIIllIIlI) {
        this.predraw();
        this.font.drawString(llllllllllllIllllIIIIIIlIIlIllll, llllllllllllIllllIIIIIIlIIllIIlI, llllllllllllIllllIIIIIIlIIllIIII, this.currentColor);
        this.postdraw();
    }
    
    public void fillArc(final float llllllllllllIllllIIIIIIlllIIIIIl, final float llllllllllllIllllIIIIIIlllIIIIII, final float llllllllllllIllllIIIIIIllIllIlII, final float llllllllllllIllllIIIIIIllIlllllI, final int llllllllllllIllllIIIIIIllIllllIl, final float llllllllllllIllllIIIIIIllIllllII, float llllllllllllIllllIIIIIIllIllIIII) {
        this.predraw();
        TextureImpl.bindNone();
        this.currentColor.bind();
        while (lIIIIllIllIIIIIl(lIIIIllIllIIIIlI((float)llllllllllllIllllIIIIIIllIllIIII, llllllllllllIllllIIIIIIllIllllII))) {
            llllllllllllIllllIIIIIIllIllIIII += 360.0f;
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        final float llllllllllllIllllIIIIIIllIlllIlI = llllllllllllIllllIIIIIIlllIIIIIl + llllllllllllIllllIIIIIIllIllIlII / 2.0f;
        final float llllllllllllIllllIIIIIIllIlllIIl = llllllllllllIllllIIIIIIlllIIIIII + llllllllllllIllllIIIIIIllIlllllI / 2.0f;
        Graphics.GL.glBegin(Graphics.llIIIIIIIllllI[22]);
        final int llllllllllllIllllIIIIIIllIlllIII = Graphics.llIIIIIIIllllI[21] / llllllllllllIllllIIIIIIllIllllIl;
        Graphics.GL.glVertex2f(llllllllllllIllllIIIIIIllIlllIlI, llllllllllllIllllIIIIIIllIlllIIl);
        int llllllllllllIllllIIIIIIlllIIIlll = (int)llllllllllllIllllIIIIIIllIllllII;
        while (lIIIIllIlIlllllI(llllllllllllIllllIIIIIIlllIIIlll, (int)(llllllllllllIllllIIIIIIllIllIIII + (float)llllllllllllIllllIIIIIIllIlllIII))) {
            float llllllllllllIllllIIIIIIlllIIlIlI = (float)llllllllllllIllllIIIIIIlllIIIlll;
            if (lIIIIllIlIllllIl(lIIIIllIllIIIIll(llllllllllllIllllIIIIIIlllIIlIlI, (float)llllllllllllIllllIIIIIIllIllIIII))) {
                llllllllllllIllllIIIIIIlllIIlIlI = (float)llllllllllllIllllIIIIIIllIllIIII;
            }
            final float llllllllllllIllllIIIIIIlllIIlIIl = (float)(llllllllllllIllllIIIIIIllIlllIlI + FastTrig.cos(Math.toRadians(llllllllllllIllllIIIIIIlllIIlIlI)) * llllllllllllIllllIIIIIIllIllIlII / 2.0);
            final float llllllllllllIllllIIIIIIlllIIlIII = (float)(llllllllllllIllllIIIIIIllIlllIIl + FastTrig.sin(Math.toRadians(llllllllllllIllllIIIIIIlllIIlIlI)) * llllllllllllIllllIIIIIIllIlllllI / 2.0);
            Graphics.GL.glVertex2f(llllllllllllIllllIIIIIIlllIIlIIl, llllllllllllIllllIIIIIIlllIIlIII);
            llllllllllllIllllIIIIIIlllIIIlll += llllllllllllIllllIIIIIIllIlllIII;
            "".length();
            if (((0x18 ^ 0x24 ^ (0x71 ^ 0x61)) & (0x9B ^ 0x85 ^ (0xBE ^ 0x8C) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        Graphics.GL.glEnd();
        if (lIIIIllIlIlllIlI(this.antialias ? 1 : 0)) {
            Graphics.GL.glBegin(Graphics.llIIIIIIIllllI[22]);
            Graphics.GL.glVertex2f(llllllllllllIllllIIIIIIllIlllIlI, llllllllllllIllllIIIIIIllIlllIIl);
            if (lIIIIllIlIlllIlI(lIIIIllIllIIIIll((float)llllllllllllIllllIIIIIIllIllIIII, 360.0f))) {
                llllllllllllIllllIIIIIIllIllIIII -= 10.0f;
            }
            int llllllllllllIllllIIIIIIlllIIIIll = (int)llllllllllllIllllIIIIIIllIllllII;
            while (lIIIIllIlIlllllI(llllllllllllIllllIIIIIIlllIIIIll, (int)(llllllllllllIllllIIIIIIllIllIIII + (float)llllllllllllIllllIIIIIIllIlllIII))) {
                float llllllllllllIllllIIIIIIlllIIIllI = (float)llllllllllllIllllIIIIIIlllIIIIll;
                if (lIIIIllIlIllllIl(lIIIIllIllIIIIll(llllllllllllIllllIIIIIIlllIIIllI, (float)llllllllllllIllllIIIIIIllIllIIII))) {
                    llllllllllllIllllIIIIIIlllIIIllI = (float)llllllllllllIllllIIIIIIllIllIIII;
                }
                final float llllllllllllIllllIIIIIIlllIIIlIl = (float)(llllllllllllIllllIIIIIIllIlllIlI + FastTrig.cos(Math.toRadians(llllllllllllIllllIIIIIIlllIIIllI + 10.0f)) * llllllllllllIllllIIIIIIllIllIlII / 2.0);
                final float llllllllllllIllllIIIIIIlllIIIlII = (float)(llllllllllllIllllIIIIIIllIlllIIl + FastTrig.sin(Math.toRadians(llllllllllllIllllIIIIIIlllIIIllI + 10.0f)) * llllllllllllIllllIIIIIIllIlllllI / 2.0);
                Graphics.GL.glVertex2f(llllllllllllIllllIIIIIIlllIIIlIl, llllllllllllIllllIIIIIIlllIIIlII);
                llllllllllllIllllIIIIIIlllIIIIll += llllllllllllIllllIIIIIIllIlllIII;
                "".length();
                if (-" ".length() > ((0x97 ^ 0xC5) & ~(0x3A ^ 0x68))) {
                    return;
                }
            }
            Graphics.GL.glEnd();
        }
        this.postdraw();
    }
    
    public void drawImage(final Image llllllllllllIllllIIIIIIIIlllllII, final float llllllllllllIllllIIIIIIIlIIIIllI, final float llllllllllllIllllIIIIIIIlIIIIlIl, final float llllllllllllIllllIIIIIIIIllllIIl, final float llllllllllllIllllIIIIIIIIllllIII, final float llllllllllllIllllIIIIIIIIlllIlll, final float llllllllllllIllllIIIIIIIIlllIllI, final float llllllllllllIllllIIIIIIIlIIIIIII, final float llllllllllllIllllIIIIIIIIlllllll, final Color llllllllllllIllllIIIIIIIIlllIIll) {
        this.predraw();
        llllllllllllIllllIIIIIIIIlllllII.draw(llllllllllllIllllIIIIIIIlIIIIllI, llllllllllllIllllIIIIIIIlIIIIlIl, llllllllllllIllllIIIIIIIIllllIIl, llllllllllllIllllIIIIIIIIllllIII, llllllllllllIllllIIIIIIIIlllIlll, llllllllllllIllllIIIIIIIIlllIllI, llllllllllllIllllIIIIIIIlIIIIIII, llllllllllllIllllIIIIIIIIlllllll, llllllllllllIllllIIIIIIIIlllIIll);
        this.currentColor.bind();
        this.postdraw();
    }
    
    public void setBackground(final Color llllllllllllIllllIIIIIlllIllllII) {
        this.predraw();
        Graphics.GL.glClearColor(llllllllllllIllllIIIIIlllIllllII.r, llllllllllllIllllIIIIIlllIllllII.g, llllllllllllIllllIIIIIlllIllllII.b, llllllllllllIllllIIIIIlllIllllII.a);
        this.postdraw();
    }
    
    private static int lIIIIllIlIllllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public Font getFont() {
        return this.font;
    }
    
    public void texture(final Shape llllllllllllIllllIIIIIlIlllllIll, final Image llllllllllllIllllIIIIIlIlllllIlI, final float llllllllllllIllllIIIIIlIlllllIIl, final float llllllllllllIllllIIIIIlIlllllIII, final ShapeFill llllllllllllIllllIIIIIlIllllIlll) {
        this.predraw();
        TextureImpl.bindNone();
        this.currentColor.bind();
        ShapeRenderer.texture(llllllllllllIllllIIIIIlIlllllIll, llllllllllllIllllIIIIIlIlllllIlI, llllllllllllIllllIIIIIlIlllllIIl, llllllllllllIllllIIIIIlIlllllIII, llllllllllllIllllIIIIIlIllllIlll);
        this.postdraw();
    }
    
    public void drawRoundRect(final float llllllllllllIllllIIIIIIllIIIllII, final float llllllllllllIllllIIIIIIllIIIlIll, final float llllllllllllIllllIIIIIIllIIIIIIl, final float llllllllllllIllllIIIIIIllIIIlIIl, int llllllllllllIllllIIIIIIlIlllllll, final int llllllllllllIllllIIIIIIllIIIIlll) {
        if (lIIIIllIllIIIIIl(llllllllllllIllllIIIIIIlIlllllll)) {
            throw new IllegalArgumentException(Graphics.llIIIIIIIlllIl[Graphics.llIIIIIIIllllI[5]]);
        }
        if (lIIIIllIlIlllIll(llllllllllllIllllIIIIIIlIlllllll)) {
            this.drawRect(llllllllllllIllllIIIIIIllIIIllII, llllllllllllIllllIIIIIIllIIIlIll, llllllllllllIllllIIIIIIllIIIIIIl, llllllllllllIllllIIIIIIllIIIlIIl);
            return;
        }
        final int llllllllllllIllllIIIIIIllIIIIllI = (int)Math.min(llllllllllllIllllIIIIIIllIIIIIIl, llllllllllllIllllIIIIIIllIIIlIIl) / Graphics.llIIIIIIIllllI[18];
        if (lIIIIllIllIIIlII(llllllllllllIllllIIIIIIlIlllllll, llllllllllllIllllIIIIIIllIIIIllI)) {
            llllllllllllIllllIIIIIIlIlllllll = llllllllllllIllllIIIIIIllIIIIllI;
        }
        this.drawLine(llllllllllllIllllIIIIIIllIIIllII + llllllllllllIllllIIIIIIlIlllllll, llllllllllllIllllIIIIIIllIIIlIll, llllllllllllIllllIIIIIIllIIIllII + llllllllllllIllllIIIIIIllIIIIIIl - llllllllllllIllllIIIIIIlIlllllll, llllllllllllIllllIIIIIIllIIIlIll);
        this.drawLine(llllllllllllIllllIIIIIIllIIIllII, llllllllllllIllllIIIIIIllIIIlIll + llllllllllllIllllIIIIIIlIlllllll, llllllllllllIllllIIIIIIllIIIllII, llllllllllllIllllIIIIIIllIIIlIll + llllllllllllIllllIIIIIIllIIIlIIl - llllllllllllIllllIIIIIIlIlllllll);
        this.drawLine(llllllllllllIllllIIIIIIllIIIllII + llllllllllllIllllIIIIIIllIIIIIIl, llllllllllllIllllIIIIIIllIIIlIll + llllllllllllIllllIIIIIIlIlllllll, llllllllllllIllllIIIIIIllIIIllII + llllllllllllIllllIIIIIIllIIIIIIl, llllllllllllIllllIIIIIIllIIIlIll + llllllllllllIllllIIIIIIllIIIlIIl - llllllllllllIllllIIIIIIlIlllllll);
        this.drawLine(llllllllllllIllllIIIIIIllIIIllII + llllllllllllIllllIIIIIIlIlllllll, llllllllllllIllllIIIIIIllIIIlIll + llllllllllllIllllIIIIIIllIIIlIIl, llllllllllllIllllIIIIIIllIIIllII + llllllllllllIllllIIIIIIllIIIIIIl - llllllllllllIllllIIIIIIlIlllllll, llllllllllllIllllIIIIIIllIIIlIll + llllllllllllIllllIIIIIIllIIIlIIl);
        final float llllllllllllIllllIIIIIIllIIIIlIl = (float)(llllllllllllIllllIIIIIIlIlllllll * Graphics.llIIIIIIIllllI[18]);
        this.drawArc(llllllllllllIllllIIIIIIllIIIllII + llllllllllllIllllIIIIIIllIIIIIIl - llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIlIll + llllllllllllIllllIIIIIIllIIIlIIl - llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlll, 0.0f, 90.0f);
        this.drawArc(llllllllllllIllllIIIIIIllIIIllII, llllllllllllIllllIIIIIIllIIIlIll + llllllllllllIllllIIIIIIllIIIlIIl - llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlll, 90.0f, 180.0f);
        this.drawArc(llllllllllllIllllIIIIIIllIIIllII + llllllllllllIllllIIIIIIllIIIIIIl - llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIlIll, llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlll, 270.0f, 360.0f);
        this.drawArc(llllllllllllIllllIIIIIIllIIIllII, llllllllllllIllllIIIIIIllIIIlIll, llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlIl, llllllllllllIllllIIIIIIllIIIIlll, 180.0f, 270.0f);
    }
    
    public void drawImage(final Image llllllllllllIllllIIIIIIIIlIlllll, final float llllllllllllIllllIIIIIIIIllIIlll, final float llllllllllllIllllIIIIIIIIlIlllIl, final float llllllllllllIllllIIIIIIIIllIIlIl, final float llllllllllllIllllIIIIIIIIlIllIll, final float llllllllllllIllllIIIIIIIIllIIIll, final float llllllllllllIllllIIIIIIIIlIllIIl, final Color llllllllllllIllllIIIIIIIIlIllIII) {
        this.drawImage(llllllllllllIllllIIIIIIIIlIlllll, llllllllllllIllllIIIIIIIIllIIlll, llllllllllllIllllIIIIIIIIlIlllIl, llllllllllllIllllIIIIIIIIllIIlll + llllllllllllIllllIIIIIIIIlIlllll.getWidth(), llllllllllllIllllIIIIIIIIlIlllIl + llllllllllllIllllIIIIIIIIlIlllll.getHeight(), llllllllllllIllllIIIIIIIIllIIlIl, llllllllllllIllllIIIIIIIIlIllIll, llllllllllllIllllIIIIIIIIllIIIll, llllllllllllIllllIIIIIIIIlIllIIl, llllllllllllIllllIIIIIIIIlIllIII);
    }
    
    public void fillRoundRect(final float llllllllllllIllllIIIIIIlIlIlllll, final float llllllllllllIllllIIIIIIlIlIlIlIl, final float llllllllllllIllllIIIIIIlIlIlIlII, final float llllllllllllIllllIIIIIIlIlIlIIll, int llllllllllllIllllIIIIIIlIlIlIIlI, final int llllllllllllIllllIIIIIIlIlIllIlI) {
        if (lIIIIllIllIIIIIl((int)llllllllllllIllllIIIIIIlIlIlIIlI)) {
            throw new IllegalArgumentException(Graphics.llIIIIIIIlllIl[Graphics.llIIIIIIIllllI[2]]);
        }
        if (lIIIIllIlIlllIll((int)llllllllllllIllllIIIIIIlIlIlIIlI)) {
            this.fillRect(llllllllllllIllllIIIIIIlIlIlllll, llllllllllllIllllIIIIIIlIlIlIlIl, llllllllllllIllllIIIIIIlIlIlIlII, llllllllllllIllllIIIIIIlIlIlIIll);
            return;
        }
        final int llllllllllllIllllIIIIIIlIlIllIIl = (int)Math.min(llllllllllllIllllIIIIIIlIlIlIlII, llllllllllllIllllIIIIIIlIlIlIIll) / Graphics.llIIIIIIIllllI[18];
        if (lIIIIllIllIIIlII((int)llllllllllllIllllIIIIIIlIlIlIIlI, llllllllllllIllllIIIIIIlIlIllIIl)) {
            llllllllllllIllllIIIIIIlIlIlIIlI = llllllllllllIllllIIIIIIlIlIllIIl;
        }
        final float llllllllllllIllllIIIIIIlIlIllIII = (float)(llllllllllllIllllIIIIIIlIlIlIIlI * Graphics.llIIIIIIIllllI[18]);
        this.fillRect(llllllllllllIllllIIIIIIlIlIlllll + llllllllllllIllllIIIIIIlIlIlIIlI, llllllllllllIllllIIIIIIlIlIlIlIl, llllllllllllIllllIIIIIIlIlIlIlII - llllllllllllIllllIIIIIIlIlIllIII, (float)llllllllllllIllllIIIIIIlIlIlIIlI);
        this.fillRect(llllllllllllIllllIIIIIIlIlIlllll, llllllllllllIllllIIIIIIlIlIlIlIl + llllllllllllIllllIIIIIIlIlIlIIlI, (float)llllllllllllIllllIIIIIIlIlIlIIlI, llllllllllllIllllIIIIIIlIlIlIIll - llllllllllllIllllIIIIIIlIlIllIII);
        this.fillRect(llllllllllllIllllIIIIIIlIlIlllll + llllllllllllIllllIIIIIIlIlIlIlII - llllllllllllIllllIIIIIIlIlIlIIlI, llllllllllllIllllIIIIIIlIlIlIlIl + llllllllllllIllllIIIIIIlIlIlIIlI, (float)llllllllllllIllllIIIIIIlIlIlIIlI, llllllllllllIllllIIIIIIlIlIlIIll - llllllllllllIllllIIIIIIlIlIllIII);
        this.fillRect(llllllllllllIllllIIIIIIlIlIlllll + llllllllllllIllllIIIIIIlIlIlIIlI, llllllllllllIllllIIIIIIlIlIlIlIl + llllllllllllIllllIIIIIIlIlIlIIll - llllllllllllIllllIIIIIIlIlIlIIlI, llllllllllllIllllIIIIIIlIlIlIlII - llllllllllllIllllIIIIIIlIlIllIII, (float)llllllllllllIllllIIIIIIlIlIlIIlI);
        this.fillRect(llllllllllllIllllIIIIIIlIlIlllll + llllllllllllIllllIIIIIIlIlIlIIlI, llllllllllllIllllIIIIIIlIlIlIlIl + llllllllllllIllllIIIIIIlIlIlIIlI, llllllllllllIllllIIIIIIlIlIlIlII - llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIlIIll - llllllllllllIllllIIIIIIlIlIllIII);
        this.fillArc(llllllllllllIllllIIIIIIlIlIlllll + llllllllllllIllllIIIIIIlIlIlIlII - llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIlIlIl + llllllllllllIllllIIIIIIlIlIlIIll - llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIlI, 0.0f, 90.0f);
        this.fillArc(llllllllllllIllllIIIIIIlIlIlllll, llllllllllllIllllIIIIIIlIlIlIlIl + llllllllllllIllllIIIIIIlIlIlIIll - llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIlI, 90.0f, 180.0f);
        this.fillArc(llllllllllllIllllIIIIIIlIlIlllll + llllllllllllIllllIIIIIIlIlIlIlII - llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIlIlIl, llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIlI, 270.0f, 360.0f);
        this.fillArc(llllllllllllIllllIIIIIIlIlIlllll, llllllllllllIllllIIIIIIlIlIlIlIl, llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIII, llllllllllllIllllIIIIIIlIlIllIlI, 180.0f, 270.0f);
    }
    
    public void drawImage(final Image llllllllllllIllllIIIIIIIlllllIlI, final float llllllllllllIllllIIIIIIIlllllIIl, final float llllllllllllIllllIIIIIIIllllllII) {
        this.drawImage(llllllllllllIllllIIIIIIIlllllIlI, llllllllllllIllllIIIIIIIlllllIIl, llllllllllllIllllIIIIIIIllllllII, Color.white);
    }
    
    public void draw(final Shape llllllllllllIllllIIIIIllIlIllllI, final ShapeFill llllllllllllIllllIIIIIllIlIlllIl) {
        this.predraw();
        TextureImpl.bindNone();
        ShapeRenderer.draw(llllllllllllIllllIIIIIllIlIllllI, llllllllllllIllllIIIIIllIlIlllIl);
        this.currentColor.bind();
        this.postdraw();
    }
    
    public void resetLineWidth() {
        this.predraw();
        Renderer.getLineStripRenderer().setWidth(1.0f);
        Graphics.GL.glLineWidth(1.0f);
        Graphics.GL.glPointSize(1.0f);
        this.postdraw();
    }
    
    public void drawImage(final Image llllllllllllIllllIIIIIIIllIlIIII, final float llllllllllllIllllIIIIIIIllIIIlll, final float llllllllllllIllllIIIIIIIllIIlllI, final float llllllllllllIllllIIIIIIIllIIllIl, final float llllllllllllIllllIIIIIIIllIIIlII, final float llllllllllllIllllIIIIIIIllIIlIll, final float llllllllllllIllllIIIIIIIllIIIIlI) {
        this.drawImage(llllllllllllIllllIIIIIIIllIlIIII, llllllllllllIllllIIIIIIIllIIIlll, llllllllllllIllllIIIIIIIllIIlllI, llllllllllllIllllIIIIIIIllIIIlll + llllllllllllIllllIIIIIIIllIlIIII.getWidth(), llllllllllllIllllIIIIIIIllIIlllI + llllllllllllIllllIIIIIIIllIlIIII.getHeight(), llllllllllllIllllIIIIIIIllIIllIl, llllllllllllIllllIIIIIIIllIIIlII, llllllllllllIllllIIIIIIIllIIlIll, llllllllllllIllllIIIIIIIllIIIIlI);
    }
    
    public void clear() {
        this.predraw();
        Graphics.GL.glClear(Graphics.llIIIIIIIllllI[12]);
        this.postdraw();
    }
    
    public Rectangle getClip() {
        return this.clip;
    }
    
    private static void lIIIIllIlIllIIll() {
        (llIIIIIIIlllIl = new String[Graphics.llIIIIIIIllllI[0]])[Graphics.llIIIIIIIllllI[5]] = lIIIIllIlIllIIIl("RzspUY+jBIqoPCUzCPW+YKEjbLR5X2clJDY2yG7TiLo=", "VdiHo");
        Graphics.llIIIIIIIlllIl[Graphics.llIIIIIIIllllI[2]] = lIIIIllIlIllIIIl("7g9d96ctzts3Hdv4uICivjhlnxwIsR+f2F1Yp2ioBDc=", "ScPoK");
        Graphics.llIIIIIIIlllIl[Graphics.llIIIIIIIllllI[18]] = lIIIIllIlIllIIlI("KQABP2EJDBM8JBlZBSguHRARPyVLDRp6Jg4NVTszDhhVMzJLFxouYQkQEnokBRYAPSk=", "kyuZA");
        Graphics.llIIIIIIIlllIl[Graphics.llIIIIIIIllllI[29]] = lIIIIllIlIllIIlI("Ew02MAwiDWIhDnIJLSVBM1k2JwA8CiQ6Ez9ZNj0AJlkqNBI8XjZ1AzdZMiASOhwm", "RyBUa");
    }
    
    public Graphics(final int llllllllllllIllllIIIIIlllllIIIlI, final int llllllllllllIllllIIIIIlllllIIIIl) {
        this.sx = 1.0f;
        this.sy = 1.0f;
        this.currentColor = Color.white;
        this.worldClip = BufferUtils.createDoubleBuffer(Graphics.llIIIIIIIllllI[0]);
        this.readBuffer = BufferUtils.createByteBuffer(Graphics.llIIIIIIIllllI[0]);
        this.currentDrawingMode = Graphics.MODE_NORMAL;
        this.lineWidth = 1.0f;
        this.stack = new ArrayList();
        if (lIIIIllIlIllIlll(Graphics.DEFAULT_FONT)) {
            AccessController.doPrivileged((PrivilegedAction<Object>)new PrivilegedAction() {
                private static final /* synthetic */ String[] lIIIIlIIIIlIIl;
                private static final /* synthetic */ int[] lIIIIlIIIIllII;
                
                private static String lIllIllllllllll(final String lllllllllllllIlIIllIlIIIlIlIllIl, final String lllllllllllllIlIIllIlIIIlIlIllII) {
                    try {
                        final SecretKeySpec lllllllllllllIlIIllIlIIIlIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIIIlIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher lllllllllllllIlIIllIlIIIlIlIllll = Cipher.getInstance("Blowfish");
                        lllllllllllllIlIIllIlIIIlIlIllll.init(Graphics$1.lIIIIlIIIIllII[2], lllllllllllllIlIIllIlIIIlIllIIII);
                        return new String(lllllllllllllIlIIllIlIIIlIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIIlIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIlIIllIlIIIlIlIlllI) {
                        lllllllllllllIlIIllIlIIIlIlIlllI.printStackTrace();
                        return null;
                    }
                }
                
                private static String lIlllIIIIIIIIll(final String lllllllllllllIlIIllIlIIIlIlIIIII, final String lllllllllllllIlIIllIlIIIlIIlllIl) {
                    try {
                        final SecretKeySpec lllllllllllllIlIIllIlIIIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIlIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), Graphics$1.lIIIIlIIIIllII[3]), "DES");
                        final Cipher lllllllllllllIlIIllIlIIIlIlIIIlI = Cipher.getInstance("DES");
                        lllllllllllllIlIIllIlIIIlIlIIIlI.init(Graphics$1.lIIIIlIIIIllII[2], lllllllllllllIlIIllIlIIIlIlIIIll);
                        return new String(lllllllllllllIlIIllIlIIIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIlIIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception lllllllllllllIlIIllIlIIIlIlIIIIl) {
                        lllllllllllllIlIIllIlIIIlIlIIIIl.printStackTrace();
                        return null;
                    }
                }
                
                public Object run() {
                    try {
                        Graphics.DEFAULT_FONT = new AngelCodeFont(Graphics$1.lIIIIlIIIIlIIl[Graphics$1.lIIIIlIIIIllII[0]], Graphics$1.lIIIIlIIIIlIIl[Graphics$1.lIIIIlIIIIllII[1]]);
                        "".length();
                        if ((0xFF ^ 0xA6 ^ (0x71 ^ 0x2C)) == " ".length()) {
                            return null;
                        }
                    }
                    catch (SlickException lllllllllllllIlIIllIlIIIlIllIlll) {
                        Log.error(lllllllllllllIlIIllIlIIIlIllIlll);
                    }
                    return null;
                }
                
                static {
                    lIlllIIIIIIIlll();
                    lIlllIIIIIIIllI();
                }
                
                private static void lIlllIIIIIIIlll() {
                    (lIIIIlIIIIllII = new int[4])[0] = ((0x7D ^ 0x2C) & ~(0x38 ^ 0x69));
                    Graphics$1.lIIIIlIIIIllII[1] = " ".length();
                    Graphics$1.lIIIIlIIIIllII[2] = "  ".length();
                    Graphics$1.lIIIIlIIIIllII[3] = (0x79 ^ 0x71);
                }
                
                private static void lIlllIIIIIIIllI() {
                    (lIIIIlIIIIlIIl = new String[Graphics$1.lIIIIlIIIIllII[2]])[Graphics$1.lIIIIlIIIIllII[0]] = lIllIllllllllll("If8iplrozkxdu2a+m4FqUpw27fuxtNa8dSBr7DYj07m2c+KD9dM/mg==", "YNHuX");
                    Graphics$1.lIIIIlIIIIlIIl[Graphics$1.lIIIIlIIIIllII[1]] = lIlllIIIIIIIIll("Nom26JZZkqCAp3eD0VyVbIp+JFJwJwYnpsZaoP6yxqR8KJVZHEqhhw==", "tWKax");
                }
            });
            "".length();
        }
        this.font = Graphics.DEFAULT_FONT;
        this.screenWidth = llllllllllllIllllIIIIIlllllIIIlI;
        this.screenHeight = llllllllllllIllllIIIIIlllllIIIIl;
    }
    
    public void texture(final Shape llllllllllllIllllIIIIIllIIIlllIl, final Image llllllllllllIllllIIIIIllIIIlIlll, final float llllllllllllIllllIIIIIllIIIllIll, final float llllllllllllIllllIIIIIllIIIlIlIl) {
        this.texture(llllllllllllIllllIIIIIllIIIlllIl, llllllllllllIllllIIIIIllIIIlIlll, llllllllllllIllllIIIIIllIIIllIll, llllllllllllIllllIIIIIllIIIlIlIl, (boolean)(Graphics.llIIIIIIIllllI[5] != 0));
    }
    
    public void drawImage(final Image llllllllllllIllllIIIIIIlIIlIIIlI, final float llllllllllllIllllIIIIIIlIIlIIIIl, final float llllllllllllIllllIIIIIIlIIlIIlIl, final Color llllllllllllIllllIIIIIIlIIlIIlII) {
        this.predraw();
        llllllllllllIllllIIIIIIlIIlIIIlI.draw(llllllllllllIllllIIIIIIlIIlIIIIl, llllllllllllIllllIIIIIIlIIlIIlIl, llllllllllllIllllIIIIIIlIIlIIlII);
        this.currentColor.bind();
        this.postdraw();
    }
    
    public void drawGradientLine(final float llllllllllllIllllIIIIIIIIIlIIIIl, final float llllllllllllIllllIIIIIIIIIlIIlll, final Color llllllllllllIllllIIIIIIIIIIlllll, final float llllllllllllIllllIIIIIIIIIIllllI, final float llllllllllllIllllIIIIIIIIIlIIlII, final Color llllllllllllIllllIIIIIIIIIlIIIll) {
        this.predraw();
        TextureImpl.bindNone();
        Graphics.GL.glBegin(Graphics.llIIIIIIIllllI[2]);
        llllllllllllIllllIIIIIIIIIIlllll.bind();
        Graphics.GL.glVertex2f(llllllllllllIllllIIIIIIIIIlIIIIl, llllllllllllIllllIIIIIIIIIlIIlll);
        llllllllllllIllllIIIIIIIIIlIIIll.bind();
        Graphics.GL.glVertex2f(llllllllllllIllllIIIIIIIIIIllllI, llllllllllllIllllIIIIIIIIIlIIlII);
        Graphics.GL.glEnd();
        this.postdraw();
    }
    
    private static String lIIIIllIlIllIIIl(final String llllllllllllIllllIIIIIIIIIIIIlII, final String llllllllllllIllllIIIIIIIIIIIIIll) {
        try {
            final SecretKeySpec llllllllllllIllllIIIIIIIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIIIIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIIIIIIIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIIIIIIIIIlIII.init(Graphics.llIIIIIIIllllI[18], llllllllllllIllllIIIIIIIIIIIlIIl);
            return new String(llllllllllllIllllIIIIIIIIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIIIIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIIIIIIIIIIlll) {
            llllllllllllIllllIIIIIIIIIIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllIlIllIlIl(final Object llllllllllllIlllIlllllllllIlIllI, final Object llllllllllllIlllIlllllllllIlIlIl) {
        return llllllllllllIlllIlllllllllIlIllI != llllllllllllIlllIlllllllllIlIlIl;
    }
    
    private static boolean lIIIIllIlIlllllI(final int llllllllllllIlllIlllllllllIllllI, final int llllllllllllIlllIlllllllllIlllIl) {
        return llllllllllllIlllIlllllllllIllllI < llllllllllllIlllIlllllllllIlllIl;
    }
    
    public void rotate(final float llllllllllllIllllIIIIIlllIIlllII, final float llllllllllllIllllIIIIIlllIIlIlll, final float llllllllllllIllllIIIIIlllIIlIllI) {
        this.checkPush();
        this.predraw();
        this.translate(llllllllllllIllllIIIIIlllIIlllII, llllllllllllIllllIIIIIlllIIlIlll);
        Graphics.GL.glRotatef(llllllllllllIllllIIIIIlllIIlIllI, 0.0f, 0.0f, 1.0f);
        this.translate(-llllllllllllIllllIIIIIlllIIlllII, -llllllllllllIllllIIIIIlllIIlIlll);
        this.postdraw();
    }
    
    public void resetFont() {
        this.font = Graphics.DEFAULT_FONT;
    }
    
    public void translate(final float llllllllllllIllllIIIIIlllIIIlllI, final float llllllllllllIllllIIIIIlllIIIllIl) {
        this.checkPush();
        this.predraw();
        Graphics.GL.glTranslatef(llllllllllllIllllIIIIIlllIIIlllI, llllllllllllIllllIIIIIlllIIIllIl, 0.0f);
        this.postdraw();
    }
    
    public boolean isAntiAlias() {
        return this.antialias;
    }
    
    public void clearClip() {
        this.clip = null;
        this.predraw();
        Graphics.GL.glDisable(Graphics.llIIIIIIIllllI[13]);
        this.postdraw();
    }
    
    private void checkPush() {
        if (lIIIIllIlIlllIll(this.pushed ? 1 : 0)) {
            this.predraw();
            Graphics.GL.glPushMatrix();
            this.pushed = (Graphics.llIIIIIIIllllI[2] != 0);
            this.postdraw();
        }
    }
    
    public void fillRect(final float llllllllllllIllllIIIIIlIIlllIllI, final float llllllllllllIllllIIIIIlIIllllIlI, final float llllllllllllIllllIIIIIlIIlllIlII, final float llllllllllllIllllIIIIIlIIllllIII) {
        this.predraw();
        TextureImpl.bindNone();
        this.currentColor.bind();
        Graphics.GL.glBegin(Graphics.llIIIIIIIllllI[19]);
        Graphics.GL.glVertex2f(llllllllllllIllllIIIIIlIIlllIllI, llllllllllllIllllIIIIIlIIllllIlI);
        Graphics.GL.glVertex2f(llllllllllllIllllIIIIIlIIlllIllI + llllllllllllIllllIIIIIlIIlllIlII, llllllllllllIllllIIIIIlIIllllIlI);
        Graphics.GL.glVertex2f(llllllllllllIllllIIIIIlIIlllIllI + llllllllllllIllllIIIIIlIIlllIlII, llllllllllllIllllIIIIIlIIllllIlI + llllllllllllIllllIIIIIlIIllllIII);
        Graphics.GL.glVertex2f(llllllllllllIllllIIIIIlIIlllIllI, llllllllllllIllllIIIIIlIIllllIlI + llllllllllllIllllIIIIIlIIllllIII);
        Graphics.GL.glEnd();
        this.postdraw();
    }
}
