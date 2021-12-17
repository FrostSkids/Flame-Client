// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.multiplayer;

import java.util.Iterator;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.chunk.EmptyChunk;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EnumCreatureType;
import java.util.List;
import net.minecraft.util.LongHashMap;
import org.apache.logging.log4j.Logger;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderClient implements IChunkProvider
{
    private static final /* synthetic */ int[] lIllIIIIllllll;
    private /* synthetic */ World worldObj;
    private /* synthetic */ Chunk blankChunk;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ LongHashMap<Chunk> chunkMapping;
    private static final /* synthetic */ String[] lIllIIIIllllII;
    private /* synthetic */ List<Chunk> chunkListing;
    
    @Override
    public List<BiomeGenBase.SpawnListEntry> getPossibleCreatures(final EnumCreatureType lllllllllllllIIIIIlllIIIIIlIlllI, final BlockPos lllllllllllllIIIIIlllIIIIIlIllIl) {
        return null;
    }
    
    @Override
    public boolean chunkExists(final int lllllllllllllIIIIIlllIIIlIIIllll, final int lllllllllllllIIIIIlllIIIlIIIlllI) {
        return ChunkProviderClient.lIllIIIIllllll[1] != 0;
    }
    
    private static void llllIlllIllIIlI() {
        (lIllIIIIllllll = new int[6])[0] = ((0x87 ^ 0x80) & ~(0x17 ^ 0x10));
        ChunkProviderClient.lIllIIIIllllll[1] = " ".length();
        ChunkProviderClient.lIllIIIIllllll[2] = "  ".length();
        ChunkProviderClient.lIllIIIIllllll[3] = (0x79 ^ 0x7D);
        ChunkProviderClient.lIllIIIIllllll[4] = "   ".length();
        ChunkProviderClient.lIllIIIIllllll[5] = (0xE7 ^ 0x94 ^ (0xD3 ^ 0xA8));
    }
    
    private static boolean llllIlllIllIlII(final Object lllllllllllllIIIIIllIllllllIIlII) {
        return lllllllllllllIIIIIllIllllllIIlII == null;
    }
    
    @Override
    public String makeString() {
        return String.valueOf(new StringBuilder(ChunkProviderClient.lIllIIIIllllII[ChunkProviderClient.lIllIIIIllllll[1]]).append(this.chunkMapping.getNumHashElements()).append(ChunkProviderClient.lIllIIIIllllII[ChunkProviderClient.lIllIIIIllllll[2]]).append(this.chunkListing.size()));
    }
    
    public void unloadChunk(final int lllllllllllllIIIIIlllIIIIllIIllI, final int lllllllllllllIIIIIlllIIIlIIIIllI) {
        final Chunk lllllllllllllIIIIIlllIIIlIIIIlIl = this.provideChunk(lllllllllllllIIIIIlllIIIIllIIllI, lllllllllllllIIIIIlllIIIlIIIIllI);
        if (llllIlllIllIIll(lllllllllllllIIIIIlllIIIlIIIIlIl.isEmpty() ? 1 : 0)) {
            lllllllllllllIIIIIlllIIIlIIIIlIl.onChunkUnload();
        }
        this.chunkMapping.remove(ChunkCoordIntPair.chunkXZ2Int(lllllllllllllIIIIIlllIIIIllIIllI, lllllllllllllIIIIIlllIIIlIIIIllI));
        "".length();
        this.chunkListing.remove(lllllllllllllIIIIIlllIIIlIIIIlIl);
        "".length();
    }
    
    private static int llllIlllIllIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static String llllIlllIlIllll(final String lllllllllllllIIIIIlllIIIIIIlIlII, final String lllllllllllllIIIIIlllIIIIIIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlllIIIIIIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlllIIIIIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlllIIIIIIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlllIIIIIIlIllI.init(ChunkProviderClient.lIllIIIIllllll[2], lllllllllllllIIIIIlllIIIIIIlIlll);
            return new String(lllllllllllllIIIIIlllIIIIIIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlllIIIIIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlllIIIIIIlIlIl) {
            lllllllllllllIIIIIlllIIIIIIlIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Chunk provideChunk(final int lllllllllllllIIIIIlllIIIIlIIlllI, final int lllllllllllllIIIIIlllIIIIlIIllIl) {
        final Chunk lllllllllllllIIIIIlllIIIIlIlIIII = this.chunkMapping.getValueByKey(ChunkCoordIntPair.chunkXZ2Int(lllllllllllllIIIIIlllIIIIlIIlllI, lllllllllllllIIIIIlllIIIIlIIllIl));
        Chunk blankChunk;
        if (llllIlllIllIlII(lllllllllllllIIIIIlllIIIIlIlIIII)) {
            blankChunk = this.blankChunk;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            blankChunk = lllllllllllllIIIIIlllIIIIlIlIIII;
        }
        return blankChunk;
    }
    
    public Chunk loadChunk(final int lllllllllllllIIIIIlllIIIIlIllIlI, final int lllllllllllllIIIIIlllIIIIlIllIIl) {
        final Chunk lllllllllllllIIIIIlllIIIIlIlllII = new Chunk(this.worldObj, lllllllllllllIIIIIlllIIIIlIllIlI, lllllllllllllIIIIIlllIIIIlIllIIl);
        this.chunkMapping.add(ChunkCoordIntPair.chunkXZ2Int(lllllllllllllIIIIIlllIIIIlIllIlI, lllllllllllllIIIIIlllIIIIlIllIIl), lllllllllllllIIIIIlllIIIIlIlllII);
        this.chunkListing.add(lllllllllllllIIIIIlllIIIIlIlllII);
        "".length();
        lllllllllllllIIIIIlllIIIIlIlllII.setChunkLoaded((boolean)(ChunkProviderClient.lIllIIIIllllll[1] != 0));
        return lllllllllllllIIIIIlllIIIIlIlllII;
    }
    
    private static void llllIlllIllIIIl() {
        (lIllIIIIllllII = new String[ChunkProviderClient.lIllIIIIllllll[4]])[ChunkProviderClient.lIllIIIIllllll[0]] = llllIlllIlIlllI("FCQ/LSYtIndjDC8sKC07MCwpJm8gLTgtJGMxJCAkKisqYzssKiZjND5lIDA=", "CEMCO");
        ChunkProviderClient.lIllIIIIllllII[ChunkProviderClient.lIllIIIIllllll[1]] = llllIlllIlIllll("8dVRV7Uj3L6IgEjwTofMVYEHydlMqr8I", "HmJfu");
        ChunkProviderClient.lIllIIIIllllII[ChunkProviderClient.lIllIIIIllllll[2]] = llllIlllIllIIII("07GSCA5dLAQ=", "uSrMl");
    }
    
    @Override
    public boolean canSave() {
        return ChunkProviderClient.lIllIIIIllllll[0] != 0;
    }
    
    @Override
    public int getLoadedChunkCount() {
        return this.chunkListing.size();
    }
    
    @Override
    public void recreateStructures(final Chunk lllllllllllllIIIIIlllIIIIIlIIlII, final int lllllllllllllIIIIIlllIIIIIlIIIll, final int lllllllllllllIIIIIlllIIIIIlIIIlI) {
    }
    
    @Override
    public Chunk provideChunk(final BlockPos lllllllllllllIIIIIlllIIIIIIllllI) {
        return this.provideChunk(lllllllllllllIIIIIlllIIIIIIllllI.getX() >> ChunkProviderClient.lIllIIIIllllll[3], lllllllllllllIIIIIlllIIIIIIllllI.getZ() >> ChunkProviderClient.lIllIIIIllllll[3]);
    }
    
    @Override
    public BlockPos getStrongholdGen(final World lllllllllllllIIIIIlllIIIIIlIlIll, final String lllllllllllllIIIIIlllIIIIIlIlIlI, final BlockPos lllllllllllllIIIIIlllIIIIIlIlIIl) {
        return null;
    }
    
    @Override
    public boolean unloadQueuedChunks() {
        final long lllllllllllllIIIIIlllIIIIlIIIIlI = System.currentTimeMillis();
        final short lllllllllllllIIIIIlllIIIIIllllIl = (short)this.chunkListing.iterator();
        "".length();
        if (null != null) {
            return ((0xCD ^ 0x85) & ~(0x1C ^ 0x54)) != 0x0;
        }
        while (!llllIlllIllIIll(((Iterator)lllllllllllllIIIIIlllIIIIIllllIl).hasNext() ? 1 : 0)) {
            final Chunk chunk;
            final Chunk lllllllllllllIIIIIlllIIIIlIIIIIl = chunk = ((Iterator<Chunk>)lllllllllllllIIIIIlllIIIIIllllIl).next();
            int lllllllllllllIIIlllIlIIIIIlIIIIl;
            if (llllIlllIllIlll(llllIlllIllIlIl(System.currentTimeMillis() - lllllllllllllIIIIIlllIIIIlIIIIlI, 5L))) {
                lllllllllllllIIIlllIlIIIIIlIIIIl = ChunkProviderClient.lIllIIIIllllll[1];
                "".length();
                if (-"   ".length() >= 0) {
                    return ((0xDF ^ 0xC7) & ~(0xA6 ^ 0xBE)) != 0x0;
                }
            }
            else {
                lllllllllllllIIIlllIlIIIIIlIIIIl = ChunkProviderClient.lIllIIIIllllll[0];
            }
            chunk.func_150804_b((boolean)(lllllllllllllIIIlllIlIIIIIlIIIIl != 0));
        }
        if (llllIlllIllIlll(llllIlllIllIlIl(System.currentTimeMillis() - lllllllllllllIIIIIlllIIIIlIIIIlI, 100L))) {
            final Logger logger = ChunkProviderClient.logger;
            final String s = ChunkProviderClient.lIllIIIIllllII[ChunkProviderClient.lIllIIIIllllll[0]];
            final Object[] array = new Object[ChunkProviderClient.lIllIIIIllllll[1]];
            array[ChunkProviderClient.lIllIIIIllllll[0]] = System.currentTimeMillis() - lllllllllllllIIIIIlllIIIIlIIIIlI;
            logger.info(s, array);
        }
        return ChunkProviderClient.lIllIIIIllllll[0] != 0;
    }
    
    private static boolean llllIlllIllIlll(final int lllllllllllllIIIIIllIllllllIIIII) {
        return lllllllllllllIIIIIllIllllllIIIII > 0;
    }
    
    private static String llllIlllIlIlllI(String lllllllllllllIIIIIllIlllllllIlll, final String lllllllllllllIIIIIllIlllllllIllI) {
        lllllllllllllIIIIIllIlllllllIlll = new String(Base64.getDecoder().decode(lllllllllllllIIIIIllIlllllllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllIlllllllIlIl = new StringBuilder();
        final char[] lllllllllllllIIIIIllIlllllllIlII = lllllllllllllIIIIIllIlllllllIllI.toCharArray();
        int lllllllllllllIIIIIllIlllllllIIll = ChunkProviderClient.lIllIIIIllllll[0];
        final String lllllllllllllIIIIIllIllllllIllIl = (Object)lllllllllllllIIIIIllIlllllllIlll.toCharArray();
        final short lllllllllllllIIIIIllIllllllIllII = (short)lllllllllllllIIIIIllIllllllIllIl.length;
        String lllllllllllllIIIIIllIllllllIlIll = (String)ChunkProviderClient.lIllIIIIllllll[0];
        while (llllIlllIlllIll((int)lllllllllllllIIIIIllIllllllIlIll, lllllllllllllIIIIIllIllllllIllII)) {
            final char lllllllllllllIIIIIllIllllllllIII = lllllllllllllIIIIIllIllllllIllIl[lllllllllllllIIIIIllIllllllIlIll];
            lllllllllllllIIIIIllIlllllllIlIl.append((char)(lllllllllllllIIIIIllIllllllllIII ^ lllllllllllllIIIIIllIlllllllIlII[lllllllllllllIIIIIllIlllllllIIll % lllllllllllllIIIIIllIlllllllIlII.length]));
            "".length();
            ++lllllllllllllIIIIIllIlllllllIIll;
            ++lllllllllllllIIIIIllIllllllIlIll;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllIlllllllIlIl);
    }
    
    public ChunkProviderClient(final World lllllllllllllIIIIIlllIIIlIIlIIll) {
        this.chunkMapping = new LongHashMap<Chunk>();
        this.chunkListing = (List<Chunk>)Lists.newArrayList();
        this.blankChunk = new EmptyChunk(lllllllllllllIIIIIlllIIIlIIlIIll, ChunkProviderClient.lIllIIIIllllll[0], ChunkProviderClient.lIllIIIIllllll[0]);
        this.worldObj = lllllllllllllIIIIIlllIIIlIIlIIll;
    }
    
    @Override
    public boolean func_177460_a(final IChunkProvider lllllllllllllIIIIIlllIIIIIllIllI, final Chunk lllllllllllllIIIIIlllIIIIIllIlIl, final int lllllllllllllIIIIIlllIIIIIllIlII, final int lllllllllllllIIIIIlllIIIIIllIIll) {
        return ChunkProviderClient.lIllIIIIllllll[0] != 0;
    }
    
    @Override
    public boolean saveChunks(final boolean lllllllllllllIIIIIlllIIIIlIIlIlI, final IProgressUpdate lllllllllllllIIIIIlllIIIIlIIlIIl) {
        return ChunkProviderClient.lIllIIIIllllll[1] != 0;
    }
    
    static {
        llllIlllIllIIlI();
        llllIlllIllIIIl();
        logger = LogManager.getLogger();
    }
    
    @Override
    public void populate(final IChunkProvider lllllllllllllIIIIIlllIIIIIlllIlI, final int lllllllllllllIIIIIlllIIIIIlllIIl, final int lllllllllllllIIIIIlllIIIIIlllIII) {
    }
    
    @Override
    public void saveExtraData() {
    }
    
    private static boolean llllIlllIllIIll(final int lllllllllllllIIIIIllIllllllIIIlI) {
        return lllllllllllllIIIIIllIllllllIIIlI == 0;
    }
    
    private static boolean llllIlllIlllIll(final int lllllllllllllIIIIIllIllllllIIlll, final int lllllllllllllIIIIIllIllllllIIllI) {
        return lllllllllllllIIIIIllIllllllIIlll < lllllllllllllIIIIIllIllllllIIllI;
    }
    
    private static String llllIlllIllIIII(final String lllllllllllllIIIIIlllIIIIIIIIlll, final String lllllllllllllIIIIIlllIIIIIIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlllIIIIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlllIIIIIIIIllI.getBytes(StandardCharsets.UTF_8)), ChunkProviderClient.lIllIIIIllllll[5]), "DES");
            final Cipher lllllllllllllIIIIIlllIIIIIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIlllIIIIIIIlIIl.init(ChunkProviderClient.lIllIIIIllllll[2], lllllllllllllIIIIIlllIIIIIIIlIlI);
            return new String(lllllllllllllIIIIIlllIIIIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlllIIIIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlllIIIIIIIlIII) {
            lllllllllllllIIIIIlllIIIIIIIlIII.printStackTrace();
            return null;
        }
    }
}
