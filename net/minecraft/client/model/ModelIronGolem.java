// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

public class ModelIronGolem extends ModelBase
{
    private static final /* synthetic */ int[] lIIIIIlIIIIlIl;
    public /* synthetic */ ModelRenderer ironGolemRightLeg;
    public /* synthetic */ ModelRenderer ironGolemRightArm;
    public /* synthetic */ ModelRenderer ironGolemHead;
    public /* synthetic */ ModelRenderer ironGolemBody;
    public /* synthetic */ ModelRenderer ironGolemLeftArm;
    public /* synthetic */ ModelRenderer ironGolemLeftLeg;
    
    private float func_78172_a(final float lllllllllllllIlIIlllllIllIllllIl, final float lllllllllllllIlIIlllllIllIlllIlI) {
        return (Math.abs(lllllllllllllIlIIlllllIllIllllIl % lllllllllllllIlIIlllllIllIlllIlI - lllllllllllllIlIIlllllIllIlllIlI * 0.5f) - lllllllllllllIlIIlllllIllIlllIlI * 0.25f) / (lllllllllllllIlIIlllllIllIlllIlI * 0.25f);
    }
    
    private static boolean lIllIlIlIlIlllI(final int lllllllllllllIlIIlllllIllIlllIII) {
        return lllllllllllllIlIIlllllIllIlllIII > 0;
    }
    
    private static void lIllIlIlIlIllIl() {
        (lIIIIIlIIIIlIl = new int[23])[0] = 96 + 106 - 89 + 15;
        ModelIronGolem.lIIIIIlIIIIlIl[1] = ((0x4F ^ 0x51 ^ (0x35 ^ 0x6)) & (92 + 57 - 93 + 114 ^ 41 + 117 - 153 + 130 ^ -" ".length()));
        ModelIronGolem.lIIIIIlIIIIlIl[2] = (0xA9 ^ 0xA1);
        ModelIronGolem.lIIIIIlIIIIlIl[3] = (0xA1 ^ 0xAB);
        ModelIronGolem.lIIIIIlIIIIlIl[4] = (0x94 ^ 0x8C);
        ModelIronGolem.lIIIIIlIIIIlIl[5] = "  ".length();
        ModelIronGolem.lIIIIIlIIIIlIl[6] = (0x94 ^ 0x90);
        ModelIronGolem.lIIIIIlIIIIlIl[7] = (0x27 ^ 0xF);
        ModelIronGolem.lIIIIIlIIIIlIl[8] = (0xC1 ^ 0x93 ^ (0x4E ^ 0xE));
        ModelIronGolem.lIIIIIlIIIIlIl[9] = (0x6C ^ 0x7E ^ (0x18 ^ 0x6));
        ModelIronGolem.lIIIIIlIIIIlIl[10] = (0xCA ^ 0xC1);
        ModelIronGolem.lIIIIIlIIIIlIl[11] = (0xDB ^ 0x9D);
        ModelIronGolem.lIIIIIlIIIIlIl[12] = (126 + 73 - 84 + 72 ^ 0 + 14 + 3 + 161);
        ModelIronGolem.lIIIIIlIIIIlIl[13] = (0x92 ^ 0x97);
        ModelIronGolem.lIIIIIlIIIIlIl[14] = (0x5C ^ 0x5A);
        ModelIronGolem.lIIIIIlIIIIlIl[15] = (0xF ^ 0x68 ^ (0x59 ^ 0x2));
        ModelIronGolem.lIIIIIlIIIIlIl[16] = (0x3A ^ 0x2F);
        ModelIronGolem.lIIIIIlIIIIlIl[17] = (39 + 68 - 45 + 90 ^ 10 + 3 + 31 + 90);
        ModelIronGolem.lIIIIIlIIIIlIl[18] = (0x5A ^ 0x60);
        ModelIronGolem.lIIIIIlIIIIlIl[19] = (0xB ^ 0x1D);
        ModelIronGolem.lIIIIIlIIIIlIl[20] = (0x10 ^ 0x72 ^ (0x84 ^ 0xC3));
        ModelIronGolem.lIIIIIlIIIIlIl[21] = (0x6C ^ 0x18 ^ (0xD0 ^ 0xB4));
        ModelIronGolem.lIIIIIlIIIIlIl[22] = " ".length();
    }
    
    public ModelIronGolem(final float lllllllllllllIlIIllllllIIIIIlIll, final float lllllllllllllIlIIllllllIIIIIlIlI) {
        final int lllllllllllllIlIIllllllIIIIIlIIl = ModelIronGolem.lIIIIIlIIIIlIl[0];
        final int lllllllllllllIlIIllllllIIIIIlIII = ModelIronGolem.lIIIIIlIIIIlIl[0];
        this.ironGolemHead = new ModelRenderer(this).setTextureSize(lllllllllllllIlIIllllllIIIIIlIIl, lllllllllllllIlIIllllllIIIIIlIII);
        this.ironGolemHead.setRotationPoint(0.0f, 0.0f + lllllllllllllIlIIllllllIIIIIlIlI, -2.0f);
        this.ironGolemHead.setTextureOffset(ModelIronGolem.lIIIIIlIIIIlIl[1], ModelIronGolem.lIIIIIlIIIIlIl[1]).addBox(-4.0f, -12.0f, -5.5f, ModelIronGolem.lIIIIIlIIIIlIl[2], ModelIronGolem.lIIIIIlIIIIlIl[3], ModelIronGolem.lIIIIIlIIIIlIl[2], lllllllllllllIlIIllllllIIIIIlIll);
        this.ironGolemHead.setTextureOffset(ModelIronGolem.lIIIIIlIIIIlIl[4], ModelIronGolem.lIIIIIlIIIIlIl[1]).addBox(-1.0f, -5.0f, -7.5f, ModelIronGolem.lIIIIIlIIIIlIl[5], ModelIronGolem.lIIIIIlIIIIlIl[6], ModelIronGolem.lIIIIIlIIIIlIl[5], lllllllllllllIlIIllllllIIIIIlIll);
        this.ironGolemBody = new ModelRenderer(this).setTextureSize(lllllllllllllIlIIllllllIIIIIlIIl, lllllllllllllIlIIllllllIIIIIlIII);
        this.ironGolemBody.setRotationPoint(0.0f, 0.0f + lllllllllllllIlIIllllllIIIIIlIlI, 0.0f);
        this.ironGolemBody.setTextureOffset(ModelIronGolem.lIIIIIlIIIIlIl[1], ModelIronGolem.lIIIIIlIIIIlIl[7]).addBox(-9.0f, -2.0f, -6.0f, ModelIronGolem.lIIIIIlIIIIlIl[8], ModelIronGolem.lIIIIIlIIIIlIl[9], ModelIronGolem.lIIIIIlIIIIlIl[10], lllllllllllllIlIIllllllIIIIIlIll);
        this.ironGolemBody.setTextureOffset(ModelIronGolem.lIIIIIlIIIIlIl[1], ModelIronGolem.lIIIIIlIIIIlIl[11]).addBox(-4.5f, 10.0f, -3.0f, ModelIronGolem.lIIIIIlIIIIlIl[12], ModelIronGolem.lIIIIIlIIIIlIl[13], ModelIronGolem.lIIIIIlIIIIlIl[14], lllllllllllllIlIIllllllIIIIIlIll + 0.5f);
        this.ironGolemRightArm = new ModelRenderer(this).setTextureSize(lllllllllllllIlIIllllllIIIIIlIIl, lllllllllllllIlIIllllllIIIIIlIII);
        this.ironGolemRightArm.setRotationPoint(0.0f, -7.0f, 0.0f);
        this.ironGolemRightArm.setTextureOffset(ModelIronGolem.lIIIIIlIIIIlIl[15], ModelIronGolem.lIIIIIlIIIIlIl[16]).addBox(-13.0f, -2.5f, -3.0f, ModelIronGolem.lIIIIIlIIIIlIl[6], ModelIronGolem.lIIIIIlIIIIlIl[17], ModelIronGolem.lIIIIIlIIIIlIl[14], lllllllllllllIlIIllllllIIIIIlIll);
        this.ironGolemLeftArm = new ModelRenderer(this).setTextureSize(lllllllllllllIlIIllllllIIIIIlIIl, lllllllllllllIlIIllllllIIIIIlIII);
        this.ironGolemLeftArm.setRotationPoint(0.0f, -7.0f, 0.0f);
        this.ironGolemLeftArm.setTextureOffset(ModelIronGolem.lIIIIIlIIIIlIl[15], ModelIronGolem.lIIIIIlIIIIlIl[18]).addBox(9.0f, -2.5f, -3.0f, ModelIronGolem.lIIIIIlIIIIlIl[6], ModelIronGolem.lIIIIIlIIIIlIl[17], ModelIronGolem.lIIIIIlIIIIlIl[14], lllllllllllllIlIIllllllIIIIIlIll);
        this.ironGolemLeftLeg = new ModelRenderer(this, ModelIronGolem.lIIIIIlIIIIlIl[1], ModelIronGolem.lIIIIIlIIIIlIl[19]).setTextureSize(lllllllllllllIlIIllllllIIIIIlIIl, lllllllllllllIlIIllllllIIIIIlIII);
        this.ironGolemLeftLeg.setRotationPoint(-4.0f, 18.0f + lllllllllllllIlIIllllllIIIIIlIlI, 0.0f);
        this.ironGolemLeftLeg.setTextureOffset(ModelIronGolem.lIIIIIlIIIIlIl[20], ModelIronGolem.lIIIIIlIIIIlIl[1]).addBox(-3.5f, -3.0f, -3.0f, ModelIronGolem.lIIIIIlIIIIlIl[14], ModelIronGolem.lIIIIIlIIIIlIl[21], ModelIronGolem.lIIIIIlIIIIlIl[13], lllllllllllllIlIIllllllIIIIIlIll);
        this.ironGolemRightLeg = new ModelRenderer(this, ModelIronGolem.lIIIIIlIIIIlIl[1], ModelIronGolem.lIIIIIlIIIIlIl[19]).setTextureSize(lllllllllllllIlIIllllllIIIIIlIIl, lllllllllllllIlIIllllllIIIIIlIII);
        this.ironGolemRightLeg.mirror = (ModelIronGolem.lIIIIIlIIIIlIl[22] != 0);
        this.ironGolemRightLeg.setTextureOffset(ModelIronGolem.lIIIIIlIIIIlIl[15], ModelIronGolem.lIIIIIlIIIIlIl[1]).setRotationPoint(5.0f, 18.0f + lllllllllllllIlIIllllllIIIIIlIlI, 0.0f);
        this.ironGolemRightLeg.addBox(-3.5f, -3.0f, -3.0f, ModelIronGolem.lIIIIIlIIIIlIl[14], ModelIronGolem.lIIIIIlIIIIlIl[21], ModelIronGolem.lIIIIIlIIIIlIl[13], lllllllllllllIlIIllllllIIIIIlIll);
    }
    
    @Override
    public void render(final Entity lllllllllllllIlIIlllllIlllllIIIl, final float lllllllllllllIlIIlllllIlllllIIII, final float lllllllllllllIlIIlllllIlllllIlll, final float lllllllllllllIlIIlllllIlllllIllI, final float lllllllllllllIlIIlllllIlllllIlIl, final float lllllllllllllIlIIlllllIllllIllII, final float lllllllllllllIlIIlllllIlllllIIll) {
        this.setRotationAngles(lllllllllllllIlIIlllllIlllllIIII, lllllllllllllIlIIlllllIlllllIlll, lllllllllllllIlIIlllllIlllllIllI, lllllllllllllIlIIlllllIlllllIlIl, lllllllllllllIlIIlllllIllllIllII, lllllllllllllIlIIlllllIlllllIIll, lllllllllllllIlIIlllllIlllllIIIl);
        this.ironGolemHead.render(lllllllllllllIlIIlllllIlllllIIll);
        this.ironGolemBody.render(lllllllllllllIlIIlllllIlllllIIll);
        this.ironGolemLeftLeg.render(lllllllllllllIlIIlllllIlllllIIll);
        this.ironGolemRightLeg.render(lllllllllllllIlIIlllllIlllllIIll);
        this.ironGolemRightArm.render(lllllllllllllIlIIlllllIlllllIIll);
        this.ironGolemLeftArm.render(lllllllllllllIlIIlllllIlllllIIll);
    }
    
    public ModelIronGolem(final float lllllllllllllIlIIllllllIIIIlIIlI) {
        this(lllllllllllllIlIIllllllIIIIlIIlI, -7.0f);
    }
    
    public ModelIronGolem() {
        this(0.0f);
    }
    
    static {
        lIllIlIlIlIllIl();
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIlIIlllllIlllIlllII, final float lllllllllllllIlIIlllllIllllIIIll, final float lllllllllllllIlIIlllllIllllIIIlI, final float lllllllllllllIlIIlllllIlllIllIlI, final float lllllllllllllIlIIlllllIllllIIIII, final float lllllllllllllIlIIlllllIlllIlllll, final Entity lllllllllllllIlIIlllllIlllIllllI) {
        this.ironGolemHead.rotateAngleY = lllllllllllllIlIIlllllIlllIllIlI / 57.295776f;
        this.ironGolemHead.rotateAngleX = lllllllllllllIlIIlllllIllllIIIII / 57.295776f;
        this.ironGolemLeftLeg.rotateAngleX = -1.5f * this.func_78172_a(lllllllllllllIlIIlllllIlllIlllII, 13.0f) * lllllllllllllIlIIlllllIllllIIIll;
        this.ironGolemRightLeg.rotateAngleX = 1.5f * this.func_78172_a(lllllllllllllIlIIlllllIlllIlllII, 13.0f) * lllllllllllllIlIIlllllIllllIIIll;
        this.ironGolemLeftLeg.rotateAngleY = 0.0f;
        this.ironGolemRightLeg.rotateAngleY = 0.0f;
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase lllllllllllllIlIIlllllIlllIIIlll, final float lllllllllllllIlIIlllllIlllIIIllI, final float lllllllllllllIlIIlllllIlllIIIlIl, final float lllllllllllllIlIIlllllIlllIIllII) {
        final EntityIronGolem lllllllllllllIlIIlllllIlllIIlIll = (EntityIronGolem)lllllllllllllIlIIlllllIlllIIIlll;
        final int lllllllllllllIlIIlllllIlllIIlIlI = lllllllllllllIlIIlllllIlllIIlIll.getAttackTimer();
        if (lIllIlIlIlIlllI(lllllllllllllIlIIlllllIlllIIlIlI)) {
            this.ironGolemRightArm.rotateAngleX = -2.0f + 1.5f * this.func_78172_a(lllllllllllllIlIIlllllIlllIIlIlI - lllllllllllllIlIIlllllIlllIIllII, 10.0f);
            this.ironGolemLeftArm.rotateAngleX = -2.0f + 1.5f * this.func_78172_a(lllllllllllllIlIIlllllIlllIIlIlI - lllllllllllllIlIIlllllIlllIIllII, 10.0f);
            "".length();
            if (((0x5C ^ 0x63 ^ (0x7B ^ 0x11)) & (0xB8 ^ 0x8C ^ (0x1F ^ 0x7E) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            final int lllllllllllllIlIIlllllIlllIIlIIl = lllllllllllllIlIIlllllIlllIIlIll.getHoldRoseTick();
            if (lIllIlIlIlIlllI(lllllllllllllIlIIlllllIlllIIlIIl)) {
                this.ironGolemRightArm.rotateAngleX = -0.8f + 0.025f * this.func_78172_a((float)lllllllllllllIlIIlllllIlllIIlIIl, 70.0f);
                this.ironGolemLeftArm.rotateAngleX = 0.0f;
                "".length();
                if (((0xCF ^ 0x88) & ~(0x12 ^ 0x55)) != 0x0) {
                    return;
                }
            }
            else {
                this.ironGolemRightArm.rotateAngleX = (-0.2f + 1.5f * this.func_78172_a(lllllllllllllIlIIlllllIlllIIIllI, 13.0f)) * lllllllllllllIlIIlllllIlllIIIlIl;
                this.ironGolemLeftArm.rotateAngleX = (-0.2f - 1.5f * this.func_78172_a(lllllllllllllIlIIlllllIlllIIIllI, 13.0f)) * lllllllllllllIlIIlllllIlllIIIlIl;
            }
        }
    }
}
