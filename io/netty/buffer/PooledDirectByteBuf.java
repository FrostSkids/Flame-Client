// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.channels.GatheringByteChannel;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ScatteringByteChannel;
import java.io.IOException;
import java.io.OutputStream;
import io.netty.util.Recycler;
import java.nio.ByteBuffer;

final class PooledDirectByteBuf extends PooledByteBuf<ByteBuffer>
{
    private static final /* synthetic */ Recycler<PooledDirectByteBuf> RECYCLER;
    private static final /* synthetic */ String[] lIllIIlllllIIl;
    private static final /* synthetic */ int[] lIllIIlllllIlI;
    
    private static boolean lllllIlllIIIlII(final Object lllllllllllllIIIIIIIllIIlIIlIlll, final Object lllllllllllllIIIIIIIllIIlIIlIllI) {
        return lllllllllllllIIIIIIIllIIlIIlIlll == lllllllllllllIIIIIIIllIIlIIlIllI;
    }
    
    private void getBytes(final int lllllllllllllIIIIIIIllIlllIlIIIl, final OutputStream lllllllllllllIIIIIIIllIlllIIlIIl, final int lllllllllllllIIIIIIIllIlllIIllll, final boolean lllllllllllllIIIIIIIllIlllIIlllI) throws IOException {
        this.checkIndex(lllllllllllllIIIIIIIllIlllIlIIIl, lllllllllllllIIIIIIIllIlllIIllll);
        if (lllllIlllIIIIll(lllllllllllllIIIIIIIllIlllIIllll)) {
            return;
        }
        final byte[] lllllllllllllIIIIIIIllIlllIIllIl = new byte[lllllllllllllIIIIIIIllIlllIIllll];
        ByteBuffer lllllllllllllIIIIIIIllIlllIIllII = null;
        if (lllllIlllIIIIII(lllllllllllllIIIIIIIllIlllIIlllI ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIIIIIIllIlllIlIIll = this.internalNioBuffer();
            "".length();
            if (((0x0 ^ 0x20 ^ (0x22 ^ 0x30)) & (0x62 ^ 0x3E ^ (0x21 ^ 0x4F) ^ -" ".length())) > 0) {
                return;
            }
        }
        else {
            lllllllllllllIIIIIIIllIlllIIllII = ((ByteBuffer)this.memory).duplicate();
        }
        lllllllllllllIIIIIIIllIlllIIllII.clear().position(this.idx(lllllllllllllIIIIIIIllIlllIlIIIl));
        "".length();
        lllllllllllllIIIIIIIllIlllIIllII.get(lllllllllllllIIIIIIIllIlllIIllIl);
        "".length();
        lllllllllllllIIIIIIIllIlllIIlIIl.write(lllllllllllllIIIIIIIllIlllIIllIl);
    }
    
    @Override
    protected ByteBuffer newInternalNioBuffer(final ByteBuffer lllllllllllllIIIIIIIlllIIllllIll) {
        return lllllllllllllIIIIIIIlllIIllllIll.duplicate();
    }
    
    @Override
    public int nioBufferCount() {
        return PooledDirectByteBuf.lIllIIlllllIlI[0];
    }
    
    @Override
    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    protected void _setInt(final int lllllllllllllIIIIIIIllIlIllIlllI, final int lllllllllllllIIIIIIIllIlIlllIIII) {
        ((ByteBuffer)this.memory).putInt(this.idx(lllllllllllllIIIIIIIllIlIllIlllI), lllllllllllllIIIIIIIllIlIlllIIII);
        "".length();
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIIlllIIIllIIIl, final byte[] lllllllllllllIIIIIIIlllIIIllIIII, final int lllllllllllllIIIIIIIlllIIIlIllll, final int lllllllllllllIIIIIIIlllIIIlIlllI) {
        this.getBytes(lllllllllllllIIIIIIIlllIIIllIIIl, lllllllllllllIIIIIIIlllIIIllIIII, lllllllllllllIIIIIIIlllIIIlIllll, lllllllllllllIIIIIIIlllIIIlIlllI, (boolean)(PooledDirectByteBuf.lIllIIlllllIlI[5] != 0));
        return this;
    }
    
    private void getBytes(int lllllllllllllIIIIIIIlllIIIlIIlII, final byte[] lllllllllllllIIIIIIIlllIIIIlllII, final int lllllllllllllIIIIIIIlllIIIlIIIlI, final int lllllllllllllIIIIIIIlllIIIIllIlI, final boolean lllllllllllllIIIIIIIlllIIIlIIIII) {
        this.checkDstIndex(lllllllllllllIIIIIIIlllIIIlIIlII, lllllllllllllIIIIIIIlllIIIIllIlI, lllllllllllllIIIIIIIlllIIIlIIIlI, lllllllllllllIIIIIIIlllIIIIlllII.length);
        ByteBuffer lllllllllllllIIIIIIIlllIIIIlllll;
        if (lllllIlllIIIIII(lllllllllllllIIIIIIIlllIIIlIIIII ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIIIIIIlllIIIlIIllI = this.internalNioBuffer();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            lllllllllllllIIIIIIIlllIIIIlllll = ((ByteBuffer)this.memory).duplicate();
        }
        lllllllllllllIIIIIIIlllIIIlIIlII = this.idx(lllllllllllllIIIIIIIlllIIIlIIlII);
        lllllllllllllIIIIIIIlllIIIIlllll.clear().position(lllllllllllllIIIIIIIlllIIIlIIlII).limit(lllllllllllllIIIIIIIlllIIIlIIlII + lllllllllllllIIIIIIIlllIIIIllIlI);
        "".length();
        lllllllllllllIIIIIIIlllIIIIlllll.get(lllllllllllllIIIIIIIlllIIIIlllII, lllllllllllllIIIIIIIlllIIIlIIIlI, lllllllllllllIIIIIIIlllIIIIllIlI);
        "".length();
    }
    
    private static boolean lllllIlllIIIIIl(final int lllllllllllllIIIIIIIllIIlIIIlllI) {
        return lllllllllllllIIIIIIIllIIlIIIlllI > 0;
    }
    
    @Override
    protected long _getLong(final int lllllllllllllIIIIIIIlllIIlIllIll) {
        return ((ByteBuffer)this.memory).getLong(this.idx(lllllllllllllIIIIIIIlllIIlIllIll));
    }
    
    @Override
    public ByteBuffer internalNioBuffer(int lllllllllllllIIIIIIIllIIllIllIlI, final int lllllllllllllIIIIIIIllIIllIllIIl) {
        this.checkIndex(lllllllllllllIIIIIIIllIIllIllIlI, lllllllllllllIIIIIIIllIIllIllIIl);
        lllllllllllllIIIIIIIllIIllIllIlI = this.idx(lllllllllllllIIIIIIIllIIllIllIlI);
        return (ByteBuffer)this.internalNioBuffer().clear().position(lllllllllllllIIIIIIIllIIllIllIlI).limit(lllllllllllllIIIIIIIllIIllIllIlI + lllllllllllllIIIIIIIllIIllIllIIl);
    }
    
    @Override
    public int setBytes(int lllllllllllllIIIIIIIllIlIIIIlIlI, final ScatteringByteChannel lllllllllllllIIIIIIIllIlIIIIIlII, final int lllllllllllllIIIIIIIllIlIIIIlIII) throws IOException {
        this.checkIndex(lllllllllllllIIIIIIIllIlIIIIlIlI, lllllllllllllIIIIIIIllIlIIIIlIII);
        final ByteBuffer lllllllllllllIIIIIIIllIlIIIIIlll = this.internalNioBuffer();
        lllllllllllllIIIIIIIllIlIIIIlIlI = this.idx(lllllllllllllIIIIIIIllIlIIIIlIlI);
        lllllllllllllIIIIIIIllIlIIIIIlll.clear().position(lllllllllllllIIIIIIIllIlIIIIlIlI).limit(lllllllllllllIIIIIIIllIlIIIIlIlI + lllllllllllllIIIIIIIllIlIIIIlIII);
        "".length();
        try {
            return lllllllllllllIIIIIIIllIlIIIIIlII.read(lllllllllllllIIIIIIIllIlIIIIIlll);
        }
        catch (ClosedChannelException lllllllllllllIIIIIIIllIlIIIIllII) {
            return PooledDirectByteBuf.lIllIIlllllIlI[6];
        }
    }
    
    @Override
    public byte[] array() {
        throw new UnsupportedOperationException(PooledDirectByteBuf.lIllIIlllllIIl[PooledDirectByteBuf.lIllIIlllllIlI[5]]);
    }
    
    @Override
    protected void _setMedium(int lllllllllllllIIIIIIIllIlIlllIlll, final int lllllllllllllIIIIIIIllIlIllllIIl) {
        lllllllllllllIIIIIIIllIlIlllIlll = this.idx((int)lllllllllllllIIIIIIIllIlIlllIlll);
        ((ByteBuffer)this.memory).put((int)lllllllllllllIIIIIIIllIlIlllIlll, (byte)(lllllllllllllIIIIIIIllIlIllllIIl >>> PooledDirectByteBuf.lIllIIlllllIlI[2]));
        "".length();
        ((ByteBuffer)this.memory).put((int)(lllllllllllllIIIIIIIllIlIlllIlll + PooledDirectByteBuf.lIllIIlllllIlI[0]), (byte)(lllllllllllllIIIIIIIllIlIllllIIl >>> PooledDirectByteBuf.lIllIIlllllIlI[3]));
        "".length();
        ((ByteBuffer)this.memory).put((int)(lllllllllllllIIIIIIIllIlIlllIlll + PooledDirectByteBuf.lIllIIlllllIlI[4]), (byte)lllllllllllllIIIIIIIllIlIllllIIl);
        "".length();
    }
    
    @Override
    public int getBytes(final int lllllllllllllIIIIIIIllIllIllIllI, final GatheringByteChannel lllllllllllllIIIIIIIllIllIllIIIl, final int lllllllllllllIIIIIIIllIllIllIlII) throws IOException {
        return this.getBytes(lllllllllllllIIIIIIIllIllIllIllI, lllllllllllllIIIIIIIllIllIllIIIl, lllllllllllllIIIIIIIllIllIllIlII, (boolean)(PooledDirectByteBuf.lIllIIlllllIlI[5] != 0));
    }
    
    @Override
    protected Recycler<?> recycler() {
        return PooledDirectByteBuf.RECYCLER;
    }
    
    private static String lllllIllIllllIl(String lllllllllllllIIIIIIIllIIlIlIIllI, final String lllllllllllllIIIIIIIllIIlIlIlIlI) {
        lllllllllllllIIIIIIIllIIlIlIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIIllIIlIlIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIllIIlIlIlIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIIIllIIlIlIlIII = lllllllllllllIIIIIIIllIIlIlIlIlI.toCharArray();
        int lllllllllllllIIIIIIIllIIlIlIIlll = PooledDirectByteBuf.lIllIIlllllIlI[5];
        final short lllllllllllllIIIIIIIllIIlIlIIIIl = (Object)lllllllllllllIIIIIIIllIIlIlIIllI.toCharArray();
        final char lllllllllllllIIIIIIIllIIlIlIIIII = (char)lllllllllllllIIIIIIIllIIlIlIIIIl.length;
        long lllllllllllllIIIIIIIllIIlIIlllll = PooledDirectByteBuf.lIllIIlllllIlI[5];
        while (lllllIlllIIIIlI((int)lllllllllllllIIIIIIIllIIlIIlllll, lllllllllllllIIIIIIIllIIlIlIIIII)) {
            final char lllllllllllllIIIIIIIllIIlIlIllII = lllllllllllllIIIIIIIllIIlIlIIIIl[lllllllllllllIIIIIIIllIIlIIlllll];
            lllllllllllllIIIIIIIllIIlIlIlIIl.append((char)(lllllllllllllIIIIIIIllIIlIlIllII ^ lllllllllllllIIIIIIIllIIlIlIlIII[lllllllllllllIIIIIIIllIIlIlIIlll % lllllllllllllIIIIIIIllIIlIlIlIII.length]));
            "".length();
            ++lllllllllllllIIIIIIIllIIlIlIIlll;
            ++lllllllllllllIIIIIIIllIIlIIlllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIllIIlIlIlIIl);
    }
    
    private int getBytes(int lllllllllllllIIIIIIIllIllIlIIlll, final GatheringByteChannel lllllllllllllIIIIIIIllIllIlIIllI, final int lllllllllllllIIIIIIIllIllIIlllll, final boolean lllllllllllllIIIIIIIllIllIIllllI) throws IOException {
        this.checkIndex(lllllllllllllIIIIIIIllIllIlIIlll, lllllllllllllIIIIIIIllIllIIlllll);
        if (lllllIlllIIIIll(lllllllllllllIIIIIIIllIllIIlllll)) {
            return PooledDirectByteBuf.lIllIIlllllIlI[5];
        }
        ByteBuffer lllllllllllllIIIIIIIllIllIlIIIll;
        if (lllllIlllIIIIII(lllllllllllllIIIIIIIllIllIIllllI ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIIIIIIllIllIlIlIIl = this.internalNioBuffer();
            "".length();
            if (" ".length() < ((0xE0 ^ 0xAB) & ~(0x36 ^ 0x7D))) {
                return (0x2 ^ 0x50) & ~(0xF6 ^ 0xA4);
            }
        }
        else {
            lllllllllllllIIIIIIIllIllIlIIIll = ((ByteBuffer)this.memory).duplicate();
        }
        lllllllllllllIIIIIIIllIllIlIIlll = this.idx(lllllllllllllIIIIIIIllIllIlIIlll);
        lllllllllllllIIIIIIIllIllIlIIIll.clear().position(lllllllllllllIIIIIIIllIllIlIIlll).limit(lllllllllllllIIIIIIIllIllIlIIlll + lllllllllllllIIIIIIIllIllIIlllll);
        "".length();
        return lllllllllllllIIIIIIIllIllIlIIllI.write(lllllllllllllIIIIIIIllIllIlIIIll);
    }
    
    @Override
    public ByteBuf setBytes(int lllllllllllllIIIIIIIllIlIIlllIII, final byte[] lllllllllllllIIIIIIIllIlIIllIlll, final int lllllllllllllIIIIIIIllIlIIllIllI, final int lllllllllllllIIIIIIIllIlIIlllIll) {
        this.checkSrcIndex(lllllllllllllIIIIIIIllIlIIlllIII, lllllllllllllIIIIIIIllIlIIlllIll, lllllllllllllIIIIIIIllIlIIllIllI, lllllllllllllIIIIIIIllIlIIllIlll.length);
        final ByteBuffer lllllllllllllIIIIIIIllIlIIlllIlI = this.internalNioBuffer();
        lllllllllllllIIIIIIIllIlIIlllIII = this.idx(lllllllllllllIIIIIIIllIlIIlllIII);
        lllllllllllllIIIIIIIllIlIIlllIlI.clear().position(lllllllllllllIIIIIIIllIlIIlllIII).limit(lllllllllllllIIIIIIIllIlIIlllIII + lllllllllllllIIIIIIIllIlIIlllIll);
        "".length();
        lllllllllllllIIIIIIIllIlIIlllIlI.put(lllllllllllllIIIIIIIllIlIIllIlll, lllllllllllllIIIIIIIllIlIIllIllI, lllllllllllllIIIIIIIllIlIIlllIll);
        "".length();
        return this;
    }
    
    @Override
    protected int _getUnsignedMedium(int lllllllllllllIIIIIIIlllIIllIIlll) {
        lllllllllllllIIIIIIIlllIIllIIlll = this.idx(lllllllllllllIIIIIIIlllIIllIIlll);
        return (((ByteBuffer)this.memory).get(lllllllllllllIIIIIIIlllIIllIIlll) & PooledDirectByteBuf.lIllIIlllllIlI[1]) << PooledDirectByteBuf.lIllIIlllllIlI[2] | (((ByteBuffer)this.memory).get(lllllllllllllIIIIIIIlllIIllIIlll + PooledDirectByteBuf.lIllIIlllllIlI[0]) & PooledDirectByteBuf.lIllIIlllllIlI[1]) << PooledDirectByteBuf.lIllIIlllllIlI[3] | (((ByteBuffer)this.memory).get(lllllllllllllIIIIIIIlllIIllIIlll + PooledDirectByteBuf.lIllIIlllllIlI[4]) & PooledDirectByteBuf.lIllIIlllllIlI[1]);
    }
    
    private static void lllllIllIlllllI() {
        (lIllIIlllllIIl = new String[PooledDirectByteBuf.lIllIIlllllIlI[4]])[PooledDirectByteBuf.lIllIIlllllIlI[5]] = lllllIllIllllII("VDk+PELTRcdw2dQJTDaupg==", "FPrpd");
        PooledDirectByteBuf.lIllIIlllllIIl[PooledDirectByteBuf.lIllIIlllllIlI[0]] = lllllIllIllllIl("EhE9MSgCWC0hLRAdPQ==", "vxOTK");
    }
    
    private static boolean lllllIlllIIIlIl(final int lllllllllllllIIIIIIIllIIlIIlIIII) {
        return lllllllllllllIIIIIIIllIIlIIlIIII <= 0;
    }
    
    @Override
    protected void _setLong(final int lllllllllllllIIIIIIIllIlIllIlIII, final long lllllllllllllIIIIIIIllIlIllIIlll) {
        ((ByteBuffer)this.memory).putLong(this.idx(lllllllllllllIIIIIIIllIlIllIlIII), lllllllllllllIIIIIIIllIlIllIIlll);
        "".length();
    }
    
    @Override
    protected short _getShort(final int lllllllllllllIIIIIIIlllIIllIllll) {
        return ((ByteBuffer)this.memory).getShort(this.idx(lllllllllllllIIIIIIIlllIIllIllll));
    }
    
    private static boolean lllllIlllIIIIll(final int lllllllllllllIIIIIIIllIIlIIlIIlI) {
        return lllllllllllllIIIIIIIllIIlIIlIIlI == 0;
    }
    
    @Override
    protected void _setByte(final int lllllllllllllIIIIIIIllIllIIIllII, final int lllllllllllllIIIIIIIllIllIIIlIII) {
        ((ByteBuffer)this.memory).put(this.idx(lllllllllllllIIIIIIIllIllIIIllII), (byte)lllllllllllllIIIIIIIllIllIIIlIII);
        "".length();
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream lllllllllllllIIIIIIIllIlllIIIIII, final int lllllllllllllIIIIIIIllIllIllllll) throws IOException {
        this.checkReadableBytes(lllllllllllllIIIIIIIllIllIllllll);
        this.getBytes(this.readerIndex, lllllllllllllIIIIIIIllIlllIIIIII, lllllllllllllIIIIIIIllIllIllllll, (boolean)(PooledDirectByteBuf.lIllIIlllllIlI[0] != 0));
        this.readerIndex += lllllllllllllIIIIIIIllIllIllllll;
        return this;
    }
    
    @Override
    public ByteBuf getBytes(int lllllllllllllIIIIIIIlllIIlIIIlIl, final ByteBuf lllllllllllllIIIIIIIlllIIlIIlIIl, final int lllllllllllllIIIIIIIlllIIlIIlIII, final int lllllllllllllIIIIIIIlllIIlIIIIlI) {
        this.checkDstIndex(lllllllllllllIIIIIIIlllIIlIIIlIl, lllllllllllllIIIIIIIlllIIlIIIIlI, lllllllllllllIIIIIIIlllIIlIIlIII, lllllllllllllIIIIIIIlllIIlIIlIIl.capacity());
        if (lllllIlllIIIIII(lllllllllllllIIIIIIIlllIIlIIlIIl.hasArray() ? 1 : 0)) {
            this.getBytes(lllllllllllllIIIIIIIlllIIlIIIlIl, lllllllllllllIIIIIIIlllIIlIIlIIl.array(), lllllllllllllIIIIIIIlllIIlIIlIIl.arrayOffset() + lllllllllllllIIIIIIIlllIIlIIlIII, lllllllllllllIIIIIIIlllIIlIIIIlI);
            "".length();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lllllIlllIIIIIl(lllllllllllllIIIIIIIlllIIlIIlIIl.nioBufferCount())) {
            final ByteBuffer[] lllllllllllllIIIIIIIlllIIlIIlllI = lllllllllllllIIIIIIIlllIIlIIlIIl.nioBuffers(lllllllllllllIIIIIIIlllIIlIIlIII, lllllllllllllIIIIIIIlllIIlIIIIlI);
            final int lllllllllllllIIIIIIIlllIIlIIllIl = lllllllllllllIIIIIIIlllIIlIIlllI.length;
            int lllllllllllllIIIIIIIlllIIlIIllII = PooledDirectByteBuf.lIllIIlllllIlI[5];
            while (lllllIlllIIIIlI(lllllllllllllIIIIIIIlllIIlIIllII, lllllllllllllIIIIIIIlllIIlIIllIl)) {
                final ByteBuffer lllllllllllllIIIIIIIlllIIlIIllll = lllllllllllllIIIIIIIlllIIlIIlllI[lllllllllllllIIIIIIIlllIIlIIllII];
                final int lllllllllllllIIIIIIIlllIIlIlIIII = lllllllllllllIIIIIIIlllIIlIIllll.remaining();
                this.getBytes(lllllllllllllIIIIIIIlllIIlIIIlIl, lllllllllllllIIIIIIIlllIIlIIllll);
                "".length();
                lllllllllllllIIIIIIIlllIIlIIIlIl += lllllllllllllIIIIIIIlllIIlIlIIII;
                ++lllllllllllllIIIIIIIlllIIlIIllII;
                "".length();
                if (((98 + 57 - 138 + 123 ^ 43 + 71 - 76 + 153) & (0x40 ^ 0x33 ^ (0x47 ^ 0x7) ^ -" ".length())) != ((0xB ^ 0x24 ^ (0xEB ^ 0xA5)) & (0xAC ^ 0x87 ^ (0xF7 ^ 0xBD) ^ -" ".length()))) {
                    return null;
                }
            }
            "".length();
            if (((0xF3 ^ 0xAD) & ~(0x4E ^ 0x10)) != 0x0) {
                return null;
            }
        }
        else {
            lllllllllllllIIIIIIIlllIIlIIlIIl.setBytes(lllllllllllllIIIIIIIlllIIlIIlIII, this, lllllllllllllIIIIIIIlllIIlIIIlIl, lllllllllllllIIIIIIIlllIIlIIIIlI);
            "".length();
        }
        return this;
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return PooledDirectByteBuf.lIllIIlllllIlI[5] != 0;
    }
    
    @Override
    public int readBytes(final GatheringByteChannel lllllllllllllIIIIIIIllIllIIlIIll, final int lllllllllllllIIIIIIIllIllIIlIllI) throws IOException {
        this.checkReadableBytes(lllllllllllllIIIIIIIllIllIIlIllI);
        final int lllllllllllllIIIIIIIllIllIIlIlIl = this.getBytes(this.readerIndex, lllllllllllllIIIIIIIllIllIIlIIll, lllllllllllllIIIIIIIllIllIIlIllI, (boolean)(PooledDirectByteBuf.lIllIIlllllIlI[0] != 0));
        this.readerIndex += lllllllllllllIIIIIIIllIllIIlIlIl;
        return lllllllllllllIIIIIIIllIllIIlIlIl;
    }
    
    private static void lllllIllIllllll() {
        (lIllIIlllllIlI = new int[7])[0] = " ".length();
        PooledDirectByteBuf.lIllIIlllllIlI[1] = (0x6E ^ 0xE) + (154 + 123 - 270 + 219) - (174 + 208 - 250 + 118) + (125 + 42 - 28 + 44);
        PooledDirectByteBuf.lIllIIlllllIlI[2] = (0x7C ^ 0x6A ^ (0x69 ^ 0x6F));
        PooledDirectByteBuf.lIllIIlllllIlI[3] = (0x2F ^ 0x27);
        PooledDirectByteBuf.lIllIIlllllIlI[4] = "  ".length();
        PooledDirectByteBuf.lIllIIlllllIlI[5] = ((0x1B ^ 0xF ^ (0x29 ^ 0x9)) & (0xE ^ 0x2E ^ (0x8A ^ 0x9E) ^ -" ".length()));
        PooledDirectByteBuf.lIllIIlllllIlI[6] = -" ".length();
    }
    
    @Override
    public ByteBuffer nioBuffer(int lllllllllllllIIIIIIIllIIlllIllII, final int lllllllllllllIIIIIIIllIIlllIlllI) {
        this.checkIndex(lllllllllllllIIIIIIIllIIlllIllII, lllllllllllllIIIIIIIllIIlllIlllI);
        lllllllllllllIIIIIIIllIIlllIllII = this.idx(lllllllllllllIIIIIIIllIIlllIllII);
        return ((ByteBuffer)((ByteBuffer)this.memory).duplicate().position(lllllllllllllIIIIIIIllIIlllIllII).limit(lllllllllllllIIIIIIIllIIlllIllII + lllllllllllllIIIIIIIllIIlllIlllI)).slice();
    }
    
    @Override
    public boolean hasArray() {
        return PooledDirectByteBuf.lIllIIlllllIlI[5] != 0;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIIllIlllIlllIl, final OutputStream lllllllllllllIIIIIIIllIlllIlllII, final int lllllllllllllIIIIIIIllIlllIlllll) throws IOException {
        this.getBytes(lllllllllllllIIIIIIIllIlllIlllIl, lllllllllllllIIIIIIIllIlllIlllII, lllllllllllllIIIIIIIllIlllIlllll, (boolean)(PooledDirectByteBuf.lIllIIlllllIlI[5] != 0));
        return this;
    }
    
    static PooledDirectByteBuf newInstance(final int lllllllllllllIIIIIIIlllIlIIIlIII) {
        final PooledDirectByteBuf lllllllllllllIIIIIIIlllIlIIIlIIl = PooledDirectByteBuf.RECYCLER.get();
        lllllllllllllIIIIIIIlllIlIIIlIIl.setRefCnt(PooledDirectByteBuf.lIllIIlllllIlI[0]);
        lllllllllllllIIIIIIIlllIlIIIlIIl.maxCapacity(lllllllllllllIIIIIIIlllIlIIIlIII);
        return lllllllllllllIIIIIIIlllIlIIIlIIl;
    }
    
    private static boolean lllllIlllIIIIII(final int lllllllllllllIIIIIIIllIIlIIlIlII) {
        return lllllllllllllIIIIIIIllIIlIIlIlII != 0;
    }
    
    @Override
    protected int _getInt(final int lllllllllllllIIIIIIIlllIIllIIIll) {
        return ((ByteBuffer)this.memory).getInt(this.idx(lllllllllllllIIIIIIIlllIIllIIIll));
    }
    
    private PooledDirectByteBuf(final Recycler.Handle lllllllllllllIIIIIIIlllIIlllllll, final int lllllllllllllIIIIIIIlllIIllllllI) {
        super(lllllllllllllIIIIIIIlllIIlllllll, lllllllllllllIIIIIIIlllIIllllllI);
    }
    
    private void getBytes(int lllllllllllllIIIIIIIllIllllllIlI, final ByteBuffer lllllllllllllIIIIIIIllIlllllIIll, final boolean lllllllllllllIIIIIIIllIlllllIIlI) {
        this.checkIndex(lllllllllllllIIIIIIIllIllllllIlI);
        final int lllllllllllllIIIIIIIllIlllllIlll = Math.min(this.capacity() - lllllllllllllIIIIIIIllIllllllIlI, lllllllllllllIIIIIIIllIlllllIIll.remaining());
        ByteBuffer lllllllllllllIIIIIIIllIlllllIllI;
        if (lllllIlllIIIIII(lllllllllllllIIIIIIIllIlllllIIlI ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIIIIIIllIlllllllII = this.internalNioBuffer();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            lllllllllllllIIIIIIIllIlllllIllI = ((ByteBuffer)this.memory).duplicate();
        }
        lllllllllllllIIIIIIIllIllllllIlI = this.idx(lllllllllllllIIIIIIIllIllllllIlI);
        lllllllllllllIIIIIIIllIlllllIllI.clear().position(lllllllllllllIIIIIIIllIllllllIlI).limit(lllllllllllllIIIIIIIllIllllllIlI + lllllllllllllIIIIIIIllIlllllIlll);
        "".length();
        lllllllllllllIIIIIIIllIlllllIIll.put(lllllllllllllIIIIIIIllIlllllIllI);
        "".length();
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIIIIIIllIlIIIlllll, final InputStream lllllllllllllIIIIIIIllIlIIIllllI, final int lllllllllllllIIIIIIIllIlIIIlllIl) throws IOException {
        this.checkIndex(lllllllllllllIIIIIIIllIlIIIlllll, lllllllllllllIIIIIIIllIlIIIlllIl);
        final byte[] lllllllllllllIIIIIIIllIlIIIlllII = new byte[lllllllllllllIIIIIIIllIlIIIlllIl];
        final int lllllllllllllIIIIIIIllIlIIIllIll = lllllllllllllIIIIIIIllIlIIIllllI.read(lllllllllllllIIIIIIIllIlIIIlllII);
        if (lllllIlllIIIlIl(lllllllllllllIIIIIIIllIlIIIllIll)) {
            return lllllllllllllIIIIIIIllIlIIIllIll;
        }
        final ByteBuffer lllllllllllllIIIIIIIllIlIIIllIlI = this.internalNioBuffer();
        lllllllllllllIIIIIIIllIlIIIllIlI.clear().position(this.idx(lllllllllllllIIIIIIIllIlIIIlllll));
        "".length();
        lllllllllllllIIIIIIIllIlIIIllIlI.put(lllllllllllllIIIIIIIllIlIIIlllII, PooledDirectByteBuf.lIllIIlllllIlI[5], lllllllllllllIIIIIIIllIlIIIllIll);
        "".length();
        return lllllllllllllIIIIIIIllIlIIIllIll;
    }
    
    @Override
    protected byte _getByte(final int lllllllllllllIIIIIIIlllIIlllIlIl) {
        return ((ByteBuffer)this.memory).get(this.idx(lllllllllllllIIIIIIIlllIIlllIlIl));
    }
    
    static {
        lllllIllIllllll();
        lllllIllIlllllI();
        RECYCLER = new Recycler<PooledDirectByteBuf>() {
            private static final /* synthetic */ int[] llIIIlIllllIIl;
            
            private static void lIIIlIIlllIllIII() {
                (llIIIlIllllIIl = new int[1])[0] = ((0x41 ^ 0x10 ^ (0x21 ^ 0x2F)) & (0x30 ^ 0x56 ^ (0x6C ^ 0x55) ^ -" ".length()));
            }
            
            @Override
            protected PooledDirectByteBuf newObject(final Handle llllllllllllIlllIlIlIIlIllIIlIII) {
                return new PooledDirectByteBuf(llllllllllllIlllIlIlIIlIllIIlIII, PooledDirectByteBuf$1.llIIIlIllllIIl[0], null);
            }
            
            static {
                lIIIlIIlllIllIII();
            }
        };
    }
    
    @Override
    public int arrayOffset() {
        throw new UnsupportedOperationException(PooledDirectByteBuf.lIllIIlllllIIl[PooledDirectByteBuf.lIllIIlllllIlI[0]]);
    }
    
    @Override
    public ByteBuf setBytes(int lllllllllllllIIIIIIIllIlIIlIlIlI, ByteBuffer lllllllllllllIIIIIIIllIlIIlIlIIl) {
        this.checkIndex(lllllllllllllIIIIIIIllIlIIlIlIlI, lllllllllllllIIIIIIIllIlIIlIlIIl.remaining());
        final ByteBuffer lllllllllllllIIIIIIIllIlIIlIllII = this.internalNioBuffer();
        if (lllllIlllIIIlII(lllllllllllllIIIIIIIllIlIIlIlIIl, lllllllllllllIIIIIIIllIlIIlIllII)) {
            lllllllllllllIIIIIIIllIlIIlIlIIl = lllllllllllllIIIIIIIllIlIIlIlIIl.duplicate();
        }
        lllllllllllllIIIIIIIllIlIIlIlIlI = this.idx(lllllllllllllIIIIIIIllIlIIlIlIlI);
        lllllllllllllIIIIIIIllIlIIlIllII.clear().position(lllllllllllllIIIIIIIllIlIIlIlIlI).limit(lllllllllllllIIIIIIIllIlIIlIlIlI + lllllllllllllIIIIIIIllIlIIlIlIIl.remaining());
        "".length();
        lllllllllllllIIIIIIIllIlIIlIllII.put(lllllllllllllIIIIIIIllIlIIlIlIIl);
        "".length();
        return this;
    }
    
    @Override
    protected void _setShort(final int lllllllllllllIIIIIIIllIllIIIIIll, final int lllllllllllllIIIIIIIllIlIlllllll) {
        ((ByteBuffer)this.memory).putShort(this.idx(lllllllllllllIIIIIIIllIllIIIIIll), (short)lllllllllllllIIIIIIIllIlIlllllll);
        "".length();
    }
    
    private static String lllllIllIllllII(final String lllllllllllllIIIIIIIllIIlIlllIIl, final String lllllllllllllIIIIIIIllIIlIlllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIllIIlIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIllIIlIlllIlI.getBytes(StandardCharsets.UTF_8)), PooledDirectByteBuf.lIllIIlllllIlI[3]), "DES");
            final Cipher lllllllllllllIIIIIIIllIIlIllllIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIllIIlIllllIl.init(PooledDirectByteBuf.lIllIIlllllIlI[4], lllllllllllllIIIIIIIllIIlIlllllI);
            return new String(lllllllllllllIIIIIIIllIIlIllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIllIIlIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIllIIlIllllII) {
            lllllllllllllIIIIIIIllIIlIllllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIIIIIIIllIIllllIlll, final int lllllllllllllIIIIIIIllIIlllllIlI) {
        this.checkIndex(lllllllllllllIIIIIIIllIIllllIlll, lllllllllllllIIIIIIIllIIlllllIlI);
        final ByteBuf lllllllllllllIIIIIIIllIIlllllIIl = this.alloc().directBuffer(lllllllllllllIIIIIIIllIIlllllIlI, this.maxCapacity());
        lllllllllllllIIIIIIIllIIlllllIIl.writeBytes(this, lllllllllllllIIIIIIIllIIllllIlll, lllllllllllllIIIIIIIllIIlllllIlI);
        "".length();
        return lllllllllllllIIIIIIIllIIlllllIIl;
    }
    
    @Override
    public ByteBuf readBytes(final byte[] lllllllllllllIIIIIIIlllIIIIIlllI, final int lllllllllllllIIIIIIIlllIIIIIllIl, final int lllllllllllllIIIIIIIlllIIIIIllII) {
        this.checkReadableBytes(lllllllllllllIIIIIIIlllIIIIIllII);
        this.getBytes(this.readerIndex, lllllllllllllIIIIIIIlllIIIIIlllI, lllllllllllllIIIIIIIlllIIIIIllIl, lllllllllllllIIIIIIIlllIIIIIllII, (boolean)(PooledDirectByteBuf.lIllIIlllllIlI[0] != 0));
        this.readerIndex += lllllllllllllIIIIIIIlllIIIIIllII;
        return this;
    }
    
    private static boolean lllllIlllIIIIlI(final int lllllllllllllIIIIIIIllIIlIIllIll, final int lllllllllllllIIIIIIIllIIlIIllIlI) {
        return lllllllllllllIIIIIIIllIIlIIllIll < lllllllllllllIIIIIIIllIIlIIllIlI;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer lllllllllllllIIIIIIIllIllllIlIII) {
        final int lllllllllllllIIIIIIIllIllllIlIlI = lllllllllllllIIIIIIIllIllllIlIII.remaining();
        this.checkReadableBytes(lllllllllllllIIIIIIIllIllllIlIlI);
        this.getBytes(this.readerIndex, lllllllllllllIIIIIIIllIllllIlIII, (boolean)(PooledDirectByteBuf.lIllIIlllllIlI[0] != 0));
        this.readerIndex += lllllllllllllIIIIIIIllIllllIlIlI;
        return this;
    }
    
    @Override
    public ByteBuf setBytes(int lllllllllllllIIIIIIIllIlIlIIlllI, final ByteBuf lllllllllllllIIIIIIIllIlIlIlIIlI, final int lllllllllllllIIIIIIIllIlIlIlIIIl, final int lllllllllllllIIIIIIIllIlIlIIlIll) {
        this.checkSrcIndex(lllllllllllllIIIIIIIllIlIlIIlllI, lllllllllllllIIIIIIIllIlIlIIlIll, lllllllllllllIIIIIIIllIlIlIlIIIl, lllllllllllllIIIIIIIllIlIlIlIIlI.capacity());
        if (lllllIlllIIIIII(lllllllllllllIIIIIIIllIlIlIlIIlI.hasArray() ? 1 : 0)) {
            this.setBytes(lllllllllllllIIIIIIIllIlIlIIlllI, lllllllllllllIIIIIIIllIlIlIlIIlI.array(), lllllllllllllIIIIIIIllIlIlIlIIlI.arrayOffset() + lllllllllllllIIIIIIIllIlIlIlIIIl, lllllllllllllIIIIIIIllIlIlIIlIll);
            "".length();
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else if (lllllIlllIIIIIl(lllllllllllllIIIIIIIllIlIlIlIIlI.nioBufferCount())) {
            final ByteBuffer[] lllllllllllllIIIIIIIllIlIlIlIlll = lllllllllllllIIIIIIIllIlIlIlIIlI.nioBuffers(lllllllllllllIIIIIIIllIlIlIlIIIl, lllllllllllllIIIIIIIllIlIlIIlIll);
            final int lllllllllllllIIIIIIIllIlIlIlIllI = lllllllllllllIIIIIIIllIlIlIlIlll.length;
            int lllllllllllllIIIIIIIllIlIlIlIlIl = PooledDirectByteBuf.lIllIIlllllIlI[5];
            while (lllllIlllIIIIlI(lllllllllllllIIIIIIIllIlIlIlIlIl, lllllllllllllIIIIIIIllIlIlIlIllI)) {
                final ByteBuffer lllllllllllllIIIIIIIllIlIlIllIII = lllllllllllllIIIIIIIllIlIlIlIlll[lllllllllllllIIIIIIIllIlIlIlIlIl];
                final int lllllllllllllIIIIIIIllIlIlIllIIl = lllllllllllllIIIIIIIllIlIlIllIII.remaining();
                this.setBytes(lllllllllllllIIIIIIIllIlIlIIlllI, lllllllllllllIIIIIIIllIlIlIllIII);
                "".length();
                lllllllllllllIIIIIIIllIlIlIIlllI += lllllllllllllIIIIIIIllIlIlIllIIl;
                ++lllllllllllllIIIIIIIllIlIlIlIlIl;
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
            }
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIIIIIIllIlIlIlIIlI.getBytes(lllllllllllllIIIIIIIllIlIlIlIIIl, this, lllllllllllllIIIIIIIllIlIlIIlllI, lllllllllllllIIIIIIIllIlIlIIlIll);
            "".length();
        }
        return this;
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIIIIIIIllIIlllIIIll, final int lllllllllllllIIIIIIIllIIlllIIIlI) {
        final ByteBuffer[] array = new ByteBuffer[PooledDirectByteBuf.lIllIIlllllIlI[0]];
        array[PooledDirectByteBuf.lIllIIlllllIlI[5]] = this.nioBuffer(lllllllllllllIIIIIIIllIIlllIIIll, lllllllllllllIIIIIIIllIIlllIIIlI);
        return array;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIIIIlllIIIIIIlII, final ByteBuffer lllllllllllllIIIIIIIlllIIIIIIIll) {
        this.getBytes(lllllllllllllIIIIIIIlllIIIIIIlII, lllllllllllllIIIIIIIlllIIIIIIIll, (boolean)(PooledDirectByteBuf.lIllIIlllllIlI[5] != 0));
        return this;
    }
    
    @Override
    public boolean isDirect() {
        return PooledDirectByteBuf.lIllIIlllllIlI[0] != 0;
    }
}
