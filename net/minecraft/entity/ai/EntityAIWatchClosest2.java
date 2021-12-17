// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class EntityAIWatchClosest2 extends EntityAIWatchClosest
{
    private static final /* synthetic */ int[] llIlIIIlllIIlI;
    
    private static void lIIlIIlIIIlIIllI() {
        (llIlIIIlllIIlI = new int[1])[0] = "   ".length();
    }
    
    static {
        lIIlIIlIIIlIIllI();
    }
    
    public EntityAIWatchClosest2(final EntityLiving llllllllllllIllIllIIlIllIlllIIIl, final Class<? extends Entity> llllllllllllIllIllIIlIllIllIlIll, final float llllllllllllIllIllIIlIllIllIlIlI, final float llllllllllllIllIllIIlIllIllIlIIl) {
        super(llllllllllllIllIllIIlIllIlllIIIl, llllllllllllIllIllIIlIllIllIlIll, llllllllllllIllIllIIlIllIllIlIlI, llllllllllllIllIllIIlIllIllIlIIl);
        this.setMutexBits(EntityAIWatchClosest2.llIlIIIlllIIlI[0]);
    }
}
