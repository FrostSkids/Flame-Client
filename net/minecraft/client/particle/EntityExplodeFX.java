// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;

public class EntityExplodeFX extends EntityFX
{
    private static final /* synthetic */ int[] lllIllIIIlllll;
    
    private static void lIlIIlIIIlIIllll() {
        (lllIllIIIlllll = new int[4])[0] = "  ".length();
        EntityExplodeFX.lllIllIIIlllll[1] = " ".length();
        EntityExplodeFX.lllIllIIIlllll[2] = (0xBF ^ 0xB8);
        EntityExplodeFX.lllIllIIIlllll[3] = (0x3B ^ 0x33);
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityExplodeFX.lllIllIIIlllll[1];
        if (lIlIIlIIIlIlIIII(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.setParticleTextureIndex(EntityExplodeFX.lllIllIIIlllll[2] - this.particleAge * EntityExplodeFX.lllIllIIIlllll[3] / this.particleMaxAge);
        this.motionY += 0.004;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.8999999761581421;
        this.motionY *= 0.8999999761581421;
        this.motionZ *= 0.8999999761581421;
        if (lIlIIlIIIlIlIIIl(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    protected EntityExplodeFX(final World llllllllllllIlIllIIllIlIlIlIIlll, final double llllllllllllIlIllIIllIlIlIIllllI, final double llllllllllllIlIllIIllIlIlIlIIlIl, final double llllllllllllIlIllIIllIlIlIIlllII, final double llllllllllllIlIllIIllIlIlIIllIll, final double llllllllllllIlIllIIllIlIlIlIIIlI, final double llllllllllllIlIllIIllIlIlIlIIIIl) {
        super(llllllllllllIlIllIIllIlIlIlIIlll, llllllllllllIlIllIIllIlIlIIllllI, llllllllllllIlIllIIllIlIlIlIIlIl, llllllllllllIlIllIIllIlIlIIlllII, llllllllllllIlIllIIllIlIlIIllIll, llllllllllllIlIllIIllIlIlIlIIIlI, llllllllllllIlIllIIllIlIlIlIIIIl);
        this.motionX = llllllllllllIlIllIIllIlIlIIllIll + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        this.motionY = llllllllllllIlIllIIllIlIlIlIIIlI + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        this.motionZ = llllllllllllIlIllIIllIlIlIlIIIIl + (Math.random() * 2.0 - 1.0) * 0.05000000074505806;
        final float particleRed = this.rand.nextFloat() * 0.3f + 0.7f;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleScale = this.rand.nextFloat() * this.rand.nextFloat() * 6.0f + 1.0f;
        this.particleMaxAge = (int)(16.0 / (this.rand.nextFloat() * 0.8 + 0.2)) + EntityExplodeFX.lllIllIIIlllll[0];
    }
    
    private static boolean lIlIIlIIIlIlIIII(final int llllllllllllIlIllIIllIlIlIIlIIll, final int llllllllllllIlIllIIllIlIlIIlIIlI) {
        return llllllllllllIlIllIIllIlIlIIlIIll >= llllllllllllIlIllIIllIlIlIIlIIlI;
    }
    
    static {
        lIlIIlIIIlIIllll();
    }
    
    private static boolean lIlIIlIIIlIlIIIl(final int llllllllllllIlIllIIllIlIlIIlIIII) {
        return llllllllllllIlIllIIllIlIlIIlIIII != 0;
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIIlIIlIIlIIIlIIIll, final World lllllllllllllIIIlIIlIIlIIIlIIIlI, final double lllllllllllllIIIlIIlIIlIIIlIIIIl, final double lllllllllllllIIIlIIlIIlIIIlIIIII, final double lllllllllllllIIIlIIlIIlIIIIlIlll, final double lllllllllllllIIIlIIlIIlIIIIllllI, final double lllllllllllllIIIlIIlIIlIIIIlllIl, final double lllllllllllllIIIlIIlIIlIIIIlllII, final int... lllllllllllllIIIlIIlIIlIIIIllIll) {
            return new EntityExplodeFX(lllllllllllllIIIlIIlIIlIIIlIIIlI, lllllllllllllIIIlIIlIIlIIIlIIIIl, lllllllllllllIIIlIIlIIlIIIlIIIII, lllllllllllllIIIlIIlIIlIIIIlIlll, lllllllllllllIIIlIIlIIlIIIIllllI, lllllllllllllIIIlIIlIIlIIIIlllIl, lllllllllllllIIIlIIlIIlIIIIlllII);
        }
    }
}
