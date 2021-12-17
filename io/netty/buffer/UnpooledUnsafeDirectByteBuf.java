// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.Buffer;
import java.io.OutputStream;
import java.io.InputStream;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ScatteringByteChannel;
import java.nio.ByteOrder;
import java.io.IOException;
import java.nio.channels.GatheringByteChannel;
import io.netty.util.internal.PlatformDependent;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;

public class UnpooledUnsafeDirectByteBuf extends AbstractReferenceCountedByteBuf
{
    private static final /* synthetic */ boolean NATIVE_ORDER;
    private /* synthetic */ ByteBuffer buffer;
    private static final /* synthetic */ String[] llIllIlllIlIll;
    private final /* synthetic */ ByteBufAllocator alloc;
    private /* synthetic */ boolean doNotFree;
    private /* synthetic */ int capacity;
    private /* synthetic */ long memoryAddress;
    private static final /* synthetic */ int[] llIllIlllIllII;
    private /* synthetic */ ByteBuffer tmpNioBuf;
    
    private static String lIIllIIIlIIIllIl(final String llllllllllllIllIIlIllllIlIIIllII, final String llllllllllllIllIIlIllllIlIIIlIll) {
        try {
            final SecretKeySpec llllllllllllIllIIlIllllIlIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIllllIlIIIlIll.getBytes(StandardCharsets.UTF_8)), UnpooledUnsafeDirectByteBuf.llIllIlllIllII[8]), "DES");
            final Cipher llllllllllllIllIIlIllllIlIIlIIII = Cipher.getInstance("DES");
            llllllllllllIllIIlIllllIlIIlIIII.init(UnpooledUnsafeDirectByteBuf.llIllIlllIllII[2], llllllllllllIllIIlIllllIlIIlIIIl);
            return new String(llllllllllllIllIIlIllllIlIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIllllIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIllllIlIIIllll) {
            llllllllllllIllIIlIllllIlIIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void _setShort(final int llllllllllllIllIIlIllllllIlIIIll, final int llllllllllllIllIIlIllllllIIlllll) {
        final long addr = this.addr(llllllllllllIllIIlIllllllIlIIIll);
        short reverseBytes;
        if (lIIllIIIlIIlIlII(UnpooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = (short)llllllllllllIllIIlIllllllIIlllll;
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
        }
        else {
            reverseBytes = Short.reverseBytes((short)llllllllllllIllIIlIllllllIIlllll);
        }
        PlatformDependent.putShort(addr, reverseBytes);
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.alloc;
    }
    
    private static boolean lIIllIIIlIIlIlIl(final Object llllllllllllIllIIlIllllIIlllllll) {
        return llllllllllllIllIIlIllllIIlllllll != null;
    }
    
    @Override
    public ByteBuf capacity(final int llllllllllllIllIIllIIIIIIIllIIll) {
        this.ensureAccessible();
        if (!lIIllIIIlIIlIllI(llllllllllllIllIIllIIIIIIIllIIll) || lIIllIIIlIIlIIlI(llllllllllllIllIIllIIIIIIIllIIll, this.maxCapacity())) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[9]]).append(llllllllllllIllIIllIIIIIIIllIIll)));
        }
        final int llllllllllllIllIIllIIIIIIIllIIlI = this.readerIndex();
        int llllllllllllIllIIllIIIIIIIllIIIl = this.writerIndex();
        final int llllllllllllIllIIllIIIIIIIllIIII = this.capacity;
        if (lIIllIIIlIIlIIlI(llllllllllllIllIIllIIIIIIIllIIll, llllllllllllIllIIllIIIIIIIllIIII)) {
            final ByteBuffer llllllllllllIllIIllIIIIIIIlllIII = this.buffer;
            final ByteBuffer llllllllllllIllIIllIIIIIIIllIlll = this.allocateDirect(llllllllllllIllIIllIIIIIIIllIIll);
            llllllllllllIllIIllIIIIIIIlllIII.position(UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0]).limit(llllllllllllIllIIllIIIIIIIlllIII.capacity());
            "".length();
            llllllllllllIllIIllIIIIIIIllIlll.position(UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0]).limit(llllllllllllIllIIllIIIIIIIlllIII.capacity());
            "".length();
            llllllllllllIllIIllIIIIIIIllIlll.put(llllllllllllIllIIllIIIIIIIlllIII);
            "".length();
            llllllllllllIllIIllIIIIIIIllIlll.clear();
            "".length();
            this.setByteBuffer(llllllllllllIllIIllIIIIIIIllIlll);
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else if (lIIllIIIlIIlIlll(llllllllllllIllIIllIIIIIIIllIIll, llllllllllllIllIIllIIIIIIIllIIII)) {
            final ByteBuffer llllllllllllIllIIllIIIIIIIllIllI = this.buffer;
            final ByteBuffer llllllllllllIllIIllIIIIIIIllIlIl = this.allocateDirect(llllllllllllIllIIllIIIIIIIllIIll);
            if (lIIllIIIlIIlIlll(llllllllllllIllIIllIIIIIIIllIIlI, llllllllllllIllIIllIIIIIIIllIIll)) {
                if (lIIllIIIlIIlIIlI(llllllllllllIllIIllIIIIIIIllIIIl, llllllllllllIllIIllIIIIIIIllIIll)) {
                    llllllllllllIllIIllIIIIIIIllIIIl = llllllllllllIllIIllIIIIIIIllIIll;
                    this.writerIndex(llllllllllllIllIIllIIIIIIIllIIll);
                    "".length();
                }
                llllllllllllIllIIllIIIIIIIllIllI.position(llllllllllllIllIIllIIIIIIIllIIlI).limit(llllllllllllIllIIllIIIIIIIllIIIl);
                "".length();
                llllllllllllIllIIllIIIIIIIllIlIl.position(llllllllllllIllIIllIIIIIIIllIIlI).limit(llllllllllllIllIIllIIIIIIIllIIIl);
                "".length();
                llllllllllllIllIIllIIIIIIIllIlIl.put(llllllllllllIllIIllIIIIIIIllIllI);
                "".length();
                llllllllllllIllIIllIIIIIIIllIlIl.clear();
                "".length();
                "".length();
                if ((0x5C ^ 0x58) <= ((0x17 ^ 0x4A) & ~(0x53 ^ 0xE))) {
                    return null;
                }
            }
            else {
                this.setIndex(llllllllllllIllIIllIIIIIIIllIIll, llllllllllllIllIIllIIIIIIIllIIll);
                "".length();
            }
            this.setByteBuffer(llllllllllllIllIIllIIIIIIIllIlIl);
        }
        return this;
    }
    
    private int getBytes(final int llllllllllllIllIIlIlllllIIlIllIl, final GatheringByteChannel llllllllllllIllIIlIlllllIIllIIlI, final int llllllllllllIllIIlIlllllIIlIlIll, final boolean llllllllllllIllIIlIlllllIIlIlIlI) throws IOException {
        this.ensureAccessible();
        if (lIIllIIIlIIlIIll(llllllllllllIllIIlIlllllIIlIlIll)) {
            return UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0];
        }
        ByteBuffer llllllllllllIllIIlIlllllIIlIllll = null;
        if (lIIllIIIlIIlIlII(llllllllllllIllIIlIlllllIIlIlIlI ? 1 : 0)) {
            final ByteBuffer llllllllllllIllIIlIlllllIIllIlIl = this.internalNioBuffer();
            "".length();
            if ("  ".length() > "  ".length()) {
                return (0x56 ^ 0x18) & ~(0x50 ^ 0x1E);
            }
        }
        else {
            llllllllllllIllIIlIlllllIIlIllll = this.buffer.duplicate();
        }
        llllllllllllIllIIlIlllllIIlIllll.clear().position(llllllllllllIllIIlIlllllIIlIllIl).limit(llllllllllllIllIIlIlllllIIlIllIl + llllllllllllIllIIlIlllllIIlIlIll);
        "".length();
        return llllllllllllIllIIlIlllllIIllIIlI.write(llllllllllllIllIIlIlllllIIlIllll);
    }
    
    @Override
    public boolean hasArray() {
        return UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0] != 0;
    }
    
    @Override
    public long memoryAddress() {
        return this.memoryAddress;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIlIlllllllIIlllI, final ByteBuffer llllllllllllIllIIlIlllllllIlIIII) {
        this.getBytes(llllllllllllIllIIlIlllllllIIlllI, llllllllllllIllIIlIlllllllIlIIII, (boolean)(UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0] != 0));
        return this;
    }
    
    protected UnpooledUnsafeDirectByteBuf(final ByteBufAllocator llllllllllllIllIIllIIIIIIllIlIlI, final int llllllllllllIllIIllIIIIIIllIlIIl, final int llllllllllllIllIIllIIIIIIllIlIII) {
        super(llllllllllllIllIIllIIIIIIllIlIII);
        if (lIIllIIIlIIlIIII(llllllllllllIllIIllIIIIIIllIlIlI)) {
            throw new NullPointerException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0]]);
        }
        if (lIIllIIIlIIlIIIl(llllllllllllIllIIllIIIIIIllIlIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1]]).append(llllllllllllIllIIllIIIIIIllIlIIl)));
        }
        if (lIIllIIIlIIlIIIl(llllllllllllIllIIllIIIIIIllIlIII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[2]]).append(llllllllllllIllIIllIIIIIIllIlIII)));
        }
        if (lIIllIIIlIIlIIlI(llllllllllllIllIIllIIIIIIllIlIIl, llllllllllllIllIIllIIIIIIllIlIII)) {
            final String format = UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[3]];
            final Object[] args = new Object[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[2]];
            args[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0]] = llllllllllllIllIIllIIIIIIllIlIIl;
            args[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1]] = llllllllllllIllIIllIIIIIIllIlIII;
            throw new IllegalArgumentException(String.format(format, args));
        }
        this.alloc = llllllllllllIllIIllIIIIIIllIlIlI;
        this.setByteBuffer(this.allocateDirect(llllllllllllIllIIllIIIIIIllIlIIl));
    }
    
    private void getBytes(final int llllllllllllIllIIlIllllllIlllllI, final ByteBuffer llllllllllllIllIIlIllllllIllllIl, final boolean llllllllllllIllIIlIllllllIllllII) {
        this.checkIndex(llllllllllllIllIIlIllllllIlllllI);
        if (lIIllIIIlIIlIIII(llllllllllllIllIIlIllllllIllllIl)) {
            throw new NullPointerException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[13]]);
        }
        final int llllllllllllIllIIlIlllllllIIIIIl = Math.min(this.capacity() - llllllllllllIllIIlIllllllIlllllI, llllllllllllIllIIlIllllllIllllIl.remaining());
        ByteBuffer llllllllllllIllIIlIlllllllIIIIII = null;
        if (lIIllIIIlIIlIlII(llllllllllllIllIIlIllllllIllllII ? 1 : 0)) {
            final ByteBuffer llllllllllllIllIIlIlllllllIIIllI = this.internalNioBuffer();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            llllllllllllIllIIlIlllllllIIIIII = this.buffer.duplicate();
        }
        llllllllllllIllIIlIlllllllIIIIII.clear().position(llllllllllllIllIIlIllllllIlllllI).limit(llllllllllllIllIIlIllllllIlllllI + llllllllllllIllIIlIlllllllIIIIIl);
        "".length();
        llllllllllllIllIIlIllllllIllllIl.put(llllllllllllIllIIlIlllllllIIIIII);
        "".length();
    }
    
    @Override
    protected void _setMedium(final int llllllllllllIllIIlIllllllIIllIIl, final int llllllllllllIllIIlIllllllIIlIlII) {
        final long llllllllllllIllIIlIllllllIIlIlll = this.addr(llllllllllllIllIIlIllllllIIllIIl);
        PlatformDependent.putByte(llllllllllllIllIIlIllllllIIlIlll, (byte)(llllllllllllIllIIlIllllllIIlIlII >>> UnpooledUnsafeDirectByteBuf.llIllIlllIllII[13]));
        PlatformDependent.putByte(llllllllllllIllIIlIllllllIIlIlll + 1L, (byte)(llllllllllllIllIIlIllllllIIlIlII >>> UnpooledUnsafeDirectByteBuf.llIllIlllIllII[8]));
        PlatformDependent.putByte(llllllllllllIllIIlIllllllIIlIlll + 2L, (byte)llllllllllllIllIIlIllllllIIlIlII);
    }
    
    @Override
    protected SwappedByteBuf newSwappedByteBuf() {
        return new UnsafeDirectSwappedByteBuf(this);
    }
    
    @Override
    protected long _getLong(final int llllllllllllIllIIlIlllllllllIlIl) {
        final long llllllllllllIllIIlIlllllllllIlll = PlatformDependent.getLong(this.addr(llllllllllllIllIIlIlllllllllIlIl));
        long reverseBytes;
        if (lIIllIIIlIIlIlII(UnpooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIlIlllllllllIlll;
            "".length();
            if (((0x80 ^ 0x84) & ~(0x6D ^ 0x69)) != 0x0) {
                return 0L;
            }
        }
        else {
            reverseBytes = Long.reverseBytes(llllllllllllIllIIlIlllllllllIlll);
        }
        return reverseBytes;
    }
    
    @Override
    protected int _getInt(final int llllllllllllIllIIllIIIIIIIIIIIIl) {
        final int llllllllllllIllIIllIIIIIIIIIIIII = PlatformDependent.getInt(this.addr(llllllllllllIllIIllIIIIIIIIIIIIl));
        int reverseBytes;
        if (lIIllIIIlIIlIlII(UnpooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIllIIIIIIIIIIIII;
            "".length();
            if (" ".length() < ((0x6E ^ 0x34) & ~(0x9F ^ 0xC5))) {
                return (0x87 ^ 0x91) & ~(0x2E ^ 0x38);
            }
        }
        else {
            reverseBytes = Integer.reverseBytes(llllllllllllIllIIllIIIIIIIIIIIII);
        }
        return reverseBytes;
    }
    
    private static boolean lIIllIIIlIIllIII(final Object llllllllllllIllIIlIllllIIlllllII, final Object llllllllllllIllIIlIllllIIllllIll) {
        return llllllllllllIllIIlIllllIIlllllII == llllllllllllIllIIlIllllIIllllIll;
    }
    
    @Override
    public ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }
    
    private static boolean lIIllIIIlIIlIlll(final int llllllllllllIllIIlIllllIlIIIIllI, final int llllllllllllIllIIlIllllIlIIIIlIl) {
        return llllllllllllIllIIlIllllIlIIIIllI < llllllllllllIllIIlIllllIlIIIIlIl;
    }
    
    private static boolean lIIllIIIlIIlIIII(final Object llllllllllllIllIIlIllllIIllllIIl) {
        return llllllllllllIllIIlIllllIIllllIIl == null;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIIlIlllllIllIlIll, final byte[] llllllllllllIllIIlIlllllIllIIlIl, final int llllllllllllIllIIlIlllllIllIIlII, final int llllllllllllIllIIlIlllllIllIIIll) {
        this.checkIndex(llllllllllllIllIIlIlllllIllIlIll, llllllllllllIllIIlIlllllIllIIIll);
        if (lIIllIIIlIIlIlII(llllllllllllIllIIlIlllllIllIIIll)) {
            PlatformDependent.copyMemory(llllllllllllIllIIlIlllllIllIIlIl, llllllllllllIllIIlIlllllIllIIlII, this.addr(llllllllllllIllIIlIlllllIllIlIll), llllllllllllIllIIlIlllllIllIIIll);
        }
        return this;
    }
    
    @Override
    public byte[] array() {
        throw new UnsupportedOperationException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[10]]);
    }
    
    private static boolean lIIllIIIlIIlIIll(final int llllllllllllIllIIlIllllIIlllIlIl) {
        return llllllllllllIllIIlIllllIIlllIlIl == 0;
    }
    
    long addr(final int llllllllllllIllIIlIllllIllIIIIII) {
        return this.memoryAddress + llllllllllllIllIIlIllllIllIIIIII;
    }
    
    @Override
    protected void deallocate() {
        final ByteBuffer llllllllllllIllIIlIllllIllIIIlll = this.buffer;
        if (lIIllIIIlIIlIIII(llllllllllllIllIIlIllllIllIIIlll)) {
            return;
        }
        this.buffer = null;
        if (lIIllIIIlIIlIIll(this.doNotFree ? 1 : 0)) {
            this.freeDirect(llllllllllllIllIIlIllllIllIIIlll);
        }
    }
    
    @Override
    protected byte _getByte(final int llllllllllllIllIIllIIIIIIIIllIII) {
        return PlatformDependent.getByte(this.addr(llllllllllllIllIIllIIIIIIIIllIII));
    }
    
    @Override
    public int setBytes(final int llllllllllllIllIIlIlllllIIIIIIlI, final ScatteringByteChannel llllllllllllIllIIlIlllllIIIIIIIl, final int llllllllllllIllIIlIllllIlllllIll) throws IOException {
        this.ensureAccessible();
        final ByteBuffer llllllllllllIllIIlIllllIllllllll = this.internalNioBuffer();
        llllllllllllIllIIlIllllIllllllll.clear().position(llllllllllllIllIIlIlllllIIIIIIlI).limit(llllllllllllIllIIlIlllllIIIIIIlI + llllllllllllIllIIlIllllIlllllIll);
        "".length();
        try {
            return llllllllllllIllIIlIlllllIIIIIIIl.read(llllllllllllIllIIlIllllIllllllll);
        }
        catch (ClosedChannelException llllllllllllIllIIlIlllllIIIIIlII) {
            return UnpooledUnsafeDirectByteBuf.llIllIlllIllII[20];
        }
    }
    
    @Override
    protected void _setByte(final int llllllllllllIllIIlIllllllIlIllII, final int llllllllllllIllIIlIllllllIlIlIII) {
        PlatformDependent.putByte(this.addr(llllllllllllIllIIlIllllllIlIllII), (byte)llllllllllllIllIIlIllllllIlIlIII);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIlIllllllllIllIl, final ByteBuf llllllllllllIllIIlIllllllllIllII, final int llllllllllllIllIIlIllllllllIlIll, final int llllllllllllIllIIlIllllllllIIlIl) {
        this.checkIndex(llllllllllllIllIIlIllllllllIllIl, llllllllllllIllIIlIllllllllIIlIl);
        if (lIIllIIIlIIlIIII(llllllllllllIllIIlIllllllllIllII)) {
            throw new NullPointerException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[14]]);
        }
        if (!lIIllIIIlIIlIllI(llllllllllllIllIIlIllllllllIlIll) || lIIllIIIlIIlIIlI(llllllllllllIllIIlIllllllllIlIll, llllllllllllIllIIlIllllllllIllII.capacity() - llllllllllllIllIIlIllllllllIIlIl)) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[15]]).append(llllllllllllIllIIlIllllllllIlIll)));
        }
        if (lIIllIIIlIIlIlII(llllllllllllIllIIlIllllllllIllII.hasMemoryAddress() ? 1 : 0)) {
            PlatformDependent.copyMemory(this.addr(llllllllllllIllIIlIllllllllIllIl), llllllllllllIllIIlIllllllllIllII.memoryAddress() + llllllllllllIllIIlIllllllllIlIll, llllllllllllIllIIlIllllllllIIlIl);
            "".length();
            if (((0x2E ^ 0x36 ^ (0x1D ^ 0x0)) & (0xAE ^ 0xA4 ^ (0x65 ^ 0x6A) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else if (lIIllIIIlIIlIlII(llllllllllllIllIIlIllllllllIllII.hasArray() ? 1 : 0)) {
            PlatformDependent.copyMemory(this.addr(llllllllllllIllIIlIllllllllIllIl), llllllllllllIllIIlIllllllllIllII.array(), llllllllllllIllIIlIllllllllIllII.arrayOffset() + llllllllllllIllIIlIllllllllIlIll, llllllllllllIllIIlIllllllllIIlIl);
            "".length();
            if ((0xB4 ^ 0xB0) <= ((0xFB ^ 0xBC) & ~(0x16 ^ 0x51))) {
                return null;
            }
        }
        else {
            llllllllllllIllIIlIllllllllIllII.setBytes(llllllllllllIllIIlIllllllllIlIll, this, llllllllllllIllIIlIllllllllIllIl, llllllllllllIllIIlIllllllllIIlIl);
            "".length();
        }
        return this;
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int llllllllllllIllIIlIllllIllllIIll, final int llllllllllllIllIIlIllllIllllIIlI) {
        final ByteBuffer[] array = new ByteBuffer[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1]];
        array[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0]] = this.nioBuffer(llllllllllllIllIIlIllllIllllIIll, llllllllllllIllIIlIllllIllllIIlI);
        return array;
    }
    
    @Override
    public ByteBuf unwrap() {
        return null;
    }
    
    private static boolean lIIllIIIlIIlIIIl(final int llllllllllllIllIIlIllllIIlllIIIl) {
        return llllllllllllIllIIlIllllIIlllIIIl < 0;
    }
    
    private static boolean lIIllIIIlIIlIlII(final int llllllllllllIllIIlIllllIIlllIlll) {
        return llllllllllllIllIIlIllllIIlllIlll != 0;
    }
    
    static {
        lIIllIIIlIIIllll();
        lIIllIIIlIIIlllI();
        int native_ORDER;
        if (lIIllIIIlIIllIII(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN)) {
            native_ORDER = UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1];
            "".length();
            if (((60 + 79 - 18 + 39 ^ 95 + 62 - 53 + 79) & (89 + 123 - 93 + 11 ^ 47 + 130 - 89 + 61 ^ -" ".length())) < 0) {
                return;
            }
        }
        else {
            native_ORDER = UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0];
        }
        NATIVE_ORDER = (native_ORDER != 0);
    }
    
    protected ByteBuffer allocateDirect(final int llllllllllllIllIIllIIIIIIlIlIIlI) {
        return ByteBuffer.allocateDirect(llllllllllllIllIIllIIIIIIlIlIIlI);
    }
    
    private static void lIIllIIIlIIIllll() {
        (llIllIlllIllII = new int[22])[0] = ((0x21 ^ 0x31) & ~(0x3E ^ 0x2E));
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1] = " ".length();
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[2] = "  ".length();
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[3] = "   ".length();
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[4] = (0xBB ^ 0xBF);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[5] = (0x40 ^ 0x45);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[6] = (0xAE ^ 0xA8);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[7] = (0x38 ^ 0x3F);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[8] = (0xAC ^ 0xA4);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[9] = (0x46 ^ 0x4F);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[10] = (0x83 ^ 0x89);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[11] = (0xE6 ^ 0xB7 ^ (0xE7 ^ 0xBD));
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[12] = (0x61 ^ 0x46) + (161 + 117 - 207 + 176) - (0x1D ^ 0x7A) + (0xCD ^ 0x85);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[13] = (0x51 ^ 0x41);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[14] = (70 + 114 - 90 + 97 ^ 128 + 88 - 168 + 131);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[15] = (0x5B ^ 0x56);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[16] = (0x90 ^ 0x9E);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[17] = (0x16 ^ 0x19);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[18] = (16 + 123 - 15 + 15 ^ 46 + 33 - 66 + 141);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[19] = (0x8F ^ 0x9D);
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[20] = -" ".length();
        UnpooledUnsafeDirectByteBuf.llIllIlllIllII[21] = (0xB0 ^ 0xA3);
    }
    
    private void setByteBuffer(final ByteBuffer llllllllllllIllIIllIIIIIIlIIlIII) {
        final ByteBuffer llllllllllllIllIIllIIIIIIlIIIlll = this.buffer;
        if (lIIllIIIlIIlIlIl(llllllllllllIllIIllIIIIIIlIIIlll)) {
            if (lIIllIIIlIIlIlII(this.doNotFree ? 1 : 0)) {
                this.doNotFree = (UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0] != 0);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else {
                this.freeDirect(llllllllllllIllIIllIIIIIIlIIIlll);
            }
        }
        this.buffer = llllllllllllIllIIllIIIIIIlIIlIII;
        this.memoryAddress = PlatformDependent.directBufferAddress(llllllllllllIllIIllIIIIIIlIIlIII);
        this.tmpNioBuf = null;
        this.capacity = llllllllllllIllIIllIIIIIIlIIlIII.remaining();
    }
    
    @Override
    public int readBytes(final GatheringByteChannel llllllllllllIllIIlIlllllIIlIIIll, final int llllllllllllIllIIlIlllllIIlIIIlI) throws IOException {
        this.checkReadableBytes(llllllllllllIllIIlIlllllIIlIIIlI);
        final int llllllllllllIllIIlIlllllIIlIIIIl = this.getBytes(this.readerIndex, llllllllllllIllIIlIlllllIIlIIIll, llllllllllllIllIIlIlllllIIlIIIlI, (boolean)(UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1] != 0));
        this.readerIndex += llllllllllllIllIIlIlllllIIlIIIIl;
        return llllllllllllIllIIlIlllllIIlIIIIl;
    }
    
    @Override
    public int setBytes(final int llllllllllllIllIIlIlllllIIIlIlIl, final InputStream llllllllllllIllIIlIlllllIIIlIlII, final int llllllllllllIllIIlIlllllIIIlIIll) throws IOException {
        this.checkIndex(llllllllllllIllIIlIlllllIIIlIlIl, llllllllllllIllIIlIlllllIIIlIIll);
        final byte[] llllllllllllIllIIlIlllllIIIlIIlI = new byte[llllllllllllIllIIlIlllllIIIlIIll];
        final int llllllllllllIllIIlIlllllIIIlIIIl = llllllllllllIllIIlIlllllIIIlIlII.read(llllllllllllIllIIlIlllllIIIlIIlI);
        if (lIIllIIIlIIllIIl(llllllllllllIllIIlIlllllIIIlIIIl)) {
            PlatformDependent.copyMemory(llllllllllllIllIIlIlllllIIIlIIlI, UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0], this.addr(llllllllllllIllIIlIlllllIIIlIlIl), llllllllllllIllIIlIlllllIIIlIIIl);
        }
        return llllllllllllIllIIlIlllllIIIlIIIl;
    }
    
    @Override
    public ByteBuffer nioBuffer(final int llllllllllllIllIIlIllllIllIIllll, final int llllllllllllIllIIlIllllIllIIlIll) {
        this.checkIndex(llllllllllllIllIIlIllllIllIIllll, llllllllllllIllIIlIllllIllIIlIll);
        return ((ByteBuffer)this.buffer.duplicate().position(llllllllllllIllIIlIllllIllIIllll).limit(llllllllllllIllIIlIllllIllIIllll + llllllllllllIllIIlIllllIllIIlIll)).slice();
    }
    
    protected UnpooledUnsafeDirectByteBuf(final ByteBufAllocator llllllllllllIllIIllIIIIIIlIllIII, final ByteBuffer llllllllllllIllIIllIIIIIIlIlllII, final int llllllllllllIllIIllIIIIIIlIlIllI) {
        super(llllllllllllIllIIllIIIIIIlIlIllI);
        if (lIIllIIIlIIlIIII(llllllllllllIllIIllIIIIIIlIllIII)) {
            throw new NullPointerException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[4]]);
        }
        if (lIIllIIIlIIlIIII(llllllllllllIllIIllIIIIIIlIlllII)) {
            throw new NullPointerException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[5]]);
        }
        if (lIIllIIIlIIlIIll(llllllllllllIllIIllIIIIIIlIlllII.isDirect() ? 1 : 0)) {
            throw new IllegalArgumentException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[6]]);
        }
        if (lIIllIIIlIIlIlII(llllllllllllIllIIllIIIIIIlIlllII.isReadOnly() ? 1 : 0)) {
            throw new IllegalArgumentException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[7]]);
        }
        final int llllllllllllIllIIllIIIIIIlIllIlI = llllllllllllIllIIllIIIIIIlIlllII.remaining();
        if (lIIllIIIlIIlIIlI(llllllllllllIllIIllIIIIIIlIllIlI, llllllllllllIllIIllIIIIIIlIlIllI)) {
            final String format = UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[8]];
            final Object[] args = new Object[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[2]];
            args[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0]] = llllllllllllIllIIllIIIIIIlIllIlI;
            args[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1]] = llllllllllllIllIIllIIIIIIlIlIllI;
            throw new IllegalArgumentException(String.format(format, args));
        }
        this.alloc = llllllllllllIllIIllIIIIIIlIllIII;
        this.doNotFree = (UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1] != 0);
        this.setByteBuffer(llllllllllllIllIIllIIIIIIlIlllII.slice().order(ByteOrder.BIG_ENDIAN));
        this.writerIndex(llllllllllllIllIIllIIIIIIlIllIlI);
        "".length();
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer llllllllllllIllIIlIllllllIllIlIl) {
        final int llllllllllllIllIIlIllllllIllIlII = llllllllllllIllIIlIllllllIllIlIl.remaining();
        this.checkReadableBytes(llllllllllllIllIIlIllllllIllIlII);
        this.getBytes(this.readerIndex, llllllllllllIllIIlIllllllIllIlIl, (boolean)(UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1] != 0));
        this.readerIndex += llllllllllllIllIIlIllllllIllIlII;
        return this;
    }
    
    private static boolean lIIllIIIlIIlIllI(final int llllllllllllIllIIlIllllIIlllIIll) {
        return llllllllllllIllIIlIllllIIlllIIll >= 0;
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int llllllllllllIllIIlIllllIllIllllI, final int llllllllllllIllIIlIllllIllIllIlI) {
        this.checkIndex(llllllllllllIllIIlIllllIllIllllI, llllllllllllIllIIlIllllIllIllIlI);
        return (ByteBuffer)this.internalNioBuffer().clear().position(llllllllllllIllIIlIllllIllIllllI).limit(llllllllllllIllIIlIllllIllIllllI + llllllllllllIllIIlIllllIllIllIlI);
    }
    
    private static String lIIllIIIlIIIlIll(final String llllllllllllIllIIlIllllIlIIllIll, final String llllllllllllIllIIlIllllIlIIllIII) {
        try {
            final SecretKeySpec llllllllllllIllIIlIllllIlIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIllllIlIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIllllIlIIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIllllIlIIlllIl.init(UnpooledUnsafeDirectByteBuf.llIllIlllIllII[2], llllllllllllIllIIlIllllIlIIllllI);
            return new String(llllllllllllIllIIlIllllIlIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIllllIlIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIllllIlIIlllII) {
            llllllllllllIllIIlIllllIlIIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected int _getUnsignedMedium(final int llllllllllllIllIIllIIIIIIIIIIlll) {
        final long llllllllllllIllIIllIIIIIIIIIlIIl = this.addr(llllllllllllIllIIllIIIIIIIIIIlll);
        return (PlatformDependent.getByte(llllllllllllIllIIllIIIIIIIIIlIIl) & UnpooledUnsafeDirectByteBuf.llIllIlllIllII[12]) << UnpooledUnsafeDirectByteBuf.llIllIlllIllII[13] | (PlatformDependent.getByte(llllllllllllIllIIllIIIIIIIIIlIIl + 1L) & UnpooledUnsafeDirectByteBuf.llIllIlllIllII[12]) << UnpooledUnsafeDirectByteBuf.llIllIlllIllII[8] | (PlatformDependent.getByte(llllllllllllIllIIllIIIIIIIIIlIIl + 2L) & UnpooledUnsafeDirectByteBuf.llIllIlllIllII[12]);
    }
    
    @Override
    public int arrayOffset() {
        throw new UnsupportedOperationException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[11]]);
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIIlIlllllIllllIlI, final ByteBuf llllllllllllIllIIlIlllllIllllIIl, final int llllllllllllIllIIlIlllllIlllIIll, final int llllllllllllIllIIlIlllllIlllIlll) {
        this.checkIndex(llllllllllllIllIIlIlllllIllllIlI, llllllllllllIllIIlIlllllIlllIlll);
        if (lIIllIIIlIIlIIII(llllllllllllIllIIlIlllllIllllIIl)) {
            throw new NullPointerException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[18]]);
        }
        if (!lIIllIIIlIIlIllI(llllllllllllIllIIlIlllllIlllIIll) || lIIllIIIlIIlIIlI(llllllllllllIllIIlIlllllIlllIIll, llllllllllllIllIIlIlllllIllllIIl.capacity() - llllllllllllIllIIlIlllllIlllIlll)) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[19]]).append(llllllllllllIllIIlIlllllIlllIIll)));
        }
        if (lIIllIIIlIIlIlII(llllllllllllIllIIlIlllllIlllIlll)) {
            if (lIIllIIIlIIlIlII(llllllllllllIllIIlIlllllIllllIIl.hasMemoryAddress() ? 1 : 0)) {
                PlatformDependent.copyMemory(llllllllllllIllIIlIlllllIllllIIl.memoryAddress() + llllllllllllIllIIlIlllllIlllIIll, this.addr(llllllllllllIllIIlIlllllIllllIlI), llllllllllllIllIIlIlllllIlllIlll);
                "".length();
                if (((117 + 62 - 147 + 122 ^ 100 + 98 - 71 + 50) & (0xC7 ^ 0xC1 ^ (0x4A ^ 0x67) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else if (lIIllIIIlIIlIlII(llllllllllllIllIIlIlllllIllllIIl.hasArray() ? 1 : 0)) {
                PlatformDependent.copyMemory(llllllllllllIllIIlIlllllIllllIIl.array(), llllllllllllIllIIlIlllllIllllIIl.arrayOffset() + llllllllllllIllIIlIlllllIlllIIll, this.addr(llllllllllllIllIIlIlllllIllllIlI), llllllllllllIllIIlIlllllIlllIlll);
                "".length();
                if ((0x11 ^ 0x2B ^ (0xA3 ^ 0x9D)) == 0x0) {
                    return null;
                }
            }
            else {
                llllllllllllIllIIlIlllllIllllIIl.getBytes(llllllllllllIllIIlIlllllIlllIIll, this, llllllllllllIllIIlIlllllIllllIlI, llllllllllllIllIIlIlllllIlllIlll);
                "".length();
            }
        }
        return this;
    }
    
    @Override
    public int nioBufferCount() {
        return UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1];
    }
    
    private ByteBuffer internalNioBuffer() {
        ByteBuffer llllllllllllIllIIlIllllIllIlIllI = this.tmpNioBuf;
        if (lIIllIIIlIIlIIII(llllllllllllIllIIlIllllIllIlIllI)) {
            llllllllllllIllIIlIllllIllIlIllI = (this.tmpNioBuf = this.buffer.duplicate());
        }
        return llllllllllllIllIIlIllllIllIlIllI;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIlIlllllIlIIllll, final OutputStream llllllllllllIllIIlIlllllIlIIlllI, final int llllllllllllIllIIlIlllllIlIIllIl) throws IOException {
        this.ensureAccessible();
        if (lIIllIIIlIIlIlII(llllllllllllIllIIlIlllllIlIIllIl)) {
            final byte[] llllllllllllIllIIlIlllllIlIlIIIl = new byte[llllllllllllIllIIlIlllllIlIIllIl];
            PlatformDependent.copyMemory(this.addr(llllllllllllIllIIlIlllllIlIIllll), llllllllllllIllIIlIlllllIlIlIIIl, UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0], llllllllllllIllIIlIlllllIlIIllIl);
            llllllllllllIllIIlIlllllIlIIlllI.write(llllllllllllIllIIlIlllllIlIlIIIl);
        }
        return this;
    }
    
    protected void freeDirect(final ByteBuffer llllllllllllIllIIllIIIIIIlIIllIl) {
        PlatformDependent.freeDirectBuffer(llllllllllllIllIIllIIIIIIlIIllIl);
    }
    
    private static boolean lIIllIIIlIIlIIlI(final int llllllllllllIllIIlIllllIlIIIIIlI, final int llllllllllllIllIIlIllllIlIIIIIIl) {
        return llllllllllllIllIIlIllllIlIIIIIlI > llllllllllllIllIIlIllllIlIIIIIIl;
    }
    
    @Override
    public int capacity() {
        return this.capacity;
    }
    
    @Override
    public ByteBuf copy(final int llllllllllllIllIIlIllllIlllIlIIl, final int llllllllllllIllIIlIllllIlllIIlII) {
        this.checkIndex(llllllllllllIllIIlIllllIlllIlIIl, llllllllllllIllIIlIllllIlllIIlII);
        final ByteBuf llllllllllllIllIIlIllllIlllIIlll = this.alloc().directBuffer(llllllllllllIllIIlIllllIlllIIlII, this.maxCapacity());
        if (lIIllIIIlIIlIlII(llllllllllllIllIIlIllllIlllIIlII)) {
            if (lIIllIIIlIIlIlII(llllllllllllIllIIlIllllIlllIIlll.hasMemoryAddress() ? 1 : 0)) {
                PlatformDependent.copyMemory(this.addr(llllllllllllIllIIlIllllIlllIlIIl), llllllllllllIllIIlIllllIlllIIlll.memoryAddress(), llllllllllllIllIIlIllllIlllIIlII);
                llllllllllllIllIIlIllllIlllIIlll.setIndex(UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0], llllllllllllIllIIlIllllIlllIIlII);
                "".length();
                "".length();
                if ("  ".length() < ((22 + 44 - 47 + 195 ^ 20 + 99 - 100 + 115) & (146 + 47 - 10 + 45 ^ 43 + 162 - 124 + 99 ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                llllllllllllIllIIlIllllIlllIIlll.writeBytes(this, llllllllllllIllIIlIllllIlllIlIIl, llllllllllllIllIIlIllllIlllIIlII);
                "".length();
            }
        }
        return llllllllllllIllIIlIllllIlllIIlll;
    }
    
    private static void lIIllIIIlIIIlllI() {
        (llIllIlllIlIll = new String[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[21]])[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0]] = lIIllIIIlIIIlIll("XvR2W6HlhCI=", "ZGSrK");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1]] = lIIllIIIlIIIllII("JCgdFQ0sKjcAFCwlHRUdd2Y=", "MFtad");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[2]] = lIIllIIIlIIIllII("HigSKgsDKAkAHgpzSg==", "sIjij");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[3]] = lIIllIIIlIIIllIl("u+vA4DmdPIcPDm98trbiCyAwdgEWhiCRkc555iWty2cRNLiN0SBcvw==", "RqYGi");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[4]] = lIIllIIIlIIIlIll("pGsxD/A1eSc=", "BseIR");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[5]] = lIIllIIIlIIIlIll("x0+YyDLcHSYI/g2HUIITcg==", "RPUDe");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[6]] = lIIllIIIlIIIllIl("/qfm6DxMx6TEVdqxGxpIQMxMV0/4Oqo2/G1q4mu96iTCeUm7LaDbzQ==", "vypde");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[7]] = lIIllIIIlIIIlIll("h+boGJSnWOcv2T5B9YKIkM2QtKF2tz/XRJQN8xJkNsl2DwBsy3Y7KQ==", "eCcyY");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[8]] = lIIllIIIlIIIllIl("fquNxJtFAizTrSAg0Yhn/UgSkeVZTCcJROwLXK6FwzQLb8UHQelRIA==", "yurPb");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[9]] = lIIllIIIlIIIllII("BwsjNC8ZDzceOhBUdA==", "inTwN");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[10]] = lIIllIIIlIIIllIl("jZryFKZsRbf4+9+Doxuuxg==", "zFoKF");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[11]] = lIIllIIIlIIIlIll("HklTlTibSVfswsOlpmMAgw==", "HEPiV");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[14]] = lIIllIIIlIIIllII("LAoV", "HyaaL");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[15]] = lIIllIIIlIIIllII("ETYuHCcRICJvaQ==", "uEZUI");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[16]] = lIIllIIIlIIIllII("Bxcm", "cdRCz");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[17]] = lIIllIIIlIIIllII("PDcgBzY8ISx0eH0geG40PSozOjBiZHEqeHAhLD49OzAxKmJ4NjUgPz1sZGJ4fSB9Zw==", "XDTNX");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[13]] = lIIllIIIlIIIllII("ERId", "uaiNv");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[18]] = lIIllIIIlIIIlIll("D00Pj7O0Vpo=", "xPPYm");
        UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[19]] = lIIllIIIlIIIllIl("COnG6wNnVJ7QtD41lYflzg==", "WdwlR");
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1] != 0;
    }
    
    @Override
    protected void _setLong(final int llllllllllllIllIIlIllllllIIIIlIl, final long llllllllllllIllIIlIllllllIIIIlII) {
        final long addr = this.addr(llllllllllllIllIIlIllllllIIIIlIl);
        long reverseBytes;
        if (lIIllIIIlIIlIlII(UnpooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIlIllllllIIIIlII;
            "".length();
            if (" ".length() >= (162 + 33 - 147 + 139 ^ 125 + 88 - 61 + 39)) {
                return;
            }
        }
        else {
            reverseBytes = Long.reverseBytes(llllllllllllIllIIlIllllllIIIIlII);
        }
        PlatformDependent.putLong(addr, reverseBytes);
    }
    
    @Override
    public boolean isDirect() {
        return UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1] != 0;
    }
    
    private static boolean lIIllIIIlIIllIIl(final int llllllllllllIllIIlIllllIIllIllll) {
        return llllllllllllIllIIlIllllIIllIllll > 0;
    }
    
    @Override
    protected short _getShort(final int llllllllllllIllIIllIIIIIIIIlIIll) {
        final short llllllllllllIllIIllIIIIIIIIlIIlI = PlatformDependent.getShort(this.addr(llllllllllllIllIIllIIIIIIIIlIIll));
        short reverseBytes;
        if (lIIllIIIlIIlIlII(UnpooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIllIIIIIIIIlIIlI;
            "".length();
            if (((0x3E ^ 0x4F ^ (0xC4 ^ 0xB0)) & (80 + 27 - 82 + 108 ^ 30 + 97 - 56 + 57 ^ -" ".length())) != 0x0) {
                return (short)((0x2C ^ 0x77 ^ ((0xD6 ^ 0xC5) & ~(0x8B ^ 0x98))) & (0x97 ^ 0xB8 ^ (0xF6 ^ 0x82) ^ -" ".length()));
            }
        }
        else {
            reverseBytes = Short.reverseBytes(llllllllllllIllIIllIIIIIIIIlIIlI);
        }
        return reverseBytes;
    }
    
    @Override
    protected void _setInt(final int llllllllllllIllIIlIllllllIIIlIll, final int llllllllllllIllIIlIllllllIIIlIlI) {
        final long addr = this.addr(llllllllllllIllIIlIllllllIIIlIll);
        int reverseBytes;
        if (lIIllIIIlIIlIlII(UnpooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIlIllllllIIIlIlI;
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            reverseBytes = Integer.reverseBytes(llllllllllllIllIIlIllllllIIIlIlI);
        }
        PlatformDependent.putInt(addr, reverseBytes);
    }
    
    @Override
    public int getBytes(final int llllllllllllIllIIlIlllllIlIIIIlI, final GatheringByteChannel llllllllllllIllIIlIlllllIlIIIIIl, final int llllllllllllIllIIlIlllllIIllllII) throws IOException {
        return this.getBytes(llllllllllllIllIIlIlllllIlIIIIlI, llllllllllllIllIIlIlllllIlIIIIIl, llllllllllllIllIIlIlllllIIllllII, (boolean)(UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0] != 0));
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIllIIlIlllllIlIllIIl, ByteBuffer llllllllllllIllIIlIlllllIlIllIII) {
        this.ensureAccessible();
        final ByteBuffer llllllllllllIllIIlIlllllIlIllIll = this.internalNioBuffer();
        if (lIIllIIIlIIllIII(llllllllllllIllIIlIlllllIlIllIII, llllllllllllIllIIlIlllllIlIllIll)) {
            llllllllllllIllIIlIlllllIlIllIII = ((ByteBuffer)llllllllllllIllIIlIlllllIlIllIII).duplicate();
        }
        llllllllllllIllIIlIlllllIlIllIll.clear().position(llllllllllllIllIIlIlllllIlIllIIl).limit(llllllllllllIllIIlIlllllIlIllIIl + ((Buffer)llllllllllllIllIIlIlllllIlIllIII).remaining());
        "".length();
        llllllllllllIllIIlIlllllIlIllIll.put((ByteBuffer)llllllllllllIllIIlIlllllIlIllIII);
        "".length();
        return this;
    }
    
    private static String lIIllIIIlIIIllII(String llllllllllllIllIIlIllllIlIlIlIll, final String llllllllllllIllIIlIllllIlIlIlIlI) {
        llllllllllllIllIIlIllllIlIlIlIll = new String(Base64.getDecoder().decode(llllllllllllIllIIlIllllIlIlIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIllllIlIlIlllI = new StringBuilder();
        final char[] llllllllllllIllIIlIllllIlIlIllIl = llllllllllllIllIIlIllllIlIlIlIlI.toCharArray();
        int llllllllllllIllIIlIllllIlIlIllII = UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0];
        final Exception llllllllllllIllIIlIllllIlIlIIllI = (Object)llllllllllllIllIIlIllllIlIlIlIll.toCharArray();
        final byte llllllllllllIllIIlIllllIlIlIIlIl = (byte)llllllllllllIllIIlIllllIlIlIIllI.length;
        float llllllllllllIllIIlIllllIlIlIIlII = UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0];
        while (lIIllIIIlIIlIlll((int)llllllllllllIllIIlIllllIlIlIIlII, llllllllllllIllIIlIllllIlIlIIlIl)) {
            final char llllllllllllIllIIlIllllIlIllIIIl = llllllllllllIllIIlIllllIlIlIIllI[llllllllllllIllIIlIllllIlIlIIlII];
            llllllllllllIllIIlIllllIlIlIlllI.append((char)(llllllllllllIllIIlIllllIlIllIIIl ^ llllllllllllIllIIlIllllIlIlIllIl[llllllllllllIllIIlIllllIlIlIllII % llllllllllllIllIIlIllllIlIlIllIl.length]));
            "".length();
            ++llllllllllllIllIIlIllllIlIlIllII;
            ++llllllllllllIllIIlIllllIlIlIIlII;
            "".length();
            if (((45 + 53 + 58 + 49 ^ 132 + 13 - 95 + 142) & (0xB0 ^ 0xB5 ^ (0x85 ^ 0x8D) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIllllIlIlIlllI);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIlIlllllllIllllI, final byte[] llllllllllllIllIIlIlllllllIlllIl, final int llllllllllllIllIIlIlllllllIlIlll, final int llllllllllllIllIIlIlllllllIlIllI) {
        this.checkIndex(llllllllllllIllIIlIlllllllIllllI, llllllllllllIllIIlIlllllllIlIllI);
        if (lIIllIIIlIIlIIII(llllllllllllIllIIlIlllllllIlllIl)) {
            throw new NullPointerException(UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[16]]);
        }
        if (!lIIllIIIlIIlIllI(llllllllllllIllIIlIlllllllIlIlll) || lIIllIIIlIIlIIlI(llllllllllllIllIIlIlllllllIlIlll, llllllllllllIllIIlIlllllllIlllIl.length - llllllllllllIllIIlIlllllllIlIllI)) {
            final String format = UnpooledUnsafeDirectByteBuf.llIllIlllIlIll[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[17]];
            final Object[] args = new Object[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[3]];
            args[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[0]] = llllllllllllIllIIlIlllllllIlIlll;
            args[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[1]] = llllllllllllIllIIlIlllllllIlIllI;
            args[UnpooledUnsafeDirectByteBuf.llIllIlllIllII[2]] = llllllllllllIllIIlIlllllllIlllIl.length;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        if (lIIllIIIlIIlIlII(llllllllllllIllIIlIlllllllIlIllI)) {
            PlatformDependent.copyMemory(this.addr(llllllllllllIllIIlIlllllllIllllI), llllllllllllIllIIlIlllllllIlllIl, llllllllllllIllIIlIlllllllIlIlll, llllllllllllIllIIlIlllllllIlIllI);
        }
        return this;
    }
}
