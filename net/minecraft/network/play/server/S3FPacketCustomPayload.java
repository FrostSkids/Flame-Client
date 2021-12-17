// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network.play.server;

import io.netty.buffer.ByteBuf;
import java.io.IOException;
import net.minecraft.network.INetHandler;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.INetHandlerPlayClient;
import net.minecraft.network.Packet;

public class S3FPacketCustomPayload implements Packet<INetHandlerPlayClient>
{
    private /* synthetic */ String channel;
    private static final /* synthetic */ int[] llIlIIlIIlIlll;
    private static final /* synthetic */ String[] llIlIIlIIlIlIl;
    private /* synthetic */ PacketBuffer data;
    
    private static String lIIlIIlIIllIIIlI(final String llllllllllllIllIllIIIllIIlIIlIIl, final String llllllllllllIllIllIIIllIIlIIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIllIIlIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIllIIlIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIIllIIlIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIIllIIlIIlIll.init(S3FPacketCustomPayload.llIlIIlIIlIlll[4], llllllllllllIllIllIIIllIIlIIllII);
            return new String(llllllllllllIllIllIIIllIIlIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIllIIlIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIllIIlIIlIlI) {
            llllllllllllIllIllIIIllIIlIIlIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void readPacketData(final PacketBuffer llllllllllllIllIllIIIllIIlllIlIl) throws IOException {
        this.channel = llllllllllllIllIllIIIllIIlllIlIl.readStringFromBuffer(S3FPacketCustomPayload.llIlIIlIIlIlll[2]);
        final int llllllllllllIllIllIIIllIIlllIlll = llllllllllllIllIllIIIllIIlllIlIl.readableBytes();
        if (!lIIlIIlIIllIlllI(llllllllllllIllIllIIIllIIlllIlll) || !lIIlIIlIIllIllll(llllllllllllIllIllIIIllIIlllIlll, S3FPacketCustomPayload.llIlIIlIIlIlll[0])) {
            throw new IOException(S3FPacketCustomPayload.llIlIIlIIlIlIl[S3FPacketCustomPayload.llIlIIlIIlIlll[3]]);
        }
        this.data = new PacketBuffer(llllllllllllIllIllIIIllIIlllIlIl.readBytes(llllllllllllIllIllIIIllIIlllIlll));
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
    }
    
    private static void lIIlIIlIIllIllII() {
        (llIlIIlIIlIlll = new int[5])[0] = (-(0xFFFFF661 & 0x7BDF) & (0xFFFFF244 & 0x107FFB));
        S3FPacketCustomPayload.llIlIIlIIlIlll[1] = (("  ".length() ^ (0x54 ^ 0x12)) & (246 + 28 - 85 + 58 ^ 113 + 111 - 146 + 101 ^ -" ".length()));
        S3FPacketCustomPayload.llIlIIlIIlIlll[2] = (0xA7 ^ 0xB3);
        S3FPacketCustomPayload.llIlIIlIIlIlll[3] = " ".length();
        S3FPacketCustomPayload.llIlIIlIIlIlll[4] = "  ".length();
    }
    
    private static boolean lIIlIIlIIllIllIl(final int llllllllllllIllIllIIIllIIIllIIIl, final int llllllllllllIllIllIIIllIIIlIllll) {
        return llllllllllllIllIllIIIllIIIllIIIl > llllllllllllIllIllIIIllIIIlIllll;
    }
    
    private static boolean lIIlIIlIIllIlllI(final int llllllllllllIllIllIIIllIIIlIlIll) {
        return llllllllllllIllIllIIIllIIIlIlIll >= 0;
    }
    
    private static boolean lIIlIIlIIllIllll(final int llllllllllllIllIllIIIllIIIlllIlI, final int llllllllllllIllIllIIIllIIIlllIII) {
        return llllllllllllIllIllIIIllIIIlllIlI <= llllllllllllIllIllIIIllIIIlllIII;
    }
    
    public PacketBuffer getBufferData() {
        return this.data;
    }
    
    public S3FPacketCustomPayload(final String llllllllllllIllIllIIIllIlIIIlIlI, final PacketBuffer llllllllllllIllIllIIIllIlIIIlIIl) {
        this.channel = llllllllllllIllIllIIIllIlIIIlIlI;
        this.data = llllllllllllIllIllIIIllIlIIIlIIl;
        if (lIIlIIlIIllIllIl(llllllllllllIllIllIIIllIlIIIlIIl.writerIndex(), S3FPacketCustomPayload.llIlIIlIIlIlll[0])) {
            throw new IllegalArgumentException(S3FPacketCustomPayload.llIlIIlIIlIlIl[S3FPacketCustomPayload.llIlIIlIIlIlll[1]]);
        }
    }
    
    public String getChannelName() {
        return this.channel;
    }
    
    public S3FPacketCustomPayload() {
    }
    
    static {
        lIIlIIlIIllIllII();
        lIIlIIlIIllIIIll();
    }
    
    private static void lIIlIIlIIllIIIll() {
        (llIlIIlIIlIlIl = new String[S3FPacketCustomPayload.llIlIIlIIlIlll[4]])[S3FPacketCustomPayload.llIlIIlIIlIlll[1]] = lIIlIIlIIllIIIlI("FUbhAgomHrwNgGVSAp8ZeCnJK3n6+CqpEJOJDFSZ/VZhyMd/aq9nj+Smfq/tCXP9", "kxqqg");
        S3FPacketCustomPayload.llIlIIlIIlIlIl[S3FPacketCustomPayload.llIlIIlIIlIlll[3]] = lIIlIIlIIllIIIlI("qt7MMDxXaL/rB0lL94fHDbfIXtHfF93TYKC0Qu78Idst+6kYmhDKB3F61I/3UlVZ", "vfOHj");
    }
    
    @Override
    public void processPacket(final INetHandlerPlayClient llllllllllllIllIllIIIllIIllIlIlI) {
        llllllllllllIllIllIIIllIIllIlIlI.handleCustomPayload(this);
    }
    
    @Override
    public void writePacketData(final PacketBuffer llllllllllllIllIllIIIllIIllIlllI) throws IOException {
        llllllllllllIllIllIIIllIIllIlllI.writeString(this.channel);
        "".length();
        llllllllllllIllIllIIIllIIllIlllI.writeBytes(this.data);
        "".length();
    }
}
