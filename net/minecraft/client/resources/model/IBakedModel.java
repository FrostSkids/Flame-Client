// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.model;

import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.block.model.BakedQuad;
import java.util.List;
import net.minecraft.util.EnumFacing;

public interface IBakedModel
{
    List<BakedQuad> getFaceQuads(final EnumFacing p0);
    
    TextureAtlasSprite getParticleTexture();
    
    ItemCameraTransforms getItemCameraTransforms();
    
    List<BakedQuad> getGeneralQuads();
    
    boolean isAmbientOcclusion();
    
    boolean isBuiltInRenderer();
    
    boolean isGui3d();
}
