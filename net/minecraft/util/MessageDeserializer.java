// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import org.apache.logging.log4j.MarkerManager;
import org.apache.logging.log4j.LogManager;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.Packet;
import java.io.IOException;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.EnumConnectionState;
import net.minecraft.network.PacketBuffer;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import org.apache.logging.log4j.Marker;
import net.minecraft.network.EnumPacketDirection;
import org.apache.logging.log4j.Logger;
import io.netty.handler.codec.ByteToMessageDecoder;

public class MessageDeserializer extends ByteToMessageDecoder
{
    private static final /* synthetic */ Logger logger;
    private final /* synthetic */ EnumPacketDirection direction;
    private static final /* synthetic */ int[] lIIIlllIllIIll;
    private static final /* synthetic */ Marker RECEIVED_PACKET_MARKER;
    private static final /* synthetic */ String[] lIIIlllIllIIlI;
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIllllIllIllIllIIII, final ByteBuf lllllllllllllIIllllIllIllIlIllll, final List<Object> lllllllllllllIIllllIllIllIlIlllI) throws IllegalAccessException, IOException, InstantiationException, Exception {
        if (llIIIlllIIIlIIl(lllllllllllllIIllllIllIllIlIllll.readableBytes())) {
            final PacketBuffer lllllllllllllIIllllIllIllIllIlII = new PacketBuffer(lllllllllllllIIllllIllIllIlIllll);
            final int lllllllllllllIIllllIllIllIllIIll = lllllllllllllIIllllIllIllIllIlII.readVarIntFromBuffer();
            final Packet lllllllllllllIIllllIllIllIllIIlI = lllllllllllllIIllllIllIllIllIIII.channel().attr(NetworkManager.attrKeyConnectionState).get().getPacket(this.direction, lllllllllllllIIllllIllIllIllIIll);
            if (llIIIlllIIIlIlI(lllllllllllllIIllllIllIllIllIIlI)) {
                throw new IOException(String.valueOf(new StringBuilder(MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[1]]).append(lllllllllllllIIllllIllIllIllIIll)));
            }
            lllllllllllllIIllllIllIllIllIIlI.readPacketData(lllllllllllllIIllllIllIllIllIlII);
            if (llIIIlllIIIlIll(lllllllllllllIIllllIllIllIllIlII.readableBytes())) {
                throw new IOException(String.valueOf(new StringBuilder(MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[2]]).append(lllllllllllllIIllllIllIllIllIIII.channel().attr(NetworkManager.attrKeyConnectionState).get().getId()).append(MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[3]]).append(lllllllllllllIIllllIllIllIllIIll).append(MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[4]]).append(lllllllllllllIIllllIllIllIllIIlI.getClass().getSimpleName()).append(MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[5]]).append(lllllllllllllIIllllIllIllIllIlII.readableBytes()).append(MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[6]]).append(lllllllllllllIIllllIllIllIllIIll)));
            }
            lllllllllllllIIllllIllIllIlIlllI.add(lllllllllllllIIllllIllIllIllIIlI);
            "".length();
            if (llIIIlllIIIlIIl(MessageDeserializer.logger.isDebugEnabled() ? 1 : 0)) {
                final Logger logger = MessageDeserializer.logger;
                final Marker received_PACKET_MARKER = MessageDeserializer.RECEIVED_PACKET_MARKER;
                final String s = MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[7]];
                final Object[] array = new Object[MessageDeserializer.lIIIlllIllIIll[3]];
                array[MessageDeserializer.lIIIlllIllIIll[0]] = lllllllllllllIIllllIllIllIllIIII.channel().attr(NetworkManager.attrKeyConnectionState).get();
                array[MessageDeserializer.lIIIlllIllIIll[1]] = lllllllllllllIIllllIllIllIllIIll;
                array[MessageDeserializer.lIIIlllIllIIll[2]] = lllllllllllllIIllllIllIllIllIIlI.getClass().getName();
                logger.debug(received_PACKET_MARKER, s, array);
            }
        }
    }
    
    private static String llIIIlllIIIIllI(final String lllllllllllllIIllllIllIllIlIIIll, final String lllllllllllllIIllllIllIllIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllllIllIllIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIllIllIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIllIllIlIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIllIllIlIIlIl.init(MessageDeserializer.lIIIlllIllIIll[2], lllllllllllllIIllllIllIllIlIIllI);
            return new String(lllllllllllllIIllllIllIllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIllIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIllIllIlIIlII) {
            lllllllllllllIIllllIllIllIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static String llIIIlllIIIIlII(final String lllllllllllllIIllllIllIllIIlIlII, final String lllllllllllllIIllllIllIllIIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIllIllIIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIllIllIIlIlIl.getBytes(StandardCharsets.UTF_8)), MessageDeserializer.lIIIlllIllIIll[8]), "DES");
            final Cipher lllllllllllllIIllllIllIllIIllIII = Cipher.getInstance("DES");
            lllllllllllllIIllllIllIllIIllIII.init(MessageDeserializer.lIIIlllIllIIll[2], lllllllllllllIIllllIllIllIIllIIl);
            return new String(lllllllllllllIIllllIllIllIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIllIllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIllIllIIlIlll) {
            lllllllllllllIIllllIllIllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIIlllIIIlIII();
        llIIIlllIIIIlll();
        logger = LogManager.getLogger();
        RECEIVED_PACKET_MARKER = MarkerManager.getMarker(MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[0]], NetworkManager.logMarkerPackets);
    }
    
    private static boolean llIIIlllIIIlIll(final int lllllllllllllIIllllIllIlIllIllll) {
        return lllllllllllllIIllllIllIlIllIllll > 0;
    }
    
    private static String llIIIlllIIIIlIl(String lllllllllllllIIllllIllIllIIIIIIl, final String lllllllllllllIIllllIllIllIIIIlIl) {
        lllllllllllllIIllllIllIllIIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllllIllIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIllIllIIIIlII = new StringBuilder();
        final char[] lllllllllllllIIllllIllIllIIIIIll = lllllllllllllIIllllIllIllIIIIlIl.toCharArray();
        int lllllllllllllIIllllIllIllIIIIIlI = MessageDeserializer.lIIIlllIllIIll[0];
        final char lllllllllllllIIllllIllIlIlllllII = (Object)lllllllllllllIIllllIllIllIIIIIIl.toCharArray();
        final boolean lllllllllllllIIllllIllIlIllllIll = lllllllllllllIIllllIllIlIlllllII.length != 0;
        short lllllllllllllIIllllIllIlIllllIlI = (short)MessageDeserializer.lIIIlllIllIIll[0];
        while (llIIIlllIIIllII(lllllllllllllIIllllIllIlIllllIlI, lllllllllllllIIllllIllIlIllllIll ? 1 : 0)) {
            final char lllllllllllllIIllllIllIllIIIIlll = lllllllllllllIIllllIllIlIlllllII[lllllllllllllIIllllIllIlIllllIlI];
            lllllllllllllIIllllIllIllIIIIlII.append((char)(lllllllllllllIIllllIllIllIIIIlll ^ lllllllllllllIIllllIllIllIIIIIll[lllllllllllllIIllllIllIllIIIIIlI % lllllllllllllIIllllIllIllIIIIIll.length]));
            "".length();
            ++lllllllllllllIIllllIllIllIIIIIlI;
            ++lllllllllllllIIllllIllIlIllllIlI;
            "".length();
            if (((0x70 ^ 0x56) & ~(0x8E ^ 0xA8)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIllIllIIIIlII);
    }
    
    private static boolean llIIIlllIIIlIlI(final Object lllllllllllllIIllllIllIlIlllIIll) {
        return lllllllllllllIIllllIllIlIlllIIll == null;
    }
    
    private static void llIIIlllIIIIlll() {
        (lIIIlllIllIIlI = new String[MessageDeserializer.lIIIlllIllIIll[8]])[MessageDeserializer.lIIIlllIllIIll[0]] = llIIIlllIIIIlII("+hfa1v6KdCNEFnjofCrNEQ==", "EkPVh");
        MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[1]] = llIIIlllIIIIlII("ZzeMd8VPcsnBjMCHRMYyiQ==", "lLkrg");
        MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[2]] = llIIIlllIIIIlIl("OAoBGBEcSw==", "hkbst");
        MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[3]] = llIIIlllIIIIlII("0Yj59t5htdc=", "oZwVl");
        MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[4]] = llIIIlllIIIIlIl("SWM=", "iKrjW");
        MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[5]] = llIIIlllIIIIlII("8HFY85qG206npq0uLLkFjnkHBZGngr/2XY6r5YZkzO+urqCz33Ju/A==", "Gdwbn");
        MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[6]] = llIIIlllIIIIllI("9zoyj5Nz2/TauAfZLqxkgDXF6vNFQMPKNJI+eEcAhdC7eVtOnd3LGg==", "EhwUx");
        MessageDeserializer.lIIIlllIllIIlI[MessageDeserializer.lIIIlllIllIIll[7]] = llIIIlllIIIIlIl("YyIAeHIYEDN4KT42bjkv", "CkNBR");
    }
    
    private static void llIIIlllIIIlIII() {
        (lIIIlllIllIIll = new int[9])[0] = ((0xEE ^ 0xA3 ^ (0x3D ^ 0x5E)) & (0x17 ^ 0x7A ^ (0x84 ^ 0xC7) ^ -" ".length()));
        MessageDeserializer.lIIIlllIllIIll[1] = " ".length();
        MessageDeserializer.lIIIlllIllIIll[2] = "  ".length();
        MessageDeserializer.lIIIlllIllIIll[3] = "   ".length();
        MessageDeserializer.lIIIlllIllIIll[4] = (0x56 ^ 0x52);
        MessageDeserializer.lIIIlllIllIIll[5] = (49 + 98 - 146 + 141 ^ 125 + 42 - 28 + 0);
        MessageDeserializer.lIIIlllIllIIll[6] = (0x7E ^ 0x22 ^ (0xFC ^ 0xA6));
        MessageDeserializer.lIIIlllIllIIll[7] = (0x68 ^ 0x6F);
        MessageDeserializer.lIIIlllIllIIll[8] = (0x80 ^ 0x88);
    }
    
    private static boolean llIIIlllIIIlIIl(final int lllllllllllllIIllllIllIlIlllIIIl) {
        return lllllllllllllIIllllIllIlIlllIIIl != 0;
    }
    
    private static boolean llIIIlllIIIllII(final int lllllllllllllIIllllIllIlIlllIllI, final int lllllllllllllIIllllIllIlIlllIlIl) {
        return lllllllllllllIIllllIllIlIlllIllI < lllllllllllllIIllllIllIlIlllIlIl;
    }
    
    public MessageDeserializer(final EnumPacketDirection lllllllllllllIIllllIllIlllIIIIlI) {
        this.direction = lllllllllllllIIllllIllIlllIIIIlI;
    }
}
