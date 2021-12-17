// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import java.net.URI;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;
import io.netty.handler.codec.http.FullHttpRequest;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.logging.InternalLogger;

public class WebSocketClientHandshaker07 extends WebSocketClientHandshaker
{
    private static final /* synthetic */ int[] lllIIIlIllIlII;
    private static final /* synthetic */ String[] lllIIIlIllIIll;
    private static final /* synthetic */ InternalLogger logger;
    private /* synthetic */ String expectedChallengeResponseString;
    private final /* synthetic */ boolean allowExtensions;
    
    private static String lIIlllIllIIllIll(String llllllllllllIllIIIIIIlIIlllllIlI, final String llllllllllllIllIIIIIIlIIlllllllI) {
        llllllllllllIllIIIIIIlIIlllllIlI = new String(Base64.getDecoder().decode(llllllllllllIllIIIIIIlIIlllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIIIlIIllllllIl = new StringBuilder();
        final char[] llllllllllllIllIIIIIIlIIllllllII = llllllllllllIllIIIIIIlIIlllllllI.toCharArray();
        int llllllllllllIllIIIIIIlIIlllllIll = WebSocketClientHandshaker07.lllIIIlIllIlII[1];
        final float llllllllllllIllIIIIIIlIIllllIlIl = (Object)llllllllllllIllIIIIIIlIIlllllIlI.toCharArray();
        final char llllllllllllIllIIIIIIlIIllllIlII = (char)llllllllllllIllIIIIIIlIIllllIlIl.length;
        long llllllllllllIllIIIIIIlIIllllIIll = WebSocketClientHandshaker07.lllIIIlIllIlII[1];
        while (lIIlllIllIlIIlII((int)llllllllllllIllIIIIIIlIIllllIIll, llllllllllllIllIIIIIIlIIllllIlII)) {
            final char llllllllllllIllIIIIIIlIlIIIIIIII = llllllllllllIllIIIIIIlIIllllIlIl[llllllllllllIllIIIIIIlIIllllIIll];
            llllllllllllIllIIIIIIlIIllllllIl.append((char)(llllllllllllIllIIIIIIlIlIIIIIIII ^ llllllllllllIllIIIIIIlIIllllllII[llllllllllllIllIIIIIIlIIlllllIll % llllllllllllIllIIIIIIlIIllllllII.length]));
            "".length();
            ++llllllllllllIllIIIIIIlIIlllllIll;
            ++llllllllllllIllIIIIIIlIIllllIIll;
            "".length();
            if (" ".length() == (69 + 134 - 185 + 120 ^ 99 + 68 - 96 + 71)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIIIlIIllllllIl);
    }
    
    private static boolean lIIlllIllIlIIIIl(final int llllllllllllIllIIIIIIlIIllIllIll) {
        return llllllllllllIllIIIIIIlIIllIllIll == 0;
    }
    
    private static String lIIlllIllIIlllIl(final String llllllllllllIllIIIIIIlIIlllIlIlI, final String llllllllllllIllIIIIIIlIIlllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIlIIlllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIlIIlllIlIIl.getBytes(StandardCharsets.UTF_8)), WebSocketClientHandshaker07.lllIIIlIllIlII[10]), "DES");
            final Cipher llllllllllllIllIIIIIIlIIlllIllII = Cipher.getInstance("DES");
            llllllllllllIllIIIIIIlIIlllIllII.init(WebSocketClientHandshaker07.lllIIIlIllIlII[4], llllllllllllIllIIIIIIlIIlllIllIl);
            return new String(llllllllllllIllIIIIIIlIIlllIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIlIIlllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIlIIlllIlIll) {
            llllllllllllIllIIIIIIlIIlllIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected WebSocketFrameDecoder newWebsocketDecoder() {
        return new WebSocket07FrameDecoder((boolean)(WebSocketClientHandshaker07.lllIIIlIllIlII[1] != 0), this.allowExtensions, this.maxFramePayloadLength());
    }
    
    private static boolean lIIlllIllIlIIIII(final Object llllllllllllIllIIIIIIlIIllIlllll) {
        return llllllllllllIllIIIIIIlIIllIlllll != null;
    }
    
    private static boolean lIIlllIllIlIIIlI(final int llllllllllllIllIIIIIIlIIllIlllIl) {
        return llllllllllllIllIIIIIIlIIllIlllIl != 0;
    }
    
    @Override
    protected WebSocketFrameEncoder newWebSocketEncoder() {
        return new WebSocket07FrameEncoder((boolean)(WebSocketClientHandshaker07.lllIIIlIllIlII[3] != 0));
    }
    
    @Override
    protected FullHttpRequest newHandshakeRequest() {
        final URI llllllllllllIllIIIIIIlIlIlIIIllI = this.uri();
        String llllllllllllIllIIIIIIlIlIlIIIlIl = llllllllllllIllIIIIIIlIlIlIIIllI.getPath();
        if (lIIlllIllIlIIIII(llllllllllllIllIIIIIIlIlIlIIIllI.getQuery()) && lIIlllIllIlIIIIl(llllllllllllIllIIIIIIlIlIlIIIllI.getQuery().isEmpty() ? 1 : 0)) {
            llllllllllllIllIIIIIIlIlIlIIIlIl = String.valueOf(new StringBuilder().append(llllllllllllIllIIIIIIlIlIlIIIllI.getPath()).append((char)WebSocketClientHandshaker07.lllIIIlIllIlII[0]).append(llllllllllllIllIIIIIIlIlIlIIIllI.getQuery()));
        }
        if (!lIIlllIllIlIIIII(llllllllllllIllIIIIIIlIlIlIIIlIl) || lIIlllIllIlIIIlI(llllllllllllIllIIIIIIlIlIlIIIlIl.isEmpty() ? 1 : 0)) {
            llllllllllllIllIIIIIIlIlIlIIIlIl = WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[1]];
        }
        final byte[] llllllllllllIllIIIIIIlIlIlIIIlII = WebSocketUtil.randomBytes(WebSocketClientHandshaker07.lllIIIlIllIlII[2]);
        final String llllllllllllIllIIIIIIlIlIlIIIIll = WebSocketUtil.base64(llllllllllllIllIIIIIIlIlIlIIIlII);
        final String llllllllllllIllIIIIIIlIlIlIIIIlI = String.valueOf(new StringBuilder().append(llllllllllllIllIIIIIIlIlIlIIIIll).append(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[3]]));
        final byte[] llllllllllllIllIIIIIIlIlIlIIIIIl = WebSocketUtil.sha1(llllllllllllIllIIIIIIlIlIlIIIIlI.getBytes(CharsetUtil.US_ASCII));
        this.expectedChallengeResponseString = WebSocketUtil.base64(llllllllllllIllIIIIIIlIlIlIIIIIl);
        if (lIIlllIllIlIIIlI(WebSocketClientHandshaker07.logger.isDebugEnabled() ? 1 : 0)) {
            WebSocketClientHandshaker07.logger.debug(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[4]], llllllllllllIllIIIIIIlIlIlIIIIll, this.expectedChallengeResponseString);
        }
        final FullHttpRequest llllllllllllIllIIIIIIlIlIlIIIIII = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, llllllllllllIllIIIIIIlIlIlIIIlIl);
        final HttpHeaders llllllllllllIllIIIIIIlIlIIllllll = llllllllllllIllIIIIIIlIlIlIIIIII.headers();
        llllllllllllIllIIIIIIlIlIIllllll.add(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[5]], WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[6]].toLowerCase()).add(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[7]], WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[8]]).add(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[9]], llllllllllllIllIIIIIIlIlIlIIIIll).add(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[10]], llllllllllllIllIIIIIIlIlIlIIIllI.getHost());
        "".length();
        final int llllllllllllIllIIIIIIlIlIIlllllI = llllllllllllIllIIIIIIlIlIlIIIllI.getPort();
        String llllllllllllIllIIIIIIlIlIIllllIl = String.valueOf(new StringBuilder().append(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[11]]).append(llllllllllllIllIIIIIIlIlIlIIIllI.getHost()));
        if (lIIlllIllIlIIIll(llllllllllllIllIIIIIIlIlIIlllllI, WebSocketClientHandshaker07.lllIIIlIllIlII[12]) && lIIlllIllIlIIIll(llllllllllllIllIIIIIIlIlIIlllllI, WebSocketClientHandshaker07.lllIIIlIllIlII[13])) {
            llllllllllllIllIIIIIIlIlIIllllIl = String.valueOf(new StringBuilder().append(llllllllllllIllIIIIIIlIlIIllllIl).append((char)WebSocketClientHandshaker07.lllIIIlIllIlII[14]).append(llllllllllllIllIIIIIIlIlIIlllllI));
        }
        llllllllllllIllIIIIIIlIlIIllllll.add(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[15]], llllllllllllIllIIIIIIlIlIIllllIl);
        "".length();
        final String llllllllllllIllIIIIIIlIlIIllllII = this.expectedSubprotocol();
        if (lIIlllIllIlIIIII(llllllllllllIllIIIIIIlIlIIllllII) && lIIlllIllIlIIIIl(llllllllllllIllIIIIIIlIlIIllllII.isEmpty() ? 1 : 0)) {
            llllllllllllIllIIIIIIlIlIIllllll.add(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[16]], llllllllllllIllIIIIIIlIlIIllllII);
            "".length();
        }
        llllllllllllIllIIIIIIlIlIIllllll.add(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[17]], WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[18]]);
        "".length();
        if (lIIlllIllIlIIIII(this.customHeaders)) {
            llllllllllllIllIIIIIIlIlIIllllll.add(this.customHeaders);
            "".length();
        }
        return llllllllllllIllIIIIIIlIlIlIIIIII;
    }
    
    private static boolean lIIlllIllIlIIIll(final int llllllllllllIllIIIIIIlIIllIllIII, final int llllllllllllIllIIIIIIlIIllIlIlll) {
        return llllllllllllIllIIIIIIlIIllIllIII != llllllllllllIllIIIIIIlIIllIlIlll;
    }
    
    @Override
    protected void verify(final FullHttpResponse llllllllllllIllIIIIIIlIlIIlIIIII) {
        final HttpResponseStatus llllllllllllIllIIIIIIlIlIIlIIllI = HttpResponseStatus.SWITCHING_PROTOCOLS;
        final HttpHeaders llllllllllllIllIIIIIIlIlIIlIIlIl = llllllllllllIllIIIIIIlIlIIlIIIII.headers();
        if (lIIlllIllIlIIIIl(llllllllllllIllIIIIIIlIlIIlIIIII.getStatus().equals(llllllllllllIllIIIIIIlIlIIlIIllI) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[19]]).append(llllllllllllIllIIIIIIlIlIIlIIIII.getStatus())));
        }
        final String llllllllllllIllIIIIIIlIlIIlIIlII = llllllllllllIllIIIIIIlIlIIlIIlIl.get(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[20]]);
        if (lIIlllIllIlIIIIl(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[2]].equalsIgnoreCase(llllllllllllIllIIIIIIlIlIIlIIlII) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[21]]).append(llllllllllllIllIIIIIIlIlIIlIIlII)));
        }
        final String llllllllllllIllIIIIIIlIlIIlIIIll = llllllllllllIllIIIIIIlIlIIlIIlIl.get(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[22]]);
        if (lIIlllIllIlIIIIl(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[23]].equalsIgnoreCase(llllllllllllIllIIIIIIlIlIIlIIIll) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[24]]).append(llllllllllllIllIIIIIIlIlIIlIIIll)));
        }
        final String llllllllllllIllIIIIIIlIlIIlIIIlI = llllllllllllIllIIIIIIlIlIIlIIlIl.get(WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[25]]);
        if (!lIIlllIllIlIIIII(llllllllllllIllIIIIIIlIlIIlIIIlI) || lIIlllIllIlIIIIl(llllllllllllIllIIIIIIlIlIIlIIIlI.equals(this.expectedChallengeResponseString) ? 1 : 0)) {
            final String format = WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[26]];
            final Object[] args = new Object[WebSocketClientHandshaker07.lllIIIlIllIlII[4]];
            args[WebSocketClientHandshaker07.lllIIIlIllIlII[1]] = llllllllllllIllIIIIIIlIlIIlIIIlI;
            args[WebSocketClientHandshaker07.lllIIIlIllIlII[3]] = this.expectedChallengeResponseString;
            throw new WebSocketHandshakeException(String.format(format, args));
        }
    }
    
    public WebSocketClientHandshaker07(final URI llllllllllllIllIIIIIIlIlIlIllIIl, final WebSocketVersion llllllllllllIllIIIIIIlIlIlIllIII, final String llllllllllllIllIIIIIIlIlIlIllllI, final boolean llllllllllllIllIIIIIIlIlIlIlIllI, final HttpHeaders llllllllllllIllIIIIIIlIlIlIlIlIl, final int llllllllllllIllIIIIIIlIlIlIlIlII) {
        super(llllllllllllIllIIIIIIlIlIlIllIIl, llllllllllllIllIIIIIIlIlIlIllIII, llllllllllllIllIIIIIIlIlIlIllllI, llllllllllllIllIIIIIIlIlIlIlIlIl, llllllllllllIllIIIIIIlIlIlIlIlII);
        this.allowExtensions = llllllllllllIllIIIIIIlIlIlIlIllI;
    }
    
    static {
        lIIlllIllIIlllll();
        lIIlllIllIIllllI();
        MAGIC_GUID = WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[27]];
        logger = InternalLoggerFactory.getInstance(WebSocketClientHandshaker07.class);
    }
    
    private static void lIIlllIllIIlllll() {
        (lllIIIlIllIlII = new int[29])[0] = (0xAC ^ 0x93);
        WebSocketClientHandshaker07.lllIIIlIllIlII[1] = (("   ".length() ^ (0x54 ^ 0x79)) & (0xA0 ^ 0x81 ^ (0x76 ^ 0x79) ^ -" ".length()));
        WebSocketClientHandshaker07.lllIIIlIllIlII[2] = (0x63 ^ 0x28 ^ (0xC2 ^ 0x99));
        WebSocketClientHandshaker07.lllIIIlIllIlII[3] = " ".length();
        WebSocketClientHandshaker07.lllIIIlIllIlII[4] = "  ".length();
        WebSocketClientHandshaker07.lllIIIlIllIlII[5] = "   ".length();
        WebSocketClientHandshaker07.lllIIIlIllIlII[6] = (0xB8 ^ 0xBC);
        WebSocketClientHandshaker07.lllIIIlIllIlII[7] = (0x7C ^ 0x1 ^ (0x62 ^ 0x1A));
        WebSocketClientHandshaker07.lllIIIlIllIlII[8] = (0x46 ^ 0x40);
        WebSocketClientHandshaker07.lllIIIlIllIlII[9] = (0x37 ^ 0x30);
        WebSocketClientHandshaker07.lllIIIlIllIlII[10] = (0x5D ^ 0x2C ^ (0x46 ^ 0x3F));
        WebSocketClientHandshaker07.lllIIIlIllIlII[11] = (155 + 173 - 258 + 113 ^ 128 + 26 - 112 + 148);
        WebSocketClientHandshaker07.lllIIIlIllIlII[12] = (0x55 ^ 0x5);
        WebSocketClientHandshaker07.lllIIIlIllIlII[13] = (0xFFFFD1FF & 0x2FBB);
        WebSocketClientHandshaker07.lllIIIlIllIlII[14] = (0xFD ^ 0xC7);
        WebSocketClientHandshaker07.lllIIIlIllIlII[15] = (0x3F ^ 0x35);
        WebSocketClientHandshaker07.lllIIIlIllIlII[16] = (0x1B ^ 0x10);
        WebSocketClientHandshaker07.lllIIIlIllIlII[17] = (181 + 107 - 113 + 11 ^ 115 + 93 - 128 + 102);
        WebSocketClientHandshaker07.lllIIIlIllIlII[18] = (0x3E ^ 0x1E ^ (0x7E ^ 0x53));
        WebSocketClientHandshaker07.lllIIIlIllIlII[19] = (0x2E ^ 0x1A ^ (0x9B ^ 0xA1));
        WebSocketClientHandshaker07.lllIIIlIllIlII[20] = (51 + 29 - 6 + 86 ^ 81 + 104 - 144 + 134);
        WebSocketClientHandshaker07.lllIIIlIllIlII[21] = (0xE0 ^ 0xBD ^ (0x3B ^ 0x77));
        WebSocketClientHandshaker07.lllIIIlIllIlII[22] = (0x72 ^ 0x61 ^ " ".length());
        WebSocketClientHandshaker07.lllIIIlIllIlII[23] = (0x85 ^ 0x96);
        WebSocketClientHandshaker07.lllIIIlIllIlII[24] = (0x5A ^ 0x44 ^ (0x6D ^ 0x67));
        WebSocketClientHandshaker07.lllIIIlIllIlII[25] = (0x63 ^ 0x76);
        WebSocketClientHandshaker07.lllIIIlIllIlII[26] = (0xD8 ^ 0xA6 ^ (0x69 ^ 0x1));
        WebSocketClientHandshaker07.lllIIIlIllIlII[27] = (0x6C ^ 0x28 ^ (0xCD ^ 0x9E));
        WebSocketClientHandshaker07.lllIIIlIllIlII[28] = (0x9D ^ 0xA2 ^ (0xB3 ^ 0x94));
    }
    
    private static String lIIlllIllIIlllII(final String llllllllllllIllIIIIIIlIlIIIIllIl, final String llllllllllllIllIIIIIIlIlIIIIllII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIlIlIIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIlIlIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIIlIlIIIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIIlIlIIIlIIIl.init(WebSocketClientHandshaker07.lllIIIlIllIlII[4], llllllllllllIllIIIIIIlIlIIIlIIlI);
            return new String(llllllllllllIllIIIIIIlIlIIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIlIlIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIlIlIIIlIIII) {
            llllllllllllIllIIIIIIlIlIIIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllIllIIllllI() {
        (lllIIIlIllIIll = new String[WebSocketClientHandshaker07.lllIIIlIllIlII[28]])[WebSocketClientHandshaker07.lllIIIlIllIlII[1]] = lIIlllIllIIllIll("YA==", "OEDyJ");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[3]] = lIIlllIllIIlllII("EkTjcEiw9HN7ifpvugNwBKbwrbD3HJF8bLSEL3gQaXlgQpH3UDwBTg==", "EjkRt");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[4]] = lIIlllIllIIllIll("PTIEKjwJPAMNcxwyFAo6BTlGSWRKNAoQNgQjRhEyBDMVETIBMkYSNhNtRgIuRncDASMPNBIcN0olAwojBTkVHGlKLBs=", "jWfyS");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[5]] = lIIlllIllIIlllIl("ncHyZCSuOd4=", "ZDLgP");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[6]] = lIIlllIllIIlllII("v9jcyv/o9NIv/uhJ0cV8ZQ==", "qPOoa");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[7]] = lIIlllIllIIllIll("KBcvGRYIDCgYHQ==", "kxAws");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[8]] = lIIlllIllIIllIll("LRgLNxccDQ==", "xhlEv");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[9]] = lIIlllIllIIllIll("JiEiaRUQJhIrIR4hNWkJED0=", "uDADB");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[10]] = lIIlllIllIIlllII("lMpxTDkQt64=", "TvQqC");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[11]] = lIIlllIllIIllIll("JTYRFVVibQ==", "MBeeo");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[15]] = lIIlllIllIIlllIl("X4f3gcs0a9T3rguE2BSd2+LuPBXIxA3E", "QSZig");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[16]] = lIIlllIllIIllIll("BDwyRAIyOwIGNjw8JUQFJTYlBjY4NQ==", "WYQiU");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[17]] = lIIlllIllIIllIll("AjYnTg00MRcMOTo2ME4MNCE3CjU/", "QSDcZ");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[18]] = lIIlllIllIIlllIl("m1eBuq7JpNc=", "iAJqd");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[19]] = lIIlllIllIIlllII("JeLSfwwyim2WAJaLAJAWx0XIOZu+FvWt60aze8WolU74Bu+Uz1T72w==", "hcOBF");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[20]] = lIIlllIllIIlllII("pGv8RdBHxoM=", "xnKCZ");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[2]] = lIIlllIllIIllIll("PwEVGDYLDxI/", "hdwKY");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[21]] = lIIlllIllIIllIll("KiYMFi4KLFofIw0sCR8jCC1aBScQOBUZMQZoDwclESkeEnhD", "cHzwB");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[22]] = lIIlllIllIIllIll("BR8vFhclBCgXHA==", "FpAxr");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[23]] = lIIlllIllIIllIll("HSU/FSYsMA==", "HUXgG");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[24]] = lIIlllIllIIlllII("nsteB8VaLzHhM7YybrSQHCEQKNgguu+uqOjFHmZtmKHHa+cKDsJ/Bg==", "uiaPP");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[25]] = lIIlllIllIIlllIl("ODBrh4D8gwumLe0Mq+fdBxqIBfHs1lge", "SpLIG");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[26]] = lIIlllIllIIlllIl("eRos2vU5klPr13W3+GEob+o8ga2loDqoWCs1EmahUtu/6VyA5WiYm41HMTh8nA1E", "SiXuV");
        WebSocketClientHandshaker07.lllIIIlIllIIll[WebSocketClientHandshaker07.lllIIIlIllIlII[27]] = lIIlllIllIIllIll("fnduPRgKA2NVHHVzYlVtewYXVWB5ARdVGnkDFEgdD3pjOmh9", "LBVxY");
    }
    
    private static boolean lIIlllIllIlIIlII(final int llllllllllllIllIIIIIIlIIlllIIIlI, final int llllllllllllIllIIIIIIlIIlllIIIIl) {
        return llllllllllllIllIIIIIIlIIlllIIIlI < llllllllllllIllIIIIIIlIIlllIIIIl;
    }
}
