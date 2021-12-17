// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import org.apache.commons.lang3.StringUtils;
import net.minecraft.entity.IEntityOwnable;
import net.minecraft.scoreboard.Team;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityCreature;

public abstract class EntityAITarget extends EntityAIBase
{
    private /* synthetic */ int targetSearchStatus;
    private /* synthetic */ int targetSearchDelay;
    private /* synthetic */ boolean nearbyOnly;
    protected /* synthetic */ boolean shouldCheckSight;
    protected final /* synthetic */ EntityCreature taskOwner;
    private /* synthetic */ int targetUnseenTicks;
    private static final /* synthetic */ int[] llIIlIIIlIlIll;
    
    private static boolean lIIIlIllllIllIll(final Object llllllllllllIlllIIllIIIIllIlIIlI) {
        return llllllllllllIlllIIllIIIIllIlIIlI != null;
    }
    
    private boolean canEasilyReach(final EntityLivingBase llllllllllllIlllIIllIIIIlllIIIII) {
        this.targetSearchDelay = EntityAITarget.llIIlIIIlIlIll[4] + this.taskOwner.getRNG().nextInt(EntityAITarget.llIIlIIIlIlIll[5]);
        final PathEntity llllllllllllIlllIIllIIIIlllIIlIl = this.taskOwner.getNavigator().getPathToEntityLiving(llllllllllllIlllIIllIIIIlllIIIII);
        if (lIIIlIllllIllIIl(llllllllllllIlllIIllIIIIlllIIlIl)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        final PathPoint llllllllllllIlllIIllIIIIlllIIlII = llllllllllllIlllIIllIIIIlllIIlIl.getFinalPathPoint();
        if (lIIIlIllllIllIIl(llllllllllllIlllIIllIIIIlllIIlII)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        final int llllllllllllIlllIIllIIIIlllIIIll = llllllllllllIlllIIllIIIIlllIIlII.xCoord - MathHelper.floor_double(llllllllllllIlllIIllIIIIlllIIIII.posX);
        final int llllllllllllIlllIIllIIIIlllIIIlI = llllllllllllIlllIIllIIIIlllIIlII.zCoord - MathHelper.floor_double(llllllllllllIlllIIllIIIIlllIIIII.posZ);
        if (lIIIlIlllllIIIII(lIIIlIlllllIIIlI(llllllllllllIlllIIllIIIIlllIIIll * llllllllllllIlllIIllIIIIlllIIIll + llllllllllllIlllIIllIIIIlllIIIlI * llllllllllllIlllIIllIIIIlllIIIlI, 2.25))) {
            return EntityAITarget.llIIlIIIlIlIll[1] != 0;
        }
        return EntityAITarget.llIIlIIIlIlIll[0] != 0;
    }
    
    private static boolean lIIIlIllllIlllII(final Object llllllllllllIlllIIllIIIIllIIllll, final Object llllllllllllIlllIIllIIIIllIIlllI) {
        return llllllllllllIlllIIllIIIIllIIllll == llllllllllllIlllIIllIIIIllIIlllI;
    }
    
    private static boolean lIIIlIlllllIIIII(final int llllllllllllIlllIIllIIIIllIIIllI) {
        return llllllllllllIlllIIllIIIIllIIIllI <= 0;
    }
    
    public EntityAITarget(final EntityCreature llllllllllllIlllIIllIIIlIIllIlII, final boolean llllllllllllIlllIIllIIIlIIllIIll) {
        this(llllllllllllIlllIIllIIIlIIllIlII, llllllllllllIlllIIllIIIlIIllIIll, (boolean)(EntityAITarget.llIIlIIIlIlIll[0] != 0));
    }
    
    protected double getTargetDistance() {
        final IAttributeInstance llllllllllllIlllIIllIIIlIIIlIIIl = this.taskOwner.getEntityAttribute(SharedMonsterAttributes.followRange);
        double attributeValue;
        if (lIIIlIllllIllIIl(llllllllllllIlllIIllIIIlIIIlIIIl)) {
            attributeValue = 16.0;
            "".length();
            if ("   ".length() != "   ".length()) {
                return 0.0;
            }
        }
        else {
            attributeValue = llllllllllllIlllIIllIIIlIIIlIIIl.getAttributeValue();
        }
        return attributeValue;
    }
    
    private static void lIIIlIllllIlIlll() {
        (llIIlIIIlIlIll = new int[6])[0] = ((0x3B ^ 0x51 ^ (0x6 ^ 0x3A)) & (7 + 82 + 46 + 112 ^ 1 + 133 - 1 + 28 ^ -" ".length()));
        EntityAITarget.llIIlIIIlIlIll[1] = " ".length();
        EntityAITarget.llIIlIIIlIlIll[2] = (101 + 117 - 197 + 107 ^ 8 + 21 + 111 + 48);
        EntityAITarget.llIIlIIIlIlIll[3] = "  ".length();
        EntityAITarget.llIIlIIIlIlIll[4] = (0x18 ^ 0x12);
        EntityAITarget.llIIlIIIlIlIll[5] = (0x40 ^ 0x45);
    }
    
    protected boolean isSuitableTarget(final EntityLivingBase llllllllllllIlllIIllIIIIlllIllll, final boolean llllllllllllIlllIIllIIIIllllIIIl) {
        if (lIIIlIllllIllIlI(isSuitableTarget(this.taskOwner, llllllllllllIlllIIllIIIIlllIllll, llllllllllllIlllIIllIIIIllllIIIl, this.shouldCheckSight) ? 1 : 0)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        if (lIIIlIllllIllIlI(this.taskOwner.isWithinHomeDistanceFromPosition(new BlockPos(llllllllllllIlllIIllIIIIlllIllll)) ? 1 : 0)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        if (lIIIlIllllIllllI(this.nearbyOnly ? 1 : 0)) {
            final int n = this.targetSearchDelay - EntityAITarget.llIIlIIIlIlIll[1];
            this.targetSearchDelay = n;
            if (lIIIlIlllllIIIII(n)) {
                this.targetSearchStatus = EntityAITarget.llIIlIIIlIlIll[0];
            }
            if (lIIIlIllllIllIlI(this.targetSearchStatus)) {
                int targetSearchStatus;
                if (lIIIlIllllIllllI(this.canEasilyReach(llllllllllllIlllIIllIIIIlllIllll) ? 1 : 0)) {
                    targetSearchStatus = EntityAITarget.llIIlIIIlIlIll[1];
                    "".length();
                    if (((0x55 ^ 0x47) & ~(0x56 ^ 0x44)) != 0x0) {
                        return ((0x93 ^ 0xC1) & ~(0x91 ^ 0xC3)) != 0x0;
                    }
                }
                else {
                    targetSearchStatus = EntityAITarget.llIIlIIIlIlIll[3];
                }
                this.targetSearchStatus = targetSearchStatus;
            }
            if (lIIIlIlllllIIIIl(this.targetSearchStatus, EntityAITarget.llIIlIIIlIlIll[3])) {
                return EntityAITarget.llIIlIIIlIlIll[0] != 0;
            }
        }
        return EntityAITarget.llIIlIIIlIlIll[1] != 0;
    }
    
    private static boolean lIIIlIllllIllIlI(final int llllllllllllIlllIIllIIIIllIIlIII) {
        return llllllllllllIlllIIllIIIIllIIlIII == 0;
    }
    
    private static boolean lIIIlIlllllIIIIl(final int llllllllllllIlllIIllIIIIllIllIIl, final int llllllllllllIlllIIllIIIIllIllIII) {
        return llllllllllllIlllIIllIIIIllIllIIl == llllllllllllIlllIIllIIIIllIllIII;
    }
    
    @Override
    public void resetTask() {
        this.taskOwner.setAttackTarget(null);
    }
    
    private static boolean lIIIlIllllIlllIl(final int llllllllllllIlllIIllIIIIllIIIlII) {
        return llllllllllllIlllIIllIIIIllIIIlII > 0;
    }
    
    @Override
    public void startExecuting() {
        this.targetSearchStatus = EntityAITarget.llIIlIIIlIlIll[0];
        this.targetSearchDelay = EntityAITarget.llIIlIIIlIlIll[0];
        this.targetUnseenTicks = EntityAITarget.llIIlIIIlIlIll[0];
    }
    
    @Override
    public boolean continueExecuting() {
        final EntityLivingBase llllllllllllIlllIIllIIIlIIIlllIl = this.taskOwner.getAttackTarget();
        if (lIIIlIllllIllIIl(llllllllllllIlllIIllIIIlIIIlllIl)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        if (lIIIlIllllIllIlI(llllllllllllIlllIIllIIIlIIIlllIl.isEntityAlive() ? 1 : 0)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        final Team llllllllllllIlllIIllIIIlIIIlllII = this.taskOwner.getTeam();
        final Team llllllllllllIlllIIllIIIlIIIllIll = llllllllllllIlllIIllIIIlIIIlllIl.getTeam();
        if (lIIIlIllllIllIll(llllllllllllIlllIIllIIIlIIIlllII) && lIIIlIllllIlllII(llllllllllllIlllIIllIIIlIIIllIll, llllllllllllIlllIIllIIIlIIIlllII)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        final double llllllllllllIlllIIllIIIlIIIllIlI = this.getTargetDistance();
        if (lIIIlIllllIlllIl(lIIIlIllllIllIII(this.taskOwner.getDistanceSqToEntity(llllllllllllIlllIIllIIIlIIIlllIl), llllllllllllIlllIIllIIIlIIIllIlI * llllllllllllIlllIIllIIIlIIIllIlI))) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        if (lIIIlIllllIllllI(this.shouldCheckSight ? 1 : 0)) {
            if (lIIIlIllllIllllI(this.taskOwner.getEntitySenses().canSee(llllllllllllIlllIIllIIIlIIIlllIl) ? 1 : 0)) {
                this.targetUnseenTicks = EntityAITarget.llIIlIIIlIlIll[0];
                "".length();
                if (-(0x6B ^ 0x5 ^ (0x69 ^ 0x2)) >= 0) {
                    return ((109 + 133 - 147 + 53 ^ 9 + 68 + 63 + 0) & (0x91 ^ 0xBC ^ (0x32 ^ 0x7) ^ -" ".length())) != 0x0;
                }
            }
            else {
                final int n = this.targetUnseenTicks + EntityAITarget.llIIlIIIlIlIll[1];
                this.targetUnseenTicks = n;
                if (lIIIlIllllIlllll(n, EntityAITarget.llIIlIIIlIlIll[2])) {
                    return EntityAITarget.llIIlIIIlIlIll[0] != 0;
                }
            }
        }
        if (lIIIlIllllIllllI((llllllllllllIlllIIllIIIlIIIlllIl instanceof EntityPlayer) ? 1 : 0) && lIIIlIllllIllllI(((EntityPlayer)llllllllllllIlllIIllIIIlIIIlllIl).capabilities.disableDamage ? 1 : 0)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        return EntityAITarget.llIIlIIIlIlIll[1] != 0;
    }
    
    private static int lIIIlIlllllIIIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    static {
        lIIIlIllllIlIlll();
    }
    
    public EntityAITarget(final EntityCreature llllllllllllIlllIIllIIIlIIlIlIlI, final boolean llllllllllllIlllIIllIIIlIIlIIlIl, final boolean llllllllllllIlllIIllIIIlIIlIlIII) {
        this.taskOwner = llllllllllllIlllIIllIIIlIIlIlIlI;
        this.shouldCheckSight = llllllllllllIlllIIllIIIlIIlIIlIl;
        this.nearbyOnly = llllllllllllIlllIIllIIIlIIlIlIII;
    }
    
    private static int lIIIlIllllIllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIlIllllIllIIl(final Object llllllllllllIlllIIllIIIIllIIllII) {
        return llllllllllllIlllIIllIIIIllIIllII == null;
    }
    
    public static boolean isSuitableTarget(final EntityLiving llllllllllllIlllIIllIIIlIIIIIIlI, final EntityLivingBase llllllllllllIlllIIllIIIlIIIIIIIl, final boolean llllllllllllIlllIIllIIIlIIIIIIII, final boolean llllllllllllIlllIIllIIIIlllllIIl) {
        if (lIIIlIllllIllIIl(llllllllllllIlllIIllIIIlIIIIIIIl)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        if (lIIIlIllllIlllII(llllllllllllIlllIIllIIIlIIIIIIIl, llllllllllllIlllIIllIIIlIIIIIIlI)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        if (lIIIlIllllIllIlI(llllllllllllIlllIIllIIIlIIIIIIIl.isEntityAlive() ? 1 : 0)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        if (lIIIlIllllIllIlI(llllllllllllIlllIIllIIIlIIIIIIlI.canAttackClass(llllllllllllIlllIIllIIIlIIIIIIIl.getClass()) ? 1 : 0)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        final Team llllllllllllIlllIIllIIIIlllllllI = llllllllllllIlllIIllIIIlIIIIIIlI.getTeam();
        final Team llllllllllllIlllIIllIIIIllllllIl = llllllllllllIlllIIllIIIlIIIIIIIl.getTeam();
        if (lIIIlIllllIllIll(llllllllllllIlllIIllIIIIlllllllI) && lIIIlIllllIlllII(llllllllllllIlllIIllIIIIllllllIl, llllllllllllIlllIIllIIIIlllllllI)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        if (lIIIlIllllIllllI((llllllllllllIlllIIllIIIlIIIIIIlI instanceof IEntityOwnable) ? 1 : 0) && lIIIlIllllIllllI(StringUtils.isNotEmpty((CharSequence)((IEntityOwnable)llllllllllllIlllIIllIIIlIIIIIIlI).getOwnerId()) ? 1 : 0)) {
            if (lIIIlIllllIllllI((llllllllllllIlllIIllIIIlIIIIIIIl instanceof IEntityOwnable) ? 1 : 0) && lIIIlIllllIllllI(((IEntityOwnable)llllllllllllIlllIIllIIIlIIIIIIlI).getOwnerId().equals(((IEntityOwnable)llllllllllllIlllIIllIIIlIIIIIIIl).getOwnerId()) ? 1 : 0)) {
                return EntityAITarget.llIIlIIIlIlIll[0] != 0;
            }
            if (lIIIlIllllIlllII(llllllllllllIlllIIllIIIlIIIIIIIl, ((IEntityOwnable)llllllllllllIlllIIllIIIlIIIIIIlI).getOwner())) {
                return EntityAITarget.llIIlIIIlIlIll[0] != 0;
            }
        }
        else if (lIIIlIllllIllllI((llllllllllllIlllIIllIIIlIIIIIIIl instanceof EntityPlayer) ? 1 : 0) && lIIIlIllllIllIlI(llllllllllllIlllIIllIIIlIIIIIIII ? 1 : 0) && lIIIlIllllIllllI(((EntityPlayer)llllllllllllIlllIIllIIIlIIIIIIIl).capabilities.disableDamage ? 1 : 0)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        if (lIIIlIllllIllllI(llllllllllllIlllIIllIIIIlllllIIl ? 1 : 0) && lIIIlIllllIllIlI(llllllllllllIlllIIllIIIlIIIIIIlI.getEntitySenses().canSee(llllllllllllIlllIIllIIIlIIIIIIIl) ? 1 : 0)) {
            return EntityAITarget.llIIlIIIlIlIll[0] != 0;
        }
        return EntityAITarget.llIIlIIIlIlIll[1] != 0;
    }
    
    private static boolean lIIIlIllllIlllll(final int llllllllllllIlllIIllIIIIllIlIlIl, final int llllllllllllIlllIIllIIIIllIlIlII) {
        return llllllllllllIlllIIllIIIIllIlIlIl > llllllllllllIlllIIllIIIIllIlIlII;
    }
    
    private static boolean lIIIlIllllIllllI(final int llllllllllllIlllIIllIIIIllIIlIlI) {
        return llllllllllllIlllIIllIIIIllIIlIlI != 0;
    }
}
