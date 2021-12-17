// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.login.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.login.INetHandlerLoginClient;
import net.minecraft.network.Packet;

public class S00PacketDisconnect implements Packet<INetHandlerLoginClient>
{
    private /* synthetic */ IChatComponent reason;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIlIllIIlIllIIIlIIlII) throws IOException {
        llllllllllllIlIllIIlIllIIIlIIlII.writeChatComponent(this.reason);
    }
    
    @Override
    public void processPacket(final INetHandlerLoginClient llllllllllllIlIllIIlIllIIIIllllI) {
        llllllllllllIlIllIIlIllIIIIllllI.handleDisconnect(this);
    }
    
    public S00PacketDisconnect() {
    }
    
    public IChatComponent func_149603_c() {
        return this.reason;
    }
    
    public S00PacketDisconnect(final IChatComponent llllllllllllIlIllIIlIllIIIllIIlI) {
        this.reason = llllllllllllIlIllIIlIllIIIllIIlI;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIlIllIIlIllIIIlIllII) throws IOException {
        this.reason = llllllllllllIlIllIIlIllIIIlIllII.readChatComponent();
    }
}
