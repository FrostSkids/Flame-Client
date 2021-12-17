// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockOldLog;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.world.gen.feature.WorldGenerator;
import java.util.Random;
import net.minecraft.block.state.IBlockState;

public class BiomeGenJungle extends BiomeGenBase
{
    private static final /* synthetic */ int[] lllIllIllIIIII;
    private static final /* synthetic */ IBlockState field_181620_aE;
    private static final /* synthetic */ IBlockState field_181621_aF;
    private static final /* synthetic */ IBlockState field_181622_aG;
    private /* synthetic */ boolean field_150614_aC;
    
    @Override
    public WorldGenerator getRandomWorldGenForGrass(final Random llllllllllllIlIllIIIllllIIIIllIl) {
        WorldGenTallGrass worldGenTallGrass;
        if (lIlIIlIlIIIIlIlI(llllllllllllIlIllIIIllllIIIIllIl.nextInt(BiomeGenJungle.lllIllIllIIIII[4]))) {
            worldGenTallGrass = new WorldGenTallGrass(BlockTallGrass.EnumType.FERN);
            "".length();
            if (((0xB ^ 0x65 ^ (0x82 ^ 0xB7)) & (0x5B ^ 0x7D ^ (0x5 ^ 0x78) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            worldGenTallGrass = new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
        }
        return worldGenTallGrass;
    }
    
    @Override
    public WorldGenAbstractTree genBigTreeChance(final Random llllllllllllIlIllIIIllllIIIlIIll) {
        WorldGenAbstractTree worldGeneratorBigTree;
        if (lIlIIlIlIIIIlIlI(llllllllllllIlIllIIIllllIIIlIIll.nextInt(BiomeGenJungle.lllIllIllIIIII[6]))) {
            worldGeneratorBigTree = this.worldGeneratorBigTree;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else if (lIlIIlIlIIIIlIlI(llllllllllllIlIllIIIllllIIIlIIll.nextInt(BiomeGenJungle.lllIllIllIIIII[1]))) {
            worldGeneratorBigTree = new WorldGenShrub(BiomeGenJungle.field_181620_aE, BiomeGenJungle.field_181622_aG);
            "".length();
            if (((0xB2 ^ 0xA0) & ~(0x3A ^ 0x28)) < 0) {
                return null;
            }
        }
        else if (lIlIIlIlIIIIlIlI(this.field_150614_aC ? 1 : 0) && lIlIIlIlIIIIlIlI(llllllllllllIlIllIIIllllIIIlIIll.nextInt(BiomeGenJungle.lllIllIllIIIII[7]))) {
            worldGeneratorBigTree = new WorldGenMegaJungle((boolean)(BiomeGenJungle.lllIllIllIIIII[0] != 0), BiomeGenJungle.lllIllIllIIIII[6], BiomeGenJungle.lllIllIllIIIII[8], BiomeGenJungle.field_181620_aE, BiomeGenJungle.field_181621_aF);
            "".length();
            if (((1 + 53 - 28 + 126 ^ 78 + 75 - 115 + 147) & (0x26 ^ 0x73 ^ (0x13 ^ 0x67) ^ -" ".length())) > " ".length()) {
                return null;
            }
        }
        else {
            worldGeneratorBigTree = new WorldGenTrees((boolean)(BiomeGenJungle.lllIllIllIIIII[0] != 0), BiomeGenJungle.lllIllIllIIIII[4] + llllllllllllIlIllIIIllllIIIlIIll.nextInt(BiomeGenJungle.lllIllIllIIIII[9]), BiomeGenJungle.field_181620_aE, BiomeGenJungle.field_181621_aF, (boolean)(BiomeGenJungle.lllIllIllIIIII[5] != 0));
        }
        return worldGeneratorBigTree;
    }
    
    public BiomeGenJungle(final int llllllllllllIlIllIIIllllIIIllIll, final boolean llllllllllllIlIllIIIllllIIIlIlll) {
        super(llllllllllllIlIllIIIllllIIIllIll);
        this.field_150614_aC = llllllllllllIlIllIIIllllIIIlIlll;
        if (lIlIIlIlIIIIlIIl(llllllllllllIlIllIIIllllIIIlIlll ? 1 : 0)) {
            this.theBiomeDecorator.treesPerChunk = BiomeGenJungle.lllIllIllIIIII[1];
            "".length();
            if (((0x3D ^ 0x63 ^ (0x27 ^ 0x53)) & (77 + 148 - 219 + 154 ^ 136 + 82 - 175 + 95 ^ -" ".length())) != 0x0) {
                throw null;
            }
        }
        else {
            this.theBiomeDecorator.treesPerChunk = BiomeGenJungle.lllIllIllIIIII[2];
        }
        this.theBiomeDecorator.grassPerChunk = BiomeGenJungle.lllIllIllIIIII[3];
        this.theBiomeDecorator.flowersPerChunk = BiomeGenJungle.lllIllIllIIIII[4];
        if (lIlIIlIlIIIIlIlI(llllllllllllIlIllIIIllllIIIlIlll ? 1 : 0)) {
            this.spawnableMonsterList.add(new SpawnListEntry(EntityOcelot.class, BiomeGenJungle.lllIllIllIIIII[1], BiomeGenJungle.lllIllIllIIIII[5], BiomeGenJungle.lllIllIllIIIII[5]));
            "".length();
        }
        this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, BiomeGenJungle.lllIllIllIIIII[6], BiomeGenJungle.lllIllIllIIIII[4], BiomeGenJungle.lllIllIllIIIII[4]));
        "".length();
    }
    
    private static void lIlIIlIlIIIIlIII() {
        (lllIllIllIIIII = new int[13])[0] = ((0xBA ^ 0xAB) & ~(0x8C ^ 0x9D));
        BiomeGenJungle.lllIllIllIIIII[1] = "  ".length();
        BiomeGenJungle.lllIllIllIIIII[2] = (80 + 52 - 97 + 124 ^ 63 + 158 - 87 + 39);
        BiomeGenJungle.lllIllIllIIIII[3] = (25 + 5 + 100 + 18 ^ 0 + 127 - 16 + 30);
        BiomeGenJungle.lllIllIllIIIII[4] = (0x8C ^ 0x88);
        BiomeGenJungle.lllIllIllIIIII[5] = " ".length();
        BiomeGenJungle.lllIllIllIIIII[6] = (0x49 ^ 0x43);
        BiomeGenJungle.lllIllIllIIIII[7] = "   ".length();
        BiomeGenJungle.lllIllIllIIIII[8] = (0x38 ^ 0x2C);
        BiomeGenJungle.lllIllIllIIIII[9] = (58 + 106 + 4 + 30 ^ 60 + 163 - 107 + 77);
        BiomeGenJungle.lllIllIllIIIII[10] = (19 + 92 + 22 + 40 ^ 11 + 116 - 38 + 100);
        BiomeGenJungle.lllIllIllIIIII[11] = (0xC ^ 0x1F ^ (0x1F ^ 0x4));
        BiomeGenJungle.lllIllIllIIIII[12] = (0xAA ^ 0x8F) + (0xEC ^ 0x8D) - (0x7A ^ 0x75) + (0xAB ^ 0xA2);
    }
    
    @Override
    public void decorate(final World llllllllllllIlIllIIIllllIIIIIIIl, final Random llllllllllllIlIllIIIllllIIIIIIII, final BlockPos llllllllllllIlIllIIIlllIllllIlIl) {
        super.decorate(llllllllllllIlIllIIIllllIIIIIIIl, llllllllllllIlIllIIIllllIIIIIIII, llllllllllllIlIllIIIlllIllllIlIl);
        final int llllllllllllIlIllIIIlllIlllllllI = llllllllllllIlIllIIIllllIIIIIIII.nextInt(BiomeGenJungle.lllIllIllIIIII[10]) + BiomeGenJungle.lllIllIllIIIII[11];
        int llllllllllllIlIllIIIlllIllllllIl = llllllllllllIlIllIIIllllIIIIIIII.nextInt(BiomeGenJungle.lllIllIllIIIII[10]) + BiomeGenJungle.lllIllIllIIIII[11];
        int llllllllllllIlIllIIIlllIllllllII = llllllllllllIlIllIIIllllIIIIIIII.nextInt(llllllllllllIlIllIIIllllIIIIIIIl.getHeight(llllllllllllIlIllIIIlllIllllIlIl.add(llllllllllllIlIllIIIlllIlllllllI, BiomeGenJungle.lllIllIllIIIII[0], llllllllllllIlIllIIIlllIllllllIl)).getY() * BiomeGenJungle.lllIllIllIIIII[1]);
        new WorldGenMelon().generate(llllllllllllIlIllIIIllllIIIIIIIl, llllllllllllIlIllIIIllllIIIIIIII, llllllllllllIlIllIIIlllIllllIlIl.add(llllllllllllIlIllIIIlllIlllllllI, llllllllllllIlIllIIIlllIllllllII, llllllllllllIlIllIIIlllIllllllIl));
        "".length();
        final WorldGenVines llllllllllllIlIllIIIlllIlllllIll = new WorldGenVines();
        llllllllllllIlIllIIIlllIllllllIl = BiomeGenJungle.lllIllIllIIIII[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIlIIlIlIIIIlIll(llllllllllllIlIllIIIlllIllllllIl, BiomeGenJungle.lllIllIllIIIII[2])) {
            llllllllllllIlIllIIIlllIllllllII = llllllllllllIlIllIIIllllIIIIIIII.nextInt(BiomeGenJungle.lllIllIllIIIII[10]) + BiomeGenJungle.lllIllIllIIIII[11];
            final int llllllllllllIlIllIIIlllIlllllIlI = BiomeGenJungle.lllIllIllIIIII[12];
            final int llllllllllllIlIllIIIlllIlllllIIl = llllllllllllIlIllIIIllllIIIIIIII.nextInt(BiomeGenJungle.lllIllIllIIIII[10]) + BiomeGenJungle.lllIllIllIIIII[11];
            llllllllllllIlIllIIIlllIlllllIll.generate(llllllllllllIlIllIIIllllIIIIIIIl, llllllllllllIlIllIIIllllIIIIIIII, llllllllllllIlIllIIIlllIllllIlIl.add(llllllllllllIlIllIIIlllIllllllII, BiomeGenJungle.lllIllIllIIIII[12], llllllllllllIlIllIIIlllIlllllIIl));
            "".length();
            ++llllllllllllIlIllIIIlllIllllllIl;
        }
    }
    
    private static boolean lIlIIlIlIIIIlIIl(final int llllllllllllIlIllIIIlllIlllIlIIl) {
        return llllllllllllIlIllIIIlllIlllIlIIl != 0;
    }
    
    static {
        lIlIIlIlIIIIlIII();
        field_181620_aE = Blocks.log.getDefaultState().withProperty(BlockOldLog.VARIANT, BlockPlanks.EnumType.JUNGLE);
        field_181621_aF = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.JUNGLE).withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(BiomeGenJungle.lllIllIllIIIII[0] != 0));
        field_181622_aG = Blocks.leaves.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty((IProperty<Comparable>)BlockLeaves.CHECK_DECAY, (boolean)(BiomeGenJungle.lllIllIllIIIII[0] != 0));
    }
    
    private static boolean lIlIIlIlIIIIlIll(final int llllllllllllIlIllIIIlllIlllIllII, final int llllllllllllIlIllIIIlllIlllIlIll) {
        return llllllllllllIlIllIIIlllIlllIllII >= llllllllllllIlIllIIIlllIlllIlIll;
    }
    
    private static boolean lIlIIlIlIIIIlIlI(final int llllllllllllIlIllIIIlllIlllIIlll) {
        return llllllllllllIlIllIIIlllIlllIIlll == 0;
    }
}
