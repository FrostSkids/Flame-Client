// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.entity.EntityCreature;

public class EntityAIRestrictSun extends EntityAIBase
{
    private /* synthetic */ EntityCreature theEntity;
    private static final /* synthetic */ int[] lIlllllIIlIlII;
    
    public EntityAIRestrictSun(final EntityCreature llllllllllllIllllIIlllIlIlllllll) {
        this.theEntity = llllllllllllIllllIIlllIlIlllllll;
    }
    
    static {
        lIIIIlIlIIlIlIll();
    }
    
    @Override
    public void resetTask() {
        ((PathNavigateGround)this.theEntity.getNavigator()).setAvoidSun((boolean)(EntityAIRestrictSun.lIlllllIIlIlII[1] != 0));
    }
    
    @Override
    public void startExecuting() {
        ((PathNavigateGround)this.theEntity.getNavigator()).setAvoidSun((boolean)(EntityAIRestrictSun.lIlllllIIlIlII[0] != 0));
    }
    
    @Override
    public boolean shouldExecute() {
        return this.theEntity.worldObj.isDaytime();
    }
    
    private static void lIIIIlIlIIlIlIll() {
        (lIlllllIIlIlII = new int[2])[0] = " ".length();
        EntityAIRestrictSun.lIlllllIIlIlII[1] = ((0x7A ^ 0xE ^ (0xEC ^ 0x83)) & (0xCF ^ 0x9A ^ (0xE1 ^ 0xAF) ^ -" ".length()));
    }
}
