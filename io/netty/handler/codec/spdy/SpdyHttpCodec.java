// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.channel.CombinedChannelDuplexHandler;

public final class SpdyHttpCodec extends CombinedChannelDuplexHandler<SpdyHttpDecoder, SpdyHttpEncoder>
{
    public SpdyHttpCodec(final SpdyVersion lllllllllllllIlIlIlllIlIlIlllIlI, final int lllllllllllllIlIlIlllIlIlIlllIIl, final boolean lllllllllllllIlIlIlllIlIlIlllIII) {
        super(new SpdyHttpDecoder(lllllllllllllIlIlIlllIlIlIlllIlI, lllllllllllllIlIlIlllIlIlIlllIIl, lllllllllllllIlIlIlllIlIlIlllIII), new SpdyHttpEncoder(lllllllllllllIlIlIlllIlIlIlllIlI));
    }
    
    public SpdyHttpCodec(final SpdyVersion lllllllllllllIlIlIlllIlIllIIIlII, final int lllllllllllllIlIlIlllIlIllIIIIll) {
        super(new SpdyHttpDecoder(lllllllllllllIlIlIlllIlIllIIIlII, lllllllllllllIlIlIlllIlIllIIIIll), new SpdyHttpEncoder(lllllllllllllIlIlIlllIlIllIIIlII));
    }
}
