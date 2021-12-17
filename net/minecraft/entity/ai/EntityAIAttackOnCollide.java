// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;

public class EntityAIAttackOnCollide extends EntityAIBase
{
    private /* synthetic */ double targetX;
    private static final /* synthetic */ int[] lIllllIllIIIII;
    private /* synthetic */ int delayCounter;
    protected /* synthetic */ EntityCreature attacker;
    /* synthetic */ Class<? extends Entity> classTarget;
    /* synthetic */ boolean longMemory;
    private /* synthetic */ double targetZ;
    /* synthetic */ double speedTowardsTarget;
    /* synthetic */ World worldObj;
    /* synthetic */ PathEntity entityPathEntity;
    /* synthetic */ int attackTick;
    private /* synthetic */ double targetY;
    
    @Override
    public boolean shouldExecute() {
        final EntityLivingBase llllllllllllIllllIlIIIllIllIIlIl = this.attacker.getAttackTarget();
        if (lIIIIlIIlIllIlll(llllllllllllIllllIlIIIllIllIIlIl)) {
            return EntityAIAttackOnCollide.lIllllIllIIIII[1] != 0;
        }
        if (lIIIIlIIlIlllIII(llllllllllllIllllIlIIIllIllIIlIl.isEntityAlive() ? 1 : 0)) {
            return EntityAIAttackOnCollide.lIllllIllIIIII[1] != 0;
        }
        if (lIIIIlIIlIlllIIl(this.classTarget) && lIIIIlIIlIlllIII(this.classTarget.isAssignableFrom(llllllllllllIllllIlIIIllIllIIlIl.getClass()) ? 1 : 0)) {
            return EntityAIAttackOnCollide.lIllllIllIIIII[1] != 0;
        }
        this.entityPathEntity = this.attacker.getNavigator().getPathToEntityLiving(llllllllllllIllllIlIIIllIllIIlIl);
        if (lIIIIlIIlIlllIIl(this.entityPathEntity)) {
            return EntityAIAttackOnCollide.lIllllIllIIIII[2] != 0;
        }
        return EntityAIAttackOnCollide.lIllllIllIIIII[1] != 0;
    }
    
    private static int lIIIIlIIlIllllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    static {
        lIIIIlIIlIllIllI();
    }
    
    public EntityAIAttackOnCollide(final EntityCreature llllllllllllIllllIlIIIllIllIllll, final double llllllllllllIllllIlIIIllIllIlllI, final boolean llllllllllllIllllIlIIIllIllIllIl) {
        this.attacker = llllllllllllIllllIlIIIllIllIllll;
        this.worldObj = llllllllllllIllllIlIIIllIllIllll.worldObj;
        this.speedTowardsTarget = llllllllllllIllllIlIIIllIllIlllI;
        this.longMemory = llllllllllllIllllIlIIIllIllIllIl;
        this.setMutexBits(EntityAIAttackOnCollide.lIllllIllIIIII[0]);
    }
    
    private static int lIIIIlIIlIlllIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public EntityAIAttackOnCollide(final EntityCreature llllllllllllIllllIlIIIllIlllllIl, final Class<? extends Entity> llllllllllllIllllIlIIIllIlllllII, final double llllllllllllIllllIlIIIllIlllIllI, final boolean llllllllllllIllllIlIIIllIllllIlI) {
        this(llllllllllllIllllIlIIIllIlllllIl, llllllllllllIllllIlIIIllIlllIllI, llllllllllllIllllIlIIIllIllllIlI);
        this.classTarget = llllllllllllIllllIlIIIllIlllllII;
    }
    
    private static boolean lIIIIlIIlIlllllI(final int llllllllllllIllllIlIIIllIIlllIIl) {
        return llllllllllllIllllIlIIIllIIlllIIl <= 0;
    }
    
    protected double func_179512_a(final EntityLivingBase llllllllllllIllllIlIIIllIlIIIlIl) {
        return this.attacker.width * 2.0f * this.attacker.width * 2.0f + llllllllllllIllllIlIIIllIlIIIlIl.width;
    }
    
    private static void lIIIIlIIlIllIllI() {
        (lIllllIllIIIII = new int[9])[0] = "   ".length();
        EntityAIAttackOnCollide.lIllllIllIIIII[1] = ((0xA3 ^ 0x9B ^ (0x40 ^ 0x27)) & (70 + 189 - 155 + 139 ^ 116 + 18 - 48 + 86 ^ -" ".length()));
        EntityAIAttackOnCollide.lIllllIllIIIII[2] = " ".length();
        EntityAIAttackOnCollide.lIllllIllIIIII[3] = (0x69 ^ 0x6C ^ " ".length());
        EntityAIAttackOnCollide.lIllllIllIIIII[4] = (0xA ^ 0xD);
        EntityAIAttackOnCollide.lIllllIllIIIII[5] = (0x55 ^ 0x48 ^ (0x44 ^ 0x53));
        EntityAIAttackOnCollide.lIllllIllIIIII[6] = (0xBD ^ 0xB8);
        EntityAIAttackOnCollide.lIllllIllIIIII[7] = (0x4E ^ 0x41);
        EntityAIAttackOnCollide.lIllllIllIIIII[8] = (0xA9 ^ 0xBD);
    }
    
    @Override
    public void startExecuting() {
        this.attacker.getNavigator().setPath(this.entityPathEntity, this.speedTowardsTarget);
        "".length();
        this.delayCounter = EntityAIAttackOnCollide.lIllllIllIIIII[1];
    }
    
    private static boolean lIIIIlIIlIlllIlI(final int llllllllllllIllllIlIIIllIIllllll) {
        return llllllllllllIllllIlIIIllIIllllll != 0;
    }
    
    private static boolean lIIIIlIIlIllIlll(final Object llllllllllllIllllIlIIIllIlIIIIIl) {
        return llllllllllllIllllIlIIIllIlIIIIIl == null;
    }
    
    @Override
    public void resetTask() {
        this.attacker.getNavigator().clearPathEntity();
    }
    
    private static boolean lIIIIlIIlIllllll(final int llllllllllllIllllIlIIIllIIlllIll) {
        return llllllllllllIllllIlIIIllIIlllIll < 0;
    }
    
    private static int lIIIIlIIlIllllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public boolean continueExecuting() {
        final EntityLivingBase llllllllllllIllllIlIIIllIlIlllll = this.attacker.getAttackTarget();
        int withinHomeDistanceFromPosition;
        if (lIIIIlIIlIllIlll(llllllllllllIllllIlIIIllIlIlllll)) {
            withinHomeDistanceFromPosition = EntityAIAttackOnCollide.lIllllIllIIIII[1];
            "".length();
            if (-" ".length() > "  ".length()) {
                return ((52 + 126 - 139 + 151 ^ 46 + 80 - 59 + 100) & (0xB ^ 0x32 ^ (0xAF ^ 0x8F) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIIlIIlIlllIII(llllllllllllIllllIlIIIllIlIlllll.isEntityAlive() ? 1 : 0)) {
            withinHomeDistanceFromPosition = EntityAIAttackOnCollide.lIllllIllIIIII[1];
            "".length();
            if (null != null) {
                return ((0x1E ^ 0x78 ^ (0xF1 ^ 0xB1)) & (0x6A ^ 0x35 ^ (0xF9 ^ 0x80) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIIlIIlIlllIII(this.longMemory ? 1 : 0)) {
            if (lIIIIlIIlIlllIlI(this.attacker.getNavigator().noPath() ? 1 : 0)) {
                withinHomeDistanceFromPosition = EntityAIAttackOnCollide.lIllllIllIIIII[1];
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return ((0x4A ^ 0x12) & ~(0x4 ^ 0x5C)) != 0x0;
                }
            }
            else {
                withinHomeDistanceFromPosition = EntityAIAttackOnCollide.lIllllIllIIIII[2];
                "".length();
                if (null != null) {
                    return ((96 + 179 - 180 + 100 ^ 80 + 20 - 40 + 136) & (0x4A ^ 0x47 ^ (0x9A ^ 0x90) ^ -" ".length())) != 0x0;
                }
            }
        }
        else {
            withinHomeDistanceFromPosition = (this.attacker.isWithinHomeDistanceFromPosition(new BlockPos(llllllllllllIllllIlIIIllIlIlllll)) ? 1 : 0);
        }
        return withinHomeDistanceFromPosition != 0;
    }
    
    @Override
    public void updateTask() {
        final EntityLivingBase llllllllllllIllllIlIIIllIlIlIIIl = this.attacker.getAttackTarget();
        this.attacker.getLookHelper().setLookPositionWithEntity(llllllllllllIllllIlIIIllIlIlIIIl, 30.0f, 30.0f);
        final double llllllllllllIllllIlIIIllIlIlIIII = this.attacker.getDistanceSq(llllllllllllIllllIlIIIllIlIlIIIl.posX, llllllllllllIllllIlIIIllIlIlIIIl.getEntityBoundingBox().minY, llllllllllllIllllIlIIIllIlIlIIIl.posZ);
        final double llllllllllllIllllIlIIIllIlIIllll = this.func_179512_a(llllllllllllIllllIlIIIllIlIlIIIl);
        this.delayCounter -= EntityAIAttackOnCollide.lIllllIllIIIII[2];
        if ((!lIIIIlIIlIlllIII(this.longMemory ? 1 : 0) || lIIIIlIIlIlllIlI(this.attacker.getEntitySenses().canSee(llllllllllllIllllIlIIIllIlIlIIIl) ? 1 : 0)) && lIIIIlIIlIlllllI(this.delayCounter) && ((lIIIIlIIlIlllIII(lIIIIlIIlIlllIll(this.targetX, 0.0)) && lIIIIlIIlIlllIII(lIIIIlIIlIlllIll(this.targetY, 0.0)) && !lIIIIlIIlIlllIlI(lIIIIlIIlIlllIll(this.targetZ, 0.0))) || !lIIIIlIIlIllllll(lIIIIlIIlIlllIll(llllllllllllIllllIlIIIllIlIlIIIl.getDistanceSq(this.targetX, this.targetY, this.targetZ), 1.0)) || lIIIIlIIlIllllll(lIIIIlIIlIllllII(this.attacker.getRNG().nextFloat(), 0.05f)))) {
            this.targetX = llllllllllllIllllIlIIIllIlIlIIIl.posX;
            this.targetY = llllllllllllIllllIlIIIllIlIlIIIl.getEntityBoundingBox().minY;
            this.targetZ = llllllllllllIllllIlIIIllIlIlIIIl.posZ;
            this.delayCounter = EntityAIAttackOnCollide.lIllllIllIIIII[3] + this.attacker.getRNG().nextInt(EntityAIAttackOnCollide.lIllllIllIIIII[4]);
            if (lIIIIlIIllIIIIII(lIIIIlIIlIlllIll(llllllllllllIllllIlIIIllIlIlIIII, 1024.0))) {
                this.delayCounter += EntityAIAttackOnCollide.lIllllIllIIIII[5];
                "".length();
                if ("  ".length() == " ".length()) {
                    return;
                }
            }
            else if (lIIIIlIIllIIIIII(lIIIIlIIlIlllIll(llllllllllllIllllIlIIIllIlIlIIII, 256.0))) {
                this.delayCounter += EntityAIAttackOnCollide.lIllllIllIIIII[6];
            }
            if (lIIIIlIIlIlllIII(this.attacker.getNavigator().tryMoveToEntityLiving(llllllllllllIllllIlIIIllIlIlIIIl, this.speedTowardsTarget) ? 1 : 0)) {
                this.delayCounter += EntityAIAttackOnCollide.lIllllIllIIIII[7];
            }
        }
        this.attackTick = Math.max(this.attackTick - EntityAIAttackOnCollide.lIllllIllIIIII[2], EntityAIAttackOnCollide.lIllllIllIIIII[1]);
        if (lIIIIlIIlIlllllI(lIIIIlIIlIllllIl(llllllllllllIllllIlIIIllIlIlIIII, llllllllllllIllllIlIIIllIlIIllll)) && lIIIIlIIlIlllllI(this.attackTick)) {
            this.attackTick = EntityAIAttackOnCollide.lIllllIllIIIII[8];
            if (lIIIIlIIlIlllIIl(this.attacker.getHeldItem())) {
                this.attacker.swingItem();
            }
            this.attacker.attackEntityAsMob(llllllllllllIllllIlIIIllIlIlIIIl);
            "".length();
        }
    }
    
    private static boolean lIIIIlIIlIlllIII(final int llllllllllllIllllIlIIIllIIllllIl) {
        return llllllllllllIllllIlIIIllIIllllIl == 0;
    }
    
    private static boolean lIIIIlIIllIIIIII(final int llllllllllllIllllIlIIIllIIllIlll) {
        return llllllllllllIllllIlIIIllIIllIlll > 0;
    }
    
    private static boolean lIIIIlIIlIlllIIl(final Object llllllllllllIllllIlIIIllIlIIIIll) {
        return llllllllllllIllllIlIIIllIlIIIIll != null;
    }
}
