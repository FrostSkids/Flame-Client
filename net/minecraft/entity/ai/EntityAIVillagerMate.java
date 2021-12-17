// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.world.World;
import net.minecraft.village.Village;
import net.minecraft.entity.passive.EntityVillager;

public class EntityAIVillagerMate extends EntityAIBase
{
    private /* synthetic */ EntityVillager villagerObj;
    private /* synthetic */ int matingTimeout;
    private static final /* synthetic */ int[] llIIIllllIlIIl;
    /* synthetic */ Village villageObj;
    private /* synthetic */ World worldObj;
    private /* synthetic */ EntityVillager mate;
    
    @Override
    public void startExecuting() {
        this.matingTimeout = EntityAIVillagerMate.llIIIllllIlIIl[4];
        this.villagerObj.setMating((boolean)(EntityAIVillagerMate.llIIIllllIlIIl[3] != 0));
    }
    
    private static boolean lIIIlIllIIlIlIll(final int llllllllllllIlllIIllllIlllIlIlIl) {
        return llllllllllllIlllIIllllIlllIlIlIl > 0;
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIIIlIllIIlIlIIl(this.matingTimeout) && lIIIlIllIIlIIllI(this.checkSufficientDoorsPresentForNewVillager() ? 1 : 0) && lIIIlIllIIlIlIII(this.villagerObj.getGrowingAge()) && lIIIlIllIIlIIllI(this.villagerObj.getIsWillingToMate((boolean)(EntityAIVillagerMate.llIIIllllIlIIl[1] != 0)) ? 1 : 0)) {
            return EntityAIVillagerMate.llIIIllllIlIIl[3] != 0;
        }
        return EntityAIVillagerMate.llIIIllllIlIIl[1] != 0;
    }
    
    private static boolean lIIIlIllIIlIlIII(final int llllllllllllIlllIIllllIlllIllIIl) {
        return llllllllllllIlllIIllllIlllIllIIl == 0;
    }
    
    static {
        lIIIlIllIIlIIlIl();
    }
    
    @Override
    public void resetTask() {
        this.villageObj = null;
        this.mate = null;
        this.villagerObj.setMating((boolean)(EntityAIVillagerMate.llIIIllllIlIIl[1] != 0));
    }
    
    public EntityAIVillagerMate(final EntityVillager llllllllllllIlllIIlllllIIIIIIIll) {
        this.villagerObj = llllllllllllIlllIIlllllIIIIIIIll;
        this.worldObj = llllllllllllIlllIIlllllIIIIIIIll.worldObj;
        this.setMutexBits(EntityAIVillagerMate.llIIIllllIlIIl[0]);
    }
    
    private static int lIIIlIllIIlIlIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private void giveBirth() {
        final EntityVillager llllllllllllIlllIIllllIllllIIlIl = this.villagerObj.createChild(this.mate);
        this.mate.setGrowingAge(EntityAIVillagerMate.llIIIllllIlIIl[7]);
        this.villagerObj.setGrowingAge(EntityAIVillagerMate.llIIIllllIlIIl[7]);
        this.mate.setIsWillingToMate((boolean)(EntityAIVillagerMate.llIIIllllIlIIl[1] != 0));
        this.villagerObj.setIsWillingToMate((boolean)(EntityAIVillagerMate.llIIIllllIlIIl[1] != 0));
        llllllllllllIlllIIllllIllllIIlIl.setGrowingAge(EntityAIVillagerMate.llIIIllllIlIIl[8]);
        llllllllllllIlllIIllllIllllIIlIl.setLocationAndAngles(this.villagerObj.posX, this.villagerObj.posY, this.villagerObj.posZ, 0.0f, 0.0f);
        this.worldObj.spawnEntityInWorld(llllllllllllIlllIIllllIllllIIlIl);
        "".length();
        this.worldObj.setEntityState(llllllllllllIlllIIllllIllllIIlIl, (byte)EntityAIVillagerMate.llIIIllllIlIIl[6]);
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIIIlIllIIlIIllI(this.villagerObj.getGrowingAge())) {
            return EntityAIVillagerMate.llIIIllllIlIIl[1] != 0;
        }
        if (lIIIlIllIIlIIllI(this.villagerObj.getRNG().nextInt(EntityAIVillagerMate.llIIIllllIlIIl[2]))) {
            return EntityAIVillagerMate.llIIIllllIlIIl[1] != 0;
        }
        this.villageObj = this.worldObj.getVillageCollection().getNearestVillage(new BlockPos(this.villagerObj), EntityAIVillagerMate.llIIIllllIlIIl[1]);
        if (lIIIlIllIIlIIlll(this.villageObj)) {
            return EntityAIVillagerMate.llIIIllllIlIIl[1] != 0;
        }
        if (!lIIIlIllIIlIIllI(this.checkSufficientDoorsPresentForNewVillager() ? 1 : 0) || !lIIIlIllIIlIIllI(this.villagerObj.getIsWillingToMate((boolean)(EntityAIVillagerMate.llIIIllllIlIIl[3] != 0)) ? 1 : 0)) {
            return EntityAIVillagerMate.llIIIllllIlIIl[1] != 0;
        }
        final Entity llllllllllllIlllIIllllIlllllllIl = this.worldObj.findNearestEntityWithinAABB(EntityVillager.class, this.villagerObj.getEntityBoundingBox().expand(8.0, 3.0, 8.0), this.villagerObj);
        if (lIIIlIllIIlIIlll(llllllllllllIlllIIllllIlllllllIl)) {
            return EntityAIVillagerMate.llIIIllllIlIIl[1] != 0;
        }
        this.mate = (EntityVillager)llllllllllllIlllIIllllIlllllllIl;
        if (lIIIlIllIIlIlIII(this.mate.getGrowingAge()) && lIIIlIllIIlIIllI(this.mate.getIsWillingToMate((boolean)(EntityAIVillagerMate.llIIIllllIlIIl[3] != 0)) ? 1 : 0)) {
            return EntityAIVillagerMate.llIIIllllIlIIl[3] != 0;
        }
        return EntityAIVillagerMate.llIIIllllIlIIl[1] != 0;
    }
    
    private static boolean lIIIlIllIIlIlIIl(final int llllllllllllIlllIIllllIlllIlIlll) {
        return llllllllllllIlllIIllllIlllIlIlll >= 0;
    }
    
    private static boolean lIIIlIllIIlIIllI(final int llllllllllllIlllIIllllIlllIllIll) {
        return llllllllllllIlllIIllllIlllIllIll != 0;
    }
    
    private static boolean lIIIlIllIIlIIlll(final Object llllllllllllIlllIIllllIlllIlllIl) {
        return llllllllllllIlllIIllllIlllIlllIl == null;
    }
    
    private static boolean lIIIlIllIIlIllII(final int llllllllllllIlllIIllllIllllIIIII, final int llllllllllllIlllIIllllIlllIlllll) {
        return llllllllllllIlllIIllllIllllIIIII < llllllllllllIlllIIllllIlllIlllll;
    }
    
    private static void lIIIlIllIIlIIlIl() {
        (llIIIllllIlIIl = new int[9])[0] = "   ".length();
        EntityAIVillagerMate.llIIIllllIlIIl[1] = ((0xFC ^ 0xA7) & ~(0xCA ^ 0x91));
        EntityAIVillagerMate.llIIIllllIlIIl[2] = (-(0xFFFFE61D & 0x79EB) & (0xFFFFF1FD & 0x6FFE));
        EntityAIVillagerMate.llIIIllllIlIIl[3] = " ".length();
        EntityAIVillagerMate.llIIIllllIlIIl[4] = (0xFFFFC33C & 0x3DEF);
        EntityAIVillagerMate.llIIIllllIlIIl[5] = (0xAD ^ 0x8E);
        EntityAIVillagerMate.llIIIllllIlIIl[6] = (0x59 ^ 0x55);
        EntityAIVillagerMate.llIIIllllIlIIl[7] = (0xFFFFDFF3 & 0x377C);
        EntityAIVillagerMate.llIIIllllIlIIl[8] = -(0xFFFFDDF3 & 0x7FCC);
    }
    
    private boolean checkSufficientDoorsPresentForNewVillager() {
        if (lIIIlIllIIlIlIII(this.villageObj.isMatingSeason() ? 1 : 0)) {
            return EntityAIVillagerMate.llIIIllllIlIIl[1] != 0;
        }
        final int llllllllllllIlllIIllllIllllIlIll = (int)((float)this.villageObj.getNumVillageDoors() * 0.35);
        if (lIIIlIllIIlIllII(this.villageObj.getNumVillagers(), llllllllllllIlllIIllllIllllIlIll)) {
            return EntityAIVillagerMate.llIIIllllIlIIl[3] != 0;
        }
        return EntityAIVillagerMate.llIIIllllIlIIl[1] != 0;
    }
    
    @Override
    public void updateTask() {
        this.matingTimeout -= EntityAIVillagerMate.llIIIllllIlIIl[3];
        this.villagerObj.getLookHelper().setLookPositionWithEntity(this.mate, 10.0f, 30.0f);
        if (lIIIlIllIIlIlIll(lIIIlIllIIlIlIlI(this.villagerObj.getDistanceSqToEntity(this.mate), 2.25))) {
            this.villagerObj.getNavigator().tryMoveToEntityLiving(this.mate, 0.25);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIIlIllIIlIlIII(this.matingTimeout) && lIIIlIllIIlIIllI(this.mate.isMating() ? 1 : 0)) {
            this.giveBirth();
        }
        if (lIIIlIllIIlIlIII(this.villagerObj.getRNG().nextInt(EntityAIVillagerMate.llIIIllllIlIIl[5]))) {
            this.worldObj.setEntityState(this.villagerObj, (byte)EntityAIVillagerMate.llIIIllllIlIIl[6]);
        }
    }
}
