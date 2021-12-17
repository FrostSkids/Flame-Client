// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;

public class EntityLavaFX extends EntityFX
{
    private /* synthetic */ float lavaParticleScale;
    private static final /* synthetic */ int[] lIIlIlIllIIlII;
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIIllIIlllIlIIlIIIII, final Entity lllllllllllllIIllIIlllIlIIIlIlIl, final float lllllllllllllIIllIIlllIlIIIllllI, final float lllllllllllllIIllIIlllIlIIIlllIl, final float lllllllllllllIIllIIlllIlIIIlllII, final float lllllllllllllIIllIIlllIlIIIlIIIl, final float lllllllllllllIIllIIlllIlIIIlIIII, final float lllllllllllllIIllIIlllIlIIIIllll) {
        final float lllllllllllllIIllIIlllIlIIIllIII = (this.particleAge + lllllllllllllIIllIIlllIlIIIllllI) / this.particleMaxAge;
        this.particleScale = this.lavaParticleScale * (1.0f - lllllllllllllIIllIIlllIlIIIllIII * lllllllllllllIIllIIlllIlIIIllIII);
        super.renderParticle(lllllllllllllIIllIIlllIlIIlIIIII, lllllllllllllIIllIIlllIlIIIlIlIl, lllllllllllllIIllIIlllIlIIIllllI, lllllllllllllIIllIIlllIlIIIlllIl, lllllllllllllIIllIIlllIlIIIlllII, lllllllllllllIIllIIlllIlIIIlIIIl, lllllllllllllIIllIIlllIlIIIlIIII, lllllllllllllIIllIIlllIlIIIIllll);
    }
    
    protected EntityLavaFX(final World lllllllllllllIIllIIlllIlIlIIIIll, final double lllllllllllllIIllIIlllIlIlIIIlll, final double lllllllllllllIIllIIlllIlIlIIIllI, final double lllllllllllllIIllIIlllIlIlIIIIII) {
        super(lllllllllllllIIllIIlllIlIlIIIIll, lllllllllllllIIllIIlllIlIlIIIlll, lllllllllllllIIllIIlllIlIlIIIllI, lllllllllllllIIllIIlllIlIlIIIIII, 0.0, 0.0, 0.0);
        this.motionX *= 0.800000011920929;
        this.motionY *= 0.800000011920929;
        this.motionZ *= 0.800000011920929;
        this.motionY = this.rand.nextFloat() * 0.4f + 0.05f;
        final float particleRed = 1.0f;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleScale *= this.rand.nextFloat() * 2.0f + 0.2f;
        this.lavaParticleScale = this.particleScale;
        this.particleMaxAge = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.noClip = (EntityLavaFX.lIIlIlIllIIlII[0] != 0);
        this.setParticleTextureIndex(EntityLavaFX.lIIlIlIllIIlII[1]);
    }
    
    @Override
    public float getBrightness(final float lllllllllllllIIllIIlllIlIIlIllII) {
        return 1.0f;
    }
    
    private static boolean llIlIIIIlllllll(final int lllllllllllllIIllIIlllIlIIIIIlIl, final int lllllllllllllIIllIIlllIlIIIIIlII) {
        return lllllllllllllIIllIIlllIlIIIIIlIl >= lllllllllllllIIllIIlllIlIIIIIlII;
    }
    
    @Override
    public int getBrightnessForRender(final float lllllllllllllIIllIIlllIlIIlllIII) {
        float lllllllllllllIIllIIlllIlIIllIlll = (this.particleAge + lllllllllllllIIllIIlllIlIIlllIII) / this.particleMaxAge;
        lllllllllllllIIllIIlllIlIIllIlll = MathHelper.clamp_float(lllllllllllllIIllIIlllIlIIllIlll, 0.0f, 1.0f);
        final int lllllllllllllIIllIIlllIlIIllIllI = super.getBrightnessForRender(lllllllllllllIIllIIlllIlIIlllIII);
        final int lllllllllllllIIllIIlllIlIIllIlIl = EntityLavaFX.lIIlIlIllIIlII[2];
        final int lllllllllllllIIllIIlllIlIIllIlII = lllllllllllllIIllIIlllIlIIllIllI >> EntityLavaFX.lIIlIlIllIIlII[3] & EntityLavaFX.lIIlIlIllIIlII[4];
        return lllllllllllllIIllIIlllIlIIllIlIl | lllllllllllllIIllIIlllIlIIllIlII << EntityLavaFX.lIIlIlIllIIlII[3];
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityLavaFX.lIIlIlIllIIlII[5];
        if (llIlIIIIlllllll(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        final float lllllllllllllIIllIIlllIlIIIIlIlI = this.particleAge / (float)this.particleMaxAge;
        if (llIlIIIlIIIIIII(llIlIIIIllllllI(this.rand.nextFloat(), lllllllllllllIIllIIlllIlIIIIlIlI))) {
            this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, this.posX, this.posY, this.posZ, this.motionX, this.motionY, this.motionZ, new int[EntityLavaFX.lIIlIlIllIIlII[0]]);
        }
        this.motionY -= 0.03;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9990000128746033;
        this.motionY *= 0.9990000128746033;
        this.motionZ *= 0.9990000128746033;
        if (llIlIIIlIIIIIIl(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    private static int llIlIIIIllllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        llIlIIIIlllllIl();
    }
    
    private static void llIlIIIIlllllIl() {
        (lIIlIlIllIIlII = new int[6])[0] = ((4 + 37 + 91 + 83 ^ 4 + 17 + 49 + 88) & (0x71 ^ 0x2F ^ (0x72 ^ 0x65) ^ -" ".length()));
        EntityLavaFX.lIIlIlIllIIlII[1] = (0x6 ^ 0x7D ^ (0xFE ^ 0xB4));
        EntityLavaFX.lIIlIlIllIIlII[2] = (0xE7 ^ 0xA5) + (0x1E ^ 0x1A) - (0x6F ^ 0x62) + (117 + 138 - 103 + 31);
        EntityLavaFX.lIIlIlIllIIlII[3] = (0x21 ^ 0x9 ^ (0x2D ^ 0x15));
        EntityLavaFX.lIIlIlIllIIlII[4] = 92 + 164 - 61 + 25 + (0x6A ^ 0x7D) - (0x43 ^ 0x77) + (0x15 ^ 0x55);
        EntityLavaFX.lIIlIlIllIIlII[5] = " ".length();
    }
    
    private static boolean llIlIIIlIIIIIIl(final int lllllllllllllIIllIIlllIlIIIIIIlI) {
        return lllllllllllllIIllIIlllIlIIIIIIlI != 0;
    }
    
    private static boolean llIlIIIlIIIIIII(final int lllllllllllllIIllIIlllIlIIIIIIII) {
        return lllllllllllllIIllIIlllIlIIIIIIII > 0;
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIIIIIlllIlIlIIIIII, final World lllllllllllllIIIIIIlllIlIIllIlll, final double lllllllllllllIIIIIIlllIlIIlllllI, final double lllllllllllllIIIIIIlllIlIIllllIl, final double lllllllllllllIIIIIIlllIlIIllllII, final double lllllllllllllIIIIIIlllIlIIlllIll, final double lllllllllllllIIIIIIlllIlIIlllIlI, final double lllllllllllllIIIIIIlllIlIIlllIIl, final int... lllllllllllllIIIIIIlllIlIIlllIII) {
            return new EntityLavaFX(lllllllllllllIIIIIIlllIlIIllIlll, lllllllllllllIIIIIIlllIlIIlllllI, lllllllllllllIIIIIIlllIlIIllllIl, lllllllllllllIIIIIIlllIlIIllllII);
        }
    }
}
