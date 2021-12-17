// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.block.BlockDirt;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.block.BlockColored;
import net.minecraft.block.material.Material;
import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockSand;
import net.minecraft.init.Blocks;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.gen.NoiseGeneratorPerlin;

public class BiomeGenMesa extends BiomeGenBase
{
    private /* synthetic */ NoiseGeneratorPerlin field_150623_aE;
    private /* synthetic */ NoiseGeneratorPerlin field_150625_aG;
    private static final /* synthetic */ String[] lIIIIIIIllllIl;
    private /* synthetic */ NoiseGeneratorPerlin field_150624_aF;
    private /* synthetic */ IBlockState[] field_150621_aC;
    private /* synthetic */ boolean field_150620_aI;
    private /* synthetic */ boolean field_150626_aH;
    private /* synthetic */ long field_150622_aD;
    private static final /* synthetic */ int[] lIIIIIIIlllllI;
    
    @Override
    public void decorate(final World lllllllllllllIlIlIIIllIlIIIlIIll, final Random lllllllllllllIlIlIIIllIlIIIlIllI, final BlockPos lllllllllllllIlIlIIIllIlIIIlIIIl) {
        super.decorate(lllllllllllllIlIlIIIllIlIIIlIIll, lllllllllllllIlIlIIIllIlIIIlIllI, lllllllllllllIlIlIIIllIlIIIlIIIl);
    }
    
    @Override
    protected BiomeGenBase createMutatedBiome(final int lllllllllllllIlIlIIIllIIlIIIlIlI) {
        int n;
        if (lIllIIlllIIIIll(this.biomeID, BiomeGenBase.mesa.biomeID)) {
            n = BiomeGenMesa.lIIIIIIIlllllI[8];
            "".length();
            if ((0x64 ^ 0x61) <= 0) {
                return null;
            }
        }
        else {
            n = BiomeGenMesa.lIIIIIIIlllllI[4];
        }
        final boolean lllllllllllllIlIlIIIllIIlIIIlIIl = n != 0;
        final BiomeGenMesa lllllllllllllIlIlIIIllIIlIIIlIII = new BiomeGenMesa(lllllllllllllIlIlIIIllIIlIIIlIlI, lllllllllllllIlIlIIIllIIlIIIlIIl, this.field_150620_aI);
        if (lIllIIlllIIlIII(lllllllllllllIlIlIIIllIIlIIIlIIl ? 1 : 0)) {
            lllllllllllllIlIlIIIllIIlIIIlIII.setHeight(BiomeGenMesa.height_LowHills);
            "".length();
            lllllllllllllIlIlIIIllIIlIIIlIII.setBiomeName(String.valueOf(new StringBuilder(String.valueOf(this.biomeName)).append(BiomeGenMesa.lIIIIIIIllllIl[BiomeGenMesa.lIIIIIIIlllllI[4]])));
            "".length();
            "".length();
            if (((0xCF ^ 0x85 ^ (0x6A ^ 0x29)) & (0x3E ^ 0x5C ^ (0x2C ^ 0x47) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            lllllllllllllIlIlIIIllIIlIIIlIII.setBiomeName(String.valueOf(new StringBuilder(String.valueOf(this.biomeName)).append(BiomeGenMesa.lIIIIIIIllllIl[BiomeGenMesa.lIIIIIIIlllllI[8]])));
            "".length();
        }
        lllllllllllllIlIlIIIllIIlIIIlIII.func_150557_a(this.color, (boolean)(BiomeGenMesa.lIIIIIIIlllllI[8] != 0));
        "".length();
        return lllllllllllllIlIlIIIllIIlIIIlIII;
    }
    
    @Override
    public int getFoliageColorAtPos(final BlockPos lllllllllllllIlIlIIIllIlIIIlllll) {
        return BiomeGenMesa.lIIIIIIIlllllI[5];
    }
    
    private static void lIllIIllIlllIlI() {
        (lIIIIIIIlllllI = new int[20])[0] = -(-(0xFFFFBB71 & 0x5C9F) & (0xFFFFFFF7 & 0x1BFF));
        BiomeGenMesa.lIIIIIIIlllllI[1] = (50 + 63 - 52 + 130 ^ 44 + 36 - 42 + 133);
        BiomeGenMesa.lIIIIIIIlllllI[2] = "   ".length();
        BiomeGenMesa.lIIIIIIIlllllI[3] = (0x8D ^ 0x88);
        BiomeGenMesa.lIIIIIIIlllllI[4] = ((0x9 ^ 0x50 ^ (0x8 ^ 0x1A)) & (62 + 172 - 201 + 207 ^ 159 + 156 - 312 + 184 ^ -" ".length()));
        BiomeGenMesa.lIIIIIIIlllllI[5] = (-(0xFFFFEF95 & 0x5AFB) & (0xFFFFEFDF & 0x9EDBFD));
        BiomeGenMesa.lIIIIIIIlllllI[6] = (0xFFFF957F & 0x90EBCD);
        BiomeGenMesa.lIIIIIIIlllllI[7] = (0x13 ^ 0x35 ^ (0xA8 ^ 0x8A));
        BiomeGenMesa.lIIIIIIIlllllI[8] = " ".length();
        BiomeGenMesa.lIIIIIIIlllllI[9] = -(0x92 ^ 0x82);
        BiomeGenMesa.lIIIIIIIlllllI[10] = (0x20 ^ 0x2F);
        BiomeGenMesa.lIIIIIIIlllllI[11] = -" ".length();
        BiomeGenMesa.lIIIIIIIlllllI[12] = 6 + 28 + 15 + 174 + (0xF1 ^ 0xB7) - (0xFFFFBB5F & 0x45B2) + (205 + 203 - 387 + 215);
        BiomeGenMesa.lIIIIIIIlllllI[13] = (0xC1 ^ 0x97);
        BiomeGenMesa.lIIIIIIIlllllI[14] = "  ".length();
        BiomeGenMesa.lIIIIIIIlllllI[15] = (0x6D ^ 0x46 ^ (0xD6 ^ 0xBD));
        BiomeGenMesa.lIIIIIIIlllllI[16] = (0xF5 ^ 0xB4) + (0x36 ^ 0x5F) - (0x39 ^ 0xD) + (0x4B ^ 0x42);
        BiomeGenMesa.lIIIIIIIlllllI[17] = (0xAE ^ 0xBE);
        BiomeGenMesa.lIIIIIIIlllllI[18] = (0x3D ^ 0x2);
        BiomeGenMesa.lIIIIIIIlllllI[19] = (0x65 ^ 0x63 ^ (0x5 ^ 0xB));
    }
    
    @Override
    public WorldGenAbstractTree genBigTreeChance(final Random lllllllllllllIlIlIIIllIlIIlIIIlI) {
        return this.worldGeneratorTrees;
    }
    
    static {
        lIllIIllIlllIlI();
        lIllIIllIlllIIl();
    }
    
    @Override
    public int getGrassColorAtPos(final BlockPos lllllllllllllIlIlIIIllIlIIIlllIl) {
        return BiomeGenMesa.lIIIIIIIlllllI[6];
    }
    
    private static boolean lIllIIlllIIIlIl(final int lllllllllllllIlIlIIIllIIIllIIIll, final int lllllllllllllIlIlIIIllIIIllIIIlI) {
        return lllllllllllllIlIlIIIllIIIllIIIll >= lllllllllllllIlIlIIIllIIIllIIIlI;
    }
    
    private static boolean lIllIIlllIIIIII(final Object lllllllllllllIlIlIIIllIIIlIlIIIl, final Object lllllllllllllIlIlIIIllIIIlIlIIII) {
        return lllllllllllllIlIlIIIllIIIlIlIIIl == lllllllllllllIlIlIIIllIIIlIlIIII;
    }
    
    private static String lIllIIllIlllIII(final String lllllllllllllIlIlIIIllIIIlllllII, final String lllllllllllllIlIlIIIllIIIllllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIllIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIllIIIllllIll.getBytes(StandardCharsets.UTF_8)), BiomeGenMesa.lIIIIIIIlllllI[19]), "DES");
            final Cipher lllllllllllllIlIlIIIllIIIllllllI = Cipher.getInstance("DES");
            lllllllllllllIlIlIIIllIIIllllllI.init(BiomeGenMesa.lIIIIIIIlllllI[14], lllllllllllllIlIlIIIllIIIlllllll);
            return new String(lllllllllllllIlIlIIIllIIIllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIllIIIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIllIIIlllllIl) {
            lllllllllllllIlIlIIIllIIIlllllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIlllIIIIlI(final int lllllllllllllIlIlIIIllIIIlIllIll, final int lllllllllllllIlIlIIIllIIIlIllIlI) {
        return lllllllllllllIlIlIIIllIIIlIllIll <= lllllllllllllIlIlIIIllIIIlIllIlI;
    }
    
    private static int lIllIIllIllllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIllIIllIllllll(final int lllllllllllllIlIlIIIllIIIlIIIllI) {
        return lllllllllllllIlIlIIIllIIIlIIIllI > 0;
    }
    
    private static boolean lIllIIlllIIIlll(final int lllllllllllllIlIlIIIllIIIlIIlIlI) {
        return lllllllllllllIlIlIIIllIIIlIIlIlI < 0;
    }
    
    private static boolean lIllIIlllIIIllI(final int lllllllllllllIlIlIIIllIIIlIlIlll, final int lllllllllllllIlIlIIIllIIIlIlIllI) {
        return lllllllllllllIlIlIIIllIIIlIlIlll > lllllllllllllIlIlIIIllIIIlIlIllI;
    }
    
    public BiomeGenMesa(final int lllllllllllllIlIlIIIllIlIIlIIlll, final boolean lllllllllllllIlIlIIIllIlIIlIIllI, final boolean lllllllllllllIlIlIIIllIlIIlIIlIl) {
        super(lllllllllllllIlIlIIIllIlIIlIIlll);
        this.field_150626_aH = lllllllllllllIlIlIIIllIlIIlIIllI;
        this.field_150620_aI = lllllllllllllIlIlIIIllIlIIlIIlIl;
        this.setDisableRain();
        "".length();
        this.setTemperatureRainfall(2.0f, 0.0f);
        "".length();
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.sand.getDefaultState().withProperty(BlockSand.VARIANT, BlockSand.EnumType.RED_SAND);
        this.fillerBlock = Blocks.stained_hardened_clay.getDefaultState();
        this.theBiomeDecorator.treesPerChunk = BiomeGenMesa.lIIIIIIIlllllI[0];
        this.theBiomeDecorator.deadBushPerChunk = BiomeGenMesa.lIIIIIIIlllllI[1];
        this.theBiomeDecorator.reedsPerChunk = BiomeGenMesa.lIIIIIIIlllllI[2];
        this.theBiomeDecorator.cactiPerChunk = BiomeGenMesa.lIIIIIIIlllllI[3];
        this.theBiomeDecorator.flowersPerChunk = BiomeGenMesa.lIIIIIIIlllllI[4];
        this.spawnableCreatureList.clear();
        if (lIllIIllIlllIll(lllllllllllllIlIlIIIllIlIIlIIlIl ? 1 : 0)) {
            this.theBiomeDecorator.treesPerChunk = BiomeGenMesa.lIIIIIIIlllllI[3];
        }
    }
    
    private static boolean lIllIIlllIIIIll(final int lllllllllllllIlIlIIIllIIIllIIlll, final int lllllllllllllIlIlIIIllIIIllIIllI) {
        return lllllllllllllIlIlIIIllIIIllIIlll == lllllllllllllIlIlIIIllIIIllIIllI;
    }
    
    private static boolean lIllIIlllIIIIIl(final int lllllllllllllIlIlIIIllIIIlIlllll, final int lllllllllllllIlIlIIIllIIIlIllllI) {
        return lllllllllllllIlIlIIIllIIIlIlllll < lllllllllllllIlIlIIIllIIIlIllllI;
    }
    
    private static boolean lIllIIllIlllllI(final Object lllllllllllllIlIlIIIllIIIlIlIlII) {
        return lllllllllllllIlIlIIIllIIIlIlIlII != null;
    }
    
    private static void lIllIIllIlllIIl() {
        (lIIIIIIIllllIl = new String[BiomeGenMesa.lIIIIIIIlllllI[14]])[BiomeGenMesa.lIIIIIIIlllllI[4]] = lIllIIllIllIlll("Mea0HfMklw0=", "ieyRK");
        BiomeGenMesa.lIIIIIIIllllIl[BiomeGenMesa.lIIIIIIIlllllI[8]] = lIllIIllIlllIII("9CcxEX9mD508JD6jhiIXGQ==", "nYyIs");
    }
    
    private static boolean lIllIIllIlllIll(final int lllllllllllllIlIlIIIllIIIlIIlllI) {
        return lllllllllllllIlIlIIIllIIIlIIlllI != 0;
    }
    
    private IBlockState func_180629_a(final int lllllllllllllIlIlIIIllIIlIIlIlll, final int lllllllllllllIlIlIIIllIIlIIlIIIl, final int lllllllllllllIlIlIIIllIIlIIlIlIl) {
        final int lllllllllllllIlIlIIIllIIlIIlIlII = (int)Math.round(this.field_150625_aG.func_151601_a(lllllllllllllIlIlIIIllIIlIIlIlll * 1.0 / 512.0, lllllllllllllIlIlIIIllIIlIIlIlll * 1.0 / 512.0) * 2.0);
        return this.field_150621_aC[(lllllllllllllIlIlIIIllIIlIIlIIIl + lllllllllllllIlIlIIIllIIlIIlIlII + BiomeGenMesa.lIIIIIIIlllllI[15]) % BiomeGenMesa.lIIIIIIIlllllI[15]];
    }
    
    private static boolean lIllIIlllIIIlII(final int lllllllllllllIlIlIIIllIIIlIIlIII) {
        return lllllllllllllIlIlIIIllIIIlIIlIII <= 0;
    }
    
    @Override
    public void genTerrainBlocks(final World lllllllllllllIlIlIIIllIIllIlllIl, final Random lllllllllllllIlIlIIIllIIllIlllII, final ChunkPrimer lllllllllllllIlIlIIIllIIlllllIIl, final int lllllllllllllIlIlIIIllIIllIllIlI, final int lllllllllllllIlIlIIIllIIllllIlll, final double lllllllllllllIlIlIIIllIIllllIllI) {
        if (!lIllIIllIlllllI(this.field_150621_aC) || lIllIIllIlllIll(lIllIIllIllllII(this.field_150622_aD, lllllllllllllIlIlIIIllIIllIlllIl.getSeed()))) {
            this.func_150619_a(lllllllllllllIlIlIIIllIIllIlllIl.getSeed());
        }
        if (!lIllIIllIlllllI(this.field_150623_aE) || !lIllIIllIlllllI(this.field_150624_aF) || lIllIIllIlllIll(lIllIIllIllllII(this.field_150622_aD, lllllllllllllIlIlIIIllIIllIlllIl.getSeed()))) {
            final Random lllllllllllllIlIlIIIllIIllllIlIl = new Random(this.field_150622_aD);
            this.field_150623_aE = new NoiseGeneratorPerlin(lllllllllllllIlIlIIIllIIllllIlIl, BiomeGenMesa.lIIIIIIIlllllI[7]);
            this.field_150624_aF = new NoiseGeneratorPerlin(lllllllllllllIlIlIIIllIIllllIlIl, BiomeGenMesa.lIIIIIIIlllllI[8]);
        }
        this.field_150622_aD = lllllllllllllIlIlIIIllIIllIlllIl.getSeed();
        double lllllllllllllIlIlIIIllIIllllIlII = 0.0;
        if (lIllIIllIlllIll(this.field_150626_aH ? 1 : 0)) {
            final int lllllllllllllIlIlIIIllIIllllIIll = (lllllllllllllIlIlIIIllIIllIllIlI & BiomeGenMesa.lIIIIIIIlllllI[9]) + (lllllllllllllIlIlIIIllIIllllIlll & BiomeGenMesa.lIIIIIIIlllllI[10]);
            final int lllllllllllllIlIlIIIllIIllllIIlI = (lllllllllllllIlIlIIIllIIllllIlll & BiomeGenMesa.lIIIIIIIlllllI[9]) + (lllllllllllllIlIlIIIllIIllIllIlI & BiomeGenMesa.lIIIIIIIlllllI[10]);
            final double lllllllllllllIlIlIIIllIIllllIIIl = Math.min(Math.abs(lllllllllllllIlIlIIIllIIllllIllI), this.field_150623_aE.func_151601_a(lllllllllllllIlIlIIIllIIllllIIll * 0.25, lllllllllllllIlIlIIIllIIllllIIlI * 0.25));
            if (lIllIIllIllllll(lIllIIllIllllIl(lllllllllllllIlIlIIIllIIllllIIIl, 0.0))) {
                final double lllllllllllllIlIlIIIllIIllllIIII = 0.001953125;
                final double lllllllllllllIlIlIIIllIIlllIllll = Math.abs(this.field_150624_aF.func_151601_a(lllllllllllllIlIlIIIllIIllllIIll * lllllllllllllIlIlIIIllIIllllIIII, lllllllllllllIlIlIIIllIIllllIIlI * lllllllllllllIlIlIIIllIIllllIIII));
                lllllllllllllIlIlIIIllIIllllIlII = lllllllllllllIlIlIIIllIIllllIIIl * lllllllllllllIlIlIIIllIIllllIIIl * 2.5;
                final double lllllllllllllIlIlIIIllIIlllIlllI = Math.ceil(lllllllllllllIlIlIIIllIIlllIllll * 50.0) + 14.0;
                if (lIllIIllIllllll(lIllIIllIllllIl(lllllllllllllIlIlIIIllIIllllIlII, lllllllllllllIlIlIIIllIIlllIlllI))) {
                    lllllllllllllIlIlIIIllIIllllIlII = lllllllllllllIlIlIIIllIIlllIlllI;
                }
                lllllllllllllIlIlIIIllIIllllIlII += 64.0;
            }
        }
        final int lllllllllllllIlIlIIIllIIlllIllIl = lllllllllllllIlIlIIIllIIllIllIlI & BiomeGenMesa.lIIIIIIIlllllI[10];
        final int lllllllllllllIlIlIIIllIIlllIllII = lllllllllllllIlIlIIIllIIllllIlll & BiomeGenMesa.lIIIIIIIlllllI[10];
        final int lllllllllllllIlIlIIIllIIlllIlIll = lllllllllllllIlIlIIIllIIllIlllIl.func_181545_F();
        IBlockState lllllllllllllIlIlIIIllIIlllIlIlI = Blocks.stained_hardened_clay.getDefaultState();
        IBlockState lllllllllllllIlIlIIIllIIlllIlIIl = this.fillerBlock;
        final int lllllllllllllIlIlIIIllIIlllIlIII = (int)(lllllllllllllIlIlIIIllIIllllIllI / 3.0 + 3.0 + lllllllllllllIlIlIIIllIIllIlllII.nextDouble() * 0.25);
        int n;
        if (lIllIIllIllllll(lIllIIllIllllIl(Math.cos(lllllllllllllIlIlIIIllIIllllIllI / 3.0 * 3.141592653589793), 0.0))) {
            n = BiomeGenMesa.lIIIIIIIlllllI[8];
            "".length();
            if (-" ".length() > (121 + 102 - 44 + 13 ^ 85 + 185 - 84 + 10)) {
                return;
            }
        }
        else {
            n = BiomeGenMesa.lIIIIIIIlllllI[4];
        }
        final boolean lllllllllllllIlIlIIIllIIlllIIlll = n != 0;
        int lllllllllllllIlIlIIIllIIlllIIllI = BiomeGenMesa.lIIIIIIIlllllI[11];
        boolean lllllllllllllIlIlIIIllIIlllIIlIl = BiomeGenMesa.lIIIIIIIlllllI[4] != 0;
        int lllllllllllllIlIlIIIllIIlllIIlII = BiomeGenMesa.lIIIIIIIlllllI[12];
        "".length();
        if ((0x80 ^ 0x84) <= "   ".length()) {
            return;
        }
        while (!lIllIIlllIIIlll(lllllllllllllIlIlIIIllIIlllIIlII)) {
            if (lIllIIlllIIIIII(lllllllllllllIlIlIIIllIIlllllIIl.getBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl).getBlock().getMaterial(), Material.air) && lIllIIlllIIIIIl(lllllllllllllIlIlIIIllIIlllIIlII, (int)lllllllllllllIlIlIIIllIIllllIlII)) {
                lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, Blocks.stone.getDefaultState());
            }
            if (lIllIIlllIIIIlI(lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIllIlllII.nextInt(BiomeGenMesa.lIIIIIIIlllllI[3]))) {
                lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, Blocks.bedrock.getDefaultState());
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                final IBlockState lllllllllllllIlIlIIIllIIlllIIIll = lllllllllllllIlIlIIIllIIlllllIIl.getBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl);
                if (lIllIIlllIIIIII(lllllllllllllIlIlIIIllIIlllIIIll.getBlock().getMaterial(), Material.air)) {
                    lllllllllllllIlIlIIIllIIlllIIllI = BiomeGenMesa.lIIIIIIIlllllI[11];
                    "".length();
                    if ("   ".length() > (0x28 ^ 0x2C)) {
                        return;
                    }
                }
                else if (lIllIIlllIIIIII(lllllllllllllIlIlIIIllIIlllIIIll.getBlock(), Blocks.stone)) {
                    if (lIllIIlllIIIIll(lllllllllllllIlIlIIIllIIlllIIllI, BiomeGenMesa.lIIIIIIIlllllI[11])) {
                        lllllllllllllIlIlIIIllIIlllIIlIl = (BiomeGenMesa.lIIIIIIIlllllI[4] != 0);
                        if (lIllIIlllIIIlII(lllllllllllllIlIlIIIllIIlllIlIII)) {
                            lllllllllllllIlIlIIIllIIlllIlIlI = null;
                            lllllllllllllIlIlIIIllIIlllIlIIl = Blocks.stone.getDefaultState();
                            "".length();
                            if (" ".length() != " ".length()) {
                                return;
                            }
                        }
                        else if (lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIlIll - BiomeGenMesa.lIIIIIIIlllllI[7]) && lIllIIlllIIIIlI(lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIlIll + BiomeGenMesa.lIIIIIIIlllllI[8])) {
                            lllllllllllllIlIlIIIllIIlllIlIlI = Blocks.stained_hardened_clay.getDefaultState();
                            lllllllllllllIlIlIIIllIIlllIlIIl = this.fillerBlock;
                        }
                        if (lIllIIlllIIIIIl(lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIlIll) && (!lIllIIllIlllllI(lllllllllllllIlIlIIIllIIlllIlIlI) || lIllIIlllIIIIII(lllllllllllllIlIlIIIllIIlllIlIlI.getBlock().getMaterial(), Material.air))) {
                            lllllllllllllIlIlIIIllIIlllIlIlI = Blocks.water.getDefaultState();
                        }
                        lllllllllllllIlIlIIIllIIlllIIllI = lllllllllllllIlIlIIIllIIlllIlIII + Math.max(BiomeGenMesa.lIIIIIIIlllllI[4], lllllllllllllIlIlIIIllIIlllIIlII - lllllllllllllIlIlIIIllIIlllIlIll);
                        if (lIllIIlllIIIIIl(lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIlIll - BiomeGenMesa.lIIIIIIIlllllI[8])) {
                            lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, lllllllllllllIlIlIIIllIIlllIlIIl);
                            if (lIllIIlllIIIIII(lllllllllllllIlIlIIIllIIlllIlIIl.getBlock(), Blocks.stained_hardened_clay)) {
                                lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, lllllllllllllIlIlIIIllIIlllIlIIl.getBlock().getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
                                "".length();
                                if (((0x15 ^ 0x37 ^ (0x63 ^ 0x54)) & (0x84 ^ 0xA4 ^ (0x6B ^ 0x5E) ^ -" ".length())) != 0x0) {
                                    return;
                                }
                            }
                        }
                        else if (lIllIIllIlllIll(this.field_150620_aI ? 1 : 0) && lIllIIlllIIIllI(lllllllllllllIlIlIIIllIIlllIIlII, BiomeGenMesa.lIIIIIIIlllllI[13] + lllllllllllllIlIlIIIllIIlllIlIII * BiomeGenMesa.lIIIIIIIlllllI[14])) {
                            if (lIllIIllIlllIll(lllllllllllllIlIlIIIllIIlllIIlll ? 1 : 0)) {
                                lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, Blocks.dirt.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.COARSE_DIRT));
                                "".length();
                                if ("  ".length() >= (52 + 70 - 1 + 7 ^ 6 + 86 - 73 + 113)) {
                                    return;
                                }
                            }
                            else {
                                lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, Blocks.grass.getDefaultState());
                                "".length();
                                if (-" ".length() > (0x15 ^ 0x78 ^ (0xE6 ^ 0x8F))) {
                                    return;
                                }
                            }
                        }
                        else if (lIllIIlllIIIIlI(lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIlIll + BiomeGenMesa.lIIIIIIIlllllI[2] + lllllllllllllIlIlIIIllIIlllIlIII)) {
                            lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, this.topBlock);
                            lllllllllllllIlIlIIIllIIlllIIlIl = (BiomeGenMesa.lIIIIIIIlllllI[8] != 0);
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return;
                            }
                        }
                        else {
                            IBlockState lllllllllllllIlIlIIIllIIlllIIIII = null;
                            if (lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlllIIlII, BiomeGenMesa.lIIIIIIIlllllI[15]) && lIllIIlllIIIIlI(lllllllllllllIlIlIIIllIIlllIIlII, BiomeGenMesa.lIIIIIIIlllllI[16])) {
                                if (lIllIIllIlllIll(lllllllllllllIlIlIIIllIIlllIIlll ? 1 : 0)) {
                                    final IBlockState lllllllllllllIlIlIIIllIIlllIIIlI = Blocks.hardened_clay.getDefaultState();
                                    "".length();
                                    if (-" ".length() > 0) {
                                        return;
                                    }
                                }
                                else {
                                    final IBlockState lllllllllllllIlIlIIIllIIlllIIIIl = this.func_180629_a(lllllllllllllIlIlIIIllIIllIllIlI, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIllllIlll);
                                    "".length();
                                    if (null != null) {
                                        return;
                                    }
                                }
                            }
                            else {
                                lllllllllllllIlIlIIIllIIlllIIIII = Blocks.stained_hardened_clay.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE);
                            }
                            lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, lllllllllllllIlIlIIIllIIlllIIIII);
                            "".length();
                            if (" ".length() < 0) {
                                return;
                            }
                        }
                    }
                    else if (lIllIIllIllllll(lllllllllllllIlIlIIIllIIlllIIllI)) {
                        --lllllllllllllIlIlIIIllIIlllIIllI;
                        if (lIllIIllIlllIll(lllllllllllllIlIlIIIllIIlllIIlIl ? 1 : 0)) {
                            lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, Blocks.stained_hardened_clay.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE));
                            "".length();
                            if (-" ".length() > 0) {
                                return;
                            }
                        }
                        else {
                            final IBlockState lllllllllllllIlIlIIIllIIllIlllll = this.func_180629_a(lllllllllllllIlIlIIIllIIllIllIlI, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIllllIlll);
                            lllllllllllllIlIlIIIllIIlllllIIl.setBlockState(lllllllllllllIlIlIIIllIIlllIllII, lllllllllllllIlIlIIIllIIlllIIlII, lllllllllllllIlIlIIIllIIlllIllIl, lllllllllllllIlIlIIIllIIllIlllll);
                        }
                    }
                }
            }
            --lllllllllllllIlIlIIIllIIlllIIlII;
        }
    }
    
    private static int lIllIIllIllllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static String lIllIIllIllIlll(final String lllllllllllllIlIlIIIllIIIllIllIl, final String lllllllllllllIlIlIIIllIIIllIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIllIIIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIllIIIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIIllIIIlllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIIllIIIlllIIIl.init(BiomeGenMesa.lIIIIIIIlllllI[14], lllllllllllllIlIlIIIllIIIlllIIlI);
            return new String(lllllllllllllIlIlIIIllIIIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIllIIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIllIIIlllIIII) {
            lllllllllllllIlIlIIIllIIIlllIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIlllIIlIII(final int lllllllllllllIlIlIIIllIIIlIIllII) {
        return lllllllllllllIlIlIIIllIIIlIIllII == 0;
    }
    
    private void func_150619_a(final long lllllllllllllIlIlIIIllIIlIlIIllI) {
        this.field_150621_aC = new IBlockState[BiomeGenMesa.lIIIIIIIlllllI[15]];
        Arrays.fill(this.field_150621_aC, Blocks.hardened_clay.getDefaultState());
        final Random lllllllllllllIlIlIIIllIIlIllllIl = new Random(lllllllllllllIlIlIIIllIIlIlIIllI);
        this.field_150625_aG = new NoiseGeneratorPerlin(lllllllllllllIlIlIIIllIIlIllllIl, BiomeGenMesa.lIIIIIIIlllllI[8]);
        int lllllllllllllIlIlIIIllIIlIllllII = BiomeGenMesa.lIIIIIIIlllllI[4];
        "".length();
        if (-" ".length() == "  ".length()) {
            return;
        }
        while (!lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlIllllII, BiomeGenMesa.lIIIIIIIlllllI[15])) {
            lllllllllllllIlIlIIIllIIlIllllII += lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[3]) + BiomeGenMesa.lIIIIIIIlllllI[8];
            if (lIllIIlllIIIIIl(lllllllllllllIlIlIIIllIIlIllllII, BiomeGenMesa.lIIIIIIIlllllI[15])) {
                this.field_150621_aC[lllllllllllllIlIlIIIllIIlIllllII] = Blocks.stained_hardened_clay.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.ORANGE);
            }
            ++lllllllllllllIlIlIIIllIIlIllllII;
        }
        final int lllllllllllllIlIlIIIllIIlIlllIll = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[7]) + BiomeGenMesa.lIIIIIIIlllllI[14];
        int lllllllllllllIlIlIIIllIIlIlllIlI = BiomeGenMesa.lIIIIIIIlllllI[4];
        "".length();
        if (((0x37 ^ 0x21) & ~(0x72 ^ 0x64)) != 0x0) {
            return;
        }
        while (!lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlIlllIlI, lllllllllllllIlIlIIIllIIlIlllIll)) {
            final int lllllllllllllIlIlIIIllIIlIlllIIl = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[2]) + BiomeGenMesa.lIIIIIIIlllllI[8];
            final int lllllllllllllIlIlIIIllIIlIlllIII = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[15]);
            int lllllllllllllIlIlIIIllIIlIllIlll = BiomeGenMesa.lIIIIIIIlllllI[4];
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
            while (lIllIIlllIIIIIl(lllllllllllllIlIlIIIllIIlIlllIII + lllllllllllllIlIlIIIllIIlIllIlll, BiomeGenMesa.lIIIIIIIlllllI[15]) && !lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlIllIlll, lllllllllllllIlIlIIIllIIlIlllIIl)) {
                this.field_150621_aC[lllllllllllllIlIlIIIllIIlIlllIII + lllllllllllllIlIlIIIllIIlIllIlll] = Blocks.stained_hardened_clay.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.YELLOW);
                ++lllllllllllllIlIlIIIllIIlIllIlll;
            }
            ++lllllllllllllIlIlIIIllIIlIlllIlI;
        }
        final int lllllllllllllIlIlIIIllIIlIllIllI = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[7]) + BiomeGenMesa.lIIIIIIIlllllI[14];
        int lllllllllllllIlIlIIIllIIlIllIlIl = BiomeGenMesa.lIIIIIIIlllllI[4];
        "".length();
        if (-" ".length() > "  ".length()) {
            return;
        }
        while (!lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlIllIlIl, lllllllllllllIlIlIIIllIIlIllIllI)) {
            final int lllllllllllllIlIlIIIllIIlIllIlII = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[2]) + BiomeGenMesa.lIIIIIIIlllllI[14];
            final int lllllllllllllIlIlIIIllIIlIllIIll = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[15]);
            int lllllllllllllIlIlIIIllIIlIllIIlI = BiomeGenMesa.lIIIIIIIlllllI[4];
            "".length();
            if ("  ".length() == " ".length()) {
                return;
            }
            while (lIllIIlllIIIIIl(lllllllllllllIlIlIIIllIIlIllIIll + lllllllllllllIlIlIIIllIIlIllIIlI, BiomeGenMesa.lIIIIIIIlllllI[15]) && !lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlIllIIlI, lllllllllllllIlIlIIIllIIlIllIlII)) {
                this.field_150621_aC[lllllllllllllIlIlIIIllIIlIllIIll + lllllllllllllIlIlIIIllIIlIllIIlI] = Blocks.stained_hardened_clay.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.BROWN);
                ++lllllllllllllIlIlIIIllIIlIllIIlI;
            }
            ++lllllllllllllIlIlIIIllIIlIllIlIl;
        }
        final int lllllllllllllIlIlIIIllIIlIllIIIl = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[7]) + BiomeGenMesa.lIIIIIIIlllllI[14];
        int lllllllllllllIlIlIIIllIIlIllIIII = BiomeGenMesa.lIIIIIIIlllllI[4];
        "".length();
        if ("   ".length() <= "  ".length()) {
            return;
        }
        while (!lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlIllIIII, lllllllllllllIlIlIIIllIIlIllIIIl)) {
            final int lllllllllllllIlIlIIIllIIlIlIllll = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[2]) + BiomeGenMesa.lIIIIIIIlllllI[8];
            final int lllllllllllllIlIlIIIllIIlIlIlllI = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[15]);
            int lllllllllllllIlIlIIIllIIlIlIllIl = BiomeGenMesa.lIIIIIIIlllllI[4];
            "".length();
            if (((0x88 ^ 0xAC) & ~(0x94 ^ 0xB0)) >= (0xB7 ^ 0xB3)) {
                return;
            }
            while (lIllIIlllIIIIIl(lllllllllllllIlIlIIIllIIlIlIlllI + lllllllllllllIlIlIIIllIIlIlIllIl, BiomeGenMesa.lIIIIIIIlllllI[15]) && !lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlIlIllIl, lllllllllllllIlIlIIIllIIlIlIllll)) {
                this.field_150621_aC[lllllllllllllIlIlIIIllIIlIlIlllI + lllllllllllllIlIlIIIllIIlIlIllIl] = Blocks.stained_hardened_clay.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.RED);
                ++lllllllllllllIlIlIIIllIIlIlIllIl;
            }
            ++lllllllllllllIlIlIIIllIIlIllIIII;
        }
        final int lllllllllllllIlIlIIIllIIlIlIllII = lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[2]) + BiomeGenMesa.lIIIIIIIlllllI[2];
        int lllllllllllllIlIlIIIllIIlIlIlIll = BiomeGenMesa.lIIIIIIIlllllI[4];
        int lllllllllllllIlIlIIIllIIlIlIlIlI = BiomeGenMesa.lIIIIIIIlllllI[4];
        "".length();
        if ("  ".length() < ((0xD9 ^ 0x93 ^ (0x48 ^ 0x11)) & (0x3 ^ 0x5A ^ (0x8 ^ 0x42) ^ -" ".length()))) {
            return;
        }
        while (!lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlIlIlIlI, lllllllllllllIlIlIIIllIIlIlIllII)) {
            final int lllllllllllllIlIlIIIllIIlIlIlIIl = BiomeGenMesa.lIIIIIIIlllllI[8];
            lllllllllllllIlIlIIIllIIlIlIlIll += lllllllllllllIlIlIIIllIIlIllllIl.nextInt(BiomeGenMesa.lIIIIIIIlllllI[17]) + BiomeGenMesa.lIIIIIIIlllllI[7];
            int lllllllllllllIlIlIIIllIIlIlIlIII = BiomeGenMesa.lIIIIIIIlllllI[4];
            "".length();
            if ((51 + 22 - 2 + 101 ^ 157 + 32 - 137 + 116) != (0xE4 ^ 0xBB ^ (0x3D ^ 0x66))) {
                return;
            }
            while (lIllIIlllIIIIIl(lllllllllllllIlIlIIIllIIlIlIlIll + lllllllllllllIlIlIIIllIIlIlIlIII, BiomeGenMesa.lIIIIIIIlllllI[15]) && !lIllIIlllIIIlIl(lllllllllllllIlIlIIIllIIlIlIlIII, lllllllllllllIlIlIIIllIIlIlIlIIl)) {
                this.field_150621_aC[lllllllllllllIlIlIIIllIIlIlIlIll + lllllllllllllIlIlIIIllIIlIlIlIII] = Blocks.stained_hardened_clay.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.WHITE);
                if (lIllIIlllIIIllI(lllllllllllllIlIlIIIllIIlIlIlIll + lllllllllllllIlIlIIIllIIlIlIlIII, BiomeGenMesa.lIIIIIIIlllllI[8]) && lIllIIllIlllIll(lllllllllllllIlIlIIIllIIlIllllIl.nextBoolean() ? 1 : 0)) {
                    this.field_150621_aC[lllllllllllllIlIlIIIllIIlIlIlIll + lllllllllllllIlIlIIIllIIlIlIlIII - BiomeGenMesa.lIIIIIIIlllllI[8]] = Blocks.stained_hardened_clay.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER);
                }
                if (lIllIIlllIIIIIl(lllllllllllllIlIlIIIllIIlIlIlIll + lllllllllllllIlIlIIIllIIlIlIlIII, BiomeGenMesa.lIIIIIIIlllllI[18]) && lIllIIllIlllIll(lllllllllllllIlIlIIIllIIlIllllIl.nextBoolean() ? 1 : 0)) {
                    this.field_150621_aC[lllllllllllllIlIlIIIllIIlIlIlIll + lllllllllllllIlIlIIIllIIlIlIlIII + BiomeGenMesa.lIIIIIIIlllllI[8]] = Blocks.stained_hardened_clay.getDefaultState().withProperty(BlockColored.COLOR, EnumDyeColor.SILVER);
                }
                ++lllllllllllllIlIlIIIllIIlIlIlIII;
            }
            ++lllllllllllllIlIlIIIllIIlIlIlIlI;
        }
    }
}
