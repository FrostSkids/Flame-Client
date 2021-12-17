// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

public class ModelSkeleton extends ModelZombie
{
    private static final /* synthetic */ int[] llIllIllllllIl;
    
    private static void lIIllIIIlIlIllIl() {
        (llIllIllllllIl = new int[8])[0] = ((156 + 119 - 164 + 108 ^ 84 + 72 - 145 + 133) & (57 + 149 - 169 + 159 ^ 142 + 3 - 123 + 121 ^ -" ".length()));
        ModelSkeleton.llIllIllllllIl[1] = (0xEE ^ 0x82 ^ (0x94 ^ 0xB8));
        ModelSkeleton.llIllIllllllIl[2] = (((0x1B ^ 0x79) & ~(0x27 ^ 0x45)) ^ (0xBE ^ 0x9E));
        ModelSkeleton.llIllIllllllIl[3] = (150 + 120 - 120 + 5 ^ 35 + 61 + 60 + 23);
        ModelSkeleton.llIllIllllllIl[4] = (0x56 ^ 0x1 ^ (0xCE ^ 0x89));
        ModelSkeleton.llIllIllllllIl[5] = "  ".length();
        ModelSkeleton.llIllIllllllIl[6] = (0xB ^ 0x1 ^ (0x8D ^ 0x8B));
        ModelSkeleton.llIllIllllllIl[7] = " ".length();
    }
    
    static {
        lIIllIIIlIlIllIl();
    }
    
    public ModelSkeleton() {
        this(0.0f, (boolean)(ModelSkeleton.llIllIllllllIl[0] != 0));
    }
    
    @Override
    public void setRotationAngles(final float llllllllllllIllIIlIlllIIlllIIIlI, final float llllllllllllIllIIlIlllIIllIllIIl, final float llllllllllllIllIIlIlllIIllIllIII, final float llllllllllllIllIIlIlllIIllIlllll, final float llllllllllllIllIIlIlllIIllIllllI, final float llllllllllllIllIIlIlllIIllIlllIl, final Entity llllllllllllIllIIlIlllIIllIlllII) {
        super.setRotationAngles(llllllllllllIllIIlIlllIIlllIIIlI, llllllllllllIllIIlIlllIIllIllIIl, llllllllllllIllIIlIlllIIllIllIII, llllllllllllIllIIlIlllIIllIlllll, llllllllllllIllIIlIlllIIllIllllI, llllllllllllIllIIlIlllIIllIlllIl, llllllllllllIllIIlIlllIIllIlllII);
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase llllllllllllIllIIlIlllIIllllIlII, final float llllllllllllIllIIlIlllIIllllIIll, final float llllllllllllIllIIlIlllIIllllIIlI, final float llllllllllllIllIIlIlllIIlllIllII) {
        int aimedBow;
        if (lIIllIIIlIlIllll(((EntitySkeleton)llllllllllllIllIIlIlllIIllllIlII).getSkeletonType(), ModelSkeleton.llIllIllllllIl[7])) {
            aimedBow = ModelSkeleton.llIllIllllllIl[7];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            aimedBow = ModelSkeleton.llIllIllllllIl[0];
        }
        this.aimedBow = (aimedBow != 0);
        super.setLivingAnimations(llllllllllllIllIIlIlllIIllllIlII, llllllllllllIllIIlIlllIIllllIIll, llllllllllllIllIIlIlllIIllllIIlI, llllllllllllIllIIlIlllIIlllIllII);
    }
    
    public ModelSkeleton(final float llllllllllllIllIIlIlllIIllllllll, final boolean llllllllllllIllIIlIlllIIlllllIll) {
        super(llllllllllllIllIIlIlllIIllllllll, 0.0f, ModelSkeleton.llIllIllllllIl[1], ModelSkeleton.llIllIllllllIl[2]);
        if (lIIllIIIlIlIlllI(llllllllllllIllIIlIlllIIlllllIll ? 1 : 0)) {
            this.bipedRightArm = new ModelRenderer(this, ModelSkeleton.llIllIllllllIl[3], ModelSkeleton.llIllIllllllIl[4]);
            this.bipedRightArm.addBox(-1.0f, -2.0f, -1.0f, ModelSkeleton.llIllIllllllIl[5], ModelSkeleton.llIllIllllllIl[6], ModelSkeleton.llIllIllllllIl[5], llllllllllllIllIIlIlllIIllllllll);
            this.bipedRightArm.setRotationPoint(-5.0f, 2.0f, 0.0f);
            this.bipedLeftArm = new ModelRenderer(this, ModelSkeleton.llIllIllllllIl[3], ModelSkeleton.llIllIllllllIl[4]);
            this.bipedLeftArm.mirror = (ModelSkeleton.llIllIllllllIl[7] != 0);
            this.bipedLeftArm.addBox(-1.0f, -2.0f, -1.0f, ModelSkeleton.llIllIllllllIl[5], ModelSkeleton.llIllIllllllIl[6], ModelSkeleton.llIllIllllllIl[5], llllllllllllIllIIlIlllIIllllllll);
            this.bipedLeftArm.setRotationPoint(5.0f, 2.0f, 0.0f);
            this.bipedRightLeg = new ModelRenderer(this, ModelSkeleton.llIllIllllllIl[0], ModelSkeleton.llIllIllllllIl[4]);
            this.bipedRightLeg.addBox(-1.0f, 0.0f, -1.0f, ModelSkeleton.llIllIllllllIl[5], ModelSkeleton.llIllIllllllIl[6], ModelSkeleton.llIllIllllllIl[5], llllllllllllIllIIlIlllIIllllllll);
            this.bipedRightLeg.setRotationPoint(-2.0f, 12.0f, 0.0f);
            this.bipedLeftLeg = new ModelRenderer(this, ModelSkeleton.llIllIllllllIl[0], ModelSkeleton.llIllIllllllIl[4]);
            this.bipedLeftLeg.mirror = (ModelSkeleton.llIllIllllllIl[7] != 0);
            this.bipedLeftLeg.addBox(-1.0f, 0.0f, -1.0f, ModelSkeleton.llIllIllllllIl[5], ModelSkeleton.llIllIllllllIl[6], ModelSkeleton.llIllIllllllIl[5], llllllllllllIllIIlIlllIIllllllll);
            this.bipedLeftLeg.setRotationPoint(2.0f, 12.0f, 0.0f);
        }
    }
    
    private static boolean lIIllIIIlIlIlllI(final int llllllllllllIllIIlIlllIIllIIlllI) {
        return llllllllllllIllIIlIlllIIllIIlllI == 0;
    }
    
    private static boolean lIIllIIIlIlIllll(final int llllllllllllIllIIlIlllIIllIlIIIl, final int llllllllllllIllIIlIlllIIllIlIIII) {
        return llllllllllllIllIIlIlllIIllIlIIIl == llllllllllllIllIIlIlllIIllIlIIII;
    }
}
