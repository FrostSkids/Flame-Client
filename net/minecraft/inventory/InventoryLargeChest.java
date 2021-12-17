// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ChatComponentStyle;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.LockCode;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.ILockableContainer;

public class InventoryLargeChest implements ILockableContainer
{
    private /* synthetic */ String name;
    private /* synthetic */ ILockableContainer upperChest;
    private static final /* synthetic */ int[] llIIIlllIIIIII;
    private /* synthetic */ ILockableContainer lowerChest;
    
    @Override
    public ItemStack getStackInSlot(final int llllllllllllIlllIlIIIllIlllIlllI) {
        ItemStack itemStack;
        if (lIIIlIlIlIlIllII(llllllllllllIlllIlIIIllIlllIlllI, this.upperChest.getSizeInventory())) {
            itemStack = this.lowerChest.getStackInSlot(llllllllllllIlllIlIIIllIlllIlllI - this.upperChest.getSizeInventory());
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            itemStack = this.upperChest.getStackInSlot(llllllllllllIlllIlIIIllIlllIlllI);
        }
        return itemStack;
    }
    
    @Override
    public int getInventoryStackLimit() {
        return this.upperChest.getInventoryStackLimit();
    }
    
    @Override
    public int getFieldCount() {
        return InventoryLargeChest.llIIIlllIIIIII[0];
    }
    
    @Override
    public void openInventory(final EntityPlayer llllllllllllIlllIlIIIllIllIIIllI) {
        this.upperChest.openInventory(llllllllllllIlllIlIIIllIllIIIllI);
        this.lowerChest.openInventory(llllllllllllIlllIlIIIllIllIIIllI);
    }
    
    @Override
    public LockCode getLockCode() {
        return this.upperChest.getLockCode();
    }
    
    public InventoryLargeChest(final String llllllllllllIlllIlIIIlllIIIIllII, ILockableContainer llllllllllllIlllIlIIIlllIIIIIlll, ILockableContainer llllllllllllIlllIlIIIlllIIIIIllI) {
        this.name = llllllllllllIlllIlIIIlllIIIIllII;
        if (lIIIlIlIlIlIlIII(llllllllllllIlllIlIIIlllIIIIIlll)) {
            llllllllllllIlllIlIIIlllIIIIIlll = llllllllllllIlllIlIIIlllIIIIIllI;
        }
        if (lIIIlIlIlIlIlIII(llllllllllllIlllIlIIIlllIIIIIllI)) {
            llllllllllllIlllIlIIIlllIIIIIllI = llllllllllllIlllIlIIIlllIIIIIlll;
        }
        this.upperChest = llllllllllllIlllIlIIIlllIIIIIlll;
        this.lowerChest = llllllllllllIlllIlIIIlllIIIIIllI;
        if (lIIIlIlIlIlIlIIl(llllllllllllIlllIlIIIlllIIIIIlll.isLocked() ? 1 : 0)) {
            llllllllllllIlllIlIIIlllIIIIIllI.setLockCode(llllllllllllIlllIlIIIlllIIIIIlll.getLockCode());
            "".length();
            if ("   ".length() <= "  ".length()) {
                throw null;
            }
        }
        else if (lIIIlIlIlIlIlIIl(llllllllllllIlllIlIIIlllIIIIIllI.isLocked() ? 1 : 0)) {
            llllllllllllIlllIlIIIlllIIIIIlll.setLockCode(llllllllllllIlllIlIIIlllIIIIIllI.getLockCode());
        }
    }
    
    private static boolean lIIIlIlIlIlIlIll(final int llllllllllllIlllIlIIIllIlIIIllII) {
        return llllllllllllIlllIlIIIllIlIIIllII == 0;
    }
    
    @Override
    public ItemStack removeStackFromSlot(final int llllllllllllIlllIlIIIllIllIlllll) {
        ItemStack itemStack;
        if (lIIIlIlIlIlIllII(llllllllllllIlllIlIIIllIllIlllll, this.upperChest.getSizeInventory())) {
            itemStack = this.lowerChest.removeStackFromSlot(llllllllllllIlllIlIIIllIllIlllll - this.upperChest.getSizeInventory());
            "".length();
            if ((0x86 ^ 0xB9 ^ (0x7D ^ 0x46)) <= "  ".length()) {
                return null;
            }
        }
        else {
            itemStack = this.upperChest.removeStackFromSlot(llllllllllllIlllIlIIIllIllIlllll);
        }
        return itemStack;
    }
    
    @Override
    public boolean isLocked() {
        if (lIIIlIlIlIlIlIll(this.upperChest.isLocked() ? 1 : 0) && lIIIlIlIlIlIlIll(this.lowerChest.isLocked() ? 1 : 0)) {
            return InventoryLargeChest.llIIIlllIIIIII[0] != 0;
        }
        return InventoryLargeChest.llIIIlllIIIIII[1] != 0;
    }
    
    private static boolean lIIIlIlIlIlIlIIl(final int llllllllllllIlllIlIIIllIlIIIlllI) {
        return llllllllllllIlllIlIIIllIlIIIlllI != 0;
    }
    
    @Override
    public String getGuiID() {
        return this.upperChest.getGuiID();
    }
    
    @Override
    public IChatComponent getDisplayName() {
        ChatComponentStyle chatComponentStyle;
        if (lIIIlIlIlIlIlIIl(this.hasCustomName() ? 1 : 0)) {
            chatComponentStyle = new ChatComponentText(this.getName());
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            chatComponentStyle = new ChatComponentTranslation(this.getName(), new Object[InventoryLargeChest.llIIIlllIIIIII[0]]);
        }
        return chatComponentStyle;
    }
    
    @Override
    public void setInventorySlotContents(final int llllllllllllIlllIlIIIllIllIlIlll, final ItemStack llllllllllllIlllIlIIIllIllIllIIl) {
        if (lIIIlIlIlIlIllII(llllllllllllIlllIlIIIllIllIlIlll, this.upperChest.getSizeInventory())) {
            this.lowerChest.setInventorySlotContents(llllllllllllIlllIlIIIllIllIlIlll - this.upperChest.getSizeInventory(), llllllllllllIlllIlIIIllIllIllIIl);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.upperChest.setInventorySlotContents(llllllllllllIlllIlIIIllIllIlIlll, llllllllllllIlllIlIIIllIllIllIIl);
        }
    }
    
    @Override
    public void setField(final int llllllllllllIlllIlIIIllIlIllIlll, final int llllllllllllIlllIlIIIllIlIllIllI) {
    }
    
    @Override
    public boolean hasCustomName() {
        if (lIIIlIlIlIlIlIll(this.upperChest.hasCustomName() ? 1 : 0) && lIIIlIlIlIlIlIll(this.lowerChest.hasCustomName() ? 1 : 0)) {
            return InventoryLargeChest.llIIIlllIIIIII[0] != 0;
        }
        return InventoryLargeChest.llIIIlllIIIIII[1] != 0;
    }
    
    private static boolean lIIIlIlIlIlIlIlI(final Object llllllllllllIlllIlIIIllIlIIlIIll, final Object llllllllllllIlllIlIIIllIlIIlIIlI) {
        return llllllllllllIlllIlIIIllIlIIlIIll != llllllllllllIlllIlIIIllIlIIlIIlI;
    }
    
    private static void lIIIlIlIlIlIIlll() {
        (llIIIlllIIIIII = new int[2])[0] = ((0xB8 ^ 0xBE ^ (0xE3 ^ 0xAB)) & (3 + 75 + 42 + 108 ^ 46 + 144 - 127 + 107 ^ -" ".length()) & (((0x28 ^ 0x63 ^ (0x7F ^ 0x18)) & (0xF1 ^ 0xBF ^ (0xFF ^ 0x9D) ^ -" ".length())) ^ -" ".length()));
        InventoryLargeChest.llIIIlllIIIIII[1] = " ".length();
    }
    
    private static boolean lIIIlIlIlIlIllII(final int llllllllllllIlllIlIIIllIlIIlIlll, final int llllllllllllIlllIlIIIllIlIIlIllI) {
        return llllllllllllIlllIlIIIllIlIIlIlll >= llllllllllllIlllIlIIIllIlIIlIllI;
    }
    
    @Override
    public void closeInventory(final EntityPlayer llllllllllllIlllIlIIIllIllIIIIII) {
        this.upperChest.closeInventory(llllllllllllIlllIlIIIllIllIIIIII);
        this.lowerChest.closeInventory(llllllllllllIlllIlIIIllIllIIIIII);
    }
    
    @Override
    public boolean isUseableByPlayer(final EntityPlayer llllllllllllIlllIlIIIllIllIIlIlI) {
        if (lIIIlIlIlIlIlIIl(this.upperChest.isUseableByPlayer(llllllllllllIlllIlIIIllIllIIlIlI) ? 1 : 0) && lIIIlIlIlIlIlIIl(this.lowerChest.isUseableByPlayer(llllllllllllIlllIlIIIllIllIIlIlI) ? 1 : 0)) {
            return InventoryLargeChest.llIIIlllIIIIII[1] != 0;
        }
        return InventoryLargeChest.llIIIlllIIIIII[0] != 0;
    }
    
    @Override
    public int getField(final int llllllllllllIlllIlIIIllIlIlllIIl) {
        return InventoryLargeChest.llIIIlllIIIIII[0];
    }
    
    @Override
    public String getName() {
        String s;
        if (lIIIlIlIlIlIlIIl(this.upperChest.hasCustomName() ? 1 : 0)) {
            s = this.upperChest.getName();
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        else if (lIIIlIlIlIlIlIIl(this.lowerChest.hasCustomName() ? 1 : 0)) {
            s = this.lowerChest.getName();
            "".length();
            if (-" ".length() > (20 + 129 - 72 + 112 ^ 99 + 34 + 9 + 43)) {
                return null;
            }
        }
        else {
            s = this.name;
        }
        return s;
    }
    
    @Override
    public boolean isItemValidForSlot(final int llllllllllllIlllIlIIIllIlIllllII, final ItemStack llllllllllllIlllIlIIIllIlIlllIll) {
        return InventoryLargeChest.llIIIlllIIIIII[1] != 0;
    }
    
    @Override
    public void markDirty() {
        this.upperChest.markDirty();
        this.lowerChest.markDirty();
    }
    
    @Override
    public void setLockCode(final LockCode llllllllllllIlllIlIIIllIlIlIllII) {
        this.upperChest.setLockCode(llllllllllllIlllIlIIIllIlIlIllII);
        this.lowerChest.setLockCode(llllllllllllIlllIlIIIllIlIlIllII);
    }
    
    static {
        lIIIlIlIlIlIIlll();
    }
    
    @Override
    public int getSizeInventory() {
        return this.upperChest.getSizeInventory() + this.lowerChest.getSizeInventory();
    }
    
    @Override
    public Container createContainer(final InventoryPlayer llllllllllllIlllIlIIIllIlIlIIIIl, final EntityPlayer llllllllllllIlllIlIIIllIlIIlllIl) {
        return new ContainerChest(llllllllllllIlllIlIIIllIlIlIIIIl, this, llllllllllllIlllIlIIIllIlIIlllIl);
    }
    
    @Override
    public void clear() {
        this.upperChest.clear();
        this.lowerChest.clear();
    }
    
    private static boolean lIIIlIlIlIlIlIII(final Object llllllllllllIlllIlIIIllIlIIlIIII) {
        return llllllllllllIlllIlIIIllIlIIlIIII == null;
    }
    
    public boolean isPartOfLargeChest(final IInventory llllllllllllIlllIlIIIllIllllllll) {
        if (lIIIlIlIlIlIlIlI(this.upperChest, llllllllllllIlllIlIIIllIllllllll) && lIIIlIlIlIlIlIlI(this.lowerChest, llllllllllllIlllIlIIIllIllllllll)) {
            return InventoryLargeChest.llIIIlllIIIIII[0] != 0;
        }
        return InventoryLargeChest.llIIIlllIIIIII[1] != 0;
    }
    
    @Override
    public ItemStack decrStackSize(final int llllllllllllIlllIlIIIllIlllIlIIl, final int llllllllllllIlllIlIIIllIlllIIlIl) {
        ItemStack itemStack;
        if (lIIIlIlIlIlIllII(llllllllllllIlllIlIIIllIlllIlIIl, this.upperChest.getSizeInventory())) {
            itemStack = this.lowerChest.decrStackSize(llllllllllllIlllIlIIIllIlllIlIIl - this.upperChest.getSizeInventory(), llllllllllllIlllIlIIIllIlllIIlIl);
            "".length();
            if (((0x72 ^ 0xE ^ (0xD3 ^ 0xA6)) & (138 + 126 - 139 + 64 ^ 91 + 76 - 106 + 119 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            itemStack = this.upperChest.decrStackSize(llllllllllllIlllIlIIIllIlllIlIIl, llllllllllllIlllIlIIIllIlllIIlIl);
        }
        return itemStack;
    }
}
