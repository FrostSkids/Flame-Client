// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.DataWatcher;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.ai.EntityAICreeperSwell;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.world.World;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.SharedMonsterAttributes;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EntityCreeper extends EntityMob
{
    private /* synthetic */ int lastActiveTime;
    private static final /* synthetic */ String[] lIIIlIIIIIlIll;
    private /* synthetic */ int explosionRadius;
    private static final /* synthetic */ int[] lIIIlIIIIIllII;
    private /* synthetic */ int fuseTime;
    private /* synthetic */ int timeSinceIgnited;
    private /* synthetic */ int field_175494_bm;
    
    private static String lIllllIllIlIllI(String lllllllllllllIlIIIllIlIlIllIllll, final String lllllllllllllIlIIIllIlIlIllIlllI) {
        lllllllllllllIlIIIllIlIlIllIllll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIllIlIlIllIllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIllIlIlIlllIIlI = new StringBuilder();
        final char[] lllllllllllllIlIIIllIlIlIlllIIIl = lllllllllllllIlIIIllIlIlIllIlllI.toCharArray();
        int lllllllllllllIlIIIllIlIlIlllIIII = EntityCreeper.lIIIlIIIIIllII[2];
        final float lllllllllllllIlIIIllIlIlIllIlIlI = (Object)lllllllllllllIlIIIllIlIlIllIllll.toCharArray();
        final boolean lllllllllllllIlIIIllIlIlIllIlIIl = lllllllllllllIlIIIllIlIlIllIlIlI.length != 0;
        int lllllllllllllIlIIIllIlIlIllIlIII = EntityCreeper.lIIIlIIIIIllII[2];
        while (lIllllIlllIIlII(lllllllllllllIlIIIllIlIlIllIlIII, lllllllllllllIlIIIllIlIlIllIlIIl ? 1 : 0)) {
            final char lllllllllllllIlIIIllIlIlIlllIlIl = lllllllllllllIlIIIllIlIlIllIlIlI[lllllllllllllIlIIIllIlIlIllIlIII];
            lllllllllllllIlIIIllIlIlIlllIIlI.append((char)(lllllllllllllIlIIIllIlIlIlllIlIl ^ lllllllllllllIlIIIllIlIlIlllIIIl[lllllllllllllIlIIIllIlIlIlllIIII % lllllllllllllIlIIIllIlIlIlllIIIl.length]));
            "".length();
            ++lllllllllllllIlIIIllIlIlIlllIIII;
            ++lllllllllllllIlIIIllIlIlIllIlIII;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIllIlIlIlllIIlI);
    }
    
    private static boolean lIllllIllIlllII(final int lllllllllllllIlIIIllIlIlIlIIlIIl) {
        return lllllllllllllIlIIIllIlIlIlIIlIIl != 0;
    }
    
    private static boolean lIllllIllIllllI(final int lllllllllllllIlIIIllIlIlIlIIIlll) {
        return lllllllllllllIlIIIllIlIlIlIIIlll == 0;
    }
    
    public boolean hasIgnited() {
        if (lIllllIllIlllII(this.dataWatcher.getWatchableObjectByte(EntityCreeper.lIIIlIIIIIllII[11]))) {
            return EntityCreeper.lIIIlIIIIIllII[3] != 0;
        }
        return EntityCreeper.lIIIlIIIIIllII[2] != 0;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[17]];
    }
    
    private static void lIllllIllIlIlll() {
        (lIIIlIIIIIlIll = new String[EntityCreeper.lIIIlIIIIIllII[8]])[EntityCreeper.lIIIlIIIIIllII[2]] = lIllllIllIlIlII("bbfQWyHqAuQ=", "jmvlS");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[3]] = lIllllIllIlIlIl("f3tB9n8yzi4=", "OlmzQ");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[4]] = lIllllIllIlIlIl("NMMZm3Xx9r07TnfqoNDamg==", "pwQXx");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[1]] = lIllllIllIlIlIl("xj3Xh28/0eg=", "baypA");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[5]] = lIllllIllIlIlII("UfptSpO6aIg=", "IfbfP");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[6]] = lIllllIllIlIllI("MzMxLQ==", "uFBHx");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[7]] = lIllllIllIlIlIl("qaFSFPGOmIU=", "TTwJm");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[13]] = lIllllIllIlIlII("cztGC5Hw27dvaw0MLn2TDw==", "OnpFv");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[14]] = lIllllIllIlIllI("HBk/PCEqCCA+HDgFJiU9", "YaOPN");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[15]] = lIllllIllIlIlIl("mElzhoTH62E=", "SVXKT");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[16]] = lIllllIllIlIlIl("OPes63xpb3ok27KRnBYx5g==", "qBFxw");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[17]] = lIllllIllIlIlIl("2gLW5TDS5zqAE6wKhwwMXg==", "aEcXN");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[18]] = lIllllIllIlIllI("PycAYTQgLQc/MiBmBio2JiA=", "RHbOW");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[19]] = lIllllIllIlIlIl("WJPV7J6YNSkxqquFNnCkXg==", "xrQEy");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[20]] = lIllllIllIlIllI("BR4pLB8BFC0CAw8=", "hqKkm");
        EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[21]] = lIllllIllIlIllI("LSc5CikFJxsR", "IHteK");
    }
    
    @Override
    protected String getDeathSound() {
        return EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[18]];
    }
    
    @Override
    public int getMaxFallHeight() {
        int n;
        if (lIllllIllIllIIl(this.getAttackTarget())) {
            n = EntityCreeper.lIIIlIIIIIllII[1];
            "".length();
            if (null != null) {
                return (0xB4 ^ 0x9B) & ~(0x29 ^ 0x6);
            }
        }
        else {
            n = EntityCreeper.lIIIlIIIIIllII[1] + (int)(this.getHealth() - 1.0f);
        }
        return n;
    }
    
    private static boolean lIllllIllIlllll(final int lllllllllllllIlIIIllIlIlIlIIIlIl) {
        return lllllllllllllIlIIIllIlIlIlIIIlIl < 0;
    }
    
    private static boolean lIllllIlllIIlII(final int lllllllllllllIlIIIllIlIlIlIlllII, final int lllllllllllllIlIIIllIlIlIlIllIll) {
        return lllllllllllllIlIIIllIlIlIlIlllII < lllllllllllllIlIIIllIlIlIlIllIll;
    }
    
    public int getCreeperState() {
        return this.dataWatcher.getWatchableObjectByte(EntityCreeper.lIIIlIIIIIllII[8]);
    }
    
    private static boolean lIllllIlllIIIll(final Object lllllllllllllIlIIIllIlIlIlIIlllI, final Object lllllllllllllIlIIIllIlIlIlIIllIl) {
        return lllllllllllllIlIIIllIlIlIlIIlllI == lllllllllllllIlIIIllIlIlIlIIllIl;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
    }
    
    public boolean isAIEnabled() {
        if (lIllllIlllIIlII(this.field_175494_bm, EntityCreeper.lIIIlIIIIIllII[3]) && lIllllIllIlllII(this.worldObj.getGameRules().getBoolean(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[21]]) ? 1 : 0)) {
            return EntityCreeper.lIIIlIIIIIllII[3] != 0;
        }
        return EntityCreeper.lIIIlIIIIIllII[2] != 0;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIlIIIllIlIlllllIIIl) {
        super.writeEntityToNBT(lllllllllllllIlIIIllIlIlllllIIIl);
        if (lIllllIllIllIll(this.dataWatcher.getWatchableObjectByte(EntityCreeper.lIIIlIIIIIllII[10]), EntityCreeper.lIIIlIIIIIllII[3])) {
            lllllllllllllIlIIIllIlIlllllIIIl.setBoolean(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[2]], (boolean)(EntityCreeper.lIIIlIIIIIllII[3] != 0));
        }
        lllllllllllllIlIIIllIlIlllllIIIl.setShort(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[3]], (short)this.fuseTime);
        lllllllllllllIlIIIllIlIlllllIIIl.setByte(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[4]], (byte)this.explosionRadius);
        lllllllllllllIlIIIllIlIlllllIIIl.setBoolean(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[1]], this.hasIgnited());
    }
    
    private static boolean lIllllIllIllIIl(final Object lllllllllllllIlIIIllIlIlIlIIlIll) {
        return lllllllllllllIlIIIllIlIlIlIIlIll == null;
    }
    
    static {
        lIllllIllIllIII();
        lIllllIllIlIlll();
    }
    
    private static boolean lIllllIllIllIlI(final int lllllllllllllIlIIIllIlIlIlIllIII, final int lllllllllllllIlIIIllIlIlIlIlIlll) {
        return lllllllllllllIlIIIllIlIlIlIllIII > lllllllllllllIlIIIllIlIlIlIlIlll;
    }
    
    @Override
    protected boolean interact(final EntityPlayer lllllllllllllIlIIIllIlIllIlIllll) {
        final ItemStack lllllllllllllIlIIIllIlIllIllIIIl = lllllllllllllIlIIIllIlIllIlIllll.inventory.getCurrentItem();
        if (lIllllIlllIIIlI(lllllllllllllIlIIIllIlIllIllIIIl) && lIllllIlllIIIll(lllllllllllllIlIIIllIlIllIllIIIl.getItem(), Items.flint_and_steel)) {
            this.worldObj.playSoundEffect(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[19]], 1.0f, this.rand.nextFloat() * 0.4f + 0.8f);
            lllllllllllllIlIIIllIlIllIlIllll.swingItem();
            if (lIllllIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
                this.ignite();
                lllllllllllllIlIIIllIlIllIllIIIl.damageItem(EntityCreeper.lIIIlIIIIIllII[3], lllllllllllllIlIIIllIlIllIlIllll);
                return EntityCreeper.lIIIlIIIIIllII[3] != 0;
            }
        }
        return super.interact(lllllllllllllIlIIIllIlIllIlIllll);
    }
    
    private static String lIllllIllIlIlII(final String lllllllllllllIlIIIllIlIllIIIllll, final String lllllllllllllIlIIIllIlIllIIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIlIllIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIlIllIIlIIII.getBytes(StandardCharsets.UTF_8)), EntityCreeper.lIIIlIIIIIllII[14]), "DES");
            final Cipher lllllllllllllIlIIIllIlIllIIlIIll = Cipher.getInstance("DES");
            lllllllllllllIlIIIllIlIllIIlIIll.init(EntityCreeper.lIIIlIIIIIllII[4], lllllllllllllIlIIIllIlIllIIlIlII);
            return new String(lllllllllllllIlIIIllIlIllIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIlIllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIlIllIIlIIlI) {
            lllllllllllllIlIIIllIlIllIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    public EntityCreeper(final World lllllllllllllIlIIIllIllIIIIIIlll) {
        super(lllllllllllllIlIIIllIllIIIIIIlll);
        this.fuseTime = EntityCreeper.lIIIlIIIIIllII[0];
        this.explosionRadius = EntityCreeper.lIIIlIIIIIllII[1];
        this.field_175494_bm = EntityCreeper.lIIIlIIIIIllII[2];
        this.tasks.addTask(EntityCreeper.lIIIlIIIIIllII[3], new EntityAISwimming(this));
        this.tasks.addTask(EntityCreeper.lIIIlIIIIIllII[4], new EntityAICreeperSwell(this));
        this.tasks.addTask(EntityCreeper.lIIIlIIIIIllII[1], new EntityAIAvoidEntity<Object>(this, EntityOcelot.class, 6.0f, 1.0, 1.2));
        this.tasks.addTask(EntityCreeper.lIIIlIIIIIllII[5], new EntityAIAttackOnCollide(this, 1.0, (boolean)(EntityCreeper.lIIIlIIIIIllII[2] != 0)));
        this.tasks.addTask(EntityCreeper.lIIIlIIIIIllII[6], new EntityAIWander(this, 0.8));
        this.tasks.addTask(EntityCreeper.lIIIlIIIIIllII[7], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntityCreeper.lIIIlIIIIIllII[7], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntityCreeper.lIIIlIIIIIllII[3], new EntityAINearestAttackableTarget<Object>(this, EntityPlayer.class, (boolean)(EntityCreeper.lIIIlIIIIIllII[3] != 0)));
        this.targetTasks.addTask(EntityCreeper.lIIIlIIIIIllII[4], new EntityAIHurtByTarget(this, (boolean)(EntityCreeper.lIIIlIIIIIllII[2] != 0), new Class[EntityCreeper.lIIIlIIIIIllII[2]]));
    }
    
    private static boolean lIllllIlllIIIII(final int lllllllllllllIlIIIllIlIlIllIIIII, final int lllllllllllllIlIIIllIlIlIlIlllll) {
        return lllllllllllllIlIIIllIlIlIllIIIII >= lllllllllllllIlIIIllIlIlIlIlllll;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIlIIIllIlIllllIlIIl) {
        super.readEntityFromNBT(lllllllllllllIlIIIllIlIllllIlIIl);
        final DataWatcher dataWatcher = this.dataWatcher;
        final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityCreeper.lIIIlIIIIIllII[10];
        int n;
        if (lIllllIllIlllII(lllllllllllllIlIIIllIlIllllIlIIl.getBoolean(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[5]]) ? 1 : 0)) {
            n = EntityCreeper.lIIIlIIIIIllII[3];
            "".length();
            if ((0x1 ^ 0x3A ^ (0x25 ^ 0x1A)) == 0x0) {
                return;
            }
        }
        else {
            n = EntityCreeper.lIIIlIIIIIllII[2];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
        if (lIllllIllIlllII(lllllllllllllIlIIIllIlIllllIlIIl.hasKey(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[6]], EntityCreeper.lIIIlIIIIIllII[12]) ? 1 : 0)) {
            this.fuseTime = lllllllllllllIlIIIllIlIllllIlIIl.getShort(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[7]]);
        }
        if (lIllllIllIlllII(lllllllllllllIlIIIllIlIllllIlIIl.hasKey(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[13]], EntityCreeper.lIIIlIIIIIllII[12]) ? 1 : 0)) {
            this.explosionRadius = lllllllllllllIlIIIllIlIllllIlIIl.getByte(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[14]]);
        }
        if (lIllllIllIlllII(lllllllllllllIlIIIllIlIllllIlIIl.getBoolean(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[15]]) ? 1 : 0)) {
            this.ignite();
        }
    }
    
    public void func_175493_co() {
        this.field_175494_bm += EntityCreeper.lIIIlIIIIIllII[3];
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityCreeper.lIIIlIIIIIllII[8], (byte)EntityCreeper.lIIIlIIIIIllII[9]);
        this.dataWatcher.addObject(EntityCreeper.lIIIlIIIIIllII[10], (byte)EntityCreeper.lIIIlIIIIIllII[2]);
        this.dataWatcher.addObject(EntityCreeper.lIIIlIIIIIllII[11], (byte)EntityCreeper.lIIIlIIIIIllII[2]);
    }
    
    private static boolean lIllllIllIllIll(final int lllllllllllllIlIIIllIlIlIllIIlII, final int lllllllllllllIlIIIllIlIlIllIIIll) {
        return lllllllllllllIlIIIllIlIlIllIIlII == lllllllllllllIlIIIllIlIlIllIIIll;
    }
    
    private static boolean lIllllIlllIIIlI(final Object lllllllllllllIlIIIllIlIlIlIlIIIl) {
        return lllllllllllllIlIIIllIlIlIlIlIIIl != null;
    }
    
    @Override
    public void onDeath(final DamageSource lllllllllllllIlIIIllIlIlllIllIlI) {
        super.onDeath(lllllllllllllIlIIIllIlIlllIllIlI);
        if (lIllllIllIlllII((lllllllllllllIlIIIllIlIlllIllIlI.getEntity() instanceof EntitySkeleton) ? 1 : 0)) {
            final int lllllllllllllIlIIIllIlIlllIllIIl = Item.getIdFromItem(Items.record_13);
            final int lllllllllllllIlIIIllIlIlllIllIII = Item.getIdFromItem(Items.record_wait);
            final int lllllllllllllIlIIIllIlIlllIlIlll = lllllllllllllIlIIIllIlIlllIllIIl + this.rand.nextInt(lllllllllllllIlIIIllIlIlllIllIII - lllllllllllllIlIIIllIlIlllIllIIl + EntityCreeper.lIIIlIIIIIllII[3]);
            this.dropItem(Item.getItemById(lllllllllllllIlIIIllIlIlllIlIlll), EntityCreeper.lIIIlIIIIIllII[3]);
            "".length();
            "".length();
            if (((0x80 ^ 0x85) & ~(0x97 ^ 0x92)) >= "  ".length()) {
                return;
            }
        }
        else if (lIllllIllIlllII((lllllllllllllIlIIIllIlIlllIllIlI.getEntity() instanceof EntityCreeper) ? 1 : 0) && lIllllIlllIIIIl(lllllllllllllIlIIIllIlIlllIllIlI.getEntity(), this) && lIllllIllIlllII(((EntityCreeper)lllllllllllllIlIIIllIlIlllIllIlI.getEntity()).getPowered() ? 1 : 0) && lIllllIllIlllII(((EntityCreeper)lllllllllllllIlIIIllIlIlllIllIlI.getEntity()).isAIEnabled() ? 1 : 0)) {
            ((EntityCreeper)lllllllllllllIlIIIllIlIlllIllIlI.getEntity()).func_175493_co();
            this.entityDropItem(new ItemStack(Items.skull, EntityCreeper.lIIIlIIIIIllII[3], EntityCreeper.lIIIlIIIIIllII[5]), 0.0f);
            "".length();
        }
    }
    
    @Override
    protected Item getDropItem() {
        return Items.gunpowder;
    }
    
    private void explode() {
        if (lIllllIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
            final boolean lllllllllllllIlIIIllIlIllIlIlIIl = this.worldObj.getGameRules().getBoolean(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[20]]);
            float n;
            if (lIllllIllIlllII(this.getPowered() ? 1 : 0)) {
                n = 2.0f;
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else {
                n = 1.0f;
            }
            final float lllllllllllllIlIIIllIlIllIlIlIII = n;
            this.worldObj.createExplosion(this, this.posX, this.posY, this.posZ, this.explosionRadius * lllllllllllllIlIIIllIlIllIlIlIII, lllllllllllllIlIIIllIlIllIlIlIIl);
            "".length();
            this.setDead();
        }
    }
    
    public void setCreeperState(final int lllllllllllllIlIIIllIlIllIllllIl) {
        this.dataWatcher.updateObject(EntityCreeper.lIIIlIIIIIllII[8], (byte)lllllllllllllIlIIIllIlIllIllllIl);
    }
    
    private static void lIllllIllIllIII() {
        (lIIIlIIIIIllII = new int[22])[0] = (0x31 ^ 0x10 ^ (0x9C ^ 0xA3));
        EntityCreeper.lIIIlIIIIIllII[1] = "   ".length();
        EntityCreeper.lIIIlIIIIIllII[2] = ((0x2B ^ 0x20 ^ (0x8C ^ 0xB4)) & (0x18 ^ 0xD ^ (0x4E ^ 0x68) ^ -" ".length()));
        EntityCreeper.lIIIlIIIIIllII[3] = " ".length();
        EntityCreeper.lIIIlIIIIIllII[4] = "  ".length();
        EntityCreeper.lIIIlIIIIIllII[5] = (0x7E ^ 0x7A);
        EntityCreeper.lIIIlIIIIIllII[6] = (16 + 106 - 15 + 53 ^ 131 + 89 - 167 + 112);
        EntityCreeper.lIIIlIIIIIllII[7] = (0xB1 ^ 0x9C ^ (0x28 ^ 0x3));
        EntityCreeper.lIIIlIIIIIllII[8] = (55 + 2 - 35 + 143 ^ 103 + 79 - 23 + 22);
        EntityCreeper.lIIIlIIIIIllII[9] = -" ".length();
        EntityCreeper.lIIIlIIIIIllII[10] = (0x73 ^ 0x62);
        EntityCreeper.lIIIlIIIIIllII[11] = (0x0 ^ 0x24 ^ (0xB6 ^ 0x80));
        EntityCreeper.lIIIlIIIIIllII[12] = (74 + 13 - 8 + 113 ^ 48 + 120 - 88 + 83);
        EntityCreeper.lIIIlIIIIIllII[13] = (0x3D ^ 0x73 ^ (0x2A ^ 0x63));
        EntityCreeper.lIIIlIIIIIllII[14] = (0x7F ^ 0x77);
        EntityCreeper.lIIIlIIIIIllII[15] = (0xBD ^ 0xB4);
        EntityCreeper.lIIIlIIIIIllII[16] = (103 + 41 - 120 + 130 ^ 26 + 118 - 41 + 41);
        EntityCreeper.lIIIlIIIIIllII[17] = (0x45 ^ 0x4 ^ (0x1D ^ 0x57));
        EntityCreeper.lIIIlIIIIIllII[18] = (195 + 140 - 317 + 188 ^ 169 + 40 - 182 + 167);
        EntityCreeper.lIIIlIIIIIllII[19] = (0x2E ^ 0x23);
        EntityCreeper.lIIIlIIIIIllII[20] = (0x14 ^ 0x1A);
        EntityCreeper.lIIIlIIIIIllII[21] = (0x2F ^ 0x20);
    }
    
    public boolean getPowered() {
        if (lIllllIllIllIll(this.dataWatcher.getWatchableObjectByte(EntityCreeper.lIIIlIIIIIllII[10]), EntityCreeper.lIIIlIIIIIllII[3])) {
            return EntityCreeper.lIIIlIIIIIllII[3] != 0;
        }
        return EntityCreeper.lIIIlIIIIIllII[2] != 0;
    }
    
    @Override
    public void onUpdate() {
        if (lIllllIllIlllII(this.isEntityAlive() ? 1 : 0)) {
            this.lastActiveTime = this.timeSinceIgnited;
            if (lIllllIllIlllII(this.hasIgnited() ? 1 : 0)) {
                this.setCreeperState(EntityCreeper.lIIIlIIIIIllII[3]);
            }
            final int lllllllllllllIlIIIllIlIllllIIlIl = this.getCreeperState();
            if (lIllllIllIlllIl(lllllllllllllIlIIIllIlIllllIIlIl) && lIllllIllIllllI(this.timeSinceIgnited)) {
                this.playSound(EntityCreeper.lIIIlIIIIIlIll[EntityCreeper.lIIIlIIIIIllII[16]], 1.0f, 0.5f);
            }
            this.timeSinceIgnited += lllllllllllllIlIIIllIlIllllIIlIl;
            if (lIllllIllIlllll(this.timeSinceIgnited)) {
                this.timeSinceIgnited = EntityCreeper.lIIIlIIIIIllII[2];
            }
            if (lIllllIlllIIIII(this.timeSinceIgnited, this.fuseTime)) {
                this.timeSinceIgnited = this.fuseTime;
                this.explode();
            }
        }
        super.onUpdate();
    }
    
    public float getCreeperFlashIntensity(final float lllllllllllllIlIIIllIlIlllIIIlll) {
        return (this.lastActiveTime + (this.timeSinceIgnited - this.lastActiveTime) * lllllllllllllIlIIIllIlIlllIIIlll) / (this.fuseTime - EntityCreeper.lIIIlIIIIIllII[4]);
    }
    
    @Override
    public void onStruckByLightning(final EntityLightningBolt lllllllllllllIlIIIllIlIllIllIlll) {
        super.onStruckByLightning(lllllllllllllIlIIIllIlIllIllIlll);
        this.dataWatcher.updateObject(EntityCreeper.lIIIlIIIIIllII[10], (byte)EntityCreeper.lIIIlIIIIIllII[3]);
    }
    
    private static boolean lIllllIllIlllIl(final int lllllllllllllIlIIIllIlIlIlIIIIll) {
        return lllllllllllllIlIIIllIlIlIlIIIIll > 0;
    }
    
    private static String lIllllIllIlIlIl(final String lllllllllllllIlIIIllIlIllIIIIlII, final String lllllllllllllIlIIIllIlIllIIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIlIllIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIlIllIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIllIlIllIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIllIlIllIIIIllI.init(EntityCreeper.lIIIlIIIIIllII[4], lllllllllllllIlIIIllIlIllIIIIlll);
            return new String(lllllllllllllIlIIIllIlIllIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIlIllIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIlIllIIIIlIl) {
            lllllllllllllIlIIIllIlIllIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllllIlllIIIIl(final Object lllllllllllllIlIIIllIlIlIlIlIlII, final Object lllllllllllllIlIIIllIlIlIlIlIIll) {
        return lllllllllllllIlIIIllIlIlIlIlIlII != lllllllllllllIlIIIllIlIlIlIlIIll;
    }
    
    @Override
    public void fall(final float lllllllllllllIlIIIllIlIllllllIIl, final float lllllllllllllIlIIIllIlIllllllIII) {
        super.fall(lllllllllllllIlIIIllIlIllllllIIl, lllllllllllllIlIIIllIlIllllllIII);
        this.timeSinceIgnited += (int)(lllllllllllllIlIIIllIlIllllllIIl * 1.5f);
        if (lIllllIllIllIlI(this.timeSinceIgnited, this.fuseTime - EntityCreeper.lIIIlIIIIIllII[6])) {
            this.timeSinceIgnited = this.fuseTime - EntityCreeper.lIIIlIIIIIllII[6];
        }
    }
    
    public void ignite() {
        this.dataWatcher.updateObject(EntityCreeper.lIIIlIIIIIllII[11], (byte)EntityCreeper.lIIIlIIIIIllII[3]);
    }
    
    @Override
    public boolean attackEntityAsMob(final Entity lllllllllllllIlIIIllIlIlllIlIIII) {
        return EntityCreeper.lIIIlIIIIIllII[3] != 0;
    }
}
