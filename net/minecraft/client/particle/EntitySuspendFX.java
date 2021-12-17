// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;

public class EntitySuspendFX extends EntityFX
{
    private static final /* synthetic */ int[] lIlIllIllllIII;
    
    private static void llllIIlIlIIIllI() {
        (lIlIllIllllIII = new int[2])[0] = ((0x45 ^ 0x6F ^ (0x32 ^ 0x55)) & (0xE3 ^ 0x8C ^ (0x7B ^ 0x59) ^ -" ".length()));
        EntitySuspendFX.lIlIllIllllIII[1] = " ".length();
    }
    
    private static boolean llllIIlIlIIlIII(final Object lllllllllllllIIIIllIIlIIIlllIIlI, final Object lllllllllllllIIIIllIIlIIIlllIIIl) {
        return lllllllllllllIIIIllIIlIIIlllIIlI != lllllllllllllIIIIllIIlIIIlllIIIl;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (llllIIlIlIIlIII(this.worldObj.getBlockState(new BlockPos(this)).getBlock().getMaterial(), Material.water)) {
            this.setDead();
        }
        final int particleMaxAge = this.particleMaxAge;
        this.particleMaxAge = particleMaxAge - EntitySuspendFX.lIlIllIllllIII[1];
        if (llllIIlIlIIlIIl(particleMaxAge)) {
            this.setDead();
        }
    }
    
    protected EntitySuspendFX(final World lllllllllllllIIIIllIIlIIlIIIIllI, final double lllllllllllllIIIIllIIlIIlIIIIlIl, final double lllllllllllllIIIIllIIlIIIlllllII, final double lllllllllllllIIIIllIIlIIlIIIIIll, final double lllllllllllllIIIIllIIlIIlIIIIIlI, final double lllllllllllllIIIIllIIlIIlIIIIIIl, final double lllllllllllllIIIIllIIlIIlIIIIIII) {
        super(lllllllllllllIIIIllIIlIIlIIIIllI, lllllllllllllIIIIllIIlIIlIIIIlIl, lllllllllllllIIIIllIIlIIIlllllII - 0.125, lllllllllllllIIIIllIIlIIlIIIIIll, lllllllllllllIIIIllIIlIIlIIIIIlI, lllllllllllllIIIIllIIlIIlIIIIIIl, lllllllllllllIIIIllIIlIIlIIIIIII);
        this.particleRed = 0.4f;
        this.particleGreen = 0.4f;
        this.particleBlue = 0.7f;
        this.setParticleTextureIndex(EntitySuspendFX.lIlIllIllllIII[0]);
        this.setSize(0.01f, 0.01f);
        this.particleScale *= this.rand.nextFloat() * 0.6f + 0.2f;
        this.motionX = lllllllllllllIIIIllIIlIIlIIIIIlI * 0.0;
        this.motionY = lllllllllllllIIIIllIIlIIlIIIIIIl * 0.0;
        this.motionZ = lllllllllllllIIIIllIIlIIlIIIIIII * 0.0;
        this.particleMaxAge = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }
    
    static {
        llllIIlIlIIIllI();
    }
    
    private static boolean llllIIlIlIIlIIl(final int lllllllllllllIIIIllIIlIIIllIllll) {
        return lllllllllllllIIIIllIIlIIIllIllll <= 0;
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIlIlIIIllIIllIIIIl, final World lllllllllllllIIlIlIIIllIIlIllIII, final double lllllllllllllIIlIlIIIllIIlIlllll, final double lllllllllllllIIlIlIIIllIIlIlIllI, final double lllllllllllllIIlIlIIIllIIlIlIlIl, final double lllllllllllllIIlIlIIIllIIlIlIlII, final double lllllllllllllIIlIlIIIllIIlIllIll, final double lllllllllllllIIlIlIIIllIIlIllIlI, final int... lllllllllllllIIlIlIIIllIIlIllIIl) {
            return new EntitySuspendFX(lllllllllllllIIlIlIIIllIIlIllIII, lllllllllllllIIlIlIIIllIIlIlllll, lllllllllllllIIlIlIIIllIIlIlIllI, lllllllllllllIIlIlIIIllIIlIlIlIl, lllllllllllllIIlIlIIIllIIlIlIlII, lllllllllllllIIlIlIIIllIIlIllIll, lllllllllllllIIlIlIIIllIIlIllIlI);
        }
    }
}
