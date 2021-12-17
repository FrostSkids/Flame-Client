// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.World;

public class EntitySnowShovelFX extends EntityFX
{
    private static final /* synthetic */ int[] lllIIIIlllIlIl;
    /* synthetic */ float snowDigParticleScale;
    
    protected EntitySnowShovelFX(final World llllllllllllIllIIIIlIIIIllIIllll, final double llllllllllllIllIIIIlIIIIllIlIllI, final double llllllllllllIllIIIIlIIIIllIlIlIl, final double llllllllllllIllIIIIlIIIIllIlIlII, final double llllllllllllIllIIIIlIIIIllIIlIll, final double llllllllllllIllIIIIlIIIIllIlIIlI, final double llllllllllllIllIIIIlIIIIllIIlIIl) {
        this(llllllllllllIllIIIIlIIIIllIIllll, llllllllllllIllIIIIlIIIIllIlIllI, llllllllllllIllIIIIlIIIIllIlIlIl, llllllllllllIllIIIIlIIIIllIlIlII, llllllllllllIllIIIIlIIIIllIIlIll, llllllllllllIllIIIIlIIIIllIlIIlI, llllllllllllIllIIIIlIIIIllIIlIIl, 1.0f);
    }
    
    private static void lIIlllIIlllllIlI() {
        (lllIIIIlllIlIl = new int[4])[0] = ((0x8B ^ 0x95) & ~(0x72 ^ 0x6C));
        EntitySnowShovelFX.lllIIIIlllIlIl[1] = " ".length();
        EntitySnowShovelFX.lllIIIIlllIlIl[2] = (0x69 ^ 0xF ^ (0x16 ^ 0x77));
        EntitySnowShovelFX.lllIIIIlllIlIl[3] = (0x8B ^ 0x9F ^ (0xB6 ^ 0xAA));
    }
    
    @Override
    public void renderParticle(final WorldRenderer llllllllllllIllIIIIlIIIIlIlIIIlI, final Entity llllllllllllIllIIIIlIIIIlIIlIlll, final float llllllllllllIllIIIIlIIIIlIlIIIII, final float llllllllllllIllIIIIlIIIIlIIlIlIl, final float llllllllllllIllIIIIlIIIIlIIllllI, final float llllllllllllIllIIIIlIIIIlIIlIIll, final float llllllllllllIllIIIIlIIIIlIIlllII, final float llllllllllllIllIIIIlIIIIlIIlIIIl) {
        float llllllllllllIllIIIIlIIIIlIIllIlI = (this.particleAge + llllllllllllIllIIIIlIIIIlIlIIIII) / this.particleMaxAge * 32.0f;
        llllllllllllIllIIIIlIIIIlIIllIlI = MathHelper.clamp_float(llllllllllllIllIIIIlIIIIlIIllIlI, 0.0f, 1.0f);
        this.particleScale = this.snowDigParticleScale * llllllllllllIllIIIIlIIIIlIIllIlI;
        super.renderParticle(llllllllllllIllIIIIlIIIIlIlIIIlI, llllllllllllIllIIIIlIIIIlIIlIlll, llllllllllllIllIIIIlIIIIlIlIIIII, llllllllllllIllIIIIlIIIIlIIlIlIl, llllllllllllIllIIIIlIIIIlIIllllI, llllllllllllIllIIIIlIIIIlIIlIIll, llllllllllllIllIIIIlIIIIlIIlllII, llllllllllllIllIIIIlIIIIlIIlIIIl);
    }
    
    private static boolean lIIlllIIlllllIll(final int llllllllllllIllIIIIlIIIIlIIIIIlI, final int llllllllllllIllIIIIlIIIIlIIIIIIl) {
        return llllllllllllIllIIIIlIIIIlIIIIIlI >= llllllllllllIllIIIIlIIIIlIIIIIIl;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntitySnowShovelFX.lllIIIIlllIlIl[1];
        if (lIIlllIIlllllIll(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.setParticleTextureIndex(EntitySnowShovelFX.lllIIIIlllIlIl[2] - this.particleAge * EntitySnowShovelFX.lllIIIIlllIlIl[3] / this.particleMaxAge);
        this.motionY -= 0.03;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9900000095367432;
        this.motionY *= 0.9900000095367432;
        this.motionZ *= 0.9900000095367432;
        if (lIIlllIIllllllII(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    private static boolean lIIlllIIllllllII(final int llllllllllllIllIIIIlIIIIIlllllll) {
        return llllllllllllIllIIIIlIIIIIlllllll != 0;
    }
    
    protected EntitySnowShovelFX(final World llllllllllllIllIIIIlIIIIlIllIlIl, final double llllllllllllIllIIIIlIIIIlIllIlII, final double llllllllllllIllIIIIlIIIIlIllIIll, final double llllllllllllIllIIIIlIIIIlIllIIlI, final double llllllllllllIllIIIIlIIIIlIllIIIl, final double llllllllllllIllIIIIlIIIIlIllIIII, final double llllllllllllIllIIIIlIIIIlIlllIII, final float llllllllllllIllIIIIlIIIIlIllIlll) {
        super(llllllllllllIllIIIIlIIIIlIllIlIl, llllllllllllIllIIIIlIIIIlIllIlII, llllllllllllIllIIIIlIIIIlIllIIll, llllllllllllIllIIIIlIIIIlIllIIlI, llllllllllllIllIIIIlIIIIlIllIIIl, llllllllllllIllIIIIlIIIIlIllIIII, llllllllllllIllIIIIlIIIIlIlllIII);
        this.motionX *= 0.10000000149011612;
        this.motionY *= 0.10000000149011612;
        this.motionZ *= 0.10000000149011612;
        this.motionX += llllllllllllIllIIIIlIIIIlIllIIIl;
        this.motionY += llllllllllllIllIIIIlIIIIlIllIIII;
        this.motionZ += llllllllllllIllIIIIlIIIIlIlllIII;
        final float particleRed = 1.0f - (float)(Math.random() * 0.30000001192092896);
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleScale *= 0.75f;
        this.particleScale *= llllllllllllIllIIIIlIIIIlIllIlll;
        this.snowDigParticleScale = this.particleScale;
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.particleMaxAge *= (int)llllllllllllIllIIIIlIIIIlIllIlll;
        this.noClip = (EntitySnowShovelFX.lllIIIIlllIlIl[0] != 0);
    }
    
    static {
        lIIlllIIlllllIlI();
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlIllIIIIlIIIllIIIII, final World llllllllllllIlIllIIIIlIIIlIlIlll, final double llllllllllllIlIllIIIIlIIIlIlIllI, final double llllllllllllIlIllIIIIlIIIlIlllIl, final double llllllllllllIlIllIIIIlIIIlIlIlII, final double llllllllllllIlIllIIIIlIIIlIlIIll, final double llllllllllllIlIllIIIIlIIIlIlIIlI, final double llllllllllllIlIllIIIIlIIIlIllIIl, final int... llllllllllllIlIllIIIIlIIIlIllIII) {
            return new EntitySnowShovelFX(llllllllllllIlIllIIIIlIIIlIlIlll, llllllllllllIlIllIIIIlIIIlIlIllI, llllllllllllIlIllIIIIlIIIlIlllIl, llllllllllllIlIllIIIIlIIIlIlIlII, llllllllllllIlIllIIIIlIIIlIlIIll, llllllllllllIlIllIIIIlIIIlIlIIlI, llllllllllllIlIllIIIIlIIIlIllIIl);
        }
    }
}
