// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.io.InputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.GatheringByteChannel;
import java.nio.ByteOrder;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class DuplicatedByteBuf extends AbstractDerivedByteBuf
{
    private final /* synthetic */ ByteBuf buffer;
    
    @Override
    public int capacity() {
        return this.buffer.capacity();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIlIlIIIlIlIIIlllll, final ByteBuffer lllllllllllllIIlIlIIIlIlIIIllIll) {
        this.buffer.setBytes(lllllllllllllIIlIlIIIlIlIIIlllll, lllllllllllllIIlIlIIIlIlIIIllIll);
        "".length();
        return this;
    }
    
    @Override
    protected int _getUnsignedMedium(final int lllllllllllllIIlIlIIIllIIIIIIlII) {
        return this.buffer.getUnsignedMedium(lllllllllllllIIlIlIIIllIIIIIIlII);
    }
    
    @Override
    public ByteBuf setInt(final int lllllllllllllIIlIlIIIlIlIlIllllI, final int lllllllllllllIIlIlIIIlIlIllIIIII) {
        this._setInt(lllllllllllllIIlIlIIIlIlIlIllllI, lllllllllllllIIlIlIIIlIlIllIIIII);
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIlIIIlIllIlIIIII, final ByteBuffer lllllllllllllIIlIlIIIlIllIIlllII) {
        this.buffer.getBytes(lllllllllllllIIlIlIIIlIllIlIIIII, lllllllllllllIIlIlIIIlIllIIlllII);
        "".length();
        return this;
    }
    
    @Override
    protected void _setInt(final int lllllllllllllIIlIlIIIlIlIlIlIlIl, final int lllllllllllllIIlIlIIIlIlIlIlIlll) {
        this.buffer.setInt(lllllllllllllIIlIlIIIlIlIlIlIlIl, lllllllllllllIIlIlIIIlIlIlIlIlll);
        "".length();
    }
    
    @Override
    public int arrayOffset() {
        return this.buffer.arrayOffset();
    }
    
    @Override
    protected int _getInt(final int lllllllllllllIIlIlIIIlIllllllIII) {
        return this.buffer.getInt(lllllllllllllIIlIlIIIlIllllllIII);
    }
    
    @Override
    public int forEachByte(final int lllllllllllllIIlIlIIIlIIllIlIIII, final int lllllllllllllIIlIlIIIlIIllIIllll, final ByteBufProcessor lllllllllllllIIlIlIIIlIIllIIlllI) {
        return this.buffer.forEachByte(lllllllllllllIIlIlIIIlIIllIlIIII, lllllllllllllIIlIlIIIlIIllIIllll, lllllllllllllIIlIlIIIlIIllIIlllI);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIlIIIlIllIlIllIl, final byte[] lllllllllllllIIlIlIIIlIllIlIllII, final int lllllllllllllIIlIlIIIlIllIlIlIll, final int lllllllllllllIIlIlIIIlIllIlIlIlI) {
        this.buffer.getBytes(lllllllllllllIIlIlIIIlIllIlIllIl, lllllllllllllIIlIlIIIlIllIlIllII, lllllllllllllIIlIlIIIlIllIlIlIll, lllllllllllllIIlIlIIIlIllIlIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setByte(final int lllllllllllllIIlIlIIIlIllIIlIlII, final int lllllllllllllIIlIlIIIlIllIIlIllI) {
        this._setByte(lllllllllllllIIlIlIIIlIllIIlIlII, lllllllllllllIIlIlIIIlIllIIlIllI);
        return this;
    }
    
    @Override
    protected void _setLong(final int lllllllllllllIIlIlIIIlIlIlIIIIll, final long lllllllllllllIIlIlIIIlIlIlIIIIlI) {
        this.buffer.setLong(lllllllllllllIIlIlIIIlIlIlIIIIll, lllllllllllllIIlIlIIIlIlIlIIIIlI);
        "".length();
    }
    
    @Override
    public byte getByte(final int lllllllllllllIIlIlIIIllIIIlIIIlI) {
        return this._getByte(lllllllllllllIIlIlIIIllIIIlIIIlI);
    }
    
    private static boolean llIllIlIllIIIII(final int lllllllllllllIIlIlIIIlIIlIllllII) {
        return lllllllllllllIIlIlIIIlIIlIllllII != 0;
    }
    
    @Override
    public boolean isDirect() {
        return this.buffer.isDirect();
    }
    
    @Override
    protected short _getShort(final int lllllllllllllIIlIlIIIllIIIIlIIII) {
        return this.buffer.getShort(lllllllllllllIIlIlIIIllIIIIlIIII);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIlIIIlIlIIIlIIIl, final OutputStream lllllllllllllIIlIlIIIlIlIIIlIlII, final int lllllllllllllIIlIlIIIlIlIIIlIIll) throws IOException {
        this.buffer.getBytes(lllllllllllllIIlIlIIIlIlIIIlIIIl, lllllllllllllIIlIlIIIlIlIIIlIlII, lllllllllllllIIlIlIIIlIlIIIlIIll);
        "".length();
        return this;
    }
    
    @Override
    public int getInt(final int lllllllllllllIIlIlIIIllIIIIIIIII) {
        return this._getInt(lllllllllllllIIlIlIIIllIIIIIIIII);
    }
    
    @Override
    protected void _setMedium(final int lllllllllllllIIlIlIIIlIlIllIIlll, final int lllllllllllllIIlIlIIIlIlIllIlIIl) {
        this.buffer.setMedium(lllllllllllllIIlIlIIIlIlIllIIlll, lllllllllllllIIlIlIIIlIlIllIlIIl);
        "".length();
    }
    
    @Override
    public ByteBuf setLong(final int lllllllllllllIIlIlIIIlIlIlIIllII, final long lllllllllllllIIlIlIIIlIlIlIIlllI) {
        this._setLong(lllllllllllllIIlIlIIIlIlIlIIllII, lllllllllllllIIlIlIIIlIlIlIIlllI);
        return this;
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIIlIlIIIlIllllIIIII, final int lllllllllllllIIlIlIIIlIlllIlllll) {
        return this.buffer.copy(lllllllllllllIIlIlIIIlIllllIIIII, lllllllllllllIIlIlIIIlIlllIlllll);
    }
    
    @Override
    protected byte _getByte(final int lllllllllllllIIlIlIIIllIIIIlllII) {
        return this.buffer.getByte(lllllllllllllIIlIlIIIllIIIIlllII);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIIlIlIIIlIIllIllIlI, final int lllllllllllllIIlIlIIIlIIllIlIllI) {
        return this.nioBuffer(lllllllllllllIIlIlIIIlIIllIllIlI, lllllllllllllIIlIlIIIlIIllIlIllI);
    }
    
    @Override
    public long memoryAddress() {
        return this.buffer.memoryAddress();
    }
    
    @Override
    public ByteOrder order() {
        return this.buffer.order();
    }
    
    @Override
    public ByteBuf setShort(final int lllllllllllllIIlIlIIIlIllIIIIlIl, final int lllllllllllllIIlIlIIIlIllIIIIIIl) {
        this._setShort(lllllllllllllIIlIlIIIlIllIIIIlIl, lllllllllllllIIlIlIIIlIllIIIIIIl);
        return this;
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.buffer.alloc();
    }
    
    @Override
    public int getBytes(final int lllllllllllllIIlIlIIIlIlIIIIIlIl, final GatheringByteChannel lllllllllllllIIlIlIIIlIlIIIIlIII, final int lllllllllllllIIlIlIIIlIlIIIIIIll) throws IOException {
        return this.buffer.getBytes(lllllllllllllIIlIlIIIlIlIIIIIlIl, lllllllllllllIIlIlIIIlIlIIIIlIII, lllllllllllllIIlIlIIIlIlIIIIIIll);
    }
    
    @Override
    public ByteBuf slice(final int lllllllllllllIIlIlIIIlIlllIlIIIl, final int lllllllllllllIIlIlIIIlIlllIIlIll) {
        return this.buffer.slice(lllllllllllllIIlIlIIIlIlllIlIIIl, lllllllllllllIIlIlIIIlIlllIIlIll);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIlIIIlIllIllllll, final ByteBuf lllllllllllllIIlIlIIIlIllIllIlll, final int lllllllllllllIIlIlIIIlIllIllIllI, final int lllllllllllllIIlIlIIIlIllIllIlIl) {
        this.buffer.getBytes(lllllllllllllIIlIlIIIlIllIllllll, lllllllllllllIIlIlIIIlIllIllIlll, lllllllllllllIIlIlIIIlIllIllIllI, lllllllllllllIIlIlIIIlIllIllIlIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIIlIlIIIlIIlllIIIII, final int lllllllllllllIIlIlIIIlIIllIlllll) {
        return this.buffer.nioBuffers(lllllllllllllIIlIlIIIlIIlllIIIII, lllllllllllllIIlIlIIIlIIllIlllll);
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return this.buffer.hasMemoryAddress();
    }
    
    @Override
    protected void _setShort(final int lllllllllllllIIlIlIIIlIlIllllIIl, final int lllllllllllllIIlIlIIIlIlIllllIII) {
        this.buffer.setShort(lllllllllllllIIlIlIIIlIlIllllIIl, lllllllllllllIIlIlIIIlIlIllllIII);
        "".length();
    }
    
    public DuplicatedByteBuf(final ByteBuf lllllllllllllIIlIlIIIllIIlIIllII) {
        super(lllllllllllllIIlIlIIIllIIlIIllII.maxCapacity());
        if (llIllIlIllIIIII((lllllllllllllIIlIlIIIllIIlIIllII instanceof DuplicatedByteBuf) ? 1 : 0)) {
            this.buffer = ((DuplicatedByteBuf)lllllllllllllIIlIlIIIllIIlIIllII).buffer;
            "".length();
            if ((0x49 ^ 0x26 ^ (0x1D ^ 0x76)) <= 0) {
                throw null;
            }
        }
        else {
            this.buffer = lllllllllllllIIlIlIIIllIIlIIllII;
        }
        this.setIndex(lllllllllllllIIlIlIIIllIIlIIllII.readerIndex(), lllllllllllllIIlIlIIIllIIlIIllII.writerIndex());
        "".length();
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIlIlIIIlIIlllIllIl, final ScatteringByteChannel lllllllllllllIIlIlIIIlIIlllIllII, final int lllllllllllllIIlIlIIIlIIlllIllll) throws IOException {
        return this.buffer.setBytes(lllllllllllllIIlIlIIIlIIlllIllIl, lllllllllllllIIlIlIIIlIIlllIllII, lllllllllllllIIlIlIIIlIIlllIllll);
    }
    
    @Override
    protected long _getLong(final int lllllllllllllIIlIlIIIlIllllIllII) {
        return this.buffer.getLong(lllllllllllllIIlIlIIIlIllllIllII);
    }
    
    @Override
    protected void _setByte(final int lllllllllllllIIlIlIIIlIllIIIlllI, final int lllllllllllllIIlIlIIIlIllIIIlIlI) {
        this.buffer.setByte(lllllllllllllIIlIlIIIlIllIIIlllI, lllllllllllllIIlIlIIIlIllIIIlIlI);
        "".length();
    }
    
    @Override
    public ByteBuf capacity(final int lllllllllllllIIlIlIIIllIIIllIlll) {
        this.buffer.capacity(lllllllllllllIIlIlIIIllIIIllIlll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIlIlIIIlIlIIlllIll, final byte[] lllllllllllllIIlIlIIIlIlIIllIlIl, final int lllllllllllllIIlIlIIIlIlIIllIlII, final int lllllllllllllIIlIlIIIlIlIIllIIll) {
        this.buffer.setBytes(lllllllllllllIIlIlIIIlIlIIlllIll, lllllllllllllIIlIlIIIlIlIIllIlIl, lllllllllllllIIlIlIIIlIlIIllIlII, lllllllllllllIIlIlIIIlIlIIllIIll);
        "".length();
        return this;
    }
    
    @Override
    public short getShort(final int lllllllllllllIIlIlIIIllIIIIlIllI) {
        return this._getShort(lllllllllllllIIlIlIIIllIIIIlIllI);
    }
    
    @Override
    public int nioBufferCount() {
        return this.buffer.nioBufferCount();
    }
    
    @Override
    public boolean hasArray() {
        return this.buffer.hasArray();
    }
    
    @Override
    public ByteBuf unwrap() {
        return this.buffer;
    }
    
    @Override
    public ByteBuf setMedium(final int lllllllllllllIIlIlIIIlIlIlllIIII, final int lllllllllllllIIlIlIIIlIlIllIllll) {
        this._setMedium(lllllllllllllIIlIlIIIlIlIlllIIII, lllllllllllllIIlIlIIIlIlIllIllll);
        return this;
    }
    
    @Override
    public byte[] array() {
        return this.buffer.array();
    }
    
    @Override
    public int getUnsignedMedium(final int lllllllllllllIIlIlIIIllIIIIIlIlI) {
        return this._getUnsignedMedium(lllllllllllllIIlIlIIIllIIIIIlIlI);
    }
    
    @Override
    public long getLong(final int lllllllllllllIIlIlIIIlIlllllIIIl) {
        return this._getLong(lllllllllllllIIlIlIIIlIlllllIIIl);
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIlIlIIIlIlIIlIIlll, final ByteBuf lllllllllllllIIlIlIIIlIlIIlIIllI, final int lllllllllllllIIlIlIIIlIlIIlIlIlI, final int lllllllllllllIIlIlIIIlIlIIlIlIIl) {
        this.buffer.setBytes(lllllllllllllIIlIlIIIlIlIIlIIlll, lllllllllllllIIlIlIIIlIlIIlIIllI, lllllllllllllIIlIlIIIlIlIIlIlIlI, lllllllllllllIIlIlIIIlIlIIlIlIIl);
        "".length();
        return this;
    }
    
    @Override
    public int forEachByteDesc(final int lllllllllllllIIlIlIIIlIIllIIIlII, final int lllllllllllllIIlIlIIIlIIllIIIIll, final ByteBufProcessor lllllllllllllIIlIlIIIlIIllIIIIlI) {
        return this.buffer.forEachByteDesc(lllllllllllllIIlIlIIIlIIllIIIlII, lllllllllllllIIlIlIIIlIIllIIIIll, lllllllllllllIIlIlIIIlIIllIIIIlI);
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIlIlIIIlIIllllllIl, final InputStream lllllllllllllIIlIlIIIlIIlllllIII, final int lllllllllllllIIlIlIIIlIIllllIlll) throws IOException {
        return this.buffer.setBytes(lllllllllllllIIlIlIIIlIIllllllIl, lllllllllllllIIlIlIIIlIIlllllIII, lllllllllllllIIlIlIIIlIIllllIlll);
    }
}
