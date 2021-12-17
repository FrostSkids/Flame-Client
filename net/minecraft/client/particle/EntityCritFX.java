// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.particle;

import net.minecraft.world.World;

public class EntityCritFX extends EntitySmokeFX
{
    protected EntityCritFX(final World llllllllllllIlllIllIllllIlIIlIll, final double llllllllllllIlllIllIllllIlIIlIlI, final double llllllllllllIlllIllIllllIlIlIIIl, final double llllllllllllIlllIllIllllIlIIlIII, final double llllllllllllIlllIllIllllIlIIllll, final double llllllllllllIlllIllIllllIlIIlllI, final double llllllllllllIlllIllIllllIlIIIlIl) {
        super(llllllllllllIlllIllIllllIlIIlIll, llllllllllllIlllIllIllllIlIIlIlI, llllllllllllIlllIllIllllIlIlIIIl, llllllllllllIlllIllIllllIlIIlIII, llllllllllllIlllIllIllllIlIIllll, llllllllllllIlllIllIllllIlIIlllI, llllllllllllIlllIllIllllIlIIIlIl, 2.5f);
    }
    
    public static class Factory implements IParticleFactory
    {
        @Override
        public EntityFX getEntityFX(final int llllllllllllIllIllIIlllIlllIlIll, final World llllllllllllIllIllIIlllIlllIlIlI, final double llllllllllllIllIllIIlllIlllIlIIl, final double llllllllllllIllIllIIlllIlllIIIII, final double llllllllllllIllIllIIlllIllIlllll, final double llllllllllllIllIllIIlllIlllIIllI, final double llllllllllllIllIllIIlllIlllIIlIl, final double llllllllllllIllIllIIlllIllIlllII, final int... llllllllllllIllIllIIlllIlllIIIll) {
            return new EntityCritFX(llllllllllllIllIllIIlllIlllIlIlI, llllllllllllIllIllIIlllIlllIlIIl, llllllllllllIllIllIIlllIlllIIIII, llllllllllllIllIllIIlllIllIlllll, llllllllllllIllIllIIlllIlllIIllI, llllllllllllIllIllIIlllIlllIIlIl, llllllllllllIllIllIIlllIllIlllII);
        }
    }
}
