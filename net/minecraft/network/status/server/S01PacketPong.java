// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.status.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.status.INetHandlerStatusClient;
import net.minecraft.network.Packet;

public class S01PacketPong implements Packet<INetHandlerStatusClient>
{
    private /* synthetic */ long clientTime;
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllIllIlllllIIIlll) throws IOException {
        this.clientTime = llllllllllllIlIllIllIlllllIIIlll.readLong();
    }
    
    @Override
    public void processPacket(final INetHandlerStatusClient llllllllllllIlIllIllIllllIlllIIl) {
        llllllllllllIlIllIllIllllIlllIIl.handlePong(this);
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllIllIllllIllllll) throws IOException {
        llllllllllllIlIllIllIllllIllllll.writeLong(this.clientTime);
        "".length();
    }
    
    public S01PacketPong() {
    }
    
    public S01PacketPong(final long llllllllllllIlIllIllIlllllIIllIl) {
        this.clientTime = llllllllllllIlIllIllIlllllIIllIl;
    }
}
