// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import java.util.Collection;
import net.minecraft.potion.PotionHelper;
import net.minecraft.entity.passive.EntityWolf;
import com.google.common.collect.Maps;
import java.util.List;
import com.google.common.base.Predicates;
import com.google.common.base.Predicate;
import net.minecraft.util.EntitySelectors;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.network.play.server.S0DPacketCollectItem;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.network.play.server.S0BPacketAnimation;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagShort;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemArmor;
import java.util.Random;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S04PacketEntityEquipment;
import net.minecraft.world.WorldServer;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.block.material.Material;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.scoreboard.Team;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import java.util.Iterator;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.ai.attributes.ServersideAttributeMap;
import net.minecraft.util.Vec3;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import java.util.Map;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import java.util.UUID;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.util.CombatTracker;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;

public abstract class EntityLivingBase extends Entity
{
    protected /* synthetic */ float onGroundSpeedFactor;
    public /* synthetic */ int swingProgressInt;
    protected /* synthetic */ int newPosRotationIncrements;
    private /* synthetic */ int jumpTicks;
    public /* synthetic */ float rotationYawHead;
    public /* synthetic */ float moveStrafing;
    private static final /* synthetic */ int[] lIIlIIlIIlIIlI;
    private /* synthetic */ int lastAttackerTime;
    protected /* synthetic */ double newPosZ;
    protected /* synthetic */ boolean isJumping;
    public /* synthetic */ float field_70770_ap;
    protected /* synthetic */ boolean dead;
    protected /* synthetic */ double newRotationYaw;
    protected /* synthetic */ float randomYawVelocity;
    public /* synthetic */ float limbSwingAmount;
    private /* synthetic */ BaseAttributeMap attributeMap;
    public /* synthetic */ float prevRotationYawHead;
    public /* synthetic */ int maxHurtTime;
    public /* synthetic */ float prevLimbSwingAmount;
    public /* synthetic */ float swingProgress;
    private final /* synthetic */ CombatTracker _combatTracker;
    public /* synthetic */ int arrowHitTimer;
    public /* synthetic */ float renderYawOffset;
    public /* synthetic */ int deathTime;
    protected /* synthetic */ int scoreValue;
    private static final /* synthetic */ AttributeModifier sprintingSpeedBoostModifier;
    private /* synthetic */ EntityLivingBase entityLivingToAttack;
    public /* synthetic */ float cameraPitch;
    public /* synthetic */ int maxHurtResistantTime;
    public /* synthetic */ float prevRenderYawOffset;
    protected /* synthetic */ float movedDistance;
    protected /* synthetic */ float prevOnGroundSpeedFactor;
    private /* synthetic */ float absorptionAmount;
    public /* synthetic */ float field_70769_ao;
    public /* synthetic */ float limbSwing;
    protected /* synthetic */ int entityAge;
    protected /* synthetic */ double newPosX;
    public /* synthetic */ float moveForward;
    protected /* synthetic */ float lastDamage;
    public /* synthetic */ float jumpMovementFactor;
    public /* synthetic */ int hurtTime;
    private /* synthetic */ EntityLivingBase lastAttacker;
    public /* synthetic */ float prevCameraPitch;
    private static final /* synthetic */ UUID sprintingSpeedBoostModifierUUID;
    private /* synthetic */ float landMovementFactor;
    protected /* synthetic */ double newPosY;
    private /* synthetic */ boolean potionsNeedUpdate;
    protected /* synthetic */ EntityPlayer attackingPlayer;
    protected /* synthetic */ float prevMovedDistance;
    protected /* synthetic */ double newRotationPitch;
    public /* synthetic */ boolean isSwingInProgress;
    public /* synthetic */ float prevSwingProgress;
    private final /* synthetic */ ItemStack[] previousEquipment;
    private static final /* synthetic */ String[] lIIlIIlIIlIIIl;
    private /* synthetic */ int revengeTimer;
    private final /* synthetic */ Map<Integer, PotionEffect> activePotionsMap;
    protected /* synthetic */ int recentlyHit;
    public /* synthetic */ float attackedAtYaw;
    
    private static int llIIllIIIlllllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean canBreatheUnderwater() {
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    protected void updateAITick() {
        this.motionY += 0.03999999910593033;
    }
    
    public EntityLivingBase getAITarget() {
        return this.entityLivingToAttack;
    }
    
    public boolean isOnSameTeam(final EntityLivingBase lllllllllllllIIllIlllllIlIIIlIll) {
        return this.isOnTeam(lllllllllllllIIllIlllllIlIIIlIll.getTeam());
    }
    
    public boolean isChild() {
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    private static boolean llIIllIIIlllIII(final int lllllllllllllIIllIlllllIIIIlllIl, final int lllllllllllllIIllIlllllIIIIlllII) {
        return lllllllllllllIIllIlllllIIIIlllIl != lllllllllllllIIllIlllllIIIIlllII;
    }
    
    protected void onNewPotionEffect(final PotionEffect lllllllllllllIIlllIIIIIIllllIIII) {
        this.potionsNeedUpdate = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
        if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
            Potion.potionTypes[lllllllllllllIIlllIIIIIIllllIIII.getPotionID()].applyAttributesModifiersToEntity(this, this.getAttributeMap(), lllllllllllllIIlllIIIIIIllllIIII.getAmplifier());
        }
    }
    
    public boolean canEntityBeSeen(final Entity lllllllllllllIIllIlllllIllIIlllI) {
        if (llIIllIIIllIllI(this.worldObj.rayTraceBlocks(new Vec3(this.posX, this.posY + this.getEyeHeight(), this.posZ), new Vec3(lllllllllllllIIllIlllllIllIIlllI.posX, lllllllllllllIIllIlllllIllIIlllI.posY + lllllllllllllIIllIlllllIllIIlllI.getEyeHeight(), lllllllllllllIIllIlllllIllIIlllI.posZ)))) {
            return EntityLivingBase.lIIlIIlIIlIIlI[1] != 0;
        }
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    public BaseAttributeMap getAttributeMap() {
        if (llIIllIIIllIllI(this.attributeMap)) {
            this.attributeMap = new ServersideAttributeMap();
        }
        return this.attributeMap;
    }
    
    private static int llIIllIIlIIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public boolean isServerWorld() {
        int n;
        if (llIIllIIIlIllII(this.worldObj.isRemote ? 1 : 0)) {
            n = EntityLivingBase.lIIlIIlIIlIIlI[0];
            "".length();
            if ((0x2F ^ 0x3D ^ (0x74 ^ 0x62)) < 0) {
                return ((0xA ^ 0x39 ^ (0x51 ^ 0x4B)) & (8 + 14 + 33 + 109 ^ 92 + 125 - 188 + 112 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityLivingBase.lIIlIIlIIlIIlI[1];
        }
        return n != 0;
    }
    
    public EntityLivingBase func_94060_bK() {
        EntityLivingBase entityLivingBase;
        if (llIIllIIIllIlII(this._combatTracker.func_94550_c())) {
            entityLivingBase = this._combatTracker.func_94550_c();
            "".length();
            if (((0xCC ^ 0xB6 ^ (0x3C ^ 0x1E)) & (0x30 ^ 0x1D ^ (0xC8 ^ 0xBD) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else if (llIIllIIIllIlII(this.attackingPlayer)) {
            entityLivingBase = this.attackingPlayer;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (llIIllIIIllIlII(this.entityLivingToAttack)) {
            entityLivingBase = this.entityLivingToAttack;
            "".length();
            if ((0xC8 ^ 0xC2 ^ (0x25 ^ 0x2B)) <= 0) {
                return null;
            }
        }
        else {
            entityLivingBase = null;
        }
        return entityLivingBase;
    }
    
    protected String getFallSoundString(final int lllllllllllllIIlllIIIIIIIlIIIIll) {
        String s;
        if (llIIllIIIllIlIl(lllllllllllllIIlllIIIIIIIlIIIIll, EntityLivingBase.lIIlIIlIIlIIlI[13])) {
            s = EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[34]];
            "".length();
            if (-" ".length() > "   ".length()) {
                return null;
            }
        }
        else {
            s = EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[35]];
        }
        return s;
    }
    
    public void addPotionEffect(final PotionEffect lllllllllllllIIlllIIIIIlIIIIllll) {
        if (llIIllIIIlIllII(this.isPotionApplicable(lllllllllllllIIlllIIIIIlIIIIllll) ? 1 : 0)) {
            if (llIIllIIIlIllII(this.activePotionsMap.containsKey(lllllllllllllIIlllIIIIIlIIIIllll.getPotionID()) ? 1 : 0)) {
                this.activePotionsMap.get(lllllllllllllIIlllIIIIIlIIIIllll.getPotionID()).combine(lllllllllllllIIlllIIIIIlIIIIllll);
                this.onChangedPotionEffect(this.activePotionsMap.get(lllllllllllllIIlllIIIIIlIIIIllll.getPotionID()), (boolean)(EntityLivingBase.lIIlIIlIIlIIlI[1] != 0));
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.activePotionsMap.put(lllllllllllllIIlllIIIIIlIIIIllll.getPotionID(), lllllllllllllIIlllIIIIIlIIIIllll);
                "".length();
                this.onNewPotionEffect(lllllllllllllIIlllIIIIIlIIIIllll);
            }
        }
    }
    
    protected void updatePotionEffects() {
        final Iterator<Integer> lllllllllllllIIlllIIIIIlIlllIIII = this.activePotionsMap.keySet().iterator();
        "".length();
        if ((0x23 ^ 0x39 ^ (0x36 ^ 0x28)) != (92 + 44 - 95 + 102 ^ 105 + 2 - 80 + 112)) {
            return;
        }
        while (!llIIllIIIlIlIlI(lllllllllllllIIlllIIIIIlIlllIIII.hasNext() ? 1 : 0)) {
            final Integer lllllllllllllIIlllIIIIIlIllIllll = lllllllllllllIIlllIIIIIlIlllIIII.next();
            final PotionEffect lllllllllllllIIlllIIIIIlIllIlllI = this.activePotionsMap.get(lllllllllllllIIlllIIIIIlIllIllll);
            if (llIIllIIIlIlIlI(lllllllllllllIIlllIIIIIlIllIlllI.onUpdate(this) ? 1 : 0)) {
                if (!llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
                    continue;
                }
                lllllllllllllIIlllIIIIIlIlllIIII.remove();
                this.onFinishedPotionEffect(lllllllllllllIIlllIIIIIlIllIlllI);
                "".length();
                if (((0x5B ^ 0x6D) & ~(0x5F ^ 0x69)) != ((0x8 ^ 0x4E) & ~(0x3B ^ 0x7D))) {
                    return;
                }
                continue;
            }
            else {
                if (!llIIllIIIlIlIlI(lllllllllllllIIlllIIIIIlIllIlllI.getDuration() % EntityLivingBase.lIIlIIlIIlIIlI[27])) {
                    continue;
                }
                this.onChangedPotionEffect(lllllllllllllIIlllIIIIIlIllIlllI, (boolean)(EntityLivingBase.lIIlIIlIIlIIlI[0] != 0));
            }
        }
        if (llIIllIIIlIllII(this.potionsNeedUpdate ? 1 : 0)) {
            if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
                this.updatePotionMetadata();
            }
            this.potionsNeedUpdate = (EntityLivingBase.lIIlIIlIIlIIlI[0] != 0);
        }
        final int lllllllllllllIIlllIIIIIlIllIllIl = this.dataWatcher.getWatchableObjectInt(EntityLivingBase.lIIlIIlIIlIIlI[5]);
        int n;
        if (llIIllIIIlIlIll(this.dataWatcher.getWatchableObjectByte(EntityLivingBase.lIIlIIlIIlIIlI[6]))) {
            n = EntityLivingBase.lIIlIIlIIlIIlI[1];
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            n = EntityLivingBase.lIIlIIlIIlIIlI[0];
        }
        final boolean lllllllllllllIIlllIIIIIlIllIllII = n != 0;
        if (llIIllIIIlIlIll(lllllllllllllIIlllIIIIIlIllIllIl)) {
            boolean lllllllllllllIIlllIIIIIlIllIlIll = EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
            if (llIIllIIIlIlIlI(this.isInvisible() ? 1 : 0)) {
                lllllllllllllIIlllIIIIIlIllIlIll = this.rand.nextBoolean();
                "".length();
                if ((0x78 ^ 0x7C) <= -" ".length()) {
                    return;
                }
            }
            else {
                int n2;
                if (llIIllIIIlIlIlI(this.rand.nextInt(EntityLivingBase.lIIlIIlIIlIIlI[19]))) {
                    n2 = EntityLivingBase.lIIlIIlIIlIIlI[1];
                    "".length();
                    if (((0x9D ^ 0xA2) & ~(0x6A ^ 0x55)) != 0x0) {
                        return;
                    }
                }
                else {
                    n2 = EntityLivingBase.lIIlIIlIIlIIlI[0];
                }
                lllllllllllllIIlllIIIIIlIllIlIll = (n2 != 0);
            }
            if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIlIllIllII ? 1 : 0)) {
                final boolean b = lllllllllllllIIlllIIIIIlIllIlIll;
                int n3;
                if (llIIllIIIlIlIlI(this.rand.nextInt(EntityLivingBase.lIIlIIlIIlIIlI[3]))) {
                    n3 = EntityLivingBase.lIIlIIlIIlIIlI[1];
                    "".length();
                    if (" ".length() < 0) {
                        return;
                    }
                }
                else {
                    n3 = EntityLivingBase.lIIlIIlIIlIIlI[0];
                }
                lllllllllllllIIlllIIIIIlIllIlIll = (((b ? 1 : 0) & n3) != 0x0);
            }
            if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIlIllIlIll ? 1 : 0) && llIIllIIIlIlIll(lllllllllllllIIlllIIIIIlIllIllIl)) {
                final double lllllllllllllIIlllIIIIIlIllIlIlI = (lllllllllllllIIlllIIIIIlIllIllIl >> EntityLivingBase.lIIlIIlIIlIIlI[20] & EntityLivingBase.lIIlIIlIIlIIlI[28]) / 255.0;
                final double lllllllllllllIIlllIIIIIlIllIlIIl = (lllllllllllllIIlllIIIIIlIllIllIl >> EntityLivingBase.lIIlIIlIIlIIlI[6] & EntityLivingBase.lIIlIIlIIlIIlI[28]) / 255.0;
                final double lllllllllllllIIlllIIIIIlIllIlIII = (lllllllllllllIIlllIIIIIlIllIllIl >> EntityLivingBase.lIIlIIlIIlIIlI[0] & EntityLivingBase.lIIlIIlIIlIIlI[28]) / 255.0;
                final World worldObj = this.worldObj;
                EnumParticleTypes lllllllllllllIIIlIIllllIIllIIIII;
                if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIlIllIllII ? 1 : 0)) {
                    lllllllllllllIIIlIIllllIIllIIIII = EnumParticleTypes.SPELL_MOB_AMBIENT;
                    "".length();
                    if ((0x6 ^ 0x3) <= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIlIIllllIIllIIIII = EnumParticleTypes.SPELL_MOB;
                }
                worldObj.spawnParticle(lllllllllllllIIIlIIllllIIllIIIII, this.posX + (this.rand.nextDouble() - 0.5) * this.width, this.posY + this.rand.nextDouble() * this.height, this.posZ + (this.rand.nextDouble() - 0.5) * this.width, lllllllllllllIIlllIIIIIlIllIlIlI, lllllllllllllIIlllIIIIIlIllIlIIl, lllllllllllllIIlllIIIIIlIllIlIII, new int[EntityLivingBase.lIIlIIlIIlIIlI[0]]);
            }
        }
    }
    
    public boolean isPlayerSleeping() {
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    private static int llIIllIIlIIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public abstract ItemStack getHeldItem();
    
    protected void jump() {
        this.motionY = this.getJumpUpwardsMotion();
        if (llIIllIIIlIllII(this.isPotionActive(Potion.jump) ? 1 : 0)) {
            this.motionY += (this.getActivePotionEffect(Potion.jump).getAmplifier() + EntityLivingBase.lIIlIIlIIlIIlI[1]) * 0.1f;
        }
        if (llIIllIIIlIllII(this.isSprinting() ? 1 : 0)) {
            final float lllllllllllllIIllIlllllllIIIllIl = this.rotationYaw * 0.017453292f;
            this.motionX -= MathHelper.sin(lllllllllllllIIllIlllllllIIIllIl) * 0.2f;
            this.motionZ += MathHelper.cos(lllllllllllllIIllIlllllllIIIllIl) * 0.2f;
        }
        this.isAirBorne = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
    }
    
    private static int llIIllIIlIIllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    protected void onChangedPotionEffect(final PotionEffect lllllllllllllIIlllIIIIIIlllIlIIl, final boolean lllllllllllllIIlllIIIIIIlllIIlIl) {
        this.potionsNeedUpdate = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
        if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIIlllIIlIl ? 1 : 0) && llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
            Potion.potionTypes[lllllllllllllIIlllIIIIIIlllIlIIl.getPotionID()].removeAttributesModifiersFromEntity(this, this.getAttributeMap(), lllllllllllllIIlllIIIIIIlllIlIIl.getAmplifier());
            Potion.potionTypes[lllllllllllllIIlllIIIIIIlllIlIIl.getPotionID()].applyAttributesModifiersToEntity(this, this.getAttributeMap(), lllllllllllllIIlllIIIIIIlllIlIIl.getAmplifier());
        }
    }
    
    public CombatTracker getCombatTracker() {
        return this._combatTracker;
    }
    
    public Team getTeam() {
        return this.worldObj.getScoreboard().getPlayersTeam(this.getUniqueID().toString());
    }
    
    private static int llIIllIIlIIIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected void onDeathUpdate() {
        this.deathTime += EntityLivingBase.lIIlIIlIIlIIlI[1];
        if (llIIllIIIllIIIl(this.deathTime, EntityLivingBase.lIIlIIlIIlIIlI[4])) {
            if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0) && (!llIIllIIIllIIll(this.recentlyHit) || llIIllIIIlIllII(this.isPlayer() ? 1 : 0)) && llIIllIIIlIllII(this.canDropLoot() ? 1 : 0) && llIIllIIIlIllII(this.worldObj.getGameRules().getBoolean(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[12]]) ? 1 : 0)) {
                int lllllllllllllIIlllIIIIIlllIlIllI = this.getExperiencePoints(this.attackingPlayer);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
                while (!llIIllIIIllIIll(lllllllllllllIIlllIIIIIlllIlIllI)) {
                    final int lllllllllllllIIlllIIIIIlllIlIlIl = EntityXPOrb.getXPSplit(lllllllllllllIIlllIIIIIlllIlIllI);
                    lllllllllllllIIlllIIIIIlllIlIllI -= lllllllllllllIIlllIIIIIlllIlIlIl;
                    this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, lllllllllllllIIlllIIIIIlllIlIlIl));
                    "".length();
                }
            }
            this.setDead();
            int lllllllllllllIIlllIIIIIlllIlIlII = EntityLivingBase.lIIlIIlIIlIIlI[0];
            "".length();
            if (((0x47 ^ 0x59 ^ (0xF1 ^ 0xB4)) & (81 + 16 + 73 + 39 ^ 131 + 132 - 188 + 63 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!llIIllIIIllIIlI(lllllllllllllIIlllIIIIIlllIlIlII, EntityLivingBase.lIIlIIlIIlIIlI[4])) {
                final double lllllllllllllIIlllIIIIIlllIlIIll = this.rand.nextGaussian() * 0.02;
                final double lllllllllllllIIlllIIIIIlllIlIIlI = this.rand.nextGaussian() * 0.02;
                final double lllllllllllllIIlllIIIIIlllIlIIIl = this.rand.nextGaussian() * 0.02;
                this.worldObj.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, this.posX + this.rand.nextFloat() * this.width * 2.0f - this.width, this.posY + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0f - this.width, lllllllllllllIIlllIIIIIlllIlIIll, lllllllllllllIIlllIIIIIlllIlIIlI, lllllllllllllIIlllIIIIIlllIlIIIl, new int[EntityLivingBase.lIIlIIlIIlIIlI[0]]);
                ++lllllllllllllIIlllIIIIIlllIlIlII;
            }
        }
    }
    
    @Override
    public void updateRidden() {
        super.updateRidden();
        this.prevOnGroundSpeedFactor = this.onGroundSpeedFactor;
        this.onGroundSpeedFactor = 0.0f;
        this.fallDistance = 0.0f;
    }
    
    @Override
    protected void entityInit() {
        this.dataWatcher.addObject(EntityLivingBase.lIIlIIlIIlIIlI[5], EntityLivingBase.lIIlIIlIIlIIlI[0]);
        this.dataWatcher.addObject(EntityLivingBase.lIIlIIlIIlIIlI[6], (byte)EntityLivingBase.lIIlIIlIIlIIlI[0]);
        this.dataWatcher.addObject(EntityLivingBase.lIIlIIlIIlIIlI[7], (byte)EntityLivingBase.lIIlIIlIIlIIlI[0]);
        this.dataWatcher.addObject(EntityLivingBase.lIIlIIlIIlIIlI[8], 1.0f);
    }
    
    public void renderBrokenItemStack(final ItemStack lllllllllllllIIlllIIIIIIlIlIIlll) {
        this.playSound(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[30]], 0.8f, 0.8f + this.worldObj.rand.nextFloat() * 0.4f);
        int lllllllllllllIIlllIIIIIIlIlIllII = EntityLivingBase.lIIlIIlIIlIIlI[0];
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!llIIllIIIllIIlI(lllllllllllllIIlllIIIIIIlIlIllII, EntityLivingBase.lIIlIIlIIlIIlI[3])) {
            Vec3 lllllllllllllIIlllIIIIIIlIlIlIll = new Vec3((this.rand.nextFloat() - 0.5) * 0.1, Math.random() * 0.1 + 0.1, 0.0);
            lllllllllllllIIlllIIIIIIlIlIlIll = lllllllllllllIIlllIIIIIIlIlIlIll.rotatePitch(-this.rotationPitch * 3.1415927f / 180.0f);
            lllllllllllllIIlllIIIIIIlIlIlIll = lllllllllllllIIlllIIIIIIlIlIlIll.rotateYaw(-this.rotationYaw * 3.1415927f / 180.0f);
            final double lllllllllllllIIlllIIIIIIlIlIlIlI = -this.rand.nextFloat() * 0.6 - 0.3;
            Vec3 lllllllllllllIIlllIIIIIIlIlIlIIl = new Vec3((this.rand.nextFloat() - 0.5) * 0.3, lllllllllllllIIlllIIIIIIlIlIlIlI, 0.6);
            lllllllllllllIIlllIIIIIIlIlIlIIl = lllllllllllllIIlllIIIIIIlIlIlIIl.rotatePitch(-this.rotationPitch * 3.1415927f / 180.0f);
            lllllllllllllIIlllIIIIIIlIlIlIIl = lllllllllllllIIlllIIIIIIlIlIlIIl.rotateYaw(-this.rotationYaw * 3.1415927f / 180.0f);
            lllllllllllllIIlllIIIIIIlIlIlIIl = lllllllllllllIIlllIIIIIIlIlIlIIl.addVector(this.posX, this.posY + this.getEyeHeight(), this.posZ);
            final World worldObj = this.worldObj;
            final EnumParticleTypes item_CRACK = EnumParticleTypes.ITEM_CRACK;
            final double xCoord = lllllllllllllIIlllIIIIIIlIlIlIIl.xCoord;
            final double yCoord = lllllllllllllIIlllIIIIIIlIlIlIIl.yCoord;
            final double zCoord = lllllllllllllIIlllIIIIIIlIlIlIIl.zCoord;
            final double xCoord2 = lllllllllllllIIlllIIIIIIlIlIlIll.xCoord;
            final double lllllllllllllIIIlIIllllIIllIIlII = lllllllllllllIIlllIIIIIIlIlIlIll.yCoord + 0.05;
            final double zCoord2 = lllllllllllllIIlllIIIIIIlIlIlIll.zCoord;
            final int[] lllllllllllllIIIlIIllllIIlIllIIl = new int[EntityLivingBase.lIIlIIlIIlIIlI[1]];
            lllllllllllllIIIlIIllllIIlIllIIl[EntityLivingBase.lIIlIIlIIlIIlI[0]] = Item.getIdFromItem(lllllllllllllIIlllIIIIIIlIlIIlll.getItem());
            worldObj.spawnParticle(item_CRACK, xCoord, yCoord, zCoord, xCoord2, lllllllllllllIIIlIIllllIIllIIlII, zCoord2, lllllllllllllIIIlIIllllIIlIllIIl);
            ++lllllllllllllIIlllIIIIIIlIlIllII;
        }
    }
    
    static {
        llIIllIIIlIIlll();
        llIIllIIIlIIllI();
        sprintingSpeedBoostModifierUUID = UUID.fromString(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[0]]);
        sprintingSpeedBoostModifier = new AttributeModifier(EntityLivingBase.sprintingSpeedBoostModifierUUID, EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[1]], 0.30000001192092896, EntityLivingBase.lIIlIIlIIlIIlI[2]).setSaved((boolean)(EntityLivingBase.lIIlIIlIIlIIlI[0] != 0));
    }
    
    public boolean attackEntityAsMob(final Entity lllllllllllllIIllIllllllIlIlIlll) {
        this.setLastAttacker(lllllllllllllIIllIllllllIlIlIlll);
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    protected void collideWithEntity(final Entity lllllllllllllIIllIllllllIIIIIlIl) {
        lllllllllllllIIllIllllllIIIIIlIl.applyEntityCollision(this);
    }
    
    public int getAge() {
        return this.entityAge;
    }
    
    public final int getArrowCountInEntity() {
        return this.dataWatcher.getWatchableObjectByte(EntityLivingBase.lIIlIIlIIlIIlI[7]);
    }
    
    protected void applyEntityAttributes() {
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.maxHealth);
        "".length();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.knockbackResistance);
        "".length();
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.movementSpeed);
        "".length();
    }
    
    public int getRevengeTimer() {
        return this.revengeTimer;
    }
    
    private static int llIIllIIlIIIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIIllIIIllIlIl(final int lllllllllllllIIllIlllllIIIlllIIl, final int lllllllllllllIIllIlllllIIIlllIII) {
        return lllllllllllllIIllIlllllIIIlllIIl > lllllllllllllIIllIlllllIIIlllIII;
    }
    
    @Override
    public void onEntityUpdate() {
        this.prevSwingProgress = this.swingProgress;
        super.onEntityUpdate();
        this.worldObj.theProfiler.startSection(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[2]]);
        final boolean lllllllllllllIIlllIIIIIllllIlIll = this instanceof EntityPlayer;
        if (llIIllIIIlIllII(this.isEntityAlive() ? 1 : 0)) {
            if (llIIllIIIlIllII(this.isEntityInsideOpaqueBlock() ? 1 : 0)) {
                this.attackEntityFrom(DamageSource.inWall, 1.0f);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIllllIlIll ? 1 : 0) && llIIllIIIlIlIlI(this.worldObj.getWorldBorder().contains(this.getEntityBoundingBox()) ? 1 : 0)) {
                final double lllllllllllllIIlllIIIIIllllIlIlI = this.worldObj.getWorldBorder().getClosestDistance(this) + this.worldObj.getWorldBorder().getDamageBuffer();
                if (llIIllIIIllIIII(llIIllIIIlIlllI(lllllllllllllIIlllIIIIIllllIlIlI, 0.0))) {
                    this.attackEntityFrom(DamageSource.inWall, (float)Math.max(EntityLivingBase.lIIlIIlIIlIIlI[1], MathHelper.floor_double(-lllllllllllllIIlllIIIIIllllIlIlI * this.worldObj.getWorldBorder().getDamageAmount())));
                    "".length();
                }
            }
        }
        if (!llIIllIIIlIlIlI(this.isImmuneToFire() ? 1 : 0) || llIIllIIIlIllII(this.worldObj.isRemote ? 1 : 0)) {
            this.extinguish();
        }
        int n;
        if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIllllIlIll ? 1 : 0) && llIIllIIIlIllII(((EntityPlayer)this).capabilities.disableDamage ? 1 : 0)) {
            n = EntityLivingBase.lIIlIIlIIlIIlI[1];
            "".length();
            if (((0x1 ^ 0x4D) & ~(0x4 ^ 0x48)) >= "  ".length()) {
                return;
            }
        }
        else {
            n = EntityLivingBase.lIIlIIlIIlIIlI[0];
        }
        final boolean lllllllllllllIIlllIIIIIllllIlIIl = n != 0;
        if (llIIllIIIlIllII(this.isEntityAlive() ? 1 : 0)) {
            if (llIIllIIIlIllII(this.isInsideOfMaterial(Material.water) ? 1 : 0)) {
                if (llIIllIIIlIlIlI(this.canBreatheUnderwater() ? 1 : 0) && llIIllIIIlIlIlI(this.isPotionActive(Potion.waterBreathing.id) ? 1 : 0) && llIIllIIIlIlIlI(lllllllllllllIIlllIIIIIllllIlIIl ? 1 : 0)) {
                    this.setAir(this.decreaseAirSupply(this.getAir()));
                    if (llIIllIIIllIIIl(this.getAir(), EntityLivingBase.lIIlIIlIIlIIlI[9])) {
                        this.setAir(EntityLivingBase.lIIlIIlIIlIIlI[0]);
                        int lllllllllllllIIlllIIIIIllllIlIII = EntityLivingBase.lIIlIIlIIlIIlI[0];
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                        while (!llIIllIIIllIIlI(lllllllllllllIIlllIIIIIllllIlIII, EntityLivingBase.lIIlIIlIIlIIlI[6])) {
                            final float lllllllllllllIIlllIIIIIllllIIlll = this.rand.nextFloat() - this.rand.nextFloat();
                            final float lllllllllllllIIlllIIIIIllllIIllI = this.rand.nextFloat() - this.rand.nextFloat();
                            final float lllllllllllllIIlllIIIIIllllIIlIl = this.rand.nextFloat() - this.rand.nextFloat();
                            this.worldObj.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX + lllllllllllllIIlllIIIIIllllIIlll, this.posY + lllllllllllllIIlllIIIIIllllIIllI, this.posZ + lllllllllllllIIlllIIIIIllllIIlIl, this.motionX, this.motionY, this.motionZ, new int[EntityLivingBase.lIIlIIlIIlIIlI[0]]);
                            ++lllllllllllllIIlllIIIIIllllIlIII;
                        }
                        this.attackEntityFrom(DamageSource.drown, 2.0f);
                        "".length();
                    }
                }
                if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0) && llIIllIIIlIllII(this.isRiding() ? 1 : 0) && llIIllIIIlIllII((this.ridingEntity instanceof EntityLivingBase) ? 1 : 0)) {
                    this.mountEntity(null);
                    "".length();
                    if ((0xB6 ^ 0xA8 ^ (0x26 ^ 0x3C)) < 0) {
                        return;
                    }
                }
            }
            else {
                this.setAir(EntityLivingBase.lIIlIIlIIlIIlI[10]);
            }
        }
        if (llIIllIIIlIllII(this.isEntityAlive() ? 1 : 0) && llIIllIIIlIllII(this.isWet() ? 1 : 0)) {
            this.extinguish();
        }
        this.prevCameraPitch = this.cameraPitch;
        if (llIIllIIIlIlIll(this.hurtTime)) {
            this.hurtTime -= EntityLivingBase.lIIlIIlIIlIIlI[1];
        }
        if (llIIllIIIlIlIll(this.hurtResistantTime) && llIIllIIIlIlIlI((this instanceof EntityPlayerMP) ? 1 : 0)) {
            this.hurtResistantTime -= EntityLivingBase.lIIlIIlIIlIIlI[1];
        }
        if (llIIllIIIllIIll(llIIllIIIlIllll(this.getHealth(), 0.0f))) {
            this.onDeathUpdate();
        }
        if (llIIllIIIlIlIll(this.recentlyHit)) {
            this.recentlyHit -= EntityLivingBase.lIIlIIlIIlIIlI[1];
            "".length();
            if ((0x16 ^ 0x12) < 0) {
                return;
            }
        }
        else {
            this.attackingPlayer = null;
        }
        if (llIIllIIIllIlII(this.lastAttacker) && llIIllIIIlIlIlI(this.lastAttacker.isEntityAlive() ? 1 : 0)) {
            this.lastAttacker = null;
        }
        if (llIIllIIIllIlII(this.entityLivingToAttack)) {
            if (llIIllIIIlIlIlI(this.entityLivingToAttack.isEntityAlive() ? 1 : 0)) {
                this.setRevengeTarget(null);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llIIllIIIllIlIl(this.ticksExisted - this.revengeTimer, EntityLivingBase.lIIlIIlIIlIIlI[11])) {
                this.setRevengeTarget(null);
            }
        }
        this.updatePotionEffects();
        this.prevMovedDistance = this.movedDistance;
        this.prevRenderYawOffset = this.renderYawOffset;
        this.prevRotationYawHead = this.rotationYawHead;
        this.prevRotationYaw = this.rotationYaw;
        this.prevRotationPitch = this.rotationPitch;
        this.worldObj.theProfiler.endSection();
    }
    
    public boolean isOnLadder() {
        final int lllllllllllllIIlllIIIIIIIlllIIll = MathHelper.floor_double(this.posX);
        final int lllllllllllllIIlllIIIIIIIlllIIlI = MathHelper.floor_double(this.getEntityBoundingBox().minY);
        final int lllllllllllllIIlllIIIIIIIlllIIIl = MathHelper.floor_double(this.posZ);
        final Block lllllllllllllIIlllIIIIIIIlllIIII = this.worldObj.getBlockState(new BlockPos(lllllllllllllIIlllIIIIIIIlllIIll, lllllllllllllIIlllIIIIIIIlllIIlI, lllllllllllllIIlllIIIIIIIlllIIIl)).getBlock();
        if ((!llIIllIIIlIllIl(lllllllllllllIIlllIIIIIIIlllIIII, Blocks.ladder) || llIIllIIIllIlll(lllllllllllllIIlllIIIIIIIlllIIII, Blocks.vine)) && (!llIIllIIIlIllII((this instanceof EntityPlayer) ? 1 : 0) || llIIllIIIlIlIlI(((EntityPlayer)this).isSpectator() ? 1 : 0))) {
            return EntityLivingBase.lIIlIIlIIlIIlI[1] != 0;
        }
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    public EntityLivingBase getLastAttacker() {
        return this.lastAttacker;
    }
    
    protected String getHurtSound() {
        return EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[32]];
    }
    
    protected int getExperiencePoints(final EntityPlayer lllllllllllllIIlllIIIIIllIlllllI) {
        return EntityLivingBase.lIIlIIlIIlIIlI[0];
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
            final int lllllllllllllIIllIllllllIlIIlIIl = this.getArrowCountInEntity();
            if (llIIllIIIlIlIll(lllllllllllllIIllIllllllIlIIlIIl)) {
                if (llIIllIIIllIIll(this.arrowHitTimer)) {
                    this.arrowHitTimer = EntityLivingBase.lIIlIIlIIlIIlI[4] * (EntityLivingBase.lIIlIIlIIlIIlI[37] - lllllllllllllIIllIllllllIlIIlIIl);
                }
                this.arrowHitTimer -= EntityLivingBase.lIIlIIlIIlIIlI[1];
                if (llIIllIIIllIIll(this.arrowHitTimer)) {
                    this.setArrowCountInEntity(lllllllllllllIIllIllllllIlIIlIIl - EntityLivingBase.lIIlIIlIIlIIlI[1]);
                }
            }
            int lllllllllllllIIllIllllllIlIIlIII = EntityLivingBase.lIIlIIlIIlIIlI[0];
            "".length();
            if ((0x45 ^ 0x41) < (0xBB ^ 0xBF)) {
                return;
            }
            while (!llIIllIIIllIIlI(lllllllllllllIIllIllllllIlIIlIII, EntityLivingBase.lIIlIIlIIlIIlI[3])) {
                final ItemStack lllllllllllllIIllIllllllIlIIIlll = this.previousEquipment[lllllllllllllIIllIllllllIlIIlIII];
                final ItemStack lllllllllllllIIllIllllllIlIIIllI = this.getEquipmentInSlot(lllllllllllllIIllIllllllIlIIlIII);
                if (llIIllIIIlIlIlI(ItemStack.areItemStacksEqual(lllllllllllllIIllIllllllIlIIIllI, lllllllllllllIIllIllllllIlIIIlll) ? 1 : 0)) {
                    ((WorldServer)this.worldObj).getEntityTracker().sendToAllTrackingEntity(this, new S04PacketEntityEquipment(this.getEntityId(), lllllllllllllIIllIllllllIlIIlIII, lllllllllllllIIllIllllllIlIIIllI));
                    if (llIIllIIIllIlII(lllllllllllllIIllIllllllIlIIIlll)) {
                        this.attributeMap.removeAttributeModifiers(lllllllllllllIIllIllllllIlIIIlll.getAttributeModifiers());
                    }
                    if (llIIllIIIllIlII(lllllllllllllIIllIllllllIlIIIllI)) {
                        this.attributeMap.applyAttributeModifiers(lllllllllllllIIllIllllllIlIIIllI.getAttributeModifiers());
                    }
                    final ItemStack[] previousEquipment = this.previousEquipment;
                    final int n = lllllllllllllIIllIllllllIlIIlIII;
                    ItemStack copy;
                    if (llIIllIIIllIllI(lllllllllllllIIllIllllllIlIIIllI)) {
                        copy = null;
                        "".length();
                        if (" ".length() <= 0) {
                            return;
                        }
                    }
                    else {
                        copy = lllllllllllllIIllIllllllIlIIIllI.copy();
                    }
                    previousEquipment[n] = copy;
                }
                ++lllllllllllllIIllIllllllIlIIlIII;
            }
            if (llIIllIIIlIlIlI(this.ticksExisted % EntityLivingBase.lIIlIIlIIlIIlI[4])) {
                this.getCombatTracker().reset();
            }
        }
        this.onLivingUpdate();
        final double lllllllllllllIIllIllllllIlIIIlIl = this.posX - this.prevPosX;
        final double lllllllllllllIIllIllllllIlIIIlII = this.posZ - this.prevPosZ;
        final float lllllllllllllIIllIllllllIlIIIIll = (float)(lllllllllllllIIllIllllllIlIIIlIl * lllllllllllllIIllIllllllIlIIIlIl + lllllllllllllIIllIllllllIlIIIlII * lllllllllllllIIllIllllllIlIIIlII);
        float lllllllllllllIIllIllllllIlIIIIlI = this.renderYawOffset;
        float lllllllllllllIIllIllllllIlIIIIIl = 0.0f;
        this.prevOnGroundSpeedFactor = this.onGroundSpeedFactor;
        float lllllllllllllIIllIllllllIlIIIIII = 0.0f;
        if (llIIllIIIlIlIll(llIIllIIlIIlIIl(lllllllllllllIIllIllllllIlIIIIll, 0.0025000002f))) {
            lllllllllllllIIllIllllllIlIIIIII = 1.0f;
            lllllllllllllIIllIllllllIlIIIIIl = (float)Math.sqrt(lllllllllllllIIllIllllllIlIIIIll) * 3.0f;
            lllllllllllllIIllIllllllIlIIIIlI = (float)MathHelper.func_181159_b(lllllllllllllIIllIllllllIlIIIlII, lllllllllllllIIllIllllllIlIIIlIl) * 180.0f / 3.1415927f - 90.0f;
        }
        if (llIIllIIIlIlIll(llIIllIIlIIlIIl(this.swingProgress, 0.0f))) {
            lllllllllllllIIllIllllllIlIIIIlI = this.rotationYaw;
        }
        if (llIIllIIIlIlIlI(this.onGround ? 1 : 0)) {
            lllllllllllllIIllIllllllIlIIIIII = 0.0f;
        }
        this.onGroundSpeedFactor += (lllllllllllllIIllIllllllIlIIIIII - this.onGroundSpeedFactor) * 0.3f;
        this.worldObj.theProfiler.startSection(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[38]]);
        lllllllllllllIIllIllllllIlIIIIIl = this.func_110146_f(lllllllllllllIIllIllllllIlIIIIlI, lllllllllllllIIllIllllllIlIIIIIl);
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[37]]);
        "".length();
        if ("  ".length() < 0) {
            return;
        }
        while (!llIIllIIIllllIl(llIIllIIlIIlIlI(this.rotationYaw - this.prevRotationYaw, -180.0f))) {
            this.prevRotationYaw -= 360.0f;
        }
        "".length();
        if (null != null) {
            return;
        }
        while (!llIIllIIIllIIII(llIIllIIlIIlIIl(this.rotationYaw - this.prevRotationYaw, 180.0f))) {
            this.prevRotationYaw += 360.0f;
        }
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!llIIllIIIllllIl(llIIllIIlIIlIlI(this.renderYawOffset - this.prevRenderYawOffset, -180.0f))) {
            this.prevRenderYawOffset -= 360.0f;
        }
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!llIIllIIIllIIII(llIIllIIlIIlIIl(this.renderYawOffset - this.prevRenderYawOffset, 180.0f))) {
            this.prevRenderYawOffset += 360.0f;
        }
        "".length();
        if ("   ".length() <= 0) {
            return;
        }
        while (!llIIllIIIllllIl(llIIllIIlIIlIlI(this.rotationPitch - this.prevRotationPitch, -180.0f))) {
            this.prevRotationPitch -= 360.0f;
        }
        "".length();
        if ((0xC4 ^ 0xC0) <= " ".length()) {
            return;
        }
        while (!llIIllIIIllIIII(llIIllIIlIIlIIl(this.rotationPitch - this.prevRotationPitch, 180.0f))) {
            this.prevRotationPitch += 360.0f;
        }
        "".length();
        if ("   ".length() <= 0) {
            return;
        }
        while (!llIIllIIIllllIl(llIIllIIlIIlIlI(this.rotationYawHead - this.prevRotationYawHead, -180.0f))) {
            this.prevRotationYawHead -= 360.0f;
        }
        "".length();
        if (-" ".length() >= (0x4A ^ 0x4E)) {
            return;
        }
        while (!llIIllIIIllIIII(llIIllIIlIIlIIl(this.rotationYawHead - this.prevRotationYawHead, 180.0f))) {
            this.prevRotationYawHead += 360.0f;
        }
        this.worldObj.theProfiler.endSection();
        this.movedDistance += lllllllllllllIIllIllllllIlIIIIIl;
    }
    
    private static int llIIllIIlIIIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void heal(final float lllllllllllllIIlllIIIIIIllIlIlll) {
        final float lllllllllllllIIlllIIIIIIllIllIIl = this.getHealth();
        if (llIIllIIIlIlIll(llIIllIIIlllIIl(lllllllllllllIIlllIIIIIIllIllIIl, 0.0f))) {
            this.setHealth(lllllllllllllIIlllIIIIIIllIllIIl + lllllllllllllIIlllIIIIIIllIlIlll);
        }
    }
    
    protected void onFinishedPotionEffect(final PotionEffect lllllllllllllIIlllIIIIIIllIlllll) {
        this.potionsNeedUpdate = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
        if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
            Potion.potionTypes[lllllllllllllIIlllIIIIIIllIlllll.getPotionID()].removeAttributesModifiersFromEntity(this, this.getAttributeMap(), lllllllllllllIIlllIIIIIIllIlllll.getAmplifier());
        }
    }
    
    public void dismountEntity(final Entity lllllllllllllIIllIlllllllIIlllII) {
        double lllllllllllllIIllIlllllllIlIIllI = lllllllllllllIIllIlllllllIIlllII.posX;
        double lllllllllllllIIllIlllllllIlIIlIl = lllllllllllllIIllIlllllllIIlllII.getEntityBoundingBox().minY + lllllllllllllIIllIlllllllIIlllII.height;
        double lllllllllllllIIllIlllllllIlIIlII = lllllllllllllIIllIlllllllIIlllII.posZ;
        final int lllllllllllllIIllIlllllllIlIIIll = EntityLivingBase.lIIlIIlIIlIIlI[1];
        int lllllllllllllIIllIlllllllIlIIIlI = -lllllllllllllIIllIlllllllIlIIIll;
        "".length();
        if ((0x75 ^ 0x70) == 0x0) {
            return;
        }
        while (!llIIllIIIllIlIl(lllllllllllllIIllIlllllllIlIIIlI, lllllllllllllIIllIlllllllIlIIIll)) {
            int lllllllllllllIIllIlllllllIlIIIIl = -lllllllllllllIIllIlllllllIlIIIll;
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!llIIllIIIllIIlI(lllllllllllllIIllIlllllllIlIIIIl, lllllllllllllIIllIlllllllIlIIIll)) {
                if (!llIIllIIIlIlIlI(lllllllllllllIIllIlllllllIlIIIlI) || llIIllIIIlIllII(lllllllllllllIIllIlllllllIlIIIIl)) {
                    final int lllllllllllllIIllIlllllllIlIIIII = (int)(this.posX + lllllllllllllIIllIlllllllIlIIIlI);
                    final int lllllllllllllIIllIlllllllIIlllll = (int)(this.posZ + lllllllllllllIIllIlllllllIlIIIIl);
                    final AxisAlignedBB lllllllllllllIIllIlllllllIIllllI = this.getEntityBoundingBox().offset(lllllllllllllIIllIlllllllIlIIIlI, 1.0, lllllllllllllIIllIlllllllIlIIIIl);
                    if (llIIllIIIlIllII(this.worldObj.func_147461_a(lllllllllllllIIllIlllllllIIllllI).isEmpty() ? 1 : 0)) {
                        if (llIIllIIIlIllII(World.doesBlockHaveSolidTopSurface(this.worldObj, new BlockPos(lllllllllllllIIllIlllllllIlIIIII, (int)this.posY, lllllllllllllIIllIlllllllIIlllll)) ? 1 : 0)) {
                            this.setPositionAndUpdate(this.posX + lllllllllllllIIllIlllllllIlIIIlI, this.posY + 1.0, this.posZ + lllllllllllllIIllIlllllllIlIIIIl);
                            return;
                        }
                        if (!llIIllIIIlIlIlI(World.doesBlockHaveSolidTopSurface(this.worldObj, new BlockPos(lllllllllllllIIllIlllllllIlIIIII, (int)this.posY - EntityLivingBase.lIIlIIlIIlIIlI[1], lllllllllllllIIllIlllllllIIlllll)) ? 1 : 0) || llIIllIIIllIlll(this.worldObj.getBlockState(new BlockPos(lllllllllllllIIllIlllllllIlIIIII, (int)this.posY - EntityLivingBase.lIIlIIlIIlIIlI[1], lllllllllllllIIllIlllllllIIlllll)).getBlock().getMaterial(), Material.water)) {
                            lllllllllllllIIllIlllllllIlIIllI = this.posX + lllllllllllllIIllIlllllllIlIIIlI;
                            lllllllllllllIIllIlllllllIlIIlIl = this.posY + 1.0;
                            lllllllllllllIIllIlllllllIlIIlII = this.posZ + lllllllllllllIIllIlllllllIlIIIIl;
                        }
                    }
                }
                ++lllllllllllllIIllIlllllllIlIIIIl;
            }
            ++lllllllllllllIIllIlllllllIlIIIlI;
        }
        this.setPositionAndUpdate(lllllllllllllIIllIlllllllIlIIllI, lllllllllllllIIllIlllllllIlIIlIl, lllllllllllllIIllIlllllllIlIIlII);
    }
    
    private static boolean llIIllIIIllIIll(final int lllllllllllllIIllIlllllIIIlIIIlI) {
        return lllllllllllllIIllIlllllIIIlIIIlI <= 0;
    }
    
    public abstract ItemStack getCurrentArmor(final int p0);
    
    public void onDeath(final DamageSource lllllllllllllIIlllIIIIIIlIIlllII) {
        final Entity lllllllllllllIIlllIIIIIIlIIllIll = lllllllllllllIIlllIIIIIIlIIlllII.getEntity();
        final EntityLivingBase lllllllllllllIIlllIIIIIIlIIllIlI = this.func_94060_bK();
        if (llIIllIIIllllIl(this.scoreValue) && llIIllIIIllIlII(lllllllllllllIIlllIIIIIIlIIllIlI)) {
            lllllllllllllIIlllIIIIIIlIIllIlI.addToPlayerScore(this, this.scoreValue);
        }
        if (llIIllIIIllIlII(lllllllllllllIIlllIIIIIIlIIllIll)) {
            lllllllllllllIIlllIIIIIIlIIllIll.onKillEntity(this);
        }
        this.dead = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
        this.getCombatTracker().reset();
        if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
            int lllllllllllllIIlllIIIIIIlIIllIIl = EntityLivingBase.lIIlIIlIIlIIlI[0];
            if (llIIllIIIlIllII((lllllllllllllIIlllIIIIIIlIIllIll instanceof EntityPlayer) ? 1 : 0)) {
                lllllllllllllIIlllIIIIIIlIIllIIl = EnchantmentHelper.getLootingModifier((EntityLivingBase)lllllllllllllIIlllIIIIIIlIIllIll);
            }
            if (llIIllIIIlIllII(this.canDropLoot() ? 1 : 0) && llIIllIIIlIllII(this.worldObj.getGameRules().getBoolean(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[31]]) ? 1 : 0)) {
                int lllllllllllllIIlllIIIIIIIllllIll;
                if (llIIllIIIlIlIll(this.recentlyHit)) {
                    lllllllllllllIIlllIIIIIIIllllIll = EntityLivingBase.lIIlIIlIIlIIlI[1];
                    "".length();
                    if ((0x48 ^ 0x7B ^ (0x99 ^ 0xAE)) < 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlllIIIIIIIllllIll = EntityLivingBase.lIIlIIlIIlIIlI[0];
                }
                this.dropFewItems((boolean)(lllllllllllllIIlllIIIIIIIllllIll != 0), lllllllllllllIIlllIIIIIIlIIllIIl);
                int lllllllllllllIIlllIIIIIIlIIlIIlI;
                if (llIIllIIIlIlIll(this.recentlyHit)) {
                    lllllllllllllIIlllIIIIIIlIIlIIlI = EntityLivingBase.lIIlIIlIIlIIlI[1];
                    "".length();
                    if ("  ".length() > (0x67 ^ 0x63)) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlllIIIIIIlIIlIIlI = EntityLivingBase.lIIlIIlIIlIIlI[0];
                }
                this.dropEquipment((boolean)(lllllllllllllIIlllIIIIIIlIIlIIlI != 0), lllllllllllllIIlllIIIIIIlIIllIIl);
                if (llIIllIIIlIlIll(this.recentlyHit) && llIIllIIIllIIII(llIIllIIIlllllI(this.rand.nextFloat(), 0.025f + lllllllllllllIIlllIIIIIIlIIllIIl * 0.01f))) {
                    this.addRandomDrop();
                }
            }
        }
        this.worldObj.setEntityState(this, (byte)EntityLivingBase.lIIlIIlIIlIIlI[12]);
    }
    
    public int getLastAttackerTime() {
        return this.lastAttackerTime;
    }
    
    protected void markPotionsDirty() {
        this.potionsNeedUpdate = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
    }
    
    public void setRevengeTarget(final EntityLivingBase lllllllllllllIIlllIIIIIllIlIlllI) {
        this.entityLivingToAttack = lllllllllllllIIlllIIIIIllIlIlllI;
        this.revengeTimer = this.ticksExisted;
    }
    
    public boolean isOnTeam(final Team lllllllllllllIIllIlllllIlIIIIlIl) {
        int sameTeam;
        if (llIIllIIIllIlII(this.getTeam())) {
            sameTeam = (this.getTeam().isSameTeam(lllllllllllllIIllIlllllIlIIIIlIl) ? 1 : 0);
            "".length();
            if ("  ".length() == 0) {
                return ("   ".length() & ~"   ".length()) != 0x0;
            }
        }
        else {
            sameTeam = EntityLivingBase.lIIlIIlIIlIIlI[0];
        }
        return sameTeam != 0;
    }
    
    private static boolean llIIllIIIllIllI(final Object lllllllllllllIIllIlllllIIIlIllII) {
        return lllllllllllllIIllIlllllIIIlIllII == null;
    }
    
    private static int llIIllIIIllllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public Random getRNG() {
        return this.rand;
    }
    
    private static int llIIllIIIlllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    protected float func_110146_f(final float lllllllllllllIIllIllllllIIlIllll, float lllllllllllllIIllIllllllIIlIlIII) {
        final float lllllllllllllIIllIllllllIIlIllIl = MathHelper.wrapAngleTo180_float(lllllllllllllIIllIllllllIIlIllll - this.renderYawOffset);
        this.renderYawOffset += lllllllllllllIIllIllllllIIlIllIl * 0.3f;
        float lllllllllllllIIllIllllllIIlIllII = MathHelper.wrapAngleTo180_float(this.rotationYaw - this.renderYawOffset);
        int n;
        if (llIIllIIIllllIl(llIIllIIlIIlIll(lllllllllllllIIllIllllllIIlIllII, -90.0f)) && llIIllIIIllIIII(llIIllIIlIIllII(lllllllllllllIIllIllllllIIlIllII, 90.0f))) {
            n = EntityLivingBase.lIIlIIlIIlIIlI[0];
            "".length();
            if ("  ".length() == 0) {
                return 0.0f;
            }
        }
        else {
            n = EntityLivingBase.lIIlIIlIIlIIlI[1];
        }
        final boolean lllllllllllllIIllIllllllIIlIlIll = n != 0;
        if (llIIllIIIllIIII(llIIllIIlIIlIll(lllllllllllllIIllIllllllIIlIllII, -75.0f))) {
            lllllllllllllIIllIllllllIIlIllII = -75.0f;
        }
        if (llIIllIIIllllIl(llIIllIIlIIllII(lllllllllllllIIllIllllllIIlIllII, 75.0f))) {
            lllllllllllllIIllIllllllIIlIllII = 75.0f;
        }
        this.renderYawOffset = this.rotationYaw - lllllllllllllIIllIllllllIIlIllII;
        if (llIIllIIIlIlIll(llIIllIIlIIllII(lllllllllllllIIllIllllllIIlIllII * lllllllllllllIIllIllllllIIlIllII, 2500.0f))) {
            this.renderYawOffset += lllllllllllllIIllIllllllIIlIllII * 0.2f;
        }
        if (llIIllIIIlIllII(lllllllllllllIIllIllllllIIlIlIll ? 1 : 0)) {
            lllllllllllllIIllIllllllIIlIlIII *= -1.0f;
        }
        return (float)lllllllllllllIIllIllllllIIlIlIII;
    }
    
    private static int llIIllIIlIlIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void setAIMoveSpeed(final float lllllllllllllIIllIllllllIlIllIll) {
        this.landMovementFactor = lllllllllllllIIllIllllllIlIllIll;
    }
    
    @Override
    public boolean getAlwaysRenderNameTagForRender() {
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    @Override
    public boolean isEntityAlive() {
        if (llIIllIIIlIlIlI(this.isDead ? 1 : 0) && llIIllIIIlIlIll(llIIllIIlIIIIII(this.getHealth(), 0.0f))) {
            return EntityLivingBase.lIIlIIlIIlIIlI[1] != 0;
        }
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    protected void resetPotionEffectMetadata() {
        this.dataWatcher.updateObject(EntityLivingBase.lIIlIIlIIlIIlI[6], (byte)EntityLivingBase.lIIlIIlIIlIIlI[0]);
        this.dataWatcher.updateObject(EntityLivingBase.lIIlIIlIIlIIlI[5], EntityLivingBase.lIIlIIlIIlIIlI[0]);
    }
    
    public void clearActivePotions() {
        final Iterator<Integer> lllllllllllllIIlllIIIIIlIlIIllIl = this.activePotionsMap.keySet().iterator();
        "".length();
        if ("   ".length() == " ".length()) {
            return;
        }
        while (!llIIllIIIlIlIlI(lllllllllllllIIlllIIIIIlIlIIllIl.hasNext() ? 1 : 0)) {
            final Integer lllllllllllllIIlllIIIIIlIlIIllII = lllllllllllllIIlllIIIIIlIlIIllIl.next();
            final PotionEffect lllllllllllllIIlllIIIIIlIlIIlIll = this.activePotionsMap.get(lllllllllllllIIlllIIIIIlIlIIllII);
            if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
                lllllllllllllIIlllIIIIIlIlIIllIl.remove();
                this.onFinishedPotionEffect(lllllllllllllIIlllIIIIIlIlIIlIll);
            }
        }
    }
    
    public int getTotalArmorValue() {
        int lllllllllllllIIlllIIIIIIIIllIlll = EntityLivingBase.lIIlIIlIIlIIlI[0];
        final String lllllllllllllIIlllIIIIIIIIlIllll;
        final long lllllllllllllIIlllIIIIIIIIllIIII = ((ItemStack[])(Object)(lllllllllllllIIlllIIIIIIIIlIllll = (String)(Object)this.getInventory())).length;
        double lllllllllllllIIlllIIIIIIIIllIIIl = EntityLivingBase.lIIlIIlIIlIIlI[0];
        "".length();
        if (-" ".length() != -" ".length()) {
            return (0x2 ^ 0x2B) & ~(0x2D ^ 0x4);
        }
        while (!llIIllIIIllIIlI((int)lllllllllllllIIlllIIIIIIIIllIIIl, (int)lllllllllllllIIlllIIIIIIIIllIIII)) {
            final ItemStack lllllllllllllIIlllIIIIIIIIllIllI = lllllllllllllIIlllIIIIIIIIlIllll[lllllllllllllIIlllIIIIIIIIllIIIl];
            if (llIIllIIIllIlII(lllllllllllllIIlllIIIIIIIIllIllI) && llIIllIIIlIllII((lllllllllllllIIlllIIIIIIIIllIllI.getItem() instanceof ItemArmor) ? 1 : 0)) {
                final int lllllllllllllIIlllIIIIIIIIllIlIl = ((ItemArmor)lllllllllllllIIlllIIIIIIIIllIllI.getItem()).damageReduceAmount;
                lllllllllllllIIlllIIIIIIIIllIlll += lllllllllllllIIlllIIIIIIIIllIlIl;
            }
            ++lllllllllllllIIlllIIIIIIIIllIIIl;
        }
        return lllllllllllllIIlllIIIIIIIIllIlll;
    }
    
    private static int llIIllIIlIIllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected void kill() {
        this.attackEntityFrom(DamageSource.outOfWorld, 4.0f);
        "".length();
    }
    
    @Override
    public void mountEntity(final Entity lllllllllllllIIllIlllllIllllllIl) {
        if (llIIllIIIllIlII(this.ridingEntity) && llIIllIIIllIllI(lllllllllllllIIllIlllllIllllllIl)) {
            if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
                this.dismountEntity(this.ridingEntity);
            }
            if (llIIllIIIllIlII(this.ridingEntity)) {
                this.ridingEntity.riddenByEntity = null;
            }
            this.ridingEntity = null;
            "".length();
            if (" ".length() >= (0x4D ^ 0x44 ^ (0xA ^ 0x7))) {
                return;
            }
        }
        else {
            super.mountEntity(lllllllllllllIIllIlllllIllllllIl);
        }
    }
    
    private static String llIIllIIIlIIlII(final String lllllllllllllIIllIlllllIIlIllllI, final String lllllllllllllIIllIlllllIIlIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIlllllIIllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllllIIlIlllIl.getBytes(StandardCharsets.UTF_8)), EntityLivingBase.lIIlIIlIIlIIlI[6]), "DES");
            final Cipher lllllllllllllIIllIlllllIIllIIIII = Cipher.getInstance("DES");
            lllllllllllllIIllIlllllIIllIIIII.init(EntityLivingBase.lIIlIIlIIlIIlI[2], lllllllllllllIIllIlllllIIllIIIIl);
            return new String(lllllllllllllIIllIlllllIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllllIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlllllIIlIlllll) {
            lllllllllllllIIllIlllllIIlIlllll.printStackTrace();
            return null;
        }
    }
    
    public void knockBack(final Entity lllllllllllllIIlllIIIIIIlIIIlIlI, final float lllllllllllllIIlllIIIIIIlIIIlIIl, final double lllllllllllllIIlllIIIIIIlIIIlIII, final double lllllllllllllIIlllIIIIIIlIIIIIlI) {
        if (llIIllIIIllllIl(llIIllIIIllllll(this.rand.nextDouble(), this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).getAttributeValue()))) {
            this.isAirBorne = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
            final float lllllllllllllIIlllIIIIIIlIIIIllI = MathHelper.sqrt_double(lllllllllllllIIlllIIIIIIlIIIlIII * lllllllllllllIIlllIIIIIIlIIIlIII + lllllllllllllIIlllIIIIIIlIIIIIlI * lllllllllllllIIlllIIIIIIlIIIIIlI);
            final float lllllllllllllIIlllIIIIIIlIIIIlIl = 0.4f;
            this.motionX /= 2.0;
            this.motionY /= 2.0;
            this.motionZ /= 2.0;
            this.motionX -= lllllllllllllIIlllIIIIIIlIIIlIII / lllllllllllllIIlllIIIIIIlIIIIllI * lllllllllllllIIlllIIIIIIlIIIIlIl;
            this.motionY += lllllllllllllIIlllIIIIIIlIIIIlIl;
            this.motionZ -= lllllllllllllIIlllIIIIIIlIIIIIlI / lllllllllllllIIlllIIIIIIlIIIIllI * lllllllllllllIIlllIIIIIIlIIIIlIl;
            if (llIIllIIIlIlIll(llIIllIIIllllll(this.motionY, 0.4000000059604645))) {
                this.motionY = 0.4000000059604645;
            }
        }
    }
    
    public final void setArrowCountInEntity(final int lllllllllllllIIllIlllllllllIIlll) {
        this.dataWatcher.updateObject(EntityLivingBase.lIIlIIlIIlIIlI[7], (byte)lllllllllllllIIllIlllllllllIIlll);
    }
    
    public float getAbsorptionAmount() {
        return this.absorptionAmount;
    }
    
    protected void dropFewItems(final boolean lllllllllllllIIlllIIIIIIIllllIll, final int lllllllllllllIIlllIIIIIIIllllIlI) {
    }
    
    protected float getJumpUpwardsMotion() {
        return 0.42f;
    }
    
    public final float getHealth() {
        return this.dataWatcher.getWatchableObjectFloat(EntityLivingBase.lIIlIIlIIlIIlI[8]);
    }
    
    protected boolean canDropLoot() {
        int n;
        if (llIIllIIIlIllII(this.isChild() ? 1 : 0)) {
            n = EntityLivingBase.lIIlIIlIIlIIlI[0];
            "".length();
            if ("   ".length() < 0) {
                return ((0x45 ^ 0x6B ^ (0x4F ^ 0x51)) & (0x57 ^ 0x12 ^ (0xE8 ^ 0x9D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityLivingBase.lIIlIIlIIlIIlI[1];
        }
        return n != 0;
    }
    
    protected void updateArmSwingProgress() {
        final int lllllllllllllIIllIllllllllIlIIII = this.getArmSwingAnimationEnd();
        if (llIIllIIIlIllII(this.isSwingInProgress ? 1 : 0)) {
            this.swingProgressInt += EntityLivingBase.lIIlIIlIIlIIlI[1];
            if (llIIllIIIllIIlI(this.swingProgressInt, lllllllllllllIIllIllllllllIlIIII)) {
                this.swingProgressInt = EntityLivingBase.lIIlIIlIIlIIlI[0];
                this.isSwingInProgress = (EntityLivingBase.lIIlIIlIIlIIlI[0] != 0);
                "".length();
                if ((0xB ^ 0xF) <= " ".length()) {
                    return;
                }
            }
        }
        else {
            this.swingProgressInt = EntityLivingBase.lIIlIIlIIlIIlI[0];
        }
        this.swingProgress = this.swingProgressInt / (float)lllllllllllllIIllIllllllllIlIIII;
    }
    
    private static int llIIllIIIlIlIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected float getSoundVolume() {
        return 1.0f;
    }
    
    private static int llIIllIIlIIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    protected void damageArmor(final float lllllllllllllIIlllIIIIIIIIlIllII) {
    }
    
    protected boolean isPlayer() {
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIIllIllllllllIllIII) {
        if (llIIllIIIllIIIl(lllllllllllllIIllIllllllllIllIII, EntityLivingBase.lIIlIIlIIlIIlI[2])) {
            this.limbSwingAmount = 1.5f;
            this.hurtResistantTime = this.maxHurtResistantTime;
            final int n = EntityLivingBase.lIIlIIlIIlIIlI[14];
            this.maxHurtTime = n;
            this.hurtTime = n;
            this.attackedAtYaw = 0.0f;
            final String lllllllllllllIIllIllllllllIllIll = this.getHurtSound();
            if (llIIllIIIllIlII(lllllllllllllIIllIllllllllIllIll)) {
                this.playSound(this.getHurtSound(), this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
            }
            this.attackEntityFrom(DamageSource.generic, 0.0f);
            "".length();
            "".length();
            if (((0x26 ^ 0x3F ^ (0xF6 ^ 0xBA)) & (0x28 ^ 0x13 ^ (0xC0 ^ 0xAE) ^ -" ".length())) > 0) {
                return;
            }
        }
        else if (llIIllIIIllIIIl(lllllllllllllIIllIllllllllIllIII, EntityLivingBase.lIIlIIlIIlIIlI[12])) {
            final String lllllllllllllIIllIllllllllIllIlI = this.getDeathSound();
            if (llIIllIIIllIlII(lllllllllllllIIllIllllllllIllIlI)) {
                this.playSound(this.getDeathSound(), this.getSoundVolume(), (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
            }
            this.setHealth(0.0f);
            this.onDeath(DamageSource.generic);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIIllIllllllllIllIII);
        }
    }
    
    @Override
    public boolean canBePushed() {
        int n;
        if (llIIllIIIlIllII(this.isDead ? 1 : 0)) {
            n = EntityLivingBase.lIIlIIlIIlIIlI[0];
            "".length();
            if ("   ".length() <= "  ".length()) {
                return ((0x61 ^ 0x6E) & ~(0x39 ^ 0x36)) != 0x0;
            }
        }
        else {
            n = EntityLivingBase.lIIlIIlIIlIIlI[1];
        }
        return n != 0;
    }
    
    private static boolean llIIllIIIllIIII(final int lllllllllllllIIllIlllllIIIlIIlII) {
        return lllllllllllllIIllIlllllIIIlIIlII < 0;
    }
    
    public PotionEffect getActivePotionEffect(final Potion lllllllllllllIIlllIIIIIlIIIllllI) {
        return this.activePotionsMap.get(lllllllllllllIIlllIIIIIlIIIllllI.id);
    }
    
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIlllIIIIIllIIIIlIl) {
        this.setAbsorptionAmount(lllllllllllllIIlllIIIIIllIIIIlIl.getFloat(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[16]]));
        if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIllIIIIlIl.hasKey(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[17]], EntityLivingBase.lIIlIIlIIlIIlI[7]) ? 1 : 0) && llIIllIIIllIlII(this.worldObj) && llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
            SharedMonsterAttributes.func_151475_a(this.getAttributeMap(), lllllllllllllIIlllIIIIIllIIIIlIl.getTagList(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[18]], EntityLivingBase.lIIlIIlIIlIIlI[14]));
        }
        if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIllIIIIlIl.hasKey(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[19]], EntityLivingBase.lIIlIIlIIlIIlI[7]) ? 1 : 0)) {
            final NBTTagList lllllllllllllIIlllIIIIIllIIIIlII = lllllllllllllIIlllIIIIIllIIIIlIl.getTagList(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[20]], EntityLivingBase.lIIlIIlIIlIIlI[14]);
            int lllllllllllllIIlllIIIIIllIIIIIll = EntityLivingBase.lIIlIIlIIlIIlI[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!llIIllIIIllIIlI(lllllllllllllIIlllIIIIIllIIIIIll, lllllllllllllIIlllIIIIIllIIIIlII.tagCount())) {
                final NBTTagCompound lllllllllllllIIlllIIIIIllIIIIIlI = lllllllllllllIIlllIIIIIllIIIIlII.getCompoundTagAt(lllllllllllllIIlllIIIIIllIIIIIll);
                final PotionEffect lllllllllllllIIlllIIIIIllIIIIIIl = PotionEffect.readCustomPotionEffectFromNBT(lllllllllllllIIlllIIIIIllIIIIIlI);
                if (llIIllIIIllIlII(lllllllllllllIIlllIIIIIllIIIIIIl)) {
                    this.activePotionsMap.put(lllllllllllllIIlllIIIIIllIIIIIIl.getPotionID(), lllllllllllllIIlllIIIIIllIIIIIIl);
                    "".length();
                }
                ++lllllllllllllIIlllIIIIIllIIIIIll;
            }
        }
        if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIllIIIIlIl.hasKey(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[21]], EntityLivingBase.lIIlIIlIIlIIlI[22]) ? 1 : 0)) {
            this.setHealth(lllllllllllllIIlllIIIIIllIIIIlIl.getFloat(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[23]]));
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            final NBTBase lllllllllllllIIlllIIIIIllIIIIIII = lllllllllllllIIlllIIIIIllIIIIlIl.getTag(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[24]]);
            if (llIIllIIIllIllI(lllllllllllllIIlllIIIIIllIIIIIII)) {
                this.setHealth(this.getMaxHealth());
                "".length();
                if ("  ".length() == ((37 + 208 - 64 + 62 ^ 109 + 76 - 55 + 49) & (177 + 89 - 255 + 208 ^ 76 + 77 - 77 + 79 ^ -" ".length()))) {
                    return;
                }
            }
            else if (llIIllIIIllIIIl(lllllllllllllIIlllIIIIIllIIIIIII.getId(), EntityLivingBase.lIIlIIlIIlIIlI[3])) {
                this.setHealth(((NBTTagFloat)lllllllllllllIIlllIIIIIllIIIIIII).getFloat());
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else if (llIIllIIIllIIIl(lllllllllllllIIlllIIIIIllIIIIIII.getId(), EntityLivingBase.lIIlIIlIIlIIlI[2])) {
                this.setHealth(((NBTTagShort)lllllllllllllIIlllIIIIIllIIIIIII).getShort());
            }
        }
        this.hurtTime = lllllllllllllIIlllIIIIIllIIIIlIl.getShort(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[4]]);
        this.deathTime = lllllllllllllIIlllIIIIIllIIIIlIl.getShort(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[25]]);
        this.revengeTimer = lllllllllllllIIlllIIIIIllIIIIlIl.getInteger(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[26]]);
    }
    
    public boolean isPotionActive(final int lllllllllllllIIlllIIIIIlIIllIlIl) {
        return this.activePotionsMap.containsKey(lllllllllllllIIlllIIIIIlIIllIlIl);
    }
    
    private static int llIIllIIlIIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void swingItem() {
        if (!llIIllIIIlIllII(this.isSwingInProgress ? 1 : 0) || !llIIllIIlIIIlII(this.swingProgressInt, this.getArmSwingAnimationEnd() / EntityLivingBase.lIIlIIlIIlIIlI[2]) || llIIllIIIllIIII(this.swingProgressInt)) {
            this.swingProgressInt = EntityLivingBase.lIIlIIlIIlIIlI[36];
            this.isSwingInProgress = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
            if (llIIllIIIlIllII((this.worldObj instanceof WorldServer) ? 1 : 0)) {
                ((WorldServer)this.worldObj).getEntityTracker().sendToAllTrackingEntity(this, new S0BPacketAnimation(this, EntityLivingBase.lIIlIIlIIlIIlI[0]));
            }
        }
    }
    
    private static boolean llIIllIIIlIllII(final int lllllllllllllIIllIlllllIIIlIlIlI) {
        return lllllllllllllIIllIlllllIIIlIlIlI != 0;
    }
    
    private static int llIIllIIIlIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public Vec3 getLookVec() {
        return this.getLook(1.0f);
    }
    
    private static int llIIllIIIlllIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected void setBeenAttacked() {
        int velocityChanged;
        if (llIIllIIIllllIl(llIIllIIlIlIIII(this.rand.nextDouble(), this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).getAttributeValue()))) {
            velocityChanged = EntityLivingBase.lIIlIIlIIlIIlI[1];
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            velocityChanged = EntityLivingBase.lIIlIIlIIlIIlI[0];
        }
        this.velocityChanged = (velocityChanged != 0);
    }
    
    private static int llIIllIIIllllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIIllIIIllIlII(final Object lllllllllllllIIllIlllllIIIllIIlI) {
        return lllllllllllllIIllIlllllIIIllIIlI != null;
    }
    
    private static int llIIllIIlIIlIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int llIIllIIlIIlIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int llIIllIIlIlIIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected float applyArmorCalculations(final DamageSource lllllllllllllIIlllIIIIIIIIlIIIII, float lllllllllllllIIlllIIIIIIIIIlllll) {
        if (llIIllIIIlIlIlI(lllllllllllllIIlllIIIIIIIIlIIIII.isUnblockable() ? 1 : 0)) {
            final int lllllllllllllIIlllIIIIIIIIlIIIll = EntityLivingBase.lIIlIIlIIlIIlI[32] - this.getTotalArmorValue();
            final float lllllllllllllIIlllIIIIIIIIlIIIlI = lllllllllllllIIlllIIIIIIIIIlllll * lllllllllllllIIlllIIIIIIIIlIIIll;
            this.damageArmor(lllllllllllllIIlllIIIIIIIIIlllll);
            lllllllllllllIIlllIIIIIIIIIlllll = lllllllllllllIIlllIIIIIIIIlIIIlI / 25.0f;
        }
        return lllllllllllllIIlllIIIIIIIIIlllll;
    }
    
    private static int llIIllIIIlIllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void onItemPickup(final Entity lllllllllllllIIllIlllllIllIlIlIl, final int lllllllllllllIIllIlllllIllIllIII) {
        if (llIIllIIIlIlIlI(lllllllllllllIIllIlllllIllIlIlIl.isDead ? 1 : 0) && llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
            final EntityTracker lllllllllllllIIllIlllllIllIlIlll = ((WorldServer)this.worldObj).getEntityTracker();
            if (llIIllIIIlIllII((lllllllllllllIIllIlllllIllIlIlIl instanceof EntityItem) ? 1 : 0)) {
                lllllllllllllIIllIlllllIllIlIlll.sendToAllTrackingEntity(lllllllllllllIIllIlllllIllIlIlIl, new S0DPacketCollectItem(lllllllllllllIIllIlllllIllIlIlIl.getEntityId(), this.getEntityId()));
            }
            if (llIIllIIIlIllII((lllllllllllllIIllIlllllIllIlIlIl instanceof EntityArrow) ? 1 : 0)) {
                lllllllllllllIIllIlllllIllIlIlll.sendToAllTrackingEntity(lllllllllllllIIllIlllllIllIlIlIl, new S0DPacketCollectItem(lllllllllllllIIllIlllllIllIlIlIl.getEntityId(), this.getEntityId()));
            }
            if (llIIllIIIlIllII((lllllllllllllIIllIlllllIllIlIlIl instanceof EntityXPOrb) ? 1 : 0)) {
                lllllllllllllIIllIlllllIllIlIlll.sendToAllTrackingEntity(lllllllllllllIIllIlllllIllIlIlIl, new S0DPacketCollectItem(lllllllllllllIIllIlllllIllIlIlIl.getEntityId(), this.getEntityId()));
            }
        }
    }
    
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }
    
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIlllIIIIIllIIlIlll) {
        lllllllllllllIIlllIIIIIllIIlIlll.setFloat(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[13]], this.getHealth());
        lllllllllllllIIlllIIIIIllIIlIlll.setShort(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[3]], (short)Math.ceil(this.getHealth()));
        lllllllllllllIIlllIIIIIllIIlIlll.setShort(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[8]], (short)this.hurtTime);
        lllllllllllllIIlllIIIIIllIIlIlll.setInteger(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[5]], this.revengeTimer);
        lllllllllllllIIlllIIIIIllIIlIlll.setShort(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[6]], (short)this.deathTime);
        lllllllllllllIIlllIIIIIllIIlIlll.setFloat(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[7]], this.getAbsorptionAmount());
        long lllllllllllllIIlllIIIIIllIIIllIl;
        float lllllllllllllIIlllIIIIIllIIIlllI = ((ItemStack[])(Object)(lllllllllllllIIlllIIIIIllIIIllIl = (long)(Object)this.getInventory())).length;
        int lllllllllllllIIllIlllllIIlIIIlIl = EntityLivingBase.lIIlIIlIIlIIlI[0];
        "".length();
        if ((0x5 ^ 0x1) == 0x0) {
            return;
        }
        while (!llIIllIIIllIIlI(lllllllllllllIIllIlllllIIlIIIlIl, (int)lllllllllllllIIlllIIIIIllIIIlllI)) {
            final ItemStack lllllllllllllIIlllIIIIIllIIlIllI = lllllllllllllIIlllIIIIIllIIIllIl[lllllllllllllIIllIlllllIIlIIIlIl];
            if (llIIllIIIllIlII(lllllllllllllIIlllIIIIIllIIlIllI)) {
                this.attributeMap.removeAttributeModifiers(lllllllllllllIIlllIIIIIllIIlIllI.getAttributeModifiers());
            }
            ++lllllllllllllIIllIlllllIIlIIIlIl;
        }
        lllllllllllllIIlllIIIIIllIIlIlll.setTag(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[14]], SharedMonsterAttributes.writeBaseAttributeMapToNBT(this.getAttributeMap()));
        lllllllllllllIIlllIIIIIllIIIlllI = ((ItemStack[])(Object)(lllllllllllllIIlllIIIIIllIIIllIl = (long)(Object)this.getInventory())).length;
        int lllllllllllllIIllIlllllIIlIIIlIl2 = EntityLivingBase.lIIlIIlIIlIIlI[0];
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!llIIllIIIllIIlI(lllllllllllllIIllIlllllIIlIIIlIl2, (int)lllllllllllllIIlllIIIIIllIIIlllI)) {
            final ItemStack lllllllllllllIIlllIIIIIllIIlIlIl = lllllllllllllIIlllIIIIIllIIIllIl[lllllllllllllIIllIlllllIIlIIIlIl2];
            if (llIIllIIIllIlII(lllllllllllllIIlllIIIIIllIIlIlIl)) {
                this.attributeMap.applyAttributeModifiers(lllllllllllllIIlllIIIIIllIIlIlIl.getAttributeModifiers());
            }
            ++lllllllllllllIIllIlllllIIlIIIlIl2;
        }
        if (llIIllIIIlIlIlI(this.activePotionsMap.isEmpty() ? 1 : 0)) {
            final NBTTagList lllllllllllllIIlllIIIIIllIIlIlII = new NBTTagList();
            lllllllllllllIIlllIIIIIllIIIlllI = (float)this.activePotionsMap.values().iterator();
            "".length();
            if ("   ".length() < 0) {
                return;
            }
            while (!llIIllIIIlIlIlI(((Iterator)lllllllllllllIIlllIIIIIllIIIlllI).hasNext() ? 1 : 0)) {
                final PotionEffect lllllllllllllIIlllIIIIIllIIlIIll = ((Iterator<PotionEffect>)lllllllllllllIIlllIIIIIllIIIlllI).next();
                lllllllllllllIIlllIIIIIllIIlIlII.appendTag(lllllllllllllIIlllIIIIIllIIlIIll.writeCustomPotionEffectToNBT(new NBTTagCompound()));
            }
            lllllllllllllIIlllIIIIIllIIlIlll.setTag(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[15]], lllllllllllllIIlllIIIIIllIIlIlII);
        }
    }
    
    protected void collideWithNearbyEntities() {
        final List<Entity> lllllllllllllIIllIllllllIIIIllll = this.worldObj.getEntitiesInAABBexcluding(this, this.getEntityBoundingBox().expand(0.20000000298023224, 0.0, 0.20000000298023224), (Predicate<? super Entity>)Predicates.and((Predicate)EntitySelectors.NOT_SPECTATING, (Predicate)new Predicate<Entity>() {
            public boolean apply(final Entity llllllllllllIllIIlIIIlIlllIIllll) {
                return llllllllllllIllIIlIIIlIlllIIllll.canBePushed();
            }
        }));
        if (llIIllIIIlIlIlI(lllllllllllllIIllIllllllIIIIllll.isEmpty() ? 1 : 0)) {
            int lllllllllllllIIllIllllllIIIIlllI = EntityLivingBase.lIIlIIlIIlIIlI[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!llIIllIIIllIIlI(lllllllllllllIIllIllllllIIIIlllI, lllllllllllllIIllIllllllIIIIllll.size())) {
                final Entity lllllllllllllIIllIllllllIIIIllIl = lllllllllllllIIllIllllllIIIIllll.get(lllllllllllllIIllIllllllIIIIlllI);
                this.collideWithEntity(lllllllllllllIIllIllllllIIIIllIl);
                ++lllllllllllllIIllIllllllIIIIlllI;
            }
        }
    }
    
    private static String llIIllIIIlIIlIl(final String lllllllllllllIIllIlllllIIlIIllll, final String lllllllllllllIIllIlllllIIlIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIlllllIIlIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlllllIIlIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlllllIIlIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlllllIIlIlIIll.init(EntityLivingBase.lIIlIIlIIlIIlI[2], lllllllllllllIIllIlllllIIlIlIlII);
            return new String(lllllllllllllIIllIlllllIIlIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlllllIIlIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlllllIIlIlIIlI) {
            lllllllllllllIIllIlllllIIlIlIIlI.printStackTrace();
            return null;
        }
    }
    
    public EntityLivingBase(final World lllllllllllllIIlllIIIIlIIIIllIll) {
        super(lllllllllllllIIlllIIIIlIIIIllIll);
        this._combatTracker = new CombatTracker(this);
        this.activePotionsMap = (Map<Integer, PotionEffect>)Maps.newHashMap();
        this.previousEquipment = new ItemStack[EntityLivingBase.lIIlIIlIIlIIlI[3]];
        this.maxHurtResistantTime = EntityLivingBase.lIIlIIlIIlIIlI[4];
        this.jumpMovementFactor = 0.02f;
        this.potionsNeedUpdate = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
        this.applyEntityAttributes();
        this.setHealth(this.getMaxHealth());
        this.preventEntitySpawning = (EntityLivingBase.lIIlIIlIIlIIlI[1] != 0);
        this.field_70770_ap = (float)((Math.random() + 1.0) * 0.009999999776482582);
        this.setPosition(this.posX, this.posY, this.posZ);
        this.field_70769_ao = (float)Math.random() * 12398.0f;
        this.rotationYaw = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.rotationYawHead = this.rotationYaw;
        this.stepHeight = 0.6f;
    }
    
    protected void addRandomDrop() {
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIlllIIIIIIllIIIlII, float lllllllllllllIIlllIIIIIIlIlllIIl) {
        if (llIIllIIIlIllII(this.isEntityInvulnerable(lllllllllllllIIlllIIIIIIllIIIlII) ? 1 : 0)) {
            return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
        }
        if (llIIllIIIlIllII(this.worldObj.isRemote ? 1 : 0)) {
            return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
        }
        this.entityAge = EntityLivingBase.lIIlIIlIIlIIlI[0];
        if (llIIllIIIllIIll(llIIllIIIlllIlI(this.getHealth(), 0.0f))) {
            return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
        }
        if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIIllIIIlII.isFireDamage() ? 1 : 0) && llIIllIIIlIllII(this.isPotionActive(Potion.fireResistance) ? 1 : 0)) {
            return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
        }
        if ((!llIIllIIIlIllIl(lllllllllllllIIlllIIIIIIllIIIlII, DamageSource.anvil) || llIIllIIIllIlll(lllllllllllllIIlllIIIIIIllIIIlII, DamageSource.fallingBlock)) && llIIllIIIllIlII(this.getEquipmentInSlot(EntityLivingBase.lIIlIIlIIlIIlI[13]))) {
            this.getEquipmentInSlot(EntityLivingBase.lIIlIIlIIlIIlI[13]).damageItem((int)(lllllllllllllIIlllIIIIIIlIlllIIl * 4.0f + this.rand.nextFloat() * lllllllllllllIIlllIIIIIIlIlllIIl * 2.0f), this);
            lllllllllllllIIlllIIIIIIlIlllIIl *= 0.75f;
        }
        this.limbSwingAmount = 1.5f;
        boolean lllllllllllllIIlllIIIIIIllIIIIlI = EntityLivingBase.lIIlIIlIIlIIlI[1] != 0;
        if (llIIllIIIlIlIll(llIIllIIIlllIll((float)this.hurtResistantTime, this.maxHurtResistantTime / 2.0f))) {
            if (llIIllIIIllIIll(llIIllIIIlllIlI(lllllllllllllIIlllIIIIIIlIlllIIl, this.lastDamage))) {
                return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
            }
            this.damageEntity(lllllllllllllIIlllIIIIIIllIIIlII, lllllllllllllIIlllIIIIIIlIlllIIl - this.lastDamage);
            this.lastDamage = lllllllllllllIIlllIIIIIIlIlllIIl;
            lllllllllllllIIlllIIIIIIllIIIIlI = (EntityLivingBase.lIIlIIlIIlIIlI[0] != 0);
            "".length();
            if (" ".length() <= ((114 + 93 - 83 + 13 ^ 26 + 114 - 137 + 125) & (0x46 ^ 0x21 ^ (0xA ^ 0x64) ^ -" ".length()))) {
                return ((8 + 123 - 28 + 45 ^ 44 + 48 - 3 + 56) & (0x26 ^ 0x52 ^ (0xEA ^ 0x9B) ^ -" ".length())) != 0x0;
            }
        }
        else {
            this.lastDamage = lllllllllllllIIlllIIIIIIlIlllIIl;
            this.hurtResistantTime = this.maxHurtResistantTime;
            this.damageEntity(lllllllllllllIIlllIIIIIIllIIIlII, lllllllllllllIIlllIIIIIIlIlllIIl);
            final int n = EntityLivingBase.lIIlIIlIIlIIlI[14];
            this.maxHurtTime = n;
            this.hurtTime = n;
        }
        this.attackedAtYaw = 0.0f;
        final Entity lllllllllllllIIlllIIIIIIllIIIIIl = lllllllllllllIIlllIIIIIIllIIIlII.getEntity();
        if (llIIllIIIllIlII(lllllllllllllIIlllIIIIIIllIIIIIl)) {
            if (llIIllIIIlIllII((lllllllllllllIIlllIIIIIIllIIIIIl instanceof EntityLivingBase) ? 1 : 0)) {
                this.setRevengeTarget((EntityLivingBase)lllllllllllllIIlllIIIIIIllIIIIIl);
            }
            if (llIIllIIIlIllII((lllllllllllllIIlllIIIIIIllIIIIIl instanceof EntityPlayer) ? 1 : 0)) {
                this.recentlyHit = EntityLivingBase.lIIlIIlIIlIIlI[11];
                this.attackingPlayer = (EntityPlayer)lllllllllllllIIlllIIIIIIllIIIIIl;
                "".length();
                if (" ".length() >= (0x5 ^ 0x1)) {
                    return ((0x1E ^ 0x14) & ~(0x6C ^ 0x66)) != 0x0;
                }
            }
            else if (llIIllIIIlIllII((lllllllllllllIIlllIIIIIIllIIIIIl instanceof EntityWolf) ? 1 : 0)) {
                final EntityWolf lllllllllllllIIlllIIIIIIllIIIIII = (EntityWolf)lllllllllllllIIlllIIIIIIllIIIIIl;
                if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIIllIIIIII.isTamed() ? 1 : 0)) {
                    this.recentlyHit = EntityLivingBase.lIIlIIlIIlIIlI[11];
                    this.attackingPlayer = null;
                }
            }
        }
        if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIIllIIIIlI ? 1 : 0)) {
            this.worldObj.setEntityState(this, (byte)EntityLivingBase.lIIlIIlIIlIIlI[2]);
            if (llIIllIIIlIllIl(lllllllllllllIIlllIIIIIIllIIIlII, DamageSource.drown)) {
                this.setBeenAttacked();
            }
            if (llIIllIIIllIlII(lllllllllllllIIlllIIIIIIllIIIIIl)) {
                double lllllllllllllIIlllIIIIIIlIllllll = lllllllllllllIIlllIIIIIIllIIIIIl.posX - this.posX;
                double lllllllllllllIIlllIIIIIIlIlllllI = lllllllllllllIIlllIIIIIIllIIIIIl.posZ - this.posZ;
                "".length();
                if (((0x87 ^ 0xB2) & ~(0x8F ^ 0xBA)) != 0x0) {
                    return ((0x7E ^ 0x68) & ~(0x8A ^ 0x9C)) != 0x0;
                }
                while (!llIIllIIIllllIl(llIIllIIIllllII(lllllllllllllIIlllIIIIIIlIllllll * lllllllllllllIIlllIIIIIIlIllllll + lllllllllllllIIlllIIIIIIlIlllllI * lllllllllllllIIlllIIIIIIlIlllllI, 1.0E-4))) {
                    lllllllllllllIIlllIIIIIIlIllllll = (Math.random() - Math.random()) * 0.01;
                    lllllllllllllIIlllIIIIIIlIlllllI = (Math.random() - Math.random()) * 0.01;
                }
                this.attackedAtYaw = (float)(MathHelper.func_181159_b(lllllllllllllIIlllIIIIIIlIlllllI, lllllllllllllIIlllIIIIIIlIllllll) * 180.0 / 3.141592653589793 - this.rotationYaw);
                this.knockBack(lllllllllllllIIlllIIIIIIllIIIIIl, lllllllllllllIIlllIIIIIIlIlllIIl, lllllllllllllIIlllIIIIIIlIllllll, lllllllllllllIIlllIIIIIIlIlllllI);
                "".length();
                if ((0x4E ^ 0x4A) == 0x0) {
                    return ((0xF4 ^ 0xBE) & ~(0x9 ^ 0x43)) != 0x0;
                }
            }
            else {
                this.attackedAtYaw = (float)((int)(Math.random() * 2.0) * EntityLivingBase.lIIlIIlIIlIIlI[29]);
            }
        }
        if (llIIllIIIllIIll(llIIllIIIlllIlI(this.getHealth(), 0.0f))) {
            final String lllllllllllllIIlllIIIIIIlIllllIl = this.getDeathSound();
            if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIIllIIIIlI ? 1 : 0) && llIIllIIIllIlII(lllllllllllllIIlllIIIIIIlIllllIl)) {
                this.playSound(lllllllllllllIIlllIIIIIIlIllllIl, this.getSoundVolume(), this.getSoundPitch());
            }
            this.onDeath(lllllllllllllIIlllIIIIIIllIIIlII);
            "".length();
            if ((0x74 ^ 0x70) <= "  ".length()) {
                return ((0x62 ^ 0x2E) & ~(0x8E ^ 0xC2)) != 0x0;
            }
        }
        else {
            final String lllllllllllllIIlllIIIIIIlIllllII = this.getHurtSound();
            if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIIllIIIIlI ? 1 : 0) && llIIllIIIllIlII(lllllllllllllIIlllIIIIIIlIllllII)) {
                this.playSound(lllllllllllllIIlllIIIIIIlIllllII, this.getSoundVolume(), this.getSoundPitch());
            }
        }
        return EntityLivingBase.lIIlIIlIIlIIlI[1] != 0;
    }
    
    protected void updatePotionMetadata() {
        if (llIIllIIIlIllII(this.activePotionsMap.isEmpty() ? 1 : 0)) {
            this.resetPotionEffectMetadata();
            this.setInvisible((boolean)(EntityLivingBase.lIIlIIlIIlIIlI[0] != 0));
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            final int lllllllllllllIIlllIIIIIlIlIlllII = PotionHelper.calcPotionLiquidColor(this.activePotionsMap.values());
            final DataWatcher dataWatcher = this.dataWatcher;
            final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityLivingBase.lIIlIIlIIlIIlI[6];
            int n;
            if (llIIllIIIlIllII(PotionHelper.getAreAmbient(this.activePotionsMap.values()) ? 1 : 0)) {
                n = EntityLivingBase.lIIlIIlIIlIIlI[1];
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                n = EntityLivingBase.lIIlIIlIIlIIlI[0];
            }
            dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
            this.dataWatcher.updateObject(EntityLivingBase.lIIlIIlIIlIIlI[5], lllllllllllllIIlllIIIIIlIlIlllII);
            this.setInvisible(this.isPotionActive(Potion.invisibility.id));
        }
    }
    
    public Collection<PotionEffect> getActivePotionEffects() {
        return this.activePotionsMap.values();
    }
    
    @Override
    public void setSprinting(final boolean lllllllllllllIIllIlllllllIllllll) {
        super.setSprinting(lllllllllllllIIllIlllllllIllllll);
        final IAttributeInstance lllllllllllllIIllIlllllllIlllllI = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
        if (llIIllIIIllIlII(lllllllllllllIIllIlllllllIlllllI.getModifier(EntityLivingBase.sprintingSpeedBoostModifierUUID))) {
            lllllllllllllIIllIlllllllIlllllI.removeModifier(EntityLivingBase.sprintingSpeedBoostModifier);
        }
        if (llIIllIIIlIllII(lllllllllllllIIllIlllllllIllllll ? 1 : 0)) {
            lllllllllllllIIllIlllllllIlllllI.applyModifier(EntityLivingBase.sprintingSpeedBoostModifier);
        }
    }
    
    public boolean isPotionApplicable(final PotionEffect lllllllllllllIIlllIIIIIlIIIIlIlI) {
        if (llIIllIIIllIlll(this.getCreatureAttribute(), EnumCreatureAttribute.UNDEAD)) {
            final int lllllllllllllIIlllIIIIIlIIIIlIIl = lllllllllllllIIlllIIIIIlIIIIlIlI.getPotionID();
            if (!llIIllIIIlllIII(lllllllllllllIIlllIIIIIlIIIIlIIl, Potion.regeneration.id) || llIIllIIIllIIIl(lllllllllllllIIlllIIIIIlIIIIlIIl, Potion.poison.id)) {
                return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
            }
        }
        return EntityLivingBase.lIIlIIlIIlIIlI[1] != 0;
    }
    
    private static boolean llIIllIIIllllIl(final int lllllllllllllIIllIlllllIIIlIIllI) {
        return lllllllllllllIIllIlllllIIIlIIllI >= 0;
    }
    
    public void removePotionEffect(final int lllllllllllllIIlllIIIIIIlllllIII) {
        final PotionEffect lllllllllllllIIlllIIIIIIllllIlll = this.activePotionsMap.remove(lllllllllllllIIlllIIIIIIlllllIII);
        if (llIIllIIIllIlII(lllllllllllllIIlllIIIIIIllllIlll)) {
            this.onFinishedPotionEffect(lllllllllllllIIlllIIIIIIllllIlll);
        }
    }
    
    protected void handleJumpLava() {
        this.motionY += 0.03999999910593033;
    }
    
    private static boolean llIIllIIIlIlIlI(final int lllllllllllllIIllIlllllIIIlIlIII) {
        return lllllllllllllIIllIlllllIIIlIlIII == 0;
    }
    
    public void removePotionEffectClient(final int lllllllllllllIIlllIIIIIIllllllll) {
        this.activePotionsMap.remove(lllllllllllllIIlllIIIIIIllllllll);
        "".length();
    }
    
    public void setLastAttacker(final Entity lllllllllllllIIlllIIIIIllIlIIIlI) {
        if (llIIllIIIlIllII((lllllllllllllIIlllIIIIIllIlIIIlI instanceof EntityLivingBase) ? 1 : 0)) {
            this.lastAttacker = (EntityLivingBase)lllllllllllllIIlllIIIIIllIlIIIlI;
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            this.lastAttacker = null;
        }
        this.lastAttackerTime = this.ticksExisted;
    }
    
    public void sendEnterCombat() {
    }
    
    @Override
    public void onKillCommand() {
        this.attackEntityFrom(DamageSource.outOfWorld, Float.MAX_VALUE);
        "".length();
    }
    
    protected String getDeathSound() {
        return EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[33]];
    }
    
    protected float getSoundPitch() {
        float n;
        if (llIIllIIIlIllII(this.isChild() ? 1 : 0)) {
            n = (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.5f;
            "".length();
            if ("  ".length() < 0) {
                return 0.0f;
            }
        }
        else {
            n = (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f;
        }
        return n;
    }
    
    private static void llIIllIIIlIIllI() {
        (lIIlIIlIIlIIIl = new String[EntityLivingBase.lIIlIIlIIlIIlI[44]])[EntityLivingBase.lIIlIIlIIlIIlI[0]] = llIIllIIIlIIIll("eXd+G38NeQh3DQ5yCXd9DHAPd3F3cH93cHkEDWx5dnZ+bXEL", "OALZI");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[1]] = llIIllIIIlIIIll("NDg7JyETIScpbxQ4LCsrRyomITwT", "gHINO");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[2]] = llIIllIIIlIIlII("MGwfCVp07hxSmNigRTblIbtYOCzcv8NC", "yPRDT");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[12]] = llIIllIIIlIIlII("wXhcOQ5gygtLEafOdVqy/A==", "fhZJs");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[13]] = llIIllIIIlIIIll("GSItOyo=", "QGLWl");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[3]] = llIIllIIIlIIlIl("XhobBQa3fdQ=", "notZa");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[8]] = llIIllIIIlIIIll("PyI9LjYeOio=", "wWOZb");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[5]] = llIIllIIIlIIIll("Ki01OzEbDC4iFhEsJiID", "bXGOs");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[6]] = llIIllIIIlIIlIl("q0NKxpzWbaxDMue+9S7d0A==", "ZUpBg");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[7]] = llIIllIIIlIIIll("CRUAJjM4AxomLwkaHDwvPA==", "HwsIA");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[14]] = llIIllIIIlIIlII("BP9/B9p5xaG+Wyj6SRBZYw==", "HbDNQ");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[15]] = llIIllIIIlIIIll("BRQ5JSchMisqNCcDPg==", "DwMLQ");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[16]] = llIIllIIIlIIIll("KQQWHxcYEgwfCykLCgULHA==", "hfepe");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[17]] = llIIllIIIlIIlIl("uCt8R6LAH8ySfIOKmlY9VA==", "HHwnq");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[18]] = llIIllIIIlIIIll("FRI9KwE2Ez08Gw==", "TfIYh");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[19]] = llIIllIIIlIIlII("iXmfkguOOrRjtj9ZGXG9Kw==", "KHmcN");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[20]] = llIIllIIIlIIlIl("sx0a+8Df00RLuel+/9WYbw==", "rDCLc");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[21]] = llIIllIIIlIIlIl("ZR7uoetmDVE=", "vSAcF");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[23]] = llIIllIIIlIIlIl("z/QeC3LglL0=", "IExVp");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[24]] = llIIllIIIlIIlII("i15sX+zm5Js=", "NMfqv");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[4]] = llIIllIIIlIIIll("PRoEIiAcAhM=", "uovVt");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[25]] = llIIllIIIlIIlIl("5Q++qdw2QoXEftcrYchQIQ==", "KpncE");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[26]] = llIIllIIIlIIlII("RBbSWPuE3JViFjLNaCZ97w==", "reNwK");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[30]] = llIIllIIIlIIlII("M4NZN30Jw0wOfKPM1fEYoQ==", "zDBgD");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[31]] = llIIllIIIlIIIll("NQYhKAwdBgMz", "QilGn");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[32]] = llIIllIIIlIIlII("7OTroI1lTpQIE6u22brIDStxaNxLYy4a", "INYzE");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[33]] = llIIllIIIlIIIll("HyccDl0WIwQfARkqXw8aHQ==", "xFqks");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[34]] = llIIllIIIlIIIll("KSM9KmYgJyU7Oi8ufic9PDZ+KSkiLn4tISk=", "NBPOH");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[35]] = llIIllIIIlIIlII("dTAkZx/GjWMuVu4Rc9+HE8lwvsQC3B2ZwY5fNwJiCf4=", "Nhevm");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[38]] = llIIllIIIlIIlIl("lTW35Kmxdv+dXWkR2nLEnw==", "hIjEQ");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[37]] = llIIllIIIlIIIll("PTkdDTUMMBYJOzw=", "OXsjP");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[39]] = llIIllIIIlIIlII("x5rvwxmtP6I=", "SVkvp");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[40]] = llIIllIIIlIIlIl("KzIApUsXlFc=", "AiLGp");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[41]] = llIIllIIIlIIlIl("5QjafSwTxek=", "hchra");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[42]] = llIIllIIIlIIlII("ur+DnuQLkmQ=", "oXYJf");
        EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[43]] = llIIllIIIlIIIll("KTE8KQ==", "YDOAp");
    }
    
    public void setHealth(final float lllllllllllllIIlllIIIIIIllIIllll) {
        this.dataWatcher.updateObject(EntityLivingBase.lIIlIIlIIlIIlI[8], MathHelper.clamp_float(lllllllllllllIIlllIIIIIIllIIllll, 0.0f, this.getMaxHealth()));
    }
    
    protected boolean isMovementBlocked() {
        if (llIIllIIIllIIll(llIIllIIlIIIlIl(this.getHealth(), 0.0f))) {
            return EntityLivingBase.lIIlIIlIIlIIlI[1] != 0;
        }
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    private static boolean llIIllIIIllIIIl(final int lllllllllllllIIllIlllllIIlIIlIIl, final int lllllllllllllIIllIlllllIIlIIlIII) {
        return lllllllllllllIIllIlllllIIlIIlIIl == lllllllllllllIIllIlllllIIlIIlIII;
    }
    
    protected void damageEntity(final DamageSource lllllllllllllIIllIllllllllllllII, float lllllllllllllIIllIlllllllllllIll) {
        if (llIIllIIIlIlIlI(this.isEntityInvulnerable(lllllllllllllIIllIllllllllllllII) ? 1 : 0)) {
            lllllllllllllIIllIlllllllllllIll = this.applyArmorCalculations(lllllllllllllIIllIllllllllllllII, lllllllllllllIIllIlllllllllllIll);
            final float lllllllllllllIIllIllllllllllllll;
            lllllllllllllIIllIlllllllllllIll = (lllllllllllllIIllIllllllllllllll = this.applyPotionDamageCalculations(lllllllllllllIIllIllllllllllllII, lllllllllllllIIllIlllllllllllIll));
            lllllllllllllIIllIlllllllllllIll = Math.max(lllllllllllllIIllIlllllllllllIll - this.getAbsorptionAmount(), 0.0f);
            this.setAbsorptionAmount(this.getAbsorptionAmount() - (lllllllllllllIIllIllllllllllllll - lllllllllllllIIllIlllllllllllIll));
            if (llIIllIIIlIllII(llIIllIIlIIIIll(lllllllllllllIIllIlllllllllllIll, 0.0f))) {
                final float lllllllllllllIIllIlllllllllllllI = this.getHealth();
                this.setHealth(lllllllllllllIIllIlllllllllllllI - lllllllllllllIIllIlllllllllllIll);
                this.getCombatTracker().trackDamage(lllllllllllllIIllIllllllllllllII, lllllllllllllIIllIlllllllllllllI, lllllllllllllIIllIlllllllllllIll);
                this.setAbsorptionAmount(this.getAbsorptionAmount() - lllllllllllllIIllIlllllllllllIll);
            }
        }
    }
    
    @Override
    public abstract ItemStack[] getInventory();
    
    public void setJumping(final boolean lllllllllllllIIllIlllllIllIllllI) {
        this.isJumping = lllllllllllllIIllIlllllIllIllllI;
    }
    
    private static boolean llIIllIIIlIlIll(final int lllllllllllllIIllIlllllIIIlIIIII) {
        return lllllllllllllIIllIlllllIIIlIIIII > 0;
    }
    
    @Override
    public void fall(final float lllllllllllllIIlllIIIIIIIlIllIll, final float lllllllllllllIIlllIIIIIIIlIllIlI) {
        super.fall(lllllllllllllIIlllIIIIIIIlIllIll, lllllllllllllIIlllIIIIIIIlIllIlI);
        final PotionEffect lllllllllllllIIlllIIIIIIIlIllIIl = this.getActivePotionEffect(Potion.jump);
        float n;
        if (llIIllIIIllIlII(lllllllllllllIIlllIIIIIIIlIllIIl)) {
            n = (float)(lllllllllllllIIlllIIIIIIIlIllIIl.getAmplifier() + EntityLivingBase.lIIlIIlIIlIIlI[1]);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            n = 0.0f;
        }
        final float lllllllllllllIIlllIIIIIIIlIllIII = n;
        final int lllllllllllllIIlllIIIIIIIlIlIlll = MathHelper.ceiling_float_int((lllllllllllllIIlllIIIIIIIlIllIll - 3.0f - lllllllllllllIIlllIIIIIIIlIllIII) * lllllllllllllIIlllIIIIIIIlIllIlI);
        if (llIIllIIIlIlIll(lllllllllllllIIlllIIIIIIIlIlIlll)) {
            this.playSound(this.getFallSoundString(lllllllllllllIIlllIIIIIIIlIlIlll), 1.0f, 1.0f);
            this.attackEntityFrom(DamageSource.fall, (float)lllllllllllllIIlllIIIIIIIlIlIlll);
            "".length();
            final int lllllllllllllIIlllIIIIIIIlIlIllI = MathHelper.floor_double(this.posX);
            final int lllllllllllllIIlllIIIIIIIlIlIlIl = MathHelper.floor_double(this.posY - 0.20000000298023224);
            final int lllllllllllllIIlllIIIIIIIlIlIlII = MathHelper.floor_double(this.posZ);
            final Block lllllllllllllIIlllIIIIIIIlIlIIll = this.worldObj.getBlockState(new BlockPos(lllllllllllllIIlllIIIIIIIlIlIllI, lllllllllllllIIlllIIIIIIIlIlIlIl, lllllllllllllIIlllIIIIIIIlIlIlII)).getBlock();
            if (llIIllIIIlIllIl(lllllllllllllIIlllIIIIIIIlIlIIll.getMaterial(), Material.air)) {
                final Block.SoundType lllllllllllllIIlllIIIIIIIlIlIIlI = lllllllllllllIIlllIIIIIIIlIlIIll.stepSound;
                this.playSound(lllllllllllllIIlllIIIIIIIlIlIIlI.getStepSound(), lllllllllllllIIlllIIIIIIIlIlIIlI.getVolume() * 0.5f, lllllllllllllIIlllIIIIIIIlIlIIlI.getFrequency() * 0.75f);
            }
        }
    }
    
    @Override
    public Vec3 getLook(final float lllllllllllllIIllIlllllIllIIIlIl) {
        if (llIIllIIIlIlIlI(llIIllIIlIIlllI(lllllllllllllIIllIlllllIllIIIlIl, 1.0f))) {
            return this.getVectorForRotation(this.rotationPitch, this.rotationYawHead);
        }
        final float lllllllllllllIIllIlllllIllIIIlII = this.prevRotationPitch + (this.rotationPitch - this.prevRotationPitch) * lllllllllllllIIllIlllllIllIIIlIl;
        final float lllllllllllllIIllIlllllIllIIIIll = this.prevRotationYawHead + (this.rotationYawHead - this.prevRotationYawHead) * lllllllllllllIIllIlllllIllIIIlIl;
        return this.getVectorForRotation(lllllllllllllIIllIlllllIllIIIlII, lllllllllllllIIllIlllllIllIIIIll);
    }
    
    private static boolean llIIllIIlIIIIlI(final int lllllllllllllIIllIlllllIIIllllIl, final int lllllllllllllIIllIlllllIIIllllII) {
        return lllllllllllllIIllIlllllIIIllllIl <= lllllllllllllIIllIlllllIIIllllII;
    }
    
    public IAttributeInstance getEntityAttribute(final IAttribute lllllllllllllIIllIllllllllIIlIlI) {
        return this.getAttributeMap().getAttributeInstance(lllllllllllllIIllIllllllllIIlIlI);
    }
    
    @Override
    public boolean canBeCollidedWith() {
        int n;
        if (llIIllIIIlIllII(this.isDead ? 1 : 0)) {
            n = EntityLivingBase.lIIlIIlIIlIIlI[0];
            "".length();
            if (null != null) {
                return ((99 + 27 - 77 + 198 ^ 59 + 63 + 60 + 5) & (0xF5 ^ 0xA8 ^ (0x45 ^ 0x54) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityLivingBase.lIIlIIlIIlIIlI[1];
        }
        return n != 0;
    }
    
    private static String llIIllIIIlIIIll(String lllllllllllllIIllIlllllIIllIlllI, final String lllllllllllllIIllIlllllIIlllIIlI) {
        lllllllllllllIIllIlllllIIllIlllI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIlllllIIllIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlllllIIlllIIIl = new StringBuilder();
        final char[] lllllllllllllIIllIlllllIIlllIIII = lllllllllllllIIllIlllllIIlllIIlI.toCharArray();
        int lllllllllllllIIllIlllllIIllIllll = EntityLivingBase.lIIlIIlIIlIIlI[0];
        final short lllllllllllllIIllIlllllIIllIlIIl = (Object)((String)lllllllllllllIIllIlllllIIllIlllI).toCharArray();
        final char lllllllllllllIIllIlllllIIllIlIII = (char)lllllllllllllIIllIlllllIIllIlIIl.length;
        float lllllllllllllIIllIlllllIIllIIlll = EntityLivingBase.lIIlIIlIIlIIlI[0];
        while (llIIllIIlIIIlII((int)lllllllllllllIIllIlllllIIllIIlll, lllllllllllllIIllIlllllIIllIlIII)) {
            final char lllllllllllllIIllIlllllIIlllIlII = lllllllllllllIIllIlllllIIllIlIIl[lllllllllllllIIllIlllllIIllIIlll];
            lllllllllllllIIllIlllllIIlllIIIl.append((char)(lllllllllllllIIllIlllllIIlllIlII ^ lllllllllllllIIllIlllllIIlllIIII[lllllllllllllIIllIlllllIIllIllll % lllllllllllllIIllIlllllIIlllIIII.length]));
            "".length();
            ++lllllllllllllIIllIlllllIIllIllll;
            ++lllllllllllllIIllIlllllIIllIIlll;
            "".length();
            if (" ".length() > " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlllllIIlllIIIl);
    }
    
    @Override
    public abstract void setCurrentItemOrArmor(final int p0, final ItemStack p1);
    
    private static boolean llIIllIIlIIIlII(final int lllllllllllllIIllIlllllIIlIIIIIl, final int lllllllllllllIIllIlllllIIlIIIIII) {
        return lllllllllllllIIllIlllllIIlIIIIIl < lllllllllllllIIllIlllllIIlIIIIII;
    }
    
    @Override
    public void performHurtAnimation() {
        final int n = EntityLivingBase.lIIlIIlIIlIIlI[14];
        this.maxHurtTime = n;
        this.hurtTime = n;
        this.attackedAtYaw = 0.0f;
    }
    
    protected int decreaseAirSupply(final int lllllllllllllIIlllIIIIIlllIIIlII) {
        final int lllllllllllllIIlllIIIIIlllIIIIll = EnchantmentHelper.getRespiration(this);
        int n;
        if (llIIllIIIlIlIll(lllllllllllllIIlllIIIIIlllIIIIll) && llIIllIIIlIlIll(this.rand.nextInt(lllllllllllllIIlllIIIIIlllIIIIll + EntityLivingBase.lIIlIIlIIlIIlI[1]))) {
            n = lllllllllllllIIlllIIIIIlllIIIlII;
            "".length();
            if (-(0x19 ^ 0x1D) > 0) {
                return (0x8D ^ 0xA3) & ~(0x5E ^ 0x70);
            }
        }
        else {
            n = lllllllllllllIIlllIIIIIlllIIIlII - EntityLivingBase.lIIlIIlIIlIIlI[1];
        }
        return n;
    }
    
    protected float applyPotionDamageCalculations(final DamageSource lllllllllllllIIlllIIIIIIIIIIllII, float lllllllllllllIIlllIIIIIIIIIIlIll) {
        if (llIIllIIIlIllII(lllllllllllllIIlllIIIIIIIIIIllII.isDamageAbsolute() ? 1 : 0)) {
            return (float)lllllllllllllIIlllIIIIIIIIIIlIll;
        }
        if (llIIllIIIlIllII(this.isPotionActive(Potion.resistance) ? 1 : 0) && llIIllIIIlIllIl(lllllllllllllIIlllIIIIIIIIIIllII, DamageSource.outOfWorld)) {
            final int lllllllllllllIIlllIIIIIIIIIlIIll = (this.getActivePotionEffect(Potion.resistance).getAmplifier() + EntityLivingBase.lIIlIIlIIlIIlI[1]) * EntityLivingBase.lIIlIIlIIlIIlI[3];
            final int lllllllllllllIIlllIIIIIIIIIlIIlI = EntityLivingBase.lIIlIIlIIlIIlI[32] - lllllllllllllIIlllIIIIIIIIIlIIll;
            final float lllllllllllllIIlllIIIIIIIIIlIIIl = (float)(lllllllllllllIIlllIIIIIIIIIIlIll * (float)lllllllllllllIIlllIIIIIIIIIlIIlI);
            lllllllllllllIIlllIIIIIIIIIIlIll = lllllllllllllIIlllIIIIIIIIIlIIIl / 25.0f;
        }
        if (llIIllIIIllIIll(llIIllIIlIIIIIl((float)lllllllllllllIIlllIIIIIIIIIIlIll, 0.0f))) {
            return 0.0f;
        }
        int lllllllllllllIIlllIIIIIIIIIlIIII = EnchantmentHelper.getEnchantmentModifierDamage(this.getInventory(), lllllllllllllIIlllIIIIIIIIIIllII);
        if (llIIllIIIllIlIl(lllllllllllllIIlllIIIIIIIIIlIIII, EntityLivingBase.lIIlIIlIIlIIlI[4])) {
            lllllllllllllIIlllIIIIIIIIIlIIII = EntityLivingBase.lIIlIIlIIlIIlI[4];
        }
        if (llIIllIIIlIlIll(lllllllllllllIIlllIIIIIIIIIlIIII) && llIIllIIlIIIIlI(lllllllllllllIIlllIIIIIIIIIlIIII, EntityLivingBase.lIIlIIlIIlIIlI[4])) {
            final int lllllllllllllIIlllIIIIIIIIIIllll = EntityLivingBase.lIIlIIlIIlIIlI[32] - lllllllllllllIIlllIIIIIIIIIlIIII;
            final float lllllllllllllIIlllIIIIIIIIIIlllI = (float)(lllllllllllllIIlllIIIIIIIIIIlIll * (float)lllllllllllllIIlllIIIIIIIIIIllll);
            lllllllllllllIIlllIIIIIIIIIIlIll = lllllllllllllIIlllIIIIIIIIIIlllI / 25.0f;
        }
        return (float)lllllllllllllIIlllIIIIIIIIIIlIll;
    }
    
    private int getArmSwingAnimationEnd() {
        int n;
        if (llIIllIIIlIllII(this.isPotionActive(Potion.digSpeed) ? 1 : 0)) {
            n = EntityLivingBase.lIIlIIlIIlIIlI[8] - (EntityLivingBase.lIIlIIlIIlIIlI[1] + this.getActivePotionEffect(Potion.digSpeed).getAmplifier()) * EntityLivingBase.lIIlIIlIIlIIlI[1];
            "".length();
            if (null != null) {
                return (0x81 ^ 0x99) & ~(0xA6 ^ 0xBE);
            }
        }
        else if (llIIllIIIlIllII(this.isPotionActive(Potion.digSlowdown) ? 1 : 0)) {
            n = EntityLivingBase.lIIlIIlIIlIIlI[8] + (EntityLivingBase.lIIlIIlIIlIIlI[1] + this.getActivePotionEffect(Potion.digSlowdown).getAmplifier()) * EntityLivingBase.lIIlIIlIIlIIlI[2];
            "".length();
            if (-"  ".length() > 0) {
                return (0xD7 ^ 0x85 ^ (0xF2 ^ 0xB5)) & (0x19 ^ 0x36 ^ (0x5D ^ 0x67) ^ -" ".length());
            }
        }
        else {
            n = EntityLivingBase.lIIlIIlIIlIIlI[8];
        }
        return n;
    }
    
    public final float getMaxHealth() {
        return (float)this.getEntityAttribute(SharedMonsterAttributes.maxHealth).getAttributeValue();
    }
    
    public float getSwingProgress(final float lllllllllllllIIllIlllllIlIlllIlI) {
        float lllllllllllllIIllIlllllIlIlllIIl = this.swingProgress - this.prevSwingProgress;
        if (llIIllIIIllIIII(llIIllIIlIIllll(lllllllllllllIIllIlllllIlIlllIIl, 0.0f))) {
            ++lllllllllllllIIllIlllllIlIlllIIl;
        }
        return this.prevSwingProgress + lllllllllllllIIllIlllllIlIlllIIl * lllllllllllllIIllIlllllIlIlllIlI;
    }
    
    public void sendEndCombat() {
    }
    
    @Override
    public float getRotationYawHead() {
        return this.rotationYawHead;
    }
    
    private static boolean llIIllIIIllIIlI(final int lllllllllllllIIllIlllllIIlIIIlIl, final int lllllllllllllIIllIlllllIIlIIIlII) {
        return lllllllllllllIIllIlllllIIlIIIlIl >= lllllllllllllIIllIlllllIIlIIIlII;
    }
    
    @Override
    public void func_181013_g(final float lllllllllllllIIllIlllllIlIIllIll) {
        this.renderYawOffset = lllllllllllllIIllIlllllIlIIllIll;
    }
    
    private static boolean llIIllIIIlIllIl(final Object lllllllllllllIIllIlllllIIIllIlIl, final Object lllllllllllllIIllIlllllIIIllIlII) {
        return lllllllllllllIIllIlllllIIIllIlIl != lllllllllllllIIllIlllllIIIllIlII;
    }
    
    private static int llIIllIIIlIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void moveEntityWithHeading(final float lllllllllllllIIllIllllllIllllIll, final float lllllllllllllIIllIllllllIllllIlI) {
        if (llIIllIIIlIllII(this.isServerWorld() ? 1 : 0)) {
            if (!llIIllIIIlIllII(this.isInWater() ? 1 : 0) || (llIIllIIIlIllII((this instanceof EntityPlayer) ? 1 : 0) && llIIllIIIlIllII(((EntityPlayer)this).capabilities.isFlying ? 1 : 0))) {
                if (!llIIllIIIlIllII(this.isInLava() ? 1 : 0) || (llIIllIIIlIllII((this instanceof EntityPlayer) ? 1 : 0) && llIIllIIIlIllII(((EntityPlayer)this).capabilities.isFlying ? 1 : 0))) {
                    float lllllllllllllIIllIllllllIllllIIl = 0.91f;
                    if (llIIllIIIlIllII(this.onGround ? 1 : 0)) {
                        lllllllllllllIIllIllllllIllllIIl = this.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.getEntityBoundingBox().minY) - EntityLivingBase.lIIlIIlIIlIIlI[1], MathHelper.floor_double(this.posZ))).getBlock().slipperiness * 0.91f;
                    }
                    final float lllllllllllllIIllIllllllIllllIII = 0.16277136f / (lllllllllllllIIllIllllllIllllIIl * lllllllllllllIIllIllllllIllllIIl * lllllllllllllIIllIllllllIllllIIl);
                    float lllllllllllllIIllIllllllIlllIllI = 0.0f;
                    if (llIIllIIIlIllII(this.onGround ? 1 : 0)) {
                        final float lllllllllllllIIllIllllllIlllIlll = this.getAIMoveSpeed() * lllllllllllllIIllIllllllIllllIII;
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIllIllllllIlllIllI = this.jumpMovementFactor;
                    }
                    this.moveFlying(lllllllllllllIIllIllllllIllllIll, lllllllllllllIIllIllllllIllllIlI, lllllllllllllIIllIllllllIlllIllI);
                    lllllllllllllIIllIllllllIllllIIl = 0.91f;
                    if (llIIllIIIlIllII(this.onGround ? 1 : 0)) {
                        lllllllllllllIIllIllllllIllllIIl = this.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.getEntityBoundingBox().minY) - EntityLivingBase.lIIlIIlIIlIIlI[1], MathHelper.floor_double(this.posZ))).getBlock().slipperiness * 0.91f;
                    }
                    if (llIIllIIIlIllII(this.isOnLadder() ? 1 : 0)) {
                        final float lllllllllllllIIllIllllllIlllIlIl = 0.15f;
                        this.motionX = MathHelper.clamp_double(this.motionX, -lllllllllllllIIllIllllllIlllIlIl, lllllllllllllIIllIllllllIlllIlIl);
                        this.motionZ = MathHelper.clamp_double(this.motionZ, -lllllllllllllIIllIllllllIlllIlIl, lllllllllllllIIllIllllllIlllIlIl);
                        this.fallDistance = 0.0f;
                        if (llIIllIIIllIIII(llIIllIIlIIIllI(this.motionY, -0.15))) {
                            this.motionY = -0.15;
                        }
                        int n;
                        if (llIIllIIIlIllII(this.isSneaking() ? 1 : 0) && llIIllIIIlIllII((this instanceof EntityPlayer) ? 1 : 0)) {
                            n = EntityLivingBase.lIIlIIlIIlIIlI[1];
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            n = EntityLivingBase.lIIlIIlIIlIIlI[0];
                        }
                        final boolean lllllllllllllIIllIllllllIlllIlII = n != 0;
                        if (llIIllIIIlIllII(lllllllllllllIIllIllllllIlllIlII ? 1 : 0) && llIIllIIIllIIII(llIIllIIlIIIllI(this.motionY, 0.0))) {
                            this.motionY = 0.0;
                        }
                    }
                    this.moveEntity(this.motionX, this.motionY, this.motionZ);
                    if (llIIllIIIlIllII(this.isCollidedHorizontally ? 1 : 0) && llIIllIIIlIllII(this.isOnLadder() ? 1 : 0)) {
                        this.motionY = 0.2;
                    }
                    if (llIIllIIIlIllII(this.worldObj.isRemote ? 1 : 0) && (!llIIllIIIlIllII(this.worldObj.isBlockLoaded(new BlockPos((int)this.posX, EntityLivingBase.lIIlIIlIIlIIlI[0], (int)this.posZ)) ? 1 : 0) || llIIllIIIlIlIlI(this.worldObj.getChunkFromBlockCoords(new BlockPos((int)this.posX, EntityLivingBase.lIIlIIlIIlIIlI[0], (int)this.posZ)).isLoaded() ? 1 : 0))) {
                        if (llIIllIIIlIlIll(llIIllIIlIIIlll(this.posY, 0.0))) {
                            this.motionY = -0.1;
                            "".length();
                            if ((((0xF9 ^ 0xB0) & ~(0x54 ^ 0x1D)) ^ (0xA8 ^ 0xAC)) <= 0) {
                                return;
                            }
                        }
                        else {
                            this.motionY = 0.0;
                            "".length();
                            if (" ".length() > " ".length()) {
                                return;
                            }
                        }
                    }
                    else {
                        this.motionY -= 0.08;
                    }
                    this.motionY *= 0.9800000190734863;
                    this.motionX *= lllllllllllllIIllIllllllIllllIIl;
                    this.motionZ *= lllllllllllllIIllIllllllIllllIIl;
                    "".length();
                    if ("  ".length() < " ".length()) {
                        return;
                    }
                }
                else {
                    final double lllllllllllllIIllIllllllIlllIIll = this.posY;
                    this.moveFlying(lllllllllllllIIllIllllllIllllIll, lllllllllllllIIllIllllllIllllIlI, 0.02f);
                    this.moveEntity(this.motionX, this.motionY, this.motionZ);
                    this.motionX *= 0.5;
                    this.motionY *= 0.5;
                    this.motionZ *= 0.5;
                    this.motionY -= 0.02;
                    if (llIIllIIIlIllII(this.isCollidedHorizontally ? 1 : 0) && llIIllIIIlIllII(this.isOffsetPositionInLiquid(this.motionX, this.motionY + 0.6000000238418579 - this.posY + lllllllllllllIIllIllllllIlllIIll, this.motionZ) ? 1 : 0)) {
                        this.motionY = 0.30000001192092896;
                        "".length();
                        if ((0x73 ^ 0x77 ^ ((0x6E ^ 0x3F) & ~(0xC9 ^ 0x98))) == " ".length()) {
                            return;
                        }
                    }
                }
            }
            else {
                final double lllllllllllllIIllIllllllIlllIIlI = this.posY;
                float lllllllllllllIIllIllllllIlllIIIl = 0.8f;
                float lllllllllllllIIllIllllllIlllIIII = 0.02f;
                float lllllllllllllIIllIllllllIllIllll = (float)EnchantmentHelper.getDepthStriderModifier(this);
                if (llIIllIIIlIlIll(llIIllIIlIIlIII(lllllllllllllIIllIllllllIllIllll, 3.0f))) {
                    lllllllllllllIIllIllllllIllIllll = 3.0f;
                }
                if (llIIllIIIlIlIlI(this.onGround ? 1 : 0)) {
                    lllllllllllllIIllIllllllIllIllll *= 0.5f;
                }
                if (llIIllIIIlIlIll(llIIllIIlIIlIII(lllllllllllllIIllIllllllIllIllll, 0.0f))) {
                    lllllllllllllIIllIllllllIlllIIIl += (0.54600006f - lllllllllllllIIllIllllllIlllIIIl) * lllllllllllllIIllIllllllIllIllll / 3.0f;
                    lllllllllllllIIllIllllllIlllIIII += (this.getAIMoveSpeed() * 1.0f - lllllllllllllIIllIllllllIlllIIII) * lllllllllllllIIllIllllllIllIllll / 3.0f;
                }
                this.moveFlying(lllllllllllllIIllIllllllIllllIll, lllllllllllllIIllIllllllIllllIlI, lllllllllllllIIllIllllllIlllIIII);
                this.moveEntity(this.motionX, this.motionY, this.motionZ);
                this.motionX *= lllllllllllllIIllIllllllIlllIIIl;
                this.motionY *= 0.800000011920929;
                this.motionZ *= lllllllllllllIIllIllllllIlllIIIl;
                this.motionY -= 0.02;
                if (llIIllIIIlIllII(this.isCollidedHorizontally ? 1 : 0) && llIIllIIIlIllII(this.isOffsetPositionInLiquid(this.motionX, this.motionY + 0.6000000238418579 - this.posY + lllllllllllllIIllIllllllIlllIIlI, this.motionZ) ? 1 : 0)) {
                    this.motionY = 0.30000001192092896;
                }
            }
        }
        this.prevLimbSwingAmount = this.limbSwingAmount;
        final double lllllllllllllIIllIllllllIllIlllI = this.posX - this.prevPosX;
        final double lllllllllllllIIllIllllllIllIllIl = this.posZ - this.prevPosZ;
        float lllllllllllllIIllIllllllIllIllII = MathHelper.sqrt_double(lllllllllllllIIllIllllllIllIlllI * lllllllllllllIIllIllllllIllIlllI + lllllllllllllIIllIllllllIllIllIl * lllllllllllllIIllIllllllIllIllIl) * 4.0f;
        if (llIIllIIIlIlIll(llIIllIIlIIlIII(lllllllllllllIIllIllllllIllIllII, 1.0f))) {
            lllllllllllllIIllIllllllIllIllII = 1.0f;
        }
        this.limbSwingAmount += (lllllllllllllIIllIllllllIllIllII - this.limbSwingAmount) * 0.4f;
        this.limbSwing += this.limbSwingAmount;
    }
    
    private static boolean llIIllIIIllIlll(final Object lllllllllllllIIllIlllllIIIlIllll, final Object lllllllllllllIIllIlllllIIIlIlllI) {
        return lllllllllllllIIllIlllllIIIlIllll == lllllllllllllIIllIlllllIIIlIlllI;
    }
    
    private static int llIIllIIIlllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void llIIllIIIlIIlll() {
        (lIIlIIlIIlIIlI = new int[45])[0] = ((0x3 ^ 0x41 ^ (0x4A ^ 0x4C)) & (12 + 140 - 93 + 186 ^ 159 + 65 - 146 + 99 ^ -" ".length()));
        EntityLivingBase.lIIlIIlIIlIIlI[1] = " ".length();
        EntityLivingBase.lIIlIIlIIlIIlI[2] = "  ".length();
        EntityLivingBase.lIIlIIlIIlIIlI[3] = (0x28 ^ 0x2D);
        EntityLivingBase.lIIlIIlIIlIIlI[4] = (0xF1 ^ 0xC7 ^ (0x15 ^ 0x37));
        EntityLivingBase.lIIlIIlIIlIIlI[5] = (0x9C ^ 0x9B);
        EntityLivingBase.lIIlIIlIIlIIlI[6] = (0x19 ^ 0x11);
        EntityLivingBase.lIIlIIlIIlIIlI[7] = (0x48 ^ 0x41);
        EntityLivingBase.lIIlIIlIIlIIlI[8] = ("  ".length() ^ (0x47 ^ 0x43));
        EntityLivingBase.lIIlIIlIIlIIlI[9] = -(0x8B ^ 0xBA ^ (0x5E ^ 0x7B));
        EntityLivingBase.lIIlIIlIIlIIlI[10] = (-(0xFFFFFB4B & 0x16B6) & (0xFFFFBB2D & 0x57FF));
        EntityLivingBase.lIIlIIlIIlIIlI[11] = (0x38 ^ 0x66 ^ (0xFC ^ 0xC6));
        EntityLivingBase.lIIlIIlIIlIIlI[12] = "   ".length();
        EntityLivingBase.lIIlIIlIIlIIlI[13] = (0x73 ^ 0x77);
        EntityLivingBase.lIIlIIlIIlIIlI[14] = (0xC8 ^ 0xC2);
        EntityLivingBase.lIIlIIlIIlIIlI[15] = (13 + 84 + 24 + 46 ^ 70 + 155 - 118 + 65);
        EntityLivingBase.lIIlIIlIIlIIlI[16] = (0x6B ^ 0x55 ^ (0x7E ^ 0x4C));
        EntityLivingBase.lIIlIIlIIlIIlI[17] = (0xBE ^ 0xB3);
        EntityLivingBase.lIIlIIlIIlIIlI[18] = (0xA5 ^ 0xAB);
        EntityLivingBase.lIIlIIlIIlIIlI[19] = (0x3B ^ 0x34);
        EntityLivingBase.lIIlIIlIIlIIlI[20] = (0x44 ^ 0x54);
        EntityLivingBase.lIIlIIlIIlIIlI[21] = (0x3D ^ 0x2C);
        EntityLivingBase.lIIlIIlIIlIIlI[22] = (0x47 ^ 0x24);
        EntityLivingBase.lIIlIIlIIlIIlI[23] = (0xDA ^ 0xBE ^ (0x7D ^ 0xB));
        EntityLivingBase.lIIlIIlIIlIIlI[24] = (0x77 ^ 0x64);
        EntityLivingBase.lIIlIIlIIlIIlI[25] = (0x8C ^ 0x99);
        EntityLivingBase.lIIlIIlIIlIIlI[26] = (0xA0 ^ 0xB6);
        EntityLivingBase.lIIlIIlIIlIIlI[27] = (-(0xFFFFF707 & 0x2DFF) & (0xFFFFAFDE & 0x777F));
        EntityLivingBase.lIIlIIlIIlIIlI[28] = 86 + 207 - 179 + 141;
        EntityLivingBase.lIIlIIlIIlIIlI[29] = (0xFA ^ 0xC3) + (0x72 ^ 0x4) - (1 + 120 - 37 + 66) + (151 + 71 - 164 + 97);
        EntityLivingBase.lIIlIIlIIlIIlI[30] = (0x7B ^ 0x5A ^ (0x2F ^ 0x19));
        EntityLivingBase.lIIlIIlIIlIIlI[31] = (0x8E ^ 0x96);
        EntityLivingBase.lIIlIIlIIlIIlI[32] = (0x8A ^ 0x93);
        EntityLivingBase.lIIlIIlIIlIIlI[33] = (116 + 114 - 69 + 2 ^ 162 + 127 - 280 + 176);
        EntityLivingBase.lIIlIIlIIlIIlI[34] = (0xC8 ^ 0x94 ^ (0x3A ^ 0x7D));
        EntityLivingBase.lIIlIIlIIlIIlI[35] = (102 + 20 - 97 + 106 ^ 76 + 64 - 79 + 98);
        EntityLivingBase.lIIlIIlIIlIIlI[36] = -" ".length();
        EntityLivingBase.lIIlIIlIIlIIlI[37] = (0x27 ^ 0x39);
        EntityLivingBase.lIIlIIlIIlIIlI[38] = (0x94 ^ 0x89);
        EntityLivingBase.lIIlIIlIIlIIlI[39] = (70 + 195 - 137 + 93 ^ 64 + 127 - 142 + 145);
        EntityLivingBase.lIIlIIlIIlIIlI[40] = (0xA7 ^ 0x87);
        EntityLivingBase.lIIlIIlIIlIIlI[41] = (0x6D ^ 0x4C);
        EntityLivingBase.lIIlIIlIIlIIlI[42] = (115 + 162 - 189 + 80 ^ 82 + 117 - 167 + 106);
        EntityLivingBase.lIIlIIlIIlIIlI[43] = (0x2F ^ 0xC);
        EntityLivingBase.lIIlIIlIIlIIlI[44] = (0x8F ^ 0xAB);
    }
    
    protected void dropEquipment(final boolean lllllllllllllIIlllIIIIIIlIIlIIlI, final int lllllllllllllIIlllIIIIIIlIIlIIIl) {
    }
    
    @Override
    public void setRotationYawHead(final float lllllllllllllIIllIlllllIlIlIIIll) {
        this.rotationYawHead = lllllllllllllIIllIlllllIlIlIIIll;
    }
    
    public float getAIMoveSpeed() {
        return this.landMovementFactor;
    }
    
    public boolean isEntityUndead() {
        if (llIIllIIIllIlll(this.getCreatureAttribute(), EnumCreatureAttribute.UNDEAD)) {
            return EntityLivingBase.lIIlIIlIIlIIlI[1] != 0;
        }
        return EntityLivingBase.lIIlIIlIIlIIlI[0] != 0;
    }
    
    @Override
    public void setPositionAndRotation2(final double lllllllllllllIIllIlllllIlllIlIIl, final double lllllllllllllIIllIlllllIlllIlIII, final double lllllllllllllIIllIlllllIlllIIlll, final float lllllllllllllIIllIlllllIlllIlllI, final float lllllllllllllIIllIlllllIlllIllIl, final int lllllllllllllIIllIlllllIlllIllII, final boolean lllllllllllllIIllIlllllIlllIlIll) {
        this.newPosX = lllllllllllllIIllIlllllIlllIlIIl;
        this.newPosY = lllllllllllllIIllIlllllIlllIlIII;
        this.newPosZ = lllllllllllllIIllIlllllIlllIIlll;
        this.newRotationYaw = lllllllllllllIIllIlllllIlllIlllI;
        this.newRotationPitch = lllllllllllllIIllIlllllIlllIllIl;
        this.newPosRotationIncrements = lllllllllllllIIllIlllllIlllIllII;
    }
    
    private static int llIIllIIlIIIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void setAbsorptionAmount(float lllllllllllllIIllIlllllIlIIlIIlI) {
        if (llIIllIIIllIIII(llIIllIIlIlIIIl(lllllllllllllIIllIlllllIlIIlIIlI, 0.0f))) {
            lllllllllllllIIllIlllllIlIIlIIlI = 0.0f;
        }
        this.absorptionAmount = lllllllllllllIIllIlllllIlIIlIIlI;
    }
    
    private static int llIIllIIlIIlIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void onLivingUpdate() {
        if (llIIllIIIlIlIll(this.jumpTicks)) {
            this.jumpTicks -= EntityLivingBase.lIIlIIlIIlIIlI[1];
        }
        if (llIIllIIIlIlIll(this.newPosRotationIncrements)) {
            final double lllllllllllllIIllIllllllIIIllllI = this.posX + (this.newPosX - this.posX) / this.newPosRotationIncrements;
            final double lllllllllllllIIllIllllllIIIlllIl = this.posY + (this.newPosY - this.posY) / this.newPosRotationIncrements;
            final double lllllllllllllIIllIllllllIIIlllII = this.posZ + (this.newPosZ - this.posZ) / this.newPosRotationIncrements;
            final double lllllllllllllIIllIllllllIIIllIll = MathHelper.wrapAngleTo180_double(this.newRotationYaw - this.rotationYaw);
            this.rotationYaw += (float)(lllllllllllllIIllIllllllIIIllIll / this.newPosRotationIncrements);
            this.rotationPitch += (float)((this.newRotationPitch - this.rotationPitch) / this.newPosRotationIncrements);
            this.newPosRotationIncrements -= EntityLivingBase.lIIlIIlIIlIIlI[1];
            this.setPosition(lllllllllllllIIllIllllllIIIllllI, lllllllllllllIIllIllllllIIIlllIl, lllllllllllllIIllIllllllIIIlllII);
            this.setRotation(this.rotationYaw, this.rotationPitch);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else if (llIIllIIIlIlIlI(this.isServerWorld() ? 1 : 0)) {
            this.motionX *= 0.98;
            this.motionY *= 0.98;
            this.motionZ *= 0.98;
        }
        if (llIIllIIIllIIII(llIIllIIlIIllIl(Math.abs(this.motionX), 0.005))) {
            this.motionX = 0.0;
        }
        if (llIIllIIIllIIII(llIIllIIlIIllIl(Math.abs(this.motionY), 0.005))) {
            this.motionY = 0.0;
        }
        if (llIIllIIIllIIII(llIIllIIlIIllIl(Math.abs(this.motionZ), 0.005))) {
            this.motionZ = 0.0;
        }
        this.worldObj.theProfiler.startSection(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[39]]);
        if (llIIllIIIlIllII(this.isMovementBlocked() ? 1 : 0)) {
            this.isJumping = (EntityLivingBase.lIIlIIlIIlIIlI[0] != 0);
            this.moveStrafing = 0.0f;
            this.moveForward = 0.0f;
            this.randomYawVelocity = 0.0f;
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else if (llIIllIIIlIllII(this.isServerWorld() ? 1 : 0)) {
            this.worldObj.theProfiler.startSection(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[40]]);
            this.updateEntityActionState();
            this.worldObj.theProfiler.endSection();
        }
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[41]]);
        if (llIIllIIIlIllII(this.isJumping ? 1 : 0)) {
            if (llIIllIIIlIllII(this.isInWater() ? 1 : 0)) {
                this.updateAITick();
                "".length();
                if ((0xAC ^ 0xA8) < " ".length()) {
                    return;
                }
            }
            else if (llIIllIIIlIllII(this.isInLava() ? 1 : 0)) {
                this.handleJumpLava();
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            else if (llIIllIIIlIllII(this.onGround ? 1 : 0) && llIIllIIIlIlIlI(this.jumpTicks)) {
                this.jump();
                this.jumpTicks = EntityLivingBase.lIIlIIlIIlIIlI[14];
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
        else {
            this.jumpTicks = EntityLivingBase.lIIlIIlIIlIIlI[0];
        }
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[42]]);
        this.moveStrafing *= 0.98f;
        this.moveForward *= 0.98f;
        this.randomYawVelocity *= 0.9f;
        this.moveEntityWithHeading(this.moveStrafing, this.moveForward);
        this.worldObj.theProfiler.endSection();
        this.worldObj.theProfiler.startSection(EntityLivingBase.lIIlIIlIIlIIIl[EntityLivingBase.lIIlIIlIIlIIlI[43]]);
        if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0)) {
            this.collideWithNearbyEntities();
        }
        this.worldObj.theProfiler.endSection();
    }
    
    public abstract ItemStack getEquipmentInSlot(final int p0);
    
    private static int llIIllIIlIIllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    protected void updateEntityActionState() {
    }
    
    @Override
    protected void updateFallState(final double lllllllllllllIIlllIIIIlIIIIIIlll, final boolean lllllllllllllIIlllIIIIlIIIIIIllI, final Block lllllllllllllIIlllIIIIIllllllIll, final BlockPos lllllllllllllIIlllIIIIIllllllIlI) {
        if (llIIllIIIlIlIlI(this.isInWater() ? 1 : 0)) {
            this.handleWaterMovement();
            "".length();
        }
        if (llIIllIIIlIlIlI(this.worldObj.isRemote ? 1 : 0) && llIIllIIIlIlIll(llIIllIIIlIlIII(this.fallDistance, 3.0f)) && llIIllIIIlIllII(lllllllllllllIIlllIIIIlIIIIIIllI ? 1 : 0)) {
            final IBlockState lllllllllllllIIlllIIIIlIIIIIIIll = this.worldObj.getBlockState(lllllllllllllIIlllIIIIIllllllIlI);
            final Block lllllllllllllIIlllIIIIlIIIIIIIlI = lllllllllllllIIlllIIIIlIIIIIIIll.getBlock();
            final float lllllllllllllIIlllIIIIlIIIIIIIIl = (float)MathHelper.ceiling_float_int(this.fallDistance - 3.0f);
            if (llIIllIIIlIllIl(lllllllllllllIIlllIIIIlIIIIIIIlI.getMaterial(), Material.air)) {
                double lllllllllllllIIlllIIIIlIIIIIIIII = Math.min(0.2f + lllllllllllllIIlllIIIIlIIIIIIIIl / 15.0f, 10.0f);
                if (llIIllIIIlIlIll(llIIllIIIlIlIIl(lllllllllllllIIlllIIIIlIIIIIIIII, 2.5))) {
                    lllllllllllllIIlllIIIIlIIIIIIIII = 2.5;
                }
                final int lllllllllllllIIlllIIIIIlllllllll = (int)(150.0 * lllllllllllllIIlllIIIIlIIIIIIIII);
                final WorldServer worldServer = (WorldServer)this.worldObj;
                final EnumParticleTypes block_DUST = EnumParticleTypes.BLOCK_DUST;
                final double posX = this.posX;
                final double posY = this.posY;
                final double posZ = this.posZ;
                final int lllllllllllllIIIllllIlIIIlIIIIIl = lllllllllllllIIlllIIIIIlllllllll;
                final double lllllllllllllIIIllllIlIIIlIIllII = 0.0;
                final double lllllllllllllIIIllllIlIIIIllllll = 0.0;
                final double lllllllllllllIIIllllIlIIIlIIlIlI = 0.0;
                final double lllllllllllllIIIllllIlIIIIllllIl = 0.15000000596046448;
                final int[] lllllllllllllIIIllllIlIIIlIIIlIl = new int[EntityLivingBase.lIIlIIlIIlIIlI[1]];
                lllllllllllllIIIllllIlIIIlIIIlIl[EntityLivingBase.lIIlIIlIIlIIlI[0]] = Block.getStateId(lllllllllllllIIlllIIIIlIIIIIIIll);
                worldServer.spawnParticle(block_DUST, posX, posY, posZ, lllllllllllllIIIllllIlIIIlIIIIIl, lllllllllllllIIIllllIlIIIlIIllII, lllllllllllllIIIllllIlIIIIllllll, lllllllllllllIIIllllIlIIIlIIlIlI, lllllllllllllIIIllllIlIIIIllllIl, lllllllllllllIIIllllIlIIIlIIIlIl);
            }
        }
        super.updateFallState(lllllllllllllIIlllIIIIlIIIIIIlll, lllllllllllllIIlllIIIIlIIIIIIllI, lllllllllllllIIlllIIIIIllllllIll, lllllllllllllIIlllIIIIIllllllIlI);
    }
    
    public boolean isPotionActive(final Potion lllllllllllllIIlllIIIIIlIIlIIllI) {
        return this.activePotionsMap.containsKey(lllllllllllllIIlllIIIIIlIIlIIllI.id);
    }
}
