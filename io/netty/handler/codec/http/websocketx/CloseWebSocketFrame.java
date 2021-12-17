// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.util.CharsetUtil;
import io.netty.util.internal.EmptyArrays;
import io.netty.buffer.ByteBuf;
import io.netty.util.ReferenceCounted;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBufHolder;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class CloseWebSocketFrame extends WebSocketFrame
{
    private static final /* synthetic */ String[] llllIIIIlIIIl;
    private static final /* synthetic */ int[] llllIIIIlIlIl;
    
    private static String lIlIIlllIIIlIIl(final String lllllllllllllIlIllllIlIIIllIlIII, final String lllllllllllllIlIllllIlIIIllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIllllIlIIIllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIlIIIllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllllIlIIIllIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllllIlIIIllIllII.init(CloseWebSocketFrame.llllIIIIlIlIl[2], lllllllllllllIlIllllIlIIIllIllIl);
            return new String(lllllllllllllIlIllllIlIIIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIlIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllllIlIIIllIlIll) {
            lllllllllllllIlIllllIlIIIllIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public CloseWebSocketFrame duplicate() {
        return new CloseWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().duplicate());
    }
    
    public CloseWebSocketFrame(final boolean lllllllllllllIlIllllIlIIllIllIlI, final int lllllllllllllIlIllllIlIIllIllIIl, final int lllllllllllllIlIllllIlIIllIllIII, final String lllllllllllllIlIllllIlIIllIlIIlI) {
        super(lllllllllllllIlIllllIlIIllIllIlI, lllllllllllllIlIllllIlIIllIllIIl, newBinaryData(lllllllllllllIlIllllIlIIllIllIII, lllllllllllllIlIllllIlIIllIlIIlI));
    }
    
    private static boolean lIlIIlllIIIllll(final int lllllllllllllIlIllllIlIIIlIllIll) {
        return lllllllllllllIlIllllIlIIIlIllIll > 0;
    }
    
    private static void lIlIIlllIIIllIl() {
        (llllIIIIlIlIl = new int[4])[0] = ((0xB8 ^ 0x82 ^ (0x22 ^ 0x2E)) & (77 + 2 - 69 + 120 ^ 141 + 118 - 253 + 174 ^ -" ".length()));
        CloseWebSocketFrame.llllIIIIlIlIl[1] = " ".length();
        CloseWebSocketFrame.llllIIIIlIlIl[2] = "  ".length();
        CloseWebSocketFrame.llllIIIIlIlIl[3] = -" ".length();
    }
    
    public CloseWebSocketFrame(final boolean lllllllllllllIlIllllIlIIlllIIlIl, final int lllllllllllllIlIllllIlIIlllIIlII) {
        this(lllllllllllllIlIllllIlIIlllIIlIl, lllllllllllllIlIllllIlIIlllIIlII, Unpooled.buffer(CloseWebSocketFrame.llllIIIIlIlIl[0]));
    }
    
    private static void lIlIIlllIIIlIlI() {
        (llllIIIIlIIIl = new String[CloseWebSocketFrame.llllIIIIlIlIl[1]])[CloseWebSocketFrame.llllIIIIlIlIl[0]] = lIlIIlllIIIlIIl("jCz1thNTXbg=", "wfyeJ");
    }
    
    @Override
    public CloseWebSocketFrame retain() {
        super.retain();
        "".length();
        return this;
    }
    
    @Override
    public CloseWebSocketFrame retain(final int lllllllllllllIlIllllIlIIlIIllIIl) {
        super.retain(lllllllllllllIlIllllIlIIlIIllIIl);
        "".length();
        return this;
    }
    
    @Override
    public CloseWebSocketFrame copy() {
        return new CloseWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().copy());
    }
    
    private static ByteBuf newBinaryData(final int lllllllllllllIlIllllIlIIllIIllIl, final String lllllllllllllIlIllllIlIIllIIllII) {
        byte[] lllllllllllllIlIllllIlIIllIIlIll = EmptyArrays.EMPTY_BYTES;
        if (lIlIIlllIIIlllI(lllllllllllllIlIllllIlIIllIIllII)) {
            lllllllllllllIlIllllIlIIllIIlIll = lllllllllllllIlIllllIlIIllIIllII.getBytes(CharsetUtil.UTF_8);
        }
        final ByteBuf lllllllllllllIlIllllIlIIllIIlIlI = Unpooled.buffer(CloseWebSocketFrame.llllIIIIlIlIl[2] + lllllllllllllIlIllllIlIIllIIlIll.length);
        lllllllllllllIlIllllIlIIllIIlIlI.writeShort(lllllllllllllIlIllllIlIIllIIllIl);
        "".length();
        if (lIlIIlllIIIllll(lllllllllllllIlIllllIlIIllIIlIll.length)) {
            lllllllllllllIlIllllIlIIllIIlIlI.writeBytes(lllllllllllllIlIllllIlIIllIIlIll);
            "".length();
        }
        lllllllllllllIlIllllIlIIllIIlIlI.readerIndex(CloseWebSocketFrame.llllIIIIlIlIl[0]);
        "".length();
        return lllllllllllllIlIllllIlIIllIIlIlI;
    }
    
    private static boolean lIlIIlllIIlIIII(final int lllllllllllllIlIllllIlIIIlIlllIl) {
        return lllllllllllllIlIllllIlIIIlIlllIl == 0;
    }
    
    static {
        lIlIIlllIIIllIl();
        lIlIIlllIIIlIlI();
    }
    
    public String reasonText() {
        final ByteBuf lllllllllllllIlIllllIlIIlIlIllII = this.content();
        if (!lIlIIlllIIIlllI(lllllllllllllIlIllllIlIIlIlIllII) || lIlIIlllIIlIIIl(lllllllllllllIlIllllIlIIlIlIllII.capacity(), CloseWebSocketFrame.llllIIIIlIlIl[2])) {
            return CloseWebSocketFrame.llllIIIIlIIIl[CloseWebSocketFrame.llllIIIIlIlIl[0]];
        }
        lllllllllllllIlIllllIlIIlIlIllII.readerIndex(CloseWebSocketFrame.llllIIIIlIlIl[2]);
        "".length();
        final String lllllllllllllIlIllllIlIIlIlIlIll = lllllllllllllIlIllllIlIIlIlIllII.toString(CharsetUtil.UTF_8);
        lllllllllllllIlIllllIlIIlIlIllII.readerIndex(CloseWebSocketFrame.llllIIIIlIlIl[0]);
        "".length();
        return lllllllllllllIlIllllIlIIlIlIlIll;
    }
    
    private static boolean lIlIIlllIIIlllI(final Object lllllllllllllIlIllllIlIIIlIlllll) {
        return lllllllllllllIlIllllIlIIIlIlllll != null;
    }
    
    public CloseWebSocketFrame() {
        super(Unpooled.buffer(CloseWebSocketFrame.llllIIIIlIlIl[0]));
    }
    
    public int statusCode() {
        final ByteBuf lllllllllllllIlIllllIlIIlIllIlIl = this.content();
        if (!lIlIIlllIIIlllI(lllllllllllllIlIllllIlIIlIllIlIl) || lIlIIlllIIlIIII(lllllllllllllIlIllllIlIIlIllIlIl.capacity())) {
            return CloseWebSocketFrame.llllIIIIlIlIl[3];
        }
        lllllllllllllIlIllllIlIIlIllIlIl.readerIndex(CloseWebSocketFrame.llllIIIIlIlIl[0]);
        "".length();
        final int lllllllllllllIlIllllIlIIlIllIlII = lllllllllllllIlIllllIlIIlIllIlIl.readShort();
        lllllllllllllIlIllllIlIIlIllIlIl.readerIndex(CloseWebSocketFrame.llllIIIIlIlIl[0]);
        "".length();
        return lllllllllllllIlIllllIlIIlIllIlII;
    }
    
    private static boolean lIlIIlllIIlIIIl(final int lllllllllllllIlIllllIlIIIllIIIlI, final int lllllllllllllIlIllllIlIIIllIIIIl) {
        return lllllllllllllIlIllllIlIIIllIIIlI <= lllllllllllllIlIllllIlIIIllIIIIl;
    }
    
    public CloseWebSocketFrame(final int lllllllllllllIlIllllIlIIlllIlllI, final String lllllllllllllIlIllllIlIIlllIlIlI) {
        this((boolean)(CloseWebSocketFrame.llllIIIIlIlIl[1] != 0), CloseWebSocketFrame.llllIIIIlIlIl[0], lllllllllllllIlIllllIlIIlllIlllI, lllllllllllllIlIllllIlIIlllIlIlI);
    }
    
    public CloseWebSocketFrame(final boolean lllllllllllllIlIllllIlIIllIIIIII, final int lllllllllllllIlIllllIlIIlIllllll, final ByteBuf lllllllllllllIlIllllIlIIlIlllIlI) {
        super(lllllllllllllIlIllllIlIIllIIIIII, lllllllllllllIlIllllIlIIlIllllll, lllllllllllllIlIllllIlIIlIlllIlI);
    }
}
