// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.EntityLivingBase;

public class ModelSheep2 extends ModelQuadruped
{
    private /* synthetic */ float headRotationAngleX;
    private static final /* synthetic */ int[] lIllIllllIIlll;
    
    private static void lIIIIIIIIllIllIl() {
        (lIllIllllIIlll = new int[6])[0] = (0x11 ^ 0x1D);
        ModelSheep2.lIllIllllIIlll[1] = ((0x13 ^ 0x31) & ~(0x6F ^ 0x4D));
        ModelSheep2.lIllIllllIIlll[2] = (0x9F ^ 0x99);
        ModelSheep2.lIllIllllIIlll[3] = (147 + 127 - 144 + 23 ^ 16 + 6 - 11 + 134);
        ModelSheep2.lIllIllllIIlll[4] = (0x49 ^ 0x55);
        ModelSheep2.lIllIllllIIlll[5] = (0x14 ^ 0x4);
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase llllllllllllIllllllIIlIIIIIllIll, final float llllllllllllIllllllIIlIIIIIllIlI, final float llllllllllllIllllllIIlIIIIIllIIl, final float llllllllllllIllllllIIlIIIIIlIIll) {
        super.setLivingAnimations(llllllllllllIllllllIIlIIIIIllIll, llllllllllllIllllllIIlIIIIIllIlI, llllllllllllIllllllIIlIIIIIllIIl, llllllllllllIllllllIIlIIIIIlIIll);
        this.head.rotationPointY = 6.0f + ((EntitySheep)llllllllllllIllllllIIlIIIIIllIll).getHeadRotationPointY(llllllllllllIllllllIIlIIIIIlIIll) * 9.0f;
        this.headRotationAngleX = ((EntitySheep)llllllllllllIllllllIIlIIIIIllIll).getHeadRotationAngleX(llllllllllllIllllllIIlIIIIIlIIll);
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIllllllIIlIIIIIIIIIl, final float llllllllllllIllllllIIlIIIIIIIIII, final float llllllllllllIllllllIIlIIIIIIIlll, final float llllllllllllIllllllIIlIIIIIIIllI, final float llllllllllllIllllllIIIllllllllIl, final float llllllllllllIllllllIIIllllllllII, final Entity llllllllllllIllllllIIIlllllllIll) {
        super.setRotationAngles(llllllllllllIllllllIIlIIIIIIIIIl, llllllllllllIllllllIIlIIIIIIIIII, llllllllllllIllllllIIlIIIIIIIlll, llllllllllllIllllllIIlIIIIIIIllI, llllllllllllIllllllIIIllllllllIl, llllllllllllIllllllIIIllllllllII, llllllllllllIllllllIIIlllllllIll);
        this.head.rotateAngleX = this.headRotationAngleX;
    }
    
    static {
        lIIIIIIIIllIllIl();
    }
    
    public ModelSheep2() {
        super(ModelSheep2.lIllIllllIIlll[0], 0.0f);
        this.head = new ModelRenderer(this, ModelSheep2.lIllIllllIIlll[1], ModelSheep2.lIllIllllIIlll[1]);
        this.head.addBox(-3.0f, -4.0f, -6.0f, ModelSheep2.lIllIllllIIlll[2], ModelSheep2.lIllIllllIIlll[2], ModelSheep2.lIllIllllIIlll[3], 0.0f);
        this.head.setRotationPoint(0.0f, 6.0f, -8.0f);
        this.body = new ModelRenderer(this, ModelSheep2.lIllIllllIIlll[4], ModelSheep2.lIllIllllIIlll[3]);
        this.body.addBox(-4.0f, -10.0f, -7.0f, ModelSheep2.lIllIllllIIlll[3], ModelSheep2.lIllIllllIIlll[5], ModelSheep2.lIllIllllIIlll[2], 0.0f);
        this.body.setRotationPoint(0.0f, 5.0f, 2.0f);
    }
}
