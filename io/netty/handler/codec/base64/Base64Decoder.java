// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.base64;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageDecoder;

@ChannelHandler.Sharable
public class Base64Decoder extends MessageToMessageDecoder<ByteBuf>
{
    private static final /* synthetic */ String[] lIIlIIIIllIlII;
    private final /* synthetic */ Base64Dialect dialect;
    private static final /* synthetic */ int[] lIIlIIIIllIlIl;
    
    private static boolean llIIlIlIIIIlllI(final Object lllllllllllllIIlllIlIllIIIlIlllI) {
        return lllllllllllllIIlllIlIllIIIlIlllI == null;
    }
    
    public Base64Decoder() {
        this(Base64Dialect.STANDARD);
    }
    
    private static String llIIlIlIIIIlIlI(final String lllllllllllllIIlllIlIllIIIllIIll, final String lllllllllllllIIlllIlIllIIIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlIllIIIlllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlIllIIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIlIllIIIllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIlIllIIIllIlll.init(Base64Decoder.lIIlIIIIllIlIl[2], lllllllllllllIIlllIlIllIIIlllIII);
            return new String(lllllllllllllIIlllIlIllIIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlIllIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlIllIIIllIllI) {
            lllllllllllllIIlllIlIllIIIllIllI.printStackTrace();
            return null;
        }
    }
    
    private static void llIIlIlIIIIllIl() {
        (lIIlIIIIllIlIl = new int[3])[0] = ((13 + 105 - 96 + 205 ^ 18 + 83 + 70 + 16) & (0x43 ^ 0x51 ^ (0x3C ^ 0x76) ^ -" ".length()));
        Base64Decoder.lIIlIIIIllIlIl[1] = " ".length();
        Base64Decoder.lIIlIIIIllIlIl[2] = "  ".length();
    }
    
    static {
        llIIlIlIIIIllIl();
        llIIlIlIIIIllII();
    }
    
    public Base64Decoder(final Base64Dialect lllllllllllllIIlllIlIllIIlIlIlIl) {
        if (llIIlIlIIIIlllI(lllllllllllllIIlllIlIllIIlIlIlIl)) {
            throw new NullPointerException(Base64Decoder.lIIlIIIIllIlII[Base64Decoder.lIIlIIIIllIlIl[0]]);
        }
        this.dialect = lllllllllllllIIlllIlIllIIlIlIlIl;
    }
    
    private static void llIIlIlIIIIllII() {
        (lIIlIIIIllIlII = new String[Base64Decoder.lIIlIIIIllIlIl[1]])[Base64Decoder.lIIlIIIIllIlIl[0]] = llIIlIlIIIIlIlI("ikEkMRdVOWk=", "pUOTU");
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIlllIlIllIIlIIlllI, final ByteBuf lllllllllllllIIlllIlIllIIlIIlIlI, final List<Object> lllllllllllllIIlllIlIllIIlIIlIIl) throws Exception {
        lllllllllllllIIlllIlIllIIlIIlIIl.add(io.netty.handler.codec.base64.Base64.decode(lllllllllllllIIlllIlIllIIlIIlIlI, lllllllllllllIIlllIlIllIIlIIlIlI.readerIndex(), lllllllllllllIIlllIlIllIIlIIlIlI.readableBytes(), this.dialect));
        "".length();
    }
}
