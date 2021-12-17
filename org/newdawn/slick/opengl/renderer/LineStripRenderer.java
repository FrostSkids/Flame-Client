// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.renderer;

public interface LineStripRenderer
{
    void start();
    
    void setWidth(final float p0);
    
    void end();
    
    void setLineCaps(final boolean p0);
    
    boolean applyGLLineFixes();
    
    void color(final float p0, final float p1, final float p2, final float p3);
    
    void vertex(final float p0, final float p1);
    
    void setAntiAlias(final boolean p0);
}
