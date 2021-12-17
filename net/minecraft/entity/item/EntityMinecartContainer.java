// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.item;

import net.minecraft.nbt.NBTBase;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.LockCode;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.world.ILockableContainer;

public abstract class EntityMinecartContainer extends EntityMinecart implements ILockableContainer
{
    private static final /* synthetic */ String[] lIIIIlIlIIlIIl;
    private /* synthetic */ boolean dropContentsWhenDead;
    private /* synthetic */ ItemStack[] minecartContainerItems;
    private static final /* synthetic */ int[] lIIIIlIlIIllIl;
    
    @Override
    public void markDirty() {
    }
    
    public EntityMinecartContainer(final World lllllllllllllIlIIlIllIIlllllIlII) {
        super(lllllllllllllIlIIlIllIIlllllIlII);
        this.minecartContainerItems = new ItemStack[EntityMinecartContainer.lIIIIlIlIIllIl[0]];
        this.dropContentsWhenDead = (EntityMinecartContainer.lIIIIlIlIIllIl[1] != 0);
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer lllllllllllllIlIIlIllIIllIllIIIl) {
        int n;
        if (lIlllIIllIllIII(this.isDead ? 1 : 0)) {
            n = EntityMinecartContainer.lIIIIlIlIIllIl[2];
            "".length();
            if ("   ".length() <= " ".length()) {
                return ((0x78 ^ 0x67 ^ (0x91 ^ 0xA1)) & (57 + 24 + 5 + 54 ^ 37 + 136 - 57 + 47 ^ -" ".length())) != 0x0;
            }
        }
        else if (lIlllIIllIllllI(lIlllIIllIlllIl(lllllllllllllIlIIlIllIIllIllIIIl.getDistanceSqToEntity(this), 64.0))) {
            n = EntityMinecartContainer.lIIIIlIlIIllIl[1];
            "".length();
            if ((0x93 ^ 0x97) <= "  ".length()) {
                return ((0x1 ^ 0x4C) & ~(0x58 ^ 0x15)) != 0x0;
            }
        }
        else {
            n = EntityMinecartContainer.lIIIIlIlIIllIl[2];
        }
        return n != 0;
    }
    
    @Override
    public int getInventoryStackLimit() {
        return EntityMinecartContainer.lIIIIlIlIIllIl[3];
    }
    
    private static boolean lIlllIIllIllIIl(final Object lllllllllllllIlIIlIllIIlIIIllIIl) {
        return lllllllllllllIlIIlIllIIlIIIllIIl != null;
    }
    
    @Override
    public void killMinecart(final DamageSource lllllllllllllIlIIlIllIIlllIlllll) {
        super.killMinecart(lllllllllllllIlIIlIllIIlllIlllll);
        if (lIlllIIllIllIII(this.worldObj.getGameRules().getBoolean(EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[2]]) ? 1 : 0)) {
            InventoryHelper.func_180176_a(this.worldObj, this, this);
        }
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int lllllllllllllIlIIlIllIIlllIIIlIl) {
        if (lIlllIIllIllIIl(this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIIlIl])) {
            final ItemStack lllllllllllllIlIIlIllIIlllIIIlII = this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIIlIl];
            this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIIlIl] = null;
            return lllllllllllllIlIIlIllIIlllIIIlII;
        }
        return null;
    }
    
    @Override
    protected void applyDrag() {
        final int lllllllllllllIlIIlIllIIlIlllIIIl = EntityMinecartContainer.lIIIIlIlIIllIl[10] - Container.calcRedstoneFromInventory(this);
        final float lllllllllllllIlIIlIllIIlIlllIIII = 0.98f + lllllllllllllIlIIlIllIIlIlllIIIl * 0.001f;
        this.motionX *= lllllllllllllIlIIlIllIIlIlllIIII;
        this.motionY *= 0.0;
        this.motionZ *= lllllllllllllIlIIlIllIIlIlllIIII;
    }
    
    @Override
    public ItemStack getStackInSlot(final int lllllllllllllIlIIlIllIIlllIlIlll) {
        return this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIlIlll];
    }
    
    @Override
    public void setInventorySlotContents(final int lllllllllllllIlIIlIllIIllIllllII, final ItemStack lllllllllllllIlIIlIllIIllIlllIII) {
        this.minecartContainerItems[lllllllllllllIlIIlIllIIllIllllII] = lllllllllllllIlIIlIllIIllIlllIII;
        if (lIlllIIllIllIIl(lllllllllllllIlIIlIllIIllIlllIII) && lIlllIIllIlllII(lllllllllllllIlIIlIllIIllIlllIII.stackSize, this.getInventoryStackLimit())) {
            lllllllllllllIlIIlIllIIllIlllIII.stackSize = this.getInventoryStackLimit();
        }
    }
    
    private static boolean lIlllIIllIllIlI(final int lllllllllllllIlIIlIllIIlIIlIIIII, final int lllllllllllllIlIIlIllIIlIIIlllll) {
        return lllllllllllllIlIIlIllIIlIIlIIIII <= lllllllllllllIlIIlIllIIlIIIlllll;
    }
    
    private static String lIlllIIllIIlIll(String lllllllllllllIlIIlIllIIlIlIIIlIl, final String lllllllllllllIlIIlIllIIlIlIIIlII) {
        lllllllllllllIlIIlIllIIlIlIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIllIIlIlIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIllIIlIlIIIIll = new StringBuilder();
        final char[] lllllllllllllIlIIlIllIIlIlIIIIlI = lllllllllllllIlIIlIllIIlIlIIIlII.toCharArray();
        int lllllllllllllIlIIlIllIIlIlIIIIIl = EntityMinecartContainer.lIIIIlIlIIllIl[2];
        final int lllllllllllllIlIIlIllIIlIIlllIll = (Object)lllllllllllllIlIIlIllIIlIlIIIlIl.toCharArray();
        final char lllllllllllllIlIIlIllIIlIIlllIlI = (char)lllllllllllllIlIIlIllIIlIIlllIll.length;
        short lllllllllllllIlIIlIllIIlIIlllIIl = (short)EntityMinecartContainer.lIIIIlIlIIllIl[2];
        while (lIlllIIlllIIIIl(lllllllllllllIlIIlIllIIlIIlllIIl, lllllllllllllIlIIlIllIIlIIlllIlI)) {
            final char lllllllllllllIlIIlIllIIlIlIIIllI = lllllllllllllIlIIlIllIIlIIlllIll[lllllllllllllIlIIlIllIIlIIlllIIl];
            lllllllllllllIlIIlIllIIlIlIIIIll.append((char)(lllllllllllllIlIIlIllIIlIlIIIllI ^ lllllllllllllIlIIlIllIIlIlIIIIlI[lllllllllllllIlIIlIllIIlIlIIIIIl % lllllllllllllIlIIlIllIIlIlIIIIlI.length]));
            "".length();
            ++lllllllllllllIlIIlIllIIlIlIIIIIl;
            ++lllllllllllllIlIIlIllIIlIIlllIIl;
            "".length();
            if ((0xC1 ^ 0xAB ^ (0xF0 ^ 0x9E)) <= ((0x2E ^ 0x18 ^ (0xD0 ^ 0xA5)) & (0x65 ^ 0xF ^ (0x25 ^ 0xC) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIllIIlIlIIIIll);
    }
    
    @Override
    public void travelToDimension(final int lllllllllllllIlIIlIllIIllIlIIIII) {
        this.dropContentsWhenDead = (EntityMinecartContainer.lIIIIlIlIIllIl[2] != 0);
        super.travelToDimension(lllllllllllllIlIIlIllIIllIlIIIII);
    }
    
    @Override
    public ItemStack decrStackSize(final int lllllllllllllIlIIlIllIIlllIIllII, final int lllllllllllllIlIIlIllIIlllIlIIII) {
        if (!lIlllIIllIllIIl(this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIllII])) {
            return null;
        }
        if (lIlllIIllIllIlI(this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIllII].stackSize, lllllllllllllIlIIlIllIIlllIlIIII)) {
            final ItemStack lllllllllllllIlIIlIllIIlllIIllll = this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIllII];
            this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIllII] = null;
            return lllllllllllllIlIIlIllIIlllIIllll;
        }
        final ItemStack lllllllllllllIlIIlIllIIlllIIlllI = this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIllII].splitStack(lllllllllllllIlIIlIllIIlllIlIIII);
        if (lIlllIIllIllIll(this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIllII].stackSize)) {
            this.minecartContainerItems[lllllllllllllIlIIlIllIIlllIIllII] = null;
        }
        return lllllllllllllIlIIlIllIIlllIIlllI;
    }
    
    @Override
    public void clear() {
        int lllllllllllllIlIIlIllIIlIlIlllll = EntityMinecartContainer.lIIIIlIlIIllIl[2];
        "".length();
        if ("  ".length() <= " ".length()) {
            return;
        }
        while (!lIlllIIllIlllll(lllllllllllllIlIIlIllIIlIlIlllll, this.minecartContainerItems.length)) {
            this.minecartContainerItems[lllllllllllllIlIIlIllIIlIlIlllll] = null;
            ++lllllllllllllIlIIlIllIIlIlIlllll;
        }
    }
    
    @Override
    public LockCode getLockCode() {
        return LockCode.EMPTY_CODE;
    }
    
    @Override
    public boolean interactFirst(final EntityPlayer lllllllllllllIlIIlIllIIlIlllIllI) {
        if (lIlllIIllIllIll(this.worldObj.isRemote ? 1 : 0)) {
            lllllllllllllIlIIlIllIIlIlllIllI.displayGUIChest(this);
        }
        return EntityMinecartContainer.lIIIIlIlIIllIl[1] != 0;
    }
    
    @Override
    public void closeInventory(final EntityPlayer lllllllllllllIlIIlIllIIllIlIllIl) {
    }
    
    @Override
    public void setDead() {
        if (lIlllIIllIllIII(this.dropContentsWhenDead ? 1 : 0)) {
            InventoryHelper.func_180176_a(this.worldObj, this, this);
        }
        super.setDead();
    }
    
    private static void lIlllIIllIlIIIl() {
        (lIIIIlIlIIlIIl = new String[EntityMinecartContainer.lIIIIlIlIIllIl[11]])[EntityMinecartContainer.lIIIIlIlIIllIl[2]] = lIlllIIllIIIllI("pRPYfrd8NtAsdPM94FFREw==", "DVNcu");
        EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[1]] = lIlllIIllIIlIll("JzcNGywtNgYdYykxDQouJSoX", "DXcoM");
        EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[4]] = lIlllIIllIIlIll("JwABBw==", "tlnsp");
        EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[5]] = lIlllIIllIIlIll("HQUfHAU=", "Tqzqv");
        EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[6]] = lIlllIIllIIllll("yemTA5ErQOk=", "VKPhI");
        EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[8]] = lIlllIIllIIllll("X/giMAUMX8Y=", "UdMQg");
    }
    
    private static void lIlllIIllIlIlll() {
        (lIIIIlIlIIllIl = new int[13])[0] = (197 + 70 - 93 + 56 ^ 35 + 104 - 24 + 79);
        EntityMinecartContainer.lIIIIlIlIIllIl[1] = " ".length();
        EntityMinecartContainer.lIIIIlIlIIllIl[2] = ((45 + 102 - 98 + 94 ^ 5 + 141 - 58 + 59) & (0x3E ^ 0x51 ^ (0x1 ^ 0x72) ^ -" ".length()));
        EntityMinecartContainer.lIIIIlIlIIllIl[3] = (0x66 ^ 0x26);
        EntityMinecartContainer.lIIIIlIlIIllIl[4] = "  ".length();
        EntityMinecartContainer.lIIIIlIlIIllIl[5] = "   ".length();
        EntityMinecartContainer.lIIIIlIlIIllIl[6] = (0x73 ^ 0x1D ^ (0x46 ^ 0x2C));
        EntityMinecartContainer.lIIIIlIlIIllIl[7] = (0x69 ^ 0x63);
        EntityMinecartContainer.lIIIIlIlIIllIl[8] = (0x6C ^ 0x69);
        EntityMinecartContainer.lIIIIlIlIIllIl[9] = 60 + 12 + 92 + 7 + (0x6 ^ 0xA) - (137 + 92 - 161 + 98) + (98 + 80 - 0 + 60);
        EntityMinecartContainer.lIIIIlIlIIllIl[10] = (0x77 ^ 0x78);
        EntityMinecartContainer.lIIIIlIlIIllIl[11] = (135 + 0 - 19 + 72 ^ 115 + 170 - 249 + 150);
        EntityMinecartContainer.lIIIIlIlIIllIl[12] = (0x83 ^ 0x8B);
    }
    
    @Override
    protected void readEntityFromNBT(final NBTTagCompound lllllllllllllIlIIlIllIIllIIIIllI) {
        super.readEntityFromNBT(lllllllllllllIlIIlIllIIllIIIIllI);
        final NBTTagList lllllllllllllIlIIlIllIIllIIIIlIl = lllllllllllllIlIIlIllIIllIIIIllI.getTagList(EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[6]], EntityMinecartContainer.lIIIIlIlIIllIl[7]);
        this.minecartContainerItems = new ItemStack[this.getSizeInventory()];
        int lllllllllllllIlIIlIllIIllIIIIlII = EntityMinecartContainer.lIIIIlIlIIllIl[2];
        "".length();
        if ((135 + 4 - 110 + 148 ^ 101 + 38 - 26 + 68) < 0) {
            return;
        }
        while (!lIlllIIllIlllll(lllllllllllllIlIIlIllIIllIIIIlII, lllllllllllllIlIIlIllIIllIIIIlIl.tagCount())) {
            final NBTTagCompound lllllllllllllIlIIlIllIIllIIIIIll = lllllllllllllIlIIlIllIIllIIIIlIl.getCompoundTagAt(lllllllllllllIlIIlIllIIllIIIIlII);
            final int lllllllllllllIlIIlIllIIllIIIIIlI = lllllllllllllIlIIlIllIIllIIIIIll.getByte(EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[8]]) & EntityMinecartContainer.lIIIIlIlIIllIl[9];
            if (lIlllIIlllIIIII(lllllllllllllIlIIlIllIIllIIIIIlI) && lIlllIIlllIIIIl(lllllllllllllIlIIlIllIIllIIIIIlI, this.minecartContainerItems.length)) {
                this.minecartContainerItems[lllllllllllllIlIIlIllIIllIIIIIlI] = ItemStack.loadItemStackFromNBT(lllllllllllllIlIIlIllIIllIIIIIll);
            }
            ++lllllllllllllIlIIlIllIIllIIIIlII;
        }
    }
    
    @Override
    public boolean isItemValidForSlot(final int lllllllllllllIlIIlIllIIllIlIlIll, final ItemStack lllllllllllllIlIIlIllIIllIlIlIlI) {
        return EntityMinecartContainer.lIIIIlIlIIllIl[1] != 0;
    }
    
    public EntityMinecartContainer(final World lllllllllllllIlIIlIllIIllllIlIll, final double lllllllllllllIlIIlIllIIllllIlIlI, final double lllllllllllllIlIIlIllIIllllIlIIl, final double lllllllllllllIlIIlIllIIllllIIIll) {
        super(lllllllllllllIlIIlIllIIllllIlIll, lllllllllllllIlIIlIllIIllllIlIlI, lllllllllllllIlIIlIllIIllllIlIIl, lllllllllllllIlIIlIllIIllllIIIll);
        this.minecartContainerItems = new ItemStack[EntityMinecartContainer.lIIIIlIlIIllIl[0]];
        this.dropContentsWhenDead = (EntityMinecartContainer.lIIIIlIlIIllIl[1] != 0);
    }
    
    private static String lIlllIIllIIllll(final String lllllllllllllIlIIlIllIIlIlIlIlIl, final String lllllllllllllIlIIlIllIIlIlIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIllIIlIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIIlIlIlIlII.getBytes(StandardCharsets.UTF_8)), EntityMinecartContainer.lIIIIlIlIIllIl[12]), "DES");
            final Cipher lllllllllllllIlIIlIllIIlIlIlIlll = Cipher.getInstance("DES");
            lllllllllllllIlIIlIllIIlIlIlIlll.init(EntityMinecartContainer.lIIIIlIlIIllIl[4], lllllllllllllIlIIlIllIIlIlIllIII);
            return new String(lllllllllllllIlIIlIllIIlIlIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIIlIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIllIIlIlIlIllI) {
            lllllllllllllIlIIlIllIIlIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void writeEntityToNBT(final NBTTagCompound lllllllllllllIlIIlIllIIllIIlIIIl) {
        super.writeEntityToNBT(lllllllllllllIlIIlIllIIllIIlIIIl);
        final NBTTagList lllllllllllllIlIIlIllIIllIIlIlIl = new NBTTagList();
        int lllllllllllllIlIIlIllIIllIIlIlII = EntityMinecartContainer.lIIIIlIlIIllIl[2];
        "".length();
        if ((0xB ^ 0x38 ^ (0x60 ^ 0x57)) <= -" ".length()) {
            return;
        }
        while (!lIlllIIllIlllll(lllllllllllllIlIIlIllIIllIIlIlII, this.minecartContainerItems.length)) {
            if (lIlllIIllIllIIl(this.minecartContainerItems[lllllllllllllIlIIlIllIIllIIlIlII])) {
                final NBTTagCompound lllllllllllllIlIIlIllIIllIIlIIll = new NBTTagCompound();
                lllllllllllllIlIIlIllIIllIIlIIll.setByte(EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[4]], (byte)lllllllllllllIlIIlIllIIllIIlIlII);
                this.minecartContainerItems[lllllllllllllIlIIlIllIIllIIlIlII].writeToNBT(lllllllllllllIlIIlIllIIllIIlIIll);
                "".length();
                lllllllllllllIlIIlIllIIllIIlIlIl.appendTag(lllllllllllllIlIIlIllIIllIIlIIll);
            }
            ++lllllllllllllIlIIlIllIIllIIlIlII;
        }
        lllllllllllllIlIIlIllIIllIIlIIIl.setTag(EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[5]], lllllllllllllIlIIlIllIIllIIlIlIl);
    }
    
    private static int lIlllIIllIlllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlllIIllIllIll(final int lllllllllllllIlIIlIllIIlIIIlIlIl) {
        return lllllllllllllIlIIlIllIIlIIIlIlIl == 0;
    }
    
    @Override
    public String getName() {
        String customNameTag;
        if (lIlllIIllIllIII(this.hasCustomName() ? 1 : 0)) {
            customNameTag = this.getCustomNameTag();
            "".length();
            if ("  ".length() >= (0x1B ^ 0x1F)) {
                return null;
            }
        }
        else {
            customNameTag = EntityMinecartContainer.lIIIIlIlIIlIIl[EntityMinecartContainer.lIIIIlIlIIllIl[1]];
        }
        return customNameTag;
    }
    
    @Override
    public void setField(final int lllllllllllllIlIIlIllIIlIllIlIIl, final int lllllllllllllIlIIlIllIIlIllIlIII) {
    }
    
    @Override
    public boolean isLocked() {
        return EntityMinecartContainer.lIIIIlIlIIllIl[2] != 0;
    }
    
    private static boolean lIlllIIllIllIII(final int lllllllllllllIlIIlIllIIlIIIlIlll) {
        return lllllllllllllIlIIlIllIIlIIIlIlll != 0;
    }
    
    @Override
    public int getFieldCount() {
        return EntityMinecartContainer.lIIIIlIlIIllIl[2];
    }
    
    private static boolean lIlllIIllIllllI(final int lllllllllllllIlIIlIllIIlIIIlIIIl) {
        return lllllllllllllIlIIlIllIIlIIIlIIIl <= 0;
    }
    
    private static String lIlllIIllIIIllI(final String lllllllllllllIlIIlIllIIlIIllIIII, final String lllllllllllllIlIIlIllIIlIIlIllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIllIIlIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIllIIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIllIIlIIllIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIllIIlIIllIIlI.init(EntityMinecartContainer.lIIIIlIlIIllIl[4], lllllllllllllIlIIlIllIIlIIllIIll);
            return new String(lllllllllllllIlIIlIllIIlIIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIllIIlIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIllIIlIIllIIIl) {
            lllllllllllllIlIIlIllIIlIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIIlllIIIII(final int lllllllllllllIlIIlIllIIlIIIlIIll) {
        return lllllllllllllIlIIlIllIIlIIIlIIll >= 0;
    }
    
    @Override
    public int getField(final int lllllllllllllIlIIlIllIIlIllIlIll) {
        return EntityMinecartContainer.lIIIIlIlIIllIl[2];
    }
    
    private static boolean lIlllIIlllIIIIl(final int lllllllllllllIlIIlIllIIlIIlIIlII, final int lllllllllllllIlIIlIllIIlIIlIIIll) {
        return lllllllllllllIlIIlIllIIlIIlIIlII < lllllllllllllIlIIlIllIIlIIlIIIll;
    }
    
    @Override
    public void openInventory(final EntityPlayer lllllllllllllIlIIlIllIIllIlIllll) {
    }
    
    @Override
    public void setLockCode(final LockCode lllllllllllllIlIIlIllIIlIllIIlII) {
    }
    
    private static boolean lIlllIIllIlllII(final int lllllllllllllIlIIlIllIIlIIIlllII, final int lllllllllllllIlIIlIllIIlIIIllIll) {
        return lllllllllllllIlIIlIllIIlIIIlllII > lllllllllllllIlIIlIllIIlIIIllIll;
    }
    
    private static boolean lIlllIIllIlllll(final int lllllllllllllIlIIlIllIIlIIlIlIII, final int lllllllllllllIlIIlIllIIlIIlIIlll) {
        return lllllllllllllIlIIlIllIIlIIlIlIII >= lllllllllllllIlIIlIllIIlIIlIIlll;
    }
    
    static {
        lIlllIIllIlIlll();
        lIlllIIllIlIIIl();
    }
}
