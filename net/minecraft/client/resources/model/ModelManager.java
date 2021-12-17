// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.model;

import net.minecraft.client.resources.IResourceManager;
import net.minecraft.util.IRegistry;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.BlockModelShapes;
import net.minecraft.client.resources.IResourceManagerReloadListener;

public class ModelManager implements IResourceManagerReloadListener
{
    private final /* synthetic */ BlockModelShapes modelProvider;
    private final /* synthetic */ TextureMap texMap;
    private /* synthetic */ IRegistry<ModelResourceLocation, IBakedModel> modelRegistry;
    private /* synthetic */ IBakedModel defaultModel;
    
    private static boolean lIIlIIlllIllllIl(final Object llllllllllllIllIlIlIlllIlIlIlIII) {
        return llllllllllllIllIlIlIlllIlIlIlIII == null;
    }
    
    public ModelManager(final TextureMap llllllllllllIllIlIlIlllIllIIIlll) {
        this.texMap = llllllllllllIllIlIlIlllIllIIIlll;
        this.modelProvider = new BlockModelShapes(this);
    }
    
    @Override
    public void onResourceManagerReload(final IResourceManager llllllllllllIllIlIlIlllIlIllllIl) {
        final ModelBakery llllllllllllIllIlIlIlllIlIllllll = new ModelBakery(llllllllllllIllIlIlIlllIlIllllIl, this.texMap, this.modelProvider);
        this.modelRegistry = llllllllllllIllIlIlIlllIlIllllll.setupModelRegistry();
        this.defaultModel = this.modelRegistry.getObject(ModelBakery.MODEL_MISSING);
        this.modelProvider.reloadModels();
    }
    
    public IBakedModel getModel(final ModelResourceLocation llllllllllllIllIlIlIlllIlIllIlll) {
        if (lIIlIIlllIllllIl(llllllllllllIllIlIlIlllIlIllIlll)) {
            return this.defaultModel;
        }
        final IBakedModel llllllllllllIllIlIlIlllIlIllIllI = this.modelRegistry.getObject(llllllllllllIllIlIlIlllIlIllIlll);
        IBakedModel defaultModel;
        if (lIIlIIlllIllllIl(llllllllllllIllIlIlIlllIlIllIllI)) {
            defaultModel = this.defaultModel;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            defaultModel = llllllllllllIllIlIlIlllIlIllIllI;
        }
        return defaultModel;
    }
    
    public TextureMap getTextureMap() {
        return this.texMap;
    }
    
    public BlockModelShapes getBlockModelShapes() {
        return this.modelProvider;
    }
    
    public IBakedModel getMissingModel() {
        return this.defaultModel;
    }
}
