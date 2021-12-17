// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;

public class EntityNoteFX extends EntityFX
{
    private static final /* synthetic */ int[] llIlIlIlllIllI;
    /* synthetic */ float noteParticleScale;
    
    @Override
    public void renderParticle(final WorldRenderer llllllllllllIllIlIlIIIIIIlIllIlI, final Entity llllllllllllIllIlIlIIIIIIllIIIll, final float llllllllllllIllIlIlIIIIIIllIIIlI, final float llllllllllllIllIlIlIIIIIIllIIIIl, final float llllllllllllIllIlIlIIIIIIlIlIllI, final float llllllllllllIllIlIlIIIIIIlIlllll, final float llllllllllllIllIlIlIIIIIIlIllllI, final float llllllllllllIllIlIlIIIIIIlIlIIll) {
        float llllllllllllIllIlIlIIIIIIlIlllII = (this.particleAge + llllllllllllIllIlIlIIIIIIllIIIlI) / this.particleMaxAge * 32.0f;
        llllllllllllIllIlIlIIIIIIlIlllII = MathHelper.clamp_float(llllllllllllIllIlIlIIIIIIlIlllII, 0.0f, 1.0f);
        this.particleScale = this.noteParticleScale * llllllllllllIllIlIlIIIIIIlIlllII;
        super.renderParticle(llllllllllllIllIlIlIIIIIIlIllIlI, llllllllllllIllIlIlIIIIIIllIIIll, llllllllllllIllIlIlIIIIIIllIIIlI, llllllllllllIllIlIlIIIIIIllIIIIl, llllllllllllIllIlIlIIIIIIlIlIllI, llllllllllllIllIlIlIIIIIIlIlllll, llllllllllllIllIlIlIIIIIIlIllllI, llllllllllllIllIlIlIIIIIIlIlIIll);
    }
    
    private static boolean lIIlIlIIlIlllIII(final int llllllllllllIllIlIlIIIIIIlIIIlll) {
        return llllllllllllIllIlIlIIIIIIlIIIlll == 0;
    }
    
    protected EntityNoteFX(final World llllllllllllIllIlIlIIIIIlIIIllIl, final double llllllllllllIllIlIlIIIIIlIIlIlII, final double llllllllllllIllIlIlIIIIIlIIIlIll, final double llllllllllllIllIlIlIIIIIlIIIlIlI, final double llllllllllllIllIlIlIIIIIlIIlIIIl, final double llllllllllllIllIlIlIIIIIlIIlIIII, final double llllllllllllIllIlIlIIIIIlIIIllll) {
        this(llllllllllllIllIlIlIIIIIlIIIllIl, llllllllllllIllIlIlIIIIIlIIlIlII, llllllllllllIllIlIlIIIIIlIIIlIll, llllllllllllIllIlIlIIIIIlIIIlIlI, llllllllllllIllIlIlIIIIIlIIlIIIl, llllllllllllIllIlIlIIIIIlIIlIIII, llllllllllllIllIlIlIIIIIlIIIllll, 2.0f);
    }
    
    private static boolean lIIlIlIIlIllIlll(final int llllllllllllIllIlIlIIIIIIlIIllII, final int llllllllllllIllIlIlIIIIIIlIIlIll) {
        return llllllllllllIllIlIlIIIIIIlIIllII >= llllllllllllIllIlIlIIIIIIlIIlIll;
    }
    
    static {
        lIIlIlIIlIllIlIl();
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityNoteFX.llIlIlIlllIllI[3];
        if (lIIlIlIIlIllIlll(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (lIIlIlIIlIlllIII(lIIlIlIIlIllIllI(this.posY, this.prevPosY))) {
            this.motionX *= 1.1;
            this.motionZ *= 1.1;
        }
        this.motionX *= 0.6600000262260437;
        this.motionY *= 0.6600000262260437;
        this.motionZ *= 0.6600000262260437;
        if (lIIlIlIIlIlllIIl(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    private static int lIIlIlIIlIllIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void lIIlIlIIlIllIlIl() {
        (llIlIlIlllIllI = new int[4])[0] = (0xC ^ 0x49 ^ (0x3C ^ 0x7F));
        EntityNoteFX.llIlIlIlllIllI[1] = ((0x64 ^ 0x47 ^ (0x8D ^ 0x89)) & (0xED ^ 0x9E ^ (0xCD ^ 0x99) ^ -" ".length()));
        EntityNoteFX.llIlIlIlllIllI[2] = (0x4D ^ 0xD);
        EntityNoteFX.llIlIlIlllIllI[3] = " ".length();
    }
    
    private static boolean lIIlIlIIlIlllIIl(final int llllllllllllIllIlIlIIIIIIlIIlIIl) {
        return llllllllllllIllIlIlIIIIIIlIIlIIl != 0;
    }
    
    protected EntityNoteFX(final World llllllllllllIllIlIlIIIIIIllllllI, final double llllllllllllIllIlIlIIIIIIlllIlII, final double llllllllllllIllIlIlIIIIIIlllIIll, final double llllllllllllIllIlIlIIIIIIllllIll, final double llllllllllllIllIlIlIIIIIIlllIIIl, final double llllllllllllIllIlIlIIIIIIllllIIl, final double llllllllllllIllIlIlIIIIIIllllIII, final float llllllllllllIllIlIlIIIIIIlllIIII) {
        super(llllllllllllIllIlIlIIIIIIllllllI, llllllllllllIllIlIlIIIIIIlllIlII, llllllllllllIllIlIlIIIIIIlllIIll, llllllllllllIllIlIlIIIIIIllllIll, 0.0, 0.0, 0.0);
        this.motionX *= 0.009999999776482582;
        this.motionY *= 0.009999999776482582;
        this.motionZ *= 0.009999999776482582;
        this.motionY += 0.2;
        this.particleRed = MathHelper.sin(((float)llllllllllllIllIlIlIIIIIIlllIIIl + 0.0f) * 3.1415927f * 2.0f) * 0.65f + 0.35f;
        this.particleGreen = MathHelper.sin(((float)llllllllllllIllIlIlIIIIIIlllIIIl + 0.33333334f) * 3.1415927f * 2.0f) * 0.65f + 0.35f;
        this.particleBlue = MathHelper.sin(((float)llllllllllllIllIlIlIIIIIIlllIIIl + 0.6666667f) * 3.1415927f * 2.0f) * 0.65f + 0.35f;
        this.particleScale *= 0.75f;
        this.particleScale *= llllllllllllIllIlIlIIIIIIlllIIII;
        this.noteParticleScale = this.particleScale;
        this.particleMaxAge = EntityNoteFX.llIlIlIlllIllI[0];
        this.noClip = (EntityNoteFX.llIlIlIlllIllI[1] != 0);
        this.setParticleTextureIndex(EntityNoteFX.llIlIlIlllIllI[2]);
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIIlIIIIIIlIlIlIIII, final World lllllllllllllIIIlIIIIIIlIlIIIlll, final double lllllllllllllIIIlIIIIIIlIlIIlllI, final double lllllllllllllIIIlIIIIIIlIlIIllIl, final double lllllllllllllIIIlIIIIIIlIlIIIlII, final double lllllllllllllIIIlIIIIIIlIlIIIIll, final double lllllllllllllIIIlIIIIIIlIlIIIIlI, final double lllllllllllllIIIlIIIIIIlIlIIIIIl, final int... lllllllllllllIIIlIIIIIIlIlIIlIII) {
            return new EntityNoteFX(lllllllllllllIIIlIIIIIIlIlIIIlll, lllllllllllllIIIlIIIIIIlIlIIlllI, lllllllllllllIIIlIIIIIIlIlIIllIl, lllllllllllllIIIlIIIIIIlIlIIIlII, lllllllllllllIIIlIIIIIIlIlIIIIll, lllllllllllllIIIlIIIIIIlIlIIIIlI, lllllllllllllIIIlIIIIIIlIlIIIIIl);
        }
    }
}
