// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.string;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.Charset;
import io.netty.channel.ChannelHandler;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageDecoder;

@ChannelHandler.Sharable
public class StringDecoder extends MessageToMessageDecoder<ByteBuf>
{
    private final /* synthetic */ Charset charset;
    private static final /* synthetic */ int[] llIIIlIllllllI;
    private static final /* synthetic */ String[] llIIIlIlllllII;
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIlllIlIlIIlIlIlIIllI, final ByteBuf llllllllllllIlllIlIlIIlIlIlIIlIl, final List<Object> llllllllllllIlllIlIlIIlIlIlIIlII) throws Exception {
        llllllllllllIlllIlIlIIlIlIlIIlII.add(llllllllllllIlllIlIlIIlIlIlIIlIl.toString(this.charset));
        "".length();
    }
    
    private static void lIIIlIIlllIlllII() {
        (llIIIlIlllllII = new String[StringDecoder.llIIIlIllllllI[1]])[StringDecoder.llIIIlIllllllI[0]] = lIIIlIIlllIllIll("rGMR+oVL5Ik=", "gRjOo");
    }
    
    static {
        lIIIlIIlllIllllI();
        lIIIlIIlllIlllII();
    }
    
    private static boolean lIIIlIIlllIlllll(final Object llllllllllllIlllIlIlIIlIlIIIIllI) {
        return llllllllllllIlllIlIlIIlIlIIIIllI == null;
    }
    
    public StringDecoder() {
        this(Charset.defaultCharset());
    }
    
    private static void lIIIlIIlllIllllI() {
        (llIIIlIllllllI = new int[3])[0] = ((0x81 ^ 0x8F ^ (0x3A ^ 0xB)) & (0x91 ^ 0xAB ^ (0x69 ^ 0x6C) ^ -" ".length()));
        StringDecoder.llIIIlIllllllI[1] = " ".length();
        StringDecoder.llIIIlIllllllI[2] = "  ".length();
    }
    
    public StringDecoder(final Charset llllllllllllIlllIlIlIIlIlIlIllIl) {
        if (lIIIlIIlllIlllll(llllllllllllIlllIlIlIIlIlIlIllIl)) {
            throw new NullPointerException(StringDecoder.llIIIlIlllllII[StringDecoder.llIIIlIllllllI[0]]);
        }
        this.charset = llllllllllllIlllIlIlIIlIlIlIllIl;
    }
    
    private static String lIIIlIIlllIllIll(final String llllllllllllIlllIlIlIIlIlIIIllIl, final String llllllllllllIlllIlIlIIlIlIIIllII) {
        try {
            final SecretKeySpec llllllllllllIlllIlIlIIlIlIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIlIIlIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIlIIlIlIIIllll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIlIIlIlIIIllll.init(StringDecoder.llIIIlIllllllI[2], llllllllllllIlllIlIlIIlIlIIlIIII);
            return new String(llllllllllllIlllIlIlIIlIlIIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIlIIlIlIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIlIIlIlIIIlllI) {
            llllllllllllIlllIlIlIIlIlIIIlllI.printStackTrace();
            return null;
        }
    }
}
