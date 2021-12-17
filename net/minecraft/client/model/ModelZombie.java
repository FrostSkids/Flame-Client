// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;

public class ModelZombie extends ModelBiped
{
    private static final /* synthetic */ int[] lIlIIlIllIlIll;
    
    static {
        lllIIllIlIllIII();
    }
    
    private static void lllIIllIlIllIII() {
        (lIlIIlIllIlIll = new int[3])[0] = ((7 + 173 - 62 + 56 ^ 112 + 133 - 243 + 135) & (35 + 78 - 67 + 91 ^ 69 + 119 - 32 + 18 ^ -" ".length()));
        ModelZombie.lIlIIlIllIlIll[1] = (36 + 7 - 17 + 106 ^ 38 + 37 + 79 + 42);
        ModelZombie.lIlIIlIllIlIll[2] = (0x5 ^ 0x25);
    }
    
    public ModelZombie(final float lllllllllllllIIIllIlIllllllIIlII, final boolean lllllllllllllIIIllIlIllllllIIIII) {
        final float llllllllllllIllIIlIIIlllIIIIIIlI = 0.0f;
        final int llllllllllllIllIIlIIIlllIIIIIIIl = ModelZombie.lIlIIlIllIlIll[1];
        int llllllllllllIllIIlIIIlllIIIIIIII;
        if (lllIIllIlIllIIl(lllllllllllllIIIllIlIllllllIIIII ? 1 : 0)) {
            llllllllllllIllIIlIIIlllIIIIIIII = ModelZombie.lIlIIlIllIlIll[2];
            "".length();
            if (-"  ".length() >= 0) {
                throw null;
            }
        }
        else {
            llllllllllllIllIIlIIIlllIIIIIIII = ModelZombie.lIlIIlIllIlIll[1];
        }
        super(lllllllllllllIIIllIlIllllllIIlII, llllllllllllIllIIlIIIlllIIIIIIlI, llllllllllllIllIIlIIIlllIIIIIIIl, llllllllllllIllIIlIIIlllIIIIIIII);
    }
    
    public ModelZombie() {
        this(0.0f, (boolean)(ModelZombie.lIlIIlIllIlIll[0] != 0));
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIIIllIlIlllllIIlIlI, final float lllllllllllllIIIllIlIlllllIlIIll, final float lllllllllllllIIIllIlIlllllIlIIlI, final float lllllllllllllIIIllIlIlllllIlIIIl, final float lllllllllllllIIIllIlIlllllIlIIII, final float lllllllllllllIIIllIlIlllllIIllll, final Entity lllllllllllllIIIllIlIlllllIIIlII) {
        super.setRotationAngles(lllllllllllllIIIllIlIlllllIIlIlI, lllllllllllllIIIllIlIlllllIlIIll, lllllllllllllIIIllIlIlllllIlIIlI, lllllllllllllIIIllIlIlllllIlIIIl, lllllllllllllIIIllIlIlllllIlIIII, lllllllllllllIIIllIlIlllllIIllll, lllllllllllllIIIllIlIlllllIIIlII);
        final float lllllllllllllIIIllIlIlllllIIllIl = MathHelper.sin(this.swingProgress * 3.1415927f);
        final float lllllllllllllIIIllIlIlllllIIllII = MathHelper.sin((1.0f - (1.0f - this.swingProgress) * (1.0f - this.swingProgress)) * 3.1415927f);
        this.bipedRightArm.rotateAngleZ = 0.0f;
        this.bipedLeftArm.rotateAngleZ = 0.0f;
        this.bipedRightArm.rotateAngleY = -(0.1f - lllllllllllllIIIllIlIlllllIIllIl * 0.6f);
        this.bipedLeftArm.rotateAngleY = 0.1f - lllllllllllllIIIllIlIlllllIIllIl * 0.6f;
        this.bipedRightArm.rotateAngleX = -1.5707964f;
        this.bipedLeftArm.rotateAngleX = -1.5707964f;
        final ModelRenderer bipedRightArm = this.bipedRightArm;
        bipedRightArm.rotateAngleX -= lllllllllllllIIIllIlIlllllIIllIl * 1.2f - lllllllllllllIIIllIlIlllllIIllII * 0.4f;
        final ModelRenderer bipedLeftArm = this.bipedLeftArm;
        bipedLeftArm.rotateAngleX -= lllllllllllllIIIllIlIlllllIIllIl * 1.2f - lllllllllllllIIIllIlIlllllIIllII * 0.4f;
        final ModelRenderer bipedRightArm2 = this.bipedRightArm;
        bipedRightArm2.rotateAngleZ += MathHelper.cos(lllllllllllllIIIllIlIlllllIlIIlI * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedLeftArm2 = this.bipedLeftArm;
        bipedLeftArm2.rotateAngleZ -= MathHelper.cos(lllllllllllllIIIllIlIlllllIlIIlI * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedRightArm3 = this.bipedRightArm;
        bipedRightArm3.rotateAngleX += MathHelper.sin(lllllllllllllIIIllIlIlllllIlIIlI * 0.067f) * 0.05f;
        final ModelRenderer bipedLeftArm3 = this.bipedLeftArm;
        bipedLeftArm3.rotateAngleX -= MathHelper.sin(lllllllllllllIIIllIlIlllllIlIIlI * 0.067f) * 0.05f;
    }
    
    protected ModelZombie(final float lllllllllllllIIIllIlIllllllIllII, final float lllllllllllllIIIllIlIllllllIlIll, final int lllllllllllllIIIllIlIllllllIllll, final int lllllllllllllIIIllIlIllllllIlllI) {
        super(lllllllllllllIIIllIlIllllllIllII, lllllllllllllIIIllIlIllllllIlIll, lllllllllllllIIIllIlIllllllIllll, lllllllllllllIIIllIlIllllllIlllI);
    }
    
    private static boolean lllIIllIlIllIIl(final int lllllllllllllIIIllIlIlllllIIIIII) {
        return lllllllllllllIIIllIlIlllllIIIIII != 0;
    }
}
