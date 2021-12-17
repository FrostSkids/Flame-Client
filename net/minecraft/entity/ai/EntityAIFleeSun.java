// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Random;
import net.minecraft.util.Vec3;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;

public class EntityAIFleeSun extends EntityAIBase
{
    private /* synthetic */ double shelterZ;
    private /* synthetic */ double movementSpeed;
    private /* synthetic */ double shelterX;
    private /* synthetic */ double shelterY;
    private /* synthetic */ World theWorld;
    private static final /* synthetic */ int[] lIlIllIIlllllI;
    private /* synthetic */ EntityCreature theCreature;
    
    private static boolean llllIIIlIlIllll(final int lllllllllllllIIIIllIllIlllIllIlI) {
        return lllllllllllllIIIIllIllIlllIllIlI == 0;
    }
    
    private static void llllIIIlIlIlllI() {
        (lIlIllIIlllllI = new int[6])[0] = " ".length();
        EntityAIFleeSun.lIlIllIIlllllI[1] = ((0x40 ^ 0x47 ^ (0x49 ^ 0x53)) & (0xE7 ^ 0x81 ^ (0x68 ^ 0x13) ^ -" ".length()));
        EntityAIFleeSun.lIlIllIIlllllI[2] = (42 + 86 + 1 + 24 ^ 21 + 91 - 92 + 121);
        EntityAIFleeSun.lIlIllIIlllllI[3] = (0x78 ^ 0x72);
        EntityAIFleeSun.lIlIllIIlllllI[4] = (0xF ^ 0x9);
        EntityAIFleeSun.lIlIllIIlllllI[5] = "   ".length();
    }
    
    @Override
    public boolean shouldExecute() {
        if (llllIIIlIlIllll(this.theWorld.isDaytime() ? 1 : 0)) {
            return EntityAIFleeSun.lIlIllIIlllllI[1] != 0;
        }
        if (llllIIIlIlIllll(this.theCreature.isBurning() ? 1 : 0)) {
            return EntityAIFleeSun.lIlIllIIlllllI[1] != 0;
        }
        if (llllIIIlIlIllll(this.theWorld.canSeeSky(new BlockPos(this.theCreature.posX, this.theCreature.getEntityBoundingBox().minY, this.theCreature.posZ)) ? 1 : 0)) {
            return EntityAIFleeSun.lIlIllIIlllllI[1] != 0;
        }
        final Vec3 lllllllllllllIIIIllIllIllllllIll = this.findPossibleShelter();
        if (llllIIIlIllIIII(lllllllllllllIIIIllIllIllllllIll)) {
            return EntityAIFleeSun.lIlIllIIlllllI[1] != 0;
        }
        this.shelterX = lllllllllllllIIIIllIllIllllllIll.xCoord;
        this.shelterY = lllllllllllllIIIIllIllIllllllIll.yCoord;
        this.shelterZ = lllllllllllllIIIIllIllIllllllIll.zCoord;
        return EntityAIFleeSun.lIlIllIIlllllI[0] != 0;
    }
    
    static {
        llllIIIlIlIlllI();
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (llllIIIlIllIIIl(this.theCreature.getNavigator().noPath() ? 1 : 0)) {
            n = EntityAIFleeSun.lIlIllIIlllllI[1];
            "".length();
            if (-"   ".length() >= 0) {
                return ((162 + 35 - 190 + 168 ^ 169 + 122 - 274 + 166) & (58 + 38 - 72 + 103 ^ (0x20 ^ 0x47) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAIFleeSun.lIlIllIIlllllI[0];
        }
        return n != 0;
    }
    
    private static boolean llllIIIlIllIIII(final Object lllllllllllllIIIIllIllIlllIllllI) {
        return lllllllllllllIIIIllIllIlllIllllI == null;
    }
    
    private static boolean llllIIIlIllIIll(final int lllllllllllllIIIIllIllIlllIllIII) {
        return lllllllllllllIIIIllIllIlllIllIII < 0;
    }
    
    private Vec3 findPossibleShelter() {
        final Random lllllllllllllIIIIllIllIllllIllII = this.theCreature.getRNG();
        final BlockPos lllllllllllllIIIIllIllIllllIlIll = new BlockPos(this.theCreature.posX, this.theCreature.getEntityBoundingBox().minY, this.theCreature.posZ);
        int lllllllllllllIIIIllIllIllllIlIlI = EntityAIFleeSun.lIlIllIIlllllI[1];
        "".length();
        if (((0x35 ^ 0x65) & ~(0xFE ^ 0xAE)) == -" ".length()) {
            return null;
        }
        while (!llllIIIlIllIlII(lllllllllllllIIIIllIllIllllIlIlI, EntityAIFleeSun.lIlIllIIlllllI[3])) {
            final BlockPos lllllllllllllIIIIllIllIllllIlIIl = lllllllllllllIIIIllIllIllllIlIll.add(lllllllllllllIIIIllIllIllllIllII.nextInt(EntityAIFleeSun.lIlIllIIlllllI[2]) - EntityAIFleeSun.lIlIllIIlllllI[3], lllllllllllllIIIIllIllIllllIllII.nextInt(EntityAIFleeSun.lIlIllIIlllllI[4]) - EntityAIFleeSun.lIlIllIIlllllI[5], lllllllllllllIIIIllIllIllllIllII.nextInt(EntityAIFleeSun.lIlIllIIlllllI[2]) - EntityAIFleeSun.lIlIllIIlllllI[3]);
            if (llllIIIlIlIllll(this.theWorld.canSeeSky(lllllllllllllIIIIllIllIllllIlIIl) ? 1 : 0) && llllIIIlIllIIll(llllIIIlIllIIlI(this.theCreature.getBlockPathWeight(lllllllllllllIIIIllIllIllllIlIIl), 0.0f))) {
                return new Vec3(lllllllllllllIIIIllIllIllllIlIIl.getX(), lllllllllllllIIIIllIllIllllIlIIl.getY(), lllllllllllllIIIIllIllIllllIlIIl.getZ());
            }
            ++lllllllllllllIIIIllIllIllllIlIlI;
        }
        return null;
    }
    
    @Override
    public void startExecuting() {
        this.theCreature.getNavigator().tryMoveToXYZ(this.shelterX, this.shelterY, this.shelterZ, this.movementSpeed);
        "".length();
    }
    
    private static int llllIIIlIllIIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llllIIIlIllIIIl(final int lllllllllllllIIIIllIllIlllIlllII) {
        return lllllllllllllIIIIllIllIlllIlllII != 0;
    }
    
    public EntityAIFleeSun(final EntityCreature lllllllllllllIIIIllIlllIIIIIIIII, final double lllllllllllllIIIIllIlllIIIIIIIlI) {
        this.theCreature = lllllllllllllIIIIllIlllIIIIIIIII;
        this.movementSpeed = lllllllllllllIIIIllIlllIIIIIIIlI;
        this.theWorld = lllllllllllllIIIIllIlllIIIIIIIII.worldObj;
        this.setMutexBits(EntityAIFleeSun.lIlIllIIlllllI[0]);
    }
    
    private static boolean llllIIIlIllIlII(final int lllllllllllllIIIIllIllIllllIIIIl, final int lllllllllllllIIIIllIllIllllIIIII) {
        return lllllllllllllIIIIllIllIllllIIIIl >= lllllllllllllIIIIllIllIllllIIIII;
    }
}
