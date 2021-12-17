// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S31PacketWindowProperty implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ int varIndex;
    private /* synthetic */ int varValue;
    private /* synthetic */ int windowId;
    
    public S31PacketWindowProperty() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIlIlIIIIIIIlIIlll) throws IOException {
        lllllllllllllIlIlIlIIIIIIIlIIlll.writeByte(this.windowId);
        "".length();
        lllllllllllllIlIlIlIIIIIIIlIIlll.writeShort(this.varIndex);
        "".length();
        lllllllllllllIlIlIlIIIIIIIlIIlll.writeShort(this.varValue);
        "".length();
    }
    
    public int getWindowId() {
        return this.windowId;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIlIlIlIIIIIIIllIIll) {
        lllllllllllllIlIlIlIIIIIIIllIIll.handleWindowProperty(this);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIlIlIIIIIIIlIlIll) throws IOException {
        this.windowId = lllllllllllllIlIlIlIIIIIIIlIlIll.readUnsignedByte();
        this.varIndex = lllllllllllllIlIlIlIIIIIIIlIlIll.readShort();
        this.varValue = lllllllllllllIlIlIlIIIIIIIlIlIll.readShort();
    }
    
    public S31PacketWindowProperty(final int lllllllllllllIlIlIlIIIIIIIlllIIl, final int lllllllllllllIlIlIlIIIIIIIlllIII, final int lllllllllllllIlIlIlIIIIIIIlllIll) {
        this.windowId = lllllllllllllIlIlIlIIIIIIIlllIIl;
        this.varIndex = lllllllllllllIlIlIlIIIIIIIlllIII;
        this.varValue = lllllllllllllIlIlIlIIIIIIIlllIll;
    }
    
    public int getVarIndex() {
        return this.varIndex;
    }
    
    public int getVarValue() {
        return this.varValue;
    }
}
