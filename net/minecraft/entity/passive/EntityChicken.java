// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import java.util.Arrays;
import net.minecraft.entity.SharedMonsterAttributes;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.Item;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.init.Items;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.MathHelper;

public class EntityChicken extends EntityAnimal
{
    public /* synthetic */ int timeUntilNextEgg;
    public /* synthetic */ boolean chickenJockey;
    private static final /* synthetic */ int[] lIlllIlIlIllIl;
    public /* synthetic */ float wingRotation;
    public /* synthetic */ float wingRotDelta;
    public /* synthetic */ float field_70888_h;
    private static final /* synthetic */ String[] lIlllIlIIlllll;
    public /* synthetic */ float destPos;
    public /* synthetic */ float field_70884_g;
    
    private static boolean lIIIIIlIlllIIIII(final int llllllllllllIllllIlllllllllIIlII, final int llllllllllllIllllIlllllllllIIIll) {
        return llllllllllllIllllIlllllllllIIlII < llllllllllllIllllIlllllllllIIIll;
    }
    
    @Override
    public void updateRiderPosition() {
        super.updateRiderPosition();
        final float llllllllllllIlllllIIIIIIIIllIIlI = MathHelper.sin(this.renderYawOffset * 3.1415927f / 180.0f);
        final float llllllllllllIlllllIIIIIIIIllIIIl = MathHelper.cos(this.renderYawOffset * 3.1415927f / 180.0f);
        final float llllllllllllIlllllIIIIIIIIllIIII = 0.1f;
        final float llllllllllllIlllllIIIIIIIIlIllll = 0.0f;
        this.riddenByEntity.setPosition(this.posX + llllllllllllIlllllIIIIIIIIllIIII * llllllllllllIlllllIIIIIIIIllIIlI, this.posY + this.height * 0.5f + this.riddenByEntity.getYOffset() + llllllllllllIlllllIIIIIIIIlIllll, this.posZ - llllllllllllIlllllIIIIIIIIllIIII * llllllllllllIlllllIIIIIIIIllIIIl);
        if (lIIIIIlIllIllIII((this.riddenByEntity instanceof EntityLivingBase) ? 1 : 0)) {
            ((EntityLivingBase)this.riddenByEntity).renderYawOffset = this.renderYawOffset;
        }
    }
    
    private static boolean lIIIIIlIllIllIII(final int llllllllllllIllllIllllllllIllIIl) {
        return llllllllllllIllllIllllllllIllIIl != 0;
    }
    
    @Override
    protected void playStepSound(final BlockPos llllllllllllIlllllIIIIIIIllIIllI, final Block llllllllllllIlllllIIIIIIIllIIlIl) {
        this.playSound(EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[5]], 0.15f, 1.0f);
    }
    
    @Override
    protected int getExperiencePoints(final EntityPlayer llllllllllllIlllllIIIIIIIlIIIlII) {
        int experiencePoints;
        if (lIIIIIlIllIllIII(this.isChickenJockey() ? 1 : 0)) {
            experiencePoints = EntityChicken.lIlllIlIlIllIl[10];
            "".length();
            if ((0x7A ^ 0x7F) == 0x0) {
                return (0xBC ^ 0xA5) & ~(0x3D ^ 0x24);
            }
        }
        else {
            experiencePoints = super.getExperiencePoints(llllllllllllIlllllIIIIIIIlIIIlII);
        }
        return experiencePoints;
    }
    
    public EntityChicken(final World llllllllllllIlllllIIIIIIIllllIlI) {
        super(llllllllllllIlllllIIIIIIIllllIlI);
        this.wingRotDelta = 1.0f;
        this.setSize(0.4f, 0.7f);
        this.timeUntilNextEgg = this.rand.nextInt(EntityChicken.lIlllIlIlIllIl[0]) + EntityChicken.lIlllIlIlIllIl[0];
        this.tasks.addTask(EntityChicken.lIlllIlIlIllIl[1], new EntityAISwimming(this));
        this.tasks.addTask(EntityChicken.lIlllIlIlIllIl[2], new EntityAIPanic(this, 1.4));
        this.tasks.addTask(EntityChicken.lIlllIlIlIllIl[3], new EntityAIMate(this, 1.0));
        this.tasks.addTask(EntityChicken.lIlllIlIlIllIl[4], new EntityAITempt(this, 1.0, Items.wheat_seeds, (boolean)(EntityChicken.lIlllIlIlIllIl[1] != 0)));
        this.tasks.addTask(EntityChicken.lIlllIlIlIllIl[5], new EntityAIFollowParent(this, 1.1));
        this.tasks.addTask(EntityChicken.lIlllIlIlIllIl[6], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityChicken.lIlllIlIlIllIl[7], new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
        this.tasks.addTask(EntityChicken.lIlllIlIlIllIl[8], new EntityAILookIdle(this));
    }
    
    private static void lIIIIIlIllIlIlIl() {
        (lIlllIlIlIllIl = new int[13])[0] = (-(0xFFFFEA3D & 0x75CF) & (0xFFFFFFFC & 0x777F));
        EntityChicken.lIlllIlIlIllIl[1] = ((0x1F ^ 0x1) & ~(0x68 ^ 0x76));
        EntityChicken.lIlllIlIlIllIl[2] = " ".length();
        EntityChicken.lIlllIlIlIllIl[3] = "  ".length();
        EntityChicken.lIlllIlIlIllIl[4] = "   ".length();
        EntityChicken.lIlllIlIlIllIl[5] = (74 + 120 - 37 + 38 ^ 101 + 194 - 291 + 195);
        EntityChicken.lIlllIlIlIllIl[6] = (0x44 ^ 0x1A ^ (0x6A ^ 0x31));
        EntityChicken.lIlllIlIlIllIl[7] = (0x90 ^ 0x96);
        EntityChicken.lIlllIlIlIllIl[8] = (0x17 ^ 0x10);
        EntityChicken.lIlllIlIlIllIl[9] = -" ".length();
        EntityChicken.lIlllIlIlIllIl[10] = (101 + 142 - 219 + 166 ^ 30 + 3 + 131 + 16);
        EntityChicken.lIlllIlIlIllIl[11] = (97 + 57 - 96 + 97 ^ 6 + 105 - 43 + 79);
        EntityChicken.lIlllIlIlIllIl[12] = (0xBB ^ 0xB2);
    }
    
    private static boolean lIIIIIlIllIlllIl(final Object llllllllllllIllllIlllllllllIIIIl) {
        return llllllllllllIllllIlllllllllIIIIl != null;
    }
    
    @Override
    protected Item getDropItem() {
        return Items.feather;
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound llllllllllllIlllllIIIIIIIIllllII) {
        super.writeEntityToNBT(llllllllllllIlllllIIIIIIIIllllII);
        llllllllllllIlllllIIIIIIIIllllII.setBoolean(EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[11]], this.chickenJockey);
        llllllllllllIlllllIIIIIIIIllllII.setInteger(EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[12]], this.timeUntilNextEgg);
    }
    
    private static boolean lIIIIIlIllIllIll(final int llllllllllllIllllIllllllllIlIIll) {
        return llllllllllllIllllIllllllllIlIIll <= 0;
    }
    
    @Override
    public void fall(final float llllllllllllIlllllIIIIIIIllIllIl, final float llllllllllllIlllllIIIIIIIllIllII) {
    }
    
    @Override
    protected String getDeathSound() {
        return EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[4]];
    }
    
    private static int lIIIIIlIllIlIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean isChickenJockey() {
        return this.chickenJockey;
    }
    
    @Override
    public EntityChicken createChild(final EntityAgeable llllllllllllIlllllIIIIIIIlIlIIll) {
        return new EntityChicken(this.worldObj);
    }
    
    @Override
    protected String getHurtSound() {
        return EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[3]];
    }
    
    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        this.field_70888_h = this.wingRotation;
        this.field_70884_g = this.destPos;
        final double n = this.destPos;
        int n2;
        if (lIIIIIlIllIllIII(this.onGround ? 1 : 0)) {
            n2 = EntityChicken.lIlllIlIlIllIl[9];
            "".length();
            if ((0x8F ^ 0x8A) == 0x0) {
                return;
            }
        }
        else {
            n2 = EntityChicken.lIlllIlIlIllIl[5];
        }
        this.destPos = (float)(n + n2 * 0.3);
        this.destPos = MathHelper.clamp_float(this.destPos, 0.0f, 1.0f);
        if (lIIIIIlIllIllIIl(this.onGround ? 1 : 0) && lIIIIIlIllIllIlI(lIIIIIlIllIlIllI(this.wingRotDelta, 1.0f))) {
            this.wingRotDelta = 1.0f;
        }
        this.wingRotDelta *= (float)0.9;
        if (lIIIIIlIllIllIIl(this.onGround ? 1 : 0) && lIIIIIlIllIllIlI(lIIIIIlIllIlIlll(this.motionY, 0.0))) {
            this.motionY *= 0.6;
        }
        this.wingRotation += this.wingRotDelta * 2.0f;
        if (lIIIIIlIllIllIIl(this.worldObj.isRemote ? 1 : 0) && lIIIIIlIllIllIIl(this.isChild() ? 1 : 0) && lIIIIIlIllIllIIl(this.isChickenJockey() ? 1 : 0)) {
            final int n3 = this.timeUntilNextEgg - EntityChicken.lIlllIlIlIllIl[2];
            this.timeUntilNextEgg = n3;
            if (lIIIIIlIllIllIll(n3)) {
                this.playSound(EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[1]], 1.0f, (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f + 1.0f);
                this.dropItem(Items.egg, EntityChicken.lIlllIlIlIllIl[2]);
                "".length();
                this.timeUntilNextEgg = this.rand.nextInt(EntityChicken.lIlllIlIlIllIl[0]) + EntityChicken.lIlllIlIlIllIl[0];
            }
        }
    }
    
    @Override
    protected void dropFewItems(final boolean llllllllllllIlllllIIIIIIIlIlllIl, final int llllllllllllIlllllIIIIIIIlIlllII) {
        final int llllllllllllIlllllIIIIIIIlIllIll = this.rand.nextInt(EntityChicken.lIlllIlIlIllIl[4]) + this.rand.nextInt(EntityChicken.lIlllIlIlIllIl[2] + llllllllllllIlllllIIIIIIIlIlllII);
        int llllllllllllIlllllIIIIIIIlIllIlI = EntityChicken.lIlllIlIlIllIl[1];
        "".length();
        if ((0xBF ^ 0x82 ^ (0x80 ^ 0xB9)) == " ".length()) {
            return;
        }
        while (!lIIIIIlIllIlllII(llllllllllllIlllllIIIIIIIlIllIlI, llllllllllllIlllllIIIIIIIlIllIll)) {
            this.dropItem(Items.feather, EntityChicken.lIlllIlIlIllIl[2]);
            "".length();
            ++llllllllllllIlllllIIIIIIIlIllIlI;
        }
        if (lIIIIIlIllIllIII(this.isBurning() ? 1 : 0)) {
            this.dropItem(Items.cooked_chicken, EntityChicken.lIlllIlIlIllIl[2]);
            "".length();
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
        }
        else {
            this.dropItem(Items.chicken, EntityChicken.lIlllIlIlIllIl[2]);
            "".length();
        }
    }
    
    @Override
    public boolean isBreedingItem(final ItemStack llllllllllllIlllllIIIIIIIlIIllll) {
        if (lIIIIIlIllIlllIl(llllllllllllIlllllIIIIIIIlIIllll) && lIIIIIlIllIllllI(llllllllllllIlllllIIIIIIIlIIllll.getItem(), Items.wheat_seeds)) {
            return EntityChicken.lIlllIlIlIllIl[2] != 0;
        }
        return EntityChicken.lIlllIlIlIllIl[1] != 0;
    }
    
    static {
        lIIIIIlIllIlIlIl();
        lIIIIIlIlIlllllI();
    }
    
    private static void lIIIIIlIlIlllllI() {
        (lIlllIlIIlllll = new String[EntityChicken.lIlllIlIlIllIl[10]])[EntityChicken.lIlllIlIlIllIl[1]] = lIIIIIlIlIlllIll("1snrO/1siw1Nl3efIx+g9EigI9apz3Ud", "BJMqz");
        EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[2]] = lIIIIIlIlIlllIll("D3gem7G+ybGs3mH9Y2nzJA==", "HwbHK");
        EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[3]] = lIIIIIlIlIllllII("Oh82RSQ/GTcAIjlePB41Iw==", "WpTkG");
        EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[4]] = lIIIIIlIlIlllIll("lET2+nWDOv0/gHqMKfIr7zcZR6VPfmRq", "VrIZa");
        EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[5]] = lIIIIIlIlIllllIl("zkPdmoiee17QFPiECTthGbbXWdlnhw//", "MXRwC");
        EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[6]] = lIIIIIlIlIlllIll("Bn1uDu+IdTogvWbGRQcbSQ==", "FUAWB");
        EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[7]] = lIIIIIlIlIlllIll("y1fChx9PSEHyu/100VogfA==", "jUkux");
        EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[8]] = lIIIIIlIlIllllII("IyUXGDYfFhk5Mg==", "fBpTW");
        EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[11]] = lIIIIIlIlIllllIl("sKuj76NLfZhhdc5oFjkk5Q==", "xdnqu");
        EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[12]] = lIIIIIlIlIlllIll("Do6Mn8Lww8/vyHgyDCCabA==", "tAvNo");
    }
    
    private static boolean lIIIIIlIllIllllI(final Object llllllllllllIllllIllllllllIllllI, final Object llllllllllllIllllIllllllllIlllIl) {
        return llllllllllllIllllIllllllllIllllI == llllllllllllIllllIllllllllIlllIl;
    }
    
    public void setChickenJockey(final boolean llllllllllllIlllllIIIIIIIIlIIIll) {
        this.chickenJockey = llllllllllllIlllllIIIIIIIIlIIIll;
    }
    
    private static boolean lIIIIIlIllIlllII(final int llllllllllllIllllIlllllllllIlIII, final int llllllllllllIllllIlllllllllIIlll) {
        return llllllllllllIllllIlllllllllIlIII >= llllllllllllIllllIlllllllllIIlll;
    }
    
    @Override
    protected boolean canDespawn() {
        if (lIIIIIlIllIllIII(this.isChickenJockey() ? 1 : 0) && lIIIIIlIllIlllll(this.riddenByEntity)) {
            return EntityChicken.lIlllIlIlIllIl[2] != 0;
        }
        return EntityChicken.lIlllIlIlIllIl[1] != 0;
    }
    
    private static String lIIIIIlIlIllllIl(final String llllllllllllIlllllIIIIIIIIIIlIII, final String llllllllllllIlllllIIIIIIIIIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIIIIIIIIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIIIIIIIIIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIIIIIIIIIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIIIIIIIIIlIlI.init(EntityChicken.lIlllIlIlIllIl[3], llllllllllllIlllllIIIIIIIIIIlIll);
            return new String(llllllllllllIlllllIIIIIIIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIIIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIIIIIIIIlIIl) {
            llllllllllllIlllllIIIIIIIIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIlIllIllIlI(final int llllllllllllIllllIllllllllIlIlIl) {
        return llllllllllllIllllIllllllllIlIlIl < 0;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound llllllllllllIlllllIIIIIIIlIIlIII) {
        super.readEntityFromNBT(llllllllllllIlllllIIIIIIIlIIlIII);
        this.chickenJockey = llllllllllllIlllllIIIIIIIlIIlIII.getBoolean(EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[6]]);
        if (lIIIIIlIllIllIII(llllllllllllIlllllIIIIIIIlIIlIII.hasKey(EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[7]]) ? 1 : 0)) {
            this.timeUntilNextEgg = llllllllllllIlllllIIIIIIIlIIlIII.getInteger(EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[8]]);
        }
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(4.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25);
    }
    
    @Override
    protected String getLivingSound() {
        return EntityChicken.lIlllIlIIlllll[EntityChicken.lIlllIlIlIllIl[2]];
    }
    
    private static int lIIIIIlIllIlIlll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static String lIIIIIlIlIllllII(String llllllllllllIllllIllllllllllIIll, final String llllllllllllIllllIllllllllllIlll) {
        llllllllllllIllllIllllllllllIIll = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIllllllllllIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllllllllllIllI = new StringBuilder();
        final char[] llllllllllllIllllIllllllllllIlIl = llllllllllllIllllIllllllllllIlll.toCharArray();
        int llllllllllllIllllIllllllllllIlII = EntityChicken.lIlllIlIlIllIl[1];
        final double llllllllllllIllllIlllllllllIlllI = (Object)((String)llllllllllllIllllIllllllllllIIll).toCharArray();
        final short llllllllllllIllllIlllllllllIllIl = (short)llllllllllllIllllIlllllllllIlllI.length;
        int llllllllllllIllllIlllllllllIllII = EntityChicken.lIlllIlIlIllIl[1];
        while (lIIIIIlIlllIIIII(llllllllllllIllllIlllllllllIllII, llllllllllllIllllIlllllllllIllIl)) {
            final char llllllllllllIllllIlllllllllllIIl = llllllllllllIllllIlllllllllIlllI[llllllllllllIllllIlllllllllIllII];
            llllllllllllIllllIllllllllllIllI.append((char)(llllllllllllIllllIlllllllllllIIl ^ llllllllllllIllllIllllllllllIlIl[llllllllllllIllllIllllllllllIlII % llllllllllllIllllIllllllllllIlIl.length]));
            "".length();
            ++llllllllllllIllllIllllllllllIlII;
            ++llllllllllllIllllIlllllllllIllII;
            "".length();
            if (-(0x68 ^ 0x55 ^ (0x4C ^ 0x74)) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllllllllllIllI);
    }
    
    private static boolean lIIIIIlIllIlllll(final Object llllllllllllIllllIllllllllIllIll) {
        return llllllllllllIllllIllllllllIllIll == null;
    }
    
    private static boolean lIIIIIlIllIllIIl(final int llllllllllllIllllIllllllllIlIlll) {
        return llllllllllllIllllIllllllllIlIlll == 0;
    }
    
    private static String lIIIIIlIlIlllIll(final String llllllllllllIlllllIIIIIIIIIlIIll, final String llllllllllllIlllllIIIIIIIIIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIIIIIIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIIIIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), EntityChicken.lIlllIlIlIllIl[11]), "DES");
            final Cipher llllllllllllIlllllIIIIIIIIIlIlll = Cipher.getInstance("DES");
            llllllllllllIlllllIIIIIIIIIlIlll.init(EntityChicken.lIlllIlIlIllIl[3], llllllllllllIlllllIIIIIIIIIllIII);
            return new String(llllllllllllIlllllIIIIIIIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIIIIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIIIIIIIlIllI) {
            llllllllllllIlllllIIIIIIIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public float getEyeHeight() {
        return this.height;
    }
}
