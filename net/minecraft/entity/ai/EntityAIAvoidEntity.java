// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.util.Vec3;
import com.google.common.base.Predicates;
import net.minecraft.util.EntitySelectors;
import net.minecraft.pathfinding.PathNavigate;
import com.google.common.base.Predicate;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.Entity;

public class EntityAIAvoidEntity<T extends Entity> extends EntityAIBase
{
    protected /* synthetic */ EntityCreature theEntity;
    private static final /* synthetic */ int[] llIIllIIIllIIl;
    private /* synthetic */ float avoidDistance;
    private /* synthetic */ Class<T> field_181064_i;
    private /* synthetic */ PathEntity entityPathEntity;
    private /* synthetic */ double farSpeed;
    private /* synthetic */ double nearSpeed;
    private final /* synthetic */ Predicate<Entity> canBeSeenSelector;
    private /* synthetic */ PathNavigate entityPathNavigate;
    private /* synthetic */ Predicate<? super T> avoidTargetSelector;
    protected /* synthetic */ T closestLivingEntity;
    
    static {
        lIIIlllIIllIlllI();
    }
    
    private static void lIIIlllIIllIlllI() {
        (llIIllIIIllIIl = new int[6])[0] = " ".length();
        EntityAIAvoidEntity.llIIllIIIllIIl[1] = "   ".length();
        EntityAIAvoidEntity.llIIllIIIllIIl[2] = ((0x18 ^ 0x49 ^ (0xD5 ^ 0x90)) & (0x64 ^ 0x72 ^ "  ".length() ^ -" ".length()));
        EntityAIAvoidEntity.llIIllIIIllIIl[3] = "  ".length();
        EntityAIAvoidEntity.llIIllIIIllIIl[4] = (97 + 111 - 106 + 48 ^ 74 + 33 + 26 + 1);
        EntityAIAvoidEntity.llIIllIIIllIIl[5] = (0xC1 ^ 0xA6 ^ (0xF6 ^ 0x96));
    }
    
    private static int lIIIlllIIlllIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIIlllIIlllIIlI(final int llllllllllllIlllIIIIlIIIIIIIIIII) {
        return llllllllllllIlllIIIIlIIIIIIIIIII < 0;
    }
    
    public EntityAIAvoidEntity(final EntityCreature llllllllllllIlllIIIIlIIIIIlIIIII, final Class<T> llllllllllllIlllIIIIlIIIIIIlllll, final Predicate<? super T> llllllllllllIlllIIIIlIIIIIlIIlIl, final float llllllllllllIlllIIIIlIIIIIIlllIl, final double llllllllllllIlllIIIIlIIIIIlIIIll, final double llllllllllllIlllIIIIlIIIIIIllIll) {
        this.canBeSeenSelector = (Predicate<Entity>)new Predicate<Entity>() {
            private static final /* synthetic */ int[] llIlllIIlIIIIl;
            
            private static boolean lIIllIIlIlIlIIIl(final int llllllllllllIllIIlIlIIIIIIIlIIll) {
                return llllllllllllIllIIlIlIIIIIIIlIIll != 0;
            }
            
            static {
                lIIllIIlIlIlIIII();
            }
            
            public boolean apply(final Entity llllllllllllIllIIlIlIIIIIIIllIll) {
                if (lIIllIIlIlIlIIIl(llllllllllllIllIIlIlIIIIIIIllIll.isEntityAlive() ? 1 : 0) && lIIllIIlIlIlIIIl(EntityAIAvoidEntity.this.theEntity.getEntitySenses().canSee(llllllllllllIllIIlIlIIIIIIIllIll) ? 1 : 0)) {
                    return EntityAIAvoidEntity$1.llIlllIIlIIIIl[0] != 0;
                }
                return EntityAIAvoidEntity$1.llIlllIIlIIIIl[1] != 0;
            }
            
            private static void lIIllIIlIlIlIIII() {
                (llIlllIIlIIIIl = new int[2])[0] = " ".length();
                EntityAIAvoidEntity$1.llIlllIIlIIIIl[1] = ((0xF4 ^ 0xBB) & ~(0x5 ^ 0x4A));
            }
        };
        this.theEntity = llllllllllllIlllIIIIlIIIIIlIIIII;
        this.field_181064_i = llllllllllllIlllIIIIlIIIIIIlllll;
        this.avoidTargetSelector = llllllllllllIlllIIIIlIIIIIlIIlIl;
        this.avoidDistance = llllllllllllIlllIIIIlIIIIIIlllIl;
        this.farSpeed = llllllllllllIlllIIIIlIIIIIlIIIll;
        this.nearSpeed = llllllllllllIlllIIIIlIIIIIIllIll;
        this.entityPathNavigate = llllllllllllIlllIIIIlIIIIIlIIIII.getNavigator();
        this.setMutexBits(EntityAIAvoidEntity.llIIllIIIllIIl[0]);
    }
    
    private static boolean lIIIlllIIlllIIIl(final Object llllllllllllIlllIIIIlIIIIIIIIlII) {
        return llllllllllllIlllIIIIlIIIIIIIIlII == null;
    }
    
    @Override
    public void startExecuting() {
        this.entityPathNavigate.setPath(this.entityPathEntity, this.farSpeed);
        "".length();
    }
    
    @Override
    public boolean shouldExecute() {
        final World worldObj = this.theEntity.worldObj;
        final Class<T> field_181064_i = this.field_181064_i;
        final AxisAlignedBB expand = this.theEntity.getEntityBoundingBox().expand(this.avoidDistance, 3.0, this.avoidDistance);
        final Predicate[] array = new Predicate[EntityAIAvoidEntity.llIIllIIIllIIl[1]];
        array[EntityAIAvoidEntity.llIIllIIIllIIl[2]] = EntitySelectors.NOT_SPECTATING;
        array[EntityAIAvoidEntity.llIIllIIIllIIl[0]] = this.canBeSeenSelector;
        array[EntityAIAvoidEntity.llIIllIIIllIIl[3]] = this.avoidTargetSelector;
        final List<T> llllllllllllIlllIIIIlIIIIIIlIllI = (List<T>)worldObj.getEntitiesWithinAABB((Class<? extends Entity>)field_181064_i, expand, (com.google.common.base.Predicate<? super Entity>)Predicates.and(array));
        if (lIIIlllIIlllIIII(llllllllllllIlllIIIIlIIIIIIlIllI.isEmpty() ? 1 : 0)) {
            return EntityAIAvoidEntity.llIIllIIIllIIl[2] != 0;
        }
        this.closestLivingEntity = llllllllllllIlllIIIIlIIIIIIlIllI.get(EntityAIAvoidEntity.llIIllIIIllIIl[2]);
        final Vec3 llllllllllllIlllIIIIlIIIIIIlIlIl = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.theEntity, EntityAIAvoidEntity.llIIllIIIllIIl[4], EntityAIAvoidEntity.llIIllIIIllIIl[5], new Vec3(this.closestLivingEntity.posX, this.closestLivingEntity.posY, this.closestLivingEntity.posZ));
        if (lIIIlllIIlllIIIl(llllllllllllIlllIIIIlIIIIIIlIlIl)) {
            return EntityAIAvoidEntity.llIIllIIIllIIl[2] != 0;
        }
        if (lIIIlllIIlllIIlI(lIIIlllIIllIllll(this.closestLivingEntity.getDistanceSq(llllllllllllIlllIIIIlIIIIIIlIlIl.xCoord, llllllllllllIlllIIIIlIIIIIIlIlIl.yCoord, llllllllllllIlllIIIIlIIIIIIlIlIl.zCoord), this.closestLivingEntity.getDistanceSqToEntity(this.theEntity)))) {
            return EntityAIAvoidEntity.llIIllIIIllIIl[2] != 0;
        }
        this.entityPathEntity = this.entityPathNavigate.getPathToXYZ(llllllllllllIlllIIIIlIIIIIIlIlIl.xCoord, llllllllllllIlllIIIIlIIIIIIlIlIl.yCoord, llllllllllllIlllIIIIlIIIIIIlIlIl.zCoord);
        int destinationSame;
        if (lIIIlllIIlllIIIl(this.entityPathEntity)) {
            destinationSame = EntityAIAvoidEntity.llIIllIIIllIIl[2];
            "".length();
            if (((0x89 ^ 0x9C ^ (0x28 ^ 0x3B)) & (0x7D ^ 0xC ^ (0x78 ^ 0xF) ^ -" ".length())) > "  ".length()) {
                return ((84 + 58 - 70 + 81 ^ 22 + 122 - 117 + 167) & (38 + 85 + 11 + 75 ^ 71 + 130 - 167 + 104 ^ -" ".length())) != 0x0;
            }
        }
        else {
            destinationSame = (this.entityPathEntity.isDestinationSame(llllllllllllIlllIIIIlIIIIIIlIlIl) ? 1 : 0);
        }
        return destinationSame != 0;
    }
    
    private static int lIIIlllIIllIllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void resetTask() {
        this.closestLivingEntity = null;
    }
    
    private static boolean lIIIlllIIlllIIII(final int llllllllllllIlllIIIIlIIIIIIIIIlI) {
        return llllllllllllIlllIIIIlIIIIIIIIIlI != 0;
    }
    
    @Override
    public void updateTask() {
        if (lIIIlllIIlllIIlI(lIIIlllIIlllIIll(this.theEntity.getDistanceSqToEntity(this.closestLivingEntity), 49.0))) {
            this.theEntity.getNavigator().setSpeed(this.nearSpeed);
            "".length();
            if (((0xCB ^ 0x81 ^ (0x6F ^ 0x3F)) & (0x59 ^ 0x5D ^ (0x55 ^ 0x4B) ^ -" ".length())) >= "  ".length()) {
                return;
            }
        }
        else {
            this.theEntity.getNavigator().setSpeed(this.farSpeed);
        }
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (lIIIlllIIlllIIII(this.entityPathNavigate.noPath() ? 1 : 0)) {
            n = EntityAIAvoidEntity.llIIllIIIllIIl[2];
            "".length();
            if (-" ".length() != -" ".length()) {
                return ((133 + 185 - 199 + 120 ^ 43 + 124 - 149 + 179) & (0 + 109 - 33 + 94 ^ 19 + 118 - 52 + 43 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAIAvoidEntity.llIIllIIIllIIl[0];
        }
        return n != 0;
    }
    
    public EntityAIAvoidEntity(final EntityCreature llllllllllllIlllIIIIlIIIIIlllIlI, final Class<T> llllllllllllIlllIIIIlIIIIIllIIll, final float llllllllllllIlllIIIIlIIIIIllIIlI, final double llllllllllllIlllIIIIlIIIIIllIlll, final double llllllllllllIlllIIIIlIIIIIllIIII) {
        this(llllllllllllIlllIIIIlIIIIIlllIlI, (Class)llllllllllllIlllIIIIlIIIIIllIIll, Predicates.alwaysTrue(), llllllllllllIlllIIIIlIIIIIllIIlI, llllllllllllIlllIIIIlIIIIIllIlll, llllllllllllIlllIIIIlIIIIIllIIII);
    }
}
