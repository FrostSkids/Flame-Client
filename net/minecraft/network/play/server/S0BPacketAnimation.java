// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.entity.Entity;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S0BPacketAnimation implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int entityId;
    private /* synthetic */ int type;
    
    public S0BPacketAnimation(final Entity lllllllllllllIIlllIIlIIIIllIllII, final int lllllllllllllIIlllIIlIIIIllIlIll) {
        this.entityId = lllllllllllllIIlllIIlIIIIllIllII.getEntityId();
        this.type = lllllllllllllIIlllIIlIIIIllIlIll;
    }
    
    public int getAnimationType() {
        return this.type;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlllIIlIIIIllIIIlI) throws IOException {
        this.entityId = lllllllllllllIIlllIIlIIIIllIIIlI.readVarIntFromBuffer();
        this.type = lllllllllllllIIlllIIlIIIIllIIIlI.readUnsignedByte();
    }
    
    public S0BPacketAnimation() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlllIIlIIIIlIlllII) throws IOException {
        lllllllllllllIIlllIIlIIIIlIlllII.writeVarIntToBuffer(this.entityId);
        lllllllllllllIIlllIIlIIIIlIlllII.writeByte(this.type);
        "".length();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIlllIIlIIIIlIllIII) {
        lllllllllllllIIlllIIlIIIIlIllIII.handleAnimation(this);
    }
    
    public int getEntityID() {
        return this.entityId;
    }
}
