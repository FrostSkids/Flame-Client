// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S10PacketSpawnPainting implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int entityID;
    private /* synthetic */ String title;
    private /* synthetic */ BlockPos position;
    private /* synthetic */ EnumFacing facing;
    
    public EnumFacing getFacing() {
        return this.facing;
    }
    
    public S10PacketSpawnPainting() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlIllIIIIIIlllIlIIll) {
        llllllllllllIlIllIIIIIIlllIlIIll.handleSpawnPainting(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllIIIIIIllllIIIIl) throws IOException {
        this.entityID = llllllllllllIlIllIIIIIIllllIIIIl.readVarIntFromBuffer();
        this.title = llllllllllllIlIllIIIIIIllllIIIIl.readStringFromBuffer(EntityPainting.EnumArt.field_180001_A);
        this.position = llllllllllllIlIllIIIIIIllllIIIIl.readBlockPos();
        this.facing = EnumFacing.getHorizontal(llllllllllllIlIllIIIIIIllllIIIIl.readUnsignedByte());
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public int getEntityID() {
        return this.entityID;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllIIIIIIlllIllIIl) throws IOException {
        llllllllllllIlIllIIIIIIlllIllIIl.writeVarIntToBuffer(this.entityID);
        llllllllllllIlIllIIIIIIlllIllIIl.writeString(this.title);
        "".length();
        llllllllllllIlIllIIIIIIlllIllIIl.writeBlockPos(this.position);
        llllllllllllIlIllIIIIIIlllIllIIl.writeByte(this.facing.getHorizontalIndex());
        "".length();
    }
    
    public BlockPos getPosition() {
        return this.position;
    }
    
    public S10PacketSpawnPainting(final EntityPainting llllllllllllIlIllIIIIIIllllIIlIl) {
        this.entityID = llllllllllllIlIllIIIIIIllllIIlIl.getEntityId();
        this.position = llllllllllllIlIllIIIIIIllllIIlIl.getHangingPosition();
        this.facing = llllllllllllIlIllIIIIIIllllIIlIl.facingDirection;
        this.title = llllllllllllIlIllIIIIIIllllIIlIl.art.title;
    }
}
