// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.village.MerchantRecipeList;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.IMerchant;
import net.minecraft.village.MerchantRecipe;

public class InventoryMerchant implements IInventory
{
    private /* synthetic */ MerchantRecipe currentRecipe;
    private static final /* synthetic */ int[] lIIIIIIIIlIIlI;
    private final /* synthetic */ IMerchant theMerchant;
    private final /* synthetic */ EntityPlayer thePlayer;
    private /* synthetic */ int currentRecipeIndex;
    private /* synthetic */ ItemStack[] theInventory;
    private static final /* synthetic */ String[] lIIIIIIIIIlllI;
    
    @Override
    public void closeInventory(final EntityPlayer lllllllllllllIlIlIIlIIllIIIIIIII) {
    }
    
    private static boolean lIllIIlIlIlllll(final int lllllllllllllIlIlIIlIIlIlIlllIlI, final int lllllllllllllIlIlIIlIIlIlIlllIIl) {
        return lllllllllllllIlIlIIlIIlIlIlllIlI > lllllllllllllIlIlIIlIIlIlIlllIIl;
    }
    
    @Override
    public int getInventoryStackLimit() {
        return InventoryMerchant.lIIIIIIIIlIIlI[4];
    }
    
    private static boolean lIllIIlIlIllIll(final int lllllllllllllIlIlIIlIIlIlIlllllI, final int lllllllllllllIlIlIIlIIlIlIllllIl) {
        return lllllllllllllIlIlIIlIIlIlIlllllI <= lllllllllllllIlIlIIlIIlIlIllllIl;
    }
    
    private static String lIllIIlIlIlIIll(final String lllllllllllllIlIlIIlIIlIllIIllII, final String lllllllllllllIlIlIIlIIlIllIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIIlIllIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIIlIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIlIIlIllIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIlIIlIllIlIIII.init(InventoryMerchant.lIIIIIIIIlIIlI[1], lllllllllllllIlIlIIlIIlIllIlIIIl);
            return new String(lllllllllllllIlIlIIlIIlIllIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIIlIllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIIlIllIIllll) {
            lllllllllllllIlIlIIlIIlIllIIllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setField(final int lllllllllllllIlIlIIlIIlIllIllllI, final int lllllllllllllIlIlIIlIIlIllIlllIl) {
    }
    
    private static boolean lIllIIlIlIllIlI(final int lllllllllllllIlIlIIlIIlIllIIIllI, final int lllllllllllllIlIlIIlIIlIllIIIlIl) {
        return lllllllllllllIlIlIIlIIlIllIIIllI == lllllllllllllIlIlIIlIIlIllIIIlIl;
    }
    
    private static boolean lIllIIlIlIlllII(final int lllllllllllllIlIlIIlIIlIlIlIllll) {
        return lllllllllllllIlIlIIlIIlIlIlIllll != 0;
    }
    
    private static boolean lIllIIlIllIIIIl(final Object lllllllllllllIlIlIIlIIlIlIllIIIl) {
        return lllllllllllllIlIlIIlIIlIlIllIIIl == null;
    }
    
    public void resetRecipeAndSlots() {
        this.currentRecipe = null;
        ItemStack lllllllllllllIlIlIIlIIlIllllIIll = this.theInventory[InventoryMerchant.lIIIIIIIIlIIlI[3]];
        ItemStack lllllllllllllIlIlIIlIIlIllllIIlI = this.theInventory[InventoryMerchant.lIIIIIIIIlIIlI[2]];
        if (lIllIIlIllIIIIl(lllllllllllllIlIlIIlIIlIllllIIll)) {
            lllllllllllllIlIlIIlIIlIllllIIll = lllllllllllllIlIlIIlIIlIllllIIlI;
            lllllllllllllIlIlIIlIIlIllllIIlI = null;
        }
        if (lIllIIlIllIIIIl(lllllllllllllIlIlIIlIIlIllllIIll)) {
            this.setInventorySlotContents(InventoryMerchant.lIIIIIIIIlIIlI[1], null);
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
        }
        else {
            final MerchantRecipeList lllllllllllllIlIlIIlIIlIllllIIIl = this.theMerchant.getRecipes(this.thePlayer);
            if (lIllIIlIlIllIIl(lllllllllllllIlIlIIlIIlIllllIIIl)) {
                MerchantRecipe lllllllllllllIlIlIIlIIlIllllIIII = lllllllllllllIlIlIIlIIlIllllIIIl.canRecipeBeUsed(lllllllllllllIlIlIIlIIlIllllIIll, lllllllllllllIlIlIIlIIlIllllIIlI, this.currentRecipeIndex);
                if (lIllIIlIlIllIIl(lllllllllllllIlIlIIlIIlIllllIIII) && lIllIIlIlIlllIl(lllllllllllllIlIlIIlIIlIllllIIII.isRecipeDisabled() ? 1 : 0)) {
                    this.currentRecipe = lllllllllllllIlIlIIlIIlIllllIIII;
                    this.setInventorySlotContents(InventoryMerchant.lIIIIIIIIlIIlI[1], lllllllllllllIlIlIIlIIlIllllIIII.getItemToSell().copy());
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else if (lIllIIlIlIllIIl(lllllllllllllIlIlIIlIIlIllllIIlI)) {
                    lllllllllllllIlIlIIlIIlIllllIIII = lllllllllllllIlIlIIlIIlIllllIIIl.canRecipeBeUsed(lllllllllllllIlIlIIlIIlIllllIIlI, lllllllllllllIlIlIIlIIlIllllIIll, this.currentRecipeIndex);
                    if (lIllIIlIlIllIIl(lllllllllllllIlIlIIlIIlIllllIIII) && lIllIIlIlIlllIl(lllllllllllllIlIlIIlIIlIllllIIII.isRecipeDisabled() ? 1 : 0)) {
                        this.currentRecipe = lllllllllllllIlIlIIlIIlIllllIIII;
                        this.setInventorySlotContents(InventoryMerchant.lIIIIIIIIlIIlI[1], lllllllllllllIlIlIIlIIlIllllIIII.getItemToSell().copy());
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        this.setInventorySlotContents(InventoryMerchant.lIIIIIIIIlIIlI[1], null);
                        "".length();
                        if ((47 + 129 - 136 + 123 ^ 16 + 125 + 14 + 12) <= 0) {
                            return;
                        }
                    }
                }
                else {
                    this.setInventorySlotContents(InventoryMerchant.lIIIIIIIIlIIlI[1], null);
                }
            }
        }
        this.theMerchant.verifySellingItem(this.getStackInSlot(InventoryMerchant.lIIIIIIIIlIIlI[1]));
    }
    
    @Override
    public boolean hasCustomName() {
        return InventoryMerchant.lIIIIIIIIlIIlI[3] != 0;
    }
    
    @Override
    public String getName() {
        return InventoryMerchant.lIIIIIIIIIlllI[InventoryMerchant.lIIIIIIIIlIIlI[3]];
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int lllllllllllllIlIlIIlIIllIIIllIlI) {
        if (lIllIIlIlIllIIl(this.theInventory[lllllllllllllIlIlIIlIIllIIIllIlI])) {
            final ItemStack lllllllllllllIlIlIIlIIllIIIlllII = this.theInventory[lllllllllllllIlIlIIlIIllIIIllIlI];
            this.theInventory[lllllllllllllIlIlIIlIIllIIIllIlI] = null;
            return lllllllllllllIlIlIIlIIllIIIlllII;
        }
        return null;
    }
    
    private static void lIllIIlIlIlIlIl() {
        (lIIIIIIIIIlllI = new String[InventoryMerchant.lIIIIIIIIlIIlI[2]])[InventoryMerchant.lIIIIIIIIlIIlI[3]] = lIllIIlIlIlIIll("/RgAfRsNKL4xOTyQj1Kx0g==", "WqSZz");
    }
    
    @Override
    public int getSizeInventory() {
        return this.theInventory.length;
    }
    
    @Override
    public ItemStack getStackInSlot(final int lllllllllllllIlIlIIlIIllIIllIlII) {
        return this.theInventory[lllllllllllllIlIlIIlIIllIIllIlII];
    }
    
    @Override
    public void openInventory(final EntityPlayer lllllllllllllIlIlIIlIIllIIIIIIlI) {
    }
    
    @Override
    public void markDirty() {
        this.resetRecipeAndSlots();
    }
    
    private static boolean lIllIIlIllIIIII(final Object lllllllllllllIlIlIIlIIlIlIllIlII, final Object lllllllllllllIlIlIIlIIlIlIllIIll) {
        return lllllllllllllIlIlIIlIIlIlIllIlII == lllllllllllllIlIlIIlIIlIlIllIIll;
    }
    
    public MerchantRecipe getCurrentRecipe() {
        return this.currentRecipe;
    }
    
    static {
        lIllIIlIlIllIII();
        lIllIIlIlIlIlIl();
    }
    
    @Override
    public void setInventorySlotContents(final int lllllllllllllIlIlIIlIIllIIIlIlII, final ItemStack lllllllllllllIlIlIIlIIllIIIlIIll) {
        this.theInventory[lllllllllllllIlIlIIlIIllIIIlIlII] = lllllllllllllIlIlIIlIIllIIIlIIll;
        if (lIllIIlIlIllIIl(lllllllllllllIlIlIIlIIllIIIlIIll) && lIllIIlIlIlllll(lllllllllllllIlIlIIlIIllIIIlIIll.stackSize, this.getInventoryStackLimit())) {
            lllllllllllllIlIlIIlIIllIIIlIIll.stackSize = this.getInventoryStackLimit();
        }
        if (lIllIIlIlIlllII(this.inventoryResetNeededOnSlotChange(lllllllllllllIlIlIIlIIllIIIlIlII) ? 1 : 0)) {
            this.resetRecipeAndSlots();
        }
    }
    
    @Override
    public IChatComponent getDisplayName() {
        ChatComponentStyle chatComponentStyle;
        if (lIllIIlIlIlllII(this.hasCustomName() ? 1 : 0)) {
            chatComponentStyle = new ChatComponentText(this.getName());
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        else {
            chatComponentStyle = new ChatComponentTranslation(this.getName(), new Object[InventoryMerchant.lIIIIIIIIlIIlI[3]]);
        }
        return chatComponentStyle;
    }
    
    @Override
    public ItemStack decrStackSize(final int lllllllllllllIlIlIIlIIllIIlIlIII, final int lllllllllllllIlIlIIlIIllIIlIllIl) {
        if (!lIllIIlIlIllIIl(this.theInventory[lllllllllllllIlIlIIlIIllIIlIlIII])) {
            return null;
        }
        if (lIllIIlIlIllIlI(lllllllllllllIlIlIIlIIllIIlIlIII, InventoryMerchant.lIIIIIIIIlIIlI[1])) {
            final ItemStack lllllllllllllIlIlIIlIIllIIlIllII = this.theInventory[lllllllllllllIlIlIIlIIllIIlIlIII];
            this.theInventory[lllllllllllllIlIlIIlIIllIIlIlIII] = null;
            return lllllllllllllIlIlIIlIIllIIlIllII;
        }
        if (lIllIIlIlIllIll(this.theInventory[lllllllllllllIlIlIIlIIllIIlIlIII].stackSize, lllllllllllllIlIlIIlIIllIIlIllIl)) {
            final ItemStack lllllllllllllIlIlIIlIIllIIlIlIll = this.theInventory[lllllllllllllIlIlIIlIIllIIlIlIII];
            this.theInventory[lllllllllllllIlIlIIlIIllIIlIlIII] = null;
            if (lIllIIlIlIlllII(this.inventoryResetNeededOnSlotChange(lllllllllllllIlIlIIlIIllIIlIlIII) ? 1 : 0)) {
                this.resetRecipeAndSlots();
            }
            return lllllllllllllIlIlIIlIIllIIlIlIll;
        }
        final ItemStack lllllllllllllIlIlIIlIIllIIlIlIlI = this.theInventory[lllllllllllllIlIlIIlIIllIIlIlIII].splitStack(lllllllllllllIlIlIIlIIllIIlIllIl);
        if (lIllIIlIlIlllIl(this.theInventory[lllllllllllllIlIlIIlIIllIIlIlIII].stackSize)) {
            this.theInventory[lllllllllllllIlIlIIlIIllIIlIlIII] = null;
        }
        if (lIllIIlIlIlllII(this.inventoryResetNeededOnSlotChange(lllllllllllllIlIlIIlIIllIIlIlIII) ? 1 : 0)) {
            this.resetRecipeAndSlots();
        }
        return lllllllllllllIlIlIIlIIllIIlIlIlI;
    }
    
    private static boolean lIllIIlIllIIIlI(final int lllllllllllllIlIlIIlIIlIllIIIIlI, final int lllllllllllllIlIlIIlIIlIllIIIIIl) {
        return lllllllllllllIlIlIIlIIlIllIIIIlI >= lllllllllllllIlIlIIlIIlIllIIIIIl;
    }
    
    @Override
    public boolean isItemValidForSlot(final int lllllllllllllIlIlIIlIIlIlllllllI, final ItemStack lllllllllllllIlIlIIlIIlIllllllIl) {
        return InventoryMerchant.lIIIIIIIIlIIlI[2] != 0;
    }
    
    private static boolean lIllIIlIlIllIIl(final Object lllllllllllllIlIlIIlIIlIlIllIlll) {
        return lllllllllllllIlIlIIlIIlIlIllIlll != null;
    }
    
    public void setCurrentRecipeIndex(final int lllllllllllllIlIlIIlIIlIlllIIlII) {
        this.currentRecipeIndex = lllllllllllllIlIlIIlIIlIlllIIlII;
        this.resetRecipeAndSlots();
    }
    
    private static boolean lIllIIlIlIllllI(final int lllllllllllllIlIlIIlIIlIlIlIlIlI, final int lllllllllllllIlIlIIlIIlIlIlIlIIl) {
        return lllllllllllllIlIlIIlIIlIlIlIlIlI != lllllllllllllIlIlIIlIIlIlIlIlIIl;
    }
    
    public InventoryMerchant(final EntityPlayer lllllllllllllIlIlIIlIIllIIlllllI, final IMerchant lllllllllllllIlIlIIlIIllIIllllIl) {
        this.theInventory = new ItemStack[InventoryMerchant.lIIIIIIIIlIIlI[0]];
        this.thePlayer = lllllllllllllIlIlIIlIIllIIlllllI;
        this.theMerchant = lllllllllllllIlIlIIlIIllIIllllIl;
    }
    
    @Override
    public void clear() {
        int lllllllllllllIlIlIIlIIlIllIllIII = InventoryMerchant.lIIIIIIIIlIIlI[3];
        "".length();
        if ((0x6C ^ 0x69) <= 0) {
            return;
        }
        while (!lIllIIlIllIIIlI(lllllllllllllIlIlIIlIIlIllIllIII, this.theInventory.length)) {
            this.theInventory[lllllllllllllIlIlIIlIIlIllIllIII] = null;
            ++lllllllllllllIlIlIIlIIlIllIllIII;
        }
    }
    
    private static boolean lIllIIlIlIlllIl(final int lllllllllllllIlIlIIlIIlIlIlIllIl) {
        return lllllllllllllIlIlIIlIIlIlIlIllIl == 0;
    }
    
    @Override
    public int getField(final int lllllllllllllIlIlIIlIIlIlllIIIII) {
        return InventoryMerchant.lIIIIIIIIlIIlI[3];
    }
    
    @Override
    public int getFieldCount() {
        return InventoryMerchant.lIIIIIIIIlIIlI[3];
    }
    
    private static void lIllIIlIlIllIII() {
        (lIIIIIIIIlIIlI = new int[5])[0] = "   ".length();
        InventoryMerchant.lIIIIIIIIlIIlI[1] = "  ".length();
        InventoryMerchant.lIIIIIIIIlIIlI[2] = " ".length();
        InventoryMerchant.lIIIIIIIIlIIlI[3] = ((0x9C ^ 0xB6) & ~(0x92 ^ 0xB8));
        InventoryMerchant.lIIIIIIIIlIIlI[4] = (0x2F ^ 0x6F);
    }
    
    private boolean inventoryResetNeededOnSlotChange(final int lllllllllllllIlIlIIlIIllIIlIIIlI) {
        if (lIllIIlIlIlllII(lllllllllllllIlIlIIlIIllIIlIIIlI) && lIllIIlIlIllllI(lllllllllllllIlIlIIlIIllIIlIIIlI, InventoryMerchant.lIIIIIIIIlIIlI[2])) {
            return InventoryMerchant.lIIIIIIIIlIIlI[3] != 0;
        }
        return InventoryMerchant.lIIIIIIIIlIIlI[2] != 0;
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer lllllllllllllIlIlIIlIIllIIIIIllI) {
        if (lIllIIlIllIIIII(this.theMerchant.getCustomer(), lllllllllllllIlIlIIlIIllIIIIIllI)) {
            return InventoryMerchant.lIIIIIIIIlIIlI[2] != 0;
        }
        return InventoryMerchant.lIIIIIIIIlIIlI[3] != 0;
    }
}
