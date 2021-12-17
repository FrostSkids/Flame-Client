// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.world.gen.feature.WorldGenWaterlily;
import net.minecraft.world.gen.feature.WorldGenCactus;
import net.minecraft.world.gen.feature.WorldGenReed;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.GeneratorBushFeature;
import net.minecraft.world.gen.feature.WorldGenSand;
import net.minecraft.world.gen.feature.WorldGenClay;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockStone;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.block.BlockFlower;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.block.Block;
import net.minecraft.world.gen.feature.WorldGenLiquids;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenPumpkin;
import net.minecraft.world.gen.feature.WorldGenDeadBush;
import net.minecraft.block.material.Material;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import java.util.Random;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeDecorator
{
    protected /* synthetic */ WorldGenerator coalGen;
    protected /* synthetic */ int bigMushroomsPerChunk;
    protected /* synthetic */ ChunkProviderSettings chunkProviderSettings;
    protected /* synthetic */ Random randomGenerator;
    protected /* synthetic */ WorldGenerator gravelAsSandGen;
    protected /* synthetic */ WorldGenerator waterlilyGen;
    protected /* synthetic */ int grassPerChunk;
    protected /* synthetic */ WorldGenerator goldGen;
    protected /* synthetic */ WorldGenerator bigMushroomGen;
    protected /* synthetic */ WorldGenFlowers yellowFlowerGen;
    protected /* synthetic */ WorldGenerator andesiteGen;
    protected /* synthetic */ WorldGenerator sandGen;
    protected /* synthetic */ WorldGenerator ironGen;
    protected /* synthetic */ int sandPerChunk2;
    protected /* synthetic */ int sandPerChunk;
    protected /* synthetic */ int reedsPerChunk;
    protected /* synthetic */ int deadBushPerChunk;
    private static final /* synthetic */ int[] lIlllllIIlllII;
    protected /* synthetic */ WorldGenerator dirtGen;
    protected /* synthetic */ WorldGenerator redstoneGen;
    protected /* synthetic */ int treesPerChunk;
    protected /* synthetic */ WorldGenerator gravelGen;
    protected /* synthetic */ int waterlilyPerChunk;
    protected /* synthetic */ int flowersPerChunk;
    private static final /* synthetic */ String[] lIlllllIIllIIl;
    protected /* synthetic */ WorldGenerator mushroomRedGen;
    protected /* synthetic */ WorldGenerator mushroomBrownGen;
    protected /* synthetic */ WorldGenerator diamondGen;
    protected /* synthetic */ int cactiPerChunk;
    protected /* synthetic */ WorldGenerator graniteGen;
    protected /* synthetic */ BlockPos field_180294_c;
    protected /* synthetic */ int clayPerChunk;
    protected /* synthetic */ WorldGenerator reedGen;
    protected /* synthetic */ WorldGenerator lapisGen;
    protected /* synthetic */ int mushroomsPerChunk;
    protected /* synthetic */ WorldGenerator cactusGen;
    public /* synthetic */ boolean generateLakes;
    protected /* synthetic */ World currentWorld;
    protected /* synthetic */ WorldGenerator clayGen;
    protected /* synthetic */ WorldGenerator dioriteGen;
    
    private static String lIIIIlIlIlIIIIII(final String llllllllllllIllllIIllIllIllIlllI, final String llllllllllllIllllIIllIllIllIllIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIllIllIlllIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIllIllIllIllIl.getBytes(StandardCharsets.UTF_8)), BiomeDecorator.lIlllllIIlllII[8]), "DES");
            final Cipher llllllllllllIllllIIllIllIlllIIII = Cipher.getInstance("DES");
            llllllllllllIllllIIllIllIlllIIII.init(BiomeDecorator.lIlllllIIlllII[3], llllllllllllIllllIIllIllIlllIIIl);
            return new String(llllllllllllIllllIIllIllIlllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIllIllIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIllIllIllIllll) {
            llllllllllllIllllIIllIllIllIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIlIlIIllll(final int llllllllllllIllllIIllIllIlIllllI, final int llllllllllllIllllIIllIllIlIlllIl) {
        return llllllllllllIllllIIllIllIlIllllI < llllllllllllIllllIIllIllIlIlllIl;
    }
    
    protected void genDecorations(final BiomeGenBase llllllllllllIllllIIlllIIIIIIlIIl) {
        this.generateOres();
        int llllllllllllIllllIIlllIIIIIIlIII = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if (-" ".length() > ((0x9E ^ 0x8B ^ (0x40 ^ 0x7F)) & ("  ".length() ^ (0xAD ^ 0x85) ^ -" ".length()))) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIlllIIIIIIlIII, this.sandPerChunk2)) {
            final int llllllllllllIllllIIlllIIIIIIIlll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIlllIIIIIIIllI = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            this.sandGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.field_180294_c.add(llllllllllllIllllIIlllIIIIIIIlll, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIlllIIIIIIIllI)));
            "".length();
            ++llllllllllllIllllIIlllIIIIIIlIII;
        }
        int llllllllllllIllllIIlllIIIIIIIlIl = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if ((0x84 ^ 0x81) == 0x0) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIlllIIIIIIIlIl, this.clayPerChunk)) {
            final int llllllllllllIllllIIlllIIIIIIIlII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIlllIIIIIIIIll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            this.clayGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.field_180294_c.add(llllllllllllIllllIIlllIIIIIIIlII, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIlllIIIIIIIIll)));
            "".length();
            ++llllllllllllIllllIIlllIIIIIIIlIl;
        }
        int llllllllllllIllllIIlllIIIIIIIIlI = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if ("  ".length() <= " ".length()) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIlllIIIIIIIIlI, this.sandPerChunk)) {
            final int llllllllllllIllllIIlllIIIIIIIIIl = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIlllIIIIIIIIII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            this.gravelAsSandGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.field_180294_c.add(llllllllllllIllllIIlllIIIIIIIIIl, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIlllIIIIIIIIII)));
            "".length();
            ++llllllllllllIllllIIlllIIIIIIIIlI;
        }
        int llllllllllllIllllIIllIllllllllll = this.treesPerChunk;
        if (lIIIIlIlIlIIlIlI(this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[9]))) {
            ++llllllllllllIllllIIllIllllllllll;
        }
        int llllllllllllIllllIIllIlllllllllI = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if (-"  ".length() >= 0) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllllllllI, llllllllllllIllllIIllIllllllllll)) {
            final int llllllllllllIllllIIllIllllllllIl = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllllllII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final WorldGenAbstractTree llllllllllllIllllIIllIlllllllIll = llllllllllllIllllIIlllIIIIIIlIIl.genBigTreeChance(this.randomGenerator);
            llllllllllllIllllIIllIlllllllIll.func_175904_e();
            final BlockPos llllllllllllIllllIIllIlllllllIlI = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIllllllllIl, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllllllII));
            if (lIIIIlIlIlIIlIll(llllllllllllIllllIIllIlllllllIll.generate(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIlllllllIlI) ? 1 : 0)) {
                llllllllllllIllllIIllIlllllllIll.func_180711_a(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIlllllllIlI);
            }
            ++llllllllllllIllllIIllIlllllllllI;
        }
        int llllllllllllIllllIIllIlllllllIIl = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllllllIIl, this.bigMushroomsPerChunk)) {
            final int llllllllllllIllllIIllIlllllllIII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllllIlll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            this.bigMushroomGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIlllllllIII, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllllIlll)));
            "".length();
            ++llllllllllllIllllIIllIlllllllIIl;
        }
        int llllllllllllIllllIIllIllllllIllI = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIllllllIllI, this.flowersPerChunk)) {
            final int llllllllllllIllllIIllIllllllIlIl = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllllIlII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllllIIll = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIllllllIlIl, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllllIlII)).getY() + BiomeDecorator.lIlllllIIlllII[10];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIllllllIIll)) {
                final int llllllllllllIllllIIllIllllllIIlI = this.randomGenerator.nextInt(llllllllllllIllllIIllIllllllIIll);
                final BlockPos llllllllllllIllllIIllIllllllIIIl = this.field_180294_c.add(llllllllllllIllllIIllIllllllIlIl, llllllllllllIllllIIllIllllllIIlI, llllllllllllIllllIIllIllllllIlII);
                final BlockFlower.EnumFlowerType llllllllllllIllllIIllIllllllIIII = llllllllllllIllllIIlllIIIIIIlIIl.pickRandomFlower(this.randomGenerator, llllllllllllIllllIIllIllllllIIIl);
                final BlockFlower llllllllllllIllllIIllIlllllIllll = llllllllllllIllllIIllIllllllIIII.getBlockType().getBlock();
                if (lIIIIlIlIlIIllIl(llllllllllllIllllIIllIlllllIllll.getMaterial(), Material.air)) {
                    this.yellowFlowerGen.setGeneratedBlock(llllllllllllIllllIIllIlllllIllll, llllllllllllIllllIIllIllllllIIII);
                    this.yellowFlowerGen.generate(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIllllllIIIl);
                    "".length();
                }
            }
            ++llllllllllllIllllIIllIllllllIllI;
        }
        int llllllllllllIllllIIllIlllllIlllI = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if (((48 + 52 - 38 + 94 ^ 53 + 48 + 15 + 46) & (83 + 0 - 50 + 119 ^ 67 + 23 + 75 + 1 ^ -" ".length())) > 0) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllllIlllI, this.grassPerChunk)) {
            final int llllllllllllIllllIIllIlllllIllIl = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIlllllIllII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIlllllIlIll = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIlllllIllIl, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIlllllIllII)).getY() * BiomeDecorator.lIlllllIIlllII[3];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIlllllIlIll)) {
                final int llllllllllllIllllIIllIlllllIlIlI = this.randomGenerator.nextInt(llllllllllllIllllIIllIlllllIlIll);
                llllllllllllIllllIIlllIIIIIIlIIl.getRandomWorldGenForGrass(this.randomGenerator).generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(llllllllllllIllllIIllIlllllIllIl, llllllllllllIllllIIllIlllllIlIlI, llllllllllllIllllIIllIlllllIllII));
                "".length();
            }
            ++llllllllllllIllllIIllIlllllIlllI;
        }
        int llllllllllllIllllIIllIlllllIlIIl = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllllIlIIl, this.deadBushPerChunk)) {
            final int llllllllllllIllllIIllIlllllIlIII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIlllllIIlll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIlllllIIllI = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIlllllIlIII, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIlllllIIlll)).getY() * BiomeDecorator.lIlllllIIlllII[3];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIlllllIIllI)) {
                final int llllllllllllIllllIIllIlllllIIlIl = this.randomGenerator.nextInt(llllllllllllIllllIIllIlllllIIllI);
                new WorldGenDeadBush().generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(llllllllllllIllllIIllIlllllIlIII, llllllllllllIllllIIllIlllllIIlIl, llllllllllllIllllIIllIlllllIIlll));
                "".length();
            }
            ++llllllllllllIllllIIllIlllllIlIIl;
        }
        int llllllllllllIllllIIllIlllllIIlII = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if (-(0x6D ^ 0x68) >= 0) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllllIIlII, this.waterlilyPerChunk)) {
            final int llllllllllllIllllIIllIlllllIIIll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIlllllIIIlI = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIlllllIIIIl = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIlllllIIIll, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIlllllIIIlI)).getY() * BiomeDecorator.lIlllllIIlllII[3];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIlllllIIIIl)) {
                final int llllllllllllIllllIIllIlllllIIIII = this.randomGenerator.nextInt(llllllllllllIllllIIllIlllllIIIIl);
                BlockPos llllllllllllIllllIIllIllllIlllll = this.field_180294_c.add(llllllllllllIllllIIllIlllllIIIll, llllllllllllIllllIIllIlllllIIIII, llllllllllllIllllIIllIlllllIIIlI);
                "".length();
                if ((((0x67 ^ 0x73) & ~(0x1F ^ 0xB)) ^ (0xBB ^ 0xBE)) <= 0) {
                    return;
                }
                while (!lIIIIlIlIlIIlllI(llllllllllllIllllIIllIllllIlllll.getY())) {
                    final BlockPos llllllllllllIllllIIllIllllIllllI = llllllllllllIllllIIllIllllIlllll.down();
                    if (lIIIIlIlIlIIlIlI(this.currentWorld.isAirBlock(llllllllllllIllllIIllIllllIllllI) ? 1 : 0)) {
                        "".length();
                        if (null != null) {
                            return;
                        }
                        break;
                    }
                    else {
                        llllllllllllIllllIIllIllllIlllll = llllllllllllIllllIIllIllllIllllI;
                    }
                }
                this.waterlilyGen.generate(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIllllIlllll);
                "".length();
            }
            ++llllllllllllIllllIIllIlllllIIlII;
        }
        int llllllllllllIllllIIllIllllIlllIl = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if (((0x3A ^ 0x5 ^ (0x8 ^ 0x55)) & (148 + 127 - 166 + 93 ^ 120 + 64 - 26 + 10 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIllllIlllIl, this.mushroomsPerChunk)) {
            if (lIIIIlIlIlIIlIlI(this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[0]))) {
                final int llllllllllllIllllIIllIllllIlllII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
                final int llllllllllllIllllIIllIllllIllIll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
                final BlockPos llllllllllllIllllIIllIllllIllIlI = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIllllIlllII, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllIllIll));
                this.mushroomBrownGen.generate(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIllllIllIlI);
                "".length();
            }
            if (lIIIIlIlIlIIlIlI(this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[8]))) {
                final int llllllllllllIllllIIllIllllIllIIl = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
                final int llllllllllllIllllIIllIllllIllIII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
                final int llllllllllllIllllIIllIllllIlIlll = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIllllIllIIl, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllIllIII)).getY() * BiomeDecorator.lIlllllIIlllII[3];
                if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIllllIlIlll)) {
                    final int llllllllllllIllllIIllIllllIlIllI = this.randomGenerator.nextInt(llllllllllllIllllIIllIllllIlIlll);
                    final BlockPos llllllllllllIllllIIllIllllIlIlIl = this.field_180294_c.add(llllllllllllIllllIIllIllllIllIIl, llllllllllllIllllIIllIllllIlIllI, llllllllllllIllllIIllIllllIllIII);
                    this.mushroomRedGen.generate(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIllllIlIlIl);
                    "".length();
                }
            }
            ++llllllllllllIllllIIllIllllIlllIl;
        }
        if (lIIIIlIlIlIIlIlI(this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[0]))) {
            final int llllllllllllIllllIIllIllllIlIlII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIlIIll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIlIIlI = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIllllIlIlII, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllIlIIll)).getY() * BiomeDecorator.lIlllllIIlllII[3];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIllllIlIIlI)) {
                final int llllllllllllIllllIIllIllllIlIIIl = this.randomGenerator.nextInt(llllllllllllIllllIIllIllllIlIIlI);
                this.mushroomBrownGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(llllllllllllIllllIIllIllllIlIlII, llllllllllllIllllIIllIllllIlIIIl, llllllllllllIllllIIllIllllIlIIll));
                "".length();
            }
        }
        if (lIIIIlIlIlIIlIlI(this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[8]))) {
            final int llllllllllllIllllIIllIllllIlIIII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIIllll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIIlllI = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIllllIlIIII, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllIIllll)).getY() * BiomeDecorator.lIlllllIIlllII[3];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIllllIIlllI)) {
                final int llllllllllllIllllIIllIllllIIllIl = this.randomGenerator.nextInt(llllllllllllIllllIIllIllllIIlllI);
                this.mushroomRedGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(llllllllllllIllllIIllIllllIlIIII, llllllllllllIllllIIllIllllIIllIl, llllllllllllIllllIIllIllllIIllll));
                "".length();
            }
        }
        int llllllllllllIllllIIllIllllIIllII = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if ((((0x5A ^ 0x5F) & ~(0x5C ^ 0x59)) ^ (0x6C ^ 0x69)) == 0x0) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIllllIIllII, this.reedsPerChunk)) {
            final int llllllllllllIllllIIllIllllIIlIll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIIlIlI = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIIlIIl = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIllllIIlIll, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllIIlIlI)).getY() * BiomeDecorator.lIlllllIIlllII[3];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIllllIIlIIl)) {
                final int llllllllllllIllllIIllIllllIIlIII = this.randomGenerator.nextInt(llllllllllllIllllIIllIllllIIlIIl);
                this.reedGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(llllllllllllIllllIIllIllllIIlIll, llllllllllllIllllIIllIllllIIlIII, llllllllllllIllllIIllIllllIIlIlI));
                "".length();
            }
            ++llllllllllllIllllIIllIllllIIllII;
        }
        int llllllllllllIllllIIllIllllIIIlll = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIllllIIIlll, BiomeDecorator.lIlllllIIlllII[9])) {
            final int llllllllllllIllllIIllIllllIIIllI = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIIIlIl = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIIIlII = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIllllIIIllI, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllIIIlIl)).getY() * BiomeDecorator.lIlllllIIlllII[3];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIllllIIIlII)) {
                final int llllllllllllIllllIIllIllllIIIIll = this.randomGenerator.nextInt(llllllllllllIllllIIllIllllIIIlII);
                this.reedGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(llllllllllllIllllIIllIllllIIIllI, llllllllllllIllllIIllIllllIIIIll, llllllllllllIllllIIllIllllIIIlIl));
                "".length();
            }
            ++llllllllllllIllllIIllIllllIIIlll;
        }
        if (lIIIIlIlIlIIlIlI(this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[10]))) {
            final int llllllllllllIllllIIllIllllIIIIlI = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIIIIIl = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIllllIIIIII = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIllllIIIIlI, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIllllIIIIIl)).getY() * BiomeDecorator.lIlllllIIlllII[3];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIllllIIIIII)) {
                final int llllllllllllIllllIIllIlllIllllll = this.randomGenerator.nextInt(llllllllllllIllllIIllIllllIIIIII);
                new WorldGenPumpkin().generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(llllllllllllIllllIIllIllllIIIIlI, llllllllllllIllllIIllIlllIllllll, llllllllllllIllllIIllIllllIIIIIl));
                "".length();
            }
        }
        int llllllllllllIllllIIllIlllIlllllI = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if ("   ".length() == -" ".length()) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllIlllllI, this.cactiPerChunk)) {
            final int llllllllllllIllllIIllIlllIllllIl = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIlllIllllII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
            final int llllllllllllIllllIIllIlllIlllIll = this.currentWorld.getHeight(this.field_180294_c.add(llllllllllllIllllIIllIlllIllllIl, BiomeDecorator.lIlllllIIlllII[6], llllllllllllIllllIIllIlllIllllII)).getY() * BiomeDecorator.lIlllllIIlllII[3];
            if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIlllIlllIll)) {
                final int llllllllllllIllllIIllIlllIlllIlI = this.randomGenerator.nextInt(llllllllllllIllllIIllIlllIlllIll);
                this.cactusGen.generate(this.currentWorld, this.randomGenerator, this.field_180294_c.add(llllllllllllIllllIIllIlllIllllIl, llllllllllllIllllIIllIlllIlllIlI, llllllllllllIllllIIllIlllIllllII));
                "".length();
            }
            ++llllllllllllIllllIIllIlllIlllllI;
        }
        if (lIIIIlIlIlIIlIll(this.generateLakes ? 1 : 0)) {
            int llllllllllllIllllIIllIlllIlllIIl = BiomeDecorator.lIlllllIIlllII[6];
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
            while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllIlllIIl, BiomeDecorator.lIlllllIIlllII[12])) {
                final int llllllllllllIllllIIllIlllIlllIII = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
                final int llllllllllllIllllIIllIlllIllIlll = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
                final int llllllllllllIllllIIllIlllIllIllI = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[11]) + BiomeDecorator.lIlllllIIlllII[8];
                if (lIIIIlIlIlIIllII(llllllllllllIllllIIllIlllIllIllI)) {
                    final int llllllllllllIllllIIllIlllIllIlIl = this.randomGenerator.nextInt(llllllllllllIllllIIllIlllIllIllI);
                    final BlockPos llllllllllllIllllIIllIlllIllIlII = this.field_180294_c.add(llllllllllllIllllIIllIlllIlllIII, llllllllllllIllllIIllIlllIllIlIl, llllllllllllIllllIIllIlllIllIlll);
                    new WorldGenLiquids(Blocks.flowing_water).generate(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIlllIllIlII);
                    "".length();
                }
                ++llllllllllllIllllIIllIlllIlllIIl;
            }
            int llllllllllllIllllIIllIlllIllIIll = BiomeDecorator.lIlllllIIlllII[6];
            "".length();
            if (((0x68 ^ 0x39) & ~(0xC8 ^ 0x99)) != 0x0) {
                return;
            }
            while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllIllIIll, BiomeDecorator.lIlllllIIlllII[14])) {
                final int llllllllllllIllllIIllIlllIllIIlI = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
                final int llllllllllllIllllIIllIlllIllIIIl = this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]) + BiomeDecorator.lIlllllIIlllII[8];
                final int llllllllllllIllllIIllIlllIllIIII = this.randomGenerator.nextInt(this.randomGenerator.nextInt(this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[13]) + BiomeDecorator.lIlllllIIlllII[8]) + BiomeDecorator.lIlllllIIlllII[8]);
                final BlockPos llllllllllllIllllIIllIlllIlIllll = this.field_180294_c.add(llllllllllllIllllIIllIlllIllIIlI, llllllllllllIllllIIllIlllIllIIII, llllllllllllIllllIIllIlllIllIIIl);
                new WorldGenLiquids(Blocks.flowing_lava).generate(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIlllIlIllll);
                "".length();
                ++llllllllllllIllllIIllIlllIllIIll;
            }
        }
    }
    
    private static boolean lIIIIlIlIlIIllII(final int llllllllllllIllllIIllIllIlIIllll) {
        return llllllllllllIllllIIllIllIlIIllll > 0;
    }
    
    private static boolean lIIIIlIlIlIIlIIl(final int llllllllllllIllllIIllIllIllIIIlI, final int llllllllllllIllllIIllIllIllIIIIl) {
        return llllllllllllIllllIIllIllIllIIIlI >= llllllllllllIllllIIllIllIllIIIIl;
    }
    
    protected void genStandardOre1(final int llllllllllllIllllIIllIlllIIllIll, final WorldGenerator llllllllllllIllllIIllIlllIIllIlI, int llllllllllllIllllIIllIlllIIlIIIl, int llllllllllllIllllIIllIlllIIlIIII) {
        if (lIIIIlIlIlIIllll(llllllllllllIllllIIllIlllIIlIIII, llllllllllllIllllIIllIlllIIlIIIl)) {
            final int llllllllllllIllllIIllIlllIIlIlll = llllllllllllIllllIIllIlllIIlIIIl;
            llllllllllllIllllIIllIlllIIlIIIl = llllllllllllIllllIIllIlllIIlIIII;
            llllllllllllIllllIIllIlllIIlIIII = llllllllllllIllllIIllIlllIIlIlll;
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else if (lIIIIlIlIlIlIIII(llllllllllllIllllIIllIlllIIlIIII, llllllllllllIllllIIllIlllIIlIIIl)) {
            if (lIIIIlIlIlIIllll(llllllllllllIllllIIllIlllIIlIIIl, BiomeDecorator.lIlllllIIlllII[15])) {
                ++llllllllllllIllllIIllIlllIIlIIII;
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                --llllllllllllIllllIIllIlllIIlIIIl;
            }
        }
        int llllllllllllIllllIIllIlllIIlIllI = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if ((0x4F ^ 0x4B) == 0x0) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllIIlIllI, llllllllllllIllllIIllIlllIIllIll)) {
            final BlockPos llllllllllllIllllIIllIlllIIlIlIl = this.field_180294_c.add(this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]), this.randomGenerator.nextInt(llllllllllllIllllIIllIlllIIlIIII - llllllllllllIllllIIllIlllIIlIIIl) + llllllllllllIllllIIllIlllIIlIIIl, this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]));
            llllllllllllIllllIIllIlllIIllIlI.generate(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIlllIIlIlIl);
            "".length();
            ++llllllllllllIllllIIllIlllIIlIllI;
        }
    }
    
    private static boolean lIIIIlIlIlIIlIll(final int llllllllllllIllllIIllIllIlIlIlIl) {
        return llllllllllllIllllIIllIllIlIlIlIl != 0;
    }
    
    public void decorate(final World llllllllllllIllllIIlllIIIIIllIlI, final Random llllllllllllIllllIIlllIIIIIlllll, final BiomeGenBase llllllllllllIllllIIlllIIIIIllIII, final BlockPos llllllllllllIllllIIlllIIIIIlIlll) {
        if (lIIIIlIlIlIIIlll(this.currentWorld)) {
            throw new RuntimeException(BiomeDecorator.lIlllllIIllIIl[BiomeDecorator.lIlllllIIlllII[6]]);
        }
        this.currentWorld = llllllllllllIllllIIlllIIIIIllIlI;
        final String llllllllllllIllllIIlllIIIIIlllII = llllllllllllIllllIIlllIIIIIllIlI.getWorldInfo().getGeneratorOptions();
        if (lIIIIlIlIlIIIlll(llllllllllllIllllIIlllIIIIIlllII)) {
            this.chunkProviderSettings = ChunkProviderSettings.Factory.jsonToFactory(llllllllllllIllllIIlllIIIIIlllII).func_177864_b();
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.chunkProviderSettings = ChunkProviderSettings.Factory.jsonToFactory(BiomeDecorator.lIlllllIIllIIl[BiomeDecorator.lIlllllIIlllII[4]]).func_177864_b();
        }
        this.randomGenerator = llllllllllllIllllIIlllIIIIIlllll;
        this.field_180294_c = llllllllllllIllllIIlllIIIIIlIlll;
        this.dirtGen = new WorldGenMinable(Blocks.dirt.getDefaultState(), this.chunkProviderSettings.dirtSize);
        this.gravelGen = new WorldGenMinable(Blocks.gravel.getDefaultState(), this.chunkProviderSettings.gravelSize);
        this.graniteGen = new WorldGenMinable(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.GRANITE), this.chunkProviderSettings.graniteSize);
        this.dioriteGen = new WorldGenMinable(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.DIORITE), this.chunkProviderSettings.dioriteSize);
        this.andesiteGen = new WorldGenMinable(Blocks.stone.getDefaultState().withProperty(BlockStone.VARIANT, BlockStone.EnumType.ANDESITE), this.chunkProviderSettings.andesiteSize);
        this.coalGen = new WorldGenMinable(Blocks.coal_ore.getDefaultState(), this.chunkProviderSettings.coalSize);
        this.ironGen = new WorldGenMinable(Blocks.iron_ore.getDefaultState(), this.chunkProviderSettings.ironSize);
        this.goldGen = new WorldGenMinable(Blocks.gold_ore.getDefaultState(), this.chunkProviderSettings.goldSize);
        this.redstoneGen = new WorldGenMinable(Blocks.redstone_ore.getDefaultState(), this.chunkProviderSettings.redstoneSize);
        this.diamondGen = new WorldGenMinable(Blocks.diamond_ore.getDefaultState(), this.chunkProviderSettings.diamondSize);
        this.lapisGen = new WorldGenMinable(Blocks.lapis_ore.getDefaultState(), this.chunkProviderSettings.lapisSize);
        this.genDecorations(llllllllllllIllllIIlllIIIIIllIII);
        this.currentWorld = null;
        this.randomGenerator = null;
    }
    
    private static boolean lIIIIlIlIlIIllIl(final Object llllllllllllIllllIIllIllIlIllIlI, final Object llllllllllllIllllIIllIllIlIllIIl) {
        return llllllllllllIllllIIllIllIlIllIlI != llllllllllllIllllIIllIllIlIllIIl;
    }
    
    private static boolean lIIIIlIlIlIIlIlI(final int llllllllllllIllllIIllIllIlIlIIll) {
        return llllllllllllIllllIIllIllIlIlIIll == 0;
    }
    
    private static void lIIIIlIlIlIIIIIl() {
        (lIlllllIIllIIl = new String[BiomeDecorator.lIlllllIIlllII[3]])[BiomeDecorator.lIlllllIIlllII[6]] = lIIIIlIlIlIIIIII("N+S/oOXyYINhuKhelixklaJRP3tq+usB", "zAnlI");
        BiomeDecorator.lIlllllIIllIIl[BiomeDecorator.lIlllllIIlllII[4]] = lIIIIlIlIlIIIIII("5U1YUkZFBn4=", "VUvVd");
    }
    
    private static boolean lIIIIlIlIlIlIIII(final int llllllllllllIllllIIllIllIllIIllI, final int llllllllllllIllllIIllIllIllIIlIl) {
        return llllllllllllIllllIIllIllIllIIllI == llllllllllllIllllIIllIllIllIIlIl;
    }
    
    protected void genStandardOre2(final int llllllllllllIllllIIllIllIllllllI, final WorldGenerator llllllllllllIllllIIllIlllIIIIlII, final int llllllllllllIllllIIllIllIlllllII, final int llllllllllllIllllIIllIlllIIIIIlI) {
        int llllllllllllIllllIIllIlllIIIIIIl = BiomeDecorator.lIlllllIIlllII[6];
        "".length();
        if (-(0xAF ^ 0xC7 ^ (0xB ^ 0x67)) > 0) {
            return;
        }
        while (!lIIIIlIlIlIIlIIl(llllllllllllIllllIIllIlllIIIIIIl, llllllllllllIllllIIllIllIllllllI)) {
            final BlockPos llllllllllllIllllIIllIlllIIIIIII = this.field_180294_c.add(this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]), this.randomGenerator.nextInt(llllllllllllIllllIIllIlllIIIIIlI) + this.randomGenerator.nextInt(llllllllllllIllllIIllIlllIIIIIlI) + llllllllllllIllllIIllIllIlllllII - llllllllllllIllllIIllIlllIIIIIlI, this.randomGenerator.nextInt(BiomeDecorator.lIlllllIIlllII[7]));
            llllllllllllIllllIIllIlllIIIIlII.generate(this.currentWorld, this.randomGenerator, llllllllllllIllllIIllIlllIIIIIII);
            "".length();
            ++llllllllllllIllllIIllIlllIIIIIIl;
        }
    }
    
    public BiomeDecorator() {
        this.clayGen = new WorldGenClay(BiomeDecorator.lIlllllIIlllII[0]);
        this.sandGen = new WorldGenSand(Blocks.sand, BiomeDecorator.lIlllllIIlllII[1]);
        this.gravelAsSandGen = new WorldGenSand(Blocks.gravel, BiomeDecorator.lIlllllIIlllII[2]);
        this.yellowFlowerGen = new WorldGenFlowers(Blocks.yellow_flower, BlockFlower.EnumFlowerType.DANDELION);
        this.mushroomBrownGen = new GeneratorBushFeature(Blocks.brown_mushroom);
        this.mushroomRedGen = new GeneratorBushFeature(Blocks.red_mushroom);
        this.bigMushroomGen = new WorldGenBigMushroom();
        this.reedGen = new WorldGenReed();
        this.cactusGen = new WorldGenCactus();
        this.waterlilyGen = new WorldGenWaterlily();
        this.flowersPerChunk = BiomeDecorator.lIlllllIIlllII[3];
        this.grassPerChunk = BiomeDecorator.lIlllllIIlllII[4];
        this.sandPerChunk = BiomeDecorator.lIlllllIIlllII[4];
        this.sandPerChunk2 = BiomeDecorator.lIlllllIIlllII[5];
        this.clayPerChunk = BiomeDecorator.lIlllllIIlllII[4];
        this.generateLakes = (BiomeDecorator.lIlllllIIlllII[4] != 0);
    }
    
    private static void lIIIIlIlIlIIIllI() {
        (lIlllllIIlllII = new int[16])[0] = (0x7A ^ 0x7E);
        BiomeDecorator.lIlllllIIlllII[1] = (174 + 163 - 211 + 52 ^ 147 + 125 - 181 + 90);
        BiomeDecorator.lIlllllIIlllII[2] = (0x7D ^ 0x5C ^ (0x35 ^ 0x12));
        BiomeDecorator.lIlllllIIlllII[3] = "  ".length();
        BiomeDecorator.lIlllllIIlllII[4] = " ".length();
        BiomeDecorator.lIlllllIIlllII[5] = "   ".length();
        BiomeDecorator.lIlllllIIlllII[6] = ((0xBF ^ 0x8F) & ~(0x4D ^ 0x7D));
        BiomeDecorator.lIlllllIIlllII[7] = (0x5B ^ 0x5C ^ (0x5C ^ 0x4B));
        BiomeDecorator.lIlllllIIlllII[8] = (0x17 ^ 0x1F);
        BiomeDecorator.lIlllllIIlllII[9] = (0x10 ^ 0x1A);
        BiomeDecorator.lIlllllIIlllII[10] = (0x57 ^ 0xF ^ (0x6E ^ 0x16));
        BiomeDecorator.lIlllllIIlllII[11] = 221 + 160 - 327 + 194;
        BiomeDecorator.lIlllllIIlllII[12] = (0x40 ^ 0x72);
        BiomeDecorator.lIlllllIIlllII[13] = 98 + 38 - 25 + 45 + (37 + 90 + 35 + 45) - (0xFFFFDFEF & 0x2176) + (143 + 45 + 17 + 30);
        BiomeDecorator.lIlllllIIlllII[14] = (0x16 ^ 0x2);
        BiomeDecorator.lIlllllIIlllII[15] = (0x26 ^ 0xD) + (0xE ^ 0x32) - -(0x74 ^ 0x19) + (0x23 ^ 0x8);
    }
    
    private static boolean lIIIIlIlIlIIlllI(final int llllllllllllIllllIIllIllIlIlIIIl) {
        return llllllllllllIllllIIllIllIlIlIIIl <= 0;
    }
    
    private static boolean lIIIIlIlIlIIIlll(final Object llllllllllllIllllIIllIllIlIlIlll) {
        return llllllllllllIllllIIllIllIlIlIlll != null;
    }
    
    static {
        lIIIIlIlIlIIIllI();
        lIIIIlIlIlIIIIIl();
    }
    
    protected void generateOres() {
        this.genStandardOre1(this.chunkProviderSettings.dirtCount, this.dirtGen, this.chunkProviderSettings.dirtMinHeight, this.chunkProviderSettings.dirtMaxHeight);
        this.genStandardOre1(this.chunkProviderSettings.gravelCount, this.gravelGen, this.chunkProviderSettings.gravelMinHeight, this.chunkProviderSettings.gravelMaxHeight);
        this.genStandardOre1(this.chunkProviderSettings.dioriteCount, this.dioriteGen, this.chunkProviderSettings.dioriteMinHeight, this.chunkProviderSettings.dioriteMaxHeight);
        this.genStandardOre1(this.chunkProviderSettings.graniteCount, this.graniteGen, this.chunkProviderSettings.graniteMinHeight, this.chunkProviderSettings.graniteMaxHeight);
        this.genStandardOre1(this.chunkProviderSettings.andesiteCount, this.andesiteGen, this.chunkProviderSettings.andesiteMinHeight, this.chunkProviderSettings.andesiteMaxHeight);
        this.genStandardOre1(this.chunkProviderSettings.coalCount, this.coalGen, this.chunkProviderSettings.coalMinHeight, this.chunkProviderSettings.coalMaxHeight);
        this.genStandardOre1(this.chunkProviderSettings.ironCount, this.ironGen, this.chunkProviderSettings.ironMinHeight, this.chunkProviderSettings.ironMaxHeight);
        this.genStandardOre1(this.chunkProviderSettings.goldCount, this.goldGen, this.chunkProviderSettings.goldMinHeight, this.chunkProviderSettings.goldMaxHeight);
        this.genStandardOre1(this.chunkProviderSettings.redstoneCount, this.redstoneGen, this.chunkProviderSettings.redstoneMinHeight, this.chunkProviderSettings.redstoneMaxHeight);
        this.genStandardOre1(this.chunkProviderSettings.diamondCount, this.diamondGen, this.chunkProviderSettings.diamondMinHeight, this.chunkProviderSettings.diamondMaxHeight);
        this.genStandardOre2(this.chunkProviderSettings.lapisCount, this.lapisGen, this.chunkProviderSettings.lapisCenterHeight, this.chunkProviderSettings.lapisSpread);
    }
}
