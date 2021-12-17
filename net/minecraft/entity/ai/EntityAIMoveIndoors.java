// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.util.Vec3;
import net.minecraft.village.Village;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityCreature;
import net.minecraft.village.VillageDoorInfo;

public class EntityAIMoveIndoors extends EntityAIBase
{
    private /* synthetic */ int insidePosX;
    private /* synthetic */ int insidePosZ;
    private /* synthetic */ VillageDoorInfo doorInfo;
    private static final /* synthetic */ int[] llIIIIlIllIIlI;
    private /* synthetic */ EntityCreature entityObj;
    
    public EntityAIMoveIndoors(final EntityCreature llllllllllllIlllIllIlllIllIlllll) {
        this.insidePosX = EntityAIMoveIndoors.llIIIIlIllIIlI[0];
        this.insidePosZ = EntityAIMoveIndoors.llIIIIlIllIIlI[0];
        this.entityObj = llllllllllllIlllIllIlllIllIlllll;
        this.setMutexBits(EntityAIMoveIndoors.llIIIIlIllIIlI[1]);
    }
    
    private static boolean lIIIIlllllllIIlI(final int llllllllllllIlllIllIlllIlIlllIII) {
        return llllllllllllIlllIllIlllIlIlllIII != 0;
    }
    
    private static boolean lIIIIlllllllIlIl(final int llllllllllllIlllIllIlllIlIllIlII) {
        return llllllllllllIlllIllIlllIlIllIlII < 0;
    }
    
    private static boolean lIIIIlllllllIIll(final int llllllllllllIlllIllIlllIlIllIllI) {
        return llllllllllllIlllIllIlllIlIllIllI == 0;
    }
    
    private static boolean lIIIIlllllllIlll(final Object llllllllllllIlllIllIlllIlIllllII) {
        return llllllllllllIlllIllIlllIlIllllII != null;
    }
    
    @Override
    public boolean shouldExecute() {
        final BlockPos llllllllllllIlllIllIlllIllIllIlI = new BlockPos(this.entityObj);
        if ((lIIIIlllllllIIlI(this.entityObj.worldObj.isDaytime() ? 1 : 0) && (!lIIIIlllllllIIlI(this.entityObj.worldObj.isRaining() ? 1 : 0) || !lIIIIlllllllIIll(this.entityObj.worldObj.getBiomeGenForCoords(llllllllllllIlllIllIlllIllIllIlI).canSpawnLightningBolt() ? 1 : 0))) || !lIIIIlllllllIIll(this.entityObj.worldObj.provider.getHasNoSky() ? 1 : 0)) {
            return EntityAIMoveIndoors.llIIIIlIllIIlI[3] != 0;
        }
        if (lIIIIlllllllIIlI(this.entityObj.getRNG().nextInt(EntityAIMoveIndoors.llIIIIlIllIIlI[2]))) {
            return EntityAIMoveIndoors.llIIIIlIllIIlI[3] != 0;
        }
        if (lIIIIlllllllIlII(this.insidePosX, EntityAIMoveIndoors.llIIIIlIllIIlI[0]) && lIIIIlllllllIlIl(lIIIIlllllllIIIl(this.entityObj.getDistanceSq(this.insidePosX, this.entityObj.posY, this.insidePosZ), 4.0))) {
            return EntityAIMoveIndoors.llIIIIlIllIIlI[3] != 0;
        }
        final Village llllllllllllIlllIllIlllIllIllIIl = this.entityObj.worldObj.getVillageCollection().getNearestVillage(llllllllllllIlllIllIlllIllIllIlI, EntityAIMoveIndoors.llIIIIlIllIIlI[4]);
        if (lIIIIlllllllIllI(llllllllllllIlllIllIlllIllIllIIl)) {
            return EntityAIMoveIndoors.llIIIIlIllIIlI[3] != 0;
        }
        this.doorInfo = llllllllllllIlllIllIlllIllIllIIl.getDoorInfo(llllllllllllIlllIllIlllIllIllIlI);
        if (lIIIIlllllllIlll(this.doorInfo)) {
            return EntityAIMoveIndoors.llIIIIlIllIIlI[1] != 0;
        }
        return EntityAIMoveIndoors.llIIIIlIllIIlI[3] != 0;
    }
    
    @Override
    public boolean continueExecuting() {
        int n;
        if (lIIIIlllllllIIlI(this.entityObj.getNavigator().noPath() ? 1 : 0)) {
            n = EntityAIMoveIndoors.llIIIIlIllIIlI[3];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x54 ^ 0x75 ^ (0xB7 ^ 0xAC)) & (0x2A ^ 0x25 ^ (0x71 ^ 0x44) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityAIMoveIndoors.llIIIIlIllIIlI[1];
        }
        return n != 0;
    }
    
    static {
        lIIIIlllllllIIII();
    }
    
    private static boolean lIIIIllllllllIIl(final int llllllllllllIlllIllIlllIlIllIIlI) {
        return llllllllllllIlllIllIlllIlIllIIlI > 0;
    }
    
    @Override
    public void resetTask() {
        this.insidePosX = this.doorInfo.getInsideBlockPos().getX();
        this.insidePosZ = this.doorInfo.getInsideBlockPos().getZ();
        this.doorInfo = null;
    }
    
    private static int lIIIIllllllllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void startExecuting() {
        this.insidePosX = EntityAIMoveIndoors.llIIIIlIllIIlI[0];
        final BlockPos llllllllllllIlllIllIlllIllIIlIll = this.doorInfo.getInsideBlockPos();
        final int llllllllllllIlllIllIlllIllIIlIlI = llllllllllllIlllIllIlllIllIIlIll.getX();
        final int llllllllllllIlllIllIlllIllIIlIIl = llllllllllllIlllIllIlllIllIIlIll.getY();
        final int llllllllllllIlllIllIlllIllIIlIII = llllllllllllIlllIllIlllIllIIlIll.getZ();
        if (lIIIIllllllllIIl(lIIIIllllllllIII(this.entityObj.getDistanceSq(llllllllllllIlllIllIlllIllIIlIll), 256.0))) {
            final Vec3 llllllllllllIlllIllIlllIllIIIlll = RandomPositionGenerator.findRandomTargetBlockTowards(this.entityObj, EntityAIMoveIndoors.llIIIIlIllIIlI[4], EntityAIMoveIndoors.llIIIIlIllIIlI[5], new Vec3(llllllllllllIlllIllIlllIllIIlIlI + 0.5, llllllllllllIlllIllIlllIllIIlIIl, llllllllllllIlllIllIlllIllIIlIII + 0.5));
            if (lIIIIlllllllIlll(llllllllllllIlllIllIlllIllIIIlll)) {
                this.entityObj.getNavigator().tryMoveToXYZ(llllllllllllIlllIllIlllIllIIIlll.xCoord, llllllllllllIlllIllIlllIllIIIlll.yCoord, llllllllllllIlllIllIlllIllIIIlll.zCoord, 1.0);
                "".length();
                "".length();
                if ((0x3 ^ 0x3C ^ (0xAF ^ 0x94)) <= 0) {
                    return;
                }
            }
        }
        else {
            this.entityObj.getNavigator().tryMoveToXYZ(llllllllllllIlllIllIlllIllIIlIlI + 0.5, llllllllllllIlllIllIlllIllIIlIIl, llllllllllllIlllIllIlllIllIIlIII + 0.5, 1.0);
            "".length();
        }
    }
    
    private static boolean lIIIIlllllllIlII(final int llllllllllllIlllIllIlllIlIlIllll, final int llllllllllllIlllIllIlllIlIlIlllI) {
        return llllllllllllIlllIllIlllIlIlIllll != llllllllllllIlllIllIlllIlIlIlllI;
    }
    
    private static void lIIIIlllllllIIII() {
        (llIIIIlIllIIlI = new int[6])[0] = -" ".length();
        EntityAIMoveIndoors.llIIIIlIllIIlI[1] = " ".length();
        EntityAIMoveIndoors.llIIIIlIllIIlI[2] = (75 + 65 - 43 + 32 ^ 106 + 126 - 100 + 47);
        EntityAIMoveIndoors.llIIIIlIllIIlI[3] = ((0xB2 ^ 0x8F ^ (0x30 ^ 0x35)) & (0x13 ^ 0x5A ^ (0xE7 ^ 0x96) ^ -" ".length()));
        EntityAIMoveIndoors.llIIIIlIllIIlI[4] = (0x64 ^ 0x6A);
        EntityAIMoveIndoors.llIIIIlIllIIlI[5] = "   ".length();
    }
    
    private static boolean lIIIIlllllllIllI(final Object llllllllllllIlllIllIlllIlIlllIlI) {
        return llllllllllllIlllIllIlllIlIlllIlI == null;
    }
    
    private static int lIIIIlllllllIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
}
