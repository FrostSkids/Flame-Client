// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EntityLiving;

public abstract class EntityWaterMob extends EntityLiving implements IAnimals
{
    private static final /* synthetic */ int[] llllIIlIlllll;
    
    @Override
    public void onEntityUpdate() {
        int lllllllllllllIlIlllIIlIlIlIlllll = this.getAir();
        super.onEntityUpdate();
        if (lIlIlIIIlIllIIl(this.isEntityAlive() ? 1 : 0) && lIlIlIIIlIllIlI(this.isInWater() ? 1 : 0)) {
            --lllllllllllllIlIlllIIlIlIlIlllll;
            this.setAir(lllllllllllllIlIlllIIlIlIlIlllll);
            if (lIlIlIIIlIllIll(this.getAir(), EntityWaterMob.llllIIlIlllll[3])) {
                this.setAir(EntityWaterMob.llllIIlIlllll[4]);
                this.attackEntityFrom(DamageSource.drown, 2.0f);
                "".length();
                "".length();
                if (-" ".length() < -" ".length()) {
                    return;
                }
            }
        }
        else {
            this.setAir(EntityWaterMob.llllIIlIlllll[5]);
        }
    }
    
    private static boolean lIlIlIIIlIllIlI(final int lllllllllllllIlIlllIIlIlIlIlIlII) {
        return lllllllllllllIlIlllIIlIlIlIlIlII == 0;
    }
    
    private static boolean lIlIlIIIlIllIIl(final int lllllllllllllIlIlllIIlIlIlIlIllI) {
        return lllllllllllllIlIlllIIlIlIlIlIllI != 0;
    }
    
    private static void lIlIlIIIlIllIII() {
        (llllIIlIlllll = new int[6])[0] = " ".length();
        EntityWaterMob.llllIIlIlllll[1] = (0 + 68 + 64 + 52 ^ 38 + 157 - 70 + 67);
        EntityWaterMob.llllIIlIlllll[2] = "   ".length();
        EntityWaterMob.llllIIlIlllll[3] = -(0xC ^ 0x18);
        EntityWaterMob.llllIIlIlllll[4] = ((0x7D ^ 0x44) & ~(0x8D ^ 0xB4));
        EntityWaterMob.llllIIlIlllll[5] = (-(0xFFFFF9CF & 0x7EF3) & (0xFFFFFDEF & 0x7BFE));
    }
    
    @Override
    public boolean canBreatheUnderwater() {
        return EntityWaterMob.llllIIlIlllll[0] != 0;
    }
    
    static {
        lIlIlIIIlIllIII();
    }
    
    @Override
    public boolean getCanSpawnHere() {
        return EntityWaterMob.llllIIlIlllll[0] != 0;
    }
    
    @Override
    public int getTalkInterval() {
        return EntityWaterMob.llllIIlIlllll[1];
    }
    
    @Override
    public boolean isNotColliding() {
        return this.worldObj.checkNoEntityCollision(this.getEntityBoundingBox(), this);
    }
    
    @Override
    public boolean isPushedByWater() {
        return EntityWaterMob.llllIIlIlllll[4] != 0;
    }
    
    @Override
    protected int getExperiencePoints(final EntityPlayer lllllllllllllIlIlllIIlIlIllIIlII) {
        return EntityWaterMob.llllIIlIlllll[0] + this.worldObj.rand.nextInt(EntityWaterMob.llllIIlIlllll[2]);
    }
    
    private static boolean lIlIlIIIlIllIll(final int lllllllllllllIlIlllIIlIlIlIllIIl, final int lllllllllllllIlIlllIIlIlIlIllIII) {
        return lllllllllllllIlIlllIIlIlIlIllIIl == lllllllllllllIlIlllIIlIlIlIllIII;
    }
    
    @Override
    protected boolean canDespawn() {
        return EntityWaterMob.llllIIlIlllll[0] != 0;
    }
    
    public EntityWaterMob(final World lllllllllllllIlIlllIIlIlIlllIIII) {
        super(lllllllllllllIlIlllIIlIlIlllIIII);
    }
}
