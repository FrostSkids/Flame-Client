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

public class WebSocketServerHandshaker13 extends WebSocketServerHandshaker
{
    private static final /* synthetic */ String[] lIIIllIlIlIIIl;
    private final /* synthetic */ boolean allowExtensions;
    private static final /* synthetic */ int[] lIIIllIlIlIlIl;
    
    private static boolean llIIIlIIlIIlIII(final int lllllllllllllIlIIIIIIIIlIllllIII) {
        return lllllllllllllIlIIIIIIIIlIllllIII != 0;
    }
    
    private static void llIIIlIIlIIIlIl() {
        (lIIIllIlIlIlIl = new int[14])[0] = ((27 + 36 + 55 + 44 ^ 101 + 28 + 6 + 31) & (0x2A ^ 0x36 ^ (0x4E ^ 0x56) ^ -" ".length()));
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[1] = " ".length();
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[2] = "  ".length();
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[3] = "   ".length();
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[4] = (0x27 ^ 0x1D ^ (0x84 ^ 0xBA));
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[5] = (0x1F ^ 0x1A);
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[6] = (0x2A ^ 0x6E ^ (0x2F ^ 0x6D));
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[7] = (67 + 46 - 28 + 43 ^ 91 + 30 - 15 + 29);
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[8] = (0x79 ^ 0x71);
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[9] = (0x2 ^ 0xB);
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[10] = (0x20 ^ 0x2A);
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[11] = (0xF ^ 0x4);
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[12] = (0x23 ^ 0x5D ^ (0xD3 ^ 0xA1));
        WebSocketServerHandshaker13.lIIIllIlIlIlIl[13] = (0x57 ^ 0x5F ^ (0x44 ^ 0x41));
    }
    
    static {
        llIIIlIIlIIIlIl();
        llIIIlIIIllllIl();
        WEBSOCKET_13_ACCEPT_GUID = WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[12]];
    }
    
    private static void llIIIlIIIllllIl() {
        (lIIIllIlIlIIIl = new String[WebSocketServerHandshaker13.lIIIllIlIlIlIl[13]])[WebSocketServerHandshaker13.lIIIllIlIlIlIl[0]] = llIIIlIIIlllIII("AjcCbw00MDItOTo3FW8RNCs=", "QRaBZ");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[1]] = llIIIlIIIlllIIl("7LS3pQCk8Hcd3e270+g8RZLOJYO2zsVeeWdrJzyhQtKRr2kOgtTCaA==", "vqpDM");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[2]] = llIIIlIIIlllIIl("tIDKa49vkt67HwGpB6rJEzaFp5/QAxdAnOl7tt8C5X52ZspRmMmWJg==", "CMWhH");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[3]] = llIIIlIIIlllIII("OjYFAQsOOAImRBs2FSENAj1HY1dNIAIgEgghRzoFAzcUOgUGNkc5ARRpRykZQXMVNxcdPAkhAVdzHC8=", "mSgRd");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[4]] = llIIIlIIIlllIlI("raNp5xOdm2k=", "WNvVR");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[5]] = llIIIlIIIlllIlI("oNkxSonUIhqQrL8dqcxvHw==", "BcbOf");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[6]] = llIIIlIIIlllIlI("2lS9a5+L/HgZO3a83tJQWA==", "OLahI");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[7]] = llIIIlIIIlllIlI("0a+C9IvOIUU=", "mzcPb");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[8]] = llIIIlIIIlllIII("BQ4Qeg8zCSA4Oz0OB3oZNQgWJyw=", "VksWX");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[9]] = llIIIlIIIlllIII("BgoGZjUwDTYkAT4KEWYyJwARJAE6Aw==", "UoeKb");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[10]] = llIIIlIIIlllIII("GAghOyA5GTUqZTkYMj43JRk/LSomRSNnZSQCJG42Px0gITc+CDR0ZTEQ", "JmPNE");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[11]] = llIIIlIIIlllIlI("llSKomeaTrKFulMVq1ggu2LkkwEpO7aE", "rRIRA");
        WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[12]] = llIIIlIIIlllIlI("vI03cG9U0qL0dyLxOToPtq6P5BYGlfySTpFy028QzEA+mY+F5pBttQ==", "HqKdU");
    }
    
    @Override
    protected FullHttpResponse newHandshakeResponse(final FullHttpRequest lllllllllllllIlIIIIIIIIlllIIIIII, final HttpHeaders lllllllllllllIlIIIIIIIIllIllllll) {
        final FullHttpResponse lllllllllllllIlIIIIIIIIlllIIIlll = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.SWITCHING_PROTOCOLS);
        if (llIIIlIIlIIIllI(lllllllllllllIlIIIIIIIIllIllllll)) {
            lllllllllllllIlIIIIIIIIlllIIIlll.headers().add(lllllllllllllIlIIIIIIIIllIllllll);
            "".length();
        }
        final String lllllllllllllIlIIIIIIIIlllIIIllI = lllllllllllllIlIIIIIIIIlllIIIIII.headers().get(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[0]]);
        if (llIIIlIIlIIIlll(lllllllllllllIlIIIIIIIIlllIIIllI)) {
            throw new WebSocketHandshakeException(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[1]]);
        }
        final String lllllllllllllIlIIIIIIIIlllIIIlIl = String.valueOf(new StringBuilder().append(lllllllllllllIlIIIIIIIIlllIIIllI).append(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[2]]));
        final byte[] lllllllllllllIlIIIIIIIIlllIIIlII = WebSocketUtil.sha1(lllllllllllllIlIIIIIIIIlllIIIlIl.getBytes(CharsetUtil.US_ASCII));
        final String lllllllllllllIlIIIIIIIIlllIIIIll = WebSocketUtil.base64(lllllllllllllIlIIIIIIIIlllIIIlII);
        if (llIIIlIIlIIlIII(WebSocketServerHandshaker13.logger.isDebugEnabled() ? 1 : 0)) {
            WebSocketServerHandshaker13.logger.debug(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[3]], lllllllllllllIlIIIIIIIIlllIIIllI, lllllllllllllIlIIIIIIIIlllIIIIll);
        }
        lllllllllllllIlIIIIIIIIlllIIIlll.headers().add(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[4]], WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[5]].toLowerCase());
        "".length();
        lllllllllllllIlIIIIIIIIlllIIIlll.headers().add(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[6]], WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[7]]);
        "".length();
        lllllllllllllIlIIIIIIIIlllIIIlll.headers().add(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[8]], lllllllllllllIlIIIIIIIIlllIIIIll);
        "".length();
        final String lllllllllllllIlIIIIIIIIlllIIIIlI = lllllllllllllIlIIIIIIIIlllIIIIII.headers().get(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[9]]);
        if (llIIIlIIlIIIllI(lllllllllllllIlIIIIIIIIlllIIIIlI)) {
            final String lllllllllllllIlIIIIIIIIlllIIlIll = this.selectSubprotocol(lllllllllllllIlIIIIIIIIlllIIIIlI);
            if (llIIIlIIlIIIlll(lllllllllllllIlIIIIIIIIlllIIlIll)) {
                if (llIIIlIIlIIlIII(WebSocketServerHandshaker13.logger.isDebugEnabled() ? 1 : 0)) {
                    WebSocketServerHandshaker13.logger.debug(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[10]], lllllllllllllIlIIIIIIIIlllIIIIlI);
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return null;
                    }
                }
            }
            else {
                lllllllllllllIlIIIIIIIIlllIIIlll.headers().add(WebSocketServerHandshaker13.lIIIllIlIlIIIl[WebSocketServerHandshaker13.lIIIllIlIlIlIl[11]], lllllllllllllIlIIIIIIIIlllIIlIll);
                "".length();
            }
        }
        return lllllllllllllIlIIIIIIIIlllIIIlll;
    }
    
    private static String llIIIlIIIlllIII(String lllllllllllllIlIIIIIIIIllIIlIlll, final String lllllllllllllIlIIIIIIIIllIIlIllI) {
        lllllllllllllIlIIIIIIIIllIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIIIIllIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIIIIllIIllIlI = new StringBuilder();
        final char[] lllllllllllllIlIIIIIIIIllIIllIIl = lllllllllllllIlIIIIIIIIllIIlIllI.toCharArray();
        int lllllllllllllIlIIIIIIIIllIIllIII = WebSocketServerHandshaker13.lIIIllIlIlIlIl[0];
        final byte lllllllllllllIlIIIIIIIIllIIlIIlI = (Object)lllllllllllllIlIIIIIIIIllIIlIlll.toCharArray();
        final long lllllllllllllIlIIIIIIIIllIIlIIIl = lllllllllllllIlIIIIIIIIllIIlIIlI.length;
        String lllllllllllllIlIIIIIIIIllIIlIIII = (String)WebSocketServerHandshaker13.lIIIllIlIlIlIl[0];
        while (llIIIlIIlIIlIIl((int)lllllllllllllIlIIIIIIIIllIIlIIII, (int)lllllllllllllIlIIIIIIIIllIIlIIIl)) {
            final char lllllllllllllIlIIIIIIIIllIIlllIl = lllllllllllllIlIIIIIIIIllIIlIIlI[lllllllllllllIlIIIIIIIIllIIlIIII];
            lllllllllllllIlIIIIIIIIllIIllIlI.append((char)(lllllllllllllIlIIIIIIIIllIIlllIl ^ lllllllllllllIlIIIIIIIIllIIllIIl[lllllllllllllIlIIIIIIIIllIIllIII % lllllllllllllIlIIIIIIIIllIIllIIl.length]));
            "".length();
            ++lllllllllllllIlIIIIIIIIllIIllIII;
            ++lllllllllllllIlIIIIIIIIllIIlIIII;
            "".length();
            if ((0x70 ^ 0x28 ^ (0x4C ^ 0x10)) != (15 + 111 + 26 + 30 ^ 84 + 165 - 211 + 140)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIIIIllIIllIlI);
    }
    
    private static String llIIIlIIIlllIlI(final String lllllllllllllIlIIIIIIIIllIIIIlll, final String lllllllllllllIlIIIIIIIIllIIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIIIllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIIIllIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIIIIIllIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIIIIIllIIIlIIl.init(WebSocketServerHandshaker13.lIIIllIlIlIlIl[2], lllllllllllllIlIIIIIIIIllIIIlIlI);
            return new String(lllllllllllllIlIIIIIIIIllIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIIIllIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIIIllIIIlIII) {
            lllllllllllllIlIIIIIIIIllIIIlIII.printStackTrace();
            return null;
        }
    }
    
    public WebSocketServerHandshaker13(final String lllllllllllllIlIIIIIIIIlllIllllI, final String lllllllllllllIlIIIIIIIIlllIllIII, final boolean lllllllllllllIlIIIIIIIIlllIlllII, final int lllllllllllllIlIIIIIIIIlllIllIll) {
        super(WebSocketVersion.V13, lllllllllllllIlIIIIIIIIlllIllllI, lllllllllllllIlIIIIIIIIlllIllIII, lllllllllllllIlIIIIIIIIlllIllIll);
        this.allowExtensions = lllllllllllllIlIIIIIIIIlllIlllII;
    }
    
    @Override
    protected WebSocketFrameDecoder newWebsocketDecoder() {
        return new WebSocket13FrameDecoder((boolean)(WebSocketServerHandshaker13.lIIIllIlIlIlIl[1] != 0), this.allowExtensions, this.maxFramePayloadLength());
    }
    
    private static boolean llIIIlIIlIIIlll(final Object lllllllllllllIlIIIIIIIIlIllllIlI) {
        return lllllllllllllIlIIIIIIIIlIllllIlI == null;
    }
    
    private static boolean llIIIlIIlIIlIIl(final int lllllllllllllIlIIIIIIIIlIlllllll, final int lllllllllllllIlIIIIIIIIlIllllllI) {
        return lllllllllllllIlIIIIIIIIlIlllllll < lllllllllllllIlIIIIIIIIlIllllllI;
    }
    
    private static boolean llIIIlIIlIIIllI(final Object lllllllllllllIlIIIIIIIIlIlllllII) {
        return lllllllllllllIlIIIIIIIIlIlllllII != null;
    }
    
    private static String llIIIlIIIlllIIl(final String lllllllllllllIlIIIIIIIIllIlIlIlI, final String lllllllllllllIlIIIIIIIIllIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIIIIIllIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIIIIIllIlIlIll.getBytes(StandardCharsets.UTF_8)), WebSocketServerHandshaker13.lIIIllIlIlIlIl[8]), "DES");
            final Cipher lllllllllllllIlIIIIIIIIllIlIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIIIIIIllIlIlllI.init(WebSocketServerHandshaker13.lIIIllIlIlIlIl[2], lllllllllllllIlIIIIIIIIllIlIllll);
            return new String(lllllllllllllIlIIIIIIIIllIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIIIIIllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIIIIIllIlIllIl) {
            lllllllllllllIlIIIIIIIIllIlIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected WebSocketFrameEncoder newWebSocketEncoder() {
        return new WebSocket13FrameEncoder((boolean)(WebSocketServerHandshaker13.lIIIllIlIlIlIl[0] != 0));
    }
}
