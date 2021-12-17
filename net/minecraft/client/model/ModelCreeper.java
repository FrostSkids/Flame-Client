// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelCreeper extends ModelBase
{
    public /* synthetic */ ModelRenderer creeperArmor;
    public /* synthetic */ ModelRenderer head;
    private static final /* synthetic */ int[] lllIllIllIlIlI;
    public /* synthetic */ ModelRenderer leg4;
    public /* synthetic */ ModelRenderer leg3;
    public /* synthetic */ ModelRenderer leg1;
    public /* synthetic */ ModelRenderer leg2;
    public /* synthetic */ ModelRenderer body;
    
    public ModelCreeper() {
        this(0.0f);
    }
    
    static {
        lIlIIlIlIIlIIlII();
    }
    
    @Override
    public void render(final Entity llllllllllllIlIllIIIllIlllIlIllI, final float llllllllllllIlIllIIIllIlllIlIlIl, final float llllllllllllIlIllIIIllIlllIIllII, final float llllllllllllIlIllIIIllIlllIIlIll, final float llllllllllllIlIllIIIllIlllIlIIlI, final float llllllllllllIlIllIIIllIlllIlIIIl, final float llllllllllllIlIllIIIllIlllIIlIII) {
        this.setRotationAngles(llllllllllllIlIllIIIllIlllIlIlIl, llllllllllllIlIllIIIllIlllIIllII, llllllllllllIlIllIIIllIlllIIlIll, llllllllllllIlIllIIIllIlllIlIIlI, llllllllllllIlIllIIIllIlllIlIIIl, llllllllllllIlIllIIIllIlllIIlIII, llllllllllllIlIllIIIllIlllIlIllI);
        this.head.render(llllllllllllIlIllIIIllIlllIIlIII);
        this.body.render(llllllllllllIlIllIIIllIlllIIlIII);
        this.leg1.render(llllllllllllIlIllIIIllIlllIIlIII);
        this.leg2.render(llllllllllllIlIllIIIllIlllIIlIII);
        this.leg3.render(llllllllllllIlIllIIIllIlllIIlIII);
        this.leg4.render(llllllllllllIlIllIIIllIlllIIlIII);
    }
    
    private static void lIlIIlIlIIlIIlII() {
        (lllIllIllIlIlI = new int[7])[0] = (1 + 136 - 52 + 55 ^ 68 + 112 - 75 + 33);
        ModelCreeper.lllIllIllIlIlI[1] = ((0x3C ^ 0x6E ^ (0x46 ^ 0x3D)) & (74 + 92 - 52 + 36 ^ 73 + 38 - 68 + 148 ^ -" ".length()));
        ModelCreeper.lllIllIllIlIlI[2] = (0x5C ^ 0x54);
        ModelCreeper.lllIllIllIlIlI[3] = (0x8A ^ 0xAA);
        ModelCreeper.lllIllIllIlIlI[4] = (0x86 ^ 0x96);
        ModelCreeper.lllIllIllIlIlI[5] = (0x5E ^ 0x52);
        ModelCreeper.lllIllIllIlIlI[6] = (0xB8 ^ 0xBC);
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIlIllIIIllIllIlllIIl, final float llllllllllllIlIllIIIllIllIlllIII, final float llllllllllllIlIllIIIllIllIllllll, final float llllllllllllIlIllIIIllIllIllIlll, final float llllllllllllIlIllIIIllIllIllllIl, final float llllllllllllIlIllIIIllIllIllllII, final Entity llllllllllllIlIllIIIllIllIlllIll) {
        this.head.rotateAngleY = llllllllllllIlIllIIIllIllIllIlll / 57.295776f;
        this.head.rotateAngleX = llllllllllllIlIllIIIllIllIllllIl / 57.295776f;
        this.leg1.rotateAngleX = MathHelper.cos(llllllllllllIlIllIIIllIllIlllIIl * 0.6662f) * 1.4f * llllllllllllIlIllIIIllIllIlllIII;
        this.leg2.rotateAngleX = MathHelper.cos(llllllllllllIlIllIIIllIllIlllIIl * 0.6662f + 3.1415927f) * 1.4f * llllllllllllIlIllIIIllIllIlllIII;
        this.leg3.rotateAngleX = MathHelper.cos(llllllllllllIlIllIIIllIllIlllIIl * 0.6662f + 3.1415927f) * 1.4f * llllllllllllIlIllIIIllIllIlllIII;
        this.leg4.rotateAngleX = MathHelper.cos(llllllllllllIlIllIIIllIllIlllIIl * 0.6662f) * 1.4f * llllllllllllIlIllIIIllIllIlllIII;
    }
    
    public ModelCreeper(final float llllllllllllIlIllIIIllIllllIIIIl) {
        final int llllllllllllIlIllIIIllIllllIIIll = ModelCreeper.lllIllIllIlIlI[0];
        this.head = new ModelRenderer(this, ModelCreeper.lllIllIllIlIlI[1], ModelCreeper.lllIllIllIlIlI[1]);
        this.head.addBox(-4.0f, -8.0f, -4.0f, ModelCreeper.lllIllIllIlIlI[2], ModelCreeper.lllIllIllIlIlI[2], ModelCreeper.lllIllIllIlIlI[2], llllllllllllIlIllIIIllIllllIIIIl);
        this.head.setRotationPoint(0.0f, (float)llllllllllllIlIllIIIllIllllIIIll, 0.0f);
        this.creeperArmor = new ModelRenderer(this, ModelCreeper.lllIllIllIlIlI[3], ModelCreeper.lllIllIllIlIlI[1]);
        this.creeperArmor.addBox(-4.0f, -8.0f, -4.0f, ModelCreeper.lllIllIllIlIlI[2], ModelCreeper.lllIllIllIlIlI[2], ModelCreeper.lllIllIllIlIlI[2], llllllllllllIlIllIIIllIllllIIIIl + 0.5f);
        this.creeperArmor.setRotationPoint(0.0f, (float)llllllllllllIlIllIIIllIllllIIIll, 0.0f);
        this.body = new ModelRenderer(this, ModelCreeper.lllIllIllIlIlI[4], ModelCreeper.lllIllIllIlIlI[4]);
        this.body.addBox(-4.0f, 0.0f, -2.0f, ModelCreeper.lllIllIllIlIlI[2], ModelCreeper.lllIllIllIlIlI[5], ModelCreeper.lllIllIllIlIlI[6], llllllllllllIlIllIIIllIllllIIIIl);
        this.body.setRotationPoint(0.0f, (float)llllllllllllIlIllIIIllIllllIIIll, 0.0f);
        this.leg1 = new ModelRenderer(this, ModelCreeper.lllIllIllIlIlI[1], ModelCreeper.lllIllIllIlIlI[4]);
        this.leg1.addBox(-2.0f, 0.0f, -2.0f, ModelCreeper.lllIllIllIlIlI[6], ModelCreeper.lllIllIllIlIlI[0], ModelCreeper.lllIllIllIlIlI[6], llllllllllllIlIllIIIllIllllIIIIl);
        this.leg1.setRotationPoint(-2.0f, (float)(ModelCreeper.lllIllIllIlIlI[5] + llllllllllllIlIllIIIllIllllIIIll), 4.0f);
        this.leg2 = new ModelRenderer(this, ModelCreeper.lllIllIllIlIlI[1], ModelCreeper.lllIllIllIlIlI[4]);
        this.leg2.addBox(-2.0f, 0.0f, -2.0f, ModelCreeper.lllIllIllIlIlI[6], ModelCreeper.lllIllIllIlIlI[0], ModelCreeper.lllIllIllIlIlI[6], llllllllllllIlIllIIIllIllllIIIIl);
        this.leg2.setRotationPoint(2.0f, (float)(ModelCreeper.lllIllIllIlIlI[5] + llllllllllllIlIllIIIllIllllIIIll), 4.0f);
        this.leg3 = new ModelRenderer(this, ModelCreeper.lllIllIllIlIlI[1], ModelCreeper.lllIllIllIlIlI[4]);
        this.leg3.addBox(-2.0f, 0.0f, -2.0f, ModelCreeper.lllIllIllIlIlI[6], ModelCreeper.lllIllIllIlIlI[0], ModelCreeper.lllIllIllIlIlI[6], llllllllllllIlIllIIIllIllllIIIIl);
        this.leg3.setRotationPoint(-2.0f, (float)(ModelCreeper.lllIllIllIlIlI[5] + llllllllllllIlIllIIIllIllllIIIll), -4.0f);
        this.leg4 = new ModelRenderer(this, ModelCreeper.lllIllIllIlIlI[1], ModelCreeper.lllIllIllIlIlI[4]);
        this.leg4.addBox(-2.0f, 0.0f, -2.0f, ModelCreeper.lllIllIllIlIlI[6], ModelCreeper.lllIllIllIlIlI[0], ModelCreeper.lllIllIllIlIlI[6], llllllllllllIlIllIIIllIllllIIIIl);
        this.leg4.setRotationPoint(2.0f, (float)(ModelCreeper.lllIllIllIlIlI[5] + llllllllllllIlIllIIIllIllllIIIll), -4.0f);
    }
}
