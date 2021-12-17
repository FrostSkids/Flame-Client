// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.handler.codec.http.HttpContentDecompressor;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.http.HttpRequestEncoder;
import io.netty.channel.ChannelFutureListener;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpResponseDecoder;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.http.FullHttpRequest;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.channel.ChannelFuture;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import java.net.URI;

public abstract class WebSocketClientHandshaker
{
    private final /* synthetic */ int maxFramePayloadLength;
    private static final /* synthetic */ String[] llllIlllIlllI;
    private final /* synthetic */ WebSocketVersion version;
    private volatile /* synthetic */ boolean handshakeComplete;
    private final /* synthetic */ URI uri;
    private volatile /* synthetic */ String actualSubprotocol;
    private static final /* synthetic */ int[] llllIllllIIlI;
    protected final /* synthetic */ HttpHeaders customHeaders;
    private final /* synthetic */ String expectedSubprotocol;
    
    public int maxFramePayloadLength() {
        return this.maxFramePayloadLength;
    }
    
    protected abstract void verify(final FullHttpResponse p0);
    
    protected WebSocketClientHandshaker(final URI lllllllllllllIlIllIIIlllIIlIIlII, final WebSocketVersion lllllllllllllIlIllIIIlllIIlIlIIl, final String lllllllllllllIlIllIIIlllIIlIlIII, final HttpHeaders lllllllllllllIlIllIIIlllIIlIIlll, final int lllllllllllllIlIllIIIlllIIlIIIII) {
        this.uri = lllllllllllllIlIllIIIlllIIlIIlII;
        this.version = lllllllllllllIlIllIIIlllIIlIlIIl;
        this.expectedSubprotocol = lllllllllllllIlIllIIIlllIIlIlIII;
        this.customHeaders = lllllllllllllIlIllIIIlllIIlIIlll;
        this.maxFramePayloadLength = lllllllllllllIlIllIIIlllIIlIIIII;
    }
    
    public ChannelFuture close(final Channel lllllllllllllIlIllIIIllIllIlIIll, final CloseWebSocketFrame lllllllllllllIlIllIIIllIllIlIIlI) {
        if (lIlIllIIIlllIII(lllllllllllllIlIllIIIllIllIlIIll)) {
            throw new NullPointerException(WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[6]]);
        }
        return this.close(lllllllllllllIlIllIIIllIllIlIIll, lllllllllllllIlIllIIIllIllIlIIlI, lllllllllllllIlIllIIIllIllIlIIll.newPromise());
    }
    
    private static boolean lIlIllIIIlllIlI(final int lllllllllllllIlIllIIIllIlIIlIIll, final int lllllllllllllIlIllIIIllIlIIlIIlI) {
        return lllllllllllllIlIllIIIllIlIIlIIll < lllllllllllllIlIllIIIllIlIIlIIlI;
    }
    
    static {
        lIlIllIIIllIlll();
        lIlIllIIIlIlllI();
    }
    
    private static String lIlIllIIIlIlIIl(final String lllllllllllllIlIllIIIllIlIlllllI, final String lllllllllllllIlIllIIIllIlIllllll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIllIllIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIllIlIllllll.getBytes(StandardCharsets.UTF_8)), WebSocketClientHandshaker.llllIllllIIlI[8]), "DES");
            final Cipher lllllllllllllIlIllIIIllIllIIIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIllIIIllIllIIIIlI.init(WebSocketClientHandshaker.llllIllllIIlI[2], lllllllllllllIlIllIIIllIllIIIIll);
            return new String(lllllllllllllIlIllIIIllIllIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIllIlIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIllIllIIIIIl) {
            lllllllllllllIlIllIIIllIllIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private void setActualSubprotocol(final String lllllllllllllIlIllIIIlllIIIIIlll) {
        this.actualSubprotocol = lllllllllllllIlIllIIIlllIIIIIlll;
    }
    
    private static boolean lIlIllIIIlllIIl(final Object lllllllllllllIlIllIIIllIlIIlIIII) {
        return lllllllllllllIlIllIIIllIlIIlIIII != null;
    }
    
    protected abstract WebSocketFrameEncoder newWebSocketEncoder();
    
    protected abstract WebSocketFrameDecoder newWebsocketDecoder();
    
    public String expectedSubprotocol() {
        return this.expectedSubprotocol;
    }
    
    private static boolean lIlIllIIIlllIII(final Object lllllllllllllIlIllIIIllIlIIIlllI) {
        return lllllllllllllIlIllIIIllIlIIIlllI == null;
    }
    
    private static void lIlIllIIIlIlllI() {
        (llllIlllIlllI = new String[WebSocketClientHandshaker.llllIllllIIlI[8]])[WebSocketClientHandshaker.llllIllllIIlI[1]] = lIlIllIIIlIlIII("GJWtYsWHb+0=", "Cbtga");
        WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[0]] = lIlIllIIIlIlIIl("oMuzfnLYIIrv5uB/3o2raCgxdya9rA5wOUNflq8iNQFg6kEhOfCn7Q7oSAYaKIF1Br3ZXw3ELc/uP8GMqR32w1nbRixtT8Zkqt+NqacHuDQ=", "cNIab");
        WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[2]] = lIlIllIIIlIlIlI("HgYHaTQoATcrACYGEGkzPwwQKwAiDw==", "McdDc");
        WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[3]] = lIlIllIIIlIlIlI("Mg4xHiIUCgAZPBQKOR4pUQI/FT9RCD8EbBIJPgQtGAhwEWw5EiQAHhQXJRU/BSM+EyMVAyJQIwNGGAQ4ASU8GSkfEhMfKBQF", "qfPpL");
        WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[4]] = lIlIllIIIlIlIII("jjYJw0FIfyNmRPBqcj91dw==", "sCmgB");
        WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[5]] = lIlIllIIIlIlIIl("wcVF+ZOCM9GhWkc7m92KkQ==", "HbOog");
        WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[6]] = lIlIllIIIlIlIIl("JzlIAUBbOmk=", "otEBp");
        WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[7]] = lIlIllIIIlIlIII("TFS0Se4q/iE=", "RNGsS");
    }
    
    protected abstract FullHttpRequest newHandshakeRequest();
    
    public String actualSubprotocol() {
        return this.actualSubprotocol;
    }
    
    public boolean isHandshakeComplete() {
        return this.handshakeComplete;
    }
    
    public final ChannelFuture handshake(final Channel lllllllllllllIlIllIIIllIllllIllI, final ChannelPromise lllllllllllllIlIllIIIllIllllIlIl) {
        final FullHttpRequest lllllllllllllIlIllIIIllIllllIlII = this.newHandshakeRequest();
        final HttpResponseDecoder lllllllllllllIlIllIIIllIllllIIll = lllllllllllllIlIllIIIllIllllIllI.pipeline().get(HttpResponseDecoder.class);
        if (lIlIllIIIlllIII(lllllllllllllIlIllIIIllIllllIIll)) {
            final HttpClientCodec lllllllllllllIlIllIIIllIlllllIII = lllllllllllllIlIllIIIllIllllIllI.pipeline().get(HttpClientCodec.class);
            if (lIlIllIIIlllIII(lllllllllllllIlIllIIIllIlllllIII)) {
                lllllllllllllIlIllIIIllIllllIlIl.setFailure((Throwable)new IllegalStateException(WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[0]]));
                "".length();
                return lllllllllllllIlIllIIIllIllllIlIl;
            }
        }
        lllllllllllllIlIllIIIllIllllIllI.writeAndFlush(lllllllllllllIlIllIIIllIllllIlII).addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
            private static final /* synthetic */ int[] lIllllIlIIlIIl;
            private static final /* synthetic */ String[] lIllllIlIIIlIl;
            
            private static boolean lIIIIlIIIllIlllI(final Object llllllllllllIllllIlIIllIIllIIIIl) {
                return llllllllllllIllllIlIIllIIllIIIIl == null;
            }
            
            @Override
            public void operationComplete(final ChannelFuture llllllllllllIllllIlIIllIIllllIlI) {
                if (lIIIIlIIIllIllII(llllllllllllIllllIlIIllIIllllIlI.isSuccess() ? 1 : 0)) {
                    final ChannelPipeline llllllllllllIllllIlIIllIIlllllIl = llllllllllllIllllIlIIllIIllllIlI.channel().pipeline();
                    ChannelHandlerContext llllllllllllIllllIlIIllIIlllllII = llllllllllllIllllIlIIllIIlllllIl.context(HttpRequestEncoder.class);
                    if (lIIIIlIIIllIlllI(llllllllllllIllllIlIIllIIlllllII)) {
                        llllllllllllIllllIlIIllIIlllllII = llllllllllllIllllIlIIllIIlllllIl.context(HttpClientCodec.class);
                    }
                    if (lIIIIlIIIllIlllI(llllllllllllIllllIlIIllIIlllllII)) {
                        lllllllllllllIlIllIIIllIllllIlIl.setFailure((Throwable)new IllegalStateException(WebSocketClientHandshaker$1.lIllllIlIIIlIl[WebSocketClientHandshaker$1.lIllllIlIIlIIl[0]]));
                        "".length();
                        return;
                    }
                    llllllllllllIllllIlIIllIIlllllIl.addAfter(llllllllllllIllllIlIIllIIlllllII.name(), WebSocketClientHandshaker$1.lIllllIlIIIlIl[WebSocketClientHandshaker$1.lIllllIlIIlIIl[1]], WebSocketClientHandshaker.this.newWebSocketEncoder());
                    "".length();
                    lllllllllllllIlIllIIIllIllllIlIl.setSuccess();
                    "".length();
                    "".length();
                    if (" ".length() > (0xBC ^ 0xB8)) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIllIIIllIllllIlIl.setFailure(llllllllllllIllllIlIIllIIllllIlI.cause());
                    "".length();
                }
            }
            
            static {
                lIIIIlIIIllIlIll();
                lIIIIlIIIllIlIIl();
            }
            
            private static void lIIIIlIIIllIlIll() {
                (lIllllIlIIlIIl = new int[3])[0] = ((221 + 22 + 5 + 3 ^ 22 + 108 - 99 + 129) & (0x2A ^ 0x25 ^ (0x43 ^ 0x17) ^ -" ".length()));
                WebSocketClientHandshaker$1.lIllllIlIIlIIl[1] = " ".length();
                WebSocketClientHandshaker$1.lIllllIlIIlIIl[2] = "  ".length();
            }
            
            private static String lIIIIlIIIllIIIlI(final String llllllllllllIllllIlIIllIIllIIllI, final String llllllllllllIllllIlIIllIIllIIlIl) {
                try {
                    final SecretKeySpec llllllllllllIllllIlIIllIIllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIllIIllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher llllllllllllIllllIlIIllIIllIlIlI = Cipher.getInstance("Blowfish");
                    llllllllllllIllllIlIIllIIllIlIlI.init(WebSocketClientHandshaker$1.lIllllIlIIlIIl[2], llllllllllllIllllIlIIllIIllIlIll);
                    return new String(llllllllllllIllllIlIIllIIllIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIllIIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIllllIlIIllIIllIlIIl) {
                    llllllllllllIllllIlIIllIIllIlIIl.printStackTrace();
                    return null;
                }
            }
            
            private static boolean lIIIIlIIIllIllII(final int llllllllllllIllllIlIIllIIlIlllll) {
                return llllllllllllIllllIlIIllIIlIlllll != 0;
            }
            
            private static void lIIIIlIIIllIlIIl() {
                (lIllllIlIIIlIl = new String[WebSocketClientHandshaker$1.lIllllIlIIlIIl[2]])[WebSocketClientHandshaker$1.lIllllIlIIlIIl[0]] = lIIIIlIIIllIIIlI("tdRMVcbkj2yIzI6yk38ijjQ8dxcTXfr+6WS1LClnB5R5UnRdHfP3ufJfwABQ1ScG+NaTyvwubym2Q9NI3fLIOC/YkJ4FMI+saHM9bcea7WU=", "MFLMP");
                WebSocketClientHandshaker$1.lIllllIlIIIlIl[WebSocketClientHandshaker$1.lIllllIlIIlIIl[1]] = lIIIIlIIIllIIIlI("zp237evQpiDv2mbAt6VSRg==", "Weqaz");
            }
        });
        "".length();
        return lllllllllllllIlIllIIIllIllllIlIl;
    }
    
    public ChannelFuture close(final Channel lllllllllllllIlIllIIIllIllIIlIlI, final CloseWebSocketFrame lllllllllllllIlIllIIIllIllIIllII, final ChannelPromise lllllllllllllIlIllIIIllIllIIlIll) {
        if (lIlIllIIIlllIII(lllllllllllllIlIllIIIllIllIIlIlI)) {
            throw new NullPointerException(WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[7]]);
        }
        return lllllllllllllIlIllIIIllIllIIlIlI.writeAndFlush(lllllllllllllIlIllIIIllIllIIllII, lllllllllllllIlIllIIIllIllIIlIll);
    }
    
    public URI uri() {
        return this.uri;
    }
    
    private void setHandshakeComplete() {
        this.handshakeComplete = (WebSocketClientHandshaker.llllIllllIIlI[0] != 0);
    }
    
    private static String lIlIllIIIlIlIII(final String lllllllllllllIlIllIIIllIlIllIIIl, final String lllllllllllllIlIllIIIllIlIllIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIllIlIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIllIlIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIIllIlIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIIllIlIllIlIl.init(WebSocketClientHandshaker.llllIllllIIlI[2], lllllllllllllIlIllIIIllIlIllIllI);
            return new String(lllllllllllllIlIllIIIllIlIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIllIlIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIllIlIllIlII) {
            lllllllllllllIlIllIIIllIlIllIlII.printStackTrace();
            return null;
        }
    }
    
    public ChannelFuture handshake(final Channel lllllllllllllIlIllIIIllIllllllll) {
        if (lIlIllIIIlllIII(lllllllllllllIlIllIIIllIllllllll)) {
            throw new NullPointerException(WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[1]]);
        }
        return this.handshake(lllllllllllllIlIllIIIllIllllllll, lllllllllllllIlIllIIIllIllllllll.newPromise());
    }
    
    public final void finishHandshake(final Channel lllllllllllllIlIllIIIllIlllIIlIl, final FullHttpResponse lllllllllllllIlIllIIIllIllIllllI) {
        this.verify(lllllllllllllIlIllIIIllIllIllllI);
        this.setActualSubprotocol(lllllllllllllIlIllIIIllIllIllllI.headers().get(WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[2]]));
        this.setHandshakeComplete();
        final ChannelPipeline lllllllllllllIlIllIIIllIlllIIIll = lllllllllllllIlIllIIIllIlllIIlIl.pipeline();
        final HttpContentDecompressor lllllllllllllIlIllIIIllIlllIIIlI = lllllllllllllIlIllIIIllIlllIIIll.get(HttpContentDecompressor.class);
        if (lIlIllIIIlllIIl(lllllllllllllIlIllIIIllIlllIIIlI)) {
            lllllllllllllIlIllIIIllIlllIIIll.remove(lllllllllllllIlIllIIIllIlllIIIlI);
            "".length();
        }
        ChannelHandlerContext lllllllllllllIlIllIIIllIlllIIIIl = lllllllllllllIlIllIIIllIlllIIIll.context(HttpResponseDecoder.class);
        if (lIlIllIIIlllIII(lllllllllllllIlIllIIIllIlllIIIIl)) {
            lllllllllllllIlIllIIIllIlllIIIIl = lllllllllllllIlIllIIIllIlllIIIll.context(HttpClientCodec.class);
            if (lIlIllIIIlllIII(lllllllllllllIlIllIIIllIlllIIIIl)) {
                throw new IllegalStateException(WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[3]]);
            }
            lllllllllllllIlIllIIIllIlllIIIll.replace(lllllllllllllIlIllIIIllIlllIIIIl.name(), WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[4]], this.newWebsocketDecoder());
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return;
            }
        }
        else {
            if (lIlIllIIIlllIIl(lllllllllllllIlIllIIIllIlllIIIll.get(HttpRequestEncoder.class))) {
                lllllllllllllIlIllIIIllIlllIIIll.remove(HttpRequestEncoder.class);
                "".length();
            }
            lllllllllllllIlIllIIIllIlllIIIll.replace(lllllllllllllIlIllIIIllIlllIIIIl.name(), WebSocketClientHandshaker.llllIlllIlllI[WebSocketClientHandshaker.llllIllllIIlI[5]], this.newWebsocketDecoder());
            "".length();
        }
    }
    
    public WebSocketVersion version() {
        return this.version;
    }
    
    private static void lIlIllIIIllIlll() {
        (llllIllllIIlI = new int[9])[0] = " ".length();
        WebSocketClientHandshaker.llllIllllIIlI[1] = ((0x3 ^ 0x25 ^ (0xC3 ^ 0xA8)) & (0x29 ^ 0x69 ^ (0xA2 ^ 0xAF) ^ -" ".length()));
        WebSocketClientHandshaker.llllIllllIIlI[2] = "  ".length();
        WebSocketClientHandshaker.llllIllllIIlI[3] = "   ".length();
        WebSocketClientHandshaker.llllIllllIIlI[4] = (0x5D ^ 0x59);
        WebSocketClientHandshaker.llllIllllIIlI[5] = (0x1 ^ 0x4);
        WebSocketClientHandshaker.llllIllllIIlI[6] = (0x5A ^ 0x5C);
        WebSocketClientHandshaker.llllIllllIIlI[7] = (0x94 ^ 0x93);
        WebSocketClientHandshaker.llllIllllIIlI[8] = (0x79 ^ 0x71);
    }
    
    private static String lIlIllIIIlIlIlI(String lllllllllllllIlIllIIIllIlIIllllI, final String lllllllllllllIlIllIIIllIlIIlllIl) {
        lllllllllllllIlIllIIIllIlIIllllI = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIIllIlIIllllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIIllIlIlIIIIl = new StringBuilder();
        final char[] lllllllllllllIlIllIIIllIlIlIIIII = lllllllllllllIlIllIIIllIlIIlllIl.toCharArray();
        int lllllllllllllIlIllIIIllIlIIlllll = WebSocketClientHandshaker.llllIllllIIlI[1];
        final short lllllllllllllIlIllIIIllIlIIllIIl = (Object)lllllllllllllIlIllIIIllIlIIllllI.toCharArray();
        final char lllllllllllllIlIllIIIllIlIIllIII = (char)lllllllllllllIlIllIIIllIlIIllIIl.length;
        char lllllllllllllIlIllIIIllIlIIlIlll = (char)WebSocketClientHandshaker.llllIllllIIlI[1];
        while (lIlIllIIIlllIlI(lllllllllllllIlIllIIIllIlIIlIlll, lllllllllllllIlIllIIIllIlIIllIII)) {
            final char lllllllllllllIlIllIIIllIlIlIIlII = lllllllllllllIlIllIIIllIlIIllIIl[lllllllllllllIlIllIIIllIlIIlIlll];
            lllllllllllllIlIllIIIllIlIlIIIIl.append((char)(lllllllllllllIlIllIIIllIlIlIIlII ^ lllllllllllllIlIllIIIllIlIlIIIII[lllllllllllllIlIllIIIllIlIIlllll % lllllllllllllIlIllIIIllIlIlIIIII.length]));
            "".length();
            ++lllllllllllllIlIllIIIllIlIIlllll;
            ++lllllllllllllIlIllIIIllIlIIlIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIIllIlIlIIIIl);
    }
}
