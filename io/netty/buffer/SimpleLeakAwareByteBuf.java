// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.ByteOrder;
import io.netty.util.ResourceLeak;

final class SimpleLeakAwareByteBuf extends WrappedByteBuf
{
    private final /* synthetic */ ResourceLeak leak;
    
    @Override
    public ByteBuf duplicate() {
        return new SimpleLeakAwareByteBuf(super.duplicate(), this.leak);
    }
    
    @Override
    public boolean release(final int llllllllllllIlllllllIllIlIlIIlII) {
        final boolean llllllllllllIlllllllIllIlIlIIllI = super.release(llllllllllllIlllllllIllIlIlIIlII);
        if (lllllllIlIllIll(llllllllllllIlllllllIllIlIlIIllI ? 1 : 0)) {
            this.leak.close();
            "".length();
        }
        return llllllllllllIlllllllIllIlIlIIllI;
    }
    
    private static boolean lllllllIlIllIll(final int llllllllllllIlllllllIllIlIIIIIlI) {
        return llllllllllllIlllllllIllIlIIIIIlI != 0;
    }
    
    @Override
    public ByteBuf readSlice(final int llllllllllllIlllllllIllIlIIIlIII) {
        return new SimpleLeakAwareByteBuf(super.readSlice(llllllllllllIlllllllIllIlIIIlIII), this.leak);
    }
    
    @Override
    public ByteBuf slice(final int llllllllllllIlllllllIllIlIIlIIlI, final int llllllllllllIlllllllIllIlIIlIlII) {
        return new SimpleLeakAwareByteBuf(super.slice(llllllllllllIlllllllIllIlIIlIIlI, llllllllllllIlllllllIllIlIIlIlII), this.leak);
    }
    
    @Override
    public ByteBuf order(final ByteOrder llllllllllllIlllllllIllIlIIlllIl) {
        this.leak.record();
        if (lllllllIlIlllII(this.order(), llllllllllllIlllllllIllIlIIlllIl)) {
            return this;
        }
        return new SimpleLeakAwareByteBuf(super.order(llllllllllllIlllllllIllIlIIlllIl), this.leak);
    }
    
    private static boolean lllllllIlIlllII(final Object llllllllllllIlllllllIllIlIIIIlIl, final Object llllllllllllIlllllllIllIlIIIIlII) {
        return llllllllllllIlllllllIllIlIIIIlIl == llllllllllllIlllllllIllIlIIIIlII;
    }
    
    SimpleLeakAwareByteBuf(final ByteBuf llllllllllllIlllllllIllIlIllIllI, final ResourceLeak llllllllllllIlllllllIllIlIllIlIl) {
        super(llllllllllllIlllllllIllIlIllIllI);
        this.leak = llllllllllllIlllllllIllIlIllIlIl;
    }
    
    @Override
    public ByteBuf slice() {
        return new SimpleLeakAwareByteBuf(super.slice(), this.leak);
    }
    
    @Override
    public boolean release() {
        final boolean llllllllllllIlllllllIllIlIlIlllI = super.release();
        if (lllllllIlIllIll(llllllllllllIlllllllIllIlIlIlllI ? 1 : 0)) {
            this.leak.close();
            "".length();
        }
        return llllllllllllIlllllllIllIlIlIlllI;
    }
}
