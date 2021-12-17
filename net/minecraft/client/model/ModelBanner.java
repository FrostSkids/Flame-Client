// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

public class ModelBanner extends ModelBase
{
    public /* synthetic */ ModelRenderer bannerTop;
    public /* synthetic */ ModelRenderer bannerStand;
    private static final /* synthetic */ int[] lIlIlIIlIlIIII;
    public /* synthetic */ ModelRenderer bannerSlate;
    
    private static void lllIllIIIlIllIl() {
        (lIlIlIIlIlIIII = new int[8])[0] = (0x2 ^ 0x42);
        ModelBanner.lIlIlIIlIlIIII[1] = ((0x29 ^ 0x6) & ~(0x25 ^ 0xA));
        ModelBanner.lIlIlIIlIlIIII[2] = (0x24 ^ 0x31 ^ " ".length());
        ModelBanner.lIlIlIIlIlIIII[3] = (0xA1 ^ 0x89);
        ModelBanner.lIlIlIIlIlIIII[4] = " ".length();
        ModelBanner.lIlIlIIlIlIIII[5] = (0x1E ^ 0x46 ^ (0x12 ^ 0x66));
        ModelBanner.lIlIlIIlIlIIII[6] = "  ".length();
        ModelBanner.lIlIlIIlIlIIII[7] = (114 + 75 - 147 + 127 ^ 108 + 6 - 34 + 51);
    }
    
    public void renderBanner() {
        this.bannerSlate.rotationPointY = -32.0f;
        this.bannerSlate.render(0.0625f);
        this.bannerStand.render(0.0625f);
        this.bannerTop.render(0.0625f);
    }
    
    public ModelBanner() {
        this.textureWidth = ModelBanner.lIlIlIIlIlIIII[0];
        this.textureHeight = ModelBanner.lIlIlIIlIlIIII[0];
        this.bannerSlate = new ModelRenderer(this, ModelBanner.lIlIlIIlIlIIII[1], ModelBanner.lIlIlIIlIlIIII[1]);
        this.bannerSlate.addBox(-10.0f, 0.0f, -2.0f, ModelBanner.lIlIlIIlIlIIII[2], ModelBanner.lIlIlIIlIlIIII[3], ModelBanner.lIlIlIIlIlIIII[4], 0.0f);
        this.bannerStand = new ModelRenderer(this, ModelBanner.lIlIlIIlIlIIII[5], ModelBanner.lIlIlIIlIlIIII[1]);
        this.bannerStand.addBox(-1.0f, -30.0f, -1.0f, ModelBanner.lIlIlIIlIlIIII[6], ModelBanner.lIlIlIIlIlIIII[7], ModelBanner.lIlIlIIlIlIIII[6], 0.0f);
        this.bannerTop = new ModelRenderer(this, ModelBanner.lIlIlIIlIlIIII[1], ModelBanner.lIlIlIIlIlIIII[7]);
        this.bannerTop.addBox(-10.0f, -32.0f, -1.0f, ModelBanner.lIlIlIIlIlIIII[2], ModelBanner.lIlIlIIlIlIIII[6], ModelBanner.lIlIlIIlIlIIII[6], 0.0f);
    }
    
    static {
        lllIllIIIlIllIl();
    }
}
