// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import net.minecraft.dispenser.IBlockSource;

public class BlockSourceImpl implements IBlockSource
{
    private final /* synthetic */ BlockPos pos;
    private final /* synthetic */ World worldObj;
    
    @Override
    public double getZ() {
        return this.pos.getZ() + 0.5;
    }
    
    @Override
    public double getX() {
        return this.pos.getX() + 0.5;
    }
    
    @Override
    public World getWorld() {
        return this.worldObj;
    }
    
    @Override
    public double getY() {
        return this.pos.getY() + 0.5;
    }
    
    public BlockSourceImpl(final World lllllllllllllIIllIIllIlIllllllll, final BlockPos lllllllllllllIIllIIllIlIlllllllI) {
        this.worldObj = lllllllllllllIIllIIllIlIllllllll;
        this.pos = lllllllllllllIIllIIllIlIlllllllI;
    }
    
    @Override
    public BlockPos getBlockPos() {
        return this.pos;
    }
    
    @Override
    public int getBlockMetadata() {
        final IBlockState lllllllllllllIIllIIllIlIlllIlIll = this.worldObj.getBlockState(this.pos);
        return lllllllllllllIIllIIllIlIlllIlIll.getBlock().getMetaFromState(lllllllllllllIIllIIllIlIlllIlIll);
    }
    
    @Override
    public <T extends TileEntity> T getBlockTileEntity() {
        return (T)this.worldObj.getTileEntity(this.pos);
    }
}
