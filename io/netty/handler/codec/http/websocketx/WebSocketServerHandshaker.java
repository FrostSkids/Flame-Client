// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.StringUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelPipeline;
import io.netty.util.concurrent.Future;
import io.netty.channel.ChannelFutureListener;
import io.netty.handler.codec.http.HttpResponseEncoder;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.channel.ChannelHandler;
import io.netty.handler.codec.http.HttpRequestDecoder;
import io.netty.handler.codec.http.HttpContentCompressor;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.channel.Channel;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLogger;

public abstract class WebSocketServerHandshaker
{
    private final /* synthetic */ int maxFramePayloadLength;
    private final /* synthetic */ String[] subprotocols;
    private static final /* synthetic */ int[] llIlIlIIllIllI;
    private final /* synthetic */ String uri;
    private /* synthetic */ String selectedSubprotocol;
    protected static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] llIlIlIIllIIII;
    private final /* synthetic */ WebSocketVersion version;
    
    private static String lIIlIlIIIIIIIIII(final String llllllllllllIllIlIlIlIlIlIllIlII, final String llllllllllllIllIlIlIlIlIlIllIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlIlIlIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlIlIlIllIIlI.getBytes(StandardCharsets.UTF_8)), WebSocketServerHandshaker.llIlIlIIllIllI[9]), "DES");
            final Cipher llllllllllllIllIlIlIlIlIlIlllIII = Cipher.getInstance("DES");
            llllllllllllIllIlIlIlIlIlIlllIII.init(WebSocketServerHandshaker.llIlIlIIllIllI[3], llllllllllllIllIlIlIlIlIlIlllIIl);
            return new String(llllllllllllIllIlIlIlIlIlIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlIlIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIlIlIlIllIlll) {
            llllllllllllIllIlIlIlIlIlIllIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlIIIIIlIIIl(final int llllllllllllIllIlIlIlIlIIlIlllll, final int llllllllllllIllIlIlIlIlIIlIlllIl) {
        return llllllllllllIllIlIlIlIlIIlIlllll < llllllllllllIllIlIlIlIlIIlIlllIl;
    }
    
    public int maxFramePayloadLength() {
        return this.maxFramePayloadLength;
    }
    
    static {
        lIIlIlIIIIIIllll();
        lIIlIlIIIIIIIIlI();
        SUB_PROTOCOL_WILDCARD = WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[10]];
        logger = InternalLoggerFactory.getInstance(WebSocketServerHandshaker.class);
    }
    
    public final ChannelFuture handshake(final Channel llllllllllllIllIlIlIlIllIIlllIIl, final FullHttpRequest llllllllllllIllIlIlIlIllIlIIIIll, final HttpHeaders llllllllllllIllIlIlIlIllIlIIIIIl, final ChannelPromise llllllllllllIllIlIlIlIllIIllllll) {
        if (lIIlIlIIIIIlIIlI(WebSocketServerHandshaker.logger.isDebugEnabled() ? 1 : 0)) {
            WebSocketServerHandshaker.logger.debug(WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[1]], llllllllllllIllIlIlIlIllIIlllIIl, this.version());
        }
        final FullHttpResponse llllllllllllIllIlIlIlIllIIlllllI = this.newHandshakeResponse(llllllllllllIllIlIlIlIllIlIIIIll, llllllllllllIllIlIlIlIllIlIIIIIl);
        final ChannelPipeline llllllllllllIllIlIlIlIllIIllllIl = llllllllllllIllIlIlIlIllIIlllIIl.pipeline();
        if (lIIlIlIIIIIlIIII(llllllllllllIllIlIlIlIllIIllllIl.get(HttpObjectAggregator.class))) {
            llllllllllllIllIlIlIlIllIIllllIl.remove(HttpObjectAggregator.class);
            "".length();
        }
        if (lIIlIlIIIIIlIIII(llllllllllllIllIlIlIlIllIIllllIl.get(HttpContentCompressor.class))) {
            llllllllllllIllIlIlIlIllIIllllIl.remove(HttpContentCompressor.class);
            "".length();
        }
        ChannelHandlerContext llllllllllllIllIlIlIlIllIIllllII = llllllllllllIllIlIlIlIllIIllllIl.context(HttpRequestDecoder.class);
        String llllllllllllIllIlIlIlIllIIlllIll = null;
        if (lIIlIlIIIIIlIIll(llllllllllllIllIlIlIlIllIIllllII)) {
            llllllllllllIllIlIlIlIllIIllllII = llllllllllllIllIlIlIlIllIIllllIl.context(HttpServerCodec.class);
            if (lIIlIlIIIIIlIIll(llllllllllllIllIlIlIlIllIIllllII)) {
                llllllllllllIllIlIlIlIllIIllllll.setFailure((Throwable)new IllegalStateException(WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[2]]));
                "".length();
                return llllllllllllIllIlIlIlIllIIllllll;
            }
            llllllllllllIllIlIlIlIllIIllllIl.addBefore(llllllllllllIllIlIlIlIllIIllllII.name(), WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[3]], this.newWebsocketDecoder());
            "".length();
            llllllllllllIllIlIlIlIllIIllllIl.addBefore(llllllllllllIllIlIlIlIllIIllllII.name(), WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[4]], this.newWebSocketEncoder());
            "".length();
            final String llllllllllllIllIlIlIlIllIlIIlIIl = llllllllllllIllIlIlIlIllIIllllII.name();
            "".length();
            if (((153 + 60 - 183 + 141 ^ 46 + 115 - 39 + 69) & (174 + 117 - 151 + 40 ^ 74 + 116 - 50 + 20 ^ -" ".length())) < 0) {
                return null;
            }
        }
        else {
            llllllllllllIllIlIlIlIllIIllllIl.replace(llllllllllllIllIlIlIlIllIIllllII.name(), WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[5]], this.newWebsocketDecoder());
            "".length();
            llllllllllllIllIlIlIlIllIIlllIll = llllllllllllIllIlIlIlIllIIllllIl.context(HttpResponseEncoder.class).name();
            llllllllllllIllIlIlIlIllIIllllIl.addBefore(llllllllllllIllIlIlIlIllIIlllIll, WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[6]], this.newWebSocketEncoder());
            "".length();
        }
        llllllllllllIllIlIlIlIllIIlllIIl.writeAndFlush(llllllllllllIllIlIlIlIllIIlllllI).addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
            private static boolean lIIllIIIIIllIIIl(final int llllllllllllIllIIllIIlIlllllIIlI) {
                return llllllllllllIllIIllIIlIlllllIIlI != 0;
            }
            
            @Override
            public void operationComplete(final ChannelFuture llllllllllllIllIIllIIlIllllllIll) throws Exception {
                if (lIIllIIIIIllIIIl(llllllllllllIllIIllIIlIllllllIll.isSuccess() ? 1 : 0)) {
                    final ChannelPipeline llllllllllllIllIIllIIlIlllllllll = llllllllllllIllIIllIIlIllllllIll.channel().pipeline();
                    llllllllllllIllIIllIIlIlllllllll.remove(llllllllllllIllIlIlIlIllIIlllIll);
                    "".length();
                    llllllllllllIllIlIlIlIllIIllllll.setSuccess();
                    "".length();
                    "".length();
                    if (((0xA ^ 0x55) & ~(0x9 ^ 0x56)) < 0) {
                        return;
                    }
                }
                else {
                    llllllllllllIllIlIlIlIllIIllllll.setFailure(llllllllllllIllIIllIIlIllllllIll.cause());
                    "".length();
                }
            }
        });
        "".length();
        return llllllllllllIllIlIlIlIllIIllllll;
    }
    
    public WebSocketVersion version() {
        return this.version;
    }
    
    protected abstract WebSocketFrameEncoder newWebSocketEncoder();
    
    private static boolean lIIlIlIIIIIlIIII(final Object llllllllllllIllIlIlIlIlIIlIllIII) {
        return llllllllllllIllIlIlIlIlIIlIllIII != null;
    }
    
    private static String lIIlIIllllllIllI(final String llllllllllllIllIlIlIlIlIlIIllIIl, final String llllllllllllIllIlIlIlIlIlIIlIlll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlIlIlIlIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlIlIlIIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIlIlIlIIllllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIlIlIlIIllllI.init(WebSocketServerHandshaker.llIlIlIIllIllI[3], llllllllllllIllIlIlIlIlIlIlIIIIl);
            return new String(llllllllllllIllIlIlIlIlIlIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlIlIlIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIlIlIlIIlllIl) {
            llllllllllllIllIlIlIlIlIlIIlllIl.printStackTrace();
            return null;
        }
    }
    
    protected WebSocketServerHandshaker(final WebSocketVersion llllllllllllIllIlIlIlIlllIIIllll, final String llllllllllllIllIlIlIlIlllIIIllIl, final String llllllllllllIllIlIlIlIlllIIlIIll, final int llllllllllllIllIlIlIlIlllIIIlIlI) {
        this.version = llllllllllllIllIlIlIlIlllIIIllll;
        this.uri = llllllllllllIllIlIlIlIlllIIIllIl;
        if (lIIlIlIIIIIlIIII(llllllllllllIllIlIlIlIlllIIlIIll)) {
            final String[] llllllllllllIllIlIlIlIlllIIllIII = StringUtil.split(llllllllllllIllIlIlIlIlllIIlIIll, (char)WebSocketServerHandshaker.llIlIlIIllIllI[0]);
            int llllllllllllIllIlIlIlIlllIIllIll = WebSocketServerHandshaker.llIlIlIIllIllI[1];
            while (lIIlIlIIIIIlIIIl(llllllllllllIllIlIlIlIlllIIllIll, llllllllllllIllIlIlIlIlllIIllIII.length)) {
                llllllllllllIllIlIlIlIlllIIllIII[llllllllllllIllIlIlIlIlllIIllIll] = llllllllllllIllIlIlIlIlllIIllIII[llllllllllllIllIlIlIlIlllIIllIll].trim();
                ++llllllllllllIllIlIlIlIlllIIllIll;
                "".length();
                if ("   ".length() < ((0x9B ^ 0xA1) & ~(0x1F ^ 0x25))) {
                    throw null;
                }
            }
            this.subprotocols = llllllllllllIllIlIlIlIlllIIllIII;
            "".length();
            if (" ".length() < 0) {
                throw null;
            }
        }
        else {
            this.subprotocols = EmptyArrays.EMPTY_STRINGS;
        }
        this.maxFramePayloadLength = llllllllllllIllIlIlIlIlllIIIlIlI;
    }
    
    public String selectedSubprotocol() {
        return this.selectedSubprotocol;
    }
    
    public ChannelFuture close(final Channel llllllllllllIllIlIlIlIllIIlIIlll, final CloseWebSocketFrame llllllllllllIllIlIlIlIllIIIlllll) {
        if (lIIlIlIIIIIlIIll(llllllllllllIllIlIlIlIllIIlIIlll)) {
            throw new NullPointerException(WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[7]]);
        }
        return this.close(llllllllllllIllIlIlIlIllIIlIIlll, llllllllllllIllIlIlIlIllIIIlllll, llllllllllllIllIlIlIlIllIIlIIlll.newPromise());
    }
    
    public String uri() {
        return this.uri;
    }
    
    public ChannelFuture close(final Channel llllllllllllIllIlIlIlIllIIIlIlII, final CloseWebSocketFrame llllllllllllIllIlIlIlIllIIIlIIll, final ChannelPromise llllllllllllIllIlIlIlIllIIIIllII) {
        if (lIIlIlIIIIIlIIll(llllllllllllIllIlIlIlIllIIIlIlII)) {
            throw new NullPointerException(WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[8]]);
        }
        return llllllllllllIllIlIlIlIllIIIlIlII.writeAndFlush(llllllllllllIllIlIlIlIllIIIlIIll, llllllllllllIllIlIlIlIllIIIIllII).addListener((GenericFutureListener<? extends Future<? super Void>>)ChannelFutureListener.CLOSE);
    }
    
    protected abstract WebSocketFrameDecoder newWebsocketDecoder();
    
    private static boolean lIIlIlIIIIIlIIll(final Object llllllllllllIllIlIlIlIlIIlIlIlII) {
        return llllllllllllIllIlIlIlIlIIlIlIlII == null;
    }
    
    private static String lIIlIIllllllllll(String llllllllllllIllIlIlIlIlIIllllIII, final String llllllllllllIllIlIlIlIlIIllllllI) {
        llllllllllllIllIlIlIlIlIIllllIII = new String(Base64.getDecoder().decode(llllllllllllIllIlIlIlIlIIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIlIlIIlllllIl = new StringBuilder();
        final char[] llllllllllllIllIlIlIlIlIIlllllII = llllllllllllIllIlIlIlIlIIllllllI.toCharArray();
        int llllllllllllIllIlIlIlIlIIllllIlI = WebSocketServerHandshaker.llIlIlIIllIllI[1];
        final float llllllllllllIllIlIlIlIlIIllIllll = (Object)llllllllllllIllIlIlIlIlIIllllIII.toCharArray();
        final Exception llllllllllllIllIlIlIlIlIIllIlllI = (Exception)llllllllllllIllIlIlIlIlIIllIllll.length;
        long llllllllllllIllIlIlIlIlIIllIllII = WebSocketServerHandshaker.llIlIlIIllIllI[1];
        while (lIIlIlIIIIIlIIIl((int)llllllllllllIllIlIlIlIlIIllIllII, (int)llllllllllllIllIlIlIlIlIIllIlllI)) {
            final char llllllllllllIllIlIlIlIlIlIIIIIIl = llllllllllllIllIlIlIlIlIIllIllll[llllllllllllIllIlIlIlIlIIllIllII];
            llllllllllllIllIlIlIlIlIIlllllIl.append((char)(llllllllllllIllIlIlIlIlIlIIIIIIl ^ llllllllllllIllIlIlIlIlIIlllllII[llllllllllllIllIlIlIlIlIIllllIlI % llllllllllllIllIlIlIlIlIIlllllII.length]));
            "".length();
            ++llllllllllllIllIlIlIlIlIIllllIlI;
            ++llllllllllllIllIlIlIlIlIIllIllII;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIlIlIIlllllIl);
    }
    
    public ChannelFuture handshake(final Channel llllllllllllIllIlIlIlIllIllIIIIl, final FullHttpRequest llllllllllllIllIlIlIlIllIllIIIII) {
        return this.handshake(llllllllllllIllIlIlIlIllIllIIIIl, llllllllllllIllIlIlIlIllIllIIIII, null, llllllllllllIllIlIlIlIllIllIIIIl.newPromise());
    }
    
    private static void lIIlIlIIIIIIIIlI() {
        (llIlIlIIllIIII = new String[WebSocketServerHandshaker.llIlIlIIllIllI[11]])[WebSocketServerHandshaker.llIlIlIIllIllI[1]] = lIIlIIllllllIllI("N5qm8+mZXZy8/L0H70nJY4rKyoVxqEHy9KHh2Ujg6+lyh3oFL6UUqDm455oUV/ih", "QCodm");
        WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[2]] = lIIlIIllllllIllI("XYwZyue/AyiXkKx130KCRkY6pe/QbGvc+sGlbQXIb3iHySlUcy4ewi3Z7NFQu4O23tdSCqAruQ4=", "iOEki");
        WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[3]] = lIIlIIllllllllll("Fh09HSIOCjwK", "anYxA");
        WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[4]] = lIIlIIllllllIllI("s0ZIn9uoEAK1gdJKO+IpUA==", "swNMv");
        WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[5]] = lIIlIlIIIIIIIIII("lSO2ShgN7fak1/NsKJ7z6Q==", "NkFJm");
        WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[6]] = lIIlIIllllllllll("HyYvOSgHMS8l", "hUJWK");
        WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[7]] = lIIlIIllllllIllI("InPXCv8VLUo=", "EEMVF");
        WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[8]] = lIIlIlIIIIIIIIII("IxxDG0Njf+A=", "kXdWv");
        WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[9]] = lIIlIlIIIIIIIIII("1GncULZPCLE=", "Gcvuz");
        WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[10]] = lIIlIIllllllIllI("3Pq+zxf2VBU=", "JQwOy");
    }
    
    protected String selectSubprotocol(final String llllllllllllIllIlIlIlIlIllIlllll) {
        if (!lIIlIlIIIIIlIIII(llllllllllllIllIlIlIlIlIllIlllll) || lIIlIlIIIIIlIlII(this.subprotocols.length)) {
            return null;
        }
        final String[] llllllllllllIllIlIlIlIlIlllIIlIl;
        final String[] llllllllllllIllIlIlIlIlIllIlllIl = llllllllllllIllIlIlIlIlIlllIIlIl = StringUtil.split(llllllllllllIllIlIlIlIlIllIlllll, (char)WebSocketServerHandshaker.llIlIlIIllIllI[0]);
        final int llllllllllllIllIlIlIlIlIlllIIIll = llllllllllllIllIlIlIlIlIlllIIlIl.length;
        int llllllllllllIllIlIlIlIlIlllIIIlI = WebSocketServerHandshaker.llIlIlIIllIllI[1];
        while (lIIlIlIIIIIlIIIl(llllllllllllIllIlIlIlIlIlllIIIlI, llllllllllllIllIlIlIlIlIlllIIIll)) {
            final String llllllllllllIllIlIlIlIlIlllIIlll = llllllllllllIllIlIlIlIlIlllIIlIl[llllllllllllIllIlIlIlIlIlllIIIlI];
            final String llllllllllllIllIlIlIlIlIlllIlIII = llllllllllllIllIlIlIlIlIlllIIlll.trim();
            final String[] llllllllllllIllIlIlIlIlIlllIllIl = this.subprotocols;
            final int llllllllllllIllIlIlIlIlIlllIlIll = llllllllllllIllIlIlIlIlIlllIllIl.length;
            int llllllllllllIllIlIlIlIlIlllIlIIl = WebSocketServerHandshaker.llIlIlIIllIllI[1];
            while (lIIlIlIIIIIlIIIl(llllllllllllIllIlIlIlIlIlllIlIIl, llllllllllllIllIlIlIlIlIlllIlIll)) {
                final String llllllllllllIllIlIlIlIlIlllIllll = llllllllllllIllIlIlIlIlIlllIllIl[llllllllllllIllIlIlIlIlIlllIlIIl];
                if (!lIIlIlIIIIIlIlII(WebSocketServerHandshaker.llIlIlIIllIIII[WebSocketServerHandshaker.llIlIlIIllIllI[9]].equals(llllllllllllIllIlIlIlIlIlllIllll) ? 1 : 0) || lIIlIlIIIIIlIIlI(llllllllllllIllIlIlIlIlIlllIlIII.equals(llllllllllllIllIlIlIlIlIlllIllll) ? 1 : 0)) {
                    this.selectedSubprotocol = llllllllllllIllIlIlIlIlIlllIlIII;
                    return llllllllllllIllIlIlIlIlIlllIlIII;
                }
                ++llllllllllllIllIlIlIlIlIlllIlIIl;
                "".length();
                if (" ".length() <= -" ".length()) {
                    return null;
                }
            }
            ++llllllllllllIllIlIlIlIlIlllIIIlI;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return null;
    }
    
    private static void lIIlIlIIIIIIllll() {
        (llIlIlIIllIllI = new int[12])[0] = (0x46 ^ 0x38 ^ (0x47 ^ 0x15));
        WebSocketServerHandshaker.llIlIlIIllIllI[1] = ((0x4B ^ 0x22 ^ (0x98 ^ 0xA6)) & (68 + 58 - 2 + 106 ^ 72 + 22 + 65 + 18 ^ -" ".length()));
        WebSocketServerHandshaker.llIlIlIIllIllI[2] = " ".length();
        WebSocketServerHandshaker.llIlIlIIllIllI[3] = "  ".length();
        WebSocketServerHandshaker.llIlIlIIllIllI[4] = "   ".length();
        WebSocketServerHandshaker.llIlIlIIllIllI[5] = (135 + 78 - 88 + 44 ^ 166 + 141 - 165 + 31);
        WebSocketServerHandshaker.llIlIlIIllIllI[6] = (0xDD ^ 0xB6 ^ (0x0 ^ 0x6E));
        WebSocketServerHandshaker.llIlIlIIllIllI[7] = (0x52 ^ 0x54);
        WebSocketServerHandshaker.llIlIlIIllIllI[8] = (0xE ^ 0x20 ^ (0x89 ^ 0xA0));
        WebSocketServerHandshaker.llIlIlIIllIllI[9] = (0x19 ^ 0x1C ^ (0x76 ^ 0x7B));
        WebSocketServerHandshaker.llIlIlIIllIllI[10] = (0x4E ^ 0x47);
        WebSocketServerHandshaker.llIlIlIIllIllI[11] = (0x56 ^ 0x5C);
    }
    
    protected abstract FullHttpResponse newHandshakeResponse(final FullHttpRequest p0, final HttpHeaders p1);
    
    private static boolean lIIlIlIIIIIlIIlI(final int llllllllllllIllIlIlIlIlIIlIlIIII) {
        return llllllllllllIllIlIlIlIlIIlIlIIII != 0;
    }
    
    public Set<String> subprotocols() {
        final Set<String> llllllllllllIllIlIlIlIllIlllllII = new LinkedHashSet<String>();
        Collections.addAll(llllllllllllIllIlIlIlIllIlllllII, this.subprotocols);
        "".length();
        return llllllllllllIllIlIlIlIllIlllllII;
    }
    
    private static boolean lIIlIlIIIIIlIlII(final int llllllllllllIllIlIlIlIlIIlIIlIll) {
        return llllllllllllIllIlIlIlIlIIlIIlIll == 0;
    }
}
