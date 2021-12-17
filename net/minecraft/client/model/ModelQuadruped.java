// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelQuadruped extends ModelBase
{
    public /* synthetic */ ModelRenderer leg2;
    public /* synthetic */ ModelRenderer leg1;
    public /* synthetic */ ModelRenderer leg4;
    protected /* synthetic */ float childYOffset;
    public /* synthetic */ ModelRenderer leg3;
    public /* synthetic */ ModelRenderer head;
    public /* synthetic */ ModelRenderer body;
    protected /* synthetic */ float childZOffset;
    private static final /* synthetic */ int[] llIllllIIIlIlI;
    
    private static void lIIllIlIIlIIlIll() {
        (llIllllIIIlIlI = new int[9])[0] = ((0x58 ^ 0x74) & ~(0x40 ^ 0x6C));
        ModelQuadruped.llIllllIIIlIlI[1] = (0xAC ^ 0xA4);
        ModelQuadruped.llIllllIIIlIlI[2] = (0x33 ^ 0x21);
        ModelQuadruped.llIllllIIIlIlI[3] = (0x98 ^ 0x84);
        ModelQuadruped.llIllllIIIlIlI[4] = (0xA7 ^ 0xAD);
        ModelQuadruped.llIllllIIIlIlI[5] = (0x68 ^ 0x4B ^ (0x46 ^ 0x75));
        ModelQuadruped.llIllllIIIlIlI[6] = (102 + 32 - 64 + 95 ^ 74 + 110 - 51 + 47);
        ModelQuadruped.llIllllIIIlIlI[7] = (7 + 110 - 75 + 97 ^ 132 + 89 - 207 + 129);
        ModelQuadruped.llIllllIIIlIlI[8] = (0xA4 ^ 0xBC);
    }
    
    private static boolean lIIllIlIIlIIllII(final int llllllllllllIllIIlIIIIIIIlIllIIl) {
        return llllllllllllIllIIlIIIIIIIlIllIIl != 0;
    }
    
    static {
        lIIllIlIIlIIlIll();
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIllIIlIIIIIIIlllIllI, final float llllllllllllIllIIlIIIIIIIlllIlII, final float llllllllllllIllIIlIIIIIIIlllIIlI, final float llllllllllllIllIIlIIIIIIIlllIIIl, final float llllllllllllIllIIlIIIIIIIllIIIll, final float llllllllllllIllIIlIIIIIIIllIllll, final Entity llllllllllllIllIIlIIIIIIIllIllIl) {
        final float llllllllllllIllIIlIIIIIIIllIlIll = 57.295776f;
        this.head.rotateAngleX = llllllllllllIllIIlIIIIIIIllIIIll / 57.295776f;
        this.head.rotateAngleY = llllllllllllIllIIlIIIIIIIlllIIIl / 57.295776f;
        this.body.rotateAngleX = 1.5707964f;
        this.leg1.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIIIIIlllIllI * 0.6662f) * 1.4f * llllllllllllIllIIlIIIIIIIlllIlII;
        this.leg2.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIIIIIlllIllI * 0.6662f + 3.1415927f) * 1.4f * llllllllllllIllIIlIIIIIIIlllIlII;
        this.leg3.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIIIIIlllIllI * 0.6662f + 3.1415927f) * 1.4f * llllllllllllIllIIlIIIIIIIlllIlII;
        this.leg4.rotateAngleX = MathHelper.cos(llllllllllllIllIIlIIIIIIIlllIllI * 0.6662f) * 1.4f * llllllllllllIllIIlIIIIIIIlllIlII;
    }
    
    @Override
    public void render(final Entity llllllllllllIllIIlIIIIIIlIIlllIl, final float llllllllllllIllIIlIIIIIIlIIlllII, final float llllllllllllIllIIlIIIIIIlIIllIll, final float llllllllllllIllIIlIIIIIIlIIIllII, final float llllllllllllIllIIlIIIIIIlIIIlIlI, final float llllllllllllIllIIlIIIIIIlIIllIII, final float llllllllllllIllIIlIIIIIIlIIIIllI) {
        this.setRotationAngles(llllllllllllIllIIlIIIIIIlIIlllII, llllllllllllIllIIlIIIIIIlIIllIll, llllllllllllIllIIlIIIIIIlIIIllII, llllllllllllIllIIlIIIIIIlIIIlIlI, llllllllllllIllIIlIIIIIIlIIllIII, llllllllllllIllIIlIIIIIIlIIIIllI, llllllllllllIllIIlIIIIIIlIIlllIl);
        if (lIIllIlIIlIIllII(this.isChild ? 1 : 0)) {
            final float llllllllllllIllIIlIIIIIIlIIlIlII = 2.0f;
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, this.childYOffset * llllllllllllIllIIlIIIIIIlIIIIllI, this.childZOffset * llllllllllllIllIIlIIIIIIlIIIIllI);
            this.head.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            GlStateManager.scale(1.0f / llllllllllllIllIIlIIIIIIlIIlIlII, 1.0f / llllllllllllIllIIlIIIIIIlIIlIlII, 1.0f / llllllllllllIllIIlIIIIIIlIIlIlII);
            GlStateManager.translate(0.0f, 24.0f * llllllllllllIllIIlIIIIIIlIIIIllI, 0.0f);
            this.body.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            this.leg1.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            this.leg2.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            this.leg3.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            this.leg4.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            GlStateManager.popMatrix();
            "".length();
            if ("  ".length() < " ".length()) {
                return;
            }
        }
        else {
            this.head.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            this.body.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            this.leg1.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            this.leg2.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            this.leg3.render(llllllllllllIllIIlIIIIIIlIIIIllI);
            this.leg4.render(llllllllllllIllIIlIIIIIIlIIIIllI);
        }
    }
    
    public ModelQuadruped(final int llllllllllllIllIIlIIIIIIlIlllIlI, final float llllllllllllIllIIlIIIIIIlIllllII) {
        this.head = new ModelRenderer(this, ModelQuadruped.llIllllIIIlIlI[0], ModelQuadruped.llIllllIIIlIlI[0]);
        this.childYOffset = 8.0f;
        this.childZOffset = 4.0f;
        this.head.addBox(-4.0f, -4.0f, -8.0f, ModelQuadruped.llIllllIIIlIlI[1], ModelQuadruped.llIllllIIIlIlI[1], ModelQuadruped.llIllllIIIlIlI[1], llllllllllllIllIIlIIIIIIlIllllII);
        this.head.setRotationPoint(0.0f, (float)(ModelQuadruped.llIllllIIIlIlI[2] - llllllllllllIllIIlIIIIIIlIlllIlI), -6.0f);
        this.body = new ModelRenderer(this, ModelQuadruped.llIllllIIIlIlI[3], ModelQuadruped.llIllllIIIlIlI[1]);
        this.body.addBox(-5.0f, -10.0f, -7.0f, ModelQuadruped.llIllllIIIlIlI[4], ModelQuadruped.llIllllIIIlIlI[5], ModelQuadruped.llIllllIIIlIlI[1], llllllllllllIllIIlIIIIIIlIllllII);
        this.body.setRotationPoint(0.0f, (float)(ModelQuadruped.llIllllIIIlIlI[6] - llllllllllllIllIIlIIIIIIlIlllIlI), 2.0f);
        this.leg1 = new ModelRenderer(this, ModelQuadruped.llIllllIIIlIlI[0], ModelQuadruped.llIllllIIIlIlI[5]);
        this.leg1.addBox(-2.0f, 0.0f, -2.0f, ModelQuadruped.llIllllIIIlIlI[7], llllllllllllIllIIlIIIIIIlIlllIlI, ModelQuadruped.llIllllIIIlIlI[7], llllllllllllIllIIlIIIIIIlIllllII);
        this.leg1.setRotationPoint(-3.0f, (float)(ModelQuadruped.llIllllIIIlIlI[8] - llllllllllllIllIIlIIIIIIlIlllIlI), 7.0f);
        this.leg2 = new ModelRenderer(this, ModelQuadruped.llIllllIIIlIlI[0], ModelQuadruped.llIllllIIIlIlI[5]);
        this.leg2.addBox(-2.0f, 0.0f, -2.0f, ModelQuadruped.llIllllIIIlIlI[7], llllllllllllIllIIlIIIIIIlIlllIlI, ModelQuadruped.llIllllIIIlIlI[7], llllllllllllIllIIlIIIIIIlIllllII);
        this.leg2.setRotationPoint(3.0f, (float)(ModelQuadruped.llIllllIIIlIlI[8] - llllllllllllIllIIlIIIIIIlIlllIlI), 7.0f);
        this.leg3 = new ModelRenderer(this, ModelQuadruped.llIllllIIIlIlI[0], ModelQuadruped.llIllllIIIlIlI[5]);
        this.leg3.addBox(-2.0f, 0.0f, -2.0f, ModelQuadruped.llIllllIIIlIlI[7], llllllllllllIllIIlIIIIIIlIlllIlI, ModelQuadruped.llIllllIIIlIlI[7], llllllllllllIllIIlIIIIIIlIllllII);
        this.leg3.setRotationPoint(-3.0f, (float)(ModelQuadruped.llIllllIIIlIlI[8] - llllllllllllIllIIlIIIIIIlIlllIlI), -5.0f);
        this.leg4 = new ModelRenderer(this, ModelQuadruped.llIllllIIIlIlI[0], ModelQuadruped.llIllllIIIlIlI[5]);
        this.leg4.addBox(-2.0f, 0.0f, -2.0f, ModelQuadruped.llIllllIIIlIlI[7], llllllllllllIllIIlIIIIIIlIlllIlI, ModelQuadruped.llIllllIIIlIlI[7], llllllllllllIllIIlIIIIIIlIllllII);
        this.leg4.setRotationPoint(3.0f, (float)(ModelQuadruped.llIllllIIIlIlI[8] - llllllllllllIllIIlIIIIIIlIlllIlI), -5.0f);
    }
}
