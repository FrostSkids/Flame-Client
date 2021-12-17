// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.monster;

import java.util.Random;
import net.minecraft.util.MathHelper;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.entity.ai.EntityMoveHelper;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIFindEntityNearestPlayer;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.world.World;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.DataWatcher;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EntityFlying;

public class EntityGhast extends EntityFlying implements IMob
{
    private static final /* synthetic */ String[] lIlIIlIIIlIlll;
    private /* synthetic */ int explosionStrength;
    private static final /* synthetic */ int[] lIlIIlIIIllIIl;
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIIIlllIIlIIIllIIIll, final float lllllllllllllIIIlllIIlIIIllIIIlI) {
        if (lllIIlIlIlIIIII(this.isEntityInvulnerable(lllllllllllllIIIlllIIlIIIllIIIll) ? 1 : 0)) {
            return EntityGhast.lIlIIlIIIllIIl[4] != 0;
        }
        if (lllIIlIlIlIIIII(EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[4]].equals(lllllllllllllIIIlllIIlIIIllIIIll.getDamageType()) ? 1 : 0) && lllIIlIlIlIIIII((lllllllllllllIIIlllIIlIIIllIIIll.getEntity() instanceof EntityPlayer) ? 1 : 0)) {
            super.attackEntityFrom(lllllllllllllIIIlllIIlIIIllIIIll, 1000.0f);
            "".length();
            ((EntityPlayer)lllllllllllllIIIlllIIlIIIllIIIll.getEntity()).triggerAchievement(AchievementList.ghast);
            return EntityGhast.lIlIIlIIIllIIl[0] != 0;
        }
        return super.attackEntityFrom(lllllllllllllIIIlllIIlIIIllIIIll, lllllllllllllIIIlllIIlIIIllIIIlI);
    }
    
    @Override
    protected float getSoundVolume() {
        return 10.0f;
    }
    
    private static void lllIIlIlIIlIlll() {
        (lIlIIlIIIlIlll = new String[EntityGhast.lIlIIlIIIllIIl[2]])[EntityGhast.lIlIIlIIIllIIl[4]] = lllIIlIlIIlIIlI("okHpMGmEi7tra4IUs+hekQ==", "uZJGV");
        EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[0]] = lllIIlIlIIlIIlI("8Xvnx1LfJIAvaciS4++74w==", "YHlDG");
        EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[5]] = lllIIlIlIIlIIlI("el+tQ8ba3o4pgsOUY/He1iZdmZosyqvB", "kDypo");
        EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[6]] = lllIIlIlIIlIIlI("Z0mxviyN1JAw22op0xVgAg==", "CxZoJ");
        EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[8]] = lllIIlIlIIlIlIl("T2vnfG3vvNjJa7j+N5UvpQ==", "GMKMi");
        EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[1]] = lllIIlIlIIlIllI("BwsiAQQxGj0DOy0ENx8=", "BsRmk");
        EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[10]] = lllIIlIlIIlIIlI("CPJxaJXIInNcL9g2ZyxtTA==", "dzNzH");
    }
    
    @Override
    protected String getLivingSound() {
        return EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[0]];
    }
    
    private static boolean lllIIlIlIlIIlIl(final int lllllllllllllIIIlllIIIllllllllII, final int lllllllllllllIIIlllIIIlllllllIll) {
        return lllllllllllllIIIlllIIIllllllllII < lllllllllllllIIIlllIIIlllllllIll;
    }
    
    private static boolean lllIIlIlIlIIIIl(final int lllllllllllllIIIlllIIIlllllIllll) {
        return lllllllllllllIIIlllIIIlllllIllll == 0;
    }
    
    @Override
    protected String getDeathSound() {
        return EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[6]];
    }
    
    @Override
    public void onUpdate() {
        super.onUpdate();
        if (lllIIlIlIlIIIIl(this.worldObj.isRemote ? 1 : 0) && lllIIlIlIlIIIlI(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL)) {
            this.setDead();
        }
    }
    
    @Override
    public boolean getCanSpawnHere() {
        if (lllIIlIlIlIIIIl(this.rand.nextInt(EntityGhast.lIlIIlIIIllIIl[7])) && lllIIlIlIlIIIII(super.getCanSpawnHere() ? 1 : 0) && lllIIlIlIlIIlII(this.worldObj.getDifficulty(), EnumDifficulty.PEACEFUL)) {
            return EntityGhast.lIlIIlIIIllIIl[0] != 0;
        }
        return EntityGhast.lIlIIlIIIllIIl[4] != 0;
    }
    
    private static boolean lllIIlIlIlIIIlI(final Object lllllllllllllIIIlllIIIllllllIlII, final Object lllllllllllllIIIlllIIIllllllIIll) {
        return lllllllllllllIIIlllIIIllllllIlII == lllllllllllllIIIlllIIIllllllIIll;
    }
    
    private static void lllIIlIlIIlllll() {
        (lIlIIlIIIllIIl = new int[12])[0] = " ".length();
        EntityGhast.lIlIIlIIIllIIl[1] = (0xFB ^ 0xB5 ^ (0x10 ^ 0x5B));
        EntityGhast.lIlIIlIIIllIIl[2] = (0xB5 ^ 0xB2);
        EntityGhast.lIlIIlIIIllIIl[3] = (0x5F ^ 0x62 ^ (0xE ^ 0x23));
        EntityGhast.lIlIIlIIIllIIl[4] = (" ".length() & ~" ".length());
        EntityGhast.lIlIIlIIIllIIl[5] = "  ".length();
        EntityGhast.lIlIIlIIIllIIl[6] = "   ".length();
        EntityGhast.lIlIIlIIIllIIl[7] = (40 + 118 - 59 + 81 ^ 84 + 23 - 8 + 61);
        EntityGhast.lIlIIlIIIllIIl[8] = (0x66 ^ 0xB ^ (0x25 ^ 0x4C));
        EntityGhast.lIlIIlIIIllIIl[9] = (0x5F ^ 0x7C ^ (0xE9 ^ 0xA9));
        EntityGhast.lIlIIlIIIllIIl[10] = (0x13 ^ 0x70 ^ (0x58 ^ 0x3D));
        EntityGhast.lIlIIlIIIllIIl[11] = (0x9F ^ 0x81 ^ (0x4D ^ 0x5B));
    }
    
    @Override
    protected Item getDropItem() {
        return Items.gunpowder;
    }
    
    private static String lllIIlIlIIlIllI(String lllllllllllllIIIlllIIlIIIIIlllIl, final String lllllllllllllIIIlllIIlIIIIIlllII) {
        lllllllllllllIIIlllIIlIIIIIlllIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllIIlIIIIIllIll = new StringBuilder();
        final char[] lllllllllllllIIIlllIIlIIIIIllIlI = lllllllllllllIIIlllIIlIIIIIlllII.toCharArray();
        int lllllllllllllIIIlllIIlIIIIIllIIl = EntityGhast.lIlIIlIIIllIIl[4];
        final short lllllllllllllIIIlllIIlIIIIIlIIll = (Object)lllllllllllllIIIlllIIlIIIIIlllIl.toCharArray();
        final char lllllllllllllIIIlllIIlIIIIIlIIlI = (char)lllllllllllllIIIlllIIlIIIIIlIIll.length;
        byte lllllllllllllIIIlllIIlIIIIIlIIIl = (byte)EntityGhast.lIlIIlIIIllIIl[4];
        while (lllIIlIlIlIIlIl(lllllllllllllIIIlllIIlIIIIIlIIIl, lllllllllllllIIIlllIIlIIIIIlIIlI)) {
            final char lllllllllllllIIIlllIIlIIIIIllllI = lllllllllllllIIIlllIIlIIIIIlIIll[lllllllllllllIIIlllIIlIIIIIlIIIl];
            lllllllllllllIIIlllIIlIIIIIllIll.append((char)(lllllllllllllIIIlllIIlIIIIIllllI ^ lllllllllllllIIIlllIIlIIIIIllIlI[lllllllllllllIIIlllIIlIIIIIllIIl % lllllllllllllIIIlllIIlIIIIIllIlI.length]));
            "".length();
            ++lllllllllllllIIIlllIIlIIIIIllIIl;
            ++lllllllllllllIIIlllIIlIIIIIlIIIl;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllIIlIIIIIllIll);
    }
    
    static {
        lllIIlIlIIlllll();
        lllIIlIlIIlIlll();
    }
    
    @Override
    public float getEyeHeight() {
        return 2.6f;
    }
    
    private static boolean lllIIlIlIlIIIll(final int lllllllllllllIIIlllIIlIIIIIIIIII, final int lllllllllllllIIIlllIIIllllllllll) {
        return lllllllllllllIIIlllIIlIIIIIIIIII >= lllllllllllllIIIlllIIIllllllllll;
    }
    
    public void setAttacking(final boolean lllllllllllllIIIlllIIlIIIlllIIII) {
        final DataWatcher dataWatcher = this.dataWatcher;
        final int llllllllllllIllIlIIlIIlllIIIIlIl = EntityGhast.lIlIIlIIIllIIl[3];
        int n;
        if (lllIIlIlIlIIIII(lllllllllllllIIIlllIIlIIIlllIIII ? 1 : 0)) {
            n = EntityGhast.lIlIIlIIIllIIl[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n = EntityGhast.lIlIIlIIIllIIl[4];
        }
        dataWatcher.updateObject(llllllllllllIllIlIIlIIlllIIIIlIl, (byte)n);
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIIIlllIIlIIIIlllllI) {
        super.writeEntityToNBT(lllllllllllllIIIlllIIlIIIIlllllI);
        lllllllllllllIIIlllIIlIIIIlllllI.setInteger(EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[8]], this.explosionStrength);
    }
    
    public int getFireballStrength() {
        return this.explosionStrength;
    }
    
    private static boolean lllIIlIlIlIIlII(final Object lllllllllllllIIIlllIIIlllllllIII, final Object lllllllllllllIIIlllIIIllllllIlll) {
        return lllllllllllllIIIlllIIIlllllllIII != lllllllllllllIIIlllIIIllllllIlll;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(100.0);
    }
    
    @Override
    protected void dropFewItems(final boolean lllllllllllllIIIlllIIlIIIlIIllll, final int lllllllllllllIIIlllIIlIIIlIIlllI) {
        int lllllllllllllIIIlllIIlIIIlIIllIl = this.rand.nextInt(EntityGhast.lIlIIlIIIllIIl[5]) + this.rand.nextInt(EntityGhast.lIlIIlIIIllIIl[0] + lllllllllllllIIIlllIIlIIIlIIlllI);
        int lllllllllllllIIIlllIIlIIIlIIllII = EntityGhast.lIlIIlIIIllIIl[4];
        "".length();
        if (-"  ".length() >= 0) {
            return;
        }
        while (!lllIIlIlIlIIIll(lllllllllllllIIIlllIIlIIIlIIllII, lllllllllllllIIIlllIIlIIIlIIllIl)) {
            this.dropItem(Items.ghast_tear, EntityGhast.lIlIIlIIIllIIl[0]);
            "".length();
            ++lllllllllllllIIIlllIIlIIIlIIllII;
        }
        lllllllllllllIIIlllIIlIIIlIIllIl = this.rand.nextInt(EntityGhast.lIlIIlIIIllIIl[6]) + this.rand.nextInt(EntityGhast.lIlIIlIIIllIIl[0] + lllllllllllllIIIlllIIlIIIlIIlllI);
        int lllllllllllllIIIlllIIlIIIlIIlIll = EntityGhast.lIlIIlIIIllIIl[4];
        "".length();
        if ("  ".length() <= -" ".length()) {
            return;
        }
        while (!lllIIlIlIlIIIll(lllllllllllllIIIlllIIlIIIlIIlIll, lllllllllllllIIIlllIIlIIIlIIllIl)) {
            this.dropItem(Items.gunpowder, EntityGhast.lIlIIlIIIllIIl[0]);
            "".length();
            ++lllllllllllllIIIlllIIlIIIlIIlIll;
        }
    }
    
    public EntityGhast(final World lllllllllllllIIIlllIIlIIIlllIlll) {
        super(lllllllllllllIIIlllIIlIIIlllIlll);
        this.explosionStrength = EntityGhast.lIlIIlIIIllIIl[0];
        this.setSize(4.0f, 4.0f);
        this.isImmuneToFire = (EntityGhast.lIlIIlIIIllIIl[0] != 0);
        this.experienceValue = EntityGhast.lIlIIlIIIllIIl[1];
        this.moveHelper = new GhastMoveHelper(this);
        this.tasks.addTask(EntityGhast.lIlIIlIIIllIIl[1], new AIRandomFly(this));
        this.tasks.addTask(EntityGhast.lIlIIlIIIllIIl[2], new AILookAround(this));
        this.tasks.addTask(EntityGhast.lIlIIlIIIllIIl[2], new AIFireballAttack(this));
        this.targetTasks.addTask(EntityGhast.lIlIIlIIIllIIl[0], new EntityAIFindEntityNearestPlayer(this));
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityGhast.lIlIIlIIIllIIl[3], (byte)EntityGhast.lIlIIlIIIllIIl[4]);
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIIIlllIIlIIIIllIllI) {
        super.readEntityFromNBT(lllllllllllllIIIlllIIlIIIIllIllI);
        if (lllIIlIlIlIIIII(lllllllllllllIIIlllIIlIIIIllIllI.hasKey(EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[1]], EntityGhast.lIlIIlIIIllIIl[9]) ? 1 : 0)) {
            this.explosionStrength = lllllllllllllIIIlllIIlIIIIllIllI.getInteger(EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[10]]);
        }
    }
    
    private static boolean lllIIlIlIlIIIII(final int lllllllllllllIIIlllIIIllllllIIIl) {
        return lllllllllllllIIIlllIIIllllllIIIl != 0;
    }
    
    private static String lllIIlIlIIlIlIl(final String lllllllllllllIIIlllIIlIIIIlIllIl, final String lllllllllllllIIIlllIIlIIIIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIlIIIIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIlIIIIlIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlllIIlIIIIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlllIIlIIIIlIllll.init(EntityGhast.lIlIIlIIIllIIl[5], lllllllllllllIIIlllIIlIIIIllIIII);
            return new String(lllllllllllllIIIlllIIlIIIIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIIIIlIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIlIIIIlIlllI) {
            lllllllllllllIIIlllIIlIIIIlIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected String getHurtSound() {
        return EntityGhast.lIlIIlIIIlIlll[EntityGhast.lIlIIlIIIllIIl[5]];
    }
    
    private static String lllIIlIlIIlIIlI(final String lllllllllllllIIIlllIIlIIIIIIIllI, final String lllllllllllllIIIlllIIlIIIIIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIIlllIIlIIIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlllIIlIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), EntityGhast.lIlIIlIIIllIIl[11]), "DES");
            final Cipher lllllllllllllIIIlllIIlIIIIIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIIlllIIlIIIIIIlIlI.init(EntityGhast.lIlIIlIIIllIIl[5], lllllllllllllIIIlllIIlIIIIIIlIll);
            return new String(lllllllllllllIIIlllIIlIIIIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlllIIlIIIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlllIIlIIIIIIlIIl) {
            lllllllllllllIIIlllIIlIIIIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    public boolean isAttacking() {
        if (lllIIlIlIlIIIII(this.dataWatcher.getWatchableObjectByte(EntityGhast.lIlIIlIIIllIIl[3]))) {
            return EntityGhast.lIlIIlIIIllIIl[0] != 0;
        }
        return EntityGhast.lIlIIlIIIllIIl[4] != 0;
    }
    
    @Override
    public int getMaxSpawnedInChunk() {
        return EntityGhast.lIlIIlIIIllIIl[0];
    }
    
    static class AIFireballAttack extends EntityAIBase
    {
        private /* synthetic */ EntityGhast parentEntity;
        public /* synthetic */ int attackTimer;
        private static final /* synthetic */ int[] lllIlIlllIIlll;
        
        public AIFireballAttack() {
        }
        
        private static boolean lIlIIIllIlllIlll(final int llllllllllllIlIllIlIIllIIlIlIlII) {
            return llllllllllllIlIllIlIIllIIlIlIlII != 0;
        }
        
        private static void lIlIIIllIlllIIll() {
            (lllIlIlllIIlll = new int[7])[0] = " ".length();
            AIFireballAttack.lllIlIlllIIlll[1] = (("   ".length() ^ (0x7E ^ 0x53)) & (50 + 88 - 8 + 32 ^ 61 + 99 - 38 + 18 ^ -" ".length()));
            AIFireballAttack.lllIlIlllIIlll[2] = (69 + 163 - 220 + 172 ^ 55 + 158 - 210 + 175);
            AIFireballAttack.lllIlIlllIIlll[3] = (-(0xFFFFFC39 & 0x7FD7) & (-1 & 0x7FFF));
            AIFireballAttack.lllIlIlllIIlll[4] = (0x82 ^ 0xB6 ^ (0x32 ^ 0x12));
            AIFireballAttack.lllIlIlllIIlll[5] = (0xFFFFB3FB & 0x4FF4);
            AIFireballAttack.lllIlIlllIIlll[6] = -(0x3F ^ 0x17);
        }
        
        @Override
        public boolean shouldExecute() {
            if (lIlIIIllIlllIlII(this.parentEntity.getAttackTarget())) {
                return AIFireballAttack.lllIlIlllIIlll[0] != 0;
            }
            return AIFireballAttack.lllIlIlllIIlll[1] != 0;
        }
        
        static {
            lIlIIIllIlllIIll();
        }
        
        @Override
        public void resetTask() {
            this.parentEntity.setAttacking((boolean)(AIFireballAttack.lllIlIlllIIlll[1] != 0));
        }
        
        private static boolean lIlIIIllIllllIlI(final int llllllllllllIlIllIlIIllIIlIllIIl, final int llllllllllllIlIllIlIIllIIlIllIII) {
            return llllllllllllIlIllIlIIllIIlIllIIl > llllllllllllIlIllIlIIllIIlIllIII;
        }
        
        private static boolean lIlIIIllIllllIIl(final int llllllllllllIlIllIlIIllIIlIlIIII) {
            return llllllllllllIlIllIlIIllIIlIlIIII > 0;
        }
        
        private static boolean lIlIIIllIllllIII(final int llllllllllllIlIllIlIIllIIlIlllIl, final int llllllllllllIlIllIlIIllIIlIlllII) {
            return llllllllllllIlIllIlIIllIIlIlllIl == llllllllllllIlIllIlIIllIIlIlllII;
        }
        
        private static boolean lIlIIIllIlllIlII(final Object llllllllllllIlIllIlIIllIIlIlIllI) {
            return llllllllllllIlIllIlIIllIIlIlIllI != null;
        }
        
        private static boolean lIlIIIllIlllIllI(final int llllllllllllIlIllIlIIllIIlIlIIlI) {
            return llllllllllllIlIllIlIIllIIlIlIIlI < 0;
        }
        
        @Override
        public void startExecuting() {
            this.attackTimer = AIFireballAttack.lllIlIlllIIlll[1];
        }
        
        @Override
        public void updateTask() {
            final EntityLivingBase llllllllllllIlIllIlIIllIIlllIIlI = this.parentEntity.getAttackTarget();
            final double llllllllllllIlIllIlIIllIIlllIIIl = 64.0;
            if (lIlIIIllIlllIllI(lIlIIIllIlllIlIl(llllllllllllIlIllIlIIllIIlllIIlI.getDistanceSqToEntity(this.parentEntity), llllllllllllIlIllIlIIllIIlllIIIl * llllllllllllIlIllIlIIllIIlllIIIl)) && lIlIIIllIlllIlll(this.parentEntity.canEntityBeSeen(llllllllllllIlIllIlIIllIIlllIIlI) ? 1 : 0)) {
                final World llllllllllllIlIllIlIIllIIlllIIII = this.parentEntity.worldObj;
                this.attackTimer += AIFireballAttack.lllIlIlllIIlll[0];
                if (lIlIIIllIllllIII(this.attackTimer, AIFireballAttack.lllIlIlllIIlll[2])) {
                    llllllllllllIlIllIlIIllIIlllIIII.playAuxSFXAtEntity(null, AIFireballAttack.lllIlIlllIIlll[3], new BlockPos(this.parentEntity), AIFireballAttack.lllIlIlllIIlll[1]);
                }
                if (lIlIIIllIllllIII(this.attackTimer, AIFireballAttack.lllIlIlllIIlll[4])) {
                    final double llllllllllllIlIllIlIIllIIllIllll = 4.0;
                    final Vec3 llllllllllllIlIllIlIIllIIllIlllI = this.parentEntity.getLook(1.0f);
                    final double llllllllllllIlIllIlIIllIIllIllIl = llllllllllllIlIllIlIIllIIlllIIlI.posX - (this.parentEntity.posX + llllllllllllIlIllIlIIllIIllIlllI.xCoord * llllllllllllIlIllIlIIllIIllIllll);
                    final double llllllllllllIlIllIlIIllIIllIllII = llllllllllllIlIllIlIIllIIlllIIlI.getEntityBoundingBox().minY + llllllllllllIlIllIlIIllIIlllIIlI.height / 2.0f - (0.5 + this.parentEntity.posY + this.parentEntity.height / 2.0f);
                    final double llllllllllllIlIllIlIIllIIllIlIll = llllllllllllIlIllIlIIllIIlllIIlI.posZ - (this.parentEntity.posZ + llllllllllllIlIllIlIIllIIllIlllI.zCoord * llllllllllllIlIllIlIIllIIllIllll);
                    llllllllllllIlIllIlIIllIIlllIIII.playAuxSFXAtEntity(null, AIFireballAttack.lllIlIlllIIlll[5], new BlockPos(this.parentEntity), AIFireballAttack.lllIlIlllIIlll[1]);
                    final EntityLargeFireball llllllllllllIlIllIlIIllIIllIlIlI = new EntityLargeFireball(llllllllllllIlIllIlIIllIIlllIIII, this.parentEntity, llllllllllllIlIllIlIIllIIllIllIl, llllllllllllIlIllIlIIllIIllIllII, llllllllllllIlIllIlIIllIIllIlIll);
                    llllllllllllIlIllIlIIllIIllIlIlI.explosionPower = this.parentEntity.getFireballStrength();
                    llllllllllllIlIllIlIIllIIllIlIlI.posX = this.parentEntity.posX + llllllllllllIlIllIlIIllIIllIlllI.xCoord * llllllllllllIlIllIlIIllIIllIllll;
                    llllllllllllIlIllIlIIllIIllIlIlI.posY = this.parentEntity.posY + this.parentEntity.height / 2.0f + 0.5;
                    llllllllllllIlIllIlIIllIIllIlIlI.posZ = this.parentEntity.posZ + llllllllllllIlIllIlIIllIIllIlllI.zCoord * llllllllllllIlIllIlIIllIIllIllll;
                    llllllllllllIlIllIlIIllIIlllIIII.spawnEntityInWorld(llllllllllllIlIllIlIIllIIllIlIlI);
                    "".length();
                    this.attackTimer = AIFireballAttack.lllIlIlllIIlll[6];
                    "".length();
                    if (((0xB5 ^ 0xAB ^ (0x30 ^ 0x17)) & (0x3C ^ 0x7B ^ (0x6B ^ 0x15) ^ -" ".length())) > "  ".length()) {
                        return;
                    }
                }
            }
            else if (lIlIIIllIllllIIl(this.attackTimer)) {
                this.attackTimer -= AIFireballAttack.lllIlIlllIIlll[0];
            }
            final EntityGhast parentEntity = this.parentEntity;
            int attacking;
            if (lIlIIIllIllllIlI(this.attackTimer, AIFireballAttack.lllIlIlllIIlll[2])) {
                attacking = AIFireballAttack.lllIlIlllIIlll[0];
                "".length();
                if (((69 + 155 - 59 + 25 ^ 105 + 15 - 24 + 47) & (54 + 94 - 92 + 134 ^ 103 + 14 - 85 + 111 ^ -" ".length())) != ((0 + 21 + 57 + 49 ^ (0x4E ^ 0x22)) & (148 + 143 - 258 + 125 ^ 123 + 127 - 221 + 112 ^ -" ".length()))) {
                    return;
                }
            }
            else {
                attacking = AIFireballAttack.lllIlIlllIIlll[1];
            }
            parentEntity.setAttacking((boolean)(attacking != 0));
        }
        
        private static int lIlIIIllIlllIlIl(final double n, final double n2) {
            return dcmpg(n, n2);
        }
    }
    
    static class GhastMoveHelper extends EntityMoveHelper
    {
        private /* synthetic */ int courseChangeCooldown;
        private static final /* synthetic */ int[] lIlIIIIlIIlIII;
        private /* synthetic */ EntityGhast parentEntity;
        
        private static boolean lllIIIIlIIlllIl(final int lllllllllllllIIlIIIIlIllllllllIl) {
            return lllllllllllllIIlIIIIlIllllllllIl <= 0;
        }
        
        static {
            lllIIIIlIIllIll();
        }
        
        private static boolean lllIIIIlIlIIIII(final int lllllllllllllIIlIIIIlIllllllllll) {
            return lllllllllllllIIlIIIIlIllllllllll >= 0;
        }
        
        private static boolean lllIIIIlIIlllll(final int lllllllllllllIIlIIIIllIIIIIIIIIl) {
            return lllllllllllllIIlIIIIllIIIIIIIIIl == 0;
        }
        
        private boolean isNotColliding(final double lllllllllllllIIlIIIIllIIIIIIllII, final double lllllllllllllIIlIIIIllIIIIIIlIll, final double lllllllllllllIIlIIIIllIIIIIIlIlI, final double lllllllllllllIIlIIIIllIIIIIIlIIl) {
            final double lllllllllllllIIlIIIIllIIIIIlIIll = (lllllllllllllIIlIIIIllIIIIIIllII - this.parentEntity.posX) / lllllllllllllIIlIIIIllIIIIIIlIIl;
            final double lllllllllllllIIlIIIIllIIIIIlIIlI = (lllllllllllllIIlIIIIllIIIIIIlIll - this.parentEntity.posY) / lllllllllllllIIlIIIIllIIIIIIlIIl;
            final double lllllllllllllIIlIIIIllIIIIIlIIIl = (lllllllllllllIIlIIIIllIIIIIIlIlI - this.parentEntity.posZ) / lllllllllllllIIlIIIIllIIIIIIlIIl;
            AxisAlignedBB lllllllllllllIIlIIIIllIIIIIlIIII = this.parentEntity.getEntityBoundingBox();
            int lllllllllllllIIlIIIIllIIIIIIllll = GhastMoveHelper.lIlIIIIlIIlIII[0];
            "".length();
            if ("   ".length() > "   ".length()) {
                return ((0x9C ^ 0xB3) & ~(0x59 ^ 0x76)) != 0x0;
            }
            while (!lllIIIIlIlIIIII(lllIIIIlIIllllI(lllllllllllllIIlIIIIllIIIIIIllll, lllllllllllllIIlIIIIllIIIIIIlIIl))) {
                lllllllllllllIIlIIIIllIIIIIlIIII = lllllllllllllIIlIIIIllIIIIIlIIII.offset(lllllllllllllIIlIIIIllIIIIIlIIll, lllllllllllllIIlIIIIllIIIIIlIIlI, lllllllllllllIIlIIIIllIIIIIlIIIl);
                if (lllIIIIlIIlllll(this.parentEntity.worldObj.getCollidingBoundingBoxes(this.parentEntity, lllllllllllllIIlIIIIllIIIIIlIIII).isEmpty() ? 1 : 0)) {
                    return GhastMoveHelper.lIlIIIIlIIlIII[3] != 0;
                }
                ++lllllllllllllIIlIIIIllIIIIIIllll;
            }
            return GhastMoveHelper.lIlIIIIlIIlIII[0] != 0;
        }
        
        public GhastMoveHelper() {
            super(EntityGhast.this);
        }
        
        @Override
        public void onUpdateMoveHelper() {
            if (lllIIIIlIIlllII(this.update ? 1 : 0)) {
                final double lllllllllllllIIlIIIIllIIIIlIlIll = this.posX - this.parentEntity.posX;
                final double lllllllllllllIIlIIIIllIIIIlIlIlI = this.posY - this.parentEntity.posY;
                final double lllllllllllllIIlIIIIllIIIIlIlIIl = this.posZ - this.parentEntity.posZ;
                double lllllllllllllIIlIIIIllIIIIlIlIII = lllllllllllllIIlIIIIllIIIIlIlIll * lllllllllllllIIlIIIIllIIIIlIlIll + lllllllllllllIIlIIIIllIIIIlIlIlI * lllllllllllllIIlIIIIllIIIIlIlIlI + lllllllllllllIIlIIIIllIIIIlIlIIl * lllllllllllllIIlIIIIllIIIIlIlIIl;
                final int courseChangeCooldown = this.courseChangeCooldown;
                this.courseChangeCooldown = courseChangeCooldown - GhastMoveHelper.lIlIIIIlIIlIII[0];
                if (lllIIIIlIIlllIl(courseChangeCooldown)) {
                    this.courseChangeCooldown += this.parentEntity.getRNG().nextInt(GhastMoveHelper.lIlIIIIlIIlIII[1]) + GhastMoveHelper.lIlIIIIlIIlIII[2];
                    lllllllllllllIIlIIIIllIIIIlIlIII = MathHelper.sqrt_double(lllllllllllllIIlIIIIllIIIIlIlIII);
                    if (lllIIIIlIIlllII(this.isNotColliding(this.posX, this.posY, this.posZ, lllllllllllllIIlIIIIllIIIIlIlIII) ? 1 : 0)) {
                        final EntityGhast parentEntity = this.parentEntity;
                        parentEntity.motionX += lllllllllllllIIlIIIIllIIIIlIlIll / lllllllllllllIIlIIIIllIIIIlIlIII * 0.1;
                        final EntityGhast parentEntity2 = this.parentEntity;
                        parentEntity2.motionY += lllllllllllllIIlIIIIllIIIIlIlIlI / lllllllllllllIIlIIIIllIIIIlIlIII * 0.1;
                        final EntityGhast parentEntity3 = this.parentEntity;
                        parentEntity3.motionZ += lllllllllllllIIlIIIIllIIIIlIlIIl / lllllllllllllIIlIIIIllIIIIlIlIII * 0.1;
                        "".length();
                        if (" ".length() <= 0) {
                            return;
                        }
                    }
                    else {
                        this.update = (GhastMoveHelper.lIlIIIIlIIlIII[3] != 0);
                    }
                }
            }
        }
        
        private static int lllIIIIlIIllllI(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        private static boolean lllIIIIlIIlllII(final int lllllllllllllIIlIIIIllIIIIIIIIll) {
            return lllllllllllllIIlIIIIllIIIIIIIIll != 0;
        }
        
        private static void lllIIIIlIIllIll() {
            (lIlIIIIlIIlIII = new int[4])[0] = " ".length();
            GhastMoveHelper.lIlIIIIlIIlIII[1] = (0x41 ^ 0x44);
            GhastMoveHelper.lIlIIIIlIIlIII[2] = "  ".length();
            GhastMoveHelper.lIlIIIIlIIlIII[3] = ((0x34 ^ 0x7F ^ (0x75 ^ 0x11)) & (0xB1 ^ 0xA4 ^ (0xB6 ^ 0x8C) ^ -" ".length()));
        }
    }
    
    static class AILookAround extends EntityAIBase
    {
        private /* synthetic */ EntityGhast parentEntity;
        private static final /* synthetic */ int[] llllIllllIlII;
        
        private static int lIlIllIIIllllII(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        private static boolean lIlIllIIIlllllI(final int lllllllllllllIlIllIIIllIIlllIlII) {
            return lllllllllllllIlIllIIIllIIlllIlII < 0;
        }
        
        public AILookAround() {
            this.setMutexBits(AILookAround.llllIllllIlII[0]);
        }
        
        @Override
        public void updateTask() {
            if (lIlIllIIIllllIl(this.parentEntity.getAttackTarget())) {
                final EntityGhast parentEntity = this.parentEntity;
                final EntityGhast parentEntity2 = this.parentEntity;
                final float n = -(float)MathHelper.func_181159_b(this.parentEntity.motionX, this.parentEntity.motionZ) * 180.0f / 3.1415927f;
                parentEntity2.rotationYaw = n;
                parentEntity.renderYawOffset = n;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final EntityLivingBase lllllllllllllIlIllIIIllIlIIIIIII = this.parentEntity.getAttackTarget();
                final double lllllllllllllIlIllIIIllIIlllllll = 64.0;
                if (lIlIllIIIlllllI(lIlIllIIIllllII(lllllllllllllIlIllIIIllIlIIIIIII.getDistanceSqToEntity(this.parentEntity), lllllllllllllIlIllIIIllIIlllllll * lllllllllllllIlIllIIIllIIlllllll))) {
                    final double lllllllllllllIlIllIIIllIIllllllI = lllllllllllllIlIllIIIllIlIIIIIII.posX - this.parentEntity.posX;
                    final double lllllllllllllIlIllIIIllIIlllllIl = lllllllllllllIlIllIIIllIlIIIIIII.posZ - this.parentEntity.posZ;
                    final EntityGhast parentEntity3 = this.parentEntity;
                    final EntityGhast parentEntity4 = this.parentEntity;
                    final float n2 = -(float)MathHelper.func_181159_b(lllllllllllllIlIllIIIllIIllllllI, lllllllllllllIlIllIIIllIIlllllIl) * 180.0f / 3.1415927f;
                    parentEntity4.rotationYaw = n2;
                    parentEntity3.renderYawOffset = n2;
                }
            }
        }
        
        private static void lIlIllIIIlllIll() {
            (llllIllllIlII = new int[2])[0] = "  ".length();
            AILookAround.llllIllllIlII[1] = " ".length();
        }
        
        private static boolean lIlIllIIIllllIl(final Object lllllllllllllIlIllIIIllIIlllIllI) {
            return lllllllllllllIlIllIIIllIIlllIllI == null;
        }
        
        @Override
        public boolean shouldExecute() {
            return AILookAround.llllIllllIlII[1] != 0;
        }
        
        static {
            lIlIllIIIlllIll();
        }
    }
    
    static class AIRandomFly extends EntityAIBase
    {
        private /* synthetic */ EntityGhast parentEntity;
        private static final /* synthetic */ int[] llIIIllIlllIlI;
        
        private static boolean lIIIlIlIlIlIIlIl(final int llllllllllllIlllIlIIIlllIIllllll) {
            return llllllllllllIlllIlIIIlllIIllllll >= 0;
        }
        
        private static boolean lIIIlIlIlIlIIlII(final int llllllllllllIlllIlIIIlllIlIIIIIl) {
            return llllllllllllIlllIlIIIlllIlIIIIIl == 0;
        }
        
        private static int lIIIlIlIlIlIIIll(final double n, final double n2) {
            return dcmpl(n, n2);
        }
        
        private static boolean lIIIlIlIlIlIIllI(final int llllllllllllIlllIlIIIlllIIllllIl) {
            return llllllllllllIlllIlIIIlllIIllllIl <= 0;
        }
        
        @Override
        public void startExecuting() {
            final Random llllllllllllIlllIlIIIlllIlIIlIll = this.parentEntity.getRNG();
            final double llllllllllllIlllIlIIIlllIlIIlIlI = this.parentEntity.posX + (llllllllllllIlllIlIIIlllIlIIlIll.nextFloat() * 2.0f - 1.0f) * 16.0f;
            final double llllllllllllIlllIlIIIlllIlIIlIIl = this.parentEntity.posY + (llllllllllllIlllIlIIIlllIlIIlIll.nextFloat() * 2.0f - 1.0f) * 16.0f;
            final double llllllllllllIlllIlIIIlllIlIIlIII = this.parentEntity.posZ + (llllllllllllIlllIlIIIlllIlIIlIll.nextFloat() * 2.0f - 1.0f) * 16.0f;
            this.parentEntity.getMoveHelper().setMoveTo(llllllllllllIlllIlIIIlllIlIIlIlI, llllllllllllIlllIlIIIlllIlIIlIIl, llllllllllllIlllIlIIIlllIlIIlIII, 1.0);
        }
        
        private static void lIIIlIlIlIlIIIIl() {
            (llIIIllIlllIlI = new int[2])[0] = " ".length();
            AIRandomFly.llIIIllIlllIlI[1] = ((0x63 ^ 0x4E ^ (0xAC ^ 0x88)) & (9 + 158 - 55 + 66 ^ 183 + 1 - 8 + 11 ^ -" ".length()));
        }
        
        @Override
        public boolean shouldExecute() {
            final EntityMoveHelper llllllllllllIlllIlIIIlllIlIlllIl = this.parentEntity.getMoveHelper();
            if (lIIIlIlIlIlIIlII(llllllllllllIlllIlIIIlllIlIlllIl.isUpdating() ? 1 : 0)) {
                return AIRandomFly.llIIIllIlllIlI[0] != 0;
            }
            final double llllllllllllIlllIlIIIlllIlIlllII = llllllllllllIlllIlIIIlllIlIlllIl.getX() - this.parentEntity.posX;
            final double llllllllllllIlllIlIIIlllIlIllIll = llllllllllllIlllIlIIIlllIlIlllIl.getY() - this.parentEntity.posY;
            final double llllllllllllIlllIlIIIlllIlIllIlI = llllllllllllIlllIlIIIlllIlIlllIl.getZ() - this.parentEntity.posZ;
            final double llllllllllllIlllIlIIIlllIlIllIIl = llllllllllllIlllIlIIIlllIlIlllII * llllllllllllIlllIlIIIlllIlIlllII + llllllllllllIlllIlIIIlllIlIllIll * llllllllllllIlllIlIIIlllIlIllIll + llllllllllllIlllIlIIIlllIlIllIlI * llllllllllllIlllIlIIIlllIlIllIlI;
            if (lIIIlIlIlIlIIlIl(lIIIlIlIlIlIIIlI(llllllllllllIlllIlIIIlllIlIllIIl, 1.0)) && lIIIlIlIlIlIIllI(lIIIlIlIlIlIIIll(llllllllllllIlllIlIIIlllIlIllIIl, 3600.0))) {
                return AIRandomFly.llIIIllIlllIlI[1] != 0;
            }
            return AIRandomFly.llIIIllIlllIlI[0] != 0;
        }
        
        private static int lIIIlIlIlIlIIIlI(final double n, final double n2) {
            return dcmpg(n, n2);
        }
        
        @Override
        public boolean continueExecuting() {
            return AIRandomFly.llIIIllIlllIlI[1] != 0;
        }
        
        public AIRandomFly() {
            this.setMutexBits(AIRandomFly.llIIIllIlllIlI[0]);
        }
        
        static {
            lIIIlIlIlIlIIIIl();
        }
    }
}
