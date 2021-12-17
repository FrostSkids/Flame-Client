// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.storage;

import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.WorldProvider;
import java.io.File;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.MinecraftException;

public interface ISaveHandler
{
    WorldInfo loadWorldInfo();
    
    void checkSessionLock() throws MinecraftException;
    
    void saveWorldInfo(final WorldInfo p0);
    
    void flush();
    
    String getWorldDirectoryName();
    
    void saveWorldInfoWithPlayer(final WorldInfo p0, final NBTTagCompound p1);
    
    File getWorldDirectory();
    
    IPlayerFileData getPlayerNBTManager();
    
    File getMapFileFromName(final String p0);
    
    IChunkLoader getChunkLoader(final WorldProvider p0);
}
