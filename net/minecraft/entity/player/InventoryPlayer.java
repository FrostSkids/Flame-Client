// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.entity.player;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.world.World;
import net.minecraft.nbt.NBTUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemArmor;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;

public class InventoryPlayer implements IInventory
{
    public /* synthetic */ EntityPlayer player;
    private static final /* synthetic */ String[] lIllIIIllIlIII;
    public /* synthetic */ ItemStack[] mainInventory;
    private /* synthetic */ ItemStack itemStack;
    private static final /* synthetic */ int[] lIllIIIllIlIIl;
    public /* synthetic */ boolean inventoryChanged;
    public /* synthetic */ int currentItem;
    public /* synthetic */ ItemStack[] armorInventory;
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer lllllllllllllIIIIIlIlIlIIlIIllIl) {
        int n;
        if (lllllIIIllIIIll(this.player.isDead ? 1 : 0)) {
            n = InventoryPlayer.lIllIIIllIlIIl[3];
            "".length();
            if ("   ".length() != "   ".length()) {
                return ((0x7B ^ 0x76 ^ (0x43 ^ 0xC)) & (0x44 ^ 0x48 ^ (0x10 ^ 0x5E) ^ -" ".length())) != 0x0;
            }
        }
        else if (lllllIIIllIlIIl(lllllIIIllIlllI(lllllllllllllIIIIIlIlIlIIlIIllIl.getDistanceSqToEntity(this.player), 64.0))) {
            n = InventoryPlayer.lIllIIIllIlIIl[5];
            "".length();
            if ((0x52 ^ 0x56) <= 0) {
                return ((0xB8 ^ 0xAC) & ~(0x25 ^ 0x31)) != 0x0;
            }
        }
        else {
            n = InventoryPlayer.lIllIIIllIlIIl[3];
        }
        return n != 0;
    }
    
    public ItemStack armorItemInSlot(final int lllllllllllllIIIIIlIlIlIIllllIll) {
        return this.armorInventory[lllllllllllllIIIIIlIlIlIIllllIll];
    }
    
    @Override
    public void closeInventory(final EntityPlayer lllllllllllllIIIIIlIlIlIIIllllIl) {
    }
    
    @Override
    public int getField(final int lllllllllllllIIIIIlIlIlIIIlIlllI) {
        return InventoryPlayer.lIllIIIllIlIIl[3];
    }
    
    @Override
    public ItemStack removeStackFromSlot(int lllllllllllllIIIIIlIlIlIllIlIIIl) {
        ItemStack[] lllllllllllllIIIIIlIlIlIllIlIlII = this.mainInventory;
        if (lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIllIlIIIl, this.mainInventory.length)) {
            lllllllllllllIIIIIlIlIlIllIlIlII = this.armorInventory;
            lllllllllllllIIIIIlIlIlIllIlIIIl -= this.mainInventory.length;
        }
        if (lllllIIIlIlllll(lllllllllllllIIIIIlIlIlIllIlIlII[lllllllllllllIIIIIlIlIlIllIlIIIl])) {
            final ItemStack lllllllllllllIIIIIlIlIlIllIlIIll = lllllllllllllIIIIIlIlIlIllIlIlII[lllllllllllllIIIIIlIlIlIllIlIIIl];
            lllllllllllllIIIIIlIlIlIllIlIlII[lllllllllllllIIIIIlIlIlIllIlIIIl] = null;
            return lllllllllllllIIIIIlIlIlIllIlIIll;
        }
        return null;
    }
    
    private static boolean lllllIIIlIlllIl(final int lllllllllllllIIIIIlIlIIlllllIIll, final int lllllllllllllIIIIIlIlIIlllllIIlI) {
        return lllllllllllllIIIIIlIlIIlllllIIll < lllllllllllllIIIIIlIlIIlllllIIlI;
    }
    
    public void damageArmor(float lllllllllllllIIIIIlIlIlIIllIIlIl) {
        lllllllllllllIIIIIlIlIlIIllIIlIl /= 4.0f;
        if (lllllIIIllIIlll(lllllIIIllIllIl(lllllllllllllIIIIIlIlIlIIllIIlIl, 1.0f))) {
            lllllllllllllIIIIIlIlIlIIllIIlIl = 1.0f;
        }
        int lllllllllllllIIIIIlIlIlIIllIIlll = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (" ".length() >= "   ".length()) {
            return;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIllIIlll, this.armorInventory.length)) {
            if (lllllIIIlIlllll(this.armorInventory[lllllllllllllIIIIIlIlIlIIllIIlll]) && lllllIIIllIIIll((this.armorInventory[lllllllllllllIIIIIlIlIlIIllIIlll].getItem() instanceof ItemArmor) ? 1 : 0)) {
                this.armorInventory[lllllllllllllIIIIIlIlIlIIllIIlll].damageItem((int)lllllllllllllIIIIIlIlIlIIllIIlIl, this.player);
                if (lllllIIIllIlIlI(this.armorInventory[lllllllllllllIIIIIlIlIlIIllIIlll].stackSize)) {
                    this.armorInventory[lllllllllllllIIIIIlIlIlIIllIIlll] = null;
                }
            }
            ++lllllllllllllIIIIIlIlIlIIllIIlll;
        }
    }
    
    public ItemStack getItemStack() {
        return this.itemStack;
    }
    
    private static void lllllIIIlIlllII() {
        (lIllIIIllIlIIl = new int[15])[0] = (0x31 ^ 0x15);
        InventoryPlayer.lIllIIIllIlIIl[1] = (0xB ^ 0x70 ^ 91 + 13 - 52 + 75);
        InventoryPlayer.lIllIIIllIlIIl[2] = (0xA ^ 0x1F ^ (0x3C ^ 0x20));
        InventoryPlayer.lIllIIIllIlIIl[3] = ((0x32 ^ 0x7B) & ~(0xFC ^ 0xB5));
        InventoryPlayer.lIllIIIllIlIIl[4] = -" ".length();
        InventoryPlayer.lIllIIIllIlIIl[5] = " ".length();
        InventoryPlayer.lIllIIIllIlIIl[6] = (0xFD ^ 0x9E ^ (0xCB ^ 0xAD));
        InventoryPlayer.lIllIIIllIlIIl[7] = "  ".length();
        InventoryPlayer.lIllIIIllIlIIl[8] = "   ".length();
        InventoryPlayer.lIllIIIllIlIIl[9] = (152 + 115 - 212 + 133 ^ 68 + 134 - 76 + 60);
        InventoryPlayer.lIllIIIllIlIIl[10] = (0xCD ^ 0x85 ^ (0xB0 ^ 0x9C));
        InventoryPlayer.lIllIIIllIlIIl[11] = (0x6C ^ 0x6B);
        InventoryPlayer.lIllIIIllIlIIl[12] = 23 + 242 - 90 + 80;
        InventoryPlayer.lIllIIIllIlIIl[13] = (0x56 ^ 0x39 ^ (0x4F ^ 0x28));
        InventoryPlayer.lIllIIIllIlIIl[14] = (0xFD ^ 0xBD);
    }
    
    public boolean canHeldItemHarvest(final Block lllllllllllllIIIIIlIlIlIlIIIIIll) {
        if (lllllIIIllIIIll(lllllllllllllIIIIIlIlIlIlIIIIIll.getMaterial().isToolNotRequired() ? 1 : 0)) {
            return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
        }
        final ItemStack lllllllllllllIIIIIlIlIlIlIIIIIlI = this.getStackInSlot(this.currentItem);
        int canHarvestBlock;
        if (lllllIIIlIlllll(lllllllllllllIIIIIlIlIlIlIIIIIlI)) {
            canHarvestBlock = (lllllllllllllIIIIIlIlIlIlIIIIIlI.canHarvestBlock(lllllllllllllIIIIIlIlIlIlIIIIIll) ? 1 : 0);
            "".length();
            if (-" ".length() > "   ".length()) {
                return ((57 + 25 + 124 + 48 ^ 177 + 161 - 292 + 149) & (0x7D ^ 0x66 ^ (0x7B ^ 0x5D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            canHarvestBlock = InventoryPlayer.lIllIIIllIlIIl[3];
        }
        return canHarvestBlock != 0;
    }
    
    @Override
    public void markDirty() {
        this.inventoryChanged = (InventoryPlayer.lIllIIIllIlIIl[5] != 0);
    }
    
    @Override
    public int getInventoryStackLimit() {
        return InventoryPlayer.lIllIIIllIlIIl[14];
    }
    
    private static boolean lllllIIIllIIIIl(final int lllllllllllllIIIIIlIlIIlllllIlll, final int lllllllllllllIIIIIlIlIIlllllIllI) {
        return lllllllllllllIIIIIlIlIIlllllIlll >= lllllllllllllIIIIIlIlIIlllllIllI;
    }
    
    private static boolean lllllIIIllIlIlI(final int lllllllllllllIIIIIlIlIIlllIllIlI) {
        return lllllllllllllIIIIIlIlIIlllIllIlI == 0;
    }
    
    private static boolean lllllIIIlIllllI(final int lllllllllllllIIIIIlIlIIlllIllIII) {
        return lllllllllllllIIIIIlIlIIlllIllIII >= 0;
    }
    
    private static boolean lllllIIIllIlIII(final int lllllllllllllIIIIIlIlIIllllIlIll, final int lllllllllllllIIIIIlIlIIllllIlIlI) {
        return lllllllllllllIIIIIlIlIIllllIlIll > lllllllllllllIIIIIlIlIIllllIlIlI;
    }
    
    private int getInventorySlotContainItemAndDamage(final Item lllllllllllllIIIIIlIlIllIllllIll, final int lllllllllllllIIIIIlIlIllIllllIlI) {
        int lllllllllllllIIIIIlIlIllIlllllIl = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if ("  ".length() == -" ".length()) {
            return (0xA5 ^ 0xC6) & ~(0xE8 ^ 0x8B);
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIllIlllllIl, this.mainInventory.length)) {
            if (lllllIIIlIlllll(this.mainInventory[lllllllllllllIIIIIlIlIllIlllllIl]) && lllllIIIllIIIII(this.mainInventory[lllllllllllllIIIIIlIlIllIlllllIl].getItem(), lllllllllllllIIIIIlIlIllIllllIll) && lllllIIIllIIIlI(this.mainInventory[lllllllllllllIIIIIlIlIllIlllllIl].getMetadata(), lllllllllllllIIIIIlIlIllIllllIlI)) {
                return lllllllllllllIIIIIlIlIllIlllllIl;
            }
            ++lllllllllllllIIIIIlIlIllIlllllIl;
        }
        return InventoryPlayer.lIllIIIllIlIIl[4];
    }
    
    @Override
    public String getName() {
        return InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[13]];
    }
    
    public NBTTagList writeToNBT(final NBTTagList lllllllllllllIIIIIlIlIlIlIlIlllI) {
        int lllllllllllllIIIIIlIlIlIlIllIIll = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (" ".length() < ((0x4F ^ 0x45) & ~(0x35 ^ 0x3F))) {
            return null;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIlIllIIll, this.mainInventory.length)) {
            if (lllllIIIlIlllll(this.mainInventory[lllllllllllllIIIIIlIlIlIlIllIIll])) {
                final NBTTagCompound lllllllllllllIIIIIlIlIlIlIllIIlI = new NBTTagCompound();
                lllllllllllllIIIIIlIlIlIlIllIIlI.setByte(InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[6]], (byte)lllllllllllllIIIIIlIlIlIlIllIIll);
                this.mainInventory[lllllllllllllIIIIIlIlIlIlIllIIll].writeToNBT(lllllllllllllIIIIIlIlIlIlIllIIlI);
                "".length();
                lllllllllllllIIIIIlIlIlIlIlIlllI.appendTag(lllllllllllllIIIIIlIlIlIlIllIIlI);
            }
            ++lllllllllllllIIIIIlIlIlIlIllIIll;
        }
        int lllllllllllllIIIIIlIlIlIlIllIIIl = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if ("  ".length() > (0x1 ^ 0x5)) {
            return null;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIlIllIIIl, this.armorInventory.length)) {
            if (lllllIIIlIlllll(this.armorInventory[lllllllllllllIIIIIlIlIlIlIllIIIl])) {
                final NBTTagCompound lllllllllllllIIIIIlIlIlIlIllIIII = new NBTTagCompound();
                lllllllllllllIIIIIlIlIlIlIllIIII.setByte(InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[9]], (byte)(lllllllllllllIIIIIlIlIlIlIllIIIl + InventoryPlayer.lIllIIIllIlIIl[10]));
                this.armorInventory[lllllllllllllIIIIIlIlIlIlIllIIIl].writeToNBT(lllllllllllllIIIIIlIlIlIlIllIIII);
                "".length();
                lllllllllllllIIIIIlIlIlIlIlIlllI.appendTag(lllllllllllllIIIIIlIlIlIlIllIIII);
            }
            ++lllllllllllllIIIIIlIlIlIlIllIIIl;
        }
        return lllllllllllllIIIIIlIlIlIlIlIlllI;
    }
    
    private static boolean lllllIIIllIlIIl(final int lllllllllllllIIIIIlIlIIlllIlIlII) {
        return lllllllllllllIIIIIlIlIIlllIlIlII <= 0;
    }
    
    @Override
    public int getSizeInventory() {
        return this.mainInventory.length + InventoryPlayer.lIllIIIllIlIIl[1];
    }
    
    @Override
    public int getFieldCount() {
        return InventoryPlayer.lIllIIIllIlIIl[3];
    }
    
    private static boolean lllllIIIllIIIII(final Object lllllllllllllIIIIIlIlIIllllIIIIl, final Object lllllllllllllIIIIIlIlIIllllIIIII) {
        return lllllllllllllIIIIIlIlIIllllIIIIl == lllllllllllllIIIIIlIlIIllllIIIII;
    }
    
    @Override
    public IChatComponent getDisplayName() {
        ChatComponentStyle chatComponentStyle;
        if (lllllIIIllIIIll(this.hasCustomName() ? 1 : 0)) {
            chatComponentStyle = new ChatComponentText(this.getName());
            "".length();
            if ((0x2C ^ 0x28) <= ((0xD1 ^ 0x8A) & ~(0x68 ^ 0x33))) {
                return null;
            }
        }
        else {
            chatComponentStyle = new ChatComponentTranslation(this.getName(), new Object[InventoryPlayer.lIllIIIllIlIIl[3]]);
        }
        return chatComponentStyle;
    }
    
    public ItemStack getCurrentItem() {
        ItemStack itemStack;
        if (lllllIIIlIlllIl(this.currentItem, InventoryPlayer.lIllIIIllIlIIl[2]) && lllllIIIlIllllI(this.currentItem)) {
            itemStack = this.mainInventory[this.currentItem];
            "".length();
            if ((0x56 ^ 0x52) <= "  ".length()) {
                return null;
            }
        }
        else {
            itemStack = null;
        }
        return itemStack;
    }
    
    @Override
    public void clear() {
        int lllllllllllllIIIIIlIlIlIIIlIIllI = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if ("   ".length() != "   ".length()) {
            return;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIIlIIllI, this.mainInventory.length)) {
            this.mainInventory[lllllllllllllIIIIIlIlIlIIIlIIllI] = null;
            ++lllllllllllllIIIIIlIlIlIIIlIIllI;
        }
        int lllllllllllllIIIIIlIlIlIIIlIIlIl = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if ("   ".length() <= ((0x8B ^ 0xB8) & ~(0x19 ^ 0x2A))) {
            return;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIIlIIlIl, this.armorInventory.length)) {
            this.armorInventory[lllllllllllllIIIIIlIlIlIIIlIIlIl] = null;
            ++lllllllllllllIIIIIlIlIlIIIlIIlIl;
        }
    }
    
    private static int lllllIIIllIllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lllllIIIllIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void copyInventory(final InventoryPlayer lllllllllllllIIIIIlIlIlIIIllIIIl) {
        int lllllllllllllIIIIIlIlIlIIIllIlII = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (((0x86 ^ 0x9B) & ~(0x51 ^ 0x4C)) > 0) {
            return;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIIllIlII, this.mainInventory.length)) {
            this.mainInventory[lllllllllllllIIIIIlIlIlIIIllIlII] = ItemStack.copyItemStack(lllllllllllllIIIIIlIlIlIIIllIIIl.mainInventory[lllllllllllllIIIIIlIlIlIIIllIlII]);
            ++lllllllllllllIIIIIlIlIlIIIllIlII;
        }
        int lllllllllllllIIIIIlIlIlIIIllIIll = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (null != null) {
            return;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIIllIIll, this.armorInventory.length)) {
            this.armorInventory[lllllllllllllIIIIIlIlIlIIIllIIll] = ItemStack.copyItemStack(lllllllllllllIIIIIlIlIlIIIllIIIl.armorInventory[lllllllllllllIIIIIlIlIlIIIllIIll]);
            ++lllllllllllllIIIIIlIlIlIIIllIIll;
        }
        this.currentItem = lllllllllllllIIIIIlIlIlIIIllIIIl.currentItem;
    }
    
    public boolean consumeInventoryItem(final Item lllllllllllllIIIIIlIlIllIIIIIllI) {
        final int lllllllllllllIIIIIlIlIllIIIIlIII = this.getInventorySlotContainItem(lllllllllllllIIIIIlIlIllIIIIIllI);
        if (lllllIIIllIIlll(lllllllllllllIIIIIlIlIllIIIIlIII)) {
            return InventoryPlayer.lIllIIIllIlIIl[3] != 0;
        }
        final ItemStack itemStack = this.mainInventory[lllllllllllllIIIIIlIlIllIIIIlIII];
        final int n = itemStack.stackSize - InventoryPlayer.lIllIIIllIlIIl[5];
        itemStack.stackSize = n;
        if (lllllIIIllIlIIl(n)) {
            this.mainInventory[lllllllllllllIIIIIlIlIllIIIIlIII] = null;
        }
        return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
    }
    
    private static boolean lllllIIIllIlIll(final Object lllllllllllllIIIIIlIlIIllllIIlll, final Object lllllllllllllIIIIIlIlIIllllIIllI) {
        return lllllllllllllIIIIIlIlIIllllIIlll != lllllllllllllIIIIIlIlIIllllIIllI;
    }
    
    public float getStrVsBlock(final Block lllllllllllllIIIIIlIlIlIlIlllIll) {
        float lllllllllllllIIIIIlIlIlIlIllllIl = 1.0f;
        if (lllllIIIlIlllll(this.mainInventory[this.currentItem])) {
            lllllllllllllIIIIIlIlIlIlIllllIl *= this.mainInventory[this.currentItem].getStrVsBlock(lllllllllllllIIIIIlIlIlIlIlllIll);
        }
        return lllllllllllllIIIIIlIlIlIlIllllIl;
    }
    
    @Override
    public boolean isItemValidForSlot(final int lllllllllllllIIIIIlIlIlIIIlllIll, final ItemStack lllllllllllllIIIIIlIlIlIIIlllIlI) {
        return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
    }
    
    private static boolean lllllIIIllIIllI(final int lllllllllllllIIIIIlIlIIlllIlIIlI) {
        return lllllllllllllIIIIIlIlIIlllIlIIlI > 0;
    }
    
    @Override
    public void openInventory(final EntityPlayer lllllllllllllIIIIIlIlIlIIIllllll) {
    }
    
    @Override
    public void setInventorySlotContents(int lllllllllllllIIIIIlIlIlIllIIIlIl, final ItemStack lllllllllllllIIIIIlIlIlIllIIlIII) {
        ItemStack[] lllllllllllllIIIIIlIlIlIllIIIlll = this.mainInventory;
        if (lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIllIIIlIl, lllllllllllllIIIIIlIlIlIllIIIlll.length)) {
            lllllllllllllIIIIIlIlIlIllIIIlIl -= lllllllllllllIIIIIlIlIlIllIIIlll.length;
            lllllllllllllIIIIIlIlIlIllIIIlll = this.armorInventory;
        }
        lllllllllllllIIIIIlIlIlIllIIIlll[lllllllllllllIIIIIlIlIlIllIIIlIl] = lllllllllllllIIIIIlIlIlIllIIlIII;
    }
    
    private static boolean lllllIIIllIIlll(final int lllllllllllllIIIIIlIlIIlllIlIllI) {
        return lllllllllllllIIIIIlIlIIlllIlIllI < 0;
    }
    
    private static boolean lllllIIIllIIIll(final int lllllllllllllIIIIIlIlIIlllIlllII) {
        return lllllllllllllIIIIIlIlIIlllIlllII != 0;
    }
    
    private static boolean lllllIIIlIlllll(final Object lllllllllllllIIIIIlIlIIllllIIlII) {
        return lllllllllllllIIIIIlIlIIllllIIlII != null;
    }
    
    private static void lllllIIIlIllIll() {
        (lIllIIIllIlIII = new String[InventoryPlayer.lIllIIIllIlIIl[2]])[InventoryPlayer.lIllIIIllIlIIl[3]] = lllllIIIlIllIIl("uJ0mT6/Vzp8HtfOUTKAUoVn8+wzPww9WGoauJKsGvHc=", "URxOK");
        InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[5]] = lllllIIIlIllIIl("SWvuY38xGFxsC/4hUF8KNNLc56TI2Crr", "nfbOj");
        InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[7]] = lllllIIIlIllIlI("BT8NHU0FDw==", "LKhpm");
        InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[8]] = lllllIIIlIllIIl("+lQMli2ssF9llfWlyQNxHg==", "NQBNC");
        InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[1]] = lllllIIIlIllIlI("BCwmP2wjOS43", "MXCRL");
        InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[6]] = lllllIIIlIllIlI("NiY5Fg==", "eJVbK");
        InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[9]] = lllllIIIlIllIIl("rgHMDfol1tM=", "Aolfh");
        InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[11]] = lllllIIIlIllIlI("Iw8qEA==", "pcEdJ");
        InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[13]] = lllllIIIlIllIlI("Mj4hNy44PyoxYTg/OSYhJT49Og==", "QQOCO");
    }
    
    private static String lllllIIIlIllIlI(String lllllllllllllIIIIIlIlIlIIIIIIllI, final String lllllllllllllIIIIIlIlIlIIIIIIlIl) {
        lllllllllllllIIIIIlIlIlIIIIIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIlIIIIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlIlIlIIIIIlIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIlIlIlIIIIIlIII = lllllllllllllIIIIIlIlIlIIIIIIlIl.toCharArray();
        int lllllllllllllIIIIIlIlIlIIIIIIlll = InventoryPlayer.lIllIIIllIlIIl[3];
        final Exception lllllllllllllIIIIIlIlIlIIIIIIIIl = (Object)lllllllllllllIIIIIlIlIlIIIIIIllI.toCharArray();
        final long lllllllllllllIIIIIlIlIlIIIIIIIII = lllllllllllllIIIIIlIlIlIIIIIIIIl.length;
        Exception lllllllllllllIIIIIlIlIIlllllllll = (Exception)InventoryPlayer.lIllIIIllIlIIl[3];
        while (lllllIIIlIlllIl((int)lllllllllllllIIIIIlIlIIlllllllll, (int)lllllllllllllIIIIIlIlIlIIIIIIIII)) {
            final char lllllllllllllIIIIIlIlIlIIIIIllII = lllllllllllllIIIIIlIlIlIIIIIIIIl[lllllllllllllIIIIIlIlIIlllllllll];
            lllllllllllllIIIIIlIlIlIIIIIlIIl.append((char)(lllllllllllllIIIIIlIlIlIIIIIllII ^ lllllllllllllIIIIIlIlIlIIIIIlIII[lllllllllllllIIIIIlIlIlIIIIIIlll % lllllllllllllIIIIIlIlIlIIIIIlIII.length]));
            "".length();
            ++lllllllllllllIIIIIlIlIlIIIIIIlll;
            ++lllllllllllllIIIIIlIlIIlllllllll;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlIlIlIIIIIlIIl);
    }
    
    @Override
    public void setField(final int lllllllllllllIIIIIlIlIlIIIlIllII, final int lllllllllllllIIIIIlIlIlIIIlIlIll) {
    }
    
    public int getFirstEmptyStack() {
        int lllllllllllllIIIIIlIlIllIllIllII = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (-(149 + 88 - 101 + 46 ^ 137 + 142 - 212 + 111) > 0) {
            return (0xF9 ^ 0x85 ^ (0xD ^ 0x58)) & (80 + 34 + 9 + 7 ^ 130 + 134 - 136 + 43 ^ -" ".length());
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIllIllIllII, this.mainInventory.length)) {
            if (lllllIIIllIIlII(this.mainInventory[lllllllllllllIIIIIlIlIllIllIllII])) {
                return lllllllllllllIIIIIlIlIllIllIllII;
            }
            ++lllllllllllllIIIIIlIlIllIllIllII;
        }
        return InventoryPlayer.lIllIIIllIlIIl[4];
    }
    
    public void setCurrentItem(final Item lllllllllllllIIIIIlIlIllIlIlIIll, final int lllllllllllllIIIIIlIlIllIlIlIIlI, final boolean lllllllllllllIIIIIlIlIllIlIlllII, final boolean lllllllllllllIIIIIlIlIllIlIlIIII) {
        final ItemStack lllllllllllllIIIIIlIlIllIlIllIlI = this.getCurrentItem();
        int n;
        if (lllllIIIllIIIll(lllllllllllllIIIIIlIlIllIlIlllII ? 1 : 0)) {
            n = this.getInventorySlotContainItemAndDamage(lllllllllllllIIIIIlIlIllIlIlIIll, lllllllllllllIIIIIlIlIllIlIlIIlI);
            "".length();
            if (" ".length() <= ((80 + 111 - 106 + 99 ^ 43 + 74 - 68 + 88) & (0xB ^ 0x6F ^ (0x50 ^ 0x5) ^ -" ".length()))) {
                return;
            }
        }
        else {
            n = this.getInventorySlotContainItem(lllllllllllllIIIIIlIlIllIlIlIIll);
        }
        final int lllllllllllllIIIIIlIlIllIlIllIIl = n;
        if (lllllIIIlIllllI(lllllllllllllIIIIIlIlIllIlIllIIl) && lllllIIIlIlllIl(lllllllllllllIIIIIlIlIllIlIllIIl, InventoryPlayer.lIllIIIllIlIIl[2])) {
            this.currentItem = lllllllllllllIIIIIlIlIllIlIllIIl;
            "".length();
            if ("  ".length() > "   ".length()) {
                return;
            }
        }
        else if (lllllIIIllIIIll(lllllllllllllIIIIIlIlIllIlIlIIII ? 1 : 0) && lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIlIlIIll)) {
            final int lllllllllllllIIIIIlIlIllIlIllIII = this.getFirstEmptyStack();
            if (lllllIIIlIllllI(lllllllllllllIIIIIlIlIllIlIllIII) && lllllIIIlIlllIl(lllllllllllllIIIIIlIlIllIlIllIII, InventoryPlayer.lIllIIIllIlIIl[2])) {
                this.currentItem = lllllllllllllIIIIIlIlIllIlIllIII;
            }
            if (!lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIlIllIlI) || !lllllIIIllIIIll(lllllllllllllIIIIIlIlIllIlIllIlI.isItemEnchantable() ? 1 : 0) || lllllIIIllIIlIl(this.getInventorySlotContainItemAndDamage(lllllllllllllIIIIIlIlIllIlIllIlI.getItem(), lllllllllllllIIIIIlIlIllIlIllIlI.getItemDamage()), this.currentItem)) {
                final int lllllllllllllIIIIIlIlIllIlIlIlll = this.getInventorySlotContainItemAndDamage(lllllllllllllIIIIIlIlIllIlIlIIll, lllllllllllllIIIIIlIlIllIlIlIIlI);
                int lllllllllllllIIIIIlIlIllIlIlIlIl = 0;
                if (lllllIIIlIllllI(lllllllllllllIIIIIlIlIllIlIlIlll)) {
                    final int lllllllllllllIIIIIlIlIllIlIlIllI = this.mainInventory[lllllllllllllIIIIIlIlIllIlIlIlll].stackSize;
                    this.mainInventory[lllllllllllllIIIIIlIlIllIlIlIlll] = this.mainInventory[this.currentItem];
                    "".length();
                    if ((0x84 ^ 0x81) == 0x0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIIIlIlIllIlIlIlIl = InventoryPlayer.lIllIIIllIlIIl[5];
                }
                this.mainInventory[this.currentItem] = new ItemStack(lllllllllllllIIIIIlIlIllIlIlIIll, lllllllllllllIIIIIlIlIllIlIlIlIl, lllllllllllllIIIIIlIlIllIlIlIIlI);
            }
        }
    }
    
    public void dropAllItems() {
        int lllllllllllllIIIIIlIlIlIIllIIIII = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if ((138 + 120 - 141 + 48 ^ 116 + 120 - 163 + 88) == ((60 + 119 - 23 + 32 ^ 18 + 54 + 7 + 87) & (0xF3 ^ 0xC3 ^ (0x1F ^ 0x35) ^ -" ".length()))) {
            return;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIllIIIII, this.mainInventory.length)) {
            if (lllllIIIlIlllll(this.mainInventory[lllllllllllllIIIIIlIlIlIIllIIIII])) {
                this.player.dropItem(this.mainInventory[lllllllllllllIIIIIlIlIlIIllIIIII], (boolean)(InventoryPlayer.lIllIIIllIlIIl[5] != 0), (boolean)(InventoryPlayer.lIllIIIllIlIIl[3] != 0));
                "".length();
                this.mainInventory[lllllllllllllIIIIIlIlIlIIllIIIII] = null;
            }
            ++lllllllllllllIIIIIlIlIlIIllIIIII;
        }
        int lllllllllllllIIIIIlIlIlIIlIlllll = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIlIlllll, this.armorInventory.length)) {
            if (lllllIIIlIlllll(this.armorInventory[lllllllllllllIIIIIlIlIlIIlIlllll])) {
                this.player.dropItem(this.armorInventory[lllllllllllllIIIIIlIlIlIIlIlllll], (boolean)(InventoryPlayer.lIllIIIllIlIIl[5] != 0), (boolean)(InventoryPlayer.lIllIIIllIlIIl[3] != 0));
                "".length();
                this.armorInventory[lllllllllllllIIIIIlIlIlIIlIlllll] = null;
            }
            ++lllllllllllllIIIIIlIlIlIIlIlllll;
        }
    }
    
    public int getTotalArmorValue() {
        int lllllllllllllIIIIIlIlIlIIlllIIll = InventoryPlayer.lIllIIIllIlIIl[3];
        int lllllllllllllIIIIIlIlIlIIlllIIlI = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if ("   ".length() <= ((31 + 167 - 116 + 103 ^ 62 + 122 - 137 + 143) & (0xBB ^ 0x9B ^ (0x9F ^ 0xB8) ^ -" ".length()))) {
            return (0x70 ^ 0x66 ^ (0x1B ^ 0x2F)) & (53 + 153 - 86 + 49 ^ 132 + 38 - 40 + 9 ^ -" ".length());
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIlllIIlI, this.armorInventory.length)) {
            if (lllllIIIlIlllll(this.armorInventory[lllllllllllllIIIIIlIlIlIIlllIIlI]) && lllllIIIllIIIll((this.armorInventory[lllllllllllllIIIIIlIlIlIIlllIIlI].getItem() instanceof ItemArmor) ? 1 : 0)) {
                final int lllllllllllllIIIIIlIlIlIIlllIIIl = ((ItemArmor)this.armorInventory[lllllllllllllIIIIIlIlIlIIlllIIlI].getItem()).damageReduceAmount;
                lllllllllllllIIIIIlIlIlIIlllIIll += lllllllllllllIIIIIlIlIlIIlllIIIl;
            }
            ++lllllllllllllIIIIIlIlIlIIlllIIlI;
        }
        return lllllllllllllIIIIIlIlIlIIlllIIll;
    }
    
    public InventoryPlayer(final EntityPlayer lllllllllllllIIIIIlIlIlllIIlIIIl) {
        this.mainInventory = new ItemStack[InventoryPlayer.lIllIIIllIlIIl[0]];
        this.armorInventory = new ItemStack[InventoryPlayer.lIllIIIllIlIIl[1]];
        this.player = lllllllllllllIIIIIlIlIlllIIlIIIl;
    }
    
    public static int getHotbarSize() {
        return InventoryPlayer.lIllIIIllIlIIl[2];
    }
    
    public void setItemStack(final ItemStack lllllllllllllIIIIIlIlIlIIlIlIlII) {
        this.itemStack = lllllllllllllIIIIIlIlIlIIlIlIlII;
    }
    
    public void changeCurrentItem(int lllllllllllllIIIIIlIlIllIlIIIlIl) {
        if (lllllIIIllIIllI((int)lllllllllllllIIIIIlIlIllIlIIIlIl)) {
            lllllllllllllIIIIIlIlIllIlIIIlIl = InventoryPlayer.lIllIIIllIlIIl[5];
        }
        if (lllllIIIllIIlll((int)lllllllllllllIIIIIlIlIllIlIIIlIl)) {
            lllllllllllllIIIIIlIlIllIlIIIlIl = InventoryPlayer.lIllIIIllIlIIl[4];
        }
        this.currentItem -= (int)lllllllllllllIIIIIlIlIllIlIIIlIl;
        "".length();
        if (((0xA8 ^ 0xB6 ^ (0x1C ^ 0x3C)) & (0x62 ^ 0x20 ^ (0x61 ^ 0x1D) ^ -" ".length())) >= " ".length()) {
            return;
        }
        while (!lllllIIIlIllllI(this.currentItem)) {
            this.currentItem += InventoryPlayer.lIllIIIllIlIIl[2];
        }
        "".length();
        if (null != null) {
            return;
        }
        while (!lllllIIIlIlllIl(this.currentItem, InventoryPlayer.lIllIIIllIlIIl[2])) {
            this.currentItem -= InventoryPlayer.lIllIIIllIlIIl[2];
        }
    }
    
    private static boolean lllllIIIllIIlII(final Object lllllllllllllIIIIIlIlIIlllIllllI) {
        return lllllllllllllIIIIIlIlIIlllIllllI == null;
    }
    
    public void readFromNBT(final NBTTagList lllllllllllllIIIIIlIlIlIlIlIIlII) {
        this.mainInventory = new ItemStack[InventoryPlayer.lIllIIIllIlIIl[0]];
        this.armorInventory = new ItemStack[InventoryPlayer.lIllIIIllIlIIl[1]];
        int lllllllllllllIIIIIlIlIlIlIlIIIll = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (-" ".length() >= " ".length()) {
            return;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIlIlIIIll, lllllllllllllIIIIIlIlIlIlIlIIlII.tagCount())) {
            final NBTTagCompound lllllllllllllIIIIIlIlIlIlIlIIIlI = lllllllllllllIIIIIlIlIlIlIlIIlII.getCompoundTagAt(lllllllllllllIIIIIlIlIlIlIlIIIll);
            final int lllllllllllllIIIIIlIlIlIlIlIIIIl = lllllllllllllIIIIIlIlIlIlIlIIIlI.getByte(InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[11]]) & InventoryPlayer.lIllIIIllIlIIl[12];
            final ItemStack lllllllllllllIIIIIlIlIlIlIlIIIII = ItemStack.loadItemStackFromNBT(lllllllllllllIIIIIlIlIlIlIlIIIlI);
            if (lllllIIIlIlllll(lllllllllllllIIIIIlIlIlIlIlIIIII)) {
                if (lllllIIIlIllllI(lllllllllllllIIIIIlIlIlIlIlIIIIl) && lllllIIIlIlllIl(lllllllllllllIIIIIlIlIlIlIlIIIIl, this.mainInventory.length)) {
                    this.mainInventory[lllllllllllllIIIIIlIlIlIlIlIIIIl] = lllllllllllllIIIIIlIlIlIlIlIIIII;
                }
                if (lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIlIlIIIIl, InventoryPlayer.lIllIIIllIlIIl[10]) && lllllIIIlIlllIl(lllllllllllllIIIIIlIlIlIlIlIIIIl, this.armorInventory.length + InventoryPlayer.lIllIIIllIlIIl[10])) {
                    this.armorInventory[lllllllllllllIIIIIlIlIlIlIlIIIIl - InventoryPlayer.lIllIIIllIlIIl[10]] = lllllllllllllIIIIIlIlIlIlIlIIIII;
                }
            }
            ++lllllllllllllIIIIIlIlIlIlIlIIIll;
        }
    }
    
    private static boolean lllllIIIllIllII(final int lllllllllllllIIIIIlIlIIllllIllll, final int lllllllllllllIIIIIlIlIIllllIlllI) {
        return lllllllllllllIIIIIlIlIIllllIllll <= lllllllllllllIIIIIlIlIIllllIlllI;
    }
    
    private int storeItemStack(final ItemStack lllllllllllllIIIIIlIlIllIlllIIIl) {
        int lllllllllllllIIIIIlIlIllIlllIIll = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (null != null) {
            return (0x0 ^ 0x7D ^ (0x6 ^ 0x4D)) & (0x73 ^ 0x7B ^ (0x21 ^ 0x1F) ^ -" ".length());
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIllIlllIIll, this.mainInventory.length)) {
            if (lllllIIIlIlllll(this.mainInventory[lllllllllllllIIIIIlIlIllIlllIIll]) && lllllIIIllIIIII(this.mainInventory[lllllllllllllIIIIIlIlIllIlllIIll].getItem(), lllllllllllllIIIIIlIlIllIlllIIIl.getItem()) && lllllIIIllIIIll(this.mainInventory[lllllllllllllIIIIIlIlIllIlllIIll].isStackable() ? 1 : 0) && lllllIIIlIlllIl(this.mainInventory[lllllllllllllIIIIIlIlIllIlllIIll].stackSize, this.mainInventory[lllllllllllllIIIIIlIlIllIlllIIll].getMaxStackSize()) && lllllIIIlIlllIl(this.mainInventory[lllllllllllllIIIIIlIlIllIlllIIll].stackSize, this.getInventoryStackLimit()) && (!lllllIIIllIIIll(this.mainInventory[lllllllllllllIIIIIlIlIllIlllIIll].getHasSubtypes() ? 1 : 0) || lllllIIIllIIIlI(this.mainInventory[lllllllllllllIIIIIlIlIllIlllIIll].getMetadata(), lllllllllllllIIIIIlIlIllIlllIIIl.getMetadata())) && lllllIIIllIIIll(ItemStack.areItemStackTagsEqual(this.mainInventory[lllllllllllllIIIIIlIlIllIlllIIll], lllllllllllllIIIIIlIlIllIlllIIIl) ? 1 : 0)) {
                return lllllllllllllIIIIIlIlIllIlllIIll;
            }
            ++lllllllllllllIIIIIlIlIllIlllIIll;
        }
        return InventoryPlayer.lIllIIIllIlIIl[4];
    }
    
    public int clearMatchingItems(final Item lllllllllllllIIIIIlIlIllIIlIllIl, final int lllllllllllllIIIIIlIlIllIIlllIIl, final int lllllllllllllIIIIIlIlIllIIlllIII, final NBTTagCompound lllllllllllllIIIIIlIlIllIIllIlll) {
        int lllllllllllllIIIIIlIlIllIIllIllI = InventoryPlayer.lIllIIIllIlIIl[3];
        int lllllllllllllIIIIIlIlIllIIllIlIl = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (((0x55 ^ 0xE) & ~(0x65 ^ 0x3E)) > " ".length()) {
            return (0x31 ^ 0x13) & ~(0x90 ^ 0xB2);
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIllIIllIlIl, this.mainInventory.length)) {
            final ItemStack lllllllllllllIIIIIlIlIllIIllIlII = this.mainInventory[lllllllllllllIIIIIlIlIllIIllIlIl];
            if (lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIIllIlII) && (!lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIIlIllIl) || lllllIIIllIIIII(lllllllllllllIIIIIlIlIllIIllIlII.getItem(), lllllllllllllIIIIIlIlIllIIlIllIl)) && (!lllllIIIllIlIII(lllllllllllllIIIIIlIlIllIIlllIIl, InventoryPlayer.lIllIIIllIlIIl[4]) || lllllIIIllIIIlI(lllllllllllllIIIIIlIlIllIIllIlII.getMetadata(), lllllllllllllIIIIIlIlIllIIlllIIl)) && (!lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIIllIlll) || lllllIIIllIIIll(NBTUtil.func_181123_a(lllllllllllllIIIIIlIlIllIIllIlll, lllllllllllllIIIIIlIlIllIIllIlII.getTagCompound(), (boolean)(InventoryPlayer.lIllIIIllIlIIl[5] != 0)) ? 1 : 0))) {
                int n;
                if (lllllIIIllIlIIl(lllllllllllllIIIIIlIlIllIIlllIII)) {
                    n = lllllllllllllIIIIIlIlIllIIllIlII.stackSize;
                    "".length();
                    if ((" ".length() & (" ".length() ^ -" ".length())) > "  ".length()) {
                        return (0x40 ^ 0x4C ^ (0xE6 ^ 0xBA)) & (0x81 ^ 0xA9 ^ (0xCF ^ 0xB7) ^ -" ".length());
                    }
                }
                else {
                    n = Math.min(lllllllllllllIIIIIlIlIllIIlllIII - lllllllllllllIIIIIlIlIllIIllIllI, lllllllllllllIIIIIlIlIllIIllIlII.stackSize);
                }
                final int lllllllllllllIIIIIlIlIllIIllIIll = n;
                lllllllllllllIIIIIlIlIllIIllIllI += lllllllllllllIIIIIlIlIllIIllIIll;
                if (lllllIIIllIIIll(lllllllllllllIIIIIlIlIllIIlllIII)) {
                    final ItemStack itemStack = this.mainInventory[lllllllllllllIIIIIlIlIllIIllIlIl];
                    itemStack.stackSize -= lllllllllllllIIIIIlIlIllIIllIIll;
                    if (lllllIIIllIlIlI(this.mainInventory[lllllllllllllIIIIIlIlIllIIllIlIl].stackSize)) {
                        this.mainInventory[lllllllllllllIIIIIlIlIllIIllIlIl] = null;
                    }
                    if (lllllIIIllIIllI(lllllllllllllIIIIIlIlIllIIlllIII) && lllllIIIllIIIIl(lllllllllllllIIIIIlIlIllIIllIllI, lllllllllllllIIIIIlIlIllIIlllIII)) {
                        return lllllllllllllIIIIIlIlIllIIllIllI;
                    }
                }
            }
            ++lllllllllllllIIIIIlIlIllIIllIlIl;
        }
        int lllllllllllllIIIIIlIlIllIIllIIlI = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (((0x1C ^ 0x52) & ~(0x69 ^ 0x27)) == " ".length()) {
            return (0x2C ^ 0x7C) & ~(0xF ^ 0x5F);
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIllIIllIIlI, this.armorInventory.length)) {
            final ItemStack lllllllllllllIIIIIlIlIllIIllIIIl = this.armorInventory[lllllllllllllIIIIIlIlIllIIllIIlI];
            if (lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIIllIIIl) && (!lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIIlIllIl) || lllllIIIllIIIII(lllllllllllllIIIIIlIlIllIIllIIIl.getItem(), lllllllllllllIIIIIlIlIllIIlIllIl)) && (!lllllIIIllIlIII(lllllllllllllIIIIIlIlIllIIlllIIl, InventoryPlayer.lIllIIIllIlIIl[4]) || lllllIIIllIIIlI(lllllllllllllIIIIIlIlIllIIllIIIl.getMetadata(), lllllllllllllIIIIIlIlIllIIlllIIl)) && (!lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIIllIlll) || lllllIIIllIIIll(NBTUtil.func_181123_a(lllllllllllllIIIIIlIlIllIIllIlll, lllllllllllllIIIIIlIlIllIIllIIIl.getTagCompound(), (boolean)(InventoryPlayer.lIllIIIllIlIIl[3] != 0)) ? 1 : 0))) {
                int n2;
                if (lllllIIIllIlIIl(lllllllllllllIIIIIlIlIllIIlllIII)) {
                    n2 = lllllllllllllIIIIIlIlIllIIllIIIl.stackSize;
                    "".length();
                    if ("   ".length() < ((0x43 ^ 0x6C) & ~(0x69 ^ 0x46))) {
                        return (0x24 ^ 0xF) & ~(0x3D ^ 0x16);
                    }
                }
                else {
                    n2 = Math.min(lllllllllllllIIIIIlIlIllIIlllIII - lllllllllllllIIIIIlIlIllIIllIllI, lllllllllllllIIIIIlIlIllIIllIIIl.stackSize);
                }
                final int lllllllllllllIIIIIlIlIllIIllIIII = n2;
                lllllllllllllIIIIIlIlIllIIllIllI += lllllllllllllIIIIIlIlIllIIllIIII;
                if (lllllIIIllIIIll(lllllllllllllIIIIIlIlIllIIlllIII)) {
                    final ItemStack itemStack2 = this.armorInventory[lllllllllllllIIIIIlIlIllIIllIIlI];
                    itemStack2.stackSize -= lllllllllllllIIIIIlIlIllIIllIIII;
                    if (lllllIIIllIlIlI(this.armorInventory[lllllllllllllIIIIIlIlIllIIllIIlI].stackSize)) {
                        this.armorInventory[lllllllllllllIIIIIlIlIllIIllIIlI] = null;
                    }
                    if (lllllIIIllIIllI(lllllllllllllIIIIIlIlIllIIlllIII) && lllllIIIllIIIIl(lllllllllllllIIIIIlIlIllIIllIllI, lllllllllllllIIIIIlIlIllIIlllIII)) {
                        return lllllllllllllIIIIIlIlIllIIllIllI;
                    }
                }
            }
            ++lllllllllllllIIIIIlIlIllIIllIIlI;
        }
        if (lllllIIIlIlllll(this.itemStack)) {
            if (lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIIlIllIl) && lllllIIIllIlIll(this.itemStack.getItem(), lllllllllllllIIIIIlIlIllIIlIllIl)) {
                return lllllllllllllIIIIIlIlIllIIllIllI;
            }
            if (lllllIIIllIlIII(lllllllllllllIIIIIlIlIllIIlllIIl, InventoryPlayer.lIllIIIllIlIIl[4]) && lllllIIIllIIlIl(this.itemStack.getMetadata(), lllllllllllllIIIIIlIlIllIIlllIIl)) {
                return lllllllllllllIIIIIlIlIllIIllIllI;
            }
            if (lllllIIIlIlllll(lllllllllllllIIIIIlIlIllIIllIlll) && lllllIIIllIlIlI(NBTUtil.func_181123_a(lllllllllllllIIIIIlIlIllIIllIlll, this.itemStack.getTagCompound(), (boolean)(InventoryPlayer.lIllIIIllIlIIl[3] != 0)) ? 1 : 0)) {
                return lllllllllllllIIIIIlIlIllIIllIllI;
            }
            int n3;
            if (lllllIIIllIlIIl(lllllllllllllIIIIIlIlIllIIlllIII)) {
                n3 = this.itemStack.stackSize;
                "".length();
                if (-" ".length() >= 0) {
                    return (0xB3 ^ 0xAB ^ (0x2A ^ 0x61)) & (0x35 ^ 0x52 ^ (0xBD ^ 0x89) ^ -" ".length());
                }
            }
            else {
                n3 = Math.min(lllllllllllllIIIIIlIlIllIIlllIII - lllllllllllllIIIIIlIlIllIIllIllI, this.itemStack.stackSize);
            }
            final int lllllllllllllIIIIIlIlIllIIlIllll = n3;
            lllllllllllllIIIIIlIlIllIIllIllI += lllllllllllllIIIIIlIlIllIIlIllll;
            if (lllllIIIllIIIll(lllllllllllllIIIIIlIlIllIIlllIII)) {
                final ItemStack itemStack3 = this.itemStack;
                itemStack3.stackSize -= lllllllllllllIIIIIlIlIllIIlIllll;
                if (lllllIIIllIlIlI(this.itemStack.stackSize)) {
                    this.itemStack = null;
                }
                if (lllllIIIllIIllI(lllllllllllllIIIIIlIlIllIIlllIII) && lllllIIIllIIIIl(lllllllllllllIIIIIlIlIllIIllIllI, lllllllllllllIIIIIlIlIllIIlllIII)) {
                    return lllllllllllllIIIIIlIlIllIIllIllI;
                }
            }
        }
        return lllllllllllllIIIIIlIlIllIIllIllI;
    }
    
    @Override
    public ItemStack decrStackSize(int lllllllllllllIIIIIlIlIlIllIllllI, final int lllllllllllllIIIIIlIlIlIlllIIIll) {
        ItemStack[] lllllllllllllIIIIIlIlIlIlllIIIlI = this.mainInventory;
        if (lllllIIIllIIIIl((int)lllllllllllllIIIIIlIlIlIllIllllI, this.mainInventory.length)) {
            lllllllllllllIIIIIlIlIlIlllIIIlI = this.armorInventory;
            lllllllllllllIIIIIlIlIlIllIllllI -= this.mainInventory.length;
        }
        if (!lllllIIIlIlllll(lllllllllllllIIIIIlIlIlIlllIIIlI[lllllllllllllIIIIIlIlIlIllIllllI])) {
            return null;
        }
        if (lllllIIIllIllII(lllllllllllllIIIIIlIlIlIlllIIIlI[lllllllllllllIIIIIlIlIlIllIllllI].stackSize, lllllllllllllIIIIIlIlIlIlllIIIll)) {
            final ItemStack lllllllllllllIIIIIlIlIlIlllIIIIl = lllllllllllllIIIIIlIlIlIlllIIIlI[lllllllllllllIIIIIlIlIlIllIllllI];
            lllllllllllllIIIIIlIlIlIlllIIIlI[lllllllllllllIIIIIlIlIlIllIllllI] = null;
            return lllllllllllllIIIIIlIlIlIlllIIIIl;
        }
        final ItemStack lllllllllllllIIIIIlIlIlIlllIIIII = lllllllllllllIIIIIlIlIlIlllIIIlI[lllllllllllllIIIIIlIlIlIllIllllI].splitStack(lllllllllllllIIIIIlIlIlIlllIIIll);
        if (lllllIIIllIlIlI(lllllllllllllIIIIIlIlIlIlllIIIlI[lllllllllllllIIIIIlIlIlIllIllllI].stackSize)) {
            lllllllllllllIIIIIlIlIlIlllIIIlI[lllllllllllllIIIIIlIlIlIllIllllI] = null;
        }
        return lllllllllllllIIIIIlIlIlIlllIIIII;
    }
    
    private static boolean lllllIIIllIIIlI(final int lllllllllllllIIIIIlIlIIllllllIll, final int lllllllllllllIIIIIlIlIIllllllIlI) {
        return lllllllllllllIIIIIlIlIIllllllIll == lllllllllllllIIIIIlIlIIllllllIlI;
    }
    
    private int storePartialItemStack(final ItemStack lllllllllllllIIIIIlIlIllIIIllllI) {
        final Item lllllllllllllIIIIIlIlIllIIIlllIl = lllllllllllllIIIIIlIlIllIIIllllI.getItem();
        int lllllllllllllIIIIIlIlIllIIIlllII = lllllllllllllIIIIIlIlIllIIIllllI.stackSize;
        int lllllllllllllIIIIIlIlIllIIIllIll = this.storeItemStack(lllllllllllllIIIIIlIlIllIIIllllI);
        if (lllllIIIllIIlll(lllllllllllllIIIIIlIlIllIIIllIll)) {
            lllllllllllllIIIIIlIlIllIIIllIll = this.getFirstEmptyStack();
        }
        if (lllllIIIllIIlll(lllllllllllllIIIIIlIlIllIIIllIll)) {
            return lllllllllllllIIIIIlIlIllIIIlllII;
        }
        if (lllllIIIllIIlII(this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll])) {
            this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll] = new ItemStack(lllllllllllllIIIIIlIlIllIIIlllIl, InventoryPlayer.lIllIIIllIlIIl[3], lllllllllllllIIIIIlIlIllIIIllllI.getMetadata());
            if (lllllIIIllIIIll(lllllllllllllIIIIIlIlIllIIIllllI.hasTagCompound() ? 1 : 0)) {
                this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll].setTagCompound((NBTTagCompound)lllllllllllllIIIIIlIlIllIIIllllI.getTagCompound().copy());
            }
        }
        int lllllllllllllIIIIIlIlIllIIIllIlI = lllllllllllllIIIIIlIlIllIIIlllII;
        if (lllllIIIllIlIII(lllllllllllllIIIIIlIlIllIIIlllII, this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll].getMaxStackSize() - this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll].stackSize)) {
            lllllllllllllIIIIIlIlIllIIIllIlI = this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll].getMaxStackSize() - this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll].stackSize;
        }
        if (lllllIIIllIlIII(lllllllllllllIIIIIlIlIllIIIllIlI, this.getInventoryStackLimit() - this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll].stackSize)) {
            lllllllllllllIIIIIlIlIllIIIllIlI = this.getInventoryStackLimit() - this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll].stackSize;
        }
        if (lllllIIIllIlIlI(lllllllllllllIIIIIlIlIllIIIllIlI)) {
            return lllllllllllllIIIIIlIlIllIIIlllII;
        }
        lllllllllllllIIIIIlIlIllIIIlllII -= lllllllllllllIIIIIlIlIllIIIllIlI;
        final ItemStack itemStack = this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll];
        itemStack.stackSize += lllllllllllllIIIIIlIlIllIIIllIlI;
        this.mainInventory[lllllllllllllIIIIIlIlIllIIIllIll].animationsToGo = InventoryPlayer.lIllIIIllIlIIl[6];
        return lllllllllllllIIIIIlIlIllIIIlllII;
    }
    
    public void decrementAnimations() {
        int lllllllllllllIIIIIlIlIllIIIlIIII = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (" ".length() != " ".length()) {
            return;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIllIIIlIIII, this.mainInventory.length)) {
            if (lllllIIIlIlllll(this.mainInventory[lllllllllllllIIIIIlIlIllIIIlIIII])) {
                final ItemStack itemStack = this.mainInventory[lllllllllllllIIIIIlIlIllIIIlIIII];
                final World worldObj = this.player.worldObj;
                final EntityPlayer player = this.player;
                final int lllllllllllllIIlllIlIlllllIIIlll = lllllllllllllIIIIIlIlIllIIIlIIII;
                int lllllllllllllIIlllIlIlllllIIIllI;
                if (lllllIIIllIIIlI(this.currentItem, lllllllllllllIIIIIlIlIllIIIlIIII)) {
                    lllllllllllllIIlllIlIlllllIIIllI = InventoryPlayer.lIllIIIllIlIIl[5];
                    "".length();
                    if ("  ".length() < -" ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlllIlIlllllIIIllI = InventoryPlayer.lIllIIIllIlIIl[3];
                }
                itemStack.updateAnimation(worldObj, player, lllllllllllllIIlllIlIlllllIIIlll, (boolean)(lllllllllllllIIlllIlIlllllIIIllI != 0));
            }
            ++lllllllllllllIIIIIlIlIllIIIlIIII;
        }
    }
    
    private int getInventorySlotContainItem(final Item lllllllllllllIIIIIlIlIlllIIIIllI) {
        int lllllllllllllIIIIIlIlIlllIIIlIII = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (-(0x3D ^ 0x39) >= 0) {
            return (0x83 ^ 0x85) & ~(0xA0 ^ 0xA6);
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlllIIIlIII, this.mainInventory.length)) {
            if (lllllIIIlIlllll(this.mainInventory[lllllllllllllIIIIIlIlIlllIIIlIII]) && lllllIIIllIIIII(this.mainInventory[lllllllllllllIIIIIlIlIlllIIIlIII].getItem(), lllllllllllllIIIIIlIlIlllIIIIllI)) {
                return lllllllllllllIIIIIlIlIlllIIIlIII;
            }
            ++lllllllllllllIIIIIlIlIlllIIIlIII;
        }
        return InventoryPlayer.lIllIIIllIlIIl[4];
    }
    
    private static boolean lllllIIIllIIlIl(final int lllllllllllllIIIIIlIlIIlllIIllll, final int lllllllllllllIIIIIlIlIIlllIIlllI) {
        return lllllllllllllIIIIIlIlIIlllIIllll != lllllllllllllIIIIIlIlIIlllIIlllI;
    }
    
    @Override
    public boolean hasCustomName() {
        return InventoryPlayer.lIllIIIllIlIIl[3] != 0;
    }
    
    public boolean addItemStackToInventory(final ItemStack lllllllllllllIIIIIlIlIlIllllIlIl) {
        if (lllllIIIlIlllll(lllllllllllllIIIIIlIlIlIllllIlIl) && lllllIIIllIIIll(lllllllllllllIIIIIlIlIlIllllIlIl.stackSize) && lllllIIIlIlllll(lllllllllllllIIIIIlIlIlIllllIlIl.getItem())) {
            try {
                if (lllllIIIllIIIll(lllllllllllllIIIIIlIlIlIllllIlIl.isItemDamaged() ? 1 : 0)) {
                    final int lllllllllllllIIIIIlIlIlIllllIlII = this.getFirstEmptyStack();
                    if (lllllIIIlIllllI(lllllllllllllIIIIIlIlIlIllllIlII)) {
                        this.mainInventory[lllllllllllllIIIIIlIlIlIllllIlII] = ItemStack.copyItemStack(lllllllllllllIIIIIlIlIlIllllIlIl);
                        this.mainInventory[lllllllllllllIIIIIlIlIlIllllIlII].animationsToGo = InventoryPlayer.lIllIIIllIlIIl[6];
                        lllllllllllllIIIIIlIlIlIllllIlIl.stackSize = InventoryPlayer.lIllIIIllIlIIl[3];
                        return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
                    }
                    if (lllllIIIllIIIll(this.player.capabilities.isCreativeMode ? 1 : 0)) {
                        lllllllllllllIIIIIlIlIlIllllIlIl.stackSize = InventoryPlayer.lIllIIIllIlIIl[3];
                        return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
                    }
                    return InventoryPlayer.lIllIIIllIlIIl[3] != 0;
                }
                else {
                    int lllllllllllllIIIIIlIlIlIllllIIll;
                    do {
                        lllllllllllllIIIIIlIlIlIllllIIll = lllllllllllllIIIIIlIlIlIllllIlIl.stackSize;
                        lllllllllllllIIIIIlIlIlIllllIlIl.stackSize = this.storePartialItemStack(lllllllllllllIIIIIlIlIlIllllIlIl);
                    } while (lllllIIIllIIllI(lllllllllllllIIIIIlIlIlIllllIlIl.stackSize) && !lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIllllIlIl.stackSize, lllllllllllllIIIIIlIlIlIllllIIll));
                    if (lllllIIIllIIIlI(lllllllllllllIIIIIlIlIlIllllIlIl.stackSize, lllllllllllllIIIIIlIlIlIllllIIll) && lllllIIIllIIIll(this.player.capabilities.isCreativeMode ? 1 : 0)) {
                        lllllllllllllIIIIIlIlIlIllllIlIl.stackSize = InventoryPlayer.lIllIIIllIlIIl[3];
                        return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
                    }
                    if (lllllIIIlIlllIl(lllllllllllllIIIIIlIlIlIllllIlIl.stackSize, lllllllllllllIIIIIlIlIlIllllIIll)) {
                        return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
                    }
                    return InventoryPlayer.lIllIIIllIlIIl[3] != 0;
                }
            }
            catch (Throwable lllllllllllllIIIIIlIlIlIllllIIlI) {
                final CrashReport lllllllllllllIIIIIlIlIlIllllIIIl = CrashReport.makeCrashReport(lllllllllllllIIIIIlIlIlIllllIIlI, InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[3]]);
                final CrashReportCategory lllllllllllllIIIIIlIlIlIllllIIII = lllllllllllllIIIIIlIlIlIllllIIIl.makeCategory(InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[5]]);
                lllllllllllllIIIIIlIlIlIllllIIII.addCrashSection(InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[7]], Item.getIdFromItem(lllllllllllllIIIIIlIlIlIllllIlIl.getItem()));
                lllllllllllllIIIIIlIlIlIllllIIII.addCrashSection(InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[8]], lllllllllllllIIIIIlIlIlIllllIlIl.getMetadata());
                lllllllllllllIIIIIlIlIlIllllIIII.addCrashSectionCallable(InventoryPlayer.lIllIIIllIlIII[InventoryPlayer.lIllIIIllIlIIl[1]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return lllllllllllllIIIIIlIlIlIllllIlIl.getDisplayName();
                    }
                });
                throw new ReportedException(lllllllllllllIIIIIlIlIlIllllIIIl);
            }
        }
        return InventoryPlayer.lIllIIIllIlIIl[3] != 0;
    }
    
    @Override
    public ItemStack getStackInSlot(int lllllllllllllIIIIIlIlIlIlIIIllll) {
        ItemStack[] lllllllllllllIIIIIlIlIlIlIIlIIIl = this.mainInventory;
        if (lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIlIIIllll, lllllllllllllIIIIIlIlIlIlIIlIIIl.length)) {
            lllllllllllllIIIIIlIlIlIlIIIllll -= lllllllllllllIIIIIlIlIlIlIIlIIIl.length;
            lllllllllllllIIIIIlIlIlIlIIlIIIl = this.armorInventory;
        }
        return lllllllllllllIIIIIlIlIlIlIIlIIIl[lllllllllllllIIIIIlIlIlIlIIIllll];
    }
    
    public boolean hasItem(final Item lllllllllllllIIIIIlIlIlIllllllIl) {
        final int lllllllllllllIIIIIlIlIlIllllllll = this.getInventorySlotContainItem(lllllllllllllIIIIIlIlIlIllllllIl);
        if (lllllIIIlIllllI(lllllllllllllIIIIIlIlIlIllllllll)) {
            return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
        }
        return InventoryPlayer.lIllIIIllIlIIl[3] != 0;
    }
    
    static {
        lllllIIIlIlllII();
        lllllIIIlIllIll();
    }
    
    private static String lllllIIIlIllIIl(final String lllllllllllllIIIIIlIlIlIIIIllIll, final String lllllllllllllIIIIIlIlIlIIIIllIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIlIlIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIlIlIIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlIlIlIIIIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlIlIlIIIIlllIl.init(InventoryPlayer.lIllIIIllIlIIl[7], lllllllllllllIIIIIlIlIlIIIIllllI);
            return new String(lllllllllllllIIIIIlIlIlIIIIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIlIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIlIlIIIIlllII) {
            lllllllllllllIIIIIlIlIlIIIIlllII.printStackTrace();
            return null;
        }
    }
    
    public boolean hasItemStack(final ItemStack lllllllllllllIIIIIlIlIlIIlIIIllI) {
        int lllllllllllllIIIIIlIlIlIIlIIIlIl = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (null != null) {
            return ((0xB ^ 0x32 ^ (0x66 ^ 0x1F)) & (0xA2 ^ 0x93 ^ (0x6F ^ 0x1E) ^ -" ".length())) != 0x0;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIlIIIlIl, this.armorInventory.length)) {
            if (lllllIIIlIlllll(this.armorInventory[lllllllllllllIIIIIlIlIlIIlIIIlIl]) && lllllIIIllIIIll(this.armorInventory[lllllllllllllIIIIIlIlIlIIlIIIlIl].isItemEqual(lllllllllllllIIIIIlIlIlIIlIIIllI) ? 1 : 0)) {
                return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
            }
            ++lllllllllllllIIIIIlIlIlIIlIIIlIl;
        }
        int lllllllllllllIIIIIlIlIlIIlIIIlII = InventoryPlayer.lIllIIIllIlIIl[3];
        "".length();
        if (" ".length() == -" ".length()) {
            return ((0x23 ^ 0x61 ^ (0x76 ^ 0x6A)) & (0x0 ^ 0x4C ^ (0x48 ^ 0x5A) ^ -" ".length())) != 0x0;
        }
        while (!lllllIIIllIIIIl(lllllllllllllIIIIIlIlIlIIlIIIlII, this.mainInventory.length)) {
            if (lllllIIIlIlllll(this.mainInventory[lllllllllllllIIIIIlIlIlIIlIIIlII]) && lllllIIIllIIIll(this.mainInventory[lllllllllllllIIIIIlIlIlIIlIIIlII].isItemEqual(lllllllllllllIIIIIlIlIlIIlIIIllI) ? 1 : 0)) {
                return InventoryPlayer.lIllIIIllIlIIl[5] != 0;
            }
            ++lllllllllllllIIIIIlIlIlIIlIIIlII;
        }
        return InventoryPlayer.lIllIIIllIlIIl[3] != 0;
    }
}
