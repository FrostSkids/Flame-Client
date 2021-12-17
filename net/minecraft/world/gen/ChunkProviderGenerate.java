// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import net.minecraft.world.SpawnerAnimals;
import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.gen.feature.WorldGenLakes;
import net.minecraft.block.BlockFalling;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.block.BlockStaticLiquid;
import java.util.List;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.chunk.Chunk;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.init.Blocks;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.block.Block;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import java.util.Random;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraft.world.gen.structure.StructureOceanMonument;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderGenerate implements IChunkProvider
{
    public /* synthetic */ NoiseGeneratorOctaves noiseGen6;
    private static final /* synthetic */ String[] llIllIlIIIIIII;
    /* synthetic */ double[] field_147426_g;
    private /* synthetic */ WorldType field_177475_o;
    private final /* synthetic */ boolean mapFeaturesEnabled;
    private final /* synthetic */ double[] field_147434_q;
    private /* synthetic */ StructureOceanMonument oceanMonumentGenerator;
    public /* synthetic */ NoiseGeneratorOctaves mobSpawnerNoise;
    private /* synthetic */ MapGenVillage villageGenerator;
    private /* synthetic */ Random rand;
    private /* synthetic */ NoiseGeneratorOctaves field_147431_j;
    private /* synthetic */ double[] stoneNoise;
    private /* synthetic */ MapGenMineshaft mineshaftGenerator;
    private /* synthetic */ ChunkProviderSettings settings;
    private /* synthetic */ MapGenBase ravineGenerator;
    private /* synthetic */ World worldObj;
    private /* synthetic */ NoiseGeneratorPerlin field_147430_m;
    private /* synthetic */ NoiseGeneratorOctaves field_147432_k;
    private static final /* synthetic */ int[] llIllIlIIIIIIl;
    private /* synthetic */ MapGenStronghold strongholdGenerator;
    /* synthetic */ double[] field_147428_e;
    private /* synthetic */ MapGenBase caveGenerator;
    /* synthetic */ double[] field_147425_f;
    private /* synthetic */ Block field_177476_s;
    private final /* synthetic */ float[] parabolicField;
    private /* synthetic */ BiomeGenBase[] biomesForGeneration;
    /* synthetic */ double[] field_147427_d;
    private /* synthetic */ MapGenScatteredFeature scatteredFeatureGenerator;
    public /* synthetic */ NoiseGeneratorOctaves noiseGen5;
    private /* synthetic */ NoiseGeneratorOctaves field_147429_l;
    
    private static int lIIlIlllIllIllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void setBlocksInChunk(final int llllllllllllIllIIlllIIllIIlIlIll, final int llllllllllllIllIIlllIIllIIIIlIIl, final ChunkPrimer llllllllllllIllIIlllIIllIIlIlIIl) {
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().getBiomesForGeneration(this.biomesForGeneration, llllllllllllIllIIlllIIllIIlIlIll * ChunkProviderGenerate.llIllIlIIIIIIl[3] - ChunkProviderGenerate.llIllIlIIIIIIl[8], llllllllllllIllIIlllIIllIIIIlIIl * ChunkProviderGenerate.llIllIlIIIIIIl[3] - ChunkProviderGenerate.llIllIlIIIIIIl[8], ChunkProviderGenerate.llIllIlIIIIIIl[4], ChunkProviderGenerate.llIllIlIIIIIIl[4]);
        this.func_147423_a(llllllllllllIllIIlllIIllIIlIlIll * ChunkProviderGenerate.llIllIlIIIIIIl[3], ChunkProviderGenerate.llIllIlIIIIIIl[10], llllllllllllIllIIlllIIllIIIIlIIl * ChunkProviderGenerate.llIllIlIIIIIIl[3]);
        int llllllllllllIllIIlllIIllIIlIlIII = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIllIIlIlIII, ChunkProviderGenerate.llIllIlIIIIIIl[3])) {
            final int llllllllllllIllIIlllIIllIIlIIlll = llllllllllllIllIIlllIIllIIlIlIII * ChunkProviderGenerate.llIllIlIIIIIIl[9];
            final int llllllllllllIllIIlllIIllIIlIIllI = (llllllllllllIllIIlllIIllIIlIlIII + ChunkProviderGenerate.llIllIlIIIIIIl[11]) * ChunkProviderGenerate.llIllIlIIIIIIl[9];
            int llllllllllllIllIIlllIIllIIlIIlIl = ChunkProviderGenerate.llIllIlIIIIIIl[10];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIllIIlIIlIl, ChunkProviderGenerate.llIllIlIIIIIIl[3])) {
                final int llllllllllllIllIIlllIIllIIlIIlII = (llllllllllllIllIIlllIIllIIlIIlll + llllllllllllIllIIlllIIllIIlIIlIl) * ChunkProviderGenerate.llIllIlIIIIIIl[12];
                final int llllllllllllIllIIlllIIllIIlIIIll = (llllllllllllIllIIlllIIllIIlIIlll + llllllllllllIllIIlllIIllIIlIIlIl + ChunkProviderGenerate.llIllIlIIIIIIl[11]) * ChunkProviderGenerate.llIllIlIIIIIIl[12];
                final int llllllllllllIllIIlllIIllIIlIIIlI = (llllllllllllIllIIlllIIllIIlIIllI + llllllllllllIllIIlllIIllIIlIIlIl) * ChunkProviderGenerate.llIllIlIIIIIIl[12];
                final int llllllllllllIllIIlllIIllIIlIIIIl = (llllllllllllIllIIlllIIllIIlIIllI + llllllllllllIllIIlllIIllIIlIIlIl + ChunkProviderGenerate.llIllIlIIIIIIl[11]) * ChunkProviderGenerate.llIllIlIIIIIIl[12];
                int llllllllllllIllIIlllIIllIIlIIIII = ChunkProviderGenerate.llIllIlIIIIIIl[10];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIllIIlIIIII, ChunkProviderGenerate.llIllIlIIIIIIl[13])) {
                    final double llllllllllllIllIIlllIIllIIIlllll = 0.125;
                    double llllllllllllIllIIlllIIllIIIllllI = this.field_147434_q[llllllllllllIllIIlllIIllIIlIIlII + llllllllllllIllIIlllIIllIIlIIIII];
                    double llllllllllllIllIIlllIIllIIIlllIl = this.field_147434_q[llllllllllllIllIIlllIIllIIlIIIll + llllllllllllIllIIlllIIllIIlIIIII];
                    double llllllllllllIllIIlllIIllIIIlllII = this.field_147434_q[llllllllllllIllIIlllIIllIIlIIIlI + llllllllllllIllIIlllIIllIIlIIIII];
                    double llllllllllllIllIIlllIIllIIIllIll = this.field_147434_q[llllllllllllIllIIlllIIllIIlIIIIl + llllllllllllIllIIlllIIllIIlIIIII];
                    final double llllllllllllIllIIlllIIllIIIllIlI = (this.field_147434_q[llllllllllllIllIIlllIIllIIlIIlII + llllllllllllIllIIlllIIllIIlIIIII + ChunkProviderGenerate.llIllIlIIIIIIl[11]] - llllllllllllIllIIlllIIllIIIllllI) * llllllllllllIllIIlllIIllIIIlllll;
                    final double llllllllllllIllIIlllIIllIIIllIIl = (this.field_147434_q[llllllllllllIllIIlllIIllIIlIIIll + llllllllllllIllIIlllIIllIIlIIIII + ChunkProviderGenerate.llIllIlIIIIIIl[11]] - llllllllllllIllIIlllIIllIIIlllIl) * llllllllllllIllIIlllIIllIIIlllll;
                    final double llllllllllllIllIIlllIIllIIIllIII = (this.field_147434_q[llllllllllllIllIIlllIIllIIlIIIlI + llllllllllllIllIIlllIIllIIlIIIII + ChunkProviderGenerate.llIllIlIIIIIIl[11]] - llllllllllllIllIIlllIIllIIIlllII) * llllllllllllIllIIlllIIllIIIlllll;
                    final double llllllllllllIllIIlllIIllIIIlIlll = (this.field_147434_q[llllllllllllIllIIlllIIllIIlIIIIl + llllllllllllIllIIlllIIllIIlIIIII + ChunkProviderGenerate.llIllIlIIIIIIl[11]] - llllllllllllIllIIlllIIllIIIllIll) * llllllllllllIllIIlllIIllIIIlllll;
                    int llllllllllllIllIIlllIIllIIIlIllI = ChunkProviderGenerate.llIllIlIIIIIIl[10];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIllIIIlIllI, ChunkProviderGenerate.llIllIlIIIIIIl[2])) {
                        final double llllllllllllIllIIlllIIllIIIlIlIl = 0.25;
                        double llllllllllllIllIIlllIIllIIIlIlII = llllllllllllIllIIlllIIllIIIllllI;
                        double llllllllllllIllIIlllIIllIIIlIIll = llllllllllllIllIIlllIIllIIIlllIl;
                        final double llllllllllllIllIIlllIIllIIIlIIlI = (llllllllllllIllIIlllIIllIIIlllII - llllllllllllIllIIlllIIllIIIllllI) * llllllllllllIllIIlllIIllIIIlIlIl;
                        final double llllllllllllIllIIlllIIllIIIlIIIl = (llllllllllllIllIIlllIIllIIIllIll - llllllllllllIllIIlllIIllIIIlllIl) * llllllllllllIllIIlllIIllIIIlIlIl;
                        int llllllllllllIllIIlllIIllIIIlIIII = ChunkProviderGenerate.llIllIlIIIIIIl[10];
                        "".length();
                        if ((0x6 ^ 0x3) <= 0) {
                            return;
                        }
                        while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIllIIIlIIII, ChunkProviderGenerate.llIllIlIIIIIIl[3])) {
                            final double llllllllllllIllIIlllIIllIIIIllll = 0.25;
                            final double llllllllllllIllIIlllIIllIIIIlllI = (llllllllllllIllIIlllIIllIIIlIIll - llllllllllllIllIIlllIIllIIIlIlII) * llllllllllllIllIIlllIIllIIIIllll;
                            double llllllllllllIllIIlllIIllIIIIllIl = llllllllllllIllIIlllIIllIIIlIlII - llllllllllllIllIIlllIIllIIIIlllI;
                            int llllllllllllIllIIlllIIllIIIIllII = ChunkProviderGenerate.llIllIlIIIIIIl[10];
                            "".length();
                            if (-" ".length() > 0) {
                                return;
                            }
                            while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIllIIIIllII, ChunkProviderGenerate.llIllIlIIIIIIl[3])) {
                                if (lIIlIlllIllIlIIl(lIIlIlllIllIlIII(llllllllllllIllIIlllIIllIIIIllIl += llllllllllllIllIIlllIIllIIIIlllI, 0.0))) {
                                    llllllllllllIllIIlllIIllIIlIlIIl.setBlockState(llllllllllllIllIIlllIIllIIlIlIII * ChunkProviderGenerate.llIllIlIIIIIIl[3] + llllllllllllIllIIlllIIllIIIlIIII, llllllllllllIllIIlllIIllIIlIIIII * ChunkProviderGenerate.llIllIlIIIIIIl[2] + llllllllllllIllIIlllIIllIIIlIllI, llllllllllllIllIIlllIIllIIlIIlIl * ChunkProviderGenerate.llIllIlIIIIIIl[3] + llllllllllllIllIIlllIIllIIIIllII, Blocks.stone.getDefaultState());
                                    "".length();
                                    if (((0x7D ^ 0x4C) & ~(0xB9 ^ 0x88)) != 0x0) {
                                        return;
                                    }
                                }
                                else if (lIIlIlllIllIlIlI(llllllllllllIllIIlllIIllIIlIIIII * ChunkProviderGenerate.llIllIlIIIIIIl[2] + llllllllllllIllIIlllIIllIIIlIllI, this.settings.seaLevel)) {
                                    llllllllllllIllIIlllIIllIIlIlIIl.setBlockState(llllllllllllIllIIlllIIllIIlIlIII * ChunkProviderGenerate.llIllIlIIIIIIl[3] + llllllllllllIllIIlllIIllIIIlIIII, llllllllllllIllIIlllIIllIIlIIIII * ChunkProviderGenerate.llIllIlIIIIIIl[2] + llllllllllllIllIIlllIIllIIIlIllI, llllllllllllIllIIlllIIllIIlIIlIl * ChunkProviderGenerate.llIllIlIIIIIIl[3] + llllllllllllIllIIlllIIllIIIIllII, this.field_177476_s.getDefaultState());
                                }
                                ++llllllllllllIllIIlllIIllIIIIllII;
                            }
                            llllllllllllIllIIlllIIllIIIlIlII += llllllllllllIllIIlllIIllIIIlIIlI;
                            llllllllllllIllIIlllIIllIIIlIIll += llllllllllllIllIIlllIIllIIIlIIIl;
                            ++llllllllllllIllIIlllIIllIIIlIIII;
                        }
                        llllllllllllIllIIlllIIllIIIllllI += llllllllllllIllIIlllIIllIIIllIlI;
                        llllllllllllIllIIlllIIllIIIlllIl += llllllllllllIllIIlllIIllIIIllIIl;
                        llllllllllllIllIIlllIIllIIIlllII += llllllllllllIllIIlllIIllIIIllIII;
                        llllllllllllIllIIlllIIllIIIllIll += llllllllllllIllIIlllIIllIIIlIlll;
                        ++llllllllllllIllIIlllIIllIIIlIllI;
                    }
                    ++llllllllllllIllIIlllIIllIIlIIIII;
                }
                ++llllllllllllIllIIlllIIllIIlIIlIl;
            }
            ++llllllllllllIllIIlllIIllIIlIlIII;
        }
    }
    
    @Override
    public String makeString() {
        return ChunkProviderGenerate.llIllIlIIIIIII[ChunkProviderGenerate.llIllIlIIIIIIl[10]];
    }
    
    private static String lIIlIlllIllIIIlI(String llllllllllllIllIIlllIIIlllIlIllI, final String llllllllllllIllIIlllIIIlllIllIlI) {
        llllllllllllIllIIlllIIIlllIlIllI = new String(Base64.getDecoder().decode(llllllllllllIllIIlllIIIlllIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlllIIIlllIllIIl = new StringBuilder();
        final char[] llllllllllllIllIIlllIIIlllIllIII = llllllllllllIllIIlllIIIlllIllIlI.toCharArray();
        int llllllllllllIllIIlllIIIlllIlIlll = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        final double llllllllllllIllIIlllIIIlllIlIIIl = (Object)llllllllllllIllIIlllIIIlllIlIllI.toCharArray();
        final byte llllllllllllIllIIlllIIIlllIlIIII = (byte)llllllllllllIllIIlllIIIlllIlIIIl.length;
        boolean llllllllllllIllIIlllIIIlllIIllll = ChunkProviderGenerate.llIllIlIIIIIIl[10] != 0;
        while (lIIlIlllIllIlIlI(llllllllllllIllIIlllIIIlllIIllll ? 1 : 0, llllllllllllIllIIlllIIIlllIlIIII)) {
            final char llllllllllllIllIIlllIIIlllIlllII = llllllllllllIllIIlllIIIlllIlIIIl[llllllllllllIllIIlllIIIlllIIllll];
            llllllllllllIllIIlllIIIlllIllIIl.append((char)(llllllllllllIllIIlllIIIlllIlllII ^ llllllllllllIllIIlllIIIlllIllIII[llllllllllllIllIIlllIIIlllIlIlll % llllllllllllIllIIlllIIIlllIllIII.length]));
            "".length();
            ++llllllllllllIllIIlllIIIlllIlIlll;
            ++llllllllllllIllIIlllIIIlllIIllll;
            "".length();
            if (((0xD ^ 0x59 ^ (0x68 ^ 0x22)) & (121 + 130 - 190 + 82 ^ 124 + 139 - 121 + 3 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlllIIIlllIllIIl);
    }
    
    private static boolean lIIlIlllIllIIllI(final Object llllllllllllIllIIlllIIIllIlIllll) {
        return llllllllllllIllIIlllIIIllIlIllll != null;
    }
    
    static {
        lIIlIlllIllIIlII();
        lIIlIlllIllIIIll();
    }
    
    private void func_147423_a(int llllllllllllIllIIlllIIlIlIIlllII, final int llllllllllllIllIIlllIIlIIllllIll, int llllllllllllIllIIlllIIlIIllllIlI) {
        this.field_147426_g = this.noiseGen6.generateNoiseOctaves(this.field_147426_g, llllllllllllIllIIlllIIlIlIIlllII, llllllllllllIllIIlllIIlIIllllIlI, ChunkProviderGenerate.llIllIlIIIIIIl[9], ChunkProviderGenerate.llIllIlIIIIIIl[9], this.settings.depthNoiseScaleX, this.settings.depthNoiseScaleZ, this.settings.depthNoiseScaleExponent);
        final float llllllllllllIllIIlllIIlIlIIllIIl = this.settings.coordinateScale;
        final float llllllllllllIllIIlllIIlIlIIllIII = this.settings.heightScale;
        this.field_147427_d = this.field_147429_l.generateNoiseOctaves(this.field_147427_d, llllllllllllIllIIlllIIlIlIIlllII, llllllllllllIllIIlllIIlIIllllIll, llllllllllllIllIIlllIIlIIllllIlI, ChunkProviderGenerate.llIllIlIIIIIIl[9], ChunkProviderGenerate.llIllIlIIIIIIl[12], ChunkProviderGenerate.llIllIlIIIIIIl[9], llllllllllllIllIIlllIIlIlIIllIIl / this.settings.mainNoiseScaleX, llllllllllllIllIIlllIIlIlIIllIII / this.settings.mainNoiseScaleY, llllllllllllIllIIlllIIlIlIIllIIl / this.settings.mainNoiseScaleZ);
        this.field_147428_e = this.field_147431_j.generateNoiseOctaves(this.field_147428_e, llllllllllllIllIIlllIIlIlIIlllII, llllllllllllIllIIlllIIlIIllllIll, llllllllllllIllIIlllIIlIIllllIlI, ChunkProviderGenerate.llIllIlIIIIIIl[9], ChunkProviderGenerate.llIllIlIIIIIIl[12], ChunkProviderGenerate.llIllIlIIIIIIl[9], llllllllllllIllIIlllIIlIlIIllIIl, llllllllllllIllIIlllIIlIlIIllIII, llllllllllllIllIIlllIIlIlIIllIIl);
        this.field_147425_f = this.field_147432_k.generateNoiseOctaves(this.field_147425_f, llllllllllllIllIIlllIIlIlIIlllII, llllllllllllIllIIlllIIlIIllllIll, llllllllllllIllIIlllIIlIIllllIlI, ChunkProviderGenerate.llIllIlIIIIIIl[9], ChunkProviderGenerate.llIllIlIIIIIIl[12], ChunkProviderGenerate.llIllIlIIIIIIl[9], llllllllllllIllIIlllIIlIlIIllIIl, llllllllllllIllIIlllIIlIlIIllIII, llllllllllllIllIIlllIIlIlIIllIIl);
        llllllllllllIllIIlllIIlIIllllIlI = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        llllllllllllIllIIlllIIlIlIIlllII = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        int llllllllllllIllIIlllIIlIlIIlIlll = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        int llllllllllllIllIIlllIIlIlIIlIllI = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        int llllllllllllIllIIlllIIlIlIIlIlIl = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        "".length();
        if ((0xC9 ^ 0x81 ^ (0x59 ^ 0x15)) == "   ".length()) {
            return;
        }
        while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIlIIlIlIl, ChunkProviderGenerate.llIllIlIIIIIIl[9])) {
            int llllllllllllIllIIlllIIlIlIIlIlII = ChunkProviderGenerate.llIllIlIIIIIIl[10];
            "".length();
            if (-" ".length() > 0) {
                return;
            }
            while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIlIIlIlII, ChunkProviderGenerate.llIllIlIIIIIIl[9])) {
                float llllllllllllIllIIlllIIlIlIIlIIll = 0.0f;
                float llllllllllllIllIIlllIIlIlIIlIIlI = 0.0f;
                float llllllllllllIllIIlllIIlIlIIlIIIl = 0.0f;
                final int llllllllllllIllIIlllIIlIlIIlIIII = ChunkProviderGenerate.llIllIlIIIIIIl[8];
                final BiomeGenBase llllllllllllIllIIlllIIlIlIIIllll = this.biomesForGeneration[llllllllllllIllIIlllIIlIlIIlIlIl + ChunkProviderGenerate.llIllIlIIIIIIl[8] + (llllllllllllIllIIlllIIlIlIIlIlII + ChunkProviderGenerate.llIllIlIIIIIIl[8]) * ChunkProviderGenerate.llIllIlIIIIIIl[4]];
                int llllllllllllIllIIlllIIlIlIIIlllI = -llllllllllllIllIIlllIIlIlIIlIIII;
                "".length();
                if (-(0x86 ^ 0x82) >= 0) {
                    return;
                }
                while (!lIIlIlllIllIIlIl(llllllllllllIllIIlllIIlIlIIIlllI, llllllllllllIllIIlllIIlIlIIlIIII)) {
                    int llllllllllllIllIIlllIIlIlIIIllIl = -llllllllllllIllIIlllIIlIlIIlIIII;
                    "".length();
                    if (-" ".length() == "   ".length()) {
                        return;
                    }
                    while (!lIIlIlllIllIIlIl(llllllllllllIllIIlllIIlIlIIIllIl, llllllllllllIllIIlllIIlIlIIlIIII)) {
                        final BiomeGenBase llllllllllllIllIIlllIIlIlIIIllII = this.biomesForGeneration[llllllllllllIllIIlllIIlIlIIlIlIl + llllllllllllIllIIlllIIlIlIIIlllI + ChunkProviderGenerate.llIllIlIIIIIIl[8] + (llllllllllllIllIIlllIIlIlIIlIlII + llllllllllllIllIIlllIIlIlIIIllIl + ChunkProviderGenerate.llIllIlIIIIIIl[8]) * ChunkProviderGenerate.llIllIlIIIIIIl[4]];
                        float llllllllllllIllIIlllIIlIlIIIlIll = this.settings.biomeDepthOffSet + llllllllllllIllIIlllIIlIlIIIllII.minHeight * this.settings.biomeDepthWeight;
                        float llllllllllllIllIIlllIIlIlIIIlIlI = this.settings.biomeScaleOffset + llllllllllllIllIIlllIIlIlIIIllII.maxHeight * this.settings.biomeScaleWeight;
                        if (lIIlIlllIllIllll(this.field_177475_o, WorldType.AMPLIFIED) && lIIlIlllIllIlIIl(lIIlIlllIllIllII(llllllllllllIllIIlllIIlIlIIIlIll, 0.0f))) {
                            llllllllllllIllIIlllIIlIlIIIlIll = 1.0f + llllllllllllIllIIlllIIlIlIIIlIll * 2.0f;
                            llllllllllllIllIIlllIIlIlIIIlIlI = 1.0f + llllllllllllIllIIlllIIlIlIIIlIlI * 4.0f;
                        }
                        float llllllllllllIllIIlllIIlIlIIIlIIl = this.parabolicField[llllllllllllIllIIlllIIlIlIIIlllI + ChunkProviderGenerate.llIllIlIIIIIIl[8] + (llllllllllllIllIIlllIIlIlIIIllIl + ChunkProviderGenerate.llIllIlIIIIIIl[8]) * ChunkProviderGenerate.llIllIlIIIIIIl[9]] / (llllllllllllIllIIlllIIlIlIIIlIll + 2.0f);
                        if (lIIlIlllIllIlIIl(lIIlIlllIllIllII(llllllllllllIllIIlllIIlIlIIIllII.minHeight, llllllllllllIllIIlllIIlIlIIIllll.minHeight))) {
                            llllllllllllIllIIlllIIlIlIIIlIIl /= 2.0f;
                        }
                        llllllllllllIllIIlllIIlIlIIlIIll += llllllllllllIllIIlllIIlIlIIIlIlI * llllllllllllIllIIlllIIlIlIIIlIIl;
                        llllllllllllIllIIlllIIlIlIIlIIlI += llllllllllllIllIIlllIIlIlIIIlIll * llllllllllllIllIIlllIIlIlIIIlIIl;
                        llllllllllllIllIIlllIIlIlIIlIIIl += llllllllllllIllIIlllIIlIlIIIlIIl;
                        ++llllllllllllIllIIlllIIlIlIIIllIl;
                    }
                    ++llllllllllllIllIIlllIIlIlIIIlllI;
                }
                llllllllllllIllIIlllIIlIlIIlIIll /= llllllllllllIllIIlllIIlIlIIlIIIl;
                llllllllllllIllIIlllIIlIlIIlIIlI /= llllllllllllIllIIlllIIlIlIIlIIIl;
                llllllllllllIllIIlllIIlIlIIlIIll = llllllllllllIllIIlllIIlIlIIlIIll * 0.9f + 0.1f;
                llllllllllllIllIIlllIIlIlIIlIIlI = (llllllllllllIllIIlllIIlIlIIlIIlI * 4.0f - 1.0f) / 8.0f;
                double llllllllllllIllIIlllIIlIlIIIlIII = this.field_147426_g[llllllllllllIllIIlllIIlIlIIlIllI] / 8000.0;
                if (lIIlIlllIlllIIII(lIIlIlllIllIllIl(llllllllllllIllIIlllIIlIlIIIlIII, 0.0))) {
                    llllllllllllIllIIlllIIlIlIIIlIII = -llllllllllllIllIIlllIIlIlIIIlIII * 0.3;
                }
                llllllllllllIllIIlllIIlIlIIIlIII = llllllllllllIllIIlllIIlIlIIIlIII * 3.0 - 2.0;
                if (lIIlIlllIlllIIII(lIIlIlllIllIllIl(llllllllllllIllIIlllIIlIlIIIlIII, 0.0))) {
                    llllllllllllIllIIlllIIlIlIIIlIII /= 2.0;
                    if (lIIlIlllIlllIIII(lIIlIlllIllIllIl(llllllllllllIllIIlllIIlIlIIIlIII, -1.0))) {
                        llllllllllllIllIIlllIIlIlIIIlIII = -1.0;
                    }
                    llllllllllllIllIIlllIIlIlIIIlIII /= 1.4;
                    llllllllllllIllIIlllIIlIlIIIlIII /= 2.0;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    if (lIIlIlllIllIlIIl(lIIlIlllIllIlllI(llllllllllllIllIIlllIIlIlIIIlIII, 1.0))) {
                        llllllllllllIllIIlllIIlIlIIIlIII = 1.0;
                    }
                    llllllllllllIllIIlllIIlIlIIIlIII /= 8.0;
                }
                ++llllllllllllIllIIlllIIlIlIIlIllI;
                double llllllllllllIllIIlllIIlIlIIIIlll = llllllllllllIllIIlllIIlIlIIlIIlI;
                final double llllllllllllIllIIlllIIlIlIIIIllI = llllllllllllIllIIlllIIlIlIIlIIll;
                llllllllllllIllIIlllIIlIlIIIIlll += llllllllllllIllIIlllIIlIlIIIlIII * 0.2;
                llllllllllllIllIIlllIIlIlIIIIlll = llllllllllllIllIIlllIIlIlIIIIlll * this.settings.baseSize / 8.0;
                final double llllllllllllIllIIlllIIlIlIIIIlIl = this.settings.baseSize + llllllllllllIllIIlllIIlIlIIIIlll * 4.0;
                int llllllllllllIllIIlllIIlIlIIIIlII = ChunkProviderGenerate.llIllIlIIIIIIl[10];
                "".length();
                if (((0x6A ^ 0x2E) & ~(0x87 ^ 0xC3)) != 0x0) {
                    return;
                }
                while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIlIIIIlII, ChunkProviderGenerate.llIllIlIIIIIIl[12])) {
                    double llllllllllllIllIIlllIIlIlIIIIIll = (llllllllllllIllIIlllIIlIlIIIIlII - llllllllllllIllIIlllIIlIlIIIIlIl) * this.settings.stretchY * 128.0 / 256.0 / llllllllllllIllIIlllIIlIlIIIIllI;
                    if (lIIlIlllIlllIIII(lIIlIlllIllIllIl(llllllllllllIllIIlllIIlIlIIIIIll, 0.0))) {
                        llllllllllllIllIIlllIIlIlIIIIIll *= 4.0;
                    }
                    final double llllllllllllIllIIlllIIlIlIIIIIlI = this.field_147428_e[llllllllllllIllIIlllIIlIlIIlIlll] / this.settings.lowerLimitScale;
                    final double llllllllllllIllIIlllIIlIlIIIIIIl = this.field_147425_f[llllllllllllIllIIlllIIlIlIIlIlll] / this.settings.upperLimitScale;
                    final double llllllllllllIllIIlllIIlIlIIIIIII = (this.field_147427_d[llllllllllllIllIIlllIIlIlIIlIlll] / 10.0 + 1.0) / 2.0;
                    double llllllllllllIllIIlllIIlIIlllllll = MathHelper.denormalizeClamp(llllllllllllIllIIlllIIlIlIIIIIlI, llllllllllllIllIIlllIIlIlIIIIIIl, llllllllllllIllIIlllIIlIlIIIIIII) - llllllllllllIllIIlllIIlIlIIIIIll;
                    if (lIIlIlllIllIIlIl(llllllllllllIllIIlllIIlIlIIIIlII, ChunkProviderGenerate.llIllIlIIIIIIl[14])) {
                        final double llllllllllllIllIIlllIIlIIllllllI = (llllllllllllIllIIlllIIlIlIIIIlII - ChunkProviderGenerate.llIllIlIIIIIIl[14]) / 3.0f;
                        llllllllllllIllIIlllIIlIIlllllll = llllllllllllIllIIlllIIlIIlllllll * (1.0 - llllllllllllIllIIlllIIlIIllllllI) + -10.0 * llllllllllllIllIIlllIIlIIllllllI;
                    }
                    this.field_147434_q[llllllllllllIllIIlllIIlIlIIlIlll] = llllllllllllIllIIlllIIlIIlllllll;
                    ++llllllllllllIllIIlllIIlIlIIlIlll;
                    ++llllllllllllIllIIlllIIlIlIIIIlII;
                }
                ++llllllllllllIllIIlllIIlIlIIlIlII;
            }
            ++llllllllllllIllIIlllIIlIlIIlIlIl;
        }
    }
    
    @Override
    public boolean unloadQueuedChunks() {
        return ChunkProviderGenerate.llIllIlIIIIIIl[10] != 0;
    }
    
    private static String lIIlIlllIllIIIIl(final String llllllllllllIllIIlllIIIlllIIIlII, final String llllllllllllIllIIlllIIIlllIIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIIIlllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIIIlllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllIIIlllIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllIIIlllIIlIII.init(ChunkProviderGenerate.llIllIlIIIIIIl[8], llllllllllllIllIIlllIIIlllIIlIIl);
            return new String(llllllllllllIllIIlllIIIlllIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIIIlllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIIIlllIIIlll) {
            llllllllllllIllIIlllIIIlllIIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Chunk provideChunk(final int llllllllllllIllIIlllIIlIllIIIIII, final int llllllllllllIllIIlllIIlIllIIIllI) {
        this.rand.setSeed(llllllllllllIllIIlllIIlIllIIIIII * 341873128712L + llllllllllllIllIIlllIIlIllIIIllI * 132897987541L);
        final ChunkPrimer llllllllllllIllIIlllIIlIllIIIlIl = new ChunkPrimer();
        this.setBlocksInChunk(llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI, llllllllllllIllIIlllIIlIllIIIlIl);
        this.biomesForGeneration = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(this.biomesForGeneration, llllllllllllIllIIlllIIlIllIIIIII * ChunkProviderGenerate.llIllIlIIIIIIl[1], llllllllllllIllIIlllIIlIllIIIllI * ChunkProviderGenerate.llIllIlIIIIIIl[1], ChunkProviderGenerate.llIllIlIIIIIIl[1], ChunkProviderGenerate.llIllIlIIIIIIl[1]);
        this.replaceBlocksForBiome(llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI, llllllllllllIllIIlllIIlIllIIIlIl, this.biomesForGeneration);
        if (lIIlIlllIllIIlll(this.settings.useCaves ? 1 : 0)) {
            this.caveGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI, llllllllllllIllIIlllIIlIllIIIlIl);
        }
        if (lIIlIlllIllIIlll(this.settings.useRavines ? 1 : 0)) {
            this.ravineGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI, llllllllllllIllIIlllIIlIllIIIlIl);
        }
        if (lIIlIlllIllIIlll(this.settings.useMineShafts ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.mineshaftGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI, llllllllllllIllIIlllIIlIllIIIlIl);
        }
        if (lIIlIlllIllIIlll(this.settings.useVillages ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.villageGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI, llllllllllllIllIIlllIIlIllIIIlIl);
        }
        if (lIIlIlllIllIIlll(this.settings.useStrongholds ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.strongholdGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI, llllllllllllIllIIlllIIlIllIIIlIl);
        }
        if (lIIlIlllIllIIlll(this.settings.useTemples ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.scatteredFeatureGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI, llllllllllllIllIIlllIIlIllIIIlIl);
        }
        if (lIIlIlllIllIIlll(this.settings.useMonuments ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.oceanMonumentGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI, llllllllllllIllIIlllIIlIllIIIlIl);
        }
        final Chunk llllllllllllIllIIlllIIlIllIIIlII = new Chunk(this.worldObj, llllllllllllIllIIlllIIlIllIIIlIl, llllllllllllIllIIlllIIlIllIIIIII, llllllllllllIllIIlllIIlIllIIIllI);
        final byte[] llllllllllllIllIIlllIIlIllIIIIll = llllllllllllIllIIlllIIlIllIIIlII.getBiomeArray();
        int llllllllllllIllIIlllIIlIllIIIIlI = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIllIIIIlI, llllllllllllIllIIlllIIlIllIIIIll.length)) {
            llllllllllllIllIIlllIIlIllIIIIll[llllllllllllIllIIlllIIlIllIIIIlI] = (byte)this.biomesForGeneration[llllllllllllIllIIlllIIlIllIIIIlI].biomeID;
            ++llllllllllllIllIIlllIIlIllIIIIlI;
        }
        llllllllllllIllIIlllIIlIllIIIlII.generateSkylightMap();
        return llllllllllllIllIIlllIIlIllIIIlII;
    }
    
    private static int lIIlIlllIllIlllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int lIIlIlllIllIlIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public List<BiomeGenBase.SpawnListEntry> getPossibleCreatures(final EnumCreatureType llllllllllllIllIIlllIIlIIIIIlIIl, final BlockPos llllllllllllIllIIlllIIlIIIIIIlII) {
        final BiomeGenBase llllllllllllIllIIlllIIlIIIIIIlll = this.worldObj.getBiomeGenForCoords(llllllllllllIllIIlllIIlIIIIIIlII);
        if (lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            if (lIIlIlllIllIllll(llllllllllllIllIIlllIIlIIIIIlIIl, EnumCreatureType.MONSTER) && lIIlIlllIllIIlll(this.scatteredFeatureGenerator.func_175798_a(llllllllllllIllIIlllIIlIIIIIIlII) ? 1 : 0)) {
                return this.scatteredFeatureGenerator.getScatteredFeatureSpawnList();
            }
            if (lIIlIlllIllIllll(llllllllllllIllIIlllIIlIIIIIlIIl, EnumCreatureType.MONSTER) && lIIlIlllIllIIlll(this.settings.useMonuments ? 1 : 0) && lIIlIlllIllIIlll(this.oceanMonumentGenerator.func_175796_a(this.worldObj, llllllllllllIllIIlllIIlIIIIIIlII) ? 1 : 0)) {
                return this.oceanMonumentGenerator.func_175799_b();
            }
        }
        return llllllllllllIllIIlllIIlIIIIIIlll.getSpawnableList(llllllllllllIllIIlllIIlIIIIIlIIl);
    }
    
    public ChunkProviderGenerate(final World llllllllllllIllIIlllIlIlIIllIlll, final long llllllllllllIllIIlllIlIlIIlIlllI, final boolean llllllllllllIllIIlllIlIlIIlIllIl, final String llllllllllllIllIIlllIlIlIIllIlII) {
        this.field_177476_s = Blocks.water;
        this.stoneNoise = new double[ChunkProviderGenerate.llIllIlIIIIIIl[0]];
        this.caveGenerator = new MapGenCaves();
        this.strongholdGenerator = new MapGenStronghold();
        this.villageGenerator = new MapGenVillage();
        this.mineshaftGenerator = new MapGenMineshaft();
        this.scatteredFeatureGenerator = new MapGenScatteredFeature();
        this.ravineGenerator = new MapGenRavine();
        this.oceanMonumentGenerator = new StructureOceanMonument();
        this.worldObj = llllllllllllIllIIlllIlIlIIllIlll;
        this.mapFeaturesEnabled = llllllllllllIllIIlllIlIlIIlIllIl;
        this.field_177475_o = llllllllllllIllIIlllIlIlIIllIlll.getWorldInfo().getTerrainType();
        this.rand = new Random(llllllllllllIllIIlllIlIlIIlIlllI);
        this.field_147431_j = new NoiseGeneratorOctaves(this.rand, ChunkProviderGenerate.llIllIlIIIIIIl[1]);
        this.field_147432_k = new NoiseGeneratorOctaves(this.rand, ChunkProviderGenerate.llIllIlIIIIIIl[1]);
        this.field_147429_l = new NoiseGeneratorOctaves(this.rand, ChunkProviderGenerate.llIllIlIIIIIIl[2]);
        this.field_147430_m = new NoiseGeneratorPerlin(this.rand, ChunkProviderGenerate.llIllIlIIIIIIl[3]);
        this.noiseGen5 = new NoiseGeneratorOctaves(this.rand, ChunkProviderGenerate.llIllIlIIIIIIl[4]);
        this.noiseGen6 = new NoiseGeneratorOctaves(this.rand, ChunkProviderGenerate.llIllIlIIIIIIl[1]);
        this.mobSpawnerNoise = new NoiseGeneratorOctaves(this.rand, ChunkProviderGenerate.llIllIlIIIIIIl[2]);
        this.field_147434_q = new double[ChunkProviderGenerate.llIllIlIIIIIIl[5]];
        this.parabolicField = new float[ChunkProviderGenerate.llIllIlIIIIIIl[6]];
        int llllllllllllIllIIlllIlIlIIllIIll = ChunkProviderGenerate.llIllIlIIIIIIl[7];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!lIIlIlllIllIIlIl(llllllllllllIllIIlllIlIlIIllIIll, ChunkProviderGenerate.llIllIlIIIIIIl[8])) {
            int llllllllllllIllIIlllIlIlIIllIIlI = ChunkProviderGenerate.llIllIlIIIIIIl[7];
            "".length();
            if (((20 + 163 - 106 + 149 ^ 38 + 69 - 59 + 142) & (0x6C ^ 0x35 ^ (0x12 ^ 0x17) ^ -" ".length())) != 0x0) {
                throw null;
            }
            while (!lIIlIlllIllIIlIl(llllllllllllIllIIlllIlIlIIllIIlI, ChunkProviderGenerate.llIllIlIIIIIIl[8])) {
                final float llllllllllllIllIIlllIlIlIIllIIIl = 10.0f / MathHelper.sqrt_float(llllllllllllIllIIlllIlIlIIllIIll * llllllllllllIllIIlllIlIlIIllIIll + llllllllllllIllIIlllIlIlIIllIIlI * llllllllllllIllIIlllIlIlIIllIIlI + 0.2f);
                this.parabolicField[llllllllllllIllIIlllIlIlIIllIIll + ChunkProviderGenerate.llIllIlIIIIIIl[8] + (llllllllllllIllIIlllIlIlIIllIIlI + ChunkProviderGenerate.llIllIlIIIIIIl[8]) * ChunkProviderGenerate.llIllIlIIIIIIl[9]] = llllllllllllIllIIlllIlIlIIllIIIl;
                ++llllllllllllIllIIlllIlIlIIllIIlI;
            }
            ++llllllllllllIllIIlllIlIlIIllIIll;
        }
        if (lIIlIlllIllIIllI(llllllllllllIllIIlllIlIlIIllIlII)) {
            this.settings = ChunkProviderSettings.Factory.jsonToFactory(llllllllllllIllIIlllIlIlIIllIlII).func_177864_b();
            BlockStaticLiquid field_177476_s;
            if (lIIlIlllIllIIlll(this.settings.useLavaOceans ? 1 : 0)) {
                field_177476_s = Blocks.lava;
                "".length();
                if ("  ".length() != "  ".length()) {
                    throw null;
                }
            }
            else {
                field_177476_s = Blocks.water;
            }
            this.field_177476_s = field_177476_s;
            llllllllllllIllIIlllIlIlIIllIlll.func_181544_b(this.settings.seaLevel);
        }
    }
    
    @Override
    public boolean func_177460_a(final IChunkProvider llllllllllllIllIIlllIIlIIIIlllll, final Chunk llllllllllllIllIIlllIIlIIIIllIIl, final int llllllllllllIllIIlllIIlIIIIllIII, final int llllllllllllIllIIlllIIlIIIIlIlll) {
        boolean llllllllllllIllIIlllIIlIIIIllIll = ChunkProviderGenerate.llIllIlIIIIIIl[10] != 0;
        if (lIIlIlllIllIIlll(this.settings.useMonuments ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0) && lIIlIlllIlllIIII(lIIlIlllIlllIIll(llllllllllllIllIIlllIIlIIIIllIIl.getInhabitedTime(), 3600L))) {
            llllllllllllIllIIlllIIlIIIIllIll |= this.oceanMonumentGenerator.generateStructure(this.worldObj, this.rand, new ChunkCoordIntPair(llllllllllllIllIIlllIIlIIIIllIII, llllllllllllIllIIlllIIlIIIIlIlll));
        }
        return llllllllllllIllIIlllIIlIIIIllIll;
    }
    
    @Override
    public void saveExtraData() {
    }
    
    private static boolean lIIlIlllIllIlIll(final int llllllllllllIllIIlllIIIllIlllllI, final int llllllllllllIllIIlllIIIllIllllIl) {
        return llllllllllllIllIIlllIIIllIlllllI >= llllllllllllIllIIlllIIIllIllllIl;
    }
    
    private static void lIIlIlllIllIIIll() {
        (llIllIlIIIIIII = new String[ChunkProviderGenerate.llIllIlIIIIIIl[8]])[ChunkProviderGenerate.llIllIlIIIIIIl[10]] = lIIlIlllIllIIIIl("Gqr5HPEBNRdE5opqCwtsK3t4/TZFpzpM", "NfIAL");
        ChunkProviderGenerate.llIllIlIIIIIII[ChunkProviderGenerate.llIllIlIIIIIIl[11]] = lIIlIlllIllIIIlI("Pj0AKCgKIR0rIg==", "mIrGF");
    }
    
    public void replaceBlocksForBiome(final int llllllllllllIllIIlllIIlIllIlIlll, final int llllllllllllIllIIlllIIlIllIlllll, final ChunkPrimer llllllllllllIllIIlllIIlIllIlIlIl, final BiomeGenBase[] llllllllllllIllIIlllIIlIllIlIlII) {
        final double llllllllllllIllIIlllIIlIllIlllII = 0.03125;
        this.stoneNoise = this.field_147430_m.func_151599_a(this.stoneNoise, llllllllllllIllIIlllIIlIllIlIlll * ChunkProviderGenerate.llIllIlIIIIIIl[1], llllllllllllIllIIlllIIlIllIlllll * ChunkProviderGenerate.llIllIlIIIIIIl[1], ChunkProviderGenerate.llIllIlIIIIIIl[1], ChunkProviderGenerate.llIllIlIIIIIIl[1], llllllllllllIllIIlllIIlIllIlllII * 2.0, llllllllllllIllIIlllIIlIllIlllII * 2.0, 1.0);
        int llllllllllllIllIIlllIIlIllIllIll = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIllIllIll, ChunkProviderGenerate.llIllIlIIIIIIl[1])) {
            int llllllllllllIllIIlllIIlIllIllIlI = ChunkProviderGenerate.llIllIlIIIIIIl[10];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIllIllIlI, ChunkProviderGenerate.llIllIlIIIIIIl[1])) {
                final BiomeGenBase llllllllllllIllIIlllIIlIllIllIIl = llllllllllllIllIIlllIIlIllIlIlII[llllllllllllIllIIlllIIlIllIllIlI + llllllllllllIllIIlllIIlIllIllIll * ChunkProviderGenerate.llIllIlIIIIIIl[1]];
                llllllllllllIllIIlllIIlIllIllIIl.genTerrainBlocks(this.worldObj, this.rand, llllllllllllIllIIlllIIlIllIlIlIl, llllllllllllIllIIlllIIlIllIlIlll * ChunkProviderGenerate.llIllIlIIIIIIl[1] + llllllllllllIllIIlllIIlIllIllIll, llllllllllllIllIIlllIIlIllIlllll * ChunkProviderGenerate.llIllIlIIIIIIl[1] + llllllllllllIllIIlllIIlIllIllIlI, this.stoneNoise[llllllllllllIllIIlllIIlIllIllIlI + llllllllllllIllIIlllIIlIllIllIll * ChunkProviderGenerate.llIllIlIIIIIIl[1]]);
                ++llllllllllllIllIIlllIIlIllIllIlI;
            }
            ++llllllllllllIllIIlllIIlIllIllIll;
        }
    }
    
    @Override
    public boolean canSave() {
        return ChunkProviderGenerate.llIllIlIIIIIIl[11] != 0;
    }
    
    private static boolean lIIlIlllIllIlIIl(final int llllllllllllIllIIlllIIIllIlIIIll) {
        return llllllllllllIllIIlllIIIllIlIIIll > 0;
    }
    
    @Override
    public boolean chunkExists(final int llllllllllllIllIIlllIIlIIlIlllll, final int llllllllllllIllIIlllIIlIIlIllllI) {
        return ChunkProviderGenerate.llIllIlIIIIIIl[11] != 0;
    }
    
    private static boolean lIIlIlllIllIIlIl(final int llllllllllllIllIIlllIIIllIllIllI, final int llllllllllllIllIIlllIIIllIllIlIl) {
        return llllllllllllIllIIlllIIIllIllIllI > llllllllllllIllIIlllIIIllIllIlIl;
    }
    
    private static boolean lIIlIlllIllIllll(final Object llllllllllllIllIIlllIIIllIlIllII, final Object llllllllllllIllIIlllIIIllIlIlIll) {
        return llllllllllllIllIIlllIIIllIlIllII == llllllllllllIllIIlllIIIllIlIlIll;
    }
    
    private static int lIIlIlllIllIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void recreateStructures(final Chunk llllllllllllIllIIlllIIIlllllIIIl, final int llllllllllllIllIIlllIIIllllIllIl, final int llllllllllllIllIIlllIIIllllIllII) {
        if (lIIlIlllIllIIlll(this.settings.useMineShafts ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.mineshaftGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIIllllIllIl, llllllllllllIllIIlllIIIllllIllII, null);
        }
        if (lIIlIlllIllIIlll(this.settings.useVillages ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.villageGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIIllllIllIl, llllllllllllIllIIlllIIIllllIllII, null);
        }
        if (lIIlIlllIllIIlll(this.settings.useStrongholds ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.strongholdGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIIllllIllIl, llllllllllllIllIIlllIIIllllIllII, null);
        }
        if (lIIlIlllIllIIlll(this.settings.useTemples ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.scatteredFeatureGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIIllllIllIl, llllllllllllIllIIlllIIIllllIllII, null);
        }
        if (lIIlIlllIllIIlll(this.settings.useMonuments ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.oceanMonumentGenerator.generate(this, this.worldObj, llllllllllllIllIIlllIIIllllIllIl, llllllllllllIllIIlllIIIllllIllII, null);
        }
    }
    
    private static void lIIlIlllIllIIlII() {
        (llIllIlIIIIIIl = new int[16])[0] = (-(0xFFFFF7ED & 0x3E9F) & (0xFFFFFF8E & 0x37FD));
        ChunkProviderGenerate.llIllIlIIIIIIl[1] = (0x68 ^ 0x5 ^ (0xF9 ^ 0x84));
        ChunkProviderGenerate.llIllIlIIIIIIl[2] = (0x6F ^ 0x67);
        ChunkProviderGenerate.llIllIlIIIIIIl[3] = (0x98 ^ 0x9C);
        ChunkProviderGenerate.llIllIlIIIIIIl[4] = (104 + 34 + 12 + 8 ^ 114 + 57 - 162 + 139);
        ChunkProviderGenerate.llIllIlIIIIIIl[5] = (0xFFFF8739 & 0x7BFF);
        ChunkProviderGenerate.llIllIlIIIIIIl[6] = (73 + 123 - 130 + 87 ^ 99 + 110 - 107 + 26);
        ChunkProviderGenerate.llIllIlIIIIIIl[7] = -"  ".length();
        ChunkProviderGenerate.llIllIlIIIIIIl[8] = "  ".length();
        ChunkProviderGenerate.llIllIlIIIIIIl[9] = (135 + 74 - 60 + 35 ^ 96 + 98 - 29 + 24);
        ChunkProviderGenerate.llIllIlIIIIIIl[10] = ((0x5 ^ 0x53) & ~(0x1F ^ 0x49));
        ChunkProviderGenerate.llIllIlIIIIIIl[11] = " ".length();
        ChunkProviderGenerate.llIllIlIIIIIIl[12] = (0xD8 ^ 0x93 ^ (0xE6 ^ 0x8C));
        ChunkProviderGenerate.llIllIlIIIIIIl[13] = (0x6E ^ 0x1D ^ (0xF0 ^ 0xA3));
        ChunkProviderGenerate.llIllIlIIIIIIl[14] = (0x82 ^ 0x9F);
        ChunkProviderGenerate.llIllIlIIIIIIl[15] = 178 + 96 - 193 + 167;
    }
    
    @Override
    public Chunk provideChunk(final BlockPos llllllllllllIllIIlllIIIllllIlIII) {
        return this.provideChunk(llllllllllllIllIIlllIIIllllIlIII.getX() >> ChunkProviderGenerate.llIllIlIIIIIIl[3], llllllllllllIllIIlllIIIllllIlIII.getZ() >> ChunkProviderGenerate.llIllIlIIIIIIl[3]);
    }
    
    @Override
    public boolean saveChunks(final boolean llllllllllllIllIIlllIIlIIIIlIlII, final IProgressUpdate llllllllllllIllIIlllIIlIIIIlIIll) {
        return ChunkProviderGenerate.llIllIlIIIIIIl[11] != 0;
    }
    
    private static int lIIlIlllIlllIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIIlIlllIlllIIII(final int llllllllllllIllIIlllIIIllIlIIlIl) {
        return llllllllllllIllIIlllIIIllIlIIlIl < 0;
    }
    
    @Override
    public int getLoadedChunkCount() {
        return ChunkProviderGenerate.llIllIlIIIIIIl[10];
    }
    
    private static boolean lIIlIlllIlllIIlI(final int llllllllllllIllIIlllIIIllIlIIlll) {
        return llllllllllllIllIIlllIIIllIlIIlll == 0;
    }
    
    private static boolean lIIlIlllIllIlIlI(final int llllllllllllIllIIlllIIIllIlllIlI, final int llllllllllllIllIIlllIIIllIlllIIl) {
        return llllllllllllIllIIlllIIIllIlllIlI < llllllllllllIllIIlllIIIllIlllIIl;
    }
    
    @Override
    public void populate(final IChunkProvider llllllllllllIllIIlllIIlIIlIIllIl, final int llllllllllllIllIIlllIIlIIIllIIll, final int llllllllllllIllIIlllIIlIIlIIlIll) {
        BlockFalling.fallInstantly = (ChunkProviderGenerate.llIllIlIIIIIIl[11] != 0);
        final int llllllllllllIllIIlllIIlIIlIIlIlI = llllllllllllIllIIlllIIlIIIllIIll * ChunkProviderGenerate.llIllIlIIIIIIl[1];
        final int llllllllllllIllIIlllIIlIIlIIlIIl = llllllllllllIllIIlllIIlIIlIIlIll * ChunkProviderGenerate.llIllIlIIIIIIl[1];
        BlockPos llllllllllllIllIIlllIIlIIlIIlIII = new BlockPos(llllllllllllIllIIlllIIlIIlIIlIlI, ChunkProviderGenerate.llIllIlIIIIIIl[10], llllllllllllIllIIlllIIlIIlIIlIIl);
        final BiomeGenBase llllllllllllIllIIlllIIlIIlIIIlll = this.worldObj.getBiomeGenForCoords(llllllllllllIllIIlllIIlIIlIIlIII.add(ChunkProviderGenerate.llIllIlIIIIIIl[1], ChunkProviderGenerate.llIllIlIIIIIIl[10], ChunkProviderGenerate.llIllIlIIIIIIl[1]));
        this.rand.setSeed(this.worldObj.getSeed());
        final long llllllllllllIllIIlllIIlIIlIIIllI = this.rand.nextLong() / 2L * 2L + 1L;
        final long llllllllllllIllIIlllIIlIIlIIIlIl = this.rand.nextLong() / 2L * 2L + 1L;
        this.rand.setSeed(llllllllllllIllIIlllIIlIIIllIIll * llllllllllllIllIIlllIIlIIlIIIllI + llllllllllllIllIIlllIIlIIlIIlIll * llllllllllllIllIIlllIIlIIlIIIlIl ^ this.worldObj.getSeed());
        boolean llllllllllllIllIIlllIIlIIlIIIlII = ChunkProviderGenerate.llIllIlIIIIIIl[10] != 0;
        final ChunkCoordIntPair llllllllllllIllIIlllIIlIIlIIIIll = new ChunkCoordIntPair(llllllllllllIllIIlllIIlIIIllIIll, llllllllllllIllIIlllIIlIIlIIlIll);
        if (lIIlIlllIllIIlll(this.settings.useMineShafts ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.mineshaftGenerator.generateStructure(this.worldObj, this.rand, llllllllllllIllIIlllIIlIIlIIIIll);
            "".length();
        }
        if (lIIlIlllIllIIlll(this.settings.useVillages ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            llllllllllllIllIIlllIIlIIlIIIlII = this.villageGenerator.generateStructure(this.worldObj, this.rand, llllllllllllIllIIlllIIlIIlIIIIll);
        }
        if (lIIlIlllIllIIlll(this.settings.useStrongholds ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.strongholdGenerator.generateStructure(this.worldObj, this.rand, llllllllllllIllIIlllIIlIIlIIIIll);
            "".length();
        }
        if (lIIlIlllIllIIlll(this.settings.useTemples ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.scatteredFeatureGenerator.generateStructure(this.worldObj, this.rand, llllllllllllIllIIlllIIlIIlIIIIll);
            "".length();
        }
        if (lIIlIlllIllIIlll(this.settings.useMonuments ? 1 : 0) && lIIlIlllIllIIlll(this.mapFeaturesEnabled ? 1 : 0)) {
            this.oceanMonumentGenerator.generateStructure(this.worldObj, this.rand, llllllllllllIllIIlllIIlIIlIIIIll);
            "".length();
        }
        if (lIIlIlllIlllIIIl(llllllllllllIllIIlllIIlIIlIIIlll, BiomeGenBase.desert) && lIIlIlllIlllIIIl(llllllllllllIllIIlllIIlIIlIIIlll, BiomeGenBase.desertHills) && lIIlIlllIllIIlll(this.settings.useWaterLakes ? 1 : 0) && lIIlIlllIlllIIlI(llllllllllllIllIIlllIIlIIlIIIlII ? 1 : 0) && lIIlIlllIlllIIlI(this.rand.nextInt(this.settings.waterLakeChance))) {
            final int llllllllllllIllIIlllIIlIIlIIIIlI = this.rand.nextInt(ChunkProviderGenerate.llIllIlIIIIIIl[1]) + ChunkProviderGenerate.llIllIlIIIIIIl[2];
            final int llllllllllllIllIIlllIIlIIlIIIIIl = this.rand.nextInt(ChunkProviderGenerate.llIllIlIIIIIIl[0]);
            final int llllllllllllIllIIlllIIlIIlIIIIII = this.rand.nextInt(ChunkProviderGenerate.llIllIlIIIIIIl[1]) + ChunkProviderGenerate.llIllIlIIIIIIl[2];
            new WorldGenLakes(Blocks.water).generate(this.worldObj, this.rand, llllllllllllIllIIlllIIlIIlIIlIII.add(llllllllllllIllIIlllIIlIIlIIIIlI, llllllllllllIllIIlllIIlIIlIIIIIl, llllllllllllIllIIlllIIlIIlIIIIII));
            "".length();
        }
        if (lIIlIlllIlllIIlI(llllllllllllIllIIlllIIlIIlIIIlII ? 1 : 0) && lIIlIlllIlllIIlI(this.rand.nextInt(this.settings.lavaLakeChance / ChunkProviderGenerate.llIllIlIIIIIIl[4])) && lIIlIlllIllIIlll(this.settings.useLavaLakes ? 1 : 0)) {
            final int llllllllllllIllIIlllIIlIIIllllll = this.rand.nextInt(ChunkProviderGenerate.llIllIlIIIIIIl[1]) + ChunkProviderGenerate.llIllIlIIIIIIl[2];
            final int llllllllllllIllIIlllIIlIIIlllllI = this.rand.nextInt(this.rand.nextInt(ChunkProviderGenerate.llIllIlIIIIIIl[15]) + ChunkProviderGenerate.llIllIlIIIIIIl[2]);
            final int llllllllllllIllIIlllIIlIIIllllIl = this.rand.nextInt(ChunkProviderGenerate.llIllIlIIIIIIl[1]) + ChunkProviderGenerate.llIllIlIIIIIIl[2];
            if (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIIIlllllI, this.worldObj.func_181545_F()) || lIIlIlllIlllIIlI(this.rand.nextInt(this.settings.lavaLakeChance / ChunkProviderGenerate.llIllIlIIIIIIl[2]))) {
                new WorldGenLakes(Blocks.lava).generate(this.worldObj, this.rand, llllllllllllIllIIlllIIlIIlIIlIII.add(llllllllllllIllIIlllIIlIIIllllll, llllllllllllIllIIlllIIlIIIlllllI, llllllllllllIllIIlllIIlIIIllllIl));
                "".length();
            }
        }
        if (lIIlIlllIllIIlll(this.settings.useDungeons ? 1 : 0)) {
            int llllllllllllIllIIlllIIlIIIllllII = ChunkProviderGenerate.llIllIlIIIIIIl[10];
            "".length();
            if (((145 + 112 - 138 + 27 ^ 11 + 132 - 71 + 118) & (0x56 ^ 0x26 ^ (0x5 ^ 0x59) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIIIllllII, this.settings.dungeonChance)) {
                final int llllllllllllIllIIlllIIlIIIlllIll = this.rand.nextInt(ChunkProviderGenerate.llIllIlIIIIIIl[1]) + ChunkProviderGenerate.llIllIlIIIIIIl[2];
                final int llllllllllllIllIIlllIIlIIIlllIlI = this.rand.nextInt(ChunkProviderGenerate.llIllIlIIIIIIl[0]);
                final int llllllllllllIllIIlllIIlIIIlllIIl = this.rand.nextInt(ChunkProviderGenerate.llIllIlIIIIIIl[1]) + ChunkProviderGenerate.llIllIlIIIIIIl[2];
                new WorldGenDungeons().generate(this.worldObj, this.rand, llllllllllllIllIIlllIIlIIlIIlIII.add(llllllllllllIllIIlllIIlIIIlllIll, llllllllllllIllIIlllIIlIIIlllIlI, llllllllllllIllIIlllIIlIIIlllIIl));
                "".length();
                ++llllllllllllIllIIlllIIlIIIllllII;
            }
        }
        llllllllllllIllIIlllIIlIIlIIIlll.decorate(this.worldObj, this.rand, new BlockPos(llllllllllllIllIIlllIIlIIlIIlIlI, ChunkProviderGenerate.llIllIlIIIIIIl[10], llllllllllllIllIIlllIIlIIlIIlIIl));
        SpawnerAnimals.performWorldGenSpawning(this.worldObj, llllllllllllIllIIlllIIlIIlIIIlll, llllllllllllIllIIlllIIlIIlIIlIlI + ChunkProviderGenerate.llIllIlIIIIIIl[2], llllllllllllIllIIlllIIlIIlIIlIIl + ChunkProviderGenerate.llIllIlIIIIIIl[2], ChunkProviderGenerate.llIllIlIIIIIIl[1], ChunkProviderGenerate.llIllIlIIIIIIl[1], this.rand);
        llllllllllllIllIIlllIIlIIlIIlIII = llllllllllllIllIIlllIIlIIlIIlIII.add(ChunkProviderGenerate.llIllIlIIIIIIl[2], ChunkProviderGenerate.llIllIlIIIIIIl[10], ChunkProviderGenerate.llIllIlIIIIIIl[2]);
        int llllllllllllIllIIlllIIlIIIlllIII = ChunkProviderGenerate.llIllIlIIIIIIl[10];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIIIlllIII, ChunkProviderGenerate.llIllIlIIIIIIl[1])) {
            int llllllllllllIllIIlllIIlIIIllIlll = ChunkProviderGenerate.llIllIlIIIIIIl[10];
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!lIIlIlllIllIlIll(llllllllllllIllIIlllIIlIIIllIlll, ChunkProviderGenerate.llIllIlIIIIIIl[1])) {
                final BlockPos llllllllllllIllIIlllIIlIIIllIllI = this.worldObj.getPrecipitationHeight(llllllllllllIllIIlllIIlIIlIIlIII.add(llllllllllllIllIIlllIIlIIIlllIII, ChunkProviderGenerate.llIllIlIIIIIIl[10], llllllllllllIllIIlllIIlIIIllIlll));
                final BlockPos llllllllllllIllIIlllIIlIIIllIlIl = llllllllllllIllIIlllIIlIIIllIllI.down();
                if (lIIlIlllIllIIlll(this.worldObj.canBlockFreezeWater(llllllllllllIllIIlllIIlIIIllIlIl) ? 1 : 0)) {
                    this.worldObj.setBlockState(llllllllllllIllIIlllIIlIIIllIlIl, Blocks.ice.getDefaultState(), ChunkProviderGenerate.llIllIlIIIIIIl[8]);
                    "".length();
                }
                if (lIIlIlllIllIIlll(this.worldObj.canSnowAt(llllllllllllIllIIlllIIlIIIllIllI, (boolean)(ChunkProviderGenerate.llIllIlIIIIIIl[11] != 0)) ? 1 : 0)) {
                    this.worldObj.setBlockState(llllllllllllIllIIlllIIlIIIllIllI, Blocks.snow_layer.getDefaultState(), ChunkProviderGenerate.llIllIlIIIIIIl[8]);
                    "".length();
                }
                ++llllllllllllIllIIlllIIlIIIllIlll;
            }
            ++llllllllllllIllIIlllIIlIIIlllIII;
        }
        BlockFalling.fallInstantly = (ChunkProviderGenerate.llIllIlIIIIIIl[10] != 0);
    }
    
    @Override
    public BlockPos getStrongholdGen(final World llllllllllllIllIIlllIIIlllllllIl, final String llllllllllllIllIIlllIIIllllllIII, final BlockPos llllllllllllIllIIlllIIIllllllIll) {
        BlockPos closestStrongholdPos;
        if (lIIlIlllIllIIlll(ChunkProviderGenerate.llIllIlIIIIIII[ChunkProviderGenerate.llIllIlIIIIIIl[11]].equals(llllllllllllIllIIlllIIIllllllIII) ? 1 : 0) && lIIlIlllIllIIllI(this.strongholdGenerator)) {
            closestStrongholdPos = this.strongholdGenerator.getClosestStrongholdPos(llllllllllllIllIIlllIIIlllllllIl, llllllllllllIllIIlllIIIllllllIll);
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else {
            closestStrongholdPos = null;
        }
        return closestStrongholdPos;
    }
    
    private static boolean lIIlIlllIlllIIIl(final Object llllllllllllIllIIlllIIIllIllIIlI, final Object llllllllllllIllIIlllIIIllIllIIIl) {
        return llllllllllllIllIIlllIIIllIllIIlI != llllllllllllIllIIlllIIIllIllIIIl;
    }
    
    private static boolean lIIlIlllIllIIlll(final int llllllllllllIllIIlllIIIllIlIlIIl) {
        return llllllllllllIllIIlllIIIllIlIlIIl != 0;
    }
}
