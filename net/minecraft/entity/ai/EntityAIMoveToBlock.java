// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.entity.EntityCreature;
import net.minecraft.util.BlockPos;

public abstract class EntityAIMoveToBlock extends EntityAIBase
{
    protected /* synthetic */ BlockPos destinationBlock;
    private /* synthetic */ int field_179490_f;
    private final /* synthetic */ EntityCreature theEntity;
    private static final /* synthetic */ int[] llIllllllllllI;
    private /* synthetic */ int searchLength;
    private /* synthetic */ boolean isAboveDestination;
    private /* synthetic */ int timeoutCounter;
    protected /* synthetic */ int runDelay;
    private final /* synthetic */ double movementSpeed;
    
    private static boolean lIIllIlllIlIllll(final int llllllllllllIllIIIlIlIIIIllIIlll) {
        return llllllllllllIllIIIlIlIIIIllIIlll != 0;
    }
    
    @Override
    public void startExecuting() {
        this.theEntity.getNavigator().tryMoveToXYZ((float)this.destinationBlock.getX() + 0.5, this.destinationBlock.getY() + EntityAIMoveToBlock.llIllllllllllI[1], (float)this.destinationBlock.getZ() + 0.5, this.movementSpeed);
        "".length();
        this.timeoutCounter = EntityAIMoveToBlock.llIllllllllllI[2];
        this.field_179490_f = this.theEntity.getRNG().nextInt(this.theEntity.getRNG().nextInt(EntityAIMoveToBlock.llIllllllllllI[4]) + EntityAIMoveToBlock.llIllllllllllI[4]) + EntityAIMoveToBlock.llIllllllllllI[4];
    }
    
    private static boolean lIIllIlllIllIIll(final int llllllllllllIllIIIlIlIIIIllIlIlI, final int llllllllllllIllIIIlIlIIIIllIlIIl) {
        return llllllllllllIllIIIlIlIIIIllIlIlI > llllllllllllIllIIIlIlIIIIllIlIIl;
    }
    
    private static boolean lIIllIlllIlIlllI(final int llllllllllllIllIIIlIlIIIIllIlllI, final int llllllllllllIllIIIlIlIIIIllIllIl) {
        return llllllllllllIllIIIlIlIIIIllIlllI <= llllllllllllIllIIIlIlIIIIllIllIl;
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIIllIlllIlIllIl(this.timeoutCounter, -this.field_179490_f) && lIIllIlllIlIlllI(this.timeoutCounter, EntityAIMoveToBlock.llIllllllllllI[4]) && lIIllIlllIlIllll(this.shouldMoveTo(this.theEntity.worldObj, this.destinationBlock) ? 1 : 0)) {
            return EntityAIMoveToBlock.llIllllllllllI[1] != 0;
        }
        return EntityAIMoveToBlock.llIllllllllllI[2] != 0;
    }
    
    static {
        lIIllIlllIlIlIll();
    }
    
    public EntityAIMoveToBlock(final EntityCreature llllllllllllIllIIIlIlIIIlIlIIllI, final double llllllllllllIllIIIlIlIIIlIlIlIIl, final int llllllllllllIllIIIlIlIIIlIlIIlII) {
        this.destinationBlock = BlockPos.ORIGIN;
        this.theEntity = llllllllllllIllIIIlIlIIIlIlIIllI;
        this.movementSpeed = llllllllllllIllIIIlIlIIIlIlIlIIl;
        this.searchLength = llllllllllllIllIIIlIlIIIlIlIIlII;
        this.setMutexBits(EntityAIMoveToBlock.llIllllllllllI[0]);
    }
    
    private static boolean lIIllIlllIlIllII(final int llllllllllllIllIIIlIlIIIIllIIIll) {
        return llllllllllllIllIIIlIlIIIIllIIIll > 0;
    }
    
    protected boolean getIsAboveDestination() {
        return this.isAboveDestination;
    }
    
    private static boolean lIIllIlllIllIIlI(final int llllllllllllIllIIIlIlIIIIlllIIlI, final int llllllllllllIllIIIlIlIIIIlllIIIl) {
        return llllllllllllIllIIIlIlIIIIlllIIlI < llllllllllllIllIIIlIlIIIIlllIIIl;
    }
    
    @Override
    public void updateTask() {
        if (lIIllIlllIlIllII(lIIllIlllIllIIII(this.theEntity.getDistanceSqToCenter(this.destinationBlock.up()), 1.0))) {
            this.isAboveDestination = (EntityAIMoveToBlock.llIllllllllllI[2] != 0);
            this.timeoutCounter += EntityAIMoveToBlock.llIllllllllllI[1];
            if (lIIllIlllIllIIIl(this.timeoutCounter % EntityAIMoveToBlock.llIllllllllllI[5])) {
                this.theEntity.getNavigator().tryMoveToXYZ((float)this.destinationBlock.getX() + 0.5, this.destinationBlock.getY() + EntityAIMoveToBlock.llIllllllllllI[1], (float)this.destinationBlock.getZ() + 0.5, this.movementSpeed);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else {
            this.isAboveDestination = (EntityAIMoveToBlock.llIllllllllllI[1] != 0);
            this.timeoutCounter -= EntityAIMoveToBlock.llIllllllllllI[1];
        }
    }
    
    private static int lIIllIlllIllIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected abstract boolean shouldMoveTo(final World p0, final BlockPos p1);
    
    private static boolean lIIllIlllIllIIIl(final int llllllllllllIllIIIlIlIIIIllIIlIl) {
        return llllllllllllIllIIIlIlIIIIllIIlIl == 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIIllIlllIlIllII(this.runDelay)) {
            this.runDelay -= EntityAIMoveToBlock.llIllllllllllI[1];
            return EntityAIMoveToBlock.llIllllllllllI[2] != 0;
        }
        this.runDelay = EntityAIMoveToBlock.llIllllllllllI[3] + this.theEntity.getRNG().nextInt(EntityAIMoveToBlock.llIllllllllllI[3]);
        return this.searchForDestination();
    }
    
    private boolean searchForDestination() {
        final int llllllllllllIllIIIlIlIIIlIIIlIIl = this.searchLength;
        final int llllllllllllIllIIIlIlIIIlIIIlIII = EntityAIMoveToBlock.llIllllllllllI[1];
        final BlockPos llllllllllllIllIIIlIlIIIlIIIIlll = new BlockPos(this.theEntity);
        int llllllllllllIllIIIlIlIIIlIIIIllI = EntityAIMoveToBlock.llIllllllllllI[2];
        "".length();
        if (" ".length() <= -" ".length()) {
            return ((195 + 96 - 158 + 64 ^ 83 + 32 - 104 + 131) & (0xE0 ^ 0x96 ^ (0x91 ^ 0xAC) ^ -" ".length())) != 0x0;
        }
        while (!lIIllIlllIllIIll(llllllllllllIllIIIlIlIIIlIIIIllI, EntityAIMoveToBlock.llIllllllllllI[1])) {
            int llllllllllllIllIIIlIlIIIlIIIIlIl = EntityAIMoveToBlock.llIllllllllllI[2];
            "".length();
            if (-(0xA ^ 0x69 ^ (0x31 ^ 0x56)) >= 0) {
                return ((0xEB ^ 0xA4 ^ (0x80 ^ 0x97)) & (0x77 ^ 0x57 ^ (0xD0 ^ 0xA8) ^ -" ".length())) != 0x0;
            }
            while (!lIIllIlllIlIllIl(llllllllllllIllIIIlIlIIIlIIIIlIl, llllllllllllIllIIIlIlIIIlIIIlIIl)) {
                int llllllllllllIllIIIlIlIIIlIIIIlII = EntityAIMoveToBlock.llIllllllllllI[2];
                "".length();
                if (((0x92 ^ 0xBF ^ (0x28 ^ 0x46)) & (119 + 82 - 142 + 71 ^ 109 + 99 - 204 + 189 ^ -" ".length())) >= " ".length()) {
                    return ((0x4 ^ 0x2D ^ (0x19 ^ 0x29)) & (0x30 ^ 0x48 ^ (0x4B ^ 0x2A) ^ -" ".length())) != 0x0;
                }
                while (!lIIllIlllIllIIll(llllllllllllIllIIIlIlIIIlIIIIlII, llllllllllllIllIIIlIlIIIlIIIIlIl)) {
                    int n;
                    if (lIIllIlllIllIIlI(llllllllllllIllIIIlIlIIIlIIIIlII, llllllllllllIllIIIlIlIIIlIIIIlIl) && lIIllIlllIllIIll(llllllllllllIllIIIlIlIIIlIIIIlII, -llllllllllllIllIIIlIlIIIlIIIIlIl)) {
                        n = llllllllllllIllIIIlIlIIIlIIIIlIl;
                        "".length();
                        if ("  ".length() > "  ".length()) {
                            return ((0x8C ^ 0x8B) & ~(0x62 ^ 0x65)) != 0x0;
                        }
                    }
                    else {
                        n = EntityAIMoveToBlock.llIllllllllllI[2];
                    }
                    int llllllllllllIllIIIlIlIIIlIIIIIll = n;
                    "".length();
                    if ("   ".length() == "  ".length()) {
                        return ((0xC6 ^ 0x80) & ~(0x32 ^ 0x74)) != 0x0;
                    }
                    while (!lIIllIlllIllIIll(llllllllllllIllIIIlIlIIIlIIIIIll, llllllllllllIllIIIlIlIIIlIIIIlIl)) {
                        final BlockPos llllllllllllIllIIIlIlIIIlIIIIIlI = llllllllllllIllIIIlIlIIIlIIIIlll.add(llllllllllllIllIIIlIlIIIlIIIIlII, llllllllllllIllIIIlIlIIIlIIIIllI - EntityAIMoveToBlock.llIllllllllllI[1], llllllllllllIllIIIlIlIIIlIIIIIll);
                        if (lIIllIlllIlIllll(this.theEntity.isWithinHomeDistanceFromPosition(llllllllllllIllIIIlIlIIIlIIIIIlI) ? 1 : 0) && lIIllIlllIlIllll(this.shouldMoveTo(this.theEntity.worldObj, llllllllllllIllIIIlIlIIIlIIIIIlI) ? 1 : 0)) {
                            this.destinationBlock = llllllllllllIllIIIlIlIIIlIIIIIlI;
                            return EntityAIMoveToBlock.llIllllllllllI[1] != 0;
                        }
                        int n2;
                        if (lIIllIlllIlIllII(llllllllllllIllIIIlIlIIIlIIIIIll)) {
                            n2 = -llllllllllllIllIIIlIlIIIlIIIIIll;
                            "".length();
                            if ("  ".length() == "   ".length()) {
                                return ((0xD7 ^ 0xC6) & ~(0x5C ^ 0x4D)) != 0x0;
                            }
                        }
                        else {
                            n2 = EntityAIMoveToBlock.llIllllllllllI[1] - llllllllllllIllIIIlIlIIIlIIIIIll;
                        }
                        llllllllllllIllIIIlIlIIIlIIIIIll = n2;
                    }
                    int n3;
                    if (lIIllIlllIlIllII(llllllllllllIllIIIlIlIIIlIIIIlII)) {
                        n3 = -llllllllllllIllIIIlIlIIIlIIIIlII;
                        "".length();
                        if (((0x65 ^ 0x5F) & ~(0x70 ^ 0x4A)) != 0x0) {
                            return ((0x1A ^ 0xA) & ~(0x96 ^ 0x86)) != 0x0;
                        }
                    }
                    else {
                        n3 = EntityAIMoveToBlock.llIllllllllllI[1] - llllllllllllIllIIIlIlIIIlIIIIlII;
                    }
                    llllllllllllIllIIIlIlIIIlIIIIlII = n3;
                }
                ++llllllllllllIllIIIlIlIIIlIIIIlIl;
            }
            int n4;
            if (lIIllIlllIlIllII(llllllllllllIllIIIlIlIIIlIIIIllI)) {
                n4 = -llllllllllllIllIIIlIlIIIlIIIIllI;
                "".length();
                if (null != null) {
                    return ((20 + 56 + 16 + 77 ^ 182 + 79 - 223 + 145) & (0x22 ^ 0x69 ^ (0xF5 ^ 0xA0) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n4 = EntityAIMoveToBlock.llIllllllllllI[1] - llllllllllllIllIIIlIlIIIlIIIIllI;
            }
            llllllllllllIllIIIlIlIIIlIIIIllI = n4;
        }
        return EntityAIMoveToBlock.llIllllllllllI[2] != 0;
    }
    
    private static void lIIllIlllIlIlIll() {
        (llIllllllllllI = new int[6])[0] = (0xB2 ^ 0x87 ^ (0x95 ^ 0xA5));
        EntityAIMoveToBlock.llIllllllllllI[1] = " ".length();
        EntityAIMoveToBlock.llIllllllllllI[2] = ((0x59 ^ 0x68) & ~(0x4D ^ 0x7C));
        EntityAIMoveToBlock.llIllllllllllI[3] = 198 + 76 - 115 + 41;
        EntityAIMoveToBlock.llIllllllllllI[4] = (-(0xFFFFF2DA & 0x7F2D) & (0xFFFFFEF7 & 0x77BF));
        EntityAIMoveToBlock.llIllllllllllI[5] = (126 + 65 - 122 + 59 ^ 116 + 116 - 170 + 106);
    }
    
    @Override
    public void resetTask() {
    }
    
    private static boolean lIIllIlllIlIllIl(final int llllllllllllIllIIIlIlIIIIlllIllI, final int llllllllllllIllIIIlIlIIIIlllIlIl) {
        return llllllllllllIllIIIlIlIIIIlllIllI >= llllllllllllIllIIIlIlIIIIlllIlIl;
    }
}
