// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.internal.StringUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.ByteBuffer;
import java.nio.channels.GatheringByteChannel;
import java.io.IOException;
import java.nio.channels.ScatteringByteChannel;
import io.netty.util.ReferenceCounted;
import java.nio.ByteOrder;

class WrappedByteBuf extends ByteBuf
{
    private static final /* synthetic */ String[] lIllIIllIllIII;
    protected final /* synthetic */ ByteBuf buf;
    private static final /* synthetic */ int[] lIllIIllIllIIl;
    
    @Override
    public boolean release(final int lllllllllllllIIIIIIlIlIIlllIIlll) {
        return this.buf.release(lllllllllllllIIIIIIlIlIIlllIIlll);
    }
    
    @Override
    public ByteBuf ensureWritable(final int lllllllllllllIIIIIIllIIIIIlIIlll) {
        this.buf.ensureWritable(lllllllllllllIIIIIIllIIIIIlIIlll);
        "".length();
        return this;
    }
    
    @Override
    public byte[] array() {
        return this.buf.array();
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.buf.alloc();
    }
    
    @Override
    public ByteOrder order() {
        return this.buf.order();
    }
    
    @Override
    public short getShort(final int lllllllllllllIIIIIIllIIIIIIIlIII) {
        return this.buf.getShort(lllllllllllllIIIIIIllIIIIIIIlIII);
    }
    
    @Override
    public char getChar(final int lllllllllllllIIIIIIlIlllllIllllI) {
        return this.buf.getChar(lllllllllllllIIIIIIlIlllllIllllI);
    }
    
    @Override
    public boolean isWritable(final int lllllllllllllIIIIIIlIlIIllllIIIl) {
        return this.buf.isWritable(lllllllllllllIIIIIIlIlIIllllIIIl);
    }
    
    @Override
    public int writeBytes(final ScatteringByteChannel lllllllllllllIIIIIIlIlIlllIIIlII, final int lllllllllllllIIIIIIlIlIlllIIIIll) throws IOException {
        return this.buf.writeBytes(lllllllllllllIIIIIIlIlIlllIIIlII, lllllllllllllIIIIIIlIlIlllIIIIll);
    }
    
    @Override
    public double getDouble(final int lllllllllllllIIIIIIlIlllllIlIIII) {
        return this.buf.getDouble(lllllllllllllIIIIIIlIlllllIlIIII);
    }
    
    @Override
    public int bytesBefore(final byte lllllllllllllIIIIIIlIlIllIlIlIll) {
        return this.buf.bytesBefore(lllllllllllllIIIIIIlIlIllIlIlIll);
    }
    
    @Override
    public int getInt(final int lllllllllllllIIIIIIlIlllllllIIII) {
        return this.buf.getInt(lllllllllllllIIIIIIlIlllllllIIII);
    }
    
    @Override
    public ByteBuf order(final ByteOrder lllllllllllllIIIIIIllIIIIlllIlII) {
        return this.buf.order(lllllllllllllIIIIIIllIIIIlllIlII);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf lllllllllllllIIIIIIlIllIIllllllI, final int lllllllllllllIIIIIIlIllIIllllIlI) {
        this.buf.readBytes(lllllllllllllIIIIIIlIllIIllllllI, lllllllllllllIIIIIIlIllIIllllIlI);
        "".length();
        return this;
    }
    
    @Override
    public int readBytes(final GatheringByteChannel lllllllllllllIIIIIIlIllIIlIIlIII, final int lllllllllllllIIIIIIlIllIIlIIIlII) throws IOException {
        return this.buf.readBytes(lllllllllllllIIIIIIlIllIIlIIlIII, lllllllllllllIIIIIIlIllIIlIIIlII);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIlIllllIIlIlll, final byte[] lllllllllllllIIIIIIlIllllIIllIll, final int lllllllllllllIIIIIIlIllllIIlIlIl, final int lllllllllllllIIIIIIlIllllIIllIIl) {
        this.buf.getBytes(lllllllllllllIIIIIIlIllllIIlIlll, lllllllllllllIIIIIIlIllllIIllIll, lllllllllllllIIIIIIlIllllIIlIlIl, lllllllllllllIIIIIIlIllllIIllIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIlIllllIIIllll, final ByteBuffer lllllllllllllIIIIIIlIllllIIIlllI) {
        this.buf.getBytes(lllllllllllllIIIIIIlIllllIIIllll, lllllllllllllIIIIIIlIllllIIIlllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeMedium(final int lllllllllllllIIIIIIlIllIIIlIIllI) {
        this.buf.writeMedium(lllllllllllllIIIIIIlIllIIIlIIllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf resetReaderIndex() {
        this.buf.resetReaderIndex();
        "".length();
        return this;
    }
    
    @Override
    public int readInt() {
        return this.buf.readInt();
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf lllllllllllllIIIIIIlIlIllllIllll, final int lllllllllllllIIIIIIlIlIllllIlllI, final int lllllllllllllIIIIIIlIlIlllllIIIl) {
        this.buf.writeBytes(lllllllllllllIIIIIIlIlIllllIllll, lllllllllllllIIIIIIlIlIllllIlllI, lllllllllllllIIIIIIlIlIlllllIIIl);
        "".length();
        return this;
    }
    
    @Override
    public int readMedium() {
        return this.buf.readMedium();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIIIlIlllIIIIIIIl, final ByteBuf lllllllllllllIIIIIIlIlllIIIIIIII, final int lllllllllllllIIIIIIlIllIllllllll, final int lllllllllllllIIIIIIlIllIlllllllI) {
        this.buf.setBytes(lllllllllllllIIIIIIlIlllIIIIIIIl, lllllllllllllIIIIIIlIlllIIIIIIII, lllllllllllllIIIIIIlIllIllllllll, lllllllllllllIIIIIIlIllIlllllllI);
        "".length();
        return this;
    }
    
    @Override
    public String toString(final Charset lllllllllllllIIIIIIlIlIlIIlIIlII) {
        return this.buf.toString(lllllllllllllIIIIIIlIlIlIIlIIlII);
    }
    
    @Override
    public boolean isReadable(final int lllllllllllllIIIIIIlIlIIlllllIIl) {
        return this.buf.isReadable(lllllllllllllIIIIIIlIlIIlllllIIl);
    }
    
    @Override
    public String toString(final int lllllllllllllIIIIIIlIlIlIIIllIlI, final int lllllllllllllIIIIIIlIlIlIIIllIIl, final Charset lllllllllllllIIIIIIlIlIlIIIlllII) {
        return this.buf.toString(lllllllllllllIIIIIIlIlIlIIIllIlI, lllllllllllllIIIIIIlIlIlIIIllIIl, lllllllllllllIIIIIIlIlIlIIIlllII);
    }
    
    @Override
    public ByteBuffer nioBuffer(final int lllllllllllllIIIIIIlIlIlIlIIllII, final int lllllllllllllIIIIIIlIlIlIlIIlIII) {
        return this.buf.nioBuffer(lllllllllllllIIIIIIlIlIlIlIIllII, lllllllllllllIIIIIIlIlIlIlIIlIII);
    }
    
    @Override
    public int forEachByte(final ByteBufProcessor lllllllllllllIIIIIIlIlIllIIlIIlI) {
        return this.buf.forEachByte(lllllllllllllIIIIIIlIlIllIIlIIlI);
    }
    
    @Override
    public ByteBuf writeFloat(final float lllllllllllllIIIIIIlIllIIIIIlllI) {
        this.buf.writeFloat(lllllllllllllIIIIIIlIllIIIIIlllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf capacity(final int lllllllllllllIIIIIIllIIIlIIIIIll) {
        this.buf.capacity(lllllllllllllIIIIIIllIIIlIIIIIll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf slice() {
        return this.buf.slice();
    }
    
    @Override
    public ByteBuf writeDouble(final double lllllllllllllIIIIIIlIllIIIIIlIII) {
        this.buf.writeDouble(lllllllllllllIIIIIIlIllIIIIIlIII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf retain() {
        this.buf.retain();
        "".length();
        return this;
    }
    
    @Override
    public int forEachByte(final int lllllllllllllIIIIIIlIlIllIIIlIlI, final int lllllllllllllIIIIIIlIlIllIIIIlIl, final ByteBufProcessor lllllllllllllIIIIIIlIlIllIIIIlII) {
        return this.buf.forEachByte(lllllllllllllIIIIIIlIlIllIIIlIlI, lllllllllllllIIIIIIlIlIllIIIIlIl, lllllllllllllIIIIIIlIlIllIIIIlII);
    }
    
    @Override
    public int getBytes(final int lllllllllllllIIIIIIlIlllIllllIIl, final GatheringByteChannel lllllllllllllIIIIIIlIlllIllllIII, final int lllllllllllllIIIIIIlIlllIlllIIll) throws IOException {
        return this.buf.getBytes(lllllllllllllIIIIIIlIlllIllllIIl, lllllllllllllIIIIIIlIlllIllllIII, lllllllllllllIIIIIIlIlllIlllIIll);
    }
    
    private static void lllllIlIllIlIlI() {
        (lIllIIllIllIIl = new int[4])[0] = ((0x48 ^ 0x28) & ~(0x41 ^ 0x21));
        WrappedByteBuf.lIllIIllIllIIl[1] = (0x76 ^ 0x5E);
        WrappedByteBuf.lIllIIllIllIIl[2] = (0x4 ^ 0x2D);
        WrappedByteBuf.lIllIIllIllIIl[3] = " ".length();
    }
    
    @Override
    public ByteBuf writeLong(final long lllllllllllllIIIIIIlIllIIIIlllII) {
        this.buf.writeLong(lllllllllllllIIIIIIlIllIIIIlllII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIIIlIlllIIIlllIl, final ByteBuf lllllllllllllIIIIIIlIlllIIIlllII) {
        this.buf.setBytes(lllllllllllllIIIIIIlIlllIIIlllIl, lllllllllllllIIIIIIlIlllIIIlllII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIlIllllIllIlII, final ByteBuf lllllllllllllIIIIIIlIllllIllIIll, final int lllllllllllllIIIIIIlIllllIlIllIl, final int lllllllllllllIIIIIIlIllllIllIIIl) {
        this.buf.getBytes(lllllllllllllIIIIIIlIllllIllIlII, lllllllllllllIIIIIIlIllllIllIIll, lllllllllllllIIIIIIlIllllIlIllIl, lllllllllllllIIIIIIlIllllIllIIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf skipBytes(final int lllllllllllllIIIIIIlIllIIIlllllI) {
        this.buf.skipBytes(lllllllllllllIIIIIIlIllIIIlllllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuffer[] nioBuffers() {
        return this.buf.nioBuffers();
    }
    
    @Override
    public int compareTo(final ByteBuf lllllllllllllIIIIIIlIlIlIIIIlIll) {
        return this.buf.compareTo(lllllllllllllIIIIIIlIlIlIIIIlIll);
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        this.buf.discardReadBytes();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIlIllllIIIIIIl, final OutputStream lllllllllllllIIIIIIlIllllIIIIlII, final int lllllllllllllIIIIIIlIlllIlllllll) throws IOException {
        this.buf.getBytes(lllllllllllllIIIIIIlIllllIIIIIIl, lllllllllllllIIIIIIlIllllIIIIlII, lllllllllllllIIIIIIlIlllIlllllll);
        "".length();
        return this;
    }
    
    @Override
    public byte getByte(final int lllllllllllllIIIIIIllIIIIIIlIIlI) {
        return this.buf.getByte(lllllllllllllIIIIIIllIIIIIIlIIlI);
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return this.buf.hasMemoryAddress();
    }
    
    @Override
    public int hashCode() {
        return this.buf.hashCode();
    }
    
    @Override
    public ByteBuf slice(final int lllllllllllllIIIIIIlIlIlIlIllIll, final int lllllllllllllIIIIIIlIlIlIlIllIlI) {
        return this.buf.slice(lllllllllllllIIIIIIlIlIlIlIllIll, lllllllllllllIIIIIIlIlIlIlIllIlI);
    }
    
    @Override
    public int readerIndex() {
        return this.buf.readerIndex();
    }
    
    @Override
    public ByteBuf setIndex(final int lllllllllllllIIIIIIllIIIIlIlIlIl, final int lllllllllllllIIIIIIllIIIIlIlIlII) {
        this.buf.setIndex(lllllllllllllIIIIIIllIIIIlIlIlIl, lllllllllllllIIIIIIllIIIIlIlIlII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf resetWriterIndex() {
        this.buf.resetWriterIndex();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf retain(final int lllllllllllllIIIIIIlIlIlIIIIIIlI) {
        this.buf.retain(lllllllllllllIIIIIIlIlIlIIIIIIlI);
        "".length();
        return this;
    }
    
    @Override
    public int bytesBefore(final int lllllllllllllIIIIIIlIlIllIIlllII, final int lllllllllllllIIIIIIlIlIllIIllIll, final byte lllllllllllllIIIIIIlIlIllIIllIlI) {
        return this.buf.bytesBefore(lllllllllllllIIIIIIlIlIllIIlllII, lllllllllllllIIIIIIlIlIllIIllIll, lllllllllllllIIIIIIlIlIllIIllIlI);
    }
    
    private static void lllllIlIllIlIIl() {
        (lIllIIllIllIII = new String[WrappedByteBuf.lIllIIllIllIIl[3]])[WrappedByteBuf.lIllIIllIllIIl[0]] = lllllIlIllIlIII("Nx0o", "UhNrs");
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf lllllllllllllIIIIIIlIlIlllllllIl, final int lllllllllllllIIIIIIlIlIllllllIIl) {
        this.buf.writeBytes(lllllllllllllIIIIIIlIlIlllllllIl, lllllllllllllIIIIIIlIlIllllllIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf lllllllllllllIIIIIIlIllIIlllIIII, final int lllllllllllllIIIIIIlIllIIlllIIll, final int lllllllllllllIIIIIIlIllIIlllIIlI) {
        this.buf.readBytes(lllllllllllllIIIIIIlIllIIlllIIII, lllllllllllllIIIIIIlIllIIlllIIll, lllllllllllllIIIIIIlIllIIlllIIlI);
        "".length();
        return this;
    }
    
    @Override
    public boolean hasArray() {
        return this.buf.hasArray();
    }
    
    @Override
    public int getUnsignedShort(final int lllllllllllllIIIIIIllIIIIIIIIIII) {
        return this.buf.getUnsignedShort(lllllllllllllIIIIIIllIIIIIIIIIII);
    }
    
    @Override
    public long getLong(final int lllllllllllllIIIIIIlIllllllIIIlI) {
        return this.buf.getLong(lllllllllllllIIIIIIlIllllllIIIlI);
    }
    
    @Override
    public int forEachByteDesc(final int lllllllllllllIIIIIIlIlIlIllllIII, final int lllllllllllllIIIIIIlIlIlIlllIlll, final ByteBufProcessor lllllllllllllIIIIIIlIlIlIlllIllI) {
        return this.buf.forEachByteDesc(lllllllllllllIIIIIIlIlIlIllllIII, lllllllllllllIIIIIIlIlIlIlllIlll, lllllllllllllIIIIIIlIlIlIlllIllI);
    }
    
    @Override
    public int getUnsignedMedium(final int lllllllllllllIIIIIIlIlllllllIllI) {
        return this.buf.getUnsignedMedium(lllllllllllllIIIIIIlIlllllllIllI);
    }
    
    @Override
    public ByteBuf markReaderIndex() {
        this.buf.markReaderIndex();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf lllllllllllllIIIIIIlIllIIIIIIIlI) {
        this.buf.writeBytes(lllllllllllllIIIIIIlIllIIIIIIIlI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final int lllllllllllllIIIIIIlIllIlIIIllll) {
        return this.buf.readBytes(lllllllllllllIIIIIIlIllIlIIIllll);
    }
    
    @Override
    public int getMedium(final int lllllllllllllIIIIIIlIllllllllIlI) {
        return this.buf.getMedium(lllllllllllllIIIIIIlIllllllllIlI);
    }
    
    @Override
    public ByteBuf setInt(final int lllllllllllllIIIIIIlIlllIlIIlIlI, final int lllllllllllllIIIIIIlIlllIlIIIllI) {
        this.buf.setInt(lllllllllllllIIIIIIlIlllIlIIlIlI, lllllllllllllIIIIIIlIlllIlIIIllI);
        "".length();
        return this;
    }
    
    @Override
    public int forEachByteDesc(final ByteBufProcessor lllllllllllllIIIIIIlIlIlIllllllI) {
        return this.buf.forEachByteDesc(lllllllllllllIIIIIIlIlIlIllllllI);
    }
    
    @Override
    public int indexOf(final int lllllllllllllIIIIIIlIlIllIllIlll, final int lllllllllllllIIIIIIlIlIllIllIIlI, final byte lllllllllllllIIIIIIlIlIllIllIlIl) {
        return this.buf.indexOf(lllllllllllllIIIIIIlIlIllIllIlll, lllllllllllllIIIIIIlIlIllIllIIlI, lllllllllllllIIIIIIlIlIllIllIlIl);
    }
    
    @Override
    public int maxCapacity() {
        return this.buf.maxCapacity();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIIIlIllIllllIllI, final byte[] lllllllllllllIIIIIIlIllIlllllIII) {
        this.buf.setBytes(lllllllllllllIIIIIIlIllIllllIllI, lllllllllllllIIIIIIlIllIlllllIII);
        "".length();
        return this;
    }
    
    @Override
    public int readableBytes() {
        return this.buf.readableBytes();
    }
    
    @Override
    public float getFloat(final int lllllllllllllIIIIIIlIlllllIllIII) {
        return this.buf.getFloat(lllllllllllllIIIIIIlIlllllIllIII);
    }
    
    @Override
    public char readChar() {
        return this.buf.readChar();
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIlIlllllIIlIII, final ByteBuf lllllllllllllIIIIIIlIlllllIIlIlI) {
        this.buf.getBytes(lllllllllllllIIIIIIlIlllllIIlIII, lllllllllllllIIIIIIlIlllllIIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public int readUnsignedShort() {
        return this.buf.readUnsignedShort();
    }
    
    @Override
    public ByteBuf writeChar(final int lllllllllllllIIIIIIlIllIIIIlIlII) {
        this.buf.writeChar(lllllllllllllIIIIIIlIllIIIIlIlII);
        "".length();
        return this;
    }
    
    @Override
    public int writeBytes(final InputStream lllllllllllllIIIIIIlIlIlllIlIIII, final int lllllllllllllIIIIIIlIlIlllIIllII) throws IOException {
        return this.buf.writeBytes(lllllllllllllIIIIIIlIlIlllIlIIII, lllllllllllllIIIIIIlIlIlllIIllII);
    }
    
    @Override
    public ByteBuf unwrap() {
        return this.buf;
    }
    
    @Override
    public int ensureWritable(final int lllllllllllllIIIIIIllIIIIIlIIIlI, final boolean lllllllllllllIIIIIIllIIIIIlIIIIl) {
        return this.buf.ensureWritable(lllllllllllllIIIIIIllIIIIIlIIIlI, lllllllllllllIIIIIIllIIIIIlIIIIl);
    }
    
    @Override
    public long readUnsignedInt() {
        return this.buf.readUnsignedInt();
    }
    
    @Override
    public ByteBuf setByte(final int lllllllllllllIIIIIIlIlllIllIIIlI, final int lllllllllllllIIIIIIlIlllIllIIIIl) {
        this.buf.setByte(lllllllllllllIIIIIIlIlllIllIIIlI, lllllllllllllIIIIIIlIlllIllIIIIl);
        "".length();
        return this;
    }
    
    @Override
    public boolean release() {
        return this.buf.release();
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIIIIIlIllIllIIlIll, final ScatteringByteChannel lllllllllllllIIIIIIlIllIllIIlIlI, final int lllllllllllllIIIIIIlIllIllIIIlIl) throws IOException {
        return this.buf.setBytes(lllllllllllllIIIIIIlIllIllIIlIll, lllllllllllllIIIIIIlIllIllIIlIlI, lllllllllllllIIIIIIlIllIllIIIlIl);
    }
    
    static {
        lllllIlIllIlIlI();
        lllllIlIllIlIIl();
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] lllllllllllllIIIIIIlIlIllllIIIIl, final int lllllllllllllIIIIIIlIlIlllIlllII, final int lllllllllllllIIIIIIlIlIlllIllIll) {
        this.buf.writeBytes(lllllllllllllIIIIIIlIlIllllIIIIl, lllllllllllllIIIIIIlIlIlllIlllII, lllllllllllllIIIIIIlIlIlllIllIll);
        "".length();
        return this;
    }
    
    @Override
    public int bytesBefore(final int lllllllllllllIIIIIIlIlIllIlIIIll, final byte lllllllllllllIIIIIIlIlIllIlIIIlI) {
        return this.buf.bytesBefore(lllllllllllllIIIIIIlIlIllIlIIIll, lllllllllllllIIIIIIlIlIllIlIIIlI);
    }
    
    @Override
    public int capacity() {
        return this.buf.capacity();
    }
    
    @Override
    public short readUnsignedByte() {
        return this.buf.readUnsignedByte();
    }
    
    @Override
    public ByteBuf readerIndex(final int lllllllllllllIIIIIIllIIIIllIIlIl) {
        this.buf.readerIndex(lllllllllllllIIIIIIllIIIIllIIlIl);
        "".length();
        return this;
    }
    
    @Override
    public int nioBufferCount() {
        return this.buf.nioBufferCount();
    }
    
    @Override
    public ByteBuf clear() {
        this.buf.clear();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIIIlIlllIIIlIIll, final ByteBuf lllllllllllllIIIIIIlIlllIIIIlllI, final int lllllllllllllIIIIIIlIlllIIIlIIIl) {
        this.buf.setBytes(lllllllllllllIIIIIIlIlllIIIlIIll, lllllllllllllIIIIIIlIlllIIIIlllI, lllllllllllllIIIIIIlIlllIIIlIIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream lllllllllllllIIIIIIlIllIIlIlIIIl, final int lllllllllllllIIIIIIlIllIIlIlIIII) throws IOException {
        this.buf.readBytes(lllllllllllllIIIIIIlIllIIlIlIIIl, lllllllllllllIIIIIIlIllIIlIlIIII);
        "".length();
        return this;
    }
    
    @Override
    public boolean isWritable() {
        return this.buf.isWritable();
    }
    
    @Override
    public ByteBuf setDouble(final int lllllllllllllIIIIIIlIlllIIlIIIll, final double lllllllllllllIIIIIIlIlllIIlIIlIl) {
        this.buf.setDouble(lllllllllllllIIIIIIlIlllIIlIIIll, lllllllllllllIIIIIIlIlllIIlIIlIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer lllllllllllllIIIIIIlIllIIlIlIllI) {
        this.buf.readBytes(lllllllllllllIIIIIIlIllIIlIlIllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeInt(final int lllllllllllllIIIIIIlIllIIIlIIIII) {
        this.buf.writeInt(lllllllllllllIIIIIIlIllIIIlIIIII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readSlice(final int lllllllllllllIIIIIIlIllIlIIIlIIl) {
        return this.buf.readSlice(lllllllllllllIIIIIIlIllIlIIIlIIl);
    }
    
    @Override
    public boolean isDirect() {
        return this.buf.isDirect();
    }
    
    @Override
    public ByteBuf setFloat(final int lllllllllllllIIIIIIlIlllIIlIllII, final float lllllllllllllIIIIIIlIlllIIlIlIll) {
        this.buf.setFloat(lllllllllllllIIIIIIlIlllIIlIllII, lllllllllllllIIIIIIlIlllIIlIlIll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuffer nioBuffer() {
        return this.buf.nioBuffer();
    }
    
    @Override
    public ByteBuf writeZero(final int lllllllllllllIIIIIIlIlIllIllllIl) {
        this.buf.writeZero(lllllllllllllIIIIIIlIlIllIllllIl);
        "".length();
        return this;
    }
    
    @Override
    public int refCnt() {
        return this.buf.refCnt();
    }
    
    @Override
    public ByteBuf setBoolean(final int lllllllllllllIIIIIIlIlllIllIlIll, final boolean lllllllllllllIIIIIIlIlllIllIlIlI) {
        this.buf.setBoolean(lllllllllllllIIIIIIlIlllIllIlIll, lllllllllllllIIIIIIlIlllIllIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeBoolean(final boolean lllllllllllllIIIIIIlIllIIIlllIII) {
        this.buf.writeBoolean(lllllllllllllIIIIIIlIllIIIlllIII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIIIIIIlIlIlIIllIlll, final int lllllllllllllIIIIIIlIlIlIIllIIll) {
        return this.buf.internalNioBuffer(lllllllllllllIIIIIIlIlIlIIllIlll, lllllllllllllIIIIIIlIlIlIIllIIll);
    }
    
    @Override
    public long memoryAddress() {
        return this.buf.memoryAddress();
    }
    
    protected WrappedByteBuf(final ByteBuf lllllllllllllIIIIIIllIIIlIIlIIII) {
        if (lllllIlIllIlIll(lllllllllllllIIIIIIllIIIlIIlIIII)) {
            throw new NullPointerException(WrappedByteBuf.lIllIIllIllIII[WrappedByteBuf.lIllIIllIllIIl[0]]);
        }
        this.buf = lllllllllllllIIIIIIllIIIlIIlIIII;
    }
    
    private static String lllllIlIllIlIII(String lllllllllllllIIIIIIlIlIIllIIIllI, final String lllllllllllllIIIIIIlIlIIllIIIlIl) {
        lllllllllllllIIIIIIlIlIIllIIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIlIlIIllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIlIlIIllIIlIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIIlIlIIllIIlIII = lllllllllllllIIIIIIlIlIIllIIIlIl.toCharArray();
        int lllllllllllllIIIIIIlIlIIllIIIlll = WrappedByteBuf.lIllIIllIllIIl[0];
        final char lllllllllllllIIIIIIlIlIIllIIIIIl = (Object)lllllllllllllIIIIIIlIlIIllIIIllI.toCharArray();
        final boolean lllllllllllllIIIIIIlIlIIllIIIIII = lllllllllllllIIIIIIlIlIIllIIIIIl.length != 0;
        char lllllllllllllIIIIIIlIlIIlIllllll = (char)WrappedByteBuf.lIllIIllIllIIl[0];
        while (lllllIlIllIllII(lllllllllllllIIIIIIlIlIIlIllllll, lllllllllllllIIIIIIlIlIIllIIIIII ? 1 : 0)) {
            final char lllllllllllllIIIIIIlIlIIllIIllII = lllllllllllllIIIIIIlIlIIllIIIIIl[lllllllllllllIIIIIIlIlIIlIllllll];
            lllllllllllllIIIIIIlIlIIllIIlIIl.append((char)(lllllllllllllIIIIIIlIlIIllIIllII ^ lllllllllllllIIIIIIlIlIIllIIlIII[lllllllllllllIIIIIIlIlIIllIIIlll % lllllllllllllIIIIIIlIlIIllIIlIII.length]));
            "".length();
            ++lllllllllllllIIIIIIlIlIIllIIIlll;
            ++lllllllllllllIIIIIIlIlIIlIllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIlIlIIllIIlIIl);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIlIllllIlIIlII, final byte[] lllllllllllllIIIIIIlIllllIlIIllI) {
        this.buf.getBytes(lllllllllllllIIIIIIlIllllIlIIlII, lllllllllllllIIIIIIlIllllIlIIllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final byte[] lllllllllllllIIIIIIlIllIIllIlIlI) {
        this.buf.readBytes(lllllllllllllIIIIIIlIllIIllIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf markWriterIndex() {
        this.buf.markWriterIndex();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIIIIIIlIlIlIllIIlll, final int lllllllllllllIIIIIIlIlIlIllIlIIl) {
        return this.buf.copy(lllllllllllllIIIIIIlIlIlIllIIlll, lllllllllllllIIIIIIlIlIlIllIlIIl);
    }
    
    @Override
    public float readFloat() {
        return this.buf.readFloat();
    }
    
    @Override
    public double readDouble() {
        return this.buf.readDouble();
    }
    
    @Override
    public int writableBytes() {
        return this.buf.writableBytes();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIIIlIllIlllIlllI, final byte[] lllllllllllllIIIIIIlIllIlllIlIII, final int lllllllllllllIIIIIIlIllIlllIIlll, final int lllllllllllllIIIIIIlIllIlllIIllI) {
        this.buf.setBytes(lllllllllllllIIIIIIlIllIlllIlllI, lllllllllllllIIIIIIlIllIlllIlIII, lllllllllllllIIIIIIlIllIlllIIlll, lllllllllllllIIIIIIlIllIlllIIllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setChar(final int lllllllllllllIIIIIIlIlllIIllIlIl, final int lllllllllllllIIIIIIlIlllIIllIlll) {
        this.buf.setChar(lllllllllllllIIIIIIlIlllIIllIlIl, lllllllllllllIIIIIIlIlllIIllIlll);
        "".length();
        return this;
    }
    
    @Override
    public short getUnsignedByte(final int lllllllllllllIIIIIIllIIIIIIIlllI) {
        return this.buf.getUnsignedByte(lllllllllllllIIIIIIllIIIIIIIlllI);
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIIIIIIlIlIlIIllllIl, final int lllllllllllllIIIIIIlIlIlIIllllll) {
        return this.buf.nioBuffers(lllllllllllllIIIIIIlIlIlIIllllIl, lllllllllllllIIIIIIlIlIlIIllllll);
    }
    
    @Override
    public byte readByte() {
        return this.buf.readByte();
    }
    
    @Override
    public boolean getBoolean(final int lllllllllllllIIIIIIllIIIIIIllIlI) {
        return this.buf.getBoolean(lllllllllllllIIIIIIllIIIIIIllIlI);
    }
    
    @Override
    public ByteBuf copy() {
        return this.buf.copy();
    }
    
    @Override
    public int maxWritableBytes() {
        return this.buf.maxWritableBytes();
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] lllllllllllllIIIIIIlIlIllllIIlll) {
        this.buf.writeBytes(lllllllllllllIIIIIIlIlIllllIIlll);
        "".length();
        return this;
    }
    
    @Override
    public short readShort() {
        return this.buf.readShort();
    }
    
    @Override
    public ByteBuf writeShort(final int lllllllllllllIIIIIIlIllIIIlIllII) {
        this.buf.writeShort(lllllllllllllIIIIIIlIllIIIlIllII);
        "".length();
        return this;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append((char)WrappedByteBuf.lIllIIllIllIIl[1]).append(this.buf.toString()).append((char)WrappedByteBuf.lIllIIllIllIIl[2]));
    }
    
    @Override
    public ByteBuf writeByte(final int lllllllllllllIIIIIIlIllIIIllIlII) {
        this.buf.writeByte(lllllllllllllIIIIIIlIllIIIllIlII);
        "".length();
        return this;
    }
    
    @Override
    public long readLong() {
        return this.buf.readLong();
    }
    
    @Override
    public int arrayOffset() {
        return this.buf.arrayOffset();
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIIIIIlIllIllIlIlll, final InputStream lllllllllllllIIIIIIlIllIllIlIIlI, final int lllllllllllllIIIIIIlIllIllIlIIIl) throws IOException {
        return this.buf.setBytes(lllllllllllllIIIIIIlIllIllIlIlll, lllllllllllllIIIIIIlIllIllIlIIlI, lllllllllllllIIIIIIlIllIllIlIIIl);
    }
    
    @Override
    public ByteBuf setShort(final int lllllllllllllIIIIIIlIlllIlIlllII, final int lllllllllllllIIIIIIlIlllIlIllIII) {
        this.buf.setShort(lllllllllllllIIIIIIlIlllIlIlllII, lllllllllllllIIIIIIlIlllIlIllIII);
        "".length();
        return this;
    }
    
    @Override
    public boolean readBoolean() {
        return this.buf.readBoolean();
    }
    
    @Override
    public boolean isReadable() {
        return this.buf.isReadable();
    }
    
    @Override
    public int writerIndex() {
        return this.buf.writerIndex();
    }
    
    @Override
    public long getUnsignedInt(final int lllllllllllllIIIIIIlIllllllIlIlI) {
        return this.buf.getUnsignedInt(lllllllllllllIIIIIIlIllllllIlIlI);
    }
    
    private static boolean lllllIlIllIllII(final int lllllllllllllIIIIIIlIlIIlIlllIll, final int lllllllllllllIIIIIIlIlIIlIlllIlI) {
        return lllllllllllllIIIIIIlIlIIlIlllIll < lllllllllllllIIIIIIlIlIIlIlllIlI;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf lllllllllllllIIIIIIlIllIlIIIIIll) {
        this.buf.readBytes(lllllllllllllIIIIIIlIllIlIIIIIll);
        "".length();
        return this;
    }
    
    @Override
    public int readUnsignedMedium() {
        return this.buf.readUnsignedMedium();
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIIIIIlIlIlIIIIllll) {
        return this.buf.equals(lllllllllllllIIIIIIlIlIlIIIIllll);
    }
    
    @Override
    public ByteBuf setLong(final int lllllllllllllIIIIIIlIlllIlIIIIIl, final long lllllllllllllIIIIIIlIlllIlIIIIII) {
        this.buf.setLong(lllllllllllllIIIIIIlIlllIlIIIIIl, lllllllllllllIIIIIIlIlllIlIIIIII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setZero(final int lllllllllllllIIIIIIlIllIlIllllIl, final int lllllllllllllIIIIIIlIllIlIllllll) {
        this.buf.setZero(lllllllllllllIIIIIIlIllIlIllllIl, lllllllllllllIIIIIIlIllIlIllllll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf discardSomeReadBytes() {
        this.buf.discardSomeReadBytes();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final byte[] lllllllllllllIIIIIIlIllIIlIllllI, final int lllllllllllllIIIIIIlIllIIllIIIIl, final int lllllllllllllIIIIIIlIllIIlIlllII) {
        this.buf.readBytes(lllllllllllllIIIIIIlIllIIlIllllI, lllllllllllllIIIIIIlIllIIllIIIIl, lllllllllllllIIIIIIlIllIIlIlllII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setMedium(final int lllllllllllllIIIIIIlIlllIlIlIIII, final int lllllllllllllIIIIIIlIlllIlIlIIlI) {
        this.buf.setMedium(lllllllllllllIIIIIIlIlllIlIlIIII, lllllllllllllIIIIIIlIlllIlIlIIlI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf duplicate() {
        return this.buf.duplicate();
    }
    
    private static boolean lllllIlIllIlIll(final Object lllllllllllllIIIIIIlIlIIlIlllIII) {
        return lllllllllllllIIIIIIlIlIIlIlllIII == null;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIlIllllIllllIl, final ByteBuf lllllllllllllIIIIIIlIlllllIIIIII, final int lllllllllllllIIIIIIlIllllIlllIll) {
        this.buf.getBytes(lllllllllllllIIIIIIlIllllIllllIl, lllllllllllllIIIIIIlIlllllIIIIII, lllllllllllllIIIIIIlIllllIlllIll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writerIndex(final int lllllllllllllIIIIIIllIIIIlIlllII) {
        this.buf.writerIndex(lllllllllllllIIIIIIllIIIIlIlllII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuffer lllllllllllllIIIIIIlIlIlllIlIlll) {
        this.buf.writeBytes(lllllllllllllIIIIIIlIlIlllIlIlll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIIIlIllIlllIIIIl, final ByteBuffer lllllllllllllIIIIIIlIllIllIlllIl) {
        this.buf.setBytes(lllllllllllllIIIIIIlIllIlllIIIIl, lllllllllllllIIIIIIlIllIllIlllIl);
        "".length();
        return this;
    }
}
