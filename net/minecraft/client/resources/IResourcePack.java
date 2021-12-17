// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.awt.image.BufferedImage;
import net.minecraft.client.resources.data.IMetadataSection;
import net.minecraft.client.resources.data.IMetadataSerializer;
import java.io.IOException;
import java.io.InputStream;
import net.minecraft.util.ResourceLocation;
import java.util.Set;

public interface IResourcePack
{
    Set<String> getResourceDomains();
    
    String getPackName();
    
    InputStream getInputStream(final ResourceLocation p0) throws IOException;
    
    boolean resourceExists(final ResourceLocation p0);
    
     <T extends IMetadataSection> T getPackMetadata(final IMetadataSerializer p0, final String p1) throws IOException;
    
    BufferedImage getPackImage() throws IOException;
}
