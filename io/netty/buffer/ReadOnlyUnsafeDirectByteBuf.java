// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.nio.ByteOrder;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import io.netty.util.internal.PlatformDependent;

final class ReadOnlyUnsafeDirectByteBuf extends ReadOnlyByteBufferBuf
{
    private static final /* synthetic */ String[] llIlllIlIIlllI;
    private final /* synthetic */ long memoryAddress;
    private static final /* synthetic */ int[] llIlllIlIIllll;
    private static final /* synthetic */ boolean NATIVE_ORDER;
    
    @Override
    protected int _getUnsignedMedium(final int llllllllllllIllIIlIIlIIIlIlIllIl) {
        final long llllllllllllIllIIlIIlIIIlIlIllII = this.addr(llllllllllllIllIIlIIlIIIlIlIllIl);
        return (PlatformDependent.getByte(llllllllllllIllIIlIIlIIIlIlIllII) & ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[0]) << ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[1] | (PlatformDependent.getByte(llllllllllllIllIIlIIlIIIlIlIllII + 1L) & ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[0]) << ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[2] | (PlatformDependent.getByte(llllllllllllIllIIlIIlIIIlIlIllII + 2L) & ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[0]);
    }
    
    @Override
    protected long _getLong(final int llllllllllllIllIIlIIlIIIlIIllIll) {
        final long llllllllllllIllIIlIIlIIIlIIllIlI = PlatformDependent.getLong(this.addr(llllllllllllIllIIlIIlIIIlIIllIll));
        long reverseBytes;
        if (lIIllIIlllIIIlII(ReadOnlyUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIlIIlIIIlIIllIlI;
            "".length();
            if ((108 + 116 - 49 + 0 ^ 62 + 95 - 5 + 18) <= 0) {
                return 0L;
            }
        }
        else {
            reverseBytes = Long.reverseBytes(llllllllllllIllIIlIIlIIIlIIllIlI);
        }
        return reverseBytes;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIlIIlIIIIlllIIlI, final ByteBuffer llllllllllllIllIIlIIlIIIIlllIIIl) {
        this.checkIndex(llllllllllllIllIIlIIlIIIIlllIIlI);
        if (lIIllIIlllIIIlIl(llllllllllllIllIIlIIlIIIIlllIIIl)) {
            throw new NullPointerException(ReadOnlyUnsafeDirectByteBuf.llIlllIlIIlllI[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[7]]);
        }
        final int llllllllllllIllIIlIIlIIIIlllIIII = Math.min(this.capacity() - llllllllllllIllIIlIIlIIIIlllIIlI, llllllllllllIllIIlIIlIIIIlllIIIl.remaining());
        final ByteBuffer llllllllllllIllIIlIIlIIIIllIllll = this.internalNioBuffer();
        llllllllllllIllIIlIIlIIIIllIllll.clear().position(llllllllllllIllIIlIIlIIIIlllIIlI).limit(llllllllllllIllIIlIIlIIIIlllIIlI + llllllllllllIllIIlIIlIIIIlllIIII);
        "".length();
        llllllllllllIllIIlIIlIIIIlllIIIl.put(llllllllllllIllIIlIIlIIIIllIllll);
        "".length();
        return this;
    }
    
    private static boolean lIIllIIlllIIIllI(final int llllllllllllIllIIlIIlIIIIIIlIlII) {
        return llllllllllllIllIIlIIlIIIIIIlIlII >= 0;
    }
    
    private static boolean lIIllIIlllIIIlII(final int llllllllllllIllIIlIIlIIIIIIlIllI) {
        return llllllllllllIllIIlIIlIIIIIIlIllI != 0;
    }
    
    private static void lIIllIIlllIIIIlI() {
        (llIlllIlIIlllI = new String[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[8]])[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[3]] = lIIllIIllIllllll("FyMZ", "sPmLT");
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIlllI[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[4]] = lIIllIIlllIIIIII("vX1pc+M6Alyij1h/t/OQZw==", "ARmcc");
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIlllI[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[5]] = lIIllIIllIllllll("CiUx", "nVEFg");
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIlllI[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[6]] = lIIllIIlllIIIIIl("neyUaKyWBovSiDWcIRj2FGPeqI9vwXivDncDAT/qvwLJRr9UkNTVEzfTNHPFoqFZK5GiNX8Aguc=", "Ljzui");
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIlllI[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[7]] = lIIllIIllIllllll("LjU8", "JFHvJ");
    }
    
    private static boolean lIIllIIlllIIIlIl(final Object llllllllllllIllIIlIIlIIIIIIllIII) {
        return llllllllllllIllIIlIIlIIIIIIllIII == null;
    }
    
    private static boolean lIIllIIlllIIlIII(final Object llllllllllllIllIIlIIlIIIIIIllIll, final Object llllllllllllIllIIlIIlIIIIIIllIlI) {
        return llllllllllllIllIIlIIlIIIIIIllIll == llllllllllllIllIIlIIlIIIIIIllIlI;
    }
    
    private long addr(final int llllllllllllIllIIlIIlIIIIlIllIlI) {
        return this.memoryAddress + llllllllllllIllIIlIIlIIIIlIllIlI;
    }
    
    private static void lIIllIIlllIIIIll() {
        (llIlllIlIIllll = new int[9])[0] = (0x60 ^ 0x44) + (0x47 ^ 0x27) - -(0xB ^ 0x46) + (0xEB ^ 0xC5);
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[1] = (0xAB ^ 0xBB);
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[2] = (0x9D ^ 0x95);
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[3] = ((0xC1 ^ 0x8C ^ (0x8D ^ 0x89)) & (0x27 ^ 0x59 ^ (0x75 ^ 0x42) ^ -" ".length()));
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[4] = " ".length();
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[5] = "  ".length();
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[6] = "   ".length();
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[7] = (0xD9 ^ 0xA5 ^ (0x4 ^ 0x7C));
        ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[8] = (0x2F ^ 0x2A);
    }
    
    @Override
    public ByteBuf copy(final int llllllllllllIllIIlIIlIIIIllIIIII, final int llllllllllllIllIIlIIlIIIIlIlllll) {
        this.checkIndex(llllllllllllIllIIlIIlIIIIllIIIII, llllllllllllIllIIlIIlIIIIlIlllll);
        final ByteBuf llllllllllllIllIIlIIlIIIIllIIIlI = this.alloc().directBuffer(llllllllllllIllIIlIIlIIIIlIlllll, this.maxCapacity());
        if (lIIllIIlllIIIlII(llllllllllllIllIIlIIlIIIIlIlllll)) {
            if (lIIllIIlllIIIlII(llllllllllllIllIIlIIlIIIIllIIIlI.hasMemoryAddress() ? 1 : 0)) {
                PlatformDependent.copyMemory(this.addr(llllllllllllIllIIlIIlIIIIllIIIII), llllllllllllIllIIlIIlIIIIllIIIlI.memoryAddress(), llllllllllllIllIIlIIlIIIIlIlllll);
                llllllllllllIllIIlIIlIIIIllIIIlI.setIndex(ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[3], llllllllllllIllIIlIIlIIIIlIlllll);
                "".length();
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            else {
                llllllllllllIllIIlIIlIIIIllIIIlI.writeBytes(this, llllllllllllIllIIlIIlIIIIllIIIII, llllllllllllIllIIlIIlIIIIlIlllll);
                "".length();
            }
        }
        return llllllllllllIllIIlIIlIIIIllIIIlI;
    }
    
    @Override
    protected byte _getByte(final int llllllllllllIllIIlIIlIIIlIlllIll) {
        return PlatformDependent.getByte(this.addr(llllllllllllIllIIlIIlIIIlIlllIll));
    }
    
    @Override
    protected int _getInt(final int llllllllllllIllIIlIIlIIIlIlIIlII) {
        final int llllllllllllIllIIlIIlIIIlIlIIIll = PlatformDependent.getInt(this.addr(llllllllllllIllIIlIIlIIIlIlIIlII));
        int reverseBytes;
        if (lIIllIIlllIIIlII(ReadOnlyUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIlIIlIIIlIlIIIll;
            "".length();
            if (null != null) {
                return (0x1D ^ 0x25) & ~(0x68 ^ 0x50);
            }
        }
        else {
            reverseBytes = Integer.reverseBytes(llllllllllllIllIIlIIlIIIlIlIIIll);
        }
        return reverseBytes;
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIlIIlIIIIlllllII, final byte[] llllllllllllIllIIlIIlIIIIllllIll, final int llllllllllllIllIIlIIlIIIIllllIlI, final int llllllllllllIllIIlIIlIIIIllllIIl) {
        this.checkIndex(llllllllllllIllIIlIIlIIIIlllllII, llllllllllllIllIIlIIlIIIIllllIIl);
        if (lIIllIIlllIIIlIl(llllllllllllIllIIlIIlIIIIllllIll)) {
            throw new NullPointerException(ReadOnlyUnsafeDirectByteBuf.llIlllIlIIlllI[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[5]]);
        }
        if (!lIIllIIlllIIIllI(llllllllllllIllIIlIIlIIIIllllIlI) || lIIllIIlllIIIlll(llllllllllllIllIIlIIlIIIIllllIlI, llllllllllllIllIIlIIlIIIIllllIll.length - llllllllllllIllIIlIIlIIIIllllIIl)) {
            final String format = ReadOnlyUnsafeDirectByteBuf.llIlllIlIIlllI[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[6]];
            final Object[] args = new Object[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[6]];
            args[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[3]] = llllllllllllIllIIlIIlIIIIllllIlI;
            args[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[4]] = llllllllllllIllIIlIIlIIIIllllIIl;
            args[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[5]] = llllllllllllIllIIlIIlIIIIllllIll.length;
            throw new IndexOutOfBoundsException(String.format(format, args));
        }
        if (lIIllIIlllIIIlII(llllllllllllIllIIlIIlIIIIllllIIl)) {
            PlatformDependent.copyMemory(this.addr(llllllllllllIllIIlIIlIIIIlllllII), llllllllllllIllIIlIIlIIIIllllIll, llllllllllllIllIIlIIlIIIIllllIlI, llllllllllllIllIIlIIlIIIIllllIIl);
        }
        return this;
    }
    
    private static String lIIllIIlllIIIIII(final String llllllllllllIllIIlIIlIIIIIlllIII, final String llllllllllllIllIIlIIlIIIIIllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIlIIIIIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlIIIIIllIlIl.getBytes(StandardCharsets.UTF_8)), ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[2]), "DES");
            final Cipher llllllllllllIllIIlIIlIIIIIlllIlI = Cipher.getInstance("DES");
            llllllllllllIllIIlIIlIIIIIlllIlI.init(ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[5], llllllllllllIllIIlIIlIIIIIlllIll);
            return new String(llllllllllllIllIIlIIlIIIIIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlIIIIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIlIIIIIlllIIl) {
            llllllllllllIllIIlIIlIIIIIlllIIl.printStackTrace();
            return null;
        }
    }
    
    ReadOnlyUnsafeDirectByteBuf(final ByteBufAllocator llllllllllllIllIIlIIlIIIllIIIIlI, final ByteBuffer llllllllllllIllIIlIIlIIIllIIIlII) {
        super(llllllllllllIllIIlIIlIIIllIIIIlI, llllllllllllIllIIlIIlIIIllIIIlII);
        this.memoryAddress = PlatformDependent.directBufferAddress(llllllllllllIllIIlIIlIIIllIIIlII);
    }
    
    @Override
    public ByteBuf getBytes(final int llllllllllllIllIIlIIlIIIlIIIlIll, final ByteBuf llllllllllllIllIIlIIlIIIlIIIlIlI, final int llllllllllllIllIIlIIlIIIlIIIlIIl, final int llllllllllllIllIIlIIlIIIlIIIlIII) {
        this.checkIndex(llllllllllllIllIIlIIlIIIlIIIlIll, llllllllllllIllIIlIIlIIIlIIIlIII);
        if (lIIllIIlllIIIlIl(llllllllllllIllIIlIIlIIIlIIIlIlI)) {
            throw new NullPointerException(ReadOnlyUnsafeDirectByteBuf.llIlllIlIIlllI[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[3]]);
        }
        if (!lIIllIIlllIIIllI(llllllllllllIllIIlIIlIIIlIIIlIIl) || lIIllIIlllIIIlll(llllllllllllIllIIlIIlIIIlIIIlIIl, llllllllllllIllIIlIIlIIIlIIIlIlI.capacity() - llllllllllllIllIIlIIlIIIlIIIlIII)) {
            throw new IndexOutOfBoundsException(String.valueOf(new StringBuilder().append(ReadOnlyUnsafeDirectByteBuf.llIlllIlIIlllI[ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[4]]).append(llllllllllllIllIIlIIlIIIlIIIlIIl)));
        }
        if (lIIllIIlllIIIlII(llllllllllllIllIIlIIlIIIlIIIlIlI.hasMemoryAddress() ? 1 : 0)) {
            PlatformDependent.copyMemory(this.addr(llllllllllllIllIIlIIlIIIlIIIlIll), llllllllllllIllIIlIIlIIIlIIIlIlI.memoryAddress() + llllllllllllIllIIlIIlIIIlIIIlIIl, llllllllllllIllIIlIIlIIIlIIIlIII);
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        else if (lIIllIIlllIIIlII(llllllllllllIllIIlIIlIIIlIIIlIlI.hasArray() ? 1 : 0)) {
            PlatformDependent.copyMemory(this.addr(llllllllllllIllIIlIIlIIIlIIIlIll), llllllllllllIllIIlIIlIIIlIIIlIlI.array(), llllllllllllIllIIlIIlIIIlIIIlIlI.arrayOffset() + llllllllllllIllIIlIIlIIIlIIIlIIl, llllllllllllIllIIlIIlIIIlIIIlIII);
            "".length();
            if (((0x6B ^ 0x3C ^ (0xCF ^ 0xAB)) & (22 + 143 - 92 + 92 ^ 43 + 27 - 66 + 146 ^ -" ".length())) >= (42 + 14 + 9 + 65 ^ 9 + 62 + 62 + 1)) {
                return null;
            }
        }
        else {
            llllllllllllIllIIlIIlIIIlIIIlIlI.setBytes(llllllllllllIllIIlIIlIIIlIIIlIIl, this, llllllllllllIllIIlIIlIIIlIIIlIll, llllllllllllIllIIlIIlIIIlIIIlIII);
            "".length();
        }
        return this;
    }
    
    private static boolean lIIllIIlllIIlIIl(final int llllllllllllIllIIlIIlIIIIIlIIIll, final int llllllllllllIllIIlIIlIIIIIlIIIlI) {
        return llllllllllllIllIIlIIlIIIIIlIIIll < llllllllllllIllIIlIIlIIIIIlIIIlI;
    }
    
    private static String lIIllIIllIllllll(String llllllllllllIllIIlIIlIIIIlIIlIII, final String llllllllllllIllIIlIIlIIIIlIIllII) {
        llllllllllllIllIIlIIlIIIIlIIlIII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIIlIIIIlIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIlIIIIlIIlIll = new StringBuilder();
        final char[] llllllllllllIllIIlIIlIIIIlIIlIlI = llllllllllllIllIIlIIlIIIIlIIllII.toCharArray();
        int llllllllllllIllIIlIIlIIIIlIIlIIl = ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[3];
        final int llllllllllllIllIIlIIlIIIIlIIIIll = (Object)((String)llllllllllllIllIIlIIlIIIIlIIlIII).toCharArray();
        final boolean llllllllllllIllIIlIIlIIIIlIIIIlI = llllllllllllIllIIlIIlIIIIlIIIIll.length != 0;
        Exception llllllllllllIllIIlIIlIIIIlIIIIIl = (Exception)ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[3];
        while (lIIllIIlllIIlIIl((int)llllllllllllIllIIlIIlIIIIlIIIIIl, llllllllllllIllIIlIIlIIIIlIIIIlI ? 1 : 0)) {
            final char llllllllllllIllIIlIIlIIIIlIIlllI = llllllllllllIllIIlIIlIIIIlIIIIll[llllllllllllIllIIlIIlIIIIlIIIIIl];
            llllllllllllIllIIlIIlIIIIlIIlIll.append((char)(llllllllllllIllIIlIIlIIIIlIIlllI ^ llllllllllllIllIIlIIlIIIIlIIlIlI[llllllllllllIllIIlIIlIIIIlIIlIIl % llllllllllllIllIIlIIlIIIIlIIlIlI.length]));
            "".length();
            ++llllllllllllIllIIlIIlIIIIlIIlIIl;
            ++llllllllllllIllIIlIIlIIIIlIIIIIl;
            "".length();
            if ((0x1C ^ 0x18) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIlIIIIlIIlIll);
    }
    
    private static boolean lIIllIIlllIIIlll(final int llllllllllllIllIIlIIlIIIIIIlllll, final int llllllllllllIllIIlIIlIIIIIIllllI) {
        return llllllllllllIllIIlIIlIIIIIIlllll > llllllllllllIllIIlIIlIIIIIIllllI;
    }
    
    private static String lIIllIIlllIIIIIl(final String llllllllllllIllIIlIIlIIIIIlIlIIl, final String llllllllllllIllIIlIIlIIIIIlIlIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIlIIIIIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIlIIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIIlIIIIIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIIlIIIIIlIllIl.init(ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[5], llllllllllllIllIIlIIlIIIIIlIlllI);
            return new String(llllllllllllIllIIlIIlIIIIIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIlIIIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIlIIIIIlIllII) {
            llllllllllllIllIIlIIlIIIIIlIllII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIllIIlllIIIIll();
        lIIllIIlllIIIIlI();
        int native_ORDER;
        if (lIIllIIlllIIlIII(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN)) {
            native_ORDER = ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[4];
            "".length();
            if (((0x11 ^ 0x42) & ~(0x49 ^ 0x1A)) >= "  ".length()) {
                return;
            }
        }
        else {
            native_ORDER = ReadOnlyUnsafeDirectByteBuf.llIlllIlIIllll[3];
        }
        NATIVE_ORDER = (native_ORDER != 0);
    }
    
    @Override
    protected short _getShort(final int llllllllllllIllIIlIIlIIIlIllIllI) {
        final short llllllllllllIllIIlIIlIIIlIllIlIl = PlatformDependent.getShort(this.addr(llllllllllllIllIIlIIlIIIlIllIllI));
        short reverseBytes;
        if (lIIllIIlllIIIlII(ReadOnlyUnsafeDirectByteBuf.NATIVE_ORDER ? 1 : 0)) {
            reverseBytes = llllllllllllIllIIlIIlIIIlIllIlIl;
            "".length();
            if (" ".length() >= "   ".length()) {
                return (short)((12 + 28 + 84 + 35 ^ 130 + 91 - 92 + 40) & (0x5B ^ 0x6 ^ (0xF7 ^ 0x9C) ^ -" ".length()));
            }
        }
        else {
            reverseBytes = Short.reverseBytes(llllllllllllIllIIlIIlIIIlIllIlIl);
        }
        return reverseBytes;
    }
}
