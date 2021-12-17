// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.init.Items;
import net.minecraft.block.BlockFlower;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import java.util.Arrays;
import net.minecraft.util.DamageSource;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.entity.SharedMonsterAttributes;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import com.google.common.base.Predicate;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAIDefendVillage;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAILookAtVillager;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsTarget;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.village.Village;

public class EntityIronGolem extends EntityGolem
{
    private /* synthetic */ int homeCheckTimer;
    private static final /* synthetic */ String[] lIIlIllIIllIII;
    private /* synthetic */ int holdRoseTick;
    /* synthetic */ Village villageObj;
    private static final /* synthetic */ int[] lIIlIllIIllIIl;
    private /* synthetic */ int attackTimer;
    
    public int getAttackTimer() {
        return this.attackTimer;
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIIllIIlIIllllIIIIlI) {
        if (llIlIIlIIIlllIl(lllllllllllllIIllIIlIIllllIIIIlI, EntityIronGolem.lIIlIllIIllIIl[3])) {
            this.attackTimer = EntityIronGolem.lIIlIllIIllIIl[9];
            this.playSound(EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[2]], 1.0f, 1.0f);
            "".length();
            if ("  ".length() > (0x1D ^ 0x4B ^ (0x4C ^ 0x1E))) {
                return;
            }
        }
        else if (llIlIIlIIIlllIl(lllllllllllllIIllIIlIIllllIIIIlI, EntityIronGolem.lIIlIllIIllIIl[16])) {
            this.holdRoseTick = EntityIronGolem.lIIlIllIIllIIl[17];
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIIllIIlIIllllIIIIlI);
        }
    }
    
    @Override
    protected void collideWithEntity(final Entity lllllllllllllIIllIIlIIllllllIlIl) {
        if (llIlIIlIIIlIlll((lllllllllllllIIllIIlIIllllllIlIl instanceof IMob) ? 1 : 0) && llIlIIlIIIllIII((lllllllllllllIIllIIlIIllllllIlIl instanceof EntityCreeper) ? 1 : 0) && llIlIIlIIIllIII(this.getRNG().nextInt(EntityIronGolem.lIIlIllIIllIIl[14]))) {
            this.setAttackTarget((EntityLivingBase)lllllllllllllIIllIIlIIllllllIlIl);
        }
        super.collideWithEntity(lllllllllllllIIllIIlIIllllllIlIl);
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIllIIlIIllllIlIIll) {
        super.readEntityFromNBT(lllllllllllllIIllIIlIIllllIlIIll);
        this.setPlayerCreated(lllllllllllllIIllIIlIIllllIlIIll.getBoolean(EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[0]]));
    }
    
    public Village getVillage() {
        return this.villageObj;
    }
    
    public void setPlayerCreated(final boolean lllllllllllllIIllIIlIIlllIIlIlIl) {
        final byte lllllllllllllIIllIIlIIlllIIlIlII = this.dataWatcher.getWatchableObjectByte(EntityIronGolem.lIIlIllIIllIIl[10]);
        if (llIlIIlIIIlIlll(lllllllllllllIIllIIlIIlllIIlIlIl ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityIronGolem.lIIlIllIIllIIl[10], (byte)(lllllllllllllIIllIIlIIlllIIlIlII | EntityIronGolem.lIIlIllIIllIIl[0]));
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityIronGolem.lIIlIllIIllIIl[10], (byte)(lllllllllllllIIllIIlIIlllIIlIlII & EntityIronGolem.lIIlIllIIllIIl[18]));
        }
    }
    
    static {
        llIlIIlIIIlIlII();
        llIlIIlIIIlIIlI();
    }
    
    @Override
    protected void playStepSound(final BlockPos lllllllllllllIIllIIlIIlllIllIIIl, final Block lllllllllllllIIllIIlIIlllIllIIII) {
        this.playSound(EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[5]], 1.0f, 1.0f);
    }
    
    private static boolean llIlIIlIIIlllIl(final int lllllllllllllIIllIIlIIllIlIlIllI, final int lllllllllllllIIllIIlIIllIlIlIlIl) {
        return lllllllllllllIIllIIlIIllIlIlIllI == lllllllllllllIIllIIlIIllIlIlIlIl;
    }
    
    private static boolean llIlIIlIIIllIlI(final int lllllllllllllIIllIIlIIllIIlllIIl) {
        return lllllllllllllIIllIIlIIllIIlllIIl > 0;
    }
    
    private static boolean llIlIIlIIIllllI(final int lllllllllllllIIllIIlIIllIlIlIIlI, final int lllllllllllllIIllIIlIIllIlIlIIIl) {
        return lllllllllllllIIllIIlIIllIlIlIIlI >= lllllllllllllIIllIIlIIllIlIlIIIl;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[3]];
    }
    
    public EntityIronGolem(final World lllllllllllllIIllIIlIlIIIIIIlIll) {
        super(lllllllllllllIIllIIlIlIIIIIIlIll);
        this.setSize(1.4f, 2.9f);
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityIronGolem.lIIlIllIIllIIl[0] != 0));
        this.tasks.addTask(EntityIronGolem.lIIlIllIIllIIl[0], new EntityAIAttackOnCollide(this, 1.0, (boolean)(EntityIronGolem.lIIlIllIIllIIl[0] != 0)));
        this.tasks.addTask(EntityIronGolem.lIIlIllIIllIIl[1], new EntityAIMoveTowardsTarget(this, 0.9, 32.0f));
        this.tasks.addTask(EntityIronGolem.lIIlIllIIllIIl[2], new EntityAIMoveThroughVillage(this, 0.6, (boolean)(EntityIronGolem.lIIlIllIIllIIl[0] != 0)));
        this.tasks.addTask(EntityIronGolem.lIIlIllIIllIIl[3], new EntityAIMoveTowardsRestriction(this, 1.0));
        this.tasks.addTask(EntityIronGolem.lIIlIllIIllIIl[4], new EntityAILookAtVillager(this));
        this.tasks.addTask(EntityIronGolem.lIIlIllIIllIIl[5], new EntityAIWander(this, 0.6));
        this.tasks.addTask(EntityIronGolem.lIIlIllIIllIIl[6], new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
        this.tasks.addTask(EntityIronGolem.lIIlIllIIllIIl[7], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntityIronGolem.lIIlIllIIllIIl[0], new EntityAIDefendVillage(this));
        this.targetTasks.addTask(EntityIronGolem.lIIlIllIIllIIl[1], new EntityAIHurtByTarget(this, (boolean)(EntityIronGolem.lIIlIllIIllIIl[8] != 0), new Class[EntityIronGolem.lIIlIllIIllIIl[8]]));
        this.targetTasks.addTask(EntityIronGolem.lIIlIllIIllIIl[2], new AINearestAttackableTargetNonCreeper<Object>(this, EntityLiving.class, EntityIronGolem.lIIlIllIIllIIl[9], (boolean)(EntityIronGolem.lIIlIllIIllIIl[8] != 0), (boolean)(EntityIronGolem.lIIlIllIIllIIl[0] != 0), IMob.VISIBLE_MOB_SELECTOR));
    }
    
    public int getHoldRoseTick() {
        return this.holdRoseTick;
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (llIlIIlIIIllIlI(this.attackTimer)) {
            this.attackTimer -= EntityIronGolem.lIIlIllIIllIIl[0];
        }
        if (llIlIIlIIIllIlI(this.holdRoseTick)) {
            this.holdRoseTick -= EntityIronGolem.lIIlIllIIllIIl[0];
        }
        if (llIlIIlIIIllIlI(llIlIIlIIIllIIl(this.motionX * this.motionX + this.motionZ * this.motionZ, 2.500000277905201E-7)) && llIlIIlIIIllIII(this.rand.nextInt(EntityIronGolem.lIIlIllIIllIIl[4]))) {
            final int lllllllllllllIIllIIlIIlllllIllIl = MathHelper.floor_double(this.posX);
            final int lllllllllllllIIllIIlIIlllllIllII = MathHelper.floor_double(this.posY - 0.20000000298023224);
            final int lllllllllllllIIllIIlIIlllllIlIll = MathHelper.floor_double(this.posZ);
            final IBlockState lllllllllllllIIllIIlIIlllllIlIlI = this.worldObj.getBlockState(new BlockPos(lllllllllllllIIllIIlIIlllllIllIl, lllllllllllllIIllIIlIIlllllIllII, lllllllllllllIIllIIlIIlllllIlIll));
            final Block lllllllllllllIIllIIlIIlllllIlIIl = lllllllllllllIIllIIlIIlllllIlIlI.getBlock();
            if (llIlIIlIIIllIll(lllllllllllllIIllIIlIIlllllIlIIl.getMaterial(), Material.air)) {
                final World worldObj = this.worldObj;
                final EnumParticleTypes block_CRACK = EnumParticleTypes.BLOCK_CRACK;
                final double lllllllllllllIIIlIIllllIIlIlllll = this.posX + (this.rand.nextFloat() - 0.5) * this.width;
                final double lllllllllllllIIIlIIllllIIlIllllI = this.getEntityBoundingBox().minY + 0.1;
                final double lllllllllllllIIIlIIllllIIlIlllIl = this.posZ + (this.rand.nextFloat() - 0.5) * this.width;
                final double lllllllllllllIIIlIIllllIIllIIlIl = 4.0 * (this.rand.nextFloat() - 0.5);
                final double lllllllllllllIIIlIIllllIIllIIlII = 0.5;
                final double lllllllllllllIIIlIIllllIIlIllIlI = (this.rand.nextFloat() - 0.5) * 4.0;
                final int[] lllllllllllllIIIlIIllllIIlIllIIl = new int[EntityIronGolem.lIIlIllIIllIIl[0]];
                lllllllllllllIIIlIIllllIIlIllIIl[EntityIronGolem.lIIlIllIIllIIl[8]] = Block.getStateId(lllllllllllllIIllIIlIIlllllIlIlI);
                worldObj.spawnParticle(block_CRACK, lllllllllllllIIIlIIllllIIlIlllll, lllllllllllllIIIlIIllllIIlIllllI, lllllllllllllIIIlIIllllIIlIlllIl, lllllllllllllIIIlIIllllIIllIIlIl, lllllllllllllIIIlIIllllIIllIIlII, lllllllllllllIIIlIIllllIIlIllIlI, lllllllllllllIIIlIIllllIIlIllIIl);
            }
        }
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityIronGolem.lIIlIllIIllIIl[10], (byte)EntityIronGolem.lIIlIllIIllIIl[8]);
    }
    
    private static boolean llIlIIlIIIllIII(final int lllllllllllllIIllIIlIIllIIllllIl) {
        return lllllllllllllIIllIIlIIllIIllllIl == 0;
    }
    
    private static int llIlIIlIIIllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static String llIlIIlIIIIllll(String lllllllllllllIIllIIlIIllIllIIIIl, final String lllllllllllllIIllIIlIIllIllIIlIl) {
        lllllllllllllIIllIIlIIllIllIIIIl = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIIlIIllIllIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIlIIllIllIIlII = new StringBuilder();
        final char[] lllllllllllllIIllIIlIIllIllIIIll = lllllllllllllIIllIIlIIllIllIIlIl.toCharArray();
        int lllllllllllllIIllIIlIIllIllIIIlI = EntityIronGolem.lIIlIllIIllIIl[8];
        final short lllllllllllllIIllIIlIIllIlIlllII = (Object)((String)lllllllllllllIIllIIlIIllIllIIIIl).toCharArray();
        final double lllllllllllllIIllIIlIIllIlIllIll = lllllllllllllIIllIIlIIllIlIlllII.length;
        Exception lllllllllllllIIllIIlIIllIlIllIlI = (Exception)EntityIronGolem.lIIlIllIIllIIl[8];
        while (llIlIIlIIlIIIII((int)lllllllllllllIIllIIlIIllIlIllIlI, (int)lllllllllllllIIllIIlIIllIlIllIll)) {
            final char lllllllllllllIIllIIlIIllIllIIlll = lllllllllllllIIllIIlIIllIlIlllII[lllllllllllllIIllIIlIIllIlIllIlI];
            lllllllllllllIIllIIlIIllIllIIlII.append((char)(lllllllllllllIIllIIlIIllIllIIlll ^ lllllllllllllIIllIIlIIllIllIIIll[lllllllllllllIIllIIlIIllIllIIIlI % lllllllllllllIIllIIlIIllIllIIIll.length]));
            "".length();
            ++lllllllllllllIIllIIlIIllIllIIIlI;
            ++lllllllllllllIIllIIlIIllIlIllIlI;
            "".length();
            if ("   ".length() >= (0xC7 ^ 0xC3)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIlIIllIllIIlII);
    }
    
    private static boolean llIlIIlIIIlIlll(final int lllllllllllllIIllIIlIIllIIllllll) {
        return lllllllllllllIIllIIlIIllIIllllll != 0;
    }
    
    private static boolean llIlIIlIIIlIllI(final Object lllllllllllllIIllIIlIIllIlIIIIIl) {
        return lllllllllllllIIllIIlIIllIlIIIIIl == null;
    }
    
    @Override
    public boolean canAttackClass(final Class<? extends EntityLivingBase> lllllllllllllIIllIIlIIllllIlllIl) {
        int canAttackClass;
        if (llIlIIlIIIlIlll(this.isPlayerCreated() ? 1 : 0) && llIlIIlIIIlIlll(EntityPlayer.class.isAssignableFrom(lllllllllllllIIllIIlIIllllIlllIl) ? 1 : 0)) {
            canAttackClass = EntityIronGolem.lIIlIllIIllIIl[8];
            "".length();
            if ("   ".length() < " ".length()) {
                return ((0x30 ^ 0x52) & ~(0xD9 ^ 0xBB)) != 0x0;
            }
        }
        else if (llIlIIlIIIlllII(lllllllllllllIIllIIlIIllllIlllIl, EntityCreeper.class)) {
            canAttackClass = EntityIronGolem.lIIlIllIIllIIl[8];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0x87 ^ 0xA6) & ~(0x91 ^ 0xB0)) != 0x0;
            }
        }
        else {
            canAttackClass = (super.canAttackClass(lllllllllllllIIllIIlIIllllIlllIl) ? 1 : 0);
        }
        return canAttackClass != 0;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
    }
    
    private static void llIlIIlIIIlIlII() {
        (lIIlIllIIllIIl = new int[20])[0] = " ".length();
        EntityIronGolem.lIIlIllIIllIIl[1] = "  ".length();
        EntityIronGolem.lIIlIllIIllIIl[2] = "   ".length();
        EntityIronGolem.lIIlIllIIllIIl[3] = (116 + 3 - 94 + 102 ^ (0x75 ^ 0xE));
        EntityIronGolem.lIIlIllIIllIIl[4] = (0x2 ^ 0x7);
        EntityIronGolem.lIIlIllIIllIIl[5] = (0x43 ^ 0x45);
        EntityIronGolem.lIIlIllIIllIIl[6] = (0xC1 ^ 0xC6);
        EntityIronGolem.lIIlIllIIllIIl[7] = (0x2D ^ 0x25);
        EntityIronGolem.lIIlIllIIllIIl[8] = ((0x57 ^ 0x67) & ~(0x21 ^ 0x11));
        EntityIronGolem.lIIlIllIIllIIl[9] = (0x40 ^ 0x4A);
        EntityIronGolem.lIIlIllIIllIIl[10] = (34 + 98 - 50 + 86 ^ 121 + 36 - 151 + 178);
        EntityIronGolem.lIIlIllIIllIIl[11] = (88 + 20 + 93 + 46 ^ 119 + 145 - 162 + 75);
        EntityIronGolem.lIIlIllIIllIIl[12] = (0xA8 ^ 0x99 ^ "   ".length());
        EntityIronGolem.lIIlIllIIllIIl[13] = (0x6D ^ 0x4D);
        EntityIronGolem.lIIlIllIIllIIl[14] = (0x3C ^ 0x28);
        EntityIronGolem.lIIlIllIIllIIl[15] = (0xA0 ^ 0xBB ^ (0xA3 ^ 0xB7));
        EntityIronGolem.lIIlIllIIllIIl[16] = (0xBD ^ 0xB6);
        EntityIronGolem.lIIlIllIIllIIl[17] = (0xFFFFD1B8 & 0x2FD7);
        EntityIronGolem.lIIlIllIIllIIl[18] = -"  ".length();
        EntityIronGolem.lIIlIllIIllIIl[19] = -(101 + 143 - 204 + 141 ^ 99 + 44 - 1 + 34);
    }
    
    private static boolean llIlIIlIIIlllII(final Object lllllllllllllIIllIIlIIllIlIIIllI, final Object lllllllllllllIIllIIlIIllIlIIIlIl) {
        return lllllllllllllIIllIIlIIllIlIIIllI == lllllllllllllIIllIIlIIllIlIIIlIl;
    }
    
    private static String llIlIIlIIIlIIII(final String lllllllllllllIIllIIlIIlllIIIIIll, final String lllllllllllllIIllIIlIIlllIIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIlllIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIlllIIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIlIIlllIIIIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIlIIlllIIIIlIl.init(EntityIronGolem.lIIlIllIIllIIl[1], lllllllllllllIIllIIlIIlllIIIIllI);
            return new String(lllllllllllllIIllIIlIIlllIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIlllIIIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIlllIIIIlII) {
            lllllllllllllIIllIIlIIlllIIIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onDeath(final DamageSource lllllllllllllIIllIIlIIlllIIIllIl) {
        if (llIlIIlIIIllIII(this.isPlayerCreated() ? 1 : 0) && llIlIIlIIIlllll(this.attackingPlayer) && llIlIIlIIIlllll(this.villageObj)) {
            this.villageObj.setReputationForPlayer(this.attackingPlayer.getName(), EntityIronGolem.lIIlIllIIllIIl[19]);
            "".length();
        }
        super.onDeath(lllllllllllllIIllIIlIIlllIIIllIl);
    }
    
    @Override
    protected int decreaseAirSupply(final int lllllllllllllIIllIIlIIllllllllII) {
        return lllllllllllllIIllIIlIIllllllllII;
    }
    
    private static void llIlIIlIIIlIIlI() {
        (lIIlIllIIllIII = new String[EntityIronGolem.lIIlIllIIllIIl[6]])[EntityIronGolem.lIIlIllIIllIIl[8]] = llIlIIlIIIIllll("JAUxEQgGKiINDAAMNA==", "tiPhm");
        EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[0]] = llIlIIlIIIIllll("Hj8VPiw8EAYiKDo2EA==", "NStGI");
        EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[1]] = llIlIIlIIIIllll("Dxc2ehAQFzozFg4dOXoNCgo7Iw==", "bxTTy");
        EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[2]] = llIlIIlIIIlIIII("F7cav5pk9MZXkUgffqM+MP7fZoIFfzgN", "DRKQI");
        EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[3]] = llIlIIlIIIIllll("PCgBfj0jKA03Oz0iDn48ODM=", "QGcPT");
        EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[4]] = llIlIIlIIIlIIII("CCATPnfHTncEMAYPG/0zNQnHHN1g5cc+", "AzIWe");
        EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[5]] = llIlIIlIIIlIIIl("hsSI6Wf/HJL8rffxFPD1sQr9Dcw3ODhn", "EmVET");
    }
    
    public boolean isPlayerCreated() {
        if (llIlIIlIIIlIlll(this.dataWatcher.getWatchableObjectByte(EntityIronGolem.lIIlIllIIllIIl[10]) & EntityIronGolem.lIIlIllIIllIIl[0])) {
            return EntityIronGolem.lIIlIllIIllIIl[0] != 0;
        }
        return EntityIronGolem.lIIlIllIIllIIl[8] != 0;
    }
    
    private static String llIlIIlIIIlIIIl(final String lllllllllllllIIllIIlIIllIlllIlII, final String lllllllllllllIIllIIlIIllIlllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIlIIllIllllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIlIIllIlllIIll.getBytes(StandardCharsets.UTF_8)), EntityIronGolem.lIIlIllIIllIIl[7]), "DES");
            final Cipher lllllllllllllIIllIIlIIllIllllIII = Cipher.getInstance("DES");
            lllllllllllllIIllIIlIIllIllllIII.init(EntityIronGolem.lIIlIllIIllIIl[1], lllllllllllllIIllIIlIIllIllllIIl);
            return new String(lllllllllllllIIllIIlIIllIllllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIlIIllIlllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIlIIllIlllIlll) {
            lllllllllllllIIllIIlIIllIlllIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIIlIIIllIll(final Object lllllllllllllIIllIIlIIllIlIIlIlI, final Object lllllllllllllIIllIIlIIllIlIIlIIl) {
        return lllllllllllllIIllIIlIIllIlIIlIlI != lllllllllllllIIllIIlIIllIlIIlIIl;
    }
    
    private static boolean llIlIIlIIlIIIII(final int lllllllllllllIIllIIlIIllIlIIlllI, final int lllllllllllllIIllIIlIIllIlIIllIl) {
        return lllllllllllllIIllIIlIIllIlIIlllI < lllllllllllllIIllIIlIIllIlIIllIl;
    }
    
    @Override
    protected String getDeathSound() {
        return EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[4]];
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIIllIIlIIlllIlIlIIl, final int lllllllllllllIIllIIlIIlllIlIlIII) {
        final int lllllllllllllIIllIIlIIlllIlIIlll = this.rand.nextInt(EntityIronGolem.lIIlIllIIllIIl[2]);
        int lllllllllllllIIllIIlIIlllIlIIllI = EntityIronGolem.lIIlIllIIllIIl[8];
        "".length();
        if ("   ".length() == (0xCF ^ 0x81 ^ (0xD3 ^ 0x99))) {
            return;
        }
        while (!llIlIIlIIIllllI(lllllllllllllIIllIIlIIlllIlIIllI, lllllllllllllIIllIIlIIlllIlIIlll)) {
            this.dropItemWithOffset(Item.getItemFromBlock(Blocks.red_flower), EntityIronGolem.lIIlIllIIllIIl[0], (float)BlockFlower.EnumFlowerType.POPPY.getMeta());
            "".length();
            ++lllllllllllllIIllIIlIIlllIlIIllI;
        }
        final int lllllllllllllIIllIIlIIlllIlIIlIl = EntityIronGolem.lIIlIllIIllIIl[2] + this.rand.nextInt(EntityIronGolem.lIIlIllIIllIIl[2]);
        int lllllllllllllIIllIIlIIlllIlIIlII = EntityIronGolem.lIIlIllIIllIIl[8];
        "".length();
        if ("   ".length() <= "  ".length()) {
            return;
        }
        while (!llIlIIlIIIllllI(lllllllllllllIIllIIlIIlllIlIIlII, lllllllllllllIIllIIlIIlllIlIIlIl)) {
            this.dropItem(Items.iron_ingot, EntityIronGolem.lIIlIllIIllIIl[0]);
            "".length();
            ++lllllllllllllIIllIIlIIlllIlIIlII;
        }
    }
    
    @Override
    public boolean attackEntityAsMob(final Entity lllllllllllllIIllIIlIIllllIIlIIl) {
        this.attackTimer = EntityIronGolem.lIIlIllIIllIIl[9];
        this.worldObj.setEntityState(this, (byte)EntityIronGolem.lIIlIllIIllIIl[3]);
        final boolean lllllllllllllIIllIIlIIllllIIlIll = lllllllllllllIIllIIlIIllllIIlIIl.attackEntityFrom(DamageSource.causeMobDamage(this), (float)(EntityIronGolem.lIIlIllIIllIIl[6] + this.rand.nextInt(EntityIronGolem.lIIlIllIIllIIl[15])));
        if (llIlIIlIIIlIlll(lllllllllllllIIllIIlIIllllIIlIll ? 1 : 0)) {
            lllllllllllllIIllIIlIIllllIIlIIl.motionY += 0.4000000059604645;
            this.applyEnchantments(this, lllllllllllllIIllIIlIIllllIIlIIl);
        }
        this.playSound(EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[1]], 1.0f, 1.0f);
        return lllllllllllllIIllIIlIIllllIIlIll;
    }
    
    public void setHoldingRose(final boolean lllllllllllllIIllIIlIIlllIllIllI) {
        int holdRoseTick;
        if (llIlIIlIIIlIlll(lllllllllllllIIllIIlIIlllIllIllI ? 1 : 0)) {
            holdRoseTick = EntityIronGolem.lIIlIllIIllIIl[17];
            "".length();
            if ((0x93 ^ 0x96) == 0x0) {
                return;
            }
        }
        else {
            holdRoseTick = EntityIronGolem.lIIlIllIIllIIl[8];
        }
        this.holdRoseTick = holdRoseTick;
        this.worldObj.setEntityState(this, (byte)EntityIronGolem.lIIlIllIIllIIl[16]);
    }
    
    private static boolean llIlIIlIIIlllll(final Object lllllllllllllIIllIIlIIllIlIIIIll) {
        return lllllllllllllIIllIIlIIllIlIIIIll != null;
    }
    
    @Override
    protected void updateAITasks() {
        final int n = this.homeCheckTimer - EntityIronGolem.lIIlIllIIllIIl[0];
        this.homeCheckTimer = n;
        if (llIlIIlIIIlIlIl(n)) {
            this.homeCheckTimer = EntityIronGolem.lIIlIllIIllIIl[11] + this.rand.nextInt(EntityIronGolem.lIIlIllIIllIIl[12]);
            this.villageObj = this.worldObj.getVillageCollection().getNearestVillage(new BlockPos(this), EntityIronGolem.lIIlIllIIllIIl[13]);
            if (llIlIIlIIIlIllI(this.villageObj)) {
                this.detachHome();
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                final BlockPos lllllllllllllIIllIIlIlIIIIIIIlII = this.villageObj.getCenter();
                this.setHomePosAndDistance(lllllllllllllIIllIIlIlIIIIIIIlII, (int)(this.villageObj.getVillageRadius() * 0.6f));
            }
        }
        super.updateAITasks();
    }
    
    private static boolean llIlIIlIIIlIlIl(final int lllllllllllllIIllIIlIIllIIlllIll) {
        return lllllllllllllIIllIIlIIllIIlllIll <= 0;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIllIIlIIllllIllIIl) {
        super.writeEntityToNBT(lllllllllllllIIllIIlIIllllIllIIl);
        lllllllllllllIIllIIlIIllllIllIIl.setBoolean(EntityIronGolem.lIIlIllIIllIII[EntityIronGolem.lIIlIllIIllIIl[8]], this.isPlayerCreated());
    }
    
    static class AINearestAttackableTargetNonCreeper<T extends EntityLivingBase> extends EntityAINearestAttackableTarget<T>
    {
        public AINearestAttackableTargetNonCreeper(final EntityCreature llllllllllllIllIlIlllIIIIIlIIlll, final Class<T> llllllllllllIllIlIlllIIIIIlIIllI, final int llllllllllllIllIlIlllIIIIIlIIlIl, final boolean llllllllllllIllIlIlllIIIIIlIlIll, final boolean llllllllllllIllIlIlllIIIIIlIlIlI, final Predicate<? super T> llllllllllllIllIlIlllIIIIIlIlIIl) {
            super(llllllllllllIllIlIlllIIIIIlIIlll, llllllllllllIllIlIlllIIIIIlIIllI, llllllllllllIllIlIlllIIIIIlIIlIl, llllllllllllIllIlIlllIIIIIlIlIll, llllllllllllIllIlIlllIIIIIlIlIlI, llllllllllllIllIlIlllIIIIIlIlIIl);
            this.targetEntitySelector = (com.google.common.base.Predicate<? super T>)new Predicate<T>() {
                private static final /* synthetic */ int[] llIIllIIlIlIIl;
                
                private static void lIIIlllIlIIlIIII() {
                    (llIIllIIlIlIIl = new int[1])[0] = ((0xC9 ^ 0x9F ^ (0xF4 ^ 0xC3)) & (0x7C ^ 0x8 ^ (0x8D ^ 0x98) ^ -" ".length()));
                }
                
                private static int lIIIlllIlIIlIIlI(final double n, final double n2) {
                    return dcmpl(n, n2);
                }
                
                private static boolean lIIIlllIlIIlIllI(final int llllllllllllIlllIIIIIllIlIIIIlll) {
                    return llllllllllllIlllIIIIIllIlIIIIlll < 0;
                }
                
                private static boolean lIIIlllIlIIlIlll(final int llllllllllllIlllIIIIIllIlIIIIlIl) {
                    return llllllllllllIlllIIIIIllIlIIIIlIl > 0;
                }
                
                public boolean apply(final T llllllllllllIlllIIIIIllIlIIlIlIl) {
                    if (lIIIlllIlIIlIIll(llllllllllllIllIlIlllIIIIIlIlIIl) && lIIIlllIlIIlIlII(llllllllllllIllIlIlllIIIIIlIlIIl.apply((Object)llllllllllllIlllIIIIIllIlIIlIlIl) ? 1 : 0)) {
                        return EntityIronGolem$AINearestAttackableTargetNonCreeper$1.llIIllIIlIlIIl[0] != 0;
                    }
                    if (lIIIlllIlIIlIlIl((llllllllllllIlllIIIIIllIlIIlIlIl instanceof EntityCreeper) ? 1 : 0)) {
                        return EntityIronGolem$AINearestAttackableTargetNonCreeper$1.llIIllIIlIlIIl[0] != 0;
                    }
                    if (lIIIlllIlIIlIlIl((llllllllllllIlllIIIIIllIlIIlIlIl instanceof EntityPlayer) ? 1 : 0)) {
                        double llllllllllllIlllIIIIIllIlIIllIII = EntityAITarget.this.getTargetDistance();
                        if (lIIIlllIlIIlIlIl(llllllllllllIlllIIIIIllIlIIlIlIl.isSneaking() ? 1 : 0)) {
                            llllllllllllIlllIIIIIllIlIIllIII *= 0.800000011920929;
                        }
                        if (lIIIlllIlIIlIlIl(llllllllllllIlllIIIIIllIlIIlIlIl.isInvisible() ? 1 : 0)) {
                            float llllllllllllIlllIIIIIllIlIIlIlll = ((EntityPlayer)llllllllllllIlllIIIIIllIlIIlIlIl).getArmorVisibility();
                            if (lIIIlllIlIIlIllI(lIIIlllIlIIlIIIl(llllllllllllIlllIIIIIllIlIIlIlll, 0.1f))) {
                                llllllllllllIlllIIIIIllIlIIlIlll = 0.1f;
                            }
                            llllllllllllIlllIIIIIllIlIIllIII *= 0.7f * llllllllllllIlllIIIIIllIlIIlIlll;
                        }
                        if (lIIIlllIlIIlIlll(lIIIlllIlIIlIIlI(llllllllllllIlllIIIIIllIlIIlIlIl.getDistanceToEntity(llllllllllllIllIlIlllIIIIIlIIlll), llllllllllllIlllIIIIIllIlIIllIII))) {
                            return EntityIronGolem$AINearestAttackableTargetNonCreeper$1.llIIllIIlIlIIl[0] != 0;
                        }
                    }
                    return EntityAITarget.this.isSuitableTarget(llllllllllllIlllIIIIIllIlIIlIlIl, (boolean)(EntityIronGolem$AINearestAttackableTargetNonCreeper$1.llIIllIIlIlIIl[0] != 0));
                }
                
                private static boolean lIIIlllIlIIlIlII(final int llllllllllllIlllIIIIIllIlIIIlIIl) {
                    return llllllllllllIlllIIIIIllIlIIIlIIl == 0;
                }
                
                private static int lIIIlllIlIIlIIIl(final float n, final float n2) {
                    return fcmpg(n, n2);
                }
                
                private static boolean lIIIlllIlIIlIlIl(final int llllllllllllIlllIIIIIllIlIIIlIll) {
                    return llllllllllllIlllIIIIIllIlIIIlIll != 0;
                }
                
                private static boolean lIIIlllIlIIlIIll(final Object llllllllllllIlllIIIIIllIlIIIllIl) {
                    return llllllllllllIlllIIIIIllIlIIIllIl != null;
                }
                
                static {
                    lIIIlllIlIIlIIII();
                }
            };
        }
    }
}
