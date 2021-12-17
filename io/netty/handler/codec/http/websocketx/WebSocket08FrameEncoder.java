// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.util.internal.logging.InternalLoggerFactory;
import java.util.Arrays;
import io.netty.buffer.ByteBuf;
import java.nio.ByteBuffer;
import io.netty.handler.codec.TooLongFrameException;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.handler.codec.MessageToMessageEncoder;

public class WebSocket08FrameEncoder extends MessageToMessageEncoder<WebSocketFrame> implements WebSocketFrameEncoder
{
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int[] llIlIIIllIIlII;
    private static final /* synthetic */ String[] llIlIIIllIIIIl;
    private final /* synthetic */ boolean maskPayload;
    
    public WebSocket08FrameEncoder(final boolean llllllllllllIllIllIIllIIllIllIlI) {
        this.maskPayload = llllllllllllIllIllIIllIIllIllIlI;
    }
    
    private static boolean lIIlIIlIIIIlIlll(final Object llllllllllllIllIllIIllIIIlIIlIlI) {
        return llllllllllllIllIllIIllIIIlIIlIlI != null;
    }
    
    private static boolean lIIlIIlIIIIlIlII(final int llllllllllllIllIllIIllIIIlIlIIIl, final int llllllllllllIllIllIIllIIIlIlIIII) {
        return llllllllllllIllIllIIllIIIlIlIIIl <= llllllllllllIllIllIIllIIIlIlIIII;
    }
    
    private static boolean lIIlIIlIIIIlIIlI(final int llllllllllllIllIllIIllIIIlIlllIl, final int llllllllllllIllIllIIllIIIlIlllII) {
        return llllllllllllIllIllIIllIIIlIlllIl == llllllllllllIllIllIIllIIIlIlllII;
    }
    
    private static String lIIlIIlIIIIIlIIl(final String llllllllllllIllIllIIllIIIlllIIlI, final String llllllllllllIllIllIIllIIIlllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIIllIIIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIllIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIllIIIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIllIIIlllIlII.init(WebSocket08FrameEncoder.llIlIIIllIIlII[4], llllllllllllIllIllIIllIIIlllIlIl);
            return new String(llllllllllllIllIllIIllIIIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIllIIIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIllIIIlllIIll) {
            llllllllllllIllIllIIllIIIlllIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIllIllIIllIIlIlIllIl, final WebSocketFrame llllllllllllIllIllIIllIIlIlIllII, final List<Object> llllllllllllIllIllIIllIIlIllIlIl) throws Exception {
        final ByteBuf llllllllllllIllIllIIllIIlIllIlII = llllllllllllIllIllIIllIIlIlIllII.content();
        if (lIIlIIlIIIIlIIIl((llllllllllllIllIllIIllIIlIlIllII instanceof TextWebSocketFrame) ? 1 : 0)) {
            final byte llllllllllllIllIllIIllIIllIIlIII = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[0];
            "".length();
            if (" ".length() > " ".length()) {
                return;
            }
        }
        else if (lIIlIIlIIIIlIIIl((llllllllllllIllIllIIllIIlIlIllII instanceof PingWebSocketFrame) ? 1 : 0)) {
            final byte llllllllllllIllIllIIllIIllIIIlll = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[1];
            "".length();
            if (((0x87 ^ 0xAF ^ (0x66 ^ 0x6D)) & (119 + 26 - 135 + 135 ^ 38 + 84 - 75 + 131 ^ -" ".length())) > ((97 + 77 - 41 + 11 ^ 147 + 22 - 60 + 43) & (0x95 ^ 0xC4 ^ (0xEB ^ 0xB2) ^ -" ".length()))) {
                return;
            }
        }
        else if (lIIlIIlIIIIlIIIl((llllllllllllIllIllIIllIIlIlIllII instanceof PongWebSocketFrame) ? 1 : 0)) {
            final byte llllllllllllIllIllIIllIIllIIIllI = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[2];
            "".length();
            if ((0x4A ^ 0x4E) <= 0) {
                return;
            }
        }
        else if (lIIlIIlIIIIlIIIl((llllllllllllIllIllIIllIIlIlIllII instanceof CloseWebSocketFrame) ? 1 : 0)) {
            final byte llllllllllllIllIllIIllIIllIIIlIl = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[3];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else if (lIIlIIlIIIIlIIIl((llllllllllllIllIllIIllIIlIlIllII instanceof BinaryWebSocketFrame) ? 1 : 0)) {
            final byte llllllllllllIllIllIIllIIllIIIlII = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[4];
            "".length();
            if (((0xE6 ^ 0xB7) & ~(0x28 ^ 0x79)) > " ".length()) {
                return;
            }
        }
        else {
            if (!lIIlIIlIIIIlIIIl((llllllllllllIllIllIIllIIlIlIllII instanceof ContinuationWebSocketFrame) ? 1 : 0)) {
                throw new UnsupportedOperationException(String.valueOf(new StringBuilder().append(WebSocket08FrameEncoder.llIlIIIllIIIIl[WebSocket08FrameEncoder.llIlIIIllIIlII[5]]).append(llllllllllllIllIllIIllIIlIlIllII.getClass().getName())));
            }
            final byte llllllllllllIllIllIIllIIllIIIIll = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[5];
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        final int llllllllllllIllIllIIllIIlIllIIlI = llllllllllllIllIllIIllIIlIllIlII.readableBytes();
        final byte llllllllllllIllIllIIllIIlIllIIll;
        if (lIIlIIlIIIIlIIIl(WebSocket08FrameEncoder.logger.isDebugEnabled() ? 1 : 0)) {
            WebSocket08FrameEncoder.logger.debug(String.valueOf(new StringBuilder().append(WebSocket08FrameEncoder.llIlIIIllIIIIl[WebSocket08FrameEncoder.llIlIIIllIIlII[0]]).append(llllllllllllIllIllIIllIIlIllIIll).append(WebSocket08FrameEncoder.llIlIIIllIIIIl[WebSocket08FrameEncoder.llIlIIIllIIlII[4]]).append(llllllllllllIllIllIIllIIlIllIIlI)));
        }
        int llllllllllllIllIllIIllIIlIllIIIl = WebSocket08FrameEncoder.llIlIIIllIIlII[5];
        if (lIIlIIlIIIIlIIIl(llllllllllllIllIllIIllIIlIlIllII.isFinalFragment() ? 1 : 0)) {
            llllllllllllIllIllIIllIIlIllIIIl |= WebSocket08FrameEncoder.llIlIIIllIIlII[6];
        }
        llllllllllllIllIllIIllIIlIllIIIl |= llllllllllllIllIllIIllIIlIlIllII.rsv() % WebSocket08FrameEncoder.llIlIIIllIIlII[3] << WebSocket08FrameEncoder.llIlIIIllIIlII[7];
        llllllllllllIllIllIIllIIlIllIIIl |= llllllllllllIllIllIIllIIlIllIIll % WebSocket08FrameEncoder.llIlIIIllIIlII[6];
        if (lIIlIIlIIIIlIIlI(llllllllllllIllIllIIllIIlIllIIll, WebSocket08FrameEncoder.llIlIIIllIIlII[1]) && lIIlIIlIIIIlIIll(llllllllllllIllIllIIllIIlIllIIlI, WebSocket08FrameEncoder.llIlIIIllIIlII[8])) {
            throw new TooLongFrameException(String.valueOf(new StringBuilder().append(WebSocket08FrameEncoder.llIlIIIllIIIIl[WebSocket08FrameEncoder.llIlIIIllIIlII[9]]).append(llllllllllllIllIllIIllIIlIllIIlI)));
        }
        boolean llllllllllllIllIllIIllIIlIllIIII = WebSocket08FrameEncoder.llIlIIIllIIlII[0] != 0;
        ByteBuf llllllllllllIllIllIIllIIlIlIllll = null;
        try {
            int n;
            if (lIIlIIlIIIIlIIIl(this.maskPayload ? 1 : 0)) {
                n = WebSocket08FrameEncoder.llIlIIIllIIlII[7];
                "".length();
                if (((0x6E ^ 0x52) & ~(0x20 ^ 0x1C)) != 0x0) {
                    return;
                }
            }
            else {
                n = WebSocket08FrameEncoder.llIlIIIllIIlII[5];
            }
            final int llllllllllllIllIllIIllIIlIlllIIl = n;
            if (lIIlIIlIIIIlIlII(llllllllllllIllIllIIllIIlIllIIlI, WebSocket08FrameEncoder.llIlIIIllIIlII[8])) {
                int llllllllllllIllIllIIllIIllIIIIlI = WebSocket08FrameEncoder.llIlIIIllIIlII[4] + llllllllllllIllIllIIllIIlIlllIIl;
                if (lIIlIIlIIIIlIIIl(this.maskPayload ? 1 : 0)) {
                    llllllllllllIllIllIIllIIllIIIIlI += llllllllllllIllIllIIllIIlIllIIlI;
                }
                llllllllllllIllIllIIllIIlIlIllll = llllllllllllIllIllIIllIIlIlIllIl.alloc().buffer(llllllllllllIllIllIIllIIllIIIIlI);
                llllllllllllIllIllIIllIIlIlIllll.writeByte(llllllllllllIllIllIIllIIlIllIIIl);
                "".length();
                int n2;
                if (lIIlIIlIIIIlIIIl(this.maskPayload ? 1 : 0)) {
                    n2 = (WebSocket08FrameEncoder.llIlIIIllIIlII[6] | (byte)llllllllllllIllIllIIllIIlIllIIlI);
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else {
                    n2 = (byte)llllllllllllIllIllIIllIIlIllIIlI;
                }
                final byte llllllllllllIllIllIIllIIllIIIIIl = (byte)n2;
                llllllllllllIllIllIIllIIlIlIllll.writeByte(llllllllllllIllIllIIllIIllIIIIIl);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIIlIIlIIIIlIlII(llllllllllllIllIllIIllIIlIllIIlI, WebSocket08FrameEncoder.llIlIIIllIIlII[10])) {
                int llllllllllllIllIllIIllIIllIIIIII = WebSocket08FrameEncoder.llIlIIIllIIlII[7] + llllllllllllIllIllIIllIIlIlllIIl;
                if (lIIlIIlIIIIlIIIl(this.maskPayload ? 1 : 0)) {
                    llllllllllllIllIllIIllIIllIIIIII += llllllllllllIllIllIIllIIlIllIIlI;
                }
                llllllllllllIllIllIIllIIlIlIllll = llllllllllllIllIllIIllIIlIlIllIl.alloc().buffer(llllllllllllIllIllIIllIIllIIIIII);
                llllllllllllIllIllIIllIIlIlIllll.writeByte(llllllllllllIllIllIIllIIlIllIIIl);
                "".length();
                final ByteBuf byteBuf = llllllllllllIllIllIIllIIlIlIllll;
                int n3;
                if (lIIlIIlIIIIlIIIl(this.maskPayload ? 1 : 0)) {
                    n3 = WebSocket08FrameEncoder.llIlIIIllIIlII[11];
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                }
                else {
                    n3 = WebSocket08FrameEncoder.llIlIIIllIIlII[12];
                }
                byteBuf.writeByte(n3);
                "".length();
                llllllllllllIllIllIIllIIlIlIllll.writeByte(llllllllllllIllIllIIllIIlIllIIlI >>> WebSocket08FrameEncoder.llIlIIIllIIlII[3] & WebSocket08FrameEncoder.llIlIIIllIIlII[13]);
                "".length();
                llllllllllllIllIllIIllIIlIlIllll.writeByte(llllllllllllIllIllIIllIIlIllIIlI & WebSocket08FrameEncoder.llIlIIIllIIlII[13]);
                "".length();
                "".length();
                if (((0x1A ^ 0x1F) & ~(0xC4 ^ 0xC1)) != 0x0) {
                    return;
                }
            }
            else {
                int llllllllllllIllIllIIllIIlIllllll = WebSocket08FrameEncoder.llIlIIIllIIlII[2] + llllllllllllIllIllIIllIIlIlllIIl;
                if (lIIlIIlIIIIlIIIl(this.maskPayload ? 1 : 0)) {
                    llllllllllllIllIllIIllIIlIllllll += llllllllllllIllIllIIllIIlIllIIlI;
                }
                llllllllllllIllIllIIllIIlIlIllll = llllllllllllIllIllIIllIIlIlIllIl.alloc().buffer(llllllllllllIllIllIIllIIlIllllll);
                llllllllllllIllIllIIllIIlIlIllll.writeByte(llllllllllllIllIllIIllIIlIllIIIl);
                "".length();
                final ByteBuf byteBuf2 = llllllllllllIllIllIIllIIlIlIllll;
                int n4;
                if (lIIlIIlIIIIlIIIl(this.maskPayload ? 1 : 0)) {
                    n4 = WebSocket08FrameEncoder.llIlIIIllIIlII[13];
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return;
                    }
                }
                else {
                    n4 = WebSocket08FrameEncoder.llIlIIIllIIlII[14];
                }
                byteBuf2.writeByte(n4);
                "".length();
                llllllllllllIllIllIIllIIlIlIllll.writeLong(llllllllllllIllIllIIllIIlIllIIlI);
                "".length();
            }
            if (lIIlIIlIIIIlIIIl(this.maskPayload ? 1 : 0)) {
                final int llllllllllllIllIllIIllIIlIllllII = (int)(Math.random() * 2.147483647E9);
                final byte[] llllllllllllIllIllIIllIIlIlllIlI = ByteBuffer.allocate(WebSocket08FrameEncoder.llIlIIIllIIlII[7]).putInt(llllllllllllIllIllIIllIIlIllllII).array();
                llllllllllllIllIllIIllIIlIlIllll.writeBytes(llllllllllllIllIllIIllIIlIlllIlI);
                "".length();
                int llllllllllllIllIllIIllIIlIlllIll = WebSocket08FrameEncoder.llIlIIIllIIlII[5];
                int llllllllllllIllIllIIllIIlIllllIl = llllllllllllIllIllIIllIIlIllIlII.readerIndex();
                while (lIIlIIlIIIIlIlIl(llllllllllllIllIllIIllIIlIllllIl, llllllllllllIllIllIIllIIlIllIlII.writerIndex())) {
                    final byte llllllllllllIllIllIIllIIlIlllllI = llllllllllllIllIllIIllIIlIllIlII.getByte(llllllllllllIllIllIIllIIlIllllIl);
                    llllllllllllIllIllIIllIIlIlIllll.writeByte(llllllllllllIllIllIIllIIlIlllllI ^ llllllllllllIllIllIIllIIlIlllIlI[llllllllllllIllIllIIllIIlIlllIll++ % WebSocket08FrameEncoder.llIlIIIllIIlII[7]]);
                    "".length();
                    ++llllllllllllIllIllIIllIIlIllllIl;
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                }
                llllllllllllIllIllIIllIIlIllIlIl.add(llllllllllllIllIllIIllIIlIlIllll);
                "".length();
                "".length();
                if ((42 + 192 - 64 + 23 ^ 30 + 165 - 177 + 179) <= ((0x2 ^ 0x75 ^ (0x1C ^ 0x2D)) & (0x4D ^ 0x18 ^ (0x56 ^ 0x45) ^ -" ".length()))) {
                    return;
                }
            }
            else if (lIIlIIlIIIIlIllI(llllllllllllIllIllIIllIIlIlIllll.writableBytes(), llllllllllllIllIllIIllIIlIllIlII.readableBytes())) {
                llllllllllllIllIllIIllIIlIlIllll.writeBytes(llllllllllllIllIllIIllIIlIllIlII);
                "".length();
                llllllllllllIllIllIIllIIlIllIlIl.add(llllllllllllIllIllIIllIIlIlIllll);
                "".length();
                "".length();
                if (((0x35 ^ 0x2) & ~(0x5A ^ 0x6D)) > "  ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIllIllIIllIIlIllIlIl.add(llllllllllllIllIllIIllIIlIlIllll);
                "".length();
                llllllllllllIllIllIIllIIlIllIlIl.add(llllllllllllIllIllIIllIIlIllIlII.retain());
                "".length();
            }
            llllllllllllIllIllIIllIIlIllIIII = (WebSocket08FrameEncoder.llIlIIIllIIlII[5] != 0);
            if (lIIlIIlIIIIlIIIl(llllllllllllIllIllIIllIIlIllIIII ? 1 : 0) && lIIlIIlIIIIlIlll(llllllllllllIllIllIIllIIlIlIllll)) {
                llllllllllllIllIllIIllIIlIlIllll.release();
                "".length();
                "".length();
                if ("  ".length() <= ((217 + 62 - 198 + 156 ^ 93 + 62 + 1 + 4) & (0x77 ^ 0x49 ^ (0x2D ^ 0x5E) ^ -" ".length()))) {
                    return;
                }
            }
        }
        finally {
            if (lIIlIIlIIIIlIIIl(llllllllllllIllIllIIllIIlIllIIII ? 1 : 0) && lIIlIIlIIIIlIlll(llllllllllllIllIllIIllIIlIlIllll)) {
                llllllllllllIllIllIIllIIlIlIllll.release();
                "".length();
            }
        }
    }
    
    private static void lIIlIIlIIIIIlIll() {
        (llIlIIIllIIIIl = new String[WebSocket08FrameEncoder.llIlIIIllIIlII[7]])[WebSocket08FrameEncoder.llIlIIIllIIlII[5]] = lIIlIIlIIIIIlIII("N9KWUj8sOdjszUdxyEpX8YRJPEamyWibDa979mBwgkI=", "Gmojg");
        WebSocket08FrameEncoder.llIlIIIllIIIIl[WebSocket08FrameEncoder.llIlIIIllIIlII[0]] = lIIlIIlIIIIIlIIl("EXbps+v5kWKiojBnLM/DUtKpO9N3AaklCHDn5xXwCTsE9vFHd/4ktA==", "ZvutL");
        WebSocket08FrameEncoder.llIlIIIllIIIIl[WebSocket08FrameEncoder.llIlIIIllIIlII[4]] = lIIlIIlIIIIIlIII("+7Jd6aIGx+UC4+n8bc7Cfw==", "XSUbd");
        WebSocket08FrameEncoder.llIlIIIllIIIIl[WebSocket08FrameEncoder.llIlIIIllIIlII[9]] = lIIlIIlIIIIIlIlI("MA8zBgIwBWUXDyANKgYKeQcqFU4JKAsgTnERJB4CNgAhRwI8DyITBnkMMBQaeQMgR1JkQXRVW3VBMgYdeQ==", "YaEgn");
    }
    
    private static boolean lIIlIIlIIIIlIIll(final int llllllllllllIllIllIIllIIIlIIllIl, final int llllllllllllIllIllIIllIIIlIIllII) {
        return llllllllllllIllIllIIllIIIlIIllIl > llllllllllllIllIllIIllIIIlIIllII;
    }
    
    private static boolean lIIlIIlIIIIlIlIl(final int llllllllllllIllIllIIllIIIlIlIlIl, final int llllllllllllIllIllIIllIIIlIlIlII) {
        return llllllllllllIllIllIIllIIIlIlIlIl < llllllllllllIllIllIIllIIIlIlIlII;
    }
    
    private static String lIIlIIlIIIIIlIlI(String llllllllllllIllIllIIllIIlIIIIIlI, final String llllllllllllIllIllIIllIIlIIIIIIl) {
        llllllllllllIllIllIIllIIlIIIIIlI = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIIllIIlIIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIllIIlIIIIlIl = new StringBuilder();
        final char[] llllllllllllIllIllIIllIIlIIIIlII = llllllllllllIllIllIIllIIlIIIIIIl.toCharArray();
        int llllllllllllIllIllIIllIIlIIIIIll = WebSocket08FrameEncoder.llIlIIIllIIlII[5];
        final String llllllllllllIllIllIIllIIIlllllIl = (Object)((String)llllllllllllIllIllIIllIIlIIIIIlI).toCharArray();
        final long llllllllllllIllIllIIllIIIlllllII = llllllllllllIllIllIIllIIIlllllIl.length;
        int llllllllllllIllIllIIllIIIllllIll = WebSocket08FrameEncoder.llIlIIIllIIlII[5];
        while (lIIlIIlIIIIlIlIl(llllllllllllIllIllIIllIIIllllIll, (int)llllllllllllIllIllIIllIIIlllllII)) {
            final char llllllllllllIllIllIIllIIlIIIlIII = llllllllllllIllIllIIllIIIlllllIl[llllllllllllIllIllIIllIIIllllIll];
            llllllllllllIllIllIIllIIlIIIIlIl.append((char)(llllllllllllIllIllIIllIIlIIIlIII ^ llllllllllllIllIllIIllIIlIIIIlII[llllllllllllIllIllIIllIIlIIIIIll % llllllllllllIllIllIIllIIlIIIIlII.length]));
            "".length();
            ++llllllllllllIllIllIIllIIlIIIIIll;
            ++llllllllllllIllIllIIllIIIllllIll;
            "".length();
            if ("   ".length() >= (0xA0 ^ 0x85 ^ (0x68 ^ 0x49))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIllIIlIIIIlIl);
    }
    
    private static String lIIlIIlIIIIIlIII(final String llllllllllllIllIllIIllIIIllIIlIl, final String llllllllllllIllIllIIllIIIllIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIllIIllIIIllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIllIIIllIIIlI.getBytes(StandardCharsets.UTF_8)), WebSocket08FrameEncoder.llIlIIIllIIlII[3]), "DES");
            final Cipher llllllllllllIllIllIIllIIIllIIlll = Cipher.getInstance("DES");
            llllllllllllIllIllIIllIIIllIIlll.init(WebSocket08FrameEncoder.llIlIIIllIIlII[4], llllllllllllIllIllIIllIIIllIlIII);
            return new String(llllllllllllIllIllIIllIIIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIllIIIllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIllIIIllIIllI) {
            llllllllllllIllIllIIllIIIllIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIlIIIIlIllI(final int llllllllllllIllIllIIllIIIlIllIIl, final int llllllllllllIllIllIIllIIIlIllIII) {
        return llllllllllllIllIllIIllIIIlIllIIl >= llllllllllllIllIllIIllIIIlIllIII;
    }
    
    private static boolean lIIlIIlIIIIlIIIl(final int llllllllllllIllIllIIllIIIlIIlIII) {
        return llllllllllllIllIllIIllIIIlIIlIII != 0;
    }
    
    private static void lIIlIIlIIIIlIIII() {
        (llIlIIIllIIlII = new int[15])[0] = " ".length();
        WebSocket08FrameEncoder.llIlIIIllIIlII[1] = (0x6B ^ 0x62);
        WebSocket08FrameEncoder.llIlIIIllIIlII[2] = (0x8B ^ 0x81);
        WebSocket08FrameEncoder.llIlIIIllIIlII[3] = (0x8A ^ 0x82);
        WebSocket08FrameEncoder.llIlIIIllIIlII[4] = "  ".length();
        WebSocket08FrameEncoder.llIlIIIllIIlII[5] = ((0xD2 ^ 0x95) & ~(0xCA ^ 0x8D));
        WebSocket08FrameEncoder.llIlIIIllIIlII[6] = (0x90 ^ 0x88) + (0x76 ^ 0x3) - (0x1F ^ 0x40) + (0xE ^ 0x5C);
        WebSocket08FrameEncoder.llIlIIIllIIlII[7] = (0xD9 ^ 0xA2 ^ 31 + 77 + 1 + 18);
        WebSocket08FrameEncoder.llIlIIIllIIlII[8] = (124 + 3 + 26 + 40 ^ 90 + 120 - 51 + 29);
        WebSocket08FrameEncoder.llIlIIIllIIlII[9] = "   ".length();
        WebSocket08FrameEncoder.llIlIIIllIIlII[10] = (-1 & 0xFFFF);
        WebSocket08FrameEncoder.llIlIIIllIIlII[11] = 93 + 76 - 111 + 86 + (0x11 ^ 0x58) - (82 + 107 - 166 + 142) + (95 + 56 - 99 + 150);
        WebSocket08FrameEncoder.llIlIIIllIIlII[12] = (0x38 ^ 0x22 ^ (0xE5 ^ 0x81));
        WebSocket08FrameEncoder.llIlIIIllIIlII[13] = 167 + 54 - 60 + 94;
        WebSocket08FrameEncoder.llIlIIIllIIlII[14] = 50 + 84 - 19 + 12;
    }
    
    static {
        lIIlIIlIIIIlIIII();
        lIIlIIlIIIIIlIll();
        OPCODE_CONT = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[5];
        OPCODE_TEXT = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[0];
        OPCODE_BINARY = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[4];
        OPCODE_CLOSE = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[3];
        OPCODE_PONG = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[2];
        OPCODE_PING = (byte)WebSocket08FrameEncoder.llIlIIIllIIlII[1];
        logger = InternalLoggerFactory.getInstance(WebSocket08FrameEncoder.class);
    }
}
