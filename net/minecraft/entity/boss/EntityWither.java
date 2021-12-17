// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.boss;

import java.util.Iterator;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.init.Blocks;
import net.minecraft.block.Block;
import java.util.List;
import net.minecraft.block.material.Material;
import com.google.common.base.Predicates;
import net.minecraft.util.EntitySelectors;
import net.minecraft.world.EnumDifficulty;
import java.util.Arrays;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.init.Items;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.potion.PotionEffect;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import com.google.common.base.Predicate;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.monster.EntityMob;

public class EntityWither extends EntityMob implements IBossDisplayData, IRangedAttackMob
{
    private /* synthetic */ float[] field_82217_f;
    private static final /* synthetic */ String[] lllIlIllllIlII;
    private static final /* synthetic */ Predicate<Entity> attackEntitySelector;
    private static final /* synthetic */ int[] lllIlIllllIlIl;
    private /* synthetic */ int blockBreakCounter;
    private /* synthetic */ float[] field_82218_g;
    private /* synthetic */ float[] field_82220_d;
    private /* synthetic */ float[] field_82221_e;
    private /* synthetic */ int[] field_82224_i;
    private /* synthetic */ int[] field_82223_h;
    
    private static boolean lIlIIIlllIlllIIl(final Object llllllllllllIlIllIlIIIIllllllllI) {
        return llllllllllllIlIllIlIIIIllllllllI != null;
    }
    
    @Override
    public void setInWeb() {
    }
    
    @Override
    public int getTotalArmorValue() {
        return EntityWither.lllIlIllllIlIl[13];
    }
    
    private static String lIlIIIlllIlIllll(final String llllllllllllIlIllIlIIIlIIIlIIIlI, final String llllllllllllIlIllIlIIIlIIIlIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIIlIIIlIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIIlIIIlIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlIIIlIIIlIIlII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlIIIlIIIlIIlII.init(EntityWither.lllIlIllllIlIl[0], llllllllllllIlIllIlIIIlIIIlIIlIl);
            return new String(llllllllllllIlIllIlIIIlIIIlIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIIlIIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIIlIIIlIIIll) {
            llllllllllllIlIllIlIIIlIIIlIIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIlIllIlIIIllIlllIIll) {
        super.readEntityFromNBT(llllllllllllIlIllIlIIIllIlllIIll);
        this.setInvulTime(llllllllllllIlIllIlIIIllIlllIIll.getInteger(EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[1]]));
    }
    
    private static int lIlIIIllllIIIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void addPotionEffect(final PotionEffect llllllllllllIlIllIlIIIlIIlllIIIl) {
    }
    
    private double func_82213_w(final int llllllllllllIlIllIlIIIlIllIllllI) {
        if (lIlIIIlllIllllll(llllllllllllIlIllIlIIIlIllIllllI)) {
            return this.posZ;
        }
        final float llllllllllllIlIllIlIIIlIlllIIIIl = (this.renderYawOffset + EntityWither.lllIlIllllIlIl[20] * (llllllllllllIlIllIlIIIlIllIllllI - EntityWither.lllIlIllllIlIl[1])) / 180.0f * 3.1415927f;
        final float llllllllllllIlIllIlIIIlIlllIIIII = MathHelper.sin(llllllllllllIlIllIlIIIlIlllIIIIl);
        return this.posZ + llllllllllllIlIllIlIIIlIlllIIIII * 1.3;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource llllllllllllIlIllIlIIIlIlIIlIIIl, final float llllllllllllIlIllIlIIIlIlIIIlIlI) {
        if (lIlIIIlllIllllIl(this.isEntityInvulnerable(llllllllllllIlIllIlIIIlIlIIlIIIl) ? 1 : 0)) {
            return EntityWither.lllIlIllllIlIl[2] != 0;
        }
        if (!lIlIIIllllIIIIII(llllllllllllIlIllIlIIIlIlIIlIIIl, DamageSource.drown) || !lIlIIIlllIllIlll((llllllllllllIlIllIlIIIlIlIIlIIIl.getEntity() instanceof EntityWither) ? 1 : 0)) {
            return EntityWither.lllIlIllllIlIl[2] != 0;
        }
        if (lIlIIIlllIlllIII(this.getInvulTime()) && lIlIIIllllIIIIII(llllllllllllIlIllIlIIIlIlIIlIIIl, DamageSource.outOfWorld)) {
            return EntityWither.lllIlIllllIlIl[2] != 0;
        }
        if (lIlIIIlllIllllIl(this.isArmored() ? 1 : 0)) {
            final Entity llllllllllllIlIllIlIIIlIlIIIllll = llllllllllllIlIllIlIIIlIlIIlIIIl.getSourceOfDamage();
            if (lIlIIIlllIllllIl((llllllllllllIlIllIlIIIlIlIIIllll instanceof EntityArrow) ? 1 : 0)) {
                return EntityWither.lllIlIllllIlIl[2] != 0;
            }
        }
        final Entity llllllllllllIlIllIlIIIlIlIIIlllI = llllllllllllIlIllIlIIIlIlIIlIIIl.getEntity();
        if (lIlIIIlllIlllIIl(llllllllllllIlIllIlIIIlIlIIIlllI) && lIlIIIlllIllIlll((llllllllllllIlIllIlIIIlIlIIIlllI instanceof EntityPlayer) ? 1 : 0) && lIlIIIlllIllllIl((llllllllllllIlIllIlIIIlIlIIIlllI instanceof EntityLivingBase) ? 1 : 0) && lIlIIIllllIIIIIl(((EntityLivingBase)llllllllllllIlIllIlIIIlIlIIIlllI).getCreatureAttribute(), this.getCreatureAttribute())) {
            return EntityWither.lllIlIllllIlIl[2] != 0;
        }
        if (lIlIIIlllIllllll(this.blockBreakCounter)) {
            this.blockBreakCounter = EntityWither.lllIlIllllIlIl[11];
        }
        int llllllllllllIlIllIlIIIlIlIIIllIl = EntityWither.lllIlIllllIlIl[2];
        "".length();
        if (-" ".length() > (0xBF ^ 0xBB)) {
            return ((0x51 ^ 0xB) & ~(0xE8 ^ 0xB2)) != 0x0;
        }
        while (!lIlIIIlllIllllII(llllllllllllIlIllIlIIIlIlIIIllIl, this.field_82224_i.length)) {
            final int[] field_82224_i = this.field_82224_i;
            final int n = llllllllllllIlIllIlIIIlIlIIIllIl;
            field_82224_i[n] += EntityWither.lllIlIllllIlIl[12];
            ++llllllllllllIlIllIlIIIlIlIIIllIl;
        }
        return super.attackEntityFrom(llllllllllllIlIllIlIIIlIlIIlIIIl, llllllllllllIlIllIlIIIlIlIIIlIlI);
    }
    
    public void func_82206_m() {
        this.setInvulTime(EntityWither.lllIlIllllIlIl[19]);
        this.setHealth(this.getMaxHealth() / 3.0f);
    }
    
    @Override
    protected String getLivingSound() {
        return EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[0]];
    }
    
    private static int lIlIIIllllIIIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void mountEntity(final Entity llllllllllllIlIllIlIIIlIIlIIIIll) {
        this.ridingEntity = null;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIlIllIlIIIllIllllIIl) {
        super.writeEntityToNBT(llllllllllllIlIllIlIIIllIllllIIl);
        llllllllllllIlIllIlIIIllIllllIIl.setInteger(EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[2]], this.getInvulTime());
    }
    
    private static String lIlIIIlllIlIlllI(String llllllllllllIlIllIlIIIlIIIllIIlI, final String llllllllllllIlIllIlIIIlIIIllIllI) {
        llllllllllllIlIllIlIIIlIIIllIIlI = new String(Base64.getDecoder().decode(llllllllllllIlIllIlIIIlIIIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlIIIlIIIllIlIl = new StringBuilder();
        final char[] llllllllllllIlIllIlIIIlIIIllIlII = llllllllllllIlIllIlIIIlIIIllIllI.toCharArray();
        int llllllllllllIlIllIlIIIlIIIllIIll = EntityWither.lllIlIllllIlIl[2];
        final double llllllllllllIlIllIlIIIlIIIlIllIl = (Object)llllllllllllIlIllIlIIIlIIIllIIlI.toCharArray();
        final Exception llllllllllllIlIllIlIIIlIIIlIllII = (Exception)llllllllllllIlIllIlIIIlIIIlIllIl.length;
        float llllllllllllIlIllIlIIIlIIIlIlIll = EntityWither.lllIlIllllIlIl[2];
        while (lIlIIIllllIIIIll((int)llllllllllllIlIllIlIIIlIIIlIlIll, (int)llllllllllllIlIllIlIIIlIIIlIllII)) {
            final char llllllllllllIlIllIlIIIlIIIlllIII = llllllllllllIlIllIlIIIlIIIlIllIl[llllllllllllIlIllIlIIIlIIIlIlIll];
            llllllllllllIlIllIlIIIlIIIllIlIl.append((char)(llllllllllllIlIllIlIIIlIIIlllIII ^ llllllllllllIlIllIlIIIlIIIllIlII[llllllllllllIlIllIlIIIlIIIllIIll % llllllllllllIlIllIlIIIlIIIllIlII.length]));
            "".length();
            ++llllllllllllIlIllIlIIIlIIIllIIll;
            ++llllllllllllIlIllIlIIIlIIIlIlIll;
            "".length();
            if (" ".length() > (0x9A ^ 0x9E)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlIIIlIIIllIlIl);
    }
    
    private static int lIlIIIlllIllIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int lIlIIIllllIIIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public int getWatchedTargetId(final int llllllllllllIlIllIlIIIlIIlIlIlIl) {
        return this.dataWatcher.getWatchableObjectInt(EntityWither.lllIlIllllIlIl[8] + llllllllllllIlIllIlIIIlIIlIlIlIl);
    }
    
    private static boolean lIlIIIllllIIIIll(final int llllllllllllIlIllIlIIIlIIIIIlIIl, final int llllllllllllIlIllIlIIIlIIIIIlIII) {
        return llllllllllllIlIllIlIIIlIIIIIlIIl < llllllllllllIlIllIlIIIlIIIIIlIII;
    }
    
    private static void lIlIIIlllIllIIII() {
        (lllIlIllllIlII = new String[EntityWither.lllIlIllllIlIl[6]])[EntityWither.lllIlIllllIlIl[2]] = lIlIIIlllIlIllIl("yxNRDTvMyUs=", "NLpwE");
        EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[1]] = lIlIIIlllIlIlllI("HwQuLSQ=", "VjXXH");
        EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[0]] = lIlIIIlllIlIllIl("MvcIlZXvgWF69kG2pOk+6w==", "RcINf");
        EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[12]] = lIlIIIlllIlIllIl("pungKEk9/SmhAcQHoCix8g==", "RjNWL");
        EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[13]] = lIlIIIlllIlIllIl("P1tnZ4JgBhjzHaJmvf222lJXV8gQgpWS", "whvjQ");
        EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[4]] = lIlIIIlllIlIllIl("NDdtC1GqCx2e8yKB1nMSnw==", "QOlOE");
        EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[5]] = lIlIIIlllIlIllll("3UXb9iLkSIfIIt0DR6ATyQ==", "gtxim");
    }
    
    @Override
    protected String getDeathSound() {
        return EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[13]];
    }
    
    private double func_82214_u(final int llllllllllllIlIllIlIIIlIllllIlII) {
        if (lIlIIIlllIllllll(llllllllllllIlIllIlIIIlIllllIlII)) {
            return this.posX;
        }
        final float llllllllllllIlIllIlIIIlIllllIIll = (this.renderYawOffset + EntityWither.lllIlIllllIlIl[20] * (llllllllllllIlIllIlIIIlIllllIlII - EntityWither.lllIlIllllIlIl[1])) / 180.0f * 3.1415927f;
        final float llllllllllllIlIllIlIIIlIllllIIlI = MathHelper.cos(llllllllllllIlIllIlIIIlIllllIIll);
        return this.posX + llllllllllllIlIllIlIIIlIllllIIlI * 1.3;
    }
    
    private static boolean lIlIIIllllIIIIIl(final Object llllllllllllIlIllIlIIIIllllllIll, final Object llllllllllllIlIllIlIIIIllllllIlI) {
        return llllllllllllIlIllIlIIIIllllllIll == llllllllllllIlIllIlIIIIllllllIlI;
    }
    
    @Override
    public int getBrightnessForRender(final float llllllllllllIlIllIlIIIlIIlllIllI) {
        return EntityWither.lllIlIllllIlIl[22];
    }
    
    @Override
    protected void dropFewItems(final boolean llllllllllllIlIllIlIIIlIlIIIIIlI, final int llllllllllllIlIllIlIIIlIlIIIIIIl) {
        final EntityItem llllllllllllIlIllIlIIIlIlIIIIIII = this.dropItem(Items.nether_star, EntityWither.lllIlIllllIlIl[1]);
        if (lIlIIIlllIlllIIl(llllllllllllIlIllIlIIIlIlIIIIIII)) {
            llllllllllllIlIllIlIIIlIlIIIIIII.setNoDespawn();
        }
        if (lIlIIIlllIllIlll(this.worldObj.isRemote ? 1 : 0)) {
            final long llllllllllllIlIllIlIIIlIIllllIll = (long)this.worldObj.getEntitiesWithinAABB((Class<? extends Entity>)EntityPlayer.class, this.getEntityBoundingBox().expand(50.0, 100.0, 50.0)).iterator();
            "".length();
            if (" ".length() <= ((0xDC ^ 0x87 ^ (0xF1 ^ 0xB0)) & (70 + 8 - 47 + 110 ^ 19 + 18 + 80 + 34 ^ -" ".length()))) {
                return;
            }
            while (!lIlIIIlllIllIlll(((Iterator)llllllllllllIlIllIlIIIlIIllllIll).hasNext() ? 1 : 0)) {
                final EntityPlayer llllllllllllIlIllIlIIIlIIlllllll = ((Iterator<EntityPlayer>)llllllllllllIlIllIlIIIlIIllllIll).next();
                llllllllllllIlIllIlIIIlIIlllllll.triggerAchievement(AchievementList.killWither);
            }
        }
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.6000000238418579);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0);
    }
    
    @Override
    public void fall(final float llllllllllllIlIllIlIIIlIIlllIlII, final float llllllllllllIlIllIlIIIlIIlllIIll) {
    }
    
    private static boolean lIlIIIlllIlllIlI(final int llllllllllllIlIllIlIIIIlllllIlII) {
        return llllllllllllIlIllIlIIIIlllllIlII >= 0;
    }
    
    private double func_82208_v(final int llllllllllllIlIllIlIIIlIlllIlIlI) {
        double n;
        if (lIlIIIlllIllllll(llllllllllllIlIllIlIIIlIlllIlIlI)) {
            n = this.posY + 3.0;
            "".length();
            if ((0x11 ^ 0x15) < (0xBE ^ 0xBA)) {
                return 0.0;
            }
        }
        else {
            n = this.posY + 2.2;
        }
        return n;
    }
    
    private void launchWitherSkullToCoords(final int llllllllllllIlIllIlIIIlIlIlIlIlI, final double llllllllllllIlIllIlIIIlIlIlIlIIl, final double llllllllllllIlIllIlIIIlIlIllIlIl, final double llllllllllllIlIllIlIIIlIlIllIlII, final boolean llllllllllllIlIllIlIIIlIlIllIIll) {
        this.worldObj.playAuxSFXAtEntity(null, EntityWither.lllIlIllllIlIl[21], new BlockPos(this), EntityWither.lllIlIllllIlIl[2]);
        final double llllllllllllIlIllIlIIIlIlIllIIlI = this.func_82214_u(llllllllllllIlIllIlIIIlIlIlIlIlI);
        final double llllllllllllIlIllIlIIIlIlIllIIIl = this.func_82208_v(llllllllllllIlIllIlIIIlIlIlIlIlI);
        final double llllllllllllIlIllIlIIIlIlIllIIII = this.func_82213_w(llllllllllllIlIllIlIIIlIlIlIlIlI);
        final double llllllllllllIlIllIlIIIlIlIlIllll = llllllllllllIlIllIlIIIlIlIlIlIIl - llllllllllllIlIllIlIIIlIlIllIIlI;
        final double llllllllllllIlIllIlIIIlIlIlIlllI = llllllllllllIlIllIlIIIlIlIllIlIl - llllllllllllIlIllIlIIIlIlIllIIIl;
        final double llllllllllllIlIllIlIIIlIlIlIllIl = llllllllllllIlIllIlIIIlIlIllIlII - llllllllllllIlIllIlIIIlIlIllIIII;
        final EntityWitherSkull llllllllllllIlIllIlIIIlIlIlIllII = new EntityWitherSkull(this.worldObj, this, llllllllllllIlIllIlIIIlIlIlIllll, llllllllllllIlIllIlIIIlIlIlIlllI, llllllllllllIlIllIlIIIlIlIlIllIl);
        if (lIlIIIlllIllllIl(llllllllllllIlIllIlIIIlIlIllIIll ? 1 : 0)) {
            llllllllllllIlIllIlIIIlIlIlIllII.setInvulnerable((boolean)(EntityWither.lllIlIllllIlIl[1] != 0));
        }
        llllllllllllIlIllIlIIIlIlIlIllII.posY = llllllllllllIlIllIlIIIlIlIllIIIl;
        llllllllllllIlIllIlIIIlIlIlIllII.posX = llllllllllllIlIllIlIIIlIlIllIIlI;
        llllllllllllIlIllIlIIIlIlIlIllII.posZ = llllllllllllIlIllIlIIIlIlIllIIII;
        this.worldObj.spawnEntityInWorld(llllllllllllIlIllIlIIIlIlIlIllII);
        "".length();
    }
    
    public int getInvulTime() {
        return this.dataWatcher.getWatchableObjectInt(EntityWither.lllIlIllllIlIl[11]);
    }
    
    private static int lIlIIIlllIllIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEAD;
    }
    
    public float func_82210_r(final int llllllllllllIlIllIlIIIlIIllIIlII) {
        return this.field_82220_d[llllllllllllIlIllIlIIIlIIllIIlII];
    }
    
    private static boolean lIlIIIlllIllllII(final int llllllllllllIlIllIlIIIlIIIIIllIl, final int llllllllllllIlIllIlIIIlIIIIIllII) {
        return llllllllllllIlIllIlIIIlIIIIIllIl >= llllllllllllIlIllIlIIIlIIIIIllII;
    }
    
    private static String lIlIIIlllIlIllIl(final String llllllllllllIlIllIlIIIlIIIIlIIll, final String llllllllllllIlIllIlIIIlIIIIlIlII) {
        try {
            final SecretKeySpec llllllllllllIlIllIlIIIlIIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIIlIIIIlIlII.getBytes(StandardCharsets.UTF_8)), EntityWither.lllIlIllllIlIl[23]), "DES");
            final Cipher llllllllllllIlIllIlIIIlIIIIlIlll = Cipher.getInstance("DES");
            llllllllllllIlIllIlIIIlIIIIlIlll.init(EntityWither.lllIlIllllIlIl[0], llllllllllllIlIllIlIIIlIIIIllIII);
            return new String(llllllllllllIlIllIlIIIlIIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIIlIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlIIIlIIIIlIllI) {
            llllllllllllIlIllIlIIIlIIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIlllIlllIll(final int llllllllllllIlIllIlIIIIlllllIIlI) {
        return llllllllllllIlIllIlIIIIlllllIIlI < 0;
    }
    
    public void setInvulTime(final int llllllllllllIlIllIlIIIlIIlIllIIl) {
        this.dataWatcher.updateObject(EntityWither.lllIlIllllIlIl[11], llllllllllllIlIllIlIIIlIIlIllIIl);
    }
    
    private static boolean lIlIIIlllIlllIII(final int llllllllllllIlIllIlIIIIllllIlllI) {
        return llllllllllllIlIllIlIIIIllllIlllI > 0;
    }
    
    private static void lIlIIIlllIllIlII() {
        (lllIlIllllIlIl = new int[24])[0] = "  ".length();
        EntityWither.lllIlIllllIlIl[1] = " ".length();
        EntityWither.lllIlIllllIlIl[2] = ((0x6D ^ 0x71 ^ (0x26 ^ 0x35)) & (100 + 147 - 128 + 31 ^ 123 + 113 - 171 + 88 ^ -" ".length()));
        EntityWither.lllIlIllllIlIl[3] = (7 + 129 - 23 + 23 ^ 62 + 28 - 62 + 132);
        EntityWither.lllIlIllllIlIl[4] = (83 + 3 - 46 + 146 ^ 183 + 87 - 234 + 155);
        EntityWither.lllIlIllllIlIl[5] = (0x25 ^ 0x23);
        EntityWither.lllIlIllllIlIl[6] = (0x3C ^ 0x3B);
        EntityWither.lllIlIllllIlIl[7] = (0x25 ^ 0x17);
        EntityWither.lllIlIllllIlIl[8] = (0x2F ^ 0x3F ^ " ".length());
        EntityWither.lllIlIllllIlIl[9] = (0x5F ^ 0x4A ^ (0x29 ^ 0x2E));
        EntityWither.lllIlIllllIlIl[10] = (171 + 63 - 163 + 108 ^ 139 + 75 - 142 + 88);
        EntityWither.lllIlIllllIlIl[11] = (0xB5 ^ 0xA1);
        EntityWither.lllIlIllllIlIl[12] = "   ".length();
        EntityWither.lllIlIllllIlIl[13] = (0x4B ^ 0x4F);
        EntityWither.lllIlIllllIlIl[14] = (0xFFFF8FF7 & 0x73FD);
        EntityWither.lllIlIllllIlIl[15] = (0x15 ^ 0x1F);
        EntityWither.lllIlIllllIlIl[16] = (0x11 ^ 0x1E);
        EntityWither.lllIlIllllIlIl[17] = -" ".length();
        EntityWither.lllIlIllllIlIl[18] = (-(0xFFFFCC2F & 0x3BD1) & (0xFFFFDBF5 & 0x2FFE));
        EntityWither.lllIlIllllIlIl[19] = 179 + 51 - 201 + 191;
        EntityWither.lllIlIllllIlIl[20] = 56 + 119 - 29 + 34;
        EntityWither.lllIlIllllIlIl[21] = (-(0xFFFFECB9 & 0x7F47) & (0xFFFFEFFE & 0x7FF7));
        EntityWither.lllIlIllllIlIl[22] = (0xFFFFBAF7 & 0xF045F8);
        EntityWither.lllIlIllllIlIl[23] = (0x0 ^ 0x8);
    }
    
    private static boolean lIlIIIllllIIIIlI(final int llllllllllllIlIllIlIIIlIIIIIIlIl, final int llllllllllllIlIllIlIIIlIIIIIIlII) {
        return llllllllllllIlIllIlIIIlIIIIIIlIl > llllllllllllIlIllIlIIIlIIIIIIlII;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[12]];
    }
    
    @Override
    public void attackEntityWithRangedAttack(final EntityLivingBase llllllllllllIlIllIlIIIlIlIIllIll, final float llllllllllllIlIllIlIIIlIlIIllIlI) {
        this.launchWitherSkullToEntity(EntityWither.lllIlIllllIlIl[2], llllllllllllIlIllIlIIIlIlIIllIll);
    }
    
    @Override
    protected void updateAITasks() {
        if (lIlIIIlllIlllIII(this.getInvulTime())) {
            final int llllllllllllIlIllIlIIIllIIlIlIII = this.getInvulTime() - EntityWither.lllIlIllllIlIl[1];
            if (lIlIIIlllIllllll(llllllllllllIlIllIlIIIllIIlIlIII)) {
                this.worldObj.newExplosion(this, this.posX, this.posY + this.getEyeHeight(), this.posZ, 7.0f, (boolean)(EntityWither.lllIlIllllIlIl[2] != 0), this.worldObj.getGameRules().getBoolean(EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[4]]));
                "".length();
                this.worldObj.playBroadcastSound(EntityWither.lllIlIllllIlIl[14], new BlockPos(this), EntityWither.lllIlIllllIlIl[2]);
            }
            this.setInvulTime(llllllllllllIlIllIlIIIllIIlIlIII);
            if (lIlIIIlllIllIlll(this.ticksExisted % EntityWither.lllIlIllllIlIl[15])) {
                this.heal(10.0f);
                "".length();
                if (((9 + 210 - 49 + 67 ^ 156 + 108 - 179 + 101) & (0x43 ^ 0x7F ^ (0x52 ^ 0x39) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
        }
        else {
            super.updateAITasks();
            int llllllllllllIlIllIlIIIllIIlIIlll = EntityWither.lllIlIllllIlIl[1];
            "".length();
            if (((0xEA ^ 0xB0 ^ (0xAE ^ 0xBF)) & (0x48 ^ 0x16 ^ (0x36 ^ 0x23) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIlIIIlllIllllII(llllllllllllIlIllIlIIIllIIlIIlll, EntityWither.lllIlIllllIlIl[12])) {
                if (lIlIIIlllIllllII(this.ticksExisted, this.field_82223_h[llllllllllllIlIllIlIIIllIIlIIlll - EntityWither.lllIlIllllIlIl[1]])) {
                    this.field_82223_h[llllllllllllIlIllIlIIIllIIlIIlll - EntityWither.lllIlIllllIlIl[1]] = this.ticksExisted + EntityWither.lllIlIllllIlIl[15] + this.rand.nextInt(EntityWither.lllIlIllllIlIl[15]);
                    if (!lIlIIIllllIIIIII(this.worldObj.getDifficulty(), EnumDifficulty.NORMAL) || lIlIIIllllIIIIIl(this.worldObj.getDifficulty(), EnumDifficulty.HARD)) {
                        final int llllllllllllIlIllIlIIIllIIlIIllI = llllllllllllIlIllIlIIIllIIlIIlll - EntityWither.lllIlIllllIlIl[1];
                        final int llllllllllllIlIllIlIIIllIIlIIlIl = this.field_82224_i[llllllllllllIlIllIlIIIllIIlIIlll - EntityWither.lllIlIllllIlIl[1]];
                        this.field_82224_i[llllllllllllIlIllIlIIIllIIlIIllI] = this.field_82224_i[llllllllllllIlIllIlIIIllIIlIIlll - EntityWither.lllIlIllllIlIl[1]] + EntityWither.lllIlIllllIlIl[1];
                        if (lIlIIIllllIIIIlI(llllllllllllIlIllIlIIIllIIlIIlIl, EntityWither.lllIlIllllIlIl[16])) {
                            final float llllllllllllIlIllIlIIIllIIlIIlII = 10.0f;
                            final float llllllllllllIlIllIlIIIllIIlIIIll = 5.0f;
                            final double llllllllllllIlIllIlIIIllIIlIIIlI = MathHelper.getRandomDoubleInRange(this.rand, this.posX - llllllllllllIlIllIlIIIllIIlIIlII, this.posX + llllllllllllIlIllIlIIIllIIlIIlII);
                            final double llllllllllllIlIllIlIIIllIIlIIIIl = MathHelper.getRandomDoubleInRange(this.rand, this.posY - llllllllllllIlIllIlIIIllIIlIIIll, this.posY + llllllllllllIlIllIlIIIllIIlIIIll);
                            final double llllllllllllIlIllIlIIIllIIlIIIII = MathHelper.getRandomDoubleInRange(this.rand, this.posZ - llllllllllllIlIllIlIIIllIIlIIlII, this.posZ + llllllllllllIlIllIlIIIllIIlIIlII);
                            this.launchWitherSkullToCoords(llllllllllllIlIllIlIIIllIIlIIlll + EntityWither.lllIlIllllIlIl[1], llllllllllllIlIllIlIIIllIIlIIIlI, llllllllllllIlIllIlIIIllIIlIIIIl, llllllllllllIlIllIlIIIllIIlIIIII, (boolean)(EntityWither.lllIlIllllIlIl[1] != 0));
                            this.field_82224_i[llllllllllllIlIllIlIIIllIIlIIlll - EntityWither.lllIlIllllIlIl[1]] = EntityWither.lllIlIllllIlIl[2];
                        }
                    }
                    final int llllllllllllIlIllIlIIIllIIIlllll = this.getWatchedTargetId(llllllllllllIlIllIlIIIllIIlIIlll);
                    if (lIlIIIlllIlllIII(llllllllllllIlIllIlIIIllIIIlllll)) {
                        final Entity llllllllllllIlIllIlIIIllIIIllllI = this.worldObj.getEntityByID(llllllllllllIlIllIlIIIllIIIlllll);
                        if (lIlIIIlllIlllIIl(llllllllllllIlIllIlIIIllIIIllllI) && lIlIIIlllIllllIl(llllllllllllIlIllIlIIIllIIIllllI.isEntityAlive() ? 1 : 0) && lIlIIIlllIllllll(lIlIIIlllIlllllI(this.getDistanceSqToEntity(llllllllllllIlIllIlIIIllIIIllllI), 900.0)) && lIlIIIlllIllllIl(this.canEntityBeSeen(llllllllllllIlIllIlIIIllIIIllllI) ? 1 : 0)) {
                            if (lIlIIIlllIllllIl((llllllllllllIlIllIlIIIllIIIllllI instanceof EntityPlayer) ? 1 : 0) && lIlIIIlllIllllIl(((EntityPlayer)llllllllllllIlIllIlIIIllIIIllllI).capabilities.disableDamage ? 1 : 0)) {
                                this.updateWatchedTargetId(llllllllllllIlIllIlIIIllIIlIIlll, EntityWither.lllIlIllllIlIl[2]);
                                "".length();
                                if ("   ".length() != "   ".length()) {
                                    return;
                                }
                            }
                            else {
                                this.launchWitherSkullToEntity(llllllllllllIlIllIlIIIllIIlIIlll + EntityWither.lllIlIllllIlIl[1], (EntityLivingBase)llllllllllllIlIllIlIIIllIIIllllI);
                                this.field_82223_h[llllllllllllIlIllIlIIIllIIlIIlll - EntityWither.lllIlIllllIlIl[1]] = this.ticksExisted + EntityWither.lllIlIllllIlIl[3] + this.rand.nextInt(EntityWither.lllIlIllllIlIl[11]);
                                this.field_82224_i[llllllllllllIlIllIlIIIllIIlIIlll - EntityWither.lllIlIllllIlIl[1]] = EntityWither.lllIlIllllIlIl[2];
                                "".length();
                                if ("  ".length() == -" ".length()) {
                                    return;
                                }
                            }
                        }
                        else {
                            this.updateWatchedTargetId(llllllllllllIlIllIlIIIllIIlIIlll, EntityWither.lllIlIllllIlIl[2]);
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                    }
                    else {
                        final List<EntityLivingBase> llllllllllllIlIllIlIIIllIIIlllIl = this.worldObj.getEntitiesWithinAABB((Class<? extends EntityLivingBase>)EntityLivingBase.class, this.getEntityBoundingBox().expand(20.0, 8.0, 20.0), (com.google.common.base.Predicate<? super EntityLivingBase>)Predicates.and((Predicate)EntityWither.attackEntitySelector, (Predicate)EntitySelectors.NOT_SPECTATING));
                        int llllllllllllIlIllIlIIIllIIIlllII = EntityWither.lllIlIllllIlIl[2];
                        "".length();
                        if (-"   ".length() > 0) {
                            return;
                        }
                        while (lIlIIIllllIIIIll(llllllllllllIlIllIlIIIllIIIlllII, EntityWither.lllIlIllllIlIl[15]) && !lIlIIIlllIllllIl(llllllllllllIlIllIlIIIllIIIlllIl.isEmpty() ? 1 : 0)) {
                            final EntityLivingBase llllllllllllIlIllIlIIIllIIIllIll = llllllllllllIlIllIlIIIllIIIlllIl.get(this.rand.nextInt(llllllllllllIlIllIlIIIllIIIlllIl.size()));
                            if (lIlIIIllllIIIIII(llllllllllllIlIllIlIIIllIIIllIll, this) && lIlIIIlllIllllIl(llllllllllllIlIllIlIIIllIIIllIll.isEntityAlive() ? 1 : 0) && lIlIIIlllIllllIl(this.canEntityBeSeen(llllllllllllIlIllIlIIIllIIIllIll) ? 1 : 0)) {
                                if (lIlIIIlllIllllIl((llllllllllllIlIllIlIIIllIIIllIll instanceof EntityPlayer) ? 1 : 0)) {
                                    if (!lIlIIIlllIllIlll(((EntityPlayer)llllllllllllIlIllIlIIIllIIIllIll).capabilities.disableDamage ? 1 : 0)) {
                                        break;
                                    }
                                    this.updateWatchedTargetId(llllllllllllIlIllIlIIIllIIlIIlll, llllllllllllIlIllIlIIIllIIIllIll.getEntityId());
                                    "".length();
                                    if (" ".length() <= 0) {
                                        return;
                                    }
                                    break;
                                }
                                else {
                                    this.updateWatchedTargetId(llllllllllllIlIllIlIIIllIIlIIlll, llllllllllllIlIllIlIIIllIIIllIll.getEntityId());
                                    "".length();
                                    if (((0x56 ^ 0x7D) & ~(0x2A ^ 0x1)) > 0) {
                                        return;
                                    }
                                    break;
                                }
                            }
                            else {
                                llllllllllllIlIllIlIIIllIIIlllIl.remove(llllllllllllIlIllIlIIIllIIIllIll);
                                "".length();
                                ++llllllllllllIlIllIlIIIllIIIlllII;
                            }
                        }
                    }
                }
                ++llllllllllllIlIllIlIIIllIIlIIlll;
            }
            if (lIlIIIlllIlllIIl(this.getAttackTarget())) {
                this.updateWatchedTargetId(EntityWither.lllIlIllllIlIl[2], this.getAttackTarget().getEntityId());
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
            }
            else {
                this.updateWatchedTargetId(EntityWither.lllIlIllllIlIl[2], EntityWither.lllIlIllllIlIl[2]);
            }
            if (lIlIIIlllIlllIII(this.blockBreakCounter)) {
                this.blockBreakCounter -= EntityWither.lllIlIllllIlIl[1];
                if (lIlIIIlllIllIlll(this.blockBreakCounter) && lIlIIIlllIllllIl(this.worldObj.getGameRules().getBoolean(EntityWither.lllIlIllllIlII[EntityWither.lllIlIllllIlIl[5]]) ? 1 : 0)) {
                    final int llllllllllllIlIllIlIIIllIIIllIlI = MathHelper.floor_double(this.posY);
                    final int llllllllllllIlIllIlIIIllIIIllIIl = MathHelper.floor_double(this.posX);
                    final int llllllllllllIlIllIlIIIllIIIllIII = MathHelper.floor_double(this.posZ);
                    boolean llllllllllllIlIllIlIIIllIIIlIlll = EntityWither.lllIlIllllIlIl[2] != 0;
                    int llllllllllllIlIllIlIIIllIIIlIllI = EntityWither.lllIlIllllIlIl[17];
                    "".length();
                    if (-"   ".length() > 0) {
                        return;
                    }
                    while (!lIlIIIllllIIIIlI(llllllllllllIlIllIlIIIllIIIlIllI, EntityWither.lllIlIllllIlIl[1])) {
                        int llllllllllllIlIllIlIIIllIIIlIlIl = EntityWither.lllIlIllllIlIl[17];
                        "".length();
                        if (((0xEA ^ 0xAE) & ~(0xCD ^ 0x89)) < 0) {
                            return;
                        }
                        while (!lIlIIIllllIIIIlI(llllllllllllIlIllIlIIIllIIIlIlIl, EntityWither.lllIlIllllIlIl[1])) {
                            int llllllllllllIlIllIlIIIllIIIlIlII = EntityWither.lllIlIllllIlIl[2];
                            "".length();
                            if (null != null) {
                                return;
                            }
                            while (!lIlIIIllllIIIIlI(llllllllllllIlIllIlIIIllIIIlIlII, EntityWither.lllIlIllllIlIl[12])) {
                                final int llllllllllllIlIllIlIIIllIIIlIIll = llllllllllllIlIllIlIIIllIIIllIIl + llllllllllllIlIllIlIIIllIIIlIllI;
                                final int llllllllllllIlIllIlIIIllIIIlIIlI = llllllllllllIlIllIlIIIllIIIllIlI + llllllllllllIlIllIlIIIllIIIlIlII;
                                final int llllllllllllIlIllIlIIIllIIIlIIIl = llllllllllllIlIllIlIIIllIIIllIII + llllllllllllIlIllIlIIIllIIIlIlIl;
                                final BlockPos llllllllllllIlIllIlIIIllIIIlIIII = new BlockPos(llllllllllllIlIllIlIIIllIIIlIIll, llllllllllllIlIllIlIIIllIIIlIIlI, llllllllllllIlIllIlIIIllIIIlIIIl);
                                final Block llllllllllllIlIllIlIIIllIIIIllll = this.worldObj.getBlockState(llllllllllllIlIllIlIIIllIIIlIIII).getBlock();
                                if (lIlIIIllllIIIIII(llllllllllllIlIllIlIIIllIIIIllll.getMaterial(), Material.air) && lIlIIIlllIllllIl(func_181033_a(llllllllllllIlIllIlIIIllIIIIllll) ? 1 : 0)) {
                                    int n;
                                    if (lIlIIIlllIllIlll(this.worldObj.destroyBlock(llllllllllllIlIllIlIIIllIIIlIIII, (boolean)(EntityWither.lllIlIllllIlIl[1] != 0)) ? 1 : 0) && lIlIIIlllIllIlll(llllllllllllIlIllIlIIIllIIIlIlll ? 1 : 0)) {
                                        n = EntityWither.lllIlIllllIlIl[2];
                                        "".length();
                                        if ("  ".length() >= "   ".length()) {
                                            return;
                                        }
                                    }
                                    else {
                                        n = EntityWither.lllIlIllllIlIl[1];
                                    }
                                    llllllllllllIlIllIlIIIllIIIlIlll = (n != 0);
                                }
                                ++llllllllllllIlIllIlIIIllIIIlIlII;
                            }
                            ++llllllllllllIlIllIlIIIllIIIlIlIl;
                        }
                        ++llllllllllllIlIllIlIIIllIIIlIllI;
                    }
                    if (lIlIIIlllIllllIl(llllllllllllIlIllIlIIIllIIIlIlll ? 1 : 0)) {
                        this.worldObj.playAuxSFXAtEntity(null, EntityWither.lllIlIllllIlIl[18], new BlockPos(this), EntityWither.lllIlIllllIlIl[2]);
                    }
                }
            }
            if (lIlIIIlllIllIlll(this.ticksExisted % EntityWither.lllIlIllllIlIl[11])) {
                this.heal(1.0f);
            }
        }
    }
    
    private static boolean lIlIIIllllIIIIII(final Object llllllllllllIlIllIlIIIlIIIIIIIIl, final Object llllllllllllIlIllIlIIIlIIIIIIIII) {
        return llllllllllllIlIllIlIIIlIIIIIIIIl != llllllllllllIlIllIlIIIlIIIIIIIII;
    }
    
    public float func_82207_a(final int llllllllllllIlIllIlIIIlIIllIlIlI) {
        return this.field_82221_e[llllllllllllIlIllIlIIIlIIllIlIlI];
    }
    
    private static boolean lIlIIIlllIllIlll(final int llllllllllllIlIllIlIIIIlllllIllI) {
        return llllllllllllIlIllIlIIIIlllllIllI == 0;
    }
    
    private static int lIlIIIllllIIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public static boolean func_181033_a(final Block llllllllllllIlIllIlIIIllIIIIIIII) {
        if (lIlIIIllllIIIIII(llllllllllllIlIllIlIIIllIIIIIIII, Blocks.bedrock) && lIlIIIllllIIIIII(llllllllllllIlIllIlIIIllIIIIIIII, Blocks.end_portal) && lIlIIIllllIIIIII(llllllllllllIlIllIlIIIllIIIIIIII, Blocks.end_portal_frame) && lIlIIIllllIIIIII(llllllllllllIlIllIlIIIllIIIIIIII, Blocks.command_block) && lIlIIIllllIIIIII(llllllllllllIlIllIlIIIllIIIIIIII, Blocks.barrier)) {
            return EntityWither.lllIlIllllIlIl[1] != 0;
        }
        return EntityWither.lllIlIllllIlIl[2] != 0;
    }
    
    @Override
    protected void despawnEntity() {
        this.entityAge = EntityWither.lllIlIllllIlIl[2];
    }
    
    public boolean isArmored() {
        if (lIlIIIlllIllllll(lIlIIIllllIIIlll(this.getHealth(), this.getMaxHealth() / 2.0f))) {
            return EntityWither.lllIlIllllIlIl[1] != 0;
        }
        return EntityWither.lllIlIllllIlIl[2] != 0;
    }
    
    static {
        lIlIIIlllIllIlII();
        lIlIIIlllIllIIII();
        attackEntitySelector = (Predicate)new Predicate<Entity>() {
            private static final /* synthetic */ int[] lIIIIIIlIllIII;
            
            private static void lIllIlIIIIlIIII() {
                (lIIIIIIlIllIII = new int[2])[0] = " ".length();
                EntityWither$1.lIIIIIIlIllIII[1] = ((0x3E ^ 0x7E) & ~(0x41 ^ 0x1));
            }
            
            public boolean apply(final Entity lllllllllllllIlIlIIIIllIlIIIIlII) {
                if (lIllIlIIIIlIIIl((lllllllllllllIlIlIIIIllIlIIIIlII instanceof EntityLivingBase) ? 1 : 0) && lIllIlIIIIlIIlI(((EntityLivingBase)lllllllllllllIlIlIIIIllIlIIIIlII).getCreatureAttribute(), EnumCreatureAttribute.UNDEAD)) {
                    return EntityWither$1.lIIIIIIlIllIII[0] != 0;
                }
                return EntityWither$1.lIIIIIIlIllIII[1] != 0;
            }
            
            static {
                lIllIlIIIIlIIII();
            }
            
            private static boolean lIllIlIIIIlIIlI(final Object lllllllllllllIlIlIIIIllIIlllllIl, final Object lllllllllllllIlIlIIIIllIIlllllII) {
                return lllllllllllllIlIlIIIIllIIlllllIl != lllllllllllllIlIlIIIIllIIlllllII;
            }
            
            private static boolean lIllIlIIIIlIIIl(final int lllllllllllllIlIlIIIIllIIllllIlI) {
                return lllllllllllllIlIlIIIIllIIllllIlI != 0;
            }
        };
    }
    
    @Override
    public void onLivingUpdate() {
        this.motionY *= 0.6000000238418579;
        if (lIlIIIlllIllIlll(this.worldObj.isRemote ? 1 : 0) && lIlIIIlllIlllIII(this.getWatchedTargetId(EntityWither.lllIlIllllIlIl[2]))) {
            final Entity llllllllllllIlIllIlIIIllIlIlllIl = this.worldObj.getEntityByID(this.getWatchedTargetId(EntityWither.lllIlIllllIlIl[2]));
            if (lIlIIIlllIlllIIl(llllllllllllIlIllIlIIIllIlIlllIl)) {
                if (!lIlIIIlllIlllIlI(lIlIIIlllIllIlIl(this.posY, llllllllllllIlIllIlIIIllIlIlllIl.posY)) || (lIlIIIlllIllIlll(this.isArmored() ? 1 : 0) && lIlIIIlllIlllIll(lIlIIIlllIllIlIl(this.posY, llllllllllllIlIllIlIIIllIlIlllIl.posY + 5.0)))) {
                    if (lIlIIIlllIlllIll(lIlIIIlllIllIlIl(this.motionY, 0.0))) {
                        this.motionY = 0.0;
                    }
                    this.motionY += (0.5 - this.motionY) * 0.6000000238418579;
                }
                final double llllllllllllIlIllIlIIIllIlIlllII = llllllllllllIlIllIlIIIllIlIlllIl.posX - this.posX;
                final double llllllllllllIlIllIlIIIllIlIllIll = llllllllllllIlIllIlIIIllIlIlllIl.posZ - this.posZ;
                final double llllllllllllIlIllIlIIIllIlIllIlI = llllllllllllIlIllIlIIIllIlIlllII * llllllllllllIlIllIlIIIllIlIlllII + llllllllllllIlIllIlIIIllIlIllIll * llllllllllllIlIllIlIIIllIlIllIll;
                if (lIlIIIlllIlllIII(lIlIIIlllIllIllI(llllllllllllIlIllIlIIIllIlIllIlI, 9.0))) {
                    final double llllllllllllIlIllIlIIIllIlIllIIl = MathHelper.sqrt_double(llllllllllllIlIllIlIIIllIlIllIlI);
                    this.motionX += (llllllllllllIlIllIlIIIllIlIlllII / llllllllllllIlIllIlIIIllIlIllIIl * 0.5 - this.motionX) * 0.6000000238418579;
                    this.motionZ += (llllllllllllIlIllIlIIIllIlIllIll / llllllllllllIlIllIlIIIllIlIllIIl * 0.5 - this.motionZ) * 0.6000000238418579;
                }
            }
        }
        if (lIlIIIlllIlllIII(lIlIIIlllIllIllI(this.motionX * this.motionX + this.motionZ * this.motionZ, 0.05000000074505806))) {
            this.rotationYaw = (float)MathHelper.func_181159_b(this.motionZ, this.motionX) * 57.295776f - 90.0f;
        }
        super.onLivingUpdate();
        int llllllllllllIlIllIlIIIllIlIllIII = EntityWither.lllIlIllllIlIl[2];
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!lIlIIIlllIllllII(llllllllllllIlIllIlIIIllIlIllIII, EntityWither.lllIlIllllIlIl[0])) {
            this.field_82218_g[llllllllllllIlIllIlIIIllIlIllIII] = this.field_82221_e[llllllllllllIlIllIlIIIllIlIllIII];
            this.field_82217_f[llllllllllllIlIllIlIIIllIlIllIII] = this.field_82220_d[llllllllllllIlIllIlIIIllIlIllIII];
            ++llllllllllllIlIllIlIIIllIlIllIII;
        }
        int llllllllllllIlIllIlIIIllIlIlIlll = EntityWither.lllIlIllllIlIl[2];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!lIlIIIlllIllllII(llllllllllllIlIllIlIIIllIlIlIlll, EntityWither.lllIlIllllIlIl[0])) {
            final int llllllllllllIlIllIlIIIllIlIlIllI = this.getWatchedTargetId(llllllllllllIlIllIlIIIllIlIlIlll + EntityWither.lllIlIllllIlIl[1]);
            Entity llllllllllllIlIllIlIIIllIlIlIlIl = null;
            if (lIlIIIlllIlllIII(llllllllllllIlIllIlIIIllIlIlIllI)) {
                llllllllllllIlIllIlIIIllIlIlIlIl = this.worldObj.getEntityByID(llllllllllllIlIllIlIIIllIlIlIllI);
            }
            if (lIlIIIlllIlllIIl(llllllllllllIlIllIlIIIllIlIlIlIl)) {
                final double llllllllllllIlIllIlIIIllIlIlIlII = this.func_82214_u(llllllllllllIlIllIlIIIllIlIlIlll + EntityWither.lllIlIllllIlIl[1]);
                final double llllllllllllIlIllIlIIIllIlIlIIll = this.func_82208_v(llllllllllllIlIllIlIIIllIlIlIlll + EntityWither.lllIlIllllIlIl[1]);
                final double llllllllllllIlIllIlIIIllIlIlIIlI = this.func_82213_w(llllllllllllIlIllIlIIIllIlIlIlll + EntityWither.lllIlIllllIlIl[1]);
                final double llllllllllllIlIllIlIIIllIlIlIIIl = llllllllllllIlIllIlIIIllIlIlIlIl.posX - llllllllllllIlIllIlIIIllIlIlIlII;
                final double llllllllllllIlIllIlIIIllIlIlIIII = llllllllllllIlIllIlIIIllIlIlIlIl.posY + llllllllllllIlIllIlIIIllIlIlIlIl.getEyeHeight() - llllllllllllIlIllIlIIIllIlIlIIll;
                final double llllllllllllIlIllIlIIIllIlIIllll = llllllllllllIlIllIlIIIllIlIlIlIl.posZ - llllllllllllIlIllIlIIIllIlIlIIlI;
                final double llllllllllllIlIllIlIIIllIlIIlllI = MathHelper.sqrt_double(llllllllllllIlIllIlIIIllIlIlIIIl * llllllllllllIlIllIlIIIllIlIlIIIl + llllllllllllIlIllIlIIIllIlIIllll * llllllllllllIlIllIlIIIllIlIIllll);
                final float llllllllllllIlIllIlIIIllIlIIllIl = (float)(MathHelper.func_181159_b(llllllllllllIlIllIlIIIllIlIIllll, llllllllllllIlIllIlIIIllIlIlIIIl) * 180.0 / 3.141592653589793) - 90.0f;
                final float llllllllllllIlIllIlIIIllIlIIllII = (float)(-(MathHelper.func_181159_b(llllllllllllIlIllIlIIIllIlIlIIII, llllllllllllIlIllIlIIIllIlIIlllI) * 180.0 / 3.141592653589793));
                this.field_82220_d[llllllllllllIlIllIlIIIllIlIlIlll] = this.func_82204_b(this.field_82220_d[llllllllllllIlIllIlIIIllIlIlIlll], llllllllllllIlIllIlIIIllIlIIllII, 40.0f);
                this.field_82221_e[llllllllllllIlIllIlIIIllIlIlIlll] = this.func_82204_b(this.field_82221_e[llllllllllllIlIllIlIIIllIlIlIlll], llllllllllllIlIllIlIIIllIlIIllIl, 10.0f);
                "".length();
                if ("  ".length() == "   ".length()) {
                    return;
                }
            }
            else {
                this.field_82221_e[llllllllllllIlIllIlIIIllIlIlIlll] = this.func_82204_b(this.field_82221_e[llllllllllllIlIllIlIIIllIlIlIlll], this.renderYawOffset, 10.0f);
            }
            ++llllllllllllIlIllIlIIIllIlIlIlll;
        }
        final boolean llllllllllllIlIllIlIIIllIlIIlIll = this.isArmored();
        int llllllllllllIlIllIlIIIllIlIIlIlI = EntityWither.lllIlIllllIlIl[2];
        "".length();
        if ("   ".length() != "   ".length()) {
            return;
        }
        while (!lIlIIIlllIllllII(llllllllllllIlIllIlIIIllIlIIlIlI, EntityWither.lllIlIllllIlIl[12])) {
            final double llllllllllllIlIllIlIIIllIlIIlIIl = this.func_82214_u(llllllllllllIlIllIlIIIllIlIIlIlI);
            final double llllllllllllIlIllIlIIIllIlIIlIII = this.func_82208_v(llllllllllllIlIllIlIIIllIlIIlIlI);
            final double llllllllllllIlIllIlIIIllIlIIIlll = this.func_82213_w(llllllllllllIlIllIlIIIllIlIIlIlI);
            this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, llllllllllllIlIllIlIIIllIlIIlIIl + this.rand.nextGaussian() * 0.30000001192092896, llllllllllllIlIllIlIIIllIlIIlIII + this.rand.nextGaussian() * 0.30000001192092896, llllllllllllIlIllIlIIIllIlIIIlll + this.rand.nextGaussian() * 0.30000001192092896, 0.0, 0.0, 0.0, new int[EntityWither.lllIlIllllIlIl[2]]);
            if (lIlIIIlllIllllIl(llllllllllllIlIllIlIIIllIlIIlIll ? 1 : 0) && lIlIIIlllIllIlll(this.worldObj.rand.nextInt(EntityWither.lllIlIllllIlIl[13]))) {
                this.worldObj.spawnParticle(EnumParticleTypes.SPELL_MOB, llllllllllllIlIllIlIIIllIlIIlIIl + this.rand.nextGaussian() * 0.30000001192092896, llllllllllllIlIllIlIIIllIlIIlIII + this.rand.nextGaussian() * 0.30000001192092896, llllllllllllIlIllIlIIIllIlIIIlll + this.rand.nextGaussian() * 0.30000001192092896, 0.699999988079071, 0.699999988079071, 0.5, new int[EntityWither.lllIlIllllIlIl[2]]);
            }
            ++llllllllllllIlIllIlIIIllIlIIlIlI;
        }
        if (lIlIIIlllIlllIII(this.getInvulTime())) {
            int llllllllllllIlIllIlIIIllIlIIIllI = EntityWither.lllIlIllllIlIl[2];
            "".length();
            if ((0x1A ^ 0x70 ^ (0x62 ^ 0xD)) <= 0) {
                return;
            }
            while (!lIlIIIlllIllllII(llllllllllllIlIllIlIIIllIlIIIllI, EntityWither.lllIlIllllIlIl[12])) {
                this.worldObj.spawnParticle(EnumParticleTypes.SPELL_MOB, this.posX + this.rand.nextGaussian() * 1.0, this.posY + this.rand.nextFloat() * 3.3f, this.posZ + this.rand.nextGaussian() * 1.0, 0.699999988079071, 0.699999988079071, 0.8999999761581421, new int[EntityWither.lllIlIllllIlIl[2]]);
                ++llllllllllllIlIllIlIIIllIlIIIllI;
            }
        }
    }
    
    private static boolean lIlIIIlllIllllll(final int llllllllllllIlIllIlIIIIlllllIIII) {
        return llllllllllllIlIllIlIIIIlllllIIII <= 0;
    }
    
    public void updateWatchedTargetId(final int llllllllllllIlIllIlIIIlIIlIIlIll, final int llllllllllllIlIllIlIIIlIIlIIllIl) {
        this.dataWatcher.updateObject(EntityWither.lllIlIllllIlIl[8] + llllllllllllIlIllIlIIIlIIlIIlIll, llllllllllllIlIllIlIIIlIIlIIllIl);
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityWither.lllIlIllllIlIl[8], new Integer(EntityWither.lllIlIllllIlIl[2]));
        this.dataWatcher.addObject(EntityWither.lllIlIllllIlIl[9], new Integer(EntityWither.lllIlIllllIlIl[2]));
        this.dataWatcher.addObject(EntityWither.lllIlIllllIlIl[10], new Integer(EntityWither.lllIlIllllIlIl[2]));
        this.dataWatcher.addObject(EntityWither.lllIlIllllIlIl[11], new Integer(EntityWither.lllIlIllllIlIl[2]));
    }
    
    private static int lIlIIIlllIlllllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public EntityWither(final World llllllllllllIlIllIlIIIlllIIIIIII) {
        super(llllllllllllIlIllIlIIIlllIIIIIII);
        this.field_82220_d = new float[EntityWither.lllIlIllllIlIl[0]];
        this.field_82221_e = new float[EntityWither.lllIlIllllIlIl[0]];
        this.field_82217_f = new float[EntityWither.lllIlIllllIlIl[0]];
        this.field_82218_g = new float[EntityWither.lllIlIllllIlIl[0]];
        this.field_82223_h = new int[EntityWither.lllIlIllllIlIl[0]];
        this.field_82224_i = new int[EntityWither.lllIlIllllIlIl[0]];
        this.setHealth(this.getMaxHealth());
        this.setSize(0.9f, 3.5f);
        this.isImmuneToFire = (EntityWither.lllIlIllllIlIl[1] != 0);
        ((PathNavigateGround)this.getNavigator()).setCanSwim((boolean)(EntityWither.lllIlIllllIlIl[1] != 0));
        this.tasks.addTask(EntityWither.lllIlIllllIlIl[2], new EntityAISwimming(this));
        this.tasks.addTask(EntityWither.lllIlIllllIlIl[0], new EntityAIArrowAttack(this, 1.0, EntityWither.lllIlIllllIlIl[3], 20.0f));
        this.tasks.addTask(EntityWither.lllIlIllllIlIl[4], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityWither.lllIlIllllIlIl[5], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntityWither.lllIlIllllIlIl[6], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntityWither.lllIlIllllIlIl[1], new EntityAIHurtByTarget(this, (boolean)(EntityWither.lllIlIllllIlIl[2] != 0), new Class[EntityWither.lllIlIllllIlIl[2]]));
        this.targetTasks.addTask(EntityWither.lllIlIllllIlIl[0], new EntityAINearestAttackableTarget<Object>(this, EntityLiving.class, EntityWither.lllIlIllllIlIl[2], (boolean)(EntityWither.lllIlIllllIlIl[2] != 0), (boolean)(EntityWither.lllIlIllllIlIl[2] != 0), EntityWither.attackEntitySelector));
        this.experienceValue = EntityWither.lllIlIllllIlIl[7];
    }
    
    private static boolean lIlIIIlllIllllIl(final int llllllllllllIlIllIlIIIIllllllIII) {
        return llllllllllllIlIllIlIIIIllllllIII != 0;
    }
    
    private void launchWitherSkullToEntity(final int llllllllllllIlIllIlIIIlIllIIIlll, final EntityLivingBase llllllllllllIlIllIlIIIlIllIIIllI) {
        final double posX = llllllllllllIlIllIlIIIlIllIIIllI.posX;
        final double llllllllllllIlIllIlIIIlIlIllIlIl = llllllllllllIlIllIlIIIlIllIIIllI.posY + llllllllllllIlIllIlIIIlIllIIIllI.getEyeHeight() * 0.5;
        final double posZ = llllllllllllIlIllIlIIIlIllIIIllI.posZ;
        int llllllllllllIlIllIlIIIlIlIllIIll;
        if (lIlIIIlllIllIlll(llllllllllllIlIllIlIIIlIllIIIlll) && lIlIIIlllIlllIll(lIlIIIllllIIIllI(this.rand.nextFloat(), 0.001f))) {
            llllllllllllIlIllIlIIIlIlIllIIll = EntityWither.lllIlIllllIlIl[1];
            "".length();
            if ((18 + 8 + 58 + 70 ^ 94 + 1 - 17 + 81) <= 0) {
                return;
            }
        }
        else {
            llllllllllllIlIllIlIIIlIlIllIIll = EntityWither.lllIlIllllIlIl[2];
        }
        this.launchWitherSkullToCoords(llllllllllllIlIllIlIIIlIllIIIlll, posX, llllllllllllIlIllIlIIIlIlIllIlIl, posZ, (boolean)(llllllllllllIlIllIlIIIlIlIllIIll != 0));
    }
    
    private float func_82204_b(final float llllllllllllIlIllIlIIIlIllIlIllI, final float llllllllllllIlIllIlIIIlIllIlIlIl, final float llllllllllllIlIllIlIIIlIllIlIlII) {
        float llllllllllllIlIllIlIIIlIllIlIIll = MathHelper.wrapAngleTo180_float(llllllllllllIlIllIlIIIlIllIlIlIl - llllllllllllIlIllIlIIIlIllIlIllI);
        if (lIlIIIlllIlllIII(lIlIIIllllIIIlII(llllllllllllIlIllIlIIIlIllIlIIll, llllllllllllIlIllIlIIIlIllIlIlII))) {
            llllllllllllIlIllIlIIIlIllIlIIll = llllllllllllIlIllIlIIIlIllIlIlII;
        }
        if (lIlIIIlllIlllIll(lIlIIIllllIIIlIl(llllllllllllIlIllIlIIIlIllIlIIll, -llllllllllllIlIllIlIIIlIllIlIlII))) {
            llllllllllllIlIllIlIIIlIllIlIIll = -llllllllllllIlIllIlIIIlIllIlIlII;
        }
        return llllllllllllIlIllIlIIIlIllIlIllI + llllllllllllIlIllIlIIIlIllIlIIll;
    }
}
