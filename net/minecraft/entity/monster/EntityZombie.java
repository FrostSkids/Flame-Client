// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.item.Item;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import java.util.Calendar;
import java.util.List;
import net.minecraft.entity.SharedMonsterAttributes;
import com.google.common.base.Predicate;
import net.minecraft.util.EntitySelectors;
import net.minecraft.entity.passive.EntityChicken;
import java.util.Arrays;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.entity.EntityLiving;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import java.util.UUID;
import net.minecraft.entity.ai.EntityAIBreakDoor;
import net.minecraft.entity.ai.attributes.IAttribute;

public class EntityZombie extends EntityMob
{
    private /* synthetic */ boolean isBreakDoorsTaskSet;
    protected static final /* synthetic */ IAttribute reinforcementChance;
    private /* synthetic */ int conversionTime;
    private static final /* synthetic */ int[] llIlIllIIIIlII;
    private static final /* synthetic */ String[] llIlIllIIIIIll;
    private /* synthetic */ float zombieWidth;
    private final /* synthetic */ EntityAIBreakDoor breakDoor;
    private /* synthetic */ float zombieHeight;
    private static final /* synthetic */ UUID babySpeedBoostUUID;
    private static final /* synthetic */ AttributeModifier babySpeedBoostModifier;
    
    @Override
    public void handleStatusUpdate(final byte llllllllllllIllIlIIlllIlIlllIllI) {
        if (lIIlIlIIlllIIllI(llllllllllllIllIlIIlllIlIlllIllI, EntityZombie.llIlIllIIIIlII[20])) {
            if (lIIlIlIIlllIlIII(this.isSilent() ? 1 : 0)) {
                this.worldObj.playSound(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[32]], 1.0f + this.rand.nextFloat(), this.rand.nextFloat() * 0.7f + 0.3f, (boolean)(EntityZombie.llIlIllIIIIlII[0] != 0));
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
        }
        else {
            super.handleStatusUpdate(llllllllllllIllIlIIlllIlIlllIllI);
        }
    }
    
    protected void applyEntityAI() {
        this.tasks.addTask(EntityZombie.llIlIllIIIIlII[7], new EntityAIAttackOnCollide(this, EntityVillager.class, 1.0, (boolean)(EntityZombie.llIlIllIIIIlII[1] != 0)));
        this.tasks.addTask(EntityZombie.llIlIllIIIIlII[7], new EntityAIAttackOnCollide(this, EntityIronGolem.class, 1.0, (boolean)(EntityZombie.llIlIllIIIIlII[1] != 0)));
        this.tasks.addTask(EntityZombie.llIlIllIIIIlII[8], new EntityAIMoveThroughVillage(this, 1.0, (boolean)(EntityZombie.llIlIllIIIIlII[0] != 0)));
        final EntityAITasks targetTasks = this.targetTasks;
        final int llllllllllllIlllIIllllIlIlIIIIll = EntityZombie.llIlIllIIIIlII[1];
        final int llllllllllllIllIIIllIIIIIlllIIlI = EntityZombie.llIlIllIIIIlII[1];
        final Class[] llllllllllllIllIIIllIIIIIlllIIIl = new Class[EntityZombie.llIlIllIIIIlII[1]];
        llllllllllllIllIIIllIIIIIlllIIIl[EntityZombie.llIlIllIIIIlII[0]] = EntityPigZombie.class;
        targetTasks.addTask(llllllllllllIlllIIllllIlIlIIIIll, new EntityAIHurtByTarget(this, (boolean)(llllllllllllIllIIIllIIIIIlllIIlI != 0), llllllllllllIllIIIllIIIIIlllIIIl));
        this.targetTasks.addTask(EntityZombie.llIlIllIIIIlII[2], new EntityAINearestAttackableTarget<Object>(this, EntityPlayer.class, (boolean)(EntityZombie.llIlIllIIIIlII[1] != 0)));
        this.targetTasks.addTask(EntityZombie.llIlIllIIIIlII[2], new EntityAINearestAttackableTarget<Object>(this, EntityVillager.class, (boolean)(EntityZombie.llIlIllIIIIlII[0] != 0)));
        this.targetTasks.addTask(EntityZombie.llIlIllIIIIlII[2], new EntityAINearestAttackableTarget<Object>(this, EntityIronGolem.class, (boolean)(EntityZombie.llIlIllIIIIlII[1] != 0)));
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIllIlIIlllIllllllIIl, final float llllllllllllIllIlIIllllIIIIIIlII) {
        if (lIIlIlIIlllIIlIl(super.attackEntityFrom(llllllllllllIllIlIIlllIllllllIIl, llllllllllllIllIlIIllllIIIIIIlII) ? 1 : 0)) {
            EntityLivingBase llllllllllllIllIlIIllllIIIIIIIll = this.getAttackTarget();
            if (lIIlIlIIlllIllll(llllllllllllIllIlIIllllIIIIIIIll) && lIIlIlIIlllIIlIl((llllllllllllIllIlIIlllIllllllIIl.getEntity() instanceof EntityLivingBase) ? 1 : 0)) {
                llllllllllllIllIlIIllllIIIIIIIll = (EntityLivingBase)llllllllllllIllIlIIlllIllllllIIl.getEntity();
            }
            if (lIIlIlIIlllIIlll(llllllllllllIllIlIIllllIIIIIIIll) && lIIlIlIIllllIIII(this.worldObj.getDifficulty(), EnumDifficulty.HARD) && lIIlIlIIlllIllII(lIIlIlIIlllIlllI(this.rand.nextFloat(), this.getEntityAttribute(EntityZombie.reinforcementChance).getAttributeValue()))) {
                final int llllllllllllIllIlIIllllIIIIIIIlI = MathHelper.floor_double(this.posX);
                final int llllllllllllIllIlIIllllIIIIIIIIl = MathHelper.floor_double(this.posY);
                final int llllllllllllIllIlIIllllIIIIIIIII = MathHelper.floor_double(this.posZ);
                final EntityZombie llllllllllllIllIlIIlllIlllllllll = new EntityZombie(this.worldObj);
                int llllllllllllIllIlIIlllIllllllllI = EntityZombie.llIlIllIIIIlII[0];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return ((0x7A ^ 0x45 ^ (0x45 ^ 0x42)) & (0x77 ^ 0x1E ^ (0x6A ^ 0x3B) ^ -" ".length())) != 0x0;
                }
                while (!lIIlIlIIlllIllIl(llllllllllllIllIlIIlllIllllllllI, EntityZombie.llIlIllIIIIlII[16])) {
                    final int llllllllllllIllIlIIlllIlllllllIl = llllllllllllIllIlIIllllIIIIIIIlI + MathHelper.getRandomIntegerInRange(this.rand, EntityZombie.llIlIllIIIIlII[5], EntityZombie.llIlIllIIIIlII[13]) * MathHelper.getRandomIntegerInRange(this.rand, EntityZombie.llIlIllIIIIlII[14], EntityZombie.llIlIllIIIIlII[1]);
                    final int llllllllllllIllIlIIlllIlllllllII = llllllllllllIllIlIIllllIIIIIIIIl + MathHelper.getRandomIntegerInRange(this.rand, EntityZombie.llIlIllIIIIlII[5], EntityZombie.llIlIllIIIIlII[13]) * MathHelper.getRandomIntegerInRange(this.rand, EntityZombie.llIlIllIIIIlII[14], EntityZombie.llIlIllIIIIlII[1]);
                    final int llllllllllllIllIlIIlllIllllllIll = llllllllllllIllIlIIllllIIIIIIIII + MathHelper.getRandomIntegerInRange(this.rand, EntityZombie.llIlIllIIIIlII[5], EntityZombie.llIlIllIIIIlII[13]) * MathHelper.getRandomIntegerInRange(this.rand, EntityZombie.llIlIllIIIIlII[14], EntityZombie.llIlIllIIIIlII[1]);
                    if (lIIlIlIIlllIIlIl(World.doesBlockHaveSolidTopSurface(this.worldObj, new BlockPos(llllllllllllIllIlIIlllIlllllllIl, llllllllllllIllIlIIlllIlllllllII - EntityZombie.llIlIllIIIIlII[1], llllllllllllIllIlIIlllIllllllIll)) ? 1 : 0) && lIIlIlIIllllIIIl(this.worldObj.getLightFromNeighbors(new BlockPos(llllllllllllIllIlIIlllIlllllllIl, llllllllllllIllIlIIlllIlllllllII, llllllllllllIllIlIIlllIllllllIll)), EntityZombie.llIlIllIIIIlII[15])) {
                        llllllllllllIllIlIIlllIlllllllll.setPosition(llllllllllllIllIlIIlllIlllllllIl, llllllllllllIllIlIIlllIlllllllII, llllllllllllIllIlIIlllIllllllIll);
                        if (lIIlIlIIlllIlIII(this.worldObj.isAnyPlayerWithinRangeAt(llllllllllllIllIlIIlllIlllllllIl, llllllllllllIllIlIIlllIlllllllII, llllllllllllIllIlIIlllIllllllIll, 7.0) ? 1 : 0) && lIIlIlIIlllIIlIl(this.worldObj.checkNoEntityCollision(llllllllllllIllIlIIlllIlllllllll.getEntityBoundingBox(), llllllllllllIllIlIIlllIlllllllll) ? 1 : 0) && lIIlIlIIlllIIlIl(this.worldObj.getCollidingBoundingBoxes(llllllllllllIllIlIIlllIlllllllll, llllllllllllIllIlIIlllIlllllllll.getEntityBoundingBox()).isEmpty() ? 1 : 0) && lIIlIlIIlllIlIII(this.worldObj.isAnyLiquid(llllllllllllIllIlIIlllIlllllllll.getEntityBoundingBox()) ? 1 : 0)) {
                            this.worldObj.spawnEntityInWorld(llllllllllllIllIlIIlllIlllllllll);
                            "".length();
                            llllllllllllIllIlIIlllIlllllllll.setAttackTarget(llllllllllllIllIlIIllllIIIIIIIll);
                            llllllllllllIllIlIIlllIlllllllll.onInitialSpawn(this.worldObj.getDifficultyForLocation(new BlockPos(llllllllllllIllIlIIlllIlllllllll)), null);
                            "".length();
                            this.getEntityAttribute(EntityZombie.reinforcementChance).applyModifier(new AttributeModifier(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[7]], -0.05000000074505806, EntityZombie.llIlIllIIIIlII[0]));
                            llllllllllllIllIlIIlllIlllllllll.getEntityAttribute(EntityZombie.reinforcementChance).applyModifier(new AttributeModifier(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[4]], -0.05000000074505806, EntityZombie.llIlIllIIIIlII[0]));
                            "".length();
                            if (-" ".length() > -" ".length()) {
                                return ((197 + 101 - 123 + 35 ^ 108 + 68 - 171 + 144) & (0xE3 ^ 0x9E ^ (0x54 ^ 0x6E) ^ -" ".length())) != 0x0;
                            }
                            break;
                        }
                    }
                    ++llllllllllllIllIlIIlllIllllllllI;
                }
            }
            return EntityZombie.llIlIllIIIIlII[1] != 0;
        }
        return EntityZombie.llIlIllIIIIlII[0] != 0;
    }
    
    @Override
    public boolean attackEntityAsMob(final Entity llllllllllllIllIlIIlllIlllIlllll) {
        final boolean llllllllllllIllIlIIlllIllllIIIlI = super.attackEntityAsMob(llllllllllllIllIlIIlllIlllIlllll);
        if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIlllIllllIIIlI ? 1 : 0)) {
            final int llllllllllllIllIlIIlllIllllIIIIl = this.worldObj.getDifficulty().getDifficultyId();
            if (lIIlIlIIlllIllll(this.getHeldItem()) && lIIlIlIIlllIIlIl(this.isBurning() ? 1 : 0) && lIIlIlIIlllIllII(lIIlIlIIllllIIll(this.rand.nextFloat(), llllllllllllIllIlIIlllIllllIIIIl * 0.3f))) {
                llllllllllllIllIlIIlllIlllIlllll.setFire(EntityZombie.llIlIllIIIIlII[2] * llllllllllllIllIlIIlllIllllIIIIl);
            }
        }
        return llllllllllllIllIlIIlllIllllIIIlI;
    }
    
    public void setVillager(final boolean llllllllllllIllIlIIllllIIIlIIIlI) {
        final DataWatcher dataWatcher = this.getDataWatcher();
        final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityZombie.llIlIllIIIIlII[10];
        int n;
        if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIllllIIIlIIIlI ? 1 : 0)) {
            n = EntityZombie.llIlIllIIIIlII[1];
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        else {
            n = EntityZombie.llIlIllIIIIlII[0];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
    }
    
    private static boolean lIIlIlIIlllIlIll(final int llllllllllllIllIlIIlllIIllIllIIl) {
        return llllllllllllIllIlIIlllIIllIllIIl > 0;
    }
    
    private static void lIIlIlIIlllIIIIl() {
        (llIlIllIIIIIll = new String[EntityZombie.llIlIllIIIIlII[36]])[EntityZombie.llIlIllIIIIlII[0]] = lIIlIlIIllIllllI("3dZyrs/lVq5REpNKhxbXox/Fi5mEA7A+vwXrQQnKErg=", "tmwgl");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[1]] = lIIlIlIIllIllllI("ik5+MlvolEfMxbYLcuR6Q55jlVYI1lswyCUBkAuENqU=", "ugeYQ");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[2]] = lIIlIlIIllIlllll("lccBq92GS5oo8/KPpmgpZngEHjV9+t4i/A2JLJ1yBrEFxqIcS/t81g==", "VMzxu");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[3]] = lIIlIlIIlllIIIII("Jy8LGE0WPgwECUUsBg4eEQ==", "eNiam");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[7]] = lIIlIlIIlllIIIII("EwEENjAsThsxMCcIBiY6LAMMOi1pDQg4NSwcSTcxKBwOMQ==", "IniTY");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[4]] = lIIlIlIIlllIIIII("GDsBCzgndB4MOCwyAxsyJzkJByViNw0FPScxTAo5IyYLDA==", "BTliQ");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[8]] = lIIlIlIIlllIIIII("GQcWfzMbBRY4LFobFSg=", "thtQI");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[5]] = lIIlIlIIllIlllll("dj3jTLcdd6n/HeA+YHzcCw==", "uKzhu");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[6]] = lIIlIlIIlllIIIII("AwI4eAwBADg/E0AJPzcCBg==", "nmZVv");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[17]] = lIIlIlIIllIllllI("SARAEazKaFlnS7i5xHzC5g==", "XpovX");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[15]] = lIIlIlIIllIllllI("yz4jF/UmRi4=", "MiozC");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[18]] = lIIlIlIIllIllllI("UV5dcF8vJQnFCHKl4pmSIw==", "ldPBG");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[9]] = lIIlIlIIllIlllll("+2ob4CZ4dzThi8nP8SZ89Q==", "TbXnt");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[10]] = lIIlIlIIllIllllI("uuBksgZ4FVK77NmPXUc2cA==", "rzVFL");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[11]] = lIIlIlIIllIllllI("GsAXf1dKU14=", "MCXgY");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[19]] = lIIlIlIIllIllllI("cNXRKWdOfK6llclEfAqVYg==", "QBsGJ");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[20]] = lIIlIlIIlllIIIII("EA49GgghEjoDAwcIPgk=", "SaSlm");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[22]] = lIIlIlIIllIlllll("8CsU98mKBLNLwX9WT57veg==", "LNKcX");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[23]] = lIIlIlIIllIlllll("rgQrMex/euiQEGVMCJRX4Q==", "UIiWP");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[24]] = lIIlIlIIlllIIIII("JS8BBAsDLwQCFgk8HA==", "fNoFy");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[12]] = lIIlIlIIllIlllll("WK0B3rmDQmI821T866tbcAbn7k3ntPQq", "kagoo");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[27]] = lIIlIlIIllIlllll("6k83QtkMHo7k6nQXc8M+OTv9MejCeCKC0mWicJCBr9k=", "SwqZd");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[28]] = lIIlIlIIllIlllll("LneyRRQNtibevHiK1Om/YUA5RvHcJxwT", "SlUah");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[29]] = lIIlIlIIllIlllll("0Y9/avyFys+q/J1U1CPXfn+a0VQpL5XF", "waTBB");
        EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[32]] = lIIlIlIIlllIIIII("IgooXikgCCgZNmEXLx02Kxw=", "OeJpS");
    }
    
    protected void convertToVillager() {
        final EntityVillager llllllllllllIllIlIIlllIlIllIllII = new EntityVillager(this.worldObj);
        llllllllllllIllIlIIlllIlIllIllII.copyLocationAndAnglesFrom(this);
        llllllllllllIllIlIIlllIlIllIllII.onInitialSpawn(this.worldObj.getDifficultyForLocation(new BlockPos(llllllllllllIllIlIIlllIlIllIllII)), null);
        "".length();
        llllllllllllIllIlIIlllIlIllIllII.setLookingForHome();
        if (lIIlIlIIlllIIlIl(this.isChild() ? 1 : 0)) {
            llllllllllllIllIlIIlllIlIllIllII.setGrowingAge(EntityZombie.llIlIllIIIIlII[33]);
        }
        this.worldObj.removeEntity(this);
        llllllllllllIllIlIIlllIlIllIllII.setNoAI(this.isAIDisabled());
        if (lIIlIlIIlllIIlIl(this.hasCustomName() ? 1 : 0)) {
            llllllllllllIllIlIIlllIlIllIllII.setCustomNameTag(this.getCustomNameTag());
            llllllllllllIllIlIIlllIlIllIllII.setAlwaysRenderNameTag(this.getAlwaysRenderNameTag());
        }
        this.worldObj.spawnEntityInWorld(llllllllllllIllIlIIlllIlIllIllII);
        "".length();
        llllllllllllIllIlIIlllIlIllIllII.addPotionEffect(new PotionEffect(Potion.confusion.id, EntityZombie.llIlIllIIIIlII[34], EntityZombie.llIlIllIIIIlII[0]));
        this.worldObj.playAuxSFXAtEntity(null, EntityZombie.llIlIllIIIIlII[35], new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ), EntityZombie.llIlIllIIIIlII[0]);
    }
    
    @Override
    public void onDeath(final DamageSource llllllllllllIllIlIIlllIlIIllIIIl) {
        super.onDeath(llllllllllllIllIlIIlllIlIIllIIIl);
        if (lIIlIlIIlllIIlIl((llllllllllllIllIlIIlllIlIIllIIIl.getEntity() instanceof EntityCreeper) ? 1 : 0) && lIIlIlIIlllIlIII((this instanceof EntityPigZombie) ? 1 : 0) && lIIlIlIIlllIIlIl(((EntityCreeper)llllllllllllIllIlIIlllIlIIllIIIl.getEntity()).getPowered() ? 1 : 0) && lIIlIlIIlllIIlIl(((EntityCreeper)llllllllllllIllIlIIlllIlIIllIIIl.getEntity()).isAIEnabled() ? 1 : 0)) {
            ((EntityCreeper)llllllllllllIllIlIIlllIlIIllIIIl.getEntity()).func_175493_co();
            this.entityDropItem(new ItemStack(Items.skull, EntityZombie.llIlIllIIIIlII[1], EntityZombie.llIlIllIIIIlII[2]), 0.0f);
            "".length();
        }
    }
    
    public boolean isBreakDoorsTaskSet() {
        return this.isBreakDoorsTaskSet;
    }
    
    public boolean isVillager() {
        if (lIIlIlIIlllIIllI(this.getDataWatcher().getWatchableObjectByte(EntityZombie.llIlIllIIIIlII[10]), EntityZombie.llIlIllIIIIlII[1])) {
            return EntityZombie.llIlIllIIIIlII[1] != 0;
        }
        return EntityZombie.llIlIllIIIIlII[0] != 0;
    }
    
    @Override
    protected boolean canDespawn() {
        int n;
        if (lIIlIlIIlllIIlIl(this.isConverting() ? 1 : 0)) {
            n = EntityZombie.llIlIllIIIIlII[0];
            "".length();
            if (((0x9C ^ 0x91 ^ (0x49 ^ 0x2)) & (197 + 80 - 196 + 148 ^ 41 + 109 - 140 + 153 ^ -" ".length())) > ((0x1F ^ 0x38 ^ (0x9D ^ 0xAE)) & (112 + 132 - 95 + 32 ^ 8 + 42 + 1 + 110 ^ -" ".length()))) {
                return ((0xC8 ^ 0xAD ^ (0xEA ^ 0x98)) & (0x78 ^ 0x5B ^ (0x49 ^ 0x7D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityZombie.llIlIllIIIIlII[1];
        }
        return n != 0;
    }
    
    private static boolean lIIlIlIIllllIIII(final Object llllllllllllIllIlIIlllIIlllIIllI, final Object llllllllllllIllIlIIlllIIlllIIlIl) {
        return llllllllllllIllIlIIlllIIlllIIllI == llllllllllllIllIlIIlllIIlllIIlIl;
    }
    
    private static boolean lIIlIlIIlllIIllI(final int llllllllllllIllIlIIlllIIllllllII, final int llllllllllllIllIlIIlllIIlllllIll) {
        return llllllllllllIllIlIIlllIIllllllII == llllllllllllIllIlIIlllIIlllllIll;
    }
    
    @Override
    public double getYOffset() {
        double n;
        if (lIIlIlIIlllIIlIl(this.isChild() ? 1 : 0)) {
            n = 0.0;
            "".length();
            if ("   ".length() <= 0) {
                return 0.0;
            }
        }
        else {
            n = -0.35;
        }
        return n;
    }
    
    private static boolean lIIlIlIIlllIllIl(final int llllllllllllIllIlIIlllIIlllllIII, final int llllllllllllIllIlIIlllIIllllIlll) {
        return llllllllllllIllIlIIlllIIlllllIII >= llllllllllllIllIlIIlllIIllllIlll;
    }
    
    private static int lIIlIlIIlllllIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIlIlIIlllIllll(final Object llllllllllllIllIlIIlllIIlllIIIll) {
        return llllllllllllIllIlIIlllIIlllIIIll == null;
    }
    
    public EntityZombie(final World llllllllllllIllIlIIllllIIlIlIlIl) {
        super(llllllllllllIllIlIIllllIIlIlIlIl);
        this.breakDoor = new EntityAIBreakDoor(this);
        this.isBreakDoorsTaskSet = (EntityZombie.llIlIllIIIIlII[0] != 0);
        this.zombieWidth = -1.0f;
        ((PathNavigateGround)this.getNavigator()).setBreakDoors((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
        this.tasks.addTask(EntityZombie.llIlIllIIIIlII[0], new EntityAISwimming(this));
        this.tasks.addTask(EntityZombie.llIlIllIIIIlII[2], new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0, (boolean)(EntityZombie.llIlIllIIIIlII[0] != 0)));
        this.tasks.addTask(EntityZombie.llIlIllIIIIlII[4], new EntityAIMoveTowardsRestriction(this, 1.0));
        this.tasks.addTask(EntityZombie.llIlIllIIIIlII[5], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityZombie.llIlIllIIIIlII[6], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntityZombie.llIlIllIIIIlII[6], new EntityAILookIdle(this));
        this.applyEntityAI();
        this.setSize(0.6f, 1.95f);
    }
    
    private static int lIIlIlIIlllllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        lIIlIlIIlllIIIlI();
        lIIlIlIIlllIIIIl();
        reinforcementChance = new RangedAttribute(null, EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[0]], 0.0, 0.0, 1.0).setDescription(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[1]]);
        babySpeedBoostUUID = UUID.fromString(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[2]]);
        babySpeedBoostModifier = new AttributeModifier(EntityZombie.babySpeedBoostUUID, EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[3]], 0.5, EntityZombie.llIlIllIIIIlII[1]);
    }
    
    @Override
    protected boolean func_175448_a(final ItemStack llllllllllllIllIlIIlllIllIlIIlIl) {
        int func_175448_a;
        if (lIIlIlIIllllIIII(llllllllllllIllIlIIlllIllIlIIlIl.getItem(), Items.egg) && lIIlIlIIlllIIlIl(this.isChild() ? 1 : 0) && lIIlIlIIlllIIlIl(this.isRiding() ? 1 : 0)) {
            func_175448_a = EntityZombie.llIlIllIIIIlII[0];
            "".length();
            if (((0x43 ^ 0x3F ^ (0xE5 ^ 0xBC)) & (0x67 ^ 0x42 ^ ((0x28 ^ 0x7E) & ~(0xC ^ 0x5A)) ^ -" ".length())) > "  ".length()) {
                return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
            }
        }
        else {
            func_175448_a = (super.func_175448_a(llllllllllllIllIlIIlllIllIlIIlIl) ? 1 : 0);
        }
        return func_175448_a != 0;
    }
    
    @Override
    protected void addRandomDrop() {
        switch (this.rand.nextInt(EntityZombie.llIlIllIIIIlII[3])) {
            case 0: {
                this.dropItem(Items.iron_ingot, EntityZombie.llIlIllIIIIlII[1]);
                "".length();
                "".length();
                if ("   ".length() < ((0x2A ^ 0x1E) & ~(0x2 ^ 0x36))) {
                    return;
                }
                break;
            }
            case 1: {
                this.dropItem(Items.carrot, EntityZombie.llIlIllIIIIlII[1]);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 2: {
                this.dropItem(Items.potato, EntityZombie.llIlIllIIIIlII[1]);
                "".length();
                break;
            }
        }
    }
    
    public boolean isConverting() {
        if (lIIlIlIIlllIIllI(this.getDataWatcher().getWatchableObjectByte(EntityZombie.llIlIllIIIIlII[11]), EntityZombie.llIlIllIIIIlII[1])) {
            return EntityZombie.llIlIllIIIIlII[1] != 0;
        }
        return EntityZombie.llIlIllIIIIlII[0] != 0;
    }
    
    private static String lIIlIlIIllIlllll(final String llllllllllllIllIlIIlllIlIIIllIlI, final String llllllllllllIllIlIIlllIlIIIllIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlllIlIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlllIlIIIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIlllIlIIIllllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIlllIlIIIllllI.init(EntityZombie.llIlIllIIIIlII[2], llllllllllllIllIlIIlllIlIIIlllll);
            return new String(llllllllllllIllIlIIlllIlIIIllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlllIlIIIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlllIlIIIlllIl) {
            llllllllllllIllIlIIlllIlIIIlllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onUpdate() {
        if (lIIlIlIIlllIlIII(this.worldObj.isRemote ? 1 : 0) && lIIlIlIIlllIIlIl(this.isConverting() ? 1 : 0)) {
            final int llllllllllllIllIlIIlllIllllIlIll = this.getConversionTimeBoost();
            this.conversionTime -= llllllllllllIllIlIIlllIllllIlIll;
            if (lIIlIlIIllllIIlI(this.conversionTime)) {
                this.convertToVillager();
            }
        }
        super.onUpdate();
    }
    
    protected int getConversionTimeBoost() {
        int llllllllllllIllIlIIlllIlIllIIIII = EntityZombie.llIlIllIIIIlII[1];
        if (lIIlIlIIlllIllII(lIIlIlIIlllllIlI(this.rand.nextFloat(), 0.01f))) {
            int llllllllllllIllIlIIlllIlIlIlllll = EntityZombie.llIlIllIIIIlII[0];
            final BlockPos.MutableBlockPos llllllllllllIllIlIIlllIlIlIllllI = new BlockPos.MutableBlockPos();
            int llllllllllllIllIlIIlllIlIlIlllIl = (int)this.posX - EntityZombie.llIlIllIIIIlII[7];
            "".length();
            if (-" ".length() > "  ".length()) {
                return (95 + 60 - 86 + 168 ^ 38 + 34 + 22 + 48) & (0xC3 ^ 0x9B ^ (0xAF ^ 0x94) ^ -" ".length());
            }
            while (lIIlIlIIllllIIIl(llllllllllllIllIlIIlllIlIlIlllIl, (int)this.posX + EntityZombie.llIlIllIIIIlII[7]) && !lIIlIlIIlllIllIl(llllllllllllIllIlIIlllIlIlIlllll, EntityZombie.llIlIllIIIIlII[11])) {
                int llllllllllllIllIlIIlllIlIlIlllII = (int)this.posY - EntityZombie.llIlIllIIIIlII[7];
                "".length();
                if (((0x7C ^ 0x29) & ~(0x54 ^ 0x1)) < 0) {
                    return (0xA9 ^ 0x81) & ~(0x36 ^ 0x1E);
                }
                while (lIIlIlIIllllIIIl(llllllllllllIllIlIIlllIlIlIlllII, (int)this.posY + EntityZombie.llIlIllIIIIlII[7]) && !lIIlIlIIlllIllIl(llllllllllllIllIlIIlllIlIlIlllll, EntityZombie.llIlIllIIIIlII[11])) {
                    int llllllllllllIllIlIIlllIlIlIllIll = (int)this.posZ - EntityZombie.llIlIllIIIIlII[7];
                    "".length();
                    if (((0x3A ^ 0x51 ^ (0x16 ^ 0x20)) & (0x73 ^ 0x17 ^ (0x23 ^ 0x1A) ^ -" ".length())) >= " ".length()) {
                        return (0x42 ^ 0x3A ^ (0x7 ^ 0x6E)) & (106 + 209 - 153 + 52 ^ 4 + 188 - 68 + 75 ^ -" ".length());
                    }
                    while (lIIlIlIIllllIIIl(llllllllllllIllIlIIlllIlIlIllIll, (int)this.posZ + EntityZombie.llIlIllIIIIlII[7]) && !lIIlIlIIlllIllIl(llllllllllllIllIlIIlllIlIlIlllll, EntityZombie.llIlIllIIIIlII[11])) {
                        final Block llllllllllllIllIlIIlllIlIlIllIlI = this.worldObj.getBlockState(llllllllllllIllIlIIlllIlIlIllllI.func_181079_c(llllllllllllIllIlIIlllIlIlIlllIl, llllllllllllIllIlIIlllIlIlIlllII, llllllllllllIllIlIIlllIlIlIllIll)).getBlock();
                        if (!lIIlIlIIllllIllI(llllllllllllIllIlIIlllIlIlIllIlI, Blocks.iron_bars) || lIIlIlIIllllIIII(llllllllllllIllIlIIlllIlIlIllIlI, Blocks.bed)) {
                            if (lIIlIlIIlllIllII(lIIlIlIIlllllIlI(this.rand.nextFloat(), 0.3f))) {
                                ++llllllllllllIllIlIIlllIlIllIIIII;
                            }
                            ++llllllllllllIllIlIIlllIlIlIlllll;
                        }
                        ++llllllllllllIllIlIIlllIlIlIllIll;
                    }
                    ++llllllllllllIllIlIIlllIlIlIlllII;
                }
                ++llllllllllllIllIlIIlllIlIlIlllIl;
            }
        }
        return llllllllllllIllIlIIlllIlIllIIIII;
    }
    
    public void setBreakDoorsAItask(final boolean llllllllllllIllIlIIllllIIIllllll) {
        if (lIIlIlIIlllIIlII(this.isBreakDoorsTaskSet ? 1 : 0, llllllllllllIllIlIIllllIIIllllll ? 1 : 0)) {
            this.isBreakDoorsTaskSet = llllllllllllIllIlIIllllIIIllllll;
            if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIllllIIIllllll ? 1 : 0)) {
                this.tasks.addTask(EntityZombie.llIlIllIIIIlII[1], this.breakDoor);
                "".length();
                if ((0xDB ^ 0x80 ^ (0x11 ^ 0x4E)) < 0) {
                    return;
                }
            }
            else {
                this.tasks.removeTask(this.breakDoor);
            }
        }
    }
    
    private static int lIIlIlIIlllIlIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIlIlIIlllIIlII(final int llllllllllllIllIlIIlllIIllIlIllI, final int llllllllllllIllIlIIlllIIllIlIlIl) {
        return llllllllllllIllIlIIlllIIllIlIllI != llllllllllllIllIlIIlllIIllIlIlIl;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIllIlIIlllIlllIIIIll) {
        super.writeEntityToNBT(llllllllllllIllIlIIlllIlllIIIIll);
        if (lIIlIlIIlllIIlIl(this.isChild() ? 1 : 0)) {
            llllllllllllIllIlIIlllIlllIIIIll.setBoolean(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[15]], (boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
        }
        if (lIIlIlIIlllIIlIl(this.isVillager() ? 1 : 0)) {
            llllllllllllIllIlIIlllIlllIIIIll.setBoolean(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[18]], (boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
        }
        final String lllllllllllllIIIIIlIIIlIIlIIlllI = EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[9]];
        int conversionTime;
        if (lIIlIlIIlllIIlIl(this.isConverting() ? 1 : 0)) {
            conversionTime = this.conversionTime;
            "".length();
            if (((0xC ^ 0x1C) & ~(0x41 ^ 0x51)) != ((0x33 ^ 0xC) & ~(0x5E ^ 0x61))) {
                return;
            }
        }
        else {
            conversionTime = EntityZombie.llIlIllIIIIlII[14];
        }
        llllllllllllIllIlIIlllIlllIIIIll.setInteger(lllllllllllllIIIIIlIIIlIIlIIlllI, conversionTime);
        llllllllllllIllIlIIlllIlllIIIIll.setBoolean(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[10]], this.isBreakDoorsTaskSet());
    }
    
    private static boolean lIIlIlIIlllIIlIl(final int llllllllllllIllIlIIlllIIlllIIIIl) {
        return llllllllllllIllIlIIlllIIlllIIIIl != 0;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIllIlIIlllIllIlllIll) {
        super.readEntityFromNBT(llllllllllllIllIlIIlllIllIlllIll);
        if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIlllIllIlllIll.getBoolean(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[11]]) ? 1 : 0)) {
            this.setChild((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
        }
        if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIlllIllIlllIll.getBoolean(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[19]]) ? 1 : 0)) {
            this.setVillager((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
        }
        if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIlllIllIlllIll.hasKey(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[20]], EntityZombie.llIlIllIIIIlII[21]) ? 1 : 0) && lIIlIlIIlllIIIll(llllllllllllIllIlIIlllIllIlllIll.getInteger(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[22]]), EntityZombie.llIlIllIIIIlII[14])) {
            this.startConversion(llllllllllllIllIlIIlllIllIlllIll.getInteger(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[23]]));
        }
        this.setBreakDoorsAItask(llllllllllllIllIlIIlllIllIlllIll.getBoolean(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[24]]));
    }
    
    private static boolean lIIlIlIIllllIIIl(final int llllllllllllIllIlIIlllIIllllIlII, final int llllllllllllIllIlIIlllIIllllIIll) {
        return llllllllllllIllIlIIlllIIllllIlII < llllllllllllIllIlIIlllIIllllIIll;
    }
    
    @Override
    protected void setEquipmentBasedOnDifficulty(final DifficultyInstance llllllllllllIllIlIIlllIlllIIlIII) {
        super.setEquipmentBasedOnDifficulty(llllllllllllIllIlIIlllIlllIIlIII);
        final float nextFloat = this.rand.nextFloat();
        float n;
        if (lIIlIlIIllllIIII(this.worldObj.getDifficulty(), EnumDifficulty.HARD)) {
            n = 0.05f;
            "".length();
            if (-(0x5D ^ 0x58) >= 0) {
                return;
            }
        }
        else {
            n = 0.01f;
        }
        if (lIIlIlIIlllIllII(lIIlIlIIllllIlII(nextFloat, n))) {
            final int llllllllllllIllIlIIlllIlllIIlIlI = this.rand.nextInt(EntityZombie.llIlIllIIIIlII[3]);
            if (lIIlIlIIlllIlIII(llllllllllllIllIlIIlllIlllIIlIlI)) {
                this.setCurrentItemOrArmor(EntityZombie.llIlIllIIIIlII[0], new ItemStack(Items.iron_sword));
                "".length();
                if (((0x63 ^ 0x36 ^ (0x37 ^ 0x2E)) & (0xFD ^ 0xB1 ^ ((0x13 ^ 0x3A) & ~(0x93 ^ 0xBA)) ^ -" ".length())) < 0) {
                    return;
                }
            }
            else {
                this.setCurrentItemOrArmor(EntityZombie.llIlIllIIIIlII[0], new ItemStack(Items.iron_shovel));
            }
        }
    }
    
    private static int lIIlIlIIllllIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIlIlIIlllIllII(final int llllllllllllIllIlIIlllIIllIlllIl) {
        return llllllllllllIllIlIIlllIIllIlllIl < 0;
    }
    
    private static String lIIlIlIIllIllllI(final String llllllllllllIllIlIIlllIlIIlIIlll, final String llllllllllllIllIlIIlllIlIIlIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlllIlIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlllIlIIlIlIII.getBytes(StandardCharsets.UTF_8)), EntityZombie.llIlIllIIIIlII[6]), "DES");
            final Cipher llllllllllllIllIlIIlllIlIIlIlIll = Cipher.getInstance("DES");
            llllllllllllIllIlIIlllIlIIlIlIll.init(EntityZombie.llIlIllIIIIlII[2], llllllllllllIllIlIIlllIlIIlIllII);
            return new String(llllllllllllIllIlIIlllIlIIlIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlllIlIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlllIlIIlIlIlI) {
            llllllllllllIllIlIIlllIlIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance llllllllllllIllIlIIlllIllIIllIlI, IEntityLivingData llllllllllllIllIlIIlllIllIIIllll) {
        llllllllllllIllIlIIlllIllIIIllll = super.onInitialSpawn(llllllllllllIllIlIIlllIllIIllIlI, llllllllllllIllIlIIlllIllIIIllll);
        final float llllllllllllIllIlIIlllIllIIllIII = llllllllllllIllIlIIlllIllIIllIlI.getClampedAdditionalDifficulty();
        int canPickUpLoot;
        if (lIIlIlIIlllIllII(lIIlIlIIllllIlll(this.rand.nextFloat(), 0.55f * llllllllllllIllIlIIlllIllIIllIII))) {
            canPickUpLoot = EntityZombie.llIlIllIIIIlII[1];
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        else {
            canPickUpLoot = EntityZombie.llIlIllIIIIlII[0];
        }
        this.setCanPickUpLoot((boolean)(canPickUpLoot != 0));
        if (lIIlIlIIlllIllll(llllllllllllIllIlIIlllIllIIIllll)) {
            int lllllllllllllIIlIllIIlIIIlIlIIIl;
            if (lIIlIlIIlllIllII(lIIlIlIIllllIlll(this.worldObj.rand.nextFloat(), 0.05f))) {
                lllllllllllllIIlIllIIlIIIlIlIIIl = EntityZombie.llIlIllIIIIlII[1];
                "".length();
                if ("   ".length() < 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlIllIIlIIIlIlIIIl = EntityZombie.llIlIllIIIIlII[0];
            }
            int lllllllllllllIIlIllIIlIIIlIlIIII;
            if (lIIlIlIIlllIllII(lIIlIlIIllllIlll(this.worldObj.rand.nextFloat(), 0.05f))) {
                lllllllllllllIIlIllIIlIIIlIlIIII = EntityZombie.llIlIllIIIIlII[1];
                "".length();
                if ("   ".length() >= (17 + 84 - 14 + 77 ^ 122 + 37 - 131 + 132)) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlIllIIlIIIlIlIIII = EntityZombie.llIlIllIIIIlII[0];
            }
            llllllllllllIllIlIIlllIllIIIllll = new GroupData((boolean)(lllllllllllllIIlIllIIlIIIlIlIIIl != 0), (boolean)(lllllllllllllIIlIllIIlIIIlIlIIII != 0), (GroupData)null);
        }
        if (lIIlIlIIlllIIlIl((llllllllllllIllIlIIlllIllIIIllll instanceof GroupData) ? 1 : 0)) {
            final GroupData llllllllllllIllIlIIlllIllIIlIlll = (GroupData)llllllllllllIllIlIIlllIllIIIllll;
            if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIlllIllIIlIlll.isVillager ? 1 : 0)) {
                this.setVillager((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
            }
            if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIlllIllIIlIlll.isChild ? 1 : 0)) {
                this.setChild((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
                if (lIIlIlIIlllIllII(lIIlIlIIlllllIII(this.worldObj.rand.nextFloat(), 0.05))) {
                    final List<EntityChicken> llllllllllllIllIlIIlllIllIIlIllI = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityChicken>)EntityChicken.class, this.getEntityBoundingBox().expand(5.0, 3.0, 5.0), (com.google.common.base.Predicate<? super EntityChicken>)EntitySelectors.IS_STANDALONE);
                    if (lIIlIlIIlllIlIII(llllllllllllIllIlIIlllIllIIlIllI.isEmpty() ? 1 : 0)) {
                        final EntityChicken llllllllllllIllIlIIlllIllIIlIlIl = llllllllllllIllIlIIlllIllIIlIllI.get(EntityZombie.llIlIllIIIIlII[0]);
                        llllllllllllIllIlIIlllIllIIlIlIl.setChickenJockey((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
                        this.mountEntity(llllllllllllIllIlIIlllIllIIlIlIl);
                        "".length();
                        if ((0xB7 ^ 0xB2) == 0x0) {
                            return null;
                        }
                    }
                }
                else if (lIIlIlIIlllIllII(lIIlIlIIlllllIII(this.worldObj.rand.nextFloat(), 0.05))) {
                    final EntityChicken llllllllllllIllIlIIlllIllIIlIlII = new EntityChicken(this.worldObj);
                    llllllllllllIllIlIIlllIllIIlIlII.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0f);
                    llllllllllllIllIlIIlllIllIIlIlII.onInitialSpawn(llllllllllllIllIlIIlllIllIIllIlI, null);
                    "".length();
                    llllllllllllIllIlIIlllIllIIlIlII.setChickenJockey((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
                    this.worldObj.spawnEntityInWorld(llllllllllllIllIlIIlllIllIIlIlII);
                    "".length();
                    this.mountEntity(llllllllllllIllIlIIlllIllIIlIlII);
                }
            }
        }
        int breakDoorsAItask;
        if (lIIlIlIIlllIllII(lIIlIlIIllllIlll(this.rand.nextFloat(), llllllllllllIllIlIIlllIllIIllIII * 0.1f))) {
            breakDoorsAItask = EntityZombie.llIlIllIIIIlII[1];
            "".length();
            if (-" ".length() >= " ".length()) {
                return null;
            }
        }
        else {
            breakDoorsAItask = EntityZombie.llIlIllIIIIlII[0];
        }
        this.setBreakDoorsAItask((boolean)(breakDoorsAItask != 0));
        this.setEquipmentBasedOnDifficulty(llllllllllllIllIlIIlllIllIIllIlI);
        this.setEnchantmentBasedOnDifficulty(llllllllllllIllIlIIlllIllIIllIlI);
        if (lIIlIlIIlllIllll(this.getEquipmentInSlot(EntityZombie.llIlIllIIIIlII[7]))) {
            final Calendar llllllllllllIllIlIIlllIllIIlIIll = this.worldObj.getCurrentDate();
            if (lIIlIlIIlllIIllI(llllllllllllIllIlIIlllIllIIlIIll.get(EntityZombie.llIlIllIIIIlII[2]) + EntityZombie.llIlIllIIIIlII[1], EntityZombie.llIlIllIIIIlII[15]) && lIIlIlIIlllIIllI(llllllllllllIllIlIIlllIllIIlIIll.get(EntityZombie.llIlIllIIIIlII[4]), EntityZombie.llIlIllIIIIlII[26]) && lIIlIlIIlllIllII(lIIlIlIIllllIlll(this.rand.nextFloat(), 0.25f))) {
                final int lllllllllllllIIIIIlllIlIIIIIlllI = EntityZombie.llIlIllIIIIlII[7];
                Block lllllllllllllIIlllIllIIIlllIllIl;
                if (lIIlIlIIlllIllII(lIIlIlIIllllIlll(this.rand.nextFloat(), 0.1f))) {
                    lllllllllllllIIlllIllIIIlllIllIl = Blocks.lit_pumpkin;
                    "".length();
                    if (((0x5 ^ 0x4A) & ~(0x4D ^ 0x2)) < 0) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIlllIllIIIlllIllIl = Blocks.pumpkin;
                }
                this.setCurrentItemOrArmor(lllllllllllllIIIIIlllIlIIIIIlllI, new ItemStack(lllllllllllllIIlllIllIIIlllIllIl));
                this.equipmentDropChances[EntityZombie.llIlIllIIIIlII[7]] = 0.0f;
            }
        }
        this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).applyModifier(new AttributeModifier(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[12]], this.rand.nextDouble() * 0.05000000074505806, EntityZombie.llIlIllIIIIlII[0]));
        final double llllllllllllIllIlIIlllIllIIlIIlI = this.rand.nextDouble() * 1.5 * llllllllllllIllIlIIlllIllIIllIII;
        if (lIIlIlIIlllIlIll(lIIlIlIIlllllIIl(llllllllllllIllIlIIlllIllIIlIIlI, 1.0))) {
            this.getEntityAttribute(SharedMonsterAttributes.followRange).applyModifier(new AttributeModifier(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[27]], llllllllllllIllIlIIlllIllIIlIIlI, EntityZombie.llIlIllIIIIlII[2]));
        }
        if (lIIlIlIIlllIllII(lIIlIlIIllllIlll(this.rand.nextFloat(), llllllllllllIllIlIIlllIllIIllIII * 0.05f))) {
            this.getEntityAttribute(EntityZombie.reinforcementChance).applyModifier(new AttributeModifier(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[28]], this.rand.nextDouble() * 0.25 + 0.5, EntityZombie.llIlIllIIIIlII[0]));
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).applyModifier(new AttributeModifier(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[29]], this.rand.nextDouble() * 3.0 + 1.0, EntityZombie.llIlIllIIIIlII[2]));
            this.setBreakDoorsAItask((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
        }
        return llllllllllllIllIlIIlllIllIIIllll;
    }
    
    protected final void multiplySize(final float llllllllllllIllIlIIlllIlIIlllIlI) {
        super.setSize(this.zombieWidth * llllllllllllIllIlIIlllIlIIlllIlI, this.zombieHeight * llllllllllllIllIlIIlllIlIIlllIlI);
    }
    
    public void setChild(final boolean llllllllllllIllIlIIllllIIIlIllII) {
        final DataWatcher dataWatcher = this.getDataWatcher();
        final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityZombie.llIlIllIIIIlII[9];
        int n;
        if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIllllIIIlIllII ? 1 : 0)) {
            n = EntityZombie.llIlIllIIIIlII[1];
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
        else {
            n = EntityZombie.llIlIllIIIIlII[0];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
        if (lIIlIlIIlllIIlll(this.worldObj) && lIIlIlIIlllIlIII(this.worldObj.isRemote ? 1 : 0)) {
            final IAttributeInstance llllllllllllIllIlIIllllIIIlIlllI = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
            llllllllllllIllIlIIllllIIIlIlllI.removeModifier(EntityZombie.babySpeedBoostModifier);
            if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIllllIIIlIllII ? 1 : 0)) {
                llllllllllllIllIlIIllllIIIlIlllI.applyModifier(EntityZombie.babySpeedBoostModifier);
            }
        }
        this.setChildSize(llllllllllllIllIlIIllllIIIlIllII);
    }
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEAD;
    }
    
    public boolean interact(final EntityPlayer llllllllllllIllIlIIlllIllIIIIIll) {
        final ItemStack llllllllllllIllIlIIlllIllIIIIlIl = llllllllllllIllIlIIlllIllIIIIIll.getCurrentEquippedItem();
        if (lIIlIlIIlllIIlll(llllllllllllIllIlIIlllIllIIIIlIl) && lIIlIlIIllllIIII(llllllllllllIllIlIIlllIllIIIIlIl.getItem(), Items.golden_apple) && lIIlIlIIlllIlIII(llllllllllllIllIlIIlllIllIIIIlIl.getMetadata()) && lIIlIlIIlllIIlIl(this.isVillager() ? 1 : 0) && lIIlIlIIlllIIlIl(this.isPotionActive(Potion.weakness) ? 1 : 0)) {
            if (lIIlIlIIlllIlIII(llllllllllllIllIlIIlllIllIIIIIll.capabilities.isCreativeMode ? 1 : 0)) {
                final ItemStack itemStack = llllllllllllIllIlIIlllIllIIIIlIl;
                itemStack.stackSize -= EntityZombie.llIlIllIIIIlII[1];
            }
            if (lIIlIlIIllllIIlI(llllllllllllIllIlIIlllIllIIIIlIl.stackSize)) {
                llllllllllllIllIlIIlllIllIIIIIll.inventory.setInventorySlotContents(llllllllllllIllIlIIlllIllIIIIIll.inventory.currentItem, null);
            }
            if (lIIlIlIIlllIlIII(this.worldObj.isRemote ? 1 : 0)) {
                this.startConversion(this.rand.nextInt(EntityZombie.llIlIllIIIIlII[30]) + EntityZombie.llIlIllIIIIlII[31]);
            }
            return EntityZombie.llIlIllIIIIlII[1] != 0;
        }
        return EntityZombie.llIlIllIIIIlII[0] != 0;
    }
    
    private static void lIIlIlIIlllIIIlI() {
        (llIlIllIIIIlII = new int[37])[0] = ((70 + 77 + 6 + 15 ^ 67 + 9 - 0 + 67) & (0xD2 ^ 0xB1 ^ (0x77 ^ 0x33) ^ -" ".length()));
        EntityZombie.llIlIllIIIIlII[1] = " ".length();
        EntityZombie.llIlIllIIIIlII[2] = "  ".length();
        EntityZombie.llIlIllIIIIlII[3] = "   ".length();
        EntityZombie.llIlIllIIIIlII[4] = (0x17 ^ 0x12);
        EntityZombie.llIlIllIIIIlII[5] = (0x1F ^ 0x18);
        EntityZombie.llIlIllIIIIlII[6] = (0x8C ^ 0x84);
        EntityZombie.llIlIllIIIIlII[7] = (0x19 ^ 0x77 ^ (0x31 ^ 0x5B));
        EntityZombie.llIlIllIIIIlII[8] = (0x64 ^ 0x62);
        EntityZombie.llIlIllIIIIlII[9] = (0x92 ^ 0x9E);
        EntityZombie.llIlIllIIIIlII[10] = (83 + 7 - 74 + 130 ^ 76 + 141 - 121 + 63);
        EntityZombie.llIlIllIIIIlII[11] = (0x1A ^ 0x14);
        EntityZombie.llIlIllIIIIlII[12] = (0x25 ^ 0x31);
        EntityZombie.llIlIllIIIIlII[13] = (0x70 ^ 0x58);
        EntityZombie.llIlIllIIIIlII[14] = -" ".length();
        EntityZombie.llIlIllIIIIlII[15] = (0x21 ^ 0x31 ^ (0xAD ^ 0xB7));
        EntityZombie.llIlIllIIIIlII[16] = (147 + 1 - 102 + 124 ^ 65 + 111 - 84 + 60);
        EntityZombie.llIlIllIIIIlII[17] = (0x85 ^ 0xB8 ^ (0xA7 ^ 0x93));
        EntityZombie.llIlIllIIIIlII[18] = (92 + 29 - 9 + 17 ^ 103 + 112 - 153 + 76);
        EntityZombie.llIlIllIIIIlII[19] = (0x15 ^ 0x1A);
        EntityZombie.llIlIllIIIIlII[20] = (11 + 154 - 17 + 22 ^ 93 + 56 - 25 + 62);
        EntityZombie.llIlIllIIIIlII[21] = (0x48 ^ 0x2B);
        EntityZombie.llIlIllIIIIlII[22] = (0x5D ^ 0x73 ^ (0x53 ^ 0x6C));
        EntityZombie.llIlIllIIIIlII[23] = (0x28 ^ 0x3A);
        EntityZombie.llIlIllIIIIlII[24] = (0x9C ^ 0xAB ^ (0x18 ^ 0x3C));
        EntityZombie.llIlIllIIIIlII[25] = (0xFFFFB3F8 & 0x4FFF);
        EntityZombie.llIlIllIIIIlII[26] = (0x79 ^ 0x66);
        EntityZombie.llIlIllIIIIlII[27] = (0xFE ^ 0x92 ^ (0x61 ^ 0x18));
        EntityZombie.llIlIllIIIIlII[28] = (0xEF ^ 0xB1 ^ (0x4 ^ 0x4C));
        EntityZombie.llIlIllIIIIlII[29] = (0xC4 ^ 0x97 ^ (0x15 ^ 0x51));
        EntityZombie.llIlIllIIIIlII[30] = (-(25 + 18 + 32 + 60) & (0xFFFFDFF7 & 0x29EF));
        EntityZombie.llIlIllIIIIlII[31] = (-(0xFFFFF198 & 0x7FEF) & (0xFFFFFFDF & 0x7FB7));
        EntityZombie.llIlIllIIIIlII[32] = (55 + 212 - 47 + 2 ^ 110 + 20 - 25 + 93);
        EntityZombie.llIlIllIIIIlII[33] = -(0xFFFFFDD6 & 0x5FE9);
        EntityZombie.llIlIllIIIIlII[34] = (0xF8 ^ 0x98) + (0xCF ^ 0x83) - (7 + 7 - 2 + 116) + (71 + 66 - 37 + 56);
        EntityZombie.llIlIllIIIIlII[35] = (-(0xFFFFDD25 & 0x3EDB) & (0xFFFFDFFD & 0x3FFB));
        EntityZombie.llIlIllIIIIlII[36] = (0x10 ^ 0x9);
    }
    
    private static int lIIlIlIIllllIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIIlIlIIlllIlIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIIlIlIIllllIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void onLivingUpdate() {
        if (lIIlIlIIlllIIlIl(this.worldObj.isDaytime() ? 1 : 0) && lIIlIlIIlllIlIII(this.worldObj.isRemote ? 1 : 0) && lIIlIlIIlllIlIII(this.isChild() ? 1 : 0)) {
            final float llllllllllllIllIlIIllllIIIIllIll = this.getBrightness(1.0f);
            final BlockPos llllllllllllIllIlIIllllIIIIllIlI = new BlockPos(this.posX, (double)Math.round(this.posY), this.posZ);
            if (lIIlIlIIlllIlIll(lIIlIlIIlllIlIIl(llllllllllllIllIlIIllllIIIIllIll, 0.5f)) && lIIlIlIIlllIllII(lIIlIlIIlllIlIlI(this.rand.nextFloat() * 30.0f, (llllllllllllIllIlIIllllIIIIllIll - 0.4f) * 2.0f)) && lIIlIlIIlllIIlIl(this.worldObj.canSeeSky(llllllllllllIllIlIIllllIIIIllIlI) ? 1 : 0)) {
                boolean llllllllllllIllIlIIllllIIIIllIIl = EntityZombie.llIlIllIIIIlII[1] != 0;
                final ItemStack llllllllllllIllIlIIllllIIIIllIII = this.getEquipmentInSlot(EntityZombie.llIlIllIIIIlII[7]);
                if (lIIlIlIIlllIIlll(llllllllllllIllIlIIllllIIIIllIII)) {
                    if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIllllIIIIllIII.isItemStackDamageable() ? 1 : 0)) {
                        llllllllllllIllIlIIllllIIIIllIII.setItemDamage(llllllllllllIllIlIIllllIIIIllIII.getItemDamage() + this.rand.nextInt(EntityZombie.llIlIllIIIIlII[2]));
                        if (lIIlIlIIlllIllIl(llllllllllllIllIlIIllllIIIIllIII.getItemDamage(), llllllllllllIllIlIIllllIIIIllIII.getMaxDamage())) {
                            this.renderBrokenItemStack(llllllllllllIllIlIIllllIIIIllIII);
                            this.setCurrentItemOrArmor(EntityZombie.llIlIllIIIIlII[7], null);
                        }
                    }
                    llllllllllllIllIlIIllllIIIIllIIl = (EntityZombie.llIlIllIIIIlII[0] != 0);
                }
                if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIllllIIIIllIIl ? 1 : 0)) {
                    this.setFire(EntityZombie.llIlIllIIIIlII[6]);
                }
            }
        }
        if (lIIlIlIIlllIIlIl(this.isRiding() ? 1 : 0) && lIIlIlIIlllIIlll(this.getAttackTarget()) && lIIlIlIIlllIIlIl((this.ridingEntity instanceof EntityChicken) ? 1 : 0)) {
            ((EntityLiving)this.ridingEntity).getNavigator().setPath(this.getNavigator().getPath(), 1.5);
            "".length();
        }
        super.onLivingUpdate();
    }
    
    @Override
    protected int getExperiencePoints(final EntityPlayer llllllllllllIllIlIIllllIIIllIllI) {
        if (lIIlIlIIlllIIlIl(this.isChild() ? 1 : 0)) {
            this.experienceValue *= (int)2.5f;
        }
        return super.getExperiencePoints(llllllllllllIllIlIIllllIIIllIllI);
    }
    
    @Override
    protected final void setSize(final float llllllllllllIllIlIIlllIlIlIIIllI, final float llllllllllllIllIlIIlllIlIlIIIlIl) {
        int n;
        if (lIIlIlIIlllIlIll(lIIlIlIIlllllIll(this.zombieWidth, 0.0f)) && lIIlIlIIlllIlIll(lIIlIlIIlllllIll(this.zombieHeight, 0.0f))) {
            n = EntityZombie.llIlIllIIIIlII[1];
            "".length();
            if (" ".length() == ((0x3F ^ 0x1B) & ~(0x47 ^ 0x63))) {
                return;
            }
        }
        else {
            n = EntityZombie.llIlIllIIIIlII[0];
        }
        final boolean llllllllllllIllIlIIlllIlIlIIIlII = n != 0;
        this.zombieWidth = llllllllllllIllIlIIlllIlIlIIIllI;
        this.zombieHeight = llllllllllllIllIlIIlllIlIlIIIlIl;
        if (lIIlIlIIlllIlIII(llllllllllllIllIlIIlllIlIlIIIlII ? 1 : 0)) {
            this.multiplySize(1.0f);
        }
    }
    
    @Override
    public void onKillEntity(final EntityLivingBase llllllllllllIllIlIIlllIllIllIlIl) {
        super.onKillEntity(llllllllllllIllIlIIlllIllIllIlIl);
        if ((!lIIlIlIIllllIllI(this.worldObj.getDifficulty(), EnumDifficulty.NORMAL) || lIIlIlIIllllIIII(this.worldObj.getDifficulty(), EnumDifficulty.HARD)) && lIIlIlIIlllIIlIl((llllllllllllIllIlIIlllIllIllIlIl instanceof EntityVillager) ? 1 : 0)) {
            if (lIIlIlIIllllIllI(this.worldObj.getDifficulty(), EnumDifficulty.HARD) && lIIlIlIIlllIIlIl(this.rand.nextBoolean() ? 1 : 0)) {
                return;
            }
            final EntityLiving llllllllllllIllIlIIlllIllIllIlII = (EntityLiving)llllllllllllIllIlIIlllIllIllIlIl;
            final EntityZombie llllllllllllIllIlIIlllIllIllIIll = new EntityZombie(this.worldObj);
            llllllllllllIllIlIIlllIllIllIIll.copyLocationAndAnglesFrom(llllllllllllIllIlIIlllIllIllIlIl);
            this.worldObj.removeEntity(llllllllllllIllIlIIlllIllIllIlIl);
            llllllllllllIllIlIIlllIllIllIIll.onInitialSpawn(this.worldObj.getDifficultyForLocation(new BlockPos(llllllllllllIllIlIIlllIllIllIIll)), null);
            "".length();
            llllllllllllIllIlIIlllIllIllIIll.setVillager((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
            if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIlllIllIllIlIl.isChild() ? 1 : 0)) {
                llllllllllllIllIlIIlllIllIllIIll.setChild((boolean)(EntityZombie.llIlIllIIIIlII[1] != 0));
            }
            llllllllllllIllIlIIlllIllIllIIll.setNoAI(llllllllllllIllIlIIlllIllIllIlII.isAIDisabled());
            if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIlllIllIllIlII.hasCustomName() ? 1 : 0)) {
                llllllllllllIllIlIIlllIllIllIIll.setCustomNameTag(llllllllllllIllIlIIlllIllIllIlII.getCustomNameTag());
                llllllllllllIllIlIIlllIllIllIIll.setAlwaysRenderNameTag(llllllllllllIllIlIIlllIllIllIlII.getAlwaysRenderNameTag());
            }
            this.worldObj.spawnEntityInWorld(llllllllllllIllIlIIlllIllIllIIll);
            "".length();
            this.worldObj.playAuxSFXAtEntity(null, EntityZombie.llIlIllIIIIlII[25], new BlockPos((int)this.posX, (int)this.posY, (int)this.posZ), EntityZombie.llIlIllIIIIlII[0]);
        }
    }
    
    private static int lIIlIlIIlllIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIlIlIIlllIlIII(final int llllllllllllIllIlIIlllIIllIlllll) {
        return llllllllllllIllIlIIlllIIllIlllll == 0;
    }
    
    @Override
    protected String getLivingSound() {
        return EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[8]];
    }
    
    private static boolean lIIlIlIIlllIIlll(final Object llllllllllllIllIlIIlllIIlllIlIIl) {
        return llllllllllllIllIlIIlllIIlllIlIIl != null;
    }
    
    @Override
    public boolean isChild() {
        if (lIIlIlIIlllIIllI(this.getDataWatcher().getWatchableObjectByte(EntityZombie.llIlIllIIIIlII[9]), EntityZombie.llIlIllIIIIlII[1])) {
            return EntityZombie.llIlIllIIIIlII[1] != 0;
        }
        return EntityZombie.llIlIllIIIIlII[0] != 0;
    }
    
    protected void startConversion(final int llllllllllllIllIlIIlllIlIlllllII) {
        this.conversionTime = llllllllllllIllIlIIlllIlIlllllII;
        this.getDataWatcher().updateObject(EntityZombie.llIlIllIIIIlII[11], (byte)EntityZombie.llIlIllIIIIlII[1]);
        this.removePotionEffect(Potion.weakness.id);
        this.addPotionEffect(new PotionEffect(Potion.damageBoost.id, llllllllllllIllIlIIlllIlIlllllII, Math.min(this.worldObj.getDifficulty().getDifficultyId() - EntityZombie.llIlIllIIIIlII[1], EntityZombie.llIlIllIIIIlII[0])));
        this.worldObj.setEntityState(this, (byte)EntityZombie.llIlIllIIIIlII[20]);
    }
    
    @Override
    public int getTotalArmorValue() {
        int llllllllllllIllIlIIllllIIlIIlIII = super.getTotalArmorValue() + EntityZombie.llIlIllIIIIlII[2];
        if (lIIlIlIIlllIIIll(llllllllllllIllIlIIllllIIlIIlIII, EntityZombie.llIlIllIIIIlII[12])) {
            llllllllllllIllIlIIllllIIlIIlIII = EntityZombie.llIlIllIIIIlII[12];
        }
        return llllllllllllIllIlIIllllIIlIIlIII;
    }
    
    public void setChildSize(final boolean llllllllllllIllIlIIlllIlIlIIlllI) {
        float llllllllllllIllIlIIlllIlIIlllIlI;
        if (lIIlIlIIlllIIlIl(llllllllllllIllIlIIlllIlIlIIlllI ? 1 : 0)) {
            llllllllllllIllIlIIlllIlIIlllIlI = 0.5f;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            llllllllllllIllIlIIlllIlIIlllIlI = 1.0f;
        }
        this.multiplySize(llllllllllllIllIlIIlllIlIIlllIlI);
    }
    
    @Override
    protected void playStepSound(final BlockPos llllllllllllIllIlIIlllIlllIlIlll, final Block llllllllllllIllIlIIlllIlllIlIllI) {
        this.playSound(EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[17]], 0.15f, 1.0f);
    }
    
    @Override
    public float getEyeHeight() {
        float llllllllllllIllIlIIlllIllIlIlIll = 1.74f;
        if (lIIlIlIIlllIIlIl(this.isChild() ? 1 : 0)) {
            llllllllllllIllIlIIlllIllIlIlIll -= (float)0.81;
        }
        return llllllllllllIllIlIIlllIllIlIlIll;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(35.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0);
        this.getAttributeMap().registerAttribute(EntityZombie.reinforcementChance).setBaseValue(this.rand.nextDouble() * 0.10000000149011612);
    }
    
    private static boolean lIIlIlIIlllIIIll(final int llllllllllllIllIlIIlllIIllllIIII, final int llllllllllllIllIlIIlllIIlllIllll) {
        return llllllllllllIllIlIIlllIIllllIIII > llllllllllllIllIlIIlllIIlllIllll;
    }
    
    private static int lIIlIlIIlllllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIlIlIIllllIllI(final Object llllllllllllIllIlIIlllIIlllIllII, final Object llllllllllllIllIlIIlllIIlllIlIll) {
        return llllllllllllIllIlIIlllIIlllIllII != llllllllllllIllIlIIlllIIlllIlIll;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[5]];
    }
    
    @Override
    protected String getDeathSound() {
        return EntityZombie.llIlIllIIIIIll[EntityZombie.llIlIllIIIIlII[6]];
    }
    
    private static String lIIlIlIIlllIIIII(String llllllllllllIllIlIIlllIlIIIIllII, final String llllllllllllIllIlIIlllIlIIIIlIll) {
        llllllllllllIllIlIIlllIlIIIIllII = new String(Base64.getDecoder().decode(llllllllllllIllIlIIlllIlIIIIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlllIlIIIIlIlI = new StringBuilder();
        final char[] llllllllllllIllIlIIlllIlIIIIlIIl = llllllllllllIllIlIIlllIlIIIIlIll.toCharArray();
        int llllllllllllIllIlIIlllIlIIIIlIII = EntityZombie.llIlIllIIIIlII[0];
        final int llllllllllllIllIlIIlllIlIIIIIIlI = (Object)llllllllllllIllIlIIlllIlIIIIllII.toCharArray();
        final int llllllllllllIllIlIIlllIlIIIIIIIl = llllllllllllIllIlIIlllIlIIIIIIlI.length;
        double llllllllllllIllIlIIlllIlIIIIIIII = EntityZombie.llIlIllIIIIlII[0];
        while (lIIlIlIIllllIIIl((int)llllllllllllIllIlIIlllIlIIIIIIII, llllllllllllIllIlIIlllIlIIIIIIIl)) {
            final char llllllllllllIllIlIIlllIlIIIIllIl = llllllllllllIllIlIIlllIlIIIIIIlI[llllllllllllIllIlIIlllIlIIIIIIII];
            llllllllllllIllIlIIlllIlIIIIlIlI.append((char)(llllllllllllIllIlIIlllIlIIIIllIl ^ llllllllllllIllIlIIlllIlIIIIlIIl[llllllllllllIllIlIIlllIlIIIIlIII % llllllllllllIllIlIIlllIlIIIIlIIl.length]));
            "".length();
            ++llllllllllllIllIlIIlllIlIIIIlIII;
            ++llllllllllllIllIlIIlllIlIIIIIIII;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlllIlIIIIlIlI);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.getDataWatcher().addObject(EntityZombie.llIlIllIIIIlII[9], (byte)EntityZombie.llIlIllIIIIlII[0]);
        this.getDataWatcher().addObject(EntityZombie.llIlIllIIIIlII[10], (byte)EntityZombie.llIlIllIIIIlII[0]);
        this.getDataWatcher().addObject(EntityZombie.llIlIllIIIIlII[11], (byte)EntityZombie.llIlIllIIIIlII[0]);
    }
    
    @Override
    protected Item getDropItem() {
        return Items.rotten_flesh;
    }
    
    private static boolean lIIlIlIIllllIIlI(final int llllllllllllIllIlIIlllIIllIllIll) {
        return llllllllllllIllIlIIlllIIllIllIll <= 0;
    }
    
    private static int lIIlIlIIlllllIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    class GroupData implements IEntityLivingData
    {
        public /* synthetic */ boolean isVillager;
        public /* synthetic */ boolean isChild;
        private static final /* synthetic */ int[] lIIllIIIlllIII;
        
        private static void llIlIllIllIIllI() {
            (lIIllIIIlllIII = new int[1])[0] = ((0x20 ^ 0x25) & ~(0x5F ^ 0x5A));
        }
        
        static {
            llIlIllIllIIllI();
        }
        
        private GroupData(final boolean lllllllllllllIIlIllIIlIIIlIllIIl, final boolean lllllllllllllIIlIllIIlIIIlIllIII) {
            this.isChild = (GroupData.lIIllIIIlllIII[0] != 0);
            this.isVillager = (GroupData.lIIllIIIlllIII[0] != 0);
            this.isChild = lllllllllllllIIlIllIIlIIIlIllIIl;
            this.isVillager = lllllllllllllIIlIllIIlIIIlIllIII;
        }
    }
}
