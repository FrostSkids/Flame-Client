// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.handler.ssl.SslHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpMessage;
import io.netty.handler.codec.http.HttpHeaders;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelHandler;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

class WebSocketServerProtocolHandshakeHandler extends ChannelInboundHandlerAdapter
{
    private final /* synthetic */ String subprotocols;
    private final /* synthetic */ String websocketPath;
    private static final /* synthetic */ int[] lllIIIIlllIIlI;
    private static final /* synthetic */ String[] lllIIIIlllIIIl;
    private final /* synthetic */ int maxFramePayloadSize;
    private final /* synthetic */ boolean allowExtensions;
    
    @Override
    public void channelRead(final ChannelHandlerContext llllllllllllIllIIIIlIIIlIIlllIlI, final Object llllllllllllIllIIIIlIIIlIIlllIIl) throws Exception {
        final FullHttpRequest llllllllllllIllIIIIlIIIlIIlllIII = (FullHttpRequest)llllllllllllIllIIIIlIIIlIIlllIIl;
        try {
            if (lIIlllIIllllIIIl(llllllllllllIllIIIIlIIIlIIlllIII.getMethod(), HttpMethod.GET)) {
                sendHttpResponse(llllllllllllIllIIIIlIIIlIIlllIlI, llllllllllllIllIIIIlIIIlIIlllIII, new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.FORBIDDEN));
                return;
            }
            final WebSocketServerHandshakerFactory llllllllllllIllIIIIlIIIlIIllllIl = new WebSocketServerHandshakerFactory(getWebSocketLocation(llllllllllllIllIIIIlIIIlIIlllIlI.pipeline(), llllllllllllIllIIIIlIIIlIIlllIII, this.websocketPath), this.subprotocols, this.allowExtensions, this.maxFramePayloadSize);
            final WebSocketServerHandshaker llllllllllllIllIIIIlIIIlIIllllII = llllllllllllIllIIIIlIIIlIIllllIl.newHandshaker(llllllllllllIllIIIIlIIIlIIlllIII);
            if (lIIlllIIllllIIlI(llllllllllllIllIIIIlIIIlIIllllII)) {
                WebSocketServerHandshakerFactory.sendUnsupportedVersionResponse(llllllllllllIllIIIIlIIIlIIlllIlI.channel());
                "".length();
                "".length();
                if (-(0xA3 ^ 0xA7) > 0) {
                    return;
                }
            }
            else {
                final ChannelFuture llllllllllllIllIIIIlIIIlIIlllllI = llllllllllllIllIIIIlIIIlIIllllII.handshake(llllllllllllIllIIIIlIIIlIIlllIlI.channel(), llllllllllllIllIIIIlIIIlIIlllIII);
                llllllllllllIllIIIIlIIIlIIlllllI.addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
                    private static boolean lIIlIlllllIlIlII(final int llllllllllllIllIIllIllIIlIIIlIII) {
                        return llllllllllllIllIIllIllIIlIIIlIII == 0;
                    }
                    
                    @Override
                    public void operationComplete(final ChannelFuture llllllllllllIllIIllIllIIlIIlIIII) throws Exception {
                        if (lIIlIlllllIlIlII(llllllllllllIllIIllIllIIlIIlIIII.isSuccess() ? 1 : 0)) {
                            llllllllllllIllIIIIlIIIlIIlllIlI.fireExceptionCaught(llllllllllllIllIIllIllIIlIIlIIII.cause());
                            "".length();
                            "".length();
                            if ("   ".length() != "   ".length()) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIllIIIIlIIIlIIlllIlI.fireUserEventTriggered(WebSocketServerProtocolHandler.ServerHandshakeStateEvent.HANDSHAKE_COMPLETE);
                            "".length();
                        }
                    }
                });
                "".length();
                WebSocketServerProtocolHandler.setHandshaker(llllllllllllIllIIIIlIIIlIIlllIlI, llllllllllllIllIIIIlIIIlIIllllII);
                llllllllllllIllIIIIlIIIlIIlllIlI.pipeline().replace(this, WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIIl[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[0]], WebSocketServerProtocolHandler.forbiddenHttpRequestResponder());
                "".length();
            }
            llllllllllllIllIIIIlIIIlIIlllIII.release();
            "".length();
            "".length();
            if ("   ".length() == "  ".length()) {
                return;
            }
        }
        finally {
            llllllllllllIllIIIIlIIIlIIlllIII.release();
            "".length();
        }
    }
    
    private static boolean lIIlllIIllllIllI(final int llllllllllllIllIIIIlIIIIllllIIII, final int llllllllllllIllIIIIlIIIIlllIllll) {
        return llllllllllllIllIIIIlIIIIllllIIII < llllllllllllIllIIIIlIIIIlllIllll;
    }
    
    static {
        lIIlllIIllllIIII();
        lIIlllIIlllIllll();
    }
    
    private static boolean lIIlllIIllllIIll(final int llllllllllllIllIIIIlIIIIlllIIlIl) {
        return llllllllllllIllIIIIlIIIIlllIIlIl != 0;
    }
    
    private static String lIIlllIIlllIllIl(final String llllllllllllIllIIIIlIIIIllllIllI, final String llllllllllllIllIIIIlIIIIllllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIIIIlllllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIIIIllllIlIl.getBytes(StandardCharsets.UTF_8)), WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[7]), "DES");
            final Cipher llllllllllllIllIIIIlIIIIlllllIlI = Cipher.getInstance("DES");
            llllllllllllIllIIIIlIIIIlllllIlI.init(WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[3], llllllllllllIllIIIIlIIIIlllllIll);
            return new String(llllllllllllIllIIIIlIIIIlllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIIIIllllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIIIIlllllIIl) {
            llllllllllllIllIIIIlIIIIlllllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void sendHttpResponse(final ChannelHandlerContext llllllllllllIllIIIIlIIIlIIlIIlll, final HttpRequest llllllllllllIllIIIIlIIIlIIlIlIlI, final HttpResponse llllllllllllIllIIIIlIIIlIIlIlIIl) {
        final ChannelFuture llllllllllllIllIIIIlIIIlIIlIlIII = llllllllllllIllIIIIlIIIlIIlIIlll.channel().writeAndFlush(llllllllllllIllIIIIlIIIlIIlIlIIl);
        if (!lIIlllIIllllIIll(HttpHeaders.isKeepAlive(llllllllllllIllIIIIlIIIlIIlIlIlI) ? 1 : 0) || lIIlllIIllllIlII(llllllllllllIllIIIIlIIIlIIlIlIIl.getStatus().code(), WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[1])) {
            llllllllllllIllIIIIlIIIlIIlIlIII.addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
            "".length();
        }
    }
    
    private static boolean lIIlllIIllllIlIl(final Object llllllllllllIllIIIIlIIIIlllIlIIl) {
        return llllllllllllIllIIIIlIIIIlllIlIIl != null;
    }
    
    private static boolean lIIlllIIllllIlII(final int llllllllllllIllIIIIlIIIIlllIIIlI, final int llllllllllllIllIIIIlIIIIlllIIIIl) {
        return llllllllllllIllIIIIlIIIIlllIIIlI != llllllllllllIllIIIIlIIIIlllIIIIl;
    }
    
    private static boolean lIIlllIIllllIIlI(final Object llllllllllllIllIIIIlIIIIlllIIlll) {
        return llllllllllllIllIIIIlIIIIlllIIlll == null;
    }
    
    private static void lIIlllIIlllIllll() {
        (lllIIIIlllIIIl = new String[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[6]])[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[0]] = lIIlllIIlllIllIl("Atj6hiywNjb210lFD0Bm5Q==", "vwXPz");
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIIl[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[2]] = lIIlllIIlllIlllI("OjE=", "MBMaz");
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIIl[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[3]] = lIIlllIIlllIllIl("yH1YnsYVg5k=", "iTQXw");
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIIl[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[4]] = lIIlllIIlllIllIl("ZnrpFV00Acg=", "sWlCM");
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIIl[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[5]] = lIIlllIIlllIlllI("EBcWOA==", "XxeLA");
    }
    
    private static boolean lIIlllIIllllIIIl(final Object llllllllllllIllIIIIlIIIIlllIllII, final Object llllllllllllIllIIIIlIIIIlllIlIll) {
        return llllllllllllIllIIIIlIIIIlllIllII != llllllllllllIllIIIIlIIIIlllIlIll;
    }
    
    WebSocketServerProtocolHandshakeHandler(final String llllllllllllIllIIIIlIIIlIlIIlIlI, final String llllllllllllIllIIIIlIIIlIlIIlIIl, final boolean llllllllllllIllIIIIlIIIlIlIIlIII, final int llllllllllllIllIIIIlIIIlIlIIllII) {
        this.websocketPath = llllllllllllIllIIIIlIIIlIlIIlIlI;
        this.subprotocols = llllllllllllIllIIIIlIIIlIlIIlIIl;
        this.allowExtensions = llllllllllllIllIIIIlIIIlIlIIlIII;
        this.maxFramePayloadSize = llllllllllllIllIIIIlIIIlIlIIllII;
    }
    
    private static String lIIlllIIlllIlllI(String llllllllllllIllIIIIlIIIlIIIIlIII, final String llllllllllllIllIIIIlIIIlIIIIIlll) {
        llllllllllllIllIIIIlIIIlIIIIlIII = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIIlIIIlIIIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlIIIlIIIIlIll = new StringBuilder();
        final char[] llllllllllllIllIIIIlIIIlIIIIlIlI = llllllllllllIllIIIIlIIIlIIIIIlll.toCharArray();
        int llllllllllllIllIIIIlIIIlIIIIlIIl = WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[0];
        final boolean llllllllllllIllIIIIlIIIlIIIIIIll = (Object)((String)llllllllllllIllIIIIlIIIlIIIIlIII).toCharArray();
        final long llllllllllllIllIIIIlIIIlIIIIIIlI = llllllllllllIllIIIIlIIIlIIIIIIll.length;
        int llllllllllllIllIIIIlIIIlIIIIIIIl = WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[0];
        while (lIIlllIIllllIllI(llllllllllllIllIIIIlIIIlIIIIIIIl, (int)llllllllllllIllIIIIlIIIlIIIIIIlI)) {
            final char llllllllllllIllIIIIlIIIlIIIIlllI = llllllllllllIllIIIIlIIIlIIIIIIll[llllllllllllIllIIIIlIIIlIIIIIIIl];
            llllllllllllIllIIIIlIIIlIIIIlIll.append((char)(llllllllllllIllIIIIlIIIlIIIIlllI ^ llllllllllllIllIIIIlIIIlIIIIlIlI[llllllllllllIllIIIIlIIIlIIIIlIIl % llllllllllllIllIIIIlIIIlIIIIlIlI.length]));
            "".length();
            ++llllllllllllIllIIIIlIIIlIIIIlIIl;
            ++llllllllllllIllIIIIlIIIlIIIIIIIl;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlIIIlIIIIlIll);
    }
    
    private static void lIIlllIIllllIIII() {
        (lllIIIIlllIIlI = new int[8])[0] = ((0xBF ^ 0x88) & ~(0xBD ^ 0x8A));
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[1] = (0x33 ^ 0x6) + (0x55 ^ 0x6C) - (0x51 ^ 0x40) + (0x46 ^ 0x2D);
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[2] = " ".length();
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[3] = "  ".length();
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[4] = "   ".length();
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[5] = (105 + 142 - 182 + 100 ^ 107 + 60 - 127 + 121);
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[6] = (0x56 ^ 0x13 ^ (0xDD ^ 0x9D));
        WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[7] = (0x20 ^ 0x58 ^ (0x5E ^ 0x2E));
    }
    
    private static String getWebSocketLocation(final ChannelPipeline llllllllllllIllIIIIlIIIlIIIlllll, final HttpRequest llllllllllllIllIIIIlIIIlIIIllllI, final String llllllllllllIllIIIIlIIIlIIIllIIl) {
        String llllllllllllIllIIIIlIIIlIIIlllII = WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIIl[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[2]];
        if (lIIlllIIllllIlIl(llllllllllllIllIIIIlIIIlIIIlllll.get(SslHandler.class))) {
            llllllllllllIllIIIIlIIIlIIIlllII = WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIIl[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[3]];
        }
        return String.valueOf(new StringBuilder().append(llllllllllllIllIIIIlIIIlIIIlllII).append(WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIIl[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[4]]).append(llllllllllllIllIIIIlIIIlIIIllllI.headers().get(WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIIl[WebSocketServerProtocolHandshakeHandler.lllIIIIlllIIlI[5]])).append(llllllllllllIllIIIIlIIIlIIIllIIl));
    }
}
