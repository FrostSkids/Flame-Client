// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.Buffer;
import java.nio.ByteOrder;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.channels.GatheringByteChannel;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ScatteringByteChannel;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.Recycler;
import java.nio.ByteBuffer;

final class PooledUnsafeDirectByteBuf extends PooledByteBuf<ByteBuffer>
{
    private static final /* synthetic */ boolean NATIVE_ORDER;
    private static final /* synthetic */ int[] lIlIIIIllllIII;
    private /* synthetic */ long memoryAddress;
    private static final /* synthetic */ String[] lIlIIIIlllIIll;
    private static final /* synthetic */ Recycler<PooledUnsafeDirectByteBuf> RECYCLER;
    
    @Override
    protected short _getShort(final int lllllllllllllIIlIIIIIIllIIIllIII) {
        final short lllllllllllllIIlIIIIIIllIIIlIlll = PlatformDependent.getShort(this.addr(lllllllllllllIIlIIIIIIllIIIllIII));
        short reverseBytes;
        if (lllIIIlIIIIllll(PooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = lllllllllllllIIlIIIIIIllIIIlIlll;
            "".length();
            if (" ".length() == 0) {
                return (short)((7 + 19 + 64 + 48 ^ 32 + 108 - 50 + 75) & (0x5D ^ 0x31 ^ (0x57 ^ 0x14) ^ -" ".length()));
            }
        }
        else {
            reverseBytes = Short.reverseBytes(lllllllllllllIIlIIIIIIllIIIlIlll);
        }
        return reverseBytes;
    }
    
    @Override
    protected ByteBuffer newInternalNioBuffer(final ByteBuffer lllllllllllllIIlIIIIIIllIIlIIlIl) {
        return lllllllllllllIIlIIIIIIllIIlIIlIl.duplicate();
    }
    
    private PooledUnsafeDirectByteBuf(final Recycler.Handle lllllllllllllIIlIIIIIIllIlIIlIlI, final int lllllllllllllIIlIIIIIIllIlIIlIIl) {
        super(lllllllllllllIIlIIIIIIllIlIIlIlI, lllllllllllllIIlIIIIIIllIlIIlIIl);
    }
    
    @Override
    public int setBytes(int lllllllllllllIIlIIIIIIlIIIIIIIlI, final ScatteringByteChannel lllllllllllllIIlIIIIIIlIIIIIIIIl, final int lllllllllllllIIlIIIIIIlIIIIIIIII) throws IOException {
        this.checkIndex(lllllllllllllIIlIIIIIIlIIIIIIIlI, lllllllllllllIIlIIIIIIlIIIIIIIII);
        final ByteBuffer lllllllllllllIIlIIIIIIlIIIIIIlII = this.internalNioBuffer();
        lllllllllllllIIlIIIIIIlIIIIIIIlI = this.idx(lllllllllllllIIlIIIIIIlIIIIIIIlI);
        lllllllllllllIIlIIIIIIlIIIIIIlII.clear().position(lllllllllllllIIlIIIIIIlIIIIIIIlI).limit(lllllllllllllIIlIIIIIIlIIIIIIIlI + lllllllllllllIIlIIIIIIlIIIIIIIII);
        "".length();
        try {
            return lllllllllllllIIlIIIIIIlIIIIIIIIl.read(lllllllllllllIIlIIIIIIlIIIIIIlII);
        }
        catch (ClosedChannelException lllllllllllllIIlIIIIIIlIIIIIlIIl) {
            return PooledUnsafeDirectByteBuf.lIlIIIIllllIII[9];
        }
    }
    
    @Override
    protected void _setMedium(final int lllllllllllllIIlIIIIIIlIIllIIlII, final int lllllllllllllIIlIIIIIIlIIlIlllll) {
        final long lllllllllllllIIlIIIIIIlIIllIIIlI = this.addr(lllllllllllllIIlIIIIIIlIIllIIlII);
        PlatformDependent.putByte(lllllllllllllIIlIIIIIIlIIllIIIlI, (byte)(lllllllllllllIIlIIIIIIlIIlIlllll >>> PooledUnsafeDirectByteBuf.lIlIIIIllllIII[2]));
        PlatformDependent.putByte(lllllllllllllIIlIIIIIIlIIllIIIlI + 1L, (byte)(lllllllllllllIIlIIIIIIlIIlIlllll >>> PooledUnsafeDirectByteBuf.lIlIIIIllllIII[3]));
        PlatformDependent.putByte(lllllllllllllIIlIIIIIIlIIllIIIlI + 2L, (byte)lllllllllllllIIlIIIIIIlIIlIlllll);
    }
    
    @Override
    protected void _setByte(final int lllllllllllllIIlIIIIIIlIIlllIlII, final int lllllllllllllIIlIIIIIIlIIlllIllI) {
        PlatformDependent.putByte(this.addr(lllllllllllllIIlIIIIIIlIIlllIlII), (byte)lllllllllllllIIlIIIIIIlIIlllIllI);
    }
    
    @Override
    public int readBytes(final GatheringByteChannel lllllllllllllIIlIIIIIIlIIllllllI, final int lllllllllllllIIlIIIIIIlIlIIIIIIl) throws IOException {
        this.checkReadableBytes(lllllllllllllIIlIIIIIIlIlIIIIIIl);
        final int lllllllllllllIIlIIIIIIlIlIIIIIII = this.getBytes(this.readerIndex, lllllllllllllIIlIIIIIIlIIllllllI, lllllllllllllIIlIIIIIIlIlIIIIIIl, (boolean)(PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0] != 0));
        this.readerIndex += lllllllllllllIIlIIIIIIlIlIIIIIII;
        return lllllllllllllIIlIIIIIIlIlIIIIIII;
    }
    
    private static boolean lllIIIlIIIIllll(final int lllllllllllllIIlIIIIIIIllIIIllll) {
        return lllllllllllllIIlIIIIIIIllIIIllll != 0;
    }
    
    @Override
    public boolean hasArray() {
        return PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4] != 0;
    }
    
    private static void lllIIIlIIIIlIIl() {
        (lIlIIIIlllIIll = new String[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[3]])[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4]] = lllIIIlIIIIIIIl("vr7FmB1jjlM=", "vxClq");
        PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0]] = lllIIIlIIIIIlIl("8iQeGVPY464ZMpWu+ymODQ==", "GNvvU");
        PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[5]] = lllIIIlIIIIIlIl("S/1RwermQ1E=", "eRquL");
        PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[6]] = lllIIIlIIIIIIIl("xjyyzilo2pMV5OGgteSyfQ==", "dJKhD");
        PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[7]] = lllIIIlIIIIIlIl("Y38MwEzorBs=", "nJShM");
        PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[8]] = lllIIIlIIIIIIIl("JrRmb0H9lyHQ119LcckWQg==", "keigP");
        PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[10]] = lllIIIlIIIIIlIl("YZeHakQ2HR2sxKuxX07YGw==", "cHBZV");
        PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[11]] = lllIIIlIIIIIIIl("QwnKhZSxd00na5qikLfJEw==", "KPzZG");
    }
    
    @Override
    public ByteBuffer internalNioBuffer(int lllllllllllllIIlIIIIIIIlllIllIlI, final int lllllllllllllIIlIIIIIIIlllIlIllI) {
        this.checkIndex(lllllllllllllIIlIIIIIIIlllIllIlI, lllllllllllllIIlIIIIIIIlllIlIllI);
        lllllllllllllIIlIIIIIIIlllIllIlI = this.idx(lllllllllllllIIlIIIIIIIlllIllIlI);
        return (ByteBuffer)this.internalNioBuffer().clear().position(lllllllllllllIIlIIIIIIIlllIllIlI).limit(lllllllllllllIIlIIIIIIIlllIllIlI + lllllllllllllIIlIIIIIIIlllIlIllI);
    }
    
    private static boolean lllIIIlIIIlIIll(final int lllllllllllllIIlIIIIIIIllIIIllIl) {
        return lllllllllllllIIlIIIIIIIllIIIllIl == 0;
    }
    
    @Override
    public boolean isDirect() {
        return PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0] != 0;
    }
    
    @Override
    protected void _setInt(final int lllllllllllllIIlIIIIIIlIIlIlIllI, final int lllllllllllllIIlIIIIIIlIIlIlIlIl) {
        final long addr = this.addr(lllllllllllllIIlIIIIIIlIIlIlIllI);
        int reverseBytes;
        if (lllIIIlIIIIllll(PooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = lllllllllllllIIlIIIIIIlIIlIlIlIl;
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            reverseBytes = Integer.reverseBytes(lllllllllllllIIlIIIIIIlIIlIlIlIl);
        }
        PlatformDependent.putInt(addr, reverseBytes);
    }
    
    @Override
    public byte[] array() {
        throw new UnsupportedOperationException(PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[10]]);
    }
    
    @Override
    protected SwappedByteBuf newSwappedByteBuf() {
        return new UnsafeDirectSwappedByteBuf(this);
    }
    
    private static boolean lllIIIlIIIlIIlI(final int lllllllllllllIIlIIIIIIIllIIllIII, final int lllllllllllllIIlIIIIIIIllIIlIlll) {
        return lllllllllllllIIlIIIIIIIllIIllIII > lllllllllllllIIlIIIIIIIllIIlIlll;
    }
    
    private static String lllIIIlIIIIIlIl(final String lllllllllllllIIlIIIIIIIllIlIllIl, final String lllllllllllllIIlIIIIIIIllIlIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIIIllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIIllIlIllII.getBytes(StandardCharsets.UTF_8)), PooledUnsafeDirectByteBuf.lIlIIIIllllIII[3]), "DES");
            final Cipher lllllllllllllIIlIIIIIIIllIlIllll = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIIIIllIlIllll.init(PooledUnsafeDirectByteBuf.lIlIIIIllllIII[5], lllllllllllllIIlIIIIIIIllIllIIII);
            return new String(lllllllllllllIIlIIIIIIIllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIIllIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIIIllIlIlllI) {
            lllllllllllllIIlIIIIIIIllIlIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIIIIIIlIllIllllI, final byte[] lllllllllllllIIlIIIIIIlIllIlllIl, final int lllllllllllllIIlIIIIIIlIllIlllII, final int lllllllllllllIIlIIIIIIlIllIllIll) {
        this.checkIndex(lllllllllllllIIlIIIIIIlIllIllllI, lllllllllllllIIlIIIIIIlIllIllIll);
        if (lllIIIlIIIlIIII(lllllllllllllIIlIIIIIIlIllIlllIl)) {
            throw new NullPointerException(PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[5]]);
        }
        if (!lllIIIlIIIlIIIl(lllllllllllllIIlIIIIIIlIllIlllII) || lllIIIlIIIlIIlI(lllllllllllllIIlIIIIIIlIllIlllII, lllllllllllllIIlIIIIIIlIllIlllIl.length - lllllllllllllIIlIIIIIIlIllIllIll)) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[6]]).append(lllllllllllllIIlIIIIIIlIllIlllII)));
        }
        if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIllIllIll)) {
            PlatformDependent.copyMemory(this.addr(lllllllllllllIIlIIIIIIlIllIllllI), lllllllllllllIIlIIIIIIlIllIlllIl, lllllllllllllIIlIIIIIIlIllIlllII, lllllllllllllIIlIIIIIIlIllIllIll);
        }
        return this;
    }
    
    @Override
    protected int _getUnsignedMedium(final int lllllllllllllIIlIIIIIIllIIIIllll) {
        final long lllllllllllllIIlIIIIIIllIIIIlllI = this.addr(lllllllllllllIIlIIIIIIllIIIIllll);
        return (PlatformDependent.getByte(lllllllllllllIIlIIIIIIllIIIIlllI) & PooledUnsafeDirectByteBuf.lIlIIIIllllIII[1]) << PooledUnsafeDirectByteBuf.lIlIIIIllllIII[2] | (PlatformDependent.getByte(lllllllllllllIIlIIIIIIllIIIIlllI + 1L) & PooledUnsafeDirectByteBuf.lIlIIIIllllIII[1]) << PooledUnsafeDirectByteBuf.lIlIIIIllllIII[3] | (PlatformDependent.getByte(lllllllllllllIIlIIIIIIllIIIIlllI + 2L) & PooledUnsafeDirectByteBuf.lIlIIIIllllIII[1]);
    }
    
    @Override
    public int arrayOffset() {
        throw new UnsupportedOperationException(PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[11]]);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer lllllllllllllIIlIIIIIIlIlIllIlll) {
        final int lllllllllllllIIlIIIIIIlIlIlllIIl = lllllllllllllIIlIIIIIIlIlIllIlll.remaining();
        this.checkReadableBytes(lllllllllllllIIlIIIIIIlIlIlllIIl);
        this.getBytes(this.readerIndex, lllllllllllllIIlIIIIIIlIlIllIlll, (boolean)(PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0] != 0));
        this.readerIndex += lllllllllllllIIlIIIIIIlIlIlllIIl;
        return this;
    }
    
    private void getBytes(int lllllllllllllIIlIIIIIIlIllIIIIll, final ByteBuffer lllllllllllllIIlIIIIIIlIllIIIIlI, final boolean lllllllllllllIIlIIIIIIlIllIIIlll) {
        this.checkIndex(lllllllllllllIIlIIIIIIlIllIIIIll);
        final int lllllllllllllIIlIIIIIIlIllIIIllI = Math.min(this.capacity() - lllllllllllllIIlIIIIIIlIllIIIIll, lllllllllllllIIlIIIIIIlIllIIIIlI.remaining());
        ByteBuffer lllllllllllllIIlIIIIIIlIllIIIlIl;
        if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIllIIIlll ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIlIIIIIIlIllIIlIll = this.internalNioBuffer();
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            lllllllllllllIIlIIIIIIlIllIIIlIl = ((ByteBuffer)this.memory).duplicate();
        }
        lllllllllllllIIlIIIIIIlIllIIIIll = this.idx(lllllllllllllIIlIIIIIIlIllIIIIll);
        lllllllllllllIIlIIIIIIlIllIIIlIl.clear().position(lllllllllllllIIlIIIIIIlIllIIIIll).limit(lllllllllllllIIlIIIIIIlIllIIIIll + lllllllllllllIIlIIIIIIlIllIIIllI);
        "".length();
        lllllllllllllIIlIIIIIIlIllIIIIlI.put(lllllllllllllIIlIIIIIIlIllIIIlIl);
        "".length();
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIlIIIIIIlIIlIIIIII, final ByteBuf lllllllllllllIIlIIIIIIlIIIllllll, final int lllllllllllllIIlIIIIIIlIIIlllllI, final int lllllllllllllIIlIIIIIIlIIIllllIl) {
        this.checkIndex(lllllllllllllIIlIIIIIIlIIlIIIIII, lllllllllllllIIlIIIIIIlIIIllllIl);
        if (lllIIIlIIIlIIII(lllllllllllllIIlIIIIIIlIIIllllll)) {
            throw new NullPointerException(PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[7]]);
        }
        if (!lllIIIlIIIlIIIl(lllllllllllllIIlIIIIIIlIIIlllllI) || lllIIIlIIIlIIlI(lllllllllllllIIlIIIIIIlIIIlllllI, lllllllllllllIIlIIIIIIlIIIllllll.capacity() - lllllllllllllIIlIIIIIIlIIIllllIl)) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[8]]).append(lllllllllllllIIlIIIIIIlIIIlllllI)));
        }
        if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIIIllllIl)) {
            if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIIIllllll.hasMemoryAddress() ? 1 : 0)) {
                PlatformDependent.copyMemory(lllllllllllllIIlIIIIIIlIIIllllll.memoryAddress() + lllllllllllllIIlIIIIIIlIIIlllllI, this.addr(lllllllllllllIIlIIIIIIlIIlIIIIII), lllllllllllllIIlIIIIIIlIIIllllIl);
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIIIllllll.hasArray() ? 1 : 0)) {
                PlatformDependent.copyMemory(lllllllllllllIIlIIIIIIlIIIllllll.array(), lllllllllllllIIlIIIIIIlIIIllllll.arrayOffset() + lllllllllllllIIlIIIIIIlIIIlllllI, this.addr(lllllllllllllIIlIIIIIIlIIlIIIIII), lllllllllllllIIlIIIIIIlIIIllllIl);
                "".length();
                if ("  ".length() < 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlIIIIIIlIIIllllll.getBytes(lllllllllllllIIlIIIIIIlIIIlllllI, this, lllllllllllllIIlIIIIIIlIIlIIIIII, lllllllllllllIIlIIIIIIlIIIllllIl);
                "".length();
            }
        }
        return this;
    }
    
    @Override
    void init(final PoolChunk<ByteBuffer> lllllllllllllIIlIIIIIIllIIlllllI, final long lllllllllllllIIlIIIIIIllIIllIlll, final int lllllllllllllIIlIIIIIIllIIllIllI, final int lllllllllllllIIlIIIIIIllIIllIlIl, final int lllllllllllllIIlIIIIIIllIIlllIlI) {
        super.init(lllllllllllllIIlIIIIIIllIIlllllI, lllllllllllllIIlIIIIIIllIIllIlll, lllllllllllllIIlIIIIIIllIIllIllI, lllllllllllllIIlIIIIIIllIIllIlIl, lllllllllllllIIlIIIIIIllIIlllIlI);
        this.initMemoryAddress();
    }
    
    @Override
    protected byte _getByte(final int lllllllllllllIIlIIIIIIllIIIlllll) {
        return PlatformDependent.getByte(this.addr(lllllllllllllIIlIIIIIIllIIIlllll));
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIIIIIIlIlIlIlllI, final OutputStream lllllllllllllIIlIIIIIIlIlIlIllIl, final int lllllllllllllIIlIIIIIIlIlIlIllII) throws IOException {
        this.checkIndex(lllllllllllllIIlIIIIIIlIlIlIlllI, lllllllllllllIIlIIIIIIlIlIlIllII);
        if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIlIlIllII)) {
            final byte[] lllllllllllllIIlIIIIIIlIlIllIIII = new byte[lllllllllllllIIlIIIIIIlIlIlIllII];
            PlatformDependent.copyMemory(this.addr(lllllllllllllIIlIIIIIIlIlIlIlllI), lllllllllllllIIlIIIIIIlIlIllIIII, PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4], lllllllllllllIIlIIIIIIlIlIlIllII);
            lllllllllllllIIlIIIIIIlIlIlIllIl.write(lllllllllllllIIlIIIIIIlIlIllIIII);
        }
        return this;
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIlIIIIIIlIIIIlIlII, final InputStream lllllllllllllIIlIIIIIIlIIIIlIIll, final int lllllllllllllIIlIIIIIIlIIIIllIII) throws IOException {
        this.checkIndex(lllllllllllllIIlIIIIIIlIIIIlIlII, lllllllllllllIIlIIIIIIlIIIIllIII);
        final byte[] lllllllllllllIIlIIIIIIlIIIIlIlll = new byte[lllllllllllllIIlIIIIIIlIIIIllIII];
        final int lllllllllllllIIlIIIIIIlIIIIlIllI = lllllllllllllIIlIIIIIIlIIIIlIIll.read(lllllllllllllIIlIIIIIIlIIIIlIlll);
        if (lllIIIlIIIlIlIl(lllllllllllllIIlIIIIIIlIIIIlIllI)) {
            PlatformDependent.copyMemory(lllllllllllllIIlIIIIIIlIIIIlIlll, PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4], this.addr(lllllllllllllIIlIIIIIIlIIIIlIlII), lllllllllllllIIlIIIIIIlIIIIlIllI);
        }
        return lllllllllllllIIlIIIIIIlIIIIlIllI;
    }
    
    @Override
    protected void _setLong(final int lllllllllllllIIlIIIIIIlIIlIlIIII, final long lllllllllllllIIlIIIIIIlIIlIIllII) {
        final long addr = this.addr(lllllllllllllIIlIIIIIIlIIlIlIIII);
        long reverseBytes;
        if (lllIIIlIIIIllll(PooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = lllllllllllllIIlIIIIIIlIIlIIllII;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            reverseBytes = Long.reverseBytes(lllllllllllllIIlIIIIIIlIIlIIllII);
        }
        PlatformDependent.putLong(addr, reverseBytes);
    }
    
    private static boolean lllIIIlIIIlIlIl(final int lllllllllllllIIlIIIIIIIllIIIlIIl) {
        return lllllllllllllIIlIIIIIIIllIIIlIIl > 0;
    }
    
    @Override
    public int nioBufferCount() {
        return PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0];
    }
    
    private long addr(final int lllllllllllllIIlIIIIIIIlllIIlIll) {
        return this.memoryAddress + lllllllllllllIIlIIIIIIIlllIIlIll;
    }
    
    @Override
    protected Recycler<?> recycler() {
        return PooledUnsafeDirectByteBuf.RECYCLER;
    }
    
    private void initMemoryAddress() {
        this.memoryAddress = PlatformDependent.directBufferAddress((ByteBuffer)this.memory) + this.offset;
    }
    
    @Override
    protected void _setShort(final int lllllllllllllIIlIIIIIIlIIllIlllI, final int lllllllllllllIIlIIIIIIlIIllIlIlI) {
        final long addr = this.addr(lllllllllllllIIlIIIIIIlIIllIlllI);
        short reverseBytes;
        if (lllIIIlIIIIllll(PooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = (short)lllllllllllllIIlIIIIIIlIIllIlIlI;
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            reverseBytes = Short.reverseBytes((short)lllllllllllllIIlIIIIIIlIIllIlIlI);
        }
        PlatformDependent.putShort(addr, reverseBytes);
    }
    
    @Override
    public ByteBuffer nioBuffer(int lllllllllllllIIlIIIIIIIllllIIIll, final int lllllllllllllIIlIIIIIIIlllIlllll) {
        this.checkIndex(lllllllllllllIIlIIIIIIIllllIIIll, lllllllllllllIIlIIIIIIIlllIlllll);
        lllllllllllllIIlIIIIIIIllllIIIll = this.idx(lllllllllllllIIlIIIIIIIllllIIIll);
        return ((ByteBuffer)((ByteBuffer)this.memory).duplicate().position(lllllllllllllIIlIIIIIIIllllIIIll).limit(lllllllllllllIIlIIIIIIIllllIIIll + lllllllllllllIIlIIIIIIIlllIlllll)).slice();
    }
    
    private static boolean lllIIIlIIIlIlII(final Object lllllllllllllIIlIIIIIIIllIIlIlII, final Object lllllllllllllIIlIIIIIIIllIIlIIll) {
        return lllllllllllllIIlIIIIIIIllIIlIlII == lllllllllllllIIlIIIIIIIllIIlIIll;
    }
    
    private static boolean lllIIIlIIIlIIII(final Object lllllllllllllIIlIIIIIIIllIIlIIIl) {
        return lllllllllllllIIlIIIIIIIllIIlIIIl == null;
    }
    
    private static String lllIIIlIIIIIIIl(final String lllllllllllllIIlIIIIIIIllIIllllI, final String lllllllllllllIIlIIIIIIIllIIlllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIIIIllIlIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIIIIllIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIIIIIllIlIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIIIIIllIlIIIlI.init(PooledUnsafeDirectByteBuf.lIlIIIIllllIII[5], lllllllllllllIIlIIIIIIIllIlIIIll);
            return new String(lllllllllllllIIlIIIIIIIllIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIIIIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIIIIllIlIIIIl) {
            lllllllllllllIIlIIIIIIIllIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIIIIIIlIlllIllIl, final ByteBuf lllllllllllllIIlIIIIIIlIlllIllII, final int lllllllllllllIIlIIIIIIlIlllIlIll, final int lllllllllllllIIlIIIIIIlIlllIllll) {
        this.checkIndex(lllllllllllllIIlIIIIIIlIlllIllIl, lllllllllllllIIlIIIIIIlIlllIllll);
        if (lllIIIlIIIlIIII(lllllllllllllIIlIIIIIIlIlllIllII)) {
            throw new NullPointerException(PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4]]);
        }
        if (!lllIIIlIIIlIIIl(lllllllllllllIIlIIIIIIlIlllIlIll) || lllIIIlIIIlIIlI(lllllllllllllIIlIIIIIIlIlllIlIll, lllllllllllllIIlIIIIIIlIlllIllII.capacity() - lllllllllllllIIlIIIIIIlIlllIllll)) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(PooledUnsafeDirectByteBuf.lIlIIIIlllIIll[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0]]).append(lllllllllllllIIlIIIIIIlIlllIlIll)));
        }
        if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIlllIllll)) {
            if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIlllIllII.hasMemoryAddress() ? 1 : 0)) {
                PlatformDependent.copyMemory(this.addr(lllllllllllllIIlIIIIIIlIlllIllIl), lllllllllllllIIlIIIIIIlIlllIllII.memoryAddress() + lllllllllllllIIlIIIIIIlIlllIlIll, lllllllllllllIIlIIIIIIlIlllIllll);
                "".length();
                if (("   ".length() ^ (0x55 ^ 0x52)) < "   ".length()) {
                    return null;
                }
            }
            else if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIlllIllII.hasArray() ? 1 : 0)) {
                PlatformDependent.copyMemory(this.addr(lllllllllllllIIlIIIIIIlIlllIllIl), lllllllllllllIIlIIIIIIlIlllIllII.array(), lllllllllllllIIlIIIIIIlIlllIllII.arrayOffset() + lllllllllllllIIlIIIIIIlIlllIlIll, lllllllllllllIIlIIIIIIlIlllIllll);
                "".length();
                if (-(0x70 ^ 0x6E ^ (0x93 ^ 0x88)) >= 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlIIIIIIlIlllIllII.setBytes(lllllllllllllIIlIIIIIIlIlllIlIll, this, lllllllllllllIIlIIIIIIlIlllIllIl, lllllllllllllIIlIIIIIIlIlllIllll);
                "".length();
            }
        }
        return this;
    }
    
    @Override
    public int getBytes(final int lllllllllllllIIlIIIIIIlIlIlIIIIl, final GatheringByteChannel lllllllllllllIIlIIIIIIlIlIlIIIII, final int lllllllllllllIIlIIIIIIlIlIIlllll) throws IOException {
        return this.getBytes(lllllllllllllIIlIIIIIIlIlIlIIIIl, lllllllllllllIIlIIIIIIlIlIlIIIII, lllllllllllllIIlIIIIIIlIlIIlllll, (boolean)(PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4] != 0));
    }
    
    private static boolean lllIIIlIIIlIIIl(final int lllllllllllllIIlIIIIIIIllIIIlIll) {
        return lllllllllllllIIlIIIIIIIllIIIlIll >= 0;
    }
    
    private int getBytes(int lllllllllllllIIlIIIIIIlIlIIlIIlI, final GatheringByteChannel lllllllllllllIIlIIIIIIlIlIIIlIll, final int lllllllllllllIIlIIIIIIlIlIIIlIlI, final boolean lllllllllllllIIlIIIIIIlIlIIIllll) throws IOException {
        this.checkIndex(lllllllllllllIIlIIIIIIlIlIIlIIlI, lllllllllllllIIlIIIIIIlIlIIIlIlI);
        if (lllIIIlIIIlIIll(lllllllllllllIIlIIIIIIlIlIIIlIlI)) {
            return PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4];
        }
        ByteBuffer lllllllllllllIIlIIIIIIlIlIIIlllI;
        if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIlIIIllll ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIlIIIIIIlIlIIlIlII = this.internalNioBuffer();
            "".length();
            if ((18 + 59 - 20 + 89 ^ 128 + 42 - 131 + 112) == 0x0) {
                return (107 + 52 - 87 + 131 ^ 133 + 106 - 233 + 140) & (71 + 195 - 220 + 185 ^ 79 + 65 - 36 + 82 ^ -" ".length());
            }
        }
        else {
            lllllllllllllIIlIIIIIIlIlIIIlllI = ((ByteBuffer)this.memory).duplicate();
        }
        lllllllllllllIIlIIIIIIlIlIIlIIlI = this.idx(lllllllllllllIIlIIIIIIlIlIIlIIlI);
        lllllllllllllIIlIIIIIIlIlIIIlllI.clear().position(lllllllllllllIIlIIIIIIlIlIIlIIlI).limit(lllllllllllllIIlIIIIIIlIlIIlIIlI + lllllllllllllIIlIIIIIIlIlIIIlIlI);
        "".length();
        return lllllllllllllIIlIIIIIIlIlIIIlIll.write(lllllllllllllIIlIIIIIIlIlIIIlllI);
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIlIIIIIIlIIIllIIIl, final byte[] lllllllllllllIIlIIIIIIlIIIllIIII, final int lllllllllllllIIlIIIIIIlIIIllIlII, final int lllllllllllllIIlIIIIIIlIIIllIIll) {
        this.checkIndex(lllllllllllllIIlIIIIIIlIIIllIIIl, lllllllllllllIIlIIIIIIlIIIllIIll);
        if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIlIIIllIIll)) {
            PlatformDependent.copyMemory(lllllllllllllIIlIIIIIIlIIIllIIII, lllllllllllllIIlIIIIIIlIIIllIlII, this.addr(lllllllllllllIIlIIIIIIlIIIllIIIl), lllllllllllllIIlIIIIIIlIIIllIIll);
        }
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIlIIIIIIlIllIlIllI, final ByteBuffer lllllllllllllIIlIIIIIIlIllIlIIlI) {
        this.getBytes(lllllllllllllIIlIIIIIIlIllIlIllI, lllllllllllllIIlIIIIIIlIllIlIIlI, (boolean)(PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4] != 0));
        return this;
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIIlIIIIIIIllllIllII, final int lllllllllllllIIlIIIIIIIllllIlIll) {
        final ByteBuffer[] array = new ByteBuffer[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0]];
        array[PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4]] = this.nioBuffer(lllllllllllllIIlIIIIIIIllllIllII, lllllllllllllIIlIIIIIIIllllIlIll);
        return array;
    }
    
    static PooledUnsafeDirectByteBuf newInstance(final int lllllllllllllIIlIIIIIIllIlIlIIlI) {
        final PooledUnsafeDirectByteBuf lllllllllllllIIlIIIIIIllIlIlIIIl = PooledUnsafeDirectByteBuf.RECYCLER.get();
        lllllllllllllIIlIIIIIIllIlIlIIIl.setRefCnt(PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0]);
        lllllllllllllIIlIIIIIIllIlIlIIIl.maxCapacity(lllllllllllllIIlIIIIIIllIlIlIIlI);
        return lllllllllllllIIlIIIIIIllIlIlIIIl;
    }
    
    @Override
    public long memoryAddress() {
        return this.memoryAddress;
    }
    
    @Override
    void initUnpooled(final PoolChunk<ByteBuffer> lllllllllllllIIlIIIIIIllIIlIllII, final int lllllllllllllIIlIIIIIIllIIlIlllI) {
        super.initUnpooled(lllllllllllllIIlIIIIIIllIIlIllII, lllllllllllllIIlIIIIIIllIIlIlllI);
        this.initMemoryAddress();
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0] != 0;
    }
    
    private static void lllIIIlIIIIllIl() {
        (lIlIIIIllllIII = new int[12])[0] = " ".length();
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[1] = 119 + 123 - 207 + 106 + (0xA6 ^ 0xB7) - (0xA7 ^ 0xBF) + (0x7C ^ 0x5);
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[2] = (0x94 ^ 0x85 ^ " ".length());
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[3] = (7 + 100 + 3 + 42 ^ 99 + 103 - 199 + 141);
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4] = ((0x84 ^ 0x83) & ~(0x6 ^ 0x1));
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[5] = "  ".length();
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[6] = "   ".length();
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[7] = (12 + 166 - 46 + 38 ^ 97 + 56 - 31 + 52);
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[8] = (0xA4 ^ 0xA1);
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[9] = -" ".length();
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[10] = (0x2C ^ 0x30 ^ (0x2F ^ 0x35));
        PooledUnsafeDirectByteBuf.lIlIIIIllllIII[11] = (0x8F ^ 0x88);
    }
    
    static {
        lllIIIlIIIIllIl();
        lllIIIlIIIIlIIl();
        int native_ORDER;
        if (lllIIIlIIIlIlII(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN)) {
            native_ORDER = PooledUnsafeDirectByteBuf.lIlIIIIllllIII[0];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            native_ORDER = PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4];
        }
        NATIVE_ORDER = (native_ORDER != 0);
        RECYCLER = new Recycler<PooledUnsafeDirectByteBuf>() {
            private static final /* synthetic */ int[] llIlIIlllIIIIl;
            
            static {
                lIIlIIllIIlIlIlI();
            }
            
            private static void lIIlIIllIIlIlIlI() {
                (llIlIIlllIIIIl = new int[1])[0] = ((0x3D ^ 0x20) & ~(0x1E ^ 0x3));
            }
            
            @Override
            protected PooledUnsafeDirectByteBuf newObject(final Handle llllllllllllIllIlIlllIIlIlIIIIII) {
                return new PooledUnsafeDirectByteBuf(llllllllllllIllIlIlllIIlIlIIIIII, PooledUnsafeDirectByteBuf$1.llIlIIlllIIIIl[0], null);
            }
        };
    }
    
    @Override
    protected int _getInt(final int lllllllllllllIIlIIIIIIllIIIIIIll) {
        final int lllllllllllllIIlIIIIIIllIIIIIlIl = PlatformDependent.getInt(this.addr(lllllllllllllIIlIIIIIIllIIIIIIll));
        int reverseBytes;
        if (lllIIIlIIIIllll(PooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = lllllllllllllIIlIIIIIIllIIIIIlIl;
            "".length();
            if (null != null) {
                return (0x29 ^ 0x11) & ~(0x40 ^ 0x78);
            }
        }
        else {
            reverseBytes = Integer.reverseBytes(lllllllllllllIIlIIIIIIllIIIIIlIl);
        }
        return reverseBytes;
    }
    
    @Override
    protected long _getLong(final int lllllllllllllIIlIIIIIIlIlllllIlI) {
        final long lllllllllllllIIlIIIIIIlIllllllII = PlatformDependent.getLong(this.addr(lllllllllllllIIlIIIIIIlIlllllIlI));
        long reverseBytes;
        if (lllIIIlIIIIllll(PooledUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = lllllllllllllIIlIIIIIIlIllllllII;
            "".length();
            if (-" ".length() >= 0) {
                return 0L;
            }
        }
        else {
            reverseBytes = Long.reverseBytes(lllllllllllllIIlIIIIIIlIllllllII);
        }
        return reverseBytes;
    }
    
    @Override
    public ByteBuf setBytes(int lllllllllllllIIlIIIIIIlIIIlIIlII, ByteBuffer lllllllllllllIIlIIIIIIlIIIlIIIll) {
        this.checkIndex(lllllllllllllIIlIIIIIIlIIIlIIlII, ((Buffer)lllllllllllllIIlIIIIIIlIIIlIIIll).remaining());
        final ByteBuffer lllllllllllllIIlIIIIIIlIIIlIIllI = this.internalNioBuffer();
        if (lllIIIlIIIlIlII(lllllllllllllIIlIIIIIIlIIIlIIIll, lllllllllllllIIlIIIIIIlIIIlIIllI)) {
            lllllllllllllIIlIIIIIIlIIIlIIIll = ((ByteBuffer)lllllllllllllIIlIIIIIIlIIIlIIIll).duplicate();
        }
        lllllllllllllIIlIIIIIIlIIIlIIlII = this.idx(lllllllllllllIIlIIIIIIlIIIlIIlII);
        lllllllllllllIIlIIIIIIlIIIlIIllI.clear().position(lllllllllllllIIlIIIIIIlIIIlIIlII).limit(lllllllllllllIIlIIIIIIlIIIlIIlII + ((Buffer)lllllllllllllIIlIIIIIIlIIIlIIIll).remaining());
        "".length();
        lllllllllllllIIlIIIIIIlIIIlIIllI.put((ByteBuffer)lllllllllllllIIlIIIIIIlIIIlIIIll);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIIlIIIIIIIlllllIlII, final int lllllllllllllIIlIIIIIIIlllllIlll) {
        this.checkIndex(lllllllllllllIIlIIIIIIIlllllIlII, lllllllllllllIIlIIIIIIIlllllIlll);
        final ByteBuf lllllllllllllIIlIIIIIIIlllllIllI = this.alloc().directBuffer(lllllllllllllIIlIIIIIIIlllllIlll, this.maxCapacity());
        if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIIlllllIlll)) {
            if (lllIIIlIIIIllll(lllllllllllllIIlIIIIIIIlllllIllI.hasMemoryAddress() ? 1 : 0)) {
                PlatformDependent.copyMemory(this.addr(lllllllllllllIIlIIIIIIIlllllIlII), lllllllllllllIIlIIIIIIIlllllIllI.memoryAddress(), lllllllllllllIIlIIIIIIIlllllIlll);
                lllllllllllllIIlIIIIIIIlllllIllI.setIndex(PooledUnsafeDirectByteBuf.lIlIIIIllllIII[4], lllllllllllllIIlIIIIIIIlllllIlll);
                "".length();
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlIIIIIIIlllllIllI.writeBytes(this, lllllllllllllIIlIIIIIIIlllllIlII, lllllllllllllIIlIIIIIIIlllllIlll);
                "".length();
            }
        }
        return lllllllllllllIIlIIIIIIIlllllIllI;
    }
}
