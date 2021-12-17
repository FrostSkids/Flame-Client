// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.client;

import io.netty.buffer.ByteBuf;
import net.minecraft.network.INetHandler;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayServer;
import net.minecraft.network.Packet;

public class C17PacketCustomPayload implements Packet<INetHandlerPlayServer>
{
    private /* synthetic */ PacketBuffer data;
    private static final /* synthetic */ int[] lIlIlIIlllllIl;
    private /* synthetic */ String channel;
    private static final /* synthetic */ String[] lIlIlIIlllllII;
    
    private static String lllIllIlIllIIII(String lllllllllllllIIIlIIlIIIlIlllIIlI, final String lllllllllllllIIIlIIlIIIlIlllIllI) {
        lllllllllllllIIIlIIlIIIlIlllIIlI = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlIIlIIIlIlllIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIlIIIlIlllIlIl = new StringBuilder();
        final char[] lllllllllllllIIIlIIlIIIlIlllIlII = lllllllllllllIIIlIIlIIIlIlllIllI.toCharArray();
        int lllllllllllllIIIlIIlIIIlIlllIIll = C17PacketCustomPayload.lIlIlIIlllllIl[1];
        final double lllllllllllllIIIlIIlIIIlIllIllIl = (Object)((String)lllllllllllllIIIlIIlIIIlIlllIIlI).toCharArray();
        final Exception lllllllllllllIIIlIIlIIIlIllIllII = (Exception)lllllllllllllIIIlIIlIIIlIllIllIl.length;
        float lllllllllllllIIIlIIlIIIlIllIlIll = C17PacketCustomPayload.lIlIlIIlllllIl[1];
        while (lllIllIlIllIllI((int)lllllllllllllIIIlIIlIIIlIllIlIll, (int)lllllllllllllIIIlIIlIIIlIllIllII)) {
            final char lllllllllllllIIIlIIlIIIlIllllIII = lllllllllllllIIIlIIlIIIlIllIllIl[lllllllllllllIIIlIIlIIIlIllIlIll];
            lllllllllllllIIIlIIlIIIlIlllIlIl.append((char)(lllllllllllllIIIlIIlIIIlIllllIII ^ lllllllllllllIIIlIIlIIIlIlllIlII[lllllllllllllIIIlIIlIIIlIlllIIll % lllllllllllllIIIlIIlIIIlIlllIlII.length]));
            "".length();
            ++lllllllllllllIIIlIIlIIIlIlllIIll;
            ++lllllllllllllIIIlIIlIIIlIllIlIll;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIlIIIlIlllIlIl);
    }
    
    @Override
    public void readPacketData(final PacketBuffer lllllllllllllIIIlIIlIIIllIIlllII) throws IOException {
        this.channel = lllllllllllllIIIlIIlIIIllIIlllII.readStringFromBuffer(C17PacketCustomPayload.lIlIlIIlllllIl[2]);
        final int lllllllllllllIIIlIIlIIIllIIllIll = lllllllllllllIIIlIIlIIIllIIlllII.readableBytes();
        if (!lllIllIlIllIlII(lllllllllllllIIIlIIlIIIllIIllIll) || !lllIllIlIllIlIl(lllllllllllllIIIlIIlIIIllIIllIll, C17PacketCustomPayload.lIlIlIIlllllIl[0])) {
            throw new IOException(C17PacketCustomPayload.lIlIlIIlllllII[C17PacketCustomPayload.lIlIlIIlllllIl[3]]);
        }
        this.data = new PacketBuffer(lllllllllllllIIIlIIlIIIllIIlllII.readBytes(lllllllllllllIIIlIIlIIIllIIllIll));
        "".length();
        if ("  ".length() == 0) {
            return;
        }
    }
    
    @Override
    public void processPacket(final INetHandlerPlayServer lllllllllllllIIIlIIlIIIllIIIllII) {
        lllllllllllllIIIlIIlIIIllIIIllII.processVanilla250Packet(this);
    }
    
    private static boolean lllIllIlIllIllI(final int lllllllllllllIIIlIIlIIIlIllIIlll, final int lllllllllllllIIIlIIlIIIlIllIIllI) {
        return lllllllllllllIIIlIIlIIIlIllIIlll < lllllllllllllIIIlIIlIIIlIllIIllI;
    }
    
    static {
        lllIllIlIllIIlI();
        lllIllIlIllIIIl();
    }
    
    private static boolean lllIllIlIllIlII(final int lllllllllllllIIIlIIlIIIlIlIlllII) {
        return lllllllllllllIIIlIIlIIIlIlIlllII >= 0;
    }
    
    private static void lllIllIlIllIIlI() {
        (lIlIlIIlllllIl = new int[5])[0] = (-" ".length() & (-1 & 0x7FFF));
        C17PacketCustomPayload.lIlIlIIlllllIl[1] = ((127 + 196 - 286 + 183 ^ 90 + 23 - 56 + 84) & (0x29 ^ 0x10 ^ (0x3B ^ 0x53) ^ -" ".length()));
        C17PacketCustomPayload.lIlIlIIlllllIl[2] = (0x57 ^ 0x43);
        C17PacketCustomPayload.lIlIlIIlllllIl[3] = " ".length();
        C17PacketCustomPayload.lIlIlIIlllllIl[4] = "  ".length();
    }
    
    public PacketBuffer getBufferData() {
        return this.data;
    }
    
    public C17PacketCustomPayload(final String lllllllllllllIIIlIIlIIIllIlIIIlI, final PacketBuffer lllllllllllllIIIlIIlIIIllIlIIIIl) {
        this.channel = lllllllllllllIIIlIIlIIIllIlIIIlI;
        this.data = lllllllllllllIIIlIIlIIIllIlIIIIl;
        if (lllIllIlIllIIll(lllllllllllllIIIlIIlIIIllIlIIIIl.writerIndex(), C17PacketCustomPayload.lIlIlIIlllllIl[0])) {
            throw new IllegalArgumentException(C17PacketCustomPayload.lIlIlIIlllllII[C17PacketCustomPayload.lIlIlIIlllllIl[1]]);
        }
    }
    
    public C17PacketCustomPayload() {
    }
    
    @Override
    public void writePacketData(final PacketBuffer lllllllllllllIIIlIIlIIIllIIlIIlI) throws IOException {
        lllllllllllllIIIlIIlIIIllIIlIIlI.writeString(this.channel);
        "".length();
        lllllllllllllIIIlIIlIIIllIIlIIlI.writeBytes(this.data);
        "".length();
    }
    
    private static void lllIllIlIllIIIl() {
        (lIlIlIIlllllII = new String[C17PacketCustomPayload.lIlIlIIlllllIl[4]])[C17PacketCustomPayload.lIlIlIIlllllIl[1]] = lllIllIlIllIIII("OgQMKw4LAVUqABNFGygVSgcQZw0LFxIiE0oRHSYPSlZHcFddRRc+FQ8W", "jeuGa");
        C17PacketCustomPayload.lIlIlIIlllllII[C17PacketCustomPayload.lIlIlIIlllllIl[3]] = lllIllIlIllIIII("FQsYNTokDkE0NDxKDzYhZQgEeTkkGAY8J2UeCTg7ZVlTbmNySgMgISAZ", "EjaYU");
    }
    
    private static boolean lllIllIlIllIlIl(final int lllllllllllllIIIlIIlIIIlIllIIIll, final int lllllllllllllIIIlIIlIIIlIllIIIlI) {
        return lllllllllllllIIIlIIlIIIlIllIIIll <= lllllllllllllIIIlIIlIIIlIllIIIlI;
    }
    
    private static boolean lllIllIlIllIIll(final int lllllllllllllIIIlIIlIIIlIlIlllll, final int lllllllllllllIIIlIIlIIIlIlIllllI) {
        return lllllllllllllIIIlIIlIIIlIlIlllll > lllllllllllllIIIlIIlIIIlIlIllllI;
    }
    
    public String getChannelName() {
        return this.channel;
    }
}
