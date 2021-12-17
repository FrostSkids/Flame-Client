// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.util.ReferenceCounted;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;

public class BinaryWebSocketFrame extends WebSocketFrame
{
    private static final /* synthetic */ int[] lIIIIlIIlIIllI;
    
    public BinaryWebSocketFrame(final boolean lllllllllllllIlIIllIIIllIIlIIlII, final int lllllllllllllIlIIllIIIllIIlIIIll, final ByteBuf lllllllllllllIlIIllIIIllIIlIIllI) {
        super(lllllllllllllIlIIllIIIllIIlIIlII, lllllllllllllIlIIllIIIllIIlIIIll, lllllllllllllIlIIllIIIllIIlIIllI);
    }
    
    public BinaryWebSocketFrame() {
        super(Unpooled.buffer(BinaryWebSocketFrame.lIIIIlIIlIIllI[0]));
    }
    
    @Override
    public BinaryWebSocketFrame retain() {
        super.retain();
        "".length();
        return this;
    }
    
    @Override
    public BinaryWebSocketFrame duplicate() {
        return new BinaryWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().duplicate());
    }
    
    public BinaryWebSocketFrame(final ByteBuf lllllllllllllIlIIllIIIllIIlIlllI) {
        super(lllllllllllllIlIIllIIIllIIlIlllI);
    }
    
    @Override
    public BinaryWebSocketFrame copy() {
        return new BinaryWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().copy());
    }
    
    @Override
    public BinaryWebSocketFrame retain(final int lllllllllllllIlIIllIIIllIIIlIIll) {
        super.retain(lllllllllllllIlIIllIIIllIIIlIIll);
        "".length();
        return this;
    }
    
    private static void lIlllIIIlIIIIll() {
        (lIIIIlIIlIIllI = new int[1])[0] = ((0x4C ^ 0x46) & ~(0x68 ^ 0x62));
    }
    
    static {
        lIlllIIIlIIIIll();
    }
}
