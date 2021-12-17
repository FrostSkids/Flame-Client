// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C00PacketKeepAlive implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ int key;
    
    @Override
    public void processPacket(final INetHandlerPlayServer llllllllllllIllIIllIllIlIIlllIII) {
        llllllllllllIllIIllIllIlIIlllIII.processKeepAlive(this);
    }
    
    public C00PacketKeepAlive(final int llllllllllllIllIIllIllIlIlIIIIII) {
        this.key = llllllllllllIllIIllIllIlIlIIIIII;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIIllIllIlIIllIIlI) throws IOException {
        this.key = llllllllllllIllIIllIllIlIIllIIlI.readVarIntFromBuffer();
    }
    
    public C00PacketKeepAlive() {
    }
    
    public int getKey() {
        return this.key;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIIllIllIlIIlIlllI) throws IOException {
        llllllllllllIllIIllIllIlIIlIlllI.writeVarIntToBuffer(this.key);
    }
}
