// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.boss.EntityDragonPart;

public interface IEntityMultiPart
{
    boolean attackEntityFromPart(final EntityDragonPart p0, final DamageSource p1, final float p2);
    
    World getWorld();
}
