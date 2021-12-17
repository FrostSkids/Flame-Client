// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import java.util.Iterator;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import java.util.List;
import net.minecraft.block.material.Material;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.entity.Entity;
import net.minecraft.potion.Potion;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import java.util.UUID;
import net.minecraft.entity.IRangedAttackMob;

public class EntityWitch extends EntityMob implements IRangedAttackMob
{
    private static final /* synthetic */ UUID MODIFIER_UUID;
    private /* synthetic */ int witchAttackTimer;
    private static final /* synthetic */ String[] llllIIllIlIll;
    private static final /* synthetic */ AttributeModifier MODIFIER;
    private static final /* synthetic */ Item[] witchDrops;
    private static final /* synthetic */ int[] llllIIllIlllI;
    
    private static boolean lIlIlIIIllllIll(final int lllllllllllllIlIlllIIIlllIIIIIll) {
        return lllllllllllllIlIlllIIIlllIIIIIll != 0;
    }
    
    @Override
    protected String getDeathSound() {
        return null;
    }
    
    @Override
    public void attackEntityWithRangedAttack(final EntityLivingBase lllllllllllllIlIlllIIIlllIlIlIll, final float lllllllllllllIlIlllIIIlllIllIIll) {
        if (lIlIlIIIlllllll(this.getAggressive() ? 1 : 0)) {
            final EntityPotion lllllllllllllIlIlllIIIlllIllIIlI = new EntityPotion(this.worldObj, this, EntityWitch.llllIIllIlllI[19]);
            final double lllllllllllllIlIlllIIIlllIllIIIl = lllllllllllllIlIlllIIIlllIlIlIll.posY + lllllllllllllIlIlllIIIlllIlIlIll.getEyeHeight() - 1.100000023841858;
            final EntityPotion entityPotion = lllllllllllllIlIlllIIIlllIllIIlI;
            entityPotion.rotationPitch += 20.0f;
            final double lllllllllllllIlIlllIIIlllIllIIII = lllllllllllllIlIlllIIIlllIlIlIll.posX + lllllllllllllIlIlllIIIlllIlIlIll.motionX - this.posX;
            final double lllllllllllllIlIlllIIIlllIlIllll = lllllllllllllIlIlllIIIlllIllIIIl - this.posY;
            final double lllllllllllllIlIlllIIIlllIlIlllI = lllllllllllllIlIlllIIIlllIlIlIll.posZ + lllllllllllllIlIlllIIIlllIlIlIll.motionZ - this.posZ;
            final float lllllllllllllIlIlllIIIlllIlIllIl = MathHelper.sqrt_double(lllllllllllllIlIlllIIIlllIllIIII * lllllllllllllIlIlllIIIlllIllIIII + lllllllllllllIlIlllIIIlllIlIlllI * lllllllllllllIlIlllIIIlllIlIlllI);
            if (lIlIlIIlIIIlIIl(lIlIlIIlIIIIlll(lllllllllllllIlIlllIIIlllIlIllIl, 8.0f)) && lIlIlIIIlllllll(lllllllllllllIlIlllIIIlllIlIlIll.isPotionActive(Potion.moveSlowdown) ? 1 : 0)) {
                lllllllllllllIlIlllIIIlllIllIIlI.setPotionDamage(EntityWitch.llllIIllIlllI[20]);
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else if (lIlIlIIlIIIlIIl(lIlIlIIlIIIIlll(lllllllllllllIlIlllIIIlllIlIlIll.getHealth(), 8.0f)) && lIlIlIIIlllllll(lllllllllllllIlIlllIIIlllIlIlIll.isPotionActive(Potion.poison) ? 1 : 0)) {
                lllllllllllllIlIlllIIIlllIllIIlI.setPotionDamage(EntityWitch.llllIIllIlllI[21]);
                "".length();
                if ("   ".length() <= -" ".length()) {
                    return;
                }
            }
            else if (lIlIlIIlIIIIIII(lIlIlIIlIIIlIII(lllllllllllllIlIlllIIIlllIlIllIl, 3.0f)) && lIlIlIIIlllllll(lllllllllllllIlIlllIIIlllIlIlIll.isPotionActive(Potion.weakness) ? 1 : 0) && lIlIlIIlIIIIIll(lIlIlIIlIIIlIII(this.rand.nextFloat(), 0.25f))) {
                lllllllllllllIlIlllIIIlllIllIIlI.setPotionDamage(EntityWitch.llllIIllIlllI[22]);
            }
            lllllllllllllIlIlllIIIlllIllIIlI.setThrowableHeading(lllllllllllllIlIlllIIIlllIllIIII, lllllllllllllIlIlllIIIlllIlIllll + lllllllllllllIlIlllIIIlllIlIllIl * 0.2f, lllllllllllllIlIlllIIIlllIlIlllI, 0.75f, 8.0f);
            this.worldObj.spawnEntityInWorld(lllllllllllllIlIlllIIIlllIllIIlI);
            "".length();
        }
    }
    
    static {
        lIlIlIIIllllIlI();
        lIlIlIIIllllIIl();
        MODIFIER_UUID = UUID.fromString(EntityWitch.llllIIllIlIll[EntityWitch.llllIIllIlllI[0]]);
        MODIFIER = new AttributeModifier(EntityWitch.MODIFIER_UUID, EntityWitch.llllIIllIlIll[EntityWitch.llllIIllIlllI[1]], -0.25, EntityWitch.llllIIllIlllI[0]).setSaved((boolean)(EntityWitch.llllIIllIlllI[0] != 0));
        final Item[] witchDrops2 = new Item[EntityWitch.llllIIllIlllI[2]];
        witchDrops2[EntityWitch.llllIIllIlllI[0]] = Items.glowstone_dust;
        witchDrops2[EntityWitch.llllIIllIlllI[1]] = Items.sugar;
        witchDrops2[EntityWitch.llllIIllIlllI[3]] = Items.redstone;
        witchDrops2[EntityWitch.llllIIllIlllI[4]] = Items.spider_eye;
        witchDrops2[EntityWitch.llllIIllIlllI[5]] = Items.glass_bottle;
        witchDrops2[EntityWitch.llllIIllIlllI[6]] = Items.gunpowder;
        witchDrops2[EntityWitch.llllIIllIlllI[7]] = Items.stick;
        witchDrops2[EntityWitch.llllIIllIlllI[8]] = Items.stick;
        witchDrops = witchDrops2;
    }
    
    private static void lIlIlIIIllllIlI() {
        (llllIIllIlllI = new int[23])[0] = ((96 + 115 - 171 + 89 ^ 45 + 134 - 122 + 119) & (85 + 17 + 12 + 21 ^ 153 + 59 - 150 + 120 ^ -" ".length()));
        EntityWitch.llllIIllIlllI[1] = " ".length();
        EntityWitch.llllIIllIlllI[2] = (0x5D ^ 0x55);
        EntityWitch.llllIIllIlllI[3] = "  ".length();
        EntityWitch.llllIIllIlllI[4] = "   ".length();
        EntityWitch.llllIIllIlllI[5] = (29 + 99 - 7 + 24 ^ 142 + 133 - 157 + 31);
        EntityWitch.llllIIllIlllI[6] = (0x94 ^ 0xA9 ^ (0x36 ^ 0xE));
        EntityWitch.llllIIllIlllI[7] = (0x2E ^ 0x9 ^ (0xA3 ^ 0x82));
        EntityWitch.llllIIllIlllI[8] = (0x8A ^ 0x8D);
        EntityWitch.llllIIllIlllI[9] = (0x2A ^ 0x7F ^ (0x8 ^ 0x61));
        EntityWitch.llllIIllIlllI[10] = (0x16 ^ 0x65 ^ (0x59 ^ 0x3F));
        EntityWitch.llllIIllIlllI[11] = -" ".length();
        EntityWitch.llllIIllIlllI[12] = (0xFFFFFEBD & 0x216F);
        EntityWitch.llllIIllIlllI[13] = (0xFFFFFFB7 & 0x3FFB);
        EntityWitch.llllIIllIlllI[14] = (0xFFFFBFDD & 0x7FF7);
        EntityWitch.llllIIllIlllI[15] = (0xFFFFFFDE & 0x3FB3);
        EntityWitch.llllIIllIlllI[16] = (124 + 50 - 133 + 92 ^ 98 + 66 - 104 + 78);
        EntityWitch.llllIIllIlllI[17] = (0x15 ^ 0x36);
        EntityWitch.llllIIllIlllI[18] = (0x49 ^ 0x70 ^ (0x57 ^ 0x64));
        EntityWitch.llllIIllIlllI[19] = (0xFFFFFFFD & 0x7FDE);
        EntityWitch.llllIIllIlllI[20] = (-" ".length() & (0xFFFFFFFE & 0x7FBB));
        EntityWitch.llllIIllIlllI[21] = (-(0x70 ^ 0x51) & (0xFFFFFFFD & 0x7FB6));
        EntityWitch.llllIIllIlllI[22] = (0xFFFFFFB8 & 0x7FFF);
    }
    
    public boolean getAggressive() {
        if (lIlIlIIIlllllII(this.getDataWatcher().getWatchableObjectByte(EntityWitch.llllIIllIlllI[10]), EntityWitch.llllIIllIlllI[1])) {
            return EntityWitch.llllIIllIlllI[1] != 0;
        }
        return EntityWitch.llllIIllIlllI[0] != 0;
    }
    
    @Override
    protected String getHurtSound() {
        return null;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(26.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
    }
    
    private static boolean lIlIlIIlIIIlIIl(final int lllllllllllllIlIlllIIIllIlllllll) {
        return lllllllllllllIlIlllIIIllIlllllll >= 0;
    }
    
    private static boolean lIlIlIIIlllllll(final int lllllllllllllIlIlllIIIlllIIIIIIl) {
        return lllllllllllllIlIlllIIIlllIIIIIIl == 0;
    }
    
    private static boolean lIlIlIIlIIIIIII(final int lllllllllllllIlIlllIIIllIllllIll) {
        return lllllllllllllIlIlllIIIllIllllIll <= 0;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.getDataWatcher().addObject(EntityWitch.llllIIllIlllI[10], (byte)EntityWitch.llllIIllIlllI[0]);
    }
    
    @Override
    protected float applyPotionDamageCalculations(final DamageSource lllllllllllllIlIlllIIIllllIllIII, float lllllllllllllIlIlllIIIllllIlIlII) {
        lllllllllllllIlIlllIIIllllIlIlII = super.applyPotionDamageCalculations(lllllllllllllIlIlllIIIllllIllIII, lllllllllllllIlIlllIIIllllIlIlII);
        if (lIlIlIIlIIIIIlI(lllllllllllllIlIlllIIIllllIllIII.getEntity(), this)) {
            lllllllllllllIlIlllIIIllllIlIlII = 0.0f;
        }
        if (lIlIlIIIllllIll(lllllllllllllIlIlllIIIllllIllIII.isMagicDamage() ? 1 : 0)) {
            lllllllllllllIlIlllIIIllllIlIlII *= (float)0.15;
        }
        return lllllllllllllIlIlllIIIllllIlIlII;
    }
    
    private static boolean lIlIlIIlIIIIllI(final int lllllllllllllIlIlllIIIlllIIlIIII, final int lllllllllllllIlIlllIIIlllIIIllll) {
        return lllllllllllllIlIlllIIIlllIIlIIII >= lllllllllllllIlIlllIIIlllIIIllll;
    }
    
    private static boolean lIlIlIIlIIIIIlI(final Object lllllllllllllIlIlllIIIlllIIIIllI, final Object lllllllllllllIlIlllIIIlllIIIIlIl) {
        return lllllllllllllIlIlllIIIlllIIIIllI == lllllllllllllIlIlllIIIlllIIIIlIl;
    }
    
    private static boolean lIlIlIIlIIIIIll(final int lllllllllllllIlIlllIIIllIlllllIl) {
        return lllllllllllllIlIlllIIIllIlllllIl < 0;
    }
    
    private static int lIlIlIIlIIIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public float getEyeHeight() {
        return 1.62f;
    }
    
    @Override
    protected String getLivingSound() {
        return null;
    }
    
    private static void lIlIlIIIllllIIl() {
        (llllIIllIlIll = new String[EntityWitch.llllIIllIlllI[3]])[EntityWitch.llllIIllIlllI[0]] = lIlIlIIIllllIII("T8eG0X9M+i6OzXGV2Zw5kGMu6zNXUpuTIwuRHwMkox+mJ5ybEk6bBQ==", "NvDHq");
        EntityWitch.llllIIllIlIll[EntityWitch.llllIIllIlllI[1]] = lIlIlIIIllllIII("oRPo//HO36DQIDYry2yADlqP4iNVAQGV", "MRNbo");
    }
    
    private static boolean lIlIlIIIlllllII(final int lllllllllllllIlIlllIIIlllIIlIlII, final int lllllllllllllIlIlllIIIlllIIlIIll) {
        return lllllllllllllIlIlllIIIlllIIlIlII == lllllllllllllIlIlllIIIlllIIlIIll;
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIlIlllIIIllllIIlIll, final int lllllllllllllIlIlllIIIllllIIlIlI) {
        final int lllllllllllllIlIlllIIIllllIIlIIl = this.rand.nextInt(EntityWitch.llllIIllIlllI[4]) + EntityWitch.llllIIllIlllI[1];
        int lllllllllllllIlIlllIIIllllIIlIII = EntityWitch.llllIIllIlllI[0];
        "".length();
        if ("  ".length() < ((0x9F ^ 0xB1) & ~(0x2 ^ 0x2C))) {
            return;
        }
        while (!lIlIlIIlIIIIllI(lllllllllllllIlIlllIIIllllIIlIII, lllllllllllllIlIlllIIIllllIIlIIl)) {
            int lllllllllllllIlIlllIIIllllIIIlll = this.rand.nextInt(EntityWitch.llllIIllIlllI[4]);
            final Item lllllllllllllIlIlllIIIllllIIIllI = EntityWitch.witchDrops[this.rand.nextInt(EntityWitch.witchDrops.length)];
            if (lIlIlIIlIIIIlII(lllllllllllllIlIlllIIIllllIIlIlI)) {
                lllllllllllllIlIlllIIIllllIIIlll += this.rand.nextInt(lllllllllllllIlIlllIIIllllIIlIlI + EntityWitch.llllIIllIlllI[1]);
            }
            int lllllllllllllIlIlllIIIllllIIIlIl = EntityWitch.llllIIllIlllI[0];
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
            while (!lIlIlIIlIIIIllI(lllllllllllllIlIlllIIIllllIIIlIl, lllllllllllllIlIlllIIIllllIIIlll)) {
                this.dropItem(lllllllllllllIlIlllIIIllllIIIllI, EntityWitch.llllIIllIlllI[1]);
                "".length();
                ++lllllllllllllIlIlllIIIllllIIIlIl;
            }
            ++lllllllllllllIlIlllIIIllllIIlIII;
        }
    }
    
    public EntityWitch(final World lllllllllllllIlIlllIIlIIIIIIlIlI) {
        super(lllllllllllllIlIlllIIlIIIIIIlIlI);
        this.setSize(0.6f, 1.95f);
        this.tasks.addTask(EntityWitch.llllIIllIlllI[1], new EntityAISwimming(this));
        this.tasks.addTask(EntityWitch.llllIIllIlllI[3], new EntityAIArrowAttack(this, 1.0, EntityWitch.llllIIllIlllI[9], 10.0f));
        this.tasks.addTask(EntityWitch.llllIIllIlllI[3], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityWitch.llllIIllIlllI[4], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntityWitch.llllIIllIlllI[4], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntityWitch.llllIIllIlllI[1], new EntityAIHurtByTarget(this, (boolean)(EntityWitch.llllIIllIlllI[0] != 0), new Class[EntityWitch.llllIIllIlllI[0]]));
        this.targetTasks.addTask(EntityWitch.llllIIllIlllI[3], new EntityAINearestAttackableTarget<Object>(this, EntityPlayer.class, (boolean)(EntityWitch.llllIIllIlllI[1] != 0)));
    }
    
    public void setAggressive(final boolean lllllllllllllIlIlllIIIllllllllII) {
        final DataWatcher dataWatcher = this.getDataWatcher();
        final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityWitch.llllIIllIlllI[10];
        int n;
        if (lIlIlIIIllllIll(lllllllllllllIlIlllIIIllllllllII ? 1 : 0)) {
            n = EntityWitch.llllIIllIlllI[1];
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            n = EntityWitch.llllIIllIlllI[0];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
    }
    
    private static String lIlIlIIIllllIII(final String lllllllllllllIlIlllIIIlllIIlllII, final String lllllllllllllIlIlllIIIlllIIllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIIIlllIIlllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIIIlllIIllIll.getBytes(StandardCharsets.UTF_8)), EntityWitch.llllIIllIlllI[2]), "DES");
            final Cipher lllllllllllllIlIlllIIIlllIIllllI = Cipher.getInstance("DES");
            lllllllllllllIlIlllIIIlllIIllllI.init(EntityWitch.llllIIllIlllI[3], lllllllllllllIlIlllIIIlllIIlllll);
            return new String(lllllllllllllIlIlllIIIlllIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIIIlllIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIIIlllIIlllIl) {
            lllllllllllllIlIlllIIIlllIIlllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void handleStatusUpdate(final byte lllllllllllllIlIlllIIIlllllIIIIl) {
        if (lIlIlIIIlllllII(lllllllllllllIlIlllIIIlllllIIIIl, EntityWitch.llllIIllIlllI[16])) {
            int lllllllllllllIlIlllIIIlllllIIIII = EntityWitch.llllIIllIlllI[0];
            "".length();
            if ((0x4 ^ 0x19 ^ (0xA7 ^ 0xBF)) == 0x0) {
                return;
            }
            while (!lIlIlIIlIIIIllI(lllllllllllllIlIlllIIIlllllIIIII, this.rand.nextInt(EntityWitch.llllIIllIlllI[17]) + EntityWitch.llllIIllIlllI[18])) {
                this.worldObj.spawnParticle(EnumParticleTypes.SPELL_WITCH, this.posX + this.rand.nextGaussian() * 0.12999999523162842, this.getEntityBoundingBox().maxY + 0.5 + this.rand.nextGaussian() * 0.12999999523162842, this.posZ + this.rand.nextGaussian() * 0.12999999523162842, 0.0, 0.0, 0.0, new int[EntityWitch.llllIIllIlllI[0]]);
                ++lllllllllllllIlIlllIIIlllllIIIII;
            }
            "".length();
            if (((132 + 222 - 227 + 101 ^ 60 + 67 - 112 + 159) & (0x94 ^ 0xB9 ^ (0xC4 ^ 0xA3) ^ -" ".length())) != ((0x9B ^ 0xA1 ^ (0x5A ^ 0x5E)) & (0x69 ^ 0x27 ^ (0x32 ^ 0x42) ^ -" ".length()))) {
                return;
            }
        }
        else {
            super.handleStatusUpdate(lllllllllllllIlIlllIIIlllllIIIIl);
        }
    }
    
    private static int lIlIlIIlIIIlIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIlIlIIlIIIIlII(final int lllllllllllllIlIlllIIIllIllllIIl) {
        return lllllllllllllIlIlllIIIllIllllIIl > 0;
    }
    
    private static boolean lIlIlIIlIIIIlIl(final int lllllllllllllIlIlllIIIlllIIIllII, final int lllllllllllllIlIlllIIIlllIIIlIll) {
        return lllllllllllllIlIlllIIIlllIIIllII > lllllllllllllIlIlllIIIlllIIIlIll;
    }
    
    private static int lIlIlIIIlllllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIlIlIIIllllllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIlIlIIlIIIIIIl(final Object lllllllllllllIlIlllIIIlllIIIlIIl) {
        return lllllllllllllIlIlllIIIlllIIIlIIl != null;
    }
    
    @Override
    public void onLivingUpdate() {
        if (lIlIlIIIlllllll(this.worldObj.isRemote ? 1 : 0)) {
            if (lIlIlIIIllllIll(this.getAggressive() ? 1 : 0)) {
                final int witchAttackTimer = this.witchAttackTimer;
                this.witchAttackTimer = witchAttackTimer - EntityWitch.llllIIllIlllI[1];
                if (lIlIlIIlIIIIIII(witchAttackTimer)) {
                    this.setAggressive((boolean)(EntityWitch.llllIIllIlllI[0] != 0));
                    final ItemStack lllllllllllllIlIlllIIIlllllIllll = this.getHeldItem();
                    this.setCurrentItemOrArmor(EntityWitch.llllIIllIlllI[0], null);
                    if (lIlIlIIlIIIIIIl(lllllllllllllIlIlllIIIlllllIllll) && lIlIlIIlIIIIIlI(lllllllllllllIlIlllIIIlllllIllll.getItem(), Items.potionitem)) {
                        final List<PotionEffect> lllllllllllllIlIlllIIIlllllIlllI = Items.potionitem.getEffects(lllllllllllllIlIlllIIIlllllIllll);
                        if (lIlIlIIlIIIIIIl(lllllllllllllIlIlllIIIlllllIlllI)) {
                            final boolean lllllllllllllIlIlllIIIlllllIIllI = (boolean)lllllllllllllIlIlllIIIlllllIlllI.iterator();
                            "".length();
                            if ("   ".length() <= -" ".length()) {
                                return;
                            }
                            while (!lIlIlIIIlllllll(((Iterator)lllllllllllllIlIlllIIIlllllIIllI).hasNext() ? 1 : 0)) {
                                final PotionEffect lllllllllllllIlIlllIIIlllllIllIl = ((Iterator<PotionEffect>)lllllllllllllIlIlllIIIlllllIIllI).next();
                                this.addPotionEffect(new PotionEffect(lllllllllllllIlIlllIIIlllllIllIl));
                            }
                        }
                    }
                    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).removeModifier(EntityWitch.MODIFIER);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else {
                int lllllllllllllIlIlllIIIlllllIllII = EntityWitch.llllIIllIlllI[11];
                if (lIlIlIIlIIIIIll(lIlIlIIIlllllIl(this.rand.nextFloat(), 0.15f)) && lIlIlIIIllllIll(this.isInsideOfMaterial(Material.water) ? 1 : 0) && lIlIlIIIlllllll(this.isPotionActive(Potion.waterBreathing) ? 1 : 0)) {
                    lllllllllllllIlIlllIIIlllllIllII = EntityWitch.llllIIllIlllI[12];
                    "".length();
                    if ((0x84 ^ 0xB0 ^ (0x2E ^ 0x1E)) == 0x0) {
                        return;
                    }
                }
                else if (lIlIlIIlIIIIIll(lIlIlIIIlllllIl(this.rand.nextFloat(), 0.15f)) && lIlIlIIIllllIll(this.isBurning() ? 1 : 0) && lIlIlIIIlllllll(this.isPotionActive(Potion.fireResistance) ? 1 : 0)) {
                    lllllllllllllIlIlllIIIlllllIllII = EntityWitch.llllIIllIlllI[13];
                    "".length();
                    if (-" ".length() >= ((0x9D ^ 0x8F ^ (0x32 ^ 0x3F)) & (0x6 ^ 0xC ^ (0x7A ^ 0x6F) ^ -" ".length()))) {
                        return;
                    }
                }
                else if (lIlIlIIlIIIIIll(lIlIlIIIlllllIl(this.rand.nextFloat(), 0.05f)) && lIlIlIIlIIIIIll(lIlIlIIIlllllIl(this.getHealth(), this.getMaxHealth()))) {
                    lllllllllllllIlIlllIIIlllllIllII = EntityWitch.llllIIllIlllI[14];
                    "".length();
                    if (-" ".length() > ((135 + 150 - 262 + 168 ^ 145 + 40 - 151 + 113) & (0xEA ^ 0x9A ^ (0x11 ^ 0x4D) ^ -" ".length()))) {
                        return;
                    }
                }
                else if (lIlIlIIlIIIIIll(lIlIlIIIlllllIl(this.rand.nextFloat(), 0.25f)) && lIlIlIIlIIIIIIl(this.getAttackTarget()) && lIlIlIIIlllllll(this.isPotionActive(Potion.moveSpeed) ? 1 : 0) && lIlIlIIlIIIIlII(lIlIlIIIllllllI(this.getAttackTarget().getDistanceSqToEntity(this), 121.0))) {
                    lllllllllllllIlIlllIIIlllllIllII = EntityWitch.llllIIllIlllI[15];
                    "".length();
                    if (((0x2 ^ 0x43) & ~(0x66 ^ 0x27)) >= "  ".length()) {
                        return;
                    }
                }
                else if (lIlIlIIlIIIIIll(lIlIlIIIlllllIl(this.rand.nextFloat(), 0.25f)) && lIlIlIIlIIIIIIl(this.getAttackTarget()) && lIlIlIIIlllllll(this.isPotionActive(Potion.moveSpeed) ? 1 : 0) && lIlIlIIlIIIIlII(lIlIlIIIllllllI(this.getAttackTarget().getDistanceSqToEntity(this), 121.0))) {
                    lllllllllllllIlIlllIIIlllllIllII = EntityWitch.llllIIllIlllI[15];
                }
                if (lIlIlIIlIIIIlIl(lllllllllllllIlIlllIIIlllllIllII, EntityWitch.llllIIllIlllI[11])) {
                    this.setCurrentItemOrArmor(EntityWitch.llllIIllIlllI[0], new ItemStack(Items.potionitem, EntityWitch.llllIIllIlllI[1], lllllllllllllIlIlllIIIlllllIllII));
                    this.witchAttackTimer = this.getHeldItem().getMaxItemUseDuration();
                    this.setAggressive((boolean)(EntityWitch.llllIIllIlllI[1] != 0));
                    final IAttributeInstance lllllllllllllIlIlllIIIlllllIlIll = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
                    lllllllllllllIlIlllIIIlllllIlIll.removeModifier(EntityWitch.MODIFIER);
                    lllllllllllllIlIlllIIIlllllIlIll.applyModifier(EntityWitch.MODIFIER);
                }
            }
            if (lIlIlIIlIIIIIll(lIlIlIIIlllllIl(this.rand.nextFloat(), 7.5E-4f))) {
                this.worldObj.setEntityState(this, (byte)EntityWitch.llllIIllIlllI[16]);
            }
        }
        super.onLivingUpdate();
    }
}
