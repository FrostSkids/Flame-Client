// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityTameable;

public class EntityAISit extends EntityAIBase
{
    private /* synthetic */ boolean isSitting;
    private /* synthetic */ EntityTameable theEntity;
    private static final /* synthetic */ int[] lllIllllIllIII;
    
    @Override
    public void startExecuting() {
        this.theEntity.getNavigator().clearPathEntity();
        this.theEntity.setSitting((boolean)(EntityAISit.lllIllllIllIII[2] != 0));
    }
    
    private static boolean lIlIIllIIIIllIIl(final int llllllllllllIlIlIllllllIIIIIlIlI) {
        return llllllllllllIlIlIllllllIIIIIlIlI < 0;
    }
    
    private static boolean lIlIIllIIIIllIII(final Object llllllllllllIlIlIllllllIIIIlIIII) {
        return llllllllllllIlIlIllllllIIIIlIIII == null;
    }
    
    public EntityAISit(final EntityTameable llllllllllllIlIlIllllllIIIlIlIII) {
        this.theEntity = llllllllllllIlIlIllllllIIIlIlIII;
        this.setMutexBits(EntityAISit.lllIllllIllIII[0]);
    }
    
    static {
        lIlIIllIIIIlIlII();
    }
    
    private static boolean lIlIIllIIIIlIlll(final int llllllllllllIlIlIllllllIIIIIlllI) {
        return llllllllllllIlIlIllllllIIIIIlllI != 0;
    }
    
    public void setSitting(final boolean llllllllllllIlIlIllllllIIIIlIlII) {
        this.isSitting = llllllllllllIlIlIllllllIIIIlIlII;
    }
    
    private static boolean lIlIIllIIIIllIlI(final Object llllllllllllIlIlIllllllIIIIlIIlI) {
        return llllllllllllIlIlIllllllIIIIlIIlI != null;
    }
    
    private static boolean lIlIIllIIIIlIllI(final int llllllllllllIlIlIllllllIIIIIllII) {
        return llllllllllllIlIlIllllllIIIIIllII == 0;
    }
    
    @Override
    public void resetTask() {
        this.theEntity.setSitting((boolean)(EntityAISit.lllIllllIllIII[1] != 0));
    }
    
    private static void lIlIIllIIIIlIlII() {
        (lllIllllIllIII = new int[3])[0] = (0x94 ^ 0x91);
        EntityAISit.lllIllllIllIII[1] = ((0x58 ^ 0x3A ^ (0xD2 ^ 0x88)) & (0xFC ^ 0xB4 ^ (0xD7 ^ 0xA7) ^ -" ".length()));
        EntityAISit.lllIllllIllIII[2] = " ".length();
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIlIIllIIIIlIllI(this.theEntity.isTamed() ? 1 : 0)) {
            return EntityAISit.lllIllllIllIII[1] != 0;
        }
        if (lIlIIllIIIIlIlll(this.theEntity.isInWater() ? 1 : 0)) {
            return EntityAISit.lllIllllIllIII[1] != 0;
        }
        if (lIlIIllIIIIlIllI(this.theEntity.onGround ? 1 : 0)) {
            return EntityAISit.lllIllllIllIII[1] != 0;
        }
        final EntityLivingBase llllllllllllIlIlIllllllIIIlIIIlI = this.theEntity.getOwner();
        int isSitting;
        if (lIlIIllIIIIllIII(llllllllllllIlIlIllllllIIIlIIIlI)) {
            isSitting = EntityAISit.lllIllllIllIII[2];
            "".length();
            if ("   ".length() <= 0) {
                return ((0xDF ^ 0x98) & ~(0x50 ^ 0x17)) != 0x0;
            }
        }
        else if (lIlIIllIIIIllIIl(lIlIIllIIIIlIlIl(this.theEntity.getDistanceSqToEntity(llllllllllllIlIlIllllllIIIlIIIlI), 144.0)) && lIlIIllIIIIllIlI(llllllllllllIlIlIllllllIIIlIIIlI.getAITarget())) {
            isSitting = EntityAISit.lllIllllIllIII[1];
            "".length();
            if (null != null) {
                return ((0xC1 ^ 0x91) & ~(0x2A ^ 0x7A)) != 0x0;
            }
        }
        else {
            isSitting = (this.isSitting ? 1 : 0);
        }
        return isSitting != 0;
    }
    
    private static int lIlIIllIIIIlIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
}
