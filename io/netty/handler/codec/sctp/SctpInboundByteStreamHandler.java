// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.sctp;

import io.netty.handler.codec.CodecException;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.sctp.SctpMessage;
import io.netty.handler.codec.MessageToMessageDecoder;

public class SctpInboundByteStreamHandler extends MessageToMessageDecoder<SctpMessage>
{
    private final /* synthetic */ int protocolIdentifier;
    private final /* synthetic */ int streamIdentifier;
    private static final /* synthetic */ int[] lIlIlIlIlIIlIl;
    private static final /* synthetic */ String[] lIlIlIlIlIIlII;
    
    private static void lllIlllIIlIlllI() {
        (lIlIlIlIlIIlII = new String[SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[1]])[SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[0]] = lllIlllIIlIllIl("ClF45OYa/8TZ8A9sHuH0HvTVqFQ6MFOOpCizE+wAS2oe/3I2QZyV0YKE+222cF7/3jAmEhM0Ei8tAp6WK0SOSwb0LNrZ8sd4RFWncHD1e/dq+hhI2Ecbrg==", "GZvKI");
    }
    
    public SctpInboundByteStreamHandler(final int lllllllllllllIIIlIIIIlIIIlIIllIl, final int lllllllllllllIIIlIIIIlIIIlIIllII) {
        this.protocolIdentifier = lllllllllllllIIIlIIIIlIIIlIIllIl;
        this.streamIdentifier = lllllllllllllIIIlIIIIlIIIlIIllII;
    }
    
    private static String lllIlllIIlIllIl(final String lllllllllllllIIIlIIIIlIIIIlIIlII, final String lllllllllllllIIIlIIIIlIIIIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIlIIIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIlIIIIlIIIll.getBytes(StandardCharsets.UTF_8)), SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[2]), "DES");
            final Cipher lllllllllllllIIIlIIIIlIIIIlIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIlIIIIlIIIIlIIllI.init(SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[3], lllllllllllllIIIlIIIIlIIIIlIIlll);
            return new String(lllllllllllllIIIlIIIIlIIIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIlIIIIlIIlIl) {
            lllllllllllllIIIlIIIIlIIIIlIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIlllIIllIIIl(final int lllllllllllllIIIlIIIIlIIIIIlllII, final int lllllllllllllIIIlIIIIlIIIIIllIll) {
        return lllllllllllllIIIlIIIIlIIIIIlllII == lllllllllllllIIIlIIIIlIIIIIllIll;
    }
    
    @Override
    public final boolean acceptInboundMessage(final Object lllllllllllllIIIlIIIIlIIIlIIIllI) throws Exception {
        if (lllIlllIIllIIII(super.acceptInboundMessage(lllllllllllllIIIlIIIIlIIIlIIIllI) ? 1 : 0)) {
            return this.acceptInboundMessage((SctpMessage)lllllllllllllIIIlIIIIlIIIlIIIllI);
        }
        return SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[0] != 0;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIIlIIIIlIIIIllllII, final SctpMessage lllllllllllllIIIlIIIIlIIIIlllIIl, final List<Object> lllllllllllllIIIlIIIIlIIIIlllIlI) throws Exception {
        if (lllIlllIIllIIlI(lllllllllllllIIIlIIIIlIIIIlllIIl.isComplete() ? 1 : 0)) {
            final String format = SctpInboundByteStreamHandler.lIlIlIlIlIIlII[SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[0]];
            final Object[] args = new Object[SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[1]];
            args[SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[0]] = SctpMessageCompletionHandler.class.getSimpleName();
            throw new CodecException(String.format(format, args));
        }
        lllllllllllllIIIlIIIIlIIIIlllIlI.add(lllllllllllllIIIlIIIIlIIIIlllIIl.content().retain());
        "".length();
    }
    
    private static boolean lllIlllIIllIIlI(final int lllllllllllllIIIlIIIIlIIIIIlIlll) {
        return lllllllllllllIIIlIIIIlIIIIIlIlll == 0;
    }
    
    protected boolean acceptInboundMessage(final SctpMessage lllllllllllllIIIlIIIIlIIIlIIIIII) {
        int n;
        if (lllIlllIIllIIIl(lllllllllllllIIIlIIIIlIIIlIIIIII.protocolIdentifier(), this.protocolIdentifier) && lllIlllIIllIIIl(lllllllllllllIIIlIIIIlIIIlIIIIII.streamIdentifier(), this.streamIdentifier)) {
            n = SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[1];
            "".length();
            if ((0x5D ^ 0x58) == 0x0) {
                return ((0x23 ^ 0x2D) & ~(0xC9 ^ 0xC7)) != 0x0;
            }
        }
        else {
            n = SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[0];
        }
        return n != 0;
    }
    
    private static boolean lllIlllIIllIIII(final int lllllllllllllIIIlIIIIlIIIIIllIIl) {
        return lllllllllllllIIIlIIIIlIIIIIllIIl != 0;
    }
    
    private static void lllIlllIIlIllll() {
        (lIlIlIlIlIIlIl = new int[4])[0] = ((126 + 11 - 54 + 58 ^ 151 + 78 - 182 + 147) & (74 + 49 - 21 + 95 ^ 4 + 119 - 67 + 82 ^ -" ".length()));
        SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[1] = " ".length();
        SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[2] = (123 + 159 - 141 + 27 ^ 39 + 41 + 11 + 69);
        SctpInboundByteStreamHandler.lIlIlIlIlIIlIl[3] = "  ".length();
    }
    
    static {
        lllIlllIIlIllll();
        lllIlllIIlIlllI();
    }
}
