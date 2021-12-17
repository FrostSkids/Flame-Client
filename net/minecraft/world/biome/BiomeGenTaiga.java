// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.util.BlockPos;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockDirt;
import net.minecraft.init.Blocks;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import java.util.Random;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenBlockBlob;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraft.world.gen.feature.WorldGenTaiga1;

public class BiomeGenTaiga extends BiomeGenBase
{
    private static final /* synthetic */ String[] llIlllIIIllIlI;
    private /* synthetic */ int field_150644_aH;
    private static final /* synthetic */ WorldGenTaiga1 field_150639_aC;
    private static final /* synthetic */ WorldGenMegaPineTree field_150642_aF;
    private static final /* synthetic */ WorldGenMegaPineTree field_150641_aE;
    private static final /* synthetic */ WorldGenBlockBlob field_150643_aG;
    private static final /* synthetic */ int[] llIlllIIIllIll;
    private static final /* synthetic */ WorldGenTaiga2 field_150640_aD;
    
    @Override
    public WorldGenerator getRandomWorldGenForGrass(final Random llllllllllllIllIIlIlIIIIlIllIlII) {
        WorldGenTallGrass worldGenTallGrass;
        if (lIIllIIlIlIIlIll(llllllllllllIllIIlIlIIIIlIllIlII.nextInt(BiomeGenTaiga.llIlllIIIllIll[9]))) {
            worldGenTallGrass = new WorldGenTallGrass(BlockTallGrass.EnumType.FERN);
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else {
            worldGenTallGrass = new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
        }
        return worldGenTallGrass;
    }
    
    @Override
    public WorldGenAbstractTree genBigTreeChance(final Random llllllllllllIllIIlIlIIIIlIlllIlI) {
        WorldGenAbstractTree worldGenAbstractTree;
        if ((!lIIllIIlIlIIIlll(this.field_150644_aH, BiomeGenTaiga.llIlllIIIllIll[1]) || lIIllIIlIlIIlIII(this.field_150644_aH, BiomeGenTaiga.llIlllIIIllIll[5])) && lIIllIIlIlIIlIIl(llllllllllllIllIIlIlIIIIlIlllIlI.nextInt(BiomeGenTaiga.llIlllIIIllIll[7]))) {
            if (lIIllIIlIlIIIlll(this.field_150644_aH, BiomeGenTaiga.llIlllIIIllIll[5]) && lIIllIIlIlIIlIlI(llllllllllllIllIIlIlIIIIlIlllIlI.nextInt(BiomeGenTaiga.llIlllIIIllIll[8]))) {
                worldGenAbstractTree = BiomeGenTaiga.field_150641_aE;
                "".length();
                if ("  ".length() > (0x84 ^ 0x80)) {
                    return null;
                }
            }
            else {
                worldGenAbstractTree = BiomeGenTaiga.field_150642_aF;
                "".length();
                if (-(0x7C ^ 0x78) >= 0) {
                    return null;
                }
            }
        }
        else if (lIIllIIlIlIIlIIl(llllllllllllIllIIlIlIIIIlIlllIlI.nextInt(BiomeGenTaiga.llIlllIIIllIll[7]))) {
            worldGenAbstractTree = BiomeGenTaiga.field_150639_aC;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        else {
            worldGenAbstractTree = BiomeGenTaiga.field_150640_aD;
        }
        return worldGenAbstractTree;
    }
    
    private static boolean lIIllIIlIlIIIlll(final int llllllllllllIllIIlIlIIIIIlIlllII, final int llllllllllllIllIIlIlIIIIIlIllIll) {
        return llllllllllllIllIIlIlIIIIIlIlllII != llllllllllllIllIIlIlIIIIIlIllIll;
    }
    
    private static boolean lIIllIIlIlIIlIlI(final int llllllllllllIllIIlIlIIIIIllIIIll) {
        return llllllllllllIllIIlIlIIIIIllIIIll != 0;
    }
    
    public BiomeGenTaiga(final int llllllllllllIllIIlIlIIIIlIllllll, final int llllllllllllIllIIlIlIIIIlIlllllI) {
        super(llllllllllllIllIIlIlIIIIlIllllll);
        this.field_150644_aH = llllllllllllIllIIlIlIIIIlIlllllI;
        this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, BiomeGenTaiga.llIlllIIIllIll[2], BiomeGenTaiga.llIlllIIIllIll[3], BiomeGenTaiga.llIlllIIIllIll[3]));
        "".length();
        this.theBiomeDecorator.treesPerChunk = BiomeGenTaiga.llIlllIIIllIll[4];
        if (lIIllIIlIlIIIlll(llllllllllllIllIIlIlIIIIlIlllllI, BiomeGenTaiga.llIlllIIIllIll[1]) && lIIllIIlIlIIIlll(llllllllllllIllIIlIlIIIIlIlllllI, BiomeGenTaiga.llIlllIIIllIll[5])) {
            this.theBiomeDecorator.grassPerChunk = BiomeGenTaiga.llIlllIIIllIll[1];
            this.theBiomeDecorator.mushroomsPerChunk = BiomeGenTaiga.llIlllIIIllIll[1];
            "".length();
            if (" ".length() <= 0) {
                throw null;
            }
        }
        else {
            this.theBiomeDecorator.grassPerChunk = BiomeGenTaiga.llIlllIIIllIll[6];
            this.theBiomeDecorator.deadBushPerChunk = BiomeGenTaiga.llIlllIIIllIll[1];
            this.theBiomeDecorator.mushroomsPerChunk = BiomeGenTaiga.llIlllIIIllIll[7];
        }
    }
    
    private static String lIIllIIlIlIIIIlI(final String llllllllllllIllIIlIlIIIIIlllIIII, final String llllllllllllIllIIlIlIIIIIlllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIlIIIIIlllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIlIIIIIlllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlIlIIIIIlllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlIlIIIIIlllIlII.init(BiomeGenTaiga.llIlllIIIllIll[5], llllllllllllIllIIlIlIIIIIlllIlIl);
            return new String(llllllllllllIllIIlIlIIIIIlllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIlIIIIIlllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIlIIIIIlllIIll) {
            llllllllllllIllIIlIlIIIIIlllIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIIlIlIIlIll(final int llllllllllllIllIIlIlIIIIIlIlllll) {
        return llllllllllllIllIIlIlIIIIIlIlllll > 0;
    }
    
    @Override
    protected BiomeGenBase createMutatedBiome(final int llllllllllllIllIIlIlIIIIIllllIlI) {
        BiomeGenBase biomeGenBase;
        if (lIIllIIlIlIIlIII(this.biomeID, BiomeGenBase.megaTaiga.biomeID)) {
            biomeGenBase = new BiomeGenTaiga(llllllllllllIllIIlIlIIIIIllllIlI, BiomeGenTaiga.llIlllIIIllIll[5]).func_150557_a(BiomeGenTaiga.llIlllIIIllIll[12], (boolean)(BiomeGenTaiga.llIlllIIIllIll[1] != 0)).setBiomeName(BiomeGenTaiga.llIlllIIIllIlI[BiomeGenTaiga.llIlllIIIllIll[0]]).setFillerBlockMetadata(BiomeGenTaiga.llIlllIIIllIll[13]).setTemperatureRainfall(0.25f, 0.8f).setHeight(new Height(this.minHeight, this.maxHeight));
            "".length();
            if ("   ".length() <= "  ".length()) {
                return null;
            }
        }
        else {
            biomeGenBase = super.createMutatedBiome(llllllllllllIllIIlIlIIIIIllllIlI);
        }
        return biomeGenBase;
    }
    
    @Override
    public void genTerrainBlocks(final World llllllllllllIllIIlIlIIIIlIIIIlIl, final Random llllllllllllIllIIlIlIIIIlIIIIlII, final ChunkPrimer llllllllllllIllIIlIlIIIIlIIIIIll, final int llllllllllllIllIIlIlIIIIlIIIIIlI, final int llllllllllllIllIIlIlIIIIlIIIlIII, final double llllllllllllIllIIlIlIIIIlIIIIIII) {
        if (!lIIllIIlIlIIIlll(this.field_150644_aH, BiomeGenTaiga.llIlllIIIllIll[1]) || lIIllIIlIlIIlIII(this.field_150644_aH, BiomeGenTaiga.llIlllIIIllIll[5])) {
            this.topBlock = Blocks.grass.getDefaultState();
            this.fillerBlock = Blocks.dirt.getDefaultState();
            if (lIIllIIlIlIIlIll(lIIllIIlIlIIllIl(llllllllllllIllIIlIlIIIIlIIIIIII, 1.75))) {
                this.topBlock = Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lIIllIIlIlIIlIll(lIIllIIlIlIIllIl(llllllllllllIllIIlIlIIIIlIIIIIII, -0.95))) {
                this.topBlock = Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.PODZOL);
            }
        }
        this.generateBiomeTerrain(llllllllllllIllIIlIlIIIIlIIIIlIl, llllllllllllIllIIlIlIIIIlIIIIlII, llllllllllllIllIIlIlIIIIlIIIIIll, llllllllllllIllIIlIlIIIIlIIIIIlI, llllllllllllIllIIlIlIIIIlIIIlIII, llllllllllllIllIIlIlIIIIlIIIIIII);
    }
    
    private static void lIIllIIlIlIIIIll() {
        (llIlllIIIllIlI = new String[BiomeGenTaiga.llIlllIIIllIll[1]])[BiomeGenTaiga.llIlllIIIllIll[0]] = lIIllIIlIlIIIIlI("B+XcB5QNKmMzeM1BR1Ua5ozhLiRjD+Nk", "YoFnh");
    }
    
    private static int lIIllIIlIlIIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIllIIlIlIIlIIl(final int llllllllllllIllIIlIlIIIIIllIIIIl) {
        return llllllllllllIllIIlIlIIIIIllIIIIl == 0;
    }
    
    private static void lIIllIIlIlIIIllI() {
        (llIlllIIIllIll = new int[14])[0] = ((181 + 8 - 38 + 36 ^ 6 + 46 + 94 + 7) & (71 + 125 - 70 + 9 ^ 75 + 131 - 165 + 124 ^ -" ".length()));
        BiomeGenTaiga.llIlllIIIllIll[1] = " ".length();
        BiomeGenTaiga.llIlllIIIllIll[2] = (0xBB ^ 0xAE ^ (0x1E ^ 0x3));
        BiomeGenTaiga.llIlllIIIllIll[3] = (0xBB ^ 0xBF);
        BiomeGenTaiga.llIlllIIIllIll[4] = (0x8D ^ 0x87);
        BiomeGenTaiga.llIlllIIIllIll[5] = "  ".length();
        BiomeGenTaiga.llIlllIIIllIll[6] = (154 + 117 - 214 + 139 ^ 82 + 14 - 47 + 146);
        BiomeGenTaiga.llIlllIIIllIll[7] = "   ".length();
        BiomeGenTaiga.llIlllIIIllIll[8] = (0x9D ^ 0x90);
        BiomeGenTaiga.llIlllIIIllIll[9] = (71 + 10 + 57 + 28 ^ 104 + 139 - 232 + 152);
        BiomeGenTaiga.llIlllIIIllIll[10] = (0x3E ^ 0x2E);
        BiomeGenTaiga.llIlllIIIllIll[11] = (0x32 ^ 0x12);
        BiomeGenTaiga.llIlllIIIllIll[12] = (-(0xFFFF9DFD & 0x73AF) & (0xFFFFFFFD & 0x5977FF));
        BiomeGenTaiga.llIlllIIIllIll[13] = (0xFFFFBFF7 & 0x4EFA39);
    }
    
    @Override
    public void decorate(final World llllllllllllIllIIlIlIIIIlIlIlIIl, final Random llllllllllllIllIIlIlIIIIlIIllIll, final BlockPos llllllllllllIllIIlIlIIIIlIlIIlll) {
        if (!lIIllIIlIlIIIlll(this.field_150644_aH, BiomeGenTaiga.llIlllIIIllIll[1]) || lIIllIIlIlIIlIII(this.field_150644_aH, BiomeGenTaiga.llIlllIIIllIll[5])) {
            final int llllllllllllIllIIlIlIIIIlIlIIllI = llllllllllllIllIIlIlIIIIlIIllIll.nextInt(BiomeGenTaiga.llIlllIIIllIll[7]);
            int llllllllllllIllIIlIlIIIIlIlIIlIl = BiomeGenTaiga.llIlllIIIllIll[0];
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
            while (!lIIllIIlIlIIllII(llllllllllllIllIIlIlIIIIlIlIIlIl, llllllllllllIllIIlIlIIIIlIlIIllI)) {
                final int llllllllllllIllIIlIlIIIIlIlIIlII = llllllllllllIllIIlIlIIIIlIIllIll.nextInt(BiomeGenTaiga.llIlllIIIllIll[10]) + BiomeGenTaiga.llIlllIIIllIll[2];
                final int llllllllllllIllIIlIlIIIIlIlIIIll = llllllllllllIllIIlIlIIIIlIIllIll.nextInt(BiomeGenTaiga.llIlllIIIllIll[10]) + BiomeGenTaiga.llIlllIIIllIll[2];
                final BlockPos llllllllllllIllIIlIlIIIIlIlIIIlI = llllllllllllIllIIlIlIIIIlIlIlIIl.getHeight(llllllllllllIllIIlIlIIIIlIlIIlll.add(llllllllllllIllIIlIlIIIIlIlIIlII, BiomeGenTaiga.llIlllIIIllIll[0], llllllllllllIllIIlIlIIIIlIlIIIll));
                BiomeGenTaiga.field_150643_aG.generate(llllllllllllIllIIlIlIIIIlIlIlIIl, llllllllllllIllIIlIlIIIIlIIllIll, llllllllllllIllIIlIlIIIIlIlIIIlI);
                "".length();
                ++llllllllllllIllIIlIlIIIIlIlIIlIl;
            }
        }
        BiomeGenTaiga.DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.FERN);
        int llllllllllllIllIIlIlIIIIlIlIIIIl = BiomeGenTaiga.llIlllIIIllIll[0];
        "".length();
        if (" ".length() >= (56 + 38 + 19 + 21 ^ 95 + 105 - 104 + 34)) {
            return;
        }
        while (!lIIllIIlIlIIllII(llllllllllllIllIIlIlIIIIlIlIIIIl, BiomeGenTaiga.llIlllIIIllIll[6])) {
            final int llllllllllllIllIIlIlIIIIlIlIIIII = llllllllllllIllIIlIlIIIIlIIllIll.nextInt(BiomeGenTaiga.llIlllIIIllIll[10]) + BiomeGenTaiga.llIlllIIIllIll[2];
            final int llllllllllllIllIIlIlIIIIlIIlllll = llllllllllllIllIIlIlIIIIlIIllIll.nextInt(BiomeGenTaiga.llIlllIIIllIll[10]) + BiomeGenTaiga.llIlllIIIllIll[2];
            final int llllllllllllIllIIlIlIIIIlIIllllI = llllllllllllIllIIlIlIIIIlIIllIll.nextInt(llllllllllllIllIIlIlIIIIlIlIlIIl.getHeight(llllllllllllIllIIlIlIIIIlIlIIlll.add(llllllllllllIllIIlIlIIIIlIlIIIII, BiomeGenTaiga.llIlllIIIllIll[0], llllllllllllIllIIlIlIIIIlIIlllll)).getY() + BiomeGenTaiga.llIlllIIIllIll[11]);
            BiomeGenTaiga.DOUBLE_PLANT_GENERATOR.generate(llllllllllllIllIIlIlIIIIlIlIlIIl, llllllllllllIllIIlIlIIIIlIIllIll, llllllllllllIllIIlIlIIIIlIlIIlll.add(llllllllllllIllIIlIlIIIIlIlIIIII, llllllllllllIllIIlIlIIIIlIIllllI, llllllllllllIllIIlIlIIIIlIIlllll));
            "".length();
            ++llllllllllllIllIIlIlIIIIlIlIIIIl;
        }
        super.decorate(llllllllllllIllIIlIlIIIIlIlIlIIl, llllllllllllIllIIlIlIIIIlIIllIll, llllllllllllIllIIlIlIIIIlIlIIlll);
    }
    
    private static boolean lIIllIIlIlIIlIII(final int llllllllllllIllIIlIlIIIIIllIlIlI, final int llllllllllllIllIIlIlIIIIIllIlIIl) {
        return llllllllllllIllIIlIlIIIIIllIlIlI == llllllllllllIllIIlIlIIIIIllIlIIl;
    }
    
    static {
        lIIllIIlIlIIIllI();
        lIIllIIlIlIIIIll();
        field_150639_aC = new WorldGenTaiga1();
        field_150640_aD = new WorldGenTaiga2((boolean)(BiomeGenTaiga.llIlllIIIllIll[0] != 0));
        field_150641_aE = new WorldGenMegaPineTree((boolean)(BiomeGenTaiga.llIlllIIIllIll[0] != 0), (boolean)(BiomeGenTaiga.llIlllIIIllIll[0] != 0));
        field_150642_aF = new WorldGenMegaPineTree((boolean)(BiomeGenTaiga.llIlllIIIllIll[0] != 0), (boolean)(BiomeGenTaiga.llIlllIIIllIll[1] != 0));
        field_150643_aG = new WorldGenBlockBlob(Blocks.mossy_cobblestone, BiomeGenTaiga.llIlllIIIllIll[0]);
    }
    
    private static boolean lIIllIIlIlIIllII(final int llllllllllllIllIIlIlIIIIIllIIllI, final int llllllllllllIllIIlIlIIIIIllIIlIl) {
        return llllllllllllIllIIlIlIIIIIllIIllI >= llllllllllllIllIIlIlIIIIIllIIlIl;
    }
}
