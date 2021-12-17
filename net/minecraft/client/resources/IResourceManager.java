// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.util.List;
import java.util.Set;
import java.io.IOException;
import net.minecraft.util.ResourceLocation;

public interface IResourceManager
{
    IResource getResource(final ResourceLocation p0) throws IOException;
    
    Set<String> getResourceDomains();
    
    List<IResource> getAllResources(final ResourceLocation p0) throws IOException;
}
