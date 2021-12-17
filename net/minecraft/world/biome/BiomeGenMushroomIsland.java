// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.init.Blocks;

public class BiomeGenMushroomIsland extends BiomeGenBase
{
    private static final /* synthetic */ int[] llIlIllllIlllI;
    
    static {
        lIIlIllIIIIIIlII();
    }
    
    public BiomeGenMushroomIsland(final int llllllllllllIllIlIIIlIllIllIIIlI) {
        super(llllllllllllIllIlIIIlIllIllIIIlI);
        this.theBiomeDecorator.treesPerChunk = BiomeGenMushroomIsland.llIlIllllIlllI[0];
        this.theBiomeDecorator.flowersPerChunk = BiomeGenMushroomIsland.llIlIllllIlllI[0];
        this.theBiomeDecorator.grassPerChunk = BiomeGenMushroomIsland.llIlIllllIlllI[0];
        this.theBiomeDecorator.mushroomsPerChunk = BiomeGenMushroomIsland.llIlIllllIlllI[1];
        this.theBiomeDecorator.bigMushroomsPerChunk = BiomeGenMushroomIsland.llIlIllllIlllI[1];
        this.topBlock = Blocks.mycelium.getDefaultState();
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityMooshroom.class, BiomeGenMushroomIsland.llIlIllllIlllI[2], BiomeGenMushroomIsland.llIlIllllIlllI[3], BiomeGenMushroomIsland.llIlIllllIlllI[2]));
        "".length();
    }
    
    private static void lIIlIllIIIIIIlII() {
        (llIlIllllIlllI = new int[4])[0] = -(0x29 ^ 0x58 ^ (0x7B ^ 0x6E));
        BiomeGenMushroomIsland.llIlIllllIlllI[1] = " ".length();
        BiomeGenMushroomIsland.llIlIllllIlllI[2] = (0x82 ^ 0x8A);
        BiomeGenMushroomIsland.llIlIllllIlllI[3] = (0x89 ^ 0x8D);
    }
}
