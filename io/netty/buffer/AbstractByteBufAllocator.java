// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.internal.StringUtil;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import io.netty.util.ResourceLeak;
import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.PlatformDependent;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public abstract class AbstractByteBufAllocator implements ByteBufAllocator
{
    private final /* synthetic */ ByteBuf emptyBuf;
    private static final /* synthetic */ int[] lllIIIllIlIlII;
    private static final /* synthetic */ String[] lllIIIllIlIIIl;
    private final /* synthetic */ boolean directByDefault;
    
    @Override
    public ByteBuf heapBuffer(final int llllllllllllIlIllllllllIIlllIIlI) {
        return this.heapBuffer(llllllllllllIlIllllllllIIlllIIlI, AbstractByteBufAllocator.lllIIIllIlIlII[3]);
    }
    
    protected abstract ByteBuf newHeapBuffer(final int p0, final int p1);
    
    private static String lIIllllIIIIIIIII(String llllllllllllIlIllllllllIIIlIIIll, final String llllllllllllIlIllllllllIIIlIIIlI) {
        llllllllllllIlIllllllllIIIlIIIll = new String(Base64.getDecoder().decode(llllllllllllIlIllllllllIIIlIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllllllIIIlIIllI = new StringBuilder();
        final char[] llllllllllllIlIllllllllIIIlIIlIl = llllllllllllIlIllllllllIIIlIIIlI.toCharArray();
        int llllllllllllIlIllllllllIIIlIIlII = AbstractByteBufAllocator.lllIIIllIlIlII[0];
        final float llllllllllllIlIllllllllIIIIllllI = (Object)llllllllllllIlIllllllllIIIlIIIll.toCharArray();
        final Exception llllllllllllIlIllllllllIIIIlllIl = (Exception)llllllllllllIlIllllllllIIIIllllI.length;
        int llllllllllllIlIllllllllIIIIlllII = AbstractByteBufAllocator.lllIIIllIlIlII[0];
        while (lIIllllIIIIlIlII(llllllllllllIlIllllllllIIIIlllII, (int)llllllllllllIlIllllllllIIIIlllIl)) {
            final char llllllllllllIlIllllllllIIIlIlIIl = llllllllllllIlIllllllllIIIIllllI[llllllllllllIlIllllllllIIIIlllII];
            llllllllllllIlIllllllllIIIlIIllI.append((char)(llllllllllllIlIllllllllIIIlIlIIl ^ llllllllllllIlIllllllllIIIlIIlIl[llllllllllllIlIllllllllIIIlIIlII % llllllllllllIlIllllllllIIIlIIlIl.length]));
            "".length();
            ++llllllllllllIlIllllllllIIIlIIlII;
            ++llllllllllllIlIllllllllIIIIlllII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllllllIIIlIIllI);
    }
    
    private static boolean lIIllllIIIIlIIIl(final int llllllllllllIlIlllllllIlllllIIll) {
        return llllllllllllIlIlllllllIlllllIIll == 0;
    }
    
    private static boolean lIIllllIIIIIllll(final Object llllllllllllIlIlllllllIlllllIlll) {
        return llllllllllllIlIlllllllIlllllIlll != null;
    }
    
    @Override
    public ByteBuf ioBuffer(final int llllllllllllIlIllllllllIlIIIIlII) {
        if (lIIllllIIIIlIIII(PlatformDependent.hasUnsafe() ? 1 : 0)) {
            return this.directBuffer(llllllllllllIlIllllllllIlIIIIlII);
        }
        return this.heapBuffer(llllllllllllIlIllllllllIlIIIIlII);
    }
    
    @Override
    public CompositeByteBuf compositeBuffer(final int llllllllllllIlIllllllllIIlIlIIII) {
        if (lIIllllIIIIlIIII(this.directByDefault ? 1 : 0)) {
            return this.compositeDirectBuffer(llllllllllllIlIllllllllIIlIlIIII);
        }
        return this.compositeHeapBuffer(llllllllllllIlIllllllllIIlIlIIII);
    }
    
    private static void lIIllllIIIIIIIlI() {
        (lllIIIllIlIIIl = new String[AbstractByteBufAllocator.lllIIIllIlIlII[8]])[AbstractByteBufAllocator.lllIIIllIlIlII[0]] = lIIlllIlllllllll("ApN2KVPzkE7WXLllN24tE45g2rFQ6TS0", "gZHea");
        AbstractByteBufAllocator.lllIIIllIlIIIl[AbstractByteBufAllocator.lllIIIllIlIlII[1]] = lIIlllIlllllllll("BW/8vkI6hIQt0T2UO8gS9g==", "QXLWH");
        AbstractByteBufAllocator.lllIIIllIlIIIl[AbstractByteBufAllocator.lllIIIllIlIlII[5]] = lIIllllIIIIIIIII("PxYLIgw3FCE3FTcbCyIcbFhHMkV+HRomADUMBzJfdhYNIkUxCgc3ETMKQiINNxZCOwQuOwMmBDURFi9NcxxL", "VxbVe");
        AbstractByteBufAllocator.lllIIIllIlIIIl[AbstractByteBufAllocator.lllIIIllIlIlII[6]] = lIIllllIIIIIIIIl("XT4jEjVzTdoRi0GEWkj5Bd7lAux0d+r3", "LtvyW");
    }
    
    @Override
    public CompositeByteBuf compositeDirectBuffer() {
        return this.compositeDirectBuffer(AbstractByteBufAllocator.lllIIIllIlIlII[4]);
    }
    
    protected static ByteBuf toLeakAwareBuffer(ByteBuf llllllllllllIlIllllllllIlIlIlIIl) {
        switch (AbstractByteBufAllocator$1.$SwitchMap$io$netty$util$ResourceLeakDetector$Level[ResourceLeakDetector.getLevel().ordinal()]) {
            case 1: {
                final ResourceLeak llllllllllllIlIllllllllIlIlIlIlI = AbstractByteBuf.leakDetector.open(llllllllllllIlIllllllllIlIlIlIIl);
                if (!lIIllllIIIIIllll(llllllllllllIlIllllllllIlIlIlIlI)) {
                    break;
                }
                llllllllllllIlIllllllllIlIlIlIIl = new SimpleLeakAwareByteBuf(llllllllllllIlIllllllllIlIlIlIIl, llllllllllllIlIllllllllIlIlIlIlI);
                "".length();
                if ((0x21 ^ 0xE ^ (0x51 ^ 0x7A)) == 0x0) {
                    return null;
                }
                break;
            }
            case 2:
            case 3: {
                final ResourceLeak llllllllllllIlIllllllllIlIlIlIlI = AbstractByteBuf.leakDetector.open(llllllllllllIlIllllllllIlIlIlIIl);
                if (lIIllllIIIIIllll(llllllllllllIlIllllllllIlIlIlIlI)) {
                    llllllllllllIlIllllllllIlIlIlIIl = new AdvancedLeakAwareByteBuf(llllllllllllIlIllllllllIlIlIlIIl, llllllllllllIlIllllllllIlIlIlIlI);
                    break;
                }
                break;
            }
        }
        return llllllllllllIlIllllllllIlIlIlIIl;
    }
    
    static {
        lIIllllIIIIIlllI();
        lIIllllIIIIIIIlI();
        DEFAULT_INITIAL_CAPACITY = AbstractByteBufAllocator.lllIIIllIlIlII[2];
        DEFAULT_MAX_COMPONENTS = AbstractByteBufAllocator.lllIIIllIlIlII[4];
    }
    
    @Override
    public ByteBuf heapBuffer(final int llllllllllllIlIllllllllIIllIlIlI, final int llllllllllllIlIllllllllIIllIlIIl) {
        if (lIIllllIIIIlIIIl(llllllllllllIlIllllllllIIllIlIlI) && lIIllllIIIIlIIIl(llllllllllllIlIllllllllIIllIlIIl)) {
            return this.emptyBuf;
        }
        validate(llllllllllllIlIllllllllIIllIlIlI, llllllllllllIlIllllllllIIllIlIIl);
        return this.newHeapBuffer(llllllllllllIlIllllllllIIllIlIlI, llllllllllllIlIllllllllIIllIlIIl);
    }
    
    private static void validate(final int llllllllllllIlIllllllllIIIlllIIl, final int llllllllllllIlIllllllllIIIlllIII) {
        if (lIIllllIIIIlIIlI(llllllllllllIlIllllllllIIIlllIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(AbstractByteBufAllocator.lllIIIllIlIIIl[AbstractByteBufAllocator.lllIIIllIlIlII[0]]).append(llllllllllllIlIllllllllIIIlllIIl).append(AbstractByteBufAllocator.lllIIIllIlIIIl[AbstractByteBufAllocator.lllIIIllIlIlII[1]])));
        }
        if (lIIllllIIIIlIIll(llllllllllllIlIllllllllIIIlllIIl, llllllllllllIlIllllllllIIIlllIII)) {
            final String format = AbstractByteBufAllocator.lllIIIllIlIIIl[AbstractByteBufAllocator.lllIIIllIlIlII[5]];
            final Object[] args = new Object[AbstractByteBufAllocator.lllIIIllIlIlII[5]];
            args[AbstractByteBufAllocator.lllIIIllIlIlII[0]] = llllllllllllIlIllllllllIIIlllIIl;
            args[AbstractByteBufAllocator.lllIIIllIlIlII[1]] = llllllllllllIlIllllllllIIIlllIII;
            throw new IllegalArgumentException(String.format(format, args));
        }
    }
    
    @Override
    public ByteBuf buffer() {
        if (lIIllllIIIIlIIII(this.directByDefault ? 1 : 0)) {
            return this.directBuffer();
        }
        return this.heapBuffer();
    }
    
    protected abstract ByteBuf newDirectBuffer(final int p0, final int p1);
    
    @Override
    public ByteBuf directBuffer(final int llllllllllllIlIllllllllIIlIllIII, final int llllllllllllIlIllllllllIIlIllIlI) {
        if (lIIllllIIIIlIIIl(llllllllllllIlIllllllllIIlIllIII) && lIIllllIIIIlIIIl(llllllllllllIlIllllllllIIlIllIlI)) {
            return this.emptyBuf;
        }
        validate(llllllllllllIlIllllllllIIlIllIII, llllllllllllIlIllllllllIIlIllIlI);
        return this.newDirectBuffer(llllllllllllIlIllllllllIIlIllIII, llllllllllllIlIllllllllIIlIllIlI);
    }
    
    protected AbstractByteBufAllocator() {
        this((boolean)(AbstractByteBufAllocator.lllIIIllIlIlII[0] != 0));
    }
    
    @Override
    public ByteBuf ioBuffer(final int llllllllllllIlIllllllllIIlllllll, final int llllllllllllIlIllllllllIIllllllI) {
        if (lIIllllIIIIlIIII(PlatformDependent.hasUnsafe() ? 1 : 0)) {
            return this.directBuffer(llllllllllllIlIllllllllIIlllllll, llllllllllllIlIllllllllIIllllllI);
        }
        return this.heapBuffer(llllllllllllIlIllllllllIIlllllll, llllllllllllIlIllllllllIIllllllI);
    }
    
    @Override
    public ByteBuf directBuffer(final int llllllllllllIlIllllllllIIllIIIII) {
        return this.directBuffer(llllllllllllIlIllllllllIIllIIIII, AbstractByteBufAllocator.lllIIIllIlIlII[3]);
    }
    
    @Override
    public ByteBuf buffer(final int llllllllllllIlIllllllllIlIIlIllI) {
        if (lIIllllIIIIlIIII(this.directByDefault ? 1 : 0)) {
            return this.directBuffer(llllllllllllIlIllllllllIlIIlIllI);
        }
        return this.heapBuffer(llllllllllllIlIllllllllIlIIlIllI);
    }
    
    @Override
    public CompositeByteBuf compositeHeapBuffer(final int llllllllllllIlIllllllllIIlIIIlll) {
        return new CompositeByteBuf(this, (boolean)(AbstractByteBufAllocator.lllIIIllIlIlII[0] != 0), llllllllllllIlIllllllllIIlIIIlll);
    }
    
    @Override
    public ByteBuf heapBuffer() {
        return this.heapBuffer(AbstractByteBufAllocator.lllIIIllIlIlII[2], AbstractByteBufAllocator.lllIIIllIlIlII[3]);
    }
    
    @Override
    public CompositeByteBuf compositeBuffer() {
        if (lIIllllIIIIlIIII(this.directByDefault ? 1 : 0)) {
            return this.compositeDirectBuffer();
        }
        return this.compositeHeapBuffer();
    }
    
    @Override
    public CompositeByteBuf compositeDirectBuffer(final int llllllllllllIlIllllllllIIIlllllI) {
        return new CompositeByteBuf(this, (boolean)(AbstractByteBufAllocator.lllIIIllIlIlII[1] != 0), llllllllllllIlIllllllllIIIlllllI);
    }
    
    private static boolean lIIllllIIIIlIlII(final int llllllllllllIlIlllllllIllllllllI, final int llllllllllllIlIlllllllIlllllllIl) {
        return llllllllllllIlIlllllllIllllllllI < llllllllllllIlIlllllllIlllllllIl;
    }
    
    private static String lIIlllIlllllllll(final String llllllllllllIlIllllllllIIIIIIlII, final String llllllllllllIlIllllllllIIIIIIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllllllllIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllllIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllllllIIIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllllllIIIIIlIII.init(AbstractByteBufAllocator.lllIIIllIlIlII[5], llllllllllllIlIllllllllIIIIIlIIl);
            return new String(llllllllllllIlIllllllllIIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllllIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllllIIIIIIlll) {
            llllllllllllIlIllllllllIIIIIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf buffer(final int llllllllllllIlIllllllllIlIIlIIIl, final int llllllllllllIlIllllllllIlIIIllIl) {
        if (lIIllllIIIIlIIII(this.directByDefault ? 1 : 0)) {
            return this.directBuffer(llllllllllllIlIllllllllIlIIlIIIl, llllllllllllIlIllllllllIlIIIllIl);
        }
        return this.heapBuffer(llllllllllllIlIllllllllIlIIlIIIl, llllllllllllIlIllllllllIlIIIllIl);
    }
    
    protected AbstractByteBufAllocator(final boolean llllllllllllIlIllllllllIlIIlllll) {
        int directByDefault;
        if (lIIllllIIIIlIIII(llllllllllllIlIllllllllIlIIlllll ? 1 : 0) && lIIllllIIIIlIIII(PlatformDependent.hasUnsafe() ? 1 : 0)) {
            directByDefault = AbstractByteBufAllocator.lllIIIllIlIlII[1];
            "".length();
            if (-"   ".length() > 0) {
                throw null;
            }
        }
        else {
            directByDefault = AbstractByteBufAllocator.lllIIIllIlIlII[0];
        }
        this.directByDefault = (directByDefault != 0);
        this.emptyBuf = new EmptyByteBuf(this);
    }
    
    private static boolean lIIllllIIIIlIIlI(final int llllllllllllIlIlllllllIlllllIIIl) {
        return llllllllllllIlIlllllllIlllllIIIl < 0;
    }
    
    private static void lIIllllIIIIIlllI() {
        (lllIIIllIlIlII = new int[10])[0] = ((0x6D ^ 0x7F ^ (0x1B ^ 0x1D)) & (0x65 ^ 0x63 ^ (0x92 ^ 0x80) ^ -" ".length()));
        AbstractByteBufAllocator.lllIIIllIlIlII[1] = " ".length();
        AbstractByteBufAllocator.lllIIIllIlIlII[2] = (-(0xFFFFC4F7 & 0x7FEB) & (0xFFFFFDF7 & 0x47EA));
        AbstractByteBufAllocator.lllIIIllIlIlII[3] = (-" ".length() & (-1 & Integer.MAX_VALUE));
        AbstractByteBufAllocator.lllIIIllIlIlII[4] = (0x44 ^ 0x54);
        AbstractByteBufAllocator.lllIIIllIlIlII[5] = "  ".length();
        AbstractByteBufAllocator.lllIIIllIlIlII[6] = "   ".length();
        AbstractByteBufAllocator.lllIIIllIlIlII[7] = (0x2C ^ 0xE ^ (0x56 ^ 0x5D));
        AbstractByteBufAllocator.lllIIIllIlIlII[8] = (0x4C ^ 0x48);
        AbstractByteBufAllocator.lllIIIllIlIlII[9] = (117 + 101 - 91 + 31 ^ 8 + 63 + 64 + 15);
    }
    
    @Override
    public CompositeByteBuf compositeHeapBuffer() {
        return this.compositeHeapBuffer(AbstractByteBufAllocator.lllIIIllIlIlII[4]);
    }
    
    private static String lIIllllIIIIIIIIl(final String llllllllllllIlIllllllllIIIIlIIIl, final String llllllllllllIlIllllllllIIIIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllllllllIIIIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllllIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), AbstractByteBufAllocator.lllIIIllIlIlII[9]), "DES");
            final Cipher llllllllllllIlIllllllllIIIIlIlIl = Cipher.getInstance("DES");
            llllllllllllIlIllllllllIIIIlIlIl.init(AbstractByteBufAllocator.lllIIIllIlIlII[5], llllllllllllIlIllllllllIIIIlIllI);
            return new String(llllllllllllIlIllllllllIIIIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllllIIIIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllllIIIIlIlII) {
            llllllllllllIlIllllllllIIIIlIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ByteBuf ioBuffer() {
        if (lIIllllIIIIlIIII(PlatformDependent.hasUnsafe() ? 1 : 0)) {
            return this.directBuffer(AbstractByteBufAllocator.lllIIIllIlIlII[2]);
        }
        return this.heapBuffer(AbstractByteBufAllocator.lllIIIllIlIlII[2]);
    }
    
    private static boolean lIIllllIIIIlIIll(final int llllllllllllIlIlllllllIllllllIlI, final int llllllllllllIlIlllllllIllllllIIl) {
        return llllllllllllIlIlllllllIllllllIlI > llllllllllllIlIlllllllIllllllIIl;
    }
    
    private static boolean lIIllllIIIIlIIII(final int llllllllllllIlIlllllllIlllllIlIl) {
        return llllllllllllIlIlllllllIlllllIlIl != 0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append(AbstractByteBufAllocator.lllIIIllIlIIIl[AbstractByteBufAllocator.lllIIIllIlIlII[6]]).append(this.directByDefault).append((char)AbstractByteBufAllocator.lllIIIllIlIlII[7]));
    }
    
    @Override
    public ByteBuf directBuffer() {
        return this.directBuffer(AbstractByteBufAllocator.lllIIIllIlIlII[2], AbstractByteBufAllocator.lllIIIllIlIlII[3]);
    }
}
