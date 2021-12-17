// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.EnumParticleTypes;

public class EntityParticleEmitter extends EntityFX
{
    private /* synthetic */ EnumParticleTypes particleTypes;
    private /* synthetic */ int age;
    private static final /* synthetic */ int[] lIllIIIlIIIIIl;
    private /* synthetic */ int lifetime;
    private /* synthetic */ Entity attachedEntity;
    
    private static boolean llllIlllIlllIlI(final int lllllllllllllIIIIIlllIIIIllIlIll, final int lllllllllllllIIIIIlllIIIIllIlIlI) {
        return lllllllllllllIIIIIlllIIIIllIlIll >= lllllllllllllIIIIIlllIIIIllIlIlI;
    }
    
    private static boolean llllIlllIlllIIl(final int lllllllllllllIIIIIlllIIIIllIlIII) {
        return lllllllllllllIIIIIlllIIIIllIlIII <= 0;
    }
    
    @Override
    public int getFXLayer() {
        return EntityParticleEmitter.lIllIIIlIIIIIl[0];
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIIIIIlllIIIlIIllIll, final Entity lllllllllllllIIIIIlllIIIlIIllIlI, final float lllllllllllllIIIIIlllIIIlIIllIIl, final float lllllllllllllIIIIIlllIIIlIIlIlll, final float lllllllllllllIIIIIlllIIIlIIlIlIl, final float lllllllllllllIIIIIlllIIIlIIlIlII, final float lllllllllllllIIIIIlllIIIlIIlIIlI, final float lllllllllllllIIIIIlllIIIlIIlIIIl) {
    }
    
    @Override
    public void onUpdate() {
        int lllllllllllllIIIIIlllIIIIlllllIl = EntityParticleEmitter.lIllIIIlIIIIIl[1];
        "".length();
        if ((0x39 ^ 0x24 ^ (0x4C ^ 0x54)) == 0x0) {
            return;
        }
        while (!llllIlllIlllIlI(lllllllllllllIIIIIlllIIIIlllllIl, EntityParticleEmitter.lIllIIIlIIIIIl[2])) {
            final double lllllllllllllIIIIIlllIIIIlllllII = this.rand.nextFloat() * 2.0f - 1.0f;
            final double lllllllllllllIIIIIlllIIIIllllIll = this.rand.nextFloat() * 2.0f - 1.0f;
            final double lllllllllllllIIIIIlllIIIIllllIlI = this.rand.nextFloat() * 2.0f - 1.0f;
            if (llllIlllIlllIIl(llllIlllIlllIII(lllllllllllllIIIIIlllIIIIlllllII * lllllllllllllIIIIIlllIIIIlllllII + lllllllllllllIIIIIlllIIIIllllIll * lllllllllllllIIIIIlllIIIIllllIll + lllllllllllllIIIIIlllIIIIllllIlI * lllllllllllllIIIIIlllIIIIllllIlI, 1.0))) {
                final double lllllllllllllIIIIIlllIIIIllllIIl = this.attachedEntity.posX + lllllllllllllIIIIIlllIIIIlllllII * this.attachedEntity.width / 4.0;
                final double lllllllllllllIIIIIlllIIIIllllIII = this.attachedEntity.getEntityBoundingBox().minY + this.attachedEntity.height / 2.0f + lllllllllllllIIIIIlllIIIIllllIll * this.attachedEntity.height / 4.0;
                final double lllllllllllllIIIIIlllIIIIlllIlll = this.attachedEntity.posZ + lllllllllllllIIIIIlllIIIIllllIlI * this.attachedEntity.width / 4.0;
                this.worldObj.spawnParticle(this.particleTypes, (boolean)(EntityParticleEmitter.lIllIIIlIIIIIl[1] != 0), lllllllllllllIIIIIlllIIIIllllIIl, lllllllllllllIIIIIlllIIIIllllIII, lllllllllllllIIIIIlllIIIIlllIlll, lllllllllllllIIIIIlllIIIIlllllII, lllllllllllllIIIIIlllIIIIllllIll + 0.2, lllllllllllllIIIIIlllIIIIllllIlI, new int[EntityParticleEmitter.lIllIIIlIIIIIl[1]]);
            }
            ++lllllllllllllIIIIIlllIIIIlllllIl;
        }
        this.age += EntityParticleEmitter.lIllIIIlIIIIIl[3];
        if (llllIlllIlllIlI(this.age, this.lifetime)) {
            this.setDead();
        }
    }
    
    public EntityParticleEmitter(final World lllllllllllllIIIIIlllIIIlIlIIIIl, final Entity lllllllllllllIIIIIlllIIIlIlIIlII, final EnumParticleTypes lllllllllllllIIIIIlllIIIlIlIIIll) {
        super(lllllllllllllIIIIIlllIIIlIlIIIIl, lllllllllllllIIIIIlllIIIlIlIIlII.posX, lllllllllllllIIIIIlllIIIlIlIIlII.getEntityBoundingBox().minY + lllllllllllllIIIIIlllIIIlIlIIlII.height / 2.0f, lllllllllllllIIIIIlllIIIlIlIIlII.posZ, lllllllllllllIIIIIlllIIIlIlIIlII.motionX, lllllllllllllIIIIIlllIIIlIlIIlII.motionY, lllllllllllllIIIIIlllIIIlIlIIlII.motionZ);
        this.attachedEntity = lllllllllllllIIIIIlllIIIlIlIIlII;
        this.lifetime = EntityParticleEmitter.lIllIIIlIIIIIl[0];
        this.particleTypes = lllllllllllllIIIIIlllIIIlIlIIIll;
        this.onUpdate();
    }
    
    private static void llllIlllIllIllI() {
        (lIllIIIlIIIIIl = new int[4])[0] = "   ".length();
        EntityParticleEmitter.lIllIIIlIIIIIl[1] = ((17 + 147 - 42 + 57 ^ 28 + 103 - 10 + 27) & (122 + 104 - 200 + 110 ^ 45 + 107 - 65 + 88 ^ -" ".length()));
        EntityParticleEmitter.lIllIIIlIIIIIl[2] = (0x19 ^ 0x9);
        EntityParticleEmitter.lIllIIIlIIIIIl[3] = " ".length();
    }
    
    private static int llllIlllIlllIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    static {
        llllIlllIllIllI();
    }
}
