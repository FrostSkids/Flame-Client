// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.dispenser;

import net.minecraft.util.BlockPos;
import net.minecraft.tileentity.TileEntity;

public interface IBlockSource extends ILocatableSource
{
    double getY();
    
    int getBlockMetadata();
    
    double getZ();
    
     <T extends TileEntity> T getBlockTileEntity();
    
    BlockPos getBlockPos();
    
    double getX();
}
