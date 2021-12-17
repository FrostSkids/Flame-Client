// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.entity.EntityLiving;

public class EntityAISwimming extends EntityAIBase
{
    private /* synthetic */ EntityLiving theEntity;
    private static final /* synthetic */ int[] llIIlIllIlIlII;
    
    static {
        lIIIllIllIllIIll();
    }
    
    private static boolean lIIIllIllIllIlII(final int llllllllllllIlllIIIlIlIIIIlIIllI) {
        return llllllllllllIlllIIIlIlIIIIlIIllI == 0;
    }
    
    private static void lIIIllIllIllIIll() {
        (llIIlIllIlIlII = new int[3])[0] = (98 + 43 - 97 + 144 ^ 163 + 30 - 56 + 47);
        EntityAISwimming.llIIlIllIlIlII[1] = " ".length();
        EntityAISwimming.llIIlIllIlIlII[2] = ((0x53 ^ 0x3 ^ (0x29 ^ 0x7D)) & (0x69 ^ 0x10 ^ (0x7 ^ 0x7A) ^ -" ".length()));
    }
    
    public EntityAISwimming(final EntityLiving llllllllllllIlllIIIlIlIIIIllIIII) {
        this.theEntity = llllllllllllIlllIIIlIlIIIIllIIII;
        this.setMutexBits(EntityAISwimming.llIIlIllIlIlII[0]);
        ((PathNavigateGround)llllllllllllIlllIIIlIlIIIIllIIII.getNavigator()).setCanSwim((boolean)(EntityAISwimming.llIIlIllIlIlII[1] != 0));
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIIIllIllIllIlII(this.theEntity.isInWater() ? 1 : 0) && lIIIllIllIllIlII(this.theEntity.isInLava() ? 1 : 0)) {
            return EntityAISwimming.llIIlIllIlIlII[2] != 0;
        }
        return EntityAISwimming.llIIlIllIlIlII[1] != 0;
    }
    
    private static int lIIIllIllIllIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void updateTask() {
        if (lIIIllIllIllIllI(lIIIllIllIllIlIl(this.theEntity.getRNG().nextFloat(), 0.8f))) {
            this.theEntity.getJumpHelper().setJumping();
        }
    }
    
    private static boolean lIIIllIllIllIllI(final int llllllllllllIlllIIIlIlIIIIlIIlII) {
        return llllllllllllIlllIIIlIlIIIIlIIlII < 0;
    }
}
