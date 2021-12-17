// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import net.minecraft.entity.DataWatcher;
import net.minecraft.block.Block;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.Explosion;
import net.minecraft.entity.Entity;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EntityWitherSkull extends EntityFireball
{
    private static final /* synthetic */ int[] lIIllllllIlIll;
    private static final /* synthetic */ String[] lIIllllllIlIlI;
    
    static {
        llIlllllIIIlllI();
        llIlllllIIIllIl();
    }
    
    private static String llIlllllIIIllII(final String lllllllllllllIIlIIIllllllllIlIII, final String lllllllllllllIIlIIIllllllllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIllllllllIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIllllllllIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIllllllllIlIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIllllllllIlIlI.init(EntityWitherSkull.lIIllllllIlIll[5], lllllllllllllIIlIIIllllllllIlIll);
            return new String(lllllllllllllIIlIIIllllllllIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIllllllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIllllllllIlIIl) {
            lllllllllllllIIlIIIllllllllIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void onImpact(final MovingObjectPosition lllllllllllllIIlIIlIIIIIIIIIIIIl) {
        if (llIlllllIIlIIII(this.worldObj.isRemote ? 1 : 0)) {
            if (llIlllllIIlIIIl(lllllllllllllIIlIIlIIIIIIIIIIIIl.entityHit)) {
                if (llIlllllIIlIIIl(this.shootingEntity)) {
                    if (llIlllllIIIllll(lllllllllllllIIlIIlIIIIIIIIIIIIl.entityHit.attackEntityFrom(DamageSource.causeMobDamage(this.shootingEntity), 8.0f) ? 1 : 0)) {
                        if (llIlllllIIlIIII(lllllllllllllIIlIIlIIIIIIIIIIIIl.entityHit.isEntityAlive() ? 1 : 0)) {
                            this.shootingEntity.heal(5.0f);
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            this.applyEnchantments(this.shootingEntity, lllllllllllllIIlIIlIIIIIIIIIIIIl.entityHit);
                            "".length();
                            if ("  ".length() < 0) {
                                return;
                            }
                        }
                    }
                }
                else {
                    lllllllllllllIIlIIlIIIIIIIIIIIIl.entityHit.attackEntityFrom(DamageSource.magic, 5.0f);
                    "".length();
                }
                if (llIlllllIIIllll((lllllllllllllIIlIIlIIIIIIIIIIIIl.entityHit instanceof EntityLivingBase) ? 1 : 0)) {
                    int lllllllllllllIIlIIlIIIIIIIIIIIll = EntityWitherSkull.lIIllllllIlIll[0];
                    if (llIlllllIIlIIlI(this.worldObj.getDifficulty(), EnumDifficulty.NORMAL)) {
                        lllllllllllllIIlIIlIIIIIIIIIIIll = EntityWitherSkull.lIIllllllIlIll[1];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else if (llIlllllIIlIIlI(this.worldObj.getDifficulty(), EnumDifficulty.HARD)) {
                        lllllllllllllIIlIIlIIIIIIIIIIIll = EntityWitherSkull.lIIllllllIlIll[2];
                    }
                    if (llIlllllIIlIIll(lllllllllllllIIlIIlIIIIIIIIIIIll)) {
                        ((EntityLivingBase)lllllllllllllIIlIIlIIIIIIIIIIIIl.entityHit).addPotionEffect(new PotionEffect(Potion.wither.id, EntityWitherSkull.lIIllllllIlIll[3] * lllllllllllllIIlIIlIIIIIIIIIIIll, EntityWitherSkull.lIIllllllIlIll[4]));
                    }
                }
            }
            this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 1.0f, (boolean)(EntityWitherSkull.lIIllllllIlIll[0] != 0), this.worldObj.getGameRules().getBoolean(EntityWitherSkull.lIIllllllIlIlI[EntityWitherSkull.lIIllllllIlIll[0]]));
            "".length();
            this.setDead();
        }
    }
    
    @Override
    public boolean isBurning() {
        return EntityWitherSkull.lIIllllllIlIll[0] != 0;
    }
    
    private static boolean llIlllllIIIllll(final int lllllllllllllIIlIIIlllllllIlIlll) {
        return lllllllllllllIIlIIIlllllllIlIlll != 0;
    }
    
    @Override
    protected void entityInit() {
        this.dataWatcher.addObject(EntityWitherSkull.lIIllllllIlIll[1], (byte)EntityWitherSkull.lIIllllllIlIll[0]);
    }
    
    @Override
    public float getExplosionResistance(final Explosion lllllllllllllIIlIIlIIIIIIIIlIlIl, final World lllllllllllllIIlIIlIIIIIIIIIllIl, final BlockPos lllllllllllllIIlIIlIIIIIIIIIllII, final IBlockState lllllllllllllIIlIIlIIIIIIIIlIIlI) {
        float lllllllllllllIIlIIlIIIIIIIIlIIIl = super.getExplosionResistance(lllllllllllllIIlIIlIIIIIIIIlIlIl, lllllllllllllIIlIIlIIIIIIIIIllIl, lllllllllllllIIlIIlIIIIIIIIIllII, lllllllllllllIIlIIlIIIIIIIIlIIlI);
        final Block lllllllllllllIIlIIlIIIIIIIIlIIII = lllllllllllllIIlIIlIIIIIIIIlIIlI.getBlock();
        if (llIlllllIIIllll(this.isInvulnerable() ? 1 : 0) && llIlllllIIIllll(EntityWither.func_181033_a(lllllllllllllIIlIIlIIIIIIIIlIIII) ? 1 : 0)) {
            lllllllllllllIIlIIlIIIIIIIIlIIIl = Math.min(0.8f, lllllllllllllIIlIIlIIIIIIIIlIIIl);
        }
        return lllllllllllllIIlIIlIIIIIIIIlIIIl;
    }
    
    private static void llIlllllIIIllIl() {
        (lIIllllllIlIlI = new String[EntityWitherSkull.lIIllllllIlIll[4]])[EntityWitherSkull.lIIllllllIlIll[0]] = llIlllllIIIllII("zDg1Wt/nLm7NxFgLeIhphw==", "XbxjO");
    }
    
    @Override
    public boolean canBeCollidedWith() {
        return EntityWitherSkull.lIIllllllIlIll[0] != 0;
    }
    
    public boolean isInvulnerable() {
        if (llIlllllIIlIlII(this.dataWatcher.getWatchableObjectByte(EntityWitherSkull.lIIllllllIlIll[1]), EntityWitherSkull.lIIllllllIlIll[4])) {
            return EntityWitherSkull.lIIllllllIlIll[4] != 0;
        }
        return EntityWitherSkull.lIIllllllIlIll[0] != 0;
    }
    
    private static boolean llIlllllIIlIIll(final int lllllllllllllIIlIIIlllllllIlIIll) {
        return lllllllllllllIIlIIIlllllllIlIIll > 0;
    }
    
    private static boolean llIlllllIIlIlII(final int lllllllllllllIIlIIIllllllllIIIII, final int lllllllllllllIIlIIIlllllllIlllll) {
        return lllllllllllllIIlIIIllllllllIIIII == lllllllllllllIIlIIIlllllllIlllll;
    }
    
    private static boolean llIlllllIIlIIII(final int lllllllllllllIIlIIIlllllllIlIlIl) {
        return lllllllllllllIIlIIIlllllllIlIlIl == 0;
    }
    
    private static void llIlllllIIIlllI() {
        (lIIllllllIlIll = new int[6])[0] = ((0x99 ^ 0x8E ^ (0x63 ^ 0x20)) & (0x13 ^ 0x21 ^ (0x3B ^ 0x5D) ^ -" ".length()));
        EntityWitherSkull.lIIllllllIlIll[1] = (0x49 ^ 0x43);
        EntityWitherSkull.lIIllllllIlIll[2] = (0x4D ^ 0x65);
        EntityWitherSkull.lIIllllllIlIll[3] = (0xA5 ^ 0xB1);
        EntityWitherSkull.lIIllllllIlIll[4] = " ".length();
        EntityWitherSkull.lIIllllllIlIll[5] = "  ".length();
    }
    
    public EntityWitherSkull(final World lllllllllllllIIlIIlIIIIIIlIIllII) {
        super(lllllllllllllIIlIIlIIIIIIlIIllII);
        this.setSize(0.3125f, 0.3125f);
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIlIIIlllllllllllIl, final float lllllllllllllIIlIIIlllllllllllII) {
        return EntityWitherSkull.lIIllllllIlIll[0] != 0;
    }
    
    public EntityWitherSkull(final World lllllllllllllIIlIIlIIIIIIIlIllIl, final double lllllllllllllIIlIIlIIIIIIIlIIlII, final double lllllllllllllIIlIIlIIIIIIIlIlIll, final double lllllllllllllIIlIIlIIIIIIIlIIIlI, final double lllllllllllllIIlIIlIIIIIIIlIIIIl, final double lllllllllllllIIlIIlIIIIIIIlIIIII, final double lllllllllllllIIlIIlIIIIIIIlIIlll) {
        super(lllllllllllllIIlIIlIIIIIIIlIllIl, lllllllllllllIIlIIlIIIIIIIlIIlII, lllllllllllllIIlIIlIIIIIIIlIlIll, lllllllllllllIIlIIlIIIIIIIlIIIlI, lllllllllllllIIlIIlIIIIIIIlIIIIl, lllllllllllllIIlIIlIIIIIIIlIIIII, lllllllllllllIIlIIlIIIIIIIlIIlll);
        this.setSize(0.3125f, 0.3125f);
    }
    
    public EntityWitherSkull(final World lllllllllllllIIlIIlIIIIIIlIIIlII, final EntityLivingBase lllllllllllllIIlIIlIIIIIIIllllIl, final double lllllllllllllIIlIIlIIIIIIIllllII, final double lllllllllllllIIlIIlIIIIIIlIIIIIl, final double lllllllllllllIIlIIlIIIIIIlIIIIII) {
        super(lllllllllllllIIlIIlIIIIIIlIIIlII, lllllllllllllIIlIIlIIIIIIIllllIl, lllllllllllllIIlIIlIIIIIIIllllII, lllllllllllllIIlIIlIIIIIIlIIIIIl, lllllllllllllIIlIIlIIIIIIlIIIIII);
        this.setSize(0.3125f, 0.3125f);
    }
    
    private static boolean llIlllllIIlIIIl(final Object lllllllllllllIIlIIIlllllllIlllIl) {
        return lllllllllllllIIlIIIlllllllIlllIl != null;
    }
    
    private static boolean llIlllllIIlIIlI(final Object lllllllllllllIIlIIIlllllllIllIlI, final Object lllllllllllllIIlIIIlllllllIllIIl) {
        return lllllllllllllIIlIIIlllllllIllIlI == lllllllllllllIIlIIIlllllllIllIIl;
    }
    
    public void setInvulnerable(final boolean lllllllllllllIIlIIIlllllllllIIlI) {
        final DataWatcher dataWatcher = this.dataWatcher;
        final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityWitherSkull.lIIllllllIlIll[1];
        int n;
        if (llIlllllIIIllll(lllllllllllllIIlIIIlllllllllIIlI ? 1 : 0)) {
            n = EntityWitherSkull.lIIllllllIlIll[4];
            "".length();
            if (((0x6D ^ 0x76) & ~(0x22 ^ 0x39)) < -" ".length()) {
                return;
            }
        }
        else {
            n = EntityWitherSkull.lIIllllllIlIll[0];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
    }
    
    @Override
    protected float getMotionFactor() {
        float motionFactor;
        if (llIlllllIIIllll(this.isInvulnerable() ? 1 : 0)) {
            motionFactor = 0.73f;
            "".length();
            if (((0x82 ^ 0xAA) & ~(0x31 ^ 0x19)) != ((0x26 ^ 0xD) & ~(0xB0 ^ 0x9B))) {
                return 0.0f;
            }
        }
        else {
            motionFactor = super.getMotionFactor();
        }
        return motionFactor;
    }
}
