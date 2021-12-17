// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class EntityLookHelper
{
    private /* synthetic */ float deltaLookYaw;
    private /* synthetic */ double posX;
    private /* synthetic */ EntityLiving entity;
    private static final /* synthetic */ int[] lllllIlllIIlI;
    private /* synthetic */ double posY;
    private /* synthetic */ double posZ;
    private /* synthetic */ float deltaLookPitch;
    private /* synthetic */ boolean isLooking;
    
    public boolean getIsLooking() {
        return this.isLooking;
    }
    
    private static void lIlIllllIIIlIlI() {
        (lllllIlllIIlI = new int[2])[0] = " ".length();
        EntityLookHelper.lllllIlllIIlI[1] = ((0x85 ^ 0x8F) & ~(0x9D ^ 0x97));
    }
    
    public double getLookPosY() {
        return this.posY;
    }
    
    private static boolean lIlIllllIIIlllI(final int lllllllllllllIlIlIllIIlIIllIlllI) {
        return lllllllllllllIlIlIllIIlIIllIlllI == 0;
    }
    
    private static boolean lIlIllllIIlIIII(final int lllllllllllllIlIlIllIIlIIllIlIlI) {
        return lllllllllllllIlIlIllIIlIIllIlIlI > 0;
    }
    
    public void setLookPositionWithEntity(final Entity lllllllllllllIlIlIllIIlIlIlllIII, final float lllllllllllllIlIlIllIIlIlIlllIll, final float lllllllllllllIlIlIllIIlIlIlllIlI) {
        this.posX = lllllllllllllIlIlIllIIlIlIlllIII.posX;
        if (lIlIllllIIIlIll((lllllllllllllIlIlIllIIlIlIlllIII instanceof EntityLivingBase) ? 1 : 0)) {
            this.posY = lllllllllllllIlIlIllIIlIlIlllIII.posY + lllllllllllllIlIlIllIIlIlIlllIII.getEyeHeight();
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        else {
            this.posY = (lllllllllllllIlIlIllIIlIlIlllIII.getEntityBoundingBox().minY + lllllllllllllIlIlIllIIlIlIlllIII.getEntityBoundingBox().maxY) / 2.0;
        }
        this.posZ = lllllllllllllIlIlIllIIlIlIlllIII.posZ;
        this.deltaLookYaw = lllllllllllllIlIlIllIIlIlIlllIll;
        this.deltaLookPitch = lllllllllllllIlIlIllIIlIlIlllIlI;
        this.isLooking = (EntityLookHelper.lllllIlllIIlI[0] != 0);
    }
    
    public EntityLookHelper(final EntityLiving lllllllllllllIlIlIllIIlIllIIIIlI) {
        this.entity = lllllllllllllIlIlIllIIlIllIIIIlI;
    }
    
    public double getLookPosX() {
        return this.posX;
    }
    
    private static int lIlIllllIIlIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIlIllllIIIllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIlIllllIIIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private float updateRotation(final float lllllllllllllIlIlIllIIlIlIIIlIII, final float lllllllllllllIlIlIllIIlIlIIIIlll, final float lllllllllllllIlIlIllIIlIlIIIIIlI) {
        float lllllllllllllIlIlIllIIlIlIIIIlIl = MathHelper.wrapAngleTo180_float(lllllllllllllIlIlIllIIlIlIIIIlll - lllllllllllllIlIlIllIIlIlIIIlIII);
        if (lIlIllllIIlIIII(lIlIllllIIlIIIl(lllllllllllllIlIlIllIIlIlIIIIlIl, lllllllllllllIlIlIllIIlIlIIIIIlI))) {
            lllllllllllllIlIlIllIIlIlIIIIlIl = lllllllllllllIlIlIllIIlIlIIIIIlI;
        }
        if (lIlIllllIIIllll(lIlIllllIIlIIlI(lllllllllllllIlIlIllIIlIlIIIIlIl, -lllllllllllllIlIlIllIIlIlIIIIIlI))) {
            lllllllllllllIlIlIllIIlIlIIIIlIl = -lllllllllllllIlIlIllIIlIlIIIIIlI;
        }
        return lllllllllllllIlIlIllIIlIlIIIlIII + lllllllllllllIlIlIllIIlIlIIIIlIl;
    }
    
    public void setLookPosition(final double lllllllllllllIlIlIllIIlIlIlIlllI, final double lllllllllllllIlIlIllIIlIlIlIllIl, final double lllllllllllllIlIlIllIIlIlIlIllII, final float lllllllllllllIlIlIllIIlIlIlIIlIl, final float lllllllllllllIlIlIllIIlIlIlIlIlI) {
        this.posX = lllllllllllllIlIlIllIIlIlIlIlllI;
        this.posY = lllllllllllllIlIlIllIIlIlIlIllIl;
        this.posZ = lllllllllllllIlIlIllIIlIlIlIllII;
        this.deltaLookYaw = lllllllllllllIlIlIllIIlIlIlIIlIl;
        this.deltaLookPitch = lllllllllllllIlIlIllIIlIlIlIlIlI;
        this.isLooking = (EntityLookHelper.lllllIlllIIlI[0] != 0);
    }
    
    static {
        lIlIllllIIIlIlI();
    }
    
    private static boolean lIlIllllIIIllll(final int lllllllllllllIlIlIllIIlIIllIllII) {
        return lllllllllllllIlIlIllIIlIIllIllII < 0;
    }
    
    private static int lIlIllllIIlIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public double getLookPosZ() {
        return this.posZ;
    }
    
    public void onUpdateLook() {
        this.entity.rotationPitch = 0.0f;
        if (lIlIllllIIIlIll(this.isLooking ? 1 : 0)) {
            this.isLooking = (EntityLookHelper.lllllIlllIIlI[1] != 0);
            final double lllllllllllllIlIlIllIIlIlIIllIll = this.posX - this.entity.posX;
            final double lllllllllllllIlIlIllIIlIlIIllIlI = this.posY - (this.entity.posY + this.entity.getEyeHeight());
            final double lllllllllllllIlIlIllIIlIlIIllIIl = this.posZ - this.entity.posZ;
            final double lllllllllllllIlIlIllIIlIlIIllIII = MathHelper.sqrt_double(lllllllllllllIlIlIllIIlIlIIllIll * lllllllllllllIlIlIllIIlIlIIllIll + lllllllllllllIlIlIllIIlIlIIllIIl * lllllllllllllIlIlIllIIlIlIIllIIl);
            final float lllllllllllllIlIlIllIIlIlIIlIlll = (float)(MathHelper.func_181159_b(lllllllllllllIlIlIllIIlIlIIllIIl, lllllllllllllIlIlIllIIlIlIIllIll) * 180.0 / 3.141592653589793) - 90.0f;
            final float lllllllllllllIlIlIllIIlIlIIlIllI = (float)(-(MathHelper.func_181159_b(lllllllllllllIlIlIllIIlIlIIllIlI, lllllllllllllIlIlIllIIlIlIIllIII) * 180.0 / 3.141592653589793));
            this.entity.rotationPitch = this.updateRotation(this.entity.rotationPitch, lllllllllllllIlIlIllIIlIlIIlIllI, this.deltaLookPitch);
            this.entity.rotationYawHead = this.updateRotation(this.entity.rotationYawHead, lllllllllllllIlIlIllIIlIlIIlIlll, this.deltaLookYaw);
            "".length();
            if ((79 + 20 - 79 + 121 ^ 96 + 18 - 82 + 105) < 0) {
                return;
            }
        }
        else {
            this.entity.rotationYawHead = this.updateRotation(this.entity.rotationYawHead, this.entity.renderYawOffset, 10.0f);
        }
        final float lllllllllllllIlIlIllIIlIlIIlIlIl = MathHelper.wrapAngleTo180_float(this.entity.rotationYawHead - this.entity.renderYawOffset);
        if (lIlIllllIIIlllI(this.entity.getNavigator().noPath() ? 1 : 0)) {
            if (lIlIllllIIIllll(lIlIllllIIIllII(lllllllllllllIlIlIllIIlIlIIlIlIl, -75.0f))) {
                this.entity.rotationYawHead = this.entity.renderYawOffset - 75.0f;
            }
            if (lIlIllllIIlIIII(lIlIllllIIIllIl(lllllllllllllIlIlIllIIlIlIIlIlIl, 75.0f))) {
                this.entity.rotationYawHead = this.entity.renderYawOffset + 75.0f;
            }
        }
    }
    
    private static boolean lIlIllllIIIlIll(final int lllllllllllllIlIlIllIIlIIlllIIII) {
        return lllllllllllllIlIlIllIIlIIlllIIII != 0;
    }
}
