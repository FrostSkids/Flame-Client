// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

public abstract class EntityAIBase
{
    private /* synthetic */ int mutexBits;
    private static final /* synthetic */ int[] lIlllllIIlIIlI;
    
    public boolean continueExecuting() {
        return this.shouldExecute();
    }
    
    public boolean isInterruptible() {
        return EntityAIBase.lIlllllIIlIIlI[0] != 0;
    }
    
    public void startExecuting() {
    }
    
    public abstract boolean shouldExecute();
    
    public void setMutexBits(final int llllllllllllIllllIIlllIllIIIlIlI) {
        this.mutexBits = llllllllllllIllllIIlllIllIIIlIlI;
    }
    
    static {
        lIIIIlIlIIlIlIlI();
    }
    
    private static void lIIIIlIlIIlIlIlI() {
        (lIlllllIIlIIlI = new int[1])[0] = " ".length();
    }
    
    public void resetTask() {
    }
    
    public int getMutexBits() {
        return this.mutexBits;
    }
    
    public void updateTask() {
    }
}
