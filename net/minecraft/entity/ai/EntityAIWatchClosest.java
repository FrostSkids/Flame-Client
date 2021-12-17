// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.Entity;

public class EntityAIWatchClosest extends EntityAIBase
{
    protected /* synthetic */ Entity closestEntity;
    private /* synthetic */ int lookTime;
    protected /* synthetic */ EntityLiving theWatcher;
    private static final /* synthetic */ int[] lIIlIIlIlIIIIl;
    private /* synthetic */ float chance;
    protected /* synthetic */ float maxDistanceForPlayer;
    protected /* synthetic */ Class<? extends Entity> watchedClass;
    
    @Override
    public boolean shouldExecute() {
        if (llIIllIIlllllII(llIIllIIllllIll(this.theWatcher.getRNG().nextFloat(), this.chance))) {
            return EntityAIWatchClosest.lIIlIIlIlIIIIl[1] != 0;
        }
        if (llIIllIIlllllIl(this.theWatcher.getAttackTarget())) {
            this.closestEntity = this.theWatcher.getAttackTarget();
        }
        if (llIIllIIllllllI(this.watchedClass, EntityPlayer.class)) {
            this.closestEntity = this.theWatcher.worldObj.getClosestPlayerToEntity(this.theWatcher, this.maxDistanceForPlayer);
            "".length();
            if (" ".length() == -" ".length()) {
                return ((0x72 ^ 0x77 ^ (0x2C ^ 0x7F)) & (0x3D ^ 0x8 ^ (0x2C ^ 0x4F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            this.closestEntity = this.theWatcher.worldObj.findNearestEntityWithinAABB((Class<? extends EntityLiving>)this.watchedClass, this.theWatcher.getEntityBoundingBox().expand(this.maxDistanceForPlayer, 3.0, this.maxDistanceForPlayer), this.theWatcher);
        }
        if (llIIllIIlllllIl(this.closestEntity)) {
            return EntityAIWatchClosest.lIIlIIlIlIIIIl[2] != 0;
        }
        return EntityAIWatchClosest.lIIlIIlIlIIIIl[1] != 0;
    }
    
    private static int llIIllIIlllllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public EntityAIWatchClosest(final EntityLiving lllllllllllllIIllIlllIlllIlIIIll, final Class<? extends Entity> lllllllllllllIIllIlllIlllIlIIIlI, final float lllllllllllllIIllIlllIlllIIlllIl) {
        this.theWatcher = lllllllllllllIIllIlllIlllIlIIIll;
        this.watchedClass = lllllllllllllIIllIlllIlllIlIIIlI;
        this.maxDistanceForPlayer = lllllllllllllIIllIlllIlllIIlllIl;
        this.chance = 0.02f;
        this.setMutexBits(EntityAIWatchClosest.lIIlIIlIlIIIIl[0]);
    }
    
    private static boolean llIIllIIlllllIl(final Object lllllllllllllIIllIlllIllIlllllIl) {
        return lllllllllllllIIllIlllIllIlllllIl != null;
    }
    
    @Override
    public void updateTask() {
        this.theWatcher.getLookHelper().setLookPosition(this.closestEntity.posX, this.closestEntity.posY + this.closestEntity.getEyeHeight(), this.closestEntity.posZ, 10.0f, (float)this.theWatcher.getVerticalFaceSpeed());
        this.lookTime -= EntityAIWatchClosest.lIIlIIlIlIIIIl[2];
    }
    
    @Override
    public void resetTask() {
        this.closestEntity = null;
    }
    
    private static void llIIllIIllllIlI() {
        (lIIlIIlIlIIIIl = new int[4])[0] = "  ".length();
        EntityAIWatchClosest.lIIlIIlIlIIIIl[1] = ((0x1F ^ 0x0) & ~(0x70 ^ 0x6F));
        EntityAIWatchClosest.lIIlIIlIlIIIIl[2] = " ".length();
        EntityAIWatchClosest.lIIlIIlIlIIIIl[3] = (0x39 ^ 0x11);
    }
    
    private static int llIIllIIllllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void startExecuting() {
        this.lookTime = EntityAIWatchClosest.lIIlIIlIlIIIIl[3] + this.theWatcher.getRNG().nextInt(EntityAIWatchClosest.lIIlIIlIlIIIIl[3]);
    }
    
    private static boolean llIIllIlIIIIIIl(final int lllllllllllllIIllIlllIllIlllIIll) {
        return lllllllllllllIIllIlllIllIlllIIll > 0;
    }
    
    public EntityAIWatchClosest(final EntityLiving lllllllllllllIIllIlllIlllIIlIllI, final Class<? extends Entity> lllllllllllllIIllIlllIlllIIlIlIl, final float lllllllllllllIIllIlllIlllIIlIlII, final float lllllllllllllIIllIlllIlllIIlIIll) {
        this.theWatcher = lllllllllllllIIllIlllIlllIIlIllI;
        this.watchedClass = lllllllllllllIIllIlllIlllIIlIlIl;
        this.maxDistanceForPlayer = lllllllllllllIIllIlllIlllIIlIlII;
        this.chance = lllllllllllllIIllIlllIlllIIlIIll;
        this.setMutexBits(EntityAIWatchClosest.lIIlIIlIlIIIIl[0]);
    }
    
    private static boolean llIIllIlIIIIIII(final int lllllllllllllIIllIlllIllIlllIlll) {
        return lllllllllllllIIllIlllIllIlllIlll == 0;
    }
    
    static {
        llIIllIIllllIlI();
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (llIIllIlIIIIIII(this.closestEntity.isEntityAlive() ? 1 : 0)) {
            n = EntityAIWatchClosest.lIIlIIlIlIIIIl[1];
            "".length();
            if (((0xA8 ^ 0xB4 ^ (0x45 ^ 0x4E)) & (0x3F ^ 0x30 ^ (0x14 ^ 0xC) ^ -" ".length())) != 0x0) {
                return ((104 + 77 - 123 + 183 ^ 10 + 127 + 24 + 16) & (94 + 131 - 84 + 92 ^ 135 + 3 + 31 + 0 ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIllIlIIIIIIl(llIIllIIlllllll(this.theWatcher.getDistanceSqToEntity(this.closestEntity), this.maxDistanceForPlayer * this.maxDistanceForPlayer))) {
            n = EntityAIWatchClosest.lIIlIIlIlIIIIl[1];
            "".length();
            if ("  ".length() == 0) {
                return ((137 + 47 + 15 + 3 ^ 54 + 89 - 132 + 117) & (0x25 ^ 0x3F ^ (0x55 ^ 0x5) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIllIlIIIIIIl(this.lookTime)) {
            n = EntityAIWatchClosest.lIIlIIlIlIIIIl[2];
            "".length();
            if (((0x49 ^ 0x17) & ~(0x38 ^ 0x66)) < 0) {
                return ((0x82 ^ 0xB8) & ~(0x96 ^ 0xAC)) != 0x0;
            }
        }
        else {
            n = EntityAIWatchClosest.lIIlIIlIlIIIIl[1];
        }
        return n != 0;
    }
    
    private static boolean llIIllIIlllllII(final int lllllllllllllIIllIlllIllIlllIlIl) {
        return lllllllllllllIIllIlllIllIlllIlIl >= 0;
    }
    
    private static boolean llIIllIIllllllI(final Object lllllllllllllIIllIlllIllIllllIlI, final Object lllllllllllllIIllIlllIllIllllIIl) {
        return lllllllllllllIIllIlllIllIllllIlI == lllllllllllllIIllIlllIllIllllIIl;
    }
}
