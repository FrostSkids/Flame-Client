// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.tileentity;

import net.minecraft.util.BlockPos;
import net.minecraft.util.Vec3;
import io.netty.buffer.ByteBuf;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.network.Packet;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.command.CommandResultStats;
import net.minecraft.command.server.CommandBlockLogic;

public class TileEntityCommandBlock extends TileEntity
{
    private final /* synthetic */ CommandBlockLogic commandBlockLogic;
    private static final /* synthetic */ int[] llIlIIIllIlIII;
    
    static {
        lIIlIIlIIIIllIII();
    }
    
    public CommandBlockLogic getCommandBlockLogic() {
        return this.commandBlockLogic;
    }
    
    private static void lIIlIIlIIIIllIII() {
        (llIlIIIllIlIII = new int[2])[0] = "  ".length();
        TileEntityCommandBlock.llIlIIIllIlIII[1] = " ".length();
    }
    
    public CommandResultStats getCommandResultStats() {
        return this.commandBlockLogic.getCommandResultStats();
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound llllllllllllIllIllIIllIIIlIIIIIl) {
        super.writeToNBT(llllllllllllIllIllIIllIIIlIIIIIl);
        this.commandBlockLogic.writeDataToNBT(llllllllllllIllIllIIllIIIlIIIIIl);
    }
    
    @Override
    public Packet getDescriptionPacket() {
        final NBTTagCompound llllllllllllIllIllIIllIIIIllIlIl = new NBTTagCompound();
        this.writeToNBT(llllllllllllIllIllIIllIIIIllIlIl);
        return new S35PacketUpdateTileEntity(this.pos, TileEntityCommandBlock.llIlIIIllIlIII[0], llllllllllllIllIllIIllIIIIllIlIl);
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound llllllllllllIllIllIIllIIIIlllIll) {
        super.readFromNBT(llllllllllllIllIllIIllIIIIlllIll);
        this.commandBlockLogic.readDataFromNBT(llllllllllllIllIllIIllIIIIlllIll);
    }
    
    public TileEntityCommandBlock() {
        this.commandBlockLogic = new CommandBlockLogic() {
            private static final /* synthetic */ int[] lllIlIlIIlIIll;
            
            @Override
            public Entity getCommandSenderEntity() {
                return null;
            }
            
            @Override
            public void setCommand(final String llllllllllllIlIllIllIlIlIIIllllI) {
                super.setCommand(llllllllllllIlIllIllIlIlIIIllllI);
                TileEntityCommandBlock.this.markDirty();
            }
            
            @Override
            public void updateCommand() {
                TileEntityCommandBlock.this.getWorld().markBlockForUpdate(TileEntityCommandBlock.this.pos);
            }
            
            @Override
            public World getEntityWorld() {
                return TileEntityCommandBlock.this.getWorld();
            }
            
            private static void lIlIIIlIllIlllII() {
                (lllIlIlIIlIIll = new int[1])[0] = ((0x9B ^ 0xB7) & ~(0xF ^ 0x23));
            }
            
            @Override
            public void func_145757_a(final ByteBuf llllllllllllIlIllIllIlIlIIIlIIlI) {
                llllllllllllIlIllIllIlIlIIIlIIlI.writeInt(TileEntityCommandBlock.this.pos.getX());
                "".length();
                llllllllllllIlIllIllIlIlIIIlIIlI.writeInt(TileEntityCommandBlock.this.pos.getY());
                "".length();
                llllllllllllIlIllIllIlIlIIIlIIlI.writeInt(TileEntityCommandBlock.this.pos.getZ());
                "".length();
            }
            
            @Override
            public int func_145751_f() {
                return TileEntityCommandBlock$1.lllIlIlIIlIIll[0];
            }
            
            @Override
            public Vec3 getPositionVector() {
                return new Vec3(TileEntityCommandBlock.this.pos.getX() + 0.5, TileEntityCommandBlock.this.pos.getY() + 0.5, TileEntityCommandBlock.this.pos.getZ() + 0.5);
            }
            
            @Override
            public BlockPos getPosition() {
                return TileEntityCommandBlock.this.pos;
            }
            
            static {
                lIlIIIlIllIlllII();
            }
        };
    }
    
    @Override
    public boolean func_183000_F() {
        return TileEntityCommandBlock.llIlIIIllIlIII[1] != 0;
    }
}
