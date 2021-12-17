// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import java.util.Iterator;
import net.minecraft.init.Blocks;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.util.MathHelper;
import java.util.Collection;
import net.minecraft.block.Block;
import com.google.common.collect.Lists;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.entity.EnumCreatureType;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.block.state.IBlockState;
import java.util.List;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderDebug implements IChunkProvider
{
    private static final /* synthetic */ int field_177462_b;
    private final /* synthetic */ World world;
    private static final /* synthetic */ String[] llIIlIIllllIII;
    private static final /* synthetic */ int[] llIIlIIllllIIl;
    private static final /* synthetic */ int field_181039_c;
    private static final /* synthetic */ List<IBlockState> field_177464_a;
    
    @Override
    public void recreateStructures(final Chunk llllllllllllIlllIIlIIIlllIlllIII, final int llllllllllllIlllIIlIIIlllIllIlll, final int llllllllllllIlllIIlIIIlllIllIllI) {
    }
    
    @Override
    public Chunk provideChunk(final BlockPos llllllllllllIlllIIlIIIlllIllIIII) {
        return this.provideChunk(llllllllllllIlllIIlIIIlllIllIIII.getX() >> ChunkProviderDebug.llIIlIIllllIIl[6], llllllllllllIlllIIlIIIlllIllIIII.getZ() >> ChunkProviderDebug.llIIlIIllllIIl[6]);
    }
    
    public ChunkProviderDebug(final World llllllllllllIlllIIlIIlIIIIIIlIll) {
        this.world = llllllllllllIlllIIlIIlIIIIIIlIll;
    }
    
    private static String lIIIllIIlIlIllll(final String llllllllllllIlllIIlIIIlllIlIIllI, final String llllllllllllIlllIIlIIIlllIlIIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIIIlllIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIIIlllIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIIIlllIlIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIIIlllIlIlIlI.init(ChunkProviderDebug.llIIlIIllllIIl[4], llllllllllllIlllIIlIIIlllIlIlIll);
            return new String(llllllllllllIlllIIlIIIlllIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIIIlllIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIIIlllIlIlIIl) {
            llllllllllllIlllIIlIIIlllIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public BlockPos getStrongholdGen(final World llllllllllllIlllIIlIIIlllIllllIl, final String llllllllllllIlllIIlIIIlllIllllII, final BlockPos llllllllllllIlllIIlIIIlllIlllIll) {
        return null;
    }
    
    private static boolean lIIIllIIlIllIIlI(final int llllllllllllIlllIIlIIIlllIIlIIIl) {
        return llllllllllllIlllIIlIIIlllIIlIIIl == 0;
    }
    
    private static boolean lIIIllIIlIllIllI(final int llllllllllllIlllIIlIIIlllIIlIIll) {
        return llllllllllllIlllIIlIIIlllIIlIIll != 0;
    }
    
    @Override
    public List<BiomeGenBase.SpawnListEntry> getPossibleCreatures(final EnumCreatureType llllllllllllIlllIIlIIIllllIIIIIl, final BlockPos llllllllllllIlllIIlIIIllllIIIIII) {
        final BiomeGenBase llllllllllllIlllIIlIIIllllIIIIll = this.world.getBiomeGenForCoords(llllllllllllIlllIIlIIIllllIIIIII);
        return llllllllllllIlllIIlIIIllllIIIIll.getSpawnableList(llllllllllllIlllIIlIIIllllIIIIIl);
    }
    
    @Override
    public boolean func_177460_a(final IChunkProvider llllllllllllIlllIIlIIIllllIlIlIl, final Chunk llllllllllllIlllIIlIIIllllIlIlII, final int llllllllllllIlllIIlIIIllllIlIIll, final int llllllllllllIlllIIlIIIllllIlIIlI) {
        return ChunkProviderDebug.llIIlIIllllIIl[0] != 0;
    }
    
    @Override
    public void saveExtraData() {
    }
    
    private static boolean lIIIllIIlIllIIll(final Object llllllllllllIlllIIlIIIlllIIlIlIl) {
        return llllllllllllIlllIIlIIIlllIIlIlIl != null;
    }
    
    private static boolean lIIIllIIlIllIlIl(final int llllllllllllIlllIIlIIIlllIIIllll) {
        return llllllllllllIlllIIlIIIlllIIIllll > 0;
    }
    
    @Override
    public int getLoadedChunkCount() {
        return ChunkProviderDebug.llIIlIIllllIIl[0];
    }
    
    @Override
    public boolean chunkExists(final int llllllllllllIlllIIlIIIllllIlllII, final int llllllllllllIlllIIlIIIllllIllIll) {
        return ChunkProviderDebug.llIIlIIllllIIl[5] != 0;
    }
    
    static {
        lIIIllIIlIllIIIl();
        lIIIllIIlIllIIII();
        field_177464_a = Lists.newArrayList();
        final short llllllllllllIlllIIlIIlIIIIIIllll = (short)Block.blockRegistry.iterator();
        "".length();
        if ("  ".length() == 0) {
            return;
        }
        while (!lIIIllIIlIllIIlI(((Iterator)llllllllllllIlllIIlIIlIIIIIIllll).hasNext() ? 1 : 0)) {
            final Block llllllllllllIlllIIlIIlIIIIIlIIIl = ((Iterator<Block>)llllllllllllIlllIIlIIlIIIIIIllll).next();
            ChunkProviderDebug.field_177464_a.addAll((Collection<? extends IBlockState>)llllllllllllIlllIIlIIlIIIIIlIIIl.getBlockState().getValidStates());
            "".length();
        }
        field_177462_b = MathHelper.ceiling_float_int(MathHelper.sqrt_float((float)ChunkProviderDebug.field_177464_a.size()));
        field_181039_c = MathHelper.ceiling_float_int(ChunkProviderDebug.field_177464_a.size() / (float)ChunkProviderDebug.field_177462_b);
    }
    
    private static boolean lIIIllIIlIllIlII(final int llllllllllllIlllIIlIIIlllIlIIIII, final int llllllllllllIlllIIlIIIlllIIlllll) {
        return llllllllllllIlllIIlIIIlllIlIIIII >= llllllllllllIlllIIlIIIlllIIlllll;
    }
    
    @Override
    public boolean canSave() {
        return ChunkProviderDebug.llIIlIIllllIIl[5] != 0;
    }
    
    private static boolean lIIIllIIlIllIlll(final int llllllllllllIlllIIlIIIlllIIllIII, final int llllllllllllIlllIIlIIIlllIIlIlll) {
        return llllllllllllIlllIIlIIIlllIIllIII <= llllllllllllIlllIIlIIIlllIIlIlll;
    }
    
    @Override
    public void populate(final IChunkProvider llllllllllllIlllIIlIIIllllIllIIl, final int llllllllllllIlllIIlIIIllllIllIII, final int llllllllllllIlllIIlIIIllllIlIlll) {
    }
    
    private static void lIIIllIIlIllIIIl() {
        (llIIlIIllllIIl = new int[7])[0] = ((0x29 ^ 0x4A) & ~(0x1F ^ 0x7C));
        ChunkProviderDebug.llIIlIIllllIIl[1] = (0xBF ^ 0xAF);
        ChunkProviderDebug.llIIlIIllllIIl[2] = (0xF ^ 0x33);
        ChunkProviderDebug.llIIlIIllllIIl[3] = (0xE ^ 0x48);
        ChunkProviderDebug.llIIlIIllllIIl[4] = "  ".length();
        ChunkProviderDebug.llIIlIIllllIIl[5] = " ".length();
        ChunkProviderDebug.llIIlIIllllIIl[6] = (0x47 ^ 0x43);
    }
    
    private static boolean lIIIllIIlIlllIII(final int llllllllllllIlllIIlIIIlllIIlllII, final int llllllllllllIlllIIlIIIlllIIllIll) {
        return llllllllllllIlllIIlIIIlllIIlllII < llllllllllllIlllIIlIIIlllIIllIll;
    }
    
    @Override
    public boolean unloadQueuedChunks() {
        return ChunkProviderDebug.llIIlIIllllIIl[0] != 0;
    }
    
    public static IBlockState func_177461_b(int llllllllllllIlllIIlIIIlllllIIlIl, int llllllllllllIlllIIlIIIlllllIIIII) {
        IBlockState llllllllllllIlllIIlIIIlllllIIIll = null;
        if (lIIIllIIlIllIlIl(llllllllllllIlllIIlIIIlllllIIlIl) && lIIIllIIlIllIlIl(llllllllllllIlllIIlIIIlllllIIIII) && lIIIllIIlIllIllI(llllllllllllIlllIIlIIIlllllIIlIl % ChunkProviderDebug.llIIlIIllllIIl[4]) && lIIIllIIlIllIllI(llllllllllllIlllIIlIIIlllllIIIII % ChunkProviderDebug.llIIlIIllllIIl[4])) {
            llllllllllllIlllIIlIIIlllllIIlIl /= ChunkProviderDebug.llIIlIIllllIIl[4];
            llllllllllllIlllIIlIIIlllllIIIII /= ChunkProviderDebug.llIIlIIllllIIl[4];
            if (lIIIllIIlIllIlll(llllllllllllIlllIIlIIIlllllIIlIl, ChunkProviderDebug.field_177462_b) && lIIIllIIlIllIlll(llllllllllllIlllIIlIIIlllllIIIII, ChunkProviderDebug.field_181039_c)) {
                final int llllllllllllIlllIIlIIIlllllIIIlI = MathHelper.abs_int(llllllllllllIlllIIlIIIlllllIIlIl * ChunkProviderDebug.field_177462_b + llllllllllllIlllIIlIIIlllllIIIII);
                if (lIIIllIIlIlllIII(llllllllllllIlllIIlIIIlllllIIIlI, ChunkProviderDebug.field_177464_a.size())) {
                    llllllllllllIlllIIlIIIlllllIIIll = ChunkProviderDebug.field_177464_a.get(llllllllllllIlllIIlIIIlllllIIIlI);
                }
            }
        }
        return llllllllllllIlllIIlIIIlllllIIIll;
    }
    
    @Override
    public boolean saveChunks(final boolean llllllllllllIlllIIlIIIllllIlIIII, final IProgressUpdate llllllllllllIlllIIlIIIllllIIllll) {
        return ChunkProviderDebug.llIIlIIllllIIl[5] != 0;
    }
    
    @Override
    public String makeString() {
        return ChunkProviderDebug.llIIlIIllllIII[ChunkProviderDebug.llIIlIIllllIIl[0]];
    }
    
    @Override
    public Chunk provideChunk(final int llllllllllllIlllIIlIIIllllllIIIl, final int llllllllllllIlllIIlIIIllllllllIl) {
        final ChunkPrimer llllllllllllIlllIIlIIIllllllllII = new ChunkPrimer();
        int llllllllllllIlllIIlIIIlllllllIll = ChunkProviderDebug.llIIlIIllllIIl[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIIllIIlIllIlII(llllllllllllIlllIIlIIIlllllllIll, ChunkProviderDebug.llIIlIIllllIIl[1])) {
            int llllllllllllIlllIIlIIIlllllllIlI = ChunkProviderDebug.llIIlIIllllIIl[0];
            "".length();
            if ((105 + 84 - 60 + 5 ^ 71 + 104 - 165 + 120) == 0x0) {
                return null;
            }
            while (!lIIIllIIlIllIlII(llllllllllllIlllIIlIIIlllllllIlI, ChunkProviderDebug.llIIlIIllllIIl[1])) {
                final int llllllllllllIlllIIlIIIlllllllIIl = llllllllllllIlllIIlIIIllllllIIIl * ChunkProviderDebug.llIIlIIllllIIl[1] + llllllllllllIlllIIlIIIlllllllIll;
                final int llllllllllllIlllIIlIIIlllllllIII = llllllllllllIlllIIlIIIllllllllIl * ChunkProviderDebug.llIIlIIllllIIl[1] + llllllllllllIlllIIlIIIlllllllIlI;
                llllllllllllIlllIIlIIIllllllllII.setBlockState(llllllllllllIlllIIlIIIlllllllIll, ChunkProviderDebug.llIIlIIllllIIl[2], llllllllllllIlllIIlIIIlllllllIlI, Blocks.barrier.getDefaultState());
                final IBlockState llllllllllllIlllIIlIIIllllllIlll = func_177461_b(llllllllllllIlllIIlIIIlllllllIIl, llllllllllllIlllIIlIIIlllllllIII);
                if (lIIIllIIlIllIIll(llllllllllllIlllIIlIIIllllllIlll)) {
                    llllllllllllIlllIIlIIIllllllllII.setBlockState(llllllllllllIlllIIlIIIlllllllIll, ChunkProviderDebug.llIIlIIllllIIl[3], llllllllllllIlllIIlIIIlllllllIlI, llllllllllllIlllIIlIIIllllllIlll);
                }
                ++llllllllllllIlllIIlIIIlllllllIlI;
            }
            ++llllllllllllIlllIIlIIIlllllllIll;
        }
        final Chunk llllllllllllIlllIIlIIIllllllIllI = new Chunk(this.world, llllllllllllIlllIIlIIIllllllllII, llllllllllllIlllIIlIIIllllllIIIl, llllllllllllIlllIIlIIIllllllllIl);
        llllllllllllIlllIIlIIIllllllIllI.generateSkylightMap();
        final BiomeGenBase[] llllllllllllIlllIIlIIIllllllIlIl = this.world.getWorldChunkManager().loadBlockGeneratorData(null, llllllllllllIlllIIlIIIllllllIIIl * ChunkProviderDebug.llIIlIIllllIIl[1], llllllllllllIlllIIlIIIllllllllIl * ChunkProviderDebug.llIIlIIllllIIl[1], ChunkProviderDebug.llIIlIIllllIIl[1], ChunkProviderDebug.llIIlIIllllIIl[1]);
        final byte[] llllllllllllIlllIIlIIIllllllIlII = llllllllllllIlllIIlIIIllllllIllI.getBiomeArray();
        int llllllllllllIlllIIlIIIllllllIIll = ChunkProviderDebug.llIIlIIllllIIl[0];
        "".length();
        if (-"  ".length() > 0) {
            return null;
        }
        while (!lIIIllIIlIllIlII(llllllllllllIlllIIlIIIllllllIIll, llllllllllllIlllIIlIIIllllllIlII.length)) {
            llllllllllllIlllIIlIIIllllllIlII[llllllllllllIlllIIlIIIllllllIIll] = (byte)llllllllllllIlllIIlIIIllllllIlIl[llllllllllllIlllIIlIIIllllllIIll].biomeID;
            ++llllllllllllIlllIIlIIIllllllIIll;
        }
        llllllllllllIlllIIlIIIllllllIllI.generateSkylightMap();
        return llllllllllllIlllIIlIIIllllllIllI;
    }
    
    private static void lIIIllIIlIllIIII() {
        (llIIlIIllllIII = new String[ChunkProviderDebug.llIIlIIllllIIl[5]])[ChunkProviderDebug.llIIlIIllllIIl[0]] = lIIIllIIlIlIllll("qB5gOs6aEJ+b3v8gcp2Q0k0cdXDgOZbL", "TbUCC");
    }
}
