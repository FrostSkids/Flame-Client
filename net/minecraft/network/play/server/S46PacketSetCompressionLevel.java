// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S46PacketSetCompressionLevel implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int field_179761_a;
    
    public int func_179760_a() {
        return this.field_179761_a;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIlllllIllllIIIIlI) throws IOException {
        lllllllllllllIIIlllllIllllIIIIlI.writeVarIntToBuffer(this.field_179761_a);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIIlllllIlllIlllllI) {
        lllllllllllllIIIlllllIlllIlllllI.handleSetCompressionLevel(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIlllllIllllIIlIlI) throws IOException {
        this.field_179761_a = lllllllllllllIIIlllllIllllIIlIlI.readVarIntFromBuffer();
    }
}
