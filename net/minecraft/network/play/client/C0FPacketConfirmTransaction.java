// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C0FPacketConfirmTransaction implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ int windowId;
    private static final /* synthetic */ int[] lIIIIlllllIlII;
    private /* synthetic */ boolean accepted;
    private /* synthetic */ short uid;
    
    static {
        lIllllIlIlIIIll();
    }
    
    public C0FPacketConfirmTransaction() {
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIlIIIlllIIllIlllllI) throws IOException {
        this.windowId = lllllllllllllIlIIIlllIIllIlllllI.readByte();
        this.uid = lllllllllllllIlIIIlllIIllIlllllI.readShort();
        int accepted;
        if (lIllllIlIlIIlII(lllllllllllllIlIIIlllIIllIlllllI.readByte())) {
            accepted = C0FPacketConfirmTransaction.lIIIIlllllIlII[0];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            accepted = C0FPacketConfirmTransaction.lIIIIlllllIlII[1];
        }
        this.accepted = (accepted != 0);
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIlIIIlllIIllIllIllI) throws IOException {
        lllllllllllllIlIIIlllIIllIllIllI.writeByte(this.windowId);
        "".length();
        lllllllllllllIlIIIlllIIllIllIllI.writeShort(this.uid);
        "".length();
        int llllllllllllIlIllIlIlIlIIIllIIll;
        if (lIllllIlIlIIlII(this.accepted ? 1 : 0)) {
            llllllllllllIlIllIlIlIlIIIllIIll = C0FPacketConfirmTransaction.lIIIIlllllIlII[0];
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlIllIlIlIlIIIllIIll = C0FPacketConfirmTransaction.lIIIIlllllIlII[1];
        }
        lllllllllllllIlIIIlllIIllIllIllI.writeByte(llllllllllllIlIllIlIlIlIIIllIIll);
        "".length();
    }
    
    private static boolean lIllllIlIlIIlII(final int lllllllllllllIlIIIlllIIllIlIlIlI) {
        return lllllllllllllIlIIIlllIIllIlIlIlI != 0;
    }
    
    public C0FPacketConfirmTransaction(final int lllllllllllllIlIIIlllIIlllIIlllI, final short lllllllllllllIlIIIlllIIlllIIllIl, final boolean lllllllllllllIlIIIlllIIlllIIlIII) {
        this.windowId = lllllllllllllIlIIIlllIIlllIIlllI;
        this.uid = lllllllllllllIlIIIlllIIlllIIllIl;
        this.accepted = lllllllllllllIlIIIlllIIlllIIlIII;
    }
    
    public short getUid() {
        return this.uid;
    }
    
    private static void lIllllIlIlIIIll() {
        (lIIIIlllllIlII = new int[2])[0] = " ".length();
        C0FPacketConfirmTransaction.lIIIIlllllIlII[1] = ((0x2A ^ 0x3B ^ (0x2 ^ 0x1C)) & (0xB ^ 0x30 ^ (0x49 ^ 0x7D) ^ -" ".length()));
    }
    
    public int getWindowId() {
        return this.windowId;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIlIIIlllIIlllIIIlII) {
        lllllllllllllIlIIIlllIIlllIIIlII.processConfirmTransaction(this);
    }
}
