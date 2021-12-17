// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.ReferenceCounted;
import java.nio.ByteBuffer;

public abstract class AbstractDerivedByteBuf extends AbstractByteBuf
{
    @Override
    public final boolean release() {
        return this.unwrap().release();
    }
    
    @Override
    public final ByteBuf retain(final int lllllllllllllIIlIIlIlllllIIlIllI) {
        this.unwrap().retain(lllllllllllllIIlIIlIlllllIIlIllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuffer nioBuffer(final int lllllllllllllIIlIIlIllllIllllIlI, final int lllllllllllllIIlIIlIllllIllllIIl) {
        return this.unwrap().nioBuffer(lllllllllllllIIlIIlIllllIllllIlI, lllllllllllllIIlIIlIllllIllllIIl);
    }
    
    @Override
    public final int refCnt() {
        return this.unwrap().refCnt();
    }
    
    @Override
    public final boolean release(final int lllllllllllllIIlIIlIlllllIIIllIl) {
        return this.unwrap().release(lllllllllllllIIlIIlIlllllIIIllIl);
    }
    
    protected AbstractDerivedByteBuf(final int lllllllllllllIIlIIlIlllllIlIIIII) {
        super(lllllllllllllIIlIIlIlllllIlIIIII);
    }
    
    @Override
    public final ByteBuf retain() {
        this.unwrap().retain();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIIlIIlIlllllIIIIIll, final int lllllllllllllIIlIIlIlllllIIIIlIl) {
        return this.nioBuffer(lllllllllllllIIlIIlIlllllIIIIIll, lllllllllllllIIlIIlIlllllIIIIlIl);
    }
}
