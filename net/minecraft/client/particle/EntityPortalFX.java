// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;

public class EntityPortalFX extends EntityFX
{
    private /* synthetic */ float portalParticleScale;
    private /* synthetic */ double portalPosY;
    private /* synthetic */ double portalPosZ;
    private /* synthetic */ double portalPosX;
    private static final /* synthetic */ int[] lIllIIllllIlII;
    
    static {
        lllllIllIlIIIlI();
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIIIIIIlIIIIlIlIIIIl, final Entity lllllllllllllIIIIIIlIIIIlIIlIllI, final float lllllllllllllIIIIIIlIIIIlIIlIlIl, final float lllllllllllllIIIIIIlIIIIlIIlIlII, final float lllllllllllllIIIIIIlIIIIlIIlIIll, final float lllllllllllllIIIIIIlIIIIlIIlIIlI, final float lllllllllllllIIIIIIlIIIIlIIllIll, final float lllllllllllllIIIIIIlIIIIlIIllIlI) {
        float lllllllllllllIIIIIIlIIIIlIIllIIl = (this.particleAge + lllllllllllllIIIIIIlIIIIlIIlIlIl) / this.particleMaxAge;
        lllllllllllllIIIIIIlIIIIlIIllIIl = 1.0f - lllllllllllllIIIIIIlIIIIlIIllIIl;
        lllllllllllllIIIIIIlIIIIlIIllIIl *= lllllllllllllIIIIIIlIIIIlIIllIIl;
        lllllllllllllIIIIIIlIIIIlIIllIIl = 1.0f - lllllllllllllIIIIIIlIIIIlIIllIIl;
        this.particleScale = this.portalParticleScale * lllllllllllllIIIIIIlIIIIlIIllIIl;
        super.renderParticle(lllllllllllllIIIIIIlIIIIlIlIIIIl, lllllllllllllIIIIIIlIIIIlIIlIllI, lllllllllllllIIIIIIlIIIIlIIlIlIl, lllllllllllllIIIIIIlIIIIlIIlIlII, lllllllllllllIIIIIIlIIIIlIIlIIll, lllllllllllllIIIIIIlIIIIlIIlIIlI, lllllllllllllIIIIIIlIIIIlIIllIll, lllllllllllllIIIIIIlIIIIlIIllIlI);
    }
    
    private static boolean lllllIllIlIIIll(final int lllllllllllllIIIIIIlIIIIIllIIlII, final int lllllllllllllIIIIIIlIIIIIllIIIll) {
        return lllllllllllllIIIIIIlIIIIIllIIlII > lllllllllllllIIIIIIlIIIIIllIIIll;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        float lllllllllllllIIIIIIlIIIIIllIllIl = this.particleAge / (float)this.particleMaxAge;
        lllllllllllllIIIIIIlIIIIIllIllIl = -lllllllllllllIIIIIIlIIIIIllIllIl + lllllllllllllIIIIIIlIIIIIllIllIl * lllllllllllllIIIIIIlIIIIIllIllIl * 2.0f;
        lllllllllllllIIIIIIlIIIIIllIllIl = 1.0f - lllllllllllllIIIIIIlIIIIIllIllIl;
        this.posX = this.portalPosX + this.motionX * lllllllllllllIIIIIIlIIIIIllIllIl;
        this.posY = this.portalPosY + this.motionY * lllllllllllllIIIIIIlIIIIIllIllIl + (1.0f - lllllllllllllIIIIIIlIIIIIllIllIl);
        this.posZ = this.portalPosZ + this.motionZ * lllllllllllllIIIIIIlIIIIIllIllIl;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityPortalFX.lIllIIllllIlII[1];
        if (lllllIllIlIIlII(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
    }
    
    protected EntityPortalFX(final World lllllllllllllIIIIIIlIIIIlIllllIl, final double lllllllllllllIIIIIIlIIIIlIllllII, final double lllllllllllllIIIIIIlIIIIlIllIIlI, final double lllllllllllllIIIIIIlIIIIlIlllIlI, final double lllllllllllllIIIIIIlIIIIlIlllIIl, final double lllllllllllllIIIIIIlIIIIlIlIllll, final double lllllllllllllIIIIIIlIIIIlIllIlll) {
        super(lllllllllllllIIIIIIlIIIIlIllllIl, lllllllllllllIIIIIIlIIIIlIllllII, lllllllllllllIIIIIIlIIIIlIllIIlI, lllllllllllllIIIIIIlIIIIlIlllIlI, lllllllllllllIIIIIIlIIIIlIlllIIl, lllllllllllllIIIIIIlIIIIlIlIllll, lllllllllllllIIIIIIlIIIIlIllIlll);
        this.motionX = lllllllllllllIIIIIIlIIIIlIlllIIl;
        this.motionY = lllllllllllllIIIIIIlIIIIlIlIllll;
        this.motionZ = lllllllllllllIIIIIIlIIIIlIllIlll;
        this.posX = lllllllllllllIIIIIIlIIIIlIllllII;
        this.portalPosX = lllllllllllllIIIIIIlIIIIlIllllII;
        this.posY = lllllllllllllIIIIIIlIIIIlIllIIlI;
        this.portalPosY = lllllllllllllIIIIIIlIIIIlIllIIlI;
        this.posZ = lllllllllllllIIIIIIlIIIIlIlllIlI;
        this.portalPosZ = lllllllllllllIIIIIIlIIIIlIlllIlI;
        final float lllllllllllllIIIIIIlIIIIlIllIllI = this.rand.nextFloat() * 0.6f + 0.4f;
        final float n = this.rand.nextFloat() * 0.2f + 0.5f;
        this.particleScale = n;
        this.portalParticleScale = n;
        final float particleRed = 1.0f * lllllllllllllIIIIIIlIIIIlIllIllI;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleGreen *= 0.3f;
        this.particleRed *= 0.9f;
        this.particleMaxAge = (int)(Math.random() * 10.0) + EntityPortalFX.lIllIIllllIlII[0];
        this.noClip = (EntityPortalFX.lIllIIllllIlII[1] != 0);
        this.setParticleTextureIndex((int)(Math.random() * 8.0));
    }
    
    private static void lllllIllIlIIIlI() {
        (lIllIIllllIlII = new int[5])[0] = (0xBF ^ 0x97);
        EntityPortalFX.lIllIIllllIlII[1] = " ".length();
        EntityPortalFX.lIllIIllllIlII[2] = (0xC1 ^ 0xC7) + (49 + 41 + 2 + 123) - (0xA ^ 0x41) + (0x5A ^ 0x37);
        EntityPortalFX.lIllIIllllIlII[3] = (18 + 90 - 29 + 84 ^ 33 + 83 - 54 + 117);
        EntityPortalFX.lIllIIllllIlII[4] = 59 + 14 - 45 + 108 + (0xEE ^ 0x9A) - (0xCC ^ 0xA7) + (0x77 ^ 0x28);
    }
    
    private static boolean lllllIllIlIIlII(final int lllllllllllllIIIIIIlIIIIIllIlIII, final int lllllllllllllIIIIIIlIIIIIllIIlll) {
        return lllllllllllllIIIIIIlIIIIIllIlIII >= lllllllllllllIIIIIIlIIIIIllIIlll;
    }
    
    @Override
    public int getBrightnessForRender(final float lllllllllllllIIIIIIlIIIIlIIIIIIl) {
        final int lllllllllllllIIIIIIlIIIIlIIIIllI = super.getBrightnessForRender(lllllllllllllIIIIIIlIIIIlIIIIIIl);
        float lllllllllllllIIIIIIlIIIIlIIIIlIl = this.particleAge / (float)this.particleMaxAge;
        lllllllllllllIIIIIIlIIIIlIIIIlIl *= lllllllllllllIIIIIIlIIIIlIIIIlIl;
        lllllllllllllIIIIIIlIIIIlIIIIlIl *= lllllllllllllIIIIIIlIIIIlIIIIlIl;
        final int lllllllllllllIIIIIIlIIIIlIIIIlII = lllllllllllllIIIIIIlIIIIlIIIIllI & EntityPortalFX.lIllIIllllIlII[2];
        int lllllllllllllIIIIIIlIIIIlIIIIIll = lllllllllllllIIIIIIlIIIIlIIIIllI >> EntityPortalFX.lIllIIllllIlII[3] & EntityPortalFX.lIllIIllllIlII[2];
        lllllllllllllIIIIIIlIIIIlIIIIIll += (int)(lllllllllllllIIIIIIlIIIIlIIIIlIl * 15.0f * 16.0f);
        if (lllllIllIlIIIll(lllllllllllllIIIIIIlIIIIlIIIIIll, EntityPortalFX.lIllIIllllIlII[4])) {
            lllllllllllllIIIIIIlIIIIlIIIIIll = EntityPortalFX.lIllIIllllIlII[4];
        }
        return lllllllllllllIIIIIIlIIIIlIIIIlII | lllllllllllllIIIIIIlIIIIlIIIIIll << EntityPortalFX.lIllIIllllIlII[3];
    }
    
    @Override
    public float getBrightness(final float lllllllllllllIIIIIIlIIIIIlllIIll) {
        final float lllllllllllllIIIIIIlIIIIIlllIllI = super.getBrightness(lllllllllllllIIIIIIlIIIIIlllIIll);
        float lllllllllllllIIIIIIlIIIIIlllIlIl = this.particleAge / (float)this.particleMaxAge;
        lllllllllllllIIIIIIlIIIIIlllIlIl *= lllllllllllllIIIIIIlIIIIIlllIlIl * lllllllllllllIIIIIIlIIIIIlllIlIl * lllllllllllllIIIIIIlIIIIIlllIlIl;
        return lllllllllllllIIIIIIlIIIIIlllIllI * (1.0f - lllllllllllllIIIIIIlIIIIIlllIlIl) + lllllllllllllIIIIIIlIIIIIlllIlIl;
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlIllllIIlIIIIllIllI, final World llllllllllllIlIllllIIlIIIIlIllIl, final double llllllllllllIlIllllIIlIIIIlIllII, final double llllllllllllIlIllllIIlIIIIlIlIll, final double llllllllllllIlIllllIIlIIIIlIlIlI, final double llllllllllllIlIllllIIlIIIIlIlIIl, final double llllllllllllIlIllllIIlIIIIllIIII, final double llllllllllllIlIllllIIlIIIIlIllll, final int... llllllllllllIlIllllIIlIIIIlIlllI) {
            return new EntityPortalFX(llllllllllllIlIllllIIlIIIIlIllIl, llllllllllllIlIllllIIlIIIIlIllII, llllllllllllIlIllllIIlIIIIlIlIll, llllllllllllIlIllllIIlIIIIlIlIlI, llllllllllllIlIllllIIlIIIIlIlIIl, llllllllllllIlIllllIIlIIIIllIIII, llllllllllllIlIllllIIlIIIIlIllll);
        }
    }
}
