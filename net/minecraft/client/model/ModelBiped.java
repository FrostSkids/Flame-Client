// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelBiped extends ModelBase
{
    public /* synthetic */ int heldItemLeft;
    private static final /* synthetic */ int[] llIlllIlIllIIl;
    public /* synthetic */ ModelRenderer bipedLeftLeg;
    public /* synthetic */ ModelRenderer bipedBody;
    public /* synthetic */ ModelRenderer bipedHeadwear;
    public /* synthetic */ ModelRenderer bipedRightArm;
    public /* synthetic */ boolean aimedBow;
    public /* synthetic */ ModelRenderer bipedHead;
    public /* synthetic */ int heldItemRight;
    public /* synthetic */ ModelRenderer bipedLeftArm;
    public /* synthetic */ boolean isSneak;
    public /* synthetic */ ModelRenderer bipedRightLeg;
    
    @Override
    public void render(final Entity llllllllllllIllIIlIIIllIlllIllII, final float llllllllllllIllIIlIIIllIlllIlIll, final float llllllllllllIllIIlIIIllIllllIIll, final float llllllllllllIllIIlIIIllIlllIlIIl, final float llllllllllllIllIIlIIIllIlllIlIII, final float llllllllllllIllIIlIIIllIllllIIII, final float llllllllllllIllIIlIIIllIlllIIllI) {
        this.setRotationAngles(llllllllllllIllIIlIIIllIlllIlIll, llllllllllllIllIIlIIIllIllllIIll, llllllllllllIllIIlIIIllIlllIlIIl, llllllllllllIllIIlIIIllIlllIlIII, llllllllllllIllIIlIIIllIllllIIII, llllllllllllIllIIlIIIllIlllIIllI, llllllllllllIllIIlIIIllIlllIllII);
        GlStateManager.pushMatrix();
        if (lIIllIIllllIIIlI(this.isChild ? 1 : 0)) {
            final float llllllllllllIllIIlIIIllIlllIlllI = 2.0f;
            GlStateManager.scale(1.5f / llllllllllllIllIIlIIIllIlllIlllI, 1.5f / llllllllllllIllIIlIIIllIlllIlllI, 1.5f / llllllllllllIllIIlIIIllIlllIlllI);
            GlStateManager.translate(0.0f, 16.0f * llllllllllllIllIIlIIIllIlllIIllI, 0.0f);
            this.bipedHead.render(llllllllllllIllIIlIIIllIlllIIllI);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.0f / llllllllllllIllIIlIIIllIlllIlllI, 1.0f / llllllllllllIllIIlIIIllIlllIlllI, 1.0f / llllllllllllIllIIlIIIllIlllIlllI);
            GlStateManager.translate(0.0f, 24.0f * llllllllllllIllIIlIIIllIlllIIllI, 0.0f);
            this.bipedBody.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedRightArm.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedLeftArm.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedRightLeg.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedLeftLeg.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedHeadwear.render(llllllllllllIllIIlIIIllIlllIIllI);
            "".length();
            if ((0x80 ^ 0x84) != (0xC5 ^ 0xC1)) {
                return;
            }
        }
        else {
            if (lIIllIIllllIIIlI(llllllllllllIllIIlIIIllIlllIllII.isSneaking() ? 1 : 0)) {
                GlStateManager.translate(0.0f, 0.2f, 0.0f);
            }
            this.bipedHead.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedBody.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedRightArm.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedLeftArm.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedRightLeg.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedLeftLeg.render(llllllllllllIllIIlIIIllIlllIIllI);
            this.bipedHeadwear.render(llllllllllllIllIIlIIIllIlllIIllI);
        }
        GlStateManager.popMatrix();
    }
    
    public ModelBiped(final float llllllllllllIllIIlIIIlllIIIIlIII, final float llllllllllllIllIIlIIIlllIIIIIIlI, final int llllllllllllIllIIlIIIlllIIIIIIIl, final int llllllllllllIllIIlIIIlllIIIIIIII) {
        this.textureWidth = llllllllllllIllIIlIIIlllIIIIIIIl;
        this.textureHeight = llllllllllllIllIIlIIIlllIIIIIIII;
        this.bipedHead = new ModelRenderer(this, ModelBiped.llIlllIlIllIIl[2], ModelBiped.llIlllIlIllIIl[2]);
        this.bipedHead.addBox(-4.0f, -8.0f, -4.0f, ModelBiped.llIlllIlIllIIl[3], ModelBiped.llIlllIlIllIIl[3], ModelBiped.llIlllIlIllIIl[3], llllllllllllIllIIlIIIlllIIIIlIII);
        this.bipedHead.setRotationPoint(0.0f, 0.0f + llllllllllllIllIIlIIIlllIIIIIIlI, 0.0f);
        this.bipedHeadwear = new ModelRenderer(this, ModelBiped.llIlllIlIllIIl[1], ModelBiped.llIlllIlIllIIl[2]);
        this.bipedHeadwear.addBox(-4.0f, -8.0f, -4.0f, ModelBiped.llIlllIlIllIIl[3], ModelBiped.llIlllIlIllIIl[3], ModelBiped.llIlllIlIllIIl[3], llllllllllllIllIIlIIIlllIIIIlIII + 0.5f);
        this.bipedHeadwear.setRotationPoint(0.0f, 0.0f + llllllllllllIllIIlIIIlllIIIIIIlI, 0.0f);
        this.bipedBody = new ModelRenderer(this, ModelBiped.llIlllIlIllIIl[4], ModelBiped.llIlllIlIllIIl[4]);
        this.bipedBody.addBox(-4.0f, 0.0f, -2.0f, ModelBiped.llIlllIlIllIIl[3], ModelBiped.llIlllIlIllIIl[5], ModelBiped.llIlllIlIllIIl[6], llllllllllllIllIIlIIIlllIIIIlIII);
        this.bipedBody.setRotationPoint(0.0f, 0.0f + llllllllllllIllIIlIIIlllIIIIIIlI, 0.0f);
        this.bipedRightArm = new ModelRenderer(this, ModelBiped.llIlllIlIllIIl[7], ModelBiped.llIlllIlIllIIl[4]);
        this.bipedRightArm.addBox(-3.0f, -2.0f, -2.0f, ModelBiped.llIlllIlIllIIl[6], ModelBiped.llIlllIlIllIIl[5], ModelBiped.llIlllIlIllIIl[6], llllllllllllIllIIlIIIlllIIIIlIII);
        this.bipedRightArm.setRotationPoint(-5.0f, 2.0f + llllllllllllIllIIlIIIlllIIIIIIlI, 0.0f);
        this.bipedLeftArm = new ModelRenderer(this, ModelBiped.llIlllIlIllIIl[7], ModelBiped.llIlllIlIllIIl[4]);
        this.bipedLeftArm.mirror = (ModelBiped.llIlllIlIllIIl[8] != 0);
        this.bipedLeftArm.addBox(-1.0f, -2.0f, -2.0f, ModelBiped.llIlllIlIllIIl[6], ModelBiped.llIlllIlIllIIl[5], ModelBiped.llIlllIlIllIIl[6], llllllllllllIllIIlIIIlllIIIIlIII);
        this.bipedLeftArm.setRotationPoint(5.0f, 2.0f + llllllllllllIllIIlIIIlllIIIIIIlI, 0.0f);
        this.bipedRightLeg = new ModelRenderer(this, ModelBiped.llIlllIlIllIIl[2], ModelBiped.llIlllIlIllIIl[4]);
        this.bipedRightLeg.addBox(-2.0f, 0.0f, -2.0f, ModelBiped.llIlllIlIllIIl[6], ModelBiped.llIlllIlIllIIl[5], ModelBiped.llIlllIlIllIIl[6], llllllllllllIllIIlIIIlllIIIIlIII);
        this.bipedRightLeg.setRotationPoint(-1.9f, 12.0f + llllllllllllIllIIlIIIlllIIIIIIlI, 0.0f);
        this.bipedLeftLeg = new ModelRenderer(this, ModelBiped.llIlllIlIllIIl[2], ModelBiped.llIlllIlIllIIl[4]);
        this.bipedLeftLeg.mirror = (ModelBiped.llIlllIlIllIIl[8] != 0);
        this.bipedLeftLeg.addBox(-2.0f, 0.0f, -2.0f, ModelBiped.llIlllIlIllIIl[6], ModelBiped.llIlllIlIllIIl[5], ModelBiped.llIlllIlIllIIl[6], llllllllllllIllIIlIIIlllIIIIlIII);
        this.bipedLeftLeg.setRotationPoint(1.9f, 12.0f + llllllllllllIllIIlIIIlllIIIIIIlI, 0.0f);
    }
    
    private static boolean lIIllIIllllIIIlI(final int llllllllllllIllIIlIIIllIlIlIllll) {
        return llllllllllllIllIIlIIIllIlIlIllll != 0;
    }
    
    public void postRenderArm(final float llllllllllllIllIIlIIIllIlIllIIIl) {
        this.bipedRightArm.postRender(llllllllllllIllIIlIIIllIlIllIIIl);
    }
    
    private static boolean lIIllIIllllIIlII(final int llllllllllllIllIIlIIIllIlIlIllIl) {
        return llllllllllllIllIIlIIIllIlIlIllIl > 0;
    }
    
    public ModelBiped(final float llllllllllllIllIIlIIIlllIIIIllll) {
        this(llllllllllllIllIIlIIIlllIIIIllll, 0.0f, ModelBiped.llIlllIlIllIIl[0], ModelBiped.llIlllIlIllIIl[1]);
    }
    
    public ModelBiped() {
        this(0.0f);
    }
    
    private static void lIIllIIllllIIIIl() {
        (llIlllIlIllIIl = new int[9])[0] = (0x49 ^ 0x9);
        ModelBiped.llIlllIlIllIIl[1] = (0x68 ^ 0x48);
        ModelBiped.llIlllIlIllIIl[2] = ((0x1C ^ 0x35 ^ (0x3 ^ 0x27)) & (0xBF ^ 0x9A ^ (0x38 ^ 0x10) ^ -" ".length()));
        ModelBiped.llIlllIlIllIIl[3] = (0xA3 ^ 0xAB);
        ModelBiped.llIlllIlIllIIl[4] = (0x7 ^ 0x50 ^ (0xF2 ^ 0xB5));
        ModelBiped.llIlllIlIllIIl[5] = (0x16 ^ 0x1A);
        ModelBiped.llIlllIlIllIIl[6] = (0x25 ^ 0x52 ^ (0xD1 ^ 0xA2));
        ModelBiped.llIlllIlIllIIl[7] = (0x2A ^ 0x33 ^ (0x20 ^ 0x11));
        ModelBiped.llIlllIlIllIIl[8] = " ".length();
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIllIIlIIIllIllIIllIl, final float llllllllllllIllIIlIIIllIllIIllII, final float llllllllllllIllIIlIIIllIllIllIII, final float llllllllllllIllIIlIIIllIllIIlIlI, final float llllllllllllIllIIlIIIllIllIlIllI, final float llllllllllllIllIIlIIIllIllIlIlIl, final Entity llllllllllllIllIIlIIIllIllIlIlII) {
        this.bipedHead.rotateAngleY = llllllllllllIllIIlIIIllIllIIlIlI / 57.295776f;
        this.bipedHead.rotateAngleX = llllllllllllIllIIlIIIllIllIlIllI / 57.295776f;
        this.bipedRightArm.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIllIllIIllIl * 0.6662f + 3.1415927f) * 2.0f * llllllllllllIllIIlIIIllIllIIllII * 0.5f;
        this.bipedLeftArm.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIllIllIIllIl * 0.6662f) * 2.0f * llllllllllllIllIIlIIIllIllIIllII * 0.5f;
        this.bipedRightArm.rotateAngleZ = 0.0f;
        this.bipedLeftArm.rotateAngleZ = 0.0f;
        this.bipedRightLeg.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIllIllIIllIl * 0.6662f) * 1.4f * llllllllllllIllIIlIIIllIllIIllII;
        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIllIllIIllIl * 0.6662f + 3.1415927f) * 1.4f * llllllllllllIllIIlIIIllIllIIllII;
        this.bipedRightLeg.rotateAngleY = 0.0f;
        this.bipedLeftLeg.rotateAngleY = 0.0f;
        if (lIIllIIllllIIIlI(this.isRiding ? 1 : 0)) {
            final ModelRenderer bipedRightArm = this.bipedRightArm;
            bipedRightArm.rotateAngleX -= 0.62831855f;
            final ModelRenderer bipedLeftArm = this.bipedLeftArm;
            bipedLeftArm.rotateAngleX -= 0.62831855f;
            this.bipedRightLeg.rotateAngleX = -1.2566371f;
            this.bipedLeftLeg.rotateAngleX = -1.2566371f;
            this.bipedRightLeg.rotateAngleY = 0.31415927f;
            this.bipedLeftLeg.rotateAngleY = -0.31415927f;
        }
        if (lIIllIIllllIIIlI(this.heldItemLeft)) {
            this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemLeft;
        }
        this.bipedRightArm.rotateAngleY = 0.0f;
        this.bipedRightArm.rotateAngleZ = 0.0f;
        switch (this.heldItemRight) {
            default: {
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
                break;
            }
            case 1: {
                this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemRight;
                "".length();
                if (((0x66 ^ 0x56) & ~(0x8B ^ 0xBB)) != 0x0) {
                    return;
                }
                break;
            }
            case 3: {
                this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemRight;
                this.bipedRightArm.rotateAngleY = -0.5235988f;
                break;
            }
        }
        this.bipedLeftArm.rotateAngleY = 0.0f;
        if (lIIllIIllllIIlII(lIIllIIllllIIIll(this.swingProgress, -9990.0f))) {
            float llllllllllllIllIIlIIIllIllIlIIll = this.swingProgress;
            this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(llllllllllllIllIIlIIIllIllIlIIll) * 3.1415927f * 2.0f) * 0.2f;
            this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0f;
            this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0f;
            this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0f;
            this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0f;
            final ModelRenderer bipedRightArm2 = this.bipedRightArm;
            bipedRightArm2.rotateAngleY += this.bipedBody.rotateAngleY;
            final ModelRenderer bipedLeftArm2 = this.bipedLeftArm;
            bipedLeftArm2.rotateAngleY += this.bipedBody.rotateAngleY;
            final ModelRenderer bipedLeftArm3 = this.bipedLeftArm;
            bipedLeftArm3.rotateAngleX += this.bipedBody.rotateAngleY;
            llllllllllllIllIIlIIIllIllIlIIll = 1.0f - this.swingProgress;
            llllllllllllIllIIlIIIllIllIlIIll *= llllllllllllIllIIlIIIllIllIlIIll;
            llllllllllllIllIIlIIIllIllIlIIll *= llllllllllllIllIIlIIIllIllIlIIll;
            llllllllllllIllIIlIIIllIllIlIIll = 1.0f - llllllllllllIllIIlIIIllIllIlIIll;
            final float llllllllllllIllIIlIIIllIllIlIIlI = MathHelper.sin(llllllllllllIllIIlIIIllIllIlIIll * 3.1415927f);
            final float llllllllllllIllIIlIIIllIllIlIIIl = MathHelper.sin(this.swingProgress * 3.1415927f) * -(this.bipedHead.rotateAngleX - 0.7f) * 0.75f;
            this.bipedRightArm.rotateAngleX -= (float)(llllllllllllIllIIlIIIllIllIlIIlI * 1.2 + llllllllllllIllIIlIIIllIllIlIIIl);
            final ModelRenderer bipedRightArm3 = this.bipedRightArm;
            bipedRightArm3.rotateAngleY += this.bipedBody.rotateAngleY * 2.0f;
            final ModelRenderer bipedRightArm4 = this.bipedRightArm;
            bipedRightArm4.rotateAngleZ += MathHelper.sin(this.swingProgress * 3.1415927f) * -0.4f;
        }
        if (lIIllIIllllIIIlI(this.isSneak ? 1 : 0)) {
            this.bipedBody.rotateAngleX = 0.5f;
            final ModelRenderer bipedRightArm5 = this.bipedRightArm;
            bipedRightArm5.rotateAngleX += 0.4f;
            final ModelRenderer bipedLeftArm4 = this.bipedLeftArm;
            bipedLeftArm4.rotateAngleX += 0.4f;
            this.bipedRightLeg.rotationPointZ = 4.0f;
            this.bipedLeftLeg.rotationPointZ = 4.0f;
            this.bipedRightLeg.rotationPointY = 9.0f;
            this.bipedLeftLeg.rotationPointY = 9.0f;
            this.bipedHead.rotationPointY = 1.0f;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.bipedBody.rotateAngleX = 0.0f;
            this.bipedRightLeg.rotationPointZ = 0.1f;
            this.bipedLeftLeg.rotationPointZ = 0.1f;
            this.bipedRightLeg.rotationPointY = 12.0f;
            this.bipedLeftLeg.rotationPointY = 12.0f;
            this.bipedHead.rotationPointY = 0.0f;
        }
        final ModelRenderer bipedRightArm6 = this.bipedRightArm;
        bipedRightArm6.rotateAngleZ += MathHelper.cos(llllllllllllIllIIlIIIllIllIllIII * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedLeftArm5 = this.bipedLeftArm;
        bipedLeftArm5.rotateAngleZ -= MathHelper.cos(llllllllllllIllIIlIIIllIllIllIII * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedRightArm7 = this.bipedRightArm;
        bipedRightArm7.rotateAngleX += MathHelper.sin(llllllllllllIllIIlIIIllIllIllIII * 0.067f) * 0.05f;
        final ModelRenderer bipedLeftArm6 = this.bipedLeftArm;
        bipedLeftArm6.rotateAngleX -= MathHelper.sin(llllllllllllIllIIlIIIllIllIllIII * 0.067f) * 0.05f;
        if (lIIllIIllllIIIlI(this.aimedBow ? 1 : 0)) {
            final float llllllllllllIllIIlIIIllIllIlIIII = 0.0f;
            final float llllllllllllIllIIlIIIllIllIIllll = 0.0f;
            this.bipedRightArm.rotateAngleZ = 0.0f;
            this.bipedLeftArm.rotateAngleZ = 0.0f;
            this.bipedRightArm.rotateAngleY = -(0.1f - llllllllllllIllIIlIIIllIllIlIIII * 0.6f) + this.bipedHead.rotateAngleY;
            this.bipedLeftArm.rotateAngleY = 0.1f - llllllllllllIllIIlIIIllIllIlIIII * 0.6f + this.bipedHead.rotateAngleY + 0.4f;
            this.bipedRightArm.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
            this.bipedLeftArm.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
            final ModelRenderer bipedRightArm8 = this.bipedRightArm;
            bipedRightArm8.rotateAngleX -= llllllllllllIllIIlIIIllIllIlIIII * 1.2f - llllllllllllIllIIlIIIllIllIIllll * 0.4f;
            final ModelRenderer bipedLeftArm7 = this.bipedLeftArm;
            bipedLeftArm7.rotateAngleX -= llllllllllllIllIIlIIIllIllIlIIII * 1.2f - llllllllllllIllIIlIIIllIllIIllll * 0.4f;
            final ModelRenderer bipedRightArm9 = this.bipedRightArm;
            bipedRightArm9.rotateAngleZ += MathHelper.cos(llllllllllllIllIIlIIIllIllIllIII * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer bipedLeftArm8 = this.bipedLeftArm;
            bipedLeftArm8.rotateAngleZ -= MathHelper.cos(llllllllllllIllIIlIIIllIllIllIII * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer bipedRightArm10 = this.bipedRightArm;
            bipedRightArm10.rotateAngleX += MathHelper.sin(llllllllllllIllIIlIIIllIllIllIII * 0.067f) * 0.05f;
            final ModelRenderer bipedLeftArm9 = this.bipedLeftArm;
            bipedLeftArm9.rotateAngleX -= MathHelper.sin(llllllllllllIllIIlIIIllIllIllIII * 0.067f) * 0.05f;
        }
        ModelBase.copyModelAngles(this.bipedHead, this.bipedHeadwear);
    }
    
    static {
        lIIllIIllllIIIIl();
    }
    
    private static int lIIllIIllllIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void setModelAttributes(final ModelBase llllllllllllIllIIlIIIllIllIIIIIl) {
        super.setModelAttributes(llllllllllllIllIIlIIIllIllIIIIIl);
        if (lIIllIIllllIIIlI((llllllllllllIllIIlIIIllIllIIIIIl instanceof ModelBiped) ? 1 : 0)) {
            final ModelBiped llllllllllllIllIIlIIIllIllIIIIII = (ModelBiped)llllllllllllIllIIlIIIllIllIIIIIl;
            this.heldItemLeft = llllllllllllIllIIlIIIllIllIIIIII.heldItemLeft;
            this.heldItemRight = llllllllllllIllIIlIIIllIllIIIIII.heldItemRight;
            this.isSneak = llllllllllllIllIIlIIIllIllIIIIII.isSneak;
            this.aimedBow = llllllllllllIllIIlIIIllIllIIIIII.aimedBow;
        }
    }
    
    public void setInvisible(final boolean llllllllllllIllIIlIIIllIlIllIlll) {
        this.bipedHead.showModel = llllllllllllIllIIlIIIllIlIllIlll;
        this.bipedHeadwear.showModel = llllllllllllIllIIlIIIllIlIllIlll;
        this.bipedBody.showModel = llllllllllllIllIIlIIIllIlIllIlll;
        this.bipedRightArm.showModel = llllllllllllIllIIlIIIllIlIllIlll;
        this.bipedLeftArm.showModel = llllllllllllIllIIlIIIllIlIllIlll;
        this.bipedRightLeg.showModel = llllllllllllIllIIlIIIllIlIllIlll;
        this.bipedLeftLeg.showModel = llllllllllllIllIIlIIIllIlIllIlll;
    }
}
