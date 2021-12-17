// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.buffer.ByteBuf;

abstract class SpdyHeaderBlockDecoder
{
    static SpdyHeaderBlockDecoder newInstance(final SpdyVersion lllllllllllllIIlIlIIlIlllIlIlIll, final int lllllllllllllIIlIlIIlIlllIlIlIII) {
        return new SpdyHeaderBlockZlibDecoder(lllllllllllllIIlIlIIlIlllIlIlIll, lllllllllllllIIlIlIIlIlllIlIlIII);
    }
    
    abstract void decode(final ByteBuf p0, final SpdyHeadersFrame p1) throws Exception;
    
    abstract void end();
    
    abstract void endHeaderBlock(final SpdyHeadersFrame p0) throws Exception;
}
