// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import net.minecraft.block.BlockFalling;
import net.minecraft.util.IProgressUpdate;
import java.util.List;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.World;
import java.util.Random;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderEnd implements IChunkProvider
{
    public /* synthetic */ NoiseGeneratorOctaves noiseGen4;
    private /* synthetic */ NoiseGeneratorOctaves noiseGen2;
    private /* synthetic */ Random endRNG;
    /* synthetic */ double[] noiseData5;
    /* synthetic */ double[] noiseData2;
    private static final /* synthetic */ String[] llIIlIllllIIII;
    public /* synthetic */ NoiseGeneratorOctaves noiseGen5;
    /* synthetic */ double[] noiseData1;
    /* synthetic */ double[] noiseData3;
    private /* synthetic */ NoiseGeneratorOctaves noiseGen3;
    private /* synthetic */ double[] densities;
    private /* synthetic */ NoiseGeneratorOctaves noiseGen1;
    /* synthetic */ double[] noiseData4;
    private /* synthetic */ World endWorld;
    private /* synthetic */ BiomeGenBase[] biomesForGeneration;
    private static final /* synthetic */ int[] llIIlIllllIIIl;
    
    @Override
    public boolean unloadQueuedChunks() {
        return ChunkProviderEnd.llIIlIllllIIIl[6] != 0;
    }
    
    public ChunkProviderEnd(final World llllllllllllIlllIIIlIIIIIIIllllI, final long llllllllllllIlllIIIlIIIIIIIlllIl) {
        this.endWorld = llllllllllllIlllIIIlIIIIIIIllllI;
        this.endRNG = new Random(llllllllllllIlllIIIlIIIIIIIlllIl);
        this.noiseGen1 = new NoiseGeneratorOctaves(this.endRNG, ChunkProviderEnd.llIIlIllllIIIl[0]);
        this.noiseGen2 = new NoiseGeneratorOctaves(this.endRNG, ChunkProviderEnd.llIIlIllllIIIl[0]);
        this.noiseGen3 = new NoiseGeneratorOctaves(this.endRNG, ChunkProviderEnd.llIIlIllllIIIl[1]);
        this.noiseGen4 = new NoiseGeneratorOctaves(this.endRNG, ChunkProviderEnd.llIIlIllllIIIl[2]);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.endRNG, ChunkProviderEnd.llIIlIllllIIIl[0]);
    }
    
    @Override
    public BlockPos getStrongholdGen(final World llllllllllllIlllIIIIllllIIIlIllI, final String llllllllllllIlllIIIIllllIIIlIlIl, final BlockPos llllllllllllIlllIIIIllllIIIlIlII) {
        return null;
    }
    
    private static boolean lIIIlllIIIIIlIIl(final int llllllllllllIlllIIIIlllIlllIIIII) {
        return llllllllllllIlllIIIIlllIlllIIIII <= 0;
    }
    
    public void func_180519_a(final ChunkPrimer llllllllllllIlllIIIIlllllIlIIIII) {
        int llllllllllllIlllIIIIlllllIlIlIII = ChunkProviderEnd.llIIlIllllIIIl[6];
        "".length();
        if (-" ".length() > "   ".length()) {
            return;
        }
        while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIlllllIlIlIII, ChunkProviderEnd.llIIlIllllIIIl[0])) {
            int llllllllllllIlllIIIIlllllIlIIlll = ChunkProviderEnd.llIIlIllllIIIl[6];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIlllllIlIIlll, ChunkProviderEnd.llIIlIllllIIIl[0])) {
                final int llllllllllllIlllIIIIlllllIlIIllI = ChunkProviderEnd.llIIlIllllIIIl[4];
                int llllllllllllIlllIIIIlllllIlIIlIl = ChunkProviderEnd.llIIlIllllIIIl[9];
                IBlockState llllllllllllIlllIIIIlllllIlIIlII = Blocks.end_stone.getDefaultState();
                IBlockState llllllllllllIlllIIIIlllllIlIIIll = Blocks.end_stone.getDefaultState();
                int llllllllllllIlllIIIIlllllIlIIIlI = ChunkProviderEnd.llIIlIllllIIIl[10];
                "".length();
                if (-" ".length() > -" ".length()) {
                    return;
                }
                while (!lIIIlllIIIIIlIll(llllllllllllIlllIIIIlllllIlIIIlI)) {
                    final IBlockState llllllllllllIlllIIIIlllllIlIIIIl = llllllllllllIlllIIIIlllllIlIIIII.getBlockState(llllllllllllIlllIIIIlllllIlIlIII, llllllllllllIlllIIIIlllllIlIIIlI, llllllllllllIlllIIIIlllllIlIIlll);
                    if (lIIIlllIIIIIIlll(llllllllllllIlllIIIIlllllIlIIIIl.getBlock().getMaterial(), Material.air)) {
                        llllllllllllIlllIIIIlllllIlIIlIl = ChunkProviderEnd.llIIlIllllIIIl[9];
                        "".length();
                        if ((0x53 ^ 0x57) == -" ".length()) {
                            return;
                        }
                    }
                    else if (lIIIlllIIIIIIlll(llllllllllllIlllIIIIlllllIlIIIIl.getBlock(), Blocks.stone)) {
                        if (lIIIlllIIIIIlIII(llllllllllllIlllIIIIlllllIlIIlIl, ChunkProviderEnd.llIIlIllllIIIl[9])) {
                            if (lIIIlllIIIIIlIIl(llllllllllllIlllIIIIlllllIlIIllI)) {
                                llllllllllllIlllIIIIlllllIlIIlII = Blocks.air.getDefaultState();
                                llllllllllllIlllIIIIlllllIlIIIll = Blocks.end_stone.getDefaultState();
                            }
                            llllllllllllIlllIIIIlllllIlIIlIl = llllllllllllIlllIIIIlllllIlIIllI;
                            if (lIIIlllIIIIIlIlI(llllllllllllIlllIIIIlllllIlIIIlI)) {
                                llllllllllllIlllIIIIlllllIlIIIII.setBlockState(llllllllllllIlllIIIIlllllIlIlIII, llllllllllllIlllIIIIlllllIlIIIlI, llllllllllllIlllIIIIlllllIlIIlll, llllllllllllIlllIIIIlllllIlIIlII);
                                "".length();
                                if ("  ".length() == ((0xE7 ^ 0x85) & ~(0x7D ^ 0x1F))) {
                                    return;
                                }
                            }
                            else {
                                llllllllllllIlllIIIIlllllIlIIIII.setBlockState(llllllllllllIlllIIIIlllllIlIlIII, llllllllllllIlllIIIIlllllIlIIIlI, llllllllllllIlllIIIIlllllIlIIlll, llllllllllllIlllIIIIlllllIlIIIll);
                                "".length();
                                if ((0x27 ^ 0x23) <= " ".length()) {
                                    return;
                                }
                            }
                        }
                        else if (lIIIlllIIIIIIlIl(llllllllllllIlllIIIIlllllIlIIlIl)) {
                            --llllllllllllIlllIIIIlllllIlIIlIl;
                            llllllllllllIlllIIIIlllllIlIIIII.setBlockState(llllllllllllIlllIIIIlllllIlIlIII, llllllllllllIlllIIIIlllllIlIIIlI, llllllllllllIlllIIIIlllllIlIIlll, llllllllllllIlllIIIIlllllIlIIIll);
                        }
                    }
                    --llllllllllllIlllIIIIlllllIlIIIlI;
                }
                ++llllllllllllIlllIIIIlllllIlIIlll;
            }
            ++llllllllllllIlllIIIIlllllIlIlIII;
        }
    }
    
    static {
        lIIIlllIIIIIIIll();
        lIIIlllIIIIIIIlI();
    }
    
    private static int lIIIlllIIIIIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIlllIIIIIlIll(final int llllllllllllIlllIIIIlllIlllIIIlI) {
        return llllllllllllIlllIIIIlllIlllIIIlI < 0;
    }
    
    private static void lIIIlllIIIIIIIlI() {
        (llIIlIllllIIII = new String[ChunkProviderEnd.llIIlIllllIIIl[4]])[ChunkProviderEnd.llIIlIllllIIIl[6]] = lIIIlllIIIIIIIIl("YdspoguVa4/AEn/kW/HRwJJZ9N+XqGa/", "upDup");
    }
    
    @Override
    public void recreateStructures(final Chunk llllllllllllIlllIIIIllllIIIlIIIl, final int llllllllllllIlllIIIIllllIIIlIIII, final int llllllllllllIlllIIIIllllIIIIllll) {
    }
    
    @Override
    public boolean chunkExists(final int llllllllllllIlllIIIIllllIIlllIll, final int llllllllllllIlllIIIIllllIIlllIlI) {
        return ChunkProviderEnd.llIIlIllllIIIl[4] != 0;
    }
    
    @Override
    public void saveExtraData() {
    }
    
    @Override
    public Chunk provideChunk(final BlockPos llllllllllllIlllIIIIllllIIIIlIIl) {
        return this.provideChunk(llllllllllllIlllIIIIllllIIIIlIIl.getX() >> ChunkProviderEnd.llIIlIllllIIIl[7], llllllllllllIlllIIIIllllIIIIlIIl.getZ() >> ChunkProviderEnd.llIIlIllllIIIl[7]);
    }
    
    private static int lIIIlllIIIIIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIIlllIIIIIIlIl(final int llllllllllllIlllIIIIlllIllIllllI) {
        return llllllllllllIlllIIIIlllIllIllllI > 0;
    }
    
    @Override
    public int getLoadedChunkCount() {
        return ChunkProviderEnd.llIIlIllllIIIl[6];
    }
    
    private static boolean lIIIlllIIIIIIllI(final int llllllllllllIlllIIIIlllIllllIlIl, final int llllllllllllIlllIIIIlllIllllIlII) {
        return llllllllllllIlllIIIIlllIllllIlIl >= llllllllllllIlllIIIIlllIllllIlII;
    }
    
    private static String lIIIlllIIIIIIIIl(final String llllllllllllIlllIIIIlllIllllllll, final String llllllllllllIlllIIIIllllIIIIIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIllllIIIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIllllIIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIllllIIIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIllllIIIIIIll.init(ChunkProviderEnd.llIIlIllllIIIl[3], llllllllllllIlllIIIIllllIIIIIlII);
            return new String(llllllllllllIlllIIIIllllIIIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIlllIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIllllIIIIIIlI) {
            llllllllllllIlllIIIIllllIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlllIIIIIlIlI(final int llllllllllllIlllIIIIlllIlllIIlII) {
        return llllllllllllIlllIIIIlllIlllIIlII >= 0;
    }
    
    private static boolean lIIIlllIIIIIlIII(final int llllllllllllIlllIIIIlllIlllllIIl, final int llllllllllllIlllIIIIlllIlllllIII) {
        return llllllllllllIlllIIIIlllIlllllIIl == llllllllllllIlllIIIIlllIlllllIII;
    }
    
    private static int lIIIlllIIIIIllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public Chunk provideChunk(final int llllllllllllIlllIIIIlllllIIIlIII, final int llllllllllllIlllIIIIlllllIIIlllI) {
        this.endRNG.setSeed(llllllllllllIlllIIIIlllllIIIlIII * 341873128712L + llllllllllllIlllIIIIlllllIIIlllI * 132897987541L);
        final ChunkPrimer llllllllllllIlllIIIIlllllIIIllIl = new ChunkPrimer();
        this.biomesForGeneration = this.endWorld.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, llllllllllllIlllIIIIlllllIIIlIII * ChunkProviderEnd.llIIlIllllIIIl[0], llllllllllllIlllIIIIlllllIIIlllI * ChunkProviderEnd.llIIlIllllIIIl[0], ChunkProviderEnd.llIIlIllllIIIl[0], ChunkProviderEnd.llIIlIllllIIIl[0]);
        this.func_180520_a(llllllllllllIlllIIIIlllllIIIlIII, llllllllllllIlllIIIIlllllIIIlllI, llllllllllllIlllIIIIlllllIIIllIl);
        this.func_180519_a(llllllllllllIlllIIIIlllllIIIllIl);
        final Chunk llllllllllllIlllIIIIlllllIIIllII = new Chunk(this.endWorld, llllllllllllIlllIIIIlllllIIIllIl, llllllllllllIlllIIIIlllllIIIlIII, llllllllllllIlllIIIIlllllIIIlllI);
        final byte[] llllllllllllIlllIIIIlllllIIIlIll = llllllllllllIlllIIIIlllllIIIllII.getBiomeArray();
        int llllllllllllIlllIIIIlllllIIIlIlI = ChunkProviderEnd.llIIlIllllIIIl[6];
        "".length();
        if ((0xCA ^ 0xC7 ^ (0x3F ^ 0x36)) != (0xB7 ^ 0x85 ^ (0x45 ^ 0x73))) {
            return null;
        }
        while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIlllllIIIlIlI, llllllllllllIlllIIIIlllllIIIlIll.length)) {
            llllllllllllIlllIIIIlllllIIIlIll[llllllllllllIlllIIIIlllllIIIlIlI] = (byte)this.biomesForGeneration[llllllllllllIlllIIIIlllllIIIlIlI].biomeID;
            ++llllllllllllIlllIIIIlllllIIIlIlI;
        }
        llllllllllllIlllIIIIlllllIIIllII.generateSkylightMap();
        return llllllllllllIlllIIIIlllllIIIllII;
    }
    
    private double[] initializeNoiseField(double[] llllllllllllIlllIIIIllllIlIlIIlI, final int llllllllllllIlllIIIIllllIlIlIIIl, final int llllllllllllIlllIIIIllllIllIlIII, final int llllllllllllIlllIIIIllllIllIIlll, final int llllllllllllIlllIIIIllllIllIIllI, final int llllllllllllIlllIIIIllllIlIIllIl, final int llllllllllllIlllIIIIllllIllIIlII) {
        if (lIIIlllIIIIlIIII(llllllllllllIlllIIIIllllIlIlIIlI)) {
            llllllllllllIlllIIIIllllIlIlIIlI = new double[llllllllllllIlllIIIIllllIllIIllI * llllllllllllIlllIIIIllllIlIIllIl * llllllllllllIlllIIIIllllIllIIlII];
        }
        double llllllllllllIlllIIIIllllIllIIIll = 684.412;
        final double llllllllllllIlllIIIIllllIllIIIlI = 684.412;
        this.noiseData4 = this.noiseGen4.generateNoiseOctaves(this.noiseData4, llllllllllllIlllIIIIllllIlIlIIIl, llllllllllllIlllIIIIllllIllIIlll, llllllllllllIlllIIIIllllIllIIllI, llllllllllllIlllIIIIllllIllIIlII, 1.121, 1.121, 0.5);
        this.noiseData5 = this.noiseGen5.generateNoiseOctaves(this.noiseData5, llllllllllllIlllIIIIllllIlIlIIIl, llllllllllllIlllIIIIllllIllIIlll, llllllllllllIlllIIIIllllIllIIllI, llllllllllllIlllIIIIllllIllIIlII, 200.0, 200.0, 0.5);
        llllllllllllIlllIIIIllllIllIIIll *= 2.0;
        this.noiseData1 = this.noiseGen3.generateNoiseOctaves(this.noiseData1, llllllllllllIlllIIIIllllIlIlIIIl, llllllllllllIlllIIIIllllIllIlIII, llllllllllllIlllIIIIllllIllIIlll, llllllllllllIlllIIIIllllIllIIllI, llllllllllllIlllIIIIllllIlIIllIl, llllllllllllIlllIIIIllllIllIIlII, llllllllllllIlllIIIIllllIllIIIll / 80.0, llllllllllllIlllIIIIllllIllIIIlI / 160.0, llllllllllllIlllIIIIllllIllIIIll / 80.0);
        this.noiseData2 = this.noiseGen1.generateNoiseOctaves(this.noiseData2, llllllllllllIlllIIIIllllIlIlIIIl, llllllllllllIlllIIIIllllIllIlIII, llllllllllllIlllIIIIllllIllIIlll, llllllllllllIlllIIIIllllIllIIllI, llllllllllllIlllIIIIllllIlIIllIl, llllllllllllIlllIIIIllllIllIIlII, llllllllllllIlllIIIIllllIllIIIll, llllllllllllIlllIIIIllllIllIIIlI, llllllllllllIlllIIIIllllIllIIIll);
        this.noiseData3 = this.noiseGen2.generateNoiseOctaves(this.noiseData3, llllllllllllIlllIIIIllllIlIlIIIl, llllllllllllIlllIIIIllllIllIlIII, llllllllllllIlllIIIIllllIllIIlll, llllllllllllIlllIIIIllllIllIIllI, llllllllllllIlllIIIIllllIlIIllIl, llllllllllllIlllIIIIllllIllIIlII, llllllllllllIlllIIIIllllIllIIIll, llllllllllllIlllIIIIllllIllIIIlI, llllllllllllIlllIIIIllllIllIIIll);
        int llllllllllllIlllIIIIllllIllIIIIl = ChunkProviderEnd.llIIlIllllIIIl[6];
        int llllllllllllIlllIIIIllllIllIIIII = ChunkProviderEnd.llIIlIllllIIIl[6];
        "".length();
        if (-(0x15 ^ 0x11) >= 0) {
            return null;
        }
        while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIllllIllIIIII, llllllllllllIlllIIIIllllIllIIllI)) {
            int llllllllllllIlllIIIIllllIlIlllll = ChunkProviderEnd.llIIlIllllIIIl[6];
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
            while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIllllIlIlllll, llllllllllllIlllIIIIllllIllIIlII)) {
                final float llllllllllllIlllIIIIllllIlIllllI = (llllllllllllIlllIIIIllllIllIIIII + llllllllllllIlllIIIIllllIlIlIIIl) / 1.0f;
                final float llllllllllllIlllIIIIllllIlIlllIl = (llllllllllllIlllIIIIllllIlIlllll + llllllllllllIlllIIIIllllIllIIlll) / 1.0f;
                float llllllllllllIlllIIIIllllIlIlllII = 100.0f - MathHelper.sqrt_float(llllllllllllIlllIIIIllllIlIllllI * llllllllllllIlllIIIIllllIlIllllI + llllllllllllIlllIIIIllllIlIlllIl * llllllllllllIlllIIIIllllIlIlllIl) * 8.0f;
                if (lIIIlllIIIIIIlIl(lIIIlllIIIIIllII(llllllllllllIlllIIIIllllIlIlllII, 80.0f))) {
                    llllllllllllIlllIIIIllllIlIlllII = 80.0f;
                }
                if (lIIIlllIIIIIlIll(lIIIlllIIIIIllIl(llllllllllllIlllIIIIllllIlIlllII, -100.0f))) {
                    llllllllllllIlllIIIIllllIlIlllII = -100.0f;
                }
                int llllllllllllIlllIIIIllllIlIllIll = ChunkProviderEnd.llIIlIllllIIIl[6];
                "".length();
                if ((0xC4 ^ 0xC0) != (0x3 ^ 0x7)) {
                    return null;
                }
                while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIllllIlIllIll, llllllllllllIlllIIIIllllIlIIllIl)) {
                    double llllllllllllIlllIIIIllllIlIllIlI = 0.0;
                    final double llllllllllllIlllIIIIllllIlIllIIl = this.noiseData2[llllllllllllIlllIIIIllllIllIIIIl] / 512.0;
                    final double llllllllllllIlllIIIIllllIlIllIII = this.noiseData3[llllllllllllIlllIIIIllllIllIIIIl] / 512.0;
                    final double llllllllllllIlllIIIIllllIlIlIlll = (this.noiseData1[llllllllllllIlllIIIIllllIllIIIIl] / 10.0 + 1.0) / 2.0;
                    if (lIIIlllIIIIIlIll(lIIIlllIIIIIlllI(llllllllllllIlllIIIIllllIlIlIlll, 0.0))) {
                        llllllllllllIlllIIIIllllIlIllIlI = llllllllllllIlllIIIIllllIlIllIIl;
                        "".length();
                        if ((0x62 ^ 0x17 ^ (0xD1 ^ 0xA0)) != (((0x2 ^ 0x6) & ~(0x45 ^ 0x41)) ^ (0x92 ^ 0x96))) {
                            return null;
                        }
                    }
                    else if (lIIIlllIIIIIIlIl(lIIIlllIIIIIllll(llllllllllllIlllIIIIllllIlIlIlll, 1.0))) {
                        llllllllllllIlllIIIIllllIlIllIlI = llllllllllllIlllIIIIllllIlIllIII;
                        "".length();
                        if (-"  ".length() >= 0) {
                            return null;
                        }
                    }
                    else {
                        llllllllllllIlllIIIIllllIlIllIlI = llllllllllllIlllIIIIllllIlIllIIl + (llllllllllllIlllIIIIllllIlIllIII - llllllllllllIlllIIIIllllIlIllIIl) * llllllllllllIlllIIIIllllIlIlIlll;
                    }
                    llllllllllllIlllIIIIllllIlIllIlI -= 8.0;
                    llllllllllllIlllIIIIllllIlIllIlI += llllllllllllIlllIIIIllllIlIlllII;
                    int llllllllllllIlllIIIIllllIlIlIllI = ChunkProviderEnd.llIIlIllllIIIl[3];
                    if (lIIIlllIIIIlIIIl(llllllllllllIlllIIIIllllIlIllIll, llllllllllllIlllIIIIllllIlIIllIl / ChunkProviderEnd.llIIlIllllIIIl[3] - llllllllllllIlllIIIIllllIlIlIllI)) {
                        double llllllllllllIlllIIIIllllIlIlIlIl = (llllllllllllIlllIIIIllllIlIllIll - (llllllllllllIlllIIIIllllIlIIllIl / ChunkProviderEnd.llIIlIllllIIIl[3] - llllllllllllIlllIIIIllllIlIlIllI)) / 64.0f;
                        llllllllllllIlllIIIIllllIlIlIlIl = MathHelper.clamp_double(llllllllllllIlllIIIIllllIlIlIlIl, 0.0, 1.0);
                        llllllllllllIlllIIIIllllIlIllIlI = llllllllllllIlllIIIIllllIlIllIlI * (1.0 - llllllllllllIlllIIIIllllIlIlIlIl) + -3000.0 * llllllllllllIlllIIIIllllIlIlIlIl;
                    }
                    llllllllllllIlllIIIIllllIlIlIllI = ChunkProviderEnd.llIIlIllllIIIl[1];
                    if (lIIIlllIIIIlIIlI(llllllllllllIlllIIIIllllIlIllIll, llllllllllllIlllIIIIllllIlIlIllI)) {
                        final double llllllllllllIlllIIIIllllIlIlIlII = (llllllllllllIlllIIIIllllIlIlIllI - llllllllllllIlllIIIIllllIlIllIll) / (llllllllllllIlllIIIIllllIlIlIllI - 1.0f);
                        llllllllllllIlllIIIIllllIlIllIlI = llllllllllllIlllIIIIllllIlIllIlI * (1.0 - llllllllllllIlllIIIIllllIlIlIlII) + -30.0 * llllllllllllIlllIIIIllllIlIlIlII;
                    }
                    llllllllllllIlllIIIIllllIlIlIIlI[llllllllllllIlllIIIIllllIllIIIIl] = llllllllllllIlllIIIIllllIlIllIlI;
                    ++llllllllllllIlllIIIIllllIllIIIIl;
                    ++llllllllllllIlllIIIIllllIlIllIll;
                }
                ++llllllllllllIlllIIIIllllIlIlllll;
            }
            ++llllllllllllIlllIIIIllllIllIIIII;
        }
        return llllllllllllIlllIIIIllllIlIlIIlI;
    }
    
    @Override
    public List<BiomeGenBase.SpawnListEntry> getPossibleCreatures(final EnumCreatureType llllllllllllIlllIIIIllllIIIllIIl, final BlockPos llllllllllllIlllIIIIllllIIIllIII) {
        return this.endWorld.getBiomeGenForCoords(llllllllllllIlllIIIIllllIIIllIII).getSpawnableList(llllllllllllIlllIIIIllllIIIllIIl);
    }
    
    private static void lIIIlllIIIIIIIll() {
        (llIIlIllllIIIl = new int[11])[0] = (0x36 ^ 0x26);
        ChunkProviderEnd.llIIlIllllIIIl[1] = (0x10 ^ 0x18);
        ChunkProviderEnd.llIIlIllllIIIl[2] = (87 + 64 - 91 + 97 ^ 83 + 37 + 15 + 16);
        ChunkProviderEnd.llIIlIllllIIIl[3] = "  ".length();
        ChunkProviderEnd.llIIlIllllIIIl[4] = " ".length();
        ChunkProviderEnd.llIIlIllllIIIl[5] = (0x94 ^ 0xB5);
        ChunkProviderEnd.llIIlIllllIIIl[6] = ((0x2B ^ 0x67 ^ (0x4E ^ 0x63)) & (0x4F ^ 0x63 ^ (0x63 ^ 0x2E) ^ -" ".length()));
        ChunkProviderEnd.llIIlIllllIIIl[7] = (0x62 ^ 0x66);
        ChunkProviderEnd.llIIlIllllIIIl[8] = (0x4 ^ 0x68 ^ (0x59 ^ 0x15));
        ChunkProviderEnd.llIIlIllllIIIl[9] = -" ".length();
        ChunkProviderEnd.llIIlIllllIIIl[10] = (0x10 ^ 0x27) + (0xEF ^ 0x9D) - (96 + 49 - 31 + 20) + (0x26 ^ 0x7A);
    }
    
    private static int lIIIlllIIIIIllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIlllIIIIlIIII(final Object llllllllllllIlllIIIIlllIlllIIllI) {
        return llllllllllllIlllIIIIlllIlllIIllI == null;
    }
    
    private static boolean lIIIlllIIIIlIIlI(final int llllllllllllIlllIIIIlllIllllIIIl, final int llllllllllllIlllIIIIlllIllllIIII) {
        return llllllllllllIlllIIIIlllIllllIIIl < llllllllllllIlllIIIIlllIllllIIII;
    }
    
    public void func_180520_a(final int llllllllllllIlllIIIIllllllIlIlIl, final int llllllllllllIlllIIIIllllllIlIlII, final ChunkPrimer llllllllllllIlllIIIIllllllIlIIll) {
        final int llllllllllllIlllIIIIllllllllIlIl = ChunkProviderEnd.llIIlIllllIIIl[3];
        final int llllllllllllIlllIIIIllllllllIlII = llllllllllllIlllIIIIllllllllIlIl + ChunkProviderEnd.llIIlIllllIIIl[4];
        final int llllllllllllIlllIIIIllllllllIIll = ChunkProviderEnd.llIIlIllllIIIl[5];
        final int llllllllllllIlllIIIIllllllllIIlI = llllllllllllIlllIIIIllllllllIlIl + ChunkProviderEnd.llIIlIllllIIIl[4];
        this.densities = this.initializeNoiseField(this.densities, llllllllllllIlllIIIIllllllIlIlIl * llllllllllllIlllIIIIllllllllIlIl, ChunkProviderEnd.llIIlIllllIIIl[6], llllllllllllIlllIIIIllllllIlIlII * llllllllllllIlllIIIIllllllllIlIl, llllllllllllIlllIIIIllllllllIlII, llllllllllllIlllIIIIllllllllIIll, llllllllllllIlllIIIIllllllllIIlI);
        int llllllllllllIlllIIIIllllllllIIIl = ChunkProviderEnd.llIIlIllllIIIl[6];
        "".length();
        if (" ".length() == 0) {
            return;
        }
        while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIllllllllIIIl, llllllllllllIlllIIIIllllllllIlIl)) {
            int llllllllllllIlllIIIIllllllllIIII = ChunkProviderEnd.llIIlIllllIIIl[6];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIllllllllIIII, llllllllllllIlllIIIIllllllllIlIl)) {
                int llllllllllllIlllIIIIlllllllIllll = ChunkProviderEnd.llIIlIllllIIIl[6];
                "".length();
                if (((0x57 ^ 0x12) & ~(0x4E ^ 0xB)) != 0x0) {
                    return;
                }
                while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIlllllllIllll, ChunkProviderEnd.llIIlIllllIIIl[8])) {
                    final double llllllllllllIlllIIIIlllllllIlllI = 0.25;
                    double llllllllllllIlllIIIIlllllllIllIl = this.densities[((llllllllllllIlllIIIIllllllllIIIl + ChunkProviderEnd.llIIlIllllIIIl[6]) * llllllllllllIlllIIIIllllllllIIlI + llllllllllllIlllIIIIllllllllIIII + ChunkProviderEnd.llIIlIllllIIIl[6]) * llllllllllllIlllIIIIllllllllIIll + llllllllllllIlllIIIIlllllllIllll + ChunkProviderEnd.llIIlIllllIIIl[6]];
                    double llllllllllllIlllIIIIlllllllIllII = this.densities[((llllllllllllIlllIIIIllllllllIIIl + ChunkProviderEnd.llIIlIllllIIIl[6]) * llllllllllllIlllIIIIllllllllIIlI + llllllllllllIlllIIIIllllllllIIII + ChunkProviderEnd.llIIlIllllIIIl[4]) * llllllllllllIlllIIIIllllllllIIll + llllllllllllIlllIIIIlllllllIllll + ChunkProviderEnd.llIIlIllllIIIl[6]];
                    double llllllllllllIlllIIIIlllllllIlIll = this.densities[((llllllllllllIlllIIIIllllllllIIIl + ChunkProviderEnd.llIIlIllllIIIl[4]) * llllllllllllIlllIIIIllllllllIIlI + llllllllllllIlllIIIIllllllllIIII + ChunkProviderEnd.llIIlIllllIIIl[6]) * llllllllllllIlllIIIIllllllllIIll + llllllllllllIlllIIIIlllllllIllll + ChunkProviderEnd.llIIlIllllIIIl[6]];
                    double llllllllllllIlllIIIIlllllllIlIlI = this.densities[((llllllllllllIlllIIIIllllllllIIIl + ChunkProviderEnd.llIIlIllllIIIl[4]) * llllllllllllIlllIIIIllllllllIIlI + llllllllllllIlllIIIIllllllllIIII + ChunkProviderEnd.llIIlIllllIIIl[4]) * llllllllllllIlllIIIIllllllllIIll + llllllllllllIlllIIIIlllllllIllll + ChunkProviderEnd.llIIlIllllIIIl[6]];
                    final double llllllllllllIlllIIIIlllllllIlIIl = (this.densities[((llllllllllllIlllIIIIllllllllIIIl + ChunkProviderEnd.llIIlIllllIIIl[6]) * llllllllllllIlllIIIIllllllllIIlI + llllllllllllIlllIIIIllllllllIIII + ChunkProviderEnd.llIIlIllllIIIl[6]) * llllllllllllIlllIIIIllllllllIIll + llllllllllllIlllIIIIlllllllIllll + ChunkProviderEnd.llIIlIllllIIIl[4]] - llllllllllllIlllIIIIlllllllIllIl) * llllllllllllIlllIIIIlllllllIlllI;
                    final double llllllllllllIlllIIIIlllllllIlIII = (this.densities[((llllllllllllIlllIIIIllllllllIIIl + ChunkProviderEnd.llIIlIllllIIIl[6]) * llllllllllllIlllIIIIllllllllIIlI + llllllllllllIlllIIIIllllllllIIII + ChunkProviderEnd.llIIlIllllIIIl[4]) * llllllllllllIlllIIIIllllllllIIll + llllllllllllIlllIIIIlllllllIllll + ChunkProviderEnd.llIIlIllllIIIl[4]] - llllllllllllIlllIIIIlllllllIllII) * llllllllllllIlllIIIIlllllllIlllI;
                    final double llllllllllllIlllIIIIlllllllIIlll = (this.densities[((llllllllllllIlllIIIIllllllllIIIl + ChunkProviderEnd.llIIlIllllIIIl[4]) * llllllllllllIlllIIIIllllllllIIlI + llllllllllllIlllIIIIllllllllIIII + ChunkProviderEnd.llIIlIllllIIIl[6]) * llllllllllllIlllIIIIllllllllIIll + llllllllllllIlllIIIIlllllllIllll + ChunkProviderEnd.llIIlIllllIIIl[4]] - llllllllllllIlllIIIIlllllllIlIll) * llllllllllllIlllIIIIlllllllIlllI;
                    final double llllllllllllIlllIIIIlllllllIIllI = (this.densities[((llllllllllllIlllIIIIllllllllIIIl + ChunkProviderEnd.llIIlIllllIIIl[4]) * llllllllllllIlllIIIIllllllllIIlI + llllllllllllIlllIIIIllllllllIIII + ChunkProviderEnd.llIIlIllllIIIl[4]) * llllllllllllIlllIIIIllllllllIIll + llllllllllllIlllIIIIlllllllIllll + ChunkProviderEnd.llIIlIllllIIIl[4]] - llllllllllllIlllIIIIlllllllIlIlI) * llllllllllllIlllIIIIlllllllIlllI;
                    int llllllllllllIlllIIIIlllllllIIlIl = ChunkProviderEnd.llIIlIllllIIIl[6];
                    "".length();
                    if ("  ".length() == (0x9B ^ 0xAD ^ (0xB1 ^ 0x83))) {
                        return;
                    }
                    while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIlllllllIIlIl, ChunkProviderEnd.llIIlIllllIIIl[7])) {
                        final double llllllllllllIlllIIIIlllllllIIlII = 0.125;
                        double llllllllllllIlllIIIIlllllllIIIll = llllllllllllIlllIIIIlllllllIllIl;
                        double llllllllllllIlllIIIIlllllllIIIlI = llllllllllllIlllIIIIlllllllIllII;
                        final double llllllllllllIlllIIIIlllllllIIIIl = (llllllllllllIlllIIIIlllllllIlIll - llllllllllllIlllIIIIlllllllIllIl) * llllllllllllIlllIIIIlllllllIIlII;
                        final double llllllllllllIlllIIIIlllllllIIIII = (llllllllllllIlllIIIIlllllllIlIlI - llllllllllllIlllIIIIlllllllIllII) * llllllllllllIlllIIIIlllllllIIlII;
                        int llllllllllllIlllIIIIllllllIlllll = ChunkProviderEnd.llIIlIllllIIIl[6];
                        "".length();
                        if (-" ".length() >= ((134 + 39 - 119 + 99 ^ 38 + 86 - 80 + 142) & (9 + 174 - 174 + 215 ^ 156 + 72 - 128 + 95 ^ -" ".length()))) {
                            return;
                        }
                        while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIllllllIlllll, ChunkProviderEnd.llIIlIllllIIIl[1])) {
                            final double llllllllllllIlllIIIIllllllIllllI = 0.125;
                            double llllllllllllIlllIIIIllllllIlllIl = llllllllllllIlllIIIIlllllllIIIll;
                            final double llllllllllllIlllIIIIllllllIlllII = (llllllllllllIlllIIIIlllllllIIIlI - llllllllllllIlllIIIIlllllllIIIll) * llllllllllllIlllIIIIllllllIllllI;
                            int llllllllllllIlllIIIIllllllIllIll = ChunkProviderEnd.llIIlIllllIIIl[6];
                            "".length();
                            if (-" ".length() > 0) {
                                return;
                            }
                            while (!lIIIlllIIIIIIllI(llllllllllllIlllIIIIllllllIllIll, ChunkProviderEnd.llIIlIllllIIIl[1])) {
                                IBlockState llllllllllllIlllIIIIllllllIllIlI = null;
                                if (lIIIlllIIIIIIlIl(lIIIlllIIIIIIlII(llllllllllllIlllIIIIllllllIlllIl, 0.0))) {
                                    llllllllllllIlllIIIIllllllIllIlI = Blocks.end_stone.getDefaultState();
                                }
                                final int llllllllllllIlllIIIIllllllIllIIl = llllllllllllIlllIIIIllllllIlllll + llllllllllllIlllIIIIllllllllIIIl * ChunkProviderEnd.llIIlIllllIIIl[1];
                                final int llllllllllllIlllIIIIllllllIllIII = llllllllllllIlllIIIIlllllllIIlIl + llllllllllllIlllIIIIlllllllIllll * ChunkProviderEnd.llIIlIllllIIIl[7];
                                final int llllllllllllIlllIIIIllllllIlIlll = llllllllllllIlllIIIIllllllIllIll + llllllllllllIlllIIIIllllllllIIII * ChunkProviderEnd.llIIlIllllIIIl[1];
                                llllllllllllIlllIIIIllllllIlIIll.setBlockState(llllllllllllIlllIIIIllllllIllIIl, llllllllllllIlllIIIIllllllIllIII, llllllllllllIlllIIIIllllllIlIlll, llllllllllllIlllIIIIllllllIllIlI);
                                llllllllllllIlllIIIIllllllIlllIl += llllllllllllIlllIIIIllllllIlllII;
                                ++llllllllllllIlllIIIIllllllIllIll;
                            }
                            llllllllllllIlllIIIIlllllllIIIll += llllllllllllIlllIIIIlllllllIIIIl;
                            llllllllllllIlllIIIIlllllllIIIlI += llllllllllllIlllIIIIlllllllIIIII;
                            ++llllllllllllIlllIIIIllllllIlllll;
                        }
                        llllllllllllIlllIIIIlllllllIllIl += llllllllllllIlllIIIIlllllllIlIIl;
                        llllllllllllIlllIIIIlllllllIllII += llllllllllllIlllIIIIlllllllIlIII;
                        llllllllllllIlllIIIIlllllllIlIll += llllllllllllIlllIIIIlllllllIIlll;
                        llllllllllllIlllIIIIlllllllIlIlI += llllllllllllIlllIIIIlllllllIIllI;
                        ++llllllllllllIlllIIIIlllllllIIlIl;
                    }
                    ++llllllllllllIlllIIIIlllllllIllll;
                }
                ++llllllllllllIlllIIIIllllllllIIII;
            }
            ++llllllllllllIlllIIIIllllllllIIIl;
        }
    }
    
    @Override
    public String makeString() {
        return ChunkProviderEnd.llIIlIllllIIII[ChunkProviderEnd.llIIlIllllIIIl[6]];
    }
    
    private static int lIIIlllIIIIIIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public boolean saveChunks(final boolean llllllllllllIlllIIIIllllIIlIIllI, final IProgressUpdate llllllllllllIlllIIIIllllIIlIIlIl) {
        return ChunkProviderEnd.llIIlIllllIIIl[4] != 0;
    }
    
    private static boolean lIIIlllIIIIIIlll(final Object llllllllllllIlllIIIIlllIlllIlIIl, final Object llllllllllllIlllIIIIlllIlllIlIII) {
        return llllllllllllIlllIIIIlllIlllIlIIl == llllllllllllIlllIIIIlllIlllIlIII;
    }
    
    @Override
    public void populate(final IChunkProvider llllllllllllIlllIIIIllllIIllIlII, final int llllllllllllIlllIIIIllllIIlIllll, final int llllllllllllIlllIIIIllllIIlIlllI) {
        BlockFalling.fallInstantly = (ChunkProviderEnd.llIIlIllllIIIl[4] != 0);
        final BlockPos llllllllllllIlllIIIIllllIIllIIIl = new BlockPos(llllllllllllIlllIIIIllllIIlIllll * ChunkProviderEnd.llIIlIllllIIIl[0], ChunkProviderEnd.llIIlIllllIIIl[6], llllllllllllIlllIIIIllllIIlIlllI * ChunkProviderEnd.llIIlIllllIIIl[0]);
        this.endWorld.getBiomeGenForCoords(llllllllllllIlllIIIIllllIIllIIIl.add(ChunkProviderEnd.llIIlIllllIIIl[0], ChunkProviderEnd.llIIlIllllIIIl[6], ChunkProviderEnd.llIIlIllllIIIl[0])).decorate(this.endWorld, this.endWorld.rand, llllllllllllIlllIIIIllllIIllIIIl);
        BlockFalling.fallInstantly = (ChunkProviderEnd.llIIlIllllIIIl[6] != 0);
    }
    
    @Override
    public boolean canSave() {
        return ChunkProviderEnd.llIIlIllllIIIl[4] != 0;
    }
    
    @Override
    public boolean func_177460_a(final IChunkProvider llllllllllllIlllIIIIllllIIlIlIll, final Chunk llllllllllllIlllIIIIllllIIlIlIlI, final int llllllllllllIlllIIIIllllIIlIlIIl, final int llllllllllllIlllIIIIllllIIlIlIII) {
        return ChunkProviderEnd.llIIlIllllIIIl[6] != 0;
    }
    
    private static boolean lIIIlllIIIIlIIIl(final int llllllllllllIlllIIIIlllIlllIllIl, final int llllllllllllIlllIIIIlllIlllIllII) {
        return llllllllllllIlllIIIIlllIlllIllIl > llllllllllllIlllIIIIlllIlllIllII;
    }
}
