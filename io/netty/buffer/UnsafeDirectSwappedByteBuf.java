// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.ByteOrder;
import io.netty.util.internal.PlatformDependent;

final class UnsafeDirectSwappedByteBuf extends SwappedByteBuf
{
    private static final /* synthetic */ boolean NATIVE_ORDER;
    private final /* synthetic */ AbstractByteBuf wrapped;
    private final /* synthetic */ boolean nativeByteOrder;
    private static final /* synthetic */ int[] lllIIIIlllllIl;
    
    @Override
    public ByteBuf writeChar(final int llllllllllllIllIIIIIlllIlIllllIl) {
        this.writeShort(llllllllllllIllIIIIIlllIlIllllIl);
        "".length();
        return this;
    }
    
    @Override
    public short getShort(final int llllllllllllIllIIIIIllllIIIIllIl) {
        this.wrapped.checkIndex(llllllllllllIllIIIIIllllIIIIllIl, UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[5]);
        final short llllllllllllIllIIIIIllllIIIIllII = PlatformDependent.getShort(this.addr(llllllllllllIllIIIIIllllIIIIllIl));
        short reverseBytes;
        if (lIIlllIlIIIIlIll(this.nativeByteOrder ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIIIIllllIIIIllII;
            "".length();
            if (-" ".length() > "  ".length()) {
                return (short)((0x43 ^ 0x52 ^ (0x2B ^ 0xD)) & (0x62 ^ 0x68 ^ (0x75 ^ 0x48) ^ -" ".length()));
            }
        }
        else {
            reverseBytes = Short.reverseBytes(llllllllllllIllIIIIIllllIIIIllII);
        }
        return reverseBytes;
    }
    
    @Override
    public ByteBuf writeDouble(final double llllllllllllIllIIIIIlllIlIlIllll) {
        this.writeLong(Double.doubleToRawLongBits(llllllllllllIllIIIIIlllIlIlIllll));
        "".length();
        return this;
    }
    
    @Override
    public ByteBuf setChar(final int llllllllllllIllIIIIIlllIlllIIllI, final int llllllllllllIllIIIIIlllIlllIIlIl) {
        this.setShort(llllllllllllIllIIIIIlllIlllIIllI, llllllllllllIllIIIIIlllIlllIIlIl);
        "".length();
        return this;
    }
    
    @Override
    public double getDouble(final int llllllllllllIllIIIIIllllIIlIllll) {
        return Double.longBitsToDouble(this.getLong(llllllllllllIllIIIIIllllIIlIllll));
    }
    
    private static boolean lIIlllIlIIIIlIII(final Object llllllllllllIllIIIIIlllIlIIIllIl, final Object llllllllllllIllIIIIIlllIlIIIllII) {
        return llllllllllllIllIIIIIlllIlIIIllIl == llllllllllllIllIIIIIlllIlIIIllII;
    }
    
    @Override
    public ByteBuf setLong(final int llllllllllllIllIIIIIlllIllllIIlI, final long llllllllllllIllIIIIIlllIlllIlllI) {
        this.wrapped.checkIndex(llllllllllllIllIIIIIlllIllllIIlI, UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[2]);
        this._setLong(llllllllllllIllIIIIIlllIllllIIlI, llllllllllllIllIIIIIlllIlllIlllI);
        return this;
    }
    
    @Override
    public ByteBuf writeShort(final int llllllllllllIllIIIIIlllIllIIllll) {
        this.wrapped.ensureAccessible();
        this.wrapped.ensureWritable(UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[5]);
        "".length();
        this._setShort(this.wrapped.writerIndex, llllllllllllIllIIIIIlllIllIIllll);
        final AbstractByteBuf wrapped = this.wrapped;
        wrapped.writerIndex += UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[5];
        return this;
    }
    
    private void _setShort(final int llllllllllllIllIIIIIlllIlIlIIlll, final int llllllllllllIllIIIIIlllIlIlIIllI) {
        final long addr = this.addr(llllllllllllIllIIIIIlllIlIlIIlll);
        short reverseBytes;
        if (lIIlllIlIIIIlIll(this.nativeByteOrder ? 1 : 0)) {
            reverseBytes = (short)llllllllllllIllIIIIIlllIlIlIIllI;
            "".length();
            if ((0x46 ^ 0x4C ^ (0x83 ^ 0x8D)) < 0) {
                return;
            }
        }
        else {
            reverseBytes = Short.reverseBytes((short)llllllllllllIllIIIIIlllIlIlIIllI);
        }
        PlatformDependent.putShort(addr, reverseBytes);
    }
    
    private static boolean lIIlllIlIIIIlIll(final int llllllllllllIllIIIIIlllIlIIIlIlI) {
        return llllllllllllIllIIIIIlllIlIIIlIlI != 0;
    }
    
    @Override
    public ByteBuf setShort(final int llllllllllllIllIIIIIllllIIIIIlII, final int llllllllllllIllIIIIIllllIIIIIIII) {
        this.wrapped.checkIndex(llllllllllllIllIIIIIllllIIIIIlII, UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[5]);
        this._setShort(llllllllllllIllIIIIIllllIIIIIlII, llllllllllllIllIIIIIllllIIIIIIII);
        return this;
    }
    
    @Override
    public long getLong(final int llllllllllllIllIIIIIllllIIlllIlI) {
        this.wrapped.checkIndex(llllllllllllIllIIIIIllllIIlllIlI, UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[2]);
        final long llllllllllllIllIIIIIllllIIllllII = PlatformDependent.getLong(this.addr(llllllllllllIllIIIIIllllIIlllIlI));
        long reverseBytes;
        if (lIIlllIlIIIIlIll(this.nativeByteOrder ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIIIIllllIIllllII;
            "".length();
            if ((0x88 ^ 0xAC ^ (0x24 ^ 0x4)) < "  ".length()) {
                return 0L;
            }
        }
        else {
            reverseBytes = Long.reverseBytes(llllllllllllIllIIIIIllllIIllllII);
        }
        return reverseBytes;
    }
    
    @Override
    public float getFloat(final int llllllllllllIllIIIIIllllIIllIlIl) {
        return Float.intBitsToFloat(this.getInt(llllllllllllIllIIIIIllllIIllIlIl));
    }
    
    @Override
    public char getChar(final int llllllllllllIllIIIIIllllIIlIIlll) {
        return (char)this.getShort(llllllllllllIllIIIIIllllIIlIIlll);
    }
    
    @Override
    public int getUnsignedShort(final int llllllllllllIllIIIIIllllIIIlIlII) {
        return this.getShort(llllllllllllIllIIIIIllllIIIlIlII) & UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[4];
    }
    
    @Override
    public ByteBuf writeInt(final int llllllllllllIllIIIIIlllIllIIlIIl) {
        this.wrapped.ensureAccessible();
        this.wrapped.ensureWritable(UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[3]);
        "".length();
        this._setInt(this.wrapped.writerIndex, llllllllllllIllIIIIIlllIllIIlIIl);
        final AbstractByteBuf wrapped = this.wrapped;
        wrapped.writerIndex += UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[3];
        return this;
    }
    
    @Override
    public ByteBuf setInt(final int llllllllllllIllIIIIIlllIlllllIII, final int llllllllllllIllIIIIIlllIlllllIlI) {
        this.wrapped.checkIndex(llllllllllllIllIIIIIlllIlllllIII, UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[3]);
        this._setInt(llllllllllllIllIIIIIlllIlllllIII, llllllllllllIllIIIIIlllIlllllIlI);
        return this;
    }
    
    @Override
    public ByteBuf setFloat(final int llllllllllllIllIIIIIlllIllIlllIl, final float llllllllllllIllIIIIIlllIllIlllII) {
        this.setInt(llllllllllllIllIIIIIlllIllIlllIl, Float.floatToRawIntBits(llllllllllllIllIIIIIlllIllIlllII));
        "".length();
        return this;
    }
    
    UnsafeDirectSwappedByteBuf(final AbstractByteBuf llllllllllllIllIIIIIllllIlIIlIlI) {
        super(llllllllllllIllIIIIIllllIlIIlIlI);
        this.wrapped = llllllllllllIllIIIIIllllIlIIlIlI;
        final int native_ORDER = UnsafeDirectSwappedByteBuf.NATIVE_ORDER ? 1 : 0;
        int llllllllllllIllIIIIIlllIlIIlIIII;
        if (lIIlllIlIIIIlIII(this.order(), ByteOrder.BIG_ENDIAN)) {
            llllllllllllIllIIIIIlllIlIIlIIII = UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[0];
            "".length();
            if (" ".length() < 0) {
                throw null;
            }
        }
        else {
            llllllllllllIllIIIIIlllIlIIlIIII = UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[1];
        }
        int nativeByteOrder;
        if (lIIlllIlIIIIlIIl(native_ORDER, llllllllllllIllIIIIIlllIlIIlIIII)) {
            nativeByteOrder = UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[0];
            "".length();
            if ((0x16 ^ 0x62 ^ (0x24 ^ 0x54)) <= " ".length()) {
                throw null;
            }
        }
        else {
            nativeByteOrder = UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[1];
        }
        this.nativeByteOrder = (nativeByteOrder != 0);
    }
    
    private void _setLong(final int llllllllllllIllIIIIIlllIlIIllIII, final long llllllllllllIllIIIIIlllIlIIlIlII) {
        final long addr = this.addr(llllllllllllIllIIIIIlllIlIIllIII);
        long reverseBytes;
        if (lIIlllIlIIIIlIll(this.nativeByteOrder ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIIIIlllIlIIlIlII;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            reverseBytes = Long.reverseBytes(llllllllllllIllIIIIIlllIlIIlIlII);
        }
        PlatformDependent.putLong(addr, reverseBytes);
    }
    
    static {
        lIIlllIlIIIIIlll();
        int native_ORDER;
        if (lIIlllIlIIIIlIII(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN)) {
            native_ORDER = UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[0];
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            native_ORDER = UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[1];
        }
        NATIVE_ORDER = (native_ORDER != 0);
    }
    
    @Override
    public ByteBuf writeLong(final long llllllllllllIllIIIIIlllIllIIIIIl) {
        this.wrapped.ensureAccessible();
        this.wrapped.ensureWritable(UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[2]);
        "".length();
        this._setLong(this.wrapped.writerIndex, llllllllllllIllIIIIIlllIllIIIIIl);
        final AbstractByteBuf wrapped = this.wrapped;
        wrapped.writerIndex += UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[2];
        return this;
    }
    
    @Override
    public ByteBuf setDouble(final int llllllllllllIllIIIIIlllIllIlIlll, final double llllllllllllIllIIIIIlllIllIlIIll) {
        this.setLong(llllllllllllIllIIIIIlllIllIlIlll, Double.doubleToRawLongBits(llllllllllllIllIIIIIlllIllIlIIll));
        "".length();
        return this;
    }
    
    @Override
    public long getUnsignedInt(final int llllllllllllIllIIIIIllllIIlIIIll) {
        return (long)this.getInt(llllllllllllIllIIIIIllllIIlIIIll) & 0xFFFFFFFFL;
    }
    
    @Override
    public int getInt(final int llllllllllllIllIIIIIllllIIIlllII) {
        this.wrapped.checkIndex(llllllllllllIllIIIIIllllIIIlllII, UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[3]);
        final int llllllllllllIllIIIIIllllIIIllIll = PlatformDependent.getInt(this.addr(llllllllllllIllIIIIIllllIIIlllII));
        int reverseBytes;
        if (lIIlllIlIIIIlIll(this.nativeByteOrder ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIIIIllllIIIllIll;
            "".length();
            if (-"   ".length() > 0) {
                return (0x96 ^ 0x99 ^ (0x7 ^ 0x42)) & (11 + 122 - 8 + 13 ^ 146 + 166 - 265 + 145 ^ -" ".length());
            }
        }
        else {
            reverseBytes = Integer.reverseBytes(llllllllllllIllIIIIIllllIIIllIll);
        }
        return reverseBytes;
    }
    
    private static void lIIlllIlIIIIIlll() {
        (lllIIIIlllllIl = new int[6])[0] = " ".length();
        UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[1] = ((0x49 ^ 0xB ^ (0xD2 ^ 0x8A)) & (82 + 99 - 47 + 53 ^ 53 + 81 - 94 + 121 ^ -" ".length()));
        UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[2] = (0xD ^ 0x3D ^ (0x39 ^ 0x1));
        UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[3] = (0x9D ^ 0x99);
        UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[4] = (-1 & 0xFFFF);
        UnsafeDirectSwappedByteBuf.lllIIIIlllllIl[5] = "  ".length();
    }
    
    private static boolean lIIlllIlIIIIlIIl(final int llllllllllllIllIIIIIlllIlIIlIIIl, final int llllllllllllIllIIIIIlllIlIIlIIII) {
        return llllllllllllIllIIIIIlllIlIIlIIIl == llllllllllllIllIIIIIlllIlIIlIIII;
    }
    
    private void _setInt(final int llllllllllllIllIIIIIlllIlIlIIIIl, final int llllllllllllIllIIIIIlllIlIIlllIl) {
        final long addr = this.addr(llllllllllllIllIIIIIlllIlIlIIIIl);
        int reverseBytes;
        if (lIIlllIlIIIIlIll(this.nativeByteOrder ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIIIIlllIlIIlllIl;
            "".length();
            if (((0x3A ^ 0x2) & ~(0x97 ^ 0xAF)) != 0x0) {
                return;
            }
        }
        else {
            reverseBytes = Integer.reverseBytes(llllllllllllIllIIIIIlllIlIIlllIl);
        }
        PlatformDependent.putInt(addr, reverseBytes);
    }
    
    private long addr(final int llllllllllllIllIIIIIllllIlIIIlII) {
        return this.wrapped.memoryAddress() + llllllllllllIllIIIIIllllIlIIIlII;
    }
    
    @Override
    public ByteBuf writeFloat(final float llllllllllllIllIIIIIlllIlIllIlll) {
        this.writeInt(Float.floatToRawIntBits(llllllllllllIllIIIIIlllIlIllIlll));
        "".length();
        return this;
    }
}
