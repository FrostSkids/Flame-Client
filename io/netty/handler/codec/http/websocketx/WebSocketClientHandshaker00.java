// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.buffer.Unpooled;
import java.nio.ByteBuffer;
import io.netty.handler.codec.http.FullHttpRequest;
import java.util.Arrays;
import io.netty.handler.codec.http.HttpHeaders;
import java.net.URI;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;

public class WebSocketClientHandshaker00 extends WebSocketClientHandshaker
{
    private static final /* synthetic */ int[] lIIlllIlIIllIl;
    private /* synthetic */ ByteBuf expectedChallengeResponseBytes;
    private static final /* synthetic */ String[] lIIlllIlIIlIlI;
    
    private static String insertRandomCharacters(String lllllllllllllIIlIIllllIllIlllllI) {
        final int lllllllllllllIIlIIllllIlllIIIIIl = WebSocketUtil.randomNumber(WebSocketClientHandshaker00.lIIlllIlIIllIl[0], WebSocketClientHandshaker00.lIIlllIlIIllIl[1]);
        final char[] lllllllllllllIIlIIllllIlllIIIIII = new char[lllllllllllllIIlIIllllIlllIIIIIl];
        int lllllllllllllIIlIIllllIllIllllll = WebSocketClientHandshaker00.lIIlllIlIIllIl[3];
        while (llIllIlllIlllIl(lllllllllllllIIlIIllllIllIllllll, lllllllllllllIIlIIllllIlllIIIIIl)) {
            final int lllllllllllllIIlIIllllIlllIIIlll = (int)(Math.random() * 126.0 + 33.0);
            if ((llIllIlllIlllIl(WebSocketClientHandshaker00.lIIlllIlIIllIl[27], lllllllllllllIIlIIllllIlllIIIlll) && !llIllIlllIllllI(lllllllllllllIIlIIllllIlllIIIlll, WebSocketClientHandshaker00.lIIlllIlIIllIl[28])) || (llIllIlllIlllIl(WebSocketClientHandshaker00.lIIlllIlIIllIl[14], lllllllllllllIIlIIllllIlllIIIlll) && llIllIlllIlllIl(lllllllllllllIIlIIllllIlllIIIlll, WebSocketClientHandshaker00.lIIlllIlIIllIl[29]))) {
                lllllllllllllIIlIIllllIlllIIIIII[lllllllllllllIIlIIllllIllIllllll] = (char)lllllllllllllIIlIIllllIlllIIIlll;
                ++lllllllllllllIIlIIllllIllIllllll;
            }
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        int lllllllllllllIIlIIllllIlllIIIIll = WebSocketClientHandshaker00.lIIlllIlIIllIl[3];
        while (llIllIlllIlllIl(lllllllllllllIIlIIllllIlllIIIIll, lllllllllllllIIlIIllllIlllIIIIIl)) {
            final int lllllllllllllIIlIIllllIlllIIIllI = WebSocketUtil.randomNumber(WebSocketClientHandshaker00.lIIlllIlIIllIl[3], ((String)lllllllllllllIIlIIllllIllIlllllI).length());
            final String lllllllllllllIIlIIllllIlllIIIlIl = ((String)lllllllllllllIIlIIllllIllIlllllI).substring(WebSocketClientHandshaker00.lIIlllIlIIllIl[3], lllllllllllllIIlIIllllIlllIIIllI);
            final String lllllllllllllIIlIIllllIlllIIIlII = ((String)lllllllllllllIIlIIllllIllIlllllI).substring(lllllllllllllIIlIIllllIlllIIIllI);
            lllllllllllllIIlIIllllIllIlllllI = String.valueOf(new StringBuilder().append(lllllllllllllIIlIIllllIlllIIIlIl).append(lllllllllllllIIlIIllllIlllIIIIII[lllllllllllllIIlIIllllIlllIIIIll]).append(lllllllllllllIIlIIllllIlllIIIlII));
            ++lllllllllllllIIlIIllllIlllIIIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return (String)lllllllllllllIIlIIllllIllIlllllI;
    }
    
    private static String llIllIlllIlIIIl(final String lllllllllllllIIlIIllllIllIIllIIl, final String lllllllllllllIIlIIllllIllIIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllllIllIIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllllIllIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIllllIllIIllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIllllIllIIllIll.init(WebSocketClientHandshaker00.lIIlllIlIIllIl[8], lllllllllllllIIlIIllllIllIIlllII);
            return new String(lllllllllllllIIlIIllllIllIIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllllIllIIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllllIllIIllIlI) {
            lllllllllllllIIlIIllllIllIIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIlllIllIlI(final int lllllllllllllIIlIIllllIlIllIIIIl) {
        return lllllllllllllIIlIIllllIlIllIIIIl == 0;
    }
    
    private static boolean llIllIlllIlllIl(final int lllllllllllllIIlIIllllIlIllIlIII, final int lllllllllllllIIlIIllllIlIllIIlll) {
        return lllllllllllllIIlIIllllIlIllIlIII < lllllllllllllIIlIIllllIlIllIIlll;
    }
    
    @Override
    protected WebSocketFrameDecoder newWebsocketDecoder() {
        return new WebSocket00FrameDecoder(this.maxFramePayloadLength());
    }
    
    private static boolean llIllIlllIllIll(final int lllllllllllllIIlIIllllIlIllIIIll) {
        return lllllllllllllIIlIIllllIlIllIIIll != 0;
    }
    
    private static String insertSpaces(String lllllllllllllIIlIIllllIllIlIlIlI, final int lllllllllllllIIlIIllllIllIlIlIIl) {
        int lllllllllllllIIlIIllllIllIlIllIl = WebSocketClientHandshaker00.lIIlllIlIIllIl[3];
        while (llIllIlllIlllIl(lllllllllllllIIlIIllllIllIlIllIl, lllllllllllllIIlIIllllIllIlIlIIl)) {
            final int lllllllllllllIIlIIllllIllIllIIII = WebSocketUtil.randomNumber(WebSocketClientHandshaker00.lIIlllIlIIllIl[0], ((String)lllllllllllllIIlIIllllIllIlIlIlI).length() - WebSocketClientHandshaker00.lIIlllIlIIllIl[0]);
            final String lllllllllllllIIlIIllllIllIlIllll = ((String)lllllllllllllIIlIIllllIllIlIlIlI).substring(WebSocketClientHandshaker00.lIIlllIlIIllIl[3], lllllllllllllIIlIIllllIllIllIIII);
            final String lllllllllllllIIlIIllllIllIlIlllI = ((String)lllllllllllllIIlIIllllIllIlIlIlI).substring(lllllllllllllIIlIIllllIllIllIIII);
            lllllllllllllIIlIIllllIllIlIlIlI = String.valueOf(new StringBuilder().append(lllllllllllllIIlIIllllIllIlIllll).append((char)WebSocketClientHandshaker00.lIIlllIlIIllIl[30]).append(lllllllllllllIIlIIllllIllIlIlllI));
            ++lllllllllllllIIlIIllllIllIlIllIl;
            "".length();
            if (-(0x61 ^ 0x44 ^ (0x44 ^ 0x65)) >= 0) {
                return null;
            }
        }
        return (String)lllllllllllllIIlIIllllIllIlIlIlI;
    }
    
    @Override
    protected WebSocketFrameEncoder newWebSocketEncoder() {
        return new WebSocket00FrameEncoder();
    }
    
    private static boolean llIllIlllIllllI(final int lllllllllllllIIlIIllllIlIllIllII, final int lllllllllllllIIlIIllllIlIllIlIll) {
        return lllllllllllllIIlIIllllIlIllIllII >= lllllllllllllIIlIIllllIlIllIlIll;
    }
    
    private static boolean llIllIlllIllIIl(final Object lllllllllllllIIlIIllllIlIllIIlIl) {
        return lllllllllllllIIlIIllllIlIllIIlIl != null;
    }
    
    private static String llIllIlllIIllll(String lllllllllllllIIlIIllllIlIlllIlll, final String lllllllllllllIIlIIllllIlIllllIll) {
        lllllllllllllIIlIIllllIlIlllIlll = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIllllIlIlllIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIllllIlIllllIlI = new StringBuilder();
        final char[] lllllllllllllIIlIIllllIlIllllIIl = lllllllllllllIIlIIllllIlIllllIll.toCharArray();
        int lllllllllllllIIlIIllllIlIllllIII = WebSocketClientHandshaker00.lIIlllIlIIllIl[3];
        final double lllllllllllllIIlIIllllIlIlllIIlI = (Object)((String)lllllllllllllIIlIIllllIlIlllIlll).toCharArray();
        final float lllllllllllllIIlIIllllIlIlllIIIl = lllllllllllllIIlIIllllIlIlllIIlI.length;
        float lllllllllllllIIlIIllllIlIlllIIII = WebSocketClientHandshaker00.lIIlllIlIIllIl[3];
        while (llIllIlllIlllIl((int)lllllllllllllIIlIIllllIlIlllIIII, (int)lllllllllllllIIlIIllllIlIlllIIIl)) {
            final char lllllllllllllIIlIIllllIlIlllllIl = lllllllllllllIIlIIllllIlIlllIIlI[lllllllllllllIIlIIllllIlIlllIIII];
            lllllllllllllIIlIIllllIlIllllIlI.append((char)(lllllllllllllIIlIIllllIlIlllllIl ^ lllllllllllllIIlIIllllIlIllllIIl[lllllllllllllIIlIIllllIlIllllIII % lllllllllllllIIlIIllllIlIllllIIl.length]));
            "".length();
            ++lllllllllllllIIlIIllllIlIllllIII;
            ++lllllllllllllIIlIIllllIlIlllIIII;
            "".length();
            if (((0x3E ^ 0x65) & ~(0xCF ^ 0x94)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIllllIlIllllIlI);
    }
    
    public WebSocketClientHandshaker00(final URI lllllllllllllIIlIIlllllIIIlIlllI, final WebSocketVersion lllllllllllllIIlIIlllllIIIllIIll, final String lllllllllllllIIlIIlllllIIIllIIlI, final HttpHeaders lllllllllllllIIlIIlllllIIIlIlIll, final int lllllllllllllIIlIIlllllIIIllIIII) {
        super(lllllllllllllIIlIIlllllIIIlIlllI, lllllllllllllIIlIIlllllIIIllIIll, lllllllllllllIIlIIlllllIIIllIIlI, lllllllllllllIIlIIlllllIIIlIlIll, lllllllllllllIIlIIlllllIIIllIIII);
    }
    
    private static String llIllIlllIlIIII(final String lllllllllllllIIlIIllllIllIIIllII, final String lllllllllllllIIlIIllllIllIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllllIllIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllllIllIIIlIIl.getBytes(StandardCharsets.UTF_8)), WebSocketClientHandshaker00.lIIlllIlIIllIl[4]), "DES");
            final Cipher lllllllllllllIIlIIllllIllIIIlllI = Cipher.getInstance("DES");
            lllllllllllllIIlIIllllIllIIIlllI.init(WebSocketClientHandshaker00.lIIlllIlIIllIl[8], lllllllllllllIIlIIllllIllIIIllll);
            return new String(lllllllllllllIIlIIllllIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllllIllIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllllIllIIIllIl) {
            lllllllllllllIIlIIllllIllIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIlllIlllII(final int lllllllllllllIIlIIllllIlIlIllllI, final int lllllllllllllIIlIIllllIlIlIlllIl) {
        return lllllllllllllIIlIIllllIlIlIllllI != lllllllllllllIIlIIllllIlIlIlllIl;
    }
    
    @Override
    protected FullHttpRequest newHandshakeRequest() {
        final int lllllllllllllIIlIIlllllIIIIlIIIl = WebSocketUtil.randomNumber(WebSocketClientHandshaker00.lIIlllIlIIllIl[0], WebSocketClientHandshaker00.lIIlllIlIIllIl[1]);
        final int lllllllllllllIIlIIlllllIIIIlIIII = WebSocketUtil.randomNumber(WebSocketClientHandshaker00.lIIlllIlIIllIl[0], WebSocketClientHandshaker00.lIIlllIlIIllIl[1]);
        final int lllllllllllllIIlIIlllllIIIIIllll = WebSocketClientHandshaker00.lIIlllIlIIllIl[2] / lllllllllllllIIlIIlllllIIIIlIIIl;
        final int lllllllllllllIIlIIlllllIIIIIlllI = WebSocketClientHandshaker00.lIIlllIlIIllIl[2] / lllllllllllllIIlIIlllllIIIIlIIII;
        final int lllllllllllllIIlIIlllllIIIIIllIl = WebSocketUtil.randomNumber(WebSocketClientHandshaker00.lIIlllIlIIllIl[3], lllllllllllllIIlIIlllllIIIIIllll);
        final int lllllllllllllIIlIIlllllIIIIIllII = WebSocketUtil.randomNumber(WebSocketClientHandshaker00.lIIlllIlIIllIl[3], lllllllllllllIIlIIlllllIIIIIlllI);
        final int lllllllllllllIIlIIlllllIIIIIlIll = lllllllllllllIIlIIlllllIIIIIllIl * lllllllllllllIIlIIlllllIIIIlIIIl;
        final int lllllllllllllIIlIIlllllIIIIIlIlI = lllllllllllllIIlIIlllllIIIIIllII * lllllllllllllIIlIIlllllIIIIlIIII;
        String lllllllllllllIIlIIlllllIIIIIlIIl = Integer.toString(lllllllllllllIIlIIlllllIIIIIlIll);
        String lllllllllllllIIlIIlllllIIIIIlIII = Integer.toString(lllllllllllllIIlIIlllllIIIIIlIlI);
        lllllllllllllIIlIIlllllIIIIIlIIl = insertRandomCharacters(lllllllllllllIIlIIlllllIIIIIlIIl);
        lllllllllllllIIlIIlllllIIIIIlIII = insertRandomCharacters(lllllllllllllIIlIIlllllIIIIIlIII);
        lllllllllllllIIlIIlllllIIIIIlIIl = insertSpaces(lllllllllllllIIlIIlllllIIIIIlIIl, lllllllllllllIIlIIlllllIIIIlIIIl);
        lllllllllllllIIlIIlllllIIIIIlIII = insertSpaces(lllllllllllllIIlIIlllllIIIIIlIII, lllllllllllllIIlIIlllllIIIIlIIII);
        final byte[] lllllllllllllIIlIIlllllIIIIIIlll = WebSocketUtil.randomBytes(WebSocketClientHandshaker00.lIIlllIlIIllIl[4]);
        ByteBuffer lllllllllllllIIlIIlllllIIIIIIllI = ByteBuffer.allocate(WebSocketClientHandshaker00.lIIlllIlIIllIl[5]);
        lllllllllllllIIlIIlllllIIIIIIllI.putInt(lllllllllllllIIlIIlllllIIIIIllIl);
        "".length();
        final byte[] lllllllllllllIIlIIlllllIIIIIIlIl = lllllllllllllIIlIIlllllIIIIIIllI.array();
        lllllllllllllIIlIIlllllIIIIIIllI = ByteBuffer.allocate(WebSocketClientHandshaker00.lIIlllIlIIllIl[5]);
        lllllllllllllIIlIIlllllIIIIIIllI.putInt(lllllllllllllIIlIIlllllIIIIIllII);
        "".length();
        final byte[] lllllllllllllIIlIIlllllIIIIIIlII = lllllllllllllIIlIIlllllIIIIIIllI.array();
        final byte[] lllllllllllllIIlIIlllllIIIIIIIll = new byte[WebSocketClientHandshaker00.lIIlllIlIIllIl[6]];
        System.arraycopy(lllllllllllllIIlIIlllllIIIIIIlIl, WebSocketClientHandshaker00.lIIlllIlIIllIl[3], lllllllllllllIIlIIlllllIIIIIIIll, WebSocketClientHandshaker00.lIIlllIlIIllIl[3], WebSocketClientHandshaker00.lIIlllIlIIllIl[5]);
        System.arraycopy(lllllllllllllIIlIIlllllIIIIIIlII, WebSocketClientHandshaker00.lIIlllIlIIllIl[3], lllllllllllllIIlIIlllllIIIIIIIll, WebSocketClientHandshaker00.lIIlllIlIIllIl[5], WebSocketClientHandshaker00.lIIlllIlIIllIl[5]);
        System.arraycopy(lllllllllllllIIlIIlllllIIIIIIlll, WebSocketClientHandshaker00.lIIlllIlIIllIl[3], lllllllllllllIIlIIlllllIIIIIIIll, WebSocketClientHandshaker00.lIIlllIlIIllIl[4], WebSocketClientHandshaker00.lIIlllIlIIllIl[4]);
        this.expectedChallengeResponseBytes = Unpooled.wrappedBuffer(WebSocketUtil.md5(lllllllllllllIIlIIlllllIIIIIIIll));
        final URI lllllllllllllIIlIIlllllIIIIIIIlI = this.uri();
        String lllllllllllllIIlIIlllllIIIIIIIIl = lllllllllllllIIlIIlllllIIIIIIIlI.getPath();
        if (llIllIlllIllIIl(lllllllllllllIIlIIlllllIIIIIIIlI.getQuery()) && llIllIlllIllIlI(lllllllllllllIIlIIlllllIIIIIIIlI.getQuery().isEmpty() ? 1 : 0)) {
            lllllllllllllIIlIIlllllIIIIIIIIl = String.valueOf(new StringBuilder().append(lllllllllllllIIlIIlllllIIIIIIIlI.getPath()).append((char)WebSocketClientHandshaker00.lIIlllIlIIllIl[7]).append(lllllllllllllIIlIIlllllIIIIIIIlI.getQuery()));
        }
        if (!llIllIlllIllIIl(lllllllllllllIIlIIlllllIIIIIIIIl) || llIllIlllIllIll(lllllllllllllIIlIIlllllIIIIIIIIl.isEmpty() ? 1 : 0)) {
            lllllllllllllIIlIIlllllIIIIIIIIl = WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[3]];
        }
        final FullHttpRequest lllllllllllllIIlIIlllllIIIIIIIII = new DefaultFullHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, lllllllllllllIIlIIlllllIIIIIIIIl);
        final HttpHeaders lllllllllllllIIlIIllllIlllllllll = lllllllllllllIIlIIlllllIIIIIIIII.headers();
        lllllllllllllIIlIIllllIlllllllll.add(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[0]], WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[8]]).add(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[9]], WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[5]]).add(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[10]], lllllllllllllIIlIIlllllIIIIIIIlI.getHost());
        "".length();
        final int lllllllllllllIIlIIllllIllllllllI = lllllllllllllIIlIIlllllIIIIIIIlI.getPort();
        String lllllllllllllIIlIIllllIlllllllIl = String.valueOf(new StringBuilder().append(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[11]]).append(lllllllllllllIIlIIlllllIIIIIIIlI.getHost()));
        if (llIllIlllIlllII(lllllllllllllIIlIIllllIllllllllI, WebSocketClientHandshaker00.lIIlllIlIIllIl[12]) && llIllIlllIlllII(lllllllllllllIIlIIllllIllllllllI, WebSocketClientHandshaker00.lIIlllIlIIllIl[13])) {
            lllllllllllllIIlIIllllIlllllllIl = String.valueOf(new StringBuilder().append(lllllllllllllIIlIIllllIlllllllIl).append((char)WebSocketClientHandshaker00.lIIlllIlIIllIl[14]).append(lllllllllllllIIlIIllllIllllllllI));
        }
        lllllllllllllIIlIIllllIlllllllll.add(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[15]], lllllllllllllIIlIIllllIlllllllIl).add(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[4]], lllllllllllllIIlIIlllllIIIIIlIIl).add(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[16]], lllllllllllllIIlIIlllllIIIIIlIII);
        "".length();
        final String lllllllllllllIIlIIllllIlllllllII = this.expectedSubprotocol();
        if (llIllIlllIllIIl(lllllllllllllIIlIIllllIlllllllII) && llIllIlllIllIlI(lllllllllllllIIlIIllllIlllllllII.isEmpty() ? 1 : 0)) {
            lllllllllllllIIlIIllllIlllllllll.add(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[17]], lllllllllllllIIlIIllllIlllllllII);
            "".length();
        }
        if (llIllIlllIllIIl(this.customHeaders)) {
            lllllllllllllIIlIIllllIlllllllll.add(this.customHeaders);
            "".length();
        }
        lllllllllllllIIlIIllllIlllllllll.set(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[18]], lllllllllllllIIlIIlllllIIIIIIlll.length);
        "".length();
        lllllllllllllIIlIIlllllIIIIIIIII.content().writeBytes(lllllllllllllIIlIIlllllIIIIIIlll);
        "".length();
        return lllllllllllllIIlIIlllllIIIIIIIII;
    }
    
    private static void llIllIlllIlIIlI() {
        (lIIlllIlIIlIlI = new String[WebSocketClientHandshaker00.lIIlllIlIIllIl[31]])[WebSocketClientHandshaker00.lIIlllIlIIllIl[3]] = llIllIlllIIllll("Vw==", "xCkaO");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[0]] = llIllIlllIlIIII("ZTjHWM0o+Wo=", "SlLnz");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[8]] = llIllIlllIIllll("MgYSMCQGCBUX", "ecpcK");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[9]] = llIllIlllIlIIIl("ysZnz9whMXWF/jvvDV8XIQ==", "nkimw");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[5]] = llIllIlllIIllll("DDkrNA49LA==", "YILFo");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[10]] = llIllIlllIlIIII("cZ6qubZeZ1Y=", "ICmOW");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[11]] = llIllIlllIlIIIl("NTlcSNWwaMI=", "ZYciE");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[15]] = llIllIlllIlIIIl("91V5OvALr+g=", "MmGQM");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[4]] = llIllIlllIlIIII("03u0m/Imm2SJPkJJhaTwxUL7P9BE1pcn", "KDpSq");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[16]] = llIllIlllIIllll("BiI0RzswJQQFDz4iI0cnMD5l", "UGWjl");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[17]] = llIllIlllIlIIII("vGQjMjFhHfH1Fda4kwhEGLjOCpD+UZ1X", "sFbqH");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[18]] = llIllIlllIIllll("Ai0jJjEvNmAeMS8lOTo=", "ABMRT");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[1]] = llIllIlllIIllll("HTMkGCYpPSM/aRokKT8mKTkqawErOCI4ISs9Iw==", "JVFKI");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[20]] = llIllIlllIlIIIl("2xNpv0Xl49h5Ar/HBtvWYsnrm9yFugE+r3vD53ehMuaCY7HhcqMBzg==", "jozJn");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[21]] = llIllIlllIlIIIl("ngq6Lb91Iyw=", "MvWwN");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[22]] = llIllIlllIIllll("MwIPOCsHDAgf", "dgmkD");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[6]] = llIllIlllIlIIII("lZVmqsgy404qyMRufzSWJalD9dTMikkT5uVjiIu/e2LJTQ4P+78Rsg==", "GrQJH");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[23]] = llIllIlllIlIIII("S8OgRsL5P0v8SrFbBe3ZGw==", "eQxUa");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[24]] = llIllIlllIlIIII("CaoO7uyXGW8=", "FpQGw");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[25]] = llIllIlllIIllll("MzcfDw8TPUkGAhQ9GgYCETxJHAYJKQYAEB95CgENFDwKGgoVN1NO", "zYinc");
        WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[26]] = llIllIlllIIllll("MQYCKCYRDFQqIhkEGCwkHw0=", "xhtIJ");
    }
    
    private static void llIllIlllIllIII() {
        (lIIlllIlIIllIl = new int[32])[0] = " ".length();
        WebSocketClientHandshaker00.lIIlllIlIIllIl[1] = (0x29 ^ 0x20 ^ (0x28 ^ 0x2D));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[2] = (-1 & Integer.MAX_VALUE);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[3] = ((0x46 ^ 0x7F ^ (0xA7 ^ 0x8D)) & (0x93 ^ 0xA0 ^ (0xB7 ^ 0x97) ^ -" ".length()));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[4] = (0x2F ^ 0x5C ^ (0xF3 ^ 0x88));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[5] = (0x36 ^ 0x32);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[6] = (0x13 ^ 0x3);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[7] = (0xFE ^ 0xC1);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[8] = "  ".length();
        WebSocketClientHandshaker00.lIIlllIlIIllIl[9] = "   ".length();
        WebSocketClientHandshaker00.lIIlllIlIIllIl[10] = (0x4C ^ 0x49);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[11] = (0x88 ^ 0x8E);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[12] = (0x9 ^ 0x59);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[13] = (-(0xFFFFF74D & 0x7AF7) & (0xFFFFF7FF & 0x7BFF));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[14] = (0x56 ^ 0x6C);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[15] = (0x75 ^ 0x2D ^ (0x7F ^ 0x20));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[16] = (0x70 ^ 0x79);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[17] = (0x23 ^ 0x7D ^ (0x5D ^ 0x9));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[18] = (0x7 ^ 0x1B ^ (0xD7 ^ 0xC0));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[19] = (0x33 ^ 0x56);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[20] = (97 + 15 - 69 + 84 ^ (0xFE ^ 0x8C));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[21] = (0x24 ^ 0x67 ^ (0x77 ^ 0x3A));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[22] = (0xB6 ^ 0xB9);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[23] = (0x52 ^ 0x3E ^ (0x71 ^ 0xC));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[24] = (0x13 ^ 0x49 ^ (0xFB ^ 0xB3));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[25] = (0xF5 ^ 0xA8 ^ (0x7C ^ 0x32));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[26] = (0xBE ^ 0xAA);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[27] = (0x47 ^ 0x66);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[28] = (15 + 127 - 117 + 107 ^ 104 + 130 - 104 + 41);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[29] = (104 + 178 - 200 + 132 ^ 32 + 70 + 64 + 2);
        WebSocketClientHandshaker00.lIIlllIlIIllIl[30] = (0xEF ^ 0x81 ^ (0x3D ^ 0x73));
        WebSocketClientHandshaker00.lIIlllIlIIllIl[31] = (0x59 ^ 0x4C);
    }
    
    static {
        llIllIlllIllIII();
        llIllIlllIlIIlI();
    }
    
    @Override
    protected void verify(final FullHttpResponse lllllllllllllIIlIIllllIlllIlllII) {
        final HttpResponseStatus lllllllllllllIIlIIllllIlllIllIll = new HttpResponseStatus(WebSocketClientHandshaker00.lIIlllIlIIllIl[19], WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[1]]);
        if (llIllIlllIllIlI(lllllllllllllIIlIIllllIlllIlllII.getStatus().equals(lllllllllllllIIlIIllllIlllIllIll) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[20]]).append(lllllllllllllIIlIIllllIlllIlllII.getStatus())));
        }
        final HttpHeaders lllllllllllllIIlIIllllIlllIllIlI = lllllllllllllIIlIIllllIlllIlllII.headers();
        final String lllllllllllllIIlIIllllIlllIllIIl = lllllllllllllIIlIIllllIlllIllIlI.get(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[21]]);
        if (llIllIlllIllIlI(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[22]].equalsIgnoreCase(lllllllllllllIIlIIllllIlllIllIIl) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[6]]).append(lllllllllllllIIlIIllllIlllIllIIl)));
        }
        final String lllllllllllllIIlIIllllIlllIllIII = lllllllllllllIIlIIllllIlllIllIlI.get(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[23]]);
        if (llIllIlllIllIlI(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[24]].equalsIgnoreCase(lllllllllllllIIlIIllllIlllIllIII) ? 1 : 0)) {
            throw new WebSocketHandshakeException(String.valueOf(new StringBuilder().append(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[25]]).append(lllllllllllllIIlIIllllIlllIllIII)));
        }
        final ByteBuf lllllllllllllIIlIIllllIlllIlIlll = lllllllllllllIIlIIllllIlllIlllII.content();
        if (llIllIlllIllIlI(lllllllllllllIIlIIllllIlllIlIlll.equals(this.expectedChallengeResponseBytes) ? 1 : 0)) {
            throw new WebSocketHandshakeException(WebSocketClientHandshaker00.lIIlllIlIIlIlI[WebSocketClientHandshaker00.lIIlllIlIIllIl[26]]);
        }
    }
}
