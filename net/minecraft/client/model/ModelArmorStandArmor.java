// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.Entity;

public class ModelArmorStandArmor extends ModelBiped
{
    private static final /* synthetic */ int[] lllllIlIllIIl;
    
    public ModelArmorStandArmor(final float lllllllllllllIlIlIllIlIlIIIllIlI) {
        this(lllllllllllllIlIlIllIlIlIIIllIlI, ModelArmorStandArmor.lllllIlIllIIl[0], ModelArmorStandArmor.lllllIlIllIIl[1]);
    }
    
    private static boolean lIlIlllIllIIIIl(final int lllllllllllllIlIlIllIlIIllllllIl) {
        return lllllllllllllIlIlIllIlIIllllllIl != 0;
    }
    
    public ModelArmorStandArmor() {
        this(0.0f);
    }
    
    protected ModelArmorStandArmor(final float lllllllllllllIlIlIllIlIlIIIlIlII, final int lllllllllllllIlIlIllIlIlIIIIllll, final int lllllllllllllIlIlIllIlIlIIIIlllI) {
        super(lllllllllllllIlIlIllIlIlIIIlIlII, 0.0f, lllllllllllllIlIlIllIlIlIIIIllll, lllllllllllllIlIlIllIlIlIIIIlllI);
    }
    
    static {
        lIlIlllIllIIIII();
    }
    
    @Override
    public void setRotationAngles(final float lllllllllllllIlIlIllIlIlIIIIlIIl, final float lllllllllllllIlIlIllIlIlIIIIlIII, final float lllllllllllllIlIlIllIlIlIIIIIlll, final float lllllllllllllIlIlIllIlIlIIIIIllI, final float lllllllllllllIlIlIllIlIlIIIIIlIl, final float lllllllllllllIlIlIllIlIlIIIIIlII, final Entity lllllllllllllIlIlIllIlIlIIIIIIII) {
        if (lIlIlllIllIIIIl((lllllllllllllIlIlIllIlIlIIIIIIII instanceof EntityArmorStand) ? 1 : 0)) {
            final EntityArmorStand lllllllllllllIlIlIllIlIlIIIIIIlI = (EntityArmorStand)lllllllllllllIlIlIllIlIlIIIIIIII;
            this.bipedHead.rotateAngleX = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getHeadRotation().getX();
            this.bipedHead.rotateAngleY = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getHeadRotation().getY();
            this.bipedHead.rotateAngleZ = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getHeadRotation().getZ();
            this.bipedHead.setRotationPoint(0.0f, 1.0f, 0.0f);
            this.bipedBody.rotateAngleX = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getBodyRotation().getX();
            this.bipedBody.rotateAngleY = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getBodyRotation().getY();
            this.bipedBody.rotateAngleZ = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getBodyRotation().getZ();
            this.bipedLeftArm.rotateAngleX = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getLeftArmRotation().getX();
            this.bipedLeftArm.rotateAngleY = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getLeftArmRotation().getY();
            this.bipedLeftArm.rotateAngleZ = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getLeftArmRotation().getZ();
            this.bipedRightArm.rotateAngleX = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getRightArmRotation().getX();
            this.bipedRightArm.rotateAngleY = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getRightArmRotation().getY();
            this.bipedRightArm.rotateAngleZ = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getRightArmRotation().getZ();
            this.bipedLeftLeg.rotateAngleX = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getLeftLegRotation().getX();
            this.bipedLeftLeg.rotateAngleY = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getLeftLegRotation().getY();
            this.bipedLeftLeg.rotateAngleZ = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getLeftLegRotation().getZ();
            this.bipedLeftLeg.setRotationPoint(1.9f, 11.0f, 0.0f);
            this.bipedRightLeg.rotateAngleX = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getRightLegRotation().getX();
            this.bipedRightLeg.rotateAngleY = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getRightLegRotation().getY();
            this.bipedRightLeg.rotateAngleZ = 0.017453292f * lllllllllllllIlIlIllIlIlIIIIIIlI.getRightLegRotation().getZ();
            this.bipedRightLeg.setRotationPoint(-1.9f, 11.0f, 0.0f);
            ModelBase.copyModelAngles(this.bipedHead, this.bipedHeadwear);
        }
    }
    
    private static void lIlIlllIllIIIII() {
        (lllllIlIllIIl = new int[2])[0] = (13 + 79 - 8 + 48 ^ 184 + 2 - 61 + 71);
        ModelArmorStandArmor.lllllIlIllIIl[1] = (0x22 ^ 0x2);
    }
}
