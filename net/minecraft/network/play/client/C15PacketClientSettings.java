// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import java.io.IOException;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.INetHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C15PacketClientSettings implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ EntityPlayer.EnumChatVisibility chatVisibility;
    private /* synthetic */ String lang;
    private /* synthetic */ int modelPartFlags;
    private static final /* synthetic */ int[] lIlIllIlllllIl;
    private /* synthetic */ int view;
    private /* synthetic */ boolean enableColors;
    
    public boolean isColorsEnabled() {
        return this.enableColors;
    }
    
    public EntityPlayer.EnumChatVisibility getChatVisibility() {
        return this.chatVisibility;
    }
    
    public C15PacketClientSettings(final String lllllllllllllIIIIllIIIIlIlllllIl, final int lllllllllllllIIIIllIIIIllIIIIIlI, final EntityPlayer.EnumChatVisibility lllllllllllllIIIIllIIIIllIIIIIIl, final boolean lllllllllllllIIIIllIIIIlIllllIlI, final int lllllllllllllIIIIllIIIIlIlllllll) {
        this.lang = lllllllllllllIIIIllIIIIlIlllllIl;
        this.view = lllllllllllllIIIIllIIIIllIIIIIlI;
        this.chatVisibility = lllllllllllllIIIIllIIIIllIIIIIIl;
        this.enableColors = lllllllllllllIIIIllIIIIlIllllIlI;
        this.modelPartFlags = lllllllllllllIIIIllIIIIlIlllllll;
    }
    
    public int getModelPartFlags() {
        return this.modelPartFlags;
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIIIIllIIIIlIllIIlll) {
        lllllllllllllIIIIllIIIIlIllIIlll.processClientSettings(this);
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIIllIIIIlIllIllll) throws IOException {
        lllllllllllllIIIIllIIIIlIllIllll.writeString(this.lang);
        "".length();
        lllllllllllllIIIIllIIIIlIllIllll.writeByte(this.view);
        "".length();
        lllllllllllllIIIIllIIIIlIllIllll.writeByte(this.chatVisibility.getChatVisibility());
        "".length();
        lllllllllllllIIIIllIIIIlIllIllll.writeBoolean(this.enableColors);
        "".length();
        lllllllllllllIIIIllIIIIlIllIllll.writeByte(this.modelPartFlags);
        "".length();
    }
    
    public String getLang() {
        return this.lang;
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIIllIIIIlIlllIIll) throws IOException {
        this.lang = lllllllllllllIIIIllIIIIlIlllIIll.readStringFromBuffer(C15PacketClientSettings.lIlIllIlllllIl[0]);
        this.view = lllllllllllllIIIIllIIIIlIlllIIll.readByte();
        this.chatVisibility = EntityPlayer.EnumChatVisibility.getEnumChatVisibility(lllllllllllllIIIIllIIIIlIlllIIll.readByte());
        this.enableColors = lllllllllllllIIIIllIIIIlIlllIIll.readBoolean();
        this.modelPartFlags = lllllllllllllIIIIllIIIIlIlllIIll.readUnsignedByte();
    }
    
    public C15PacketClientSettings() {
    }
    
    static {
        llllIIlIlIllIlI();
    }
    
    private static void llllIIlIlIllIlI() {
        (lIlIllIlllllIl = new int[1])[0] = (0x39 ^ 0x3E);
    }
}
