// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.World;

public class EntityHeartFX extends EntityFX
{
    private static final /* synthetic */ int[] lIllIlIllIlIII;
    /* synthetic */ float particleScaleOverTime;
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityHeartFX.lIllIlIllIlIII[3];
        if (llllllIllllllIl(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (llllllIlllllllI(llllllIllllllII(this.posY, this.prevPosY))) {
            this.motionX *= 1.1;
            this.motionZ *= 1.1;
        }
        this.motionX *= 0.8600000143051147;
        this.motionY *= 0.8600000143051147;
        this.motionZ *= 0.8600000143051147;
        if (llllllIllllllll(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    private static boolean llllllIllllllIl(final int llllllllllllIllllllllIlllIlIlIII, final int llllllllllllIllllllllIlllIlIIlll) {
        return llllllllllllIllllllllIlllIlIlIII >= llllllllllllIllllllllIlllIlIIlll;
    }
    
    protected EntityHeartFX(final World llllllllllllIllllllllIlllllIllll, final double llllllllllllIllllllllIlllllIIllI, final double llllllllllllIllllllllIlllllIllIl, final double llllllllllllIllllllllIlllllIIlII, final double llllllllllllIllllllllIlllllIlIll, final double llllllllllllIllllllllIlllllIlIlI, final double llllllllllllIllllllllIlllllIIIIl) {
        this(llllllllllllIllllllllIlllllIllll, llllllllllllIllllllllIlllllIIllI, llllllllllllIllllllllIlllllIllIl, llllllllllllIllllllllIlllllIIlII, llllllllllllIllllllllIlllllIlIll, llllllllllllIllllllllIlllllIlIlI, llllllllllllIllllllllIlllllIIIIl, 2.0f);
    }
    
    private static int llllllIllllllII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    static {
        llllllIlllllIll();
    }
    
    protected EntityHeartFX(final World llllllllllllIllllllllIllllIlIIII, final double llllllllllllIllllllllIllllIIllll, final double llllllllllllIllllllllIllllIlIlll, final double llllllllllllIllllllllIllllIlIllI, final double llllllllllllIllllllllIllllIlIlIl, final double llllllllllllIllllllllIllllIlIlII, final double llllllllllllIllllllllIllllIlIIll, final float llllllllllllIllllllllIllllIIllII) {
        super(llllllllllllIllllllllIllllIlIIII, llllllllllllIllllllllIllllIIllll, llllllllllllIllllllllIllllIlIlll, llllllllllllIllllllllIllllIlIllI, 0.0, 0.0, 0.0);
        this.motionX *= 0.009999999776482582;
        this.motionY *= 0.009999999776482582;
        this.motionZ *= 0.009999999776482582;
        this.motionY += 0.1;
        this.particleScale *= 0.75f;
        this.particleScale *= llllllllllllIllllllllIllllIIllII;
        this.particleScaleOverTime = this.particleScale;
        this.particleMaxAge = EntityHeartFX.lIllIlIllIlIII[0];
        this.noClip = (EntityHeartFX.lIllIlIllIlIII[1] != 0);
        this.setParticleTextureIndex(EntityHeartFX.lIllIlIllIlIII[2]);
    }
    
    private static void llllllIlllllIll() {
        (lIllIlIllIlIII = new int[4])[0] = (0x7C ^ 0x75 ^ (0x48 ^ 0x51));
        EntityHeartFX.lIllIlIllIlIII[1] = ((0xA9 ^ 0xBE ^ (0x8 ^ 0x52)) & (0x18 ^ 0x0 ^ (0x49 ^ 0x1C) ^ -" ".length()));
        EntityHeartFX.lIllIlIllIlIII[2] = (0x87 ^ 0x8C ^ (0x18 ^ 0x43));
        EntityHeartFX.lIllIlIllIlIII[3] = " ".length();
    }
    
    private static boolean llllllIllllllll(final int llllllllllllIllllllllIlllIlIIlIl) {
        return llllllllllllIllllllllIlllIlIIlIl != 0;
    }
    
    private static boolean llllllIlllllllI(final int llllllllllllIllllllllIlllIlIIIll) {
        return llllllllllllIllllllllIlllIlIIIll == 0;
    }
    
    @Override
    public void renderParticle(final WorldRenderer llllllllllllIllllllllIllllIIIIII, final Entity llllllllllllIllllllllIlllIllIlIl, final float llllllllllllIllllllllIlllIlllllI, final float llllllllllllIllllllllIlllIllIIll, final float llllllllllllIllllllllIlllIllIIlI, final float llllllllllllIllllllllIlllIlllIll, final float llllllllllllIllllllllIlllIlllIlI, final float llllllllllllIllllllllIlllIlIllll) {
        float llllllllllllIllllllllIlllIlllIII = (this.particleAge + llllllllllllIllllllllIlllIlllllI) / this.particleMaxAge * 32.0f;
        llllllllllllIllllllllIlllIlllIII = MathHelper.clamp_float(llllllllllllIllllllllIlllIlllIII, 0.0f, 1.0f);
        this.particleScale = this.particleScaleOverTime * llllllllllllIllllllllIlllIlllIII;
        super.renderParticle(llllllllllllIllllllllIllllIIIIII, llllllllllllIllllllllIlllIllIlIl, llllllllllllIllllllllIlllIlllllI, llllllllllllIllllllllIlllIllIIll, llllllllllllIllllllllIlllIllIIlI, llllllllllllIllllllllIlllIlllIll, llllllllllllIllllllllIlllIlllIlI, llllllllllllIllllllllIlllIlIllll);
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIIIIlIlIIIllIIIIll, final World lllllllllllllIIIIIlIlIIIllIIIIlI, final double lllllllllllllIIIIIlIlIIIlIlllIIl, final double lllllllllllllIIIIIlIlIIIlIlllIII, final double lllllllllllllIIIIIlIlIIIlIllllll, final double lllllllllllllIIIIIlIlIIIlIllIllI, final double lllllllllllllIIIIIlIlIIIlIllllIl, final double lllllllllllllIIIIIlIlIIIlIllIlII, final int... lllllllllllllIIIIIlIlIIIlIlllIll) {
            return new EntityHeartFX(lllllllllllllIIIIIlIlIIIllIIIIlI, lllllllllllllIIIIIlIlIIIlIlllIIl, lllllllllllllIIIIIlIlIIIlIlllIII, lllllllllllllIIIIIlIlIIIlIllllll, lllllllllllllIIIIIlIlIIIlIllIllI, lllllllllllllIIIIIlIlIIIlIllllIl, lllllllllllllIIIIIlIlIIIlIllIlII);
        }
    }
    
    public static class AngryVillagerFactory implements IParticleFactory
    {
        private static final /* synthetic */ int[] lIllIlIlIlllII;
        
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlllllllllIllIlIllIl, final World llllllllllllIlllllllllIllIlIllII, final double llllllllllllIlllllllllIllIlIlIll, final double llllllllllllIlllllllllIllIlIlIlI, final double llllllllllllIlllllllllIllIIlllll, final double llllllllllllIlllllllllIllIlIlIII, final double llllllllllllIlllllllllIllIIlllIl, final double llllllllllllIlllllllllIllIlIIllI, final int... llllllllllllIlllllllllIllIlIIlIl) {
            final EntityFX llllllllllllIlllllllllIllIlIIlII = new EntityHeartFX(llllllllllllIlllllllllIllIlIllII, llllllllllllIlllllllllIllIlIlIll, llllllllllllIlllllllllIllIlIlIlI + 0.5, llllllllllllIlllllllllIllIIlllll, llllllllllllIlllllllllIllIlIlIII, llllllllllllIlllllllllIllIIlllIl, llllllllllllIlllllllllIllIlIIllI);
            llllllllllllIlllllllllIllIlIIlII.setParticleTextureIndex(AngryVillagerFactory.lIllIlIlIlllII[0]);
            llllllllllllIlllllllllIllIlIIlII.setRBGColorF(1.0f, 1.0f, 1.0f);
            return llllllllllllIlllllllllIllIlIIlII;
        }
        
        private static void llllllIllIlIlIl() {
            (lIllIlIlIlllII = new int[1])[0] = (0x60 ^ 0x68 ^ (0xE0 ^ 0xB9));
        }
        
        static {
            llllllIllIlIlIl();
        }
    }
}
