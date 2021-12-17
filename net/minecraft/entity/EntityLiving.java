// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import java.util.Iterator;
import net.minecraft.entity.monster.IMob;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.item.ItemBlock;
import java.util.UUID;
import java.util.Arrays;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.nbt.NBTBase;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.profiler.Profiler;
import net.minecraft.world.World;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.DifficultyInstance;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemArmor;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S1BPacketEntityAttach;
import net.minecraft.world.WorldServer;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.entity.ai.EntitySenses;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.entity.ai.EntityLookHelper;
import net.minecraft.entity.ai.EntityJumpHelper;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.ai.EntityAITasks;

public abstract class EntityLiving extends EntityLivingBase
{
    private /* synthetic */ EntityLivingBase attackTarget;
    private static final /* synthetic */ String[] lIllIIIIlllIIl;
    protected final /* synthetic */ EntityAITasks tasks;
    protected /* synthetic */ float[] equipmentDropChances;
    private /* synthetic */ NBTTagCompound leashNBTTag;
    private /* synthetic */ EntityBodyHelper bodyHelper;
    private static final /* synthetic */ int[] lIllIIIIlllIlI;
    private /* synthetic */ ItemStack[] equipment;
    private /* synthetic */ boolean canPickUpLoot;
    protected /* synthetic */ EntityMoveHelper moveHelper;
    protected /* synthetic */ EntityJumpHelper jumpHelper;
    public /* synthetic */ int livingSoundTime;
    private /* synthetic */ Entity leashedToEntity;
    private /* synthetic */ EntityLookHelper lookHelper;
    private /* synthetic */ boolean isLeashed;
    protected /* synthetic */ PathNavigate navigator;
    private /* synthetic */ boolean persistenceRequired;
    protected final /* synthetic */ EntityAITasks targetTasks;
    private /* synthetic */ EntitySenses senses;
    protected /* synthetic */ int experienceValue;
    
    public boolean canAttackClass(final Class<? extends EntityLivingBase> lllllllllllllIIIIIlllIllIIIlIllI) {
        if (llllIlllIIlIIll(lllllllllllllIIIIIlllIllIIIlIllI, EntityGhast.class)) {
            return EntityLiving.lIllIIIIlllIlI[2] != 0;
        }
        return EntityLiving.lIllIIIIlllIlI[1] != 0;
    }
    
    private static boolean llllIlllIIlIIlI(final int lllllllllllllIIIIIlllIIlIIIllIlI, final int lllllllllllllIIIIIlllIIlIIIllIIl) {
        return lllllllllllllIIIIIlllIIlIIIllIlI >= lllllllllllllIIIIIlllIIlIIIllIIl;
    }
    
    private static boolean llllIlllIIlIlIl(final int lllllllllllllIIIIIlllIIlIIIlIllI, final int lllllllllllllIIIIIlllIIlIIIlIlIl) {
        return lllllllllllllIIIIIlllIIlIIIlIllI < lllllllllllllIIIIIlllIIlIIIlIlIl;
    }
    
    @Override
    protected void dropEquipment(final boolean lllllllllllllIIIIIlllIIlllllllIl, final int lllllllllllllIIIIIlllIIlllllllII) {
        int lllllllllllllIIIIIlllIIllllllIll = EntityLiving.lIllIIIIlllIlI[1];
        "".length();
        if ((37 + 8 + 49 + 34 ^ 111 + 30 - 55 + 47) <= 0) {
            return;
        }
        while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIIllllllIll, this.getInventory().length)) {
            final ItemStack lllllllllllllIIIIIlllIIllllllIlI = this.getEquipmentInSlot(lllllllllllllIIIIIlllIIllllllIll);
            int n;
            if (llllIlllIIlIlll(llllIlllIlIIlll(this.equipmentDropChances[lllllllllllllIIIIIlllIIllllllIll], 1.0f))) {
                n = EntityLiving.lIllIIIIlllIlI[2];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                n = EntityLiving.lIllIIIIlllIlI[1];
            }
            final boolean lllllllllllllIIIIIlllIIllllllIIl = n != 0;
            if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIIllllllIlI) && (!llllIlllIIllIlI(lllllllllllllIIIIIlllIIlllllllIl ? 1 : 0) || llllIlllIIlIlII(lllllllllllllIIIIIlllIIllllllIIl ? 1 : 0)) && llllIlllIlIIIII(llllIlllIlIlIII(this.rand.nextFloat() - lllllllllllllIIIIIlllIIlllllllII * 0.01f, this.equipmentDropChances[lllllllllllllIIIIIlllIIllllllIll]))) {
                if (llllIlllIIllIlI(lllllllllllllIIIIIlllIIllllllIIl ? 1 : 0) && llllIlllIIlIlII(lllllllllllllIIIIIlllIIllllllIlI.isItemStackDamageable() ? 1 : 0)) {
                    final int lllllllllllllIIIIIlllIIllllllIII = Math.max(lllllllllllllIIIIIlllIIllllllIlI.getMaxDamage() - EntityLiving.lIllIIIIlllIlI[27], EntityLiving.lIllIIIIlllIlI[2]);
                    int lllllllllllllIIIIIlllIIlllllIlll = lllllllllllllIIIIIlllIIllllllIlI.getMaxDamage() - this.rand.nextInt(this.rand.nextInt(lllllllllllllIIIIIlllIIllllllIII) + EntityLiving.lIllIIIIlllIlI[2]);
                    if (llllIlllIIlllIl(lllllllllllllIIIIIlllIIlllllIlll, lllllllllllllIIIIIlllIIllllllIII)) {
                        lllllllllllllIIIIIlllIIlllllIlll = lllllllllllllIIIIIlllIIllllllIII;
                    }
                    if (llllIlllIIlIlIl(lllllllllllllIIIIIlllIIlllllIlll, EntityLiving.lIllIIIIlllIlI[2])) {
                        lllllllllllllIIIIIlllIIlllllIlll = EntityLiving.lIllIIIIlllIlI[2];
                    }
                    lllllllllllllIIIIIlllIIllllllIlI.setItemDamage(lllllllllllllIIIIIlllIIlllllIlll);
                }
                this.entityDropItem(lllllllllllllIIIIIlllIIllllllIlI, 0.0f);
                "".length();
            }
            ++lllllllllllllIIIIIlllIIllllllIll;
        }
    }
    
    public boolean isNotColliding() {
        if (llllIlllIIlIlII(this.worldObj.checkNoEntityCollision(this.getEntityBoundingBox(), this) ? 1 : 0) && llllIlllIIlIlII(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() ? 1 : 0) && llllIlllIIllIlI(this.worldObj.isAnyLiquid(this.getEntityBoundingBox()) ? 1 : 0)) {
            return EntityLiving.lIllIIIIlllIlI[2] != 0;
        }
        return EntityLiving.lIllIIIIlllIlI[1] != 0;
    }
    
    private static int llllIlllIlIIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean canBeSteered() {
        return EntityLiving.lIllIIIIlllIlI[1] != 0;
    }
    
    public void enablePersistence() {
        this.persistenceRequired = (EntityLiving.lIllIIIIlllIlI[2] != 0);
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIIIIlllIlIlIlIllII) {
        super.readEntityFromNBT(lllllllllllllIIIIIlllIlIlIlIllII);
        if (llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIlIllII.hasKey(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[17]], EntityLiving.lIllIIIIlllIlI[2]) ? 1 : 0)) {
            this.setCanPickUpLoot(lllllllllllllIIIIIlllIlIlIlIllII.getBoolean(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[18]]));
        }
        this.persistenceRequired = lllllllllllllIIIIIlllIlIlIlIllII.getBoolean(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[3]]);
        if (llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIlIllII.hasKey(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[19]], EntityLiving.lIllIIIIlllIlI[13]) ? 1 : 0)) {
            final NBTTagList lllllllllllllIIIIIlllIlIlIlIlIll = lllllllllllllIIIIIlllIlIlIlIllII.getTagList(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[20]], EntityLiving.lIllIIIIlllIlI[14]);
            int lllllllllllllIIIIIlllIlIlIlIlIlI = EntityLiving.lIllIIIIlllIlI[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIlIlIlIlIlI, this.equipment.length)) {
                this.equipment[lllllllllllllIIIIIlllIlIlIlIlIlI] = ItemStack.loadItemStackFromNBT(lllllllllllllIIIIIlllIlIlIlIlIll.getCompoundTagAt(lllllllllllllIIIIIlllIlIlIlIlIlI));
                ++lllllllllllllIIIIIlllIlIlIlIlIlI;
            }
        }
        if (llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIlIllII.hasKey(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[21]], EntityLiving.lIllIIIIlllIlI[13]) ? 1 : 0)) {
            final NBTTagList lllllllllllllIIIIIlllIlIlIlIlIIl = lllllllllllllIIIIIlllIlIlIlIllII.getTagList(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[22]], EntityLiving.lIllIIIIlllIlI[0]);
            int lllllllllllllIIIIIlllIlIlIlIlIII = EntityLiving.lIllIIIIlllIlI[1];
            "".length();
            if (null != null) {
                return;
            }
            while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIlIlIlIlIII, lllllllllllllIIIIIlllIlIlIlIlIIl.tagCount())) {
                this.equipmentDropChances[lllllllllllllIIIIIlllIlIlIlIlIII] = lllllllllllllIIIIIlllIlIlIlIlIIl.getFloatAt(lllllllllllllIIIIIlllIlIlIlIlIII);
                ++lllllllllllllIIIIIlllIlIlIlIlIII;
            }
        }
        this.isLeashed = lllllllllllllIIIIIlllIlIlIlIllII.getBoolean(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[7]]);
        if (llllIlllIIlIlII(this.isLeashed ? 1 : 0) && llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIlIllII.hasKey(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[23]], EntityLiving.lIllIIIIlllIlI[14]) ? 1 : 0)) {
            this.leashNBTTag = lllllllllllllIIIIIlllIlIlIlIllII.getCompoundTag(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[24]]);
        }
        this.setNoAI(lllllllllllllIIIIIlllIlIlIlIllII.getBoolean(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[25]]));
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[26]]);
        if (llllIlllIIllIlI(this.worldObj.isRemote ? 1 : 0) && llllIlllIIlIlII(this.canPickUpLoot() ? 1 : 0) && llllIlllIIllIlI(this.dead ? 1 : 0) && llllIlllIIlIlII(this.worldObj.getGameRules().getBoolean(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[27]]) ? 1 : 0)) {
            final String lllllllllllllIIIIIlllIlIlIIlIIII = (String)this.worldObj.getEntitiesWithinAABB((Class<? extends Entity>)EntityItem.class, this.getEntityBoundingBox().expand(1.0, 0.0, 1.0)).iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!llllIlllIIllIlI(((Iterator)lllllllllllllIIIIIlllIlIlIIlIIII).hasNext() ? 1 : 0)) {
                final EntityItem lllllllllllllIIIIIlllIlIlIIlIIll = ((Iterator<EntityItem>)lllllllllllllIIIIIlllIlIlIIlIIII).next();
                if (llllIlllIIllIlI(lllllllllllllIIIIIlllIlIlIIlIIll.isDead ? 1 : 0) && llllIlllIIlIIIl(lllllllllllllIIIIIlllIlIlIIlIIll.getEntityItem()) && llllIlllIIllIlI(lllllllllllllIIIIIlllIlIlIIlIIll.cannotPickup() ? 1 : 0)) {
                    this.updateEquipmentIfNeeded(lllllllllllllIIIIIlllIlIlIIlIIll);
                }
            }
        }
        this.worldObj.theProfiler.endSection();
    }
    
    private static boolean llllIlllIIllIII(final int lllllllllllllIIIIIlllIIIllllIlll) {
        return lllllllllllllIIIIIlllIIIllllIlll <= 0;
    }
    
    public boolean getCanSpawnHere() {
        return EntityLiving.lIllIIIIlllIlI[2] != 0;
    }
    
    @Override
    public boolean isServerWorld() {
        if (llllIlllIIlIlII(super.isServerWorld() ? 1 : 0) && llllIlllIIllIlI(this.isAIDisabled() ? 1 : 0)) {
            return EntityLiving.lIllIIIIlllIlI[2] != 0;
        }
        return EntityLiving.lIllIIIIlllIlI[1] != 0;
    }
    
    private static boolean llllIlllIlIIllI(final Object lllllllllllllIIIIIlllIIlIIIIIIIl) {
        return lllllllllllllIIIIIlllIIlIIIIIIIl == null;
    }
    
    private static boolean llllIlllIlIIIII(final int lllllllllllllIIIIIlllIIIlllllIIl) {
        return lllllllllllllIIIIIlllIIIlllllIIl < 0;
    }
    
    private static int llllIlllIlIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    protected float func_110146_f(final float lllllllllllllIIIIIlllIlIllIlllII, final float lllllllllllllIIIIIlllIlIllIllIIl) {
        this.bodyHelper.updateRenderAngles();
        return lllllllllllllIIIIIlllIlIllIllIIl;
    }
    
    public void faceEntity(final Entity lllllllllllllIIIIIlllIlIIlIIIIll, final float lllllllllllllIIIIIlllIlIIlIIIIlI, final float lllllllllllllIIIIIlllIlIIlIIllIl) {
        final double lllllllllllllIIIIIlllIlIIlIIllII = lllllllllllllIIIIIlllIlIIlIIIIll.posX - this.posX;
        final double lllllllllllllIIIIIlllIlIIlIIlIll = lllllllllllllIIIIIlllIlIIlIIIIll.posZ - this.posZ;
        double lllllllllllllIIIIIlllIlIIlIIlIIl;
        if (llllIlllIIlIlII((lllllllllllllIIIIIlllIlIIlIIIIll instanceof EntityLivingBase) ? 1 : 0)) {
            final EntityLivingBase lllllllllllllIIIIIlllIlIIlIIlIII = (EntityLivingBase)lllllllllllllIIIIIlllIlIIlIIIIll;
            final double lllllllllllllIIIIIlllIlIIlIIlIlI = lllllllllllllIIIIIlllIlIIlIIlIII.posY + lllllllllllllIIIIIlllIlIIlIIlIII.getEyeHeight() - (this.posY + this.getEyeHeight());
            "".length();
            if ((0x5C ^ 0x58) < ((0x17 ^ 0x20) & ~(0x84 ^ 0xB3))) {
                return;
            }
        }
        else {
            lllllllllllllIIIIIlllIlIIlIIlIIl = (lllllllllllllIIIIIlllIlIIlIIIIll.getEntityBoundingBox().minY + lllllllllllllIIIIIlllIlIIlIIIIll.getEntityBoundingBox().maxY) / 2.0 - (this.posY + this.getEyeHeight());
        }
        final double lllllllllllllIIIIIlllIlIIlIIIlll = MathHelper.sqrt_double(lllllllllllllIIIIIlllIlIIlIIllII * lllllllllllllIIIIIlllIlIIlIIllII + lllllllllllllIIIIIlllIlIIlIIlIll * lllllllllllllIIIIIlllIlIIlIIlIll);
        final float lllllllllllllIIIIIlllIlIIlIIIllI = (float)(MathHelper.func_181159_b(lllllllllllllIIIIIlllIlIIlIIlIll, lllllllllllllIIIIIlllIlIIlIIllII) * 180.0 / 3.141592653589793) - 90.0f;
        final float lllllllllllllIIIIIlllIlIIlIIIlIl = (float)(-(MathHelper.func_181159_b(lllllllllllllIIIIIlllIlIIlIIlIIl, lllllllllllllIIIIIlllIlIIlIIIlll) * 180.0 / 3.141592653589793));
        this.rotationPitch = this.updateRotation(this.rotationPitch, lllllllllllllIIIIIlllIlIIlIIIlIl, lllllllllllllIIIIIlllIlIIlIIllIl);
        this.rotationYaw = this.updateRotation(this.rotationYaw, lllllllllllllIIIIIlllIlIIlIIIllI, lllllllllllllIIIIIlllIlIIlIIIIlI);
    }
    
    private static boolean llllIlllIIlIlII(final int lllllllllllllIIIIIlllIIIllllllll) {
        return lllllllllllllIIIIIlllIIIllllllll != 0;
    }
    
    public int getTalkInterval() {
        return EntityLiving.lIllIIIIlllIlI[4];
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityLiving.lIllIIIIlllIlI[3], (byte)EntityLiving.lIllIIIIlllIlI[1]);
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIIIIIlllIlIlllIIIll) {
        if (llllIlllIIllIIl(lllllllllllllIIIIIlllIlIlllIIIll, EntityLiving.lIllIIIIlllIlI[7])) {
            this.spawnExplosionParticle();
            "".length();
            if (((0x9B ^ 0xC4) & ~(0x17 ^ 0x48)) != 0x0) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIIIIIlllIlIlllIIIll);
        }
    }
    
    private static int llllIlllIlIlIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void setLeashedToEntity(final Entity lllllllllllllIIIIIlllIIlIllllIlI, final boolean lllllllllllllIIIIIlllIIlIlllllII) {
        this.isLeashed = (EntityLiving.lIllIIIIlllIlI[2] != 0);
        this.leashedToEntity = lllllllllllllIIIIIlllIIlIllllIlI;
        if (llllIlllIIllIlI(this.worldObj.isRemote ? 1 : 0) && llllIlllIIlIlII(lllllllllllllIIIIIlllIIlIlllllII ? 1 : 0) && llllIlllIIlIlII((this.worldObj instanceof WorldServer) ? 1 : 0)) {
            ((WorldServer)this.worldObj).getEntityTracker().sendToAllTrackingEntity(this, new S1BPacketEntityAttach(EntityLiving.lIllIIIIlllIlI[2], this, this.leashedToEntity));
        }
    }
    
    @Override
    public void onEntityUpdate() {
        super.onEntityUpdate();
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[1]]);
        if (llllIlllIIlIlII(this.isEntityAlive() ? 1 : 0)) {
            final int nextInt = this.rand.nextInt(EntityLiving.lIllIIIIlllIlI[5]);
            final int livingSoundTime = this.livingSoundTime;
            this.livingSoundTime = livingSoundTime + EntityLiving.lIllIIIIlllIlI[2];
            if (llllIlllIIlIlIl(nextInt, livingSoundTime)) {
                this.livingSoundTime = -this.getTalkInterval();
                this.playLivingSound();
            }
        }
        this.worldObj.theProfiler.endSection();
    }
    
    public PathNavigate getNavigator() {
        return this.navigator;
    }
    
    private static boolean llllIlllIIlIlll(final int lllllllllllllIIIIIlllIIIllllIlIl) {
        return lllllllllllllIIIIIlllIIIllllIlIl > 0;
    }
    
    public static int getArmorPosition(final ItemStack lllllllllllllIIIIIlllIIlllIlIlll) {
        if (llllIlllIIlIIll(lllllllllllllIIIIIlllIIlllIlIlll.getItem(), Item.getItemFromBlock(Blocks.pumpkin)) && llllIlllIIlIIll(lllllllllllllIIIIIlllIIlllIlIlll.getItem(), Items.skull)) {
            if (llllIlllIIlIlII((lllllllllllllIIIIIlllIIlllIlIlll.getItem() instanceof ItemArmor) ? 1 : 0)) {
                switch (((ItemArmor)lllllllllllllIIIIIlllIIlllIlIlll.getItem()).armorType) {
                    case 0: {
                        return EntityLiving.lIllIIIIlllIlI[9];
                    }
                    case 1: {
                        return EntityLiving.lIllIIIIlllIlI[6];
                    }
                    case 2: {
                        return EntityLiving.lIllIIIIlllIlI[8];
                    }
                    case 3: {
                        return EntityLiving.lIllIIIIlllIlI[2];
                    }
                }
            }
            return EntityLiving.lIllIIIIlllIlI[1];
        }
        return EntityLiving.lIllIIIIlllIlI[9];
    }
    
    public float getRenderSizeModifier() {
        return 1.0f;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0);
    }
    
    protected boolean func_175448_a(final ItemStack lllllllllllllIIIIIlllIlIIlllIIll) {
        return EntityLiving.lIllIIIIlllIlI[2] != 0;
    }
    
    @Override
    protected final void updateEntityActionState() {
        this.entityAge += EntityLiving.lIllIIIIlllIlI[2];
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[31]]);
        this.despawnEntity();
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[32]]);
        this.senses.clearSensingCache();
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[33]]);
        this.targetTasks.onUpdateTasks();
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[34]]);
        this.tasks.onUpdateTasks();
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[35]]);
        this.navigator.onUpdateNavigation();
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[36]]);
        this.updateAITasks();
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[37]]);
        this.worldObj.theProfiler.startSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[38]]);
        this.moveHelper.onUpdateMoveHelper();
        this.worldObj.theProfiler.endStartSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[39]]);
        this.lookHelper.onUpdateLook();
        this.worldObj.theProfiler.endStartSection(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[40]]);
        this.jumpHelper.doJump();
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.endSection();
    }
    
    public EntitySenses getEntitySenses() {
        return this.senses;
    }
    
    public void setMoveForward(final float lllllllllllllIIIIIlllIlIlIlIIIII) {
        this.moveForward = lllllllllllllIIIIIlllIlIlIlIIIII;
    }
    
    @Override
    public int getMaxFallHeight() {
        if (llllIlllIlIIllI(this.getAttackTarget())) {
            return EntityLiving.lIllIIIIlllIlI[6];
        }
        int lllllllllllllIIIIIlllIlIIIlIIlII = (int)(this.getHealth() - this.getMaxHealth() * 0.33f);
        lllllllllllllIIIIIlllIlIIIlIIlII -= (EntityLiving.lIllIIIIlllIlI[6] - this.worldObj.getDifficulty().getDifficultyId()) * EntityLiving.lIllIIIIlllIlI[9];
        if (llllIlllIlIIIII(lllllllllllllIIIIIlllIlIIIlIIlII)) {
            lllllllllllllIIIIIlllIlIIIlIIlII = EntityLiving.lIllIIIIlllIlI[1];
        }
        return lllllllllllllIIIIIlllIlIIIlIIlII + EntityLiving.lIllIIIIlllIlI[6];
    }
    
    protected void updateEquipmentIfNeeded(final EntityItem lllllllllllllIIIIIlllIlIIllllIll) {
        final ItemStack lllllllllllllIIIIIlllIlIlIIIIlIl = lllllllllllllIIIIIlllIlIIllllIll.getEntityItem();
        final int lllllllllllllIIIIIlllIlIlIIIIlII = getArmorPosition(lllllllllllllIIIIIlllIlIlIIIIlIl);
        if (llllIlllIIlllIl(lllllllllllllIIIIIlllIlIlIIIIlII, EntityLiving.lIllIIIIlllIlI[28])) {
            boolean lllllllllllllIIIIIlllIlIlIIIIIll = EntityLiving.lIllIIIIlllIlI[2] != 0;
            final ItemStack lllllllllllllIIIIIlllIlIlIIIIIlI = this.getEquipmentInSlot(lllllllllllllIIIIIlllIlIlIIIIlII);
            if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIlIlIIIIIlI)) {
                if (llllIlllIIllIlI(lllllllllllllIIIIIlllIlIlIIIIlII)) {
                    if (llllIlllIIlIlII((lllllllllllllIIIIIlllIlIlIIIIlIl.getItem() instanceof ItemSword) ? 1 : 0) && llllIlllIIllIlI((lllllllllllllIIIIIlllIlIlIIIIIlI.getItem() instanceof ItemSword) ? 1 : 0)) {
                        lllllllllllllIIIIIlllIlIlIIIIIll = (EntityLiving.lIllIIIIlllIlI[2] != 0);
                        "".length();
                        if ("  ".length() == -" ".length()) {
                            return;
                        }
                    }
                    else if (llllIlllIIlIlII((lllllllllllllIIIIIlllIlIlIIIIlIl.getItem() instanceof ItemSword) ? 1 : 0) && llllIlllIIlIlII((lllllllllllllIIIIIlllIlIlIIIIIlI.getItem() instanceof ItemSword) ? 1 : 0)) {
                        final ItemSword lllllllllllllIIIIIlllIlIlIIIIIIl = (ItemSword)lllllllllllllIIIIIlllIlIlIIIIlIl.getItem();
                        final ItemSword lllllllllllllIIIIIlllIlIlIIIIIII = (ItemSword)lllllllllllllIIIIIlllIlIlIIIIIlI.getItem();
                        if (llllIlllIIlIlII(llllIlllIIllIll(lllllllllllllIIIIIlllIlIlIIIIIIl.getDamageVsEntity(), lllllllllllllIIIIIlllIlIlIIIIIII.getDamageVsEntity()))) {
                            int n;
                            if (llllIlllIIlIlll(llllIlllIIllIll(lllllllllllllIIIIIlllIlIlIIIIIIl.getDamageVsEntity(), lllllllllllllIIIIIlllIlIlIIIIIII.getDamageVsEntity()))) {
                                n = EntityLiving.lIllIIIIlllIlI[2];
                                "".length();
                                if (-"   ".length() > 0) {
                                    return;
                                }
                            }
                            else {
                                n = EntityLiving.lIllIIIIlllIlI[1];
                            }
                            lllllllllllllIIIIIlllIlIlIIIIIll = (n != 0);
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            int n2;
                            if (llllIlllIIllllI(lllllllllllllIIIIIlllIlIlIIIIlIl.getMetadata(), lllllllllllllIIIIIlllIlIlIIIIIlI.getMetadata()) && (!llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIIIIlIl.hasTagCompound() ? 1 : 0) || llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIIIIIlI.hasTagCompound() ? 1 : 0))) {
                                n2 = EntityLiving.lIllIIIIlllIlI[1];
                                "".length();
                                if (null != null) {
                                    return;
                                }
                            }
                            else {
                                n2 = EntityLiving.lIllIIIIlllIlI[2];
                            }
                            lllllllllllllIIIIIlllIlIlIIIIIll = (n2 != 0);
                            "".length();
                            if (((0x56 ^ 0xE) & ~(0xD2 ^ 0x8A)) != 0x0) {
                                return;
                            }
                        }
                    }
                    else if (llllIlllIIlIlII((lllllllllllllIIIIIlllIlIlIIIIlIl.getItem() instanceof ItemBow) ? 1 : 0) && llllIlllIIlIlII((lllllllllllllIIIIIlllIlIlIIIIIlI.getItem() instanceof ItemBow) ? 1 : 0)) {
                        int n3;
                        if (llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIIIIlIl.hasTagCompound() ? 1 : 0) && llllIlllIIllIlI(lllllllllllllIIIIIlllIlIlIIIIIlI.hasTagCompound() ? 1 : 0)) {
                            n3 = EntityLiving.lIllIIIIlllIlI[2];
                            "".length();
                            if (((0x3 ^ 0x1B ^ (0x4A ^ 0x61)) & (0x5E ^ 0x57 ^ (0x53 ^ 0x69) ^ -" ".length())) != 0x0) {
                                return;
                            }
                        }
                        else {
                            n3 = EntityLiving.lIllIIIIlllIlI[1];
                        }
                        lllllllllllllIIIIIlllIlIlIIIIIll = (n3 != 0);
                        "".length();
                        if (((0x4 ^ 0xF) & ~(0xAF ^ 0xA4)) < ((0xF8 ^ 0xB1) & ~(0x75 ^ 0x3C))) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIIIIlllIlIlIIIIIll = (EntityLiving.lIllIIIIlllIlI[1] != 0);
                        "".length();
                        if (((12 + 169 - 30 + 19 ^ 95 + 153 - 163 + 80) & (0x37 ^ 0x1B ^ (0x9E ^ 0xBD) ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                }
                else if (llllIlllIIlIlII((lllllllllllllIIIIIlllIlIlIIIIlIl.getItem() instanceof ItemArmor) ? 1 : 0) && llllIlllIIllIlI((lllllllllllllIIIIIlllIlIlIIIIIlI.getItem() instanceof ItemArmor) ? 1 : 0)) {
                    lllllllllllllIIIIIlllIlIlIIIIIll = (EntityLiving.lIllIIIIlllIlI[2] != 0);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (llllIlllIIlIlII((lllllllllllllIIIIIlllIlIlIIIIlIl.getItem() instanceof ItemArmor) ? 1 : 0) && llllIlllIIlIlII((lllllllllllllIIIIIlllIlIlIIIIIlI.getItem() instanceof ItemArmor) ? 1 : 0)) {
                    final ItemArmor lllllllllllllIIIIIlllIlIIlllllll = (ItemArmor)lllllllllllllIIIIIlllIlIlIIIIlIl.getItem();
                    final ItemArmor lllllllllllllIIIIIlllIlIIllllllI = (ItemArmor)lllllllllllllIIIIIlllIlIlIIIIIlI.getItem();
                    if (llllIlllIIlllll(lllllllllllllIIIIIlllIlIIlllllll.damageReduceAmount, lllllllllllllIIIIIlllIlIIllllllI.damageReduceAmount)) {
                        int n4;
                        if (llllIlllIIlllIl(lllllllllllllIIIIIlllIlIIlllllll.damageReduceAmount, lllllllllllllIIIIIlllIlIIllllllI.damageReduceAmount)) {
                            n4 = EntityLiving.lIllIIIIlllIlI[2];
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                        }
                        else {
                            n4 = EntityLiving.lIllIIIIlllIlI[1];
                        }
                        lllllllllllllIIIIIlllIlIlIIIIIll = (n4 != 0);
                        "".length();
                        if ("  ".length() == -" ".length()) {
                            return;
                        }
                    }
                    else {
                        int n5;
                        if (llllIlllIIllllI(lllllllllllllIIIIIlllIlIlIIIIlIl.getMetadata(), lllllllllllllIIIIIlllIlIlIIIIIlI.getMetadata()) && (!llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIIIIlIl.hasTagCompound() ? 1 : 0) || llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIIIIIlI.hasTagCompound() ? 1 : 0))) {
                            n5 = EntityLiving.lIllIIIIlllIlI[1];
                            "".length();
                            if (((112 + 110 - 120 + 147 ^ 151 + 62 - 146 + 128) & (0xD3 ^ 0x8F ^ (0x2D ^ 0x4B) ^ -" ".length())) >= "  ".length()) {
                                return;
                            }
                        }
                        else {
                            n5 = EntityLiving.lIllIIIIlllIlI[2];
                        }
                        lllllllllllllIIIIIlllIlIlIIIIIll = (n5 != 0);
                        "".length();
                        if ((69 + 69 - 67 + 85 ^ 142 + 58 - 117 + 70) <= 0) {
                            return;
                        }
                    }
                }
                else {
                    lllllllllllllIIIIIlllIlIlIIIIIll = (EntityLiving.lIllIIIIlllIlI[1] != 0);
                }
            }
            if (llllIlllIIlIlII(lllllllllllllIIIIIlllIlIlIIIIIll ? 1 : 0) && llllIlllIIlIlII(this.func_175448_a(lllllllllllllIIIIIlllIlIlIIIIlIl) ? 1 : 0)) {
                if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIlIlIIIIIlI) && llllIlllIlIIIII(llllIlllIIlllII(this.rand.nextFloat() - 0.1f, this.equipmentDropChances[lllllllllllllIIIIIlllIlIlIIIIlII]))) {
                    this.entityDropItem(lllllllllllllIIIIIlllIlIlIIIIIlI, 0.0f);
                    "".length();
                }
                if (llllIlllIlIIIIl(lllllllllllllIIIIIlllIlIlIIIIlIl.getItem(), Items.diamond) && llllIlllIIlIIIl(lllllllllllllIIIIIlllIlIIllllIll.getThrower())) {
                    final EntityPlayer lllllllllllllIIIIIlllIlIIlllllIl = this.worldObj.getPlayerEntityByName(lllllllllllllIIIIIlllIlIIllllIll.getThrower());
                    if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIlIIlllllIl)) {
                        lllllllllllllIIIIIlllIlIIlllllIl.triggerAchievement(AchievementList.diamondsToYou);
                    }
                }
                this.setCurrentItemOrArmor(lllllllllllllIIIIIlllIlIlIIIIlII, lllllllllllllIIIIIlllIlIlIIIIlIl);
                this.equipmentDropChances[lllllllllllllIIIIIlllIlIlIIIIlII] = 2.0f;
                this.persistenceRequired = (EntityLiving.lIllIIIIlllIlI[2] != 0);
                this.onItemPickup(lllllllllllllIIIIIlllIlIIllllIll, EntityLiving.lIllIIIIlllIlI[2]);
                lllllllllllllIIIIIlllIlIIllllIll.setDead();
            }
        }
    }
    
    public void playLivingSound() {
        final String lllllllllllllIIIIIlllIllIIIIllIl = this.getLivingSound();
        if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIllIIIIllIl)) {
            this.playSound(lllllllllllllIIIIIlllIllIIIIllIl, this.getSoundVolume(), this.getSoundPitch());
        }
    }
    
    public boolean canPickUpLoot() {
        return this.canPickUpLoot;
    }
    
    protected void updateAITasks() {
    }
    
    private static String llllIlllIIIlllI(final String lllllllllllllIIIIIlllIIlIIllIIll, final String lllllllllllllIIIIIlllIIlIIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlllIIlIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlllIIlIIllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlllIIlIIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlllIIlIIllIlIl.init(EntityLiving.lIllIIIIlllIlI[8], lllllllllllllIIIIIlllIIlIIllIllI);
            return new String(lllllllllllllIIIIIlllIIlIIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlllIIlIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlllIIlIIllIlII) {
            lllllllllllllIIIIIlllIIlIIllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public ItemStack getCurrentArmor(final int lllllllllllllIIIIIlllIlIIIIlIlIl) {
        return this.equipment[lllllllllllllIIIIIlllIlIIIIlIlIl + EntityLiving.lIllIIIIlllIlI[2]];
    }
    
    private static boolean llllIlllIIllllI(final int lllllllllllllIIIIIlllIIlIIIlIIlI, final int lllllllllllllIIIIIlllIIlIIIlIIIl) {
        return lllllllllllllIIIIIlllIIlIIIlIIlI <= lllllllllllllIIIIIlllIIlIIIlIIIl;
    }
    
    private static void llllIlllIIIllll() {
        (lIllIIIIlllIIl = new String[EntityLiving.lIllIIIIlllIlI[54]])[EntityLiving.lIllIIIIlllIlI[1]] = llllIlllIIIllII("qJeAxBMytTfql2d7WtKAig==", "zSczT");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[2]] = llllIlllIIIllIl("IDA0KD8AOg8IGgw+Lg==", "cQZxV");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[8]] = llllIlllIIIllIl("NiAHMAAVMRAtCgMXEDIcDzcQJw==", "fEuCi");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[6]] = llllIlllIIIlllI("CQK/KtVOYthpPxw+gK5ZBw==", "SqPIL");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[9]] = llllIlllIIIllIl("Az0XJDYvLhY3EDQ=", "GOxTu");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[0]] = llllIlllIIIlllI("faWPDQDKoVo=", "kJZNz");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[10]] = llllIlllIIIllIl("ORoMEDUDPDE=", "lOETx");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[11]] = llllIlllIIIllIl("GgcYIyUqMyIT", "ORQgi");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[12]] = llllIlllIIIllII("ETX63TayDAg=", "GgRqd");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[13]] = llllIlllIIIllII("rev+KqWgYwA=", "XzuhP");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[14]] = llllIlllIIIllIl("GA==", "BQmLV");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[15]] = llllIlllIIIllIl("Hz0xNA4=", "SXPGf");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[16]] = llllIlllIIIllIl("ASUJGA==", "OJHQq");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[17]] = llllIlllIIIllIl("OQMYBi8ZCSMmChUNAg==", "zbvVF");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[18]] = llllIlllIIIllII("CYuy2++lSAUGFNQXIqJphw==", "Ukwgi");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[3]] = llllIlllIIIllII("6/pmwTlHdVELSkYqMfZ70kOwcchB01af", "IcptD");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[19]] = llllIlllIIIllII("PxjZDCF/9Ln0/YGEFOxEXw==", "LsBLM");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[20]] = llllIlllIIIllII("HvV0rY64O8IjWO1jwNRYhg==", "hZjvY");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[21]] = llllIlllIIIlllI("7ClYGGGcKosw5YjzAjSnSw==", "DqRNV");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[22]] = llllIlllIIIlllI("/2UJYhJMcdXVcmv2akayPw==", "INLCb");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[7]] = llllIlllIIIllII("3UeFApkTwMI=", "xmnUs");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[23]] = llllIlllIIIllIl("AQ4AEAw=", "Mkacd");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[24]] = llllIlllIIIlllI("2QF3thQSSMM=", "qMbzA");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[25]] = llllIlllIIIllIl("BTs5BQ==", "KTxLw");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[26]] = llllIlllIIIllIl("JAQqGgcmDA==", "HkEnn");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[27]] = llllIlllIIIllIl("BgATICUCChcOOQw=", "koqgW");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[31]] = llllIlllIIIllIl("MAogCQ8XBzYaBSQM", "SbEjd");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[32]] = llllIlllIIIllIl("Jg04Kh87Dw==", "UhVYv");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[33]] = llllIlllIIIllII("/vmqW5PwXjcFeXfmFFtgDw==", "slxlS");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[34]] = llllIlllIIIllII("d09y3PXAyOK0H96k6bK7hA==", "XKCPH");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[35]] = llllIlllIIIllII("TbjFz4vUr4EV6uTkpAB6oQ==", "TfnLo");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[36]] = llllIlllIIIlllI("B93FeTbcR0mPBEY4TO8mSA==", "uWnKD");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[37]] = llllIlllIIIlllI("hhvnKPR+n5G16gfe7W4t/w==", "MBbMm");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[38]] = llllIlllIIIllIl("ITcuBg==", "LXXcW");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[39]] = llllIlllIIIllIl("BQQmPA==", "ikIWY");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[40]] = llllIlllIIIllII("Pt99DzAllGY=", "aTejH");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[42]] = llllIlllIIIlllI("yhKDvPcUfHREX+MRTfh1C9i2yK+VabLL", "QHEvP");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[43]] = llllIlllIIIllIl("Pg8ZAQwEKSQ=", "kZPEA");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[44]] = llllIlllIIIllIl("DTgEHA09DD4s", "XmMXA");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[45]] = llllIlllIIIllII("ouBYwS/JPCdJ6lEpE0hFCg==", "ZLsoJ");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[41]] = llllIlllIIIlllI("r7mCjVf2K67Nhp7llhnPEg==", "REvxM");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[46]] = llllIlllIIIllIl("PA==", "dXcgd");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[48]] = llllIlllIIIllII("y4MuH39Lj8M=", "eYSiS");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[49]] = llllIlllIIIllII("6UBVBqJI8VE=", "ZOLJR");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[50]] = llllIlllIIIlllI("AH0e7iOahmo=", "jVOgF");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[51]] = llllIlllIIIlllI("Hxd7UbuXU8w=", "pPtPN");
        EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[52]] = llllIlllIIIllII("X0mt4sa9Dxw=", "RXrqc");
    }
    
    public void setNoAI(final boolean lllllllllllllIIIIIlllIIlIlIllIII) {
        final DataWatcher dataWatcher = this.dataWatcher;
        final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityLiving.lIllIIIIlllIlI[3];
        int n;
        if (llllIlllIIlIlII(lllllllllllllIIIIIlllIIlIlIllIII ? 1 : 0)) {
            n = EntityLiving.lIllIIIIlllIlI[2];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = EntityLiving.lIllIIIIlllIlI[1];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
    }
    
    private static int llllIlllIIlIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llllIlllIlIlIll(final int lllllllllllllIIIIIlllIIIlllllIll) {
        return lllllllllllllIIIIIlllIIIlllllIll >= 0;
    }
    
    private static boolean llllIlllIIlIIll(final Object lllllllllllllIIIIIlllIIlIIIIlIlI, final Object lllllllllllllIIIIIlllIIlIIIIlIIl) {
        return lllllllllllllIIIIIlllIIlIIIIlIlI != lllllllllllllIIIIIlllIIlIIIIlIIl;
    }
    
    @Override
    public void setAIMoveSpeed(final float lllllllllllllIIIIIlllIlIlIIllIII) {
        super.setAIMoveSpeed(lllllllllllllIIIIIlllIlIlIIllIII);
        this.setMoveForward(lllllllllllllIIIIIlllIlIlIIllIII);
    }
    
    private static int llllIlllIlIlIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llllIlllIIllIIl(final int lllllllllllllIIIIIlllIIlIIIllllI, final int lllllllllllllIIIIIlllIIlIIIlllIl) {
        return lllllllllllllIIIIIlllIIlIIIllllI == lllllllllllllIIIIIlllIIlIIIlllIl;
    }
    
    private static String llllIlllIIIllIl(String lllllllllllllIIIIIlllIIlIlIIIIll, final String lllllllllllllIIIIIlllIIlIlIIIIlI) {
        lllllllllllllIIIIIlllIIlIlIIIIll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIlllIIlIlIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlllIIlIlIIIllI = new StringBuilder();
        final char[] lllllllllllllIIIIIlllIIlIlIIIlIl = lllllllllllllIIIIIlllIIlIlIIIIlI.toCharArray();
        int lllllllllllllIIIIIlllIIlIlIIIlII = EntityLiving.lIllIIIIlllIlI[1];
        final String lllllllllllllIIIIIlllIIlIIlllllI = (Object)((String)lllllllllllllIIIIIlllIIlIlIIIIll).toCharArray();
        final char lllllllllllllIIIIIlllIIlIIllllIl = (char)lllllllllllllIIIIIlllIIlIIlllllI.length;
        short lllllllllllllIIIIIlllIIlIIllllII = (short)EntityLiving.lIllIIIIlllIlI[1];
        while (llllIlllIIlIlIl(lllllllllllllIIIIIlllIIlIIllllII, lllllllllllllIIIIIlllIIlIIllllIl)) {
            final char lllllllllllllIIIIIlllIIlIlIIlIIl = lllllllllllllIIIIIlllIIlIIlllllI[lllllllllllllIIIIIlllIIlIIllllII];
            lllllllllllllIIIIIlllIIlIlIIIllI.append((char)(lllllllllllllIIIIIlllIIlIlIIlIIl ^ lllllllllllllIIIIIlllIIlIlIIIlIl[lllllllllllllIIIIIlllIIlIlIIIlII % lllllllllllllIIIIIlllIIlIlIIIlIl.length]));
            "".length();
            ++lllllllllllllIIIIIlllIIlIlIIIlII;
            ++lllllllllllllIIIIIlllIIlIIllllII;
            "".length();
            if (-" ".length() == ((0x69 ^ 0x4A) & ~(0x95 ^ 0xB6))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlllIIlIlIIIllI);
    }
    
    protected boolean canDespawn() {
        return EntityLiving.lIllIIIIlllIlI[2] != 0;
    }
    
    public IEntityLivingData onInitialSpawn(final DifficultyInstance lllllllllllllIIIIIlllIIllIlllllI, final IEntityLivingData lllllllllllllIIIIIlllIIllIlllIll) {
        this.getEntityAttribute(SharedMonsterAttributes.followRange).applyModifier(new AttributeModifier(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[42]], this.rand.nextGaussian() * 0.05, EntityLiving.lIllIIIIlllIlI[2]));
        return lllllllllllllIIIIIlllIIllIlllIll;
    }
    
    public EntityLiving(final World lllllllllllllIIIIIlllIllIIllllII) {
        super(lllllllllllllIIIIIlllIllIIllllII);
        this.equipment = new ItemStack[EntityLiving.lIllIIIIlllIlI[0]];
        this.equipmentDropChances = new float[EntityLiving.lIllIIIIlllIlI[0]];
        Profiler theProfiler;
        if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIllIIllllII) && llllIlllIIlIIIl(lllllllllllllIIIIIlllIllIIllllII.theProfiler)) {
            theProfiler = lllllllllllllIIIIIlllIllIIllllII.theProfiler;
            "".length();
            if ("   ".length() == 0) {
                throw null;
            }
        }
        else {
            theProfiler = null;
        }
        this.tasks = new EntityAITasks(theProfiler);
        Profiler theProfiler2;
        if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIllIIllllII) && llllIlllIIlIIIl(lllllllllllllIIIIIlllIllIIllllII.theProfiler)) {
            theProfiler2 = lllllllllllllIIIIIlllIllIIllllII.theProfiler;
            "".length();
            if ("   ".length() <= 0) {
                throw null;
            }
        }
        else {
            theProfiler2 = null;
        }
        this.targetTasks = new EntityAITasks(theProfiler2);
        this.lookHelper = new EntityLookHelper(this);
        this.moveHelper = new EntityMoveHelper(this);
        this.jumpHelper = new EntityJumpHelper(this);
        this.bodyHelper = new EntityBodyHelper(this);
        this.navigator = this.getNewNavigator(lllllllllllllIIIIIlllIllIIllllII);
        this.senses = new EntitySenses(this);
        int lllllllllllllIIIIIlllIllIIlllllI = EntityLiving.lIllIIIIlllIlI[1];
        "".length();
        if (" ".length() < 0) {
            throw null;
        }
        while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIllIIlllllI, this.equipmentDropChances.length)) {
            this.equipmentDropChances[lllllllllllllIIIIIlllIllIIlllllI] = 0.085f;
            ++lllllllllllllIIIIIlllIllIIlllllI;
        }
    }
    
    public EntityLookHelper getLookHelper() {
        return this.lookHelper;
    }
    
    public void clearLeashed(final boolean lllllllllllllIIIIIlllIIllIIIllll, final boolean lllllllllllllIIIIIlllIIllIIIlllI) {
        if (llllIlllIIlIlII(this.isLeashed ? 1 : 0)) {
            this.isLeashed = (EntityLiving.lIllIIIIlllIlI[1] != 0);
            this.leashedToEntity = null;
            if (llllIlllIIllIlI(this.worldObj.isRemote ? 1 : 0) && llllIlllIIlIlII(lllllllllllllIIIIIlllIIllIIIlllI ? 1 : 0)) {
                this.dropItem(Items.lead, EntityLiving.lIllIIIIlllIlI[2]);
                "".length();
            }
            if (llllIlllIIllIlI(this.worldObj.isRemote ? 1 : 0) && llllIlllIIlIlII(lllllllllllllIIIIIlllIIllIIIllll ? 1 : 0) && llllIlllIIlIlII((this.worldObj instanceof WorldServer) ? 1 : 0)) {
                ((WorldServer)this.worldObj).getEntityTracker().sendToAllTrackingEntity(this, new S1BPacketEntityAttach(EntityLiving.lIllIIIIlllIlI[2], this, null));
            }
        }
    }
    
    public int getVerticalFaceSpeed() {
        return EntityLiving.lIllIIIIlllIlI[41];
    }
    
    protected PathNavigate getNewNavigator(final World lllllllllllllIIIIIlllIllIIllIIlI) {
        return new PathNavigateGround(this, lllllllllllllIIIIIlllIllIIllIIlI);
    }
    
    protected boolean interact(final EntityPlayer lllllllllllllIIIIIlllIIllIIlIlll) {
        return EntityLiving.lIllIIIIlllIlI[1] != 0;
    }
    
    protected void updateLeashedState() {
        if (llllIlllIIlIIIl(this.leashNBTTag)) {
            this.recreateLeash();
        }
        if (llllIlllIIlIlII(this.isLeashed ? 1 : 0)) {
            if (llllIlllIIllIlI(this.isEntityAlive() ? 1 : 0)) {
                this.clearLeashed((boolean)(EntityLiving.lIllIIIIlllIlI[2] != 0), (boolean)(EntityLiving.lIllIIIIlllIlI[2] != 0));
            }
            if (!llllIlllIIlIIIl(this.leashedToEntity) || llllIlllIIlIlII(this.leashedToEntity.isDead ? 1 : 0)) {
                this.clearLeashed((boolean)(EntityLiving.lIllIIIIlllIlI[2] != 0), (boolean)(EntityLiving.lIllIIIIlllIlI[2] != 0));
            }
        }
    }
    
    protected void setEquipmentBasedOnDifficulty(final DifficultyInstance lllllllllllllIIIIIlllIIllllIIllI) {
        if (llllIlllIlIIIII(llllIlllIlIlIIl(this.rand.nextFloat(), 0.15f * lllllllllllllIIIIIlllIIllllIIllI.getClampedAdditionalDifficulty()))) {
            int lllllllllllllIIIIIlllIIllllIIlIl = this.rand.nextInt(EntityLiving.lIllIIIIlllIlI[8]);
            float n;
            if (llllIlllIlIIIIl(this.worldObj.getDifficulty(), EnumDifficulty.HARD)) {
                n = 0.1f;
                "".length();
                if ((0x79 ^ 0x36 ^ (0x17 ^ 0x5C)) <= " ".length()) {
                    return;
                }
            }
            else {
                n = 0.25f;
            }
            final float lllllllllllllIIIIIlllIIllllIIlII = n;
            if (llllIlllIlIIIII(llllIlllIlIlIIl(this.rand.nextFloat(), 0.095f))) {
                ++lllllllllllllIIIIIlllIIllllIIlIl;
            }
            if (llllIlllIlIIIII(llllIlllIlIlIIl(this.rand.nextFloat(), 0.095f))) {
                ++lllllllllllllIIIIIlllIIllllIIlIl;
            }
            if (llllIlllIlIIIII(llllIlllIlIlIIl(this.rand.nextFloat(), 0.095f))) {
                ++lllllllllllllIIIIIlllIIllllIIlIl;
            }
            int lllllllllllllIIIIIlllIIllllIIIll = EntityLiving.lIllIIIIlllIlI[6];
            "".length();
            if (" ".length() == ((0xD7 ^ 0x8F) & ~(0x54 ^ 0xC))) {
                return;
            }
            while (!llllIlllIlIIIII(lllllllllllllIIIIIlllIIllllIIIll)) {
                final ItemStack lllllllllllllIIIIIlllIIllllIIIlI = this.getCurrentArmor(lllllllllllllIIIIIlllIIllllIIIll);
                if (llllIlllIIlIlIl(lllllllllllllIIIIIlllIIllllIIIll, EntityLiving.lIllIIIIlllIlI[6]) && llllIlllIlIIIII(llllIlllIlIlIIl(this.rand.nextFloat(), lllllllllllllIIIIIlllIIllllIIlII))) {
                    "".length();
                    if ((0x37 ^ 0x42 ^ (0xD0 ^ 0xA1)) < 0) {
                        return;
                    }
                    break;
                }
                else {
                    if (llllIlllIlIIllI(lllllllllllllIIIIIlllIIllllIIIlI)) {
                        final Item lllllllllllllIIIIIlllIIllllIIIIl = getArmorItemForSlot(lllllllllllllIIIIIlllIIllllIIIll + EntityLiving.lIllIIIIlllIlI[2], lllllllllllllIIIIIlllIIllllIIlIl);
                        if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIIllllIIIIl)) {
                            this.setCurrentItemOrArmor(lllllllllllllIIIIIlllIIllllIIIll + EntityLiving.lIllIIIIlllIlI[2], new ItemStack(lllllllllllllIIIIIlllIIllllIIIIl));
                        }
                    }
                    --lllllllllllllIIIIIlllIIllllIIIll;
                }
            }
        }
    }
    
    public void spawnExplosionParticle() {
        if (llllIlllIIlIlII(this.worldObj.isRemote ? 1 : 0)) {
            int lllllllllllllIIIIIlllIlIllllIIll = EntityLiving.lIllIIIIlllIlI[1];
            "".length();
            if (((0xBC ^ 0x88) & ~(0x36 ^ 0x2)) != 0x0) {
                return;
            }
            while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIlIllllIIll, EntityLiving.lIllIIIIlllIlI[7])) {
                final double lllllllllllllIIIIIlllIlIllllIIlI = this.rand.nextGaussian() * 0.02;
                final double lllllllllllllIIIIIlllIlIllllIIIl = this.rand.nextGaussian() * 0.02;
                final double lllllllllllllIIIIIlllIlIllllIIII = this.rand.nextGaussian() * 0.02;
                final double lllllllllllllIIIIIlllIlIlllIllll = 10.0;
                this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, this.posX + this.rand.nextFloat() * this.width * 2.0f - this.width - lllllllllllllIIIIIlllIlIllllIIlI * lllllllllllllIIIIIlllIlIlllIllll, this.posY + this.rand.nextFloat() * this.height - lllllllllllllIIIIIlllIlIllllIIIl * lllllllllllllIIIIIlllIlIlllIllll, this.posZ + this.rand.nextFloat() * this.width * 2.0f - this.width - lllllllllllllIIIIIlllIlIllllIIII * lllllllllllllIIIIIlllIlIlllIllll, lllllllllllllIIIIIlllIlIllllIIlI, lllllllllllllIIIIIlllIlIllllIIIl, lllllllllllllIIIIIlllIlIllllIIII, new int[EntityLiving.lIllIIIIlllIlI[1]]);
                ++lllllllllllllIIIIIlllIlIllllIIll;
            }
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            this.worldObj.setEntityState(this, (byte)EntityLiving.lIllIIIIlllIlI[7]);
        }
    }
    
    public void eatGrassBonus() {
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIIIIlllIlIlIllllll) {
        super.writeEntityToNBT(lllllllllllllIIIIIlllIlIlIllllll);
        lllllllllllllIIIIIlllIlIlIllllll.setBoolean(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[2]], this.canPickUpLoot());
        lllllllllllllIIIIIlllIlIlIllllll.setBoolean(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[8]], this.persistenceRequired);
        final NBTTagList lllllllllllllIIIIIlllIlIlIlllllI = new NBTTagList();
        int lllllllllllllIIIIIlllIlIlIllllIl = EntityLiving.lIllIIIIlllIlI[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIlIlIllllIl, this.equipment.length)) {
            final NBTTagCompound lllllllllllllIIIIIlllIlIlIllllII = new NBTTagCompound();
            if (llllIlllIIlIIIl(this.equipment[lllllllllllllIIIIIlllIlIlIllllIl])) {
                this.equipment[lllllllllllllIIIIIlllIlIlIllllIl].writeToNBT(lllllllllllllIIIIIlllIlIlIllllII);
                "".length();
            }
            lllllllllllllIIIIIlllIlIlIlllllI.appendTag(lllllllllllllIIIIIlllIlIlIllllII);
            ++lllllllllllllIIIIIlllIlIlIllllIl;
        }
        lllllllllllllIIIIIlllIlIlIllllll.setTag(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[6]], lllllllllllllIIIIIlllIlIlIlllllI);
        final NBTTagList lllllllllllllIIIIIlllIlIlIlllIll = new NBTTagList();
        int lllllllllllllIIIIIlllIlIlIlllIlI = EntityLiving.lIllIIIIlllIlI[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIlIlIlllIlI, this.equipmentDropChances.length)) {
            lllllllllllllIIIIIlllIlIlIlllIll.appendTag(new NBTTagFloat(this.equipmentDropChances[lllllllllllllIIIIIlllIlIlIlllIlI]));
            ++lllllllllllllIIIIIlllIlIlIlllIlI;
        }
        lllllllllllllIIIIIlllIlIlIllllll.setTag(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[9]], lllllllllllllIIIIIlllIlIlIlllIll);
        lllllllllllllIIIIIlllIlIlIllllll.setBoolean(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[0]], this.isLeashed);
        if (llllIlllIIlIIIl(this.leashedToEntity)) {
            final NBTTagCompound lllllllllllllIIIIIlllIlIlIlllIIl = new NBTTagCompound();
            if (llllIlllIIlIlII((this.leashedToEntity instanceof EntityLivingBase) ? 1 : 0)) {
                lllllllllllllIIIIIlllIlIlIlllIIl.setLong(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[10]], this.leashedToEntity.getUniqueID().getMostSignificantBits());
                lllllllllllllIIIIIlllIlIlIlllIIl.setLong(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[11]], this.leashedToEntity.getUniqueID().getLeastSignificantBits());
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llllIlllIIlIlII((this.leashedToEntity instanceof EntityHanging) ? 1 : 0)) {
                final BlockPos lllllllllllllIIIIIlllIlIlIlllIII = ((EntityHanging)this.leashedToEntity).getHangingPosition();
                lllllllllllllIIIIIlllIlIlIlllIIl.setInteger(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[12]], lllllllllllllIIIIIlllIlIlIlllIII.getX());
                lllllllllllllIIIIIlllIlIlIlllIIl.setInteger(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[13]], lllllllllllllIIIIIlllIlIlIlllIII.getY());
                lllllllllllllIIIIIlllIlIlIlllIIl.setInteger(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[14]], lllllllllllllIIIIIlllIlIlIlllIII.getZ());
            }
            lllllllllllllIIIIIlllIlIlIllllll.setTag(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[15]], lllllllllllllIIIIIlllIlIlIlllIIl);
        }
        if (llllIlllIIlIlII(this.isAIDisabled() ? 1 : 0)) {
            lllllllllllllIIIIIlllIlIlIllllll.setBoolean(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[16]], this.isAIDisabled());
        }
    }
    
    protected void despawnEntity() {
        if (llllIlllIIlIlII(this.persistenceRequired ? 1 : 0)) {
            this.entityAge = EntityLiving.lIllIIIIlllIlI[1];
            "".length();
            if ("   ".length() < -" ".length()) {
                return;
            }
        }
        else {
            final Entity lllllllllllllIIIIIlllIlIIllIlIlI = this.worldObj.getClosestPlayerToEntity(this, -1.0);
            if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIlIIllIlIlI)) {
                final double lllllllllllllIIIIIlllIlIIllIlIIl = lllllllllllllIIIIIlllIlIIllIlIlI.posX - this.posX;
                final double lllllllllllllIIIIIlllIlIIllIlIII = lllllllllllllIIIIIlllIlIIllIlIlI.posY - this.posY;
                final double lllllllllllllIIIIIlllIlIIllIIlll = lllllllllllllIIIIIlllIlIIllIlIlI.posZ - this.posZ;
                final double lllllllllllllIIIIIlllIlIIllIIllI = lllllllllllllIIIIIlllIlIIllIlIIl * lllllllllllllIIIIIlllIlIIllIlIIl + lllllllllllllIIIIIlllIlIIllIlIII * lllllllllllllIIIIIlllIlIIllIlIII + lllllllllllllIIIIIlllIlIIllIIlll * lllllllllllllIIIIIlllIlIIllIIlll;
                if (llllIlllIIlIlII(this.canDespawn() ? 1 : 0) && llllIlllIIlIlll(llllIlllIlIIIlI(lllllllllllllIIIIIlllIlIIllIIllI, 16384.0))) {
                    this.setDead();
                }
                if (llllIlllIIlllIl(this.entityAge, EntityLiving.lIllIIIIlllIlI[29]) && llllIlllIIllIlI(this.rand.nextInt(EntityLiving.lIllIIIIlllIlI[30])) && llllIlllIIlIlll(llllIlllIlIIIlI(lllllllllllllIIIIIlllIlIIllIIllI, 1024.0)) && llllIlllIIlIlII(this.canDespawn() ? 1 : 0)) {
                    this.setDead();
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
                else if (llllIlllIlIIIII(llllIlllIlIIIll(lllllllllllllIIIIIlllIlIIllIIllI, 1024.0))) {
                    this.entityAge = EntityLiving.lIllIIIIlllIlI[1];
                }
            }
        }
    }
    
    private static boolean llllIlllIIlllll(final int lllllllllllllIIIIIlllIIIllllIIlI, final int lllllllllllllIIIIIlllIIIllllIIIl) {
        return lllllllllllllIIIIIlllIIIllllIIlI != lllllllllllllIIIIIlllIIIllllIIIl;
    }
    
    public Entity getLeashedToEntity() {
        return this.leashedToEntity;
    }
    
    static {
        llllIlllIIlIIII();
        llllIlllIIIllll();
    }
    
    public void setCanPickUpLoot(final boolean lllllllllllllIIIIIlllIIllIlIIlIl) {
        this.canPickUpLoot = lllllllllllllIIIIIlllIIllIlIIlIl;
    }
    
    public int getMaxSpawnedInChunk() {
        return EntityLiving.lIllIIIIlllIlI[9];
    }
    
    private static int llllIlllIlIIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    protected int getExperiencePoints(final EntityPlayer lllllllllllllIIIIIlllIllIIIIIIlI) {
        if (!llllIlllIIlIlll(this.experienceValue)) {
            return this.experienceValue;
        }
        int lllllllllllllIIIIIlllIllIIIIIIIl = this.experienceValue;
        final ItemStack[] lllllllllllllIIIIIlllIllIIIIIIII = this.getInventory();
        int lllllllllllllIIIIIlllIlIllllllll = EntityLiving.lIllIIIIlllIlI[1];
        "".length();
        if (null != null) {
            return (0x39 ^ 0x77 ^ (0x1E ^ 0x6)) & (132 + 141 - 248 + 174 ^ 68 + 28 - 74 + 123 ^ -" ".length());
        }
        while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIlIllllllll, lllllllllllllIIIIIlllIllIIIIIIII.length)) {
            if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIllIIIIIIII[lllllllllllllIIIIIlllIlIllllllll]) && llllIlllIIllIII(llllIlllIIlIllI(this.equipmentDropChances[lllllllllllllIIIIIlllIlIllllllll], 1.0f))) {
                lllllllllllllIIIIIlllIllIIIIIIIl += EntityLiving.lIllIIIIlllIlI[2] + this.rand.nextInt(EntityLiving.lIllIIIIlllIlI[6]);
            }
            ++lllllllllllllIIIIIlllIlIllllllll;
        }
        return lllllllllllllIIIIIlllIllIIIIIIIl;
    }
    
    private static boolean llllIlllIIllIlI(final int lllllllllllllIIIIIlllIIIllllllIl) {
        return lllllllllllllIIIIIlllIIIllllllIl == 0;
    }
    
    public void setEquipmentDropChance(final int lllllllllllllIIIIIlllIIllIlIllll, final float lllllllllllllIIIIIlllIIllIllIIIl) {
        this.equipmentDropChances[lllllllllllllIIIIIlllIIllIlIllll] = lllllllllllllIIIIIlllIIllIllIIIl;
    }
    
    private static String llllIlllIIIllII(final String lllllllllllllIIIIIlllIIlIIlIIlII, final String lllllllllllllIIIIIlllIIlIIlIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlllIIlIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlllIIlIIlIIIll.getBytes(StandardCharsets.UTF_8)), EntityLiving.lIllIIIIlllIlI[12]), "DES");
            final Cipher lllllllllllllIIIIIlllIIlIIlIlIII = Cipher.getInstance("DES");
            lllllllllllllIIIIIlllIIlIIlIlIII.init(EntityLiving.lIllIIIIlllIlI[8], lllllllllllllIIIIIlllIIlIIlIlIIl);
            return new String(lllllllllllllIIIIIlllIIlIIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlllIIlIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlllIIlIIlIIlll) {
            lllllllllllllIIIIIlllIIlIIlIIlll.printStackTrace();
            return null;
        }
    }
    
    private static int llllIlllIlIlIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private void recreateLeash() {
        Label_0445: {
            if (llllIlllIIlIlII(this.isLeashed ? 1 : 0) && llllIlllIIlIIIl(this.leashNBTTag)) {
                if (llllIlllIIlIlII(this.leashNBTTag.hasKey(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[43]], EntityLiving.lIllIIIIlllIlI[9]) ? 1 : 0) && llllIlllIIlIlII(this.leashNBTTag.hasKey(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[44]], EntityLiving.lIllIIIIlllIlI[9]) ? 1 : 0)) {
                    final UUID lllllllllllllIIIIIlllIIlIlllIIll = new UUID(this.leashNBTTag.getLong(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[45]]), this.leashNBTTag.getLong(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[41]]));
                    final long lllllllllllllIIIIIlllIIlIllIllII = (long)this.worldObj.getEntitiesWithinAABB((Class<? extends Entity>)EntityLivingBase.class, this.getEntityBoundingBox().expand(10.0, 10.0, 10.0)).iterator();
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!llllIlllIIllIlI(((Iterator)lllllllllllllIIIIIlllIIlIllIllII).hasNext() ? 1 : 0)) {
                        final EntityLivingBase lllllllllllllIIIIIlllIIlIlllIIlI = ((Iterator<EntityLivingBase>)lllllllllllllIIIIIlllIIlIllIllII).next();
                        if (llllIlllIIlIlII(lllllllllllllIIIIIlllIIlIlllIIlI.getUniqueID().equals(lllllllllllllIIIIIlllIIlIlllIIll) ? 1 : 0)) {
                            this.leashedToEntity = lllllllllllllIIIIIlllIIlIlllIIlI;
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break Label_0445;
                        }
                    }
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return;
                    }
                }
                else if (llllIlllIIlIlII(this.leashNBTTag.hasKey(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[46]], EntityLiving.lIllIIIIlllIlI[47]) ? 1 : 0) && llllIlllIIlIlII(this.leashNBTTag.hasKey(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[48]], EntityLiving.lIllIIIIlllIlI[47]) ? 1 : 0) && llllIlllIIlIlII(this.leashNBTTag.hasKey(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[49]], EntityLiving.lIllIIIIlllIlI[47]) ? 1 : 0)) {
                    final BlockPos lllllllllllllIIIIIlllIIlIlllIIIl = new BlockPos(this.leashNBTTag.getInteger(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[50]]), this.leashNBTTag.getInteger(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[51]]), this.leashNBTTag.getInteger(EntityLiving.lIllIIIIlllIIl[EntityLiving.lIllIIIIlllIlI[52]]));
                    EntityLeashKnot lllllllllllllIIIIIlllIIlIlllIIII = EntityLeashKnot.getKnotForPosition(this.worldObj, lllllllllllllIIIIIlllIIlIlllIIIl);
                    if (llllIlllIlIIllI(lllllllllllllIIIIIlllIIlIlllIIII)) {
                        lllllllllllllIIIIIlllIIlIlllIIII = EntityLeashKnot.createKnot(this.worldObj, lllllllllllllIIIIIlllIIlIlllIIIl);
                    }
                    this.leashedToEntity = lllllllllllllIIIIIlllIIlIlllIIII;
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return;
                    }
                }
                else {
                    this.clearLeashed((boolean)(EntityLiving.lIllIIIIlllIlI[1] != 0), (boolean)(EntityLiving.lIllIIIIlllIlI[2] != 0));
                }
            }
        }
        this.leashNBTTag = null;
    }
    
    private static int llllIlllIIlllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int llllIlllIlIIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public EntityMoveHelper getMoveHelper() {
        return this.moveHelper;
    }
    
    public boolean isAIDisabled() {
        if (llllIlllIIlIlII(this.dataWatcher.getWatchableObjectByte(EntityLiving.lIllIIIIlllIlI[3]))) {
            return EntityLiving.lIllIIIIlllIlI[2] != 0;
        }
        return EntityLiving.lIllIIIIlllIlI[1] != 0;
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIIIIIlllIlIllIlIIII, final int lllllllllllllIIIIIlllIlIllIIllll) {
        final Item lllllllllllllIIIIIlllIlIllIIlllI = this.getDropItem();
        if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIlIllIIlllI)) {
            int lllllllllllllIIIIIlllIlIllIIllIl = this.rand.nextInt(EntityLiving.lIllIIIIlllIlI[6]);
            if (llllIlllIIlIlll(lllllllllllllIIIIIlllIlIllIIllll)) {
                lllllllllllllIIIIIlllIlIllIIllIl += this.rand.nextInt(lllllllllllllIIIIIlllIlIllIIllll + EntityLiving.lIllIIIIlllIlI[2]);
            }
            int lllllllllllllIIIIIlllIlIllIIllII = EntityLiving.lIllIIIIlllIlI[1];
            "".length();
            if (-" ".length() > (0x44 ^ 0x40)) {
                return;
            }
            while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIlIllIIllII, lllllllllllllIIIIIlllIlIllIIllIl)) {
                this.dropItem(lllllllllllllIIIIIlllIlIllIIlllI, EntityLiving.lIllIIIIlllIlI[2]);
                "".length();
                ++lllllllllllllIIIIIlllIlIllIIllII;
            }
        }
    }
    
    public static Item getArmorItemForSlot(final int lllllllllllllIIIIIlllIIlllIlIIlI, final int lllllllllllllIIIIIlllIIlllIlIIIl) {
        switch (lllllllllllllIIIIIlllIIlllIlIIlI) {
            case 4: {
                if (llllIlllIIllIlI(lllllllllllllIIIIIlllIIlllIlIIIl)) {
                    return Items.leather_helmet;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[2])) {
                    return Items.golden_helmet;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[8])) {
                    return Items.chainmail_helmet;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[6])) {
                    return Items.iron_helmet;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[9])) {
                    return Items.diamond_helmet;
                }
            }
            case 3: {
                if (llllIlllIIllIlI(lllllllllllllIIIIIlllIIlllIlIIIl)) {
                    return Items.leather_chestplate;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[2])) {
                    return Items.golden_chestplate;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[8])) {
                    return Items.chainmail_chestplate;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[6])) {
                    return Items.iron_chestplate;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[9])) {
                    return Items.diamond_chestplate;
                }
            }
            case 2: {
                if (llllIlllIIllIlI(lllllllllllllIIIIIlllIIlllIlIIIl)) {
                    return Items.leather_leggings;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[2])) {
                    return Items.golden_leggings;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[8])) {
                    return Items.chainmail_leggings;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[6])) {
                    return Items.iron_leggings;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[9])) {
                    return Items.diamond_leggings;
                }
            }
            case 1: {
                if (llllIlllIIllIlI(lllllllllllllIIIIIlllIIlllIlIIIl)) {
                    return Items.leather_boots;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[2])) {
                    return Items.golden_boots;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[8])) {
                    return Items.chainmail_boots;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[6])) {
                    return Items.iron_boots;
                }
                if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlllIlIIIl, EntityLiving.lIllIIIIlllIlI[9])) {
                    return Items.diamond_boots;
                }
                break;
            }
        }
        return null;
    }
    
    @Override
    public boolean replaceItemInInventory(final int lllllllllllllIIIIIlllIIlIllIIllI, final ItemStack lllllllllllllIIIIIlllIIlIllIIIII) {
        int lllllllllllllIIIIIlllIIlIllIIIll = 0;
        if (llllIlllIIllIIl(lllllllllllllIIIIIlllIIlIllIIllI, EntityLiving.lIllIIIIlllIlI[47])) {
            final int lllllllllllllIIIIIlllIIlIllIIlII = EntityLiving.lIllIIIIlllIlI[1];
            "".length();
            if ("  ".length() == 0) {
                return ((0x6E ^ 0x72) & ~(0x6C ^ 0x70)) != 0x0;
            }
        }
        else {
            lllllllllllllIIIIIlllIIlIllIIIll = lllllllllllllIIIIIlllIIlIllIIllI - EntityLiving.lIllIIIIlllIlI[53] + EntityLiving.lIllIIIIlllIlI[2];
            if (!llllIlllIlIlIll(lllllllllllllIIIIIlllIIlIllIIIll) || llllIlllIIlIIlI(lllllllllllllIIIIIlllIIlIllIIIll, this.equipment.length)) {
                return EntityLiving.lIllIIIIlllIlI[1] != 0;
            }
        }
        if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIIlIllIIIII) && llllIlllIIlllll(getArmorPosition(lllllllllllllIIIIIlllIIlIllIIIII), lllllllllllllIIIIIlllIIlIllIIIll) && (!llllIlllIIllIIl(lllllllllllllIIIIIlllIIlIllIIIll, EntityLiving.lIllIIIIlllIlI[9]) || llllIlllIIllIlI((lllllllllllllIIIIIlllIIlIllIIIII.getItem() instanceof ItemBlock) ? 1 : 0))) {
            return EntityLiving.lIllIIIIlllIlI[1] != 0;
        }
        this.setCurrentItemOrArmor(lllllllllllllIIIIIlllIIlIllIIIll, lllllllllllllIIIIIlllIIlIllIIIII);
        return EntityLiving.lIllIIIIlllIlI[2] != 0;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (llllIlllIIllIlI(this.worldObj.isRemote ? 1 : 0)) {
            this.updateLeashedState();
        }
    }
    
    private static int llllIlllIIllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private float updateRotation(final float lllllllllllllIIIIIlllIlIIIllIlIl, final float lllllllllllllIIIIIlllIlIIIllIlII, final float lllllllllllllIIIIIlllIlIIIlIllll) {
        float lllllllllllllIIIIIlllIlIIIllIIlI = MathHelper.wrapAngleTo180_float(lllllllllllllIIIIIlllIlIIIllIlII - lllllllllllllIIIIIlllIlIIIllIlIl);
        if (llllIlllIIlIlll(llllIlllIlIIlII(lllllllllllllIIIIIlllIlIIIllIIlI, lllllllllllllIIIIIlllIlIIIlIllll))) {
            lllllllllllllIIIIIlllIlIIIllIIlI = lllllllllllllIIIIIlllIlIIIlIllll;
        }
        if (llllIlllIlIIIII(llllIlllIlIIlIl(lllllllllllllIIIIIlllIlIIIllIIlI, -lllllllllllllIIIIIlllIlIIIlIllll))) {
            lllllllllllllIIIIIlllIlIIIllIIlI = -lllllllllllllIIIIIlllIlIIIlIllll;
        }
        return lllllllllllllIIIIIlllIlIIIllIlIl + lllllllllllllIIIIIlllIlIIIllIIlI;
    }
    
    public boolean getLeashed() {
        return this.isLeashed;
    }
    
    @Override
    public ItemStack getEquipmentInSlot(final int lllllllllllllIIIIIlllIlIIIIllIll) {
        return this.equipment[lllllllllllllIIIIIlllIlIIIIllIll];
    }
    
    @Override
    public final boolean interactFirst(final EntityPlayer lllllllllllllIIIIIlllIIllIIllIlI) {
        if (llllIlllIIlIlII(this.getLeashed() ? 1 : 0) && llllIlllIlIIIIl(this.getLeashedToEntity(), lllllllllllllIIIIIlllIIllIIllIlI)) {
            final int lllllllllllllIIIIIlllIIllIIIllll = EntityLiving.lIllIIIIlllIlI[2];
            int lllllllllllllIIIIIlllIIllIIIlllI;
            if (llllIlllIIlIlII(lllllllllllllIIIIIlllIIllIIllIlI.capabilities.isCreativeMode ? 1 : 0)) {
                lllllllllllllIIIIIlllIIllIIIlllI = EntityLiving.lIllIIIIlllIlI[1];
                "".length();
                if (((0x44 ^ 0x76) & ~(0x3D ^ 0xF)) > 0) {
                    return ((0xF ^ 0x12) & ~(0x0 ^ 0x1D)) != 0x0;
                }
            }
            else {
                lllllllllllllIIIIIlllIIllIIIlllI = EntityLiving.lIllIIIIlllIlI[2];
            }
            this.clearLeashed((boolean)(lllllllllllllIIIIIlllIIllIIIllll != 0), (boolean)(lllllllllllllIIIIIlllIIllIIIlllI != 0));
            return EntityLiving.lIllIIIIlllIlI[2] != 0;
        }
        final ItemStack lllllllllllllIIIIIlllIIllIIlllII = lllllllllllllIIIIIlllIIllIIllIlI.inventory.getCurrentItem();
        if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIIllIIlllII) && llllIlllIlIIIIl(lllllllllllllIIIIIlllIIllIIlllII.getItem(), Items.lead) && llllIlllIIlIlII(this.allowLeashing() ? 1 : 0)) {
            if (!llllIlllIIlIlII((this instanceof EntityTameable) ? 1 : 0) || llllIlllIIllIlI(((EntityTameable)this).isTamed() ? 1 : 0)) {
                this.setLeashedToEntity(lllllllllllllIIIIIlllIIllIIllIlI, (boolean)(EntityLiving.lIllIIIIlllIlI[2] != 0));
                final ItemStack itemStack = lllllllllllllIIIIIlllIIllIIlllII;
                itemStack.stackSize -= EntityLiving.lIllIIIIlllIlI[2];
                return EntityLiving.lIllIIIIlllIlI[2] != 0;
            }
            if (llllIlllIIlIlII(((EntityTameable)this).isOwner(lllllllllllllIIIIIlllIIllIIllIlI) ? 1 : 0)) {
                this.setLeashedToEntity(lllllllllllllIIIIIlllIIllIIllIlI, (boolean)(EntityLiving.lIllIIIIlllIlI[2] != 0));
                final ItemStack itemStack2 = lllllllllllllIIIIIlllIIllIIlllII;
                itemStack2.stackSize -= EntityLiving.lIllIIIIlllIlI[2];
                return EntityLiving.lIllIIIIlllIlI[2] != 0;
            }
        }
        if (llllIlllIIlIlII(this.interact(lllllllllllllIIIIIlllIIllIIllIlI) ? 1 : 0)) {
            return EntityLiving.lIllIIIIlllIlI[2] != 0;
        }
        return super.interactFirst(lllllllllllllIIIIIlllIIllIIllIlI);
    }
    
    public boolean isNoDespawnRequired() {
        return this.persistenceRequired;
    }
    
    private static boolean llllIlllIlIIIIl(final Object lllllllllllllIIIIIlllIIlIIIIIlII, final Object lllllllllllllIIIIIlllIIlIIIIIIll) {
        return lllllllllllllIIIIIlllIIlIIIIIlII == lllllllllllllIIIIIlllIIlIIIIIIll;
    }
    
    private static int llllIlllIlIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public EntityJumpHelper getJumpHelper() {
        return this.jumpHelper;
    }
    
    private static void llllIlllIIlIIII() {
        (lIllIIIIlllIlI = new int[55])[0] = (0x7C ^ 0x79);
        EntityLiving.lIllIIIIlllIlI[1] = (" ".length() & ~" ".length());
        EntityLiving.lIllIIIIlllIlI[2] = " ".length();
        EntityLiving.lIllIIIIlllIlI[3] = (0x83 ^ 0x8C);
        EntityLiving.lIllIIIIlllIlI[4] = (0x55 ^ 0x5);
        EntityLiving.lIllIIIIlllIlI[5] = (-(0xFFFFF71E & 0x7CE7) & (-1 & 0x77ED));
        EntityLiving.lIllIIIIlllIlI[6] = "   ".length();
        EntityLiving.lIllIIIIlllIlI[7] = (0x62 ^ 0x76);
        EntityLiving.lIllIIIIlllIlI[8] = "  ".length();
        EntityLiving.lIllIIIIlllIlI[9] = (0xE ^ 0xA);
        EntityLiving.lIllIIIIlllIlI[10] = (0x17 ^ 0x11);
        EntityLiving.lIllIIIIlllIlI[11] = (0x4A ^ 0x65 ^ (0xEF ^ 0xC7));
        EntityLiving.lIllIIIIlllIlI[12] = (0x5D ^ 0x55);
        EntityLiving.lIllIIIIlllIlI[13] = (0x5D ^ 0x11 ^ (0x5 ^ 0x40));
        EntityLiving.lIllIIIIlllIlI[14] = (0xF5 ^ 0x82 ^ (0xEC ^ 0x91));
        EntityLiving.lIllIIIIlllIlI[15] = (0x5C ^ 0x57);
        EntityLiving.lIllIIIIlllIlI[16] = (0x4A ^ 0x46);
        EntityLiving.lIllIIIIlllIlI[17] = (0x27 ^ 0x9 ^ (0x1C ^ 0x3F));
        EntityLiving.lIllIIIIlllIlI[18] = (131 + 60 - 182 + 131 ^ 108 + 128 - 113 + 7);
        EntityLiving.lIllIIIIlllIlI[19] = (0x30 ^ 0x2A ^ (0x45 ^ 0x4F));
        EntityLiving.lIllIIIIlllIlI[20] = (0xE0 ^ 0x9E ^ (0x6E ^ 0x1));
        EntityLiving.lIllIIIIlllIlI[21] = (0xA7 ^ 0xB5);
        EntityLiving.lIllIIIIlllIlI[22] = (0x2E ^ 0x3D);
        EntityLiving.lIllIIIIlllIlI[23] = (128 + 168 - 216 + 111 ^ 132 + 99 - 93 + 32);
        EntityLiving.lIllIIIIlllIlI[24] = (0x3D ^ 0x2B);
        EntityLiving.lIllIIIIlllIlI[25] = (0xA3 ^ 0xB4);
        EntityLiving.lIllIIIIlllIlI[26] = (0x3 ^ 0x1B);
        EntityLiving.lIllIIIIlllIlI[27] = (0x8 ^ 0x70 ^ (0x41 ^ 0x20));
        EntityLiving.lIllIIIIlllIlI[28] = -" ".length();
        EntityLiving.lIllIIIIlllIlI[29] = (-(0xFFFFDFE6 & 0x753B) & (0xFFFFFFFB & 0x577D));
        EntityLiving.lIllIIIIlllIlI[30] = (0xFFFFCFA6 & 0x3379);
        EntityLiving.lIllIIIIlllIlI[31] = (36 + 100 - 135 + 134 ^ 47 + 3 + 80 + 27);
        EntityLiving.lIllIIIIlllIlI[32] = (0x94 ^ 0xB5 ^ (0x24 ^ 0x1E));
        EntityLiving.lIllIIIIlllIlI[33] = (0x48 ^ 0x7A ^ (0x5C ^ 0x72));
        EntityLiving.lIllIIIIlllIlI[34] = (0xAE ^ 0xA3 ^ (0x9C ^ 0x8C));
        EntityLiving.lIllIIIIlllIlI[35] = (0x43 ^ 0x2B ^ (0x6F ^ 0x19));
        EntityLiving.lIllIIIIlllIlI[36] = (0x2C ^ 0x33);
        EntityLiving.lIllIIIIlllIlI[37] = (0x40 ^ 0x3B ^ (0x53 ^ 0x8));
        EntityLiving.lIllIIIIlllIlI[38] = (0x67 ^ 0x7 ^ (0x87 ^ 0xC6));
        EntityLiving.lIllIIIIlllIlI[39] = (0xB7 ^ 0xAB ^ (0x71 ^ 0x4F));
        EntityLiving.lIllIIIIlllIlI[40] = (0x36 ^ 0x15);
        EntityLiving.lIllIIIIlllIlI[41] = (0x28 ^ 0x7A ^ (0x60 ^ 0x1A));
        EntityLiving.lIllIIIIlllIlI[42] = (0xA0 ^ 0x84);
        EntityLiving.lIllIIIIlllIlI[43] = (0xA1 ^ 0x8F ^ (0x67 ^ 0x6C));
        EntityLiving.lIllIIIIlllIlI[44] = (0x6B ^ 0x4D);
        EntityLiving.lIllIIIIlllIlI[45] = (0x2A ^ 0x42 ^ (0xE4 ^ 0xAB));
        EntityLiving.lIllIIIIlllIlI[46] = (90 + 97 - 72 + 24 ^ 77 + 82 - 111 + 114);
        EntityLiving.lIllIIIIlllIlI[47] = (0x1F ^ 0x4A ^ (0xA4 ^ 0x92));
        EntityLiving.lIllIIIIlllIlI[48] = (0x26 ^ 0xC);
        EntityLiving.lIllIIIIlllIlI[49] = (0xF ^ 0x24);
        EntityLiving.lIllIIIIlllIlI[50] = (0x4D ^ 0x61);
        EntityLiving.lIllIIIIlllIlI[51] = (0x34 ^ 0x5D ^ (0x2F ^ 0x6B));
        EntityLiving.lIllIIIIlllIlI[52] = (0xB5 ^ 0xA4 ^ (0x67 ^ 0x58));
        EntityLiving.lIllIIIIlllIlI[53] = (0x97 ^ 0x8E ^ (0x34 ^ 0x49));
        EntityLiving.lIllIIIIlllIlI[54] = (0xE9 ^ 0xA7 ^ (0x2 ^ 0x63));
    }
    
    protected void setEnchantmentBasedOnDifficulty(final DifficultyInstance lllllllllllllIIIIIlllIIlllIIlIlI) {
        final float lllllllllllllIIIIIlllIIlllIIlIIl = lllllllllllllIIIIIlllIIlllIIlIlI.getClampedAdditionalDifficulty();
        if (llllIlllIIlIIIl(this.getHeldItem()) && llllIlllIlIIIII(llllIlllIlIlIlI(this.rand.nextFloat(), 0.25f * lllllllllllllIIIIIlllIIlllIIlIIl))) {
            EnchantmentHelper.addRandomEnchantment(this.rand, this.getHeldItem(), (int)(5.0f + lllllllllllllIIIIIlllIIlllIIlIIl * this.rand.nextInt(EntityLiving.lIllIIIIlllIlI[21])));
            "".length();
        }
        int lllllllllllllIIIIIlllIIlllIIlIII = EntityLiving.lIllIIIIlllIlI[1];
        "".length();
        if ((144 + 7 - 64 + 84 ^ 112 + 145 - 214 + 132) == 0x0) {
            return;
        }
        while (!llllIlllIIlIIlI(lllllllllllllIIIIIlllIIlllIIlIII, EntityLiving.lIllIIIIlllIlI[9])) {
            final ItemStack lllllllllllllIIIIIlllIIlllIIIlll = this.getCurrentArmor(lllllllllllllIIIIIlllIIlllIIlIII);
            if (llllIlllIIlIIIl(lllllllllllllIIIIIlllIIlllIIIlll) && llllIlllIlIIIII(llllIlllIlIlIlI(this.rand.nextFloat(), 0.5f * lllllllllllllIIIIIlllIIlllIIlIIl))) {
                EnchantmentHelper.addRandomEnchantment(this.rand, lllllllllllllIIIIIlllIIlllIIIlll, (int)(5.0f + lllllllllllllIIIIIlllIIlllIIlIIl * this.rand.nextInt(EntityLiving.lIllIIIIlllIlI[21])));
                "".length();
            }
            ++lllllllllllllIIIIIlllIIlllIIlIII;
        }
    }
    
    @Override
    public void setCurrentItemOrArmor(final int lllllllllllllIIIIIlllIlIIIIIlllI, final ItemStack lllllllllllllIIIIIlllIlIIIIIlIlI) {
        this.equipment[lllllllllllllIIIIIlllIlIIIIIlllI] = lllllllllllllIIIIIlllIlIIIIIlIlI;
    }
    
    protected String getLivingSound() {
        return null;
    }
    
    private static boolean llllIlllIIlllIl(final int lllllllllllllIIIIIlllIIlIIIIlllI, final int lllllllllllllIIIIIlllIIlIIIIllIl) {
        return lllllllllllllIIIIIlllIIlIIIIlllI > lllllllllllllIIIIIlllIIlIIIIllIl;
    }
    
    public void setAttackTarget(final EntityLivingBase lllllllllllllIIIIIlllIllIIIllIlI) {
        this.attackTarget = lllllllllllllIIIIIlllIllIIIllIlI;
    }
    
    public boolean allowLeashing() {
        if (llllIlllIIllIlI(this.getLeashed() ? 1 : 0) && llllIlllIIllIlI((this instanceof IMob) ? 1 : 0)) {
            return EntityLiving.lIllIIIIlllIlI[2] != 0;
        }
        return EntityLiving.lIllIIIIlllIlI[1] != 0;
    }
    
    @Override
    public ItemStack[] getInventory() {
        return this.equipment;
    }
    
    public EntityLivingBase getAttackTarget() {
        return this.attackTarget;
    }
    
    protected Item getDropItem() {
        return null;
    }
    
    @Override
    public ItemStack getHeldItem() {
        return this.equipment[EntityLiving.lIllIIIIlllIlI[1]];
    }
    
    private static boolean llllIlllIIlIIIl(final Object lllllllllllllIIIIIlllIIlIIIIIlll) {
        return lllllllllllllIIIIIlllIIlIIIIIlll != null;
    }
    
    public enum SpawnPlacementType
    {
        private static final /* synthetic */ int[] llIIlllllIllll;
        
        IN_AIR(SpawnPlacementType.llIIlllllIlllI[SpawnPlacementType.llIIlllllIllll[1]], SpawnPlacementType.llIIlllllIllll[1]), 
        IN_WATER(SpawnPlacementType.llIIlllllIlllI[SpawnPlacementType.llIIlllllIllll[2]], SpawnPlacementType.llIIlllllIllll[2]);
        
        private static final /* synthetic */ String[] llIIlllllIlllI;
        
        ON_GROUND(SpawnPlacementType.llIIlllllIlllI[SpawnPlacementType.llIIlllllIllll[0]], SpawnPlacementType.llIIlllllIllll[0]);
        
        private static void lIIlIIIIlIlllIlI() {
            (llIIlllllIlllI = new String[SpawnPlacementType.llIIlllllIllll[3]])[SpawnPlacementType.llIIlllllIllll[0]] = lIIlIIIIlIlllIII("6FSCfP3+hUq0QavizW4cSw==", "PZRfg");
            SpawnPlacementType.llIIlllllIlllI[SpawnPlacementType.llIIlllllIllll[1]] = lIIlIIIIlIlllIIl("tv8rKwTaNP0=", "AujKJ");
            SpawnPlacementType.llIIlllllIlllI[SpawnPlacementType.llIIlllllIllll[2]] = lIIlIIIIlIlllIIl("5zaW3AWpWGQdfCBv81w7AA==", "NCpFm");
        }
        
        private static String lIIlIIIIlIlllIII(final String llllllllllllIllIlllIIIllIlIIIllI, final String llllllllllllIllIlllIIIllIlIIIIll) {
            try {
                final SecretKeySpec llllllllllllIllIlllIIIllIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIllIlIIIIll.getBytes(StandardCharsets.UTF_8)), SpawnPlacementType.llIIlllllIllll[4]), "DES");
                final Cipher llllllllllllIllIlllIIIllIlIIlIII = Cipher.getInstance("DES");
                llllllllllllIllIlllIIIllIlIIlIII.init(SpawnPlacementType.llIIlllllIllll[2], llllllllllllIllIlllIIIllIlIIlIIl);
                return new String(llllllllllllIllIlllIIIllIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlllIIIllIlIIIlll) {
                llllllllllllIllIlllIIIllIlIIIlll.printStackTrace();
                return null;
            }
        }
        
        static {
            lIIlIIIIlIlllIll();
            lIIlIIIIlIlllIlI();
            final SpawnPlacementType[] enum$VALUES = new SpawnPlacementType[SpawnPlacementType.llIIlllllIllll[3]];
            enum$VALUES[SpawnPlacementType.llIIlllllIllll[0]] = SpawnPlacementType.ON_GROUND;
            enum$VALUES[SpawnPlacementType.llIIlllllIllll[1]] = SpawnPlacementType.IN_AIR;
            enum$VALUES[SpawnPlacementType.llIIlllllIllll[2]] = SpawnPlacementType.IN_WATER;
            ENUM$VALUES = enum$VALUES;
        }
        
        private static void lIIlIIIIlIlllIll() {
            (llIIlllllIllll = new int[5])[0] = ((0x68 ^ 0x3B) & ~(0x7A ^ 0x29));
            SpawnPlacementType.llIIlllllIllll[1] = " ".length();
            SpawnPlacementType.llIIlllllIllll[2] = "  ".length();
            SpawnPlacementType.llIIlllllIllll[3] = "   ".length();
            SpawnPlacementType.llIIlllllIllll[4] = (0x9B ^ 0x91 ^ "  ".length());
        }
        
        private static String lIIlIIIIlIlllIIl(final String llllllllllllIllIlllIIIllIlIlIIll, final String llllllllllllIllIlllIIIllIlIlIIlI) {
            try {
                final SecretKeySpec llllllllllllIllIlllIIIllIlIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlllIIIllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllIlllIIIllIlIlIlIl = Cipher.getInstance("Blowfish");
                llllllllllllIllIlllIIIllIlIlIlIl.init(SpawnPlacementType.llIIlllllIllll[2], llllllllllllIllIlllIIIllIlIlIllI);
                return new String(llllllllllllIllIlllIIIllIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlllIIIllIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIlllIIIllIlIlIlII) {
                llllllllllllIllIlllIIIllIlIlIlII.printStackTrace();
                return null;
            }
        }
        
        private SpawnPlacementType(final String llllllllllllIllIlllIIIllIllIIlII, final int llllllllllllIllIlllIIIllIllIIIll) {
        }
    }
}
