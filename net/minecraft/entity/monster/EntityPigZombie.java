// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.init.Items;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import java.util.UUID;

public class EntityPigZombie extends EntityZombie
{
    private /* synthetic */ int randomSoundDelay;
    private static final /* synthetic */ int[] lIIIlIIIllllll;
    private static final /* synthetic */ UUID ATTACK_SPEED_BOOST_MODIFIER_UUID;
    private static final /* synthetic */ AttributeModifier ATTACK_SPEED_BOOST_MODIFIER;
    private static final /* synthetic */ String[] lIIIlIIIllllIl;
    private /* synthetic */ UUID angerTargetUUID;
    private /* synthetic */ int angerLevel;
    
    private static String lIlllllIllllIlI(final String lllllllllllllIlIIIlIlIllllIIlIII, final String lllllllllllllIlIIIlIlIllllIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIlIllllIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlIllllIIIlll.getBytes(StandardCharsets.UTF_8)), EntityPigZombie.lIIIlIIIllllll[8]), "DES");
            final Cipher lllllllllllllIlIIIlIlIllllIIllII = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIlIllllIIllII.init(EntityPigZombie.lIIIlIIIllllll[2], lllllllllllllIlIIIlIlIllllIIllIl);
            return new String(lllllllllllllIlIIIlIlIllllIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlIllllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIlIllllIIlIll) {
            lllllllllllllIlIIIlIlIllllIIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected String getLivingSound() {
        return EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[11]];
    }
    
    private static boolean lIllllllIIlIIIl(final Object lllllllllllllIlIIIlIlIlllIIlIlIl, final Object lllllllllllllIlIIIlIlIlllIIlIlII) {
        return lllllllllllllIlIIIlIlIlllIIlIlIl != lllllllllllllIlIIIlIlIlllIIlIlII;
    }
    
    @Override
    protected void addRandomDrop() {
        this.dropItem(Items.gold_ingot, EntityPigZombie.lIIIlIIIllllll[1]);
        "".length();
    }
    
    @Override
    protected String getHurtSound() {
        return EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[12]];
    }
    
    private static String lIlllllIlllllII(String lllllllllllllIlIIIlIlIlllIlIlIII, final String lllllllllllllIlIIIlIlIlllIlIllII) {
        lllllllllllllIlIIIlIlIlllIlIlIII = new String(Base64.getDecoder().decode(lllllllllllllIlIIIlIlIlllIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIlIlllIlIlIll = new StringBuilder();
        final char[] lllllllllllllIlIIIlIlIlllIlIlIlI = lllllllllllllIlIIIlIlIlllIlIllII.toCharArray();
        int lllllllllllllIlIIIlIlIlllIlIlIIl = EntityPigZombie.lIIIlIIIllllll[0];
        final float lllllllllllllIlIIIlIlIlllIlIIIll = (Object)lllllllllllllIlIIIlIlIlllIlIlIII.toCharArray();
        final byte lllllllllllllIlIIIlIlIlllIlIIIlI = (byte)lllllllllllllIlIIIlIlIlllIlIIIll.length;
        boolean lllllllllllllIlIIIlIlIlllIlIIIIl = EntityPigZombie.lIIIlIIIllllll[0] != 0;
        while (lIllllllIIlIlII(lllllllllllllIlIIIlIlIlllIlIIIIl ? 1 : 0, lllllllllllllIlIIIlIlIlllIlIIIlI)) {
            final char lllllllllllllIlIIIlIlIlllIlIlllI = lllllllllllllIlIIIlIlIlllIlIIIll[lllllllllllllIlIIIlIlIlllIlIIIIl];
            lllllllllllllIlIIIlIlIlllIlIlIll.append((char)(lllllllllllllIlIIIlIlIlllIlIlllI ^ lllllllllllllIlIIIlIlIlllIlIlIlI[lllllllllllllIlIIIlIlIlllIlIlIIl % lllllllllllllIlIIIlIlIlllIlIlIlI.length]));
            "".length();
            ++lllllllllllllIlIIIlIlIlllIlIlIIl;
            ++lllllllllllllIlIIIlIlIlllIlIIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIlIlllIlIlIll);
    }
    
    private static boolean lIllllllIIlIlII(final int lllllllllllllIlIIIlIlIlllIIllIIl, final int lllllllllllllIlIIIlIlIlllIIllIII) {
        return lllllllllllllIlIIIlIlIlllIIllIIl < lllllllllllllIlIIIlIlIlllIIllIII;
    }
    
    @Override
    protected void setEquipmentBasedOnDifficulty(final DifficultyInstance lllllllllllllIlIIIlIlIlllllIIIII) {
        this.setCurrentItemOrArmor(EntityPigZombie.lIIIlIIIllllll[0], new ItemStack(Items.golden_sword));
    }
    
    @Override
    protected String getDeathSound() {
        return EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[13]];
    }
    
    private static boolean lIllllllIIIllll(final int lllllllllllllIlIIIlIlIlllIIIlIlI) {
        return lllllllllllllIlIIIlIlIlllIIIlIlI > 0;
    }
    
    private static boolean lIllllllIIlIIII(final Object lllllllllllllIlIIIlIlIlllIIlIIII) {
        return lllllllllllllIlIIIlIlIlllIIlIIII == null;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIlIIIlIllIIIIIlIlII) {
        super.readEntityFromNBT(lllllllllllllIlIIIlIllIIIIIlIlII);
        this.angerLevel = lllllllllllllIlIIIlIllIIIIIlIlII.getShort(EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[7]]);
        final String lllllllllllllIlIIIlIllIIIIIlIIll = lllllllllllllIlIIIlIllIIIIIlIlII.getString(EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[8]]);
        if (lIllllllIIIllll(lllllllllllllIlIIIlIllIIIIIlIIll.length())) {
            this.angerTargetUUID = UUID.fromString(lllllllllllllIlIIIlIllIIIIIlIIll);
            final EntityPlayer lllllllllllllIlIIIlIllIIIIIlIIlI = this.worldObj.getPlayerEntityByUUID(this.angerTargetUUID);
            this.setRevengeTarget(lllllllllllllIlIIIlIllIIIIIlIIlI);
            if (lIllllllIIIIlll(lllllllllllllIlIIIlIllIIIIIlIIlI)) {
                this.attackingPlayer = lllllllllllllIlIIIlIllIIIIIlIIlI;
                this.recentlyHit = this.getRevengeTimer();
            }
        }
    }
    
    @Override
    protected void applyEntityAI() {
        this.targetTasks.addTask(EntityPigZombie.lIIIlIIIllllll[1], new AIHurtByAggressor(this));
        this.targetTasks.addTask(EntityPigZombie.lIIIlIIIllllll[2], new AITargetAggressor(this));
    }
    
    private void becomeAngryAt(final Entity lllllllllllllIlIIIlIlIllllllllII) {
        this.angerLevel = EntityPigZombie.lIIIlIIIllllll[9] + this.rand.nextInt(EntityPigZombie.lIIIlIIIllllll[9]);
        this.randomSoundDelay = this.rand.nextInt(EntityPigZombie.lIIIlIIIllllll[10]);
        if (lIllllllIIIlIIl((lllllllllllllIlIIIlIlIllllllllII instanceof EntityLivingBase) ? 1 : 0)) {
            this.setRevengeTarget((EntityLivingBase)lllllllllllllIlIIIlIlIllllllllII);
        }
    }
    
    @Override
    protected void updateAITasks() {
        final IAttributeInstance lllllllllllllIlIIIlIllIIIIlIlllI = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
        if (lIllllllIIIlIIl(this.isAngry() ? 1 : 0)) {
            if (lIllllllIIIllII(this.isChild() ? 1 : 0) && lIllllllIIIllII(lllllllllllllIlIIIlIllIIIIlIlllI.hasModifier(EntityPigZombie.ATTACK_SPEED_BOOST_MODIFIER) ? 1 : 0)) {
                lllllllllllllIlIIIlIllIIIIlIlllI.applyModifier(EntityPigZombie.ATTACK_SPEED_BOOST_MODIFIER);
            }
            this.angerLevel -= EntityPigZombie.lIIIlIIIllllll[1];
            "".length();
            if (((0x4 ^ 0xB) & ~(0x1F ^ 0x10)) > 0) {
                return;
            }
        }
        else if (lIllllllIIIlIIl(lllllllllllllIlIIIlIllIIIIlIlllI.hasModifier(EntityPigZombie.ATTACK_SPEED_BOOST_MODIFIER) ? 1 : 0)) {
            lllllllllllllIlIIIlIllIIIIlIlllI.removeModifier(EntityPigZombie.ATTACK_SPEED_BOOST_MODIFIER);
        }
        if (lIllllllIIIllll(this.randomSoundDelay)) {
            final int n = this.randomSoundDelay - EntityPigZombie.lIIIlIIIllllll[1];
            this.randomSoundDelay = n;
            if (lIllllllIIIllII(n)) {
                this.playSound(EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[2]], this.getSoundVolume() * 2.0f, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f) * 1.8f);
            }
        }
        if (lIllllllIIIllll(this.angerLevel) && lIllllllIIIIlll(this.angerTargetUUID) && lIllllllIIlIIII(this.getAITarget())) {
            final EntityPlayer lllllllllllllIlIIIlIllIIIIlIllIl = this.worldObj.getPlayerEntityByUUID(this.angerTargetUUID);
            this.setRevengeTarget(lllllllllllllIlIIIlIllIIIIlIllIl);
            this.attackingPlayer = lllllllllllllIlIIIlIllIIIIlIllIl;
            this.recentlyHit = this.getRevengeTimer();
        }
        super.updateAITasks();
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(EntityPigZombie.reinforcementChance).setBaseValue(0.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0);
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance lllllllllllllIlIIIlIlIllllIlIlll, final IEntityLivingData lllllllllllllIlIIIlIlIllllIllIIl) {
        super.onInitialSpawn(lllllllllllllIlIIIlIlIllllIlIlll, lllllllllllllIlIIIlIlIllllIllIIl);
        "".length();
        this.setVillager((boolean)(EntityPigZombie.lIIIlIIIllllll[0] != 0));
        return lllllllllllllIlIIIlIlIllllIllIIl;
    }
    
    private static boolean lIllllllIIlIIll(final int lllllllllllllIlIIIlIlIlllIIlllIl, final int lllllllllllllIlIIIlIlIlllIIlllII) {
        return lllllllllllllIlIIIlIlIlllIIlllIl >= lllllllllllllIlIIIlIlIlllIIlllII;
    }
    
    public boolean isAngry() {
        if (lIllllllIIIllll(this.angerLevel)) {
            return EntityPigZombie.lIIIlIIIllllll[1] != 0;
        }
        return EntityPigZombie.lIIIlIIIllllll[0] != 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIlIIIlIllIIIIIIlIII, final float lllllllllllllIlIIIlIllIIIIIIIIll) {
        if (lIllllllIIIlIIl(this.isEntityInvulnerable(lllllllllllllIlIIIlIllIIIIIIlIII) ? 1 : 0)) {
            return EntityPigZombie.lIIIlIIIllllll[0] != 0;
        }
        final Entity lllllllllllllIlIIIlIllIIIIIIIllI = lllllllllllllIlIIIlIllIIIIIIlIII.getEntity();
        if (lIllllllIIIlIIl((lllllllllllllIlIIIlIllIIIIIIIllI instanceof EntityPlayer) ? 1 : 0)) {
            this.becomeAngryAt(lllllllllllllIlIIIlIllIIIIIIIllI);
        }
        return super.attackEntityFrom(lllllllllllllIlIIIlIllIIIIIIlIII, lllllllllllllIlIIIlIllIIIIIIIIll);
    }
    
    private static boolean lIllllllIIIlIIl(final int lllllllllllllIlIIIlIlIlllIIIlllI) {
        return lllllllllllllIlIIIlIlIlllIIIlllI != 0;
    }
    
    @Override
    public void setRevengeTarget(final EntityLivingBase lllllllllllllIlIIIlIllIIIlIIllll) {
        super.setRevengeTarget(lllllllllllllIlIIIlIllIIIlIIllll);
        if (lIllllllIIIIlll(lllllllllllllIlIIIlIllIIIlIIllll)) {
            this.angerTargetUUID = lllllllllllllIlIIIlIllIIIlIIllll.getUniqueID();
        }
    }
    
    private static void lIllllllIIIIlIl() {
        (lIIIlIIIllllll = new int[15])[0] = ((0x9B ^ 0xA4) & ~(0x9F ^ 0xA0));
        EntityPigZombie.lIIIlIIIllllll[1] = " ".length();
        EntityPigZombie.lIIIlIIIllllll[2] = "  ".length();
        EntityPigZombie.lIIIlIIIllllll[3] = "   ".length();
        EntityPigZombie.lIIIlIIIllllll[4] = (0x6A ^ 0x6E);
        EntityPigZombie.lIIIlIIIllllll[5] = (2 + 177 - 153 + 156 ^ 141 + 164 - 275 + 149);
        EntityPigZombie.lIIIlIIIllllll[6] = (0x7E ^ 0x78);
        EntityPigZombie.lIIIlIIIllllll[7] = (0x8D ^ 0x87 ^ (0x4E ^ 0x43));
        EntityPigZombie.lIIIlIIIllllll[8] = (85 + 115 - 168 + 152 ^ 93 + 79 - 20 + 24);
        EntityPigZombie.lIIIlIIIllllll[9] = (-(0xFFFFDF4F & 0x66B7) & (0xFFFFEFFE & 0x5797));
        EntityPigZombie.lIIIlIIIllllll[10] = (0x13 ^ 0x3F ^ (0xA8 ^ 0xAC));
        EntityPigZombie.lIIIlIIIllllll[11] = (0x6F ^ 0x66);
        EntityPigZombie.lIIIlIIIllllll[12] = (167 + 177 - 283 + 145 ^ 31 + 1 - 21 + 185);
        EntityPigZombie.lIIIlIIIllllll[13] = (0x6C ^ 0x67);
        EntityPigZombie.lIIIlIIIllllll[14] = (0x6 ^ 0xA);
    }
    
    @Override
    public boolean isNotColliding() {
        if (lIllllllIIIlIIl(this.worldObj.checkNoEntityCollision(this.getEntityBoundingBox(), this) ? 1 : 0) && lIllllllIIIlIIl(this.worldObj.getCollidingBoundingBoxes(this, this.getEntityBoundingBox()).isEmpty() ? 1 : 0) && lIllllllIIIllII(this.worldObj.isAnyLiquid(this.getEntityBoundingBox()) ? 1 : 0)) {
            return EntityPigZombie.lIIIlIIIllllll[1] != 0;
        }
        return EntityPigZombie.lIIIlIIIllllll[0] != 0;
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
    }
    
    private static void lIllllllIIIIlII() {
        (lIIIlIIIllllIl = new String[EntityPigZombie.lIIIlIIIllllll[14]])[EntityPigZombie.lIIIlIIIllllll[0]] = lIlllllIllllIlI("+xfOqpNvS8wQpEuZ8U+JW6dhvlRKiGb5oPwrWBngz7PtWGghLCwsiA==", "VdxuZ");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[1]] = lIlllllIllllIlI("fG8yq+mVjR/oIADHxx9TneSR2EJxNvLi", "cCuwK");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[2]] = lIlllllIllllIll("grKUSBd1S95n+cQErUIIb9JOOSwXdV0H", "CSrkn");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[3]] = lIlllllIllllIlI("UFTOQWCpMyU=", "KQtTE");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[4]] = lIlllllIllllIll("AvYkS6PuSC0=", "HIUhQ");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[5]] = lIlllllIllllIlI("myphSxR0zho=", "OImbe");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[6]] = lIlllllIllllIlI("ZG2qSuTgAhI=", "VhWIW");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[7]] = lIlllllIlllllII("Jg09HTk=", "gcZxK");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[8]] = lIlllllIllllIll("IqacFtBgTNg=", "XNFio");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[11]] = lIlllllIlllllII("BQQKegwHBgo9ExgCD3oMGAIP", "hkhTv");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[12]] = lIlllllIllllIll("ggGNsw8xXmit1uan5gsEDL1yVF7xe63W", "SuNJy");
        EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[13]] = lIlllllIllllIlI("X2lO8IXpcRlMDmIMTMBJNUuIHfpfGlt/", "cmTBk");
    }
    
    @Override
    public boolean interact(final EntityPlayer lllllllllllllIlIIIlIlIlllllIIllI) {
        return EntityPigZombie.lIIIlIIIllllll[0] != 0;
    }
    
    private static String lIlllllIllllIll(final String lllllllllllllIlIIIlIlIlllIlllIll, final String lllllllllllllIlIIIlIlIlllIlllIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIlIllllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlIlllIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIlIlIlllIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIlIlIlllIllllll.init(EntityPigZombie.lIIIlIIIllllll[2], lllllllllllllIlIIIlIlIllllIIIIII);
            return new String(lllllllllllllIlIIIlIlIlllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlIlllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIlIlllIlllllI) {
            lllllllllllllIlIIIlIlIlllIlllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIlIIIlIlIllllllIIII, final int lllllllllllllIlIIIlIlIlllllIllll) {
        int lllllllllllllIlIIIlIlIlllllIlllI = this.rand.nextInt(EntityPigZombie.lIIIlIIIllllll[2] + lllllllllllllIlIIIlIlIlllllIllll);
        int lllllllllllllIlIIIlIlIlllllIllIl = EntityPigZombie.lIIIlIIIllllll[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIllllllIIlIIll(lllllllllllllIlIIIlIlIlllllIllIl, lllllllllllllIlIIIlIlIlllllIlllI)) {
            this.dropItem(Items.rotten_flesh, EntityPigZombie.lIIIlIIIllllll[1]);
            "".length();
            ++lllllllllllllIlIIIlIlIlllllIllIl;
        }
        lllllllllllllIlIIIlIlIlllllIlllI = this.rand.nextInt(EntityPigZombie.lIIIlIIIllllll[2] + lllllllllllllIlIIIlIlIlllllIllll);
        int lllllllllllllIlIIIlIlIlllllIllII = EntityPigZombie.lIIIlIIIllllll[0];
        "".length();
        if (-" ".length() >= " ".length()) {
            return;
        }
        while (!lIllllllIIlIIll(lllllllllllllIlIIIlIlIlllllIllII, lllllllllllllIlIIIlIlIlllllIlllI)) {
            this.dropItem(Items.gold_nugget, EntityPigZombie.lIIIlIIIllllll[1]);
            "".length();
            ++lllllllllllllIlIIIlIlIlllllIllII;
        }
    }
    
    private static boolean lIllllllIIIllII(final int lllllllllllllIlIIIlIlIlllIIIllII) {
        return lllllllllllllIlIIIlIlIlllIIIllII == 0;
    }
    
    public EntityPigZombie(final World lllllllllllllIlIIIlIllIIIllIIIlI) {
        super(lllllllllllllIlIIIlIllIIIllIIIlI);
        this.isImmuneToFire = (EntityPigZombie.lIIIlIIIllllll[1] != 0);
    }
    
    static {
        lIllllllIIIIlIl();
        lIllllllIIIIlII();
        ATTACK_SPEED_BOOST_MODIFIER_UUID = UUID.fromString(EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[0]]);
        ATTACK_SPEED_BOOST_MODIFIER = new AttributeModifier(EntityPigZombie.ATTACK_SPEED_BOOST_MODIFIER_UUID, EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[1]], 0.05, EntityPigZombie.lIIIlIIIllllll[0]).setSaved((boolean)(EntityPigZombie.lIIIlIIIllllll[0] != 0));
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if (lIllllllIIlIIIl(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL)) {
            return EntityPigZombie.lIIIlIIIllllll[1] != 0;
        }
        return EntityPigZombie.lIIIlIIIllllll[0] != 0;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIlIIIlIllIIIIIllIlI) {
        super.writeEntityToNBT(lllllllllllllIlIIIlIllIIIIIllIlI);
        lllllllllllllIlIIIlIllIIIIIllIlI.setShort(EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[3]], (short)this.angerLevel);
        if (lIllllllIIIIlll(this.angerTargetUUID)) {
            lllllllllllllIlIIIlIllIIIIIllIlI.setString(EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[4]], this.angerTargetUUID.toString());
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIlIIIlIllIIIIIllIlI.setString(EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[5]], EntityPigZombie.lIIIlIIIllllIl[EntityPigZombie.lIIIlIIIllllll[6]]);
        }
    }
    
    private static boolean lIllllllIIIIlll(final Object lllllllllllllIlIIIlIlIlllIIlIIlI) {
        return lllllllllllllIlIIIlIlIlllIIlIIlI != null;
    }
    
    static class AIHurtByAggressor extends EntityAIHurtByTarget
    {
        private static final /* synthetic */ int[] llIlIllllllIII;
        
        static {
            lIIlIllIIIIlIlII();
        }
        
        public AIHurtByAggressor(final EntityPigZombie llllllllllllIllIlIIIlIIlIllIllII) {
            super(llllllllllllIllIlIIIlIIlIllIllII, (boolean)(AIHurtByAggressor.llIlIllllllIII[0] != 0), new Class[AIHurtByAggressor.llIlIllllllIII[1]]);
        }
        
        private static boolean lIIlIllIIIIlIlIl(final int llllllllllllIllIlIIIlIIlIlIlllll) {
            return llllllllllllIllIlIIIlIIlIlIlllll != 0;
        }
        
        @Override
        protected void setEntityAttackTarget(final EntityCreature llllllllllllIllIlIIIlIIlIllIIlIl, final EntityLivingBase llllllllllllIllIlIIIlIIlIllIIlII) {
            super.setEntityAttackTarget(llllllllllllIllIlIIIlIIlIllIIlIl, llllllllllllIllIlIIIlIIlIllIIlII);
            if (lIIlIllIIIIlIlIl((llllllllllllIllIlIIIlIIlIllIIlIl instanceof EntityPigZombie) ? 1 : 0)) {
                ((EntityPigZombie)llllllllllllIllIlIIIlIIlIllIIlIl).becomeAngryAt(llllllllllllIllIlIIIlIIlIllIIlII);
            }
        }
        
        private static void lIIlIllIIIIlIlII() {
            (llIlIllllllIII = new int[2])[0] = " ".length();
            AIHurtByAggressor.llIlIllllllIII[1] = ((97 + 176 - 90 + 1 ^ 113 + 100 - 51 + 7) & (0x30 ^ 0x4B ^ (0xF ^ 0x65) ^ -" ".length()));
        }
    }
    
    static class AITargetAggressor extends EntityAINearestAttackableTarget<EntityPlayer>
    {
        private static final /* synthetic */ int[] llIIIIlIlIlIIl;
        
        private static void lIIIIllllllIIIIl() {
            (llIIIIlIlIlIIl = new int[2])[0] = " ".length();
            AITargetAggressor.llIIIIlIlIlIIl[1] = ((0x30 ^ 0x1C ^ (0xB ^ 0x34)) & (0xBD ^ 0x9E ^ (0xA8 ^ 0x98) ^ -" ".length()));
        }
        
        static {
            lIIIIllllllIIIIl();
        }
        
        public AITargetAggressor(final EntityPigZombie llllllllllllIlllIllIllllIlIIIIIl) {
            super(llllllllllllIlllIllIllllIlIIIIIl, EntityPlayer.class, (boolean)(AITargetAggressor.llIIIIlIlIlIIl[0] != 0));
        }
        
        private static boolean lIIIIllllllIIIlI(final int llllllllllllIlllIllIllllIIlllIlI) {
            return llllllllllllIlllIllIllllIIlllIlI != 0;
        }
        
        @Override
        public boolean shouldExecute() {
            if (lIIIIllllllIIIlI(((EntityPigZombie)this.taskOwner).isAngry() ? 1 : 0) && lIIIIllllllIIIlI(super.shouldExecute() ? 1 : 0)) {
                return AITargetAggressor.llIIIIlIlIlIIl[0] != 0;
            }
            return AITargetAggressor.llIIIIlIlIlIIl[1] != 0;
        }
    }
}
