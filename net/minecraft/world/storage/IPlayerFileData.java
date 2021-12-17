// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;

public interface IPlayerFileData
{
    NBTTagCompound readPlayerData(final EntityPlayer p0);
    
    String[] getAvailablePlayerDat();
    
    void writePlayerData(final EntityPlayer p0);
}
