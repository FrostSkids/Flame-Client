// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.util.WeightedRandom;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntitySheep;
import com.google.common.collect.Lists;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.logging.log4j.LogManager;
import java.util.Collections;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.World;
import net.minecraft.world.ColorizerFoliage;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.block.BlockFlower;
import java.util.Random;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.util.MathHelper;
import net.minecraft.util.BlockPos;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import java.util.Set;
import net.minecraft.world.gen.NoiseGeneratorPerlin;
import java.util.List;
import net.minecraft.world.gen.feature.WorldGenDoublePlant;
import net.minecraft.world.gen.feature.WorldGenSwamp;
import org.apache.logging.log4j.Logger;
import java.util.Map;
import net.minecraft.block.state.IBlockState;

public abstract class BiomeGenBase
{
    public /* synthetic */ int waterColorMultiplier;
    public /* synthetic */ IBlockState fillerBlock;
    public static final /* synthetic */ BiomeGenBase mesaPlateau_F;
    public /* synthetic */ float temperature;
    public static final /* synthetic */ Map<String, BiomeGenBase> BIOME_ID_MAP;
    private static final /* synthetic */ Logger logger;
    public /* synthetic */ int field_150609_ah;
    public /* synthetic */ int fillerBlockMetadata;
    public static final /* synthetic */ BiomeGenBase coldTaiga;
    protected /* synthetic */ WorldGenSwamp worldGeneratorSwamp;
    protected static final /* synthetic */ Height height_HighPlateaus;
    protected /* synthetic */ boolean enableSnow;
    public /* synthetic */ int color;
    protected static final /* synthetic */ Height height_LowIslands;
    public static final /* synthetic */ BiomeGenBase megaTaigaHills;
    protected static final /* synthetic */ Height height_Default;
    public static final /* synthetic */ BiomeGenBase savanna;
    public /* synthetic */ String biomeName;
    public static final /* synthetic */ BiomeGenBase forest;
    public static final /* synthetic */ BiomeGenBase mesaPlateau;
    public static final /* synthetic */ BiomeGenBase sky;
    public static final /* synthetic */ BiomeGenBase jungle;
    public /* synthetic */ float rainfall;
    protected /* synthetic */ boolean enableRain;
    public static final /* synthetic */ BiomeGenBase birchForest;
    public static final /* synthetic */ BiomeGenBase hell;
    protected /* synthetic */ List<SpawnListEntry> spawnableMonsterList;
    public final /* synthetic */ int biomeID;
    private static final /* synthetic */ String[] llIIIIIIlIIIIl;
    protected static final /* synthetic */ Height height_PartiallySubmerged;
    private static final /* synthetic */ BiomeGenBase[] biomeList;
    protected /* synthetic */ List<SpawnListEntry> spawnableCreatureList;
    protected static final /* synthetic */ NoiseGeneratorPerlin temperatureNoise;
    public static final /* synthetic */ BiomeGenBase birchForestHills;
    public static final /* synthetic */ BiomeGenBase plains;
    public static final /* synthetic */ BiomeGenBase taiga;
    public static final /* synthetic */ BiomeGenBase desert;
    protected static final /* synthetic */ Height height_RockyWaters;
    public static final /* synthetic */ Set<BiomeGenBase> explorationBiomesList;
    protected /* synthetic */ List<SpawnListEntry> spawnableCaveCreatureList;
    protected static final /* synthetic */ Height height_MidPlains;
    public static final /* synthetic */ BiomeGenBase roofedForest;
    private static final /* synthetic */ int[] llIIIIlIIIlIll;
    protected static final /* synthetic */ Height height_DeepOceans;
    public static final /* synthetic */ BiomeGenBase swampland;
    protected static final /* synthetic */ Height height_Oceans;
    public /* synthetic */ float maxHeight;
    public static final /* synthetic */ BiomeGenBase mesa;
    public static final /* synthetic */ BiomeGenBase ocean;
    public static final /* synthetic */ BiomeGenBase icePlains;
    public static final /* synthetic */ BiomeGenBase frozenOcean;
    public static final /* synthetic */ BiomeGenBase extremeHillsEdge;
    public static final /* synthetic */ BiomeGenBase extremeHillsPlus;
    public /* synthetic */ float minHeight;
    protected static final /* synthetic */ Height height_ShallowWaters;
    protected static final /* synthetic */ Height height_LowHills;
    protected /* synthetic */ WorldGenBigTree worldGeneratorBigTree;
    protected /* synthetic */ List<SpawnListEntry> spawnableWaterCreatureList;
    protected static final /* synthetic */ Height height_Shores;
    public static final /* synthetic */ BiomeGenBase megaTaiga;
    public static final /* synthetic */ BiomeGenBase extremeHills;
    public static final /* synthetic */ BiomeGenBase jungleEdge;
    public static final /* synthetic */ BiomeGenBase savannaPlateau;
    protected /* synthetic */ WorldGenTrees worldGeneratorTrees;
    public /* synthetic */ IBlockState topBlock;
    protected static final /* synthetic */ Height height_MidHills;
    protected static final /* synthetic */ Height height_LowPlains;
    public /* synthetic */ BiomeDecorator theBiomeDecorator;
    
    public boolean isEqualTo(final BiomeGenBase llllllllllllIlllIlllIIlIIllllllI) {
        int n;
        if (lIIIIllllIlIIIlI(llllllllllllIlllIlllIIlIIllllllI, this)) {
            n = BiomeGenBase.llIIIIlIIIlIll[3];
            "".length();
            if (((0xC5 ^ 0xA6) & ~(0x46 ^ 0x25)) > ((0xF2 ^ 0xAB) & ~(0x20 ^ 0x79))) {
                return ((0xBF ^ 0xB9) & ~(0xBC ^ 0xBA)) != 0x0;
            }
        }
        else if (lIIIIllllIlIIlIl(llllllllllllIlllIlllIIlIIllllllI)) {
            n = BiomeGenBase.llIIIIlIIIlIll[1];
            "".length();
            if (-" ".length() == (0x97 ^ 0xC7 ^ (0xCB ^ 0x9F))) {
                return ((0 + 83 - 37 + 88 ^ 29 + 121 - 30 + 21) & (0x73 ^ 0x48 ^ (0x73 ^ 0x43) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIIIIllllIlIIIlI(this.getBiomeClass(), llllllllllllIlllIlllIIlIIllllllI.getBiomeClass())) {
            n = BiomeGenBase.llIIIIlIIIlIll[3];
            "".length();
            if ((0xE3 ^ 0x98 ^ 84 + 61 - 57 + 39) <= 0) {
                return ((67 + 119 - 155 + 166 ^ 127 + 73 - 96 + 62) & (0x3D ^ 0x5C ^ "  ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = BiomeGenBase.llIIIIlIIIlIll[1];
        }
        return n != 0;
    }
    
    private static boolean lIIIIllllIlIIlII(final int llllllllllllIlllIlllIIlIIIIlIlIl) {
        return llllllllllllIlllIlllIIlIIIIlIlIl <= 0;
    }
    
    public int getGrassColorAtPos(final BlockPos llllllllllllIlllIlllIIlIlllIllIl) {
        final double llllllllllllIlllIlllIIlIlllIllII = MathHelper.clamp_float(this.getFloatTemperature(llllllllllllIlllIlllIIlIlllIllIl), 0.0f, 1.0f);
        final double llllllllllllIlllIlllIIlIlllIlIll = MathHelper.clamp_float(this.getFloatRainfall(), 0.0f, 1.0f);
        return ColorizerGrass.getGrassColor(llllllllllllIlllIlllIIlIlllIllII, llllllllllllIlllIlllIIlIlllIlIll);
    }
    
    private static boolean lIIIIllllIIlIlIl(final Object llllllllllllIlllIlllIIlIIIlIIlIl) {
        return llllllllllllIlllIlllIIlIIIlIIlIl != null;
    }
    
    public BlockFlower.EnumFlowerType pickRandomFlower(final Random llllllllllllIlllIlllIIllIlIIlIII, final BlockPos llllllllllllIlllIlllIIllIlIIIlll) {
        BlockFlower.EnumFlowerType enumFlowerType;
        if (lIIIIllllIIllIll(llllllllllllIlllIlllIIllIlIIlIII.nextInt(BiomeGenBase.llIIIIlIIIlIll[7]))) {
            enumFlowerType = BlockFlower.EnumFlowerType.DANDELION;
            "".length();
            if (-(95 + 13 - 42 + 106 ^ 33 + 148 - 147 + 134) >= 0) {
                return null;
            }
        }
        else {
            enumFlowerType = BlockFlower.EnumFlowerType.POPPY;
        }
        return enumFlowerType;
    }
    
    protected BiomeGenBase setDisableRain() {
        this.enableRain = (BiomeGenBase.llIIIIlIIIlIll[1] != 0);
        return this;
    }
    
    private static boolean lIIIIllllIlIIIlI(final Object llllllllllllIlllIlllIIlIIIlIIIlI, final Object llllllllllllIlllIlllIIlIIIlIIIIl) {
        return llllllllllllIlllIlllIIlIIIlIIIlI == llllllllllllIlllIlllIIlIIIlIIIIl;
    }
    
    public static BiomeGenBase[] getBiomeGenArray() {
        return BiomeGenBase.biomeList;
    }
    
    private static boolean lIIIIllllIIlllII(final int llllllllllllIlllIlllIIlIIIIlIlll) {
        return llllllllllllIlllIlllIIlIIIIlIlll < 0;
    }
    
    private static int lIIIIllllIlIIIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public TempCategory getTempCategory() {
        TempCategory tempCategory;
        if (lIIIIllllIIlllII(lIIIIllllIlIIllI(this.temperature, 0.2))) {
            tempCategory = TempCategory.COLD;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else if (lIIIIllllIIlllII(lIIIIllllIlIIllI(this.temperature, 1.0))) {
            tempCategory = TempCategory.MEDIUM;
            "".length();
            if (((0x58 ^ 0x6F) & ~(0x8 ^ 0x3F)) >= (0x10 ^ 0x14)) {
                return null;
            }
        }
        else {
            tempCategory = TempCategory.WARM;
        }
        return tempCategory;
    }
    
    private static boolean lIIIIllllIIllIll(final int llllllllllllIlllIlllIIlIIIIlIIll) {
        return llllllllllllIlllIlllIIlIIIIlIIll > 0;
    }
    
    public int getSkyColorByTemp(float llllllllllllIlllIlllIIllIIIllllI) {
        llllllllllllIlllIlllIIllIIIllllI /= 3.0f;
        llllllllllllIlllIlllIIllIIIllllI = MathHelper.clamp_float((float)llllllllllllIlllIlllIIllIIIllllI, -1.0f, 1.0f);
        return MathHelper.func_181758_c((float)(0.62222224f - llllllllllllIlllIlllIIllIIIllllI * 0.05f), (float)(0.5f + llllllllllllIlllIlllIIllIIIllllI * 0.1f), 1.0f);
    }
    
    private static boolean lIIIIllllIlIIlll(final int llllllllllllIlllIlllIIlIIIIllIIl) {
        return llllllllllllIlllIlllIIlIIIIllIIl >= 0;
    }
    
    protected BiomeGenBase createMutatedBiome(final int llllllllllllIlllIlllIIlIlIIIIlll) {
        return new BiomeGenMutated(llllllllllllIlllIlllIIlIlIIIIlll, this);
    }
    
    private static int lIIIIllllIlIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public static BiomeGenBase getBiomeFromBiomeList(final int llllllllllllIlllIlllIIlIIlllIlII, final BiomeGenBase llllllllllllIlllIlllIIlIIlllIIII) {
        if (lIIIIllllIlIIlll(llllllllllllIlllIlllIIlIIlllIlII) && lIIIIllllIlIIIIl(llllllllllllIlllIlllIIlIIlllIlII, BiomeGenBase.biomeList.length)) {
            final BiomeGenBase llllllllllllIlllIlllIIlIIlllIIlI = BiomeGenBase.biomeList[llllllllllllIlllIlllIIlIIlllIlII];
            BiomeGenBase biomeGenBase;
            if (lIIIIllllIlIIlIl(llllllllllllIlllIlllIIlIIlllIIlI)) {
                biomeGenBase = llllllllllllIlllIlllIIlIIlllIIII;
                "".length();
                if (((0xEA ^ 0x98 ^ (0xE8 ^ 0xC0)) & (146 + 233 - 348 + 206 ^ 62 + 60 - 35 + 96 ^ -" ".length())) > 0) {
                    return null;
                }
            }
            else {
                biomeGenBase = llllllllllllIlllIlllIIlIIlllIIlI;
            }
            return biomeGenBase;
        }
        BiomeGenBase.logger.warn(String.valueOf(new StringBuilder(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[95]]).append(llllllllllllIlllIlllIIlIIlllIlII).append(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[96]])));
        return BiomeGenBase.ocean;
    }
    
    private static boolean lIIIIllllIlIIlIl(final Object llllllllllllIlllIlllIIlIIIIlllll) {
        return llllllllllllIlllIlllIIlIIIIlllll == null;
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$entity$EnumCreatureType() {
        final int[] $switch_TABLE$net$minecraft$entity$EnumCreatureType = BiomeGenBase.$SWITCH_TABLE$net$minecraft$entity$EnumCreatureType;
        if (lIIIIllllIIlIlIl($switch_TABLE$net$minecraft$entity$EnumCreatureType)) {
            return $switch_TABLE$net$minecraft$entity$EnumCreatureType;
        }
        "".length();
        final long llllllllllllIlllIlllIIlIIllIllIl = (Object)new int[EnumCreatureType.values().length];
        try {
            llllllllllllIlllIlllIIlIIllIllIl[EnumCreatureType.AMBIENT.ordinal()] = BiomeGenBase.llIIIIlIIIlIll[7];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            llllllllllllIlllIlllIIlIIllIllIl[EnumCreatureType.CREATURE.ordinal()] = BiomeGenBase.llIIIIlIIIlIll[5];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            llllllllllllIlllIlllIIlIIllIllIl[EnumCreatureType.MONSTER.ordinal()] = BiomeGenBase.llIIIIlIIIlIll[3];
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            llllllllllllIlllIlllIIlIIllIllIl[EnumCreatureType.WATER_CREATURE.ordinal()] = BiomeGenBase.llIIIIlIIIlIll[9];
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        return BiomeGenBase.$SWITCH_TABLE$net$minecraft$entity$EnumCreatureType = (int[])(Object)llllllllllllIlllIlllIIlIIllIllIl;
    }
    
    public boolean canSpawnLightningBolt() {
        int enableRain;
        if (lIIIIllllIIlIllI(this.isSnowyBiome() ? 1 : 0)) {
            enableRain = BiomeGenBase.llIIIIlIIIlIll[1];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x60 ^ 0x54) & ~(0x38 ^ 0xC)) != 0x0;
            }
        }
        else {
            enableRain = (this.enableRain ? 1 : 0);
        }
        return enableRain != 0;
    }
    
    private static String lIIIIllIllIlIlII(final String llllllllllllIlllIlllIIlIIllIIIll, final String llllllllllllIlllIlllIIlIIllIIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIlllIIlIIllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIIlIIllIIlII.getBytes(StandardCharsets.UTF_8)), BiomeGenBase.llIIIIlIIIlIll[19]), "DES");
            final Cipher llllllllllllIlllIlllIIlIIllIIlll = Cipher.getInstance("DES");
            llllllllllllIlllIlllIIlIIllIIlll.init(BiomeGenBase.llIIIIlIIIlIll[5], llllllllllllIlllIlllIIlIIllIlIII);
            return new String(llllllllllllIlllIlllIIlIIllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIIlIIllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllIIlIIllIIllI) {
            llllllllllllIlllIlllIIlIIllIIllI.printStackTrace();
            return null;
        }
    }
    
    protected BiomeGenBase setFillerBlockMetadata(final int llllllllllllIlllIlllIIllIIlllIIl) {
        this.fillerBlockMetadata = llllllllllllIlllIlllIIllIIlllIIl;
        return this;
    }
    
    private static int lIIIIllllIIllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public final float getFloatRainfall() {
        return this.rainfall;
    }
    
    public boolean isHighHumidity() {
        if (lIIIIllllIIllIll(lIIIIllllIIllllI(this.rainfall, 0.85f))) {
            return BiomeGenBase.llIIIIlIIIlIll[3] != 0;
        }
        return BiomeGenBase.llIIIIlIIIlIll[1] != 0;
    }
    
    protected BiomeGenBase createMutation() {
        return this.createMutatedBiome(this.biomeID + BiomeGenBase.llIIIIlIIIlIll[83]);
    }
    
    protected BiomeGenBase setColor(final int llllllllllllIlllIlllIIllIIllIIll) {
        this.func_150557_a(llllllllllllIlllIlllIIllIIllIIll, (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0));
        "".length();
        return this;
    }
    
    public int getFoliageColorAtPos(final BlockPos llllllllllllIlllIlllIIlIllIlllIl) {
        final double llllllllllllIlllIlllIIlIlllIIIII = MathHelper.clamp_float(this.getFloatTemperature(llllllllllllIlllIlllIIlIllIlllIl), 0.0f, 1.0f);
        final double llllllllllllIlllIlllIIlIllIlllll = MathHelper.clamp_float(this.getFloatRainfall(), 0.0f, 1.0f);
        return ColorizerFoliage.getFoliageColor(llllllllllllIlllIlllIIlIlllIIIII, llllllllllllIlllIlllIIlIllIlllll);
    }
    
    public Class<? extends BiomeGenBase> getBiomeClass() {
        return this.getClass();
    }
    
    public final float getFloatTemperature(final BlockPos llllllllllllIlllIlllIIllIIIIIIII) {
        if (lIIIIllllIIlllll(llllllllllllIlllIlllIIllIIIIIIII.getY(), BiomeGenBase.llIIIIlIIIlIll[92])) {
            final float llllllllllllIlllIlllIIllIIIIIIlI = (float)(BiomeGenBase.temperatureNoise.func_151601_a(llllllllllllIlllIlllIIllIIIIIIII.getX() * 1.0 / 8.0, llllllllllllIlllIlllIIllIIIIIIII.getZ() * 1.0 / 8.0) * 4.0);
            return this.temperature - (llllllllllllIlllIlllIIllIIIIIIlI + llllllllllllIlllIlllIIllIIIIIIII.getY() - 64.0f) * 0.05f / 30.0f;
        }
        return this.temperature;
    }
    
    public boolean getEnableSnow() {
        return this.isSnowyBiome();
    }
    
    protected BiomeGenBase setEnableSnow() {
        this.enableSnow = (BiomeGenBase.llIIIIlIIIlIll[3] != 0);
        return this;
    }
    
    private static boolean lIIIIllllIIlIllI(final int llllllllllllIlllIlllIIlIIIIlllIl) {
        return llllllllllllIlllIlllIIlIIIIlllIl != 0;
    }
    
    public void genTerrainBlocks(final World llllllllllllIlllIlllIIlIllIIllll, final Random llllllllllllIlllIlllIIlIllIIlllI, final ChunkPrimer llllllllllllIlllIlllIIlIllIIIllI, final int llllllllllllIlllIlllIIlIllIIllII, final int llllllllllllIlllIlllIIlIllIIlIll, final double llllllllllllIlllIlllIIlIllIIlIlI) {
        this.generateBiomeTerrain(llllllllllllIlllIlllIIlIllIIllll, llllllllllllIlllIlllIIlIllIIlllI, llllllllllllIlllIlllIIlIllIIIllI, llllllllllllIlllIlllIIlIllIIllII, llllllllllllIlllIlllIIlIllIIlIll, llllllllllllIlllIlllIIlIllIIlIlI);
    }
    
    public List<SpawnListEntry> getSpawnableList(final EnumCreatureType llllllllllllIlllIlllIIllIIIllIlI) {
        switch ($SWITCH_TABLE$net$minecraft$entity$EnumCreatureType()[llllllllllllIlllIlllIIllIIIllIlI.ordinal()]) {
            case 1: {
                return this.spawnableMonsterList;
            }
            case 2: {
                return this.spawnableCreatureList;
            }
            case 4: {
                return this.spawnableWaterCreatureList;
            }
            case 3: {
                return this.spawnableCaveCreatureList;
            }
            default: {
                return Collections.emptyList();
            }
        }
    }
    
    public void decorate(final World llllllllllllIlllIlllIIlIllllIlIl, final Random llllllllllllIlllIlllIIlIllllIlII, final BlockPos llllllllllllIlllIlllIIlIllllIlll) {
        this.theBiomeDecorator.decorate(llllllllllllIlllIlllIIlIllllIlIl, llllllllllllIlllIlllIIlIllllIlII, this, llllllllllllIlllIlllIIlIllllIlll);
    }
    
    private static String lIIIIllIllIlIIIl(String llllllllllllIlllIlllIIlIIlIlIIII, final String llllllllllllIlllIlllIIlIIlIlIlII) {
        llllllllllllIlllIlllIIlIIlIlIIII = new String(Base64.getDecoder().decode(llllllllllllIlllIlllIIlIIlIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlllIIlIIlIlIIll = new StringBuilder();
        final char[] llllllllllllIlllIlllIIlIIlIlIIlI = llllllllllllIlllIlllIIlIIlIlIlII.toCharArray();
        int llllllllllllIlllIlllIIlIIlIlIIIl = BiomeGenBase.llIIIIlIIIlIll[1];
        final float llllllllllllIlllIlllIIlIIlIIlIll = (Object)llllllllllllIlllIlllIIlIIlIlIIII.toCharArray();
        final Exception llllllllllllIlllIlllIIlIIlIIlIlI = (Exception)llllllllllllIlllIlllIIlIIlIIlIll.length;
        double llllllllllllIlllIlllIIlIIlIIlIIl = BiomeGenBase.llIIIIlIIIlIll[1];
        while (lIIIIllllIIlIlll((int)llllllllllllIlllIlllIIlIIlIIlIIl, (int)llllllllllllIlllIlllIIlIIlIIlIlI)) {
            final char llllllllllllIlllIlllIIlIIlIlIllI = llllllllllllIlllIlllIIlIIlIIlIll[llllllllllllIlllIlllIIlIIlIIlIIl];
            llllllllllllIlllIlllIIlIIlIlIIll.append((char)(llllllllllllIlllIlllIIlIIlIlIllI ^ llllllllllllIlllIlllIIlIIlIlIIlI[llllllllllllIlllIlllIIlIIlIlIIIl % llllllllllllIlllIlllIIlIIlIlIIlI.length]));
            "".length();
            ++llllllllllllIlllIlllIIlIIlIlIIIl;
            ++llllllllllllIlllIlllIIlIIlIIlIIl;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllIIlIIlIlIIll);
    }
    
    private static int lIIIIllllIIllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public final int getIntRainfall() {
        return (int)(this.rainfall * 65536.0f);
    }
    
    static {
        lIIIIllllIIlIIll();
        lIIIIllIllIlllll();
        logger = LogManager.getLogger();
        height_Default = new Height(0.1f, 0.2f);
        height_ShallowWaters = new Height(-0.5f, 0.0f);
        height_Oceans = new Height(-1.0f, 0.1f);
        height_DeepOceans = new Height(-1.8f, 0.1f);
        height_LowPlains = new Height(0.125f, 0.05f);
        height_MidPlains = new Height(0.2f, 0.2f);
        height_LowHills = new Height(0.45f, 0.3f);
        height_HighPlateaus = new Height(1.5f, 0.025f);
        height_MidHills = new Height(1.0f, 0.5f);
        height_Shores = new Height(0.0f, 0.025f);
        height_RockyWaters = new Height(0.1f, 0.8f);
        height_LowIslands = new Height(0.2f, 0.3f);
        height_PartiallySubmerged = new Height(-0.2f, 0.1f);
        biomeList = new BiomeGenBase[BiomeGenBase.llIIIIlIIIlIll[0]];
        explorationBiomesList = Sets.newHashSet();
        BIOME_ID_MAP = Maps.newHashMap();
        ocean = new BiomeGenOcean(BiomeGenBase.llIIIIlIIIlIll[1]).setColor(BiomeGenBase.llIIIIlIIIlIll[2]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[1]]).setHeight(BiomeGenBase.height_Oceans);
        plains = new BiomeGenPlains(BiomeGenBase.llIIIIlIIIlIll[3]).setColor(BiomeGenBase.llIIIIlIIIlIll[4]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[3]]);
        desert = new BiomeGenDesert(BiomeGenBase.llIIIIlIIIlIll[5]).setColor(BiomeGenBase.llIIIIlIIIlIll[6]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[5]]).setDisableRain().setTemperatureRainfall(2.0f, 0.0f).setHeight(BiomeGenBase.height_LowPlains);
        extremeHills = new BiomeGenHills(BiomeGenBase.llIIIIlIIIlIll[7], (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[8]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[7]]).setHeight(BiomeGenBase.height_MidHills).setTemperatureRainfall(0.2f, 0.3f);
        forest = new BiomeGenForest(BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[1]).setColor(BiomeGenBase.llIIIIlIIIlIll[10]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[9]]);
        taiga = new BiomeGenTaiga(BiomeGenBase.llIIIIlIIIlIll[11], BiomeGenBase.llIIIIlIIIlIll[1]).setColor(BiomeGenBase.llIIIIlIIIlIll[12]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[11]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[13]).setTemperatureRainfall(0.25f, 0.8f).setHeight(BiomeGenBase.height_MidPlains);
        swampland = new BiomeGenSwamp(BiomeGenBase.llIIIIlIIIlIll[14]).setColor(BiomeGenBase.llIIIIlIIIlIll[15]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[14]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[16]).setHeight(BiomeGenBase.height_PartiallySubmerged).setTemperatureRainfall(0.8f, 0.9f);
        river = new BiomeGenRiver(BiomeGenBase.llIIIIlIIIlIll[17]).setColor(BiomeGenBase.llIIIIlIIIlIll[18]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[17]]).setHeight(BiomeGenBase.height_ShallowWaters);
        hell = new BiomeGenHell(BiomeGenBase.llIIIIlIIIlIll[19]).setColor(BiomeGenBase.llIIIIlIIIlIll[20]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[19]]).setDisableRain().setTemperatureRainfall(2.0f, 0.0f);
        sky = new BiomeGenEnd(BiomeGenBase.llIIIIlIIIlIll[21]).setColor(BiomeGenBase.llIIIIlIIIlIll[22]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[21]]).setDisableRain();
        frozenOcean = new BiomeGenOcean(BiomeGenBase.llIIIIlIIIlIll[23]).setColor(BiomeGenBase.llIIIIlIIIlIll[24]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[23]]).setEnableSnow().setHeight(BiomeGenBase.height_Oceans).setTemperatureRainfall(0.0f, 0.5f);
        frozenRiver = new BiomeGenRiver(BiomeGenBase.llIIIIlIIIlIll[25]).setColor(BiomeGenBase.llIIIIlIIIlIll[26]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[25]]).setEnableSnow().setHeight(BiomeGenBase.height_ShallowWaters).setTemperatureRainfall(0.0f, 0.5f);
        icePlains = new BiomeGenSnow(BiomeGenBase.llIIIIlIIIlIll[27], (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[28]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[27]]).setEnableSnow().setTemperatureRainfall(0.0f, 0.5f).setHeight(BiomeGenBase.height_LowPlains);
        iceMountains = new BiomeGenSnow(BiomeGenBase.llIIIIlIIIlIll[29], (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[30]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[29]]).setEnableSnow().setHeight(BiomeGenBase.height_LowHills).setTemperatureRainfall(0.0f, 0.5f);
        mushroomIsland = new BiomeGenMushroomIsland(BiomeGenBase.llIIIIlIIIlIll[31]).setColor(BiomeGenBase.llIIIIlIIIlIll[32]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[31]]).setTemperatureRainfall(0.9f, 1.0f).setHeight(BiomeGenBase.height_LowIslands);
        mushroomIslandShore = new BiomeGenMushroomIsland(BiomeGenBase.llIIIIlIIIlIll[33]).setColor(BiomeGenBase.llIIIIlIIIlIll[34]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[33]]).setTemperatureRainfall(0.9f, 1.0f).setHeight(BiomeGenBase.height_Shores);
        beach = new BiomeGenBeach(BiomeGenBase.llIIIIlIIIlIll[35]).setColor(BiomeGenBase.llIIIIlIIIlIll[36]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[35]]).setTemperatureRainfall(0.8f, 0.4f).setHeight(BiomeGenBase.height_Shores);
        desertHills = new BiomeGenDesert(BiomeGenBase.llIIIIlIIIlIll[37]).setColor(BiomeGenBase.llIIIIlIIIlIll[38]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[37]]).setDisableRain().setTemperatureRainfall(2.0f, 0.0f).setHeight(BiomeGenBase.height_LowHills);
        forestHills = new BiomeGenForest(BiomeGenBase.llIIIIlIIIlIll[39], BiomeGenBase.llIIIIlIIIlIll[1]).setColor(BiomeGenBase.llIIIIlIIIlIll[40]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[39]]).setHeight(BiomeGenBase.height_LowHills);
        taigaHills = new BiomeGenTaiga(BiomeGenBase.llIIIIlIIIlIll[41], BiomeGenBase.llIIIIlIIIlIll[1]).setColor(BiomeGenBase.llIIIIlIIIlIll[42]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[41]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[13]).setTemperatureRainfall(0.25f, 0.8f).setHeight(BiomeGenBase.height_LowHills);
        extremeHillsEdge = new BiomeGenHills(BiomeGenBase.llIIIIlIIIlIll[43], (boolean)(BiomeGenBase.llIIIIlIIIlIll[3] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[44]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[43]]).setHeight(BiomeGenBase.height_MidHills.attenuate()).setTemperatureRainfall(0.2f, 0.3f);
        jungle = new BiomeGenJungle(BiomeGenBase.llIIIIlIIIlIll[45], (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[46]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[45]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[46]).setTemperatureRainfall(0.95f, 0.9f);
        jungleHills = new BiomeGenJungle(BiomeGenBase.llIIIIlIIIlIll[47], (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[48]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[47]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[46]).setTemperatureRainfall(0.95f, 0.9f).setHeight(BiomeGenBase.height_LowHills);
        jungleEdge = new BiomeGenJungle(BiomeGenBase.llIIIIlIIIlIll[49], (boolean)(BiomeGenBase.llIIIIlIIIlIll[3] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[50]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[49]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[46]).setTemperatureRainfall(0.95f, 0.8f);
        deepOcean = new BiomeGenOcean(BiomeGenBase.llIIIIlIIIlIll[51]).setColor(BiomeGenBase.llIIIIlIIIlIll[52]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[51]]).setHeight(BiomeGenBase.height_DeepOceans);
        stoneBeach = new BiomeGenStoneBeach(BiomeGenBase.llIIIIlIIIlIll[53]).setColor(BiomeGenBase.llIIIIlIIIlIll[54]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[53]]).setTemperatureRainfall(0.2f, 0.3f).setHeight(BiomeGenBase.height_RockyWaters);
        coldBeach = new BiomeGenBeach(BiomeGenBase.llIIIIlIIIlIll[55]).setColor(BiomeGenBase.llIIIIlIIIlIll[56]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[55]]).setTemperatureRainfall(0.05f, 0.3f).setHeight(BiomeGenBase.height_Shores).setEnableSnow();
        birchForest = new BiomeGenForest(BiomeGenBase.llIIIIlIIIlIll[57], BiomeGenBase.llIIIIlIIIlIll[5]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[57]]).setColor(BiomeGenBase.llIIIIlIIIlIll[58]);
        birchForestHills = new BiomeGenForest(BiomeGenBase.llIIIIlIIIlIll[59], BiomeGenBase.llIIIIlIIIlIll[5]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[59]]).setColor(BiomeGenBase.llIIIIlIIIlIll[60]).setHeight(BiomeGenBase.height_LowHills);
        roofedForest = new BiomeGenForest(BiomeGenBase.llIIIIlIIIlIll[61], BiomeGenBase.llIIIIlIIIlIll[7]).setColor(BiomeGenBase.llIIIIlIIIlIll[62]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[61]]);
        coldTaiga = new BiomeGenTaiga(BiomeGenBase.llIIIIlIIIlIll[63], BiomeGenBase.llIIIIlIIIlIll[1]).setColor(BiomeGenBase.llIIIIlIIIlIll[64]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[63]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[13]).setEnableSnow().setTemperatureRainfall(-0.5f, 0.4f).setHeight(BiomeGenBase.height_MidPlains).func_150563_c(BiomeGenBase.llIIIIlIIIlIll[28]);
        coldTaigaHills = new BiomeGenTaiga(BiomeGenBase.llIIIIlIIIlIll[65], BiomeGenBase.llIIIIlIIIlIll[1]).setColor(BiomeGenBase.llIIIIlIIIlIll[66]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[65]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[13]).setEnableSnow().setTemperatureRainfall(-0.5f, 0.4f).setHeight(BiomeGenBase.height_LowHills).func_150563_c(BiomeGenBase.llIIIIlIIIlIll[28]);
        megaTaiga = new BiomeGenTaiga(BiomeGenBase.llIIIIlIIIlIll[67], BiomeGenBase.llIIIIlIIIlIll[3]).setColor(BiomeGenBase.llIIIIlIIIlIll[68]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[67]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[13]).setTemperatureRainfall(0.3f, 0.8f).setHeight(BiomeGenBase.height_MidPlains);
        megaTaigaHills = new BiomeGenTaiga(BiomeGenBase.llIIIIlIIIlIll[69], BiomeGenBase.llIIIIlIIIlIll[3]).setColor(BiomeGenBase.llIIIIlIIIlIll[70]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[69]]).setFillerBlockMetadata(BiomeGenBase.llIIIIlIIIlIll[13]).setTemperatureRainfall(0.3f, 0.8f).setHeight(BiomeGenBase.height_LowHills);
        extremeHillsPlus = new BiomeGenHills(BiomeGenBase.llIIIIlIIIlIll[71], (boolean)(BiomeGenBase.llIIIIlIIIlIll[3] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[72]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[71]]).setHeight(BiomeGenBase.height_MidHills).setTemperatureRainfall(0.2f, 0.3f);
        savanna = new BiomeGenSavanna(BiomeGenBase.llIIIIlIIIlIll[73]).setColor(BiomeGenBase.llIIIIlIIIlIll[74]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[73]]).setTemperatureRainfall(1.2f, 0.0f).setDisableRain().setHeight(BiomeGenBase.height_LowPlains);
        savannaPlateau = new BiomeGenSavanna(BiomeGenBase.llIIIIlIIIlIll[75]).setColor(BiomeGenBase.llIIIIlIIIlIll[76]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[75]]).setTemperatureRainfall(1.0f, 0.0f).setDisableRain().setHeight(BiomeGenBase.height_HighPlateaus);
        mesa = new BiomeGenMesa(BiomeGenBase.llIIIIlIIIlIll[77], (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0), (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[78]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[77]]);
        mesaPlateau_F = new BiomeGenMesa(BiomeGenBase.llIIIIlIIIlIll[79], (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0), (boolean)(BiomeGenBase.llIIIIlIIIlIll[3] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[80]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[79]]).setHeight(BiomeGenBase.height_HighPlateaus);
        mesaPlateau = new BiomeGenMesa(BiomeGenBase.llIIIIlIIIlIll[81], (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0), (boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0)).setColor(BiomeGenBase.llIIIIlIIIlIll[82]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[81]]).setHeight(BiomeGenBase.height_HighPlateaus);
        field_180279_ad = BiomeGenBase.ocean;
        BiomeGenBase.plains.createMutation();
        "".length();
        BiomeGenBase.desert.createMutation();
        "".length();
        BiomeGenBase.forest.createMutation();
        "".length();
        BiomeGenBase.taiga.createMutation();
        "".length();
        BiomeGenBase.swampland.createMutation();
        "".length();
        BiomeGenBase.icePlains.createMutation();
        "".length();
        BiomeGenBase.jungle.createMutation();
        "".length();
        BiomeGenBase.jungleEdge.createMutation();
        "".length();
        BiomeGenBase.coldTaiga.createMutation();
        "".length();
        BiomeGenBase.savanna.createMutation();
        "".length();
        BiomeGenBase.savannaPlateau.createMutation();
        "".length();
        BiomeGenBase.mesa.createMutation();
        "".length();
        BiomeGenBase.mesaPlateau_F.createMutation();
        "".length();
        BiomeGenBase.mesaPlateau.createMutation();
        "".length();
        BiomeGenBase.birchForest.createMutation();
        "".length();
        BiomeGenBase.birchForestHills.createMutation();
        "".length();
        BiomeGenBase.roofedForest.createMutation();
        "".length();
        BiomeGenBase.megaTaiga.createMutation();
        "".length();
        BiomeGenBase.extremeHills.createMutation();
        "".length();
        BiomeGenBase.extremeHillsPlus.createMutation();
        "".length();
        BiomeGenBase.megaTaiga.createMutatedBiome(BiomeGenBase.megaTaigaHills.biomeID + BiomeGenBase.llIIIIlIIIlIll[83]).setBiomeName(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[84]]);
        "".length();
        final String llllllllllllIlllIlllIIllIllIllII;
        final char llllllllllllIlllIlllIIllIllIllIl = (char)((BiomeGenBase[])(Object)(llllllllllllIlllIlllIIllIllIllII = (String)(Object)BiomeGenBase.biomeList)).length;
        String llllllllllllIlllIlllIIllIllIlllI = (String)BiomeGenBase.llIIIIlIIIlIll[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIIIllllIIllIII((int)llllllllllllIlllIlllIIllIllIlllI, llllllllllllIlllIlllIIllIllIllIl)) {
            final BiomeGenBase llllllllllllIlllIlllIIllIlllIIII = llllllllllllIlllIlllIIllIllIllII[llllllllllllIlllIlllIIllIllIlllI];
            if (lIIIIllllIIlIlIl(llllllllllllIlllIlllIIllIlllIIII)) {
                if (lIIIIllllIIlIllI(BiomeGenBase.BIOME_ID_MAP.containsKey(llllllllllllIlllIlllIIllIlllIIII.biomeName) ? 1 : 0)) {
                    throw new Error(String.valueOf(new StringBuilder(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[85]]).append(llllllllllllIlllIlllIIllIlllIIII.biomeName).append(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[86]]).append(BiomeGenBase.BIOME_ID_MAP.get(llllllllllllIlllIlllIIllIlllIIII.biomeName).biomeID).append(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[87]]).append(llllllllllllIlllIlllIIllIlllIIII.biomeID)));
                }
                BiomeGenBase.BIOME_ID_MAP.put(llllllllllllIlllIlllIIllIlllIIII.biomeName, llllllllllllIlllIlllIIllIlllIIII);
                "".length();
                if (lIIIIllllIIlIlll(llllllllllllIlllIlllIIllIlllIIII.biomeID, BiomeGenBase.llIIIIlIIIlIll[83])) {
                    BiomeGenBase.explorationBiomesList.add(llllllllllllIlllIlllIIllIlllIIII);
                    "".length();
                }
            }
            ++llllllllllllIlllIlllIIllIllIlllI;
        }
        BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.hell);
        "".length();
        BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.sky);
        "".length();
        BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.frozenOcean);
        "".length();
        BiomeGenBase.explorationBiomesList.remove(BiomeGenBase.extremeHillsEdge);
        "".length();
        temperatureNoise = new NoiseGeneratorPerlin(new Random(1234L), BiomeGenBase.llIIIIlIIIlIll[3]);
        GRASS_COLOR_NOISE = new NoiseGeneratorPerlin(new Random(2345L), BiomeGenBase.llIIIIlIIIlIll[3]);
        DOUBLE_PLANT_GENERATOR = new WorldGenDoublePlant();
    }
    
    public float getSpawningChance() {
        return 0.1f;
    }
    
    protected BiomeGenBase setTemperatureRainfall(final float llllllllllllIlllIlllIIllIlIlllIl, final float llllllllllllIlllIlllIIllIlIlllll) {
        if (lIIIIllllIIllIll(lIIIIllllIIllIIl(llllllllllllIlllIlllIIllIlIlllIl, 0.1f)) && lIIIIllllIIlllII(lIIIIllllIIllIlI(llllllllllllIlllIlllIIllIlIlllIl, 0.2f))) {
            throw new IllegalArgumentException(BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[90]]);
        }
        this.temperature = llllllllllllIlllIlllIIllIlIlllIl;
        this.rainfall = llllllllllllIlllIlllIIllIlIlllll;
        return this;
    }
    
    private static String lIIIIllIllIlIIlI(final String llllllllllllIlllIlllIIlIIIlllllI, final String llllllllllllIlllIlllIIlIIIllllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIlllIIlIIlIIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlllIIlIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlllIIlIIlIIIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlllIIlIIlIIIIlI.init(BiomeGenBase.llIIIIlIIIlIll[5], llllllllllllIlllIlllIIlIIlIIIIll);
            return new String(llllllllllllIlllIlllIIlIIlIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlllIIlIIIlllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlllIIlIIlIIIIIl) {
            llllllllllllIlllIlllIIlIIlIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIllllIIlllIl(final int llllllllllllIlllIlllIIlIIIIllIll) {
        return llllllllllllIlllIlllIIlIIIIllIll == 0;
    }
    
    private static int lIIIIllllIIllIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static void lIIIIllllIIlIIll() {
        (llIIIIlIIIlIll = new int[98])[0] = (0xFFFFEF2A & 0x11D5);
        BiomeGenBase.llIIIIlIIIlIll[1] = ((0xD9 ^ 0x86) & ~(0x36 ^ 0x69));
        BiomeGenBase.llIIIIlIIIlIll[2] = (0xAF ^ 0xC5 ^ (0x0 ^ 0x1A));
        BiomeGenBase.llIIIIlIIIlIll[3] = " ".length();
        BiomeGenBase.llIIIIlIIIlIll[4] = (-(0xFFFFDC97 & 0x2B6F) & (0xFFFFFF7F & 0x8DBBE6));
        BiomeGenBase.llIIIIlIIIlIll[5] = "  ".length();
        BiomeGenBase.llIIIIlIIIlIll[6] = (-(41 + 66 - 86 + 140) & (0xFFFF96BF & 0xFAFDF8));
        BiomeGenBase.llIIIIlIIIlIll[7] = "   ".length();
        BiomeGenBase.llIIIIlIIIlIll[8] = (0xFFFFF1F2 & 0x606E6D);
        BiomeGenBase.llIIIIlIIIlIll[9] = (0xB9 ^ 0xBD);
        BiomeGenBase.llIIIIlIIIlIll[10] = (0xFFFFFFFB & 0x56625);
        BiomeGenBase.llIIIIlIIIlIll[11] = (0x23 ^ 0x26);
        BiomeGenBase.llIIIIlIIIlIll[12] = (-(0xFFFFFF07 & 0x18FF) & (0xFFFFFF5F & 0xB7EFF));
        BiomeGenBase.llIIIIlIIIlIll[13] = (-(0xFFFFFFCF & 0x47F) & (0xFFFFFF7F & 0x4EBEFF));
        BiomeGenBase.llIIIIlIIIlIll[14] = (0x11 ^ 0x53 ^ (0x69 ^ 0x2D));
        BiomeGenBase.llIIIIlIIIlIll[15] = (0xFFFFFBFE & 0x7FDB3);
        BiomeGenBase.llIIIIlIIIlIll[16] = (0xFFFFAFCB & 0x8BFF7C);
        BiomeGenBase.llIIIIlIIIlIll[17] = (0x1B ^ 0x52 ^ (0x72 ^ 0x3C));
        BiomeGenBase.llIIIIlIIIlIll[18] = 94 + 68 + 40 + 53;
        BiomeGenBase.llIIIIlIIIlIll[19] = (0x23 ^ 0x75 ^ (0x11 ^ 0x4F));
        BiomeGenBase.llIIIIlIIIlIll[20] = (-(0xFFFFF77D & 0x59BB) & (0xFFFFF538 & 0xFF5BFF));
        BiomeGenBase.llIIIIlIIIlIll[21] = (0xCA ^ 0xC3);
        BiomeGenBase.llIIIIlIIIlIll[22] = (-(0xFFFFD2F1 & 0x6D0F) & (0xFFFFD2FF & 0x80EDFF));
        BiomeGenBase.llIIIIlIIIlIll[23] = (67 + 71 - 20 + 28 ^ 39 + 55 - 33 + 91);
        BiomeGenBase.llIIIIlIIIlIll[24] = (-(0xFFFFEEF2 & 0x5F5F) & (0xFFFFFFF9 & 0x90DEF7));
        BiomeGenBase.llIIIIlIIIlIll[25] = (0x11 ^ 0x1E ^ (0x49 ^ 0x4D));
        BiomeGenBase.llIIIIlIIIlIll[26] = (-(0xFFFFF6CB & 0x5B35) & (-1 & 0xA0F2FF));
        BiomeGenBase.llIIIIlIIIlIll[27] = (0x43 ^ 0x4F);
        BiomeGenBase.llIIIIlIIIlIll[28] = (-" ".length() & (-1 & 0xFFFFFF));
        BiomeGenBase.llIIIIlIIIlIll[29] = (0x47 ^ 0x3D ^ (0x48 ^ 0x3F));
        BiomeGenBase.llIIIIlIIIlIll[30] = (0xFFFFF7E5 & 0xA0A8BA);
        BiomeGenBase.llIIIIlIIIlIll[31] = (0x6D ^ 0x63);
        BiomeGenBase.llIIIIlIIIlIll[32] = (0xFFFF86FF & 0xFF79FF);
        BiomeGenBase.llIIIIlIIIlIll[33] = (95 + 20 + 4 + 16 ^ 71 + 63 - 118 + 120);
        BiomeGenBase.llIIIIlIIIlIll[34] = (-(0xFFFFFDAF & 0x6E51) & (-1 & 0xA06CFF));
        BiomeGenBase.llIIIIlIIIlIll[35] = (0x72 ^ 0x62);
        BiomeGenBase.llIIIIlIIIlIll[36] = (0xFFFFFEFD & 0xFADF57);
        BiomeGenBase.llIIIIlIIIlIll[37] = (0x93 ^ 0x82);
        BiomeGenBase.llIIIIlIIIlIll[38] = (0xFFFFFFB2 & 0xD25F5F);
        BiomeGenBase.llIIIIlIIIlIll[39] = (23 + 58 - 72 + 121 ^ 134 + 92 - 135 + 53);
        BiomeGenBase.llIIIIlIIIlIll[40] = (0xFFFFF55F & 0x225FBC);
        BiomeGenBase.llIIIIlIIIlIll[41] = (0xA7 ^ 0xB4);
        BiomeGenBase.llIIIIlIIIlIll[42] = (0xFFFFF93F & 0x163FF3);
        BiomeGenBase.llIIIIlIIIlIll[43] = (0x3A ^ 0x15 ^ (0x75 ^ 0x4E));
        BiomeGenBase.llIIIIlIIIlIll[44] = (0xFFFFF9FF & 0x727E9A);
        BiomeGenBase.llIIIIlIIIlIll[45] = (0x51 ^ 0x44);
        BiomeGenBase.llIIIIlIIIlIll[46] = (0xFFFFFFED & 0x537B1B);
        BiomeGenBase.llIIIIlIIIlIll[47] = (104 + 111 - 65 + 20 ^ 63 + 128 - 17 + 14);
        BiomeGenBase.llIIIIlIIIlIll[48] = (0xFFFFEBBD & 0x2C5647);
        BiomeGenBase.llIIIIlIIIlIll[49] = (160 + 66 - 113 + 71 ^ 42 + 60 - 1 + 74);
        BiomeGenBase.llIIIIlIIIlIll[50] = (-(0xFFFFF95F & 0x36E1) & (0xFFFFFFD7 & 0x62BB7F));
        BiomeGenBase.llIIIIlIIIlIll[51] = (0x99 ^ 0x81);
        BiomeGenBase.llIIIIlIIIlIll[52] = (72 + 153 - 179 + 118 ^ 42 + 64 - 11 + 53);
        BiomeGenBase.llIIIIlIIIlIll[53] = (0x8E ^ 0x97);
        BiomeGenBase.llIIIIlIIIlIll[54] = (-(0xFFFFBCF9 & 0x5F17) & (0xFFFFBFB4 & 0xA2FEDF));
        BiomeGenBase.llIIIIlIIIlIll[55] = (0x55 ^ 0x6 ^ (0x23 ^ 0x6A));
        BiomeGenBase.llIIIIlIIIlIll[56] = (-(0xFFFFC3FF & 0x3E04) & (0xFFFFF6F7 & 0xFAFBCB));
        BiomeGenBase.llIIIIlIIIlIll[57] = (0x91 ^ 0x8A);
        BiomeGenBase.llIIIIlIIIlIll[58] = (0xFFFFFEDF & 0x307564);
        BiomeGenBase.llIIIIlIIIlIll[59] = (0xA8 ^ 0xB4);
        BiomeGenBase.llIIIIlIIIlIll[60] = (0xFFFFFFB3 & 0x1F5F7E);
        BiomeGenBase.llIIIIlIIIlIll[61] = (0xA8 ^ 0xB5);
        BiomeGenBase.llIIIIlIIIlIll[62] = (0xFFFFF9DF & 0x40573A);
        BiomeGenBase.llIIIIlIIIlIll[63] = (0x8A ^ 0x94);
        BiomeGenBase.llIIIIlIIIlIll[64] = (0xFFFFDFEB & 0x31755E);
        BiomeGenBase.llIIIIlIIIlIll[65] = (0x7F ^ 0x60);
        BiomeGenBase.llIIIIlIIIlIll[66] = (-(0xFFFFE59D & 0x5A6B) & (0xFFFFFF7F & 0x247FBE));
        BiomeGenBase.llIIIIlIIIlIll[67] = (0x6B ^ 0x48 ^ "   ".length());
        BiomeGenBase.llIIIIlIIIlIll[68] = (0xFFFFF6D3 & 0x596F7D);
        BiomeGenBase.llIIIIlIIIlIll[69] = (0x2E ^ 0x2 ^ (0x4D ^ 0x40));
        BiomeGenBase.llIIIIlIIIlIll[70] = (-(0xFFFF9C1F & 0x73E2) & (0xFFFFDF7F & 0x457FBF));
        BiomeGenBase.llIIIIlIIIlIll[71] = (0x5 ^ 0x27);
        BiomeGenBase.llIIIIlIIIlIll[72] = (-(0xFFFF9FAD & 0x675B) & (0xFFFFFFFB & 0x50775C));
        BiomeGenBase.llIIIIlIIIlIll[73] = (0x9C ^ 0xBF);
        BiomeGenBase.llIIIIlIIIlIll[74] = (-(0xFFFFD5EF & 0x6F31) & (-1 & 0xBDF77F));
        BiomeGenBase.llIIIIlIIIlIll[75] = (0x86 ^ 0xAA ^ (0x2C ^ 0x24));
        BiomeGenBase.llIIIIlIIIlIll[76] = (-(0xFFFFFEEE & 0x639D) & (-1 & 0xA7FFEF));
        BiomeGenBase.llIIIIlIIIlIll[77] = (0xBC ^ 0x82 ^ (0x37 ^ 0x2C));
        BiomeGenBase.llIIIIlIIIlIll[78] = (-(0xFFFFFFAD & 0x387B) & (0xFFFFFDFD & 0xD97F3F));
        BiomeGenBase.llIIIIlIIIlIll[79] = (0x1B ^ 0x3D);
        BiomeGenBase.llIIIIlIIIlIll[80] = (0xFFFFDFED & 0xB0B777);
        BiomeGenBase.llIIIIlIIIlIll[81] = (0x4C ^ 0x6B);
        BiomeGenBase.llIIIIlIIIlIll[82] = (-(0xFFFFEF9D & 0x32FB) & (0xFFFFAFFD & 0xCAFEFF));
        BiomeGenBase.llIIIIlIIIlIll[83] = (0xA3 ^ 0xB8) + (0xA1 ^ 0x8C) - (0x8F ^ 0x81) + (0x48 ^ 0xE);
        BiomeGenBase.llIIIIlIIIlIll[84] = (0x88 ^ 0xA0);
        BiomeGenBase.llIIIIlIIIlIll[85] = (0x7A ^ 0x53);
        BiomeGenBase.llIIIIlIIIlIll[86] = (34 + 153 - 116 + 83 ^ 135 + 39 - 13 + 15);
        BiomeGenBase.llIIIIlIIIlIll[87] = (0xA9 ^ 0x82);
        BiomeGenBase.llIIIIlIIIlIll[88] = (0xFFFFFEBF & 0x4EE171);
        BiomeGenBase.llIIIIlIIIlIll[89] = (0x2B ^ 0x3E ^ (0xFD ^ 0x8C));
        BiomeGenBase.llIIIIlIIIlIll[90] = (0x6E ^ 0x42);
        BiomeGenBase.llIIIIlIIIlIll[91] = (-(0xFFFF8187 & 0x7F79) & (0xFFFFFFFE & 0xFEFFFF));
        BiomeGenBase.llIIIIlIIIlIll[92] = (0x27 ^ 0x67);
        BiomeGenBase.llIIIIlIIIlIll[93] = -" ".length();
        BiomeGenBase.llIIIIlIIIlIll[94] = (0x38 ^ 0x1F ^ (0xA7 ^ 0xBF));
        BiomeGenBase.llIIIIlIIIlIll[95] = (0xEB ^ 0xC6);
        BiomeGenBase.llIIIIlIIIlIll[96] = (0xAF ^ 0x81);
        BiomeGenBase.llIIIIlIIIlIll[97] = (0xC0 ^ 0xAD ^ (0xDE ^ 0x9C));
    }
    
    protected BiomeDecorator createBiomeDecorator() {
        return new BiomeDecorator();
    }
    
    public WorldGenAbstractTree genBigTreeChance(final Random llllllllllllIlllIlllIIllIlIIllll) {
        WorldGenAbstractTree worldGenAbstractTree;
        if (lIIIIllllIIlllIl(llllllllllllIlllIlllIIllIlIIllll.nextInt(BiomeGenBase.llIIIIlIIIlIll[23]))) {
            worldGenAbstractTree = this.worldGeneratorBigTree;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        else {
            worldGenAbstractTree = this.worldGeneratorTrees;
        }
        return worldGenAbstractTree;
    }
    
    protected final BiomeGenBase setHeight(final Height llllllllllllIlllIlllIIllIlIllIII) {
        this.minHeight = llllllllllllIlllIlllIIllIlIllIII.rootHeight;
        this.maxHeight = llllllllllllIlllIlllIIllIlIllIII.variation;
        return this;
    }
    
    private static void lIIIIllIllIlllll() {
        (llIIIIIIlIIIIl = new String[BiomeGenBase.llIIIIlIIIlIll[97]])[BiomeGenBase.llIIIIlIIIlIll[1]] = lIIIIllIllIlIIIl("GRMMLzc=", "VpiNY");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[3]] = lIIIIllIllIlIIIl("Cj00Gjop", "ZQUsT");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[5]] = lIIIIllIllIlIIlI("3C2M0d7kDYY=", "EkZtx");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[7]] = lIIIIllIllIlIIlI("UftDYJ6gJvHTVHkZRg2C3w==", "hcCYQ");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[9]] = lIIIIllIllIlIIIl("HhwqKjws", "XsXOO");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[11]] = lIIIIllIllIlIIlI("3bRP5gbcmV8=", "YejSL");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[14]] = lIIIIllIllIlIIIl("ICMgJSIfNS8s", "sTAHR");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[17]] = lIIIIllIllIlIlII("KCZebB2BmFg=", "xOZwo");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[19]] = lIIIIllIllIlIlII("oquILJrprRo=", "gDTJl");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[21]] = lIIIIllIllIlIlII("1NAsXsrt/zI=", "XtFDE");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[23]] = lIIIIllIllIlIIIl("JRklOCgNJCknLA0=", "ckJBM");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[25]] = lIIIIllIllIlIlII("h34u24nOyROzhjtjD5hh6A==", "cIZTF");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[27]] = lIIIIllIllIlIlII("AHH03V+IuCN8Am8uFydCrQ==", "gRJpQ");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[29]] = lIIIIllIllIlIIlI("WwsPVha4hbtq4xeM8zOMKQ==", "RKxNb");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[31]] = lIIIIllIllIlIlII("TEHYnmrrJLC8t7hv13bBSA==", "Xqpyg");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[33]] = lIIIIllIllIlIIlI("R4ue1F65ciS3yX7e41gEgMm+ldrbkGAO", "CYLng");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[35]] = lIIIIllIllIlIlII("oWeRPuUqsJ4=", "IplbD");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[37]] = lIIIIllIllIlIIlI("fHNixQgaayc6bkDfCu4PgQ==", "mOvqj");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[39]] = lIIIIllIllIlIIIl("BSQ/Kwc3AyQiGDA=", "CKMNt");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[41]] = lIIIIllIllIlIIIl("FjQ9MhcKPDg5BQ==", "BUTUv");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[43]] = lIIIIllIllIlIIIl("ETkjOxI5JHcBHjgtJGkyMCYy", "TAWIw");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[45]] = lIIIIllIllIlIlII("mhE3TEnynhw=", "Nirbw");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[47]] = lIIIIllIllIlIlII("fkEbIpqNTzrMY6pLaP/cTA==", "mLlcp");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[49]] = lIIIIllIllIlIlII("wL7A1bRh4bG615+OHd7Tkw==", "LmBqQ");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[51]] = lIIIIllIllIlIIlI("OpFy+gWzjnsKz7jDJL+jBQ==", "HVBAS");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[53]] = lIIIIllIllIlIIlI("a/5+E55EdxTZIpyxJVeERg==", "UjMNB");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[55]] = lIIIIllIllIlIIlI("etc/XVY6HKSHhdSQvgpQ0g==", "LBEVU");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[57]] = lIIIIllIllIlIIlI("ULJDoFkp9TjTBeM4z+rRww==", "AYJac");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[59]] = lIIIIllIllIlIIIl("NwwKCjBVIxcbPQYRWCExGQkL", "uexiX");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[61]] = lIIIIllIllIlIIlI("Sm5KRDGLisEIkAyvdxlRgw==", "dsfWi");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[63]] = lIIIIllIllIlIlII("IIsCWcjhaA+ICp0FRDtEoA==", "DmbkA");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[65]] = lIIIIllIllIlIIlI("hzF2XZNYga3y6XMv56ffFTDYgp/ezAfw", "YnCIU");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[67]] = lIIIIllIllIlIIlI("HLDfBv3dOF28iZZVN4ovrA==", "bpMim");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[69]] = lIIIIllIllIlIIlI("TE55+AjfT4pmEMJqmShtTid7hBD11ncv", "BxXNk");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[71]] = lIIIIllIllIlIIIl("FRIAFzE9D1QtPTwGB04=", "PjteT");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[73]] = lIIIIllIllIlIIIl("EiQ7FCovJA==", "AEMuD");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[75]] = lIIIIllIllIlIlII("sJ745Iq/Hv5Ngu9xeAnWyQ==", "iHgBw");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[77]] = lIIIIllIllIlIlII("JDoVj7uqNbk=", "ZstRv");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[79]] = lIIIIllIllIlIIIl("HjI8ImoDOy43LzIibwU=", "SWOCJ");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[81]] = lIIIIllIllIlIlII("wZH18TI+hHIKgmkJBBKAwQ==", "ZzPRK");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[84]] = lIIIIllIllIlIlII("E394EN9vN2m70k25fTJtzYngtzV0QJx2", "fbYhU");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[85]] = lIIIIllIllIlIlII("gXxCUp/+8kA=", "StabK");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[86]] = lIIIIllIllIlIlII("dR7gV0p6X9UIrUKz640LeZqAPyL4AfYYDpTUv3wIOMw=", "maPoe");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[87]] = lIIIIllIllIlIIlI("BzRJZCLgiwY=", "xASMB");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[90]] = lIIIIllIllIlIlII("Y2C1qaZ+66UVhmwk8r19Q+VTPOp/7yZmpm38GkEOfOPH+I9JS/SZIYOCR49DbLOFGrYyx76cAcFlk9OSuE1T0aZIi2TQ6lYk", "EUuFW");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[95]] = lIIIIllIllIlIlII("ia9H7UIXnb78YO6Rzf5qN1JKOwZFNqsFB/8cIwuXtm0=", "VnrvW");
        BiomeGenBase.llIIIIIIlIIIIl[BiomeGenBase.llIIIIlIIIlIll[96]] = lIIIIllIllIlIIlI("gb6522tIEMSc+QzV3icKVn1o2CZ4OG5cHUBQQ+nZRFw=", "zcqik");
    }
    
    private static boolean lIIIIllllIIlIlll(final int llllllllllllIlllIlllIIlIIIllIIII, final int llllllllllllIlllIlllIIlIIIlIllll) {
        return llllllllllllIlllIlllIIlIIIllIIII < llllllllllllIlllIlllIIlIIIlIllll;
    }
    
    private static boolean lIIIIllllIIlllll(final int llllllllllllIlllIlllIIlIIIlIlIII, final int llllllllllllIlllIlllIIlIIIlIIlll) {
        return llllllllllllIlllIlllIIlIIIlIlIII > llllllllllllIlllIlllIIlIIIlIIlll;
    }
    
    protected BiomeGenBase func_150557_a(final int llllllllllllIlllIlllIIllIIlIIIll, final boolean llllllllllllIlllIlllIIllIIlIIIlI) {
        this.color = llllllllllllIlllIlllIIllIIlIIIll;
        if (lIIIIllllIIlIllI(llllllllllllIlllIlllIIllIIlIIIlI ? 1 : 0)) {
            this.field_150609_ah = (llllllllllllIlllIlllIIllIIlIIIll & BiomeGenBase.llIIIIlIIIlIll[91]) >> BiomeGenBase.llIIIIlIIIlIll[3];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            this.field_150609_ah = llllllllllllIlllIlllIIllIIlIIIll;
        }
        return this;
    }
    
    private static boolean lIIIIllllIlIIIll(final int llllllllllllIlllIlllIIlIIIlllIII, final int llllllllllllIlllIlllIIlIIIllIlll) {
        return llllllllllllIlllIlllIIlIIIlllIII == llllllllllllIlllIlllIIlIIIllIlll;
    }
    
    public WorldGenerator getRandomWorldGenForGrass(final Random llllllllllllIlllIlllIIllIlIIlIll) {
        return new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
    }
    
    private static boolean lIIIIllllIlIIIIl(final int llllllllllllIlllIlllIIlIIIlIllII, final int llllllllllllIlllIlllIIlIIIlIlIll) {
        return llllllllllllIlllIlllIIlIIIlIllII <= llllllllllllIlllIlllIIlIIIlIlIll;
    }
    
    protected BiomeGenBase func_150563_c(final int llllllllllllIlllIlllIIllIIlIllIl) {
        this.field_150609_ah = llllllllllllIlllIlllIIllIIlIllIl;
        return this;
    }
    
    private static boolean lIIIIllllIIllIII(final int llllllllllllIlllIlllIIlIIIllIlII, final int llllllllllllIlllIlllIIlIIIllIIll) {
        return llllllllllllIlllIlllIIlIIIllIlII >= llllllllllllIlllIlllIIlIIIllIIll;
    }
    
    public boolean isSnowyBiome() {
        return this.enableSnow;
    }
    
    public static BiomeGenBase getBiome(final int llllllllllllIlllIlllIIlIIllllIIl) {
        return getBiomeFromBiomeList(llllllllllllIlllIlllIIlIIllllIIl, null);
    }
    
    protected BiomeGenBase(final int llllllllllllIlllIlllIIllIllIIllI) {
        this.topBlock = Blocks.grass.getDefaultState();
        this.fillerBlock = Blocks.dirt.getDefaultState();
        this.fillerBlockMetadata = BiomeGenBase.llIIIIlIIIlIll[88];
        this.minHeight = BiomeGenBase.height_Default.rootHeight;
        this.maxHeight = BiomeGenBase.height_Default.variation;
        this.temperature = 0.5f;
        this.rainfall = 0.5f;
        this.waterColorMultiplier = BiomeGenBase.llIIIIlIIIlIll[28];
        this.spawnableMonsterList = (List<SpawnListEntry>)Lists.newArrayList();
        this.spawnableCreatureList = (List<SpawnListEntry>)Lists.newArrayList();
        this.spawnableWaterCreatureList = (List<SpawnListEntry>)Lists.newArrayList();
        this.spawnableCaveCreatureList = (List<SpawnListEntry>)Lists.newArrayList();
        this.enableRain = (BiomeGenBase.llIIIIlIIIlIll[3] != 0);
        this.worldGeneratorTrees = new WorldGenTrees((boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0));
        this.worldGeneratorBigTree = new WorldGenBigTree((boolean)(BiomeGenBase.llIIIIlIIIlIll[1] != 0));
        this.worldGeneratorSwamp = new WorldGenSwamp();
        this.biomeID = llllllllllllIlllIlllIIllIllIIllI;
        BiomeGenBase.biomeList[llllllllllllIlllIlllIIllIllIIllI] = this;
        this.theBiomeDecorator = this.createBiomeDecorator();
        this.spawnableCreatureList.add(new SpawnListEntry(EntitySheep.class, BiomeGenBase.llIIIIlIIIlIll[27], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityRabbit.class, BiomeGenBase.llIIIIlIIIlIll[23], BiomeGenBase.llIIIIlIIIlIll[7], BiomeGenBase.llIIIIlIIIlIll[7]));
        "".length();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, BiomeGenBase.llIIIIlIIIlIll[23], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, BiomeGenBase.llIIIIlIIIlIll[23], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityCow.class, BiomeGenBase.llIIIIlIIIlIll[19], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableMonsterList.add(new SpawnListEntry(EntitySpider.class, BiomeGenBase.llIIIIlIIIlIll[89], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, BiomeGenBase.llIIIIlIIIlIll[89], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class, BiomeGenBase.llIIIIlIIIlIll[89], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, BiomeGenBase.llIIIIlIIIlIll[89], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableMonsterList.add(new SpawnListEntry(EntitySlime.class, BiomeGenBase.llIIIIlIIIlIll[89], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, BiomeGenBase.llIIIIlIIIlIll[23], BiomeGenBase.llIIIIlIIIlIll[3], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityWitch.class, BiomeGenBase.llIIIIlIIIlIll[11], BiomeGenBase.llIIIIlIIIlIll[3], BiomeGenBase.llIIIIlIIIlIll[3]));
        "".length();
        this.spawnableWaterCreatureList.add(new SpawnListEntry(EntitySquid.class, BiomeGenBase.llIIIIlIIIlIll[23], BiomeGenBase.llIIIIlIIIlIll[9], BiomeGenBase.llIIIIlIIIlIll[9]));
        "".length();
        this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityBat.class, BiomeGenBase.llIIIIlIIIlIll[23], BiomeGenBase.llIIIIlIIIlIll[19], BiomeGenBase.llIIIIlIIIlIll[19]));
        "".length();
    }
    
    protected BiomeGenBase setBiomeName(final String llllllllllllIlllIlllIIllIIllllIl) {
        this.biomeName = llllllllllllIlllIlllIIllIIllllIl;
        return this;
    }
    
    public final void generateBiomeTerrain(final World llllllllllllIlllIlllIIlIlIIlllll, final Random llllllllllllIlllIlllIIlIlIIllllI, final ChunkPrimer llllllllllllIlllIlllIIlIlIlIlllI, final int llllllllllllIlllIlllIIlIlIIlllII, final int llllllllllllIlllIlllIIlIlIIllIll, final double llllllllllllIlllIlllIIlIlIIllIlI) {
        final int llllllllllllIlllIlllIIlIlIlIlIlI = llllllllllllIlllIlllIIlIlIIlllll.func_181545_F();
        IBlockState llllllllllllIlllIlllIIlIlIlIlIIl = this.topBlock;
        IBlockState llllllllllllIlllIlllIIlIlIlIlIII = this.fillerBlock;
        int llllllllllllIlllIlllIIlIlIlIIlll = BiomeGenBase.llIIIIlIIIlIll[93];
        final int llllllllllllIlllIlllIIlIlIlIIllI = (int)(llllllllllllIlllIlllIIlIlIIllIlI / 3.0 + 3.0 + llllllllllllIlllIlllIIlIlIIllllI.nextDouble() * 0.25);
        final int llllllllllllIlllIlllIIlIlIlIIlIl = llllllllllllIlllIlllIIlIlIIlllII & BiomeGenBase.llIIIIlIIIlIll[33];
        final int llllllllllllIlllIlllIIlIlIlIIlII = llllllllllllIlllIlllIIlIlIIllIll & BiomeGenBase.llIIIIlIIIlIll[33];
        final BlockPos.MutableBlockPos llllllllllllIlllIlllIIlIlIlIIIll = new BlockPos.MutableBlockPos();
        int llllllllllllIlllIlllIIlIlIlIIIlI = BiomeGenBase.llIIIIlIIIlIll[18];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIIIllllIIlllII(llllllllllllIlllIlllIIlIlIlIIIlI)) {
            if (lIIIIllllIlIIIIl(llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIIllllI.nextInt(BiomeGenBase.llIIIIlIIIlIll[11]))) {
                llllllllllllIlllIlllIIlIlIlIlllI.setBlockState(llllllllllllIlllIlllIIlIlIlIIlII, llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIIlIl, Blocks.bedrock.getDefaultState());
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else {
                final IBlockState llllllllllllIlllIlllIIlIlIlIIIIl = llllllllllllIlllIlllIIlIlIlIlllI.getBlockState(llllllllllllIlllIlllIIlIlIlIIlII, llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIIlIl);
                if (lIIIIllllIlIIIlI(llllllllllllIlllIlllIIlIlIlIIIIl.getBlock().getMaterial(), Material.air)) {
                    llllllllllllIlllIlllIIlIlIlIIlll = BiomeGenBase.llIIIIlIIIlIll[93];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lIIIIllllIlIIIlI(llllllllllllIlllIlllIIlIlIlIIIIl.getBlock(), Blocks.stone)) {
                    if (lIIIIllllIlIIIll(llllllllllllIlllIlllIIlIlIlIIlll, BiomeGenBase.llIIIIlIIIlIll[93])) {
                        if (lIIIIllllIlIIlII(llllllllllllIlllIlllIIlIlIlIIllI)) {
                            llllllllllllIlllIlllIIlIlIlIlIIl = null;
                            llllllllllllIlllIlllIIlIlIlIlIII = Blocks.stone.getDefaultState();
                            "".length();
                            if ((0 + 31 - 15 + 148 ^ 47 + 4 + 17 + 93) == 0x0) {
                                return;
                            }
                        }
                        else if (lIIIIllllIIllIII(llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIlIlI - BiomeGenBase.llIIIIlIIIlIll[9]) && lIIIIllllIlIIIIl(llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIlIlI + BiomeGenBase.llIIIIlIIIlIll[3])) {
                            llllllllllllIlllIlllIIlIlIlIlIIl = this.topBlock;
                            llllllllllllIlllIlllIIlIlIlIlIII = this.fillerBlock;
                        }
                        if (lIIIIllllIIlIlll(llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIlIlI) && (!lIIIIllllIIlIlIl(llllllllllllIlllIlllIIlIlIlIlIIl) || lIIIIllllIlIIIlI(llllllllllllIlllIlllIIlIlIlIlIIl.getBlock().getMaterial(), Material.air))) {
                            if (lIIIIllllIIlllII(lIIIIllllIlIIIII(this.getFloatTemperature(llllllllllllIlllIlllIIlIlIlIIIll.func_181079_c(llllllllllllIlllIlllIIlIlIIlllII, llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIIllIll)), 0.15f))) {
                                llllllllllllIlllIlllIIlIlIlIlIIl = Blocks.ice.getDefaultState();
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            }
                            else {
                                llllllllllllIlllIlllIIlIlIlIlIIl = Blocks.water.getDefaultState();
                            }
                        }
                        llllllllllllIlllIlllIIlIlIlIIlll = llllllllllllIlllIlllIIlIlIlIIllI;
                        if (lIIIIllllIIllIII(llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIlIlI - BiomeGenBase.llIIIIlIIIlIll[3])) {
                            llllllllllllIlllIlllIIlIlIlIlllI.setBlockState(llllllllllllIlllIlllIIlIlIlIIlII, llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIIlIl, llllllllllllIlllIlllIIlIlIlIlIIl);
                            "".length();
                            if (" ".length() == "  ".length()) {
                                return;
                            }
                        }
                        else if (lIIIIllllIIlIlll(llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIlIlI - BiomeGenBase.llIIIIlIIIlIll[17] - llllllllllllIlllIlllIIlIlIlIIllI)) {
                            llllllllllllIlllIlllIIlIlIlIlIIl = null;
                            llllllllllllIlllIlllIIlIlIlIlIII = Blocks.stone.getDefaultState();
                            llllllllllllIlllIlllIIlIlIlIlllI.setBlockState(llllllllllllIlllIlllIIlIlIlIIlII, llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIIlIl, Blocks.gravel.getDefaultState());
                            "".length();
                            if ("  ".length() == ((128 + 106 - 186 + 157 ^ 98 + 87 - 107 + 53) & (0x6E ^ 0x5B ^ (0x4 ^ 0x7F) ^ -" ".length()))) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlllIlllIIlIlIlIlllI.setBlockState(llllllllllllIlllIlllIIlIlIlIIlII, llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIIlIl, llllllllllllIlllIlllIIlIlIlIlIII);
                            "".length();
                            if (-" ".length() >= (0x2A ^ 0x2E)) {
                                return;
                            }
                        }
                    }
                    else if (lIIIIllllIIllIll(llllllllllllIlllIlllIIlIlIlIIlll)) {
                        --llllllllllllIlllIlllIIlIlIlIIlll;
                        llllllllllllIlllIlllIIlIlIlIlllI.setBlockState(llllllllllllIlllIlllIIlIlIlIIlII, llllllllllllIlllIlllIIlIlIlIIIlI, llllllllllllIlllIlllIIlIlIlIIlIl, llllllllllllIlllIlllIIlIlIlIlIII);
                        if (lIIIIllllIIlllIl(llllllllllllIlllIlllIIlIlIlIIlll) && lIIIIllllIlIIIlI(llllllllllllIlllIlllIIlIlIlIlIII.getBlock(), Blocks.sand)) {
                            llllllllllllIlllIlllIIlIlIlIIlll = llllllllllllIlllIlllIIlIlIIllllI.nextInt(BiomeGenBase.llIIIIlIIIlIll[9]) + Math.max(BiomeGenBase.llIIIIlIIIlIll[1], llllllllllllIlllIlllIIlIlIlIIIlI - BiomeGenBase.llIIIIlIIIlIll[94]);
                            IBlockState blockState;
                            if (lIIIIllllIlIIIlI(llllllllllllIlllIlllIIlIlIlIlIII.getValue(BlockSand.VARIANT), BlockSand.EnumType.RED_SAND)) {
                                blockState = Blocks.red_sandstone.getDefaultState();
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            }
                            else {
                                blockState = Blocks.sandstone.getDefaultState();
                            }
                            llllllllllllIlllIlllIIlIlIlIlIII = blockState;
                        }
                    }
                }
            }
            --llllllllllllIlllIlllIIlIlIlIIIlI;
        }
    }
    
    public enum TempCategory
    {
        private static final /* synthetic */ int[] lIllIIllIlIlll;
        
        MEDIUM(TempCategory.lIllIIllIlIlII[TempCategory.lIllIIllIlIlll[2]], TempCategory.lIllIIllIlIlll[2]), 
        COLD(TempCategory.lIllIIllIlIlII[TempCategory.lIllIIllIlIlll[1]], TempCategory.lIllIIllIlIlll[1]);
        
        private static final /* synthetic */ String[] lIllIIllIlIlII;
        
        OCEAN(TempCategory.lIllIIllIlIlII[TempCategory.lIllIIllIlIlll[0]], TempCategory.lIllIIllIlIlll[0]), 
        WARM(TempCategory.lIllIIllIlIlII[TempCategory.lIllIIllIlIlll[3]], TempCategory.lIllIIllIlIlll[3]);
        
        static {
            lllllIlIllIIlIl();
            lllllIlIllIIIlI();
            final TempCategory[] enum$VALUES = new TempCategory[TempCategory.lIllIIllIlIlll[4]];
            enum$VALUES[TempCategory.lIllIIllIlIlll[0]] = TempCategory.OCEAN;
            enum$VALUES[TempCategory.lIllIIllIlIlll[1]] = TempCategory.COLD;
            enum$VALUES[TempCategory.lIllIIllIlIlll[2]] = TempCategory.MEDIUM;
            enum$VALUES[TempCategory.lIllIIllIlIlll[3]] = TempCategory.WARM;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lllllIlIllIIIlI() {
            (lIllIIllIlIlII = new String[TempCategory.lIllIIllIlIlll[4]])[TempCategory.lIllIIllIlIlll[0]] = lllllIlIlIllllI("aCmWGtcGUGA=", "VxsJV");
            TempCategory.lIllIIllIlIlII[TempCategory.lIllIIllIlIlll[1]] = lllllIlIlIlllll("MCgPFg==", "sgCRl");
            TempCategory.lIllIIllIlIlII[TempCategory.lIllIIllIlIlll[2]] = lllllIlIllIIIII("7dV1eHUrED4=", "KdkiZ");
            TempCategory.lIllIIllIlIlII[TempCategory.lIllIIllIlIlll[3]] = lllllIlIlIlllll("HS81Hw==", "JngRa");
        }
        
        private static String lllllIlIlIllllI(final String lllllllllllllIIIIIIllIIIllIIIlII, final String lllllllllllllIIIIIIllIIIllIIIIIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIIIllIIIllIIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIIIllIIIIIl.getBytes(StandardCharsets.UTF_8)), TempCategory.lIllIIllIlIlll[5]), "DES");
                final Cipher lllllllllllllIIIIIIllIIIllIIIllI = Cipher.getInstance("DES");
                lllllllllllllIIIIIIllIIIllIIIllI.init(TempCategory.lIllIIllIlIlll[2], lllllllllllllIIIIIIllIIIllIIIlll);
                return new String(lllllllllllllIIIIIIllIIIllIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIIIllIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIIIllIIIllIIIlIl) {
                lllllllllllllIIIIIIllIIIllIIIlIl.printStackTrace();
                return null;
            }
        }
        
        private static String lllllIlIllIIIII(final String lllllllllllllIIIIIIllIIIlIllIlll, final String lllllllllllllIIIIIIllIIIlIllIlII) {
            try {
                final SecretKeySpec lllllllllllllIIIIIIllIIIlIlllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIllIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIIIIIllIIIlIlllIIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIIIIIllIIIlIlllIIl.init(TempCategory.lIllIIllIlIlll[2], lllllllllllllIIIIIIllIIIlIlllIlI);
                return new String(lllllllllllllIIIIIIllIIIlIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIllIIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIIIllIIIlIlllIII) {
                lllllllllllllIIIIIIllIIIlIlllIII.printStackTrace();
                return null;
            }
        }
        
        private static String lllllIlIlIlllll(String lllllllllllllIIIIIIllIIIlIlIIIlI, final String lllllllllllllIIIIIIllIIIlIlIIllI) {
            lllllllllllllIIIIIIllIIIlIlIIIlI = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIllIIIlIlIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIIIllIIIlIlIIlIl = new StringBuilder();
            final char[] lllllllllllllIIIIIIllIIIlIlIIlII = lllllllllllllIIIIIIllIIIlIlIIllI.toCharArray();
            int lllllllllllllIIIIIIllIIIlIlIIIll = TempCategory.lIllIIllIlIlll[0];
            final Exception lllllllllllllIIIIIIllIIIlIIlllIl = (Object)((String)lllllllllllllIIIIIIllIIIlIlIIIlI).toCharArray();
            final int lllllllllllllIIIIIIllIIIlIIlllII = lllllllllllllIIIIIIllIIIlIIlllIl.length;
            char lllllllllllllIIIIIIllIIIlIIllIll = (char)TempCategory.lIllIIllIlIlll[0];
            while (lllllIlIllIIllI(lllllllllllllIIIIIIllIIIlIIllIll, lllllllllllllIIIIIIllIIIlIIlllII)) {
                final char lllllllllllllIIIIIIllIIIlIlIlIII = lllllllllllllIIIIIIllIIIlIIlllIl[lllllllllllllIIIIIIllIIIlIIllIll];
                lllllllllllllIIIIIIllIIIlIlIIlIl.append((char)(lllllllllllllIIIIIIllIIIlIlIlIII ^ lllllllllllllIIIIIIllIIIlIlIIlII[lllllllllllllIIIIIIllIIIlIlIIIll % lllllllllllllIIIIIIllIIIlIlIIlII.length]));
                "".length();
                ++lllllllllllllIIIIIIllIIIlIlIIIll;
                ++lllllllllllllIIIIIIllIIIlIIllIll;
                "".length();
                if ("   ".length() == -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIIIllIIIlIlIIlIl);
        }
        
        private TempCategory(final String lllllllllllllIIIIIIllIIIllIlIlIl, final int lllllllllllllIIIIIIllIIIllIlIlII) {
        }
        
        private static boolean lllllIlIllIIllI(final int lllllllllllllIIIIIIllIIIlIIlIlll, final int lllllllllllllIIIIIIllIIIlIIlIllI) {
            return lllllllllllllIIIIIIllIIIlIIlIlll < lllllllllllllIIIIIIllIIIlIIlIllI;
        }
        
        private static void lllllIlIllIIlIl() {
            (lIllIIllIlIlll = new int[6])[0] = ((0x74 ^ 0x7 ^ 66 + 94 - 33 + 0) & (0x3B ^ 0x7C ^ (0x2C ^ 0x67) ^ -" ".length()));
            TempCategory.lIllIIllIlIlll[1] = " ".length();
            TempCategory.lIllIIllIlIlll[2] = "  ".length();
            TempCategory.lIllIIllIlIlll[3] = "   ".length();
            TempCategory.lIllIIllIlIlll[4] = (17 + 57 - 62 + 137 ^ 90 + 96 - 173 + 132);
            TempCategory.lIllIIllIlIlll[5] = (0x2 ^ 0xA);
        }
    }
    
    public static class SpawnListEntry extends WeightedRandom.Item
    {
        public /* synthetic */ Class<? extends EntityLiving> entityClass;
        public /* synthetic */ int maxGroupCount;
        public /* synthetic */ int minGroupCount;
        private static final /* synthetic */ String[] lIIIlIllIIIIIl;
        private static final /* synthetic */ int[] lIIIlIllIIIllI;
        
        public SpawnListEntry(final Class<? extends EntityLiving> lllllllllllllIlIIIIlIlllllIIIIlI, final int lllllllllllllIlIIIIlIllllIllllII, final int lllllllllllllIlIIIIlIlllllIIIIII, final int lllllllllllllIlIIIIlIllllIlllIlI) {
            super(lllllllllllllIlIIIIlIllllIllllII);
            this.entityClass = lllllllllllllIlIIIIlIlllllIIIIlI;
            this.minGroupCount = lllllllllllllIlIIIIlIlllllIIIIII;
            this.maxGroupCount = lllllllllllllIlIIIIlIllllIlllIlI;
        }
        
        private static void llIIIIIllIIlIlI() {
            (lIIIlIllIIIIIl = new String[SpawnListEntry.lIIIlIllIIIllI[3]])[SpawnListEntry.lIIIlIllIIIllI[0]] = llIIIIIllIIIllI("jiQqAwZzG1Y=", "mXbwI");
            SpawnListEntry.lIIIlIllIIIIIl[SpawnListEntry.lIIIlIllIIIllI[1]] = llIIIIIllIIlIIl("/yoTTuVFkLA=", "LBdLq");
            SpawnListEntry.lIIIlIllIIIIIl[SpawnListEntry.lIIIlIllIIIllI[2]] = llIIIIIllIIIllI("fL6YjwNE+D4=", "AdcFH");
        }
        
        private static String llIIIIIllIIlIIl(final String lllllllllllllIlIIIIlIllllIlIllll, final String lllllllllllllIlIIIIlIllllIlIlllI) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIlIllllIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIllllIlIlllI.getBytes(StandardCharsets.UTF_8)), SpawnListEntry.lIIIlIllIIIllI[4]), "DES");
                final Cipher lllllllllllllIlIIIIlIllllIllIIIl = Cipher.getInstance("DES");
                lllllllllllllIlIIIIlIllllIllIIIl.init(SpawnListEntry.lIIIlIllIIIllI[2], lllllllllllllIlIIIIlIllllIllIIlI);
                return new String(lllllllllllllIlIIIIlIllllIllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIllllIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIlIllllIllIIII) {
                lllllllllllllIlIIIIlIllllIllIIII.printStackTrace();
                return null;
            }
        }
        
        private static String llIIIIIllIIIllI(final String lllllllllllllIlIIIIlIllllIlIIIII, final String lllllllllllllIlIIIIlIllllIIlllll) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIlIllllIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlIllllIIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIIIlIllllIlIIlII = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIIIlIllllIlIIlII.init(SpawnListEntry.lIIIlIllIIIllI[2], lllllllllllllIlIIIIlIllllIlIIlIl);
                return new String(lllllllllllllIlIIIIlIllllIlIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlIllllIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIlIllllIlIIIll) {
                lllllllllllllIlIIIIlIllllIlIIIll.printStackTrace();
                return null;
            }
        }
        
        static {
            llIIIIIllIIllll();
            llIIIIIllIIlIlI();
        }
        
        private static void llIIIIIllIIllll() {
            (lIIIlIllIIIllI = new int[5])[0] = ((0xA ^ 0x4F) & ~(0xFC ^ 0xB9));
            SpawnListEntry.lIIIlIllIIIllI[1] = " ".length();
            SpawnListEntry.lIIIlIllIIIllI[2] = "  ".length();
            SpawnListEntry.lIIIlIllIIIllI[3] = "   ".length();
            SpawnListEntry.lIIIlIllIIIllI[4] = (0x33 ^ 0x3B);
        }
        
        @Override
        public String toString() {
            return String.valueOf(new StringBuilder(String.valueOf(this.entityClass.getSimpleName())).append(SpawnListEntry.lIIIlIllIIIIIl[SpawnListEntry.lIIIlIllIIIllI[0]]).append(this.minGroupCount).append(SpawnListEntry.lIIIlIllIIIIIl[SpawnListEntry.lIIIlIllIIIllI[1]]).append(this.maxGroupCount).append(SpawnListEntry.lIIIlIllIIIIIl[SpawnListEntry.lIIIlIllIIIllI[2]]).append(this.itemWeight));
        }
    }
    
    public static class Height
    {
        public /* synthetic */ float variation;
        public /* synthetic */ float rootHeight;
        
        public Height(final float llllllllllllIllllIIlllllIlIIIIII, final float llllllllllllIllllIIlllllIIllllll) {
            this.rootHeight = llllllllllllIllllIIlllllIlIIIIII;
            this.variation = llllllllllllIllllIIlllllIIllllll;
        }
        
        public Height attenuate() {
            return new Height(this.rootHeight * 0.8f, this.variation * 0.6f);
        }
    }
}
