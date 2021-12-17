// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.util.ReferenceCounted;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;

public class PingWebSocketFrame extends WebSocketFrame
{
    private static final /* synthetic */ int[] lIIllIlllIllll;
    
    public PingWebSocketFrame(final boolean lllllllllllllIIlIlIIlIlIIIlIllll, final int lllllllllllllIIlIlIIlIlIIIllIIlI, final ByteBuf lllllllllllllIIlIlIIlIlIIIllIIIl) {
        super(lllllllllllllIIlIlIIlIlIIIlIllll, lllllllllllllIIlIlIIlIlIIIllIIlI, lllllllllllllIIlIlIIlIlIIIllIIIl);
    }
    
    public PingWebSocketFrame(final ByteBuf lllllllllllllIIlIlIIlIlIIIlllIIl) {
        super(lllllllllllllIIlIlIIlIlIIIlllIIl);
    }
    
    public PingWebSocketFrame() {
        super((boolean)(PingWebSocketFrame.lIIllIlllIllll[0] != 0), PingWebSocketFrame.lIIllIlllIllll[1], Unpooled.buffer(PingWebSocketFrame.lIIllIlllIllll[1]));
    }
    
    private static void llIllIlIIIllIlI() {
        (lIIllIlllIllll = new int[2])[0] = " ".length();
        PingWebSocketFrame.lIIllIlllIllll[1] = ((0x5C ^ 0x76 ^ (0x32 ^ 0x56)) & (104 + 14 - 77 + 212 ^ 141 + 47 - 39 + 30 ^ -" ".length()));
    }
    
    @Override
    public PingWebSocketFrame copy() {
        return new PingWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().copy());
    }
    
    static {
        llIllIlIIIllIlI();
    }
    
    @Override
    public PingWebSocketFrame duplicate() {
        return new PingWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().duplicate());
    }
    
    @Override
    public PingWebSocketFrame retain(final int lllllllllllllIIlIlIIlIlIIIlIIIII) {
        super.retain(lllllllllllllIIlIlIIlIlIIIlIIIII);
        "".length();
        return this;
    }
    
    @Override
    public PingWebSocketFrame retain() {
        super.retain();
        "".length();
        return this;
    }
}
