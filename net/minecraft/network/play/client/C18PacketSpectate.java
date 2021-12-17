// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.entity.Entity;
import net.minecraft.world.WorldServer;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import java.util.UUID;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C18PacketSpectate implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ UUID id;
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIlIlllllllllllIIll) throws IOException {
        this.id = lllllllllllllIIlIlllllllllllIIll.readUuid();
    }
    
    public C18PacketSpectate() {
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIIlIllllllllllIlIIl) {
        lllllllllllllIIlIllllllllllIlIIl.handleSpectate(this);
    }
    
    public Entity getEntity(final WorldServer lllllllllllllIIlIllllllllllIIIIl) {
        return lllllllllllllIIlIllllllllllIIIIl.getEntityFromUuid(this.id);
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIlIllllllllllIllIl) throws IOException {
        lllllllllllllIIlIllllllllllIllIl.writeUuid(this.id);
    }
    
    public C18PacketSpectate(final UUID lllllllllllllIIlIllllllllllllIIl) {
        this.id = lllllllllllllIIlIllllllllllllIIl;
    }
}
