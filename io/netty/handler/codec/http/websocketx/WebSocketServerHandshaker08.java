// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.CharsetUtil;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.FullHttpRequest;

public class WebSocketServerHandshaker08 extends WebSocketServerHandshaker
{
    private static final /* synthetic */ String[] lIIlIIIlIllIII;
    private final /* synthetic */ boolean allowExtensions;
    private static final /* synthetic */ int[] lIIlIIIlIllIll;
    
    @Override
    protected FullHttpResponse newHandshakeResponse(final FullHttpRequest lllllllllllllIIlllIIlIllllIlllll, final HttpHeaders lllllllllllllIIlllIIlIllllIllllI) {
        final FullHttpResponse lllllllllllllIIlllIIlIllllIlllIl = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.SWITCHING_PROTOCOLS);
        if (llIIlIllIIIIlII(lllllllllllllIIlllIIlIllllIllllI)) {
            lllllllllllllIIlllIIlIllllIlllIl.headers().add(lllllllllllllIIlllIIlIllllIllllI);
            "".length();
        }
        final String lllllllllllllIIlllIIlIllllIlllII = lllllllllllllIIlllIIlIllllIlllll.headers().get(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[0]]);
        if (llIIlIllIIIIlIl(lllllllllllllIIlllIIlIllllIlllII)) {
            throw new WebSocketHandshakeException(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[1]]);
        }
        final String lllllllllllllIIlllIIlIllllIllIll = String.valueOf(new StringBuilder().append(lllllllllllllIIlllIIlIllllIlllII).append(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[2]]));
        final byte[] lllllllllllllIIlllIIlIllllIllIlI = WebSocketUtil.sha1(lllllllllllllIIlllIIlIllllIllIll.getBytes(CharsetUtil.US_ASCII));
        final String lllllllllllllIIlllIIlIllllIllIIl = WebSocketUtil.base64(lllllllllllllIIlllIIlIllllIllIlI);
        if (llIIlIllIIIIllI(WebSocketServerHandshaker08.logger.isDebugEnabled() ? 1 : 0)) {
            WebSocketServerHandshaker08.logger.debug(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[3]], lllllllllllllIIlllIIlIllllIlllII, lllllllllllllIIlllIIlIllllIllIIl);
        }
        lllllllllllllIIlllIIlIllllIlllIl.headers().add(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[4]], WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[5]].toLowerCase());
        "".length();
        lllllllllllllIIlllIIlIllllIlllIl.headers().add(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[6]], WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[7]]);
        "".length();
        lllllllllllllIIlllIIlIllllIlllIl.headers().add(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[8]], lllllllllllllIIlllIIlIllllIllIIl);
        "".length();
        final String lllllllllllllIIlllIIlIllllIllIII = lllllllllllllIIlllIIlIllllIlllll.headers().get(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[9]]);
        if (llIIlIllIIIIlII(lllllllllllllIIlllIIlIllllIllIII)) {
            final String lllllllllllllIIlllIIlIlllllIIIIl = this.selectSubprotocol(lllllllllllllIIlllIIlIllllIllIII);
            if (llIIlIllIIIIlIl(lllllllllllllIIlllIIlIlllllIIIIl)) {
                if (llIIlIllIIIIllI(WebSocketServerHandshaker08.logger.isDebugEnabled() ? 1 : 0)) {
                    WebSocketServerHandshaker08.logger.debug(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[10]], lllllllllllllIIlllIIlIllllIllIII);
                    "".length();
                    if ((0x46 ^ 0x38 ^ (0x76 ^ 0xC)) < 0) {
                        return null;
                    }
                }
            }
            else {
                lllllllllllllIIlllIIlIllllIlllIl.headers().add(WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[11]], lllllllllllllIIlllIIlIlllllIIIIl);
                "".length();
            }
        }
        return lllllllllllllIIlllIIlIllllIlllIl;
    }
    
    @Override
    protected WebSocketFrameDecoder newWebsocketDecoder() {
        return new WebSocket08FrameDecoder((boolean)(WebSocketServerHandshaker08.lIIlIIIlIllIll[1] != 0), this.allowExtensions, this.maxFramePayloadLength());
    }
    
    static {
        llIIlIllIIIIIll();
        llIIlIlIlllllll();
        WEBSOCKET_08_ACCEPT_GUID = WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[12]];
    }
    
    private static String llIIlIlIlllllIl(String lllllllllllllIIlllIIlIlllIlIllIl, final String lllllllllllllIIlllIIlIlllIllIIIl) {
        lllllllllllllIIlllIIlIlllIlIllIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlllIIlIlllIlIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIlIlllIllIIII = new StringBuilder();
        final char[] lllllllllllllIIlllIIlIlllIlIllll = lllllllllllllIIlllIIlIlllIllIIIl.toCharArray();
        int lllllllllllllIIlllIIlIlllIlIlllI = WebSocketServerHandshaker08.lIIlIIIlIllIll[0];
        final boolean lllllllllllllIIlllIIlIlllIlIlIII = (Object)((String)lllllllllllllIIlllIIlIlllIlIllIl).toCharArray();
        final boolean lllllllllllllIIlllIIlIlllIlIIlll = lllllllllllllIIlllIIlIlllIlIlIII.length != 0;
        long lllllllllllllIIlllIIlIlllIlIIllI = WebSocketServerHandshaker08.lIIlIIIlIllIll[0];
        while (llIIlIllIIIIlll((int)lllllllllllllIIlllIIlIlllIlIIllI, lllllllllllllIIlllIIlIlllIlIIlll ? 1 : 0)) {
            final char lllllllllllllIIlllIIlIlllIllIIll = lllllllllllllIIlllIIlIlllIlIlIII[lllllllllllllIIlllIIlIlllIlIIllI];
            lllllllllllllIIlllIIlIlllIllIIII.append((char)(lllllllllllllIIlllIIlIlllIllIIll ^ lllllllllllllIIlllIIlIlllIlIllll[lllllllllllllIIlllIIlIlllIlIlllI % lllllllllllllIIlllIIlIlllIlIllll.length]));
            "".length();
            ++lllllllllllllIIlllIIlIlllIlIlllI;
            ++lllllllllllllIIlllIIlIlllIlIIllI;
            "".length();
            if ((0x12 ^ 0x16) <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIlIlllIllIIII);
    }
    
    private static boolean llIIlIllIIIIlll(final int lllllllllllllIIlllIIlIlllIIlIlIl, final int lllllllllllllIIlllIIlIlllIIlIlII) {
        return lllllllllllllIIlllIIlIlllIIlIlIl < lllllllllllllIIlllIIlIlllIIlIlII;
    }
    
    private static boolean llIIlIllIIIIlIl(final Object lllllllllllllIIlllIIlIlllIIlIIII) {
        return lllllllllllllIIlllIIlIlllIIlIIII == null;
    }
    
    private static void llIIlIllIIIIIll() {
        (lIIlIIIlIllIll = new int[14])[0] = ((0x44 ^ 0x67) & ~(0x1D ^ 0x3E));
        WebSocketServerHandshaker08.lIIlIIIlIllIll[1] = " ".length();
        WebSocketServerHandshaker08.lIIlIIIlIllIll[2] = "  ".length();
        WebSocketServerHandshaker08.lIIlIIIlIllIll[3] = "   ".length();
        WebSocketServerHandshaker08.lIIlIIIlIllIll[4] = (0x3A ^ 0x3E);
        WebSocketServerHandshaker08.lIIlIIIlIllIll[5] = (4 + 25 + 12 + 99 ^ 79 + 132 - 183 + 109);
        WebSocketServerHandshaker08.lIIlIIIlIllIll[6] = (0xDD ^ 0x91 ^ (0x8D ^ 0xC7));
        WebSocketServerHandshaker08.lIIlIIIlIllIll[7] = (95 + 126 - 173 + 119 ^ 91 + 7 - 93 + 155);
        WebSocketServerHandshaker08.lIIlIIIlIllIll[8] = (0x37 ^ 0x3F);
        WebSocketServerHandshaker08.lIIlIIIlIllIll[9] = (0x51 ^ 0x68 ^ (0x97 ^ 0xA7));
        WebSocketServerHandshaker08.lIIlIIIlIllIll[10] = (0x11 ^ 0x56 ^ (0xD ^ 0x40));
        WebSocketServerHandshaker08.lIIlIIIlIllIll[11] = (0x27 ^ 0x40 ^ (0x32 ^ 0x5E));
        WebSocketServerHandshaker08.lIIlIIIlIllIll[12] = (0x5B ^ 0x57);
        WebSocketServerHandshaker08.lIIlIIIlIllIll[13] = (0x23 ^ 0x2E);
    }
    
    private static String llIIlIlIlllIllI(final String lllllllllllllIIlllIIlIlllIIllIll, final String lllllllllllllIIlllIIlIlllIIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIlllIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIlllIIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIlIlllIIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIlIlllIIlllll.init(WebSocketServerHandshaker08.lIIlIIIlIllIll[2], lllllllllllllIIlllIIlIlllIlIIIII);
            return new String(lllllllllllllIIlllIIlIlllIIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIlllIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIlllIIllllI) {
            lllllllllllllIIlllIIlIlllIIllllI.printStackTrace();
            return null;
        }
    }
    
    public WebSocketServerHandshaker08(final String lllllllllllllIIlllIIlIllllllIlII, final String lllllllllllllIIlllIIlIlllllIlllI, final boolean lllllllllllllIIlllIIlIlllllIllIl, final int lllllllllllllIIlllIIlIllllllIIIl) {
        super(WebSocketVersion.V08, lllllllllllllIIlllIIlIllllllIlII, lllllllllllllIIlllIIlIlllllIlllI, lllllllllllllIIlllIIlIllllllIIIl);
        this.allowExtensions = lllllllllllllIIlllIIlIlllllIllIl;
    }
    
    private static void llIIlIlIlllllll() {
        (lIIlIIIlIllIII = new String[WebSocketServerHandshaker08.lIIlIIIlIllIll[13]])[WebSocketServerHandshaker08.lIIlIIIlIllIll[0]] = llIIlIlIlllIllI("zPPw08faJz6Kk7OMUBvk8oEvtjjjnVB9", "xxWOM");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[1]] = llIIlIlIlllllIl("PwEEby1xORUtHz4NGyo4cRwVPjk0HQR1bDwHAzwlPwlQJCko", "QnpOL");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[2]] = llIIlIlIlllllIl("UXdvJCUlA2JMIVpzY0xQVAYWTF1WARZMJ1YDFVEgIHpiI1VS", "cBWad");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[3]] = llIIlIlIllllllI("B2HgmiIcGGbPB8NVErpFcUDQT6DBGX3cASBz5Set3AVJMUjtF3vzH5O09KLUrz2gY9wsLRGYBnEJmn9LTwTIDQ==", "WWgtj");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[4]] = llIIlIlIlllIllI("PEHmo5+cAgw=", "AfVDf");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[5]] = llIIlIlIlllIllI("oeIfgJit9FjsI10x38cWHA==", "hjhGF");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[6]] = llIIlIlIlllllIl("AiE3KDAiOjApOw==", "ANYFU");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[7]] = llIIlIlIllllllI("/oikcQOK++s=", "mpGyj");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[8]] = llIIlIlIlllIllI("9pliHIuJOoCM5l14pHYdQTVlY1OnD53q", "pLYVz");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[9]] = llIIlIlIlllllIl("PR00SjgLGgQIDAUdI0o/HBcjCAwBFA==", "nxWgo");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[10]] = llIIlIlIlllllIl("EB8+LwAxDio+RTEPLSoXLQ4gOQouUjxzRSwVO3oWNwo/NRc2HytgRTkH", "BzOZe");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[11]] = llIIlIlIllllllI("p5R4/76E3GwqBrONXeL/004+wm55u3e4", "lPkRv");
        WebSocketServerHandshaker08.lIIlIIIlIllIII[WebSocketServerHandshaker08.lIIlIIIlIllIll[12]] = llIIlIlIlllllIl("YkdcMTsWM1FZP2lDUFlOZzYlWUNlMSVZOWUzJkQ+E0pRNkth", "Prdtz");
    }
    
    private static boolean llIIlIllIIIIlII(final Object lllllllllllllIIlllIIlIlllIIlIIlI) {
        return lllllllllllllIIlllIIlIlllIIlIIlI != null;
    }
    
    private static String llIIlIlIllllllI(final String lllllllllllllIIlllIIlIllllIIIIII, final String lllllllllllllIIlllIIlIllllIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIllllIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIllllIIIIIl.getBytes(StandardCharsets.UTF_8)), WebSocketServerHandshaker08.lIIlIIIlIllIll[8]), "DES");
            final Cipher lllllllllllllIIlllIIlIllllIIIlII = Cipher.getInstance("DES");
            lllllllllllllIIlllIIlIllllIIIlII.init(WebSocketServerHandshaker08.lIIlIIIlIllIll[2], lllllllllllllIIlllIIlIllllIIIlIl);
            return new String(lllllllllllllIIlllIIlIllllIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIllllIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIllllIIIIll) {
            lllllllllllllIIlllIIlIllllIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIlIllIIIIllI(final int lllllllllllllIIlllIIlIlllIIIlllI) {
        return lllllllllllllIIlllIIlIlllIIIlllI != 0;
    }
    
    @Override
    protected WebSocketFrameEncoder newWebSocketEncoder() {
        return new WebSocket08FrameEncoder((boolean)(WebSocketServerHandshaker08.lIIlIIIlIllIll[0] != 0));
    }
}
