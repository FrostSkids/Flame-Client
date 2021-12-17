// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityCreature;

public class EntityAIMoveTowardsRestriction extends EntityAIBase
{
    private /* synthetic */ EntityCreature theEntity;
    private /* synthetic */ double movePosZ;
    private /* synthetic */ double movePosX;
    private static final /* synthetic */ int[] llIlllllIlllll;
    private /* synthetic */ double movePosY;
    private /* synthetic */ double movementSpeed;
    
    @Override
    public boolean shouldExecute() {
        if (lIIllIllIlIlllIl(this.theEntity.isWithinHomeDistanceCurrentPosition() ? 1 : 0)) {
            return EntityAIMoveTowardsRestriction.llIlllllIlllll[1] != 0;
        }
        final BlockPos llllllllllllIllIIIlIllIllIlIlllI = this.theEntity.getHomePosition();
        final Vec3 llllllllllllIllIIIlIllIllIlIllIl = RandomPositionGenerator.findRandomTargetBlockTowards(this.theEntity, EntityAIMoveTowardsRestriction.llIlllllIlllll[2], EntityAIMoveTowardsRestriction.llIlllllIlllll[3], new Vec3(llllllllllllIllIIIlIllIllIlIlllI.getX(), llllllllllllIllIIIlIllIllIlIlllI.getY(), llllllllllllIllIIIlIllIllIlIlllI.getZ()));
        if (lIIllIllIlIllllI(llllllllllllIllIIIlIllIllIlIllIl)) {
            return EntityAIMoveTowardsRestriction.llIlllllIlllll[1] != 0;
        }
        this.movePosX = llllllllllllIllIIIlIllIllIlIllIl.xCoord;
        this.movePosY = llllllllllllIllIIIlIllIllIlIllIl.yCoord;
        this.movePosZ = llllllllllllIllIIIlIllIllIlIllIl.zCoord;
        return EntityAIMoveTowardsRestriction.llIlllllIlllll[0] != 0;
    }
    
    public EntityAIMoveTowardsRestriction(final EntityCreature llllllllllllIllIIIlIllIllIllIlll, final double llllllllllllIllIIIlIllIllIllIIll) {
        this.theEntity = llllllllllllIllIIIlIllIllIllIlll;
        this.movementSpeed = llllllllllllIllIIIlIllIllIllIIll;
        this.setMutexBits(EntityAIMoveTowardsRestriction.llIlllllIlllll[0]);
    }
    
    static {
        lIIllIllIlIlllII();
    }
    
    private static boolean lIIllIllIlIlllIl(final int llllllllllllIllIIIlIllIllIlIIIII) {
        return llllllllllllIllIIIlIllIllIlIIIII != 0;
    }
    
    private static boolean lIIllIllIlIllllI(final Object llllllllllllIllIIIlIllIllIlIIIlI) {
        return llllllllllllIllIIIlIllIllIlIIIlI == null;
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (lIIllIllIlIlllIl(this.theEntity.getNavigator().noPath() ? 1 : 0)) {
            n = EntityAIMoveTowardsRestriction.llIlllllIlllll[1];
            "".length();
            if (((54 + 34 - 35 + 78 ^ 11 + 141 - 9 + 44) & (101 + 43 - 3 + 3 ^ 82 + 23 - 4 + 67 ^ -" ".length())) < ((0x1E ^ 0x39 ^ (0x2A ^ 0x40)) & (4 + 118 + 23 + 100 ^ 111 + 45 - 26 + 54 ^ -" ".length()))) {
                return ((0x75 ^ 0x1F ^ (0x66 ^ 0x44)) & (0xF4 ^ 0x84 ^ (0x8C ^ 0xB4) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAIMoveTowardsRestriction.llIlllllIlllll[0];
        }
        return n != 0;
    }
    
    @Override
    public void startExecuting() {
        this.theEntity.getNavigator().tryMoveToXYZ(this.movePosX, this.movePosY, this.movePosZ, this.movementSpeed);
        "".length();
    }
    
    private static void lIIllIllIlIlllII() {
        (llIlllllIlllll = new int[4])[0] = " ".length();
        EntityAIMoveTowardsRestriction.llIlllllIlllll[1] = ((0x31 ^ 0x29) & ~(0x9D ^ 0x85));
        EntityAIMoveTowardsRestriction.llIlllllIlllll[2] = (0x16 ^ 0x3B ^ (0x84 ^ 0xB9));
        EntityAIMoveTowardsRestriction.llIlllllIlllll[3] = (35 + 137 - 24 + 42 ^ 28 + 98 + 54 + 5);
    }
}
