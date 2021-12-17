// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.EntityLivingBase;

public class EntityAIOwnerHurtByTarget extends EntityAITarget
{
    /* synthetic */ EntityLivingBase theOwnerAttacker;
    private static final /* synthetic */ int[] llllIIllIlIlI;
    private /* synthetic */ int field_142051_e;
    /* synthetic */ EntityTameable theDefendingTameable;
    
    private static boolean lIlIlIIIlllIlIl(final int lllllllllllllIlIlllIIlIIIIIllIll, final int lllllllllllllIlIlllIIlIIIIIllIlI) {
        return lllllllllllllIlIlllIIlIIIIIllIll != lllllllllllllIlIlllIIlIIIIIllIlI;
    }
    
    private static void lIlIlIIIlllIIlI() {
        (llllIIllIlIlI = new int[2])[0] = ((0x85 ^ 0xB1) & ~(0x83 ^ 0xB7));
        EntityAIOwnerHurtByTarget.llllIIllIlIlI[1] = " ".length();
    }
    
    private static boolean lIlIlIIIlllIIll(final int lllllllllllllIlIlllIIlIIIIIllllI) {
        return lllllllllllllIlIlllIIlIIIIIllllI == 0;
    }
    
    @Override
    public void startExecuting() {
        this.taskOwner.setAttackTarget(this.theOwnerAttacker);
        final EntityLivingBase lllllllllllllIlIlllIIlIIIIlIlIII = this.theDefendingTameable.getOwner();
        if (lIlIlIIIlllIlll(lllllllllllllIlIlllIIlIIIIlIlIII)) {
            this.field_142051_e = lllllllllllllIlIlllIIlIIIIlIlIII.getRevengeTimer();
        }
        super.startExecuting();
    }
    
    public EntityAIOwnerHurtByTarget(final EntityTameable lllllllllllllIlIlllIIlIIIIllIlIl) {
        super(lllllllllllllIlIlllIIlIIIIllIlIl, (boolean)(EntityAIOwnerHurtByTarget.llllIIllIlIlI[0] != 0));
        this.theDefendingTameable = lllllllllllllIlIlllIIlIIIIllIlIl;
        this.setMutexBits(EntityAIOwnerHurtByTarget.llllIIllIlIlI[1]);
    }
    
    private static boolean lIlIlIIIlllIlll(final Object lllllllllllllIlIlllIIlIIIIlIIlII) {
        return lllllllllllllIlIlllIIlIIIIlIIlII != null;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIlIlIIIlllIIll(this.theDefendingTameable.isTamed() ? 1 : 0)) {
            return EntityAIOwnerHurtByTarget.llllIIllIlIlI[0] != 0;
        }
        final EntityLivingBase lllllllllllllIlIlllIIlIIIIllIIII = this.theDefendingTameable.getOwner();
        if (lIlIlIIIlllIlII(lllllllllllllIlIlllIIlIIIIllIIII)) {
            return EntityAIOwnerHurtByTarget.llllIIllIlIlI[0] != 0;
        }
        this.theOwnerAttacker = lllllllllllllIlIlllIIlIIIIllIIII.getAITarget();
        final int lllllllllllllIlIlllIIlIIIIlIllll = lllllllllllllIlIlllIIlIIIIllIIII.getRevengeTimer();
        if (lIlIlIIIlllIlIl(lllllllllllllIlIlllIIlIIIIlIllll, this.field_142051_e) && lIlIlIIIlllIllI(this.isSuitableTarget(this.theOwnerAttacker, (boolean)(EntityAIOwnerHurtByTarget.llllIIllIlIlI[0] != 0)) ? 1 : 0) && lIlIlIIIlllIllI(this.theDefendingTameable.shouldAttackEntity(this.theOwnerAttacker, lllllllllllllIlIlllIIlIIIIllIIII) ? 1 : 0)) {
            return EntityAIOwnerHurtByTarget.llllIIllIlIlI[1] != 0;
        }
        return EntityAIOwnerHurtByTarget.llllIIllIlIlI[0] != 0;
    }
    
    static {
        lIlIlIIIlllIIlI();
    }
    
    private static boolean lIlIlIIIlllIlII(final Object lllllllllllllIlIlllIIlIIIIlIIIlI) {
        return lllllllllllllIlIlllIIlIIIIlIIIlI == null;
    }
    
    private static boolean lIlIlIIIlllIllI(final int lllllllllllllIlIlllIIlIIIIlIIIII) {
        return lllllllllllllIlIlllIIlIIIIlIIIII != 0;
    }
}
