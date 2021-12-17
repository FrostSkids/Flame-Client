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
import io.netty.buffer.ByteBufUtil;
import java.nio.CharBuffer;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.nio.charset.Charset;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.MessageToMessageEncoder;

@ChannelHandler.Sharable
public class StringEncoder extends MessageToMessageEncoder<CharSequence>
{
    private final /* synthetic */ Charset charset;
    private static final /* synthetic */ String[] lIIlllIllIlIll;
    private static final /* synthetic */ int[] lIIlllIllIllII;
    
    private static boolean llIlllIIIIlIIlI(final int lllllllllllllIIlIIlllIIIllIlllll) {
        return lllllllllllllIIlIIlllIIIllIlllll == 0;
    }
    
    private static boolean llIlllIIIIlIIIl(final Object lllllllllllllIIlIIlllIIIlllIIIIl) {
        return lllllllllllllIIlIIlllIIIlllIIIIl == null;
    }
    
    private static void llIlllIIIIIllll() {
        (lIIlllIllIlIll = new String[StringEncoder.lIIlllIllIllII[1]])[StringEncoder.lIIlllIllIllII[0]] = llIlllIIIIIlllI("YxnCXs3tCJM=", "qjnEp");
    }
    
    public StringEncoder() {
        this(Charset.defaultCharset());
    }
    
    static {
        llIlllIIIIlIIII();
        llIlllIIIIIllll();
    }
    
    private static void llIlllIIIIlIIII() {
        (lIIlllIllIllII = new int[3])[0] = ((86 + 131 - 185 + 112 ^ 130 + 150 - 269 + 145) & (0x76 ^ 0x6E ^ (0x6D ^ 0x79) ^ -" ".length()));
        StringEncoder.lIIlllIllIllII[1] = " ".length();
        StringEncoder.lIIlllIllIllII[2] = "  ".length();
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIIlIIlllIIIlllllllI, final CharSequence lllllllllllllIIlIIlllIIlIIIIIIIl, final List<Object> lllllllllllllIIlIIlllIIIllllllII) throws Exception {
        if (llIlllIIIIlIIlI(lllllllllllllIIlIIlllIIlIIIIIIIl.length())) {
            return;
        }
        lllllllllllllIIlIIlllIIIllllllII.add(ByteBufUtil.encodeString(lllllllllllllIIlIIlllIIIlllllllI.alloc(), CharBuffer.wrap(lllllllllllllIIlIIlllIIlIIIIIIIl), this.charset));
        "".length();
    }
    
    public StringEncoder(final Charset lllllllllllllIIlIIlllIIlIIIIlIlI) {
        if (llIlllIIIIlIIIl(lllllllllllllIIlIIlllIIlIIIIlIlI)) {
            throw new NullPointerException(StringEncoder.lIIlllIllIlIll[StringEncoder.lIIlllIllIllII[0]]);
        }
        this.charset = lllllllllllllIIlIIlllIIlIIIIlIlI;
    }
    
    private static String llIlllIIIIIlllI(final String lllllllllllllIIlIIlllIIIlllIIllI, final String lllllllllllllIIlIIlllIIIlllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlllIIIlllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlllIIIlllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlllIIIlllIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlllIIIlllIlIlI.init(StringEncoder.lIIlllIllIllII[2], lllllllllllllIIlIIlllIIIlllIlIll);
            return new String(lllllllllllllIIlIIlllIIIlllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlllIIIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlllIIIlllIlIIl) {
            lllllllllllllIIlIIlllIIIlllIlIIl.printStackTrace();
            return null;
        }
    }
}
