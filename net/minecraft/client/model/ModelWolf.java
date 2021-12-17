// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelWolf extends ModelBase
{
    public /* synthetic */ ModelRenderer wolfBody;
    /* synthetic */ ModelRenderer wolfMane;
    public /* synthetic */ ModelRenderer wolfHeadMain;
    public /* synthetic */ ModelRenderer wolfLeg1;
    public /* synthetic */ ModelRenderer wolfLeg3;
    public /* synthetic */ ModelRenderer wolfLeg4;
    public /* synthetic */ ModelRenderer wolfLeg2;
    private static final /* synthetic */ int[] llIlllIlllIlll;
    /* synthetic */ ModelRenderer wolfTail;
    
    private static void lIIllIlIIIlIllIl() {
        (llIlllIlllIlll = new int[14])[0] = ((0x68 ^ 0x64 ^ (0x7D ^ 0x5A)) & (0x5B ^ 0x63 ^ (0x4A ^ 0x59) ^ -" ".length()));
        ModelWolf.llIlllIlllIlll[1] = (126 + 75 - 141 + 87 ^ 3 + 102 - 56 + 100);
        ModelWolf.llIlllIlllIlll[2] = (0x3F ^ 0x3B);
        ModelWolf.llIlllIlllIlll[3] = (0x49 ^ 0x52 ^ (0xB ^ 0x2));
        ModelWolf.llIlllIlllIlll[4] = (0x76 ^ 0x78);
        ModelWolf.llIlllIlllIlll[5] = (0xCF ^ 0xC6);
        ModelWolf.llIlllIlllIlll[6] = (0x29 ^ 0x3C);
        ModelWolf.llIlllIlllIlll[7] = (40 + 192 - 86 + 57 ^ 128 + 145 - 244 + 166);
        ModelWolf.llIlllIlllIlll[8] = (0x25 ^ 0x65 ^ (0xD9 ^ 0x9E));
        ModelWolf.llIlllIlllIlll[9] = "  ".length();
        ModelWolf.llIlllIlllIlll[10] = (13 + 82 - 25 + 143 ^ 54 + 74 - 55 + 124);
        ModelWolf.llIlllIlllIlll[11] = " ".length();
        ModelWolf.llIlllIlllIlll[12] = (0x93 ^ 0x99);
        ModelWolf.llIlllIlllIlll[13] = "   ".length();
    }
    
    @Override
    public void render(final Entity llllllllllllIllIIlIIIIlIlIIlIlll, final float llllllllllllIllIIlIIIIlIlIIIllIl, final float llllllllllllIllIIlIIIIlIlIIlIlIl, final float llllllllllllIllIIlIIIIlIlIIlIlII, final float llllllllllllIllIIlIIIIlIlIIlIIll, final float llllllllllllIllIIlIIIIlIlIIlIIlI, final float llllllllllllIllIIlIIIIlIlIIIlIII) {
        super.render(llllllllllllIllIIlIIIIlIlIIlIlll, llllllllllllIllIIlIIIIlIlIIIllIl, llllllllllllIllIIlIIIIlIlIIlIlIl, llllllllllllIllIIlIIIIlIlIIlIlII, llllllllllllIllIIlIIIIlIlIIlIIll, llllllllllllIllIIlIIIIlIlIIlIIlI, llllllllllllIllIIlIIIIlIlIIIlIII);
        this.setRotationAngles(llllllllllllIllIIlIIIIlIlIIIllIl, llllllllllllIllIIlIIIIlIlIIlIlIl, llllllllllllIllIIlIIIIlIlIIlIlII, llllllllllllIllIIlIIIIlIlIIlIIll, llllllllllllIllIIlIIIIlIlIIlIIlI, llllllllllllIllIIlIIIIlIlIIIlIII, llllllllllllIllIIlIIIIlIlIIlIlll);
        if (lIIllIlIIIlIlllI(this.isChild ? 1 : 0)) {
            final float llllllllllllIllIIlIIIIlIlIIlIIII = 2.0f;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, 5.0f * llllllllllllIllIIlIIIIlIlIIIlIII, 2.0f * llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfHeadMain.renderWithRotation(llllllllllllIllIIlIIIIlIlIIIlIII);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.0f / llllllllllllIllIIlIIIIlIlIIlIIII, 1.0f / llllllllllllIllIIlIIIIlIlIIlIIII, 1.0f / llllllllllllIllIIlIIIIlIlIIlIIII);
            GlStateManager.translate(0.0f, 24.0f * llllllllllllIllIIlIIIIlIlIIIlIII, 0.0f);
            this.wolfBody.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfLeg1.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfLeg2.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfLeg3.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfLeg4.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfTail.renderWithRotation(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfMane.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            GlStateManager.popMatrix();
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else {
            this.wolfHeadMain.renderWithRotation(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfBody.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfLeg1.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfLeg2.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfLeg3.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfLeg4.render(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfTail.renderWithRotation(llllllllllllIllIIlIIIIlIlIIIlIII);
            this.wolfMane.render(llllllllllllIllIIlIIIIlIlIIIlIII);
        }
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIllIIlIIIIlIIllIIIll, final float llllllllllllIllIIlIIIIlIIllIIIlI, final float llllllllllllIllIIlIIIIlIIllIlIIl, final float llllllllllllIllIIlIIIIlIIllIIIII, final float llllllllllllIllIIlIIIIlIIllIIlll, final float llllllllllllIllIIlIIIIlIIlIllllI, final Entity llllllllllllIllIIlIIIIlIIllIIlIl) {
        super.setRotationAngles(llllllllllllIllIIlIIIIlIIllIIIll, llllllllllllIllIIlIIIIlIIllIIIlI, llllllllllllIllIIlIIIIlIIllIlIIl, llllllllllllIllIIlIIIIlIIllIIIII, llllllllllllIllIIlIIIIlIIllIIlll, llllllllllllIllIIlIIIIlIIlIllllI, llllllllllllIllIIlIIIIlIIllIIlIl);
        this.wolfHeadMain.rotateAngleX = llllllllllllIllIIlIIIIlIIllIIlll / 57.295776f;
        this.wolfHeadMain.rotateAngleY = llllllllllllIllIIlIIIIlIIllIIIII / 57.295776f;
        this.wolfTail.rotateAngleX = llllllllllllIllIIlIIIIlIIllIlIIl;
    }
    
    public ModelWolf() {
        final float llllllllllllIllIIlIIIIlIlIlIIllI = 0.0f;
        final float llllllllllllIllIIlIIIIlIlIlIIlIl = 13.5f;
        this.wolfHeadMain = new ModelRenderer(this, ModelWolf.llIlllIlllIlll[0], ModelWolf.llIlllIlllIlll[0]);
        this.wolfHeadMain.addBox(-3.0f, -3.0f, -2.0f, ModelWolf.llIlllIlllIlll[1], ModelWolf.llIlllIlllIlll[1], ModelWolf.llIlllIlllIlll[2], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfHeadMain.setRotationPoint(-1.0f, llllllllllllIllIIlIIIIlIlIlIIlIl, -7.0f);
        this.wolfBody = new ModelRenderer(this, ModelWolf.llIlllIlllIlll[3], ModelWolf.llIlllIlllIlll[4]);
        this.wolfBody.addBox(-4.0f, -2.0f, -3.0f, ModelWolf.llIlllIlllIlll[1], ModelWolf.llIlllIlllIlll[5], ModelWolf.llIlllIlllIlll[1], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfBody.setRotationPoint(0.0f, 14.0f, 2.0f);
        this.wolfMane = new ModelRenderer(this, ModelWolf.llIlllIlllIlll[6], ModelWolf.llIlllIlllIlll[0]);
        this.wolfMane.addBox(-4.0f, -3.0f, -3.0f, ModelWolf.llIlllIlllIlll[7], ModelWolf.llIlllIlllIlll[1], ModelWolf.llIlllIlllIlll[8], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfMane.setRotationPoint(-1.0f, 14.0f, 2.0f);
        this.wolfLeg1 = new ModelRenderer(this, ModelWolf.llIlllIlllIlll[0], ModelWolf.llIlllIlllIlll[3]);
        this.wolfLeg1.addBox(-1.0f, 0.0f, -1.0f, ModelWolf.llIlllIlllIlll[9], ModelWolf.llIlllIlllIlll[7], ModelWolf.llIlllIlllIlll[9], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfLeg1.setRotationPoint(-2.5f, 16.0f, 7.0f);
        this.wolfLeg2 = new ModelRenderer(this, ModelWolf.llIlllIlllIlll[0], ModelWolf.llIlllIlllIlll[3]);
        this.wolfLeg2.addBox(-1.0f, 0.0f, -1.0f, ModelWolf.llIlllIlllIlll[9], ModelWolf.llIlllIlllIlll[7], ModelWolf.llIlllIlllIlll[9], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfLeg2.setRotationPoint(0.5f, 16.0f, 7.0f);
        this.wolfLeg3 = new ModelRenderer(this, ModelWolf.llIlllIlllIlll[0], ModelWolf.llIlllIlllIlll[3]);
        this.wolfLeg3.addBox(-1.0f, 0.0f, -1.0f, ModelWolf.llIlllIlllIlll[9], ModelWolf.llIlllIlllIlll[7], ModelWolf.llIlllIlllIlll[9], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfLeg3.setRotationPoint(-2.5f, 16.0f, -4.0f);
        this.wolfLeg4 = new ModelRenderer(this, ModelWolf.llIlllIlllIlll[0], ModelWolf.llIlllIlllIlll[3]);
        this.wolfLeg4.addBox(-1.0f, 0.0f, -1.0f, ModelWolf.llIlllIlllIlll[9], ModelWolf.llIlllIlllIlll[7], ModelWolf.llIlllIlllIlll[9], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfLeg4.setRotationPoint(0.5f, 16.0f, -4.0f);
        this.wolfTail = new ModelRenderer(this, ModelWolf.llIlllIlllIlll[5], ModelWolf.llIlllIlllIlll[3]);
        this.wolfTail.addBox(-1.0f, 0.0f, -1.0f, ModelWolf.llIlllIlllIlll[9], ModelWolf.llIlllIlllIlll[7], ModelWolf.llIlllIlllIlll[9], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfTail.setRotationPoint(-1.0f, 12.0f, 8.0f);
        this.wolfHeadMain.setTextureOffset(ModelWolf.llIlllIlllIlll[10], ModelWolf.llIlllIlllIlll[4]).addBox(-3.0f, -5.0f, 0.0f, ModelWolf.llIlllIlllIlll[9], ModelWolf.llIlllIlllIlll[9], ModelWolf.llIlllIlllIlll[11], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfHeadMain.setTextureOffset(ModelWolf.llIlllIlllIlll[10], ModelWolf.llIlllIlllIlll[4]).addBox(1.0f, -5.0f, 0.0f, ModelWolf.llIlllIlllIlll[9], ModelWolf.llIlllIlllIlll[9], ModelWolf.llIlllIlllIlll[11], llllllllllllIllIIlIIIIlIlIlIIllI);
        this.wolfHeadMain.setTextureOffset(ModelWolf.llIlllIlllIlll[0], ModelWolf.llIlllIlllIlll[12]).addBox(-1.5f, 0.0f, -5.0f, ModelWolf.llIlllIlllIlll[13], ModelWolf.llIlllIlllIlll[13], ModelWolf.llIlllIlllIlll[2], llllllllllllIllIIlIIIIlIlIlIIllI);
    }
    
    static {
        lIIllIlIIIlIllIl();
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase llllllllllllIllIIlIIIIlIIlllllll, final float llllllllllllIllIIlIIIIlIIllllllI, final float llllllllllllIllIIlIIIIlIIlllIlll, final float llllllllllllIllIIlIIIIlIIlllllII) {
        final EntityWolf llllllllllllIllIIlIIIIlIIllllIll = (EntityWolf)llllllllllllIllIIlIIIIlIIlllllll;
        if (lIIllIlIIIlIlllI(llllllllllllIllIIlIIIIlIIllllIll.isAngry() ? 1 : 0)) {
            this.wolfTail.rotateAngleY = 0.0f;
            "".length();
            if ("   ".length() == ((0xF0 ^ 0x91 ^ (0xDF ^ 0x8C)) & (70 + 66 - 100 + 133 ^ 76 + 20 - 78 + 137 ^ -" ".length()))) {
                return;
            }
        }
        else {
            this.wolfTail.rotateAngleY = MathHelper.cos(llllllllllllIllIIlIIIIlIIllllllI * 0.6662f) * 1.4f * llllllllllllIllIIlIIIIlIIlllIlll;
        }
        if (lIIllIlIIIlIlllI(llllllllllllIllIIlIIIIlIIllllIll.isSitting() ? 1 : 0)) {
            this.wolfMane.setRotationPoint(-1.0f, 16.0f, -3.0f);
            this.wolfMane.rotateAngleX = 1.2566371f;
            this.wolfMane.rotateAngleY = 0.0f;
            this.wolfBody.setRotationPoint(0.0f, 18.0f, 0.0f);
            this.wolfBody.rotateAngleX = 0.7853982f;
            this.wolfTail.setRotationPoint(-1.0f, 21.0f, 6.0f);
            this.wolfLeg1.setRotationPoint(-2.5f, 22.0f, 2.0f);
            this.wolfLeg1.rotateAngleX = 4.712389f;
            this.wolfLeg2.setRotationPoint(0.5f, 22.0f, 2.0f);
            this.wolfLeg2.rotateAngleX = 4.712389f;
            this.wolfLeg3.rotateAngleX = 5.811947f;
            this.wolfLeg3.setRotationPoint(-2.49f, 17.0f, -4.0f);
            this.wolfLeg4.rotateAngleX = 5.811947f;
            this.wolfLeg4.setRotationPoint(0.51f, 17.0f, -4.0f);
            "".length();
            if (((0x76 ^ 0x7D) & ~(0xA8 ^ 0xA3)) != 0x0) {
                return;
            }
        }
        else {
            this.wolfBody.setRotationPoint(0.0f, 14.0f, 2.0f);
            this.wolfBody.rotateAngleX = 1.5707964f;
            this.wolfMane.setRotationPoint(-1.0f, 14.0f, -3.0f);
            this.wolfMane.rotateAngleX = this.wolfBody.rotateAngleX;
            this.wolfTail.setRotationPoint(-1.0f, 12.0f, 8.0f);
            this.wolfLeg1.setRotationPoint(-2.5f, 16.0f, 7.0f);
            this.wolfLeg2.setRotationPoint(0.5f, 16.0f, 7.0f);
            this.wolfLeg3.setRotationPoint(-2.5f, 16.0f, -4.0f);
            this.wolfLeg4.setRotationPoint(0.5f, 16.0f, -4.0f);
            this.wolfLeg1.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIIlIIllllllI * 0.6662f) * 1.4f * llllllllllllIllIIlIIIIlIIlllIlll;
            this.wolfLeg2.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIIlIIllllllI * 0.6662f + 3.1415927f) * 1.4f * llllllllllllIllIIlIIIIlIIlllIlll;
            this.wolfLeg3.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIIlIIllllllI * 0.6662f + 3.1415927f) * 1.4f * llllllllllllIllIIlIIIIlIIlllIlll;
            this.wolfLeg4.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIIlIIllllllI * 0.6662f) * 1.4f * llllllllllllIllIIlIIIIlIIlllIlll;
        }
        this.wolfHeadMain.rotateAngleZ = llllllllllllIllIIlIIIIlIIllllIll.getInterestedAngle(llllllllllllIllIIlIIIIlIIlllllII) + llllllllllllIllIIlIIIIlIIllllIll.getShakeAngle(llllllllllllIllIIlIIIIlIIlllllII, 0.0f);
        this.wolfMane.rotateAngleZ = llllllllllllIllIIlIIIIlIIllllIll.getShakeAngle(llllllllllllIllIIlIIIIlIIlllllII, -0.08f);
        this.wolfBody.rotateAngleZ = llllllllllllIllIIlIIIIlIIllllIll.getShakeAngle(llllllllllllIllIIlIIIIlIIlllllII, -0.16f);
        this.wolfTail.rotateAngleZ = llllllllllllIllIIlIIIIlIIllllIll.getShakeAngle(llllllllllllIllIIlIIIIlIIlllllII, -0.2f);
    }
    
    private static boolean lIIllIlIIIlIlllI(final int llllllllllllIllIIlIIIIlIIlIllIll) {
        return llllllllllllIllIIlIIIIlIIlIllIll != 0;
    }
}
