// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityCreature;
import net.minecraft.village.Village;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.EntityLivingBase;

public class EntityAIDefendVillage extends EntityAITarget
{
    /* synthetic */ EntityLivingBase villageAgressorTarget;
    /* synthetic */ EntityIronGolem irongolem;
    private static final /* synthetic */ int[] lIIIlllIlllIlI;
    
    @Override
    public void startExecuting() {
        this.irongolem.setAttackTarget(this.villageAgressorTarget);
        super.startExecuting();
    }
    
    private static boolean llIIIlllIIlllII(final Object lllllllllllllIIllllIllIIIIIIIlII) {
        return lllllllllllllIIllllIllIIIIIIIlII == null;
    }
    
    @Override
    public boolean shouldExecute() {
        final Village lllllllllllllIIllllIllIIIIIIlIll = this.irongolem.getVillage();
        if (llIIIlllIIlllII(lllllllllllllIIllllIllIIIIIIlIll)) {
            return EntityAIDefendVillage.lIIIlllIlllIlI[0] != 0;
        }
        this.villageAgressorTarget = lllllllllllllIIllllIllIIIIIIlIll.findNearestVillageAggressor(this.irongolem);
        if (llIIIlllIIlllIl((this.villageAgressorTarget instanceof EntityCreeper) ? 1 : 0)) {
            return EntityAIDefendVillage.lIIIlllIlllIlI[0] != 0;
        }
        if (!llIIIlllIIllllI(this.isSuitableTarget(this.villageAgressorTarget, (boolean)(EntityAIDefendVillage.lIIIlllIlllIlI[0] != 0)) ? 1 : 0)) {
            return EntityAIDefendVillage.lIIIlllIlllIlI[1] != 0;
        }
        if (llIIIlllIIllllI(this.taskOwner.getRNG().nextInt(EntityAIDefendVillage.lIIIlllIlllIlI[2]))) {
            this.villageAgressorTarget = lllllllllllllIIllllIllIIIIIIlIll.getNearestTargetPlayer(this.irongolem);
            return this.isSuitableTarget(this.villageAgressorTarget, (boolean)(EntityAIDefendVillage.lIIIlllIlllIlI[0] != 0));
        }
        return EntityAIDefendVillage.lIIIlllIlllIlI[0] != 0;
    }
    
    private static boolean llIIIlllIIllllI(final int lllllllllllllIIllllIllIIIIIIIIII) {
        return lllllllllllllIIllllIllIIIIIIIIII == 0;
    }
    
    private static void llIIIlllIIllIll() {
        (lIIIlllIlllIlI = new int[3])[0] = ((0x99 ^ 0x8B) & ~(0x36 ^ 0x24));
        EntityAIDefendVillage.lIIIlllIlllIlI[1] = " ".length();
        EntityAIDefendVillage.lIIIlllIlllIlI[2] = (0x64 ^ 0x76 ^ (0x77 ^ 0x71));
    }
    
    private static boolean llIIIlllIIlllIl(final int lllllllllllllIIllllIllIIIIIIIIlI) {
        return lllllllllllllIIllllIllIIIIIIIIlI != 0;
    }
    
    public EntityAIDefendVillage(final EntityIronGolem lllllllllllllIIllllIllIIIIIIllll) {
        super(lllllllllllllIIllllIllIIIIIIllll, (boolean)(EntityAIDefendVillage.lIIIlllIlllIlI[0] != 0), (boolean)(EntityAIDefendVillage.lIIIlllIlllIlI[1] != 0));
        this.irongolem = lllllllllllllIIllllIllIIIIIIllll;
        this.setMutexBits(EntityAIDefendVillage.lIIIlllIlllIlI[1]);
    }
    
    static {
        llIIIlllIIllIll();
    }
}
