// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Iterator;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityVillager;

public class EntityAIFollowGolem extends EntityAIBase
{
    private /* synthetic */ boolean tookGolemRose;
    private /* synthetic */ EntityVillager theVillager;
    private static final /* synthetic */ int[] lIIIllIIIlIIIl;
    private /* synthetic */ int takeGolemRoseTick;
    private /* synthetic */ EntityIronGolem theGolem;
    
    @Override
    public boolean continueExecuting() {
        if (llIIIIlIllIlIll(this.theGolem.getHoldRoseTick())) {
            return EntityAIFollowGolem.lIIIllIIIlIIIl[2] != 0;
        }
        return EntityAIFollowGolem.lIIIllIIIlIIIl[1] != 0;
    }
    
    @Override
    public void startExecuting() {
        this.takeGolemRoseTick = this.theVillager.getRNG().nextInt(EntityAIFollowGolem.lIIIllIIIlIIIl[3]);
        this.tookGolemRose = (EntityAIFollowGolem.lIIIllIIIlIIIl[1] != 0);
        this.theGolem.getNavigator().clearPathEntity();
    }
    
    static {
        llIIIIlIllIIlll();
    }
    
    private static void llIIIIlIllIIlll() {
        (lIIIllIIIlIIIl = new int[4])[0] = "   ".length();
        EntityAIFollowGolem.lIIIllIIIlIIIl[1] = ((0x55 ^ 0x18) & ~(0x45 ^ 0x8));
        EntityAIFollowGolem.lIIIllIIIlIIIl[2] = " ".length();
        EntityAIFollowGolem.lIIIllIIIlIIIl[3] = (0xFFFF89D2 & 0x776D);
    }
    
    private static boolean llIIIIlIllIlllI(final int lllllllllllllIlIIIIIlllIIIIIIlll, final int lllllllllllllIlIIIIIlllIIIIIIllI) {
        return lllllllllllllIlIIIIIlllIIIIIIlll == lllllllllllllIlIIIIIlllIIIIIIllI;
    }
    
    @Override
    public boolean shouldExecute() {
        if (llIIIIlIllIlIII(this.theVillager.getGrowingAge())) {
            return EntityAIFollowGolem.lIIIllIIIlIIIl[1] != 0;
        }
        if (llIIIIlIllIlIIl(this.theVillager.worldObj.isDaytime() ? 1 : 0)) {
            return EntityAIFollowGolem.lIIIllIIIlIIIl[1] != 0;
        }
        final List<EntityIronGolem> lllllllllllllIlIIIIIlllIIIIllllI = this.theVillager.worldObj.getEntitiesWithinAABB((Class<? extends EntityIronGolem>)EntityIronGolem.class, this.theVillager.getEntityBoundingBox().expand(6.0, 2.0, 6.0));
        if (llIIIIlIllIlIlI(lllllllllllllIlIIIIIlllIIIIllllI.isEmpty() ? 1 : 0)) {
            return EntityAIFollowGolem.lIIIllIIIlIIIl[1] != 0;
        }
        final String lllllllllllllIlIIIIIlllIIIIlIllI = (String)lllllllllllllIlIIIIIlllIIIIllllI.iterator();
        "".length();
        if (null != null) {
            return ((44 + 25 - 67 + 149 ^ 115 + 13 + 2 + 1) & (115 + 112 - 98 + 29 ^ 22 + 13 + 61 + 42 ^ -" ".length())) != 0x0;
        }
        while (!llIIIIlIllIlIIl(((Iterator)lllllllllllllIlIIIIIlllIIIIlIllI).hasNext() ? 1 : 0)) {
            final EntityIronGolem lllllllllllllIlIIIIIlllIIIIlllII = ((Iterator<EntityIronGolem>)lllllllllllllIlIIIIIlllIIIIlIllI).next();
            if (llIIIIlIllIlIll(lllllllllllllIlIIIIIlllIIIIlllII.getHoldRoseTick())) {
                this.theGolem = lllllllllllllIlIIIIIlllIIIIlllII;
                "".length();
                if ("   ".length() < 0) {
                    return ((0x19 ^ 0xF ^ (0x4F ^ 0x10)) & (0x77 ^ 0x43 ^ (0x9 ^ 0x74) ^ -" ".length())) != 0x0;
                }
                break;
            }
        }
        if (llIIIIlIllIllII(this.theGolem)) {
            return EntityAIFollowGolem.lIIIllIIIlIIIl[2] != 0;
        }
        return EntityAIFollowGolem.lIIIllIIIlIIIl[1] != 0;
    }
    
    private static boolean llIIIIlIllIllll(final int lllllllllllllIlIIIIIllIlllllllII) {
        return lllllllllllllIlIIIIIllIlllllllII < 0;
    }
    
    @Override
    public void updateTask() {
        this.theVillager.getLookHelper().setLookPositionWithEntity(this.theGolem, 30.0f, 30.0f);
        if (llIIIIlIllIlllI(this.theGolem.getHoldRoseTick(), this.takeGolemRoseTick)) {
            this.theVillager.getNavigator().tryMoveToEntityLiving(this.theGolem, 0.5);
            "".length();
            this.tookGolemRose = (EntityAIFollowGolem.lIIIllIIIlIIIl[2] != 0);
        }
        if (llIIIIlIllIlIlI(this.tookGolemRose ? 1 : 0) && llIIIIlIllIllll(llIIIIlIllIllIl(this.theVillager.getDistanceSqToEntity(this.theGolem), 4.0))) {
            this.theGolem.setHoldingRose((boolean)(EntityAIFollowGolem.lIIIllIIIlIIIl[1] != 0));
            this.theVillager.getNavigator().clearPathEntity();
        }
    }
    
    public EntityAIFollowGolem(final EntityVillager lllllllllllllIlIIIIIlllIIIlIllII) {
        this.theVillager = lllllllllllllIlIIIIIlllIIIlIllII;
        this.setMutexBits(EntityAIFollowGolem.lIIIllIIIlIIIl[0]);
    }
    
    @Override
    public void resetTask() {
        this.theGolem = null;
        this.theVillager.getNavigator().clearPathEntity();
    }
    
    private static boolean llIIIIlIllIlIlI(final int lllllllllllllIlIIIIIlllIIIIIIIlI) {
        return lllllllllllllIlIIIIIlllIIIIIIIlI != 0;
    }
    
    private static int llIIIIlIllIllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIIIIlIllIllII(final Object lllllllllllllIlIIIIIlllIIIIIIlII) {
        return lllllllllllllIlIIIIIlllIIIIIIlII != null;
    }
    
    private static boolean llIIIIlIllIlIll(final int lllllllllllllIlIIIIIllIllllllIlI) {
        return lllllllllllllIlIIIIIllIllllllIlI > 0;
    }
    
    private static boolean llIIIIlIllIlIII(final int lllllllllllllIlIIIIIllIllllllllI) {
        return lllllllllllllIlIIIIIllIllllllllI >= 0;
    }
    
    private static boolean llIIIIlIllIlIIl(final int lllllllllllllIlIIIIIlllIIIIIIIII) {
        return lllllllllllllIlIIIIIlllIIIIIIIII == 0;
    }
}
