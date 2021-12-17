// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

public interface Texture
{
    float getWidth();
    
    int getImageHeight();
    
    int getTextureHeight();
    
    int getImageWidth();
    
    int getTextureID();
    
    byte[] getTextureData();
    
    String getTextureRef();
    
    int getTextureWidth();
    
    boolean hasAlpha();
    
    void release();
    
    float getHeight();
    
    void bind();
    
    void setTextureFilter(final int p0);
}
