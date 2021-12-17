// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S32PacketConfirmTransaction implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ short actionNumber;
    private /* synthetic */ boolean field_148893_c;
    private /* synthetic */ int windowId;
    
    public short getActionNumber() {
        return this.actionNumber;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIIlIIlIIlIllIIIlI) throws IOException {
        this.windowId = lllllllllllllIIIIlIIlIIlIllIIIlI.readUnsignedByte();
        this.actionNumber = lllllllllllllIIIIlIIlIIlIllIIIlI.readShort();
        this.field_148893_c = lllllllllllllIIIIlIIlIIlIllIIIlI.readBoolean();
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIIlIIlIIlIlIlllII) throws IOException {
        lllllllllllllIIIIlIIlIIlIlIlllII.writeByte(this.windowId);
        "".length();
        lllllllllllllIIIIlIIlIIlIlIlllII.writeShort(this.actionNumber);
        "".length();
        lllllllllllllIIIIlIIlIIlIlIlllII.writeBoolean(this.field_148893_c);
        "".length();
    }
    
    public int getWindowId() {
        return this.windowId;
    }
    
    public S32PacketConfirmTransaction() {
    }
    
    public boolean func_148888_e() {
        return this.field_148893_c;
    }
    
    public S32PacketConfirmTransaction(final int lllllllllllllIIIIlIIlIIlIlllIIII, final short lllllllllllllIIIIlIIlIIlIllIllll, final boolean lllllllllllllIIIIlIIlIIlIllIlllI) {
        this.windowId = lllllllllllllIIIIlIIlIIlIlllIIII;
        this.actionNumber = lllllllllllllIIIIlIIlIIlIllIllll;
        this.field_148893_c = lllllllllllllIIIIlIIlIIlIllIlllI;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient lllllllllllllIIIIlIIlIIlIllIlIlI) {
        lllllllllllllIIIIlIIlIIlIllIlIlI.handleConfirmTransaction(this);
    }
}
