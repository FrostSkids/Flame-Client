// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.util.ReferenceCounted;
import io.netty.util.CharsetUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBufHolder;

public class ContinuationWebSocketFrame extends WebSocketFrame
{
    private static final /* synthetic */ int[] llIIlIllIIlIlI;
    
    static {
        lIIIllIllIIlIIIl();
    }
    
    public ContinuationWebSocketFrame() {
        this(Unpooled.buffer(ContinuationWebSocketFrame.llIIlIllIIlIlI[0]));
    }
    
    private static ByteBuf fromText(final String llllllllllllIlllIIIlIlIlllIIlIll) {
        if (!lIIIllIllIIlIIlI(llllllllllllIlllIIIlIlIlllIIlIll) || lIIIllIllIIlIIll(llllllllllllIlllIIIlIlIlllIIlIll.isEmpty() ? 1 : 0)) {
            return Unpooled.EMPTY_BUFFER;
        }
        return Unpooled.copiedBuffer(llllllllllllIlllIIIlIlIlllIIlIll, CharsetUtil.UTF_8);
    }
    
    public ContinuationWebSocketFrame(final boolean llllllllllllIlllIIIlIlIlllIlIIll, final int llllllllllllIlllIIIlIlIlllIlIllI, final String llllllllllllIlllIIIlIlIlllIlIlIl) {
        this(llllllllllllIlllIIIlIlIlllIlIIll, llllllllllllIlllIIIlIlIlllIlIllI, fromText(llllllllllllIlllIIIlIlIlllIlIlIl));
    }
    
    private static void lIIIllIllIIlIIIl() {
        (llIIlIllIIlIlI = new int[1])[0] = ((102 + 141 - 159 + 77 ^ 120 + 155 - 241 + 133) & (0x72 ^ 0xA ^ (0x2D ^ 0x53) ^ -" ".length()));
    }
    
    @Override
    public ContinuationWebSocketFrame duplicate() {
        return new ContinuationWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().duplicate());
    }
    
    public ContinuationWebSocketFrame(final boolean llllllllllllIlllIIIlIlIlllIlllll, final int llllllllllllIlllIIIlIlIllllIIIlI, final ByteBuf llllllllllllIlllIIIlIlIlllIlllIl) {
        super(llllllllllllIlllIIIlIlIlllIlllll, llllllllllllIlllIIIlIlIllllIIIlI, llllllllllllIlllIIIlIlIlllIlllIl);
    }
    
    private static boolean lIIIllIllIIlIIlI(final Object llllllllllllIlllIIIlIlIllIIlIIll) {
        return llllllllllllIlllIIIlIlIllIIlIIll != null;
    }
    
    private static boolean lIIIllIllIIlIIll(final int llllllllllllIlllIIIlIlIllIIlIIIl) {
        return llllllllllllIlllIIIlIlIllIIlIIIl != 0;
    }
    
    public String text() {
        return this.content().toString(CharsetUtil.UTF_8);
    }
    
    @Override
    public ContinuationWebSocketFrame copy() {
        return new ContinuationWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().copy());
    }
    
    @Override
    public ContinuationWebSocketFrame retain() {
        super.retain();
        "".length();
        return this;
    }
    
    @Override
    public ContinuationWebSocketFrame retain(final int llllllllllllIlllIIIlIlIllIlllllI) {
        super.retain(llllllllllllIlllIIIlIlIllIlllllI);
        "".length();
        return this;
    }
    
    public ContinuationWebSocketFrame(final ByteBuf llllllllllllIlllIIIlIlIllllIlIll) {
        super(llllllllllllIlllIIIlIlIllllIlIll);
    }
}
