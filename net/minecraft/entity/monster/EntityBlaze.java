// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.init.Items;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EntityBlaze extends EntityMob
{
    private static final /* synthetic */ int[] llIlIlllIIllll;
    private /* synthetic */ int heightOffsetUpdateTime;
    private /* synthetic */ float heightOffset;
    private static final /* synthetic */ String[] llIlIlllIIllII;
    
    private static boolean lIIlIlIllIllIlll(final int llllllllllllIllIlIIlIIIIIIllllII, final int llllllllllllIllIlIIlIIIIIIlllIll) {
        return llllllllllllIllIlIIlIIIIIIllllII < llllllllllllIllIlIIlIIIIIIlllIll;
    }
    
    private static String lIIlIlIllIlIIlll(final String llllllllllllIllIlIIlIIIIIlIIIllI, final String llllllllllllIllIlIIlIIIIIlIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIIIIIlIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIIIIIlIIIlIl.getBytes(StandardCharsets.UTF_8)), EntityBlaze.llIlIlllIIllll[5]), "DES");
            final Cipher llllllllllllIllIlIIlIIIIIlIIlIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIIlIIIIIlIIlIlI.init(EntityBlaze.llIlIlllIIllll[7], llllllllllllIllIlIIlIIIIIlIIlIll);
            return new String(llllllllllllIllIlIIlIIIIIlIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIIIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIIIIIlIIlIIl) {
            llllllllllllIllIlIIlIIIIIlIIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected String getLivingSound() {
        return EntityBlaze.llIlIlllIIllII[EntityBlaze.llIlIlllIIllll[6]];
    }
    
    private static boolean lIIlIlIllIlIllll(final int llllllllllllIllIlIIlIIIIIIllIIll) {
        return llllllllllllIllIlIIlIIIIIIllIIll < 0;
    }
    
    @Override
    protected void dropFewItems(final boolean llllllllllllIllIlIIlIIIIIllllIII, final int llllllllllllIllIlIIlIIIIIlllllII) {
        if (lIIlIlIllIllIIII(llllllllllllIllIlIIlIIIIIllllIII ? 1 : 0)) {
            final int llllllllllllIllIlIIlIIIIIllllIll = this.rand.nextInt(EntityBlaze.llIlIlllIIllll[7] + llllllllllllIllIlIIlIIIIIlllllII);
            int llllllllllllIllIlIIlIIIIIllllIlI = EntityBlaze.llIlIlllIIllll[6];
            "".length();
            if ((0x2D ^ 0x6A ^ (0x6D ^ 0x2E)) <= " ".length()) {
                return;
            }
            while (!lIIlIlIllIllIIIl(llllllllllllIllIlIIlIIIIIllllIlI, llllllllllllIllIlIIlIIIIIllllIll)) {
                this.dropItem(Items.blaze_rod, EntityBlaze.llIlIlllIIllll[0]);
                "".length();
                ++llllllllllllIllIlIIlIIIIIllllIlI;
            }
        }
    }
    
    @Override
    protected String getDeathSound() {
        return EntityBlaze.llIlIlllIIllII[EntityBlaze.llIlIlllIIllll[7]];
    }
    
    private static boolean lIIlIlIllIllIlIl(final int llllllllllllIllIlIIlIIIIIIlIllll) {
        return llllllllllllIllIlIIlIIIIIIlIllll > 0;
    }
    
    @Override
    public float getBrightness(final float llllllllllllIllIlIIlIIIIlIIlIlll) {
        return 1.0f;
    }
    
    private static int lIIlIlIllIllIIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIlIlIllIllIIIl(final int llllllllllllIllIlIIlIIIIIlIIIIII, final int llllllllllllIllIlIIlIIIIIIllllll) {
        return llllllllllllIllIlIIlIIIIIlIIIIII >= llllllllllllIllIlIIlIIIIIIllllll;
    }
    
    private static void lIIlIlIllIlIllII() {
        (llIlIlllIIllll = new int[14])[0] = " ".length();
        EntityBlaze.llIlIlllIIllll[1] = (0x10 ^ 0x1A);
        EntityBlaze.llIlIlllIIllll[2] = (0x5C ^ 0x58);
        EntityBlaze.llIlIlllIIllll[3] = (86 + 89 - 64 + 52 ^ 83 + 156 - 186 + 113);
        EntityBlaze.llIlIlllIIllll[4] = (0x7F ^ 0x78);
        EntityBlaze.llIlIlllIIllll[5] = (0x56 ^ 0x5E);
        EntityBlaze.llIlIlllIIllll[6] = ((0xF7 ^ 0xBF) & ~(0x3 ^ 0x4B));
        EntityBlaze.llIlIlllIIllll[7] = "  ".length();
        EntityBlaze.llIlIlllIIllll[8] = (0x51 ^ 0x41);
        EntityBlaze.llIlIlllIIllll[9] = (0xFFFFFBF8 & 0xF004F7);
        EntityBlaze.llIlIlllIIllll[10] = (0x4D ^ 0x55);
        EntityBlaze.llIlIlllIIllll[11] = "   ".length();
        EntityBlaze.llIlIlllIIllll[12] = (0xA7 ^ 0xC3);
        EntityBlaze.llIlIlllIIllll[13] = -"  ".length();
    }
    
    private static int lIIlIlIllIlIllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void onLivingUpdate() {
        if (lIIlIlIllIlIlllI(this.onGround ? 1 : 0) && lIIlIlIllIlIllll(lIIlIlIllIlIllIl(this.motionY, 0.0))) {
            this.motionY *= 0.6;
        }
        if (lIIlIlIllIllIIII(this.worldObj.isRemote ? 1 : 0)) {
            if (lIIlIlIllIlIlllI(this.rand.nextInt(EntityBlaze.llIlIlllIIllll[10])) && lIIlIlIllIlIlllI(this.isSilent() ? 1 : 0)) {
                this.worldObj.playSound(this.posX + 0.5, this.posY + 0.5, this.posZ + 0.5, EntityBlaze.llIlIlllIIllII[EntityBlaze.llIlIlllIIllll[11]], 1.0f + this.rand.nextFloat(), this.rand.nextFloat() * 0.7f + 0.3f, (boolean)(EntityBlaze.llIlIlllIIllll[6] != 0));
            }
            int llllllllllllIllIlIIlIIIIlIIlIIll = EntityBlaze.llIlIlllIIllll[6];
            "".length();
            if ("   ".length() < "  ".length()) {
                return;
            }
            while (!lIIlIlIllIllIIIl(llllllllllllIllIlIIlIIIIlIIlIIll, EntityBlaze.llIlIlllIIllll[7])) {
                this.worldObj.spawnParticle(EnumParticleTypes.SMOKE_LARGE, this.posX + (this.rand.nextDouble() - 0.5) * this.width, this.posY + this.rand.nextDouble() * this.height, this.posZ + (this.rand.nextDouble() - 0.5) * this.width, 0.0, 0.0, 0.0, new int[EntityBlaze.llIlIlllIIllll[6]]);
                ++llllllllllllIllIlIIlIIIIlIIlIIll;
            }
        }
        super.onLivingUpdate();
    }
    
    private static boolean lIIlIlIllIllIlII(final Object llllllllllllIllIlIIlIIIIIIlllIIl) {
        return llllllllllllIllIlIIlIIIIIIlllIIl != null;
    }
    
    private static String lIIlIlIllIlIIlIl(String llllllllllllIllIlIIlIIIIIlIllIII, final String llllllllllllIllIlIIlIIIIIlIlllII) {
        llllllllllllIllIlIIlIIIIIlIllIII = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIlIIIIIlIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlIIIIIlIllIll = new StringBuilder();
        final char[] llllllllllllIllIlIIlIIIIIlIllIlI = llllllllllllIllIlIIlIIIIIlIlllII.toCharArray();
        int llllllllllllIllIlIIlIIIIIlIllIIl = EntityBlaze.llIlIlllIIllll[6];
        final double llllllllllllIllIlIIlIIIIIlIlIIll = (Object)((String)llllllllllllIllIlIIlIIIIIlIllIII).toCharArray();
        final float llllllllllllIllIlIIlIIIIIlIlIIlI = llllllllllllIllIlIIlIIIIIlIlIIll.length;
        byte llllllllllllIllIlIIlIIIIIlIlIIIl = (byte)EntityBlaze.llIlIlllIIllll[6];
        while (lIIlIlIllIllIlll(llllllllllllIllIlIIlIIIIIlIlIIIl, (int)llllllllllllIllIlIIlIIIIIlIlIIlI)) {
            final char llllllllllllIllIlIIlIIIIIlIllllI = llllllllllllIllIlIIlIIIIIlIlIIll[llllllllllllIllIlIIlIIIIIlIlIIIl];
            llllllllllllIllIlIIlIIIIIlIllIll.append((char)(llllllllllllIllIlIIlIIIIIlIllllI ^ llllllllllllIllIlIIlIIIIIlIllIlI[llllllllllllIllIlIIlIIIIIlIllIIl % llllllllllllIllIlIIlIIIIIlIllIlI.length]));
            "".length();
            ++llllllllllllIllIlIIlIIIIIlIllIIl;
            ++llllllllllllIllIlIIlIIIIIlIlIIIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlIIIIIlIllIll);
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(6.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(48.0);
    }
    
    static {
        lIIlIlIllIlIllII();
        lIIlIlIllIlIlIII();
    }
    
    @Override
    public boolean isBurning() {
        return this.func_70845_n();
    }
    
    @Override
    protected boolean isValidLightLevel() {
        return EntityBlaze.llIlIlllIIllll[0] != 0;
    }
    
    public void setOnFire(final boolean llllllllllllIllIlIIlIIIIIllIlIlI) {
        byte llllllllllllIllIlIIlIIIIIllIllII = this.dataWatcher.getWatchableObjectByte(EntityBlaze.llIlIlllIIllll[8]);
        if (lIIlIlIllIllIIII(llllllllllllIllIlIIlIIIIIllIlIlI ? 1 : 0)) {
            llllllllllllIllIlIIlIIIIIllIllII |= (byte)EntityBlaze.llIlIlllIIllll[0];
            "".length();
            if (" ".length() >= "   ".length()) {
                return;
            }
        }
        else {
            llllllllllllIllIlIIlIIIIIllIllII &= (byte)EntityBlaze.llIlIlllIIllll[13];
        }
        this.dataWatcher.updateObject(EntityBlaze.llIlIlllIIllll[8], llllllllllllIllIlIIlIIIIIllIllII);
    }
    
    @Override
    protected String getHurtSound() {
        return EntityBlaze.llIlIlllIIllII[EntityBlaze.llIlIlllIIllll[0]];
    }
    
    public boolean func_70845_n() {
        if (lIIlIlIllIllIIII(this.dataWatcher.getWatchableObjectByte(EntityBlaze.llIlIlllIIllll[8]) & EntityBlaze.llIlIlllIIllll[0])) {
            return EntityBlaze.llIlIlllIIllll[0] != 0;
        }
        return EntityBlaze.llIlIlllIIllll[6] != 0;
    }
    
    private static boolean lIIlIlIllIllIIII(final int llllllllllllIllIlIIlIIIIIIllIlll) {
        return llllllllllllIllIlIIlIIIIIIllIlll != 0;
    }
    
    @Override
    protected Item getDropItem() {
        return Items.blaze_rod;
    }
    
    @Override
    public void fall(final float llllllllllllIllIlIIlIIIIlIIIlIIl, final float llllllllllllIllIlIIlIIIIlIIIlIII) {
    }
    
    private static boolean lIIlIlIllIllIIll(final int llllllllllllIllIlIIlIIIIIIllIIIl) {
        return llllllllllllIllIlIIlIIIIIIllIIIl <= 0;
    }
    
    @Override
    public int getBrightnessForRender(final float llllllllllllIllIlIIlIIIIlIIllIIl) {
        return EntityBlaze.llIlIlllIIllll[9];
    }
    
    private static void lIIlIlIllIlIlIII() {
        (llIlIlllIIllII = new String[EntityBlaze.llIlIlllIIllll[2]])[EntityBlaze.llIlIlllIIllll[6]] = lIIlIlIllIlIIlIl("Jy4rdyMmIDM8bygzLDg1IiQ=", "JAIYA");
        EntityBlaze.llIlIlllIIllII[EntityBlaze.llIlIlllIIllll[0]] = lIIlIlIllIlIIlIl("OScqdCo4KTI/ZjwhPA==", "THHZH");
        EntityBlaze.llIlIlllIIllII[EntityBlaze.llIlIlllIIllll[7]] = lIIlIlIllIlIIlll("jZ9fwnq6qLOPhiAe/i4+rw==", "OWrHH");
        EntityBlaze.llIlIlllIIllII[EntityBlaze.llIlIlllIIllll[11]] = lIIlIlIllIlIIlll("CqMVKF3ZLG6xbIlAI5gsVw==", "BmQSM");
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityBlaze.llIlIlllIIllll[8], new Byte((byte)EntityBlaze.llIlIlllIIllll[6]));
    }
    
    private static boolean lIIlIlIllIlIlllI(final int llllllllllllIllIlIIlIIIIIIllIlIl) {
        return llllllllllllIllIlIIlIIIIIIllIlIl == 0;
    }
    
    @Override
    protected void updateAITasks() {
        if (lIIlIlIllIllIIII(this.isWet() ? 1 : 0)) {
            this.attackEntityFrom(DamageSource.drown, 1.0f);
            "".length();
        }
        this.heightOffsetUpdateTime -= EntityBlaze.llIlIlllIIllll[0];
        if (lIIlIlIllIllIIll(this.heightOffsetUpdateTime)) {
            this.heightOffsetUpdateTime = EntityBlaze.llIlIlllIIllll[12];
            this.heightOffset = 0.5f + (float)this.rand.nextGaussian() * 3.0f;
        }
        final EntityLivingBase llllllllllllIllIlIIlIIIIlIIIllIl = this.getAttackTarget();
        if (lIIlIlIllIllIlII(llllllllllllIllIlIIlIIIIlIIIllIl) && lIIlIlIllIllIlIl(lIIlIlIllIllIIlI(llllllllllllIllIlIIlIIIIlIIIllIl.posY + llllllllllllIllIlIIlIIIIlIIIllIl.getEyeHeight(), this.posY + this.getEyeHeight() + this.heightOffset))) {
            this.motionY += (0.30000001192092896 - this.motionY) * 0.30000001192092896;
            this.isAirBorne = (EntityBlaze.llIlIlllIIllll[0] != 0);
        }
        super.updateAITasks();
    }
    
    public EntityBlaze(final World llllllllllllIllIlIIlIIIIlIlIIlII) {
        super(llllllllllllIllIlIIlIIIIlIlIIlII);
        this.heightOffset = 0.5f;
        this.isImmuneToFire = (EntityBlaze.llIlIlllIIllll[0] != 0);
        this.experienceValue = EntityBlaze.llIlIlllIIllll[1];
        this.tasks.addTask(EntityBlaze.llIlIlllIIllll[2], new AIFireballAttack(this));
        this.tasks.addTask(EntityBlaze.llIlIlllIIllll[3], new EntityAIMoveTowardsRestriction(this, 1.0));
        this.tasks.addTask(EntityBlaze.llIlIlllIIllll[4], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityBlaze.llIlIlllIIllll[5], new EntityAIWatchClosest(this, EntityPlayer.class, 8.0f));
        this.tasks.addTask(EntityBlaze.llIlIlllIIllll[5], new EntityAILookIdle(this));
        this.targetTasks.addTask(EntityBlaze.llIlIlllIIllll[0], new EntityAIHurtByTarget(this, (boolean)(EntityBlaze.llIlIlllIIllll[0] != 0), new Class[EntityBlaze.llIlIlllIIllll[6]]));
        this.targetTasks.addTask(EntityBlaze.llIlIlllIIllll[7], new EntityAINearestAttackableTarget<Object>(this, EntityPlayer.class, (boolean)(EntityBlaze.llIlIlllIIllll[0] != 0)));
    }
    
    static class AIFireballAttack extends EntityAIBase
    {
        private /* synthetic */ EntityBlaze blaze;
        private static final /* synthetic */ int[] lIlllIlllIlIll;
        private /* synthetic */ int field_179468_c;
        private /* synthetic */ int field_179467_b;
        
        public AIFireballAttack() {
            this.setMutexBits(AIFireballAttack.lIlllIlllIlIll[0]);
        }
        
        @Override
        public void startExecuting() {
            this.field_179467_b = AIFireballAttack.lIlllIlllIlIll[2];
        }
        
        private static void lIIIIIllIlllllIl() {
            (lIlllIlllIlIll = new int[9])[0] = "   ".length();
            AIFireballAttack.lIlllIlllIlIll[1] = " ".length();
            AIFireballAttack.lIlllIlllIlIll[2] = ((0x1A ^ 0x39 ^ (0x84 ^ 0xB8)) & (39 + 102 - 115 + 190 ^ 116 + 75 - 176 + 184 ^ -" ".length()));
            AIFireballAttack.lIlllIlllIlIll[3] = (0xB3 ^ 0xA7);
            AIFireballAttack.lIlllIlllIlIll[4] = (0x7D ^ 0x41);
            AIFireballAttack.lIlllIlllIlIll[5] = (0x74 ^ 0x70);
            AIFireballAttack.lIlllIlllIlIll[6] = (0x8A ^ 0x8C);
            AIFireballAttack.lIlllIlllIlIll[7] = (0x57 ^ 0x33);
            AIFireballAttack.lIlllIlllIlIll[8] = (0xFFFF8BF5 & 0x77FB);
        }
        
        private static boolean lIIIIIlllIIIIIlI(final int llllllllllllIllllIllIlIllIlllIll) {
            return llllllllllllIllllIllIlIllIlllIll <= 0;
        }
        
        private static boolean lIIIIIlllIIIIllI(final int llllllllllllIllllIllIlIlllIIllII, final int llllllllllllIllllIllIlIlllIIlIll) {
            return llllllllllllIllllIllIlIlllIIllII >= llllllllllllIllllIllIlIlllIIlIll;
        }
        
        static {
            lIIIIIllIlllllIl();
        }
        
        private static boolean lIIIIIlllIIIIlIl(final int llllllllllllIllllIllIlIlllIIIlII, final int llllllllllllIllllIllIlIlllIIIIll) {
            return llllllllllllIllllIllIlIlllIIIlII > llllllllllllIllllIllIlIlllIIIIll;
        }
        
        @Override
        public void resetTask() {
            this.blaze.setOnFire((boolean)(AIFireballAttack.lIlllIlllIlIll[2] != 0));
        }
        
        @Override
        public void updateTask() {
            this.field_179468_c -= AIFireballAttack.lIlllIlllIlIll[1];
            final EntityLivingBase llllllllllllIllllIllIlIllllIIIll = this.blaze.getAttackTarget();
            final double llllllllllllIllllIllIlIllllIIIlI = this.blaze.getDistanceSqToEntity(llllllllllllIllllIllIlIllllIIIll);
            if (lIIIIIlllIIIIIIl(lIIIIIlllIIIIIII(llllllllllllIllllIllIlIllllIIIlI, 4.0))) {
                if (lIIIIIlllIIIIIlI(this.field_179468_c)) {
                    this.field_179468_c = AIFireballAttack.lIlllIlllIlIll[3];
                    this.blaze.attackEntityAsMob(llllllllllllIllllIllIlIllllIIIll);
                    "".length();
                }
                this.blaze.getMoveHelper().setMoveTo(llllllllllllIllllIllIlIllllIIIll.posX, llllllllllllIllllIllIlIllllIIIll.posY, llllllllllllIllllIllIlIllllIIIll.posZ, 1.0);
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else if (lIIIIIlllIIIIIIl(lIIIIIlllIIIIIII(llllllllllllIllllIllIlIllllIIIlI, 256.0))) {
                final double llllllllllllIllllIllIlIllllIIIIl = llllllllllllIllllIllIlIllllIIIll.posX - this.blaze.posX;
                final double llllllllllllIllllIllIlIllllIIIII = llllllllllllIllllIllIlIllllIIIll.getEntityBoundingBox().minY + llllllllllllIllllIllIlIllllIIIll.height / 2.0f - (this.blaze.posY + this.blaze.height / 2.0f);
                final double llllllllllllIllllIllIlIlllIlllll = llllllllllllIllllIllIlIllllIIIll.posZ - this.blaze.posZ;
                if (lIIIIIlllIIIIIlI(this.field_179468_c)) {
                    this.field_179467_b += AIFireballAttack.lIlllIlllIlIll[1];
                    if (lIIIIIlllIIIIIll(this.field_179467_b, AIFireballAttack.lIlllIlllIlIll[1])) {
                        this.field_179468_c = AIFireballAttack.lIlllIlllIlIll[4];
                        this.blaze.setOnFire((boolean)(AIFireballAttack.lIlllIlllIlIll[1] != 0));
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    }
                    else if (lIIIIIlllIIIIlII(this.field_179467_b, AIFireballAttack.lIlllIlllIlIll[5])) {
                        this.field_179468_c = AIFireballAttack.lIlllIlllIlIll[6];
                        "".length();
                        if ((71 + 77 - 17 + 57 ^ 117 + 96 - 192 + 163) == " ".length()) {
                            return;
                        }
                    }
                    else {
                        this.field_179468_c = AIFireballAttack.lIlllIlllIlIll[7];
                        this.field_179467_b = AIFireballAttack.lIlllIlllIlIll[2];
                        this.blaze.setOnFire((boolean)(AIFireballAttack.lIlllIlllIlIll[2] != 0));
                    }
                    if (lIIIIIlllIIIIlIl(this.field_179467_b, AIFireballAttack.lIlllIlllIlIll[1])) {
                        final float llllllllllllIllllIllIlIlllIllllI = MathHelper.sqrt_float(MathHelper.sqrt_double(llllllllllllIllllIllIlIllllIIIlI)) * 0.5f;
                        this.blaze.worldObj.playAuxSFXAtEntity(null, AIFireballAttack.lIlllIlllIlIll[8], new BlockPos((int)this.blaze.posX, (int)this.blaze.posY, (int)this.blaze.posZ), AIFireballAttack.lIlllIlllIlIll[2]);
                        int llllllllllllIllllIllIlIlllIlllIl = AIFireballAttack.lIlllIlllIlIll[2];
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                        while (!lIIIIIlllIIIIllI(llllllllllllIllllIllIlIlllIlllIl, AIFireballAttack.lIlllIlllIlIll[1])) {
                            final EntitySmallFireball llllllllllllIllllIllIlIlllIlllII = new EntitySmallFireball(this.blaze.worldObj, this.blaze, llllllllllllIllllIllIlIllllIIIIl + this.blaze.getRNG().nextGaussian() * llllllllllllIllllIllIlIlllIllllI, llllllllllllIllllIllIlIllllIIIII, llllllllllllIllllIllIlIlllIlllll + this.blaze.getRNG().nextGaussian() * llllllllllllIllllIllIlIlllIllllI);
                            llllllllllllIllllIllIlIlllIlllII.posY = this.blaze.posY + this.blaze.height / 2.0f + 0.5;
                            this.blaze.worldObj.spawnEntityInWorld(llllllllllllIllllIllIlIlllIlllII);
                            "".length();
                            ++llllllllllllIllllIllIlIlllIlllIl;
                        }
                    }
                }
                this.blaze.getLookHelper().setLookPositionWithEntity(llllllllllllIllllIllIlIllllIIIll, 10.0f, 10.0f);
                "".length();
                if ("   ".length() >= (0x24 ^ 0x20)) {
                    return;
                }
            }
            else {
                this.blaze.getNavigator().clearPathEntity();
                this.blaze.getMoveHelper().setMoveTo(llllllllllllIllllIllIlIllllIIIll.posX, llllllllllllIllllIllIlIllllIIIll.posY, llllllllllllIllllIllIlIllllIIIll.posZ, 1.0);
            }
            super.updateTask();
        }
        
        private static int lIIIIIlllIIIIIII(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        private static boolean lIIIIIllIllllllI(final Object llllllllllllIllllIllIlIlllIIIIIl) {
            return llllllllllllIllllIllIlIlllIIIIIl != null;
        }
        
        @Override
        public boolean shouldExecute() {
            final EntityLivingBase llllllllllllIllllIllIlIlllllIllI = this.blaze.getAttackTarget();
            if (lIIIIIllIllllllI(llllllllllllIllllIllIlIlllllIllI) && lIIIIIllIlllllll(llllllllllllIllllIllIlIlllllIllI.isEntityAlive() ? 1 : 0)) {
                return AIFireballAttack.lIlllIlllIlIll[1] != 0;
            }
            return AIFireballAttack.lIlllIlllIlIll[2] != 0;
        }
        
        private static boolean lIIIIIlllIIIIlII(final int llllllllllllIllllIllIlIlllIIlIII, final int llllllllllllIllllIllIlIlllIIIlll) {
            return llllllllllllIllllIllIlIlllIIlIII <= llllllllllllIllllIllIlIlllIIIlll;
        }
        
        private static boolean lIIIIIllIlllllll(final int llllllllllllIllllIllIlIllIllllll) {
            return llllllllllllIllllIllIlIllIllllll != 0;
        }
        
        private static boolean lIIIIIlllIIIIIIl(final int llllllllllllIllllIllIlIllIllllIl) {
            return llllllllllllIllllIllIlIllIllllIl < 0;
        }
        
        private static boolean lIIIIIlllIIIIIll(final int llllllllllllIllllIllIlIlllIlIIII, final int llllllllllllIllllIllIlIlllIIllll) {
            return llllllllllllIllllIllIlIlllIlIIII == llllllllllllIllllIllIlIlllIIllll;
        }
    }
}
