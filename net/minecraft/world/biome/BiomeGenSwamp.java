// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.block.BlockFlower;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.world.chunk.ChunkPrimer;
import java.util.Random;
import net.minecraft.world.World;

public class BiomeGenSwamp extends BiomeGenBase
{
    private static final /* synthetic */ int[] lllIlIlllIllII;
    
    private static int lIlIIIlllIIIIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void genTerrainBlocks(final World llllllllllllIlIllIlIIlIlllIIlllI, final Random llllllllllllIlIllIlIIlIlllIIllIl, final ChunkPrimer llllllllllllIlIllIlIIlIlllIIllII, final int llllllllllllIlIllIlIIlIlllIlIllI, final int llllllllllllIlIllIlIIlIlllIIlIlI, final double llllllllllllIlIllIlIIlIlllIlIlII) {
        final double llllllllllllIlIllIlIIlIlllIlIIll = BiomeGenSwamp.GRASS_COLOR_NOISE.func_151601_a(llllllllllllIlIllIlIIlIlllIlIllI * 0.25, llllllllllllIlIllIlIIlIlllIIlIlI * 0.25);
        if (lIlIIIlllIIIlIII(lIlIIIlllIIIIllI(llllllllllllIlIllIlIIlIlllIlIIll, 0.0))) {
            final int llllllllllllIlIllIlIIlIlllIlIIlI = llllllllllllIlIllIlIIlIlllIlIllI & BiomeGenSwamp.lllIlIlllIllII[10];
            final int llllllllllllIlIllIlIIlIlllIlIIIl = llllllllllllIlIllIlIIlIlllIIlIlI & BiomeGenSwamp.lllIlIlllIllII[10];
            int llllllllllllIlIllIlIIlIlllIlIIII = BiomeGenSwamp.lllIlIlllIllII[11];
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
            while (!lIlIIIlllIIIIlIl(llllllllllllIlIllIlIIlIlllIlIIII)) {
                if (lIlIIIlllIIIlIIl(llllllllllllIlIllIlIIlIlllIIllII.getBlockState(llllllllllllIlIllIlIIlIlllIlIIIl, llllllllllllIlIllIlIIlIlllIlIIII, llllllllllllIlIllIlIIlIlllIlIIlI).getBlock().getMaterial(), Material.air)) {
                    if (!lIlIIIlllIIIlIlI(llllllllllllIlIllIlIIlIlllIlIIII, BiomeGenSwamp.lllIlIlllIllII[12]) || !lIlIIIlllIIIlIIl(llllllllllllIlIllIlIIlIlllIIllII.getBlockState(llllllllllllIlIllIlIIlIlllIlIIIl, llllllllllllIlIllIlIIlIlllIlIIII, llllllllllllIlIllIlIIlIlllIlIIlI).getBlock(), Blocks.water)) {
                        break;
                    }
                    llllllllllllIlIllIlIIlIlllIIllII.setBlockState(llllllllllllIlIllIlIIlIlllIlIIIl, llllllllllllIlIllIlIIlIlllIlIIII, llllllllllllIlIllIlIIlIlllIlIIlI, Blocks.water.getDefaultState());
                    if (!lIlIIIlllIIIIlIl(lIlIIIlllIIIIlll(llllllllllllIlIllIlIIlIlllIlIIll, 0.12))) {
                        break;
                    }
                    llllllllllllIlIllIlIIlIlllIIllII.setBlockState(llllllllllllIlIllIlIIlIlllIlIIIl, llllllllllllIlIllIlIIlIlllIlIIII + BiomeGenSwamp.lllIlIlllIllII[1], llllllllllllIlIllIlIIlIlllIlIIlI, Blocks.waterlily.getDefaultState());
                    "".length();
                    if (-(0x64 ^ 0x60) >= 0) {
                        return;
                    }
                    break;
                }
                else {
                    --llllllllllllIlIllIlIIlIlllIlIIII;
                }
            }
        }
        this.generateBiomeTerrain(llllllllllllIlIllIlIIlIlllIIlllI, llllllllllllIlIllIlIIlIlllIIllIl, llllllllllllIlIllIlIIlIlllIIllII, llllllllllllIlIllIlIIlIlllIlIllI, llllllllllllIlIllIlIIlIlllIIlIlI, llllllllllllIlIllIlIIlIlllIlIlII);
    }
    
    private static boolean lIlIIIlllIIIlIIl(final Object llllllllllllIlIllIlIIlIllIlllllI, final Object llllllllllllIlIllIlIIlIllIllllIl) {
        return llllllllllllIlIllIlIIlIllIlllllI != llllllllllllIlIllIlIIlIllIllllIl;
    }
    
    private static void lIlIIIlllIIIIIll() {
        (lllIlIlllIllII = new int[13])[0] = "  ".length();
        BiomeGenSwamp.lllIlIlllIllII[1] = " ".length();
        BiomeGenSwamp.lllIlIlllIllII[2] = (92 + 83 - 52 + 83 ^ 63 + 18 + 18 + 99);
        BiomeGenSwamp.lllIlIlllIllII[3] = (0xB9 ^ 0xB3);
        BiomeGenSwamp.lllIlIlllIllII[4] = (0xAB ^ 0xAF);
        BiomeGenSwamp.lllIlIlllIllII[5] = ((0x41 ^ 0x64 ^ (0x26 ^ 0x55)) & (0xC7 ^ 0x8F ^ (0xBC ^ 0xA2) ^ -" ".length()));
        BiomeGenSwamp.lllIlIlllIllII[6] = (0x82 ^ 0x87);
        BiomeGenSwamp.lllIlIlllIllII[7] = (0xFFFFFFAF & 0xE0FFFE);
        BiomeGenSwamp.lllIlIlllIllII[8] = (-(0xFFFFDD63 & 0x239E) & (0xFFFFFF7D & 0x4C77BF));
        BiomeGenSwamp.lllIlIlllIllII[9] = (-(42 + 65 + 19 + 9) & (0xFFFFF4BF & 0x6A7BFF));
        BiomeGenSwamp.lllIlIlllIllII[10] = (0xA4 ^ 0xAB);
        BiomeGenSwamp.lllIlIlllIllII[11] = 196 + 194 - 187 + 52;
        BiomeGenSwamp.lllIlIlllIllII[12] = (0x63 ^ 0x5D);
    }
    
    private static int lIlIIIlllIIIIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIlIIIlllIIIIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public int getGrassColorAtPos(final BlockPos llllllllllllIlIllIlIIlIllllIllII) {
        final double llllllllllllIlIllIlIIlIllllIllIl = BiomeGenSwamp.GRASS_COLOR_NOISE.func_151601_a(llllllllllllIlIllIlIIlIllllIllII.getX() * 0.0225, llllllllllllIlIllIlIIlIllllIllII.getZ() * 0.0225);
        int n;
        if (lIlIIIlllIIIIlIl(lIlIIIlllIIIIlII(llllllllllllIlIllIlIIlIllllIllIl, -0.1))) {
            n = BiomeGenSwamp.lllIlIlllIllII[8];
            "".length();
            if ((0xB9 ^ 0xBD) <= 0) {
                return (0x7D ^ 0x2F) & ~(0xC2 ^ 0x90);
            }
        }
        else {
            n = BiomeGenSwamp.lllIlIlllIllII[9];
        }
        return n;
    }
    
    protected BiomeGenSwamp(final int llllllllllllIlIllIlIIlIllllllIII) {
        super(llllllllllllIlIllIlIIlIllllllIII);
        this.theBiomeDecorator.treesPerChunk = BiomeGenSwamp.lllIlIlllIllII[0];
        this.theBiomeDecorator.flowersPerChunk = BiomeGenSwamp.lllIlIlllIllII[1];
        this.theBiomeDecorator.deadBushPerChunk = BiomeGenSwamp.lllIlIlllIllII[1];
        this.theBiomeDecorator.mushroomsPerChunk = BiomeGenSwamp.lllIlIlllIllII[2];
        this.theBiomeDecorator.reedsPerChunk = BiomeGenSwamp.lllIlIlllIllII[3];
        this.theBiomeDecorator.clayPerChunk = BiomeGenSwamp.lllIlIlllIllII[1];
        this.theBiomeDecorator.waterlilyPerChunk = BiomeGenSwamp.lllIlIlllIllII[4];
        this.theBiomeDecorator.sandPerChunk2 = BiomeGenSwamp.lllIlIlllIllII[5];
        this.theBiomeDecorator.sandPerChunk = BiomeGenSwamp.lllIlIlllIllII[5];
        this.theBiomeDecorator.grassPerChunk = BiomeGenSwamp.lllIlIlllIllII[6];
        this.waterColorMultiplier = BiomeGenSwamp.lllIlIlllIllII[7];
        this.spawnableMonsterList.add(new SpawnListEntry(EntitySlime.class, BiomeGenSwamp.lllIlIlllIllII[1], BiomeGenSwamp.lllIlIlllIllII[1], BiomeGenSwamp.lllIlIlllIllII[1]));
        "".length();
    }
    
    private static boolean lIlIIIlllIIIlIII(final int llllllllllllIlIllIlIIlIllIllIlll) {
        return llllllllllllIlIllIlIIlIllIllIlll > 0;
    }
    
    private static boolean lIlIIIlllIIIlIlI(final int llllllllllllIlIllIlIIlIlllIIIIlI, final int llllllllllllIlIllIlIIlIlllIIIIIl) {
        return llllllllllllIlIllIlIIlIlllIIIIlI == llllllllllllIlIllIlIIlIlllIIIIIl;
    }
    
    @Override
    public BlockFlower.EnumFlowerType pickRandomFlower(final Random llllllllllllIlIllIlIIlIllllIIlll, final BlockPos llllllllllllIlIllIlIIlIllllIIllI) {
        return BlockFlower.EnumFlowerType.BLUE_ORCHID;
    }
    
    static {
        lIlIIIlllIIIIIll();
    }
    
    @Override
    public int getFoliageColorAtPos(final BlockPos llllllllllllIlIllIlIIlIllllIlIIl) {
        return BiomeGenSwamp.lllIlIlllIllII[9];
    }
    
    private static boolean lIlIIIlllIIIIlIl(final int llllllllllllIlIllIlIIlIllIlllIlI) {
        return llllllllllllIlIllIlIIlIllIlllIlI < 0;
    }
    
    @Override
    public WorldGenAbstractTree genBigTreeChance(final Random llllllllllllIlIllIlIIlIlllllIIll) {
        return this.worldGeneratorSwamp;
    }
}
