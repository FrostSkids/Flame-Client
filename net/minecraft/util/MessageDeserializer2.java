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
import io.netty.handler.codec.CorruptedFrameException;
import net.minecraft.network.PacketBuffer;
import io.netty.buffer.Unpooled;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

public class MessageDeserializer2 extends ByteToMessageDecoder
{
    private static final /* synthetic */ int[] lIIIIllIIIIIlI;
    private static final /* synthetic */ String[] lIIIIlIllllIlI;
    
    private static boolean lIlllIlIlllIIII(final int lllllllllllllIlIIlIlIIIIIlIIllIl) {
        return lllllllllllllIlIIlIlIIIIIlIIllIl >= 0;
    }
    
    private static void lIlllIlIllIlIll() {
        (lIIIIlIllllIlI = new String[MessageDeserializer2.lIIIIllIIIIIlI[2]])[MessageDeserializer2.lIIIIllIIIIIlI[1]] = lIlllIlIllIlIIl("1+YXDn/xFSgGTvFcVVGtyIPDpMVaiu/EsyLcE0BkH2E=", "yyYUN");
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIlIIlIlIIIIIllIllll, final ByteBuf lllllllllllllIlIIlIlIIIIIllIlIII, final List<Object> lllllllllllllIlIIlIlIIIIIllIIlll) throws Exception {
        lllllllllllllIlIIlIlIIIIIllIlIII.markReaderIndex();
        "".length();
        final byte[] lllllllllllllIlIIlIlIIIIIllIllII = new byte[MessageDeserializer2.lIIIIllIIIIIlI[0]];
        int lllllllllllllIlIIlIlIIIIIllIlIll = MessageDeserializer2.lIIIIllIIIIIlI[1];
        "".length();
        if (((0x2B ^ 0x3C ^ (0x80 ^ 0xA4)) & (146 + 155 - 203 + 146 ^ 76 + 19 - 12 + 116 ^ -" ".length())) < 0) {
            return;
        }
        while (!lIlllIlIlllIIIl(lllllllllllllIlIIlIlIIIIIllIlIll, lllllllllllllIlIIlIlIIIIIllIllII.length)) {
            if (lIlllIlIllIllll(lllllllllllllIlIIlIlIIIIIllIlIII.isReadable() ? 1 : 0)) {
                lllllllllllllIlIIlIlIIIIIllIlIII.resetReaderIndex();
                "".length();
                return;
            }
            lllllllllllllIlIIlIlIIIIIllIllII[lllllllllllllIlIIlIlIIIIIllIlIll] = lllllllllllllIlIIlIlIIIIIllIlIII.readByte();
            if (lIlllIlIlllIIII(lllllllllllllIlIIlIlIIIIIllIllII[lllllllllllllIlIIlIlIIIIIllIlIll])) {
                final PacketBuffer lllllllllllllIlIIlIlIIIIIllIlIlI = new PacketBuffer(Unpooled.wrappedBuffer(lllllllllllllIlIIlIlIIIIIllIllII));
                try {
                    final int lllllllllllllIlIIlIlIIIIIllIlIIl = lllllllllllllIlIIlIlIIIIIllIlIlI.readVarIntFromBuffer();
                    if (lIlllIlIlllIIIl(lllllllllllllIlIIlIlIIIIIllIlIII.readableBytes(), lllllllllllllIlIIlIlIIIIIllIlIIl)) {
                        lllllllllllllIlIIlIlIIIIIllIIlll.add(lllllllllllllIlIIlIlIIIIIllIlIII.readBytes(lllllllllllllIlIIlIlIIIIIllIlIIl));
                        "".length();
                        return;
                    }
                    lllllllllllllIlIIlIlIIIIIllIlIII.resetReaderIndex();
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                finally {
                    lllllllllllllIlIIlIlIIIIIllIlIlI.release();
                    "".length();
                }
                lllllllllllllIlIIlIlIIIIIllIlIlI.release();
                "".length();
                return;
            }
            ++lllllllllllllIlIIlIlIIIIIllIlIll;
        }
        throw new CorruptedFrameException(MessageDeserializer2.lIIIIlIllllIlI[MessageDeserializer2.lIIIIllIIIIIlI[1]]);
    }
    
    private static boolean lIlllIlIlllIIIl(final int lllllllllllllIlIIlIlIIIIIlIlIIlI, final int lllllllllllllIlIIlIlIIIIIlIlIIIl) {
        return lllllllllllllIlIIlIlIIIIIlIlIIlI >= lllllllllllllIlIIlIlIIIIIlIlIIIl;
    }
    
    static {
        lIlllIlIllIlllI();
        lIlllIlIllIlIll();
    }
    
    private static String lIlllIlIllIlIIl(final String lllllllllllllIlIIlIlIIIIIlIllIlI, final String lllllllllllllIlIIlIlIIIIIlIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIIIIIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIIIIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlIIIIIlIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlIIIIIlIlllII.init(MessageDeserializer2.lIIIIllIIIIIlI[3], lllllllllllllIlIIlIlIIIIIlIlllIl);
            return new String(lllllllllllllIlIIlIlIIIIIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIIIIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIIIIIlIllIll) {
            lllllllllllllIlIIlIlIIIIIlIllIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllIlIllIlllI() {
        (lIIIIllIIIIIlI = new int[4])[0] = "   ".length();
        MessageDeserializer2.lIIIIllIIIIIlI[1] = ((0xC3 ^ 0xAE ^ (0x13 ^ 0x44)) & (0x6D ^ 0xE ^ (0xD2 ^ 0x8B) ^ -" ".length()));
        MessageDeserializer2.lIIIIllIIIIIlI[2] = " ".length();
        MessageDeserializer2.lIIIIllIIIIIlI[3] = "  ".length();
    }
    
    private static boolean lIlllIlIllIllll(final int lllllllllllllIlIIlIlIIIIIlIIllll) {
        return lllllllllllllIlIIlIlIIIIIlIIllll == 0;
    }
}
