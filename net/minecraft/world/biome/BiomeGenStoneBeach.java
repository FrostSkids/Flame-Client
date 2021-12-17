// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.init.Blocks;

public class BiomeGenStoneBeach extends BiomeGenBase
{
    private static final /* synthetic */ int[] llIlIllIIIlIIl;
    
    static {
        lIIlIlIIllllllll();
    }
    
    private static void lIIlIlIIllllllll() {
        (llIlIllIIIlIIl = new int[2])[0] = -(-(0xFFFFE0D9 & 0x7F3F) & (0xFFFFF3FF & 0x6FFF));
        BiomeGenStoneBeach.llIlIllIIIlIIl[1] = ((0x46 ^ 0x4B) & ~(0x36 ^ 0x3B));
    }
    
    public BiomeGenStoneBeach(final int llllllllllllIllIlIIlllIIlIIIlIlI) {
        super(llllllllllllIllIlIIlllIIlIIIlIlI);
        this.spawnableCreatureList.clear();
        this.topBlock = Blocks.stone.getDefaultState();
        this.fillerBlock = Blocks.stone.getDefaultState();
        this.theBiomeDecorator.treesPerChunk = BiomeGenStoneBeach.llIlIllIIIlIIl[0];
        this.theBiomeDecorator.deadBushPerChunk = BiomeGenStoneBeach.llIlIllIIIlIIl[1];
        this.theBiomeDecorator.reedsPerChunk = BiomeGenStoneBeach.llIlIllIIIlIIl[1];
        this.theBiomeDecorator.cactiPerChunk = BiomeGenStoneBeach.llIlIllIIIlIIl[1];
    }
}
