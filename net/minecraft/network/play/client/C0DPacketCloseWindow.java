// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C0DPacketCloseWindow implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ int windowId;
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIlIIlllIllllIIlllII) {
        lllllllllllllIlIIlllIllllIIlllII.processCloseWindow(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIlllIllllIIlIllI) throws IOException {
        this.windowId = lllllllllllllIlIIlllIllllIIlIllI.readByte();
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIlllIllllIIIlllI) throws IOException {
        lllllllllllllIlIIlllIllllIIIlllI.writeByte(this.windowId);
        "".length();
    }
    
    public C0DPacketCloseWindow() {
    }
    
    public C0DPacketCloseWindow(final int lllllllllllllIlIIlllIllllIlIIIII) {
        this.windowId = lllllllllllllIlIIlllIllllIlIIIII;
    }
}
