// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.network.PacketBuffer;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToByteEncoder;

public class MessageSerializer2 extends MessageToByteEncoder<ByteBuf>
{
    private static final /* synthetic */ String[] lllIllIlIIllll;
    private static final /* synthetic */ int[] lllIllIlIlIIII;
    
    static {
        lIlIIlIIllIlllll();
        lIlIIlIIllIllllI();
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIlIllIIlIIIlIlIlIlII, final ByteBuf llllllllllllIlIllIIlIIIlIlIIlllI, final ByteBuf llllllllllllIlIllIIlIIIlIlIlIIlI) throws Exception {
        final int llllllllllllIlIllIIlIIIlIlIlIIIl = llllllllllllIlIllIIlIIIlIlIIlllI.readableBytes();
        final int llllllllllllIlIllIIlIIIlIlIlIIII = PacketBuffer.getVarIntSize(llllllllllllIlIllIIlIIIlIlIlIIIl);
        if (lIlIIlIIlllIIIII(llllllllllllIlIllIIlIIIlIlIlIIII, MessageSerializer2.lllIllIlIlIIII[0])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder(MessageSerializer2.lllIllIlIIllll[MessageSerializer2.lllIllIlIlIIII[1]]).append(llllllllllllIlIllIIlIIIlIlIlIIIl).append(MessageSerializer2.lllIllIlIIllll[MessageSerializer2.lllIllIlIlIIII[2]]).append(MessageSerializer2.lllIllIlIlIIII[0])));
        }
        final PacketBuffer llllllllllllIlIllIIlIIIlIlIIllll = new PacketBuffer(llllllllllllIlIllIIlIIIlIlIlIIlI);
        llllllllllllIlIllIIlIIIlIlIIllll.ensureWritable(llllllllllllIlIllIIlIIIlIlIlIIII + llllllllllllIlIllIIlIIIlIlIlIIIl);
        "".length();
        llllllllllllIlIllIIlIIIlIlIIllll.writeVarIntToBuffer(llllllllllllIlIllIIlIIIlIlIlIIIl);
        llllllllllllIlIllIIlIIIlIlIIllll.writeBytes(llllllllllllIlIllIIlIIIlIlIIlllI, llllllllllllIlIllIIlIIIlIlIIlllI.readerIndex(), llllllllllllIlIllIIlIIIlIlIlIIIl);
        "".length();
    }
    
    private static String lIlIIlIIllIlllII(final String llllllllllllIlIllIIlIIIlIIlllIII, final String llllllllllllIlIllIIlIIIlIIllIlll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIIIlIIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIIIlIIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIlIIIlIIllllII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIlIIIlIIllllII.init(MessageSerializer2.lllIllIlIlIIII[3], llllllllllllIlIllIIlIIIlIIllllIl);
            return new String(llllllllllllIlIllIIlIIIlIIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIIIlIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIIIlIIlllIll) {
            llllllllllllIlIllIIlIIIlIIlllIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIlIIllIlllll() {
        (lllIllIlIlIIII = new int[4])[0] = "   ".length();
        MessageSerializer2.lllIllIlIlIIII[1] = ((0xA9 ^ 0xA2) & ~(0x8A ^ 0x81));
        MessageSerializer2.lllIllIlIlIIII[2] = " ".length();
        MessageSerializer2.lllIllIlIlIIII[3] = "  ".length();
    }
    
    private static void lIlIIlIIllIllllI() {
        (lllIllIlIIllll = new String[MessageSerializer2.lllIllIlIlIIII[3]])[MessageSerializer2.lllIllIlIlIIII[1]] = lIlIIlIIllIlllII("WRI6QDVw8Sij/caKfuGT6A==", "YewfL");
        MessageSerializer2.lllIllIlIIllll[MessageSerializer2.lllIllIlIlIIII[2]] = lIlIIlIIllIlllIl("aBo+PCJo", "HsPHM");
    }
    
    private static String lIlIIlIIllIlllIl(String llllllllllllIlIllIIlIIIlIIlIIlIl, final String llllllllllllIlIllIIlIIIlIIlIlIIl) {
        llllllllllllIlIllIIlIIIlIIlIIlIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIlIIIlIIlIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlIIIlIIlIlIII = new StringBuilder();
        final char[] llllllllllllIlIllIIlIIIlIIlIIlll = llllllllllllIlIllIIlIIIlIIlIlIIl.toCharArray();
        int llllllllllllIlIllIIlIIIlIIlIIllI = MessageSerializer2.lllIllIlIlIIII[1];
        final long llllllllllllIlIllIIlIIIlIIlIIIII = (Object)((String)llllllllllllIlIllIIlIIIlIIlIIlIl).toCharArray();
        final byte llllllllllllIlIllIIlIIIlIIIlllll = (byte)llllllllllllIlIllIIlIIIlIIlIIIII.length;
        double llllllllllllIlIllIIlIIIlIIIllllI = MessageSerializer2.lllIllIlIlIIII[1];
        while (lIlIIlIIlllIIIIl((int)llllllllllllIlIllIIlIIIlIIIllllI, llllllllllllIlIllIIlIIIlIIIlllll)) {
            final char llllllllllllIlIllIIlIIIlIIlIlIll = llllllllllllIlIllIIlIIIlIIlIIIII[llllllllllllIlIllIIlIIIlIIIllllI];
            llllllllllllIlIllIIlIIIlIIlIlIII.append((char)(llllllllllllIlIllIIlIIIlIIlIlIll ^ llllllllllllIlIllIIlIIIlIIlIIlll[llllllllllllIlIllIIlIIIlIIlIIllI % llllllllllllIlIllIIlIIIlIIlIIlll.length]));
            "".length();
            ++llllllllllllIlIllIIlIIIlIIlIIllI;
            ++llllllllllllIlIllIIlIIIlIIIllllI;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlIIIlIIlIlIII);
    }
    
    private static boolean lIlIIlIIlllIIIIl(final int llllllllllllIlIllIIlIIIlIIIllIlI, final int llllllllllllIlIllIIlIIIlIIIllIIl) {
        return llllllllllllIlIllIIlIIIlIIIllIlI < llllllllllllIlIllIIlIIIlIIIllIIl;
    }
    
    private static boolean lIlIIlIIlllIIIII(final int llllllllllllIlIllIIlIIIlIIIlIllI, final int llllllllllllIlIllIIlIIIlIIIlIlIl) {
        return llllllllllllIlIllIIlIIIlIIIlIllI > llllllllllllIlIllIIlIIIlIIIlIlIl;
    }
}
