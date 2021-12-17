// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import io.netty.handler.codec.TooLongFrameException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;

public class WebSocket00FrameDecoder extends ReplayingDecoder<Void> implements WebSocketFrameDecoder
{
    private static final /* synthetic */ String[] lIIlllllllIIII;
    private static final /* synthetic */ int[] lIIlllllllIIlI;
    private /* synthetic */ boolean receivedClosingHandshake;
    private final /* synthetic */ long maxFrameSize;
    
    private static boolean llIlllllIlIlllI(final Object lllllllllllllIIlIIIlllIllIIlIlII) {
        return lllllllllllllIIlIIIlllIllIIlIlII != null;
    }
    
    private static void llIlllllIlIlIlI() {
        (lIIlllllllIIII = new String[WebSocket00FrameDecoder.lIIlllllllIIlI[7]])[WebSocket00FrameDecoder.lIIlllllllIIlI[2]] = llIlllllIlIlIIl("vNLHvvvjmGnDc8fJcHAekPBizCCrwvSrewwnLCxNtwwBY+1KUYf5tA==", "XLzLJ");
    }
    
    private static int llIlllllIlIllll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    static {
        llIlllllIlIlIll();
        llIlllllIlIlIlI();
        DEFAULT_MAX_FRAME_SIZE = WebSocket00FrameDecoder.lIIlllllllIIlI[0];
    }
    
    private static boolean llIlllllIllIIII(final int lllllllllllllIIlIIIlllIllIIIllII) {
        return lllllllllllllIIlIIIlllIllIIIllII > 0;
    }
    
    public WebSocket00FrameDecoder() {
        this(WebSocket00FrameDecoder.lIIlllllllIIlI[0]);
    }
    
    private static void llIlllllIlIlIll() {
        (lIIlllllllIIlI = new int[9])[0] = (-(0xFFFFBFBF & 0x7DF6) & (0xFFFFFDBF & 0x7FF5));
        WebSocket00FrameDecoder.lIIlllllllIIlI[1] = (0x6 ^ 0x42) + (0x5A ^ 0x1B) - (95 + 70 - 161 + 123) + (0xDC ^ 0xA6);
        WebSocket00FrameDecoder.lIIlllllllIIlI[2] = ((0xCA ^ 0x98) & ~(0x45 ^ 0x17));
        WebSocket00FrameDecoder.lIIlllllllIIlI[3] = (0x48 ^ 0x4F);
        WebSocket00FrameDecoder.lIIlllllllIIlI[4] = 51 + 43 - 88 + 121;
        WebSocket00FrameDecoder.lIIlllllllIIlI[5] = (85 + 112 - 187 + 134 ^ 66 + 99 - 65 + 52);
        WebSocket00FrameDecoder.lIIlllllllIIlI[6] = -" ".length();
        WebSocket00FrameDecoder.lIIlllllllIIlI[7] = " ".length();
        WebSocket00FrameDecoder.lIIlllllllIIlI[8] = "  ".length();
    }
    
    private static int llIlllllIllIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private WebSocketFrame decodeBinaryFrame(final ChannelHandlerContext lllllllllllllIIlIIIlllIlllIIllII, final byte lllllllllllllIIlIIIlllIlllIIlIll, final ByteBuf lllllllllllllIIlIIIlllIlllIlIIlI) {
        long lllllllllllllIIlIIIlllIlllIlIIIl = 0L;
        int lllllllllllllIIlIIIlllIlllIlIIII = WebSocket00FrameDecoder.lIIlllllllIIlI[2];
        byte lllllllllllllIIlIIIlllIlllIIllll;
        do {
            lllllllllllllIIlIIIlllIlllIIllll = lllllllllllllIIlIIIlllIlllIlIIlI.readByte();
            lllllllllllllIIlIIIlllIlllIlIIIl <<= WebSocket00FrameDecoder.lIIlllllllIIlI[3];
            lllllllllllllIIlIIIlllIlllIlIIIl |= (lllllllllllllIIlIIIlllIlllIIllll & WebSocket00FrameDecoder.lIIlllllllIIlI[4]);
            if (llIlllllIllIIII(llIlllllIlIllll(lllllllllllllIIlIIIlllIlllIlIIIl, this.maxFrameSize))) {
                throw new TooLongFrameException();
            }
            if (llIlllllIllIIIl(++lllllllllllllIIlIIIlllIlllIlIIII, WebSocket00FrameDecoder.lIIlllllllIIlI[5])) {
                throw new TooLongFrameException();
            }
        } while (!llIlllllIllIIlI(lllllllllllllIIlIIIlllIlllIIllll & WebSocket00FrameDecoder.lIIlllllllIIlI[1], WebSocket00FrameDecoder.lIIlllllllIIlI[1]));
        if (llIlllllIlIllIl(lllllllllllllIIlIIIlllIlllIIlIll, WebSocket00FrameDecoder.lIIlllllllIIlI[6]) && llIlllllIllIIll(llIlllllIlIllll(lllllllllllllIIlIIIlllIlllIlIIIl, 0L))) {
            this.receivedClosingHandshake = (WebSocket00FrameDecoder.lIIlllllllIIlI[7] != 0);
            return new CloseWebSocketFrame();
        }
        final ByteBuf lllllllllllllIIlIIIlllIlllIIlllI = lllllllllllllIIlIIIlllIlllIIllII.alloc().buffer((int)lllllllllllllIIlIIIlllIlllIlIIIl);
        lllllllllllllIIlIIIlllIlllIlIIlI.readBytes(lllllllllllllIIlIIIlllIlllIIlllI);
        "".length();
        return new BinaryWebSocketFrame(lllllllllllllIIlIIIlllIlllIIlllI);
    }
    
    public WebSocket00FrameDecoder(final int lllllllllllllIIlIIIlllIlllllIIll) {
        this.maxFrameSize = lllllllllllllIIlIIIlllIlllllIIll;
    }
    
    private static boolean llIlllllIlIllII(final int lllllllllllllIIlIIIlllIllIIlIIlI) {
        return lllllllllllllIIlIIIlllIllIIlIIlI != 0;
    }
    
    private static boolean llIlllllIllIIlI(final int lllllllllllllIIlIIIlllIllIIIlIIl, final int lllllllllllllIIlIIIlllIllIIIlIII) {
        return lllllllllllllIIlIIIlllIllIIIlIIl != lllllllllllllIIlIIIlllIllIIIlIII;
    }
    
    private static boolean llIlllllIlIllIl(final int lllllllllllllIIlIIIlllIllIIllIll, final int lllllllllllllIIlIIIlllIllIIllIlI) {
        return lllllllllllllIIlIIIlllIllIIllIll == lllllllllllllIIlIIIlllIllIIllIlI;
    }
    
    private static boolean llIlllllIllIIll(final int lllllllllllllIIlIIIlllIllIIlIIII) {
        return lllllllllllllIIlIIIlllIllIIlIIII == 0;
    }
    
    private static boolean llIlllllIllIIIl(final int lllllllllllllIIlIIIlllIllIIlIlll, final int lllllllllllllIIlIIIlllIllIIlIllI) {
        return lllllllllllllIIlIIIlllIllIIlIlll > lllllllllllllIIlIIIlllIllIIlIllI;
    }
    
    private WebSocketFrame decodeTextFrame(final ChannelHandlerContext lllllllllllllIIlIIIlllIllIllIIlI, final ByteBuf lllllllllllllIIlIIIlllIllIlllIlI) {
        final int lllllllllllllIIlIIIlllIllIlllIIl = lllllllllllllIIlIIIlllIllIlllIlI.readerIndex();
        final int lllllllllllllIIlIIIlllIllIlllIII = this.actualReadableBytes();
        final int lllllllllllllIIlIIIlllIllIllIlll = lllllllllllllIIlIIIlllIllIlllIlI.indexOf(lllllllllllllIIlIIIlllIllIlllIIl, lllllllllllllIIlIIIlllIllIlllIIl + lllllllllllllIIlIIIlllIllIlllIII, (byte)WebSocket00FrameDecoder.lIIlllllllIIlI[6]);
        if (llIlllllIlIllIl(lllllllllllllIIlIIIlllIllIllIlll, WebSocket00FrameDecoder.lIIlllllllIIlI[6])) {
            if (llIlllllIllIIII(llIlllllIllIlII(lllllllllllllIIlIIIlllIllIlllIII, this.maxFrameSize))) {
                throw new TooLongFrameException();
            }
            return null;
        }
        else {
            final int lllllllllllllIIlIIIlllIllIllIllI = lllllllllllllIIlIIIlllIllIllIlll - lllllllllllllIIlIIIlllIllIlllIIl;
            if (llIlllllIllIIII(llIlllllIllIlII(lllllllllllllIIlIIIlllIllIllIllI, this.maxFrameSize))) {
                throw new TooLongFrameException();
            }
            final ByteBuf lllllllllllllIIlIIIlllIllIllIlIl = lllllllllllllIIlIIIlllIllIllIIlI.alloc().buffer(lllllllllllllIIlIIIlllIllIllIllI);
            lllllllllllllIIlIIIlllIllIlllIlI.readBytes(lllllllllllllIIlIIIlllIllIllIlIl);
            "".length();
            lllllllllllllIIlIIIlllIllIlllIlI.skipBytes(WebSocket00FrameDecoder.lIIlllllllIIlI[7]);
            "".length();
            final int lllllllllllllIIlIIIlllIllIllIlII = lllllllllllllIIlIIIlllIllIllIlIl.indexOf(lllllllllllllIIlIIIlllIllIllIlIl.readerIndex(), lllllllllllllIIlIIIlllIllIllIlIl.writerIndex(), (byte)WebSocket00FrameDecoder.lIIlllllllIIlI[6]);
            if (llIlllllIllIlIl(lllllllllllllIIlIIIlllIllIllIlII)) {
                throw new IllegalArgumentException(WebSocket00FrameDecoder.lIIlllllllIIII[WebSocket00FrameDecoder.lIIlllllllIIlI[2]]);
            }
            return new TextWebSocketFrame(lllllllllllllIIlIIIlllIllIllIlIl);
        }
    }
    
    private static boolean llIlllllIllIlIl(final int lllllllllllllIIlIIIlllIllIIIlllI) {
        return lllllllllllllIIlIIIlllIllIIIlllI >= 0;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIIlIIIlllIllllIIIlI, final ByteBuf lllllllllllllIIlIIIlllIllllIIlll, final List<Object> lllllllllllllIIlIIIlllIllllIIIII) throws Exception {
        if (llIlllllIlIllII(this.receivedClosingHandshake ? 1 : 0)) {
            lllllllllllllIIlIIIlllIllllIIlll.skipBytes(this.actualReadableBytes());
            "".length();
            return;
        }
        final byte lllllllllllllIIlIIIlllIllllIIlIl = lllllllllllllIIlIIIlllIllllIIlll.readByte();
        WebSocketFrame lllllllllllllIIlIIIlllIllllIIlII = null;
        if (llIlllllIlIllIl(lllllllllllllIIlIIIlllIllllIIlIl & WebSocket00FrameDecoder.lIIlllllllIIlI[1], WebSocket00FrameDecoder.lIIlllllllIIlI[1])) {
            final WebSocketFrame lllllllllllllIIlIIIlllIllllIlIlI = this.decodeBinaryFrame(lllllllllllllIIlIIIlllIllllIIIlI, lllllllllllllIIlIIIlllIllllIIlIl, lllllllllllllIIlIIIlllIllllIIlll);
            "".length();
            if ("   ".length() <= ((0xF5 ^ 0xBC) & ~(0x2 ^ 0x4B))) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIIlllIllllIIlII = this.decodeTextFrame(lllllllllllllIIlIIIlllIllllIIIlI, lllllllllllllIIlIIIlllIllllIIlll);
        }
        if (llIlllllIlIlllI(lllllllllllllIIlIIIlllIllllIIlII)) {
            lllllllllllllIIlIIIlllIllllIIIII.add(lllllllllllllIIlIIIlllIllllIIlII);
            "".length();
        }
    }
    
    private static String llIlllllIlIlIIl(final String lllllllllllllIIlIIIlllIllIlIIIll, final String lllllllllllllIIlIIIlllIllIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlllIllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlllIllIlIIIII.getBytes(StandardCharsets.UTF_8)), WebSocket00FrameDecoder.lIIlllllllIIlI[5]), "DES");
            final Cipher lllllllllllllIIlIIIlllIllIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIIlllIllIlIIlIl.init(WebSocket00FrameDecoder.lIIlllllllIIlI[8], lllllllllllllIIlIIIlllIllIlIIllI);
            return new String(lllllllllllllIIlIIIlllIllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlllIllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlllIllIlIIlII) {
            lllllllllllllIIlIIIlllIllIlIIlII.printStackTrace();
            return null;
        }
    }
}
