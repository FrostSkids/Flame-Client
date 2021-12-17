// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.MathHelper;
import net.minecraft.block.BlockFlower;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenForest;

public class BiomeGenForest extends BiomeGenBase
{
    protected static final /* synthetic */ WorldGenForest field_150630_aD;
    protected static final /* synthetic */ WorldGenCanopyTree field_150631_aE;
    private static final /* synthetic */ int[] lIllIIIlIIlllI;
    protected static final /* synthetic */ WorldGenForest field_150629_aC;
    private /* synthetic */ int field_150632_aF;
    private static final /* synthetic */ String[] lIllIIIlIIllIl;
    
    @Override
    protected BiomeGenBase createMutatedBiome(final int lllllllllllllIIIIIllIIllIlIllllI) {
        if (llllIlllllIIllI(this.biomeID, BiomeGenBase.forest.biomeID)) {
            final BiomeGenForest lllllllllllllIIIIIllIIllIllIIIII = new BiomeGenForest(lllllllllllllIIIIIllIIllIlIllllI, BiomeGenForest.lIllIIIlIIlllI[1]);
            lllllllllllllIIIIIllIIllIllIIIII.setHeight(new Height(this.minHeight, this.maxHeight + 0.2f));
            "".length();
            lllllllllllllIIIIIllIIllIllIIIII.setBiomeName(BiomeGenForest.lIllIIIlIIllIl[BiomeGenForest.lIllIIIlIIlllI[0]]);
            "".length();
            lllllllllllllIIIIIllIIllIllIIIII.func_150557_a(BiomeGenForest.lIllIIIlIIlllI[19], (boolean)(BiomeGenForest.lIllIIIlIIlllI[1] != 0));
            "".length();
            lllllllllllllIIIIIllIIllIllIIIII.setFillerBlockMetadata(BiomeGenForest.lIllIIIlIIlllI[20]);
            "".length();
            return lllllllllllllIIIIIllIIllIllIIIII;
        }
        BiomeGenMutated biomeGenMutated;
        if (llllIlllllIlIlI(this.biomeID, BiomeGenBase.birchForest.biomeID) && llllIlllllIlIlI(this.biomeID, BiomeGenBase.birchForestHills.biomeID)) {
            biomeGenMutated = new BiomeGenMutated(lllllllllllllIIIIIllIIllIlIllllI, this) {
                @Override
                public void decorate(final World llllllllllllIllIIIIIlllIIlllIlIl, final Random llllllllllllIllIIIIIlllIIlllIlII, final BlockPos llllllllllllIllIIIIIlllIIlllIlll) {
                    this.baseBiome.decorate(llllllllllllIllIIIIIlllIIlllIlIl, llllllllllllIllIIIIIlllIIlllIlII, llllllllllllIllIIIIIlllIIlllIlll);
                }
            };
            "".length();
            if (((0x1E ^ 0x44) & ~(0x64 ^ 0x3E)) != 0x0) {
                return null;
            }
        }
        else {
            biomeGenMutated = new BiomeGenMutated(lllllllllllllIIIIIllIIllIlIllllI, this) {
                @Override
                public WorldGenAbstractTree genBigTreeChance(final Random lllllllllllllIlIIlIlllllIlllIlIl) {
                    WorldGenForest worldGenForest;
                    if (lIlllIIIlllIllI(lllllllllllllIlIIlIlllllIlllIlIl.nextBoolean() ? 1 : 0)) {
                        worldGenForest = BiomeGenForest.field_150629_aC;
                        "".length();
                        if ("  ".length() <= 0) {
                            return null;
                        }
                    }
                    else {
                        worldGenForest = BiomeGenForest.field_150630_aD;
                    }
                    return worldGenForest;
                }
                
                private static boolean lIlllIIIlllIllI(final int lllllllllllllIlIIlIlllllIlllIIlI) {
                    return lllllllllllllIlIIlIlllllIlllIIlI != 0;
                }
            };
        }
        return biomeGenMutated;
    }
    
    private static boolean llllIlllllIllII(final int lllllllllllllIIIIIllIIllIIlllllI, final int lllllllllllllIIIIIllIIllIIllllIl) {
        return lllllllllllllIIIIIllIIllIIlllllI >= lllllllllllllIIIIIllIIllIIllllIl;
    }
    
    private static boolean llllIlllllIlIII(final int lllllllllllllIIIIIllIIllIIllIIll) {
        return lllllllllllllIIIIIllIIllIIllIIll != 0;
    }
    
    private static boolean llllIlllllIIllI(final int lllllllllllllIIIIIllIIllIlIIIIlI, final int lllllllllllllIIIIIllIIllIlIIIIIl) {
        return lllllllllllllIIIIIllIIllIlIIIIlI == lllllllllllllIIIIIllIIllIlIIIIIl;
    }
    
    private static boolean llllIlllllIlIll(final Object lllllllllllllIIIIIllIIllIIllIllI, final Object lllllllllllllIIIIIllIIllIIllIlIl) {
        return lllllllllllllIIIIIllIIllIIllIllI == lllllllllllllIIIIIllIIllIIllIlIl;
    }
    
    @Override
    public WorldGenAbstractTree genBigTreeChance(final Random lllllllllllllIIIIIllIIlllIlIIllI) {
        WorldGenAbstractTree worldGenAbstractTree;
        if (llllIlllllIIllI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[11]) && llllIlllllIlIIl(lllllllllllllIIIIIllIIlllIlIIllI.nextInt(BiomeGenForest.lIllIIIlIIlllI[11]))) {
            worldGenAbstractTree = BiomeGenForest.field_150631_aE;
            "".length();
            if ("   ".length() < ((0x75 ^ 0x3B) & ~(0xD0 ^ 0x9E))) {
                return null;
            }
        }
        else if (llllIlllllIlIlI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[3]) && llllIlllllIlIII(lllllllllllllIIIIIllIIlllIlIIllI.nextInt(BiomeGenForest.lIllIIIlIIlllI[9]))) {
            worldGenAbstractTree = this.worldGeneratorTrees;
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        else {
            worldGenAbstractTree = BiomeGenForest.field_150630_aD;
        }
        return worldGenAbstractTree;
    }
    
    private static boolean llllIlllllIlIlI(final int lllllllllllllIIIIIllIIllIIlIllII, final int lllllllllllllIIIIIllIIllIIlIlIll) {
        return lllllllllllllIIIIIllIIllIIlIllII != lllllllllllllIIIIIllIIllIIlIlIll;
    }
    
    private static String llllIlllllIIIll(String lllllllllllllIIIIIllIIllIlIlIIlI, final String lllllllllllllIIIIIllIIllIlIlIIIl) {
        lllllllllllllIIIIIllIIllIlIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIIllIIllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllIIllIlIlIIII = new StringBuilder();
        final char[] lllllllllllllIIIIIllIIllIlIIllll = lllllllllllllIIIIIllIIllIlIlIIIl.toCharArray();
        int lllllllllllllIIIIIllIIllIlIIlllI = BiomeGenForest.lIllIIIlIIlllI[0];
        final String lllllllllllllIIIIIllIIllIlIIlIII = (Object)lllllllllllllIIIIIllIIllIlIlIIlI.toCharArray();
        final long lllllllllllllIIIIIllIIllIlIIIlll = lllllllllllllIIIIIllIIllIlIIlIII.length;
        float lllllllllllllIIIIIllIIllIlIIIllI = BiomeGenForest.lIllIIIlIIlllI[0];
        while (llllIlllllIllIl((int)lllllllllllllIIIIIllIIllIlIIIllI, (int)lllllllllllllIIIIIllIIllIlIIIlll)) {
            final char lllllllllllllIIIIIllIIllIlIlIIll = lllllllllllllIIIIIllIIllIlIIlIII[lllllllllllllIIIIIllIIllIlIIIllI];
            lllllllllllllIIIIIllIIllIlIlIIII.append((char)(lllllllllllllIIIIIllIIllIlIlIIll ^ lllllllllllllIIIIIllIIllIlIIllll[lllllllllllllIIIIIllIIllIlIIlllI % lllllllllllllIIIIIllIIllIlIIllll.length]));
            "".length();
            ++lllllllllllllIIIIIllIIllIlIIlllI;
            ++lllllllllllllIIIIIllIIllIlIIIllI;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllIIllIlIlIIII);
    }
    
    private static void llllIlllllIIlII() {
        (lIllIIIlIIllIl = new String[BiomeGenForest.lIllIIIlIIlllI[1]])[BiomeGenForest.lIllIIIlIIlllI[0]] = llllIlllllIIIll("BCYEOwIwai0jFSc5Hw==", "BJkLg");
    }
    
    private static boolean llllIlllllIlIIl(final int lllllllllllllIIIIIllIIllIIlIllll) {
        return lllllllllllllIIIIIllIIllIIlIllll > 0;
    }
    
    private static boolean llllIlllllIIlll(final int lllllllllllllIIIIIllIIllIIllIIIl) {
        return lllllllllllllIIIIIllIIllIIllIIIl == 0;
    }
    
    private static void llllIlllllIIlIl() {
        (lIllIIIlIIlllI = new int[21])[0] = ((0xBA ^ 0x84) & ~(0x96 ^ 0xA8));
        BiomeGenForest.lIllIIIlIIlllI[1] = " ".length();
        BiomeGenForest.lIllIIIlIIlllI[2] = (10 + 42 + 76 + 1 ^ 75 + 60 - 28 + 32);
        BiomeGenForest.lIllIIIlIIlllI[3] = "  ".length();
        BiomeGenForest.lIllIIIlIIlllI[4] = (0x8D ^ 0x8B);
        BiomeGenForest.lIllIIIlIIlllI[5] = (0x3C ^ 0x5A ^ "  ".length());
        BiomeGenForest.lIllIIIlIIlllI[6] = (0xFFFFFEF9 & 0x4EBB37);
        BiomeGenForest.lIllIIIlIIlllI[7] = (0xFFFFFEB3 & 0x5676D);
        BiomeGenForest.lIllIIIlIIlllI[8] = (-(0xFFFFFFBD & 0x3EE) & (0xFFFFFFEF & 0x3077FF));
        BiomeGenForest.lIllIIIlIIlllI[9] = (0x43 ^ 0x46);
        BiomeGenForest.lIllIIIlIIlllI[10] = (0x20 ^ 0x24);
        BiomeGenForest.lIllIIIlIIlllI[11] = "   ".length();
        BiomeGenForest.lIllIIIlIIlllI[12] = -(-(0xFFFF9C99 & 0x7F6F) & (-1 & 0x1FEF));
        BiomeGenForest.lIllIIIlIIlllI[13] = (-" ".length() & (0xFFFFFFFE & 0xFEFEFF));
        BiomeGenForest.lIllIIIlIIlllI[14] = (0x22 ^ 0x17 ^ (0x43 ^ 0x7E));
        BiomeGenForest.lIllIIIlIIlllI[15] = (0x2B ^ 0x43 ^ (0xBF ^ 0xC3));
        BiomeGenForest.lIllIIIlIIlllI[16] = (43 + 57 - 81 + 168 ^ 106 + 141 - 155 + 79);
        BiomeGenForest.lIllIIIlIIlllI[17] = (119 + 43 - 151 + 137 ^ 130 + 126 - 216 + 140);
        BiomeGenForest.lIllIIIlIIlllI[18] = (-(0xFFFFDE72 & 0x29CF) & (0xFFFFFC4F & 0x283FFB));
        BiomeGenForest.lIllIIIlIIlllI[19] = (0xFFFFF4A7 & 0x6A7F7D);
        BiomeGenForest.lIllIIIlIIlllI[20] = (-(0xFFFFFAEF & 0x4D59) & (0xFFFFEB7F & 0x7DFEED));
    }
    
    @Override
    public BlockFlower.EnumFlowerType pickRandomFlower(final Random lllllllllllllIIIIIllIIlllIIlllll, final BlockPos lllllllllllllIIIIIllIIlllIIllIIl) {
        if (llllIlllllIIllI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[1])) {
            final double lllllllllllllIIIIIllIIlllIIlllIl = MathHelper.clamp_double((1.0 + BiomeGenForest.GRASS_COLOR_NOISE.func_151601_a(lllllllllllllIIIIIllIIlllIIllIIl.getX() / 48.0, lllllllllllllIIIIIllIIlllIIllIIl.getZ() / 48.0)) / 2.0, 0.0, 0.9999);
            final BlockFlower.EnumFlowerType lllllllllllllIIIIIllIIlllIIlllII = BlockFlower.EnumFlowerType.values()[(int)(lllllllllllllIIIIIllIIlllIIlllIl * BlockFlower.EnumFlowerType.values().length)];
            BlockFlower.EnumFlowerType poppy;
            if (llllIlllllIlIll(lllllllllllllIIIIIllIIlllIIlllII, BlockFlower.EnumFlowerType.BLUE_ORCHID)) {
                poppy = BlockFlower.EnumFlowerType.POPPY;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            else {
                poppy = lllllllllllllIIIIIllIIlllIIlllII;
            }
            return poppy;
        }
        return super.pickRandomFlower(lllllllllllllIIIIIllIIlllIIlllll, lllllllllllllIIIIIllIIlllIIllIIl);
    }
    
    @Override
    public int getGrassColorAtPos(final BlockPos lllllllllllllIIIIIllIIllIllIIlll) {
        final int lllllllllllllIIIIIllIIllIllIlIIl = super.getGrassColorAtPos(lllllllllllllIIIIIllIIllIllIIlll);
        int n;
        if (llllIlllllIIllI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[11])) {
            n = (lllllllllllllIIIIIllIIllIllIlIIl & BiomeGenForest.lIllIIIlIIlllI[13]) + BiomeGenForest.lIllIIIlIIlllI[18] >> BiomeGenForest.lIllIIIlIIlllI[1];
            "".length();
            if ((0x88 ^ 0x8D) == 0x0) {
                return (0xAF ^ 0xB8) & ~(0x14 ^ 0x3);
            }
        }
        else {
            n = lllllllllllllIIIIIllIIllIllIlIIl;
        }
        return n;
    }
    
    private static boolean llllIlllllIllIl(final int lllllllllllllIIIIIllIIllIIlllIlI, final int lllllllllllllIIIIIllIIllIIlllIIl) {
        return lllllllllllllIIIIIllIIllIIlllIlI < lllllllllllllIIIIIllIIllIIlllIIl;
    }
    
    public BiomeGenForest(final int lllllllllllllIIIIIllIIlllIllIllI, final int lllllllllllllIIIIIllIIlllIllIlIl) {
        super(lllllllllllllIIIIIllIIlllIllIllI);
        this.field_150632_aF = lllllllllllllIIIIIllIIlllIllIlIl;
        this.theBiomeDecorator.treesPerChunk = BiomeGenForest.lIllIIIlIIlllI[2];
        this.theBiomeDecorator.grassPerChunk = BiomeGenForest.lIllIIIlIIlllI[3];
        if (llllIlllllIIllI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[1])) {
            this.theBiomeDecorator.treesPerChunk = BiomeGenForest.lIllIIIlIIlllI[4];
            this.theBiomeDecorator.flowersPerChunk = BiomeGenForest.lIllIIIlIIlllI[5];
            this.theBiomeDecorator.grassPerChunk = BiomeGenForest.lIllIIIlIIlllI[1];
        }
        this.setFillerBlockMetadata(BiomeGenForest.lIllIIIlIIlllI[6]);
        "".length();
        this.setTemperatureRainfall(0.7f, 0.8f);
        "".length();
        if (llllIlllllIIllI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[3])) {
            this.field_150609_ah = BiomeGenForest.lIllIIIlIIlllI[7];
            this.color = BiomeGenForest.lIllIIIlIIlllI[8];
            this.setTemperatureRainfall(0.6f, 0.6f);
            "".length();
        }
        if (llllIlllllIIlll(this.field_150632_aF)) {
            this.spawnableCreatureList.add(new SpawnListEntry(EntityWolf.class, BiomeGenForest.lIllIIIlIIlllI[9], BiomeGenForest.lIllIIIlIIlllI[10], BiomeGenForest.lIllIIIlIIlllI[10]));
            "".length();
        }
        if (llllIlllllIIllI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[11])) {
            this.theBiomeDecorator.treesPerChunk = BiomeGenForest.lIllIIIlIIlllI[12];
        }
    }
    
    @Override
    protected BiomeGenBase func_150557_a(final int lllllllllllllIIIIIllIIlllIlIllIl, final boolean lllllllllllllIIIIIllIIlllIlIllII) {
        if (llllIlllllIIllI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[3])) {
            this.field_150609_ah = BiomeGenForest.lIllIIIlIIlllI[7];
            this.color = lllllllllllllIIIIIllIIlllIlIllIl;
            if (llllIlllllIlIII(lllllllllllllIIIIIllIIlllIlIllII ? 1 : 0)) {
                this.field_150609_ah = (this.field_150609_ah & BiomeGenForest.lIllIIIlIIlllI[13]) >> BiomeGenForest.lIllIIIlIIlllI[1];
            }
            return this;
        }
        return super.func_150557_a(lllllllllllllIIIIIllIIlllIlIllIl, lllllllllllllIIIIIllIIlllIlIllII);
    }
    
    @Override
    public void decorate(final World lllllllllllllIIIIIllIIlllIIIlIlI, final Random lllllllllllllIIIIIllIIlllIIIlIIl, final BlockPos lllllllllllllIIIIIllIIlllIIIlIII) {
        if (llllIlllllIIllI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[11])) {
            int lllllllllllllIIIIIllIIlllIIIIlll = BiomeGenForest.lIllIIIlIIlllI[0];
            "".length();
            if (-" ".length() >= "   ".length()) {
                return;
            }
            while (!llllIlllllIllII(lllllllllllllIIIIIllIIlllIIIIlll, BiomeGenForest.lIllIIIlIIlllI[10])) {
                int lllllllllllllIIIIIllIIlllIIIIllI = BiomeGenForest.lIllIIIlIIlllI[0];
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                while (!llllIlllllIllII(lllllllllllllIIIIIllIIlllIIIIllI, BiomeGenForest.lIllIIIlIIlllI[10])) {
                    final int lllllllllllllIIIIIllIIlllIIIIlIl = lllllllllllllIIIIIllIIlllIIIIlll * BiomeGenForest.lIllIIIlIIlllI[10] + BiomeGenForest.lIllIIIlIIlllI[1] + BiomeGenForest.lIllIIIlIIlllI[14] + lllllllllllllIIIIIllIIlllIIIlIIl.nextInt(BiomeGenForest.lIllIIIlIIlllI[11]);
                    final int lllllllllllllIIIIIllIIlllIIIIlII = lllllllllllllIIIIIllIIlllIIIIllI * BiomeGenForest.lIllIIIlIIlllI[10] + BiomeGenForest.lIllIIIlIIlllI[1] + BiomeGenForest.lIllIIIlIIlllI[14] + lllllllllllllIIIIIllIIlllIIIlIIl.nextInt(BiomeGenForest.lIllIIIlIIlllI[11]);
                    final BlockPos lllllllllllllIIIIIllIIlllIIIIIll = lllllllllllllIIIIIllIIlllIIIlIlI.getHeight(lllllllllllllIIIIIllIIlllIIIlIII.add(lllllllllllllIIIIIllIIlllIIIIlIl, BiomeGenForest.lIllIIIlIIlllI[0], lllllllllllllIIIIIllIIlllIIIIlII));
                    if (llllIlllllIIlll(lllllllllllllIIIIIllIIlllIIIlIIl.nextInt(BiomeGenForest.lIllIIIlIIlllI[15]))) {
                        final WorldGenBigMushroom lllllllllllllIIIIIllIIlllIIIIIlI = new WorldGenBigMushroom();
                        lllllllllllllIIIIIllIIlllIIIIIlI.generate(lllllllllllllIIIIIllIIlllIIIlIlI, lllllllllllllIIIIIllIIlllIIIlIIl, lllllllllllllIIIIIllIIlllIIIIIll);
                        "".length();
                        "".length();
                        if (((0x29 ^ 0x59 ^ (0x87 ^ 0x95)) & (0x37 ^ 0x2F ^ (0x49 ^ 0x33) ^ -" ".length())) >= " ".length()) {
                            return;
                        }
                    }
                    else {
                        final WorldGenAbstractTree lllllllllllllIIIIIllIIlllIIIIIIl = this.genBigTreeChance(lllllllllllllIIIIIllIIlllIIIlIIl);
                        lllllllllllllIIIIIllIIlllIIIIIIl.func_175904_e();
                        if (llllIlllllIlIII(lllllllllllllIIIIIllIIlllIIIIIIl.generate(lllllllllllllIIIIIllIIlllIIIlIlI, lllllllllllllIIIIIllIIlllIIIlIIl, lllllllllllllIIIIIllIIlllIIIIIll) ? 1 : 0)) {
                            lllllllllllllIIIIIllIIlllIIIIIIl.func_180711_a(lllllllllllllIIIIIllIIlllIIIlIlI, lllllllllllllIIIIIllIIlllIIIlIIl, lllllllllllllIIIIIllIIlllIIIIIll);
                        }
                    }
                    ++lllllllllllllIIIIIllIIlllIIIIllI;
                }
                ++lllllllllllllIIIIIllIIlllIIIIlll;
            }
        }
        int lllllllllllllIIIIIllIIlllIIIIIII = lllllllllllllIIIIIllIIlllIIIlIIl.nextInt(BiomeGenForest.lIllIIIlIIlllI[9]) - BiomeGenForest.lIllIIIlIIlllI[11];
        if (llllIlllllIIllI(this.field_150632_aF, BiomeGenForest.lIllIIIlIIlllI[1])) {
            lllllllllllllIIIIIllIIlllIIIIIII += 2;
        }
        int lllllllllllllIIIIIllIIllIlllllll = BiomeGenForest.lIllIIIlIIlllI[0];
        "".length();
        if (" ".length() == "   ".length()) {
            return;
        }
        while (!llllIlllllIllII(lllllllllllllIIIIIllIIllIlllllll, lllllllllllllIIIIIllIIlllIIIIIII)) {
            final int lllllllllllllIIIIIllIIllIllllllI = lllllllllllllIIIIIllIIlllIIIlIIl.nextInt(BiomeGenForest.lIllIIIlIIlllI[11]);
            if (llllIlllllIIlll(lllllllllllllIIIIIllIIllIllllllI)) {
                BiomeGenForest.DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.SYRINGA);
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            else if (llllIlllllIIllI(lllllllllllllIIIIIllIIllIllllllI, BiomeGenForest.lIllIIIlIIlllI[1])) {
                BiomeGenForest.DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.ROSE);
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else if (llllIlllllIIllI(lllllllllllllIIIIIllIIllIllllllI, BiomeGenForest.lIllIIIlIIlllI[3])) {
                BiomeGenForest.DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.PAEONIA);
            }
            int lllllllllllllIIIIIllIIllIlllllIl = BiomeGenForest.lIllIIIlIIlllI[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!llllIlllllIllII(lllllllllllllIIIIIllIIllIlllllIl, BiomeGenForest.lIllIIIlIIlllI[9])) {
                final int lllllllllllllIIIIIllIIllIlllllII = lllllllllllllIIIIIllIIlllIIIlIIl.nextInt(BiomeGenForest.lIllIIIlIIlllI[16]) + BiomeGenForest.lIllIIIlIIlllI[14];
                final int lllllllllllllIIIIIllIIllIllllIll = lllllllllllllIIIIIllIIlllIIIlIIl.nextInt(BiomeGenForest.lIllIIIlIIlllI[16]) + BiomeGenForest.lIllIIIlIIlllI[14];
                final int lllllllllllllIIIIIllIIllIllllIlI = lllllllllllllIIIIIllIIlllIIIlIIl.nextInt(lllllllllllllIIIIIllIIlllIIIlIlI.getHeight(lllllllllllllIIIIIllIIlllIIIlIII.add(lllllllllllllIIIIIllIIllIlllllII, BiomeGenForest.lIllIIIlIIlllI[0], lllllllllllllIIIIIllIIllIllllIll)).getY() + BiomeGenForest.lIllIIIlIIlllI[17]);
                if (llllIlllllIlIII(BiomeGenForest.DOUBLE_PLANT_GENERATOR.generate(lllllllllllllIIIIIllIIlllIIIlIlI, lllllllllllllIIIIIllIIlllIIIlIIl, new BlockPos(lllllllllllllIIIIIllIIlllIIIlIII.getX() + lllllllllllllIIIIIllIIllIlllllII, lllllllllllllIIIIIllIIllIllllIlI, lllllllllllllIIIIIllIIlllIIIlIII.getZ() + lllllllllllllIIIIIllIIllIllllIll)) ? 1 : 0)) {
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIIIIIllIIllIlllllIl;
                }
            }
            ++lllllllllllllIIIIIllIIllIlllllll;
        }
        super.decorate(lllllllllllllIIIIIllIIlllIIIlIlI, lllllllllllllIIIIIllIIlllIIIlIIl, lllllllllllllIIIIIllIIlllIIIlIII);
    }
    
    static {
        llllIlllllIIlIl();
        llllIlllllIIlII();
        field_150629_aC = new WorldGenForest((boolean)(BiomeGenForest.lIllIIIlIIlllI[0] != 0), (boolean)(BiomeGenForest.lIllIIIlIIlllI[1] != 0));
        field_150630_aD = new WorldGenForest((boolean)(BiomeGenForest.lIllIIIlIIlllI[0] != 0), (boolean)(BiomeGenForest.lIllIIIlIIlllI[0] != 0));
        field_150631_aE = new WorldGenCanopyTree((boolean)(BiomeGenForest.lIllIIIlIIlllI[0] != 0));
    }
}
