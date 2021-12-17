// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S40PacketDisconnect implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ IChatComponent reason;
    
    public S40PacketDisconnect() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllIIIIIIlIllIllll) throws IOException {
        llllllllllllIlIllIIIIIIlIllIllll.writeChatComponent(this.reason);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIlIllIIIIIIlIllIlIll) {
        llllllllllllIlIllIIIIIIlIllIlIll.handleDisconnect(this);
    }
    
    public IChatComponent getReason() {
        return this.reason;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllIIIIIIlIlllIlll) throws IOException {
        this.reason = llllllllllllIlIllIIIIIIlIlllIlll.readChatComponent();
    }
    
    public S40PacketDisconnect(final IChatComponent llllllllllllIlIllIIIIIIlIllllIll) {
        this.reason = llllllllllllIlIllIIIIIIlIllllIll;
    }
}
