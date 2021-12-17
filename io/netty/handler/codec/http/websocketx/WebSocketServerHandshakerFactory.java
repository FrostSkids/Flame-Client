// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.DefaultHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.HttpRequest;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class WebSocketServerHandshakerFactory
{
    private final /* synthetic */ String subprotocols;
    private static final /* synthetic */ String[] llIIlllIllllII;
    private final /* synthetic */ boolean allowExtensions;
    private final /* synthetic */ int maxFramePayloadLength;
    private static final /* synthetic */ int[] llIIlllIlllllI;
    private final /* synthetic */ String webSocketURL;
    
    private static String lIIIlllllllllIII(final String llllllllllllIllIlllIllllIIlIIlll, final String llllllllllllIllIlllIllllIIlIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlllIllllIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIllllIIlIIllI.getBytes(StandardCharsets.UTF_8)), WebSocketServerHandshakerFactory.llIIlllIlllllI[4]), "DES");
            final Cipher llllllllllllIllIlllIllllIIlIlIIl = Cipher.getInstance("DES");
            llllllllllllIllIlllIllllIIlIlIIl.init(WebSocketServerHandshakerFactory.llIIlllIlllllI[3], llllllllllllIllIlllIllllIIlIlIlI);
            return new String(llllllllllllIllIlllIllllIIlIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIllllIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIllllIIlIlIII) {
            llllllllllllIllIlllIllllIIlIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllllllllllll(final int llllllllllllIllIlllIllllIIIIIIlI) {
        return llllllllllllIllIlllIllllIIIIIIlI != 0;
    }
    
    static {
        lIIIllllllllllIl();
        lIIIlllllllllIIl();
    }
    
    private static void lIIIllllllllllIl() {
        (llIIlllIlllllI = new int[5])[0] = (0xFFFFFA17 & 0x105E8);
        WebSocketServerHandshakerFactory.llIIlllIlllllI[1] = ((0x43 ^ 0x71) & ~(0x6D ^ 0x5F));
        WebSocketServerHandshakerFactory.llIIlllIlllllI[2] = " ".length();
        WebSocketServerHandshakerFactory.llIIlllIlllllI[3] = "  ".length();
        WebSocketServerHandshakerFactory.llIIlllIlllllI[4] = (0x10 ^ 0x18);
    }
    
    public WebSocketServerHandshaker newHandshaker(final HttpRequest llllllllllllIllIlllIllllIlIIIIlI) {
        final String llllllllllllIllIlllIllllIlIIIIIl = llllllllllllIllIlllIllllIlIIIIlI.headers().get(WebSocketServerHandshakerFactory.llIIlllIllllII[WebSocketServerHandshakerFactory.llIIlllIlllllI[1]]);
        if (!lIIIlllllllllllI(llllllllllllIllIlllIllllIlIIIIIl)) {
            return new WebSocketServerHandshaker00(this.webSocketURL, this.subprotocols, this.maxFramePayloadLength);
        }
        if (lIIIllllllllllll(llllllllllllIllIlllIllllIlIIIIIl.equals(WebSocketVersion.V13.toHttpHeaderValue()) ? 1 : 0)) {
            return new WebSocketServerHandshaker13(this.webSocketURL, this.subprotocols, this.allowExtensions, this.maxFramePayloadLength);
        }
        if (lIIIllllllllllll(llllllllllllIllIlllIllllIlIIIIIl.equals(WebSocketVersion.V08.toHttpHeaderValue()) ? 1 : 0)) {
            return new WebSocketServerHandshaker08(this.webSocketURL, this.subprotocols, this.allowExtensions, this.maxFramePayloadLength);
        }
        if (lIIIllllllllllll(llllllllllllIllIlllIllllIlIIIIIl.equals(WebSocketVersion.V07.toHttpHeaderValue()) ? 1 : 0)) {
            return new WebSocketServerHandshaker07(this.webSocketURL, this.subprotocols, this.allowExtensions, this.maxFramePayloadLength);
        }
        return null;
    }
    
    public WebSocketServerHandshakerFactory(final String llllllllllllIllIlllIllllIlIIlIlI, final String llllllllllllIllIlllIllllIlIIlIIl, final boolean llllllllllllIllIlllIllllIlIIllIl, final int llllllllllllIllIlllIllllIlIIIlll) {
        this.webSocketURL = llllllllllllIllIlllIllllIlIIlIlI;
        this.subprotocols = llllllllllllIllIlllIllllIlIIlIIl;
        this.allowExtensions = llllllllllllIllIlllIllllIlIIllIl;
        this.maxFramePayloadLength = llllllllllllIllIlllIllllIlIIIlll;
    }
    
    private static void lIIIlllllllllIIl() {
        (llIIlllIllllII = new String[WebSocketServerHandshakerFactory.llIIlllIlllllI[3]])[WebSocketServerHandshakerFactory.llIIlllIlllllI[1]] = lIIIllllllllIlll("OxQGaCYNEzYqEgMUEWgnDQMWLB4G", "hqeEq");
        WebSocketServerHandshakerFactory.llIIlllIllllII[WebSocketServerHandshakerFactory.llIIlllIlllllI[2]] = lIIIlllllllllIII("NFK+11XIpBgMzgePmKbbpc0P9a500L46", "EkFzw");
    }
    
    @Deprecated
    public static void sendUnsupportedWebSocketVersionResponse(final Channel llllllllllllIllIlllIllllIIlllIll) {
        sendUnsupportedVersionResponse(llllllllllllIllIlllIllllIIlllIll);
        "".length();
    }
    
    private static String lIIIllllllllIlll(String llllllllllllIllIlllIllllIIIlIIlI, final String llllllllllllIllIlllIllllIIIlIIIl) {
        llllllllllllIllIlllIllllIIIlIIlI = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllIllllIIIlIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIllllIIIlIlIl = new StringBuilder();
        final char[] llllllllllllIllIlllIllllIIIlIlII = llllllllllllIllIlllIllllIIIlIIIl.toCharArray();
        int llllllllllllIllIlllIllllIIIlIIll = WebSocketServerHandshakerFactory.llIIlllIlllllI[1];
        final short llllllllllllIllIlllIllllIIIIllIl = (Object)((String)llllllllllllIllIlllIllllIIIlIIlI).toCharArray();
        final float llllllllllllIllIlllIllllIIIIllII = llllllllllllIllIlllIllllIIIIllIl.length;
        boolean llllllllllllIllIlllIllllIIIIlIll = WebSocketServerHandshakerFactory.llIIlllIlllllI[1] != 0;
        while (lIIlIIIIIIIIIIII(llllllllllllIllIlllIllllIIIIlIll ? 1 : 0, (int)llllllllllllIllIlllIllllIIIIllII)) {
            final char llllllllllllIllIlllIllllIIIllIII = llllllllllllIllIlllIllllIIIIllIl[llllllllllllIllIlllIllllIIIIlIll];
            llllllllllllIllIlllIllllIIIlIlIl.append((char)(llllllllllllIllIlllIllllIIIllIII ^ llllllllllllIllIlllIllllIIIlIlII[llllllllllllIllIlllIllllIIIlIIll % llllllllllllIllIlllIllllIIIlIlII.length]));
            "".length();
            ++llllllllllllIllIlllIllllIIIlIIll;
            ++llllllllllllIllIlllIllllIIIIlIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIllllIIIlIlIl);
    }
    
    public WebSocketServerHandshakerFactory(final String llllllllllllIllIlllIllllIlIlllII, final String llllllllllllIllIlllIllllIlIlIlll, final boolean llllllllllllIllIlllIllllIlIlIllI) {
        this(llllllllllllIllIlllIllllIlIlllII, llllllllllllIllIlllIllllIlIlIlll, llllllllllllIllIlllIllllIlIlIllI, WebSocketServerHandshakerFactory.llIIlllIlllllI[0]);
    }
    
    private static boolean lIIlIIIIIIIIIIII(final int llllllllllllIllIlllIllllIIIIIlll, final int llllllllllllIllIlllIllllIIIIIllI) {
        return llllllllllllIllIlllIllllIIIIIlll < llllllllllllIllIlllIllllIIIIIllI;
    }
    
    public static ChannelFuture sendUnsupportedVersionResponse(final Channel llllllllllllIllIlllIllllIIllIIIl, final ChannelPromise llllllllllllIllIlllIllllIIllIIII) {
        final HttpResponse llllllllllllIllIlllIllllIIllIIlI = new DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.UPGRADE_REQUIRED);
        llllllllllllIllIlllIllllIIllIIlI.headers().set(WebSocketServerHandshakerFactory.llIIlllIllllII[WebSocketServerHandshakerFactory.llIIlllIlllllI[2]], WebSocketVersion.V13.toHttpHeaderValue());
        "".length();
        return llllllllllllIllIlllIllllIIllIIIl.write(llllllllllllIllIlllIllllIIllIIlI, llllllllllllIllIlllIllllIIllIIII);
    }
    
    public static ChannelFuture sendUnsupportedVersionResponse(final Channel llllllllllllIllIlllIllllIIlllIIl) {
        return sendUnsupportedVersionResponse(llllllllllllIllIlllIllllIIlllIIl, llllllllllllIllIlllIllllIIlllIIl.newPromise());
    }
    
    private static boolean lIIIlllllllllllI(final Object llllllllllllIllIlllIllllIIIIIlII) {
        return llllllllllllIllIlllIllllIIIIIlII != null;
    }
}
