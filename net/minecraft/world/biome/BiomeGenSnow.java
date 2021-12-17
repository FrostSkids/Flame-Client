// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import java.util.Random;
import net.minecraft.init.Blocks;
import net.minecraft.world.gen.feature.WorldGenIcePath;
import net.minecraft.world.gen.feature.WorldGenIceSpike;

public class BiomeGenSnow extends BiomeGenBase
{
    private /* synthetic */ WorldGenIceSpike field_150616_aD;
    private /* synthetic */ WorldGenIcePath field_150617_aE;
    private /* synthetic */ boolean field_150615_aC;
    private static final /* synthetic */ int[] lIlIllIIllIIlI;
    private static final /* synthetic */ String[] lIlIllIIllIIIl;
    
    public BiomeGenSnow(final int lllllllllllllIIIIllIllllIlllIlll, final boolean lllllllllllllIIIIllIllllIllllIIl) {
        super(lllllllllllllIIIIllIllllIlllIlll);
        this.field_150616_aD = new WorldGenIceSpike();
        this.field_150617_aE = new WorldGenIcePath(BiomeGenSnow.lIlIllIIllIIlI[0]);
        this.field_150615_aC = lllllllllllllIIIIllIllllIllllIIl;
        if (llllIIIlIIlIlIl(lllllllllllllIIIIllIllllIllllIIl ? 1 : 0)) {
            this.topBlock = Blocks.snow.getDefaultState();
        }
        this.spawnableCreatureList.clear();
    }
    
    @Override
    public WorldGenAbstractTree genBigTreeChance(final Random lllllllllllllIIIIllIllllIlIlllII) {
        return new WorldGenTaiga2((boolean)(BiomeGenSnow.lIlIllIIllIIlI[1] != 0));
    }
    
    @Override
    protected BiomeGenBase createMutatedBiome(final int lllllllllllllIIIIllIllllIlIlIlII) {
        final BiomeGenBase lllllllllllllIIIIllIllllIlIlIllI = new BiomeGenSnow(lllllllllllllIIIIllIllllIlIlIlII, (boolean)(BiomeGenSnow.lIlIllIIllIIlI[6] != 0)).func_150557_a(BiomeGenSnow.lIlIllIIllIIlI[7], (boolean)(BiomeGenSnow.lIlIllIIllIIlI[6] != 0)).setBiomeName(String.valueOf(new StringBuilder(String.valueOf(this.biomeName)).append(BiomeGenSnow.lIlIllIIllIIIl[BiomeGenSnow.lIlIllIIllIIlI[1]]))).setEnableSnow().setTemperatureRainfall(0.0f, 0.5f).setHeight(new Height(this.minHeight + 0.1f, this.maxHeight + 0.1f));
        lllllllllllllIIIIllIllllIlIlIllI.minHeight = this.minHeight + 0.3f;
        lllllllllllllIIIIllIllllIlIlIllI.maxHeight = this.maxHeight + 0.4f;
        return lllllllllllllIIIIllIllllIlIlIllI;
    }
    
    private static boolean llllIIIlIIlIllI(final int lllllllllllllIIIIllIllllIlIIIIll, final int lllllllllllllIIIIllIllllIlIIIIlI) {
        return lllllllllllllIIIIllIllllIlIIIIll >= lllllllllllllIIIIllIllllIlIIIIlI;
    }
    
    private static void llllIIIlIIlIlII() {
        (lIlIllIIllIIlI = new int[8])[0] = (0x7A ^ 0x3E ^ (0x3A ^ 0x7A));
        BiomeGenSnow.lIlIllIIllIIlI[1] = ((0x24 ^ 0x32) & ~(0x55 ^ 0x43));
        BiomeGenSnow.lIlIllIIllIIlI[2] = (0x70 ^ 0x1A ^ (0x75 ^ 0xF));
        BiomeGenSnow.lIlIllIIllIIlI[3] = (0x7F ^ 0x77);
        BiomeGenSnow.lIlIllIIllIIlI[4] = "   ".length();
        BiomeGenSnow.lIlIllIIllIIlI[5] = "  ".length();
        BiomeGenSnow.lIlIllIIllIIlI[6] = " ".length();
        BiomeGenSnow.lIlIllIIllIIlI[7] = (-" ".length() & (-1 & 0xD2FFFF));
    }
    
    @Override
    public void decorate(final World lllllllllllllIIIIllIllllIllIllIl, final Random lllllllllllllIIIIllIllllIllIllII, final BlockPos lllllllllllllIIIIllIllllIllIIIIl) {
        if (llllIIIlIIlIlIl(this.field_150615_aC ? 1 : 0)) {
            int lllllllllllllIIIIllIllllIllIlIlI = BiomeGenSnow.lIlIllIIllIIlI[1];
            "".length();
            if (((81 + 122 - 23 + 59 ^ 12 + 104 - 91 + 116) & (0x71 ^ 0x9 ^ (0x44 ^ 0x5E) ^ -" ".length())) >= "  ".length()) {
                return;
            }
            while (!llllIIIlIIlIllI(lllllllllllllIIIIllIllllIllIlIlI, BiomeGenSnow.lIlIllIIllIIlI[4])) {
                final int lllllllllllllIIIIllIllllIllIlIIl = lllllllllllllIIIIllIllllIllIllII.nextInt(BiomeGenSnow.lIlIllIIllIIlI[2]) + BiomeGenSnow.lIlIllIIllIIlI[3];
                final int lllllllllllllIIIIllIllllIllIlIII = lllllllllllllIIIIllIllllIllIllII.nextInt(BiomeGenSnow.lIlIllIIllIIlI[2]) + BiomeGenSnow.lIlIllIIllIIlI[3];
                this.field_150616_aD.generate(lllllllllllllIIIIllIllllIllIllIl, lllllllllllllIIIIllIllllIllIllII, lllllllllllllIIIIllIllllIllIllIl.getHeight(lllllllllllllIIIIllIllllIllIIIIl.add(lllllllllllllIIIIllIllllIllIlIIl, BiomeGenSnow.lIlIllIIllIIlI[1], lllllllllllllIIIIllIllllIllIlIII)));
                "".length();
                ++lllllllllllllIIIIllIllllIllIlIlI;
            }
            int lllllllllllllIIIIllIllllIllIIlll = BiomeGenSnow.lIlIllIIllIIlI[1];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
            while (!llllIIIlIIlIllI(lllllllllllllIIIIllIllllIllIIlll, BiomeGenSnow.lIlIllIIllIIlI[5])) {
                final int lllllllllllllIIIIllIllllIllIIllI = lllllllllllllIIIIllIllllIllIllII.nextInt(BiomeGenSnow.lIlIllIIllIIlI[2]) + BiomeGenSnow.lIlIllIIllIIlI[3];
                final int lllllllllllllIIIIllIllllIllIIlIl = lllllllllllllIIIIllIllllIllIllII.nextInt(BiomeGenSnow.lIlIllIIllIIlI[2]) + BiomeGenSnow.lIlIllIIllIIlI[3];
                this.field_150617_aE.generate(lllllllllllllIIIIllIllllIllIllIl, lllllllllllllIIIIllIllllIllIllII, lllllllllllllIIIIllIllllIllIllIl.getHeight(lllllllllllllIIIIllIllllIllIIIIl.add(lllllllllllllIIIIllIllllIllIIllI, BiomeGenSnow.lIlIllIIllIIlI[1], lllllllllllllIIIIllIllllIllIIlIl)));
                "".length();
                ++lllllllllllllIIIIllIllllIllIIlll;
            }
        }
        super.decorate(lllllllllllllIIIIllIllllIllIllIl, lllllllllllllIIIIllIllllIllIllII, lllllllllllllIIIIllIllllIllIIIIl);
    }
    
    private static void llllIIIlIIlIIll() {
        (lIlIllIIllIIIl = new String[BiomeGenSnow.lIlIllIIllIIlI[6]])[BiomeGenSnow.lIlIllIIllIIlI[1]] = llllIIIlIIlIIlI("JP35qene0/4=", "UjbWG");
    }
    
    static {
        llllIIIlIIlIlII();
        llllIIIlIIlIIll();
    }
    
    private static String llllIIIlIIlIIlI(final String lllllllllllllIIIIllIllllIlIIlIll, final String lllllllllllllIIIIllIllllIlIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIllllIlIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIllllIlIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIllllIlIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIllllIlIIllIl.init(BiomeGenSnow.lIlIllIIllIIlI[5], lllllllllllllIIIIllIllllIlIIlllI);
            return new String(lllllllllllllIIIIllIllllIlIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIllllIlIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIllllIlIIllII) {
            lllllllllllllIIIIllIllllIlIIllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIIlIIlIlIl(final int lllllllllllllIIIIllIllllIlIIIIII) {
        return lllllllllllllIIIIllIllllIlIIIIII != 0;
    }
}
