// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

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
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.FullHttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.internal.logging.InternalLogger;

public class WebSocketClientHandshaker08 extends WebSocketClientHandshaker
{
    private static final /* synthetic */ InternalLogger logger;
    private final /* synthetic */ boolean allowExtensions;
    private static final /* synthetic */ int[] lIlIlllIIIIIII;
    private static final /* synthetic */ String[] lIlIllIllllIll;
    private /* synthetic */ String expectedChallengeResponseString;
    
    static {
        llllIIlIllIIllI();
        llllIIlIlIlllll();
        MAGIC_GUID = WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[27]];
        logger = InternalLoggerFactory.getInstance(WebSocketClientHandshaker08.class);
    }
    
    @Override
    protected WebSocketFrameDecoder newWebsocketDecoder() {
        return new WebSocket08FrameDecoder((boolean)(WebSocketClientHandshaker08.lIlIlllIIIIIII[1] != 0), this.allowExtensions, this.maxFramePayloadLength());
    }
    
    private static boolean llllIIlIllIlIIl(final int lllllllllllllIIIIlIlllllllllllIl) {
        return lllllllllllllIIIIlIlllllllllllIl != 0;
    }
    
    private static boolean llllIIlIllIIlll(final Object lllllllllllllIIIIlIlllllllllllll) {
        return lllllllllllllIIIIlIlllllllllllll != null;
    }
    
    private static String llllIIlIlIlIlll(String lllllllllllllIIIIllIIIIIIIlIllII, final String lllllllllllllIIIIllIIIIIIIlIlIll) {
        lllllllllllllIIIIllIIIIIIIlIllII = new String(Base64.getDecoder().decode(lllllllllllllIIIIllIIIIIIIlIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIIIIIIIlIlIlI = new StringBuilder();
        final char[] lllllllllllllIIIIllIIIIIIIlIlIIl = lllllllllllllIIIIllIIIIIIIlIlIll.toCharArray();
        int lllllllllllllIIIIllIIIIIIIlIlIII = WebSocketClientHandshaker08.lIlIlllIIIIIII[1];
        final char lllllllllllllIIIIllIIIIIIIlIIIlI = (Object)lllllllllllllIIIIllIIIIIIIlIllII.toCharArray();
        final byte lllllllllllllIIIIllIIIIIIIlIIIIl = (byte)lllllllllllllIIIIllIIIIIIIlIIIlI.length;
        byte lllllllllllllIIIIllIIIIIIIlIIIII = (byte)WebSocketClientHandshaker08.lIlIlllIIIIIII[1];
        while (llllIIlIllIlIll(lllllllllllllIIIIllIIIIIIIlIIIII, lllllllllllllIIIIllIIIIIIIlIIIIl)) {
            final char lllllllllllllIIIIllIIIIIIIlIllIl = lllllllllllllIIIIllIIIIIIIlIIIlI[lllllllllllllIIIIllIIIIIIIlIIIII];
            lllllllllllllIIIIllIIIIIIIlIlIlI.append((char)(lllllllllllllIIIIllIIIIIIIlIllIl ^ lllllllllllllIIIIllIIIIIIIlIlIIl[lllllllllllllIIIIllIIIIIIIlIlIII % lllllllllllllIIIIllIIIIIIIlIlIIl.length]));
            "".length();
            ++lllllllllllllIIIIllIIIIIIIlIlIII;
            ++lllllllllllllIIIIllIIIIIIIlIIIII;
            "".length();
            if (((0xA9 ^ 0x96 ^ (0x43 ^ 0x2D)) & (0xA3 ^ 0x96 ^ (0x58 ^ 0x3C) ^ -" ".length())) != ((0xE6 ^ 0xAD ^ (0xEE ^ 0xBF)) & (137 + 53 - 69 + 55 ^ 78 + 45 + 7 + 40 ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIIIIIIIlIlIlI);
    }
    
    @Override
    protected void verify(final FullHttpResponse lllllllllllllIIIIllIIIIIIlIIlllI) {
        final HttpResponseStatus lllllllllllllIIIIllIIIIIIlIIllII = HttpResponseStatus.SWITCHING_PROTOCOLS;
        final HttpHeaders lllllllllllllIIIIllIIIIIIlIIlIlI = lllllllllllllIIIIllIIIIIIlIIlllI.headers();
        if (llllIIlIllIlIII(lllllllllllllIIIIllIIIIIIlIIlllI.getStatus().equals(lllllllllllllIIIIllIIIIIIlIIllII) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[19]]).append(lllllllllllllIIIIllIIIIIIlIIlllI.getStatus())));
        }
        final String lllllllllllllIIIIllIIIIIIlIIlIII = lllllllllllllIIIIllIIIIIIlIIlIlI.get(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[20]]);
        if (llllIIlIllIlIII(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[2]].equalsIgnoreCase(lllllllllllllIIIIllIIIIIIlIIlIII) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[21]]).append(lllllllllllllIIIIllIIIIIIlIIlIII)));
        }
        final String lllllllllllllIIIIllIIIIIIlIIIlll = lllllllllllllIIIIllIIIIIIlIIlIlI.get(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[22]]);
        if (llllIIlIllIlIII(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[23]].equalsIgnoreCase(lllllllllllllIIIIllIIIIIIlIIIlll) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[24]]).append(lllllllllllllIIIIllIIIIIIlIIIlll)));
        }
        final String lllllllllllllIIIIllIIIIIIlIIIlIl = lllllllllllllIIIIllIIIIIIlIIlIlI.get(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[25]]);
        if (!llllIIlIllIIlll(lllllllllllllIIIIllIIIIIIlIIIlIl) || llllIIlIllIlIII(lllllllllllllIIIIllIIIIIIlIIIlIl.equals(this.expectedChallengeResponseString) ? 1 : 0)) {
            final String format = WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[26]];
            final Object[] args = new Object[WebSocketClientHandshaker08.lIlIlllIIIIIII[4]];
            args[WebSocketClientHandshaker08.lIlIlllIIIIIII[1]] = lllllllllllllIIIIllIIIIIIlIIIlIl;
            args[WebSocketClientHandshaker08.lIlIlllIIIIIII[3]] = this.expectedChallengeResponseString;
            throw new WebSocketHandshakeException(String.format(format, args));
        }
    }
    
    private static boolean llllIIlIllIlIII(final int lllllllllllllIIIIlIllllllllllIll) {
        return lllllllllllllIIIIlIllllllllllIll == 0;
    }
    
    @Override
    protected WebSocketFrameEncoder newWebSocketEncoder() {
        return new WebSocket08FrameEncoder((boolean)(WebSocketClientHandshaker08.lIlIlllIIIIIII[3] != 0));
    }
    
    private static void llllIIlIlIlllll() {
        (lIlIllIllllIll = new String[WebSocketClientHandshaker08.lIlIlllIIIIIII[28]])[WebSocketClientHandshaker08.lIlIlllIIIIIII[1]] = llllIIlIlIlIlll("ZQ==", "JbqgC");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[3]] = llllIIlIlIllIII("IOnw9RUf6SVfa0RRobWw5JdcYnlXDmXMiQjZqhjB9L3Ua4kLMjztFg==", "SPFHg");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[4]] = llllIIlIlIlIlll("EhARFSwmHhYyYzMQATUqKhtTdntlFh8vJisBUy4iKxEALiIuEFMtJjxPUz0+aVUWPjMgFgcjJ2UHFjUzKhsAI3llDg4=", "EusFC");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[5]] = llllIIlIlIllIIl("gHkKduzol9M=", "bNEhO");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[6]] = llllIIlIlIllIIl("aCAktQXCIxXK/+0RsRKwuA==", "UbDFN");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[7]] = llllIIlIlIllIII("p2fttvGym57IrWN8xd0ouQ==", "usKLP");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[8]] = llllIIlIlIllIIl("DAKjIsJG4O4=", "hvSXq");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[9]] = llllIIlIlIlIlll("KhcnWz4cEBcZChIXMFsiHAs=", "yrDvi");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[10]] = llllIIlIlIlIlll("Ch0+IA==", "BrMTJ");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[11]] = llllIIlIlIlIlll("Jh84EVhhRA==", "NkLab");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[15]] = llllIIlIlIlIlll("GgwZdT0sCyk3CSIMDnUlOwAdMQQ=", "IizXj");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[16]] = llllIIlIlIllIII("KNWXOk5kicZqvJ9am26M9452evHeFHQ1", "VRkhK");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[17]] = llllIIlIlIllIIl("FYW6ti39oJ2MrJIJEtuN9iXII3g9Vd3U", "kxsWG");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[18]] = llllIIlIlIllIIl("ow+2xBad7tQ=", "jkgUi");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[19]] = llllIIlIlIlIlll("Pg0jOCMeB3UxLhkHJjEuHAZ1KyoEEzo3PBJDMjw7JBc0LToEWXU=", "wcUYO");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[20]] = llllIIlIlIllIIl("hndIKoRhhuU=", "qxsHE");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[2]] = llllIIlIlIllIII("eHofn553eQRfBWzoAvwY3A==", "vkXTH");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[21]] = llllIIlIlIllIII("L3+7riEzJO61f84k2IC1gs4+BiuUOsyfNfTSzYYEVN92tYqqTl+48A==", "tUPKt");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[22]] = llllIIlIlIlIlll("Aj4gLzIiJScuOQ==", "AQNAW");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[23]] = llllIIlIlIlIlll("OjYENDsLIw==", "oFcFZ");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[24]] = llllIIlIlIlIlll("OSc6Cj4ZLWwDMx4tPwMzGyxsGTcDOSMFIRVpLwQ8HiwvHzsfJ3ZL", "pILkR");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[25]] = llllIIlIlIlIlll("ICwKYDwWKzoiCBgsHWAqECoMPR8=", "sIiMk");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[26]] = llllIIlIlIlIlll("JAMQFAIECUYWBgwBChAACghIVS8OGRMUAldNQwZATSgeBQsOGQMRVE1IFQ==", "mmfun");
        WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[27]] = llllIIlIlIlIlll("SHd7MS48A3ZZKkNzd1lbTQYCWVZPAQJZLE8DAUQrOXp2Nl5L", "zBCto");
    }
    
    private static boolean llllIIlIllIlIlI(final int lllllllllllllIIIIlIllllllllllIII, final int lllllllllllllIIIIlIlllllllllIlll) {
        return lllllllllllllIIIIlIllllllllllIII != lllllllllllllIIIIlIlllllllllIlll;
    }
    
    private static boolean llllIIlIllIlIll(final int lllllllllllllIIIIllIIIIIIIIIIIlI, final int lllllllllllllIIIIllIIIIIIIIIIIIl) {
        return lllllllllllllIIIIllIIIIIIIIIIIlI < lllllllllllllIIIIllIIIIIIIIIIIIl;
    }
    
    private static String llllIIlIlIllIII(final String lllllllllllllIIIIllIIIIIIIIlIlIl, final String lllllllllllllIIIIllIIIIIIIIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIIIIIIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIIIIIIIlIllI.getBytes(StandardCharsets.UTF_8)), WebSocketClientHandshaker08.lIlIlllIIIIIII[10]), "DES");
            final Cipher lllllllllllllIIIIllIIIIIIIIllIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIllIIIIIIIIllIIl.init(WebSocketClientHandshaker08.lIlIlllIIIIIII[4], lllllllllllllIIIIllIIIIIIIIllIlI);
            return new String(lllllllllllllIIIIllIIIIIIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIIIIIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIIIIIIIllIII) {
            lllllllllllllIIIIllIIIIIIIIllIII.printStackTrace();
            return null;
        }
    }
    
    private static String llllIIlIlIllIIl(final String lllllllllllllIIIIllIIIIIIIIIlIII, final String lllllllllllllIIIIllIIIIIIIIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIIIIIIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIIIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIIIIIIIIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIIIIIIIIIllII.init(WebSocketClientHandshaker08.lIlIlllIIIIIII[4], lllllllllllllIIIIllIIIIIIIIIllIl);
            return new String(lllllllllllllIIIIllIIIIIIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIIIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIIIIIIIIlIll) {
            lllllllllllllIIIIllIIIIIIIIIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected FullHttpRequest newHandshakeRequest() {
        final URI lllllllllllllIIIIllIIIIIlIIIlllI = this.uri();
        String lllllllllllllIIIIllIIIIIlIIIlIll = lllllllllllllIIIIllIIIIIlIIIlllI.getPath();
        if (llllIIlIllIIlll(lllllllllllllIIIIllIIIIIlIIIlllI.getQuery()) && llllIIlIllIlIII(lllllllllllllIIIIllIIIIIlIIIlllI.getQuery().isEmpty() ? 1 : 0)) {
            lllllllllllllIIIIllIIIIIlIIIlIll = String.valueOf(new StringBuilder().append(lllllllllllllIIIIllIIIIIlIIIlllI.getPath()).append((char)WebSocketClientHandshaker08.lIlIlllIIIIIII[0]).append(lllllllllllllIIIIllIIIIIlIIIlllI.getQuery()));
        }
        if (!llllIIlIllIIlll(lllllllllllllIIIIllIIIIIlIIIlIll) || llllIIlIllIlIIl(lllllllllllllIIIIllIIIIIlIIIlIll.isEmpty() ? 1 : 0)) {
            lllllllllllllIIIIllIIIIIlIIIlIll = WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[1]];
        }
        final byte[] lllllllllllllIIIIllIIIIIlIIIlIIl = WebSocketUtil.randomBytes(WebSocketClientHandshaker08.lIlIlllIIIIIII[2]);
        final String lllllllllllllIIIIllIIIIIlIIIIlll = WebSocketUtil.base64(lllllllllllllIIIIllIIIIIlIIIlIIl);
        final String lllllllllllllIIIIllIIIIIlIIIIlIl = String.valueOf(new StringBuilder().append(lllllllllllllIIIIllIIIIIlIIIIlll).append(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[3]]));
        final byte[] lllllllllllllIIIIllIIIIIlIIIIlII = WebSocketUtil.sha1(lllllllllllllIIIIllIIIIIlIIIIlIl.getBytes(CharsetUtil.US_ASCII));
        this.expectedChallengeResponseString = WebSocketUtil.base64(lllllllllllllIIIIllIIIIIlIIIIlII);
        if (llllIIlIllIlIIl(WebSocketClientHandshaker08.logger.isDebugEnabled() ? 1 : 0)) {
            WebSocketClientHandshaker08.logger.debug(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[4]], lllllllllllllIIIIllIIIIIlIIIIlll, this.expectedChallengeResponseString);
        }
        final FullHttpRequest lllllllllllllIIIIllIIIIIlIIIIIlI = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, lllllllllllllIIIIllIIIIIlIIIlIll);
        final HttpHeaders lllllllllllllIIIIllIIIIIlIIIIIIl = lllllllllllllIIIIllIIIIIlIIIIIlI.headers();
        lllllllllllllIIIIllIIIIIlIIIIIIl.add(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[5]], WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[6]].toLowerCase()).add(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[7]], WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[8]]).add(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[9]], lllllllllllllIIIIllIIIIIlIIIIlll).add(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[10]], lllllllllllllIIIIllIIIIIlIIIlllI.getHost());
        "".length();
        final int lllllllllllllIIIIllIIIIIIlllllll = lllllllllllllIIIIllIIIIIlIIIlllI.getPort();
        String lllllllllllllIIIIllIIIIIIlllllIl = String.valueOf(new StringBuilder().append(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[11]]).append(lllllllllllllIIIIllIIIIIlIIIlllI.getHost()));
        if (llllIIlIllIlIlI(lllllllllllllIIIIllIIIIIIlllllll, WebSocketClientHandshaker08.lIlIlllIIIIIII[12]) && llllIIlIllIlIlI(lllllllllllllIIIIllIIIIIIlllllll, WebSocketClientHandshaker08.lIlIlllIIIIIII[13])) {
            lllllllllllllIIIIllIIIIIIlllllIl = String.valueOf(new StringBuilder().append(lllllllllllllIIIIllIIIIIIlllllIl).append((char)WebSocketClientHandshaker08.lIlIlllIIIIIII[14]).append(lllllllllllllIIIIllIIIIIIlllllll));
        }
        lllllllllllllIIIIllIIIIIlIIIIIIl.add(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[15]], lllllllllllllIIIIllIIIIIIlllllIl);
        "".length();
        final String lllllllllllllIIIIllIIIIIIllllIll = this.expectedSubprotocol();
        if (llllIIlIllIIlll(lllllllllllllIIIIllIIIIIIllllIll) && llllIIlIllIlIII(lllllllllllllIIIIllIIIIIIllllIll.isEmpty() ? 1 : 0)) {
            lllllllllllllIIIIllIIIIIlIIIIIIl.add(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[16]], lllllllllllllIIIIllIIIIIIllllIll);
            "".length();
        }
        lllllllllllllIIIIllIIIIIlIIIIIIl.add(WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[17]], WebSocketClientHandshaker08.lIlIllIllllIll[WebSocketClientHandshaker08.lIlIlllIIIIIII[18]]);
        "".length();
        if (llllIIlIllIIlll(this.customHeaders)) {
            lllllllllllllIIIIllIIIIIlIIIIIIl.add(this.customHeaders);
            "".length();
        }
        return lllllllllllllIIIIllIIIIIlIIIIIlI;
    }
    
    private static void llllIIlIllIIllI() {
        (lIlIlllIIIIIII = new int[29])[0] = (0x43 ^ 0x7C);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[1] = ((154 + 31 - 110 + 95 ^ 58 + 57 - 20 + 45) & ("  ".length() ^ (0x85 ^ 0xA1) ^ -" ".length()));
        WebSocketClientHandshaker08.lIlIlllIIIIIII[2] = (93 + 83 - 130 + 130 ^ 80 + 9 + 69 + 2);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[3] = " ".length();
        WebSocketClientHandshaker08.lIlIlllIIIIIII[4] = "  ".length();
        WebSocketClientHandshaker08.lIlIlllIIIIIII[5] = "   ".length();
        WebSocketClientHandshaker08.lIlIlllIIIIIII[6] = (0xB9 ^ 0xBD);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[7] = (0x1B ^ 0x1E);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[8] = (0x5A ^ 0x5C);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[9] = (40 + 109 - 23 + 25 ^ 93 + 36 - 0 + 15);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[10] = (0x5D ^ 0x4C ^ (0x3C ^ 0x25));
        WebSocketClientHandshaker08.lIlIlllIIIIIII[11] = (0x79 ^ 0xC ^ (0x72 ^ 0xE));
        WebSocketClientHandshaker08.lIlIlllIIIIIII[12] = (23 + 62 - 13 + 170 ^ 87 + 18 - 85 + 142);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[13] = (-(0xFFFFBEFF & 0x6945) & (0xFFFFEFFF & 0x39FF));
        WebSocketClientHandshaker08.lIlIlllIIIIIII[14] = (0x64 ^ 0x4E ^ (0x1E ^ 0xE));
        WebSocketClientHandshaker08.lIlIlllIIIIIII[15] = (0x40 ^ 0x4A);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[16] = (0xB1 ^ 0xBA);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[17] = (0x2B ^ 0x27);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[18] = (0x4B ^ 0x5E ^ (0x5F ^ 0x47));
        WebSocketClientHandshaker08.lIlIlllIIIIIII[19] = (0xB3 ^ 0xBD);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[20] = (134 + 133 - 184 + 91 ^ 70 + 72 - 11 + 30);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[21] = (0xBE ^ 0xAF);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[22] = (0x4C ^ 0x5E);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[23] = (0xB7 ^ 0xA4);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[24] = (0x9A ^ 0x8E);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[25] = (0x3D ^ 0x28);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[26] = (0x9 ^ 0x1F);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[27] = (4 + 172 - 104 + 112 ^ 155 + 103 - 184 + 101);
        WebSocketClientHandshaker08.lIlIlllIIIIIII[28] = (0x31 ^ 0x29);
    }
    
    public WebSocketClientHandshaker08(final URI lllllllllllllIIIIllIIIIIlIllIlll, final WebSocketVersion lllllllllllllIIIIllIIIIIlIllIllI, final String lllllllllllllIIIIllIIIIIlIllllIl, final boolean lllllllllllllIIIIllIIIIIlIllIlII, final HttpHeaders lllllllllllllIIIIllIIIIIlIlllIlI, final int lllllllllllllIIIIllIIIIIlIlllIIl) {
        super(lllllllllllllIIIIllIIIIIlIllIlll, lllllllllllllIIIIllIIIIIlIllIllI, lllllllllllllIIIIllIIIIIlIllllIl, lllllllllllllIIIIllIIIIIlIlllIlI, lllllllllllllIIIIllIIIIIlIlllIIl);
        this.allowExtensions = lllllllllllllIIIIllIIIIIlIllIlII;
    }
}
