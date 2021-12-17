// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.channels.ClosedChannelException;
import java.nio.channels.ScatteringByteChannel;
import java.nio.ByteOrder;
import java.io.OutputStream;
import io.netty.util.internal.PlatformDependent;
import java.nio.channels.GatheringByteChannel;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;

public class UnpooledHeapByteBuf extends AbstractReferenceCountedByteBuf
{
    private /* synthetic */ ByteBuffer tmpNioBuf;
    private static final /* synthetic */ String[] lIIIIlllIlIlIl;
    private /* synthetic */ byte[] array;
    private final /* synthetic */ ByteBufAllocator alloc;
    private static final /* synthetic */ int[] lIIIIlllIlIlll;
    
    @Override
    public boolean hasMemoryAddress() {
        return UnpooledHeapByteBuf.lIIIIlllIlIlll[0] != 0;
    }
    
    @Override
    public boolean hasArray() {
        return UnpooledHeapByteBuf.lIIIIlllIlIlll[1] != 0;
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.alloc;
    }
    
    @Override
    public long getLong(final int lllllllllllllIlIIIlllllIlIIIlllI) {
        this.ensureAccessible();
        return this._getLong(lllllllllllllIlIIIlllllIlIIIlllI);
    }
    
    private static String lIllllIIlIlllll(final String lllllllllllllIlIIIlllllIIIIIIIIl, final String lllllllllllllIlIIIlllllIIIIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlllllIIIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlllllIIIIIIIlI.getBytes(StandardCharsets.UTF_8)), UnpooledHeapByteBuf.lIIIIlllIlIlll[5]), "DES");
            final Cipher lllllllllllllIlIIIlllllIIIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIlllllIIIIIIlIl.init(UnpooledHeapByteBuf.lIIIIlllIlIlll[2], lllllllllllllIlIIIlllllIIIIIIllI);
            return new String(lllllllllllllIlIIIlllllIIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlllllIIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlllllIIIIIIlII) {
            lllllllllllllIlIIIlllllIIIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllllIIllIIllI(final Object lllllllllllllIlIIIllllIlllIlllII) {
        return lllllllllllllIlIIIllllIlllIlllII == null;
    }
    
    @Override
    public ByteBuf setLong(final int lllllllllllllIlIIIlllllIIIlllIII, final long lllllllllllllIlIIIlllllIIIlllIlI) {
        this.ensureAccessible();
        this._setLong(lllllllllllllIlIIIlllllIIIlllIII, lllllllllllllIlIIIlllllIIIlllIlI);
        return this;
    }
    
    protected UnpooledHeapByteBuf(final ByteBufAllocator lllllllllllllIlIIIllllllllIIlIII, final int lllllllllllllIlIIIllllllllIIIlll, final int lllllllllllllIlIIIllllllllIIIllI) {
        this(lllllllllllllIlIIIllllllllIIlIII, new byte[lllllllllllllIlIIIllllllllIIIlll], UnpooledHeapByteBuf.lIIIIlllIlIlll[0], UnpooledHeapByteBuf.lIIIIlllIlIlll[0], lllllllllllllIlIIIllllllllIIIllI);
    }
    
    @Override
    public int setBytes(final int lllllllllllllIlIIIlllllIllllIIIl, final InputStream lllllllllllllIlIIIlllllIllllIIII, final int lllllllllllllIlIIIlllllIlllIllll) throws IOException {
        this.ensureAccessible();
        return lllllllllllllIlIIIlllllIllllIIII.read(this.array, lllllllllllllIlIIIlllllIllllIIIl, lllllllllllllIlIIIlllllIlllIllll);
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int lllllllllllllIlIIIlllllIllIIlllI, final int lllllllllllllIlIIIlllllIllIlIIII) {
        final ByteBuffer[] array = new ByteBuffer[UnpooledHeapByteBuf.lIIIIlllIlIlll[1]];
        array[UnpooledHeapByteBuf.lIIIIlllIlIlll[0]] = this.nioBuffer(lllllllllllllIlIIIlllllIllIIlllI, lllllllllllllIlIIIlllllIllIlIIII);
        return array;
    }
    
    private int getBytes(final int lllllllllllllIlIIIllllllIIllIIlI, final GatheringByteChannel lllllllllllllIlIIIllllllIIllIIIl, final int lllllllllllllIlIIIllllllIIllIIII, final boolean lllllllllllllIlIIIllllllIIlIllll) throws IOException {
        this.ensureAccessible();
        ByteBuffer lllllllllllllIlIIIllllllIIllIlII = null;
        if (lIllllIIllIlIll(lllllllllllllIlIIIllllllIIlIllll ? 1 : 0)) {
            final ByteBuffer lllllllllllllIlIIIllllllIIlllIlI = this.internalNioBuffer();
            "".length();
            if (null != null) {
                return (0xD4 ^ 0x8D) & ~(0x9C ^ 0xC5);
            }
        }
        else {
            lllllllllllllIlIIIllllllIIllIlII = ByteBuffer.wrap(this.array);
        }
        return lllllllllllllIlIIIllllllIIllIIIl.write((ByteBuffer)lllllllllllllIlIIIllllllIIllIlII.clear().position(lllllllllllllIlIIIllllllIIllIIlI).limit(lllllllllllllIlIIIllllllIIllIIlI + lllllllllllllIlIIIllllllIIllIIII));
    }
    
    private static boolean lIllllIIllIIlll(final int lllllllllllllIlIIIllllIlllIlllll, final int lllllllllllllIlIIIllllIlllIllllI) {
        return lllllllllllllIlIIIllllIlllIlllll > lllllllllllllIlIIIllllIlllIllllI;
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIIIllllllIllllIIl, final ByteBuf lllllllllllllIlIIIllllllIllllIII, final int lllllllllllllIlIIIllllllIlllIIlI, final int lllllllllllllIlIIIllllllIlllIllI) {
        this.checkDstIndex(lllllllllllllIlIIIllllllIllllIIl, lllllllllllllIlIIIllllllIlllIllI, lllllllllllllIlIIIllllllIlllIIlI, lllllllllllllIlIIIllllllIllllIII.capacity());
        if (lIllllIIllIlIll(lllllllllllllIlIIIllllllIllllIII.hasMemoryAddress() ? 1 : 0)) {
            PlatformDependent.copyMemory(this.array, lllllllllllllIlIIIllllllIllllIIl, lllllllllllllIlIIIllllllIllllIII.memoryAddress() + lllllllllllllIlIIIllllllIlllIIlI, lllllllllllllIlIIIllllllIlllIllI);
            "".length();
            if (-(172 + 19 - 52 + 56 ^ 8 + 81 - 22 + 132) >= 0) {
                return null;
            }
        }
        else if (lIllllIIllIlIll(lllllllllllllIlIIIllllllIllllIII.hasArray() ? 1 : 0)) {
            this.getBytes(lllllllllllllIlIIIllllllIllllIIl, lllllllllllllIlIIIllllllIllllIII.array(), lllllllllllllIlIIIllllllIllllIII.arrayOffset() + lllllllllllllIlIIIllllllIlllIIlI, lllllllllllllIlIIIllllllIlllIllI);
            "".length();
            "".length();
            if ("  ".length() <= -" ".length()) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIIllllllIllllIII.setBytes(lllllllllllllIlIIIllllllIlllIIlI, this.array, lllllllllllllIlIIIllllllIllllIIl, lllllllllllllIlIIIllllllIlllIllI);
            "".length();
        }
        return this;
    }
    
    @Override
    public ByteBuf setMedium(final int lllllllllllllIlIIIlllllIIlIlllII, final int lllllllllllllIlIIIlllllIIlIllIll) {
        this.ensureAccessible();
        this._setMedium(lllllllllllllIlIIIlllllIIlIlllII, lllllllllllllIlIIIlllllIIlIllIll);
        return this;
    }
    
    private ByteBuffer internalNioBuffer() {
        ByteBuffer lllllllllllllIlIIIlllllIIIIllllI = this.tmpNioBuf;
        if (lIllllIIllIIllI(lllllllllllllIlIIIlllllIIIIllllI)) {
            lllllllllllllIlIIIlllllIIIIllllI = (this.tmpNioBuf = ByteBuffer.wrap(this.array));
        }
        return lllllllllllllIlIIIlllllIIIIllllI;
    }
    
    private UnpooledHeapByteBuf(final ByteBufAllocator lllllllllllllIlIIIlllllllIlIllII, final byte[] lllllllllllllIlIIIlllllllIlIlIll, final int lllllllllllllIlIIIlllllllIlIlIlI, final int lllllllllllllIlIIIlllllllIlIllll, final int lllllllllllllIlIIIlllllllIlIlIII) {
        super(lllllllllllllIlIIIlllllllIlIlIII);
        if (lIllllIIllIIllI(lllllllllllllIlIIIlllllllIlIllII)) {
            throw new NullPointerException(UnpooledHeapByteBuf.lIIIIlllIlIlIl[UnpooledHeapByteBuf.lIIIIlllIlIlll[0]]);
        }
        if (lIllllIIllIIllI(lllllllllllllIlIIIlllllllIlIlIll)) {
            throw new NullPointerException(UnpooledHeapByteBuf.lIIIIlllIlIlIl[UnpooledHeapByteBuf.lIIIIlllIlIlll[1]]);
        }
        if (lIllllIIllIIlll(lllllllllllllIlIIIlllllllIlIlIll.length, lllllllllllllIlIIIlllllllIlIlIII)) {
            final String format = UnpooledHeapByteBuf.lIIIIlllIlIlIl[UnpooledHeapByteBuf.lIIIIlllIlIlll[2]];
            final Object[] args = new Object[UnpooledHeapByteBuf.lIIIIlllIlIlll[2]];
            args[UnpooledHeapByteBuf.lIIIIlllIlIlll[0]] = lllllllllllllIlIIIlllllllIlIlIll.length;
            args[UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] = lllllllllllllIlIIIlllllllIlIlIII;
            throw new IllegalArgumentException(String.format(format, args));
        }
        this.alloc = lllllllllllllIlIIIlllllllIlIllII;
        this.setArray(lllllllllllllIlIIIlllllllIlIlIll);
        this.setIndex(lllllllllllllIlIIIlllllllIlIlIlI, lllllllllllllIlIIIlllllllIlIllll);
        "".length();
    }
    
    @Override
    public int capacity() {
        this.ensureAccessible();
        return this.array.length;
    }
    
    private void setArray(final byte[] lllllllllllllIlIIIlllllllIlIIIlI) {
        this.array = lllllllllllllIlIIIlllllllIlIIIlI;
        this.tmpNioBuf = null;
    }
    
    @Override
    public ByteBuffer nioBuffer(final int lllllllllllllIlIIIlllllIllIlIlll, final int lllllllllllllIlIIIlllllIllIllIIl) {
        this.ensureAccessible();
        return ByteBuffer.wrap(this.array, lllllllllllllIlIIIlllllIllIlIlll, lllllllllllllIlIIIlllllIllIllIIl).slice();
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIIIllllllIlIIllll, final OutputStream lllllllllllllIlIIIllllllIlIlIIlI, final int lllllllllllllIlIIIllllllIlIIllIl) throws IOException {
        this.ensureAccessible();
        lllllllllllllIlIIIllllllIlIlIIlI.write(this.array, lllllllllllllIlIIIllllllIlIIllll, lllllllllllllIlIIIllllllIlIIllIl);
        return this;
    }
    
    @Override
    protected int _getInt(final int lllllllllllllIlIIIlllllIlIIlIlII) {
        return (this.array[lllllllllllllIlIIIlllllIlIIlIlII] & UnpooledHeapByteBuf.lIIIIlllIlIlll[6]) << UnpooledHeapByteBuf.lIIIIlllIlIlll[8] | (this.array[lllllllllllllIlIIIlllllIlIIlIlII + UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] & UnpooledHeapByteBuf.lIIIIlllIlIlll[6]) << UnpooledHeapByteBuf.lIIIIlllIlIlll[7] | (this.array[lllllllllllllIlIIIlllllIlIIlIlII + UnpooledHeapByteBuf.lIIIIlllIlIlll[2]] & UnpooledHeapByteBuf.lIIIIlllIlIlll[6]) << UnpooledHeapByteBuf.lIIIIlllIlIlll[5] | (this.array[lllllllllllllIlIIIlllllIlIIlIlII + UnpooledHeapByteBuf.lIIIIlllIlIlll[3]] & UnpooledHeapByteBuf.lIIIIlllIlIlll[6]);
    }
    
    private static String lIllllIIlIllllI(final String lllllllllllllIlIIIlllllIIIIIlllI, final String lllllllllllllIlIIIlllllIIIIIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlllllIIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlllllIIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlllllIIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlllllIIIIlIIlI.init(UnpooledHeapByteBuf.lIIIIlllIlIlll[2], lllllllllllllIlIIIlllllIIIIlIIll);
            return new String(lllllllllllllIlIIIlllllIIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlllllIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlllllIIIIlIIIl) {
            lllllllllllllIlIIIlllllIIIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected long _getLong(final int lllllllllllllIlIIIlllllIlIIIlIlI) {
        return ((long)this.array[lllllllllllllIlIIIlllllIlIIIlIlI] & 0xFFL) << UnpooledHeapByteBuf.lIIIIlllIlIlll[9] | ((long)this.array[lllllllllllllIlIIIlllllIlIIIlIlI + UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] & 0xFFL) << UnpooledHeapByteBuf.lIIIIlllIlIlll[10] | ((long)this.array[lllllllllllllIlIIIlllllIlIIIlIlI + UnpooledHeapByteBuf.lIIIIlllIlIlll[2]] & 0xFFL) << UnpooledHeapByteBuf.lIIIIlllIlIlll[11] | ((long)this.array[lllllllllllllIlIIIlllllIlIIIlIlI + UnpooledHeapByteBuf.lIIIIlllIlIlll[3]] & 0xFFL) << UnpooledHeapByteBuf.lIIIIlllIlIlll[12] | ((long)this.array[lllllllllllllIlIIIlllllIlIIIlIlI + UnpooledHeapByteBuf.lIIIIlllIlIlll[13]] & 0xFFL) << UnpooledHeapByteBuf.lIIIIlllIlIlll[8] | ((long)this.array[lllllllllllllIlIIIlllllIlIIIlIlI + UnpooledHeapByteBuf.lIIIIlllIlIlll[14]] & 0xFFL) << UnpooledHeapByteBuf.lIIIIlllIlIlll[7] | ((long)this.array[lllllllllllllIlIIIlllllIlIIIlIlI + UnpooledHeapByteBuf.lIIIIlllIlIlll[15]] & 0xFFL) << UnpooledHeapByteBuf.lIIIIlllIlIlll[5] | ((long)this.array[lllllllllllllIlIIIlllllIlIIIlIlI + UnpooledHeapByteBuf.lIIIIlllIlIlll[16]] & 0xFFL);
    }
    
    @Override
    public ByteBuf copy(final int lllllllllllllIlIIIlllllIIIlIIlII, final int lllllllllllllIlIIIlllllIIIlIIlll) {
        this.checkIndex(lllllllllllllIlIIIlllllIIIlIIlII, lllllllllllllIlIIIlllllIIIlIIlll);
        final byte[] lllllllllllllIlIIIlllllIIIlIIllI = new byte[lllllllllllllIlIIIlllllIIIlIIlll];
        System.arraycopy(this.array, lllllllllllllIlIIIlllllIIIlIIlII, lllllllllllllIlIIIlllllIIIlIIllI, UnpooledHeapByteBuf.lIIIIlllIlIlll[0], lllllllllllllIlIIIlllllIIIlIIlll);
        return new UnpooledHeapByteBuf(this.alloc(), lllllllllllllIlIIIlllllIIIlIIllI, this.maxCapacity());
    }
    
    @Override
    public ByteBuf capacity(final int lllllllllllllIlIIIlllllllIIIlllI) {
        this.ensureAccessible();
        if (!lIllllIIllIlIII(lllllllllllllIlIIIlllllllIIIlllI) || lIllllIIllIIlll(lllllllllllllIlIIIlllllllIIIlllI, this.maxCapacity())) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(UnpooledHeapByteBuf.lIIIIlllIlIlIl[UnpooledHeapByteBuf.lIIIIlllIlIlll[3]]).append(lllllllllllllIlIIIlllllllIIIlllI)));
        }
        final int lllllllllllllIlIIIlllllllIIIllIl = this.array.length;
        if (lIllllIIllIIlll(lllllllllllllIlIIIlllllllIIIlllI, lllllllllllllIlIIIlllllllIIIllIl)) {
            final byte[] lllllllllllllIlIIIlllllllIIlIIll = new byte[lllllllllllllIlIIIlllllllIIIlllI];
            System.arraycopy(this.array, UnpooledHeapByteBuf.lIIIIlllIlIlll[0], lllllllllllllIlIIIlllllllIIlIIll, UnpooledHeapByteBuf.lIIIIlllIlIlll[0], this.array.length);
            this.setArray(lllllllllllllIlIIIlllllllIIlIIll);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIllllIIllIlIlI(lllllllllllllIlIIIlllllllIIIlllI, lllllllllllllIlIIIlllllllIIIllIl)) {
            final byte[] lllllllllllllIlIIIlllllllIIlIIIl = new byte[lllllllllllllIlIIIlllllllIIIlllI];
            final int lllllllllllllIlIIIlllllllIIlIIII = this.readerIndex();
            if (lIllllIIllIlIlI(lllllllllllllIlIIIlllllllIIlIIII, lllllllllllllIlIIIlllllllIIIlllI)) {
                int lllllllllllllIlIIIlllllllIIlIIlI = this.writerIndex();
                if (lIllllIIllIIlll(lllllllllllllIlIIIlllllllIIlIIlI, lllllllllllllIlIIIlllllllIIIlllI)) {
                    lllllllllllllIlIIIlllllllIIlIIlI = lllllllllllllIlIIIlllllllIIIlllI;
                    this.writerIndex(lllllllllllllIlIIIlllllllIIIlllI);
                    "".length();
                }
                System.arraycopy(this.array, lllllllllllllIlIIIlllllllIIlIIII, lllllllllllllIlIIIlllllllIIlIIIl, lllllllllllllIlIIIlllllllIIlIIII, lllllllllllllIlIIIlllllllIIlIIlI - lllllllllllllIlIIIlllllllIIlIIII);
                "".length();
                if ("  ".length() <= ((0x37 ^ 0x7E) & ~(0x5A ^ 0x13))) {
                    return null;
                }
            }
            else {
                this.setIndex(lllllllllllllIlIIIlllllllIIIlllI, lllllllllllllIlIIIlllllllIIIlllI);
                "".length();
            }
            this.setArray(lllllllllllllIlIIIlllllllIIlIIIl);
        }
        return this;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIIIllllllIIIlIllI, final ByteBuf lllllllllllllIlIIIllllllIIIllIlI, final int lllllllllllllIlIIIllllllIIIllIIl, final int lllllllllllllIlIIIllllllIIIllIII) {
        this.checkSrcIndex(lllllllllllllIlIIIllllllIIIlIllI, lllllllllllllIlIIIllllllIIIllIII, lllllllllllllIlIIIllllllIIIllIIl, lllllllllllllIlIIIllllllIIIllIlI.capacity());
        if (lIllllIIllIlIll(lllllllllllllIlIIIllllllIIIllIlI.hasMemoryAddress() ? 1 : 0)) {
            PlatformDependent.copyMemory(lllllllllllllIlIIIllllllIIIllIlI.memoryAddress() + lllllllllllllIlIIIllllllIIIllIIl, this.array, lllllllllllllIlIIIllllllIIIlIllI, lllllllllllllIlIIIllllllIIIllIII);
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else if (lIllllIIllIlIll(lllllllllllllIlIIIllllllIIIllIlI.hasArray() ? 1 : 0)) {
            this.setBytes(lllllllllllllIlIIIllllllIIIlIllI, lllllllllllllIlIIIllllllIIIllIlI.array(), lllllllllllllIlIIIllllllIIIllIlI.arrayOffset() + lllllllllllllIlIIIllllllIIIllIIl, lllllllllllllIlIIIllllllIIIllIII);
            "".length();
            "".length();
            if ((0x74 ^ 0x70) < 0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIIIllllllIIIllIlI.getBytes(lllllllllllllIlIIIllllllIIIllIIl, this.array, lllllllllllllIlIIIllllllIIIlIllI, lllllllllllllIlIIIllllllIIIllIII);
            "".length();
        }
        return this;
    }
    
    @Override
    protected byte _getByte(final int lllllllllllllIlIIIlllllIlIlllIII) {
        return this.array[lllllllllllllIlIIIlllllIlIlllIII];
    }
    
    private static boolean lIllllIIllIlIlI(final int lllllllllllllIlIIIllllIllllIIIll, final int lllllllllllllIlIIIllllIllllIIIlI) {
        return lllllllllllllIlIIIllllIllllIIIll < lllllllllllllIlIIIllllIllllIIIlI;
    }
    
    @Override
    public int arrayOffset() {
        return UnpooledHeapByteBuf.lIIIIlllIlIlll[0];
    }
    
    @Override
    public boolean isDirect() {
        return UnpooledHeapByteBuf.lIIIIlllIlIlll[0] != 0;
    }
    
    @Override
    protected void _setByte(final int lllllllllllllIlIIIlllllIIllllIlI, final int lllllllllllllIlIIIlllllIIlllIllI) {
        this.array[lllllllllllllIlIIIlllllIIllllIlI] = (byte)lllllllllllllIlIIIlllllIIlllIllI;
    }
    
    private static boolean lIllllIIllIlIll(final int lllllllllllllIlIIIllllIlllIllIlI) {
        return lllllllllllllIlIIIllllIlllIllIlI != 0;
    }
    
    @Override
    public ByteBuf unwrap() {
        return null;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIIIllllllIIIIllII, final byte[] lllllllllllllIlIIIllllllIIIIIllI, final int lllllllllllllIlIIIllllllIIIIIlIl, final int lllllllllllllIlIIIllllllIIIIlIIl) {
        this.checkSrcIndex(lllllllllllllIlIIIllllllIIIIllII, lllllllllllllIlIIIllllllIIIIlIIl, lllllllllllllIlIIIllllllIIIIIlIl, lllllllllllllIlIIIllllllIIIIIllI.length);
        System.arraycopy(lllllllllllllIlIIIllllllIIIIIllI, lllllllllllllIlIIIllllllIIIIIlIl, this.array, lllllllllllllIlIIIllllllIIIIllII, lllllllllllllIlIIIllllllIIIIlIIl);
        return this;
    }
    
    @Override
    protected void _setInt(final int lllllllllllllIlIIIlllllIIlIIIlII, final int lllllllllllllIlIIIlllllIIlIIIIII) {
        this.array[lllllllllllllIlIIIlllllIIlIIIlII] = (byte)(lllllllllllllIlIIIlllllIIlIIIIII >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[8]);
        this.array[lllllllllllllIlIIIlllllIIlIIIlII + UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] = (byte)(lllllllllllllIlIIIlllllIIlIIIIII >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[7]);
        this.array[lllllllllllllIlIIIlllllIIlIIIlII + UnpooledHeapByteBuf.lIIIIlllIlIlll[2]] = (byte)(lllllllllllllIlIIIlllllIIlIIIIII >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[5]);
        this.array[lllllllllllllIlIIIlllllIIlIIIlII + UnpooledHeapByteBuf.lIIIIlllIlIlll[3]] = (byte)lllllllllllllIlIIIlllllIIlIIIIII;
    }
    
    @Override
    protected void _setMedium(final int lllllllllllllIlIIIlllllIIlIlIllI, final int lllllllllllllIlIIIlllllIIlIlIlIl) {
        this.array[lllllllllllllIlIIIlllllIIlIlIllI] = (byte)(lllllllllllllIlIIIlllllIIlIlIlIl >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[7]);
        this.array[lllllllllllllIlIIIlllllIIlIlIllI + UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] = (byte)(lllllllllllllIlIIIlllllIIlIlIlIl >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[5]);
        this.array[lllllllllllllIlIIIlllllIIlIlIllI + UnpooledHeapByteBuf.lIIIIlllIlIlll[2]] = (byte)lllllllllllllIlIIIlllllIIlIlIlIl;
    }
    
    @Override
    public ByteBuf setBytes(final int lllllllllllllIlIIIlllllIllllllII, final ByteBuffer lllllllllllllIlIIIlllllIlllllIll) {
        this.ensureAccessible();
        lllllllllllllIlIIIlllllIlllllIll.get(this.array, lllllllllllllIlIIIlllllIllllllII, lllllllllllllIlIIIlllllIlllllIll.remaining());
        "".length();
        return this;
    }
    
    @Override
    protected short _getShort(final int lllllllllllllIlIIIlllllIlIlIllII) {
        return (short)(this.array[lllllllllllllIlIIIlllllIlIlIllII] << UnpooledHeapByteBuf.lIIIIlllIlIlll[5] | (this.array[lllllllllllllIlIIIlllllIlIlIllII + UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] & UnpooledHeapByteBuf.lIIIIlllIlIlll[6]));
    }
    
    @Override
    protected void _setShort(final int lllllllllllllIlIIIlllllIIllIIlIl, final int lllllllllllllIlIIIlllllIIllIIlll) {
        this.array[lllllllllllllIlIIIlllllIIllIIlIl] = (byte)(lllllllllllllIlIIIlllllIIllIIlll >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[5]);
        this.array[lllllllllllllIlIIIlllllIIllIIlIl + UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] = (byte)lllllllllllllIlIIIlllllIIllIIlll;
    }
    
    @Override
    protected int _getUnsignedMedium(final int lllllllllllllIlIIIlllllIlIlIIIlI) {
        return (this.array[lllllllllllllIlIIIlllllIlIlIIIlI] & UnpooledHeapByteBuf.lIIIIlllIlIlll[6]) << UnpooledHeapByteBuf.lIIIIlllIlIlll[7] | (this.array[lllllllllllllIlIIIlllllIlIlIIIlI + UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] & UnpooledHeapByteBuf.lIIIIlllIlIlll[6]) << UnpooledHeapByteBuf.lIIIIlllIlIlll[5] | (this.array[lllllllllllllIlIIIlllllIlIlIIIlI + UnpooledHeapByteBuf.lIIIIlllIlIlll[2]] & UnpooledHeapByteBuf.lIIIIlllIlIlll[6]);
    }
    
    @Override
    public ByteOrder order() {
        return ByteOrder.BIG_ENDIAN;
    }
    
    @Override
    public int getUnsignedMedium(final int lllllllllllllIlIIIlllllIlIlIIllI) {
        this.ensureAccessible();
        return this._getUnsignedMedium(lllllllllllllIlIIIlllllIlIlIIllI);
    }
    
    @Override
    public ByteBuf setByte(final int lllllllllllllIlIIIlllllIlIIIIIll, final int lllllllllllllIlIIIlllllIIlllllll) {
        this.ensureAccessible();
        this._setByte(lllllllllllllIlIIIlllllIlIIIIIll, lllllllllllllIlIIIlllllIIlllllll);
        return this;
    }
    
    static {
        lIllllIIllIIlIl();
        lIllllIIllIIIIl();
    }
    
    private static boolean lIllllIIllIlIII(final int lllllllllllllIlIIIllllIlllIllIII) {
        return lllllllllllllIlIIIllllIlllIllIII >= 0;
    }
    
    @Override
    public int readBytes(final GatheringByteChannel lllllllllllllIlIIIllllllIIlIIlII, final int lllllllllllllIlIIIllllllIIlIIIll) throws IOException {
        this.checkReadableBytes(lllllllllllllIlIIIllllllIIlIIIll);
        final int lllllllllllllIlIIIllllllIIlIIllI = this.getBytes(this.readerIndex, lllllllllllllIlIIIllllllIIlIIlII, lllllllllllllIlIIIllllllIIlIIIll, (boolean)(UnpooledHeapByteBuf.lIIIIlllIlIlll[1] != 0));
        this.readerIndex += lllllllllllllIlIIIllllllIIlIIllI;
        return lllllllllllllIlIIIllllllIIlIIllI;
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int lllllllllllllIlIIIlllllIllIIIlIl, final int lllllllllllllIlIIIlllllIllIIIlll) {
        this.checkIndex(lllllllllllllIlIIIlllllIllIIIlIl, lllllllllllllIlIIIlllllIllIIIlll);
        return (ByteBuffer)this.internalNioBuffer().clear().position(lllllllllllllIlIIIlllllIllIIIlIl).limit(lllllllllllllIlIIIlllllIllIIIlIl + lllllllllllllIlIIIlllllIllIIIlll);
    }
    
    @Override
    public int setBytes(final int lllllllllllllIlIIIlllllIlllIIlll, final ScatteringByteChannel lllllllllllllIlIIIlllllIlllIIllI, final int lllllllllllllIlIIIlllllIlllIIlIl) throws IOException {
        this.ensureAccessible();
        try {
            return lllllllllllllIlIIIlllllIlllIIllI.read((ByteBuffer)this.internalNioBuffer().clear().position(lllllllllllllIlIIIlllllIlllIIlll).limit(lllllllllllllIlIIIlllllIlllIIlll + lllllllllllllIlIIIlllllIlllIIlIl));
        }
        catch (ClosedChannelException lllllllllllllIlIIIlllllIlllIlIIl) {
            return UnpooledHeapByteBuf.lIIIIlllIlIlll[4];
        }
    }
    
    protected UnpooledHeapByteBuf(final ByteBufAllocator lllllllllllllIlIIIllllllllIIIIII, final byte[] lllllllllllllIlIIIlllllllIllllll, final int lllllllllllllIlIIIlllllllIlllllI) {
        this(lllllllllllllIlIIIllllllllIIIIII, lllllllllllllIlIIIlllllllIllllll, UnpooledHeapByteBuf.lIIIIlllIlIlll[0], lllllllllllllIlIIIlllllllIllllll.length, lllllllllllllIlIIIlllllllIlllllI);
    }
    
    @Override
    public short getShort(final int lllllllllllllIlIIIlllllIlIllIlII) {
        this.ensureAccessible();
        return this._getShort(lllllllllllllIlIIIlllllIlIllIlII);
    }
    
    @Override
    public byte getByte(final int lllllllllllllIlIIIlllllIllIIIIII) {
        this.ensureAccessible();
        return this._getByte(lllllllllllllIlIIIlllllIllIIIIII);
    }
    
    @Override
    public long memoryAddress() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public byte[] array() {
        this.ensureAccessible();
        return this.array;
    }
    
    private static String lIllllIIllIIIII(String lllllllllllllIlIIIllllIllllIlllI, final String lllllllllllllIlIIIllllIlllllIIlI) {
        lllllllllllllIlIIIllllIllllIlllI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIllllIllllIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIllllIlllllIIIl = new StringBuilder();
        final char[] lllllllllllllIlIIIllllIlllllIIII = lllllllllllllIlIIIllllIlllllIIlI.toCharArray();
        int lllllllllllllIlIIIllllIllllIllll = UnpooledHeapByteBuf.lIIIIlllIlIlll[0];
        final boolean lllllllllllllIlIIIllllIllllIlIIl = (Object)lllllllllllllIlIIIllllIllllIlllI.toCharArray();
        final Exception lllllllllllllIlIIIllllIllllIlIII = (Exception)lllllllllllllIlIIIllllIllllIlIIl.length;
        String lllllllllllllIlIIIllllIllllIIlll = (String)UnpooledHeapByteBuf.lIIIIlllIlIlll[0];
        while (lIllllIIllIlIlI((int)lllllllllllllIlIIIllllIllllIIlll, (int)lllllllllllllIlIIIllllIllllIlIII)) {
            final char lllllllllllllIlIIIllllIlllllIlII = lllllllllllllIlIIIllllIllllIlIIl[lllllllllllllIlIIIllllIllllIIlll];
            lllllllllllllIlIIIllllIlllllIIIl.append((char)(lllllllllllllIlIIIllllIlllllIlII ^ lllllllllllllIlIIIllllIlllllIIII[lllllllllllllIlIIIllllIllllIllll % lllllllllllllIlIIIllllIlllllIIII.length]));
            "".length();
            ++lllllllllllllIlIIIllllIllllIllll;
            ++lllllllllllllIlIIIllllIllllIIlll;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIllllIlllllIIIl);
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIIIllllllIlIllIlI, final ByteBuffer lllllllllllllIlIIIllllllIlIllIIl) {
        this.ensureAccessible();
        lllllllllllllIlIIIllllllIlIllIIl.put(this.array, lllllllllllllIlIIIllllllIlIllIlI, Math.min(this.capacity() - lllllllllllllIlIIIllllllIlIllIlI, lllllllllllllIlIIIllllllIlIllIIl.remaining()));
        "".length();
        return this;
    }
    
    @Override
    public int getInt(final int lllllllllllllIlIIIlllllIlIIlllII) {
        this.ensureAccessible();
        return this._getInt(lllllllllllllIlIIIlllllIlIIlllII);
    }
    
    @Override
    protected void deallocate() {
        this.array = null;
    }
    
    @Override
    public int nioBufferCount() {
        return UnpooledHeapByteBuf.lIIIIlllIlIlll[1];
    }
    
    @Override
    protected void _setLong(final int lllllllllllllIlIIIlllllIIIlIllll, final long lllllllllllllIlIIIlllllIIIllIIIl) {
        this.array[lllllllllllllIlIIIlllllIIIlIllll] = (byte)(lllllllllllllIlIIIlllllIIIllIIIl >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[9]);
        this.array[lllllllllllllIlIIIlllllIIIlIllll + UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] = (byte)(lllllllllllllIlIIIlllllIIIllIIIl >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[10]);
        this.array[lllllllllllllIlIIIlllllIIIlIllll + UnpooledHeapByteBuf.lIIIIlllIlIlll[2]] = (byte)(lllllllllllllIlIIIlllllIIIllIIIl >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[11]);
        this.array[lllllllllllllIlIIIlllllIIIlIllll + UnpooledHeapByteBuf.lIIIIlllIlIlll[3]] = (byte)(lllllllllllllIlIIIlllllIIIllIIIl >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[12]);
        this.array[lllllllllllllIlIIIlllllIIIlIllll + UnpooledHeapByteBuf.lIIIIlllIlIlll[13]] = (byte)(lllllllllllllIlIIIlllllIIIllIIIl >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[8]);
        this.array[lllllllllllllIlIIIlllllIIIlIllll + UnpooledHeapByteBuf.lIIIIlllIlIlll[14]] = (byte)(lllllllllllllIlIIIlllllIIIllIIIl >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[7]);
        this.array[lllllllllllllIlIIIlllllIIIlIllll + UnpooledHeapByteBuf.lIIIIlllIlIlll[15]] = (byte)(lllllllllllllIlIIIlllllIIIllIIIl >>> UnpooledHeapByteBuf.lIIIIlllIlIlll[5]);
        this.array[lllllllllllllIlIIIlllllIIIlIllll + UnpooledHeapByteBuf.lIIIIlllIlIlll[16]] = (byte)lllllllllllllIlIIIlllllIIIllIIIl;
    }
    
    private static void lIllllIIllIIlIl() {
        (lIIIIlllIlIlll = new int[17])[0] = ((0x1A ^ 0x8 ^ (0x6 ^ 0x57)) & (0xE0 ^ 0xB4 ^ (0x2D ^ 0x3A) ^ -" ".length()));
        UnpooledHeapByteBuf.lIIIIlllIlIlll[1] = " ".length();
        UnpooledHeapByteBuf.lIIIIlllIlIlll[2] = "  ".length();
        UnpooledHeapByteBuf.lIIIIlllIlIlll[3] = "   ".length();
        UnpooledHeapByteBuf.lIIIIlllIlIlll[4] = -" ".length();
        UnpooledHeapByteBuf.lIIIIlllIlIlll[5] = (0xBD ^ 0x8C ^ (0x8 ^ 0x31));
        UnpooledHeapByteBuf.lIIIIlllIlIlll[6] = (0xA6 ^ 0xAB) + (109 + 52 - 38 + 15) - (0x64 ^ 0x20) + (112 + 0 - 54 + 114);
        UnpooledHeapByteBuf.lIIIIlllIlIlll[7] = (0x86 ^ 0x96);
        UnpooledHeapByteBuf.lIIIIlllIlIlll[8] = (0x10 ^ 0x8);
        UnpooledHeapByteBuf.lIIIIlllIlIlll[9] = (0x30 ^ 0x36 ^ (0x2F ^ 0x11));
        UnpooledHeapByteBuf.lIIIIlllIlIlll[10] = (0xCD ^ 0x9E ^ (0xEA ^ 0x89));
        UnpooledHeapByteBuf.lIIIIlllIlIlll[11] = (0x26 ^ 0x43 ^ (0x8B ^ 0xC6));
        UnpooledHeapByteBuf.lIIIIlllIlIlll[12] = (0xAD ^ 0x8D);
        UnpooledHeapByteBuf.lIIIIlllIlIlll[13] = (0x97 ^ 0x93);
        UnpooledHeapByteBuf.lIIIIlllIlIlll[14] = (0x52 ^ 0x57);
        UnpooledHeapByteBuf.lIIIIlllIlIlll[15] = (0x9B ^ 0x9D);
        UnpooledHeapByteBuf.lIIIIlllIlIlll[16] = (0x73 ^ 0x1C ^ (0xF2 ^ 0x9A));
    }
    
    @Override
    public ByteBuf setShort(final int lllllllllllllIlIIIlllllIIlllIIIl, final int lllllllllllllIlIIIlllllIIllIllIl) {
        this.ensureAccessible();
        this._setShort(lllllllllllllIlIIIlllllIIlllIIIl, lllllllllllllIlIIIlllllIIllIllIl);
        return this;
    }
    
    @Override
    public ByteBuf setInt(final int lllllllllllllIlIIIlllllIIlIIllIl, final int lllllllllllllIlIIIlllllIIlIIlIIl) {
        this.ensureAccessible();
        this._setInt(lllllllllllllIlIIIlllllIIlIIllIl, lllllllllllllIlIIIlllllIIlIIlIIl);
        return this;
    }
    
    private static void lIllllIIllIIIIl() {
        (lIIIIlllIlIlIl = new String[UnpooledHeapByteBuf.lIIIIlllIlIlll[13]])[UnpooledHeapByteBuf.lIIIIlllIlIlll[0]] = lIllllIIlIllllI("F/qamiF/rlU=", "gqAMM");
        UnpooledHeapByteBuf.lIIIIlllIlIlIl[UnpooledHeapByteBuf.lIIIIlllIlIlll[1]] = lIllllIIlIllllI("zY4CpJ/L0fcuNolRTW/eIQ==", "choip");
        UnpooledHeapByteBuf.lIIIIlllIlIlIl[UnpooledHeapByteBuf.lIIIIlllIlIlll[2]] = lIllllIIlIlllll("antx6yt5XOpBePzBbsjyOIuGi8wy9Lyqet5s2srSicTiOaIgNptVKQ==", "LdaKt");
        UnpooledHeapByteBuf.lIIIIlllIlIlIl[UnpooledHeapByteBuf.lIIIIlllIlIlll[3]] = lIllllIIllIIIII("DRMQBhYTFwQsAxpMRw==", "cvgEw");
    }
    
    @Override
    public int getBytes(final int lllllllllllllIlIIIllllllIlIIIIll, final GatheringByteChannel lllllllllllllIlIIIllllllIlIIIllI, final int lllllllllllllIlIIIllllllIlIIIIIl) throws IOException {
        this.ensureAccessible();
        return this.getBytes(lllllllllllllIlIIIllllllIlIIIIll, lllllllllllllIlIIIllllllIlIIIllI, lllllllllllllIlIIIllllllIlIIIIIl, (boolean)(UnpooledHeapByteBuf.lIIIIlllIlIlll[0] != 0));
    }
    
    @Override
    public ByteBuf getBytes(final int lllllllllllllIlIIIllllllIllIlIlI, final byte[] lllllllllllllIlIIIllllllIllIIlII, final int lllllllllllllIlIIIllllllIllIIIll, final int lllllllllllllIlIIIllllllIllIIlll) {
        this.checkDstIndex(lllllllllllllIlIIIllllllIllIlIlI, lllllllllllllIlIIIllllllIllIIlll, lllllllllllllIlIIIllllllIllIIIll, lllllllllllllIlIIIllllllIllIIlII.length);
        System.arraycopy(this.array, lllllllllllllIlIIIllllllIllIlIlI, lllllllllllllIlIIIllllllIllIIlII, lllllllllllllIlIIIllllllIllIIIll, lllllllllllllIlIIIllllllIllIIlll);
        return this;
    }
}
