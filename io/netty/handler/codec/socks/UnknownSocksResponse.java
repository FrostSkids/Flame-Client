// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import io.netty.buffer.ByteBuf;

public final class UnknownSocksResponse extends SocksResponse
{
    @Override
    public void encodeAsByteBuf(final ByteBuf llllllllllllIlIlllIIIlIlIllIIlll) {
    }
    
    public UnknownSocksResponse() {
        super(SocksResponseType.UNKNOWN);
    }
}
