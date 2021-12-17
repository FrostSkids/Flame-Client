// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class InventoryCraftResult implements IInventory
{
    private static final /* synthetic */ String[] lIlIllIIllIlIl;
    private static final /* synthetic */ int[] lIlIllIIllIllI;
    private /* synthetic */ ItemStack[] stackResult;
    
    static {
        llllIIIlIIllIlI();
        llllIIIlIIllIIl();
    }
    
    private static boolean llllIIIlIIllIll(final int lllllllllllllIIIIllIlllIlIllIllI) {
        return lllllllllllllIIIIllIlllIlIllIllI != 0;
    }
    
    @Override
    public int getSizeInventory() {
        return InventoryCraftResult.lIlIllIIllIllI[0];
    }
    
    private static void llllIIIlIIllIIl() {
        (lIlIllIIllIlIl = new String[InventoryCraftResult.lIlIllIIllIllI[0]])[InventoryCraftResult.lIlIllIIllIllI[1]] = llllIIIlIIllIII("NzUENxoR", "ePwBv");
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer lllllllllllllIIIIllIlllIlllIllIl) {
        return InventoryCraftResult.lIlIllIIllIllI[0] != 0;
    }
    
    @Override
    public IChatComponent getDisplayName() {
        ChatComponentStyle chatComponentStyle;
        if (llllIIIlIIllIll(this.hasCustomName() ? 1 : 0)) {
            chatComponentStyle = new ChatComponentText(this.getName());
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            chatComponentStyle = new ChatComponentTranslation(this.getName(), new Object[InventoryCraftResult.lIlIllIIllIllI[1]]);
        }
        return chatComponentStyle;
    }
    
    @Override
    public void closeInventory(final EntityPlayer lllllllllllllIIIIllIlllIlllIlIIl) {
    }
    
    @Override
    public ItemStack decrStackSize(final int lllllllllllllIIIIllIllllIIIIIIll, final int lllllllllllllIIIIllIllllIIIIIIlI) {
        if (llllIIIlIIlllII(this.stackResult[InventoryCraftResult.lIlIllIIllIllI[1]])) {
            final ItemStack lllllllllllllIIIIllIllllIIIIIIIl = this.stackResult[InventoryCraftResult.lIlIllIIllIllI[1]];
            this.stackResult[InventoryCraftResult.lIlIllIIllIllI[1]] = null;
            return lllllllllllllIIIIllIllllIIIIIIIl;
        }
        return null;
    }
    
    @Override
    public int getInventoryStackLimit() {
        return InventoryCraftResult.lIlIllIIllIllI[2];
    }
    
    public InventoryCraftResult() {
        this.stackResult = new ItemStack[InventoryCraftResult.lIlIllIIllIllI[0]];
    }
    
    @Override
    public void markDirty() {
    }
    
    @Override
    public void clear() {
        int lllllllllllllIIIIllIlllIllIlllII = InventoryCraftResult.lIlIllIIllIllI[1];
        "".length();
        if (null != null) {
            return;
        }
        while (!llllIIIlIIlllIl(lllllllllllllIIIIllIlllIllIlllII, this.stackResult.length)) {
            this.stackResult[lllllllllllllIIIIllIlllIllIlllII] = null;
            ++lllllllllllllIIIIllIlllIllIlllII;
        }
    }
    
    @Override
    public String getName() {
        return InventoryCraftResult.lIlIllIIllIlIl[InventoryCraftResult.lIlIllIIllIllI[1]];
    }
    
    private static String llllIIIlIIllIII(String lllllllllllllIIIIllIlllIllIIlIlI, final String lllllllllllllIIIIllIlllIllIIlIIl) {
        lllllllllllllIIIIllIlllIllIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIllIlllIllIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIlllIllIIllIl = new StringBuilder();
        final char[] lllllllllllllIIIIllIlllIllIIllII = lllllllllllllIIIIllIlllIllIIlIIl.toCharArray();
        int lllllllllllllIIIIllIlllIllIIlIll = InventoryCraftResult.lIlIllIIllIllI[1];
        final boolean lllllllllllllIIIIllIlllIllIIIlIl = (Object)lllllllllllllIIIIllIlllIllIIlIlI.toCharArray();
        final boolean lllllllllllllIIIIllIlllIllIIIlII = lllllllllllllIIIIllIlllIllIIIlIl.length != 0;
        double lllllllllllllIIIIllIlllIllIIIIll = InventoryCraftResult.lIlIllIIllIllI[1];
        while (llllIIIlIIllllI((int)lllllllllllllIIIIllIlllIllIIIIll, lllllllllllllIIIIllIlllIllIIIlII ? 1 : 0)) {
            final char lllllllllllllIIIIllIlllIllIlIIII = lllllllllllllIIIIllIlllIllIIIlIl[lllllllllllllIIIIllIlllIllIIIIll];
            lllllllllllllIIIIllIlllIllIIllIl.append((char)(lllllllllllllIIIIllIlllIllIlIIII ^ lllllllllllllIIIIllIlllIllIIllII[lllllllllllllIIIIllIlllIllIIlIll % lllllllllllllIIIIllIlllIllIIllII.length]));
            "".length();
            ++lllllllllllllIIIIllIlllIllIIlIll;
            ++lllllllllllllIIIIllIlllIllIIIIll;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIlllIllIIllIl);
    }
    
    private static boolean llllIIIlIIlllIl(final int lllllllllllllIIIIllIlllIlIllllll, final int lllllllllllllIIIIllIlllIlIlllllI) {
        return lllllllllllllIIIIllIlllIlIllllll >= lllllllllllllIIIIllIlllIlIlllllI;
    }
    
    @Override
    public void setInventorySlotContents(final int lllllllllllllIIIIllIlllIllllIlII, final ItemStack lllllllllllllIIIIllIlllIllllIIll) {
        this.stackResult[InventoryCraftResult.lIlIllIIllIllI[1]] = lllllllllllllIIIIllIlllIllllIIll;
    }
    
    private static void llllIIIlIIllIlI() {
        (lIlIllIIllIllI = new int[3])[0] = " ".length();
        InventoryCraftResult.lIlIllIIllIllI[1] = ((0x80 ^ 0x93) & ~(0x25 ^ 0x36));
        InventoryCraftResult.lIlIllIIllIllI[2] = (0x75 ^ 0x35);
    }
    
    @Override
    public void openInventory(final EntityPlayer lllllllllllllIIIIllIlllIlllIlIll) {
    }
    
    @Override
    public ItemStack getStackInSlot(final int lllllllllllllIIIIllIllllIIIIllIl) {
        return this.stackResult[InventoryCraftResult.lIlIllIIllIllI[1]];
    }
    
    @Override
    public int getFieldCount() {
        return InventoryCraftResult.lIlIllIIllIllI[1];
    }
    
    @Override
    public int getField(final int lllllllllllllIIIIllIlllIlllIIlII) {
        return InventoryCraftResult.lIlIllIIllIllI[1];
    }
    
    private static boolean llllIIIlIIllllI(final int lllllllllllllIIIIllIlllIlIlllIll, final int lllllllllllllIIIIllIlllIlIlllIlI) {
        return lllllllllllllIIIIllIlllIlIlllIll < lllllllllllllIIIIllIlllIlIlllIlI;
    }
    
    @Override
    public boolean hasCustomName() {
        return InventoryCraftResult.lIlIllIIllIllI[1] != 0;
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int lllllllllllllIIIIllIlllIlllllIll) {
        if (llllIIIlIIlllII(this.stackResult[InventoryCraftResult.lIlIllIIllIllI[1]])) {
            final ItemStack lllllllllllllIIIIllIlllIlllllIlI = this.stackResult[InventoryCraftResult.lIlIllIIllIllI[1]];
            this.stackResult[InventoryCraftResult.lIlIllIIllIllI[1]] = null;
            return lllllllllllllIIIIllIlllIlllllIlI;
        }
        return null;
    }
    
    @Override
    public boolean isItemValidForSlot(final int lllllllllllllIIIIllIlllIlllIIlll, final ItemStack lllllllllllllIIIIllIlllIlllIIllI) {
        return InventoryCraftResult.lIlIllIIllIllI[0] != 0;
    }
    
    @Override
    public void setField(final int lllllllllllllIIIIllIlllIlllIIIlI, final int lllllllllllllIIIIllIlllIlllIIIIl) {
    }
    
    private static boolean llllIIIlIIlllII(final Object lllllllllllllIIIIllIlllIlIlllIII) {
        return lllllllllllllIIIIllIlllIlIlllIII != null;
    }
}
