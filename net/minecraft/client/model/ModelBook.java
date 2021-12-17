// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelBook extends ModelBase
{
    public /* synthetic */ ModelRenderer coverLeft;
    public /* synthetic */ ModelRenderer flippingPageRight;
    private static final /* synthetic */ int[] lIIlIlIlIIlIll;
    public /* synthetic */ ModelRenderer bookSpine;
    public /* synthetic */ ModelRenderer pagesLeft;
    public /* synthetic */ ModelRenderer coverRight;
    public /* synthetic */ ModelRenderer pagesRight;
    public /* synthetic */ ModelRenderer flippingPageLeft;
    
    public ModelBook() {
        this.coverRight = new ModelRenderer(this).setTextureOffset(ModelBook.lIIlIlIlIIlIll[0], ModelBook.lIIlIlIlIIlIll[0]).addBox(-6.0f, -5.0f, 0.0f, ModelBook.lIIlIlIlIIlIll[1], ModelBook.lIIlIlIlIIlIll[2], ModelBook.lIIlIlIlIIlIll[0]);
        this.coverLeft = new ModelRenderer(this).setTextureOffset(ModelBook.lIIlIlIlIIlIll[3], ModelBook.lIIlIlIlIIlIll[0]).addBox(0.0f, -5.0f, 0.0f, ModelBook.lIIlIlIlIIlIll[1], ModelBook.lIIlIlIlIIlIll[2], ModelBook.lIIlIlIlIIlIll[0]);
        this.pagesRight = new ModelRenderer(this).setTextureOffset(ModelBook.lIIlIlIlIIlIll[0], ModelBook.lIIlIlIlIIlIll[2]).addBox(0.0f, -4.0f, -0.99f, ModelBook.lIIlIlIlIIlIll[4], ModelBook.lIIlIlIlIIlIll[5], ModelBook.lIIlIlIlIIlIll[6]);
        this.pagesLeft = new ModelRenderer(this).setTextureOffset(ModelBook.lIIlIlIlIIlIll[7], ModelBook.lIIlIlIlIIlIll[2]).addBox(0.0f, -4.0f, -0.01f, ModelBook.lIIlIlIlIIlIll[4], ModelBook.lIIlIlIlIIlIll[5], ModelBook.lIIlIlIlIIlIll[6]);
        this.flippingPageRight = new ModelRenderer(this).setTextureOffset(ModelBook.lIIlIlIlIIlIll[8], ModelBook.lIIlIlIlIIlIll[2]).addBox(0.0f, -4.0f, 0.0f, ModelBook.lIIlIlIlIIlIll[4], ModelBook.lIIlIlIlIIlIll[5], ModelBook.lIIlIlIlIIlIll[0]);
        this.flippingPageLeft = new ModelRenderer(this).setTextureOffset(ModelBook.lIIlIlIlIIlIll[8], ModelBook.lIIlIlIlIIlIll[2]).addBox(0.0f, -4.0f, 0.0f, ModelBook.lIIlIlIlIIlIll[4], ModelBook.lIIlIlIlIIlIll[5], ModelBook.lIIlIlIlIIlIll[0]);
        this.bookSpine = new ModelRenderer(this).setTextureOffset(ModelBook.lIIlIlIlIIlIll[7], ModelBook.lIIlIlIlIIlIll[0]).addBox(-1.0f, -5.0f, 0.0f, ModelBook.lIIlIlIlIIlIll[9], ModelBook.lIIlIlIlIIlIll[2], ModelBook.lIIlIlIlIIlIll[0]);
        this.coverRight.setRotationPoint(0.0f, 0.0f, -1.0f);
        this.coverLeft.setRotationPoint(0.0f, 0.0f, 1.0f);
        this.bookSpine.rotateAngleY = 1.5707964f;
    }
    
    private static void llIlIIIIIlllllI() {
        (lIIlIlIlIIlIll = new int[10])[0] = ((0x81 ^ 0x93) & ~(0xAD ^ 0xBF));
        ModelBook.lIIlIlIlIIlIll[1] = (0xE1 ^ 0x83 ^ (0xEB ^ 0x8F));
        ModelBook.lIIlIlIlIIlIll[2] = (0x30 ^ 0x1C ^ (0x87 ^ 0xA1));
        ModelBook.lIIlIlIlIIlIll[3] = (0x44 ^ 0x54);
        ModelBook.lIIlIlIlIIlIll[4] = (0x0 ^ 0x5);
        ModelBook.lIIlIlIlIIlIll[5] = (5 + 89 - 55 + 91 ^ 87 + 61 - 38 + 28);
        ModelBook.lIIlIlIlIIlIll[6] = " ".length();
        ModelBook.lIIlIlIlIIlIll[7] = (0x80 ^ 0xB9 ^ (0x32 ^ 0x7));
        ModelBook.lIIlIlIlIIlIll[8] = (0xD6 ^ 0xC2 ^ (0xBB ^ 0xB7));
        ModelBook.lIIlIlIlIIlIll[9] = "  ".length();
    }
    
    @Override
    public void render(final Entity lllllllllllllIIllIlIIIIIlIlIIlII, final float lllllllllllllIIllIlIIIIIlIlIlIll, final float lllllllllllllIIllIlIIIIIlIlIlIlI, final float lllllllllllllIIllIlIIIIIlIlIlIIl, final float lllllllllllllIIllIlIIIIIlIlIIIII, final float lllllllllllllIIllIlIIIIIlIIlllll, final float lllllllllllllIIllIlIIIIIlIlIIllI) {
        this.setRotationAngles(lllllllllllllIIllIlIIIIIlIlIlIll, lllllllllllllIIllIlIIIIIlIlIlIlI, lllllllllllllIIllIlIIIIIlIlIlIIl, lllllllllllllIIllIlIIIIIlIlIIIII, lllllllllllllIIllIlIIIIIlIIlllll, lllllllllllllIIllIlIIIIIlIlIIllI, lllllllllllllIIllIlIIIIIlIlIIlII);
        this.coverRight.render(lllllllllllllIIllIlIIIIIlIlIIllI);
        this.coverLeft.render(lllllllllllllIIllIlIIIIIlIlIIllI);
        this.bookSpine.render(lllllllllllllIIllIlIIIIIlIlIIllI);
        this.pagesRight.render(lllllllllllllIIllIlIIIIIlIlIIllI);
        this.pagesLeft.render(lllllllllllllIIllIlIIIIIlIlIIllI);
        this.flippingPageRight.render(lllllllllllllIIllIlIIIIIlIlIIllI);
        this.flippingPageLeft.render(lllllllllllllIIllIlIIIIIlIlIIllI);
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIllIlIIIIIlIIlIllI, final float lllllllllllllIIllIlIIIIIlIIlIlIl, final float lllllllllllllIIllIlIIIIIlIIIlIll, final float lllllllllllllIIllIlIIIIIlIIIlIlI, final float lllllllllllllIIllIlIIIIIlIIlIIlI, final float lllllllllllllIIllIlIIIIIlIIlIIIl, final Entity lllllllllllllIIllIlIIIIIlIIlIIII) {
        final float lllllllllllllIIllIlIIIIIlIIIllll = (MathHelper.sin(lllllllllllllIIllIlIIIIIlIIlIllI * 0.02f) * 0.1f + 1.25f) * lllllllllllllIIllIlIIIIIlIIIlIlI;
        this.coverRight.rotateAngleY = 3.1415927f + lllllllllllllIIllIlIIIIIlIIIllll;
        this.coverLeft.rotateAngleY = -lllllllllllllIIllIlIIIIIlIIIllll;
        this.pagesRight.rotateAngleY = lllllllllllllIIllIlIIIIIlIIIllll;
        this.pagesLeft.rotateAngleY = -lllllllllllllIIllIlIIIIIlIIIllll;
        this.flippingPageRight.rotateAngleY = lllllllllllllIIllIlIIIIIlIIIllll - lllllllllllllIIllIlIIIIIlIIIllll * 2.0f * lllllllllllllIIllIlIIIIIlIIlIlIl;
        this.flippingPageLeft.rotateAngleY = lllllllllllllIIllIlIIIIIlIIIllll - lllllllllllllIIllIlIIIIIlIIIllll * 2.0f * lllllllllllllIIllIlIIIIIlIIIlIll;
        this.pagesRight.rotationPointX = MathHelper.sin(lllllllllllllIIllIlIIIIIlIIIllll);
        this.pagesLeft.rotationPointX = MathHelper.sin(lllllllllllllIIllIlIIIIIlIIIllll);
        this.flippingPageRight.rotationPointX = MathHelper.sin(lllllllllllllIIllIlIIIIIlIIIllll);
        this.flippingPageLeft.rotationPointX = MathHelper.sin(lllllllllllllIIllIlIIIIIlIIIllll);
    }
    
    static {
        llIlIIIIIlllllI();
    }
}
