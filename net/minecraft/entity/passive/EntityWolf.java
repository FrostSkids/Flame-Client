// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.entity.ai.EntityAISit;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import com.google.common.base.Predicate;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtTarget;
import net.minecraft.entity.ai.EntityAIOwnerHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIBeg;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIFollowOwner;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EntityWolf extends EntityTameable
{
    private /* synthetic */ float headRotationCourse;
    private static final /* synthetic */ int[] llllIllIllllI;
    private /* synthetic */ float prevTimeWolfIsShaking;
    private /* synthetic */ float timeWolfIsShaking;
    private /* synthetic */ boolean isWet;
    private /* synthetic */ boolean isShaking;
    private /* synthetic */ float headRotationCourseOld;
    private static final /* synthetic */ String[] llllIllIllIlI;
    
    private static String lIlIlIlllIIIIlI(final String lllllllllllllIlIllIIllIlllllIIIl, final String lllllllllllllIlIllIIllIlllllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIllIlllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIllIlllllIIlI.getBytes(StandardCharsets.UTF_8)), EntityWolf.llllIllIllllI[7]), "DES");
            final Cipher lllllllllllllIlIllIIllIlllllIlIl = Cipher.getInstance("DES");
            lllllllllllllIlIllIIllIlllllIlIl.init(EntityWolf.llllIllIllllI[1], lllllllllllllIlIllIIllIlllllIllI);
            return new String(lllllllllllllIlIllIIllIlllllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIllIlllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIllIlllllIlII) {
            lllllllllllllIlIllIIllIlllllIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIlIllllIIllI() {
        (llllIllIllllI = new int[23])[0] = " ".length();
        EntityWolf.llllIllIllllI[1] = "  ".length();
        EntityWolf.llllIllIllllI[2] = "   ".length();
        EntityWolf.llllIllIllllI[3] = (0x24 ^ 0x20);
        EntityWolf.llllIllIllllI[4] = (167 + 106 - 171 + 85 ^ 185 + 155 - 236 + 86);
        EntityWolf.llllIllIllllI[5] = (118 + 25 - 100 + 118 ^ 71 + 21 + 20 + 55);
        EntityWolf.llllIllIllllI[6] = (0xC5 ^ 0xC2);
        EntityWolf.llllIllIllllI[7] = (0xCC ^ 0x93 ^ (0x24 ^ 0x73));
        EntityWolf.llllIllIllllI[8] = (45 + 106 - 147 + 141 ^ 127 + 10 - 57 + 72);
        EntityWolf.llllIllIllllI[9] = ((0x4D ^ 0x76 ^ (0x36 ^ 0x2B)) & (0x10 ^ 0xB ^ (0xE ^ 0x33) ^ -" ".length()));
        EntityWolf.llllIllIllllI[10] = (0xBD ^ 0xAF);
        EntityWolf.llllIllIllllI[11] = (0x22 ^ 0x31);
        EntityWolf.llllIllIllllI[12] = (0x4D ^ 0x59);
        EntityWolf.llllIllIllllI[13] = (0xF3 ^ 0x90);
        EntityWolf.llllIllIllllI[14] = (0x36 ^ 0x3C);
        EntityWolf.llllIllIllllI[15] = (0xB6 ^ 0xBD);
        EntityWolf.llllIllIllllI[16] = -" ".length();
        EntityWolf.llllIllIllllI[17] = (179 + 36 - 154 + 126 ^ 147 + 34 - 73 + 75);
        EntityWolf.llllIllIllllI[18] = (0xA ^ 0x1 ^ (0x44 ^ 0x5F));
        EntityWolf.llllIllIllllI[19] = -"   ".length();
        EntityWolf.llllIllIllllI[20] = (0x2E ^ 0x1B ^ (0x51 ^ 0x6B));
        EntityWolf.llllIllIllllI[21] = (0xFFFFB9F4 & 0x4F6B);
        EntityWolf.llllIllIllllI[22] = (0x70 ^ 0x3 ^ (0xE3 ^ 0x9D));
    }
    
    private static int lIlIlIlllllIIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static String lIlIlIlllIIIllI(String lllllllllllllIlIllIIlllIIIIIIIll, final String lllllllllllllIlIllIIlllIIIIIIlll) {
        lllllllllllllIlIllIIlllIIIIIIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIlllIIIIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIlllIIIIIIllI = new StringBuilder();
        final char[] lllllllllllllIlIllIIlllIIIIIIlIl = lllllllllllllIlIllIIlllIIIIIIlll.toCharArray();
        int lllllllllllllIlIllIIlllIIIIIIlII = EntityWolf.llllIllIllllI[9];
        final byte lllllllllllllIlIllIIllIllllllllI = (Object)lllllllllllllIlIllIIlllIIIIIIIll.toCharArray();
        final Exception lllllllllllllIlIllIIllIlllllllIl = (Exception)lllllllllllllIlIllIIllIllllllllI.length;
        char lllllllllllllIlIllIIllIlllllllII = (char)EntityWolf.llllIllIllllI[9];
        while (lIlIlIllllllIIl(lllllllllllllIlIllIIllIlllllllII, (int)lllllllllllllIlIllIIllIlllllllIl)) {
            final char lllllllllllllIlIllIIlllIIIIIlIIl = lllllllllllllIlIllIIllIllllllllI[lllllllllllllIlIllIIllIlllllllII];
            lllllllllllllIlIllIIlllIIIIIIllI.append((char)(lllllllllllllIlIllIIlllIIIIIlIIl ^ lllllllllllllIlIllIIlllIIIIIIlIl[lllllllllllllIlIllIIlllIIIIIIlII % lllllllllllllIlIllIIlllIIIIIIlIl.length]));
            "".length();
            ++lllllllllllllIlIllIIlllIIIIIIlII;
            ++lllllllllllllIlIllIIllIlllllllII;
            "".length();
            if (((0x12 ^ 0x0 ^ (0x76 ^ 0x4C)) & (0xAE ^ 0xA4 ^ (0xA5 ^ 0x87) ^ -" ".length())) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIlllIIIIIIllI);
    }
    
    private static boolean lIlIlIlllllIIlI(final Object lllllllllllllIlIllIIllIllIllllIl) {
        return lllllllllllllIlIllIIllIllIllllIl != null;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIlIllIIlllIllIIlIll) {
        super.readEntityFromNBT(lllllllllllllIlIllIIlllIllIIlIll);
        this.setAngry(lllllllllllllIlIllIIlllIllIIlIll.getBoolean(EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[2]]));
        if (lIlIlIllllIIlll(lllllllllllllIlIllIIlllIllIIlIll.hasKey(EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[3]], EntityWolf.llllIllIllllI[13]) ? 1 : 0)) {
            this.setCollarColor(EnumDyeColor.byDyeDamage(lllllllllllllIlIllIIlllIllIIlIll.getByte(EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[4]])));
        }
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIlIllIIlllIIllIIIlI) {
        if (lIlIlIlllllIlll(lllllllllllllIlIllIIlllIIllIIIlI, EntityWolf.llllIllIllllI[7])) {
            this.isShaking = (EntityWolf.llllIllIllllI[0] != 0);
            this.timeWolfIsShaking = 0.0f;
            this.prevTimeWolfIsShaking = 0.0f;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIlIllIIlllIIllIIIlI);
        }
    }
    
    @Override
    protected String getHurtSound() {
        return EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[14]];
    }
    
    @Override
    public boolean allowLeashing() {
        if (lIlIlIllllIlIIl(this.isAngry() ? 1 : 0) && lIlIlIllllIIlll(super.allowLeashing() ? 1 : 0)) {
            return EntityWolf.llllIllIllllI[0] != 0;
        }
        return EntityWolf.llllIllIllllI[9] != 0;
    }
    
    @Override
    public void setTamed(final boolean lllllllllllllIlIllIIlllIIlllIIll) {
        super.setTamed(lllllllllllllIlIllIIlllIIlllIIll);
        if (lIlIlIllllIIlll(lllllllllllllIlIllIIlllIIlllIIll ? 1 : 0)) {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0);
            "".length();
            if (((0xD3 ^ 0xA9 ^ (0x2 ^ 0x2C)) & (100 + 117 - 29 + 22 ^ 111 + 78 - 129 + 74 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0);
        }
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0);
    }
    
    public void setAngry(final boolean lllllllllllllIlIllIIlllIIlIlIIII) {
        final byte lllllllllllllIlIllIIlllIIlIIllll = this.dataWatcher.getWatchableObjectByte(EntityWolf.llllIllIllllI[18]);
        if (lIlIlIllllIIlll(lllllllllllllIlIllIIlllIIlIlIIII ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityWolf.llllIllIllllI[18], (byte)(lllllllllllllIlIllIIlllIIlIIllll | EntityWolf.llllIllIllllI[1]));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityWolf.llllIllIllllI[18], (byte)(lllllllllllllIlIllIIlllIIlIIllll & EntityWolf.llllIllIllllI[19]));
        }
    }
    
    @Override
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896);
        if (lIlIlIllllIIlll(this.isTamed() ? 1 : 0)) {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(8.0);
        }
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        "".length();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0);
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (lIlIlIllllIlIIl(this.worldObj.isRemote ? 1 : 0) && lIlIlIllllIIlll(this.isWet ? 1 : 0) && lIlIlIllllIlIIl(this.isShaking ? 1 : 0) && lIlIlIllllIlIIl(this.hasPath() ? 1 : 0) && lIlIlIllllIIlll(this.onGround ? 1 : 0)) {
            this.isShaking = (EntityWolf.llllIllIllllI[0] != 0);
            this.timeWolfIsShaking = 0.0f;
            this.prevTimeWolfIsShaking = 0.0f;
            this.worldObj.setEntityState(this, (byte)EntityWolf.llllIllIllllI[7]);
        }
        if (lIlIlIllllIlIIl(this.worldObj.isRemote ? 1 : 0) && lIlIlIllllIlIII(this.getAttackTarget()) && lIlIlIllllIIlll(this.isAngry() ? 1 : 0)) {
            this.setAngry((boolean)(EntityWolf.llllIllIllllI[9] != 0));
        }
    }
    
    @Override
    public float getEyeHeight() {
        return this.height * 0.8f;
    }
    
    private static boolean lIlIlIlllllIlll(final int lllllllllllllIlIllIIllIlllIllIIl, final int lllllllllllllIlIllIIllIlllIllIII) {
        return lllllllllllllIlIllIIllIlllIllIIl == lllllllllllllIlIllIIllIlllIllIII;
    }
    
    @Override
    public int getMaxSpawnedInChunk() {
        return EntityWolf.llllIllIllllI[7];
    }
    
    public boolean isAngry() {
        if (lIlIlIllllIIlll(this.dataWatcher.getWatchableObjectByte(EntityWolf.llllIllIllllI[18]) & EntityWolf.llllIllIllllI[1])) {
            return EntityWolf.llllIllIllllI[0] != 0;
        }
        return EntityWolf.llllIllIllllI[9] != 0;
    }
    
    private static boolean lIlIlIlllllIlIl(final Object lllllllllllllIlIllIIllIllIllIllI, final Object lllllllllllllIlIllIIllIllIllIlII) {
        return lllllllllllllIlIllIIllIllIllIllI == lllllllllllllIlIllIIllIllIllIlII;
    }
    
    private static boolean lIlIlIllllIllIl(final int lllllllllllllIlIllIIllIllIlIlIll) {
        return lllllllllllllIlIllIIllIllIlIlIll >= 0;
    }
    
    public boolean isBegging() {
        if (lIlIlIlllllIlll(this.dataWatcher.getWatchableObjectByte(EntityWolf.llllIllIllllI[11]), EntityWolf.llllIllIllllI[0])) {
            return EntityWolf.llllIllIllllI[0] != 0;
        }
        return EntityWolf.llllIllIllllI[9] != 0;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        this.headRotationCourseOld = this.headRotationCourse;
        if (lIlIlIllllIIlll(this.isBegging() ? 1 : 0)) {
            this.headRotationCourse += (1.0f - this.headRotationCourse) * 0.4f;
            "".length();
            if ("  ".length() < -" ".length()) {
                return;
            }
        }
        else {
            this.headRotationCourse += (0.0f - this.headRotationCourse) * 0.4f;
        }
        if (lIlIlIllllIIlll(this.isWet() ? 1 : 0)) {
            this.isWet = (EntityWolf.llllIllIllllI[0] != 0);
            this.isShaking = (EntityWolf.llllIllIllllI[9] != 0);
            this.timeWolfIsShaking = 0.0f;
            this.prevTimeWolfIsShaking = 0.0f;
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
        else if ((!lIlIlIllllIlIIl(this.isWet ? 1 : 0) || lIlIlIllllIIlll(this.isShaking ? 1 : 0)) && lIlIlIllllIIlll(this.isShaking ? 1 : 0)) {
            if (lIlIlIllllIlIIl(lIlIlIllllIllII(this.timeWolfIsShaking, 0.0f))) {
                this.playSound(EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[17]], this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
            }
            this.prevTimeWolfIsShaking = this.timeWolfIsShaking;
            this.timeWolfIsShaking += 0.05f;
            if (lIlIlIllllIllIl(lIlIlIllllIllII(this.prevTimeWolfIsShaking, 2.0f))) {
                this.isWet = (EntityWolf.llllIllIllllI[9] != 0);
                this.isShaking = (EntityWolf.llllIllIllllI[9] != 0);
                this.prevTimeWolfIsShaking = 0.0f;
                this.timeWolfIsShaking = 0.0f;
            }
            if (lIlIlIllllIlllI(lIlIlIllllIllII(this.timeWolfIsShaking, 0.4f))) {
                final float lllllllllllllIlIllIIlllIlIlllIIl = (float)this.getEntityBoundingBox().minY;
                final int lllllllllllllIlIllIIlllIlIlllIII = (int)(MathHelper.sin((this.timeWolfIsShaking - 0.4f) * 3.1415927f) * 7.0f);
                int lllllllllllllIlIllIIlllIlIllIlll = EntityWolf.llllIllIllllI[9];
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
                while (!lIlIlIllllIllll(lllllllllllllIlIllIIlllIlIllIlll, lllllllllllllIlIllIIlllIlIlllIII)) {
                    final float lllllllllllllIlIllIIlllIlIllIllI = (this.rand.nextFloat() * 2.0f - 1.0f) * this.width * 0.5f;
                    final float lllllllllllllIlIllIIlllIlIllIlIl = (this.rand.nextFloat() * 2.0f - 1.0f) * this.width * 0.5f;
                    this.worldObj.spawnParticle(EnumParticleTypes.WATER_SPLASH, this.posX + lllllllllllllIlIllIIlllIlIllIllI, lllllllllllllIlIllIIlllIlIlllIIl + 0.8f, this.posZ + lllllllllllllIlIllIIlllIlIllIlIl, this.motionX, this.motionY, this.motionZ, new int[EntityWolf.llllIllIllllI[9]]);
                    ++lllllllllllllIlIllIIlllIlIllIlll;
                }
            }
        }
    }
    
    public void setBegging(final boolean lllllllllllllIlIllIIlllIIIllIIll) {
        if (lIlIlIllllIIlll(lllllllllllllIlIllIIlllIIIllIIll ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityWolf.llllIllIllllI[11], (byte)EntityWolf.llllIllIllllI[0]);
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityWolf.llllIllIllllI[11], (byte)EntityWolf.llllIllIllllI[9]);
        }
    }
    
    private static boolean lIlIlIlllllIllI(final Object lllllllllllllIlIllIIllIlllIIIlII, final Object lllllllllllllIlIllIIllIlllIIIIlI) {
        return lllllllllllllIlIllIIllIlllIIIlII != lllllllllllllIlIllIIllIlllIIIIlI;
    }
    
    @Override
    protected String getLivingSound() {
        String s;
        if (lIlIlIllllIIlll(this.isAngry() ? 1 : 0)) {
            s = EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[5]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIlIlIllllIlIIl(this.rand.nextInt(EntityWolf.llllIllIllllI[2]))) {
            if (lIlIlIllllIIlll(this.isTamed() ? 1 : 0) && lIlIlIllllIlIll(lIlIlIllllIlIlI(this.dataWatcher.getWatchableObjectFloat(EntityWolf.llllIllIllllI[10]), 10.0f))) {
                s = EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[6]];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                s = EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[7]];
                "".length();
                if (((0xEE ^ 0xC7 ^ (0x56 ^ 0x78)) & (90 + 68 - 106 + 101 ^ 16 + 90 + 41 + 11 ^ -" ".length())) > 0) {
                    return null;
                }
            }
        }
        else {
            s = EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[8]];
        }
        return s;
    }
    
    @Override
    public boolean shouldAttackEntity(final EntityLivingBase lllllllllllllIlIllIIlllIIIIlllII, final EntityLivingBase lllllllllllllIlIllIIlllIIIIllllI) {
        if (lIlIlIllllIlIIl((lllllllllllllIlIllIIlllIIIIlllII instanceof EntityCreeper) ? 1 : 0) && lIlIlIllllIlIIl((lllllllllllllIlIllIIlllIIIIlllII instanceof EntityGhast) ? 1 : 0)) {
            if (lIlIlIllllIIlll((lllllllllllllIlIllIIlllIIIIlllII instanceof EntityWolf) ? 1 : 0)) {
                final EntityWolf lllllllllllllIlIllIIlllIIIIlllIl = (EntityWolf)lllllllllllllIlIllIIlllIIIIlllII;
                if (lIlIlIllllIIlll(lllllllllllllIlIllIIlllIIIIlllIl.isTamed() ? 1 : 0) && lIlIlIlllllIlIl(lllllllllllllIlIllIIlllIIIIlllIl.getOwner(), lllllllllllllIlIllIIlllIIIIllllI)) {
                    return EntityWolf.llllIllIllllI[9] != 0;
                }
            }
            int n;
            if (lIlIlIllllIIlll((lllllllllllllIlIllIIlllIIIIlllII instanceof EntityPlayer) ? 1 : 0) && lIlIlIllllIIlll((lllllllllllllIlIllIIlllIIIIllllI instanceof EntityPlayer) ? 1 : 0) && lIlIlIllllIlIIl(((EntityPlayer)lllllllllllllIlIllIIlllIIIIllllI).canAttackPlayer((EntityPlayer)lllllllllllllIlIllIIlllIIIIlllII) ? 1 : 0)) {
                n = EntityWolf.llllIllIllllI[9];
                "".length();
                if (-"  ".length() >= 0) {
                    return ((0x7C ^ 0x33) & ~(0xD3 ^ 0x9C)) != 0x0;
                }
            }
            else if (lIlIlIllllIIlll((lllllllllllllIlIllIIlllIIIIlllII instanceof EntityHorse) ? 1 : 0) && lIlIlIllllIIlll(((EntityHorse)lllllllllllllIlIllIIlllIIIIlllII).isTame() ? 1 : 0)) {
                n = EntityWolf.llllIllIllllI[9];
                "".length();
                if (null != null) {
                    return ((0x96 ^ 0xAA) & ~(0x78 ^ 0x44)) != 0x0;
                }
            }
            else {
                n = EntityWolf.llllIllIllllI[0];
            }
            return n != 0;
        }
        return EntityWolf.llllIllIllllI[9] != 0;
    }
    
    private static boolean lIlIlIllllIlIII(final Object lllllllllllllIlIllIIllIllIllIIIl) {
        return lllllllllllllIlIllIIllIllIllIIIl == null;
    }
    
    private static boolean lIlIlIllllllIII(final int lllllllllllllIlIllIIllIlllIIllII, final int lllllllllllllIlIllIIllIlllIIlIlI) {
        return lllllllllllllIlIllIIllIlllIIllII > lllllllllllllIlIllIIllIlllIIlIlI;
    }
    
    @Override
    protected boolean canDespawn() {
        if (lIlIlIllllIlIIl(this.isTamed() ? 1 : 0) && lIlIlIllllllIII(this.ticksExisted, EntityWolf.llllIllIllllI[21])) {
            return EntityWolf.llllIllIllllI[0] != 0;
        }
        return EntityWolf.llllIllIllllI[9] != 0;
    }
    
    static {
        lIlIlIllllIIllI();
        lIlIlIlllIIIlll();
    }
    
    private static boolean lIlIlIlllllIlII(final int lllllllllllllIlIllIIllIllIlIIlll) {
        return lllllllllllllIlIllIIllIllIlIIlll <= 0;
    }
    
    public EnumDyeColor getCollarColor() {
        return EnumDyeColor.byDyeDamage(this.dataWatcher.getWatchableObjectByte(EntityWolf.llllIllIllllI[12]) & EntityWolf.llllIllIllllI[20]);
    }
    
    private static boolean lIlIlIllllIllll(final int lllllllllllllIlIllIIllIlllIlIlIl, final int lllllllllllllIlIllIIllIlllIlIlII) {
        return lllllllllllllIlIllIIllIlllIlIlIl >= lllllllllllllIlIllIIllIlllIlIlII;
    }
    
    public void setCollarColor(final EnumDyeColor lllllllllllllIlIllIIlllIIlIIIIll) {
        this.dataWatcher.updateObject(EntityWolf.llllIllIllllI[12], (byte)(lllllllllllllIlIllIIlllIIlIIIIll.getDyeDamage() & EntityWolf.llllIllIllllI[20]));
    }
    
    private static int lIlIlIllllIlIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityWolf.llllIllIllllI[10], new Float(this.getHealth()));
        this.dataWatcher.addObject(EntityWolf.llllIllIllllI[11], new Byte((byte)EntityWolf.llllIllIllllI[9]));
        this.dataWatcher.addObject(EntityWolf.llllIllIllllI[12], new Byte((byte)EnumDyeColor.RED.getMetadata()));
    }
    
    private static boolean lIlIlIllllIlllI(final int lllllllllllllIlIllIIllIllIlIIlIl) {
        return lllllllllllllIlIllIIllIllIlIIlIl > 0;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIlIllIIlllIllIlIIll) {
        super.writeEntityToNBT(lllllllllllllIlIllIIlllIllIlIIll);
        lllllllllllllIlIllIIlllIllIlIIll.setBoolean(EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[0]], this.isAngry());
        lllllllllllllIlIllIIlllIllIlIIll.setByte(EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[1]], (byte)this.getCollarColor().getDyeDamage());
    }
    
    public float getShadingWhileWet(final float lllllllllllllIlIllIIlllIlIlIIllI) {
        return 0.75f + (this.prevTimeWolfIsShaking + (this.timeWolfIsShaking - this.prevTimeWolfIsShaking) * lllllllllllllIlIllIIlllIlIlIIllI) / 2.0f * 0.25f;
    }
    
    private static void lIlIlIlllIIIlll() {
        (llllIllIllIlI = new String[EntityWolf.llllIllIllllI[22]])[EntityWolf.llllIllIllllI[9]] = lIlIlIlllIIIIIl("c6dF/IkEhUw+Pa9+f3FgUA==", "rUdzm");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[0]] = lIlIlIlllIIIIlI("tiDdVIKlhkU=", "TAFgd");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[1]] = lIlIlIlllIIIIlI("xpk4m6TR2TaDRcN5kEGd4w==", "QjlxO");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[2]] = lIlIlIlllIIIIlI("4B4V7GMQ/xo=", "kewVG");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[3]] = lIlIlIlllIIIIlI("71IOuJdFkOhqhBHfXHI3ow==", "glRPw");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[4]] = lIlIlIlllIIIIlI("oPDOe1pW/vb0bb+YWKEkhQ==", "Hvpqw");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[5]] = lIlIlIlllIIIIlI("lMLVlFewrJqiVGaSgulbEw==", "saMWs");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[6]] = lIlIlIlllIIIIlI("dpl4ZfyCaoLcQJT6EuQMfA==", "tJCpH");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[7]] = lIlIlIlllIIIIlI("0kf4Jb3jVPOoXqhEVU1bwwTjGJlygo16", "EIpun");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[8]] = lIlIlIlllIIIIIl("oZmkRuSlpEHHCXbyFX9T5g==", "KloCq");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[14]] = lIlIlIlllIIIIIl("jkVDFYCzRwhxvht4zgnDmA==", "qpWfO");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[15]] = lIlIlIlllIIIIIl("bX7NcNnjguEWfu5NyYuCNA==", "mWcwe");
        EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[17]] = lIlIlIlllIIIllI("ADUgTzICNiRPNgU7KQQ=", "mZBaE");
    }
    
    public EntityWolf(final World lllllllllllllIlIllIIlllIlllIlIll) {
        super(lllllllllllllIlIllIIlllIlllIlIll);
        this.setSize(0.6f, 0.8f);
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityWolf.llllIllIllllI[0] != 0));
        this.tasks.addTask(EntityWolf.llllIllIllllI[0], new EntityAISwimming(this));
        this.tasks.addTask(EntityWolf.llllIllIllllI[1], this.aiSit);
        this.tasks.addTask(EntityWolf.llllIllIllllI[2], new EntityAILeapAtTarget(this, 0.4f));
        this.tasks.addTask(EntityWolf.llllIllIllllI[3], new EntityAIAttackOnCollide(this, 1.0, (boolean)(EntityWolf.llllIllIllllI[0] != 0)));
        this.tasks.addTask(EntityWolf.llllIllIllllI[4], new EntityAIFollowOwner(this, 1.0, 10.0f, 2.0f));
        this.tasks.addTask(EntityWolf.llllIllIllllI[5], new EntityAIMate(this, 1.0));
        this.tasks.addTask(EntityWolf.llllIllIllllI[6], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityWolf.llllIllIllllI[7], new EntityAIBeg(this, 8.0f));
        this.tasks.addTask(EntityWolf.llllIllIllllI[8], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntityWolf.llllIllIllllI[8], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntityWolf.llllIllIllllI[0], new EntityAIOwnerHurtByTarget(this));
        this.targetTasks.addTask(EntityWolf.llllIllIllllI[1], new EntityAIOwnerHurtTarget(this));
        this.targetTasks.addTask(EntityWolf.llllIllIllllI[2], new EntityAIHurtByTarget(this, (boolean)(EntityWolf.llllIllIllllI[0] != 0), new Class[EntityWolf.llllIllIllllI[9]]));
        this.targetTasks.addTask(EntityWolf.llllIllIllllI[3], new EntityAITargetNonTamed<Object>(this, EntityAnimal.class, (boolean)(EntityWolf.llllIllIllllI[9] != 0), (com.google.common.base.Predicate<?>)new Predicate<Entity>() {
            private static final /* synthetic */ int[] lIIlIlIIlIIllI;
            
            private static boolean llIIllllllIIIll(final int lllllllllllllIIllIlIIlIlIIIlIIlI) {
                return lllllllllllllIIllIlIIlIlIIIlIIlI == 0;
            }
            
            private static void llIIllllllIIIlI() {
                (lIIlIlIIlIIllI = new int[2])[0] = ((0x84 ^ 0x97) & ~(0x8B ^ 0x98));
                EntityWolf$1.lIIlIlIIlIIllI[1] = " ".length();
            }
            
            public boolean apply(final Entity lllllllllllllIIllIlIIlIlIIIllIII) {
                if (llIIllllllIIIll((lllllllllllllIIllIlIIlIlIIIllIII instanceof EntitySheep) ? 1 : 0) && llIIllllllIIIll((lllllllllllllIIllIlIIlIlIIIllIII instanceof EntityRabbit) ? 1 : 0)) {
                    return EntityWolf$1.lIIlIlIIlIIllI[0] != 0;
                }
                return EntityWolf$1.lIIlIlIIlIIllI[1] != 0;
            }
            
            static {
                llIIllllllIIIlI();
            }
        }));
        this.targetTasks.addTask(EntityWolf.llllIllIllllI[4], new EntityAINearestAttackableTarget<Object>(this, EntitySkeleton.class, (boolean)(EntityWolf.llllIllIllllI[9] != 0)));
        this.setTamed((boolean)(EntityWolf.llllIllIllllI[9] != 0));
    }
    
    private static boolean lIlIlIllllllIIl(final int lllllllllllllIlIllIIllIlllIlIIIl, final int lllllllllllllIlIllIIllIlllIlIIII) {
        return lllllllllllllIlIllIIllIlllIlIIIl < lllllllllllllIlIllIIllIlllIlIIII;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIlIllIIlllIlIIIIlII, float lllllllllllllIlIllIIlllIlIIIIIll) {
        if (lIlIlIllllIIlll(this.isEntityInvulnerable(lllllllllllllIlIllIIlllIlIIIIlII) ? 1 : 0)) {
            return EntityWolf.llllIllIllllI[9] != 0;
        }
        final Entity lllllllllllllIlIllIIlllIlIIIIllI = lllllllllllllIlIllIIlllIlIIIIlII.getEntity();
        this.aiSit.setSitting((boolean)(EntityWolf.llllIllIllllI[9] != 0));
        if (lIlIlIlllllIIlI(lllllllllllllIlIllIIlllIlIIIIllI) && lIlIlIllllIlIIl((lllllllllllllIlIllIIlllIlIIIIllI instanceof EntityPlayer) ? 1 : 0) && lIlIlIllllIlIIl((lllllllllllllIlIllIIlllIlIIIIllI instanceof EntityArrow) ? 1 : 0)) {
            lllllllllllllIlIllIIlllIlIIIIIll = (lllllllllllllIlIllIIlllIlIIIIIll + 1.0f) / 2.0f;
        }
        return super.attackEntityFrom(lllllllllllllIlIllIIlllIlIIIIlII, lllllllllllllIlIllIIlllIlIIIIIll);
    }
    
    private static boolean lIlIlIllllIIlll(final int lllllllllllllIlIllIIllIllIlIllll) {
        return lllllllllllllIlIllIIllIllIlIllll != 0;
    }
    
    @Override
    protected void updateAITasks() {
        this.dataWatcher.updateObject(EntityWolf.llllIllIllllI[10], this.getHealth());
    }
    
    @Override
    public boolean attackEntityAsMob(final Entity lllllllllllllIlIllIIlllIIlllllIl) {
        final boolean lllllllllllllIlIllIIlllIIlllllII = lllllllllllllIlIllIIlllIIlllllIl.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(int)this.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue());
        if (lIlIlIllllIIlll(lllllllllllllIlIllIIlllIIlllllII ? 1 : 0)) {
            this.applyEnchantments(this, lllllllllllllIlIllIIlllIIlllllIl);
        }
        return lllllllllllllIlIllIIlllIIlllllII;
    }
    
    @Override
    public EntityWolf createChild(final EntityAgeable lllllllllllllIlIllIIlllIIIlllllI) {
        final EntityWolf lllllllllllllIlIllIIlllIIIllllIl = new EntityWolf(this.worldObj);
        final String lllllllllllllIlIllIIlllIIIllllII = this.getOwnerId();
        if (lIlIlIlllllIIlI(lllllllllllllIlIllIIlllIIIllllII) && lIlIlIllllIlllI(lllllllllllllIlIllIIlllIIIllllII.trim().length())) {
            lllllllllllllIlIllIIlllIIIllllIl.setOwnerId(lllllllllllllIlIllIIlllIIIllllII);
            lllllllllllllIlIllIIlllIIIllllIl.setTamed((boolean)(EntityWolf.llllIllIllllI[0] != 0));
        }
        return lllllllllllllIlIllIIlllIIIllllIl;
    }
    
    private static boolean lIlIlIllllIlIll(final int lllllllllllllIlIllIIllIllIlIlIIl) {
        return lllllllllllllIlIllIIllIllIlIlIIl < 0;
    }
    
    public float getTailRotation() {
        float n;
        if (lIlIlIllllIIlll(this.isAngry() ? 1 : 0)) {
            n = 1.5393804f;
            "".length();
            if (((0x46 ^ 0x6F) & ~(0xE ^ 0x27)) != 0x0) {
                return 0.0f;
            }
        }
        else if (lIlIlIllllIIlll(this.isTamed() ? 1 : 0)) {
            n = (0.55f - (20.0f - this.dataWatcher.getWatchableObjectFloat(EntityWolf.llllIllIllllI[10])) * 0.02f) * 3.1415927f;
            "".length();
            if ("   ".length() == 0) {
                return 0.0f;
            }
        }
        else {
            n = 0.62831855f;
        }
        return n;
    }
    
    private static boolean lIlIlIllllIlIIl(final int lllllllllllllIlIllIIllIllIlIllIl) {
        return lllllllllllllIlIllIIllIllIlIllIl == 0;
    }
    
    private static int lIlIlIlllllIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void setAttackTarget(final EntityLivingBase lllllllllllllIlIllIIlllIlllIIlII) {
        super.setAttackTarget(lllllllllllllIlIllIIlllIlllIIlII);
        if (lIlIlIllllIlIII(lllllllllllllIlIllIIlllIlllIIlII)) {
            this.setAngry((boolean)(EntityWolf.llllIllIllllI[9] != 0));
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        else if (lIlIlIllllIlIIl(this.isTamed() ? 1 : 0)) {
            this.setAngry((boolean)(EntityWolf.llllIllIllllI[0] != 0));
        }
    }
    
    public float getInterestedAngle(final float lllllllllllllIlIllIIlllIlIIlIlII) {
        return (this.headRotationCourseOld + (this.headRotationCourse - this.headRotationCourseOld) * lllllllllllllIlIllIIlllIlIIlIlII) * 0.15f * 3.1415927f;
    }
    
    @Override
    public boolean canMateWith(final EntityAnimal lllllllllllllIlIllIIlllIIIlIlIll) {
        if (lIlIlIlllllIlIl(lllllllllllllIlIllIIlllIIIlIlIll, this)) {
            return EntityWolf.llllIllIllllI[9] != 0;
        }
        if (lIlIlIllllIlIIl(this.isTamed() ? 1 : 0)) {
            return EntityWolf.llllIllIllllI[9] != 0;
        }
        if (lIlIlIllllIlIIl((lllllllllllllIlIllIIlllIIIlIlIll instanceof EntityWolf) ? 1 : 0)) {
            return EntityWolf.llllIllIllllI[9] != 0;
        }
        final EntityWolf lllllllllllllIlIllIIlllIIIlIllIl = (EntityWolf)lllllllllllllIlIllIIlllIIIlIlIll;
        int n;
        if (lIlIlIllllIlIIl(lllllllllllllIlIllIIlllIIIlIllIl.isTamed() ? 1 : 0)) {
            n = EntityWolf.llllIllIllllI[9];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((53 + 12 - 49 + 135 ^ 88 + 121 - 129 + 56) & (0x8C ^ 0xAD ^ (0x67 ^ 0x59) ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlIlIllllIIlll(lllllllllllllIlIllIIlllIIIlIllIl.isSitting() ? 1 : 0)) {
            n = EntityWolf.llllIllIllllI[9];
            "".length();
            if (-" ".length() > (0x91 ^ 0x95)) {
                return ((0xD8 ^ 0x87) & ~(0xEE ^ 0xB1)) != 0x0;
            }
        }
        else if (lIlIlIllllIIlll(this.isInLove() ? 1 : 0) && lIlIlIllllIIlll(lllllllllllllIlIllIIlllIIIlIllIl.isInLove() ? 1 : 0)) {
            n = EntityWolf.llllIllIllllI[0];
            "".length();
            if (" ".length() > (0x84 ^ 0x80)) {
                return ((0x5C ^ 0x4E) & ~(0x12 ^ 0x0)) != 0x0;
            }
        }
        else {
            n = EntityWolf.llllIllIllllI[9];
        }
        return n != 0;
    }
    
    private static String lIlIlIlllIIIIIl(final String lllllllllllllIlIllIIllIllllIIllI, final String lllllllllllllIlIllIIllIllllIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIllIllllIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIllIllllIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIllIllllIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIllIllllIlIII.init(EntityWolf.llllIllIllllI[1], lllllllllllllIlIllIIllIllllIlIIl);
            return new String(lllllllllllllIlIllIIllIllllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIllIllllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIllIllllIIlll) {
            lllllllllllllIlIllIIllIllllIIlll.printStackTrace();
            return null;
        }
    }
    
    private static int lIlIlIllllIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIlIlIlllllIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    protected void playStepSound(final BlockPos lllllllllllllIlIllIIlllIllIllIIl, final Block lllllllllllllIlIllIIlllIllIllIII) {
        this.playSound(EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[9]], 0.15f, 1.0f);
    }
    
    @Override
    protected Item getDropItem() {
        return Item.getItemById(EntityWolf.llllIllIllllI[16]);
    }
    
    @Override
    protected String getDeathSound() {
        return EntityWolf.llllIllIllIlI[EntityWolf.llllIllIllllI[15]];
    }
    
    @Override
    public int getVerticalFaceSpeed() {
        int verticalFaceSpeed;
        if (lIlIlIllllIIlll(this.isSitting() ? 1 : 0)) {
            verticalFaceSpeed = EntityWolf.llllIllIllllI[12];
            "".length();
            if ((0x1A ^ 0x1E) == 0x0) {
                return (0x36 ^ 0x7E) & ~(0x19 ^ 0x51);
            }
        }
        else {
            verticalFaceSpeed = super.getVerticalFaceSpeed();
        }
        return verticalFaceSpeed;
    }
    
    public float getShakeAngle(final float lllllllllllllIlIllIIlllIlIIlllII, final float lllllllllllllIlIllIIlllIlIIllIll) {
        float lllllllllllllIlIllIIlllIlIIllllI = (this.prevTimeWolfIsShaking + (this.timeWolfIsShaking - this.prevTimeWolfIsShaking) * lllllllllllllIlIllIIlllIlIIlllII + lllllllllllllIlIllIIlllIlIIllIll) / 1.8f;
        if (lIlIlIllllIlIll(lIlIlIlllllIIII(lllllllllllllIlIllIIlllIlIIllllI, 0.0f))) {
            lllllllllllllIlIllIIlllIlIIllllI = 0.0f;
            "".length();
            if (" ".length() == 0) {
                return 0.0f;
            }
        }
        else if (lIlIlIllllIlllI(lIlIlIlllllIIIl(lllllllllllllIlIllIIlllIlIIllllI, 1.0f))) {
            lllllllllllllIlIllIIlllIlIIllllI = 1.0f;
        }
        return MathHelper.sin(lllllllllllllIlIllIIlllIlIIllllI * 3.1415927f) * MathHelper.sin(lllllllllllllIlIllIIlllIlIIllllI * 3.1415927f * 11.0f) * 0.15f * 3.1415927f;
    }
    
    public boolean isWolfWet() {
        return this.isWet;
    }
    
    @Override
    public boolean isBreedingItem(final ItemStack lllllllllllllIlIllIIlllIIlIllIIl) {
        int wolfsFavoriteMeat;
        if (lIlIlIllllIlIII(lllllllllllllIlIllIIlllIIlIllIIl)) {
            wolfsFavoriteMeat = EntityWolf.llllIllIllllI[9];
            "".length();
            if (((0x75 ^ 0x6C) & ~(0x18 ^ 0x1)) != ((0x94 ^ 0xC2) & ~(0x49 ^ 0x1F))) {
                return ((0x4A ^ 0x1E) & ~(0x78 ^ 0x2C)) != 0x0;
            }
        }
        else if (lIlIlIllllIlIIl((lllllllllllllIlIllIIlllIIlIllIIl.getItem() instanceof ItemFood) ? 1 : 0)) {
            wolfsFavoriteMeat = EntityWolf.llllIllIllllI[9];
            "".length();
            if (-(0xC0 ^ 0xA5 ^ (0x1C ^ 0x7D)) >= 0) {
                return ((103 + 10 - 83 + 103 ^ 100 + 144 - 69 + 4) & (0x7D ^ 0x5D ^ (0x2F ^ 0x39) ^ -" ".length())) != 0x0;
            }
        }
        else {
            wolfsFavoriteMeat = (((ItemFood)lllllllllllllIlIllIIlllIIlIllIIl.getItem()).isWolfsFavoriteMeat() ? 1 : 0);
        }
        return wolfsFavoriteMeat != 0;
    }
    
    @Override
    public boolean interact(final EntityPlayer lllllllllllllIlIllIIlllIIllIllIl) {
        final ItemStack lllllllllllllIlIllIIlllIIllIllII = lllllllllllllIlIllIIlllIIllIllIl.inventory.getCurrentItem();
        if (lIlIlIllllIIlll(this.isTamed() ? 1 : 0)) {
            if (lIlIlIlllllIIlI(lllllllllllllIlIllIIlllIIllIllII)) {
                if (lIlIlIllllIIlll((lllllllllllllIlIllIIlllIIllIllII.getItem() instanceof ItemFood) ? 1 : 0)) {
                    final ItemFood lllllllllllllIlIllIIlllIIllIlIll = (ItemFood)lllllllllllllIlIllIIlllIIllIllII.getItem();
                    if (lIlIlIllllIIlll(lllllllllllllIlIllIIlllIIllIlIll.isWolfsFavoriteMeat() ? 1 : 0) && lIlIlIllllIlIll(lIlIlIlllllIIll(this.dataWatcher.getWatchableObjectFloat(EntityWolf.llllIllIllllI[10]), 20.0f))) {
                        if (lIlIlIllllIlIIl(lllllllllllllIlIllIIlllIIllIllIl.capabilities.isCreativeMode ? 1 : 0)) {
                            final ItemStack itemStack = lllllllllllllIlIllIIlllIIllIllII;
                            itemStack.stackSize -= EntityWolf.llllIllIllllI[0];
                        }
                        this.heal((float)lllllllllllllIlIllIIlllIIllIlIll.getHealAmount(lllllllllllllIlIllIIlllIIllIllII));
                        if (lIlIlIlllllIlII(lllllllllllllIlIllIIlllIIllIllII.stackSize)) {
                            lllllllllllllIlIllIIlllIIllIllIl.inventory.setInventorySlotContents(lllllllllllllIlIllIIlllIIllIllIl.inventory.currentItem, null);
                        }
                        return EntityWolf.llllIllIllllI[0] != 0;
                    }
                }
                else if (lIlIlIlllllIlIl(lllllllllllllIlIllIIlllIIllIllII.getItem(), Items.dye)) {
                    final EnumDyeColor lllllllllllllIlIllIIlllIIllIlIlI = EnumDyeColor.byDyeDamage(lllllllllllllIlIllIIlllIIllIllII.getMetadata());
                    if (lIlIlIlllllIllI(lllllllllllllIlIllIIlllIIllIlIlI, this.getCollarColor())) {
                        this.setCollarColor(lllllllllllllIlIllIIlllIIllIlIlI);
                        if (lIlIlIllllIlIIl(lllllllllllllIlIllIIlllIIllIllIl.capabilities.isCreativeMode ? 1 : 0)) {
                            final ItemStack itemStack2 = lllllllllllllIlIllIIlllIIllIllII;
                            final int n = itemStack2.stackSize - EntityWolf.llllIllIllllI[0];
                            itemStack2.stackSize = n;
                            if (lIlIlIlllllIlII(n)) {
                                lllllllllllllIlIllIIlllIIllIllIl.inventory.setInventorySlotContents(lllllllllllllIlIllIIlllIIllIllIl.inventory.currentItem, null);
                            }
                        }
                        return EntityWolf.llllIllIllllI[0] != 0;
                    }
                }
            }
            if (lIlIlIllllIIlll(this.isOwner(lllllllllllllIlIllIIlllIIllIllIl) ? 1 : 0) && lIlIlIllllIlIIl(this.worldObj.isRemote ? 1 : 0) && lIlIlIllllIlIIl(this.isBreedingItem(lllllllllllllIlIllIIlllIIllIllII) ? 1 : 0)) {
                final EntityAISit aiSit = this.aiSit;
                int sitting;
                if (lIlIlIllllIIlll(this.isSitting() ? 1 : 0)) {
                    sitting = EntityWolf.llllIllIllllI[9];
                    "".length();
                    if ((0x7B ^ 0x3E ^ (0xCA ^ 0x8B)) <= 0) {
                        return ((50 + 62 - 45 + 148 ^ 49 + 58 + 45 + 3) & (0x59 ^ 0x60 ^ (0x22 ^ 0x57) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    sitting = EntityWolf.llllIllIllllI[0];
                }
                aiSit.setSitting((boolean)(sitting != 0));
                this.isJumping = (EntityWolf.llllIllIllllI[9] != 0);
                this.navigator.clearPathEntity();
                this.setAttackTarget(null);
                "".length();
                if (((0xFE ^ 0x9C) & ~(0x34 ^ 0x56)) != ((0x1C ^ 0x5E) & ~(0x28 ^ 0x6A))) {
                    return ((0x47 ^ 0x51) & ~(0x2F ^ 0x39)) != 0x0;
                }
            }
        }
        else if (lIlIlIlllllIIlI(lllllllllllllIlIllIIlllIIllIllII) && lIlIlIlllllIlIl(lllllllllllllIlIllIIlllIIllIllII.getItem(), Items.bone) && lIlIlIllllIlIIl(this.isAngry() ? 1 : 0)) {
            if (lIlIlIllllIlIIl(lllllllllllllIlIllIIlllIIllIllIl.capabilities.isCreativeMode ? 1 : 0)) {
                final ItemStack itemStack3 = lllllllllllllIlIllIIlllIIllIllII;
                itemStack3.stackSize -= EntityWolf.llllIllIllllI[0];
            }
            if (lIlIlIlllllIlII(lllllllllllllIlIllIIlllIIllIllII.stackSize)) {
                lllllllllllllIlIllIIlllIIllIllIl.inventory.setInventorySlotContents(lllllllllllllIlIllIIlllIIllIllIl.inventory.currentItem, null);
            }
            if (lIlIlIllllIlIIl(this.worldObj.isRemote ? 1 : 0)) {
                if (lIlIlIllllIlIIl(this.rand.nextInt(EntityWolf.llllIllIllllI[2]))) {
                    this.setTamed((boolean)(EntityWolf.llllIllIllllI[0] != 0));
                    this.navigator.clearPathEntity();
                    this.setAttackTarget(null);
                    this.aiSit.setSitting((boolean)(EntityWolf.llllIllIllllI[0] != 0));
                    this.setHealth(20.0f);
                    this.setOwnerId(lllllllllllllIlIllIIlllIIllIllIl.getUniqueID().toString());
                    this.playTameEffect((boolean)(EntityWolf.llllIllIllllI[0] != 0));
                    this.worldObj.setEntityState(this, (byte)EntityWolf.llllIllIllllI[6]);
                    "".length();
                    if (" ".length() != " ".length()) {
                        return ((0x36 ^ 0x22) & ~(0x8B ^ 0x9F)) != 0x0;
                    }
                }
                else {
                    this.playTameEffect((boolean)(EntityWolf.llllIllIllllI[9] != 0));
                    this.worldObj.setEntityState(this, (byte)EntityWolf.llllIllIllllI[5]);
                }
            }
            return EntityWolf.llllIllIllllI[0] != 0;
        }
        return super.interact(lllllllllllllIlIllIIlllIIllIllIl);
    }
}
