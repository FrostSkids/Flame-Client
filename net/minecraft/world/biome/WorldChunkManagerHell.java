// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.util.BlockPos;
import java.util.Random;
import java.util.List;
import java.util.Arrays;

public class WorldChunkManagerHell extends WorldChunkManager
{
    private /* synthetic */ BiomeGenBase biomeGenerator;
    private static final /* synthetic */ int[] llIllllIIlIllI;
    private /* synthetic */ float rainfall;
    
    @Override
    public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] llllllllllllIllIIIllllIIIllIlIII, final int llllllllllllIllIIIllllIIIllIllIl, final int llllllllllllIllIIIllllIIIllIllII, final int llllllllllllIllIIIllllIIIllIIlll, final int llllllllllllIllIIIllllIIIllIlIlI) {
        if (!lIIllIlIlIIIllll(llllllllllllIllIIIllllIIIllIlIII) || lIIllIlIlIIlIIII(llllllllllllIllIIIllllIIIllIlIII.length, llllllllllllIllIIIllllIIIllIIlll * llllllllllllIllIIIllllIIIllIlIlI)) {
            llllllllllllIllIIIllllIIIllIlIII = new BiomeGenBase[llllllllllllIllIIIllllIIIllIIlll * llllllllllllIllIIIllllIIIllIlIlI];
        }
        Arrays.fill(llllllllllllIllIIIllllIIIllIlIII, WorldChunkManagerHell.llIllllIIlIllI[0], llllllllllllIllIIIllllIIIllIIlll * llllllllllllIllIIIllllIIIllIlIlI, this.biomeGenerator);
        return llllllllllllIllIIIllllIIIllIlIII;
    }
    
    @Override
    public BlockPos findBiomePosition(final int llllllllllllIllIIIllllIIIlIIIlIl, final int llllllllllllIllIIIllllIIIlIIIlII, final int llllllllllllIllIIIllllIIIlIIIIll, final List<BiomeGenBase> llllllllllllIllIIIllllIIIlIIlIII, final Random llllllllllllIllIIIllllIIIlIIIIIl) {
        BlockPos blockPos;
        if (lIIllIlIlIIlIIIl(llllllllllllIllIIIllllIIIlIIlIII.contains(this.biomeGenerator) ? 1 : 0)) {
            blockPos = new BlockPos(llllllllllllIllIIIllllIIIlIIIlIl - llllllllllllIllIIIllllIIIlIIIIll + llllllllllllIllIIIllllIIIlIIIIIl.nextInt(llllllllllllIllIIIllllIIIlIIIIll * WorldChunkManagerHell.llIllllIIlIllI[1] + WorldChunkManagerHell.llIllllIIlIllI[2]), WorldChunkManagerHell.llIllllIIlIllI[0], llllllllllllIllIIIllllIIIlIIIlII - llllllllllllIllIIIllllIIIlIIIIll + llllllllllllIllIIIllllIIIlIIIIIl.nextInt(llllllllllllIllIIIllllIIIlIIIIll * WorldChunkManagerHell.llIllllIIlIllI[1] + WorldChunkManagerHell.llIllllIIlIllI[2]));
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            blockPos = null;
        }
        return blockPos;
    }
    
    static {
        lIIllIlIlIIIlllI();
    }
    
    @Override
    public float[] getRainfall(float[] llllllllllllIllIIIllllIIIlllIllI, final int llllllllllllIllIIIllllIIIllllIll, final int llllllllllllIllIIIllllIIIllllIlI, final int llllllllllllIllIIIllllIIIlllIlIl, final int llllllllllllIllIIIllllIIIllllIII) {
        if (!lIIllIlIlIIIllll(llllllllllllIllIIIllllIIIlllIllI) || lIIllIlIlIIlIIII(llllllllllllIllIIIllllIIIlllIllI.length, llllllllllllIllIIIllllIIIlllIlIl * llllllllllllIllIIIllllIIIllllIII)) {
            llllllllllllIllIIIllllIIIlllIllI = new float[llllllllllllIllIIIllllIIIlllIlIl * llllllllllllIllIIIllllIIIllllIII];
        }
        Arrays.fill(llllllllllllIllIIIllllIIIlllIllI, WorldChunkManagerHell.llIllllIIlIllI[0], llllllllllllIllIIIllllIIIlllIlIl * llllllllllllIllIIIllllIIIllllIII, this.rainfall);
        return llllllllllllIllIIIllllIIIlllIllI;
    }
    
    public WorldChunkManagerHell(final BiomeGenBase llllllllllllIllIIIllllIIlIIlIlIl, final float llllllllllllIllIIIllllIIlIIlIlII) {
        this.biomeGenerator = llllllllllllIllIIIllllIIlIIlIlIl;
        this.rainfall = llllllllllllIllIIIllllIIlIIlIlII;
    }
    
    @Override
    public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] llllllllllllIllIIIllllIIlIIIIlII, final int llllllllllllIllIIIllllIIlIIIlIIl, final int llllllllllllIllIIIllllIIlIIIlIII, final int llllllllllllIllIIIllllIIlIIIIlll, final int llllllllllllIllIIIllllIIlIIIIllI) {
        if (!lIIllIlIlIIIllll(llllllllllllIllIIIllllIIlIIIIlII) || lIIllIlIlIIlIIII(llllllllllllIllIIIllllIIlIIIIlII.length, llllllllllllIllIIIllllIIlIIIIlll * llllllllllllIllIIIllllIIlIIIIllI)) {
            llllllllllllIllIIIllllIIlIIIIlII = new BiomeGenBase[llllllllllllIllIIIllllIIlIIIIlll * llllllllllllIllIIIllllIIlIIIIllI];
        }
        Arrays.fill(llllllllllllIllIIIllllIIlIIIIlII, WorldChunkManagerHell.llIllllIIlIllI[0], llllllllllllIllIIIllllIIlIIIIlll * llllllllllllIllIIIllllIIlIIIIllI, this.biomeGenerator);
        return llllllllllllIllIIIllllIIlIIIIlII;
    }
    
    @Override
    public boolean areBiomesViable(final int llllllllllllIllIIIllllIIIIllllIl, final int llllllllllllIllIIIllllIIIIllllII, final int llllllllllllIllIIIllllIIIIlllIll, final List<BiomeGenBase> llllllllllllIllIIIllllIIIIlllIlI) {
        return llllllllllllIllIIIllllIIIIlllIlI.contains(this.biomeGenerator);
    }
    
    @Override
    public BiomeGenBase getBiomeGenerator(final BlockPos llllllllllllIllIIIllllIIlIIlIIIl) {
        return this.biomeGenerator;
    }
    
    @Override
    public BiomeGenBase[] getBiomeGenAt(final BiomeGenBase[] llllllllllllIllIIIllllIIIlIlIlll, final int llllllllllllIllIIIllllIIIlIlllIl, final int llllllllllllIllIIIllllIIIlIlIlIl, final int llllllllllllIllIIIllllIIIlIllIll, final int llllllllllllIllIIIllllIIIlIlIIll, final boolean llllllllllllIllIIIllllIIIlIllIIl) {
        return this.loadBlockGeneratorData(llllllllllllIllIIIllllIIIlIlIlll, llllllllllllIllIIIllllIIIlIlllIl, llllllllllllIllIIIllllIIIlIlIlIl, llllllllllllIllIIIllllIIIlIllIll, llllllllllllIllIIIllllIIIlIlIIll);
    }
    
    private static boolean lIIllIlIlIIlIIIl(final int llllllllllllIllIIIllllIIIIllIIII) {
        return llllllllllllIllIIIllllIIIIllIIII != 0;
    }
    
    private static void lIIllIlIlIIIlllI() {
        (llIllllIIlIllI = new int[3])[0] = ((0x2D ^ 0x35 ^ (0x1C ^ 0x9)) & (0x52 ^ 0x2E ^ (0xF7 ^ 0x86) ^ -" ".length()));
        WorldChunkManagerHell.llIllllIIlIllI[1] = "  ".length();
        WorldChunkManagerHell.llIllllIIlIllI[2] = " ".length();
    }
    
    private static boolean lIIllIlIlIIlIIII(final int llllllllllllIllIIIllllIIIIllIlIl, final int llllllllllllIllIIIllllIIIIllIlII) {
        return llllllllllllIllIIIllllIIIIllIlIl < llllllllllllIllIIIllllIIIIllIlII;
    }
    
    private static boolean lIIllIlIlIIIllll(final Object llllllllllllIllIIIllllIIIIllIIlI) {
        return llllllllllllIllIIIllllIIIIllIIlI != null;
    }
}
