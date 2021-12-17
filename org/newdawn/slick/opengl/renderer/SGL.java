// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.renderer;

import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public interface SGL
{
    void glGenTextures(final IntBuffer p0);
    
    void glLineWidth(final float p0);
    
    boolean canSecondaryColor();
    
    void glTexSubImage2D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final ByteBuffer p8);
    
    void glReadPixels(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final ByteBuffer p6);
    
    void glTexImage2D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final ByteBuffer p8);
    
    void glClear(final int p0);
    
    void glClearDepth(final float p0);
    
    void glBegin(final int p0);
    
    void glNewList(final int p0, final int p1);
    
    void glEnd();
    
    void glDepthMask(final boolean p0);
    
    void glLoadIdentity();
    
    void enterOrtho(final int p0, final int p1);
    
    void glScissor(final int p0, final int p1, final int p2, final int p3);
    
    void glBindTexture(final int p0, final int p1);
    
    void glRotatef(final float p0, final float p1, final float p2, final float p3);
    
    void setGlobalAlphaScale(final float p0);
    
    void glColorMask(final boolean p0, final boolean p1, final boolean p2, final boolean p3);
    
    void glColor4f(final float p0, final float p1, final float p2, final float p3);
    
    void glPushMatrix();
    
    void glTranslatef(final float p0, final float p1, final float p2);
    
    void glDeleteTextures(final IntBuffer p0);
    
    void glVertex3f(final float p0, final float p1, final float p2);
    
    void glCopyTexImage2D(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7);
    
    void glGetFloat(final int p0, final FloatBuffer p1);
    
    void glGetTexImage(final int p0, final int p1, final int p2, final int p3, final ByteBuffer p4);
    
    float[] getCurrentColor();
    
    void glTexCoord2f(final float p0, final float p1);
    
    void glDepthFunc(final int p0);
    
    void glGetInteger(final int p0, final IntBuffer p1);
    
    void glEnable(final int p0);
    
    void glScalef(final float p0, final float p1, final float p2);
    
    void glEndList();
    
    int glGenLists(final int p0);
    
    void glClipPlane(final int p0, final DoubleBuffer p1);
    
    void glTexParameteri(final int p0, final int p1, final int p2);
    
    void glVertex2f(final float p0, final float p1);
    
    boolean canTextureMirrorClamp();
    
    void glCallList(final int p0);
    
    void glClearColor(final float p0, final float p1, final float p2, final float p3);
    
    void glLoadMatrix(final FloatBuffer p0);
    
    void glPointSize(final float p0);
    
    void initDisplay(final int p0, final int p1);
    
    void glGetError();
    
    void glDeleteLists(final int p0, final int p1);
    
    void glTexEnvi(final int p0, final int p1, final int p2);
    
    void glPopMatrix();
    
    void glBlendFunc(final int p0, final int p1);
    
    void glSecondaryColor3ubEXT(final byte p0, final byte p1, final byte p2);
    
    void glDisable(final int p0);
    
    void flush();
}
