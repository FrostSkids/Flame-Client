// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.util.BlockPos;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityGiantZombie extends EntityMob
{
    @Override
    public float getEyeHeight() {
        return 10.440001f;
    }
    
    public EntityGiantZombie(final World lllllllllllllIIIIIlIllllIllllIIl) {
        super(lllllllllllllIIIIIlIllllIllllIIl);
        this.setSize(this.width * 6.0f, this.height * 6.0f);
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(50.0);
    }
    
    @Override
    public float getBlockPathWeight(final BlockPos lllllllllllllIIIIIlIllllIllIllll) {
        return this.worldObj.getLightBrightness(lllllllllllllIIIIIlIllllIllIllll) - 0.5f;
    }
}
