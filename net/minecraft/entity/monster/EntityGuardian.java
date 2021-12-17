// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import java.util.Iterator;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.util.Vec3;
import net.minecraft.util.EnumParticleTypes;
import java.util.Collection;
import net.minecraft.util.WeightedRandom;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.util.WeightedRandomFishable;
import net.minecraft.potion.PotionEffect;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S2BPacketChangeGameState;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.potion.Potion;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.DamageSource;
import net.minecraft.pathfinding.PathNavigateSwimmer;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.ai.EntityAITasks;
import com.google.common.base.Predicate;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.EntityLivingBase;

public class EntityGuardian extends EntityMob
{
    private /* synthetic */ EntityLivingBase targetedEntity;
    private /* synthetic */ EntityAIWander wander;
    private /* synthetic */ float field_175485_bl;
    private static final /* synthetic */ String[] llIlIIIlIIIIII;
    private /* synthetic */ boolean field_175480_bp;
    private /* synthetic */ float field_175484_c;
    private static final /* synthetic */ int[] llIlIIIlIIIIlI;
    private /* synthetic */ int field_175479_bo;
    private /* synthetic */ float field_175482_b;
    private /* synthetic */ float field_175486_bm;
    private /* synthetic */ float field_175483_bk;
    
    @Override
    public float getBlockPathWeight(final BlockPos llllllllllllIllIllIlIIllIlIllIll) {
        float blockPathWeight;
        if (lIIlIIIllIIlllIl(this.worldObj.getBlockState(llllllllllllIllIllIlIIllIlIllIll).getBlock().getMaterial(), Material.water)) {
            blockPathWeight = 10.0f + this.worldObj.getLightBrightness(llllllllllllIllIllIlIIllIlIllIll) - 0.5f;
            "".length();
            if (-"  ".length() > 0) {
                return 0.0f;
            }
        }
        else {
            blockPathWeight = super.getBlockPathWeight(llllllllllllIllIllIlIIllIlIllIll);
        }
        return blockPathWeight;
    }
    
    public EntityGuardian(final World llllllllllllIllIllIlIIllllIIlIlI) {
        super(llllllllllllIllIllIlIIllllIIlIlI);
        this.experienceValue = EntityGuardian.llIlIIIlIIIIlI[0];
        this.setSize(0.85f, 0.85f);
        this.tasks.addTask(EntityGuardian.llIlIIIlIIIIlI[1], new AIGuardianAttack(this));
        final EntityAIMoveTowardsRestriction llllllllllllIllIllIlIIllllIIlIIl;
        this.tasks.addTask(EntityGuardian.llIlIIIlIIIIlI[2], llllllllllllIllIllIlIIllllIIlIIl = new EntityAIMoveTowardsRestriction(this, 1.0));
        final EntityAITasks tasks = this.tasks;
        final int llllllllllllIlllIIllllIlIlIIIIll = EntityGuardian.llIlIIIlIIIIlI[3];
        final EntityAIWander entityAIWander = new EntityAIWander(this, 1.0, EntityGuardian.llIlIIIlIIIIlI[4]);
        this.wander = entityAIWander;
        tasks.addTask(llllllllllllIlllIIllllIlIlIIIIll, entityAIWander);
        this.tasks.addTask(EntityGuardian.llIlIIIlIIIIlI[5], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntityGuardian.llIlIIIlIIIIlI[5], new EntityAIWatchClosest(this, EntityGuardian.class, 12.0f, 0.01f));
        this.tasks.addTask(EntityGuardian.llIlIIIlIIIIlI[6], new EntityAILookIdle(this));
        this.wander.setMutexBits(EntityGuardian.llIlIIIlIIIIlI[7]);
        llllllllllllIllIllIlIIllllIIlIIl.setMutexBits(EntityGuardian.llIlIIIlIIIIlI[7]);
        this.targetTasks.addTask(EntityGuardian.llIlIIIlIIIIlI[8], new EntityAINearestAttackableTarget<Object>(this, EntityLivingBase.class, EntityGuardian.llIlIIIlIIIIlI[0], (boolean)(EntityGuardian.llIlIIIlIIIIlI[8] != 0), (boolean)(EntityGuardian.llIlIIIlIIIIlI[9] != 0), (com.google.common.base.Predicate<?>)new GuardianTargetSelector(this)));
        this.moveHelper = new GuardianMoveHelper(this);
        final float nextFloat = this.rand.nextFloat();
        this.field_175482_b = nextFloat;
        this.field_175484_c = nextFloat;
    }
    
    @Override
    protected String getDeathSound() {
        String s;
        if (lIIlIIIllIIllIII(this.isInWater() ? 1 : 0)) {
            s = EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[5]];
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        else if (lIIlIIIllIIlIlll(this.isElder() ? 1 : 0)) {
            s = EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[6]];
            "".length();
            if ("   ".length() >= (0x15 ^ 0x11)) {
                return null;
            }
        }
        else {
            s = EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[0]];
        }
        return s;
    }
    
    @Override
    protected String getHurtSound() {
        String s;
        if (lIIlIIIllIIllIII(this.isInWater() ? 1 : 0)) {
            s = EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[2]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (lIIlIIIllIIlIlll(this.isElder() ? 1 : 0)) {
            s = EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[17]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            s = EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[3]];
        }
        return s;
    }
    
    @Override
    protected void dropFewItems(final boolean llllllllllllIllIllIlIIllIIIIlllI, final int llllllllllllIllIllIlIIllIIIIllIl) {
        final int llllllllllllIllIllIlIIllIIIlIIII = this.rand.nextInt(EntityGuardian.llIlIIIlIIIIlI[7]) + this.rand.nextInt(llllllllllllIllIllIlIIllIIIIllIl + EntityGuardian.llIlIIIlIIIIlI[8]);
        if (lIIlIIIllIlIIIIl(llllllllllllIllIllIlIIllIIIlIIII)) {
            this.entityDropItem(new ItemStack(Items.prismarine_shard, llllllllllllIllIllIlIIllIIIlIIII, EntityGuardian.llIlIIIlIIIIlI[9]), 1.0f);
            "".length();
        }
        if (lIIlIIIllIlIIlIl(this.rand.nextInt(EntityGuardian.llIlIIIlIIIIlI[7] + llllllllllllIllIllIlIIllIIIIllIl), EntityGuardian.llIlIIIlIIIIlI[8])) {
            this.entityDropItem(new ItemStack(Items.fish, EntityGuardian.llIlIIIlIIIIlI[8], ItemFishFood.FishType.COD.getMetadata()), 1.0f);
            "".length();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else if (lIIlIIIllIlIIlIl(this.rand.nextInt(EntityGuardian.llIlIIIlIIIIlI[7] + llllllllllllIllIllIlIIllIIIIllIl), EntityGuardian.llIlIIIlIIIIlI[8])) {
            this.entityDropItem(new ItemStack(Items.prismarine_crystals, EntityGuardian.llIlIIIlIIIIlI[8], EntityGuardian.llIlIIIlIIIIlI[9]), 1.0f);
            "".length();
        }
        if (lIIlIIIllIIlIlll(llllllllllllIllIllIlIIllIIIIlllI ? 1 : 0) && lIIlIIIllIIlIlll(this.isElder() ? 1 : 0)) {
            this.entityDropItem(new ItemStack(Blocks.sponge, EntityGuardian.llIlIIIlIIIIlI[8], EntityGuardian.llIlIIIlIIIIlI[8]), 1.0f);
            "".length();
        }
    }
    
    @Override
    public boolean isNotColliding() {
        if (lIIlIIIllIIlIlll(this.worldObj.checkNoEntityCollision(this.getEntityBoundingBox(), this) ? 1 : 0) && lIIlIIIllIIlIlll(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() ? 1 : 0)) {
            return EntityGuardian.llIlIIIlIIIIlI[8] != 0;
        }
        return EntityGuardian.llIlIIIlIIIIlI[9] != 0;
    }
    
    @Override
    protected PathNavigate getNewNavigator(final World llllllllllllIllIllIlIIlllIllIIll) {
        return new PathNavigateSwimmer(this, llllllllllllIllIllIlIIlllIllIIll);
    }
    
    @Override
    public void onDataWatcherUpdate(final int llllllllllllIllIllIlIIllIllIllll) {
        super.onDataWatcherUpdate(llllllllllllIllIllIlIIllIllIllll);
        if (lIIlIIIllIIllIll(llllllllllllIllIllIlIIllIllIllll, EntityGuardian.llIlIIIlIIIIlI[10])) {
            if (lIIlIIIllIIlIlll(this.isElder() ? 1 : 0) && lIIlIIIllIIlllII(lIIlIIIllIIllIlI(this.width, 1.0f))) {
                this.setSize(1.9975f, 1.9975f);
                "".length();
                if (" ".length() == ((0x6 ^ 0x5E ^ (0x23 ^ 0x30)) & (0x7C ^ 0x79 ^ (0x13 ^ 0x5D) ^ -" ".length()))) {
                    return;
                }
            }
        }
        else if (lIIlIIIllIIllIll(llllllllllllIllIllIlIIllIllIllll, EntityGuardian.llIlIIIlIIIIlI[11])) {
            this.field_175479_bo = EntityGuardian.llIlIIIlIIIIlI[9];
            this.targetedEntity = null;
        }
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIllIllIlIIlIllllIlIl, final float llllllllllllIllIllIlIIlIlllllIII) {
        if (lIIlIIIllIIllIII(this.func_175472_n() ? 1 : 0) && lIIlIIIllIIllIII(llllllllllllIllIllIlIIlIllllIlIl.isMagicDamage() ? 1 : 0) && lIIlIIIllIIlIlll((llllllllllllIllIllIlIIlIllllIlIl.getSourceOfDamage() instanceof EntityLivingBase) ? 1 : 0)) {
            final EntityLivingBase llllllllllllIllIllIlIIlIllllIlll = (EntityLivingBase)llllllllllllIllIllIlIIlIllllIlIl.getSourceOfDamage();
            if (lIIlIIIllIIllIII(llllllllllllIllIllIlIIlIllllIlIl.isExplosion() ? 1 : 0)) {
                llllllllllllIllIllIlIIlIllllIlll.attackEntityFrom(DamageSource.causeThornsDamage(this), 2.0f);
                "".length();
                llllllllllllIllIllIlIIlIllllIlll.playSound(EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[23]], 0.5f, 1.0f);
            }
        }
        this.wander.makeUpdate();
        return super.attackEntityFrom(llllllllllllIllIllIlIIlIllllIlIl, llllllllllllIllIllIlIIlIlllllIII);
    }
    
    private static int lIIlIIIllIlIIIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIlIIIllIlIIIll(final int llllllllllllIllIllIlIIlIlIlIIIlI, final int llllllllllllIllIllIlIIlIlIlIIIIl) {
        return llllllllllllIllIllIlIIlIlIlIIIlI < llllllllllllIllIllIlIIlIlIlIIIIl;
    }
    
    private void setTargetedEntity(final int llllllllllllIllIllIlIIllIllllllI) {
        this.dataWatcher.updateObject(EntityGuardian.llIlIIIlIIIIlI[11], llllllllllllIllIllIlIIllIllllllI);
    }
    
    public float func_175477_p(final float llllllllllllIllIllIlIIllIIlIllll) {
        return (this.field_175479_bo + llllllllllllIllIllIlIIllIIlIllll) / this.func_175464_ck();
    }
    
    private void func_175476_l(final boolean llllllllllllIllIllIlIIlllIIlIIll) {
        this.setSyncedFlag(EntityGuardian.llIlIIIlIIIIlI[13], llllllllllllIllIllIlIIlllIIlIIll);
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityGuardian.llIlIIIlIIIIlI[9] != 0;
    }
    
    @Override
    public int getTalkInterval() {
        return EntityGuardian.llIlIIIlIIIIlI[16];
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if ((!lIIlIIIllIIlIlll(this.rand.nextInt(EntityGuardian.llIlIIIlIIIIlI[22])) || lIIlIIIllIIllIII(this.worldObj.canBlockSeeSky(new BlockPos(this)) ? 1 : 0)) && lIIlIIIllIIlIlll(super.getCanSpawnHere() ? 1 : 0)) {
            return EntityGuardian.llIlIIIlIIIIlI[8] != 0;
        }
        return EntityGuardian.llIlIIIlIIIIlI[9] != 0;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityGuardian.llIlIIIlIIIIlI[10], EntityGuardian.llIlIIIlIIIIlI[9]);
        this.dataWatcher.addObject(EntityGuardian.llIlIIIlIIIIlI[11], EntityGuardian.llIlIIIlIIIIlI[9]);
    }
    
    public float func_175471_a(final float llllllllllllIllIllIlIIllIIllllIl) {
        return this.field_175484_c + (this.field_175482_b - this.field_175484_c) * llllllllllllIllIllIlIIllIIllllIl;
    }
    
    private static boolean lIIlIIIllIIlllII(final int llllllllllllIllIllIlIIlIlIIIllIl) {
        return llllllllllllIllIllIlIIlIlIIIllIl < 0;
    }
    
    private static int lIIlIIIllIIlllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String lIIlIIIllIIIlIll(final String llllllllllllIllIllIlIIlIllIlIlIl, final String llllllllllllIllIllIlIIlIllIlIlII) {
        try {
            final SecretKeySpec llllllllllllIllIllIlIIlIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIlIIlIllIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIlIIlIllIllIIl.init(EntityGuardian.llIlIIIlIIIIlI[13], llllllllllllIllIllIlIIlIllIllIlI);
            return new String(llllllllllllIllIllIlIIlIllIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlIIlIllIllIII) {
            llllllllllllIllIllIlIIlIllIllIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIIIllIIlIllI();
        lIIlIIIllIIlIlIl();
    }
    
    public EntityLivingBase getTargetedEntity() {
        if (lIIlIIIllIIllIII(this.hasTargetedEntity() ? 1 : 0)) {
            return null;
        }
        if (!lIIlIIIllIIlIlll(this.worldObj.isRemote ? 1 : 0)) {
            return this.getAttackTarget();
        }
        if (lIIlIIIllIIllIIl(this.targetedEntity)) {
            return this.targetedEntity;
        }
        final Entity llllllllllllIllIllIlIIllIlllIlll = this.worldObj.getEntityByID(this.dataWatcher.getWatchableObjectInt(EntityGuardian.llIlIIIlIIIIlI[11]));
        if (lIIlIIIllIIlIlll((llllllllllllIllIllIlIIllIlllIlll instanceof EntityLivingBase) ? 1 : 0)) {
            this.targetedEntity = (EntityLivingBase)llllllllllllIllIllIlIIllIlllIlll;
            return this.targetedEntity;
        }
        return null;
    }
    
    @Override
    protected String getLivingSound() {
        String s;
        if (lIIlIIIllIIllIII(this.isInWater() ? 1 : 0)) {
            s = EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[13]];
            "".length();
            if (-" ".length() >= ((0xD7 ^ 0x89) & ~(0xC5 ^ 0x9B))) {
                return null;
            }
        }
        else if (lIIlIIIllIIlIlll(this.isElder() ? 1 : 0)) {
            s = EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[7]];
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            s = EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[1]];
        }
        return s;
    }
    
    public int func_175464_ck() {
        int n;
        if (lIIlIIIllIIlIlll(this.isElder() ? 1 : 0)) {
            n = EntityGuardian.llIlIIIlIIIIlI[14];
            "".length();
            if (" ".length() != " ".length()) {
                return (41 + 59 - 19 + 55 ^ 76 + 168 - 175 + 104) & (0xD7 ^ 0x95 ^ (0xDA ^ 0xBD) ^ -" ".length());
            }
        }
        else {
            n = EntityGuardian.llIlIIIlIIIIlI[4];
        }
        return n;
    }
    
    private static String lIIlIIIllIIIllII(final String llllllllllllIllIllIlIIlIlIllIIII, final String llllllllllllIllIllIlIIlIlIllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIllIlIIlIlIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlIIlIlIllIIIl.getBytes(StandardCharsets.UTF_8)), EntityGuardian.llIlIIIlIIIIlI[5]), "DES");
            final Cipher llllllllllllIllIllIlIIlIlIllIlII = Cipher.getInstance("DES");
            llllllllllllIllIllIlIIlIlIllIlII.init(EntityGuardian.llIlIIIlIIIIlI[13], llllllllllllIllIllIlIIlIlIllIlIl);
            return new String(llllllllllllIllIllIlIIlIlIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlIIlIlIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlIIlIlIllIIll) {
            llllllllllllIllIllIlIIlIlIllIIll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIIIllIIlIllI() {
        (llIlIIIlIIIIlI = new int[26])[0] = (0xD5 ^ 0xC4 ^ (0x32 ^ 0x29));
        EntityGuardian.llIlIIIlIIIIlI[1] = (0x95 ^ 0xAB ^ (0x42 ^ 0x78));
        EntityGuardian.llIlIIIlIIIIlI[2] = (0x9E ^ 0x9B);
        EntityGuardian.llIlIIIlIIIIlI[3] = (0x7A ^ 0x2C ^ (0x22 ^ 0x73));
        EntityGuardian.llIlIIIlIIIIlI[4] = (0x35 ^ 0x65);
        EntityGuardian.llIlIIIlIIIIlI[5] = (0x53 ^ 0x5B);
        EntityGuardian.llIlIIIlIIIIlI[6] = (0x1A ^ 0x47 ^ (0xEC ^ 0xB8));
        EntityGuardian.llIlIIIlIIIIlI[7] = "   ".length();
        EntityGuardian.llIlIIIlIIIIlI[8] = " ".length();
        EntityGuardian.llIlIIIlIIIIlI[9] = ((0x5E ^ 0x60) & ~(0x68 ^ 0x56));
        EntityGuardian.llIlIIIlIIIIlI[10] = (0x27 ^ 0x54 ^ (0xA1 ^ 0xC2));
        EntityGuardian.llIlIIIlIIIIlI[11] = (0x41 ^ 0x1E ^ (0x29 ^ 0x67));
        EntityGuardian.llIlIIIlIIIIlI[12] = -" ".length();
        EntityGuardian.llIlIIIlIIIIlI[13] = "  ".length();
        EntityGuardian.llIlIIIlIIIIlI[14] = (0xFA ^ 0xC7 ^ " ".length());
        EntityGuardian.llIlIIIlIIIIlI[15] = (-(0xFFFFFBED & 0x5677) & (0xFFFFDFF6 & 0x73FD));
        EntityGuardian.llIlIIIlIIIIlI[16] = 72 + 95 - 113 + 106;
        EntityGuardian.llIlIIIlIIIIlI[17] = (0x59 ^ 0x5F);
        EntityGuardian.llIlIIIlIIIIlI[18] = (0x49 ^ 0x42);
        EntityGuardian.llIlIIIlIIIIlI[19] = (0xFFFF91FC & 0x6F2F);
        EntityGuardian.llIlIIIlIIIIlI[20] = (-(0xFFFFE1D8 & 0x7F2F) & (0xFFFFFFB7 & 0x65FF));
        EntityGuardian.llIlIIIlIIIIlI[21] = (0xFFFFB77E & 0x5FF1);
        EntityGuardian.llIlIIIlIIIIlI[22] = (0x4B ^ 0x68 ^ (0x8B ^ 0xBC));
        EntityGuardian.llIlIIIlIIIIlI[23] = (0x6E ^ 0x62);
        EntityGuardian.llIlIIIlIIIIlI[24] = (0x99 ^ 0x95) + (107 + 173 - 267 + 165) - (138 + 61 - 138 + 106) + (17 + 153 - 68 + 55);
        EntityGuardian.llIlIIIlIIIIlI[25] = (0x82 ^ 0x8F);
    }
    
    private static boolean lIIlIIIllIlIIllI(final Object llllllllllllIllIllIlIIlIlIIlIlIl) {
        return llllllllllllIllIllIlIIlIlIIlIlIl == null;
    }
    
    private static boolean lIIlIIIllIIlIlll(final int llllllllllllIllIllIlIIlIlIIlIIll) {
        return llllllllllllIllIllIlIIlIlIIlIIll != 0;
    }
    
    @Override
    public float getEyeHeight() {
        return this.height * 0.5f;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllIllIlIIlllIlllIIl) {
        super.writeEntityToNBT(llllllllllllIllIllIlIIlllIlllIIl);
        llllllllllllIllIllIlIIlllIlllIIl.setBoolean(EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[8]], this.isElder());
    }
    
    private boolean isSyncedFlagSet(final int llllllllllllIllIllIlIIlllIlIlIlI) {
        if (lIIlIIIllIIlIlll(this.dataWatcher.getWatchableObjectInt(EntityGuardian.llIlIIIlIIIIlI[10]) & llllllllllllIllIllIlIIlllIlIlIlI)) {
            return EntityGuardian.llIlIIIlIIIIlI[8] != 0;
        }
        return EntityGuardian.llIlIIIlIIIIlI[9] != 0;
    }
    
    public void setElder(final boolean llllllllllllIllIllIlIIlllIIIIlll) {
        this.setSyncedFlag(EntityGuardian.llIlIIIlIIIIlI[1], llllllllllllIllIllIlIIlllIIIIlll);
        if (lIIlIIIllIIlIlll(llllllllllllIllIllIlIIlllIIIIlll ? 1 : 0)) {
            this.setSize(1.9975f, 1.9975f);
            this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896);
            this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(8.0);
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(80.0);
            this.enablePersistence();
            this.wander.setExecutionChance(EntityGuardian.llIlIIIlIIIIlI[15]);
        }
    }
    
    public float func_175469_o(final float llllllllllllIllIllIlIIllIIllIlIl) {
        return this.field_175486_bm + (this.field_175485_bl - this.field_175486_bm) * llllllllllllIllIllIlIIllIIllIlIl;
    }
    
    private static boolean lIIlIIIllIIllIll(final int llllllllllllIllIllIlIIlIlIlIlIlI, final int llllllllllllIllIllIlIIlIlIlIlIIl) {
        return llllllllllllIllIllIlIIlIlIlIlIlI == llllllllllllIllIllIlIIlIlIlIlIIl;
    }
    
    private static void lIIlIIIllIIlIlIl() {
        (llIlIIIlIIIIII = new String[EntityGuardian.llIlIIIlIIIIlI[25]])[EntityGuardian.llIlIIIlIIIIlI[9]] = lIIlIIIllIIIlIlI("LwgdMxw=", "jdyVn");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[8]] = lIIlIIIllIIIlIll("gWDTxm7a0D8=", "PlmBk");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[13]] = lIIlIIIllIIIlIlI("Aj4XeSsaMAczJQ4/WzstATVbPigDNA==", "oQuWL");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[7]] = lIIlIIIllIIIllII("F7fEq+LjMN0H0c+yAoPExyE46O6RwEiD", "WTIcG");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[1]] = lIIlIIIllIIIlIlI("IiYrVy46KDsdIC4nZxAtIyw=", "OIIyI");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[2]] = lIIlIIIllIIIlIll("k3AM2mQ63vIQxiDgOj9N8Jyq8IMtMs+I", "aIMRM");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[17]] = lIIlIIIllIIIllII("fM1fzywHFc5PkEiarHKK9yFxh0MXadSo", "McUkN");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[3]] = lIIlIIIllIIIlIlI("JQIUQiE9DAQILykDWAQvPA==", "HmvlF");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[5]] = lIIlIIIllIIIllII("i4FjOIMVCGVjFcgnncqgxBbgvKUtqo3G", "meWND");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[6]] = lIIlIIIllIIIllII("LPGqXs3T9wj74hfsj/84Frfp2H3IPE55cWyBEW+S8B4=", "vXjyf");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[0]] = lIIlIIIllIIIllII("Y0L7ofupRdfZBeQ6zj3vyuLg2ktQ6kXu", "TIayk");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[18]] = lIIlIIIllIIIlIll("fUfQudyrrABk0c/7MazquD17hBAV9scp", "xBljQ");
        EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[23]] = lIIlIIIllIIIllII("O+TTA9hxQ34WoFO8YXc7Ew==", "OHLTm");
    }
    
    public void setElder() {
        this.setElder((boolean)(EntityGuardian.llIlIIIlIIIIlI[8] != 0));
        final float n = 1.0f;
        this.field_175485_bl = n;
        this.field_175486_bm = n;
    }
    
    @Override
    protected void updateAITasks() {
        super.updateAITasks();
        if (lIIlIIIllIIlIlll(this.isElder() ? 1 : 0)) {
            final int llllllllllllIllIllIlIIllIIlIIlIl = EntityGuardian.llIlIIIlIIIIlI[20];
            final int llllllllllllIllIllIlIIllIIlIIlII = EntityGuardian.llIlIIIlIIIIlI[20];
            final int llllllllllllIllIllIlIIllIIlIIIll = EntityGuardian.llIlIIIlIIIIlI[21];
            final int llllllllllllIllIllIlIIllIIlIIIlI = EntityGuardian.llIlIIIlIIIIlI[13];
            if (lIIlIIIllIIllIII((this.ticksExisted + this.getEntityId()) % EntityGuardian.llIlIIIlIIIIlI[20])) {
                final Potion llllllllllllIllIllIlIIllIIlIIIIl = Potion.digSlowdown;
                final Exception llllllllllllIllIllIlIIllIIIllIII = (Exception)this.worldObj.getPlayers((Class<? extends Entity>)EntityPlayerMP.class, (com.google.common.base.Predicate<? super Entity>)new Predicate<EntityPlayerMP>() {
                    private static final /* synthetic */ int[] lIIllIllIllllI;
                    
                    private static boolean llIllIIllllIlII(final int lllllllllllllIIlIlIIllIIlIIlIlIl) {
                        return lllllllllllllIIlIlIIllIIlIIlIlIl != 0;
                    }
                    
                    private static boolean llIllIIllllIIll(final int lllllllllllllIIlIlIIllIIlIIlIIll) {
                        return lllllllllllllIIlIlIIllIIlIIlIIll < 0;
                    }
                    
                    public boolean apply(final EntityPlayerMP lllllllllllllIIlIlIIllIIlIIllIll) {
                        if (llIllIIllllIIll(llIllIIllllIIlI(EntityGuardian.this.getDistanceSqToEntity(lllllllllllllIIlIlIIllIIlIIllIll), 2500.0)) && llIllIIllllIlII(lllllllllllllIIlIlIIllIIlIIllIll.theItemInWorldManager.survivalOrAdventure() ? 1 : 0)) {
                            return EntityGuardian$1.lIIllIllIllllI[0] != 0;
                        }
                        return EntityGuardian$1.lIIllIllIllllI[1] != 0;
                    }
                    
                    private static void llIllIIllllIIIl() {
                        (lIIllIllIllllI = new int[2])[0] = " ".length();
                        EntityGuardian$1.lIIllIllIllllI[1] = ((0x89 ^ 0x8D ^ (0x8E ^ 0xB8)) & (107 + 34 - 41 + 68 ^ 38 + 70 - 60 + 106 ^ -" ".length()));
                    }
                    
                    static {
                        llIllIIllllIIIl();
                    }
                    
                    private static int llIllIIllllIIlI(final double n, final double n2) {
                        return dcmpg(n, n2);
                    }
                }).iterator();
                "".length();
                if (("  ".length() ^ (0x7B ^ 0x7D)) <= -" ".length()) {
                    return;
                }
                while (!lIIlIIIllIIllIII(((Iterator)llllllllllllIllIllIlIIllIIIllIII).hasNext() ? 1 : 0)) {
                    final EntityPlayerMP llllllllllllIllIllIlIIllIIlIIIII = ((Iterator<EntityPlayerMP>)llllllllllllIllIllIlIIllIIIllIII).next();
                    if (!lIIlIIIllIIlIlll(llllllllllllIllIllIlIIllIIlIIIII.isPotionActive(llllllllllllIllIllIlIIllIIlIIIIl) ? 1 : 0) || !lIIlIIIllIlIIIlI(llllllllllllIllIllIlIIllIIlIIIII.getActivePotionEffect(llllllllllllIllIllIlIIllIIlIIIIl).getAmplifier(), EntityGuardian.llIlIIIlIIIIlI[13]) || lIIlIIIllIlIIIll(llllllllllllIllIllIlIIllIIlIIIII.getActivePotionEffect(llllllllllllIllIllIlIIllIIlIIIIl).getDuration(), EntityGuardian.llIlIIIlIIIIlI[20])) {
                        llllllllllllIllIllIlIIllIIlIIIII.playerNetServerHandler.sendPacket(new S2BPacketChangeGameState(EntityGuardian.llIlIIIlIIIIlI[0], 0.0f));
                        llllllllllllIllIllIlIIllIIlIIIII.addPotionEffect(new PotionEffect(llllllllllllIllIllIlIIllIIlIIIIl.id, EntityGuardian.llIlIIIlIIIIlI[21], EntityGuardian.llIlIIIlIIIIlI[13]));
                    }
                }
            }
            if (lIIlIIIllIIllIII(this.hasHome() ? 1 : 0)) {
                this.setHomePosAndDistance(new BlockPos(this), EntityGuardian.llIlIIIlIIIIlI[10]);
            }
        }
    }
    
    public boolean func_175472_n() {
        return this.isSyncedFlagSet(EntityGuardian.llIlIIIlIIIIlI[13]);
    }
    
    @Override
    protected void addRandomDrop() {
        final ItemStack llllllllllllIllIllIlIIllIIIIlIII = WeightedRandom.getRandomItem(this.rand, EntityFishHook.func_174855_j()).getItemStack(this.rand);
        this.entityDropItem(llllllllllllIllIllIlIIllIIIIlIII, 1.0f);
        "".length();
    }
    
    public boolean hasTargetedEntity() {
        if (lIIlIIIllIIlIlll(this.dataWatcher.getWatchableObjectInt(EntityGuardian.llIlIIIlIIIIlI[11]))) {
            return EntityGuardian.llIlIIIlIIIIlI[8] != 0;
        }
        return EntityGuardian.llIlIIIlIIIIlI[9] != 0;
    }
    
    private static boolean lIIlIIIllIIllIIl(final Object llllllllllllIllIllIlIIlIlIIllIll) {
        return llllllllllllIllIllIlIIlIlIIllIll != null;
    }
    
    private static boolean lIIlIIIllIlIIIIl(final int llllllllllllIllIllIlIIlIlIIIlIll) {
        return llllllllllllIllIllIlIIlIlIIIlIll > 0;
    }
    
    private static int lIIlIIIllIIllllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void onLivingUpdate() {
        if (lIIlIIIllIIlIlll(this.worldObj.isRemote ? 1 : 0)) {
            this.field_175484_c = this.field_175482_b;
            if (lIIlIIIllIIllIII(this.isInWater() ? 1 : 0)) {
                this.field_175483_bk = 2.0f;
                if (lIIlIIIllIlIIIIl(lIIlIIIllIIllllI(this.motionY, 0.0)) && lIIlIIIllIIlIlll(this.field_175480_bp ? 1 : 0) && lIIlIIIllIIllIII(this.isSilent() ? 1 : 0)) {
                    this.worldObj.playSound(this.posX, this.posY, this.posZ, EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[18]], 1.0f, 1.0f, (boolean)(EntityGuardian.llIlIIIlIIIIlI[9] != 0));
                }
                int field_175480_bp;
                if (lIIlIIIllIIlllII(lIIlIIIllIIlllll(this.motionY, 0.0)) && lIIlIIIllIIlIlll(this.worldObj.isBlockNormalCube(new BlockPos(this).down(), (boolean)(EntityGuardian.llIlIIIlIIIIlI[9] != 0)) ? 1 : 0)) {
                    field_175480_bp = EntityGuardian.llIlIIIlIIIIlI[8];
                    "".length();
                    if ("   ".length() < -" ".length()) {
                        return;
                    }
                }
                else {
                    field_175480_bp = EntityGuardian.llIlIIIlIIIIlI[9];
                }
                this.field_175480_bp = (field_175480_bp != 0);
                "".length();
                if ("   ".length() < "   ".length()) {
                    return;
                }
            }
            else if (lIIlIIIllIIlIlll(this.func_175472_n() ? 1 : 0)) {
                if (lIIlIIIllIIlllII(lIIlIIIllIlIIIII(this.field_175483_bk, 0.5f))) {
                    this.field_175483_bk = 4.0f;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    this.field_175483_bk += (0.5f - this.field_175483_bk) * 0.1f;
                    "".length();
                    if ("   ".length() == 0) {
                        return;
                    }
                }
            }
            else {
                this.field_175483_bk += (0.125f - this.field_175483_bk) * 0.2f;
            }
            this.field_175482_b += this.field_175483_bk;
            this.field_175486_bm = this.field_175485_bl;
            if (lIIlIIIllIIllIII(this.isInWater() ? 1 : 0)) {
                this.field_175485_bl = this.rand.nextFloat();
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else if (lIIlIIIllIIlIlll(this.func_175472_n() ? 1 : 0)) {
                this.field_175485_bl += (0.0f - this.field_175485_bl) * 0.25f;
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                this.field_175485_bl += (1.0f - this.field_175485_bl) * 0.06f;
            }
            if (lIIlIIIllIIlIlll(this.func_175472_n() ? 1 : 0) && lIIlIIIllIIlIlll(this.isInWater() ? 1 : 0)) {
                final Vec3 llllllllllllIllIllIlIIllIlIlIIIl = this.getLook(0.0f);
                int llllllllllllIllIllIlIIllIlIlIIII = EntityGuardian.llIlIIIlIIIIlI[9];
                "".length();
                if (((0x99 ^ 0xA2) & ~(0x2C ^ 0x17)) >= (0x5 ^ 0x1)) {
                    return;
                }
                while (!lIIlIIIllIlIIIlI(llllllllllllIllIllIlIIllIlIlIIII, EntityGuardian.llIlIIIlIIIIlI[13])) {
                    this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX + (this.rand.nextDouble() - 0.5) * this.width - llllllllllllIllIllIlIIllIlIlIIIl.xCoord * 1.5, this.posY + this.rand.nextDouble() * this.height - llllllllllllIllIllIlIIllIlIlIIIl.yCoord * 1.5, this.posZ + (this.rand.nextDouble() - 0.5) * this.width - llllllllllllIllIllIlIIllIlIlIIIl.zCoord * 1.5, 0.0, 0.0, 0.0, new int[EntityGuardian.llIlIIIlIIIIlI[9]]);
                    ++llllllllllllIllIllIlIIllIlIlIIII;
                }
            }
            if (lIIlIIIllIIlIlll(this.hasTargetedEntity() ? 1 : 0)) {
                if (lIIlIIIllIlIIIll(this.field_175479_bo, this.func_175464_ck())) {
                    this.field_175479_bo += EntityGuardian.llIlIIIlIIIIlI[8];
                }
                final EntityLivingBase llllllllllllIllIllIlIIllIlIIllll = this.getTargetedEntity();
                if (lIIlIIIllIIllIIl(llllllllllllIllIllIlIIllIlIIllll)) {
                    this.getLookHelper().setLookPositionWithEntity(llllllllllllIllIllIlIIllIlIIllll, 90.0f, 90.0f);
                    this.getLookHelper().onUpdateLook();
                    final double llllllllllllIllIllIlIIllIlIIlllI = this.func_175477_p(0.0f);
                    double llllllllllllIllIllIlIIllIlIIllIl = llllllllllllIllIllIlIIllIlIIllll.posX - this.posX;
                    double llllllllllllIllIllIlIIllIlIIllII = llllllllllllIllIllIlIIllIlIIllll.posY + llllllllllllIllIllIlIIllIlIIllll.height * 0.5f - (this.posY + this.getEyeHeight());
                    double llllllllllllIllIllIlIIllIlIIlIll = llllllllllllIllIllIlIIllIlIIllll.posZ - this.posZ;
                    final double llllllllllllIllIllIlIIllIlIIlIlI = Math.sqrt(llllllllllllIllIllIlIIllIlIIllIl * llllllllllllIllIllIlIIllIlIIllIl + llllllllllllIllIllIlIIllIlIIllII * llllllllllllIllIllIlIIllIlIIllII + llllllllllllIllIllIlIIllIlIIlIll * llllllllllllIllIllIlIIllIlIIlIll);
                    llllllllllllIllIllIlIIllIlIIllIl /= llllllllllllIllIllIlIIllIlIIlIlI;
                    llllllllllllIllIllIlIIllIlIIllII /= llllllllllllIllIllIlIIllIlIIlIlI;
                    llllllllllllIllIllIlIIllIlIIlIll /= llllllllllllIllIllIlIIllIlIIlIlI;
                    double llllllllllllIllIllIlIIllIlIIlIIl = this.rand.nextDouble();
                    "".length();
                    if ((0xA3 ^ 0xA7) < 0) {
                        return;
                    }
                    while (!lIIlIIIllIlIIlII(lIIlIIIllIIlllll(llllllllllllIllIllIlIIllIlIIlIIl, llllllllllllIllIllIlIIllIlIIlIlI))) {
                        llllllllllllIllIllIlIIllIlIIlIIl += 1.8 - llllllllllllIllIllIlIIllIlIIlllI + this.rand.nextDouble() * (1.7 - llllllllllllIllIllIlIIllIlIIlllI);
                        this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX + llllllllllllIllIllIlIIllIlIIllIl * llllllllllllIllIllIlIIllIlIIlIIl, this.posY + llllllllllllIllIllIlIIllIlIIllII * llllllllllllIllIllIlIIllIlIIlIIl + this.getEyeHeight(), this.posZ + llllllllllllIllIllIlIIllIlIIlIll * llllllllllllIllIllIlIIllIlIIlIIl, 0.0, 0.0, 0.0, new int[EntityGuardian.llIlIIIlIIIIlI[9]]);
                    }
                }
            }
        }
        if (lIIlIIIllIIlIlll(this.inWater ? 1 : 0)) {
            this.setAir(EntityGuardian.llIlIIIlIIIIlI[19]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIIlIIIllIIlIlll(this.onGround ? 1 : 0)) {
            this.motionY += 0.5;
            this.motionX += (this.rand.nextFloat() * 2.0f - 1.0f) * 0.4f;
            this.motionZ += (this.rand.nextFloat() * 2.0f - 1.0f) * 0.4f;
            this.rotationYaw = this.rand.nextFloat() * 360.0f;
            this.onGround = (EntityGuardian.llIlIIIlIIIIlI[9] != 0);
            this.isAirBorne = (EntityGuardian.llIlIIIlIIIIlI[8] != 0);
        }
        if (lIIlIIIllIIlIlll(this.hasTargetedEntity() ? 1 : 0)) {
            this.rotationYaw = this.rotationYawHead;
        }
        super.onLivingUpdate();
    }
    
    private static boolean lIIlIIIllIIlllIl(final Object llllllllllllIllIllIlIIlIlIIllIII, final Object llllllllllllIllIllIlIIlIlIIlIlll) {
        return llllllllllllIllIllIlIIlIlIIllIII == llllllllllllIllIllIlIIlIlIIlIlll;
    }
    
    private static boolean lIIlIIIllIIllIII(final int llllllllllllIllIllIlIIlIlIIlIIIl) {
        return llllllllllllIllIllIlIIlIlIIlIIIl == 0;
    }
    
    @Override
    public void moveEntityWithHeading(final float llllllllllllIllIllIlIIlIlllIllIl, final float llllllllllllIllIllIlIIlIlllIllII) {
        if (lIIlIIIllIIlIlll(this.isServerWorld() ? 1 : 0)) {
            if (lIIlIIIllIIlIlll(this.isInWater() ? 1 : 0)) {
                this.moveFlying(llllllllllllIllIllIlIIlIlllIllIl, llllllllllllIllIllIlIIlIlllIllII, 0.1f);
                this.moveEntity(this.motionX, this.motionY, this.motionZ);
                this.motionX *= 0.8999999761581421;
                this.motionY *= 0.8999999761581421;
                this.motionZ *= 0.8999999761581421;
                if (lIIlIIIllIIllIII(this.func_175472_n() ? 1 : 0) && lIIlIIIllIlIIllI(this.getAttackTarget())) {
                    this.motionY -= 0.005;
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
            }
            else {
                super.moveEntityWithHeading(llllllllllllIllIllIlIIlIlllIllIl, llllllllllllIllIllIlIIlIlllIllII);
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
        }
        else {
            super.moveEntityWithHeading(llllllllllllIllIllIlIIlIlllIllIl, llllllllllllIllIllIlIIlIlllIllII);
        }
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllIllIlIIlllIllllll) {
        super.readEntityFromNBT(llllllllllllIllIllIlIIlllIllllll);
        this.setElder(llllllllllllIllIllIlIIlllIllllll.getBoolean(EntityGuardian.llIlIIIlIIIIII[EntityGuardian.llIlIIIlIIIIlI[9]]));
    }
    
    @Override
    public int getVerticalFaceSpeed() {
        return EntityGuardian.llIlIIIlIIIIlI[24];
    }
    
    public boolean isElder() {
        return this.isSyncedFlagSet(EntityGuardian.llIlIIIlIIIIlI[1]);
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.5);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0);
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0);
    }
    
    private void setSyncedFlag(final int llllllllllllIllIllIlIIlllIlIIIlI, final boolean llllllllllllIllIllIlIIlllIIlllIl) {
        final int llllllllllllIllIllIlIIlllIlIIIII = this.dataWatcher.getWatchableObjectInt(EntityGuardian.llIlIIIlIIIIlI[10]);
        if (lIIlIIIllIIlIlll(llllllllllllIllIllIlIIlllIIlllIl ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityGuardian.llIlIIIlIIIIlI[10], llllllllllllIllIllIlIIlllIlIIIII | llllllllllllIllIllIlIIlllIlIIIlI);
            "".length();
            if ((11 + 26 + 37 + 93 ^ 43 + 83 - 58 + 95) < -" ".length()) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityGuardian.llIlIIIlIIIIlI[10], llllllllllllIllIllIlIIlllIlIIIII & (llllllllllllIllIllIlIIlllIlIIIlI ^ EntityGuardian.llIlIIIlIIIIlI[12]));
        }
    }
    
    private static String lIIlIIIllIIIlIlI(String llllllllllllIllIllIlIIlIllIIIIlI, final String llllllllllllIllIllIlIIlIllIIIllI) {
        llllllllllllIllIllIlIIlIllIIIIlI = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIllIlIIlIllIIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIlIIlIllIIIlIl = new StringBuilder();
        final char[] llllllllllllIllIllIlIIlIllIIIlII = llllllllllllIllIllIlIIlIllIIIllI.toCharArray();
        int llllllllllllIllIllIlIIlIllIIIIll = EntityGuardian.llIlIIIlIIIIlI[9];
        final int llllllllllllIllIllIlIIlIlIllllIl = (Object)((String)llllllllllllIllIllIlIIlIllIIIIlI).toCharArray();
        final String llllllllllllIllIllIlIIlIlIllllII = (String)llllllllllllIllIllIlIIlIlIllllIl.length;
        float llllllllllllIllIllIlIIlIlIlllIll = EntityGuardian.llIlIIIlIIIIlI[9];
        while (lIIlIIIllIlIIIll((int)llllllllllllIllIllIlIIlIlIlllIll, (int)llllllllllllIllIllIlIIlIlIllllII)) {
            final char llllllllllllIllIllIlIIlIllIIlIII = llllllllllllIllIllIlIIlIlIllllIl[llllllllllllIllIllIlIIlIlIlllIll];
            llllllllllllIllIllIlIIlIllIIIlIl.append((char)(llllllllllllIllIllIlIIlIllIIlIII ^ llllllllllllIllIllIlIIlIllIIIlII[llllllllllllIllIllIlIIlIllIIIIll % llllllllllllIllIllIlIIlIllIIIlII.length]));
            "".length();
            ++llllllllllllIllIllIlIIlIllIIIIll;
            ++llllllllllllIllIllIlIIlIlIlllIll;
            "".length();
            if (((0x3E ^ 0x36 ^ (0x54 ^ 0x12)) & (0x3A ^ 0x62 ^ (0x18 ^ 0xE) ^ -" ".length())) == (0xB3 ^ 0x9B ^ (0x18 ^ 0x34))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIlIIlIllIIIlIl);
    }
    
    private static boolean lIIlIIIllIlIIlIl(final int llllllllllllIllIllIlIIlIlIIllllI, final int llllllllllllIllIllIlIIlIlIIlllIl) {
        return llllllllllllIllIllIlIIlIlIIllllI > llllllllllllIllIllIlIIlIlIIlllIl;
    }
    
    @Override
    protected boolean isValidLightLevel() {
        return EntityGuardian.llIlIIIlIIIIlI[8] != 0;
    }
    
    private static boolean lIIlIIIllIlIIlII(final int llllllllllllIllIllIlIIlIlIIIllll) {
        return llllllllllllIllIllIlIIlIlIIIllll >= 0;
    }
    
    private static int lIIlIIIllIIllIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIlIIIllIlIIIlI(final int llllllllllllIllIllIlIIlIlIlIIllI, final int llllllllllllIllIllIlIIlIlIlIIlIl) {
        return llllllllllllIllIllIlIIlIlIlIIllI >= llllllllllllIllIllIlIIlIlIlIIlIl;
    }
    
    static class GuardianTargetSelector implements Predicate<EntityLivingBase>
    {
        private static final /* synthetic */ int[] lIIIlllIIIlIll;
        private /* synthetic */ EntityGuardian parentEntity;
        
        static {
            llIIIlIlllIIIII();
        }
        
        private static boolean llIIIlIlllIIIll(final int lllllllllllllIIllllllIIIIIIIIllI) {
            return lllllllllllllIIllllllIIIIIIIIllI != 0;
        }
        
        private static boolean llIIIlIlllIIIlI(final int lllllllllllllIIllllllIIIIIIIIlII) {
            return lllllllllllllIIllllllIIIIIIIIlII == 0;
        }
        
        private static int llIIIlIlllIIIIl(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        private static boolean llIIIlIlllIIlII(final int lllllllllllllIIllllllIIIIIIIIIlI) {
            return lllllllllllllIIllllllIIIIIIIIIlI > 0;
        }
        
        public boolean apply(final EntityLivingBase lllllllllllllIIllllllIIIIIIIllII) {
            if ((!llIIIlIlllIIIlI((lllllllllllllIIllllllIIIIIIIllII instanceof EntityPlayer) ? 1 : 0) || llIIIlIlllIIIll((lllllllllllllIIllllllIIIIIIIllII instanceof EntitySquid) ? 1 : 0)) && llIIIlIlllIIlII(llIIIlIlllIIIIl(lllllllllllllIIllllllIIIIIIIllII.getDistanceSqToEntity(this.parentEntity), 9.0))) {
                return GuardianTargetSelector.lIIIlllIIIlIll[0] != 0;
            }
            return GuardianTargetSelector.lIIIlllIIIlIll[1] != 0;
        }
        
        private static void llIIIlIlllIIIII() {
            (lIIIlllIIIlIll = new int[2])[0] = " ".length();
            GuardianTargetSelector.lIIIlllIIIlIll[1] = ((0x9B ^ 0xB1 ^ (0x5D ^ 0x40)) & (0xF ^ 0x73 ^ (0xE4 ^ 0xAF) ^ -" ".length()));
        }
        
        public GuardianTargetSelector() {
        }
    }
    
    static class GuardianMoveHelper extends EntityMoveHelper
    {
        private /* synthetic */ EntityGuardian entityGuardian;
        private static final /* synthetic */ int[] lIIllllllIllIl;
        
        private static boolean llIlllllIIlIlll(final int lllllllllllllIIlIIIllllllIIlIllI) {
            return lllllllllllllIIlIIIllllllIIlIllI == 0;
        }
        
        public GuardianMoveHelper() {
            super(EntityGuardian.this);
        }
        
        private static boolean llIlllllIIlIllI(final int lllllllllllllIIlIIIllllllIIllIII) {
            return lllllllllllllIIlIIIllllllIIllIII != 0;
        }
        
        @Override
        public void onUpdateMoveHelper() {
            if (llIlllllIIlIllI(this.update ? 1 : 0) && llIlllllIIlIlll(this.entityGuardian.getNavigator().noPath() ? 1 : 0)) {
                final double lllllllllllllIIlIIIllllllIlllIlI = this.posX - this.entityGuardian.posX;
                double lllllllllllllIIlIIIllllllIlllIIl = this.posY - this.entityGuardian.posY;
                final double lllllllllllllIIlIIIllllllIlllIII = this.posZ - this.entityGuardian.posZ;
                double lllllllllllllIIlIIIllllllIllIlll = lllllllllllllIIlIIIllllllIlllIlI * lllllllllllllIIlIIIllllllIlllIlI + lllllllllllllIIlIIIllllllIlllIIl * lllllllllllllIIlIIIllllllIlllIIl + lllllllllllllIIlIIIllllllIlllIII * lllllllllllllIIlIIIllllllIlllIII;
                lllllllllllllIIlIIIllllllIllIlll = MathHelper.sqrt_double(lllllllllllllIIlIIIllllllIllIlll);
                lllllllllllllIIlIIIllllllIlllIIl /= lllllllllllllIIlIIIllllllIllIlll;
                final float lllllllllllllIIlIIIllllllIllIllI = (float)(MathHelper.func_181159_b(lllllllllllllIIlIIIllllllIlllIII, lllllllllllllIIlIIIllllllIlllIlI) * 180.0 / 3.141592653589793) - 90.0f;
                this.entityGuardian.rotationYaw = this.limitAngle(this.entityGuardian.rotationYaw, lllllllllllllIIlIIIllllllIllIllI, 30.0f);
                this.entityGuardian.renderYawOffset = this.entityGuardian.rotationYaw;
                final float lllllllllllllIIlIIIllllllIllIlIl = (float)(this.speed * this.entityGuardian.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue());
                this.entityGuardian.setAIMoveSpeed(this.entityGuardian.getAIMoveSpeed() + (lllllllllllllIIlIIIllllllIllIlIl - this.entityGuardian.getAIMoveSpeed()) * 0.125f);
                double lllllllllllllIIlIIIllllllIllIlII = Math.sin((this.entityGuardian.ticksExisted + this.entityGuardian.getEntityId()) * 0.5) * 0.05;
                final double lllllllllllllIIlIIIllllllIllIIll = Math.cos(this.entityGuardian.rotationYaw * 3.1415927f / 180.0f);
                final double lllllllllllllIIlIIIllllllIllIIlI = Math.sin(this.entityGuardian.rotationYaw * 3.1415927f / 180.0f);
                final EntityGuardian entityGuardian = this.entityGuardian;
                entityGuardian.motionX += lllllllllllllIIlIIIllllllIllIlII * lllllllllllllIIlIIIllllllIllIIll;
                final EntityGuardian entityGuardian2 = this.entityGuardian;
                entityGuardian2.motionZ += lllllllllllllIIlIIIllllllIllIlII * lllllllllllllIIlIIIllllllIllIIlI;
                lllllllllllllIIlIIIllllllIllIlII = Math.sin((this.entityGuardian.ticksExisted + this.entityGuardian.getEntityId()) * 0.75) * 0.05;
                final EntityGuardian entityGuardian3 = this.entityGuardian;
                entityGuardian3.motionY += lllllllllllllIIlIIIllllllIllIlII * (lllllllllllllIIlIIIllllllIllIIlI + lllllllllllllIIlIIIllllllIllIIll) * 0.25;
                final EntityGuardian entityGuardian4 = this.entityGuardian;
                entityGuardian4.motionY += this.entityGuardian.getAIMoveSpeed() * lllllllllllllIIlIIIllllllIlllIIl * 0.1;
                final EntityLookHelper lllllllllllllIIlIIIllllllIllIIIl = this.entityGuardian.getLookHelper();
                final double lllllllllllllIIlIIIllllllIllIIII = this.entityGuardian.posX + lllllllllllllIIlIIIllllllIlllIlI / lllllllllllllIIlIIIllllllIllIlll * 2.0;
                final double lllllllllllllIIlIIIllllllIlIllll = this.entityGuardian.getEyeHeight() + this.entityGuardian.posY + lllllllllllllIIlIIIllllllIlllIIl / lllllllllllllIIlIIIllllllIllIlll * 1.0;
                final double lllllllllllllIIlIIIllllllIlIlllI = this.entityGuardian.posZ + lllllllllllllIIlIIIllllllIlllIII / lllllllllllllIIlIIIllllllIllIlll * 2.0;
                double lllllllllllllIIlIIIllllllIlIllIl = lllllllllllllIIlIIIllllllIllIIIl.getLookPosX();
                double lllllllllllllIIlIIIllllllIlIllII = lllllllllllllIIlIIIllllllIllIIIl.getLookPosY();
                double lllllllllllllIIlIIIllllllIlIlIll = lllllllllllllIIlIIIllllllIllIIIl.getLookPosZ();
                if (llIlllllIIlIlll(lllllllllllllIIlIIIllllllIllIIIl.getIsLooking() ? 1 : 0)) {
                    lllllllllllllIIlIIIllllllIlIllIl = lllllllllllllIIlIIIllllllIllIIII;
                    lllllllllllllIIlIIIllllllIlIllII = lllllllllllllIIlIIIllllllIlIllll;
                    lllllllllllllIIlIIIllllllIlIlIll = lllllllllllllIIlIIIllllllIlIlllI;
                }
                this.entityGuardian.getLookHelper().setLookPosition(lllllllllllllIIlIIIllllllIlIllIl + (lllllllllllllIIlIIIllllllIllIIII - lllllllllllllIIlIIIllllllIlIllIl) * 0.125, lllllllllllllIIlIIIllllllIlIllII + (lllllllllllllIIlIIIllllllIlIllll - lllllllllllllIIlIIIllllllIlIllII) * 0.125, lllllllllllllIIlIIIllllllIlIlIll + (lllllllllllllIIlIIIllllllIlIlllI - lllllllllllllIIlIIIllllllIlIlIll) * 0.125, 10.0f, 40.0f);
                EntityGuardian.this.func_175476_l((boolean)(GuardianMoveHelper.lIIllllllIllIl[0] != 0));
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            else {
                this.entityGuardian.setAIMoveSpeed(0.0f);
                EntityGuardian.this.func_175476_l((boolean)(GuardianMoveHelper.lIIllllllIllIl[1] != 0));
            }
        }
        
        static {
            llIlllllIIlIlIl();
        }
        
        private static void llIlllllIIlIlIl() {
            (lIIllllllIllIl = new int[2])[0] = " ".length();
            GuardianMoveHelper.lIIllllllIllIl[1] = ((0xB3 ^ 0x86) & ~(0x18 ^ 0x2D));
        }
    }
    
    static class AIGuardianAttack extends EntityAIBase
    {
        private /* synthetic */ int tickCounter;
        private static final /* synthetic */ int[] llIIIlIIIlIIll;
        private /* synthetic */ EntityGuardian theEntity;
        
        @Override
        public void updateTask() {
            final EntityLivingBase llllllllllllIlllIllIIIllIIlllIlI = this.theEntity.getAttackTarget();
            this.theEntity.getNavigator().clearPathEntity();
            this.theEntity.getLookHelper().setLookPositionWithEntity(llllllllllllIlllIllIIIllIIlllIlI, 90.0f, 90.0f);
            if (lIIIlIIIllIIIlIl(this.theEntity.canEntityBeSeen(llllllllllllIlllIllIIIllIIlllIlI) ? 1 : 0)) {
                this.theEntity.setAttackTarget(null);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.tickCounter += AIGuardianAttack.llIIIlIIIlIIll[1];
                if (lIIIlIIIllIIIlIl(this.tickCounter)) {
                    EntityGuardian.this.setTargetedEntity(this.theEntity.getAttackTarget().getEntityId());
                    this.theEntity.worldObj.setEntityState(this.theEntity, (byte)AIGuardianAttack.llIIIlIIIlIIll[4]);
                    "".length();
                    if ((0x4 ^ 0x0) <= " ".length()) {
                        return;
                    }
                }
                else if (lIIIlIIIllIIIlll(this.tickCounter, this.theEntity.func_175464_ck())) {
                    float llllllllllllIlllIllIIIllIIlllIIl = 1.0f;
                    if (lIIIlIIIllIIlIII(this.theEntity.worldObj.getDifficulty(), EnumDifficulty.HARD)) {
                        llllllllllllIlllIllIIIllIIlllIIl += 2.0f;
                    }
                    if (lIIIlIIIllIIIIll(this.theEntity.isElder() ? 1 : 0)) {
                        llllllllllllIlllIllIIIllIIlllIIl += 2.0f;
                    }
                    llllllllllllIlllIllIIIllIIlllIlI.attackEntityFrom(DamageSource.causeIndirectMagicDamage(this.theEntity, this.theEntity), llllllllllllIlllIllIIIllIIlllIIl);
                    "".length();
                    llllllllllllIlllIllIIIllIIlllIlI.attackEntityFrom(DamageSource.causeMobDamage(this.theEntity), (float)this.theEntity.getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue());
                    "".length();
                    this.theEntity.setAttackTarget(null);
                    "".length();
                    if ("   ".length() == ("  ".length() & ("  ".length() ^ -" ".length()))) {
                        return;
                    }
                }
                else if (!lIIIlIIIllIIIlll(this.tickCounter, AIGuardianAttack.llIIIlIIIlIIll[5]) || lIIIlIIIllIIIlIl(this.tickCounter % AIGuardianAttack.llIIIlIIIlIIll[6])) {}
                super.updateTask();
            }
        }
        
        private static boolean lIIIlIIIllIIlIII(final Object llllllllllllIlllIllIIIllIIlIllIl, final Object llllllllllllIlllIllIIIllIIlIllII) {
            return llllllllllllIlllIllIIIllIIlIllIl == llllllllllllIlllIllIIIllIIlIllII;
        }
        
        private static boolean lIIIlIIIllIIIIll(final int llllllllllllIlllIllIIIllIIlIlIlI) {
            return llllllllllllIlllIllIIIllIIlIlIlI != 0;
        }
        
        @Override
        public void resetTask() {
            EntityGuardian.this.setTargetedEntity(AIGuardianAttack.llIIIlIIIlIIll[2]);
            this.theEntity.setAttackTarget(null);
            this.theEntity.wander.makeUpdate();
        }
        
        private static boolean lIIIlIIIllIIIlIl(final int llllllllllllIlllIllIIIllIIlIlIII) {
            return llllllllllllIlllIllIIIllIIlIlIII == 0;
        }
        
        @Override
        public boolean continueExecuting() {
            if (lIIIlIIIllIIIIll(super.continueExecuting() ? 1 : 0) && (!lIIIlIIIllIIIlIl(this.theEntity.isElder() ? 1 : 0) || lIIIlIIIllIIIllI(lIIIlIIIllIIIlII(this.theEntity.getDistanceSqToEntity(this.theEntity.getAttackTarget()), 9.0)))) {
                return AIGuardianAttack.llIIIlIIIlIIll[1] != 0;
            }
            return AIGuardianAttack.llIIIlIIIlIIll[2] != 0;
        }
        
        @Override
        public void startExecuting() {
            this.tickCounter = AIGuardianAttack.llIIIlIIIlIIll[3];
            this.theEntity.getNavigator().clearPathEntity();
            this.theEntity.getLookHelper().setLookPositionWithEntity(this.theEntity.getAttackTarget(), 90.0f, 90.0f);
            this.theEntity.isAirBorne = (AIGuardianAttack.llIIIlIIIlIIll[1] != 0);
        }
        
        private static boolean lIIIlIIIllIIIlll(final int llllllllllllIlllIllIIIllIIllIIll, final int llllllllllllIlllIllIIIllIIllIIlI) {
            return llllllllllllIlllIllIIIllIIllIIll >= llllllllllllIlllIllIIIllIIllIIlI;
        }
        
        private static void lIIIlIIIllIIIIIl() {
            (llIIIlIIIlIIll = new int[7])[0] = "   ".length();
            AIGuardianAttack.llIIIlIIIlIIll[1] = " ".length();
            AIGuardianAttack.llIIIlIIIlIIll[2] = ((0xD ^ 0x20) & ~(0x30 ^ 0x1D));
            AIGuardianAttack.llIIIlIIIlIIll[3] = -(0x42 ^ 0x69 ^ (0xA2 ^ 0x83));
            AIGuardianAttack.llIIIlIIIlIIll[4] = (0xD0 ^ 0x9D ^ (0x9F ^ 0xC7));
            AIGuardianAttack.llIIIlIIIlIIll[5] = (0x54 ^ 0x68);
            AIGuardianAttack.llIIIlIIIlIIll[6] = (0x67 ^ 0x73);
        }
        
        private static int lIIIlIIIllIIIlII(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        private static boolean lIIIlIIIllIIIllI(final int llllllllllllIlllIllIIIllIIlIIllI) {
            return llllllllllllIlllIllIIIllIIlIIllI > 0;
        }
        
        @Override
        public boolean shouldExecute() {
            final EntityLivingBase llllllllllllIlllIllIIIllIlIIlIlI = this.theEntity.getAttackTarget();
            if (lIIIlIIIllIIIIlI(llllllllllllIlllIllIIIllIlIIlIlI) && lIIIlIIIllIIIIll(llllllllllllIlllIllIIIllIlIIlIlI.isEntityAlive() ? 1 : 0)) {
                return AIGuardianAttack.llIIIlIIIlIIll[1] != 0;
            }
            return AIGuardianAttack.llIIIlIIIlIIll[2] != 0;
        }
        
        static {
            lIIIlIIIllIIIIIl();
        }
        
        public AIGuardianAttack() {
            this.setMutexBits(AIGuardianAttack.llIIIlIIIlIIll[0]);
        }
        
        private static boolean lIIIlIIIllIIIIlI(final Object llllllllllllIlllIllIIIllIIllIIII) {
            return llllllllllllIlllIllIIIllIIllIIII != null;
        }
    }
}
