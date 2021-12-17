// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.util.Vec3;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityCreature;

public class EntityAIMoveTowardsTarget extends EntityAIBase
{
    private /* synthetic */ double movePosX;
    private /* synthetic */ EntityCreature theEntity;
    private /* synthetic */ float maxTargetDistance;
    private /* synthetic */ double speed;
    private /* synthetic */ EntityLivingBase targetEntity;
    private /* synthetic */ double movePosZ;
    private static final /* synthetic */ int[] lIIlIIlIllIlII;
    private /* synthetic */ double movePosY;
    
    @Override
    public boolean continueExecuting() {
        if (llIIllIlIllIIIl(this.theEntity.getNavigator().noPath() ? 1 : 0) && llIIllIlIllIIlI(this.targetEntity.isEntityAlive() ? 1 : 0) && llIIllIlIllIIll(llIIllIlIllIIII(this.targetEntity.getDistanceSqToEntity(this.theEntity), this.maxTargetDistance * this.maxTargetDistance))) {
            return EntityAIMoveTowardsTarget.lIIlIIlIllIlII[0] != 0;
        }
        return EntityAIMoveTowardsTarget.lIIlIIlIllIlII[1] != 0;
    }
    
    @Override
    public void resetTask() {
        this.targetEntity = null;
    }
    
    private static boolean llIIllIlIllIIlI(final int lllllllllllllIIllIlllIIIlIlIIIlI) {
        return lllllllllllllIIllIlllIIIlIlIIIlI != 0;
    }
    
    public EntityAIMoveTowardsTarget(final EntityCreature lllllllllllllIIllIlllIIIlIlllIll, final double lllllllllllllIIllIlllIIIlIlllIlI, final float lllllllllllllIIllIlllIIIlIllIlIl) {
        this.theEntity = lllllllllllllIIllIlllIIIlIlllIll;
        this.speed = lllllllllllllIIllIlllIIIlIlllIlI;
        this.maxTargetDistance = lllllllllllllIIllIlllIIIlIllIlIl;
        this.setMutexBits(EntityAIMoveTowardsTarget.lIIlIIlIllIlII[0]);
    }
    
    @Override
    public boolean shouldExecute() {
        this.targetEntity = this.theEntity.getAttackTarget();
        if (llIIllIlIlIlllI(this.targetEntity)) {
            return EntityAIMoveTowardsTarget.lIIlIIlIllIlII[1] != 0;
        }
        if (llIIllIlIlIllll(llIIllIlIlIllIl(this.targetEntity.getDistanceSqToEntity(this.theEntity), this.maxTargetDistance * this.maxTargetDistance))) {
            return EntityAIMoveTowardsTarget.lIIlIIlIllIlII[1] != 0;
        }
        final Vec3 lllllllllllllIIllIlllIIIlIllIIIl = RandomPositionGenerator.findRandomTargetBlockTowards(this.theEntity, EntityAIMoveTowardsTarget.lIIlIIlIllIlII[2], EntityAIMoveTowardsTarget.lIIlIIlIllIlII[3], new Vec3(this.targetEntity.posX, this.targetEntity.posY, this.targetEntity.posZ));
        if (llIIllIlIlIlllI(lllllllllllllIIllIlllIIIlIllIIIl)) {
            return EntityAIMoveTowardsTarget.lIIlIIlIllIlII[1] != 0;
        }
        this.movePosX = lllllllllllllIIllIlllIIIlIllIIIl.xCoord;
        this.movePosY = lllllllllllllIIllIlllIIIlIllIIIl.yCoord;
        this.movePosZ = lllllllllllllIIllIlllIIIlIllIIIl.zCoord;
        return EntityAIMoveTowardsTarget.lIIlIIlIllIlII[0] != 0;
    }
    
    private static int llIIllIlIllIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIIllIlIllIIll(final int lllllllllllllIIllIlllIIIlIIllllI) {
        return lllllllllllllIIllIlllIIIlIIllllI < 0;
    }
    
    private static int llIIllIlIlIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void startExecuting() {
        this.theEntity.getNavigator().tryMoveToXYZ(this.movePosX, this.movePosY, this.movePosZ, this.speed);
        "".length();
    }
    
    private static boolean llIIllIlIlIlllI(final Object lllllllllllllIIllIlllIIIlIlIIlII) {
        return lllllllllllllIIllIlllIIIlIlIIlII == null;
    }
    
    private static boolean llIIllIlIllIIIl(final int lllllllllllllIIllIlllIIIlIlIIIII) {
        return lllllllllllllIIllIlllIIIlIlIIIII == 0;
    }
    
    private static void llIIllIlIlIllII() {
        (lIIlIIlIllIlII = new int[4])[0] = " ".length();
        EntityAIMoveTowardsTarget.lIIlIIlIllIlII[1] = ((" ".length() ^ (0x86 ^ 0x97)) & (0xB2 ^ 0xC2 ^ (0x5B ^ 0x3B) ^ -" ".length()));
        EntityAIMoveTowardsTarget.lIIlIIlIllIlII[2] = (0x42 ^ 0x52);
        EntityAIMoveTowardsTarget.lIIlIIlIllIlII[3] = (0x8C ^ 0x8B);
    }
    
    static {
        llIIllIlIlIllII();
    }
    
    private static boolean llIIllIlIlIllll(final int lllllllllllllIIllIlllIIIlIIlllII) {
        return lllllllllllllIIllIlllIIIlIIlllII > 0;
    }
}
