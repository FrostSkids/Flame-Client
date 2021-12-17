// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.tileentity.MobSpawnerBaseLogic;
import net.minecraft.entity.item.EntityMinecart;

public class EntityMinecartMobSpawner extends EntityMinecart
{
    private final /* synthetic */ MobSpawnerBaseLogic mobSpawnerLogic;
    
    public EntityMinecartMobSpawner(final World llllllllllllIllIIllIIlIlIIIlllII) {
        super(llllllllllllIllIIllIIlIlIIIlllII);
        this.mobSpawnerLogic = new MobSpawnerBaseLogic() {
            @Override
            public void func_98267_a(final int llllllllllllIllIIlIIllllIlIlIIll) {
                EntityMinecartMobSpawner.this.worldObj.setEntityState(EntityMinecartMobSpawner.this, (byte)llllllllllllIllIIlIIllllIlIlIIll);
            }
            
            @Override
            public BlockPos getSpawnerPosition() {
                return new BlockPos(EntityMinecartMobSpawner.this);
            }
            
            @Override
            public World getSpawnerWorld() {
                return EntityMinecartMobSpawner.this.worldObj;
            }
        };
    }
    
    public MobSpawnerBaseLogic func_98039_d() {
        return this.mobSpawnerLogic;
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound llllllllllllIllIIllIIlIIllllllll) {
        super.writeEntityToNBT(llllllllllllIllIIllIIlIIllllllll);
        this.mobSpawnerLogic.writeToNBT(llllllllllllIllIIllIIlIIllllllll);
    }
    
    @Override
    public IBlockState getDefaultDisplayTile() {
        return Blocks.mob_spawner.getDefaultState();
    }
    
    public EntityMinecartMobSpawner(final World llllllllllllIllIIllIIlIlIIIIlllI, final double llllllllllllIllIIllIIlIlIIIIllIl, final double llllllllllllIllIIllIIlIlIIIlIIIl, final double llllllllllllIllIIllIIlIlIIIIlIll) {
        super(llllllllllllIllIIllIIlIlIIIIlllI, llllllllllllIllIIllIIlIlIIIIllIl, llllllllllllIllIIllIIlIlIIIlIIIl, llllllllllllIllIIllIIlIlIIIIlIll);
        this.mobSpawnerLogic = new MobSpawnerBaseLogic() {
            @Override
            public void func_98267_a(final int llllllllllllIllIIlIIllllIlIlIIll) {
                EntityMinecartMobSpawner.this.worldObj.setEntityState(EntityMinecartMobSpawner.this, (byte)llllllllllllIllIIlIIllllIlIlIIll);
            }
            
            @Override
            public BlockPos getSpawnerPosition() {
                return new BlockPos(EntityMinecartMobSpawner.this);
            }
            
            @Override
            public World getSpawnerWorld() {
                return EntityMinecartMobSpawner.this.worldObj;
            }
        };
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        this.mobSpawnerLogic.updateSpawner();
    }
    
    @Override
    public EnumMinecartType getMinecartType() {
        return EnumMinecartType.SPAWNER;
    }
    
    @Override
    public void handleStatusUpdate(final byte llllllllllllIllIIllIIlIIllllIlll) {
        this.mobSpawnerLogic.setDelayToMin(llllllllllllIllIIllIIlIIllllIlll);
        "".length();
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound llllllllllllIllIIllIIlIlIIIIIlIl) {
        super.readEntityFromNBT(llllllllllllIllIIllIIlIlIIIIIlIl);
        this.mobSpawnerLogic.readFromNBT(llllllllllllIllIIllIIlIlIIIIIlIl);
    }
}
