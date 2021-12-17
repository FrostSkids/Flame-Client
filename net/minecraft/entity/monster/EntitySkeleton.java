// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;
import java.util.Calendar;
import net.minecraft.init.Blocks;
import net.minecraft.world.WorldProviderHell;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.ai.EntityAIFleeSun;
import net.minecraft.entity.ai.EntityAIRestrictSun;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.IRangedAttackMob;

public class EntitySkeleton extends EntityMob implements IRangedAttackMob
{
    private static final /* synthetic */ String[] lIllIlIIIlllII;
    private /* synthetic */ EntityAIAttackOnCollide aiAttackOnCollide;
    private static final /* synthetic */ int[] lIllIlIIIllllI;
    private /* synthetic */ EntityAIArrowAttack aiArrowAttack;
    
    @Override
    protected String getHurtSound() {
        return EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[3]];
    }
    
    @Override
    protected Item getDropItem() {
        return Items.arrow;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIIIIIIIlllIllIIIll) {
        super.writeEntityToNBT(lllllllllllllIIIIIIIIlllIllIIIll);
        lllllllllllllIIIIIIIIlllIllIIIll.setByte(EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[17]], (byte)this.getSkeletonType());
    }
    
    @Override
    public void onLivingUpdate() {
        if (llllllIIIIllIlI(this.worldObj.isDaytime() ? 1 : 0) && llllllIIIIllIIl(this.worldObj.isRemote ? 1 : 0)) {
            final float lllllllllllllIIIIIIIIlllllIlIlll = this.getBrightness(1.0f);
            final BlockPos lllllllllllllIIIIIIIIlllllIlIllI = new BlockPos(this.posX, (double)Math.round(this.posY), this.posZ);
            if (llllllIIIIllllI(llllllIIIIlllII(lllllllllllllIIIIIIIIlllllIlIlll, 0.5f)) && llllllIIIIlllll(llllllIIIIlllIl(this.rand.nextFloat() * 30.0f, (lllllllllllllIIIIIIIIlllllIlIlll - 0.4f) * 2.0f)) && llllllIIIIllIlI(this.worldObj.canSeeSky(lllllllllllllIIIIIIIIlllllIlIllI) ? 1 : 0)) {
                boolean lllllllllllllIIIIIIIIlllllIlIlIl = EntitySkeleton.lIllIlIIIllllI[3] != 0;
                final ItemStack lllllllllllllIIIIIIIIlllllIlIlII = this.getEquipmentInSlot(EntitySkeleton.lIllIlIIIllllI[6]);
                if (llllllIIIIllIII(lllllllllllllIIIIIIIIlllllIlIlII)) {
                    if (llllllIIIIllIlI(lllllllllllllIIIIIIIIlllllIlIlII.isItemStackDamageable() ? 1 : 0)) {
                        lllllllllllllIIIIIIIIlllllIlIlII.setItemDamage(lllllllllllllIIIIIIIIlllllIlIlII.getItemDamage() + this.rand.nextInt(EntitySkeleton.lIllIlIIIllllI[4]));
                        if (llllllIIIlIIIII(lllllllllllllIIIIIIIIlllllIlIlII.getItemDamage(), lllllllllllllIIIIIIIIlllllIlIlII.getMaxDamage())) {
                            this.renderBrokenItemStack(lllllllllllllIIIIIIIIlllllIlIlII);
                            this.setCurrentItemOrArmor(EntitySkeleton.lIllIlIIIllllI[6], null);
                        }
                    }
                    lllllllllllllIIIIIIIIlllllIlIlIl = (EntitySkeleton.lIllIlIIIllllI[2] != 0);
                }
                if (llllllIIIIllIlI(lllllllllllllIIIIIIIIlllllIlIlIl ? 1 : 0)) {
                    this.setFire(EntitySkeleton.lIllIlIIIllllI[10]);
                }
            }
        }
        if (llllllIIIIllIlI(this.worldObj.isRemote ? 1 : 0) && llllllIIIIllIll(this.getSkeletonType(), EntitySkeleton.lIllIlIIIllllI[3])) {
            this.setSize(0.72f, 2.535f);
        }
        super.onLivingUpdate();
    }
    
    @Override
    public float getEyeHeight() {
        float eyeHeight;
        if (llllllIIIIllIll(this.getSkeletonType(), EntitySkeleton.lIllIlIIIllllI[3])) {
            eyeHeight = super.getEyeHeight();
            "".length();
            if ((0x8B ^ 0xB5 ^ (0x1E ^ 0x24)) <= "   ".length()) {
                return 0.0f;
            }
        }
        else {
            eyeHeight = 1.74f;
        }
        return eyeHeight;
    }
    
    @Override
    protected String getDeathSound() {
        return EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[4]];
    }
    
    private static boolean llllllIIIlIIlll(final int lllllllllllllIIIIIIIIlllIIIlIlll, final int lllllllllllllIIIIIIIIlllIIIlIllI) {
        return lllllllllllllIIIIIIIIlllIIIlIlll < lllllllllllllIIIIIIIIlllIIIlIllI;
    }
    
    @Override
    protected void addRandomDrop() {
        if (llllllIIIIllIll(this.getSkeletonType(), EntitySkeleton.lIllIlIIIllllI[3])) {
            this.entityDropItem(new ItemStack(Items.skull, EntitySkeleton.lIllIlIIIllllI[3], EntitySkeleton.lIllIlIIIllllI[3]), 0.0f);
            "".length();
        }
    }
    
    private static boolean llllllIIIlIIlII(final Object lllllllllllllIIIIIIIIlllIIIIlllI) {
        return lllllllllllllIIIIIIIIlllIIIIlllI == null;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIIIIIIIlllIllIlIlI) {
        super.readEntityFromNBT(lllllllllllllIIIIIIIIlllIllIlIlI);
        if (llllllIIIIllIlI(lllllllllllllIIIIIIIIlllIllIlIlI.hasKey(EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[11]], EntitySkeleton.lIllIlIIIllllI[16]) ? 1 : 0)) {
            final int lllllllllllllIIIIIIIIlllIllIllII = lllllllllllllIIIIIIIIlllIllIlIlI.getByte(EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[7]]);
            this.setSkeletonType(lllllllllllllIIIIIIIIlllIllIllII);
        }
        this.setCombatTask();
    }
    
    static {
        llllllIIIIlIlll();
        llllllIIIIIllIl();
    }
    
    @Override
    public double getYOffset() {
        double n;
        if (llllllIIIIllIlI(this.isChild() ? 1 : 0)) {
            n = 0.0;
            "".length();
            if (" ".length() > (0xA4 ^ 0xA0)) {
                return 0.0;
            }
        }
        else {
            n = -0.35;
        }
        return n;
    }
    
    private static boolean llllllIIIIlllll(final int lllllllllllllIIIIIIIIlllIIIIIllI) {
        return lllllllllllllIIIIIIIIlllIIIIIllI < 0;
    }
    
    @Override
    protected String getLivingSound() {
        return EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[2]];
    }
    
    public void setSkeletonType(final int lllllllllllllIIIIIIIIlllIlllIIlI) {
        this.dataWatcher.updateObject(EntitySkeleton.lIllIlIIIllllI[8], (byte)lllllllllllllIIIIIIIIlllIlllIIlI);
        int isImmuneToFire;
        if (llllllIIIIllIll(lllllllllllllIIIIIIIIlllIlllIIlI, EntitySkeleton.lIllIlIIIllllI[3])) {
            isImmuneToFire = EntitySkeleton.lIllIlIIIllllI[3];
            "".length();
            if ("   ".length() > (124 + 97 - 101 + 24 ^ 76 + 46 - 80 + 106)) {
                return;
            }
        }
        else {
            isImmuneToFire = EntitySkeleton.lIllIlIIIllllI[2];
        }
        this.isImmuneToFire = (isImmuneToFire != 0);
        if (llllllIIIIllIll(lllllllllllllIIIIIIIIlllIlllIIlI, EntitySkeleton.lIllIlIIIllllI[3])) {
            this.setSize(0.72f, 2.535f);
            "".length();
            if (" ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            this.setSize(0.6f, 1.95f);
        }
    }
    
    public void setCombatTask() {
        this.tasks.removeTask(this.aiAttackOnCollide);
        this.tasks.removeTask(this.aiArrowAttack);
        final ItemStack lllllllllllllIIIIIIIIllllIIIllll = this.getHeldItem();
        if (llllllIIIIllIII(lllllllllllllIIIIIIIIllllIIIllll) && llllllIIIlIIlIl(lllllllllllllIIIIIIIIllllIIIllll.getItem(), Items.bow)) {
            this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[6], this.aiArrowAttack);
            "".length();
            if (-" ".length() == "   ".length()) {
                return;
            }
        }
        else {
            this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[6], this.aiAttackOnCollide);
        }
    }
    
    @Override
    protected void playStepSound(final BlockPos lllllllllllllIIIIIIIIllllllIIlll, final Block lllllllllllllIIIIIIIIllllllIIllI) {
        this.playSound(EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[5]], 0.15f, 1.0f);
    }
    
    private static boolean llllllIIIIllIlI(final int lllllllllllllIIIIIIIIlllIIIIllII) {
        return lllllllllllllIIIIIIIIlllIIIIllII != 0;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntitySkeleton.lIllIlIIIllllI[8], new Byte((byte)EntitySkeleton.lIllIlIIIllllI[2]));
    }
    
    private static boolean llllllIIIIllIII(final Object lllllllllllllIIIIIIIIlllIIIlIlII) {
        return lllllllllllllIIIIIIIIlllIIIlIlII != null;
    }
    
    private static String llllllIIIIIllII(final String lllllllllllllIIIIIIIIlllIlIIllII, final String lllllllllllllIIIIIIIIlllIlIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIlllIlIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIlllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), EntitySkeleton.lIllIlIIIllllI[10]), "DES");
            final Cipher lllllllllllllIIIIIIIIlllIlIIlllI = Cipher.getInstance("DES");
            lllllllllllllIIIIIIIIlllIlIIlllI.init(EntitySkeleton.lIllIlIIIllllI[4], lllllllllllllIIIIIIIIlllIlIIllll);
            return new String(lllllllllllllIIIIIIIIlllIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIlllIlIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIlllIlIIllIl) {
            lllllllllllllIIIIIIIIlllIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllllIIIIllIIl(final int lllllllllllllIIIIIIIIlllIIIIlIlI) {
        return lllllllllllllIIIIIIIIlllIIIIlIlI == 0;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
    }
    
    private static void llllllIIIIlIlll() {
        (lIllIlIIIllllI = new int[18])[0] = (62 + 80 - 23 + 45 ^ 167 + 163 - 236 + 82);
        EntitySkeleton.lIllIlIIIllllI[1] = (0x6F ^ 0x53);
        EntitySkeleton.lIllIlIIIllllI[2] = ((148 + 129 - 233 + 123 ^ 121 + 58 - 165 + 167) & (55 + 70 - 3 + 11 ^ 47 + 59 + 11 + 34 ^ -" ".length()));
        EntitySkeleton.lIllIlIIIllllI[3] = " ".length();
        EntitySkeleton.lIllIlIIIllllI[4] = "  ".length();
        EntitySkeleton.lIllIlIIIllllI[5] = "   ".length();
        EntitySkeleton.lIllIlIIIllllI[6] = (145 + 60 - 160 + 125 ^ 77 + 152 - 91 + 36);
        EntitySkeleton.lIllIlIIIllllI[7] = (0x59 ^ 0x52 ^ (0x4B ^ 0x46));
        EntitySkeleton.lIllIlIIIllllI[8] = (0xD3 ^ 0xA0 ^ (0xF ^ 0x71));
        EntitySkeleton.lIllIlIIIllllI[9] = 26 + 5 + 123 + 46;
        EntitySkeleton.lIllIlIIIllllI[10] = (0xA7 ^ 0xAF);
        EntitySkeleton.lIllIlIIIllllI[11] = (" ".length() ^ (0x75 ^ 0x71));
        EntitySkeleton.lIllIlIIIllllI[12] = (0x29 ^ 0x23);
        EntitySkeleton.lIllIlIIIllllI[13] = (0xD0 ^ 0xC6 ^ (0xBA ^ 0xB3));
        EntitySkeleton.lIllIlIIIllllI[14] = (0x7D ^ 0x73);
        EntitySkeleton.lIllIlIIIllllI[15] = (110 + 112 - 40 + 17 ^ 22 + 69 - 48 + 120);
        EntitySkeleton.lIllIlIIIllllI[16] = (0x51 ^ 0x32);
        EntitySkeleton.lIllIlIIIllllI[17] = (159 + 124 - 190 + 86 ^ 173 + 177 - 309 + 139);
    }
    
    private static String llllllIIIIIlIIl(final String lllllllllllllIIIIIIIIlllIIllllIl, final String lllllllllllllIIIIIIIIlllIIllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIlllIlIIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIlllIIllllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIlllIlIIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIlllIlIIIIIl.init(EntitySkeleton.lIllIlIIIllllI[4], lllllllllllllIIIIIIIIlllIlIIIIlI);
            return new String(lllllllllllllIIIIIIIIlllIlIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIlllIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIlllIlIIIIII) {
            lllllllllllllIIIIIIIIlllIlIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static int llllllIIIlIIIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public boolean attackEntityAsMob(final Entity lllllllllllllIIIIIIIIllllllIIIIl) {
        if (llllllIIIIllIlI(super.attackEntityAsMob(lllllllllllllIIIIIIIIllllllIIIIl) ? 1 : 0)) {
            if (llllllIIIIllIll(this.getSkeletonType(), EntitySkeleton.lIllIlIIIllllI[3]) && llllllIIIIllIlI((lllllllllllllIIIIIIIIllllllIIIIl instanceof EntityLivingBase) ? 1 : 0)) {
                ((EntityLivingBase)lllllllllllllIIIIIIIIllllllIIIIl).addPotionEffect(new PotionEffect(Potion.wither.id, EntitySkeleton.lIllIlIIIllllI[9]));
            }
            return EntitySkeleton.lIllIlIIIllllI[3] != 0;
        }
        return EntitySkeleton.lIllIlIIIllllI[2] != 0;
    }
    
    private static void llllllIIIIIllIl() {
        (lIllIlIIIlllII = new String[EntitySkeleton.lIllIlIIIllllI[10]])[EntitySkeleton.lIllIlIIIllllI[2]] = llllllIIIIIlIIl("ZtCTaieIBbVrAFzup+V9SWNymFxnz0pS", "CumLN");
        EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[3]] = llllllIIIIIlIll("HSYjTBobLC0HHR8nbwocAj0=", "pIAbi");
        EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[4]] = llllllIIIIIlIll("PSwMQzs7JgIIPD8tQAktMTcG", "PCnmH");
        EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[5]] = llllllIIIIIllII("YXu5Ywy326PH9x6Y5skgpcVwBwaxJ8rf", "OadOA");
        EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[6]] = llllllIIIIIlIll("HggKLiUBRwYlPQ==", "lidJJ");
        EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[11]] = llllllIIIIIlIIl("VSLGnriRVH/8/s7YdVz4Hg==", "QysJV");
        EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[7]] = llllllIIIIIlIIl("J1UOg4318Rd1A7XlcFRL1A==", "Osovj");
        EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[17]] = llllllIIIIIlIll("HgAhKAE5BCoQHT0O", "MkDDd");
    }
    
    public EntitySkeleton(final World lllllllllllllIIIIIIIIlllllllIIll) {
        super(lllllllllllllIIIIIIIIlllllllIIll);
        this.aiArrowAttack = new EntityAIArrowAttack(this, 1.0, EntitySkeleton.lIllIlIIIllllI[0], EntitySkeleton.lIllIlIIIllllI[1], 15.0f);
        this.aiAttackOnCollide = new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2, (boolean)(EntitySkeleton.lIllIlIIIllllI[2] != 0));
        this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[3], new EntityAISwimming(this));
        this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[4], new EntityAIRestrictSun(this));
        this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[5], new EntityAIFleeSun(this, 1.0));
        this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[5], new EntityAIAvoidEntity<Object>(this, EntityWolf.class, 6.0f, 1.0, 1.2));
        this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[6], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[7], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[7], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntitySkeleton.lIllIlIIIllllI[3], new EntityAIHurtByTarget(this, (boolean)(EntitySkeleton.lIllIlIIIllllI[2] != 0), new Class[EntitySkeleton.lIllIlIIIllllI[2]]));
        this.targetTasks.addTask(EntitySkeleton.lIllIlIIIllllI[4], new EntityAINearestAttackableTarget<Object>(this, EntityPlayer.class, (boolean)(EntitySkeleton.lIllIlIIIllllI[3] != 0)));
        this.targetTasks.addTask(EntitySkeleton.lIllIlIIIllllI[5], new EntityAINearestAttackableTarget<Object>(this, EntityIronGolem.class, (boolean)(EntitySkeleton.lIllIlIIIllllI[3] != 0)));
        if (llllllIIIIllIII(lllllllllllllIIIIIIIIlllllllIIll) && llllllIIIIllIIl(lllllllllllllIIIIIIIIlllllllIIll.isRemote ? 1 : 0)) {
            this.setCombatTask();
        }
    }
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEAD;
    }
    
    private static int llllllIIIIlllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llllllIIIIllllI(final int lllllllllllllIIIIIIIIlllIIIIIIlI) {
        return lllllllllllllIIIIIIIIlllIIIIIIlI > 0;
    }
    
    private static boolean llllllIIIIllIll(final int lllllllllllllIIIIIIIIlllIIIlllll, final int lllllllllllllIIIIIIIIlllIIIllllI) {
        return lllllllllllllIIIIIIIIlllIIIlllll == lllllllllllllIIIIIIIIlllIIIllllI;
    }
    
    private static String llllllIIIIIlIll(String lllllllllllllIIIIIIIIlllIIlIlIlI, final String lllllllllllllIIIIIIIIlllIIlIlIIl) {
        lllllllllllllIIIIIIIIlllIIlIlIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIIIlllIIlIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIIlllIIlIllIl = new StringBuilder();
        final char[] lllllllllllllIIIIIIIIlllIIlIllII = lllllllllllllIIIIIIIIlllIIlIlIIl.toCharArray();
        int lllllllllllllIIIIIIIIlllIIlIlIll = EntitySkeleton.lIllIlIIIllllI[2];
        final double lllllllllllllIIIIIIIIlllIIlIIlIl = (Object)((String)lllllllllllllIIIIIIIIlllIIlIlIlI).toCharArray();
        final double lllllllllllllIIIIIIIIlllIIlIIlII = lllllllllllllIIIIIIIIlllIIlIIlIl.length;
        byte lllllllllllllIIIIIIIIlllIIlIIIll = (byte)EntitySkeleton.lIllIlIIIllllI[2];
        while (llllllIIIlIIlll(lllllllllllllIIIIIIIIlllIIlIIIll, (int)lllllllllllllIIIIIIIIlllIIlIIlII)) {
            final char lllllllllllllIIIIIIIIlllIIllIIII = lllllllllllllIIIIIIIIlllIIlIIlIl[lllllllllllllIIIIIIIIlllIIlIIIll];
            lllllllllllllIIIIIIIIlllIIlIllIl.append((char)(lllllllllllllIIIIIIIIlllIIllIIII ^ lllllllllllllIIIIIIIIlllIIlIllII[lllllllllllllIIIIIIIIlllIIlIlIll % lllllllllllllIIIIIIIIlllIIlIllII.length]));
            "".length();
            ++lllllllllllllIIIIIIIIlllIIlIlIll;
            ++lllllllllllllIIIIIIIIlllIIlIIIll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIIlllIIlIllIl);
    }
    
    @Override
    public void onDeath(final DamageSource lllllllllllllIIIIIIIIlllllIIIIlI) {
        super.onDeath(lllllllllllllIIIIIIIIlllllIIIIlI);
        if (llllllIIIIllIlI((lllllllllllllIIIIIIIIlllllIIIIlI.getSourceOfDamage() instanceof EntityArrow) ? 1 : 0) && llllllIIIIllIlI((lllllllllllllIIIIIIIIlllllIIIIlI.getEntity() instanceof EntityPlayer) ? 1 : 0)) {
            final EntityPlayer lllllllllllllIIIIIIIIlllllIIIIIl = (EntityPlayer)lllllllllllllIIIIIIIIlllllIIIIlI.getEntity();
            final double lllllllllllllIIIIIIIIlllllIIIIII = lllllllllllllIIIIIIIIlllllIIIIIl.posX - this.posX;
            final double lllllllllllllIIIIIIIIllllIllllll = lllllllllllllIIIIIIIIlllllIIIIIl.posZ - this.posZ;
            if (llllllIIIlIIIlI(llllllIIIlIIIIl(lllllllllllllIIIIIIIIlllllIIIIII * lllllllllllllIIIIIIIIlllllIIIIII + lllllllllllllIIIIIIIIllllIllllll * lllllllllllllIIIIIIIIllllIllllll, 2500.0))) {
                lllllllllllllIIIIIIIIlllllIIIIIl.triggerAchievement(AchievementList.snipeSkeleton);
                "".length();
                if ((0x37 ^ 0x32) <= 0) {
                    return;
                }
            }
        }
        else if (llllllIIIIllIlI((lllllllllllllIIIIIIIIlllllIIIIlI.getEntity() instanceof EntityCreeper) ? 1 : 0) && llllllIIIIllIlI(((EntityCreeper)lllllllllllllIIIIIIIIlllllIIIIlI.getEntity()).getPowered() ? 1 : 0) && llllllIIIIllIlI(((EntityCreeper)lllllllllllllIIIIIIIIlllllIIIIlI.getEntity()).isAIEnabled() ? 1 : 0)) {
            ((EntityCreeper)lllllllllllllIIIIIIIIlllllIIIIlI.getEntity()).func_175493_co();
            final Item skull = Items.skull;
            final int lllllllllllllIIlllIllIIIlIlllllI = EntitySkeleton.lIllIlIIIllllI[3];
            int lllllllllllllIIlllIllIIIlIllllIl;
            if (llllllIIIIllIll(this.getSkeletonType(), EntitySkeleton.lIllIlIIIllllI[3])) {
                lllllllllllllIIlllIllIIIlIllllIl = EntitySkeleton.lIllIlIIIllllI[3];
                "".length();
                if ((0x23 ^ 0x65 ^ (0x35 ^ 0x77)) != (0x19 ^ 0x32 ^ (0xD ^ 0x22))) {
                    return;
                }
            }
            else {
                lllllllllllllIIlllIllIIIlIllllIl = EntitySkeleton.lIllIlIIIllllI[2];
            }
            this.entityDropItem(new ItemStack(skull, lllllllllllllIIlllIllIIIlIlllllI, lllllllllllllIIlllIllIIIlIllllIl), 0.0f);
            "".length();
        }
    }
    
    @Override
    public void setCurrentItemOrArmor(final int lllllllllllllIIIIIIIIlllIlIllIll, final ItemStack lllllllllllllIIIIIIIIlllIlIllIlI) {
        super.setCurrentItemOrArmor(lllllllllllllIIIIIIIIlllIlIllIll, lllllllllllllIIIIIIIIlllIlIllIlI);
        if (llllllIIIIllIIl(this.worldObj.isRemote ? 1 : 0) && llllllIIIIllIIl(lllllllllllllIIIIIIIIlllIlIllIll)) {
            this.setCombatTask();
        }
    }
    
    @Override
    public void updateRidden() {
        super.updateRidden();
        if (llllllIIIIllIlI((this.ridingEntity instanceof EntityCreature) ? 1 : 0)) {
            final EntityCreature lllllllllllllIIIIIIIIlllllIIlIll = (EntityCreature)this.ridingEntity;
            this.renderYawOffset = lllllllllllllIIIIIIIIlllllIIlIll.renderYawOffset;
        }
    }
    
    private static boolean llllllIIIlIIllI(final int lllllllllllllIIIIIIIIlllIIIIIlII) {
        return lllllllllllllIIIIIIIIlllIIIIIlII <= 0;
    }
    
    private static boolean llllllIIIlIIIII(final int lllllllllllllIIIIIIIIlllIIIllIll, final int lllllllllllllIIIIIIIIlllIIIllIlI) {
        return lllllllllllllIIIIIIIIlllIIIllIll >= lllllllllllllIIIIIIIIlllIIIllIlI;
    }
    
    public int getSkeletonType() {
        return this.dataWatcher.getWatchableObjectByte(EntitySkeleton.lIllIlIIIllllI[8]);
    }
    
    private static int llllllIIIIlllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance lllllllllllllIIIIIIIIllllIIlIlIl, IEntityLivingData lllllllllllllIIIIIIIIllllIIlIlII) {
        lllllllllllllIIIIIIIIllllIIlIlII = (long)super.onInitialSpawn(lllllllllllllIIIIIIIIllllIIlIlIl, (IEntityLivingData)lllllllllllllIIIIIIIIllllIIlIlII);
        if (llllllIIIIllIlI((this.worldObj.provider instanceof WorldProviderHell) ? 1 : 0) && llllllIIIIllllI(this.getRNG().nextInt(EntitySkeleton.lIllIlIIIllllI[11]))) {
            this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[6], this.aiAttackOnCollide);
            this.setSkeletonType(EntitySkeleton.lIllIlIIIllllI[3]);
            this.setCurrentItemOrArmor(EntitySkeleton.lIllIlIIIllllI[2], new ItemStack(Items.stone_sword));
            this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0);
            "".length();
            if (((0x21 ^ 0xA) & ~(0xA1 ^ 0x8A)) >= " ".length()) {
                return null;
            }
        }
        else {
            this.tasks.addTask(EntitySkeleton.lIllIlIIIllllI[6], this.aiArrowAttack);
            this.setEquipmentBasedOnDifficulty(lllllllllllllIIIIIIIIllllIIlIlIl);
            this.setEnchantmentBasedOnDifficulty(lllllllllllllIIIIIIIIllllIIlIlIl);
        }
        int canPickUpLoot;
        if (llllllIIIIlllll(llllllIIIlIIIll(this.rand.nextFloat(), 0.55f * lllllllllllllIIIIIIIIllllIIlIlIl.getClampedAdditionalDifficulty()))) {
            canPickUpLoot = EntitySkeleton.lIllIlIIIllllI[3];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            canPickUpLoot = EntitySkeleton.lIllIlIIIllllI[2];
        }
        this.setCanPickUpLoot((boolean)(canPickUpLoot != 0));
        if (llllllIIIlIIlII(this.getEquipmentInSlot(EntitySkeleton.lIllIlIIIllllI[6]))) {
            final Calendar lllllllllllllIIIIIIIIllllIIlIlll = this.worldObj.getCurrentDate();
            if (llllllIIIIllIll(lllllllllllllIIIIIIIIllllIIlIlll.get(EntitySkeleton.lIllIlIIIllllI[4]) + EntitySkeleton.lIllIlIIIllllI[3], EntitySkeleton.lIllIlIIIllllI[12]) && llllllIIIIllIll(lllllllllllllIIIIIIIIllllIIlIlll.get(EntitySkeleton.lIllIlIIIllllI[11]), EntitySkeleton.lIllIlIIIllllI[13]) && llllllIIIIlllll(llllllIIIlIIIll(this.rand.nextFloat(), 0.25f))) {
                final int lllllllllllllIIIIIIIIlllIlIllIll = EntitySkeleton.lIllIlIIIllllI[6];
                Block lllllllllllllIIlllIllIIIlllIllIl;
                if (llllllIIIIlllll(llllllIIIlIIIll(this.rand.nextFloat(), 0.1f))) {
                    lllllllllllllIIlllIllIIIlllIllIl = Blocks.lit_pumpkin;
                    "".length();
                    if ("   ".length() > (156 + 104 - 235 + 141 ^ 18 + 40 - 52 + 156)) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIlllIllIIIlllIllIl = Blocks.pumpkin;
                }
                this.setCurrentItemOrArmor(lllllllllllllIIIIIIIIlllIlIllIll, new ItemStack(lllllllllllllIIlllIllIIIlllIllIl));
                this.equipmentDropChances[EntitySkeleton.lIllIlIIIllllI[6]] = 0.0f;
            }
        }
        return (IEntityLivingData)lllllllllllllIIIIIIIIllllIIlIlII;
    }
    
    private static boolean llllllIIIlIIlIl(final Object lllllllllllllIIIIIIIIlllIIIlIIIl, final Object lllllllllllllIIIIIIIIlllIIIlIIII) {
        return lllllllllllllIIIIIIIIlllIIIlIIIl == lllllllllllllIIIIIIIIlllIIIlIIII;
    }
    
    @Override
    protected void setEquipmentBasedOnDifficulty(final DifficultyInstance lllllllllllllIIIIIIIIllllIIlllll) {
        super.setEquipmentBasedOnDifficulty(lllllllllllllIIIIIIIIllllIIlllll);
        this.setCurrentItemOrArmor(EntitySkeleton.lIllIlIIIllllI[2], new ItemStack(Items.bow));
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIIIIIIIIllllIllIIll, final int lllllllllllllIIIIIIIIllllIlIlIlI) {
        if (llllllIIIIllIll(this.getSkeletonType(), EntitySkeleton.lIllIlIIIllllI[3])) {
            final int lllllllllllllIIIIIIIIllllIllIIIl = this.rand.nextInt(EntitySkeleton.lIllIlIIIllllI[5] + lllllllllllllIIIIIIIIllllIlIlIlI) - EntitySkeleton.lIllIlIIIllllI[3];
            int lllllllllllllIIIIIIIIllllIllIIII = EntitySkeleton.lIllIlIIIllllI[2];
            "".length();
            if ("   ".length() == ((0x78 ^ 0x14 ^ (0x5 ^ 0x66)) & (0xA6 ^ 0x8E ^ (0x4D ^ 0x6A) ^ -" ".length()))) {
                return;
            }
            while (!llllllIIIlIIIII(lllllllllllllIIIIIIIIllllIllIIII, lllllllllllllIIIIIIIIllllIllIIIl)) {
                this.dropItem(Items.coal, EntitySkeleton.lIllIlIIIllllI[3]);
                "".length();
                ++lllllllllllllIIIIIIIIllllIllIIII;
            }
            "".length();
            if (-(0x59 ^ 0x5D) > 0) {
                return;
            }
        }
        else {
            final int lllllllllllllIIIIIIIIllllIlIllll = this.rand.nextInt(EntitySkeleton.lIllIlIIIllllI[5] + lllllllllllllIIIIIIIIllllIlIlIlI);
            int lllllllllllllIIIIIIIIllllIlIlllI = EntitySkeleton.lIllIlIIIllllI[2];
            "".length();
            if (null != null) {
                return;
            }
            while (!llllllIIIlIIIII(lllllllllllllIIIIIIIIllllIlIlllI, lllllllllllllIIIIIIIIllllIlIllll)) {
                this.dropItem(Items.arrow, EntitySkeleton.lIllIlIIIllllI[3]);
                "".length();
                ++lllllllllllllIIIIIIIIllllIlIlllI;
            }
        }
        final int lllllllllllllIIIIIIIIllllIlIllIl = this.rand.nextInt(EntitySkeleton.lIllIlIIIllllI[5] + lllllllllllllIIIIIIIIllllIlIlIlI);
        int lllllllllllllIIIIIIIIllllIlIllII = EntitySkeleton.lIllIlIIIllllI[2];
        "".length();
        if (null != null) {
            return;
        }
        while (!llllllIIIlIIIII(lllllllllllllIIIIIIIIllllIlIllII, lllllllllllllIIIIIIIIllllIlIllIl)) {
            this.dropItem(Items.bone, EntitySkeleton.lIllIlIIIllllI[3]);
            "".length();
            ++lllllllllllllIIIIIIIIllllIlIllII;
        }
    }
    
    private static int llllllIIIlIIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void attackEntityWithRangedAttack(final EntityLivingBase lllllllllllllIIIIIIIIlllIlllllll, final float lllllllllllllIIIIIIIIlllIllllllI) {
        final EntityArrow lllllllllllllIIIIIIIIllllIIIIIll = new EntityArrow(this.worldObj, this, lllllllllllllIIIIIIIIlllIlllllll, 1.6f, (float)(EntitySkeleton.lIllIlIIIllllI[14] - this.worldObj.getDifficulty().getDifficultyId() * EntitySkeleton.lIllIlIIIllllI[6]));
        final int lllllllllllllIIIIIIIIllllIIIIIlI = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, this.getHeldItem());
        final int lllllllllllllIIIIIIIIllllIIIIIIl = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, this.getHeldItem());
        lllllllllllllIIIIIIIIllllIIIIIll.setDamage(lllllllllllllIIIIIIIIlllIllllllI * 2.0f + this.rand.nextGaussian() * 0.25 + this.worldObj.getDifficulty().getDifficultyId() * 0.11f);
        if (llllllIIIIllllI(lllllllllllllIIIIIIIIllllIIIIIlI)) {
            lllllllllllllIIIIIIIIllllIIIIIll.setDamage(lllllllllllllIIIIIIIIllllIIIIIll.getDamage() + lllllllllllllIIIIIIIIllllIIIIIlI * 0.5 + 0.5);
        }
        if (llllllIIIIllllI(lllllllllllllIIIIIIIIllllIIIIIIl)) {
            lllllllllllllIIIIIIIIllllIIIIIll.setKnockbackStrength(lllllllllllllIIIIIIIIllllIIIIIIl);
        }
        if (!llllllIIIlIIllI(EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, this.getHeldItem())) || llllllIIIIllIll(this.getSkeletonType(), EntitySkeleton.lIllIlIIIllllI[3])) {
            lllllllllllllIIIIIIIIllllIIIIIll.setFire(EntitySkeleton.lIllIlIIIllllI[15]);
        }
        this.playSound(EntitySkeleton.lIllIlIIIlllII[EntitySkeleton.lIllIlIIIllllI[6]], 1.0f, 1.0f / (this.getRNG().nextFloat() * 0.4f + 0.8f));
        this.worldObj.spawnEntityInWorld(lllllllllllllIIIIIIIIllllIIIIIll);
        "".length();
    }
    
    private static boolean llllllIIIlIIIlI(final int lllllllllllllIIIIIIIIlllIIIIlIII) {
        return lllllllllllllIIIIIIIIlllIIIIlIII >= 0;
    }
}
