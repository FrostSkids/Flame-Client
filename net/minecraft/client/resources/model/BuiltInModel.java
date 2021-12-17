// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.model;

import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.EnumFacing;
import net.minecraft.client.renderer.block.model.BakedQuad;
import java.util.List;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;

public class BuiltInModel implements IBakedModel
{
    private /* synthetic */ ItemCameraTransforms cameraTransforms;
    private static final /* synthetic */ int[] lllIlllIllIlII;
    
    @Override
    public List<BakedQuad> getGeneralQuads() {
        return null;
    }
    
    @Override
    public boolean isAmbientOcclusion() {
        return BuiltInModel.lllIlllIllIlII[0] != 0;
    }
    
    static {
        lIlIIlIlllIIIlll();
    }
    
    private static void lIlIIlIlllIIIlll() {
        (lllIlllIllIlII = new int[2])[0] = (("  ".length() ^ (0x80 ^ 0xC4)) & (0x3B ^ 0x7D ^ ((0xC9 ^ 0x9C) & ~(0x36 ^ 0x63)) ^ -" ".length()));
        BuiltInModel.lllIlllIllIlII[1] = " ".length();
    }
    
    public BuiltInModel(final ItemCameraTransforms llllllllllllIlIllIIIIIllIlIIlIlI) {
        this.cameraTransforms = llllllllllllIlIllIIIIIllIlIIlIlI;
    }
    
    @Override
    public List<BakedQuad> getFaceQuads(final EnumFacing llllllllllllIlIllIIIIIllIlIIIllI) {
        return null;
    }
    
    @Override
    public boolean isBuiltInRenderer() {
        return BuiltInModel.lllIlllIllIlII[1] != 0;
    }
    
    @Override
    public ItemCameraTransforms getItemCameraTransforms() {
        return this.cameraTransforms;
    }
    
    @Override
    public TextureAtlasSprite getParticleTexture() {
        return null;
    }
    
    @Override
    public boolean isGui3d() {
        return BuiltInModel.lllIlllIllIlII[1] != 0;
    }
}
