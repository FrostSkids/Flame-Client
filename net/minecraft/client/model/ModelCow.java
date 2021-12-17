// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

public class ModelCow extends ModelQuadruped
{
    private static final /* synthetic */ int[] lIlIIIIlIllIII;
    
    public ModelCow() {
        super(ModelCow.lIlIIIIlIllIII[0], 0.0f);
        this.head = new ModelRenderer(this, ModelCow.lIlIIIIlIllIII[1], ModelCow.lIlIIIIlIllIII[1]);
        this.head.addBox(-4.0f, -4.0f, -6.0f, ModelCow.lIlIIIIlIllIII[2], ModelCow.lIlIIIIlIllIII[2], ModelCow.lIlIIIIlIllIII[3], 0.0f);
        this.head.setRotationPoint(0.0f, 4.0f, -8.0f);
        this.head.setTextureOffset(ModelCow.lIlIIIIlIllIII[4], ModelCow.lIlIIIIlIllIII[1]).addBox(-5.0f, -5.0f, -4.0f, ModelCow.lIlIIIIlIllIII[5], ModelCow.lIlIIIIlIllIII[6], ModelCow.lIlIIIIlIllIII[5], 0.0f);
        this.head.setTextureOffset(ModelCow.lIlIIIIlIllIII[4], ModelCow.lIlIIIIlIllIII[1]).addBox(4.0f, -5.0f, -4.0f, ModelCow.lIlIIIIlIllIII[5], ModelCow.lIlIIIIlIllIII[6], ModelCow.lIlIIIIlIllIII[5], 0.0f);
        this.body = new ModelRenderer(this, ModelCow.lIlIIIIlIllIII[7], ModelCow.lIlIIIIlIllIII[8]);
        this.body.addBox(-6.0f, -10.0f, -7.0f, ModelCow.lIlIIIIlIllIII[0], ModelCow.lIlIIIIlIllIII[7], ModelCow.lIlIIIIlIllIII[9], 0.0f);
        this.body.setRotationPoint(0.0f, 5.0f, 2.0f);
        this.body.setTextureOffset(ModelCow.lIlIIIIlIllIII[10], ModelCow.lIlIIIIlIllIII[1]).addBox(-2.0f, 2.0f, -8.0f, ModelCow.lIlIIIIlIllIII[8], ModelCow.lIlIIIIlIllIII[3], ModelCow.lIlIIIIlIllIII[5]);
        "".length();
        final ModelRenderer leg1 = this.leg1;
        --leg1.rotationPointX;
        final ModelRenderer leg2 = this.leg2;
        ++leg2.rotationPointX;
        final ModelRenderer leg3 = this.leg1;
        leg3.rotationPointZ += 0.0f;
        final ModelRenderer leg4 = this.leg2;
        leg4.rotationPointZ += 0.0f;
        final ModelRenderer leg5 = this.leg3;
        --leg5.rotationPointX;
        final ModelRenderer leg6 = this.leg4;
        ++leg6.rotationPointX;
        final ModelRenderer leg7 = this.leg3;
        --leg7.rotationPointZ;
        final ModelRenderer leg8 = this.leg4;
        --leg8.rotationPointZ;
        this.childZOffset += 2.0f;
    }
    
    static {
        lllIIIIlIlllIIl();
    }
    
    private static void lllIIIIlIlllIIl() {
        (lIlIIIIlIllIII = new int[11])[0] = (0x16 ^ 0x1A);
        ModelCow.lIlIIIIlIllIII[1] = ((0x3E ^ 0x6A ^ (0x38 ^ 0x76)) & (0x54 ^ 0x69 ^ (0x50 ^ 0x77) ^ -" ".length()));
        ModelCow.lIlIIIIlIllIII[2] = (0x47 ^ 0x4F);
        ModelCow.lIlIIIIlIllIII[3] = (0x86 ^ 0xAC ^ (0x37 ^ 0x1B));
        ModelCow.lIlIIIIlIllIII[4] = (0x1C ^ 0x57 ^ (0x1E ^ 0x43));
        ModelCow.lIlIIIIlIllIII[5] = " ".length();
        ModelCow.lIlIIIIlIllIII[6] = "   ".length();
        ModelCow.lIlIIIIlIllIII[7] = (0x40 ^ 0x52);
        ModelCow.lIlIIIIlIllIII[8] = (0x47 ^ 0x43);
        ModelCow.lIlIIIIlIllIII[9] = (0x52 ^ 0x58);
        ModelCow.lIlIIIIlIllIII[10] = (0x7E ^ 0x4A);
    }
}
