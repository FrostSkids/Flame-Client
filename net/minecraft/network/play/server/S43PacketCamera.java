// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S43PacketCamera implements Packet<INetHandlerPlayClient>
{
    public /* synthetic */ int entityId;
    
    public Entity getEntity(final World lllllllllllllIIIIlIIlllllllIlllI) {
        return lllllllllllllIIIIlIIlllllllIlllI.getEntityByID(this.entityId);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIIIlIIllllllllIlII) {
        lllllllllllllIIIIlIIllllllllIlII.handleCamera(this);
    }
    
    public S43PacketCamera() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIIlIIllllllllllII) throws IOException {
        lllllllllllllIIIIlIIllllllllllII.writeVarIntToBuffer(this.entityId);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIIlIlIIIIIIIIIIII) throws IOException {
        this.entityId = lllllllllllllIIIIlIlIIIIIIIIIIII.readVarIntFromBuffer();
    }
    
    public S43PacketCamera(final Entity lllllllllllllIIIIlIlIIIIIIIIlIII) {
        this.entityId = lllllllllllllIIIIlIlIIIIIIIIlIII.getEntityId();
    }
}
