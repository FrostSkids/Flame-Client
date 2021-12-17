// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class EntityFlameFX extends EntityFX
{
    private static final /* synthetic */ int[] lIlllllIllIIIl;
    private /* synthetic */ float flameScale;
    
    private static boolean lIIIIlIllIIIIlIl(final int llllllllllllIllllIIllIIIIIIlIIIl, final int llllllllllllIllllIIllIIIIIIlIIII) {
        return llllllllllllIllllIIllIIIIIIlIIIl > llllllllllllIllllIIllIIIIIIlIIII;
    }
    
    private static boolean lIIIIlIllIIIIlll(final int llllllllllllIllllIIllIIIIIIIlllI) {
        return llllllllllllIllllIIllIIIIIIIlllI != 0;
    }
    
    protected EntityFlameFX(final World llllllllllllIllllIIllIIIIlIlllIl, final double llllllllllllIllllIIllIIIIllIIlII, final double llllllllllllIllllIIllIIIIlIllIll, final double llllllllllllIllllIIllIIIIllIIIlI, final double llllllllllllIllllIIllIIIIlIllIIl, final double llllllllllllIllllIIllIIIIllIIIII, final double llllllllllllIllllIIllIIIIlIlIlll) {
        super(llllllllllllIllllIIllIIIIlIlllIl, llllllllllllIllllIIllIIIIllIIlII, llllllllllllIllllIIllIIIIlIllIll, llllllllllllIllllIIllIIIIllIIIlI, llllllllllllIllllIIllIIIIlIllIIl, llllllllllllIllllIIllIIIIllIIIII, llllllllllllIllllIIllIIIIlIlIlll);
        this.motionX = this.motionX * 0.009999999776482582 + llllllllllllIllllIIllIIIIlIllIIl;
        this.motionY = this.motionY * 0.009999999776482582 + llllllllllllIllllIIllIIIIllIIIII;
        this.motionZ = this.motionZ * 0.009999999776482582 + llllllllllllIllllIIllIIIIlIlIlll;
        this.posX += (this.rand.nextFloat() - this.rand.nextFloat()) * 0.05f;
        this.posY += (this.rand.nextFloat() - this.rand.nextFloat()) * 0.05f;
        this.posZ += (this.rand.nextFloat() - this.rand.nextFloat()) * 0.05f;
        this.flameScale = this.particleScale;
        final float particleRed = 1.0f;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + EntityFlameFX.lIlllllIllIIIl[0];
        this.noClip = (EntityFlameFX.lIlllllIllIIIl[1] != 0);
        this.setParticleTextureIndex(EntityFlameFX.lIlllllIllIIIl[2]);
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityFlameFX.lIlllllIllIIIl[1];
        if (lIIIIlIllIIIIllI(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9599999785423279;
        this.motionY *= 0.9599999785423279;
        this.motionZ *= 0.9599999785423279;
        if (lIIIIlIllIIIIlll(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    static {
        lIIIIlIllIIIIlII();
    }
    
    @Override
    public float getBrightness(final float llllllllllllIllllIIllIIIIIIlllIl) {
        float llllllllllllIllllIIllIIIIIlIIIII = (this.particleAge + llllllllllllIllllIIllIIIIIIlllIl) / this.particleMaxAge;
        llllllllllllIllllIIllIIIIIlIIIII = MathHelper.clamp_float(llllllllllllIllllIIllIIIIIlIIIII, 0.0f, 1.0f);
        final float llllllllllllIllllIIllIIIIIIlllll = super.getBrightness(llllllllllllIllllIIllIIIIIIlllIl);
        return llllllllllllIllllIIllIIIIIIlllll * llllllllllllIllllIIllIIIIIlIIIII + (1.0f - llllllllllllIllllIIllIIIIIlIIIII);
    }
    
    @Override
    public int getBrightnessForRender(final float llllllllllllIllllIIllIIIIIllIIIl) {
        float llllllllllllIllllIIllIIIIIllIIII = (this.particleAge + llllllllllllIllllIIllIIIIIllIIIl) / this.particleMaxAge;
        llllllllllllIllllIIllIIIIIllIIII = MathHelper.clamp_float(llllllllllllIllllIIllIIIIIllIIII, 0.0f, 1.0f);
        final int llllllllllllIllllIIllIIIIIlIllll = super.getBrightnessForRender(llllllllllllIllllIIllIIIIIllIIIl);
        int llllllllllllIllllIIllIIIIIlIlllI = llllllllllllIllllIIllIIIIIlIllll & EntityFlameFX.lIlllllIllIIIl[3];
        final int llllllllllllIllllIIllIIIIIlIllIl = llllllllllllIllllIIllIIIIIlIllll >> EntityFlameFX.lIlllllIllIIIl[4] & EntityFlameFX.lIlllllIllIIIl[3];
        llllllllllllIllllIIllIIIIIlIlllI += (int)(llllllllllllIllllIIllIIIIIllIIII * 15.0f * 16.0f);
        if (lIIIIlIllIIIIlIl(llllllllllllIllllIIllIIIIIlIlllI, EntityFlameFX.lIlllllIllIIIl[5])) {
            llllllllllllIllllIIllIIIIIlIlllI = EntityFlameFX.lIlllllIllIIIl[5];
        }
        return llllllllllllIllllIIllIIIIIlIlllI | llllllllllllIllllIIllIIIIIlIllIl << EntityFlameFX.lIlllllIllIIIl[4];
    }
    
    @Override
    public void renderParticle(final WorldRenderer llllllllllllIllllIIllIIIIlIIIIIl, final Entity llllllllllllIllllIIllIIIIlIIIIII, final float llllllllllllIllllIIllIIIIlIIlIIl, final float llllllllllllIllllIIllIIIIlIIlIII, final float llllllllllllIllllIIllIIIIIllllIl, final float llllllllllllIllllIIllIIIIlIIIllI, final float llllllllllllIllllIIllIIIIIlllIll, final float llllllllllllIllllIIllIIIIIlllIlI) {
        final float llllllllllllIllllIIllIIIIlIIIIll = (this.particleAge + llllllllllllIllllIIllIIIIlIIlIIl) / this.particleMaxAge;
        this.particleScale = this.flameScale * (1.0f - llllllllllllIllllIIllIIIIlIIIIll * llllllllllllIllllIIllIIIIlIIIIll * 0.5f);
        super.renderParticle(llllllllllllIllllIIllIIIIlIIIIIl, llllllllllllIllllIIllIIIIlIIIIII, llllllllllllIllllIIllIIIIlIIlIIl, llllllllllllIllllIIllIIIIlIIlIII, llllllllllllIllllIIllIIIIIllllIl, llllllllllllIllllIIllIIIIlIIIllI, llllllllllllIllllIIllIIIIIlllIll, llllllllllllIllllIIllIIIIIlllIlI);
    }
    
    private static boolean lIIIIlIllIIIIllI(final int llllllllllllIllllIIllIIIIIIlIlIl, final int llllllllllllIllllIIllIIIIIIlIlII) {
        return llllllllllllIllllIIllIIIIIIlIlIl >= llllllllllllIllllIIllIIIIIIlIlII;
    }
    
    private static void lIIIIlIllIIIIlII() {
        (lIlllllIllIIIl = new int[6])[0] = (96 + 52 - 116 + 96 ^ 40 + 51 + 3 + 38);
        EntityFlameFX.lIlllllIllIIIl[1] = " ".length();
        EntityFlameFX.lIlllllIllIIIl[2] = (0x8A ^ 0xBA);
        EntityFlameFX.lIlllllIllIIIl[3] = 111 + 30 + 55 + 22 + (0x8C ^ 0x89) - (137 + 3 - 6 + 23) + (111 + 62 - 35 + 51);
        EntityFlameFX.lIlllllIllIIIl[4] = (88 + 136 - 192 + 111 ^ 85 + 21 - 27 + 80);
        EntityFlameFX.lIlllllIllIIIl[5] = 97 + 40 - 136 + 239;
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlIllIllllIlIlIIlIIl, final World llllllllllllIlIllIllllIlIlIIlIII, final double llllllllllllIlIllIllllIlIIllllll, final double llllllllllllIlIllIllllIlIlIIIllI, final double llllllllllllIlIllIllllIlIIllllIl, final double llllllllllllIlIllIllllIlIlIIIlII, final double llllllllllllIlIllIllllIlIIlllIll, final double llllllllllllIlIllIllllIlIlIIIIlI, final int... llllllllllllIlIllIllllIlIlIIIIIl) {
            return new EntityFlameFX(llllllllllllIlIllIllllIlIlIIlIII, llllllllllllIlIllIllllIlIIllllll, llllllllllllIlIllIllllIlIlIIIllI, llllllllllllIlIllIllllIlIIllllIl, llllllllllllIlIllIllllIlIlIIIlII, llllllllllllIlIllIllllIlIIlllIll, llllllllllllIlIllIllllIlIlIIIIlI);
        }
    }
}
