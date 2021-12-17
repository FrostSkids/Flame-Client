// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityEnderman;

public class BiomeGenEnd extends BiomeGenBase
{
    private static final /* synthetic */ int[] lIlIIlIlIIIlll;
    
    @Override
    public int getSkyColorByTemp(final float lllllllllllllIIIllIlllIIlIlllIlI) {
        return BiomeGenEnd.lIlIIlIlIIIlll[2];
    }
    
    static {
        lllIIllIIIIIIIl();
    }
    
    private static void lllIIllIIIIIIIl() {
        (lIlIIlIlIIIlll = new int[3])[0] = (0x79 ^ 0x73);
        BiomeGenEnd.lIlIIlIlIIIlll[1] = (0x7A ^ 0x4 ^ (0x61 ^ 0x1B));
        BiomeGenEnd.lIlIIlIlIIIlll[2] = ((0x7B ^ 0x3A) & ~(0x3B ^ 0x7A));
    }
    
    public BiomeGenEnd(final int lllllllllllllIIIllIlllIIlIllllII) {
        super(lllllllllllllIIIllIlllIIlIllllII);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, BiomeGenEnd.lIlIIlIlIIIlll[0], BiomeGenEnd.lIlIIlIlIIIlll[1], BiomeGenEnd.lIlIIlIlIIIlll[1]));
        "".length();
        this.topBlock = Blocks.dirt.getDefaultState();
        this.fillerBlock = Blocks.dirt.getDefaultState();
        this.theBiomeDecorator = new BiomeEndDecorator();
    }
}
