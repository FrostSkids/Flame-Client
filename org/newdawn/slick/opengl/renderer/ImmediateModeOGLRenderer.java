// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.renderer;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.EXTSecondaryColor;
import java.nio.ByteBuffer;
import org.lwjgl.opengl.GLContext;
import java.nio.IntBuffer;
import org.lwjgl.opengl.GL11;

public class ImmediateModeOGLRenderer implements SGL
{
    protected /* synthetic */ float alphaScale;
    private /* synthetic */ float[] current;
    private static final /* synthetic */ int[] lIlIlIIIIlIlIl;
    private /* synthetic */ int width;
    private /* synthetic */ int height;
    
    public void glBindTexture(final int lllllllllllllIIIlIllIIIlllIlIllI, final int lllllllllllllIIIlIllIIIlllIlIIll) {
        GL11.glBindTexture(lllllllllllllIIIlIllIIIlllIlIllI, lllllllllllllIIIlIllIIIlllIlIIll);
    }
    
    public void glGetInteger(final int lllllllllllllIIIlIllIIIlIlIllllI, final IntBuffer lllllllllllllIIIlIllIIIlIlIllIll) {
        GL11.glGetInteger(lllllllllllllIIIlIllIIIlIlIllllI, lllllllllllllIIIlIllIIIlIlIllIll);
    }
    
    public void glPushMatrix() {
        GL11.glPushMatrix();
    }
    
    public void glPopMatrix() {
        GL11.glPopMatrix();
    }
    
    public void glClearColor(final float lllllllllllllIIIlIllIIIllIlllIlI, final float lllllllllllllIIIlIllIIIllIlllIIl, final float lllllllllllllIIIlIllIIIllIlllIII, final float lllllllllllllIIIlIllIIIllIllIlll) {
        GL11.glClearColor(lllllllllllllIIIlIllIIIllIlllIlI, lllllllllllllIIIlIllIIIllIlllIIl, lllllllllllllIIIlIllIIIllIlllIII, lllllllllllllIIIlIllIIIllIllIlll);
    }
    
    public void flush() {
    }
    
    public void initDisplay(final int lllllllllllllIIIlIllIIIllllIlIIl, final int lllllllllllllIIIlIllIIIllllIllII) {
        this.width = lllllllllllllIIIlIllIIIllllIlIIl;
        this.height = lllllllllllllIIIlIllIIIllllIllII;
        final String lllllllllllllIIIlIllIIIllllIlIll = GL11.glGetString(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[5]);
        GL11.glEnable(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[6]);
        GL11.glShadeModel(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[7]);
        GL11.glDisable(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[8]);
        GL11.glDisable(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[9]);
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glClearDepth(1.0);
        GL11.glEnable(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[10]);
        GL11.glBlendFunc(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[11], ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[12]);
        GL11.glViewport(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[1], ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[1], lllllllllllllIIIlIllIIIllllIlIIl, lllllllllllllIIIlIllIIIllllIllII);
        GL11.glMatrixMode(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[13]);
    }
    
    public void glDisable(final int lllllllllllllIIIlIllIIIlIlllIIll) {
        GL11.glDisable(lllllllllllllIIIlIllIIIlIlllIIll);
    }
    
    public void glEnable(final int lllllllllllllIIIlIllIIIlIlllIIII) {
        GL11.glEnable(lllllllllllllIIIlIllIIIlIlllIIII);
    }
    
    public void glTranslatef(final float lllllllllllllIIIlIllIIIIlllIIllI, final float lllllllllllllIIIlIllIIIIlllIIlIl, final float lllllllllllllIIIlIllIIIIlllIIlII) {
        GL11.glTranslatef(lllllllllllllIIIlIllIIIIlllIIllI, lllllllllllllIIIlIllIIIIlllIIlIl, lllllllllllllIIIlIllIIIIlllIIlII);
    }
    
    public void glPointSize(final float lllllllllllllIIIlIllIIIlIIllllII) {
        GL11.glPointSize(lllllllllllllIIIlIllIIIlIIllllII);
    }
    
    public void glTexCoord2f(final float lllllllllllllIIIlIllIIIIlllllIIl, final float lllllllllllllIIIlIllIIIIlllllIII) {
        GL11.glTexCoord2f(lllllllllllllIIIlIllIIIIlllllIIl, lllllllllllllIIIlIllIIIIlllllIII);
    }
    
    public void glBlendFunc(final int lllllllllllllIIIlIllIIIlllIIllll, final int lllllllllllllIIIlIllIIIlllIIllII) {
        GL11.glBlendFunc(lllllllllllllIIIlIllIIIlllIIllll, lllllllllllllIIIlIllIIIlllIIllII);
    }
    
    public boolean canSecondaryColor() {
        return GLContext.getCapabilities().GL_EXT_secondary_color;
    }
    
    public boolean canTextureMirrorClamp() {
        return GLContext.getCapabilities().GL_EXT_texture_mirror_clamp;
    }
    
    public void glReadPixels(final int lllllllllllllIIIlIllIIIlIIllIIII, final int lllllllllllllIIIlIllIIIlIIlIlIII, final int lllllllllllllIIIlIllIIIlIIlIIlll, final int lllllllllllllIIIlIllIIIlIIlIIllI, final int lllllllllllllIIIlIllIIIlIIlIIlIl, final int lllllllllllllIIIlIllIIIlIIlIIlII, final ByteBuffer lllllllllllllIIIlIllIIIlIIlIIIll) {
        GL11.glReadPixels(lllllllllllllIIIlIllIIIlIIllIIII, lllllllllllllIIIlIllIIIlIIlIlIII, lllllllllllllIIIlIllIIIlIIlIIlll, lllllllllllllIIIlIllIIIlIIlIIllI, lllllllllllllIIIlIllIIIlIIlIIlIl, lllllllllllllIIIlIllIIIlIIlIIlII, lllllllllllllIIIlIllIIIlIIlIIIll);
    }
    
    public void glCallList(final int lllllllllllllIIIlIllIIIlllIIlIII) {
        GL11.glCallList(lllllllllllllIIIlIllIIIlllIIlIII);
    }
    
    public void enterOrtho(final int lllllllllllllIIIlIllIIIlllIlllll, final int lllllllllllllIIIlIllIIIlllIllllI) {
        GL11.glMatrixMode(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[14]);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, (double)this.width, (double)this.height, 0.0, 1.0, -1.0);
        GL11.glMatrixMode(ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[13]);
        GL11.glTranslatef((float)((this.width - lllllllllllllIIIlIllIIIlllIlllll) / ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[3]), (float)((this.height - lllllllllllllIIIlIllIIIlllIllllI) / ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[3]), 0.0f);
    }
    
    public void glDeleteTextures(final IntBuffer lllllllllllllIIIlIllIIIlIllllIII) {
        GL11.glDeleteTextures(lllllllllllllIIIlIllIIIlIllllIII);
    }
    
    public void glScalef(final float lllllllllllllIIIlIllIIIlIIIlIIIl, final float lllllllllllllIIIlIllIIIlIIIIllIl, final float lllllllllllllIIIlIllIIIlIIIIllll) {
        GL11.glScalef(lllllllllllllIIIlIllIIIlIIIlIIIl, lllllllllllllIIIlIllIIIlIIIIllIl, lllllllllllllIIIlIllIIIlIIIIllll);
    }
    
    public void glTexParameteri(final int lllllllllllllIIIlIllIIIIllIIllIl, final int lllllllllllllIIIlIllIIIIllIIlIIl, final int lllllllllllllIIIlIllIIIIllIIlIII) {
        GL11.glTexParameteri(lllllllllllllIIIlIllIIIIllIIllIl, lllllllllllllIIIlIllIIIIllIIlIIl, lllllllllllllIIIlIllIIIIllIIlIII);
    }
    
    public void glLoadIdentity() {
        GL11.glLoadIdentity();
    }
    
    public void glGetTexImage(final int lllllllllllllIIIlIllIIIlIlIlIlII, final int lllllllllllllIIIlIllIIIlIlIIlllI, final int lllllllllllllIIIlIllIIIlIlIlIIlI, final int lllllllllllllIIIlIllIIIlIlIIllII, final ByteBuffer lllllllllllllIIIlIllIIIlIlIlIIII) {
        GL11.glGetTexImage(lllllllllllllIIIlIllIIIlIlIlIlII, lllllllllllllIIIlIllIIIlIlIIlllI, lllllllllllllIIIlIllIIIlIlIlIIlI, lllllllllllllIIIlIllIIIlIlIIllII, lllllllllllllIIIlIllIIIlIlIlIIII);
    }
    
    public void glRotatef(final float lllllllllllllIIIlIllIIIlIIIlllIl, final float lllllllllllllIIIlIllIIIlIIIllIII, final float lllllllllllllIIIlIllIIIlIIIlIlll, final float lllllllllllllIIIlIllIIIlIIIlIllI) {
        GL11.glRotatef(lllllllllllllIIIlIllIIIlIIIlllIl, lllllllllllllIIIlIllIIIlIIIllIII, lllllllllllllIIIlIllIIIlIIIlIlll, lllllllllllllIIIlIllIIIlIIIlIllI);
    }
    
    public void glColorMask(final boolean lllllllllllllIIIlIllIIIllIIlIlll, final boolean lllllllllllllIIIlIllIIIllIIllIlI, final boolean lllllllllllllIIIlIllIIIllIIlIlIl, final boolean lllllllllllllIIIlIllIIIllIIllIII) {
        GL11.glColorMask(lllllllllllllIIIlIllIIIllIIlIlll, lllllllllllllIIIlIllIIIllIIllIlI, lllllllllllllIIIlIllIIIllIIlIlIl, lllllllllllllIIIlIllIIIllIIllIII);
    }
    
    public void glSecondaryColor3ubEXT(final byte lllllllllllllIIIlIllIIIIIllIIlII, final byte lllllllllllllIIIlIllIIIIIllIIIII, final byte lllllllllllllIIIlIllIIIIIlIlllll) {
        EXTSecondaryColor.glSecondaryColor3ubEXT(lllllllllllllIIIlIllIIIIIllIIlII, lllllllllllllIIIlIllIIIIIllIIIII, lllllllllllllIIIlIllIIIIIlIlllll);
    }
    
    public void glClearDepth(final float lllllllllllllIIIlIllIIIIlIlllIlI) {
        GL11.glClearDepth((double)lllllllllllllIIIlIllIIIIlIlllIlI);
    }
    
    public ImmediateModeOGLRenderer() {
        final float[] current = new float[ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[0]];
        current[ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[1]] = 1.0f;
        current[ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[2]] = 1.0f;
        current[ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[3]] = 1.0f;
        current[ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[4]] = 1.0f;
        this.current = current;
        this.alphaScale = 1.0f;
    }
    
    public void glBegin(final int lllllllllllllIIIlIllIIIlllIllIll) {
        GL11.glBegin(lllllllllllllIIIlIllIIIlllIllIll);
    }
    
    public void glTexImage2D(final int lllllllllllllIIIlIllIIIIlIIIllll, final int lllllllllllllIIIlIllIIIIlIIIlllI, final int lllllllllllllIIIlIllIIIIlIIIllIl, final int lllllllllllllIIIlIllIIIIlIIIllII, final int lllllllllllllIIIlIllIIIIlIIIlIll, final int lllllllllllllIIIlIllIIIIlIIlIIll, final int lllllllllllllIIIlIllIIIIlIIIlIIl, final int lllllllllllllIIIlIllIIIIlIIIlIII, final ByteBuffer lllllllllllllIIIlIllIIIIlIIlIIII) {
        GL11.glTexImage2D(lllllllllllllIIIlIllIIIIlIIIllll, lllllllllllllIIIlIllIIIIlIIIlllI, lllllllllllllIIIlIllIIIIlIIIllIl, lllllllllllllIIIlIllIIIIlIIIllII, lllllllllllllIIIlIllIIIIlIIIlIll, lllllllllllllIIIlIllIIIIlIIlIIll, lllllllllllllIIIlIllIIIIlIIIlIIl, lllllllllllllIIIlIllIIIIlIIIlIII, lllllllllllllIIIlIllIIIIlIIlIIII);
    }
    
    public int glGenLists(final int lllllllllllllIIIlIllIIIlIllIlIlI) {
        return GL11.glGenLists(lllllllllllllIIIlIllIIIlIllIlIlI);
    }
    
    public void glCopyTexImage2D(final int lllllllllllllIIIlIllIIIllIIIlIlI, final int lllllllllllllIIIlIllIIIllIIIIIIl, final int lllllllllllllIIIlIllIIIllIIIIIII, final int lllllllllllllIIIlIllIIIlIlllllll, final int lllllllllllllIIIlIllIIIlIllllllI, final int lllllllllllllIIIlIllIIIllIIIIlIl, final int lllllllllllllIIIlIllIIIlIlllllII, final int lllllllllllllIIIlIllIIIllIIIIIll) {
        GL11.glCopyTexImage2D(lllllllllllllIIIlIllIIIllIIIlIlI, lllllllllllllIIIlIllIIIllIIIIIIl, lllllllllllllIIIlIllIIIllIIIIIII, lllllllllllllIIIlIllIIIlIlllllll, lllllllllllllIIIlIllIIIlIllllllI, lllllllllllllIIIlIllIIIllIIIIlIl, lllllllllllllIIIlIllIIIlIlllllII, lllllllllllllIIIlIllIIIllIIIIIll);
    }
    
    public void glVertex2f(final float lllllllllllllIIIlIllIIIIllIllllI, final float lllllllllllllIIIlIllIIIIllIlllIl) {
        GL11.glVertex2f(lllllllllllllIIIlIllIIIIllIllllI, lllllllllllllIIIlIllIIIIllIlllIl);
    }
    
    public float[] getCurrentColor() {
        return this.current;
    }
    
    private static void lllIlIlIllIlIlI() {
        (lIlIlIIIIlIlIl = new int[15])[0] = (15 + 108 + 12 + 19 ^ 109 + 129 - 205 + 125);
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[1] = ((0x6C ^ 0x72) & ~(0x2C ^ 0x32));
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[2] = " ".length();
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[3] = "  ".length();
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[4] = "   ".length();
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[5] = (-(0xFFFFA6FD & 0x795F) & (0xFFFFFF5F & 0x3FFF));
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[6] = (0xFFFFEFE7 & 0x1DF9);
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[7] = (0xFFFFFDC9 & 0x1F37);
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[8] = (0xFFFFCB7D & 0x3FF3);
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[9] = (0xFFFF8FF3 & 0x7B5C);
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[10] = (-(0xFFFFF83E & 0x77CF) & (0xFFFFFBFF & 0x7FEF));
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[11] = (0xFFFFB34B & 0x4FB6);
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[12] = (-(0xFFFFBBEF & 0x7CFD) & (0xFFFFBBFF & 0x7FEF));
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[13] = (-(0xFFFFACFF & 0x73FF) & (-1 & 0x37FE));
        ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[14] = (-(0xFFFFF6DF & 0x4963) & (0xFFFFD77B & 0x7FC7));
    }
    
    public void glLineWidth(final float lllllllllllllIIIlIllIIIlIlIIlIII) {
        GL11.glLineWidth(lllllllllllllIIIlIllIIIlIlIIlIII);
    }
    
    public void glVertex3f(final float lllllllllllllIIIlIllIIIIllIlIlIl, final float lllllllllllllIIIlIllIIIIllIlIlII, final float lllllllllllllIIIlIllIIIIllIlIllI) {
        GL11.glVertex3f(lllllllllllllIIIlIllIIIIllIlIlIl, lllllllllllllIIIlIllIIIIllIlIlII, lllllllllllllIIIlIllIIIIllIlIllI);
    }
    
    public void glEndList() {
        GL11.glEndList();
    }
    
    public void glColor4f(final float lllllllllllllIIIlIllIIIllIlIlIIl, final float lllllllllllllIIIlIllIIIllIlIlIII, final float lllllllllllllIIIlIllIIIllIlIIlll, float lllllllllllllIIIlIllIIIllIlIIIIl) {
        lllllllllllllIIIlIllIIIllIlIIIIl *= (char)this.alphaScale;
        GL11.glColor4f(this.current[ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[1]] = lllllllllllllIIIlIllIIIllIlIlIIl, this.current[ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[2]] = lllllllllllllIIIlIllIIIllIlIlIII, this.current[ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[3]] = lllllllllllllIIIlIllIIIllIlIIlll, this.current[ImmediateModeOGLRenderer.lIlIlIIIIlIlIl[4]] = lllllllllllllIIIlIllIIIllIlIIIIl);
    }
    
    public void glClear(final int lllllllllllllIIIlIllIIIlllIIIlIl) {
        GL11.glClear(lllllllllllllIIIlIllIIIlllIIIlIl);
    }
    
    public void glGetError() {
        GL11.glGetError();
        "".length();
    }
    
    public void setGlobalAlphaScale(final float lllllllllllllIIIlIllIIIIlIlIlllI) {
        this.alphaScale = lllllllllllllIIIlIllIIIIlIlIlllI;
    }
    
    public void glDepthMask(final boolean lllllllllllllIIIlIllIIIIlIllIIll) {
        GL11.glDepthMask(lllllllllllllIIIlIllIIIIlIllIIll);
    }
    
    public void glLoadMatrix(final FloatBuffer lllllllllllllIIIlIllIIIIlIlIlIIl) {
        GL11.glLoadMatrix(lllllllllllllIIIlIllIIIIlIlIlIIl);
    }
    
    public void glScissor(final int lllllllllllllIIIlIllIIIlIIIIIIlI, final int lllllllllllllIIIlIllIIIlIIIIIIIl, final int lllllllllllllIIIlIllIIIlIIIIIlII, final int lllllllllllllIIIlIllIIIIllllllll) {
        GL11.glScissor(lllllllllllllIIIlIllIIIlIIIIIIlI, lllllllllllllIIIlIllIIIlIIIIIIIl, lllllllllllllIIIlIllIIIlIIIIIlII, lllllllllllllIIIlIllIIIIllllllll);
    }
    
    public void glTexEnvi(final int lllllllllllllIIIlIllIIIIllllIIII, final int lllllllllllllIIIlIllIIIIllllIIlI, final int lllllllllllllIIIlIllIIIIllllIIIl) {
        GL11.glTexEnvi(lllllllllllllIIIlIllIIIIllllIIII, lllllllllllllIIIlIllIIIIllllIIlI, lllllllllllllIIIlIllIIIIllllIIIl);
    }
    
    public void glNewList(final int lllllllllllllIIIlIllIIIlIlIIIIlI, final int lllllllllllllIIIlIllIIIlIlIIIIIl) {
        GL11.glNewList(lllllllllllllIIIlIllIIIlIlIIIIlI, lllllllllllllIIIlIllIIIlIlIIIIIl);
    }
    
    public void glGenTextures(final IntBuffer lllllllllllllIIIlIllIIIIlIlIIlIl) {
        GL11.glGenTextures(lllllllllllllIIIlIllIIIIlIlIIlIl);
    }
    
    public void glDepthFunc(final int lllllllllllllIIIlIllIIIIlIllIllI) {
        GL11.glDepthFunc(lllllllllllllIIIlIllIIIIlIllIllI);
    }
    
    public void glDeleteLists(final int lllllllllllllIIIlIllIIIIllIIIIIl, final int lllllllllllllIIIlIllIIIIlIlllllI) {
        GL11.glDeleteLists(lllllllllllllIIIlIllIIIIllIIIIIl, lllllllllllllIIIlIllIIIIlIlllllI);
    }
    
    public void glEnd() {
        GL11.glEnd();
    }
    
    public void glGetFloat(final int lllllllllllllIIIlIllIIIlIllIIIll, final FloatBuffer lllllllllllllIIIlIllIIIlIllIIIlI) {
        GL11.glGetFloat(lllllllllllllIIIlIllIIIlIllIIIll, lllllllllllllIIIlIllIIIlIllIIIlI);
    }
    
    public void glTexSubImage2D(final int lllllllllllllIIIlIllIIIIIlllllII, final int lllllllllllllIIIlIllIIIIIlllIIlI, final int lllllllllllllIIIlIllIIIIIlllIIIl, final int lllllllllllllIIIlIllIIIIIllllIIl, final int lllllllllllllIIIlIllIIIIIllllIII, final int lllllllllllllIIIlIllIIIIIllIlllI, final int lllllllllllllIIIlIllIIIIIllIllIl, final int lllllllllllllIIIlIllIIIIIlllIlIl, final ByteBuffer lllllllllllllIIIlIllIIIIIllIlIll) {
        GL11.glTexSubImage2D(lllllllllllllIIIlIllIIIIIlllllII, lllllllllllllIIIlIllIIIIIlllIIlI, lllllllllllllIIIlIllIIIIIlllIIIl, lllllllllllllIIIlIllIIIIIllllIIl, lllllllllllllIIIlIllIIIIIllllIII, lllllllllllllIIIlIllIIIIIllIlllI, lllllllllllllIIIlIllIIIIIllIllIl, lllllllllllllIIIlIllIIIIIlllIlIl, lllllllllllllIIIlIllIIIIIllIlIll);
    }
    
    public void glClipPlane(final int lllllllllllllIIIlIllIIIllIllIIIl, final DoubleBuffer lllllllllllllIIIlIllIIIllIllIIII) {
        GL11.glClipPlane(lllllllllllllIIIlIllIIIllIllIIIl, lllllllllllllIIIlIllIIIllIllIIII);
    }
    
    static {
        lllIlIlIllIlIlI();
    }
}
