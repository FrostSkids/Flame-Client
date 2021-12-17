// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.block.BlockDoublePlant;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityHorse;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.BlockFlower;
import net.minecraft.util.BlockPos;
import java.util.Random;

public class BiomeGenPlains extends BiomeGenBase
{
    private static final /* synthetic */ String[] lIIIlIIIlIlIlI;
    private static final /* synthetic */ int[] lIIIlIIIlIllII;
    protected /* synthetic */ boolean field_150628_aC;
    
    @Override
    public BlockFlower.EnumFlowerType pickRandomFlower(final Random lllllllllllllIlIIIllIIIlIllIIlIl, final BlockPos lllllllllllllIlIIIllIIIlIlIlllll) {
        final double lllllllllllllIlIIIllIIIlIllIIIll = BiomeGenPlains.GRASS_COLOR_NOISE.func_151601_a(lllllllllllllIlIIIllIIIlIlIlllll.getX() / 200.0, lllllllllllllIlIIIllIIIlIlIlllll.getZ() / 200.0);
        if (lIlllllIIllllll(lIlllllIIlllllI(lllllllllllllIlIIIllIIIlIllIIIll, -0.8))) {
            final int lllllllllllllIlIIIllIIIlIllIIIlI = lllllllllllllIlIIIllIIIlIllIIlIl.nextInt(BiomeGenPlains.lIIIlIIIlIllII[4]);
            switch (lllllllllllllIlIIIllIIIlIllIIIlI) {
                case 0: {
                    return BlockFlower.EnumFlowerType.ORANGE_TULIP;
                }
                case 1: {
                    return BlockFlower.EnumFlowerType.RED_TULIP;
                }
                case 2: {
                    return BlockFlower.EnumFlowerType.PINK_TULIP;
                }
                default: {
                    return BlockFlower.EnumFlowerType.WHITE_TULIP;
                }
            }
        }
        else {
            if (lIlllllIlIIIIII(lllllllllllllIlIIIllIIIlIllIIlIl.nextInt(BiomeGenPlains.lIIIlIIIlIllII[6]))) {
                final int lllllllllllllIlIIIllIIIlIllIIIIl = lllllllllllllIlIIIllIIIlIllIIlIl.nextInt(BiomeGenPlains.lIIIlIIIlIllII[6]);
                BlockFlower.EnumFlowerType enumFlowerType;
                if (lIlllllIlIIIIIl(lllllllllllllIlIIIllIIIlIllIIIIl)) {
                    enumFlowerType = BlockFlower.EnumFlowerType.POPPY;
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return null;
                    }
                }
                else if (lIlllllIlIIIIlI(lllllllllllllIlIIIllIIIlIllIIIIl, BiomeGenPlains.lIIIlIIIlIllII[7])) {
                    enumFlowerType = BlockFlower.EnumFlowerType.HOUSTONIA;
                    "".length();
                    if (((0xEA ^ 0xA6 ^ "   ".length()) & (0x5B ^ 0x39 ^ (0x31 ^ 0x1C) ^ -" ".length())) != 0x0) {
                        return null;
                    }
                }
                else {
                    enumFlowerType = BlockFlower.EnumFlowerType.OXEYE_DAISY;
                }
                return enumFlowerType;
            }
            return BlockFlower.EnumFlowerType.DANDELION;
        }
    }
    
    private static boolean lIlllllIlIIIlIl(final int lllllllllllllIlIIIllIIIlIIIlIIIl) {
        return lllllllllllllIlIIIllIIIlIIIlIIIl != 0;
    }
    
    private static boolean lIlllllIIllllll(final int lllllllllllllIlIIIllIIIlIIIIllIl) {
        return lllllllllllllIlIIIllIIIlIIIIllIl < 0;
    }
    
    private static int lIlllllIIlllllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lIlllllIlIIIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlllllIlIIIIII(final int lllllllllllllIlIIIllIIIlIIIIlIll) {
        return lllllllllllllIlIIIllIIIlIIIIlIll > 0;
    }
    
    private static boolean lIlllllIlIIIlII(final int lllllllllllllIlIIIllIIIlIIIllIII, final int lllllllllllllIlIIIllIIIlIIIlIlll) {
        return lllllllllllllIlIIIllIIIlIIIllIII >= lllllllllllllIlIIIllIIIlIIIlIlll;
    }
    
    @Override
    protected BiomeGenBase createMutatedBiome(final int lllllllllllllIlIIIllIIIlIIlllIII) {
        final BiomeGenPlains lllllllllllllIlIIIllIIIlIIlllIIl = new BiomeGenPlains(lllllllllllllIlIIIllIIIlIIlllIII);
        lllllllllllllIlIIIllIIIlIIlllIIl.setBiomeName(BiomeGenPlains.lIIIlIIIlIlIlI[BiomeGenPlains.lIIIlIIIlIllII[10]]);
        "".length();
        lllllllllllllIlIIIllIIIlIIlllIIl.field_150628_aC = (BiomeGenPlains.lIIIlIIIlIllII[7] != 0);
        lllllllllllllIlIIIllIIIlIIlllIIl.setColor(BiomeGenPlains.lIIIlIIIlIllII[14]);
        "".length();
        lllllllllllllIlIIIllIIIlIIlllIIl.field_150609_ah = BiomeGenPlains.lIIIlIIIlIllII[15];
        return lllllllllllllIlIIIllIIIlIIlllIIl;
    }
    
    private static boolean lIlllllIlIIIIlI(final int lllllllllllllIlIIIllIIIlIIIlllII, final int lllllllllllllIlIIIllIIIlIIIllIll) {
        return lllllllllllllIlIIIllIIIlIIIlllII == lllllllllllllIlIIIllIIIlIIIllIll;
    }
    
    private static String lIlllllIIlllIII(String lllllllllllllIlIIIllIIIlIIlIIlll, final String lllllllllllllIlIIIllIIIlIIlIlIll) {
        lllllllllllllIlIIIllIIIlIIlIIlll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIllIIIlIIlIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIllIIIlIIlIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIIIllIIIlIIlIlIIl = lllllllllllllIlIIIllIIIlIIlIlIll.toCharArray();
        int lllllllllllllIlIIIllIIIlIIlIlIII = BiomeGenPlains.lIIIlIIIlIllII[10];
        final boolean lllllllllllllIlIIIllIIIlIIlIIIlI = (Object)((String)lllllllllllllIlIIIllIIIlIIlIIlll).toCharArray();
        final short lllllllllllllIlIIIllIIIlIIlIIIIl = (short)lllllllllllllIlIIIllIIIlIIlIIIlI.length;
        short lllllllllllllIlIIIllIIIlIIlIIIII = (short)BiomeGenPlains.lIIIlIIIlIllII[10];
        while (lIlllllIlIIIllI(lllllllllllllIlIIIllIIIlIIlIIIII, lllllllllllllIlIIIllIIIlIIlIIIIl)) {
            final char lllllllllllllIlIIIllIIIlIIlIllIl = lllllllllllllIlIIIllIIIlIIlIIIlI[lllllllllllllIlIIIllIIIlIIlIIIII];
            lllllllllllllIlIIIllIIIlIIlIlIlI.append((char)(lllllllllllllIlIIIllIIIlIIlIllIl ^ lllllllllllllIlIIIllIIIlIIlIlIIl[lllllllllllllIlIIIllIIIlIIlIlIII % lllllllllllllIlIIIllIIIlIIlIlIIl.length]));
            "".length();
            ++lllllllllllllIlIIIllIIIlIIlIlIII;
            ++lllllllllllllIlIIIllIIIlIIlIIIII;
            "".length();
            if (((77 + 132 - 115 + 87 ^ 27 + 53 + 30 + 44) & (130 + 127 - 135 + 14 ^ 13 + 42 + 16 + 96 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIllIIIlIIlIlIlI);
    }
    
    static {
        lIlllllIIllllII();
        lIlllllIIlllIIl();
    }
    
    protected BiomeGenPlains(final int lllllllllllllIlIIIllIIIlIllIllIl) {
        super(lllllllllllllIlIIIllIIIlIllIllIl);
        this.setTemperatureRainfall(0.8f, 0.4f);
        "".length();
        this.setHeight(BiomeGenPlains.height_LowPlains);
        "".length();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityHorse.class, BiomeGenPlains.lIIIlIIIlIllII[0], BiomeGenPlains.lIIIlIIIlIllII[1], BiomeGenPlains.lIIIlIIIlIllII[2]));
        "".length();
        this.theBiomeDecorator.treesPerChunk = BiomeGenPlains.lIIIlIIIlIllII[3];
        this.theBiomeDecorator.flowersPerChunk = BiomeGenPlains.lIIIlIIIlIllII[4];
        this.theBiomeDecorator.grassPerChunk = BiomeGenPlains.lIIIlIIIlIllII[5];
    }
    
    private static void lIlllllIIlllIIl() {
        (lIIIlIIIlIlIlI = new String[BiomeGenPlains.lIIIlIIIlIllII[7]])[BiomeGenPlains.lIIIlIIIlIllII[10]] = lIlllllIIlllIII("NxoGECULGA0EaTQDCR8nFw==", "dohvI");
    }
    
    @Override
    public void decorate(final World lllllllllllllIlIIIllIIIlIlIIIlIl, final Random lllllllllllllIlIIIllIIIlIlIlIIIl, final BlockPos lllllllllllllIlIIIllIIIlIlIlIIII) {
        final double lllllllllllllIlIIIllIIIlIlIIllll = BiomeGenPlains.GRASS_COLOR_NOISE.func_151601_a((lllllllllllllIlIIIllIIIlIlIlIIII.getX() + BiomeGenPlains.lIIIlIIIlIllII[8]) / 200.0, (lllllllllllllIlIIIllIIIlIlIlIIII.getZ() + BiomeGenPlains.lIIIlIIIlIllII[8]) / 200.0);
        if (lIlllllIIllllll(lIlllllIlIIIIll(lllllllllllllIlIIIllIIIlIlIIllll, -0.8))) {
            this.theBiomeDecorator.flowersPerChunk = BiomeGenPlains.lIIIlIIIlIllII[9];
            this.theBiomeDecorator.grassPerChunk = BiomeGenPlains.lIIIlIIIlIllII[0];
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else {
            this.theBiomeDecorator.flowersPerChunk = BiomeGenPlains.lIIIlIIIlIllII[4];
            this.theBiomeDecorator.grassPerChunk = BiomeGenPlains.lIIIlIIIlIllII[5];
            BiomeGenPlains.DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.GRASS);
            int lllllllllllllIlIIIllIIIlIlIIlllI = BiomeGenPlains.lIIIlIIIlIllII[10];
            "".length();
            if (((0xBC ^ 0xC2 ^ (0xDE ^ 0xB1)) & (0x14 ^ 0x36 ^ (0x22 ^ 0x11) ^ -" ".length())) > 0) {
                return;
            }
            while (!lIlllllIlIIIlII(lllllllllllllIlIIIllIIIlIlIIlllI, BiomeGenPlains.lIIIlIIIlIllII[13])) {
                final int lllllllllllllIlIIIllIIIlIlIIllIl = lllllllllllllIlIIIllIIIlIlIlIIIl.nextInt(BiomeGenPlains.lIIIlIIIlIllII[11]) + BiomeGenPlains.lIIIlIIIlIllII[8];
                final int lllllllllllllIlIIIllIIIlIlIIllII = lllllllllllllIlIIIllIIIlIlIlIIIl.nextInt(BiomeGenPlains.lIIIlIIIlIllII[11]) + BiomeGenPlains.lIIIlIIIlIllII[8];
                final int lllllllllllllIlIIIllIIIlIlIIlIll = lllllllllllllIlIIIllIIIlIlIlIIIl.nextInt(lllllllllllllIlIIIllIIIlIlIIIlIl.getHeight(lllllllllllllIlIIIllIIIlIlIlIIII.add(lllllllllllllIlIIIllIIIlIlIIllIl, BiomeGenPlains.lIIIlIIIlIllII[10], lllllllllllllIlIIIllIIIlIlIIllII)).getY() + BiomeGenPlains.lIIIlIIIlIllII[12]);
                BiomeGenPlains.DOUBLE_PLANT_GENERATOR.generate(lllllllllllllIlIIIllIIIlIlIIIlIl, lllllllllllllIlIIIllIIIlIlIlIIIl, lllllllllllllIlIIIllIIIlIlIlIIII.add(lllllllllllllIlIIIllIIIlIlIIllIl, lllllllllllllIlIIIllIIIlIlIIlIll, lllllllllllllIlIIIllIIIlIlIIllII));
                "".length();
                ++lllllllllllllIlIIIllIIIlIlIIlllI;
            }
        }
        if (lIlllllIlIIIlIl(this.field_150628_aC ? 1 : 0)) {
            BiomeGenPlains.DOUBLE_PLANT_GENERATOR.setPlantType(BlockDoublePlant.EnumPlantType.SUNFLOWER);
            int lllllllllllllIlIIIllIIIlIlIIlIlI = BiomeGenPlains.lIIIlIIIlIllII[10];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlllllIlIIIlII(lllllllllllllIlIIIllIIIlIlIIlIlI, BiomeGenPlains.lIIIlIIIlIllII[5])) {
                final int lllllllllllllIlIIIllIIIlIlIIlIIl = lllllllllllllIlIIIllIIIlIlIlIIIl.nextInt(BiomeGenPlains.lIIIlIIIlIllII[11]) + BiomeGenPlains.lIIIlIIIlIllII[8];
                final int lllllllllllllIlIIIllIIIlIlIIlIII = lllllllllllllIlIIIllIIIlIlIlIIIl.nextInt(BiomeGenPlains.lIIIlIIIlIllII[11]) + BiomeGenPlains.lIIIlIIIlIllII[8];
                final int lllllllllllllIlIIIllIIIlIlIIIlll = lllllllllllllIlIIIllIIIlIlIlIIIl.nextInt(lllllllllllllIlIIIllIIIlIlIIIlIl.getHeight(lllllllllllllIlIIIllIIIlIlIlIIII.add(lllllllllllllIlIIIllIIIlIlIIlIIl, BiomeGenPlains.lIIIlIIIlIllII[10], lllllllllllllIlIIIllIIIlIlIIlIII)).getY() + BiomeGenPlains.lIIIlIIIlIllII[12]);
                BiomeGenPlains.DOUBLE_PLANT_GENERATOR.generate(lllllllllllllIlIIIllIIIlIlIIIlIl, lllllllllllllIlIIIllIIIlIlIlIIIl, lllllllllllllIlIIIllIIIlIlIlIIII.add(lllllllllllllIlIIIllIIIlIlIIlIIl, lllllllllllllIlIIIllIIIlIlIIIlll, lllllllllllllIlIIIllIIIlIlIIlIII));
                "".length();
                ++lllllllllllllIlIIIllIIIlIlIIlIlI;
            }
        }
        super.decorate(lllllllllllllIlIIIllIIIlIlIIIlIl, lllllllllllllIlIIIllIIIlIlIlIIIl, lllllllllllllIlIIIllIIIlIlIlIIII);
    }
    
    private static void lIlllllIIllllII() {
        (lIIIlIIIlIllII = new int[16])[0] = (156 + 0 - 28 + 53 ^ 40 + 174 - 56 + 18);
        BiomeGenPlains.lIIIlIIIlIllII[1] = "  ".length();
        BiomeGenPlains.lIIIlIIIlIllII[2] = (0x33 ^ 0x35);
        BiomeGenPlains.lIIIlIIIlIllII[3] = -(-(0xFFFFFE39 & 0xDC7) & (0xFFFF8FE7 & 0x7FFF));
        BiomeGenPlains.lIIIlIIIlIllII[4] = (0xAF ^ 0xAB);
        BiomeGenPlains.lIIIlIIIlIllII[5] = (0xB ^ 0x0 ^ " ".length());
        BiomeGenPlains.lIIIlIIIlIllII[6] = "   ".length();
        BiomeGenPlains.lIIIlIIIlIllII[7] = " ".length();
        BiomeGenPlains.lIIIlIIIlIllII[8] = (0x2C ^ 0x15 ^ (0x13 ^ 0x22));
        BiomeGenPlains.lIIIlIIIlIllII[9] = (0x49 ^ 0x46);
        BiomeGenPlains.lIIIlIIIlIllII[10] = ((0x56 ^ 0x7 ^ (0xCD ^ 0xAF)) & (121 + 18 - 92 + 124 ^ 93 + 60 - 72 + 71 ^ -" ".length()));
        BiomeGenPlains.lIIIlIIIlIllII[11] = (0x7B ^ 0x6B);
        BiomeGenPlains.lIIIlIIIlIllII[12] = (0x33 ^ 0x13);
        BiomeGenPlains.lIIIlIIIlIllII[13] = (((0x31 ^ 0x79) & ~(0xCB ^ 0x83)) ^ (0xC4 ^ 0xC3));
        BiomeGenPlains.lIIIlIIIlIllII[14] = (0xFFFFF7F3 & 0x8DBB6C);
        BiomeGenPlains.lIIIlIIIlIllII[15] = (0xFFFFDFFF & 0xD9EB4A);
    }
    
    private static boolean lIlllllIlIIIIIl(final int lllllllllllllIlIIIllIIIlIIIIllll) {
        return lllllllllllllIlIIIllIIIlIIIIllll == 0;
    }
    
    private static boolean lIlllllIlIIIllI(final int lllllllllllllIlIIIllIIIlIIIlIlII, final int lllllllllllllIlIIIllIIIlIIIlIIll) {
        return lllllllllllllIlIIIllIIIlIIIlIlII < lllllllllllllIlIIIllIIIlIIIlIIll;
    }
}
