// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.Buffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ScatteringByteChannel;
import java.util.Arrays;
import io.netty.util.internal.PlatformDependent;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.ByteOrder;
import java.nio.channels.GatheringByteChannel;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class UnpooledDirectByteBuf extends AbstractReferenceCountedByteBuf
{
    private /* synthetic */ boolean doNotFree;
    private /* synthetic */ ByteBuffer tmpNioBuf;
    private static final /* synthetic */ int[] lIlIllIlllIllI;
    private final /* synthetic */ ByteBufAllocator alloc;
    private static final /* synthetic */ String[] lIlIllIlllIlII;
    private /* synthetic */ ByteBuffer buffer;
    private /* synthetic */ int capacity;
    
    @Override
    protected void _setMedium(final int lllllllllllllIIIIllIIIllIIlllIlI, final int lllllllllllllIIIIllIIIllIIllllII) {
        this.setByte(lllllllllllllIIIIllIIIllIIlllIlI, (byte)(lllllllllllllIIIIllIIIllIIllllII >>> UnpooledDirectByteBuf.lIlIllIlllIllI[13]));
        "".length();
        this.setByte(lllllllllllllIIIIllIIIllIIlllIlI + UnpooledDirectByteBuf.lIlIllIlllIllI[1], (byte)(lllllllllllllIIIIllIIIllIIllllII >>> UnpooledDirectByteBuf.lIlIllIlllIllI[8]));
        "".length();
        this.setByte(lllllllllllllIIIIllIIIllIIlllIlI + UnpooledDirectByteBuf.lIlIllIlllIllI[2], (byte)lllllllllllllIIIIllIIIllIIllllII);
        "".length();
    }
    
    private ByteBuffer internalNioBuffer() {
        ByteBuffer lllllllllllllIIIIllIIIlIIIllIllI = this.tmpNioBuf;
        if (llllIIlIlIIIIIl(lllllllllllllIIIIllIIIlIIIllIllI)) {
            lllllllllllllIIIIllIIIlIIIllIllI = (this.tmpNioBuf = this.buffer.duplicate());
        }
        return lllllllllllllIIIIllIIIlIIIllIllI;
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIIIllIIIlIIlllIIll, final InputStream lllllllllllllIIIIllIIIlIIlllIllI, final int lllllllllllllIIIIllIIIlIIlllIIIl) throws IOException {
        this.ensureAccessible();
        if (llllIIlIlIIIlIl(this.buffer.hasArray() ? 1 : 0)) {
            return lllllllllllllIIIIllIIIlIIlllIllI.read(this.buffer.array(), this.buffer.arrayOffset() + lllllllllllllIIIIllIIIlIIlllIIll, lllllllllllllIIIIllIIIlIIlllIIIl);
        }
        final byte[] lllllllllllllIIIIllIIIlIIllllIll = new byte[lllllllllllllIIIIllIIIlIIlllIIIl];
        final int lllllllllllllIIIIllIIIlIIllllIlI = lllllllllllllIIIIllIIIlIIlllIllI.read(lllllllllllllIIIIllIIIlIIllllIll);
        if (llllIIlIlIlIIII(lllllllllllllIIIIllIIIlIIllllIlI)) {
            return lllllllllllllIIIIllIIIlIIllllIlI;
        }
        final ByteBuffer lllllllllllllIIIIllIIIlIIllllIIl = this.internalNioBuffer();
        lllllllllllllIIIIllIIIlIIllllIIl.clear().position(lllllllllllllIIIIllIIIlIIlllIIll);
        "".length();
        lllllllllllllIIIIllIIIlIIllllIIl.put(lllllllllllllIIIIllIIIlIIllllIll, UnpooledDirectByteBuf.lIlIllIlllIllI[0], lllllllllllllIIIIllIIIlIIllllIlI);
        "".length();
        return lllllllllllllIIIIllIIIlIIllllIlI;
    }
    
    @Override
    public int getBytes(final int lllllllllllllIIIIllIIIlIlIlIIlII, final GatheringByteChannel lllllllllllllIIIIllIIIlIlIlIIIll, final int lllllllllllllIIIIllIIIlIlIlIIIlI) throws IOException {
        return this.getBytes(lllllllllllllIIIIllIIIlIlIlIIlII, lllllllllllllIIIIllIIIlIlIlIIIll, lllllllllllllIIIIllIIIlIlIlIIIlI, (boolean)(UnpooledDirectByteBuf.lIlIllIlllIllI[0] != 0));
    }
    
    static {
        llllIIlIlIIIIII();
        llllIIlIIllllll();
    }
    
    @Override
    public ByteBuf getBytes(int lllllllllllllIIIIllIIIllllIIllIl, final ByteBuf lllllllllllllIIIIllIIIllllIlIIIl, final int lllllllllllllIIIIllIIIllllIlIIII, final int lllllllllllllIIIIllIIIllllIIllll) {
        this.checkDstIndex(lllllllllllllIIIIllIIIllllIIllIl, lllllllllllllIIIIllIIIllllIIllll, lllllllllllllIIIIllIIIllllIlIIII, lllllllllllllIIIIllIIIllllIlIIIl.capacity());
        if (llllIIlIlIIIlIl(lllllllllllllIIIIllIIIllllIlIIIl.hasArray() ? 1 : 0)) {
            this.getBytes(lllllllllllllIIIIllIIIllllIIllIl, lllllllllllllIIIIllIIIllllIlIIIl.array(), lllllllllllllIIIIllIIIllllIlIIIl.arrayOffset() + lllllllllllllIIIIllIIIllllIlIIII, lllllllllllllIIIIllIIIllllIIllll);
            "".length();
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        else if (llllIIlIlIIllIl(lllllllllllllIIIIllIIIllllIlIIIl.nioBufferCount())) {
            final ByteBuffer[] lllllllllllllIIIIllIIIllllIlIllI = lllllllllllllIIIIllIIIllllIlIIIl.nioBuffers(lllllllllllllIIIIllIIIllllIlIIII, lllllllllllllIIIIllIIIllllIIllll);
            final int lllllllllllllIIIIllIIIllllIlIlIl = lllllllllllllIIIIllIIIllllIlIllI.length;
            int lllllllllllllIIIIllIIIllllIlIlII = UnpooledDirectByteBuf.lIlIllIlllIllI[0];
            while (llllIIlIlIIllII(lllllllllllllIIIIllIIIllllIlIlII, lllllllllllllIIIIllIIIllllIlIlIl)) {
                final ByteBuffer lllllllllllllIIIIllIIIllllIlIlll = lllllllllllllIIIIllIIIllllIlIllI[lllllllllllllIIIIllIIIllllIlIlII];
                final int lllllllllllllIIIIllIIIllllIllIII = lllllllllllllIIIIllIIIllllIlIlll.remaining();
                this.getBytes(lllllllllllllIIIIllIIIllllIIllIl, lllllllllllllIIIIllIIIllllIlIlll);
                "".length();
                lllllllllllllIIIIllIIIllllIIllIl += lllllllllllllIIIIllIIIllllIllIII;
                ++lllllllllllllIIIIllIIIllllIlIlII;
                "".length();
                if (((0xB ^ 0x53) & ~(0x48 ^ 0x10)) > (0xBB ^ 0xBF)) {
                    return null;
                }
            }
            "".length();
            if ((1 + 132 - 0 + 3 ^ 99 + 112 - 124 + 53) < " ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIIIIllIIIllllIlIIIl.setBytes(lllllllllllllIIIIllIIIllllIlIIII, this, lllllllllllllIIIIllIIIllllIIllIl, lllllllllllllIIIIllIIIllllIIllll);
            "".length();
        }
        return this;
    }
    
    private static boolean llllIIlIlIIllIl(final int lllllllllllllIIIIllIIIIlllIlIllI) {
        return lllllllllllllIIIIllIIIIlllIlIllI > 0;
    }
    
    @Override
    protected void _setShort(final int lllllllllllllIIIIllIIIllIlIIllII, final int lllllllllllllIIIIllIIIllIlIIlIll) {
        this.buffer.putShort(lllllllllllllIIIIllIIIllIlIIllII, (short)lllllllllllllIIIIllIIIllIlIIlIll);
        "".length();
    }
    
    private int getBytes(final int lllllllllllllIIIIllIIIlIlIIlIIll, final GatheringByteChannel lllllllllllllIIIIllIIIlIlIIllIII, final int lllllllllllllIIIIllIIIlIlIIlIIIl, final boolean lllllllllllllIIIIllIIIlIlIIlIIII) throws IOException {
        this.ensureAccessible();
        if (llllIIlIlIIIlII(lllllllllllllIIIIllIIIlIlIIlIIIl)) {
            return UnpooledDirectByteBuf.lIlIllIlllIllI[0];
        }
        ByteBuffer lllllllllllllIIIIllIIIlIlIIlIlIl = null;
        if (llllIIlIlIIIlIl(lllllllllllllIIIIllIIIlIlIIlIIII ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIIIllIIIlIlIIllIll = this.internalNioBuffer();
            "".length();
            if (null != null) {
                return (0x57 ^ 0x33 ^ (0x2 ^ 0x6F)) & (20 + 15 + 21 + 127 ^ 8 + 26 - 33 + 189 ^ -" ".length());
            }
        }
        else {
            lllllllllllllIIIIllIIIlIlIIlIlIl = this.buffer.duplicate();
        }
        lllllllllllllIIIIllIIIlIlIIlIlIl.clear().position(lllllllllllllIIIIllIIIlIlIIlIIll).limit(lllllllllllllIIIIllIIIlIlIIlIIll + lllllllllllllIIIIllIIIlIlIIlIIIl);
        "".length();
        return lllllllllllllIIIIllIIIlIlIIllIII.write(lllllllllllllIIIIllIIIlIlIIlIlIl);
    }
    
    @Override
    public boolean hasArray() {
        return UnpooledDirectByteBuf.lIlIllIlllIllI[0] != 0;
    }
    
    private static boolean llllIIlIlIIIIIl(final Object lllllllllllllIIIIllIIIIllllIIIlI) {
        return lllllllllllllIIIIllIIIIllllIIIlI == null;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIllIIIlIllIlllll, ByteBuffer lllllllllllllIIIIllIIIlIllIllIlI) {
        this.ensureAccessible();
        final ByteBuffer lllllllllllllIIIIllIIIlIllIlllIl = this.internalNioBuffer();
        if (llllIIlIlIIlllI(lllllllllllllIIIIllIIIlIllIllIlI, lllllllllllllIIIIllIIIlIllIlllIl)) {
            lllllllllllllIIIIllIIIlIllIllIlI = ((ByteBuffer)lllllllllllllIIIIllIIIlIllIllIlI).duplicate();
        }
        lllllllllllllIIIIllIIIlIllIlllIl.clear().position(lllllllllllllIIIIllIIIlIllIlllll).limit(lllllllllllllIIIIllIIIlIllIlllll + ((Buffer)lllllllllllllIIIIllIIIlIllIllIlI).remaining());
        "".length();
        lllllllllllllIIIIllIIIlIllIlllIl.put((ByteBuffer)lllllllllllllIIIIllIIIlIllIllIlI);
        "".length();
        return this;
    }
    
    @Override
    protected void _setByte(final int lllllllllllllIIIIllIIIllIlIllllI, final int lllllllllllllIIIIllIIIllIllIIIII) {
        this.buffer.put(lllllllllllllIIIIllIIIllIlIllllI, (byte)lllllllllllllIIIIllIIIllIllIIIII);
        "".length();
    }
    
    private static boolean llllIIlIlIIlIll(final int lllllllllllllIIIIllIIIIlllIlllII) {
        return lllllllllllllIIIIllIIIIlllIlllII >= 0;
    }
    
    @Override
    public ByteBuffer nioBuffer(final int lllllllllllllIIIIllIIIlIIIlIllII, final int lllllllllllllIIIIllIIIlIIIlIlllI) {
        this.checkIndex(lllllllllllllIIIIllIIIlIIIlIllII, lllllllllllllIIIIllIIIlIIIlIlllI);
        return ((ByteBuffer)this.buffer.duplicate().position(lllllllllllllIIIIllIIIlIIIlIllII).limit(lllllllllllllIIIIllIIIlIIIlIllII + lllllllllllllIIIIllIIIlIIIlIlllI)).slice();
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIIIIllIIIlIIIlllIll, final int lllllllllllllIIIIllIIIlIIIlllIlI) {
        this.checkIndex(lllllllllllllIIIIllIIIlIIIlllIll, lllllllllllllIIIIllIIIlIIIlllIlI);
        return (ByteBuffer)this.internalNioBuffer().clear().position(lllllllllllllIIIIllIIIlIIIlllIll).limit(lllllllllllllIIIIllIIIlIIIlllIll + lllllllllllllIIIIllIIIlIIIlllIlI);
    }
    
    @Override
    public int nioBufferCount() {
        return UnpooledDirectByteBuf.lIlIllIlllIllI[1];
    }
    
    @Override
    protected long _getLong(final int lllllllllllllIIIIllIIIlllllIIIll) {
        return this.buffer.getLong(lllllllllllllIIIIllIIIlllllIIIll);
    }
    
    protected UnpooledDirectByteBuf(final ByteBufAllocator lllllllllllllIIIIllIIlIIIlIlllII, final ByteBuffer lllllllllllllIIIIllIIlIIIlIllIll, final int lllllllllllllIIIIllIIlIIIlIlIlIl) {
        super(lllllllllllllIIIIllIIlIIIlIlIlIl);
        if (llllIIlIlIIIIIl(lllllllllllllIIIIllIIlIIIlIlllII)) {
            throw new NullPointerException(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[4]]);
        }
        if (llllIIlIlIIIIIl(lllllllllllllIIIIllIIlIIIlIllIll)) {
            throw new NullPointerException(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[5]]);
        }
        if (llllIIlIlIIIlII(lllllllllllllIIIIllIIlIIIlIllIll.isDirect() ? 1 : 0)) {
            throw new IllegalArgumentException(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[6]]);
        }
        if (llllIIlIlIIIlIl(lllllllllllllIIIIllIIlIIIlIllIll.isReadOnly() ? 1 : 0)) {
            throw new IllegalArgumentException(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[7]]);
        }
        final int lllllllllllllIIIIllIIlIIIlIllIIl = lllllllllllllIIIIllIIlIIIlIllIll.remaining();
        if (llllIIlIlIIIIll(lllllllllllllIIIIllIIlIIIlIllIIl, lllllllllllllIIIIllIIlIIIlIlIlIl)) {
            final String format = UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[8]];
            final Object[] args = new Object[UnpooledDirectByteBuf.lIlIllIlllIllI[2]];
            args[UnpooledDirectByteBuf.lIlIllIlllIllI[0]] = lllllllllllllIIIIllIIlIIIlIllIIl;
            args[UnpooledDirectByteBuf.lIlIllIlllIllI[1]] = lllllllllllllIIIIllIIlIIIlIlIlIl;
            throw new IllegalArgumentException(String.format(format, args));
        }
        this.alloc = lllllllllllllIIIIllIIlIIIlIlllII;
        this.doNotFree = (UnpooledDirectByteBuf.lIlIllIlllIllI[1] != 0);
        this.setByteBuffer(lllllllllllllIIIIllIIlIIIlIllIll.slice().order(ByteOrder.BIG_ENDIAN));
        this.writerIndex(lllllllllllllIIIIllIIlIIIlIllIIl);
        "".length();
    }
    
    @Override
    public ByteBuf setInt(final int lllllllllllllIIIIllIIIllIIllIlII, final int lllllllllllllIIIIllIIIllIIllIIll) {
        this.ensureAccessible();
        this._setInt(lllllllllllllIIIIllIIIllIIllIlII, lllllllllllllIIIIllIIIllIIllIIll);
        return this;
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIIIIllIIIlIIlIlIIll, final int lllllllllllllIIIIllIIIlIIlIlIIlI) {
        final ByteBuffer[] array = new ByteBuffer[UnpooledDirectByteBuf.lIlIllIlllIllI[1]];
        array[UnpooledDirectByteBuf.lIlIllIlllIllI[0]] = this.nioBuffer(lllllllllllllIIIIllIIIlIIlIlIIll, lllllllllllllIIIIllIIIlIIlIlIIlI);
        return array;
    }
    
    @Override
    public ByteBuf readBytes(final byte[] lllllllllllllIIIIllIIIlllIIlIllI, final int lllllllllllllIIIIllIIIlllIIllIIl, final int lllllllllllllIIIIllIIIlllIIlIlII) {
        this.checkReadableBytes(lllllllllllllIIIIllIIIlllIIlIlII);
        this.getBytes(this.readerIndex, lllllllllllllIIIIllIIIlllIIlIllI, lllllllllllllIIIIllIIIlllIIllIIl, lllllllllllllIIIIllIIIlllIIlIlII, (boolean)(UnpooledDirectByteBuf.lIlIllIlllIllI[1] != 0));
        this.readerIndex += lllllllllllllIIIIllIIIlllIIlIlII;
        return this;
    }
    
    @Override
    public ByteBuf capacity(final int lllllllllllllIIIIllIIlIIIIlIllIl) {
        this.ensureAccessible();
        if (!llllIIlIlIIlIll(lllllllllllllIIIIllIIlIIIIlIllIl) || llllIIlIlIIIIll(lllllllllllllIIIIllIIlIIIIlIllIl, this.maxCapacity())) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[9]]).append(lllllllllllllIIIIllIIlIIIIlIllIl)));
        }
        final int lllllllllllllIIIIllIIlIIIIllIIIl = this.readerIndex();
        int lllllllllllllIIIIllIIlIIIIllIIII = this.writerIndex();
        final int lllllllllllllIIIIllIIlIIIIlIllll = this.capacity;
        if (llllIIlIlIIIIll(lllllllllllllIIIIllIIlIIIIlIllIl, lllllllllllllIIIIllIIlIIIIlIllll)) {
            final ByteBuffer lllllllllllllIIIIllIIlIIIIllIlll = this.buffer;
            final ByteBuffer lllllllllllllIIIIllIIlIIIIllIllI = this.allocateDirect(lllllllllllllIIIIllIIlIIIIlIllIl);
            lllllllllllllIIIIllIIlIIIIllIlll.position(UnpooledDirectByteBuf.lIlIllIlllIllI[0]).limit(lllllllllllllIIIIllIIlIIIIllIlll.capacity());
            "".length();
            lllllllllllllIIIIllIIlIIIIllIllI.position(UnpooledDirectByteBuf.lIlIllIlllIllI[0]).limit(lllllllllllllIIIIllIIlIIIIllIlll.capacity());
            "".length();
            lllllllllllllIIIIllIIlIIIIllIllI.put(lllllllllllllIIIIllIIlIIIIllIlll);
            "".length();
            lllllllllllllIIIIllIIlIIIIllIllI.clear();
            "".length();
            this.setByteBuffer(lllllllllllllIIIIllIIlIIIIllIllI);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (llllIIlIlIIllII(lllllllllllllIIIIllIIlIIIIlIllIl, lllllllllllllIIIIllIIlIIIIlIllll)) {
            final ByteBuffer lllllllllllllIIIIllIIlIIIIllIlIl = this.buffer;
            final ByteBuffer lllllllllllllIIIIllIIlIIIIllIlII = this.allocateDirect(lllllllllllllIIIIllIIlIIIIlIllIl);
            if (llllIIlIlIIllII(lllllllllllllIIIIllIIlIIIIllIIIl, lllllllllllllIIIIllIIlIIIIlIllIl)) {
                if (llllIIlIlIIIIll(lllllllllllllIIIIllIIlIIIIllIIII, lllllllllllllIIIIllIIlIIIIlIllIl)) {
                    lllllllllllllIIIIllIIlIIIIllIIII = lllllllllllllIIIIllIIlIIIIlIllIl;
                    this.writerIndex(lllllllllllllIIIIllIIlIIIIlIllIl);
                    "".length();
                }
                lllllllllllllIIIIllIIlIIIIllIlIl.position(lllllllllllllIIIIllIIlIIIIllIIIl).limit(lllllllllllllIIIIllIIlIIIIllIIII);
                "".length();
                lllllllllllllIIIIllIIlIIIIllIlII.position(lllllllllllllIIIIllIIlIIIIllIIIl).limit(lllllllllllllIIIIllIIlIIIIllIIII);
                "".length();
                lllllllllllllIIIIllIIlIIIIllIlII.put(lllllllllllllIIIIllIIlIIIIllIlIl);
                "".length();
                lllllllllllllIIIIllIIlIIIIllIlII.clear();
                "".length();
                "".length();
                if (" ".length() <= ((0x9F ^ 0xA3 ^ (0x47 ^ 0x4A)) & (0x11 ^ 0x2 ^ (0xAC ^ 0x8E) ^ -" ".length()))) {
                    return null;
                }
            }
            else {
                this.setIndex(lllllllllllllIIIIllIIlIIIIlIllIl, lllllllllllllIIIIllIIlIIIIlIllIl);
                "".length();
            }
            this.setByteBuffer(lllllllllllllIIIIllIIlIIIIllIlII);
        }
        return this;
    }
    
    @Override
    public ByteBuf setByte(final int lllllllllllllIIIIllIIIllIllIIlll, final int lllllllllllllIIIIllIIIllIllIlIIl) {
        this.ensureAccessible();
        this._setByte(lllllllllllllIIIIllIIIllIllIIlll, lllllllllllllIIIIllIIIllIllIlIIl);
        return this;
    }
    
    @Override
    public ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }
    
    private void getBytes(final int lllllllllllllIIIIllIIIllIlllllII, final ByteBuffer lllllllllllllIIIIllIIIlllIIIIIIl, final boolean lllllllllllllIIIIllIIIlllIIIIIII) {
        this.checkIndex(lllllllllllllIIIIllIIIllIlllllII);
        if (llllIIlIlIIIIIl(lllllllllllllIIIIllIIIlllIIIIIIl)) {
            throw new NullPointerException(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[15]]);
        }
        final int lllllllllllllIIIIllIIIllIlllllll = Math.min(this.capacity() - lllllllllllllIIIIllIIIllIlllllII, lllllllllllllIIIIllIIIlllIIIIIIl.remaining());
        ByteBuffer lllllllllllllIIIIllIIIllIllllllI = null;
        if (llllIIlIlIIIlIl(lllllllllllllIIIIllIIIlllIIIIIII ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIIIllIIIlllIIIIlII = this.internalNioBuffer();
            "".length();
            if ((0x73 ^ 0x74 ^ "   ".length()) <= " ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIIIllIIIllIllllllI = this.buffer.duplicate();
        }
        lllllllllllllIIIIllIIIllIllllllI.clear().position(lllllllllllllIIIIllIIIllIlllllII).limit(lllllllllllllIIIIllIIIllIlllllII + lllllllllllllIIIIllIIIllIlllllll);
        "".length();
        lllllllllllllIIIIllIIIlllIIIIIIl.put(lllllllllllllIIIIllIIIllIllllllI);
        "".length();
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return UnpooledDirectByteBuf.lIlIllIlllIllI[0] != 0;
    }
    
    @Override
    protected int _getUnsignedMedium(final int lllllllllllllIIIIllIIIllllllllIl) {
        return (this.getByte(lllllllllllllIIIIllIIIllllllllIl) & UnpooledDirectByteBuf.lIlIllIlllIllI[12]) << UnpooledDirectByteBuf.lIlIllIlllIllI[13] | (this.getByte(lllllllllllllIIIIllIIIllllllllIl + UnpooledDirectByteBuf.lIlIllIlllIllI[1]) & UnpooledDirectByteBuf.lIlIllIlllIllI[12]) << UnpooledDirectByteBuf.lIlIllIlllIllI[8] | (this.getByte(lllllllllllllIIIIllIIIllllllllIl + UnpooledDirectByteBuf.lIlIllIlllIllI[2]) & UnpooledDirectByteBuf.lIlIllIlllIllI[12]);
    }
    
    @Override
    public ByteBuf setShort(final int lllllllllllllIIIIllIIIllIlIlIlIl, final int lllllllllllllIIIIllIIIllIlIlIlII) {
        this.ensureAccessible();
        this._setShort(lllllllllllllIIIIllIIIllIlIlIlIl, lllllllllllllIIIIllIIIllIlIlIlII);
        return this;
    }
    
    @Override
    public long getLong(final int lllllllllllllIIIIllIIIlllllIlIll) {
        this.ensureAccessible();
        return this._getLong(lllllllllllllIIIIllIIIlllllIlIll);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIllIIIlllIIIllII, final ByteBuffer lllllllllllllIIIIllIIIlllIIIlIll) {
        this.getBytes(lllllllllllllIIIIllIIIlllIIIllII, lllllllllllllIIIIllIIIlllIIIlIll, (boolean)(UnpooledDirectByteBuf.lIlIllIlllIllI[0] != 0));
        return this;
    }
    
    @Override
    public int capacity() {
        return this.capacity;
    }
    
    private static String llllIIlIIlIlllI(String lllllllllllllIIIIllIIIlIIIIlIlII, final String lllllllllllllIIIIllIIIlIIIIllIII) {
        lllllllllllllIIIIllIIIlIIIIlIlII = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllIIIlIIIIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIIIlIIIIlIlll = new StringBuilder();
        final char[] lllllllllllllIIIIllIIIlIIIIlIllI = lllllllllllllIIIIllIIIlIIIIllIII.toCharArray();
        int lllllllllllllIIIIllIIIlIIIIlIlIl = UnpooledDirectByteBuf.lIlIllIlllIllI[0];
        final double lllllllllllllIIIIllIIIlIIIIIllll = (Object)((String)lllllllllllllIIIIllIIIlIIIIlIlII).toCharArray();
        final long lllllllllllllIIIIllIIIlIIIIIlllI = lllllllllllllIIIIllIIIlIIIIIllll.length;
        String lllllllllllllIIIIllIIIlIIIIIllIl = (String)UnpooledDirectByteBuf.lIlIllIlllIllI[0];
        while (llllIIlIlIIllII((int)lllllllllllllIIIIllIIIlIIIIIllIl, (int)lllllllllllllIIIIllIIIlIIIIIlllI)) {
            final char lllllllllllllIIIIllIIIlIIIIllIlI = lllllllllllllIIIIllIIIlIIIIIllll[lllllllllllllIIIIllIIIlIIIIIllIl];
            lllllllllllllIIIIllIIIlIIIIlIlll.append((char)(lllllllllllllIIIIllIIIlIIIIllIlI ^ lllllllllllllIIIIllIIIlIIIIlIllI[lllllllllllllIIIIllIIIlIIIIlIlIl % lllllllllllllIIIIllIIIlIIIIlIllI.length]));
            "".length();
            ++lllllllllllllIIIIllIIIlIIIIlIlIl;
            ++lllllllllllllIIIIllIIIlIIIIIllIl;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIIIlIIIIlIlll);
    }
    
    private static boolean llllIIlIlIlIIII(final int lllllllllllllIIIIllIIIIlllIllIII) {
        return lllllllllllllIIIIllIIIIlllIllIII <= 0;
    }
    
    private void setByteBuffer(final ByteBuffer lllllllllllllIIIIllIIlIIIlIIIlII) {
        final ByteBuffer lllllllllllllIIIIllIIlIIIlIIIllI = this.buffer;
        if (llllIIlIlIIIlll(lllllllllllllIIIIllIIlIIIlIIIllI)) {
            if (llllIIlIlIIIlIl(this.doNotFree ? 1 : 0)) {
                this.doNotFree = (UnpooledDirectByteBuf.lIlIllIlllIllI[0] != 0);
                "".length();
                if ("  ".length() >= (0x9 ^ 0x48 ^ (0x18 ^ 0x5D))) {
                    return;
                }
            }
            else {
                this.freeDirect(lllllllllllllIIIIllIIlIIIlIIIllI);
            }
        }
        this.buffer = lllllllllllllIIIIllIIlIIIlIIIlII;
        this.tmpNioBuf = null;
        this.capacity = lllllllllllllIIIIllIIlIIIlIIIlII.remaining();
    }
    
    @Override
    public int getUnsignedMedium(final int lllllllllllllIIIIllIIlIIIIIIIIIl) {
        this.ensureAccessible();
        return this._getUnsignedMedium(lllllllllllllIIIIllIIlIIIIIIIIIl);
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.alloc;
    }
    
    protected UnpooledDirectByteBuf(final ByteBufAllocator lllllllllllllIIIIllIIlIIIllIlIIl, final int lllllllllllllIIIIllIIlIIIllIIlII, final int lllllllllllllIIIIllIIlIIIllIIIll) {
        super(lllllllllllllIIIIllIIlIIIllIIIll);
        if (llllIIlIlIIIIIl(lllllllllllllIIIIllIIlIIIllIlIIl)) {
            throw new NullPointerException(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[0]]);
        }
        if (llllIIlIlIIIIlI(lllllllllllllIIIIllIIlIIIllIIlII)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[1]]).append(lllllllllllllIIIIllIIlIIIllIIlII)));
        }
        if (llllIIlIlIIIIlI(lllllllllllllIIIIllIIlIIIllIIIll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[2]]).append(lllllllllllllIIIIllIIlIIIllIIIll)));
        }
        if (llllIIlIlIIIIll(lllllllllllllIIIIllIIlIIIllIIlII, lllllllllllllIIIIllIIlIIIllIIIll)) {
            final String format = UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[3]];
            final Object[] args = new Object[UnpooledDirectByteBuf.lIlIllIlllIllI[2]];
            args[UnpooledDirectByteBuf.lIlIllIlllIllI[0]] = lllllllllllllIIIIllIIlIIIllIIlII;
            args[UnpooledDirectByteBuf.lIlIllIlllIllI[1]] = lllllllllllllIIIIllIIlIIIllIIIll;
            throw new IllegalArgumentException(String.format(format, args));
        }
        this.alloc = lllllllllllllIIIIllIIlIIIllIlIIl;
        this.setByteBuffer(ByteBuffer.allocateDirect(lllllllllllllIIIIllIIlIIIllIIlII));
    }
    
    @Override
    public short getShort(final int lllllllllllllIIIIllIIlIIIIIIllIl) {
        this.ensureAccessible();
        return this._getShort(lllllllllllllIIIIllIIlIIIIIIllIl);
    }
    
    private static boolean llllIIlIlIIIlll(final Object lllllllllllllIIIIllIIIIllllIlIII) {
        return lllllllllllllIIIIllIIIIllllIlIII != null;
    }
    
    @Override
    public int getInt(final int lllllllllllllIIIIllIIIllllllIlll) {
        this.ensureAccessible();
        return this._getInt(lllllllllllllIIIIllIIIllllllIlll);
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIIIIllIIIlIlllIllll, final byte[] lllllllllllllIIIIllIIIlIlllIlIII, final int lllllllllllllIIIIllIIIlIlllIIlll, final int lllllllllllllIIIIllIIIlIlllIIllI) {
        this.checkSrcIndex(lllllllllllllIIIIllIIIlIlllIllll, lllllllllllllIIIIllIIIlIlllIIllI, lllllllllllllIIIIllIIIlIlllIIlll, lllllllllllllIIIIllIIIlIlllIlIII.length);
        final ByteBuffer lllllllllllllIIIIllIIIlIlllIlIll = this.internalNioBuffer();
        lllllllllllllIIIIllIIIlIlllIlIll.clear().position(lllllllllllllIIIIllIIIlIlllIllll).limit(lllllllllllllIIIIllIIIlIlllIllll + lllllllllllllIIIIllIIIlIlllIIllI);
        "".length();
        lllllllllllllIIIIllIIIlIlllIlIll.put(lllllllllllllIIIIllIIIlIlllIlIII, lllllllllllllIIIIllIIIlIlllIIlll, lllllllllllllIIIIllIIIlIlllIIllI);
        "".length();
        return this;
    }
    
    @Override
    protected void deallocate() {
        final ByteBuffer lllllllllllllIIIIllIIIlIIIlIIlll = this.buffer;
        if (llllIIlIlIIIIIl(lllllllllllllIIIIllIIIlIIIlIIlll)) {
            return;
        }
        this.buffer = null;
        if (llllIIlIlIIIlII(this.doNotFree ? 1 : 0)) {
            this.freeDirect(lllllllllllllIIIIllIIIlIIIlIIlll);
        }
    }
    
    private static boolean llllIIlIlIIlllI(final Object lllllllllllllIIIIllIIIIllllIIlIl, final Object lllllllllllllIIIIllIIIIllllIIlII) {
        return lllllllllllllIIIIllIIIIllllIIlIl == lllllllllllllIIIIllIIIIllllIIlII;
    }
    
    private static boolean llllIIlIlIIIIll(final int lllllllllllllIIIIllIIIIllllIlIll, final int lllllllllllllIIIIllIIIIllllIlIlI) {
        return lllllllllllllIIIIllIIIIllllIlIll > lllllllllllllIIIIllIIIIllllIlIlI;
    }
    
    @Override
    public byte[] array() {
        throw new UnsupportedOperationException(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[10]]);
    }
    
    @Override
    public int arrayOffset() {
        throw new UnsupportedOperationException(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[11]]);
    }
    
    @Override
    public ByteBuf setLong(final int lllllllllllllIIIIllIIIllIIIlllll, final long lllllllllllllIIIIllIIIllIIIllllI) {
        this.ensureAccessible();
        this._setLong(lllllllllllllIIIIllIIIllIIIlllll, lllllllllllllIIIIllIIIllIIIllllI);
        return this;
    }
    
    private static boolean llllIIlIlIIllII(final int lllllllllllllIIIIllIIIIllllIllll, final int lllllllllllllIIIIllIIIIllllIlllI) {
        return lllllllllllllIIIIllIIIIllllIllll < lllllllllllllIIIIllIIIIllllIlllI;
    }
    
    private void getBytes(final int lllllllllllllIIIIllIIIlIllIIIIIl, final OutputStream lllllllllllllIIIIllIIIlIllIIIIII, final int lllllllllllllIIIIllIIIlIlIlllIlI, final boolean lllllllllllllIIIIllIIIlIlIlllllI) throws IOException {
        this.ensureAccessible();
        if (llllIIlIlIIIlII(lllllllllllllIIIIllIIIlIlIlllIlI)) {
            return;
        }
        if (llllIIlIlIIIlIl(this.buffer.hasArray() ? 1 : 0)) {
            lllllllllllllIIIIllIIIlIllIIIIII.write(this.buffer.array(), lllllllllllllIIIIllIIIlIllIIIIIl + this.buffer.arrayOffset(), lllllllllllllIIIIllIIIlIlIlllIlI);
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            final byte[] lllllllllllllIIIIllIIIlIllIIIlII = new byte[lllllllllllllIIIIllIIIlIlIlllIlI];
            ByteBuffer lllllllllllllIIIIllIIIlIllIIIIll = null;
            if (llllIIlIlIIIlIl(lllllllllllllIIIIllIIIlIlIlllllI ? 1 : 0)) {
                final ByteBuffer lllllllllllllIIIIllIIIlIllIIIlIl = this.internalNioBuffer();
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIIllIIIlIllIIIIll = this.buffer.duplicate();
            }
            lllllllllllllIIIIllIIIlIllIIIIll.clear().position(lllllllllllllIIIIllIIIlIllIIIIIl);
            "".length();
            lllllllllllllIIIIllIIIlIllIIIIll.get(lllllllllllllIIIIllIIIlIllIIIlII);
            "".length();
            lllllllllllllIIIIllIIIlIllIIIIII.write(lllllllllllllIIIIllIIIlIllIIIlII);
        }
    }
    
    @Override
    public boolean isDirect() {
        return UnpooledDirectByteBuf.lIlIllIlllIllI[1] != 0;
    }
    
    @Override
    protected short _getShort(final int lllllllllllllIIIIllIIlIIIIIIlIIl) {
        return this.buffer.getShort(lllllllllllllIIIIllIIlIIIIIIlIIl);
    }
    
    private static String llllIIlIIlIllll(final String lllllllllllllIIIIllIIIIlllllIlIl, final String lllllllllllllIIIIllIIIIlllllIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIIIllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIIIlllllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIIIIllllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIIIIllllllIIl.init(UnpooledDirectByteBuf.lIlIllIlllIllI[2], lllllllllllllIIIIllIIIIllllllIlI);
            return new String(lllllllllllllIIIIllIIIIllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIIIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIIIllllllIII) {
            lllllllllllllIIIIllIIIIllllllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public byte getByte(final int lllllllllllllIIIIllIIlIIIIIllIll) {
        this.ensureAccessible();
        return this._getByte(lllllllllllllIIIIllIIlIIIIIllIll);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIllIIIlllIlllllI, final byte[] lllllllllllllIIIIllIIIlllIllllIl, final int lllllllllllllIIIIllIIIlllIllllII, final int lllllllllllllIIIIllIIIlllIllIllI) {
        this.getBytes(lllllllllllllIIIIllIIIlllIlllllI, lllllllllllllIIIIllIIIlllIllllIl, lllllllllllllIIIIllIIIlllIllllII, lllllllllllllIIIIllIIIlllIllIllI, (boolean)(UnpooledDirectByteBuf.lIlIllIlllIllI[0] != 0));
        return this;
    }
    
    @Override
    protected int _getInt(final int lllllllllllllIIIIllIIIlllllIllll) {
        return this.buffer.getInt(lllllllllllllIIIIllIIIlllllIllll);
    }
    
    protected ByteBuffer allocateDirect(final int lllllllllllllIIIIllIIlIIIlIlIIII) {
        return ByteBuffer.allocateDirect(lllllllllllllIIIIllIIlIIIlIlIIII);
    }
    
    private static void llllIIlIlIIIIII() {
        (lIlIllIlllIllI = new int[19])[0] = (("  ".length() ^ (0xD6 ^ 0x9A)) & (65 + 19 + 33 + 81 ^ 128 + 8 - 125 + 125 ^ -" ".length()));
        UnpooledDirectByteBuf.lIlIllIlllIllI[1] = " ".length();
        UnpooledDirectByteBuf.lIlIllIlllIllI[2] = "  ".length();
        UnpooledDirectByteBuf.lIlIllIlllIllI[3] = "   ".length();
        UnpooledDirectByteBuf.lIlIllIlllIllI[4] = (0xF ^ 0x34 ^ (0xA4 ^ 0x9B));
        UnpooledDirectByteBuf.lIlIllIlllIllI[5] = (0x66 ^ 0x63);
        UnpooledDirectByteBuf.lIlIllIlllIllI[6] = (0xC0 ^ 0xC6);
        UnpooledDirectByteBuf.lIlIllIlllIllI[7] = (0x68 ^ 0x6F);
        UnpooledDirectByteBuf.lIlIllIlllIllI[8] = (0x23 ^ 0x75 ^ (0x3D ^ 0x63));
        UnpooledDirectByteBuf.lIlIllIlllIllI[9] = (0x91 ^ 0x98);
        UnpooledDirectByteBuf.lIlIllIlllIllI[10] = (0x10 ^ 0x55 ^ (0x3B ^ 0x74));
        UnpooledDirectByteBuf.lIlIllIlllIllI[11] = (0xCF ^ 0xC4);
        UnpooledDirectByteBuf.lIlIllIlllIllI[12] = 45 + 111 - 64 + 44 + (0x17 ^ 0x9) - (129 + 112 - 202 + 97) + (198 + 83 - 168 + 112);
        UnpooledDirectByteBuf.lIlIllIlllIllI[13] = (0x4A ^ 0x5A);
        UnpooledDirectByteBuf.lIlIllIlllIllI[14] = (113 + 175 - 110 + 12 ^ 93 + 117 - 95 + 63);
        UnpooledDirectByteBuf.lIlIllIlllIllI[15] = (146 + 149 - 278 + 153 ^ 36 + 146 - 107 + 92);
        UnpooledDirectByteBuf.lIlIllIlllIllI[16] = -" ".length();
        UnpooledDirectByteBuf.lIlIllIlllIllI[17] = (0xDC ^ 0xAD ^ 122 + 56 - 145 + 94);
        UnpooledDirectByteBuf.lIlIllIlllIllI[18] = (0xDA ^ 0xAF ^ (0x16 ^ 0x6C));
    }
    
    @Override
    public ByteBuf unwrap() {
        return null;
    }
    
    @Override
    public ByteBuf readBytes(final OutputStream lllllllllllllIIIIllIIIlIlIllIIlI, final int lllllllllllllIIIIllIIIlIlIllIIIl) throws IOException {
        this.checkReadableBytes(lllllllllllllIIIIllIIIlIlIllIIIl);
        this.getBytes(this.readerIndex, lllllllllllllIIIIllIIIlIlIllIIlI, lllllllllllllIIIIllIIIlIlIllIIIl, (boolean)(UnpooledDirectByteBuf.lIlIllIlllIllI[1] != 0));
        this.readerIndex += lllllllllllllIIIIllIIIlIlIllIIIl;
        return this;
    }
    
    private static boolean llllIIlIlIIIlII(final int lllllllllllllIIIIllIIIIlllIllllI) {
        return lllllllllllllIIIIllIIIIlllIllllI == 0;
    }
    
    protected void freeDirect(final ByteBuffer lllllllllllllIIIIllIIlIIIlIIllII) {
        PlatformDependent.freeDirectBuffer(lllllllllllllIIIIllIIlIIIlIIllII);
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIIIIllIIIlIIlIIIllI, final int lllllllllllllIIIIllIIIlIIlIIlIIl) {
        this.ensureAccessible();
        ByteBuffer lllllllllllllIIIIllIIIlIIlIIlIII;
        try {
            lllllllllllllIIIIllIIIlIIlIIlIII = (ByteBuffer)this.buffer.duplicate().clear().position(lllllllllllllIIIIllIIIlIIlIIIllI).limit(lllllllllllllIIIIllIIIlIIlIIIllI + lllllllllllllIIIIllIIIlIIlIIlIIl);
            "".length();
            if (null != null) {
                return null;
            }
        }
        catch (IllegalArgumentException lllllllllllllIIIIllIIIlIIlIIllII) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[17]]).append(lllllllllllllIIIIllIIIlIIlIIIllI + lllllllllllllIIIIllIIIlIIlIIlIIl)));
        }
        return this.alloc().directBuffer(lllllllllllllIIIIllIIIlIIlIIlIIl, this.maxCapacity()).writeBytes(lllllllllllllIIIIllIIIlIIlIIlIII);
    }
    
    private static void llllIIlIIllllll() {
        (lIlIllIlllIlII = new String[UnpooledDirectByteBuf.lIlIllIlllIllI[18]])[UnpooledDirectByteBuf.lIlIllIlllIllI[0]] = llllIIlIIlIlllI("GAQCNiE=", "yhnYB");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[1]] = llllIIlIIlIlllI("KicbHBwiJTEJBSIqGxwMeWk=", "CIrhu");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[2]] = llllIIlIIlIllll("ekpXJFqs2KHu/pOHAswItw==", "qTRZH");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[3]] = llllIIlIIlIlllI("ByYdGD8PJDcNJg8rHRgvRm0QRXZQaBkNLi0pBA01BzwNRHMKYQ==", "nHtlV");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[4]] = llllIIlIIlIlllI("Gz49HhU=", "zRQqv");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[5]] = llllIIlIIllIllI("EExdqyAiTOiBYHpR7PcMxQ==", "SjGVy");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[6]] = llllIIlIIlIlllI("BycCLR4PJSksEQgsGXkeHWkFNgNOKEs9HhwsCC1XDDwNPxIcZw==", "nIkYw");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[7]] = llllIIlIIllIllI("Dh4Xe4lvOIWDLXkAxOSG5Zll/CeL6HANnhxq8CAVaoSzqDtyZcMfeQ==", "GVvaG");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[8]] = llllIIlIIllIllI("Izcvb3QKpJFFEzldz2MdfONu73jmas4lGvME3yA/0AEBRW22dtD40A==", "pDjJl");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[9]] = llllIIlIIllIllI("KcYtW0gxLFqEchDi/uASAQ==", "hwpjk");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[10]] = llllIIlIIlIlllI("IhAwPBUyWSAsECAcMA==", "FyBYv");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[11]] = llllIIlIIllIllI("+u3P0U94KyKToE4iFW+YCw==", "dPENb");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[14]] = llllIIlIIlIlllI("JgM8DjYmFTB9eGcUZGc0Jx4vMzB4UG0jeGoVMDc9IQQtI2JiAikpPydYeGt4ZxRhbg==", "BpHGX");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[15]] = llllIIlIIlIlllI("Kio4", "NYLmq");
        UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[17]] = llllIIlIIlIllll("M/NNr1dzILm85A2vjpC7UwHtOxGXSCkPh6iye2eLAJc=", "uhMqs");
    }
    
    private static boolean llllIIlIlIIIIlI(final int lllllllllllllIIIIllIIIIlllIllIlI) {
        return lllllllllllllIIIIllIIIIlllIllIlI < 0;
    }
    
    private static boolean llllIIlIlIIIlIl(final int lllllllllllllIIIIllIIIIllllIIIII) {
        return lllllllllllllIIIIllIIIIllllIIIII != 0;
    }
    
    private void getBytes(final int lllllllllllllIIIIllIIIlllIlIllII, final byte[] lllllllllllllIIIIllIIIlllIlIlIll, final int lllllllllllllIIIIllIIIlllIlIIIll, final int lllllllllllllIIIIllIIIlllIlIlIIl, final boolean lllllllllllllIIIIllIIIlllIlIlIII) {
        this.checkDstIndex(lllllllllllllIIIIllIIIlllIlIllII, lllllllllllllIIIIllIIIlllIlIlIIl, lllllllllllllIIIIllIIIlllIlIIIll, lllllllllllllIIIIllIIIlllIlIlIll.length);
        if (!llllIIlIlIIlIll(lllllllllllllIIIIllIIIlllIlIIIll) || llllIIlIlIIIIll(lllllllllllllIIIIllIIIlllIlIIIll, lllllllllllllIIIIllIIIlllIlIlIll.length - lllllllllllllIIIIllIIIlllIlIlIIl)) {
            final String format = UnpooledDirectByteBuf.lIlIllIlllIlII[UnpooledDirectByteBuf.lIlIllIlllIllI[14]];
            final Object[] args = new Object[UnpooledDirectByteBuf.lIlIllIlllIllI[3]];
            args[UnpooledDirectByteBuf.lIlIllIlllIllI[0]] = lllllllllllllIIIIllIIIlllIlIIIll;
            args[UnpooledDirectByteBuf.lIlIllIlllIllI[1]] = lllllllllllllIIIIllIIIlllIlIlIIl;
            args[UnpooledDirectByteBuf.lIlIllIlllIllI[2]] = lllllllllllllIIIIllIIIlllIlIlIll.length;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        ByteBuffer lllllllllllllIIIIllIIIlllIlIIlll = null;
        if (llllIIlIlIIIlIl(lllllllllllllIIIIllIIIlllIlIlIII ? 1 : 0)) {
            final ByteBuffer lllllllllllllIIIIllIIIlllIlIlllI = this.internalNioBuffer();
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIIIllIIIlllIlIIlll = this.buffer.duplicate();
        }
        lllllllllllllIIIIllIIIlllIlIIlll.clear().position(lllllllllllllIIIIllIIIlllIlIllII).limit(lllllllllllllIIIIllIIIlllIlIllII + lllllllllllllIIIIllIIIlllIlIlIIl);
        "".length();
        lllllllllllllIIIIllIIIlllIlIIlll.get(lllllllllllllIIIIllIIIlllIlIlIll, lllllllllllllIIIIllIIIlllIlIIIll, lllllllllllllIIIIllIIIlllIlIlIIl);
        "".length();
    }
    
    @Override
    protected byte _getByte(final int lllllllllllllIIIIllIIlIIIIIlIlIl) {
        return this.buffer.get(lllllllllllllIIIIllIIlIIIIIlIlIl);
    }
    
    @Override
    public int readBytes(final GatheringByteChannel lllllllllllllIIIIllIIIlIlIIIIlIl, final int lllllllllllllIIIIllIIIlIlIIIlIII) throws IOException {
        this.checkReadableBytes(lllllllllllllIIIIllIIIlIlIIIlIII);
        final int lllllllllllllIIIIllIIIlIlIIIIlll = this.getBytes(this.readerIndex, lllllllllllllIIIIllIIIlIlIIIIlIl, lllllllllllllIIIIllIIIlIlIIIlIII, (boolean)(UnpooledDirectByteBuf.lIlIllIlllIllI[1] != 0));
        this.readerIndex += lllllllllllllIIIIllIIIlIlIIIIlll;
        return lllllllllllllIIIIllIIIlIlIIIIlll;
    }
    
    @Override
    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }
    
    private static String llllIIlIIllIllI(final String lllllllllllllIIIIllIIIlIIIIIIlII, final String lllllllllllllIIIIllIIIlIIIIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIIIlIIIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIIIlIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), UnpooledDirectByteBuf.lIlIllIlllIllI[8]), "DES");
            final Cipher lllllllllllllIIIIllIIIlIIIIIIllI = Cipher.getInstance("DES");
            lllllllllllllIIIIllIIIlIIIIIIllI.init(UnpooledDirectByteBuf.lIlIllIlllIllI[2], lllllllllllllIIIIllIIIlIIIIIIlll);
            return new String(lllllllllllllIIIIllIIIlIIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIIIlIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIIIlIIIIIIlIl) {
            lllllllllllllIIIIllIIIlIIIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int setBytes(final int lllllllllllllIIIIllIIIlIIllIIlIl, final ScatteringByteChannel lllllllllllllIIIIllIIIlIIllIIlII, final int lllllllllllllIIIIllIIIlIIlIllllI) throws IOException {
        this.ensureAccessible();
        final ByteBuffer lllllllllllllIIIIllIIIlIIllIIIlI = this.internalNioBuffer();
        lllllllllllllIIIIllIIIlIIllIIIlI.clear().position(lllllllllllllIIIIllIIIlIIllIIlIl).limit(lllllllllllllIIIIllIIIlIIllIIlIl + lllllllllllllIIIIllIIIlIIlIllllI);
        "".length();
        try {
            return lllllllllllllIIIIllIIIlIIllIIlII.read(this.tmpNioBuf);
        }
        catch (ClosedChannelException lllllllllllllIIIIllIIIlIIllIIlll) {
            return UnpooledDirectByteBuf.lIlIllIlllIllI[16];
        }
    }
    
    @Override
    protected void _setLong(final int lllllllllllllIIIIllIIIllIIIlIllI, final long lllllllllllllIIIIllIIIllIIIlIlIl) {
        this.buffer.putLong(lllllllllllllIIIIllIIIllIIIlIllI, lllllllllllllIIIIllIIIllIIIlIlIl);
        "".length();
    }
    
    @Override
    protected void _setInt(final int lllllllllllllIIIIllIIIllIIlIlIII, final int lllllllllllllIIIIllIIIllIIlIIlll) {
        this.buffer.putInt(lllllllllllllIIIIllIIIllIIlIlIII, lllllllllllllIIIIllIIIllIIlIIlll);
        "".length();
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIIIIllIIIlIllIlIIll, final OutputStream lllllllllllllIIIIllIIIlIllIIlllI, final int lllllllllllllIIIIllIIIlIllIlIIIl) throws IOException {
        this.getBytes(lllllllllllllIIIIllIIIlIllIlIIll, lllllllllllllIIIIllIIIlIllIIlllI, lllllllllllllIIIIllIIIlIllIlIIIl, (boolean)(UnpooledDirectByteBuf.lIlIllIlllIllI[0] != 0));
        return this;
    }
    
    @Override
    public ByteBuf setBytes(int lllllllllllllIIIIllIIIlIllllllll, final ByteBuf lllllllllllllIIIIllIIIlIlllllllI, final int lllllllllllllIIIIllIIIllIIIIIIlI, final int lllllllllllllIIIIllIIIllIIIIIIIl) {
        this.checkSrcIndex((int)lllllllllllllIIIIllIIIlIllllllll, lllllllllllllIIIIllIIIllIIIIIIIl, lllllllllllllIIIIllIIIllIIIIIIlI, lllllllllllllIIIIllIIIlIlllllllI.capacity());
        if (llllIIlIlIIllIl(lllllllllllllIIIIllIIIlIlllllllI.nioBufferCount())) {
            final ByteBuffer[] lllllllllllllIIIIllIIIllIIIIlIII = lllllllllllllIIIIllIIIlIlllllllI.nioBuffers(lllllllllllllIIIIllIIIllIIIIIIlI, lllllllllllllIIIIllIIIllIIIIIIIl);
            final int lllllllllllllIIIIllIIIllIIIIIlll = lllllllllllllIIIIllIIIllIIIIlIII.length;
            int lllllllllllllIIIIllIIIllIIIIIllI = UnpooledDirectByteBuf.lIlIllIlllIllI[0];
            while (llllIIlIlIIllII(lllllllllllllIIIIllIIIllIIIIIllI, lllllllllllllIIIIllIIIllIIIIIlll)) {
                final ByteBuffer lllllllllllllIIIIllIIIllIIIIlIIl = lllllllllllllIIIIllIIIllIIIIlIII[lllllllllllllIIIIllIIIllIIIIIllI];
                final int lllllllllllllIIIIllIIIllIIIIlIlI = lllllllllllllIIIIllIIIllIIIIlIIl.remaining();
                this.setBytes((int)lllllllllllllIIIIllIIIlIllllllll, lllllllllllllIIIIllIIIllIIIIlIIl);
                "".length();
                lllllllllllllIIIIllIIIlIllllllll += lllllllllllllIIIIllIIIllIIIIlIlI;
                ++lllllllllllllIIIIllIIIllIIIIIllI;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            "".length();
            if ("  ".length() == "   ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIIIIllIIIlIlllllllI.getBytes(lllllllllllllIIIIllIIIllIIIIIIlI, this, (int)lllllllllllllIIIIllIIIlIllllllll, lllllllllllllIIIIllIIIllIIIIIIIl);
            "".length();
        }
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer lllllllllllllIIIIllIIIllIlllIIII) {
        final int lllllllllllllIIIIllIIIllIlllIIlI = lllllllllllllIIIIllIIIllIlllIIII.remaining();
        this.checkReadableBytes(lllllllllllllIIIIllIIIllIlllIIlI);
        this.getBytes(this.readerIndex, lllllllllllllIIIIllIIIllIlllIIII, (boolean)(UnpooledDirectByteBuf.lIlIllIlllIllI[1] != 0));
        this.readerIndex += lllllllllllllIIIIllIIIllIlllIIlI;
        return this;
    }
    
    @Override
    public ByteBuf setMedium(final int lllllllllllllIIIIllIIIllIlIIIIll, final int lllllllllllllIIIIllIIIllIlIIIlIl) {
        this.ensureAccessible();
        this._setMedium(lllllllllllllIIIIllIIIllIlIIIIll, lllllllllllllIIIIllIIIllIlIIIlIl);
        return this;
    }
}
