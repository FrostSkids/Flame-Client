// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelZombieVillager extends ModelBiped
{
    private static final /* synthetic */ int[] lIlIllllIllIIl;
    
    private static void llllIlIIllIllII() {
        (lIlIllllIllIIl = new int[8])[0] = ((0x20 ^ 0x3A) & ~(0x98 ^ 0x82));
        ModelZombieVillager.lIlIllllIllIIl[1] = (0x85 ^ 0xA9 ^ (0xF0 ^ 0x9C));
        ModelZombieVillager.lIlIllllIllIIl[2] = (85 + 53 - 3 + 4 ^ 8 + 77 - 32 + 118);
        ModelZombieVillager.lIlIllllIllIIl[3] = (0x34 ^ 0x3C);
        ModelZombieVillager.lIlIllllIllIIl[4] = (24 + 192 - 26 + 14 ^ 10 + 32 + 88 + 68);
        ModelZombieVillager.lIlIllllIllIIl[5] = (0x5D ^ 0x4E ^ (0x3D ^ 0x36));
        ModelZombieVillager.lIlIllllIllIIl[6] = "  ".length();
        ModelZombieVillager.lIlIllllIllIIl[7] = (61 + 113 - 125 + 92 ^ 107 + 87 - 164 + 107);
    }
    
    private static boolean llllIlIIllIlllI(final int lllllllllllllIIIIlIlIIIlIIIlllll) {
        return lllllllllllllIIIIlIlIIIlIIIlllll != 0;
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIIIlIlIIIlIIlIlIIl, final float lllllllllllllIIIIlIlIIIlIIlIlIII, final float lllllllllllllIIIIlIlIIIlIIlIIlll, final float lllllllllllllIIIIlIlIIIlIIlIIllI, final float lllllllllllllIIIIlIlIIIlIIlIIlIl, final float lllllllllllllIIIIlIlIIIlIIlIlllI, final Entity lllllllllllllIIIIlIlIIIlIIlIllIl) {
        super.setRotationAngles(lllllllllllllIIIIlIlIIIlIIlIlIIl, lllllllllllllIIIIlIlIIIlIIlIlIII, lllllllllllllIIIIlIlIIIlIIlIIlll, lllllllllllllIIIIlIlIIIlIIlIIllI, lllllllllllllIIIIlIlIIIlIIlIIlIl, lllllllllllllIIIIlIlIIIlIIlIlllI, lllllllllllllIIIIlIlIIIlIIlIllIl);
        final float lllllllllllllIIIIlIlIIIlIIlIllII = MathHelper.sin(this.swingProgress * 3.1415927f);
        final float lllllllllllllIIIIlIlIIIlIIlIlIll = MathHelper.sin((1.0f - (1.0f - this.swingProgress) * (1.0f - this.swingProgress)) * 3.1415927f);
        this.bipedRightArm.rotateAngleZ = 0.0f;
        this.bipedLeftArm.rotateAngleZ = 0.0f;
        this.bipedRightArm.rotateAngleY = -(0.1f - lllllllllllllIIIIlIlIIIlIIlIllII * 0.6f);
        this.bipedLeftArm.rotateAngleY = 0.1f - lllllllllllllIIIIlIlIIIlIIlIllII * 0.6f;
        this.bipedRightArm.rotateAngleX = -1.5707964f;
        this.bipedLeftArm.rotateAngleX = -1.5707964f;
        final ModelRenderer bipedRightArm = this.bipedRightArm;
        bipedRightArm.rotateAngleX -= lllllllllllllIIIIlIlIIIlIIlIllII * 1.2f - lllllllllllllIIIIlIlIIIlIIlIlIll * 0.4f;
        final ModelRenderer bipedLeftArm = this.bipedLeftArm;
        bipedLeftArm.rotateAngleX -= lllllllllllllIIIIlIlIIIlIIlIllII * 1.2f - lllllllllllllIIIIlIlIIIlIIlIlIll * 0.4f;
        final ModelRenderer bipedRightArm2 = this.bipedRightArm;
        bipedRightArm2.rotateAngleZ += MathHelper.cos(lllllllllllllIIIIlIlIIIlIIlIIlll * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedLeftArm2 = this.bipedLeftArm;
        bipedLeftArm2.rotateAngleZ -= MathHelper.cos(lllllllllllllIIIIlIlIIIlIIlIIlll * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedRightArm3 = this.bipedRightArm;
        bipedRightArm3.rotateAngleX += MathHelper.sin(lllllllllllllIIIIlIlIIIlIIlIIlll * 0.067f) * 0.05f;
        final ModelRenderer bipedLeftArm3 = this.bipedLeftArm;
        bipedLeftArm3.rotateAngleX -= MathHelper.sin(lllllllllllllIIIIlIlIIIlIIlIIlll * 0.067f) * 0.05f;
    }
    
    static {
        llllIlIIllIllII();
    }
    
    public ModelZombieVillager(final float lllllllllllllIIIIlIlIIIlIlIIIlIl, final float lllllllllllllIIIIlIlIIIlIlIIIIII, final boolean lllllllllllllIIIIlIlIIIlIIllllll) {
        final float llllllllllllIllIIlIIIlllIIIIIIlI = 0.0f;
        final int llllllllllllIllIIlIIIlllIIIIIIIl = ModelZombieVillager.lIlIllllIllIIl[1];
        int llllllllllllIllIIlIIIlllIIIIIIII;
        if (llllIlIIllIlllI(lllllllllllllIIIIlIlIIIlIIllllll ? 1 : 0)) {
            llllllllllllIllIIlIIIlllIIIIIIII = ModelZombieVillager.lIlIllllIllIIl[2];
            "".length();
            if ("  ".length() < 0) {
                throw null;
            }
        }
        else {
            llllllllllllIllIIlIIIlllIIIIIIII = ModelZombieVillager.lIlIllllIllIIl[1];
        }
        super(lllllllllllllIIIIlIlIIIlIlIIIlIl, llllllllllllIllIIlIIIlllIIIIIIlI, llllllllllllIllIIlIIIlllIIIIIIIl, llllllllllllIllIIlIIIlllIIIIIIII);
        if (llllIlIIllIlllI(lllllllllllllIIIIlIlIIIlIIllllll ? 1 : 0)) {
            this.bipedHead = new ModelRenderer(this, ModelZombieVillager.lIlIllllIllIIl[0], ModelZombieVillager.lIlIllllIllIIl[0]);
            this.bipedHead.addBox(-4.0f, -10.0f, -4.0f, ModelZombieVillager.lIlIllllIllIIl[3], ModelZombieVillager.lIlIllllIllIIl[3], ModelZombieVillager.lIlIllllIllIIl[3], lllllllllllllIIIIlIlIIIlIlIIIlIl);
            this.bipedHead.setRotationPoint(0.0f, 0.0f + lllllllllllllIIIIlIlIIIlIlIIIIII, 0.0f);
            "".length();
            if (-(0x11 ^ 0x68 ^ (0x2B ^ 0x56)) >= 0) {
                throw null;
            }
        }
        else {
            this.bipedHead = new ModelRenderer(this);
            this.bipedHead.setRotationPoint(0.0f, 0.0f + lllllllllllllIIIIlIlIIIlIlIIIIII, 0.0f);
            this.bipedHead.setTextureOffset(ModelZombieVillager.lIlIllllIllIIl[0], ModelZombieVillager.lIlIllllIllIIl[2]).addBox(-4.0f, -10.0f, -4.0f, ModelZombieVillager.lIlIllllIllIIl[3], ModelZombieVillager.lIlIllllIllIIl[4], ModelZombieVillager.lIlIllllIllIIl[3], lllllllllllllIIIIlIlIIIlIlIIIlIl);
            this.bipedHead.setTextureOffset(ModelZombieVillager.lIlIllllIllIIl[5], ModelZombieVillager.lIlIllllIllIIl[2]).addBox(-1.0f, -3.0f, -6.0f, ModelZombieVillager.lIlIllllIllIIl[6], ModelZombieVillager.lIlIllllIllIIl[7], ModelZombieVillager.lIlIllllIllIIl[6], lllllllllllllIIIIlIlIIIlIlIIIlIl);
        }
    }
    
    public ModelZombieVillager() {
        this(0.0f, 0.0f, (boolean)(ModelZombieVillager.lIlIllllIllIIl[0] != 0));
    }
}
