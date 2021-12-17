// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.passive;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.Entity;
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
import net.minecraft.entity.EntityAgeable;
import java.util.Arrays;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EntityCow extends EntityAnimal
{
    private static final /* synthetic */ int[] llIIlIlIlIIIII;
    private static final /* synthetic */ String[] llIIlIlIIlllll;
    
    private static String lIIIllIlIIIlIlIl(final String llllllllllllIlllIIIlllIIlIIlIllI, final String llllllllllllIlllIIIlllIIlIIlIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlllIIlIIllIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlllIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIlllIIlIIllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIlllIIlIIllIlI.init(EntityCow.llIIlIlIlIIIII[2], llllllllllllIlllIIIlllIIlIIllIll);
            return new String(llllllllllllIlllIIIlllIIlIIllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlllIIlIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlllIIlIIllIIl) {
            llllllllllllIlllIIIlllIIlIIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIllIlIIIlllII(final Object llllllllllllIlllIIIlllIIIllIIIII) {
        return llllllllllllIlllIIIlllIIIllIIIII != null;
    }
    
    @Override
    public boolean interact(final EntityPlayer llllllllllllIlllIIIlllIIlIlIllll) {
        final ItemStack llllllllllllIlllIIIlllIIlIlIlllI = llllllllllllIlllIIIlllIIlIlIllll.inventory.getCurrentItem();
        if (lIIIllIlIIIlllII(llllllllllllIlllIIIlllIIlIlIlllI) && lIIIllIlIIIlllIl(llllllllllllIlllIIIlllIIlIlIlllI.getItem(), Items.bucket) && lIIIllIlIIIllllI(llllllllllllIlllIIIlllIIlIlIllll.capabilities.isCreativeMode ? 1 : 0) && lIIIllIlIIIllllI(this.isChild() ? 1 : 0)) {
            final ItemStack itemStack = llllllllllllIlllIIIlllIIlIlIlllI;
            final int stackSize = itemStack.stackSize;
            itemStack.stackSize = stackSize - EntityCow.llIIlIlIlIIIII[0];
            if (lIIIllIlIIIlllll(stackSize, EntityCow.llIIlIlIlIIIII[0])) {
                llllllllllllIlllIIIlllIIlIlIllll.inventory.setInventorySlotContents(llllllllllllIlllIIIlllIIlIlIllll.inventory.currentItem, new ItemStack(Items.milk_bucket));
                "".length();
                if (-(0x41 ^ 0x45) >= 0) {
                    return ((0x3A ^ 0x7B) & ~(0x6B ^ 0x2A)) != 0x0;
                }
            }
            else if (lIIIllIlIIIllllI(llllllllllllIlllIIIlllIIlIlIllll.inventory.addItemStackToInventory(new ItemStack(Items.milk_bucket)) ? 1 : 0)) {
                llllllllllllIlllIIIlllIIlIlIllll.dropPlayerItemWithRandomChoice(new ItemStack(Items.milk_bucket, EntityCow.llIIlIlIlIIIII[0], EntityCow.llIIlIlIlIIIII[1]), (boolean)(EntityCow.llIIlIlIlIIIII[1] != 0));
                "".length();
            }
            return EntityCow.llIIlIlIlIIIII[0] != 0;
        }
        return super.interact(llllllllllllIlllIIIlllIIlIlIllll);
    }
    
    @Override
    protected void dropFewItems(final boolean llllllllllllIlllIIIlllIIlIllllII, final int llllllllllllIlllIIIlllIIlIllIllI) {
        int llllllllllllIlllIIIlllIIlIlllIlI = this.rand.nextInt(EntityCow.llIIlIlIlIIIII[3]) + this.rand.nextInt(EntityCow.llIIlIlIlIIIII[0] + llllllllllllIlllIIIlllIIlIllIllI);
        int llllllllllllIlllIIIlllIIlIlllIIl = EntityCow.llIIlIlIlIIIII[1];
        "".length();
        if (((101 + 116 - 111 + 116 ^ 40 + 22 + 60 + 11) & (0xD6 ^ 0xBB ^ (0x91 ^ 0xA7) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIIllIlIIIllIlI(llllllllllllIlllIIIlllIIlIlllIIl, llllllllllllIlllIIIlllIIlIlllIlI)) {
            this.dropItem(Items.leather, EntityCow.llIIlIlIlIIIII[0]);
            "".length();
            ++llllllllllllIlllIIIlllIIlIlllIIl;
        }
        llllllllllllIlllIIIlllIIlIlllIlI = this.rand.nextInt(EntityCow.llIIlIlIlIIIII[3]) + EntityCow.llIIlIlIlIIIII[0] + this.rand.nextInt(EntityCow.llIIlIlIlIIIII[0] + llllllllllllIlllIIIlllIIlIllIllI);
        int llllllllllllIlllIIIlllIIlIlllIII = EntityCow.llIIlIlIlIIIII[1];
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lIIIllIlIIIllIlI(llllllllllllIlllIIIlllIIlIlllIII, llllllllllllIlllIIIlllIIlIlllIlI)) {
            if (lIIIllIlIIIllIll(this.isBurning() ? 1 : 0)) {
                this.dropItem(Items.cooked_beef, EntityCow.llIIlIlIlIIIII[0]);
                "".length();
                "".length();
                if ("   ".length() < ((0x61 ^ 0x4F) & ~(0xB3 ^ 0x9D))) {
                    return;
                }
            }
            else {
                this.dropItem(Items.beef, EntityCow.llIIlIlIlIIIII[0]);
                "".length();
            }
            ++llllllllllllIlllIIIlllIIlIlllIII;
        }
    }
    
    private static void lIIIllIlIIIllIIl() {
        (llIIlIlIlIIIII = new int[9])[0] = " ".length();
        EntityCow.llIIlIlIlIIIII[1] = ((20 + 187 - 26 + 8 ^ 26 + 98 + 21 + 12) & (0xBF ^ 0x87 ^ (0x38 ^ 0x20) ^ -" ".length()));
        EntityCow.llIIlIlIlIIIII[2] = "  ".length();
        EntityCow.llIIlIlIlIIIII[3] = "   ".length();
        EntityCow.llIIlIlIlIIIII[4] = (0xC7 ^ 0xC3);
        EntityCow.llIIlIlIlIIIII[5] = (0x5B ^ 0x38 ^ (0xCD ^ 0xAB));
        EntityCow.llIIlIlIlIIIII[6] = (0xBA ^ 0xBC);
        EntityCow.llIIlIlIlIIIII[7] = (121 + 122 - 238 + 142 ^ 45 + 11 + 45 + 47);
        EntityCow.llIIlIlIlIIIII[8] = (0x2D ^ 0x6F ^ (0x2B ^ 0x61));
    }
    
    @Override
    protected float getSoundVolume() {
        return 0.4f;
    }
    
    @Override
    protected String getHurtSound() {
        return EntityCow.llIIlIlIIlllll[EntityCow.llIIlIlIlIIIII[0]];
    }
    
    private static boolean lIIIllIlIIIllllI(final int llllllllllllIlllIIIlllIIIlIllIII) {
        return llllllllllllIlllIIIlllIIIlIllIII == 0;
    }
    
    private static boolean lIIIllIlIIlIIIII(final int llllllllllllIlllIIIlllIIIllIIIll, final int llllllllllllIlllIIIlllIIIllIIIlI) {
        return llllllllllllIlllIIIlllIIIllIIIll < llllllllllllIlllIIIlllIIIllIIIlI;
    }
    
    @Override
    protected Item getDropItem() {
        return Items.leather;
    }
    
    private static boolean lIIIllIlIIIlllIl(final Object llllllllllllIlllIIIlllIIIlIlllIl, final Object llllllllllllIlllIIIlllIIIlIlllII) {
        return llllllllllllIlllIIIlllIIIlIlllIl == llllllllllllIlllIIIlllIIIlIlllII;
    }
    
    private static boolean lIIIllIlIIIlllll(final int llllllllllllIlllIIIlllIIIllIlIll, final int llllllllllllIlllIIIlllIIIllIlIlI) {
        return llllllllllllIlllIIIlllIIIllIlIll == llllllllllllIlllIIIlllIIIllIlIlI;
    }
    
    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.20000000298023224);
    }
    
    private static String lIIIllIlIIIlIllI(String llllllllllllIlllIIIlllIIIlllIllI, final String llllllllllllIlllIIIlllIIIlllIlIl) {
        llllllllllllIlllIIIlllIIIlllIllI = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIlllIIIlllIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIlllIIIllllIIl = new StringBuilder();
        final char[] llllllllllllIlllIIIlllIIIllllIII = llllllllllllIlllIIIlllIIIlllIlIl.toCharArray();
        int llllllllllllIlllIIIlllIIIlllIlll = EntityCow.llIIlIlIlIIIII[1];
        final double llllllllllllIlllIIIlllIIIlllIIIl = (Object)((String)llllllllllllIlllIIIlllIIIlllIllI).toCharArray();
        final Exception llllllllllllIlllIIIlllIIIlllIIII = (Exception)llllllllllllIlllIIIlllIIIlllIIIl.length;
        double llllllllllllIlllIIIlllIIIllIllll = EntityCow.llIIlIlIlIIIII[1];
        while (lIIIllIlIIlIIIII((int)llllllllllllIlllIIIlllIIIllIllll, (int)llllllllllllIlllIIIlllIIIlllIIII)) {
            final char llllllllllllIlllIIIlllIIIlllllII = llllllllllllIlllIIIlllIIIlllIIIl[llllllllllllIlllIIIlllIIIllIllll];
            llllllllllllIlllIIIlllIIIllllIIl.append((char)(llllllllllllIlllIIIlllIIIlllllII ^ llllllllllllIlllIIIlllIIIllllIII[llllllllllllIlllIIIlllIIIlllIlll % llllllllllllIlllIIIlllIIIllllIII.length]));
            "".length();
            ++llllllllllllIlllIIIlllIIIlllIlll;
            ++llllllllllllIlllIIIlllIIIllIllll;
            "".length();
            if ("  ".length() >= (0x62 ^ 0x27 ^ (0x4 ^ 0x45))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIlllIIIllllIIl);
    }
    
    private static boolean lIIIllIlIIIllIll(final int llllllllllllIlllIIIlllIIIlIllIlI) {
        return llllllllllllIlllIIIlllIIIlIllIlI != 0;
    }
    
    private static String lIIIllIlIIIlIlll(final String llllllllllllIlllIIIlllIIlIIIlIIl, final String llllllllllllIlllIIIlllIIlIIIlIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIlllIIlIIIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlllIIlIIIlIII.getBytes(StandardCharsets.UTF_8)), EntityCow.llIIlIlIlIIIII[8]), "DES");
            final Cipher llllllllllllIlllIIIlllIIlIIIllIl = Cipher.getInstance("DES");
            llllllllllllIlllIIIlllIIlIIIllIl.init(EntityCow.llIIlIlIlIIIII[2], llllllllllllIlllIIIlllIIlIIIlllI);
            return new String(llllllllllllIlllIIIlllIIlIIIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlllIIlIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIlllIIlIIIllII) {
            llllllllllllIlllIIIlllIIlIIIllII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIllIlIIIllIIl();
        lIIIllIlIIIllIII();
    }
    
    @Override
    public EntityCow createChild(final EntityAgeable llllllllllllIlllIIIlllIIlIlIlIII) {
        return new EntityCow(this.worldObj);
    }
    
    @Override
    protected String getLivingSound() {
        return EntityCow.llIIlIlIIlllll[EntityCow.llIIlIlIlIIIII[1]];
    }
    
    private static boolean lIIIllIlIIIllIlI(final int llllllllllllIlllIIIlllIIIllIIlll, final int llllllllllllIlllIIIlllIIIllIIllI) {
        return llllllllllllIlllIIIlllIIIllIIlll >= llllllllllllIlllIIIlllIIIllIIllI;
    }
    
    public EntityCow(final World llllllllllllIlllIIIlllIIllIIllll) {
        super(llllllllllllIlllIIIlllIIllIIllll);
        this.setSize(0.9f, 1.3f);
        ((PathNavigateGround)this.getNavigator()).setAvoidsWater((boolean)(EntityCow.llIIlIlIlIIIII[0] != 0));
        this.tasks.addTask(EntityCow.llIIlIlIlIIIII[1], new EntityAISwimming(this));
        this.tasks.addTask(EntityCow.llIIlIlIlIIIII[0], new EntityAIPanic(this, 2.0));
        this.tasks.addTask(EntityCow.llIIlIlIlIIIII[2], new EntityAIMate(this, 1.0));
        this.tasks.addTask(EntityCow.llIIlIlIlIIIII[3], new EntityAITempt(this, 1.25, Items.wheat, (boolean)(EntityCow.llIIlIlIlIIIII[1] != 0)));
        this.tasks.addTask(EntityCow.llIIlIlIlIIIII[4], new EntityAIFollowParent(this, 1.25));
        this.tasks.addTask(EntityCow.llIIlIlIlIIIII[5], new EntityAIWander(this, 1.0));
        this.tasks.addTask(EntityCow.llIIlIlIlIIIII[6], new EntityAIWatchClosest(this, EntityPlayer.class, 6.0f));
        this.tasks.addTask(EntityCow.llIIlIlIlIIIII[7], new EntityAILookIdle(this));
    }
    
    @Override
    public float getEyeHeight() {
        return this.height;
    }
    
    @Override
    protected void playStepSound(final BlockPos llllllllllllIlllIIIlllIIllIIIllI, final Block llllllllllllIlllIIIlllIIllIIIlIl) {
        this.playSound(EntityCow.llIIlIlIIlllll[EntityCow.llIIlIlIlIIIII[3]], 0.15f, 1.0f);
    }
    
    @Override
    protected String getDeathSound() {
        return EntityCow.llIIlIlIIlllll[EntityCow.llIIlIlIlIIIII[2]];
    }
    
    private static void lIIIllIlIIIllIII() {
        (llIIlIlIIlllll = new String[EntityCow.llIIlIlIlIIIII[4]])[EntityCow.llIIlIlIlIIIII[1]] = lIIIllIlIIIlIlIl("BW+sUZiWl9AzLDv7Iiftdw==", "xHjke");
        EntityCow.llIIlIlIIlllll[EntityCow.llIIlIlIlIIIII[0]] = lIIIllIlIIIlIlIl("GCCxxmHHm5tYoi+B6mYeSw==", "oacGB");
        EntityCow.llIIlIlIIlllll[EntityCow.llIIlIlIlIIIII[2]] = lIIIllIlIIIlIllI("NQ4uawk3FmItHyoV", "XaLEj");
        EntityCow.llIIlIlIIlllll[EntityCow.llIIlIlIlIIIII[3]] = lIIIllIlIIIlIlll("ny9ziijvHOCc1+54aXkDoQ==", "tMpZN");
    }
}
