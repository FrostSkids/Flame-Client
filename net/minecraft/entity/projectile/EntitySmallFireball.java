// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.projectile;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

public class EntitySmallFireball extends EntityFireball
{
    private static final /* synthetic */ int[] lllIlllllIllll;
    private static final /* synthetic */ String[] lllIlllllIllIl;
    
    @Override
    public boolean canBeCollidedWith() {
        return EntitySmallFireball.lllIlllllIllll[2] != 0;
    }
    
    public EntitySmallFireball(final World llllllllllllIlIlIlllllIIIlllIllI) {
        super(llllllllllllIlIlIlllllIIIlllIllI);
        this.setSize(0.3125f, 0.3125f);
    }
    
    private static void lIlIIllIIIllIlIl() {
        (lllIlllllIllll = new int[4])[0] = (0x4 ^ 0x1);
        EntitySmallFireball.lllIlllllIllll[1] = " ".length();
        EntitySmallFireball.lllIlllllIllll[2] = ((86 + 236 - 303 + 228 ^ 112 + 130 - 73 + 14) & (0x7 ^ 0x3E ^ (0x7A ^ 0x3) ^ -" ".length()));
        EntitySmallFireball.lllIlllllIllll[3] = "  ".length();
    }
    
    public EntitySmallFireball(final World llllllllllllIlIlIlllllIIIllIllII, final EntityLivingBase llllllllllllIlIlIlllllIIIllIlIll, final double llllllllllllIlIlIlllllIIIllIlIlI, final double llllllllllllIlIlIlllllIIIllIIIll, final double llllllllllllIlIlIlllllIIIllIlIII) {
        super(llllllllllllIlIlIlllllIIIllIllII, llllllllllllIlIlIlllllIIIllIlIll, llllllllllllIlIlIlllllIIIllIlIlI, llllllllllllIlIlIlllllIIIllIIIll, llllllllllllIlIlIlllllIIIllIlIII);
        this.setSize(0.3125f, 0.3125f);
    }
    
    private static boolean lIlIIllIIIllIllI(final int llllllllllllIlIlIlllllIIIIlIIllI) {
        return llllllllllllIlIlIlllllIIIIlIIllI == 0;
    }
    
    @Override
    protected void onImpact(final MovingObjectPosition llllllllllllIlIlIlllllIIIIllllll) {
        if (lIlIIllIIIllIllI(this.worldObj.isRemote ? 1 : 0)) {
            if (lIlIIllIIIllIlll(llllllllllllIlIlIlllllIIIIllllll.entityHit)) {
                final boolean llllllllllllIlIlIlllllIIIlIIIIll = llllllllllllIlIlIlllllIIIIllllll.entityHit.attackEntityFrom(DamageSource.causeFireballDamage(this, this.shootingEntity), 5.0f);
                if (lIlIIllIIIlllIII(llllllllllllIlIlIlllllIIIlIIIIll ? 1 : 0)) {
                    this.applyEnchantments(this.shootingEntity, llllllllllllIlIlIlllllIIIIllllll.entityHit);
                    if (lIlIIllIIIllIllI(llllllllllllIlIlIlllllIIIIllllll.entityHit.isImmuneToFire() ? 1 : 0)) {
                        llllllllllllIlIlIlllllIIIIllllll.entityHit.setFire(EntitySmallFireball.lllIlllllIllll[0]);
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                    }
                }
            }
            else {
                boolean llllllllllllIlIlIlllllIIIlIIIIlI = EntitySmallFireball.lllIlllllIllll[1] != 0;
                if (lIlIIllIIIllIlll(this.shootingEntity) && lIlIIllIIIlllIII((this.shootingEntity instanceof EntityLiving) ? 1 : 0)) {
                    llllllllllllIlIlIlllllIIIlIIIIlI = this.worldObj.getGameRules().getBoolean(EntitySmallFireball.lllIlllllIllIl[EntitySmallFireball.lllIlllllIllll[2]]);
                }
                if (lIlIIllIIIlllIII(llllllllllllIlIlIlllllIIIlIIIIlI ? 1 : 0)) {
                    final BlockPos llllllllllllIlIlIlllllIIIlIIIIIl = llllllllllllIlIlIlllllIIIIllllll.getBlockPos().offset(llllllllllllIlIlIlllllIIIIllllll.sideHit);
                    if (lIlIIllIIIlllIII(this.worldObj.isAirBlock(llllllllllllIlIlIlllllIIIlIIIIIl) ? 1 : 0)) {
                        this.worldObj.setBlockState(llllllllllllIlIlIlllllIIIlIIIIIl, Blocks.fire.getDefaultState());
                        "".length();
                    }
                }
            }
            this.setDead();
        }
    }
    
    static {
        lIlIIllIIIllIlIl();
        lIlIIllIIIllIIIl();
    }
    
    private static boolean lIlIIllIIIlllIII(final int llllllllllllIlIlIlllllIIIIlIlIII) {
        return llllllllllllIlIlIlllllIIIIlIlIII != 0;
    }
    
    private static void lIlIIllIIIllIIIl() {
        (lllIlllllIllIl = new String[EntitySmallFireball.lllIlllllIllll[1]])[EntitySmallFireball.lllIlllllIllll[2]] = lIlIIllIIIlIllll("Z+IAgE4rH55uKAMsUh7ftw==", "obizO");
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlIlIlllllIIIIlllIlI, final float llllllllllllIlIlIlllllIIIIlllIIl) {
        return EntitySmallFireball.lllIlllllIllll[2] != 0;
    }
    
    private static String lIlIIllIIIlIllll(final String llllllllllllIlIlIlllllIIIIlIllll, final String llllllllllllIlIlIlllllIIIIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIlIlIlllllIIIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIlllllIIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlIlllllIIIIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlIlllllIIIIllIIll.init(EntitySmallFireball.lllIlllllIllll[3], llllllllllllIlIlIlllllIIIIllIlII);
            return new String(llllllllllllIlIlIlllllIIIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIlllllIIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIlllllIIIIllIIlI) {
            llllllllllllIlIlIlllllIIIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIllIIIllIlll(final Object llllllllllllIlIlIlllllIIIIlIlIlI) {
        return llllllllllllIlIlIlllllIIIIlIlIlI != null;
    }
    
    public EntitySmallFireball(final World llllllllllllIlIlIlllllIIIlIlIIII, final double llllllllllllIlIlIlllllIIIlIIllll, final double llllllllllllIlIlIlllllIIIlIIlllI, final double llllllllllllIlIlIlllllIIIlIlIlIl, final double llllllllllllIlIlIlllllIIIlIIllII, final double llllllllllllIlIlIlllllIIIlIIlIll, final double llllllllllllIlIlIlllllIIIlIIlIlI) {
        super(llllllllllllIlIlIlllllIIIlIlIIII, llllllllllllIlIlIlllllIIIlIIllll, llllllllllllIlIlIlllllIIIlIIlllI, llllllllllllIlIlIlllllIIIlIlIlIl, llllllllllllIlIlIlllllIIIlIIllII, llllllllllllIlIlIlllllIIIlIIlIll, llllllllllllIlIlIlllllIIIlIIlIlI);
        this.setSize(0.3125f, 0.3125f);
    }
}
