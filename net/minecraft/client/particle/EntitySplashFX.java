// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;

public class EntitySplashFX extends EntityRainFX
{
    private static boolean lIIlllIIlIIIllIl(final int llllllllllllIllIIIIlIlllIIllllIl) {
        return llllllllllllIllIIIIlIlllIIllllIl != 0;
    }
    
    protected EntitySplashFX(final World llllllllllllIllIIIIlIlllIlIIIlIl, final double llllllllllllIllIIIIlIlllIlIIllII, final double llllllllllllIllIIIIlIlllIlIIIIll, final double llllllllllllIllIIIIlIlllIlIIIIlI, final double llllllllllllIllIIIIlIlllIlIIlIIl, final double llllllllllllIllIIIIlIlllIlIIlIII, final double llllllllllllIllIIIIlIlllIIllllll) {
        super(llllllllllllIllIIIIlIlllIlIIIlIl, llllllllllllIllIIIIlIlllIlIIllII, llllllllllllIllIIIIlIlllIlIIIIll, llllllllllllIllIIIIlIlllIlIIIIlI);
        this.particleGravity = 0.04f;
        this.nextTextureIndexX();
        if (lIIlllIIlIIIllII(lIIlllIIlIIIlIll(llllllllllllIllIIIIlIlllIlIIlIII, 0.0)) && (!lIIlllIIlIIIllII(lIIlllIIlIIIlIll(llllllllllllIllIIIIlIlllIlIIlIIl, 0.0)) || lIIlllIIlIIIllIl(lIIlllIIlIIIlIll(llllllllllllIllIIIIlIlllIIllllll, 0.0)))) {
            this.motionX = llllllllllllIllIIIIlIlllIlIIlIIl;
            this.motionY = llllllllllllIllIIIIlIlllIlIIlIII + 0.1;
            this.motionZ = llllllllllllIllIIIIlIlllIIllllll;
        }
    }
    
    private static boolean lIIlllIIlIIIllII(final int llllllllllllIllIIIIlIlllIIlllIll) {
        return llllllllllllIllIIIIlIlllIIlllIll == 0;
    }
    
    private static int lIIlllIIlIIIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int lllllllllllllIIlIlIllIlIlIlIlllI, final World lllllllllllllIIlIlIllIlIlIlIIlIl, final double lllllllllllllIIlIlIllIlIlIlIllII, final double lllllllllllllIIlIlIllIlIlIlIlIll, final double lllllllllllllIIlIlIllIlIlIlIIIlI, final double lllllllllllllIIlIlIllIlIlIlIIIIl, final double lllllllllllllIIlIlIllIlIlIlIIIII, final double lllllllllllllIIlIlIllIlIlIlIIlll, final int... lllllllllllllIIlIlIllIlIlIlIIllI) {
            return new EntitySplashFX(lllllllllllllIIlIlIllIlIlIlIIlIl, lllllllllllllIIlIlIllIlIlIlIllII, lllllllllllllIIlIlIllIlIlIlIlIll, lllllllllllllIIlIlIllIlIlIlIIIlI, lllllllllllllIIlIlIllIlIlIlIIIIl, lllllllllllllIIlIlIllIlIlIlIIIII, lllllllllllllIIlIlIllIlIlIlIIlll);
        }
    }
}
