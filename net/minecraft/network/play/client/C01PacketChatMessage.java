// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C01PacketChatMessage implements Packet<INetHandlerPlayServer>
{
    private static final /* synthetic */ int[] llIlIIlIlllIll;
    private /* synthetic */ String message;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIllIIIIIlIIIlIIlI) throws IOException {
        llllllllllllIllIllIIIIIlIIIlIIlI.writeString(this.message);
        "".length();
    }
    
    private static boolean lIIlIIlIlIlllllI(final int llllllllllllIllIllIIIIIlIIIIIIlI, final int llllllllllllIllIllIIIIIlIIIIIIIl) {
        return llllllllllllIllIllIIIIIlIIIIIIlI > llllllllllllIllIllIIIIIlIIIIIIIl;
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIllIIIIIlIIIllIII) throws IOException {
        this.message = llllllllllllIllIllIIIIIlIIIllIII.readStringFromBuffer(C01PacketChatMessage.llIlIIlIlllIll[0]);
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public C01PacketChatMessage() {
    }
    
    private static void lIIlIIlIlIllllIl() {
        (llIlIIlIlllIll = new int[2])[0] = (0xC3 ^ 0xA7);
        C01PacketChatMessage.llIlIIlIlllIll[1] = ((0x68 ^ 0xA) & ~(0x63 ^ 0x1));
    }
    
    static {
        lIIlIIlIlIllllIl();
    }
    
    public C01PacketChatMessage(String llllllllllllIllIllIIIIIlIIIllllI) {
        if (lIIlIIlIlIlllllI(((String)llllllllllllIllIllIIIIIlIIIllllI).length(), C01PacketChatMessage.llIlIIlIlllIll[0])) {
            llllllllllllIllIllIIIIIlIIIllllI = ((String)llllllllllllIllIllIIIIIlIIIllllI).substring(C01PacketChatMessage.llIlIIlIlllIll[1], C01PacketChatMessage.llIlIIlIlllIll[0]);
        }
        this.message = (String)llllllllllllIllIllIIIIIlIIIllllI;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer llllllllllllIllIllIIIIIlIIIIllII) {
        llllllllllllIllIllIIIIIlIIIIllII.processChatMessage(this);
    }
}
