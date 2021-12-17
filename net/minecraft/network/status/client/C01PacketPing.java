// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.status.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.status.INetHandlerStatusServer;
import net.minecraft.network.Packet;

public class C01PacketPing implements Packet<INetHandlerStatusServer>
{
    private /* synthetic */ long clientTime;
    
    @Override
    public void processPacket(final INetHandlerStatusServer lllllllllllllIIIIIIlIIlllIIlIlII) {
        lllllllllllllIIIIIIlIIlllIIlIlII.processPing(this);
    }
    
    public C01PacketPing(final long lllllllllllllIIIIIIlIIlllIlIIllI) {
        this.clientTime = lllllllllllllIIIIIIlIIlllIlIIllI;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIIIIlIIlllIlIIIlI) throws IOException {
        this.clientTime = lllllllllllllIIIIIIlIIlllIlIIIlI.readLong();
    }
    
    public long getClientTime() {
        return this.clientTime;
    }
    
    public C01PacketPing() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIIIIlIIlllIIlllII) throws IOException {
        lllllllllllllIIIIIIlIIlllIIlllII.writeLong(this.clientTime);
        "".length();
    }
}
