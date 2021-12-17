// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelHandler;
import java.util.List;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFutureListener;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.AttributeKey;

public class WebSocketServerProtocolHandler extends WebSocketProtocolHandler
{
    private final /* synthetic */ String subprotocols;
    private final /* synthetic */ String websocketPath;
    private final /* synthetic */ int maxFramePayloadLength;
    private static final /* synthetic */ AttributeKey<WebSocketServerHandshaker> HANDSHAKER_ATTR_KEY;
    private static final /* synthetic */ String[] llIllIIIlIllII;
    private final /* synthetic */ boolean allowExtensions;
    private static final /* synthetic */ int[] llIllIIIlIllIl;
    
    private static void lIIlIllIIlllllIl() {
        (llIllIIIlIllII = new String[WebSocketServerProtocolHandler.llIllIIIlIllIl[2]])[WebSocketServerProtocolHandler.llIllIIIlIllIl[0]] = lIIlIllIIlllllII("HOx5ldMSnD0ZdQYxkfETqw==", "LhXkA");
    }
    
    public WebSocketServerProtocolHandler(final String llllllllllllIllIlIIIIIIlIlllllll, final String llllllllllllIllIlIIIIIIlIllllllI, final boolean llllllllllllIllIlIIIIIIlIllllIIl) {
        this(llllllllllllIllIlIIIIIIlIlllllll, llllllllllllIllIlIIIIIIlIllllllI, llllllllllllIllIlIIIIIIlIllllIIl, WebSocketServerProtocolHandler.llIllIIIlIllIl[1]);
    }
    
    private static void lIIlIllIIllllllI() {
        (llIllIIIlIllIl = new int[5])[0] = ((89 + 65 - 13 + 1 ^ 123 + 9 - 8 + 66) & (0x20 ^ 0x1C ^ (0x6F ^ 0x63) ^ -" ".length()));
        WebSocketServerProtocolHandler.llIllIIIlIllIl[1] = (-(0xFFFFEF8E & 0x5F7F) & (0xFFFFCFFF & 0x17F0D));
        WebSocketServerProtocolHandler.llIllIIIlIllIl[2] = " ".length();
        WebSocketServerProtocolHandler.llIllIIIlIllIl[3] = (0xBF ^ 0xB7);
        WebSocketServerProtocolHandler.llIllIIIlIllIl[4] = "  ".length();
    }
    
    public WebSocketServerProtocolHandler(final String llllllllllllIllIlIIIIIIllIIIIllI, final String llllllllllllIllIlIIIIIIllIIIIlIl) {
        this(llllllllllllIllIlIIIIIIllIIIIllI, llllllllllllIllIlIIIIIIllIIIIlIl, (boolean)(WebSocketServerProtocolHandler.llIllIIIlIllIl[0] != 0));
    }
    
    private static String lIIlIllIIlllllII(final String llllllllllllIllIlIIIIIIlIIlIlIll, final String llllllllllllIllIlIIIIIIlIIlIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIIIlIIlIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIIIlIIlIlIII.getBytes(StandardCharsets.UTF_8)), WebSocketServerProtocolHandler.llIllIIIlIllIl[3]), "DES");
            final Cipher llllllllllllIllIlIIIIIIlIIlIllIl = Cipher.getInstance("DES");
            llllllllllllIllIlIIIIIIlIIlIllIl.init(WebSocketServerProtocolHandler.llIllIIIlIllIl[4], llllllllllllIllIlIIIIIIlIIlIlllI);
            return new String(llllllllllllIllIlIIIIIIlIIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIIIlIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIIIlIIlIllII) {
            llllllllllllIllIlIIIIIIlIIlIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIllIlIIIIIIl(final Object llllllllllllIllIlIIIIIIlIIlIIlII) {
        return llllllllllllIllIlIIIIIIlIIlIIlII != null;
    }
    
    static WebSocketServerHandshaker getHandshaker(final ChannelHandlerContext llllllllllllIllIlIIIIIIlIlIIIlIl) {
        return llllllllllllIllIlIIIIIIlIlIIIlIl.attr(WebSocketServerProtocolHandler.HANDSHAKER_ATTR_KEY).get();
    }
    
    static {
        lIIlIllIIllllllI();
        lIIlIllIIlllllIl();
        HANDSHAKER_ATTR_KEY = AttributeKey.valueOf(String.valueOf(new StringBuilder().append(WebSocketServerHandshaker.class.getName()).append(WebSocketServerProtocolHandler.llIllIIIlIllII[WebSocketServerProtocolHandler.llIllIIIlIllIl[0]])));
    }
    
    static void setHandshaker(final ChannelHandlerContext llllllllllllIllIlIIIIIIlIlIIIIII, final WebSocketServerHandshaker llllllllllllIllIlIIIIIIlIIllllll) {
        llllllllllllIllIlIIIIIIlIlIIIIII.attr(WebSocketServerProtocolHandler.HANDSHAKER_ATTR_KEY).set(llllllllllllIllIlIIIIIIlIIllllll);
    }
    
    @Override
    public void exceptionCaught(final ChannelHandlerContext llllllllllllIllIlIIIIIIlIlIIlIlI, final Throwable llllllllllllIllIlIIIIIIlIlIIlIIl) throws Exception {
        if (lIIlIllIlIIIIIII((llllllllllllIllIlIIIIIIlIlIIlIIl instanceof WebSocketHandshakeException) ? 1 : 0)) {
            final FullHttpResponse llllllllllllIllIlIIIIIIlIlIIlllI = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_REQUEST, Unpooled.wrappedBuffer(llllllllllllIllIlIIIIIIlIlIIlIIl.getMessage().getBytes()));
            llllllllllllIllIlIIIIIIlIlIIlIlI.channel().writeAndFlush(llllllllllllIllIlIIIIIIlIlIIlllI).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
            "".length();
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            llllllllllllIllIlIIIIIIlIlIIlIlI.close();
            "".length();
        }
    }
    
    private static boolean lIIlIllIlIIIIIII(final int llllllllllllIllIlIIIIIIlIIlIIIII) {
        return llllllllllllIllIlIIIIIIlIIlIIIII != 0;
    }
    
    public WebSocketServerProtocolHandler(final String llllllllllllIllIlIIIIIIllIIlIIII) {
        this(llllllllllllIllIlIIIIIIllIIlIIII, null, (boolean)(WebSocketServerProtocolHandler.llIllIIIlIllIl[0] != 0));
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIllIlIIIIIIlIlIlIlIl, final WebSocketFrame llllllllllllIllIlIIIIIIlIlIllIII, final List<Object> llllllllllllIllIlIIIIIIlIlIlIIll) throws Exception {
        if (lIIlIllIlIIIIIII((llllllllllllIllIlIIIIIIlIlIllIII instanceof CloseWebSocketFrame) ? 1 : 0)) {
            final WebSocketServerHandshaker llllllllllllIllIlIIIIIIlIlIllIll = getHandshaker(llllllllllllIllIlIIIIIIlIlIlIlIl);
            if (lIIlIllIlIIIIIIl(llllllllllllIllIlIIIIIIlIlIllIll)) {
                llllllllllllIllIlIIIIIIlIlIllIII.retain();
                "".length();
                llllllllllllIllIlIIIIIIlIlIllIll.close(llllllllllllIllIlIIIIIIlIlIlIlIl.channel(), (CloseWebSocketFrame)llllllllllllIllIlIIIIIIlIlIllIII);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                llllllllllllIllIlIIIIIIlIlIlIlIl.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
                "".length();
            }
            return;
        }
        super.decode(llllllllllllIllIlIIIIIIlIlIlIlIl, llllllllllllIllIlIIIIIIlIlIllIII, llllllllllllIllIlIIIIIIlIlIlIIll);
    }
    
    static ChannelHandler forbiddenHttpRequestResponder() {
        return new ChannelInboundHandlerAdapter() {
            @Override
            public void channelRead(final ChannelHandlerContext lllllllllllllIlIIIllllIlllIIllIl, final Object lllllllllllllIlIIIllllIlllIIlllI) throws Exception {
                if (lIllllIIllIllIl((lllllllllllllIlIIIllllIlllIIlllI instanceof FullHttpRequest) ? 1 : 0)) {
                    ((FullHttpRequest)lllllllllllllIlIIIllllIlllIIlllI).release();
                    "".length();
                    final FullHttpResponse lllllllllllllIlIIIllllIlllIlIIIl = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.FORBIDDEN);
                    lllllllllllllIlIIIllllIlllIIllIl.channel().writeAndFlush(lllllllllllllIlIIIllllIlllIlIIIl);
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIIIllllIlllIIllIl.fireChannelRead(lllllllllllllIlIIIllllIlllIIlllI);
                    "".length();
                }
            }
            
            private static boolean lIllllIIllIllIl(final int lllllllllllllIlIIIllllIlllIIlIIl) {
                return lllllllllllllIlIIIllllIlllIIlIIl != 0;
            }
        };
    }
    
    @Override
    public void handlerAdded(final ChannelHandlerContext llllllllllllIllIlIIIIIIlIllIIIlI) {
        final ChannelPipeline llllllllllllIllIlIIIIIIlIllIIlII = llllllllllllIllIlIIIIIIlIllIIIlI.pipeline();
        if (lIIlIllIIlllllll(llllllllllllIllIlIIIIIIlIllIIlII.get(WebSocketServerProtocolHandshakeHandler.class))) {
            llllllllllllIllIlIIIIIIlIllIIIlI.pipeline().addBefore(llllllllllllIllIlIIIIIIlIllIIIlI.name(), WebSocketServerProtocolHandshakeHandler.class.getName(), new WebSocketServerProtocolHandshakeHandler(this.websocketPath, this.subprotocols, this.allowExtensions, this.maxFramePayloadLength));
            "".length();
        }
    }
    
    private static boolean lIIlIllIIlllllll(final Object llllllllllllIllIlIIIIIIlIIlIIIlI) {
        return llllllllllllIllIlIIIIIIlIIlIIIlI == null;
    }
    
    public WebSocketServerProtocolHandler(final String llllllllllllIllIlIIIIIIlIlllIIlI, final String llllllllllllIllIlIIIIIIlIllIllII, final boolean llllllllllllIllIlIIIIIIlIllIlIll, final int llllllllllllIllIlIIIIIIlIllIllll) {
        this.websocketPath = llllllllllllIllIlIIIIIIlIlllIIlI;
        this.subprotocols = llllllllllllIllIlIIIIIIlIllIllII;
        this.allowExtensions = llllllllllllIllIlIIIIIIlIllIlIll;
        this.maxFramePayloadLength = llllllllllllIllIlIIIIIIlIllIllll;
    }
    
    public enum ServerHandshakeStateEvent
    {
        private static final /* synthetic */ int[] lIlIIIIIIlllll;
        
        HANDSHAKE_COMPLETE;
        
        private static void lllIIIIIIlIllII() {
            (lIlIIIIIIlllIl = new String[ServerHandshakeStateEvent.lIlIIIIIIlllll[1]])[ServerHandshakeStateEvent.lIlIIIIIIlllll[0]] = lllIIIIIIlIlIll("3KxiZP74d/h4Q577UTjW+2QYNqTfKGDp", "Lzprk");
        }
        
        private static String lllIIIIIIlIlIll(final String lllllllllllllIIlIIIlIIIlIllIlIlI, final String lllllllllllllIIlIIIlIIIlIllIlIIl) {
            try {
                final SecretKeySpec lllllllllllllIIlIIIlIIIlIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIIlIllIlIIl.getBytes(StandardCharsets.UTF_8)), ServerHandshakeStateEvent.lIlIIIIIIlllll[2]), "DES");
                final Cipher lllllllllllllIIlIIIlIIIlIllIllII = Cipher.getInstance("DES");
                lllllllllllllIIlIIIlIIIlIllIllII.init(ServerHandshakeStateEvent.lIlIIIIIIlllll[3], lllllllllllllIIlIIIlIIIlIllIllIl);
                return new String(lllllllllllllIIlIIIlIIIlIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIIlIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlIIIlIIIlIllIlIll) {
                lllllllllllllIIlIIIlIIIlIllIlIll.printStackTrace();
                return null;
            }
        }
        
        private static void lllIIIIIIllIIIl() {
            (lIlIIIIIIlllll = new int[4])[0] = ((0x7E ^ 0x60 ^ "  ".length()) & (133 + 39 - 140 + 145 ^ 56 + 133 - 54 + 38 ^ -" ".length()));
            ServerHandshakeStateEvent.lIlIIIIIIlllll[1] = " ".length();
            ServerHandshakeStateEvent.lIlIIIIIIlllll[2] = (0x2E ^ 0x26);
            ServerHandshakeStateEvent.lIlIIIIIIlllll[3] = "  ".length();
        }
        
        static {
            lllIIIIIIllIIIl();
            lllIIIIIIlIllII();
            final ServerHandshakeStateEvent[] $values = new ServerHandshakeStateEvent[ServerHandshakeStateEvent.lIlIIIIIIlllll[1]];
            $values[ServerHandshakeStateEvent.lIlIIIIIIlllll[0]] = ServerHandshakeStateEvent.HANDSHAKE_COMPLETE;
            $VALUES = $values;
        }
    }
}
