// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import java.util.Iterator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.entity.EnumCreatureType;
import org.apache.logging.log4j.LogManager;
import net.minecraft.world.chunk.EmptyChunk;
import java.util.Map;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.world.MinecraftException;
import java.io.IOException;
import com.google.common.collect.Lists;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReport;
import net.minecraft.world.ChunkCoordIntPair;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import java.util.Set;
import java.util.List;
import net.minecraft.util.LongHashMap;
import net.minecraft.world.chunk.storage.IChunkLoader;
import net.minecraft.world.WorldServer;
import net.minecraft.world.chunk.Chunk;
import org.apache.logging.log4j.Logger;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderServer implements IChunkProvider
{
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ Chunk dummyChunk;
    private /* synthetic */ IChunkProvider serverChunkGenerator;
    public /* synthetic */ boolean chunkLoadOverride;
    private static final /* synthetic */ int[] llIIlllllIlIll;
    private /* synthetic */ WorldServer worldObj;
    private /* synthetic */ IChunkLoader chunkLoader;
    private /* synthetic */ LongHashMap<Chunk> id2ChunkMap;
    private /* synthetic */ List<Chunk> loadedChunks;
    private static final /* synthetic */ String[] llIIlllllIlIlI;
    private /* synthetic */ Set<Long> droppedChunksSet;
    
    private static boolean lIIlIIIIlIlIIlIl(final int llllllllllllIllIlllIIIllllllllll) {
        return llllllllllllIllIlllIIIllllllllll == 0;
    }
    
    private static void lIIlIIIIlIlIIIll() {
        (llIIlllllIlIll = new int[15])[0] = " ".length();
        ChunkProviderServer.llIIlllllIlIll[1] = ((0x62 ^ 0x58 ^ (0x12 ^ 0x4A)) & (0x4B ^ 0x54 ^ (0x60 ^ 0x1D) ^ -" ".length()));
        ChunkProviderServer.llIIlllllIlIll[2] = "  ".length();
        ChunkProviderServer.llIIlllllIlIll[3] = "   ".length();
        ChunkProviderServer.llIIlllllIlIll[4] = (0xA8 ^ 0xAC);
        ChunkProviderServer.llIIlllllIlIll[5] = (0xAF ^ 0xAA);
        ChunkProviderServer.llIIlllllIlIll[6] = (0x7D ^ 0x7B);
        ChunkProviderServer.llIIlllllIlIll[7] = (0xA3 ^ 0xA4);
        ChunkProviderServer.llIIlllllIlIll[8] = (0x4F ^ 0x70 ^ (0x76 ^ 0x41));
        ChunkProviderServer.llIIlllllIlIll[9] = (0xC1 ^ 0x9A ^ (0x10 ^ 0x42));
        ChunkProviderServer.llIIlllllIlIll[10] = (0x48 ^ 0x50);
        ChunkProviderServer.llIIlllllIlIll[11] = (0x87 ^ 0xBB ^ (0xF ^ 0x57));
        ChunkProviderServer.llIIlllllIlIll[12] = (80 + 104 - 95 + 73 ^ 23 + 24 + 59 + 62);
        ChunkProviderServer.llIIlllllIlIll[13] = (0x5E ^ 0x55);
        ChunkProviderServer.llIIlllllIlIll[14] = (0x25 ^ 0x29);
    }
    
    @Override
    public String makeString() {
        return String.valueOf(new StringBuilder(ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[12]]).append(this.id2ChunkMap.getNumHashElements()).append(ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[13]]).append(this.droppedChunksSet.size()));
    }
    
    private static boolean lIIlIIIIlIlIlIII(final int llllllllllllIllIlllIIlIIIIIlIIII, final int llllllllllllIllIlllIIlIIIIIIllll) {
        return llllllllllllIllIlllIIlIIIIIlIIII == llllllllllllIllIlllIIlIIIIIIllll;
    }
    
    @Override
    public BlockPos getStrongholdGen(final World llllllllllllIllIlllIIlIIIlIlIlII, final String llllllllllllIllIlllIIlIIIlIlIlll, final BlockPos llllllllllllIllIlllIIlIIIlIlIllI) {
        return this.serverChunkGenerator.getStrongholdGen(llllllllllllIllIlllIIlIIIlIlIlII, llllllllllllIllIlllIIlIIIlIlIlll, llllllllllllIllIlllIIlIIIlIlIllI);
    }
    
    private static String lIIlIIIIlIlIIIII(final String llllllllllllIllIlllIIlIIIIlllIll, final String llllllllllllIllIlllIIlIIIIllllII) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIlIIIlIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIlIIIIllllII.getBytes(StandardCharsets.UTF_8)), ChunkProviderServer.llIIlllllIlIll[8]), "DES");
            final Cipher llllllllllllIllIlllIIlIIIIllllll = Cipher.getInstance("DES");
            llllllllllllIllIlllIIlIIIIllllll.init(ChunkProviderServer.llIIlllllIlIll[2], llllllllllllIllIlllIIlIIIlIIIIII);
            return new String(llllllllllllIllIlllIIlIIIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIlIIIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIlIIIIlllllI) {
            llllllllllllIllIlllIIlIIIIlllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIIIlIlIIllI(final Object llllllllllllIllIlllIIlIIIIIIIIll) {
        return llllllllllllIllIlllIIlIIIIIIIIll == null;
    }
    
    public Chunk loadChunk(final int llllllllllllIllIlllIIlIIlllIlIlI, final int llllllllllllIllIlllIIlIIlllIIIIl) {
        final long llllllllllllIllIlllIIlIIlllIlIII = ChunkCoordIntPair.chunkXZ2Int(llllllllllllIllIlllIIlIIlllIlIlI, llllllllllllIllIlllIIlIIlllIIIIl);
        this.droppedChunksSet.remove(llllllllllllIllIlllIIlIIlllIlIII);
        "".length();
        Chunk llllllllllllIllIlllIIlIIlllIIlll = this.id2ChunkMap.getValueByKey(llllllllllllIllIlllIIlIIlllIlIII);
        if (lIIlIIIIlIlIIllI(llllllllllllIllIlllIIlIIlllIIlll)) {
            llllllllllllIllIlllIIlIIlllIIlll = this.loadChunkFromFile(llllllllllllIllIlllIIlIIlllIlIlI, llllllllllllIllIlllIIlIIlllIIIIl);
            if (lIIlIIIIlIlIIllI(llllllllllllIllIlllIIlIIlllIIlll)) {
                if (lIIlIIIIlIlIIllI(this.serverChunkGenerator)) {
                    llllllllllllIllIlllIIlIIlllIIlll = this.dummyChunk;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                else {
                    try {
                        llllllllllllIllIlllIIlIIlllIIlll = this.serverChunkGenerator.provideChunk(llllllllllllIllIlllIIlIIlllIlIlI, llllllllllllIllIlllIIlIIlllIIIIl);
                        "".length();
                        if ((0x59 ^ 0x11 ^ (0x8A ^ 0xC6)) < 0) {
                            return null;
                        }
                    }
                    catch (Throwable llllllllllllIllIlllIIlIIlllIIllI) {
                        final CrashReport llllllllllllIllIlllIIlIIlllIIlIl = CrashReport.makeCrashReport(llllllllllllIllIlllIIlIIlllIIllI, ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[1]]);
                        final CrashReportCategory category;
                        final CrashReportCategory llllllllllllIllIlllIIlIIlllIIlII = category = llllllllllllIllIlllIIlIIlllIIlIl.makeCategory(ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[0]]);
                        final String lllllllllllllIlIllIlIIIIIIlIIlll = ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[2]];
                        final String format = ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[3]];
                        final Object[] args = new Object[ChunkProviderServer.llIIlllllIlIll[2]];
                        args[ChunkProviderServer.llIIlllllIlIll[1]] = llllllllllllIllIlllIIlIIlllIlIlI;
                        args[ChunkProviderServer.llIIlllllIlIll[0]] = llllllllllllIllIlllIIlIIlllIIIIl;
                        category.addCrashSection(lllllllllllllIlIllIlIIIIIIlIIlll, String.format(format, args));
                        llllllllllllIllIlllIIlIIlllIIlII.addCrashSection(ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[4]], llllllllllllIllIlllIIlIIlllIlIII);
                        llllllllllllIllIlllIIlIIlllIIlII.addCrashSection(ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[5]], this.serverChunkGenerator.makeString());
                        throw new ReportedException(llllllllllllIllIlllIIlIIlllIIlIl);
                    }
                }
            }
            this.id2ChunkMap.add(llllllllllllIllIlllIIlIIlllIlIII, llllllllllllIllIlllIIlIIlllIIlll);
            this.loadedChunks.add(llllllllllllIllIlllIIlIIlllIIlll);
            "".length();
            llllllllllllIllIlllIIlIIlllIIlll.onChunkLoad();
            llllllllllllIllIlllIIlIIlllIIlll.populateChunk(this, this, llllllllllllIllIlllIIlIIlllIlIlI, llllllllllllIllIlllIIlIIlllIIIIl);
        }
        return llllllllllllIllIlllIIlIIlllIIlll;
    }
    
    @Override
    public boolean saveChunks(final boolean llllllllllllIllIlllIIlIIlIIIIIII, final IProgressUpdate llllllllllllIllIlllIIlIIlIIIIllI) {
        int llllllllllllIllIlllIIlIIlIIIIlIl = ChunkProviderServer.llIIlllllIlIll[1];
        final List<Chunk> llllllllllllIllIlllIIlIIlIIIIlII = (List<Chunk>)Lists.newArrayList((Iterable)this.loadedChunks);
        int llllllllllllIllIlllIIlIIlIIIIIll = ChunkProviderServer.llIIlllllIlIll[1];
        "".length();
        if (null != null) {
            return ((49 + 70 - 75 + 160 ^ 74 + 97 - 70 + 49) & (0xF2 ^ 0x99 ^ (0xBE ^ 0x8F) ^ -" ".length())) != 0x0;
        }
        while (!lIIlIIIIlIlIlIIl(llllllllllllIllIlllIIlIIlIIIIIll, llllllllllllIllIlllIIlIIlIIIIlII.size())) {
            final Chunk llllllllllllIllIlllIIlIIlIIIIIlI = llllllllllllIllIlllIIlIIlIIIIlII.get(llllllllllllIllIlllIIlIIlIIIIIll);
            if (lIIlIIIIlIlIIlII(llllllllllllIllIlllIIlIIlIIIIIII ? 1 : 0)) {
                this.saveChunkExtraData(llllllllllllIllIlllIIlIIlIIIIIlI);
            }
            if (lIIlIIIIlIlIIlII(llllllllllllIllIlllIIlIIlIIIIIlI.needsSaving(llllllllllllIllIlllIIlIIlIIIIIII) ? 1 : 0)) {
                this.saveChunkData(llllllllllllIllIlllIIlIIlIIIIIlI);
                llllllllllllIllIlllIIlIIlIIIIIlI.setModified((boolean)(ChunkProviderServer.llIIlllllIlIll[1] != 0));
                if (lIIlIIIIlIlIlIII(++llllllllllllIllIlllIIlIIlIIIIlIl, ChunkProviderServer.llIIlllllIlIll[10]) && lIIlIIIIlIlIIlIl(llllllllllllIllIlllIIlIIlIIIIIII ? 1 : 0)) {
                    return ChunkProviderServer.llIIlllllIlIll[1] != 0;
                }
            }
            ++llllllllllllIllIlllIIlIIlIIIIIll;
        }
        return ChunkProviderServer.llIIlllllIlIll[0] != 0;
    }
    
    private void saveChunkData(final Chunk llllllllllllIllIlllIIlIIlIllIlIl) {
        if (lIIlIIIIlIlIIlll(this.chunkLoader)) {
            try {
                llllllllllllIllIlllIIlIIlIllIlIl.setLastSaveTime(this.worldObj.getTotalWorldTime());
                this.chunkLoader.saveChunk(this.worldObj, llllllllllllIllIlllIIlIIlIllIlIl);
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
            catch (IOException llllllllllllIllIlllIIlIIlIllIlII) {
                ChunkProviderServer.logger.error(ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[8]], (Throwable)llllllllllllIllIlllIIlIIlIllIlII);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            catch (MinecraftException llllllllllllIllIlllIIlIIlIllIIll) {
                ChunkProviderServer.logger.error(ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[9]], (Throwable)llllllllllllIllIlllIIlIIlIllIIll);
            }
        }
    }
    
    private static String lIIlIIIIlIIlllll(String llllllllllllIllIlllIIlIIIIIllIll, final String llllllllllllIllIlllIIlIIIIIllIlI) {
        llllllllllllIllIlllIIlIIIIIllIll = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlllIIlIIIIIllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlllIIlIIIIIllllI = new StringBuilder();
        final char[] llllllllllllIllIlllIIlIIIIIlllIl = llllllllllllIllIlllIIlIIIIIllIlI.toCharArray();
        int llllllllllllIllIlllIIlIIIIIlllII = ChunkProviderServer.llIIlllllIlIll[1];
        final String llllllllllllIllIlllIIlIIIIIlIllI = (Object)((String)llllllllllllIllIlllIIlIIIIIllIll).toCharArray();
        final Exception llllllllllllIllIlllIIlIIIIIlIlIl = (Exception)llllllllllllIllIlllIIlIIIIIlIllI.length;
        long llllllllllllIllIlllIIlIIIIIlIlII = ChunkProviderServer.llIIlllllIlIll[1];
        while (lIIlIIIIlIlIlIlI((int)llllllllllllIllIlllIIlIIIIIlIlII, (int)llllllllllllIllIlllIIlIIIIIlIlIl)) {
            final char llllllllllllIllIlllIIlIIIIlIIIIl = llllllllllllIllIlllIIlIIIIIlIllI[llllllllllllIllIlllIIlIIIIIlIlII];
            llllllllllllIllIlllIIlIIIIIllllI.append((char)(llllllllllllIllIlllIIlIIIIlIIIIl ^ llllllllllllIllIlllIIlIIIIIlllIl[llllllllllllIllIlllIIlIIIIIlllII % llllllllllllIllIlllIIlIIIIIlllIl.length]));
            "".length();
            ++llllllllllllIllIlllIIlIIIIIlllII;
            ++llllllllllllIllIlllIIlIIIIIlIlII;
            "".length();
            if (-(57 + 98 - 51 + 37 ^ 32 + 126 - 135 + 113) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlllIIlIIIIIllllI);
    }
    
    @Override
    public Chunk provideChunk(final int llllllllllllIllIlllIIlIIllIlIllI, final int llllllllllllIllIlllIIlIIllIlIIIl) {
        final Chunk llllllllllllIllIlllIIlIIllIlIlII = this.id2ChunkMap.getValueByKey(ChunkCoordIntPair.chunkXZ2Int(llllllllllllIllIlllIIlIIllIlIllI, llllllllllllIllIlllIIlIIllIlIIIl));
        Chunk chunk;
        if (lIIlIIIIlIlIIllI(llllllllllllIllIlllIIlIIllIlIlII)) {
            if (lIIlIIIIlIlIIlIl(this.worldObj.isFindingSpawnPoint() ? 1 : 0) && lIIlIIIIlIlIIlIl(this.chunkLoadOverride ? 1 : 0)) {
                chunk = this.dummyChunk;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                chunk = this.loadChunk(llllllllllllIllIlllIIlIIllIlIllI, llllllllllllIllIlllIIlIIllIlIIIl);
                "".length();
                if (-" ".length() > "   ".length()) {
                    return null;
                }
            }
        }
        else {
            chunk = llllllllllllIllIlllIIlIIllIlIlII;
        }
        return chunk;
    }
    
    private static boolean lIIlIIIIlIlIIlII(final int llllllllllllIllIlllIIlIIIIIIIIIl) {
        return llllllllllllIllIlllIIlIIIIIIIIIl != 0;
    }
    
    @Override
    public void populate(final IChunkProvider llllllllllllIllIlllIIlIIlIlIIlII, final int llllllllllllIllIlllIIlIIlIlIIIll, final int llllllllllllIllIlllIIlIIlIlIIIlI) {
        final Chunk llllllllllllIllIlllIIlIIlIlIIllI = this.provideChunk(llllllllllllIllIlllIIlIIlIlIIIll, llllllllllllIllIlllIIlIIlIlIIIlI);
        if (lIIlIIIIlIlIIlIl(llllllllllllIllIlllIIlIIlIlIIllI.isTerrainPopulated() ? 1 : 0)) {
            llllllllllllIllIlllIIlIIlIlIIllI.func_150809_p();
            if (lIIlIIIIlIlIIlll(this.serverChunkGenerator)) {
                this.serverChunkGenerator.populate(llllllllllllIllIlllIIlIIlIlIIlII, llllllllllllIllIlllIIlIIlIlIIIll, llllllllllllIllIlllIIlIIlIlIIIlI);
                llllllllllllIllIlllIIlIIlIlIIllI.setChunkModified();
            }
        }
    }
    
    @Override
    public boolean chunkExists(final int llllllllllllIllIlllIIlIlIIIIlIIl, final int llllllllllllIllIlllIIlIlIIIIlIll) {
        return this.id2ChunkMap.containsItem(ChunkCoordIntPair.chunkXZ2Int(llllllllllllIllIlllIIlIlIIIIlIIl, llllllllllllIllIlllIIlIlIIIIlIll));
    }
    
    @Override
    public int getLoadedChunkCount() {
        return this.id2ChunkMap.getNumHashElements();
    }
    
    public ChunkProviderServer(final WorldServer llllllllllllIllIlllIIlIlIIIlIlll, final IChunkLoader llllllllllllIllIlllIIlIlIIIlIllI, final IChunkProvider llllllllllllIllIlllIIlIlIIIlIlIl) {
        this.droppedChunksSet = Collections.newSetFromMap(new ConcurrentHashMap<Long, Boolean>());
        this.chunkLoadOverride = (ChunkProviderServer.llIIlllllIlIll[0] != 0);
        this.id2ChunkMap = new LongHashMap<Chunk>();
        this.loadedChunks = (List<Chunk>)Lists.newArrayList();
        this.dummyChunk = new EmptyChunk(llllllllllllIllIlllIIlIlIIIlIlll, ChunkProviderServer.llIIlllllIlIll[1], ChunkProviderServer.llIIlllllIlIll[1]);
        this.worldObj = llllllllllllIllIlllIIlIlIIIlIlll;
        this.chunkLoader = llllllllllllIllIlllIIlIlIIIlIllI;
        this.serverChunkGenerator = llllllllllllIllIlllIIlIlIIIlIlIl;
    }
    
    public List<Chunk> func_152380_a() {
        return this.loadedChunks;
    }
    
    static {
        lIIlIIIIlIlIIIll();
        lIIlIIIIlIlIIIlI();
        logger = LogManager.getLogger();
    }
    
    public void dropChunk(final int llllllllllllIllIlllIIlIIllllllIl, final int llllllllllllIllIlllIIlIIllllllll) {
        if (lIIlIIIIlIlIIlII(this.worldObj.provider.canRespawnHere() ? 1 : 0)) {
            if (lIIlIIIIlIlIIlIl(this.worldObj.isSpawnChunk(llllllllllllIllIlllIIlIIllllllIl, llllllllllllIllIlllIIlIIllllllll) ? 1 : 0)) {
                this.droppedChunksSet.add(ChunkCoordIntPair.chunkXZ2Int(llllllllllllIllIlllIIlIIllllllIl, llllllllllllIllIlllIIlIIllllllll));
                "".length();
                "".length();
                if ("  ".length() == "   ".length()) {
                    return;
                }
            }
        }
        else {
            this.droppedChunksSet.add(ChunkCoordIntPair.chunkXZ2Int(llllllllllllIllIlllIIlIIllllllIl, llllllllllllIllIlllIIlIIllllllll));
            "".length();
        }
    }
    
    @Override
    public void saveExtraData() {
        if (lIIlIIIIlIlIIlll(this.chunkLoader)) {
            this.chunkLoader.saveExtraData();
        }
    }
    
    public void unloadAllChunks() {
        final Exception llllllllllllIllIlllIIlIIllllIlII = (Exception)this.loadedChunks.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIIIIlIlIIlIl(((Iterator)llllllllllllIllIlllIIlIIllllIlII).hasNext() ? 1 : 0)) {
            final Chunk llllllllllllIllIlllIIlIIllllIlll = ((Iterator<Chunk>)llllllllllllIllIlllIIlIIllllIlII).next();
            this.dropChunk(llllllllllllIllIlllIIlIIllllIlll.xPosition, llllllllllllIllIlllIIlIIllllIlll.zPosition);
        }
    }
    
    private static boolean lIIlIIIIlIlIIlll(final Object llllllllllllIllIlllIIlIIIIIIIlIl) {
        return llllllllllllIllIlllIIlIIIIIIIlIl != null;
    }
    
    private Chunk loadChunkFromFile(final int llllllllllllIllIlllIIlIIllIIIlIl, final int llllllllllllIllIlllIIlIIllIIIlII) {
        if (lIIlIIIIlIlIIllI(this.chunkLoader)) {
            return null;
        }
        try {
            final Chunk llllllllllllIllIlllIIlIIllIIlIII = this.chunkLoader.loadChunk(this.worldObj, llllllllllllIllIlllIIlIIllIIIlIl, llllllllllllIllIlllIIlIIllIIIlII);
            if (lIIlIIIIlIlIIlll(llllllllllllIllIlllIIlIIllIIlIII)) {
                llllllllllllIllIlllIIlIIllIIlIII.setLastSaveTime(this.worldObj.getTotalWorldTime());
                if (lIIlIIIIlIlIIlll(this.serverChunkGenerator)) {
                    this.serverChunkGenerator.recreateStructures(llllllllllllIllIlllIIlIIllIIlIII, llllllllllllIllIlllIIlIIllIIIlIl, llllllllllllIllIlllIIlIIllIIIlII);
                }
            }
            return llllllllllllIllIlllIIlIIllIIlIII;
        }
        catch (Exception llllllllllllIllIlllIIlIIllIIIlll) {
            ChunkProviderServer.logger.error(ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[6]], (Throwable)llllllllllllIllIlllIIlIIllIIIlll);
            return null;
        }
    }
    
    private static void lIIlIIIIlIlIIIlI() {
        (llIIlllllIlIlI = new String[ChunkProviderServer.llIIlllllIlIll[14]])[ChunkProviderServer.llIIlllllIlIll[1]] = lIIlIIIIlIIlllll("IjI2KygTIzogeAAvOysqBj48ID9HJDA5eAQiICAz", "gJUNX");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[0]] = lIIlIIIIlIIlllll("IiEZPhJBPQNwGwRpCzUXBDsNJBwF", "aIlPy");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[2]] = lIIlIIIIlIIlllll("Cz4ZNx8uPhQ=", "GQzVk");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[3]] = lIIlIIIIlIIlllll("ZjZeaA4=", "CRrMj");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[4]] = lIIlIIIIlIlIIIII("f66J331EEy+MlYsEGCcrNA==", "Gctoh");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[5]] = lIIlIIIIlIlIIIIl("ipgkvDO4fdw2jWekBQdyWA==", "oPkHd");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[6]] = lIIlIIIIlIlIIIIl("t6Kh0iCH4NazZl1DMhoUeEPkgbewcg2U", "riFGx");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[7]] = lIIlIIIIlIIlllll("LS0dLiEAZRxiNg80DWIgADYBNiwLMQ==", "nBhBE");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[8]] = lIIlIIIIlIlIIIII("WwkPViRu4XPQzVjbp2r+QhsfsZaCUMsA", "CdZzR");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[9]] = lIIlIIIIlIIlllll("BCEfDyIpaR5DNSY4D0MlLzsECH1nLwYRIyYqE0MvKW4fECNnLBNDJykhHgsjNW4DDTUzLwQAI2chDEMLLiAPADQmKB5c", "GNjcF");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[12]] = lIIlIIIIlIlIIIII("4c+XTmwt7mV3oGnee8LiLvEfjUm503GL", "wFXLj");
        ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[13]] = lIIlIIIIlIlIIIII("A8e7COSdnUU=", "NkHda");
    }
    
    private static boolean lIIlIIIIlIlIlIlI(final int llllllllllllIllIlllIIlIIIIIIlIII, final int llllllllllllIllIlllIIlIIIIIIIlll) {
        return llllllllllllIllIlllIIlIIIIIIlIII < llllllllllllIllIlllIIlIIIIIIIlll;
    }
    
    @Override
    public boolean func_177460_a(final IChunkProvider llllllllllllIllIlllIIlIIlIIllIIl, final Chunk llllllllllllIllIlllIIlIIlIIlIIlI, final int llllllllllllIllIlllIIlIIlIIlIIIl, final int llllllllllllIllIlllIIlIIlIIlIllI) {
        if (lIIlIIIIlIlIIlll(this.serverChunkGenerator) && lIIlIIIIlIlIIlII(this.serverChunkGenerator.func_177460_a(llllllllllllIllIlllIIlIIlIIllIIl, llllllllllllIllIlllIIlIIlIIlIIlI, llllllllllllIllIlllIIlIIlIIlIIIl, llllllllllllIllIlllIIlIIlIIlIllI) ? 1 : 0)) {
            final Chunk llllllllllllIllIlllIIlIIlIIlIlIl = this.provideChunk(llllllllllllIllIlllIIlIIlIIlIIIl, llllllllllllIllIlllIIlIIlIIlIllI);
            llllllllllllIllIlllIIlIIlIIlIlIl.setChunkModified();
            return ChunkProviderServer.llIIlllllIlIll[0] != 0;
        }
        return ChunkProviderServer.llIIlllllIlIll[1] != 0;
    }
    
    private static boolean lIIlIIIIlIlIlIIl(final int llllllllllllIllIlllIIlIIIIIIllII, final int llllllllllllIllIlllIIlIIIIIIlIll) {
        return llllllllllllIllIlllIIlIIIIIIllII >= llllllllllllIllIlllIIlIIIIIIlIll;
    }
    
    private void saveChunkExtraData(final Chunk llllllllllllIllIlllIIlIIlIlllllI) {
        if (lIIlIIIIlIlIIlll(this.chunkLoader)) {
            try {
                this.chunkLoader.saveExtraChunkData(this.worldObj, llllllllllllIllIlllIIlIIlIlllllI);
                "".length();
                if ("   ".length() < " ".length()) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIlllIIlIIlIllllIl) {
                ChunkProviderServer.logger.error(ChunkProviderServer.llIIlllllIlIlI[ChunkProviderServer.llIIlllllIlIll[7]], (Throwable)llllllllllllIllIlllIIlIIlIllllIl);
            }
        }
    }
    
    private static String lIIlIIIIlIlIIIIl(final String llllllllllllIllIlllIIlIIIIllIIII, final String llllllllllllIllIlllIIlIIIIlIllll) {
        try {
            final SecretKeySpec llllllllllllIllIlllIIlIIIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIlIIIIlIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlllIIlIIIIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlllIIlIIIIllIIlI.init(ChunkProviderServer.llIIlllllIlIll[2], llllllllllllIllIlllIIlIIIIllIIll);
            return new String(llllllllllllIllIlllIIlIIIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIlIIIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlllIIlIIIIllIIIl) {
            llllllllllllIllIlllIIlIIIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Chunk provideChunk(final BlockPos llllllllllllIllIlllIIlIIIlIIIlIl) {
        return this.provideChunk(llllllllllllIllIlllIIlIIIlIIIlIl.getX() >> ChunkProviderServer.llIIlllllIlIll[4], llllllllllllIllIlllIIlIIIlIIIlIl.getZ() >> ChunkProviderServer.llIIlllllIlIll[4]);
    }
    
    @Override
    public boolean canSave() {
        int n;
        if (lIIlIIIIlIlIIlII(this.worldObj.disableLevelSaving ? 1 : 0)) {
            n = ChunkProviderServer.llIIlllllIlIll[1];
            "".length();
            if (((0x2 ^ 0x3E) & ~(0x26 ^ 0x1A)) > 0) {
                return ((0xD8 ^ 0xC2) & ~(0x59 ^ 0x43)) != 0x0;
            }
        }
        else {
            n = ChunkProviderServer.llIIlllllIlIll[0];
        }
        return n != 0;
    }
    
    @Override
    public boolean unloadQueuedChunks() {
        if (lIIlIIIIlIlIIlIl(this.worldObj.disableLevelSaving ? 1 : 0)) {
            int llllllllllllIllIlllIIlIIIlllIIll = ChunkProviderServer.llIIlllllIlIll[1];
            "".length();
            if (null != null) {
                return ((0x62 ^ 0x48) & ~(0x5B ^ 0x71)) != 0x0;
            }
            while (!lIIlIIIIlIlIlIIl(llllllllllllIllIlllIIlIIIlllIIll, ChunkProviderServer.llIIlllllIlIll[11])) {
                if (lIIlIIIIlIlIIlIl(this.droppedChunksSet.isEmpty() ? 1 : 0)) {
                    final Long llllllllllllIllIlllIIlIIIlllIIlI = this.droppedChunksSet.iterator().next();
                    final Chunk llllllllllllIllIlllIIlIIIlllIIIl = this.id2ChunkMap.getValueByKey(llllllllllllIllIlllIIlIIIlllIIlI);
                    if (lIIlIIIIlIlIIlll(llllllllllllIllIlllIIlIIIlllIIIl)) {
                        llllllllllllIllIlllIIlIIIlllIIIl.onChunkUnload();
                        this.saveChunkData(llllllllllllIllIlllIIlIIIlllIIIl);
                        this.saveChunkExtraData(llllllllllllIllIlllIIlIIIlllIIIl);
                        this.id2ChunkMap.remove(llllllllllllIllIlllIIlIIIlllIIlI);
                        "".length();
                        this.loadedChunks.remove(llllllllllllIllIlllIIlIIIlllIIIl);
                        "".length();
                    }
                    this.droppedChunksSet.remove(llllllllllllIllIlllIIlIIIlllIIlI);
                    "".length();
                }
                ++llllllllllllIllIlllIIlIIIlllIIll;
            }
            if (lIIlIIIIlIlIIlll(this.chunkLoader)) {
                this.chunkLoader.chunkTick();
            }
        }
        return this.serverChunkGenerator.unloadQueuedChunks();
    }
    
    @Override
    public List<BiomeGenBase.SpawnListEntry> getPossibleCreatures(final EnumCreatureType llllllllllllIllIlllIIlIIIllIIIlI, final BlockPos llllllllllllIllIlllIIlIIIlIllllI) {
        return this.serverChunkGenerator.getPossibleCreatures(llllllllllllIllIlllIIlIIIllIIIlI, llllllllllllIllIlllIIlIIIlIllllI);
    }
    
    @Override
    public void recreateStructures(final Chunk llllllllllllIllIlllIIlIIIlIIllIl, final int llllllllllllIllIlllIIlIIIlIIllII, final int llllllllllllIllIlllIIlIIIlIIlIll) {
    }
}
