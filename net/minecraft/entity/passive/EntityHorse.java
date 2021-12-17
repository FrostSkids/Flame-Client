// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import java.util.Iterator;
import net.minecraft.potion.Potion;
import net.minecraft.nbt.NBTBase;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.util.StatCollector;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.material.Material;
import net.minecraft.entity.ai.attributes.RangedAttribute;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.block.Block;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.server.management.PreYggdrasilConverter;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIRunAroundLikeCrazy;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;
import com.google.common.base.Predicate;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.AnimalChest;
import net.minecraft.inventory.IInvBasic;

public class EntityHorse extends EntityAnimal implements IInvBasic
{
    private /* synthetic */ AnimalChest horseChest;
    private /* synthetic */ boolean field_175508_bO;
    private static final /* synthetic */ String[] HORSE_ARMOR_TEXTURES_ABBR;
    private /* synthetic */ int jumpRearingCounter;
    private static final /* synthetic */ String[] horseTextures;
    private /* synthetic */ float prevMouthOpenness;
    private /* synthetic */ String texturePrefix;
    private /* synthetic */ int gallopTime;
    private static final /* synthetic */ int[] armorValues;
    private static final /* synthetic */ String[] horseMarkingTextures;
    private /* synthetic */ float prevHeadLean;
    private static final /* synthetic */ String[] HORSE_MARKING_TEXTURES_ABBR;
    private static final /* synthetic */ String[] HORSE_TEXTURES_ABBR;
    private /* synthetic */ int openMouthCounter;
    private static final /* synthetic */ String[] horseArmorTextures;
    protected /* synthetic */ boolean horseJumping;
    protected /* synthetic */ int temper;
    protected /* synthetic */ float jumpPower;
    private /* synthetic */ float headLean;
    public /* synthetic */ int field_110279_bq;
    private static final /* synthetic */ String[] lIIIlllIIIIlII;
    private /* synthetic */ float rearingAmount;
    private /* synthetic */ float mouthOpenness;
    private /* synthetic */ float prevRearingAmount;
    private /* synthetic */ String[] horseTexturesArray;
    private static final /* synthetic */ int[] lIIIlllIIlIlIl;
    private /* synthetic */ int eatingHaystackCounter;
    private static final /* synthetic */ IAttribute horseJumpStrength;
    private /* synthetic */ boolean field_110294_bI;
    private static final /* synthetic */ Predicate<Entity> horseBreedingSelector;
    private /* synthetic */ boolean hasReproduced;
    public /* synthetic */ int field_110278_bp;
    
    public void makeHorseRearWithSound() {
        this.makeHorseRear();
        final String lllllllllllllIIlllllIlIIllIlIIII = this.getAngrySoundName();
        if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIIllIlIIII)) {
            this.playSound(lllllllllllllIIlllllIlIIllIlIIII, this.getSoundVolume(), this.getSoundPitch());
        }
    }
    
    @Override
    public int getTotalArmorValue() {
        return EntityHorse.armorValues[this.getHorseArmorIndexSynced()];
    }
    
    @Override
    public int getTalkInterval() {
        return EntityHorse.lIIIlllIIlIlIl[66];
    }
    
    @Override
    protected String getHurtSound() {
        this.openHorseMouth();
        if (llIIIllIIIIIIIl(this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[4]))) {
            this.makeHorseRear();
        }
        final int lllllllllllllIIlllllIlIllIlIllIl = this.getHorseType();
        String s;
        if (llIIIllIIIIlllI(lllllllllllllIIlllllIlIllIlIllIl, EntityHorse.lIIIlllIIlIlIl[4])) {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[50]];
            "".length();
            if ("  ".length() <= " ".length()) {
                return null;
            }
        }
        else if (llIIIllIIIIlllI(lllllllllllllIIlllllIlIllIlIllIl, EntityHorse.lIIIlllIIlIlIl[2])) {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[51]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIlIllIl, EntityHorse.lIIIlllIIlIlIl[1]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIlIllIl, EntityHorse.lIIIlllIIlIlIl[3])) {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[52]];
            "".length();
            if ((("  ".length() ^ (0x75 ^ 0x68)) & (0x15 ^ 0x31 ^ (0x89 ^ 0xB2) ^ -" ".length())) != ((0x10 ^ 0x48 ^ (0xF5 ^ 0xA4)) & (0xC0 ^ 0x98 ^ (0x5D ^ 0xC) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[53]];
        }
        return s;
    }
    
    public boolean isEatingHaystack() {
        return this.getHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[32]);
    }
    
    private static boolean llIIIllIIIIllIl(final int lllllllllllllIIlllllIIllIlIIIIII) {
        return lllllllllllllIIlllllIIllIlIIIIII < 0;
    }
    
    private static String llIIIlIllIIllll(String lllllllllllllIIlllllIIllIlllllIl, final String lllllllllllllIIlllllIIllIlllllII) {
        lllllllllllllIIlllllIIllIlllllIl = new String(Base64.getDecoder().decode(lllllllllllllIIlllllIIllIlllllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllllIIlllIIIIIII = new StringBuilder();
        final char[] lllllllllllllIIlllllIIllIlllllll = lllllllllllllIIlllllIIllIlllllII.toCharArray();
        int lllllllllllllIIlllllIIllIllllllI = EntityHorse.lIIIlllIIlIlIl[0];
        final long lllllllllllllIIlllllIIllIllllIII = (Object)lllllllllllllIIlllllIIllIlllllIl.toCharArray();
        final long lllllllllllllIIlllllIIllIlllIlll = lllllllllllllIIlllllIIllIllllIII.length;
        Exception lllllllllllllIIlllllIIllIlllIllI = (Exception)EntityHorse.lIIIlllIIlIlIl[0];
        while (llIIIllIIIlIllI((int)lllllllllllllIIlllllIIllIlllIllI, (int)lllllllllllllIIlllllIIllIlllIlll)) {
            final char lllllllllllllIIlllllIIlllIIIIIll = lllllllllllllIIlllllIIllIllllIII[lllllllllllllIIlllllIIllIlllIllI];
            lllllllllllllIIlllllIIlllIIIIIII.append((char)(lllllllllllllIIlllllIIlllIIIIIll ^ lllllllllllllIIlllllIIllIlllllll[lllllllllllllIIlllllIIllIllllllI % lllllllllllllIIlllllIIllIlllllll.length]));
            "".length();
            ++lllllllllllllIIlllllIIllIllllllI;
            ++lllllllllllllIIlllllIIllIlllIllI;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllllIIlllIIIIIII);
    }
    
    private static boolean llIIIllIIIIlllI(final int lllllllllllllIIlllllIIllIllIIlIl, final int lllllllllllllIIlllllIIllIllIIlII) {
        return lllllllllllllIIlllllIIllIllIIlIl == lllllllllllllIIlllllIIllIllIIlII;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIlllllIllIIIlIlIII, final float lllllllllllllIIlllllIllIIIlIlIll) {
        final Entity lllllllllllllIIlllllIllIIIlIlIlI = lllllllllllllIIlllllIllIIIlIlIII.getEntity();
        int attackEntity;
        if (llIIIllIIIIIllI(this.riddenByEntity) && llIIIllIIIIIIII(this.riddenByEntity.equals(lllllllllllllIIlllllIllIIIlIlIlI) ? 1 : 0)) {
            attackEntity = EntityHorse.lIIIlllIIlIlIl[0];
            "".length();
            if (((0x9B ^ 0xC6) & ~(0x6E ^ 0x33)) >= "  ".length()) {
                return ((0x5E ^ 0x79) & ~(0x1C ^ 0x3B)) != 0x0;
            }
        }
        else {
            attackEntity = (super.attackEntityFrom(lllllllllllllIIlllllIllIIIlIlIII, lllllllllllllIIlllllIllIIIlIlIll) ? 1 : 0);
        }
        return attackEntity != 0;
    }
    
    private static boolean llIIIllIIIlIIlI(final int lllllllllllllIIlllllIIllIIlllllI) {
        return lllllllllllllIIlllllIIllIIlllllI <= 0;
    }
    
    public float getRearingAmount(final float lllllllllllllIIlllllIlIIIIlIIIII) {
        return this.prevRearingAmount + (this.rearingAmount - this.prevRearingAmount) * lllllllllllllIIlllllIlIIIIlIIIII;
    }
    
    public boolean isTame() {
        return this.getHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[3]);
    }
    
    private void dropItemsInChest(final Entity lllllllllllllIIlllllIlIIllIIIlIl, final AnimalChest lllllllllllllIIlllllIlIIllIIIIII) {
        if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIIllIIIIII) && llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            int lllllllllllllIIlllllIlIIllIIIIll = EntityHorse.lIIIlllIIlIlIl[0];
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (!llIIIllIIIIlIlI(lllllllllllllIIlllllIlIIllIIIIll, lllllllllllllIIlllllIlIIllIIIIII.getSizeInventory())) {
                final ItemStack lllllllllllllIIlllllIlIIllIIIIlI = lllllllllllllIIlllllIlIIllIIIIII.getStackInSlot(lllllllllllllIIlllllIlIIllIIIIll);
                if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIIllIIIIlI)) {
                    this.entityDropItem(lllllllllllllIIlllllIlIIllIIIIlI, 0.0f);
                    "".length();
                }
                ++lllllllllllllIIlllllIlIIllIIIIll;
            }
        }
    }
    
    protected void spawnHorseParticles(final boolean lllllllllllllIIlllllIlIIIIIIIlII) {
        EnumParticleTypes enumParticleTypes;
        if (llIIIllIIIIIIII(lllllllllllllIIlllllIlIIIIIIIlII ? 1 : 0)) {
            enumParticleTypes = EnumParticleTypes.HEART;
            "".length();
            if ((0x56 ^ 0x52) != (0x70 ^ 0x74)) {
                return;
            }
        }
        else {
            enumParticleTypes = EnumParticleTypes.SMOKE_NORMAL;
        }
        final EnumParticleTypes lllllllllllllIIlllllIlIIIIIIlIlI = enumParticleTypes;
        int lllllllllllllIIlllllIlIIIIIIlIIl = EntityHorse.lIIIlllIIlIlIl[0];
        "".length();
        if (((0x4F ^ 0x7A) & ~(0xB0 ^ 0x85)) >= "  ".length()) {
            return;
        }
        while (!llIIIllIIIIlIlI(lllllllllllllIIlllllIlIIIIIIlIIl, EntityHorse.lIIIlllIIlIlIl[7])) {
            final double lllllllllllllIIlllllIlIIIIIIlIII = this.rand.nextGaussian() * 0.02;
            final double lllllllllllllIIlllllIlIIIIIIIlll = this.rand.nextGaussian() * 0.02;
            final double lllllllllllllIIlllllIlIIIIIIIllI = this.rand.nextGaussian() * 0.02;
            this.worldObj.spawnParticle(lllllllllllllIIlllllIlIIIIIIlIlI, this.posX + this.rand.nextFloat() * this.width * 2.0f - this.width, this.posY + 0.5 + this.rand.nextFloat() * this.height, this.posZ + this.rand.nextFloat() * this.width * 2.0f - this.width, lllllllllllllIIlllllIlIIIIIIlIII, lllllllllllllIIlllllIlIIIIIIIlll, lllllllllllllIIlllllIlIIIIIIIllI, new int[EntityHorse.lIIIlllIIlIlIl[0]]);
            ++lllllllllllllIIlllllIlIIIIIIlIIl;
        }
    }
    
    public void setJumpPower(int lllllllllllllIIlllllIlIIIIIlIlII) {
        if (llIIIllIIIIIIII(this.isHorseSaddled() ? 1 : 0)) {
            if (llIIIllIIIIllIl((int)lllllllllllllIIlllllIlIIIIIlIlII)) {
                lllllllllllllIIlllllIlIIIIIlIlII = EntityHorse.lIIIlllIIlIlIl[0];
                "".length();
                if ((0x48 ^ 0x4D ^ " ".length()) <= 0) {
                    return;
                }
            }
            else {
                this.field_110294_bI = (EntityHorse.lIIIlllIIlIlIl[1] != 0);
                this.makeHorseRear();
            }
            if (llIIIllIIIIlIlI((int)lllllllllllllIIlllllIlIIIIIlIlII, EntityHorse.lIIIlllIIlIlIl[101])) {
                this.jumpPower = 1.0f;
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else {
                this.jumpPower = 0.4f + 0.4f * (float)lllllllllllllIIlllllIlIIIIIlIlII / 90.0f;
            }
        }
    }
    
    public void setTemper(final int lllllllllllllIIlllllIllIIIlllIll) {
        this.temper = lllllllllllllIIlllllIllIIIlllIll;
    }
    
    public int getHorseVariant() {
        return this.dataWatcher.getWatchableObjectInt(EntityHorse.lIIIlllIIlIlIl[20]);
    }
    
    public void setHorseJumping(final boolean lllllllllllllIIlllllIllIlIIIIlII) {
        this.horseJumping = lllllllllllllIIlllllIllIlIIIIlII;
    }
    
    @Override
    public void setEating(final boolean lllllllllllllIIlllllIlIIlllIIIll) {
        this.setHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[32], lllllllllllllIIlllllIlIIlllIIIll);
    }
    
    @Override
    protected Item getDropItem() {
        int n;
        if (llIIIllIIIIIIIl(this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[2]))) {
            n = EntityHorse.lIIIlllIIlIlIl[1];
            "".length();
            if ((0x3B ^ 0x25 ^ (0x14 ^ 0xE)) < 0) {
                return null;
            }
        }
        else {
            n = EntityHorse.lIIIlllIIlIlIl[0];
        }
        final boolean lllllllllllllIIlllllIlIllIllIlIl = n != 0;
        final int lllllllllllllIIlllllIlIllIllIlII = this.getHorseType();
        Item item;
        if (llIIIllIIIIlllI(lllllllllllllIIlllllIlIllIllIlII, EntityHorse.lIIIlllIIlIlIl[2])) {
            item = Items.bone;
            "".length();
            if (" ".length() == "  ".length()) {
                return null;
            }
        }
        else if (llIIIllIIIIlllI(lllllllllllllIIlllllIlIllIllIlII, EntityHorse.lIIIlllIIlIlIl[4])) {
            if (llIIIllIIIIIIII(lllllllllllllIIlllllIlIllIllIlIl ? 1 : 0)) {
                item = null;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                item = Items.rotten_flesh;
                "".length();
                if (((145 + 90 - 232 + 190 ^ 65 + 50 - 98 + 112) & (0x1D ^ 0x2E ^ (0x61 ^ 0x12) ^ -" ".length())) == -" ".length()) {
                    return null;
                }
            }
        }
        else {
            item = Items.leather;
        }
        return item;
    }
    
    public boolean isSterile() {
        if (llIIIllIIIIIIIl(this.isUndead() ? 1 : 0) && llIIIllIIIIlIIl(this.getHorseType(), EntityHorse.lIIIlllIIlIlIl[3])) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (llIIIllIIIIIIII(this.worldObj.isRemote ? 1 : 0) && llIIIllIIIIIIII(this.dataWatcher.hasObjectChanged() ? 1 : 0)) {
            this.dataWatcher.func_111144_e();
            this.resetTexturePrefix();
        }
        if (llIIIllIIIIIIll(this.openMouthCounter)) {
            final int n = this.openMouthCounter + EntityHorse.lIIIlllIIlIlIl[1];
            this.openMouthCounter = n;
            if (llIIIllIIIIlIll(n, EntityHorse.lIIIlllIIlIlIl[30])) {
                this.openMouthCounter = EntityHorse.lIIIlllIIlIlIl[0];
                this.setHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[78], (boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
            }
        }
        if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0) && llIIIllIIIIIIll(this.jumpRearingCounter)) {
            final int n2 = this.jumpRearingCounter + EntityHorse.lIIIlllIIlIlIl[1];
            this.jumpRearingCounter = n2;
            if (llIIIllIIIIlIll(n2, EntityHorse.lIIIlllIIlIlIl[20])) {
                this.jumpRearingCounter = EntityHorse.lIIIlllIIlIlIl[0];
                this.setRearing((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
            }
        }
        if (llIIIllIIIIIIll(this.field_110278_bp)) {
            final int n3 = this.field_110278_bp + EntityHorse.lIIIlllIIlIlIl[1];
            this.field_110278_bp = n3;
            if (llIIIllIIIIlIll(n3, EntityHorse.lIIIlllIIlIlIl[8])) {
                this.field_110278_bp = EntityHorse.lIIIlllIIlIlIl[0];
            }
        }
        if (llIIIllIIIIIIll(this.field_110279_bq)) {
            this.field_110279_bq += EntityHorse.lIIIlllIIlIlIl[1];
            if (llIIIllIIIIlIll(this.field_110279_bq, EntityHorse.lIIIlllIIlIlIl[77])) {
                this.field_110279_bq = EntityHorse.lIIIlllIIlIlIl[0];
            }
        }
        this.prevHeadLean = this.headLean;
        if (llIIIllIIIIIIII(this.isEatingHaystack() ? 1 : 0)) {
            this.headLean += (1.0f - this.headLean) * 0.4f + 0.05f;
            if (llIIIllIIIIIIll(llIIIllIIIllIII(this.headLean, 1.0f))) {
                this.headLean = 1.0f;
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
        }
        else {
            this.headLean += (0.0f - this.headLean) * 0.4f - 0.05f;
            if (llIIIllIIIIllIl(llIIIllIIIllIIl(this.headLean, 0.0f))) {
                this.headLean = 0.0f;
            }
        }
        this.prevRearingAmount = this.rearingAmount;
        if (llIIIllIIIIIIII(this.isRearing() ? 1 : 0)) {
            final float n4 = 0.0f;
            this.headLean = n4;
            this.prevHeadLean = n4;
            this.rearingAmount += (1.0f - this.rearingAmount) * 0.4f + 0.05f;
            if (llIIIllIIIIIIll(llIIIllIIIllIII(this.rearingAmount, 1.0f))) {
                this.rearingAmount = 1.0f;
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
        }
        else {
            this.field_110294_bI = (EntityHorse.lIIIlllIIlIlIl[0] != 0);
            this.rearingAmount += (0.8f * this.rearingAmount * this.rearingAmount * this.rearingAmount - this.rearingAmount) * 0.6f - 0.05f;
            if (llIIIllIIIIllIl(llIIIllIIIllIIl(this.rearingAmount, 0.0f))) {
                this.rearingAmount = 0.0f;
            }
        }
        this.prevMouthOpenness = this.mouthOpenness;
        if (llIIIllIIIIIIII(this.getHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[78]) ? 1 : 0)) {
            this.mouthOpenness += (1.0f - this.mouthOpenness) * 0.7f + 0.05f;
            if (llIIIllIIIIIIll(llIIIllIIIllIII(this.mouthOpenness, 1.0f))) {
                this.mouthOpenness = 1.0f;
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
        }
        else {
            this.mouthOpenness += (0.0f - this.mouthOpenness) * 0.7f - 0.05f;
            if (llIIIllIIIIllIl(llIIIllIIIllIIl(this.mouthOpenness, 0.0f))) {
                this.mouthOpenness = 0.0f;
            }
        }
    }
    
    public void setEatingHaystack(final boolean lllllllllllllIIlllllIlIIllIlllll) {
        this.setEating(lllllllllllllIIlllllIlIIllIlllll);
    }
    
    @Override
    public boolean canMateWith(final EntityAnimal lllllllllllllIIlllllIlIIIllIlllI) {
        if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIIIllIlllI, this)) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        if (llIIIllIIIIlIII(lllllllllllllIIlllllIlIIIllIlllI.getClass(), this.getClass())) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        final EntityHorse lllllllllllllIIlllllIlIIIllIllIl = (EntityHorse)lllllllllllllIIlllllIlIIIllIlllI;
        if (!llIIIllIIIIIIII(this.canMate() ? 1 : 0) || !llIIIllIIIIIIII(lllllllllllllIIlllllIlIIIllIllIl.canMate() ? 1 : 0)) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        final int lllllllllllllIIlllllIlIIIllIllII = this.getHorseType();
        final int lllllllllllllIIlllllIlIIIllIlIll = lllllllllllllIIlllllIlIIIllIllIl.getHorseType();
        if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIIIllIllII, lllllllllllllIIlllllIlIIIllIlIll) && (!llIIIllIIIIIIIl(lllllllllllllIIlllllIlIIIllIllII) || llIIIllIIIIlIIl(lllllllllllllIIlllllIlIIIllIlIll, EntityHorse.lIIIlllIIlIlIl[1])) && (!llIIIllIIIIlllI(lllllllllllllIIlllllIlIIIllIllII, EntityHorse.lIIIlllIIlIlIl[1]) || llIIIllIIIIIIII(lllllllllllllIIlllllIlIIIllIlIll))) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
    }
    
    private double getModifiedJumpStrength() {
        return 0.4000000059604645 + this.rand.nextDouble() * 0.2 + this.rand.nextDouble() * 0.2 + this.rand.nextDouble() * 0.2;
    }
    
    private static boolean llIIIllIIIIlIlI(final int lllllllllllllIIlllllIIllIllIIIIl, final int lllllllllllllIIlllllIIllIllIIIII) {
        return lllllllllllllIIlllllIIllIllIIIIl >= lllllllllllllIIlllllIIllIllIIIII;
    }
    
    private double getModifiedMovementSpeed() {
        return (0.44999998807907104 + this.rand.nextDouble() * 0.3 + this.rand.nextDouble() * 0.3 + this.rand.nextDouble() * 0.3) * 0.25;
    }
    
    public boolean canCarryChest() {
        final int lllllllllllllIIlllllIlIlIIIlIIIl = this.getHorseType();
        if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIlIIIlIIIl, EntityHorse.lIIIlllIIlIlIl[3]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIlIIIlIIIl, EntityHorse.lIIIlllIIlIlIl[1])) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
    }
    
    private static boolean llIIIllIIIIlIII(final Object lllllllllllllIIlllllIIllIlIlIIIl, final Object lllllllllllllIIlllllIIllIlIlIIII) {
        return lllllllllllllIIlllllIIllIlIlIIIl != lllllllllllllIIlllllIIllIlIlIIII;
    }
    
    private static boolean llIIIllIIIlIIII(final int lllllllllllllIIlllllIIllIlIllIIl, final int lllllllllllllIIlllllIIllIlIllIII) {
        return lllllllllllllIIlllllIIllIlIllIIl <= lllllllllllllIIlllllIIllIlIllIII;
    }
    
    protected String getAngrySoundName() {
        this.openHorseMouth();
        this.makeHorseRear();
        final int lllllllllllllIIlllllIlIllIIllllI = this.getHorseType();
        String s;
        if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIIllllI, EntityHorse.lIIIlllIIlIlIl[4]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIIllllI, EntityHorse.lIIIlllIIlIlIl[2])) {
            if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIIllllI, EntityHorse.lIIIlllIIlIlIl[1]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIIllllI, EntityHorse.lIIIlllIIlIlIl[3])) {
                s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[58]];
                "".length();
                if (((0x41 ^ 0x49) & ~(0x3E ^ 0x36)) != 0x0) {
                    return null;
                }
            }
            else {
                s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[59]];
                "".length();
                if ((0xE ^ 0xB) == 0x0) {
                    return null;
                }
            }
        }
        else {
            s = null;
        }
        return s;
    }
    
    @Override
    public void onLivingUpdate() {
        if (llIIIllIIIIIIIl(this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[75]))) {
            this.func_110210_cH();
        }
        super.onLivingUpdate();
        if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            if (llIIIllIIIIIIIl(this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[76])) && llIIIllIIIIIIIl(this.deathTime)) {
                this.heal(1.0f);
            }
            if (llIIIllIIIIIIIl(this.isEatingHaystack() ? 1 : 0) && llIIIllIIIIIlII(this.riddenByEntity) && llIIIllIIIIIIIl(this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[77])) && llIIIllIIIIIlIl(this.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY) - EntityHorse.lIIIlllIIlIlIl[1], MathHelper.floor_double(this.posZ))).getBlock(), Blocks.grass)) {
                this.setEatingHaystack((boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
            }
            if (llIIIllIIIIIIII(this.isEatingHaystack() ? 1 : 0)) {
                final int n = this.eatingHaystackCounter + EntityHorse.lIIIlllIIlIlIl[1];
                this.eatingHaystackCounter = n;
                if (llIIIllIIIIlIll(n, EntityHorse.lIIIlllIIlIlIl[52])) {
                    this.eatingHaystackCounter = EntityHorse.lIIIlllIIlIlIl[0];
                    this.setEatingHaystack((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
                }
            }
            if (llIIIllIIIIIIII(this.isBreeding() ? 1 : 0) && llIIIllIIIIIIIl(this.isAdultHorse() ? 1 : 0) && llIIIllIIIIIIIl(this.isEatingHaystack() ? 1 : 0)) {
                final EntityHorse lllllllllllllIIlllllIlIIllllIlII = this.getClosestHorse(this, 16.0);
                if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIIllllIlII) && llIIIllIIIIIIll(llIIIllIIIlIlll(this.getDistanceSqToEntity(lllllllllllllIIlllllIlIIllllIlII), 4.0))) {
                    this.navigator.getPathToEntityLiving(lllllllllllllIIlllllIlIIllllIlII);
                    "".length();
                }
            }
        }
    }
    
    public int increaseTemper(final int lllllllllllllIIlllllIllIIIllIllI) {
        final int lllllllllllllIIlllllIllIIIllIlIl = MathHelper.clamp_int(this.getTemper() + lllllllllllllIIlllllIllIIIllIllI, EntityHorse.lIIIlllIIlIlIl[0], this.getMaxTemper());
        this.setTemper(lllllllllllllIIlllllIllIIIllIlIl);
        return lllllllllllllIIlllllIllIIIllIlIl;
    }
    
    public String getHorseTexture() {
        if (llIIIllIIIIIlII(this.texturePrefix)) {
            this.setHorseTexturePaths();
        }
        return this.texturePrefix;
    }
    
    private static int llIIIllIIIIIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIIIllIIIIlIIl(final int lllllllllllllIIlllllIIllIIlllIIl, final int lllllllllllllIIlllllIIllIIlllIII) {
        return lllllllllllllIIlllllIIllIIlllIIl != lllllllllllllIIlllllIIllIIlllIII;
    }
    
    public boolean setTamedBy(final EntityPlayer lllllllllllllIIlllllIlIIlIlllIII) {
        this.setOwnerId(lllllllllllllIIlllllIlIIlIlllIII.getUniqueID().toString());
        this.setHorseTamed((boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
    }
    
    public void setChested(final boolean lllllllllllllIIlllllIllIIlIlIIlI) {
        this.setHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[8], lllllllllllllIIlllllIllIIlIlIIlI);
    }
    
    private void resetTexturePrefix() {
        this.texturePrefix = null;
    }
    
    public float getGrassEatingAmount(final float lllllllllllllIIlllllIlIIIIlIIllI) {
        return this.prevHeadLean + (this.headLean - this.prevHeadLean) * lllllllllllllIIlllllIlIIIIlIIllI;
    }
    
    public String[] getVariantTexturePaths() {
        if (llIIIllIIIIIlII(this.texturePrefix)) {
            this.setHorseTexturePaths();
        }
        return this.horseTexturesArray;
    }
    
    private static int llIIIllIIIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public float getMouthOpennessAngle(final float lllllllllllllIIlllllIlIIIIIlllII) {
        return this.prevMouthOpenness + (this.mouthOpenness - this.prevMouthOpenness) * lllllllllllllIIlllllIlIIIIIlllII;
    }
    
    public boolean isHorseSaddled() {
        return this.getHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[2]);
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance lllllllllllllIIlllllIlIIIIllIIIl, IEntityLivingData lllllllllllllIIlllllIlIIIIllIIII) {
        lllllllllllllIIlllllIlIIIIllIIII = super.onInitialSpawn(lllllllllllllIIlllllIlIIIIllIIIl, lllllllllllllIIlllllIlIIIIllIIII);
        int lllllllllllllIIlllllIlIIIIllIllI = EntityHorse.lIIIlllIIlIlIl[0];
        int lllllllllllllIIlllllIlIIIIllIlIl = EntityHorse.lIIIlllIIlIlIl[0];
        if (llIIIllIIIIIIII((lllllllllllllIIlllllIlIIIIllIIII instanceof GroupData) ? 1 : 0)) {
            lllllllllllllIIlllllIlIIIIllIllI = ((GroupData)lllllllllllllIIlllllIlIIIIllIIII).horseType;
            lllllllllllllIIlllllIlIIIIllIlIl = ((((GroupData)lllllllllllllIIlllllIlIIIIllIIII).horseVariant & EntityHorse.lIIIlllIIlIlIl[68]) | this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[5]) << EntityHorse.lIIIlllIIlIlIl[8]);
            "".length();
            if (((0x89 ^ 0x80) & ~(0x2D ^ 0x24)) < 0) {
                return null;
            }
        }
        else {
            if (llIIIllIIIIIIIl(this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[11]))) {
                lllllllllllllIIlllllIlIIIIllIllI = EntityHorse.lIIIlllIIlIlIl[1];
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
            }
            else {
                final int lllllllllllllIIlllllIlIIIIllIlII = this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[7]);
                final int lllllllllllllIIlllllIlIIIIllIIll = this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[5]);
                lllllllllllllIIlllllIlIIIIllIllI = EntityHorse.lIIIlllIIlIlIl[0];
                lllllllllllllIIlllllIlIIIIllIlIl = (lllllllllllllIIlllllIlIIIIllIlII | lllllllllllllIIlllllIlIIIIllIIll << EntityHorse.lIIIlllIIlIlIl[8]);
            }
            lllllllllllllIIlllllIlIIIIllIIII = new GroupData(lllllllllllllIIlllllIlIIIIllIllI, lllllllllllllIIlllllIlIIIIllIlIl);
        }
        this.setHorseType(lllllllllllllIIlllllIlIIIIllIllI);
        this.setHorseVariant(lllllllllllllIIlllllIlIIIIllIlIl);
        if (llIIIllIIIIIIIl(this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[5]))) {
            this.setGrowingAge(EntityHorse.lIIIlllIIlIlIl[112]);
        }
        if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIIIIllIllI, EntityHorse.lIIIlllIIlIlIl[2]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIIIIllIllI, EntityHorse.lIIIlllIIlIlIl[4])) {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(this.getModifiedMaxHealth());
            if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIIIIllIllI)) {
                this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(this.getModifiedMovementSpeed());
                "".length();
                if (-" ".length() > "   ".length()) {
                    return null;
                }
            }
            else {
                this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.17499999701976776);
                "".length();
                if ("  ".length() == " ".length()) {
                    return null;
                }
            }
        }
        else {
            this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(15.0);
            this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224);
        }
        if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIIIIllIllI, EntityHorse.lIIIlllIIlIlIl[3]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIIIIllIllI, EntityHorse.lIIIlllIIlIlIl[1])) {
            this.getEntityAttribute(EntityHorse.horseJumpStrength).setBaseValue(this.getModifiedJumpStrength());
            "".length();
            if ("  ".length() == -" ".length()) {
                return null;
            }
        }
        else {
            this.getEntityAttribute(EntityHorse.horseJumpStrength).setBaseValue(0.5);
        }
        this.setHealth(this.getMaxHealth());
        return lllllllllllllIIlllllIlIIIIllIIII;
    }
    
    @Override
    protected float getSoundVolume() {
        return 0.8f;
    }
    
    public boolean isChested() {
        return this.getHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[8]);
    }
    
    @Override
    public int getMaxSpawnedInChunk() {
        return EntityHorse.lIIIlllIIlIlIl[6];
    }
    
    public EntityHorse(final World lllllllllllllIIlllllIllIllIllIll) {
        super(lllllllllllllIIlllllIllIllIllIll);
        this.horseTexturesArray = new String[EntityHorse.lIIIlllIIlIlIl[4]];
        this.field_175508_bO = (EntityHorse.lIIIlllIIlIlIl[0] != 0);
        this.setSize(1.4f, 1.6f);
        this.isImmuneToFire = (EntityHorse.lIIIlllIIlIlIl[0] != 0);
        this.setChested((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
        this.tasks.addTask(EntityHorse.lIIIlllIIlIlIl[0], new EntityAISwimming(this));
        this.tasks.addTask(EntityHorse.lIIIlllIIlIlIl[1], new EntityAIPanic(this, 1.2));
        this.tasks.addTask(EntityHorse.lIIIlllIIlIlIl[1], new EntityAIRunAroundLikeCrazy(this, 1.2));
        this.tasks.addTask(EntityHorse.lIIIlllIIlIlIl[3], new EntityAIMate(this, 1.0));
        this.tasks.addTask(EntityHorse.lIIIlllIIlIlIl[2], new EntityAIFollowParent(this, 1.0));
        this.tasks.addTask(EntityHorse.lIIIlllIIlIlIl[6], new EntityAIWander(this, 0.7));
        this.tasks.addTask(EntityHorse.lIIIlllIIlIlIl[7], new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
        this.tasks.addTask(EntityHorse.lIIIlllIIlIlIl[8], new EntityAILookIdle(this));
        this.initHorseChest();
    }
    
    private static int llIIIllIIIIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public boolean canBePushed() {
        if (llIIIllIIIIIlII(this.riddenByEntity)) {
            return EntityHorse.lIIIlllIIlIlIl[1] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[0] != 0;
    }
    
    public void openGUI(final EntityPlayer lllllllllllllIIlllllIlIlIIllIlII) {
        if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0) && (!llIIIllIIIIIllI(this.riddenByEntity) || llIIIllIIIIIlIl(this.riddenByEntity, lllllllllllllIIlllllIlIlIIllIlII)) && llIIIllIIIIIIII(this.isTame() ? 1 : 0)) {
            this.horseChest.setCustomName(this.getName());
            lllllllllllllIIlllllIlIlIIllIlII.displayGUIHorse(this, this.horseChest);
        }
    }
    
    private static int llIIIllIIIllIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected boolean isMovementBlocked() {
        int n;
        if (llIIIllIIIIIllI(this.riddenByEntity) && llIIIllIIIIIIII(this.isHorseSaddled() ? 1 : 0)) {
            n = EntityHorse.lIIIlllIIlIlIl[1];
            "".length();
            if (((5 + 134 - 122 + 134 ^ 108 + 135 - 215 + 134) & (0x2D ^ 0x1D ^ (0xA8 ^ 0xAD) ^ -" ".length())) >= "  ".length()) {
                return ((0x3B ^ 0x56 ^ (0xF ^ 0x54)) & (0xF7 ^ 0x8B ^ (0x44 ^ 0xE) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIIIllIIIIIIIl(this.isEatingHaystack() ? 1 : 0) && llIIIllIIIIIIIl(this.isRearing() ? 1 : 0)) {
            n = EntityHorse.lIIIlllIIlIlIl[0];
            "".length();
            if ("  ".length() >= "   ".length()) {
                return ((0x85 ^ 0xC6) & ~(0x3D ^ 0x7E)) != 0x0;
            }
        }
        else {
            n = EntityHorse.lIIIlllIIlIlIl[1];
        }
        return n != 0;
    }
    
    private static boolean llIIIllIIIIIlII(final Object lllllllllllllIIlllllIIllIlIIlIII) {
        return lllllllllllllIIlllllIIllIlIIlIII == null;
    }
    
    private static void llIIIlIllllllII() {
        (lIIIlllIIIIlII = new String[EntityHorse.lIIIlllIIlIlIl[115]])[EntityHorse.lIIIlllIIlIlIl[0]] = llIIIlIllIIlIII("2cN/he0XdCQIRWHQm6Mp5injhHSqBuij", "hSbTk");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[1]] = llIIIlIllIIlIII("sw5lOmXzQ3UUmI4ZdYdgwA==", "TBNof");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[3]] = llIIIlIllIIllIl("gwlIH44NBBHeYdX2P3FdUGyDaBIBP2lEF3NJV47BtsUEJzRCt7x5ElSYB1U+haQLVI28u6dN/cw=", "ImEaL");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[4]] = llIIIlIllIIlIII("2TDCRIT2u6caw2cqd99tOTOE2GomIiCnDnTXTg85WnKGbXyx0HGQK0NAoomatWGnHGI0Ef51XAE=", "ITSHv");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[2]] = llIIIlIllIIlIII("pDuyQXOpkGm+6SEEiRR1KchfcAUd6u8TPCE/Tm/Aej5T7gvKv699kD6BZffXVQ2h3t66FrPSvhw=", "mrgVV");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[5]] = llIIIlIllIIlIII("UL0Qd/RsvQA=", "hvfUs");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[6]] = llIIIlIllIIlIII("9Gh/0pp5MtM=", "JatiI");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[7]] = llIIIlIllIIllIl("rA9XwWcbfXg=", "bGDTH");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[8]] = llIIIlIllIIllIl("qxN8HdsCU0s=", "AVYPE");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[10]] = llIIIlIllIIllll("GxQpBQIdFCJeEgEFOAUOQBk+AwQKXjkeBRwUDgYfBgU0XwcBFg==", "oqQqw");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[11]] = llIIIlIllIIllIl("yrEtOEf8lLCkGCECG2PGRbFAwsuHKJtlWN5ACtwHzpErZZDRsMNdAw==", "LZoeP");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[9]] = llIIIlIllIIllIl("dV4cPymayJ+u4uCLQNFDFbQ9n9dbVD1lUsfOFFxElh+WNfP3gv92DpIwggf+IVY8", "aAjFi");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[12]] = llIIIlIllIIllll("FishODEQKypjIQw6MDg9TSY2PjcHYTEjNhErBi42DTk3YjQMKQ==", "bNYLD");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[13]] = llIIIlIllIIllll("ARUZFxIHFRJMAhsECBceWhgOERQQXwkMFQYVPgELFBMKTRcbFw==", "upacg");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[14]] = llIIIlIllIIlIII("NTw3qX4RrJZ4HGIT5+mFcKXWg6/WDURFYCivqjYGJCKi0g0Jk0KgzQ==", "hoyxP");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[15]] = llIIIlIllIIllIl("dvbvHmCxUdHk8NLwTkJsKfiNiYso8+uwM9SSKC7bveR7WVptbklzQeX4qNfvIwnQ", "mHuOf");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[16]] = llIIIlIllIIlIII("h+H1lb/Zl/A=", "wqlNM");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[17]] = llIIIlIllIIllIl("Fb0DuyuERoQ=", "LkLpV");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[18]] = llIIIlIllIIllIl("xitKbvmayJ8=", "GVYXx");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[19]] = llIIIlIllIIlIII("OQXg5m+7qfY=", "lYmPM");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[20]] = llIIIlIllIIllIl("xIkJOpXL+l8=", "DUGnJ");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[21]] = llIIIlIllIIllll("JxI3", "OuEAD");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[22]] = llIIIlIllIIlIII("qAFtpYdJ+tI=", "MuBBb");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[23]] = llIIIlIllIIllIl("1GDVjsI6qDKrnna2+zZzKQF1N+gi4ppLhLrnmLUgM8GxphnXHjo/teAJXaf6Z2y4", "YbFrp");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[24]] = llIIIlIllIIllIl("Y9kvui1wYLN68P7SCSVyf4+fYkTdx8i1vIrA/4CDnqo/IGuyzKerBbDpxUtifsG0EaLNbZfrPU4=", "ozZGi");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[25]] = llIIIlIllIIllll("LSo+Nh0rKjVtDTc7LzYRdicpMBs8YC4tGioqGS8JKyQvLA8qEDEqAS0qIi0cKmE2LA8=", "YOFBh");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[26]] = llIIIlIllIIllIl("mz74/tF1WBkjToGsLlahjfwB6q1fv2kfgTSsT9DKp38ksVETBTsVPv6I9SFWGYfQZhnd4IJ7qDY=", "hPUpk");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[27]] = llIIIlIllIIllIl("8B9G+e3Sqrg=", "wWCPG");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[28]] = llIIIlIllIIlIII("CRKxqfd9TzE=", "DNHcw");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[29]] = llIIIlIllIIllll("EBgO", "guame");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[30]] = llIIIlIllIIlIII("Cpv0MA33qIA=", "EbUKo");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[31]] = llIIIlIllIIllll("Jh4A", "Dzolf");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[32]] = llIIIlIllIIlIII("OzRl/2simvA=", "fGzte");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[33]] = llIIIlIllIIllll("KgcQMwE2Rww1BzwMSjQUIgw=", "OidZu");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[34]] = llIIIlIllIIlIII("KHgWO3Ob11OTjNVdDn3wCLlugxvY25VQ", "gSrMk");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[35]] = llIIIlIllIIlIII("NYw2wM4nBecuOZmgzXdXxFnP6c3knYjl", "mtMfC");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[36]] = llIIIlIllIIlIII("Xpj4RXMNNh6q/Ks3E8XFjeDXJpGKb3P1", "kNQsT");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[37]] = llIIIlIllIIllll("Mz0TMzgvfRQxKTo2EzUiPjwVKSl4PQY3KQ==", "VSgZL");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[40]] = llIIIlIllIIllll("LigmPhcs", "KIRWy");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[41]] = llIIIlIllIIllll("Phs7YCI8BiorZD8VNyo=", "StYNJ");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[42]] = llIIIlIllIIlIII("5yMEO5fkvrxtRvourWPscg==", "uLqnw");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[43]] = llIIIlIllIIllIl("f7CVP2hkkKargdN6OJJ0fw==", "xXzlt");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[44]] = llIIIlIllIIlIII("t1tHq66XMsNCsFuwGnYDvQ==", "uWKDG");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[45]] = llIIIlIllIIllIl("bG62Y0pIHNDtpjzVFwru6n0KNe8hC7Pj", "ZQbzx");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[46]] = llIIIlIllIIllll("JhgwRickBSENYTEYPwomLlk2DS4/Hw==", "KwRhO");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[47]] = llIIIlIllIIllIl("yNDqTMm3wI/WRdOYd/onHmpYk8rQQD9hgVFetSlYoZw=", "BNYiz");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[48]] = llIIIlIllIIllll("BBoKQRwGBxsKWg0QCRsc", "iuhot");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[49]] = llIIIlIllIIlIII("g1sUdL17jWbJbkGKiqefhkf8zzIKvZdy", "nsIgj");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[50]] = llIIIlIllIIllIl("wJ+WH8gjIO5oFzhyK7BRIQRignfpwz2M", "QFxEY");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[51]] = llIIIlIllIIlIII("vqr7P3+hcuqSIr9tR5y4EfuzWf+Ayoow", "vMCcf");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[52]] = llIIIlIllIIllIl("+aLgjkmbrwVJdqdkm7ZqNA==", "fhgXI");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[53]] = llIIIlIllIIllll("PDwnQg8+ITYJSTU8KwcCKH0tBRM=", "QSElg");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[54]] = llIIIlIllIIllIl("Qr80VMUCZedDewnTCovuyOmmzxR3xMid", "XAvfZ");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[55]] = llIIIlIllIIlIII("UQxxPHjnbSH0E7N6iB+213LOySi0bSo6", "rZIyh");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[56]] = llIIIlIllIIlIII("XWhZ+Vc8i4xS7uG46kNG0Q==", "xpBwh");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[57]] = llIIIlIllIIllIl("UupgQWZJBpsS11huEdvw+lhA0aEQ4Sz7", "BuBor");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[58]] = llIIIlIllIIlIII("ihgeZC5scmcG8JgTsZf07g==", "MZkkT");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[59]] = llIIIlIllIIlIII("CXb2VOJ6HxXiqPDstaC67pnB+YFXApUp", "jUJdt");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[60]] = llIIIlIllIIllll("BAMHag0GHhYhSw4NCSgKGQ==", "ileDe");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[61]] = llIIIlIllIIlIII("13+/rCFOzgGLPwtyIogRA+El0+ppc22U", "frOLH");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[62]] = llIIIlIllIIllIl("RGJjswMt4nbtzxwFij+WEg==", "fgQTO");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[63]] = llIIIlIllIIlIII("CKw0UX86k/m/KjGHDVCiuA==", "tAMvx");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[64]] = llIIIlIllIIllll("Cw0wZT0JECEuexUNND8=", "fbRKU");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[67]] = llIIIlIllIIllll("Ahk5BSdF", "jvKvB");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[39]] = llIIIlIllIIllIl("F38BlMW8In0=", "omMkr");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[70]] = llIIIlIllIIlIII("SDo4Ior3d0w=", "TPXIQ");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[71]] = llIIIlIllIIlIII("+QHM/091nHQ=", "XsvZy");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[74]] = llIIIlIllIIlIII("2gJO2XcXc5IxTgPvdVWPjQ==", "yiryz");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[79]] = llIIIlIllIIllll("BSkhfxoHNDA0XAIzLiE=", "hFCQr");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[80]] = llIIIlIllIIllll("Ny8OICkVBhswNAYvGSI=", "rNzIG");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[81]] = llIIIlIllIIllIl("RXLXfL6Ops/0mglSaEpo5w==", "voiiz");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[82]] = llIIIlIllIIllll("AQgiJSo5Gz4TOioMNQ==", "IiQwO");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[83]] = llIIIlIllIIllll("ODU/Bg==", "zGZba");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[84]] = llIIIlIllIIlIII("gF8GRA6gGIA=", "phyVF");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[85]] = llIIIlIllIIllIl("X7kF2HQsz40=", "zNKZD");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[86]] = llIIIlIllIIllIl("bnyfwKVemRE=", "rBzhv");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[87]] = llIIIlIllIIlIII("yNj8ivZHe/c=", "qrLlM");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[88]] = llIIIlIllIIlIII("dTc8YPI6ZDplWEGka2eRVg==", "gvcHj");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[89]] = llIIIlIllIIllll("KRwbEA==", "zptdk");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[90]] = llIIIlIllIIlIII("Nhb+ls7ejNM=", "QZrfy");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[91]] = llIIIlIllIIllll("FCM8FR4cJTQX", "UQQzl");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[92]] = llIIIlIllIIllIl("e38pBgGqurFPSbNZlEp/qQ==", "caRso");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[93]] = llIIIlIllIIllll("AzMmPT0hGjMtIDIzMT8=", "FRRTS");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[94]] = llIIIlIllIIllIl("xtv3jjSyni8=", "SHbYd");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[95]] = llIIIlIllIIllll("ByIkCjUhLgkWMzcv", "DJAyA");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[96]] = llIIIlIllIIllll("DDkrKjM0KjccIyc9PA==", "DXXxV");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[97]] = llIIIlIllIIllIl("Aaiax6lI1As=", "KxadO");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[98]] = llIIIlIllIIlIII("XWuSQzaaXCo=", "JFwfm");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[99]] = llIIIlIllIIlIII("dA9AZptuSY0=", "oevtZ");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[100]] = llIIIlIllIIllll("ACg/JA==", "TIRAF");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[101]] = llIIIlIllIIllIl("0qxVzrNpYpU=", "CXxot");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[102]] = llIIIlIllIIlIII("ACn16fzhbPeri0fX+uyvLA==", "mGNjc");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[103]] = llIIIlIllIIllll("GhIbDAQAMDwt", "Ueuiv");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[104]] = llIIIlIllIIllll("Bw0MFCg=", "HzbqZ");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[105]] = llIIIlIllIIllIl("BQvzo6MSECw=", "qJaaS");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[106]] = llIIIlIllIIllIl("wxkPnU+d1BI=", "gIlVD");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[107]] = llIIIlIllIIllll("PyI5PQ==", "lNVIy");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[108]] = llIIIlIllIIllIl("Df02KAMS6JWQn41tJgplVw==", "OfoJT");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[109]] = llIIIlIllIIlIII("KE7uis3dOGOV+OPorVp1fQ==", "QdzLm");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[110]] = llIIIlIllIIlIII("gzflpB9rSqnwHXgHEOmeLA==", "umzRx");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[65]] = llIIIlIllIIlIII("FswAryr60HPe2ReB8rm9gQ==", "nxXXM");
        EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[111]] = llIIIlIllIIllll("JCUlKR4S", "wDAMr");
    }
    
    public boolean getHasReproduced() {
        return this.hasReproduced;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIlllllIlIIIllllIll) {
        super.readEntityFromNBT(lllllllllllllIIlllllIlIIIllllIll);
        this.setEatingHaystack(lllllllllllllIIlllllIlIIIllllIll.getBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[93]]));
        this.setBreeding(lllllllllllllIIlllllIlIIIllllIll.getBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[94]]));
        this.setChested(lllllllllllllIIlllllIlIIIllllIll.getBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[95]]));
        this.setHasReproduced(lllllllllllllIIlllllIlIIIllllIll.getBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[96]]));
        this.setHorseType(lllllllllllllIIlllllIlIIIllllIll.getInteger(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[97]]));
        this.setHorseVariant(lllllllllllllIIlllllIlIIIllllIll.getInteger(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[98]]));
        this.setTemper(lllllllllllllIIlllllIlIIIllllIll.getInteger(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[99]]));
        this.setHorseTamed(lllllllllllllIIlllllIlIIIllllIll.getBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[100]]));
        String lllllllllllllIIlllllIlIIlIIIIlIl = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[101]];
        if (llIIIllIIIIIIII(lllllllllllllIIlllllIlIIIllllIll.hasKey(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[102]], EntityHorse.lIIIlllIIlIlIl[8]) ? 1 : 0)) {
            lllllllllllllIIlllllIlIIlIIIIlIl = lllllllllllllIIlllllIlIIIllllIll.getString(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[103]]);
            "".length();
            if ((0xE ^ 0x51 ^ (0x44 ^ 0x1E)) <= 0) {
                return;
            }
        }
        else {
            final String lllllllllllllIIlllllIlIIlIIIIlII = lllllllllllllIIlllllIlIIIllllIll.getString(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[104]]);
            lllllllllllllIIlllllIlIIlIIIIlIl = PreYggdrasilConverter.getStringUUIDFromName(lllllllllllllIIlllllIlIIlIIIIlII);
        }
        if (llIIIllIIIIIIll(lllllllllllllIIlllllIlIIlIIIIlIl.length())) {
            this.setOwnerId(lllllllllllllIIlllllIlIIlIIIIlIl);
        }
        final IAttributeInstance lllllllllllllIIlllllIlIIlIIIIIll = this.getAttributeMap().getAttributeInstanceByName(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[105]]);
        if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIIlIIIIIll)) {
            this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(lllllllllllllIIlllllIlIIlIIIIIll.getBaseValue() * 0.25);
        }
        if (llIIIllIIIIIIII(this.isChested() ? 1 : 0)) {
            final NBTTagList lllllllllllllIIlllllIlIIlIIIIIlI = lllllllllllllIIlllllIlIIIllllIll.getTagList(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[106]], EntityHorse.lIIIlllIIlIlIl[11]);
            this.initHorseChest();
            int lllllllllllllIIlllllIlIIlIIIIIIl = EntityHorse.lIIIlllIIlIlIl[0];
            "".length();
            if (((0xB4 ^ 0x8E) & ~(0x51 ^ 0x6B)) < ((0x27 ^ 0x17) & ~(0x82 ^ 0xB2))) {
                return;
            }
            while (!llIIIllIIIIlIlI(lllllllllllllIIlllllIlIIlIIIIIIl, lllllllllllllIIlllllIlIIlIIIIIlI.tagCount())) {
                final NBTTagCompound lllllllllllllIIlllllIlIIlIIIIIII = lllllllllllllIIlllllIlIIlIIIIIlI.getCompoundTagAt(lllllllllllllIIlllllIlIIlIIIIIIl);
                final int lllllllllllllIIlllllIlIIIlllllll = lllllllllllllIIlllllIlIIlIIIIIII.getByte(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[107]]) & EntityHorse.lIIIlllIIlIlIl[68];
                if (llIIIllIIIIlIlI(lllllllllllllIIlllllIlIIIlllllll, EntityHorse.lIIIlllIIlIlIl[3]) && llIIIllIIIlIllI(lllllllllllllIIlllllIlIIIlllllll, this.horseChest.getSizeInventory())) {
                    this.horseChest.setInventorySlotContents(lllllllllllllIIlllllIlIIIlllllll, ItemStack.loadItemStackFromNBT(lllllllllllllIIlllllIlIIlIIIIIII));
                }
                ++lllllllllllllIIlllllIlIIlIIIIIIl;
            }
        }
        if (llIIIllIIIIIIII(lllllllllllllIIlllllIlIIIllllIll.hasKey(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[108]], EntityHorse.lIIIlllIIlIlIl[11]) ? 1 : 0)) {
            final ItemStack lllllllllllllIIlllllIlIIIllllllI = ItemStack.loadItemStackFromNBT(lllllllllllllIIlllllIlIIIllllIll.getCompoundTag(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[109]]));
            if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIIIllllllI) && llIIIllIIIIIIII(isArmorItem(lllllllllllllIIlllllIlIIIllllllI.getItem()) ? 1 : 0)) {
                this.horseChest.setInventorySlotContents(EntityHorse.lIIIlllIIlIlIl[1], lllllllllllllIIlllllIlIIIllllllI);
            }
        }
        if (llIIIllIIIIIIII(lllllllllllllIIlllllIlIIIllllIll.hasKey(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[110]], EntityHorse.lIIIlllIIlIlIl[11]) ? 1 : 0)) {
            final ItemStack lllllllllllllIIlllllIlIIIlllllIl = ItemStack.loadItemStackFromNBT(lllllllllllllIIlllllIlIIIllllIll.getCompoundTag(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[65]]));
            if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIIIlllllIl) && llIIIllIIIIIlIl(lllllllllllllIIlllllIlIIIlllllIl.getItem(), Items.saddle)) {
                this.horseChest.setInventorySlotContents(EntityHorse.lIIIlllIIlIlIl[0], lllllllllllllIIlllllIlIIIlllllIl);
                "".length();
                if (" ".length() <= -" ".length()) {
                    return;
                }
            }
        }
        else if (llIIIllIIIIIIII(lllllllllllllIIlllllIlIIIllllIll.getBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[111]]) ? 1 : 0)) {
            this.horseChest.setInventorySlotContents(EntityHorse.lIIIlllIIlIlIl[0], new ItemStack(Items.saddle));
        }
        this.updateHorseSlots();
    }
    
    private static boolean llIIIllIIIIIIII(final int lllllllllllllIIlllllIIllIlIIIllI) {
        return lllllllllllllIIlllllIIllIlIIIllI != 0;
    }
    
    public String getOwnerId() {
        return this.dataWatcher.getWatchableObjectString(EntityHorse.lIIIlllIIlIlIl[21]);
    }
    
    private void updateHorseSlots() {
        if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            int horseSaddled;
            if (llIIIllIIIIIllI(this.horseChest.getStackInSlot(EntityHorse.lIIIlllIIlIlIl[0]))) {
                horseSaddled = EntityHorse.lIIIlllIIlIlIl[1];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else {
                horseSaddled = EntityHorse.lIIIlllIIlIlIl[0];
            }
            this.setHorseSaddled((boolean)(horseSaddled != 0));
            if (llIIIllIIIIIIII(this.canWearArmor() ? 1 : 0)) {
                this.setHorseArmorStack(this.horseChest.getStackInSlot(EntityHorse.lIIIlllIIlIlIl[1]));
            }
        }
    }
    
    public int getHorseArmorIndexSynced() {
        return this.dataWatcher.getWatchableObjectInt(EntityHorse.lIIIlllIIlIlIl[22]);
    }
    
    private void openHorseMouth() {
        if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            this.openMouthCounter = EntityHorse.lIIIlllIIlIlIl[1];
            this.setHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[78], (boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
        }
    }
    
    public boolean isRearing() {
        return this.getHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[39]);
    }
    
    public void setHorseVariant(final int lllllllllllllIIlllllIllIllIIIlll) {
        this.dataWatcher.updateObject(EntityHorse.lIIIlllIIlIlIl[20], lllllllllllllIIlllllIllIllIIIlll);
        this.resetTexturePrefix();
    }
    
    @Override
    public boolean isOnLadder() {
        return EntityHorse.lIIIlllIIlIlIl[0] != 0;
    }
    
    private static int llIIIllIIIllIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setHorseType(final int lllllllllllllIIlllllIllIllIlIIII) {
        this.dataWatcher.updateObject(EntityHorse.lIIIlllIIlIlIl[19], (byte)lllllllllllllIIlllllIllIllIlIIII);
        this.resetTexturePrefix();
    }
    
    @Override
    public void onDeath(final DamageSource lllllllllllllIIlllllIlIIlllllIII) {
        super.onDeath(lllllllllllllIIlllllIlIIlllllIII);
        if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            this.dropChestItems();
        }
    }
    
    private static boolean llIIIllIIIlIllI(final int lllllllllllllIIlllllIIllIlIlllIl, final int lllllllllllllIIlllllIIllIlIlllII) {
        return lllllllllllllIIlllllIIllIlIlllIl < lllllllllllllIIlllllIIllIlIlllII;
    }
    
    private static String llIIIlIllIIlIII(final String lllllllllllllIIlllllIIllIllIllIl, final String lllllllllllllIIlllllIIllIllIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlllllIIllIlllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIIllIllIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllllIIllIllIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllllIIllIllIllll.init(EntityHorse.lIIIlllIIlIlIl[3], lllllllllllllIIlllllIIllIlllIIII);
            return new String(lllllllllllllIIlllllIIllIllIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIIllIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllIIllIllIlllI) {
            lllllllllllllIIlllllIIllIllIlllI.printStackTrace();
            return null;
        }
    }
    
    public void setHorseSaddled(final boolean lllllllllllllIIlllllIllIIlIIIlII) {
        this.setHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[2], lllllllllllllIIlllllIllIIlIIIlII);
    }
    
    public boolean prepareChunkForSpawn() {
        final int lllllllllllllIIlllllIllIIIIllIll = MathHelper.floor_double(this.posX);
        final int lllllllllllllIIlllllIllIIIIllIlI = MathHelper.floor_double(this.posZ);
        this.worldObj.getBiomeGenForCoords(new BlockPos(lllllllllllllIIlllllIllIIIIllIll, EntityHorse.lIIIlllIIlIlIl[0], lllllllllllllIIlllllIllIIIIllIlI));
        "".length();
        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityHorse.lIIIlllIIlIlIl[16], EntityHorse.lIIIlllIIlIlIl[0]);
        this.dataWatcher.addObject(EntityHorse.lIIIlllIIlIlIl[19], (byte)EntityHorse.lIIIlllIIlIlIl[0]);
        this.dataWatcher.addObject(EntityHorse.lIIIlllIIlIlIl[20], EntityHorse.lIIIlllIIlIlIl[0]);
        this.dataWatcher.addObject(EntityHorse.lIIIlllIIlIlIl[21], String.valueOf(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[32]]));
        this.dataWatcher.addObject(EntityHorse.lIIIlllIIlIlIl[22], EntityHorse.lIIIlllIIlIlIl[0]);
    }
    
    @Override
    protected String getLivingSound() {
        this.openHorseMouth();
        if (llIIIllIIIIIIIl(this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[11])) && llIIIllIIIIIIIl(this.isMovementBlocked() ? 1 : 0)) {
            this.makeHorseRear();
        }
        final int lllllllllllllIIlllllIlIllIlIIlII = this.getHorseType();
        String s;
        if (llIIIllIIIIlllI(lllllllllllllIIlllllIlIllIlIIlII, EntityHorse.lIIIlllIIlIlIl[4])) {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[54]];
            "".length();
            if (-" ".length() == "  ".length()) {
                return null;
            }
        }
        else if (llIIIllIIIIlllI(lllllllllllllIIlllllIlIllIlIIlII, EntityHorse.lIIIlllIIlIlIl[2])) {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[55]];
            "".length();
            if (-(73 + 112 - 174 + 172 ^ 59 + 23 + 79 + 18) > 0) {
                return null;
            }
        }
        else if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIlIIlII, EntityHorse.lIIIlllIIlIlIl[1]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIlIIlII, EntityHorse.lIIIlllIIlIlIl[3])) {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[56]];
            "".length();
            if (" ".length() > "  ".length()) {
                return null;
            }
        }
        else {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[57]];
        }
        return s;
    }
    
    private static boolean llIIIllIIIIIIll(final int lllllllllllllIIlllllIIllIIllllII) {
        return lllllllllllllIIlllllIIllIIllllII > 0;
    }
    
    @Override
    public boolean getCanSpawnHere() {
        this.prepareChunkForSpawn();
        "".length();
        return super.getCanSpawnHere();
    }
    
    public void setHorseArmorStack(final ItemStack lllllllllllllIIlllllIllIIlIllllI) {
        this.dataWatcher.updateObject(EntityHorse.lIIIlllIIlIlIl[22], this.getHorseArmorIndex(lllllllllllllIIlllllIllIIlIllllI));
        this.resetTexturePrefix();
    }
    
    public boolean func_110253_bW() {
        return this.isAdultHorse();
    }
    
    public boolean func_175507_cI() {
        return this.field_175508_bO;
    }
    
    @Override
    public boolean isBreedingItem(final ItemStack lllllllllllllIIlllllIlIlIIIIIIIl) {
        return EntityHorse.lIIIlllIIlIlIl[0] != 0;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getAttributeMap().registerAttribute(EntityHorse.horseJumpStrength);
        "".length();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(53.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.22499999403953552);
    }
    
    public boolean canWearArmor() {
        if (llIIIllIIIIIIIl(this.getHorseType())) {
            return EntityHorse.lIIIlllIIlIlIl[1] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[0] != 0;
    }
    
    private static void llIIIlIllllllll() {
        (lIIIlllIIlIlIl = new int[116])[0] = ((0x1B ^ 0x0 ^ (0x1B ^ 0x7)) & (35 + 131 - 81 + 112 ^ 87 + 139 - 84 + 52 ^ -" ".length()));
        EntityHorse.lIIIlllIIlIlIl[1] = " ".length();
        EntityHorse.lIIIlllIIlIlIl[2] = (0xB2 ^ 0xC6 ^ (0x1D ^ 0x6D));
        EntityHorse.lIIIlllIIlIlIl[3] = "  ".length();
        EntityHorse.lIIIlllIIlIlIl[4] = "   ".length();
        EntityHorse.lIIIlllIIlIlIl[5] = (0x45 ^ 0x40);
        EntityHorse.lIIIlllIIlIlIl[6] = (0xC6 ^ 0xC0);
        EntityHorse.lIIIlllIIlIlIl[7] = (0xBF ^ 0xB8);
        EntityHorse.lIIIlllIIlIlIl[8] = (95 + 33 - 121 + 127 ^ 105 + 104 - 205 + 138);
        EntityHorse.lIIIlllIIlIlIl[9] = (0x81 ^ 0x8A);
        EntityHorse.lIIIlllIIlIlIl[10] = (0xA8 ^ 0xA1);
        EntityHorse.lIIIlllIIlIlIl[11] = (0x72 ^ 0x78);
        EntityHorse.lIIIlllIIlIlIl[12] = (60 + 92 - 81 + 94 ^ 116 + 54 - 18 + 17);
        EntityHorse.lIIIlllIIlIlIl[13] = (0x93 ^ 0x9E);
        EntityHorse.lIIIlllIIlIlIl[14] = (0xA1 ^ 0xAF);
        EntityHorse.lIIIlllIIlIlIl[15] = (0x3B ^ 0x34);
        EntityHorse.lIIIlllIIlIlIl[16] = (0x58 ^ 0x48);
        EntityHorse.lIIIlllIIlIlIl[17] = (0xC2 ^ 0xB8 ^ (0xD7 ^ 0xBC));
        EntityHorse.lIIIlllIIlIlIl[18] = (0x96 ^ 0x84);
        EntityHorse.lIIIlllIIlIlIl[19] = (0x76 ^ 0x25 ^ (0xB ^ 0x4B));
        EntityHorse.lIIIlllIIlIlIl[20] = (0x62 ^ 0x76);
        EntityHorse.lIIIlllIIlIlIl[21] = (0x9A ^ 0x83 ^ (0x1B ^ 0x17));
        EntityHorse.lIIIlllIIlIlIl[22] = (0x88 ^ 0x9E);
        EntityHorse.lIIIlllIIlIlIl[23] = (0x6C ^ 0x7B);
        EntityHorse.lIIIlllIIlIlIl[24] = (0x37 ^ 0x2F);
        EntityHorse.lIIIlllIIlIlIl[25] = (21 + 135 + 5 + 24 ^ 61 + 74 - 82 + 107);
        EntityHorse.lIIIlllIIlIlIl[26] = (0x18 ^ 0x2);
        EntityHorse.lIIIlllIIlIlIl[27] = (0x94 ^ 0x8F);
        EntityHorse.lIIIlllIIlIlIl[28] = (0x32 ^ 0x48 ^ (0x9 ^ 0x6F));
        EntityHorse.lIIIlllIIlIlIl[29] = (0x1F ^ 0x3E ^ (0x0 ^ 0x3C));
        EntityHorse.lIIIlllIIlIlIl[30] = (0xBA ^ 0xA4);
        EntityHorse.lIIIlllIIlIlIl[31] = (75 + 95 - 33 + 42 ^ 112 + 58 - 162 + 164);
        EntityHorse.lIIIlllIIlIlIl[32] = (0x36 ^ 0x16);
        EntityHorse.lIIIlllIIlIlIl[33] = (0x25 ^ 0x4);
        EntityHorse.lIIIlllIIlIlIl[34] = (0xE6 ^ 0xC4);
        EntityHorse.lIIIlllIIlIlIl[35] = (0x6C ^ 0x4F);
        EntityHorse.lIIIlllIIlIlIl[36] = (125 + 52 - 176 + 173 ^ 128 + 69 - 66 + 7);
        EntityHorse.lIIIlllIIlIlIl[37] = (0x92 ^ 0xB7);
        EntityHorse.lIIIlllIIlIlIl[38] = -" ".length();
        EntityHorse.lIIIlllIIlIlIl[39] = (0xEF ^ 0xAF);
        EntityHorse.lIIIlllIIlIlIl[40] = (0x51 ^ 0x77);
        EntityHorse.lIIIlllIIlIlIl[41] = (0xC8 ^ 0x8F ^ (0x46 ^ 0x26));
        EntityHorse.lIIIlllIIlIlIl[42] = (0x1F ^ 0x41 ^ (0x33 ^ 0x45));
        EntityHorse.lIIIlllIIlIlIl[43] = (0x38 ^ 0x64 ^ (0x23 ^ 0x56));
        EntityHorse.lIIIlllIIlIlIl[44] = (0x4F ^ 0x65);
        EntityHorse.lIIIlllIIlIlIl[45] = (0x7A ^ 0x51);
        EntityHorse.lIIIlllIIlIlIl[46] = (0x13 ^ 0x3F);
        EntityHorse.lIIIlllIIlIlIl[47] = (0x65 ^ 0x48);
        EntityHorse.lIIIlllIIlIlIl[48] = (0x48 ^ 0x66);
        EntityHorse.lIIIlllIIlIlIl[49] = (0xB1 ^ 0x91 ^ (0x16 ^ 0x19));
        EntityHorse.lIIIlllIIlIlIl[50] = (163 + 60 - 159 + 121 ^ 80 + 113 - 80 + 24);
        EntityHorse.lIIIlllIIlIlIl[51] = (0x74 ^ 0x32 ^ (0xB1 ^ 0xC6));
        EntityHorse.lIIIlllIIlIlIl[52] = (75 + 222 - 250 + 194 ^ 186 + 114 - 145 + 40);
        EntityHorse.lIIIlllIIlIlIl[53] = (99 + 104 - 157 + 89 ^ 16 + 1 + 29 + 134);
        EntityHorse.lIIIlllIIlIlIl[54] = (0x7 ^ 0x33);
        EntityHorse.lIIIlllIIlIlIl[55] = (0x4E ^ 0x7B);
        EntityHorse.lIIIlllIIlIlIl[56] = (0x95 ^ 0xA3);
        EntityHorse.lIIIlllIIlIlIl[57] = (0xD ^ 0x3A);
        EntityHorse.lIIIlllIIlIlIl[58] = (0x8E ^ 0xB6);
        EntityHorse.lIIIlllIIlIlIl[59] = (0x5F ^ 0x66);
        EntityHorse.lIIIlllIIlIlIl[60] = (35 + 157 - 50 + 44 ^ 117 + 115 - 187 + 83);
        EntityHorse.lIIIlllIIlIlIl[61] = (48 + 124 - 89 + 100 ^ 96 + 55 - 110 + 99);
        EntityHorse.lIIIlllIIlIlIl[62] = (0x3F ^ 0x3);
        EntityHorse.lIIIlllIIlIlIl[63] = (0x9C ^ 0xA1);
        EntityHorse.lIIIlllIIlIlIl[64] = (99 + 81 - 29 + 36 ^ 127 + 105 - 171 + 72);
        EntityHorse.lIIIlllIIlIlIl[65] = ("   ".length() ^ (0xF5 ^ 0x92));
        EntityHorse.lIIIlllIIlIlIl[66] = (-(0xFFFFF66F & 0x6DB3) & (0xFFFFFDBB & 0x67F6));
        EntityHorse.lIIIlllIIlIlIl[67] = (0x2F ^ 0x9 ^ (0x56 ^ 0x4F));
        EntityHorse.lIIIlllIIlIlIl[68] = 197 + 26 - 206 + 238;
        EntityHorse.lIIIlllIIlIlIl[69] = (-(0x45 ^ 0x26) & (0xFFFFFFE7 & 0xFF7A));
        EntityHorse.lIIIlllIIlIlIl[70] = (0x8B ^ 0xA7 ^ (0xF5 ^ 0x98));
        EntityHorse.lIIIlllIIlIlIl[71] = (0x84 ^ 0xC6);
        EntityHorse.lIIIlllIIlIlIl[72] = (0xD9 ^ 0x9D) + (0x36 ^ 0x1B) - (0xDB ^ 0x85) + (129 + 20 - 43 + 55);
        EntityHorse.lIIIlllIIlIlIl[73] = (0x38 ^ 0x34) + (0xF6 ^ 0xAC) - -"  ".length() + (8 + 116 - 17 + 29);
        EntityHorse.lIIIlllIIlIlIl[74] = (0x85 ^ 0xC6);
        EntityHorse.lIIIlllIIlIlIl[75] = 37 + 58 + 28 + 77;
        EntityHorse.lIIIlllIIlIlIl[76] = (0xFFFFBB84 & 0x47FF);
        EntityHorse.lIIIlllIIlIlIl[77] = (-(0xFFFFF5DB & 0x7AE6) & (0xFFFFFBEF & 0x75FD));
        EntityHorse.lIIIlllIIlIlIl[78] = 125 + 42 - 141 + 102;
        EntityHorse.lIIIlllIIlIlIl[79] = (206 + 146 - 257 + 129 ^ 82 + 20 - 81 + 143);
        EntityHorse.lIIIlllIIlIlIl[80] = (0x4F ^ 0xA);
        EntityHorse.lIIIlllIIlIlIl[81] = (0x46 ^ 0x0);
        EntityHorse.lIIIlllIIlIlIl[82] = (0xFF ^ 0xB8);
        EntityHorse.lIIIlllIIlIlIl[83] = (0x15 ^ 0x5D);
        EntityHorse.lIIIlllIIlIlIl[84] = (0x9 ^ 0x40);
        EntityHorse.lIIIlllIIlIlIl[85] = (0x10 ^ 0x5A);
        EntityHorse.lIIIlllIIlIlIl[86] = (0xA6 ^ 0xB8 ^ (0xC3 ^ 0x96));
        EntityHorse.lIIIlllIIlIlIl[87] = (0x35 ^ 0x79);
        EntityHorse.lIIIlllIIlIlIl[88] = (0xDD ^ 0x90);
        EntityHorse.lIIIlllIIlIlIl[89] = (0xCC ^ 0x82);
        EntityHorse.lIIIlllIIlIlIl[90] = (0xD1 ^ 0x9E);
        EntityHorse.lIIIlllIIlIlIl[91] = (0x3A ^ 0x6A);
        EntityHorse.lIIIlllIIlIlIl[92] = (0x31 ^ 0x60);
        EntityHorse.lIIIlllIIlIlIl[93] = (0x96 ^ 0xC4);
        EntityHorse.lIIIlllIIlIlIl[94] = (0x6A ^ 0x39);
        EntityHorse.lIIIlllIIlIlIl[95] = (0x26 ^ 0x72);
        EntityHorse.lIIIlllIIlIlIl[96] = (0x0 ^ 0x55);
        EntityHorse.lIIIlllIIlIlIl[97] = (15 + 208 - 165 + 184 ^ 19 + 94 - 2 + 53);
        EntityHorse.lIIIlllIIlIlIl[98] = (0x6C ^ 0x3B);
        EntityHorse.lIIIlllIIlIlIl[99] = (0x65 ^ 0x3D);
        EntityHorse.lIIIlllIIlIlIl[100] = (0xF6 ^ 0xAF);
        EntityHorse.lIIIlllIIlIlIl[101] = (0xE ^ 0x54);
        EntityHorse.lIIIlllIIlIlIl[102] = (110 + 27 - 36 + 56 ^ 63 + 59 - 101 + 177);
        EntityHorse.lIIIlllIIlIlIl[103] = (0x2E ^ 0x72);
        EntityHorse.lIIIlllIIlIlIl[104] = (0x22 ^ 0x7F);
        EntityHorse.lIIIlllIIlIlIl[105] = (66 + 64 - 34 + 152 ^ 66 + 100 - 65 + 65);
        EntityHorse.lIIIlllIIlIlIl[106] = (0xDD ^ 0x82);
        EntityHorse.lIIIlllIIlIlIl[107] = (0x6 ^ 0x66);
        EntityHorse.lIIIlllIIlIlIl[108] = (0xE1 ^ 0xC2 ^ (0xE9 ^ 0xAB));
        EntityHorse.lIIIlllIIlIlIl[109] = (128 + 54 - 175 + 217 ^ 122 + 9 - 101 + 100);
        EntityHorse.lIIIlllIIlIlIl[110] = (0x51 ^ 0x32);
        EntityHorse.lIIIlllIIlIlIl[111] = (0x31 ^ 0x3F ^ (0xE0 ^ 0x8B));
        EntityHorse.lIIIlllIIlIlIl[112] = -(0xFFFFDFC2 & 0x7DFD);
        EntityHorse.lIIIlllIIlIlIl[113] = (-(0x3F ^ 0x36) & (0xFFFF9BFB & 0x65FF));
        EntityHorse.lIIIlllIIlIlIl[114] = (-(0xFFFF9E2D & 0x63DB) & (0xFFFFC7FC & 0x3BFF));
        EntityHorse.lIIIlllIIlIlIl[115] = (0xCD ^ 0xAB);
    }
    
    public boolean isHorseJumping() {
        return this.horseJumping;
    }
    
    private static int llIIIllIIIllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private void func_110210_cH() {
        this.field_110278_bp = EntityHorse.lIIIlllIIlIlIl[1];
    }
    
    private void setHorseTexturePaths() {
        this.texturePrefix = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[67]];
        this.horseTexturesArray[EntityHorse.lIIIlllIIlIlIl[0]] = null;
        this.horseTexturesArray[EntityHorse.lIIIlllIIlIlIl[1]] = null;
        this.horseTexturesArray[EntityHorse.lIIIlllIIlIlIl[3]] = null;
        final int lllllllllllllIIlllllIlIlIlIlIlII = this.getHorseType();
        final int lllllllllllllIIlllllIlIlIlIlIIlI = this.getHorseVariant();
        if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIlIlIlIlII)) {
            final int lllllllllllllIIlllllIlIlIlIlIIII = lllllllllllllIIlllllIlIlIlIlIIlI & EntityHorse.lIIIlllIIlIlIl[68];
            final int lllllllllllllIIlllllIlIlIlIIlllI = (lllllllllllllIIlllllIlIlIlIlIIlI & EntityHorse.lIIIlllIIlIlIl[69]) >> EntityHorse.lIIIlllIIlIlIl[8];
            if (llIIIllIIIIlIlI(lllllllllllllIIlllllIlIlIlIlIIII, EntityHorse.horseTextures.length)) {
                this.field_175508_bO = (EntityHorse.lIIIlllIIlIlIl[0] != 0);
                return;
            }
            this.horseTexturesArray[EntityHorse.lIIIlllIIlIlIl[0]] = EntityHorse.horseTextures[lllllllllllllIIlllllIlIlIlIlIIII];
            this.texturePrefix = String.valueOf(new StringBuilder(String.valueOf(this.texturePrefix)).append(EntityHorse.HORSE_TEXTURES_ABBR[lllllllllllllIIlllllIlIlIlIlIIII]));
            if (llIIIllIIIIlIlI(lllllllllllllIIlllllIlIlIlIIlllI, EntityHorse.horseMarkingTextures.length)) {
                this.field_175508_bO = (EntityHorse.lIIIlllIIlIlIl[0] != 0);
                return;
            }
            this.horseTexturesArray[EntityHorse.lIIIlllIIlIlIl[1]] = EntityHorse.horseMarkingTextures[lllllllllllllIIlllllIlIlIlIIlllI];
            this.texturePrefix = String.valueOf(new StringBuilder(String.valueOf(this.texturePrefix)).append(EntityHorse.HORSE_MARKING_TEXTURES_ABBR[lllllllllllllIIlllllIlIlIlIIlllI]));
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            this.horseTexturesArray[EntityHorse.lIIIlllIIlIlIl[0]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[39]];
            this.texturePrefix = String.valueOf(new StringBuilder(String.valueOf(this.texturePrefix)).append(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[70]]).append(lllllllllllllIIlllllIlIlIlIlIlII).append(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[71]]));
        }
        final int lllllllllllllIIlllllIlIlIlIIllII = this.getHorseArmorIndexSynced();
        if (llIIIllIIIIlIlI(lllllllllllllIIlllllIlIlIlIIllII, EntityHorse.horseArmorTextures.length)) {
            this.field_175508_bO = (EntityHorse.lIIIlllIIlIlIl[0] != 0);
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            this.horseTexturesArray[EntityHorse.lIIIlllIIlIlIl[3]] = EntityHorse.horseArmorTextures[lllllllllllllIIlllllIlIlIlIIllII];
            this.texturePrefix = String.valueOf(new StringBuilder(String.valueOf(this.texturePrefix)).append(EntityHorse.HORSE_ARMOR_TEXTURES_ABBR[lllllllllllllIIlllllIlIlIlIIllII]));
            this.field_175508_bO = (EntityHorse.lIIIlllIIlIlIl[1] != 0);
        }
    }
    
    public int getHorseType() {
        return this.dataWatcher.getWatchableObjectByte(EntityHorse.lIIIlllIIlIlIl[19]);
    }
    
    public int getTemper() {
        return this.temper;
    }
    
    public void setOwnerId(final String lllllllllllllIIlllllIllIlIIllIlI) {
        this.dataWatcher.updateObject(EntityHorse.lIIIlllIIlIlIl[21], lllllllllllllIIlllllIllIlIIllIlI);
    }
    
    private static String llIIIlIllIIllIl(final String lllllllllllllIIlllllIIlllIIlIIII, final String lllllllllllllIIlllllIIlllIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllllIIlllIIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllIIlllIIlIIIl.getBytes(StandardCharsets.UTF_8)), EntityHorse.lIIIlllIIlIlIl[8]), "DES");
            final Cipher lllllllllllllIIlllllIIlllIIlIlII = Cipher.getInstance("DES");
            lllllllllllllIIlllllIIlllIIlIlII.init(EntityHorse.lIIIlllIIlIlIl[3], lllllllllllllIIlllllIIlllIIlIlIl);
            return new String(lllllllllllllIIlllllIIlllIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllIIlllIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllllIIlllIIlIIll) {
            lllllllllllllIIlllllIIlllIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private void initHorseChest() {
        final AnimalChest lllllllllllllIIlllllIlIlllllIIlI = this.horseChest;
        this.horseChest = new AnimalChest(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[42]], this.getChestSize());
        this.horseChest.setCustomName(this.getName());
        if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIlllllIIlI)) {
            lllllllllllllIIlllllIlIlllllIIlI.func_110132_b(this);
            final int lllllllllllllIIlllllIlIlllllIIIl = Math.min(lllllllllllllIIlllllIlIlllllIIlI.getSizeInventory(), this.horseChest.getSizeInventory());
            int lllllllllllllIIlllllIlIlllllIIII = EntityHorse.lIIIlllIIlIlIl[0];
            "".length();
            if (-" ".length() >= ((0xC8 ^ 0x8E ^ (0x4C ^ 0x23)) & (158 + 70 - 125 + 58 ^ 103 + 78 - 61 + 16 ^ -" ".length()))) {
                return;
            }
            while (!llIIIllIIIIlIlI(lllllllllllllIIlllllIlIlllllIIII, lllllllllllllIIlllllIlIlllllIIIl)) {
                final ItemStack lllllllllllllIIlllllIlIllllIllll = lllllllllllllIIlllllIlIlllllIIlI.getStackInSlot(lllllllllllllIIlllllIlIlllllIIII);
                if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIllllIllll)) {
                    this.horseChest.setInventorySlotContents(lllllllllllllIIlllllIlIlllllIIII, lllllllllllllIIlllllIlIllllIllll.copy());
                }
                ++lllllllllllllIIlllllIlIlllllIIII;
            }
        }
        this.horseChest.func_110134_a(this);
        this.updateHorseSlots();
    }
    
    @Override
    protected void playStepSound(final BlockPos lllllllllllllIIlllllIlIllIIIllII, final Block lllllllllllllIIlllllIlIllIIlIIlI) {
        Block.SoundType lllllllllllllIIlllllIlIllIIlIIIl = lllllllllllllIIlllllIlIllIIlIIlI.stepSound;
        if (llIIIllIIIIIlIl(this.worldObj.getBlockState(lllllllllllllIIlllllIlIllIIIllII.up()).getBlock(), Blocks.snow_layer)) {
            lllllllllllllIIlllllIlIllIIlIIIl = Blocks.snow_layer.stepSound;
        }
        if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIllIIlIIlI.getMaterial().isLiquid() ? 1 : 0)) {
            final int lllllllllllllIIlllllIlIllIIIllll = this.getHorseType();
            if (llIIIllIIIIIllI(this.riddenByEntity) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIIIllll, EntityHorse.lIIIlllIIlIlIl[1]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIIIllll, EntityHorse.lIIIlllIIlIlIl[3])) {
                this.gallopTime += EntityHorse.lIIIlllIIlIlIl[1];
                if (llIIIllIIIIlIll(this.gallopTime, EntityHorse.lIIIlllIIlIlIl[5]) && llIIIllIIIIIIIl(this.gallopTime % EntityHorse.lIIIlllIIlIlIl[4])) {
                    this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[60]], lllllllllllllIIlllllIlIllIIlIIIl.getVolume() * 0.15f, lllllllllllllIIlllllIlIllIIlIIIl.getFrequency());
                    if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIllIIIllll) && llIIIllIIIIIIIl(this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[11]))) {
                        this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[61]], lllllllllllllIIlllllIlIllIIlIIIl.getVolume() * 0.6f, lllllllllllllIIlllllIlIllIIlIIIl.getFrequency());
                        "".length();
                        if ((48 + 40 - 84 + 137 ^ 113 + 33 - 40 + 31) < 0) {
                            return;
                        }
                    }
                }
                else if (llIIIllIIIlIIII(this.gallopTime, EntityHorse.lIIIlllIIlIlIl[5])) {
                    this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[62]], lllllllllllllIIlllllIlIllIIlIIIl.getVolume() * 0.15f, lllllllllllllIIlllllIlIllIIlIIIl.getFrequency());
                    "".length();
                    if ("   ".length() >= (0x20 ^ 0x7D ^ (0x31 ^ 0x68))) {
                        return;
                    }
                }
            }
            else if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIllIIlIIIl, Block.soundTypeWood)) {
                this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[63]], lllllllllllllIIlllllIlIllIIlIIIl.getVolume() * 0.15f, lllllllllllllIIlllllIlIllIIlIIIl.getFrequency());
                "".length();
                if (((0xD ^ 0x17 ^ (0x12 ^ 0x5F)) & (42 + 188 - 39 + 46 ^ 21 + 118 - 83 + 130 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[64]], lllllllllllllIIlllllIlIllIIlIIIl.getVolume() * 0.15f, lllllllllllllIIlllllIlIllIIlIIIl.getFrequency());
            }
        }
    }
    
    private float getModifiedMaxHealth() {
        return 15.0f + this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[8]) + this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[10]);
    }
    
    @Override
    public void setScaleForAge(final boolean lllllllllllllIIlllllIllIlIIlIlIl) {
        if (llIIIllIIIIIIII(lllllllllllllIIlllllIllIlIIlIlIl ? 1 : 0)) {
            this.setScale(this.getHorseSize());
            "".length();
            if (" ".length() == "  ".length()) {
                return;
            }
        }
        else {
            this.setScale(1.0f);
        }
    }
    
    private void setHorseWatchableBoolean(final int lllllllllllllIIlllllIllIlIllIIlI, final boolean lllllllllllllIIlllllIllIlIllIIIl) {
        final int lllllllllllllIIlllllIllIlIllIIII = this.dataWatcher.getWatchableObjectInt(EntityHorse.lIIIlllIIlIlIl[16]);
        if (llIIIllIIIIIIII(lllllllllllllIIlllllIllIlIllIIIl ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityHorse.lIIIlllIIlIlIl[16], lllllllllllllIIlllllIllIlIllIIII | lllllllllllllIIlllllIllIlIllIIlI);
            "".length();
            if ("   ".length() > (0x58 ^ 0x5C)) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityHorse.lIIIlllIIlIlIl[16], lllllllllllllIIlllllIllIlIllIIII & (lllllllllllllIIlllllIllIlIllIIlI ^ EntityHorse.lIIIlllIIlIlIl[38]));
        }
    }
    
    private void func_110266_cB() {
        this.openHorseMouth();
        if (llIIIllIIIIIIIl(this.isSilent() ? 1 : 0)) {
            this.worldObj.playSoundAtEntity(this, EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[40]], 1.0f, 1.0f + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f);
        }
    }
    
    @Override
    public EntityAgeable createChild(final EntityAgeable lllllllllllllIIlllllIlIIIlIllIIl) {
        final EntityHorse lllllllllllllIIlllllIlIIIlIllIII = (EntityHorse)lllllllllllllIIlllllIlIIIlIllIIl;
        final EntityHorse lllllllllllllIIlllllIlIIIlIlIlll = new EntityHorse(this.worldObj);
        final int lllllllllllllIIlllllIlIIIlIlIllI = this.getHorseType();
        final int lllllllllllllIIlllllIlIIIlIlIlIl = lllllllllllllIIlllllIlIIIlIllIII.getHorseType();
        int lllllllllllllIIlllllIlIIIlIlIlII = EntityHorse.lIIIlllIIlIlIl[0];
        if (llIIIllIIIIlllI(lllllllllllllIIlllllIlIIIlIlIllI, lllllllllllllIIlllllIlIIIlIlIlIl)) {
            lllllllllllllIIlllllIlIIIlIlIlII = lllllllllllllIIlllllIlIIIlIlIllI;
            "".length();
            if (" ".length() > "   ".length()) {
                return null;
            }
        }
        else if ((llIIIllIIIIIIIl(lllllllllllllIIlllllIlIIIlIlIllI) && !llIIIllIIIIlIIl(lllllllllllllIIlllllIlIIIlIlIlIl, EntityHorse.lIIIlllIIlIlIl[1])) || (llIIIllIIIIlllI(lllllllllllllIIlllllIlIIIlIlIllI, EntityHorse.lIIIlllIIlIlIl[1]) && llIIIllIIIIIIIl(lllllllllllllIIlllllIlIIIlIlIlIl))) {
            lllllllllllllIIlllllIlIIIlIlIlII = EntityHorse.lIIIlllIIlIlIl[3];
        }
        if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIIIlIlIlII)) {
            final int lllllllllllllIIlllllIlIIIlIlIIll = this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[10]);
            int lllllllllllllIIlllllIlIIIlIlIIII = 0;
            if (llIIIllIIIlIllI(lllllllllllllIIlllllIlIIIlIlIIll, EntityHorse.lIIIlllIIlIlIl[2])) {
                final int lllllllllllllIIlllllIlIIIlIlIIlI = this.getHorseVariant() & EntityHorse.lIIIlllIIlIlIl[68];
                "".length();
                if (((0x71 ^ 0x37 ^ (0x70 ^ 0x3)) & (0x89 ^ 0xAF ^ (0x54 ^ 0x47) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else if (llIIIllIIIlIllI(lllllllllllllIIlllllIlIIIlIlIIll, EntityHorse.lIIIlllIIlIlIl[8])) {
                final int lllllllllllllIIlllllIlIIIlIlIIIl = lllllllllllllIIlllllIlIIIlIllIII.getHorseVariant() & EntityHorse.lIIIlllIIlIlIl[68];
                "".length();
                if (-"  ".length() >= 0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlllllIlIIIlIlIIII = this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[7]);
            }
            final int lllllllllllllIIlllllIlIIIlIIllll = this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[5]);
            if (llIIIllIIIlIllI(lllllllllllllIIlllllIlIIIlIIllll, EntityHorse.lIIIlllIIlIlIl[3])) {
                lllllllllllllIIlllllIlIIIlIlIIII |= (this.getHorseVariant() & EntityHorse.lIIIlllIIlIlIl[69]);
                "".length();
                if (-" ".length() == "   ".length()) {
                    return null;
                }
            }
            else if (llIIIllIIIlIllI(lllllllllllllIIlllllIlIIIlIIllll, EntityHorse.lIIIlllIIlIlIl[2])) {
                lllllllllllllIIlllllIlIIIlIlIIII |= (lllllllllllllIIlllllIlIIIlIllIII.getHorseVariant() & EntityHorse.lIIIlllIIlIlIl[69]);
                "".length();
                if ((0x68 ^ 0x6C) != (0xA2 ^ 0xA6)) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlllllIlIIIlIlIIII |= (this.rand.nextInt(EntityHorse.lIIIlllIIlIlIl[5]) << EntityHorse.lIIIlllIIlIlIl[8] & EntityHorse.lIIIlllIIlIlIl[69]);
            }
            lllllllllllllIIlllllIlIIIlIlIlll.setHorseVariant(lllllllllllllIIlllllIlIIIlIlIIII);
        }
        lllllllllllllIIlllllIlIIIlIlIlll.setHorseType(lllllllllllllIIlllllIlIIIlIlIlII);
        final double lllllllllllllIIlllllIlIIIlIIlllI = this.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue() + lllllllllllllIIlllllIlIIIlIllIIl.getEntityAttribute(SharedMonsterAttributes.maxHealth).getBaseValue() + this.getModifiedMaxHealth();
        lllllllllllllIIlllllIlIIIlIlIlll.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(lllllllllllllIIlllllIlIIIlIIlllI / 3.0);
        final double lllllllllllllIIlllllIlIIIlIIllIl = this.getEntityAttribute(EntityHorse.horseJumpStrength).getBaseValue() + lllllllllllllIIlllllIlIIIlIllIIl.getEntityAttribute(EntityHorse.horseJumpStrength).getBaseValue() + this.getModifiedJumpStrength();
        lllllllllllllIIlllllIlIIIlIlIlll.getEntityAttribute(EntityHorse.horseJumpStrength).setBaseValue(lllllllllllllIIlllllIlIIIlIIllIl / 3.0);
        final double lllllllllllllIIlllllIlIIIlIIllII = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getBaseValue() + lllllllllllllIIlllllIlIIIlIllIIl.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getBaseValue() + this.getModifiedMovementSpeed();
        lllllllllllllIIlllllIlIIIlIlIlll.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(lllllllllllllIIlllllIlIIIlIIllII / 3.0);
        return lllllllllllllIIlllllIlIIIlIlIlll;
    }
    
    public void dropChestItems() {
        this.dropItemsInChest(this, this.horseChest);
        this.dropChests();
    }
    
    @Override
    protected String getDeathSound() {
        this.openHorseMouth();
        final int lllllllllllllIIlllllIlIllIllllII = this.getHorseType();
        String s;
        if (llIIIllIIIIlllI(lllllllllllllIIlllllIlIllIllllII, EntityHorse.lIIIlllIIlIlIl[4])) {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[46]];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (llIIIllIIIIlllI(lllllllllllllIIlllllIlIllIllllII, EntityHorse.lIIIlllIIlIlIl[2])) {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[47]];
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        else if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIllllII, EntityHorse.lIIIlllIIlIlIl[1]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllIllllII, EntityHorse.lIIIlllIIlIlIl[3])) {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[48]];
            "".length();
            if ((0x6A ^ 0x2E ^ (0x64 ^ 0x24)) <= 0) {
                return null;
            }
        }
        else {
            s = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[49]];
        }
        return s;
    }
    
    private static boolean llIIIllIIIIlIll(final int lllllllllllllIIlllllIIllIlIlIlIl, final int lllllllllllllIIlllllIIllIlIlIlII) {
        return lllllllllllllIIlllllIIllIlIlIlIl > lllllllllllllIIlllllIIllIlIlIlII;
    }
    
    public boolean isUndead() {
        final int lllllllllllllIIlllllIlIlIIIIlIII = this.getHorseType();
        if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIlIIIIlIII, EntityHorse.lIIIlllIIlIlIl[4]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIlIIIIlIII, EntityHorse.lIIIlllIIlIlIl[2])) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
    }
    
    private static int llIIIllIIIlllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private boolean getHorseWatchableBoolean(final int lllllllllllllIIlllllIllIlIlllIII) {
        if (llIIIllIIIIIIII(this.dataWatcher.getWatchableObjectInt(EntityHorse.lIIIlllIIlIlIl[16]) & lllllllllllllIIlllllIllIlIlllIII)) {
            return EntityHorse.lIIIlllIIlIlIl[1] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[0] != 0;
    }
    
    public static boolean isArmorItem(final Item lllllllllllllIIlllllIIllllIIIlII) {
        if (llIIIllIIIIlIII(lllllllllllllIIlllllIIllllIIIlII, Items.iron_horse_armor) && llIIIllIIIIlIII(lllllllllllllIIlllllIIllllIIIlII, Items.golden_horse_armor) && llIIIllIIIIlIII(lllllllllllllIIlllllIIllllIIIlII, Items.diamond_horse_armor)) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
    }
    
    private void mountTo(final EntityPlayer lllllllllllllIIlllllIlIlIIIllIlI) {
        lllllllllllllIIlllllIlIlIIIllIlI.rotationYaw = this.rotationYaw;
        lllllllllllllIIlllllIlIlIIIllIlI.rotationPitch = this.rotationPitch;
        this.setEatingHaystack((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
        this.setRearing((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
        if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            lllllllllllllIIlllllIlIlIIIllIlI.mountEntity(this);
        }
    }
    
    private static int llIIIllIIIIllII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int llIIIllIIIlllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public boolean allowLeashing() {
        if (llIIIllIIIIIIIl(this.isUndead() ? 1 : 0) && llIIIllIIIIIIII(super.allowLeashing() ? 1 : 0)) {
            return EntityHorse.lIIIlllIIlIlIl[1] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[0] != 0;
    }
    
    static {
        llIIIlIllllllll();
        llIIIlIllllllII();
        horseBreedingSelector = (Predicate)new Predicate<Entity>() {
            private static final /* synthetic */ int[] llIlIIlIlllIIl;
            
            private static boolean lIIlIIlIlIllllII(final int llllllllllllIllIllIIIIIlIIlIIlll) {
                return llllllllllllIllIllIIIIIlIIlIIlll != 0;
            }
            
            static {
                lIIlIIlIlIlllIll();
            }
            
            public boolean apply(final Entity llllllllllllIllIllIIIIIlIIlIlllI) {
                if (lIIlIIlIlIllllII((llllllllllllIllIllIIIIIlIIlIlllI instanceof EntityHorse) ? 1 : 0) && lIIlIIlIlIllllII(((EntityHorse)llllllllllllIllIllIIIIIlIIlIlllI).isBreeding() ? 1 : 0)) {
                    return EntityHorse$1.llIlIIlIlllIIl[0] != 0;
                }
                return EntityHorse$1.llIlIIlIlllIIl[1] != 0;
            }
            
            private static void lIIlIIlIlIlllIll() {
                (llIlIIlIlllIIl = new int[2])[0] = " ".length();
                EntityHorse$1.llIlIIlIlllIIl[1] = ((0x46 ^ 0x4A) & ~(0x70 ^ 0x7C));
            }
        };
        horseJumpStrength = new RangedAttribute(null, EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[0]], 0.7, 0.0, 2.0).setDescription(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[1]]).setShouldWatch((boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
        final String[] horseArmorTextures2 = new String[EntityHorse.lIIIlllIIlIlIl[2]];
        horseArmorTextures2[EntityHorse.lIIIlllIIlIlIl[1]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[3]];
        horseArmorTextures2[EntityHorse.lIIIlllIIlIlIl[3]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[4]];
        horseArmorTextures2[EntityHorse.lIIIlllIIlIlIl[4]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[2]];
        horseArmorTextures = horseArmorTextures2;
        final String[] horse_ARMOR_TEXTURES_ABBR = new String[EntityHorse.lIIIlllIIlIlIl[2]];
        horse_ARMOR_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[0]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[5]];
        horse_ARMOR_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[1]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[6]];
        horse_ARMOR_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[3]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[7]];
        horse_ARMOR_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[4]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[8]];
        HORSE_ARMOR_TEXTURES_ABBR = horse_ARMOR_TEXTURES_ABBR;
        final int[] armorValues2 = new int[EntityHorse.lIIIlllIIlIlIl[2]];
        armorValues2[EntityHorse.lIIIlllIIlIlIl[1]] = EntityHorse.lIIIlllIIlIlIl[5];
        armorValues2[EntityHorse.lIIIlllIIlIlIl[3]] = EntityHorse.lIIIlllIIlIlIl[7];
        armorValues2[EntityHorse.lIIIlllIIlIlIl[4]] = EntityHorse.lIIIlllIIlIlIl[9];
        armorValues = armorValues2;
        final String[] horseTextures2 = new String[EntityHorse.lIIIlllIIlIlIl[7]];
        horseTextures2[EntityHorse.lIIIlllIIlIlIl[0]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[10]];
        horseTextures2[EntityHorse.lIIIlllIIlIlIl[1]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[11]];
        horseTextures2[EntityHorse.lIIIlllIIlIlIl[3]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[9]];
        horseTextures2[EntityHorse.lIIIlllIIlIlIl[4]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[12]];
        horseTextures2[EntityHorse.lIIIlllIIlIlIl[2]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[13]];
        horseTextures2[EntityHorse.lIIIlllIIlIlIl[5]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[14]];
        horseTextures2[EntityHorse.lIIIlllIIlIlIl[6]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[15]];
        horseTextures = horseTextures2;
        final String[] horse_TEXTURES_ABBR = new String[EntityHorse.lIIIlllIIlIlIl[7]];
        horse_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[0]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[16]];
        horse_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[1]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[17]];
        horse_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[3]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[18]];
        horse_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[4]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[19]];
        horse_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[2]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[20]];
        horse_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[5]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[21]];
        horse_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[6]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[22]];
        HORSE_TEXTURES_ABBR = horse_TEXTURES_ABBR;
        final String[] horseMarkingTextures2 = new String[EntityHorse.lIIIlllIIlIlIl[5]];
        horseMarkingTextures2[EntityHorse.lIIIlllIIlIlIl[1]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[23]];
        horseMarkingTextures2[EntityHorse.lIIIlllIIlIlIl[3]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[24]];
        horseMarkingTextures2[EntityHorse.lIIIlllIIlIlIl[4]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[25]];
        horseMarkingTextures2[EntityHorse.lIIIlllIIlIlIl[2]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[26]];
        horseMarkingTextures = horseMarkingTextures2;
        final String[] horse_MARKING_TEXTURES_ABBR = new String[EntityHorse.lIIIlllIIlIlIl[5]];
        horse_MARKING_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[0]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[27]];
        horse_MARKING_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[1]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[28]];
        horse_MARKING_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[3]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[29]];
        horse_MARKING_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[4]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[30]];
        horse_MARKING_TEXTURES_ABBR[EntityHorse.lIIIlllIIlIlIl[2]] = EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[31]];
        HORSE_MARKING_TEXTURES_ABBR = horse_MARKING_TEXTURES_ABBR;
    }
    
    @Override
    public void fall(final float lllllllllllllIIlllllIllIIIIIIIll, final float lllllllllllllIIlllllIllIIIIIlIII) {
        if (llIIIllIIIIIIll(llIIIllIIIIIlll(lllllllllllllIIlllllIllIIIIIIIll, 1.0f))) {
            this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[41]], 0.4f, 1.0f);
        }
        final int lllllllllllllIIlllllIllIIIIIIlll = MathHelper.ceiling_float_int((lllllllllllllIIlllllIllIIIIIIIll * 0.5f - 3.0f) * lllllllllllllIIlllllIllIIIIIlIII);
        if (llIIIllIIIIIIll(lllllllllllllIIlllllIllIIIIIIlll)) {
            this.attackEntityFrom(DamageSource.fall, (float)lllllllllllllIIlllllIllIIIIIIlll);
            "".length();
            if (llIIIllIIIIIllI(this.riddenByEntity)) {
                this.riddenByEntity.attackEntityFrom(DamageSource.fall, (float)lllllllllllllIIlllllIllIIIIIIlll);
                "".length();
            }
            final Block lllllllllllllIIlllllIllIIIIIIllI = this.worldObj.getBlockState(new BlockPos(this.posX, this.posY - 0.2 - this.prevRotationYaw, this.posZ)).getBlock();
            if (llIIIllIIIIlIII(lllllllllllllIIlllllIllIIIIIIllI.getMaterial(), Material.air) && llIIIllIIIIIIIl(this.isSilent() ? 1 : 0)) {
                final Block.SoundType lllllllllllllIIlllllIllIIIIIIlIl = lllllllllllllIIlllllIllIIIIIIllI.stepSound;
                this.worldObj.playSoundAtEntity(this, lllllllllllllIIlllllIllIIIIIIlIl.getStepSound(), lllllllllllllIIlllllIllIIIIIIlIl.getVolume() * 0.5f, lllllllllllllIIlllllIllIIIIIIlIl.getFrequency() * 0.75f);
            }
        }
    }
    
    private static boolean llIIIllIIIIIlIl(final Object lllllllllllllIIlllllIIllIlIIllIl, final Object lllllllllllllIIlllllIIllIlIIllII) {
        return lllllllllllllIIlllllIIllIlIIllIl == lllllllllllllIIlllllIIllIlIIllII;
    }
    
    @Override
    public boolean interact(final EntityPlayer lllllllllllllIIlllllIlIlIIlIlIll) {
        final ItemStack lllllllllllllIIlllllIlIlIIlIlIlI = lllllllllllllIIlllllIlIlIIlIlIll.inventory.getCurrentItem();
        if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIlIIlIlIlI) && llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.spawn_egg)) {
            return super.interact(lllllllllllllIIlllllIlIlIIlIlIll);
        }
        if (llIIIllIIIIIIIl(this.isTame() ? 1 : 0) && llIIIllIIIIIIII(this.isUndead() ? 1 : 0)) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        if (llIIIllIIIIIIII(this.isTame() ? 1 : 0) && llIIIllIIIIIIII(this.isAdultHorse() ? 1 : 0) && llIIIllIIIIIIII(lllllllllllllIIlllllIlIlIIlIlIll.isSneaking() ? 1 : 0)) {
            this.openGUI(lllllllllllllIIlllllIlIlIIlIlIll);
            return EntityHorse.lIIIlllIIlIlIl[1] != 0;
        }
        if (llIIIllIIIIIIII(this.func_110253_bW() ? 1 : 0) && llIIIllIIIIIllI(this.riddenByEntity)) {
            return super.interact(lllllllllllllIIlllllIlIlIIlIlIll);
        }
        if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIlIIlIlIlI)) {
            boolean lllllllllllllIIlllllIlIlIIlIlIIl = EntityHorse.lIIIlllIIlIlIl[0] != 0;
            if (llIIIllIIIIIIII(this.canWearArmor() ? 1 : 0)) {
                int lllllllllllllIIlllllIlIlIIlIlIII = EntityHorse.lIIIlllIIlIlIl[38];
                if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.iron_horse_armor)) {
                    lllllllllllllIIlllllIlIlIIlIlIII = EntityHorse.lIIIlllIIlIlIl[1];
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return ((0x51 ^ 0x71) & ~(0x2C ^ 0xC)) != 0x0;
                    }
                }
                else if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.golden_horse_armor)) {
                    lllllllllllllIIlllllIlIlIIlIlIII = EntityHorse.lIIIlllIIlIlIl[3];
                    "".length();
                    if ("  ".length() == 0) {
                        return ((0x1E ^ 0x9) & ~(0x19 ^ 0xE)) != 0x0;
                    }
                }
                else if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.diamond_horse_armor)) {
                    lllllllllllllIIlllllIlIlIIlIlIII = EntityHorse.lIIIlllIIlIlIl[4];
                }
                if (llIIIllIIIlIlIl(lllllllllllllIIlllllIlIlIIlIlIII)) {
                    if (llIIIllIIIIIIIl(this.isTame() ? 1 : 0)) {
                        this.makeHorseRearWithSound();
                        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
                    }
                    this.openGUI(lllllllllllllIIlllllIlIlIIlIlIll);
                    return EntityHorse.lIIIlllIIlIlIl[1] != 0;
                }
            }
            if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIlIIlIlIIl ? 1 : 0) && llIIIllIIIIIIIl(this.isUndead() ? 1 : 0)) {
                float lllllllllllllIIlllllIlIlIIlIIlll = 0.0f;
                int lllllllllllllIIlllllIlIlIIlIIllI = EntityHorse.lIIIlllIIlIlIl[0];
                int lllllllllllllIIlllllIlIlIIlIIlIl = EntityHorse.lIIIlllIIlIlIl[0];
                if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.wheat)) {
                    lllllllllllllIIlllllIlIlIIlIIlll = 2.0f;
                    lllllllllllllIIlllllIlIlIIlIIllI = EntityHorse.lIIIlllIIlIlIl[20];
                    lllllllllllllIIlllllIlIlIIlIIlIl = EntityHorse.lIIIlllIIlIlIl[4];
                    "".length();
                    if (null != null) {
                        return ((15 + 156 - 21 + 24 ^ 72 + 19 - 9 + 48) & (97 + 60 - 31 + 23 ^ 32 + 54 - 18 + 117 ^ -" ".length())) != 0x0;
                    }
                }
                else if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.sugar)) {
                    lllllllllllllIIlllllIlIlIIlIIlll = 1.0f;
                    lllllllllllllIIlllllIlIlIIlIIllI = EntityHorse.lIIIlllIIlIlIl[30];
                    lllllllllllllIIlllllIlIlIIlIIlIl = EntityHorse.lIIIlllIIlIlIl[4];
                    "".length();
                    if (" ".length() == ((0x4 ^ 0x2A) & ~(0xE9 ^ 0xC7))) {
                        return ((0x20 ^ 0x3F) & ~(0x76 ^ 0x69)) != 0x0;
                    }
                }
                else if (llIIIllIIIIIlIl(Block.getBlockFromItem(lllllllllllllIIlllllIlIlIIlIlIlI.getItem()), Blocks.hay_block)) {
                    lllllllllllllIIlllllIlIlIIlIIlll = 20.0f;
                    lllllllllllllIIlllllIlIlIIlIIllI = EntityHorse.lIIIlllIIlIlIl[72];
                    "".length();
                    if ((0x92 ^ 0x96) <= -" ".length()) {
                        return ((0x2B ^ 0x77) & ~(0x4 ^ 0x58)) != 0x0;
                    }
                }
                else if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.apple)) {
                    lllllllllllllIIlllllIlIlIIlIIlll = 3.0f;
                    lllllllllllllIIlllllIlIlIIlIIllI = EntityHorse.lIIIlllIIlIlIl[62];
                    lllllllllllllIIlllllIlIlIIlIIlIl = EntityHorse.lIIIlllIIlIlIl[4];
                    "".length();
                    if ((0x81 ^ 0x85) < "  ".length()) {
                        return ((0xE4 ^ 0xBD) & ~(0xD ^ 0x54)) != 0x0;
                    }
                }
                else if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.golden_carrot)) {
                    lllllllllllllIIlllllIlIlIIlIIlll = 4.0f;
                    lllllllllllllIIlllllIlIlIIlIIllI = EntityHorse.lIIIlllIIlIlIl[62];
                    lllllllllllllIIlllllIlIlIIlIIlIl = EntityHorse.lIIIlllIIlIlIl[5];
                    if (llIIIllIIIIIIII(this.isTame() ? 1 : 0) && llIIIllIIIIIIIl(this.getGrowingAge())) {
                        lllllllllllllIIlllllIlIlIIlIlIIl = (EntityHorse.lIIIlllIIlIlIl[1] != 0);
                        this.setInLove(lllllllllllllIIlllllIlIlIIlIlIll);
                        "".length();
                        if (" ".length() <= -" ".length()) {
                            return ((110 + 120 - 184 + 90 ^ 55 + 29 - 24 + 93) & (13 + 2 + 62 + 82 ^ 11 + 55 - 55 + 131 ^ -" ".length())) != 0x0;
                        }
                    }
                }
                else if (llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.golden_apple)) {
                    lllllllllllllIIlllllIlIlIIlIIlll = 10.0f;
                    lllllllllllllIIlllllIlIlIIlIIllI = EntityHorse.lIIIlllIIlIlIl[73];
                    lllllllllllllIIlllllIlIlIIlIIlIl = EntityHorse.lIIIlllIIlIlIl[11];
                    if (llIIIllIIIIIIII(this.isTame() ? 1 : 0) && llIIIllIIIIIIIl(this.getGrowingAge())) {
                        lllllllllllllIIlllllIlIlIIlIlIIl = (EntityHorse.lIIIlllIIlIlIl[1] != 0);
                        this.setInLove(lllllllllllllIIlllllIlIlIIlIlIll);
                    }
                }
                if (llIIIllIIIIllIl(llIIIllIIIlIIll(this.getHealth(), this.getMaxHealth())) && llIIIllIIIIIIll(llIIIllIIIlIlII(lllllllllllllIIlllllIlIlIIlIIlll, 0.0f))) {
                    this.heal(lllllllllllllIIlllllIlIlIIlIIlll);
                    lllllllllllllIIlllllIlIlIIlIlIIl = (EntityHorse.lIIIlllIIlIlIl[1] != 0);
                }
                if (llIIIllIIIIIIIl(this.isAdultHorse() ? 1 : 0) && llIIIllIIIIIIll(lllllllllllllIIlllllIlIlIIlIIllI)) {
                    this.addGrowth(lllllllllllllIIlllllIlIlIIlIIllI);
                    lllllllllllllIIlllllIlIlIIlIlIIl = (EntityHorse.lIIIlllIIlIlIl[1] != 0);
                }
                if (llIIIllIIIIIIll(lllllllllllllIIlllllIlIlIIlIIlIl) && (!llIIIllIIIIIIIl(lllllllllllllIIlllllIlIlIIlIlIIl ? 1 : 0) || llIIIllIIIIIIIl(this.isTame() ? 1 : 0)) && llIIIllIIIlIllI(lllllllllllllIIlllllIlIlIIlIIlIl, this.getMaxTemper())) {
                    lllllllllllllIIlllllIlIlIIlIlIIl = (EntityHorse.lIIIlllIIlIlIl[1] != 0);
                    this.increaseTemper(lllllllllllllIIlllllIlIlIIlIIlIl);
                    "".length();
                }
                if (llIIIllIIIIIIII(lllllllllllllIIlllllIlIlIIlIlIIl ? 1 : 0)) {
                    this.func_110266_cB();
                }
            }
            if (llIIIllIIIIIIIl(this.isTame() ? 1 : 0) && llIIIllIIIIIIIl(lllllllllllllIIlllllIlIlIIlIlIIl ? 1 : 0)) {
                if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIlIIlIlIlI) && llIIIllIIIIIIII(lllllllllllllIIlllllIlIlIIlIlIlI.interactWithEntity(lllllllllllllIIlllllIlIlIIlIlIll, this) ? 1 : 0)) {
                    return EntityHorse.lIIIlllIIlIlIl[1] != 0;
                }
                this.makeHorseRearWithSound();
                return EntityHorse.lIIIlllIIlIlIl[1] != 0;
            }
            else {
                if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIlIIlIlIIl ? 1 : 0) && llIIIllIIIIIIII(this.canCarryChest() ? 1 : 0) && llIIIllIIIIIIIl(this.isChested() ? 1 : 0) && llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Item.getItemFromBlock(Blocks.chest))) {
                    this.setChested((boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
                    this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[74]], 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                    lllllllllllllIIlllllIlIlIIlIlIIl = (EntityHorse.lIIIlllIIlIlIl[1] != 0);
                    this.initHorseChest();
                }
                if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIlIIlIlIIl ? 1 : 0) && llIIIllIIIIIIII(this.func_110253_bW() ? 1 : 0) && llIIIllIIIIIIIl(this.isHorseSaddled() ? 1 : 0) && llIIIllIIIIIlIl(lllllllllllllIIlllllIlIlIIlIlIlI.getItem(), Items.saddle)) {
                    this.openGUI(lllllllllllllIIlllllIlIlIIlIlIll);
                    return EntityHorse.lIIIlllIIlIlIl[1] != 0;
                }
                if (llIIIllIIIIIIII(lllllllllllllIIlllllIlIlIIlIlIIl ? 1 : 0)) {
                    if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIlIIlIlIll.capabilities.isCreativeMode ? 1 : 0)) {
                        final ItemStack itemStack = lllllllllllllIIlllllIlIlIIlIlIlI;
                        final int n = itemStack.stackSize - EntityHorse.lIIIlllIIlIlIl[1];
                        itemStack.stackSize = n;
                        if (llIIIllIIIIIIIl(n)) {
                            lllllllllllllIIlllllIlIlIIlIlIll.inventory.setInventorySlotContents(lllllllllllllIIlllllIlIlIIlIlIll.inventory.currentItem, null);
                        }
                    }
                    return EntityHorse.lIIIlllIIlIlIl[1] != 0;
                }
            }
        }
        if (!llIIIllIIIIIIII(this.func_110253_bW() ? 1 : 0) || !llIIIllIIIIIlII(this.riddenByEntity)) {
            return super.interact(lllllllllllllIIlllllIlIlIIlIlIll);
        }
        if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIlIIlIlIlI) && llIIIllIIIIIIII(lllllllllllllIIlllllIlIlIIlIlIlI.interactWithEntity(lllllllllllllIIlllllIlIlIIlIlIll, this) ? 1 : 0)) {
            return EntityHorse.lIIIlllIIlIlIl[1] != 0;
        }
        this.mountTo(lllllllllllllIIlllllIlIlIIlIlIll);
        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
    }
    
    public void setBreeding(final boolean lllllllllllllIIlllllIllIIlIlIllI) {
        this.setHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[16], lllllllllllllIIlllllIllIIlIlIllI);
    }
    
    private int getChestSize() {
        final int lllllllllllllIIlllllIlIllllllIll = this.getHorseType();
        int n;
        if (!llIIIllIIIIIIII(this.isChested() ? 1 : 0) || (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllllllIll, EntityHorse.lIIIlllIIlIlIl[1]) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllllllIll, EntityHorse.lIIIlllIIlIlIl[3]))) {
            n = EntityHorse.lIIIlllIIlIlIl[3];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return (14 + 118 - 35 + 56 ^ 132 + 22 - 42 + 46) & (0x53 ^ 0x74 ^ (0x32 ^ 0x12) ^ -" ".length());
            }
        }
        else {
            n = EntityHorse.lIIIlllIIlIlIl[17];
        }
        return n;
    }
    
    private static int llIIIllIIIlIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public String getName() {
        if (llIIIllIIIIIIII(this.hasCustomName() ? 1 : 0)) {
            return this.getCustomNameTag();
        }
        final int lllllllllllllIIlllllIllIllIIIIII = this.getHorseType();
        switch (lllllllllllllIIlllllIllIllIIIIII) {
            default: {
                return StatCollector.translateToLocal(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[33]]);
            }
            case 1: {
                return StatCollector.translateToLocal(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[34]]);
            }
            case 2: {
                return StatCollector.translateToLocal(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[35]]);
            }
            case 3: {
                return StatCollector.translateToLocal(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[36]]);
            }
            case 4: {
                return StatCollector.translateToLocal(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[37]]);
            }
        }
    }
    
    protected EntityHorse getClosestHorse(final Entity lllllllllllllIIlllllIlIlllIIlIIl, final double lllllllllllllIIlllllIlIlllIIlIII) {
        double lllllllllllllIIlllllIlIlllIIlllI = Double.MAX_VALUE;
        Entity lllllllllllllIIlllllIlIlllIIllIl = null;
        final float lllllllllllllIIlllllIlIlllIIIlII = (float)this.worldObj.getEntitiesInAABBexcluding(lllllllllllllIIlllllIlIlllIIlIIl, lllllllllllllIIlllllIlIlllIIlIIl.getEntityBoundingBox().addCoord(lllllllllllllIIlllllIlIlllIIlIII, lllllllllllllIIlllllIlIlllIIlIII, lllllllllllllIIlllllIlIlllIIlIII), EntityHorse.horseBreedingSelector).iterator();
        "".length();
        if ("   ".length() <= ((0x4 ^ 0x29 ^ (0xD7 ^ 0xB1)) & (0x10 ^ 0xF ^ (0x10 ^ 0x44) ^ -" ".length()))) {
            return null;
        }
        while (!llIIIllIIIIIIIl(((Iterator)lllllllllllllIIlllllIlIlllIIIlII).hasNext() ? 1 : 0)) {
            final Entity lllllllllllllIIlllllIlIlllIIllII = ((Iterator<Entity>)lllllllllllllIIlllllIlIlllIIIlII).next();
            final double lllllllllllllIIlllllIlIlllIIlIll = lllllllllllllIIlllllIlIlllIIllII.getDistanceSq(lllllllllllllIIlllllIlIlllIIlIIl.posX, lllllllllllllIIlllllIlIlllIIlIIl.posY, lllllllllllllIIlllllIlIlllIIlIIl.posZ);
            if (llIIIllIIIIllIl(llIIIllIIIIllII(lllllllllllllIIlllllIlIlllIIlIll, lllllllllllllIIlllllIlIlllIIlllI))) {
                lllllllllllllIIlllllIlIlllIIllIl = lllllllllllllIIlllllIlIlllIIllII;
                lllllllllllllIIlllllIlIlllIIlllI = lllllllllllllIIlllllIlIlllIIlIll;
            }
        }
        return (EntityHorse)lllllllllllllIIlllllIlIlllIIllIl;
    }
    
    public void setHorseTamed(final boolean lllllllllllllIIlllllIllIlIIIlIlI) {
        this.setHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[3], lllllllllllllIIlllllIllIlIIIlIlI);
    }
    
    private int getHorseArmorIndex(final ItemStack lllllllllllllIIlllllIllIIlllIIIl) {
        if (llIIIllIIIIIlII(lllllllllllllIIlllllIllIIlllIIIl)) {
            return EntityHorse.lIIIlllIIlIlIl[0];
        }
        final Item lllllllllllllIIlllllIllIIlllIIII = lllllllllllllIIlllllIllIIlllIIIl.getItem();
        int n;
        if (llIIIllIIIIIlIl(lllllllllllllIIlllllIllIIlllIIII, Items.iron_horse_armor)) {
            n = EntityHorse.lIIIlllIIlIlIl[1];
            "".length();
            if (-"  ".length() >= 0) {
                return (0x21 ^ 0x27 ^ (0xF ^ 0x3C)) & (103 + 97 - 148 + 96 ^ 45 + 151 - 176 + 141 ^ -" ".length());
            }
        }
        else if (llIIIllIIIIIlIl(lllllllllllllIIlllllIllIIlllIIII, Items.golden_horse_armor)) {
            n = EntityHorse.lIIIlllIIlIlIl[3];
            "".length();
            if (-(0x28 ^ 0x2C) >= 0) {
                return (0x14 ^ 0x50) & ~(0x82 ^ 0xC6);
            }
        }
        else if (llIIIllIIIIIlIl(lllllllllllllIIlllllIllIIlllIIII, Items.diamond_horse_armor)) {
            n = EntityHorse.lIIIlllIIlIlIl[4];
            "".length();
            if (-" ".length() >= (0x47 ^ 0x43)) {
                return (0x2E ^ 0x29) & ~(0x58 ^ 0x5F);
            }
        }
        else {
            n = EntityHorse.lIIIlllIIlIlIl[0];
        }
        return n;
    }
    
    public boolean func_110239_cn() {
        if (llIIIllIIIIIIII(this.getHorseType()) && llIIIllIIIlIIlI(this.getHorseArmorIndexSynced())) {
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[1] != 0;
    }
    
    private void makeHorseRear() {
        if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0)) {
            this.jumpRearingCounter = EntityHorse.lIIIlllIIlIlIl[1];
            this.setRearing((boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
        }
    }
    
    public boolean isAdultHorse() {
        int n;
        if (llIIIllIIIIIIII(this.isChild() ? 1 : 0)) {
            n = EntityHorse.lIIIlllIIlIlIl[0];
            "".length();
            if (-" ".length() == " ".length()) {
                return ((0x6B ^ 0x2A) & ~(0xF7 ^ 0xB6)) != 0x0;
            }
        }
        else {
            n = EntityHorse.lIIIlllIIlIlIl[1];
        }
        return n != 0;
    }
    
    @Override
    public void onInventoryChanged(final InventoryBasic lllllllllllllIIlllllIlIllllIIIlI) {
        final int lllllllllllllIIlllllIlIllllIIIIl = this.getHorseArmorIndexSynced();
        final boolean lllllllllllllIIlllllIlIllllIIIII = this.isHorseSaddled();
        this.updateHorseSlots();
        if (llIIIllIIIIlIll(this.ticksExisted, EntityHorse.lIIIlllIIlIlIl[20])) {
            if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIllllIIIIl) && llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllllIIIIl, this.getHorseArmorIndexSynced())) {
                this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[43]], 0.5f, 1.0f);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llIIIllIIIIlIIl(lllllllllllllIIlllllIlIllllIIIIl, this.getHorseArmorIndexSynced())) {
                this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[44]], 0.5f, 1.0f);
            }
            if (llIIIllIIIIIIIl(lllllllllllllIIlllllIlIllllIIIII ? 1 : 0) && llIIIllIIIIIIII(this.isHorseSaddled() ? 1 : 0)) {
                this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[45]], 0.5f, 1.0f);
            }
        }
    }
    
    private static int llIIIllIIIlIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private boolean canMate() {
        if (llIIIllIIIIIlII(this.riddenByEntity) && llIIIllIIIIIlII(this.ridingEntity) && llIIIllIIIIIIII(this.isTame() ? 1 : 0) && llIIIllIIIIIIII(this.isAdultHorse() ? 1 : 0) && llIIIllIIIIIIIl(this.isSterile() ? 1 : 0) && llIIIllIIIlIlIl(llIIIllIIIllIlI(this.getHealth(), this.getMaxHealth())) && llIIIllIIIIIIII(this.isInLove() ? 1 : 0)) {
            return EntityHorse.lIIIlllIIlIlIl[1] != 0;
        }
        return EntityHorse.lIIIlllIIlIlIl[0] != 0;
    }
    
    public void setHasReproduced(final boolean lllllllllllllIIlllllIllIIlIIllII) {
        this.hasReproduced = lllllllllllllIIlllllIllIIlIIllII;
    }
    
    public void setRearing(final boolean lllllllllllllIIlllllIlIIllIlIlll) {
        if (llIIIllIIIIIIII(lllllllllllllIIlllllIlIIllIlIlll ? 1 : 0)) {
            this.setEatingHaystack((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
        }
        this.setHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[39], lllllllllllllIIlllllIlIIllIlIlll);
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIlllllIlIIlIIllIlI) {
        super.writeEntityToNBT(lllllllllllllIIlllllIlIIlIIllIlI);
        lllllllllllllIIlllllIlIIlIIllIlI.setBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[80]], this.isEatingHaystack());
        lllllllllllllIIlllllIlIIlIIllIlI.setBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[81]], this.isChested());
        lllllllllllllIIlllllIlIIlIIllIlI.setBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[82]], this.getHasReproduced());
        lllllllllllllIIlllllIlIIlIIllIlI.setBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[83]], this.isBreeding());
        lllllllllllllIIlllllIlIIlIIllIlI.setInteger(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[84]], this.getHorseType());
        lllllllllllllIIlllllIlIIlIIllIlI.setInteger(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[85]], this.getHorseVariant());
        lllllllllllllIIlllllIlIIlIIllIlI.setInteger(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[86]], this.getTemper());
        lllllllllllllIIlllllIlIIlIIllIlI.setBoolean(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[87]], this.isTame());
        lllllllllllllIIlllllIlIIlIIllIlI.setString(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[88]], this.getOwnerId());
        if (llIIIllIIIIIIII(this.isChested() ? 1 : 0)) {
            final NBTTagList lllllllllllllIIlllllIlIIlIIllIIl = new NBTTagList();
            int lllllllllllllIIlllllIlIIlIIllIII = EntityHorse.lIIIlllIIlIlIl[3];
            "".length();
            if (" ".length() < 0) {
                return;
            }
            while (!llIIIllIIIIlIlI(lllllllllllllIIlllllIlIIlIIllIII, this.horseChest.getSizeInventory())) {
                final ItemStack lllllllllllllIIlllllIlIIlIIlIlll = this.horseChest.getStackInSlot(lllllllllllllIIlllllIlIIlIIllIII);
                if (llIIIllIIIIIllI(lllllllllllllIIlllllIlIIlIIlIlll)) {
                    final NBTTagCompound lllllllllllllIIlllllIlIIlIIlIllI = new NBTTagCompound();
                    lllllllllllllIIlllllIlIIlIIlIllI.setByte(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[89]], (byte)lllllllllllllIIlllllIlIIlIIllIII);
                    lllllllllllllIIlllllIlIIlIIlIlll.writeToNBT(lllllllllllllIIlllllIlIIlIIlIllI);
                    "".length();
                    lllllllllllllIIlllllIlIIlIIllIIl.appendTag(lllllllllllllIIlllllIlIIlIIlIllI);
                }
                ++lllllllllllllIIlllllIlIIlIIllIII;
            }
            lllllllllllllIIlllllIlIIlIIllIlI.setTag(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[90]], lllllllllllllIIlllllIlIIlIIllIIl);
        }
        if (llIIIllIIIIIllI(this.horseChest.getStackInSlot(EntityHorse.lIIIlllIIlIlIl[1]))) {
            lllllllllllllIIlllllIlIIlIIllIlI.setTag(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[91]], this.horseChest.getStackInSlot(EntityHorse.lIIIlllIIlIlIl[1]).writeToNBT(new NBTTagCompound()));
        }
        if (llIIIllIIIIIllI(this.horseChest.getStackInSlot(EntityHorse.lIIIlllIIlIlIl[0]))) {
            lllllllllllllIIlllllIlIIlIIllIlI.setTag(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[92]], this.horseChest.getStackInSlot(EntityHorse.lIIIlllIIlIlIl[0]).writeToNBT(new NBTTagCompound()));
        }
    }
    
    @Override
    public float getEyeHeight() {
        return this.height;
    }
    
    public int getMaxTemper() {
        return EntityHorse.lIIIlllIIlIlIl[65];
    }
    
    public float getHorseSize() {
        return 0.5f;
    }
    
    private static int llIIIllIIIlIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void dropChests() {
        if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0) && llIIIllIIIIIIII(this.isChested() ? 1 : 0)) {
            this.dropItem(Item.getItemFromBlock(Blocks.chest), EntityHorse.lIIIlllIIlIlIl[1]);
            "".length();
            this.setChested((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
        }
    }
    
    @Override
    protected void func_142017_o(final float lllllllllllllIIlllllIllIIlllllIl) {
        if (llIIIllIIIIIIll(llIIIllIIIIIIlI(lllllllllllllIIlllllIllIIlllllIl, 6.0f)) && llIIIllIIIIIIII(this.isEatingHaystack() ? 1 : 0)) {
            this.setEatingHaystack((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
        }
    }
    
    @Override
    public void moveEntityWithHeading(float lllllllllllllIIlllllIlIIlIlIIlll, float lllllllllllllIIlllllIlIIlIlIIllI) {
        if (llIIIllIIIIIllI(this.riddenByEntity) && llIIIllIIIIIIII((this.riddenByEntity instanceof EntityLivingBase) ? 1 : 0) && llIIIllIIIIIIII(this.isHorseSaddled() ? 1 : 0)) {
            final float rotationYaw = this.riddenByEntity.rotationYaw;
            this.rotationYaw = rotationYaw;
            this.prevRotationYaw = rotationYaw;
            this.rotationPitch = this.riddenByEntity.rotationPitch * 0.5f;
            this.setRotation(this.rotationYaw, this.rotationPitch);
            final float rotationYaw2 = this.rotationYaw;
            this.renderYawOffset = rotationYaw2;
            this.rotationYawHead = rotationYaw2;
            lllllllllllllIIlllllIlIIlIlIIlll = (String)(((EntityLivingBase)this.riddenByEntity).moveStrafing * 0.5f);
            lllllllllllllIIlllllIlIIlIlIIllI = ((EntityLivingBase)this.riddenByEntity).moveForward;
            if (llIIIllIIIlIIlI(llIIIllIIIllIll(lllllllllllllIIlllllIlIIlIlIIllI, 0.0f))) {
                lllllllllllllIIlllllIlIIlIlIIllI *= 0.25f;
                this.gallopTime = EntityHorse.lIIIlllIIlIlIl[0];
            }
            if (llIIIllIIIIIIII(this.onGround ? 1 : 0) && llIIIllIIIIIIIl(llIIIllIIIlllII(this.jumpPower, 0.0f)) && llIIIllIIIIIIII(this.isRearing() ? 1 : 0) && llIIIllIIIIIIIl(this.field_110294_bI ? 1 : 0)) {
                lllllllllllllIIlllllIlIIlIlIIlll = (String)0.0f;
                lllllllllllllIIlllllIlIIlIlIIllI = 0.0f;
            }
            if (llIIIllIIIIIIll(llIIIllIIIlllII(this.jumpPower, 0.0f)) && llIIIllIIIIIIIl(this.isHorseJumping() ? 1 : 0) && llIIIllIIIIIIII(this.onGround ? 1 : 0)) {
                this.motionY = this.getHorseJumpStrength() * this.jumpPower;
                if (llIIIllIIIIIIII(this.isPotionActive(Potion.jump) ? 1 : 0)) {
                    this.motionY += (this.getActivePotionEffect(Potion.jump).getAmplifier() + EntityHorse.lIIIlllIIlIlIl[1]) * 0.1f;
                }
                this.setHorseJumping((boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
                this.isAirBorne = (EntityHorse.lIIIlllIIlIlIl[1] != 0);
                if (llIIIllIIIIIIll(llIIIllIIIlllII(lllllllllllllIIlllllIlIIlIlIIllI, 0.0f))) {
                    final float lllllllllllllIIlllllIlIIlIlIllIl = MathHelper.sin(this.rotationYaw * 3.1415927f / 180.0f);
                    final float lllllllllllllIIlllllIlIIlIlIllII = MathHelper.cos(this.rotationYaw * 3.1415927f / 180.0f);
                    this.motionX += -0.4f * lllllllllllllIIlllllIlIIlIlIllIl * this.jumpPower;
                    this.motionZ += 0.4f * lllllllllllllIIlllllIlIIlIlIllII * this.jumpPower;
                    this.playSound(EntityHorse.lIIIlllIIIIlII[EntityHorse.lIIIlllIIlIlIl[79]], 0.4f, 1.0f);
                }
                this.jumpPower = 0.0f;
            }
            this.stepHeight = 1.0f;
            this.jumpMovementFactor = this.getAIMoveSpeed() * 0.1f;
            if (llIIIllIIIIIIIl(this.worldObj.isRemote ? 1 : 0)) {
                this.setAIMoveSpeed((float)this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).getAttributeValue());
                super.moveEntityWithHeading((float)lllllllllllllIIlllllIlIIlIlIIlll, lllllllllllllIIlllllIlIIlIlIIllI);
            }
            if (llIIIllIIIIIIII(this.onGround ? 1 : 0)) {
                this.jumpPower = 0.0f;
                this.setHorseJumping((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
            }
            this.prevLimbSwingAmount = this.limbSwingAmount;
            final double lllllllllllllIIlllllIlIIlIlIlIll = this.posX - this.prevPosX;
            final double lllllllllllllIIlllllIlIIlIlIlIlI = this.posZ - this.prevPosZ;
            float lllllllllllllIIlllllIlIIlIlIlIIl = MathHelper.sqrt_double(lllllllllllllIIlllllIlIIlIlIlIll * lllllllllllllIIlllllIlIIlIlIlIll + lllllllllllllIIlllllIlIIlIlIlIlI * lllllllllllllIIlllllIlIIlIlIlIlI) * 4.0f;
            if (llIIIllIIIIIIll(llIIIllIIIlllII(lllllllllllllIIlllllIlIIlIlIlIIl, 1.0f))) {
                lllllllllllllIIlllllIlIIlIlIlIIl = 1.0f;
            }
            this.limbSwingAmount += (lllllllllllllIIlllllIlIIlIlIlIIl - this.limbSwingAmount) * 0.4f;
            this.limbSwing += this.limbSwingAmount;
            "".length();
            if ("   ".length() < "  ".length()) {
                return;
            }
        }
        else {
            this.stepHeight = 0.5f;
            this.jumpMovementFactor = 0.02f;
            super.moveEntityWithHeading((float)lllllllllllllIIlllllIlIIlIlIIlll, lllllllllllllIIlllllIlIIlIlIIllI);
        }
    }
    
    @Override
    public void updateRiderPosition() {
        super.updateRiderPosition();
        if (llIIIllIIIIIIll(llIIIllIIIlllIl(this.prevRearingAmount, 0.0f))) {
            final float lllllllllllllIIlllllIIlllllIlllI = MathHelper.sin(this.renderYawOffset * 3.1415927f / 180.0f);
            final float lllllllllllllIIlllllIIlllllIllIl = MathHelper.cos(this.renderYawOffset * 3.1415927f / 180.0f);
            final float lllllllllllllIIlllllIIlllllIllII = 0.7f * this.prevRearingAmount;
            final float lllllllllllllIIlllllIIlllllIlIlI = 0.15f * this.prevRearingAmount;
            this.riddenByEntity.setPosition(this.posX + lllllllllllllIIlllllIIlllllIllII * lllllllllllllIIlllllIIlllllIlllI, this.posY + this.getMountedYOffset() + this.riddenByEntity.getYOffset() + lllllllllllllIIlllllIIlllllIlIlI, this.posZ - lllllllllllllIIlllllIIlllllIllII * lllllllllllllIIlllllIIlllllIllIl);
            if (llIIIllIIIIIIII((this.riddenByEntity instanceof EntityLivingBase) ? 1 : 0)) {
                ((EntityLivingBase)this.riddenByEntity).renderYawOffset = this.renderYawOffset;
            }
        }
    }
    
    private static boolean llIIIllIIIIIIIl(final int lllllllllllllIIlllllIIllIlIIIlII) {
        return lllllllllllllIIlllllIIllIlIIIlII == 0;
    }
    
    public double getHorseJumpStrength() {
        return this.getEntityAttribute(EntityHorse.horseJumpStrength).getAttributeValue();
    }
    
    public boolean isBreeding() {
        return this.getHorseWatchableBoolean(EntityHorse.lIIIlllIIlIlIl[16]);
    }
    
    private static boolean llIIIllIIIIIllI(final Object lllllllllllllIIlllllIIllIlIIlIlI) {
        return lllllllllllllIIlllllIIllIlIIlIlI != null;
    }
    
    private static boolean llIIIllIIIlIlIl(final int lllllllllllllIIlllllIIllIlIIIIlI) {
        return lllllllllllllIIlllllIIllIlIIIIlI >= 0;
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIIlllllIIlllllllIIl) {
        if (llIIIllIIIIlllI(lllllllllllllIIlllllIIlllllllIIl, EntityHorse.lIIIlllIIlIlIl[7])) {
            this.spawnHorseParticles((boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
        else if (llIIIllIIIIlllI(lllllllllllllIIlllllIIlllllllIIl, EntityHorse.lIIIlllIIlIlIl[6])) {
            this.spawnHorseParticles((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIIlllllIIlllllllIIl);
        }
    }
    
    @Override
    public boolean replaceItemInInventory(final int lllllllllllllIIlllllIIlllIlIIIIl, final ItemStack lllllllllllllIIlllllIIlllIIlllll) {
        if (llIIIllIIIIlllI(lllllllllllllIIlllllIIlllIlIIIIl, EntityHorse.lIIIlllIIlIlIl[113]) && llIIIllIIIIIIII(this.canCarryChest() ? 1 : 0)) {
            if (llIIIllIIIIIlII(lllllllllllllIIlllllIIlllIIlllll) && llIIIllIIIIIIII(this.isChested() ? 1 : 0)) {
                this.setChested((boolean)(EntityHorse.lIIIlllIIlIlIl[0] != 0));
                this.initHorseChest();
                return EntityHorse.lIIIlllIIlIlIl[1] != 0;
            }
            if (llIIIllIIIIIllI(lllllllllllllIIlllllIIlllIIlllll) && llIIIllIIIIIlIl(lllllllllllllIIlllllIIlllIIlllll.getItem(), Item.getItemFromBlock(Blocks.chest)) && llIIIllIIIIIIIl(this.isChested() ? 1 : 0)) {
                this.setChested((boolean)(EntityHorse.lIIIlllIIlIlIl[1] != 0));
                this.initHorseChest();
                return EntityHorse.lIIIlllIIlIlIl[1] != 0;
            }
        }
        final int lllllllllllllIIlllllIIlllIlIIlIl = lllllllllllllIIlllllIIlllIlIIIIl - EntityHorse.lIIIlllIIlIlIl[66];
        if (llIIIllIIIlIlIl(lllllllllllllIIlllllIIlllIlIIlIl) && llIIIllIIIlIllI(lllllllllllllIIlllllIIlllIlIIlIl, EntityHorse.lIIIlllIIlIlIl[3]) && llIIIllIIIlIllI(lllllllllllllIIlllllIIlllIlIIlIl, this.horseChest.getSizeInventory())) {
            if (llIIIllIIIIIIIl(lllllllllllllIIlllllIIlllIlIIlIl) && llIIIllIIIIIllI(lllllllllllllIIlllllIIlllIIlllll) && llIIIllIIIIlIII(lllllllllllllIIlllllIIlllIIlllll.getItem(), Items.saddle)) {
                return EntityHorse.lIIIlllIIlIlIl[0] != 0;
            }
            if (!llIIIllIIIIlllI(lllllllllllllIIlllllIIlllIlIIlIl, EntityHorse.lIIIlllIIlIlIl[1]) || ((!llIIIllIIIIIllI(lllllllllllllIIlllllIIlllIIlllll) || llIIIllIIIIIIII(isArmorItem(lllllllllllllIIlllllIIlllIIlllll.getItem()) ? 1 : 0)) && llIIIllIIIIIIII(this.canWearArmor() ? 1 : 0))) {
                this.horseChest.setInventorySlotContents(lllllllllllllIIlllllIIlllIlIIlIl, lllllllllllllIIlllllIIlllIIlllll);
                this.updateHorseSlots();
                return EntityHorse.lIIIlllIIlIlIl[1] != 0;
            }
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
        else {
            final int lllllllllllllIIlllllIIlllIlIIlII = lllllllllllllIIlllllIIlllIlIIIIl - EntityHorse.lIIIlllIIlIlIl[114] + EntityHorse.lIIIlllIIlIlIl[3];
            if (llIIIllIIIIlIlI(lllllllllllllIIlllllIIlllIlIIlII, EntityHorse.lIIIlllIIlIlIl[3]) && llIIIllIIIlIllI(lllllllllllllIIlllllIIlllIlIIlII, this.horseChest.getSizeInventory())) {
                this.horseChest.setInventorySlotContents(lllllllllllllIIlllllIIlllIlIIlII, lllllllllllllIIlllllIIlllIIlllll);
                return EntityHorse.lIIIlllIIlIlIl[1] != 0;
            }
            return EntityHorse.lIIIlllIIlIlIl[0] != 0;
        }
    }
    
    public static class GroupData implements IEntityLivingData
    {
        public /* synthetic */ int horseVariant;
        public /* synthetic */ int horseType;
        
        public GroupData(final int lllllllllllllIlIlIlIlIIIIIIlIllI, final int lllllllllllllIlIlIlIlIIIIIIlIlIl) {
            this.horseType = lllllllllllllIlIlIlIlIIIIIIlIllI;
            this.horseVariant = lllllllllllllIlIlIlIlIIIIIIlIlIl;
        }
    }
}
