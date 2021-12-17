// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.TooLongFrameException;
import io.netty.buffer.CompositeByteBuf;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

public class WebSocketFrameAggregator extends MessageToMessageDecoder<WebSocketFrame>
{
    private static final /* synthetic */ String[] llllIlIIIIlII;
    private static final /* synthetic */ int[] llllIlIIIIllI;
    private /* synthetic */ WebSocketFrame currentFrame;
    private final /* synthetic */ int maxFrameSize;
    private /* synthetic */ boolean tooLongFrameFound;
    
    @Override
    public void channelInactive(final ChannelHandlerContext lllllllllllllIlIlllIIIIIlIIlllII) throws Exception {
        super.channelInactive(lllllllllllllIlIlllIIIIIlIIlllII);
        if (lIlIlIIllIlIlII(this.currentFrame)) {
            this.currentFrame.release();
            "".length();
            this.currentFrame = null;
        }
    }
    
    private static boolean lIlIlIIllIIllIl(final int lllllllllllllIlIlllIIIIIIIIllllI, final int lllllllllllllIlIlllIIIIIIIIlllIl) {
        return lllllllllllllIlIlllIIIIIIIIllllI < lllllllllllllIlIlllIIIIIIIIlllIl;
    }
    
    static {
        lIlIlIIllIIlIll();
        lIlIlIIllIIIlIl();
    }
    
    public WebSocketFrameAggregator(final int lllllllllllllIlIlllIIIIIllIlIlII) {
        if (lIlIlIIllIIllIl(lllllllllllllIlIlllIIIIIllIlIlII, WebSocketFrameAggregator.llllIlIIIIllI[0])) {
            throw new IllegalArgumentException(WebSocketFrameAggregator.llllIlIIIIlII[WebSocketFrameAggregator.llllIlIIIIllI[1]]);
        }
        this.maxFrameSize = lllllllllllllIlIlllIIIIIllIlIlII;
    }
    
    private static String lIlIlIIllIIIlII(String lllllllllllllIlIlllIIIIIIlIlllIl, final String lllllllllllllIlIlllIIIIIIllIIIlI) {
        lllllllllllllIlIlllIIIIIIlIlllIl = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIIIIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIIIIIIllIIIIl = new StringBuilder();
        final char[] lllllllllllllIlIlllIIIIIIllIIIII = lllllllllllllIlIlllIIIIIIllIIIlI.toCharArray();
        int lllllllllllllIlIlllIIIIIIlIlllll = WebSocketFrameAggregator.llllIlIIIIllI[1];
        final int lllllllllllllIlIlllIIIIIIlIllIII = (Object)lllllllllllllIlIlllIIIIIIlIlllIl.toCharArray();
        final int lllllllllllllIlIlllIIIIIIlIlIllI = lllllllllllllIlIlllIIIIIIlIllIII.length;
        short lllllllllllllIlIlllIIIIIIlIlIlIl = (short)WebSocketFrameAggregator.llllIlIIIIllI[1];
        while (lIlIlIIllIIllIl(lllllllllllllIlIlllIIIIIIlIlIlIl, lllllllllllllIlIlllIIIIIIlIlIllI)) {
            final char lllllllllllllIlIlllIIIIIIllIIlIl = lllllllllllllIlIlllIIIIIIlIllIII[lllllllllllllIlIlllIIIIIIlIlIlIl];
            lllllllllllllIlIlllIIIIIIllIIIIl.append((char)(lllllllllllllIlIlllIIIIIIllIIlIl ^ lllllllllllllIlIlllIIIIIIllIIIII[lllllllllllllIlIlllIIIIIIlIlllll % lllllllllllllIlIlllIIIIIIllIIIII.length]));
            "".length();
            ++lllllllllllllIlIlllIIIIIIlIlllll;
            ++lllllllllllllIlIlllIIIIIIlIlIlIl;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIIIIIIllIIIIl);
    }
    
    private static boolean lIlIlIIllIlIIll(final int lllllllllllllIlIlllIIIIIIIIllIlI, final int lllllllllllllIlIlllIIIIIIIIllIIl) {
        return lllllllllllllIlIlllIIIIIIIIllIlI > lllllllllllllIlIlllIIIIIIIIllIIl;
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIlIlllIIIIIlIllIIll, final WebSocketFrame lllllllllllllIlIlllIIIIIlIllIIIl, final List<Object> lllllllllllllIlIlllIIIIIlIlIlIII) throws Exception {
        if (lIlIlIIllIIllll(this.currentFrame)) {
            this.tooLongFrameFound = (WebSocketFrameAggregator.llllIlIIIIllI[1] != 0);
            if (lIlIlIIllIlIIIl(lllllllllllllIlIlllIIIIIlIllIIIl.isFinalFragment() ? 1 : 0)) {
                lllllllllllllIlIlllIIIIIlIlIlIII.add(lllllllllllllIlIlllIIIIIlIllIIIl.retain());
                "".length();
                return;
            }
            final ByteBuf lllllllllllllIlIlllIIIIIlIlllIlI = lllllllllllllIlIlllIIIIIlIllIIll.alloc().compositeBuffer().addComponent(lllllllllllllIlIlllIIIIIlIllIIIl.content().retain());
            lllllllllllllIlIlllIIIIIlIlllIlI.writerIndex(lllllllllllllIlIlllIIIIIlIlllIlI.writerIndex() + lllllllllllllIlIlllIIIIIlIllIIIl.content().readableBytes());
            "".length();
            if (lIlIlIIllIlIIIl((lllllllllllllIlIlllIIIIIlIllIIIl instanceof TextWebSocketFrame) ? 1 : 0)) {
                this.currentFrame = new TextWebSocketFrame((boolean)(WebSocketFrameAggregator.llllIlIIIIllI[0] != 0), lllllllllllllIlIlllIIIIIlIllIIIl.rsv(), lllllllllllllIlIlllIIIIIlIlllIlI);
                "".length();
                if (((116 + 107 - 141 + 85 ^ 101 + 1 + 11 + 37) & (0xD9 ^ 0x84 ^ (0xE7 ^ 0x8B) ^ -" ".length())) > ((0x8 ^ 0x3B ^ (0x81 ^ 0xBA)) & (107 + 105 - 97 + 60 ^ 100 + 51 - 74 + 90 ^ -" ".length()))) {
                    return;
                }
            }
            else {
                if (!lIlIlIIllIlIIIl((lllllllllllllIlIlllIIIIIlIllIIIl instanceof BinaryWebSocketFrame) ? 1 : 0)) {
                    lllllllllllllIlIlllIIIIIlIlllIlI.release();
                    "".length();
                    throw new IllegalStateException(WebSocketFrameAggregator.llllIlIIIIlII[WebSocketFrameAggregator.llllIlIIIIllI[0]]);
                }
                this.currentFrame = new BinaryWebSocketFrame((boolean)(WebSocketFrameAggregator.llllIlIIIIllI[0] != 0), lllllllllllllIlIlllIIIIIlIllIIIl.rsv(), lllllllllllllIlIlllIIIIIlIlllIlI);
                "".length();
                if (((0x2 ^ 0x7C ^ (0x1F ^ 0x58)) & (0x2F ^ 0x3 ^ (0x42 ^ 0x57) ^ -" ".length())) > " ".length()) {
                    return;
                }
            }
        }
        else {
            if (!lIlIlIIllIlIIIl((lllllllllllllIlIlllIIIIIlIllIIIl instanceof ContinuationWebSocketFrame) ? 1 : 0)) {
                lllllllllllllIlIlllIIIIIlIlIlIII.add(lllllllllllllIlIlllIIIIIlIllIIIl.retain());
                "".length();
                return;
            }
            if (lIlIlIIllIlIIIl(this.tooLongFrameFound ? 1 : 0)) {
                if (lIlIlIIllIlIIIl(lllllllllllllIlIlllIIIIIlIllIIIl.isFinalFragment() ? 1 : 0)) {
                    this.currentFrame = null;
                }
                return;
            }
            final CompositeByteBuf lllllllllllllIlIlllIIIIIlIllIlll = (CompositeByteBuf)this.currentFrame.content();
            if (lIlIlIIllIlIIll(lllllllllllllIlIlllIIIIIlIllIlll.readableBytes(), this.maxFrameSize - lllllllllllllIlIlllIIIIIlIllIIIl.content().readableBytes())) {
                this.currentFrame.release();
                "".length();
                this.tooLongFrameFound = (WebSocketFrameAggregator.llllIlIIIIllI[0] != 0);
                throw new TooLongFrameException(String.valueOf(new StringBuilder().append(WebSocketFrameAggregator.llllIlIIIIlII[WebSocketFrameAggregator.llllIlIIIIllI[2]]).append(lllllllllllllIlIlllIIIIIlIllIlll).append(WebSocketFrameAggregator.llllIlIIIIlII[WebSocketFrameAggregator.llllIlIIIIllI[3]])));
            }
            lllllllllllllIlIlllIIIIIlIllIlll.addComponent(lllllllllllllIlIlllIIIIIlIllIIIl.content().retain());
            "".length();
            lllllllllllllIlIlllIIIIIlIllIlll.writerIndex(lllllllllllllIlIlllIIIIIlIllIlll.writerIndex() + lllllllllllllIlIlllIIIIIlIllIIIl.content().readableBytes());
            "".length();
            if (lIlIlIIllIlIIIl(lllllllllllllIlIlllIIIIIlIllIIIl.isFinalFragment() ? 1 : 0)) {
                final WebSocketFrame lllllllllllllIlIlllIIIIIlIlllIII = this.currentFrame;
                this.currentFrame = null;
                lllllllllllllIlIlllIIIIIlIlIlIII.add(lllllllllllllIlIlllIIIIIlIlllIII);
                "".length();
            }
        }
    }
    
    @Override
    public void handlerRemoved(final ChannelHandlerContext lllllllllllllIlIlllIIIIIlIIlIIII) throws Exception {
        super.handlerRemoved(lllllllllllllIlIlllIIIIIlIIlIIII);
        if (lIlIlIIllIlIlII(this.currentFrame)) {
            this.currentFrame.release();
            "".length();
            this.currentFrame = null;
        }
    }
    
    private static String lIlIlIIllIIIIlI(final String lllllllllllllIlIlllIIIIIIIlIlIII, final String lllllllllllllIlIlllIIIIIIIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIIIIIIllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIIIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), WebSocketFrameAggregator.llllIlIIIIllI[5]), "DES");
            final Cipher lllllllllllllIlIlllIIIIIIIlIllll = Cipher.getInstance("DES");
            lllllllllllllIlIlllIIIIIIIlIllll.init(WebSocketFrameAggregator.llllIlIIIIllI[2], lllllllllllllIlIlllIIIIIIIllIIIl);
            return new String(lllllllllllllIlIlllIIIIIIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIIIIIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIIIIIIlIllIl) {
            lllllllllllllIlIlllIIIIIIIlIllIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIlIIllIIlIll() {
        (llllIlIIIIllI = new int[6])[0] = " ".length();
        WebSocketFrameAggregator.llllIlIIIIllI[1] = ((0x1E ^ 0x50) & ~(0x3F ^ 0x71));
        WebSocketFrameAggregator.llllIlIIIIllI[2] = "  ".length();
        WebSocketFrameAggregator.llllIlIIIIllI[3] = "   ".length();
        WebSocketFrameAggregator.llllIlIIIIllI[4] = (0x59 ^ 0x5D);
        WebSocketFrameAggregator.llllIlIIIIllI[5] = (0x6D ^ 0x39 ^ (0x66 ^ 0x3A));
    }
    
    private static String lIlIlIIllIIIIll(final String lllllllllllllIlIlllIIIIIIlIIIIlI, final String lllllllllllllIlIlllIIIIIIIlllllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIIIIIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIIIIIIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIIIIIIlIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIIIIIIlIIIlIl.init(WebSocketFrameAggregator.llllIlIIIIllI[2], lllllllllllllIlIlllIIIIIIlIIIlll);
            return new String(lllllllllllllIlIlllIIIIIIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIIIIIlIIIIll) {
            lllllllllllllIlIlllIIIIIIlIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlIIllIIllll(final Object lllllllllllllIlIlllIIIIIIIIlIIIl) {
        return lllllllllllllIlIlllIIIIIIIIlIIIl == null;
    }
    
    private static boolean lIlIlIIllIlIIIl(final int lllllllllllllIlIlllIIIIIIIIIllII) {
        return lllllllllllllIlIlllIIIIIIIIIllII != 0;
    }
    
    private static boolean lIlIlIIllIlIlII(final Object lllllllllllllIlIlllIIIIIIIIlIlIl) {
        return lllllllllllllIlIlllIIIIIIIIlIlIl != null;
    }
    
    private static void lIlIlIIllIIIlIl() {
        (llllIlIIIIlII = new String[WebSocketFrameAggregator.llllIlIIIIllI[4]])[WebSocketFrameAggregator.llllIlIIIIllI[1]] = lIlIlIIllIIIIlI("obYvAwf7gFs9cCCGvti4xTsjQGU0D5IxwwttA+FNK4A=", "PVVdw");
        WebSocketFrameAggregator.llllIlIIIIlII[WebSocketFrameAggregator.llllIlIIIIllI[0]] = lIlIlIIllIIIIll("A3mVq3AzJ8LoyT6L+FyvZcCOqjoqXKclPbDso9jDKCacZxqAXy5R3RgKnlPQL6ZDRgmPEdvJDbGfR/NgsWaZExgKnlPQL6ZD9LlvA0z+oJg=", "jpcmB");
        WebSocketFrameAggregator.llllIlIIIIlII[WebSocketFrameAggregator.llllIlIIIIllI[2]] = lIlIlIIllIIIIll("8xThNIgTI8daFCstIAlskRVcZbTJyfUk7u93ky9hjoo=", "ywVng");
        WebSocketFrameAggregator.llllIlIIIIlII[WebSocketFrameAggregator.llllIlIIIIllI[3]] = lIlIlIIllIIIlII("aCA9Pzw7bA==", "HBDKY");
    }
}
