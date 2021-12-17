// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import net.minecraft.network.INetHandler;
import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.IChatComponent;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S02PacketChat implements Packet<INetHandlerPlayClient>
{
    private static final /* synthetic */ int[] lIlllllllllIII;
    private /* synthetic */ IChatComponent chatComponent;
    private /* synthetic */ byte type;
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllllIIIlIlIllIlIlII) throws IOException {
        llllllllllllIllllIIIlIlIllIlIlII.writeChatComponent(this.chatComponent);
        llllllllllllIllllIIIlIlIllIlIlII.writeByte(this.type);
        "".length();
    }
    
    private static void lIIIIllIIlIllIIl() {
        (lIlllllllllIII = new int[3])[0] = " ".length();
        S02PacketChat.lIlllllllllIII[1] = "  ".length();
        S02PacketChat.lIlllllllllIII[2] = ((0xAE ^ 0xAB ^ ((0x7F ^ 0x72) & ~(0x56 ^ 0x5B))) & (122 + 2 - 113 + 138 ^ 106 + 60 - 106 + 84 ^ -" ".length()));
    }
    
    public byte getType() {
        return this.type;
    }
    
    public IChatComponent getChatComponent() {
        return this.chatComponent;
    }
    
    public S02PacketChat() {
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllllIIIlIlIllIllIlI) throws IOException {
        this.chatComponent = llllllllllllIllllIIIlIlIllIllIlI.readChatComponent();
        this.type = llllllllllllIllllIIIlIlIllIllIlI.readByte();
    }
    
    public boolean isChat() {
        if (lIIIIllIIlIllIlI(this.type, S02PacketChat.lIlllllllllIII[0]) && lIIIIllIIlIllIlI(this.type, S02PacketChat.lIlllllllllIII[1])) {
            return S02PacketChat.lIlllllllllIII[2] != 0;
        }
        return S02PacketChat.lIlllllllllIII[0] != 0;
    }
    
    private static boolean lIIIIllIIlIllIlI(final int llllllllllllIllllIIIlIlIlIlllllI, final int llllllllllllIllllIIIlIlIlIllllIl) {
        return llllllllllllIllllIIIlIlIlIlllllI != llllllllllllIllllIIIlIlIlIllllIl;
    }
    
    public S02PacketChat(final IChatComponent llllllllllllIllllIIIlIlIlllIIlII, final byte llllllllllllIllllIIIlIlIlllIIIll) {
        this.chatComponent = llllllllllllIllllIIIlIlIlllIIlII;
        this.type = llllllllllllIllllIIIlIlIlllIIIll;
    }
    
    public S02PacketChat(final IChatComponent llllllllllllIllllIIIlIlIlllIlIll) {
        this(llllllllllllIllllIIIlIlIlllIlIll, (byte)S02PacketChat.lIlllllllllIII[0]);
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllllIIIlIlIllIIlllI) {
        llllllllllllIllllIIIlIlIllIIlllI.handleChat(this);
    }
    
    static {
        lIIIIllIIlIllIIl();
    }
}
