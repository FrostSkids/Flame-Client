// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.io.OutputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.GatheringByteChannel;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import io.netty.util.internal.StringUtil;
import java.nio.ReadOnlyBufferException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;

class ReadOnlyByteBufferBuf extends AbstractReferenceCountedByteBuf
{
    private static final /* synthetic */ int[] lIllIlIIIIIIlI;
    private static final /* synthetic */ String[] lIllIIllllllll;
    protected final /* synthetic */ ByteBuffer buffer;
    private final /* synthetic */ ByteBufAllocator allocator;
    private /* synthetic */ ByteBuffer tmpNioBuf;
    
    private static String lllllIlllIllIII(final String lllllllllllllIIIIIIIlIlIlIIlllII, final String lllllllllllllIIIIIIIlIlIlIIllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIlIlIlIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIlIlIlIIllIIl.getBytes(StandardCharsets.UTF_8)), ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[4]), "DES");
            final Cipher lllllllllllllIIIIIIIlIlIlIIllllI = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIlIlIlIIllllI.init(ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[5], lllllllllllllIIIIIIIlIlIlIIlllll);
            return new String(lllllllllllllIIIIIIIlIlIlIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIlIlIlIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIlIlIlIIlllIl) {
            lllllllllllllIIIIIIIlIlIlIIlllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void _setMedium(final int lllllllllllllIIIIIIIlIllIlIIIIll, final int lllllllllllllIIIIIIIlIllIlIIIIlI) {
        throw new ReadOnlyBufferException();
    }
    
    static {
        lllllIlllIllllI();
        lllllIlllIllIIl();
    }
    
    private static void lllllIlllIllllI() {
        (lIllIlIIIIIIlI = new int[8])[0] = ((0x1B ^ 0x67 ^ (0x3 ^ 0x72)) & (0x94 ^ 0xA1 ^ (0x9A ^ 0xA2) ^ -" ".length()));
        ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[1] = (0xC8 ^ 0xC2) + (15 + 61 - 60 + 187) - -(0x95 ^ 0x87) + (0xBE ^ 0xA6);
        ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[2] = (0x7A ^ 0x6A);
        ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[3] = " ".length();
        ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[4] = (0x7D ^ 0x75);
        ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[5] = "  ".length();
        ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[6] = "   ".length();
        ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[7] = (87 + 68 - 47 + 54 ^ 135 + 117 - 113 + 27);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIIlIllIlIlIIll, final ByteBuffer lllllllllllllIIIIIIIlIllIlIlIIlI) {
        this.checkIndex(lllllllllllllIIIIIIIlIllIlIlIIll);
        if (lllllIllllIIlll(lllllllllllllIIIIIIIlIllIlIlIIlI)) {
            throw new NullPointerException(ReadOnlyByteBufferBuf.lIllIIllllllll[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[5]]);
        }
        final int lllllllllllllIIIIIIIlIllIlIlIIIl = Math.min(this.capacity() - lllllllllllllIIIIIIIlIllIlIlIIll, lllllllllllllIIIIIIIlIllIlIlIIlI.remaining());
        final ByteBuffer lllllllllllllIIIIIIIlIllIlIlIIII = this.internalNioBuffer();
        lllllllllllllIIIIIIIlIllIlIlIIII.clear().position(lllllllllllllIIIIIIIlIllIlIlIIll).limit(lllllllllllllIIIIIIIlIllIlIlIIll + lllllllllllllIIIIIIIlIllIlIlIIIl);
        "".length();
        lllllllllllllIIIIIIIlIllIlIlIIlI.put(lllllllllllllIIIIIIIlIllIlIlIIII);
        "".length();
        return this;
    }
    
    protected final ByteBuffer internalNioBuffer() {
        ByteBuffer lllllllllllllIIIIIIIlIlIllllIlIl = this.tmpNioBuf;
        if (lllllIllllIIlll(lllllllllllllIIIIIIIlIlIllllIlIl)) {
            lllllllllllllIIIIIIIlIlIllllIlIl = (this.tmpNioBuf = this.buffer.duplicate());
        }
        return lllllllllllllIIIIIIIlIlIllllIlIl;
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIIIIIIIlIlIlllIlIll, final int lllllllllllllIIIIIIIlIlIlllIlIlI) {
        this.ensureAccessible();
        ByteBuffer lllllllllllllIIIIIIIlIlIlllIlIIl;
        try {
            lllllllllllllIIIIIIIlIlIlllIlIIl = (ByteBuffer)this.internalNioBuffer().clear().position(lllllllllllllIIIIIIIlIlIlllIlIll).limit(lllllllllllllIIIIIIIlIlIlllIlIll + lllllllllllllIIIIIIIlIlIlllIlIlI);
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        catch (IllegalArgumentException lllllllllllllIIIIIIIlIlIlllIllIl) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(ReadOnlyByteBufferBuf.lIllIIllllllll[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[6]]).append(lllllllllllllIIIIIIIlIlIlllIlIll + lllllllllllllIIIIIIIlIlIlllIlIlI)));
        }
        final ByteBuffer lllllllllllllIIIIIIIlIlIlllIlIII = ByteBuffer.allocateDirect(lllllllllllllIIIIIIIlIlIlllIlIlI);
        lllllllllllllIIIIIIIlIlIlllIlIII.put(lllllllllllllIIIIIIIlIlIlllIlIIl);
        "".length();
        lllllllllllllIIIIIIIlIlIlllIlIII.order(this.order());
        "".length();
        lllllllllllllIIIIIIIlIlIlllIlIII.clear();
        "".length();
        return new UnpooledDirectByteBuf(this.alloc(), lllllllllllllIIIIIIIlIlIlllIlIII, this.maxCapacity());
    }
    
    @Override
    public int getInt(final int lllllllllllllIIIIIIIlIlllIIlllII) {
        this.ensureAccessible();
        return this._getInt(lllllllllllllIIIIIIIlIlllIIlllII);
    }
    
    @Override
    protected int _getInt(final int lllllllllllllIIIIIIIlIlllIIllIII) {
        return this.buffer.getInt(lllllllllllllIIIIIIIlIlllIIllIII);
    }
    
    @Override
    public short getShort(final int lllllllllllllIIIIIIIlIlllIllIlII) {
        this.ensureAccessible();
        return this._getShort(lllllllllllllIIIIIIIlIlllIllIlII);
    }
    
    @Override
    protected int _getUnsignedMedium(final int lllllllllllllIIIIIIIlIlllIlIIlII) {
        return (this.getByte(lllllllllllllIIIIIIIlIlllIlIIlII) & ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[1]) << ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[2] | (this.getByte(lllllllllllllIIIIIIIlIlllIlIIlII + ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[3]) & ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[1]) << ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[4] | (this.getByte(lllllllllllllIIIIIIIlIlllIlIIlII + ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[5]) & ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[1]);
    }
    
    ReadOnlyByteBufferBuf(final ByteBufAllocator lllllllllllllIIIIIIIlIllllIIlIII, final ByteBuffer lllllllllllllIIIIIIIlIllllIIlIlI) {
        super(lllllllllllllIIIIIIIlIllllIIlIlI.remaining());
        if (lllllIlllIlllll(lllllllllllllIIIIIIIlIllllIIlIlI.isReadOnly() ? 1 : 0)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(ReadOnlyByteBufferBuf.lIllIIllllllll[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[0]]).append(StringUtil.simpleClassName(lllllllllllllIIIIIIIlIllllIIlIlI))));
        }
        this.allocator = lllllllllllllIIIIIIIlIllllIIlIII;
        this.buffer = lllllllllllllIIIIIIIlIllllIIlIlI.slice().order(ByteOrder.BIG_ENDIAN);
        this.writerIndex(this.buffer.limit());
        "".length();
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.allocator;
    }
    
    @Override
    public ByteBuf unwrap() {
        return null;
    }
    
    private static boolean lllllIllllIIIll(final int lllllllllllllIIIIIIIlIlIlIIIIlIl) {
        return lllllllllllllIIIIIIIlIlIlIIIIlIl > 0;
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIIIIIIlIlIllllllll, final InputStream lllllllllllllIIIIIIIlIlIlllllllI, final int lllllllllllllIIIIIIIlIlIllllllIl) throws IOException {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIIlIllIlIllllI, final byte[] lllllllllllllIIIIIIIlIllIlIlllIl, final int lllllllllllllIIIIIIIlIllIlIlllII, final int lllllllllllllIIIIIIIlIllIlIllIll) {
        this.checkDstIndex(lllllllllllllIIIIIIIlIllIlIllllI, lllllllllllllIIIIIIIlIllIlIllIll, lllllllllllllIIIIIIIlIllIlIlllII, lllllllllllllIIIIIIIlIllIlIlllIl.length);
        if (!lllllIllllIIlIl(lllllllllllllIIIIIIIlIllIlIlllII) || lllllIllllIIllI(lllllllllllllIIIIIIIlIllIlIlllII, lllllllllllllIIIIIIIlIllIlIlllIl.length - lllllllllllllIIIIIIIlIllIlIllIll)) {
            final String format = ReadOnlyByteBufferBuf.lIllIIllllllll[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[3]];
            final Object[] args = new Object[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[6]];
            args[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[0]] = lllllllllllllIIIIIIIlIllIlIlllII;
            args[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[3]] = lllllllllllllIIIIIIIlIllIlIllIll;
            args[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[5]] = lllllllllllllIIIIIIIlIllIlIlllIl.length;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        final ByteBuffer lllllllllllllIIIIIIIlIllIllIIIII = this.internalNioBuffer();
        lllllllllllllIIIIIIIlIllIllIIIII.clear().position(lllllllllllllIIIIIIIlIllIlIllllI).limit(lllllllllllllIIIIIIIlIllIlIllllI + lllllllllllllIIIIIIIlIllIlIllIll);
        "".length();
        lllllllllllllIIIIIIIlIllIllIIIII.get(lllllllllllllIIIIIIIlIllIlIlllIl, lllllllllllllIIIIIIIlIllIlIlllII, lllllllllllllIIIIIIIlIllIlIllIll);
        "".length();
        return this;
    }
    
    private static void lllllIlllIllIIl() {
        (lIllIIllllllll = new String[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[7]])[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[0]] = lllllIlllIlIlll("KBYJB2wnBloSbDcGGxcjKw8DUy4wBRwWPn9D", "EczsL");
        ReadOnlyByteBufferBuf.lIllIIllllllll[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[3]] = lllllIlllIlIlll("ISIaDzwhNBZ8cmA1QmY+ID8JMjp/cUsicm00FjY3JiULImhlIw8oNSB5XmpyYDVHbw==", "EQnFR");
        ReadOnlyByteBufferBuf.lIllIIllllllll[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[5]] = lllllIlllIllIII("TTBGg7+5TfI=", "vYKDs");
        ReadOnlyByteBufferBuf.lIllIIllllllll[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[6]] = lllllIlllIllIII("EBEH7LQnpeylb3Xy+KpIZyx79Nd/FXwvyckzNnx7Vuo=", "wfxdQ");
    }
    
    @Override
    public boolean hasArray() {
        return this.buffer.hasArray();
    }
    
    @Override
    protected short _getShort(final int lllllllllllllIIIIIIIlIlllIlIlllI) {
        return this.buffer.getShort(lllllllllllllIIIIIIIlIlllIlIlllI);
    }
    
    @Override
    protected long _getLong(final int lllllllllllllIIIIIIIlIlllIIIllII) {
        return this.buffer.getLong(lllllllllllllIIIIIIIlIlllIIIllII);
    }
    
    @Override
    protected void _setByte(final int lllllllllllllIIIIIIIlIllIlIIlIIl, final int lllllllllllllIIIIIIIlIllIlIIlIII) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public int getBytes(final int lllllllllllllIIIIIIIlIllIIIlIIIl, final GatheringByteChannel lllllllllllllIIIIIIIlIllIIIlIlIl, final int lllllllllllllIIIIIIIlIllIIIIllll) throws IOException {
        this.ensureAccessible();
        if (lllllIlllIlllll(lllllllllllllIIIIIIIlIllIIIIllll)) {
            return ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[0];
        }
        final ByteBuffer lllllllllllllIIIIIIIlIllIIIlIIll = this.internalNioBuffer();
        lllllllllllllIIIIIIIlIllIIIlIIll.clear().position(lllllllllllllIIIIIIIlIllIIIlIIIl).limit(lllllllllllllIIIIIIIlIllIIIlIIIl + lllllllllllllIIIIIIIlIllIIIIllll);
        "".length();
        return lllllllllllllIIIIIIIlIllIIIlIlIl.write(lllllllllllllIIIIIIIlIllIIIlIIll);
    }
    
    private static boolean lllllIllllIIlII(final int lllllllllllllIIIIIIIlIlIlIIlIlII, final int lllllllllllllIIIIIIIlIlIlIIlIIll) {
        return lllllllllllllIIIIIIIlIlIlIIlIlII < lllllllllllllIIIIIIIlIlIlIIlIIll;
    }
    
    @Override
    public ByteBuf capacity(final int lllllllllllllIIIIIIIlIllIIllIlll) {
        throw new ReadOnlyBufferException();
    }
    
    private static boolean lllllIlllIlllll(final int lllllllllllllIIIIIIIlIlIlIIIlIIl) {
        return lllllllllllllIIIIIIIlIlIlIIIlIIl == 0;
    }
    
    @Override
    public ByteBuffer nioBuffer(final int lllllllllllllIIIIIIIlIlIllIlIlII, final int lllllllllllllIIIIIIIlIlIllIlIIII) {
        return (ByteBuffer)this.buffer.duplicate().position(lllllllllllllIIIIIIIlIlIllIlIlII).limit(lllllllllllllIIIIIIIlIlIllIlIlII + lllllllllllllIIIIIIIlIlIllIlIIII);
    }
    
    @Override
    public byte getByte(final int lllllllllllllIIIIIIIlIllllIIIIlI) {
        this.ensureAccessible();
        return this._getByte(lllllllllllllIIIIIIIlIllllIIIIlI);
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIIIIIIlIlIlllllIll, final ScatteringByteChannel lllllllllllllIIIIIIIlIlIlllllIlI, final int lllllllllllllIIIIIIIlIlIlllllIIl) throws IOException {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    protected void _setLong(final int lllllllllllllIIIIIIIlIllIIllllIl, final long lllllllllllllIIIIIIIlIllIIllllII) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIIIIlIllIIIIllII, final ByteBuf lllllllllllllIIIIIIIlIllIIIIlIll, final int lllllllllllllIIIIIIIlIllIIIIlIlI, final int lllllllllllllIIIIIIIlIllIIIIlIIl) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public long getLong(final int lllllllllllllIIIIIIIlIlllIIlIIII) {
        this.ensureAccessible();
        return this._getLong(lllllllllllllIIIIIIIlIlllIIlIIII);
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIIIIIIIlIlIllIllIlI, final int lllllllllllllIIIIIIIlIlIllIlllII) {
        final ByteBuffer[] array = new ByteBuffer[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[3]];
        array[ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[0]] = this.nioBuffer(lllllllllllllIIIIIIIlIlIllIllIlI, lllllllllllllIIIIIIIlIlIllIlllII);
        return array;
    }
    
    @Override
    public int capacity() {
        return this.maxCapacity();
    }
    
    @Override
    public int arrayOffset() {
        return this.buffer.arrayOffset();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIIIIlIllIIIIIIlI, final ByteBuffer lllllllllllllIIIIIIIlIllIIIIIIIl) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIIIIIIIlIlIllIIlIII, final int lllllllllllllIIIIIIIlIlIllIIlIlI) {
        this.ensureAccessible();
        return (ByteBuffer)this.internalNioBuffer().clear().position(lllllllllllllIIIIIIIlIlIllIIlIII).limit(lllllllllllllIIIIIIIlIlIllIIlIII + lllllllllllllIIIIIIIlIlIllIIlIlI);
    }
    
    private static String lllllIlllIlIlll(String lllllllllllllIIIIIIIlIlIlIlIllII, final String lllllllllllllIIIIIIIlIlIlIllIIII) {
        lllllllllllllIIIIIIIlIlIlIlIllII = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIIlIlIlIlIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIlIlIlIlIllll = new StringBuilder();
        final char[] lllllllllllllIIIIIIIlIlIlIlIlllI = lllllllllllllIIIIIIIlIlIlIllIIII.toCharArray();
        int lllllllllllllIIIIIIIlIlIlIlIllIl = ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[0];
        final long lllllllllllllIIIIIIIlIlIlIlIIlll = (Object)((String)lllllllllllllIIIIIIIlIlIlIlIllII).toCharArray();
        final short lllllllllllllIIIIIIIlIlIlIlIIllI = (short)lllllllllllllIIIIIIIlIlIlIlIIlll.length;
        byte lllllllllllllIIIIIIIlIlIlIlIIlIl = (byte)ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[0];
        while (lllllIllllIIlII(lllllllllllllIIIIIIIlIlIlIlIIlIl, lllllllllllllIIIIIIIlIlIlIlIIllI)) {
            final char lllllllllllllIIIIIIIlIlIlIllIIlI = lllllllllllllIIIIIIIlIlIlIlIIlll[lllllllllllllIIIIIIIlIlIlIlIIlIl];
            lllllllllllllIIIIIIIlIlIlIlIllll.append((char)(lllllllllllllIIIIIIIlIlIlIllIIlI ^ lllllllllllllIIIIIIIlIlIlIlIlllI[lllllllllllllIIIIIIIlIlIlIlIllIl % lllllllllllllIIIIIIIlIlIlIlIlllI.length]));
            "".length();
            ++lllllllllllllIIIIIIIlIlIlIlIllIl;
            ++lllllllllllllIIIIIIIlIlIlIlIIlIl;
            "".length();
            if (((0x9A ^ 0xA7) & ~(0x50 ^ 0x6D)) >= (0x22 ^ 0x26)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIlIlIlIlIllll);
    }
    
    @Override
    protected byte _getByte(final int lllllllllllllIIIIIIIlIlllIlllIlI) {
        return this.buffer.get(lllllllllllllIIIIIIIlIlllIlllIlI);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIIlIllIIlIIIIl, final OutputStream lllllllllllllIIIIIIIlIllIIlIIlII, final int lllllllllllllIIIIIIIlIllIIlIIIll) throws IOException {
        this.ensureAccessible();
        if (lllllIlllIlllll(lllllllllllllIIIIIIIlIllIIlIIIll)) {
            return this;
        }
        if (lllllIllllIIIIl(this.buffer.hasArray() ? 1 : 0)) {
            lllllllllllllIIIIIIIlIllIIlIIlII.write(this.buffer.array(), lllllllllllllIIIIIIIlIllIIlIIIIl + this.buffer.arrayOffset(), lllllllllllllIIIIIIIlIllIIlIIIll);
            "".length();
            if (" ".length() < ((0x57 ^ 0x2) & ~(0xCD ^ 0x98))) {
                return null;
            }
        }
        else {
            final byte[] lllllllllllllIIIIIIIlIllIIlIlIII = new byte[lllllllllllllIIIIIIIlIllIIlIIIll];
            final ByteBuffer lllllllllllllIIIIIIIlIllIIlIIlll = this.internalNioBuffer();
            lllllllllllllIIIIIIIlIllIIlIIlll.clear().position(lllllllllllllIIIIIIIlIllIIlIIIIl);
            "".length();
            lllllllllllllIIIIIIIlIllIIlIIlll.get(lllllllllllllIIIIIIIlIllIIlIlIII);
            "".length();
            lllllllllllllIIIIIIIlIllIIlIIlII.write(lllllllllllllIIIIIIIlIllIIlIlIII);
        }
        return this;
    }
    
    @Override
    protected void _setInt(final int lllllllllllllIIIIIIIlIllIlIIIIII, final int lllllllllllllIIIIIIIlIllIIllllll) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    protected void _setShort(final int lllllllllllllIIIIIIIlIllIlIIIllI, final int lllllllllllllIIIIIIIlIllIlIIIlIl) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public int getUnsignedMedium(final int lllllllllllllIIIIIIIlIlllIlIlIII) {
        this.ensureAccessible();
        return this._getUnsignedMedium(lllllllllllllIIIIIIIlIlllIlIlIII);
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[0] != 0;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIIIIlIllIIIIIlll, final byte[] lllllllllllllIIIIIIIlIllIIIIIllI, final int lllllllllllllIIIIIIIlIllIIIIIlIl, final int lllllllllllllIIIIIIIlIllIIIIIlII) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public byte[] array() {
        return this.buffer.array();
    }
    
    @Override
    protected void deallocate() {
    }
    
    @Override
    public boolean isDirect() {
        return this.buffer.isDirect();
    }
    
    private static boolean lllllIllllIIllI(final int lllllllllllllIIIIIIIlIlIlIIlIIII, final int lllllllllllllIIIIIIIlIlIlIIIllll) {
        return lllllllllllllIIIIIIIlIlIlIIlIIII > lllllllllllllIIIIIIIlIlIlIIIllll;
    }
    
    private static boolean lllllIllllIIlIl(final int lllllllllllllIIIIIIIlIlIlIIIIlll) {
        return lllllllllllllIIIIIIIlIlIlIIIIlll >= 0;
    }
    
    private static boolean lllllIllllIIIIl(final int lllllllllllllIIIIIIIlIlIlIIIlIll) {
        return lllllllllllllIIIIIIIlIlIlIIIlIll != 0;
    }
    
    @Override
    public int nioBufferCount() {
        return ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[3];
    }
    
    @Override
    public ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }
    
    private static boolean lllllIllllIIlll(final Object lllllllllllllIIIIIIIlIlIlIIIllIl) {
        return lllllllllllllIIIIIIIlIlIlIIIllIl == null;
    }
    
    @Override
    public ByteBuf getBytes(int lllllllllllllIIIIIIIlIllIlllIlII, final ByteBuf lllllllllllllIIIIIIIlIllIlllIIll, final int lllllllllllllIIIIIIIlIllIlllIIlI, final int lllllllllllllIIIIIIIlIllIlllIllI) {
        this.checkDstIndex(lllllllllllllIIIIIIIlIllIlllIlII, lllllllllllllIIIIIIIlIllIlllIllI, lllllllllllllIIIIIIIlIllIlllIIlI, lllllllllllllIIIIIIIlIllIlllIIll.capacity());
        if (lllllIllllIIIIl(lllllllllllllIIIIIIIlIllIlllIIll.hasArray() ? 1 : 0)) {
            this.getBytes(lllllllllllllIIIIIIIlIllIlllIlII, lllllllllllllIIIIIIIlIllIlllIIll.array(), lllllllllllllIIIIIIIlIllIlllIIll.arrayOffset() + lllllllllllllIIIIIIIlIllIlllIIlI, lllllllllllllIIIIIIIlIllIlllIllI);
            "".length();
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        else if (lllllIllllIIIll(lllllllllllllIIIIIIIlIllIlllIIll.nioBufferCount())) {
            final ByteBuffer[] lllllllllllllIIIIIIIlIllIlllllIl = lllllllllllllIIIIIIIlIllIlllIIll.nioBuffers(lllllllllllllIIIIIIIlIllIlllIIlI, lllllllllllllIIIIIIIlIllIlllIllI);
            final int lllllllllllllIIIIIIIlIllIlllllII = lllllllllllllIIIIIIIlIllIlllllIl.length;
            int lllllllllllllIIIIIIIlIllIllllIll = ReadOnlyByteBufferBuf.lIllIlIIIIIIlI[0];
            while (lllllIllllIIlII(lllllllllllllIIIIIIIlIllIllllIll, lllllllllllllIIIIIIIlIllIlllllII)) {
                final ByteBuffer lllllllllllllIIIIIIIlIllIllllllI = lllllllllllllIIIIIIIlIllIlllllIl[lllllllllllllIIIIIIIlIllIllllIll];
                final int lllllllllllllIIIIIIIlIllIlllllll = lllllllllllllIIIIIIIlIllIllllllI.remaining();
                this.getBytes(lllllllllllllIIIIIIIlIllIlllIlII, lllllllllllllIIIIIIIlIllIllllllI);
                "".length();
                lllllllllllllIIIIIIIlIllIlllIlII += lllllllllllllIIIIIIIlIllIlllllll;
                ++lllllllllllllIIIIIIIlIllIllllIll;
                "".length();
                if (-" ".length() > " ".length()) {
                    return null;
                }
            }
            "".length();
            if (-" ".length() > " ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIIIIIIIlIllIlllIIll.setBytes(lllllllllllllIIIIIIIlIllIlllIIlI, this, lllllllllllllIIIIIIIlIllIlllIlII, lllllllllllllIIIIIIIlIllIlllIllI);
            "".length();
        }
        return this;
    }
}
