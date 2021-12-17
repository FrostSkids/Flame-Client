// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;

public class EntityReddustFX extends EntityFX
{
    /* synthetic */ float reddustParticleScale;
    private static final /* synthetic */ int[] llIlIIIIlIllll;
    
    private static int lIIlIIIlIllIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIlIIIlIllIllll(final int llllllllllllIllIllIlIlllIIIIlIlI) {
        return llllllllllllIllIllIlIlllIIIIlIlI != 0;
    }
    
    private static void lIIlIIIlIllIlIlI() {
        (llIlIIIIlIllll = new int[4])[0] = ((0xB0 ^ 0xA9) & ~(0x21 ^ 0x38));
        EntityReddustFX.llIlIIIIlIllll[1] = " ".length();
        EntityReddustFX.llIlIIIIlIllll[2] = (55 + 58 - 62 + 100 ^ 21 + 47 - 27 + 103);
        EntityReddustFX.llIlIIIIlIllll[3] = (0x8A ^ 0x82);
    }
    
    static {
        lIIlIIIlIllIlIlI();
    }
    
    private static int lIIlIIIlIllIlIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void renderParticle(final WorldRenderer llllllllllllIllIllIlIlllIIIllIll, final Entity llllllllllllIllIllIlIlllIIlIIlII, final float llllllllllllIllIllIlIlllIIIllIIl, final float llllllllllllIllIllIlIlllIIIllIII, final float llllllllllllIllIllIlIlllIIlIIIIl, final float llllllllllllIllIllIlIlllIIlIIIII, final float llllllllllllIllIllIlIlllIIIlIlIl, final float llllllllllllIllIllIlIlllIIIllllI) {
        float llllllllllllIllIllIlIlllIIIlllIl = (this.particleAge + llllllllllllIllIllIlIlllIIIllIIl) / this.particleMaxAge * 32.0f;
        llllllllllllIllIllIlIlllIIIlllIl = MathHelper.clamp_float(llllllllllllIllIllIlIlllIIIlllIl, 0.0f, 1.0f);
        this.particleScale = this.reddustParticleScale * llllllllllllIllIllIlIlllIIIlllIl;
        super.renderParticle(llllllllllllIllIllIlIlllIIIllIll, llllllllllllIllIllIlIlllIIlIIlII, llllllllllllIllIllIlIlllIIIllIIl, llllllllllllIllIllIlIlllIIIllIII, llllllllllllIllIllIlIlllIIlIIIIl, llllllllllllIllIllIlIlllIIlIIIII, llllllllllllIllIllIlIlllIIIlIlIl, llllllllllllIllIllIlIlllIIIllllI);
    }
    
    protected EntityReddustFX(final World llllllllllllIllIllIlIlllIIlllIIl, final double llllllllllllIllIllIlIlllIlIIIIlI, final double llllllllllllIllIllIlIlllIlIIIIIl, final double llllllllllllIllIllIlIlllIIllIllI, final float llllllllllllIllIllIlIlllIIllIlIl, float llllllllllllIllIllIlIlllIIllIlII, final float llllllllllllIllIllIlIlllIIllllIl, final float llllllllllllIllIllIlIlllIIllllII) {
        super(llllllllllllIllIllIlIlllIIlllIIl, llllllllllllIllIllIlIlllIlIIIIlI, llllllllllllIllIllIlIlllIlIIIIIl, llllllllllllIllIllIlIlllIIllIllI, 0.0, 0.0, 0.0);
        this.motionX *= 0.10000000149011612;
        this.motionY *= 0.10000000149011612;
        this.motionZ *= 0.10000000149011612;
        if (lIIlIIIlIllIllII(lIIlIIIlIllIlIll(llllllllllllIllIllIlIlllIIllIlII, 0.0f))) {
            llllllllllllIllIllIlIlllIIllIlII = 1.0f;
        }
        final float llllllllllllIllIllIlIlllIIlllIll = (float)Math.random() * 0.4f + 0.6f;
        this.particleRed = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * llllllllllllIllIllIlIlllIIllIlII * llllllllllllIllIllIlIlllIIlllIll;
        this.particleGreen = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * llllllllllllIllIllIlIlllIIllllIl * llllllllllllIllIllIlIlllIIlllIll;
        this.particleBlue = ((float)(Math.random() * 0.20000000298023224) + 0.8f) * llllllllllllIllIllIlIlllIIllllII * llllllllllllIllIllIlIlllIIlllIll;
        this.particleScale *= 0.75f;
        this.particleScale *= llllllllllllIllIllIlIlllIIllIlIl;
        this.reddustParticleScale = this.particleScale;
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.particleMaxAge *= (int)llllllllllllIllIllIlIlllIIllIlIl;
        this.noClip = (EntityReddustFX.llIlIIIIlIllll[0] != 0);
    }
    
    private static boolean lIIlIIIlIllIlllI(final int llllllllllllIllIllIlIlllIIIIllIl, final int llllllllllllIllIllIlIlllIIIIllII) {
        return llllllllllllIllIllIlIlllIIIIllIl >= llllllllllllIllIllIlIlllIIIIllII;
    }
    
    protected EntityReddustFX(final World llllllllllllIllIllIlIlllIlIlllIl, final double llllllllllllIllIllIlIlllIlIlIlII, final double llllllllllllIllIllIlIlllIlIlIIll, final double llllllllllllIllIllIlIlllIlIlIIlI, final float llllllllllllIllIllIlIlllIlIlIIIl, final float llllllllllllIllIllIlIlllIlIllIII, final float llllllllllllIllIllIlIlllIlIIllll) {
        this(llllllllllllIllIllIlIlllIlIlllIl, llllllllllllIllIllIlIlllIlIlIlII, llllllllllllIllIllIlIlllIlIlIIll, llllllllllllIllIllIlIlllIlIlIIlI, 1.0f, llllllllllllIllIllIlIlllIlIlIIIl, llllllllllllIllIllIlIlllIlIllIII, llllllllllllIllIllIlIlllIlIIllll);
    }
    
    private static boolean lIIlIIIlIllIllII(final int llllllllllllIllIllIlIlllIIIIlIII) {
        return llllllllllllIllIllIlIlllIIIIlIII == 0;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityReddustFX.llIlIIIIlIllll[1];
        if (lIIlIIIlIllIlllI(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.setParticleTextureIndex(EntityReddustFX.llIlIIIIlIllll[2] - this.particleAge * EntityReddustFX.llIlIIIIlIllll[3] / this.particleMaxAge);
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (lIIlIIIlIllIllII(lIIlIIIlIllIllIl(this.posY, this.prevPosY))) {
            this.motionX *= 1.1;
            this.motionZ *= 1.1;
        }
        this.motionX *= 0.9599999785423279;
        this.motionY *= 0.9599999785423279;
        this.motionZ *= 0.9599999785423279;
        if (lIIlIIIlIllIllll(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIllIllIIIIllIlllIIIl, final World llllllllllllIllIllIIIIllIlllIIII, final double llllllllllllIllIllIIIIllIllIIlll, final double llllllllllllIllIllIIIIllIllIlllI, final double llllllllllllIllIllIIIIllIllIIlIl, final double llllllllllllIllIllIIIIllIllIllII, final double llllllllllllIllIllIIIIllIllIIIll, final double llllllllllllIllIllIIIIllIllIIIlI, final int... llllllllllllIllIllIIIIllIllIlIIl) {
            return new EntityReddustFX(llllllllllllIllIllIIIIllIlllIIII, llllllllllllIllIllIIIIllIllIIlll, llllllllllllIllIllIIIIllIllIlllI, llllllllllllIllIllIIIIllIllIIlIl, (float)llllllllllllIllIllIIIIllIllIllII, (float)llllllllllllIllIllIIIIllIllIIIll, (float)llllllllllllIllIllIIIIllIllIIIlI);
        }
    }
}
