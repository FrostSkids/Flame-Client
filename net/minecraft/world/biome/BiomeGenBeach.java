// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.init.Blocks;

public class BiomeGenBeach extends BiomeGenBase
{
    private static final /* synthetic */ int[] lIlIIIlIIlIlII;
    
    private static void lllIIIlIlIlIIlI() {
        (lIlIIIlIIlIlII = new int[2])[0] = -(0xFFFFA3F7 & 0x5FEF);
        BiomeGenBeach.lIlIIIlIIlIlII[1] = ((0xF4 ^ 0x85 ^ (0xA8 ^ 0x99)) & (61 + 218 - 253 + 199 ^ 46 + 43 - 23 + 95 ^ -" ".length()));
    }
    
    public BiomeGenBeach(final int lllllllllllllIIIlllllIllIIIlllII) {
        super(lllllllllllllIIIlllllIllIIIlllII);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.sand.getDefaultState();
        this.fillerBlock = Blocks.sand.getDefaultState();
        this.theBiomeDecorator.treesPerChunk = BiomeGenBeach.lIlIIIlIIlIlII[0];
        this.theBiomeDecorator.deadBushPerChunk = BiomeGenBeach.lIlIIIlIIlIlII[1];
        this.theBiomeDecorator.reedsPerChunk = BiomeGenBeach.lIlIIIlIIlIlII[1];
        this.theBiomeDecorator.cactiPerChunk = BiomeGenBeach.lIlIIIlIIlIlII[1];
    }
    
    static {
        lllIIIlIlIlIIlI();
    }
}
