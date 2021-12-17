// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import net.minecraft.world.gen.feature.WorldGenDungeons;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.util.IProgressUpdate;
import net.minecraft.entity.EnumCreatureType;
import java.util.Iterator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.ChunkPrimer;
import java.util.Arrays;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.structure.StructureOceanMonument;
import net.minecraft.world.gen.structure.MapGenMineshaft;
import net.minecraft.world.gen.structure.MapGenScatteredFeature;
import net.minecraft.world.gen.structure.MapGenVillage;
import java.util.Map;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.structure.MapGenStronghold;
import net.minecraft.util.BlockPos;
import net.minecraft.world.gen.feature.WorldGenLakes;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.gen.structure.MapGenStructure;
import java.util.List;
import net.minecraft.world.chunk.IChunkProvider;

public class ChunkProviderFlat implements IChunkProvider
{
    private final /* synthetic */ List<MapGenStructure> structureGenerators;
    private final /* synthetic */ boolean hasDecoration;
    private final /* synthetic */ IBlockState[] cachedBlockIDs;
    private static final /* synthetic */ int[] lIllIIlIIIIIII;
    private final /* synthetic */ boolean hasDungeons;
    private static final /* synthetic */ String[] lIllIIIllIIIII;
    private /* synthetic */ World worldObj;
    private final /* synthetic */ FlatGeneratorInfo flatWorldGenInfo;
    private /* synthetic */ Random random;
    private /* synthetic */ WorldGenLakes waterLakeGenerator;
    private /* synthetic */ WorldGenLakes lavaLakeGenerator;
    
    @Override
    public boolean unloadQueuedChunks() {
        return ChunkProviderFlat.lIllIIlIIIIIII[1] != 0;
    }
    
    private static boolean lllllIIlIlIIlll(final Object lllllllllllllIIIIIlIIllIIIlllllI) {
        return lllllllllllllIIIIIlIIllIIIlllllI != null;
    }
    
    @Override
    public BlockPos getStrongholdGen(final World lllllllllllllIIIIIlIIllIlIllIIll, final String lllllllllllllIIIIIlIIllIlIllIIlI, final BlockPos lllllllllllllIIIIIlIIllIlIllIIII) {
        if (lllllIIlIlIIIlI(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[20]].equals(lllllllllllllIIIIIlIIllIlIllIIlI) ? 1 : 0)) {
            final float lllllllllllllIIIIIlIIllIlIlIlIll = (float)this.structureGenerators.iterator();
            "".length();
            if ((78 + 28 - 30 + 101 ^ 60 + 66 + 20 + 34) == 0x0) {
                return null;
            }
            while (!lllllIIlIlIIIll(((Iterator)lllllllllllllIIIIIlIIllIlIlIlIll).hasNext() ? 1 : 0)) {
                final MapGenStructure lllllllllllllIIIIIlIIllIlIllIlIl = ((Iterator<MapGenStructure>)lllllllllllllIIIIIlIIllIlIlIlIll).next();
                if (lllllIIlIlIIIlI((lllllllllllllIIIIIlIIllIlIllIlIl instanceof MapGenStronghold) ? 1 : 0)) {
                    return lllllllllllllIIIIIlIIllIlIllIlIl.getClosestStrongholdPos(lllllllllllllIIIIIlIIllIlIllIIll, lllllllllllllIIIIIlIIllIlIllIIII);
                }
            }
        }
        return null;
    }
    
    private static void lllllIIIIlIlIll() {
        (lIllIIIllIIIII = new String[ChunkProviderFlat.lIllIIlIIIIIII[21]])[ChunkProviderFlat.lIllIIlIIIIIII[1]] = lllllIIIIlIIlll("UM6a13YQAog=", "wRcPH");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[2]] = lllllIIIIlIlIII("FAE0KBMFDQ==", "bhXDr");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[3]] = lllllIIIIlIlIII("Fzw4PA==", "dUBYW");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[4]] = lllllIIIIlIlIIl("tmVx90DYMOs=", "yTviG");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[5]] = lllllIIIIlIlIII("ZQ==", "ThVnH");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[6]] = lllllIIIIlIlIIl("737IkK4yKRY=", "pUtdE");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[7]] = lllllIIIIlIIlll("CnftNtil0s8=", "poziJ");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[8]] = lllllIIIIlIlIII("FzkNHAASMQUN", "zPcys");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[9]] = lllllIIIIlIlIII("PT0fCzY4NRca", "PTqnE");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[10]] = lllllIIIIlIlIIl("ws+jqmufpxxtVRf/KLULYg==", "hLOgV");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[11]] = lllllIIIIlIlIIl("XTIEX7I0HjhgmIprAgO3jw==", "woOus");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[12]] = lllllIIIIlIlIIl("7S8P2nkK4opsuOEWXA+GKg==", "uKjWP");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[13]] = lllllIIIIlIlIII("IC4AFjQiIgsCNyojEQ==", "OMewZ");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[14]] = lllllIIIIlIlIIl("CWV5qG70uac=", "iMAve");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[15]] = lllllIIIIlIIlll("8O362E2m+hy+Z1Enjvth8A==", "TiqhT");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[16]] = lllllIIIIlIIlll("6xqq7V0i1yk=", "tkzky");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[17]] = lllllIIIIlIlIIl("rsXsHR12DIc3QIpZ7YRzrA==", "lQkUD");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[19]] = lllllIIIIlIlIII("CBsnGB4rASMAASECNA83", "NwFlR");
        ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[20]] = lllllIIIIlIlIII("PDIlCy8ILjgIJQ==", "oFWdA");
    }
    
    @Override
    public String makeString() {
        return ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[19]];
    }
    
    private static boolean lllllIIlIlIIlIl(final int lllllllllllllIIIIIlIIllIIlIIllIl, final int lllllllllllllIIIIIlIIllIIlIIllII) {
        return lllllllllllllIIIIIlIIllIIlIIllIl >= lllllllllllllIIIIIlIIllIIlIIllII;
    }
    
    @Override
    public Chunk provideChunk(final BlockPos lllllllllllllIIIIIlIIllIlIIIIIlI) {
        return this.provideChunk(lllllllllllllIIIIIlIIllIlIIIIIlI.getX() >> ChunkProviderFlat.lIllIIlIIIIIII[5], lllllllllllllIIIIIlIIllIlIIIIIlI.getZ() >> ChunkProviderFlat.lIllIIlIIIIIII[5]);
    }
    
    @Override
    public boolean func_177460_a(final IChunkProvider lllllllllllllIIIIIlIIllIlllIlllI, final Chunk lllllllllllllIIIIIlIIllIlllIllII, final int lllllllllllllIIIIIlIIllIlllIlIll, final int lllllllllllllIIIIIlIIllIlllIlIlI) {
        return ChunkProviderFlat.lIllIIlIIIIIII[1] != 0;
    }
    
    private static void lllllIIlIlIIIIl() {
        (lIllIIlIIIIIII = new int[22])[0] = (-(0xFFFFC5EE & 0x3EFF) & (0xFFFFD5ED & 0x2FFF));
        ChunkProviderFlat.lIllIIlIIIIIII[1] = ((191 + 211 - 214 + 56 ^ 49 + 75 - 87 + 127) & (0x0 ^ 0x72 ^ (0xA0 ^ 0x82) ^ -" ".length()));
        ChunkProviderFlat.lIllIIlIIIIIII[2] = " ".length();
        ChunkProviderFlat.lIllIIlIIIIIII[3] = "  ".length();
        ChunkProviderFlat.lIllIIlIIIIIII[4] = "   ".length();
        ChunkProviderFlat.lIllIIlIIIIIII[5] = (0x17 ^ 0x13);
        ChunkProviderFlat.lIllIIlIIIIIII[6] = (0x1D ^ 0x18);
        ChunkProviderFlat.lIllIIlIIIIIII[7] = (0x77 ^ 0x71);
        ChunkProviderFlat.lIllIIlIIIIIII[8] = (0x1A ^ 0x1D);
        ChunkProviderFlat.lIllIIlIIIIIII[9] = (0xF ^ 0x7);
        ChunkProviderFlat.lIllIIlIIIIIII[10] = (0xF ^ 0x6);
        ChunkProviderFlat.lIllIIlIIIIIII[11] = (0x6A ^ 0x60);
        ChunkProviderFlat.lIllIIlIIIIIII[12] = (0x2 ^ 0x9);
        ChunkProviderFlat.lIllIIlIIIIIII[13] = (0xBF ^ 0xB3);
        ChunkProviderFlat.lIllIIlIIIIIII[14] = (0x8F ^ 0x85 ^ (0xAB ^ 0xAC));
        ChunkProviderFlat.lIllIIlIIIIIII[15] = (62 + 61 - 121 + 186 ^ 77 + 21 - 71 + 151);
        ChunkProviderFlat.lIllIIlIIIIIII[16] = (0xAE ^ 0xA1);
        ChunkProviderFlat.lIllIIlIIIIIII[17] = ("  ".length() ^ (0x98 ^ 0x8A));
        ChunkProviderFlat.lIllIIlIIIIIII[18] = 146 + 128 - 134 + 80 + (0xB2 ^ 0x9C) - (113 + 68 - 45 + 7) + (0xFF ^ 0x82);
        ChunkProviderFlat.lIllIIlIIIIIII[19] = (0xA0 ^ 0x8B ^ (0x2 ^ 0x38));
        ChunkProviderFlat.lIllIIlIIIIIII[20] = (0xBD ^ 0xAF);
        ChunkProviderFlat.lIllIIlIIIIIII[21] = (0x59 ^ 0x4A);
    }
    
    @Override
    public void saveExtraData() {
    }
    
    private static String lllllIIIIlIIlll(final String lllllllllllllIIIIIlIIllIIllllIlI, final String lllllllllllllIIIIIlIIllIIllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIIllIIlllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIIllIIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlIIllIIlllllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlIIllIIlllllII.init(ChunkProviderFlat.lIllIIlIIIIIII[3], lllllllllllllIIIIIlIIllIIlllllIl);
            return new String(lllllllllllllIIIIIlIIllIIlllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIIllIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIIllIIllllIll) {
            lllllllllllllIIIIIlIIllIIllllIll.printStackTrace();
            return null;
        }
    }
    
    public ChunkProviderFlat(final World lllllllllllllIIIIIlIIlllIlIIlIll, final long lllllllllllllIIIIIlIIlllIlIIlIlI, final boolean lllllllllllllIIIIIlIIlllIlIlIllI, final String lllllllllllllIIIIIlIIlllIlIIlIII) {
        this.cachedBlockIDs = new IBlockState[ChunkProviderFlat.lIllIIlIIIIIII[0]];
        this.structureGenerators = (List<MapGenStructure>)Lists.newArrayList();
        this.worldObj = lllllllllllllIIIIIlIIlllIlIIlIll;
        this.random = new Random(lllllllllllllIIIIIlIIlllIlIIlIlI);
        this.flatWorldGenInfo = FlatGeneratorInfo.createFlatGeneratorFromString(lllllllllllllIIIIIlIIlllIlIIlIII);
        if (lllllIIlIlIIIlI(lllllllllllllIIIIIlIIlllIlIlIllI ? 1 : 0)) {
            final Map<String, Map<String, String>> lllllllllllllIIIIIlIIlllIlIlIlII = this.flatWorldGenInfo.getWorldFeatures();
            if (lllllIIlIlIIIlI(lllllllllllllIIIIIlIIlllIlIlIlII.containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[1]]) ? 1 : 0)) {
                final Map<String, String> lllllllllllllIIIIIlIIlllIlIlIIll = lllllllllllllIIIIIlIIlllIlIlIlII.get(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[2]]);
                if (lllllIIlIlIIIll(lllllllllllllIIIIIlIIlllIlIlIIll.containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[3]]) ? 1 : 0)) {
                    lllllllllllllIIIIIlIIlllIlIlIIll.put(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[4]], ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[5]]);
                    "".length();
                }
                this.structureGenerators.add(new MapGenVillage(lllllllllllllIIIIIlIIlllIlIlIIll));
                "".length();
            }
            if (lllllIIlIlIIIlI(lllllllllllllIIIIIlIIlllIlIlIlII.containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[6]]) ? 1 : 0)) {
                this.structureGenerators.add(new MapGenScatteredFeature(lllllllllllllIIIIIlIIlllIlIlIlII.get(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[7]])));
                "".length();
            }
            if (lllllIIlIlIIIlI(lllllllllllllIIIIIlIIlllIlIlIlII.containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[8]]) ? 1 : 0)) {
                this.structureGenerators.add(new MapGenMineshaft(lllllllllllllIIIIIlIIlllIlIlIlII.get(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[9]])));
                "".length();
            }
            if (lllllIIlIlIIIlI(lllllllllllllIIIIIlIIlllIlIlIlII.containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[10]]) ? 1 : 0)) {
                this.structureGenerators.add(new MapGenStronghold(lllllllllllllIIIIIlIIlllIlIlIlII.get(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[11]])));
                "".length();
            }
            if (lllllIIlIlIIIlI(lllllllllllllIIIIIlIIlllIlIlIlII.containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[12]]) ? 1 : 0)) {
                this.structureGenerators.add(new StructureOceanMonument(lllllllllllllIIIIIlIIlllIlIlIlII.get(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[13]])));
                "".length();
            }
        }
        if (lllllIIlIlIIIlI(this.flatWorldGenInfo.getWorldFeatures().containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[14]]) ? 1 : 0)) {
            this.waterLakeGenerator = new WorldGenLakes(Blocks.water);
        }
        if (lllllIIlIlIIIlI(this.flatWorldGenInfo.getWorldFeatures().containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[15]]) ? 1 : 0)) {
            this.lavaLakeGenerator = new WorldGenLakes(Blocks.lava);
        }
        this.hasDungeons = this.flatWorldGenInfo.getWorldFeatures().containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[16]]);
        int lllllllllllllIIIIIlIIlllIlIlIIlI = ChunkProviderFlat.lIllIIlIIIIIII[1];
        int lllllllllllllIIIIIlIIlllIlIlIIIl = ChunkProviderFlat.lIllIIlIIIIIII[1];
        boolean lllllllllllllIIIIIlIIlllIlIlIIII = ChunkProviderFlat.lIllIIlIIIIIII[2] != 0;
        final boolean lllllllllllllIIIIIlIIlllIlIIIIll = (boolean)this.flatWorldGenInfo.getFlatLayers().iterator();
        "".length();
        if ((0x67 ^ 0x63) < 0) {
            throw null;
        }
        while (!lllllIIlIlIIIll(((Iterator)lllllllllllllIIIIIlIIlllIlIIIIll).hasNext() ? 1 : 0)) {
            final FlatLayerInfo lllllllllllllIIIIIlIIlllIlIIllll = ((Iterator<FlatLayerInfo>)lllllllllllllIIIIIlIIlllIlIIIIll).next();
            int lllllllllllllIIIIIlIIlllIlIIlllI = lllllllllllllIIIIIlIIlllIlIIllll.getMinY();
            "".length();
            if ("   ".length() > "   ".length()) {
                throw null;
            }
            while (!lllllIIlIlIIlIl(lllllllllllllIIIIIlIIlllIlIIlllI, lllllllllllllIIIIIlIIlllIlIIllll.getMinY() + lllllllllllllIIIIIlIIlllIlIIllll.getLayerCount())) {
                final IBlockState lllllllllllllIIIIIlIIlllIlIIllIl = lllllllllllllIIIIIlIIlllIlIIllll.func_175900_c();
                if (lllllIIlIlIIlII(lllllllllllllIIIIIlIIlllIlIIllIl.getBlock(), Blocks.air)) {
                    lllllllllllllIIIIIlIIlllIlIlIIII = (ChunkProviderFlat.lIllIIlIIIIIII[1] != 0);
                    this.cachedBlockIDs[lllllllllllllIIIIIlIIlllIlIIlllI] = lllllllllllllIIIIIlIIlllIlIIllIl;
                }
                ++lllllllllllllIIIIIlIIlllIlIIlllI;
            }
            if (lllllIIlIlIIllI(lllllllllllllIIIIIlIIlllIlIIllll.func_175900_c().getBlock(), Blocks.air)) {
                lllllllllllllIIIIIlIIlllIlIlIIIl += lllllllllllllIIIIIlIIlllIlIIllll.getLayerCount();
                "".length();
                if ("  ".length() <= 0) {
                    throw null;
                }
                continue;
            }
            else {
                lllllllllllllIIIIIlIIlllIlIlIIlI += lllllllllllllIIIIIlIIlllIlIIllll.getLayerCount() + lllllllllllllIIIIIlIIlllIlIlIIIl;
                lllllllllllllIIIIIlIIlllIlIlIIIl = ChunkProviderFlat.lIllIIlIIIIIII[1];
            }
        }
        lllllllllllllIIIIIlIIlllIlIIlIll.func_181544_b(lllllllllllllIIIIIlIIlllIlIlIIlI);
        int containsKey;
        if (lllllIIlIlIIIlI(lllllllllllllIIIIIlIIlllIlIlIIII ? 1 : 0)) {
            containsKey = ChunkProviderFlat.lIllIIlIIIIIII[1];
            "".length();
            if (" ".length() < -" ".length()) {
                throw null;
            }
        }
        else {
            containsKey = (this.flatWorldGenInfo.getWorldFeatures().containsKey(ChunkProviderFlat.lIllIIIllIIIII[ChunkProviderFlat.lIllIIlIIIIIII[17]]) ? 1 : 0);
        }
        this.hasDecoration = (containsKey != 0);
    }
    
    private static String lllllIIIIlIlIIl(final String lllllllllllllIIIIIlIIllIIllIlIll, final String lllllllllllllIIIIIlIIllIIllIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIIllIIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIIllIIllIllII.getBytes(StandardCharsets.UTF_8)), ChunkProviderFlat.lIllIIlIIIIIII[9]), "DES");
            final Cipher lllllllllllllIIIIIlIIllIIllIllll = Cipher.getInstance("DES");
            lllllllllllllIIIIIlIIllIIllIllll.init(ChunkProviderFlat.lIllIIlIIIIIII[3], lllllllllllllIIIIIlIIllIIlllIIII);
            return new String(lllllllllllllIIIIIlIIllIIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIIllIIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIIllIIllIlllI) {
            lllllllllllllIIIIIlIIllIIllIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllIIlIlIlIII(final int lllllllllllllIIIIIlIIllIIlIIlIIl, final int lllllllllllllIIIIIlIIllIIlIIlIII) {
        return lllllllllllllIIIIIlIIllIIlIIlIIl < lllllllllllllIIIIIlIIllIIlIIlIII;
    }
    
    @Override
    public int getLoadedChunkCount() {
        return ChunkProviderFlat.lIllIIlIIIIIII[1];
    }
    
    @Override
    public boolean chunkExists(final int lllllllllllllIIIIIlIIlllIIlIIIlI, final int lllllllllllllIIIIIlIIlllIIlIIIIl) {
        return ChunkProviderFlat.lIllIIlIIIIIII[2] != 0;
    }
    
    private static boolean lllllIIlIlIIIll(final int lllllllllllllIIIIIlIIllIIIlllIlI) {
        return lllllllllllllIIIIIlIIllIIIlllIlI == 0;
    }
    
    @Override
    public Chunk provideChunk(final int lllllllllllllIIIIIlIIlllIIllIlll, final int lllllllllllllIIIIIlIIlllIIllIllI) {
        final ChunkPrimer lllllllllllllIIIIIlIIlllIIllIlIl = new ChunkPrimer();
        int lllllllllllllIIIIIlIIlllIIllIlII = ChunkProviderFlat.lIllIIlIIIIIII[1];
        "".length();
        if (-" ".length() > 0) {
            return null;
        }
        while (!lllllIIlIlIIlIl(lllllllllllllIIIIIlIIlllIIllIlII, this.cachedBlockIDs.length)) {
            final IBlockState lllllllllllllIIIIIlIIlllIIllIIll = this.cachedBlockIDs[lllllllllllllIIIIIlIIlllIIllIlII];
            if (lllllIIlIlIIlll(lllllllllllllIIIIIlIIlllIIllIIll)) {
                int lllllllllllllIIIIIlIIlllIIllIIlI = ChunkProviderFlat.lIllIIlIIIIIII[1];
                "".length();
                if ("  ".length() <= " ".length()) {
                    return null;
                }
                while (!lllllIIlIlIIlIl(lllllllllllllIIIIIlIIlllIIllIIlI, ChunkProviderFlat.lIllIIlIIIIIII[17])) {
                    int lllllllllllllIIIIIlIIlllIIllIIIl = ChunkProviderFlat.lIllIIlIIIIIII[1];
                    "".length();
                    if (((0x47 ^ 0x16 ^ (0x4B ^ 0x15)) & (112 + 134 - 135 + 28 ^ 40 + 101 - 25 + 16 ^ -" ".length())) != 0x0) {
                        return null;
                    }
                    while (!lllllIIlIlIIlIl(lllllllllllllIIIIIlIIlllIIllIIIl, ChunkProviderFlat.lIllIIlIIIIIII[17])) {
                        lllllllllllllIIIIIlIIlllIIllIlIl.setBlockState(lllllllllllllIIIIIlIIlllIIllIIlI, lllllllllllllIIIIIlIIlllIIllIlII, lllllllllllllIIIIIlIIlllIIllIIIl, lllllllllllllIIIIIlIIlllIIllIIll);
                        ++lllllllllllllIIIIIlIIlllIIllIIIl;
                    }
                    ++lllllllllllllIIIIIlIIlllIIllIIlI;
                }
            }
            ++lllllllllllllIIIIIlIIlllIIllIlII;
        }
        final Iterator<MapGenStructure> iterator = this.structureGenerators.iterator();
        "".length();
        if (((0x1 ^ 0x63) & ~(0x5B ^ 0x39)) > 0) {
            return null;
        }
        while (!lllllIIlIlIIIll(iterator.hasNext() ? 1 : 0)) {
            final MapGenBase lllllllllllllIIIIIlIIlllIIllIIII = iterator.next();
            lllllllllllllIIIIIlIIlllIIllIIII.generate(this, this.worldObj, lllllllllllllIIIIIlIIlllIIllIlll, lllllllllllllIIIIIlIIlllIIllIllI, lllllllllllllIIIIIlIIlllIIllIlIl);
        }
        final Chunk lllllllllllllIIIIIlIIlllIIlIllll = new Chunk(this.worldObj, lllllllllllllIIIIIlIIlllIIllIlIl, lllllllllllllIIIIIlIIlllIIllIlll, lllllllllllllIIIIIlIIlllIIllIllI);
        final BiomeGenBase[] lllllllllllllIIIIIlIIlllIIlIlllI = this.worldObj.getWorldChunkManager().loadBlockGeneratorData(null, lllllllllllllIIIIIlIIlllIIllIlll * ChunkProviderFlat.lIllIIlIIIIIII[17], lllllllllllllIIIIIlIIlllIIllIllI * ChunkProviderFlat.lIllIIlIIIIIII[17], ChunkProviderFlat.lIllIIlIIIIIII[17], ChunkProviderFlat.lIllIIlIIIIIII[17]);
        final byte[] lllllllllllllIIIIIlIIlllIIlIllIl = lllllllllllllIIIIIlIIlllIIlIllll.getBiomeArray();
        int lllllllllllllIIIIIlIIlllIIlIllII = ChunkProviderFlat.lIllIIlIIIIIII[1];
        "".length();
        if ("   ".length() < -" ".length()) {
            return null;
        }
        while (!lllllIIlIlIIlIl(lllllllllllllIIIIIlIIlllIIlIllII, lllllllllllllIIIIIlIIlllIIlIllIl.length)) {
            lllllllllllllIIIIIlIIlllIIlIllIl[lllllllllllllIIIIIlIIlllIIlIllII] = (byte)lllllllllllllIIIIIlIIlllIIlIlllI[lllllllllllllIIIIIlIIlllIIlIllII].biomeID;
            ++lllllllllllllIIIIIlIIlllIIlIllII;
        }
        lllllllllllllIIIIIlIIlllIIlIllll.generateSkylightMap();
        return lllllllllllllIIIIIlIIlllIIlIllll;
    }
    
    @Override
    public void recreateStructures(final Chunk lllllllllllllIIIIIlIIllIlIIllIlI, final int lllllllllllllIIIIIlIIllIlIIllIII, final int lllllllllllllIIIIIlIIllIlIIIllll) {
        final int lllllllllllllIIIIIlIIllIlIIIllII = (int)this.structureGenerators.iterator();
        "".length();
        if ((0x74 ^ 0x70) < "   ".length()) {
            return;
        }
        while (!lllllIIlIlIIIll(((Iterator)lllllllllllllIIIIIlIIllIlIIIllII).hasNext() ? 1 : 0)) {
            final MapGenStructure lllllllllllllIIIIIlIIllIlIIlIlII = ((Iterator<MapGenStructure>)lllllllllllllIIIIIlIIllIlIIIllII).next();
            lllllllllllllIIIIIlIIllIlIIlIlII.generate(this, this.worldObj, lllllllllllllIIIIIlIIllIlIIllIII, lllllllllllllIIIIIlIIllIlIIIllll, null);
        }
    }
    
    private static boolean lllllIIlIlIIllI(final Object lllllllllllllIIIIIlIIllIIlIIIIIl, final Object lllllllllllllIIIIIlIIllIIlIIIIII) {
        return lllllllllllllIIIIIlIIllIIlIIIIIl == lllllllllllllIIIIIlIIllIIlIIIIII;
    }
    
    private static String lllllIIIIlIlIII(String lllllllllllllIIIIIlIIllIIlIlllIl, final String lllllllllllllIIIIIlIIllIIlIlIlll) {
        lllllllllllllIIIIIlIIllIIlIlllIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIIlIIllIIlIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlIIllIIlIllIll = new StringBuilder();
        final char[] lllllllllllllIIIIIlIIllIIlIllIlI = lllllllllllllIIIIIlIIllIIlIlIlll.toCharArray();
        int lllllllllllllIIIIIlIIllIIlIllIIl = ChunkProviderFlat.lIllIIlIIIIIII[1];
        final float lllllllllllllIIIIIlIIllIIlIlIIll = (Object)lllllllllllllIIIIIlIIllIIlIlllIl.toCharArray();
        final long lllllllllllllIIIIIlIIllIIlIlIIlI = lllllllllllllIIIIIlIIllIIlIlIIll.length;
        int lllllllllllllIIIIIlIIllIIlIlIIIl = ChunkProviderFlat.lIllIIlIIIIIII[1];
        while (lllllIIlIlIlIII(lllllllllllllIIIIIlIIllIIlIlIIIl, (int)lllllllllllllIIIIIlIIllIIlIlIIlI)) {
            final char lllllllllllllIIIIIlIIllIIlIllllI = lllllllllllllIIIIIlIIllIIlIlIIll[lllllllllllllIIIIIlIIllIIlIlIIIl];
            lllllllllllllIIIIIlIIllIIlIllIll.append((char)(lllllllllllllIIIIIlIIllIIlIllllI ^ lllllllllllllIIIIIlIIllIIlIllIlI[lllllllllllllIIIIIlIIllIIlIllIIl % lllllllllllllIIIIIlIIllIIlIllIlI.length]));
            "".length();
            ++lllllllllllllIIIIIlIIllIIlIllIIl;
            ++lllllllllllllIIIIIlIIllIIlIlIIIl;
            "".length();
            if (((0xB7 ^ 0xC2 ^ (0xF7 ^ 0x95)) & (66 + 35 - 3 + 31 ^ 16 + 58 + 54 + 22 ^ -" ".length())) >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlIIllIIlIllIll);
    }
    
    @Override
    public boolean canSave() {
        return ChunkProviderFlat.lIllIIlIIIIIII[2] != 0;
    }
    
    @Override
    public List<BiomeGenBase.SpawnListEntry> getPossibleCreatures(final EnumCreatureType lllllllllllllIIIIIlIIllIllIlIlIl, final BlockPos lllllllllllllIIIIIlIIllIllIlIIll) {
        final BiomeGenBase lllllllllllllIIIIIlIIllIllIlIIIl = this.worldObj.getBiomeGenForCoords(lllllllllllllIIIIIlIIllIllIlIIll);
        return lllllllllllllIIIIIlIIllIllIlIIIl.getSpawnableList(lllllllllllllIIIIIlIIllIllIlIlIl);
    }
    
    @Override
    public boolean saveChunks(final boolean lllllllllllllIIIIIlIIllIlllIlIII, final IProgressUpdate lllllllllllllIIIIIlIIllIlllIIlll) {
        return ChunkProviderFlat.lIllIIlIIIIIII[2] != 0;
    }
    
    static {
        lllllIIlIlIIIIl();
        lllllIIIIlIlIll();
    }
    
    @Override
    public void populate(final IChunkProvider lllllllllllllIIIIIlIIlllIIIlIIIl, final int lllllllllllllIIIIIlIIlllIIIlIIII, final int lllllllllllllIIIIIlIIlllIIIIIIII) {
        final int lllllllllllllIIIIIlIIlllIIIIlllI = lllllllllllllIIIIIlIIlllIIIlIIII * ChunkProviderFlat.lIllIIlIIIIIII[17];
        final int lllllllllllllIIIIIlIIlllIIIIllIl = lllllllllllllIIIIIlIIlllIIIIIIII * ChunkProviderFlat.lIllIIlIIIIIII[17];
        final BlockPos lllllllllllllIIIIIlIIlllIIIIllII = new BlockPos(lllllllllllllIIIIIlIIlllIIIIlllI, ChunkProviderFlat.lIllIIlIIIIIII[1], lllllllllllllIIIIIlIIlllIIIIllIl);
        final BiomeGenBase lllllllllllllIIIIIlIIlllIIIIlIll = this.worldObj.getBiomeGenForCoords(new BlockPos(lllllllllllllIIIIIlIIlllIIIIlllI + ChunkProviderFlat.lIllIIlIIIIIII[17], ChunkProviderFlat.lIllIIlIIIIIII[1], lllllllllllllIIIIIlIIlllIIIIllIl + ChunkProviderFlat.lIllIIlIIIIIII[17]));
        boolean lllllllllllllIIIIIlIIlllIIIIlIlI = ChunkProviderFlat.lIllIIlIIIIIII[1] != 0;
        this.random.setSeed(this.worldObj.getSeed());
        final long lllllllllllllIIIIIlIIlllIIIIlIIl = this.random.nextLong() / 2L * 2L + 1L;
        final long lllllllllllllIIIIIlIIlllIIIIlIII = this.random.nextLong() / 2L * 2L + 1L;
        this.random.setSeed(lllllllllllllIIIIIlIIlllIIIlIIII * lllllllllllllIIIIIlIIlllIIIIlIIl + lllllllllllllIIIIIlIIlllIIIIIIII * lllllllllllllIIIIIlIIlllIIIIlIII ^ this.worldObj.getSeed());
        final ChunkCoordIntPair lllllllllllllIIIIIlIIlllIIIIIlll = new ChunkCoordIntPair(lllllllllllllIIIIIlIIlllIIIlIIII, lllllllllllllIIIIIlIIlllIIIIIIII);
        final byte lllllllllllllIIIIIlIIllIllllIIll = (byte)this.structureGenerators.iterator();
        "".length();
        if (-" ".length() >= "   ".length()) {
            return;
        }
        while (!lllllIIlIlIIIll(((Iterator)lllllllllllllIIIIIlIIllIllllIIll).hasNext() ? 1 : 0)) {
            final MapGenStructure lllllllllllllIIIIIlIIlllIIIIIllI = ((Iterator<MapGenStructure>)lllllllllllllIIIIIlIIllIllllIIll).next();
            final boolean lllllllllllllIIIIIlIIlllIIIIIlIl = lllllllllllllIIIIIlIIlllIIIIIllI.generateStructure(this.worldObj, this.random, lllllllllllllIIIIIlIIlllIIIIIlll);
            if (lllllIIlIlIIIlI((lllllllllllllIIIIIlIIlllIIIIIllI instanceof MapGenVillage) ? 1 : 0)) {
                lllllllllllllIIIIIlIIlllIIIIlIlI |= lllllllllllllIIIIIlIIlllIIIIIlIl;
            }
        }
        if (lllllIIlIlIIlll(this.waterLakeGenerator) && lllllIIlIlIIIll(lllllllllllllIIIIIlIIlllIIIIlIlI ? 1 : 0) && lllllIIlIlIIIll(this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[5]))) {
            this.waterLakeGenerator.generate(this.worldObj, this.random, lllllllllllllIIIIIlIIlllIIIIllII.add(this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[17]) + ChunkProviderFlat.lIllIIlIIIIIII[9], this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[0]), this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[17]) + ChunkProviderFlat.lIllIIlIIIIIII[9]));
            "".length();
        }
        if (lllllIIlIlIIlll(this.lavaLakeGenerator) && lllllIIlIlIIIll(lllllllllllllIIIIIlIIlllIIIIlIlI ? 1 : 0) && lllllIIlIlIIIll(this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[9]))) {
            final BlockPos lllllllllllllIIIIIlIIlllIIIIIlII = lllllllllllllIIIIIlIIlllIIIIllII.add(this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[17]) + ChunkProviderFlat.lIllIIlIIIIIII[9], this.random.nextInt(this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[18]) + ChunkProviderFlat.lIllIIlIIIIIII[9]), this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[17]) + ChunkProviderFlat.lIllIIlIIIIIII[9]);
            if (!lllllIIlIlIIlIl(lllllllllllllIIIIIlIIlllIIIIIlII.getY(), this.worldObj.func_181545_F()) || lllllIIlIlIIIll(this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[11]))) {
                this.lavaLakeGenerator.generate(this.worldObj, this.random, lllllllllllllIIIIIlIIlllIIIIIlII);
                "".length();
            }
        }
        if (lllllIIlIlIIIlI(this.hasDungeons ? 1 : 0)) {
            int lllllllllllllIIIIIlIIlllIIIIIIll = ChunkProviderFlat.lIllIIlIIIIIII[1];
            "".length();
            if (" ".length() == (0x53 ^ 0x57)) {
                return;
            }
            while (!lllllIIlIlIIlIl(lllllllllllllIIIIIlIIlllIIIIIIll, ChunkProviderFlat.lIllIIlIIIIIII[9])) {
                new WorldGenDungeons().generate(this.worldObj, this.random, lllllllllllllIIIIIlIIlllIIIIllII.add(this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[17]) + ChunkProviderFlat.lIllIIlIIIIIII[9], this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[0]), this.random.nextInt(ChunkProviderFlat.lIllIIlIIIIIII[17]) + ChunkProviderFlat.lIllIIlIIIIIII[9]));
                "".length();
                ++lllllllllllllIIIIIlIIlllIIIIIIll;
            }
        }
        if (lllllIIlIlIIIlI(this.hasDecoration ? 1 : 0)) {
            lllllllllllllIIIIIlIIlllIIIIlIll.decorate(this.worldObj, this.random, lllllllllllllIIIIIlIIlllIIIIllII);
        }
    }
    
    private static boolean lllllIIlIlIIlII(final Object lllllllllllllIIIIIlIIllIIlIIIlIl, final Object lllllllllllllIIIIIlIIllIIlIIIlII) {
        return lllllllllllllIIIIIlIIllIIlIIIlIl != lllllllllllllIIIIIlIIllIIlIIIlII;
    }
    
    private static boolean lllllIIlIlIIIlI(final int lllllllllllllIIIIIlIIllIIIllllII) {
        return lllllllllllllIIIIIlIIllIIIllllII != 0;
    }
}
