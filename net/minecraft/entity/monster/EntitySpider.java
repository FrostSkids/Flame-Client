// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import java.util.Random;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNavigateClimber;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAILeapAtTarget;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.world.World;
import net.minecraft.entity.EnumCreatureAttribute;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.world.DifficultyInstance;

public class EntitySpider extends EntityMob
{
    private static final /* synthetic */ int[] llIllIIlllllll;
    private static final /* synthetic */ String[] llIllIIllllllI;
    
    private static boolean lIIlIlllIlIlllll(final Object llllllllllllIllIIlllIlIlIlIIlIll) {
        return llllllllllllIllIIlllIlIlIlIIlIll != null;
    }
    
    private static boolean lIIlIlllIllIIIII(final int llllllllllllIllIIlllIlIlIlIlIIlI, final int llllllllllllIllIIlllIlIlIlIlIIIl) {
        return llllllllllllIllIIlllIlIlIlIlIIlI < llllllllllllIllIIlllIlIlIlIlIIIl;
    }
    
    @Override
    public double getMountedYOffset() {
        return this.height * 0.5f;
    }
    
    private static boolean lIIlIlllIlIllllI(final int llllllllllllIllIIlllIlIlIlIIIIll) {
        return llllllllllllIllIIlllIlIlIlIIIIll < 0;
    }
    
    @Override
    public IEntityLivingData onInitialSpawn(final DifficultyInstance llllllllllllIllIIlllIlIllIIlIIll, IEntityLivingData llllllllllllIllIIlllIlIllIIIllIl) {
        llllllllllllIllIIlllIlIllIIIllIl = super.onInitialSpawn(llllllllllllIllIIlllIlIllIIlIIll, llllllllllllIllIIlllIlIllIIIllIl);
        if (lIIlIlllIlIlIlll(this.worldObj.rand.nextInt(EntitySpider.llIllIIlllllll[9]))) {
            final EntitySkeleton llllllllllllIllIIlllIlIllIIlIIIl = new EntitySkeleton(this.worldObj);
            llllllllllllIllIIlllIlIllIIlIIIl.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0f);
            llllllllllllIllIIlllIlIllIIlIIIl.onInitialSpawn(llllllllllllIllIIlllIlIllIIlIIll, null);
            "".length();
            this.worldObj.spawnEntityInWorld(llllllllllllIllIIlllIlIllIIlIIIl);
            "".length();
            llllllllllllIllIIlllIlIllIIlIIIl.mountEntity(this);
        }
        if (lIIlIlllIlIlllII(llllllllllllIllIIlllIlIllIIIllIl)) {
            llllllllllllIllIIlllIlIllIIIllIl = new GroupData();
            if (lIIlIlllIlIlllIl(this.worldObj.getDifficulty(), EnumDifficulty.HARD) && lIIlIlllIlIllllI(lIIlIlllIlIllIll(this.worldObj.rand.nextFloat(), 0.1f * llllllllllllIllIIlllIlIllIIlIIll.getClampedAdditionalDifficulty()))) {
                ((GroupData)llllllllllllIllIIlllIlIllIIIllIl).func_111104_a(this.worldObj.rand);
            }
        }
        if (lIIlIlllIlIllIII((llllllllllllIllIIlllIlIllIIIllIl instanceof GroupData) ? 1 : 0)) {
            final int llllllllllllIllIIlllIlIllIIlIIII = ((GroupData)llllllllllllIllIIlllIlIllIIIllIl).potionEffectId;
            if (lIIlIlllIlIllIIl(llllllllllllIllIIlllIlIllIIlIIII) && lIIlIlllIlIlllll(Potion.potionTypes[llllllllllllIllIIlllIlIllIIlIIII])) {
                this.addPotionEffect(new PotionEffect(llllllllllllIllIIlllIlIllIIlIIII, EntitySpider.llIllIIlllllll[10]));
            }
        }
        return llllllllllllIllIIlllIlIllIIIllIl;
    }
    
    private static void lIIlIlllIlIlIlIl() {
        (llIllIIllllllI = new String[EntitySpider.llIllIIlllllll[2]])[EntitySpider.llIllIIlllllll[5]] = lIIlIlllIlIlIIlI("FOyyw4co1xlfYrTHFTEWBQ==", "sXBQC");
        EntitySpider.llIllIIllllllI[EntitySpider.llIllIIlllllll[0]] = lIIlIlllIlIlIIll("i/LC6CYHu7jlbu3gv2l7Lg==", "jQnTa");
        EntitySpider.llIllIIllllllI[EntitySpider.llIllIIlllllll[6]] = lIIlIlllIlIlIlII("GiUOXwkHIwgUCFkuCRAOHw==", "wJlqz");
        EntitySpider.llIllIIllllllI[EntitySpider.llIllIIlllllll[1]] = lIIlIlllIlIlIlII("KSchYSc0IScqJmo7Nyok", "DHCOT");
    }
    
    @Override
    protected String getHurtSound() {
        return EntitySpider.llIllIIllllllI[EntitySpider.llIllIIlllllll[0]];
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntitySpider.llIllIIlllllll[7], new Byte((byte)EntitySpider.llIllIIlllllll[5]));
    }
    
    @Override
    public boolean isPotionApplicable(final PotionEffect llllllllllllIllIIlllIlIllIlIIlll) {
        int potionApplicable;
        if (lIIlIlllIlIllIlI(llllllllllllIllIIlllIlIllIlIIlll.getPotionID(), Potion.poison.id)) {
            potionApplicable = EntitySpider.llIllIIlllllll[5];
            "".length();
            if ("   ".length() <= 0) {
                return ((0x70 ^ 0x20) & ~(0x33 ^ 0x63)) != 0x0;
            }
        }
        else {
            potionApplicable = (super.isPotionApplicable(llllllllllllIllIIlllIlIllIlIIlll) ? 1 : 0);
        }
        return potionApplicable != 0;
    }
    
    private static boolean lIIlIlllIlIllIlI(final int llllllllllllIllIIlllIlIlIlIlIllI, final int llllllllllllIllIIlllIlIlIlIlIlIl) {
        return llllllllllllIllIIlllIlIlIlIlIllI == llllllllllllIllIIlllIlIlIlIlIlIl;
    }
    
    private static boolean lIIlIlllIlIlllIl(final Object llllllllllllIllIIlllIlIlIlIIlllI, final Object llllllllllllIllIIlllIlIlIlIIllIl) {
        return llllllllllllIllIIlllIlIlIlIIlllI == llllllllllllIllIIlllIlIlIlIIllIl;
    }
    
    private static boolean lIIlIlllIlIlllII(final Object llllllllllllIllIIlllIlIlIlIIlIIl) {
        return llllllllllllIllIIlllIlIlIlIIlIIl == null;
    }
    
    @Override
    protected String getLivingSound() {
        return EntitySpider.llIllIIllllllI[EntitySpider.llIllIIlllllll[5]];
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lIIlIlllIlIlIlll(this.worldObj.isRemote ? 1 : 0)) {
            this.setBesideClimbableBlock(this.isCollidedHorizontally);
        }
    }
    
    private static String lIIlIlllIlIlIlII(String llllllllllllIllIIlllIlIlIllIIIIl, final String llllllllllllIllIIlllIlIlIllIIlIl) {
        llllllllllllIllIIlllIlIlIllIIIIl = new String(Base64.getDecoder().decode(llllllllllllIllIIlllIlIlIllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlllIlIlIllIIlII = new StringBuilder();
        final char[] llllllllllllIllIIlllIlIlIllIIIll = llllllllllllIllIIlllIlIlIllIIlIl.toCharArray();
        int llllllllllllIllIIlllIlIlIllIIIlI = EntitySpider.llIllIIlllllll[5];
        final byte llllllllllllIllIIlllIlIlIlIlllII = (Object)llllllllllllIllIIlllIlIlIllIIIIl.toCharArray();
        final short llllllllllllIllIIlllIlIlIlIllIll = (short)llllllllllllIllIIlllIlIlIlIlllII.length;
        String llllllllllllIllIIlllIlIlIlIllIlI = (String)EntitySpider.llIllIIlllllll[5];
        while (lIIlIlllIllIIIII((int)llllllllllllIllIIlllIlIlIlIllIlI, llllllllllllIllIIlllIlIlIlIllIll)) {
            final char llllllllllllIllIIlllIlIlIllIIlll = llllllllllllIllIIlllIlIlIlIlllII[llllllllllllIllIIlllIlIlIlIllIlI];
            llllllllllllIllIIlllIlIlIllIIlII.append((char)(llllllllllllIllIIlllIlIlIllIIlll ^ llllllllllllIllIIlllIlIlIllIIIll[llllllllllllIllIIlllIlIlIllIIIlI % llllllllllllIllIIlllIlIlIllIIIll.length]));
            "".length();
            ++llllllllllllIllIIlllIlIlIllIIIlI;
            ++llllllllllllIllIIlllIlIlIlIllIlI;
            "".length();
            if (-(0x1A ^ 0x16 ^ (0x35 ^ 0x3D)) > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlllIlIlIllIIlII);
    }
    
    @Override
    public boolean isOnLadder() {
        return this.isBesideClimbableBlock();
    }
    
    @Override
    protected void playStepSound(final BlockPos llllllllllllIllIIlllIlIllIllllII, final Block llllllllllllIllIIlllIlIllIlllIll) {
        this.playSound(EntitySpider.llIllIIllllllI[EntitySpider.llIllIIlllllll[1]], 0.15f, 1.0f);
    }
    
    @Override
    public void setInWeb() {
    }
    
    private static String lIIlIlllIlIlIIll(final String llllllllllllIllIIlllIlIllIIIIIIl, final String llllllllllllIllIIlllIlIllIIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIlIllIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIlIllIIIIIlI.getBytes(StandardCharsets.UTF_8)), EntitySpider.llIllIIlllllll[11]), "DES");
            final Cipher llllllllllllIllIIlllIlIllIIIIlIl = Cipher.getInstance("DES");
            llllllllllllIllIIlllIlIllIIIIlIl.init(EntitySpider.llIllIIlllllll[6], llllllllllllIllIIlllIlIllIIIIllI);
            return new String(llllllllllllIllIIlllIlIllIIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIlIllIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIlIllIIIIlII) {
            llllllllllllIllIIlllIlIllIIIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIlllIlIllIIl(final int llllllllllllIllIIlllIlIlIlIIIIIl) {
        return llllllllllllIllIIlllIlIlIlIIIIIl > 0;
    }
    
    public boolean isBesideClimbableBlock() {
        if (lIIlIlllIlIllIII(this.dataWatcher.getWatchableObjectByte(EntitySpider.llIllIIlllllll[7]) & EntitySpider.llIllIIlllllll[0])) {
            return EntitySpider.llIllIIlllllll[0] != 0;
        }
        return EntitySpider.llIllIIlllllll[5] != 0;
    }
    
    @Override
    public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.ARTHROPOD;
    }
    
    private static String lIIlIlllIlIlIIlI(final String llllllllllllIllIIlllIlIlIlllIllI, final String llllllllllllIllIIlllIlIlIlllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIlIlIllllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIlIlIlllIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllIlIlIllllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllIlIlIllllIII.init(EntitySpider.llIllIIlllllll[6], llllllllllllIllIIlllIlIlIllllIIl);
            return new String(llllllllllllIllIIlllIlIlIllllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIlIlIlllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIlIlIlllIlll) {
            llllllllllllIllIIlllIlIlIlllIlll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIlllIlIlIllI();
        lIIlIlllIlIlIlIl();
    }
    
    private static boolean lIIlIlllIlIlIlll(final int llllllllllllIllIIlllIlIlIlIIIlIl) {
        return llllllllllllIllIIlllIlIlIlIIIlIl == 0;
    }
    
    private static void lIIlIlllIlIlIllI() {
        (llIllIIlllllll = new int[12])[0] = " ".length();
        EntitySpider.llIllIIlllllll[1] = "   ".length();
        EntitySpider.llIllIIlllllll[2] = (0x2A ^ 0x2E);
        EntitySpider.llIllIIlllllll[3] = (0x26 ^ 0xA ^ (0x57 ^ 0x7E));
        EntitySpider.llIllIIlllllll[4] = (0xB4 ^ 0xB2);
        EntitySpider.llIllIIlllllll[5] = ((0xB2 ^ 0x8E) & ~(0xA5 ^ 0x99));
        EntitySpider.llIllIIlllllll[6] = "  ".length();
        EntitySpider.llIllIIlllllll[7] = (0x73 ^ 0x36 ^ (0x0 ^ 0x55));
        EntitySpider.llIllIIlllllll[8] = -"  ".length();
        EntitySpider.llIllIIlllllll[9] = (0x3A ^ 0x5E);
        EntitySpider.llIllIIlllllll[10] = (-1 & Integer.MAX_VALUE);
        EntitySpider.llIllIIlllllll[11] = (146 + 11 - 107 + 116 ^ 143 + 39 - 89 + 81);
    }
    
    @Override
    public float getEyeHeight() {
        return 0.65f;
    }
    
    @Override
    protected String getDeathSound() {
        return EntitySpider.llIllIIllllllI[EntitySpider.llIllIIlllllll[6]];
    }
    
    private static boolean lIIlIlllIlIllIII(final int llllllllllllIllIIlllIlIlIlIIIlll) {
        return llllllllllllIllIIlllIlIlIlIIIlll != 0;
    }
    
    public EntitySpider(final World llllllllllllIllIIlllIlIlllIlIlII) {
        super(llllllllllllIllIIlllIlIlllIlIlII);
        this.setSize(1.4f, 0.9f);
        this.tasks.addTask(EntitySpider.llIllIIlllllll[0], new EntityAISwimming(this));
        this.tasks.addTask(EntitySpider.llIllIIlllllll[1], new EntityAILeapAtTarget(this, 0.4f));
        this.tasks.addTask(EntitySpider.llIllIIlllllll[2], new AISpiderAttack(this, EntityPlayer.class));
        this.tasks.addTask(EntitySpider.llIllIIlllllll[2], new AISpiderAttack(this, EntityIronGolem.class));
        this.tasks.addTask(EntitySpider.llIllIIlllllll[3], new EntityAIWander(this, 0.8));
        this.tasks.addTask(EntitySpider.llIllIIlllllll[4], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntitySpider.llIllIIlllllll[4], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntitySpider.llIllIIlllllll[0], new EntityAIHurtByTarget(this, (boolean)(EntitySpider.llIllIIlllllll[5] != 0), new Class[EntitySpider.llIllIIlllllll[5]]));
        this.targetTasks.addTask(EntitySpider.llIllIIlllllll[6], new AISpiderTarget<Object>(this, EntityPlayer.class));
        this.targetTasks.addTask(EntitySpider.llIllIIlllllll[1], new AISpiderTarget<Object>(this, EntityIronGolem.class));
    }
    
    @Override
    protected PathNavigate getNewNavigator(final World llllllllllllIllIIlllIlIlllIIllIl) {
        return new PathNavigateClimber(this, llllllllllllIllIIlllIlIlllIIllIl);
    }
    
    @Override
    protected Item getDropItem() {
        return Items.string;
    }
    
    @Override
    protected void dropFewItems(final boolean llllllllllllIllIIlllIlIllIllIlII, final int llllllllllllIllIIlllIlIllIllIIII) {
        super.dropFewItems(llllllllllllIllIIlllIlIllIllIlII, llllllllllllIllIIlllIlIllIllIIII);
        if (lIIlIlllIlIllIII(llllllllllllIllIIlllIlIllIllIlII ? 1 : 0) && (!lIIlIlllIlIllIII(this.rand.nextInt(EntitySpider.llIllIIlllllll[1])) || lIIlIlllIlIllIIl(this.rand.nextInt(EntitySpider.llIllIIlllllll[0] + llllllllllllIllIIlllIlIllIllIIII)))) {
            this.dropItem(Items.spider_eye, EntitySpider.llIllIIlllllll[0]);
            "".length();
        }
    }
    
    public void setBesideClimbableBlock(final boolean llllllllllllIllIIlllIlIllIIlllIl) {
        byte llllllllllllIllIIlllIlIllIIlllII = this.dataWatcher.getWatchableObjectByte(EntitySpider.llIllIIlllllll[7]);
        if (lIIlIlllIlIllIII(llllllllllllIllIIlllIlIllIIlllIl ? 1 : 0)) {
            llllllllllllIllIIlllIlIllIIlllII |= (byte)EntitySpider.llIllIIlllllll[0];
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            llllllllllllIllIIlllIlIllIIlllII &= (byte)EntitySpider.llIllIIlllllll[8];
        }
        this.dataWatcher.updateObject(EntitySpider.llIllIIlllllll[7], llllllllllllIllIIlllIlIllIIlllII);
    }
    
    private static int lIIlIlllIlIllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.30000001192092896);
    }
    
    static class AISpiderTarget<T extends EntityLivingBase> extends EntityAINearestAttackableTarget
    {
        private static final /* synthetic */ int[] lIllllIIlIlIll;
        
        private static int lIIIIlIIIIIlIlll(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        private static void lIIIIlIIIIIlIllI() {
            (lIllllIIlIlIll = new int[2])[0] = " ".length();
            AISpiderTarget.lIllllIIlIlIll[1] = ((0xBC ^ 0xB3) & ~(0x18 ^ 0x17));
        }
        
        static {
            lIIIIlIIIIIlIllI();
        }
        
        private static boolean lIIIIlIIIIIllIII(final int llllllllllllIllllIlIllIIIIlIllII) {
            return llllllllllllIllllIlIllIIIIlIllII >= 0;
        }
        
        @Override
        public boolean shouldExecute() {
            final float llllllllllllIllllIlIllIIIIllIIII = this.taskOwner.getBrightness(1.0f);
            int shouldExecute;
            if (lIIIIlIIIIIllIII(lIIIIlIIIIIlIlll(llllllllllllIllllIlIllIIIIllIIII, 0.5f))) {
                shouldExecute = AISpiderTarget.lIllllIIlIlIll[1];
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return ((0x9C ^ 0xAC) & ~(0x3B ^ 0xB)) != 0x0;
                }
            }
            else {
                shouldExecute = (super.shouldExecute() ? 1 : 0);
            }
            return shouldExecute != 0;
        }
        
        public AISpiderTarget(final EntitySpider llllllllllllIllllIlIllIIIIllIlIl, final Class<T> llllllllllllIllllIlIllIIIIllIlII) {
            super(llllllllllllIllllIlIllIIIIllIlIl, llllllllllllIllllIlIllIIIIllIlII, (boolean)(AISpiderTarget.lIllllIIlIlIll[0] != 0));
        }
    }
    
    static class AISpiderAttack extends EntityAIAttackOnCollide
    {
        private static final /* synthetic */ int[] lllIIlIIlllIII;
        
        @Override
        protected double func_179512_a(final EntityLivingBase llllllllllllIlIllllIlIlllIlIlllI) {
            return 4.0f + llllllllllllIlIllllIlIlllIlIlllI.width;
        }
        
        private static boolean lIIlllllIllIIlII(final int llllllllllllIlIllllIlIlllIlIlIll) {
            return llllllllllllIlIllllIlIlllIlIlIll == 0;
        }
        
        private static int lIIlllllIllIIIlI(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        @Override
        public boolean continueExecuting() {
            final float llllllllllllIlIllllIlIlllIllIIll = this.attacker.getBrightness(1.0f);
            if (lIIlllllIllIIIll(lIIlllllIllIIIlI(llllllllllllIlIllllIlIlllIllIIll, 0.5f)) && lIIlllllIllIIlII(this.attacker.getRNG().nextInt(AISpiderAttack.lllIIlIIlllIII[1]))) {
                this.attacker.setAttackTarget(null);
                return AISpiderAttack.lllIIlIIlllIII[2] != 0;
            }
            return super.continueExecuting();
        }
        
        static {
            lIIlllllIllIIIIl();
        }
        
        public AISpiderAttack(final EntitySpider llllllllllllIlIllllIlIlllIlllIII, final Class<? extends Entity> llllllllllllIlIllllIlIlllIllIlll) {
            super(llllllllllllIlIllllIlIlllIlllIII, llllllllllllIlIllllIlIlllIllIlll, 1.0, (boolean)(AISpiderAttack.lllIIlIIlllIII[0] != 0));
        }
        
        private static void lIIlllllIllIIIIl() {
            (lllIIlIIlllIII = new int[3])[0] = " ".length();
            AISpiderAttack.lllIIlIIlllIII[1] = (0x37 ^ 0x53);
            AISpiderAttack.lllIIlIIlllIII[2] = ((107 + 8 - 53 + 100 ^ 14 + 73 + 38 + 17) & (0x72 ^ 0x3E ^ (0xE0 ^ 0x80) ^ -" ".length()));
        }
        
        private static boolean lIIlllllIllIIIll(final int llllllllllllIlIllllIlIlllIlIlIIl) {
            return llllllllllllIlIllllIlIlllIlIlIIl >= 0;
        }
    }
    
    public static class GroupData implements IEntityLivingData
    {
        private static final /* synthetic */ int[] lIlIIIlIllIlIl;
        public /* synthetic */ int potionEffectId;
        
        public void func_111104_a(final Random lllllllllllllIIIlllllIIlIIlIIIII) {
            final int lllllllllllllIIIlllllIIlIIIlllll = lllllllllllllIIIlllllIIlIIlIIIII.nextInt(GroupData.lIlIIIlIllIlIl[0]);
            if (lllIIIlIllllIIl(lllllllllllllIIIlllllIIlIIIlllll, GroupData.lIlIIIlIllIlIl[1])) {
                this.potionEffectId = Potion.moveSpeed.id;
                "".length();
                if (((0x3D ^ 0x2 ^ (0xB2 ^ 0xB9)) & (6 + 129 - 106 + 147 ^ 42 + 79 - 109 + 120 ^ -" ".length())) > ((10 + 102 - 4 + 21 ^ 32 + 7 + 3 + 146) & (114 + 30 - 8 + 35 ^ 61 + 106 - 59 + 42 ^ -" ".length()))) {
                    return;
                }
            }
            else if (lllIIIlIllllIIl(lllllllllllllIIIlllllIIlIIIlllll, GroupData.lIlIIIlIllIlIl[2])) {
                this.potionEffectId = Potion.damageBoost.id;
                "".length();
                if (" ".length() == ((0x59 ^ 0x1D ^ "   ".length()) & (0x13 ^ 0x76 ^ (0xE2 ^ 0xC0) ^ -" ".length()))) {
                    return;
                }
            }
            else if (lllIIIlIllllIIl(lllllllllllllIIIlllllIIlIIIlllll, GroupData.lIlIIIlIllIlIl[3])) {
                this.potionEffectId = Potion.regeneration.id;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (lllIIIlIllllIIl(lllllllllllllIIIlllllIIlIIIlllll, GroupData.lIlIIIlIllIlIl[4])) {
                this.potionEffectId = Potion.invisibility.id;
            }
        }
        
        private static void lllIIIlIllllIII() {
            (lIlIIIlIllIlIl = new int[5])[0] = (0xC5 ^ 0xC0);
            GroupData.lIlIIIlIllIlIl[1] = " ".length();
            GroupData.lIlIIIlIllIlIl[2] = "  ".length();
            GroupData.lIlIIIlIllIlIl[3] = "   ".length();
            GroupData.lIlIIIlIllIlIl[4] = (0x8D ^ 0x89);
        }
        
        static {
            lllIIIlIllllIII();
        }
        
        private static boolean lllIIIlIllllIIl(final int lllllllllllllIIIlllllIIlIIIllIIl, final int lllllllllllllIIIlllllIIlIIIllIII) {
            return lllllllllllllIIIlllllIIlIIIllIIl <= lllllllllllllIIIlllllIIlIIIllIII;
        }
    }
}
