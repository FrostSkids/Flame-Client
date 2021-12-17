// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S00PacketKeepAlive implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int id;
    
    public S00PacketKeepAlive() {
    }
    
    public int func_149134_c() {
        return this.id;
    }
    
    public S00PacketKeepAlive(final int lllllllllllllIlIIIlIlIIlIlIIIIll) {
        this.id = lllllllllllllIlIIIlIlIIlIlIIIIll;
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIIlIlIIlIIllIIll) throws IOException {
        lllllllllllllIlIIIlIlIIlIIllIIll.writeVarIntToBuffer(this.id);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIIIlIlIIlIIllllIl) {
        lllllllllllllIlIIIlIlIIlIIllllIl.handleKeepAlive(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIIlIlIIlIIllIlll) throws IOException {
        this.id = lllllllllllllIlIIIlIlIIlIIllIlll.readVarIntFromBuffer();
    }
}
