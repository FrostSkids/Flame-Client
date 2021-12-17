// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.channels.ClosedChannelException;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.GatheringByteChannel;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import io.netty.util.internal.PlatformDependent;
import java.nio.ByteBuffer;
import io.netty.util.Recycler;

final class PooledHeapByteBuf extends PooledByteBuf<byte[]>
{
    private static final /* synthetic */ int[] lIlllIIllllIII;
    private static final /* synthetic */ Recycler<PooledHeapByteBuf> RECYCLER;
    
    @Override
    protected void _setShort(int llllllllllllIlllllIIlIIlIIlIIlII, final int llllllllllllIlllllIIlIIlIIlIIIII) {
        llllllllllllIlllllIIlIIlIIlIIlII = this.idx(llllllllllllIlllllIIlIIlIIlIIlII);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIlIIlII] = (byte)(llllllllllllIlllllIIlIIlIIlIIIII >>> PooledHeapByteBuf.lIlllIIllllIII[2]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIlIIlII + PooledHeapByteBuf.lIlllIIllllIII[0]] = (byte)llllllllllllIlllllIIlIIlIIlIIIII;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlllllIIlIIIlllIIIIl, final ByteBuffer llllllllllllIlllllIIlIIIlllIIIII) {
        final int llllllllllllIlllllIIlIIIllIlllll = llllllllllllIlllllIIlIIIlllIIIII.remaining();
        this.checkIndex(llllllllllllIlllllIIlIIIlllIIIIl, llllllllllllIlllllIIlIIIllIlllll);
        llllllllllllIlllllIIlIIIlllIIIII.get((byte[])(Object)this.memory, this.idx(llllllllllllIlllllIIlIIIlllIIIIl), llllllllllllIlllllIIlIIIllIlllll);
        "".length();
        return this;
    }
    
    @Override
    protected long _getLong(int llllllllllllIlllllIIlIIllIIlIIII) {
        llllllllllllIlllllIIlIIllIIlIIII = this.idx(llllllllllllIlllllIIlIIllIIlIIII);
        return ((long)((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIIII] & 0xFFL) << PooledHeapByteBuf.lIlllIIllllIII[8] | ((long)((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIIII + PooledHeapByteBuf.lIlllIIllllIII[0]] & 0xFFL) << PooledHeapByteBuf.lIlllIIllllIII[9] | ((long)((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIIII + PooledHeapByteBuf.lIlllIIllllIII[5]] & 0xFFL) << PooledHeapByteBuf.lIlllIIllllIII[10] | ((long)((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIIII + PooledHeapByteBuf.lIlllIIllllIII[7]] & 0xFFL) << PooledHeapByteBuf.lIlllIIllllIII[11] | ((long)((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIIII + PooledHeapByteBuf.lIlllIIllllIII[12]] & 0xFFL) << PooledHeapByteBuf.lIlllIIllllIII[6] | ((long)((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIIII + PooledHeapByteBuf.lIlllIIllllIII[13]] & 0xFFL) << PooledHeapByteBuf.lIlllIIllllIII[4] | ((long)((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIIII + PooledHeapByteBuf.lIlllIIllllIII[14]] & 0xFFL) << PooledHeapByteBuf.lIlllIIllllIII[2] | ((long)((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIIII + PooledHeapByteBuf.lIlllIIllllIII[15]] & 0xFFL);
    }
    
    @Override
    protected Recycler<?> recycler() {
        return PooledHeapByteBuf.RECYCLER;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlllllIIlIIIlllllllI, final ByteBuf llllllllllllIlllllIIlIIIllllllIl, final int llllllllllllIlllllIIlIIIllllIlll, final int llllllllllllIlllllIIlIIIllllIllI) {
        this.checkSrcIndex(llllllllllllIlllllIIlIIIlllllllI, llllllllllllIlllllIIlIIIllllIllI, llllllllllllIlllllIIlIIIllllIlll, llllllllllllIlllllIIlIIIllllllIl.capacity());
        if (lIIIIIlIIlIIlllI(llllllllllllIlllllIIlIIIllllllIl.hasMemoryAddress() ? 1 : 0)) {
            PlatformDependent.copyMemory(llllllllllllIlllllIIlIIIllllllIl.memoryAddress() + llllllllllllIlllllIIlIIIllllIlll, (byte[])(Object)this.memory, this.idx(llllllllllllIlllllIIlIIIlllllllI), llllllllllllIlllllIIlIIIllllIllI);
            "".length();
            if (-(0xAF ^ 0xB9 ^ (0x14 ^ 0x6)) >= 0) {
                return null;
            }
        }
        else if (lIIIIIlIIlIIlllI(llllllllllllIlllllIIlIIIllllllIl.hasArray() ? 1 : 0)) {
            this.setBytes(llllllllllllIlllllIIlIIIlllllllI, llllllllllllIlllllIIlIIIllllllIl.array(), llllllllllllIlllllIIlIIIllllllIl.arrayOffset() + llllllllllllIlllllIIlIIIllllIlll, llllllllllllIlllllIIlIIIllllIllI);
            "".length();
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        else {
            llllllllllllIlllllIIlIIIllllllIl.getBytes(llllllllllllIlllllIIlIIIllllIlll, (byte[])(Object)this.memory, this.idx(llllllllllllIlllllIIlIIIlllllllI), llllllllllllIlllllIIlIIIllllIllI);
            "".length();
        }
        return this;
    }
    
    @Override
    public boolean isDirect() {
        return PooledHeapByteBuf.lIlllIIllllIII[1] != 0;
    }
    
    @Override
    public int setBytes(final int llllllllllllIlllllIIlIIIllIlIlIl, final InputStream llllllllllllIlllllIIlIIIllIlIIII, final int llllllllllllIlllllIIlIIIllIIllll) throws IOException {
        this.checkIndex(llllllllllllIlllllIIlIIIllIlIlIl, llllllllllllIlllllIIlIIIllIIllll);
        return llllllllllllIlllllIIlIIIllIlIIII.read((byte[])(Object)this.memory, this.idx(llllllllllllIlllllIIlIIIllIlIlIl), llllllllllllIlllllIIlIIIllIIllll);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(int llllllllllllIlllllIIlIIIlIIlIllI, final int llllllllllllIlllllIIlIIIlIIlIlIl) {
        this.checkIndex(llllllllllllIlllllIIlIIIlIIlIllI, llllllllllllIlllllIIlIIIlIIlIlIl);
        llllllllllllIlllllIIlIIIlIIlIllI = this.idx(llllllllllllIlllllIIlIIIlIIlIllI);
        return (ByteBuffer)this.internalNioBuffer().clear().position(llllllllllllIlllllIIlIIIlIIlIllI).limit(llllllllllllIlllllIIlIIIlIIlIllI + llllllllllllIlllllIIlIIIlIIlIlIl);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlllllIIlIIlIllIIIll, final OutputStream llllllllllllIlllllIIlIIlIllIIIlI, final int llllllllllllIlllllIIlIIlIlIlllIl) throws IOException {
        this.checkIndex(llllllllllllIlllllIIlIIlIllIIIll, llllllllllllIlllllIIlIIlIlIlllIl);
        llllllllllllIlllllIIlIIlIllIIIlI.write((byte[])(Object)this.memory, this.idx(llllllllllllIlllllIIlIIlIllIIIll), llllllllllllIlllllIIlIIlIlIlllIl);
        return this;
    }
    
    private static void lIIIIIlIIlIIllIl() {
        (lIlllIIllllIII = new int[17])[0] = " ".length();
        PooledHeapByteBuf.lIlllIIllllIII[1] = ((0x95 ^ 0xA3 ^ (0xDB ^ 0xAE)) & (0xB1 ^ 0x8D ^ 70 + 122 - 81 + 16 ^ -" ".length()));
        PooledHeapByteBuf.lIlllIIllllIII[2] = (42 + 76 - 14 + 38 ^ 62 + 23 - 65 + 114);
        PooledHeapByteBuf.lIlllIIllllIII[3] = 167 + 141 - 244 + 191;
        PooledHeapByteBuf.lIlllIIllllIII[4] = (0x93 ^ 0x83);
        PooledHeapByteBuf.lIlllIIllllIII[5] = "  ".length();
        PooledHeapByteBuf.lIlllIIllllIII[6] = (0x3A ^ 0x54 ^ (0x19 ^ 0x6F));
        PooledHeapByteBuf.lIlllIIllllIII[7] = "   ".length();
        PooledHeapByteBuf.lIlllIIllllIII[8] = (0x65 ^ 0x5D);
        PooledHeapByteBuf.lIlllIIllllIII[9] = (0x6 ^ 0x36);
        PooledHeapByteBuf.lIlllIIllllIII[10] = (0x86 ^ 0x8B ^ (0x71 ^ 0x54));
        PooledHeapByteBuf.lIlllIIllllIII[11] = (0x6A ^ 0x62 ^ (0x8A ^ 0xA2));
        PooledHeapByteBuf.lIlllIIllllIII[12] = (119 + 61 - 157 + 126 ^ 4 + 104 + 7 + 30);
        PooledHeapByteBuf.lIlllIIllllIII[13] = (0x1B ^ 0x6C ^ (0xDE ^ 0xAC));
        PooledHeapByteBuf.lIlllIIllllIII[14] = (0x6F ^ 0x69);
        PooledHeapByteBuf.lIlllIIllllIII[15] = (0xBC ^ 0xBB);
        PooledHeapByteBuf.lIlllIIllllIII[16] = -" ".length();
    }
    
    @Override
    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }
    
    private int getBytes(int llllllllllllIlllllIIlIIlIlIIIIlI, final GatheringByteChannel llllllllllllIlllllIIlIIlIlIIIIIl, final int llllllllllllIlllllIIlIIlIlIIIllI, final boolean llllllllllllIlllllIIlIIlIIllllll) throws IOException {
        this.checkIndex(llllllllllllIlllllIIlIIlIlIIIIlI, llllllllllllIlllllIIlIIlIlIIIllI);
        llllllllllllIlllllIIlIIlIlIIIIlI = this.idx(llllllllllllIlllllIIlIIlIlIIIIlI);
        ByteBuffer llllllllllllIlllllIIlIIlIlIIIlII = null;
        if (lIIIIIlIIlIIlllI(llllllllllllIlllllIIlIIlIIllllll ? 1 : 0)) {
            final ByteBuffer llllllllllllIlllllIIlIIlIlIIlIlI = this.internalNioBuffer();
            "".length();
            if ("  ".length() < ((224 + 213 - 259 + 54 ^ 138 + 16 - 146 + 191) & (0x53 ^ 0x14 ^ (0x68 ^ 0x0) ^ -" ".length()))) {
                return (0x25 ^ 0x70 ^ (0xB4 ^ 0xA1)) & (0x93 ^ 0xC4 ^ (0x2F ^ 0x38) ^ -" ".length());
            }
        }
        else {
            llllllllllllIlllllIIlIIlIlIIIlII = ByteBuffer.wrap((byte[])(Object)this.memory);
        }
        return llllllllllllIlllllIIlIIlIlIIIIIl.write((ByteBuffer)llllllllllllIlllllIIlIIlIlIIIlII.clear().position(llllllllllllIlllllIIlIIlIlIIIIlI).limit(llllllllllllIlllllIIlIIlIlIIIIlI + llllllllllllIlllllIIlIIlIlIIIllI));
    }
    
    @Override
    public int setBytes(int llllllllllllIlllllIIlIIIllIIIlll, final ScatteringByteChannel llllllllllllIlllllIIlIIIllIIIllI, final int llllllllllllIlllllIIlIIIllIIIIIl) throws IOException {
        this.checkIndex(llllllllllllIlllllIIlIIIllIIIlll, llllllllllllIlllllIIlIIIllIIIIIl);
        llllllllllllIlllllIIlIIIllIIIlll = this.idx(llllllllllllIlllllIIlIIIllIIIlll);
        try {
            return llllllllllllIlllllIIlIIIllIIIllI.read((ByteBuffer)this.internalNioBuffer().clear().position(llllllllllllIlllllIIlIIIllIIIlll).limit(llllllllllllIlllllIIlIIIllIIIlll + llllllllllllIlllllIIlIIIllIIIIIl));
        }
        catch (ClosedChannelException llllllllllllIlllllIIlIIIllIIlIIl) {
            return PooledHeapByteBuf.lIlllIIllllIII[16];
        }
    }
    
    @Override
    protected void _setInt(int llllllllllllIlllllIIlIIlIIIIllll, final int llllllllllllIlllllIIlIIlIIIlIIIl) {
        llllllllllllIlllllIIlIIlIIIIllll = (char)this.idx(llllllllllllIlllllIIlIIlIIIIllll);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIllll] = (byte)(llllllllllllIlllllIIlIIlIIIlIIIl >>> PooledHeapByteBuf.lIlllIIllllIII[6]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIllll + PooledHeapByteBuf.lIlllIIllllIII[0]] = (byte)(llllllllllllIlllllIIlIIlIIIlIIIl >>> PooledHeapByteBuf.lIlllIIllllIII[4]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIllll + PooledHeapByteBuf.lIlllIIllllIII[5]] = (byte)(llllllllllllIlllllIIlIIlIIIlIIIl >>> PooledHeapByteBuf.lIlllIIllllIII[2]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIllll + PooledHeapByteBuf.lIlllIIllllIII[7]] = (byte)llllllllllllIlllllIIlIIlIIIlIIIl;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlllllIIlIIllIIIIlII, final ByteBuf llllllllllllIlllllIIlIIllIIIlIII, final int llllllllllllIlllllIIlIIllIIIIlll, final int llllllllllllIlllllIIlIIllIIIIIIl) {
        this.checkDstIndex(llllllllllllIlllllIIlIIllIIIIlII, llllllllllllIlllllIIlIIllIIIIIIl, llllllllllllIlllllIIlIIllIIIIlll, llllllllllllIlllllIIlIIllIIIlIII.capacity());
        if (lIIIIIlIIlIIlllI(llllllllllllIlllllIIlIIllIIIlIII.hasMemoryAddress() ? 1 : 0)) {
            PlatformDependent.copyMemory((byte[])(Object)this.memory, this.idx(llllllllllllIlllllIIlIIllIIIIlII), llllllllllllIlllllIIlIIllIIIlIII.memoryAddress() + llllllllllllIlllllIIlIIllIIIIlll, llllllllllllIlllllIIlIIllIIIIIIl);
            "".length();
            if (-(0x14 ^ 0x47 ^ (0x93 ^ 0xC5)) >= 0) {
                return null;
            }
        }
        else if (lIIIIIlIIlIIlllI(llllllllllllIlllllIIlIIllIIIlIII.hasArray() ? 1 : 0)) {
            this.getBytes(llllllllllllIlllllIIlIIllIIIIlII, llllllllllllIlllllIIlIIllIIIlIII.array(), llllllllllllIlllllIIlIIllIIIlIII.arrayOffset() + llllllllllllIlllllIIlIIllIIIIlll, llllllllllllIlllllIIlIIllIIIIIIl);
            "".length();
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        else {
            llllllllllllIlllllIIlIIllIIIlIII.setBytes(llllllllllllIlllllIIlIIllIIIIlll, (byte[])(Object)this.memory, this.idx(llllllllllllIlllllIIlIIllIIIIlII), llllllllllllIlllllIIlIIllIIIIIIl);
            "".length();
        }
        return this;
    }
    
    @Override
    protected byte _getByte(final int llllllllllllIlllllIIlIIllIlIlIlI) {
        return ((byte[])(Object)this.memory)[this.idx(llllllllllllIlllllIIlIIllIlIlIlI)];
    }
    
    @Override
    public byte[] array() {
        return (byte[])(Object)this.memory;
    }
    
    private static boolean lIIIIIlIIlIIlllI(final int llllllllllllIlllllIIlIIIIlllIlIl) {
        return llllllllllllIlllllIIlIIIIlllIlIl != 0;
    }
    
    @Override
    protected void _setByte(final int llllllllllllIlllllIIlIIlIIlIllIl, final int llllllllllllIlllllIIlIIlIIlIlIIl) {
        ((byte[])(Object)this.memory)[this.idx(llllllllllllIlllllIIlIIlIIlIllIl)] = (byte)llllllllllllIlllllIIlIIlIIlIlIIl;
    }
    
    @Override
    protected void _setLong(int llllllllllllIlllllIIlIIlIIIIIllI, final long llllllllllllIlllllIIlIIlIIIIlIII) {
        llllllllllllIlllllIIlIIlIIIIIllI = this.idx((int)llllllllllllIlllllIIlIIlIIIIIllI);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIIllI] = (byte)(llllllllllllIlllllIIlIIlIIIIlIII >>> PooledHeapByteBuf.lIlllIIllllIII[8]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIIllI + PooledHeapByteBuf.lIlllIIllllIII[0]] = (byte)(llllllllllllIlllllIIlIIlIIIIlIII >>> PooledHeapByteBuf.lIlllIIllllIII[9]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIIllI + PooledHeapByteBuf.lIlllIIllllIII[5]] = (byte)(llllllllllllIlllllIIlIIlIIIIlIII >>> PooledHeapByteBuf.lIlllIIllllIII[10]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIIllI + PooledHeapByteBuf.lIlllIIllllIII[7]] = (byte)(llllllllllllIlllllIIlIIlIIIIlIII >>> PooledHeapByteBuf.lIlllIIllllIII[11]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIIllI + PooledHeapByteBuf.lIlllIIllllIII[12]] = (byte)(llllllllllllIlllllIIlIIlIIIIlIII >>> PooledHeapByteBuf.lIlllIIllllIII[6]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIIllI + PooledHeapByteBuf.lIlllIIllllIII[13]] = (byte)(llllllllllllIlllllIIlIIlIIIIlIII >>> PooledHeapByteBuf.lIlllIIllllIII[4]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIIllI + PooledHeapByteBuf.lIlllIIllllIII[14]] = (byte)(llllllllllllIlllllIIlIIlIIIIlIII >>> PooledHeapByteBuf.lIlllIIllllIII[2]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIIIllI + PooledHeapByteBuf.lIlllIIllllIII[15]] = (byte)llllllllllllIlllllIIlIIlIIIIlIII;
    }
    
    private PooledHeapByteBuf(final Recycler.Handle llllllllllllIlllllIIlIIllIllIIll, final int llllllllllllIlllllIIlIIllIlIllll) {
        super(llllllllllllIlllllIIlIIllIllIIll, llllllllllllIlllllIIlIIllIlIllll);
    }
    
    @Override
    public int readBytes(final GatheringByteChannel llllllllllllIlllllIIlIIlIIllIlII, final int llllllllllllIlllllIIlIIlIIllIIll) throws IOException {
        this.checkReadableBytes(llllllllllllIlllllIIlIIlIIllIIll);
        final int llllllllllllIlllllIIlIIlIIllIllI = this.getBytes(this.readerIndex, llllllllllllIlllllIIlIIlIIllIlII, llllllllllllIlllllIIlIIlIIllIIll, (boolean)(PooledHeapByteBuf.lIlllIIllllIII[0] != 0));
        this.readerIndex += llllllllllllIlllllIIlIIlIIllIllI;
        return llllllllllllIlllllIIlIIlIIllIllI;
    }
    
    @Override
    public int nioBufferCount() {
        return PooledHeapByteBuf.lIlllIIllllIII[0];
    }
    
    @Override
    public ByteBuf copy(final int llllllllllllIlllllIIlIIIlIllIllI, final int llllllllllllIlllllIIlIIIlIlllIIl) {
        this.checkIndex(llllllllllllIlllllIIlIIIlIllIllI, llllllllllllIlllllIIlIIIlIlllIIl);
        final ByteBuf llllllllllllIlllllIIlIIIlIlllIII = this.alloc().heapBuffer(llllllllllllIlllllIIlIIIlIlllIIl, this.maxCapacity());
        llllllllllllIlllllIIlIIIlIlllIII.writeBytes((byte[])(Object)this.memory, this.idx(llllllllllllIlllllIIlIIIlIllIllI), llllllllllllIlllllIIlIIIlIlllIIl);
        "".length();
        return llllllllllllIlllllIIlIIIlIlllIII;
    }
    
    @Override
    public boolean hasArray() {
        return PooledHeapByteBuf.lIlllIIllllIII[0] != 0;
    }
    
    @Override
    protected short _getShort(int llllllllllllIlllllIIlIIllIlIIIlI) {
        llllllllllllIlllllIIlIIllIlIIIlI = this.idx((int)llllllllllllIlllllIIlIIllIlIIIlI);
        return (short)(((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIlIIIlI] << PooledHeapByteBuf.lIlllIIllllIII[2] | (((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIlIIIlI + PooledHeapByteBuf.lIlllIIllllIII[0]] & PooledHeapByteBuf.lIlllIIllllIII[3]));
    }
    
    @Override
    protected ByteBuffer newInternalNioBuffer(final byte[] llllllllllllIlllllIIlIIIlIIIlIIl) {
        return ByteBuffer.wrap(llllllllllllIlllllIIlIIIlIIIlIIl);
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlllllIIlIIIlllIlIlI, final byte[] llllllllllllIlllllIIlIIIlllIlIIl, final int llllllllllllIlllllIIlIIIlllIllIl, final int llllllllllllIlllllIIlIIIlllIIlll) {
        this.checkSrcIndex(llllllllllllIlllllIIlIIIlllIlIlI, llllllllllllIlllllIIlIIIlllIIlll, llllllllllllIlllllIIlIIIlllIllIl, llllllllllllIlllllIIlIIIlllIlIIl.length);
        System.arraycopy(llllllllllllIlllllIIlIIIlllIlIIl, llllllllllllIlllllIIlIIIlllIllIl, this.memory, this.idx(llllllllllllIlllllIIlIIIlllIlIlI), llllllllllllIlllllIIlIIIlllIIlll);
        return this;
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int llllllllllllIlllllIIlIIIlIlIlllI, final int llllllllllllIlllllIIlIIIlIlIllIl) {
        final ByteBuffer[] array = new ByteBuffer[PooledHeapByteBuf.lIlllIIllllIII[0]];
        array[PooledHeapByteBuf.lIlllIIllllIII[1]] = this.nioBuffer(llllllllllllIlllllIIlIIIlIlIlllI, llllllllllllIlllllIIlIIIlIlIllIl);
        return array;
    }
    
    static {
        lIIIIIlIIlIIllIl();
        RECYCLER = new Recycler<PooledHeapByteBuf>() {
            private static final /* synthetic */ int[] lllIllIlIlIllI;
            
            static {
                lIlIIlIIllllIIIl();
            }
            
            private static void lIlIIlIIllllIIIl() {
                (lllIllIlIlIllI = new int[1])[0] = ((141 + 31 - 98 + 81 ^ 86 + 81 - 82 + 46) & (115 + 57 - 15 + 19 ^ 5 + 165 - 76 + 74 ^ -" ".length()));
            }
            
            @Override
            protected PooledHeapByteBuf newObject(final Handle llllllllllllIlIllIIlIIIIIlIIIIIl) {
                return new PooledHeapByteBuf(llllllllllllIlIllIIlIIIIIlIIIIIl, PooledHeapByteBuf$1.lllIllIlIlIllI[0], null);
            }
        };
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlllllIIlIIlIllIllIl, final ByteBuffer llllllllllllIlllllIIlIIlIllIlIIl) {
        this.checkIndex(llllllllllllIlllllIIlIIlIllIllIl);
        llllllllllllIlllllIIlIIlIllIlIIl.put((byte[])(Object)this.memory, this.idx(llllllllllllIlllllIIlIIlIllIllIl), Math.min(this.capacity() - llllllllllllIlllllIIlIIlIllIllIl, llllllllllllIlllllIIlIIlIllIlIIl.remaining()));
        "".length();
        return this;
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return PooledHeapByteBuf.lIlllIIllllIII[1] != 0;
    }
    
    @Override
    protected int _getUnsignedMedium(int llllllllllllIlllllIIlIIllIIlllII) {
        llllllllllllIlllllIIlIIllIIlllII = this.idx(llllllllllllIlllllIIlIIllIIlllII);
        return (((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlllII] & PooledHeapByteBuf.lIlllIIllllIII[3]) << PooledHeapByteBuf.lIlllIIllllIII[4] | (((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlllII + PooledHeapByteBuf.lIlllIIllllIII[0]] & PooledHeapByteBuf.lIlllIIllllIII[3]) << PooledHeapByteBuf.lIlllIIllllIII[2] | (((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlllII + PooledHeapByteBuf.lIlllIIllllIII[5]] & PooledHeapByteBuf.lIlllIIllllIII[3]);
    }
    
    @Override
    public ByteBuffer nioBuffer(int llllllllllllIlllllIIlIIIlIlIIlII, final int llllllllllllIlllllIIlIIIlIIlllll) {
        this.checkIndex(llllllllllllIlllllIIlIIIlIlIIlII, llllllllllllIlllllIIlIIIlIIlllll);
        llllllllllllIlllllIIlIIIlIlIIlII = this.idx(llllllllllllIlllllIIlIIIlIlIIlII);
        final ByteBuffer llllllllllllIlllllIIlIIIlIlIIIlI = ByteBuffer.wrap((byte[])(Object)this.memory, llllllllllllIlllllIIlIIIlIlIIlII, llllllllllllIlllllIIlIIIlIIlllll);
        return llllllllllllIlllllIIlIIIlIlIIIlI.slice();
    }
    
    @Override
    protected int _getInt(int llllllllllllIlllllIIlIIllIIlIllI) {
        llllllllllllIlllllIIlIIllIIlIllI = this.idx((int)llllllllllllIlllllIIlIIllIIlIllI);
        return (((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIllI] & PooledHeapByteBuf.lIlllIIllllIII[3]) << PooledHeapByteBuf.lIlllIIllllIII[6] | (((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIllI + PooledHeapByteBuf.lIlllIIllllIII[0]] & PooledHeapByteBuf.lIlllIIllllIII[3]) << PooledHeapByteBuf.lIlllIIllllIII[4] | (((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIllI + PooledHeapByteBuf.lIlllIIllllIII[5]] & PooledHeapByteBuf.lIlllIIllllIII[3]) << PooledHeapByteBuf.lIlllIIllllIII[2] | (((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIllIIlIllI + PooledHeapByteBuf.lIlllIIllllIII[7]] & PooledHeapByteBuf.lIlllIIllllIII[3]);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlllllIIlIIlIllllIlI, final byte[] llllllllllllIlllllIIlIIlIlllIlII, final int llllllllllllIlllllIIlIIlIllllIII, final int llllllllllllIlllllIIlIIlIlllIlll) {
        this.checkDstIndex(llllllllllllIlllllIIlIIlIllllIlI, llllllllllllIlllllIIlIIlIlllIlll, llllllllllllIlllllIIlIIlIllllIII, llllllllllllIlllllIIlIIlIlllIlII.length);
        System.arraycopy(this.memory, this.idx(llllllllllllIlllllIIlIIlIllllIlI), llllllllllllIlllllIIlIIlIlllIlII, llllllllllllIlllllIIlIIlIllllIII, llllllllllllIlllllIIlIIlIlllIlll);
        return this;
    }
    
    static PooledHeapByteBuf newInstance(final int llllllllllllIlllllIIlIIllIlllIIl) {
        final PooledHeapByteBuf llllllllllllIlllllIIlIIllIlllIlI = PooledHeapByteBuf.RECYCLER.get();
        llllllllllllIlllllIIlIIllIlllIlI.setRefCnt(PooledHeapByteBuf.lIlllIIllllIII[0]);
        llllllllllllIlllllIIlIIllIlllIlI.maxCapacity(llllllllllllIlllllIIlIIllIlllIIl);
        return llllllllllllIlllllIIlIIllIlllIlI;
    }
    
    @Override
    public int arrayOffset() {
        return this.offset;
    }
    
    @Override
    protected void _setMedium(int llllllllllllIlllllIIlIIlIIIllIII, final int llllllllllllIlllllIIlIIlIIIllIlI) {
        llllllllllllIlllllIIlIIlIIIllIII = (Exception)this.idx((int)llllllllllllIlllllIIlIIlIIIllIII);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIllIII] = (byte)(llllllllllllIlllllIIlIIlIIIllIlI >>> PooledHeapByteBuf.lIlllIIllllIII[4]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIllIII + PooledHeapByteBuf.lIlllIIllllIII[0]] = (byte)(llllllllllllIlllllIIlIIlIIIllIlI >>> PooledHeapByteBuf.lIlllIIllllIII[2]);
        ((byte[])(Object)this.memory)[llllllllllllIlllllIIlIIlIIIllIII + PooledHeapByteBuf.lIlllIIllllIII[5]] = (byte)llllllllllllIlllllIIlIIlIIIllIlI;
    }
    
    @Override
    public int getBytes(final int llllllllllllIlllllIIlIIlIlIlIlll, final GatheringByteChannel llllllllllllIlllllIIlIIlIlIlIIlI, final int llllllllllllIlllllIIlIIlIlIlIlIl) throws IOException {
        return this.getBytes(llllllllllllIlllllIIlIIlIlIlIlll, llllllllllllIlllllIIlIIlIlIlIIlI, llllllllllllIlllllIIlIIlIlIlIlIl, (boolean)(PooledHeapByteBuf.lIlllIIllllIII[1] != 0));
    }
}
