// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import io.netty.channel.Channel;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.FullHttpRequest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.regex.Pattern;

public class WebSocketServerHandshaker00 extends WebSocketServerHandshaker
{
    private static final /* synthetic */ String[] llIIIllIIlIIll;
    private static final /* synthetic */ Pattern BEGINNING_DIGIT;
    private static final /* synthetic */ Pattern BEGINNING_SPACE;
    private static final /* synthetic */ int[] llIIIllIIlIlIl;
    
    private static boolean lIIIlIlIIlIIIIII(final Object llllllllllllIlllIlIIlIlllllIIIll) {
        return llllllllllllIlllIlIIlIlllllIIIll != null;
    }
    
    private static boolean lIIIlIlIIIlllllI(final int llllllllllllIlllIlIIlIllllIlllll) {
        return llllllllllllIlllIlIIlIllllIlllll != 0;
    }
    
    private static String lIIIlIlIIIllIlIl(String llllllllllllIlllIlIIlIllllllIIIl, final String llllllllllllIlllIlIIlIllllllIlIl) {
        llllllllllllIlllIlIIlIllllllIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIlIIlIllllllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIlIllllllIlII = new StringBuilder();
        final char[] llllllllllllIlllIlIIlIllllllIIll = llllllllllllIlllIlIIlIllllllIlIl.toCharArray();
        int llllllllllllIlllIlIIlIllllllIIlI = WebSocketServerHandshaker00.llIIIllIIlIlIl[0];
        final boolean llllllllllllIlllIlIIlIlllllIllII = (Object)llllllllllllIlllIlIIlIllllllIIIl.toCharArray();
        final Exception llllllllllllIlllIlIIlIlllllIlIll = (Exception)llllllllllllIlllIlIIlIlllllIllII.length;
        int llllllllllllIlllIlIIlIlllllIlIlI = WebSocketServerHandshaker00.llIIIllIIlIlIl[0];
        while (lIIIlIlIIlIIIIlI(llllllllllllIlllIlIIlIlllllIlIlI, (int)llllllllllllIlllIlIIlIlllllIlIll)) {
            final char llllllllllllIlllIlIIlIllllllIlll = llllllllllllIlllIlIIlIlllllIllII[llllllllllllIlllIlIIlIlllllIlIlI];
            llllllllllllIlllIlIIlIllllllIlII.append((char)(llllllllllllIlllIlIIlIllllllIlll ^ llllllllllllIlllIlIIlIllllllIIll[llllllllllllIlllIlIIlIllllllIIlI % llllllllllllIlllIlIIlIllllllIIll.length]));
            "".length();
            ++llllllllllllIlllIlIIlIllllllIIlI;
            ++llllllllllllIlllIlIIlIlllllIlIlI;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIlIllllllIlII);
    }
    
    private static void lIIIlIlIIIllllIl() {
        (llIIIllIIlIlIl = new int[34])[0] = ((0x24 ^ 0x63) & ~(0xFE ^ 0xB9));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[1] = " ".length();
        WebSocketServerHandshaker00.llIIIllIIlIlIl[2] = "  ".length();
        WebSocketServerHandshaker00.llIIIllIIlIlIl[3] = "   ".length();
        WebSocketServerHandshaker00.llIIIllIIlIlIl[4] = (0x48 ^ 0x4C);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[5] = (((0xA0 ^ 0xB0) & ~(0x40 ^ 0x50)) ^ (0x27 ^ 0x22));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[6] = (0x3E ^ 0xA ^ (0x52 ^ 0x60));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[7] = (63 + 142 - 18 + 54 ^ 58 + 78 - 112 + 124);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[8] = (0x23 ^ 0x24);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[9] = (0x14 ^ 0x5B ^ (0xE1 ^ 0xA6));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[10] = (0x8F ^ 0xB9 ^ (0x6E ^ 0x51));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[11] = (0x60 ^ 0x6A);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[12] = (0x51 ^ 0x5A);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[13] = (0x91 ^ 0x9A ^ (0xC7 ^ 0xC0));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[14] = (24 + 89 + 84 + 9 ^ 155 + 20 - 103 + 123);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[15] = (0x7D ^ 0x8 ^ (0x4A ^ 0x31));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[16] = (0x92 ^ 0x9D);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[17] = (0x11 ^ 0x1);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[18] = (0xBA ^ 0xAD ^ (0x9B ^ 0x9D));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[19] = (0x46 ^ 0x4E ^ (0xB4 ^ 0xAE));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[20] = (136 + 15 - 89 + 78 ^ 141 + 151 - 253 + 120);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[21] = (0xAC ^ 0xB8);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[22] = (0x48 ^ 0x5C ^ " ".length());
        WebSocketServerHandshaker00.llIIIllIIlIlIl[23] = (0x71 ^ 0x67);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[24] = (91 + 180 - 163 + 78 ^ 108 + 66 - 168 + 167);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[25] = (0x6C ^ 0x42 ^ (0xA0 ^ 0x96));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[26] = (0x57 ^ 0x5F ^ (0x4D ^ 0x5C));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[27] = (128 + 49 - 37 + 8 ^ 17 + 21 - 29 + 133);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[28] = (0x16 ^ 0xD);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[29] = (0xD2 ^ 0xB0 ^ (0xC9 ^ 0xB7));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[30] = (" ".length() ^ (0xBE ^ 0xA2));
        WebSocketServerHandshaker00.llIIIllIIlIlIl[31] = (30 + 138 - 126 + 121 ^ 37 + 13 - 16 + 155);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[32] = (0x2F ^ 0x30);
        WebSocketServerHandshaker00.llIIIllIIlIlIl[33] = (136 + 90 - 96 + 42 ^ 35 + 15 + 15 + 75);
    }
    
    @Override
    protected FullHttpResponse newHandshakeResponse(final FullHttpRequest llllllllllllIlllIlIIllIIIIllIIll, final HttpHeaders llllllllllllIlllIlIIllIIIIllIIlI) {
        if (!lIIIlIlIIIlllllI(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[0]].equalsIgnoreCase(llllllllllllIlllIlIIllIIIIllIIll.headers().get(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[1]])) ? 1 : 0) || lIIIlIlIIIllllll(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[2]].equalsIgnoreCase(llllllllllllIlllIlIIllIIIIllIIll.headers().get(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[3]])) ? 1 : 0)) {
            throw new WebSocketHandshakeException(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[4]]);
        }
        int n;
        if (lIIIlIlIIIlllllI(llllllllllllIlllIlIIllIIIIllIIll.headers().contains(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[5]]) ? 1 : 0) && lIIIlIlIIIlllllI(llllllllllllIlllIlIIllIIIIllIIll.headers().contains(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[6]]) ? 1 : 0)) {
            n = WebSocketServerHandshaker00.llIIIllIIlIlIl[1];
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        else {
            n = WebSocketServerHandshaker00.llIIIllIIlIlIl[0];
        }
        final boolean llllllllllllIlllIlIIllIIIIllIllI = n != 0;
        final HttpVersion http_1_1 = HttpVersion.HTTP_1_1;
        final int llllllllllllIlllllllIIIllIIllIII = WebSocketServerHandshaker00.llIIIllIIlIlIl[7];
        String llllllllllllIlllllllIIIllIIlIlll;
        if (lIIIlIlIIIlllllI(llllllllllllIlllIlIIllIIIIllIllI ? 1 : 0)) {
            llllllllllllIlllllllIIIllIIlIlll = WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[8]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            llllllllllllIlllllllIIIllIIlIlll = WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[9]];
        }
        final FullHttpResponse llllllllllllIlllIlIIllIIIIllIlIl = new DefaultFullHttpResponse(http_1_1, new HttpResponseStatus(llllllllllllIlllllllIIIllIIllIII, llllllllllllIlllllllIIIllIIlIlll));
        if (lIIIlIlIIlIIIIII(llllllllllllIlllIlIIllIIIIllIIlI)) {
            llllllllllllIlllIlIIllIIIIllIlIl.headers().add(llllllllllllIlllIlIIllIIIIllIIlI);
            "".length();
        }
        llllllllllllIlllIlIIllIIIIllIlIl.headers().add(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[10]], WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[11]]);
        "".length();
        llllllllllllIlllIlIIllIIIIllIlIl.headers().add(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[12]], WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[13]]);
        "".length();
        if (lIIIlIlIIIlllllI(llllllllllllIlllIlIIllIIIIllIllI ? 1 : 0)) {
            llllllllllllIlllIlIIllIIIIllIlIl.headers().add(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[14]], llllllllllllIlllIlIIllIIIIllIIll.headers().get(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[15]]));
            "".length();
            llllllllllllIlllIlIIllIIIIllIlIl.headers().add(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[16]], this.uri());
            "".length();
            final String llllllllllllIlllIlIIllIIIlIIIIIl = llllllllllllIlllIlIIllIIIIllIIll.headers().get(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[17]]);
            if (lIIIlIlIIlIIIIII(llllllllllllIlllIlIIllIIIlIIIIIl)) {
                final String llllllllllllIlllIlIIllIIIlIIIIlI = this.selectSubprotocol(llllllllllllIlllIlIIllIIIlIIIIIl);
                if (lIIIlIlIIlIIIIIl(llllllllllllIlllIlIIllIIIlIIIIlI)) {
                    if (lIIIlIlIIIlllllI(WebSocketServerHandshaker00.logger.isDebugEnabled() ? 1 : 0)) {
                        WebSocketServerHandshaker00.logger.debug(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[18]], llllllllllllIlllIlIIllIIIlIIIIIl);
                        "".length();
                        if ((0x7C ^ 0x78) <= 0) {
                            return null;
                        }
                    }
                }
                else {
                    llllllllllllIlllIlIIllIIIIllIlIl.headers().add(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[19]], llllllllllllIlllIlIIllIIIlIIIIlI);
                    "".length();
                }
            }
            final String llllllllllllIlllIlIIllIIIlIIIIII = llllllllllllIlllIlIIllIIIIllIIll.headers().get(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[20]]);
            final String llllllllllllIlllIlIIllIIIIllllll = llllllllllllIlllIlIIllIIIIllIIll.headers().get(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[21]]);
            final int llllllllllllIlllIlIIllIIIIlllllI = (int)(Long.parseLong(WebSocketServerHandshaker00.BEGINNING_DIGIT.matcher(llllllllllllIlllIlIIllIIIlIIIIII).replaceAll(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[22]])) / WebSocketServerHandshaker00.BEGINNING_SPACE.matcher(llllllllllllIlllIlIIllIIIlIIIIII).replaceAll(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[23]]).length());
            final int llllllllllllIlllIlIIllIIIIllllIl = (int)(Long.parseLong(WebSocketServerHandshaker00.BEGINNING_DIGIT.matcher(llllllllllllIlllIlIIllIIIIllllll).replaceAll(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[24]])) / WebSocketServerHandshaker00.BEGINNING_SPACE.matcher(llllllllllllIlllIlIIllIIIIllllll).replaceAll(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[25]]).length());
            final long llllllllllllIlllIlIIllIIIIllllII = llllllllllllIlllIlIIllIIIIllIIll.content().readLong();
            final ByteBuf llllllllllllIlllIlIIllIIIIlllIll = Unpooled.buffer(WebSocketServerHandshaker00.llIIIllIIlIlIl[17]);
            llllllllllllIlllIlIIllIIIIlllIll.writeInt(llllllllllllIlllIlIIllIIIIlllllI);
            "".length();
            llllllllllllIlllIlIIllIIIIlllIll.writeInt(llllllllllllIlllIlIIllIIIIllllIl);
            "".length();
            llllllllllllIlllIlIIllIIIIlllIll.writeLong(llllllllllllIlllIlIIllIIIIllllII);
            "".length();
            llllllllllllIlllIlIIllIIIIllIlIl.content().writeBytes(WebSocketUtil.md5(llllllllllllIlllIlIIllIIIIlllIll.array()));
            "".length();
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            llllllllllllIlllIlIIllIIIIllIlIl.headers().add(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[26]], llllllllllllIlllIlIIllIIIIllIIll.headers().get(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[27]]));
            "".length();
            llllllllllllIlllIlIIllIIIIllIlIl.headers().add(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[28]], this.uri());
            "".length();
            final String llllllllllllIlllIlIIllIIIIlllIlI = llllllllllllIlllIlIIllIIIIllIIll.headers().get(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[29]]);
            if (lIIIlIlIIlIIIIII(llllllllllllIlllIlIIllIIIIlllIlI)) {
                llllllllllllIlllIlIIllIIIIllIlIl.headers().add(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[30]], this.selectSubprotocol(llllllllllllIlllIlIIllIIIIlllIlI));
                "".length();
            }
        }
        return llllllllllllIlllIlIIllIIIIllIlIl;
    }
    
    public WebSocketServerHandshaker00(final String llllllllllllIlllIlIIllIIIlIlIIIl, final String llllllllllllIlllIlIIllIIIlIlIIII, final int llllllllllllIlllIlIIllIIIlIlIIll) {
        super(WebSocketVersion.V00, llllllllllllIlllIlIIllIIIlIlIIIl, llllllllllllIlllIlIIllIIIlIlIIII, llllllllllllIlllIlIIllIIIlIlIIll);
    }
    
    private static boolean lIIIlIlIIlIIIIlI(final int llllllllllllIlllIlIIlIlllllIIllI, final int llllllllllllIlllIlIIlIlllllIIlIl) {
        return llllllllllllIlllIlIIlIlllllIIllI < llllllllllllIlllIlIIlIlllllIIlIl;
    }
    
    @Override
    protected WebSocketFrameDecoder newWebsocketDecoder() {
        return new WebSocket00FrameDecoder(this.maxFramePayloadLength());
    }
    
    private static void lIIIlIlIIIllllII() {
        (llIIIllIIlIIll = new String[WebSocketServerHandshaker00.llIIIllIIlIlIl[33]])[WebSocketServerHandshaker00.llIIIllIIlIlIl[0]] = lIIIlIlIIIllIlII("Efaj/85DzUc=", "cQuFU");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[1]] = lIIIlIlIIIllIlIl("KSY3PSoJPTA8IQ==", "jIYSO");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[2]] = lIIIlIlIIIllIlIl("JxQhIA4TGiYH", "pqCsa");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[3]] = lIIIlIlIIIllIllI("BpR1GeCXD7o=", "HAQtr");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[4]] = lIIIlIlIIIllIlIl("ChsYVCREIwkWFgsXBxExRBwNGiEXHA0fIEQGCQUwAQcYTmUJHR8HLAoTTAE1AwYNECA=", "dtltE");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[5]] = lIIIlIlIIIllIllI("BB+lymEFd87P2NW05xziVEFOSJmcfJ4X", "WcZVg");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[6]] = lIIIlIlIIIllIlIl("NyEmfxoBJhY9Lg8hMX8GAT13", "dDERM");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[8]] = lIIIlIlIIIllIlIl("MTIoBAcFPC8jSDYlJSMHBTgmdyAHOS4kAAc8Lw==", "fWJWh");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[9]] = lIIIlIlIIIllIlII("FdtvAhF3K0JuX9QtyRSRF97LSMfdFT+kGjnRuw/RfhA=", "YkhJo");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[10]] = lIIIlIlIIIllIllI("2+hA+JQIUTI=", "UlneY");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[11]] = lIIIlIlIIIllIlIl("HisnHwgqJSA4", "INELg");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[12]] = lIIIlIlIIIllIllI("gXeJ+2yasxOeRWaA5/7h0g==", "LYRWW");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[13]] = lIIIlIlIIIllIllI("gnCqsGLUXyw=", "FzdiZ");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[14]] = lIIIlIlIIIllIllI("Szl/h2fpBSrpXoADVwCNkgarLtZ8Nqyw", "HEfNe");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[15]] = lIIIlIlIIIllIlII("rXS+BOPUoPg=", "FrihH");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[16]] = lIIIlIlIIIllIlIl("CQEnZTY/BhcnAjEBMGUtNQclPAg1Cg==", "ZdDHa");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[17]] = lIIIlIlIIIllIlII("Vgo/B3L7nrsB7uKamrT+ucFyDUlWMuoZ", "aZLoP");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[18]] = lIIIlIlIIIllIlIl("HCArLA09MT89SD0wOCkaITE1OgcibSlwSCAqLnkbOzUqNho6ID5jSDU4", "NEZYh");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[19]] = lIIIlIlIIIllIllI("L3PZCUuxO9/Sr1/G2HCnqECvkR6ZIVJx", "qOPUm");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[20]] = lIIIlIlIIIllIllI("OVRLQw0zoTVnsMUMWDRbOX9vMn9h8dnO", "hmvYP");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[21]] = lIIIlIlIIIllIlII("djwuzbFZzSOgo9f0+8PrDnU305XYPH9I", "EajmF");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[22]] = lIIIlIlIIIllIllI("ncvjAOXCZF8=", "CCmpL");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[23]] = lIIIlIlIIIllIlII("72MvA+MwyOg=", "UuhWs");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[24]] = lIIIlIlIIIllIllI("PakwC53N1nE=", "SLEjC");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[25]] = lIIIlIlIIIllIllI("nk8HOao405g=", "MMgKf");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[26]] = lIIIlIlIIIllIllI("YtNE4a4S27wpJHXEr5/+XchcE/OsBdzL", "PAkIL");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[27]] = lIIIlIlIIIllIllI("dyoYHnfqeTc=", "ymOFB");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[28]] = lIIIlIlIIIllIlII("aYwDRsf678wARfi0EevdnpUhRuqXteJh", "ZmTEJ");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[29]] = lIIIlIlIIIllIllI("jTw6XHLZnt924hSAbAbzlsc5nqsl3khr", "SyLsb");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[30]] = lIIIlIlIIIllIllI("OoIJYR3e+zB2NSwwuDUy2HgZdvwY9RR1", "helYN");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[31]] = lIIIlIlIIIllIllI("locltDMlf8M=", "rJbEM");
        WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[32]] = lIIIlIlIIIllIlII("WuSd9HlLYDE=", "gpRmS");
    }
    
    private static String lIIIlIlIIIllIlII(final String llllllllllllIlllIlIIllIIIIIIIllI, final String llllllllllllIlllIlIIllIIIIIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIllIIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIllIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIllIIIIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIllIIIIIIlIII.init(WebSocketServerHandshaker00.llIIIllIIlIlIl[2], llllllllllllIlllIlIIllIIIIIIlIIl);
            return new String(llllllllllllIlllIlIIllIIIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIllIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIllIIIIIIIlll) {
            llllllllllllIlllIlIIllIIIIIIIlll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIlIlIIIllllIl();
        lIIIlIlIIIllllII();
        BEGINNING_DIGIT = Pattern.compile(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[31]]);
        BEGINNING_SPACE = Pattern.compile(WebSocketServerHandshaker00.llIIIllIIlIIll[WebSocketServerHandshaker00.llIIIllIIlIlIl[32]]);
    }
    
    private static String lIIIlIlIIIllIllI(final String llllllllllllIlllIlIIllIIIIIlIIll, final String llllllllllllIlllIlIIllIIIIIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIllIIIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIllIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), WebSocketServerHandshaker00.llIIIllIIlIlIl[9]), "DES");
            final Cipher llllllllllllIlllIlIIllIIIIIlIlIl = Cipher.getInstance("DES");
            llllllllllllIlllIlIIllIIIIIlIlIl.init(WebSocketServerHandshaker00.llIIIllIIlIlIl[2], llllllllllllIlllIlIIllIIIIIlIllI);
            return new String(llllllllllllIlllIlIIllIIIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIllIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIllIIIIIlIlII) {
            llllllllllllIlllIlIIllIIIIIlIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected WebSocketFrameEncoder newWebSocketEncoder() {
        return new WebSocket00FrameEncoder();
    }
    
    @Override
    public ChannelFuture close(final Channel llllllllllllIlllIlIIllIIIIlIIlII, final CloseWebSocketFrame llllllllllllIlllIlIIllIIIIlIIIll, final ChannelPromise llllllllllllIlllIlIIllIIIIlIIIlI) {
        return llllllllllllIlllIlIIllIIIIlIIlII.writeAndFlush(llllllllllllIlllIlIIllIIIIlIIIll, llllllllllllIlllIlIIllIIIIlIIIlI);
    }
    
    private static boolean lIIIlIlIIIllllll(final int llllllllllllIlllIlIIlIllllIlllIl) {
        return llllllllllllIlllIlIIlIllllIlllIl == 0;
    }
    
    private static boolean lIIIlIlIIlIIIIIl(final Object llllllllllllIlllIlIIlIlllllIIIIl) {
        return llllllllllllIlllIlIIlIlllllIIIIl == null;
    }
}
