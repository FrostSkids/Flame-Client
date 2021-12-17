// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IWorldNameable;

public interface IInventory extends IWorldNameable
{
    void openInventory(final EntityPlayer p0);
    
    ItemStack getStackInSlot(final int p0);
    
    int getFieldCount();
    
    ItemStack removeStackFromSlot(final int p0);
    
    boolean isItemValidForSlot(final int p0, final ItemStack p1);
    
    boolean isUseableByPlayer(final EntityPlayer p0);
    
    int getSizeInventory();
    
    int getInventoryStackLimit();
    
    int getField(final int p0);
    
    void setInventorySlotContents(final int p0, final ItemStack p1);
    
    ItemStack decrStackSize(final int p0, final int p1);
    
    void setField(final int p0, final int p1);
    
    void markDirty();
    
    void closeInventory(final EntityPlayer p0);
    
    void clear();
}
