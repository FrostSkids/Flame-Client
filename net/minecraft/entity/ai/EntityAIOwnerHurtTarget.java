// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityTameable;

public class EntityAIOwnerHurtTarget extends EntityAITarget
{
    private static final /* synthetic */ int[] lIIlllllIIIlIl;
    private /* synthetic */ int field_142050_e;
    /* synthetic */ EntityTameable theEntityTameable;
    /* synthetic */ EntityLivingBase theTarget;
    
    private static boolean llIllllIIlllIll(final int lllllllllllllIIlIIlIIlIlIIlllllI, final int lllllllllllllIIlIIlIIlIlIIllllIl) {
        return lllllllllllllIIlIIlIIlIlIIlllllI != lllllllllllllIIlIIlIIlIlIIllllIl;
    }
    
    private static boolean llIllllIIlllIlI(final Object lllllllllllllIIlIIlIIlIlIlIIIlIl) {
        return lllllllllllllIIlIIlIIlIlIlIIIlIl == null;
    }
    
    private static boolean llIllllIIllllII(final int lllllllllllllIIlIIlIIlIlIlIIIIll) {
        return lllllllllllllIIlIIlIIlIlIlIIIIll != 0;
    }
    
    static {
        llIllllIIlllIII();
    }
    
    private static boolean llIllllIIlllIIl(final int lllllllllllllIIlIIlIIlIlIlIIIIIl) {
        return lllllllllllllIIlIIlIIlIlIlIIIIIl == 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (llIllllIIlllIIl(this.theEntityTameable.isTamed() ? 1 : 0)) {
            return EntityAIOwnerHurtTarget.lIIlllllIIIlIl[0] != 0;
        }
        final EntityLivingBase lllllllllllllIIlIIlIIlIlIlIlIIll = this.theEntityTameable.getOwner();
        if (llIllllIIlllIlI(lllllllllllllIIlIIlIIlIlIlIlIIll)) {
            return EntityAIOwnerHurtTarget.lIIlllllIIIlIl[0] != 0;
        }
        this.theTarget = lllllllllllllIIlIIlIIlIlIlIlIIll.getLastAttacker();
        final int lllllllllllllIIlIIlIIlIlIlIlIIlI = lllllllllllllIIlIIlIIlIlIlIlIIll.getLastAttackerTime();
        if (llIllllIIlllIll(lllllllllllllIIlIIlIIlIlIlIlIIlI, this.field_142050_e) && llIllllIIllllII(this.isSuitableTarget(this.theTarget, (boolean)(EntityAIOwnerHurtTarget.lIIlllllIIIlIl[0] != 0)) ? 1 : 0) && llIllllIIllllII(this.theEntityTameable.shouldAttackEntity(this.theTarget, lllllllllllllIIlIIlIIlIlIlIlIIll) ? 1 : 0)) {
            return EntityAIOwnerHurtTarget.lIIlllllIIIlIl[1] != 0;
        }
        return EntityAIOwnerHurtTarget.lIIlllllIIIlIl[0] != 0;
    }
    
    private static void llIllllIIlllIII() {
        (lIIlllllIIIlIl = new int[2])[0] = ((0x35 ^ 0x11) & ~(0x48 ^ 0x6C));
        EntityAIOwnerHurtTarget.lIIlllllIIIlIl[1] = " ".length();
    }
    
    private static boolean llIllllIIllllIl(final Object lllllllllllllIIlIIlIIlIlIlIIIlll) {
        return lllllllllllllIIlIIlIIlIlIlIIIlll != null;
    }
    
    @Override
    public void startExecuting() {
        this.taskOwner.setAttackTarget(this.theTarget);
        final EntityLivingBase lllllllllllllIIlIIlIIlIlIlIIlIll = this.theEntityTameable.getOwner();
        if (llIllllIIllllIl(lllllllllllllIIlIIlIIlIlIlIIlIll)) {
            this.field_142050_e = lllllllllllllIIlIIlIIlIlIlIIlIll.getLastAttackerTime();
        }
        super.startExecuting();
    }
    
    public EntityAIOwnerHurtTarget(final EntityTameable lllllllllllllIIlIIlIIlIlIlIllIII) {
        super(lllllllllllllIIlIIlIIlIlIlIllIII, (boolean)(EntityAIOwnerHurtTarget.lIIlllllIIIlIl[0] != 0));
        this.theEntityTameable = lllllllllllllIIlIIlIIlIlIlIllIII;
        this.setMutexBits(EntityAIOwnerHurtTarget.lIIlllllIIIlIl[1]);
    }
}
