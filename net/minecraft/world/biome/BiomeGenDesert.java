// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.world.gen.feature.WorldGenDesertWells;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;

public class BiomeGenDesert extends BiomeGenBase
{
    private static final /* synthetic */ int[] lIIIlIlllIlIIl;
    
    private static boolean llIIIIlIIIIllII(final int lllllllllllllIlIIIIlIIllIlllllIl) {
        return lllllllllllllIlIIIIlIIllIlllllIl == 0;
    }
    
    static {
        llIIIIlIIIIlIll();
    }
    
    public BiomeGenDesert(final int lllllllllllllIlIIIIlIIlllIIlIlII) {
        super(lllllllllllllIlIIIIlIIlllIIlIlII);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.sand.getDefaultState();
        this.fillerBlock = Blocks.sand.getDefaultState();
        this.theBiomeDecorator.treesPerChunk = BiomeGenDesert.lIIIlIlllIlIIl[0];
        this.theBiomeDecorator.deadBushPerChunk = BiomeGenDesert.lIIIlIlllIlIIl[1];
        this.theBiomeDecorator.reedsPerChunk = BiomeGenDesert.lIIIlIlllIlIIl[2];
        this.theBiomeDecorator.cactiPerChunk = BiomeGenDesert.lIIIlIlllIlIIl[3];
        this.spawnableCreatureList.clear();
    }
    
    private static void llIIIIlIIIIlIll() {
        (lIIIlIlllIlIIl = new int[8])[0] = -(0xFFFFDFFF & 0x23E7);
        BiomeGenDesert.lIIIlIlllIlIIl[1] = "  ".length();
        BiomeGenDesert.lIIIlIlllIlIIl[2] = (0x1E ^ 0x2C);
        BiomeGenDesert.lIIIlIlllIlIIl[3] = (0xB6 ^ 0xBC);
        BiomeGenDesert.lIIIlIlllIlIIl[4] = (0xFFFFB7FC & 0x4BEB);
        BiomeGenDesert.lIIIlIlllIlIIl[5] = (0x3B ^ 0x2B);
        BiomeGenDesert.lIIIlIlllIlIIl[6] = (0x31 ^ 0x39);
        BiomeGenDesert.lIIIlIlllIlIIl[7] = ((17 + 57 - 16 + 80 ^ 10 + 11 - 14 + 175) & (0xC3 ^ 0x82 ^ (0xEB ^ 0x96) ^ -" ".length()));
    }
    
    @Override
    public void decorate(final World lllllllllllllIlIIIIlIIlllIIIlIll, final Random lllllllllllllIlIIIIlIIlllIIIIIll, final BlockPos lllllllllllllIlIIIIlIIlllIIIlIIl) {
        super.decorate(lllllllllllllIlIIIIlIIlllIIIlIll, lllllllllllllIlIIIIlIIlllIIIIIll, lllllllllllllIlIIIIlIIlllIIIlIIl);
        if (llIIIIlIIIIllII(lllllllllllllIlIIIIlIIlllIIIIIll.nextInt(BiomeGenDesert.lIIIlIlllIlIIl[4]))) {
            final int lllllllllllllIlIIIIlIIlllIIIlIII = lllllllllllllIlIIIIlIIlllIIIIIll.nextInt(BiomeGenDesert.lIIIlIlllIlIIl[5]) + BiomeGenDesert.lIIIlIlllIlIIl[6];
            final int lllllllllllllIlIIIIlIIlllIIIIlll = lllllllllllllIlIIIIlIIlllIIIIIll.nextInt(BiomeGenDesert.lIIIlIlllIlIIl[5]) + BiomeGenDesert.lIIIlIlllIlIIl[6];
            final BlockPos lllllllllllllIlIIIIlIIlllIIIIllI = lllllllllllllIlIIIIlIIlllIIIlIll.getHeight(lllllllllllllIlIIIIlIIlllIIIlIIl.add(lllllllllllllIlIIIIlIIlllIIIlIII, BiomeGenDesert.lIIIlIlllIlIIl[7], lllllllllllllIlIIIIlIIlllIIIIlll)).up();
            new WorldGenDesertWells().generate(lllllllllllllIlIIIIlIIlllIIIlIll, lllllllllllllIlIIIIlIIlllIIIIIll, lllllllllllllIlIIIIlIIlllIIIIllI);
            "".length();
        }
    }
}
