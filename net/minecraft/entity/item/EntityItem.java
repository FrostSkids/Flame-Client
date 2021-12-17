// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import java.util.Iterator;
import net.minecraft.stats.StatBase;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Arrays;
import org.apache.logging.log4j.LogManager;
import net.minecraft.util.StatCollector;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.init.Items;
import net.minecraft.util.DamageSource;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.world.World;
import net.minecraft.util.MathHelper;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.Logger;
import net.minecraft.entity.Entity;

public class EntityItem extends Entity
{
    public /* synthetic */ float hoverStart;
    private /* synthetic */ int delayBeforeCanPickup;
    private /* synthetic */ int age;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ int[] lIIIlIlIlIIllI;
    private /* synthetic */ String owner;
    private static final /* synthetic */ String[] lIIIlIlIlIIlII;
    private /* synthetic */ String thrower;
    private /* synthetic */ int health;
    
    public ItemStack getEntityItem() {
        final ItemStack lllllllllllllIlIIIIlllIIllIIIIII = this.getDataWatcher().getWatchableObjectItemStack(EntityItem.lIIIlIlIlIIllI[2]);
        if (llIIIIIIllllIII(lllllllllllllIlIIIIlllIIllIIIIII)) {
            if (llIIIIIlIIIIIll(this.worldObj)) {
                EntityItem.logger.error(String.valueOf(new StringBuilder(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[25]]).append(this.getEntityId()).append(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[26]])));
            }
            return new ItemStack(Blocks.stone);
        }
        return lllllllllllllIlIIIIlllIIllIIIIII;
    }
    
    @Override
    public void onUpdate() {
        if (llIIIIIIllllIII(this.getEntityItem())) {
            this.setDead();
            "".length();
            if ((0x5A ^ 0x4B ^ (0xBE ^ 0xAA)) <= 0) {
                return;
            }
        }
        else {
            super.onUpdate();
            if (llIIIIIIllllIIl(this.delayBeforeCanPickup) && llIIIIIIllllIlI(this.delayBeforeCanPickup, EntityItem.lIIIlIlIlIIllI[3])) {
                this.delayBeforeCanPickup -= EntityItem.lIIIlIlIlIIllI[4];
            }
            this.prevPosX = this.posX;
            this.prevPosY = this.posY;
            this.prevPosZ = this.posZ;
            this.motionY -= 0.03999999910593033;
            this.noClip = this.pushOutOfBlocks(this.posX, (this.getEntityBoundingBox().minY + this.getEntityBoundingBox().maxY) / 2.0, this.posZ);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            int n;
            if (llIIIIIIllllIll((int)this.prevPosX, (int)this.posX) && llIIIIIIllllIll((int)this.prevPosY, (int)this.posY) && llIIIIIIllllIll((int)this.prevPosZ, (int)this.posZ)) {
                n = EntityItem.lIIIlIlIlIIllI[1];
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            else {
                n = EntityItem.lIIIlIlIlIIllI[4];
            }
            final boolean lllllllllllllIlIIIIlllIlIIIllIIl = n != 0;
            if (!llIIIIIIlllllII(lllllllllllllIlIIIIlllIlIIIllIIl ? 1 : 0) || llIIIIIIlllllII(this.ticksExisted % EntityItem.lIIIlIlIlIIllI[5])) {
                if (llIIIIIIlllllIl(this.worldObj.getBlockState(new BlockPos(this)).getBlock().getMaterial(), Material.lava)) {
                    this.motionY = 0.20000000298023224;
                    this.motionX = (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f;
                    this.motionZ = (this.rand.nextFloat() - this.rand.nextFloat()) * 0.2f;
                    this.playSound(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[1]], 0.4f, 2.0f + this.rand.nextFloat() * 0.4f);
                }
                if (llIIIIIIlllllII(this.worldObj.isRemote ? 1 : 0)) {
                    this.searchForOtherItemsNearby();
                }
            }
            float lllllllllllllIlIIIIlllIlIIIllIII = 0.98f;
            if (llIIIIIIllllllI(this.onGround ? 1 : 0)) {
                lllllllllllllIlIIIIlllIlIIIllIII = this.worldObj.getBlockState(new BlockPos(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.getEntityBoundingBox().minY) - EntityItem.lIIIlIlIlIIllI[4], MathHelper.floor_double(this.posZ))).getBlock().slipperiness * 0.98f;
            }
            this.motionX *= lllllllllllllIlIIIIlllIlIIIllIII;
            this.motionY *= 0.9800000190734863;
            this.motionZ *= lllllllllllllIlIIIIlllIlIIIllIII;
            if (llIIIIIIllllllI(this.onGround ? 1 : 0)) {
                this.motionY *= -0.5;
            }
            if (llIIIIIIllllIlI(this.age, EntityItem.lIIIlIlIlIIllI[6])) {
                this.age += EntityItem.lIIIlIlIlIIllI[4];
            }
            this.handleWaterMovement();
            "".length();
            if (llIIIIIIlllllII(this.worldObj.isRemote ? 1 : 0) && llIIIIIIlllllll(this.age, EntityItem.lIIIlIlIlIIllI[7])) {
                this.setDead();
            }
        }
    }
    
    public void setDefaultPickupDelay() {
        this.delayBeforeCanPickup = EntityItem.lIIIlIlIlIIllI[2];
    }
    
    public void setPickupDelay(final int lllllllllllllIlIIIIlllIIlIIlIllI) {
        this.delayBeforeCanPickup = lllllllllllllIlIIIIlllIIlIIlIllI;
    }
    
    private static boolean llIIIIIIllllIll(final int lllllllllllllIlIIIIlllIIIlIIlllI, final int lllllllllllllIlIIIIlllIIIlIIllIl) {
        return lllllllllllllIlIIIIlllIIIlIIlllI == lllllllllllllIlIIIIlllIIIlIIllIl;
    }
    
    public EntityItem(final World lllllllllllllIlIIIIlllIlIIlIIIIl) {
        super(lllllllllllllIlIIIIlllIlIIlIIIIl);
        this.health = EntityItem.lIIIlIlIlIIllI[0];
        this.hoverStart = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.setSize(0.25f, 0.25f);
        this.setEntityItemStack(new ItemStack(Blocks.air, EntityItem.lIIIlIlIlIIllI[1]));
    }
    
    private static void llIIIIIIlllIIll() {
        (lIIIlIlIlIIlII = new String[EntityItem.lIIIlIlIlIIllI[29]])[EntityItem.lIIIlIlIlIIllI[1]] = llIIIIIIllIllll("FjIJERgJfQEcDR4=", "dSguw");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[4]] = llIIIIIIllIllll("HjYCDyY+", "VSccR");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[9]] = llIIIIIIlllIIII("NC6BBvOOM9c=", "veiMG");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[10]] = llIIIIIIllIllll("IxsSLhADNhQpBAo=", "srqEe");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[11]] = llIIIIIIlllIIII("BDn35ofgN7M=", "XoxYa");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[0]] = llIIIIIIllIllll("FxI4PRU=", "XeVXg");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[12]] = llIIIIIIllIllll("KxMWKw==", "bgsFu");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[13]] = llIIIIIIlllIIIl("7h3F2jimMsY=", "cxNdI");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[15]] = llIIIIIIlllIIIl("EhlHlG3jucQ=", "xKDAk");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[16]] = llIIIIIIlllIIIl("RrUz9ZzrGkBf+/vydd1odQ==", "jxYdc");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[2]] = llIIIIIIlllIIII("HaRy1aER+3AFL8mxsai+lA==", "NrRgc");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[17]] = llIIIIIIlllIIIl("RvuEdNUYOPs=", "xrPai");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[18]] = llIIIIIIlllIIII("J5LFKjS+yDI=", "gCClN");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[19]] = llIIIIIIlllIIII("4xsKq3myLaU=", "JcaRQ");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[20]] = llIIIIIIlllIIIl("/8U+PUt1Tnk=", "agRqS");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[21]] = llIIIIIIlllIIIl("9rmMhSFGCEI=", "Tuxfv");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[23]] = llIIIIIIlllIIIl("F/Q72y35dpcujRKaAwjabA==", "elOEr");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[24]] = llIIIIIIlllIIIl("fWkkD7IeaXY=", "tiUqP");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[25]] = llIIIIIIlllIIII("lEFOTcl4QTM/VOV/HFjWdg==", "HTLID");
        EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[26]] = llIIIIIIlllIIII("Claxs1Itp5NQleKOkzJVvg==", "VirOq");
    }
    
    public void setNoPickupDelay() {
        this.delayBeforeCanPickup = EntityItem.lIIIlIlIlIIllI[1];
    }
    
    public int getAge() {
        return this.age;
    }
    
    private static boolean llIIIIIIllllIII(final Object lllllllllllllIlIIIIlllIIIIlIIIlI) {
        return lllllllllllllIlIIIIlllIIIIlIIIlI == null;
    }
    
    private boolean combineItems(final EntityItem lllllllllllllIlIIIIlllIlIIIIIIll) {
        if (llIIIIIIlllllIl(lllllllllllllIlIIIIlllIlIIIIIIll, this)) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        if (!llIIIIIIllllllI(lllllllllllllIlIIIIlllIlIIIIIIll.isEntityAlive() ? 1 : 0) || !llIIIIIIllllllI(this.isEntityAlive() ? 1 : 0)) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        final ItemStack lllllllllllllIlIIIIlllIlIIIIIllI = this.getEntityItem();
        final ItemStack lllllllllllllIlIIIIlllIlIIIIIlIl = lllllllllllllIlIIIIlllIlIIIIIIll.getEntityItem();
        if (!llIIIIIIllllIlI(this.delayBeforeCanPickup, EntityItem.lIIIlIlIlIIllI[3]) || !llIIIIIIllllIlI(lllllllllllllIlIIIIlllIlIIIIIIll.delayBeforeCanPickup, EntityItem.lIIIlIlIlIIllI[3])) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        if (!llIIIIIIllllIlI(this.age, EntityItem.lIIIlIlIlIIllI[6]) || !llIIIIIIllllIlI(lllllllllllllIlIIIIlllIlIIIIIIll.age, EntityItem.lIIIlIlIlIIllI[6])) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        if (llIIIIIlIIIIIII(lllllllllllllIlIIIIlllIlIIIIIlIl.getItem(), lllllllllllllIlIIIIlllIlIIIIIllI.getItem())) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        if (llIIIIIIllllllI((lllllllllllllIlIIIIlllIlIIIIIlIl.hasTagCompound() ^ lllllllllllllIlIIIIlllIlIIIIIllI.hasTagCompound()) ? 1 : 0)) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        if (llIIIIIIllllllI(lllllllllllllIlIIIIlllIlIIIIIlIl.hasTagCompound() ? 1 : 0) && llIIIIIIlllllII(lllllllllllllIlIIIIlllIlIIIIIlIl.getTagCompound().equals(lllllllllllllIlIIIIlllIlIIIIIllI.getTagCompound()) ? 1 : 0)) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        if (llIIIIIIllllIII(lllllllllllllIlIIIIlllIlIIIIIlIl.getItem())) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        if (llIIIIIIllllllI(lllllllllllllIlIIIIlllIlIIIIIlIl.getItem().getHasSubtypes() ? 1 : 0) && llIIIIIIllllIlI(lllllllllllllIlIIIIlllIlIIIIIlIl.getMetadata(), lllllllllllllIlIIIIlllIlIIIIIllI.getMetadata())) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        if (llIIIIIlIIIIIIl(lllllllllllllIlIIIIlllIlIIIIIlIl.stackSize, lllllllllllllIlIIIIlllIlIIIIIllI.stackSize)) {
            return lllllllllllllIlIIIIlllIlIIIIIIll.combineItems(this);
        }
        if (llIIIIIlIIIIIlI(lllllllllllllIlIIIIlllIlIIIIIlIl.stackSize + lllllllllllllIlIIIIlllIlIIIIIllI.stackSize, lllllllllllllIlIIIIlllIlIIIIIlIl.getMaxStackSize())) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        final ItemStack itemStack = lllllllllllllIlIIIIlllIlIIIIIlIl;
        itemStack.stackSize += lllllllllllllIlIIIIlllIlIIIIIllI.stackSize;
        lllllllllllllIlIIIIlllIlIIIIIIll.delayBeforeCanPickup = Math.max(lllllllllllllIlIIIIlllIlIIIIIIll.delayBeforeCanPickup, this.delayBeforeCanPickup);
        lllllllllllllIlIIIIlllIlIIIIIIll.age = Math.min(lllllllllllllIlIIIIlllIlIIIIIIll.age, this.age);
        lllllllllllllIlIIIIlllIlIIIIIIll.setEntityItemStack(lllllllllllllIlIIIIlllIlIIIIIlIl);
        this.setDead();
        return EntityItem.lIIIlIlIlIIllI[4] != 0;
    }
    
    public String getThrower() {
        return this.thrower;
    }
    
    private static boolean llIIIIIIllllIIl(final int lllllllllllllIlIIIIlllIIIIIIllll) {
        return lllllllllllllIlIIIIlllIIIIIIllll > 0;
    }
    
    public void setEntityItemStack(final ItemStack lllllllllllllIlIIIIlllIIlIlllIlI) {
        this.getDataWatcher().updateObject(EntityItem.lIIIlIlIlIIllI[2], lllllllllllllIlIIIIlllIIlIlllIlI);
        this.getDataWatcher().setObjectWatched(EntityItem.lIIIlIlIlIIllI[2]);
    }
    
    public void setOwner(final String lllllllllllllIlIIIIlllIIlIlIllll) {
        this.owner = lllllllllllllIlIIIIlllIIlIlIllll;
    }
    
    private static String llIIIIIIlllIIII(final String lllllllllllllIlIIIIlllIIIlIllllI, final String lllllllllllllIlIIIIlllIIIlIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlllIIIllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlllIIIlIlllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIlllIIIllIIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIlllIIIllIIIII.init(EntityItem.lIIIlIlIlIIllI[9], lllllllllllllIlIIIIlllIIIllIIIIl);
            return new String(lllllllllllllIlIIIIlllIIIllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlllIIIlIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlllIIIlIlllll) {
            lllllllllllllIlIIIIlllIIIlIlllll.printStackTrace();
            return null;
        }
    }
    
    public void setInfinitePickupDelay() {
        this.delayBeforeCanPickup = EntityItem.lIIIlIlIlIIllI[3];
    }
    
    @Override
    public void travelToDimension(final int lllllllllllllIlIIIIlllIIllIIIllI) {
        super.travelToDimension(lllllllllllllIlIIIIlllIIllIIIllI);
        if (llIIIIIIlllllII(this.worldObj.isRemote ? 1 : 0)) {
            this.searchForOtherItemsNearby();
        }
    }
    
    public void setNoDespawn() {
        this.age = EntityItem.lIIIlIlIlIIllI[27];
    }
    
    private static boolean llIIIIIlIIIIIlI(final int lllllllllllllIlIIIIlllIIIIlllIlI, final int lllllllllllllIlIIIIlllIIIIlllIII) {
        return lllllllllllllIlIIIIlllIIIIlllIlI > lllllllllllllIlIIIIlllIIIIlllIII;
    }
    
    private static boolean llIIIIIlIIIIlII(final int lllllllllllllIlIIIIlllIIIIIlIlII) {
        return lllllllllllllIlIIIIlllIIIIIlIlII <= 0;
    }
    
    @Override
    protected boolean canTriggerWalking() {
        return EntityItem.lIIIlIlIlIIllI[1] != 0;
    }
    
    @Override
    public boolean attackEntityFrom(final DamageSource lllllllllllllIlIIIIlllIIlllIllIl, final float lllllllllllllIlIIIIlllIIlllIllll) {
        if (llIIIIIIllllllI(this.isEntityInvulnerable(lllllllllllllIlIIIIlllIIlllIllIl) ? 1 : 0)) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        if (llIIIIIlIIIIIll(this.getEntityItem()) && llIIIIIIlllllIl(this.getEntityItem().getItem(), Items.nether_star) && llIIIIIIllllllI(lllllllllllllIlIIIIlllIIlllIllIl.isExplosion() ? 1 : 0)) {
            return EntityItem.lIIIlIlIlIIllI[1] != 0;
        }
        this.setBeenAttacked();
        this.health -= (int)lllllllllllllIlIIIIlllIIlllIllll;
        if (llIIIIIlIIIIlII(this.health)) {
            this.setDead();
        }
        return EntityItem.lIIIlIlIlIIllI[1] != 0;
    }
    
    private static String llIIIIIIllIllll(String lllllllllllllIlIIIIlllIIIllIlllI, final String lllllllllllllIlIIIIlllIIIllIllIl) {
        lllllllllllllIlIIIIlllIIIllIlllI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIlllIIIllIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIlllIIIlllIIIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIlllIIIlllIIII = lllllllllllllIlIIIIlllIIIllIllIl.toCharArray();
        int lllllllllllllIlIIIIlllIIIllIllll = EntityItem.lIIIlIlIlIIllI[1];
        final long lllllllllllllIlIIIIlllIIIllIlIIl = (Object)((String)lllllllllllllIlIIIIlllIIIllIlllI).toCharArray();
        final char lllllllllllllIlIIIIlllIIIllIlIII = (char)lllllllllllllIlIIIIlllIIIllIlIIl.length;
        long lllllllllllllIlIIIIlllIIIllIIlll = EntityItem.lIIIlIlIlIIllI[1];
        while (llIIIIIlIIIIIIl((int)lllllllllllllIlIIIIlllIIIllIIlll, lllllllllllllIlIIIIlllIIIllIlIII)) {
            final char lllllllllllllIlIIIIlllIIIlllIlII = lllllllllllllIlIIIIlllIIIllIlIIl[lllllllllllllIlIIIIlllIIIllIIlll];
            lllllllllllllIlIIIIlllIIIlllIIIl.append((char)(lllllllllllllIlIIIIlllIIIlllIlII ^ lllllllllllllIlIIIIlllIIIlllIIII[lllllllllllllIlIIIIlllIIIllIllll % lllllllllllllIlIIIIlllIIIlllIIII.length]));
            "".length();
            ++lllllllllllllIlIIIIlllIIIllIllll;
            ++lllllllllllllIlIIIIlllIIIllIIlll;
            "".length();
            if (((0xA3 ^ 0x83) & ~(0x83 ^ 0xA3)) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIlllIIIlllIIIl);
    }
    
    private static boolean llIIIIIIlllllll(final int lllllllllllllIlIIIIlllIIIlIIIlIl, final int lllllllllllllIlIIIIlllIIIlIIIlII) {
        return lllllllllllllIlIIIIlllIIIlIIIlIl >= lllllllllllllIlIIIIlllIIIlIIIlII;
    }
    
    public EntityItem(final World lllllllllllllIlIIIIlllIlIIllllIl, final double lllllllllllllIlIIIIlllIlIlIIIIIl, final double lllllllllllllIlIIIIlllIlIIlllIll, final double lllllllllllllIlIIIIlllIlIIlllIlI) {
        super(lllllllllllllIlIIIIlllIlIIllllIl);
        this.health = EntityItem.lIIIlIlIlIIllI[0];
        this.hoverStart = (float)(Math.random() * 3.141592653589793 * 2.0);
        this.setSize(0.25f, 0.25f);
        this.setPosition(lllllllllllllIlIIIIlllIlIlIIIIIl, lllllllllllllIlIIIIlllIlIIlllIll, lllllllllllllIlIIIIlllIlIIlllIlI);
        this.rotationYaw = (float)(Math.random() * 360.0);
        this.motionX = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612);
        this.motionY = 0.20000000298023224;
        this.motionZ = (float)(Math.random() * 0.20000000298023224 - 0.10000000149011612);
    }
    
    public void func_174870_v() {
        this.setInfinitePickupDelay();
        this.age = EntityItem.lIIIlIlIlIIllI[28];
    }
    
    public String getOwner() {
        return this.owner;
    }
    
    private static boolean llIIIIIlIIIIIIl(final int lllllllllllllIlIIIIlllIIIIllllll, final int lllllllllllllIlIIIIlllIIIIlllllI) {
        return lllllllllllllIlIIIIlllIIIIllllll < lllllllllllllIlIIIIlllIIIIlllllI;
    }
    
    public void setThrower(final String lllllllllllllIlIIIIlllIIlIlIIllI) {
        this.thrower = lllllllllllllIlIIIIlllIIlIlIIllI;
    }
    
    private static boolean llIIIIIIlllllII(final int lllllllllllllIlIIIIlllIIIIIllIIl) {
        return lllllllllllllIlIIIIlllIIIIIllIIl == 0;
    }
    
    public void readEntityFromNBT(final NBTTagCompound lllllllllllllIlIIIIlllIIllIllllI) {
        this.health = (lllllllllllllIlIIIIlllIIllIllllI.getShort(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[13]]) & EntityItem.lIIIlIlIlIIllI[14]);
        this.age = lllllllllllllIlIIIIlllIIllIllllI.getShort(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[15]]);
        if (llIIIIIIllllllI(lllllllllllllIlIIIIlllIIllIllllI.hasKey(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[16]]) ? 1 : 0)) {
            this.delayBeforeCanPickup = lllllllllllllIlIIIIlllIIllIllllI.getShort(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[2]]);
        }
        if (llIIIIIIllllllI(lllllllllllllIlIIIIlllIIllIllllI.hasKey(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[17]]) ? 1 : 0)) {
            this.owner = lllllllllllllIlIIIIlllIIllIllllI.getString(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[18]]);
        }
        if (llIIIIIIllllllI(lllllllllllllIlIIIIlllIIllIllllI.hasKey(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[19]]) ? 1 : 0)) {
            this.thrower = lllllllllllllIlIIIIlllIIllIllllI.getString(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[20]]);
        }
        final NBTTagCompound lllllllllllllIlIIIIlllIIlllIIIII = lllllllllllllIlIIIIlllIIllIllllI.getCompoundTag(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[21]]);
        this.setEntityItemStack(ItemStack.loadItemStackFromNBT(lllllllllllllIlIIIIlllIIlllIIIII));
        if (llIIIIIIllllIII(this.getEntityItem())) {
            this.setDead();
        }
    }
    
    @Override
    protected void dealFireDamage(final int lllllllllllllIlIIIIlllIIllllIlIl) {
        this.attackEntityFrom(DamageSource.inFire, (float)lllllllllllllIlIIIIlllIIllllIlIl);
        "".length();
    }
    
    private static boolean llIIIIIIlllllIl(final Object lllllllllllllIlIIIIlllIIIIlIlIIl, final Object lllllllllllllIlIIIIlllIIIIlIIlll) {
        return lllllllllllllIlIIIIlllIIIIlIlIIl == lllllllllllllIlIIIIlllIIIIlIIlll;
    }
    
    public boolean cannotPickup() {
        if (llIIIIIIllllIIl(this.delayBeforeCanPickup)) {
            return EntityItem.lIIIlIlIlIIllI[4] != 0;
        }
        return EntityItem.lIIIlIlIlIIllI[1] != 0;
    }
    
    private static boolean llIIIIIIllllllI(final int lllllllllllllIlIIIIlllIIIIIllllI) {
        return lllllllllllllIlIIIIlllIIIIIllllI != 0;
    }
    
    private static boolean llIIIIIlIIIIIII(final Object lllllllllllllIlIIIIlllIIIIllIIlI, final Object lllllllllllllIlIIIIlllIIIIllIIII) {
        return lllllllllllllIlIIIIlllIIIIllIIlI != lllllllllllllIlIIIIlllIIIIllIIII;
    }
    
    private static boolean llIIIIIlIIIIIll(final Object lllllllllllllIlIIIIlllIIIIlIIlII) {
        return lllllllllllllIlIIIIlllIIIIlIIlII != null;
    }
    
    @Override
    public boolean canAttackWithItem() {
        return EntityItem.lIIIlIlIlIIllI[1] != 0;
    }
    
    public void writeEntityToNBT(final NBTTagCompound lllllllllllllIlIIIIlllIIlllIlIII) {
        lllllllllllllIlIIIIlllIIlllIlIII.setShort(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[4]], (byte)this.health);
        lllllllllllllIlIIIIlllIIlllIlIII.setShort(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[9]], (short)this.age);
        lllllllllllllIlIIIIlllIIlllIlIII.setShort(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[10]], (short)this.delayBeforeCanPickup);
        if (llIIIIIlIIIIIll(this.getThrower())) {
            lllllllllllllIlIIIIlllIIlllIlIII.setString(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[11]], this.thrower);
        }
        if (llIIIIIlIIIIIll(this.getOwner())) {
            lllllllllllllIlIIIIlllIIlllIlIII.setString(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[0]], this.owner);
        }
        if (llIIIIIlIIIIIll(this.getEntityItem())) {
            lllllllllllllIlIIIIlllIIlllIlIII.setTag(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[12]], this.getEntityItem().writeToNBT(new NBTTagCompound()));
        }
    }
    
    private static boolean llIIIIIIllllIlI(final int lllllllllllllIlIIIIlllIIIIIIlIII, final int lllllllllllllIlIIIIlllIIIIIIIllI) {
        return lllllllllllllIlIIIIlllIIIIIIlIII != lllllllllllllIlIIIIlllIIIIIIIllI;
    }
    
    @Override
    public String getName() {
        String s;
        if (llIIIIIIllllllI(this.hasCustomName() ? 1 : 0)) {
            s = this.getCustomNameTag();
            "".length();
            if ("   ".length() == ((83 + 10 - 90 + 146 ^ 30 + 115 - 134 + 117) & (62 + 67 - 53 + 66 ^ 41 + 99 - 137 + 152 ^ -" ".length()))) {
                return null;
            }
        }
        else {
            s = StatCollector.translateToLocal(String.valueOf(new StringBuilder(EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[24]]).append(this.getEntityItem().getUnlocalizedName())));
        }
        return s;
    }
    
    static {
        llIIIIIIlllIlll();
        llIIIIIIlllIIll();
        logger = LogManager.getLogger();
    }
    
    private static String llIIIIIIlllIIIl(final String lllllllllllllIlIIIIlllIIlIIIIIIl, final String lllllllllllllIlIIIIlllIIlIIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlllIIlIIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlllIIlIIIIIII.getBytes(StandardCharsets.UTF_8)), EntityItem.lIIIlIlIlIIllI[15]), "DES");
            final Cipher lllllllllllllIlIIIIlllIIlIIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIlllIIlIIIIlIl.init(EntityItem.lIIIlIlIlIIllI[9], lllllllllllllIlIIIIlllIIlIIIIllI);
            return new String(lllllllllllllIlIIIIlllIIlIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlllIIlIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlllIIlIIIIlII) {
            lllllllllllllIlIIIIlllIIlIIIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onCollideWithPlayer(final EntityPlayer lllllllllllllIlIIIIlllIIllIlIllI) {
        if (llIIIIIIlllllII(this.worldObj.isRemote ? 1 : 0)) {
            final ItemStack lllllllllllllIlIIIIlllIIllIlIlIl = this.getEntityItem();
            final int lllllllllllllIlIIIIlllIIllIlIlII = lllllllllllllIlIIIIlllIIllIlIlIl.stackSize;
            if (llIIIIIIlllllII(this.delayBeforeCanPickup) && (!llIIIIIlIIIIIll(this.owner) || !llIIIIIlIIIIIlI(EntityItem.lIIIlIlIlIIllI[7] - this.age, EntityItem.lIIIlIlIlIIllI[22]) || llIIIIIIllllllI(this.owner.equals(lllllllllllllIlIIIIlllIIllIlIllI.getName()) ? 1 : 0)) && llIIIIIIllllllI(lllllllllllllIlIIIIlllIIllIlIllI.inventory.addItemStackToInventory(lllllllllllllIlIIIIlllIIllIlIlIl) ? 1 : 0)) {
                if (llIIIIIIlllllIl(lllllllllllllIlIIIIlllIIllIlIlIl.getItem(), Item.getItemFromBlock(Blocks.log))) {
                    lllllllllllllIlIIIIlllIIllIlIllI.triggerAchievement(AchievementList.mineWood);
                }
                if (llIIIIIIlllllIl(lllllllllllllIlIIIIlllIIllIlIlIl.getItem(), Item.getItemFromBlock(Blocks.log2))) {
                    lllllllllllllIlIIIIlllIIllIlIllI.triggerAchievement(AchievementList.mineWood);
                }
                if (llIIIIIIlllllIl(lllllllllllllIlIIIIlllIIllIlIlIl.getItem(), Items.leather)) {
                    lllllllllllllIlIIIIlllIIllIlIllI.triggerAchievement(AchievementList.killCow);
                }
                if (llIIIIIIlllllIl(lllllllllllllIlIIIIlllIIllIlIlIl.getItem(), Items.diamond)) {
                    lllllllllllllIlIIIIlllIIllIlIllI.triggerAchievement(AchievementList.diamonds);
                }
                if (llIIIIIIlllllIl(lllllllllllllIlIIIIlllIIllIlIlIl.getItem(), Items.blaze_rod)) {
                    lllllllllllllIlIIIIlllIIllIlIllI.triggerAchievement(AchievementList.blazeRod);
                }
                if (llIIIIIIlllllIl(lllllllllllllIlIIIIlllIIllIlIlIl.getItem(), Items.diamond) && llIIIIIlIIIIIll(this.getThrower())) {
                    final EntityPlayer lllllllllllllIlIIIIlllIIllIlIIll = this.worldObj.getPlayerEntityByName(this.getThrower());
                    if (llIIIIIlIIIIIll(lllllllllllllIlIIIIlllIIllIlIIll) && llIIIIIlIIIIIII(lllllllllllllIlIIIIlllIIllIlIIll, lllllllllllllIlIIIIlllIIllIlIllI)) {
                        lllllllllllllIlIIIIlllIIllIlIIll.triggerAchievement(AchievementList.diamondsToYou);
                    }
                }
                if (llIIIIIIlllllII(this.isSilent() ? 1 : 0)) {
                    this.worldObj.playSoundAtEntity(lllllllllllllIlIIIIlllIIllIlIllI, EntityItem.lIIIlIlIlIIlII[EntityItem.lIIIlIlIlIIllI[23]], 0.2f, ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                }
                lllllllllllllIlIIIIlllIIllIlIllI.onItemPickup(this, lllllllllllllIlIIIIlllIIllIlIlII);
                if (llIIIIIlIIIIlII(lllllllllllllIlIIIIlllIIllIlIlIl.stackSize)) {
                    this.setDead();
                }
            }
        }
    }
    
    public void setAgeToCreativeDespawnTime() {
        this.age = EntityItem.lIIIlIlIlIIllI[8];
    }
    
    private void searchForOtherItemsNearby() {
        final String lllllllllllllIlIIIIlllIlIIIIllIl = (String)this.worldObj.getEntitiesWithinAABB((Class<? extends Entity>)EntityItem.class, this.getEntityBoundingBox().expand(0.5, 0.0, 0.5)).iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!llIIIIIIlllllII(((Iterator)lllllllllllllIlIIIIlllIlIIIIllIl).hasNext() ? 1 : 0)) {
            final EntityItem lllllllllllllIlIIIIlllIlIIIlIIII = ((Iterator<EntityItem>)lllllllllllllIlIIIIlllIlIIIIllIl).next();
            this.combineItems(lllllllllllllIlIIIIlllIlIIIlIIII);
            "".length();
        }
    }
    
    @Override
    public boolean handleWaterMovement() {
        if (llIIIIIIllllllI(this.worldObj.handleMaterialAcceleration(this.getEntityBoundingBox(), Material.water, this) ? 1 : 0)) {
            if (llIIIIIIlllllII(this.inWater ? 1 : 0) && llIIIIIIlllllII(this.firstUpdate ? 1 : 0)) {
                this.resetHeight();
            }
            this.inWater = (EntityItem.lIIIlIlIlIIllI[4] != 0);
            "".length();
            if (((0x83 ^ 0xA0 ^ (0x30 ^ 0x45)) & (0x6D ^ 0x25 ^ (0x3 ^ 0x1D) ^ -" ".length())) != 0x0) {
                return ((0x6 ^ 0x3F ^ (0x46 ^ 0x2D)) & (0xFF ^ 0xBD ^ (0x59 ^ 0x49) ^ -" ".length())) != 0x0;
            }
        }
        else {
            this.inWater = (EntityItem.lIIIlIlIlIIllI[1] != 0);
        }
        return this.inWater;
    }
    
    @Override
    protected void entityInit() {
        this.getDataWatcher().addObjectByDataType(EntityItem.lIIIlIlIlIIllI[2], EntityItem.lIIIlIlIlIIllI[0]);
    }
    
    public EntityItem(final World lllllllllllllIlIIIIlllIlIIlIllII, final double lllllllllllllIlIIIIlllIlIIllIIIl, final double lllllllllllllIlIIIIlllIlIIllIIII, final double lllllllllllllIlIIIIlllIlIIlIlIIl, final ItemStack lllllllllllllIlIIIIlllIlIIlIlIII) {
        this(lllllllllllllIlIIIIlllIlIIlIllII, lllllllllllllIlIIIIlllIlIIllIIIl, lllllllllllllIlIIIIlllIlIIllIIII, lllllllllllllIlIIIIlllIlIIlIlIIl);
        this.setEntityItemStack(lllllllllllllIlIIIIlllIlIIlIlIII);
    }
    
    private static void llIIIIIIlllIlll() {
        (lIIIlIlIlIIllI = new int[30])[0] = (67 + 104 - 65 + 78 ^ 40 + 99 - 97 + 147);
        EntityItem.lIIIlIlIlIIllI[1] = ((0xBB ^ 0x91 ^ (0x0 ^ 0x64)) & (0x4A ^ 0xE ^ (0xC8 ^ 0xC2) ^ -" ".length()));
        EntityItem.lIIIlIlIlIIllI[2] = (0x1E ^ 0x55 ^ (0x58 ^ 0x19));
        EntityItem.lIIIlIlIlIIllI[3] = (-" ".length() & (-1 & 0x7FFF));
        EntityItem.lIIIlIlIlIIllI[4] = " ".length();
        EntityItem.lIIIlIlIlIIllI[5] = (32 + 39 + 12 + 87 ^ 169 + 161 - 232 + 81);
        EntityItem.lIIIlIlIlIIllI[6] = -(-(0xFFFFFCE9 & 0x237F) & (0xFFFFEFFE & 0xB069));
        EntityItem.lIIIlIlIlIIllI[7] = (-(0xFFFFDF3B & 0x68CD) & (0xFFFFDFFC & 0x7F7B));
        EntityItem.lIIIlIlIlIIllI[8] = (0xFFFF9BFE & 0x76C1);
        EntityItem.lIIIlIlIlIIllI[9] = "  ".length();
        EntityItem.lIIIlIlIlIIllI[10] = "   ".length();
        EntityItem.lIIIlIlIlIIllI[11] = (0x29 ^ 0x2D);
        EntityItem.lIIIlIlIlIIllI[12] = (0x35 ^ 0x33);
        EntityItem.lIIIlIlIlIIllI[13] = (120 + 8 + 23 + 19 ^ 124 + 8 - 59 + 100);
        EntityItem.lIIIlIlIlIIllI[14] = (0xE7 ^ 0xA4) + (161 + 216 - 165 + 8) - (147 + 140 - 127 + 30) + (62 + 144 - 131 + 83);
        EntityItem.lIIIlIlIlIIllI[15] = (0x9 ^ 0x31 ^ (0x40 ^ 0x70));
        EntityItem.lIIIlIlIlIIllI[16] = (0x1A ^ 0x13);
        EntityItem.lIIIlIlIlIIllI[17] = (0x4 ^ 0x20 ^ (0xAE ^ 0x81));
        EntityItem.lIIIlIlIlIIllI[18] = (0x99 ^ 0x95);
        EntityItem.lIIIlIlIlIIllI[19] = (173 + 67 - 203 + 146 ^ 79 + 99 - 140 + 148);
        EntityItem.lIIIlIlIlIIllI[20] = (0xD1 ^ 0xA0 ^ 9 + 19 + 3 + 96);
        EntityItem.lIIIlIlIlIIllI[21] = (0x29 ^ 0x66 ^ (0x5A ^ 0x1A));
        EntityItem.lIIIlIlIlIIllI[22] = 101 + 10 - 101 + 190;
        EntityItem.lIIIlIlIlIIllI[23] = (0xD ^ 0x2C ^ (0x44 ^ 0x75));
        EntityItem.lIIIlIlIlIIllI[24] = (0x47 ^ 0x56);
        EntityItem.lIIIlIlIlIIllI[25] = (0x7F ^ 0x62 ^ (0x43 ^ 0x4C));
        EntityItem.lIIIlIlIlIIllI[26] = (0x3F ^ 0x2C);
        EntityItem.lIIIlIlIlIIllI[27] = -(-(0xFFFFEAFE & 0x7D87) & (0xFFFFFFF5 & 0x7FFF));
        EntityItem.lIIIlIlIlIIllI[28] = (0xFFFFD7EF & 0x3F7F);
        EntityItem.lIIIlIlIlIIllI[29] = (0x32 ^ 0x26);
    }
}
