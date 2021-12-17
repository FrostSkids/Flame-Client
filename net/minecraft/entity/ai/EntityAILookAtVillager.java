// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityVillager;

public class EntityAILookAtVillager extends EntityAIBase
{
    private /* synthetic */ EntityVillager theVillager;
    private /* synthetic */ int lookTime;
    private /* synthetic */ EntityIronGolem theGolem;
    private static final /* synthetic */ int[] llIIIlIllIlIlI;
    
    private static boolean lIIIlIIllIlIlIII(final int llllllllllllIlllIlIlIlIlIlIlllll) {
        return llllllllllllIlllIlIlIlIlIlIlllll != 0;
    }
    
    private static void lIIIlIIllIlIIllI() {
        (llIIIlIllIlIlI = new int[5])[0] = "   ".length();
        EntityAILookAtVillager.llIIIlIllIlIlI[1] = ((0xD4 ^ 0x82) & ~(0x49 ^ 0x1F));
        EntityAILookAtVillager.llIIIlIllIlIlI[2] = (-(0xFFFFF4CD & 0x2BBF) & (0xFFFFBFEF & 0x7FDC));
        EntityAILookAtVillager.llIIIlIllIlIlI[3] = " ".length();
        EntityAILookAtVillager.llIIIlIllIlIlI[4] = (-(0xFFFFFC6F & 0x73DB) & (0xFFFFF3FF & 0x7DDA));
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIIIlIIllIlIIlll(this.theGolem.worldObj.isDaytime() ? 1 : 0)) {
            return EntityAILookAtVillager.llIIIlIllIlIlI[1] != 0;
        }
        if (lIIIlIIllIlIlIII(this.theGolem.getRNG().nextInt(EntityAILookAtVillager.llIIIlIllIlIlI[2]))) {
            return EntityAILookAtVillager.llIIIlIllIlIlI[1] != 0;
        }
        this.theVillager = this.theGolem.worldObj.findNearestEntityWithinAABB(EntityVillager.class, this.theGolem.getEntityBoundingBox().expand(6.0, 2.0, 6.0), (EntityVillager)this.theGolem);
        if (lIIIlIIllIlIlIIl(this.theVillager)) {
            return EntityAILookAtVillager.llIIIlIllIlIlI[3] != 0;
        }
        return EntityAILookAtVillager.llIIIlIllIlIlI[1] != 0;
    }
    
    @Override
    public void startExecuting() {
        this.lookTime = EntityAILookAtVillager.llIIIlIllIlIlI[4];
        this.theGolem.setHoldingRose((boolean)(EntityAILookAtVillager.llIIIlIllIlIlI[3] != 0));
    }
    
    private static boolean lIIIlIIllIlIlIIl(final Object llllllllllllIlllIlIlIlIlIllIIIIl) {
        return llllllllllllIlllIlIlIlIlIllIIIIl != null;
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIIIlIIllIlIlIlI(this.lookTime)) {
            return EntityAILookAtVillager.llIIIlIllIlIlI[3] != 0;
        }
        return EntityAILookAtVillager.llIIIlIllIlIlI[1] != 0;
    }
    
    @Override
    public void resetTask() {
        this.theGolem.setHoldingRose((boolean)(EntityAILookAtVillager.llIIIlIllIlIlI[1] != 0));
        this.theVillager = null;
    }
    
    @Override
    public void updateTask() {
        this.theGolem.getLookHelper().setLookPositionWithEntity(this.theVillager, 30.0f, 30.0f);
        this.lookTime -= EntityAILookAtVillager.llIIIlIllIlIlI[3];
    }
    
    static {
        lIIIlIIllIlIIllI();
    }
    
    private static boolean lIIIlIIllIlIlIlI(final int llllllllllllIlllIlIlIlIlIlIllIll) {
        return llllllllllllIlllIlIlIlIlIlIllIll > 0;
    }
    
    public EntityAILookAtVillager(final EntityIronGolem llllllllllllIlllIlIlIlIlIlllIIlI) {
        this.theGolem = llllllllllllIlllIlIlIlIlIlllIIlI;
        this.setMutexBits(EntityAILookAtVillager.llIIIlIllIlIlI[0]);
    }
    
    private static boolean lIIIlIIllIlIIlll(final int llllllllllllIlllIlIlIlIlIlIlllIl) {
        return llllllllllllIlllIlIlIlIlIlIlllIl == 0;
    }
}
