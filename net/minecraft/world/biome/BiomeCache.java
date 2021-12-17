// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import com.google.common.collect.Lists;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.LongHashMap;
import java.util.List;

public class BiomeCache
{
    private final /* synthetic */ WorldChunkManager chunkManager;
    private /* synthetic */ List<Block> cache;
    private /* synthetic */ long lastCleanupTime;
    private /* synthetic */ LongHashMap<Block> cacheMap;
    private static final /* synthetic */ int[] lIIIIIlllIIllI;
    
    private static boolean lIllIllllIIlIII(final int lllllllllllllIlIIllIllIIIlllllIl) {
        return lllllllllllllIlIIllIllIIIlllllIl < 0;
    }
    
    public void cleanupCache() {
        final long lllllllllllllIlIIllIllIIlIIlllII = MinecraftServer.getCurrentTimeMillis();
        final long lllllllllllllIlIIllIllIIlIIllIll = lllllllllllllIlIIllIllIIlIIlllII - this.lastCleanupTime;
        if (!lIllIllllIIIlll(lIllIllllIIIllI(lllllllllllllIlIIllIllIIlIIllIll, 7500L)) || lIllIllllIIlIII(lIllIllllIIIllI(lllllllllllllIlIIllIllIIlIIllIll, 0L))) {
            this.lastCleanupTime = lllllllllllllIlIIllIllIIlIIlllII;
            int lllllllllllllIlIIllIllIIlIIllIlI = BiomeCache.lIIIIIlllIIllI[2];
            "".length();
            if ("  ".length() <= ((0xDB ^ 0x8C) & ~(0x48 ^ 0x1F))) {
                return;
            }
            while (!lIllIllllIIlIIl(lllllllllllllIlIIllIllIIlIIllIlI, this.cache.size())) {
                final Block lllllllllllllIlIIllIllIIlIIllIIl = this.cache.get(lllllllllllllIlIIllIllIIlIIllIlI);
                final long lllllllllllllIlIIllIllIIlIIllIII = lllllllllllllIlIIllIllIIlIIlllII - lllllllllllllIlIIllIllIIlIIllIIl.lastAccessTime;
                if (!lIllIllllIIIlll(lIllIllllIIIllI(lllllllllllllIlIIllIllIIlIIllIII, 30000L)) || lIllIllllIIlIII(lIllIllllIIIllI(lllllllllllllIlIIllIllIIlIIllIII, 0L))) {
                    this.cache.remove(lllllllllllllIlIIllIllIIlIIllIlI--);
                    "".length();
                    final long lllllllllllllIlIIllIllIIlIIlIlll = ((long)lllllllllllllIlIIllIllIIlIIllIIl.xPosition & 0xFFFFFFFFL) | ((long)lllllllllllllIlIIllIllIIlIIllIIl.zPosition & 0xFFFFFFFFL) << BiomeCache.lIIIIIlllIIllI[1];
                    this.cacheMap.remove(lllllllllllllIlIIllIllIIlIIlIlll);
                    "".length();
                }
                ++lllllllllllllIlIIllIllIIlIIllIlI;
            }
        }
    }
    
    public Block getBiomeCacheBlock(int lllllllllllllIlIIllIllIIlIllIlll, int lllllllllllllIlIIllIllIIlIllIllI) {
        lllllllllllllIlIIllIllIIlIllIlll >>= BiomeCache.lIIIIIlllIIllI[0];
        lllllllllllllIlIIllIllIIlIllIllI >>= (char)BiomeCache.lIIIIIlllIIllI[0];
        final long lllllllllllllIlIIllIllIIlIlllIlI = ((long)lllllllllllllIlIIllIllIIlIllIlll & 0xFFFFFFFFL) | ((long)lllllllllllllIlIIllIllIIlIllIllI & 0xFFFFFFFFL) << BiomeCache.lIIIIIlllIIllI[1];
        Block lllllllllllllIlIIllIllIIlIlllIIl = this.cacheMap.getValueByKey(lllllllllllllIlIIllIllIIlIlllIlI);
        if (lIllIllllIIIlIl(lllllllllllllIlIIllIllIIlIlllIIl)) {
            lllllllllllllIlIIllIllIIlIlllIIl = new Block(lllllllllllllIlIIllIllIIlIllIlll, lllllllllllllIlIIllIllIIlIllIllI);
            this.cacheMap.add(lllllllllllllIlIIllIllIIlIlllIlI, lllllllllllllIlIIllIllIIlIlllIIl);
            this.cache.add(lllllllllllllIlIIllIllIIlIlllIIl);
            "".length();
        }
        lllllllllllllIlIIllIllIIlIlllIIl.lastAccessTime = MinecraftServer.getCurrentTimeMillis();
        return lllllllllllllIlIIllIllIIlIlllIIl;
    }
    
    private static void lIllIllllIIIlII() {
        (lIIIIIlllIIllI = new int[3])[0] = (0x47 ^ 0x79 ^ (0x9A ^ 0xA0));
        BiomeCache.lIIIIIlllIIllI[1] = (0x74 ^ 0x54);
        BiomeCache.lIIIIIlllIIllI[2] = ((0xE9 ^ 0xB6) & ~(0x99 ^ 0xC6));
    }
    
    private static boolean lIllIllllIIlIIl(final int lllllllllllllIlIIllIllIIlIIIIIlI, final int lllllllllllllIlIIllIllIIlIIIIIIl) {
        return lllllllllllllIlIIllIllIIlIIIIIlI >= lllllllllllllIlIIllIllIIlIIIIIIl;
    }
    
    private static boolean lIllIllllIIIlll(final int lllllllllllllIlIIllIllIIIllllIll) {
        return lllllllllllllIlIIllIllIIIllllIll <= 0;
    }
    
    static {
        lIllIllllIIIlII();
    }
    
    private static int lIllIllllIIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public BiomeGenBase[] getCachedBiomes(final int lllllllllllllIlIIllIllIIlIIIlIII, final int lllllllllllllIlIIllIllIIlIIIlIlI) {
        return this.getBiomeCacheBlock(lllllllllllllIlIIllIllIIlIIIlIII, lllllllllllllIlIIllIllIIlIIIlIlI).biomes;
    }
    
    public BiomeCache(final WorldChunkManager lllllllllllllIlIIllIllIIllIIIIll) {
        this.cacheMap = new LongHashMap<Block>();
        this.cache = (List<Block>)Lists.newArrayList();
        this.chunkManager = lllllllllllllIlIIllIllIIllIIIIll;
    }
    
    private static boolean lIllIllllIIIlIl(final Object lllllllllllllIlIIllIllIIIlllllll) {
        return lllllllllllllIlIIllIllIIIlllllll == null;
    }
    
    public BiomeGenBase func_180284_a(final int lllllllllllllIlIIllIllIIlIlIllIl, final int lllllllllllllIlIIllIllIIlIlIIlll, final BiomeGenBase lllllllllllllIlIIllIllIIlIlIIllI) {
        final BiomeGenBase lllllllllllllIlIIllIllIIlIlIlIlI = this.getBiomeCacheBlock(lllllllllllllIlIIllIllIIlIlIllIl, lllllllllllllIlIIllIllIIlIlIIlll).getBiomeGenAt(lllllllllllllIlIIllIllIIlIlIllIl, lllllllllllllIlIIllIllIIlIlIIlll);
        BiomeGenBase biomeGenBase;
        if (lIllIllllIIIlIl(lllllllllllllIlIIllIllIIlIlIlIlI)) {
            biomeGenBase = lllllllllllllIlIIllIllIIlIlIIllI;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        else {
            biomeGenBase = lllllllllllllIlIIllIllIIlIlIlIlI;
        }
        return biomeGenBase;
    }
    
    public class Block
    {
        public /* synthetic */ long lastAccessTime;
        private static final /* synthetic */ int[] lIlllIlllIIlII;
        public /* synthetic */ float[] rainfallValues;
        public /* synthetic */ int zPosition;
        public /* synthetic */ int xPosition;
        public /* synthetic */ BiomeGenBase[] biomes;
        
        private static void lIIIIIllIllIlIlI() {
            (lIlllIlllIIlII = new int[5])[0] = (-(0xFFFFF4B7 & 0x7B6F) & (0xFFFFF5BF & 0x7B66));
            Block.lIlllIlllIIlII[1] = (0x60 ^ 0x64);
            Block.lIlllIlllIIlII[2] = (0x64 ^ 0x74);
            Block.lIlllIlllIIlII[3] = ((0x5C ^ 0x75 ^ (0x45 ^ 0x79)) & (0x0 ^ 0x8 ^ (0x2E ^ 0x33) ^ -" ".length()));
            Block.lIlllIlllIIlII[4] = (0x33 ^ 0x3C);
        }
        
        public BiomeGenBase getBiomeGenAt(final int llllllllllllIllllIllIllIlllIllII, final int llllllllllllIllllIllIllIlllIlllI) {
            return this.biomes[(llllllllllllIllllIllIllIlllIllII & Block.lIlllIlllIIlII[4]) | (llllllllllllIllllIllIllIlllIlllI & Block.lIlllIlllIIlII[4]) << Block.lIlllIlllIIlII[1]];
        }
        
        public Block(final int llllllllllllIllllIllIllIlllllIIl, final int llllllllllllIllllIllIllIlllllIII) {
            this.rainfallValues = new float[Block.lIlllIlllIIlII[0]];
            this.biomes = new BiomeGenBase[Block.lIlllIlllIIlII[0]];
            this.xPosition = llllllllllllIllllIllIllIlllllIIl;
            this.zPosition = llllllllllllIllllIllIllIlllllIII;
            BiomeCache.this.chunkManager.getRainfall(this.rainfallValues, llllllllllllIllllIllIllIlllllIIl << Block.lIlllIlllIIlII[1], llllllllllllIllllIllIllIlllllIII << Block.lIlllIlllIIlII[1], Block.lIlllIlllIIlII[2], Block.lIlllIlllIIlII[2]);
            "".length();
            BiomeCache.this.chunkManager.getBiomeGenAt(this.biomes, llllllllllllIllllIllIllIlllllIIl << Block.lIlllIlllIIlII[1], llllllllllllIllllIllIllIlllllIII << Block.lIlllIlllIIlII[1], Block.lIlllIlllIIlII[2], Block.lIlllIlllIIlII[2], (boolean)(Block.lIlllIlllIIlII[3] != 0));
            "".length();
        }
        
        static {
            lIIIIIllIllIlIlI();
        }
    }
}
