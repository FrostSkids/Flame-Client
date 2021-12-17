// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Iterator;
import java.util.List;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.EntityLivingBase;

public class EntityAIPlay extends EntityAIBase
{
    private /* synthetic */ EntityLivingBase targetVillager;
    private static final /* synthetic */ int[] lIlllIIlIlIlll;
    private /* synthetic */ int playTime;
    private /* synthetic */ double speed;
    private /* synthetic */ EntityVillager villagerObj;
    
    private static int lIIIIIIlllIllIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIIIIIllllIIIIl(final Object llllllllllllIlllllIIllllllIllllI) {
        return llllllllllllIlllllIIllllllIllllI != null;
    }
    
    private static void lIIIIIIlllIlIlll() {
        (lIlllIIlIlIlll = new int[6])[0] = " ".length();
        EntityAIPlay.lIlllIIlIlIlll[1] = ((154 + 144 - 156 + 13 ^ 90 + 126 - 113 + 41) & (0xC ^ 0x41 ^ (0xC5 ^ 0x83) ^ -" ".length()));
        EntityAIPlay.lIlllIIlIlIlll[2] = (0xFFFFA3D7 & 0x5DB8);
        EntityAIPlay.lIlllIIlIlIlll[3] = (0xB6 ^ 0xA6);
        EntityAIPlay.lIlllIIlIlIlll[4] = "   ".length();
        EntityAIPlay.lIlllIIlIlIlll[5] = (0xFFFF83F9 & 0x7FEE);
    }
    
    private static boolean lIIIIIIlllIllllI(final int llllllllllllIlllllIIllllllIlIIlI) {
        return llllllllllllIlllllIIllllllIlIIlI <= 0;
    }
    
    private static boolean lIIIIIIllllIIIII(final int llllllllllllIlllllIIllllllIlIIII) {
        return llllllllllllIlllllIIllllllIlIIII > 0;
    }
    
    private static boolean lIIIIIIlllIlllII(final int llllllllllllIlllllIIllllllIllIII) {
        return llllllllllllIlllllIIllllllIllIII == 0;
    }
    
    @Override
    public void updateTask() {
        this.playTime -= EntityAIPlay.lIlllIIlIlIlll[0];
        if (lIIIIIIllllIIIIl(this.targetVillager)) {
            if (lIIIIIIllllIIIII(lIIIIIIllllIIIlI(this.villagerObj.getDistanceSqToEntity(this.targetVillager), 4.0))) {
                this.villagerObj.getNavigator().tryMoveToEntityLiving(this.targetVillager, this.speed);
                "".length();
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
        }
        else if (lIIIIIIlllIllIlI(this.villagerObj.getNavigator().noPath() ? 1 : 0)) {
            final Vec3 llllllllllllIlllllIIlllllllIIllI = RandomPositionGenerator.findRandomTarget(this.villagerObj, EntityAIPlay.lIlllIIlIlIlll[3], EntityAIPlay.lIlllIIlIlIlll[4]);
            if (lIIIIIIlllIlllll(llllllllllllIlllllIIlllllllIIllI)) {
                return;
            }
            this.villagerObj.getNavigator().tryMoveToXYZ(llllllllllllIlllllIIlllllllIIllI.xCoord, llllllllllllIlllllIIlllllllIIllI.yCoord, llllllllllllIlllllIIlllllllIIllI.zCoord, this.speed);
            "".length();
        }
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIIIIIIlllIllIIl(this.villagerObj.getGrowingAge())) {
            return EntityAIPlay.lIlllIIlIlIlll[1] != 0;
        }
        if (lIIIIIIlllIllIlI(this.villagerObj.getRNG().nextInt(EntityAIPlay.lIlllIIlIlIlll[2]))) {
            return EntityAIPlay.lIlllIIlIlIlll[1] != 0;
        }
        final List<EntityVillager> llllllllllllIlllllIIllllllllllIl = this.villagerObj.worldObj.getEntitiesWithinAABB((Class<? extends EntityVillager>)EntityVillager.class, this.villagerObj.getEntityBoundingBox().expand(6.0, 3.0, 6.0));
        double llllllllllllIlllllIIllllllllllII = Double.MAX_VALUE;
        final long llllllllllllIlllllIIllllllllIlII = (long)llllllllllllIlllllIIllllllllllIl.iterator();
        "".length();
        if ("   ".length() > "   ".length()) {
            return ((0x9A ^ 0x82) & ~(0xE ^ 0x16)) != 0x0;
        }
        while (!lIIIIIIlllIlllII(((Iterator)llllllllllllIlllllIIllllllllIlII).hasNext() ? 1 : 0)) {
            final EntityVillager llllllllllllIlllllIIlllllllllIll = ((Iterator<EntityVillager>)llllllllllllIlllllIIllllllllIlII).next();
            if (lIIIIIIlllIllIll(llllllllllllIlllllIIlllllllllIll, this.villagerObj) && lIIIIIIlllIlllII(llllllllllllIlllllIIlllllllllIll.isPlaying() ? 1 : 0) && lIIIIIIlllIlllIl(llllllllllllIlllllIIlllllllllIll.getGrowingAge())) {
                final double llllllllllllIlllllIIlllllllllIlI = llllllllllllIlllllIIlllllllllIll.getDistanceSqToEntity(this.villagerObj);
                if (!lIIIIIIlllIllllI(lIIIIIIlllIllIII(llllllllllllIlllllIIlllllllllIlI, llllllllllllIlllllIIllllllllllII))) {
                    continue;
                }
                llllllllllllIlllllIIllllllllllII = llllllllllllIlllllIIlllllllllIlI;
                this.targetVillager = llllllllllllIlllllIIlllllllllIll;
            }
        }
        if (lIIIIIIlllIlllll(this.targetVillager)) {
            final Vec3 llllllllllllIlllllIIlllllllllIIl = RandomPositionGenerator.findRandomTarget(this.villagerObj, EntityAIPlay.lIlllIIlIlIlll[3], EntityAIPlay.lIlllIIlIlIlll[4]);
            if (lIIIIIIlllIlllll(llllllllllllIlllllIIlllllllllIIl)) {
                return EntityAIPlay.lIlllIIlIlIlll[1] != 0;
            }
        }
        return EntityAIPlay.lIlllIIlIlIlll[0] != 0;
    }
    
    @Override
    public void resetTask() {
        this.villagerObj.setPlaying((boolean)(EntityAIPlay.lIlllIIlIlIlll[1] != 0));
        this.targetVillager = null;
    }
    
    private static int lIIIIIIllllIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void startExecuting() {
        if (lIIIIIIllllIIIIl(this.targetVillager)) {
            this.villagerObj.setPlaying((boolean)(EntityAIPlay.lIlllIIlIlIlll[0] != 0));
        }
        this.playTime = EntityAIPlay.lIlllIIlIlIlll[5];
    }
    
    public EntityAIPlay(final EntityVillager llllllllllllIlllllIlIIIIIIIIlIIl, final double llllllllllllIlllllIlIIIIIIIIlIII) {
        this.villagerObj = llllllllllllIlllllIlIIIIIIIIlIIl;
        this.speed = llllllllllllIlllllIlIIIIIIIIlIII;
        this.setMutexBits(EntityAIPlay.lIlllIIlIlIlll[0]);
    }
    
    private static boolean lIIIIIIlllIllIIl(final int llllllllllllIlllllIIllllllIlIllI) {
        return llllllllllllIlllllIIllllllIlIllI >= 0;
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIIIIIIllllIIIII(this.playTime)) {
            return EntityAIPlay.lIlllIIlIlIlll[0] != 0;
        }
        return EntityAIPlay.lIlllIIlIlIlll[1] != 0;
    }
    
    private static boolean lIIIIIIlllIlllIl(final int llllllllllllIlllllIIllllllIlIlII) {
        return llllllllllllIlllllIIllllllIlIlII < 0;
    }
    
    private static boolean lIIIIIIlllIllIlI(final int llllllllllllIlllllIIllllllIllIlI) {
        return llllllllllllIlllllIIllllllIllIlI != 0;
    }
    
    static {
        lIIIIIIlllIlIlll();
    }
    
    private static boolean lIIIIIIlllIlllll(final Object llllllllllllIlllllIIllllllIlllII) {
        return llllllllllllIlllllIIllllllIlllII == null;
    }
    
    private static boolean lIIIIIIlllIllIll(final Object llllllllllllIlllllIIlllllllIIIIl, final Object llllllllllllIlllllIIlllllllIIIII) {
        return llllllllllllIlllllIIlllllllIIIIl != llllllllllllIlllllIIlllllllIIIII;
    }
}
