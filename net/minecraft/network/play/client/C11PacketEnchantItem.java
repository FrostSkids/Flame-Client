// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C11PacketEnchantItem implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ int windowId;
    private /* synthetic */ int button;
    
    @Override
    public void processPacket(final INetHandlerPlayServer llllllllllllIllIIIIIllllIllIIlII) {
        llllllllllllIllIIIIIllllIllIIlII.processEnchantItem(this);
    }
    
    public C11PacketEnchantItem() {
    }
    
    public C11PacketEnchantItem(final int llllllllllllIllIIIIIllllIllIlIll, final int llllllllllllIllIIIIIllllIllIlIlI) {
        this.windowId = llllllllllllIllIIIIIllllIllIlIll;
        this.button = llllllllllllIllIIIIIllllIllIlIlI;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIIIIIllllIlIllllI) throws IOException {
        this.windowId = llllllllllllIllIIIIIllllIlIllllI.readByte();
        this.button = llllllllllllIllIIIIIllllIlIllllI.readByte();
    }
    
    public int getWindowId() {
        return this.windowId;
    }
    
    public int getButton() {
        return this.button;
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIIIIIllllIlIllIlI) throws IOException {
        llllllllllllIllIIIIIllllIlIllIlI.writeByte(this.windowId);
        "".length();
        llllllllllllIllIIIIIllllIlIllIlI.writeByte(this.button);
        "".length();
    }
}
