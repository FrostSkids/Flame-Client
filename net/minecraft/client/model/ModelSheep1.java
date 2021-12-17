// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.EntityLivingBase;

public class ModelSheep1 extends ModelQuadruped
{
    private static final /* synthetic */ int[] llIlllIIIlllll;
    private /* synthetic */ float headRotationAngleX;
    
    static {
        lIIllIIlIlIIllll();
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase llllllllllllIllIIlIlIIIIIIllllll, final float llllllllllllIllIIlIlIIIIIlIIIIll, final float llllllllllllIllIIlIlIIIIIIllllIl, final float llllllllllllIllIIlIlIIIIIIllllII) {
        super.setLivingAnimations(llllllllllllIllIIlIlIIIIIIllllll, llllllllllllIllIIlIlIIIIIlIIIIll, llllllllllllIllIIlIlIIIIIIllllIl, llllllllllllIllIIlIlIIIIIIllllII);
        this.head.rotationPointY = 6.0f + ((EntitySheep)llllllllllllIllIIlIlIIIIIIllllll).getHeadRotationPointY(llllllllllllIllIIlIlIIIIIIllllII) * 9.0f;
        this.headRotationAngleX = ((EntitySheep)llllllllllllIllIIlIlIIIIIIllllll).getHeadRotationAngleX(llllllllllllIllIIlIlIIIIIIllllII);
    }
    
    private static void lIIllIIlIlIIllll() {
        (llIlllIIIlllll = new int[7])[0] = (0x38 ^ 0x34);
        ModelSheep1.llIlllIIIlllll[1] = ((0xFB ^ 0x80 ^ (0xCF ^ 0x80)) & ("   ".length() ^ (0x0 ^ 0x37) ^ -" ".length()));
        ModelSheep1.llIlllIIIlllll[2] = (55 + 66 - 93 + 114 ^ 87 + 105 - 169 + 113);
        ModelSheep1.llIlllIIIlllll[3] = (60 + 58 - 49 + 64 ^ 49 + 140 - 112 + 76);
        ModelSheep1.llIlllIIIlllll[4] = (120 + 134 - 152 + 38 ^ 38 + 95 - 115 + 114);
        ModelSheep1.llIlllIIIlllll[5] = (0x36 ^ 0x26);
        ModelSheep1.llIlllIIIlllll[6] = (0x57 ^ 0x42 ^ (0xB5 ^ 0xA4));
    }
    
    public ModelSheep1() {
        super(ModelSheep1.llIlllIIIlllll[0], 0.0f);
        this.head = new ModelRenderer(this, ModelSheep1.llIlllIIIlllll[1], ModelSheep1.llIlllIIIlllll[1]);
        this.head.addBox(-3.0f, -4.0f, -4.0f, ModelSheep1.llIlllIIIlllll[2], ModelSheep1.llIlllIIIlllll[2], ModelSheep1.llIlllIIIlllll[2], 0.6f);
        this.head.setRotationPoint(0.0f, 6.0f, -8.0f);
        this.body = new ModelRenderer(this, ModelSheep1.llIlllIIIlllll[3], ModelSheep1.llIlllIIIlllll[4]);
        this.body.addBox(-4.0f, -10.0f, -7.0f, ModelSheep1.llIlllIIIlllll[4], ModelSheep1.llIlllIIIlllll[5], ModelSheep1.llIlllIIIlllll[2], 1.75f);
        this.body.setRotationPoint(0.0f, 5.0f, 2.0f);
        final float llllllllllllIllIIlIlIIIIIlIIllIl = 0.5f;
        this.leg1 = new ModelRenderer(this, ModelSheep1.llIlllIIIlllll[1], ModelSheep1.llIlllIIIlllll[5]);
        this.leg1.addBox(-2.0f, 0.0f, -2.0f, ModelSheep1.llIlllIIIlllll[6], ModelSheep1.llIlllIIIlllll[2], ModelSheep1.llIlllIIIlllll[6], llllllllllllIllIIlIlIIIIIlIIllIl);
        this.leg1.setRotationPoint(-3.0f, 12.0f, 7.0f);
        this.leg2 = new ModelRenderer(this, ModelSheep1.llIlllIIIlllll[1], ModelSheep1.llIlllIIIlllll[5]);
        this.leg2.addBox(-2.0f, 0.0f, -2.0f, ModelSheep1.llIlllIIIlllll[6], ModelSheep1.llIlllIIIlllll[2], ModelSheep1.llIlllIIIlllll[6], llllllllllllIllIIlIlIIIIIlIIllIl);
        this.leg2.setRotationPoint(3.0f, 12.0f, 7.0f);
        this.leg3 = new ModelRenderer(this, ModelSheep1.llIlllIIIlllll[1], ModelSheep1.llIlllIIIlllll[5]);
        this.leg3.addBox(-2.0f, 0.0f, -2.0f, ModelSheep1.llIlllIIIlllll[6], ModelSheep1.llIlllIIIlllll[2], ModelSheep1.llIlllIIIlllll[6], llllllllllllIllIIlIlIIIIIlIIllIl);
        this.leg3.setRotationPoint(-3.0f, 12.0f, -5.0f);
        this.leg4 = new ModelRenderer(this, ModelSheep1.llIlllIIIlllll[1], ModelSheep1.llIlllIIIlllll[5]);
        this.leg4.addBox(-2.0f, 0.0f, -2.0f, ModelSheep1.llIlllIIIlllll[6], ModelSheep1.llIlllIIIlllll[2], ModelSheep1.llIlllIIIlllll[6], llllllllllllIllIIlIlIIIIIlIIllIl);
        this.leg4.setRotationPoint(3.0f, 12.0f, -5.0f);
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIllIIlIlIIIIIIllIIlI, final float llllllllllllIllIIlIlIIIIIIlIlIIl, final float llllllllllllIllIIlIlIIIIIIllIIII, final float llllllllllllIllIIlIlIIIIIIlIIlll, final float llllllllllllIllIIlIlIIIIIIlIIllI, final float llllllllllllIllIIlIlIIIIIIlIIlIl, final Entity llllllllllllIllIIlIlIIIIIIlIIlII) {
        super.setRotationAngles(llllllllllllIllIIlIlIIIIIIllIIlI, llllllllllllIllIIlIlIIIIIIlIlIIl, llllllllllllIllIIlIlIIIIIIllIIII, llllllllllllIllIIlIlIIIIIIlIIlll, llllllllllllIllIIlIlIIIIIIlIIllI, llllllllllllIllIIlIlIIIIIIlIIlIl, llllllllllllIllIIlIlIIIIIIlIIlII);
        this.head.rotateAngleX = this.headRotationAngleX;
    }
}
