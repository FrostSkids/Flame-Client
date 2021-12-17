// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.World;

public class EntitySmokeFX extends EntityFX
{
    /* synthetic */ float smokeParticleScale;
    private static final /* synthetic */ int[] llIIIllIIlIIIl;
    
    private EntitySmokeFX(final World llllllllllllIlllIlIIllIlIIlIIIll, final double llllllllllllIlllIlIIllIlIIlIlIlI, final double llllllllllllIlllIlIIllIlIIlIIIIl, final double llllllllllllIlllIlIIllIlIIlIIIII, final double llllllllllllIlllIlIIllIlIIIlllll, final double llllllllllllIlllIlIIllIlIIlIIllI, final double llllllllllllIlllIlIIllIlIIlIIlIl) {
        this(llllllllllllIlllIlIIllIlIIlIIIll, llllllllllllIlllIlIIllIlIIlIlIlI, llllllllllllIlllIlIIllIlIIlIIIIl, llllllllllllIlllIlIIllIlIIlIIIII, llllllllllllIlllIlIIllIlIIIlllll, llllllllllllIlllIlIIllIlIIlIIllI, llllllllllllIlllIlIIllIlIIlIIlIl, 1.0f);
    }
    
    static {
        lIIIlIlIIIlIllII();
    }
    
    private static boolean lIIIlIlIIIlIllll(final int llllllllllllIlllIlIIllIIllIIlIIl) {
        return llllllllllllIlllIlIIllIIllIIlIIl == 0;
    }
    
    private static void lIIIlIlIIIlIllII() {
        (llIIIllIIlIIIl = new int[4])[0] = ((0x97 ^ 0x88) & ~(0x4A ^ 0x55));
        EntitySmokeFX.llIIIllIIlIIIl[1] = " ".length();
        EntitySmokeFX.llIIIllIIlIIIl[2] = (0x3A ^ 0x3D);
        EntitySmokeFX.llIIIllIIlIIIl[3] = (0x33 ^ 0x38 ^ "   ".length());
    }
    
    private static boolean lIIIlIlIIIllIIII(final int llllllllllllIlllIlIIllIIllIIlIll) {
        return llllllllllllIlllIlIIllIIllIIlIll != 0;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntitySmokeFX.llIIIllIIlIIIl[1];
        if (lIIIlIlIIIlIlllI(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.setParticleTextureIndex(EntitySmokeFX.llIIIllIIlIIIl[2] - this.particleAge * EntitySmokeFX.llIIIllIIlIIIl[3] / this.particleMaxAge);
        this.motionY += 0.004;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (lIIIlIlIIIlIllll(lIIIlIlIIIlIllIl(this.posY, this.prevPosY))) {
            this.motionX *= 1.1;
            this.motionZ *= 1.1;
        }
        this.motionX *= 0.9599999785423279;
        this.motionY *= 0.9599999785423279;
        this.motionZ *= 0.9599999785423279;
        if (lIIIlIlIIIllIIII(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    private static boolean lIIIlIlIIIlIlllI(final int llllllllllllIlllIlIIllIIllIIlllI, final int llllllllllllIlllIlIIllIIllIIllIl) {
        return llllllllllllIlllIlIIllIIllIIlllI >= llllllllllllIlllIlIIllIIllIIllIl;
    }
    
    protected EntitySmokeFX(final World llllllllllllIlllIlIIllIlIIIlIIlI, final double llllllllllllIlllIlIIllIlIIIlIIIl, final double llllllllllllIlllIlIIllIlIIIlIIII, final double llllllllllllIlllIlIIllIlIIIIIllI, final double llllllllllllIlllIlIIllIlIIIIlllI, final double llllllllllllIlllIlIIllIlIIIIllIl, final double llllllllllllIlllIlIIllIlIIIIIIll, final float llllllllllllIlllIlIIllIlIIIIlIll) {
        super(llllllllllllIlllIlIIllIlIIIlIIlI, llllllllllllIlllIlIIllIlIIIlIIIl, llllllllllllIlllIlIIllIlIIIlIIII, llllllllllllIlllIlIIllIlIIIIIllI, 0.0, 0.0, 0.0);
        this.motionX *= 0.10000000149011612;
        this.motionY *= 0.10000000149011612;
        this.motionZ *= 0.10000000149011612;
        this.motionX += llllllllllllIlllIlIIllIlIIIIlllI;
        this.motionY += llllllllllllIlllIlIIllIlIIIIllIl;
        this.motionZ += llllllllllllIlllIlIIllIlIIIIIIll;
        final float particleRed = (float)(Math.random() * 0.30000001192092896);
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleScale *= 0.75f;
        this.particleScale *= llllllllllllIlllIlIIllIlIIIIlIll;
        this.smokeParticleScale = this.particleScale;
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.particleMaxAge *= (int)llllllllllllIlllIlIIllIlIIIIlIll;
        this.noClip = (EntitySmokeFX.llIIIllIIlIIIl[0] != 0);
    }
    
    @Override
    public void renderParticle(final WorldRenderer llllllllllllIlllIlIIllIIlllIllII, final Entity llllllllllllIlllIlIIllIIllllIlIl, final float llllllllllllIlllIlIIllIIllllIlII, final float llllllllllllIlllIlIIllIIlllIlIIl, final float llllllllllllIlllIlIIllIIllllIIlI, final float llllllllllllIlllIlIIllIIllllIIIl, final float llllllllllllIlllIlIIllIIlllIIllI, final float llllllllllllIlllIlIIllIIlllIIlIl) {
        float llllllllllllIlllIlIIllIIlllIlllI = (this.particleAge + llllllllllllIlllIlIIllIIllllIlII) / this.particleMaxAge * 32.0f;
        llllllllllllIlllIlIIllIIlllIlllI = MathHelper.clamp_float(llllllllllllIlllIlIIllIIlllIlllI, 0.0f, 1.0f);
        this.particleScale = this.smokeParticleScale * llllllllllllIlllIlIIllIIlllIlllI;
        super.renderParticle(llllllllllllIlllIlIIllIIlllIllII, llllllllllllIlllIlIIllIIllllIlIl, llllllllllllIlllIlIIllIIllllIlII, llllllllllllIlllIlIIllIIlllIlIIl, llllllllllllIlllIlIIllIIllllIIlI, llllllllllllIlllIlIIllIIllllIIIl, llllllllllllIlllIlIIllIIlllIIllI, llllllllllllIlllIlIIllIIlllIIlIl);
    }
    
    private static int lIIIlIlIIIlIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlllIllllIIlIllIIIII, final World llllllllllllIlllIllllIIlIlIlllll, final double llllllllllllIlllIllllIIlIlIlIllI, final double llllllllllllIlllIllllIIlIlIlIlIl, final double llllllllllllIlllIllllIIlIlIlIlII, final double llllllllllllIlllIllllIIlIlIlIIll, final double llllllllllllIlllIllllIIlIlIlIIlI, final double llllllllllllIlllIllllIIlIlIllIIl, final int... llllllllllllIlllIllllIIlIlIllIII) {
            return new EntitySmokeFX(llllllllllllIlllIllllIIlIlIlllll, llllllllllllIlllIllllIIlIlIlIllI, llllllllllllIlllIllllIIlIlIlIlIl, llllllllllllIlllIllllIIlIlIlIlII, llllllllllllIlllIllllIIlIlIlIIll, llllllllllllIlllIllllIIlIlIlIIlI, llllllllllllIlllIllllIIlIlIllIIl, null);
        }
    }
}
