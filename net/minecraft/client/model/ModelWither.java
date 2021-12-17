// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.EntityLivingBase;

public class ModelWither extends ModelBase
{
    private /* synthetic */ ModelRenderer[] field_82905_a;
    private static final /* synthetic */ int[] lIlIlllIIIIlII;
    private /* synthetic */ ModelRenderer[] field_82904_b;
    
    static {
        llllIIlIlllIIll();
    }
    
    private static boolean llllIIlIlllIlIl(final int lllllllllllllIIIIlIlllllIlIIlIII, final int lllllllllllllIIIIlIlllllIlIIIlll) {
        return lllllllllllllIIIIlIlllllIlIIlIII >= lllllllllllllIIIIlIlllllIlIIIlll;
    }
    
    public ModelWither(final float lllllllllllllIIIIlIlllllllIIllll) {
        this.textureWidth = ModelWither.lIlIlllIIIIlII[0];
        this.textureHeight = ModelWither.lIlIlllIIIIlII[0];
        this.field_82905_a = new ModelRenderer[ModelWither.lIlIlllIIIIlII[1]];
        (this.field_82905_a[ModelWither.lIlIlllIIIIlII[2]] = new ModelRenderer(this, ModelWither.lIlIlllIIIIlII[2], ModelWither.lIlIlllIIIIlII[3])).addBox(-10.0f, 3.9f, -0.5f, ModelWither.lIlIlllIIIIlII[4], ModelWither.lIlIlllIIIIlII[1], ModelWither.lIlIlllIIIIlII[1], lllllllllllllIIIIlIlllllllIIllll);
        (this.field_82905_a[ModelWither.lIlIlllIIIIlII[5]] = new ModelRenderer(this).setTextureSize(this.textureWidth, this.textureHeight)).setRotationPoint(-2.0f, 6.9f, -0.5f);
        this.field_82905_a[ModelWither.lIlIlllIIIIlII[5]].setTextureOffset(ModelWither.lIlIlllIIIIlII[2], ModelWither.lIlIlllIIIIlII[6]).addBox(0.0f, 0.0f, 0.0f, ModelWither.lIlIlllIIIIlII[1], ModelWither.lIlIlllIIIIlII[7], ModelWither.lIlIlllIIIIlII[1], lllllllllllllIIIIlIlllllllIIllll);
        this.field_82905_a[ModelWither.lIlIlllIIIIlII[5]].setTextureOffset(ModelWither.lIlIlllIIIIlII[8], ModelWither.lIlIlllIIIIlII[6]).addBox(-4.0f, 1.5f, 0.5f, ModelWither.lIlIlllIIIIlII[9], ModelWither.lIlIlllIIIIlII[10], ModelWither.lIlIlllIIIIlII[10], lllllllllllllIIIIlIlllllllIIllll);
        this.field_82905_a[ModelWither.lIlIlllIIIIlII[5]].setTextureOffset(ModelWither.lIlIlllIIIIlII[8], ModelWither.lIlIlllIIIIlII[6]).addBox(-4.0f, 4.0f, 0.5f, ModelWither.lIlIlllIIIIlII[9], ModelWither.lIlIlllIIIIlII[10], ModelWither.lIlIlllIIIIlII[10], lllllllllllllIIIIlIlllllllIIllll);
        this.field_82905_a[ModelWither.lIlIlllIIIIlII[5]].setTextureOffset(ModelWither.lIlIlllIIIIlII[8], ModelWither.lIlIlllIIIIlII[6]).addBox(-4.0f, 6.5f, 0.5f, ModelWither.lIlIlllIIIIlII[9], ModelWither.lIlIlllIIIIlII[10], ModelWither.lIlIlllIIIIlII[10], lllllllllllllIIIIlIlllllllIIllll);
        (this.field_82905_a[ModelWither.lIlIlllIIIIlII[10]] = new ModelRenderer(this, ModelWither.lIlIlllIIIIlII[11], ModelWither.lIlIlllIIIIlII[6])).addBox(0.0f, 0.0f, 0.0f, ModelWither.lIlIlllIIIIlII[1], ModelWither.lIlIlllIIIIlII[12], ModelWither.lIlIlllIIIIlII[1], lllllllllllllIIIIlIlllllllIIllll);
        this.field_82904_b = new ModelRenderer[ModelWither.lIlIlllIIIIlII[1]];
        (this.field_82904_b[ModelWither.lIlIlllIIIIlII[2]] = new ModelRenderer(this, ModelWither.lIlIlllIIIIlII[2], ModelWither.lIlIlllIIIIlII[2])).addBox(-4.0f, -4.0f, -4.0f, ModelWither.lIlIlllIIIIlII[13], ModelWither.lIlIlllIIIIlII[13], ModelWither.lIlIlllIIIIlII[13], lllllllllllllIIIIlIlllllllIIllll);
        (this.field_82904_b[ModelWither.lIlIlllIIIIlII[5]] = new ModelRenderer(this, ModelWither.lIlIlllIIIIlII[14], ModelWither.lIlIlllIIIIlII[2])).addBox(-4.0f, -4.0f, -4.0f, ModelWither.lIlIlllIIIIlII[12], ModelWither.lIlIlllIIIIlII[12], ModelWither.lIlIlllIIIIlII[12], lllllllllllllIIIIlIlllllllIIllll);
        this.field_82904_b[ModelWither.lIlIlllIIIIlII[5]].rotationPointX = -8.0f;
        this.field_82904_b[ModelWither.lIlIlllIIIIlII[5]].rotationPointY = 4.0f;
        (this.field_82904_b[ModelWither.lIlIlllIIIIlII[10]] = new ModelRenderer(this, ModelWither.lIlIlllIIIIlII[14], ModelWither.lIlIlllIIIIlII[2])).addBox(-4.0f, -4.0f, -4.0f, ModelWither.lIlIlllIIIIlII[12], ModelWither.lIlIlllIIIIlII[12], ModelWither.lIlIlllIIIIlII[12], lllllllllllllIIIIlIlllllllIIllll);
        this.field_82904_b[ModelWither.lIlIlllIIIIlII[10]].rotationPointX = 10.0f;
        this.field_82904_b[ModelWither.lIlIlllIIIIlII[10]].rotationPointY = 4.0f;
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase lllllllllllllIIIIlIlllllIlIllIlI, final float lllllllllllllIIIIlIlllllIlIllIII, final float lllllllllllllIIIIlIlllllIlIlIlll, final float lllllllllllllIIIIlIlllllIlIlIlIl) {
        final EntityWither lllllllllllllIIIIlIlllllIlIlIIll = (EntityWither)lllllllllllllIIIIlIlllllIlIllIlI;
        int lllllllllllllIIIIlIlllllIlIlIIlI = ModelWither.lIlIlllIIIIlII[5];
        "".length();
        if ("  ".length() >= (0x8D ^ 0x89)) {
            return;
        }
        while (!llllIIlIlllIlIl(lllllllllllllIIIIlIlllllIlIlIIlI, ModelWither.lIlIlllIIIIlII[1])) {
            this.field_82904_b[lllllllllllllIIIIlIlllllIlIlIIlI].rotateAngleY = (lllllllllllllIIIIlIlllllIlIlIIll.func_82207_a(lllllllllllllIIIIlIlllllIlIlIIlI - ModelWither.lIlIlllIIIIlII[5]) - lllllllllllllIIIIlIlllllIlIllIlI.renderYawOffset) / 57.295776f;
            this.field_82904_b[lllllllllllllIIIIlIlllllIlIlIIlI].rotateAngleX = lllllllllllllIIIIlIlllllIlIlIIll.func_82210_r(lllllllllllllIIIIlIlllllIlIlIIlI - ModelWither.lIlIlllIIIIlII[5]) / 57.295776f;
            ++lllllllllllllIIIIlIlllllIlIlIIlI;
        }
    }
    
    @Override
    public void render(final Entity lllllllllllllIIIIlIllllllIIllIII, final float lllllllllllllIIIIlIllllllIIlIllI, final float lllllllllllllIIIIlIllllllIlIIlll, final float lllllllllllllIIIIlIllllllIlIIlIl, final float lllllllllllllIIIIlIllllllIlIIIll, final float lllllllllllllIIIIlIllllllIlIIIIl, final float lllllllllllllIIIIlIllllllIIlIIII) {
        this.setRotationAngles(lllllllllllllIIIIlIllllllIIlIllI, lllllllllllllIIIIlIllllllIlIIlll, lllllllllllllIIIIlIllllllIlIIlIl, lllllllllllllIIIIlIllllllIlIIIll, lllllllllllllIIIIlIllllllIlIIIIl, lllllllllllllIIIIlIllllllIIlIIII, lllllllllllllIIIIlIllllllIIllIII);
        Exception lllllllllllllIIIIlIllllllIIIlIll;
        boolean lllllllllllllIIIIlIllllllIIIllIl = ((ModelRenderer[])(Object)(lllllllllllllIIIIlIllllllIIIlIll = (Exception)(Object)this.field_82904_b)).length != 0;
        String lllllllllllllIIIIlIllllllIIIlllI = (String)ModelWither.lIlIlllIIIIlII[2];
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!llllIIlIlllIlIl((int)lllllllllllllIIIIlIllllllIIIlllI, lllllllllllllIIIIlIllllllIIIllIl ? 1 : 0)) {
            final ModelRenderer lllllllllllllIIIIlIllllllIIlllIl = lllllllllllllIIIIlIllllllIIIlIll[lllllllllllllIIIIlIllllllIIIlllI];
            lllllllllllllIIIIlIllllllIIlllIl.render(lllllllllllllIIIIlIllllllIIlIIII);
            ++lllllllllllllIIIIlIllllllIIIlllI;
        }
        lllllllllllllIIIIlIllllllIIIllIl = (((ModelRenderer[])(Object)(lllllllllllllIIIIlIllllllIIIlIll = (Exception)(Object)this.field_82905_a)).length != 0);
        lllllllllllllIIIIlIllllllIIIlllI = (String)ModelWither.lIlIlllIIIIlII[2];
        "".length();
        if ("  ".length() < 0) {
            return;
        }
        while (!llllIIlIlllIlIl((int)lllllllllllllIIIIlIllllllIIIlllI, lllllllllllllIIIIlIllllllIIIllIl ? 1 : 0)) {
            final ModelRenderer lllllllllllllIIIIlIllllllIIlllII = lllllllllllllIIIIlIllllllIIIlIll[lllllllllllllIIIIlIllllllIIIlllI];
            lllllllllllllIIIIlIllllllIIlllII.render(lllllllllllllIIIIlIllllllIIlIIII);
            ++lllllllllllllIIIIlIllllllIIIlllI;
        }
    }
    
    private static void llllIIlIlllIIll() {
        (lIlIlllIIIIlII = new int[15])[0] = (0xEF ^ 0xAF);
        ModelWither.lIlIlllIIIIlII[1] = "   ".length();
        ModelWither.lIlIlllIIIIlII[2] = ((0xA4 ^ 0xAC ^ (0x43 ^ 0x70)) & (87 + 87 - 83 + 52 ^ 63 + 100 - 7 + 24 ^ -" ".length()));
        ModelWither.lIlIlllIIIIlII[3] = (0x98 ^ 0x88);
        ModelWither.lIlIlllIIIIlII[4] = (95 + 99 - 185 + 149 ^ 26 + 0 + 91 + 21);
        ModelWither.lIlIlllIIIIlII[5] = " ".length();
        ModelWither.lIlIlllIIIIlII[6] = (0x97 ^ 0x81);
        ModelWither.lIlIlllIIIIlII[7] = (70 + 103 - 104 + 81 ^ 36 + 136 - 56 + 40);
        ModelWither.lIlIlllIIIIlII[8] = (0x12 ^ 0xA);
        ModelWither.lIlIlllIIIIlII[9] = (0x22 ^ 0x29);
        ModelWither.lIlIlllIIIIlII[10] = "  ".length();
        ModelWither.lIlIlllIIIIlII[11] = (0x3F ^ 0x33);
        ModelWither.lIlIlllIIIIlII[12] = (0x72 ^ 0x5A ^ (0x1E ^ 0x30));
        ModelWither.lIlIlllIIIIlII[13] = (0x11 ^ 0x19);
        ModelWither.lIlIlllIIIIlII[14] = (0x59 ^ 0x6A ^ (0xA5 ^ 0xB6));
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIIIlIlllllIllllIIl, final float lllllllllllllIIIIlIlllllIlllIlll, final float lllllllllllllIIIIlIlllllIlllIllI, final float lllllllllllllIIIIlIlllllIllIllII, final float lllllllllllllIIIIlIlllllIlllIlII, final float lllllllllllllIIIIlIlllllIlllIIll, final Entity lllllllllllllIIIIlIlllllIlllIIlI) {
        final float lllllllllllllIIIIlIlllllIlllIIIl = MathHelper.cos(lllllllllllllIIIIlIlllllIlllIllI * 0.1f);
        this.field_82905_a[ModelWither.lIlIlllIIIIlII[5]].rotateAngleX = (0.065f + 0.05f * lllllllllllllIIIIlIlllllIlllIIIl) * 3.1415927f;
        this.field_82905_a[ModelWither.lIlIlllIIIIlII[10]].setRotationPoint(-2.0f, 6.9f + MathHelper.cos(this.field_82905_a[ModelWither.lIlIlllIIIIlII[5]].rotateAngleX) * 10.0f, -0.5f + MathHelper.sin(this.field_82905_a[ModelWither.lIlIlllIIIIlII[5]].rotateAngleX) * 10.0f);
        this.field_82905_a[ModelWither.lIlIlllIIIIlII[10]].rotateAngleX = (0.265f + 0.1f * lllllllllllllIIIIlIlllllIlllIIIl) * 3.1415927f;
        this.field_82904_b[ModelWither.lIlIlllIIIIlII[2]].rotateAngleY = lllllllllllllIIIIlIlllllIllIllII / 57.295776f;
        this.field_82904_b[ModelWither.lIlIlllIIIIlII[2]].rotateAngleX = lllllllllllllIIIIlIlllllIlllIlII / 57.295776f;
    }
}
