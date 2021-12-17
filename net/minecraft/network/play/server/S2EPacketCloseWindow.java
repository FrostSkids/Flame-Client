// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S2EPacketCloseWindow implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int windowId;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIlIIIIllIIIIlIIII) throws IOException {
        llllllllllllIllIlIIIIllIIIIlIIII.writeByte(this.windowId);
        "".length();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIlIIIIllIIIIlllII) {
        llllllllllllIllIlIIIIllIIIIlllII.handleCloseWindow(this);
    }
    
    public S2EPacketCloseWindow(final int llllllllllllIllIlIIIIllIIIlIIIII) {
        this.windowId = llllllllllllIllIlIIIIllIIIlIIIII;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIlIIIIllIIIIlIllI) throws IOException {
        this.windowId = llllllllllllIllIlIIIIllIIIIlIllI.readUnsignedByte();
    }
    
    public S2EPacketCloseWindow() {
    }
}
