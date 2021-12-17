// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.entity.ai.EntityAITasks;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.Item;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.effect.EntityLightningBolt;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.ai.EntityAIControlledByPlayer;

public class EntityPig extends EntityAnimal
{
    private static final /* synthetic */ String[] llIIlIIIIlIIII;
    private static final /* synthetic */ int[] llIIlIIIlIIIII;
    private final /* synthetic */ EntityAIControlledByPlayer aiControlledByPlayer;
    
    private static int lIIIlIllllIIIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public boolean isBreedingItem(final ItemStack llllllllllllIlllIIllIIlIIllIIlII) {
        if (lIIIlIllllIIIIII(llllllllllllIlllIIllIIlIIllIIlII) && lIIIlIllllIIIIIl(llllllllllllIlllIIllIIlIIllIIlII.getItem(), Items.carrot)) {
            return EntityPig.llIIlIIIlIIIII[0] != 0;
        }
        return EntityPig.llIIlIIIlIIIII[1] != 0;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
    }
    
    private static void lIIIlIlllIllllll() {
        (llIIlIIIlIIIII = new int[10])[0] = " ".length();
        EntityPig.llIIlIIIlIIIII[1] = ((0x8 ^ 0x68 ^ (0x79 ^ 0x1F)) & (0xE7 ^ 0xB1 ^ (0x29 ^ 0x79) ^ -" ".length()));
        EntityPig.llIIlIIIlIIIII[2] = "  ".length();
        EntityPig.llIIlIIIlIIIII[3] = "   ".length();
        EntityPig.llIIlIIIlIIIII[4] = (27 + 68 - 0 + 61 ^ 59 + 76 - 31 + 48);
        EntityPig.llIIlIIIlIIIII[5] = (0x5 ^ 0x5E ^ (0xE9 ^ 0xB7));
        EntityPig.llIIlIIIlIIIII[6] = (55 + 97 - 147 + 126 ^ 126 + 108 - 117 + 16);
        EntityPig.llIIlIIIlIIIII[7] = (0xB3 ^ 0xB4);
        EntityPig.llIIlIIIlIIIII[8] = (0x1B ^ 0x71 ^ (0x63 ^ 0x1));
        EntityPig.llIIlIIIlIIIII[9] = (0x83 ^ 0x93);
    }
    
    private static boolean lIIIlIllllIIlIII(final int llllllllllllIlllIIllIIlIIIlIIIll, final int llllllllllllIlllIIllIIlIIIlIIIlI) {
        return llllllllllllIlllIIllIIlIIIlIIIll < llllllllllllIlllIIllIIlIIIlIIIlI;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[3]];
    }
    
    public EntityAIControlledByPlayer getAIControlledByPlayer() {
        return this.aiControlledByPlayer;
    }
    
    private static boolean lIIIlIllllIIIlIl(final int llllllllllllIlllIIllIIlIIIlIIlll, final int llllllllllllIlllIIllIIlIIIlIIllI) {
        return llllllllllllIlllIIllIIlIIIlIIlll >= llllllllllllIlllIIllIIlIIIlIIllI;
    }
    
    static {
        lIIIlIlllIllllll();
        lIIIlIlllIIlIIII();
    }
    
    private static String lIIIlIlllIIIllIl(String llllllllllllIlllIIllIIlIIIllllll, final String llllllllllllIlllIIllIIlIIlIIIIll) {
        llllllllllllIlllIIllIIlIIIllllll = new String(Base64.getDecoder().decode(llllllllllllIlllIIllIIlIIIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIllIIlIIlIIIIlI = new StringBuilder();
        final char[] llllllllllllIlllIIllIIlIIlIIIIIl = llllllllllllIlllIIllIIlIIlIIIIll.toCharArray();
        int llllllllllllIlllIIllIIlIIlIIIIII = EntityPig.llIIlIIIlIIIII[1];
        final long llllllllllllIlllIIllIIlIIIlllIlI = (Object)llllllllllllIlllIIllIIlIIIllllll.toCharArray();
        final boolean llllllllllllIlllIIllIIlIIIlllIIl = llllllllllllIlllIIllIIlIIIlllIlI.length != 0;
        float llllllllllllIlllIIllIIlIIIlllIII = EntityPig.llIIlIIIlIIIII[1];
        while (lIIIlIllllIIlIII((int)llllllllllllIlllIIllIIlIIIlllIII, llllllllllllIlllIIllIIlIIIlllIIl ? 1 : 0)) {
            final char llllllllllllIlllIIllIIlIIlIIIlIl = llllllllllllIlllIIllIIlIIIlllIlI[llllllllllllIlllIIllIIlIIIlllIII];
            llllllllllllIlllIIllIIlIIlIIIIlI.append((char)(llllllllllllIlllIIllIIlIIlIIIlIl ^ llllllllllllIlllIIllIIlIIlIIIIIl[llllllllllllIlllIIllIIlIIlIIIIII % llllllllllllIlllIIllIIlIIlIIIIIl.length]));
            "".length();
            ++llllllllllllIlllIIllIIlIIlIIIIII;
            ++llllllllllllIlllIIllIIlIIIlllIII;
            "".length();
            if (((0x88 ^ 0xA9) & ~(0x37 ^ 0x16)) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIllIIlIIlIIIIlI);
    }
    
    private static boolean lIIIlIllllIIIIlI(final int llllllllllllIlllIIllIIlIIIIlIllI) {
        return llllllllllllIlllIIllIIlIIIIlIllI != 0;
    }
    
    public void setSaddled(final boolean llllllllllllIlllIIllIIlIIlllllIl) {
        if (lIIIlIllllIIIIlI(llllllllllllIlllIIllIIlIIlllllIl ? 1 : 0)) {
            this.dataWatcher.updateObject(EntityPig.llIIlIIIlIIIII[9], (byte)EntityPig.llIIlIIIlIIIII[0]);
            "".length();
            if (((57 + 59 - 15 + 73 ^ 4 + 2 + 170 + 10) & (0x44 ^ 0x10 ^ (0x4A ^ 0xA) ^ -" ".length())) < 0) {
                return;
            }
        }
        else {
            this.dataWatcher.updateObject(EntityPig.llIIlIIIlIIIII[9], (byte)EntityPig.llIIlIIIlIIIII[1]);
        }
    }
    
    private static boolean lIIIlIllllIIIIIl(final Object llllllllllllIlllIIllIIlIIIIllIIl, final Object llllllllllllIlllIIllIIlIIIIllIII) {
        return llllllllllllIlllIIllIIlIIIIllIIl == llllllllllllIlllIIllIIlIIIIllIII;
    }
    
    private static boolean lIIIlIllllIIIIll(final int llllllllllllIlllIIllIIlIIIIlIlII) {
        return llllllllllllIlllIIllIIlIIIIlIlII == 0;
    }
    
    @Override
    protected void entityInit() {
        super.entityInit();
        this.dataWatcher.addObject(EntityPig.llIIlIIIlIIIII[9], (byte)EntityPig.llIIlIIIlIIIII[1]);
    }
    
    @Override
    public void onStruckByLightning(final EntityLightningBolt llllllllllllIlllIIllIIlIIlllIlll) {
        if (lIIIlIllllIIIIll(this.worldObj.isRemote ? 1 : 0) && lIIIlIllllIIIIll(this.isDead ? 1 : 0)) {
            final EntityPigZombie llllllllllllIlllIIllIIlIIlllIllI = new EntityPigZombie(this.worldObj);
            llllllllllllIlllIIllIIlIIlllIllI.setCurrentItemOrArmor(EntityPig.llIIlIIIlIIIII[1], new ItemStack(Items.golden_sword));
            llllllllllllIlllIIllIIlIIlllIllI.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, this.rotationPitch);
            llllllllllllIlllIIllIIlIIlllIllI.setNoAI(this.isAIDisabled());
            if (lIIIlIllllIIIIlI(this.hasCustomName() ? 1 : 0)) {
                llllllllllllIlllIIllIIlIIlllIllI.setCustomNameTag(this.getCustomNameTag());
                llllllllllllIlllIIllIIlIIlllIllI.setAlwaysRenderNameTag(this.getAlwaysRenderNameTag());
            }
            this.worldObj.spawnEntityInWorld(llllllllllllIlllIIllIIlIIlllIllI);
            "".length();
            this.setDead();
        }
    }
    
    @Override
    public boolean interact(final EntityPlayer llllllllllllIlllIIllIIlIlIIlIlII) {
        if (lIIIlIllllIIIIlI(super.interact(llllllllllllIlllIIllIIlIlIIlIlII) ? 1 : 0)) {
            return EntityPig.llIIlIIIlIIIII[0] != 0;
        }
        if (!lIIIlIllllIIIIlI(this.getSaddled() ? 1 : 0) || !lIIIlIllllIIIIll(this.worldObj.isRemote ? 1 : 0) || (lIIIlIllllIIIIII(this.riddenByEntity) && lIIIlIllllIIIlII(this.riddenByEntity, llllllllllllIlllIIllIIlIlIIlIlII))) {
            return EntityPig.llIIlIIIlIIIII[1] != 0;
        }
        llllllllllllIlllIIllIIlIlIIlIlII.mountEntity(this);
        return EntityPig.llIIlIIIlIIIII[0] != 0;
    }
    
    @Override
    public void fall(final float llllllllllllIlllIIllIIlIIllIllII, final float llllllllllllIlllIIllIIlIIllIlIll) {
        super.fall(llllllllllllIlllIIllIIlIIllIllII, llllllllllllIlllIIllIIlIIllIlIll);
        if (lIIIlIllllIIIlll(lIIIlIllllIIIllI(llllllllllllIlllIIllIIlIIllIllII, 5.0f)) && lIIIlIllllIIIIlI((this.riddenByEntity instanceof EntityPlayer) ? 1 : 0)) {
            ((EntityPlayer)this.riddenByEntity).triggerAchievement(AchievementList.flyPig);
        }
    }
    
    @Override
    protected void dropFewItems(final boolean llllllllllllIlllIIllIIlIlIIIlIll, final int llllllllllllIlllIIllIIlIlIIIlIlI) {
        final int llllllllllllIlllIIllIIlIlIIIlIIl = this.rand.nextInt(EntityPig.llIIlIIIlIIIII[3]) + EntityPig.llIIlIIIlIIIII[0] + this.rand.nextInt(EntityPig.llIIlIIIlIIIII[0] + llllllllllllIlllIIllIIlIlIIIlIlI);
        int llllllllllllIlllIIllIIlIlIIIlIII = EntityPig.llIIlIIIlIIIII[1];
        "".length();
        if (((0x88 ^ 0x9E) & ~(0x42 ^ 0x54)) > ((0x17 ^ 0xB) & ~(0x6 ^ 0x1A))) {
            return;
        }
        while (!lIIIlIllllIIIlIl(llllllllllllIlllIIllIIlIlIIIlIII, llllllllllllIlllIIllIIlIlIIIlIIl)) {
            if (lIIIlIllllIIIIlI(this.isBurning() ? 1 : 0)) {
                this.dropItem(Items.cooked_porkchop, EntityPig.llIIlIIIlIIIII[0]);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.dropItem(Items.porkchop, EntityPig.llIIlIIIlIIIII[0]);
                "".length();
            }
            ++llllllllllllIlllIIllIIlIlIIIlIII;
        }
        if (lIIIlIllllIIIIlI(this.getSaddled() ? 1 : 0)) {
            this.dropItem(Items.saddle, EntityPig.llIIlIIIlIIIII[0]);
            "".length();
        }
    }
    
    @Override
    protected String getDeathSound() {
        return EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[4]];
    }
    
    private static boolean lIIIlIllllIIIIII(final Object llllllllllllIlllIIllIIlIIIIlllII) {
        return llllllllllllIlllIIllIIlIIIIlllII != null;
    }
    
    @Override
    public EntityPig createChild(final EntityAgeable llllllllllllIlllIIllIIlIIllIlIII) {
        return new EntityPig(this.worldObj);
    }
    
    @Override
    protected String getLivingSound() {
        return EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[2]];
    }
    
    @Override
    protected void playStepSound(final BlockPos llllllllllllIlllIIllIIlIlIIlllII, final Block llllllllllllIlllIIllIIlIlIIllIll) {
        this.playSound(EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[5]], 0.15f, 1.0f);
    }
    
    private static String lIIIlIlllIIIlllI(final String llllllllllllIlllIIllIIlIIIlIllll, final String llllllllllllIlllIIllIIlIIIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIIlIIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIIlIIIlIlllI.getBytes(StandardCharsets.UTF_8)), EntityPig.llIIlIIIlIIIII[8]), "DES");
            final Cipher llllllllllllIlllIIllIIlIIIllIIIl = Cipher.getInstance("DES");
            llllllllllllIlllIIllIIlIIIllIIIl.init(EntityPig.llIIlIIIlIIIII[2], llllllllllllIlllIIllIIlIIIllIIlI);
            return new String(llllllllllllIlllIIllIIlIIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIIlIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIIlIIIllIIII) {
            llllllllllllIlllIIllIIlIIIllIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected Item getDropItem() {
        Item item;
        if (lIIIlIllllIIIIlI(this.isBurning() ? 1 : 0)) {
            item = Items.cooked_porkchop;
            "".length();
            if ("  ".length() > "  ".length()) {
                return null;
            }
        }
        else {
            item = Items.porkchop;
        }
        return item;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIlllIIllIIlIlIlIlIII) {
        super.writeEntityToNBT(llllllllllllIlllIIllIIlIlIlIlIII);
        llllllllllllIlllIIllIIlIlIlIlIII.setBoolean(EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[1]], this.getSaddled());
    }
    
    @Override
    public boolean canBeSteered() {
        final ItemStack llllllllllllIlllIIllIIlIlIllIIll = ((EntityPlayer)this.riddenByEntity).getHeldItem();
        if (lIIIlIllllIIIIII(llllllllllllIlllIIllIIlIlIllIIll) && lIIIlIllllIIIIIl(llllllllllllIlllIIllIIlIlIllIIll.getItem(), Items.carrot_on_a_stick)) {
            return EntityPig.llIIlIIIlIIIII[0] != 0;
        }
        return EntityPig.llIIlIIIlIIIII[1] != 0;
    }
    
    private static boolean lIIIlIllllIIIlll(final int llllllllllllIlllIIllIIlIIIIlIIlI) {
        return llllllllllllIlllIIllIIlIIIIlIIlI > 0;
    }
    
    private static String lIIIlIlllIIIllll(final String llllllllllllIlllIIllIIlIIlIlIlII, final String llllllllllllIlllIIllIIlIIlIlIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIllIIlIIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIllIIlIIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIllIIlIIlIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIllIIlIIlIlIllI.init(EntityPig.llIIlIIIlIIIII[2], llllllllllllIlllIIllIIlIIlIlIlll);
            return new String(llllllllllllIlllIIllIIlIIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIllIIlIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIllIIlIIlIlIlIl) {
            llllllllllllIlllIIllIIlIIlIlIlIl.printStackTrace();
            return null;
        }
    }
    
    public boolean getSaddled() {
        if (lIIIlIllllIIIIlI(this.dataWatcher.getWatchableObjectByte(EntityPig.llIIlIIIlIIIII[9]) & EntityPig.llIIlIIIlIIIII[0])) {
            return EntityPig.llIIlIIIlIIIII[0] != 0;
        }
        return EntityPig.llIIlIIIlIIIII[1] != 0;
    }
    
    private static boolean lIIIlIllllIIIlII(final Object llllllllllllIlllIIllIIlIIIIlllll, final Object llllllllllllIlllIIllIIlIIIIllllI) {
        return llllllllllllIlllIIllIIlIIIIlllll != llllllllllllIlllIIllIIlIIIIllllI;
    }
    
    private static void lIIIlIlllIIlIIII() {
        (llIIlIIIIlIIII = new String[EntityPig.llIIlIIIlIIIII[6]])[EntityPig.llIIlIIIlIIIII[1]] = lIIIlIlllIIIllIl("JSsCLSAT", "vJfIL");
        EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[0]] = lIIIlIlllIIIlllI("W2kfzgeVXvY=", "NzZtr");
        EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[2]] = lIIIlIlllIIIlllI("cLzOIUwwBRd2cp+3oy0yiA==", "btpZW");
        EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[3]] = lIIIlIlllIIIllll("PHO0TGG1hIns2n6O8YIXbQ==", "XRzAi");
        EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[4]] = lIIIlIlllIIIlllI("YDfM4qukdUXXdwB8PGv5+g==", "dUUQv");
        EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[5]] = lIIIlIlllIIIlllI("ite8n8a+MMjBpyeNF6+6Jg==", "NyqhZ");
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIlllIIllIIlIlIlIIIlI) {
        super.readEntityFromNBT(llllllllllllIlllIIllIIlIlIlIIIlI);
        this.setSaddled(llllllllllllIlllIIllIIlIlIlIIIlI.getBoolean(EntityPig.llIIlIIIIlIIII[EntityPig.llIIlIIIlIIIII[0]]));
    }
    
    public EntityPig(final World llllllllllllIlllIIllIIlIlIllllII) {
        super(llllllllllllIlllIIllIIlIlIllllII);
        this.setSize(0.9f, 0.9f);
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityPig.llIIlIIIlIIIII[0] != 0));
        this.tasks.addTask(EntityPig.llIIlIIIlIIIII[1], new EntityAISwimming(this));
        this.tasks.addTask(EntityPig.llIIlIIIlIIIII[0], new EntityAIPanic(this, 1.25));
        final EntityAITasks tasks = this.tasks;
        final int llllllllllllIlllIIllllIlIlIIIIll = EntityPig.llIIlIIIlIIIII[2];
        final EntityAIControlledByPlayer entityAIControlledByPlayer = new EntityAIControlledByPlayer(this, 0.3f);
        this.aiControlledByPlayer = entityAIControlledByPlayer;
        tasks.addTask(llllllllllllIlllIIllllIlIlIIIIll, entityAIControlledByPlayer);
        this.tasks.addTask(EntityPig.llIIlIIIlIIIII[3], new EntityAIMate(this, 1.0));
        this.tasks.addTask(EntityPig.llIIlIIIlIIIII[4], new EntityAITempt(this, 1.2, Items.carrot_on_a_stick, (boolean)(EntityPig.llIIlIIIlIIIII[1] != 0)));
        this.tasks.addTask(EntityPig.llIIlIIIlIIIII[4], new EntityAITempt(this, 1.2, Items.carrot, (boolean)(EntityPig.llIIlIIIlIIIII[1] != 0)));
        this.tasks.addTask(EntityPig.llIIlIIIlIIIII[5], new EntityAIFollowParent(this, 1.1));
        this.tasks.addTask(EntityPig.llIIlIIIlIIIII[6], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityPig.llIIlIIIlIIIII[7], new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
        this.tasks.addTask(EntityPig.llIIlIIIlIIIII[8], new EntityAILookIdle(this));
    }
}
