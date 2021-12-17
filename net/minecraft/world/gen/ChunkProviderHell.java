// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import net.minecraft.world.biome.BiomeGenBase;
import java.util.List;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.block.material.Material;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.util.BlockPos;
import net.minecraft.block.BlockFalling;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.block.Block;
import com.google.common.base.Predicate;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.feature.WorldGenGlowStone1;
import net.minecraft.world.gen.feature.WorldGenGlowStone2;
import net.minecraft.world.gen.feature.WorldGenHellLava;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.feature.WorldGenFire;
import java.util.Random;
import net.minecraft.world.gen.structure.MapGenNetherBridge;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderHell implements IChunkProvider
{
    private final /* synthetic */ NoiseGeneratorOctaves netherrackExculsivityNoiseGen;
    private final /* synthetic */ World worldObj;
    public final /* synthetic */ NoiseGeneratorOctaves netherNoiseGen6;
    private final /* synthetic */ GeneratorBushFeature field_177465_A;
    /* synthetic */ double[] noiseData5;
    private final /* synthetic */ MapGenNetherBridge genNetherBridge;
    private static final /* synthetic */ String[] llIlIIIIIIIlII;
    private final /* synthetic */ MapGenBase netherCaveGenerator;
    private /* synthetic */ double[] netherrackExclusivityNoise;
    private final /* synthetic */ Random hellRNG;
    private static final /* synthetic */ int[] llIlIIIIIIIlIl;
    private final /* synthetic */ GeneratorBushFeature field_177471_z;
    private final /* synthetic */ NoiseGeneratorOctaves slowsandGravelNoiseGen;
    private final /* synthetic */ NoiseGeneratorOctaves netherNoiseGen2;
    /* synthetic */ double[] noiseData3;
    private final /* synthetic */ boolean field_177466_i;
    private final /* synthetic */ NoiseGeneratorOctaves netherNoiseGen3;
    public final /* synthetic */ NoiseGeneratorOctaves netherNoiseGen7;
    private final /* synthetic */ WorldGenFire field_177470_t;
    private final /* synthetic */ WorldGenerator field_177467_w;
    private final /* synthetic */ WorldGenHellLava field_177472_y;
    private final /* synthetic */ NoiseGeneratorOctaves netherNoiseGen1;
    private final /* synthetic */ WorldGenGlowStone2 field_177468_v;
    /* synthetic */ double[] noiseData1;
    private final /* synthetic */ WorldGenGlowStone1 field_177469_u;
    /* synthetic */ double[] noiseData4;
    private /* synthetic */ double[] gravelNoise;
    private final /* synthetic */ WorldGenHellLava field_177473_x;
    /* synthetic */ double[] noiseData2;
    private /* synthetic */ double[] noiseField;
    private /* synthetic */ double[] slowsandNoise;
    
    private static boolean lIIlIIIIllllIllI(final Object llllllllllllIllIllIlllllIllIIlIl) {
        return llllllllllllIllIllIlllllIllIIlIl != null;
    }
    
    @Override
    public boolean func_177460_a(final IChunkProvider llllllllllllIllIllIllllllIllIlll, final Chunk llllllllllllIllIllIllllllIllIllI, final int llllllllllllIllIllIllllllIllIlIl, final int llllllllllllIllIllIllllllIllIlII) {
        return ChunkProviderHell.llIlIIIIIIIlIl[3] != 0;
    }
    
    @Override
    public int getLoadedChunkCount() {
        return ChunkProviderHell.llIlIIIIIIIlIl[3];
    }
    
    private static boolean lIIlIIIIlllllIlI(final int llllllllllllIllIllIlllllIlIllIIl) {
        return llllllllllllIllIllIlllllIlIllIIl <= 0;
    }
    
    private static boolean lIIlIIIIlllllIll(final int llllllllllllIllIllIlllllIlllIIII, final int llllllllllllIllIllIlllllIllIllll) {
        return llllllllllllIllIllIlllllIlllIIII <= llllllllllllIllIllIlllllIllIllll;
    }
    
    @Override
    public boolean chunkExists(final int llllllllllllIllIllIlllllllIlIIlI, final int llllllllllllIllIllIlllllllIlIIIl) {
        return ChunkProviderHell.llIlIIIIIIIlIl[2] != 0;
    }
    
    @Override
    public boolean unloadQueuedChunks() {
        return ChunkProviderHell.llIlIIIIIIIlIl[3] != 0;
    }
    
    private static boolean lIIlIIIIlllllIII(final Object llllllllllllIllIllIlllllIllIIIlI, final Object llllllllllllIllIllIlllllIllIIIIl) {
        return llllllllllllIllIllIlllllIllIIIlI == llllllllllllIllIllIlllllIllIIIIl;
    }
    
    private double[] initializeNoiseField(double[] llllllllllllIllIllIllllllllIlIII, final int llllllllllllIllIlllIIIIIIIIIIIII, final int llllllllllllIllIllIllllllllIIllI, final int llllllllllllIllIllIllllllllllllI, final int llllllllllllIllIllIlllllllllllIl, final int llllllllllllIllIllIlllllllllllII, final int llllllllllllIllIllIllllllllllIll) {
        if (lIIlIIIlIIIIIIII(llllllllllllIllIllIllllllllIlIII)) {
            llllllllllllIllIllIllllllllIlIII = new double[llllllllllllIllIllIlllllllllllIl * llllllllllllIllIllIlllllllllllII * llllllllllllIllIllIllllllllllIll];
        }
        final double llllllllllllIllIllIllllllllllIlI = 684.412;
        final double llllllllllllIllIllIllllllllllIIl = 2053.236;
        this.noiseData4 = this.netherNoiseGen6.generateNoiseOctaves(this.noiseData4, llllllllllllIllIlllIIIIIIIIIIIII, llllllllllllIllIllIllllllllIIllI, llllllllllllIllIllIllllllllllllI, llllllllllllIllIllIlllllllllllIl, ChunkProviderHell.llIlIIIIIIIlIl[2], llllllllllllIllIllIllllllllllIll, 1.0, 0.0, 1.0);
        this.noiseData5 = this.netherNoiseGen7.generateNoiseOctaves(this.noiseData5, llllllllllllIllIlllIIIIIIIIIIIII, llllllllllllIllIllIllllllllIIllI, llllllllllllIllIllIllllllllllllI, llllllllllllIllIllIlllllllllllIl, ChunkProviderHell.llIlIIIIIIIlIl[2], llllllllllllIllIllIllllllllllIll, 100.0, 0.0, 100.0);
        this.noiseData1 = this.netherNoiseGen3.generateNoiseOctaves(this.noiseData1, llllllllllllIllIlllIIIIIIIIIIIII, llllllllllllIllIllIllllllllIIllI, llllllllllllIllIllIllllllllllllI, llllllllllllIllIllIlllllllllllIl, llllllllllllIllIllIlllllllllllII, llllllllllllIllIllIllllllllllIll, llllllllllllIllIllIllllllllllIlI / 80.0, llllllllllllIllIllIllllllllllIIl / 60.0, llllllllllllIllIllIllllllllllIlI / 80.0);
        this.noiseData2 = this.netherNoiseGen1.generateNoiseOctaves(this.noiseData2, llllllllllllIllIlllIIIIIIIIIIIII, llllllllllllIllIllIllllllllIIllI, llllllllllllIllIllIllllllllllllI, llllllllllllIllIllIlllllllllllIl, llllllllllllIllIllIlllllllllllII, llllllllllllIllIllIllllllllllIll, llllllllllllIllIllIllllllllllIlI, llllllllllllIllIllIllllllllllIIl, llllllllllllIllIllIllllllllllIlI);
        this.noiseData3 = this.netherNoiseGen2.generateNoiseOctaves(this.noiseData3, llllllllllllIllIlllIIIIIIIIIIIII, llllllllllllIllIllIllllllllIIllI, llllllllllllIllIllIllllllllllllI, llllllllllllIllIllIlllllllllllIl, llllllllllllIllIllIlllllllllllII, llllllllllllIllIllIllllllllllIll, llllllllllllIllIllIllllllllllIlI, llllllllllllIllIllIllllllllllIIl, llllllllllllIllIllIllllllllllIlI);
        int llllllllllllIllIllIllllllllllIII = ChunkProviderHell.llIlIIIIIIIlIl[3];
        final double[] llllllllllllIllIllIlllllllllIlll = new double[llllllllllllIllIllIlllllllllllII];
        int llllllllllllIllIllIlllllllllIllI = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if (((0x52 ^ 0x61 ^ (0xAF ^ 0xAA)) & (15 + 24 + 127 + 7 ^ 111 + 98 - 146 + 92 ^ -" ".length())) != ((0x3D ^ 0x23 ^ (0xCB ^ 0x98)) & (0xD1 ^ 0xA9 ^ (0x8D ^ 0xB8) ^ -" ".length()))) {
            return null;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIllIlllllllllIllI, llllllllllllIllIllIlllllllllllII)) {
            llllllllllllIllIllIlllllllllIlll[llllllllllllIllIllIlllllllllIllI] = Math.cos(llllllllllllIllIllIlllllllllIllI * 3.141592653589793 * 6.0 / llllllllllllIllIllIlllllllllllII) * 2.0;
            double llllllllllllIllIllIlllllllllIlIl = llllllllllllIllIllIlllllllllIllI;
            if (lIIlIIIIllllIlIl(llllllllllllIllIllIlllllllllIllI, llllllllllllIllIllIlllllllllllII / ChunkProviderHell.llIlIIIIIIIlIl[9])) {
                llllllllllllIllIllIlllllllllIlIl = llllllllllllIllIllIlllllllllllII - ChunkProviderHell.llIlIIIIIIIlIl[2] - llllllllllllIllIllIlllllllllIllI;
            }
            if (lIIlIIIIllllllIl(lIIlIIIIlllllllI(llllllllllllIllIllIlllllllllIlIl, 4.0))) {
                llllllllllllIllIllIlllllllllIlIl = 4.0 - llllllllllllIllIllIlllllllllIlIl;
                final double[] array = llllllllllllIllIllIlllllllllIlll;
                final int n = llllllllllllIllIllIlllllllllIllI;
                array[n] -= llllllllllllIllIllIlllllllllIlIl * llllllllllllIllIllIlllllllllIlIl * llllllllllllIllIllIlllllllllIlIl * 10.0;
            }
            ++llllllllllllIllIllIlllllllllIllI;
        }
        int llllllllllllIllIllIlllllllllIlII = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if (" ".length() >= "  ".length()) {
            return null;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIllIlllllllllIlII, llllllllllllIllIllIlllllllllllIl)) {
            int llllllllllllIllIllIlllllllllIIll = ChunkProviderHell.llIlIIIIIIIlIl[3];
            "".length();
            if (((0x6E ^ 0x7E ^ (0x3 ^ 0x2D)) & (135 + 136 - 234 + 104 ^ 88 + 29 + 31 + 31 ^ -" ".length())) != 0x0) {
                return null;
            }
            while (!lIIlIIIIllllIIll(llllllllllllIllIllIlllllllllIIll, llllllllllllIllIllIllllllllllIll)) {
                final double llllllllllllIllIllIlllllllllIIlI = 0.0;
                int llllllllllllIllIllIlllllllllIIIl = ChunkProviderHell.llIlIIIIIIIlIl[3];
                "".length();
                if ("   ".length() <= 0) {
                    return null;
                }
                while (!lIIlIIIIllllIIll(llllllllllllIllIllIlllllllllIIIl, llllllllllllIllIllIlllllllllllII)) {
                    double llllllllllllIllIllIlllllllllIIII = 0.0;
                    final double llllllllllllIllIllIllllllllIllll = llllllllllllIllIllIlllllllllIlll[llllllllllllIllIllIlllllllllIIIl];
                    final double llllllllllllIllIllIllllllllIlllI = this.noiseData2[llllllllllllIllIllIllllllllllIII] / 512.0;
                    final double llllllllllllIllIllIllllllllIllIl = this.noiseData3[llllllllllllIllIllIllllllllllIII] / 512.0;
                    final double llllllllllllIllIllIllllllllIllII = (this.noiseData1[llllllllllllIllIllIllllllllllIII] / 10.0 + 1.0) / 2.0;
                    if (lIIlIIIIllllllIl(lIIlIIIIlllllllI(llllllllllllIllIllIllllllllIllII, 0.0))) {
                        llllllllllllIllIllIlllllllllIIII = llllllllllllIllIllIllllllllIlllI;
                        "".length();
                        if (-"  ".length() >= 0) {
                            return null;
                        }
                    }
                    else if (lIIlIIIIllllIIlI(lIIlIIIIllllllll(llllllllllllIllIllIllllllllIllII, 1.0))) {
                        llllllllllllIllIllIlllllllllIIII = llllllllllllIllIllIllllllllIllIl;
                        "".length();
                        if ("   ".length() < "   ".length()) {
                            return null;
                        }
                    }
                    else {
                        llllllllllllIllIllIlllllllllIIII = llllllllllllIllIllIllllllllIlllI + (llllllllllllIllIllIllllllllIllIl - llllllllllllIllIllIllllllllIlllI) * llllllllllllIllIllIllllllllIllII;
                    }
                    llllllllllllIllIllIlllllllllIIII -= llllllllllllIllIllIllllllllIllll;
                    if (lIIlIIIIllllIlIl(llllllllllllIllIllIlllllllllIIIl, llllllllllllIllIllIlllllllllllII - ChunkProviderHell.llIlIIIIIIIlIl[6])) {
                        final double llllllllllllIllIllIllllllllIlIll = (llllllllllllIllIllIlllllllllIIIl - (llllllllllllIllIllIlllllllllllII - ChunkProviderHell.llIlIIIIIIIlIl[6])) / 3.0f;
                        llllllllllllIllIllIlllllllllIIII = llllllllllllIllIllIlllllllllIIII * (1.0 - llllllllllllIllIllIllllllllIlIll) + -10.0 * llllllllllllIllIllIllllllllIlIll;
                    }
                    if (lIIlIIIIllllllIl(lIIlIIIIlllllllI(llllllllllllIllIllIlllllllllIIIl, llllllllllllIllIllIlllllllllIIlI))) {
                        double llllllllllllIllIllIllllllllIlIlI = (llllllllllllIllIllIlllllllllIIlI - llllllllllllIllIllIlllllllllIIIl) / 4.0;
                        llllllllllllIllIllIllllllllIlIlI = MathHelper.clamp_double(llllllllllllIllIllIllllllllIlIlI, 0.0, 1.0);
                        llllllllllllIllIllIlllllllllIIII = llllllllllllIllIllIlllllllllIIII * (1.0 - llllllllllllIllIllIllllllllIlIlI) + -10.0 * llllllllllllIllIllIllllllllIlIlI;
                    }
                    llllllllllllIllIllIllllllllIlIII[llllllllllllIllIllIllllllllllIII] = llllllllllllIllIllIlllllllllIIII;
                    ++llllllllllllIllIllIllllllllllIII;
                    ++llllllllllllIllIllIlllllllllIIIl;
                }
                ++llllllllllllIllIllIlllllllllIIll;
            }
            ++llllllllllllIllIllIlllllllllIlII;
        }
        return llllllllllllIllIllIllllllllIlIII;
    }
    
    private static boolean lIIlIIIIllllIIIl(final int llllllllllllIllIllIlllllIlllIlII, final int llllllllllllIllIllIlllllIlllIIll) {
        return llllllllllllIllIllIlllllIlllIlII < llllllllllllIllIllIlllllIlllIIll;
    }
    
    private static boolean lIIlIIIIllllllII(final int llllllllllllIllIllIlllllIlIlllIl) {
        return llllllllllllIllIllIlllllIlIlllIl != 0;
    }
    
    private static int lIIlIIIIllllIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void saveExtraData() {
    }
    
    public void func_180515_a(final int llllllllllllIllIlllIIIIIlIIIIIll, final int llllllllllllIllIlllIIIIIlIIIIIlI, final ChunkPrimer llllllllllllIllIlllIIIIIlIIIIIIl) {
        final int llllllllllllIllIlllIIIIIlIlIIlII = ChunkProviderHell.llIlIIIIIIIlIl[6];
        final int llllllllllllIllIlllIIIIIlIlIIIll = this.worldObj.func_181545_F() / ChunkProviderHell.llIlIIIIIIIlIl[9] + ChunkProviderHell.llIlIIIIIIIlIl[2];
        final int llllllllllllIllIlllIIIIIlIlIIIlI = llllllllllllIllIlllIIIIIlIlIIlII + ChunkProviderHell.llIlIIIIIIIlIl[2];
        final int llllllllllllIllIlllIIIIIlIlIIIIl = ChunkProviderHell.llIlIIIIIIIlIl[10];
        final int llllllllllllIllIlllIIIIIlIlIIIII = llllllllllllIllIlllIIIIIlIlIIlII + ChunkProviderHell.llIlIIIIIIIlIl[2];
        this.noiseField = this.initializeNoiseField(this.noiseField, llllllllllllIllIlllIIIIIlIIIIIll * llllllllllllIllIlllIIIIIlIlIIlII, ChunkProviderHell.llIlIIIIIIIlIl[3], llllllllllllIllIlllIIIIIlIIIIIlI * llllllllllllIllIlllIIIIIlIlIIlII, llllllllllllIllIlllIIIIIlIlIIIlI, llllllllllllIllIlllIIIIIlIlIIIIl, llllllllllllIllIlllIIIIIlIlIIIII);
        int llllllllllllIllIlllIIIIIlIIlllll = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIlIIlllll, llllllllllllIllIlllIIIIIlIlIIlII)) {
            int llllllllllllIllIlllIIIIIlIIllllI = ChunkProviderHell.llIlIIIIIIIlIl[3];
            "".length();
            if (((0x8D ^ 0xBA) & ~(0x14 ^ 0x23)) != 0x0) {
                return;
            }
            while (!lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIlIIllllI, llllllllllllIllIlllIIIIIlIlIIlII)) {
                int llllllllllllIllIlllIIIIIlIIlllIl = ChunkProviderHell.llIlIIIIIIIlIl[3];
                "".length();
                if ((0x38 ^ 0x3C) <= "   ".length()) {
                    return;
                }
                while (!lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIlIIlllIl, ChunkProviderHell.llIlIIIIIIIlIl[4])) {
                    final double llllllllllllIllIlllIIIIIlIIlllII = 0.125;
                    double llllllllllllIllIlllIIIIIlIIllIll = this.noiseField[((llllllllllllIllIlllIIIIIlIIlllll + ChunkProviderHell.llIlIIIIIIIlIl[3]) * llllllllllllIllIlllIIIIIlIlIIIII + llllllllllllIllIlllIIIIIlIIllllI + ChunkProviderHell.llIlIIIIIIIlIl[3]) * llllllllllllIllIlllIIIIIlIlIIIIl + llllllllllllIllIlllIIIIIlIIlllIl + ChunkProviderHell.llIlIIIIIIIlIl[3]];
                    double llllllllllllIllIlllIIIIIlIIllIlI = this.noiseField[((llllllllllllIllIlllIIIIIlIIlllll + ChunkProviderHell.llIlIIIIIIIlIl[3]) * llllllllllllIllIlllIIIIIlIlIIIII + llllllllllllIllIlllIIIIIlIIllllI + ChunkProviderHell.llIlIIIIIIIlIl[2]) * llllllllllllIllIlllIIIIIlIlIIIIl + llllllllllllIllIlllIIIIIlIIlllIl + ChunkProviderHell.llIlIIIIIIIlIl[3]];
                    double llllllllllllIllIlllIIIIIlIIllIIl = this.noiseField[((llllllllllllIllIlllIIIIIlIIlllll + ChunkProviderHell.llIlIIIIIIIlIl[2]) * llllllllllllIllIlllIIIIIlIlIIIII + llllllllllllIllIlllIIIIIlIIllllI + ChunkProviderHell.llIlIIIIIIIlIl[3]) * llllllllllllIllIlllIIIIIlIlIIIIl + llllllllllllIllIlllIIIIIlIIlllIl + ChunkProviderHell.llIlIIIIIIIlIl[3]];
                    double llllllllllllIllIlllIIIIIlIIllIII = this.noiseField[((llllllllllllIllIlllIIIIIlIIlllll + ChunkProviderHell.llIlIIIIIIIlIl[2]) * llllllllllllIllIlllIIIIIlIlIIIII + llllllllllllIllIlllIIIIIlIIllllI + ChunkProviderHell.llIlIIIIIIIlIl[2]) * llllllllllllIllIlllIIIIIlIlIIIIl + llllllllllllIllIlllIIIIIlIIlllIl + ChunkProviderHell.llIlIIIIIIIlIl[3]];
                    final double llllllllllllIllIlllIIIIIlIIlIlll = (this.noiseField[((llllllllllllIllIlllIIIIIlIIlllll + ChunkProviderHell.llIlIIIIIIIlIl[3]) * llllllllllllIllIlllIIIIIlIlIIIII + llllllllllllIllIlllIIIIIlIIllllI + ChunkProviderHell.llIlIIIIIIIlIl[3]) * llllllllllllIllIlllIIIIIlIlIIIIl + llllllllllllIllIlllIIIIIlIIlllIl + ChunkProviderHell.llIlIIIIIIIlIl[2]] - llllllllllllIllIlllIIIIIlIIllIll) * llllllllllllIllIlllIIIIIlIIlllII;
                    final double llllllllllllIllIlllIIIIIlIIlIllI = (this.noiseField[((llllllllllllIllIlllIIIIIlIIlllll + ChunkProviderHell.llIlIIIIIIIlIl[3]) * llllllllllllIllIlllIIIIIlIlIIIII + llllllllllllIllIlllIIIIIlIIllllI + ChunkProviderHell.llIlIIIIIIIlIl[2]) * llllllllllllIllIlllIIIIIlIlIIIIl + llllllllllllIllIlllIIIIIlIIlllIl + ChunkProviderHell.llIlIIIIIIIlIl[2]] - llllllllllllIllIlllIIIIIlIIllIlI) * llllllllllllIllIlllIIIIIlIIlllII;
                    final double llllllllllllIllIlllIIIIIlIIlIlIl = (this.noiseField[((llllllllllllIllIlllIIIIIlIIlllll + ChunkProviderHell.llIlIIIIIIIlIl[2]) * llllllllllllIllIlllIIIIIlIlIIIII + llllllllllllIllIlllIIIIIlIIllllI + ChunkProviderHell.llIlIIIIIIIlIl[3]) * llllllllllllIllIlllIIIIIlIlIIIIl + llllllllllllIllIlllIIIIIlIIlllIl + ChunkProviderHell.llIlIIIIIIIlIl[2]] - llllllllllllIllIlllIIIIIlIIllIIl) * llllllllllllIllIlllIIIIIlIIlllII;
                    final double llllllllllllIllIlllIIIIIlIIlIlII = (this.noiseField[((llllllllllllIllIlllIIIIIlIIlllll + ChunkProviderHell.llIlIIIIIIIlIl[2]) * llllllllllllIllIlllIIIIIlIlIIIII + llllllllllllIllIlllIIIIIlIIllllI + ChunkProviderHell.llIlIIIIIIIlIl[2]) * llllllllllllIllIlllIIIIIlIlIIIIl + llllllllllllIllIlllIIIIIlIIlllIl + ChunkProviderHell.llIlIIIIIIIlIl[2]] - llllllllllllIllIlllIIIIIlIIllIII) * llllllllllllIllIlllIIIIIlIIlllII;
                    int llllllllllllIllIlllIIIIIlIIlIIll = ChunkProviderHell.llIlIIIIIIIlIl[3];
                    "".length();
                    if ("  ".length() == (0x4C ^ 0x48)) {
                        return;
                    }
                    while (!lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIlIIlIIll, ChunkProviderHell.llIlIIIIIIIlIl[5])) {
                        final double llllllllllllIllIlllIIIIIlIIlIIlI = 0.25;
                        double llllllllllllIllIlllIIIIIlIIlIIIl = llllllllllllIllIlllIIIIIlIIllIll;
                        double llllllllllllIllIlllIIIIIlIIlIIII = llllllllllllIllIlllIIIIIlIIllIlI;
                        final double llllllllllllIllIlllIIIIIlIIIllll = (llllllllllllIllIlllIIIIIlIIllIIl - llllllllllllIllIlllIIIIIlIIllIll) * llllllllllllIllIlllIIIIIlIIlIIlI;
                        final double llllllllllllIllIlllIIIIIlIIIlllI = (llllllllllllIllIlllIIIIIlIIllIII - llllllllllllIllIlllIIIIIlIIllIlI) * llllllllllllIllIlllIIIIIlIIlIIlI;
                        int llllllllllllIllIlllIIIIIlIIIllIl = ChunkProviderHell.llIlIIIIIIIlIl[3];
                        "".length();
                        if ("  ".length() == 0) {
                            return;
                        }
                        while (!lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIlIIIllIl, ChunkProviderHell.llIlIIIIIIIlIl[6])) {
                            final double llllllllllllIllIlllIIIIIlIIIllII = 0.25;
                            double llllllllllllIllIlllIIIIIlIIIlIll = llllllllllllIllIlllIIIIIlIIlIIIl;
                            final double llllllllllllIllIlllIIIIIlIIIlIlI = (llllllllllllIllIlllIIIIIlIIlIIII - llllllllllllIllIlllIIIIIlIIlIIIl) * llllllllllllIllIlllIIIIIlIIIllII;
                            int llllllllllllIllIlllIIIIIlIIIlIIl = ChunkProviderHell.llIlIIIIIIIlIl[3];
                            "".length();
                            if (-"   ".length() > 0) {
                                return;
                            }
                            while (!lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIlIIIlIIl, ChunkProviderHell.llIlIIIIIIIlIl[6])) {
                                IBlockState llllllllllllIllIlllIIIIIlIIIlIII = null;
                                if (lIIlIIIIllllIIIl(llllllllllllIllIlllIIIIIlIIlllIl * ChunkProviderHell.llIlIIIIIIIlIl[5] + llllllllllllIllIlllIIIIIlIIlIIll, llllllllllllIllIlllIIIIIlIlIIIll)) {
                                    llllllllllllIllIlllIIIIIlIIIlIII = Blocks.lava.getDefaultState();
                                }
                                if (lIIlIIIIllllIIlI(lIIlIIIIllllIIII(llllllllllllIllIlllIIIIIlIIIlIll, 0.0))) {
                                    llllllllllllIllIlllIIIIIlIIIlIII = Blocks.netherrack.getDefaultState();
                                }
                                final int llllllllllllIllIlllIIIIIlIIIIlll = llllllllllllIllIlllIIIIIlIIIllIl + llllllllllllIllIlllIIIIIlIIlllll * ChunkProviderHell.llIlIIIIIIIlIl[6];
                                final int llllllllllllIllIlllIIIIIlIIIIllI = llllllllllllIllIlllIIIIIlIIlIIll + llllllllllllIllIlllIIIIIlIIlllIl * ChunkProviderHell.llIlIIIIIIIlIl[5];
                                final int llllllllllllIllIlllIIIIIlIIIIlIl = llllllllllllIllIlllIIIIIlIIIlIIl + llllllllllllIllIlllIIIIIlIIllllI * ChunkProviderHell.llIlIIIIIIIlIl[6];
                                llllllllllllIllIlllIIIIIlIIIIIIl.setBlockState(llllllllllllIllIlllIIIIIlIIIIlll, llllllllllllIllIlllIIIIIlIIIIllI, llllllllllllIllIlllIIIIIlIIIIlIl, llllllllllllIllIlllIIIIIlIIIlIII);
                                llllllllllllIllIlllIIIIIlIIIlIll += llllllllllllIllIlllIIIIIlIIIlIlI;
                                ++llllllllllllIllIlllIIIIIlIIIlIIl;
                            }
                            llllllllllllIllIlllIIIIIlIIlIIIl += llllllllllllIllIlllIIIIIlIIIllll;
                            llllllllllllIllIlllIIIIIlIIlIIII += llllllllllllIllIlllIIIIIlIIIlllI;
                            ++llllllllllllIllIlllIIIIIlIIIllIl;
                        }
                        llllllllllllIllIlllIIIIIlIIllIll += llllllllllllIllIlllIIIIIlIIlIlll;
                        llllllllllllIllIlllIIIIIlIIllIlI += llllllllllllIllIlllIIIIIlIIlIllI;
                        llllllllllllIllIlllIIIIIlIIllIIl += llllllllllllIllIlllIIIIIlIIlIlIl;
                        llllllllllllIllIlllIIIIIlIIllIII += llllllllllllIllIlllIIIIIlIIlIlII;
                        ++llllllllllllIllIlllIIIIIlIIlIIll;
                    }
                    ++llllllllllllIllIlllIIIIIlIIlllIl;
                }
                ++llllllllllllIllIlllIIIIIlIIllllI;
            }
            ++llllllllllllIllIlllIIIIIlIIlllll;
        }
    }
    
    private static boolean lIIlIIIIllllIlll(final Object llllllllllllIllIllIlllllIllIlIII, final Object llllllllllllIllIllIlllllIllIIlll) {
        return llllllllllllIllIllIlllllIllIlIII != llllllllllllIllIllIlllllIllIIlll;
    }
    
    private static boolean lIIlIIIIllllllIl(final int llllllllllllIllIllIlllllIlIllIll) {
        return llllllllllllIllIllIlllllIlIllIll < 0;
    }
    
    private static int lIIlIIIIllllllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void lIIlIIIIlllIllll() {
        (llIlIIIIIIIlIl = new int[18])[0] = (0xFFFFB1B3 & 0x4F4C);
        ChunkProviderHell.llIlIIIIIIIlIl[1] = (0x35 ^ 0x7E ^ (0x3 ^ 0x46));
        ChunkProviderHell.llIlIIIIIIIlIl[2] = " ".length();
        ChunkProviderHell.llIlIIIIIIIlIl[3] = ((0x48 ^ 0x64 ^ (0xC2 ^ 0xA3)) & (0x8B ^ 0x83 ^ (0xCA ^ 0x8F) ^ -" ".length()));
        ChunkProviderHell.llIlIIIIIIIlIl[4] = (0x90 ^ 0x80);
        ChunkProviderHell.llIlIIIIIIIlIl[5] = (0x8F ^ 0x87);
        ChunkProviderHell.llIlIIIIIIIlIl[6] = (0x18 ^ 0x14 ^ (0xC9 ^ 0xC1));
        ChunkProviderHell.llIlIIIIIIIlIl[7] = (0x81 ^ 0x8B);
        ChunkProviderHell.llIlIIIIIIIlIl[8] = (0x1 ^ 0x63 ^ (0xEA ^ 0xB7));
        ChunkProviderHell.llIlIIIIIIIlIl[9] = "  ".length();
        ChunkProviderHell.llIlIIIIIIIlIl[10] = (128 + 59 - 130 + 151 ^ 17 + 86 - 78 + 168);
        ChunkProviderHell.llIlIIIIIIIlIl[11] = (0xB4 ^ 0x8B ^ (0xD ^ 0x5F));
        ChunkProviderHell.llIlIIIIIIIlIl[12] = -" ".length();
        ChunkProviderHell.llIlIIIIIIIlIl[13] = 98 + 82 - 57 + 4;
        ChunkProviderHell.llIlIIIIIIIlIl[14] = (64 + 19 - 6 + 120 ^ 42 + 21 + 123 + 6);
        ChunkProviderHell.llIlIIIIIIIlIl[15] = (0xB9 ^ 0xC1);
        ChunkProviderHell.llIlIIIIIIIlIl[16] = 68 + 29 + 25 + 6;
        ChunkProviderHell.llIlIIIIIIIlIl[17] = ("  ".length() ^ (0x30 ^ 0x5E));
    }
    
    private static void lIIlIIIIlllIlllI() {
        (llIlIIIIIIIlII = new String[ChunkProviderHell.llIlIIIIIIIlIl[2]])[ChunkProviderHell.llIlIIIIIIIlIl[3]] = lIIlIIIIlllIllIl("d439j2GmbNe4PM6D8o9225algttDPALC", "Muzaf");
    }
    
    public ChunkProviderHell(final World llllllllllllIllIlllIIIIIllIIllll, final boolean llllllllllllIllIlllIIIIIllIlIIlI, final long llllllllllllIllIlllIIIIIllIIllIl) {
        this.slowsandNoise = new double[ChunkProviderHell.llIlIIIIIIIlIl[0]];
        this.gravelNoise = new double[ChunkProviderHell.llIlIIIIIIIlIl[0]];
        this.netherrackExclusivityNoise = new double[ChunkProviderHell.llIlIIIIIIIlIl[0]];
        this.field_177470_t = new WorldGenFire();
        this.field_177469_u = new WorldGenGlowStone1();
        this.field_177468_v = new WorldGenGlowStone2();
        this.field_177467_w = new WorldGenMinable(Blocks.quartz_ore.getDefaultState(), ChunkProviderHell.llIlIIIIIIIlIl[1], (Predicate<IBlockState>)BlockHelper.forBlock(Blocks.netherrack));
        this.field_177473_x = new WorldGenHellLava(Blocks.flowing_lava, (boolean)(ChunkProviderHell.llIlIIIIIIIlIl[2] != 0));
        this.field_177472_y = new WorldGenHellLava(Blocks.flowing_lava, (boolean)(ChunkProviderHell.llIlIIIIIIIlIl[3] != 0));
        this.field_177471_z = new GeneratorBushFeature(Blocks.brown_mushroom);
        this.field_177465_A = new GeneratorBushFeature(Blocks.red_mushroom);
        this.genNetherBridge = new MapGenNetherBridge();
        this.netherCaveGenerator = new MapGenCavesHell();
        this.worldObj = llllllllllllIllIlllIIIIIllIIllll;
        this.field_177466_i = llllllllllllIllIlllIIIIIllIlIIlI;
        this.hellRNG = new Random(llllllllllllIllIlllIIIIIllIIllIl);
        this.netherNoiseGen1 = new NoiseGeneratorOctaves(this.hellRNG, ChunkProviderHell.llIlIIIIIIIlIl[4]);
        this.netherNoiseGen2 = new NoiseGeneratorOctaves(this.hellRNG, ChunkProviderHell.llIlIIIIIIIlIl[4]);
        this.netherNoiseGen3 = new NoiseGeneratorOctaves(this.hellRNG, ChunkProviderHell.llIlIIIIIIIlIl[5]);
        this.slowsandGravelNoiseGen = new NoiseGeneratorOctaves(this.hellRNG, ChunkProviderHell.llIlIIIIIIIlIl[6]);
        this.netherrackExculsivityNoiseGen = new NoiseGeneratorOctaves(this.hellRNG, ChunkProviderHell.llIlIIIIIIIlIl[6]);
        this.netherNoiseGen6 = new NoiseGeneratorOctaves(this.hellRNG, ChunkProviderHell.llIlIIIIIIIlIl[7]);
        this.netherNoiseGen7 = new NoiseGeneratorOctaves(this.hellRNG, ChunkProviderHell.llIlIIIIIIIlIl[4]);
        llllllllllllIllIlllIIIIIllIIllll.func_181544_b(ChunkProviderHell.llIlIIIIIIIlIl[8]);
    }
    
    @Override
    public String makeString() {
        return ChunkProviderHell.llIlIIIIIIIlII[ChunkProviderHell.llIlIIIIIIIlIl[3]];
    }
    
    private static boolean lIIlIIIIllllIIlI(final int llllllllllllIllIllIlllllIlIlIlll) {
        return llllllllllllIllIllIlllllIlIlIlll > 0;
    }
    
    private static int lIIlIIIIlllllllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIlIIIIlllllIIl(final int llllllllllllIllIllIlllllIlllllII, final int llllllllllllIllIllIlllllIllllIll) {
        return llllllllllllIllIllIlllllIlllllII == llllllllllllIllIllIlllllIllllIll;
    }
    
    @Override
    public boolean saveChunks(final boolean llllllllllllIllIllIllllllIllIIlI, final IProgressUpdate llllllllllllIllIllIllllllIllIIIl) {
        return ChunkProviderHell.llIlIIIIIIIlIl[2] != 0;
    }
    
    @Override
    public void populate(final IChunkProvider llllllllllllIllIllIlllllllIIlIIl, final int llllllllllllIllIllIllllllIllllIl, final int llllllllllllIllIllIlllllllIIIlll) {
        BlockFalling.fallInstantly = (ChunkProviderHell.llIlIIIIIIIlIl[2] != 0);
        final BlockPos llllllllllllIllIllIlllllllIIIllI = new BlockPos(llllllllllllIllIllIllllllIllllIl * ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[3], llllllllllllIllIllIlllllllIIIlll * ChunkProviderHell.llIlIIIIIIIlIl[4]);
        final ChunkCoordIntPair llllllllllllIllIllIlllllllIIIlIl = new ChunkCoordIntPair(llllllllllllIllIllIllllllIllllIl, llllllllllllIllIllIlllllllIIIlll);
        this.genNetherBridge.generateStructure(this.worldObj, this.hellRNG, llllllllllllIllIllIlllllllIIIlIl);
        "".length();
        int llllllllllllIllIllIlllllllIIIlII = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if ((0x3C ^ 0x39) <= 0) {
            return;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIllIlllllllIIIlII, ChunkProviderHell.llIlIIIIIIIlIl[5])) {
            this.field_177472_y.generate(this.worldObj, this.hellRNG, llllllllllllIllIllIlllllllIIIllI.add(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[15]) + ChunkProviderHell.llIlIIIIIIIlIl[6], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5]));
            "".length();
            ++llllllllllllIllIllIlllllllIIIlII;
        }
        int llllllllllllIllIllIlllllllIIIIll = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if (-" ".length() >= "  ".length()) {
            return;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIllIlllllllIIIIll, this.hellRNG.nextInt(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[7]) + ChunkProviderHell.llIlIIIIIIIlIl[2]) + ChunkProviderHell.llIlIIIIIIIlIl[2])) {
            this.field_177470_t.generate(this.worldObj, this.hellRNG, llllllllllllIllIllIlllllllIIIllI.add(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[15]) + ChunkProviderHell.llIlIIIIIIIlIl[6], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5]));
            "".length();
            ++llllllllllllIllIllIlllllllIIIIll;
        }
        int llllllllllllIllIllIlllllllIIIIlI = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if ((0x11 ^ 0x54 ^ (0xFC ^ 0xBD)) <= ((0x88 ^ 0xA5 ^ (0xA0 ^ 0x80)) & (0x12 ^ 0x29 ^ (0x59 ^ 0x6F) ^ -" ".length()))) {
            return;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIllIlllllllIIIIlI, this.hellRNG.nextInt(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[7]) + ChunkProviderHell.llIlIIIIIIIlIl[2]))) {
            this.field_177469_u.generate(this.worldObj, this.hellRNG, llllllllllllIllIllIlllllllIIIllI.add(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[15]) + ChunkProviderHell.llIlIIIIIIIlIl[6], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5]));
            "".length();
            ++llllllllllllIllIllIlllllllIIIIlI;
        }
        int llllllllllllIllIllIlllllllIIIIIl = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIllIlllllllIIIIIl, ChunkProviderHell.llIlIIIIIIIlIl[7])) {
            this.field_177468_v.generate(this.worldObj, this.hellRNG, llllllllllllIllIllIlllllllIIIllI.add(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[16]), this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5]));
            "".length();
            ++llllllllllllIllIllIlllllllIIIIIl;
        }
        if (lIIlIIIIllllllII(this.hellRNG.nextBoolean() ? 1 : 0)) {
            this.field_177471_z.generate(this.worldObj, this.hellRNG, llllllllllllIllIllIlllllllIIIllI.add(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[16]), this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5]));
            "".length();
        }
        if (lIIlIIIIllllllII(this.hellRNG.nextBoolean() ? 1 : 0)) {
            this.field_177465_A.generate(this.worldObj, this.hellRNG, llllllllllllIllIllIlllllllIIIllI.add(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[16]), this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]) + ChunkProviderHell.llIlIIIIIIIlIl[5]));
            "".length();
        }
        int llllllllllllIllIllIlllllllIIIIII = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if (" ".length() < -" ".length()) {
            return;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIllIlllllllIIIIII, ChunkProviderHell.llIlIIIIIIIlIl[4])) {
            this.field_177467_w.generate(this.worldObj, this.hellRNG, llllllllllllIllIllIlllllllIIIllI.add(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]), this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[17]) + ChunkProviderHell.llIlIIIIIIIlIl[7], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4])));
            "".length();
            ++llllllllllllIllIllIlllllllIIIIII;
        }
        int llllllllllllIllIllIllllllIllllll = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if (" ".length() > (0x93 ^ 0x97)) {
            return;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIllIllllllIllllll, ChunkProviderHell.llIlIIIIIIIlIl[4])) {
            this.field_177473_x.generate(this.worldObj, this.hellRNG, llllllllllllIllIllIlllllllIIIllI.add(this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4]), this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[17]) + ChunkProviderHell.llIlIIIIIIIlIl[7], this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[4])));
            "".length();
            ++llllllllllllIllIllIllllllIllllll;
        }
        BlockFalling.fallInstantly = (ChunkProviderHell.llIlIIIIIIIlIl[3] != 0);
    }
    
    private static String lIIlIIIIlllIllIl(final String llllllllllllIllIllIllllllIIIIlII, final String llllllllllllIllIllIllllllIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIllllllIIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIllllllIIIIIIl.getBytes(StandardCharsets.UTF_8)), ChunkProviderHell.llIlIIIIIIIlIl[5]), "DES");
            final Cipher llllllllllllIllIllIllllllIIIIllI = Cipher.getInstance("DES");
            llllllllllllIllIllIllllllIIIIllI.init(ChunkProviderHell.llIlIIIIIIIlIl[9], llllllllllllIllIllIllllllIIIIlll);
            return new String(llllllllllllIllIllIllllllIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIllllllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIllllllIIIIlIl) {
            llllllllllllIllIllIllllllIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void recreateStructures(final Chunk llllllllllllIllIllIllllllIIlIlll, final int llllllllllllIllIllIllllllIIlIllI, final int llllllllllllIllIllIllllllIIlIIlI) {
        this.genNetherBridge.generate(this, this.worldObj, llllllllllllIllIllIllllllIIlIllI, llllllllllllIllIllIllllllIIlIIlI, null);
    }
    
    @Override
    public Chunk provideChunk(final BlockPos llllllllllllIllIllIllllllIIIlllI) {
        return this.provideChunk(llllllllllllIllIllIllllllIIIlllI.getX() >> ChunkProviderHell.llIlIIIIIIIlIl[6], llllllllllllIllIllIllllllIIIlllI.getZ() >> ChunkProviderHell.llIlIIIIIIIlIl[6]);
    }
    
    private static boolean lIIlIIIIllllIlIl(final int llllllllllllIllIllIlllllIllIllII, final int llllllllllllIllIllIlllllIllIlIll) {
        return llllllllllllIllIllIlllllIllIllII > llllllllllllIllIllIlllllIllIlIll;
    }
    
    public void func_180516_b(final int llllllllllllIllIlllIIIIIIlIIllll, final int llllllllllllIllIlllIIIIIIlIIlllI, final ChunkPrimer llllllllllllIllIlllIIIIIIIllllIl) {
        final int llllllllllllIllIlllIIIIIIlIIllII = this.worldObj.func_181545_F() + ChunkProviderHell.llIlIIIIIIIlIl[2];
        final double llllllllllllIllIlllIIIIIIlIIlIll = 0.03125;
        this.slowsandNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.slowsandNoise, llllllllllllIllIlllIIIIIIlIIllll * ChunkProviderHell.llIlIIIIIIIlIl[4], llllllllllllIllIlllIIIIIIlIIlllI * ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[3], ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[2], llllllllllllIllIlllIIIIIIlIIlIll, llllllllllllIllIlllIIIIIIlIIlIll, 1.0);
        this.gravelNoise = this.slowsandGravelNoiseGen.generateNoiseOctaves(this.gravelNoise, llllllllllllIllIlllIIIIIIlIIllll * ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[11], llllllllllllIllIlllIIIIIIlIIlllI * ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[2], ChunkProviderHell.llIlIIIIIIIlIl[4], llllllllllllIllIlllIIIIIIlIIlIll, 1.0, llllllllllllIllIlllIIIIIIlIIlIll);
        this.netherrackExclusivityNoise = this.netherrackExculsivityNoiseGen.generateNoiseOctaves(this.netherrackExclusivityNoise, llllllllllllIllIlllIIIIIIlIIllll * ChunkProviderHell.llIlIIIIIIIlIl[4], llllllllllllIllIlllIIIIIIlIIlllI * ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[3], ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[2], llllllllllllIllIlllIIIIIIlIIlIll * 2.0, llllllllllllIllIlllIIIIIIlIIlIll * 2.0, llllllllllllIllIlllIIIIIIlIIlIll * 2.0);
        int llllllllllllIllIlllIIIIIIlIIlIlI = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIIlIIlIlI, ChunkProviderHell.llIlIIIIIIIlIl[4])) {
            int llllllllllllIllIlllIIIIIIlIIlIIl = ChunkProviderHell.llIlIIIIIIIlIl[3];
            "".length();
            if ((0x1E ^ 0x1A) == "  ".length()) {
                return;
            }
            while (!lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIIlIIlIIl, ChunkProviderHell.llIlIIIIIIIlIl[4])) {
                int n;
                if (lIIlIIIIllllIIlI(lIIlIIIIllllIlII(this.slowsandNoise[llllllllllllIllIlllIIIIIIlIIlIlI + llllllllllllIllIlllIIIIIIlIIlIIl * ChunkProviderHell.llIlIIIIIIIlIl[4]] + this.hellRNG.nextDouble() * 0.2, 0.0))) {
                    n = ChunkProviderHell.llIlIIIIIIIlIl[2];
                    "".length();
                    if (((0x99 ^ 0xC2) & ~(0x2D ^ 0x76)) > (0x74 ^ 0x70)) {
                        return;
                    }
                }
                else {
                    n = ChunkProviderHell.llIlIIIIIIIlIl[3];
                }
                final boolean llllllllllllIllIlllIIIIIIlIIlIII = n != 0;
                int n2;
                if (lIIlIIIIllllIIlI(lIIlIIIIllllIlII(this.gravelNoise[llllllllllllIllIlllIIIIIIlIIlIlI + llllllllllllIllIlllIIIIIIlIIlIIl * ChunkProviderHell.llIlIIIIIIIlIl[4]] + this.hellRNG.nextDouble() * 0.2, 0.0))) {
                    n2 = ChunkProviderHell.llIlIIIIIIIlIl[2];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    n2 = ChunkProviderHell.llIlIIIIIIIlIl[3];
                }
                final boolean llllllllllllIllIlllIIIIIIlIIIlll = n2 != 0;
                final int llllllllllllIllIlllIIIIIIlIIIllI = (int)(this.netherrackExclusivityNoise[llllllllllllIllIlllIIIIIIlIIlIlI + llllllllllllIllIlllIIIIIIlIIlIIl * ChunkProviderHell.llIlIIIIIIIlIl[4]] / 3.0 + 3.0 + this.hellRNG.nextDouble() * 0.25);
                int llllllllllllIllIlllIIIIIIlIIIlIl = ChunkProviderHell.llIlIIIIIIIlIl[12];
                IBlockState llllllllllllIllIlllIIIIIIlIIIlII = Blocks.netherrack.getDefaultState();
                IBlockState llllllllllllIllIlllIIIIIIlIIIIll = Blocks.netherrack.getDefaultState();
                int llllllllllllIllIlllIIIIIIlIIIIlI = ChunkProviderHell.llIlIIIIIIIlIl[13];
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                while (!lIIlIIIIllllllIl(llllllllllllIllIlllIIIIIIlIIIIlI)) {
                    if (lIIlIIIIllllIIIl(llllllllllllIllIlllIIIIIIlIIIIlI, ChunkProviderHell.llIlIIIIIIIlIl[13] - this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[14])) && lIIlIIIIllllIlIl(llllllllllllIllIlllIIIIIIlIIIIlI, this.hellRNG.nextInt(ChunkProviderHell.llIlIIIIIIIlIl[14]))) {
                        final IBlockState llllllllllllIllIlllIIIIIIlIIIIIl = llllllllllllIllIlllIIIIIIIllllIl.getBlockState(llllllllllllIllIlllIIIIIIlIIlIIl, llllllllllllIllIlllIIIIIIlIIIIlI, llllllllllllIllIlllIIIIIIlIIlIlI);
                        if (lIIlIIIIllllIllI(llllllllllllIllIlllIIIIIIlIIIIIl.getBlock()) && lIIlIIIIllllIlll(llllllllllllIllIlllIIIIIIlIIIIIl.getBlock().getMaterial(), Material.air)) {
                            if (lIIlIIIIlllllIII(llllllllllllIllIlllIIIIIIlIIIIIl.getBlock(), Blocks.netherrack)) {
                                if (lIIlIIIIlllllIIl(llllllllllllIllIlllIIIIIIlIIIlIl, ChunkProviderHell.llIlIIIIIIIlIl[12])) {
                                    if (lIIlIIIIlllllIlI(llllllllllllIllIlllIIIIIIlIIIllI)) {
                                        llllllllllllIllIlllIIIIIIlIIIlII = null;
                                        llllllllllllIllIlllIIIIIIlIIIIll = Blocks.netherrack.getDefaultState();
                                        "".length();
                                        if (-"  ".length() >= 0) {
                                            return;
                                        }
                                    }
                                    else if (lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIIlIIIIlI, llllllllllllIllIlllIIIIIIlIIllII - ChunkProviderHell.llIlIIIIIIIlIl[6]) && lIIlIIIIlllllIll(llllllllllllIllIlllIIIIIIlIIIIlI, llllllllllllIllIlllIIIIIIlIIllII + ChunkProviderHell.llIlIIIIIIIlIl[2])) {
                                        llllllllllllIllIlllIIIIIIlIIIlII = Blocks.netherrack.getDefaultState();
                                        llllllllllllIllIlllIIIIIIlIIIIll = Blocks.netherrack.getDefaultState();
                                        if (lIIlIIIIllllllII(llllllllllllIllIlllIIIIIIlIIIlll ? 1 : 0)) {
                                            llllllllllllIllIlllIIIIIIlIIIlII = Blocks.gravel.getDefaultState();
                                            llllllllllllIllIlllIIIIIIlIIIIll = Blocks.netherrack.getDefaultState();
                                        }
                                        if (lIIlIIIIllllllII(llllllllllllIllIlllIIIIIIlIIlIII ? 1 : 0)) {
                                            llllllllllllIllIlllIIIIIIlIIIlII = Blocks.soul_sand.getDefaultState();
                                            llllllllllllIllIlllIIIIIIlIIIIll = Blocks.soul_sand.getDefaultState();
                                        }
                                    }
                                    if (lIIlIIIIllllIIIl(llllllllllllIllIlllIIIIIIlIIIIlI, llllllllllllIllIlllIIIIIIlIIllII) && (!lIIlIIIIllllIllI(llllllllllllIllIlllIIIIIIlIIIlII) || lIIlIIIIlllllIII(llllllllllllIllIlllIIIIIIlIIIlII.getBlock().getMaterial(), Material.air))) {
                                        llllllllllllIllIlllIIIIIIlIIIlII = Blocks.lava.getDefaultState();
                                    }
                                    llllllllllllIllIlllIIIIIIlIIIlIl = llllllllllllIllIlllIIIIIIlIIIllI;
                                    if (lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIIlIIIIlI, llllllllllllIllIlllIIIIIIlIIllII - ChunkProviderHell.llIlIIIIIIIlIl[2])) {
                                        llllllllllllIllIlllIIIIIIIllllIl.setBlockState(llllllllllllIllIlllIIIIIIlIIlIIl, llllllllllllIllIlllIIIIIIlIIIIlI, llllllllllllIllIlllIIIIIIlIIlIlI, llllllllllllIllIlllIIIIIIlIIIlII);
                                        "".length();
                                        if (null != null) {
                                            return;
                                        }
                                    }
                                    else {
                                        llllllllllllIllIlllIIIIIIIllllIl.setBlockState(llllllllllllIllIlllIIIIIIlIIlIIl, llllllllllllIllIlllIIIIIIlIIIIlI, llllllllllllIllIlllIIIIIIlIIlIlI, llllllllllllIllIlllIIIIIIlIIIIll);
                                        "".length();
                                        if (null != null) {
                                            return;
                                        }
                                    }
                                }
                                else if (lIIlIIIIllllIIlI(llllllllllllIllIlllIIIIIIlIIIlIl)) {
                                    --llllllllllllIllIlllIIIIIIlIIIlIl;
                                    llllllllllllIllIlllIIIIIIIllllIl.setBlockState(llllllllllllIllIlllIIIIIIlIIlIIl, llllllllllllIllIlllIIIIIIlIIIIlI, llllllllllllIllIlllIIIIIIlIIlIlI, llllllllllllIllIlllIIIIIIlIIIIll);
                                    "".length();
                                    if (" ".length() != " ".length()) {
                                        return;
                                    }
                                }
                            }
                        }
                        else {
                            llllllllllllIllIlllIIIIIIlIIIlIl = ChunkProviderHell.llIlIIIIIIIlIl[12];
                            "".length();
                            if ((" ".length() & (" ".length() ^ -" ".length())) != 0x0) {
                                return;
                            }
                        }
                    }
                    else {
                        llllllllllllIllIlllIIIIIIIllllIl.setBlockState(llllllllllllIllIlllIIIIIIlIIlIIl, llllllllllllIllIlllIIIIIIlIIIIlI, llllllllllllIllIlllIIIIIIlIIlIlI, Blocks.bedrock.getDefaultState());
                    }
                    --llllllllllllIllIlllIIIIIIlIIIIlI;
                }
                ++llllllllllllIllIlllIIIIIIlIIlIIl;
            }
            ++llllllllllllIllIlllIIIIIIlIIlIlI;
        }
    }
    
    static {
        lIIlIIIIlllIllll();
        lIIlIIIIlllIlllI();
    }
    
    private static boolean lIIlIIIIllllIIll(final int llllllllllllIllIllIlllllIllllIII, final int llllllllllllIllIllIlllllIlllIlll) {
        return llllllllllllIllIllIlllllIllllIII >= llllllllllllIllIllIlllllIlllIlll;
    }
    
    @Override
    public BlockPos getStrongholdGen(final World llllllllllllIllIllIllllllIIlllll, final String llllllllllllIllIllIllllllIIllllI, final BlockPos llllllllllllIllIllIllllllIIlllIl) {
        return null;
    }
    
    @Override
    public List<BiomeGenBase.SpawnListEntry> getPossibleCreatures(final EnumCreatureType llllllllllllIllIllIllllllIlIIlll, final BlockPos llllllllllllIllIllIllllllIlIIIlI) {
        if (lIIlIIIIlllllIII(llllllllllllIllIllIllllllIlIIlll, EnumCreatureType.MONSTER)) {
            if (lIIlIIIIllllllII(this.genNetherBridge.func_175795_b(llllllllllllIllIllIllllllIlIIIlI) ? 1 : 0)) {
                return this.genNetherBridge.getSpawnList();
            }
            if (lIIlIIIIllllllII(this.genNetherBridge.func_175796_a(this.worldObj, llllllllllllIllIllIllllllIlIIIlI) ? 1 : 0) && lIIlIIIIlllllIII(this.worldObj.getBlockState(llllllllllllIllIllIllllllIlIIIlI.down()).getBlock(), Blocks.nether_brick)) {
                return this.genNetherBridge.getSpawnList();
            }
        }
        final BiomeGenBase llllllllllllIllIllIllllllIlIIlIl = this.worldObj.getBiomeGenForCoords(llllllllllllIllIllIllllllIlIIIlI);
        return llllllllllllIllIllIllllllIlIIlIl.getSpawnableList(llllllllllllIllIllIllllllIlIIlll);
    }
    
    @Override
    public Chunk provideChunk(final int llllllllllllIllIlllIIIIIIIIlllll, final int llllllllllllIllIlllIIIIIIIIllllI) {
        this.hellRNG.setSeed(llllllllllllIllIlllIIIIIIIIlllll * 341873128712L + llllllllllllIllIlllIIIIIIIIllllI * 132897987541L);
        final ChunkPrimer llllllllllllIllIlllIIIIIIIlIIlIl = new ChunkPrimer();
        this.func_180515_a(llllllllllllIllIlllIIIIIIIIlllll, llllllllllllIllIlllIIIIIIIIllllI, llllllllllllIllIlllIIIIIIIlIIlIl);
        this.func_180516_b(llllllllllllIllIlllIIIIIIIIlllll, llllllllllllIllIlllIIIIIIIIllllI, llllllllllllIllIlllIIIIIIIlIIlIl);
        this.netherCaveGenerator.generate(this, this.worldObj, llllllllllllIllIlllIIIIIIIIlllll, llllllllllllIllIlllIIIIIIIIllllI, llllllllllllIllIlllIIIIIIIlIIlIl);
        if (lIIlIIIIllllllII(this.field_177466_i ? 1 : 0)) {
            this.genNetherBridge.generate(this, this.worldObj, llllllllllllIllIlllIIIIIIIIlllll, llllllllllllIllIlllIIIIIIIIllllI, llllllllllllIllIlllIIIIIIIlIIlIl);
        }
        final Chunk llllllllllllIllIlllIIIIIIIlIIlII = new Chunk(this.worldObj, llllllllllllIllIlllIIIIIIIlIIlIl, llllllllllllIllIlllIIIIIIIIlllll, llllllllllllIllIlllIIIIIIIIllllI);
        final BiomeGenBase[] llllllllllllIllIlllIIIIIIIlIIIll = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(null, llllllllllllIllIlllIIIIIIIIlllll * ChunkProviderHell.llIlIIIIIIIlIl[4], llllllllllllIllIlllIIIIIIIIllllI * ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[4], ChunkProviderHell.llIlIIIIIIIlIl[4]);
        final byte[] llllllllllllIllIlllIIIIIIIlIIIlI = llllllllllllIllIlllIIIIIIIlIIlII.getBiomeArray();
        int llllllllllllIllIlllIIIIIIIlIIIIl = ChunkProviderHell.llIlIIIIIIIlIl[3];
        "".length();
        if ("  ".length() == ((0xA3 ^ 0x8A) & ~(0x63 ^ 0x4A))) {
            return null;
        }
        while (!lIIlIIIIllllIIll(llllllllllllIllIlllIIIIIIIlIIIIl, llllllllllllIllIlllIIIIIIIlIIIlI.length)) {
            llllllllllllIllIlllIIIIIIIlIIIlI[llllllllllllIllIlllIIIIIIIlIIIIl] = (byte)llllllllllllIllIlllIIIIIIIlIIIll[llllllllllllIllIlllIIIIIIIlIIIIl].biomeID;
            ++llllllllllllIllIlllIIIIIIIlIIIIl;
        }
        llllllllllllIllIlllIIIIIIIlIIlII.resetRelightChecks();
        return llllllllllllIllIlllIIIIIIIlIIlII;
    }
    
    private static int lIIlIIIIllllIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public boolean canSave() {
        return ChunkProviderHell.llIlIIIIIIIlIl[2] != 0;
    }
    
    private static boolean lIIlIIIlIIIIIIII(final Object llllllllllllIllIllIlllllIlIlllll) {
        return llllllllllllIllIllIlllllIlIlllll == null;
    }
}
