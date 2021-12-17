// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

public interface Font
{
    int getHeight(final String p0);
    
    int getLineHeight();
    
    void drawString(final float p0, final float p1, final String p2);
    
    int getWidth(final String p0);
    
    void drawString(final float p0, final float p1, final String p2, final Color p3, final int p4, final int p5);
    
    void drawString(final float p0, final float p1, final String p2, final Color p3);
}
