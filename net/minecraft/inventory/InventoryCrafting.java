// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.entity.player.EntityPlayer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.item.ItemStack;

public class InventoryCrafting implements IInventory
{
    private static final /* synthetic */ int[] llIlllllIIIIIl;
    private final /* synthetic */ ItemStack[] stackList;
    private final /* synthetic */ int inventoryWidth;
    private final /* synthetic */ Container eventHandler;
    private static final /* synthetic */ String[] llIllllIllllll;
    private final /* synthetic */ int inventoryHeight;
    
    @Override
    public IChatComponent getDisplayName() {
        ChatComponentStyle chatComponentStyle;
        if (lIIllIllIIIIIIII(this.hasCustomName() ? 1 : 0)) {
            chatComponentStyle = new ChatComponentText(this.getName());
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        else {
            chatComponentStyle = new ChatComponentTranslation(this.getName(), new Object[InventoryCrafting.llIlllllIIIIIl[0]]);
        }
        return chatComponentStyle;
    }
    
    @Override
    public boolean hasCustomName() {
        return InventoryCrafting.llIlllllIIIIIl[0] != 0;
    }
    
    private static void lIIllIlIllllIIII() {
        (llIlllllIIIIIl = new int[3])[0] = ((29 + 28 + 71 + 16 ^ 3 + 12 - 6 + 130) & (0x0 ^ 0x61 ^ (0x8 ^ 0x72) ^ -" ".length()));
        InventoryCrafting.llIlllllIIIIIl[1] = (0x1B ^ 0x55 ^ (0x7F ^ 0x71));
        InventoryCrafting.llIlllllIIIIIl[2] = " ".length();
    }
    
    private static String lIIllIlIlllIlIIl(String llllllllllllIllIIIllIIlIIIIIlIIl, final String llllllllllllIllIIIllIIlIIIIIllIl) {
        llllllllllllIllIIIllIIlIIIIIlIIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIllIIlIIIIIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIllIIlIIIIIllII = new StringBuilder();
        final char[] llllllllllllIllIIIllIIlIIIIIlIll = llllllllllllIllIIIllIIlIIIIIllIl.toCharArray();
        int llllllllllllIllIIIllIIlIIIIIlIlI = InventoryCrafting.llIlllllIIIIIl[0];
        final long llllllllllllIllIIIllIIlIIIIIIlII = (Object)((String)llllllllllllIllIIIllIIlIIIIIlIIl).toCharArray();
        final String llllllllllllIllIIIllIIlIIIIIIIll = (String)llllllllllllIllIIIllIIlIIIIIIlII.length;
        double llllllllllllIllIIIllIIlIIIIIIIlI = InventoryCrafting.llIlllllIIIIIl[0];
        while (lIIllIlIlllllllI((int)llllllllllllIllIIIllIIlIIIIIIIlI, (int)llllllllllllIllIIIllIIlIIIIIIIll)) {
            final char llllllllllllIllIIIllIIlIIIIIllll = llllllllllllIllIIIllIIlIIIIIIlII[llllllllllllIllIIIllIIlIIIIIIIlI];
            llllllllllllIllIIIllIIlIIIIIllII.append((char)(llllllllllllIllIIIllIIlIIIIIllll ^ llllllllllllIllIIIllIIlIIIIIlIll[llllllllllllIllIIIllIIlIIIIIlIlI % llllllllllllIllIIIllIIlIIIIIlIll.length]));
            "".length();
            ++llllllllllllIllIIIllIIlIIIIIlIlI;
            ++llllllllllllIllIIIllIIlIIIIIIIlI;
            "".length();
            if ((0xC8 ^ 0xBE ^ (0x40 ^ 0x32)) == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIllIIlIIIIIllII);
    }
    
    public int getWidth() {
        return this.inventoryWidth;
    }
    
    public ItemStack getStackInRowAndColumn(final int llllllllllllIllIIIllIIlIIlIllIll, final int llllllllllllIllIIIllIIlIIlIllIlI) {
        ItemStack stackInSlot;
        if (lIIllIlIllllllIl(llllllllllllIllIIIllIIlIIlIllIll) && lIIllIlIlllllllI(llllllllllllIllIIIllIIlIIlIllIll, this.inventoryWidth) && lIIllIlIllllllIl(llllllllllllIllIIIllIIlIIlIllIlI) && lIIllIlIllllllll(llllllllllllIllIIIllIIlIIlIllIlI, this.inventoryHeight)) {
            stackInSlot = this.getStackInSlot(llllllllllllIllIIIllIIlIIlIllIll + llllllllllllIllIIIllIIlIIlIllIlI * this.inventoryWidth);
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        else {
            stackInSlot = null;
        }
        return stackInSlot;
    }
    
    public InventoryCrafting(final Container llllllllllllIllIIIllIIlIIllIllll, final int llllllllllllIllIIIllIIlIIllIlllI, final int llllllllllllIllIIIllIIlIIlllIIlI) {
        final int llllllllllllIllIIIllIIlIIlllIIIl = llllllllllllIllIIIllIIlIIllIlllI * llllllllllllIllIIIllIIlIIlllIIlI;
        this.stackList = new ItemStack[llllllllllllIllIIIllIIlIIlllIIIl];
        this.eventHandler = llllllllllllIllIIIllIIlIIllIllll;
        this.inventoryWidth = llllllllllllIllIIIllIIlIIllIlllI;
        this.inventoryHeight = llllllllllllIllIIIllIIlIIlllIIlI;
    }
    
    @Override
    public ItemStack decrStackSize(final int llllllllllllIllIIIllIIlIIlIIIIIl, final int llllllllllllIllIIIllIIlIIlIIIlIl) {
        if (!lIIllIllIIIIIIIl(this.stackList[llllllllllllIllIIIllIIlIIlIIIIIl])) {
            return null;
        }
        if (lIIllIlIllllllll(this.stackList[llllllllllllIllIIIllIIlIIlIIIIIl].stackSize, llllllllllllIllIIIllIIlIIlIIIlIl)) {
            final ItemStack llllllllllllIllIIIllIIlIIlIIIlII = this.stackList[llllllllllllIllIIIllIIlIIlIIIIIl];
            this.stackList[llllllllllllIllIIIllIIlIIlIIIIIl] = null;
            this.eventHandler.onCraftMatrixChanged(this);
            return llllllllllllIllIIIllIIlIIlIIIlII;
        }
        final ItemStack llllllllllllIllIIIllIIlIIlIIIIll = this.stackList[llllllllllllIllIIIllIIlIIlIIIIIl].splitStack(llllllllllllIllIIIllIIlIIlIIIlIl);
        if (lIIllIllIIIIIIlI(this.stackList[llllllllllllIllIIIllIIlIIlIIIIIl].stackSize)) {
            this.stackList[llllllllllllIllIIIllIIlIIlIIIIIl] = null;
        }
        this.eventHandler.onCraftMatrixChanged(this);
        return llllllllllllIllIIIllIIlIIlIIIIll;
    }
    
    @Override
    public void setField(final int llllllllllllIllIIIllIIlIIIlIIlll, final int llllllllllllIllIIIllIIlIIIlIIllI) {
    }
    
    @Override
    public void markDirty() {
    }
    
    private static boolean lIIllIllIIIIIIIl(final Object llllllllllllIllIIIllIIIlllllIIll) {
        return llllllllllllIllIIIllIIIlllllIIll != null;
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int llllllllllllIllIIIllIIlIIlIIllIl) {
        if (lIIllIllIIIIIIIl(this.stackList[llllllllllllIllIIIllIIlIIlIIllIl])) {
            final ItemStack llllllllllllIllIIIllIIlIIlIIllll = this.stackList[llllllllllllIllIIIllIIlIIlIIllIl];
            this.stackList[llllllllllllIllIIIllIIlIIlIIllIl] = null;
            return llllllllllllIllIIIllIIlIIlIIllll;
        }
        return null;
    }
    
    @Override
    public int getField(final int llllllllllllIllIIIllIIlIIIlIlIIl) {
        return InventoryCrafting.llIlllllIIIIIl[0];
    }
    
    @Override
    public void clear() {
        int llllllllllllIllIIIllIIlIIIlIIIIl = InventoryCrafting.llIlllllIIIIIl[0];
        "".length();
        if (((169 + 37 - 34 + 42 ^ 54 + 89 + 13 + 38) & (138 + 59 - 39 + 25 ^ 126 + 32 + 2 + 3 ^ -" ".length())) <= -" ".length()) {
            return;
        }
        while (!lIIllIlIllllllII(llllllllllllIllIIIllIIlIIIlIIIIl, this.stackList.length)) {
            this.stackList[llllllllllllIllIIIllIIlIIIlIIIIl] = null;
            ++llllllllllllIllIIIllIIlIIIlIIIIl;
        }
    }
    
    private static boolean lIIllIlIllllllll(final int llllllllllllIllIIIllIIIlllllIllI, final int llllllllllllIllIIIllIIIlllllIlIl) {
        return llllllllllllIllIIIllIIIlllllIllI <= llllllllllllIllIIIllIIIlllllIlIl;
    }
    
    @Override
    public void closeInventory(final EntityPlayer llllllllllllIllIIIllIIlIIIlIlllI) {
    }
    
    @Override
    public void setInventorySlotContents(final int llllllllllllIllIIIllIIlIIIllIlll, final ItemStack llllllllllllIllIIIllIIlIIIllIllI) {
        this.stackList[llllllllllllIllIIIllIIlIIIllIlll] = llllllllllllIllIIIllIIlIIIllIllI;
        this.eventHandler.onCraftMatrixChanged(this);
    }
    
    @Override
    public String getName() {
        return InventoryCrafting.llIllllIllllll[InventoryCrafting.llIlllllIIIIIl[0]];
    }
    
    private static boolean lIIllIlIlllllllI(final int llllllllllllIllIIIllIIIllllllIlI, final int llllllllllllIllIIIllIIIllllllIIl) {
        return llllllllllllIllIIIllIIIllllllIlI < llllllllllllIllIIIllIIIllllllIIl;
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer llllllllllllIllIIIllIIlIIIllIIlI) {
        return InventoryCrafting.llIlllllIIIIIl[2] != 0;
    }
    
    @Override
    public void openInventory(final EntityPlayer llllllllllllIllIIIllIIlIIIllIIII) {
    }
    
    private static boolean lIIllIllIIIIIIII(final int llllllllllllIllIIIllIIIlllllIIIl) {
        return llllllllllllIllIIIllIIIlllllIIIl != 0;
    }
    
    @Override
    public int getFieldCount() {
        return InventoryCrafting.llIlllllIIIIIl[0];
    }
    
    @Override
    public ItemStack getStackInSlot(final int llllllllllllIllIIIllIIlIIllIIlIl) {
        ItemStack itemStack;
        if (lIIllIlIllllllII(llllllllllllIllIIIllIIlIIllIIlIl, this.getSizeInventory())) {
            itemStack = null;
            "".length();
            if ((0x2B ^ 0x3D ^ (0xA2 ^ 0xB1)) == 0x0) {
                return null;
            }
        }
        else {
            itemStack = this.stackList[llllllllllllIllIIIllIIlIIllIIlIl];
        }
        return itemStack;
    }
    
    private static boolean lIIllIllIIIIIIlI(final int llllllllllllIllIIIllIIIllllIllll) {
        return llllllllllllIllIIIllIIIllllIllll == 0;
    }
    
    private static boolean lIIllIlIllllllII(final int llllllllllllIllIIIllIIIllllllllI, final int llllllllllllIllIIIllIIIlllllllIl) {
        return llllllllllllIllIIIllIIIllllllllI >= llllllllllllIllIIIllIIIlllllllIl;
    }
    
    @Override
    public boolean isItemValidForSlot(final int llllllllllllIllIIIllIIlIIIlIllII, final ItemStack llllllllllllIllIIIllIIlIIIlIlIll) {
        return InventoryCrafting.llIlllllIIIIIl[2] != 0;
    }
    
    static {
        lIIllIlIllllIIII();
        lIIllIlIlllIlIlI();
    }
    
    @Override
    public int getInventoryStackLimit() {
        return InventoryCrafting.llIlllllIIIIIl[1];
    }
    
    private static void lIIllIlIlllIlIlI() {
        (llIllllIllllll = new String[InventoryCrafting.llIlllllIIIIIl[2]])[InventoryCrafting.llIlllllIIIIIl[0]] = lIIllIlIlllIlIIl("NyQrISg9JSAnZzc5JDM9PSUi", "TKEUI");
    }
    
    private static boolean lIIllIlIllllllIl(final int llllllllllllIllIIIllIIIllllIllIl) {
        return llllllllllllIllIIIllIIIllllIllIl >= 0;
    }
    
    public int getHeight() {
        return this.inventoryHeight;
    }
    
    @Override
    public int getSizeInventory() {
        return this.stackList.length;
    }
}
