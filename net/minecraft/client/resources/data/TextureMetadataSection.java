// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources.data;

import java.util.Collections;
import java.util.List;

public class TextureMetadataSection implements IMetadataSection
{
    private final /* synthetic */ boolean textureBlur;
    private final /* synthetic */ List<Integer> listMipmaps;
    private final /* synthetic */ boolean textureClamp;
    
    public TextureMetadataSection(final boolean llllllllllllIlIlllllIllllllIllll, final boolean llllllllllllIlIlllllIllllllIlIlI, final List<Integer> llllllllllllIlIlllllIllllllIllIl) {
        this.textureBlur = llllllllllllIlIlllllIllllllIllll;
        this.textureClamp = llllllllllllIlIlllllIllllllIlIlI;
        this.listMipmaps = llllllllllllIlIlllllIllllllIllIl;
    }
    
    public List<Integer> getListMipmaps() {
        return Collections.unmodifiableList((List<? extends Integer>)this.listMipmaps);
    }
    
    public boolean getTextureClamp() {
        return this.textureClamp;
    }
    
    public boolean getTextureBlur() {
        return this.textureBlur;
    }
}
