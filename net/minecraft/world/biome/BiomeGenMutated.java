// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import java.util.List;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.chunk.ChunkPrimer;
import com.google.common.collect.Lists;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class BiomeGenMutated extends BiomeGenBase
{
    private static final /* synthetic */ int[] lIlllIIIlIllII;
    private static final /* synthetic */ String[] lIlllIIIlIlIll;
    protected /* synthetic */ BiomeGenBase baseBiome;
    
    private static String lIIIIIIlIIlllIlI(final String llllllllllllIlllllIllIlIIIlIIIll, final String llllllllllllIlllllIllIlIIIlIIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllllIllIlIIIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIllIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8)), BiomeGenMutated.lIlllIIIlIllII[2]), "DES");
            final Cipher llllllllllllIlllllIllIlIIIlIlIII = Cipher.getInstance("DES");
            llllllllllllIlllllIllIlIIIlIlIII.init(BiomeGenMutated.lIlllIIIlIllII[3], llllllllllllIlllllIllIlIIIlIlIlI);
            return new String(llllllllllllIlllllIllIlIIIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIllIlIIIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIllIlIIIlIIllI) {
            llllllllllllIlllllIllIlIIIlIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public float getSpawningChance() {
        return this.baseBiome.getSpawningChance();
    }
    
    @Override
    public int getFoliageColorAtPos(final BlockPos llllllllllllIlllllIllIlIIlIllIIl) {
        return this.baseBiome.getFoliageColorAtPos(llllllllllllIlllllIllIlIIlIllIIl);
    }
    
    @Override
    public Class<? extends BiomeGenBase> getBiomeClass() {
        return this.baseBiome.getBiomeClass();
    }
    
    private static void lIIIIIIlIlIIlIIl() {
        (lIlllIIIlIllII = new int[4])[0] = " ".length();
        BiomeGenMutated.lIlllIIIlIllII[1] = ((0x5D ^ 0x8) & ~(0x7D ^ 0x28));
        BiomeGenMutated.lIlllIIIlIllII[2] = (70 + 76 - 121 + 161 ^ 174 + 132 - 232 + 104);
        BiomeGenMutated.lIlllIIIlIllII[3] = "  ".length();
    }
    
    @Override
    public void decorate(final World llllllllllllIlllllIllIlIlIIllIIl, final Random llllllllllllIlllllIllIlIlIIlllII, final BlockPos llllllllllllIlllllIllIlIlIIllIll) {
        this.baseBiome.theBiomeDecorator.decorate(llllllllllllIlllllIllIlIlIIllIIl, llllllllllllIlllllIllIlIlIIlllII, this, llllllllllllIlllllIllIlIlIIllIll);
    }
    
    public BiomeGenMutated(final int llllllllllllIlllllIllIlIlIlIlllI, final BiomeGenBase llllllllllllIlllllIllIlIlIlIllII) {
        super(llllllllllllIlllllIllIlIlIlIlllI);
        this.baseBiome = llllllllllllIlllllIllIlIlIlIllII;
        this.func_150557_a(llllllllllllIlllllIllIlIlIlIllII.color, (boolean)(BiomeGenMutated.lIlllIIIlIllII[0] != 0));
        "".length();
        this.biomeName = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlllllIllIlIlIlIllII.biomeName)).append(BiomeGenMutated.lIlllIIIlIlIll[BiomeGenMutated.lIlllIIIlIllII[1]]));
        this.topBlock = llllllllllllIlllllIllIlIlIlIllII.topBlock;
        this.fillerBlock = llllllllllllIlllllIllIlIlIlIllII.fillerBlock;
        this.fillerBlockMetadata = llllllllllllIlllllIllIlIlIlIllII.fillerBlockMetadata;
        this.minHeight = llllllllllllIlllllIllIlIlIlIllII.minHeight;
        this.maxHeight = llllllllllllIlllllIllIlIlIlIllII.maxHeight;
        this.temperature = llllllllllllIlllllIllIlIlIlIllII.temperature;
        this.rainfall = llllllllllllIlllllIllIlIlIlIllII.rainfall;
        this.waterColorMultiplier = llllllllllllIlllllIllIlIlIlIllII.waterColorMultiplier;
        this.enableSnow = llllllllllllIlllllIllIlIlIlIllII.enableSnow;
        this.enableRain = llllllllllllIlllllIllIlIlIlIllII.enableRain;
        this.spawnableCreatureList = (List<SpawnListEntry>)Lists.newArrayList((Iterable)llllllllllllIlllllIllIlIlIlIllII.spawnableCreatureList);
        this.spawnableMonsterList = (List<SpawnListEntry>)Lists.newArrayList((Iterable)llllllllllllIlllllIllIlIlIlIllII.spawnableMonsterList);
        this.spawnableCaveCreatureList = (List<SpawnListEntry>)Lists.newArrayList((Iterable)llllllllllllIlllllIllIlIlIlIllII.spawnableCaveCreatureList);
        this.spawnableWaterCreatureList = (List<SpawnListEntry>)Lists.newArrayList((Iterable)llllllllllllIlllllIllIlIlIlIllII.spawnableWaterCreatureList);
        this.temperature = llllllllllllIlllllIllIlIlIlIllII.temperature;
        this.rainfall = llllllllllllIlllllIllIlIlIlIllII.rainfall;
        this.minHeight = llllllllllllIlllllIllIlIlIlIllII.minHeight + 0.1f;
        this.maxHeight = llllllllllllIlllllIllIlIlIlIllII.maxHeight + 0.2f;
    }
    
    @Override
    public void genTerrainBlocks(final World llllllllllllIlllllIllIlIIlllIlll, final Random llllllllllllIlllllIllIlIIlllIllI, final ChunkPrimer llllllllllllIlllllIllIlIIlllIlIl, final int llllllllllllIlllllIllIlIIllllllI, final int llllllllllllIlllllIllIlIIlllllII, final double llllllllllllIlllllIllIlIIllllIlI) {
        this.baseBiome.genTerrainBlocks(llllllllllllIlllllIllIlIIlllIlll, llllllllllllIlllllIllIlIIlllIllI, llllllllllllIlllllIllIlIIlllIlIl, llllllllllllIlllllIllIlIIllllllI, llllllllllllIlllllIllIlIIlllllII, llllllllllllIlllllIllIlIIllllIlI);
    }
    
    static {
        lIIIIIIlIlIIlIIl();
        lIIIIIIlIIllllIl();
    }
    
    @Override
    public TempCategory getTempCategory() {
        return this.baseBiome.getTempCategory();
    }
    
    private static void lIIIIIIlIIllllIl() {
        (lIlllIIIlIlIll = new String[BiomeGenMutated.lIlllIIIlIllII[0]])[BiomeGenMutated.lIlllIIIlIllII[1]] = lIIIIIIlIIlllIlI("muRZ423v4p8=", "APZZQ");
    }
    
    @Override
    public WorldGenAbstractTree genBigTreeChance(final Random llllllllllllIlllllIllIlIIllIIIIl) {
        return this.baseBiome.genBigTreeChance(llllllllllllIlllllIllIlIIllIIIIl);
    }
    
    @Override
    public int getGrassColorAtPos(final BlockPos llllllllllllIlllllIllIlIIlIIlIll) {
        return this.baseBiome.getGrassColorAtPos(llllllllllllIlllllIllIlIIlIIlIll);
    }
    
    @Override
    public boolean isEqualTo(final BiomeGenBase llllllllllllIlllllIllIlIIIlllIlI) {
        return this.baseBiome.isEqualTo(llllllllllllIlllllIllIlIIIlllIlI);
    }
}
