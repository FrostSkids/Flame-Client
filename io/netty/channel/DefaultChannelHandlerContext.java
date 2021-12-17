// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.EventExecutorGroup;

final class DefaultChannelHandlerContext extends AbstractChannelHandlerContext
{
    private final /* synthetic */ ChannelHandler handler;
    private static final /* synthetic */ int[] lIIIllllIllIIl;
    private static final /* synthetic */ String[] lIIIllllIlIlll;
    
    private static boolean isInbound(final ChannelHandler lllllllllllllIIllllIIllIllIIIIII) {
        return lllllllllllllIIllllIIllIllIIIIII instanceof ChannelInboundHandler;
    }
    
    private static void llIIIllllllIIlI() {
        (lIIIllllIllIIl = new int[3])[0] = ((0xE5 ^ 0xBC) & ~(0x39 ^ 0x60));
        DefaultChannelHandlerContext.lIIIllllIllIIl[1] = " ".length();
        DefaultChannelHandlerContext.lIIIllllIllIIl[2] = "  ".length();
    }
    
    @Override
    public ChannelHandler handler() {
        return this.handler;
    }
    
    DefaultChannelHandlerContext(final DefaultChannelPipeline lllllllllllllIIllllIIllIllIIllIl, final EventExecutorGroup lllllllllllllIIllllIIllIllIIIlll, final String lllllllllllllIIllllIIllIllIIIllI, final ChannelHandler lllllllllllllIIllllIIllIllIIlIlI) {
        super(lllllllllllllIIllllIIllIllIIllIl, lllllllllllllIIllllIIllIllIIIlll, lllllllllllllIIllllIIllIllIIIllI, isInbound(lllllllllllllIIllllIIllIllIIlIlI), isOutbound(lllllllllllllIIllllIIllIllIIlIlI));
        if (llIIIllllllIlII(lllllllllllllIIllllIIllIllIIlIlI)) {
            throw new NullPointerException(DefaultChannelHandlerContext.lIIIllllIlIlll[DefaultChannelHandlerContext.lIIIllllIllIIl[0]]);
        }
        this.handler = lllllllllllllIIllllIIllIllIIlIlI;
    }
    
    private static boolean isOutbound(final ChannelHandler lllllllllllllIIllllIIllIlIllllII) {
        return lllllllllllllIIllllIIllIlIllllII instanceof ChannelOutboundHandler;
    }
    
    static {
        llIIIllllllIIlI();
        llIIIllllllIIIl();
    }
    
    private static void llIIIllllllIIIl() {
        (lIIIllllIlIlll = new String[DefaultChannelHandlerContext.lIIIllllIllIIl[1]])[DefaultChannelHandlerContext.lIIIllllIllIIl[0]] = llIIIllllllIIII("3KP6VMIEs5o=", "cDkQe");
    }
    
    private static String llIIIllllllIIII(final String lllllllllllllIIllllIIllIlIllIlII, final String lllllllllllllIIllllIIllIlIllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIllIlIllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIllIlIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIllIlIllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIllIlIllIllI.init(DefaultChannelHandlerContext.lIIIllllIllIIl[2], lllllllllllllIIllllIIllIlIllIlll);
            return new String(lllllllllllllIIllllIIllIlIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIllIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIllIlIllIlIl) {
            lllllllllllllIIllllIIllIlIllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIllllllIlII(final Object lllllllllllllIIllllIIllIlIlIllIl) {
        return lllllllllllllIIllllIIllIlIlIllIl == null;
    }
}
