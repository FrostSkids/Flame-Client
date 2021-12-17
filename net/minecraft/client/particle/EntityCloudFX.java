// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.World;

public class EntityCloudFX extends EntityFX
{
    /* synthetic */ float field_70569_a;
    private static final /* synthetic */ int[] lIlIlIIIIllIlI;
    
    private static boolean lllIlIlIllIllll(final Object lllllllllllllIIIlIlIlllllllllIlI) {
        return lllllllllllllIIIlIlIlllllllllIlI != null;
    }
    
    private static boolean lllIlIlIlllIIII(final int lllllllllllllIIIlIlIllllllllIllI) {
        return lllllllllllllIIIlIlIllllllllIllI > 0;
    }
    
    protected EntityCloudFX(final World lllllllllllllIIIlIllIIIIIIllIlII, final double lllllllllllllIIIlIllIIIIIIlIlIlI, final double lllllllllllllIIIlIllIIIIIIlIlIIl, final double lllllllllllllIIIlIllIIIIIIllIIIl, final double lllllllllllllIIIlIllIIIIIIlIIlll, final double lllllllllllllIIIlIllIIIIIIlIIllI, final double lllllllllllllIIIlIllIIIIIIlIlllI) {
        super(lllllllllllllIIIlIllIIIIIIllIlII, lllllllllllllIIIlIllIIIIIIlIlIlI, lllllllllllllIIIlIllIIIIIIlIlIIl, lllllllllllllIIIlIllIIIIIIllIIIl, 0.0, 0.0, 0.0);
        final float lllllllllllllIIIlIllIIIIIIlIllIl = 2.5f;
        this.motionX *= 0.10000000149011612;
        this.motionY *= 0.10000000149011612;
        this.motionZ *= 0.10000000149011612;
        this.motionX += lllllllllllllIIIlIllIIIIIIlIIlll;
        this.motionY += lllllllllllllIIIlIllIIIIIIlIIllI;
        this.motionZ += lllllllllllllIIIlIllIIIIIIlIlllI;
        final float particleRed = 1.0f - (float)(Math.random() * 0.30000001192092896);
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleScale *= 0.75f;
        this.particleScale *= lllllllllllllIIIlIllIIIIIIlIllIl;
        this.field_70569_a = this.particleScale;
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.3));
        this.particleMaxAge *= (int)lllllllllllllIIIlIllIIIIIIlIllIl;
        this.noClip = (EntityCloudFX.lIlIlIIIIllIlI[0] != 0);
    }
    
    static {
        lllIlIlIllIllII();
    }
    
    private static boolean lllIlIlIlllIIIl(final int lllllllllllllIIIlIlIlllllllllIII) {
        return lllllllllllllIIIlIlIlllllllllIII != 0;
    }
    
    private static boolean lllIlIlIllIlllI(final int lllllllllllllIIIlIlIllllllllllIl, final int lllllllllllllIIIlIlIllllllllllII) {
        return lllllllllllllIIIlIlIllllllllllIl >= lllllllllllllIIIlIlIllllllllllII;
    }
    
    private static int lllIlIlIllIllIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIIIlIllIIIIIIIllIII, final Entity lllllllllllllIIIlIllIIIIIIIIllIl, final float lllllllllllllIIIlIllIIIIIIIIllII, final float lllllllllllllIIIlIllIIIIIIIIlIll, final float lllllllllllllIIIlIllIIIIIIIIlIlI, final float lllllllllllllIIIlIllIIIIIIIIlIIl, final float lllllllllllllIIIlIllIIIIIIIIlIII, final float lllllllllllllIIIlIllIIIIIIIIIlll) {
        float lllllllllllllIIIlIllIIIIIIIlIIII = (this.particleAge + lllllllllllllIIIlIllIIIIIIIIllII) / this.particleMaxAge * 32.0f;
        lllllllllllllIIIlIllIIIIIIIlIIII = MathHelper.clamp_float(lllllllllllllIIIlIllIIIIIIIlIIII, 0.0f, 1.0f);
        this.particleScale = this.field_70569_a * lllllllllllllIIIlIllIIIIIIIlIIII;
        super.renderParticle(lllllllllllllIIIlIllIIIIIIIllIII, lllllllllllllIIIlIllIIIIIIIIllIl, lllllllllllllIIIlIllIIIIIIIIllII, lllllllllllllIIIlIllIIIIIIIIlIll, lllllllllllllIIIlIllIIIIIIIIlIlI, lllllllllllllIIIlIllIIIIIIIIlIIl, lllllllllllllIIIlIllIIIIIIIIlIII, lllllllllllllIIIlIllIIIIIIIIIlll);
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityCloudFX.lIlIlIIIIllIlI[1];
        if (lllIlIlIllIlllI(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
        this.setParticleTextureIndex(EntityCloudFX.lIlIlIIIIllIlI[2] - this.particleAge * EntityCloudFX.lIlIlIIIIllIlI[3] / this.particleMaxAge);
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9599999785423279;
        this.motionY *= 0.9599999785423279;
        this.motionZ *= 0.9599999785423279;
        final EntityPlayer lllllllllllllIIIlIllIIIIIIIIIIlI = this.worldObj.getClosestPlayerToEntity(this, 2.0);
        if (lllIlIlIllIllll(lllllllllllllIIIlIllIIIIIIIIIIlI) && lllIlIlIlllIIII(lllIlIlIllIllIl(this.posY, lllllllllllllIIIlIllIIIIIIIIIIlI.getEntityBoundingBox().minY))) {
            this.posY += (lllllllllllllIIIlIllIIIIIIIIIIlI.getEntityBoundingBox().minY - this.posY) * 0.2;
            this.motionY += (lllllllllllllIIIlIllIIIIIIIIIIlI.motionY - this.motionY) * 0.2;
            this.setPosition(this.posX, this.posY, this.posZ);
        }
        if (lllIlIlIlllIIIl(this.onGround ? 1 : 0)) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    private static void lllIlIlIllIllII() {
        (lIlIlIIIIllIlI = new int[4])[0] = ("  ".length() & ("  ".length() ^ -" ".length()));
        EntityCloudFX.lIlIlIIIIllIlI[1] = " ".length();
        EntityCloudFX.lIlIlIIIIllIlI[2] = (0x35 ^ 0x60 ^ (0xF7 ^ 0xA5));
        EntityCloudFX.lIlIlIIIIllIlI[3] = (0x20 ^ 0x48 ^ (0xD3 ^ 0xB3));
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlllIlIIlIlIllllllll, final World llllllllllllIlllIlIIlIlIlllllllI, final double llllllllllllIlllIlIIlIlIllllllIl, final double llllllllllllIlllIlIIlIlIllllllII, final double llllllllllllIlllIlIIlIlIllllIIll, final double llllllllllllIlllIlIIlIlIllllIIlI, final double llllllllllllIlllIlIIlIlIllllIIIl, final double llllllllllllIlllIlIIlIlIlllllIII, final int... llllllllllllIlllIlIIlIlIllllIlll) {
            return new EntityCloudFX(llllllllllllIlllIlIIlIlIlllllllI, llllllllllllIlllIlIIlIlIllllllIl, llllllllllllIlllIlIIlIlIllllllII, llllllllllllIlllIlIIlIlIllllIIll, llllllllllllIlllIlIIlIlIllllIIlI, llllllllllllIlllIlIIlIlIllllIIIl, llllllllllllIlllIlIIlIlIlllllIII);
        }
    }
}
