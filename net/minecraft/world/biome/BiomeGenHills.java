// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.world.chunk.ChunkPrimer;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockSilverfish;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenHills extends BiomeGenBase
{
    private static final /* synthetic */ String[] lllIlIlIlIllIl;
    private /* synthetic */ int field_150638_aH;
    private /* synthetic */ int field_150635_aE;
    private /* synthetic */ int field_150636_aF;
    private /* synthetic */ WorldGenerator theWorldGenerator;
    private /* synthetic */ WorldGenTaiga2 field_150634_aD;
    private static final /* synthetic */ int[] lllIlIlIlIlllI;
    private /* synthetic */ int field_150637_aG;
    
    private static boolean lIlIIIllIIIIllll(final int llllllllllllIlIllIllIIlIIIIIIIII, final int llllllllllllIlIllIllIIIlllllllll) {
        return llllllllllllIlIllIllIIlIIIIIIIII != llllllllllllIlIllIllIIIlllllllll;
    }
    
    static {
        lIlIIIllIIIIIllI();
        lIlIIIllIIIIIlIl();
    }
    
    @Override
    public void decorate(final World llllllllllllIlIllIllIIlIIlIllIII, final Random llllllllllllIlIllIllIIlIIlIlIlll, final BlockPos llllllllllllIlIllIllIIlIIlIlIllI) {
        super.decorate(llllllllllllIlIllIllIIlIIlIllIII, llllllllllllIlIllIllIIlIIlIlIlll, llllllllllllIlIllIllIIlIIlIlIllI);
        int llllllllllllIlIllIllIIlIIlIlIlIl = BiomeGenHills.lllIlIlIlIlllI[4] + llllllllllllIlIllIllIIlIIlIlIlll.nextInt(BiomeGenHills.lllIlIlIlIlllI[5]);
        int llllllllllllIlIllIllIIlIIlIlIlII = BiomeGenHills.lllIlIlIlIlllI[1];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!lIlIIIllIIIIlIlI(llllllllllllIlIllIllIIlIIlIlIlII, llllllllllllIlIllIllIIlIIlIlIlIl)) {
            final int llllllllllllIlIllIllIIlIIlIlIIll = llllllllllllIlIllIllIIlIIlIlIlll.nextInt(BiomeGenHills.lllIlIlIlIlllI[6]);
            final int llllllllllllIlIllIllIIlIIlIlIIlI = llllllllllllIlIllIllIIlIIlIlIlll.nextInt(BiomeGenHills.lllIlIlIlIlllI[7]) + BiomeGenHills.lllIlIlIlIlllI[8];
            final int llllllllllllIlIllIllIIlIIlIlIIIl = llllllllllllIlIllIllIIlIIlIlIlll.nextInt(BiomeGenHills.lllIlIlIlIlllI[6]);
            final BlockPos llllllllllllIlIllIllIIlIIlIlIIII = llllllllllllIlIllIllIIlIIlIlIllI.add(llllllllllllIlIllIllIIlIIlIlIIll, llllllllllllIlIllIllIIlIIlIlIIlI, llllllllllllIlIllIllIIlIIlIlIIIl);
            if (lIlIIIllIIIIlIIl(llllllllllllIlIllIllIIlIIlIllIII.getBlockState(llllllllllllIlIllIllIIlIIlIlIIII).getBlock(), Blocks.stone)) {
                llllllllllllIlIllIllIIlIIlIllIII.setBlockState(llllllllllllIlIllIllIIlIIlIlIIII, Blocks.emerald_ore.getDefaultState(), BiomeGenHills.lllIlIlIlIlllI[3]);
                "".length();
            }
            ++llllllllllllIlIllIllIIlIIlIlIlII;
        }
        llllllllllllIlIllIllIIlIIlIlIlIl = BiomeGenHills.lllIlIlIlIlllI[1];
        "".length();
        if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIlIIIllIIIIlIlI(llllllllllllIlIllIllIIlIIlIlIlIl, BiomeGenHills.lllIlIlIlIlllI[10])) {
            final int llllllllllllIlIllIllIIlIIlIIllll = llllllllllllIlIllIllIIlIIlIlIlll.nextInt(BiomeGenHills.lllIlIlIlIlllI[6]);
            final int llllllllllllIlIllIllIIlIIlIIlllI = llllllllllllIlIllIllIIlIIlIlIlll.nextInt(BiomeGenHills.lllIlIlIlIlllI[9]);
            final int llllllllllllIlIllIllIIlIIlIIllIl = llllllllllllIlIllIllIIlIIlIlIlll.nextInt(BiomeGenHills.lllIlIlIlIlllI[6]);
            this.theWorldGenerator.generate(llllllllllllIlIllIllIIlIIlIllIII, llllllllllllIlIllIllIIlIIlIlIlll, llllllllllllIlIllIllIIlIIlIlIllI.add(llllllllllllIlIllIllIIlIIlIIllll, llllllllllllIlIllIllIIlIIlIIlllI, llllllllllllIlIllIllIIlIIlIIllIl));
            "".length();
            ++llllllllllllIlIllIllIIlIIlIlIlIl;
        }
    }
    
    private static boolean lIlIIIllIIIIllIl(final int llllllllllllIlIllIllIIlIIIIIIlIl) {
        return llllllllllllIlIllIllIIlIIIIIIlIl >= 0;
    }
    
    @Override
    public WorldGenAbstractTree genBigTreeChance(final Random llllllllllllIlIllIllIIlIIllIIllI) {
        WorldGenAbstractTree worldGenAbstractTree;
        if (lIlIIIllIIIIlIII(llllllllllllIlIllIllIIlIIllIIllI.nextInt(BiomeGenHills.lllIlIlIlIlllI[4]))) {
            worldGenAbstractTree = this.field_150634_aD;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        else {
            worldGenAbstractTree = super.genBigTreeChance(llllllllllllIlIllIllIIlIIllIIllI);
        }
        return worldGenAbstractTree;
    }
    
    @Override
    protected BiomeGenBase createMutatedBiome(final int llllllllllllIlIllIllIIlIIIlIIlII) {
        return new BiomeGenHills(llllllllllllIlIllIllIIlIIIlIIlII, (boolean)(BiomeGenHills.lllIlIlIlIlllI[1] != 0)).mutateHills(this);
    }
    
    private static void lIlIIIllIIIIIllI() {
        (lllIlIlIlIlllI = new int[11])[0] = (0xA3 ^ 0xAA);
        BiomeGenHills.lllIlIlIlIlllI[1] = ((104 + 124 - 91 + 44 ^ 74 + 57 - 19 + 59) & (0xE2 ^ 0xC7 ^ (0x61 ^ 0x5A) ^ -" ".length()));
        BiomeGenHills.lllIlIlIlIlllI[2] = " ".length();
        BiomeGenHills.lllIlIlIlIlllI[3] = "  ".length();
        BiomeGenHills.lllIlIlIlIlllI[4] = "   ".length();
        BiomeGenHills.lllIlIlIlIlllI[5] = (0x8B ^ 0x8D);
        BiomeGenHills.lllIlIlIlIlllI[6] = (0x29 ^ 0x39);
        BiomeGenHills.lllIlIlIlIlllI[7] = (0x23 ^ 0x61 ^ (0x30 ^ 0x6E));
        BiomeGenHills.lllIlIlIlIlllI[8] = (0x38 ^ 0x10 ^ (0x4B ^ 0x67));
        BiomeGenHills.lllIlIlIlIlllI[9] = (47 + 126 - 148 + 103 ^ 13 + 153 - 31 + 57);
        BiomeGenHills.lllIlIlIlIlllI[10] = (0x1A ^ 0x6C ^ (0xD4 ^ 0xA5));
    }
    
    private static String lIlIIIllIIIIIlII(final String llllllllllllIlIllIllIIlIIIIllIII, final String llllllllllllIlIllIllIIlIIIIllIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIIlIIIIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIIlIIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIllIIlIIIIlllII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIllIIlIIIIlllII.init(BiomeGenHills.lllIlIlIlIlllI[3], llllllllllllIlIllIllIIlIIIIlllIl);
            return new String(llllllllllllIlIllIllIIlIIIIlllII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIIlIIIIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIIlIIIIllIll) {
            llllllllllllIlIllIllIIlIIIIllIll.printStackTrace();
            return null;
        }
    }
    
    private BiomeGenHills mutateHills(final BiomeGenBase llllllllllllIlIllIllIIlIIIlIlIII) {
        this.field_150638_aH = this.field_150637_aG;
        this.func_150557_a(llllllllllllIlIllIllIIlIIIlIlIII.color, (boolean)(BiomeGenHills.lllIlIlIlIlllI[2] != 0));
        "".length();
        this.setBiomeName(String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIllIIlIIIlIlIII.biomeName)).append(BiomeGenHills.lllIlIlIlIllIl[BiomeGenHills.lllIlIlIlIlllI[1]])));
        "".length();
        this.setHeight(new Height(llllllllllllIlIllIllIIlIIIlIlIII.minHeight, llllllllllllIlIllIllIIlIIIlIlIII.maxHeight));
        "".length();
        this.setTemperatureRainfall(llllllllllllIlIllIllIIlIIIlIlIII.temperature, llllllllllllIlIllIllIIlIIIlIlIII.rainfall);
        "".length();
        return this;
    }
    
    private static int lIlIIIllIIIIllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIIIllIIIIlIIl(final Object llllllllllllIlIllIllIIlIIIIIlIlI, final Object llllllllllllIlIllIllIIlIIIIIlIIl) {
        return llllllllllllIlIllIllIIlIIIIIlIlI == llllllllllllIlIllIllIIlIIIIIlIIl;
    }
    
    private static boolean lIlIIIllIIIIIlll(final int llllllllllllIlIllIllIIlIIIIIIlll) {
        return llllllllllllIlIllIllIIlIIIIIIlll != 0;
    }
    
    private static void lIlIIIllIIIIIlIl() {
        (lllIlIlIlIllIl = new String[BiomeGenHills.lllIlIlIlIlllI[2]])[BiomeGenHills.lllIlIlIlIlllI[1]] = lIlIIIllIIIIIlII("n9HtVoE2LsI=", "HjfDN");
    }
    
    protected BiomeGenHills(final int llllllllllllIlIllIllIIlIIllIlllI, final boolean llllllllllllIlIllIllIIlIIllIlIlI) {
        super(llllllllllllIlIllIllIIlIIllIlllI);
        this.theWorldGenerator = new WorldGenMinable(Blocks.monster_egg.getDefaultState().withProperty(BlockSilverfish.VARIANT, BlockSilverfish.EnumType.STONE), BiomeGenHills.lllIlIlIlIlllI[0]);
        this.field_150634_aD = new WorldGenTaiga2((boolean)(BiomeGenHills.lllIlIlIlIlllI[1] != 0));
        this.field_150635_aE = BiomeGenHills.lllIlIlIlIlllI[1];
        this.field_150636_aF = BiomeGenHills.lllIlIlIlIlllI[2];
        this.field_150637_aG = BiomeGenHills.lllIlIlIlIlllI[3];
        this.field_150638_aH = this.field_150635_aE;
        if (lIlIIIllIIIIIlll(llllllllllllIlIllIllIIlIIllIlIlI ? 1 : 0)) {
            this.theBiomeDecorator.treesPerChunk = BiomeGenHills.lllIlIlIlIlllI[4];
            this.field_150638_aH = this.field_150636_aF;
        }
    }
    
    private static boolean lIlIIIllIIIIlllI(final int llllllllllllIlIllIllIIlIIIIlIIlI, final int llllllllllllIlIllIllIIlIIIIlIIIl) {
        return llllllllllllIlIllIllIIlIIIIlIIlI == llllllllllllIlIllIllIIlIIIIlIIIl;
    }
    
    private static boolean lIlIIIllIIIIlIII(final int llllllllllllIlIllIllIIlIIIIIIIll) {
        return llllllllllllIlIllIllIIlIIIIIIIll > 0;
    }
    
    private static boolean lIlIIIllIIIIlIlI(final int llllllllllllIlIllIllIIlIIIIIlllI, final int llllllllllllIlIllIllIIlIIIIIllIl) {
        return llllllllllllIlIllIllIIlIIIIIlllI >= llllllllllllIlIllIllIIlIIIIIllIl;
    }
    
    private static int lIlIIIllIIIIlIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void genTerrainBlocks(final World llllllllllllIlIllIllIIlIIIlllIlI, final Random llllllllllllIlIllIllIIlIIIlllIIl, final ChunkPrimer llllllllllllIlIllIllIIlIIIllIIIl, final int llllllllllllIlIllIllIIlIIIllIlll, final int llllllllllllIlIllIllIIlIIIllIllI, final double llllllllllllIlIllIllIIlIIIllIlIl) {
        this.topBlock = Blocks.grass.getDefaultState();
        this.fillerBlock = Blocks.dirt.getDefaultState();
        if ((!lIlIIIllIIIIllIl(lIlIIIllIIIIlIll(llllllllllllIlIllIllIIlIIIllIlIl, -1.0)) || lIlIIIllIIIIlIII(lIlIIIllIIIIllII(llllllllllllIlIllIllIIlIIIllIlIl, 2.0))) && lIlIIIllIIIIlllI(this.field_150638_aH, this.field_150637_aG)) {
            this.topBlock = Blocks.gravel.getDefaultState();
            this.fillerBlock = Blocks.gravel.getDefaultState();
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIlIIIllIIIIlIII(lIlIIIllIIIIllII(llllllllllllIlIllIllIIlIIIllIlIl, 1.0)) && lIlIIIllIIIIllll(this.field_150638_aH, this.field_150636_aF)) {
            this.topBlock = Blocks.stone.getDefaultState();
            this.fillerBlock = Blocks.stone.getDefaultState();
        }
        this.generateBiomeTerrain(llllllllllllIlIllIllIIlIIIlllIlI, llllllllllllIlIllIllIIlIIIlllIIl, llllllllllllIlIllIllIIlIIIllIIIl, llllllllllllIlIllIllIIlIIIllIlll, llllllllllllIlIllIllIIlIIIllIllI, llllllllllllIlIllIllIIlIIIllIlIl);
    }
}
