// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;

public class EntityAuraFX extends EntityFX
{
    private static final /* synthetic */ int[] lIlIIIllIIIIII;
    
    static {
        lllIIIllIllIIII();
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.99;
        this.motionY *= 0.99;
        this.motionZ *= 0.99;
        final int particleMaxAge = this.particleMaxAge;
        this.particleMaxAge = particleMaxAge - EntityAuraFX.lIlIIIllIIIIII[1];
        if (lllIIIllIllIIIl(particleMaxAge)) {
            this.setDead();
        }
    }
    
    private static boolean lllIIIllIllIIIl(final int lllllllllllllIIIllllIllIlIlllIIl) {
        return lllllllllllllIIIllllIllIlIlllIIl <= 0;
    }
    
    private static void lllIIIllIllIIII() {
        (lIlIIIllIIIIII = new int[2])[0] = ((0x96 ^ 0xBB) & ~(0x6F ^ 0x42));
        EntityAuraFX.lIlIIIllIIIIII[1] = " ".length();
    }
    
    protected EntityAuraFX(final World lllllllllllllIIIllllIllIllIllIlI, final double lllllllllllllIIIllllIllIllIllIII, final double lllllllllllllIIIllllIllIllIIlIlI, final double lllllllllllllIIIllllIllIllIIlIII, final double lllllllllllllIIIllllIllIllIIIllI, final double lllllllllllllIIIllllIllIllIIIlIl, final double lllllllllllllIIIllllIllIllIlIIIl) {
        super(lllllllllllllIIIllllIllIllIllIlI, lllllllllllllIIIllllIllIllIllIII, lllllllllllllIIIllllIllIllIIlIlI, lllllllllllllIIIllllIllIllIIlIII, lllllllllllllIIIllllIllIllIIIllI, lllllllllllllIIIllllIllIllIIIlIl, lllllllllllllIIIllllIllIllIlIIIl);
        final float lllllllllllllIIIllllIllIllIlIIII = this.rand.nextFloat() * 0.1f + 0.2f;
        this.particleRed = lllllllllllllIIIllllIllIllIlIIII;
        this.particleGreen = lllllllllllllIIIllllIllIllIlIIII;
        this.particleBlue = lllllllllllllIIIllllIllIllIlIIII;
        this.setParticleTextureIndex(EntityAuraFX.lIlIIIllIIIIII[0]);
        this.setSize(0.02f, 0.02f);
        this.particleScale *= this.rand.nextFloat() * 0.6f + 0.5f;
        this.motionX *= 0.019999999552965164;
        this.motionY *= 0.019999999552965164;
        this.motionZ *= 0.019999999552965164;
        this.particleMaxAge = (int)(20.0 / (Math.random() * 0.8 + 0.2));
        this.noClip = (EntityAuraFX.lIlIIIllIIIIII[1] != 0);
    }
    
    public static class HappyVillagerFactory implements IParticleFactory
    {
        private static final /* synthetic */ int[] lllIlIlIIlllIl;
        
        static {
            lIlIIIlIlllIllll();
        }
        
        private static void lIlIIIlIlllIllll() {
            (lllIlIlIIlllIl = new int[1])[0] = (0xEC ^ 0xBE);
        }
        
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlIllIllIIlllIIlIlll, final World llllllllllllIlIllIllIIlllIIIllII, final double llllllllllllIlIllIllIIlllIIlIlIl, final double llllllllllllIlIllIllIIlllIIlIlII, final double llllllllllllIlIllIllIIlllIIIlIIl, final double llllllllllllIlIllIllIIlllIIlIIlI, final double llllllllllllIlIllIllIIlllIIlIIIl, final double llllllllllllIlIllIllIIlllIIIIllI, final int... llllllllllllIlIllIllIIlllIIIllll) {
            final EntityFX llllllllllllIlIllIllIIlllIIIlllI = new EntityAuraFX(llllllllllllIlIllIllIIlllIIIllII, llllllllllllIlIllIllIIlllIIlIlIl, llllllllllllIlIllIllIIlllIIlIlII, llllllllllllIlIllIllIIlllIIIlIIl, llllllllllllIlIllIllIIlllIIlIIlI, llllllllllllIlIllIllIIlllIIlIIIl, llllllllllllIlIllIllIIlllIIIIllI);
            llllllllllllIlIllIllIIlllIIIlllI.setParticleTextureIndex(HappyVillagerFactory.lllIlIlIIlllIl[0]);
            llllllllllllIlIllIllIIlllIIIlllI.setRBGColorF(1.0f, 1.0f, 1.0f);
            return llllllllllllIlIllIllIIlllIIIlllI;
        }
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIlIlIlllllIIllIlIIlI, final World llllllllllllIlIlIlllllIIllIlIIII, final double llllllllllllIlIlIlllllIIllIIIIII, final double llllllllllllIlIlIlllllIIlIllllll, final double llllllllllllIlIlIlllllIIllIIlIll, final double llllllllllllIlIlIlllllIIllIIlIIl, final double llllllllllllIlIlIlllllIIlIlllIlI, final double llllllllllllIlIlIlllllIIlIlllIIl, final int... llllllllllllIlIlIlllllIIllIIIlII) {
            return new EntityAuraFX(llllllllllllIlIlIlllllIIllIlIIII, llllllllllllIlIlIlllllIIllIIIIII, llllllllllllIlIlIlllllIIlIllllll, llllllllllllIlIlIlllllIIllIIlIll, llllllllllllIlIlIlllllIIllIIlIIl, llllllllllllIlIlIlllllIIlIlllIlI, llllllllllllIlIlIlllllIIlIlllIIl);
        }
    }
}
