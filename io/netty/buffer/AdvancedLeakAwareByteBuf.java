// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.channels.ScatteringByteChannel;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.channels.GatheringByteChannel;
import io.netty.util.ReferenceCounted;
import java.io.IOException;
import java.io.InputStream;
import io.netty.util.ResourceLeak;

final class AdvancedLeakAwareByteBuf extends WrappedByteBuf
{
    private final /* synthetic */ ResourceLeak leak;
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlIlIIlIlIIlIIIII, final ByteBuf lllllllllllllIlIlIlIIlIlIIIlllll, final int lllllllllllllIlIlIlIIlIlIIIllllI, final int lllllllllllllIlIlIlIIlIlIIlIIIlI) {
        this.leak.record();
        return super.getBytes(lllllllllllllIlIlIlIIlIlIIlIIIII, lllllllllllllIlIlIlIIlIlIIIlllll, lllllllllllllIlIlIlIIlIlIIIllllI, lllllllllllllIlIlIlIIlIlIIlIIIlI);
    }
    
    @Override
    public ByteBuf discardSomeReadBytes() {
        this.leak.record();
        return super.discardSomeReadBytes();
    }
    
    @Override
    public int indexOf(final int lllllllllllllIlIlIlIIIllIIlIlllI, final int lllllllllllllIlIlIlIIIllIIlIllIl, final byte lllllllllllllIlIlIlIIIllIIlIlIII) {
        this.leak.record();
        return super.indexOf(lllllllllllllIlIlIlIIIllIIlIlllI, lllllllllllllIlIlIlIIIllIIlIllIl, lllllllllllllIlIlIlIIIllIIlIlIII);
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] lllllllllllllIlIlIlIIIllIlIllllI) {
        this.leak.record();
        return super.writeBytes(lllllllllllllIlIlIlIIIllIlIllllI);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlIlIIlIlIIlIlllI, final ByteBuf lllllllllllllIlIlIlIIlIlIIlIllIl, final int lllllllllllllIlIlIlIIlIlIIllIIII) {
        this.leak.record();
        return super.getBytes(lllllllllllllIlIlIlIIlIlIIlIlllI, lllllllllllllIlIlIlIIlIlIIlIllIl, lllllllllllllIlIlIlIIlIlIIllIIII);
    }
    
    @Override
    public int readUnsignedMedium() {
        this.leak.record();
        return super.readUnsignedMedium();
    }
    
    @Override
    public int setBytes(final int lllllllllllllIlIlIlIIlIIIlIIIlII, final InputStream lllllllllllllIlIlIlIIlIIIlIIIIll, final int lllllllllllllIlIlIlIIlIIIlIIIllI) throws IOException {
        this.leak.record();
        return super.setBytes(lllllllllllllIlIlIlIIlIIIlIIIlII, lllllllllllllIlIlIlIIlIIIlIIIIll, lllllllllllllIlIlIlIIlIIIlIIIllI);
    }
    
    @Override
    public int bytesBefore(final int lllllllllllllIlIlIlIIIllIIIlllIl, final byte lllllllllllllIlIlIlIIIllIIIlllII) {
        this.leak.record();
        return super.bytesBefore(lllllllllllllIlIlIlIIIllIIIlllIl, lllllllllllllIlIlIlIIIllIIIlllII);
    }
    
    @Override
    public ByteBuf retain(final int lllllllllllllIlIlIlIIIlIlIlIIIII) {
        this.leak.record();
        return super.retain(lllllllllllllIlIlIlIIIlIlIlIIIII);
    }
    
    @Override
    public ByteBuf writeChar(final int lllllllllllllIlIlIlIIIlllIIIlIll) {
        this.leak.record();
        return super.writeChar(lllllllllllllIlIlIlIIIlllIIIlIll);
    }
    
    @Override
    public float readFloat() {
        this.leak.record();
        return super.readFloat();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlIlIIlIIlIIIIlII, final ByteBuf lllllllllllllIlIlIlIIlIIIlllllll, final int lllllllllllllIlIlIlIIlIIIllllllI) {
        this.leak.record();
        return super.setBytes(lllllllllllllIlIlIlIIlIIlIIIIlII, lllllllllllllIlIlIlIIlIIIlllllll, lllllllllllllIlIlIlIIlIIIllllllI);
    }
    
    @Override
    public boolean readBoolean() {
        this.leak.record();
        return super.readBoolean();
    }
    
    @Override
    public ByteBuf slice() {
        this.leak.record();
        return new AdvancedLeakAwareByteBuf(super.slice(), this.leak);
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlIlIIlIIIlIlllll, final byte[] lllllllllllllIlIlIlIIlIIIlIllIIl, final int lllllllllllllIlIlIlIIlIIIlIllIII, final int lllllllllllllIlIlIlIIlIIIlIlIlll) {
        this.leak.record();
        return super.setBytes(lllllllllllllIlIlIlIIlIIIlIlllll, lllllllllllllIlIlIlIIlIIIlIllIIl, lllllllllllllIlIlIlIIlIIIlIllIII, lllllllllllllIlIlIlIIlIIIlIlIlll);
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        this.leak.record();
        return super.discardReadBytes();
    }
    
    @Override
    public int getInt(final int lllllllllllllIlIlIlIIlIlIlIlllll) {
        this.leak.record();
        return super.getInt(lllllllllllllIlIlIlIIlIlIlIlllll);
    }
    
    @Override
    public ByteBuf setChar(final int lllllllllllllIlIlIlIIlIIlIlIlIIl, final int lllllllllllllIlIlIlIIlIIlIlIlIII) {
        this.leak.record();
        return super.setChar(lllllllllllllIlIlIlIIlIIlIlIlIIl, lllllllllllllIlIlIlIIlIIlIlIlIII);
    }
    
    @Override
    public int getBytes(final int lllllllllllllIlIlIlIIlIIlllIlIlI, final GatheringByteChannel lllllllllllllIlIlIlIIlIIlllIIlIl, final int lllllllllllllIlIlIlIIlIIlllIIlII) throws IOException {
        this.leak.record();
        return super.getBytes(lllllllllllllIlIlIlIIlIIlllIlIlI, lllllllllllllIlIlIlIIlIIlllIIlIl, lllllllllllllIlIlIlIIlIIlllIIlII);
    }
    
    @Override
    public int bytesBefore(final int lllllllllllllIlIlIlIIIllIIIIllll, final int lllllllllllllIlIlIlIIIllIIIlIIlI, final byte lllllllllllllIlIlIlIIIllIIIIllIl) {
        this.leak.record();
        return super.bytesBefore(lllllllllllllIlIlIlIIIllIIIIllll, lllllllllllllIlIlIlIIIllIIIlIIlI, lllllllllllllIlIlIlIIIllIIIIllIl);
    }
    
    @Override
    public double getDouble(final int lllllllllllllIlIlIlIIlIlIlIIIIll) {
        this.leak.record();
        return super.getDouble(lllllllllllllIlIlIlIIlIlIlIIIIll);
    }
    
    @Override
    public ByteBuf setFloat(final int lllllllllllllIlIlIlIIlIIlIlIIIII, final float lllllllllllllIlIlIlIIlIIlIIlllII) {
        this.leak.record();
        return super.setFloat(lllllllllllllIlIlIlIIlIIlIlIIIII, lllllllllllllIlIlIlIIlIIlIIlllII);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf lllllllllllllIlIlIlIIIllIllIIllI, final int lllllllllllllIlIlIlIIIllIllIlIIl, final int lllllllllllllIlIlIlIIIllIllIIlII) {
        this.leak.record();
        return super.writeBytes(lllllllllllllIlIlIlIIIllIllIIllI, lllllllllllllIlIlIlIIIllIllIlIIl, lllllllllllllIlIlIlIIIllIllIIlII);
    }
    
    @Override
    public ByteBuf slice(final int lllllllllllllIlIlIlIIlIllIllIIIl, final int lllllllllllllIlIlIlIIlIllIllIIII) {
        this.leak.record();
        return new AdvancedLeakAwareByteBuf(super.slice(lllllllllllllIlIlIlIIlIllIllIIIl, lllllllllllllIlIlIlIIlIllIllIIII), this.leak);
    }
    
    @Override
    public int forEachByte(final int lllllllllllllIlIlIlIIIllIIIIIIIl, final int lllllllllllllIlIlIlIIIllIIIIIIII, final ByteBufProcessor lllllllllllllIlIlIlIIIlIlllllIll) {
        this.leak.record();
        return super.forEachByte(lllllllllllllIlIlIlIIIllIIIIIIIl, lllllllllllllIlIlIlIIIllIIIIIIII, lllllllllllllIlIlIlIIIlIlllllIll);
    }
    
    @Override
    public ByteBuf copy() {
        this.leak.record();
        return super.copy();
    }
    
    @Override
    public ByteBuf writeByte(final int lllllllllllllIlIlIlIIIlllIlIlIIl) {
        this.leak.record();
        return super.writeByte(lllllllllllllIlIlIlIIIlllIlIlIIl);
    }
    
    @Override
    public ByteBuf skipBytes(final int lllllllllllllIlIlIlIIIlllIllIlll) {
        this.leak.record();
        return super.skipBytes(lllllllllllllIlIlIlIIIlllIllIlll);
    }
    
    @Override
    public String toString(final Charset lllllllllllllIlIlIlIIIlIlIllIlIl) {
        this.leak.record();
        return super.toString(lllllllllllllIlIlIlIIIlIlIllIlIl);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuffer lllllllllllllIlIlIlIIIllIlIIllII) {
        this.leak.record();
        return super.writeBytes(lllllllllllllIlIlIlIIIllIlIIllII);
    }
    
    @Override
    public boolean getBoolean(final int lllllllllllllIlIlIlIIlIllIIIlIll) {
        this.leak.record();
        return super.getBoolean(lllllllllllllIlIlIlIIlIllIIIlIll);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf lllllllllllllIlIlIlIIIllIlllIIIl, final int lllllllllllllIlIlIlIIIllIlllIIII) {
        this.leak.record();
        return super.writeBytes(lllllllllllllIlIlIlIIIllIlllIIIl, lllllllllllllIlIlIlIIIllIlllIIII);
    }
    
    @Override
    public ByteBuffer[] nioBuffers() {
        this.leak.record();
        return super.nioBuffers();
    }
    
    @Override
    public ByteBuf writeLong(final long lllllllllllllIlIlIlIIIlllIIlIIIl) {
        this.leak.record();
        return super.writeLong(lllllllllllllIlIlIlIIIlllIIlIIIl);
    }
    
    @Override
    public byte readByte() {
        this.leak.record();
        return super.readByte();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlIlIIlIIIllIIlll, final byte[] lllllllllllllIlIlIlIIlIIIllIlIIl) {
        this.leak.record();
        return super.setBytes(lllllllllllllIlIlIlIIlIIIllIIlll, lllllllllllllIlIlIlIIlIIIllIlIIl);
    }
    
    @Override
    public byte getByte(final int lllllllllllllIlIlIlIIlIllIIIIlIl) {
        this.leak.record();
        return super.getByte(lllllllllllllIlIlIlIIlIllIIIIlIl);
    }
    
    @Override
    public int readUnsignedShort() {
        this.leak.record();
        return super.readUnsignedShort();
    }
    
    @Override
    public int readMedium() {
        this.leak.record();
        return super.readMedium();
    }
    
    @Override
    public long getLong(final int lllllllllllllIlIlIlIIlIlIlIlIIll) {
        this.leak.record();
        return super.getLong(lllllllllllllIlIlIlIIlIlIlIlIIll);
    }
    
    @Override
    public ByteBuf writeFloat(final float lllllllllllllIlIlIlIIIlllIIIIlIl) {
        this.leak.record();
        return super.writeFloat(lllllllllllllIlIlIlIIIlllIIIIlIl);
    }
    
    @Override
    public ByteBuffer nioBuffer(final int lllllllllllllIlIlIlIIIlIllIIllll, final int lllllllllllllIlIlIlIIIlIllIIlllI) {
        this.leak.record();
        return super.nioBuffer(lllllllllllllIlIlIlIIIlIllIIllll, lllllllllllllIlIlIlIIIlIllIIlllI);
    }
    
    @Override
    public double readDouble() {
        this.leak.record();
        return super.readDouble();
    }
    
    @Override
    public ByteBuf writeZero(final int lllllllllllllIlIlIlIIIllIIllIlII) {
        this.leak.record();
        return super.writeZero(lllllllllllllIlIlIlIIIllIIllIlII);
    }
    
    @Override
    public ByteBuf writeShort(final int lllllllllllllIlIlIlIIIlllIlIIIll) {
        this.leak.record();
        return super.writeShort(lllllllllllllIlIlIlIIIlllIlIIIll);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf lllllllllllllIlIlIlIIIllIllllIIl) {
        this.leak.record();
        return super.writeBytes(lllllllllllllIlIlIlIIIllIllllIIl);
    }
    
    @Override
    public ByteBuf writeDouble(final double lllllllllllllIlIlIlIIIlllIIIIIIl) {
        this.leak.record();
        return super.writeDouble(lllllllllllllIlIlIlIIIlllIIIIIIl);
    }
    
    @Override
    public ByteBuf retain() {
        this.leak.record();
        return super.retain();
    }
    
    @Override
    public String toString(final int lllllllllllllIlIlIlIIIlIlIlIlIIl, final int lllllllllllllIlIlIlIIIlIlIlIlIII, final Charset lllllllllllllIlIlIlIIIlIlIlIIlll) {
        this.leak.record();
        return super.toString(lllllllllllllIlIlIlIIIlIlIlIlIIl, lllllllllllllIlIlIlIIIlIlIlIlIII, lllllllllllllIlIlIlIIIlIlIlIIlll);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlIlIIlIIllllllIl, final ByteBuffer lllllllllllllIlIlIlIIlIIllllllll) {
        this.leak.record();
        return super.getBytes(lllllllllllllIlIlIlIIlIIllllllIl, lllllllllllllIlIlIlIIlIIllllllll);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf lllllllllllllIlIlIlIIIlllllIlIll, final int lllllllllllllIlIlIlIIIlllllIlIlI, final int lllllllllllllIlIlIlIIIlllllIlIIl) {
        this.leak.record();
        return super.readBytes(lllllllllllllIlIlIlIIIlllllIlIll, lllllllllllllIlIlIlIIIlllllIlIlI, lllllllllllllIlIlIlIIIlllllIlIIl);
    }
    
    @Override
    public short getUnsignedByte(final int lllllllllllllIlIlIlIIlIlIlllllIl) {
        this.leak.record();
        return super.getUnsignedByte(lllllllllllllIlIlIlIIlIlIlllllIl);
    }
    
    @Override
    public int ensureWritable(final int lllllllllllllIlIlIlIIlIllIIlIIII, final boolean lllllllllllllIlIlIlIIlIllIIlIIlI) {
        this.leak.record();
        return super.ensureWritable(lllllllllllllIlIlIlIIlIllIIlIIII, lllllllllllllIlIlIlIIlIllIIlIIlI);
    }
    
    @Override
    public ByteBuf ensureWritable(final int lllllllllllllIlIlIlIIlIllIIllIII) {
        this.leak.record();
        return super.ensureWritable(lllllllllllllIlIlIlIIlIllIIllIII);
    }
    
    @Override
    public long readLong() {
        this.leak.record();
        return super.readLong();
    }
    
    @Override
    public ByteBuf setShort(final int lllllllllllllIlIlIlIIlIIllIIllIl, final int lllllllllllllIlIlIlIIlIIllIIllII) {
        this.leak.record();
        return super.setShort(lllllllllllllIlIlIlIIlIIllIIllIl, lllllllllllllIlIlIlIIlIIllIIllII);
    }
    
    @Override
    public float getFloat(final int lllllllllllllIlIlIlIIlIlIlIIIlll) {
        this.leak.record();
        return super.getFloat(lllllllllllllIlIlIlIIlIlIlIIIlll);
    }
    
    @Override
    public ByteBuf writeMedium(final int lllllllllllllIlIlIlIIIlllIIlllll) {
        this.leak.record();
        return super.writeMedium(lllllllllllllIlIlIlIIIlllIIlllll);
    }
    
    @Override
    public int getMedium(final int lllllllllllllIlIlIlIIlIlIllIlIll) {
        this.leak.record();
        return super.getMedium(lllllllllllllIlIlIlIIlIlIllIlIll);
    }
    
    private static boolean lIllIIIIlIllIII(final Object lllllllllllllIlIlIlIIIlIlIIIllII, final Object lllllllllllllIlIlIlIIIlIlIIIlIll) {
        return lllllllllllllIlIlIlIIIlIlIIIllII == lllllllllllllIlIlIlIIIlIlIIIlIll;
    }
    
    @Override
    public ByteBuf readBytes(final byte[] lllllllllllllIlIlIlIIIllllIllIIl, final int lllllllllllllIlIlIlIIIllllIlIlII, final int lllllllllllllIlIlIlIIIllllIlIIll) {
        this.leak.record();
        return super.readBytes(lllllllllllllIlIlIlIIIllllIllIIl, lllllllllllllIlIlIlIIIllllIlIlII, lllllllllllllIlIlIlIIIllllIlIIll);
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlIlIIlIIIlIIllll, final ByteBuffer lllllllllllllIlIlIlIIlIIIlIlIIIl) {
        this.leak.record();
        return super.setBytes(lllllllllllllIlIlIlIIlIIIlIIllll, lllllllllllllIlIlIlIIlIIIlIlIIIl);
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] lllllllllllllIlIlIlIIIllIlIlIlII, final int lllllllllllllIlIlIlIIIllIlIlIIll, final int lllllllllllllIlIlIlIIIllIlIlIllI) {
        this.leak.record();
        return super.writeBytes(lllllllllllllIlIlIlIIIllIlIlIlII, lllllllllllllIlIlIlIIIllIlIlIIll, lllllllllllllIlIlIlIIIllIlIlIllI);
    }
    
    @Override
    public ByteBuf readSlice(final int lllllllllllllIlIlIlIIlIllIlIIllI) {
        this.leak.record();
        return new AdvancedLeakAwareByteBuf(super.readSlice(lllllllllllllIlIlIlIIlIllIlIIllI), this.leak);
    }
    
    @Override
    public ByteBuf setLong(final int lllllllllllllIlIlIlIIlIIlIllIIlI, final long lllllllllllllIlIlIlIIlIIlIllIIIl) {
        this.leak.record();
        return super.setLong(lllllllllllllIlIlIlIIlIIlIllIIlI, lllllllllllllIlIlIlIIlIIlIllIIIl);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer lllllllllllllIlIlIlIIIllllIIllll) {
        this.leak.record();
        return super.readBytes(lllllllllllllIlIlIlIIIllllIIllll);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIlIlIlIIIlIlIlllIlI, final int lllllllllllllIlIlIlIIIlIlIllllII) {
        this.leak.record();
        return super.internalNioBuffer(lllllllllllllIlIlIlIIIlIlIlllIlI, lllllllllllllIlIlIlIIIlIlIllllII);
    }
    
    @Override
    public boolean release() {
        final boolean lllllllllllllIlIlIlIIlIlllIIlIlI = super.release();
        if (lIllIIIIlIlIlll(lllllllllllllIlIlIlIIlIlllIIlIlI ? 1 : 0)) {
            this.leak.close();
            "".length();
            "".length();
            if (" ".length() < " ".length()) {
                return ((0xD2 ^ 0x85 ^ (0x5D ^ 0x41)) & (69 + 208 - 256 + 193 ^ 98 + 98 - 76 + 37 ^ -" ".length())) != 0x0;
            }
        }
        else {
            this.leak.record();
        }
        return lllllllllllllIlIlIlIIlIlllIIlIlI;
    }
    
    @Override
    public ByteBuf order(final ByteOrder lllllllllllllIlIlIlIIlIllIlllIll) {
        this.leak.record();
        if (lIllIIIIlIllIII(this.order(), lllllllllllllIlIlIlIIlIllIlllIll)) {
            return this;
        }
        return new AdvancedLeakAwareByteBuf(super.order(lllllllllllllIlIlIlIIlIllIlllIll), this.leak);
    }
    
    @Override
    public ByteBuf writeBoolean(final boolean lllllllllllllIlIlIlIIIlllIlIllll) {
        this.leak.record();
        return super.writeBoolean(lllllllllllllIlIlIlIIIlllIlIllll);
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlIlIIlIIlIIIlIll, final ByteBuf lllllllllllllIlIlIlIIlIIlIIIllIl) {
        this.leak.record();
        return super.setBytes(lllllllllllllIlIlIlIIlIIlIIIlIll, lllllllllllllIlIlIlIIlIIlIIIllIl);
    }
    
    @Override
    public char readChar() {
        this.leak.record();
        return super.readChar();
    }
    
    @Override
    public ByteBuf setInt(final int lllllllllllllIlIlIlIIlIIlIlllIII, final int lllllllllllllIlIlIlIIlIIlIlllIlI) {
        this.leak.record();
        return super.setInt(lllllllllllllIlIlIlIIlIIlIlllIII, lllllllllllllIlIlIlIIlIIlIlllIlI);
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIlIlIlIIIlIllIllllI, final int lllllllllllllIlIlIlIIIlIlllIIIII) {
        this.leak.record();
        return super.copy(lllllllllllllIlIlIlIIIlIllIllllI, lllllllllllllIlIlIlIIIlIlllIIIII);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf lllllllllllllIlIlIlIIIllllllIIlI, final int lllllllllllllIlIlIlIIIllllllIlII) {
        this.leak.record();
        return super.readBytes(lllllllllllllIlIlIlIIIllllllIIlI, lllllllllllllIlIlIlIIIllllllIlII);
    }
    
    @Override
    public ByteBuffer nioBuffer() {
        this.leak.record();
        return super.nioBuffer();
    }
    
    @Override
    public int getUnsignedMedium(final int lllllllllllllIlIlIlIIlIlIllIIlll) {
        this.leak.record();
        return super.getUnsignedMedium(lllllllllllllIlIlIlIIlIlIllIIlll);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlIlIIlIIllllIllI, final OutputStream lllllllllllllIlIlIlIIlIIllllIlIl, final int lllllllllllllIlIlIlIIlIIllllIlII) throws IOException {
        this.leak.record();
        return super.getBytes(lllllllllllllIlIlIlIIlIIllllIllI, lllllllllllllIlIlIlIIlIIllllIlIl, lllllllllllllIlIlIlIIlIIllllIlII);
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream lllllllllllllIlIlIlIIIllllIIIlIl, final int lllllllllllllIlIlIlIIIllllIIIlII) throws IOException {
        this.leak.record();
        return super.readBytes(lllllllllllllIlIlIlIIIllllIIIlIl, lllllllllllllIlIlIlIIIllllIIIlII);
    }
    
    @Override
    public ByteBuf duplicate() {
        this.leak.record();
        return new AdvancedLeakAwareByteBuf(super.duplicate(), this.leak);
    }
    
    @Override
    public int writeBytes(final ScatteringByteChannel lllllllllllllIlIlIlIIIllIIlllllI, final int lllllllllllllIlIlIlIIIllIIllllIl) throws IOException {
        this.leak.record();
        return super.writeBytes(lllllllllllllIlIlIlIIIllIIlllllI, lllllllllllllIlIlIlIIIllIIllllIl);
    }
    
    @Override
    public short readUnsignedByte() {
        this.leak.record();
        return super.readUnsignedByte();
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlIlIIlIlIIIllIII, final byte[] lllllllllllllIlIlIlIIlIlIIIlIlll) {
        this.leak.record();
        return super.getBytes(lllllllllllllIlIlIlIIlIlIIIllIII, lllllllllllllIlIlIlIIlIlIIIlIlll);
    }
    
    @Override
    public ByteBuf setBoolean(final int lllllllllllllIlIlIlIIlIIllIlllll, final boolean lllllllllllllIlIlIlIIlIIllIllIll) {
        this.leak.record();
        return super.setBoolean(lllllllllllllIlIlIlIIlIIllIlllll, lllllllllllllIlIlIlIIlIIllIllIll);
    }
    
    AdvancedLeakAwareByteBuf(final ByteBuf lllllllllllllIlIlIlIIlIlllIIllll, final ResourceLeak lllllllllllllIlIlIlIIlIlllIlIIIl) {
        super(lllllllllllllIlIlIlIIlIlllIIllll);
        this.leak = lllllllllllllIlIlIlIIlIlllIlIIIl;
    }
    
    @Override
    public long readUnsignedInt() {
        this.leak.record();
        return super.readUnsignedInt();
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlIlIIlIlIIIIlIII, final byte[] lllllllllllllIlIlIlIIlIlIIIIllII, final int lllllllllllllIlIlIlIIlIlIIIIlIll, final int lllllllllllllIlIlIlIIlIlIIIIlIlI) {
        this.leak.record();
        return super.getBytes(lllllllllllllIlIlIlIIlIlIIIIlIII, lllllllllllllIlIlIlIIlIlIIIIllII, lllllllllllllIlIlIlIIlIlIIIIlIll, lllllllllllllIlIlIlIIlIlIIIIlIlI);
    }
    
    @Override
    public int readInt() {
        this.leak.record();
        return super.readInt();
    }
    
    @Override
    public ByteBuf capacity(final int lllllllllllllIlIlIlIIIlIlIIllIII) {
        this.leak.record();
        return super.capacity(lllllllllllllIlIlIlIIIlIlIIllIII);
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIlIlIlIIIlIllIIIIll, final int lllllllllllllIlIlIlIIIlIllIIIlIl) {
        this.leak.record();
        return super.nioBuffers(lllllllllllllIlIlIlIIIlIllIIIIll, lllllllllllllIlIlIlIIIlIllIIIlIl);
    }
    
    private static boolean lIllIIIIlIlIlll(final int lllllllllllllIlIlIlIIIlIlIIIlIIl) {
        return lllllllllllllIlIlIlIIIlIlIIIlIIl != 0;
    }
    
    @Override
    public int forEachByte(final ByteBufProcessor lllllllllllllIlIlIlIIIllIIIIIlll) {
        this.leak.record();
        return super.forEachByte(lllllllllllllIlIlIlIIIllIIIIIlll);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlIlIIlIlIIlllIIl, final ByteBuf lllllllllllllIlIlIlIIlIlIIlllIII) {
        this.leak.record();
        return super.getBytes(lllllllllllllIlIlIlIIlIlIIlllIIl, lllllllllllllIlIlIlIIlIlIIlllIII);
    }
    
    @Override
    public int forEachByteDesc(final ByteBufProcessor lllllllllllllIlIlIlIIIlIllllIlIl) {
        this.leak.record();
        return super.forEachByteDesc(lllllllllllllIlIlIlIIIlIllllIlIl);
    }
    
    @Override
    public ByteBuf setZero(final int lllllllllllllIlIlIlIIlIIIIllIIIl, final int lllllllllllllIlIlIlIIlIIIIllIIII) {
        this.leak.record();
        return super.setZero(lllllllllllllIlIlIlIIlIIIIllIIIl, lllllllllllllIlIlIlIIlIIIIllIIII);
    }
    
    @Override
    public int writeBytes(final InputStream lllllllllllllIlIlIlIIIllIlIIIlll, final int lllllllllllllIlIlIlIIIllIlIIIIll) throws IOException {
        this.leak.record();
        return super.writeBytes(lllllllllllllIlIlIlIIIllIlIIIlll, lllllllllllllIlIlIlIIIllIlIIIIll);
    }
    
    @Override
    public ByteBuf setMedium(final int lllllllllllllIlIlIlIIlIIllIIIlII, final int lllllllllllllIlIlIlIIlIIllIIIIll) {
        this.leak.record();
        return super.setMedium(lllllllllllllIlIlIlIIlIIllIIIlII, lllllllllllllIlIlIlIIlIIllIIIIll);
    }
    
    @Override
    public int readBytes(final GatheringByteChannel lllllllllllllIlIlIlIIIlllIllllII, final int lllllllllllllIlIlIlIIIlllIlllllI) throws IOException {
        this.leak.record();
        return super.readBytes(lllllllllllllIlIlIlIIIlllIllllII, lllllllllllllIlIlIlIIIlllIlllllI);
    }
    
    @Override
    public long getUnsignedInt(final int lllllllllllllIlIlIlIIlIlIlIllIIl) {
        this.leak.record();
        return super.getUnsignedInt(lllllllllllllIlIlIlIIlIlIlIllIIl);
    }
    
    @Override
    public int forEachByteDesc(final int lllllllllllllIlIlIlIIIlIlllIlIll, final int lllllllllllllIlIlIlIIIlIlllIlllI, final ByteBufProcessor lllllllllllllIlIlIlIIIlIlllIllIl) {
        this.leak.record();
        return super.forEachByteDesc(lllllllllllllIlIlIlIIIlIlllIlIll, lllllllllllllIlIlIlIIIlIlllIlllI, lllllllllllllIlIlIlIIIlIlllIllIl);
    }
    
    @Override
    public boolean release(final int lllllllllllllIlIlIlIIlIlllIIIIll) {
        final boolean lllllllllllllIlIlIlIIlIlllIIIIlI = super.release(lllllllllllllIlIlIlIIlIlllIIIIll);
        if (lIllIIIIlIlIlll(lllllllllllllIlIlIlIIlIlllIIIIlI ? 1 : 0)) {
            this.leak.close();
            "".length();
            "".length();
            if (((66 + 14 - 45 + 142 ^ 169 + 136 - 275 + 159) & (123 + 132 - 93 + 44 ^ 82 + 87 - 32 + 57 ^ -" ".length())) != 0x0) {
                return ((9 + 76 + 41 + 48 ^ 98 + 131 - 144 + 79) & (0x2F ^ 0x1D ^ (0x24 ^ 0x1C) ^ -" ".length())) != 0x0;
            }
        }
        else {
            this.leak.record();
        }
        return lllllllllllllIlIlIlIIlIlllIIIIlI;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf lllllllllllllIlIlIlIIIlllllllIlI) {
        this.leak.record();
        return super.readBytes(lllllllllllllIlIlIlIIIlllllllIlI);
    }
    
    @Override
    public short readShort() {
        this.leak.record();
        return super.readShort();
    }
    
    @Override
    public int getUnsignedShort(final int lllllllllllllIlIlIlIIlIlIlllIIll) {
        this.leak.record();
        return super.getUnsignedShort(lllllllllllllIlIlIlIIlIlIlllIIll);
    }
    
    @Override
    public int nioBufferCount() {
        this.leak.record();
        return super.nioBufferCount();
    }
    
    @Override
    public ByteBuf writeInt(final int lllllllllllllIlIlIlIIIlllIIlIlll) {
        this.leak.record();
        return super.writeInt(lllllllllllllIlIlIlIIIlllIIlIlll);
    }
    
    @Override
    public int bytesBefore(final byte lllllllllllllIlIlIlIIIllIIlIIlII) {
        this.leak.record();
        return super.bytesBefore(lllllllllllllIlIlIlIIIllIIlIIlII);
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlIlIIlIIIlllIIlI, final ByteBuf lllllllllllllIlIlIlIIlIIIlllIllI, final int lllllllllllllIlIlIlIIlIIIlllIlIl, final int lllllllllllllIlIlIlIIlIIIlllIlII) {
        this.leak.record();
        return super.setBytes(lllllllllllllIlIlIlIIlIIIlllIIlI, lllllllllllllIlIlIlIIlIIIlllIllI, lllllllllllllIlIlIlIIlIIIlllIlIl, lllllllllllllIlIlIlIIlIIIlllIlII);
    }
    
    @Override
    public ByteBuf readBytes(final byte[] lllllllllllllIlIlIlIIIlllllIIIIl) {
        this.leak.record();
        return super.readBytes(lllllllllllllIlIlIlIIIlllllIIIIl);
    }
    
    @Override
    public short getShort(final int lllllllllllllIlIlIlIIlIlIllllIIl) {
        this.leak.record();
        return super.getShort(lllllllllllllIlIlIlIIlIlIllllIIl);
    }
    
    @Override
    public ByteBuf setByte(final int lllllllllllllIlIlIlIIlIIllIlIIll, final int lllllllllllllIlIlIlIIlIIllIlIIlI) {
        this.leak.record();
        return super.setByte(lllllllllllllIlIlIlIIlIIllIlIIll, lllllllllllllIlIlIlIIlIIllIlIIlI);
    }
    
    @Override
    public int setBytes(final int lllllllllllllIlIlIlIIlIIIIlllIII, final ScatteringByteChannel lllllllllllllIlIlIlIIlIIIIlllIll, final int lllllllllllllIlIlIlIIlIIIIlllIlI) throws IOException {
        this.leak.record();
        return super.setBytes(lllllllllllllIlIlIlIIlIIIIlllIII, lllllllllllllIlIlIlIIlIIIIlllIll, lllllllllllllIlIlIlIIlIIIIlllIlI);
    }
    
    @Override
    public ByteBuf readBytes(final int lllllllllllllIlIlIlIIlIIIIIIIIlI) {
        this.leak.record();
        return super.readBytes(lllllllllllllIlIlIlIIlIIIIIIIIlI);
    }
    
    @Override
    public ByteBuf setDouble(final int lllllllllllllIlIlIlIIlIIlIIlIlII, final double lllllllllllllIlIlIlIIlIIlIIlIIll) {
        this.leak.record();
        return super.setDouble(lllllllllllllIlIlIlIIlIIlIIlIlII, lllllllllllllIlIlIlIIlIIlIIlIIll);
    }
    
    @Override
    public char getChar(final int lllllllllllllIlIlIlIIlIlIlIIllIl) {
        this.leak.record();
        return super.getChar(lllllllllllllIlIlIlIIlIlIlIIllIl);
    }
}
