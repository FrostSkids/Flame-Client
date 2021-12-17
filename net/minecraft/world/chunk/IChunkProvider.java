// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk;

import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EnumCreatureType;

public interface IChunkProvider
{
    List<BiomeGenBase.SpawnListEntry> getPossibleCreatures(final EnumCreatureType p0, final BlockPos p1);
    
    BlockPos getStrongholdGen(final World p0, final String p1, final BlockPos p2);
    
    boolean saveChunks(final boolean p0, final IProgressUpdate p1);
    
    boolean chunkExists(final int p0, final int p1);
    
    Chunk provideChunk(final BlockPos p0);
    
    Chunk provideChunk(final int p0, final int p1);
    
    String makeString();
    
    void populate(final IChunkProvider p0, final int p1, final int p2);
    
    void recreateStructures(final Chunk p0, final int p1, final int p2);
    
    int getLoadedChunkCount();
    
    boolean unloadQueuedChunks();
    
    boolean func_177460_a(final IChunkProvider p0, final Chunk p1, final int p2, final int p3);
    
    boolean canSave();
    
    void saveExtraData();
}
