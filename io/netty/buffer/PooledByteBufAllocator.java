// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import java.util.concurrent.atomic.AtomicInteger;
import io.netty.util.concurrent.FastThreadLocal;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.util.internal.PlatformDependent;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.internal.logging.InternalLogger;
import java.nio.ByteBuffer;

public class PooledByteBufAllocator extends AbstractByteBufAllocator
{
    private static final /* synthetic */ int DEFAULT_SMALL_CACHE_SIZE;
    private static final /* synthetic */ int[] lIlllIIlIIIlII;
    private final /* synthetic */ int smallCacheSize;
    final /* synthetic */ PoolThreadLocalCache threadCache;
    private static final /* synthetic */ int DEFAULT_MAX_ORDER;
    private final /* synthetic */ PoolArena<ByteBuffer>[] directArenas;
    private final /* synthetic */ PoolArena<byte[]>[] heapArenas;
    private static final /* synthetic */ int DEFAULT_CACHE_TRIM_INTERVAL;
    private static final /* synthetic */ int DEFAULT_NORMAL_CACHE_SIZE;
    private final /* synthetic */ int tinyCacheSize;
    private final /* synthetic */ int normalCacheSize;
    private static final /* synthetic */ InternalLogger logger;
    private static final /* synthetic */ int DEFAULT_NUM_DIRECT_ARENA;
    private static final /* synthetic */ int DEFAULT_TINY_CACHE_SIZE;
    private static final /* synthetic */ int DEFAULT_MAX_CACHED_BUFFER_CAPACITY;
    private static final /* synthetic */ String[] lIllIlIllllIII;
    private static final /* synthetic */ int DEFAULT_PAGE_SIZE;
    private static final /* synthetic */ int DEFAULT_NUM_HEAP_ARENA;
    
    private static boolean lIIIIIIllIlIlIlI(final int llllllllllllIlllllIlIIIlllIlllIl) {
        return llllllllllllIlllllIlIIIlllIlllIl > 0;
    }
    
    private static int validateAndCalculatePageShifts(final int llllllllllllIlllllIlIIlIlIIIIIII) {
        if (lIIIIIIllIlIlIll(llllllllllllIlllllIlIIlIlIIIIIII, PooledByteBufAllocator.lIlllIIlIIIlII[4])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[5]]).append(llllllllllllIlllllIlIIlIlIIIIIII).append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[6]]).append(PooledByteBufAllocator.lIlllIIlIIIlII[4]).append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[7]])));
        }
        if (lIIIIIIllIlIllII(llllllllllllIlllllIlIIlIlIIIIIII & llllllllllllIlllllIlIIlIlIIIIIII - PooledByteBufAllocator.lIlllIIlIIIlII[1])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[8]]).append(llllllllllllIlllllIlIIlIlIIIIIII).append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[9]])));
        }
        return PooledByteBufAllocator.lIlllIIlIIIlII[10] - Integer.numberOfLeadingZeros(llllllllllllIlllllIlIIlIlIIIIIII);
    }
    
    private static String lllllllIlIIIlll(String llllllllllllIlllllIlIIlIIIIlIIIl, final String llllllllllllIlllllIlIIlIIIIlIlIl) {
        llllllllllllIlllllIlIIlIIIIlIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllllIlIIlIIIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIlIIlIIIIlIlII = new StringBuilder();
        final char[] llllllllllllIlllllIlIIlIIIIlIIll = llllllllllllIlllllIlIIlIIIIlIlIl.toCharArray();
        int llllllllllllIlllllIlIIlIIIIlIIlI = PooledByteBufAllocator.lIlllIIlIIIlII[0];
        final float llllllllllllIlllllIlIIlIIIIIllII = (Object)llllllllllllIlllllIlIIlIIIIlIIIl.toCharArray();
        final byte llllllllllllIlllllIlIIlIIIIIlIll = (byte)llllllllllllIlllllIlIIlIIIIIllII.length;
        byte llllllllllllIlllllIlIIlIIIIIlIlI = (byte)PooledByteBufAllocator.lIlllIIlIIIlII[0];
        while (lIIIIIIllIlIlIll(llllllllllllIlllllIlIIlIIIIIlIlI, llllllllllllIlllllIlIIlIIIIIlIll)) {
            final char llllllllllllIlllllIlIIlIIIIlIlll = llllllllllllIlllllIlIIlIIIIIllII[llllllllllllIlllllIlIIlIIIIIlIlI];
            llllllllllllIlllllIlIIlIIIIlIlII.append((char)(llllllllllllIlllllIlIIlIIIIlIlll ^ llllllllllllIlllllIlIIlIIIIlIIll[llllllllllllIlllllIlIIlIIIIlIIlI % llllllllllllIlllllIlIIlIIIIlIIll.length]));
            "".length();
            ++llllllllllllIlllllIlIIlIIIIlIIlI;
            ++llllllllllllIlllllIlIIlIIIIIlIlI;
            "".length();
            if (((0xD2 ^ 0x81) & ~(0x8 ^ 0x5B)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIlIIlIIIIlIlII);
    }
    
    @Override
    protected ByteBuf newDirectBuffer(final int llllllllllllIlllllIlIIlIIlIlIIIl, final int llllllllllllIlllllIlIIlIIlIlIIII) {
        final PoolThreadCache llllllllllllIlllllIlIIlIIlIlIlIl = this.threadCache.get();
        final PoolArena<ByteBuffer> llllllllllllIlllllIlIIlIIlIlIlII = llllllllllllIlllllIlIIlIIlIlIlIl.directArena;
        ByteBuf llllllllllllIlllllIlIIlIIlIlIIll = null;
        if (lIIIIIIllIlIlllI(llllllllllllIlllllIlIIlIIlIlIlII)) {
            final ByteBuf llllllllllllIlllllIlIIlIIlIllIlI = llllllllllllIlllllIlIIlIIlIlIlII.allocate(llllllllllllIlllllIlIIlIIlIlIlIl, llllllllllllIlllllIlIIlIIlIlIIIl, llllllllllllIlllllIlIIlIIlIlIIII);
            "".length();
            if (-(122 + 59 - 143 + 90 ^ 2 + 83 - 30 + 78) >= 0) {
                return null;
            }
        }
        else if (lIIIIIIllIlIllII(PlatformDependent.hasUnsafe() ? 1 : 0)) {
            final ByteBuf llllllllllllIlllllIlIIlIIlIllIIl = new UnpooledUnsafeDirectByteBuf(this, llllllllllllIlllllIlIIlIIlIlIIIl, llllllllllllIlllllIlIIlIIlIlIIII);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            llllllllllllIlllllIlIIlIIlIlIIll = new UnpooledDirectByteBuf(this, llllllllllllIlllllIlIIlIIlIlIIIl, llllllllllllIlllllIlIIlIIlIlIIII);
        }
        return AbstractByteBufAllocator.toLeakAwareBuffer(llllllllllllIlllllIlIIlIIlIlIIll);
    }
    
    @Override
    public boolean isDirectBufferPooled() {
        int n;
        if (lIIIIIIllIlIlllI(this.directArenas)) {
            n = PooledByteBufAllocator.lIlllIIlIIIlII[1];
            "".length();
            if (((0x37 ^ 0x32) & ~(0x96 ^ 0x93)) < 0) {
                return ((0x1E ^ 0x46) & ~(0xF6 ^ 0xAE)) != 0x0;
            }
        }
        else {
            n = PooledByteBufAllocator.lIlllIIlIIIlII[0];
        }
        return n != 0;
    }
    
    @Deprecated
    public PooledByteBufAllocator(final boolean llllllllllllIlllllIlIIlIlIIIllIl, final int llllllllllllIlllllIlIIlIlIIlIllI, final int llllllllllllIlllllIlIIlIlIIIlIll, final int llllllllllllIlllllIlIIlIlIIlIlII, final int llllllllllllIlllllIlIIlIlIIlIIll, final int llllllllllllIlllllIlIIlIlIIIlIII, final int llllllllllllIlllllIlIIlIlIIlIIIl, final int llllllllllllIlllllIlIIlIlIIIIllI, final long llllllllllllIlllllIlIIlIlIIIllll) {
        this(llllllllllllIlllllIlIIlIlIIIllIl, llllllllllllIlllllIlIIlIlIIlIllI, llllllllllllIlllllIlIIlIlIIIlIll, llllllllllllIlllllIlIIlIlIIlIlII, llllllllllllIlllllIlIIlIlIIlIIll, llllllllllllIlllllIlIIlIlIIIlIII, llllllllllllIlllllIlIIlIlIIlIIIl, llllllllllllIlllllIlIIlIlIIIIllI);
    }
    
    @Deprecated
    public void freeThreadLocalCache() {
        this.threadCache.remove();
    }
    
    private static String lllllllIlIIIllI(final String llllllllllllIlllllIlIIIlllllllll, final String llllllllllllIlllllIlIIIllllllllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIlIIlIIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIIIllllllllI.getBytes(StandardCharsets.UTF_8)), PooledByteBufAllocator.lIlllIIlIIIlII[9]), "DES");
            final Cipher llllllllllllIlllllIlIIlIIIIIIIll = Cipher.getInstance("DES");
            llllllllllllIlllllIlIIlIIIIIIIll.init(PooledByteBufAllocator.lIlllIIlIIIlII[2], llllllllllllIlllllIlIIlIIIIIIlII);
            return new String(llllllllllllIlllllIlIIlIIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlIIlIIIIIIIlI) {
            llllllllllllIlllllIlIIlIIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIllIlIlIll(final int llllllllllllIlllllIlIIIllllIllII, final int llllllllllllIlllllIlIIIllllIlIll) {
        return llllllllllllIlllllIlIIIllllIllII < llllllllllllIlllllIlIIIllllIlIll;
    }
    
    static {
        lIIIIIIllIlIlIII();
        lIIIIIIllIIIlIll();
        MIN_PAGE_SIZE = PooledByteBufAllocator.lIlllIIlIIIlII[4];
        MAX_CHUNK_SIZE = PooledByteBufAllocator.lIlllIIlIIIlII[16];
        logger = InternalLoggerFactory.getInstance(PooledByteBufAllocator.class);
        int llllllllllllIlllllIlIIlIIIlIllII = SystemPropertyUtil.getInt(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[17]], PooledByteBufAllocator.lIlllIIlIIIlII[18]);
        Throwable llllllllllllIlllllIlIIlIIIlIlIll = null;
        try {
            validateAndCalculatePageShifts(llllllllllllIlllllIlIIlIIIlIllII);
            "".length();
            "".length();
            if ((0x23 ^ 0x27) == 0x0) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllllIlIIlIIIlIlllI) {
            llllllllllllIlllllIlIIlIIIlIlIll = llllllllllllIlllllIlIIlIIIlIlllI;
            llllllllllllIlllllIlIIlIIIlIllII = PooledByteBufAllocator.lIlllIIlIIIlII[18];
        }
        DEFAULT_PAGE_SIZE = llllllllllllIlllllIlIIlIIIlIllII;
        int llllllllllllIlllllIlIIlIIIlIlIlI = SystemPropertyUtil.getInt(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[19]], PooledByteBufAllocator.lIlllIIlIIIlII[15]);
        Throwable llllllllllllIlllllIlIIlIIIlIlIIl = null;
        try {
            validateAndCalculateChunkSize(PooledByteBufAllocator.DEFAULT_PAGE_SIZE, llllllllllllIlllllIlIIlIIIlIlIlI);
            "".length();
            "".length();
            if ((22 + 39 + 17 + 98 ^ 166 + 32 - 149 + 131) < " ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIlllllIlIIlIIIlIllIl) {
            llllllllllllIlllllIlIIlIIIlIlIIl = llllllllllllIlllllIlIIlIIIlIllIl;
            llllllllllllIlllllIlIIlIIIlIlIlI = PooledByteBufAllocator.lIlllIIlIIIlII[15];
        }
        DEFAULT_MAX_ORDER = llllllllllllIlllllIlIIlIIIlIlIlI;
        final Runtime llllllllllllIlllllIlIIlIIIlIlIII = Runtime.getRuntime();
        final int llllllllllllIlllllIlIIlIIIlIIlll = PooledByteBufAllocator.DEFAULT_PAGE_SIZE << PooledByteBufAllocator.DEFAULT_MAX_ORDER;
        DEFAULT_NUM_HEAP_ARENA = Math.max(PooledByteBufAllocator.lIlllIIlIIIlII[0], SystemPropertyUtil.getInt(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[11]], (int)Math.min(llllllllllllIlllllIlIIlIIIlIlIII.availableProcessors(), Runtime.getRuntime().maxMemory() / llllllllllllIlllllIlIIlIIIlIIlll / 2L / 3L)));
        DEFAULT_NUM_DIRECT_ARENA = Math.max(PooledByteBufAllocator.lIlllIIlIIIlII[0], SystemPropertyUtil.getInt(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[20]], (int)Math.min(llllllllllllIlllllIlIIlIIIlIlIII.availableProcessors(), PlatformDependent.maxDirectMemory() / llllllllllllIlllllIlIIlIIIlIIlll / 2L / 3L)));
        DEFAULT_TINY_CACHE_SIZE = SystemPropertyUtil.getInt(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[21]], PooledByteBufAllocator.lIlllIIlIIIlII[22]);
        DEFAULT_SMALL_CACHE_SIZE = SystemPropertyUtil.getInt(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[23]], PooledByteBufAllocator.lIlllIIlIIIlII[24]);
        DEFAULT_NORMAL_CACHE_SIZE = SystemPropertyUtil.getInt(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[25]], PooledByteBufAllocator.lIlllIIlIIIlII[26]);
        DEFAULT_MAX_CACHED_BUFFER_CAPACITY = SystemPropertyUtil.getInt(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[27]], PooledByteBufAllocator.lIlllIIlIIIlII[28]);
        DEFAULT_CACHE_TRIM_INTERVAL = SystemPropertyUtil.getInt(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[29]], PooledByteBufAllocator.lIlllIIlIIIlII[18]);
        if (lIIIIIIllIlIllII(PooledByteBufAllocator.logger.isDebugEnabled() ? 1 : 0)) {
            PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[30]], (Object)PooledByteBufAllocator.DEFAULT_NUM_HEAP_ARENA);
            PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[31]], (Object)PooledByteBufAllocator.DEFAULT_NUM_DIRECT_ARENA);
            if (lIIIIIIllIlIllll(llllllllllllIlllllIlIIlIIIlIlIll)) {
                PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[32]], (Object)PooledByteBufAllocator.DEFAULT_PAGE_SIZE);
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            else {
                PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[33]], (Object)PooledByteBufAllocator.DEFAULT_PAGE_SIZE, llllllllllllIlllllIlIIlIIIlIlIll);
            }
            if (lIIIIIIllIlIllll(llllllllllllIlllllIlIIlIIIlIlIIl)) {
                PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[34]], (Object)PooledByteBufAllocator.DEFAULT_MAX_ORDER);
                "".length();
                if (((0x51 ^ 0x7) & ~(0x6A ^ 0x3C)) != ((0x99 ^ 0x97) & ~(0x25 ^ 0x2B))) {
                    return;
                }
            }
            else {
                PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[35]], (Object)PooledByteBufAllocator.DEFAULT_MAX_ORDER, llllllllllllIlllllIlIIlIIIlIlIIl);
            }
            PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[36]], (Object)(PooledByteBufAllocator.DEFAULT_PAGE_SIZE << PooledByteBufAllocator.DEFAULT_MAX_ORDER));
            PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[37]], (Object)PooledByteBufAllocator.DEFAULT_TINY_CACHE_SIZE);
            PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[38]], (Object)PooledByteBufAllocator.DEFAULT_SMALL_CACHE_SIZE);
            PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[39]], (Object)PooledByteBufAllocator.DEFAULT_NORMAL_CACHE_SIZE);
            PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[10]], (Object)PooledByteBufAllocator.DEFAULT_MAX_CACHED_BUFFER_CAPACITY);
            PooledByteBufAllocator.logger.debug(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[40]], (Object)PooledByteBufAllocator.DEFAULT_CACHE_TRIM_INTERVAL);
        }
        DEFAULT = new PooledByteBufAllocator(PlatformDependent.directBufferPreferred());
    }
    
    public PooledByteBufAllocator() {
        this((boolean)(PooledByteBufAllocator.lIlllIIlIIIlII[0] != 0));
    }
    
    private static <T> PoolArena<T>[] newArenaArray(final int llllllllllllIlllllIlIIlIlIIIIlII) {
        return (PoolArena<T>[])new PoolArena[llllllllllllIlllllIlIIlIlIIIIlII];
    }
    
    private static boolean lIIIIIIllIlIlllI(final Object llllllllllllIlllllIlIIIllllIIlIl) {
        return llllllllllllIlllllIlIIIllllIIlIl != null;
    }
    
    private static void lIIIIIIllIlIlIII() {
        (lIlllIIlIIIlII = new int[42])[0] = ((0x6A ^ 0x4A ^ (0x19 ^ 0x73)) & (207 + 167 - 267 + 114 ^ 65 + 102 - 138 + 122 ^ -" ".length()));
        PooledByteBufAllocator.lIlllIIlIIIlII[1] = " ".length();
        PooledByteBufAllocator.lIlllIIlIIIlII[2] = "  ".length();
        PooledByteBufAllocator.lIlllIIlIIIlII[3] = "   ".length();
        PooledByteBufAllocator.lIlllIIlIIIlII[4] = (-(0xFFFFBD7A & 0x4EED) & (0xFFFFBDEF & 0x5E77));
        PooledByteBufAllocator.lIlllIIlIIIlII[5] = (0xD3 ^ 0xB0 ^ (0x26 ^ 0x41));
        PooledByteBufAllocator.lIlllIIlIIIlII[6] = (84 + 59 - 66 + 55 ^ 67 + 103 - 134 + 93);
        PooledByteBufAllocator.lIlllIIlIIIlII[7] = (18 + 33 + 21 + 62 ^ 88 + 79 - 158 + 119);
        PooledByteBufAllocator.lIlllIIlIIIlII[8] = (9 + 12 + 13 + 94 ^ 49 + 43 - 51 + 94);
        PooledByteBufAllocator.lIlllIIlIIIlII[9] = (82 + 170 - 181 + 118 ^ 104 + 72 - 57 + 62);
        PooledByteBufAllocator.lIlllIIlIIIlII[10] = (0x19 ^ 0x71 ^ (0x27 ^ 0x50));
        PooledByteBufAllocator.lIlllIIlIIIlII[11] = (0x68 ^ 0x66);
        PooledByteBufAllocator.lIlllIIlIIIlII[12] = (0x35 ^ 0x3C);
        PooledByteBufAllocator.lIlllIIlIIIlII[13] = (103 + 119 - 180 + 163 ^ 136 + 91 - 89 + 61);
        PooledByteBufAllocator.lIlllIIlIIIlII[14] = (-(0xFFFFFC9B & 0x6FE6) & (0xFFFFED99 & 0x20007EE7));
        PooledByteBufAllocator.lIlllIIlIIIlII[15] = (0xA9 ^ 0xA2);
        PooledByteBufAllocator.lIlllIIlIIIlII[16] = (0xFFFFEE18 & 0x400011E7);
        PooledByteBufAllocator.lIlllIIlIIIlII[17] = (0xD ^ 0x1);
        PooledByteBufAllocator.lIlllIIlIIIlII[18] = (0xFFFFBDC1 & 0x623E);
        PooledByteBufAllocator.lIlllIIlIIIlII[19] = (0x7C ^ 0x71);
        PooledByteBufAllocator.lIlllIIlIIIlII[20] = (123 + 55 - 122 + 80 ^ 72 + 51 + 2 + 10);
        PooledByteBufAllocator.lIlllIIlIIIlII[21] = (0xAF ^ 0xBF);
        PooledByteBufAllocator.lIlllIIlIIIlII[22] = (0xFFFFE73B & 0x1AC4);
        PooledByteBufAllocator.lIlllIIlIIIlII[23] = (0xB6 ^ 0xA7);
        PooledByteBufAllocator.lIlllIIlIIIlII[24] = (-(0xFFFF9E3E & 0x79FF) & (0xFFFFBD3D & 0x5BFF));
        PooledByteBufAllocator.lIlllIIlIIIlII[25] = (0x5 ^ 0x17);
        PooledByteBufAllocator.lIlllIIlIIIlII[26] = (0x1A ^ 0x38 ^ (0xD6 ^ 0xB4));
        PooledByteBufAllocator.lIlllIIlIIIlII[27] = (0x47 ^ 0x66 ^ (0x93 ^ 0xA1));
        PooledByteBufAllocator.lIlllIIlIIIlII[28] = (0xFFFFB1CC & 0xCE33);
        PooledByteBufAllocator.lIlllIIlIIIlII[29] = (0x63 ^ 0x77);
        PooledByteBufAllocator.lIlllIIlIIIlII[30] = (0x29 ^ 0x3C);
        PooledByteBufAllocator.lIlllIIlIIIlII[31] = (0x1A ^ 0xC);
        PooledByteBufAllocator.lIlllIIlIIIlII[32] = (0x16 ^ 0x20 ^ (0xAA ^ 0x8B));
        PooledByteBufAllocator.lIlllIIlIIIlII[33] = (0x4B ^ 0x53);
        PooledByteBufAllocator.lIlllIIlIIIlII[34] = (0x61 ^ 0x78);
        PooledByteBufAllocator.lIlllIIlIIIlII[35] = (0x19 ^ 0x29 ^ (0x7B ^ 0x51));
        PooledByteBufAllocator.lIlllIIlIIIlII[36] = (0x59 ^ 0x42);
        PooledByteBufAllocator.lIlllIIlIIIlII[37] = (0xA4 ^ 0xB8);
        PooledByteBufAllocator.lIlllIIlIIIlII[38] = (0x21 ^ 0x3C);
        PooledByteBufAllocator.lIlllIIlIIIlII[39] = (0x68 ^ 0x58 ^ (0x1F ^ 0x31));
        PooledByteBufAllocator.lIlllIIlIIIlII[40] = (0x6E ^ 0x1C ^ (0x15 ^ 0x47));
        PooledByteBufAllocator.lIlllIIlIIIlII[41] = (0x67 ^ 0x46);
    }
    
    private static int validateAndCalculateChunkSize(final int llllllllllllIlllllIlIIlIIlllIlll, final int llllllllllllIlllllIlIIlIIllllIIl) {
        if (lIIIIIIllIlIllIl(llllllllllllIlllllIlIIlIIllllIIl, PooledByteBufAllocator.lIlllIIlIIIlII[11])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[12]]).append(llllllllllllIlllllIlIIlIIllllIIl).append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[13]])));
        }
        int llllllllllllIlllllIlIIlIIllllIII = llllllllllllIlllllIlIIlIIlllIlll;
        int llllllllllllIlllllIlIIlIIllllIll = llllllllllllIlllllIlIIlIIllllIIl;
        while (lIIIIIIllIlIlIlI(llllllllllllIlllllIlIIlIIllllIll)) {
            if (lIIIIIIllIlIllIl(llllllllllllIlllllIlIIlIIllllIII, PooledByteBufAllocator.lIlllIIlIIIlII[14])) {
                final String format = PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[15]];
                final Object[] args = new Object[PooledByteBufAllocator.lIlllIIlIIIlII[3]];
                args[PooledByteBufAllocator.lIlllIIlIIIlII[0]] = llllllllllllIlllllIlIIlIIlllIlll;
                args[PooledByteBufAllocator.lIlllIIlIIIlII[1]] = llllllllllllIlllllIlIIlIIllllIIl;
                args[PooledByteBufAllocator.lIlllIIlIIIlII[2]] = PooledByteBufAllocator.lIlllIIlIIIlII[16];
                throw new IllegalArgumentException(String.format(format, args));
            }
            llllllllllllIlllllIlIIlIIllllIII <<= PooledByteBufAllocator.lIlllIIlIIIlII[1];
            --llllllllllllIlllllIlIIlIIllllIll;
            "".length();
            if (((0x3D ^ 0x2F ^ (0x4C ^ 0x6A)) & (0xA6 ^ 0xB4 ^ (0x62 ^ 0x44) ^ -" ".length())) >= "   ".length()) {
                return (0x41 ^ 0x38 ^ (0x51 ^ 0xA)) & (0xA2 ^ 0xB4 ^ (0x22 ^ 0x16) ^ -" ".length());
            }
        }
        return llllllllllllIlllllIlIIlIIllllIII;
    }
    
    private static boolean lIIIIIIllIlIlIIl(final int llllllllllllIlllllIlIIIlllIlllll) {
        return llllllllllllIlllllIlIIIlllIlllll < 0;
    }
    
    public PooledByteBufAllocator(final boolean llllllllllllIlllllIlIIlIllIIlIll, final int llllllllllllIlllllIlIIlIllIIlIlI, final int llllllllllllIlllllIlIIlIllIIllll, final int llllllllllllIlllllIlIIlIllIIlllI, final int llllllllllllIlllllIlIIlIllIIIlll) {
        this(llllllllllllIlllllIlIIlIllIIlIll, llllllllllllIlllllIlIIlIllIIlIlI, llllllllllllIlllllIlIIlIllIIllll, llllllllllllIlllllIlIIlIllIIlllI, llllllllllllIlllllIlIIlIllIIIlll, PooledByteBufAllocator.DEFAULT_TINY_CACHE_SIZE, PooledByteBufAllocator.DEFAULT_SMALL_CACHE_SIZE, PooledByteBufAllocator.DEFAULT_NORMAL_CACHE_SIZE);
    }
    
    private static boolean lIIIIIIllIlIllll(final Object llllllllllllIlllllIlIIIllllIIIll) {
        return llllllllllllIlllllIlIIIllllIIIll == null;
    }
    
    private static boolean lIIIIIIllIlIllII(final int llllllllllllIlllllIlIIIllllIIIIl) {
        return llllllllllllIlllllIlIIIllllIIIIl != 0;
    }
    
    private static void lIIIIIIllIIIlIll() {
        (lIllIlIllllIII = new String[PooledByteBufAllocator.lIlllIIlIIIlII[41]])[PooledByteBufAllocator.lIlllIIlIIIlII[0]] = lllllllIlIIIlIl("BuuSbop5P8JABngVVJZNXw==", "SQNFj");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[1]] = lllllllIlIIIllI("G6MFC1TWQBrBKGeHBMOOAfxLog9L1NWa", "KUZPF");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[2]] = lllllllIlIIIlll("Ah0sNRUPLQQ1FQ1jZQ==", "lYEGp");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[3]] = lllllllIlIIIllI("jpEcVXOkrLq1r7BVmWUrgsvavEyej7/N", "gcvHm");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[5]] = lllllllIlIIIllI("6vO9n1ucAr2l6hNHiI6fMA==", "ITbBh");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[6]] = lllllllIlIIIlIl("A54UyKhRNkDKnKTUIc4Opw==", "kVNTl");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[7]] = lllllllIlIIIlIl("eD7KF6E8KSM=", "RzVrF");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[8]] = lllllllIlIIIllI("+pcBAuKlcePe0e8y7esMFQ==", "NJCOP");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[9]] = lllllllIlIIIlll("dVAUGSEwGwUENW9YAQ4mMApRDjd1Slg=", "UxqaQ");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[12]] = lllllllIlIIIlIl("LKoEQozAwyZ0NzYWDboMXA==", "dBjCc");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[13]] = lllllllIlIIIllI("8vEGe3SuQMCxSGB31SL8RFoaz4lsNEQ4", "iNjRV");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[15]] = lllllllIlIIIlll("Bwk+NCUeEjxxXlIMcHFKS0g0MA44Gj00BFdAfDVfVwUsIgJXBjYlVhIQOjQTE0h8NQ==", "whYQv");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[17]] = lllllllIlIIIlIl("qemkx8gVUu3vxSdIkFhBm5Ee/SjqXqkNb9R5yInUFQo=", "oNSlZ");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[19]] = lllllllIlIIIlll("OTdWDTQkLAFNMDw0FwAwJDcKTTwxIDcRNTUq", "PXxcQ");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[11]] = lllllllIlIIIllI("DiRc9G46Zgpg3UPfkq4hmIyJWDLL/K3SxHyr7UfdXleuVyMlwg/g9w==", "ZEzpN");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[20]] = lllllllIlIIIlIl("luKXT3lqeUmzWqK/d/HSGpSkqxUBUDoNWDUf2CDI5b9ocNjqqKf6Fg==", "kLLUj");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[21]] = lllllllIlIIIlll("GQlZGxwEEg5bGBwKGBYYBAkFWw0ZCA42GBMOEiYQCgM=", "pfwuy");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[23]] = lllllllIlIIIlll("Gg1CKBAHFhVoFB8OAyUUBw0eaAYeAwAqNhIBBCMmGhgJ", "sblFu");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[25]] = lllllllIlIIIllI("2dAQMrPIZYY9MVe1Hz7ZdMXeIyEvmpILU4JqqLu6jiIfyGn3GHntVQ==", "mguOC");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[27]] = lllllllIlIIIlIl("OkRKsQOueB3F2pJTuIWdiw2P7FkHNQlHm/qP5U7kE1ti5HefQoPncd0v5wHEErX7", "XkFdT");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[29]] = lllllllIlIIIlIl("/uLUhCgm5lwCGDp66JQA/YyKyJykFFigJv9A+EySIOeR4mtR1l1rmA==", "Ubjfy");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[30]] = lllllllIlIIIllI("rWeVSyYcA0i1U0mpl9TTkpwlAfiI/lc1Hf8C3SzkYGzZwGJ/efOF3A==", "SXAHc");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[31]] = lllllllIlIIIllI("fb0uPEOf1HvGYdDT0DkXAuzx5ertVYOqbO/EYk6olFOhdrhrSo6JNIK/D6Gmi5qf", "nhSGz");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[32]] = lllllllIlIIIlIl("kG8q9qlKw4HQbL+svtvLcNFSWIb37wtgBHaDGTNbSKsIZnvCEuotyQ==", "uBZDY");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[33]] = lllllllIlIIIlIl("UX3lA79Mj5PFTnZ27U9zTI7O4pbuwJ9lN1qG0VREvUSKB1iF3zVI7Q==", "fjmWP");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[34]] = lllllllIlIIIllI("SH6EEKYyDCHifNR1hBFU8Sst0Jdn0hczuALOzBQSFYdvWoah94FDUw==", "zffcL");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[35]] = lllllllIlIIIlIl("5IFiHXaYeA1FdrV+cFy75SRDpYzKgJAgSCimqf0BDRjxQIkLGxq5Jg==", "WMIIU");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[36]] = lllllllIlIIIllI("tvLbyj0jTa2LqBwNkppx0CrKcuwRzimKMYX4IDtMl39pWyubkeLhwA==", "JgAkw");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[37]] = lllllllIlIIIlIl("45ntYGa4vCOPFvnMxgzf8h4nZt3wRszM5x0er4xpNQ5S4xEIeBizTg==", "pjvna");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[38]] = lllllllIlIIIlIl("7qYCDqmrMZ8coUYdfiwEMT4dmi4j9mWoMLvALrlMsLUo4T991+9WRw==", "XHMHf");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[39]] = lllllllIlIIIlIl("Vx+9L2x0JZ0rus4M7Jwf46bvloolfkDyLNm/4SWGlGay8lhtLr6cv3u5Y3+Qa4vX", "rmdGz");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[10]] = lllllllIlIIIllI("nx6E8QRL8LFfFM4a2DrYOpAypBl1vIAosV4M1E6WdE/IcVUYvIP8TT8RSRPwcm1CKbw13I433KA=", "mwiaY");
        PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[40]] = lllllllIlIIIlll("aysuKlooCjMxDWgOKykbJQ4zKgZoDCYmHCM7NSwZDwEzIAYwDit/VD0S", "FoGEt");
    }
    
    private static boolean lIIIIIIllIlIllIl(final int llllllllllllIlllllIlIIIllllIlIII, final int llllllllllllIlllllIlIIIllllIIlll) {
        return llllllllllllIlllllIlIIIllllIlIII > llllllllllllIlllllIlIIIllllIIlll;
    }
    
    public PooledByteBufAllocator(final int llllllllllllIlllllIlIIlIllIlllII, final int llllllllllllIlllllIlIIlIlllIIIII, final int llllllllllllIlllllIlIIlIllIlllll, final int llllllllllllIlllllIlIIlIllIllllI) {
        this((boolean)(PooledByteBufAllocator.lIlllIIlIIIlII[0] != 0), llllllllllllIlllllIlIIlIllIlllII, llllllllllllIlllllIlIIlIlllIIIII, llllllllllllIlllllIlIIlIllIlllll, llllllllllllIlllllIlIIlIllIllllI);
    }
    
    @Override
    protected ByteBuf newHeapBuffer(final int llllllllllllIlllllIlIIlIIllIIlIl, final int llllllllllllIlllllIlIIlIIllIlIlI) {
        final PoolThreadCache llllllllllllIlllllIlIIlIIllIlIIl = this.threadCache.get();
        final PoolArena<byte[]> llllllllllllIlllllIlIIlIIllIlIII = llllllllllllIlllllIlIIlIIllIlIIl.heapArena;
        ByteBuf llllllllllllIlllllIlIIlIIllIIlll = null;
        if (lIIIIIIllIlIlllI(llllllllllllIlllllIlIIlIIllIlIII)) {
            final ByteBuf llllllllllllIlllllIlIIlIIllIllIl = llllllllllllIlllllIlIIlIIllIlIII.allocate(llllllllllllIlllllIlIIlIIllIlIIl, llllllllllllIlllllIlIIlIIllIIlIl, llllllllllllIlllllIlIIlIIllIlIlI);
            "".length();
            if ("   ".length() < "  ".length()) {
                return null;
            }
        }
        else {
            llllllllllllIlllllIlIIlIIllIIlll = new UnpooledHeapByteBuf(this, llllllllllllIlllllIlIIlIIllIIlIl, llllllllllllIlllllIlIIlIIllIlIlI);
        }
        return AbstractByteBufAllocator.toLeakAwareBuffer(llllllllllllIlllllIlIIlIIllIIlll);
    }
    
    @Deprecated
    public boolean hasThreadLocalCache() {
        return this.threadCache.isSet();
    }
    
    public PooledByteBufAllocator(final boolean llllllllllllIlllllIlIIlIlllIlIII) {
        this(llllllllllllIlllllIlIIlIlllIlIII, PooledByteBufAllocator.DEFAULT_NUM_HEAP_ARENA, PooledByteBufAllocator.DEFAULT_NUM_DIRECT_ARENA, PooledByteBufAllocator.DEFAULT_PAGE_SIZE, PooledByteBufAllocator.DEFAULT_MAX_ORDER);
    }
    
    public PooledByteBufAllocator(final boolean llllllllllllIlllllIlIIlIlIlIllII, final int llllllllllllIlllllIlIIlIlIlIlIll, final int llllllllllllIlllllIlIIlIlIlIlIlI, final int llllllllllllIlllllIlIIlIlIlIlIIl, final int llllllllllllIlllllIlIIlIlIllIIll, final int llllllllllllIlllllIlIIlIlIllIIlI, final int llllllllllllIlllllIlIIlIlIlIIllI, final int llllllllllllIlllllIlIIlIlIlIIlIl) {
        super(llllllllllllIlllllIlIIlIlIlIllII);
        this.threadCache = new PoolThreadLocalCache();
        this.tinyCacheSize = llllllllllllIlllllIlIIlIlIllIIlI;
        this.smallCacheSize = llllllllllllIlllllIlIIlIlIlIIllI;
        this.normalCacheSize = llllllllllllIlllllIlIIlIlIlIIlIl;
        final int llllllllllllIlllllIlIIlIlIlIllll = validateAndCalculateChunkSize(llllllllllllIlllllIlIIlIlIlIlIIl, llllllllllllIlllllIlIIlIlIllIIll);
        if (lIIIIIIllIlIlIIl(llllllllllllIlllllIlIIlIlIlIlIll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[0]]).append(llllllllllllIlllllIlIIlIlIlIlIll).append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[1]])));
        }
        if (lIIIIIIllIlIlIIl(llllllllllllIlllllIlIIlIlIlIlIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[2]]).append(llllllllllllIlllllIlIIlIlIlIlIlI).append(PooledByteBufAllocator.lIllIlIllllIII[PooledByteBufAllocator.lIlllIIlIIIlII[3]])));
        }
        final int llllllllllllIlllllIlIIlIlIlIlllI = validateAndCalculatePageShifts(llllllllllllIlllllIlIIlIlIlIlIIl);
        if (lIIIIIIllIlIlIlI(llllllllllllIlllllIlIIlIlIlIlIll)) {
            this.heapArenas = newArenaArray(llllllllllllIlllllIlIIlIlIlIlIll);
            int llllllllllllIlllllIlIIlIlIlllIlI = PooledByteBufAllocator.lIlllIIlIIIlII[0];
            while (lIIIIIIllIlIlIll(llllllllllllIlllllIlIIlIlIlllIlI, this.heapArenas.length)) {
                this.heapArenas[llllllllllllIlllllIlIIlIlIlllIlI] = new PoolArena.HeapArena(this, llllllllllllIlllllIlIIlIlIlIlIIl, llllllllllllIlllllIlIIlIlIllIIll, llllllllllllIlllllIlIIlIlIlIlllI, llllllllllllIlllllIlIIlIlIlIllll);
                ++llllllllllllIlllllIlIIlIlIlllIlI;
                "".length();
                if (-" ".length() != -" ".length()) {
                    throw null;
                }
            }
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else {
            this.heapArenas = null;
        }
        if (lIIIIIIllIlIlIlI(llllllllllllIlllllIlIIlIlIlIlIlI)) {
            this.directArenas = newArenaArray(llllllllllllIlllllIlIIlIlIlIlIlI);
            int llllllllllllIlllllIlIIlIlIlllIIl = PooledByteBufAllocator.lIlllIIlIIIlII[0];
            while (lIIIIIIllIlIlIll(llllllllllllIlllllIlIIlIlIlllIIl, this.directArenas.length)) {
                this.directArenas[llllllllllllIlllllIlIIlIlIlllIIl] = new PoolArena.DirectArena(this, llllllllllllIlllllIlIIlIlIlIlIIl, llllllllllllIlllllIlIIlIlIllIIll, llllllllllllIlllllIlIIlIlIlIlllI, llllllllllllIlllllIlIIlIlIlIllll);
                ++llllllllllllIlllllIlIIlIlIlllIIl;
                "".length();
                if (-" ".length() > 0) {
                    throw null;
                }
            }
            "".length();
            if (-" ".length() > -" ".length()) {
                throw null;
            }
        }
        else {
            this.directArenas = null;
        }
    }
    
    private static String lllllllIlIIIlIl(final String llllllllllllIlllllIlIIIlllllIlII, final String llllllllllllIlllllIlIIIlllllIIll) {
        try {
            final SecretKeySpec llllllllllllIlllllIlIIIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIIIlllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIlIIIlllllIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIlIIIlllllIllI.init(PooledByteBufAllocator.lIlllIIlIIIlII[2], llllllllllllIlllllIlIIIlllllIlll);
            return new String(llllllllllllIlllllIlIIIlllllIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIIIlllllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlIIIlllllIlIl) {
            llllllllllllIlllllIlIIIlllllIlIl.printStackTrace();
            return null;
        }
    }
    
    final class PoolThreadLocalCache extends FastThreadLocal<PoolThreadCache>
    {
        private final /* synthetic */ AtomicInteger index;
        
        PoolThreadLocalCache() {
            this.index = new AtomicInteger();
        }
        
        @Override
        protected void onRemoval(final PoolThreadCache lllllllllllllIlIIIIlllIllIllllll) {
            lllllllllllllIlIIIIlllIllIllllll.free();
        }
        
        @Override
        protected PoolThreadCache initialValue() {
            final int lllllllllllllIlIIIIlllIlllIIlIII = this.index.getAndIncrement();
            PoolArena<byte[]> lllllllllllllIlIIIIlllIlllIIIlll;
            if (llIIIIIIllIIIll(PooledByteBufAllocator.this.heapArenas)) {
                final PoolArena<byte[]> lllllllllllllIlIIIIlllIlllIIlIll = PooledByteBufAllocator.this.heapArenas[Math.abs(lllllllllllllIlIIIIlllIlllIIlIII % PooledByteBufAllocator.this.heapArenas.length)];
                "".length();
                if (" ".length() <= -" ".length()) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIIIIlllIlllIIIlll = null;
            }
            PoolArena<ByteBuffer> lllllllllllllIlIIIIlllIlllIIIllI = null;
            if (llIIIIIIllIIIll(PooledByteBufAllocator.this.directArenas)) {
                final PoolArena<ByteBuffer> lllllllllllllIlIIIIlllIlllIIlIlI = PooledByteBufAllocator.this.directArenas[Math.abs(lllllllllllllIlIIIIlllIlllIIlIII % PooledByteBufAllocator.this.directArenas.length)];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIIIIlllIlllIIIllI = null;
            }
            return new PoolThreadCache(lllllllllllllIlIIIIlllIlllIIIlll, lllllllllllllIlIIIIlllIlllIIIllI, PooledByteBufAllocator.this.tinyCacheSize, PooledByteBufAllocator.this.smallCacheSize, PooledByteBufAllocator.this.normalCacheSize, PooledByteBufAllocator.DEFAULT_MAX_CACHED_BUFFER_CAPACITY, PooledByteBufAllocator.DEFAULT_CACHE_TRIM_INTERVAL);
        }
        
        private static boolean llIIIIIIllIIIll(final Object lllllllllllllIlIIIIlllIllIllIIll) {
            return lllllllllllllIlIIIIlllIllIllIIll != null;
        }
    }
}
