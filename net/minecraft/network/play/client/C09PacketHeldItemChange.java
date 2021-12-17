// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C09PacketHeldItemChange implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ int slotId;
    
    public C09PacketHeldItemChange(final int lllllllllllllIIIIlllllIlIllllIlI) {
        this.slotId = lllllllllllllIIIIlllllIlIllllIlI;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIIIIlllllIlIllIIIlI) {
        lllllllllllllIIIIlllllIlIllIIIlI.processHeldItemChange(this);
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIIlllllIlIllIlIII) throws IOException {
        lllllllllllllIIIIlllllIlIllIlIII.writeShort(this.slotId);
        "".length();
    }
    
    public C09PacketHeldItemChange() {
    }
    
    public int getSlotId() {
        return this.slotId;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIIlllllIlIllIllll) throws IOException {
        this.slotId = lllllllllllllIIIIlllllIlIllIllll.readShort();
    }
}
