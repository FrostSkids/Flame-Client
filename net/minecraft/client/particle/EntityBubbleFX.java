// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class EntityBubbleFX extends EntityFX
{
    private static final /* synthetic */ int[] lIIllIIlllIlIl;
    
    private static void llIlIlllllIlIll() {
        (lIIllIIlllIlIl = new int[2])[0] = (0xD ^ 0x2D);
        EntityBubbleFX.lIIllIIlllIlIl[1] = " ".length();
    }
    
    private static boolean llIlIlllllIllIl(final int lllllllllllllIIlIlIlllIlIIllllIl) {
        return lllllllllllllIIlIlIlllIlIIllllIl <= 0;
    }
    
    protected EntityBubbleFX(final World lllllllllllllIIlIlIlllIlIlIlIlII, final double lllllllllllllIIlIlIlllIlIlIIlIll, final double lllllllllllllIIlIlIlllIlIlIlIIlI, final double lllllllllllllIIlIlIlllIlIlIlIIIl, final double lllllllllllllIIlIlIlllIlIlIlIIII, final double lllllllllllllIIlIlIlllIlIlIIIlll, final double lllllllllllllIIlIlIlllIlIlIIIllI) {
        super(lllllllllllllIIlIlIlllIlIlIlIlII, lllllllllllllIIlIlIlllIlIlIIlIll, lllllllllllllIIlIlIlllIlIlIlIIlI, lllllllllllllIIlIlIlllIlIlIlIIIl, lllllllllllllIIlIlIlllIlIlIlIIII, lllllllllllllIIlIlIlllIlIlIIIlll, lllllllllllllIIlIlIlllIlIlIIIllI);
        this.particleRed = 1.0f;
        this.particleGreen = 1.0f;
        this.particleBlue = 1.0f;
        this.setParticleTextureIndex(EntityBubbleFX.lIIllIIlllIlIl[0]);
        this.setSize(0.02f, 0.02f);
        this.particleScale *= this.rand.nextFloat() * 0.6f + 0.2f;
        this.motionX = lllllllllllllIIlIlIlllIlIlIlIIII * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.motionY = lllllllllllllIIlIlIlllIlIlIIIlll * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.motionZ = lllllllllllllIIlIlIlllIlIlIIIllI * 0.20000000298023224 + (Math.random() * 2.0 - 1.0) * 0.019999999552965164;
        this.particleMaxAge = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }
    
    static {
        llIlIlllllIlIll();
    }
    
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY += 0.002;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.8500000238418579;
        this.motionY *= 0.8500000238418579;
        this.motionZ *= 0.8500000238418579;
        if (llIlIlllllIllII(this.worldObj.getBlockState(new BlockPos(this)).getBlock().getMaterial(), Material.water)) {
            this.setDead();
        }
        final int particleMaxAge = this.particleMaxAge;
        this.particleMaxAge = particleMaxAge - EntityBubbleFX.lIIllIIlllIlIl[1];
        if (llIlIlllllIllIl(particleMaxAge)) {
            this.setDead();
        }
    }
    
    private static boolean llIlIlllllIllII(final Object lllllllllllllIIlIlIlllIlIlIIIIII, final Object lllllllllllllIIlIlIlllIlIIllllll) {
        return lllllllllllllIIlIlIlllIlIlIIIIII != lllllllllllllIIlIlIlllIlIIllllll;
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIllIlllllIlIIIllIlIl, final World llllllllllllIllIlllllIlIIIlIllII, final double llllllllllllIllIlllllIlIIIllIIll, final double llllllllllllIllIlllllIlIIIllIIlI, final double llllllllllllIllIlllllIlIIIllIIIl, final double llllllllllllIllIlllllIlIIIllIIII, final double llllllllllllIllIlllllIlIIIlIllll, final double llllllllllllIllIlllllIlIIIlIIllI, final int... llllllllllllIllIlllllIlIIIlIllIl) {
            return new EntityBubbleFX(llllllllllllIllIlllllIlIIIlIllII, llllllllllllIllIlllllIlIIIllIIll, llllllllllllIllIlllllIlIIIllIIlI, llllllllllllIllIlllllIlIIIllIIIl, llllllllllllIllIlllllIlIIIllIIII, llllllllllllIllIlllllIlIIIlIllll, llllllllllllIllIlllllIlIIIlIIllI);
        }
    }
}
