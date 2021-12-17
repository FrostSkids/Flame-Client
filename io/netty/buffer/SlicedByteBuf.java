// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ScatteringByteChannel;
import java.nio.ByteOrder;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.channels.GatheringByteChannel;

public class SlicedByteBuf extends AbstractDerivedByteBuf
{
    private static final /* synthetic */ int[] llIIlIlIlIIlII;
    private final /* synthetic */ int adjustment;
    private static final /* synthetic */ String[] llIIlIlIlIIIll;
    private final /* synthetic */ int length;
    private final /* synthetic */ ByteBuf buffer;
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlllIIIllIlllIIIllII, final byte[] llllllllllllIlllIIIllIlllIIIlIll, final int llllllllllllIlllIIIllIlllIIIlIlI, final int llllllllllllIlllIIIllIlllIIIlIIl) {
        this.checkIndex(llllllllllllIlllIIIllIlllIIIllII, llllllllllllIlllIIIllIlllIIIlIIl);
        this.buffer.setBytes(llllllllllllIlllIIIllIlllIIIllII + this.adjustment, llllllllllllIlllIIIllIlllIIIlIll, llllllllllllIlllIIIllIlllIIIlIlI, llllllllllllIlllIIIllIlllIIIlIIl);
        "".length();
        return this;
    }
    
    @Override
    protected int _getUnsignedMedium(final int llllllllllllIlllIIIlllIIIIIlIIII) {
        return this.buffer.getUnsignedMedium(llllllllllllIlllIIIlllIIIIIlIIII + this.adjustment);
    }
    
    @Override
    public int getBytes(final int llllllllllllIlllIIIllIllIlIlllll, final GatheringByteChannel llllllllllllIlllIIIllIllIlIllIlI, final int llllllllllllIlllIIIllIllIlIllIIl) throws IOException {
        this.checkIndex(llllllllllllIlllIIIllIllIlIlllll, llllllllllllIlllIIIllIllIlIllIIl);
        return this.buffer.getBytes(llllllllllllIlllIIIllIllIlIlllll + this.adjustment, llllllllllllIlllIIIllIllIlIllIlI, llllllllllllIlllIIIllIllIlIllIIl);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlllIIIllIlllllIIlIl, final ByteBuf llllllllllllIlllIIIllIllllIlllll, final int llllllllllllIlllIIIllIllllIllllI, final int llllllllllllIlllIIIllIllllIlllIl) {
        this.checkIndex(llllllllllllIlllIIIllIlllllIIlIl, llllllllllllIlllIIIllIllllIlllIl);
        this.buffer.getBytes(llllllllllllIlllIIIllIlllllIIlIl + this.adjustment, llllllllllllIlllIIIllIllllIlllll, llllllllllllIlllIIIllIllllIllllI, llllllllllllIlllIIIllIllllIlllIl);
        "".length();
        return this;
    }
    
    private static boolean lIIIllIlIIlIIlII(final int llllllllllllIlllIIIllIlIlllIlIlI) {
        return llllllllllllIlllIIIllIlIlllIlIlI >= 0;
    }
    
    @Override
    public ByteBuf capacity(final int llllllllllllIlllIIIlllIIIIllIIIl) {
        throw new UnsupportedOperationException(SlicedByteBuf.llIIlIlIlIIIll[SlicedByteBuf.llIIlIlIlIIlII[3]]);
    }
    
    @Override
    protected void _setShort(final int llllllllllllIlllIIIllIlllIllIlll, final int llllllllllllIlllIIIllIlllIllIllI) {
        this.buffer.setShort(llllllllllllIlllIIIllIlllIllIlll + this.adjustment, llllllllllllIlllIIIllIlllIllIllI);
        "".length();
    }
    
    @Override
    public ByteBuf copy(final int llllllllllllIlllIIIllIllllllIllI, final int llllllllllllIlllIIIllIlllllllIII) {
        this.checkIndex(llllllllllllIlllIIIllIllllllIllI, llllllllllllIlllIIIllIlllllllIII);
        return this.buffer.copy(llllllllllllIlllIIIllIllllllIllI + this.adjustment, llllllllllllIlllIIIllIlllllllIII);
    }
    
    @Override
    protected short _getShort(final int llllllllllllIlllIIIlllIIIIIllIII) {
        return this.buffer.getShort(llllllllllllIlllIIIlllIIIIIllIII + this.adjustment);
    }
    
    @Override
    public ByteBuffer internalNioBuffer(final int llllllllllllIlllIIIllIllIIlIIlll, final int llllllllllllIlllIIIllIllIIlIIIll) {
        this.checkIndex(llllllllllllIlllIIIllIllIIlIIlll, llllllllllllIlllIIIllIllIIlIIIll);
        return this.nioBuffer(llllllllllllIlllIIIllIllIIlIIlll, llllllllllllIlllIIIllIllIIlIIIll);
    }
    
    @Override
    public boolean hasMemoryAddress() {
        return this.buffer.hasMemoryAddress();
    }
    
    @Override
    public long memoryAddress() {
        return this.buffer.memoryAddress() + this.adjustment;
    }
    
    private static String lIIIllIlIIlIIIIl(final String llllllllllllIlllIIIllIlIllllllIl, final String llllllllllllIlllIIIllIlIllllllII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIllIllIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIllIlIllllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIllIlIllllllll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIllIlIllllllll.init(SlicedByteBuf.llIIlIlIlIIlII[3], llllllllllllIlllIIIllIllIIIIIIII);
            return new String(llllllllllllIlllIIIllIlIllllllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIllIlIllllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIllIlIlllllllI) {
            llllllllllllIlllIIIllIlIlllllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteOrder order() {
        return this.buffer.order();
    }
    
    private static void lIIIllIlIIlIIIlI() {
        (llIIlIlIlIIIll = new String[SlicedByteBuf.llIIlIlIlIIlII[5]])[SlicedByteBuf.llIIlIlIlIIlII[0]] = lIIIllIlIIlIIIIl("nieWSV8YWxA=", "vqckD");
        SlicedByteBuf.llIIlIlIlIIIll[SlicedByteBuf.llIIlIlIlIIlII[1]] = lIIIllIlIIlIIIIl("GaNLh9XIeMA=", "WFtdb");
        SlicedByteBuf.llIIlIlIlIIIll[SlicedByteBuf.llIIlIlIlIIlII[3]] = lIIIllIlIIlIIIIl("hpJko4glBAkqbjcudqR2ZQ==", "FfURT");
    }
    
    @Override
    public ByteBuf duplicate() {
        final ByteBuf llllllllllllIlllIIIlllIIIIIIIIII = this.buffer.slice(this.adjustment, this.length);
        llllllllllllIlllIIIlllIIIIIIIIII.setIndex(this.readerIndex(), this.writerIndex());
        "".length();
        return llllllllllllIlllIIIlllIIIIIIIIII;
    }
    
    private static boolean lIIIllIlIIlIIllI(final int llllllllllllIlllIIIllIlIlllIlllI) {
        return llllllllllllIlllIIIllIlIlllIlllI != 0;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlllIIIllIllIlllllIl, final ByteBuf llllllllllllIlllIIIllIlllIIIIIIl, final int llllllllllllIlllIIIllIlllIIIIIII, final int llllllllllllIlllIIIllIllIllllIlI) {
        this.checkIndex(llllllllllllIlllIIIllIllIlllllIl, llllllllllllIlllIIIllIllIllllIlI);
        this.buffer.setBytes(llllllllllllIlllIIIllIllIlllllIl + this.adjustment, llllllllllllIlllIIIllIlllIIIIIIl, llllllllllllIlllIIIllIlllIIIIIII, llllllllllllIlllIIIllIllIllllIlI);
        "".length();
        return this;
    }
    
    @Override
    protected void _setMedium(final int llllllllllllIlllIIIllIlllIlIlllI, final int llllllllllllIlllIIIllIlllIlIllIl) {
        this.buffer.setMedium(llllllllllllIlllIIIllIlllIlIlllI + this.adjustment, llllllllllllIlllIIIllIlllIlIllIl);
        "".length();
    }
    
    private static boolean lIIIllIlIIlIIlIl(final int llllllllllllIlllIIIllIlIllllIIIl, final int llllllllllllIlllIIIllIlIllllIIII) {
        return llllllllllllIlllIIIllIlIllllIIIl > llllllllllllIlllIIIllIlIllllIIII;
    }
    
    @Override
    public ByteBuf setBytes(final int llllllllllllIlllIIIllIllIlllIIlI, final ByteBuffer llllllllllllIlllIIIllIllIlllIIIl) {
        this.checkIndex(llllllllllllIlllIIIllIllIlllIIlI, llllllllllllIlllIIIllIllIlllIIIl.remaining());
        this.buffer.setBytes(llllllllllllIlllIIIllIllIlllIIlI + this.adjustment, llllllllllllIlllIIIllIllIlllIIIl);
        "".length();
        return this;
    }
    
    @Override
    public int arrayOffset() {
        return this.buffer.arrayOffset() + this.adjustment;
    }
    
    private static void lIIIllIlIIlIIIll() {
        (llIIlIlIlIIlII = new int[6])[0] = ((0xBC ^ 0x81) & ~(0xA0 ^ 0x9D));
        SlicedByteBuf.llIIlIlIlIIlII[1] = " ".length();
        SlicedByteBuf.llIIlIlIlIIlII[2] = (28 + 78 - 55 + 80 ^ 155 + 78 - 95 + 32);
        SlicedByteBuf.llIIlIlIlIIlII[3] = "  ".length();
        SlicedByteBuf.llIIlIlIlIIlII[4] = -" ".length();
        SlicedByteBuf.llIIlIlIlIIlII[5] = "   ".length();
    }
    
    @Override
    public ByteBuf slice(final int llllllllllllIlllIIIllIllllllIIII, final int llllllllllllIlllIIIllIlllllIllll) {
        this.checkIndex(llllllllllllIlllIIIllIllllllIIII, llllllllllllIlllIIIllIlllllIllll);
        if (lIIIllIlIIlIIlll(llllllllllllIlllIIIllIlllllIllll)) {
            return Unpooled.EMPTY_BUFFER;
        }
        return this.buffer.slice(llllllllllllIlllIIIllIllllllIIII + this.adjustment, llllllllllllIlllIIIllIlllllIllll);
    }
    
    @Override
    protected long _getLong(final int llllllllllllIlllIIIlllIIIIIIIlII) {
        return this.buffer.getLong(llllllllllllIlllIIIlllIIIIIIIlII + this.adjustment);
    }
    
    public SlicedByteBuf(final ByteBuf llllllllllllIlllIIIlllIIIlIIIlII, final int llllllllllllIlllIIIlllIIIlIIIlll, final int llllllllllllIlllIIIlllIIIlIIIIlI) {
        super(llllllllllllIlllIIIlllIIIlIIIIlI);
        if (!lIIIllIlIIlIIlII(llllllllllllIlllIIIlllIIIlIIIlll) || lIIIllIlIIlIIlIl(llllllllllllIlllIIIlllIIIlIIIlll, llllllllllllIlllIIIlllIIIlIIIlII.capacity() - llllllllllllIlllIIIlllIIIlIIIIlI)) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(llllllllllllIlllIIIlllIIIlIIIlII).append(SlicedByteBuf.llIIlIlIlIIIll[SlicedByteBuf.llIIlIlIlIIlII[0]]).append(llllllllllllIlllIIIlllIIIlIIIlll).append(SlicedByteBuf.llIIlIlIlIIIll[SlicedByteBuf.llIIlIlIlIIlII[1]]).append(llllllllllllIlllIIIlllIIIlIIIIlI).append((char)SlicedByteBuf.llIIlIlIlIIlII[2])));
        }
        if (lIIIllIlIIlIIllI((llllllllllllIlllIIIlllIIIlIIIlII instanceof SlicedByteBuf) ? 1 : 0)) {
            this.buffer = ((SlicedByteBuf)llllllllllllIlllIIIlllIIIlIIIlII).buffer;
            this.adjustment = ((SlicedByteBuf)llllllllllllIlllIIIlllIIIlIIIlII).adjustment + llllllllllllIlllIIIlllIIIlIIIlll;
            "".length();
            if (-" ".length() > "  ".length()) {
                throw null;
            }
        }
        else if (lIIIllIlIIlIIllI((llllllllllllIlllIIIlllIIIlIIIlII instanceof DuplicatedByteBuf) ? 1 : 0)) {
            this.buffer = llllllllllllIlllIIIlllIIIlIIIlII.unwrap();
            this.adjustment = llllllllllllIlllIIIlllIIIlIIIlll;
            "".length();
            if ("  ".length() < 0) {
                throw null;
            }
        }
        else {
            this.buffer = llllllllllllIlllIIIlllIIIlIIIlII;
            this.adjustment = llllllllllllIlllIIIlllIIIlIIIlll;
        }
        this.length = llllllllllllIlllIIIlllIIIlIIIIlI;
        this.writerIndex(llllllllllllIlllIIIlllIIIlIIIIlI);
        "".length();
    }
    
    @Override
    public int capacity() {
        return this.length;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlllIIIllIllllIlIllI, final byte[] llllllllllllIlllIIIllIllllIlIlIl, final int llllllllllllIlllIIIllIllllIlIlII, final int llllllllllllIlllIIIllIllllIlIIll) {
        this.checkIndex(llllllllllllIlllIIIllIllllIlIllI, llllllllllllIlllIIIllIllllIlIIll);
        this.buffer.getBytes(llllllllllllIlllIIIllIllllIlIllI + this.adjustment, llllllllllllIlllIIIllIllllIlIlIl, llllllllllllIlllIIIllIllllIlIlII, llllllllllllIlllIIIllIllllIlIIll);
        "".length();
        return this;
    }
    
    @Override
    protected int _getInt(final int llllllllllllIlllIIIlllIIIIIIlIlI) {
        return this.buffer.getInt(llllllllllllIlllIIIlllIIIIIIlIlI + this.adjustment);
    }
    
    @Override
    protected void _setByte(final int llllllllllllIlllIIIllIllllIIIIII, final int llllllllllllIlllIIIllIlllIllllII) {
        this.buffer.setByte(llllllllllllIlllIIIllIllllIIIIII + this.adjustment, llllllllllllIlllIIIllIlllIllllII);
        "".length();
    }
    
    @Override
    protected void _setInt(final int llllllllllllIlllIIIllIlllIlIIlIl, final int llllllllllllIlllIIIllIlllIlIIlII) {
        this.buffer.setInt(llllllllllllIlllIIIllIlllIlIIlIl + this.adjustment, llllllllllllIlllIIIllIlllIlIIlII);
        "".length();
    }
    
    @Override
    public int setBytes(final int llllllllllllIlllIIIllIllIlIIIIll, final ScatteringByteChannel llllllllllllIlllIIIllIllIlIIIllI, final int llllllllllllIlllIIIllIllIlIIIlIl) throws IOException {
        this.checkIndex(llllllllllllIlllIIIllIllIlIIIIll, llllllllllllIlllIIIllIllIlIIIlIl);
        return this.buffer.setBytes(llllllllllllIlllIIIllIllIlIIIIll + this.adjustment, llllllllllllIlllIIIllIllIlIIIllI, llllllllllllIlllIIIllIllIlIIIlIl);
    }
    
    @Override
    public int nioBufferCount() {
        return this.buffer.nioBufferCount();
    }
    
    @Override
    public boolean isDirect() {
        return this.buffer.isDirect();
    }
    
    @Override
    protected void _setLong(final int llllllllllllIlllIIIllIlllIIllIIl, final long llllllllllllIlllIIIllIlllIIllIll) {
        this.buffer.setLong(llllllllllllIlllIIIllIlllIIllIIl + this.adjustment, llllllllllllIlllIIIllIlllIIllIll);
        "".length();
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlllIIIllIllIllIlIll, final OutputStream llllllllllllIlllIIIllIllIllIlIlI, final int llllllllllllIlllIIIllIllIllIIlIl) throws IOException {
        this.checkIndex(llllllllllllIlllIIIllIllIllIlIll, llllllllllllIlllIIIllIllIllIIlIl);
        this.buffer.getBytes(llllllllllllIlllIIIllIllIllIlIll + this.adjustment, llllllllllllIlllIIIllIllIllIlIlI, llllllllllllIlllIIIllIllIllIIlIl);
        "".length();
        return this;
    }
    
    @Override
    public ByteBufAllocator alloc() {
        return this.buffer.alloc();
    }
    
    @Override
    public ByteBuffer[] nioBuffers(final int llllllllllllIlllIIIllIllIIlIllIl, final int llllllllllllIlllIIIllIllIIlIllII) {
        this.checkIndex(llllllllllllIlllIIIllIllIIlIllIl, llllllllllllIlllIIIllIllIIlIllII);
        return this.buffer.nioBuffers(llllllllllllIlllIIIllIllIIlIllIl + this.adjustment, llllllllllllIlllIIIllIllIIlIllII);
    }
    
    @Override
    protected byte _getByte(final int llllllllllllIlllIIIlllIIIIIllllI) {
        return this.buffer.getByte(llllllllllllIlllIIIlllIIIIIllllI + this.adjustment);
    }
    
    private static boolean lIIIllIlIIlIIlll(final int llllllllllllIlllIIIllIlIlllIllII) {
        return llllllllllllIlllIIIllIlIlllIllII == 0;
    }
    
    private static boolean lIIIllIlIIlIlIII(final int llllllllllllIlllIIIllIlIllllIlIl, final int llllllllllllIlllIIIllIlIllllIlII) {
        return llllllllllllIlllIIIllIlIllllIlIl >= llllllllllllIlllIIIllIlIllllIlII;
    }
    
    @Override
    public int setBytes(final int llllllllllllIlllIIIllIllIlIlIIll, final InputStream llllllllllllIlllIIIllIllIlIlIIlI, final int llllllllllllIlllIIIllIllIlIIllIl) throws IOException {
        this.checkIndex(llllllllllllIlllIIIllIllIlIlIIll, llllllllllllIlllIIIllIllIlIIllIl);
        return this.buffer.setBytes(llllllllllllIlllIIIllIllIlIlIIll + this.adjustment, llllllllllllIlllIIIllIllIlIlIIlI, llllllllllllIlllIIIllIllIlIIllIl);
    }
    
    @Override
    public ByteBuf unwrap() {
        return this.buffer;
    }
    
    @Override
    public ByteBuffer nioBuffer(final int llllllllllllIlllIIIllIllIIllIllI, final int llllllllllllIlllIIIllIllIIlllIII) {
        this.checkIndex(llllllllllllIlllIIIllIllIIllIllI, llllllllllllIlllIIIllIllIIlllIII);
        return this.buffer.nioBuffer(llllllllllllIlllIIIllIllIIllIllI + this.adjustment, llllllllllllIlllIIIllIllIIlllIII);
    }
    
    @Override
    public int forEachByte(final int llllllllllllIlllIIIllIllIIIlIlll, final int llllllllllllIlllIIIllIllIIIlIllI, final ByteBufProcessor llllllllllllIlllIIIllIllIIIllIlI) {
        final int llllllllllllIlllIIIllIllIIIllIIl = this.buffer.forEachByte(llllllllllllIlllIIIllIllIIIlIlll + this.adjustment, llllllllllllIlllIIIllIllIIIlIllI, llllllllllllIlllIIIllIllIIIllIlI);
        if (lIIIllIlIIlIlIII(llllllllllllIlllIIIllIllIIIllIIl, this.adjustment)) {
            return llllllllllllIlllIIIllIllIIIllIIl - this.adjustment;
        }
        return SlicedByteBuf.llIIlIlIlIIlII[4];
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIlllIIIllIllllIIlIIl, final ByteBuffer llllllllllllIlllIIIllIllllIIIlIl) {
        this.checkIndex(llllllllllllIlllIIIllIllllIIlIIl, llllllllllllIlllIIIllIllllIIIlIl.remaining());
        this.buffer.getBytes(llllllllllllIlllIIIllIllllIIlIIl + this.adjustment, llllllllllllIlllIIIllIllllIIIlIl);
        "".length();
        return this;
    }
    
    @Override
    public boolean hasArray() {
        return this.buffer.hasArray();
    }
    
    @Override
    public int forEachByteDesc(final int llllllllllllIlllIIIllIllIIIIllIl, final int llllllllllllIlllIIIllIllIIIIllII, final ByteBufProcessor llllllllllllIlllIIIllIllIIIIlIll) {
        final int llllllllllllIlllIIIllIllIIIIlIlI = this.buffer.forEachByteDesc(llllllllllllIlllIIIllIllIIIIllIl + this.adjustment, llllllllllllIlllIIIllIllIIIIllII, llllllllllllIlllIIIllIllIIIIlIll);
        if (lIIIllIlIIlIlIII(llllllllllllIlllIIIllIllIIIIlIlI, this.adjustment)) {
            return llllllllllllIlllIIIllIllIIIIlIlI - this.adjustment;
        }
        return SlicedByteBuf.llIIlIlIlIIlII[4];
    }
    
    static {
        lIIIllIlIIlIIIll();
        lIIIllIlIIlIIIlI();
    }
    
    @Override
    public byte[] array() {
        return this.buffer.array();
    }
}
