// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import net.minecraft.item.Item;
import net.minecraft.init.Items;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EntityEgg extends EntityThrowable
{
    private static final /* synthetic */ int[] lIlIIIIlIlIIII;
    
    public EntityEgg(final World lllllllllllllIIlIIIIlIIllIlllIIl, final EntityLivingBase lllllllllllllIIlIIIIlIIllIlllIII) {
        super(lllllllllllllIIlIIIIlIIllIlllIIl, lllllllllllllIIlIIIIlIIllIlllIII);
    }
    
    private static boolean lllIIIIlIllIIlI(final int lllllllllllllIIlIIIIlIIllIIlIlIl, final int lllllllllllllIIlIIIIlIIllIIlIlII) {
        return lllllllllllllIIlIIIIlIIllIIlIlIl >= lllllllllllllIIlIIIIlIIllIIlIlII;
    }
    
    @Override
    protected void onImpact(final MovingObjectPosition lllllllllllllIIlIIIIlIIllIIllIll) {
        if (lllIIIIlIllIIII(lllllllllllllIIlIIIIlIIllIIllIll.entityHit)) {
            lllllllllllllIIlIIIIlIIllIIllIll.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 0.0f);
            "".length();
        }
        if (lllIIIIlIllIIIl(this.worldObj.isRemote ? 1 : 0) && lllIIIIlIllIIIl(this.rand.nextInt(EntityEgg.lIlIIIIlIlIIII[0]))) {
            int lllllllllllllIIlIIIIlIIllIlIIIIl = EntityEgg.lIlIIIIlIlIIII[1];
            if (lllIIIIlIllIIIl(this.rand.nextInt(EntityEgg.lIlIIIIlIlIIII[2]))) {
                lllllllllllllIIlIIIIlIIllIlIIIIl = EntityEgg.lIlIIIIlIlIIII[3];
            }
            int lllllllllllllIIlIIIIlIIllIlIIIII = EntityEgg.lIlIIIIlIlIIII[4];
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
            while (!lllIIIIlIllIIlI(lllllllllllllIIlIIIIlIIllIlIIIII, lllllllllllllIIlIIIIlIIllIlIIIIl)) {
                final EntityChicken lllllllllllllIIlIIIIlIIllIIlllll = new EntityChicken(this.worldObj);
                lllllllllllllIIlIIIIlIIllIIlllll.setGrowingAge(EntityEgg.lIlIIIIlIlIIII[5]);
                lllllllllllllIIlIIIIlIIllIIlllll.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0f);
                this.worldObj.spawnEntityInWorld(lllllllllllllIIlIIIIlIIllIIlllll);
                "".length();
                ++lllllllllllllIIlIIIIlIIllIlIIIII;
            }
        }
        final double lllllllllllllIIlIIIIlIIllIIllllI = 0.08;
        int lllllllllllllIIlIIIIlIIllIIlllIl = EntityEgg.lIlIIIIlIlIIII[4];
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!lllIIIIlIllIIlI(lllllllllllllIIlIIIIlIIllIIlllIl, EntityEgg.lIlIIIIlIlIIII[0])) {
            final World worldObj = this.worldObj;
            final EnumParticleTypes item_CRACK = EnumParticleTypes.ITEM_CRACK;
            final double posX = this.posX;
            final double posY = this.posY;
            final double posZ = this.posZ;
            final double lllllllllllllIIIlIIllllIIllIIlIl = (this.rand.nextFloat() - 0.5) * 0.08;
            final double lllllllllllllIIIlIIllllIIllIIlII = (this.rand.nextFloat() - 0.5) * 0.08;
            final double lllllllllllllIIIlIIllllIIlIllIlI = (this.rand.nextFloat() - 0.5) * 0.08;
            final int[] lllllllllllllIIIlIIllllIIlIllIIl = new int[EntityEgg.lIlIIIIlIlIIII[1]];
            lllllllllllllIIIlIIllllIIlIllIIl[EntityEgg.lIlIIIIlIlIIII[4]] = Item.getIdFromItem(Items.egg);
            worldObj.spawnParticle(item_CRACK, posX, posY, posZ, lllllllllllllIIIlIIllllIIllIIlIl, lllllllllllllIIIlIIllllIIllIIlII, lllllllllllllIIIlIIllllIIlIllIlI, lllllllllllllIIIlIIllllIIlIllIIl);
            ++lllllllllllllIIlIIIIlIIllIIlllIl;
        }
        if (lllIIIIlIllIIIl(this.worldObj.isRemote ? 1 : 0)) {
            this.setDead();
        }
    }
    
    private static boolean lllIIIIlIllIIII(final Object lllllllllllllIIlIIIIlIIllIIlIIlI) {
        return lllllllllllllIIlIIIIlIIllIIlIIlI != null;
    }
    
    public EntityEgg(final World lllllllllllllIIlIIIIlIIllIlIllII, final double lllllllllllllIIlIIIIlIIllIllIIII, final double lllllllllllllIIlIIIIlIIllIlIllll, final double lllllllllllllIIlIIIIlIIllIlIlIIl) {
        super(lllllllllllllIIlIIIIlIIllIlIllII, lllllllllllllIIlIIIIlIIllIllIIII, lllllllllllllIIlIIIIlIIllIlIllll, lllllllllllllIIlIIIIlIIllIlIlIIl);
    }
    
    private static boolean lllIIIIlIllIIIl(final int lllllllllllllIIlIIIIlIIllIIlIIII) {
        return lllllllllllllIIlIIIIlIIllIIlIIII == 0;
    }
    
    private static void lllIIIIlIlIllll() {
        (lIlIIIIlIlIIII = new int[6])[0] = (0xAE ^ 0xA6);
        EntityEgg.lIlIIIIlIlIIII[1] = " ".length();
        EntityEgg.lIlIIIIlIlIIII[2] = (0x8C ^ 0xAC);
        EntityEgg.lIlIIIIlIlIIII[3] = (0xC9 ^ 0x97 ^ (0xE2 ^ 0xB8));
        EntityEgg.lIlIIIIlIlIIII[4] = ((0x67 ^ 0x7E) & ~(0x58 ^ 0x41));
        EntityEgg.lIlIIIIlIlIIII[5] = -(-(0x6B ^ 0x53) & (0xFFFFFDF7 & 0x5FFF));
    }
    
    public EntityEgg(final World lllllllllllllIIlIIIIlIIlllIIIIIl) {
        super(lllllllllllllIIlIIIIlIIlllIIIIIl);
    }
    
    static {
        lllIIIIlIlIllll();
    }
}
