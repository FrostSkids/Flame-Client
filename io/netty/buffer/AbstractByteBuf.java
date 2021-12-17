// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.io.InputStream;
import io.netty.util.internal.StringUtil;
import io.netty.util.IllegalReferenceCountException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.ByteOrder;
import java.nio.channels.ScatteringByteChannel;
import java.nio.channels.GatheringByteChannel;
import io.netty.util.internal.PlatformDependent;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.ByteBuffer;
import io.netty.util.ResourceLeakDetector;

public abstract class AbstractByteBuf extends ByteBuf
{
    /* synthetic */ int readerIndex;
    private static final /* synthetic */ int[] lllIlIIIllllll;
    private /* synthetic */ int maxCapacity;
    private /* synthetic */ int markedReaderIndex;
    private /* synthetic */ SwappedByteBuf swappedBuf;
    private /* synthetic */ int markedWriterIndex;
    private static final /* synthetic */ String[] lllIlIIIlIlllI;
    /* synthetic */ int writerIndex;
    
    @Override
    public double getDouble(final int llllllllllllIlIlllIIIlIIIllllIII) {
        return Double.longBitsToDouble(this.getLong(llllllllllllIlIlllIIIlIIIllllIII));
    }
    
    protected final void checkDstIndex(final int llllllllllllIlIlllIIIIIllIllIIII, final int llllllllllllIlIlllIIIIIllIllIlII, final int llllllllllllIlIlllIIIIIllIllIIll, final int llllllllllllIlIlllIIIIIllIllIIlI) {
        this.checkIndex(llllllllllllIlIlllIIIIIllIllIIII, llllllllllllIlIlllIIIIIllIllIlII);
        if (!lIlIIIIlllllIIll(llllllllllllIlIlllIIIIIllIllIIll) || lIlIIIIlllllIlII(llllllllllllIlIlllIIIIIllIllIIll, llllllllllllIlIlllIIIIIllIllIIlI - llllllllllllIlIlllIIIIIllIllIlII)) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[36]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[3]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIIIllIllIIll;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = llllllllllllIlIlllIIIIIllIllIlII;
            args[AbstractByteBuf.lllIlIIIllllll[2]] = llllllllllllIlIlllIIIIIllIllIIlI;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
    }
    
    @Override
    public int getUnsignedShort(final int llllllllllllIlIlllIIIlIIlIlIlIll) {
        return this.getShort(llllllllllllIlIlllIIIlIIlIlIlIll) & AbstractByteBuf.lllIlIIIllllll[12];
    }
    
    @Override
    public int forEachByte(final int llllllllllllIlIlllIIIIlIIIllIIll, final int llllllllllllIlIlllIIIIlIIIllIllI, final ByteBufProcessor llllllllllllIlIlllIIIIlIIIllIIIl) {
        this.checkIndex(llllllllllllIlIlllIIIIlIIIllIIll, llllllllllllIlIlllIIIIlIIIllIllI);
        return this.forEachByteAsc0(llllllllllllIlIlllIIIIlIIIllIIll, llllllllllllIlIlllIIIIlIIIllIllI, llllllllllllIlIlllIIIIlIIIllIIIl);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIlIlllIIIIlIlllIIIII, final int llllllllllllIlIlllIIIIlIlllIIIlI) {
        if (lIlIIIIlllllIlII(llllllllllllIlIlllIIIIlIlllIIIlI, llllllllllllIlIlllIIIIlIlllIIIII.readableBytes())) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[18]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[3]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIIlIlllIIIlI;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = llllllllllllIlIlllIIIIlIlllIIIII.readableBytes();
            args[AbstractByteBuf.lllIlIIIllllll[2]] = llllllllllllIlIlllIIIIlIlllIIIII;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        this.writeBytes(llllllllllllIlIlllIIIIlIlllIIIII, llllllllllllIlIlllIIIIlIlllIIIII.readerIndex(), llllllllllllIlIlllIIIIlIlllIIIlI);
        "".length();
        llllllllllllIlIlllIIIIlIlllIIIII.readerIndex(llllllllllllIlIlllIIIIlIlllIIIII.readerIndex() + llllllllllllIlIlllIIIIlIlllIIIlI);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf ensureWritable(final int llllllllllllIlIlllIIIlIIllllIIll) {
        if (lIlIIIIlllllIIlI(llllllllllllIlIlllIIIlIIllllIIll)) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[5]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[1]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIlIIllllIIll;
            throw new IllegalArgumentException(String.format(format, args));
        }
        if (lIlIIIIlllllIllI(llllllllllllIlIlllIIIlIIllllIIll, this.writableBytes())) {
            return this;
        }
        if (lIlIIIIlllllIlII(llllllllllllIlIlllIIIlIIllllIIll, this.maxCapacity - this.writerIndex)) {
            final String format2 = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[6]];
            final Object[] args2 = new Object[AbstractByteBuf.lllIlIIIllllll[4]];
            args2[AbstractByteBuf.lllIlIIIllllll[0]] = this.writerIndex;
            args2[AbstractByteBuf.lllIlIIIllllll[1]] = llllllllllllIlIlllIIIlIIllllIIll;
            args2[AbstractByteBuf.lllIlIIIllllll[2]] = this.maxCapacity;
            args2[AbstractByteBuf.lllIlIIIllllll[3]] = this;
            throw new IndexOutOfBoundsException(String.format(format2, args2));
        }
        final int llllllllllllIlIlllIIIlIIllllIIlI = this.calculateNewCapacity(this.writerIndex + llllllllllllIlIlllIIIlIIllllIIll);
        this.capacity(llllllllllllIlIlllIIIlIIllllIIlI);
        "".length();
        return this;
    }
    
    @Override
    public int forEachByteDesc(final ByteBufProcessor llllllllllllIlIlllIIIIlIIIIlIIlI) {
        final int llllllllllllIlIlllIIIIlIIIIlIlIl = this.readerIndex;
        final int llllllllllllIlIlllIIIIlIIIIlIlII = this.writerIndex - llllllllllllIlIlllIIIIlIIIIlIlIl;
        this.ensureAccessible();
        return this.forEachByteDesc0(llllllllllllIlIlllIIIIlIIIIlIlIl, llllllllllllIlIlllIIIIlIIIIlIlII, llllllllllllIlIlllIIIIlIIIIlIIlI);
    }
    
    @Override
    public ByteBuf setBoolean(final int llllllllllllIlIlllIIIlIIIlIIlIlI, final boolean llllllllllllIlIlllIIIlIIIlIIIllI) {
        int llllllllllllIlIlllIIIlIIIlIIllll;
        if (lIlIIIIllllllIlI(llllllllllllIlIlllIIIlIIIlIIIllI ? 1 : 0)) {
            llllllllllllIlIlllIIIlIIIlIIllll = AbstractByteBuf.lllIlIIIllllll[1];
            "".length();
            if (-" ".length() >= (44 + 49 - 62 + 135 ^ 5 + 70 - 10 + 97)) {
                return null;
            }
        }
        else {
            llllllllllllIlIlllIIIlIIIlIIllll = AbstractByteBuf.lllIlIIIllllll[0];
        }
        this.setByte(llllllllllllIlIlllIIIlIIIlIIlIlI, llllllllllllIlIlllIIIlIIIlIIllll);
        "".length();
        return this;
    }
    
    protected AbstractByteBuf(final int llllllllllllIlIlllIIIlIlIllIIIIl) {
        if (lIlIIIIlllllIIlI(llllllllllllIlIlllIIIlIlIllIIIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[0]]).append(llllllllllllIlIlllIIIlIlIllIIIIl).append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[1]])));
        }
        this.maxCapacity = llllllllllllIlIlllIIIlIlIllIIIIl;
    }
    
    @Override
    public int ensureWritable(final int llllllllllllIlIlllIIIlIIlllIlIIl, final boolean llllllllllllIlIlllIIIlIIlllIlIII) {
        if (lIlIIIIlllllIIlI(llllllllllllIlIlllIIIlIIlllIlIIl)) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[7]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[1]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIlIIlllIlIIl;
            throw new IllegalArgumentException(String.format(format, args));
        }
        if (lIlIIIIlllllIllI(llllllllllllIlIlllIIIlIIlllIlIIl, this.writableBytes())) {
            return AbstractByteBuf.lllIlIIIllllll[0];
        }
        if (!lIlIIIIlllllIlII(llllllllllllIlIlllIIIlIIlllIlIIl, this.maxCapacity - this.writerIndex) || !lIlIIIIllllllIlI(llllllllllllIlIlllIIIlIIlllIlIII ? 1 : 0)) {
            final int llllllllllllIlIlllIIIlIIlllIIlll = this.calculateNewCapacity(this.writerIndex + llllllllllllIlIlllIIIlIIlllIlIIl);
            this.capacity(llllllllllllIlIlllIIIlIIlllIIlll);
            "".length();
            return AbstractByteBuf.lllIlIIIllllll[2];
        }
        if (lIlIIIIllllllIIl(this.capacity(), this.maxCapacity())) {
            return AbstractByteBuf.lllIlIIIllllll[1];
        }
        this.capacity(this.maxCapacity());
        "".length();
        return AbstractByteBuf.lllIlIIIllllll[3];
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIlIlllIIIIlIlllIlIII) {
        this.writeBytes(llllllllllllIlIlllIIIIlIlllIlIII, llllllllllllIlIlllIIIIlIlllIlIII.readableBytes());
        "".length();
        return this;
    }
    
    private static boolean lIlIIIIlllllIlll(final int llllllllllllIlIlllIIIIIlIlIIllII) {
        return llllllllllllIlIlllIIIIIlIlIIllII == 0;
    }
    
    @Override
    public ByteBuf readBytes(final byte[] llllllllllllIlIlllIIIIlllIIIIIIl, final int llllllllllllIlIlllIIIIllIlllllII, final int llllllllllllIlIlllIIIIllIllllIll) {
        this.checkReadableBytes(llllllllllllIlIlllIIIIllIllllIll);
        this.getBytes(this.readerIndex, llllllllllllIlIlllIIIIlllIIIIIIl, llllllllllllIlIlllIIIIllIlllllII, llllllllllllIlIlllIIIIllIllllIll);
        "".length();
        this.readerIndex += llllllllllllIlIlllIIIIllIllllIll;
        return this;
    }
    
    @Override
    public int forEachByte(final ByteBufProcessor llllllllllllIlIlllIIIIlIIlIIIIll) {
        final int llllllllllllIlIlllIIIIlIIlIIIIlI = this.readerIndex;
        final int llllllllllllIlIlllIIIIlIIlIIIIIl = this.writerIndex - llllllllllllIlIlllIIIIlIIlIIIIlI;
        this.ensureAccessible();
        return this.forEachByteAsc0(llllllllllllIlIlllIIIIlIIlIIIIlI, llllllllllllIlIlllIIIIlIIlIIIIIl, llllllllllllIlIlllIIIIlIIlIIIIll);
    }
    
    @Override
    public int maxCapacity() {
        return this.maxCapacity;
    }
    
    protected abstract void _setShort(final int p0, final int p1);
    
    @Override
    public ByteBuf duplicate() {
        return new DuplicatedByteBuf(this);
    }
    
    protected abstract short _getShort(final int p0);
    
    @Override
    public char getChar(final int llllllllllllIlIlllIIIlIIlIIIIlII) {
        return (char)this.getShort(llllllllllllIlIlllIIIlIIlIIIIlII);
    }
    
    protected abstract void _setMedium(final int p0, final int p1);
    
    protected final void checkIndex(final int llllllllllllIlIlllIIIIIlllIlIlII) {
        this.ensureAccessible();
        if (!lIlIIIIlllllIIll(llllllllllllIlIlllIIIIIlllIlIlII) || lIlIIIIlllllIlIl(llllllllllllIlIlllIIIIIlllIlIlII, this.capacity())) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[31]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[2]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIIIlllIlIlII;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = this.capacity();
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
    }
    
    @Override
    public int indexOf(final int llllllllllllIlIlllIIIIlIIllIlIIl, final int llllllllllllIlIlllIIIIlIIllIlIII, final byte llllllllllllIlIlllIIIIlIIllIIlll) {
        return ByteBufUtil.indexOf(this, llllllllllllIlIlllIIIIlIIllIlIIl, llllllllllllIlIlllIIIIlIIllIlIII, llllllllllllIlIlllIIIIlIIllIIlll);
    }
    
    private static boolean lIlIIIIlllllIlII(final int llllllllllllIlIlllIIIIIlIlIllIIl, final int llllllllllllIlIlllIIIIIlIlIllIII) {
        return llllllllllllIlIlllIIIIIlIlIllIIl > llllllllllllIlIlllIIIIIlIlIllIII;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuffer llllllllllllIlIlllIIIIllIlIlIIlI) {
        final int llllllllllllIlIlllIIIIllIlIlIlII = llllllllllllIlIlllIIIIllIlIlIIlI.remaining();
        this.checkReadableBytes(llllllllllllIlIlllIIIIllIlIlIlII);
        this.getBytes(this.readerIndex, llllllllllllIlIlllIIIIllIlIlIIlI);
        "".length();
        this.readerIndex += llllllllllllIlIlllIIIIllIlIlIlII;
        return this;
    }
    
    protected abstract void _setInt(final int p0, final int p1);
    
    private static String lIlIIIIllIlllIll(String llllllllllllIlIlllIIIIIllIIIIIIl, final String llllllllllllIlIlllIIIIIllIIIIlIl) {
        llllllllllllIlIlllIIIIIllIIIIIIl = new String(Base64.getDecoder().decode(llllllllllllIlIlllIIIIIllIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllIIIIIllIIIIlII = new StringBuilder();
        final char[] llllllllllllIlIlllIIIIIllIIIIIll = llllllllllllIlIlllIIIIIllIIIIlIl.toCharArray();
        int llllllllllllIlIlllIIIIIllIIIIIlI = AbstractByteBuf.lllIlIIIllllll[0];
        final String llllllllllllIlIlllIIIIIlIlllllII = (Object)llllllllllllIlIlllIIIIIllIIIIIIl.toCharArray();
        final double llllllllllllIlIlllIIIIIlIllllIll = llllllllllllIlIlllIIIIIlIlllllII.length;
        Exception llllllllllllIlIlllIIIIIlIllllIlI = (Exception)AbstractByteBuf.lllIlIIIllllll[0];
        while (lIlIIIIllllllIll((int)llllllllllllIlIlllIIIIIlIllllIlI, (int)llllllllllllIlIlllIIIIIlIllllIll)) {
            final char llllllllllllIlIlllIIIIIllIIIIlll = llllllllllllIlIlllIIIIIlIlllllII[llllllllllllIlIlllIIIIIlIllllIlI];
            llllllllllllIlIlllIIIIIllIIIIlII.append((char)(llllllllllllIlIlllIIIIIllIIIIlll ^ llllllllllllIlIlllIIIIIllIIIIIll[llllllllllllIlIlllIIIIIllIIIIIlI % llllllllllllIlIlllIIIIIllIIIIIll.length]));
            "".length();
            ++llllllllllllIlIlllIIIIIllIIIIIlI;
            ++llllllllllllIlIlllIIIIIlIllllIlI;
            "".length();
            if (-" ".length() >= (0x61 ^ 0x65)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllIIIIIllIIIIlII);
    }
    
    @Override
    public ByteBuf writerIndex(final int llllllllllllIlIlllIIIlIlIlIIlIII) {
        if (!lIlIIIIlllllIlIl(llllllllllllIlIlllIIIlIlIlIIlIII, this.readerIndex) || lIlIIIIlllllIlII(llllllllllllIlIlllIIIlIlIlIIlIII, this.capacity())) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[3]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[3]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIlIlIlIIlIII;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = this.readerIndex;
            args[AbstractByteBuf.lllIlIIIllllll[2]] = this.capacity();
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        this.writerIndex = llllllllllllIlIlllIIIlIlIlIIlIII;
        return this;
    }
    
    private static boolean lIlIIIIlllllllll(final Object llllllllllllIlIlllIIIIIlIlIlIIlI) {
        return llllllllllllIlIlllIIIIIlIlIlIIlI != null;
    }
    
    protected abstract byte _getByte(final int p0);
    
    @Override
    public long getUnsignedInt(final int llllllllllllIlIlllIIIlIIlIIIlllI) {
        return (long)this.getInt(llllllllllllIlIlllIIIlIIlIIIlllI) & 0xFFFFFFFFL;
    }
    
    protected final void maxCapacity(final int llllllllllllIlIlllIIIlIlIlIllIlI) {
        this.maxCapacity = llllllllllllIlIlllIIIlIlIlIllIlI;
    }
    
    private static boolean lIlIIIIlllllIllI(final int llllllllllllIlIlllIIIIIlIlIlllIl, final int llllllllllllIlIlllIIIIIlIlIlllII) {
        return llllllllllllIlIlllIIIIIlIlIlllIl <= llllllllllllIlIlllIIIIIlIlIlllII;
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuffer llllllllllllIlIlllIIIIlIllIIlIll) {
        this.ensureAccessible();
        final int llllllllllllIlIlllIIIIlIllIIllIl = llllllllllllIlIlllIIIIlIllIIlIll.remaining();
        this.ensureWritable(llllllllllllIlIlllIIIIlIllIIllIl);
        "".length();
        this.setBytes(this.writerIndex, llllllllllllIlIlllIIIIlIllIIlIll);
        "".length();
        this.writerIndex += llllllllllllIlIlllIIIIlIllIIllIl;
        return this;
    }
    
    protected final void checkIndex(final int llllllllllllIlIlllIIIIIlllIIllII, final int llllllllllllIlIlllIIIIIlllIIlllI) {
        this.ensureAccessible();
        if (lIlIIIIlllllIIlI(llllllllllllIlIlllIIIIIlllIIlllI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[32]]).append(llllllllllllIlIlllIIIIIlllIIlllI).append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[33]])));
        }
        if (!lIlIIIIlllllIIll(llllllllllllIlIlllIIIIIlllIIllII) || lIlIIIIlllllIlII(llllllllllllIlIlllIIIIIlllIIllII, this.capacity() - llllllllllllIlIlllIIIIIlllIIlllI)) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[34]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[3]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIIIlllIIllII;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = llllllllllllIlIlllIIIIIlllIIlllI;
            args[AbstractByteBuf.lllIlIIIllllll[2]] = this.capacity();
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
    }
    
    @Override
    public boolean isWritable(final int llllllllllllIlIlllIIIlIlIIlIlIlI) {
        int n;
        if (lIlIIIIlllllIlIl(this.capacity() - this.writerIndex, llllllllllllIlIlllIIIlIlIIlIlIlI)) {
            n = AbstractByteBuf.lllIlIIIllllll[1];
            "".length();
            if (((34 + 141 - 126 + 128 ^ 3 + 174 - 141 + 153) & (0x7A ^ 0x63 ^ (0x8C ^ 0x99) ^ -" ".length())) >= " ".length()) {
                return ((0x50 ^ 0x15 ^ (0x51 ^ 0x1A)) & (124 + 141 - 248 + 130 ^ 96 + 113 - 179 + 127 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = AbstractByteBuf.lllIlIIIllllll[0];
        }
        return n != 0;
    }
    
    @Override
    public boolean getBoolean(final int llllllllllllIlIlllIIIlIIlIlllIll) {
        int n;
        if (lIlIIIIllllllIlI(this.getByte(llllllllllllIlIlllIIIlIIlIlllIll))) {
            n = AbstractByteBuf.lllIlIIIllllll[1];
            "".length();
            if (null != null) {
                return ((0x61 ^ 0x1) & ~(0x58 ^ 0x38)) != 0x0;
            }
        }
        else {
            n = AbstractByteBuf.lllIlIIIllllll[0];
        }
        return n != 0;
    }
    
    @Override
    public ByteBuf setShort(final int llllllllllllIlIlllIIIlIIIIlllllI, final int llllllllllllIlIlllIIIlIIIIllllIl) {
        this.checkIndex(llllllllllllIlIlllIIIlIIIIlllllI, AbstractByteBuf.lllIlIIIllllll[2]);
        this._setShort(llllllllllllIlIlllIIIlIIIIlllllI, llllllllllllIlIlllIIIlIIIIllllIl);
        return this;
    }
    
    protected final void adjustMarkers(final int llllllllllllIlIlllIIIlIIllllllIl) {
        final int llllllllllllIlIlllIIIlIIllllllII = this.markedReaderIndex;
        if (lIlIIIIlllllIllI(llllllllllllIlIlllIIIlIIllllllII, llllllllllllIlIlllIIIlIIllllllIl)) {
            this.markedReaderIndex = AbstractByteBuf.lllIlIIIllllll[0];
            final int llllllllllllIlIlllIIIlIIllllllll = this.markedWriterIndex;
            if (lIlIIIIlllllIllI(llllllllllllIlIlllIIIlIIllllllll, llllllllllllIlIlllIIIlIIllllllIl)) {
                this.markedWriterIndex = AbstractByteBuf.lllIlIIIllllll[0];
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            else {
                this.markedWriterIndex = llllllllllllIlIlllIIIlIIllllllll - llllllllllllIlIlllIIIlIIllllllIl;
            }
            "".length();
            if (" ".length() == "   ".length()) {
                return;
            }
        }
        else {
            this.markedReaderIndex = llllllllllllIlIlllIIIlIIllllllII - llllllllllllIlIlllIIIlIIllllllIl;
            this.markedWriterIndex -= llllllllllllIlIlllIIIlIIllllllIl;
        }
    }
    
    @Override
    public ByteBuf readBytes(final byte[] llllllllllllIlIlllIIIIllIlllIlll) {
        this.readBytes(llllllllllllIlIlllIIIIllIlllIlll, AbstractByteBuf.lllIlIIIllllll[0], llllllllllllIlIlllIIIIllIlllIlll.length);
        "".length();
        return this;
    }
    
    static {
        lIlIIIIlllllIIIl();
        lIlIIIIlllIIIIll();
        leakDetector = new ResourceLeakDetector<ByteBuf>(ByteBuf.class);
    }
    
    @Override
    public ByteBuf writeLong(final long llllllllllllIlIlllIIIIllIIIlIIlI) {
        this.ensureAccessible();
        this.ensureWritable(AbstractByteBuf.lllIlIIIllllll[10]);
        "".length();
        this._setLong(this.writerIndex, llllllllllllIlIlllIIIIllIIIlIIlI);
        this.writerIndex += AbstractByteBuf.lllIlIIIllllll[10];
        return this;
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] llllllllllllIlIlllIIIIlIllllIIII) {
        this.writeBytes(llllllllllllIlIlllIIIIlIllllIIII, AbstractByteBuf.lllIlIIIllllll[0], llllllllllllIlIlllIIIIlIllllIIII.length);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf resetWriterIndex() {
        this.writerIndex = this.markedWriterIndex;
        return this;
    }
    
    @Override
    public ByteBuf setInt(final int llllllllllllIlIlllIIIlIIIIlIIllI, final int llllllllllllIlIlllIIIlIIIIlIIIlI) {
        this.checkIndex(llllllllllllIlIlllIIIlIIIIlIIllI, AbstractByteBuf.lllIlIIIllllll[4]);
        this._setInt(llllllllllllIlIlllIIIlIIIIlIIllI, llllllllllllIlIlllIIIlIIIIlIIIlI);
        return this;
    }
    
    @Override
    public String toString(final int llllllllllllIlIlllIIIIlIIllllIll, final int llllllllllllIlIlllIIIIlIIllllIlI, final Charset llllllllllllIlIlllIIIIlIIlllIlII) {
        if (lIlIIIIlllllIlll(llllllllllllIlIlllIIIIlIIllllIlI)) {
            return AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[19]];
        }
        ByteBuffer llllllllllllIlIlllIIIIlIIllllIII = null;
        if (lIlIIIIllllllIIl(this.nioBufferCount(), AbstractByteBuf.lllIlIIIllllll[1])) {
            final ByteBuffer llllllllllllIlIlllIIIIlIIlllllIl = this.nioBuffer(llllllllllllIlIlllIIIIlIIllllIll, llllllllllllIlIlllIIIIlIIllllIlI);
            "".length();
            if (-" ".length() == "  ".length()) {
                return null;
            }
        }
        else {
            llllllllllllIlIlllIIIIlIIllllIII = ByteBuffer.allocate(llllllllllllIlIlllIIIIlIIllllIlI);
            this.getBytes(llllllllllllIlIlllIIIIlIIllllIll, llllllllllllIlIlllIIIIlIIllllIII);
            "".length();
            llllllllllllIlIlllIIIIlIIllllIII.flip();
            "".length();
        }
        return ByteBufUtil.decodeString(llllllllllllIlIlllIIIIlIIllllIII, llllllllllllIlIlllIIIIlIIlllIlII);
    }
    
    @Override
    public boolean isReadable() {
        int n;
        if (lIlIIIIlllllIlII(this.writerIndex, this.readerIndex)) {
            n = AbstractByteBuf.lllIlIIIllllll[1];
            "".length();
            if (((0xE8 ^ 0xAA) & ~(0xD5 ^ 0x97)) != 0x0) {
                return ((0x56 ^ 0x1B) & ~(0x4D ^ 0x0)) != 0x0;
            }
        }
        else {
            n = AbstractByteBuf.lllIlIIIllllll[0];
        }
        return n != 0;
    }
    
    @Override
    public int readUnsignedShort() {
        return this.readShort() & AbstractByteBuf.lllIlIIIllllll[12];
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIlIlllIIIIllIllIlIlI, final int llllllllllllIlIlllIIIIllIllIIllI) {
        if (lIlIIIIlllllIlII(llllllllllllIlIlllIIIIllIllIIllI, llllllllllllIlIlllIIIIllIllIlIlI.writableBytes())) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[17]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[3]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIIllIllIIllI;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = llllllllllllIlIlllIIIIllIllIlIlI.writableBytes();
            args[AbstractByteBuf.lllIlIIIllllll[2]] = llllllllllllIlIlllIIIIllIllIlIlI;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        this.readBytes(llllllllllllIlIlllIIIIllIllIlIlI, llllllllllllIlIlllIIIIllIllIlIlI.writerIndex(), llllllllllllIlIlllIIIIllIllIIllI);
        "".length();
        llllllllllllIlIlllIIIIllIllIlIlI.writerIndex(llllllllllllIlIlllIIIIllIllIlIlI.writerIndex() + llllllllllllIlIlllIIIIllIllIIllI);
        "".length();
        return this;
    }
    
    protected abstract long _getLong(final int p0);
    
    @Override
    public ByteBuf readBytes(final OutputStream llllllllllllIlIlllIIIIllIIllllIl, final int llllllllllllIlIlllIIIIllIIllllll) throws IOException {
        this.checkReadableBytes(llllllllllllIlIlllIIIIllIIllllll);
        this.getBytes(this.readerIndex, llllllllllllIlIlllIIIIllIIllllIl, llllllllllllIlIlllIIIIllIIllllll);
        "".length();
        this.readerIndex += llllllllllllIlIlllIIIIllIIllllll;
        return this;
    }
    
    @Override
    public ByteBuf markReaderIndex() {
        this.markedReaderIndex = this.readerIndex;
        return this;
    }
    
    @Override
    public ByteBuf readSlice(final int llllllllllllIlIlllIIIIlllIIIlIll) {
        final ByteBuf llllllllllllIlIlllIIIIlllIIIlIlI = this.slice(this.readerIndex, llllllllllllIlIlllIIIIlllIIIlIll);
        this.readerIndex += llllllllllllIlIlllIIIIlllIIIlIll;
        return llllllllllllIlIlllIIIIlllIIIlIlI;
    }
    
    private int forEachByteAsc0(final int llllllllllllIlIlllIIIIlIIIlIIlll, final int llllllllllllIlIlllIIIIlIIIlIIllI, final ByteBufProcessor llllllllllllIlIlllIIIIlIIIlIIlIl) {
        if (lIlIIIIlllllllII(llllllllllllIlIlllIIIIlIIIlIIlIl)) {
            throw new NullPointerException(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[21]]);
        }
        if (lIlIIIIlllllIlll(llllllllllllIlIlllIIIIlIIIlIIllI)) {
            return AbstractByteBuf.lllIlIIIllllll[20];
        }
        final int llllllllllllIlIlllIIIIlIIIlIIlII = llllllllllllIlIlllIIIIlIIIlIIlll + llllllllllllIlIlllIIIIlIIIlIIllI;
        int llllllllllllIlIlllIIIIlIIIlIIIll = llllllllllllIlIlllIIIIlIIIlIIlll;
        try {
            while (lIlIIIIllllllIlI(llllllllllllIlIlllIIIIlIIIlIIlIl.process(this._getByte(llllllllllllIlIlllIIIIlIIIlIIIll)) ? 1 : 0)) {
                ++llllllllllllIlIlllIIIIlIIIlIIIll;
                "".length();
                if (null != null) {
                    return (0xEB ^ 0xA7 ^ (0x23 ^ 0x78)) & (33 + 151 - 156 + 153 ^ 21 + 123 - 120 + 138 ^ -" ".length());
                }
                if (!lIlIIIIlllllIlIl(llllllllllllIlIlllIIIIlIIIlIIIll, llllllllllllIlIlllIIIIlIIIlIIlII)) {
                    continue;
                }
                "".length();
                if ("   ".length() >= (4 + 32 + 19 + 95 ^ 54 + 12 + 40 + 40)) {
                    return (18 + 97 - 95 + 126 ^ 151 + 53 - 176 + 164) & (181 + 217 - 231 + 76 ^ 5 + 80 + 67 + 9 ^ -" ".length());
                }
                return AbstractByteBuf.lllIlIIIllllll[20];
            }
            return llllllllllllIlIlllIIIIlIIIlIIIll;
        }
        catch (Exception llllllllllllIlIlllIIIIlIIIlIlIIl) {
            PlatformDependent.throwException(llllllllllllIlIlllIIIIlIIIlIlIIl);
        }
        return AbstractByteBuf.lllIlIIIllllll[20];
    }
    
    @Override
    public ByteBuf writeInt(final int llllllllllllIlIlllIIIIllIIIllIlI) {
        this.ensureAccessible();
        this.ensureWritable(AbstractByteBuf.lllIlIIIllllll[4]);
        "".length();
        this._setInt(this.writerIndex, llllllllllllIlIlllIIIIllIIIllIlI);
        this.writerIndex += AbstractByteBuf.lllIlIIIllllll[4];
        return this;
    }
    
    @Override
    public int readBytes(final GatheringByteChannel llllllllllllIlIlllIIIIllIlIIIlll, final int llllllllllllIlIlllIIIIllIlIIIllI) throws IOException {
        this.checkReadableBytes(llllllllllllIlIlllIIIIllIlIIIllI);
        final int llllllllllllIlIlllIIIIllIlIIlIIl = this.getBytes(this.readerIndex, llllllllllllIlIlllIIIIllIlIIIlll, llllllllllllIlIlllIIIIllIlIIIllI);
        this.readerIndex += llllllllllllIlIlllIIIIllIlIIlIIl;
        return llllllllllllIlIlllIIIIllIlIIlIIl;
    }
    
    @Override
    public ByteBuf setIndex(final int llllllllllllIlIlllIIIlIlIlIIIIIl, final int llllllllllllIlIlllIIIlIlIlIIIIII) {
        if (!lIlIIIIlllllIIll(llllllllllllIlIlllIIIlIlIlIIIIIl) || !lIlIIIIlllllIllI(llllllllllllIlIlllIIIlIlIlIIIIIl, llllllllllllIlIlllIIIlIlIlIIIIII) || lIlIIIIlllllIlII(llllllllllllIlIlllIIIlIlIlIIIIII, this.capacity())) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[4]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[3]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIlIlIlIIIIIl;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = llllllllllllIlIlllIIIlIlIlIIIIII;
            args[AbstractByteBuf.lllIlIIIllllll[2]] = this.capacity();
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        this.readerIndex = llllllllllllIlIlllIIIlIlIlIIIIIl;
        this.writerIndex = llllllllllllIlIlllIIIlIlIlIIIIII;
        return this;
    }
    
    @Override
    public float readFloat() {
        return Float.intBitsToFloat(this.readInt());
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlIlllIIIIlllllllIIl, final ByteBuf llllllllllllIlIlllIIIIlllllllIII) {
        this.setBytes(llllllllllllIlIlllIIIIlllllllIIl, llllllllllllIlIlllIIIIlllllllIII, llllllllllllIlIlllIIIIlllllllIII.readableBytes());
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeZero(final int llllllllllllIlIlllIIIIlIlIlIIlII) {
        if (lIlIIIIlllllIlll(llllllllllllIlIlllIIIIlIlIlIIlII)) {
            return this;
        }
        this.ensureWritable(llllllllllllIlIlllIIIIlIlIlIIlII);
        "".length();
        this.checkIndex(this.writerIndex, llllllllllllIlIlllIIIIlIlIlIIlII);
        final int llllllllllllIlIlllIIIIlIlIlIIlll = llllllllllllIlIlllIIIIlIlIlIIlII >>> AbstractByteBuf.lllIlIIIllllll[3];
        final int llllllllllllIlIlllIIIIlIlIlIIllI = llllllllllllIlIlllIIIIlIlIlIIlII & AbstractByteBuf.lllIlIIIllllll[7];
        int llllllllllllIlIlllIIIIlIlIlIllII = llllllllllllIlIlllIIIIlIlIlIIlll;
        while (lIlIIIIllllllllI(llllllllllllIlIlllIIIIlIlIlIllII)) {
            this.writeLong(0L);
            "".length();
            --llllllllllllIlIlllIIIIlIlIlIllII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        if (lIlIIIIllllllIIl(llllllllllllIlIlllIIIIlIlIlIIllI, AbstractByteBuf.lllIlIIIllllll[4])) {
            this.writeInt(AbstractByteBuf.lllIlIIIllllll[0]);
            "".length();
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        else if (lIlIIIIllllllIll(llllllllllllIlIlllIIIIlIlIlIIllI, AbstractByteBuf.lllIlIIIllllll[4])) {
            int llllllllllllIlIlllIIIIlIlIlIlIll = llllllllllllIlIlllIIIIlIlIlIIllI;
            while (lIlIIIIllllllllI(llllllllllllIlIlllIIIIlIlIlIlIll)) {
                this.writeByte(AbstractByteBuf.lllIlIIIllllll[0]);
                "".length();
                --llllllllllllIlIlllIIIIlIlIlIlIll;
                "".length();
                if (" ".length() >= "   ".length()) {
                    return null;
                }
            }
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        else {
            this.writeInt(AbstractByteBuf.lllIlIIIllllll[0]);
            "".length();
            int llllllllllllIlIlllIIIIlIlIlIlIlI = llllllllllllIlIlllIIIIlIlIlIIllI - AbstractByteBuf.lllIlIIIllllll[4];
            while (lIlIIIIllllllllI(llllllllllllIlIlllIIIIlIlIlIlIlI)) {
                this.writeByte(AbstractByteBuf.lllIlIIIllllll[0]);
                "".length();
                --llllllllllllIlIlllIIIIlIlIlIlIlI;
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
        }
        return this;
    }
    
    @Override
    public int readUnsignedMedium() {
        this.checkReadableBytes(AbstractByteBuf.lllIlIIIllllll[3]);
        final int llllllllllllIlIlllIIIIlllIllIIll = this._getUnsignedMedium(this.readerIndex);
        this.readerIndex += AbstractByteBuf.lllIlIIIllllll[3];
        return llllllllllllIlIlllIIIIlllIllIIll;
    }
    
    private static boolean lIlIIIIlllllIlIl(final int llllllllllllIlIlllIIIIIlIllIIlIl, final int llllllllllllIlIlllIIIIIlIllIIlII) {
        return llllllllllllIlIlllIIIIIlIllIIlIl >= llllllllllllIlIlllIIIIIlIllIIlII;
    }
    
    private static boolean lIlIIIIlllllllII(final Object llllllllllllIlIlllIIIIIlIlIlIIII) {
        return llllllllllllIlIlllIIIIIlIlIlIIII == null;
    }
    
    private static boolean lIlIIIIlllllllIl(final Object llllllllllllIlIlllIIIIIlIlIlIlIl, final Object llllllllllllIlIlllIIIIIlIlIlIlII) {
        return llllllllllllIlIlllIIIIIlIlIlIlIl == llllllllllllIlIlllIIIIIlIlIlIlII;
    }
    
    @Override
    public byte getByte(final int llllllllllllIlIlllIIIlIIllIIIIIl) {
        this.checkIndex(llllllllllllIlIlllIIIlIIllIIIIIl);
        return this._getByte(llllllllllllIlIlllIIIlIIllIIIIIl);
    }
    
    @Override
    public int compareTo(final ByteBuf llllllllllllIlIlllIIIIIllllIIlIl) {
        return ByteBufUtil.compare(this, llllllllllllIlIlllIIIIIllllIIlIl);
    }
    
    private int forEachByteDesc0(final int llllllllllllIlIlllIIIIIllllllIll, final int llllllllllllIlIlllIIIIIllllllIlI, final ByteBufProcessor llllllllllllIlIlllIIIIIllllllIIl) {
        if (lIlIIIIlllllllII(llllllllllllIlIlllIIIIIllllllIIl)) {
            throw new NullPointerException(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[22]]);
        }
        if (lIlIIIIlllllIlll(llllllllllllIlIlllIIIIIllllllIlI)) {
            return AbstractByteBuf.lllIlIIIllllll[20];
        }
        int llllllllllllIlIlllIIIIIllllllIII = llllllllllllIlIlllIIIIIllllllIll + llllllllllllIlIlllIIIIIllllllIlI - AbstractByteBuf.lllIlIIIllllll[1];
        try {
            while (lIlIIIIllllllIlI(llllllllllllIlIlllIIIIIllllllIIl.process(this._getByte(llllllllllllIlIlllIIIIIllllllIII)) ? 1 : 0)) {
                --llllllllllllIlIlllIIIIIllllllIII;
                "".length();
                if ("  ".length() < ((0x49 ^ 0x8 ^ (0x42 ^ 0x15)) & (0xE2 ^ 0xC0 ^ (0xBF ^ 0x8B) ^ -" ".length()))) {
                    return (0xA6 ^ 0xB7 ^ (0x11 ^ 0x56)) & (125 + 131 - 193 + 152 ^ 118 + 35 - 96 + 72 ^ -" ".length());
                }
                if (!lIlIIIIllllllIll(llllllllllllIlIlllIIIIIllllllIII, llllllllllllIlIlllIIIIIllllllIll)) {
                    continue;
                }
                "".length();
                if (((0x5D ^ 0x12) & ~(0x36 ^ 0x79)) > ((0x93 ^ 0x8A) & ~(0x9F ^ 0x86))) {
                    return (0xD3 ^ 0xC1) & ~(0x47 ^ 0x55);
                }
                return AbstractByteBuf.lllIlIIIllllll[20];
            }
            return llllllllllllIlIlllIIIIIllllllIII;
        }
        catch (Exception llllllllllllIlIlllIIIIIlllllllIl) {
            PlatformDependent.throwException(llllllllllllIlIlllIIIIIlllllllIl);
        }
        return AbstractByteBuf.lllIlIIIllllll[20];
    }
    
    @Override
    public ByteBuf slice(final int llllllllllllIlIlllIIIIlIlIIlIIll, final int llllllllllllIlIlllIIIIlIlIIIllll) {
        if (lIlIIIIlllllIlll(llllllllllllIlIlllIIIIlIlIIIllll)) {
            return Unpooled.EMPTY_BUFFER;
        }
        return new SlicedByteBuf(this, llllllllllllIlIlllIIIIlIlIIlIIll, llllllllllllIlIlllIIIIlIlIIIllll);
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIlIlllIIIIllIllIIIII, final int llllllllllllIlIlllIIIIllIlIllIll, final int llllllllllllIlIlllIIIIllIlIllIlI) {
        this.checkReadableBytes(llllllllllllIlIlllIIIIllIlIllIlI);
        this.getBytes(this.readerIndex, llllllllllllIlIlllIIIIllIllIIIII, llllllllllllIlIlllIIIIllIlIllIll, llllllllllllIlIlllIIIIllIlIllIlI);
        "".length();
        this.readerIndex += llllllllllllIlIlllIIIIllIlIllIlI;
        return this;
    }
    
    @Override
    public ByteBuf setFloat(final int llllllllllllIlIlllIIIlIIIIIlllIl, final float llllllllllllIlIlllIIIlIIIIIllIIl) {
        this.setInt(llllllllllllIlIlllIIIlIIIIIlllIl, Float.floatToRawIntBits(llllllllllllIlIlllIIIlIIIIIllIIl));
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setMedium(final int llllllllllllIlIlllIIIlIIIIlIllII, final int llllllllllllIlIlllIIIlIIIIlIlllI) {
        this.checkIndex(llllllllllllIlIlllIIIlIIIIlIllII, AbstractByteBuf.lllIlIIIllllll[3]);
        this._setMedium(llllllllllllIlIlllIIIlIIIIlIllII, llllllllllllIlIlllIIIlIIIIlIlllI);
        return this;
    }
    
    @Override
    public ByteBuf writeChar(final int llllllllllllIlIlllIIIIllIIIIllII) {
        this.writeShort(llllllllllllIlIlllIIIIllIIIIllII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf resetReaderIndex() {
        this.readerIndex(this.markedReaderIndex);
        "".length();
        return this;
    }
    
    @Override
    public int hashCode() {
        return ByteBufUtil.hashCode(this);
    }
    
    @Override
    public int writeBytes(final ScatteringByteChannel llllllllllllIlIlllIIIIlIlIlllIII, final int llllllllllllIlIlllIIIIlIlIllIlll) throws IOException {
        this.ensureAccessible();
        this.ensureWritable(llllllllllllIlIlllIIIIlIlIllIlll);
        "".length();
        final int llllllllllllIlIlllIIIIlIlIllIllI = this.setBytes(this.writerIndex, llllllllllllIlIlllIIIIlIlIlllIII, llllllllllllIlIlllIIIIlIlIllIlll);
        if (lIlIIIIllllllllI(llllllllllllIlIlllIIIIlIlIllIllI)) {
            this.writerIndex += llllllllllllIlIlllIIIIlIlIllIllI;
        }
        return llllllllllllIlIlllIIIIlIlIllIllI;
    }
    
    @Override
    public short readUnsignedByte() {
        return (short)(this.readByte() & AbstractByteBuf.lllIlIIIllllll[11]);
    }
    
    protected abstract void _setByte(final int p0, final int p1);
    
    @Override
    public int readInt() {
        this.checkReadableBytes(AbstractByteBuf.lllIlIIIllllll[4]);
        final int llllllllllllIlIlllIIIIlllIlIllIl = this._getInt(this.readerIndex);
        this.readerIndex += AbstractByteBuf.lllIlIIIllllll[4];
        return llllllllllllIlIlllIIIIlllIlIllIl;
    }
    
    @Override
    public int readMedium() {
        int llllllllllllIlIlllIIIIlllIlllIIl = this.readUnsignedMedium();
        if (lIlIIIIllllllIlI(llllllllllllIlIlllIIIIlllIlllIIl & AbstractByteBuf.lllIlIIIllllll[13])) {
            llllllllllllIlIlllIIIIlllIlllIIl |= AbstractByteBuf.lllIlIIIllllll[14];
        }
        return llllllllllllIlIlllIIIIlllIlllIIl;
    }
    
    protected final void checkSrcIndex(final int llllllllllllIlIlllIIIIIllIllllll, final int llllllllllllIlIlllIIIIIlllIIIIll, final int llllllllllllIlIlllIIIIIlllIIIIlI, final int llllllllllllIlIlllIIIIIllIllllII) {
        this.checkIndex(llllllllllllIlIlllIIIIIllIllllll, llllllllllllIlIlllIIIIIlllIIIIll);
        if (!lIlIIIIlllllIIll(llllllllllllIlIlllIIIIIlllIIIIlI) || lIlIIIIlllllIlII(llllllllllllIlIlllIIIIIlllIIIIlI, llllllllllllIlIlllIIIIIllIllllII - llllllllllllIlIlllIIIIIlllIIIIll)) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[35]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[3]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIIIlllIIIIlI;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = llllllllllllIlIlllIIIIIlllIIIIll;
            args[AbstractByteBuf.lllIlIIIllllll[2]] = llllllllllllIlIlllIIIIIllIllllII;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
    }
    
    @Override
    public int getInt(final int llllllllllllIlIlllIIIlIIlIIlIllI) {
        this.checkIndex(llllllllllllIlIlllIIIlIIlIIlIllI, AbstractByteBuf.lllIlIIIllllll[4]);
        return this._getInt(llllllllllllIlIlllIIIlIIlIIlIllI);
    }
    
    @Override
    public double readDouble() {
        return Double.longBitsToDouble(this.readLong());
    }
    
    @Override
    public float getFloat(final int llllllllllllIlIlllIIIlIIIlllllII) {
        return Float.intBitsToFloat(this.getInt(llllllllllllIlIlllIIIlIIIlllllII));
    }
    
    @Override
    public boolean readBoolean() {
        int n;
        if (lIlIIIIllllllIlI(this.readByte())) {
            n = AbstractByteBuf.lllIlIIIllllll[1];
            "".length();
            if (" ".length() > "  ".length()) {
                return ((43 + 139 - 62 + 81 ^ 10 + 36 + 38 + 69) & (15 + 171 - 72 + 88 ^ 130 + 100 - 137 + 61 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = AbstractByteBuf.lllIlIIIllllll[0];
        }
        return n != 0;
    }
    
    @Override
    public int forEachByteDesc(final int llllllllllllIlIlllIIIIlIIIIIlIlI, final int llllllllllllIlIlllIIIIlIIIIIlIIl, final ByteBufProcessor llllllllllllIlIlllIIIIlIIIIIIlII) {
        this.checkIndex(llllllllllllIlIlllIIIIlIIIIIlIlI, llllllllllllIlIlllIIIIlIIIIIlIIl);
        return this.forEachByteDesc0(llllllllllllIlIlllIIIIlIIIIIlIlI, llllllllllllIlIlllIIIIlIIIIIlIIl, llllllllllllIlIlllIIIIlIIIIIIlII);
    }
    
    private static boolean lIlIIIIllllllIII(final int llllllllllllIlIlllIIIIIlIIlllllI, final int llllllllllllIlIlllIIIIIlIIllllII) {
        return llllllllllllIlIlllIIIIIlIIlllllI != llllllllllllIlIlllIIIIIlIIllllII;
    }
    
    @Override
    public int readableBytes() {
        return this.writerIndex - this.readerIndex;
    }
    
    @Override
    public ByteBuf readBytes(final ByteBuf llllllllllllIlIlllIIIIllIllIllll) {
        this.readBytes(llllllllllllIlIlllIIIIllIllIllll, llllllllllllIlIlllIIIIllIllIllll.writableBytes());
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeByte(final int llllllllllllIlIlllIIIIllIIlIlIlI) {
        this.ensureAccessible();
        this.ensureWritable(AbstractByteBuf.lllIlIIIllllll[1]);
        "".length();
        final int writerIndex = this.writerIndex;
        this.writerIndex = writerIndex + AbstractByteBuf.lllIlIIIllllll[1];
        this._setByte(writerIndex, llllllllllllIlIlllIIIIllIIlIlIlI);
        return this;
    }
    
    private static void lIlIIIIlllllIIIl() {
        (lllIlIIIllllll = new int[41])[0] = ((0x26 ^ 0x7 ^ (0xCD ^ 0xC0)) & (25 + 118 + 34 + 56 ^ 127 + 53 - 159 + 176 ^ -" ".length()));
        AbstractByteBuf.lllIlIIIllllll[1] = " ".length();
        AbstractByteBuf.lllIlIIIllllll[2] = "  ".length();
        AbstractByteBuf.lllIlIIIllllll[3] = "   ".length();
        AbstractByteBuf.lllIlIIIllllll[4] = (16 + 64 - 27 + 120 ^ 97 + 108 - 189 + 153);
        AbstractByteBuf.lllIlIIIllllll[5] = (0x9 ^ 0x55 ^ (0x45 ^ 0x1C));
        AbstractByteBuf.lllIlIIIllllll[6] = (0xA ^ 0xC);
        AbstractByteBuf.lllIlIIIllllll[7] = (0xC7 ^ 0xC0);
        AbstractByteBuf.lllIlIIIllllll[8] = (0xFFFFE046 & 0x401FB9);
        AbstractByteBuf.lllIlIIIllllll[9] = (0xB ^ 0x58 ^ (0x47 ^ 0x54));
        AbstractByteBuf.lllIlIIIllllll[10] = (0x2A ^ 0x22);
        AbstractByteBuf.lllIlIIIllllll[11] = 68 + 137 - 161 + 142 + (77 + 150 - 193 + 189) - (24 + 91 + 12 + 47) + (0x5 ^ 0x11);
        AbstractByteBuf.lllIlIIIllllll[12] = (-1 & 0xFFFF);
        AbstractByteBuf.lllIlIIIllllll[13] = (-(0xFFFF9FEE & 0x7777) & (0xFFFFD77F & 0x803FE5));
        AbstractByteBuf.lllIlIIIllllll[14] = -(0xFFFFFE56 & 0x10001A9);
        AbstractByteBuf.lllIlIIIllllll[15] = (0xC0 ^ 0xA3 ^ (0x5B ^ 0x31));
        AbstractByteBuf.lllIlIIIllllll[16] = (0x46 ^ 0x4C);
        AbstractByteBuf.lllIlIIIllllll[17] = (131 + 103 - 194 + 138 ^ 21 + 19 + 80 + 65);
        AbstractByteBuf.lllIlIIIllllll[18] = (0x53 ^ 0x5F);
        AbstractByteBuf.lllIlIIIllllll[19] = (127 + 68 - 135 + 77 ^ 120 + 114 - 217 + 115);
        AbstractByteBuf.lllIlIIIllllll[20] = -" ".length();
        AbstractByteBuf.lllIlIIIllllll[21] = (123 + 38 - 53 + 62 ^ 11 + 86 - 92 + 159);
        AbstractByteBuf.lllIlIIIllllll[22] = (94 + 114 - 110 + 65 ^ 52 + 68 - 31 + 83);
        AbstractByteBuf.lllIlIIIllllll[23] = (150 + 41 - 116 + 89 ^ 98 + 57 - 153 + 178);
        AbstractByteBuf.lllIlIIIllllll[24] = (0x5C ^ 0x4D);
        AbstractByteBuf.lllIlIIIllllll[25] = (0x7D ^ 0x63 ^ (0x39 ^ 0x35));
        AbstractByteBuf.lllIlIIIllllll[26] = (0xD3 ^ 0xC0);
        AbstractByteBuf.lllIlIIIllllll[27] = (-1 & Integer.MAX_VALUE);
        AbstractByteBuf.lllIlIIIllllll[28] = (30 + 159 - 27 + 27 ^ 121 + 48 - 45 + 22);
        AbstractByteBuf.lllIlIIIllllll[29] = (0x13 ^ 0x7);
        AbstractByteBuf.lllIlIIIllllll[30] = (0x73 ^ 0x7F ^ (0x9 ^ 0x2C));
        AbstractByteBuf.lllIlIIIllllll[31] = (0x92 ^ 0x87);
        AbstractByteBuf.lllIlIIIllllll[32] = (0x40 ^ 0x56);
        AbstractByteBuf.lllIlIIIllllll[33] = (0xFD ^ 0xB2 ^ (0x5E ^ 0x6));
        AbstractByteBuf.lllIlIIIllllll[34] = (0xB ^ 0x13);
        AbstractByteBuf.lllIlIIIllllll[35] = (0x10 ^ 0x9);
        AbstractByteBuf.lllIlIIIllllll[36] = (146 + 55 - 196 + 166 ^ 51 + 161 - 157 + 122);
        AbstractByteBuf.lllIlIIIllllll[37] = (72 + 76 - 45 + 31 ^ 60 + 139 - 74 + 32);
        AbstractByteBuf.lllIlIIIllllll[38] = (0xA8 ^ 0x89 ^ (0x4D ^ 0x70));
        AbstractByteBuf.lllIlIIIllllll[39] = (0x71 ^ 0x6C);
        AbstractByteBuf.lllIlIIIllllll[40] = (0xB0 ^ 0xAE);
    }
    
    @Override
    public ByteBuf setDouble(final int llllllllllllIlIlllIIIlIIIIIIlIII, final double llllllllllllIlIlllIIIlIIIIIIlIlI) {
        this.setLong(llllllllllllIlIlllIIIlIIIIIIlIII, Double.doubleToRawLongBits(llllllllllllIlIlllIIIlIIIIIIlIlI));
        "".length();
        return this;
    }
    
    @Override
    public long readLong() {
        this.checkReadableBytes(AbstractByteBuf.lllIlIIIllllll[10]);
        final long llllllllllllIlIlllIIIIlllIlIIlII = this._getLong(this.readerIndex);
        this.readerIndex += AbstractByteBuf.lllIlIIIllllll[10];
        return llllllllllllIlIlllIIIIlllIlIIlII;
    }
    
    @Override
    public boolean isWritable() {
        int n;
        if (lIlIIIIlllllIlII(this.capacity(), this.writerIndex)) {
            n = AbstractByteBuf.lllIlIIIllllll[1];
            "".length();
            if ("  ".length() > "   ".length()) {
                return ((0x80 ^ 0xB3) & ~(0x14 ^ 0x27)) != 0x0;
            }
        }
        else {
            n = AbstractByteBuf.lllIlIIIllllll[0];
        }
        return n != 0;
    }
    
    @Override
    public ByteBuf readerIndex(final int llllllllllllIlIlllIIIlIlIlIIllll) {
        if (!lIlIIIIlllllIIll(llllllllllllIlIlllIIIlIlIlIIllll) || lIlIIIIlllllIlII(llllllllllllIlIlllIIIlIlIlIIllll, this.writerIndex)) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[2]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[2]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIlIlIlIIllll;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = this.writerIndex;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        this.readerIndex = llllllllllllIlIlllIIIlIlIlIIllll;
        return this;
    }
    
    @Override
    public int getUnsignedMedium(final int llllllllllllIlIlllIIIlIIlIlIIlIl) {
        this.checkIndex(llllllllllllIlIlllIIIlIIlIlIIlIl, AbstractByteBuf.lllIlIIIllllll[3]);
        return this._getUnsignedMedium(llllllllllllIlIlllIIIlIIlIlIIlIl);
    }
    
    @Override
    public ByteBuf order(final ByteOrder llllllllllllIlIlllIIIlIIllIIlllI) {
        if (lIlIIIIlllllllII(llllllllllllIlIlllIIIlIIllIIlllI)) {
            throw new NullPointerException(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[10]]);
        }
        if (lIlIIIIlllllllIl(llllllllllllIlIlllIIIlIIllIIlllI, this.order())) {
            return this;
        }
        SwappedByteBuf llllllllllllIlIlllIIIlIIllIIllIl = this.swappedBuf;
        if (lIlIIIIlllllllII(llllllllllllIlIlllIIIlIIllIIllIl)) {
            llllllllllllIlIlllIIIlIIllIIllIl = (this.swappedBuf = this.newSwappedByteBuf());
        }
        return llllllllllllIlIlllIIIlIIllIIllIl;
    }
    
    @Override
    public boolean equals(final Object llllllllllllIlIlllIIIIIllllIlIIl) {
        if (lIlIIIIlllllllIl(this, llllllllllllIlIlllIIIIIllllIlIIl)) {
            return AbstractByteBuf.lllIlIIIllllll[1] != 0;
        }
        if (lIlIIIIllllllIlI((llllllllllllIlIlllIIIIIllllIlIIl instanceof ByteBuf) ? 1 : 0)) {
            return ByteBufUtil.equals(this, (ByteBuf)llllllllllllIlIlllIIIIIllllIlIIl);
        }
        return AbstractByteBuf.lllIlIIIllllll[0] != 0;
    }
    
    private static String lIlIIIIllIllllIl(final String llllllllllllIlIlllIIIIIlIlllIIIl, final String llllllllllllIlIlllIIIIIlIlllIIII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIIIIlIlllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIIIIlIlllIIII.getBytes(StandardCharsets.UTF_8)), AbstractByteBuf.lllIlIIIllllll[10]), "DES");
            final Cipher llllllllllllIlIlllIIIIIlIlllIIll = Cipher.getInstance("DES");
            llllllllllllIlIlllIIIIIlIlllIIll.init(AbstractByteBuf.lllIlIIIllllll[2], llllllllllllIlIlllIIIIIlIlllIlII);
            return new String(llllllllllllIlIlllIIIIIlIlllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIIIIlIlllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIIIIlIlllIIlI) {
            llllllllllllIlIlllIIIIIlIlllIIlI.printStackTrace();
            return null;
        }
    }
    
    protected abstract int _getInt(final int p0);
    
    @Override
    public int bytesBefore(final int llllllllllllIlIlllIIIIlIIlIIllII, final int llllllllllllIlIlllIIIIlIIlIlIIII, final byte llllllllllllIlIlllIIIIlIIlIIlIlI) {
        final int llllllllllllIlIlllIIIIlIIlIIlllI = this.indexOf(llllllllllllIlIlllIIIIlIIlIIllII, llllllllllllIlIlllIIIIlIIlIIllII + llllllllllllIlIlllIIIIlIIlIlIIII, llllllllllllIlIlllIIIIlIIlIIlIlI);
        if (lIlIIIIlllllIIlI(llllllllllllIlIlllIIIIlIIlIIlllI)) {
            return AbstractByteBuf.lllIlIIIllllll[20];
        }
        return llllllllllllIlIlllIIIIlIIlIIlllI - llllllllllllIlIlllIIIIlIIlIIllII;
    }
    
    @Override
    public ByteBuf skipBytes(final int llllllllllllIlIlllIIIIllIIllIllI) {
        this.checkReadableBytes(llllllllllllIlIlllIIIIllIIllIllI);
        this.readerIndex += llllllllllllIlIlllIIIIllIIllIllI;
        return this;
    }
    
    @Override
    public int bytesBefore(final int llllllllllllIlIlllIIIIlIIlIllIIl, final byte llllllllllllIlIlllIIIIlIIlIllIII) {
        this.checkReadableBytes(llllllllllllIlIlllIIIIlIIlIllIIl);
        return this.bytesBefore(this.readerIndex(), llllllllllllIlIlllIIIIlIIlIllIIl, llllllllllllIlIlllIIIIlIIlIllIII);
    }
    
    private static boolean lIlIIIIllllllllI(final int llllllllllllIlIlllIIIIIlIlIIIlII) {
        return llllllllllllIlIlllIIIIIlIlIIIlII > 0;
    }
    
    @Override
    public int writerIndex() {
        return this.writerIndex;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIlllIIIlIIIllIIlIl, final ByteBuf llllllllllllIlIlllIIIlIIIllIIlll) {
        this.getBytes(llllllllllllIlIlllIIIlIIIllIIlIl, llllllllllllIlIlllIIIlIIIllIIlll, llllllllllllIlIlllIIIlIIIllIIlll.writableBytes());
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf writeDouble(final double llllllllllllIlIlllIIIIllIIIIIIII) {
        this.writeLong(Double.doubleToRawLongBits(llllllllllllIlIlllIIIIllIIIIIIII));
        "".length();
        return this;
    }
    
    protected SwappedByteBuf newSwappedByteBuf() {
        return new SwappedByteBuf(this);
    }
    
    @Override
    public ByteBuffer[] nioBuffers() {
        return this.nioBuffers(this.readerIndex, this.readableBytes());
    }
    
    @Override
    public ByteBuf markWriterIndex() {
        this.markedWriterIndex = this.writerIndex;
        return this;
    }
    
    private static boolean lIlIIIIlllllIIlI(final int llllllllllllIlIlllIIIIIlIlIIIlll) {
        return llllllllllllIlIlllIIIIIlIlIIIlll < 0;
    }
    
    @Override
    public ByteBuf setLong(final int llllllllllllIlIlllIIIlIIIIIlIlII, final long llllllllllllIlIlllIIIlIIIIIlIIll) {
        this.checkIndex(llllllllllllIlIlllIIIlIIIIIlIlII, AbstractByteBuf.lllIlIIIllllll[10]);
        this._setLong(llllllllllllIlIlllIIIlIIIIIlIlII, llllllllllllIlIlllIIIlIIIIIlIIll);
        return this;
    }
    
    @Override
    public int maxWritableBytes() {
        return this.maxCapacity() - this.writerIndex;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIlllIIIlIIIlIllIlI, final ByteBuf llllllllllllIlIlllIIIlIIIlIllIIl, final int llllllllllllIlIlllIIIlIIIlIlllII) {
        this.getBytes(llllllllllllIlIlllIIIlIIIlIllIlI, llllllllllllIlIlllIIIlIIIlIllIIl, llllllllllllIlIlllIIIlIIIlIllIIl.writerIndex(), llllllllllllIlIlllIIIlIIIlIlllII);
        "".length();
        llllllllllllIlIlllIIIlIIIlIllIIl.writerIndex(llllllllllllIlIlllIIIlIIIlIllIIl.writerIndex() + llllllllllllIlIlllIIIlIIIlIlllII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf copy() {
        return this.copy(this.readerIndex, this.readableBytes());
    }
    
    @Override
    public int bytesBefore(final byte llllllllllllIlIlllIIIIlIIllIIIll) {
        return this.bytesBefore(this.readerIndex(), this.readableBytes(), llllllllllllIlIlllIIIIlIIllIIIll);
    }
    
    @Override
    public ByteBuf slice() {
        return this.slice(this.readerIndex, this.readableBytes());
    }
    
    @Override
    public char readChar() {
        return (char)this.readShort();
    }
    
    @Override
    public ByteBuf writeShort(final int llllllllllllIlIlllIIIIllIIlIIlII) {
        this.ensureAccessible();
        this.ensureWritable(AbstractByteBuf.lllIlIIIllllll[2]);
        "".length();
        this._setShort(this.writerIndex, llllllllllllIlIlllIIIIllIIlIIlII);
        this.writerIndex += AbstractByteBuf.lllIlIIIllllll[2];
        return this;
    }
    
    @Override
    public ByteBuf writeBytes(final byte[] llllllllllllIlIlllIIIIlIllllIllI, final int llllllllllllIlIlllIIIIlIllllIlIl, final int llllllllllllIlIlllIIIIlIllllIlII) {
        this.ensureAccessible();
        this.ensureWritable(llllllllllllIlIlllIIIIlIllllIlII);
        "".length();
        this.setBytes(this.writerIndex, llllllllllllIlIlllIIIIlIllllIllI, llllllllllllIlIlllIIIIlIllllIlIl, llllllllllllIlIlllIIIIlIllllIlII);
        "".length();
        this.writerIndex += llllllllllllIlIlllIIIIlIllllIlII;
        return this;
    }
    
    private static String lIlIIIIllIlllIlI(final String llllllllllllIlIlllIIIIIllIIlIlII, final String llllllllllllIlIlllIIIIIllIIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlIlllIIIIIllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIIIIIllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIIIIIllIIllIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIIIIIllIIllIII.init(AbstractByteBuf.lllIlIIIllllll[2], llllllllllllIlIlllIIIIIllIIllIIl);
            return new String(llllllllllllIlIlllIIIIIllIIllIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIIIIIllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIIIIIllIIlIlll) {
            llllllllllllIlIlllIIIIIllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf setChar(final int llllllllllllIlIlllIIIlIIIIlllIII, final int llllllllllllIlIlllIIIlIIIIllIlII) {
        this.setShort(llllllllllllIlIlllIIIlIIIIlllIII, llllllllllllIlIlllIIIlIIIIllIlII);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setZero(int llllllllllllIlIlllIIIIllllIllllI, final int llllllllllllIlIlllIIIIllllIlllIl) {
        if (lIlIIIIlllllIlll(llllllllllllIlIlllIIIIllllIlllIl)) {
            return this;
        }
        this.checkIndex(llllllllllllIlIlllIIIIllllIllllI, llllllllllllIlIlllIIIIllllIlllIl);
        final int llllllllllllIlIlllIIIIllllIlllII = llllllllllllIlIlllIIIIllllIlllIl >>> AbstractByteBuf.lllIlIIIllllll[3];
        final int llllllllllllIlIlllIIIIllllIllIll = llllllllllllIlIlllIIIIllllIlllIl & AbstractByteBuf.lllIlIIIllllll[7];
        int llllllllllllIlIlllIIIIlllllIIIlI = llllllllllllIlIlllIIIIllllIlllII;
        while (lIlIIIIllllllllI(llllllllllllIlIlllIIIIlllllIIIlI)) {
            this.setLong(llllllllllllIlIlllIIIIllllIllllI, 0L);
            "".length();
            llllllllllllIlIlllIIIIllllIllllI += 8;
            --llllllllllllIlIlllIIIIlllllIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        if (lIlIIIIllllllIIl(llllllllllllIlIlllIIIIllllIllIll, AbstractByteBuf.lllIlIIIllllll[4])) {
            this.setInt(llllllllllllIlIlllIIIIllllIllllI, AbstractByteBuf.lllIlIIIllllll[0]);
            "".length();
            "".length();
            if (((0x26 ^ 0x46 ^ (0x2A ^ 0x4F)) & (74 + 176 - 221 + 159 ^ 166 + 26 - 106 + 99 ^ -" ".length())) < -" ".length()) {
                return null;
            }
        }
        else if (lIlIIIIllllllIll(llllllllllllIlIlllIIIIllllIllIll, AbstractByteBuf.lllIlIIIllllll[4])) {
            int llllllllllllIlIlllIIIIlllllIIIIl = llllllllllllIlIlllIIIIllllIllIll;
            while (lIlIIIIllllllllI(llllllllllllIlIlllIIIIlllllIIIIl)) {
                this.setByte(llllllllllllIlIlllIIIIllllIllllI, AbstractByteBuf.lllIlIIIllllll[0]);
                "".length();
                ++llllllllllllIlIlllIIIIllllIllllI;
                --llllllllllllIlIlllIIIIlllllIIIIl;
                "".length();
                if ((0x4 ^ 0x0) < "   ".length()) {
                    return null;
                }
            }
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            this.setInt(llllllllllllIlIlllIIIIllllIllllI, AbstractByteBuf.lllIlIIIllllll[0]);
            "".length();
            llllllllllllIlIlllIIIIllllIllllI += 4;
            int llllllllllllIlIlllIIIIlllllIIIII = llllllllllllIlIlllIIIIllllIllIll - AbstractByteBuf.lllIlIIIllllll[4];
            while (lIlIIIIllllllllI(llllllllllllIlIlllIIIIlllllIIIII)) {
                this.setByte(llllllllllllIlIlllIIIIllllIllllI, AbstractByteBuf.lllIlIIIllllll[0]);
                "".length();
                ++llllllllllllIlIlllIIIIllllIllllI;
                --llllllllllllIlIlllIIIIlllllIIIII;
                "".length();
                if ("  ".length() == 0) {
                    return null;
                }
            }
        }
        return this;
    }
    
    @Override
    public int readerIndex() {
        return this.readerIndex;
    }
    
    @Override
    public ByteBuf writeFloat(final float llllllllllllIlIlllIIIIllIIIIIllI) {
        this.writeInt(Float.floatToRawIntBits(llllllllllllIlIlllIIIIllIIIIIllI));
        "".length();
        return this;
    }
    
    private static boolean lIlIIIIllllllIll(final int llllllllllllIlIlllIIIIIlIllIIIIl, final int llllllllllllIlIlllIIIIIlIllIIIII) {
        return llllllllllllIlIlllIIIIIlIllIIIIl < llllllllllllIlIlllIIIIIlIllIIIII;
    }
    
    @Override
    public ByteBuf setByte(final int llllllllllllIlIlllIIIlIIIlIlIIll, final int llllllllllllIlIlllIIIlIIIlIIllll) {
        this.checkIndex(llllllllllllIlIlllIIIlIIIlIlIIll);
        this._setByte(llllllllllllIlIlllIIIlIIIlIlIIll, llllllllllllIlIlllIIIlIIIlIIllll);
        return this;
    }
    
    @Override
    public ByteBuf discardReadBytes() {
        this.ensureAccessible();
        if (lIlIIIIlllllIlll(this.readerIndex)) {
            return this;
        }
        if (lIlIIIIllllllIII(this.readerIndex, this.writerIndex)) {
            this.setBytes(AbstractByteBuf.lllIlIIIllllll[0], this, this.readerIndex, this.writerIndex - this.readerIndex);
            "".length();
            this.writerIndex -= this.readerIndex;
            this.adjustMarkers(this.readerIndex);
            this.readerIndex = AbstractByteBuf.lllIlIIIllllll[0];
            "".length();
            if ((76 + 48 - 95 + 156 ^ 65 + 126 - 170 + 168) == ((0x6C ^ 0x60 ^ " ".length()) & (" ".length() ^ (0x7E ^ 0x72) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            this.adjustMarkers(this.readerIndex);
            final int n = AbstractByteBuf.lllIlIIIllllll[0];
            this.readerIndex = n;
            this.writerIndex = n;
        }
        return this;
    }
    
    @Override
    public byte readByte() {
        this.checkReadableBytes(AbstractByteBuf.lllIlIIIllllll[1]);
        final int llllllllllllIlIlllIIIIllllIlIIII = this.readerIndex;
        final byte llllllllllllIlIlllIIIIllllIIllll = this.getByte(llllllllllllIlIlllIIIIllllIlIIII);
        this.readerIndex = llllllllllllIlIlllIIIIllllIlIIII + AbstractByteBuf.lllIlIIIllllll[1];
        return llllllllllllIlIlllIIIIllllIIllll;
    }
    
    protected final void checkReadableBytes(final int llllllllllllIlIlllIIIIIllIlIlIIl) {
        this.ensureAccessible();
        if (lIlIIIIlllllIIlI(llllllllllllIlIlllIIIIIllIlIlIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[37]]).append(llllllllllllIlIlllIIIIIllIlIlIIl).append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[38]])));
        }
        if (lIlIIIIlllllIlII(this.readerIndex, this.writerIndex - llllllllllllIlIlllIIIIIllIlIlIIl)) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[39]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[4]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = this.readerIndex;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = llllllllllllIlIlllIIIIIllIlIlIIl;
            args[AbstractByteBuf.lllIlIIIllllll[2]] = this.writerIndex;
            args[AbstractByteBuf.lllIlIIIllllll[3]] = this;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
    }
    
    @Override
    public short getShort(final int llllllllllllIlIlllIIIlIIlIlIllll) {
        this.checkIndex(llllllllllllIlIlllIIIlIIlIlIllll, AbstractByteBuf.lllIlIIIllllll[2]);
        return this._getShort(llllllllllllIlIlllIIIlIIlIlIllll);
    }
    
    private static boolean lIlIIIIllllllIlI(final int llllllllllllIlIlllIIIIIlIlIIlllI) {
        return llllllllllllIlIlllIIIIIlIlIIlllI != 0;
    }
    
    protected abstract int _getUnsignedMedium(final int p0);
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlIlllIIIIlllllIlIll, final ByteBuf llllllllllllIlIlllIIIIlllllIlIlI, final int llllllllllllIlIlllIIIIlllllIlIIl) {
        this.checkIndex(llllllllllllIlIlllIIIIlllllIlIll, llllllllllllIlIlllIIIIlllllIlIIl);
        if (lIlIIIIlllllllII(llllllllllllIlIlllIIIIlllllIlIlI)) {
            throw new NullPointerException(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[15]]);
        }
        if (lIlIIIIlllllIlII(llllllllllllIlIlllIIIIlllllIlIIl, llllllllllllIlIlllIIIIlllllIlIlI.readableBytes())) {
            final String format = AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[16]];
            final Object[] args = new Object[AbstractByteBuf.lllIlIIIllllll[3]];
            args[AbstractByteBuf.lllIlIIIllllll[0]] = llllllllllllIlIlllIIIIlllllIlIIl;
            args[AbstractByteBuf.lllIlIIIllllll[1]] = llllllllllllIlIlllIIIIlllllIlIlI.readableBytes();
            args[AbstractByteBuf.lllIlIIIllllll[2]] = llllllllllllIlIlllIIIIlllllIlIlI;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        this.setBytes(llllllllllllIlIlllIIIIlllllIlIll, llllllllllllIlIlllIIIIlllllIlIlI, llllllllllllIlIlllIIIIlllllIlIlI.readerIndex(), llllllllllllIlIlllIIIIlllllIlIIl);
        "".length();
        llllllllllllIlIlllIIIIlllllIlIlI.readerIndex(llllllllllllIlIlllIIIIlllllIlIlI.readerIndex() + llllllllllllIlIlllIIIIlllllIlIIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlIlllIIIlIIIllIlllI, final byte[] llllllllllllIlIlllIIIlIIIllIllIl) {
        this.getBytes(llllllllllllIlIlllIIIlIIIllIlllI, llllllllllllIlIlllIIIlIIIllIllIl, AbstractByteBuf.lllIlIIIllllll[0], llllllllllllIlIlllIIIlIIIllIllIl.length);
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf readBytes(final int llllllllllllIlIlllIIIIlllIIlIIIl) {
        this.checkReadableBytes(llllllllllllIlIlllIIIIlllIIlIIIl);
        if (lIlIIIIlllllIlll(llllllllllllIlIlllIIIIlllIIlIIIl)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf llllllllllllIlIlllIIIIlllIIlIIll = Unpooled.buffer(llllllllllllIlIlllIIIIlllIIlIIIl, this.maxCapacity);
        llllllllllllIlIlllIIIIlllIIlIIll.writeBytes(this, this.readerIndex, llllllllllllIlIlllIIIIlllIIlIIIl);
        "".length();
        this.readerIndex += llllllllllllIlIlllIIIIlllIIlIIIl;
        return llllllllllllIlIlllIIIIlllIIlIIll;
    }
    
    @Override
    public short getUnsignedByte(final int llllllllllllIlIlllIIIlIIlIllIlll) {
        return (short)(this.getByte(llllllllllllIlIlllIIIlIIlIllIlll) & AbstractByteBuf.lllIlIIIllllll[11]);
    }
    
    @Override
    public ByteBuf clear() {
        final int n = AbstractByteBuf.lllIlIIIllllll[0];
        this.writerIndex = n;
        this.readerIndex = n;
        return this;
    }
    
    @Override
    public ByteBuf writeBoolean(final boolean llllllllllllIlIlllIIIIllIIllIIII) {
        int llllllllllllIlIlllIIIIllIIlIlIlI;
        if (lIlIIIIllllllIlI(llllllllllllIlIlllIIIIllIIllIIII ? 1 : 0)) {
            llllllllllllIlIlllIIIIllIIlIlIlI = AbstractByteBuf.lllIlIIIllllll[1];
            "".length();
            if ("   ".length() < ((37 + 113 - 116 + 134 ^ 62 + 67 - 15 + 39) & (62 + 47 + 4 + 57 ^ 35 + 34 - 44 + 130 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            llllllllllllIlIlllIIIIllIIlIlIlI = AbstractByteBuf.lllIlIIIllllll[0];
        }
        this.writeByte(llllllllllllIlIlllIIIIllIIlIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public long getLong(final int llllllllllllIlIlllIIIlIIlIIIlIII) {
        this.checkIndex(llllllllllllIlIlllIIIlIIlIIIlIII, AbstractByteBuf.lllIlIIIllllll[10]);
        return this._getLong(llllllllllllIlIlllIIIlIIlIIIlIII);
    }
    
    @Override
    public ByteBuf writeMedium(final int llllllllllllIlIlllIIIIllIIIllllI) {
        this.ensureAccessible();
        this.ensureWritable(AbstractByteBuf.lllIlIIIllllll[3]);
        "".length();
        this._setMedium(this.writerIndex, llllllllllllIlIlllIIIIllIIIllllI);
        this.writerIndex += AbstractByteBuf.lllIlIIIllllll[3];
        return this;
    }
    
    private static boolean lIlIIIIllllllIIl(final int llllllllllllIlIlllIIIIIlIllIlIIl, final int llllllllllllIlIlllIIIIIlIllIlIII) {
        return llllllllllllIlIlllIIIIIlIllIlIIl == llllllllllllIlIlllIIIIIlIllIlIII;
    }
    
    @Override
    public long readUnsignedInt() {
        return (long)this.readInt() & 0xFFFFFFFFL;
    }
    
    @Override
    public boolean isReadable(final int llllllllllllIlIlllIIIlIlIIllIIIl) {
        int n;
        if (lIlIIIIlllllIlIl(this.writerIndex - this.readerIndex, llllllllllllIlIlllIIIlIlIIllIIIl)) {
            n = AbstractByteBuf.lllIlIIIllllll[1];
            "".length();
            if (null != null) {
                return ((0x45 ^ 0x7B ^ (0x13 ^ 0x37)) & (59 + 24 - 36 + 110 ^ 65 + 4 - 60 + 126 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = AbstractByteBuf.lllIlIIIllllll[0];
        }
        return n != 0;
    }
    
    private static void lIlIIIIlllIIIIll() {
        (lllIlIIIlIlllI = new String[AbstractByteBuf.lllIlIIIllllll[40]])[AbstractByteBuf.lllIlIIIllllll[0]] = lIlIIIIllIlllIlI("m7O1RGwirQyjlDjbAEIv0g==", "qjGmd");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[1]] = lIlIIIIllIlllIll("QmM2MDUHKCctIVhrbXVlUmI=", "bKSHE");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[2]] = lIlIIIIllIlllIll("BisrCwoGByQLCgx0akoLVGYvFx8RLT4KC05uek9TSW44Cg4QKzgmARArMk9TSW49HQYAKzgmARArMkdKEGdj", "tNJoo");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[3]] = lIlIIIIllIlllIll("GjQFOgEfDwIqARV8TGsATW4JNhQIJRgrAFdmHisFCSMeBwoJIxRmQQlvTHJZTTEeJxAINCUgAAg+THJZTSUNPgUOLxg3TEgiRWc=", "mFlNd");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[4]] = lIlIIIIllIlllIlI("qxgS3GkP22nczN4+mXE17KAdi1M8fM9Mlz9/fhV0nLPpOcAFtg8fVy+IeN9vPbhgQetHAKI3F+/VOV2y921iXcJpMEPdedRTnRAYrvpDj0cwL3k2fKZdqiwNsJ/IQK6a", "pXWXs");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[5]] = lIlIIIIllIlllIll("BCoUPhgANxsLBgwBAx0PGnlaTA5Jax8RGgwgDgwOU2NEVEpZag==", "iCzij");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[6]] = lIlIIIIllIlllIlI("fkRilj4wnT9dG7yvLIRjNx0qmSrn084RE/EMW4/RUoZ8Of7VxFdheqiwsuLt25NU08j60iBm+abFXYSrfoQKN59h2aygaLLb", "jWbtG");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[7]] = lIlIIIIllIlllIlI("AeqcP98IehGT6gT1m9L7K6fobtT0AwhzWjGhOgQsQIoHBASfQyq1Bw==", "rsXus");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[10]] = lIlIIIIllIlllIlI("9dPlg9+kW7b8ssD3Hm9caQ==", "IAgVf");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[15]] = lIlIIIIllIlllIll("MCQi", "CVACG");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[16]] = lIlIIIIllIlllIll("Kg8GFAIuQk0XX2YPEBATIw4bUwU0CUYBEycOCREaIygRBxM1Qk0XX2YdABYEI0obARVmAxtJVmMZ", "Fjhsv");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[17]] = lIlIIIIllIllllIl("bOUHrXl3r2Gz4v/IyP3M2Jj/afkpmuF5+1d4P3zsCFK/sKWprdWFT/VZLKEfspbragykbxBltyKlrRVfCCjSOQ==", "wPyyC");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[18]] = lIlIIIIllIlllIlI("Zy9p5E5e22LTArERC7jg4Io6cqwMNuGG/3YxMQCG2X2OLNoAThr1wvoByufoqwMi3l4S8bY7q86btijk9adVtQ==", "iCyjG");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[19]] = lIlIIIIllIlllIlI("9f+pDCt8xLU=", "Znibv");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[21]] = lIlIIIIllIlllIll("HT8/LiEePj8/", "mMPMD");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[22]] = lIlIIIIllIllllIl("CQxsxwaU68Epwm5w1W6dWA==", "UgWFS");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[23]] = lIlIIIIllIlllIll("aSMYJgglbA==", "AEjCm");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[24]] = lIlIIIIllIlllIlI("BXE/v/3pdRk=", "sMynv");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[25]] = lIlIIIIllIllllIl("Pdju4MTaPEMfCpySnj3f+g==", "Cldle");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[26]] = lIlIIIIllIlllIll("XWcHBx5LZw==", "qGdfn");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[29]] = lIlIIIIllIlllIlI("FD8UgJZpt2eEf6jj/DYZjw==", "dZVxF");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[31]] = lIlIIIIllIllllIl("8ohfxI4bM3g6c89Q7kZV9QVbCb+KpB4LTN7LYz3sTm5+CKOb3wnuvg==", "kZRLx");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[32]] = lIlIIIIllIllllIl("d7yA1UclA1IqkwlfrM0QGg==", "GCvgf");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[33]] = lIlIIIIllIlllIlI("nrVhJFFlkGIqYUve3sb8y5z0fbWvTFXu", "WaLZK");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[34]] = lIlIIIIllIlllIlI("OY9RKZWoqi5cvRE7D/3Gc3tO4s8/kPAOqa+3mhTQ8yYY5GJiONBbZeJBuz31Oeib", "gTchx");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[35]] = lIlIIIIllIllllIl("eRMnTTlq3+tDkDKP1wJHc/TSrl1z9OESg8DwuhpgA757jyhppfAVgqoNXeNFupiHvaTq+lAX6/8=", "GXFpV");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[36]] = lIlIIIIllIllllIl("liwG4mHOpgaxvnPY4ICaPGqQoW8AF/Gh1An8f7FLHdlryZFi1Rb4NHPlOSR5krlRY/YUWv3fpUw=", "IOdQx");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[37]] = lIlIIIIllIlllIll("OwE0IjcjBQguOzIJOCc/FBEuLilsSA==", "VhZKZ");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[38]] = lIlIIIIllIlllIll("bkk/KRcrAi40A3RBZGxHfkg=", "NaZQg");
        AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[39]] = lIlIIIIllIlllIlI("xUV34ZndQ/WPbyq3nfhTz0DYtQkzl3Nj7xmIB7JTX1jPwILNlDmANH0lEOjHwTwmRxQlAoU0wulRcSiEZd2u1w==", "uwccG");
    }
    
    @Override
    public short readShort() {
        this.checkReadableBytes(AbstractByteBuf.lllIlIIIllllll[2]);
        final short llllllllllllIlIlllIIIIllllIIIIlI = this._getShort(this.readerIndex);
        this.readerIndex += AbstractByteBuf.lllIlIIIllllll[2];
        return llllllllllllIlIlllIIIIllllIIIIlI;
    }
    
    @Override
    public ByteBuf discardSomeReadBytes() {
        this.ensureAccessible();
        if (lIlIIIIlllllIlll(this.readerIndex)) {
            return this;
        }
        if (lIlIIIIllllllIIl(this.readerIndex, this.writerIndex)) {
            this.adjustMarkers(this.readerIndex);
            final int n = AbstractByteBuf.lllIlIIIllllll[0];
            this.readerIndex = n;
            this.writerIndex = n;
            return this;
        }
        if (lIlIIIIlllllIlIl(this.readerIndex, this.capacity() >>> AbstractByteBuf.lllIlIIIllllll[1])) {
            this.setBytes(AbstractByteBuf.lllIlIIIllllll[0], this, this.readerIndex, this.writerIndex - this.readerIndex);
            "".length();
            this.writerIndex -= this.readerIndex;
            this.adjustMarkers(this.readerIndex);
            this.readerIndex = AbstractByteBuf.lllIlIIIllllll[0];
        }
        return this;
    }
    
    protected final void ensureAccessible() {
        if (lIlIIIIlllllIlll(this.refCnt())) {
            throw new IllegalReferenceCountException(AbstractByteBuf.lllIlIIIllllll[0]);
        }
    }
    
    @Override
    public ByteBuffer nioBuffer() {
        return this.nioBuffer(this.readerIndex, this.readableBytes());
    }
    
    @Override
    public String toString() {
        if (lIlIIIIlllllIlll(this.refCnt())) {
            return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[23]]));
        }
        final StringBuilder llllllllllllIlIlllIIIIIlllIllllI = new StringBuilder();
        llllllllllllIlIlllIIIIIlllIllllI.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIlIlllIIIIIlllIllllI.append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[24]]);
        "".length();
        llllllllllllIlIlllIIIIIlllIllllI.append(this.readerIndex);
        "".length();
        llllllllllllIlIlllIIIIIlllIllllI.append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[25]]);
        "".length();
        llllllllllllIlIlllIIIIIlllIllllI.append(this.writerIndex);
        "".length();
        llllllllllllIlIlllIIIIIlllIllllI.append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[26]]);
        "".length();
        llllllllllllIlIlllIIIIIlllIllllI.append(this.capacity());
        "".length();
        if (lIlIIIIllllllIII(this.maxCapacity, AbstractByteBuf.lllIlIIIllllll[27])) {
            llllllllllllIlIlllIIIIIlllIllllI.append((char)AbstractByteBuf.lllIlIIIllllll[28]);
            "".length();
            llllllllllllIlIlllIIIIIlllIllllI.append(this.maxCapacity);
            "".length();
        }
        final ByteBuf llllllllllllIlIlllIIIIIlllIlllIl = this.unwrap();
        if (lIlIIIIlllllllll(llllllllllllIlIlllIIIIIlllIlllIl)) {
            llllllllllllIlIlllIIIIIlllIllllI.append(AbstractByteBuf.lllIlIIIlIlllI[AbstractByteBuf.lllIlIIIllllll[29]]);
            "".length();
            llllllllllllIlIlllIIIIIlllIllllI.append(llllllllllllIlIlllIIIIIlllIlllIl);
            "".length();
        }
        llllllllllllIlIlllIIIIIlllIllllI.append((char)AbstractByteBuf.lllIlIIIllllll[30]);
        "".length();
        return String.valueOf(llllllllllllIlIlllIIIIIlllIllllI);
    }
    
    @Override
    public int writableBytes() {
        return this.capacity() - this.writerIndex;
    }
    
    private static boolean lIlIIIIlllllIIll(final int llllllllllllIlIlllIIIIIlIlIIlIIl) {
        return llllllllllllIlIlllIIIIIlIlIIlIIl >= 0;
    }
    
    @Override
    public int writeBytes(final InputStream llllllllllllIlIlllIIIIlIllIIIlII, final int llllllllllllIlIlllIIIIlIllIIIIll) throws IOException {
        this.ensureAccessible();
        this.ensureWritable(llllllllllllIlIlllIIIIlIllIIIIll);
        "".length();
        final int llllllllllllIlIlllIIIIlIllIIIIlI = this.setBytes(this.writerIndex, llllllllllllIlIlllIIIIlIllIIIlII, llllllllllllIlIlllIIIIlIllIIIIll);
        if (lIlIIIIllllllllI(llllllllllllIlIlllIIIIlIllIIIIlI)) {
            this.writerIndex += llllllllllllIlIlllIIIIlIllIIIIlI;
        }
        return llllllllllllIlIlllIIIIlIllIIIIlI;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlIlllIIIIllllllllll, final byte[] llllllllllllIlIlllIIIlIIIIIIIIIl) {
        this.setBytes(llllllllllllIlIlllIIIIllllllllll, llllllllllllIlIlllIIIlIIIIIIIIIl, AbstractByteBuf.lllIlIIIllllll[0], llllllllllllIlIlllIIIlIIIIIIIIIl.length);
        "".length();
        return this;
    }
    
    private int calculateNewCapacity(final int llllllllllllIlIlllIIIlIIllIlIllI) {
        final int llllllllllllIlIlllIIIlIIllIllIlI = this.maxCapacity;
        final int llllllllllllIlIlllIIIlIIllIllIIl = AbstractByteBuf.lllIlIIIllllll[8];
        if (lIlIIIIllllllIIl(llllllllllllIlIlllIIIlIIllIlIllI, AbstractByteBuf.lllIlIIIllllll[8])) {
            return AbstractByteBuf.lllIlIIIllllll[8];
        }
        if (lIlIIIIlllllIlII(llllllllllllIlIlllIIIlIIllIlIllI, AbstractByteBuf.lllIlIIIllllll[8])) {
            int llllllllllllIlIlllIIIlIIllIlllIl = llllllllllllIlIlllIIIlIIllIlIllI / AbstractByteBuf.lllIlIIIllllll[8] * AbstractByteBuf.lllIlIIIllllll[8];
            if (lIlIIIIlllllIlII(llllllllllllIlIlllIIIlIIllIlllIl, llllllllllllIlIlllIIIlIIllIllIlI - AbstractByteBuf.lllIlIIIllllll[8])) {
                llllllllllllIlIlllIIIlIIllIlllIl = llllllllllllIlIlllIIIlIIllIllIlI;
                "".length();
                if (-"   ".length() > 0) {
                    return (0xAA ^ 0x89 ^ (0x5A ^ 0x67)) & (0x2D ^ 0x7F ^ (0xD0 ^ 0x9C) ^ -" ".length());
                }
            }
            else {
                llllllllllllIlIlllIIIlIIllIlllIl += AbstractByteBuf.lllIlIIIllllll[8];
            }
            return llllllllllllIlIlllIIIlIIllIlllIl;
        }
        int llllllllllllIlIlllIIIlIIllIllIII = AbstractByteBuf.lllIlIIIllllll[9];
        while (lIlIIIIllllllIll(llllllllllllIlIlllIIIlIIllIllIII, llllllllllllIlIlllIIIlIIllIlIllI)) {
            llllllllllllIlIlllIIIlIIllIllIII <<= AbstractByteBuf.lllIlIIIllllll[1];
            "".length();
            if ("  ".length() < 0) {
                return (0xB0 ^ 0xB5) & ~(0x35 ^ 0x30);
            }
        }
        return Math.min(llllllllllllIlIlllIIIlIIllIllIII, llllllllllllIlIlllIIIlIIllIllIlI);
    }
    
    @Override
    public ByteBuf writeBytes(final ByteBuf llllllllllllIlIlllIIIIlIllIllIIl, final int llllllllllllIlIlllIIIIlIllIlIlII, final int llllllllllllIlIlllIIIIlIllIlIIll) {
        this.ensureAccessible();
        this.ensureWritable(llllllllllllIlIlllIIIIlIllIlIIll);
        "".length();
        this.setBytes(this.writerIndex, llllllllllllIlIlllIIIIlIllIllIIl, llllllllllllIlIlllIIIIlIllIlIlII, llllllllllllIlIlllIIIIlIllIlIIll);
        "".length();
        this.writerIndex += llllllllllllIlIlllIIIIlIllIlIIll;
        return this;
    }
    
    @Override
    public String toString(final Charset llllllllllllIlIlllIIIIlIlIIIIIll) {
        return this.toString(this.readerIndex, this.readableBytes(), llllllllllllIlIlllIIIIlIlIIIIIll);
    }
    
    protected abstract void _setLong(final int p0, final long p1);
    
    @Override
    public int getMedium(final int llllllllllllIlIlllIIIlIIlIIllllI) {
        int llllllllllllIlIlllIIIlIIlIIlllIl = this.getUnsignedMedium(llllllllllllIlIlllIIIlIIlIIllllI);
        if (lIlIIIIllllllIlI(llllllllllllIlIlllIIIlIIlIIlllIl & AbstractByteBuf.lllIlIIIllllll[13])) {
            llllllllllllIlIlllIIIlIIlIIlllIl |= AbstractByteBuf.lllIlIIIllllll[14];
        }
        return llllllllllllIlIlllIIIlIIlIIlllIl;
    }
}
