// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Iterator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.EntityCreature;

public class EntityAIHurtByTarget extends EntityAITarget
{
    private /* synthetic */ boolean entityCallsForHelp;
    private static final /* synthetic */ int[] llIlllllIlIIIl;
    private /* synthetic */ int revengeTimerOld;
    private final /* synthetic */ Class[] targetClasses;
    
    @Override
    public boolean shouldExecute() {
        final int llllllllllllIllIIIllIIIIIllIllIl = this.taskOwner.getRevengeTimer();
        if (lIIllIllIIlIIllI(llllllllllllIllIIIllIIIIIllIllIl, this.revengeTimerOld) && lIIllIllIIlIIlll(this.isSuitableTarget(this.taskOwner.getAITarget(), (boolean)(EntityAIHurtByTarget.llIlllllIlIIIl[0] != 0)) ? 1 : 0)) {
            return EntityAIHurtByTarget.llIlllllIlIIIl[1] != 0;
        }
        return EntityAIHurtByTarget.llIlllllIlIIIl[0] != 0;
    }
    
    private static boolean lIIllIllIIlIllII(final int llllllllllllIllIIIllIIIIIlIIlIlI, final int llllllllllllIllIIIllIIIIIlIIlIIl) {
        return llllllllllllIllIIIllIIIIIlIIlIlI >= llllllllllllIllIIIllIIIIIlIIlIIl;
    }
    
    private static boolean lIIllIllIIlIlIlI(final int llllllllllllIllIIIllIIIIIIlllIll) {
        return llllllllllllIllIIIllIIIIIIlllIll == 0;
    }
    
    public EntityAIHurtByTarget(final EntityCreature llllllllllllIllIIIllIIIIIlllIlll, final boolean llllllllllllIllIIIllIIIIIlllIIlI, final Class... llllllllllllIllIIIllIIIIIlllIIIl) {
        super(llllllllllllIllIIIllIIIIIlllIlll, (boolean)(EntityAIHurtByTarget.llIlllllIlIIIl[0] != 0));
        this.entityCallsForHelp = llllllllllllIllIIIllIIIIIlllIIlI;
        this.targetClasses = llllllllllllIllIIIllIIIIIlllIIIl;
        this.setMutexBits(EntityAIHurtByTarget.llIlllllIlIIIl[1]);
    }
    
    @Override
    public void startExecuting() {
        this.taskOwner.setAttackTarget(this.taskOwner.getAITarget());
        this.revengeTimerOld = this.taskOwner.getRevengeTimer();
        if (lIIllIllIIlIIlll(this.entityCallsForHelp ? 1 : 0)) {
            final double llllllllllllIllIIIllIIIIIllIIIII = this.getTargetDistance();
            final char llllllllllllIllIIIllIIIIIlIllIIl = (char)this.taskOwner.worldObj.getEntitiesWithinAABB((Class<? extends Entity>)this.taskOwner.getClass(), new AxisAlignedBB(this.taskOwner.posX, this.taskOwner.posY, this.taskOwner.posZ, this.taskOwner.posX + 1.0, this.taskOwner.posY + 1.0, this.taskOwner.posZ + 1.0).expand(llllllllllllIllIIIllIIIIIllIIIII, 10.0, llllllllllllIllIIIllIIIIIllIIIII)).iterator();
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
            while (!lIIllIllIIlIlIlI(((Iterator)llllllllllllIllIIIllIIIIIlIllIIl).hasNext() ? 1 : 0)) {
                final EntityCreature llllllllllllIllIIIllIIIIIlIlllll = ((Iterator<EntityCreature>)llllllllllllIllIIIllIIIIIlIllIIl).next();
                if (lIIllIllIIlIlIII(this.taskOwner, llllllllllllIllIIIllIIIIIlIlllll) && lIIllIllIIlIlIIl(llllllllllllIllIIIllIIIIIlIlllll.getAttackTarget()) && lIIllIllIIlIlIlI(llllllllllllIllIIIllIIIIIlIlllll.isOnSameTeam(this.taskOwner.getAITarget()) ? 1 : 0)) {
                    boolean llllllllllllIllIIIllIIIIIlIllllI = EntityAIHurtByTarget.llIlllllIlIIIl[0] != 0;
                    final double llllllllllllIllIIIllIIIIIlIlIlII;
                    final float llllllllllllIllIIIllIIIIIlIlIlIl = ((Class[])(Object)(llllllllllllIllIIIllIIIIIlIlIlII = (double)(Object)this.targetClasses)).length;
                    long llllllllllllIllIIIllIIIIIlIlIllI = EntityAIHurtByTarget.llIlllllIlIIIl[0];
                    "".length();
                    if ((0x91 ^ 0x95) <= 0) {
                        return;
                    }
                    while (!lIIllIllIIlIllII((int)llllllllllllIllIIIllIIIIIlIlIllI, (int)llllllllllllIllIIIllIIIIIlIlIlIl)) {
                        final Class llllllllllllIllIIIllIIIIIlIlllIl = llllllllllllIllIIIllIIIIIlIlIlII[llllllllllllIllIIIllIIIIIlIlIllI];
                        if (lIIllIllIIlIlIll(llllllllllllIllIIIllIIIIIlIlllll.getClass(), llllllllllllIllIIIllIIIIIlIlllIl)) {
                            llllllllllllIllIIIllIIIIIlIllllI = (EntityAIHurtByTarget.llIlllllIlIIIl[1] != 0);
                            "".length();
                            if (-" ".length() < -" ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            ++llllllllllllIllIIIllIIIIIlIlIllI;
                        }
                    }
                    if (!lIIllIllIIlIlIlI(llllllllllllIllIIIllIIIIIlIllllI ? 1 : 0)) {
                        continue;
                    }
                    this.setEntityAttackTarget(llllllllllllIllIIIllIIIIIlIlllll, this.taskOwner.getAITarget());
                }
            }
        }
        super.startExecuting();
    }
    
    private static boolean lIIllIllIIlIlIIl(final Object llllllllllllIllIIIllIIIIIIllllll) {
        return llllllllllllIllIIIllIIIIIIllllll == null;
    }
    
    private static void lIIllIllIIlIIlIl() {
        (llIlllllIlIIIl = new int[2])[0] = ((82 + 170 - 175 + 168 ^ 125 + 0 - 53 + 123) & (0x47 ^ 0x22 ^ (0xEB ^ 0xB8) ^ -" ".length()));
        EntityAIHurtByTarget.llIlllllIlIIIl[1] = " ".length();
    }
    
    private static boolean lIIllIllIIlIlIll(final Object llllllllllllIllIIIllIIIIIlIIIIlI, final Object llllllllllllIllIIIllIIIIIlIIIIIl) {
        return llllllllllllIllIIIllIIIIIlIIIIlI == llllllllllllIllIIIllIIIIIlIIIIIl;
    }
    
    static {
        lIIllIllIIlIIlIl();
    }
    
    protected void setEntityAttackTarget(final EntityCreature llllllllllllIllIIIllIIIIIlIlIIII, final EntityLivingBase llllllllllllIllIIIllIIIIIlIIllll) {
        llllllllllllIllIIIllIIIIIlIlIIII.setAttackTarget(llllllllllllIllIIIllIIIIIlIIllll);
    }
    
    private static boolean lIIllIllIIlIIlll(final int llllllllllllIllIIIllIIIIIIllllIl) {
        return llllllllllllIllIIIllIIIIIIllllIl != 0;
    }
    
    private static boolean lIIllIllIIlIIllI(final int llllllllllllIllIIIllIIIIIIlllIII, final int llllllllllllIllIIIllIIIIIIllIlll) {
        return llllllllllllIllIIIllIIIIIIlllIII != llllllllllllIllIIIllIIIIIIllIlll;
    }
    
    private static boolean lIIllIllIIlIlIII(final Object llllllllllllIllIIIllIIIIIlIIIllI, final Object llllllllllllIllIIIllIIIIIlIIIlIl) {
        return llllllllllllIllIIIllIIIIIlIIIllI != llllllllllllIllIIIllIIIIIlIIIlIl;
    }
}
