// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S19PacketEntityHeadLook implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int entityId;
    private /* synthetic */ byte yaw;
    
    public S19PacketEntityHeadLook() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIIlIlIlIllIIllIll) {
        lllllllllllllIlIIlIlIlIllIIllIll.handleEntityHeadLook(this);
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIlIlIlIllIlIIIIl) throws IOException {
        lllllllllllllIlIIlIlIlIllIlIIIIl.writeVarIntToBuffer(this.entityId);
        lllllllllllllIlIIlIlIlIllIlIIIIl.writeByte(this.yaw);
        "".length();
    }
    
    public byte getYaw() {
        return this.yaw;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIlIlIlIllIlIIlll) throws IOException {
        this.entityId = lllllllllllllIlIIlIlIlIllIlIIlll.readVarIntFromBuffer();
        this.yaw = lllllllllllllIlIIlIlIlIllIlIIlll.readByte();
    }
    
    public S19PacketEntityHeadLook(final Entity lllllllllllllIlIIlIlIlIllIlIlllI, final byte lllllllllllllIlIIlIlIlIllIlIllIl) {
        this.entityId = lllllllllllllIlIIlIlIlIllIlIlllI.getEntityId();
        this.yaw = lllllllllllllIlIIlIlIlIllIlIllIl;
    }
    
    public Entity getEntity(final World lllllllllllllIlIIlIlIlIllIIlIlll) {
        return lllllllllllllIlIIlIlIlIllIIlIlll.getEntityByID(this.entityId);
    }
}
