// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S47PacketPlayerListHeaderFooter implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ IChatComponent footer;
    private /* synthetic */ IChatComponent header;
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIllllllIlIlIIllIII) throws IOException {
        this.header = lllllllllllllIIllllllIlIlIIllIII.readChatComponent();
        this.footer = lllllllllllllIIllllllIlIlIIllIII.readChatComponent();
    }
    
    public IChatComponent getHeader() {
        return this.header;
    }
    
    public IChatComponent getFooter() {
        return this.footer;
    }
    
    public S47PacketPlayerListHeaderFooter(final IChatComponent lllllllllllllIIllllllIlIlIIllllI) {
        this.header = lllllllllllllIIllllllIlIlIIllllI;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIllllllIlIlIIIllII) {
        lllllllllllllIIllllllIlIlIIIllII.handlePlayerListHeaderFooter(this);
    }
    
    public S47PacketPlayerListHeaderFooter() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIllllllIlIlIIlIIlI) throws IOException {
        lllllllllllllIIllllllIlIlIIlIIlI.writeChatComponent(this.header);
        lllllllllllllIIllllllIlIlIIlIIlI.writeChatComponent(this.footer);
    }
}
