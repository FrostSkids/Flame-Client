// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.http.FullHttpResponse;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

class WebSocketClientProtocolHandshakeHandler extends ChannelInboundHandlerAdapter
{
    private static final /* synthetic */ String[] lllIlllIIIllII;
    private static final /* synthetic */ int[] lllIlllIIlIIII;
    private final /* synthetic */ WebSocketClientHandshaker handshaker;
    
    private static void lIlIIlIllIIlIIII() {
        (lllIlllIIlIIII = new int[3])[0] = ((0xA4 ^ 0x86) & ~(0x63 ^ 0x41));
        WebSocketClientProtocolHandshakeHandler.lllIlllIIlIIII[1] = " ".length();
        WebSocketClientProtocolHandshakeHandler.lllIlllIIlIIII[2] = "  ".length();
    }
    
    static {
        lIlIIlIllIIlIIII();
        lIlIIlIllIIIlllI();
    }
    
    @Override
    public void channelActive(final ChannelHandlerContext llllllllllllIlIllIIIIllIIIIlIllI) throws Exception {
        super.channelActive(llllllllllllIlIllIIIIllIIIIlIllI);
        this.handshaker.handshake(llllllllllllIlIllIIIIllIIIIlIllI.channel()).addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
            @Override
            public void operationComplete(final ChannelFuture lllllllllllllIlIlIllIllIlllIIIII) throws Exception {
                if (lIlIlllIlIIIIII(lllllllllllllIlIlIllIllIlllIIIII.isSuccess() ? 1 : 0)) {
                    llllllllllllIlIllIIIIllIIIIlIllI.fireExceptionCaught(lllllllllllllIlIlIllIllIlllIIIII.cause());
                    "".length();
                    "".length();
                    if ((0x7F ^ 0x7B) == "   ".length()) {
                        return;
                    }
                }
                else {
                    llllllllllllIlIllIIIIllIIIIlIllI.fireUserEventTriggered(WebSocketClientProtocolHandler.ClientHandshakeStateEvent.HANDSHAKE_ISSUED);
                    "".length();
                }
            }
            
            private static boolean lIlIlllIlIIIIII(final int lllllllllllllIlIlIllIllIllIllIII) {
                return lllllllllllllIlIlIllIllIllIllIII == 0;
            }
        });
        "".length();
    }
    
    private static boolean lIlIIlIllIIlIIIl(final int llllllllllllIlIllIIIIlIlllllllII) {
        return llllllllllllIlIllIIIIlIlllllllII == 0;
    }
    
    private static void lIlIIlIllIIIlllI() {
        (lllIlllIIIllII = new String[WebSocketClientProtocolHandshakeHandler.lllIlllIIlIIII[1]])[WebSocketClientProtocolHandshakeHandler.lllIlllIIlIIII[0]] = lIlIIlIllIIIlIlI("8SoS2gH2/O0AIVWwfaLlGtse7EswGE+yUB3gBPmLvDfqmR8cTnEmrDddgBQkfFPyGJEWPtaj5+06q+d9eUkxIA==", "Jltml");
    }
    
    private static String lIlIIlIllIIIlIlI(final String llllllllllllIlIllIIIIllIIIIIIIll, final String llllllllllllIlIllIIIIllIIIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIllIIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIIllIIIIIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIIllIIIIIIlIl.init(WebSocketClientProtocolHandshakeHandler.lllIlllIIlIIII[2], llllllllllllIlIllIIIIllIIIIIIllI);
            return new String(llllllllllllIlIllIIIIllIIIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIllIIIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIllIIIIIIlII) {
            llllllllllllIlIllIIIIllIIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIlIllIIIIllIIIIIllII, final Object llllllllllllIlIllIIIIllIIIIIlllI) throws Exception {
        if (lIlIIlIllIIlIIIl((llllllllllllIlIllIIIIllIIIIIlllI instanceof FullHttpResponse) ? 1 : 0)) {
            llllllllllllIlIllIIIIllIIIIIllII.fireChannelRead(llllllllllllIlIllIIIIllIIIIIlllI);
            "".length();
            return;
        }
        if (lIlIIlIllIIlIIIl(this.handshaker.isHandshakeComplete() ? 1 : 0)) {
            this.handshaker.finishHandshake(llllllllllllIlIllIIIIllIIIIIllII.channel(), (FullHttpResponse)llllllllllllIlIllIIIIllIIIIIlllI);
            llllllllllllIlIllIIIIllIIIIIllII.fireUserEventTriggered(WebSocketClientProtocolHandler.ClientHandshakeStateEvent.HANDSHAKE_COMPLETE);
            "".length();
            llllllllllllIlIllIIIIllIIIIIllII.pipeline().remove(this);
            "".length();
            return;
        }
        throw new IllegalStateException(WebSocketClientProtocolHandshakeHandler.lllIlllIIIllII[WebSocketClientProtocolHandshakeHandler.lllIlllIIlIIII[0]]);
    }
    
    WebSocketClientProtocolHandshakeHandler(final WebSocketClientHandshaker llllllllllllIlIllIIIIllIIIIllIll) {
        this.handshaker = llllllllllllIlIllIIIIllIIIIllIll;
    }
}
