// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt;

import io.netty.buffer.ByteBuf;
import io.netty.util.ReferenceCounted;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.DefaultByteBufHolder;

public final class UdtMessage extends DefaultByteBufHolder
{
    @Override
    public UdtMessage retain() {
        super.retain();
        "".length();
        return this;
    }
    
    @Override
    public UdtMessage copy() {
        return new UdtMessage(this.content().copy());
    }
    
    @Override
    public UdtMessage retain(final int lllllllllllllIIlIIIlIlIlIIllllIl) {
        super.retain(lllllllllllllIIlIIIlIlIlIIllllIl);
        "".length();
        return this;
    }
    
    public UdtMessage(final ByteBuf lllllllllllllIIlIIIlIlIlIlIIllII) {
        super(lllllllllllllIIlIIIlIlIlIlIIllII);
    }
    
    @Override
    public UdtMessage duplicate() {
        return new UdtMessage(this.content().duplicate());
    }
}
