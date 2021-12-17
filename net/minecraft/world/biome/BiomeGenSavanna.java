// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockDirt;
import net.minecraft.init.Blocks;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import java.util.Random;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;

public class BiomeGenSavanna extends BiomeGenBase
{
    private static final /* synthetic */ int[] lIIIIllIIllllI;
    private static final /* synthetic */ WorldGenSavannaTree field_150627_aC;
    
    static {
        lIlllIllIllIllI();
        field_150627_aC = new WorldGenSavannaTree((boolean)(BiomeGenSavanna.lIIIIllIIllllI[0] != 0));
    }
    
    @Override
    public WorldGenAbstractTree genBigTreeChance(final Random lllllllllllllIlIIlIIllIIllllIllI) {
        WorldGenAbstractTree worldGenAbstractTree;
        if (lIlllIllIllIlll(lllllllllllllIlIIlIIllIIllllIllI.nextInt(BiomeGenSavanna.lIIIIllIIllllI[6]))) {
            worldGenAbstractTree = BiomeGenSavanna.field_150627_aC;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else {
            worldGenAbstractTree = this.worldGeneratorTrees;
        }
        return worldGenAbstractTree;
    }
    
    @Override
    protected BiomeGenBase createMutatedBiome(final int lllllllllllllIlIIlIIllIIlllIlllI) {
        final BiomeGenBase lllllllllllllIlIIlIIllIIllllIIII = new Mutated(lllllllllllllIlIIlIIllIIlllIlllI, this);
        lllllllllllllIlIIlIIllIIllllIIII.temperature = (this.temperature + 1.0f) * 0.5f;
        lllllllllllllIlIIlIIllIIllllIIII.minHeight = this.minHeight * 0.5f + 0.3f;
        lllllllllllllIlIIlIIllIIllllIIII.maxHeight = this.maxHeight * 0.5f + 1.2f;
        return lllllllllllllIlIIlIIllIIllllIIII;
    }
    
    private static boolean lIlllIllIllIlll(final int lllllllllllllIlIIlIIllIIllIIllll) {
        return lllllllllllllIlIIlIIllIIllIIllll > 0;
    }
    
    @Override
    public void decorate(final World lllllllllllllIlIIlIIllIIlllIIIll, final Random lllllllllllllIlIIlIIllIIlllIIIlI, final BlockPos lllllllllllllIlIIlIIllIIlllIIIIl) {
        BiomeGenSavanna.DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);
        int lllllllllllllIlIIlIIllIIlllIIIII = BiomeGenSavanna.lIIIIllIIllllI[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlllIllIlllIII(lllllllllllllIlIIlIIllIIlllIIIII, BiomeGenSavanna.lIIIIllIIllllI[10])) {
            final int lllllllllllllIlIIlIIllIIllIlllll = lllllllllllllIlIIlIIllIIlllIIIlI.nextInt(BiomeGenSavanna.lIIIIllIIllllI[7]) + BiomeGenSavanna.lIIIIllIIllllI[8];
            final int lllllllllllllIlIIlIIllIIllIllllI = lllllllllllllIlIIlIIllIIlllIIIlI.nextInt(BiomeGenSavanna.lIIIIllIIllllI[7]) + BiomeGenSavanna.lIIIIllIIllllI[8];
            final int lllllllllllllIlIIlIIllIIllIlllIl = lllllllllllllIlIIlIIllIIlllIIIlI.nextInt(lllllllllllllIlIIlIIllIIlllIIIll.getHeight(lllllllllllllIlIIlIIllIIlllIIIIl.add(lllllllllllllIlIIlIIllIIllIlllll, BiomeGenSavanna.lIIIIllIIllllI[0], lllllllllllllIlIIlIIllIIllIllllI)).getY() + BiomeGenSavanna.lIIIIllIIllllI[9]);
            BiomeGenSavanna.DOUBLE_PLANT_GENERATOR.generate(lllllllllllllIlIIlIIllIIlllIIIll, lllllllllllllIlIIlIIllIIlllIIIlI, lllllllllllllIlIIlIIllIIlllIIIIl.add(lllllllllllllIlIIlIIllIIllIlllll, lllllllllllllIlIIlIIllIIllIlllIl, lllllllllllllIlIIlIIllIIllIllllI));
            "".length();
            ++lllllllllllllIlIIlIIllIIlllIIIII;
        }
        super.decorate(lllllllllllllIlIIlIIllIIlllIIIll, lllllllllllllIlIIlIIllIIlllIIIlI, lllllllllllllIlIIlIIllIIlllIIIIl);
    }
    
    private static boolean lIlllIllIlllIII(final int lllllllllllllIlIIlIIllIIllIlIIlI, final int lllllllllllllIlIIlIIllIIllIlIIIl) {
        return lllllllllllllIlIIlIIllIIllIlIIlI >= lllllllllllllIlIIlIIllIIllIlIIIl;
    }
    
    protected BiomeGenSavanna(final int lllllllllllllIlIIlIIllIIllllllII) {
        super(lllllllllllllIlIIlIIllIIllllllII);
        this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, BiomeGenSavanna.lIIIIllIIllllI[1], BiomeGenSavanna.lIIIIllIIllllI[2], BiomeGenSavanna.lIIIIllIIllllI[3]));
        "".length();
        this.theBiomeDecorator.treesPerChunk = BiomeGenSavanna.lIIIIllIIllllI[1];
        this.theBiomeDecorator.flowersPerChunk = BiomeGenSavanna.lIIIIllIIllllI[4];
        this.theBiomeDecorator.grassPerChunk = BiomeGenSavanna.lIIIIllIIllllI[5];
    }
    
    private static void lIlllIllIllIllI() {
        (lIIIIllIIllllI = new int[11])[0] = ((0xFC ^ 0xAF) & ~(0x69 ^ 0x3A));
        BiomeGenSavanna.lIIIIllIIllllI[1] = " ".length();
        BiomeGenSavanna.lIIIIllIIllllI[2] = "  ".length();
        BiomeGenSavanna.lIIIIllIIllllI[3] = (0x37 ^ 0x31);
        BiomeGenSavanna.lIIIIllIIllllI[4] = (0x7A ^ 0x7E);
        BiomeGenSavanna.lIIIIllIIllllI[5] = (0x60 ^ 0x74);
        BiomeGenSavanna.lIIIIllIIllllI[6] = (0x4B ^ 0x3C ^ (0xD5 ^ 0xA7));
        BiomeGenSavanna.lIIIIllIIllllI[7] = (0xBB ^ 0xAB);
        BiomeGenSavanna.lIIIIllIIllllI[8] = (0xB7 ^ 0x97 ^ (0x11 ^ 0x39));
        BiomeGenSavanna.lIIIIllIIllllI[9] = (0x28 ^ 0x8);
        BiomeGenSavanna.lIIIIllIIllllI[10] = (0x5D ^ 0x68 ^ (0x6F ^ 0x5D));
    }
    
    public static class Mutated extends BiomeGenMutated
    {
        private static final /* synthetic */ int[] lIIlllllIlIlIl;
        
        private static void llIllllIlIllIII() {
            (lIIlllllIlIlIl = new int[2])[0] = "  ".length();
            Mutated.lIIlllllIlIlIl[1] = (0xAB ^ 0x8E ^ (0x66 ^ 0x46));
        }
        
        private static boolean llIllllIlIllIlI(final int lllllllllllllIIlIIlIIIllIlllIIlI) {
            return lllllllllllllIIlIIlIIIllIlllIIlI > 0;
        }
        
        private static int llIllllIlIllIIl(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        @Override
        public void decorate(final World lllllllllllllIIlIIlIIIllIlllIllI, final Random lllllllllllllIIlIIlIIIllIlllIlIl, final BlockPos lllllllllllllIIlIIlIIIllIllllIII) {
            this.theBiomeDecorator.decorate(lllllllllllllIIlIIlIIIllIlllIllI, lllllllllllllIIlIIlIIIllIlllIlIl, this, lllllllllllllIIlIIlIIIllIllllIII);
        }
        
        public Mutated(final int lllllllllllllIIlIIlIIIlllIIlIllI, final BiomeGenBase lllllllllllllIIlIIlIIIlllIIllIII) {
            super(lllllllllllllIIlIIlIIIlllIIlIllI, lllllllllllllIIlIIlIIIlllIIllIII);
            this.theBiomeDecorator.treesPerChunk = Mutated.lIIlllllIlIlIl[0];
            this.theBiomeDecorator.flowersPerChunk = Mutated.lIIlllllIlIlIl[0];
            this.theBiomeDecorator.grassPerChunk = Mutated.lIIlllllIlIlIl[1];
        }
        
        static {
            llIllllIlIllIII();
        }
        
        @Override
        public void genTerrainBlocks(final World lllllllllllllIIlIIlIIIlllIIIllII, final Random lllllllllllllIIlIIlIIIlllIIIlIll, final ChunkPrimer lllllllllllllIIlIIlIIIlllIIIlIlI, final int lllllllllllllIIlIIlIIIlllIIIIIlI, final int lllllllllllllIIlIIlIIIlllIIIIIIl, final double lllllllllllllIIlIIlIIIlllIIIIlll) {
            this.topBlock = Blocks.grass.getDefaultState();
            this.fillerBlock = Blocks.dirt.getDefaultState();
            if (llIllllIlIllIlI(llIllllIlIllIIl(lllllllllllllIIlIIlIIIlllIIIIlll, 1.75))) {
                this.topBlock = Blocks.stone.getDefaultState();
                this.fillerBlock = Blocks.stone.getDefaultState();
                "".length();
                if (((12 + 68 - 68 + 178 ^ 160 + 140 - 175 + 44) & (22 + 43 + 11 + 99 ^ 144 + 49 - 119 + 110 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else if (llIllllIlIllIlI(llIllllIlIllIIl(lllllllllllllIIlIIlIIIlllIIIIlll, -0.5))) {
                this.topBlock = Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT);
            }
            this.generateBiomeTerrain(lllllllllllllIIlIIlIIIlllIIIllII, lllllllllllllIIlIIlIIIlllIIIlIll, lllllllllllllIIlIIlIIIlllIIIlIlI, lllllllllllllIIlIIlIIIlllIIIIIlI, lllllllllllllIIlIIlIIIlllIIIIIIl, lllllllllllllIIlIIlIIIlllIIIIlll);
        }
    }
}
