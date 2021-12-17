// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import io.netty.util.Recycler;

abstract class PooledByteBuf<T> extends AbstractReferenceCountedByteBuf
{
    protected /* synthetic */ int offset;
    private static final /* synthetic */ int[] lllllIIlIIIll;
    protected /* synthetic */ long handle;
    protected /* synthetic */ T memory;
    protected /* synthetic */ int length;
    /* synthetic */ int maxLength;
    private final /* synthetic */ Recycler.Handle recyclerHandle;
    static final /* synthetic */ boolean $assertionsDisabled;
    protected /* synthetic */ PoolChunk<T> chunk;
    private /* synthetic */ ByteBuffer tmpNioBuf;
    
    @Override
    protected final void deallocate() {
        if (lIlIllIllIIlIIl(lIlIllIllIIlIII(this.handle, 0L))) {
            final long lllllllllllllIlIlIllllllllllIIIl = this.handle;
            this.handle = -1L;
            this.memory = null;
            this.chunk.arena.free(this.chunk, lllllllllllllIlIlIllllllllllIIIl, this.maxLength);
            this.recycle();
        }
    }
    
    void init(final PoolChunk<T> lllllllllllllIlIllIIIIIIIIIllIll, final long lllllllllllllIlIllIIIIIIIIIllIlI, final int lllllllllllllIlIllIIIIIIIIIllIIl, final int lllllllllllllIlIllIIIIIIIIIllIII, final int lllllllllllllIlIllIIIIIIIIIlIlll) {
        if (lIlIllIllIIIIII(PooledByteBuf.$assertionsDisabled ? 1 : 0) && lIlIllIllIIIIIl(lIlIllIlIlllllI(lllllllllllllIlIllIIIIIIIIIllIlI, 0L))) {
            throw new AssertionError();
        }
        if (lIlIllIllIIIIII(PooledByteBuf.$assertionsDisabled ? 1 : 0) && lIlIllIllIIIIlI(lllllllllllllIlIllIIIIIIIIIllIll)) {
            throw new AssertionError();
        }
        this.chunk = lllllllllllllIlIllIIIIIIIIIllIll;
        this.handle = lllllllllllllIlIllIIIIIIIIIllIlI;
        this.memory = lllllllllllllIlIllIIIIIIIIIllIll.memory;
        this.offset = lllllllllllllIlIllIIIIIIIIIllIIl;
        this.length = lllllllllllllIlIllIIIIIIIIIllIII;
        this.maxLength = lllllllllllllIlIllIIIIIIIIIlIlll;
        this.setIndex(PooledByteBuf.lllllIIlIIIll[0], PooledByteBuf.lllllIIlIIIll[0]);
        "".length();
        this.tmpNioBuf = null;
    }
    
    private static boolean lIlIllIllIIIIll(final int lllllllllllllIlIlIllllllllIIllII) {
        return lllllllllllllIlIlIllllllllIIllII != 0;
    }
    
    protected final int idx(final int lllllllllllllIlIlIlllllllllIIlII) {
        return this.offset + lllllllllllllIlIlIlllllllllIIlII;
    }
    
    @Override
    public final ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }
    
    private void recycle() {
        final Recycler.Handle lllllllllllllIlIlIlllllllllIlIlI = this.recyclerHandle;
        if (lIlIllIllIIlIlI(lllllllllllllIlIlIlllllllllIlIlI)) {
            this.recycler().recycle(this, lllllllllllllIlIlIlllllllllIlIlI);
            "".length();
        }
    }
    
    private static boolean lIlIllIllIIlIIl(final int lllllllllllllIlIlIllllllllIIlIII) {
        return lllllllllllllIlIlIllllllllIIlIII >= 0;
    }
    
    private static int lIlIllIllIIlIII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlIllIllIIIIII(final int lllllllllllllIlIlIllllllllIIlIlI) {
        return lllllllllllllIlIlIllllllllIIlIlI == 0;
    }
    
    private static void lIlIllIlIllllII() {
        (lllllIIlIIIll = new int[4])[0] = ((0xB ^ 0xE) & ~(0x2 ^ 0x7));
        PooledByteBuf.lllllIIlIIIll[1] = " ".length();
        PooledByteBuf.lllllIIlIIIll[2] = (-(0xFFFFFF78 & 0x7DEF) & (0xFFFFFF7F & 0x7FE7));
        PooledByteBuf.lllllIIlIIIll[3] = (0x18 ^ 0x8);
    }
    
    @Override
    public final ByteBuf capacity(final int lllllllllllllIlIlIllllllllllllll) {
        this.ensureAccessible();
        if (lIlIllIllIIIIll(this.chunk.unpooled ? 1 : 0)) {
            if (lIlIllIllIIIlII(lllllllllllllIlIlIllllllllllllll, this.length)) {
                return this;
            }
        }
        else if (lIlIllIllIIIlIl(lllllllllllllIlIlIllllllllllllll, this.length)) {
            if (lIlIllIllIIIllI(lllllllllllllIlIlIllllllllllllll, this.maxLength)) {
                this.length = lllllllllllllIlIlIllllllllllllll;
                return this;
            }
        }
        else {
            if (!lIlIllIllIIIlll(lllllllllllllIlIlIllllllllllllll, this.length)) {
                return this;
            }
            if (lIlIllIllIIIlIl(lllllllllllllIlIlIllllllllllllll, this.maxLength >>> PooledByteBuf.lllllIIlIIIll[1])) {
                if (!lIlIllIllIIIllI(this.maxLength, PooledByteBuf.lllllIIlIIIll[2])) {
                    this.length = lllllllllllllIlIlIllllllllllllll;
                    this.setIndex(Math.min(this.readerIndex(), lllllllllllllIlIlIllllllllllllll), Math.min(this.writerIndex(), lllllllllllllIlIlIllllllllllllll));
                    "".length();
                    return this;
                }
                if (lIlIllIllIIIlIl(lllllllllllllIlIlIllllllllllllll, this.maxLength - PooledByteBuf.lllllIIlIIIll[3])) {
                    this.length = lllllllllllllIlIlIllllllllllllll;
                    this.setIndex(Math.min(this.readerIndex(), lllllllllllllIlIlIllllllllllllll), Math.min(this.writerIndex(), lllllllllllllIlIlIllllllllllllll));
                    "".length();
                    return this;
                }
            }
        }
        this.chunk.arena.reallocate(this, lllllllllllllIlIlIllllllllllllll, (boolean)(PooledByteBuf.lllllIIlIIIll[1] != 0));
        return this;
    }
    
    private static boolean lIlIllIllIIIllI(final int lllllllllllllIlIlIllllllllIlIlll, final int lllllllllllllIlIlIllllllllIlIllI) {
        return lllllllllllllIlIlIllllllllIlIlll <= lllllllllllllIlIlIllllllllIlIllI;
    }
    
    private static boolean lIlIllIllIIlIlI(final Object lllllllllllllIlIlIllllllllIlIIII) {
        return lllllllllllllIlIlIllllllllIlIIII != null;
    }
    
    private static boolean lIlIllIllIIIlll(final int lllllllllllllIlIlIllllllllIllIll, final int lllllllllllllIlIlIllllllllIllIlI) {
        return lllllllllllllIlIlIllllllllIllIll < lllllllllllllIlIlIllllllllIllIlI;
    }
    
    @Override
    public final int capacity() {
        return this.length;
    }
    
    private static int lIlIllIlIlllllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlIllIllIIIlII(final int lllllllllllllIlIlIllllllllIlllll, final int lllllllllllllIlIlIllllllllIllllI) {
        return lllllllllllllIlIlIllllllllIlllll == lllllllllllllIlIlIllllllllIllllI;
    }
    
    protected final ByteBuffer internalNioBuffer() {
        ByteBuffer lllllllllllllIlIlIllllllllllIllI = this.tmpNioBuf;
        if (lIlIllIllIIIIlI(lllllllllllllIlIlIllllllllllIllI)) {
            lllllllllllllIlIlIllllllllllIllI = (this.tmpNioBuf = this.newInternalNioBuffer(this.memory));
        }
        return lllllllllllllIlIlIllllllllllIllI;
    }
    
    protected PooledByteBuf(final Recycler.Handle lllllllllllllIlIllIIIIIIIIlIIlII, final int lllllllllllllIlIllIIIIIIIIlIIIll) {
        super(lllllllllllllIlIllIIIIIIIIlIIIll);
        this.recyclerHandle = lllllllllllllIlIllIIIIIIIIlIIlII;
    }
    
    private static boolean lIlIllIllIIIIlI(final Object lllllllllllllIlIlIllllllllIIlllI) {
        return lllllllllllllIlIlIllllllllIIlllI == null;
    }
    
    protected abstract Recycler<?> recycler();
    
    private static boolean lIlIllIllIIIIIl(final int lllllllllllllIlIlIllllllllIIIllI) {
        return lllllllllllllIlIlIllllllllIIIllI < 0;
    }
    
    protected abstract ByteBuffer newInternalNioBuffer(final T p0);
    
    private static boolean lIlIllIllIIIlIl(final int lllllllllllllIlIlIllllllllIlIIll, final int lllllllllllllIlIlIllllllllIlIIlI) {
        return lllllllllllllIlIlIllllllllIlIIll > lllllllllllllIlIlIllllllllIlIIlI;
    }
    
    @Override
    public final ByteBufAllocator alloc() {
        return this.chunk.arena.parent;
    }
    
    void initUnpooled(final PoolChunk<T> lllllllllllllIlIllIIIIIIIIIIllII, final int lllllllllllllIlIllIIIIIIIIIIlIll) {
        if (lIlIllIllIIIIII(PooledByteBuf.$assertionsDisabled ? 1 : 0) && lIlIllIllIIIIlI(lllllllllllllIlIllIIIIIIIIIIllII)) {
            throw new AssertionError();
        }
        this.chunk = lllllllllllllIlIllIIIIIIIIIIllII;
        this.handle = 0L;
        this.memory = lllllllllllllIlIllIIIIIIIIIIllII.memory;
        this.offset = PooledByteBuf.lllllIIlIIIll[0];
        this.maxLength = lllllllllllllIlIllIIIIIIIIIIlIll;
        this.length = lllllllllllllIlIllIIIIIIIIIIlIll;
        this.setIndex(PooledByteBuf.lllllIIlIIIll[0], PooledByteBuf.lllllIIlIIIll[0]);
        "".length();
        this.tmpNioBuf = null;
    }
    
    @Override
    public final ByteBuf unwrap() {
        return null;
    }
    
    static {
        lIlIllIlIllllII();
        int $assertionsDisabled2;
        if (lIlIllIllIIIIII(PooledByteBuf.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = PooledByteBuf.lllllIIlIIIll[1];
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = PooledByteBuf.lllllIIlIIIll[0];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
}
