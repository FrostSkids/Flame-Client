// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.village;

import net.minecraft.util.Vec3i;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;

public class VillageDoorInfo
{
    private final /* synthetic */ BlockPos doorBlockPos;
    private static final /* synthetic */ int[] lIlIIllIlIIlIl;
    private final /* synthetic */ BlockPos insideBlock;
    private /* synthetic */ int doorOpeningRestrictionCounter;
    private /* synthetic */ boolean isDetachedFromVillageFlag;
    private final /* synthetic */ EnumFacing insideDirection;
    private /* synthetic */ int lastActivityTimestamp;
    
    private static EnumFacing getFaceDirection(final int lllllllllllllIIIllIIllIIllIIIlII, final int lllllllllllllIIIllIIllIIllIIIlIl) {
        EnumFacing enumFacing;
        if (lllIIllllllIllI(lllllllllllllIIIllIIllIIllIIIlII)) {
            enumFacing = EnumFacing.WEST;
            "".length();
            if ((0x7E ^ 0x7B) == 0x0) {
                return null;
            }
        }
        else if (lllIIllllllIlll(lllllllllllllIIIllIIllIIllIIIlII)) {
            enumFacing = EnumFacing.EAST;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else if (lllIIllllllIllI(lllllllllllllIIIllIIllIIllIIIlIl)) {
            enumFacing = EnumFacing.NORTH;
            "".length();
            if (((93 + 105 - 164 + 97 ^ 112 + 92 - 180 + 134) & (0x7D ^ 0x72 ^ (0x42 ^ 0x50) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            enumFacing = EnumFacing.SOUTH;
        }
        return enumFacing;
    }
    
    public BlockPos getDoorBlockPos() {
        return this.doorBlockPos;
    }
    
    public BlockPos getInsideBlockPos() {
        return this.insideBlock;
    }
    
    public void incrementDoorOpeningRestrictionCounter() {
        this.doorOpeningRestrictionCounter += VillageDoorInfo.lIlIIllIlIIlIl[1];
    }
    
    public int getInsidePosY() {
        return this.lastActivityTimestamp;
    }
    
    private static boolean lllIIllllllIlll(final int lllllllllllllIIIllIIllIIIllIIllI) {
        return lllllllllllllIIIllIIllIIIllIIllI > 0;
    }
    
    public int getDistanceSquared(final int lllllllllllllIIIllIIllIIlIlIllIl, final int lllllllllllllIIIllIIllIIlIlIllII, final int lllllllllllllIIIllIIllIIlIlIllll) {
        return (int)this.doorBlockPos.distanceSq(lllllllllllllIIIllIIllIIlIlIllIl, lllllllllllllIIIllIIllIIlIlIllII, lllllllllllllIIIllIIllIIlIlIllll);
    }
    
    private static boolean lllIIllllllIllI(final int lllllllllllllIIIllIIllIIIllIlIII) {
        return lllllllllllllIIIllIIllIIIllIlIII < 0;
    }
    
    public boolean func_179850_c(final BlockPos lllllllllllllIIIllIIllIIlIIlIlIl) {
        final int lllllllllllllIIIllIIllIIlIIllIII = lllllllllllllIIIllIIllIIlIIlIlIl.getX() - this.doorBlockPos.getX();
        final int lllllllllllllIIIllIIllIIlIIlIlll = lllllllllllllIIIllIIllIIlIIlIlIl.getZ() - this.doorBlockPos.getY();
        if (lllIIlllllllIII(lllllllllllllIIIllIIllIIlIIllIII * this.insideDirection.getFrontOffsetX() + lllllllllllllIIIllIIllIIlIIlIlll * this.insideDirection.getFrontOffsetZ())) {
            return VillageDoorInfo.lIlIIllIlIIlIl[1] != 0;
        }
        return VillageDoorInfo.lIlIIllIlIIlIl[2] != 0;
    }
    
    public int getDoorOpeningRestrictionCounter() {
        return this.doorOpeningRestrictionCounter;
    }
    
    public int getInsideOffsetZ() {
        return this.insideDirection.getFrontOffsetZ() * VillageDoorInfo.lIlIIllIlIIlIl[0];
    }
    
    public int getInsideOffsetX() {
        return this.insideDirection.getFrontOffsetX() * VillageDoorInfo.lIlIIllIlIIlIl[0];
    }
    
    public VillageDoorInfo(final BlockPos lllllllllllllIIIllIIllIIllIlIIIl, final int lllllllllllllIIIllIIllIIllIlIIII, final int lllllllllllllIIIllIIllIIllIIllll, final int lllllllllllllIIIllIIllIIllIIlIIl) {
        this(lllllllllllllIIIllIIllIIllIlIIIl, getFaceDirection(lllllllllllllIIIllIIllIIllIlIIII, lllllllllllllIIIllIIllIIllIIllll), lllllllllllllIIIllIIllIIllIIlIIl);
    }
    
    public int getDistanceToDoorBlockSq(final BlockPos lllllllllllllIIIllIIllIIlIlIIlIl) {
        return (int)lllllllllllllIIIllIIllIIlIlIIlIl.distanceSq(this.getDoorBlockPos());
    }
    
    public void func_179849_a(final int lllllllllllllIIIllIIllIIIlllIlIl) {
        this.lastActivityTimestamp = lllllllllllllIIIllIIllIIIlllIlIl;
    }
    
    public void setIsDetachedFromVillageFlag(final boolean lllllllllllllIIIllIIllIIIllIlllI) {
        this.isDetachedFromVillageFlag = lllllllllllllIIIllIIllIIIllIlllI;
    }
    
    public void resetDoorOpeningRestrictionCounter() {
        this.doorOpeningRestrictionCounter = VillageDoorInfo.lIlIIllIlIIlIl[2];
    }
    
    private static boolean lllIIlllllllIII(final int lllllllllllllIIIllIIllIIIllIlIlI) {
        return lllllllllllllIIIllIIllIIIllIlIlI >= 0;
    }
    
    public int getDistanceToInsideBlockSq(final BlockPos lllllllllllllIIIllIIllIIlIIlllll) {
        return (int)this.insideBlock.distanceSq(lllllllllllllIIIllIIllIIlIIlllll);
    }
    
    private static void lllIIllllllIlIl() {
        (lIlIIllIlIIlIl = new int[3])[0] = "  ".length();
        VillageDoorInfo.lIlIIllIlIIlIl[1] = " ".length();
        VillageDoorInfo.lIlIIllIlIIlIl[2] = ((0x16 ^ 0x4B) & ~(0x2B ^ 0x76));
    }
    
    public boolean getIsDetachedFromVillageFlag() {
        return this.isDetachedFromVillageFlag;
    }
    
    static {
        lllIIllllllIlIl();
    }
    
    public VillageDoorInfo(final BlockPos lllllllllllllIIIllIIllIIlIlllIIl, final EnumFacing lllllllllllllIIIllIIllIIlIllllII, final int lllllllllllllIIIllIIllIIlIllIlll) {
        this.doorBlockPos = lllllllllllllIIIllIIllIIlIlllIIl;
        this.insideDirection = lllllllllllllIIIllIIllIIlIllllII;
        this.insideBlock = lllllllllllllIIIllIIllIIlIlllIIl.offset(lllllllllllllIIIllIIllIIlIllllII, VillageDoorInfo.lIlIIllIlIIlIl[0]);
        this.lastActivityTimestamp = lllllllllllllIIIllIIllIIlIllIlll;
    }
}
