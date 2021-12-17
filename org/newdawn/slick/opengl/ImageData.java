// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.nio.ByteBuffer;

public interface ImageData
{
    ByteBuffer getImageBufferData();
    
    int getTexWidth();
    
    int getDepth();
    
    int getWidth();
    
    int getTexHeight();
    
    int getHeight();
}
