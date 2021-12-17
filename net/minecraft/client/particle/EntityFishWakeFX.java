// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;

public class EntityFishWakeFX extends EntityFX
{
    private static final /* synthetic */ int[] llIIlIllIIlllI;
    
    private static boolean lIIIllIllIlIIIIl(final int llllllllllllIlllIIIlIlIIllIlllIl) {
        return llllllllllllIlllIIIlIlIIllIlllIl <= 0;
    }
    
    protected EntityFishWakeFX(final World llllllllllllIlllIIIlIlIIllllIllI, final double llllllllllllIlllIIIlIlIIllllIlIl, final double llllllllllllIlllIIIlIlIIlllIllII, final double llllllllllllIlllIIIlIlIIllllIIll, final double llllllllllllIlllIIIlIlIIllllIIlI, final double llllllllllllIlllIIIlIlIIllllIIIl, final double llllllllllllIlllIIIlIlIIllllIIII) {
        super(llllllllllllIlllIIIlIlIIllllIllI, llllllllllllIlllIIIlIlIIllllIlIl, llllllllllllIlllIIIlIlIIlllIllII, llllllllllllIlllIIIlIlIIllllIIll, 0.0, 0.0, 0.0);
        this.motionX *= 0.30000001192092896;
        this.motionY = Math.random() * 0.20000000298023224 + 0.10000000149011612;
        this.motionZ *= 0.30000001192092896;
        this.particleRed = 1.0f;
        this.particleGreen = 1.0f;
        this.particleBlue = 1.0f;
        this.setParticleTextureIndex(EntityFishWakeFX.llIIlIllIIlllI[0]);
        this.setSize(0.01f, 0.01f);
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.particleGravity = 0.0f;
        this.motionX = llllllllllllIlllIIIlIlIIllllIIlI;
        this.motionY = llllllllllllIlllIIIlIlIIllllIIIl;
        this.motionZ = llllllllllllIlllIIIlIlIIllllIIII;
    }
    
    static {
        lIIIllIllIlIIIII();
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= this.particleGravity;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863;
        this.motionY *= 0.9800000190734863;
        this.motionZ *= 0.9800000190734863;
        final int llllllllllllIlllIIIlIlIIlllIIIll = EntityFishWakeFX.llIIlIllIIlllI[1] - this.particleMaxAge;
        final float llllllllllllIlllIIIlIlIIlllIIIlI = llllllllllllIlllIIIlIlIIlllIIIll * 0.001f;
        this.setSize(llllllllllllIlllIIIlIlIIlllIIIlI, llllllllllllIlllIIIlIlIIlllIIIlI);
        this.setParticleTextureIndex(EntityFishWakeFX.llIIlIllIIlllI[0] + llllllllllllIlllIIIlIlIIlllIIIll % EntityFishWakeFX.llIIlIllIIlllI[2]);
        final int particleMaxAge = this.particleMaxAge;
        this.particleMaxAge = particleMaxAge - EntityFishWakeFX.llIIlIllIIlllI[3];
        if (lIIIllIllIlIIIIl(particleMaxAge)) {
            this.setDead();
        }
    }
    
    private static void lIIIllIllIlIIIII() {
        (llIIlIllIIlllI = new int[4])[0] = (0x73 ^ 0x1F ^ 37 + 125 - 105 + 70);
        EntityFishWakeFX.llIIlIllIIlllI[1] = (0xB ^ 0x40 ^ (0x3A ^ 0x4D));
        EntityFishWakeFX.llIIlIllIIlllI[2] = (0x22 ^ 0x47 ^ (0xFF ^ 0x9E));
        EntityFishWakeFX.llIIlIllIIlllI[3] = " ".length();
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIlIIlllIIlllIlllll, final World lllllllllllllIIlIIlllIIlllIlIllI, final double lllllllllllllIIlIIlllIIlllIlIlIl, final double lllllllllllllIIlIIlllIIlllIlIlII, final double lllllllllllllIIlIIlllIIlllIllIll, final double lllllllllllllIIlIIlllIIlllIlIIlI, final double lllllllllllllIIlIIlllIIlllIllIIl, final double lllllllllllllIIlIIlllIIlllIlIIII, final int... lllllllllllllIIlIIlllIIlllIlIlll) {
            return new EntityFishWakeFX(lllllllllllllIIlIIlllIIlllIlIllI, lllllllllllllIIlIIlllIIlllIlIlIl, lllllllllllllIIlIIlllIIlllIlIlII, lllllllllllllIIlIIlllIIlllIllIll, lllllllllllllIIlIIlllIIlllIlIIlI, lllllllllllllIIlIIlllIIlllIllIIl, lllllllllllllIIlIIlllIIlllIlIIII);
        }
    }
}
