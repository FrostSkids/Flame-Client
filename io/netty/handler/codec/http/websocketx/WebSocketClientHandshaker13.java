// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;
import io.netty.handler.codec.http.FullHttpRequest;
import java.util.Arrays;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.net.URI;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.util.internal.logging.InternalLogger;

public class WebSocketClientHandshaker13 extends WebSocketClientHandshaker
{
    private static final /* synthetic */ int[] llllIlIlIllIl;
    private /* synthetic */ String expectedChallengeResponseString;
    private final /* synthetic */ boolean allowExtensions;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ String[] llllIlIIIllII;
    
    private static boolean lIlIlIlIlIIllII(final int lllllllllllllIlIllIlIllllllIllll, final int lllllllllllllIlIllIlIllllllIlllI) {
        return lllllllllllllIlIllIlIllllllIllll < lllllllllllllIlIllIlIllllllIlllI;
    }
    
    private static boolean lIlIlIlIlIIlIlI(final int lllllllllllllIlIllIlIlllllllIIll, final int lllllllllllllIlIllIlIlllllllIIlI) {
        return lllllllllllllIlIllIlIlllllllIIll == lllllllllllllIlIllIlIlllllllIIlI;
    }
    
    @Override
    protected void verify(final FullHttpResponse lllllllllllllIlIllIllIIIIIllIIIl) {
        final HttpResponseStatus lllllllllllllIlIllIllIIIIIllIlll = HttpResponseStatus.SWITCHING_PROTOCOLS;
        final HttpHeaders lllllllllllllIlIllIllIIIIIllIllI = lllllllllllllIlIllIllIIIIIllIIIl.headers();
        if (lIlIlIlIlIIlIII(lllllllllllllIlIllIllIIIIIllIIIl.getStatus().equals(lllllllllllllIlIllIllIIIIIllIlll) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[21]]).append(lllllllllllllIlIllIllIIIIIllIIIl.getStatus())));
        }
        final String lllllllllllllIlIllIllIIIIIllIlIl = lllllllllllllIlIllIllIIIIIllIllI.get(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[2]]);
        if (lIlIlIlIlIIlIII(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[22]].equalsIgnoreCase(lllllllllllllIlIllIllIIIIIllIlIl) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[23]]).append(lllllllllllllIlIllIllIIIIIllIlIl)));
        }
        final String lllllllllllllIlIllIllIIIIIllIlII = lllllllllllllIlIllIllIIIIIllIllI.get(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[24]]);
        if (lIlIlIlIlIIlIII(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[25]].equalsIgnoreCase(lllllllllllllIlIllIllIIIIIllIlII) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[26]]).append(lllllllllllllIlIllIllIIIIIllIlII)));
        }
        final String lllllllllllllIlIllIllIIIIIllIIll = lllllllllllllIlIllIllIIIIIllIllI.get(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[27]]);
        if (!lIlIlIlIlIIIlll(lllllllllllllIlIllIllIIIIIllIIll) || lIlIlIlIlIIlIII(lllllllllllllIlIllIllIIIIIllIIll.equals(this.expectedChallengeResponseString) ? 1 : 0)) {
            final String format = WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[28]];
            final Object[] args = new Object[WebSocketClientHandshaker13.llllIlIlIllIl[4]];
            args[WebSocketClientHandshaker13.llllIlIlIllIl[1]] = lllllllllllllIlIllIllIIIIIllIIll;
            args[WebSocketClientHandshaker13.llllIlIlIllIl[3]] = this.expectedChallengeResponseString;
            throw new WebSocketHandshakeException(String.format(format, args));
        }
    }
    
    public WebSocketClientHandshaker13(final URI lllllllllllllIlIllIllIIIIlllIIIl, final WebSocketVersion lllllllllllllIlIllIllIIIIllIlIIl, final String lllllllllllllIlIllIllIIIIllIlIII, final boolean lllllllllllllIlIllIllIIIIllIlllI, final HttpHeaders lllllllllllllIlIllIllIIIIllIIllI, final int lllllllllllllIlIllIllIIIIllIIlIl) {
        super(lllllllllllllIlIllIllIIIIlllIIIl, lllllllllllllIlIllIllIIIIllIlIIl, lllllllllllllIlIllIllIIIIllIlIII, lllllllllllllIlIllIllIIIIllIIllI, lllllllllllllIlIllIllIIIIllIIlIl);
        this.allowExtensions = lllllllllllllIlIllIllIIIIllIlllI;
    }
    
    private static boolean lIlIlIlIlIIlIIl(final int lllllllllllllIlIllIlIllllllIlIlI) {
        return lllllllllllllIlIllIlIllllllIlIlI != 0;
    }
    
    private static String lIlIlIIlllIllll(final String lllllllllllllIlIllIlIllllllllIIl, final String lllllllllllllIlIllIlIllllllllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIllllllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIllllllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlIlllllllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlIlllllllllIl.init(WebSocketClientHandshaker13.llllIlIlIllIl[4], lllllllllllllIlIllIlIllllllllllI);
            return new String(lllllllllllllIlIllIlIlllllllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIllllllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIlllllllllII) {
            lllllllllllllIlIllIlIlllllllllII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIlIlIlIIIllI();
        lIlIlIIllllIIll();
        MAGIC_GUID = WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[29]];
        logger = InternalLoggerFactory.getInstance(WebSocketClientHandshaker13.class);
    }
    
    private static void lIlIlIlIlIIIllI() {
        (llllIlIlIllIl = new int[31])[0] = (0x5 ^ 0x3A);
        WebSocketClientHandshaker13.llllIlIlIllIl[1] = ((0x39 ^ 0x4F ^ (0xCD ^ 0x9A)) & (0x66 ^ 0x0 ^ (0xEA ^ 0xAD) ^ -" ".length()));
        WebSocketClientHandshaker13.llllIlIlIllIl[2] = (0xE ^ 0x7D ^ (0x2D ^ 0x4E));
        WebSocketClientHandshaker13.llllIlIlIllIl[3] = " ".length();
        WebSocketClientHandshaker13.llllIlIlIllIl[4] = "  ".length();
        WebSocketClientHandshaker13.llllIlIlIllIl[5] = -" ".length();
        WebSocketClientHandshaker13.llllIlIlIllIl[6] = "   ".length();
        WebSocketClientHandshaker13.llllIlIlIllIl[7] = (-(0xFFFFF6CD & 0x2F77) & (0xFFFFE7FF & 0x3FFF));
        WebSocketClientHandshaker13.llllIlIlIllIl[8] = (221 + 200 - 404 + 220 ^ 51 + 37 + 9 + 92);
        WebSocketClientHandshaker13.llllIlIlIllIl[9] = (0x30 ^ 0x71 ^ (0x82 ^ 0xC7));
        WebSocketClientHandshaker13.llllIlIlIllIl[10] = (0x56 ^ 0x53);
        WebSocketClientHandshaker13.llllIlIlIllIl[11] = (0x5E ^ 0x58);
        WebSocketClientHandshaker13.llllIlIlIllIl[12] = (79 + 80 - 68 + 102 ^ 112 + 3 - 26 + 109);
        WebSocketClientHandshaker13.llllIlIlIllIl[13] = (0x91 ^ 0x99);
        WebSocketClientHandshaker13.llllIlIlIllIl[14] = (0x2E ^ 0x26 ^ " ".length());
        WebSocketClientHandshaker13.llllIlIlIllIl[15] = (0xB8 ^ 0x82);
        WebSocketClientHandshaker13.llllIlIlIllIl[16] = (0xBC ^ 0xB6);
        WebSocketClientHandshaker13.llllIlIlIllIl[17] = (0x47 ^ 0x6F ^ (0x5E ^ 0x7D));
        WebSocketClientHandshaker13.llllIlIlIllIl[18] = (0x43 ^ 0x4F);
        WebSocketClientHandshaker13.llllIlIlIllIl[19] = (26 + 76 + 45 + 23 ^ 33 + 105 + 5 + 24);
        WebSocketClientHandshaker13.llllIlIlIllIl[20] = (37 + 99 + 20 + 4 ^ 29 + 5 + 140 + 0);
        WebSocketClientHandshaker13.llllIlIlIllIl[21] = (0x9F ^ 0x90);
        WebSocketClientHandshaker13.llllIlIlIllIl[22] = (0xBB ^ 0xAA);
        WebSocketClientHandshaker13.llllIlIlIllIl[23] = (170 + 134 - 146 + 54 ^ 156 + 109 - 135 + 68);
        WebSocketClientHandshaker13.llllIlIlIllIl[24] = (0x47 ^ 0x54);
        WebSocketClientHandshaker13.llllIlIlIllIl[25] = (0x28 ^ 0x14 ^ (0xA9 ^ 0x81));
        WebSocketClientHandshaker13.llllIlIlIllIl[26] = (0x9 ^ 0x48 ^ (0x5C ^ 0x8));
        WebSocketClientHandshaker13.llllIlIlIllIl[27] = (1 + 31 + 110 + 21 ^ 91 + 110 - 123 + 103);
        WebSocketClientHandshaker13.llllIlIlIllIl[28] = (0xBF ^ 0xA8);
        WebSocketClientHandshaker13.llllIlIlIllIl[29] = (0xA6 ^ 0x9E ^ (0x43 ^ 0x63));
        WebSocketClientHandshaker13.llllIlIlIllIl[30] = (0xA9 ^ 0x86 ^ (0x99 ^ 0xAF));
    }
    
    private static void lIlIlIIllllIIll() {
        (llllIlIIIllII = new String[WebSocketClientHandshaker13.llllIlIlIllIl[30]])[WebSocketClientHandshaker13.llllIlIlIllIl[1]] = lIlIlIIlllIllIl("J89pMqEMYOE=", "ERtCR");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[3]] = lIlIlIIlllIlllI("Zl9gDjESK21mNW1bbGZEYy4ZZklhKRlmM2ErGns0F1JtCUFl", "TjXKp");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[4]] = lIlIlIIlllIlllI("PA8aJxUIAR0AWh0PCgcTBARYRUlLCRQdHwUeWBwbBQ4LHBsAD1gfHxJQWA8HR0odDAoOCQwRHksYHQcKBAQLEUBLEQU=", "kjxtz");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[6]] = lIlIlIIlllIllll("n4df99UpsMY=", "ZVjkS");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[9]] = lIlIlIIlllIllIl("OtVMR+CfQ/0=", "MsBDz");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[10]] = lIlIlIIlllIlllI("IzEwKQUXPzcO", "tTRzj");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[11]] = lIlIlIIlllIlllI("KgclGg0KHCIbBg==", "ihKth");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[12]] = lIlIlIIlllIlllI("LxI1GTIeBw==", "zbRkS");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[13]] = lIlIlIIlllIlllI("FS8EQRwjKDQDKC0vE0EAIzM=", "FJglK");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[14]] = lIlIlIIlllIllIl("d/vLvr1twgs=", "qJeJU");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[16]] = lIlIlIIlllIlllI("Hz06A31YZg==", "wINsG");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[17]] = lIlIlIIlllIllll("R7SgIUzrFxRVBk76IxRV1ZABCqcI8z2/", "AFVGQ");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[18]] = lIlIlIIlllIlllI("GCkJWzQuLjkZACApHlszOSMeGQAkIA==", "KLjvc");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[19]] = lIlIlIIlllIllIl("Meo8ShARFIQmL4pwNQwJksyaD+EBFpFL", "bXelw");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[20]] = lIlIlIIlllIllll("7vTHGduRfHo=", "wgnPr");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[21]] = lIlIlIIlllIllll("iAE92x68bvtAd5CX6WGzVcHQCuA5HnZha0Vb7G0Bnq/ELo4+LHOyFA==", "mrcxW");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[2]] = lIlIlIIlllIllll("MRdQ4zFulkk=", "OUWSv");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[22]] = lIlIlIIlllIllIl("A1TomiNK/X1J0B4Q32dhSg==", "nMiOS");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[23]] = lIlIlIIlllIllIl("w/s6TfpYnQDlWNZlI8QzTjjns3zkD0/C0z27TOrSuA95bOltPnc/Bg==", "CiXVW");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[24]] = lIlIlIIlllIllIl("Tq0rN5w/ZR4vXBcSSnzuWg==", "uKwsT");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[25]] = lIlIlIIlllIllIl("4yJpFVCjGw8=", "OGGmC");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[26]] = lIlIlIIlllIllIl("0jQSTR04IXPu91K99Uey6rsbcua4FuNOH0tvP3wimPN6KzofdOIgwQ==", "dkEJb");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[27]] = lIlIlIIlllIlllI("GDAFRC8uNzUGGyAwEkQ5KDYDGQw=", "KUfix");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[28]] = lIlIlIIlllIllll("56jFTABwElSf09mKmHolFg57uKjaTiuAFNv1+D77r1bP+/NfVjjuVYtxyo7M8zPL", "LSaDL");
        WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[29]] = lIlIlIIlllIlllI("eFphEDgMLmx4PHNebXhNfSsYeEB/LBh4On8uG2U9CVdsF0h7", "JoYUy");
    }
    
    private static String lIlIlIIlllIllIl(final String lllllllllllllIlIllIllIIIIIIIlIII, final String lllllllllllllIlIllIllIIIIIIIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIllIIIIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIllIIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), WebSocketClientHandshaker13.llllIlIlIllIl[13]), "DES");
            final Cipher lllllllllllllIlIllIllIIIIIIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIlIllIllIIIIIIIlIlI.init(WebSocketClientHandshaker13.llllIlIlIllIl[4], lllllllllllllIlIllIllIIIIIIIlIll);
            return new String(lllllllllllllIlIllIllIIIIIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIllIIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIllIIIIIIIlIIl) {
            lllllllllllllIlIllIllIIIIIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlIlIlIIlIII(final int lllllllllllllIlIllIlIllllllIlIII) {
        return lllllllllllllIlIllIlIllllllIlIII == 0;
    }
    
    @Override
    protected WebSocketFrameDecoder newWebsocketDecoder() {
        return new WebSocket13FrameDecoder((boolean)(WebSocketClientHandshaker13.llllIlIlIllIl[1] != 0), this.allowExtensions, this.maxFramePayloadLength());
    }
    
    @Override
    protected FullHttpRequest newHandshakeRequest() {
        final URI lllllllllllllIlIllIllIIIIlIlIlll = this.uri();
        String lllllllllllllIlIllIllIIIIlIlIllI = lllllllllllllIlIllIllIIIIlIlIlll.getPath();
        if (lIlIlIlIlIIIlll(lllllllllllllIlIllIllIIIIlIlIlll.getQuery()) && lIlIlIlIlIIlIII(lllllllllllllIlIllIllIIIIlIlIlll.getQuery().isEmpty() ? 1 : 0)) {
            lllllllllllllIlIllIllIIIIlIlIllI = String.valueOf(new StringBuilder().append(lllllllllllllIlIllIllIIIIlIlIlll.getPath()).append((char)WebSocketClientHandshaker13.llllIlIlIllIl[0]).append(lllllllllllllIlIllIllIIIIlIlIlll.getQuery()));
        }
        if (!lIlIlIlIlIIIlll(lllllllllllllIlIllIllIIIIlIlIllI) || lIlIlIlIlIIlIIl(lllllllllllllIlIllIllIIIIlIlIllI.isEmpty() ? 1 : 0)) {
            lllllllllllllIlIllIllIIIIlIlIllI = WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[1]];
        }
        final byte[] lllllllllllllIlIllIllIIIIlIlIlIl = WebSocketUtil.randomBytes(WebSocketClientHandshaker13.llllIlIlIllIl[2]);
        final String lllllllllllllIlIllIllIIIIlIlIlII = WebSocketUtil.base64(lllllllllllllIlIllIllIIIIlIlIlIl);
        final String lllllllllllllIlIllIllIIIIlIlIIll = String.valueOf(new StringBuilder().append(lllllllllllllIlIllIllIIIIlIlIlII).append(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[3]]));
        final byte[] lllllllllllllIlIllIllIIIIlIlIIlI = WebSocketUtil.sha1(lllllllllllllIlIllIllIIIIlIlIIll.getBytes(CharsetUtil.US_ASCII));
        this.expectedChallengeResponseString = WebSocketUtil.base64(lllllllllllllIlIllIllIIIIlIlIIlI);
        if (lIlIlIlIlIIlIIl(WebSocketClientHandshaker13.logger.isDebugEnabled() ? 1 : 0)) {
            WebSocketClientHandshaker13.logger.debug(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[4]], lllllllllllllIlIllIllIIIIlIlIlII, this.expectedChallengeResponseString);
        }
        int lllllllllllllIlIllIllIIIIlIlIIIl = lllllllllllllIlIllIllIIIIlIlIlll.getPort();
        if (lIlIlIlIlIIlIlI(lllllllllllllIlIllIllIIIIlIlIIIl, WebSocketClientHandshaker13.llllIlIlIllIl[5])) {
            if (lIlIlIlIlIIlIIl(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[6]].equals(lllllllllllllIlIllIllIIIIlIlIlll.getScheme()) ? 1 : 0)) {
                lllllllllllllIlIllIllIIIIlIlIIIl = WebSocketClientHandshaker13.llllIlIlIllIl[7];
                "".length();
                if (((0x6D ^ 0x69) & ~(0x20 ^ 0x24)) != 0x0) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIllIllIIIIlIlIIIl = WebSocketClientHandshaker13.llllIlIlIllIl[8];
            }
        }
        final FullHttpRequest lllllllllllllIlIllIllIIIIlIlIIII = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, lllllllllllllIlIllIllIIIIlIlIllI);
        final HttpHeaders lllllllllllllIlIllIllIIIIlIIllll = lllllllllllllIlIllIllIIIIlIlIIII.headers();
        lllllllllllllIlIllIllIIIIlIIllll.add(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[9]], WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[10]].toLowerCase()).add(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[11]], WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[12]]).add(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[13]], lllllllllllllIlIllIllIIIIlIlIlII).add(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[14]], String.valueOf(new StringBuilder().append(lllllllllllllIlIllIllIIIIlIlIlll.getHost()).append((char)WebSocketClientHandshaker13.llllIlIlIllIl[15]).append(lllllllllllllIlIllIllIIIIlIlIIIl)));
        "".length();
        String lllllllllllllIlIllIllIIIIlIIlllI = String.valueOf(new StringBuilder().append(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[16]]).append(lllllllllllllIlIllIllIIIIlIlIlll.getHost()));
        if (lIlIlIlIlIIlIll(lllllllllllllIlIllIllIIIIlIlIIIl, WebSocketClientHandshaker13.llllIlIlIllIl[8]) && lIlIlIlIlIIlIll(lllllllllllllIlIllIllIIIIlIlIIIl, WebSocketClientHandshaker13.llllIlIlIllIl[7])) {
            lllllllllllllIlIllIllIIIIlIIlllI = String.valueOf(new StringBuilder().append(lllllllllllllIlIllIllIIIIlIIlllI).append((char)WebSocketClientHandshaker13.llllIlIlIllIl[15]).append(lllllllllllllIlIllIllIIIIlIlIIIl));
        }
        lllllllllllllIlIllIllIIIIlIIllll.add(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[17]], lllllllllllllIlIllIllIIIIlIIlllI);
        "".length();
        final String lllllllllllllIlIllIllIIIIlIIllIl = this.expectedSubprotocol();
        if (lIlIlIlIlIIIlll(lllllllllllllIlIllIllIIIIlIIllIl) && lIlIlIlIlIIlIII(lllllllllllllIlIllIllIIIIlIIllIl.isEmpty() ? 1 : 0)) {
            lllllllllllllIlIllIllIIIIlIIllll.add(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[18]], lllllllllllllIlIllIllIIIIlIIllIl);
            "".length();
        }
        lllllllllllllIlIllIllIIIIlIIllll.add(WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[19]], WebSocketClientHandshaker13.llllIlIIIllII[WebSocketClientHandshaker13.llllIlIlIllIl[20]]);
        "".length();
        if (lIlIlIlIlIIIlll(this.customHeaders)) {
            lllllllllllllIlIllIllIIIIlIIllll.add(this.customHeaders);
            "".length();
        }
        return lllllllllllllIlIllIllIIIIlIlIIII;
    }
    
    private static String lIlIlIIlllIlllI(String lllllllllllllIlIllIllIIIIIIllIII, final String lllllllllllllIlIllIllIIIIIIlllII) {
        lllllllllllllIlIllIllIIIIIIllIII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIllIIIIIIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIllIIIIIIllIll = new StringBuilder();
        final char[] lllllllllllllIlIllIllIIIIIIllIlI = lllllllllllllIlIllIllIIIIIIlllII.toCharArray();
        int lllllllllllllIlIllIllIIIIIIllIIl = WebSocketClientHandshaker13.llllIlIlIllIl[1];
        final String lllllllllllllIlIllIllIIIIIIlIIll = (Object)((String)lllllllllllllIlIllIllIIIIIIllIII).toCharArray();
        final short lllllllllllllIlIllIllIIIIIIlIIlI = (short)lllllllllllllIlIllIllIIIIIIlIIll.length;
        long lllllllllllllIlIllIllIIIIIIlIIIl = WebSocketClientHandshaker13.llllIlIlIllIl[1];
        while (lIlIlIlIlIIllII((int)lllllllllllllIlIllIllIIIIIIlIIIl, lllllllllllllIlIllIllIIIIIIlIIlI)) {
            final char lllllllllllllIlIllIllIIIIIIllllI = lllllllllllllIlIllIllIIIIIIlIIll[lllllllllllllIlIllIllIIIIIIlIIIl];
            lllllllllllllIlIllIllIIIIIIllIll.append((char)(lllllllllllllIlIllIllIIIIIIllllI ^ lllllllllllllIlIllIllIIIIIIllIlI[lllllllllllllIlIllIllIIIIIIllIIl % lllllllllllllIlIllIllIIIIIIllIlI.length]));
            "".length();
            ++lllllllllllllIlIllIllIIIIIIllIIl;
            ++lllllllllllllIlIllIllIIIIIIlIIIl;
            "".length();
            if (((0x10 ^ 0x37 ^ (0x74 ^ 0x6B)) & (35 + 84 - 33 + 42 ^ 132 + 93 - 169 + 128 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIllIIIIIIllIll);
    }
    
    private static boolean lIlIlIlIlIIlIll(final int lllllllllllllIlIllIlIllllllIIlIl, final int lllllllllllllIlIllIlIllllllIIlII) {
        return lllllllllllllIlIllIlIllllllIIlIl != lllllllllllllIlIllIlIllllllIIlII;
    }
    
    private static boolean lIlIlIlIlIIIlll(final Object lllllllllllllIlIllIlIllllllIllII) {
        return lllllllllllllIlIllIlIllllllIllII != null;
    }
    
    @Override
    protected WebSocketFrameEncoder newWebSocketEncoder() {
        return new WebSocket13FrameEncoder((boolean)(WebSocketClientHandshaker13.llllIlIlIllIl[3] != 0));
    }
}
