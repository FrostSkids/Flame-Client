// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityCreature;

public class EntityAIPanic extends EntityAIBase
{
    private /* synthetic */ EntityCreature theEntityCreature;
    protected /* synthetic */ double speed;
    private /* synthetic */ double randPosX;
    private /* synthetic */ double randPosZ;
    private /* synthetic */ double randPosY;
    private static final /* synthetic */ int[] lllIlIlllIIIIl;
    
    private static void lIlIIIllIllIlIIl() {
        (lllIlIlllIIIIl = new int[4])[0] = " ".length();
        EntityAIPanic.lllIlIlllIIIIl[1] = ((0x71 ^ 0x7B) & ~(0x3E ^ 0x34));
        EntityAIPanic.lllIlIlllIIIIl[2] = (0x5A ^ 0x15 ^ (0xD6 ^ 0x9C));
        EntityAIPanic.lllIlIlllIIIIl[3] = (0xA9 ^ 0xAD);
    }
    
    private static boolean lIlIIIllIllIlIll(final int llllllllllllIlIllIlIIlllIlllIlll) {
        return llllllllllllIlIllIlIIlllIlllIlll == 0;
    }
    
    static {
        lIlIIIllIllIlIIl();
    }
    
    @Override
    public void startExecuting() {
        this.theEntityCreature.getNavigator().tryMoveToXYZ(this.randPosX, this.randPosY, this.randPosZ, this.speed);
        "".length();
    }
    
    private static boolean lIlIIIllIllIllII(final int llllllllllllIlIllIlIIlllIllllIIl) {
        return llllllllllllIlIllIlIIlllIllllIIl != 0;
    }
    
    private static boolean lIlIIIllIllIlIlI(final Object llllllllllllIlIllIlIIlllIllllIll) {
        return llllllllllllIlIllIlIIlllIllllIll == null;
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (lIlIIIllIllIllII(this.theEntityCreature.getNavigator().noPath() ? 1 : 0)) {
            n = EntityAIPanic.lllIlIlllIIIIl[1];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((0x28 ^ 0x1) & ~(0x81 ^ 0xA8)) != 0x0;
            }
        }
        else {
            n = EntityAIPanic.lllIlIlllIIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIlIIIllIllIlIlI(this.theEntityCreature.getAITarget()) && lIlIIIllIllIlIll(this.theEntityCreature.isBurning() ? 1 : 0)) {
            return EntityAIPanic.lllIlIlllIIIIl[1] != 0;
        }
        final Vec3 llllllllllllIlIllIlIIllllIIIIlIl = RandomPositionGenerator.findRandomTarget(this.theEntityCreature, EntityAIPanic.lllIlIlllIIIIl[2], EntityAIPanic.lllIlIlllIIIIl[3]);
        if (lIlIIIllIllIlIlI(llllllllllllIlIllIlIIllllIIIIlIl)) {
            return EntityAIPanic.lllIlIlllIIIIl[1] != 0;
        }
        this.randPosX = llllllllllllIlIllIlIIllllIIIIlIl.xCoord;
        this.randPosY = llllllllllllIlIllIlIIllllIIIIlIl.yCoord;
        this.randPosZ = llllllllllllIlIllIlIIllllIIIIlIl.zCoord;
        return EntityAIPanic.lllIlIlllIIIIl[0] != 0;
    }
    
    public EntityAIPanic(final EntityCreature llllllllllllIlIllIlIIllllIIIlIlI, final double llllllllllllIlIllIlIIllllIIIlIIl) {
        this.theEntityCreature = llllllllllllIlIllIlIIllllIIIlIlI;
        this.speed = llllllllllllIlIllIlIIllllIIIlIIl;
        this.setMutexBits(EntityAIPanic.lllIlIlllIIIIl[0]);
    }
}
