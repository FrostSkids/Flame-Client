// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.internal.PlatformDependent;

public final class UnpooledByteBufAllocator extends AbstractByteBufAllocator
{
    private static final /* synthetic */ int[] lllIlIllIIllIl;
    
    static {
        lIlIIIllIIllIlIl();
        DEFAULT = new UnpooledByteBufAllocator(PlatformDependent.directBufferPreferred());
    }
    
    private static boolean lIlIIIllIIllIllI(final int llllllllllllIlIllIlIllIlllIlIlll) {
        return llllllllllllIlIllIlIllIlllIlIlll != 0;
    }
    
    private static void lIlIIIllIIllIlIl() {
        (lllIlIllIIllIl = new int[1])[0] = ((112 + 150 - 205 + 136 ^ 73 + 11 + 24 + 24) & (0x9B ^ 0xC4 ^ (0xA9 ^ 0xB3) ^ -" ".length()));
    }
    
    public UnpooledByteBufAllocator(final boolean llllllllllllIlIllIlIllIlllllIIlI) {
        super(llllllllllllIlIllIlIllIlllllIIlI);
    }
    
    @Override
    public boolean isDirectBufferPooled() {
        return UnpooledByteBufAllocator.lllIlIllIIllIl[0] != 0;
    }
    
    @Override
    protected ByteBuf newHeapBuffer(final int llllllllllllIlIllIlIllIllllIlIII, final int llllllllllllIlIllIlIllIllllIlIlI) {
        return new UnpooledHeapByteBuf(this, llllllllllllIlIllIlIllIllllIlIII, llllllllllllIlIllIlIllIllllIlIlI);
    }
    
    @Override
    protected ByteBuf newDirectBuffer(final int llllllllllllIlIllIlIllIlllIlllII, final int llllllllllllIlIllIlIllIlllIllIll) {
        ByteBuf llllllllllllIlIllIlIllIlllIllllI = null;
        if (lIlIIIllIIllIllI(PlatformDependent.hasUnsafe() ? 1 : 0)) {
            final ByteBuf llllllllllllIlIllIlIllIllllIIIlI = new UnpooledUnsafeDirectByteBuf(this, llllllllllllIlIllIlIllIlllIlllII, llllllllllllIlIllIlIllIlllIllIll);
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            llllllllllllIlIllIlIllIlllIllllI = new UnpooledDirectByteBuf(this, llllllllllllIlIllIlIllIlllIlllII, llllllllllllIlIllIlIllIlllIllIll);
        }
        return AbstractByteBufAllocator.toLeakAwareBuffer(llllllllllllIlIllIlIllIlllIllllI);
    }
}
