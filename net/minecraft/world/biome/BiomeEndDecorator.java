// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.world.gen.feature.WorldGenSpikes;
import net.minecraft.init.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeEndDecorator extends BiomeDecorator
{
    protected /* synthetic */ WorldGenerator spikeGen;
    private static final /* synthetic */ int[] llIlIllIlIIIlI;
    
    @Override
    protected void genDecorations(final BiomeGenBase llllllllllllIllIlIIlIllllIIlIllI) {
        this.generateOres();
        if (lIIlIlIlIlIIIlII(this.randomGenerator.nextInt(BiomeEndDecorator.llIlIllIlIIIlI[0]))) {
            final int llllllllllllIllIlIIlIllllIIlIlIl = this.randomGenerator.nextInt(BiomeEndDecorator.llIlIllIlIIIlI[1]) + BiomeEndDecorator.llIlIllIlIIIlI[2];
            final int llllllllllllIllIlIIlIllllIIlIlII = this.randomGenerator.nextInt(BiomeEndDecorator.llIlIllIlIIIlI[1]) + BiomeEndDecorator.llIlIllIlIIIlI[2];
            this.spikeGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.field_180294_c.add(llllllllllllIllIlIIlIllllIIlIlIl, BiomeEndDecorator.llIlIllIlIIIlI[3], llllllllllllIllIlIIlIllllIIlIlII)));
            "".length();
        }
        if (lIIlIlIlIlIIIlII(this.field_180294_c.getX()) && lIIlIlIlIlIIIlII(this.field_180294_c.getZ())) {
            final EntityDragon llllllllllllIllIlIIlIllllIIlIIll = new EntityDragon(this.currentWorld);
            llllllllllllIllIlIIlIllllIIlIIll.setLocationAndAngles(0.0, 128.0, 0.0, this.randomGenerator.nextFloat() * 360.0f, 0.0f);
            this.currentWorld.spawnEntityInWorld(llllllllllllIllIlIIlIllllIIlIIll);
            "".length();
        }
    }
    
    private static void lIIlIlIlIlIIIIll() {
        (llIlIllIlIIIlI = new int[4])[0] = (0x27 ^ 0x22);
        BiomeEndDecorator.llIlIllIlIIIlI[1] = (0xD5 ^ 0xC5);
        BiomeEndDecorator.llIlIllIlIIIlI[2] = (0x89 ^ 0xBB ^ (0x1E ^ 0x24));
        BiomeEndDecorator.llIlIllIlIIIlI[3] = ((116 + 130 - 198 + 89 ^ 100 + 131 - 161 + 80) & (0x1 ^ 0x41 ^ (0x72 ^ 0x2D) ^ -" ".length()));
    }
    
    static {
        lIIlIlIlIlIIIIll();
    }
    
    private static boolean lIIlIlIlIlIIIlII(final int llllllllllllIllIlIIlIllllIIIlllI) {
        return llllllllllllIllIlIIlIllllIIIlllI == 0;
    }
    
    public BiomeEndDecorator() {
        this.spikeGen = new WorldGenSpikes(Blocks.end_stone);
    }
}
