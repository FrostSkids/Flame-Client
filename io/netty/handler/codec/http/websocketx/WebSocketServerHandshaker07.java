// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.util.CharsetUtil;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.FullHttpRequest;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class WebSocketServerHandshaker07 extends WebSocketServerHandshaker
{
    private static final /* synthetic */ String[] lIIllIIIIlIIIl;
    private static final /* synthetic */ int[] lIIllIIIIlllll;
    private final /* synthetic */ boolean allowExtensions;
    
    static {
        llIlIllIIIIIIll();
        llIlIlIllIlIIll();
        WEBSOCKET_07_ACCEPT_GUID = WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[12]];
    }
    
    @Override
    protected WebSocketFrameEncoder newWebSocketEncoder() {
        return new WebSocket07FrameEncoder((boolean)(WebSocketServerHandshaker07.lIIllIIIIlllll[0] != 0));
    }
    
    private static boolean llIlIllIIIIIlIl(final Object lllllllllllllIIlIllIlIllIIIllIll) {
        return lllllllllllllIIlIllIlIllIIIllIll == null;
    }
    
    private static void llIlIlIllIlIIll() {
        (lIIllIIIIlIIIl = new String[WebSocketServerHandshaker07.lIIllIIIIlllll[13]])[WebSocketServerHandshaker07.lIIllIIIIlllll[0]] = llIlIlIllIlIIII("6V/dVuqQNgE+Mu1BCW1EHzjCdy7/KbBq", "iSWcQ");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[1]] = llIlIlIllIlIIIl("io+yDa/HG8cij7KSvzBhYvu28D5we/LP9bog7TuFoSE+sYz3X3cWyA==", "gnYse");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[2]] = llIlIlIllIlIIII("rWyQPRpQh5/3+ghJpqjqVRQLZMO6bRuE2kO/SkAo7vx2SR817NGVQg==", "tBSNE");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[3]] = llIlIlIllIlIIII("KJeOQ8hQicoeEHoh0vlwrshimZVOXWm9IhLJ2o0VgrjYuEqWlP0uWwb3/jQSDCWUL8Ilx7St71ue6eZSmo8YrQ==", "FaywN");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[4]] = llIlIlIllIlIIIl("eKsBqy+frrY=", "RnrkF");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[5]] = llIlIlIllIlIIIl("mcIAr/ud/WOwjupDWVyplw==", "jEJwr");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[6]] = llIlIlIllIlIIlI("CgYdAhQqHRoDHw==", "Iislq");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[7]] = llIlIlIllIlIIlI("OxYIHSQKAw==", "nfooE");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[8]] = llIlIlIllIlIIII("I5zQ7H7e3NLL002GdAh2SevjvRAX21Rn", "mqUBk");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[9]] = llIlIlIllIlIIlI("JAkIWRoSDjgbLhwJH1kdBQMfGy4YAA==", "wlktM");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[10]] = llIlIlIllIlIIII("mhJfqPJCI3TiGO6nWA1yd1YY7RGWyieX2EUY8lCInfAplb9a8/V4HV4XTBblwwU1", "aAqJZ");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[11]] = llIlIlIllIlIIlI("PCQVQD0KIyUCCQQkAkA6HS4CAgkALQ==", "oAvmj");
        WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[12]] = llIlIlIllIlIIlI("d2ZSKgMDEl9CB3xiXkJ2chcrQntwECtCAXASKF8GBmtfLXN0", "ESjoB");
    }
    
    private static boolean llIlIllIIIIIlll(final int lllllllllllllIIlIllIlIllIIlIIIII, final int lllllllllllllIIlIllIlIllIIIlllll) {
        return lllllllllllllIIlIllIlIllIIlIIIII < lllllllllllllIIlIllIlIllIIIlllll;
    }
    
    private static String llIlIlIllIlIIII(final String lllllllllllllIIlIllIlIllIlIIllIl, final String lllllllllllllIIlIllIlIllIlIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIllIlIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIllIlIIllII.getBytes(StandardCharsets.UTF_8)), WebSocketServerHandshaker07.lIIllIIIIlllll[8]), "DES");
            final Cipher lllllllllllllIIlIllIlIllIlIIllll = Cipher.getInstance("DES");
            lllllllllllllIIlIllIlIllIlIIllll.init(WebSocketServerHandshaker07.lIIllIIIIlllll[2], lllllllllllllIIlIllIlIllIlIlIIII);
            return new String(lllllllllllllIIlIllIlIllIlIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIllIlIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIllIlIIlllI) {
            lllllllllllllIIlIllIlIllIlIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIllIIIIIllI(final int lllllllllllllIIlIllIlIllIIIllIIl) {
        return lllllllllllllIIlIllIlIllIIIllIIl != 0;
    }
    
    private static void llIlIllIIIIIIll() {
        (lIIllIIIIlllll = new int[14])[0] = ((0xB8 ^ 0x8A) & ~(0xA3 ^ 0x91));
        WebSocketServerHandshaker07.lIIllIIIIlllll[1] = " ".length();
        WebSocketServerHandshaker07.lIIllIIIIlllll[2] = "  ".length();
        WebSocketServerHandshaker07.lIIllIIIIlllll[3] = "   ".length();
        WebSocketServerHandshaker07.lIIllIIIIlllll[4] = (0x8 ^ 0xC);
        WebSocketServerHandshaker07.lIIllIIIIlllll[5] = (0x15 ^ 0x10);
        WebSocketServerHandshaker07.lIIllIIIIlllll[6] = (0x5B ^ 0x5D);
        WebSocketServerHandshaker07.lIIllIIIIlllll[7] = (68 + 85 - 112 + 86 ^ (0xD ^ 0x75));
        WebSocketServerHandshaker07.lIIllIIIIlllll[8] = (0xB1 ^ 0xB9);
        WebSocketServerHandshaker07.lIIllIIIIlllll[9] = (0xD ^ 0x4);
        WebSocketServerHandshaker07.lIIllIIIIlllll[10] = (0x44 ^ 0x4E);
        WebSocketServerHandshaker07.lIIllIIIIlllll[11] = (133 + 5 + 37 + 4 ^ 31 + 176 - 95 + 72);
        WebSocketServerHandshaker07.lIIllIIIIlllll[12] = (0x1A ^ 0x16);
        WebSocketServerHandshaker07.lIIllIIIIlllll[13] = (0xA4 ^ 0xA9);
    }
    
    @Override
    protected FullHttpResponse newHandshakeResponse(final FullHttpRequest lllllllllllllIIlIllIlIllIllIlIlI, final HttpHeaders lllllllllllllIIlIllIlIllIllIIIII) {
        final FullHttpResponse lllllllllllllIIlIllIlIllIllIlIII = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.SWITCHING_PROTOCOLS);
        if (llIlIllIIIIIlII(lllllllllllllIIlIllIlIllIllIIIII)) {
            lllllllllllllIIlIllIlIllIllIlIII.headers().add(lllllllllllllIIlIllIlIllIllIIIII);
            "".length();
        }
        final String lllllllllllllIIlIllIlIllIllIIlll = lllllllllllllIIlIllIlIllIllIlIlI.headers().get(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[0]]);
        if (llIlIllIIIIIlIl(lllllllllllllIIlIllIlIllIllIIlll)) {
            throw new WebSocketHandshakeException(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[1]]);
        }
        final String lllllllllllllIIlIllIlIllIllIIllI = String.valueOf(new StringBuilder().append(lllllllllllllIIlIllIlIllIllIIlll).append(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[2]]));
        final byte[] lllllllllllllIIlIllIlIllIllIIlIl = WebSocketUtil.sha1(lllllllllllllIIlIllIlIllIllIIllI.getBytes(CharsetUtil.US_ASCII));
        final String lllllllllllllIIlIllIlIllIllIIlII = WebSocketUtil.base64(lllllllllllllIIlIllIlIllIllIIlIl);
        if (llIlIllIIIIIllI(WebSocketServerHandshaker07.logger.isDebugEnabled() ? 1 : 0)) {
            WebSocketServerHandshaker07.logger.debug(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[3]], lllllllllllllIIlIllIlIllIllIIlll, lllllllllllllIIlIllIlIllIllIIlII);
        }
        lllllllllllllIIlIllIlIllIllIlIII.headers().add(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[4]], WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[5]].toLowerCase());
        "".length();
        lllllllllllllIIlIllIlIllIllIlIII.headers().add(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[6]], WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[7]]);
        "".length();
        lllllllllllllIIlIllIlIllIllIlIII.headers().add(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[8]], lllllllllllllIIlIllIlIllIllIIlII);
        "".length();
        final String lllllllllllllIIlIllIlIllIllIIIll = lllllllllllllIIlIllIlIllIllIlIlI.headers().get(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[9]]);
        if (llIlIllIIIIIlII(lllllllllllllIIlIllIlIllIllIIIll)) {
            final String lllllllllllllIIlIllIlIllIllIllII = this.selectSubprotocol(lllllllllllllIIlIllIlIllIllIIIll);
            if (llIlIllIIIIIlIl(lllllllllllllIIlIllIlIllIllIllII)) {
                if (llIlIllIIIIIllI(WebSocketServerHandshaker07.logger.isDebugEnabled() ? 1 : 0)) {
                    WebSocketServerHandshaker07.logger.debug(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[10]], lllllllllllllIIlIllIlIllIllIIIll);
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
            }
            else {
                lllllllllllllIIlIllIlIllIllIlIII.headers().add(WebSocketServerHandshaker07.lIIllIIIIlIIIl[WebSocketServerHandshaker07.lIIllIIIIlllll[11]], lllllllllllllIIlIllIlIllIllIllII);
                "".length();
            }
        }
        return lllllllllllllIIlIllIlIllIllIlIII;
    }
    
    @Override
    protected WebSocketFrameDecoder newWebsocketDecoder() {
        return new WebSocket07FrameDecoder((boolean)(WebSocketServerHandshaker07.lIIllIIIIlllll[1] != 0), this.allowExtensions, this.maxFramePayloadLength());
    }
    
    private static boolean llIlIllIIIIIlII(final Object lllllllllllllIIlIllIlIllIIIlllIl) {
        return lllllllllllllIIlIllIlIllIIIlllIl != null;
    }
    
    private static String llIlIlIllIlIIIl(final String lllllllllllllIIlIllIlIllIIlIlIII, final String lllllllllllllIIlIllIlIllIIlIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIlIllIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIlIllIIlIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIlIllIIlIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIlIllIIlIlIlI.init(WebSocketServerHandshaker07.lIIllIIIIlllll[2], lllllllllllllIIlIllIlIllIIlIlIll);
            return new String(lllllllllllllIIlIllIlIllIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIlIllIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIlIllIIlIlIIl) {
            lllllllllllllIIlIllIlIllIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    public WebSocketServerHandshaker07(final String lllllllllllllIIlIllIlIllIllllIlI, final String lllllllllllllIIlIllIlIllIllllllI, final boolean lllllllllllllIIlIllIlIllIlllllIl, final int lllllllllllllIIlIllIlIllIlllIlll) {
        super(WebSocketVersion.V07, lllllllllllllIIlIllIlIllIllllIlI, lllllllllllllIIlIllIlIllIllllllI, lllllllllllllIIlIllIlIllIlllIlll);
        this.allowExtensions = lllllllllllllIIlIllIlIllIlllllIl;
    }
    
    private static String llIlIlIllIlIIlI(String lllllllllllllIIlIllIlIllIIlllIII, final String lllllllllllllIIlIllIlIllIIllllII) {
        lllllllllllllIIlIllIlIllIIlllIII = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIlIllIIlllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIlIllIIlllIll = new StringBuilder();
        final char[] lllllllllllllIIlIllIlIllIIlllIlI = lllllllllllllIIlIllIlIllIIllllII.toCharArray();
        int lllllllllllllIIlIllIlIllIIlllIIl = WebSocketServerHandshaker07.lIIllIIIIlllll[0];
        final String lllllllllllllIIlIllIlIllIIllIIll = (Object)lllllllllllllIIlIllIlIllIIlllIII.toCharArray();
        final double lllllllllllllIIlIllIlIllIIllIIlI = lllllllllllllIIlIllIlIllIIllIIll.length;
        double lllllllllllllIIlIllIlIllIIllIIIl = WebSocketServerHandshaker07.lIIllIIIIlllll[0];
        while (llIlIllIIIIIlll((int)lllllllllllllIIlIllIlIllIIllIIIl, (int)lllllllllllllIIlIllIlIllIIllIIlI)) {
            final char lllllllllllllIIlIllIlIllIIlllllI = lllllllllllllIIlIllIlIllIIllIIll[lllllllllllllIIlIllIlIllIIllIIIl];
            lllllllllllllIIlIllIlIllIIlllIll.append((char)(lllllllllllllIIlIllIlIllIIlllllI ^ lllllllllllllIIlIllIlIllIIlllIlI[lllllllllllllIIlIllIlIllIIlllIIl % lllllllllllllIIlIllIlIllIIlllIlI.length]));
            "".length();
            ++lllllllllllllIIlIllIlIllIIlllIIl;
            ++lllllllllllllIIlIllIlIllIIllIIIl;
            "".length();
            if ((0x48 ^ 0x4C) <= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIlIllIIlllIll);
    }
}
