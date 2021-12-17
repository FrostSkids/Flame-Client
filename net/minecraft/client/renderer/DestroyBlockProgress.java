// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.util.BlockPos;

public class DestroyBlockProgress
{
    private /* synthetic */ int createdAtCloudUpdateTick;
    private final /* synthetic */ int miningPlayerEntId;
    private final /* synthetic */ BlockPos position;
    private /* synthetic */ int partialBlockProgress;
    private static final /* synthetic */ int[] lIllIIIIIllllI;
    
    public void setCloudUpdateTick(final int lllllllllllllIIIIlIIIlIllIIlIIll) {
        this.createdAtCloudUpdateTick = lllllllllllllIIIIlIIIlIllIIlIIll;
    }
    
    public int getPartialBlockDamage() {
        return this.partialBlockProgress;
    }
    
    public DestroyBlockProgress(final int lllllllllllllIIIIlIIIlIllIlIIlll, final BlockPos lllllllllllllIIIIlIIIlIllIlIIIll) {
        this.miningPlayerEntId = lllllllllllllIIIIlIIIlIllIlIIlll;
        this.position = lllllllllllllIIIIlIIIlIllIlIIIll;
    }
    
    public int getCreationCloudUpdateTick() {
        return this.createdAtCloudUpdateTick;
    }
    
    private static void llllIllIIlIIlII() {
        (lIllIIIIIllllI = new int[1])[0] = (0xAB ^ 0xA1);
    }
    
    public void setPartialBlockDamage(int lllllllllllllIIIIlIIIlIllIIllIlI) {
        if (llllIllIIlIIlIl((int)lllllllllllllIIIIlIIIlIllIIllIlI, DestroyBlockProgress.lIllIIIIIllllI[0])) {
            lllllllllllllIIIIlIIIlIllIIllIlI = DestroyBlockProgress.lIllIIIIIllllI[0];
        }
        this.partialBlockProgress = (int)lllllllllllllIIIIlIIIlIllIIllIlI;
    }
    
    public BlockPos getPosition() {
        return this.position;
    }
    
    static {
        llllIllIIlIIlII();
    }
    
    private static boolean llllIllIIlIIlIl(final int lllllllllllllIIIIlIIIlIllIIIlIll, final int lllllllllllllIIIIlIIIlIllIIIlIlI) {
        return lllllllllllllIIIIlIIIlIllIIIlIll > lllllllllllllIIIIlIIIlIllIIIlIlI;
    }
}
