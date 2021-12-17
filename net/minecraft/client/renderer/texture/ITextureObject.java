// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import java.io.IOException;
import net.minecraft.client.resources.IResourceManager;

public interface ITextureObject
{
    void loadTexture(final IResourceManager p0) throws IOException;
    
    void restoreLastBlurMipmap();
    
    int getGlTextureId();
    
    void setBlurMipmap(final boolean p0, final boolean p1);
}
