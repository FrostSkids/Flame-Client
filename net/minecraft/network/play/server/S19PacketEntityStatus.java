// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S19PacketEntityStatus implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int entityId;
    private /* synthetic */ byte logicOpcode;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIllIlllIlllIIIIIl) throws IOException {
        llllllllllllIllIllIlllIlllIIIIIl.writeInt(this.entityId);
        "".length();
        llllllllllllIllIllIlllIlllIIIIIl.writeByte(this.logicOpcode);
        "".length();
    }
    
    public Entity getEntity(final World llllllllllllIllIllIlllIllIllIlIl) {
        return llllllllllllIllIllIlllIllIllIlIl.getEntityByID(this.entityId);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIllIlllIllIlllIIl) {
        llllllllllllIllIllIlllIllIlllIIl.handleEntityStatus(this);
    }
    
    public S19PacketEntityStatus(final Entity llllllllllllIllIllIlllIlllIIllll, final byte llllllllllllIllIllIlllIlllIIlIll) {
        this.entityId = llllllllllllIllIllIlllIlllIIllll.getEntityId();
        this.logicOpcode = llllllllllllIllIllIlllIlllIIlIll;
    }
    
    public byte getOpCode() {
        return this.logicOpcode;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIllIlllIlllIIIlIl) throws IOException {
        this.entityId = llllllllllllIllIllIlllIlllIIIlIl.readInt();
        this.logicOpcode = llllllllllllIllIllIlllIlllIIIlIl.readByte();
    }
    
    public S19PacketEntityStatus() {
    }
}
