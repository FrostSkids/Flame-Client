// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http.websocketx;

import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;
import io.netty.util.ReferenceCounted;
import io.netty.buffer.ByteBufHolder;

public class PongWebSocketFrame extends WebSocketFrame
{
    private static final /* synthetic */ int[] lIlllIlIllIIII;
    
    public PongWebSocketFrame(final ByteBuf llllllllllllIllllIlllllIllIIllll) {
        super(llllllllllllIllllIlllllIllIIllll);
    }
    
    @Override
    public PongWebSocketFrame retain() {
        super.retain();
        "".length();
        return this;
    }
    
    @Override
    public PongWebSocketFrame retain(final int llllllllllllIllllIlllllIlIllIIlI) {
        super.retain(llllllllllllIllllIlllllIlIllIIlI);
        "".length();
        return this;
    }
    
    static {
        lIIIIIlIlllIIllI();
    }
    
    @Override
    public PongWebSocketFrame duplicate() {
        return new PongWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().duplicate());
    }
    
    private static void lIIIIIlIlllIIllI() {
        (lIlllIlIllIIII = new int[1])[0] = ((0x3D ^ 0x52 ^ (0xD0 ^ 0x94)) & (" ".length() ^ (0x9A ^ 0xB0) ^ -" ".length()));
    }
    
    public PongWebSocketFrame() {
        super(Unpooled.buffer(PongWebSocketFrame.lIlllIlIllIIII[0]));
    }
    
    public PongWebSocketFrame(final boolean llllllllllllIllllIlllllIllIIIlll, final int llllllllllllIllllIlllllIllIIIIlI, final ByteBuf llllllllllllIllllIlllllIllIIIlIl) {
        super(llllllllllllIllllIlllllIllIIIlll, llllllllllllIllllIlllllIllIIIIlI, llllllllllllIllllIlllllIllIIIlIl);
    }
    
    @Override
    public PongWebSocketFrame copy() {
        return new PongWebSocketFrame(this.isFinalFragment(), this.rsv(), this.content().copy());
    }
}
