// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityGhast;

public class BiomeGenHell extends BiomeGenBase
{
    private static final /* synthetic */ int[] lIllIllIIlIIlI;
    
    private static void lllllllIllllIII() {
        (lIllIllIIlIIlI = new int[4])[0] = (0x5E ^ 0x7C ^ (0xAC ^ 0xBC));
        BiomeGenHell.lIllIllIIlIIlI[1] = (0x2D ^ 0x29);
        BiomeGenHell.lIllIllIIlIIlI[2] = (((0xC9 ^ 0x82) & ~(0x3E ^ 0x75)) ^ (0xA2 ^ 0xC6));
        BiomeGenHell.lIllIllIIlIIlI[3] = " ".length();
    }
    
    public BiomeGenHell(final int llllllllllllIlllllllIIlIllIIIllI) {
        super(llllllllllllIlllllllIIlIllIIIllI);
        this.spawnableMonsterList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableWaterCreatureList.clear();
        this.spawnableCaveCreatureList.clear();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityGhast.class, BiomeGenHell.lIllIllIIlIIlI[0], BiomeGenHell.lIllIllIIlIIlI[1], BiomeGenHell.lIllIllIIlIIlI[1]));
        "".length();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityPigZombie.class, BiomeGenHell.lIllIllIIlIIlI[2], BiomeGenHell.lIllIllIIlIIlI[1], BiomeGenHell.lIllIllIIlIIlI[1]));
        "".length();
        this.spawnableMonsterList.add(new SpawnListEntry(EntityMagmaCube.class, BiomeGenHell.lIllIllIIlIIlI[3], BiomeGenHell.lIllIllIIlIIlI[1], BiomeGenHell.lIllIllIIlIIlI[1]));
        "".length();
    }
    
    static {
        lllllllIllllIII();
    }
}
