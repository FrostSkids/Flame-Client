// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.EntityLiving;

public class EntityAILookIdle extends EntityAIBase
{
    private /* synthetic */ EntityLiving idleEntity;
    private /* synthetic */ int idleTime;
    private /* synthetic */ double lookX;
    private static final /* synthetic */ int[] llllIIllllIII;
    private /* synthetic */ double lookZ;
    
    @Override
    public void startExecuting() {
        final double lllllllllllllIlIlllIIIIlllIlllll = 6.283185307179586 * this.idleEntity.getRNG().nextDouble();
        this.lookX = Math.cos(lllllllllllllIlIlllIIIIlllIlllll);
        this.lookZ = Math.sin(lllllllllllllIlIlllIIIIlllIlllll);
        this.idleTime = EntityAILookIdle.llllIIllllIII[3] + this.idleEntity.getRNG().nextInt(EntityAILookIdle.llllIIllllIII[3]);
    }
    
    private static boolean lIlIlIIlIlIllIl(final int lllllllllllllIlIlllIIIIlllIllIII) {
        return lllllllllllllIlIlllIIIIlllIllIII >= 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIlIlIIlIlIllII(lIlIlIIlIlIlIll(this.idleEntity.getRNG().nextFloat(), 0.02f))) {
            return EntityAILookIdle.llllIIllllIII[1] != 0;
        }
        return EntityAILookIdle.llllIIllllIII[2] != 0;
    }
    
    private static boolean lIlIlIIlIlIllII(final int lllllllllllllIlIlllIIIIlllIlIllI) {
        return lllllllllllllIlIlllIIIIlllIlIllI < 0;
    }
    
    @Override
    public void updateTask() {
        this.idleTime -= EntityAILookIdle.llllIIllllIII[1];
        this.idleEntity.getLookHelper().setLookPosition(this.idleEntity.posX + this.lookX, this.idleEntity.posY + this.idleEntity.getEyeHeight(), this.idleEntity.posZ + this.lookZ, 10.0f, (float)this.idleEntity.getVerticalFaceSpeed());
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIlIlIIlIlIllIl(this.idleTime)) {
            return EntityAILookIdle.llllIIllllIII[1] != 0;
        }
        return EntityAILookIdle.llllIIllllIII[2] != 0;
    }
    
    public EntityAILookIdle(final EntityLiving lllllllllllllIlIlllIIIIllllIlIIl) {
        this.idleEntity = lllllllllllllIlIlllIIIIllllIlIIl;
        this.setMutexBits(EntityAILookIdle.llllIIllllIII[0]);
    }
    
    static {
        lIlIlIIlIlIlIlI();
    }
    
    private static int lIlIlIIlIlIlIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static void lIlIlIIlIlIlIlI() {
        (llllIIllllIII = new int[4])[0] = "   ".length();
        EntityAILookIdle.llllIIllllIII[1] = " ".length();
        EntityAILookIdle.llllIIllllIII[2] = ("   ".length() & ("   ".length() ^ -" ".length()));
        EntityAILookIdle.llllIIllllIII[3] = (0x3C ^ 0x28);
    }
}
