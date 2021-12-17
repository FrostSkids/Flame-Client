// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;

public class ModelArmorStand extends ModelArmorStandArmor
{
    public /* synthetic */ ModelRenderer standBase;
    public /* synthetic */ ModelRenderer standRightSide;
    public /* synthetic */ ModelRenderer standWaist;
    public /* synthetic */ ModelRenderer standLeftSide;
    private static final /* synthetic */ int[] llIlIIIlIIIllI;
    
    @Override
    public void postRenderArm(final float llllllllllllIllIllIlIIlIIIlIIlll) {
        final boolean llllllllllllIllIllIlIIlIIIlIIllI = this.bipedRightArm.showModel;
        this.bipedRightArm.showModel = (ModelArmorStand.llIlIIIlIIIllI[10] != 0);
        super.postRenderArm(llllllllllllIllIllIlIIlIIIlIIlll);
        this.bipedRightArm.showModel = llllllllllllIllIllIlIIlIIIlIIllI;
    }
    
    @Override
    public void render(final Entity llllllllllllIllIllIlIIlIIIllIIll, final float llllllllllllIllIllIlIIlIIIlllIll, final float llllllllllllIllIllIlIIlIIIllIIIl, final float llllllllllllIllIllIlIIlIIIllIIII, final float llllllllllllIllIllIlIIlIIIlIllll, final float llllllllllllIllIllIlIIlIIIlIlllI, final float llllllllllllIllIllIlIIlIIIllIllI) {
        super.render(llllllllllllIllIllIlIIlIIIllIIll, llllllllllllIllIllIlIIlIIIlllIll, llllllllllllIllIllIlIIlIIIllIIIl, llllllllllllIllIllIlIIlIIIllIIII, llllllllllllIllIllIlIIlIIIlIllll, llllllllllllIllIllIlIIlIIIlIlllI, llllllllllllIllIllIlIIlIIIllIllI);
        GlStateManager.pushMatrix();
        if (lIIlIIIllIlIlIlI(this.isChild ? 1 : 0)) {
            final float llllllllllllIllIllIlIIlIIIllIlIl = 2.0f;
            GlStateManager.scale(1.0f / llllllllllllIllIllIlIIlIIIllIlIl, 1.0f / llllllllllllIllIllIlIIlIIIllIlIl, 1.0f / llllllllllllIllIllIlIIlIIIllIlIl);
            GlStateManager.translate(0.0f, 24.0f * llllllllllllIllIllIlIIlIIIllIllI, 0.0f);
            this.standRightSide.render(llllllllllllIllIllIlIIlIIIllIllI);
            this.standLeftSide.render(llllllllllllIllIllIlIIlIIIllIllI);
            this.standWaist.render(llllllllllllIllIllIlIIlIIIllIllI);
            this.standBase.render(llllllllllllIllIllIlIIlIIIllIllI);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            if (lIIlIIIllIlIlIlI(llllllllllllIllIllIlIIlIIIllIIll.isSneaking() ? 1 : 0)) {
                GlStateManager.translate(0.0f, 0.2f, 0.0f);
            }
            this.standRightSide.render(llllllllllllIllIllIlIIlIIIllIllI);
            this.standLeftSide.render(llllllllllllIllIllIlIIlIIIllIllI);
            this.standWaist.render(llllllllllllIllIllIlIIlIIIllIllI);
            this.standBase.render(llllllllllllIllIllIlIIlIIIllIllI);
        }
        GlStateManager.popMatrix();
    }
    
    public ModelArmorStand() {
        this(0.0f);
    }
    
    public ModelArmorStand(final float llllllllllllIllIllIlIIlIIllIllIl) {
        super(llllllllllllIllIllIlIIlIIllIllIl, ModelArmorStand.llIlIIIlIIIllI[0], ModelArmorStand.llIlIIIlIIIllI[0]);
        this.bipedHead = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[1], ModelArmorStand.llIlIIIlIIIllI[1]);
        this.bipedHead.addBox(-1.0f, -7.0f, -1.0f, ModelArmorStand.llIlIIIlIIIllI[2], ModelArmorStand.llIlIIIlIIIllI[3], ModelArmorStand.llIlIIIlIIIllI[2], llllllllllllIllIllIlIIlIIllIllIl);
        this.bipedHead.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedBody = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[1], ModelArmorStand.llIlIIIlIIIllI[4]);
        this.bipedBody.addBox(-6.0f, 0.0f, -1.5f, ModelArmorStand.llIlIIIlIIIllI[5], ModelArmorStand.llIlIIIlIIIllI[6], ModelArmorStand.llIlIIIlIIIllI[6], llllllllllllIllIllIlIIlIIllIllIl);
        this.bipedBody.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bipedRightArm = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[7], ModelArmorStand.llIlIIIlIIIllI[1]);
        this.bipedRightArm.addBox(-2.0f, -2.0f, -1.0f, ModelArmorStand.llIlIIIlIIIllI[2], ModelArmorStand.llIlIIIlIIIllI[5], ModelArmorStand.llIlIIIlIIIllI[2], llllllllllllIllIllIlIIlIIllIllIl);
        this.bipedRightArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
        this.bipedLeftArm = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[8], ModelArmorStand.llIlIIIlIIIllI[9]);
        this.bipedLeftArm.mirror = (ModelArmorStand.llIlIIIlIIIllI[10] != 0);
        this.bipedLeftArm.addBox(0.0f, -2.0f, -1.0f, ModelArmorStand.llIlIIIlIIIllI[2], ModelArmorStand.llIlIIIlIIIllI[5], ModelArmorStand.llIlIIIlIIIllI[2], llllllllllllIllIllIlIIlIIllIllIl);
        this.bipedLeftArm.setRotationPoint(5.0f, 2.0f, 0.0f);
        this.bipedRightLeg = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[11], ModelArmorStand.llIlIIIlIIIllI[1]);
        this.bipedRightLeg.addBox(-1.0f, 0.0f, -1.0f, ModelArmorStand.llIlIIIlIIIllI[2], ModelArmorStand.llIlIIIlIIIllI[12], ModelArmorStand.llIlIIIlIIIllI[2], llllllllllllIllIllIlIIlIIllIllIl);
        this.bipedRightLeg.setRotationPoint(-1.9f, 12.0f, 0.0f);
        this.bipedLeftLeg = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[13], ModelArmorStand.llIlIIIlIIIllI[9]);
        this.bipedLeftLeg.mirror = (ModelArmorStand.llIlIIIlIIIllI[10] != 0);
        this.bipedLeftLeg.addBox(-1.0f, 0.0f, -1.0f, ModelArmorStand.llIlIIIlIIIllI[2], ModelArmorStand.llIlIIIlIIIllI[12], ModelArmorStand.llIlIIIlIIIllI[2], llllllllllllIllIllIlIIlIIllIllIl);
        this.bipedLeftLeg.setRotationPoint(1.9f, 12.0f, 0.0f);
        this.standRightSide = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[9], ModelArmorStand.llIlIIIlIIIllI[1]);
        this.standRightSide.addBox(-3.0f, 3.0f, -1.0f, ModelArmorStand.llIlIIIlIIIllI[2], ModelArmorStand.llIlIIIlIIIllI[3], ModelArmorStand.llIlIIIlIIIllI[2], llllllllllllIllIllIlIIlIIllIllIl);
        this.standRightSide.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.standRightSide.showModel = (ModelArmorStand.llIlIIIlIIIllI[10] != 0);
        this.standLeftSide = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[14], ModelArmorStand.llIlIIIlIIIllI[9]);
        this.standLeftSide.addBox(1.0f, 3.0f, -1.0f, ModelArmorStand.llIlIIIlIIIllI[2], ModelArmorStand.llIlIIIlIIIllI[3], ModelArmorStand.llIlIIIlIIIllI[2], llllllllllllIllIllIlIIlIIllIllIl);
        this.standLeftSide.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.standWaist = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[1], ModelArmorStand.llIlIIIlIIIllI[14]);
        this.standWaist.addBox(-4.0f, 10.0f, -1.0f, ModelArmorStand.llIlIIIlIIIllI[11], ModelArmorStand.llIlIIIlIIIllI[2], ModelArmorStand.llIlIIIlIIIllI[2], llllllllllllIllIllIlIIlIIllIllIl);
        this.standWaist.setRotationPoint(0.0f, 0.0f, 0.0f);
        this.standBase = new ModelRenderer(this, ModelArmorStand.llIlIIIlIIIllI[1], ModelArmorStand.llIlIIIlIIIllI[8]);
        this.standBase.addBox(-6.0f, 11.0f, -6.0f, ModelArmorStand.llIlIIIlIIIllI[5], ModelArmorStand.llIlIIIlIIIllI[10], ModelArmorStand.llIlIIIlIIIllI[5], llllllllllllIllIllIlIIlIIllIllIl);
        this.standBase.setRotationPoint(0.0f, 12.0f, 0.0f);
    }
    
    private static boolean lIIlIIIllIlIlIlI(final int llllllllllllIllIllIlIIlIIIlIIIIl) {
        return llllllllllllIllIllIlIIlIIIlIIIIl != 0;
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIllIllIlIIlIIlIlIIIl, final float llllllllllllIllIllIlIIlIIlIlIIII, final float llllllllllllIllIllIlIIlIIlIIllll, final float llllllllllllIllIllIlIIlIIlIIlllI, final float llllllllllllIllIllIlIIlIIlIllIIl, final float llllllllllllIllIllIlIIlIIlIllIII, final Entity llllllllllllIllIllIlIIlIIlIlIlll) {
        super.setRotationAngles(llllllllllllIllIllIlIIlIIlIlIIIl, llllllllllllIllIllIlIIlIIlIlIIII, llllllllllllIllIllIlIIlIIlIIllll, llllllllllllIllIllIlIIlIIlIIlllI, llllllllllllIllIllIlIIlIIlIllIIl, llllllllllllIllIllIlIIlIIlIllIII, llllllllllllIllIllIlIIlIIlIlIlll);
        if (lIIlIIIllIlIlIlI((llllllllllllIllIllIlIIlIIlIlIlll instanceof EntityArmorStand) ? 1 : 0)) {
            final EntityArmorStand llllllllllllIllIllIlIIlIIlIlIllI = (EntityArmorStand)llllllllllllIllIllIlIIlIIlIlIlll;
            this.bipedLeftArm.showModel = llllllllllllIllIllIlIIlIIlIlIllI.getShowArms();
            this.bipedRightArm.showModel = llllllllllllIllIllIlIIlIIlIlIllI.getShowArms();
            final ModelRenderer standBase = this.standBase;
            int showModel;
            if (lIIlIIIllIlIlIlI(llllllllllllIllIllIlIIlIIlIlIllI.hasNoBasePlate() ? 1 : 0)) {
                showModel = ModelArmorStand.llIlIIIlIIIllI[1];
                "".length();
                if ("  ".length() == ((0x2B ^ 0x7F) & ~(0xDB ^ 0x8F))) {
                    return;
                }
            }
            else {
                showModel = ModelArmorStand.llIlIIIlIIIllI[10];
            }
            standBase.showModel = (showModel != 0);
            this.bipedLeftLeg.setRotationPoint(1.9f, 12.0f, 0.0f);
            this.bipedRightLeg.setRotationPoint(-1.9f, 12.0f, 0.0f);
            this.standRightSide.rotateAngleX = 0.017453292f * llllllllllllIllIllIlIIlIIlIlIllI.getBodyRotation().getX();
            this.standRightSide.rotateAngleY = 0.017453292f * llllllllllllIllIllIlIIlIIlIlIllI.getBodyRotation().getY();
            this.standRightSide.rotateAngleZ = 0.017453292f * llllllllllllIllIllIlIIlIIlIlIllI.getBodyRotation().getZ();
            this.standLeftSide.rotateAngleX = 0.017453292f * llllllllllllIllIllIlIIlIIlIlIllI.getBodyRotation().getX();
            this.standLeftSide.rotateAngleY = 0.017453292f * llllllllllllIllIllIlIIlIIlIlIllI.getBodyRotation().getY();
            this.standLeftSide.rotateAngleZ = 0.017453292f * llllllllllllIllIllIlIIlIIlIlIllI.getBodyRotation().getZ();
            this.standWaist.rotateAngleX = 0.017453292f * llllllllllllIllIllIlIIlIIlIlIllI.getBodyRotation().getX();
            this.standWaist.rotateAngleY = 0.017453292f * llllllllllllIllIllIlIIlIIlIlIllI.getBodyRotation().getY();
            this.standWaist.rotateAngleZ = 0.017453292f * llllllllllllIllIllIlIIlIIlIlIllI.getBodyRotation().getZ();
            final float llllllllllllIllIllIlIIlIIlIlIlIl = (llllllllllllIllIllIlIIlIIlIlIllI.getLeftLegRotation().getX() + llllllllllllIllIllIlIIlIIlIlIllI.getRightLegRotation().getX()) / 2.0f;
            final float llllllllllllIllIllIlIIlIIlIlIlII = (llllllllllllIllIllIlIIlIIlIlIllI.getLeftLegRotation().getY() + llllllllllllIllIllIlIIlIIlIlIllI.getRightLegRotation().getY()) / 2.0f;
            final float llllllllllllIllIllIlIIlIIlIlIIll = (llllllllllllIllIllIlIIlIIlIlIllI.getLeftLegRotation().getZ() + llllllllllllIllIllIlIIlIIlIlIllI.getRightLegRotation().getZ()) / 2.0f;
            this.standBase.rotateAngleX = 0.0f;
            this.standBase.rotateAngleY = 0.017453292f * -llllllllllllIllIllIlIIlIIlIlIlll.rotationYaw;
            this.standBase.rotateAngleZ = 0.0f;
        }
    }
    
    private static void lIIlIIIllIlIlIIl() {
        (llIlIIIlIIIllI = new int[15])[0] = (0x2E ^ 0x4F ^ (0x43 ^ 0x62));
        ModelArmorStand.llIlIIIlIIIllI[1] = ((0x73 ^ 0x58) & ~(0x5 ^ 0x2E));
        ModelArmorStand.llIlIIIlIIIllI[2] = "  ".length();
        ModelArmorStand.llIlIIIlIIIllI[3] = (0x6A ^ 0x6D);
        ModelArmorStand.llIlIIIlIIIllI[4] = (0xBE ^ 0xA4);
        ModelArmorStand.llIlIIIlIIIllI[5] = (0x9C ^ 0x90);
        ModelArmorStand.llIlIIIlIIIllI[6] = "   ".length();
        ModelArmorStand.llIlIIIlIIIllI[7] = (0xCF ^ 0xA6 ^ (0xB6 ^ 0xC7));
        ModelArmorStand.llIlIIIlIIIllI[8] = (0xD3 ^ 0xC5 ^ (0x5F ^ 0x69));
        ModelArmorStand.llIlIIIlIIIllI[9] = (9 + 1 + 19 + 98 ^ (0x57 ^ 0x38));
        ModelArmorStand.llIlIIIlIIIllI[10] = " ".length();
        ModelArmorStand.llIlIIIlIIIllI[11] = (0x90 ^ 0x98);
        ModelArmorStand.llIlIIIlIIIllI[12] = (14 + 54 + 70 + 33 ^ 140 + 4 - 14 + 30);
        ModelArmorStand.llIlIIIlIIIllI[13] = (108 + 34 - 39 + 60 ^ 45 + 13 - 52 + 133);
        ModelArmorStand.llIlIIIlIIIllI[14] = (0x11 ^ 0x21);
    }
    
    static {
        lIIlIIIllIlIlIIl();
    }
}
