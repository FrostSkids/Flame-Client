// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import java.util.Random;
import net.minecraft.util.MathHelper;
import net.minecraft.block.material.Material;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Items;
import com.google.common.collect.Sets;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import com.google.common.base.Predicate;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import java.util.Set;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import java.util.UUID;

public class EntityEnderman extends EntityMob
{
    private static final /* synthetic */ int[] llIIlIIlIlIIll;
    private /* synthetic */ boolean isAggressive;
    private static final /* synthetic */ UUID attackingSpeedBoostModifierUUID;
    private static final /* synthetic */ AttributeModifier attackingSpeedBoostModifier;
    private static final /* synthetic */ String[] llIIlIIlIlIIlI;
    private static final /* synthetic */ Set<Block> carriableBlocks;
    
    public EntityEnderman(final World llllllllllllIlllIIlIlIlIllIIIIII) {
        super(llllllllllllIlllIIlIlIlIllIIIIII);
        this.setSize(0.6f, 2.9f);
        this.stepHeight = 1.0f;
        this.tasks.addTask(EntityEnderman.llIIlIIlIlIIll[0], new EntityAISwimming(this));
        this.tasks.addTask(EntityEnderman.llIIlIIlIlIIll[2], new EntityAIAttackOnCollide(this, 1.0, (boolean)(EntityEnderman.llIIlIIlIlIIll[0] != 0)));
        this.tasks.addTask(EntityEnderman.llIIlIIlIlIIll[3], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityEnderman.llIIlIIlIlIIll[4], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntityEnderman.llIIlIIlIlIIll[4], new EntityAILookIdle(this));
        this.tasks.addTask(EntityEnderman.llIIlIIlIlIIll[5], new AIPlaceBlock(this));
        this.tasks.addTask(EntityEnderman.llIIlIIlIlIIll[6], new AITakeBlock(this));
        this.targetTasks.addTask(EntityEnderman.llIIlIIlIlIIll[1], new EntityAIHurtByTarget(this, (boolean)(EntityEnderman.llIIlIIlIlIIll[0] != 0), new Class[EntityEnderman.llIIlIIlIlIIll[0]]));
        this.targetTasks.addTask(EntityEnderman.llIIlIIlIlIIll[2], new AIFindPlayer(this));
        this.targetTasks.addTask(EntityEnderman.llIIlIIlIlIIll[7], new EntityAINearestAttackableTarget<Object>(this, EntityEndermite.class, EntityEnderman.llIIlIIlIlIIll[5], (boolean)(EntityEnderman.llIIlIIlIlIIll[1] != 0), (boolean)(EntityEnderman.llIIlIIlIlIIll[0] != 0), (com.google.common.base.Predicate<?>)new Predicate<EntityEndermite>() {
            public boolean apply(final EntityEndermite lllllllllllllIlIIIlIlIIllllllllI) {
                return lllllllllllllIlIIIlIlIIllllllllI.isSpawnedByPlayer();
            }
        }));
    }
    
    private static String lIIIllIIIlIlIllI(final String llllllllllllIlllIIlIlIIllllIIlII, final String llllllllllllIlllIIlIlIIllllIIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIlIIllllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIlIIllllIIIll.getBytes(StandardCharsets.UTF_8)), EntityEnderman.llIIlIIlIlIIll[4]), "DES");
            final Cipher llllllllllllIlllIIlIlIIllllIlIII = Cipher.getInstance("DES");
            llllllllllllIlllIIlIlIIllllIlIII.init(EntityEnderman.llIIlIIlIlIIll[2], llllllllllllIlllIIlIlIIllllIlIIl);
            return new String(llllllllllllIlllIIlIlIIllllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlIIllllIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIlIIllllIIlll) {
            llllllllllllIlllIIlIlIIllllIIlll.printStackTrace();
            return null;
        }
    }
    
    protected boolean teleportTo(final double llllllllllllIlllIIlIlIlIIlIlIIII, final double llllllllllllIlllIIlIlIlIIlIIllll, final double llllllllllllIlllIIlIlIlIIIlllIIl) {
        final double llllllllllllIlllIIlIlIlIIlIIllIl = this.posX;
        final double llllllllllllIlllIIlIlIlIIlIIllII = this.posY;
        final double llllllllllllIlllIIlIlIlIIlIIlIll = this.posZ;
        this.posX = llllllllllllIlllIIlIlIlIIlIlIIII;
        this.posY = llllllllllllIlllIIlIlIlIIlIIllll;
        this.posZ = llllllllllllIlllIIlIlIlIIIlllIIl;
        boolean llllllllllllIlllIIlIlIlIIlIIlIlI = EntityEnderman.llIIlIIlIlIIll[0] != 0;
        BlockPos llllllllllllIlllIIlIlIlIIlIIlIIl = new BlockPos(this.posX, this.posY, this.posZ);
        if (lIIIllIIIlIllIIl(this.worldObj.isBlockLoaded(llllllllllllIlllIIlIlIlIIlIIlIIl) ? 1 : 0)) {
            boolean llllllllllllIlllIIlIlIlIIlIIlIII = EntityEnderman.llIIlIIlIlIIll[0] != 0;
            "".length();
            if (" ".length() < 0) {
                return ((173 + 178 - 275 + 173 ^ 45 + 124 - 46 + 55) & (16 + 147 - 90 + 158 ^ 140 + 145 - 181 + 68 ^ -" ".length())) != 0x0;
            }
            while (lIIIllIIIllIIIIl(llllllllllllIlllIIlIlIlIIlIIlIII ? 1 : 0) && !lIIIllIIIllIIIll(llllllllllllIlllIIlIlIlIIlIIlIIl.getY())) {
                final BlockPos llllllllllllIlllIIlIlIlIIlIIIlll = llllllllllllIlllIIlIlIlIIlIIlIIl.down();
                final Block llllllllllllIlllIIlIlIlIIlIIIllI = this.worldObj.getBlockState(llllllllllllIlllIIlIlIlIIlIIIlll).getBlock();
                if (lIIIllIIIlIllIIl(llllllllllllIlllIIlIlIlIIlIIIllI.getMaterial().blocksMovement() ? 1 : 0)) {
                    llllllllllllIlllIIlIlIlIIlIIlIII = (EntityEnderman.llIIlIIlIlIIll[1] != 0);
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return ((0x7D ^ 0x6E ^ (0xF8 ^ 0x8B)) & (0x57 ^ 0x30 ^ (0x74 ^ 0x73) ^ -" ".length())) != 0x0;
                    }
                    continue;
                }
                else {
                    --this.posY;
                    llllllllllllIlllIIlIlIlIIlIIlIIl = llllllllllllIlllIIlIlIlIIlIIIlll;
                }
            }
            if (lIIIllIIIlIllIIl(llllllllllllIlllIIlIlIlIIlIIlIII ? 1 : 0)) {
                super.setPositionAndUpdate(this.posX, this.posY, this.posZ);
                if (lIIIllIIIlIllIIl(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() ? 1 : 0) && lIIIllIIIllIIIIl(this.worldObj.isAnyLiquid(this.getEntityBoundingBox()) ? 1 : 0)) {
                    llllllllllllIlllIIlIlIlIIlIIlIlI = (EntityEnderman.llIIlIIlIlIIll[1] != 0);
                }
            }
        }
        if (lIIIllIIIllIIIIl(llllllllllllIlllIIlIlIlIIlIIlIlI ? 1 : 0)) {
            this.setPosition(llllllllllllIlllIIlIlIlIIlIIllIl, llllllllllllIlllIIlIlIlIIlIIllII, llllllllllllIlllIIlIlIlIIlIIlIll);
            return EntityEnderman.llIIlIIlIlIIll[0] != 0;
        }
        final int llllllllllllIlllIIlIlIlIIlIIIlIl = EntityEnderman.llIIlIIlIlIIll[18];
        int llllllllllllIlllIIlIlIlIIlIIIlII = EntityEnderman.llIIlIIlIlIIll[0];
        "".length();
        if (((0x81 ^ 0xC7 ^ (0x7C ^ 0x1F)) & (44 + 2 + 51 + 59 ^ 86 + 116 - 54 + 37 ^ -" ".length())) > "  ".length()) {
            return ((0x3B ^ 0x47 ^ (0x49 ^ 0x55)) & (0x34 ^ 0x31 ^ (0xE9 ^ 0x8C) ^ -" ".length()) & (((0x55 ^ 0x67 ^ (0x6C ^ 0x53)) & (45 + 142 - 32 + 25 ^ 11 + 171 - 146 + 149 ^ -" ".length())) ^ -" ".length())) != 0x0;
        }
        while (!lIIIllIIIlIllllI(llllllllllllIlllIIlIlIlIIlIIIlII, llllllllllllIlllIIlIlIlIIlIIIlIl)) {
            final double llllllllllllIlllIIlIlIlIIlIIIIll = llllllllllllIlllIIlIlIlIIlIIIlII / (llllllllllllIlllIIlIlIlIIlIIIlIl - 1.0);
            final float llllllllllllIlllIIlIlIlIIlIIIIlI = (this.rand.nextFloat() - 0.5f) * 0.2f;
            final float llllllllllllIlllIIlIlIlIIlIIIIIl = (this.rand.nextFloat() - 0.5f) * 0.2f;
            final float llllllllllllIlllIIlIlIlIIlIIIIII = (this.rand.nextFloat() - 0.5f) * 0.2f;
            final double llllllllllllIlllIIlIlIlIIIllllll = llllllllllllIlllIIlIlIlIIlIIllIl + (this.posX - llllllllllllIlllIIlIlIlIIlIIllIl) * llllllllllllIlllIIlIlIlIIlIIIIll + (this.rand.nextDouble() - 0.5) * this.width * 2.0;
            final double llllllllllllIlllIIlIlIlIIIlllllI = llllllllllllIlllIIlIlIlIIlIIllII + (this.posY - llllllllllllIlllIIlIlIlIIlIIllII) * llllllllllllIlllIIlIlIlIIlIIIIll + this.rand.nextDouble() * this.height;
            final double llllllllllllIlllIIlIlIlIIIllllIl = llllllllllllIlllIIlIlIlIIlIIlIll + (this.posZ - llllllllllllIlllIIlIlIlIIlIIlIll) * llllllllllllIlllIIlIlIlIIlIIIIll + (this.rand.nextDouble() - 0.5) * this.width * 2.0;
            this.worldObj.spawnParticle(EnumParticleTypes.PORTAL, llllllllllllIlllIIlIlIlIIIllllll, llllllllllllIlllIIlIlIlIIIlllllI, llllllllllllIlllIIlIlIlIIIllllIl, llllllllllllIlllIIlIlIlIIlIIIIlI, llllllllllllIlllIIlIlIlIIlIIIIIl, llllllllllllIlllIIlIlIlIIlIIIIII, new int[EntityEnderman.llIIlIIlIlIIll[0]]);
            ++llllllllllllIlllIIlIlIlIIlIIIlII;
        }
        this.worldObj.playSoundEffect(llllllllllllIlllIIlIlIlIIlIIllIl, llllllllllllIlllIIlIlIlIIlIIllII, llllllllllllIlllIIlIlIlIIlIIlIll, EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[19]], 1.0f, 1.0f);
        this.playSound(EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[5]], 1.0f, 1.0f);
        return EntityEnderman.llIIlIIlIlIIll[1] != 0;
    }
    
    private static boolean lIIIllIIIlIlllIl(final int llllllllllllIlllIIlIlIIllIlIIlII) {
        return llllllllllllIlllIIlIlIIllIlIIlII > 0;
    }
    
    private static boolean lIIIllIIIlIlllII(final Object llllllllllllIlllIIlIlIIllIlIllll, final Object llllllllllllIlllIIlIlIIllIlIlllI) {
        return llllllllllllIlllIIlIlIIllIlIllll == llllllllllllIlllIIlIlIIllIlIlllI;
    }
    
    public IBlockState getHeldBlockState() {
        return Block.getStateById(this.dataWatcher.getWatchableObjectShort(EntityEnderman.llIIlIIlIlIIll[8]) & EntityEnderman.llIIlIIlIlIIll[14]);
    }
    
    private static int lIIIllIIIlIllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private boolean shouldAttackPlayer(final EntityPlayer llllllllllllIlllIIlIlIlIlIIllllI) {
        final ItemStack llllllllllllIlllIIlIlIlIlIIlllIl = llllllllllllIlllIIlIlIlIlIIllllI.inventory.armorInventory[EntityEnderman.llIIlIIlIlIIll[7]];
        if (lIIIllIIIlIllIll(llllllllllllIlllIIlIlIlIlIIlllIl) && lIIIllIIIlIlllII(llllllllllllIlllIIlIlIlIlIIlllIl.getItem(), Item.getItemFromBlock(Blocks.pumpkin))) {
            return EntityEnderman.llIIlIIlIlIIll[0] != 0;
        }
        final Vec3 llllllllllllIlllIIlIlIlIlIIlllII = llllllllllllIlllIIlIlIlIlIIllllI.getLook(1.0f).normalize();
        Vec3 llllllllllllIlllIIlIlIlIlIIllIll = new Vec3(this.posX - llllllllllllIlllIIlIlIlIlIIllllI.posX, this.getEntityBoundingBox().minY + this.height / 2.0f - (llllllllllllIlllIIlIlIlIlIIllllI.posY + llllllllllllIlllIIlIlIlIlIIllllI.getEyeHeight()), this.posZ - llllllllllllIlllIIlIlIlIlIIllllI.posZ);
        final double llllllllllllIlllIIlIlIlIlIIllIlI = llllllllllllIlllIIlIlIlIlIIllIll.lengthVector();
        llllllllllllIlllIIlIlIlIlIIllIll = llllllllllllIlllIIlIlIlIlIIllIll.normalize();
        final double llllllllllllIlllIIlIlIlIlIIllIIl = llllllllllllIlllIIlIlIlIlIIlllII.dotProduct(llllllllllllIlllIIlIlIlIlIIllIll);
        int canEntityBeSeen;
        if (lIIIllIIIlIlllIl(lIIIllIIIlIllIlI(llllllllllllIlllIIlIlIlIlIIllIIl, 1.0 - 0.025 / llllllllllllIlllIIlIlIlIlIIllIlI))) {
            canEntityBeSeen = (llllllllllllIlllIIlIlIlIlIIllllI.canEntityBeSeen(this) ? 1 : 0);
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x40 ^ 0x79 ^ (0xD ^ 0x19)) & (0x5B ^ 0x13 ^ (0x3A ^ 0x5F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            canEntityBeSeen = EntityEnderman.llIIlIIlIlIIll[0];
        }
        return canEntityBeSeen != 0;
    }
    
    private static String lIIIllIIIlIlIlIl(final String llllllllllllIlllIIlIlIIlllIIIIIl, final String llllllllllllIlllIIlIlIIllIlllllI) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIlIIlllIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIlIIllIlllllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIlIIlllIIIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIlIIlllIIIIll.init(EntityEnderman.llIIlIIlIlIIll[2], llllllllllllIlllIIlIlIIlllIIIlII);
            return new String(llllllllllllIlllIIlIlIIlllIIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlIIlllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIlIIlllIIIIlI) {
            llllllllllllIlllIIlIlIIlllIIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(7.0);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64.0);
    }
    
    private static boolean lIIIllIIIlIllIIl(final int llllllllllllIlllIIlIlIIllIlIllII) {
        return llllllllllllIlllIIlIlIIllIlIllII != 0;
    }
    
    @Override
    protected void updateAITasks() {
        if (lIIIllIIIlIllIIl(this.isWet() ? 1 : 0)) {
            this.attackEntityFrom(DamageSource.drown, 1.0f);
            "".length();
        }
        if (lIIIllIIIlIllIIl(this.isScreaming() ? 1 : 0) && lIIIllIIIllIIIIl(this.isAggressive ? 1 : 0) && lIIIllIIIllIIIIl(this.rand.nextInt(EntityEnderman.llIIlIIlIlIIll[15]))) {
            this.setScreaming((boolean)(EntityEnderman.llIIlIIlIlIIll[0] != 0));
        }
        if (lIIIllIIIlIllIIl(this.worldObj.isDaytime() ? 1 : 0)) {
            final float llllllllllllIlllIIlIlIlIlIIIIlll = this.getBrightness(1.0f);
            if (lIIIllIIIlIlllIl(lIIIllIIIlIlllll(llllllllllllIlllIIlIlIlIlIIIIlll, 0.5f)) && lIIIllIIIlIllIIl(this.worldObj.canSeeSky(new BlockPos(this)) ? 1 : 0) && lIIIllIIIllIIIlI(lIIIllIIIllIIIII(this.rand.nextFloat() * 30.0f, (llllllllllllIlllIIlIlIlIlIIIIlll - 0.4f) * 2.0f))) {
                this.setAttackTarget(null);
                this.setScreaming((boolean)(EntityEnderman.llIIlIIlIlIIll[0] != 0));
                this.isAggressive = (EntityEnderman.llIIlIIlIlIIll[0] != 0);
                this.teleportRandomly();
                "".length();
            }
        }
        super.updateAITasks();
    }
    
    public void setScreaming(final boolean llllllllllllIlllIIlIlIIllllllIII) {
        final DataWatcher dataWatcher = this.dataWatcher;
        final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityEnderman.llIIlIIlIlIIll[10];
        int n;
        if (lIIIllIIIlIllIIl(llllllllllllIlllIIlIlIIllllllIII ? 1 : 0)) {
            n = EntityEnderman.llIIlIIlIlIIll[1];
            "".length();
            if (" ".length() == "  ".length()) {
                return;
            }
        }
        else {
            n = EntityEnderman.llIIlIIlIlIIll[0];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
    }
    
    @Override
    public void onLivingUpdate() {
        if (lIIIllIIIlIllIIl(this.worldObj.isRemote ? 1 : 0)) {
            int llllllllllllIlllIIlIlIlIlIIIllIl = EntityEnderman.llIIlIIlIlIIll[0];
            "".length();
            if (" ".length() == 0) {
                return;
            }
            while (!lIIIllIIIlIllllI(llllllllllllIlllIIlIlIlIlIIIllIl, EntityEnderman.llIIlIIlIlIIll[2])) {
                this.worldObj.spawnParticle(EnumParticleTypes.PORTAL, this.posX + (this.rand.nextDouble() - 0.5) * this.width, this.posY + this.rand.nextDouble() * this.height - 0.25, this.posZ + (this.rand.nextDouble() - 0.5) * this.width, (this.rand.nextDouble() - 0.5) * 2.0, -this.rand.nextDouble(), (this.rand.nextDouble() - 0.5) * 2.0, new int[EntityEnderman.llIIlIIlIlIIll[0]]);
                ++llllllllllllIlllIIlIlIlIlIIIllIl;
            }
        }
        this.isJumping = (EntityEnderman.llIIlIIlIlIIll[0] != 0);
        super.onLivingUpdate();
    }
    
    static /* synthetic */ void access$2(final EntityEnderman llllllllllllIlllIIlIlIIllllIllll, final boolean llllllllllllIlllIIlIlIIllllIlllI) {
        llllllllllllIlllIIlIlIIllllIllll.isAggressive = llllllllllllIlllIIlIlIIllllIlllI;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityEnderman.llIIlIIlIlIIll[8], new Short((short)EntityEnderman.llIIlIIlIlIIll[0]));
        this.dataWatcher.addObject(EntityEnderman.llIIlIIlIlIIll[9], new Byte((byte)EntityEnderman.llIIlIIlIlIIll[0]));
        this.dataWatcher.addObject(EntityEnderman.llIIlIIlIlIIll[10], new Byte((byte)EntityEnderman.llIIlIIlIlIIll[0]));
    }
    
    private static boolean lIIIllIIIlIllllI(final int llllllllllllIlllIIlIlIIllIlllIIl, final int llllllllllllIlllIIlIlIIllIlllIII) {
        return llllllllllllIlllIIlIlIIllIlllIIl >= llllllllllllIlllIIlIlIIllIlllIII;
    }
    
    static {
        lIIIllIIIlIllIII();
        lIIIllIIIlIlIlll();
        attackingSpeedBoostModifierUUID = UUID.fromString(EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[0]]);
        attackingSpeedBoostModifier = new AttributeModifier(EntityEnderman.attackingSpeedBoostModifierUUID, EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[1]], 0.15000000596046448, EntityEnderman.llIIlIIlIlIIll[0]).setSaved((boolean)(EntityEnderman.llIIlIIlIlIIll[0] != 0));
        (carriableBlocks = Sets.newIdentityHashSet()).add(Blocks.grass);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.dirt);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.sand);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.gravel);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.yellow_flower);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.red_flower);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.brown_mushroom);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.red_mushroom);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.tnt);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.cactus);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.clay);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.pumpkin);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.melon_block);
        "".length();
        EntityEnderman.carriableBlocks.add(Blocks.mycelium);
        "".length();
    }
    
    @Override
    public float getEyeHeight() {
        return 2.55f;
    }
    
    @Override
    protected String getLivingSound() {
        String s;
        if (lIIIllIIIlIllIIl(this.isScreaming() ? 1 : 0)) {
            s = EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[6]];
            "".length();
            if (((" ".length() ^ (0x57 ^ 0x53)) & (116 + 128 - 221 + 117 ^ 27 + 101 - 21 + 30 ^ -" ".length())) > ((0x8C ^ 0x95 ^ (0xA1 ^ 0xB1)) & (0x2C ^ 0x16 ^ (0x81 ^ 0xB2) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            s = EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[20]];
        }
        return s;
    }
    
    private static void lIIIllIIIlIllIII() {
        (llIIlIIlIlIIll = new int[24])[0] = ((0x9B ^ 0xA2) & ~(0xB9 ^ 0x80));
        EntityEnderman.llIIlIIlIlIIll[1] = " ".length();
        EntityEnderman.llIIlIIlIlIIll[2] = "  ".length();
        EntityEnderman.llIIlIIlIlIIll[3] = (0xA ^ 0x71 ^ (0x28 ^ 0x54));
        EntityEnderman.llIIlIIlIlIIll[4] = (0xC ^ 0x4);
        EntityEnderman.llIIlIIlIlIIll[5] = (0x7B ^ 0x71);
        EntityEnderman.llIIlIIlIlIIll[6] = ("  ".length() ^ (0x1F ^ 0x16));
        EntityEnderman.llIIlIIlIlIIll[7] = "   ".length();
        EntityEnderman.llIIlIIlIlIIll[8] = (0x62 ^ 0x72);
        EntityEnderman.llIIlIIlIlIIll[9] = (0xD0 ^ 0xB6 ^ (0x70 ^ 0x7));
        EntityEnderman.llIIlIIlIlIIll[10] = (0xF ^ 0x1D);
        EntityEnderman.llIIlIIlIlIIll[11] = (0x73 ^ 0x77);
        EntityEnderman.llIIlIIlIlIIll[12] = (0xDA ^ 0x8F ^ (0x72 ^ 0x22));
        EntityEnderman.llIIlIIlIlIIll[13] = (0x3C ^ 0x33 ^ (0x3D ^ 0x34));
        EntityEnderman.llIIlIIlIlIIll[14] = (-1 & 0xFFFF);
        EntityEnderman.llIIlIIlIlIIll[15] = (147 + 107 - 155 + 144 ^ 96 + 98 - 91 + 48);
        EntityEnderman.llIIlIIlIlIIll[16] = (0x56 ^ 0x23 ^ (0x1E ^ 0x2B));
        EntityEnderman.llIIlIIlIlIIll[17] = (109 + 80 - 20 + 1 ^ 80 + 111 - 69 + 16);
        EntityEnderman.llIIlIIlIlIIll[18] = (0x65 ^ 0xF) + (0x2 ^ 0x54) - (51 + 84 - 12 + 58) + (0xC8 ^ 0xBD);
        EntityEnderman.llIIlIIlIlIIll[19] = (0x8B ^ 0x82);
        EntityEnderman.llIIlIIlIlIIll[20] = (85 + 74 - 3 + 22 ^ 127 + 134 - 168 + 97);
        EntityEnderman.llIIlIIlIlIIll[21] = (127 + 87 - 105 + 58 ^ 19 + 29 - 17 + 139);
        EntityEnderman.llIIlIIlIlIIll[22] = (0x32 ^ 0x5E ^ (0xC5 ^ 0xA7));
        EntityEnderman.llIIlIIlIlIIll[23] = (0x18 ^ 0x17);
    }
    
    @Override
    protected Item getDropItem() {
        return Items.ender_pearl;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIlllIIlIlIlIlIllIlIl) {
        super.writeEntityToNBT(llllllllllllIlllIIlIlIlIlIllIlIl);
        final IBlockState llllllllllllIlllIIlIlIlIlIllIlII = this.getHeldBlockState();
        llllllllllllIlllIIlIlIlIlIllIlIl.setShort(EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[2]], (short)Block.getIdFromBlock(llllllllllllIlllIIlIlIlIlIllIlII.getBlock()));
        llllllllllllIlllIIlIlIlIlIllIlIl.setShort(EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[7]], (short)llllllllllllIlllIIlIlIlIlIllIlII.getBlock().getMetaFromState(llllllllllllIlllIIlIlIlIlIllIlII));
    }
    
    private static int lIIIllIIIllIIIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean isScreaming() {
        if (lIIIllIIIlIlllIl(this.dataWatcher.getWatchableObjectByte(EntityEnderman.llIIlIIlIlIIll[10]))) {
            return EntityEnderman.llIIlIIlIlIIll[1] != 0;
        }
        return EntityEnderman.llIIlIIlIlIIll[0] != 0;
    }
    
    private static void lIIIllIIIlIlIlll() {
        (llIIlIIlIlIIlI = new String[EntityEnderman.llIIlIIlIlIIll[23]])[EntityEnderman.llIIlIIlIlIIll[0]] = lIIIllIIIlIlIlII("V2B8L2ojFA5HYlATCUduUWd/R2NSZ3pHYlRjfFtqImB1WxtX", "gRLjZ");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[1]] = lIIIllIIIlIlIlIl("1GT5FO1oHcnLHiaajwT/qopwGinp+1iq", "qQiKX");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[2]] = lIIIllIIIlIlIlII("CxM1FBoNFg==", "hrGfs");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[7]] = lIIIllIIIlIlIlII("OjQWPxg8MSAsBTg=", "YUdMq");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[11]] = lIIIllIIIlIlIlII("CyIcNTgNJw==", "hCnGQ");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[12]] = lIIIllIIIlIlIlII("IRM1CywnFg==", "BrGyE");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[13]] = lIIIllIIIlIlIlII("GS8dOjMfKispLhs=", "zNoHZ");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[3]] = lIIIllIIIlIlIllI("9AsnZyuQTMI=", "YnNFG");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[4]] = lIIIllIIIlIlIlIl("cA09v69bTHtBPGvMkU1xPw==", "vXrpo");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[19]] = lIIIllIIIlIlIlIl("e6RuH5A2LjwidZvS5ifFzFtVXqEe70cp", "hWzFI");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[5]] = lIIIllIIIlIlIlII("JwwxSxMkBzYXGy8NfRUZOBcyCQ==", "JcSev");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[6]] = lIIIllIIIlIlIlII("Ghcodw0ZHC8rBRIWZCoLBR0rNA==", "wxJYh");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[20]] = lIIIllIIIlIlIlIl("+/X6FvGel/xHd87Gg5i649cDGWvcV9gx", "JTSfx");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[21]] = lIIIllIIIlIlIlIl("fJuLui11PQIZMpnbiX2f2G/JTCOWJEqh", "syEUe");
        EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[22]] = lIIIllIIIlIlIlII("LyUOSj0sLgkWNSckQgA9Iz4E", "BJldX");
    }
    
    private static boolean lIIIllIIIllIIlII(final int llllllllllllIlllIIlIlIIllIllIlIl, final int llllllllllllIlllIIlIlIIllIllIlII) {
        return llllllllllllIlllIIlIlIIllIllIlIl < llllllllllllIlllIIlIlIIllIllIlII;
    }
    
    private static boolean lIIIllIIIllIIIIl(final int llllllllllllIlllIIlIlIIllIlIlIlI) {
        return llllllllllllIlllIIlIlIIllIlIlIlI == 0;
    }
    
    protected boolean teleportRandomly() {
        final double llllllllllllIlllIIlIlIlIIlllllll = this.posX + (this.rand.nextDouble() - 0.5) * 64.0;
        final double llllllllllllIlllIIlIlIlIIllllllI = this.posY + (this.rand.nextInt(EntityEnderman.llIIlIIlIlIIll[16]) - EntityEnderman.llIIlIIlIlIIll[17]);
        final double llllllllllllIlllIIlIlIlIIlllllIl = this.posZ + (this.rand.nextDouble() - 0.5) * 64.0;
        return this.teleportTo(llllllllllllIlllIIlIlIlIIlllllll, llllllllllllIlllIIlIlIlIIllllllI, llllllllllllIlllIIlIlIlIIlllllIl);
    }
    
    protected boolean teleportToEntity(final Entity llllllllllllIlllIIlIlIlIIllIlIIl) {
        Vec3 llllllllllllIlllIIlIlIlIIllIllll = new Vec3(this.posX - llllllllllllIlllIIlIlIlIIllIlIIl.posX, this.getEntityBoundingBox().minY + this.height / 2.0f - llllllllllllIlllIIlIlIlIIllIlIIl.posY + llllllllllllIlllIIlIlIlIIllIlIIl.getEyeHeight(), this.posZ - llllllllllllIlllIIlIlIlIIllIlIIl.posZ);
        llllllllllllIlllIIlIlIlIIllIllll = llllllllllllIlllIIlIlIlIIllIllll.normalize();
        final double llllllllllllIlllIIlIlIlIIllIlllI = 16.0;
        final double llllllllllllIlllIIlIlIlIIllIllIl = this.posX + (this.rand.nextDouble() - 0.5) * 8.0 - llllllllllllIlllIIlIlIlIIllIllll.xCoord * llllllllllllIlllIIlIlIlIIllIlllI;
        final double llllllllllllIlllIIlIlIlIIllIllII = this.posY + (this.rand.nextInt(EntityEnderman.llIIlIIlIlIIll[8]) - EntityEnderman.llIIlIIlIlIIll[4]) - llllllllllllIlllIIlIlIlIIllIllll.yCoord * llllllllllllIlllIIlIlIlIIllIlllI;
        final double llllllllllllIlllIIlIlIlIIllIlIll = this.posZ + (this.rand.nextDouble() - 0.5) * 8.0 - llllllllllllIlllIIlIlIlIIllIllll.zCoord * llllllllllllIlllIIlIlIlIIllIlllI;
        return this.teleportTo(llllllllllllIlllIIlIlIlIIllIllIl, llllllllllllIlllIIlIlIlIIllIllII, llllllllllllIlllIIlIlIlIIllIlIll);
    }
    
    @Override
    protected String getDeathSound() {
        return EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[22]];
    }
    
    private static boolean lIIIllIIIlIllIll(final Object llllllllllllIlllIIlIlIIllIllIIlI) {
        return llllllllllllIlllIIlIlIIllIllIIlI != null;
    }
    
    @Override
    protected void dropFewItems(final boolean llllllllllllIlllIIlIlIlIIIIllllI, final int llllllllllllIlllIIlIlIlIIIIlllIl) {
        final Item llllllllllllIlllIIlIlIlIIIIlllII = this.getDropItem();
        if (lIIIllIIIlIllIll(llllllllllllIlllIIlIlIlIIIIlllII)) {
            final int llllllllllllIlllIIlIlIlIIIIllIll = this.rand.nextInt(EntityEnderman.llIIlIIlIlIIll[2] + llllllllllllIlllIIlIlIlIIIIlllIl);
            int llllllllllllIlllIIlIlIlIIIIllIlI = EntityEnderman.llIIlIIlIlIIll[0];
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
            while (!lIIIllIIIlIllllI(llllllllllllIlllIIlIlIlIIIIllIlI, llllllllllllIlllIIlIlIlIIIIllIll)) {
                this.dropItem(llllllllllllIlllIIlIlIlIIIIlllII, EntityEnderman.llIIlIIlIlIIll[1]);
                "".length();
                ++llllllllllllIlllIIlIlIlIIIIllIlI;
            }
        }
    }
    
    private static String lIIIllIIIlIlIlII(String llllllllllllIlllIIlIlIIlllIlIIIl, final String llllllllllllIlllIIlIlIIlllIlIIII) {
        llllllllllllIlllIIlIlIIlllIlIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIIlIlIIlllIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIlIlIIlllIlIlII = new StringBuilder();
        final char[] llllllllllllIlllIIlIlIIlllIlIIll = llllllllllllIlllIIlIlIIlllIlIIII.toCharArray();
        int llllllllllllIlllIIlIlIIlllIlIIlI = EntityEnderman.llIIlIIlIlIIll[0];
        final boolean llllllllllllIlllIIlIlIIlllIIllII = (Object)llllllllllllIlllIIlIlIIlllIlIIIl.toCharArray();
        final int llllllllllllIlllIIlIlIIlllIIlIll = llllllllllllIlllIIlIlIIlllIIllII.length;
        double llllllllllllIlllIIlIlIIlllIIlIlI = EntityEnderman.llIIlIIlIlIIll[0];
        while (lIIIllIIIllIIlII((int)llllllllllllIlllIIlIlIIlllIIlIlI, llllllllllllIlllIIlIlIIlllIIlIll)) {
            final char llllllllllllIlllIIlIlIIlllIlIlll = llllllllllllIlllIIlIlIIlllIIllII[llllllllllllIlllIIlIlIIlllIIlIlI];
            llllllllllllIlllIIlIlIIlllIlIlII.append((char)(llllllllllllIlllIIlIlIIlllIlIlll ^ llllllllllllIlllIIlIlIIlllIlIIll[llllllllllllIlllIIlIlIIlllIlIIlI % llllllllllllIlllIIlIlIIlllIlIIll.length]));
            "".length();
            ++llllllllllllIlllIIlIlIIlllIlIIlI;
            ++llllllllllllIlllIIlIlIIlllIIlIlI;
            "".length();
            if (((34 + 8 + 19 + 194 ^ 12 + 137 - 4 + 18) & (0x60 ^ 0x4F ^ (0xD1 ^ 0xA2) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIlIlIIlllIlIlII);
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIlllIIlIlIlIlIlIllII) {
        super.readEntityFromNBT(llllllllllllIlllIIlIlIlIlIlIllII);
        IBlockState llllllllllllIlllIIlIlIlIlIlIlIlI = null;
        if (lIIIllIIIlIllIIl(llllllllllllIlllIIlIlIlIlIlIllII.hasKey(EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[11]], EntityEnderman.llIIlIIlIlIIll[4]) ? 1 : 0)) {
            final IBlockState llllllllllllIlllIIlIlIlIlIlIlIll = Block.getBlockFromName(llllllllllllIlllIIlIlIlIlIlIllII.getString(EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[12]])).getStateFromMeta(llllllllllllIlllIIlIlIlIlIlIllII.getShort(EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[13]]) & EntityEnderman.llIIlIIlIlIIll[14]);
            "".length();
            if (" ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlllIIlIlIlIlIlIlIlI = Block.getBlockById(llllllllllllIlllIIlIlIlIlIlIllII.getShort(EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[3]])).getStateFromMeta(llllllllllllIlllIIlIlIlIlIlIllII.getShort(EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[4]]) & EntityEnderman.llIIlIIlIlIIll[14]);
        }
        this.setHeldBlockState(llllllllllllIlllIIlIlIlIlIlIlIlI);
    }
    
    private static int lIIIllIIIlIlllll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    protected String getHurtSound() {
        return EntityEnderman.llIIlIIlIlIIlI[EntityEnderman.llIIlIIlIlIIll[21]];
    }
    
    private static boolean lIIIllIIIllIIIll(final int llllllllllllIlllIIlIlIIllIlIIllI) {
        return llllllllllllIlllIIlIlIIllIlIIllI <= 0;
    }
    
    private static boolean lIIIllIIIllIIIlI(final int llllllllllllIlllIIlIlIIllIlIlIII) {
        return llllllllllllIlllIIlIlIIllIlIlIII < 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlllIIlIlIlIIIIIIIIl, final float llllllllllllIlllIIlIlIlIIIIIIIII) {
        if (lIIIllIIIlIllIIl(this.isEntityInvulnerable(llllllllllllIlllIIlIlIlIIIIIIIIl) ? 1 : 0)) {
            return EntityEnderman.llIIlIIlIlIIll[0] != 0;
        }
        if (!lIIIllIIIlIllIll(llllllllllllIlllIIlIlIlIIIIIIIIl.getEntity()) || lIIIllIIIllIIIIl((llllllllllllIlllIIlIlIlIIIIIIIIl.getEntity() instanceof EntityEndermite) ? 1 : 0)) {
            if (lIIIllIIIllIIIIl(this.worldObj.isRemote ? 1 : 0)) {
                this.setScreaming((boolean)(EntityEnderman.llIIlIIlIlIIll[1] != 0));
            }
            if (lIIIllIIIlIllIIl((llllllllllllIlllIIlIlIlIIIIIIIIl instanceof EntityDamageSource) ? 1 : 0) && lIIIllIIIlIllIIl((llllllllllllIlllIIlIlIlIIIIIIIIl.getEntity() instanceof EntityPlayer) ? 1 : 0)) {
                if (lIIIllIIIlIllIIl((llllllllllllIlllIIlIlIlIIIIIIIIl.getEntity() instanceof EntityPlayerMP) ? 1 : 0) && lIIIllIIIlIllIIl(((EntityPlayerMP)llllllllllllIlllIIlIlIlIIIIIIIIl.getEntity()).theItemInWorldManager.isCreative() ? 1 : 0)) {
                    this.setScreaming((boolean)(EntityEnderman.llIIlIIlIlIIll[0] != 0));
                    "".length();
                    if (((0x72 ^ 0x4E) & ~(0x55 ^ 0x69)) < 0) {
                        return ((0x71 ^ 0x2E) & ~(0xD ^ 0x52)) != 0x0;
                    }
                }
                else {
                    this.isAggressive = (EntityEnderman.llIIlIIlIlIIll[1] != 0);
                }
            }
            if (lIIIllIIIlIllIIl((llllllllllllIlllIIlIlIlIIIIIIIIl instanceof EntityDamageSourceIndirect) ? 1 : 0)) {
                this.isAggressive = (EntityEnderman.llIIlIIlIlIIll[0] != 0);
                int llllllllllllIlllIIlIlIlIIIIIIlII = EntityEnderman.llIIlIIlIlIIll[0];
                "".length();
                if (null != null) {
                    return ((0x90 ^ 0x8A ^ (0xDC ^ 0x93)) & (0x34 ^ 0x52 ^ (0x28 ^ 0x1B) ^ -" ".length())) != 0x0;
                }
                while (!lIIIllIIIlIllllI(llllllllllllIlllIIlIlIlIIIIIIlII, EntityEnderman.llIIlIIlIlIIll[16])) {
                    if (lIIIllIIIlIllIIl(this.teleportRandomly() ? 1 : 0)) {
                        return EntityEnderman.llIIlIIlIlIIll[1] != 0;
                    }
                    ++llllllllllllIlllIIlIlIlIIIIIIlII;
                }
                return EntityEnderman.llIIlIIlIlIIll[0] != 0;
            }
        }
        final boolean llllllllllllIlllIIlIlIlIIIIIIIll = super.attackEntityFrom(llllllllllllIlllIIlIlIlIIIIIIIIl, llllllllllllIlllIIlIlIlIIIIIIIII);
        if (lIIIllIIIlIllIIl(llllllllllllIlllIIlIlIlIIIIIIIIl.isUnblockable() ? 1 : 0) && lIIIllIIIlIllIIl(this.rand.nextInt(EntityEnderman.llIIlIIlIlIIll[5]))) {
            this.teleportRandomly();
            "".length();
        }
        return llllllllllllIlllIIlIlIlIIIIIIIll;
    }
    
    public void setHeldBlockState(final IBlockState llllllllllllIlllIIlIlIlIIIIIllll) {
        this.dataWatcher.updateObject(EntityEnderman.llIIlIIlIlIIll[8], (short)(Block.getStateId(llllllllllllIlllIIlIlIlIIIIIllll) & EntityEnderman.llIIlIIlIlIIll[14]));
    }
    
    static class AIPlaceBlock extends EntityAIBase
    {
        private static final /* synthetic */ String[] llIllIIIIIIllI;
        private static final /* synthetic */ int[] llIllIIIIllllI;
        private /* synthetic */ EntityEnderman enderman;
        
        @Override
        public boolean shouldExecute() {
            int n;
            if (lIIlIllIIllIIIll(this.enderman.worldObj.getGameRules().getBoolean(AIPlaceBlock.llIllIIIIIIllI[AIPlaceBlock.llIllIIIIllllI[0]]) ? 1 : 0)) {
                n = AIPlaceBlock.llIllIIIIllllI[0];
                "".length();
                if ("  ".length() > "   ".length()) {
                    return ((0x9E ^ 0xB6) & ~(0xA5 ^ 0x8D)) != 0x0;
                }
            }
            else if (lIIlIllIIllIIlII(this.enderman.getHeldBlockState().getBlock().getMaterial(), Material.air)) {
                n = AIPlaceBlock.llIllIIIIllllI[0];
                "".length();
                if (((0x2B ^ 0x15) & ~(0xFD ^ 0xC3)) >= " ".length()) {
                    return ((0x5C ^ 0x3E) & ~(0xD6 ^ 0xB4)) != 0x0;
                }
            }
            else if (lIIlIllIIllIIIll(this.enderman.getRNG().nextInt(AIPlaceBlock.llIllIIIIllllI[1]))) {
                n = AIPlaceBlock.llIllIIIIllllI[2];
                "".length();
                if ((0x2F ^ 0x70 ^ (0x4 ^ 0x5F)) == "   ".length()) {
                    return ((100 + 66 + 17 + 4 ^ 28 + 31 - 42 + 152) & (0xFA ^ 0xA9 ^ (0x31 ^ 0x70) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = AIPlaceBlock.llIllIIIIllllI[0];
            }
            return n != 0;
        }
        
        private static void lIIlIllIIllIIIlI() {
            (llIllIIIIllllI = new int[4])[0] = ((0x1A ^ 0x55) & ~(0x14 ^ 0x5B));
            AIPlaceBlock.llIllIIIIllllI[1] = (-(0xFFFFFA3E & 0x65C7) & (0xFFFFE7FF & 0x7FD5));
            AIPlaceBlock.llIllIIIIllllI[2] = " ".length();
            AIPlaceBlock.llIllIIIIllllI[3] = "   ".length();
        }
        
        private static boolean lIIlIllIIllIIlIl(final int llllllllllllIllIlIIIIlIIIIIllllI) {
            return llllllllllllIllIlIIIIlIIIIIllllI != 0;
        }
        
        private static String lIIlIllIIIllIlll(String llllllllllllIllIlIIIIlIIIIllIlII, final String llllllllllllIllIlIIIIlIIIIlllIII) {
            llllllllllllIllIlIIIIlIIIIllIlII = new String(Base64.getDecoder().decode(llllllllllllIllIlIIIIlIIIIllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlIIIIlIIIIllIlll = new StringBuilder();
            final char[] llllllllllllIllIlIIIIlIIIIllIllI = llllllllllllIllIlIIIIlIIIIlllIII.toCharArray();
            int llllllllllllIllIlIIIIlIIIIllIlIl = AIPlaceBlock.llIllIIIIllllI[0];
            final double llllllllllllIllIlIIIIlIIIIlIllll = (Object)llllllllllllIllIlIIIIlIIIIllIlII.toCharArray();
            final short llllllllllllIllIlIIIIlIIIIlIlllI = (short)llllllllllllIllIlIIIIlIIIIlIllll.length;
            double llllllllllllIllIlIIIIlIIIIlIllIl = AIPlaceBlock.llIllIIIIllllI[0];
            while (lIIlIllIIllIIlll((int)llllllllllllIllIlIIIIlIIIIlIllIl, llllllllllllIllIlIIIIlIIIIlIlllI)) {
                final char llllllllllllIllIlIIIIlIIIIlllIlI = llllllllllllIllIlIIIIlIIIIlIllll[llllllllllllIllIlIIIIlIIIIlIllIl];
                llllllllllllIllIlIIIIlIIIIllIlll.append((char)(llllllllllllIllIlIIIIlIIIIlllIlI ^ llllllllllllIllIlIIIIlIIIIllIllI[llllllllllllIllIlIIIIlIIIIllIlIl % llllllllllllIllIlIIIIlIIIIllIllI.length]));
                "".length();
                ++llllllllllllIllIlIIIIlIIIIllIlIl;
                ++llllllllllllIllIlIIIIlIIIIlIllIl;
                "".length();
                if (" ".length() <= ((0xEA ^ 0xA9) & ~(0x9 ^ 0x4A))) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlIIIIlIIIIllIlll);
        }
        
        static {
            lIIlIllIIllIIIlI();
            lIIlIllIIIlllIII();
        }
        
        private boolean func_179474_a(final World llllllllllllIllIlIIIIlIIIlIIlIII, final BlockPos llllllllllllIllIlIIIIlIIIlIIIlll, final Block llllllllllllIllIlIIIIlIIIlIIlIll, final Block llllllllllllIllIlIIIIlIIIlIIIlIl, final Block llllllllllllIllIlIIIIlIIIlIIlIIl) {
            int fullCube;
            if (lIIlIllIIllIIIll(llllllllllllIllIlIIIIlIIIlIIlIll.canPlaceBlockAt(llllllllllllIllIlIIIIlIIIlIIlIII, llllllllllllIllIlIIIIlIIIlIIIlll) ? 1 : 0)) {
                fullCube = AIPlaceBlock.llIllIIIIllllI[0];
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return ((0x3E ^ 0xA) & ~(0x9A ^ 0xAE)) != 0x0;
                }
            }
            else if (lIIlIllIIllIIllI(llllllllllllIllIlIIIIlIIIlIIIlIl.getMaterial(), Material.air)) {
                fullCube = AIPlaceBlock.llIllIIIIllllI[0];
                "".length();
                if (null != null) {
                    return ((0x97 ^ 0xC6) & ~(0x71 ^ 0x20)) != 0x0;
                }
            }
            else if (lIIlIllIIllIIlII(llllllllllllIllIlIIIIlIIIlIIlIIl.getMaterial(), Material.air)) {
                fullCube = AIPlaceBlock.llIllIIIIllllI[0];
                "".length();
                if (-(0xD2 ^ 0xAE ^ (0x3C ^ 0x45)) >= 0) {
                    return ((0x64 ^ 0x72 ^ (0x8D ^ 0x81)) & (0xAA ^ 0x89 ^ (0x26 ^ 0x1F) ^ -" ".length())) != 0x0;
                }
            }
            else {
                fullCube = (llllllllllllIllIlIIIIlIIIlIIlIIl.isFullCube() ? 1 : 0);
            }
            return fullCube != 0;
        }
        
        private static boolean lIIlIllIIllIIlll(final int llllllllllllIllIlIIIIlIIIIlIlIIl, final int llllllllllllIllIlIIIIlIIIIlIlIII) {
            return llllllllllllIllIlIIIIlIIIIlIlIIl < llllllllllllIllIlIIIIlIIIIlIlIII;
        }
        
        private static boolean lIIlIllIIllIIlII(final Object llllllllllllIllIlIIIIlIIIIlIIIIl, final Object llllllllllllIllIlIIIIlIIIIlIIIII) {
            return llllllllllllIllIlIIIIlIIIIlIIIIl == llllllllllllIllIlIIIIlIIIIlIIIII;
        }
        
        @Override
        public void updateTask() {
            final Random llllllllllllIllIlIIIIlIIIllIIlII = this.enderman.getRNG();
            final World llllllllllllIllIlIIIIlIIIllIIIll = this.enderman.worldObj;
            final int llllllllllllIllIlIIIIlIIIllIIIlI = MathHelper.floor_double(this.enderman.posX - 1.0 + llllllllllllIllIlIIIIlIIIllIIlII.nextDouble() * 2.0);
            final int llllllllllllIllIlIIIIlIIIllIIIIl = MathHelper.floor_double(this.enderman.posY + llllllllllllIllIlIIIIlIIIllIIlII.nextDouble() * 2.0);
            final int llllllllllllIllIlIIIIlIIIllIIIII = MathHelper.floor_double(this.enderman.posZ - 1.0 + llllllllllllIllIlIIIIlIIIllIIlII.nextDouble() * 2.0);
            final BlockPos llllllllllllIllIlIIIIlIIIlIlllll = new BlockPos(llllllllllllIllIlIIIIlIIIllIIIlI, llllllllllllIllIlIIIIlIIIllIIIIl, llllllllllllIllIlIIIIlIIIllIIIII);
            final Block llllllllllllIllIlIIIIlIIIlIllllI = llllllllllllIllIlIIIIlIIIllIIIll.getBlockState(llllllllllllIllIlIIIIlIIIlIlllll).getBlock();
            final Block llllllllllllIllIlIIIIlIIIlIlllIl = llllllllllllIllIlIIIIlIIIllIIIll.getBlockState(llllllllllllIllIlIIIIlIIIlIlllll.down()).getBlock();
            if (lIIlIllIIllIIlIl(this.func_179474_a(llllllllllllIllIlIIIIlIIIllIIIll, llllllllllllIllIlIIIIlIIIlIlllll, this.enderman.getHeldBlockState().getBlock(), llllllllllllIllIlIIIIlIIIlIllllI, llllllllllllIllIlIIIIlIIIlIlllIl) ? 1 : 0)) {
                llllllllllllIllIlIIIIlIIIllIIIll.setBlockState(llllllllllllIllIlIIIIlIIIlIlllll, this.enderman.getHeldBlockState(), AIPlaceBlock.llIllIIIIllllI[3]);
                "".length();
                this.enderman.setHeldBlockState(Blocks.air.getDefaultState());
            }
        }
        
        private static boolean lIIlIllIIllIIllI(final Object llllllllllllIllIlIIIIlIIIIlIIlIl, final Object llllllllllllIllIlIIIIlIIIIlIIlII) {
            return llllllllllllIllIlIIIIlIIIIlIIlIl != llllllllllllIllIlIIIIlIIIIlIIlII;
        }
        
        private static boolean lIIlIllIIllIIIll(final int llllllllllllIllIlIIIIlIIIIIlllII) {
            return llllllllllllIllIlIIIIlIIIIIlllII == 0;
        }
        
        private static void lIIlIllIIIlllIII() {
            (llIllIIIIIIllI = new String[AIPlaceBlock.llIllIIIIllllI[2]])[AIPlaceBlock.llIllIIIIllllI[0]] = lIIlIllIIIllIlll("BicsDwACLSghHAw=", "kHNHr");
        }
        
        public AIPlaceBlock() {
        }
    }
    
    static class AIFindPlayer extends EntityAINearestAttackableTarget
    {
        private static final /* synthetic */ int[] lIllIIllllIllI;
        private static final /* synthetic */ String[] lIllIIllllIlIl;
        private /* synthetic */ int field_179451_i;
        private /* synthetic */ EntityEnderman enderman;
        private /* synthetic */ EntityPlayer player;
        private /* synthetic */ int field_179450_h;
        
        private static int lllllIllIllIlIl(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        @Override
        public void startExecuting() {
            this.field_179450_h = AIFindPlayer.lIllIIllllIllI[2];
            this.field_179451_i = AIFindPlayer.lIllIIllllIllI[1];
        }
        
        private static int lllllIllIllIllI(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        @Override
        public void updateTask() {
            if (lllllIllIllIIll(this.player)) {
                final int n = this.field_179450_h - AIFindPlayer.lIllIIllllIllI[0];
                this.field_179450_h = n;
                if (lllllIllIllIlll(n)) {
                    this.targetEntity = this.player;
                    this.player = null;
                    super.startExecuting();
                    this.enderman.playSound(AIFindPlayer.lIllIIllllIlIl[AIFindPlayer.lIllIIllllIllI[1]], 1.0f, 1.0f);
                    this.enderman.setScreaming((boolean)(AIFindPlayer.lIllIIllllIllI[0] != 0));
                    final IAttributeInstance lllllllllllllIIIIIIIllllIIllIIIl = this.enderman.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
                    lllllllllllllIIIIIIIllllIIllIIIl.applyModifier(EntityEnderman.attackingSpeedBoostModifier);
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                }
            }
            else {
                if (lllllIllIllIIll(this.targetEntity)) {
                    if (lllllIllIllIIlI((this.targetEntity instanceof EntityPlayer) ? 1 : 0) && lllllIllIllIIlI(EntityEnderman.this.shouldAttackPlayer((EntityPlayer)this.targetEntity) ? 1 : 0)) {
                        if (lllllIllIlllIII(lllllIllIllIlIl(this.targetEntity.getDistanceSqToEntity(this.enderman), 16.0))) {
                            this.enderman.teleportRandomly();
                            "".length();
                        }
                        this.field_179451_i = AIFindPlayer.lIllIIllllIllI[1];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else if (lllllIllIlllIIl(lllllIllIllIllI(this.targetEntity.getDistanceSqToEntity(this.enderman), 256.0))) {
                        final int field_179451_i = this.field_179451_i;
                        this.field_179451_i = field_179451_i + AIFindPlayer.lIllIIllllIllI[0];
                        if (lllllIllIlllIlI(field_179451_i, AIFindPlayer.lIllIIllllIllI[3]) && lllllIllIllIIlI(this.enderman.teleportToEntity(this.targetEntity) ? 1 : 0)) {
                            this.field_179451_i = AIFindPlayer.lIllIIllllIllI[1];
                        }
                    }
                }
                super.updateTask();
            }
        }
        
        private static boolean lllllIllIllIlll(final int lllllllllllllIIIIIIIlllIlllIIlll) {
            return lllllllllllllIIIIIIIlllIlllIIlll <= 0;
        }
        
        @Override
        public boolean continueExecuting() {
            if (!lllllIllIllIIll(this.player)) {
                return super.continueExecuting();
            }
            if (lllllIllIllIlII(EntityEnderman.this.shouldAttackPlayer(this.player) ? 1 : 0)) {
                return AIFindPlayer.lIllIIllllIllI[1] != 0;
            }
            EntityEnderman.access$2(this.enderman, (boolean)(AIFindPlayer.lIllIIllllIllI[0] != 0));
            this.enderman.faceEntity(this.player, 10.0f, 10.0f);
            return AIFindPlayer.lIllIIllllIllI[0] != 0;
        }
        
        private static boolean lllllIllIlllIll(final int lllllllllllllIIIIIIIlllIlllllIlI, final int lllllllllllllIIIIIIIlllIlllllIIl) {
            return lllllllllllllIIIIIIIlllIlllllIlI < lllllllllllllIIIIIIIlllIlllllIIl;
        }
        
        private static boolean lllllIllIlllIII(final int lllllllllllllIIIIIIIlllIlllIlIll) {
            return lllllllllllllIIIIIIIlllIlllIlIll < 0;
        }
        
        private static String lllllIllIlIlIll(String lllllllllllllIIIIIIIllllIIIlIlII, final String lllllllllllllIIIIIIIllllIIIlIIlI) {
            lllllllllllllIIIIIIIllllIIIlIlII = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIIllllIIIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIIIIllllIIIllIlI = new StringBuilder();
            final char[] lllllllllllllIIIIIIIllllIIIllIII = lllllllllllllIIIIIIIllllIIIlIIlI.toCharArray();
            int lllllllllllllIIIIIIIllllIIIlIllI = AIFindPlayer.lIllIIllllIllI[1];
            final int lllllllllllllIIIIIIIllllIIIIllIl = (Object)((String)lllllllllllllIIIIIIIllllIIIlIlII).toCharArray();
            final float lllllllllllllIIIIIIIllllIIIIlIll = lllllllllllllIIIIIIIllllIIIIllIl.length;
            Exception lllllllllllllIIIIIIIllllIIIIlIIl = (Exception)AIFindPlayer.lIllIIllllIllI[1];
            while (lllllIllIlllIll((int)lllllllllllllIIIIIIIllllIIIIlIIl, (int)lllllllllllllIIIIIIIllllIIIIlIll)) {
                final char lllllllllllllIIIIIIIllllIIIlllll = lllllllllllllIIIIIIIllllIIIIllIl[lllllllllllllIIIIIIIllllIIIIlIIl];
                lllllllllllllIIIIIIIllllIIIllIlI.append((char)(lllllllllllllIIIIIIIllllIIIlllll ^ lllllllllllllIIIIIIIllllIIIllIII[lllllllllllllIIIIIIIllllIIIlIllI % lllllllllllllIIIIIIIllllIIIllIII.length]));
                "".length();
                ++lllllllllllllIIIIIIIllllIIIlIllI;
                ++lllllllllllllIIIIIIIllllIIIIlIIl;
                "".length();
                if ((0x8 ^ 0xD) <= 0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIIIIllllIIIllIlI);
        }
        
        @Override
        public boolean shouldExecute() {
            final double lllllllllllllIIIIIIIllllIlIlllIl = this.getTargetDistance();
            final List<EntityPlayer> lllllllllllllIIIIIIIllllIlIlllII = this.taskOwner.worldObj.getEntitiesWithinAABB((Class<? extends EntityPlayer>)EntityPlayer.class, this.taskOwner.getEntityBoundingBox().expand(lllllllllllllIIIIIIIllllIlIlllIl, 4.0, lllllllllllllIIIIIIIllllIlIlllIl), (com.google.common.base.Predicate<? super EntityPlayer>)this.targetEntitySelector);
            Collections.sort(lllllllllllllIIIIIIIllllIlIlllII, this.theNearestAttackableTargetSorter);
            if (lllllIllIllIIlI(lllllllllllllIIIIIIIllllIlIlllII.isEmpty() ? 1 : 0)) {
                return AIFindPlayer.lIllIIllllIllI[1] != 0;
            }
            this.player = lllllllllllllIIIIIIIllllIlIlllII.get(AIFindPlayer.lIllIIllllIllI[1]);
            return AIFindPlayer.lIllIIllllIllI[0] != 0;
        }
        
        private static boolean lllllIllIllIIlI(final int lllllllllllllIIIIIIIlllIllllIlIl) {
            return lllllllllllllIIIIIIIlllIllllIlIl != 0;
        }
        
        private static boolean lllllIllIlllIIl(final int lllllllllllllIIIIIIIlllIlllIIIlI) {
            return lllllllllllllIIIIIIIlllIlllIIIlI > 0;
        }
        
        private static boolean lllllIllIlllIlI(final int lllllllllllllIIIIIIIlllIlllllllI, final int lllllllllllllIIIIIIIlllIllllllIl) {
            return lllllllllllllIIIIIIIlllIlllllllI >= lllllllllllllIIIIIIIlllIllllllIl;
        }
        
        private static boolean lllllIllIllIlII(final int lllllllllllllIIIIIIIlllIllllIIII) {
            return lllllllllllllIIIIIIIlllIllllIIII == 0;
        }
        
        private static void lllllIllIlIllIl() {
            (lIllIIllllIlIl = new String[AIFindPlayer.lIllIIllllIllI[0]])[AIFindPlayer.lIllIIllllIllI[1]] = lllllIllIlIlIll("PgwnXw49ByADBjYNawIfMhEg", "ScEqk");
        }
        
        @Override
        public void resetTask() {
            this.player = null;
            this.enderman.setScreaming((boolean)(AIFindPlayer.lIllIIllllIllI[1] != 0));
            final IAttributeInstance lllllllllllllIIIIIIIllllIlIIlllI = this.enderman.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
            lllllllllllllIIIIIIIllllIlIIlllI.removeModifier(EntityEnderman.attackingSpeedBoostModifier);
            super.resetTask();
        }
        
        public AIFindPlayer() {
            super(EntityEnderman.this, EntityPlayer.class, (boolean)(AIFindPlayer.lIllIIllllIllI[0] != 0));
        }
        
        private static boolean lllllIllIllIIll(final Object lllllllllllllIIIIIIIlllIllllIlll) {
            return lllllllllllllIIIIIIIlllIllllIlll != null;
        }
        
        static {
            lllllIllIllIIIl();
            lllllIllIlIllIl();
        }
        
        private static void lllllIllIllIIIl() {
            (lIllIIllllIllI = new int[4])[0] = " ".length();
            AIFindPlayer.lIllIIllllIllI[1] = ((0xA7 ^ 0xC4) & ~(0x72 ^ 0x11));
            AIFindPlayer.lIllIIllllIllI[2] = (70 + 118 - 86 + 74 ^ 177 + 144 - 145 + 5);
            AIFindPlayer.lIllIIllllIllI[3] = (0x9 ^ 0x4 ^ (0x96 ^ 0x85));
        }
    }
    
    static class AITakeBlock extends EntityAIBase
    {
        private static final /* synthetic */ String[] lIIlIllIlIlIlI;
        private /* synthetic */ EntityEnderman enderman;
        private static final /* synthetic */ int[] lIIlIllIlIllII;
        
        @Override
        public void updateTask() {
            final Random lllllllllllllIIllIIIllllllIIllll = this.enderman.getRNG();
            final World lllllllllllllIIllIIIllllllIIlllI = this.enderman.worldObj;
            final int lllllllllllllIIllIIIllllllIIllIl = MathHelper.floor_double(this.enderman.posX - 2.0 + lllllllllllllIIllIIIllllllIIllll.nextDouble() * 4.0);
            final int lllllllllllllIIllIIIllllllIIllII = MathHelper.floor_double(this.enderman.posY + lllllllllllllIIllIIIllllllIIllll.nextDouble() * 3.0);
            final int lllllllllllllIIllIIIllllllIIlIll = MathHelper.floor_double(this.enderman.posZ - 2.0 + lllllllllllllIIllIIIllllllIIllll.nextDouble() * 4.0);
            final BlockPos lllllllllllllIIllIIIllllllIIlIlI = new BlockPos(lllllllllllllIIllIIIllllllIIllIl, lllllllllllllIIllIIIllllllIIllII, lllllllllllllIIllIIIllllllIIlIll);
            final IBlockState lllllllllllllIIllIIIllllllIIlIIl = lllllllllllllIIllIIIllllllIIlllI.getBlockState(lllllllllllllIIllIIIllllllIIlIlI);
            final Block lllllllllllllIIllIIIllllllIIlIII = lllllllllllllIIllIIIllllllIIlIIl.getBlock();
            if (llIlIIlIllIllIl(EntityEnderman.carriableBlocks.contains(lllllllllllllIIllIIIllllllIIlIII) ? 1 : 0)) {
                this.enderman.setHeldBlockState(lllllllllllllIIllIIIllllllIIlIIl);
                lllllllllllllIIllIIIllllllIIlllI.setBlockState(lllllllllllllIIllIIIllllllIIlIlI, Blocks.air.getDefaultState());
                "".length();
            }
        }
        
        static {
            llIlIIlIllIIlll();
            llIlIIlIlIllIll();
        }
        
        private static void llIlIIlIllIIlll() {
            (lIIlIllIlIllII = new int[5])[0] = ((81 + 79 - 98 + 66 ^ 7 + 51 - 0 + 112) & (88 + 20 + 23 + 46 ^ 66 + 3 - 30 + 116 ^ -" ".length()));
            AITakeBlock.lIIlIllIlIllII[1] = (0x23 ^ 0x37);
            AITakeBlock.lIIlIllIlIllII[2] = " ".length();
            AITakeBlock.lIIlIllIlIllII[3] = (0x66 ^ 0x14 ^ (0x51 ^ 0x2B));
            AITakeBlock.lIIlIllIlIllII[4] = "  ".length();
        }
        
        private static boolean llIlIIlIllIlIIl(final int lllllllllllllIIllIIIlllllIlIlIlI) {
            return lllllllllllllIIllIIIlllllIlIlIlI == 0;
        }
        
        public AITakeBlock() {
        }
        
        private static String llIlIIlIlIllIlI(final String lllllllllllllIIllIIIlllllIllIlll, final String lllllllllllllIIllIIIlllllIllIllI) {
            try {
                final SecretKeySpec lllllllllllllIIllIIIlllllIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIIlllllIllIllI.getBytes(StandardCharsets.UTF_8)), AITakeBlock.lIIlIllIlIllII[3]), "DES");
                final Cipher lllllllllllllIIllIIIlllllIlllIIl = Cipher.getInstance("DES");
                lllllllllllllIIllIIIlllllIlllIIl.init(AITakeBlock.lIIlIllIlIllII[4], lllllllllllllIIllIIIlllllIlllIlI);
                return new String(lllllllllllllIIllIIIlllllIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIIlllllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIIIlllllIlllIII) {
                lllllllllllllIIllIIIlllllIlllIII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public boolean shouldExecute() {
            int n;
            if (llIlIIlIllIlIIl(this.enderman.worldObj.getGameRules().getBoolean(AITakeBlock.lIIlIllIlIlIlI[AITakeBlock.lIIlIllIlIllII[0]]) ? 1 : 0)) {
                n = AITakeBlock.lIIlIllIlIllII[0];
                "".length();
                if (null != null) {
                    return ((0x86 ^ 0x97) & ~(0x7D ^ 0x6C)) != 0x0;
                }
            }
            else if (llIlIIlIllIlIll(this.enderman.getHeldBlockState().getBlock().getMaterial(), Material.air)) {
                n = AITakeBlock.lIIlIllIlIllII[0];
                "".length();
                if (-(0x6F ^ 0x6B) >= 0) {
                    return ((0x3D ^ 0x79) & ~(0x2A ^ 0x6E)) != 0x0;
                }
            }
            else if (llIlIIlIllIlIIl(this.enderman.getRNG().nextInt(AITakeBlock.lIIlIllIlIllII[1]))) {
                n = AITakeBlock.lIIlIllIlIllII[2];
                "".length();
                if (-" ".length() == (175 + 0 - 53 + 70 ^ 74 + 85 - 93 + 130)) {
                    return (" ".length() & (" ".length() ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = AITakeBlock.lIIlIllIlIllII[0];
            }
            return n != 0;
        }
        
        private static boolean llIlIIlIllIllIl(final int lllllllllllllIIllIIIlllllIlIllII) {
            return lllllllllllllIIllIIIlllllIlIllII != 0;
        }
        
        private static boolean llIlIIlIllIlIll(final Object lllllllllllllIIllIIIlllllIlIllll, final Object lllllllllllllIIllIIIlllllIlIlllI) {
            return lllllllllllllIIllIIIlllllIlIllll != lllllllllllllIIllIIIlllllIlIlllI;
        }
        
        private static void llIlIIlIlIllIll() {
            (lIIlIllIlIlIlI = new String[AITakeBlock.lIIlIllIlIllII[2]])[AITakeBlock.lIIlIllIlIllII[0]] = llIlIIlIlIllIlI("yMB1UzZ7qz1aF5y8lLAXVg==", "DOXSr");
        }
    }
}
