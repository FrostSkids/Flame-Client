// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLiving;

public class EntityAIOcelotAttack extends EntityAIBase
{
    /* synthetic */ EntityLiving theEntity;
    /* synthetic */ World theWorld;
    /* synthetic */ EntityLivingBase theVictim;
    private static final /* synthetic */ int[] lIlllIllIllIlI;
    /* synthetic */ int attackCountdown;
    
    @Override
    public boolean shouldExecute() {
        final EntityLivingBase llllllllllllIllllIlllIIIIIIIlIIl = this.theEntity.getAttackTarget();
        if (lIIIIIllIlIlIIII(llllllllllllIllllIlllIIIIIIIlIIl)) {
            return EntityAIOcelotAttack.lIlllIllIllIlI[1] != 0;
        }
        this.theVictim = llllllllllllIllllIlllIIIIIIIlIIl;
        return EntityAIOcelotAttack.lIlllIllIllIlI[2] != 0;
    }
    
    private static void lIIIIIllIlIIllll() {
        (lIlllIllIllIlI = new int[4])[0] = "   ".length();
        EntityAIOcelotAttack.lIlllIllIllIlI[1] = ((0x32 ^ 0x66) & ~(0x23 ^ 0x77));
        EntityAIOcelotAttack.lIlllIllIllIlI[2] = " ".length();
        EntityAIOcelotAttack.lIlllIllIllIlI[3] = (0x78 ^ 0x6C);
    }
    
    private static boolean lIIIIIllIlIlIlll(final int llllllllllllIllllIllIllllllIllIl) {
        return llllllllllllIllllIllIllllllIllIl < 0;
    }
    
    private static int lIIIIIllIlIlIIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int lIIIIIllIlIlIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIIIIllIlIlIIII(final Object llllllllllllIllllIllIlllllllIIll) {
        return llllllllllllIllllIllIlllllllIIll == null;
    }
    
    @Override
    public void resetTask() {
        this.theVictim = null;
        this.theEntity.getNavigator().clearPathEntity();
    }
    
    private static boolean lIIIIIllIlIlIIlI(final int llllllllllllIllllIllIllllllIllll) {
        return llllllllllllIllllIllIllllllIllll == 0;
    }
    
    public EntityAIOcelotAttack(final EntityLiving llllllllllllIllllIlllIIIIIIIllll) {
        this.theEntity = llllllllllllIllllIlllIIIIIIIllll;
        this.theWorld = llllllllllllIllllIlllIIIIIIIllll.worldObj;
        this.setMutexBits(EntityAIOcelotAttack.lIlllIllIllIlI[0]);
    }
    
    private static boolean lIIIIIllIlIlIlII(final int llllllllllllIllllIllIlllllllIIIl) {
        return llllllllllllIllllIllIlllllllIIIl != 0;
    }
    
    private static int lIIIIIllIlIlIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIIIllIlIlIIll(final int llllllllllllIllllIllIllllllIlIIl) {
        return llllllllllllIllllIllIllllllIlIIl > 0;
    }
    
    @Override
    public void updateTask() {
        this.theEntity.getLookHelper().setLookPositionWithEntity(this.theVictim, 30.0f, 30.0f);
        final double llllllllllllIllllIllIllllllllIll = this.theEntity.width * 2.0f * this.theEntity.width * 2.0f;
        final double llllllllllllIllllIllIllllllllIlI = this.theEntity.getDistanceSq(this.theVictim.posX, this.theVictim.getEntityBoundingBox().minY, this.theVictim.posZ);
        double llllllllllllIllllIllIllllllllIIl = 0.8;
        if (lIIIIIllIlIlIIll(lIIIIIllIlIlIlIl(llllllllllllIllllIllIllllllllIlI, llllllllllllIllllIllIllllllllIll)) && lIIIIIllIlIlIlll(lIIIIIllIlIlIllI(llllllllllllIllllIllIllllllllIlI, 16.0))) {
            llllllllllllIllllIllIllllllllIIl = 1.33;
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIIIIllIlIlIlll(lIIIIIllIlIlIllI(llllllllllllIllllIllIllllllllIlI, 225.0))) {
            llllllllllllIllllIllIllllllllIIl = 0.6;
        }
        this.theEntity.getNavigator().tryMoveToEntityLiving(this.theVictim, llllllllllllIllllIllIllllllllIIl);
        "".length();
        this.attackCountdown = Math.max(this.attackCountdown - EntityAIOcelotAttack.lIlllIllIllIlI[2], EntityAIOcelotAttack.lIlllIllIllIlI[1]);
        if (lIIIIIllIlIllIII(lIIIIIllIlIlIllI(llllllllllllIllllIllIllllllllIlI, llllllllllllIllllIllIllllllllIll)) && lIIIIIllIlIllIII(this.attackCountdown)) {
            this.attackCountdown = EntityAIOcelotAttack.lIlllIllIllIlI[3];
            this.theEntity.attackEntityAsMob(this.theVictim);
            "".length();
        }
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (lIIIIIllIlIlIIlI(this.theVictim.isEntityAlive() ? 1 : 0)) {
            n = EntityAIOcelotAttack.lIlllIllIllIlI[1];
            "".length();
            if (-" ".length() == " ".length()) {
                return ((0x4A ^ 0x8 ^ (0x1C ^ 0x5B)) & (0x25 ^ 0x4 ^ (0x8F ^ 0xAB) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIIIllIlIlIIll(lIIIIIllIlIlIIIl(this.theEntity.getDistanceSqToEntity(this.theVictim), 225.0))) {
            n = EntityAIOcelotAttack.lIlllIllIllIlI[1];
            "".length();
            if (" ".length() >= "  ".length()) {
                return ((0x74 ^ 0x45) & ~(0x5D ^ 0x6C)) != 0x0;
            }
        }
        else if (lIIIIIllIlIlIlII(this.theEntity.getNavigator().noPath() ? 1 : 0) && lIIIIIllIlIlIIlI(this.shouldExecute() ? 1 : 0)) {
            n = EntityAIOcelotAttack.lIlllIllIllIlI[1];
            "".length();
            if (-" ".length() > 0) {
                return ((0xD3 ^ 0x93) & ~(0x14 ^ 0x54)) != 0x0;
            }
        }
        else {
            n = EntityAIOcelotAttack.lIlllIllIllIlI[2];
        }
        return n != 0;
    }
    
    private static boolean lIIIIIllIlIllIII(final int llllllllllllIllllIllIllllllIlIll) {
        return llllllllllllIllllIllIllllllIlIll <= 0;
    }
    
    static {
        lIIIIIllIlIIllll();
    }
}
