// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C0APacketAnimation implements Packet<INetHandlerPlayServer>
{
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIlIIIIlIlIlIIIlIllI) {
        lllllllllllllIlIIIIlIlIlIIIlIllI.handleAnimation(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIIIlIlIlIIIlllII) throws IOException {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIIIlIlIlIIIllIlI) throws IOException {
    }
}
