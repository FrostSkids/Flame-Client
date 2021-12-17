// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.internal.StringUtil;
import io.netty.util.internal.EmptyArrays;
import java.nio.channels.GatheringByteChannel;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.ReferenceCounted;
import java.nio.charset.Charset;
import java.nio.ReadOnlyBufferException;
import io.netty.util.internal.PlatformDependent;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class EmptyByteBuf extends ByteBuf
{
    private final /* synthetic */ ByteOrder order;
    private final /* synthetic */ ByteBufAllocator alloc;
    private static final /* synthetic */ ByteBuffer EMPTY_BYTE_BUFFER;
    private final /* synthetic */ String str;
    private static final /* synthetic */ long EMPTY_BYTE_BUFFER_ADDRESS;
    private static final /* synthetic */ int[] llIlIIIIIlIlll;
    private /* synthetic */ EmptyByteBuf swapped;
    private static final /* synthetic */ String[] llIlIIIIIlIlIl;
    
    @Override
    public ByteBuf copy() {
        return this;
    }
    
    @Override
    public int maxWritableBytes() {
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public long readUnsignedInt() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int writeBytes(final ScatteringByteChannel llllllllllllIllIllIllIlIllIlIlIl, final int llllllllllllIllIllIllIlIllIlIlII) {
        this.checkLength(llllllllllllIllIllIllIlIllIlIlII);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public int indexOf(final int llllllllllllIllIllIllIlIllIIIIll, final int llllllllllllIllIllIllIlIllIIIllI, final byte llllllllllllIllIllIllIlIllIIIlIl) {
        this.checkIndex(llllllllllllIllIllIllIlIllIIIIll);
        "".length();
        this.checkIndex(llllllllllllIllIllIllIlIllIIIllI);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[8];
    }
    
    @Override
    public long getUnsignedInt(final int llllllllllllIllIllIlllIIlIIIIlll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream llllllllllllIllIllIllIllIIlIIlll, final int llllllllllllIllIllIllIllIIlIIlII) {
        return this.checkLength(llllllllllllIllIllIllIllIIlIIlII);
    }
    
    @Override
    public ByteBuf setZero(final int llllllllllllIllIllIllIllIllIlllI, final int llllllllllllIllIllIllIllIllIllIl) {
        return this.checkIndex(llllllllllllIllIllIllIllIllIlllI, llllllllllllIllIllIllIllIllIllIl);
    }
    
    @Override
    public int readMedium() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuffer llllllllllllIllIllIllIlIlllIIIII) {
        return this.checkLength(llllllllllllIllIllIllIlIlllIIIII.remaining());
    }
    
    @Override
    public int setBytes(final int llllllllllllIllIllIllIlllIIlIIIl, final InputStream llllllllllllIllIllIllIlllIIIllll, final int llllllllllllIllIllIllIlllIIIlIlI) {
        this.checkIndex(llllllllllllIllIllIllIlllIIlIIIl, llllllllllllIllIllIllIlllIIIlIlI);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    static {
        lIIlIIIlIIlIlllI();
        lIIlIIIlIIlIlIIl();
        EMPTY_BYTE_BUFFER = ByteBuffer.allocateDirect(EmptyByteBuf.llIlIIIIIlIlll[0]);
        long llllllllllllIllIllIllIlIIIIIllII = 0L;
        try {
            if (lIIlIIIlIIllIIll(PlatformDependent.hasUnsafe() ? 1 : 0)) {
                llllllllllllIllIllIllIlIIIIIllII = PlatformDependent.directBufferAddress(EmptyByteBuf.EMPTY_BYTE_BUFFER);
            }
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        catch (Throwable t) {}
        EMPTY_BYTE_BUFFER_ADDRESS = llllllllllllIllIllIllIlIIIIIllII;
    }
    
    @Override
    public ByteBuf capacity(final int llllllllllllIllIllIlllIIlllIIlll) {
        throw new ReadOnlyBufferException();
    }
    
    @Override
    public int setBytes(final int llllllllllllIllIllIllIllIlllllIl, final ScatteringByteChannel llllllllllllIllIllIllIlllIIIIIIl, final int llllllllllllIllIllIllIlllIIIIIII) {
        this.checkIndex(llllllllllllIllIllIllIllIlllllIl, llllllllllllIllIllIllIlllIIIIIII);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public ByteBuf unwrap() {
        return null;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIllIllIllllIIlIll, final ByteBuf llllllllllllIllIllIllIllllIlIIlI, final int llllllllllllIllIllIllIllllIlIIIl, final int llllllllllllIllIllIllIllllIIllll) {
        return this.checkIndex(llllllllllllIllIllIllIllllIIlIll, llllllllllllIllIllIllIllllIIllll);
    }
    
    @Override
    public int readInt() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf writeLong(final long llllllllllllIllIllIllIllIIIIlIll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf writeZero(final int llllllllllllIllIllIllIlIllIIllII) {
        return this.checkLength(llllllllllllIllIllIllIlIllIIllII);
    }
    
    @Override
    public short getShort(final int llllllllllllIllIllIlllIIlIIlIIIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuffer nioBuffer() {
        return EmptyByteBuf.EMPTY_BYTE_BUFFER;
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.alloc;
    }
    
    @Override
    public ByteBuf setLong(final int llllllllllllIllIllIllIlllllllllI, final long llllllllllllIllIllIllIllllllllII) {
        throw new IndexOutOfBoundsException();
    }
    
    private static boolean lIIlIIIlIIllIIII(final Object llllllllllllIllIllIllIIlllIlIIIl, final Object llllllllllllIllIllIllIIlllIlIIII) {
        return llllllllllllIllIllIllIIlllIlIIIl == llllllllllllIllIllIllIIlllIlIIII;
    }
    
    @Override
    public boolean isReadable() {
        return EmptyByteBuf.llIlIIIIIlIlll[0] != 0;
    }
    
    @Override
    public String toString(final Charset llllllllllllIllIllIllIlIIlIllIll) {
        return EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[9]];
    }
    
    @Override
    public ByteBuf writeFloat(final float llllllllllllIllIllIllIllIIIIIlll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIllIllIlllIlIIIIl, final ByteBuffer llllllllllllIllIllIllIlllIlIIIII) {
        return this.checkIndex(llllllllllllIllIllIllIlllIlIIIIl, llllllllllllIllIllIllIlllIlIIIII.remaining());
    }
    
    @Override
    public int writerIndex() {
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public ByteBuf setDouble(final int llllllllllllIllIllIllIllllllIIlI, final double llllllllllllIllIllIllIllllllIIIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf writeDouble(final double llllllllllllIllIllIllIllIIIIIlIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf writeByte(final int llllllllllllIllIllIllIllIIIlIIll) {
        throw new IndexOutOfBoundsException();
    }
    
    private static boolean lIIlIIIlIIllIIIl(final Object llllllllllllIllIllIllIIlllIIlllI) {
        return llllllllllllIllIllIllIIlllIIlllI != null;
    }
    
    @Override
    public ByteBuf retain() {
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final byte[] llllllllllllIllIllIllIllIIlllIll) {
        return this.checkLength(llllllllllllIllIllIllIllIIlllIll.length);
    }
    
    @Override
    public ByteBuf writeShort(final int llllllllllllIllIllIllIllIIIlIIIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int getMedium(final int llllllllllllIllIllIlllIIlIIIllIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIllIlllIIIlIIllIl, final byte[] llllllllllllIllIllIlllIIIlIlIIlI, final int llllllllllllIllIllIlllIIIlIlIIIl, final int llllllllllllIllIllIlllIIIlIlIIII) {
        return this.checkIndex(llllllllllllIllIllIlllIIIlIIllIl, llllllllllllIllIllIlllIIIlIlIIII);
    }
    
    @Override
    public short getUnsignedByte(final int llllllllllllIllIllIlllIIlIIlIIll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public boolean isReadable(final int llllllllllllIllIllIllIlIIlIIIIIl) {
        return EmptyByteBuf.llIlIIIIIlIlll[0] != 0;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIllIlllIIIllIllIl, final ByteBuf llllllllllllIllIllIlllIIIlllIIII, final int llllllllllllIllIllIlllIIIllIllll) {
        return this.checkIndex(llllllllllllIllIllIlllIIIllIllIl, llllllllllllIllIllIlllIIIllIllll);
    }
    
    @Override
    public boolean isDirect() {
        return EmptyByteBuf.llIlIIIIIlIlll[1] != 0;
    }
    
    @Override
    public int refCnt() {
        return EmptyByteBuf.llIlIIIIIlIlll[1];
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIllIlllIIIllIIlll, final ByteBuf llllllllllllIllIllIlllIIIllIIllI, final int llllllllllllIllIllIlllIIIllIIlIl, final int llllllllllllIllIllIlllIIIllIIlII) {
        return this.checkIndex(llllllllllllIllIllIlllIIIllIIlll, llllllllllllIllIllIlllIIIllIIlII);
    }
    
    @Override
    public ByteBuf readBytes(final int llllllllllllIllIllIllIllIlIllIlI) {
        return this.checkLength(llllllllllllIllIllIllIllIlIllIlI);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIllIlllIIIllllIlI, final ByteBuf llllllllllllIllIllIlllIIIllllIIl) {
        return this.checkIndex(llllllllllllIllIllIlllIIIllllIlI, llllllllllllIllIllIlllIIIllllIIl.writableBytes());
    }
    
    private static boolean lIIlIIIlIIllIllI(final int llllllllllllIllIllIllIIlllIlIlIl, final int llllllllllllIllIllIllIIlllIlIlII) {
        return llllllllllllIllIllIllIIlllIlIlIl < llllllllllllIllIllIllIIlllIlIlII;
    }
    
    @Override
    public ByteBuf ensureWritable(final int llllllllllllIllIllIlllIIlIIllllI) {
        if (lIIlIIIlIIllIIlI(llllllllllllIllIllIlllIIlIIllllI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[4]]).append(llllllllllllIllIllIlllIIlIIllllI).append(EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[5]])));
        }
        if (lIIlIIIlIIllIIll(llllllllllllIllIllIlllIIlIIllllI)) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }
    
    @Override
    public ByteBuf slice() {
        return this;
    }
    
    @Override
    public char getChar(final int llllllllllllIllIllIlllIIlIIIIIll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf order(final ByteOrder llllllllllllIllIllIlllIIllIlIllI) {
        if (lIIlIIIlIIlIllll(llllllllllllIllIllIlllIIllIlIllI)) {
            throw new NullPointerException(EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[3]]);
        }
        if (lIIlIIIlIIllIIII(llllllllllllIllIllIlllIIllIlIllI, this.order())) {
            return this;
        }
        EmptyByteBuf llllllllllllIllIllIlllIIllIllIII = this.swapped;
        if (lIIlIIIlIIllIIIl(llllllllllllIllIllIlllIIllIllIII)) {
            return llllllllllllIllIllIlllIIllIllIII;
        }
        llllllllllllIllIllIlllIIllIllIII = (this.swapped = new EmptyByteBuf(this.alloc(), llllllllllllIllIllIlllIIllIlIllI));
        return llllllllllllIllIllIlllIIllIllIII;
    }
    
    @Override
    public ByteBuf setChar(final int llllllllllllIllIllIllIlllllllIII, final int llllllllllllIllIllIllIllllllIlll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf slice(final int llllllllllllIllIllIllIlIlIIIIIll, final int llllllllllllIllIllIllIlIIlllllll) {
        return this.checkIndex(llllllllllllIllIllIllIlIlIIIIIll, llllllllllllIllIllIllIlIIlllllll);
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        return this;
    }
    
    private static String lIIlIIIlIIlIIllI(final String llllllllllllIllIllIllIlIIIIIIIII, final String llllllllllllIllIllIllIlIIIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIllIlIIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIllIlIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), EmptyByteBuf.llIlIIIIIlIlll[9]), "DES");
            final Cipher llllllllllllIllIllIllIlIIIIIIlII = Cipher.getInstance("DES");
            llllllllllllIllIllIllIlIIIIIIlII.init(EmptyByteBuf.llIlIIIIIlIlll[2], llllllllllllIllIllIllIlIIIIIIlIl);
            return new String(llllllllllllIllIllIllIlIIIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIllIlIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIllIlIIIIIIIll) {
            llllllllllllIllIllIllIlIIIIIIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf setMedium(final int llllllllllllIllIllIlllIIIIIIlIIl, final int llllllllllllIllIllIlllIIIIIIlIII) {
        throw new IndexOutOfBoundsException();
    }
    
    private ByteBuf checkIndex(final int llllllllllllIllIllIllIlIIIlIlIIl, final int llllllllllllIllIllIllIlIIIlIlIII) {
        if (lIIlIIIlIIllIIlI(llllllllllllIllIllIllIlIIIlIlIII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[10]]).append(llllllllllllIllIllIllIlIIIlIlIII)));
        }
        if (!lIIlIIIlIIllIlII(llllllllllllIllIllIllIlIIIlIlIIl) || lIIlIIIlIIllIIll(llllllllllllIllIllIllIlIIIlIlIII)) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }
    
    @Override
    public int bytesBefore(final int llllllllllllIllIllIllIlIlIllllII, final byte llllllllllllIllIllIllIlIlIlllIll) {
        this.checkLength(llllllllllllIllIllIllIlIlIllllII);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[8];
    }
    
    @Override
    public int readableBytes() {
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public ByteBuf setInt(final int llllllllllllIllIllIlllIIIIIIIIll, final int llllllllllllIllIllIlllIIIIIIIIlI) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int getBytes(final int llllllllllllIllIllIlllIIIIIlllIl, final GatheringByteChannel llllllllllllIllIllIlllIIIIlIIIlI, final int llllllllllllIllIllIlllIIIIIllIll) {
        this.checkIndex(llllllllllllIllIllIlllIIIIIlllIl, llllllllllllIllIllIlllIIIIIllIll);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIllIllIllIllIlIIlllI) {
        return this.checkLength(llllllllllllIllIllIllIllIlIIlllI.writableBytes());
    }
    
    @Override
    public float readFloat() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public boolean hasArray() {
        return EmptyByteBuf.llIlIIIIIlIlll[1] != 0;
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIllIllIllIlIlllllIII, final int llllllllllllIllIllIllIlIllllIlll, final int llllllllllllIllIllIllIlIllllIllI) {
        return this.checkLength(llllllllllllIllIllIllIlIllllIllI);
    }
    
    @Override
    public int getUnsignedShort(final int llllllllllllIllIllIlllIIlIIIllll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public String toString(final int llllllllllllIllIllIllIlIIlIlIIIl, final int llllllllllllIllIllIllIlIIlIlIlII, final Charset llllllllllllIllIllIllIlIIlIlIIll) {
        this.checkIndex(llllllllllllIllIllIllIlIIlIlIIIl, llllllllllllIllIllIllIlIIlIlIlII);
        "".length();
        return this.toString(llllllllllllIllIllIllIlIIlIlIIll);
    }
    
    private static void lIIlIIIlIIlIlllI() {
        (llIlIIIIIlIlll = new int[14])[0] = ((0x58 ^ 0x5D ^ (0x7 ^ 0x35)) & (0xCA ^ 0xB3 ^ (0x12 ^ 0x5C) ^ -" ".length()) & (((0x69 ^ 0x62 ^ (0x7B ^ 0x22)) & (0x5B ^ 0x34 ^ (0x7E ^ 0x43) ^ -" ".length())) ^ -" ".length()));
        EmptyByteBuf.llIlIIIIIlIlll[1] = " ".length();
        EmptyByteBuf.llIlIIIIIlIlll[2] = "  ".length();
        EmptyByteBuf.llIlIIIIIlIlll[3] = "   ".length();
        EmptyByteBuf.llIlIIIIIlIlll[4] = (133 + 156 - 264 + 140 ^ 132 + 88 - 83 + 24);
        EmptyByteBuf.llIlIIIIIlIlll[5] = (0x2A ^ 0x2F);
        EmptyByteBuf.llIlIIIIIlIlll[6] = (0x60 ^ 0x66);
        EmptyByteBuf.llIlIIIIIlIlll[7] = (0x6A ^ 0x6D);
        EmptyByteBuf.llIlIIIIIlIlll[8] = -" ".length();
        EmptyByteBuf.llIlIIIIIlIlll[9] = (0x6 ^ 0xC ^ "  ".length());
        EmptyByteBuf.llIlIIIIIlIlll[10] = (0x3A ^ 0x33);
        EmptyByteBuf.llIlIIIIIlIlll[11] = (0xCD ^ 0xB5 ^ (0x69 ^ 0x1B));
        EmptyByteBuf.llIlIIIIIlIlll[12] = (0x12 ^ 0x19);
        EmptyByteBuf.llIlIIIIIlIlll[13] = (84 + 10 - 40 + 76 ^ 132 + 118 - 111 + 3);
    }
    
    private static String lIIlIIIlIIlIIlll(String llllllllllllIllIllIllIIlllllIIlI, final String llllllllllllIllIllIllIIllllIllII) {
        llllllllllllIllIllIllIIlllllIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIllIllIIlllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIllIIlllllIIII = new StringBuilder();
        final char[] llllllllllllIllIllIllIIllllIllll = llllllllllllIllIllIllIIllllIllII.toCharArray();
        int llllllllllllIllIllIllIIllllIlllI = EmptyByteBuf.llIlIIIIIlIlll[0];
        final boolean llllllllllllIllIllIllIIllllIlIII = (Object)llllllllllllIllIllIllIIlllllIIlI.toCharArray();
        final byte llllllllllllIllIllIllIIllllIIlll = (byte)llllllllllllIllIllIllIIllllIlIII.length;
        short llllllllllllIllIllIllIIllllIIllI = (short)EmptyByteBuf.llIlIIIIIlIlll[0];
        while (lIIlIIIlIIllIllI(llllllllllllIllIllIllIIllllIIllI, llllllllllllIllIllIllIIllllIIlll)) {
            final char llllllllllllIllIllIllIIlllllIIll = llllllllllllIllIllIllIIllllIlIII[llllllllllllIllIllIllIIllllIIllI];
            llllllllllllIllIllIllIIlllllIIII.append((char)(llllllllllllIllIllIllIIlllllIIll ^ llllllllllllIllIllIllIIllllIllll[llllllllllllIllIllIllIIllllIlllI % llllllllllllIllIllIllIIllllIllll.length]));
            "".length();
            ++llllllllllllIllIllIllIIllllIlllI;
            ++llllllllllllIllIllIllIIllllIIllI;
            "".length();
            if ((0xBE ^ 0xBA) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIllIIlllllIIII);
    }
    
    @Override
    public int writeBytes(final InputStream llllllllllllIllIllIllIlIllIlllII, final int llllllllllllIllIllIllIlIllIllIIl) {
        this.checkLength(llllllllllllIllIllIllIlIllIllIIl);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public ByteBuf skipBytes(final int llllllllllllIllIllIllIllIIIllIIl) {
        return this.checkLength(llllllllllllIllIllIllIllIIIllIIl);
    }
    
    @Override
    public byte[] array() {
        return EmptyArrays.EMPTY_BYTES;
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int llllllllllllIllIllIllIlIIllIIlIl, final int llllllllllllIllIllIllIlIIllIIlII) {
        return EmptyByteBuf.EMPTY_BYTE_BUFFER;
    }
    
    private ByteBuf checkIndex(final int llllllllllllIllIllIllIlIIIlIlllI) {
        if (lIIlIIIlIIllIIll(llllllllllllIllIllIllIlIIIlIlllI)) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }
    
    @Override
    public int readUnsignedMedium() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int bytesBefore(final byte llllllllllllIllIllIllIlIllIIIIII) {
        return EmptyByteBuf.llIlIIIIIlIlll[8];
    }
    
    @Override
    public boolean release() {
        return EmptyByteBuf.llIlIIIIIlIlll[0] != 0;
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int llllllllllllIllIllIllIlIIllIlIII, final int llllllllllllIllIllIllIlIIllIIlll) {
        this.checkIndex(llllllllllllIllIllIllIlIIllIlIII, llllllllllllIllIllIllIlIIllIIlll);
        "".length();
        return this.nioBuffers();
    }
    
    @Override
    public int maxCapacity() {
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public long getLong(final int llllllllllllIllIllIlllIIlIIIIlIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf writeMedium(final int llllllllllllIllIllIllIllIIIIllll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public boolean equals(final Object llllllllllllIllIllIllIlIIlIIlIll) {
        int n;
        if (lIIlIIIlIIllIIll((llllllllllllIllIllIllIlIIlIIlIll instanceof ByteBuf) ? 1 : 0) && lIIlIIIlIIllIlII(((ByteBuf)llllllllllllIllIllIllIlIIlIIlIll).isReadable() ? 1 : 0)) {
            n = EmptyByteBuf.llIlIIIIIlIlll[1];
            "".length();
            if (-" ".length() >= 0) {
                return ((0x79 ^ 0x45 ^ (0x86 ^ 0xB3)) & (0xDE ^ 0xB4 ^ (0x60 ^ 0x3) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EmptyByteBuf.llIlIIIIIlIlll[0];
        }
        return n != 0;
    }
    
    @Override
    public ByteBuf duplicate() {
        return this;
    }
    
    @Override
    public ByteBuf markReaderIndex() {
        return this;
    }
    
    @Override
    public String toString() {
        return this.str;
    }
    
    @Override
    public ByteBuffer nioBuffer(final int llllllllllllIllIllIllIlIIlllIlIl, final int llllllllllllIllIllIllIlIIlllIlII) {
        this.checkIndex(llllllllllllIllIllIllIlIIlllIlIl, llllllllllllIllIllIllIlIIlllIlII);
        "".length();
        return this.nioBuffer();
    }
    
    @Override
    public float getFloat(final int llllllllllllIllIllIlllIIlIIIIIIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIllIllIllIllIlIIlIlI, final int llllllllllllIllIllIllIllIlIIIlll) {
        return this.checkLength(llllllllllllIllIllIllIllIlIIIlll);
    }
    
    @Override
    public int forEachByteDesc(final ByteBufProcessor llllllllllllIllIllIllIlIlIlIIIIl) {
        return EmptyByteBuf.llIlIIIIIlIlll[8];
    }
    
    @Override
    public boolean isWritable() {
        return EmptyByteBuf.llIlIIIIIlIlll[0] != 0;
    }
    
    private static boolean lIIlIIIlIIllIIll(final int llllllllllllIllIllIllIIlllIIlIlI) {
        return llllllllllllIllIllIllIIlllIIlIlI != 0;
    }
    
    @Override
    public int getUnsignedMedium(final int llllllllllllIllIllIlllIIlIIIlIll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public char readChar() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int hashCode() {
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public ByteBuf retain(final int llllllllllllIllIllIllIlIIIlllIII) {
        return this;
    }
    
    @Override
    public ByteBuf writeBoolean(final boolean llllllllllllIllIllIllIllIIIlIlIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIllIllIllIlIllllllll, final int llllllllllllIllIllIllIlIllllllII) {
        return this.checkLength(llllllllllllIllIllIllIlIllllllII);
    }
    
    private ByteBuf checkLength(final int llllllllllllIllIllIllIlIIIlIIIIl) {
        if (lIIlIIIlIIllIIlI(llllllllllllIllIllIllIlIIIlIIIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[11]]).append(llllllllllllIllIllIllIlIIIlIIIIl).append(EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[12]])));
        }
        if (lIIlIIIlIIllIIll(llllllllllllIllIllIllIlIIIlIIIIl)) {
            throw new IndexOutOfBoundsException();
        }
        return this;
    }
    
    @Override
    public int forEachByteDesc(final int llllllllllllIllIllIllIlIlIIllIII, final int llllllllllllIllIllIllIlIlIIlIlll, final ByteBufProcessor llllllllllllIllIllIllIlIlIIllIlI) {
        this.checkIndex(llllllllllllIllIllIllIlIlIIllIII, llllllllllllIllIllIllIlIlIIlIlll);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[8];
    }
    
    @Override
    public long memoryAddress() {
        if (lIIlIIIlIIllIIll(this.hasMemoryAddress() ? 1 : 0)) {
            return EmptyByteBuf.EMPTY_BYTE_BUFFER_ADDRESS;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public int forEachByte(final int llllllllllllIllIllIllIlIlIlIlIII, final int llllllllllllIllIllIllIlIlIlIIlll, final ByteBufProcessor llllllllllllIllIllIllIlIlIlIIllI) {
        this.checkIndex(llllllllllllIllIllIllIlIlIlIlIII, llllllllllllIllIllIllIlIlIlIIlll);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[8];
    }
    
    @Override
    public int readUnsignedShort() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf markWriterIndex() {
        return this;
    }
    
    @Override
    public ByteBuf readerIndex(final int llllllllllllIllIllIlllIIllIIlllI) {
        return this.checkIndex(llllllllllllIllIllIlllIIllIIlllI);
    }
    
    @Override
    public int arrayOffset() {
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public short readShort() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int writableBytes() {
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public ByteBuf setShort(final int llllllllllllIllIllIlllIIIIIIlllI, final int llllllllllllIllIllIlllIIIIIIllII) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] llllllllllllIllIllIllIlIlllIlIlI, final int llllllllllllIllIllIllIlIlllIlIIl, final int llllllllllllIllIllIllIlIlllIlIII) {
        return this.checkLength(llllllllllllIllIllIllIlIlllIlIII);
    }
    
    @Override
    public int getInt(final int llllllllllllIllIllIlllIIlIIIlIIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIllIllIlllIlllllI, final byte[] llllllllllllIllIllIllIlllIllllIl) {
        return this.checkIndex(llllllllllllIllIllIllIlllIlllllI, llllllllllllIllIllIllIlllIllllIl.length);
    }
    
    @Override
    public ByteBuf resetReaderIndex() {
        return this;
    }
    
    @Override
    public ByteBuf setByte(final int llllllllllllIllIllIlllIIIIIlIIll, final int llllllllllllIllIllIlllIIIIIlIIIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer llllllllllllIllIllIllIllIIlIlIll) {
        return this.checkLength(llllllllllllIllIllIllIllIIlIlIll.remaining());
    }
    
    @Override
    public ByteBuf writerIndex(final int llllllllllllIllIllIlllIIllIIIlll) {
        return this.checkIndex(llllllllllllIllIllIlllIIllIIIlll);
    }
    
    @Override
    public boolean getBoolean(final int llllllllllllIllIllIlllIIlIIlIlll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf resetWriterIndex() {
        return this;
    }
    
    @Override
    public ByteBuf writeInt(final int llllllllllllIllIllIllIllIIIIllIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIllIllIlllllIllll, final ByteBuf llllllllllllIllIllIllIlllllIlllI) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int nioBufferCount() {
        return EmptyByteBuf.llIlIIIIIlIlll[1];
    }
    
    public EmptyByteBuf(final ByteBufAllocator llllllllllllIllIllIlllIIllllIlIl) {
        this(llllllllllllIllIllIlllIIllllIlIl, ByteOrder.BIG_ENDIAN);
    }
    
    @Override
    public ByteBuf writeChar(final int llllllllllllIllIllIllIllIIIIlIIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] llllllllllllIllIllIllIlIllllIIII) {
        return this.checkLength(llllllllllllIllIllIllIlIllllIIII.length);
    }
    
    @Override
    public byte getByte(final int llllllllllllIllIllIlllIIlIIlIlIl) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int capacity() {
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public int ensureWritable(final int llllllllllllIllIllIlllIIlIIllIll, final boolean llllllllllllIllIllIlllIIlIIllIlI) {
        if (lIIlIIIlIIllIIlI(llllllllllllIllIllIlllIIlIIllIll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[6]]).append(llllllllllllIllIllIlllIIlIIllIll).append(EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[7]])));
        }
        if (lIIlIIIlIIllIlII(llllllllllllIllIllIlllIIlIIllIll)) {
            return EmptyByteBuf.llIlIIIIIlIlll[0];
        }
        return EmptyByteBuf.llIlIIIIIlIlll[1];
    }
    
    @Override
    public ByteBuf setFloat(final int llllllllllllIllIllIllIllllllIlIl, final float llllllllllllIllIllIllIllllllIlII) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf setIndex(final int llllllllllllIllIllIlllIIlIllllll, final int llllllllllllIllIllIlllIIlIlllllI) {
        this.checkIndex(llllllllllllIllIllIlllIIlIllllll);
        "".length();
        this.checkIndex(llllllllllllIllIllIlllIIlIlllllI);
        "".length();
        return this;
    }
    
    @Override
    public int readBytes(final GatheringByteChannel llllllllllllIllIllIllIllIIlIIIII, final int llllllllllllIllIllIllIllIIIlllll) {
        this.checkLength(llllllllllllIllIllIllIllIIIlllll);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public ByteBuf readSlice(final int llllllllllllIllIllIllIllIlIlIlII) {
        return this.checkLength(llllllllllllIllIllIllIllIlIlIlII);
    }
    
    private static String lIIlIIIlIIlIlIII(final String llllllllllllIllIllIllIIlllIlllIl, final String llllllllllllIllIllIllIIlllIlllII) {
        try {
            final SecretKeySpec llllllllllllIllIllIllIIllllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIllIIlllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIllIIlllIlllll = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIllIIlllIlllll.init(EmptyByteBuf.llIlIIIIIlIlll[2], llllllllllllIllIllIllIIllllIIIII);
            return new String(llllllllllllIllIllIllIIlllIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIllIIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIllIIlllIllllI) {
            llllllllllllIllIllIllIIlllIllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIllIlllIIIIllllll, final ByteBuffer llllllllllllIllIllIlllIIIlIIIIlI) {
        return this.checkIndex(llllllllllllIllIllIlllIIIIllllll, llllllllllllIllIllIlllIIIlIIIIlI.remaining());
    }
    
    @Override
    public ByteOrder order() {
        return this.order;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIllIlllIIIIllIIIl, final OutputStream llllllllllllIllIllIlllIIIIllIllI, final int llllllllllllIllIllIlllIIIIllIlII) {
        return this.checkIndex(llllllllllllIllIllIlllIIIIllIIIl, llllllllllllIllIllIlllIIIIllIlII);
    }
    
    @Override
    public byte readByte() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf discardSomeReadBytes() {
        return this;
    }
    
    @Override
    public boolean isWritable(final int llllllllllllIllIllIllIlIIIllllll) {
        return EmptyByteBuf.llIlIIIIIlIlll[0] != 0;
    }
    
    private static boolean lIIlIIIlIIllIlII(final int llllllllllllIllIllIllIIlllIIlIII) {
        return llllllllllllIllIllIllIIlllIIlIII == 0;
    }
    
    private static void lIIlIIIlIIlIlIIl() {
        (llIlIIIIIlIlIl = new String[EmptyByteBuf.llIlIIIIIlIlll[13]])[EmptyByteBuf.llIlIIIIIlIlll[0]] = lIIlIIIlIIlIIllI("Okzs1S9cLDw=", "tkPgQ");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[1]] = lIIlIIIlIIlIIllI("auNQQfTPw+8=", "FeEhn");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[2]] = lIIlIIIlIIlIIlll("CxQ=", "GQhDU");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[3]] = lIIlIIIlIIlIlIII("ojr/LtCHilzRo/OsgiqOcQ==", "JSfrl");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[4]] = lIIlIIIlIIlIlIII("YrzQKGeBOg29xnOAnf8GCphuInDrsFMD", "LftBk");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[5]] = lIIlIIIlIIlIIllI("fyP8GMzNhoSAZuFlQVK52KHL+rL2qwlh", "xzPqu");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[6]] = lIIlIIIlIIlIIlll("Bw4hPB8DEy4JAQ8lNh8IGV1v", "jgOkm");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[7]] = lIIlIIIlIIlIlIII("Jyxu8VtvDSQM2hThu8Ib0xYAr/Aht8zt", "sJtDx");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[9]] = lIIlIIIlIIlIlIII("wbTMcMvLFYo=", "xfLvF");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[10]] = lIIlIIIlIIlIlIII("cQYfbDiz2XwWL4t5sj9QsQ==", "KXdSi");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[11]] = lIIlIIIlIIlIlIII("MrRO2Dl5Iwtb3l7sWcy9nQ==", "DVOdR");
        EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[12]] = lIIlIIIlIIlIlIII("MmP5HpDHw9U+G67aoWjCyneTOy5At5AL", "eUAzH");
    }
    
    @Override
    public ByteBuf setBoolean(final int llllllllllllIllIllIlllIIIIIllIII, final boolean llllllllllllIllIllIlllIIIIIlIlll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf readBytes(final byte[] llllllllllllIllIllIllIllIIllIlIl, final int llllllllllllIllIllIllIllIIllIlII, final int llllllllllllIllIllIllIllIIllIIll) {
        return this.checkLength(llllllllllllIllIllIllIllIIllIIll);
    }
    
    @Override
    public ByteBuf clear() {
        return this;
    }
    
    @Override
    public double readDouble() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIllIlllIIIlIllIIl, final byte[] llllllllllllIllIllIlllIIIlIllIll) {
        return this.checkIndex(llllllllllllIllIllIlllIIIlIllIIl, llllllllllllIllIllIlllIIIlIllIll.length);
    }
    
    @Override
    public long readLong() {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public int compareTo(final ByteBuf llllllllllllIllIllIllIlIIlIIIllI) {
        int n;
        if (lIIlIIIlIIllIIll(llllllllllllIllIllIllIlIIlIIIllI.isReadable() ? 1 : 0)) {
            n = EmptyByteBuf.llIlIIIIIlIlll[8];
            "".length();
            if ("   ".length() <= 0) {
                return (0x67 ^ 0x7D ^ (0x6D ^ 0x53)) & (75 + 53 - 13 + 14 ^ 24 + 151 - 135 + 125 ^ -" ".length());
            }
        }
        else {
            n = EmptyByteBuf.llIlIIIIIlIlll[0];
        }
        return n;
    }
    
    private EmptyByteBuf(final ByteBufAllocator llllllllllllIllIllIlllIIlllIlllI, final ByteOrder llllllllllllIllIllIlllIIlllIllIl) {
        if (lIIlIIIlIIlIllll(llllllllllllIllIllIlllIIlllIlllI)) {
            throw new NullPointerException(EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[0]]);
        }
        this.alloc = llllllllllllIllIllIlllIIlllIlllI;
        this.order = llllllllllllIllIllIlllIIlllIllIl;
        final StringBuilder append = new StringBuilder().append(StringUtil.simpleClassName(this));
        String str;
        if (lIIlIIIlIIllIIII(llllllllllllIllIllIlllIIlllIllIl, ByteOrder.BIG_ENDIAN)) {
            str = EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[1]];
            "".length();
            if ("  ".length() != "  ".length()) {
                throw null;
            }
        }
        else {
            str = EmptyByteBuf.llIlIIIIIlIlIl[EmptyByteBuf.llIlIIIIIlIlll[2]];
        }
        this.str = String.valueOf(append.append(str));
    }
    
    @Override
    public ByteBuf copy(final int llllllllllllIllIllIllIlIlIIIllII, final int llllllllllllIllIllIllIlIlIIIlIll) {
        return this.checkIndex(llllllllllllIllIllIllIlIlIIIllII, llllllllllllIllIllIllIlIlIIIlIll);
    }
    
    @Override
    public double getDouble(final int llllllllllllIllIllIlllIIIlllllll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public short readUnsignedByte() {
        throw new IndexOutOfBoundsException();
    }
    
    private static int lIIlIIIlIIllIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    @Override
    public int readerIndex() {
        return EmptyByteBuf.llIlIIIIIlIlll[0];
    }
    
    @Override
    public int forEachByte(final ByteBufProcessor llllllllllllIllIllIllIlIlIlIllIl) {
        return EmptyByteBuf.llIlIIIIIlIlll[8];
    }
    
    @Override
    public boolean release(final int llllllllllllIllIllIllIlIIIllIlII) {
        return EmptyByteBuf.llIlIIIIIlIlll[0] != 0;
    }
    
    @Override
    public int bytesBefore(final int llllllllllllIllIllIllIlIlIllIlII, final int llllllllllllIllIllIllIlIlIlIllll, final byte llllllllllllIllIllIllIlIlIllIIlI) {
        this.checkIndex(llllllllllllIllIllIllIlIlIllIlII, llllllllllllIllIllIllIlIlIlIllll);
        "".length();
        return EmptyByteBuf.llIlIIIIIlIlll[8];
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIllIllIlllIlIlIIl, final byte[] llllllllllllIllIllIllIlllIlIllIl, final int llllllllllllIllIllIllIlllIlIllII, final int llllllllllllIllIllIllIlllIlIlIll) {
        return this.checkIndex(llllllllllllIllIllIllIlllIlIlIIl, llllllllllllIllIllIllIlllIlIlIll);
    }
    
    @Override
    public boolean hasMemoryAddress() {
        int n;
        if (lIIlIIIlIIllIIll(lIIlIIIlIIllIlIl(EmptyByteBuf.EMPTY_BYTE_BUFFER_ADDRESS, 0L))) {
            n = EmptyByteBuf.llIlIIIIIlIlll[1];
            "".length();
            if (-" ".length() == "   ".length()) {
                return ((0x99 ^ 0x85 ^ (0xA0 ^ 0xAD)) & (156 + 6 + 12 + 6 ^ 102 + 3 - 80 + 140 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EmptyByteBuf.llIlIIIIIlIlll[0];
        }
        return n != 0;
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIllIllIllIllIIIIIIll) {
        throw new IndexOutOfBoundsException();
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIllIllIlllllIlIII, final ByteBuf llllllllllllIllIllIllIlllllIIlll, final int llllllllllllIllIllIllIlllllIIIII) {
        return this.checkIndex(llllllllllllIllIllIllIlllllIlIII, llllllllllllIllIllIllIlllllIIIII);
    }
    
    private static boolean lIIlIIIlIIllIIlI(final int llllllllllllIllIllIllIIlllIIIllI) {
        return llllllllllllIllIllIllIIlllIIIllI < 0;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIllIllIllIllIlIIIIll, final int llllllllllllIllIllIllIllIlIIIIlI, final int llllllllllllIllIllIllIllIlIIIIIl) {
        return this.checkLength(llllllllllllIllIllIllIllIlIIIIIl);
    }
    
    private static boolean lIIlIIIlIIlIllll(final Object llllllllllllIllIllIllIIlllIIllII) {
        return llllllllllllIllIllIllIIlllIIllII == null;
    }
    
    @Override
    public ByteBuffer[] nioBuffers() {
        final ByteBuffer[] array = new ByteBuffer[EmptyByteBuf.llIlIIIIIlIlll[1]];
        array[EmptyByteBuf.llIlIIIIIlIlll[0]] = EmptyByteBuf.EMPTY_BYTE_BUFFER;
        return array;
    }
    
    @Override
    public boolean readBoolean() {
        throw new IndexOutOfBoundsException();
    }
}
