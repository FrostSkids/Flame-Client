// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.login.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.login.INetHandlerLoginClient;
import net.minecraft.network.Packet;

public class S03PacketEnableCompression implements Packet<INetHandlerLoginClient>
{
    private /* synthetic */ int compressionTreshold;
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllllIIIllIIIlIIlIll) throws IOException {
        this.compressionTreshold = llllllllllllIllllIIIllIIIlIIlIll.readVarIntFromBuffer();
    }
    
    public S03PacketEnableCompression(final int llllllllllllIllllIIIllIIIlIlIlII) {
        this.compressionTreshold = llllllllllllIllllIIIllIIIlIlIlII;
    }
    
    public S03PacketEnableCompression() {
    }
    
    @Override
    public void processPacket(final INetHandlerLoginClient llllllllllllIllllIIIllIIIIlllIlI) {
        llllllllllllIllllIIIllIIIIlllIlI.handleEnableCompression(this);
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllllIIIllIIIlIIIIIl) throws IOException {
        llllllllllllIllllIIIllIIIlIIIIIl.writeVarIntToBuffer(this.compressionTreshold);
    }
    
    public int getCompressionTreshold() {
        return this.compressionTreshold;
    }
}
