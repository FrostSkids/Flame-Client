// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;

public class ModelEnderman extends ModelBiped
{
    public /* synthetic */ boolean isAttacking;
    private static final /* synthetic */ int[] lIIIIlIIIlllII;
    public /* synthetic */ boolean isCarrying;
    
    private static void lIlllIIIIIlllII() {
        (lIIIIlIIIlllII = new int[11])[0] = (0x70 ^ 0x8 ^ (0x4C ^ 0x74));
        ModelEnderman.lIIIIlIIIlllII[1] = (0x87 ^ 0xA7);
        ModelEnderman.lIIIIlIIIlllII[2] = ((0x9B ^ 0xC2) & ~(0xF9 ^ 0xA0));
        ModelEnderman.lIIIIlIIIlllII[3] = (134 + 120 - 139 + 45 ^ 54 + 69 - 118 + 171);
        ModelEnderman.lIIIIlIIIlllII[4] = (0x7 ^ 0xF);
        ModelEnderman.lIIIIlIIIlllII[5] = (0xA2 ^ 0xAE);
        ModelEnderman.lIIIIlIIIlllII[6] = (117 + 5 - 7 + 13 ^ 29 + 105 - 42 + 40);
        ModelEnderman.lIIIIlIIIlllII[7] = (0xB1 ^ 0x89);
        ModelEnderman.lIIIIlIIIlllII[8] = "  ".length();
        ModelEnderman.lIIIIlIIIlllII[9] = (0x25 ^ 0x12 ^ (0x0 ^ 0x29));
        ModelEnderman.lIIIIlIIIlllII[10] = " ".length();
    }
    
    public ModelEnderman(final float lllllllllllllIlIIllIIlllllllllIl) {
        super(0.0f, -14.0f, ModelEnderman.lIIIIlIIIlllII[0], ModelEnderman.lIIIIlIIIlllII[1]);
        final float lllllllllllllIlIIllIIlllllllllll = -14.0f;
        this.bipedHeadwear = new ModelRenderer(this, ModelEnderman.lIIIIlIIIlllII[2], ModelEnderman.lIIIIlIIIlllII[3]);
        this.bipedHeadwear.addBox(-4.0f, -8.0f, -4.0f, ModelEnderman.lIIIIlIIIlllII[4], ModelEnderman.lIIIIlIIIlllII[4], ModelEnderman.lIIIIlIIIlllII[4], lllllllllllllIlIIllIIlllllllllIl - 0.5f);
        this.bipedHeadwear.setRotationPoint(0.0f, 0.0f + lllllllllllllIlIIllIIlllllllllll, 0.0f);
        this.bipedBody = new ModelRenderer(this, ModelEnderman.lIIIIlIIIlllII[1], ModelEnderman.lIIIIlIIIlllII[3]);
        this.bipedBody.addBox(-4.0f, 0.0f, -2.0f, ModelEnderman.lIIIIlIIIlllII[4], ModelEnderman.lIIIIlIIIlllII[5], ModelEnderman.lIIIIlIIIlllII[6], lllllllllllllIlIIllIIlllllllllIl);
        this.bipedBody.setRotationPoint(0.0f, 0.0f + lllllllllllllIlIIllIIlllllllllll, 0.0f);
        this.bipedRightArm = new ModelRenderer(this, ModelEnderman.lIIIIlIIIlllII[7], ModelEnderman.lIIIIlIIIlllII[2]);
        this.bipedRightArm.addBox(-1.0f, -2.0f, -1.0f, ModelEnderman.lIIIIlIIIlllII[8], ModelEnderman.lIIIIlIIIlllII[9], ModelEnderman.lIIIIlIIIlllII[8], lllllllllllllIlIIllIIlllllllllIl);
        this.bipedRightArm.setRotationPoint(-3.0f, 2.0f + lllllllllllllIlIIllIIlllllllllll, 0.0f);
        this.bipedLeftArm = new ModelRenderer(this, ModelEnderman.lIIIIlIIIlllII[7], ModelEnderman.lIIIIlIIIlllII[2]);
        this.bipedLeftArm.mirror = (ModelEnderman.lIIIIlIIIlllII[10] != 0);
        this.bipedLeftArm.addBox(-1.0f, -2.0f, -1.0f, ModelEnderman.lIIIIlIIIlllII[8], ModelEnderman.lIIIIlIIIlllII[9], ModelEnderman.lIIIIlIIIlllII[8], lllllllllllllIlIIllIIlllllllllIl);
        this.bipedLeftArm.setRotationPoint(5.0f, 2.0f + lllllllllllllIlIIllIIlllllllllll, 0.0f);
        this.bipedRightLeg = new ModelRenderer(this, ModelEnderman.lIIIIlIIIlllII[7], ModelEnderman.lIIIIlIIIlllII[2]);
        this.bipedRightLeg.addBox(-1.0f, 0.0f, -1.0f, ModelEnderman.lIIIIlIIIlllII[8], ModelEnderman.lIIIIlIIIlllII[9], ModelEnderman.lIIIIlIIIlllII[8], lllllllllllllIlIIllIIlllllllllIl);
        this.bipedRightLeg.setRotationPoint(-2.0f, 12.0f + lllllllllllllIlIIllIIlllllllllll, 0.0f);
        this.bipedLeftLeg = new ModelRenderer(this, ModelEnderman.lIIIIlIIIlllII[7], ModelEnderman.lIIIIlIIIlllII[2]);
        this.bipedLeftLeg.mirror = (ModelEnderman.lIIIIlIIIlllII[10] != 0);
        this.bipedLeftLeg.addBox(-1.0f, 0.0f, -1.0f, ModelEnderman.lIIIIlIIIlllII[8], ModelEnderman.lIIIIlIIIlllII[9], ModelEnderman.lIIIIlIIIlllII[8], lllllllllllllIlIIllIIlllllllllIl);
        this.bipedLeftLeg.setRotationPoint(2.0f, 12.0f + lllllllllllllIlIIllIIlllllllllll, 0.0f);
    }
    
    private static boolean lIlllIIIIIlllll(final int lllllllllllllIlIIllIIlllllIlIlIl) {
        return lllllllllllllIlIIllIIlllllIlIlIl > 0;
    }
    
    private static int lIlllIIIIIllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    static {
        lIlllIIIIIlllII();
    }
    
    private static int lIlllIIIIIlllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlllIIIIlIIIIl(final int lllllllllllllIlIIllIIlllllIllIIl) {
        return lllllllllllllIlIIllIIlllllIllIIl != 0;
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIlIIllIIllllllIIlII, final float lllllllllllllIlIIllIIllllllIlllI, final float lllllllllllllIlIIllIIllllllIIIlI, final float lllllllllllllIlIIllIIllllllIIIIl, final float lllllllllllllIlIIllIIllllllIlIll, final float lllllllllllllIlIIllIIlllllIlllll, final Entity lllllllllllllIlIIllIIllllllIlIIl) {
        super.setRotationAngles(lllllllllllllIlIIllIIllllllIIlII, lllllllllllllIlIIllIIllllllIlllI, lllllllllllllIlIIllIIllllllIIIlI, lllllllllllllIlIIllIIllllllIIIIl, lllllllllllllIlIIllIIllllllIlIll, lllllllllllllIlIIllIIlllllIlllll, lllllllllllllIlIIllIIllllllIlIIl);
        this.bipedHead.showModel = (ModelEnderman.lIIIIlIIIlllII[10] != 0);
        final float lllllllllllllIlIIllIIllllllIlIII = -14.0f;
        this.bipedBody.rotateAngleX = 0.0f;
        this.bipedBody.rotationPointY = lllllllllllllIlIIllIIllllllIlIII;
        this.bipedBody.rotationPointZ = -0.0f;
        final ModelRenderer bipedRightLeg = this.bipedRightLeg;
        bipedRightLeg.rotateAngleX -= 0.0f;
        final ModelRenderer bipedLeftLeg = this.bipedLeftLeg;
        bipedLeftLeg.rotateAngleX -= 0.0f;
        this.bipedRightArm.rotateAngleX *= 0.5;
        this.bipedLeftArm.rotateAngleX *= 0.5;
        this.bipedRightLeg.rotateAngleX *= 0.5;
        this.bipedLeftLeg.rotateAngleX *= 0.5;
        final float lllllllllllllIlIIllIIllllllIIlll = 0.4f;
        if (lIlllIIIIIlllll(lIlllIIIIIlllIl(this.bipedRightArm.rotateAngleX, lllllllllllllIlIIllIIllllllIIlll))) {
            this.bipedRightArm.rotateAngleX = lllllllllllllIlIIllIIllllllIIlll;
        }
        if (lIlllIIIIIlllll(lIlllIIIIIlllIl(this.bipedLeftArm.rotateAngleX, lllllllllllllIlIIllIIllllllIIlll))) {
            this.bipedLeftArm.rotateAngleX = lllllllllllllIlIIllIIllllllIIlll;
        }
        if (lIlllIIIIlIIIII(lIlllIIIIIllllI(this.bipedRightArm.rotateAngleX, -lllllllllllllIlIIllIIllllllIIlll))) {
            this.bipedRightArm.rotateAngleX = -lllllllllllllIlIIllIIllllllIIlll;
        }
        if (lIlllIIIIlIIIII(lIlllIIIIIllllI(this.bipedLeftArm.rotateAngleX, -lllllllllllllIlIIllIIllllllIIlll))) {
            this.bipedLeftArm.rotateAngleX = -lllllllllllllIlIIllIIllllllIIlll;
        }
        if (lIlllIIIIIlllll(lIlllIIIIIlllIl(this.bipedRightLeg.rotateAngleX, lllllllllllllIlIIllIIllllllIIlll))) {
            this.bipedRightLeg.rotateAngleX = lllllllllllllIlIIllIIllllllIIlll;
        }
        if (lIlllIIIIIlllll(lIlllIIIIIlllIl(this.bipedLeftLeg.rotateAngleX, lllllllllllllIlIIllIIllllllIIlll))) {
            this.bipedLeftLeg.rotateAngleX = lllllllllllllIlIIllIIllllllIIlll;
        }
        if (lIlllIIIIlIIIII(lIlllIIIIIllllI(this.bipedRightLeg.rotateAngleX, -lllllllllllllIlIIllIIllllllIIlll))) {
            this.bipedRightLeg.rotateAngleX = -lllllllllllllIlIIllIIllllllIIlll;
        }
        if (lIlllIIIIlIIIII(lIlllIIIIIllllI(this.bipedLeftLeg.rotateAngleX, -lllllllllllllIlIIllIIllllllIIlll))) {
            this.bipedLeftLeg.rotateAngleX = -lllllllllllllIlIIllIIllllllIIlll;
        }
        if (lIlllIIIIlIIIIl(this.isCarrying ? 1 : 0)) {
            this.bipedRightArm.rotateAngleX = -0.5f;
            this.bipedLeftArm.rotateAngleX = -0.5f;
            this.bipedRightArm.rotateAngleZ = 0.05f;
            this.bipedLeftArm.rotateAngleZ = -0.05f;
        }
        this.bipedRightArm.rotationPointZ = 0.0f;
        this.bipedLeftArm.rotationPointZ = 0.0f;
        this.bipedRightLeg.rotationPointZ = 0.0f;
        this.bipedLeftLeg.rotationPointZ = 0.0f;
        this.bipedRightLeg.rotationPointY = 9.0f + lllllllllllllIlIIllIIllllllIlIII;
        this.bipedLeftLeg.rotationPointY = 9.0f + lllllllllllllIlIIllIIllllllIlIII;
        this.bipedHead.rotationPointZ = -0.0f;
        this.bipedHead.rotationPointY = lllllllllllllIlIIllIIllllllIlIII + 1.0f;
        this.bipedHeadwear.rotationPointX = this.bipedHead.rotationPointX;
        this.bipedHeadwear.rotationPointY = this.bipedHead.rotationPointY;
        this.bipedHeadwear.rotationPointZ = this.bipedHead.rotationPointZ;
        this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
        this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedHeadwear.rotateAngleZ = this.bipedHead.rotateAngleZ;
        if (lIlllIIIIlIIIIl(this.isAttacking ? 1 : 0)) {
            final float lllllllllllllIlIIllIIllllllIIllI = 1.0f;
            final ModelRenderer bipedHead = this.bipedHead;
            bipedHead.rotationPointY -= lllllllllllllIlIIllIIllllllIIllI * 5.0f;
        }
    }
    
    private static boolean lIlllIIIIlIIIII(final int lllllllllllllIlIIllIIlllllIlIlll) {
        return lllllllllllllIlIIllIIlllllIlIlll < 0;
    }
}
