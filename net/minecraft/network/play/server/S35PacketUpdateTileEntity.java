// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S35PacketUpdateTileEntity implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int metadata;
    private /* synthetic */ BlockPos blockPos;
    private /* synthetic */ NBTTagCompound nbt;
    
    public int getTileEntityType() {
        return this.metadata;
    }
    
    public NBTTagCompound getNbtCompound() {
        return this.nbt;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIIIIIllIllIIIIlllI) {
        lllllllllllllIIIIIIllIllIIIIlllI.handleUpdateTileEntity(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIIIIllIllIIIlllII) throws IOException {
        this.blockPos = lllllllllllllIIIIIIllIllIIIlllII.readBlockPos();
        this.metadata = lllllllllllllIIIIIIllIllIIIlllII.readUnsignedByte();
        this.nbt = lllllllllllllIIIIIIllIllIIIlllII.readNBTTagCompoundFromBuffer();
    }
    
    public S35PacketUpdateTileEntity() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIIIIllIllIIIlIlII) throws IOException {
        lllllllllllllIIIIIIllIllIIIlIlII.writeBlockPos(this.blockPos);
        lllllllllllllIIIIIIllIllIIIlIlII.writeByte((byte)this.metadata);
        "".length();
        lllllllllllllIIIIIIllIllIIIlIlII.writeNBTTagCompoundToBuffer(this.nbt);
    }
    
    public BlockPos getPos() {
        return this.blockPos;
    }
    
    public S35PacketUpdateTileEntity(final BlockPos lllllllllllllIIIIIIllIllIIlIIIlI, final int lllllllllllllIIIIIIllIllIIlIIlIl, final NBTTagCompound lllllllllllllIIIIIIllIllIIlIIlII) {
        this.blockPos = lllllllllllllIIIIIIllIllIIlIIIlI;
        this.metadata = lllllllllllllIIIIIIllIllIIlIIlIl;
        this.nbt = lllllllllllllIIIIIIllIllIIlIIlII;
    }
}
