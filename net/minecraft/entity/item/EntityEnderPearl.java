// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;

public class EntityEnderPearl extends EntityThrowable
{
    private /* synthetic */ EntityLivingBase field_181555_c;
    private static final /* synthetic */ int[] lIIIlllIIlllIl;
    private static final /* synthetic */ String[] lIIIlllIIlIlII;
    
    @Override
    protected void onImpact(final MovingObjectPosition lllllllllllllIIlllllIIlIlIllllll) {
        final EntityLivingBase lllllllllllllIIlllllIIlIlIlllllI = this.getThrower();
        if (llIIIllIIllIIII(lllllllllllllIIlllllIIlIlIllllll.entityHit)) {
            if (llIIIllIIllIIIl(lllllllllllllIIlllllIIlIlIllllll.entityHit, this.field_181555_c)) {
                return;
            }
            lllllllllllllIIlllllIIlIlIllllll.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, lllllllllllllIIlllllIIlIlIlllllI), 0.0f);
            "".length();
        }
        int lllllllllllllIIlllllIIlIlIllllIl = EntityEnderPearl.lIIIlllIIlllIl[0];
        "".length();
        if ((0x31 ^ 0x34) == 0x0) {
            return;
        }
        while (!llIIIllIIllIIlI(lllllllllllllIIlllllIIlIlIllllIl, EntityEnderPearl.lIIIlllIIlllIl[1])) {
            this.worldObj.spawnParticle(EnumParticleTypes.PORTAL, this.posX, this.posY + this.rand.nextDouble() * 2.0, this.posZ, this.rand.nextGaussian(), 0.0, this.rand.nextGaussian(), new int[EntityEnderPearl.lIIIlllIIlllIl[0]]);
            ++lllllllllllllIIlllllIIlIlIllllIl;
        }
        if (llIIIllIIllIIll(this.worldObj.isRemote ? 1 : 0)) {
            if (llIIIllIIllIlII((lllllllllllllIIlllllIIlIlIlllllI instanceof EntityPlayerMP) ? 1 : 0)) {
                final EntityPlayerMP lllllllllllllIIlllllIIlIlIllllII = (EntityPlayerMP)lllllllllllllIIlllllIIlIlIlllllI;
                if (llIIIllIIllIlII(lllllllllllllIIlllllIIlIlIllllII.playerNetServerHandler.getNetworkManager().isChannelOpen() ? 1 : 0) && llIIIllIIllIIIl(lllllllllllllIIlllllIIlIlIllllII.worldObj, this.worldObj) && llIIIllIIllIIll(lllllllllllllIIlllllIIlIlIllllII.isPlayerSleeping() ? 1 : 0)) {
                    if (llIIIllIIllIlIl(llIIIllIIlIllll(this.rand.nextFloat(), 0.05f)) && llIIIllIIllIlII(this.worldObj.getGameRules().getBoolean(EntityEnderPearl.lIIIlllIIlIlII[EntityEnderPearl.lIIIlllIIlllIl[0]]) ? 1 : 0)) {
                        final EntityEndermite lllllllllllllIIlllllIIlIlIlllIll = new EntityEndermite(this.worldObj);
                        lllllllllllllIIlllllIIlIlIlllIll.setSpawnedByPlayer((boolean)(EntityEnderPearl.lIIIlllIIlllIl[2] != 0));
                        lllllllllllllIIlllllIIlIlIlllIll.setLocationAndAngles(lllllllllllllIIlllllIIlIlIlllllI.posX, lllllllllllllIIlllllIIlIlIlllllI.posY, lllllllllllllIIlllllIIlIlIlllllI.posZ, lllllllllllllIIlllllIIlIlIlllllI.rotationYaw, lllllllllllllIIlllllIIlIlIlllllI.rotationPitch);
                        this.worldObj.spawnEntityInWorld(lllllllllllllIIlllllIIlIlIlllIll);
                        "".length();
                    }
                    if (llIIIllIIllIlII(lllllllllllllIIlllllIIlIlIlllllI.isRiding() ? 1 : 0)) {
                        lllllllllllllIIlllllIIlIlIlllllI.mountEntity(null);
                    }
                    lllllllllllllIIlllllIIlIlIlllllI.setPositionAndUpdate(this.posX, this.posY, this.posZ);
                    lllllllllllllIIlllllIIlIlIlllllI.fallDistance = 0.0f;
                    lllllllllllllIIlllllIIlIlIlllllI.attackEntityFrom(DamageSource.fall, 5.0f);
                    "".length();
                    "".length();
                    if ((0x0 ^ 0x54 ^ (0x93 ^ 0xC3)) != (176 + 53 - 100 + 68 ^ 141 + 94 - 160 + 118)) {
                        return;
                    }
                }
            }
            else if (llIIIllIIllIIII(lllllllllllllIIlllllIIlIlIlllllI)) {
                lllllllllllllIIlllllIIlIlIlllllI.setPositionAndUpdate(this.posX, this.posY, this.posZ);
                lllllllllllllIIlllllIIlIlIlllllI.fallDistance = 0.0f;
            }
            this.setDead();
        }
    }
    
    public EntityEnderPearl(final World lllllllllllllIIlllllIIlIllIIlIIl, final double lllllllllllllIIlllllIIlIllIIlIII, final double lllllllllllllIIlllllIIlIllIIllII, final double lllllllllllllIIlllllIIlIllIIlIll) {
        super(lllllllllllllIIlllllIIlIllIIlIIl, lllllllllllllIIlllllIIlIllIIlIII, lllllllllllllIIlllllIIlIllIIllII, lllllllllllllIIlllllIIlIllIIlIll);
    }
    
    @Override
    public void onUpdate() {
        final EntityLivingBase lllllllllllllIIlllllIIlIlIllIIlI = this.getThrower();
        if (llIIIllIIllIIII(lllllllllllllIIlllllIIlIlIllIIlI) && llIIIllIIllIlII((lllllllllllllIIlllllIIlIlIllIIlI instanceof EntityPlayer) ? 1 : 0) && llIIIllIIllIIll(lllllllllllllIIlllllIIlIlIllIIlI.isEntityAlive() ? 1 : 0)) {
            this.setDead();
            "".length();
            if (-" ".length() >= (0x5C ^ 0x4D ^ (0x1 ^ 0x14))) {
                return;
            }
        }
        else {
            super.onUpdate();
        }
    }
    
    private static void llIIIlIlllllllI() {
        (lIIIlllIIlIlII = new String[EntityEnderPearl.lIIIlllIIlllIl[2]])[EntityEnderPearl.lIIIlllIIlllIl[0]] = llIIIlIllllllIl("PikjIwwJNg87ADMoCQ==", "ZFnLn");
    }
    
    private static boolean llIIIllIIllIlII(final int lllllllllllllIIlllllIIlIlIIIlIII) {
        return lllllllllllllIIlllllIIlIlIIIlIII != 0;
    }
    
    private static boolean llIIIllIIllIIII(final Object lllllllllllllIIlllllIIlIlIIIlllI) {
        return lllllllllllllIIlllllIIlIlIIIlllI != null;
    }
    
    private static boolean llIIIllIIllIIIl(final Object lllllllllllllIIlllllIIlIlIIIlIll, final Object lllllllllllllIIlllllIIlIlIIIlIlI) {
        return lllllllllllllIIlllllIIlIlIIIlIll == lllllllllllllIIlllllIIlIlIIIlIlI;
    }
    
    public EntityEnderPearl(final World lllllllllllllIIlllllIIlIllIlIllI, final EntityLivingBase lllllllllllllIIlllllIIlIllIlIlIl) {
        super(lllllllllllllIIlllllIIlIllIlIllI, lllllllllllllIIlllllIIlIllIlIlIl);
        this.field_181555_c = lllllllllllllIIlllllIIlIllIlIlIl;
    }
    
    private static boolean llIIIllIIllIlIl(final int lllllllllllllIIlllllIIlIlIIIIlII) {
        return lllllllllllllIIlllllIIlIlIIIIlII < 0;
    }
    
    private static boolean llIIIllIIllIllI(final int lllllllllllllIIlllllIIlIlIIlIIIl, final int lllllllllllllIIlllllIIlIlIIlIIII) {
        return lllllllllllllIIlllllIIlIlIIlIIIl < lllllllllllllIIlllllIIlIlIIlIIII;
    }
    
    private static String llIIIlIllllllIl(String lllllllllllllIIlllllIIlIlIlIIIII, final String lllllllllllllIIlllllIIlIlIlIIlII) {
        lllllllllllllIIlllllIIlIlIlIIIII = new String(Base64.getDecoder().decode(lllllllllllllIIlllllIIlIlIlIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllllIIlIlIlIIIll = new StringBuilder();
        final char[] lllllllllllllIIlllllIIlIlIlIIIlI = lllllllllllllIIlllllIIlIlIlIIlII.toCharArray();
        int lllllllllllllIIlllllIIlIlIlIIIIl = EntityEnderPearl.lIIIlllIIlllIl[0];
        final float lllllllllllllIIlllllIIlIlIIllIll = (Object)lllllllllllllIIlllllIIlIlIlIIIII.toCharArray();
        final float lllllllllllllIIlllllIIlIlIIllIlI = lllllllllllllIIlllllIIlIlIIllIll.length;
        String lllllllllllllIIlllllIIlIlIIllIIl = (String)EntityEnderPearl.lIIIlllIIlllIl[0];
        while (llIIIllIIllIllI((int)lllllllllllllIIlllllIIlIlIIllIIl, (int)lllllllllllllIIlllllIIlIlIIllIlI)) {
            final char lllllllllllllIIlllllIIlIlIlIIllI = lllllllllllllIIlllllIIlIlIIllIll[lllllllllllllIIlllllIIlIlIIllIIl];
            lllllllllllllIIlllllIIlIlIlIIIll.append((char)(lllllllllllllIIlllllIIlIlIlIIllI ^ lllllllllllllIIlllllIIlIlIlIIIlI[lllllllllllllIIlllllIIlIlIlIIIIl % lllllllllllllIIlllllIIlIlIlIIIlI.length]));
            "".length();
            ++lllllllllllllIIlllllIIlIlIlIIIIl;
            ++lllllllllllllIIlllllIIlIlIIllIIl;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllllIIlIlIlIIIll);
    }
    
    public EntityEnderPearl(final World lllllllllllllIIlllllIIlIllIllllI) {
        super(lllllllllllllIIlllllIIlIllIllllI);
    }
    
    private static void llIIIllIIlIlllI() {
        (lIIIlllIIlllIl = new int[3])[0] = ((0xE2 ^ 0xA2) & ~(0xF3 ^ 0xB3));
        EntityEnderPearl.lIIIlllIIlllIl[1] = (0xE ^ 0x6D ^ (0xDA ^ 0x99));
        EntityEnderPearl.lIIIlllIIlllIl[2] = " ".length();
    }
    
    private static boolean llIIIllIIllIIll(final int lllllllllllllIIlllllIIlIlIIIIllI) {
        return lllllllllllllIIlllllIIlIlIIIIllI == 0;
    }
    
    private static boolean llIIIllIIllIIlI(final int lllllllllllllIIlllllIIlIlIIlIlIl, final int lllllllllllllIIlllllIIlIlIIlIlII) {
        return lllllllllllllIIlllllIIlIlIIlIlIl >= lllllllllllllIIlllllIIlIlIIlIlII;
    }
    
    private static int llIIIllIIlIllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    static {
        llIIIllIIlIlllI();
        llIIIlIlllllllI();
    }
}
