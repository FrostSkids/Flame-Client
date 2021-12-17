// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.network.PacketBuffer;
import java.io.IOException;
import net.minecraft.network.EnumConnectionState;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.MarkerManager;
import net.minecraft.network.NetworkManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import net.minecraft.network.EnumPacketDirection;
import net.minecraft.network.Packet;
import io.netty.handler.codec.MessageToByteEncoder;

public class MessageSerializer extends MessageToByteEncoder<Packet>
{
    private static final /* synthetic */ int[] llIIlIlIIllIIl;
    private static final /* synthetic */ String[] llIIlIlIIllIII;
    private final /* synthetic */ EnumPacketDirection direction;
    private static final /* synthetic */ Marker RECEIVED_PACKET_MARKER;
    private static final /* synthetic */ Logger logger;
    
    static {
        lIIIllIIlllllIll();
        lIIIllIIlllllIlI();
        logger = LogManager.getLogger();
        RECEIVED_PACKET_MARKER = MarkerManager.getMarker(MessageSerializer.llIIlIlIIllIII[MessageSerializer.llIIlIlIIllIIl[0]], NetworkManager.logMarkerPackets);
    }
    
    private static String lIIIllIIlllllIIl(final String llllllllllllIlllIIIllllIlIlIIIlI, final String llllllllllllIlllIIIllllIlIlIIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIllllIlIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIllllIlIlIIIll.getBytes(StandardCharsets.UTF_8)), MessageSerializer.llIIlIlIIllIIl[4]), "DES");
            final Cipher llllllllllllIlllIIIllllIlIlIIllI = Cipher.getInstance("DES");
            llllllllllllIlllIIIllllIlIlIIllI.init(MessageSerializer.llIIlIlIIllIIl[3], llllllllllllIlllIIIllllIlIlIIlll);
            return new String(llllllllllllIlllIIIllllIlIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIllllIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIllllIlIlIIlIl) {
            llllllllllllIlllIIIllllIlIlIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIllIIlllllIlI() {
        (llIIlIlIIllIII = new String[MessageSerializer.llIIlIlIIllIIl[2]])[MessageSerializer.llIIlIlIIllIIl[0]] = lIIIllIIlllllIII("dxN1tLJufkbEmBw/69U6Ow==", "uTsOc");
        MessageSerializer.llIIlIlIIllIII[MessageSerializer.llIIlIlIIllIIl[1]] = lIIIllIIlllllIIl("K9HOCf1co6MZnc0oHWYWUg==", "fIPDg");
        MessageSerializer.llIIlIlIIllIII[MessageSerializer.llIIlIlIIllIIl[3]] = lIIIllIIlllllIII("aoSa1/gzmPDgNGu0aIdma4NbwE40fkgLAzKTMSqNMPFhv3DlJTEKvw==", "IhPVF");
    }
    
    private static String lIIIllIIlllllIII(final String llllllllllllIlllIIIllllIlIlIllll, final String llllllllllllIlllIIIllllIlIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllIIIllllIlIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIllllIlIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIllllIlIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIllllIlIllIIll.init(MessageSerializer.llIIlIlIIllIIl[3], llllllllllllIlllIIIllllIlIllIlII);
            return new String(llllllllllllIlllIIIllllIlIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIllllIlIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIllllIlIllIIlI) {
            llllllllllllIlllIIIllllIlIllIIlI.printStackTrace();
            return null;
        }
    }
    
    public MessageSerializer(final EnumPacketDirection llllllllllllIlllIIIllllIllIlIllI) {
        this.direction = llllllllllllIlllIIIllllIllIlIllI;
    }
    
    private static void lIIIllIIlllllIll() {
        (llIIlIlIIllIIl = new int[5])[0] = ((157 + 104 - 191 + 117 ^ 103 + 10 - 77 + 95) & (0x46 ^ 0x5C ^ (0x4 ^ 0x26) ^ -" ".length()));
        MessageSerializer.llIIlIlIIllIIl[1] = " ".length();
        MessageSerializer.llIIlIlIIllIIl[2] = "   ".length();
        MessageSerializer.llIIlIlIIllIIl[3] = "  ".length();
        MessageSerializer.llIIlIlIIllIIl[4] = (116 + 0 - 111 + 125 ^ 8 + 18 + 47 + 65);
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIlllIIIllllIllIIIllI, final Packet llllllllllllIlllIIIllllIllIIIlIl, final ByteBuf llllllllllllIlllIIIllllIllIIlIll) throws IOException, Exception {
        final Integer llllllllllllIlllIIIllllIllIIlIlI = llllllllllllIlllIIIllllIllIIIllI.channel().attr(NetworkManager.attrKeyConnectionState).get().getPacketId(this.direction, llllllllllllIlllIIIllllIllIIIlIl);
        if (lIIIllIIllllllII(MessageSerializer.logger.isDebugEnabled() ? 1 : 0)) {
            final Logger logger = MessageSerializer.logger;
            final Marker received_PACKET_MARKER = MessageSerializer.RECEIVED_PACKET_MARKER;
            final String s = MessageSerializer.llIIlIlIIllIII[MessageSerializer.llIIlIlIIllIIl[1]];
            final Object[] array = new Object[MessageSerializer.llIIlIlIIllIIl[2]];
            array[MessageSerializer.llIIlIlIIllIIl[0]] = llllllllllllIlllIIIllllIllIIIllI.channel().attr(NetworkManager.attrKeyConnectionState).get();
            array[MessageSerializer.llIIlIlIIllIIl[1]] = llllllllllllIlllIIIllllIllIIlIlI;
            array[MessageSerializer.llIIlIlIIllIIl[3]] = llllllllllllIlllIIIllllIllIIIlIl.getClass().getName();
            logger.debug(received_PACKET_MARKER, s, array);
        }
        if (lIIIllIIllllllIl(llllllllllllIlllIIIllllIllIIlIlI)) {
            throw new IOException(MessageSerializer.llIIlIlIIllIII[MessageSerializer.llIIlIlIIllIIl[3]]);
        }
        final PacketBuffer llllllllllllIlllIIIllllIllIIlIIl = new PacketBuffer(llllllllllllIlllIIIllllIllIIlIll);
        llllllllllllIlllIIIllllIllIIlIIl.writeVarIntToBuffer(llllllllllllIlllIIIllllIllIIlIlI);
        try {
            llllllllllllIlllIIIllllIllIIIlIl.writePacketData(llllllllllllIlllIIIllllIllIIlIIl);
            "".length();
            if ((0x1 ^ 0x4) <= 0) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllIIIllllIllIIlIII) {
            MessageSerializer.logger.error((Object)llllllllllllIlllIIIllllIllIIlIII);
        }
    }
    
    private static boolean lIIIllIIllllllII(final int llllllllllllIlllIIIllllIlIIllIll) {
        return llllllllllllIlllIIIllllIlIIllIll != 0;
    }
    
    private static boolean lIIIllIIllllllIl(final Object llllllllllllIlllIIIllllIlIIlllIl) {
        return llllllllllllIlllIIIllllIlIIlllIl == null;
    }
}
