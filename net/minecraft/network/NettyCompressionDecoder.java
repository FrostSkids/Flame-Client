// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.network;

import java.util.zip.DataFormatException;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.zip.Inflater;
import io.netty.handler.codec.ByteToMessageDecoder;

public class NettyCompressionDecoder extends ByteToMessageDecoder
{
    private final /* synthetic */ Inflater inflater;
    private static final /* synthetic */ int[] lIlIllIllllIlI;
    private static final /* synthetic */ String[] lIlIllIllllIIl;
    private /* synthetic */ int treshold;
    
    public NettyCompressionDecoder(final int lllllllllllllIIIIllIIIIlllIlIIII) {
        this.treshold = lllllllllllllIIIIllIIIIlllIlIIII;
        this.inflater = new Inflater();
    }
    
    private static void llllIIlIlIlIIIl() {
        (lIlIllIllllIIl = new String[NettyCompressionDecoder.lIlIllIllllIlI[5]])[NettyCompressionDecoder.lIlIllIllllIlI[0]] = llllIIlIlIIlIlI("N0hX9jN7YmNqoIyi78ii0AHKaQJLCpwl/dCzdT0XM6yeh+CmScVvvA==", "SLQUv");
        NettyCompressionDecoder.lIlIllIllllIIl[NettyCompressionDecoder.lIlIllIllllIlI[1]] = llllIIlIlIIllll("NkJumePvHfHQriQ5grdpYe88UYD6z46+sptlEBKJ1iQ=", "iTDfB");
        NettyCompressionDecoder.lIlIllIllllIIl[NettyCompressionDecoder.lIlIllIllllIlI[3]] = llllIIlIlIIlIlI("TkXChDtd/+JQRHVlflr6lsfDb31JPels8naYq6bQ94YcBt3LyHkEkg==", "sKYgq");
        NettyCompressionDecoder.lIlIllIllllIIl[NettyCompressionDecoder.lIlIllIllllIlI[4]] = llllIIlIlIIlIlI("R8CaLxDHAO1UUdVk3r+dIO+zpl/DNMtyFcVccj/VEbTc2X5URWzwXg==", "uOpdN");
    }
    
    private static String llllIIlIlIIllll(final String lllllllllllllIIIIllIIIIllIlIlIlI, final String lllllllllllllIIIIllIIIIllIlIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIIIllIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIIIllIlIlIIl.getBytes(StandardCharsets.UTF_8)), NettyCompressionDecoder.lIlIllIllllIlI[6]), "DES");
            final Cipher lllllllllllllIIIIllIIIIllIlIlllI = Cipher.getInstance("DES");
            lllllllllllllIIIIllIIIIllIlIlllI.init(NettyCompressionDecoder.lIlIllIllllIlI[3], lllllllllllllIIIIllIIIIllIlIllll);
            return new String(lllllllllllllIIIIllIIIIllIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIIIllIlIllIl) {
            lllllllllllllIIIIllIIIIllIlIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIIIllIIIIlllIIIlll, final ByteBuf lllllllllllllIIIIllIIIIllIllllll, final List<Object> lllllllllllllIIIIllIIIIlllIIIlIl) throws DataFormatException, Exception {
        if (llllIIlIlIlIIll(lllllllllllllIIIIllIIIIllIllllll.readableBytes())) {
            final PacketBuffer lllllllllllllIIIIllIIIIlllIIIlII = new PacketBuffer(lllllllllllllIIIIllIIIIllIllllll);
            final int lllllllllllllIIIIllIIIIlllIIIIll = lllllllllllllIIIIllIIIIlllIIIlII.readVarIntFromBuffer();
            if (llllIIlIlIlIlII(lllllllllllllIIIIllIIIIlllIIIIll)) {
                lllllllllllllIIIIllIIIIlllIIIlIl.add(lllllllllllllIIIIllIIIIlllIIIlII.readBytes(lllllllllllllIIIIllIIIIlllIIIlII.readableBytes()));
                "".length();
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                if (llllIIlIlIlIlIl(lllllllllllllIIIIllIIIIlllIIIIll, this.treshold)) {
                    throw new DecoderException(String.valueOf(new StringBuilder(NettyCompressionDecoder.lIlIllIllllIIl[NettyCompressionDecoder.lIlIllIllllIlI[0]]).append(lllllllllllllIIIIllIIIIlllIIIIll).append(NettyCompressionDecoder.lIlIllIllllIIl[NettyCompressionDecoder.lIlIllIllllIlI[1]]).append(this.treshold)));
                }
                if (llllIIlIlIlIllI(lllllllllllllIIIIllIIIIlllIIIIll, NettyCompressionDecoder.lIlIllIllllIlI[2])) {
                    throw new DecoderException(String.valueOf(new StringBuilder(NettyCompressionDecoder.lIlIllIllllIIl[NettyCompressionDecoder.lIlIllIllllIlI[3]]).append(lllllllllllllIIIIllIIIIlllIIIIll).append(NettyCompressionDecoder.lIlIllIllllIIl[NettyCompressionDecoder.lIlIllIllllIlI[4]]).append(NettyCompressionDecoder.lIlIllIllllIlI[2])));
                }
                final byte[] lllllllllllllIIIIllIIIIlllIIIIlI = new byte[lllllllllllllIIIIllIIIIlllIIIlII.readableBytes()];
                lllllllllllllIIIIllIIIIlllIIIlII.readBytes(lllllllllllllIIIIllIIIIlllIIIIlI);
                "".length();
                this.inflater.setInput(lllllllllllllIIIIllIIIIlllIIIIlI);
                final byte[] lllllllllllllIIIIllIIIIlllIIIIIl = new byte[lllllllllllllIIIIllIIIIlllIIIIll];
                this.inflater.inflate(lllllllllllllIIIIllIIIIlllIIIIIl);
                "".length();
                lllllllllllllIIIIllIIIIlllIIIlIl.add(Unpooled.wrappedBuffer(lllllllllllllIIIIllIIIIlllIIIIIl));
                "".length();
                this.inflater.reset();
            }
        }
    }
    
    private static boolean llllIIlIlIlIlII(final int lllllllllllllIIIIllIIIIllIIIlllI) {
        return lllllllllllllIIIIllIIIIllIIIlllI == 0;
    }
    
    static {
        llllIIlIlIlIIlI();
        llllIIlIlIlIIIl();
    }
    
    private static boolean llllIIlIlIlIllI(final int lllllllllllllIIIIllIIIIllIIlIIll, final int lllllllllllllIIIIllIIIIllIIlIIlI) {
        return lllllllllllllIIIIllIIIIllIIlIIll > lllllllllllllIIIIllIIIIllIIlIIlI;
    }
    
    private static boolean llllIIlIlIlIlIl(final int lllllllllllllIIIIllIIIIllIIlIlll, final int lllllllllllllIIIIllIIIIllIIlIllI) {
        return lllllllllllllIIIIllIIIIllIIlIlll < lllllllllllllIIIIllIIIIllIIlIllI;
    }
    
    private static void llllIIlIlIlIIlI() {
        (lIlIllIllllIlI = new int[7])[0] = ((0x4D ^ 0x2F) & ~(0x5E ^ 0x3C));
        NettyCompressionDecoder.lIlIllIllllIlI[1] = " ".length();
        NettyCompressionDecoder.lIlIllIllllIlI[2] = (0xFFFFB81F & 0x2047E0);
        NettyCompressionDecoder.lIlIllIllllIlI[3] = "  ".length();
        NettyCompressionDecoder.lIlIllIllllIlI[4] = "   ".length();
        NettyCompressionDecoder.lIlIllIllllIlI[5] = (0x80 ^ 0x84);
        NettyCompressionDecoder.lIlIllIllllIlI[6] = (0x89 ^ 0x81);
    }
    
    private static boolean llllIIlIlIlIIll(final int lllllllllllllIIIIllIIIIllIIlIIII) {
        return lllllllllllllIIIIllIIIIllIIlIIII != 0;
    }
    
    public void setCompressionTreshold(final int lllllllllllllIIIIllIIIIllIllIllI) {
        this.treshold = lllllllllllllIIIIllIIIIllIllIllI;
    }
    
    private static String llllIIlIlIIlIlI(final String lllllllllllllIIIIllIIIIllIIlllIl, final String lllllllllllllIIIIllIIIIllIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIIIllIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIIIllIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIIIIllIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIIIIllIlIIIIl.init(NettyCompressionDecoder.lIlIllIllllIlI[3], lllllllllllllIIIIllIIIIllIlIIIlI);
            return new String(lllllllllllllIIIIllIIIIllIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIIIllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIIIllIlIIIII) {
            lllllllllllllIIIIllIIIIllIlIIIII.printStackTrace();
            return null;
        }
    }
}
