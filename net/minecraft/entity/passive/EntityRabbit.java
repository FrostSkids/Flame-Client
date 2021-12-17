// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityJumpHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockCarrot;
import net.minecraft.entity.ai.EntityAIMoveToBlock;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.pathfinding.PathNavigateGround;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.Vec3;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;
import net.minecraft.item.Item;
import net.minecraft.util.StatCollector;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;

public class EntityRabbit extends EntityAnimal
{
    private /* synthetic */ boolean field_175536_bo;
    private static final /* synthetic */ int[] lIIIlllIlIllll;
    private /* synthetic */ AIAvoidEntity<EntityWolf> aiAvoidWolves;
    private /* synthetic */ boolean field_175537_bp;
    private /* synthetic */ int carrotTicks;
    private /* synthetic */ int field_175535_bn;
    private static final /* synthetic */ String[] lIIIlllIlIllIl;
    private /* synthetic */ int currentMoveTypeDuration;
    private /* synthetic */ EntityPlayer field_175543_bt;
    private /* synthetic */ int field_175540_bm;
    private /* synthetic */ EnumMoveType moveType;
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIllllIllllIIIIlIII) {
        super.readEntityFromNBT(lllllllllllllIIllllIllllIIIIlIII);
        this.setRabbitType(lllllllllllllIIllllIllllIIIIlIII.getInteger(EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[2]]));
        this.carrotTicks = lllllllllllllIIllllIllllIIIIlIII.getInteger(EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[3]]);
    }
    
    private static boolean llIIIllIlllIIlI(final int lllllllllllllIIllllIlllIIlIlIIIl) {
        return lllllllllllllIIllllIlllIIlIlIIIl < 0;
    }
    
    private void func_175518_cr() {
        ((RabbitJumpHelper)this.jumpHelper).func_180066_a((boolean)(EntityRabbit.lIIIlllIlIllll[1] != 0));
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896);
    }
    
    private static boolean llIIIllIllIlIll(final int lllllllllllllIIllllIlllIIlIlIlIl) {
        return lllllllllllllIIllllIlllIIlIlIlIl != 0;
    }
    
    protected String getJumpingSound() {
        return EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[6]];
    }
    
    private static boolean llIIIllIllIlllI(final Object lllllllllllllIIllllIlllIIlIllIlI, final Object lllllllllllllIIllllIlllIIlIllIIl) {
        return lllllllllllllIIllllIlllIIlIllIlI == lllllllllllllIIllllIlllIIlIllIIl;
    }
    
    protected void createEatingParticles() {
        final World worldObj = this.worldObj;
        final EnumParticleTypes block_DUST = EnumParticleTypes.BLOCK_DUST;
        final double lllllllllllllIIIlIIllllIIlIlllll = this.posX + this.rand.nextFloat() * this.width * 2.0f - this.width;
        final double lllllllllllllIIIlIIllllIIlIllllI = this.posY + 0.5 + this.rand.nextFloat() * this.height;
        final double lllllllllllllIIIlIIllllIIlIlllIl = this.posZ + this.rand.nextFloat() * this.width * 2.0f - this.width;
        final double lllllllllllllIIIlIIllllIIllIIlIl = 0.0;
        final double lllllllllllllIIIlIIllllIIllIIlII = 0.0;
        final double lllllllllllllIIIlIIllllIIlIllIlI = 0.0;
        final int[] lllllllllllllIIIlIIllllIIlIllIIl = new int[EntityRabbit.lIIIlllIlIllll[1]];
        lllllllllllllIIIlIIllllIIlIllIIl[EntityRabbit.lIIIlllIlIllll[0]] = Block.getStateId(Blocks.carrots.getStateFromMeta(EntityRabbit.lIIIlllIlIllll[10]));
        worldObj.spawnParticle(block_DUST, lllllllllllllIIIlIIllllIIlIlllll, lllllllllllllIIIlIIllllIIlIllllI, lllllllllllllIIIlIIllllIIlIlllIl, lllllllllllllIIIlIIllllIIllIIlIl, lllllllllllllIIIlIIllllIIllIIlII, lllllllllllllIIIlIIllllIIlIllIlI, lllllllllllllIIIlIIllllIIlIllIIl);
        this.carrotTicks = EntityRabbit.lIIIlllIlIllll[14];
    }
    
    @Override
    protected String getDeathSound() {
        return EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[10]];
    }
    
    public boolean func_175523_cj() {
        return this.field_175536_bo;
    }
    
    private boolean isCarrotEaten() {
        if (llIIIllIllIllIl(this.carrotTicks)) {
            return EntityRabbit.lIIIlllIlIllll[1] != 0;
        }
        return EntityRabbit.lIIIlllIlIllll[0] != 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIllllIlllIllllIIIl, final float lllllllllllllIIllllIlllIllllIIll) {
        int attackEntity;
        if (llIIIllIllIlIll(this.isEntityInvulnerable(lllllllllllllIIllllIlllIllllIIIl) ? 1 : 0)) {
            attackEntity = EntityRabbit.lIIIlllIlIllll[0];
            "".length();
            if ("   ".length() <= ((0xA3 ^ 0xC0) & ~(0x1E ^ 0x7D))) {
                return ((0xA7 ^ 0xAA) & ~(0xCA ^ 0xC7)) != 0x0;
            }
        }
        else {
            attackEntity = (super.attackEntityFrom(lllllllllllllIIllllIlllIllllIIIl, lllllllllllllIIllllIlllIllllIIll) ? 1 : 0);
        }
        return attackEntity != 0;
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (llIIIllIlllIllI(this.field_175540_bm, this.field_175535_bn)) {
            if (llIIIllIllIllIl(this.field_175540_bm) && llIIIllIllIllIl(this.worldObj.isRemote ? 1 : 0)) {
                this.worldObj.setEntityState(this, (byte)EntityRabbit.lIIIlllIlIllll[1]);
            }
            this.field_175540_bm += EntityRabbit.lIIIlllIlIllll[1];
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        else if (llIIIllIllIlIll(this.field_175535_bn)) {
            this.field_175540_bm = EntityRabbit.lIIIlllIlIllll[0];
            this.field_175535_bn = EntityRabbit.lIIIlllIlIllll[0];
        }
    }
    
    @Override
    protected void addRandomDrop() {
        this.entityDropItem(new ItemStack(Items.rabbit_foot, EntityRabbit.lIIIlllIlIllll[1]), 0.0f);
        "".length();
    }
    
    private static boolean llIIIllIlllIIll(final int lllllllllllllIIllllIlllIIllIlIlI, final int lllllllllllllIIllllIlllIIllIlIIl) {
        return lllllllllllllIIllllIlllIIllIlIlI == lllllllllllllIIllllIlllIIllIlIIl;
    }
    
    private static String llIIIllIlIlIlll(String lllllllllllllIIllllIlllIIlllIlIl, final String lllllllllllllIIllllIlllIIllllIIl) {
        lllllllllllllIIllllIlllIIlllIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIllllIlllIIlllIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIlllIIllllIII = new StringBuilder();
        final char[] lllllllllllllIIllllIlllIIlllIlll = lllllllllllllIIllllIlllIIllllIIl.toCharArray();
        int lllllllllllllIIllllIlllIIlllIllI = EntityRabbit.lIIIlllIlIllll[0];
        final long lllllllllllllIIllllIlllIIlllIIII = (Object)lllllllllllllIIllllIlllIIlllIlIl.toCharArray();
        final float lllllllllllllIIllllIlllIIllIllll = lllllllllllllIIllllIlllIIlllIIII.length;
        String lllllllllllllIIllllIlllIIllIlllI = (String)EntityRabbit.lIIIlllIlIllll[0];
        while (llIIIllIlllIlIl((int)lllllllllllllIIllllIlllIIllIlllI, (int)lllllllllllllIIllllIlllIIllIllll)) {
            final char lllllllllllllIIllllIlllIIllllIll = lllllllllllllIIllllIlllIIlllIIII[lllllllllllllIIllllIlllIIllIlllI];
            lllllllllllllIIllllIlllIIllllIII.append((char)(lllllllllllllIIllllIlllIIllllIll ^ lllllllllllllIIllllIlllIIlllIlll[lllllllllllllIIllllIlllIIlllIllI % lllllllllllllIIllllIlllIIlllIlll.length]));
            "".length();
            ++lllllllllllllIIllllIlllIIlllIllI;
            ++lllllllllllllIIllllIlllIIllIlllI;
            "".length();
            if (" ".length() >= (0x98 ^ 0x9C)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIlllIIllllIII);
    }
    
    public void setRabbitType(final int lllllllllllllIIllllIlllIllIIIlIl) {
        if (llIIIllIlllIIll(lllllllllllllIIllllIlllIllIIIlIl, EntityRabbit.lIIIlllIlIllll[8])) {
            this.tasks.removeTask(this.aiAvoidWolves);
            this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[6], new AIEvilAttack(this));
            this.targetTasks.addTask(EntityRabbit.lIIIlllIlIllll[1], new EntityAIHurtByTarget(this, (boolean)(EntityRabbit.lIIIlllIlIllll[0] != 0), new Class[EntityRabbit.lIIIlllIlIllll[0]]));
            this.targetTasks.addTask(EntityRabbit.lIIIlllIlIllll[2], new EntityAINearestAttackableTarget<Object>(this, EntityPlayer.class, (boolean)(EntityRabbit.lIIIlllIlIllll[1] != 0)));
            this.targetTasks.addTask(EntityRabbit.lIIIlllIlIllll[2], new EntityAINearestAttackableTarget<Object>(this, EntityWolf.class, (boolean)(EntityRabbit.lIIIlllIlIllll[1] != 0)));
            if (llIIIllIllIllIl(this.hasCustomName() ? 1 : 0)) {
                this.setCustomNameTag(StatCollector.translateToLocal(EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[12]]));
            }
        }
        this.dataWatcher.updateObject(EntityRabbit.lIIIlllIlIllll[7], (byte)lllllllllllllIIllllIlllIllIIIlIl);
    }
    
    @Override
    protected String getHurtSound() {
        return EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[9]];
    }
    
    @Override
    public boolean isBreedingItem(final ItemStack lllllllllllllIIllllIlllIllIIllII) {
        if (llIIIllIlllIlII(lllllllllllllIIllllIlllIllIIllII) && llIIIllIllIlIll(this.isRabbitBreedingItem(lllllllllllllIIllllIlllIllIIllII.getItem()) ? 1 : 0)) {
            return EntityRabbit.lIIIlllIlIllll[1] != 0;
        }
        return EntityRabbit.lIIIlllIlIllll[0] != 0;
    }
    
    @Override
    public EntityRabbit createChild(final EntityAgeable lllllllllllllIIllllIlllIllIlIllI) {
        final EntityRabbit lllllllllllllIIllllIlllIllIlIlIl = new EntityRabbit(this.worldObj);
        if (llIIIllIllIlIll((lllllllllllllIIllllIlllIllIlIllI instanceof EntityRabbit) ? 1 : 0)) {
            final EntityRabbit entityRabbit = lllllllllllllIIllllIlllIllIlIlIl;
            int rabbitType;
            if (llIIIllIllIlIll(this.rand.nextBoolean() ? 1 : 0)) {
                rabbitType = this.getRabbitType();
                "".length();
                if ("  ".length() >= (0xF ^ 0xB)) {
                    return null;
                }
            }
            else {
                rabbitType = ((EntityRabbit)lllllllllllllIIllllIlllIllIlIllI).getRabbitType();
            }
            entityRabbit.setRabbitType(rabbitType);
        }
        return lllllllllllllIIllllIlllIllIlIlIl;
    }
    
    private boolean isRabbitBreedingItem(final Item lllllllllllllIIllllIlllIllIlllII) {
        if (llIIIllIlllIIIl(lllllllllllllIIllllIlllIllIlllII, Items.carrot) && llIIIllIlllIIIl(lllllllllllllIIllllIlllIllIlllII, Items.golden_carrot) && llIIIllIlllIIIl(lllllllllllllIIllllIlllIllIlllII, Item.getItemFromBlock(Blocks.yellow_flower))) {
            return EntityRabbit.lIIIlllIlIllll[0] != 0;
        }
        return EntityRabbit.lIIIlllIlIllll[1] != 0;
    }
    
    private static boolean llIIIllIlllIlIl(final int lllllllllllllIIllllIlllIIllIIIlI, final int lllllllllllllIIllllIlllIIllIIIIl) {
        return lllllllllllllIIllllIlllIIllIIIlI < lllllllllllllIIllllIlllIIllIIIIl;
    }
    
    public void setJumping(final boolean lllllllllllllIIllllIllllIlIIlIII, final EnumMoveType lllllllllllllIIllllIllllIlIIIlll) {
        super.setJumping(lllllllllllllIIllllIllllIlIIlIII);
        if (llIIIllIllIllIl(lllllllllllllIIllllIllllIlIIlIII ? 1 : 0)) {
            if (llIIIllIllIlllI(this.moveType, EnumMoveType.ATTACK)) {
                this.moveType = EnumMoveType.HOP;
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
        }
        else {
            this.setMovementSpeed(1.5 * lllllllllllllIIllllIllllIlIIIlll.getSpeed());
            this.playSound(this.getJumpingSound(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f) * 0.8f);
        }
        this.field_175536_bo = lllllllllllllIIllllIllllIlIIlIII;
    }
    
    private static boolean llIIIllIllIllII(final int lllllllllllllIIllllIlllIIlIIllll) {
        return lllllllllllllIIllllIlllIIlIIllll > 0;
    }
    
    private static boolean llIIIllIlllIlII(final Object lllllllllllllIIllllIlllIIlIlIlll) {
        return lllllllllllllIIllllIlllIIlIlIlll != null;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityRabbit.lIIIlllIlIllll[7], (byte)EntityRabbit.lIIIlllIlIllll[0]);
    }
    
    private static boolean llIIIllIlllIIIl(final Object lllllllllllllIIllllIlllIIlIllllI, final Object lllllllllllllIIllllIlllIIlIlllIl) {
        return lllllllllllllIIllllIlllIIlIllllI != lllllllllllllIIllllIlllIIlIlllIl;
    }
    
    private static void llIIIllIllIlIIl() {
        (lIIIlllIlIllll = new int[16])[0] = ((0xA2 ^ 0xBB) & ~(0x2E ^ 0x37));
        EntityRabbit.lIIIlllIlIllll[1] = " ".length();
        EntityRabbit.lIIIlllIlIllll[2] = "  ".length();
        EntityRabbit.lIIIlllIlIllll[3] = "   ".length();
        EntityRabbit.lIIIlllIlIllll[4] = (0x9D ^ 0x98);
        EntityRabbit.lIIIlllIlIllll[5] = (0x1A ^ 0x11);
        EntityRabbit.lIIIlllIlIllll[6] = (0x60 ^ 0x64);
        EntityRabbit.lIIIlllIlIllll[7] = (0x55 ^ 0x47);
        EntityRabbit.lIIIlllIlIllll[8] = (95 + 119 - 151 + 191 ^ 80 + 99 - 54 + 32);
        EntityRabbit.lIIIlllIlIllll[9] = (0x67 ^ 0x13 ^ (0x61 ^ 0x13));
        EntityRabbit.lIIIlllIlIllll[10] = (0x56 ^ 0x51);
        EntityRabbit.lIIIlllIlIllll[11] = (0x6A ^ 0x1A ^ (0xF8 ^ 0x80));
        EntityRabbit.lIIIlllIlIllll[12] = (0x64 ^ 0x3B ^ (0x77 ^ 0x21));
        EntityRabbit.lIIIlllIlIllll[13] = -(0xFFFFDFC5 & 0x7DFA);
        EntityRabbit.lIIIlllIlIllll[14] = (179 + 41 - 47 + 35 ^ 174 + 125 - 272 + 153);
        EntityRabbit.lIIIlllIlIllll[15] = (0x37 ^ 0x3D);
    }
    
    public void doMovementAction(final EnumMoveType lllllllllllllIIllllIllllIlIIIIll) {
        this.setJumping((boolean)(EntityRabbit.lIIIlllIlIllll[1] != 0), lllllllllllllIIllllIllllIlIIIIll);
        this.field_175535_bn = lllllllllllllIIllllIllllIlIIIIll.func_180073_d();
        this.field_175540_bm = EntityRabbit.lIIIlllIlIllll[0];
    }
    
    public void setMoveType(final EnumMoveType lllllllllllllIIllllIllllIlIlllII) {
        this.moveType = lllllllllllllIIllllIllllIlIlllII;
    }
    
    private void calculateRotationYaw(final double lllllllllllllIIllllIllllIIlIlIII, final double lllllllllllllIIllllIllllIIlIIlll) {
        this.rotationYaw = (float)(MathHelper.func_181159_b(lllllllllllllIIllllIllllIIlIIlll - this.posZ, lllllllllllllIIllllIllllIIlIlIII - this.posX) * 180.0 / 3.141592653589793) - 90.0f;
    }
    
    @Override
    public boolean attackEntityAsMob(final Entity lllllllllllllIIllllIlllIllllllII) {
        if (llIIIllIlllIIll(this.getRabbitType(), EntityRabbit.lIIIlllIlIllll[8])) {
            this.playSound(EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[11]], 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
            return lllllllllllllIIllllIlllIllllllII.attackEntityFrom(DamageSource.causeMobDamage(this), 8.0f);
        }
        return lllllllllllllIIllllIlllIllllllII.attackEntityFrom(DamageSource.causeMobDamage(this), 3.0f);
    }
    
    @Override
    protected String getLivingSound() {
        return EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[4]];
    }
    
    public float func_175521_o(final float lllllllllllllIIllllIllllIlIllIII) {
        float n;
        if (llIIIllIllIllIl(this.field_175535_bn)) {
            n = 0.0f;
            "".length();
            if ("   ".length() != "   ".length()) {
                return 0.0f;
            }
        }
        else {
            n = (this.field_175540_bm + lllllllllllllIIllllIllllIlIllIII) / this.field_175535_bn;
        }
        return n;
    }
    
    private static boolean llIIIllIllIllIl(final int lllllllllllllIIllllIlllIIlIlIIll) {
        return lllllllllllllIIllllIlllIIlIlIIll == 0;
    }
    
    private static int llIIIllIllIllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public int getTotalArmorValue() {
        int totalArmorValue;
        if (llIIIllIlllIIll(this.getRabbitType(), EntityRabbit.lIIIlllIlIllll[8])) {
            totalArmorValue = EntityRabbit.lIIIlllIlIllll[11];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return (129 + 117 - 244 + 162 ^ 84 + 77 - 147 + 124) & (74 + 121 - 169 + 104 ^ 19 + 34 + 48 + 71 ^ -" ".length());
            }
        }
        else {
            totalArmorValue = super.getTotalArmorValue();
        }
        return totalArmorValue;
    }
    
    private static boolean llIIIllIlllIllI(final int lllllllllllllIIllllIlllIIlIIllII, final int lllllllllllllIIllllIlllIIlIIlIll) {
        return lllllllllllllIIllllIlllIIlIIllII != lllllllllllllIIllllIlllIIlIIlIll;
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance lllllllllllllIIllllIlllIlIllllII, IEntityLivingData lllllllllllllIIllllIlllIlIllIllI) {
        lllllllllllllIIllllIlllIlIllIllI = super.onInitialSpawn(lllllllllllllIIllllIlllIlIllllII, lllllllllllllIIllllIlllIlIllIllI);
        int lllllllllllllIIllllIlllIlIlllIlI = this.rand.nextInt(EntityRabbit.lIIIlllIlIllll[9]);
        boolean lllllllllllllIIllllIlllIlIlllIIl = EntityRabbit.lIIIlllIlIllll[0] != 0;
        if (llIIIllIllIlIll((lllllllllllllIIllllIlllIlIllIllI instanceof RabbitTypeData) ? 1 : 0)) {
            lllllllllllllIIllllIlllIlIlllIlI = ((RabbitTypeData)lllllllllllllIIllllIlllIlIllIllI).typeData;
            lllllllllllllIIllllIlllIlIlllIIl = (EntityRabbit.lIIIlllIlIllll[1] != 0);
            "".length();
            if (((0x22 ^ 0x1C ^ (0xE3 ^ 0x8C)) & (0x8F ^ 0xB2 ^ (0xD0 ^ 0xBC) ^ -" ".length())) > 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIllllIlllIlIllIllI = new RabbitTypeData(lllllllllllllIIllllIlllIlIlllIlI);
        }
        this.setRabbitType(lllllllllllllIIllllIlllIlIlllIlI);
        if (llIIIllIllIlIll(lllllllllllllIIllllIlllIlIlllIIl ? 1 : 0)) {
            this.setGrowingAge(EntityRabbit.lIIIlllIlIllll[13]);
        }
        return lllllllllllllIIllllIlllIlIllIllI;
    }
    
    @Override
    public void spawnRunningParticles() {
    }
    
    private static boolean llIIIllIlllIlll(final int lllllllllllllIIllllIlllIIllIIllI, final int lllllllllllllIIllllIlllIIllIIlIl) {
        return lllllllllllllIIllllIlllIIllIIllI >= lllllllllllllIIllllIlllIIllIIlIl;
    }
    
    public int getRabbitType() {
        return this.dataWatcher.getWatchableObjectByte(EntityRabbit.lIIIlllIlIllll[7]);
    }
    
    static {
        llIIIllIllIlIIl();
        llIIIllIllIlIII();
    }
    
    private void updateMoveTypeDuration() {
        this.currentMoveTypeDuration = this.getMoveTypeDuration();
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIIllllIlllIlllIIlll, final int lllllllllllllIIllllIlllIlllIIIIl) {
        int lllllllllllllIIllllIlllIlllIIlIl = this.rand.nextInt(EntityRabbit.lIIIlllIlIllll[2]) + this.rand.nextInt(EntityRabbit.lIIIlllIlIllll[1] + lllllllllllllIIllllIlllIlllIIIIl);
        int lllllllllllllIIllllIlllIlllIIlII = EntityRabbit.lIIIlllIlIllll[0];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!llIIIllIlllIlll(lllllllllllllIIllllIlllIlllIIlII, lllllllllllllIIllllIlllIlllIIlIl)) {
            this.dropItem(Items.rabbit_hide, EntityRabbit.lIIIlllIlIllll[1]);
            "".length();
            ++lllllllllllllIIllllIlllIlllIIlII;
        }
        lllllllllllllIIllllIlllIlllIIlIl = this.rand.nextInt(EntityRabbit.lIIIlllIlIllll[2]);
        int lllllllllllllIIllllIlllIlllIIIll = EntityRabbit.lIIIlllIlIllll[0];
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!llIIIllIlllIlll(lllllllllllllIIllllIlllIlllIIIll, lllllllllllllIIllllIlllIlllIIlIl)) {
            if (llIIIllIllIlIll(this.isBurning() ? 1 : 0)) {
                this.dropItem(Items.cooked_rabbit, EntityRabbit.lIIIlllIlIllll[1]);
                "".length();
                "".length();
                if ((0xD1 ^ 0xA5 ^ (0x39 ^ 0x49)) == "   ".length()) {
                    return;
                }
            }
            else {
                this.dropItem(Items.rabbit, EntityRabbit.lIIIlllIlIllll[1]);
                "".length();
            }
            ++lllllllllllllIIllllIlllIlllIIIll;
        }
    }
    
    private static void llIIIllIllIlIII() {
        (lIIIlllIlIllIl = new String[EntityRabbit.lIIIlllIlIllll[15]])[EntityRabbit.lIIIlllIlIllll[0]] = llIIIllIlIlIlll("KgkTKD8MPAg6Mw==", "xhqJV");
        EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[1]] = llIIIllIlIllIII("2KHgZRtEtyBR8reOmrt2wQ==", "FfYKk");
        EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[2]] = llIIIllIlIlIlll("NyYTKh4REwg4Eg==", "eGqHw");
        EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[3]] = llIIIllIlIllIII("do3/RecfiKdozba0zjgH4w==", "EgzFq");
        EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[6]] = llIIIllIlIllIII("m5NHchxiwypOxEpmEK1/7w==", "IyweE");
        EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[4]] = llIIIllIllIIlll("EbHqRApTJZfK72K8oZrUNw==", "ozpcG");
        EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[9]] = llIIIllIlIlIlll("Oj4qRyc2MyoAIXk5PRsh", "WQHiU");
        EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[10]] = llIIIllIlIllIII("MoKs6SSEEUDVBVbz4yGb0D/AjX5avKmf", "Erttm");
        EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[11]] = llIIIllIlIllIII("HnP+dXtScn59azW17/EIRg==", "nPrDc");
        EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[12]] = llIIIllIlIllIII("b9XT+0BQVKmUDewWTj9b0OlOtH3kA44O", "ZEdZY");
    }
    
    private static int llIIIllIllIlIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private void func_175517_cu() {
        this.updateMoveTypeDuration();
        this.func_175520_cs();
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIIllllIlllIlIlIIlll) {
        if (llIIIllIlllIIll(lllllllllllllIIllllIlllIlIlIIlll, EntityRabbit.lIIIlllIlIllll[1])) {
            this.createRunningParticles();
            this.field_175535_bn = EntityRabbit.lIIIlllIlIllll[15];
            this.field_175540_bm = EntityRabbit.lIIIlllIlIllll[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIIllllIlllIlIlIIlll);
        }
    }
    
    public void setMovementSpeed(final double lllllllllllllIIllllIllllIlIlIIII) {
        this.getNavigator().setSpeed(lllllllllllllIIllllIllllIlIlIIII);
        this.moveHelper.setMoveTo(this.moveHelper.getX(), this.moveHelper.getY(), this.moveHelper.getZ(), lllllllllllllIIllllIllllIlIlIIII);
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIllllIllllIIIIlllI) {
        super.writeEntityToNBT(lllllllllllllIIllllIllllIIIIlllI);
        lllllllllllllIIllllIllllIIIIlllI.setInteger(EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[0]], this.getRabbitType());
        lllllllllllllIIllllIllllIIIIlllI.setInteger(EntityRabbit.lIIIlllIlIllIl[EntityRabbit.lIIIlllIlIllll[1]], this.carrotTicks);
    }
    
    public void updateAITasks() {
        if (llIIIllIllIllII(llIIIllIllIllll(this.moveHelper.getSpeed(), 0.8))) {
            this.setMoveType(EnumMoveType.SPRINT);
            "".length();
            if (((0x85 ^ 0xC3) & ~(0x68 ^ 0x2E)) != 0x0) {
                return;
            }
        }
        else if (llIIIllIlllIIIl(this.moveType, EnumMoveType.ATTACK)) {
            this.setMoveType(EnumMoveType.HOP);
        }
        if (llIIIllIllIllII(this.currentMoveTypeDuration)) {
            this.currentMoveTypeDuration -= EntityRabbit.lIIIlllIlIllll[1];
        }
        if (llIIIllIllIllII(this.carrotTicks)) {
            this.carrotTicks -= this.rand.nextInt(EntityRabbit.lIIIlllIlIllll[3]);
            if (llIIIllIlllIIlI(this.carrotTicks)) {
                this.carrotTicks = EntityRabbit.lIIIlllIlIllll[0];
            }
        }
        if (llIIIllIllIlIll(this.onGround ? 1 : 0)) {
            if (llIIIllIllIllIl(this.field_175537_bp ? 1 : 0)) {
                this.setJumping((boolean)(EntityRabbit.lIIIlllIlIllll[0] != 0), EnumMoveType.NONE);
                this.func_175517_cu();
            }
            if (llIIIllIlllIIll(this.getRabbitType(), EntityRabbit.lIIIlllIlIllll[8]) && llIIIllIllIllIl(this.currentMoveTypeDuration)) {
                final EntityLivingBase lllllllllllllIIllllIllllIIllIlIl = this.getAttackTarget();
                if (llIIIllIlllIlII(lllllllllllllIIllllIllllIIllIlIl) && llIIIllIlllIIlI(llIIIllIlllIIII(this.getDistanceSqToEntity(lllllllllllllIIllllIllllIIllIlIl), 16.0))) {
                    this.calculateRotationYaw(lllllllllllllIIllllIllllIIllIlIl.posX, lllllllllllllIIllllIllllIIllIlIl.posZ);
                    this.moveHelper.setMoveTo(lllllllllllllIIllllIllllIIllIlIl.posX, lllllllllllllIIllllIllllIIllIlIl.posY, lllllllllllllIIllllIllllIIllIlIl.posZ, this.moveHelper.getSpeed());
                    this.doMovementAction(EnumMoveType.ATTACK);
                    this.field_175537_bp = (EntityRabbit.lIIIlllIlIllll[1] != 0);
                }
            }
            final RabbitJumpHelper lllllllllllllIIllllIllllIIllIlII = (RabbitJumpHelper)this.jumpHelper;
            if (llIIIllIllIllIl(lllllllllllllIIllllIllllIIllIlII.getIsJumping() ? 1 : 0)) {
                if (llIIIllIllIlIll(this.moveHelper.isUpdating() ? 1 : 0) && llIIIllIllIllIl(this.currentMoveTypeDuration)) {
                    final PathEntity lllllllllllllIIllllIllllIIllIIll = this.navigator.getPath();
                    Vec3 lllllllllllllIIllllIllllIIllIIlI = new Vec3(this.moveHelper.getX(), this.moveHelper.getY(), this.moveHelper.getZ());
                    if (llIIIllIlllIlII(lllllllllllllIIllllIllllIIllIIll) && llIIIllIlllIlIl(lllllllllllllIIllllIllllIIllIIll.getCurrentPathIndex(), lllllllllllllIIllllIllllIIllIIll.getCurrentPathLength())) {
                        lllllllllllllIIllllIllllIIllIIlI = lllllllllllllIIllllIllllIIllIIll.getPosition(this);
                    }
                    this.calculateRotationYaw(lllllllllllllIIllllIllllIIllIIlI.xCoord, lllllllllllllIIllllIllllIIllIIlI.zCoord);
                    this.doMovementAction(this.moveType);
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
            }
            else if (llIIIllIllIllIl(lllllllllllllIIllllIllllIIllIlII.func_180065_d() ? 1 : 0)) {
                this.func_175518_cr();
            }
        }
        this.field_175537_bp = this.onGround;
    }
    
    @Override
    protected float getJumpUpwardsMotion() {
        float func_180074_b;
        if (llIIIllIllIlIll(this.moveHelper.isUpdating() ? 1 : 0) && llIIIllIllIllII(llIIIllIllIlIlI(this.moveHelper.getY(), this.posY + 0.5))) {
            func_180074_b = 0.5f;
            "".length();
            if ("   ".length() == " ".length()) {
                return 0.0f;
            }
        }
        else {
            func_180074_b = this.moveType.func_180074_b();
        }
        return func_180074_b;
    }
    
    private static int llIIIllIlllIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String llIIIllIllIIlll(final String lllllllllllllIIllllIlllIlIIlIlll, final String lllllllllllllIIllllIlllIlIIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlllIlIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlllIlIIlIllI.getBytes(StandardCharsets.UTF_8)), EntityRabbit.lIIIlllIlIllll[11]), "DES");
            final Cipher lllllllllllllIIllllIlllIlIIllIIl = Cipher.getInstance("DES");
            lllllllllllllIIllllIlllIlIIllIIl.init(EntityRabbit.lIIIlllIlIllll[2], lllllllllllllIIllllIlllIlIIllIlI);
            return new String(lllllllllllllIIllllIlllIlIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlllIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlllIlIIllIII) {
            lllllllllllllIIllllIlllIlIIllIII.printStackTrace();
            return null;
        }
    }
    
    protected int getMoveTypeDuration() {
        return this.moveType.getDuration();
    }
    
    private static String llIIIllIlIllIII(final String lllllllllllllIIllllIlllIlIIIlIlI, final String lllllllllllllIIllllIlllIlIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlllIlIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlllIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIlllIlIIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIlllIlIIIllII.init(EntityRabbit.lIIIlllIlIllll[2], lllllllllllllIIllllIlllIlIIIllIl);
            return new String(lllllllllllllIIllllIlllIlIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlllIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlllIlIIIlIll) {
            lllllllllllllIIllllIlllIlIIIlIll.printStackTrace();
            return null;
        }
    }
    
    private void func_175520_cs() {
        ((RabbitJumpHelper)this.jumpHelper).func_180066_a((boolean)(EntityRabbit.lIIIlllIlIllll[0] != 0));
    }
    
    public EntityRabbit(final World lllllllllllllIIllllIllllIllIIlll) {
        super(lllllllllllllIIllllIllllIllIIlll);
        this.field_175540_bm = EntityRabbit.lIIIlllIlIllll[0];
        this.field_175535_bn = EntityRabbit.lIIIlllIlIllll[0];
        this.field_175536_bo = (EntityRabbit.lIIIlllIlIllll[0] != 0);
        this.field_175537_bp = (EntityRabbit.lIIIlllIlIllll[0] != 0);
        this.currentMoveTypeDuration = EntityRabbit.lIIIlllIlIllll[0];
        this.moveType = EnumMoveType.HOP;
        this.carrotTicks = EntityRabbit.lIIIlllIlIllll[0];
        this.field_175543_bt = null;
        this.setSize(0.6f, 0.7f);
        this.jumpHelper = new RabbitJumpHelper(this);
        this.moveHelper = new RabbitMoveHelper(this);
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityRabbit.lIIIlllIlIllll[1] != 0));
        this.navigator.setHeightRequirement(2.5f);
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[1], new EntityAISwimming(this));
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[1], new AIPanic(this, 1.33));
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[2], new EntityAITempt(this, 1.0, Items.carrot, (boolean)(EntityRabbit.lIIIlllIlIllll[0] != 0)));
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[2], new EntityAITempt(this, 1.0, Items.golden_carrot, (boolean)(EntityRabbit.lIIIlllIlIllll[0] != 0)));
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[2], new EntityAITempt(this, 1.0, Item.getItemFromBlock(Blocks.yellow_flower), (boolean)(EntityRabbit.lIIIlllIlIllll[0] != 0)));
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[3], new EntityAIMate(this, 0.8));
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[4], new AIRaidFarm(this));
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[4], new EntityAIWander(this, 0.6));
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[5], new EntityAIWatchClosest(this, EntityPlayer.class, 10.0f));
        this.aiAvoidWolves = new AIAvoidEntity<EntityWolf>(this, EntityWolf.class, 16.0f, 1.33, 1.33);
        this.tasks.addTask(EntityRabbit.lIIIlllIlIllll[6], this.aiAvoidWolves);
        this.setMovementSpeed(0.0);
    }
    
    enum EnumMoveType
    {
        private static final /* synthetic */ String[] lIllllIIIlIIlI;
        private final /* synthetic */ float field_180077_g;
        private static final /* synthetic */ int[] lIllllIIIlIlII;
        
        STEP(EnumMoveType.lIllllIIIlIIlI[EnumMoveType.lIllllIIIlIlII[5]], EnumMoveType.lIllllIIIlIlII[5], 1.0f, 0.45f, EnumMoveType.lIllllIIIlIlII[6], EnumMoveType.lIllllIIIlIlII[6]), 
        SPRINT(EnumMoveType.lIllllIIIlIIlI[EnumMoveType.lIllllIIIlIlII[7]], EnumMoveType.lIllllIIIlIlII[7], 1.75f, 0.4f, EnumMoveType.lIllllIIIlIlII[2], EnumMoveType.lIllllIIIlIlII[8]);
        
        private final /* synthetic */ int duration;
        private final /* synthetic */ float speed;
        
        NONE(EnumMoveType.lIllllIIIlIIlI[EnumMoveType.lIllllIIIlIlII[0]], EnumMoveType.lIllllIIIlIlII[0], 0.0f, 0.0f, EnumMoveType.lIllllIIIlIlII[1], EnumMoveType.lIllllIIIlIlII[2]), 
        HOP(EnumMoveType.lIllllIIIlIIlI[EnumMoveType.lIllllIIIlIlII[2]], EnumMoveType.lIllllIIIlIlII[2], 0.8f, 0.2f, EnumMoveType.lIllllIIIlIlII[3], EnumMoveType.lIllllIIIlIlII[4]), 
        ATTACK(EnumMoveType.lIllllIIIlIIlI[EnumMoveType.lIllllIIIlIlII[9]], EnumMoveType.lIllllIIIlIlII[9], 2.0f, 0.7f, EnumMoveType.lIllllIIIlIlII[10], EnumMoveType.lIllllIIIlIlII[8]);
        
        private final /* synthetic */ int field_180085_i;
        
        private static String lIIIIIllllllIlIl(final String llllllllllllIllllIlIllIlllIllIII, final String llllllllllllIllllIlIllIlllIlIlll) {
            try {
                final SecretKeySpec llllllllllllIllllIlIllIlllIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIllIlllIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIllllIlIllIlllIllIlI = Cipher.getInstance("Blowfish");
                llllllllllllIllllIlIllIlllIllIlI.init(EnumMoveType.lIllllIIIlIlII[5], llllllllllllIllllIlIllIlllIllIll);
                return new String(llllllllllllIllllIlIllIlllIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIllIlllIllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIllIlllIllIIl) {
                llllllllllllIllllIlIllIlllIllIIl.printStackTrace();
                return null;
            }
        }
        
        public float func_180074_b() {
            return this.field_180077_g;
        }
        
        private static String lIIIIIllllllIIll(final String llllllllllllIllllIlIllIllllIIlIl, final String llllllllllllIllllIlIllIllllIIIlI) {
            try {
                final SecretKeySpec llllllllllllIllllIlIllIllllIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIllIllllIIIlI.getBytes(StandardCharsets.UTF_8)), EnumMoveType.lIllllIIIlIlII[8]), "DES");
                final Cipher llllllllllllIllllIlIllIllllIIlll = Cipher.getInstance("DES");
                llllllllllllIllllIlIllIllllIIlll.init(EnumMoveType.lIllllIIIlIlII[5], llllllllllllIllllIlIllIllllIlIII);
                return new String(llllllllllllIllllIlIllIllllIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIllIllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIlIllIllllIIllI) {
                llllllllllllIllllIlIllIllllIIllI.printStackTrace();
                return null;
            }
        }
        
        public int getDuration() {
            return this.duration;
        }
        
        private static void lIIIIIlllllllIIl() {
            (lIllllIIIlIlII = new int[12])[0] = ((0xCC ^ 0xAC) & ~(0x23 ^ 0x43));
            EnumMoveType.lIllllIIIlIlII[1] = ("   ".length() ^ (0x83 ^ 0x9E));
            EnumMoveType.lIllllIIIlIlII[2] = " ".length();
            EnumMoveType.lIllllIIIlIlII[3] = (0x3B ^ 0x2F);
            EnumMoveType.lIllllIIIlIlII[4] = (64 + 108 - 163 + 155 ^ 36 + 156 - 165 + 147);
            EnumMoveType.lIllllIIIlIlII[5] = "  ".length();
            EnumMoveType.lIllllIIIlIlII[6] = (29 + 28 - 35 + 135 ^ 71 + 11 + 20 + 45);
            EnumMoveType.lIllllIIIlIlII[7] = "   ".length();
            EnumMoveType.lIllllIIIlIlII[8] = (111 + 7 - 49 + 82 ^ 58 + 115 - 93 + 79);
            EnumMoveType.lIllllIIIlIlII[9] = ("   ".length() ^ (0x4A ^ 0x4D));
            EnumMoveType.lIllllIIIlIlII[10] = (0xC8 ^ 0xC4 ^ (0x5A ^ 0x51));
            EnumMoveType.lIllllIIIlIlII[11] = (49 + 83 - 118 + 115 ^ 130 + 130 - 219 + 91);
        }
        
        private static void lIIIIIlllllllIII() {
            (lIllllIIIlIIlI = new String[EnumMoveType.lIllllIIIlIlII[11]])[EnumMoveType.lIllllIIIlIlII[0]] = lIIIIIllllllIIll("pdcQzbFwzTQ=", "jxXTq");
            EnumMoveType.lIllllIIIlIIlI[EnumMoveType.lIllllIIIlIlII[2]] = lIIIIIllllllIIll("VRm5JbRFUE0=", "bdoKw");
            EnumMoveType.lIllllIIIlIIlI[EnumMoveType.lIllllIIIlIlII[5]] = lIIIIIllllllIlII("OzEDNQ==", "heFeN");
            EnumMoveType.lIllllIIIlIIlI[EnumMoveType.lIllllIIIlIlII[7]] = lIIIIIllllllIlII("JTEaHR0i", "vaHTS");
            EnumMoveType.lIllllIIIlIIlI[EnumMoveType.lIllllIIIlIlII[9]] = lIIIIIllllllIlIl("coj9C4KCjlU=", "otXbO");
        }
        
        private static boolean lIIIIIlllllllIlI(final int llllllllllllIllllIlIllIllIllIIlI, final int llllllllllllIllllIlIllIllIllIIIl) {
            return llllllllllllIllllIlIllIllIllIIlI < llllllllllllIllllIlIllIllIllIIIl;
        }
        
        private static String lIIIIIllllllIlII(String llllllllllllIllllIlIllIllIllllll, final String llllllllllllIllllIlIllIlllIIIlII) {
            llllllllllllIllllIlIllIllIllllll = new String(Base64.getDecoder().decode(llllllllllllIllllIlIllIllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllllIlIllIlllIIIIll = new StringBuilder();
            final char[] llllllllllllIllllIlIllIlllIIIIlI = llllllllllllIllllIlIllIlllIIIlII.toCharArray();
            int llllllllllllIllllIlIllIlllIIIIII = EnumMoveType.lIllllIIIlIlII[0];
            final double llllllllllllIllllIlIllIllIlllIlI = (Object)llllllllllllIllllIlIllIllIllllll.toCharArray();
            final Exception llllllllllllIllllIlIllIllIlllIII = (Exception)llllllllllllIllllIlIllIllIlllIlI.length;
            int llllllllllllIllllIlIllIllIllIllI = EnumMoveType.lIllllIIIlIlII[0];
            while (lIIIIIlllllllIlI(llllllllllllIllllIlIllIllIllIllI, (int)llllllllllllIllllIlIllIllIlllIII)) {
                final char llllllllllllIllllIlIllIlllIIIlll = llllllllllllIllllIlIllIllIlllIlI[llllllllllllIllllIlIllIllIllIllI];
                llllllllllllIllllIlIllIlllIIIIll.append((char)(llllllllllllIllllIlIllIlllIIIlll ^ llllllllllllIllllIlIllIlllIIIIlI[llllllllllllIllllIlIllIlllIIIIII % llllllllllllIllllIlIllIlllIIIIlI.length]));
                "".length();
                ++llllllllllllIllllIlIllIlllIIIIII;
                ++llllllllllllIllllIlIllIllIllIllI;
                "".length();
                if ("   ".length() == -" ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllllIlIllIlllIIIIll);
        }
        
        private EnumMoveType(final String llllllllllllIllllIlIlllIIIIIIllI, final int llllllllllllIllllIlIlllIIIIIIlIl, final float llllllllllllIllllIlIlllIIIIIIlII, final float llllllllllllIllllIlIlllIIIIIIIll, final int llllllllllllIllllIlIlllIIIIIIIlI, final int llllllllllllIllllIlIlllIIIIIIIIl) {
            this.speed = llllllllllllIllllIlIlllIIIIIIlII;
            this.field_180077_g = llllllllllllIllllIlIlllIIIIIIIll;
            this.duration = llllllllllllIllllIlIlllIIIIIIIlI;
            this.field_180085_i = llllllllllllIllllIlIlllIIIIIIIIl;
        }
        
        public int func_180073_d() {
            return this.field_180085_i;
        }
        
        public float getSpeed() {
            return this.speed;
        }
        
        static {
            lIIIIIlllllllIIl();
            lIIIIIlllllllIII();
            final EnumMoveType[] enum$VALUES = new EnumMoveType[EnumMoveType.lIllllIIIlIlII[11]];
            enum$VALUES[EnumMoveType.lIllllIIIlIlII[0]] = EnumMoveType.NONE;
            enum$VALUES[EnumMoveType.lIllllIIIlIlII[2]] = EnumMoveType.HOP;
            enum$VALUES[EnumMoveType.lIllllIIIlIlII[5]] = EnumMoveType.STEP;
            enum$VALUES[EnumMoveType.lIllllIIIlIlII[7]] = EnumMoveType.SPRINT;
            enum$VALUES[EnumMoveType.lIllllIIIlIlII[9]] = EnumMoveType.ATTACK;
            ENUM$VALUES = enum$VALUES;
        }
    }
    
    static class AIAvoidEntity<T extends Entity> extends EntityAIAvoidEntity<T>
    {
        public AIAvoidEntity(final Class<T> lllllllllllllIIIIIlIIIllIIlllIll, final float lllllllllllllIIIIIlIIIllIIllIlII, final double lllllllllllllIIIIIlIIIllIIllIIll, final double lllllllllllllIIIIIlIIIllIIlllIII) {
            super(EntityRabbit.this, lllllllllllllIIIIIlIIIllIIlllIll, lllllllllllllIIIIIlIIIllIIllIlII, lllllllllllllIIIIIlIIIllIIllIIll, lllllllllllllIIIIIlIIIllIIlllIII);
        }
        
        @Override
        public void updateTask() {
            super.updateTask();
        }
    }
    
    static class AIEvilAttack extends EntityAIAttackOnCollide
    {
        private static final /* synthetic */ int[] lIIlIIIIIlIllI;
        
        static {
            llIIlIIlIIlIIII();
        }
        
        public AIEvilAttack(final EntityRabbit lllllllllllllIIlllIllllIIIIIIlIl) {
            super(lllllllllllllIIlllIllllIIIIIIlIl, EntityLivingBase.class, 1.4, (boolean)(AIEvilAttack.lIIlIIIIIlIllI[0] != 0));
        }
        
        private static void llIIlIIlIIlIIII() {
            (lIIlIIIIIlIllI = new int[1])[0] = " ".length();
        }
        
        @Override
        protected double func_179512_a(final EntityLivingBase lllllllllllllIIlllIllllIIIIIIIII) {
            return 4.0f + lllllllllllllIIlllIllllIIIIIIIII.width;
        }
    }
    
    static class RabbitMoveHelper extends EntityMoveHelper
    {
        private /* synthetic */ EntityRabbit theEntity;
        
        private static boolean lIIIlIllIlllllll(final int llllllllllllIlllIIlllIIlIlIIIlII) {
            return llllllllllllIlllIIlllIIlIlIIIlII != 0;
        }
        
        public RabbitMoveHelper() {
            super(EntityRabbit.this);
        }
        
        private static boolean lIIIlIlllIIIIIII(final int llllllllllllIlllIIlllIIlIlIIIIII) {
            return llllllllllllIlllIIlllIIlIlIIIIII == 0;
        }
        
        @Override
        public void onUpdateMoveHelper() {
            if (lIIIlIllIlllllll(this.theEntity.onGround ? 1 : 0) && lIIIlIlllIIIIIII(this.theEntity.func_175523_cj() ? 1 : 0)) {
                this.theEntity.setMovementSpeed(0.0);
            }
            super.onUpdateMoveHelper();
        }
    }
    
    static class AIRaidFarm extends EntityAIMoveToBlock
    {
        private /* synthetic */ boolean field_179499_e;
        private /* synthetic */ boolean field_179498_d;
        private static final /* synthetic */ int[] llIlIIlIllIlll;
        private static final /* synthetic */ String[] llIlIIlIllIllI;
        private final /* synthetic */ EntityRabbit field_179500_c;
        
        @Override
        public void updateTask() {
            super.updateTask();
            this.field_179500_c.getLookHelper().setLookPosition(this.destinationBlock.getX() + 0.5, this.destinationBlock.getY() + AIRaidFarm.llIlIIlIllIlll[2], this.destinationBlock.getZ() + 0.5, 10.0f, (float)this.field_179500_c.getVerticalFaceSpeed());
            if (lIIlIIlIlIlllIII(this.getIsAboveDestination() ? 1 : 0)) {
                final World llllllllllllIllIllIIIIIlIllIIllI = this.field_179500_c.worldObj;
                final BlockPos llllllllllllIllIllIIIIIlIllIIlIl = this.destinationBlock.up();
                final IBlockState llllllllllllIllIllIIIIIlIllIIlII = llllllllllllIllIllIIIIIlIllIIllI.getBlockState(llllllllllllIllIllIIIIIlIllIIlIl);
                final Block llllllllllllIllIllIIIIIlIllIIIll = llllllllllllIllIllIIIIIlIllIIlII.getBlock();
                if (lIIlIIlIlIlllIII(this.field_179499_e ? 1 : 0) && lIIlIIlIlIlllIII((llllllllllllIllIllIIIIIlIllIIIll instanceof BlockCarrot) ? 1 : 0) && lIIlIIlIlIlllIIl(llllllllllllIllIllIIIIIlIllIIlII.getValue((IProperty<Integer>)BlockCarrot.AGE), AIRaidFarm.llIlIIlIllIlll[3])) {
                    llllllllllllIllIllIIIIIlIllIIllI.setBlockState(llllllllllllIllIllIIIIIlIllIIlIl, Blocks.air.getDefaultState(), AIRaidFarm.llIlIIlIllIlll[4]);
                    "".length();
                    llllllllllllIllIllIIIIIlIllIIllI.destroyBlock(llllllllllllIllIllIIIIIlIllIIlIl, (boolean)(AIRaidFarm.llIlIIlIllIlll[2] != 0));
                    "".length();
                    this.field_179500_c.createEatingParticles();
                }
                this.field_179499_e = (AIRaidFarm.llIlIIlIllIlll[1] != 0);
                this.runDelay = AIRaidFarm.llIlIIlIllIlll[5];
            }
        }
        
        @Override
        public boolean continueExecuting() {
            if (lIIlIIlIlIlllIII(this.field_179499_e ? 1 : 0) && lIIlIIlIlIlllIII(super.continueExecuting() ? 1 : 0)) {
                return AIRaidFarm.llIlIIlIllIlll[2] != 0;
            }
            return AIRaidFarm.llIlIIlIllIlll[1] != 0;
        }
        
        @Override
        public void startExecuting() {
            super.startExecuting();
        }
        
        private static void lIIlIIlIlIllIlII() {
            (llIlIIlIllIllI = new String[AIRaidFarm.llIlIIlIllIlll[2]])[AIRaidFarm.llIlIIlIllIlll[1]] = lIIlIIlIlIllIIll("tWSiL/vGBB7isFINv1WXhg==", "kglsM");
        }
        
        private static String lIIlIIlIlIllIIll(final String llllllllllllIllIllIIIIIlIlIIIlll, final String llllllllllllIllIllIIIIIlIlIIIlII) {
            try {
                final SecretKeySpec llllllllllllIllIllIIIIIlIlIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIIIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), AIRaidFarm.llIlIIlIllIlll[6]), "DES");
                final Cipher llllllllllllIllIllIIIIIlIlIIlIIl = Cipher.getInstance("DES");
                llllllllllllIllIllIIIIIlIlIIlIIl.init(AIRaidFarm.llIlIIlIllIlll[4], llllllllllllIllIllIIIIIlIlIIlIlI);
                return new String(llllllllllllIllIllIIIIIlIlIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIIIlIlIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllIllIIIIIlIlIIlIII) {
                llllllllllllIllIllIIIIIlIlIIlIII.printStackTrace();
                return null;
            }
        }
        
        private static boolean lIIlIIlIlIlllIII(final int llllllllllllIllIllIIIIIlIIlllIII) {
            return llllllllllllIllIllIIIIIlIIlllIII != 0;
        }
        
        @Override
        public boolean shouldExecute() {
            if (lIIlIIlIlIllIllI(this.runDelay)) {
                if (lIIlIIlIlIllIlll(this.field_179500_c.worldObj.getGameRules().getBoolean(AIRaidFarm.llIlIIlIllIllI[AIRaidFarm.llIlIIlIllIlll[1]]) ? 1 : 0)) {
                    return AIRaidFarm.llIlIIlIllIlll[1] != 0;
                }
                this.field_179499_e = (AIRaidFarm.llIlIIlIllIlll[1] != 0);
                this.field_179498_d = EntityRabbit.this.isCarrotEaten();
            }
            return super.shouldExecute();
        }
        
        private static boolean lIIlIIlIlIllIllI(final int llllllllllllIllIllIIIIIlIIllIlII) {
            return llllllllllllIllIllIIIIIlIIllIlII <= 0;
        }
        
        private static void lIIlIIlIlIllIlIl() {
            (llIlIIlIllIlll = new int[7])[0] = (0x59 ^ 0x49);
            AIRaidFarm.llIlIIlIllIlll[1] = ((0x91 ^ 0xB9) & ~(0x4C ^ 0x64));
            AIRaidFarm.llIlIIlIllIlll[2] = " ".length();
            AIRaidFarm.llIlIIlIllIlll[3] = (126 + 112 - 84 + 39 ^ 59 + 65 - 36 + 110);
            AIRaidFarm.llIlIIlIllIlll[4] = "  ".length();
            AIRaidFarm.llIlIIlIllIlll[5] = (0x5C ^ 0x6E ^ (0x6B ^ 0x53));
            AIRaidFarm.llIlIIlIllIlll[6] = (0x31 ^ 0x9 ^ (0x91 ^ 0xA1));
        }
        
        static {
            lIIlIIlIlIllIlIl();
            lIIlIIlIlIllIlII();
        }
        
        @Override
        public void resetTask() {
            super.resetTask();
        }
        
        public AIRaidFarm() {
            super(EntityRabbit.this, 0.699999988079071, AIRaidFarm.llIlIIlIllIlll[0]);
            this.field_179499_e = (AIRaidFarm.llIlIIlIllIlll[1] != 0);
        }
        
        private static boolean lIIlIIlIlIllIlll(final int llllllllllllIllIllIIIIIlIIllIllI) {
            return llllllllllllIllIllIIIIIlIIllIllI == 0;
        }
        
        private static boolean lIIlIIlIlIlllIlI(final Object llllllllllllIllIllIIIIIlIIlllIll, final Object llllllllllllIllIllIIIIIlIIlllIlI) {
            return llllllllllllIllIllIIIIIlIIlllIll == llllllllllllIllIllIIIIIlIIlllIlI;
        }
        
        private static boolean lIIlIIlIlIlllIIl(final int llllllllllllIllIllIIIIIlIIllllll, final int llllllllllllIllIllIIIIIlIIlllllI) {
            return llllllllllllIllIllIIIIIlIIllllll == llllllllllllIllIllIIIIIlIIlllllI;
        }
        
        @Override
        protected boolean shouldMoveTo(final World llllllllllllIllIllIIIIIlIlIlIlll, BlockPos llllllllllllIllIllIIIIIlIlIlIllI) {
            Block llllllllllllIllIllIIIIIlIlIlIlIl = llllllllllllIllIllIIIIIlIlIlIlll.getBlockState(llllllllllllIllIllIIIIIlIlIlIllI).getBlock();
            if (lIIlIIlIlIlllIlI(llllllllllllIllIllIIIIIlIlIlIlIl, Blocks.farmland)) {
                llllllllllllIllIllIIIIIlIlIlIllI = llllllllllllIllIllIIIIIlIlIlIllI.up();
                final IBlockState llllllllllllIllIllIIIIIlIlIlIlII = llllllllllllIllIllIIIIIlIlIlIlll.getBlockState(llllllllllllIllIllIIIIIlIlIlIllI);
                llllllllllllIllIllIIIIIlIlIlIlIl = llllllllllllIllIllIIIIIlIlIlIlII.getBlock();
                if (lIIlIIlIlIlllIII((llllllllllllIllIllIIIIIlIlIlIlIl instanceof BlockCarrot) ? 1 : 0) && lIIlIIlIlIlllIIl(llllllllllllIllIllIIIIIlIlIlIlII.getValue((IProperty<Integer>)BlockCarrot.AGE), AIRaidFarm.llIlIIlIllIlll[3]) && lIIlIIlIlIlllIII(this.field_179498_d ? 1 : 0) && lIIlIIlIlIllIlll(this.field_179499_e ? 1 : 0)) {
                    this.field_179499_e = (AIRaidFarm.llIlIIlIllIlll[2] != 0);
                    return AIRaidFarm.llIlIIlIllIlll[2] != 0;
                }
            }
            return AIRaidFarm.llIlIIlIllIlll[1] != 0;
        }
    }
    
    public static class RabbitTypeData implements IEntityLivingData
    {
        public /* synthetic */ int typeData;
        
        public RabbitTypeData(final int lllllllllllllIIIIIlIlIIIIIlIllll) {
            this.typeData = lllllllllllllIIIIIlIlIIIIIlIllll;
        }
    }
    
    public class RabbitJumpHelper extends EntityJumpHelper
    {
        private static final /* synthetic */ int[] lIllIIlIIllIlI;
        private /* synthetic */ boolean field_180068_d;
        
        private static void lllllIIllIIIlll() {
            (lIllIIlIIllIlI = new int[1])[0] = ((0x16 ^ 0x1C) & ~(0x6F ^ 0x65));
        }
        
        public boolean getIsJumping() {
            return this.isJumping;
        }
        
        @Override
        public void doJump() {
            if (lllllIIllIIlIII(this.isJumping ? 1 : 0)) {
                EntityRabbit.this.doMovementAction(EnumMoveType.STEP);
                this.isJumping = (RabbitJumpHelper.lIllIIlIIllIlI[0] != 0);
            }
        }
        
        public boolean func_180065_d() {
            return this.field_180068_d;
        }
        
        static {
            lllllIIllIIIlll();
        }
        
        public void func_180066_a(final boolean lllllllllllllIIIIIlIIIllIlIIlIIl) {
            this.field_180068_d = lllllllllllllIIIIIlIIIllIlIIlIIl;
        }
        
        public RabbitJumpHelper() {
            super(EntityRabbit.this);
            this.field_180068_d = (RabbitJumpHelper.lIllIIlIIllIlI[0] != 0);
        }
        
        private static boolean lllllIIllIIlIII(final int lllllllllllllIIIIIlIIIllIlIIIlII) {
            return lllllllllllllIIIIIlIIIllIlIIIlII != 0;
        }
    }
    
    static class AIPanic extends EntityAIPanic
    {
        private /* synthetic */ EntityRabbit theEntity;
        
        @Override
        public void updateTask() {
            super.updateTask();
            this.theEntity.setMovementSpeed(this.speed);
        }
        
        public AIPanic(final double lllllllllllllIIlIlIllllIIIIIlIIl) {
            super(EntityRabbit.this, lllllllllllllIIlIlIllllIIIIIlIIl);
        }
    }
}
