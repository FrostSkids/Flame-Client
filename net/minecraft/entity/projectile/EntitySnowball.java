// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EntitySnowball extends EntityThrowable
{
    private static final /* synthetic */ int[] lIllIllIllIIII;
    
    private static boolean lllllllllIIlIII(final Object llllllllllllIllllllIllIIlIIlIllI) {
        return llllllllllllIllllllIllIIlIIlIllI != null;
    }
    
    private static boolean lllllllllIIlIlI(final int llllllllllllIllllllIllIIlIIllIIl, final int llllllllllllIllllllIllIIlIIllIII) {
        return llllllllllllIllllllIllIIlIIllIIl >= llllllllllllIllllllIllIIlIIllIII;
    }
    
    private static void lllllllllIIIlll() {
        (lIllIllIllIIII = new int[3])[0] = ((0x82 ^ 0xB4) & ~(0x99 ^ 0xAF));
        EntitySnowball.lIllIllIllIIII[1] = "   ".length();
        EntitySnowball.lIllIllIllIIII[2] = (0 + 2 + 63 + 111 ^ 101 + 29 - 79 + 133);
    }
    
    public EntitySnowball(final World llllllllllllIllllllIllIIllIIIIII) {
        super(llllllllllllIllllllIllIIllIIIIII);
    }
    
    private static boolean lllllllllIIlIll(final int llllllllllllIllllllIllIIlIIlIIlI) {
        return llllllllllllIllllllIllIIlIIlIIlI == 0;
    }
    
    static {
        lllllllllIIIlll();
    }
    
    private static boolean lllllllllIIlIIl(final int llllllllllllIllllllIllIIlIIlIlII) {
        return llllllllllllIllllllIllIIlIIlIlII != 0;
    }
    
    public EntitySnowball(final World llllllllllllIllllllIllIIlIllIllI, final EntityLivingBase llllllllllllIllllllIllIIlIlllIII) {
        super(llllllllllllIllllllIllIIlIllIllI, llllllllllllIllllllIllIIlIlllIII);
    }
    
    public EntitySnowball(final World llllllllllllIllllllIllIIlIlIlllI, final double llllllllllllIllllllIllIIlIlIllIl, final double llllllllllllIllllllIllIIlIlIllII, final double llllllllllllIllllllIllIIlIlIlIll) {
        super(llllllllllllIllllllIllIIlIlIlllI, llllllllllllIllllllIllIIlIlIllIl, llllllllllllIllllllIllIIlIlIllII, llllllllllllIllllllIllIIlIlIlIll);
    }
    
    @Override
    protected void onImpact(final MovingObjectPosition llllllllllllIllllllIllIIlIlIIIIl) {
        if (lllllllllIIlIII(llllllllllllIllllllIllIIlIlIIIIl.entityHit)) {
            int llllllllllllIllllllIllIIlIlIIIII = EntitySnowball.lIllIllIllIIII[0];
            if (lllllllllIIlIIl((llllllllllllIllllllIllIIlIlIIIIl.entityHit instanceof EntityBlaze) ? 1 : 0)) {
                llllllllllllIllllllIllIIlIlIIIII = EntitySnowball.lIllIllIllIIII[1];
            }
            llllllllllllIllllllIllIIlIlIIIIl.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), (float)llllllllllllIllllllIllIIlIlIIIII);
            "".length();
        }
        int llllllllllllIllllllIllIIlIIlllll = EntitySnowball.lIllIllIllIIII[0];
        "".length();
        if ((0x13 ^ 0x16) == 0x0) {
            return;
        }
        while (!lllllllllIIlIlI(llllllllllllIllllllIllIIlIIlllll, EntitySnowball.lIllIllIllIIII[2])) {
            this.worldObj.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0, new int[EntitySnowball.lIllIllIllIIII[0]]);
            ++llllllllllllIllllllIllIIlIIlllll;
        }
        if (lllllllllIIlIll(this.worldObj.isRemote ? 1 : 0)) {
            this.setDead();
        }
    }
}
