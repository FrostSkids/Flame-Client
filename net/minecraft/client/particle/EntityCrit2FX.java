// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.World;

public class EntityCrit2FX extends EntityFX
{
    private static final /* synthetic */ int[] lIIlIIIIIIIlll;
    /* synthetic */ float field_174839_a;
    
    static {
        llIIlIIIlllIllI();
    }
    
    protected EntityCrit2FX(final World lllllllllllllIIlllIlllllIIlIIIlI, final double lllllllllllllIIlllIlllllIIIllIII, final double lllllllllllllIIlllIlllllIIlIIIII, final double lllllllllllllIIlllIlllllIIIlIllI, final double lllllllllllllIIlllIlllllIIIlIlIl, final double lllllllllllllIIlllIlllllIIIlllIl, final double lllllllllllllIIlllIlllllIIIlllII, final float lllllllllllllIIlllIlllllIIIllIll) {
        super(lllllllllllllIIlllIlllllIIlIIIlI, lllllllllllllIIlllIlllllIIIllIII, lllllllllllllIIlllIlllllIIlIIIII, lllllllllllllIIlllIlllllIIIlIllI, 0.0, 0.0, 0.0);
        this.motionX *= 0.10000000149011612;
        this.motionY *= 0.10000000149011612;
        this.motionZ *= 0.10000000149011612;
        this.motionX += lllllllllllllIIlllIlllllIIIlIlIl * 0.4;
        this.motionY += lllllllllllllIIlllIlllllIIIlllIl * 0.4;
        this.motionZ += lllllllllllllIIlllIlllllIIIlllII * 0.4;
        final float particleRed = (float)(Math.random() * 0.30000001192092896 + 0.6000000238418579);
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleScale *= 0.75f;
        this.particleScale *= lllllllllllllIIlllIlllllIIIllIll;
        this.field_174839_a = this.particleScale;
        this.particleMaxAge = (int)(6.0 / (Math.random() * 0.8 + 0.6));
        this.particleMaxAge *= (int)lllllllllllllIIlllIlllllIIIllIll;
        this.noClip = (EntityCrit2FX.lIIlIIIIIIIlll[0] != 0);
        this.setParticleTextureIndex(EntityCrit2FX.lIIlIIIIIIIlll[1]);
        this.onUpdate();
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIIlllIlllllIIIIIllI, final Entity lllllllllllllIIlllIlllllIIIIIlIl, final float lllllllllllllIIlllIllllIlllllIlI, final float lllllllllllllIIlllIllllIlllllIIl, final float lllllllllllllIIlllIlllllIIIIIIlI, final float lllllllllllllIIlllIllllIllllIlll, final float lllllllllllllIIlllIlllllIIIIIIII, final float lllllllllllllIIlllIllllIllllllll) {
        float lllllllllllllIIlllIllllIlllllllI = (this.particleAge + lllllllllllllIIlllIllllIlllllIlI) / this.particleMaxAge * 32.0f;
        lllllllllllllIIlllIllllIlllllllI = MathHelper.clamp_float(lllllllllllllIIlllIllllIlllllllI, 0.0f, 1.0f);
        this.particleScale = this.field_174839_a * lllllllllllllIIlllIllllIlllllllI;
        super.renderParticle(lllllllllllllIIlllIlllllIIIIIllI, lllllllllllllIIlllIlllllIIIIIlIl, lllllllllllllIIlllIllllIlllllIlI, lllllllllllllIIlllIllllIlllllIIl, lllllllllllllIIlllIlllllIIIIIIlI, lllllllllllllIIlllIllllIllllIlll, lllllllllllllIIlllIlllllIIIIIIII, lllllllllllllIIlllIllllIllllllll);
    }
    
    private static boolean llIIlIIIllllIII(final int lllllllllllllIIlllIllllIlllIlIll) {
        return lllllllllllllIIlllIllllIlllIlIll != 0;
    }
    
    protected EntityCrit2FX(final World lllllllllllllIIlllIlllllIIllIIll, final double lllllllllllllIIlllIlllllIIlllIlI, final double lllllllllllllIIlllIlllllIIlllIIl, final double lllllllllllllIIlllIlllllIIllIIII, final double lllllllllllllIIlllIlllllIIllIlll, final double lllllllllllllIIlllIlllllIIllIllI, final double lllllllllllllIIlllIlllllIIlIllIl) {
        this(lllllllllllllIIlllIlllllIIllIIll, lllllllllllllIIlllIlllllIIlllIlI, lllllllllllllIIlllIlllllIIlllIIl, lllllllllllllIIlllIlllllIIllIIII, lllllllllllllIIlllIlllllIIllIlll, lllllllllllllIIlllIlllllIIllIllI, lllllllllllllIIlllIlllllIIlIllIl, 1.0f);
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityCrit2FX.lIIlIIIIIIIlll[2];
        if (llIIlIIIlllIlll(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.particleGreen *= (float)0.96;
        this.particleBlue *= (float)0.9;
        this.motionX *= 0.699999988079071;
        this.motionY *= 0.699999988079071;
        this.motionZ *= 0.699999988079071;
        this.motionY -= 0.019999999552965164;
        if (llIIlIIIllllIII(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    private static boolean llIIlIIIlllIlll(final int lllllllllllllIIlllIllllIlllIlllI, final int lllllllllllllIIlllIllllIlllIllIl) {
        return lllllllllllllIIlllIllllIlllIlllI >= lllllllllllllIIlllIllllIlllIllIl;
    }
    
    private static void llIIlIIIlllIllI() {
        (lIIlIIIIIIIlll = new int[3])[0] = ((0xA7 ^ 0x8B) & ~(0x9D ^ 0xB1));
        EntityCrit2FX.lIIlIIIIIIIlll[1] = (0x3A ^ 0x7B);
        EntityCrit2FX.lIIlIIIIIIIlll[2] = " ".length();
    }
    
    public static class MagicFactory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlIllllIIIIIlIlIIlll, final World llllllllllllIlIllllIIIIIlIlIIllI, final double llllllllllllIlIllllIIIIIlIlIIlIl, final double llllllllllllIlIllllIIIIIlIIllIlI, final double llllllllllllIlIllllIIIIIlIIllIIl, final double llllllllllllIlIllllIIIIIlIlIIIlI, final double llllllllllllIlIllllIIIIIlIlIIIIl, final double llllllllllllIlIllllIIIIIlIlIIIII, final int... llllllllllllIlIllllIIIIIlIIlllll) {
            final EntityFX llllllllllllIlIllllIIIIIlIIllllI = new EntityCrit2FX(llllllllllllIlIllllIIIIIlIlIIllI, llllllllllllIlIllllIIIIIlIlIIlIl, llllllllllllIlIllllIIIIIlIIllIlI, llllllllllllIlIllllIIIIIlIIllIIl, llllllllllllIlIllllIIIIIlIlIIIlI, llllllllllllIlIllllIIIIIlIlIIIIl, llllllllllllIlIllllIIIIIlIlIIIII);
            llllllllllllIlIllllIIIIIlIIllllI.setRBGColorF(llllllllllllIlIllllIIIIIlIIllllI.getRedColorF() * 0.3f, llllllllllllIlIllllIIIIIlIIllllI.getGreenColorF() * 0.8f, llllllllllllIlIllllIIIIIlIIllllI.getBlueColorF());
            llllllllllllIlIllllIIIIIlIIllllI.nextTextureIndexX();
            return llllllllllllIlIllllIIIIIlIIllllI;
        }
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIllllIIIllIIlllIlllI, final World llllllllllllIllllIIIllIIlllIIlIl, final double llllllllllllIllllIIIllIIlllIIlII, final double llllllllllllIllllIIIllIIlllIlIll, final double llllllllllllIllllIIIllIIlllIIIlI, final double llllllllllllIllllIIIllIIlllIIIIl, final double llllllllllllIllllIIIllIIlllIIIII, final double llllllllllllIllllIIIllIIllIlllll, final int... llllllllllllIllllIIIllIIlllIIllI) {
            return new EntityCrit2FX(llllllllllllIllllIIIllIIlllIIlIl, llllllllllllIllllIIIllIIlllIIlII, llllllllllllIllllIIIllIIlllIlIll, llllllllllllIllllIIIllIIlllIIIlI, llllllllllllIllllIIIllIIlllIIIIl, llllllllllllIllllIIIllIIlllIIIII, llllllllllllIllllIIIllIIllIlllll);
        }
    }
}
