// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelSpider extends ModelBase
{
    public /* synthetic */ ModelRenderer spiderLeg2;
    public /* synthetic */ ModelRenderer spiderLeg3;
    public /* synthetic */ ModelRenderer spiderLeg6;
    public /* synthetic */ ModelRenderer spiderNeck;
    public /* synthetic */ ModelRenderer spiderLeg7;
    public /* synthetic */ ModelRenderer spiderLeg8;
    public /* synthetic */ ModelRenderer spiderLeg5;
    public /* synthetic */ ModelRenderer spiderHead;
    public /* synthetic */ ModelRenderer spiderBody;
    public /* synthetic */ ModelRenderer spiderLeg1;
    private static final /* synthetic */ int[] lIIlIlllIllllI;
    public /* synthetic */ ModelRenderer spiderLeg4;
    
    static {
        llIlIlIIIIlIIll();
    }
    
    @Override
    public void render(final Entity lllllllllllllIIllIIIIIIllIIlIIlI, final float lllllllllllllIIllIIIIIIllIIlIIIl, final float lllllllllllllIIllIIIIIIllIIllIII, final float lllllllllllllIIllIIIIIIllIIlIlll, final float lllllllllllllIIllIIIIIIllIIIlllI, final float lllllllllllllIIllIIIIIIllIIlIlIl, final float lllllllllllllIIllIIIIIIllIIlIlII) {
        this.setRotationAngles(lllllllllllllIIllIIIIIIllIIlIIIl, lllllllllllllIIllIIIIIIllIIllIII, lllllllllllllIIllIIIIIIllIIlIlll, lllllllllllllIIllIIIIIIllIIIlllI, lllllllllllllIIllIIIIIIllIIlIlIl, lllllllllllllIIllIIIIIIllIIlIlII, lllllllllllllIIllIIIIIIllIIlIIlI);
        this.spiderHead.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderNeck.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderBody.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderLeg1.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderLeg2.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderLeg3.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderLeg4.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderLeg5.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderLeg6.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderLeg7.render(lllllllllllllIIllIIIIIIllIIlIlII);
        this.spiderLeg8.render(lllllllllllllIIllIIIIIIllIIlIlII);
    }
    
    private static void llIlIlIIIIlIIll() {
        (lIIlIlllIllllI = new int[11])[0] = (0x23 ^ 0x44 ^ (0xFF ^ 0x97));
        ModelSpider.lIIlIlllIllllI[1] = ("   ".length() ^ (0xB9 ^ 0x9A));
        ModelSpider.lIIlIlllIllllI[2] = (98 + 100 - 167 + 109 ^ 95 + 109 - 182 + 114);
        ModelSpider.lIIlIlllIllllI[3] = (0xDE ^ 0x8E ^ (0x17 ^ 0x4F));
        ModelSpider.lIIlIlllIllllI[4] = ((0xB4 ^ 0x8C) & ~(0xA2 ^ 0x9A));
        ModelSpider.lIIlIlllIllllI[5] = (48 + 174 - 216 + 174 ^ 63 + 74 - 115 + 156);
        ModelSpider.lIIlIlllIllllI[6] = (0xC9 ^ 0xBE ^ (0x1D ^ 0x66));
        ModelSpider.lIIlIlllIllllI[7] = (81 + 138 - 162 + 131 ^ 104 + 168 - 157 + 67);
        ModelSpider.lIIlIlllIllllI[8] = (0x58 ^ 0x4A);
        ModelSpider.lIIlIlllIllllI[9] = (0xD6 ^ 0xC6);
        ModelSpider.lIIlIlllIllllI[10] = "  ".length();
    }
    
    public ModelSpider() {
        final float lllllllllllllIIllIIIIIIllIlIlIII = 0.0f;
        final int lllllllllllllIIllIIIIIIllIlIIlll = ModelSpider.lIIlIlllIllllI[0];
        this.spiderHead = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[1], ModelSpider.lIIlIlllIllllI[2]);
        this.spiderHead.addBox(-4.0f, -4.0f, -8.0f, ModelSpider.lIIlIlllIllllI[3], ModelSpider.lIIlIlllIllllI[3], ModelSpider.lIIlIlllIllllI[3], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderHead.setRotationPoint(0.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, -3.0f);
        this.spiderNeck = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[4], ModelSpider.lIIlIlllIllllI[4]);
        this.spiderNeck.addBox(-3.0f, -3.0f, -3.0f, ModelSpider.lIIlIlllIllllI[5], ModelSpider.lIIlIlllIllllI[5], ModelSpider.lIIlIlllIllllI[5], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderNeck.setRotationPoint(0.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, 0.0f);
        this.spiderBody = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[4], ModelSpider.lIIlIlllIllllI[6]);
        this.spiderBody.addBox(-5.0f, -4.0f, -6.0f, ModelSpider.lIIlIlllIllllI[7], ModelSpider.lIIlIlllIllllI[3], ModelSpider.lIIlIlllIllllI[6], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderBody.setRotationPoint(0.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, 9.0f);
        this.spiderLeg1 = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[8], ModelSpider.lIIlIlllIllllI[4]);
        this.spiderLeg1.addBox(-15.0f, -1.0f, -1.0f, ModelSpider.lIIlIlllIllllI[9], ModelSpider.lIIlIlllIllllI[10], ModelSpider.lIIlIlllIllllI[10], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderLeg1.setRotationPoint(-4.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, 2.0f);
        this.spiderLeg2 = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[8], ModelSpider.lIIlIlllIllllI[4]);
        this.spiderLeg2.addBox(-1.0f, -1.0f, -1.0f, ModelSpider.lIIlIlllIllllI[9], ModelSpider.lIIlIlllIllllI[10], ModelSpider.lIIlIlllIllllI[10], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderLeg2.setRotationPoint(4.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, 2.0f);
        this.spiderLeg3 = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[8], ModelSpider.lIIlIlllIllllI[4]);
        this.spiderLeg3.addBox(-15.0f, -1.0f, -1.0f, ModelSpider.lIIlIlllIllllI[9], ModelSpider.lIIlIlllIllllI[10], ModelSpider.lIIlIlllIllllI[10], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderLeg3.setRotationPoint(-4.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, 1.0f);
        this.spiderLeg4 = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[8], ModelSpider.lIIlIlllIllllI[4]);
        this.spiderLeg4.addBox(-1.0f, -1.0f, -1.0f, ModelSpider.lIIlIlllIllllI[9], ModelSpider.lIIlIlllIllllI[10], ModelSpider.lIIlIlllIllllI[10], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderLeg4.setRotationPoint(4.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, 1.0f);
        this.spiderLeg5 = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[8], ModelSpider.lIIlIlllIllllI[4]);
        this.spiderLeg5.addBox(-15.0f, -1.0f, -1.0f, ModelSpider.lIIlIlllIllllI[9], ModelSpider.lIIlIlllIllllI[10], ModelSpider.lIIlIlllIllllI[10], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderLeg5.setRotationPoint(-4.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, 0.0f);
        this.spiderLeg6 = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[8], ModelSpider.lIIlIlllIllllI[4]);
        this.spiderLeg6.addBox(-1.0f, -1.0f, -1.0f, ModelSpider.lIIlIlllIllllI[9], ModelSpider.lIIlIlllIllllI[10], ModelSpider.lIIlIlllIllllI[10], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderLeg6.setRotationPoint(4.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, 0.0f);
        this.spiderLeg7 = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[8], ModelSpider.lIIlIlllIllllI[4]);
        this.spiderLeg7.addBox(-15.0f, -1.0f, -1.0f, ModelSpider.lIIlIlllIllllI[9], ModelSpider.lIIlIlllIllllI[10], ModelSpider.lIIlIlllIllllI[10], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderLeg7.setRotationPoint(-4.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, -1.0f);
        this.spiderLeg8 = new ModelRenderer(this, ModelSpider.lIIlIlllIllllI[8], ModelSpider.lIIlIlllIllllI[4]);
        this.spiderLeg8.addBox(-1.0f, -1.0f, -1.0f, ModelSpider.lIIlIlllIllllI[9], ModelSpider.lIIlIlllIllllI[10], ModelSpider.lIIlIlllIllllI[10], lllllllllllllIIllIIIIIIllIlIlIII);
        this.spiderLeg8.setRotationPoint(4.0f, (float)lllllllllllllIIllIIIIIIllIlIIlll, -1.0f);
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIllIIIIIIlIllIIlll, final float lllllllllllllIIllIIIIIIlIllIIllI, final float lllllllllllllIIllIIIIIIlIllllIII, final float lllllllllllllIIllIIIIIIlIllIIlIl, final float lllllllllllllIIllIIIIIIlIlllIllI, final float lllllllllllllIIllIIIIIIlIlllIlIl, final Entity lllllllllllllIIllIIIIIIlIlllIlII) {
        this.spiderHead.rotateAngleY = lllllllllllllIIllIIIIIIlIllIIlIl / 57.295776f;
        this.spiderHead.rotateAngleX = lllllllllllllIIllIIIIIIlIlllIllI / 57.295776f;
        final float lllllllllllllIIllIIIIIIlIlllIIll = 0.7853982f;
        this.spiderLeg1.rotateAngleZ = -lllllllllllllIIllIIIIIIlIlllIIll;
        this.spiderLeg2.rotateAngleZ = lllllllllllllIIllIIIIIIlIlllIIll;
        this.spiderLeg3.rotateAngleZ = -lllllllllllllIIllIIIIIIlIlllIIll * 0.74f;
        this.spiderLeg4.rotateAngleZ = lllllllllllllIIllIIIIIIlIlllIIll * 0.74f;
        this.spiderLeg5.rotateAngleZ = -lllllllllllllIIllIIIIIIlIlllIIll * 0.74f;
        this.spiderLeg6.rotateAngleZ = lllllllllllllIIllIIIIIIlIlllIIll * 0.74f;
        this.spiderLeg7.rotateAngleZ = -lllllllllllllIIllIIIIIIlIlllIIll;
        this.spiderLeg8.rotateAngleZ = lllllllllllllIIllIIIIIIlIlllIIll;
        final float lllllllllllllIIllIIIIIIlIlllIIlI = -0.0f;
        final float lllllllllllllIIllIIIIIIlIlllIIIl = 0.3926991f;
        this.spiderLeg1.rotateAngleY = lllllllllllllIIllIIIIIIlIlllIIIl * 2.0f + lllllllllllllIIllIIIIIIlIlllIIlI;
        this.spiderLeg2.rotateAngleY = -lllllllllllllIIllIIIIIIlIlllIIIl * 2.0f - lllllllllllllIIllIIIIIIlIlllIIlI;
        this.spiderLeg3.rotateAngleY = lllllllllllllIIllIIIIIIlIlllIIIl * 1.0f + lllllllllllllIIllIIIIIIlIlllIIlI;
        this.spiderLeg4.rotateAngleY = -lllllllllllllIIllIIIIIIlIlllIIIl * 1.0f - lllllllllllllIIllIIIIIIlIlllIIlI;
        this.spiderLeg5.rotateAngleY = -lllllllllllllIIllIIIIIIlIlllIIIl * 1.0f + lllllllllllllIIllIIIIIIlIlllIIlI;
        this.spiderLeg6.rotateAngleY = lllllllllllllIIllIIIIIIlIlllIIIl * 1.0f - lllllllllllllIIllIIIIIIlIlllIIlI;
        this.spiderLeg7.rotateAngleY = -lllllllllllllIIllIIIIIIlIlllIIIl * 2.0f + lllllllllllllIIllIIIIIIlIlllIIlI;
        this.spiderLeg8.rotateAngleY = lllllllllllllIIllIIIIIIlIlllIIIl * 2.0f - lllllllllllllIIllIIIIIIlIlllIIlI;
        final float lllllllllllllIIllIIIIIIlIlllIIII = -(MathHelper.cos(lllllllllllllIIllIIIIIIlIllIIlll * 0.6662f * 2.0f + 0.0f) * 0.4f) * lllllllllllllIIllIIIIIIlIllIIllI;
        final float lllllllllllllIIllIIIIIIlIllIllll = -(MathHelper.cos(lllllllllllllIIllIIIIIIlIllIIlll * 0.6662f * 2.0f + 3.1415927f) * 0.4f) * lllllllllllllIIllIIIIIIlIllIIllI;
        final float lllllllllllllIIllIIIIIIlIllIlllI = -(MathHelper.cos(lllllllllllllIIllIIIIIIlIllIIlll * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * lllllllllllllIIllIIIIIIlIllIIllI;
        final float lllllllllllllIIllIIIIIIlIllIllIl = -(MathHelper.cos(lllllllllllllIIllIIIIIIlIllIIlll * 0.6662f * 2.0f + 4.712389f) * 0.4f) * lllllllllllllIIllIIIIIIlIllIIllI;
        final float lllllllllllllIIllIIIIIIlIllIllII = Math.abs(MathHelper.sin(lllllllllllllIIllIIIIIIlIllIIlll * 0.6662f + 0.0f) * 0.4f) * lllllllllllllIIllIIIIIIlIllIIllI;
        final float lllllllllllllIIllIIIIIIlIllIlIll = Math.abs(MathHelper.sin(lllllllllllllIIllIIIIIIlIllIIlll * 0.6662f + 3.1415927f) * 0.4f) * lllllllllllllIIllIIIIIIlIllIIllI;
        final float lllllllllllllIIllIIIIIIlIllIlIlI = Math.abs(MathHelper.sin(lllllllllllllIIllIIIIIIlIllIIlll * 0.6662f + 1.5707964f) * 0.4f) * lllllllllllllIIllIIIIIIlIllIIllI;
        final float lllllllllllllIIllIIIIIIlIllIlIIl = Math.abs(MathHelper.sin(lllllllllllllIIllIIIIIIlIllIIlll * 0.6662f + 4.712389f) * 0.4f) * lllllllllllllIIllIIIIIIlIllIIllI;
        final ModelRenderer spiderLeg1 = this.spiderLeg1;
        spiderLeg1.rotateAngleY += lllllllllllllIIllIIIIIIlIlllIIII;
        final ModelRenderer spiderLeg2 = this.spiderLeg2;
        spiderLeg2.rotateAngleY += -lllllllllllllIIllIIIIIIlIlllIIII;
        final ModelRenderer spiderLeg3 = this.spiderLeg3;
        spiderLeg3.rotateAngleY += lllllllllllllIIllIIIIIIlIllIllll;
        final ModelRenderer spiderLeg4 = this.spiderLeg4;
        spiderLeg4.rotateAngleY += -lllllllllllllIIllIIIIIIlIllIllll;
        final ModelRenderer spiderLeg5 = this.spiderLeg5;
        spiderLeg5.rotateAngleY += lllllllllllllIIllIIIIIIlIllIlllI;
        final ModelRenderer spiderLeg6 = this.spiderLeg6;
        spiderLeg6.rotateAngleY += -lllllllllllllIIllIIIIIIlIllIlllI;
        final ModelRenderer spiderLeg7 = this.spiderLeg7;
        spiderLeg7.rotateAngleY += lllllllllllllIIllIIIIIIlIllIllIl;
        final ModelRenderer spiderLeg8 = this.spiderLeg8;
        spiderLeg8.rotateAngleY += -lllllllllllllIIllIIIIIIlIllIllIl;
        final ModelRenderer spiderLeg9 = this.spiderLeg1;
        spiderLeg9.rotateAngleZ += lllllllllllllIIllIIIIIIlIllIllII;
        final ModelRenderer spiderLeg10 = this.spiderLeg2;
        spiderLeg10.rotateAngleZ += -lllllllllllllIIllIIIIIIlIllIllII;
        final ModelRenderer spiderLeg11 = this.spiderLeg3;
        spiderLeg11.rotateAngleZ += lllllllllllllIIllIIIIIIlIllIlIll;
        final ModelRenderer spiderLeg12 = this.spiderLeg4;
        spiderLeg12.rotateAngleZ += -lllllllllllllIIllIIIIIIlIllIlIll;
        final ModelRenderer spiderLeg13 = this.spiderLeg5;
        spiderLeg13.rotateAngleZ += lllllllllllllIIllIIIIIIlIllIlIlI;
        final ModelRenderer spiderLeg14 = this.spiderLeg6;
        spiderLeg14.rotateAngleZ += -lllllllllllllIIllIIIIIIlIllIlIlI;
        final ModelRenderer spiderLeg15 = this.spiderLeg7;
        spiderLeg15.rotateAngleZ += lllllllllllllIIllIIIIIIlIllIlIIl;
        final ModelRenderer spiderLeg16 = this.spiderLeg8;
        spiderLeg16.rotateAngleZ += -lllllllllllllIIllIIIIIIlIllIlIIl;
    }
}
