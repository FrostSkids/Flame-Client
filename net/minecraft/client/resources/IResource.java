// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import net.minecraft.client.resources.data.IMetadataSection;
import java.io.InputStream;
import net.minecraft.util.ResourceLocation;

public interface IResource
{
    ResourceLocation getResourceLocation();
    
    String getResourcePackName();
    
    boolean hasMetadata();
    
    InputStream getInputStream();
    
     <T extends IMetadataSection> T getMetadata(final String p0);
}
