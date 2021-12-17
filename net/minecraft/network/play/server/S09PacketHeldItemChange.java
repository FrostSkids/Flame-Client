// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S09PacketHeldItemChange implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int heldItemHotbarIndex;
    
    public int getHeldItemHotbarIndex() {
        return this.heldItemHotbarIndex;
    }
    
    public S09PacketHeldItemChange() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllllllllllIIIlIIlIl) throws IOException {
        llllllllllllIllllllllllIIIlIIlIl.writeByte(this.heldItemHotbarIndex);
        "".length();
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllllllllllIIIlIlIll) throws IOException {
        this.heldItemHotbarIndex = llllllllllllIllllllllllIIIlIlIll.readByte();
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllllllllllIIIIlllll) {
        llllllllllllIllllllllllIIIIlllll.handleHeldItemChange(this);
    }
    
    public S09PacketHeldItemChange(final int llllllllllllIllllllllllIIIllIIll) {
        this.heldItemHotbarIndex = llllllllllllIllllllllllIIIllIIll;
    }
}
