// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.handshake.client;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.handshake.INetHandlerHandshakeServer;
import net.minecraft.network.Packet;

public class C00Handshake implements Packet<INetHandlerHandshakeServer>
{
    private /* synthetic */ String ip;
    private static final /* synthetic */ int[] lIIlIllIIIIIIl;
    private /* synthetic */ int protocolVersion;
    private /* synthetic */ EnumConnectionState requestedState;
    private /* synthetic */ int port;
    
    public C00Handshake() {
    }
    
    static {
        llIlIIIllIIllII();
    }
    
    public C00Handshake(final int lllllllllllllIIllIIlIllllllllllI, final String lllllllllllllIIllIIlIllllllllIII, final int lllllllllllllIIllIIlIlllllllIlll, final EnumConnectionState lllllllllllllIIllIIlIlllllllIllI) {
        this.protocolVersion = lllllllllllllIIllIIlIllllllllllI;
        this.ip = lllllllllllllIIllIIlIllllllllIII;
        this.port = lllllllllllllIIllIIlIlllllllIlll;
        this.requestedState = lllllllllllllIIllIIlIlllllllIllI;
    }
    
    @Override
    public void processPacket(final INetHandlerHandshakeServer lllllllllllllIIllIIlIllllllIIlII) {
        lllllllllllllIIllIIlIllllllIIlII.processHandshake(this);
    }
    
    private static void llIlIIIllIIllII() {
        (lIIlIllIIIIIIl = new int[1])[0] = 192 + 40 - 36 + 59;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIllIIlIlllllllIIlI) throws IOException {
        this.protocolVersion = lllllllllllllIIllIIlIlllllllIIlI.readVarIntFromBuffer();
        this.ip = lllllllllllllIIllIIlIlllllllIIlI.readStringFromBuffer(C00Handshake.lIIlIllIIIIIIl[0]);
        this.port = lllllllllllllIIllIIlIlllllllIIlI.readUnsignedShort();
        this.requestedState = EnumConnectionState.getById(lllllllllllllIIllIIlIlllllllIIlI.readVarIntFromBuffer());
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIllIIlIllllllIlIlI) throws IOException {
        lllllllllllllIIllIIlIllllllIlIlI.writeVarIntToBuffer(this.protocolVersion);
        lllllllllllllIIllIIlIllllllIlIlI.writeString(this.ip);
        "".length();
        lllllllllllllIIllIIlIllllllIlIlI.writeShort(this.port);
        "".length();
        lllllllllllllIIllIIlIllllllIlIlI.writeVarIntToBuffer(this.requestedState.getId());
    }
    
    public int getProtocolVersion() {
        return this.protocolVersion;
    }
    
    public EnumConnectionState getRequestedState() {
        return this.requestedState;
    }
}
