// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.channels.GatheringByteChannel;
import io.netty.util.ReferenceCounted;
import java.nio.channels.ScatteringByteChannel;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

public class SwappedByteBuf extends ByteBuf
{
    private final /* synthetic */ ByteBuf buf;
    private static final /* synthetic */ String[] llIllllIlIIllI;
    private final /* synthetic */ ByteOrder order;
    private static final /* synthetic */ int[] llIllllIlIIlll;
    
    @Override
    public long getUnsignedInt(final int llllllllllllIllIIIlllIlIIllIIlIl) {
        return (long)this.getInt(llllllllllllIllIIIlllIlIIllIIlIl) & 0xFFFFFFFFL;
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream llllllllllllIllIIIlllIIIllIIlllI, final int llllllllllllIllIIIlllIIIllIIllIl) throws IOException {
        this.buf.readBytes(llllllllllllIllIIIlllIIIllIIlllI, llllllllllllIllIIIlllIIIllIIllIl);
        "".length();
        return this;
    }
    
    @Override
    public boolean release() {
        return this.buf.release();
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] llllllllllllIllIIIlllIIIIllIIllI) {
        this.buf.writeBytes(llllllllllllIllIIIlllIIIIllIIllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setLong(final int llllllllllllIllIIIlllIIllIlllIll, final long llllllllllllIllIIIlllIIllIllllIl) {
        this.buf.setLong(llllllllllllIllIIIlllIIllIlllIll, ByteBufUtil.swapLong(llllllllllllIllIIIlllIIllIllllIl));
        "".length();
        return this;
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int llllllllllllIllIIIllIllllIlIIlll, final int llllllllllllIllIIIllIllllIlIlIlI) {
        final ByteBuffer[] llllllllllllIllIIIllIllllIlIlIIl = this.buf.nioBuffers(llllllllllllIllIIIllIllllIlIIlll, llllllllllllIllIIIllIllllIlIlIlI);
        int llllllllllllIllIIIllIllllIlIllIl = SwappedByteBuf.llIllllIlIIlll[0];
        while (lIIllIlIlIllIlII(llllllllllllIllIIIllIllllIlIllIl, llllllllllllIllIIIllIllllIlIlIIl.length)) {
            llllllllllllIllIIIllIllllIlIlIIl[llllllllllllIllIIIllIllllIlIllIl] = llllllllllllIllIIIllIllllIlIlIIl[llllllllllllIllIIIllIllllIlIllIl].order(this.order);
            ++llllllllllllIllIIIllIllllIlIllIl;
            "".length();
            if (((0x8 ^ 0x30) & ~(0x4A ^ 0x72)) == " ".length()) {
                return null;
            }
        }
        return llllllllllllIllIIIllIllllIlIlIIl;
    }
    
    @Override
    public char readChar() {
        return (char)this.readShort();
    }
    
    @Override
    public boolean readBoolean() {
        return this.buf.readBoolean();
    }
    
    @Override
    public int writerIndex() {
        return this.buf.writerIndex();
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIIIlllIIllIIllIlI, final ByteBuf llllllllllllIllIIIlllIIllIIlIllI) {
        this.buf.setBytes(llllllllllllIllIIIlllIIllIIllIlI, llllllllllllIllIIIlllIIllIIlIllI);
        "".length();
        return this;
    }
    
    @Override
    public int readMedium() {
        return ByteBufUtil.swapMedium(this.buf.readMedium());
    }
    
    @Override
    public ByteBuf unwrap() {
        return this.buf.unwrap();
    }
    
    @Override
    public short readShort() {
        return ByteBufUtil.swapShort(this.buf.readShort());
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(SwappedByteBuf.llIllllIlIIllI[SwappedByteBuf.llIllllIlIIlll[4]]).append(this.buf.toString()).append((char)SwappedByteBuf.llIllllIlIIlll[5]));
    }
    
    private static String lIIllIlIlIlIlllI(final String llllllllllllIllIIIllIlllIIlIlIll, final String llllllllllllIllIIIllIlllIIlIllII) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIlllIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIlllIIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllIlllIIlIllll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllIlllIIlIllll.init(SwappedByteBuf.llIllllIlIIlll[4], llllllllllllIllIIIllIlllIIllIIII);
            return new String(llllllllllllIllIIIllIlllIIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIlllIIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIlllIIlIlllI) {
            llllllllllllIllIIIllIlllIIlIlllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIllIlIlIllIIIl();
        lIIllIlIlIllIIII();
    }
    
    @Override
    public ByteBuf writeShort(final int llllllllllllIllIIIlllIIIlIlIlIll) {
        this.buf.writeShort(ByteBufUtil.swapShort((short)llllllllllllIllIIIlllIIIlIlIlIll));
        "".length();
        return this;
    }
    
    @Override
    public int readInt() {
        return ByteBufUtil.swapInt(this.buf.readInt());
    }
    
    @Override
    public double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }
    
    @Override
    public int forEachByte(final int llllllllllllIllIIIlllIIIIIIIIIll, final int llllllllllllIllIIIlllIIIIIIIIllI, final ByteBufProcessor llllllllllllIllIIIlllIIIIIIIIlIl) {
        return this.buf.forEachByte(llllllllllllIllIIIlllIIIIIIIIIll, llllllllllllIllIIIlllIIIIIIIIllI, llllllllllllIllIIIlllIIIIIIIIlIl);
    }
    
    @Override
    public ByteBuf readBytes(final byte[] llllllllllllIllIIIlllIIIlllIIlIl) {
        this.buf.readBytes(llllllllllllIllIIIlllIIIlllIIlIl);
        "".length();
        return this;
    }
    
    @Override
    public int forEachByteDesc(final int llllllllllllIllIIIllIlllllllIIIl, final int llllllllllllIllIIIllIlllllllIlII, final ByteBufProcessor llllllllllllIllIIIllIlllllllIIll) {
        return this.buf.forEachByteDesc(llllllllllllIllIIIllIlllllllIIIl, llllllllllllIllIIIllIlllllllIlII, llllllllllllIllIIIllIlllllllIIll);
    }
    
    @Override
    public boolean hasArray() {
        return this.buf.hasArray();
    }
    
    @Override
    public float getFloat(final int llllllllllllIllIIIlllIlIIlIlIlIl) {
        return Float.intBitsToFloat(this.getInt(llllllllllllIllIIIlllIlIIlIlIlIl));
    }
    
    @Override
    public char getChar(final int llllllllllllIllIIIlllIlIIlIllIll) {
        return (char)this.getShort(llllllllllllIllIIIlllIlIIlIllIll);
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIIIlllIIlIllIIllI, final byte[] llllllllllllIllIIIlllIIlIllIIlIl, final int llllllllllllIllIIIlllIIlIllIIlII, final int llllllllllllIllIIIlllIIlIllIIIll) {
        this.buf.setBytes(llllllllllllIllIIIlllIIlIllIIllI, llllllllllllIllIIIlllIIlIllIIlIl, llllllllllllIllIIIlllIIlIllIIlII, llllllllllllIllIIIlllIIlIllIIIll);
        "".length();
        return this;
    }
    
    @Override
    public String toString(final int llllllllllllIllIIIllIllllIIIIlIl, final int llllllllllllIllIIIllIllllIIIlIII, final Charset llllllllllllIllIIIllIllllIIIIlll) {
        return this.buf.toString(llllllllllllIllIIIllIllllIIIIlIl, llllllllllllIllIIIllIllllIIIlIII, llllllllllllIllIIIllIllllIIIIlll);
    }
    
    @Override
    public ByteBuf setByte(final int llllllllllllIllIIIlllIIllllIIIlI, final int llllllllllllIllIIIlllIIlllIllllI) {
        this.buf.setByte(llllllllllllIllIIIlllIIllllIIIlI, llllllllllllIllIIIlllIIlllIllllI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readSlice(final int llllllllllllIllIIIlllIIlIIIIlIII) {
        return this.buf.readSlice(llllllllllllIllIIIlllIIlIIIIlIII).order(this.order);
    }
    
    @Override
    public int forEachByte(final ByteBufProcessor llllllllllllIllIIIlllIIIIIIIllIl) {
        return this.buf.forEachByte(llllllllllllIllIIIlllIIIIIIIllIl);
    }
    
    @Override
    public int bytesBefore(final int llllllllllllIllIIIlllIIIIIIllIIl, final int llllllllllllIllIIIlllIIIIIIlIlII, final byte llllllllllllIllIIIlllIIIIIIlIIll) {
        return this.buf.bytesBefore(llllllllllllIllIIIlllIIIIIIllIIl, llllllllllllIllIIIlllIIIIIIlIlII, llllllllllllIllIIIlllIIIIIIlIIll);
    }
    
    @Override
    public ByteBuf markReaderIndex() {
        this.buf.markReaderIndex();
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
    public ByteBuffer[] nioBuffers() {
        final ByteBuffer[] llllllllllllIllIIIllIllllIllIllI = this.buf.nioBuffers();
        int llllllllllllIllIIIllIllllIlllIII = SwappedByteBuf.llIllllIlIIlll[0];
        while (lIIllIlIlIllIlII(llllllllllllIllIIIllIllllIlllIII, llllllllllllIllIIIllIllllIllIllI.length)) {
            llllllllllllIllIIIllIllllIllIllI[llllllllllllIllIIIllIllllIlllIII] = llllllllllllIllIIIllIllllIllIllI[llllllllllllIllIIIllIllllIlllIII].order(this.order);
            ++llllllllllllIllIIIllIllllIlllIII;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        return llllllllllllIllIIIllIllllIllIllI;
    }
    
    @Override
    public ByteBuf capacity(final int llllllllllllIllIIIlllIlIllllllIl) {
        this.buf.capacity(llllllllllllIllIIIlllIlIllllllIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIIlllIlIIlIIlIII, final ByteBuf llllllllllllIllIIIlllIlIIlIIIlll) {
        this.buf.getBytes(llllllllllllIllIIIlllIlIIlIIlIII, llllllllllllIllIIIlllIlIIlIIIlll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setInt(final int llllllllllllIllIIIlllIIlllIIIlII, final int llllllllllllIllIIIlllIIlllIIIllI) {
        this.buf.setInt(llllllllllllIllIIIlllIIlllIIIlII, ByteBufUtil.swapInt(llllllllllllIllIIIlllIIlllIIIllI));
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setFloat(final int llllllllllllIllIIIlllIIllIlIlIIl, final float llllllllllllIllIIIlllIIllIlIlIII) {
        this.setInt(llllllllllllIllIIIlllIIllIlIlIIl, Float.floatToRawIntBits(llllllllllllIllIIIlllIIllIlIlIII));
        "".length();
        return this;
    }
    
    @Override
    public int bytesBefore(final byte llllllllllllIllIIIlllIIIIIlIlIlI) {
        return this.buf.bytesBefore(llllllllllllIllIIIlllIIIIIlIlIlI);
    }
    
    @Override
    public boolean isReadable() {
        return this.buf.isReadable();
    }
    
    @Override
    public long getLong(final int llllllllllllIllIIIlllIlIIllIIIIl) {
        return ByteBufUtil.swapLong(this.buf.getLong(llllllllllllIllIIIlllIlIIllIIIIl));
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIllIIIlllIIIIlllIlll, final int llllllllllllIllIIIlllIIIIllllIIl) {
        this.buf.writeBytes(llllllllllllIllIIIlllIIIIlllIlll, llllllllllllIllIIIlllIIIIllllIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIIlllIlIIIlIIlII, final byte[] llllllllllllIllIIIlllIlIIIlIIIII) {
        this.buf.getBytes(llllllllllllIllIIIlllIlIIIlIIlII, llllllllllllIllIIIlllIlIIIlIIIII);
        "".length();
        return this;
    }
    
    @Override
    public int writeBytes(final InputStream llllllllllllIllIIIlllIIIIlIIllIl, final int llllllllllllIllIIIlllIIIIlIIlIIl) throws IOException {
        return this.buf.writeBytes(llllllllllllIllIIIlllIIIIlIIllIl, llllllllllllIllIIIlllIIIIlIIlIIl);
    }
    
    @Override
    public int readableBytes() {
        return this.buf.readableBytes();
    }
    
    @Override
    public boolean isReadable(final int llllllllllllIllIIIlllIlIllIIlIII) {
        return this.buf.isReadable(llllllllllllIllIIIlllIlIllIIlIII);
    }
    
    @Override
    public ByteBuf clear() {
        this.buf.clear();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeLong(final long llllllllllllIllIIIlllIIIlIIlIlll) {
        this.buf.writeLong(ByteBufUtil.swapLong(llllllllllllIllIIIlllIIIlIIlIlll));
        "".length();
        return this;
    }
    
    @Override
    public int maxCapacity() {
        return this.buf.maxCapacity();
    }
    
    private static boolean lIIllIlIlIllIIll(final Object llllllllllllIllIIIllIlllIIlIIIIl, final Object llllllllllllIllIIIllIlllIIlIIIII) {
        return llllllllllllIllIIIllIlllIIlIIIIl == llllllllllllIllIIIllIlllIIlIIIII;
    }
    
    @Override
    public ByteBuf writeBoolean(final boolean llllllllllllIllIIIlllIIIlIllIlll) {
        this.buf.writeBoolean(llllllllllllIllIIIlllIIIlIllIlll);
        "".length();
        return this;
    }
    
    @Override
    public int readerIndex() {
        return this.buf.readerIndex();
    }
    
    @Override
    public byte readByte() {
        return this.buf.readByte();
    }
    
    @Override
    public ByteBuf ensureWritable(final int llllllllllllIllIIIlllIlIlIlIIlII) {
        this.buf.ensureWritable(llllllllllllIllIIIlllIlIlIlIIlII);
        "".length();
        return this;
    }
    
    @Override
    public ByteOrder order() {
        return this.order;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIIIlllIIllIIlIIII, final ByteBuf llllllllllllIllIIIlllIIllIIIlIll, final int llllllllllllIllIIIlllIIllIIIlIlI) {
        this.buf.setBytes(llllllllllllIllIIIlllIIllIIlIIII, llllllllllllIllIIIlllIIllIIIlIll, llllllllllllIllIIIlllIIllIIIlIlI);
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
    public ByteBuf writeFloat(final float llllllllllllIllIIIlllIIIlIIIlIll) {
        this.writeInt(Float.floatToRawIntBits(llllllllllllIllIIIlllIIIlIIIlIll));
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeMedium(final int llllllllllllIllIIIlllIIIlIlIIIll) {
        this.buf.writeMedium(ByteBufUtil.swapMedium(llllllllllllIllIIIlllIIIlIlIIIll));
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIIlllIlIIIIIlIIl, final ByteBuffer llllllllllllIllIIIlllIlIIIIIlIll) {
        this.buf.getBytes(llllllllllllIllIIIlllIlIIIIIlIIl, llllllllllllIllIIIlllIlIIIIIlIll);
        "".length();
        return this;
    }
    
    @Override
    public boolean getBoolean(final int llllllllllllIllIIIlllIlIlIIlIlll) {
        return this.buf.getBoolean(llllllllllllIllIIIlllIlIlIIlIlll);
    }
    
    @Override
    public int writeBytes(final ScatteringByteChannel llllllllllllIllIIIlllIIIIlIIIIIl, final int llllllllllllIllIIIlllIIIIlIIIIII) throws IOException {
        return this.buf.writeBytes(llllllllllllIllIIIlllIIIIlIIIIIl, llllllllllllIllIIIlllIIIIlIIIIII);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer llllllllllllIllIIIlllIIIllIlIlIl) {
        this.buf.readBytes(llllllllllllIllIIIlllIIIllIlIlIl);
        "".length();
        return this;
    }
    
    @Override
    public String toString(final Charset llllllllllllIllIIIllIllllIIIllll) {
        return this.buf.toString(llllllllllllIllIIIllIllllIIIllll);
    }
    
    @Override
    public long memoryAddress() {
        return this.buf.memoryAddress();
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIIIlllIIlIlIllIll, final ByteBuffer llllllllllllIllIIIlllIIlIlIlllIl) {
        this.buf.setBytes(llllllllllllIllIIIlllIIlIlIllIll, llllllllllllIllIIIlllIIlIlIlllIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIllIIIlllIIIIlllIIII, final int llllllllllllIllIIIlllIIIIllIlIll, final int llllllllllllIllIIIlllIIIIllIlIlI) {
        this.buf.writeBytes(llllllllllllIllIIIlllIIIIlllIIII, llllllllllllIllIIIlllIIIIllIlIll, llllllllllllIllIIIlllIIIIllIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public double getDouble(final int llllllllllllIllIIIlllIlIIlIIllIl) {
        return Double.longBitsToDouble(this.getLong(llllllllllllIllIIIlllIlIIlIIllIl));
    }
    
    @Override
    public ByteBuf discardSomeReadBytes() {
        this.buf.discardSomeReadBytes();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeInt(final int llllllllllllIllIIIlllIIIlIIlllIl) {
        this.buf.writeInt(ByteBufUtil.swapInt(llllllllllllIllIIIlllIIIlIIlllIl));
        "".length();
        return this;
    }
    
    @Override
    public ByteBuffer nioBuffer() {
        return this.buf.nioBuffer().order(this.order);
    }
    
    @Override
    public ByteBuf setBoolean(final int llllllllllllIllIIIlllIIllllIlIll, final boolean llllllllllllIllIIIlllIIllllIlIlI) {
        this.buf.setBoolean(llllllllllllIllIIIlllIIllllIlIll, llllllllllllIllIIIlllIIllllIlIlI);
        "".length();
        return this;
    }
    
    private static void lIIllIlIlIllIIII() {
        (llIllllIlIIllI = new String[SwappedByteBuf.llIllllIlIIlll[6]])[SwappedByteBuf.llIllllIlIIlll[0]] = lIIllIlIlIlIlllI("+ylFIqzL5Ec=", "BwXsr");
        SwappedByteBuf.llIllllIlIIllI[SwappedByteBuf.llIllllIlIIlll[1]] = lIIllIlIlIlIllll("BhwAOhUNHAEgBw==", "crdSt");
        SwappedByteBuf.llIllllIlIIllI[SwappedByteBuf.llIllllIlIIlll[4]] = lIIllIlIlIlIlllI("Yg0AKarzBGw0NC5Dg1NVKg==", "JKLae");
    }
    
    @Override
    public short readUnsignedByte() {
        return this.buf.readUnsignedByte();
    }
    
    @Override
    public ByteBuf retain(final int llllllllllllIllIIIllIlllIlllIlll) {
        this.buf.retain(llllllllllllIllIIIllIlllIlllIlll);
        "".length();
        return this;
    }
    
    @Override
    public long readLong() {
        return ByteBufUtil.swapLong(this.buf.readLong());
    }
    
    @Override
    public short getUnsignedByte(final int llllllllllllIllIIIlllIlIlIIIlIIl) {
        return this.buf.getUnsignedByte(llllllllllllIllIIIlllIlIlIIIlIIl);
    }
    
    @Override
    public ByteBuffer nioBuffer(final int llllllllllllIllIIIllIlllllIIIllI, final int llllllllllllIllIIIllIlllllIIlIII) {
        return this.buf.nioBuffer(llllllllllllIllIIIllIlllllIIIllI, llllllllllllIllIIIllIlllllIIlIII).order(this.order);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIllIIIlllIIlIIIIIIII) {
        this.buf.readBytes(llllllllllllIllIIIlllIIlIIIIIIII);
        "".length();
        return this;
    }
    
    @Override
    public int refCnt() {
        return this.buf.refCnt();
    }
    
    @Override
    public int ensureWritable(final int llllllllllllIllIIIlllIlIlIIlllll, final boolean llllllllllllIllIIIlllIlIlIIllIll) {
        return this.buf.ensureWritable(llllllllllllIllIIIlllIlIlIIlllll, llllllllllllIllIIIlllIlIlIIllIll);
    }
    
    @Override
    public boolean release(final int llllllllllllIllIIIllIlllIllIlllI) {
        return this.buf.release(llllllllllllIllIIIllIlllIllIlllI);
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] llllllllllllIllIIIlllIIIIlIllllI, final int llllllllllllIllIIIlllIIIIlIlllIl, final int llllllllllllIllIIIlllIIIIlIllIII) {
        this.buf.writeBytes(llllllllllllIllIIIlllIIIIlIllllI, llllllllllllIllIIIlllIIIIlIlllIl, llllllllllllIllIIIlllIIIIlIllIII);
        "".length();
        return this;
    }
    
    @Override
    public int indexOf(final int llllllllllllIllIIIlllIIIIIllIlII, final int llllllllllllIllIIIlllIIIIIllIIll, final byte llllllllllllIllIIIlllIIIIIlIlllI) {
        return this.buf.indexOf(llllllllllllIllIIIlllIIIIIllIlII, llllllllllllIllIIIlllIIIIIllIIll, llllllllllllIllIIIlllIIIIIlIlllI);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int llllllllllllIllIIIllIlllllIIIIII, final int llllllllllllIllIIIllIllllIllllll) {
        return this.nioBuffer(llllllllllllIllIIIllIlllllIIIIII, llllllllllllIllIIIllIllllIllllll);
    }
    
    @Override
    public ByteBuf writeZero(final int llllllllllllIllIIIlllIIIIIllllII) {
        this.buf.writeZero(llllllllllllIllIIIlllIIIIIllllII);
        "".length();
        return this;
    }
    
    @Override
    public int getUnsignedShort(final int llllllllllllIllIIIlllIlIIlllllll) {
        return this.getShort(llllllllllllIllIIIlllIlIIlllllll) & SwappedByteBuf.llIllllIlIIlll[2];
    }
    
    @Override
    public ByteBuf writeByte(final int llllllllllllIllIIIlllIIIlIlIllll) {
        this.buf.writeByte(llllllllllllIllIIIlllIIIlIlIllll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeDouble(final double llllllllllllIllIIIlllIIIlIIIIlIl) {
        this.writeLong(Double.doubleToRawLongBits(llllllllllllIllIIIlllIIIlIIIIlIl));
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writerIndex(final int llllllllllllIllIIIlllIlIlllIIIll) {
        this.buf.writerIndex(llllllllllllIllIIIlllIlIlllIIIll);
        "".length();
        return this;
    }
    
    private static boolean lIIllIlIlIllIlIl(final int llllllllllllIllIIIllIlllIIIlllII) {
        return llllllllllllIllIIIllIlllIIIlllII != 0;
    }
    
    @Override
    public boolean isWritable() {
        return this.buf.isWritable();
    }
    
    @Override
    public ByteBuf duplicate() {
        return this.buf.duplicate().order(this.order);
    }
    
    @Override
    public ByteBuf skipBytes(final int llllllllllllIllIIIlllIIIlIllllIl) {
        this.buf.skipBytes(llllllllllllIllIIIlllIIIlIllllIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setShort(final int llllllllllllIllIIIlllIIlllIllIIl, final int llllllllllllIllIIIlllIIlllIlIlIl) {
        this.buf.setShort(llllllllllllIllIIIlllIIlllIllIIl, ByteBufUtil.swapShort((short)llllllllllllIllIIIlllIIlllIlIlIl));
        "".length();
        return this;
    }
    
    @Override
    public float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }
    
    @Override
    public ByteBuf resetWriterIndex() {
        this.buf.resetWriterIndex();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readerIndex(final int llllllllllllIllIIIlllIlIlllIllII) {
        this.buf.readerIndex(llllllllllllIllIIIlllIlIlllIllII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        this.buf.discardReadBytes();
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf slice() {
        return this.buf.slice().order(this.order);
    }
    
    @Override
    public ByteBuf copy(final int llllllllllllIllIIIllIllllllIIlII, final int llllllllllllIllIIIllIllllllIIllI) {
        return this.buf.copy(llllllllllllIllIIIllIllllllIIlII, llllllllllllIllIIIllIllllllIIllI).order(this.order);
    }
    
    @Override
    public int forEachByteDesc(final ByteBufProcessor llllllllllllIllIIIllIlllllllllIl) {
        return this.buf.forEachByteDesc(llllllllllllIllIIIllIlllllllllIl);
    }
    
    @Override
    public int readUnsignedShort() {
        return this.readShort() & SwappedByteBuf.llIllllIlIIlll[2];
    }
    
    @Override
    public ByteBuf setChar(final int llllllllllllIllIIIlllIIllIllIlIl, final int llllllllllllIllIIIlllIIllIllIlII) {
        this.setShort(llllllllllllIllIIIlllIIllIllIlIl, llllllllllllIllIIIlllIIllIllIlII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf copy() {
        return this.buf.copy().order(this.order);
    }
    
    @Override
    public ByteBuf setZero(final int llllllllllllIllIIIlllIIlIIlllIlI, final int llllllllllllIllIIIlllIIlIIllllII) {
        this.buf.setZero(llllllllllllIllIIIlllIIlIIlllIlI, llllllllllllIllIIIlllIIlIIllllII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIIlllIlIIIIIIIlI, final OutputStream llllllllllllIllIIIlllIIlllllllIl, final int llllllllllllIllIIIlllIIlllllllII) throws IOException {
        this.buf.getBytes(llllllllllllIllIIIlllIlIIIIIIIlI, llllllllllllIllIIIlllIIlllllllIl, llllllllllllIllIIIlllIIlllllllII);
        "".length();
        return this;
    }
    
    @Override
    public int getMedium(final int llllllllllllIllIIIlllIlIIlllIlll) {
        return ByteBufUtil.swapMedium(this.buf.getMedium(llllllllllllIllIIIlllIlIIlllIlll));
    }
    
    @Override
    public int readBytes(final GatheringByteChannel llllllllllllIllIIIlllIIIllIIIlIl, final int llllllllllllIllIIIlllIIIllIIIIIl) throws IOException {
        return this.buf.readBytes(llllllllllllIllIIIlllIIIllIIIlIl, llllllllllllIllIIIlllIIIllIIIIIl);
    }
    
    @Override
    public long readUnsignedInt() {
        return (long)this.readInt() & 0xFFFFFFFFL;
    }
    
    @Override
    public int maxWritableBytes() {
        return this.buf.maxWritableBytes();
    }
    
    @Override
    public ByteBuf setMedium(final int llllllllllllIllIIIlllIIlllIlIIII, final int llllllllllllIllIIIlllIIlllIIllll) {
        this.buf.setMedium(llllllllllllIllIIIlllIIlllIlIIII, ByteBufUtil.swapMedium(llllllllllllIllIIIlllIIlllIIllll));
        "".length();
        return this;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIIIllIlllIllIIlll) {
        if (lIIllIlIlIllIIll(this, llllllllllllIllIIIllIlllIllIIlll)) {
            return SwappedByteBuf.llIllllIlIIlll[1] != 0;
        }
        if (lIIllIlIlIllIlIl((llllllllllllIllIIIllIlllIllIIlll instanceof ByteBuf) ? 1 : 0)) {
            return ByteBufUtil.equals(this, (ByteBuf)llllllllllllIllIIIllIlllIllIIlll);
        }
        return SwappedByteBuf.llIllllIlIIlll[0] != 0;
    }
    
    @Override
    public int getBytes(final int llllllllllllIllIIIlllIIlllllIllI, final GatheringByteChannel llllllllllllIllIIIlllIIlllllIIIl, final int llllllllllllIllIIIlllIIlllllIIII) throws IOException {
        return this.buf.getBytes(llllllllllllIllIIIlllIIlllllIllI, llllllllllllIllIIIlllIIlllllIIIl, llllllllllllIllIIIlllIIlllllIIII);
    }
    
    @Override
    public int nioBufferCount() {
        return this.buf.nioBufferCount();
    }
    
    @Override
    public int readUnsignedMedium() {
        return this.readMedium() & SwappedByteBuf.llIllllIlIIlll[3];
    }
    
    @Override
    public boolean isDirect() {
        return this.buf.isDirect();
    }
    
    @Override
    public ByteBuf retain() {
        this.buf.retain();
        "".length();
        return this;
    }
    
    private static void lIIllIlIlIllIIIl() {
        (llIllllIlIIlll = new int[7])[0] = ((86 + 162 - 110 + 28 ^ 66 + 141 - 205 + 146) & (104 + 54 - 120 + 153 ^ 29 + 56 + 55 + 1 ^ -" ".length()));
        SwappedByteBuf.llIllllIlIIlll[1] = " ".length();
        SwappedByteBuf.llIllllIlIIlll[2] = (-1 & 0xFFFF);
        SwappedByteBuf.llIllllIlIIlll[3] = (-" ".length() & (-1 & 0xFFFFFF));
        SwappedByteBuf.llIllllIlIIlll[4] = "  ".length();
        SwappedByteBuf.llIllllIlIIlll[5] = (0xC ^ 0x25);
        SwappedByteBuf.llIllllIlIIlll[6] = "   ".length();
    }
    
    @Override
    public ByteBuf readBytes(final byte[] llllllllllllIllIIIlllIIIllIllIll, final int llllllllllllIllIIIlllIIIllIllIlI, final int llllllllllllIllIIIlllIIIllIlllIl) {
        this.buf.readBytes(llllllllllllIllIIIlllIIIllIllIll, llllllllllllIllIIIlllIIIllIllIlI, llllllllllllIllIIIlllIIIllIlllIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeChar(final int llllllllllllIllIIIlllIIIlIIlIIIl) {
        this.writeShort(llllllllllllIllIIIlllIIIlIIlIIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setDouble(final int llllllllllllIllIIIlllIIllIlIIIII, final double llllllllllllIllIIIlllIIllIIlllll) {
        this.setLong(llllllllllllIllIIIlllIIllIlIIIII, Double.doubleToRawLongBits(llllllllllllIllIIIlllIIllIIlllll));
        "".length();
        return this;
    }
    
    @Override
    public int getInt(final int llllllllllllIllIIIlllIlIIllIllIl) {
        return ByteBufUtil.swapInt(this.buf.getInt(llllllllllllIllIIIlllIlIIllIllIl));
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIIIlllIIlIllllllI, final ByteBuf llllllllllllIllIIIlllIIllIIIIIlI, final int llllllllllllIllIIIlllIIlIlllllII, final int llllllllllllIllIIIlllIIllIIIIIII) {
        this.buf.setBytes(llllllllllllIllIIIlllIIlIllllllI, llllllllllllIllIIIlllIIllIIIIIlI, llllllllllllIllIIIlllIIlIlllllII, llllllllllllIllIIIlllIIllIIIIIII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIIIlllIIlIlllIllI, final byte[] llllllllllllIllIIIlllIIlIlllIIlI) {
        this.buf.setBytes(llllllllllllIllIIIlllIIlIlllIllI, llllllllllllIllIIIlllIIlIlllIIlI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIllIIIlllIIIIlllllll) {
        this.buf.writeBytes(llllllllllllIllIIIlllIIIIlllllll);
        "".length();
        return this;
    }
    
    private static String lIIllIlIlIlIllll(String llllllllllllIllIIIllIlllIIllllIl, final String llllllllllllIllIIIllIlllIIllllII) {
        llllllllllllIllIIIllIlllIIllllIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIllIlllIIllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllIlllIlIIIIII = new StringBuilder();
        final char[] llllllllllllIllIIIllIlllIIllllll = llllllllllllIllIIIllIlllIIllllII.toCharArray();
        int llllllllllllIllIIIllIlllIIlllllI = SwappedByteBuf.llIllllIlIIlll[0];
        final Exception llllllllllllIllIIIllIlllIIlllIII = (Object)llllllllllllIllIIIllIlllIIllllIl.toCharArray();
        final byte llllllllllllIllIIIllIlllIIllIlll = (byte)llllllllllllIllIIIllIlllIIlllIII.length;
        Exception llllllllllllIllIIIllIlllIIllIllI = (Exception)SwappedByteBuf.llIllllIlIIlll[0];
        while (lIIllIlIlIllIlII((int)llllllllllllIllIIIllIlllIIllIllI, llllllllllllIllIIIllIlllIIllIlll)) {
            final char llllllllllllIllIIIllIlllIlIIIIll = llllllllllllIllIIIllIlllIIlllIII[llllllllllllIllIIIllIlllIIllIllI];
            llllllllllllIllIIIllIlllIlIIIIII.append((char)(llllllllllllIllIIIllIlllIlIIIIll ^ llllllllllllIllIIIllIlllIIllllll[llllllllllllIllIIIllIlllIIlllllI % llllllllllllIllIIIllIlllIIllllll.length]));
            "".length();
            ++llllllllllllIllIIIllIlllIIlllllI;
            ++llllllllllllIllIIIllIlllIIllIllI;
            "".length();
            if (((0xAA ^ 0x9E ^ (0x67 ^ 0x4F)) & (0x45 ^ 0x60 ^ (0x21 ^ 0x18) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllIlllIlIIIIII);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIllIIIlllIIIlllIllIl, final int llllllllllllIllIIIlllIIIllllIIII, final int llllllllllllIllIIIlllIIIlllIllll) {
        this.buf.readBytes(llllllllllllIllIIIlllIIIlllIllIl, llllllllllllIllIIIlllIIIllllIIII, llllllllllllIllIIIlllIIIlllIllll);
        "".length();
        return this;
    }
    
    @Override
    public int setBytes(final int llllllllllllIllIIIlllIIlIlIIlIII, final ScatteringByteChannel llllllllllllIllIIIlllIIlIlIIIlll, final int llllllllllllIllIIIlllIIlIlIIIllI) throws IOException {
        return this.buf.setBytes(llllllllllllIllIIIlllIIlIlIIlIII, llllllllllllIllIIIlllIIlIlIIIlll, llllllllllllIllIIIlllIIlIlIIIllI);
    }
    
    @Override
    public int compareTo(final ByteBuf llllllllllllIllIIIllIlllIlIlllll) {
        return ByteBufUtil.compare(this, llllllllllllIllIIIllIlllIlIlllll);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIllIIIlllIIIlllllIII, final int llllllllllllIllIIIlllIIIllllIlll) {
        this.buf.readBytes(llllllllllllIllIIIlllIIIlllllIII, llllllllllllIllIIIlllIIIllllIlll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final int llllllllllllIllIIIlllIIlIIIIllII) {
        return this.buf.readBytes(llllllllllllIllIIIlllIIlIIIIllII).order(this.order());
    }
    
    @Override
    public int writableBytes() {
        return this.buf.writableBytes();
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return this.buf.hasMemoryAddress();
    }
    
    @Override
    public int bytesBefore(final int llllllllllllIllIIIlllIIIIIlIIIII, final byte llllllllllllIllIIIlllIIIIIlIIIlI) {
        return this.buf.bytesBefore(llllllllllllIllIIIlllIIIIIlIIIII, llllllllllllIllIIIlllIIIIIlIIIlI);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIIlllIlIIIIllIIl, final byte[] llllllllllllIllIIIlllIlIIIIlIIll, final int llllllllllllIllIIIlllIlIIIIlIlll, final int llllllllllllIllIIIlllIlIIIIlIIIl) {
        this.buf.getBytes(llllllllllllIllIIIlllIlIIIIllIIl, llllllllllllIllIIIlllIlIIIIlIIll, llllllllllllIllIIIlllIlIIIIlIlll, llllllllllllIllIIIlllIlIIIIlIIIl);
        "".length();
        return this;
    }
    
    @Override
    public boolean isWritable(final int llllllllllllIllIIIlllIlIlIllllll) {
        return this.buf.isWritable(llllllllllllIllIIIlllIlIlIllllll);
    }
    
    @Override
    public ByteBuf slice(final int llllllllllllIllIIIllIlllllIllIll, final int llllllllllllIllIIIllIlllllIllIlI) {
        return this.buf.slice(llllllllllllIllIIIllIlllllIllIll, llllllllllllIllIIIllIlllllIllIlI).order(this.order);
    }
    
    private static boolean lIIllIlIlIllIIlI(final Object llllllllllllIllIIIllIlllIIIllllI) {
        return llllllllllllIllIIIllIlllIIIllllI == null;
    }
    
    @Override
    public ByteBuf order(final ByteOrder llllllllllllIllIIIlllIllIIIIllII) {
        if (lIIllIlIlIllIIlI(llllllllllllIllIIIlllIllIIIIllII)) {
            throw new NullPointerException(SwappedByteBuf.llIllllIlIIllI[SwappedByteBuf.llIllllIlIIlll[1]]);
        }
        if (lIIllIlIlIllIIll(llllllllllllIllIIIlllIllIIIIllII, this.order)) {
            return this;
        }
        return this.buf;
    }
    
    private static boolean lIIllIlIlIllIlII(final int llllllllllllIllIIIllIlllIIlIIlIl, final int llllllllllllIllIIIllIlllIIlIIlII) {
        return llllllllllllIllIIIllIlllIIlIIlIl < llllllllllllIllIIIllIlllIIlIIlII;
    }
    
    public SwappedByteBuf(final ByteBuf llllllllllllIllIIIlllIllIIIlIIll) {
        if (lIIllIlIlIllIIlI(llllllllllllIllIIIlllIllIIIlIIll)) {
            throw new NullPointerException(SwappedByteBuf.llIllllIlIIllI[SwappedByteBuf.llIllllIlIIlll[0]]);
        }
        this.buf = llllllllllllIllIIIlllIllIIIlIIll;
        if (lIIllIlIlIllIIll(llllllllllllIllIIIlllIllIIIlIIll.order(), ByteOrder.BIG_ENDIAN)) {
            this.order = ByteOrder.LITTLE_ENDIAN;
            "".length();
            if ((0x92 ^ 0x96) <= "   ".length()) {
                throw null;
            }
        }
        else {
            this.order = ByteOrder.BIG_ENDIAN;
        }
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIIlllIlIIIllIIIl, final ByteBuf llllllllllllIllIIIlllIlIIIlIlIll, final int llllllllllllIllIIIlllIlIIIlIlIlI, final int llllllllllllIllIIIlllIlIIIlIlIIl) {
        this.buf.getBytes(llllllllllllIllIIIlllIlIIIllIIIl, llllllllllllIllIIIlllIlIIIlIlIll, llllllllllllIllIIIlllIlIIIlIlIlI, llllllllllllIllIIIlllIlIIIlIlIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuffer llllllllllllIllIIIlllIIIIlIlIlII) {
        this.buf.writeBytes(llllllllllllIllIIIlllIIIIlIlIlII);
        "".length();
        return this;
    }
    
    @Override
    public short getShort(final int llllllllllllIllIIIlllIlIlIIIIIll) {
        return ByteBufUtil.swapShort(this.buf.getShort(llllllllllllIllIIIlllIlIlIIIIIll));
    }
    
    @Override
    public int getUnsignedMedium(final int llllllllllllIllIIIlllIlIIlllIIIl) {
        return this.getMedium(llllllllllllIllIIIlllIlIIlllIIIl) & SwappedByteBuf.llIllllIlIIlll[3];
    }
    
    @Override
    public byte getByte(final int llllllllllllIllIIIlllIlIlIIlIIIl) {
        return this.buf.getByte(llllllllllllIllIIIlllIlIlIIlIIIl);
    }
    
    @Override
    public ByteBuf setIndex(final int llllllllllllIllIIIlllIlIllIllIll, final int llllllllllllIllIIIlllIlIllIllIlI) {
        this.buf.setIndex(llllllllllllIllIIIlllIlIllIllIll, llllllllllllIllIIIlllIlIllIllIlI);
        "".length();
        return this;
    }
    
    @Override
    public int hashCode() {
        return this.buf.hashCode();
    }
    
    @Override
    public int arrayOffset() {
        return this.buf.arrayOffset();
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIIlllIlIIIlllllI, final ByteBuf llllllllllllIllIIIlllIlIIIllllIl, final int llllllllllllIllIIIlllIlIIIlllIII) {
        this.buf.getBytes(llllllllllllIllIIIlllIlIIIlllllI, llllllllllllIllIIIlllIlIIIllllIl, llllllllllllIllIIIlllIlIIIlllIII);
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
    public int capacity() {
        return this.buf.capacity();
    }
    
    @Override
    public int setBytes(final int llllllllllllIllIIIlllIIlIlIlIIII, final InputStream llllllllllllIllIIIlllIIlIlIlIIll, final int llllllllllllIllIIIlllIIlIlIlIIlI) throws IOException {
        return this.buf.setBytes(llllllllllllIllIIIlllIIlIlIlIIII, llllllllllllIllIIIlllIIlIlIlIIll, llllllllllllIllIIIlllIIlIlIlIIlI);
    }
}
