// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityHorse;

public class EntityAIRunAroundLikeCrazy extends EntityAIBase
{
    private static final /* synthetic */ int[] llIlllIIIIIllI;
    private /* synthetic */ double targetY;
    private /* synthetic */ double speed;
    private /* synthetic */ double targetX;
    private /* synthetic */ EntityHorse horseHost;
    private /* synthetic */ double targetZ;
    
    private static boolean lIIllIIIllIlIIlI(final int llllllllllllIllIIlIllIIlllllIllI) {
        return llllllllllllIllIIlIllIIlllllIllI == 0;
    }
    
    private static boolean lIIllIIIllIlIlIl(final int llllllllllllIllIIlIllIIllllllIII) {
        return llllllllllllIllIIlIllIIllllllIII != 0;
    }
    
    @Override
    public void updateTask() {
        if (lIIllIIIllIlIIlI(this.horseHost.getRNG().nextInt(EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[4]))) {
            if (lIIllIIIllIlIlIl((this.horseHost.riddenByEntity instanceof EntityPlayer) ? 1 : 0)) {
                final int llllllllllllIllIIlIllIlIIIIIIllI = this.horseHost.getTemper();
                final int llllllllllllIllIIlIllIlIIIIIIlIl = this.horseHost.getMaxTemper();
                if (lIIllIIIllIlIllI(llllllllllllIllIIlIllIlIIIIIIlIl) && lIIllIIIllIlIlll(this.horseHost.getRNG().nextInt(llllllllllllIllIIlIllIlIIIIIIlIl), llllllllllllIllIIlIllIlIIIIIIllI)) {
                    this.horseHost.setTamedBy((EntityPlayer)this.horseHost.riddenByEntity);
                    "".length();
                    this.horseHost.worldObj.setEntityState(this.horseHost, (byte)EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[5]);
                    return;
                }
                this.horseHost.increaseTemper(EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[1]);
                "".length();
            }
            this.horseHost.riddenByEntity.mountEntity(null);
            this.horseHost.riddenByEntity = null;
            this.horseHost.makeHorseRearWithSound();
            this.horseHost.worldObj.setEntityState(this.horseHost, (byte)EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[6]);
        }
    }
    
    private static boolean lIIllIIIllIlIlII(final Object llllllllllllIllIIlIllIIllllllIlI) {
        return llllllllllllIllIIlIllIIllllllIlI == null;
    }
    
    private static boolean lIIllIIIllIlIllI(final int llllllllllllIllIIlIllIIlllllIlII) {
        return llllllllllllIllIIlIllIIlllllIlII > 0;
    }
    
    private static void lIIllIIIllIlIIIl() {
        (llIlllIIIIIllI = new int[7])[0] = " ".length();
        EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[1] = (0x97 ^ 0x92);
        EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[2] = (0x2A ^ 0x2E);
        EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[3] = ((0x41 ^ 0x4F) & ~(0x5A ^ 0x54));
        EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[4] = (0x4B ^ 0x3B ^ (0x73 ^ 0x31));
        EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[5] = (0xA ^ 0xD);
        EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[6] = (41 + 183 - 192 + 159 ^ 0 + 140 - 58 + 103);
    }
    
    static {
        lIIllIIIllIlIIIl();
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIIllIIIllIlIIlI(this.horseHost.getNavigator().noPath() ? 1 : 0) && lIIllIIIllIlIIll(this.horseHost.riddenByEntity)) {
            return EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[0] != 0;
        }
        return EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[3] != 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (!lIIllIIIllIlIIlI(this.horseHost.isTame() ? 1 : 0) || !lIIllIIIllIlIIll(this.horseHost.riddenByEntity)) {
            return EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[3] != 0;
        }
        final Vec3 llllllllllllIllIIlIllIlIIIIlIIll = RandomPositionGenerator.findRandomTarget(this.horseHost, EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[1], EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[2]);
        if (lIIllIIIllIlIlII(llllllllllllIllIIlIllIlIIIIlIIll)) {
            return EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[3] != 0;
        }
        this.targetX = llllllllllllIllIIlIllIlIIIIlIIll.xCoord;
        this.targetY = llllllllllllIllIIlIllIlIIIIlIIll.yCoord;
        this.targetZ = llllllllllllIllIIlIllIlIIIIlIIll.zCoord;
        return EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[0] != 0;
    }
    
    private static boolean lIIllIIIllIlIIll(final Object llllllllllllIllIIlIllIIlllllllII) {
        return llllllllllllIllIIlIllIIlllllllII != null;
    }
    
    @Override
    public void startExecuting() {
        this.horseHost.getNavigator().tryMoveToXYZ(this.targetX, this.targetY, this.targetZ, this.speed);
        "".length();
    }
    
    private static boolean lIIllIIIllIlIlll(final int llllllllllllIllIIlIllIIlllllllll, final int llllllllllllIllIIlIllIIllllllllI) {
        return llllllllllllIllIIlIllIIlllllllll < llllllllllllIllIIlIllIIllllllllI;
    }
    
    public EntityAIRunAroundLikeCrazy(final EntityHorse llllllllllllIllIIlIllIlIIIIllIII, final double llllllllllllIllIIlIllIlIIIIlIlll) {
        this.horseHost = llllllllllllIllIIlIllIlIIIIllIII;
        this.speed = llllllllllllIllIIlIllIlIIIIlIlll;
        this.setMutexBits(EntityAIRunAroundLikeCrazy.llIlllIIIIIllI[0]);
    }
}
