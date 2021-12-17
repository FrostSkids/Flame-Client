// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.World;

public class EntityHugeExplodeFX extends EntityFX
{
    private static final /* synthetic */ int[] lIllIlIIlllIlI;
    private /* synthetic */ int maximumTime;
    private /* synthetic */ int timeSinceStart;
    
    protected EntityHugeExplodeFX(final World lllllllllllllIIIIIIIIIlIlIllllII, final double lllllllllllllIIIIIIIIIlIlIlllIll, final double lllllllllllllIIIIIIIIIlIlIlllIlI, final double lllllllllllllIIIIIIIIIlIllIIIIIl, final double lllllllllllllIIIIIIIIIlIllIIIIII, final double lllllllllllllIIIIIIIIIlIlIllllll, final double lllllllllllllIIIIIIIIIlIlIlllllI) {
        super(lllllllllllllIIIIIIIIIlIlIllllII, lllllllllllllIIIIIIIIIlIlIlllIll, lllllllllllllIIIIIIIIIlIlIlllIlI, lllllllllllllIIIIIIIIIlIllIIIIIl, 0.0, 0.0, 0.0);
        this.maximumTime = EntityHugeExplodeFX.lIllIlIIlllIlI[0];
    }
    
    static {
        llllllIIlllIIll();
    }
    
    private static boolean llllllIIlllIlIl(final int lllllllllllllIIIIIIIIIlIlIIlllIl, final int lllllllllllllIIIIIIIIIlIlIIlllII) {
        return lllllllllllllIIIIIIIIIlIlIIlllIl == lllllllllllllIIIIIIIIIlIlIIlllII;
    }
    
    @Override
    public int getFXLayer() {
        return EntityHugeExplodeFX.lIllIlIIlllIlI[3];
    }
    
    @Override
    public void renderParticle(final WorldRenderer lllllllllllllIIIIIIIIIlIlIllIlll, final Entity lllllllllllllIIIIIIIIIlIlIllIllI, final float lllllllllllllIIIIIIIIIlIlIllIlIl, final float lllllllllllllIIIIIIIIIlIlIllIlII, final float lllllllllllllIIIIIIIIIlIlIllIIll, final float lllllllllllllIIIIIIIIIlIlIllIIlI, final float lllllllllllllIIIIIIIIIlIlIllIIIl, final float lllllllllllllIIIIIIIIIlIlIllIIII) {
    }
    
    private static void llllllIIlllIIll() {
        (lIllIlIIlllIlI = new int[4])[0] = (0xB8 ^ 0xB0);
        EntityHugeExplodeFX.lIllIlIIlllIlI[1] = ((223 + 151 - 322 + 193 ^ 72 + 148 - 108 + 61) & (0x22 ^ 0x77 ^ (0x44 ^ 0x49) ^ -" ".length()));
        EntityHugeExplodeFX.lIllIlIIlllIlI[2] = (0x14 ^ 0x12);
        EntityHugeExplodeFX.lIllIlIIlllIlI[3] = " ".length();
    }
    
    private static boolean llllllIIlllIlII(final int lllllllllllllIIIIIIIIIlIlIIllIIl, final int lllllllllllllIIIIIIIIIlIlIIllIII) {
        return lllllllllllllIIIIIIIIIlIlIIllIIl >= lllllllllllllIIIIIIIIIlIlIIllIII;
    }
    
    @Override
    public void onUpdate() {
        int lllllllllllllIIIIIIIIIlIlIlIlIIl = EntityHugeExplodeFX.lIllIlIIlllIlI[1];
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!llllllIIlllIlII(lllllllllllllIIIIIIIIIlIlIlIlIIl, EntityHugeExplodeFX.lIllIlIIlllIlI[2])) {
            final double lllllllllllllIIIIIIIIIlIlIlIlIII = this.posX + (this.rand.nextDouble() - this.rand.nextDouble()) * 4.0;
            final double lllllllllllllIIIIIIIIIlIlIlIIlll = this.posY + (this.rand.nextDouble() - this.rand.nextDouble()) * 4.0;
            final double lllllllllllllIIIIIIIIIlIlIlIIllI = this.posZ + (this.rand.nextDouble() - this.rand.nextDouble()) * 4.0;
            this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_LARGE, lllllllllllllIIIIIIIIIlIlIlIlIII, lllllllllllllIIIIIIIIIlIlIlIIlll, lllllllllllllIIIIIIIIIlIlIlIIllI, this.timeSinceStart / (float)this.maximumTime, 0.0, 0.0, new int[EntityHugeExplodeFX.lIllIlIIlllIlI[1]]);
            ++lllllllllllllIIIIIIIIIlIlIlIlIIl;
        }
        this.timeSinceStart += EntityHugeExplodeFX.lIllIlIIlllIlI[3];
        if (llllllIIlllIlIl(this.timeSinceStart, this.maximumTime)) {
            this.setDead();
        }
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIllIIlIIIIlIlllIIIIl, final World llllllllllllIllIIlIIIIlIlllIIIII, final double llllllllllllIllIIlIIIIlIllIlIlll, final double llllllllllllIllIIlIIIIlIllIllllI, final double llllllllllllIllIIlIIIIlIllIlllIl, final double llllllllllllIllIIlIIIIlIllIlIlII, final double llllllllllllIllIIlIIIIlIllIlIIll, final double llllllllllllIllIIlIIIIlIllIlIIlI, final int... llllllllllllIllIIlIIIIlIllIllIIl) {
            return new EntityHugeExplodeFX(llllllllllllIllIIlIIIIlIlllIIIII, llllllllllllIllIIlIIIIlIllIlIlll, llllllllllllIllIIlIIIIlIllIllllI, llllllllllllIllIIlIIIIlIllIlllIl, llllllllllllIllIIlIIIIlIllIlIlII, llllllllllllIllIIlIIIIlIllIlIIll, llllllllllllIllIIlIIIIlIllIlIIlI);
        }
    }
}
