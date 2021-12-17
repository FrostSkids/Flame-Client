// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.minecraft.entity.projectile.EntityThrowable;

public class EntityExpBottle extends EntityThrowable
{
    private static final /* synthetic */ int[] lIlllIIllIlIII;
    
    private static boolean lIIIIIlIIIIIIIII(final int llllllllllllIlllllIIllIllIIIIlll) {
        return llllllllllllIlllllIIllIllIIIIlll == 0;
    }
    
    public EntityExpBottle(final World llllllllllllIlllllIIllIllIlIlIIl, final EntityLivingBase llllllllllllIlllllIIllIllIlIlIII) {
        super(llllllllllllIlllllIIllIllIlIlIIl, llllllllllllIlllllIIllIllIlIlIII);
    }
    
    public EntityExpBottle(final World llllllllllllIlllllIIllIllIIllllI, final double llllllllllllIlllllIIllIllIIlllIl, final double llllllllllllIlllllIIllIllIIlllII, final double llllllllllllIlllllIIllIllIIllIll) {
        super(llllllllllllIlllllIIllIllIIllllI, llllllllllllIlllllIIllIllIIlllIl, llllllllllllIlllllIIllIllIIlllII, llllllllllllIlllllIIllIllIIllIll);
    }
    
    static {
        lIIIIIIllllllllI();
    }
    
    @Override
    protected float getInaccuracy() {
        return -20.0f;
    }
    
    private static boolean lIIIIIlIIIIIIIll(final int llllllllllllIlllllIIllIllIIIIlIl) {
        return llllllllllllIlllllIIllIllIIIIlIl <= 0;
    }
    
    @Override
    protected float getGravityVelocity() {
        return 0.07f;
    }
    
    public EntityExpBottle(final World llllllllllllIlllllIIllIllIlIlllI) {
        super(llllllllllllIlllllIIllIllIlIlllI);
    }
    
    private static void lIIIIIIllllllllI() {
        (lIlllIIllIlIII = new int[4])[0] = (-(0xFFFFA09F & 0x7F69) & (0xFFFFFFFB & 0x27DE));
        EntityExpBottle.lIlllIIllIlIII[1] = ((0xEC ^ 0x87 ^ (0x6F ^ 0x25)) & (0xCD ^ 0xAE ^ (0x74 ^ 0x36) ^ -" ".length()));
        EntityExpBottle.lIlllIIllIlIII[2] = "   ".length();
        EntityExpBottle.lIlllIIllIlIII[3] = (84 + 128 - 127 + 66 ^ 114 + 53 - 57 + 36);
    }
    
    @Override
    protected void onImpact(final MovingObjectPosition llllllllllllIlllllIIllIllIIIlllI) {
        if (lIIIIIlIIIIIIIII(this.worldObj.isRemote ? 1 : 0)) {
            this.worldObj.playAuxSFX(EntityExpBottle.lIlllIIllIlIII[0], new BlockPos(this), EntityExpBottle.lIlllIIllIlIII[1]);
            int llllllllllllIlllllIIllIllIIIllIl = EntityExpBottle.lIlllIIllIlIII[2] + this.worldObj.rand.nextInt(EntityExpBottle.lIlllIIllIlIII[3]) + this.worldObj.rand.nextInt(EntityExpBottle.lIlllIIllIlIII[3]);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!lIIIIIlIIIIIIIll(llllllllllllIlllllIIllIllIIIllIl)) {
                final int llllllllllllIlllllIIllIllIIIllII = EntityXPOrb.getXPSplit(llllllllllllIlllllIIllIllIIIllIl);
                llllllllllllIlllllIIllIllIIIllIl -= llllllllllllIlllllIIllIllIIIllII;
                this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, llllllllllllIlllllIIllIllIIIllII));
                "".length();
            }
            this.setDead();
        }
    }
    
    @Override
    protected float getVelocity() {
        return 0.7f;
    }
}
