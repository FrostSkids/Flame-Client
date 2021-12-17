// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelPlayer extends ModelBiped
{
    private /* synthetic */ boolean smallArms;
    public /* synthetic */ ModelRenderer bipedLeftLegwear;
    private /* synthetic */ ModelRenderer bipedDeadmau5Head;
    public /* synthetic */ ModelRenderer bipedLeftArmwear;
    public /* synthetic */ ModelRenderer bipedBodyWear;
    public /* synthetic */ ModelRenderer bipedRightLegwear;
    private static final /* synthetic */ int[] lIllllIIllIlll;
    public /* synthetic */ ModelRenderer bipedRightArmwear;
    private /* synthetic */ ModelRenderer bipedCape;
    
    private static boolean lIIIIlIIIIllllIl(final int llllllllllllIllllIlIlIIlllIlIIIl) {
        return llllllllllllIllllIlIlIIlllIlIIIl != 0;
    }
    
    @Override
    public void postRenderArm(final float llllllllllllIllllIlIlIIlllIlIIll) {
        if (lIIIIlIIIIllllIl(this.smallArms ? 1 : 0)) {
            final ModelRenderer bipedRightArm = this.bipedRightArm;
            ++bipedRightArm.rotationPointX;
            this.bipedRightArm.postRender(llllllllllllIllllIlIlIIlllIlIIll);
            final ModelRenderer bipedRightArm2 = this.bipedRightArm;
            --bipedRightArm2.rotationPointX;
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            this.bipedRightArm.postRender(llllllllllllIllllIlIlIIlllIlIIll);
        }
    }
    
    @Override
    public void setInvisible(final boolean llllllllllllIllllIlIlIIlllIllIIl) {
        super.setInvisible(llllllllllllIllllIlIlIIlllIllIIl);
        this.bipedLeftArmwear.showModel = llllllllllllIllllIlIlIIlllIllIIl;
        this.bipedRightArmwear.showModel = llllllllllllIllllIlIlIIlllIllIIl;
        this.bipedLeftLegwear.showModel = llllllllllllIllllIlIlIIlllIllIIl;
        this.bipedRightLegwear.showModel = llllllllllllIllllIlIlIIlllIllIIl;
        this.bipedBodyWear.showModel = llllllllllllIllllIlIlIIlllIllIIl;
        this.bipedCape.showModel = llllllllllllIllllIlIlIIlllIllIIl;
        this.bipedDeadmau5Head.showModel = llllllllllllIllllIlIlIIlllIllIIl;
    }
    
    static {
        lIIIIlIIIIllllII();
    }
    
    public void renderLeftArm() {
        this.bipedLeftArm.render(0.0625f);
        this.bipedLeftArmwear.render(0.0625f);
    }
    
    public void renderCape(final float llllllllllllIllllIlIlIIlllllllll) {
        this.bipedCape.render(llllllllllllIllllIlIlIIlllllllll);
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIllllIlIlIIllllIlIll, final float llllllllllllIllllIlIlIIlllllIIlI, final float llllllllllllIllllIlIlIIlllllIIIl, final float llllllllllllIllllIlIlIIllllIlIII, final float llllllllllllIllllIlIlIIllllIllll, final float llllllllllllIllllIlIlIIllllIIllI, final Entity llllllllllllIllllIlIlIIllllIllIl) {
        super.setRotationAngles(llllllllllllIllllIlIlIIllllIlIll, llllllllllllIllllIlIlIIlllllIIlI, llllllllllllIllllIlIlIIlllllIIIl, llllllllllllIllllIlIlIIllllIlIII, llllllllllllIllllIlIlIIllllIllll, llllllllllllIllllIlIlIIllllIIllI, llllllllllllIllllIlIlIIllllIllIl);
        ModelBase.copyModelAngles(this.bipedLeftLeg, this.bipedLeftLegwear);
        ModelBase.copyModelAngles(this.bipedRightLeg, this.bipedRightLegwear);
        ModelBase.copyModelAngles(this.bipedLeftArm, this.bipedLeftArmwear);
        ModelBase.copyModelAngles(this.bipedRightArm, this.bipedRightArmwear);
        ModelBase.copyModelAngles(this.bipedBody, this.bipedBodyWear);
        if (lIIIIlIIIIllllIl(llllllllllllIllllIlIlIIllllIllIl.isSneaking() ? 1 : 0)) {
            this.bipedCape.rotationPointY = 2.0f;
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            this.bipedCape.rotationPointY = 0.0f;
        }
    }
    
    public void renderDeadmau5Head(final float llllllllllllIllllIlIlIlIIIIIIIll) {
        ModelBase.copyModelAngles(this.bipedHead, this.bipedDeadmau5Head);
        this.bipedDeadmau5Head.rotationPointX = 0.0f;
        this.bipedDeadmau5Head.rotationPointY = 0.0f;
        this.bipedDeadmau5Head.render(llllllllllllIllllIlIlIlIIIIIIIll);
    }
    
    public ModelPlayer(final float llllllllllllIllllIlIlIlIIIlIIlIl, final boolean llllllllllllIllllIlIlIlIIIlIIlII) {
        super(llllllllllllIllllIlIlIlIIIlIIlIl, 0.0f, ModelPlayer.lIllllIIllIlll[0], ModelPlayer.lIllllIIllIlll[0]);
        this.smallArms = llllllllllllIllllIlIlIlIIIlIIlII;
        this.bipedDeadmau5Head = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[1], ModelPlayer.lIllllIIllIlll[2]);
        this.bipedDeadmau5Head.addBox(-3.0f, -6.0f, -1.0f, ModelPlayer.lIllllIIllIlll[3], ModelPlayer.lIllllIIllIlll[3], ModelPlayer.lIllllIIllIlll[4], llllllllllllIllllIlIlIlIIIlIIlIl);
        this.bipedCape = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[2], ModelPlayer.lIllllIIllIlll[2]);
        this.bipedCape.setTextureSize(ModelPlayer.lIllllIIllIlll[0], ModelPlayer.lIllllIIllIlll[5]);
        "".length();
        this.bipedCape.addBox(-5.0f, 0.0f, -1.0f, ModelPlayer.lIllllIIllIlll[6], ModelPlayer.lIllllIIllIlll[7], ModelPlayer.lIllllIIllIlll[4], llllllllllllIllllIlIlIlIIIlIIlIl);
        if (lIIIIlIIIIllllIl(llllllllllllIllllIlIlIlIIIlIIlII ? 1 : 0)) {
            this.bipedLeftArm = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[5], ModelPlayer.lIllllIIllIlll[8]);
            this.bipedLeftArm.addBox(-1.0f, -2.0f, -2.0f, ModelPlayer.lIllllIIllIlll[9], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl);
            this.bipedLeftArm.setRotationPoint(5.0f, 2.5f, 0.0f);
            this.bipedRightArm = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[12], ModelPlayer.lIllllIIllIlll[7]);
            this.bipedRightArm.addBox(-2.0f, -2.0f, -2.0f, ModelPlayer.lIllllIIllIlll[9], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl);
            this.bipedRightArm.setRotationPoint(-5.0f, 2.5f, 0.0f);
            this.bipedLeftArmwear = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[8], ModelPlayer.lIllllIIllIlll[8]);
            this.bipedLeftArmwear.addBox(-1.0f, -2.0f, -2.0f, ModelPlayer.lIllllIIllIlll[9], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl + 0.25f);
            this.bipedLeftArmwear.setRotationPoint(5.0f, 2.5f, 0.0f);
            this.bipedRightArmwear = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[12], ModelPlayer.lIllllIIllIlll[5]);
            this.bipedRightArmwear.addBox(-2.0f, -2.0f, -2.0f, ModelPlayer.lIllllIIllIlll[9], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl + 0.25f);
            this.bipedRightArmwear.setRotationPoint(-5.0f, 2.5f, 10.0f);
            "".length();
            if (((0x58 ^ 0x10) & ~(0x7D ^ 0x35)) >= " ".length()) {
                throw null;
            }
        }
        else {
            this.bipedLeftArm = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[5], ModelPlayer.lIllllIIllIlll[8]);
            this.bipedLeftArm.addBox(-1.0f, -2.0f, -2.0f, ModelPlayer.lIllllIIllIlll[11], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl);
            this.bipedLeftArm.setRotationPoint(5.0f, 2.0f, 0.0f);
            this.bipedLeftArmwear = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[8], ModelPlayer.lIllllIIllIlll[8]);
            this.bipedLeftArmwear.addBox(-1.0f, -2.0f, -2.0f, ModelPlayer.lIllllIIllIlll[11], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl + 0.25f);
            this.bipedLeftArmwear.setRotationPoint(5.0f, 2.0f, 0.0f);
            this.bipedRightArmwear = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[12], ModelPlayer.lIllllIIllIlll[5]);
            this.bipedRightArmwear.addBox(-3.0f, -2.0f, -2.0f, ModelPlayer.lIllllIIllIlll[11], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl + 0.25f);
            this.bipedRightArmwear.setRotationPoint(-5.0f, 2.0f, 10.0f);
        }
        this.bipedLeftLeg = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[7], ModelPlayer.lIllllIIllIlll[8]);
        this.bipedLeftLeg.addBox(-2.0f, 0.0f, -2.0f, ModelPlayer.lIllllIIllIlll[11], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl);
        this.bipedLeftLeg.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.bipedLeftLegwear = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[2], ModelPlayer.lIllllIIllIlll[8]);
        this.bipedLeftLegwear.addBox(-2.0f, 0.0f, -2.0f, ModelPlayer.lIllllIIllIlll[11], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl + 0.25f);
        this.bipedLeftLegwear.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.bipedRightLegwear = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[2], ModelPlayer.lIllllIIllIlll[5]);
        this.bipedRightLegwear.addBox(-2.0f, 0.0f, -2.0f, ModelPlayer.lIllllIIllIlll[11], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl + 0.25f);
        this.bipedRightLegwear.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.bipedBodyWear = new ModelRenderer(this, ModelPlayer.lIllllIIllIlll[7], ModelPlayer.lIllllIIllIlll[5]);
        this.bipedBodyWear.addBox(-4.0f, 0.0f, -2.0f, ModelPlayer.lIllllIIllIlll[13], ModelPlayer.lIllllIIllIlll[10], ModelPlayer.lIllllIIllIlll[11], llllllllllllIllllIlIlIlIIIlIIlIl + 0.25f);
        this.bipedBodyWear.setRotationPoint(0.0f, 0.0f, 0.0f);
    }
    
    @Override
    public void render(final Entity llllllllllllIllllIlIlIlIIIIllIIl, final float llllllllllllIllllIlIlIlIIIIllIII, final float llllllllllllIllllIlIlIlIIIIlIlll, final float llllllllllllIllllIlIlIlIIIIlIllI, final float llllllllllllIllllIlIlIlIIIIlIlIl, final float llllllllllllIllllIlIlIlIIIIIlIll, final float llllllllllllIllllIlIlIlIIIIIlIlI) {
        super.render(llllllllllllIllllIlIlIlIIIIllIIl, llllllllllllIllllIlIlIlIIIIllIII, llllllllllllIllllIlIlIlIIIIlIlll, llllllllllllIllllIlIlIlIIIIlIllI, llllllllllllIllllIlIlIlIIIIlIlIl, llllllllllllIllllIlIlIlIIIIIlIll, llllllllllllIllllIlIlIlIIIIIlIlI);
        GlStateManager.pushMatrix();
        if (lIIIIlIIIIllllIl(this.isChild ? 1 : 0)) {
            final float llllllllllllIllllIlIlIlIIIIlIIlI = 2.0f;
            GlStateManager.scale(1.0f / llllllllllllIllllIlIlIlIIIIlIIlI, 1.0f / llllllllllllIllllIlIlIlIIIIlIIlI, 1.0f / llllllllllllIllllIlIlIlIIIIlIIlI);
            GlStateManager.translate(0.0f, 24.0f * llllllllllllIllllIlIlIlIIIIIlIlI, 0.0f);
            this.bipedLeftLegwear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
            this.bipedRightLegwear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
            this.bipedLeftArmwear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
            this.bipedRightArmwear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
            this.bipedBodyWear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            if (lIIIIlIIIIllllIl(llllllllllllIllllIlIlIlIIIIllIIl.isSneaking() ? 1 : 0)) {
                GlStateManager.translate(0.0f, 0.2f, 0.0f);
            }
            this.bipedLeftLegwear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
            this.bipedRightLegwear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
            this.bipedLeftArmwear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
            this.bipedRightArmwear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
            this.bipedBodyWear.render(llllllllllllIllllIlIlIlIIIIIlIlI);
        }
        GlStateManager.popMatrix();
    }
    
    private static void lIIIIlIIIIllllII() {
        (lIllllIIllIlll = new int[14])[0] = (41 + 17 + 13 + 157 ^ 158 + 128 - 168 + 46);
        ModelPlayer.lIllllIIllIlll[1] = (0x24 ^ 0x3C);
        ModelPlayer.lIllllIIllIlll[2] = ((0x9D ^ 0xC4 ^ (0xFE ^ 0x97)) & (0x2F ^ 0x5F ^ (0x44 ^ 0x4) ^ -" ".length()));
        ModelPlayer.lIllllIIllIlll[3] = (0xF6 ^ 0x8B ^ (0xDE ^ 0xA5));
        ModelPlayer.lIllllIIllIlll[4] = " ".length();
        ModelPlayer.lIllllIIllIlll[5] = (0xE2 ^ 0xC2);
        ModelPlayer.lIllllIIllIlll[6] = (2 + 121 - 27 + 38 ^ 94 + 8 + 29 + 9);
        ModelPlayer.lIllllIIllIlll[7] = (125 + 136 - 216 + 108 ^ 36 + 82 - 61 + 80);
        ModelPlayer.lIllllIIllIlll[8] = (0x37 ^ 0x2F ^ (0x26 ^ 0xE));
        ModelPlayer.lIllllIIllIlll[9] = "   ".length();
        ModelPlayer.lIllllIIllIlll[10] = (0x4A ^ 0x46);
        ModelPlayer.lIllllIIllIlll[11] = (0xA ^ 0xE);
        ModelPlayer.lIllllIIllIlll[12] = (0x9 ^ 0x21);
        ModelPlayer.lIllllIIllIlll[13] = ("   ".length() ^ (0xA5 ^ 0xAE));
    }
    
    public void renderRightArm() {
        this.bipedRightArm.render(0.0625f);
        this.bipedRightArmwear.render(0.0625f);
    }
}
