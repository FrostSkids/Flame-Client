// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import java.awt.image.BufferedImage;
import java.io.IOException;
import net.minecraft.client.resources.IResourceManager;

public class DynamicTexture extends AbstractTexture
{
    private final /* synthetic */ int[] dynamicTextureData;
    private final /* synthetic */ int height;
    private final /* synthetic */ int width;
    private static final /* synthetic */ int[] lIllIlIIIIIllI;
    
    @Override
    public void loadTexture(final IResourceManager lllllllllllllIIIIIIIlIlIIIlIlllI) throws IOException {
    }
    
    private static void lllllIllllIlllI() {
        (lIllIlIIIIIllI = new int[1])[0] = ((91 + 93 - 115 + 63 ^ 61 + 35 + 4 + 80) & (2 + 43 + 46 + 92 ^ 36 + 109 - 100 + 90 ^ -" ".length()));
    }
    
    public DynamicTexture(final BufferedImage lllllllllllllIIIIIIIlIlIIIlllIll) {
        this(lllllllllllllIIIIIIIlIlIIIlllIll.getWidth(), lllllllllllllIIIIIIIlIlIIIlllIll.getHeight());
        lllllllllllllIIIIIIIlIlIIIlllIll.getRGB(DynamicTexture.lIllIlIIIIIllI[0], DynamicTexture.lIllIlIIIIIllI[0], lllllllllllllIIIIIIIlIlIIIlllIll.getWidth(), lllllllllllllIIIIIIIlIlIIIlllIll.getHeight(), this.dynamicTextureData, DynamicTexture.lIllIlIIIIIllI[0], lllllllllllllIIIIIIIlIlIIIlllIll.getWidth());
        "".length();
        this.updateDynamicTexture();
    }
    
    public void updateDynamicTexture() {
        TextureUtil.uploadTexture(this.getGlTextureId(), this.dynamicTextureData, this.width, this.height);
    }
    
    public int[] getTextureData() {
        return this.dynamicTextureData;
    }
    
    public DynamicTexture(final int lllllllllllllIIIIIIIlIlIIIllIIIl, final int lllllllllllllIIIIIIIlIlIIIllIIll) {
        this.width = lllllllllllllIIIIIIIlIlIIIllIIIl;
        this.height = lllllllllllllIIIIIIIlIlIIIllIIll;
        this.dynamicTextureData = new int[lllllllllllllIIIIIIIlIlIIIllIIIl * lllllllllllllIIIIIIIlIlIIIllIIll];
        TextureUtil.allocateTexture(this.getGlTextureId(), lllllllllllllIIIIIIIlIlIIIllIIIl, lllllllllllllIIIIIIIlIlIIIllIIll);
    }
    
    static {
        lllllIllllIlllI();
    }
}
