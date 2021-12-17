// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLiving;

public class EntityMoveHelper
{
    protected /* synthetic */ double posX;
    protected /* synthetic */ boolean update;
    private static final /* synthetic */ int[] lIIIIIllIllIIl;
    protected /* synthetic */ double posZ;
    protected /* synthetic */ double posY;
    protected /* synthetic */ EntityLiving entity;
    protected /* synthetic */ double speed;
    
    private static int lIllIlllIIlIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public double getSpeed() {
        return this.speed;
    }
    
    private static boolean lIllIlllIIlIllI(final int lllllllllllllIlIIllIlllIllIIlIlI) {
        return lllllllllllllIlIIllIlllIllIIlIlI < 0;
    }
    
    public EntityMoveHelper(final EntityLiving lllllllllllllIlIIllIllllIIIlIlIl) {
        this.entity = lllllllllllllIlIIllIllllIIIlIlIl;
        this.posX = lllllllllllllIlIIllIllllIIIlIlIl.posX;
        this.posY = lllllllllllllIlIIllIllllIIIlIlIl.posY;
        this.posZ = lllllllllllllIlIIllIllllIIIlIlIl.posZ;
    }
    
    private static void lIllIlllIIlIIII() {
        (lIIIIIllIllIIl = new int[2])[0] = " ".length();
        EntityMoveHelper.lIIIIIllIllIIl[1] = ((0x52 ^ 0x17 ^ (0xE ^ 0x51)) & (0x6E ^ 0x3 ^ (0x5F ^ 0x28) ^ -" ".length()));
    }
    
    private static boolean lIllIlllIIlIlIl(final int lllllllllllllIlIIllIlllIllIIlIII) {
        return lllllllllllllIlIIllIlllIllIIlIII > 0;
    }
    
    public void onUpdateMoveHelper() {
        this.entity.setMoveForward(0.0f);
        if (lIllIlllIIlIIll(this.update ? 1 : 0)) {
            this.update = (EntityMoveHelper.lIIIIIllIllIIl[1] != 0);
            final int lllllllllllllIlIIllIlllIllllIlIl = MathHelper.floor_double(this.entity.getEntityBoundingBox().minY + 0.5);
            final double lllllllllllllIlIIllIlllIllllIlII = this.posX - this.entity.posX;
            final double lllllllllllllIlIIllIlllIllllIIll = this.posZ - this.entity.posZ;
            final double lllllllllllllIlIIllIlllIllllIIlI = this.posY - lllllllllllllIlIIllIlllIllllIlIl;
            final double lllllllllllllIlIIllIlllIllllIIIl = lllllllllllllIlIIllIlllIllllIlII * lllllllllllllIlIIllIlllIllllIlII + lllllllllllllIlIIllIlllIllllIIlI * lllllllllllllIlIIllIlllIllllIIlI + lllllllllllllIlIIllIlllIllllIIll * lllllllllllllIlIIllIlllIllllIIll;
            if (lIllIlllIIlIlII(lIllIlllIIlIIIl(lllllllllllllIlIIllIlllIllllIIIl, 2.500000277905201E-7))) {
                final float lllllllllllllIlIIllIlllIllllIIII = (float)(MathHelper.func_181159_b(lllllllllllllIlIIllIlllIllllIIll, lllllllllllllIlIIllIlllIllllIlII) * 180.0 / 3.141592653589793) - 90.0f;
                this.entity.rotationYaw = this.limitAngle(this.entity.rotationYaw, lllllllllllllIlIIllIlllIllllIIII, 30.0f);
                this.entity.setAIMoveSpeed((float)(this.speed * this.entity.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue()));
                if (lIllIlllIIlIlIl(lIllIlllIIlIIIl(lllllllllllllIlIIllIlllIllllIIlI, 0.0)) && lIllIlllIIlIllI(lIllIlllIIlIIlI(lllllllllllllIlIIllIlllIllllIlII * lllllllllllllIlIIllIlllIllllIlII + lllllllllllllIlIIllIlllIllllIIll * lllllllllllllIlIIllIlllIllllIIll, 1.0))) {
                    this.entity.getJumpHelper().setJumping();
                }
            }
        }
    }
    
    public boolean isUpdating() {
        return this.update;
    }
    
    private static boolean lIllIlllIIlIlII(final int lllllllllllllIlIIllIlllIllIIllII) {
        return lllllllllllllIlIIllIlllIllIIllII >= 0;
    }
    
    public void setMoveTo(final double lllllllllllllIlIIllIllllIIIIIllI, final double lllllllllllllIlIIllIllllIIIIIlIl, final double lllllllllllllIlIIllIllllIIIIIlII, final double lllllllllllllIlIIllIllllIIIIIIll) {
        this.posX = lllllllllllllIlIIllIllllIIIIIllI;
        this.posY = lllllllllllllIlIIllIllllIIIIIlIl;
        this.posZ = lllllllllllllIlIIllIllllIIIIIlII;
        this.speed = lllllllllllllIlIIllIllllIIIIIIll;
        this.update = (EntityMoveHelper.lIIIIIllIllIIl[0] != 0);
    }
    
    public double getZ() {
        return this.posZ;
    }
    
    private static boolean lIllIlllIIlIIll(final int lllllllllllllIlIIllIlllIllIIlllI) {
        return lllllllllllllIlIIllIlllIllIIlllI != 0;
    }
    
    private static int lIllIlllIIllIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIllIlllIIlIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIllIlllIIlIIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public double getX() {
        return this.posX;
    }
    
    protected float limitAngle(final float lllllllllllllIlIIllIlllIllIlllIl, final float lllllllllllllIlIIllIlllIllIlllII, final float lllllllllllllIlIIllIlllIllIllIll) {
        float lllllllllllllIlIIllIlllIllIlllll = MathHelper.wrapAngleTo180_float(lllllllllllllIlIIllIlllIllIlllII - lllllllllllllIlIIllIlllIllIlllIl);
        if (lIllIlllIIlIlIl(lIllIlllIIlIlll(lllllllllllllIlIIllIlllIllIlllll, lllllllllllllIlIIllIlllIllIllIll))) {
            lllllllllllllIlIIllIlllIllIlllll = lllllllllllllIlIIllIlllIllIllIll;
        }
        if (lIllIlllIIlIllI(lIllIlllIIllIII(lllllllllllllIlIIllIlllIllIlllll, -lllllllllllllIlIIllIlllIllIllIll))) {
            lllllllllllllIlIIllIlllIllIlllll = -lllllllllllllIlIIllIlllIllIllIll;
        }
        float lllllllllllllIlIIllIlllIllIllllI = lllllllllllllIlIIllIlllIllIlllIl + lllllllllllllIlIIllIlllIllIlllll;
        if (lIllIlllIIlIllI(lIllIlllIIllIII(lllllllllllllIlIIllIlllIllIllllI, 0.0f))) {
            lllllllllllllIlIIllIlllIllIllllI += 360.0f;
            "".length();
            if (-" ".length() >= (0x2 ^ 0x6)) {
                return 0.0f;
            }
        }
        else if (lIllIlllIIlIlIl(lIllIlllIIlIlll(lllllllllllllIlIIllIlllIllIllllI, 360.0f))) {
            lllllllllllllIlIIllIlllIllIllllI -= 360.0f;
        }
        return lllllllllllllIlIIllIlllIllIllllI;
    }
    
    static {
        lIllIlllIIlIIII();
    }
    
    public double getY() {
        return this.posY;
    }
}
