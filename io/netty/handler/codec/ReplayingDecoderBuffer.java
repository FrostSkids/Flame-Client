// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteOrder;
import io.netty.buffer.ByteBufAllocator;
import java.io.OutputStream;
import io.netty.util.ReferenceCounted;
import java.nio.channels.GatheringByteChannel;
import java.nio.charset.Charset;
import java.nio.channels.ScatteringByteChannel;
import io.netty.buffer.ByteBufProcessor;
import io.netty.buffer.Unpooled;
import java.io.InputStream;
import java.nio.ByteBuffer;
import io.netty.util.internal.StringUtil;
import io.netty.buffer.SwappedByteBuf;
import io.netty.util.Signal;
import io.netty.buffer.ByteBuf;

final class ReplayingDecoderBuffer extends ByteBuf
{
    private /* synthetic */ boolean terminated;
    private static final /* synthetic */ Signal REPLAY;
    private static final /* synthetic */ String[] llllIIIlIllll;
    private static final /* synthetic */ int[] llllIIIllIlIl;
    private /* synthetic */ ByteBuf buffer;
    private /* synthetic */ SwappedByteBuf swapped;
    
    @Override
    public ByteBuf setZero(final int lllllllllllllIlIlllIllIlIllllIll, final int lllllllllllllIlIlllIllIlIllllIlI) {
        reject();
        return this;
    }
    
    @Override
    public char getChar(final int lllllllllllllIlIlllIlllIlIllIIIl) {
        this.checkIndex(lllllllllllllIlIlllIlllIlIllIIIl, ReplayingDecoderBuffer.llllIIIllIlIl[6]);
        return this.buffer.getChar(lllllllllllllIlIlllIlllIlIllIIIl);
    }
    
    @Override
    public ByteBuf setMedium(final int lllllllllllllIlIlllIllIlIllIIIll, final int lllllllllllllIlIlllIllIlIllIIIlI) {
        reject();
        return this;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append((char)ReplayingDecoderBuffer.llllIIIllIlIl[8]).append(ReplayingDecoderBuffer.llllIIIlIllll[ReplayingDecoderBuffer.llllIIIllIlIl[0]]).append(this.readerIndex()).append(ReplayingDecoderBuffer.llllIIIlIllll[ReplayingDecoderBuffer.llllIIIllIlIl[6]]).append(ReplayingDecoderBuffer.llllIIIlIllll[ReplayingDecoderBuffer.llllIIIllIlIl[5]]).append(this.writerIndex()).append((char)ReplayingDecoderBuffer.llllIIIllIlIl[9]));
    }
    
    @Override
    public ByteBuf writeByte(final int lllllllllllllIlIlllIllIIlllllllI) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlllIlllIllllIIIl, final ByteBuf lllllllllllllIlIlllIlllIllllIIII, final int lllllllllllllIlIlllIlllIlllIllll) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlllIllIllIIIIlII, final ByteBuf lllllllllllllIlIlllIllIllIIIIIll) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf lllllllllllllIlIlllIllIlllllIIII) {
        this.checkReadableBytes(lllllllllllllIlIlllIllIlllllIIII.writableBytes());
        this.buffer.readBytes(lllllllllllllIlIlllIllIlllllIIII);
        "".length();
        return this;
    }
    
    @Override
    public byte readByte() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[0]);
        return this.buffer.readByte();
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuffer lllllllllllllIlIlllIllIIllllIIII) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlllIllllIIIlIlII, final byte[] lllllllllllllIlIlllIllllIIIlIIll, final int lllllllllllllIlIlllIllllIIIlIlll, final int lllllllllllllIlIlllIllllIIIlIIIl) {
        this.checkIndex(lllllllllllllIlIlllIllllIIIlIlII, lllllllllllllIlIlllIllllIIIlIIIl);
        this.buffer.getBytes(lllllllllllllIlIlllIllllIIIlIlII, lllllllllllllIlIlllIllllIIIlIIll, lllllllllllllIlIlllIllllIIIlIlll, lllllllllllllIlIlllIllllIIIlIIIl);
        "".length();
        return this;
    }
    
    @Override
    public int bytesBefore(final int lllllllllllllIlIlllIlllIIlllIlIl, final int lllllllllllllIlIlllIlllIIllllIlI, final byte lllllllllllllIlIlllIlllIIllllIIl) {
        final int lllllllllllllIlIlllIlllIIllllIII = this.buffer.writerIndex();
        if (lIlIIlllllllIII(lllllllllllllIlIlllIlllIIlllIlIl, lllllllllllllIlIlllIlllIIllllIII)) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
        if (lIlIIlllllllIIl(lllllllllllllIlIlllIlllIIlllIlIl, lllllllllllllIlIlllIlllIIllllIII - lllllllllllllIlIlllIlllIIllllIlI)) {
            return this.buffer.bytesBefore(lllllllllllllIlIlllIlllIIlllIlIl, lllllllllllllIlIlllIlllIIllllIlI, lllllllllllllIlIlllIlllIIllllIIl);
        }
        final int lllllllllllllIlIlllIlllIIlllIlll = this.buffer.bytesBefore(lllllllllllllIlIlllIlllIIlllIlIl, lllllllllllllIlIlllIlllIIllllIII - lllllllllllllIlIlllIlllIIlllIlIl, lllllllllllllIlIlllIlllIIllllIIl);
        if (lIlIIllllllIlll(lllllllllllllIlIlllIlllIIlllIlll)) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
        return lllllllllllllIlIlllIlllIIlllIlll;
    }
    
    @Override
    public ByteBuf setInt(final int lllllllllllllIlIlllIllIlIllIllIl, final int lllllllllllllIlIlllIllIlIllIllII) {
        reject();
        return this;
    }
    
    @Override
    public int writeBytes(final InputStream lllllllllllllIlIlllIllIIllIllllI, final int lllllllllllllIlIlllIllIIllIlllIl) {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public ByteBuf retain(final int lllllllllllllIlIlllIllIIlIIllIII) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlllIlllIllllllII, final ByteBuf lllllllllllllIlIlllIlllIllllIllI, final int lllllllllllllIlIlllIlllIllllIlIl, final int lllllllllllllIlIlllIlllIlllllIIl) {
        this.checkIndex(lllllllllllllIlIlllIlllIllllllII, lllllllllllllIlIlllIlllIlllllIIl);
        this.buffer.getBytes(lllllllllllllIlIlllIlllIllllllII, lllllllllllllIlIlllIlllIllllIllI, lllllllllllllIlIlllIlllIllllIlIl, lllllllllllllIlIlllIlllIlllllIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf slice(final int lllllllllllllIlIlllIllIlIIllllII, final int lllllllllllllIlIlllIllIlIIlllllI) {
        this.checkIndex(lllllllllllllIlIlllIllIlIIllllII, lllllllllllllIlIlllIllIlIIlllllI);
        return this.buffer.slice(lllllllllllllIlIlllIllIlIIllllII, lllllllllllllIlIlllIllIlIIlllllI);
    }
    
    static {
        lIlIIllllllIIlI();
        lIlIIlllllIIIIl();
        REPLAY = ReplayingDecoder.REPLAY;
        (EMPTY_BUFFER = new ReplayingDecoderBuffer(Unpooled.EMPTY_BUFFER)).terminate();
    }
    
    @Override
    public ByteBuf discardSomeReadBytes() {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlllIllllIIIIllII, final byte[] lllllllllllllIlIlllIllllIIIIlIll) {
        this.checkIndex(lllllllllllllIlIlllIllllIIIIllII, lllllllllllllIlIlllIllllIIIIlIll.length);
        this.buffer.getBytes(lllllllllllllIlIlllIllllIIIIllII, lllllllllllllIlIlllIllllIIIIlIll);
        "".length();
        return this;
    }
    
    void terminate() {
        this.terminated = (ReplayingDecoderBuffer.llllIIIllIlIl[0] != 0);
    }
    
    @Override
    public ByteBuf readBytes(final byte[] lllllllllllllIlIlllIlllIIIIIllIl) {
        this.checkReadableBytes(lllllllllllllIlIlllIlllIIIIIllIl.length);
        this.buffer.readBytes(lllllllllllllIlIlllIlllIIIIIllIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf copy() {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf writeDouble(final double lllllllllllllIlIlllIllIIlIllIlII) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIlIlllIllIlIIlIlIII, final int lllllllllllllIlIlllIllIlIIlIIlII) {
        this.checkIndex(lllllllllllllIlIlllIllIlIIlIlIII, lllllllllllllIlIlllIllIlIIlIIlII);
        return this.buffer.nioBuffers(lllllllllllllIlIlllIllIlIIlIlIII, lllllllllllllIlIlllIllIlIIlIIlII);
    }
    
    @Override
    public int setBytes(final int lllllllllllllIlIlllIllIllIIIIIII, final InputStream lllllllllllllIlIlllIllIlIlllllll, final int lllllllllllllIlIlllIllIlIllllllI) {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public int forEachByte(final ByteBufProcessor lllllllllllllIlIlllIlllIIllIlIIl) {
        final int lllllllllllllIlIlllIlllIIllIlIll = this.buffer.forEachByte(lllllllllllllIlIlllIlllIIllIlIIl);
        if (lIlIIllllllIlll(lllllllllllllIlIlllIlllIIllIlIll)) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
        return lllllllllllllIlIlllIlllIIllIlIll;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf lllllllllllllIlIlllIlllIIIIIIIIl, final int lllllllllllllIlIlllIllIlllllllII, final int lllllllllllllIlIlllIllIllllllIll) {
        this.checkReadableBytes(lllllllllllllIlIlllIllIllllllIll);
        this.buffer.readBytes(lllllllllllllIlIlllIlllIIIIIIIIl, lllllllllllllIlIlllIllIlllllllII, lllllllllllllIlIlllIllIllllllIll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf clear() {
        reject();
        return this;
    }
    
    @Override
    public long getUnsignedInt(final int lllllllllllllIlIlllIlllIllIlIlIl) {
        this.checkIndex(lllllllllllllIlIlllIlllIllIlIlIl, ReplayingDecoderBuffer.llllIIIllIlIl[3]);
        return this.buffer.getUnsignedInt(lllllllllllllIlIlllIlllIllIlIlIl);
    }
    
    @Override
    public int writeBytes(final ScatteringByteChannel lllllllllllllIlIlllIllIIllIllIll, final int lllllllllllllIlIlllIllIIllIllIlI) {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public ByteBuf setChar(final int lllllllllllllIlIlllIllIlIlIllIIl, final int lllllllllllllIlIlllIllIlIlIllIII) {
        reject();
        return this;
    }
    
    @Override
    public byte[] array() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public ByteBuf readerIndex(final int lllllllllllllIlIlllIllIlllIlIIll) {
        this.buffer.readerIndex(lllllllllllllIlIlllIllIlllIlIIll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeShort(final int lllllllllllllIlIlllIllIIllIIIIII) {
        reject();
        return this;
    }
    
    @Override
    public int forEachByte(final int lllllllllllllIlIlllIlllIIlIllIlI, final int lllllllllllllIlIlllIlllIIlIllIIl, final ByteBufProcessor lllllllllllllIlIlllIlllIIlIllIII) {
        final int lllllllllllllIlIlllIlllIIlIlllIl = this.buffer.writerIndex();
        if (lIlIIlllllllIII(lllllllllllllIlIlllIlllIIlIllIlI, lllllllllllllIlIlllIlllIIlIlllIl)) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
        if (lIlIIlllllllIIl(lllllllllllllIlIlllIlllIIlIllIlI, lllllllllllllIlIlllIlllIIlIlllIl - lllllllllllllIlIlllIlllIIlIllIIl)) {
            return this.buffer.forEachByte(lllllllllllllIlIlllIlllIIlIllIlI, lllllllllllllIlIlllIlllIIlIllIIl, lllllllllllllIlIlllIlllIIlIllIII);
        }
        final int lllllllllllllIlIlllIlllIIlIlllII = this.buffer.forEachByte(lllllllllllllIlIlllIlllIIlIllIlI, lllllllllllllIlIlllIlllIIlIlllIl - lllllllllllllIlIlllIlllIIlIllIlI, lllllllllllllIlIlllIlllIIlIllIII);
        if (lIlIIllllllIlll(lllllllllllllIlIlllIlllIIlIlllII)) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
        return lllllllllllllIlIlllIlllIIlIlllII;
    }
    
    @Override
    public boolean release() {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2] != 0;
    }
    
    @Override
    public int getUnsignedShort(final int lllllllllllllIlIlllIlllIlIllIlll) {
        this.checkIndex(lllllllllllllIlIlllIlllIlIllIlll, ReplayingDecoderBuffer.llllIIIllIlIl[6]);
        return this.buffer.getUnsignedShort(lllllllllllllIlIlllIlllIlIllIlll);
    }
    
    @Override
    public int readableBytes() {
        if (lIlIIllllllIIll(this.terminated ? 1 : 0)) {
            return this.buffer.readableBytes();
        }
        return ReplayingDecoderBuffer.llllIIIllIlIl[1] - this.buffer.readerIndex();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlllIllIllIIlIIIl, final ByteBuf lllllllllllllIlIlllIllIllIIlIIII, final int lllllllllllllIlIlllIllIllIIIllll, final int lllllllllllllIlIlllIllIllIIIlllI) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf lllllllllllllIlIlllIllIIlllIIllI, final int lllllllllllllIlIlllIllIIlllIIlIl) {
        reject();
        return this;
    }
    
    private static boolean lIlIIllllllIlIl(final int lllllllllllllIlIlllIllIIIlIIllIl, final int lllllllllllllIlIlllIllIIIlIIllII) {
        return lllllllllllllIlIlllIllIIIlIIllIl == lllllllllllllIlIlllIllIIIlIIllII;
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] lllllllllllllIlIlllIllIIlllllIlI, final int lllllllllllllIlIlllIllIIlllllIIl, final int lllllllllllllIlIlllIllIIlllllIII) {
        reject();
        return this;
    }
    
    @Override
    public String toString(final int lllllllllllllIlIlllIllIlIIIlIIIl, final int lllllllllllllIlIlllIllIlIIIlIIII, final Charset lllllllllllllIlIlllIllIlIIIlIIll) {
        this.checkIndex(lllllllllllllIlIlllIllIlIIIlIIIl, lllllllllllllIlIlllIllIlIIIlIIII);
        return this.buffer.toString(lllllllllllllIlIlllIllIlIIIlIIIl, lllllllllllllIlIlllIllIlIIIlIIII, lllllllllllllIlIlllIllIlIIIlIIll);
    }
    
    @Override
    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public byte getByte(final int lllllllllllllIlIlllIllllIIlIlIII) {
        this.checkIndex(lllllllllllllIlIlllIllllIIlIlIII, ReplayingDecoderBuffer.llllIIIllIlIl[0]);
        return this.buffer.getByte(lllllllllllllIlIlllIllllIIlIlIII);
    }
    
    @Override
    public ByteBuf markWriterIndex() {
        reject();
        return this;
    }
    
    private static void lIlIIllllllIIlI() {
        (llllIIIllIlIl = new int[11])[0] = " ".length();
        ReplayingDecoderBuffer.llllIIIllIlIl[1] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        ReplayingDecoderBuffer.llllIIIllIlIl[2] = ((0xB5 ^ 0xA8) & ~(0x65 ^ 0x78));
        ReplayingDecoderBuffer.llllIIIllIlIl[3] = (24 + 98 - 67 + 76 ^ 53 + 63 - 20 + 39);
        ReplayingDecoderBuffer.llllIIIllIlIl[4] = (0xFF ^ 0xBF ^ (0x35 ^ 0x7D));
        ReplayingDecoderBuffer.llllIIIllIlIl[5] = "   ".length();
        ReplayingDecoderBuffer.llllIIIllIlIl[6] = "  ".length();
        ReplayingDecoderBuffer.llllIIIllIlIl[7] = -" ".length();
        ReplayingDecoderBuffer.llllIIIllIlIl[8] = (0x2D ^ 0x5);
        ReplayingDecoderBuffer.llllIIIllIlIl[9] = (0xA0 ^ 0x89);
        ReplayingDecoderBuffer.llllIIIllIlIl[10] = (0x4E ^ 0x4B);
    }
    
    @Override
    public ByteBuf markReaderIndex() {
        this.buffer.markReaderIndex();
        "".length();
        return this;
    }
    
    @Override
    public int hashCode() {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public ByteBuf unwrap() {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf setDouble(final int lllllllllllllIlIlllIllIlIlIIllll, final double lllllllllllllIlIlllIllIlIlIIlllI) {
        reject();
        return this;
    }
    
    @Override
    public char readChar() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[6]);
        return this.buffer.readChar();
    }
    
    @Override
    public boolean isReadable() {
        int readable;
        if (lIlIIllllllIIll(this.terminated ? 1 : 0)) {
            readable = (this.buffer.isReadable() ? 1 : 0);
            "".length();
            if ((0xBF ^ 0xBB) <= -" ".length()) {
                return ((0x54 ^ 0x6) & ~(0xF0 ^ 0xA2)) != 0x0;
            }
        }
        else {
            readable = ReplayingDecoderBuffer.llllIIIllIlIl[0];
        }
        return readable != 0;
    }
    
    @Override
    public ByteBuf writeLong(final long lllllllllllllIlIlllIllIIllIlIIll) {
        reject();
        return this;
    }
    
    @Override
    public boolean isWritable(final int lllllllllllllIlIlllIllIlIIIIIlll) {
        return ReplayingDecoderBuffer.llllIIIllIlIl[2] != 0;
    }
    
    @Override
    public int getBytes(final int lllllllllllllIlIlllIlllIlllIIlll, final GatheringByteChannel lllllllllllllIlIlllIlllIlllIIllI, final int lllllllllllllIlIlllIlllIlllIIlIl) {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public int capacity() {
        if (lIlIIllllllIIll(this.terminated ? 1 : 0)) {
            return this.buffer.capacity();
        }
        return ReplayingDecoderBuffer.llllIIIllIlIl[1];
    }
    
    @Override
    public ByteBuf resetWriterIndex() {
        reject();
        return this;
    }
    
    ReplayingDecoderBuffer() {
    }
    
    void setCumulation(final ByteBuf lllllllllllllIlIlllIllllIllIlllI) {
        this.buffer = lllllllllllllIlIlllIllllIllIlllI;
    }
    
    @Override
    public ByteBuf setFloat(final int lllllllllllllIlIlllIllIlIlIlIlII, final float lllllllllllllIlIlllIllIlIlIlIIll) {
        reject();
        return this;
    }
    
    @Override
    public int getMedium(final int lllllllllllllIlIlllIlllIllIIlIIl) {
        this.checkIndex(lllllllllllllIlIlllIlllIllIIlIIl, ReplayingDecoderBuffer.llllIIIllIlIl[5]);
        return this.buffer.getMedium(lllllllllllllIlIlllIlllIllIIlIIl);
    }
    
    @Override
    public boolean release(final int lllllllllllllIlIlllIllIIlIIlIlII) {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2] != 0;
    }
    
    @Override
    public int getUnsignedMedium(final int lllllllllllllIlIlllIlllIllIIIIIl) {
        this.checkIndex(lllllllllllllIlIlllIlllIllIIIIIl, ReplayingDecoderBuffer.llllIIIllIlIl[5]);
        return this.buffer.getUnsignedMedium(lllllllllllllIlIlllIlllIllIIIIIl);
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlllIllIllIIIlIlI, final ByteBuf lllllllllllllIlIlllIllIllIIIlIIl, final int lllllllllllllIlIlllIllIllIIIlIII) {
        reject();
        return this;
    }
    
    @Override
    public boolean isWritable() {
        return ReplayingDecoderBuffer.llllIIIllIlIl[2] != 0;
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] lllllllllllllIlIlllIllIIllllIlII) {
        reject();
        return this;
    }
    
    @Override
    public int readMedium() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[5]);
        return this.buffer.readMedium();
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf lllllllllllllIlIlllIllIllllllIII, final int lllllllllllllIlIlllIllIlllllIlll) {
        reject();
        return this;
    }
    
    @Override
    public boolean hasArray() {
        return ReplayingDecoderBuffer.llllIIIllIlIl[2] != 0;
    }
    
    @Override
    public long getLong(final int lllllllllllllIlIlllIlllIllIIllll) {
        this.checkIndex(lllllllllllllIlIlllIlllIllIIllll, ReplayingDecoderBuffer.llllIIIllIlIl[4]);
        return this.buffer.getLong(lllllllllllllIlIlllIlllIllIIllll);
    }
    
    private static void lIlIIlllllIIIIl() {
        (llllIIIlIllll = new String[ReplayingDecoderBuffer.llllIIIllIlIl[10]])[ReplayingDecoderBuffer.llllIIIllIlIl[2]] = lIlIIllllIllIlI("FQo+IQkeCj87Gw==", "pdZHh");
        ReplayingDecoderBuffer.llllIIIlIllll[ReplayingDecoderBuffer.llllIIIllIlIl[0]] = lIlIIllllIllIll("8y1U+IDi3V8=", "VpwTz");
        ReplayingDecoderBuffer.llllIIIlIllll[ReplayingDecoderBuffer.llllIIIllIlIl[6]] = lIlIIllllIllIlI("Vkw=", "zlqLK");
        ReplayingDecoderBuffer.llllIIIlIllll[ReplayingDecoderBuffer.llllIIIllIlIl[5]] = lIlIIllllIllIlI("HD8rGnc=", "kVObJ");
        ReplayingDecoderBuffer.llllIIIlIllll[ReplayingDecoderBuffer.llllIIIllIlIl[3]] = lIlIIlllllIIIII("L/4ciuPgeGKR+dki9XlsrrnCFOC9N+pHt8nYvBka890=", "bvnWA");
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIlIlllIllllIlIIIIll, final int lllllllllllllIlIlllIllllIlIIIIlI) {
        this.checkIndex(lllllllllllllIlIlllIllllIlIIIIll, lllllllllllllIlIlllIllllIlIIIIlI);
        return this.buffer.copy(lllllllllllllIlIlllIllllIlIIIIll, lllllllllllllIlIlllIllllIlIIIIlI);
    }
    
    @Override
    public float getFloat(final int lllllllllllllIlIlllIlllIlIlIlIll) {
        this.checkIndex(lllllllllllllIlIlllIlllIlIlIlIll, ReplayingDecoderBuffer.llllIIIllIlIl[3]);
        return this.buffer.getFloat(lllllllllllllIlIlllIlllIlIlIlIll);
    }
    
    @Override
    public float readFloat() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[3]);
        return this.buffer.readFloat();
    }
    
    @Override
    public ByteBuf setIndex(final int lllllllllllllIlIlllIllIlIlllIIlI, final int lllllllllllllIlIlllIllIlIlllIIIl) {
        reject();
        return this;
    }
    
    @Override
    public int bytesBefore(final byte lllllllllllllIlIlllIlllIlIIlIIIl) {
        final int lllllllllllllIlIlllIlllIlIIlIIII = this.buffer.bytesBefore(lllllllllllllIlIlllIlllIlIIlIIIl);
        if (lIlIIllllllIlll(lllllllllllllIlIlllIlllIlIIlIIII)) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
        return lllllllllllllIlIlllIlllIlIIlIIII;
    }
    
    private static boolean lIlIIllllllIllI(final int lllllllllllllIlIlllIllIIIIllllIl, final int lllllllllllllIlIlllIllIIIIllllII) {
        return lllllllllllllIlIlllIllIIIIllllIl > lllllllllllllIlIlllIllIIIIllllII;
    }
    
    @Override
    public ByteBuf setLong(final int lllllllllllllIlIlllIllIlIllIlIII, final long lllllllllllllIlIlllIllIlIllIIlll) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final byte[] lllllllllllllIlIlllIlllIIIIlIlll, final int lllllllllllllIlIlllIlllIIIIlIllI, final int lllllllllllllIlIlllIlllIIIIlIIIl) {
        this.checkReadableBytes(lllllllllllllIlIlllIlllIIIIlIIIl);
        this.buffer.readBytes(lllllllllllllIlIlllIlllIIIIlIlll, lllllllllllllIlIlllIlllIIIIlIllI, lllllllllllllIlIlllIlllIIIIlIIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuffer nioBuffer(final int lllllllllllllIlIlllIllIlIIlIllll, final int lllllllllllllIlIlllIllIlIIllIIIl) {
        this.checkIndex(lllllllllllllIlIlllIllIlIIlIllll, lllllllllllllIlIlllIllIlIIllIIIl);
        return this.buffer.nioBuffer(lllllllllllllIlIlllIllIlIIlIllll, lllllllllllllIlIlllIllIlIIllIIIl);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlllIlllIlllIIIlI, final OutputStream lllllllllllllIlIlllIlllIlllIIIIl, final int lllllllllllllIlIlllIlllIlllIIIII) {
        reject();
        return this;
    }
    
    @Override
    public String toString(final Charset lllllllllllllIlIlllIllIlIIIIllIl) {
        reject();
        return null;
    }
    
    @Override
    public ByteBuf ensureWritable(final int lllllllllllllIlIlllIllllIIlllIIl) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf slice() {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf writerIndex(final int lllllllllllllIlIlllIllIIllIIIlII) {
        reject();
        return this;
    }
    
    private static void reject() {
        throw new UnsupportedOperationException(ReplayingDecoderBuffer.llllIIIlIllll[ReplayingDecoderBuffer.llllIIIllIlIl[3]]);
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream lllllllllllllIlIlllIllIlllIllllI, final int lllllllllllllIlIlllIllIlllIlllIl) {
        reject();
        return this;
    }
    
    private static boolean lIlIIlllllllIII(final int lllllllllllllIlIlllIllIIIlIIlIIl, final int lllllllllllllIlIlllIllIIIlIIlIII) {
        return lllllllllllllIlIlllIllIIIlIIlIIl >= lllllllllllllIlIlllIllIIIlIIlIII;
    }
    
    @Override
    public ByteBuf writeChar(final int lllllllllllllIlIlllIllIIlIllllII) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlllIllIllIIlIllI, final ByteBuffer lllllllllllllIlIlllIllIllIIlIlIl) {
        reject();
        return this;
    }
    
    private static boolean lIlIIlllllllIll(final int lllllllllllllIlIlllIllIIIlIIIlIl, final int lllllllllllllIlIlllIllIIIlIIIlII) {
        return lllllllllllllIlIlllIllIIIlIIIlIl < lllllllllllllIlIlllIllIIIlIIIlII;
    }
    
    @Override
    public ByteBuf capacity(final int lllllllllllllIlIlllIllllIllIIlIl) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf writeBoolean(final boolean lllllllllllllIlIlllIllIlIIIIIIlI) {
        reject();
        return this;
    }
    
    @Override
    public int arrayOffset() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public int readerIndex() {
        return this.buffer.readerIndex();
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf lllllllllllllIlIlllIllIIlllIllII, final int lllllllllllllIlIlllIllIIlllIlIll, final int lllllllllllllIlIlllIllIIlllIlIlI) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuffer nioBuffer() {
        reject();
        return null;
    }
    
    @Override
    public ByteBuffer[] nioBuffers() {
        reject();
        return null;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlllIlllIlllIlIll, final ByteBuf lllllllllllllIlIlllIlllIlllIlIlI) {
        reject();
        return this;
    }
    
    @Override
    public int readUnsignedMedium() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[5]);
        return this.buffer.readUnsignedMedium();
    }
    
    @Override
    public int refCnt() {
        return this.buffer.refCnt();
    }
    
    @Override
    public int bytesBefore(final int lllllllllllllIlIlllIlllIlIIIlIII, final byte lllllllllllllIlIlllIlllIlIIIIlll) {
        final int lllllllllllllIlIlllIlllIlIIIIllI = this.buffer.readerIndex();
        return this.bytesBefore(lllllllllllllIlIlllIlllIlIIIIllI, this.buffer.writerIndex() - lllllllllllllIlIlllIlllIlIIIIllI, lllllllllllllIlIlllIlllIlIIIIlll);
    }
    
    @Override
    public ByteBuf writeFloat(final float lllllllllllllIlIlllIllIIlIlllIII) {
        reject();
        return this;
    }
    
    private static boolean lIlIIllllllIlll(final int lllllllllllllIlIlllIllIIIIllIIlI) {
        return lllllllllllllIlIlllIllIIIIllIIlI < 0;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIlllIllllIIIIIlIl, final ByteBuffer lllllllllllllIlIlllIllllIIIIIlII) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf writeMedium(final int lllllllllllllIlIlllIllIIllIIllll) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf resetReaderIndex() {
        this.buffer.resetReaderIndex();
        "".length();
        return this;
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return ReplayingDecoderBuffer.llllIIIllIlIl[2] != 0;
    }
    
    ReplayingDecoderBuffer(final ByteBuf lllllllllllllIlIlllIllllIllllIlI) {
        this.setCumulation(lllllllllllllIlIlllIllllIllllIlI);
    }
    
    @Override
    public short readUnsignedByte() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[0]);
        return this.buffer.readUnsignedByte();
    }
    
    @Override
    public short readShort() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[6]);
        return this.buffer.readShort();
    }
    
    @Override
    public int indexOf(final int lllllllllllllIlIlllIlllIlIIllIII, final int lllllllllllllIlIlllIlllIlIIlIlll, final byte lllllllllllllIlIlllIlllIlIIllIlI) {
        if (lIlIIllllllIlIl(lllllllllllllIlIlllIlllIlIIllIII, lllllllllllllIlIlllIlllIlIIlIlll)) {
            return ReplayingDecoderBuffer.llllIIIllIlIl[7];
        }
        if (lIlIIllllllIllI(Math.max(lllllllllllllIlIlllIlllIlIIllIII, lllllllllllllIlIlllIlllIlIIlIlll), this.buffer.writerIndex())) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
        return this.buffer.indexOf(lllllllllllllIlIlllIlllIlIIllIII, lllllllllllllIlIlllIlllIlIIlIlll, lllllllllllllIlIlllIlllIlIIllIlI);
    }
    
    @Override
    public boolean getBoolean(final int lllllllllllllIlIlllIllllIIlIllII) {
        this.checkIndex(lllllllllllllIlIlllIllllIIlIllII, ReplayingDecoderBuffer.llllIIIllIlIl[0]);
        return this.buffer.getBoolean(lllllllllllllIlIlllIllllIIlIllII);
    }
    
    @Override
    public int nioBufferCount() {
        return this.buffer.nioBufferCount();
    }
    
    @Override
    public int readBytes(final GatheringByteChannel lllllllllllllIlIlllIllIllllIlllI, final int lllllllllllllIlIlllIllIllllIllIl) {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public boolean readBoolean() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[0]);
        return this.buffer.readBoolean();
    }
    
    @Override
    public boolean isDirect() {
        return this.buffer.isDirect();
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.buffer.alloc();
    }
    
    @Override
    public ByteBuf readSlice(final int lllllllllllllIlIlllIllIllllIIIll) {
        this.checkReadableBytes(lllllllllllllIlIlllIllIllllIIIll);
        return this.buffer.readSlice(lllllllllllllIlIlllIllIllllIIIll);
    }
    
    @Override
    public double getDouble(final int lllllllllllllIlIlllIlllIlIlIIIll) {
        this.checkIndex(lllllllllllllIlIlllIlllIlIlIIIll, ReplayingDecoderBuffer.llllIIIllIlIl[4]);
        return this.buffer.getDouble(lllllllllllllIlIlllIlllIlIlIIIll);
    }
    
    @Override
    public int compareTo(final ByteBuf lllllllllllllIlIlllIllllIlIIlIll) {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public ByteOrder order() {
        return this.buffer.order();
    }
    
    @Override
    public boolean isReadable(final int lllllllllllllIlIlllIlllIIIlIlIll) {
        int readable;
        if (lIlIIllllllIIll(this.terminated ? 1 : 0)) {
            readable = (this.buffer.isReadable(lllllllllllllIlIlllIlllIIIlIlIll) ? 1 : 0);
            "".length();
            if (-" ".length() >= 0) {
                return ((0x2F ^ 0x7) & ~(0xB4 ^ 0x9C)) != 0x0;
            }
        }
        else {
            readable = ReplayingDecoderBuffer.llllIIIllIlIl[0];
        }
        return readable != 0;
    }
    
    @Override
    public int maxWritableBytes() {
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    private static boolean lIlIIllllllIIll(final int lllllllllllllIlIlllIllIIIIllIlII) {
        return lllllllllllllIlIlllIllIIIIllIlII != 0;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIlllIllllIlIIllIl) {
        int n;
        if (lIlIIllllllIlII(this, lllllllllllllIlIlllIllllIlIIllIl)) {
            n = ReplayingDecoderBuffer.llllIIIllIlIl[0];
            "".length();
            if (null != null) {
                return ((117 + 143 - 154 + 82 ^ 115 + 108 - 217 + 180) & (0x51 ^ 0x3C ^ (0x30 ^ 0x5B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ReplayingDecoderBuffer.llllIIIllIlIl[2];
        }
        return n != 0;
    }
    
    @Override
    public int forEachByteDesc(final ByteBufProcessor lllllllllllllIlIlllIlllIIlIlIIII) {
        if (lIlIIllllllIIll(this.terminated ? 1 : 0)) {
            return this.buffer.forEachByteDesc(lllllllllllllIlIlllIlllIIlIlIIII);
        }
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public long readLong() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[4]);
        return this.buffer.readLong();
    }
    
    @Override
    public int ensureWritable(final int lllllllllllllIlIlllIllllIIllIllI, final boolean lllllllllllllIlIlllIllllIIllIlIl) {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public ByteBuf writeInt(final int lllllllllllllIlIlllIllIIllIlIlll) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf skipBytes(final int lllllllllllllIlIlllIllIlIlIIIlll) {
        this.checkReadableBytes(lllllllllllllIlIlllIllIlIlIIIlll);
        this.buffer.skipBytes(lllllllllllllIlIlllIllIlIlIIIlll);
        "".length();
        return this;
    }
    
    @Override
    public int writerIndex() {
        return this.buffer.writerIndex();
    }
    
    @Override
    public int readInt() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[3]);
        return this.buffer.readInt();
    }
    
    @Override
    public ByteBuf setBoolean(final int lllllllllllllIlIlllIllIllIlIllII, final boolean lllllllllllllIlIlllIllIllIlIlIll) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlllIllIllIlIIIlI, final byte[] lllllllllllllIlIlllIllIllIlIIIIl, final int lllllllllllllIlIlllIllIllIlIIIII, final int lllllllllllllIlIlllIllIllIIlllll) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIlllIllIllIIllIll, final byte[] lllllllllllllIlIlllIllIllIIllIlI) {
        reject();
        return this;
    }
    
    private static boolean lIlIIllllllIlII(final Object lllllllllllllIlIlllIllIIIIlllIIl, final Object lllllllllllllIlIlllIllIIIIlllIII) {
        return lllllllllllllIlIlllIllIIIIlllIIl == lllllllllllllIlIlllIllIIIIlllIII;
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIlIlllIllIlIIIlllII, final int lllllllllllllIlIlllIllIlIIIllllI) {
        this.checkIndex(lllllllllllllIlIlllIllIlIIIlllII, lllllllllllllIlIlllIllIlIIIllllI);
        return this.buffer.internalNioBuffer(lllllllllllllIlIlllIllIlIIIlllII, lllllllllllllIlIlllIllIlIIIllllI);
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        reject();
        return this;
    }
    
    private void checkReadableBytes(final int lllllllllllllIlIlllIllIIlIlIIllI) {
        if (lIlIIlllllllIll(this.buffer.readableBytes(), lllllllllllllIlIlllIllIIlIlIIllI)) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
    }
    
    @Override
    public short getShort(final int lllllllllllllIlIlllIlllIlIlllIll) {
        this.checkIndex(lllllllllllllIlIlllIlllIlIlllIll, ReplayingDecoderBuffer.llllIIIllIlIl[6]);
        return this.buffer.getShort(lllllllllllllIlIlllIlllIlIlllIll);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer lllllllllllllIlIlllIlllIIIIIlIII) {
        reject();
        return this;
    }
    
    @Override
    public double readDouble() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[4]);
        return this.buffer.readDouble();
    }
    
    private static String lIlIIllllIllIll(final String lllllllllllllIlIlllIllIIIllIIIlI, final String lllllllllllllIlIlllIllIIIlIlllll) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIllIIIllIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIllIIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIllIIIllIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIllIIIllIIlII.init(ReplayingDecoderBuffer.llllIIIllIlIl[6], lllllllllllllIlIlllIllIIIllIIlIl);
            return new String(lllllllllllllIlIlllIllIIIllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIllIIIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIllIIIllIIIll) {
            lllllllllllllIlIlllIllIIIllIIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf setByte(final int lllllllllllllIlIlllIllIllIlIIlll, final int lllllllllllllIlIlllIllIllIlIIllI) {
        reject();
        return this;
    }
    
    @Override
    public int forEachByteDesc(final int lllllllllllllIlIlllIlllIIlIIIllI, final int lllllllllllllIlIlllIlllIIlIIlIIl, final ByteBufProcessor lllllllllllllIlIlllIlllIIlIIlIII) {
        if (lIlIIllllllIllI(lllllllllllllIlIlllIlllIIlIIIllI + lllllllllllllIlIlllIlllIIlIIlIIl, this.buffer.writerIndex())) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
        return this.buffer.forEachByteDesc(lllllllllllllIlIlllIlllIIlIIIllI, lllllllllllllIlIlllIlllIIlIIlIIl, lllllllllllllIlIlllIlllIIlIIlIII);
    }
    
    @Override
    public ByteBuf duplicate() {
        reject();
        return this;
    }
    
    @Override
    public int maxCapacity() {
        return this.capacity();
    }
    
    @Override
    public ByteBuf readBytes(final int lllllllllllllIlIlllIllIllllIlIIl) {
        this.checkReadableBytes(lllllllllllllIlIlllIllIllllIlIIl);
        return this.buffer.readBytes(lllllllllllllIlIlllIllIllllIlIIl);
    }
    
    private static boolean lIlIIlllllllIlI(final Object lllllllllllllIlIlllIllIIIIllIllI) {
        return lllllllllllllIlIlllIllIIIIllIllI == null;
    }
    
    @Override
    public int setBytes(final int lllllllllllllIlIlllIllIlIlllIlll, final ScatteringByteChannel lllllllllllllIlIlllIllIlIlllIllI, final int lllllllllllllIlIlllIllIlIlllIlIl) {
        reject();
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf lllllllllllllIlIlllIllIIlllIIIIl) {
        reject();
        return this;
    }
    
    private static boolean lIlIIlllllllIIl(final int lllllllllllllIlIlllIllIIIlIIIIIl, final int lllllllllllllIlIlllIllIIIlIIIIII) {
        return lllllllllllllIlIlllIllIIIlIIIIIl <= lllllllllllllIlIlllIllIIIlIIIIII;
    }
    
    @Override
    public ByteBuf setShort(final int lllllllllllllIlIlllIllIlIlIllllI, final int lllllllllllllIlIlllIllIlIlIlllIl) {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf retain() {
        reject();
        return this;
    }
    
    @Override
    public ByteBuf writeZero(final int lllllllllllllIlIlllIllIIllIIlIll) {
        reject();
        return this;
    }
    
    private static String lIlIIllllIllIlI(String lllllllllllllIlIlllIllIIIlllIlll, final String lllllllllllllIlIlllIllIIIlllIllI) {
        lllllllllllllIlIlllIllIIIlllIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIlllIllIIIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIllIIIlllIlIl = new StringBuilder();
        final char[] lllllllllllllIlIlllIllIIIlllIlII = lllllllllllllIlIlllIllIIIlllIllI.toCharArray();
        int lllllllllllllIlIlllIllIIIlllIIll = ReplayingDecoderBuffer.llllIIIllIlIl[2];
        final short lllllllllllllIlIlllIllIIIllIllIl = (Object)lllllllllllllIlIlllIllIIIlllIlll.toCharArray();
        final boolean lllllllllllllIlIlllIllIIIllIllII = lllllllllllllIlIlllIllIIIllIllIl.length != 0;
        byte lllllllllllllIlIlllIllIIIllIlIll = (byte)ReplayingDecoderBuffer.llllIIIllIlIl[2];
        while (lIlIIlllllllIll(lllllllllllllIlIlllIllIIIllIlIll, lllllllllllllIlIlllIllIIIllIllII ? 1 : 0)) {
            final char lllllllllllllIlIlllIllIIIllllIII = lllllllllllllIlIlllIllIIIllIllIl[lllllllllllllIlIlllIllIIIllIlIll];
            lllllllllllllIlIlllIllIIIlllIlIl.append((char)(lllllllllllllIlIlllIllIIIllllIII ^ lllllllllllllIlIlllIllIIIlllIlII[lllllllllllllIlIlllIllIIIlllIIll % lllllllllllllIlIlllIllIIIlllIlII.length]));
            "".length();
            ++lllllllllllllIlIlllIllIIIlllIIll;
            ++lllllllllllllIlIlllIllIIIllIlIll;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIllIIIlllIlIl);
    }
    
    private static String lIlIIlllllIIIII(final String lllllllllllllIlIlllIllIIIlIlIIll, final String lllllllllllllIlIlllIllIIIlIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIllIIIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIllIIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), ReplayingDecoderBuffer.llllIIIllIlIl[4]), "DES");
            final Cipher lllllllllllllIlIlllIllIIIlIlIlll = Cipher.getInstance("DES");
            lllllllllllllIlIlllIllIIIlIlIlll.init(ReplayingDecoderBuffer.llllIIIllIlIl[6], lllllllllllllIlIlllIllIIIlIllIII);
            return new String(lllllllllllllIlIlllIllIIIlIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIllIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIllIIIlIlIllI) {
            lllllllllllllIlIlllIllIIIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public long readUnsignedInt() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[3]);
        return this.buffer.readUnsignedInt();
    }
    
    @Override
    public int writableBytes() {
        return ReplayingDecoderBuffer.llllIIIllIlIl[2];
    }
    
    private void checkIndex(final int lllllllllllllIlIlllIllIIlIlIlIll, final int lllllllllllllIlIlllIllIIlIlIlIlI) {
        if (lIlIIllllllIllI(lllllllllllllIlIlllIllIIlIlIlIll + lllllllllllllIlIlllIllIIlIlIlIlI, this.buffer.writerIndex())) {
            throw ReplayingDecoderBuffer.REPLAY;
        }
    }
    
    @Override
    public ByteBuf order(final ByteOrder lllllllllllllIlIlllIlllIIIllIllI) {
        if (lIlIIlllllllIlI(lllllllllllllIlIlllIlllIIIllIllI)) {
            throw new NullPointerException(ReplayingDecoderBuffer.llllIIIlIllll[ReplayingDecoderBuffer.llllIIIllIlIl[2]]);
        }
        if (lIlIIllllllIlII(lllllllllllllIlIlllIlllIIIllIllI, this.order())) {
            return this;
        }
        SwappedByteBuf lllllllllllllIlIlllIlllIIIllIlIl = this.swapped;
        if (lIlIIlllllllIlI(lllllllllllllIlIlllIlllIIIllIlIl)) {
            lllllllllllllIlIlllIlllIIIllIlIl = (this.swapped = new SwappedByteBuf(this));
        }
        return lllllllllllllIlIlllIlllIIIllIlIl;
    }
    
    @Override
    public int readUnsignedShort() {
        this.checkReadableBytes(ReplayingDecoderBuffer.llllIIIllIlIl[6]);
        return this.buffer.readUnsignedShort();
    }
    
    @Override
    public short getUnsignedByte(final int lllllllllllllIlIlllIllllIIlIIIII) {
        this.checkIndex(lllllllllllllIlIlllIllllIIlIIIII, ReplayingDecoderBuffer.llllIIIllIlIl[0]);
        return this.buffer.getUnsignedByte(lllllllllllllIlIlllIllllIIlIIIII);
    }
    
    @Override
    public int getInt(final int lllllllllllllIlIlllIlllIllIllIll) {
        this.checkIndex(lllllllllllllIlIlllIlllIllIllIll, ReplayingDecoderBuffer.llllIIIllIlIl[3]);
        return this.buffer.getInt(lllllllllllllIlIlllIlllIllIllIll);
    }
}
