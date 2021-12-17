// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.internal.logging.InternalLoggerFactory;
import io.netty.util.ThreadDeathWatcher;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.nio.ByteBuffer;
import io.netty.util.internal.logging.InternalLogger;

final class PoolThreadCache
{
    private static final /* synthetic */ InternalLogger logger;
    private final /* synthetic */ MemoryRegionCache<ByteBuffer>[] smallSubPageDirectCaches;
    private final /* synthetic */ MemoryRegionCache<ByteBuffer>[] normalDirectCaches;
    private final /* synthetic */ MemoryRegionCache<byte[]>[] smallSubPageHeapCaches;
    private /* synthetic */ int allocations;
    private final /* synthetic */ int numShiftsNormalDirect;
    final /* synthetic */ PoolArena<byte[]> heapArena;
    private final /* synthetic */ MemoryRegionCache<byte[]>[] normalHeapCaches;
    private final /* synthetic */ Thread thread;
    private final /* synthetic */ int freeSweepAllocationThreshold;
    final /* synthetic */ PoolArena<ByteBuffer> directArena;
    private final /* synthetic */ Runnable freeTask;
    private static final /* synthetic */ int[] llIllllIIlIlII;
    private final /* synthetic */ int numShiftsNormalHeap;
    private final /* synthetic */ MemoryRegionCache<ByteBuffer>[] tinySubPageDirectCaches;
    private static final /* synthetic */ String[] llIllllIIlIIll;
    private final /* synthetic */ MemoryRegionCache<byte[]>[] tinySubPageHeapCaches;
    
    private static int free(final MemoryRegionCache<?>[] llllllllllllIllIIIllllIlIIlIIlIl) {
        if (lIIllIlIlIIIlIll(llllllllllllIllIIIllllIlIIlIIlIl)) {
            return PoolThreadCache.llIllllIIlIlII[0];
        }
        int llllllllllllIllIIIllllIlIIlIIlII = PoolThreadCache.llIllllIIlIlII[0];
        final MemoryRegionCache[] llllllllllllIllIIIllllIlIIlIlIII = llllllllllllIllIIIllllIlIIlIIlIl;
        final int llllllllllllIllIIIllllIlIIlIIlll = llllllllllllIllIIIllllIlIIlIlIII.length;
        int llllllllllllIllIIIllllIlIIlIIllI = PoolThreadCache.llIllllIIlIlII[0];
        while (lIIllIlIlIIIIlll(llllllllllllIllIIIllllIlIIlIIllI, llllllllllllIllIIIllllIlIIlIIlll)) {
            final MemoryRegionCache<?> llllllllllllIllIIIllllIlIIlIlIIl = (MemoryRegionCache<?>)llllllllllllIllIIIllllIlIIlIlIII[llllllllllllIllIIIllllIlIIlIIllI];
            llllllllllllIllIIIllllIlIIlIIlII += free(llllllllllllIllIIIllllIlIIlIlIIl);
            ++llllllllllllIllIIIllllIlIIlIIllI;
            "".length();
            if ("   ".length() == " ".length()) {
                return " ".length() & ~" ".length();
            }
        }
        return llllllllllllIllIIIllllIlIIlIIlII;
    }
    
    private static boolean lIIllIlIlIIIllII(final int llllllllllllIllIIIllllIIlIllIIII, final int llllllllllllIllIIIllllIIlIlIllll) {
        return llllllllllllIllIIIllllIIlIllIIII >= llllllllllllIllIIIllllIIlIlIllll;
    }
    
    private static void trim(final MemoryRegionCache<?>[] llllllllllllIllIIIllllIlIIIIlllI) {
        if (lIIllIlIlIIIlIll(llllllllllllIllIIIllllIlIIIIlllI)) {
            return;
        }
        final MemoryRegionCache[] llllllllllllIllIIIllllIlIIIlIIIl = llllllllllllIllIIIllllIlIIIIlllI;
        final int llllllllllllIllIIIllllIlIIIlIIII = llllllllllllIllIIIllllIlIIIlIIIl.length;
        int llllllllllllIllIIIllllIlIIIIllll = PoolThreadCache.llIllllIIlIlII[0];
        while (lIIllIlIlIIIIlll(llllllllllllIllIIIllllIlIIIIllll, llllllllllllIllIIIllllIlIIIlIIII)) {
            final MemoryRegionCache<?> llllllllllllIllIIIllllIlIIIlIIlI = (MemoryRegionCache<?>)llllllllllllIllIIIllllIlIIIlIIIl[llllllllllllIllIIIllllIlIIIIllll];
            trim(llllllllllllIllIIIllllIlIIIlIIlI);
            ++llllllllllllIllIIIllllIlIIIIllll;
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
    }
    
    private static <T> NormalMemoryRegionCache<T>[] createNormalCaches(final int llllllllllllIllIIIllllIllIIllIII, final int llllllllllllIllIIIllllIllIIlIlll, final PoolArena<T> llllllllllllIllIIIllllIllIIlIIll) {
        if (lIIllIlIlIIIlIIl(llllllllllllIllIIIllllIllIIllIII)) {
            final int llllllllllllIllIIIllllIllIIllIll = Math.min(llllllllllllIllIIIllllIllIIlIIll.chunkSize, llllllllllllIllIIIllllIllIIlIlll);
            final int llllllllllllIllIIIllllIllIIllIlI = Math.max(PoolThreadCache.llIllllIIlIlII[1], llllllllllllIllIIIllllIllIIllIll / llllllllllllIllIIIllllIllIIlIIll.pageSize);
            final NormalMemoryRegionCache<T>[] llllllllllllIllIIIllllIllIIllIIl = (NormalMemoryRegionCache<T>[])new NormalMemoryRegionCache[llllllllllllIllIIIllllIllIIllIlI];
            int llllllllllllIllIIIllllIllIIlllII = PoolThreadCache.llIllllIIlIlII[0];
            while (lIIllIlIlIIIIlll(llllllllllllIllIIIllllIllIIlllII, llllllllllllIllIIIllllIllIIllIIl.length)) {
                llllllllllllIllIIIllllIllIIllIIl[llllllllllllIllIIIllllIllIIlllII] = new NormalMemoryRegionCache<T>(llllllllllllIllIIIllllIllIIllIII);
                ++llllllllllllIllIIIllllIllIIlllII;
                "".length();
                if (-" ".length() > "  ".length()) {
                    return null;
                }
            }
            return llllllllllllIllIIIllllIllIIllIIl;
        }
        return null;
    }
    
    private static int log2(int llllllllllllIllIIIllllIllIIIlIlI) {
        int llllllllllllIllIIIllllIllIIIlIll = PoolThreadCache.llIllllIIlIlII[0];
        while (lIIllIlIlIIIlIlI((int)llllllllllllIllIIIllllIllIIIlIlI, PoolThreadCache.llIllllIIlIlII[1])) {
            llllllllllllIllIIIllllIllIIIlIlI >>= PoolThreadCache.llIllllIIlIlII[1];
            ++llllllllllllIllIIIllllIllIIIlIll;
            "".length();
            if (null != null) {
                return (0xAD ^ 0xA6) & ~(0x47 ^ 0x4C);
            }
        }
        return llllllllllllIllIIIllllIllIIIlIll;
    }
    
    private static <T> SubPageMemoryRegionCache<T>[] createSubPageCaches(final int llllllllllllIllIIIllllIllIlIIlll, final int llllllllllllIllIIIllllIllIlIlIII) {
        if (lIIllIlIlIIIlIIl(llllllllllllIllIIIllllIllIlIIlll)) {
            final SubPageMemoryRegionCache<T>[] llllllllllllIllIIIllllIllIlIlIlI = (SubPageMemoryRegionCache<T>[])new SubPageMemoryRegionCache[llllllllllllIllIIIllllIllIlIlIII];
            int llllllllllllIllIIIllllIllIlIlIll = PoolThreadCache.llIllllIIlIlII[0];
            while (lIIllIlIlIIIIlll(llllllllllllIllIIIllllIllIlIlIll, llllllllllllIllIIIllllIllIlIlIlI.length)) {
                llllllllllllIllIIIllllIllIlIlIlI[llllllllllllIllIIIllllIllIlIlIll] = new SubPageMemoryRegionCache<T>(llllllllllllIllIIIllllIllIlIIlll);
                ++llllllllllllIllIIIllllIllIlIlIll;
                "".length();
                if (((0xD4 ^ 0xC4) & ~(0x67 ^ 0x77)) >= "  ".length()) {
                    return null;
                }
            }
            return llllllllllllIllIIIllllIllIlIlIlI;
        }
        return null;
    }
    
    private static boolean lIIllIlIlIIIllIl(final int llllllllllllIllIIIllllIIlIlIIIIl) {
        return llllllllllllIllIIIllllIIlIlIIIIl != 0;
    }
    
    private static boolean lIIllIlIlIIIIlll(final int llllllllllllIllIIIllllIIlIlIllII, final int llllllllllllIllIIIllllIIlIlIlIll) {
        return llllllllllllIllIIIllllIIlIlIllII < llllllllllllIllIIIllllIIlIlIlIll;
    }
    
    private static String lIIllIlIlIIIIIll(final String llllllllllllIllIIIllllIIlIllIllI, final String llllllllllllIllIIIllllIIlIllIlll) {
        try {
            final SecretKeySpec llllllllllllIllIIIllllIIlIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllllIIlIllIlll.getBytes(StandardCharsets.UTF_8)), PoolThreadCache.llIllllIIlIlII[8]), "DES");
            final Cipher llllllllllllIllIIIllllIIlIlllIlI = Cipher.getInstance("DES");
            llllllllllllIllIIIllllIIlIlllIlI.init(PoolThreadCache.llIllllIIlIlII[2], llllllllllllIllIIIllllIIlIlllIll);
            return new String(llllllllllllIllIIIllllIIlIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllllIIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllllIIlIlllIIl) {
            llllllllllllIllIIIllllIIlIlllIIl.printStackTrace();
            return null;
        }
    }
    
    private static int free(final MemoryRegionCache<?> llllllllllllIllIIIllllIlIIIllIll) {
        if (lIIllIlIlIIIlIll(llllllllllllIllIIIllllIlIIIllIll)) {
            return PoolThreadCache.llIllllIIlIlII[0];
        }
        return llllllllllllIllIIIllllIlIIIllIll.free();
    }
    
    private void free0() {
        final int llllllllllllIllIIIllllIlIIllIIlI = free(this.tinySubPageDirectCaches) + free(this.smallSubPageDirectCaches) + free(this.normalDirectCaches) + free(this.tinySubPageHeapCaches) + free(this.smallSubPageHeapCaches) + free(this.normalHeapCaches);
        if (lIIllIlIlIIIlIIl(llllllllllllIllIIIllllIlIIllIIlI) && lIIllIlIlIIIllIl(PoolThreadCache.logger.isDebugEnabled() ? 1 : 0)) {
            PoolThreadCache.logger.debug(PoolThreadCache.llIllllIIlIIll[PoolThreadCache.llIllllIIlIlII[6]], (Object)llllllllllllIllIIIllllIlIIllIIlI, this.thread.getName());
        }
    }
    
    private boolean allocate(final MemoryRegionCache<?> llllllllllllIllIIIllllIlIlIlIIII, final PooledByteBuf llllllllllllIllIIIllllIlIlIlIlII, final int llllllllllllIllIIIllllIlIlIlIIll) {
        if (lIIllIlIlIIIlIll(llllllllllllIllIIIllllIlIlIlIIII)) {
            return PoolThreadCache.llIllllIIlIlII[0] != 0;
        }
        final boolean llllllllllllIllIIIllllIlIlIlIIlI = llllllllllllIllIIIllllIlIlIlIIII.allocate(llllllllllllIllIIIllllIlIlIlIlII, llllllllllllIllIIIllllIlIlIlIIll);
        final int n = this.allocations + PoolThreadCache.llIllllIIlIlII[1];
        this.allocations = n;
        if (lIIllIlIlIIIllII(n, this.freeSweepAllocationThreshold)) {
            this.allocations = PoolThreadCache.llIllllIIlIlII[0];
            this.trim();
        }
        return llllllllllllIllIIIllllIlIlIlIIlI;
    }
    
    boolean add(final PoolArena<?> llllllllllllIllIIIllllIlIIllllIl, final PoolChunk llllllllllllIllIIIllllIlIlIIIIlI, final long llllllllllllIllIIIllllIlIlIIIIIl, final int llllllllllllIllIIIllllIlIlIIIIII) {
        MemoryRegionCache<?> llllllllllllIllIIIllllIlIIllllll = null;
        if (lIIllIlIlIIIllIl(llllllllllllIllIIIllllIlIIllllIl.isTinyOrSmall(llllllllllllIllIIIllllIlIlIIIIII) ? 1 : 0)) {
            if (lIIllIlIlIIIllIl(PoolArena.isTiny(llllllllllllIllIIIllllIlIlIIIIII) ? 1 : 0)) {
                final MemoryRegionCache<?> llllllllllllIllIIIllllIlIlIIIllI = this.cacheForTiny(llllllllllllIllIIIllllIlIIllllIl, llllllllllllIllIIIllllIlIlIIIIII);
                "".length();
                if (" ".length() > "   ".length()) {
                    return ((93 + 159 - 100 + 41 ^ 80 + 39 - 78 + 92) & (16 + 191 - 122 + 166 ^ 38 + 190 - 94 + 57 ^ -" ".length())) != 0x0;
                }
            }
            else {
                final MemoryRegionCache<?> llllllllllllIllIIIllllIlIlIIIlIl = this.cacheForSmall(llllllllllllIllIIIllllIlIIllllIl, llllllllllllIllIIIllllIlIlIIIIII);
                "".length();
                if (-" ".length() == ((0x76 ^ 0x48) & ~(0x2C ^ 0x12))) {
                    return ((0xE1 ^ 0xC0) & ~(0x8C ^ 0xAD)) != 0x0;
                }
            }
        }
        else {
            llllllllllllIllIIIllllIlIIllllll = this.cacheForNormal(llllllllllllIllIIIllllIlIIllllIl, llllllllllllIllIIIllllIlIlIIIIII);
        }
        if (lIIllIlIlIIIlIll(llllllllllllIllIIIllllIlIIllllll)) {
            return PoolThreadCache.llIllllIIlIlII[0] != 0;
        }
        return llllllllllllIllIIIllllIlIIllllll.add(llllllllllllIllIIIllllIlIlIIIIlI, llllllllllllIllIIIllllIlIlIIIIIl);
    }
    
    boolean allocateNormal(final PoolArena<?> llllllllllllIllIIIllllIlIlIlllll, final PooledByteBuf<?> llllllllllllIllIIIllllIlIlIllllI, final int llllllllllllIllIIIllllIlIllIIIlI, final int llllllllllllIllIIIllllIlIlIlllII) {
        return this.allocate(this.cacheForNormal(llllllllllllIllIIIllllIlIlIlllll, llllllllllllIllIIIllllIlIlIlllII), llllllllllllIllIIIllllIlIlIllllI, llllllllllllIllIIIllllIlIllIIIlI);
    }
    
    private static String lIIllIlIlIIIIIlI(String llllllllllllIllIIIllllIIllIIlIII, final String llllllllllllIllIIIllllIIllIIIlll) {
        llllllllllllIllIIIllllIIllIIlIII = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIllllIIllIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllllIIllIIlIll = new StringBuilder();
        final char[] llllllllllllIllIIIllllIIllIIlIlI = llllllllllllIllIIIllllIIllIIIlll.toCharArray();
        int llllllllllllIllIIIllllIIllIIlIIl = PoolThreadCache.llIllllIIlIlII[0];
        final byte llllllllllllIllIIIllllIIllIIIIll = (Object)((String)llllllllllllIllIIIllllIIllIIlIII).toCharArray();
        final long llllllllllllIllIIIllllIIllIIIIlI = llllllllllllIllIIIllllIIllIIIIll.length;
        Exception llllllllllllIllIIIllllIIllIIIIIl = (Exception)PoolThreadCache.llIllllIIlIlII[0];
        while (lIIllIlIlIIIIlll((int)llllllllllllIllIIIllllIIllIIIIIl, (int)llllllllllllIllIIIllllIIllIIIIlI)) {
            final char llllllllllllIllIIIllllIIllIIlllI = llllllllllllIllIIIllllIIllIIIIll[llllllllllllIllIIIllllIIllIIIIIl];
            llllllllllllIllIIIllllIIllIIlIll.append((char)(llllllllllllIllIIIllllIIllIIlllI ^ llllllllllllIllIIIllllIIllIIlIlI[llllllllllllIllIIIllllIIllIIlIIl % llllllllllllIllIIIllllIIllIIlIlI.length]));
            "".length();
            ++llllllllllllIllIIIllllIIllIIlIIl;
            ++llllllllllllIllIIIllllIIllIIIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllllIIllIIlIll);
    }
    
    boolean allocateTiny(final PoolArena<?> llllllllllllIllIIIllllIllIIIIIlI, final PooledByteBuf<?> llllllllllllIllIIIllllIlIlllllII, final int llllllllllllIllIIIllllIlIllllIll, final int llllllllllllIllIIIllllIlIllllIlI) {
        return this.allocate(this.cacheForTiny(llllllllllllIllIIIllllIllIIIIIlI, llllllllllllIllIIIllllIlIllllIlI), llllllllllllIllIIIllllIlIlllllII, llllllllllllIllIIIllllIlIllllIll);
    }
    
    private static void lIIllIlIlIIIIlIl() {
        (llIllllIIlIlII = new int[9])[0] = ((0x0 ^ 0x45) & ~(0xDC ^ 0x99));
        PoolThreadCache.llIllllIIlIlII[1] = " ".length();
        PoolThreadCache.llIllllIIlIlII[2] = "  ".length();
        PoolThreadCache.llIllllIIlIlII[3] = "   ".length();
        PoolThreadCache.llIllllIIlIlII[4] = (0xA0 ^ 0x88 ^ (0x2A ^ 0x22));
        PoolThreadCache.llIllllIIlIlII[5] = -" ".length();
        PoolThreadCache.llIllllIIlIlII[6] = (7 + 42 + 47 + 32 ^ 128 + 66 - 144 + 82);
        PoolThreadCache.llIllllIIlIlII[7] = (0x82 ^ 0xAD ^ (0x26 ^ 0xC));
        PoolThreadCache.llIllllIIlIlII[8] = (0x84 ^ 0x8C);
    }
    
    private static void trim(final MemoryRegionCache<?> llllllllllllIllIIIllllIlIIIIIllI) {
        if (lIIllIlIlIIIlIll(llllllllllllIllIIIllllIlIIIIIllI)) {
            return;
        }
        ((MemoryRegionCache<Object>)llllllllllllIllIIIllllIlIIIIIllI).trim();
    }
    
    private static boolean lIIllIlIlIIIlIll(final Object llllllllllllIllIIIllllIIlIlIIIll) {
        return llllllllllllIllIIIllllIIlIlIIIll == null;
    }
    
    private MemoryRegionCache<?> cacheForNormal(final PoolArena<?> llllllllllllIllIIIllllIIlllIIlll, final int llllllllllllIllIIIllllIIlllIIllI) {
        if (lIIllIlIlIIIllIl(llllllllllllIllIIIllllIIlllIIlll.isDirect() ? 1 : 0)) {
            final int llllllllllllIllIIIllllIIlllIlIIl = log2(llllllllllllIllIIIllllIIlllIIllI >> this.numShiftsNormalDirect);
            return cache((MemoryRegionCache<?>[])this.normalDirectCaches, llllllllllllIllIIIllllIIlllIlIIl);
        }
        final int llllllllllllIllIIIllllIIlllIIlIl = log2(llllllllllllIllIIIllllIIlllIIllI >> this.numShiftsNormalHeap);
        return cache((MemoryRegionCache<?>[])this.normalHeapCaches, llllllllllllIllIIIllllIIlllIIlIl);
    }
    
    void free() {
        ThreadDeathWatcher.unwatch(this.thread, this.freeTask);
        this.free0();
    }
    
    private static boolean lIIllIlIlIIIIllI(final int llllllllllllIllIIIllllIIlIIlllll) {
        return llllllllllllIllIIIllllIIlIIlllll < 0;
    }
    
    void trim() {
        trim(this.tinySubPageDirectCaches);
        trim(this.smallSubPageDirectCaches);
        trim(this.normalDirectCaches);
        trim(this.tinySubPageHeapCaches);
        trim(this.smallSubPageHeapCaches);
        trim(this.normalHeapCaches);
    }
    
    private static boolean lIIllIlIlIIIlIlI(final int llllllllllllIllIIIllllIIlIlIlIII, final int llllllllllllIllIIIllllIIlIlIIlll) {
        return llllllllllllIllIIIllllIIlIlIlIII > llllllllllllIllIIIllllIIlIlIIlll;
    }
    
    private static boolean lIIllIlIlIIIlIIl(final int llllllllllllIllIIIllllIIlIIlllIl) {
        return llllllllllllIllIIIllllIIlIIlllIl > 0;
    }
    
    private MemoryRegionCache<?> cacheForSmall(final PoolArena<?> llllllllllllIllIIIllllIIllllIIII, final int llllllllllllIllIIIllllIIlllIllll) {
        final int llllllllllllIllIIIllllIIllllIIlI = PoolArena.smallIdx(llllllllllllIllIIIllllIIlllIllll);
        if (lIIllIlIlIIIllIl(llllllllllllIllIIIllllIIllllIIII.isDirect() ? 1 : 0)) {
            return cache((MemoryRegionCache<?>[])this.smallSubPageDirectCaches, llllllllllllIllIIIllllIIllllIIlI);
        }
        return cache((MemoryRegionCache<?>[])this.smallSubPageHeapCaches, llllllllllllIllIIIllllIIllllIIlI);
    }
    
    private static <T> MemoryRegionCache<T> cache(final MemoryRegionCache<T>[] llllllllllllIllIIIllllIIllIlllII, final int llllllllllllIllIIIllllIIllIlllIl) {
        if (!lIIllIlIlIIIlIII(llllllllllllIllIIIllllIIllIlllII) || lIIllIlIlIIIlIlI(llllllllllllIllIIIllllIIllIlllIl, llllllllllllIllIIIllllIIllIlllII.length - PoolThreadCache.llIllllIIlIlII[1])) {
            return null;
        }
        return llllllllllllIllIIIllllIIllIlllII[llllllllllllIllIIIllllIIllIlllIl];
    }
    
    static {
        lIIllIlIlIIIIlIl();
        lIIllIlIlIIIIlII();
        logger = InternalLoggerFactory.getInstance(PoolThreadCache.class);
    }
    
    private static void lIIllIlIlIIIIlII() {
        (llIllllIIlIIll = new String[PoolThreadCache.llIllllIIlIlII[7]])[PoolThreadCache.llIllllIIlIlII[0]] = lIIllIlIlIIIIIlI("JzgONQspMRMSKD8/EBMYCTgGFwkjLQ9MSg==", "JYvvj");
        PoolThreadCache.llIllllIIlIIll[PoolThreadCache.llIllllIIlIlII[1]] = lIIllIlIlIIIIIll("63tcLX/73B4KS0NBevXVq2cVUrCpEtYO", "QxtGk");
        PoolThreadCache.llIllllIIlIIll[PoolThreadCache.llIllllIIlIlII[2]] = lIIllIlIlIIIIIlI("DAgsEgEdHywHEwYWJhQzHhMmGQYCCCwEOgUWLU1y", "jzIwR");
        PoolThreadCache.llIllllIIlIIll[PoolThreadCache.llIllllIIlIlII[3]] = lIIllIlIlIIIIIll("qnsoxAtxtcGIrnLxKy4DYXl8g0tlpRyu", "Lplyn");
        PoolThreadCache.llIllllIIlIIll[PoolThreadCache.llIllllIIlIlII[6]] = lIIllIlIlIIIIIll("UR55XSEP/fZID4TCAjbUO2J95YaaO6yRd+t3WS+YUwX6CFqpD7o57l16Lejavffg", "sEDPK");
    }
    
    PoolThreadCache(final PoolArena<byte[]> llllllllllllIllIIIllllIllIlllllI, final PoolArena<ByteBuffer> llllllllllllIllIIIllllIllIllIlIl, final int llllllllllllIllIIIllllIllIllIlII, final int llllllllllllIllIIIllllIllIlllIll, final int llllllllllllIllIIIllllIllIlllIlI, final int llllllllllllIllIIIllllIllIlllIIl, final int llllllllllllIllIIIllllIllIlllIII) {
        this.thread = Thread.currentThread();
        this.freeTask = new Runnable() {
            @Override
            public void run() {
                PoolThreadCache.this.free0();
            }
        };
        if (lIIllIlIlIIIIllI(llllllllllllIllIIIllllIllIlllIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(PoolThreadCache.llIllllIIlIIll[PoolThreadCache.llIllllIIlIlII[0]]).append(llllllllllllIllIIIllllIllIlllIIl).append(PoolThreadCache.llIllllIIlIIll[PoolThreadCache.llIllllIIlIlII[1]])));
        }
        if (lIIllIlIlIIIIlll(llllllllllllIllIIIllllIllIlllIII, PoolThreadCache.llIllllIIlIlII[1])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(PoolThreadCache.llIllllIIlIIll[PoolThreadCache.llIllllIIlIlII[2]]).append(llllllllllllIllIIIllllIllIlllIIl).append(PoolThreadCache.llIllllIIlIIll[PoolThreadCache.llIllllIIlIlII[3]])));
        }
        this.freeSweepAllocationThreshold = llllllllllllIllIIIllllIllIlllIII;
        this.heapArena = llllllllllllIllIIIllllIllIlllllI;
        this.directArena = llllllllllllIllIIIllllIllIllIlIl;
        if (lIIllIlIlIIIlIII(llllllllllllIllIIIllllIllIllIlIl)) {
            this.tinySubPageDirectCaches = (MemoryRegionCache<ByteBuffer>[])createSubPageCaches(llllllllllllIllIIIllllIllIllIlII, PoolThreadCache.llIllllIIlIlII[4]);
            this.smallSubPageDirectCaches = (MemoryRegionCache<ByteBuffer>[])createSubPageCaches(llllllllllllIllIIIllllIllIlllIll, llllllllllllIllIIIllllIllIllIlIl.numSmallSubpagePools);
            this.numShiftsNormalDirect = log2(llllllllllllIllIIIllllIllIllIlIl.pageSize);
            this.normalDirectCaches = createNormalCaches(llllllllllllIllIIIllllIllIlllIlI, llllllllllllIllIIIllllIllIlllIIl, llllllllllllIllIIIllllIllIllIlIl);
            "".length();
            if (" ".length() == ((0xA1 ^ 0xB5 ^ (0x3E ^ 0xB)) & (0x2E ^ 0x30 ^ (0x1C ^ 0x23) ^ -" ".length()))) {
                throw null;
            }
        }
        else {
            this.tinySubPageDirectCaches = null;
            this.smallSubPageDirectCaches = null;
            this.normalDirectCaches = null;
            this.numShiftsNormalDirect = PoolThreadCache.llIllllIIlIlII[5];
        }
        if (lIIllIlIlIIIlIII(llllllllllllIllIIIllllIllIlllllI)) {
            this.tinySubPageHeapCaches = (MemoryRegionCache<byte[]>[])createSubPageCaches(llllllllllllIllIIIllllIllIllIlII, PoolThreadCache.llIllllIIlIlII[4]);
            this.smallSubPageHeapCaches = (MemoryRegionCache<byte[]>[])createSubPageCaches(llllllllllllIllIIIllllIllIlllIll, llllllllllllIllIIIllllIllIlllllI.numSmallSubpagePools);
            this.numShiftsNormalHeap = log2(llllllllllllIllIIIllllIllIlllllI.pageSize);
            this.normalHeapCaches = createNormalCaches(llllllllllllIllIIIllllIllIlllIlI, llllllllllllIllIIIllllIllIlllIIl, llllllllllllIllIIIllllIllIlllllI);
            "".length();
            if ("   ".length() <= 0) {
                throw null;
            }
        }
        else {
            this.tinySubPageHeapCaches = null;
            this.smallSubPageHeapCaches = null;
            this.normalHeapCaches = null;
            this.numShiftsNormalHeap = PoolThreadCache.llIllllIIlIlII[5];
        }
        ThreadDeathWatcher.watch(this.thread, this.freeTask);
    }
    
    private static boolean lIIllIlIlIIIlIII(final Object llllllllllllIllIIIllllIIlIlIIlIl) {
        return llllllllllllIllIIIllllIIlIlIIlIl != null;
    }
    
    boolean allocateSmall(final PoolArena<?> llllllllllllIllIIIllllIlIllIlllI, final PooledByteBuf<?> llllllllllllIllIIIllllIlIllIllIl, final int llllllllllllIllIIIllllIlIllIllII, final int llllllllllllIllIIIllllIlIllIlIll) {
        return this.allocate(this.cacheForSmall(llllllllllllIllIIIllllIlIllIlllI, llllllllllllIllIIIllllIlIllIlIll), llllllllllllIllIIIllllIlIllIllIl, llllllllllllIllIIIllllIlIllIllII);
    }
    
    private MemoryRegionCache<?> cacheForTiny(final PoolArena<?> llllllllllllIllIIIllllIIllllllII, final int llllllllllllIllIIIllllIIllllllll) {
        final int llllllllllllIllIIIllllIIlllllllI = PoolArena.tinyIdx(llllllllllllIllIIIllllIIllllllll);
        if (lIIllIlIlIIIllIl(llllllllllllIllIIIllllIIllllllII.isDirect() ? 1 : 0)) {
            return cache((MemoryRegionCache<?>[])this.tinySubPageDirectCaches, llllllllllllIllIIIllllIIlllllllI);
        }
        return cache((MemoryRegionCache<?>[])this.tinySubPageHeapCaches, llllllllllllIllIIIllllIIlllllllI);
    }
    
    private static final class SubPageMemoryRegionCache<T> extends MemoryRegionCache<T>
    {
        @Override
        protected void initBuf(final PoolChunk<T> llllllllllllIlIllllIIlIlIlIlllIl, final long llllllllllllIlIllllIIlIlIlIllIII, final PooledByteBuf<T> llllllllllllIlIllllIIlIlIlIlIlll, final int llllllllllllIlIllllIIlIlIlIlIllI) {
            llllllllllllIlIllllIIlIlIlIlllIl.initBufWithSubpage(llllllllllllIlIllllIIlIlIlIlIlll, llllllllllllIlIllllIIlIlIlIllIII, llllllllllllIlIllllIIlIlIlIlIllI);
        }
        
        SubPageMemoryRegionCache(final int llllllllllllIlIllllIIlIlIllIIlIl) {
            super(llllllllllllIlIllllIIlIlIllIIlIl);
        }
    }
    
    private abstract static class MemoryRegionCache<T>
    {
        private static final /* synthetic */ int[] lIIlIllIIlIIIl;
        private final /* synthetic */ Entry<T>[] entries;
        private /* synthetic */ int entriesInUse;
        private final /* synthetic */ int maxUnusedCached;
        private /* synthetic */ int tail;
        private /* synthetic */ int head;
        private /* synthetic */ int maxEntriesInUse;
        
        private static boolean llIlIIIllllIlll(final Object lllllllllllllIIllIIlIlIlIIIIllll) {
            return lllllllllllllIIllIIlIlIlIIIIllll != null;
        }
        
        private int nextIdx(final int lllllllllllllIIllIIlIlIlIIIllllI) {
            return lllllllllllllIIllIIlIlIlIIIllllI + MemoryRegionCache.lIIlIllIIlIIIl[2] & this.entries.length - MemoryRegionCache.lIIlIllIIlIIIl[2];
        }
        
        private void trim() {
            int lllllllllllllIIllIIlIlIlIIllIIll = this.size() - this.maxEntriesInUse;
            this.entriesInUse = MemoryRegionCache.lIIlIllIIlIIIl[0];
            this.maxEntriesInUse = MemoryRegionCache.lIIlIllIIlIIIl[0];
            if (llIlIIIllllIllI(lllllllllllllIIllIIlIlIlIIllIIll, this.maxUnusedCached)) {
                return;
            }
            int lllllllllllllIIllIIlIlIlIIllIIlI = this.head;
            while (llIlIIIlllllIlI(lllllllllllllIIllIIlIlIlIIllIIll)) {
                if (llIlIIIlllllIll(freeEntry(this.entries[lllllllllllllIIllIIlIlIlIIllIIlI]) ? 1 : 0)) {
                    return;
                }
                lllllllllllllIIllIIlIlIlIIllIIlI = this.nextIdx(lllllllllllllIIllIIlIlIlIIllIIlI);
                --lllllllllllllIIllIIlIlIlIIllIIll;
                "".length();
                if (((27 + 14 - 33 + 145 ^ 97 + 114 - 92 + 39) & (0x4C ^ 0x25 ^ (0xC4 ^ 0xAA) ^ -" ".length())) < 0) {
                    return;
                }
            }
        }
        
        private static void llIlIIIllllIlII() {
            (lIIlIllIIlIIIl = new int[6])[0] = ((56 + 104 - 74 + 44 ^ 87 + 86 + 1 + 21) & (0xC2 ^ 0x8B ^ (0x43 ^ 0x4B) ^ -" ".length()));
            MemoryRegionCache.lIIlIllIIlIIIl[1] = "  ".length();
            MemoryRegionCache.lIIlIllIIlIIIl[2] = " ".length();
            MemoryRegionCache.lIIlIllIIlIIIl[3] = (18 + 17 + 67 + 37 ^ 13 + 61 + 13 + 56);
            MemoryRegionCache.lIIlIllIIlIIIl[4] = (54 + 129 - 63 + 34 ^ 69 + 29 - 28 + 76);
            MemoryRegionCache.lIIlIllIIlIIIl[5] = (0x5E ^ 0x5B ^ (0x3F ^ 0x2A));
        }
        
        private int size() {
            return this.tail - this.head & this.entries.length - MemoryRegionCache.lIIlIllIIlIIIl[2];
        }
        
        private static boolean llIlIIIllllIllI(final int lllllllllllllIIllIIlIlIlIIIlIIlI, final int lllllllllllllIIllIIlIlIlIIIlIIIl) {
            return lllllllllllllIIllIIlIlIlIIIlIIlI <= lllllllllllllIIllIIlIlIlIIIlIIIl;
        }
        
        private static boolean llIlIIIlllllIIl(final int lllllllllllllIIllIIlIlIlIIIIlIll) {
            return lllllllllllllIIllIIlIlIlIIIIlIll != 0;
        }
        
        public int free() {
            int lllllllllllllIIllIIlIlIlIIlllIll = MemoryRegionCache.lIIlIllIIlIIIl[0];
            this.entriesInUse = MemoryRegionCache.lIIlIllIIlIIIl[0];
            this.maxEntriesInUse = MemoryRegionCache.lIIlIllIIlIIIl[0];
            int lllllllllllllIIllIIlIlIlIIllllIl = this.head;
            while (llIlIIIlllllIIl(freeEntry(this.entries[lllllllllllllIIllIIlIlIlIIllllIl]) ? 1 : 0)) {
                ++lllllllllllllIIllIIlIlIlIIlllIll;
                "".length();
                if (null != null) {
                    return (95 + 34 + 49 + 19 ^ 8 + 141 - 84 + 77) & (0x1C ^ 0x51 ^ (0xB2 ^ 0xB4) ^ -" ".length());
                }
                lllllllllllllIIllIIlIlIlIIllllIl = this.nextIdx(lllllllllllllIIllIIlIlIlIIllllIl);
                "".length();
                if (" ".length() < 0) {
                    return (0xFC ^ 0xB9) & ~(0x2F ^ 0x6A);
                }
            }
            return lllllllllllllIIllIIlIlIlIIlllIll;
        }
        
        public boolean add(final PoolChunk<T> lllllllllllllIIllIIlIlIlIlIIllll, final long lllllllllllllIIllIIlIlIlIlIlIIlI) {
            final Entry<T> lllllllllllllIIllIIlIlIlIlIlIIIl = this.entries[this.tail];
            if (llIlIIIllllIlll(lllllllllllllIIllIIlIlIlIlIlIIIl.chunk)) {
                return MemoryRegionCache.lIIlIllIIlIIIl[0] != 0;
            }
            this.entriesInUse -= MemoryRegionCache.lIIlIllIIlIIIl[2];
            lllllllllllllIIllIIlIlIlIlIlIIIl.chunk = lllllllllllllIIllIIlIlIlIlIIllll;
            lllllllllllllIIllIIlIlIlIlIlIIIl.handle = lllllllllllllIIllIIlIlIlIlIlIIlI;
            this.tail = this.nextIdx(this.tail);
            return MemoryRegionCache.lIIlIllIIlIIIl[2] != 0;
        }
        
        public boolean allocate(final PooledByteBuf<T> lllllllllllllIIllIIlIlIlIlIIIIll, final int lllllllllllllIIllIIlIlIlIlIIIIlI) {
            final Entry<T> lllllllllllllIIllIIlIlIlIlIIIlIl = this.entries[this.head];
            if (llIlIIIlllllIII(lllllllllllllIIllIIlIlIlIlIIIlIl.chunk)) {
                return MemoryRegionCache.lIIlIllIIlIIIl[0] != 0;
            }
            this.entriesInUse += MemoryRegionCache.lIIlIllIIlIIIl[2];
            if (llIlIIIllllIlIl(this.maxEntriesInUse, this.entriesInUse)) {
                this.maxEntriesInUse = this.entriesInUse;
            }
            this.initBuf(lllllllllllllIIllIIlIlIlIlIIIlIl.chunk, lllllllllllllIIllIIlIlIlIlIIIlIl.handle, lllllllllllllIIllIIlIlIlIlIIIIll, lllllllllllllIIllIIlIlIlIlIIIIlI);
            lllllllllllllIIllIIlIlIlIlIIIlIl.chunk = null;
            this.head = this.nextIdx(this.head);
            return MemoryRegionCache.lIIlIllIIlIIIl[2] != 0;
        }
        
        private static int powerOfTwo(int lllllllllllllIIllIIlIlIlIlIllIlI) {
            if (llIlIIIllllIllI(lllllllllllllIIllIIlIlIlIlIllIlI, MemoryRegionCache.lIIlIllIIlIIIl[1])) {
                return MemoryRegionCache.lIIlIllIIlIIIl[1];
            }
            lllllllllllllIIllIIlIlIlIlIllIlI = (--lllllllllllllIIllIIlIlIlIlIllIlI | lllllllllllllIIllIIlIlIlIlIllIlI >> MemoryRegionCache.lIIlIllIIlIIIl[2]);
            lllllllllllllIIllIIlIlIlIlIllIlI |= lllllllllllllIIllIIlIlIlIlIllIlI >> MemoryRegionCache.lIIlIllIIlIIIl[1];
            lllllllllllllIIllIIlIlIlIlIllIlI |= lllllllllllllIIllIIlIlIlIlIllIlI >> MemoryRegionCache.lIIlIllIIlIIIl[3];
            lllllllllllllIIllIIlIlIlIlIllIlI |= lllllllllllllIIllIIlIlIlIlIllIlI >> MemoryRegionCache.lIIlIllIIlIIIl[4];
            lllllllllllllIIllIIlIlIlIlIllIlI |= lllllllllllllIIllIIlIlIlIlIllIlI >> MemoryRegionCache.lIIlIllIIlIIIl[5];
            return ++lllllllllllllIIllIIlIlIlIlIllIlI;
        }
        
        private static boolean llIlIIIlllllIll(final int lllllllllllllIIllIIlIlIlIIIIlIIl) {
            return lllllllllllllIIllIIlIlIlIIIIlIIl == 0;
        }
        
        MemoryRegionCache(final int lllllllllllllIIllIIlIlIlIlIlllIl) {
            this.entries = (Entry<T>[])new Entry[powerOfTwo(lllllllllllllIIllIIlIlIlIlIlllIl)];
            int lllllllllllllIIllIIlIlIlIllIIIIl = MemoryRegionCache.lIIlIllIIlIIIl[0];
            while (llIlIIIllllIlIl(lllllllllllllIIllIIlIlIlIllIIIIl, this.entries.length)) {
                this.entries[lllllllllllllIIllIIlIlIlIllIIIIl] = new Entry<T>();
                ++lllllllllllllIIllIIlIlIlIllIIIIl;
                "".length();
                if (null != null) {
                    throw null;
                }
            }
            this.maxUnusedCached = lllllllllllllIIllIIlIlIlIlIlllIl / MemoryRegionCache.lIIlIllIIlIIIl[1];
        }
        
        private static boolean freeEntry(final Entry lllllllllllllIIllIIlIlIlIIlIlIII) {
            final PoolChunk lllllllllllllIIllIIlIlIlIIlIlIIl = lllllllllllllIIllIIlIlIlIIlIlIII.chunk;
            if (llIlIIIlllllIII(lllllllllllllIIllIIlIlIlIIlIlIIl)) {
                return MemoryRegionCache.lIIlIllIIlIIIl[0] != 0;
            }
            synchronized (lllllllllllllIIllIIlIlIlIIlIlIIl.arena) {
                lllllllllllllIIllIIlIlIlIIlIlIIl.parent.free(lllllllllllllIIllIIlIlIlIIlIlIIl, lllllllllllllIIllIIlIlIlIIlIlIII.handle);
                // monitorexit(lllllllllllllIIllIIlIlIlIIlIlIIl.arena)
                "".length();
                if (((0x44 ^ 0xE) & ~(0x77 ^ 0x3D)) != 0x0) {
                    return ((0x8D ^ 0x9C) & ~(0x5C ^ 0x4D)) != 0x0;
                }
            }
            lllllllllllllIIllIIlIlIlIIlIlIII.chunk = null;
            return MemoryRegionCache.lIIlIllIIlIIIl[2] != 0;
        }
        
        static {
            llIlIIIllllIlII();
        }
        
        private static boolean llIlIIIllllIlIl(final int lllllllllllllIIllIIlIlIlIIIlIllI, final int lllllllllllllIIllIIlIlIlIIIlIlIl) {
            return lllllllllllllIIllIIlIlIlIIIlIllI < lllllllllllllIIllIIlIlIlIIIlIlIl;
        }
        
        protected abstract void initBuf(final PoolChunk<T> p0, final long p1, final PooledByteBuf<T> p2, final int p3);
        
        private static boolean llIlIIIlllllIII(final Object lllllllllllllIIllIIlIlIlIIIIllIl) {
            return lllllllllllllIIllIIlIlIlIIIIllIl == null;
        }
        
        private static boolean llIlIIIlllllIlI(final int lllllllllllllIIllIIlIlIlIIIIIlll) {
            return lllllllllllllIIllIIlIlIlIIIIIlll > 0;
        }
        
        private static final class Entry<T>
        {
            /* synthetic */ PoolChunk<T> chunk;
            /* synthetic */ long handle;
        }
    }
    
    private static final class NormalMemoryRegionCache<T> extends MemoryRegionCache<T>
    {
        @Override
        protected void initBuf(final PoolChunk<T> llllllllllllIllllIIlIlIIIIIIlIIl, final long llllllllllllIllllIIlIlIIIIIIlIII, final PooledByteBuf<T> llllllllllllIllllIIlIlIIIIIIlIll, final int llllllllllllIllllIIlIlIIIIIIIllI) {
            llllllllllllIllllIIlIlIIIIIIlIIl.initBuf(llllllllllllIllllIIlIlIIIIIIlIll, llllllllllllIllllIIlIlIIIIIIlIII, llllllllllllIllllIIlIlIIIIIIIllI);
        }
        
        NormalMemoryRegionCache(final int llllllllllllIllllIIlIlIIIIIlIlIl) {
            super(llllllllllllIllllIIlIlIIIIIlIlIl);
        }
    }
}
