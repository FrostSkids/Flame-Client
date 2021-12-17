// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityLiving;

public class EntityAIOpenDoor extends EntityAIDoorInteract
{
    /* synthetic */ boolean closeDoor;
    private static final /* synthetic */ int[] llIIllllllIlll;
    /* synthetic */ int closeDoorTemporisation;
    
    private static void lIIlIIIIllIIIlII() {
        (llIIllllllIlll = new int[3])[0] = " ".length();
        EntityAIOpenDoor.llIIllllllIlll[1] = ((0xB0 ^ 0x85) & ~(0xB7 ^ 0x82));
        EntityAIOpenDoor.llIIllllllIlll[2] = (0x58 ^ 0x4C);
    }
    
    @Override
    public void startExecuting() {
        this.closeDoorTemporisation = EntityAIOpenDoor.llIIllllllIlll[2];
        this.doorBlock.toggleDoor(this.theEntity.worldObj, this.doorPosition, (boolean)(EntityAIOpenDoor.llIIllllllIlll[0] != 0));
    }
    
    @Override
    public void resetTask() {
        if (lIIlIIIIllIIIlIl(this.closeDoor ? 1 : 0)) {
            this.doorBlock.toggleDoor(this.theEntity.worldObj, this.doorPosition, (boolean)(EntityAIOpenDoor.llIIllllllIlll[1] != 0));
        }
    }
    
    static {
        lIIlIIIIllIIIlII();
    }
    
    private static boolean lIIlIIIIllIIIllI(final int llllllllllllIllIlllIIIlIlIIllIlI) {
        return llllllllllllIllIlllIIIlIlIIllIlI > 0;
    }
    
    public EntityAIOpenDoor(final EntityLiving llllllllllllIllIlllIIIlIlIlIlIll, final boolean llllllllllllIllIlllIIIlIlIlIllIl) {
        super(llllllllllllIllIlllIIIlIlIlIlIll);
        this.theEntity = llllllllllllIllIlllIIIlIlIlIlIll;
        this.closeDoor = llllllllllllIllIlllIIIlIlIlIllIl;
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIIlIIIIllIIIlIl(this.closeDoor ? 1 : 0) && lIIlIIIIllIIIllI(this.closeDoorTemporisation) && lIIlIIIIllIIIlIl(super.continueExecuting() ? 1 : 0)) {
            return EntityAIOpenDoor.llIIllllllIlll[0] != 0;
        }
        return EntityAIOpenDoor.llIIllllllIlll[1] != 0;
    }
    
    @Override
    public void updateTask() {
        this.closeDoorTemporisation -= EntityAIOpenDoor.llIIllllllIlll[0];
        super.updateTask();
    }
    
    private static boolean lIIlIIIIllIIIlIl(final int llllllllllllIllIlllIIIlIlIIlllII) {
        return llllllllllllIllIlllIIIlIlIIlllII != 0;
    }
}
