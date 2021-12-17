// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.ai;

import java.util.Iterator;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.stats.StatList;
import net.minecraft.entity.EntityAgeable;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.List;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import net.minecraft.entity.passive.EntityAnimal;

public class EntityAIMate extends EntityAIBase
{
    private /* synthetic */ EntityAnimal targetMate;
    private static final /* synthetic */ int[] llIIlIIIllIIIl;
    /* synthetic */ double moveSpeed;
    private static final /* synthetic */ String[] llIIlIIIllIIII;
    /* synthetic */ World theWorld;
    /* synthetic */ int spawnBabyDelay;
    private /* synthetic */ EntityAnimal theAnimal;
    
    private static boolean lIIIlIllllllllll(final int llllllllllllIlllIIlIllllIlIllIlI) {
        return llllllllllllIlllIIlIllllIlIllIlI < 0;
    }
    
    @Override
    public boolean shouldExecute() {
        if (lIIIlIlllllllIIl(this.theAnimal.isInLove() ? 1 : 0)) {
            return EntityAIMate.llIIlIIIllIIIl[1] != 0;
        }
        this.targetMate = this.getNearbyMate();
        if (lIIIlIlllllllIlI(this.targetMate)) {
            return EntityAIMate.llIIlIIIllIIIl[2] != 0;
        }
        return EntityAIMate.llIIlIIIllIIIl[1] != 0;
    }
    
    private static boolean lIIIlIlllllllIIl(final int llllllllllllIlllIIlIllllIlIlllII) {
        return llllllllllllIlllIIlIllllIlIlllII == 0;
    }
    
    private static boolean lIIIlIlllllllllI(final int llllllllllllIlllIIlIllllIllIlIIl, final int llllllllllllIlllIIlIllllIllIlIII) {
        return llllllllllllIlllIIlIllllIllIlIIl >= llllllllllllIlllIIlIllllIllIlIII;
    }
    
    @Override
    public void resetTask() {
        this.targetMate = null;
        this.spawnBabyDelay = EntityAIMate.llIIlIIIllIIIl[1];
    }
    
    private EntityAnimal getNearbyMate() {
        final float llllllllllllIlllIIlIlllllIllIIII = 8.0f;
        final List<EntityAnimal> llllllllllllIlllIIlIlllllIlIllll = this.theWorld.getEntitiesWithinAABB(this.theAnimal.getClass(), this.theAnimal.getEntityBoundingBox().expand(llllllllllllIlllIIlIlllllIllIIII, llllllllllllIlllIIlIlllllIllIIII, llllllllllllIlllIIlIlllllIllIIII));
        double llllllllllllIlllIIlIlllllIlIlllI = Double.MAX_VALUE;
        EntityAnimal llllllllllllIlllIIlIlllllIlIllIl = null;
        final byte llllllllllllIlllIIlIlllllIlIIlIl = (byte)llllllllllllIlllIIlIlllllIlIllll.iterator();
        "".length();
        if (-(0x50 ^ 0x32 ^ (0x3 ^ 0x65)) >= 0) {
            return null;
        }
        while (!lIIIlIlllllllIIl(((Iterator)llllllllllllIlllIIlIlllllIlIIlIl).hasNext() ? 1 : 0)) {
            final EntityAnimal llllllllllllIlllIIlIlllllIlIllII = ((Iterator<EntityAnimal>)llllllllllllIlllIIlIlllllIlIIlIl).next();
            if (lIIIlIlllllllIll(this.theAnimal.canMateWith(llllllllllllIlllIIlIlllllIlIllII) ? 1 : 0) && lIIIlIllllllllll(lIIIllIIIIIIIIII(this.theAnimal.getDistanceSqToEntity(llllllllllllIlllIIlIlllllIlIllII), llllllllllllIlllIIlIlllllIlIlllI))) {
                llllllllllllIlllIIlIlllllIlIllIl = llllllllllllIlllIIlIlllllIlIllII;
                llllllllllllIlllIIlIlllllIlIlllI = this.theAnimal.getDistanceSqToEntity(llllllllllllIlllIIlIlllllIlIllII);
            }
        }
        return llllllllllllIlllIIlIlllllIlIllIl;
    }
    
    private static int lIIIlIllllllllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIIlIlllllllIll(final int llllllllllllIlllIIlIllllIlIllllI) {
        return llllllllllllIlllIIlIllllIlIllllI != 0;
    }
    
    @Override
    public void updateTask() {
        this.theAnimal.getLookHelper().setLookPositionWithEntity(this.targetMate, 10.0f, (float)this.theAnimal.getVerticalFaceSpeed());
        this.theAnimal.getNavigator().tryMoveToEntityLiving(this.targetMate, this.moveSpeed);
        "".length();
        this.spawnBabyDelay += EntityAIMate.llIIlIIIllIIIl[2];
        if (lIIIlIlllllllllI(this.spawnBabyDelay, EntityAIMate.llIIlIIIllIIIl[3]) && lIIIlIllllllllll(lIIIlIllllllllIl(this.theAnimal.getDistanceSqToEntity(this.targetMate), 9.0))) {
            this.spawnBaby();
        }
    }
    
    private static boolean lIIIllIIIIIIIIIl(final Object llllllllllllIlllIIlIllllIllIIIII) {
        return llllllllllllIlllIIlIllllIllIIIII == null;
    }
    
    private static int lIIIllIIIIIIIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public EntityAIMate(final EntityAnimal llllllllllllIlllIIlIllllllIIlIIl, final double llllllllllllIlllIIlIllllllIIIlIl) {
        this.theAnimal = llllllllllllIlllIIlIllllllIIlIIl;
        this.theWorld = llllllllllllIlllIIlIllllllIIlIIl.worldObj;
        this.moveSpeed = llllllllllllIlllIIlIllllllIIIlIl;
        this.setMutexBits(EntityAIMate.llIIlIIIllIIIl[0]);
    }
    
    private static void lIIIlIlllllllIII() {
        (llIIlIIIllIIIl = new int[7])[0] = "   ".length();
        EntityAIMate.llIIlIIIllIIIl[1] = ((0xEB ^ 0xC5 ^ (0x21 ^ 0x42)) & (0xDE ^ 0x85 ^ (0x49 ^ 0x5F) ^ -" ".length()));
        EntityAIMate.llIIlIIIllIIIl[2] = " ".length();
        EntityAIMate.llIIlIIIllIIIl[3] = (0xC ^ 0x1C ^ (0x8 ^ 0x24));
        EntityAIMate.llIIlIIIllIIIl[4] = (0xFFFFD7F0 & 0x3F7F);
        EntityAIMate.llIIlIIIllIIIl[5] = -(0xFFFFDFE2 & 0x7DDD);
        EntityAIMate.llIIlIIIllIIIl[6] = (0x89 ^ 0x8E);
    }
    
    private static boolean lIIIlIllllllllII(final int llllllllllllIlllIIlIllllIllIIlIl, final int llllllllllllIlllIIlIllllIllIIlII) {
        return llllllllllllIlllIIlIllllIllIIlIl < llllllllllllIlllIIlIllllIllIIlII;
    }
    
    private static String lIIIlIllllllIlIl(String llllllllllllIlllIIlIllllIlllIlII, final String llllllllllllIlllIIlIllllIlllIIll) {
        llllllllllllIlllIIlIllllIlllIlII = new String(Base64.getDecoder().decode(llllllllllllIlllIIlIllllIlllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIlIllllIlllIlll = new StringBuilder();
        final char[] llllllllllllIlllIIlIllllIlllIllI = llllllllllllIlllIIlIllllIlllIIll.toCharArray();
        int llllllllllllIlllIIlIllllIlllIlIl = EntityAIMate.llIIlIIIllIIIl[1];
        final double llllllllllllIlllIIlIllllIllIllll = (Object)llllllllllllIlllIIlIllllIlllIlII.toCharArray();
        final Exception llllllllllllIlllIIlIllllIllIlllI = (Exception)llllllllllllIlllIIlIllllIllIllll.length;
        String llllllllllllIlllIIlIllllIllIllIl = (String)EntityAIMate.llIIlIIIllIIIl[1];
        while (lIIIlIllllllllII((int)llllllllllllIlllIIlIllllIllIllIl, (int)llllllllllllIlllIIlIllllIllIlllI)) {
            final char llllllllllllIlllIIlIllllIllllIlI = llllllllllllIlllIIlIllllIllIllll[llllllllllllIlllIIlIllllIllIllIl];
            llllllllllllIlllIIlIllllIlllIlll.append((char)(llllllllllllIlllIIlIllllIllllIlI ^ llllllllllllIlllIIlIllllIlllIllI[llllllllllllIlllIIlIllllIlllIlIl % llllllllllllIlllIIlIllllIlllIllI.length]));
            "".length();
            ++llllllllllllIlllIIlIllllIlllIlIl;
            ++llllllllllllIlllIIlIllllIllIllIl;
            "".length();
            if ("  ".length() < ((0x7B ^ 0x21) & ~(0xED ^ 0xB7))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIlIllllIlllIlll);
    }
    
    private static void lIIIlIllllllIllI() {
        (llIIlIIIllIIII = new String[EntityAIMate.llIIlIIIllIIIl[2]])[EntityAIMate.llIIlIIIllIIIl[1]] = lIIIlIllllllIlIl("KgQKKQ8CBCgy", "NkGFm");
    }
    
    private static boolean lIIIlIlllllllIlI(final Object llllllllllllIlllIIlIllllIllIIIlI) {
        return llllllllllllIlllIIlIllllIllIIIlI != null;
    }
    
    @Override
    public boolean continueExecuting() {
        if (lIIIlIlllllllIll(this.targetMate.isEntityAlive() ? 1 : 0) && lIIIlIlllllllIll(this.targetMate.isInLove() ? 1 : 0) && lIIIlIllllllllII(this.spawnBabyDelay, EntityAIMate.llIIlIIIllIIIl[3])) {
            return EntityAIMate.llIIlIIIllIIIl[2] != 0;
        }
        return EntityAIMate.llIIlIIIllIIIl[1] != 0;
    }
    
    private void spawnBaby() {
        final EntityAgeable llllllllllllIlllIIlIlllllIIllIII = this.theAnimal.createChild(this.targetMate);
        if (lIIIlIlllllllIlI(llllllllllllIlllIIlIlllllIIllIII)) {
            EntityPlayer llllllllllllIlllIIlIlllllIIlIlll = this.theAnimal.getPlayerInLove();
            if (lIIIllIIIIIIIIIl(llllllllllllIlllIIlIlllllIIlIlll) && lIIIlIlllllllIlI(this.targetMate.getPlayerInLove())) {
                llllllllllllIlllIIlIlllllIIlIlll = this.targetMate.getPlayerInLove();
            }
            if (lIIIlIlllllllIlI(llllllllllllIlllIIlIlllllIIlIlll)) {
                llllllllllllIlllIIlIlllllIIlIlll.triggerAchievement(StatList.animalsBredStat);
                if (lIIIlIlllllllIll((this.theAnimal instanceof EntityCow) ? 1 : 0)) {
                    llllllllllllIlllIIlIlllllIIlIlll.triggerAchievement(AchievementList.breedCow);
                }
            }
            this.theAnimal.setGrowingAge(EntityAIMate.llIIlIIIllIIIl[4]);
            this.targetMate.setGrowingAge(EntityAIMate.llIIlIIIllIIIl[4]);
            this.theAnimal.resetInLove();
            this.targetMate.resetInLove();
            llllllllllllIlllIIlIlllllIIllIII.setGrowingAge(EntityAIMate.llIIlIIIllIIIl[5]);
            llllllllllllIlllIIlIlllllIIllIII.setLocationAndAngles(this.theAnimal.posX, this.theAnimal.posY, this.theAnimal.posZ, 0.0f, 0.0f);
            this.theWorld.spawnEntityInWorld(llllllllllllIlllIIlIlllllIIllIII);
            "".length();
            final Random llllllllllllIlllIIlIlllllIIlIllI = this.theAnimal.getRNG();
            int llllllllllllIlllIIlIlllllIIlIlIl = EntityAIMate.llIIlIIIllIIIl[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIlIlllllllllI(llllllllllllIlllIIlIlllllIIlIlIl, EntityAIMate.llIIlIIIllIIIl[6])) {
                final double llllllllllllIlllIIlIlllllIIlIlII = llllllllllllIlllIIlIlllllIIlIllI.nextGaussian() * 0.02;
                final double llllllllllllIlllIIlIlllllIIlIIll = llllllllllllIlllIIlIlllllIIlIllI.nextGaussian() * 0.02;
                final double llllllllllllIlllIIlIlllllIIlIIlI = llllllllllllIlllIIlIlllllIIlIllI.nextGaussian() * 0.02;
                final double llllllllllllIlllIIlIlllllIIlIIIl = llllllllllllIlllIIlIlllllIIlIllI.nextDouble() * this.theAnimal.width * 2.0 - this.theAnimal.width;
                final double llllllllllllIlllIIlIlllllIIlIIII = 0.5 + llllllllllllIlllIIlIlllllIIlIllI.nextDouble() * this.theAnimal.height;
                final double llllllllllllIlllIIlIlllllIIIllll = llllllllllllIlllIIlIlllllIIlIllI.nextDouble() * this.theAnimal.width * 2.0 - this.theAnimal.width;
                this.theWorld.spawnParticle(EnumParticleTypes.HEART, this.theAnimal.posX + llllllllllllIlllIIlIlllllIIlIIIl, this.theAnimal.posY + llllllllllllIlllIIlIlllllIIlIIII, this.theAnimal.posZ + llllllllllllIlllIIlIlllllIIIllll, llllllllllllIlllIIlIlllllIIlIlII, llllllllllllIlllIIlIlllllIIlIIll, llllllllllllIlllIIlIlllllIIlIIlI, new int[EntityAIMate.llIIlIIIllIIIl[1]]);
                ++llllllllllllIlllIIlIlllllIIlIlIl;
            }
            if (lIIIlIlllllllIll(this.theWorld.getGameRules().getBoolean(EntityAIMate.llIIlIIIllIIII[EntityAIMate.llIIlIIIllIIIl[1]]) ? 1 : 0)) {
                this.theWorld.spawnEntityInWorld(new EntityXPOrb(this.theWorld, this.theAnimal.posX, this.theAnimal.posY, this.theAnimal.posZ, llllllllllllIlllIIlIlllllIIlIllI.nextInt(EntityAIMate.llIIlIIIllIIIl[6]) + EntityAIMate.llIIlIIIllIIIl[2]));
                "".length();
            }
        }
    }
    
    static {
        lIIIlIlllllllIII();
        lIIIlIllllllIllI();
    }
}
