// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.renderer;

import org.lwjgl.BufferUtils;
import java.nio.DoubleBuffer;
import org.lwjgl.opengl.GL11;
import java.nio.FloatBuffer;

public class VAOGLRenderer extends ImmediateModeOGLRenderer
{
    private /* synthetic */ float[] cols;
    private /* synthetic */ float[] color;
    private /* synthetic */ float[] texs;
    private /* synthetic */ FloatBuffer colors;
    private /* synthetic */ int listMode;
    private /* synthetic */ int currentType;
    private /* synthetic */ FloatBuffer vertices;
    private /* synthetic */ FloatBuffer textures;
    private /* synthetic */ int vertIndex;
    private /* synthetic */ float[] tex;
    private static final /* synthetic */ int[] lllIlIIIlllllI;
    private /* synthetic */ float[] verts;
    
    @Override
    public void glScissor(final int llllllllllllIlIlllIIIlIllIllIlll, final int llllllllllllIlIlllIIIlIllIllIIIl, final int llllllllllllIlIlllIIIlIllIllIIII, final int llllllllllllIlIlllIIIlIllIlIllll) {
        this.applyBuffer();
        super.glScissor(llllllllllllIlIlllIIIlIllIllIlll, llllllllllllIlIlllIIIlIllIllIIIl, llllllllllllIlIlllIIIlIllIllIIII, llllllllllllIlIlllIIIlIllIlIllll);
    }
    
    private static boolean lIlIIIIllllIllII(final int llllllllllllIlIlllIIIlIlIllllIll, final int llllllllllllIlIlllIIIlIlIllllIlI) {
        return llllllllllllIlIlllIIIlIlIllllIll < llllllllllllIlIlllIIIlIlIllllIlI;
    }
    
    private boolean isSplittable(final int llllllllllllIlIlllIIIllIIIlIlllI, final int llllllllllllIlIlllIIIllIIIlIllIl) {
        switch (llllllllllllIlIlllIIIllIIIlIllIl) {
            case 7: {
                int n;
                if (lIlIIIIllllIlIlI(llllllllllllIlIlllIIIllIIIlIlllI % VAOGLRenderer.lllIlIIIlllllI[1])) {
                    n = VAOGLRenderer.lllIlIIIlllllI[3];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return ((0xC ^ 0x3A) & ~(0x56 ^ 0x60)) != 0x0;
                    }
                }
                else {
                    n = VAOGLRenderer.lllIlIIIlllllI[2];
                }
                return n != 0;
            }
            case 4: {
                int n2;
                if (lIlIIIIllllIlIlI(llllllllllllIlIlllIIIllIIIlIlllI % VAOGLRenderer.lllIlIIIlllllI[5])) {
                    n2 = VAOGLRenderer.lllIlIIIlllllI[3];
                    "".length();
                    if (-" ".length() >= "  ".length()) {
                        return ((0xAB ^ 0x91) & ~(0x18 ^ 0x22)) != 0x0;
                    }
                }
                else {
                    n2 = VAOGLRenderer.lllIlIIIlllllI[2];
                }
                return n2 != 0;
            }
            case 6913: {
                int n3;
                if (lIlIIIIllllIlIlI(llllllllllllIlIlllIIIllIIIlIlllI % VAOGLRenderer.lllIlIIIlllllI[4])) {
                    n3 = VAOGLRenderer.lllIlIIIlllllI[3];
                    "".length();
                    if (null != null) {
                        return ((0x19 ^ 0x1) & ~(0x33 ^ 0x2B)) != 0x0;
                    }
                }
                else {
                    n3 = VAOGLRenderer.lllIlIIIlllllI[2];
                }
                return n3 != 0;
            }
            default: {
                return VAOGLRenderer.lllIlIIIlllllI[2] != 0;
            }
        }
    }
    
    @Override
    public void glBindTexture(final int llllllllllllIlIlllIIIllIIIlIlIII, final int llllllllllllIlIlllIIIllIIIlIIlll) {
        this.applyBuffer();
        super.glBindTexture(llllllllllllIlIlllIIIllIIIlIlIII, llllllllllllIlIlllIIIllIIIlIIlll);
    }
    
    @Override
    public void glLineWidth(final float llllllllllllIlIlllIIIlIllllIIlIl) {
        this.applyBuffer();
        super.glLineWidth(llllllllllllIlIlllIIIlIllllIIlIl);
    }
    
    @Override
    public void glPopMatrix() {
        this.applyBuffer();
        super.glPopMatrix();
    }
    
    private void flushBuffer() {
        if (lIlIIIIllllIlIlI(this.vertIndex)) {
            return;
        }
        if (lIlIIIIllllIlIll(this.currentType, VAOGLRenderer.lllIlIIIlllllI[0])) {
            return;
        }
        if (lIlIIIIllllIllII(this.vertIndex, VAOGLRenderer.lllIlIIIlllllI[12])) {
            GL11.glBegin(this.currentType);
            int llllllllllllIlIlllIIIllIIlllIllI = VAOGLRenderer.lllIlIIIlllllI[2];
            while (lIlIIIIllllIllII(llllllllllllIlIlllIIIllIIlllIllI, this.vertIndex)) {
                GL11.glColor4f(this.cols[llllllllllllIlIlllIIIllIIlllIllI * VAOGLRenderer.lllIlIIIlllllI[1] + VAOGLRenderer.lllIlIIIlllllI[2]], this.cols[llllllllllllIlIlllIIIllIIlllIllI * VAOGLRenderer.lllIlIIIlllllI[1] + VAOGLRenderer.lllIlIIIlllllI[3]], this.cols[llllllllllllIlIlllIIIllIIlllIllI * VAOGLRenderer.lllIlIIIlllllI[1] + VAOGLRenderer.lllIlIIIlllllI[4]], this.cols[llllllllllllIlIlllIIIllIIlllIllI * VAOGLRenderer.lllIlIIIlllllI[1] + VAOGLRenderer.lllIlIIIlllllI[5]]);
                GL11.glTexCoord2f(this.texs[llllllllllllIlIlllIIIllIIlllIllI * VAOGLRenderer.lllIlIIIlllllI[4] + VAOGLRenderer.lllIlIIIlllllI[2]], this.texs[llllllllllllIlIlllIIIllIIlllIllI * VAOGLRenderer.lllIlIIIlllllI[4] + VAOGLRenderer.lllIlIIIlllllI[3]]);
                GL11.glVertex3f(this.verts[llllllllllllIlIlllIIIllIIlllIllI * VAOGLRenderer.lllIlIIIlllllI[5] + VAOGLRenderer.lllIlIIIlllllI[2]], this.verts[llllllllllllIlIlllIIIllIIlllIllI * VAOGLRenderer.lllIlIIIlllllI[5] + VAOGLRenderer.lllIlIIIlllllI[3]], this.verts[llllllllllllIlIlllIIIllIIlllIllI * VAOGLRenderer.lllIlIIIlllllI[5] + VAOGLRenderer.lllIlIIIlllllI[4]]);
                ++llllllllllllIlIlllIIIllIIlllIllI;
                "".length();
                if ((0x57 ^ 0x53) < -" ".length()) {
                    return;
                }
            }
            GL11.glEnd();
            this.currentType = VAOGLRenderer.lllIlIIIlllllI[0];
            return;
        }
        this.vertices.clear();
        "".length();
        this.colors.clear();
        "".length();
        this.textures.clear();
        "".length();
        this.vertices.put(this.verts, VAOGLRenderer.lllIlIIIlllllI[2], this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[5]);
        "".length();
        this.colors.put(this.cols, VAOGLRenderer.lllIlIIIlllllI[2], this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[1]);
        "".length();
        this.textures.put(this.texs, VAOGLRenderer.lllIlIIIlllllI[2], this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[4]);
        "".length();
        this.vertices.flip();
        "".length();
        this.colors.flip();
        "".length();
        this.textures.flip();
        "".length();
        GL11.glVertexPointer(VAOGLRenderer.lllIlIIIlllllI[5], VAOGLRenderer.lllIlIIIlllllI[2], this.vertices);
        GL11.glColorPointer(VAOGLRenderer.lllIlIIIlllllI[1], VAOGLRenderer.lllIlIIIlllllI[2], this.colors);
        GL11.glTexCoordPointer(VAOGLRenderer.lllIlIIIlllllI[4], VAOGLRenderer.lllIlIIIlllllI[2], this.textures);
        GL11.glDrawArrays(this.currentType, VAOGLRenderer.lllIlIIIlllllI[2], this.vertIndex);
        this.currentType = VAOGLRenderer.lllIlIIIlllllI[0];
    }
    
    @Override
    public void initDisplay(final int llllllllllllIlIlllIIIllIIlllllIl, final int llllllllllllIlIlllIIIllIIlllllll) {
        super.initDisplay(llllllllllllIlIlllIIIllIIlllllIl, llllllllllllIlIlllIIIllIIlllllll);
        this.startBuffer();
        GL11.glEnableClientState(VAOGLRenderer.lllIlIIIlllllI[9]);
        GL11.glEnableClientState(VAOGLRenderer.lllIlIIIlllllI[10]);
        GL11.glEnableClientState(VAOGLRenderer.lllIlIIIlllllI[11]);
    }
    
    @Override
    public void flush() {
        super.flush();
        this.applyBuffer();
    }
    
    @Override
    public void glEndList() {
        this.listMode -= VAOGLRenderer.lllIlIIIlllllI[3];
        super.glEndList();
    }
    
    @Override
    public void glPushMatrix() {
        this.applyBuffer();
        super.glPushMatrix();
    }
    
    @Override
    public void glTranslatef(final float llllllllllllIlIlllIIIlIllIIllIIl, final float llllllllllllIlIlllIIIlIllIIllIII, final float llllllllllllIlIlllIIIlIllIIlIlll) {
        this.applyBuffer();
        super.glTranslatef(llllllllllllIlIlllIIIlIllIIllIIl, llllllllllllIlIlllIIIlIllIIllIII, llllllllllllIlIlllIIIlIllIIlIlll);
    }
    
    @Override
    public void glRotatef(final float llllllllllllIlIlllIIIlIlllIlIIlI, final float llllllllllllIlIlllIIIlIlllIlIIIl, final float llllllllllllIlIlllIIIlIlllIIlIll, final float llllllllllllIlIlllIIIlIlllIIllll) {
        this.applyBuffer();
        super.glRotatef(llllllllllllIlIlllIIIlIlllIlIIlI, llllllllllllIlIlllIIIlIlllIlIIIl, llllllllllllIlIlllIIIlIlllIIlIll, llllllllllllIlIlllIIIlIlllIIllll);
    }
    
    @Override
    public void glLoadMatrix(final FloatBuffer llllllllllllIlIlllIIIlIllIIIIIlI) {
        this.flushBuffer();
        super.glLoadMatrix(llllllllllllIlIlllIIIlIllIIIIIlI);
    }
    
    private static boolean lIlIIIIllllIllIl(final int llllllllllllIlIlllIIIlIlIlllIIII) {
        return llllllllllllIlIlllIIIlIlIlllIIII > 0;
    }
    
    private void startBuffer() {
        this.vertIndex = VAOGLRenderer.lllIlIIIlllllI[2];
    }
    
    private static boolean lIlIIIIllllIlllI(final int llllllllllllIlIlllIIIlIlIlllIlII) {
        return llllllllllllIlIlllIIIlIlIlllIlII != 0;
    }
    
    @Override
    public float[] getCurrentColor() {
        return this.color;
    }
    
    @Override
    public void glDisable(final int llllllllllllIlIlllIIIlIlllllIIll) {
        this.applyBuffer();
        super.glDisable(llllllllllllIlIlllIIIlIlllllIIll);
    }
    
    private static boolean lIlIIIIllllIllll(final int llllllllllllIlIlllIIIlIlIllIllIl, final int llllllllllllIlIlllIIIlIlIllIllII) {
        return llllllllllllIlIlllIIIlIlIllIllIl != llllllllllllIlIlllIIIlIlIllIllII;
    }
    
    @Override
    public void glNewList(final int llllllllllllIlIlllIIIlIllIIIllII, final int llllllllllllIlIlllIIIlIllIIIlllI) {
        this.listMode += VAOGLRenderer.lllIlIIIlllllI[3];
        super.glNewList(llllllllllllIlIlllIIIlIllIIIllII, llllllllllllIlIlllIIIlIllIIIlllI);
    }
    
    @Override
    public void glVertex3f(final float llllllllllllIlIlllIIIllIIIllIlll, final float llllllllllllIlIlllIIIllIIIlllIlI, final float llllllllllllIlIlllIIIllIIIlllIIl) {
        if (lIlIIIIllllIllIl(this.listMode)) {
            super.glVertex3f(llllllllllllIlIlllIIIllIIIllIlll, llllllllllllIlIlllIIIllIIIlllIlI, llllllllllllIlIlllIIIllIIIlllIIl);
            return;
        }
        this.verts[this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[5] + VAOGLRenderer.lllIlIIIlllllI[2]] = llllllllllllIlIlllIIIllIIIllIlll;
        this.verts[this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[5] + VAOGLRenderer.lllIlIIIlllllI[3]] = llllllllllllIlIlllIIIllIIIlllIlI;
        this.verts[this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[5] + VAOGLRenderer.lllIlIIIlllllI[4]] = llllllllllllIlIlllIIIllIIIlllIIl;
        this.cols[this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[1] + VAOGLRenderer.lllIlIIIlllllI[2]] = this.color[VAOGLRenderer.lllIlIIIlllllI[2]];
        this.cols[this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[1] + VAOGLRenderer.lllIlIIIlllllI[3]] = this.color[VAOGLRenderer.lllIlIIIlllllI[3]];
        this.cols[this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[1] + VAOGLRenderer.lllIlIIIlllllI[4]] = this.color[VAOGLRenderer.lllIlIIIlllllI[4]];
        this.cols[this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[1] + VAOGLRenderer.lllIlIIIlllllI[5]] = this.color[VAOGLRenderer.lllIlIIIlllllI[5]];
        this.texs[this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[4] + VAOGLRenderer.lllIlIIIlllllI[2]] = this.tex[VAOGLRenderer.lllIlIIIlllllI[2]];
        this.texs[this.vertIndex * VAOGLRenderer.lllIlIIIlllllI[4] + VAOGLRenderer.lllIlIIIlllllI[3]] = this.tex[VAOGLRenderer.lllIlIIIlllllI[3]];
        this.vertIndex += VAOGLRenderer.lllIlIIIlllllI[3];
        if (lIlIIIIlllllIIII(this.vertIndex, VAOGLRenderer.lllIlIIIlllllI[13]) && lIlIIIIllllIlllI(this.isSplittable(this.vertIndex, this.currentType) ? 1 : 0)) {
            final int llllllllllllIlIlllIIIllIIIllllIl = this.currentType;
            this.applyBuffer();
            this.currentType = llllllllllllIlIlllIIIllIIIllllIl;
        }
    }
    
    @Override
    public void glScalef(final float llllllllllllIlIlllIIIlIlllIIIlII, final float llllllllllllIlIlllIIIlIllIllllll, final float llllllllllllIlIlllIIIlIllIlllllI) {
        this.applyBuffer();
        super.glScalef(llllllllllllIlIlllIIIlIlllIIIlII, llllllllllllIlIlllIIIlIllIllllll, llllllllllllIlIlllIIIlIllIlllllI);
    }
    
    @Override
    public void glTexEnvi(final int llllllllllllIlIlllIIIlIllIlIIlIl, final int llllllllllllIlIlllIIIlIllIlIlIII, final int llllllllllllIlIlllIIIlIllIlIIIll) {
        this.applyBuffer();
        super.glTexEnvi(llllllllllllIlIlllIIIlIllIlIIlIl, llllllllllllIlIlllIIIlIllIlIlIII, llllllllllllIlIlllIIIlIllIlIIIll);
    }
    
    private static boolean lIlIIIIllllIlIll(final int llllllllllllIlIlllIIIlIlIlllllll, final int llllllllllllIlIlllIIIlIlIllllllI) {
        return llllllllllllIlIlllIIIlIlIlllllll == llllllllllllIlIlllIIIlIlIllllllI;
    }
    
    @Override
    public void glEnable(final int llllllllllllIlIlllIIIlIllllIllIl) {
        this.applyBuffer();
        super.glEnable(llllllllllllIlIlllIIIlIllllIllIl);
    }
    
    @Override
    public void glCallList(final int llllllllllllIlIlllIIIllIIIIlIlll) {
        this.applyBuffer();
        super.glCallList(llllllllllllIlIlllIIIllIIIIlIlll);
    }
    
    @Override
    public void glColor4f(final float llllllllllllIlIlllIIIllIIlIllIll, final float llllllllllllIlIlllIIIllIIlIllIlI, final float llllllllllllIlIlllIIIllIIlIllllI, float llllllllllllIlIlllIIIllIIlIllIII) {
        llllllllllllIlIlllIIIllIIlIllIII *= (byte)this.alphaScale;
        this.color[VAOGLRenderer.lllIlIIIlllllI[2]] = llllllllllllIlIlllIIIllIIlIllIll;
        this.color[VAOGLRenderer.lllIlIIIlllllI[3]] = llllllllllllIlIlllIIIllIIlIllIlI;
        this.color[VAOGLRenderer.lllIlIIIlllllI[4]] = llllllllllllIlIlllIIIllIIlIllllI;
        this.color[VAOGLRenderer.lllIlIIIlllllI[5]] = llllllllllllIlIlllIIIllIIlIllIII;
        if (lIlIIIIllllIllIl(this.listMode)) {
            super.glColor4f(llllllllllllIlIlllIIIllIIlIllIll, llllllllllllIlIlllIIIllIIlIllIlI, llllllllllllIlIlllIIIllIIlIllllI, llllllllllllIlIlllIIIllIIlIllIII);
        }
    }
    
    @Override
    public void glClear(final int llllllllllllIlIlllIIIllIIIIIllll) {
        this.applyBuffer();
        super.glClear(llllllllllllIlIlllIIIllIIIIIllll);
    }
    
    private static boolean lIlIIIIllllIlIlI(final int llllllllllllIlIlllIIIlIlIlllIIlI) {
        return llllllllllllIlIlllIIIlIlIlllIIlI == 0;
    }
    
    @Override
    public void glClipPlane(final int llllllllllllIlIlllIIIllIIIIIIlll, final DoubleBuffer llllllllllllIlIlllIIIllIIIIIlIIl) {
        this.applyBuffer();
        super.glClipPlane(llllllllllllIlIlllIIIllIIIIIIlll, llllllllllllIlIlllIIIllIIIIIlIIl);
    }
    
    public VAOGLRenderer() {
        this.currentType = VAOGLRenderer.lllIlIIIlllllI[0];
        final float[] color = new float[VAOGLRenderer.lllIlIIIlllllI[1]];
        color[VAOGLRenderer.lllIlIIIlllllI[2]] = 1.0f;
        color[VAOGLRenderer.lllIlIIIlllllI[3]] = 1.0f;
        color[VAOGLRenderer.lllIlIIIlllllI[4]] = 1.0f;
        color[VAOGLRenderer.lllIlIIIlllllI[5]] = 1.0f;
        this.color = color;
        final float[] tex = new float[VAOGLRenderer.lllIlIIIlllllI[4]];
        tex[VAOGLRenderer.lllIlIIIlllllI[2]] = 0.0f;
        tex[VAOGLRenderer.lllIlIIIlllllI[3]] = 0.0f;
        this.tex = tex;
        this.verts = new float[VAOGLRenderer.lllIlIIIlllllI[6]];
        this.cols = new float[VAOGLRenderer.lllIlIIIlllllI[7]];
        this.texs = new float[VAOGLRenderer.lllIlIIIlllllI[6]];
        this.vertices = BufferUtils.createFloatBuffer(VAOGLRenderer.lllIlIIIlllllI[6]);
        this.colors = BufferUtils.createFloatBuffer(VAOGLRenderer.lllIlIIIlllllI[7]);
        this.textures = BufferUtils.createFloatBuffer(VAOGLRenderer.lllIlIIIlllllI[8]);
        this.listMode = VAOGLRenderer.lllIlIIIlllllI[2];
    }
    
    @Override
    public void glEnd() {
        if (lIlIIIIllllIllIl(this.listMode)) {
            super.glEnd();
        }
    }
    
    private static void lIlIIIIllllIlIIl() {
        (lllIlIIIlllllI = new int[15])[0] = -" ".length();
        VAOGLRenderer.lllIlIIIlllllI[1] = (0x48 ^ 0x72 ^ (0x59 ^ 0x67));
        VAOGLRenderer.lllIlIIIlllllI[2] = ((0x2E ^ 0x1E ^ (0x24 ^ 0x40)) & (0x13 ^ 0x63 ^ (0x34 ^ 0x10) ^ -" ".length()));
        VAOGLRenderer.lllIlIIIlllllI[3] = " ".length();
        VAOGLRenderer.lllIlIIIlllllI[4] = "  ".length();
        VAOGLRenderer.lllIlIIIlllllI[5] = "   ".length();
        VAOGLRenderer.lllIlIIIlllllI[6] = (-(0x6B ^ 0x9) & (0xFFFFFFFB & 0x3AFD));
        VAOGLRenderer.lllIlIIIlllllI[7] = (0xFFFFCF64 & 0x7EBB);
        VAOGLRenderer.lllIlIIIlllllI[8] = (0xFFFFEF7C & 0x3793);
        VAOGLRenderer.lllIlIIIlllllI[9] = (-(0xFFFFE61B & 0x7DED) & (0xFFFFFE7F & 0xE5FC));
        VAOGLRenderer.lllIlIIIlllllI[10] = (0xFFFFCBFE & 0xB479);
        VAOGLRenderer.lllIlIIIlllllI[11] = (0xFFFFD6FF & 0xA976);
        VAOGLRenderer.lllIlIIIlllllI[12] = (0xB0 ^ 0xA4);
        VAOGLRenderer.lllIlIIIlllllI[13] = (-(0xFFFFFCBA & 0x4BE7) & (0xFFFFFBFF & 0x5FF7));
        VAOGLRenderer.lllIlIIIlllllI[14] = (-(0xFC ^ 0xBE) & (0xFFFFFBED & 0x17DB));
    }
    
    @Override
    public void glColorMask(final boolean llllllllllllIlIlllIIIlIllllllIlI, final boolean llllllllllllIlIlllIIIlIllllllIIl, final boolean llllllllllllIlIlllIIIlIlllllllIl, final boolean llllllllllllIlIlllIIIlIlllllllII) {
        this.applyBuffer();
        super.glColorMask(llllllllllllIlIlllIIIlIllllllIlI, llllllllllllIlIlllIIIlIllllllIIl, llllllllllllIlIlllIIIlIlllllllIl, llllllllllllIlIlllIIIlIlllllllII);
    }
    
    @Override
    public void glVertex2f(final float llllllllllllIlIlllIIIllIIlIIIlII, final float llllllllllllIlIlllIIIllIIlIIIIll) {
        if (lIlIIIIllllIllIl(this.listMode)) {
            super.glVertex2f(llllllllllllIlIlllIIIllIIlIIIlII, llllllllllllIlIlllIIIllIIlIIIIll);
            return;
        }
        this.glVertex3f(llllllllllllIlIlllIIIllIIlIIIlII, llllllllllllIlIlllIIIllIIlIIIIll, 0.0f);
    }
    
    private void applyBuffer() {
        if (lIlIIIIllllIllIl(this.listMode)) {
            return;
        }
        if (lIlIIIIllllIlllI(this.vertIndex)) {
            this.flushBuffer();
            this.startBuffer();
        }
        super.glColor4f(this.color[VAOGLRenderer.lllIlIIIlllllI[2]], this.color[VAOGLRenderer.lllIlIIIlllllI[3]], this.color[VAOGLRenderer.lllIlIIIlllllI[4]], this.color[VAOGLRenderer.lllIlIIIlllllI[5]]);
    }
    
    static {
        lIlIIIIllllIlIIl();
        NONE = VAOGLRenderer.lllIlIIIlllllI[0];
        TOLERANCE = VAOGLRenderer.lllIlIIIlllllI[12];
        MAX_VERTS = VAOGLRenderer.lllIlIIIlllllI[14];
    }
    
    @Override
    public void glBegin(final int llllllllllllIlIlllIIIllIIllIlIIl) {
        if (lIlIIIIllllIllIl(this.listMode)) {
            super.glBegin(llllllllllllIlIlllIIIllIIllIlIIl);
            return;
        }
        if (lIlIIIIllllIllll(this.currentType, llllllllllllIlIlllIIIllIIllIlIIl)) {
            this.applyBuffer();
            this.currentType = llllllllllllIlIlllIIIllIIllIlIIl;
        }
    }
    
    @Override
    public void glBlendFunc(final int llllllllllllIlIlllIIIllIIIIlllll, final int llllllllllllIlIlllIIIllIIIIllIll) {
        this.applyBuffer();
        super.glBlendFunc(llllllllllllIlIlllIIIllIIIIlllll, llllllllllllIlIlllIIIllIIIIllIll);
    }
    
    @Override
    public void glTexCoord2f(final float llllllllllllIlIlllIIIllIIlIlIIII, final float llllllllllllIlIlllIIIllIIlIIllII) {
        if (lIlIIIIllllIllIl(this.listMode)) {
            super.glTexCoord2f(llllllllllllIlIlllIIIllIIlIlIIII, llllllllllllIlIlllIIIllIIlIIllII);
            return;
        }
        this.tex[VAOGLRenderer.lllIlIIIlllllI[2]] = llllllllllllIlIlllIIIllIIlIlIIII;
        this.tex[VAOGLRenderer.lllIlIIIlllllI[3]] = llllllllllllIlIlllIIIllIIlIIllII;
    }
    
    @Override
    public void glPointSize(final float llllllllllllIlIlllIIIlIllllIIIIl) {
        this.applyBuffer();
        super.glPointSize(llllllllllllIlIlllIIIlIllllIIIIl);
    }
    
    private static boolean lIlIIIIlllllIIII(final int llllllllllllIlIlllIIIlIlIlllIlll, final int llllllllllllIlIlllIIIlIlIlllIllI) {
        return llllllllllllIlIlllIIIlIlIlllIlll > llllllllllllIlIlllIIIlIlIlllIllI;
    }
}
