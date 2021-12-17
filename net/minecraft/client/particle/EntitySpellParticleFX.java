// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.World;
import java.util.Random;

public class EntitySpellParticleFX extends EntityFX
{
    private /* synthetic */ int baseSpellTextureIndex;
    private static final /* synthetic */ Random RANDOM;
    private static final /* synthetic */ int[] lIlIlllIIlIllI;
    
    private static boolean llllIIllIlllIII(final int lllllllllllllIIIIlIllIlIllllIlII) {
        return lllllllllllllIIIIlIllIlIllllIlII == 0;
    }
    
    public void setBaseSpellTextureIndex(final int lllllllllllllIIIIlIllIlIlllllllI) {
        this.baseSpellTextureIndex = lllllllllllllIIIIlIllIlIlllllllI;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntitySpellParticleFX.lIlIlllIIlIllI[2];
        if (llllIIllIlllIlI(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.setParticleTextureIndex(this.baseSpellTextureIndex + (EntitySpellParticleFX.lIlIlllIIlIllI[3] - this.particleAge * EntitySpellParticleFX.lIlIlllIIlIllI[4] / this.particleMaxAge));
        this.motionY += 0.004;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (llllIIllIlllIII(llllIIllIlllIIl(this.posY, this.prevPosY))) {
            this.motionX *= 1.1;
            this.motionZ *= 1.1;
        }
        this.motionX *= 0.9599999785423279;
        this.motionY *= 0.9599999785423279;
        this.motionZ *= 0.9599999785423279;
        if (llllIIllIlllIll(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    private static boolean llllIIllIlllIlI(final int lllllllllllllIIIIlIllIlIlllllIIl, final int lllllllllllllIIIIlIllIlIlllllIII) {
        return lllllllllllllIIIIlIllIlIlllllIIl >= lllllllllllllIIIIlIllIlIlllllIII;
    }
    
    private static void llllIIllIllIllI() {
        (lIlIlllIIlIllI = new int[5])[0] = (0x2B ^ 0xE) + (0xBE ^ 0x88) - (0x9E ^ 0xB6) + (0x4B ^ 0x6);
        EntitySpellParticleFX.lIlIlllIIlIllI[1] = ((0x8 ^ 0x69 ^ (0xF8 ^ 0xAF)) & (0xD6 ^ 0x8E ^ (0xE1 ^ 0x8F) ^ -" ".length()));
        EntitySpellParticleFX.lIlIlllIIlIllI[2] = " ".length();
        EntitySpellParticleFX.lIlIlllIIlIllI[3] = (0x52 ^ 0x55);
        EntitySpellParticleFX.lIlIlllIIlIllI[4] = (0xBE ^ 0xB6);
    }
    
    private static int llllIIllIllIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected EntitySpellParticleFX(final World lllllllllllllIIIIlIllIllIIlIlIIl, final double lllllllllllllIIIIlIllIllIIllIIII, final double lllllllllllllIIIIlIllIllIIlIIlll, final double lllllllllllllIIIIlIllIllIIlIlllI, final double lllllllllllllIIIIlIllIllIIlIIlIl, final double lllllllllllllIIIIlIllIllIIlIllII, final double lllllllllllllIIIIlIllIllIIlIlIll) {
        super(lllllllllllllIIIIlIllIllIIlIlIIl, lllllllllllllIIIIlIllIllIIllIIII, lllllllllllllIIIIlIllIllIIlIIlll, lllllllllllllIIIIlIllIllIIlIlllI, 0.5 - EntitySpellParticleFX.RANDOM.nextDouble(), lllllllllllllIIIIlIllIllIIlIllII, 0.5 - EntitySpellParticleFX.RANDOM.nextDouble());
        this.baseSpellTextureIndex = EntitySpellParticleFX.lIlIlllIIlIllI[0];
        this.motionY *= 0.20000000298023224;
        if (llllIIllIlllIII(llllIIllIllIlll(lllllllllllllIIIIlIllIllIIlIIlIl, 0.0)) && llllIIllIlllIII(llllIIllIllIlll(lllllllllllllIIIIlIllIllIIlIlIll, 0.0))) {
            this.motionX *= 0.10000000149011612;
            this.motionZ *= 0.10000000149011612;
        }
        this.particleScale *= 0.75f;
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.noClip = (EntitySpellParticleFX.lIlIlllIIlIllI[1] != 0);
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIIIIlIllIllIIIlIlll, final Entity lllllllllllllIIIIlIllIllIIIIllII, final float lllllllllllllIIIIlIllIllIIIIlIll, final float lllllllllllllIIIIlIllIllIIIlIlII, final float lllllllllllllIIIIlIllIllIIIIlIIl, final float lllllllllllllIIIIlIllIllIIIlIIlI, final float lllllllllllllIIIIlIllIllIIIIIlll, final float lllllllllllllIIIIlIllIllIIIIIllI) {
        float lllllllllllllIIIIlIllIllIIIIllll = (this.particleAge + lllllllllllllIIIIlIllIllIIIIlIll) / this.particleMaxAge * 32.0f;
        lllllllllllllIIIIlIllIllIIIIllll = MathHelper.clamp_float(lllllllllllllIIIIlIllIllIIIIllll, 0.0f, 1.0f);
        super.renderParticle(lllllllllllllIIIIlIllIllIIIlIlll, lllllllllllllIIIIlIllIllIIIIllII, lllllllllllllIIIIlIllIllIIIIlIll, lllllllllllllIIIIlIllIllIIIlIlII, lllllllllllllIIIIlIllIllIIIIlIIl, lllllllllllllIIIIlIllIllIIIlIIlI, lllllllllllllIIIIlIllIllIIIIIlll, lllllllllllllIIIIlIllIllIIIIIllI);
    }
    
    static {
        llllIIllIllIllI();
        RANDOM = new Random();
    }
    
    private static boolean llllIIllIlllIll(final int lllllllllllllIIIIlIllIlIllllIllI) {
        return lllllllllllllIIIIlIllIlIllllIllI != 0;
    }
    
    private static int llllIIllIlllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static class MobFactory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlllIlIIIlllIIlIIIll, final World llllllllllllIlllIlIIIlllIIlIIIlI, final double llllllllllllIlllIlIIIlllIIIlIlll, final double llllllllllllIlllIlIIIlllIIlIIIII, final double llllllllllllIlllIlIIIlllIIIlllll, final double llllllllllllIlllIlIIIlllIIIlIlII, final double llllllllllllIlllIlIIIlllIIIlllIl, final double llllllllllllIlllIlIIIlllIIIlIIlI, final int... llllllllllllIlllIlIIIlllIIIllIll) {
            final EntityFX llllllllllllIlllIlIIIlllIIIllIlI = new EntitySpellParticleFX(llllllllllllIlllIlIIIlllIIlIIIlI, llllllllllllIlllIlIIIlllIIIlIlll, llllllllllllIlllIlIIIlllIIlIIIII, llllllllllllIlllIlIIIlllIIIlllll, llllllllllllIlllIlIIIlllIIIlIlII, llllllllllllIlllIlIIIlllIIIlllIl, llllllllllllIlllIlIIIlllIIIlIIlI);
            llllllllllllIlllIlIIIlllIIIllIlI.setRBGColorF((float)llllllllllllIlllIlIIIlllIIIlIlII, (float)llllllllllllIlllIlIIIlllIIIlllIl, (float)llllllllllllIlllIlIIIlllIIIlIIlI);
            return llllllllllllIlllIlIIIlllIIIllIlI;
        }
    }
    
    public static class AmbientMobFactory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIIlIIlIlllIIIIllIl, final World lllllllllllllIIIlIIlIlllIIIIIIlI, final double lllllllllllllIIIlIIlIlllIIIIIIIl, final double lllllllllllllIIIlIIlIlllIIIIlIlI, final double lllllllllllllIIIlIIlIllIllllllll, final double lllllllllllllIIIlIIlIlllIIIIlIII, final double lllllllllllllIIIlIIlIlllIIIIIlll, final double lllllllllllllIIIlIIlIlllIIIIIllI, final int... lllllllllllllIIIlIIlIlllIIIIIlIl) {
            final EntityFX lllllllllllllIIIlIIlIlllIIIIIlII = new EntitySpellParticleFX(lllllllllllllIIIlIIlIlllIIIIIIlI, lllllllllllllIIIlIIlIlllIIIIIIIl, lllllllllllllIIIlIIlIlllIIIIlIlI, lllllllllllllIIIlIIlIllIllllllll, lllllllllllllIIIlIIlIlllIIIIlIII, lllllllllllllIIIlIIlIlllIIIIIlll, lllllllllllllIIIlIIlIlllIIIIIllI);
            lllllllllllllIIIlIIlIlllIIIIIlII.setAlphaF(0.15f);
            lllllllllllllIIIlIIlIlllIIIIIlII.setRBGColorF((float)lllllllllllllIIIlIIlIlllIIIIlIII, (float)lllllllllllllIIIlIIlIlllIIIIIlll, (float)lllllllllllllIIIlIIlIlllIIIIIllI);
            return lllllllllllllIIIlIIlIlllIIIIIlII;
        }
    }
    
    public static class InstantFactory implements IParticleFactory
    {
        private static final /* synthetic */ int[] lIlIlllllllIll;
        
        private static void llllIlIllIIlIlI() {
            (lIlIlllllllIll = new int[1])[0] = (0xDE ^ 0x86) + (0xFC ^ 0xA1) - (99 + 49 - 101 + 103) + (0xDC ^ 0xAD);
        }
        
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIIIlIIlIllIIllIIIl, final World lllllllllllllIIIIlIIlIllIIlIIllI, final double lllllllllllllIIIIlIIlIllIIlIIlIl, final double lllllllllllllIIIIlIIlIllIIlIlllI, final double lllllllllllllIIIIlIIlIllIIlIllIl, final double lllllllllllllIIIIlIIlIllIIlIIIlI, final double lllllllllllllIIIIlIIlIllIIlIlIll, final double lllllllllllllIIIIlIIlIllIIlIIIII, final int... lllllllllllllIIIIlIIlIllIIlIlIIl) {
            final EntityFX lllllllllllllIIIIlIIlIllIIlIlIII = new EntitySpellParticleFX(lllllllllllllIIIIlIIlIllIIlIIllI, lllllllllllllIIIIlIIlIllIIlIIlIl, lllllllllllllIIIIlIIlIllIIlIlllI, lllllllllllllIIIIlIIlIllIIlIllIl, lllllllllllllIIIIlIIlIllIIlIIIlI, lllllllllllllIIIIlIIlIllIIlIlIll, lllllllllllllIIIIlIIlIllIIlIIIII);
            ((EntitySpellParticleFX)lllllllllllllIIIIlIIlIllIIlIlIII).setBaseSpellTextureIndex(InstantFactory.lIlIlllllllIll[0]);
            return lllllllllllllIIIIlIIlIllIIlIlIII;
        }
        
        static {
            llllIlIllIIlIlI();
        }
    }
    
    public static class WitchFactory implements IParticleFactory
    {
        private static final /* synthetic */ int[] llIlIlIIlIIIII;
        
        static {
            lIIlIIlllIlllllI();
        }
        
        private static void lIIlIIlllIlllllI() {
            (llIlIlIIlIIIII = new int[1])[0] = 134 + 123 - 141 + 28;
        }
        
        @Override
        public EntityFX getEntityFX(final int llllllllllllIllIlIlIlllIlIIllIlI, final World llllllllllllIllIlIlIlllIlIIIllIl, final double llllllllllllIllIlIlIlllIlIIllIII, final double llllllllllllIllIlIlIlllIlIIIlIll, final double llllllllllllIllIlIlIlllIlIIIlIlI, final double llllllllllllIllIlIlIlllIlIIIlIIl, final double llllllllllllIllIlIlIlllIlIIlIlII, final double llllllllllllIllIlIlIlllIlIIlIIll, final int... llllllllllllIllIlIlIlllIlIIlIIlI) {
            final EntityFX llllllllllllIllIlIlIlllIlIIlIIIl = new EntitySpellParticleFX(llllllllllllIllIlIlIlllIlIIIllIl, llllllllllllIllIlIlIlllIlIIllIII, llllllllllllIllIlIlIlllIlIIIlIll, llllllllllllIllIlIlIlllIlIIIlIlI, llllllllllllIllIlIlIlllIlIIIlIIl, llllllllllllIllIlIlIlllIlIIlIlII, llllllllllllIllIlIlIlllIlIIlIIll);
            ((EntitySpellParticleFX)llllllllllllIllIlIlIlllIlIIlIIIl).setBaseSpellTextureIndex(WitchFactory.llIlIlIIlIIIII[0]);
            final float llllllllllllIllIlIlIlllIlIIlIIII = llllllllllllIllIlIlIlllIlIIIllIl.rand.nextFloat() * 0.5f + 0.35f;
            llllllllllllIllIlIlIlllIlIIlIIIl.setRBGColorF(1.0f * llllllllllllIllIlIlIlllIlIIlIIII, 0.0f * llllllllllllIllIlIlIlllIlIIlIIII, 1.0f * llllllllllllIllIlIlIlllIlIIlIIII);
            return llllllllllllIllIlIlIlllIlIIlIIIl;
        }
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIlIllIllIllIlllIlll, final World lllllllllllllIlIllIllIllIlllIllI, final double lllllllllllllIlIllIllIllIllIllIl, final double lllllllllllllIlIllIllIllIllIllII, final double lllllllllllllIlIllIllIllIlllIIll, final double lllllllllllllIlIllIllIllIllIlIlI, final double lllllllllllllIlIllIllIllIlllIIIl, final double lllllllllllllIlIllIllIllIlllIIII, final int... lllllllllllllIlIllIllIllIllIllll) {
            return new EntitySpellParticleFX(lllllllllllllIlIllIllIllIlllIllI, lllllllllllllIlIllIllIllIllIllIl, lllllllllllllIlIllIllIllIllIllII, lllllllllllllIlIllIllIllIlllIIll, lllllllllllllIlIllIllIllIllIlIlI, lllllllllllllIlIllIllIllIlllIIIl, lllllllllllllIlIllIllIllIlllIIII);
        }
    }
}
