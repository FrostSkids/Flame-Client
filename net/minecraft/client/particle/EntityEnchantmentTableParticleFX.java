// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;

public class EntityEnchantmentTableParticleFX extends EntityFX
{
    private /* synthetic */ double coordZ;
    private /* synthetic */ double coordX;
    private static final /* synthetic */ int[] lIIlIIIIIlllII;
    private /* synthetic */ double coordY;
    private /* synthetic */ float field_70565_a;
    
    protected EntityEnchantmentTableParticleFX(final World lllllllllllllIIlllIlllIlIIlllllI, final double lllllllllllllIIlllIlllIlIIllIlII, final double lllllllllllllIIlllIlllIlIIllllII, final double lllllllllllllIIlllIlllIlIIlllIll, final double lllllllllllllIIlllIlllIlIIllIIIl, final double lllllllllllllIIlllIlllIlIIlllIIl, final double lllllllllllllIIlllIlllIlIIlllIII) {
        super(lllllllllllllIIlllIlllIlIIlllllI, lllllllllllllIIlllIlllIlIIllIlII, lllllllllllllIIlllIlllIlIIllllII, lllllllllllllIIlllIlllIlIIlllIll, lllllllllllllIIlllIlllIlIIllIIIl, lllllllllllllIIlllIlllIlIIlllIIl, lllllllllllllIIlllIlllIlIIlllIII);
        this.motionX = lllllllllllllIIlllIlllIlIIllIIIl;
        this.motionY = lllllllllllllIIlllIlllIlIIlllIIl;
        this.motionZ = lllllllllllllIIlllIlllIlIIlllIII;
        this.coordX = lllllllllllllIIlllIlllIlIIllIlII;
        this.coordY = lllllllllllllIIlllIlllIlIIllllII;
        this.coordZ = lllllllllllllIIlllIlllIlIIlllIll;
        final double n = lllllllllllllIIlllIlllIlIIllIlII + lllllllllllllIIlllIlllIlIIllIIIl;
        this.prevPosX = n;
        this.posX = n;
        final double n2 = lllllllllllllIIlllIlllIlIIllllII + lllllllllllllIIlllIlllIlIIlllIIl;
        this.prevPosY = n2;
        this.posY = n2;
        final double n3 = lllllllllllllIIlllIlllIlIIlllIll + lllllllllllllIIlllIlllIlIIlllIII;
        this.prevPosZ = n3;
        this.posZ = n3;
        final float lllllllllllllIIlllIlllIlIIllIlll = this.rand.nextFloat() * 0.6f + 0.4f;
        final float n4 = this.rand.nextFloat() * 0.5f + 0.2f;
        this.particleScale = n4;
        this.field_70565_a = n4;
        final float particleRed = 1.0f * lllllllllllllIIlllIlllIlIIllIlll;
        this.particleBlue = particleRed;
        this.particleGreen = particleRed;
        this.particleRed = particleRed;
        this.particleGreen *= 0.9f;
        this.particleRed *= 0.9f;
        this.particleMaxAge = (int)(Math.random() * 10.0) + EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[0];
        this.noClip = (EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[1] != 0);
        this.setParticleTextureIndex((int)(Math.random() * 26.0 + 1.0 + 224.0));
    }
    
    private static boolean llIIlIIlIlIIIII(final int lllllllllllllIIlllIlllIlIIIIIIII, final int lllllllllllllIIlllIlllIIllllllll) {
        return lllllllllllllIIlllIlllIlIIIIIIII > lllllllllllllIIlllIlllIIllllllll;
    }
    
    @Override
    public int getBrightnessForRender(final float lllllllllllllIIlllIlllIlIIlIIllI) {
        final int lllllllllllllIIlllIlllIlIIlIIlIl = super.getBrightnessForRender(lllllllllllllIIlllIlllIlIIlIIllI);
        float lllllllllllllIIlllIlllIlIIlIIlII = this.particleAge / (float)this.particleMaxAge;
        lllllllllllllIIlllIlllIlIIlIIlII *= lllllllllllllIIlllIlllIlIIlIIlII;
        lllllllllllllIIlllIlllIlIIlIIlII *= lllllllllllllIIlllIlllIlIIlIIlII;
        final int lllllllllllllIIlllIlllIlIIlIIIll = lllllllllllllIIlllIlllIlIIlIIlIl & EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[2];
        int lllllllllllllIIlllIlllIlIIlIIIlI = lllllllllllllIIlllIlllIlIIlIIlIl >> EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[3] & EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[2];
        lllllllllllllIIlllIlllIlIIlIIIlI += (int)(lllllllllllllIIlllIlllIlIIlIIlII * 15.0f * 16.0f);
        if (llIIlIIlIlIIIII(lllllllllllllIIlllIlllIlIIlIIIlI, EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[4])) {
            lllllllllllllIIlllIlllIlIIlIIIlI = EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[4];
        }
        return lllllllllllllIIlllIlllIlIIlIIIll | lllllllllllllIIlllIlllIlIIlIIIlI << EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[3];
    }
    
    @Override
    public float getBrightness(final float lllllllllllllIIlllIlllIlIIIlIllI) {
        final float lllllllllllllIIlllIlllIlIIIlIlIl = super.getBrightness(lllllllllllllIIlllIlllIlIIIlIllI);
        float lllllllllllllIIlllIlllIlIIIlIlII = this.particleAge / (float)this.particleMaxAge;
        lllllllllllllIIlllIlllIlIIIlIlII *= lllllllllllllIIlllIlllIlIIIlIlII;
        lllllllllllllIIlllIlllIlIIIlIlII *= lllllllllllllIIlllIlllIlIIIlIlII;
        return lllllllllllllIIlllIlllIlIIIlIlIl * (1.0f - lllllllllllllIIlllIlllIlIIIlIlII) + lllllllllllllIIlllIlllIlIIIlIlII;
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        float lllllllllllllIIlllIlllIlIIIIlIll = this.particleAge / (float)this.particleMaxAge;
        lllllllllllllIIlllIlllIlIIIIlIll = 1.0f - lllllllllllllIIlllIlllIlIIIIlIll;
        float lllllllllllllIIlllIlllIlIIIIlIlI = 1.0f - lllllllllllllIIlllIlllIlIIIIlIll;
        lllllllllllllIIlllIlllIlIIIIlIlI *= lllllllllllllIIlllIlllIlIIIIlIlI;
        lllllllllllllIIlllIlllIlIIIIlIlI *= lllllllllllllIIlllIlllIlIIIIlIlI;
        this.posX = this.coordX + this.motionX * lllllllllllllIIlllIlllIlIIIIlIll;
        this.posY = this.coordY + this.motionY * lllllllllllllIIlllIlllIlIIIIlIll - lllllllllllllIIlllIlllIlIIIIlIlI * 1.2f;
        this.posZ = this.coordZ + this.motionZ * lllllllllllllIIlllIlllIlIIIIlIll;
        final int particleAge = this.particleAge;
        this.particleAge = particleAge + EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[1];
        if (llIIlIIlIlIIIIl(particleAge, this.particleMaxAge)) {
            this.setDead();
        }
    }
    
    private static void llIIlIIlIIlllll() {
        (lIIlIIIIIlllII = new int[5])[0] = (136 + 136 - 78 + 29 ^ 168 + 181 - 189 + 33);
        EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[1] = " ".length();
        EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[2] = 27 + 237 - 170 + 161;
        EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[3] = (0x1A ^ 0xA);
        EntityEnchantmentTableParticleFX.lIIlIIIIIlllII[4] = 103 + 184 - 98 + 51;
    }
    
    private static boolean llIIlIIlIlIIIIl(final int lllllllllllllIIlllIlllIlIIIIIlII, final int lllllllllllllIIlllIlllIlIIIIIIll) {
        return lllllllllllllIIlllIlllIlIIIIIlII >= lllllllllllllIIlllIlllIlIIIIIIll;
    }
    
    static {
        llIIlIIlIIlllll();
    }
    
    public static class EnchantmentTable implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIllIllIIlIlIIIIIIlII, final World llllllllllllIllIllIIlIIllllllIll, final double llllllllllllIllIllIIlIlIIIIIIIlI, final double llllllllllllIllIllIIlIIllllllIIl, final double llllllllllllIllIllIIlIlIIIIIIIII, final double llllllllllllIllIllIIlIIlllllllll, final double llllllllllllIllIllIIlIIllllllllI, final double llllllllllllIllIllIIlIIlllllllIl, final int... llllllllllllIllIllIIlIIlllllllII) {
            return new EntityEnchantmentTableParticleFX(llllllllllllIllIllIIlIIllllllIll, llllllllllllIllIllIIlIlIIIIIIIlI, llllllllllllIllIllIIlIIllllllIIl, llllllllllllIllIllIIlIlIIIIIIIII, llllllllllllIllIllIIlIIlllllllll, llllllllllllIllIllIIlIIllllllllI, llllllllllllIllIllIIlIIlllllllIl);
        }
    }
}
