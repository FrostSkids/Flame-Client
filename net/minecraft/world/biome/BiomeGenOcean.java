// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.world.chunk.ChunkPrimer;
import java.util.Random;
import net.minecraft.world.World;

public class BiomeGenOcean extends BiomeGenBase
{
    public BiomeGenOcean(final int lllllllllllllIIlIIlllIlIIlIIIlll) {
        super(lllllllllllllIIlIIlllIlIIlIIIlll);
        this.spawnableCreatureList.clear();
    }
    
    @Override
    public TempCategory getTempCategory() {
        return TempCategory.OCEAN;
    }
    
    @Override
    public void genTerrainBlocks(final World lllllllllllllIIlIIlllIlIIIllIllI, final Random lllllllllllllIIlIIlllIlIIIllllII, final ChunkPrimer lllllllllllllIIlIIlllIlIIIllIlII, final int lllllllllllllIIlIIlllIlIIIllIIll, final int lllllllllllllIIlIIlllIlIIIlllIIl, final double lllllllllllllIIlIIlllIlIIIlllIII) {
        super.genTerrainBlocks(lllllllllllllIIlIIlllIlIIIllIllI, lllllllllllllIIlIIlllIlIIIllllII, lllllllllllllIIlIIlllIlIIIllIlII, lllllllllllllIIlIIlllIlIIIllIIll, lllllllllllllIIlIIlllIlIIIlllIIl, lllllllllllllIIlIIlllIlIIIlllIII);
    }
}
