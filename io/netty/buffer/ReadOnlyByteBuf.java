// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ScatteringByteChannel;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.io.InputStream;
import java.nio.ReadOnlyBufferException;

public class ReadOnlyByteBuf extends AbstractDerivedByteBuf
{
    private static final /* synthetic */ int[] lIlIIIIIIlIIll;
    private final /* synthetic */ ByteBuf buffer;
    
    @Override
    public int forEachByteDesc(final int lllllllllllllIIlIIIlIIlllIllllII, final int lllllllllllllIIlIIIlIIlllIlllIll, final ByteBufProcessor lllllllllllllIIlIIIlIIlllIlllIlI) {
        return this.buffer.forEachByteDesc(lllllllllllllIIlIIIlIIlllIllllII, lllllllllllllIIlIIIlIIlllIlllIll, lllllllllllllIIlIIIlIIlllIlllIlI);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIIIlIlIIIlIlIIlI, final ByteBuf lllllllllllllIIlIIIlIlIIIlIlIIIl, final int lllllllllllllIIlIIIlIlIIIlIIlIll, final int lllllllllllllIIlIIIlIlIIIlIIlIlI) {
        this.buffer.getBytes(lllllllllllllIIlIIIlIlIIIlIlIIlI, lllllllllllllIIlIIIlIlIIIlIlIIIl, lllllllllllllIIlIIIlIlIIIlIIlIll, lllllllllllllIIlIIIlIlIIIlIIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setByte(final int lllllllllllllIIlIIIlIlIIlIlIIlII, final int lllllllllllllIIlIIIlIlIIlIlIIIll) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public int forEachByte(final int lllllllllllllIIlIIIlIIllllIIllII, final int lllllllllllllIIlIIIlIIllllIIIlll, final ByteBufProcessor lllllllllllllIIlIIIlIIllllIIlIlI) {
        return this.buffer.forEachByte(lllllllllllllIIlIIIlIIllllIIllII, lllllllllllllIIlIIIlIIllllIIIlll, lllllllllllllIIlIIIlIIllllIIlIlI);
    }
    
    @Override
    protected void _setInt(final int lllllllllllllIIlIIIlIlIIlIIIllll, final int lllllllllllllIIlIIIlIlIIlIIIlllI) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIlIIIlIlIIlIlIllII, final byte[] lllllllllllllIIlIIIlIlIIlIlIlIll, final int lllllllllllllIIlIIIlIlIIlIlIlIlI, final int lllllllllllllIIlIIIlIlIIlIlIlIIl) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    protected int _getInt(final int lllllllllllllIIlIIIlIIlllllllllI) {
        return this.buffer.getInt(lllllllllllllIIlIIIlIIlllllllllI);
    }
    
    public ReadOnlyByteBuf(final ByteBuf lllllllllllllIIlIIIlIlIIllIIlIII) {
        super(lllllllllllllIIlIIIlIlIIllIIlIII.maxCapacity());
        if (!lllIIIIIIIIIllI((lllllllllllllIIlIIIlIlIIllIIlIII instanceof ReadOnlyByteBuf) ? 1 : 0) || lllIIIIIIIIIlll((lllllllllllllIIlIIIlIlIIllIIlIII instanceof DuplicatedByteBuf) ? 1 : 0)) {
            this.buffer = lllllllllllllIIlIIIlIlIIllIIlIII.unwrap();
            "".length();
            if (-" ".length() > 0) {
                throw null;
            }
        }
        else {
            this.buffer = lllllllllllllIIlIIIlIlIIllIIlIII;
        }
        this.setIndex(lllllllllllllIIlIIIlIlIIllIIlIII.readerIndex(), lllllllllllllIIlIIIlIlIIllIIlIII.writerIndex());
        "".length();
    }
    
    @Override
    public ByteBuf slice(final int lllllllllllllIIlIIIlIlIIIIlIllIl, final int lllllllllllllIIlIIIlIlIIIIlIllII) {
        return Unpooled.unmodifiableBuffer(this.buffer.slice(lllllllllllllIIlIIIlIlIIIIlIllIl, lllllllllllllIIlIIIlIlIIIIlIllII));
    }
    
    @Override
    protected void _setLong(final int lllllllllllllIIlIIIlIlIIlIIIlIIl, final long lllllllllllllIIlIIIlIlIIlIIIlIII) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIlIIIlIlIIlIIIIllI, final InputStream lllllllllllllIIlIIIlIlIIlIIIIlIl, final int lllllllllllllIIlIIIlIlIIlIIIIlII) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public boolean isWritable(final int lllllllllllllIIlIIIlIlIIllIIIlIl) {
        return ReadOnlyByteBuf.lIlIIIIIIlIIll[0] != 0;
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIIlIIIlIlIIIIllIllI, final int lllllllllllllIIlIIIlIlIIIIllIlIl) {
        return this.buffer.copy(lllllllllllllIIlIIIlIlIIIIllIllI, lllllllllllllIIlIIIlIlIIIIllIlIl);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIIIlIlIIIlIIIlIl, final ByteBuffer lllllllllllllIIlIIIlIlIIIlIIIIIl) {
        this.buffer.getBytes(lllllllllllllIIlIIIlIlIIIlIIIlIl, lllllllllllllIIlIIIlIlIIIlIIIIIl);
        "".length();
        return this;
    }
    
    @Override
    protected long _getLong(final int lllllllllllllIIlIIIlIIllllllIIlI) {
        return this.buffer.getLong(lllllllllllllIIlIIIlIIllllllIIlI);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIIIlIlIIIllIIIIl, final byte[] lllllllllllllIIlIIIlIlIIIlIllIll, final int lllllllllllllIIlIIIlIlIIIlIlllll, final int lllllllllllllIIlIIIlIlIIIlIllllI) {
        this.buffer.getBytes(lllllllllllllIIlIIIlIlIIIllIIIIl, lllllllllllllIIlIIIlIlIIIlIllIll, lllllllllllllIIlIIIlIlIIIlIlllll, lllllllllllllIIlIIIlIlIIIlIllllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setInt(final int lllllllllllllIIlIIIlIlIIlIIlIIlI, final int lllllllllllllIIlIIIlIlIIlIIlIIIl) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBuffer nioBuffer(final int lllllllllllllIIlIIIlIIlllllIIlIl, final int lllllllllllllIIlIIIlIIlllllIIlll) {
        return this.buffer.nioBuffer(lllllllllllllIIlIIIlIIlllllIIlIl, lllllllllllllIIlIIIlIIlllllIIlll).asReadOnlyBuffer();
    }
    
    private static void lllIIIIIIIIIlIl() {
        (lIlIIIIIIlIIll = new int[1])[0] = ((0x60 ^ 0x43) & ~(0x21 ^ 0x2));
    }
    
    @Override
    protected short _getShort(final int lllllllllllllIIlIIIlIlIIIIIlIllI) {
        return this.buffer.getShort(lllllllllllllIIlIIIlIlIIIIIlIllI);
    }
    
    private static boolean lllIIIIIIIIIllI(final int lllllllllllllIIlIIIlIIlllIllIIIl) {
        return lllllllllllllIIlIIIlIIlllIllIIIl == 0;
    }
    
    @Override
    public ByteBuf unwrap() {
        return this.buffer;
    }
    
    @Override
    public ByteBuf setMedium(final int lllllllllllllIIlIIIlIlIIlIIllIII, final int lllllllllllllIIlIIIlIlIIlIIlIlll) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBuf setShort(final int lllllllllllllIIlIIIlIlIIlIIllllI, final int lllllllllllllIIlIIIlIlIIlIIlllIl) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public boolean isWritable() {
        return ReadOnlyByteBuf.lIlIIIIIIlIIll[0] != 0;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIIIlIlIIIllIlIlI, final OutputStream lllllllllllllIIlIIIlIlIIIllIllIl, final int lllllllllllllIIlIIIlIlIIIllIlIII) throws IOException {
        this.buffer.getBytes(lllllllllllllIIlIIIlIlIIIllIlIlI, lllllllllllllIIlIIIlIlIIIllIllIl, lllllllllllllIIlIIIlIlIIIllIlIII);
        "".length();
        return this;
    }
    
    @Override
    public long getLong(final int lllllllllllllIIlIIIlIIllllllIllI) {
        return this._getLong(lllllllllllllIIlIIIlIIllllllIllI);
    }
    
    @Override
    public int nioBufferCount() {
        return this.buffer.nioBufferCount();
    }
    
    @Override
    protected void _setShort(final int lllllllllllllIIlIIIlIlIIlIIllIll, final int lllllllllllllIIlIIIlIlIIlIIllIlI) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    protected int _getUnsignedMedium(final int lllllllllllllIIlIIIlIlIIIIIIlIlI) {
        return this.buffer.getUnsignedMedium(lllllllllllllIIlIIIlIlIIIIIIlIlI);
    }
    
    @Override
    protected void _setMedium(final int lllllllllllllIIlIIIlIlIIlIIlIlIl, final int lllllllllllllIIlIIIlIlIIlIIlIlII) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIlIIIlIlIIlIllIIIl, final ByteBuf lllllllllllllIIlIIIlIlIIlIllIIII, final int lllllllllllllIIlIIIlIlIIlIlIllll, final int lllllllllllllIIlIIIlIlIIlIlIlllI) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public int getUnsignedMedium(final int lllllllllllllIIlIIIlIlIIIIIIlllI) {
        return this._getUnsignedMedium(lllllllllllllIIlIIIlIlIIIIIIlllI);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIIlIIIlIIllllIlIllI, final int lllllllllllllIIlIIIlIIllllIlIlIl) {
        return this.nioBuffer(lllllllllllllIIlIIIlIIllllIlIllI, lllllllllllllIIlIIIlIIllllIlIlIl);
    }
    
    static {
        lllIIIIIIIIIlIl();
    }
    
    @Override
    public ByteBuf setLong(final int lllllllllllllIIlIIIlIlIIlIIIllII, final long lllllllllllllIIlIIIlIlIIlIIIlIll) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return ReadOnlyByteBuf.lIlIIIIIIlIIll[0] != 0;
    }
    
    @Override
    protected void _setByte(final int lllllllllllllIIlIIIlIlIIlIlIIIIl, final int lllllllllllllIIlIIIlIlIIlIlIIIII) {
        throw new ReadOnlyBufferException();
    }
    
    private static boolean lllIIIIIIIIIlll(final int lllllllllllllIIlIIIlIIlllIllIIll) {
        return lllllllllllllIIlIIIlIIlllIllIIll != 0;
    }
    
    @Override
    public boolean isDirect() {
        return this.buffer.isDirect();
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIlIIIlIlIIlIIIIIlI, final ScatteringByteChannel lllllllllllllIIlIIIlIlIIlIIIIIIl, final int lllllllllllllIIlIIIlIlIIlIIIIIII) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBuf duplicate() {
        return new ReadOnlyByteBuf(this);
    }
    
    @Override
    public boolean hasArray() {
        return ReadOnlyByteBuf.lIlIIIIIIlIIll[0] != 0;
    }
    
    @Override
    public int capacity() {
        return this.buffer.capacity();
    }
    
    @Override
    public byte[] array() {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public int getBytes(final int lllllllllllllIIlIIIlIlIIIllllIlI, final GatheringByteChannel lllllllllllllIIlIIIlIlIIIlllIlIl, final int lllllllllllllIIlIIIlIlIIIllllIII) throws IOException {
        return this.buffer.getBytes(lllllllllllllIIlIIIlIlIIIllllIlI, lllllllllllllIIlIIIlIlIIIlllIlIl, lllllllllllllIIlIIIlIlIIIllllIII);
    }
    
    @Override
    public int getInt(final int lllllllllllllIIlIIIlIlIIIIIIIIlI) {
        return this._getInt(lllllllllllllIIlIIIlIlIIIIIIIIlI);
    }
    
    @Override
    public byte getByte(final int lllllllllllllIIlIIIlIlIIIIlIlIII) {
        return this._getByte(lllllllllllllIIlIIIlIlIIIIlIlIII);
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIlIIIlIlIIlIlIIlll, final ByteBuffer lllllllllllllIIlIIIlIlIIlIlIIllI) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public long memoryAddress() {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public int arrayOffset() {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    protected byte _getByte(final int lllllllllllllIIlIIIlIlIIIIlIIIII) {
        return this.buffer.getByte(lllllllllllllIIlIIIlIlIIIIlIIIII);
    }
    
    @Override
    public short getShort(final int lllllllllllllIIlIIIlIlIIIIIllIlI) {
        return this._getShort(lllllllllllllIIlIIIlIlIIIIIllIlI);
    }
    
    @Override
    public ByteOrder order() {
        return this.buffer.order();
    }
    
    @Override
    public ByteBuf capacity(final int lllllllllllllIIlIIIlIIlllIllIlIl) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.buffer.alloc();
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIIlIIIlIIllllIlllII, final int lllllllllllllIIlIIIlIIllllIllIll) {
        return this.buffer.nioBuffers(lllllllllllllIIlIIIlIIllllIlllII, lllllllllllllIIlIIIlIIllllIllIll);
    }
}
