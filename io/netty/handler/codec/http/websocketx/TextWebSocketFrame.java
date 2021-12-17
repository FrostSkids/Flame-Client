// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.buffer.ByteBuf;
import io.netty.util.CharsetUtil;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.Unpooled;
import io.netty.util.ReferenceCounted;

public class TextWebSocketFrame extends WebSocketFrame
{
    private static final /* synthetic */ int[] lIlIlIIllllIll;
    
    public TextWebSocketFrame() {
        super(Unpooled.buffer(TextWebSocketFrame.lIlIlIIllllIll[0]));
    }
    
    private static boolean lllIllIlIlIllll(final int lllllllllllllIIIlIIlIIIllIlIllIl) {
        return lllllllllllllIIIlIIlIIIllIlIllIl != 0;
    }
    
    public String text() {
        return this.content().toString(CharsetUtil.UTF_8);
    }
    
    public TextWebSocketFrame(final boolean lllllllllllllIIIlIIlIIIllllIllII, final int lllllllllllllIIIlIIlIIIllllIlIll, final ByteBuf lllllllllllllIIIlIIlIIIllllIlIlI) {
        super(lllllllllllllIIIlIIlIIIllllIllII, lllllllllllllIIIlIIlIIIllllIlIll, lllllllllllllIIIlIIlIIIllllIlIlI);
    }
    
    static {
        lllIllIlIlIllIl();
    }
    
    @Override
    public TextWebSocketFrame copy() {
        return new TextWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().copy());
    }
    
    public TextWebSocketFrame(final boolean lllllllllllllIIIlIIlIIIllllllIll, final int lllllllllllllIIIlIIlIIIllllllIlI, final String lllllllllllllIIIlIIlIIIlllllllIl) {
        super(lllllllllllllIIIlIIlIIIllllllIll, lllllllllllllIIIlIIlIIIllllllIlI, fromText(lllllllllllllIIIlIIlIIIlllllllIl));
    }
    
    public TextWebSocketFrame(final ByteBuf lllllllllllllIIIlIIlIIlIIIIIIlIl) {
        super(lllllllllllllIIIlIIlIIlIIIIIIlIl);
    }
    
    private static boolean lllIllIlIlIlllI(final Object lllllllllllllIIIlIIlIIIllIlIllll) {
        return lllllllllllllIIIlIIlIIIllIlIllll != null;
    }
    
    private static void lllIllIlIlIllIl() {
        (lIlIlIIllllIll = new int[1])[0] = ((0x8 ^ 0x13) & ~(0x7D ^ 0x66));
    }
    
    @Override
    public TextWebSocketFrame retain() {
        super.retain();
        "".length();
        return this;
    }
    
    @Override
    public TextWebSocketFrame retain(final int lllllllllllllIIIlIIlIIIlllIllIII) {
        super.retain(lllllllllllllIIIlIIlIIIlllIllIII);
        "".length();
        return this;
    }
    
    public TextWebSocketFrame(final String lllllllllllllIIIlIIlIIlIIIIIllIl) {
        super(fromText(lllllllllllllIIIlIIlIIlIIIIIllIl));
    }
    
    private static ByteBuf fromText(final String lllllllllllllIIIlIIlIIIlllllIlll) {
        if (!lllIllIlIlIlllI(lllllllllllllIIIlIIlIIIlllllIlll) || lllIllIlIlIllll(lllllllllllllIIIlIIlIIIlllllIlll.isEmpty() ? 1 : 0)) {
            return Unpooled.EMPTY_BUFFER;
        }
        return Unpooled.copiedBuffer(lllllllllllllIIIlIIlIIIlllllIlll, CharsetUtil.UTF_8);
    }
    
    @Override
    public TextWebSocketFrame duplicate() {
        return new TextWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().duplicate());
    }
}
