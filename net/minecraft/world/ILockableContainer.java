// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world;

import net.minecraft.inventory.IInventory;

public interface ILockableContainer extends IInventory, IInteractionObject
{
    void setLockCode(final LockCode p0);
    
    boolean isLocked();
    
    LockCode getLockCode();
}
