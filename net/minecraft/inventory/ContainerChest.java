// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerChest extends Container
{
    private static final /* synthetic */ int[] lIlIllllIIIIIl;
    private /* synthetic */ int numRows;
    private /* synthetic */ IInventory lowerChestInventory;
    
    private static boolean llllIlIIIlIllIl(final int lllllllllllllIIIIlIlIlIlIIIIIIll) {
        return lllllllllllllIIIIlIlIlIlIIIIIIll == 0;
    }
    
    public ContainerChest(final IInventory lllllllllllllIIIIlIlIlIlIlIIIlII, final IInventory lllllllllllllIIIIlIlIlIlIlIIIIlI, final EntityPlayer lllllllllllllIIIIlIlIlIlIlIIIIII) {
        this.lowerChestInventory = lllllllllllllIIIIlIlIlIlIlIIIIlI;
        this.numRows = lllllllllllllIIIIlIlIlIlIlIIIIlI.getSizeInventory() / ContainerChest.lIlIllllIIIIIl[0];
        lllllllllllllIIIIlIlIlIlIlIIIIlI.openInventory(lllllllllllllIIIIlIlIlIlIlIIIIII);
        final int lllllllllllllIIIIlIlIlIlIlIlIIII = (this.numRows - ContainerChest.lIlIllllIIIIIl[1]) * ContainerChest.lIlIllllIIIIIl[2];
        int lllllllllllllIIIIlIlIlIlIlIIlllI = ContainerChest.lIlIllllIIIIIl[3];
        "".length();
        if (" ".length() >= "  ".length()) {
            throw null;
        }
        while (!llllIlIIIlIlIIl(lllllllllllllIIIIlIlIlIlIlIIlllI, this.numRows)) {
            int lllllllllllllIIIIlIlIlIlIlIIllIl = ContainerChest.lIlIllllIIIIIl[3];
            "".length();
            if (null != null) {
                throw null;
            }
            while (!llllIlIIIlIlIIl(lllllllllllllIIIIlIlIlIlIlIIllIl, ContainerChest.lIlIllllIIIIIl[0])) {
                this.addSlotToContainer(new Slot(lllllllllllllIIIIlIlIlIlIlIIIIlI, lllllllllllllIIIIlIlIlIlIlIIllIl + lllllllllllllIIIIlIlIlIlIlIIlllI * ContainerChest.lIlIllllIIIIIl[0], ContainerChest.lIlIllllIIIIIl[4] + lllllllllllllIIIIlIlIlIlIlIIllIl * ContainerChest.lIlIllllIIIIIl[2], ContainerChest.lIlIllllIIIIIl[2] + lllllllllllllIIIIlIlIlIlIlIIlllI * ContainerChest.lIlIllllIIIIIl[2]));
                "".length();
                ++lllllllllllllIIIIlIlIlIlIlIIllIl;
            }
            ++lllllllllllllIIIIlIlIlIlIlIIlllI;
        }
        int lllllllllllllIIIIlIlIlIlIlIIlIlI = ContainerChest.lIlIllllIIIIIl[3];
        "".length();
        if (" ".length() <= 0) {
            throw null;
        }
        while (!llllIlIIIlIlIIl(lllllllllllllIIIIlIlIlIlIlIIlIlI, ContainerChest.lIlIllllIIIIIl[6])) {
            int lllllllllllllIIIIlIlIlIlIlIIlIIl = ContainerChest.lIlIllllIIIIIl[3];
            "".length();
            if (null != null) {
                throw null;
            }
            while (!llllIlIIIlIlIIl(lllllllllllllIIIIlIlIlIlIlIIlIIl, ContainerChest.lIlIllllIIIIIl[0])) {
                this.addSlotToContainer(new Slot(lllllllllllllIIIIlIlIlIlIlIIIlII, lllllllllllllIIIIlIlIlIlIlIIlIIl + lllllllllllllIIIIlIlIlIlIlIIlIlI * ContainerChest.lIlIllllIIIIIl[0] + ContainerChest.lIlIllllIIIIIl[0], ContainerChest.lIlIllllIIIIIl[4] + lllllllllllllIIIIlIlIlIlIlIIlIIl * ContainerChest.lIlIllllIIIIIl[2], ContainerChest.lIlIllllIIIIIl[5] + lllllllllllllIIIIlIlIlIlIlIIlIlI * ContainerChest.lIlIllllIIIIIl[2] + lllllllllllllIIIIlIlIlIlIlIlIIII));
                "".length();
                ++lllllllllllllIIIIlIlIlIlIlIIlIIl;
            }
            ++lllllllllllllIIIIlIlIlIlIlIIlIlI;
        }
        int lllllllllllllIIIIlIlIlIlIlIIlIII = ContainerChest.lIlIllllIIIIIl[3];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!llllIlIIIlIlIIl(lllllllllllllIIIIlIlIlIlIlIIlIII, ContainerChest.lIlIllllIIIIIl[0])) {
            this.addSlotToContainer(new Slot(lllllllllllllIIIIlIlIlIlIlIIIlII, lllllllllllllIIIIlIlIlIlIlIIlIII, ContainerChest.lIlIllllIIIIIl[4] + lllllllllllllIIIIlIlIlIlIlIIlIII * ContainerChest.lIlIllllIIIIIl[2], ContainerChest.lIlIllllIIIIIl[7] + lllllllllllllIIIIlIlIlIlIlIlIIII));
            "".length();
            ++lllllllllllllIIIIlIlIlIlIlIIlIII;
        }
    }
    
    public IInventory getLowerChestInventory() {
        return this.lowerChestInventory;
    }
    
    private static void llllIlIIIlIlIII() {
        (lIlIllllIIIIIl = new int[9])[0] = (0x8E ^ 0x87);
        ContainerChest.lIlIllllIIIIIl[1] = (0x3F ^ 0x3B);
        ContainerChest.lIlIllllIIIIIl[2] = (0xB9 ^ 0xAB);
        ContainerChest.lIlIllllIIIIIl[3] = ((0x99 ^ 0xBB ^ (0xD ^ 0x75)) & (29 + 124 - 57 + 57 ^ 154 + 185 - 335 + 191 ^ -" ".length()));
        ContainerChest.lIlIllllIIIIIl[4] = (0x24 ^ 0x2C);
        ContainerChest.lIlIllllIIIIIl[5] = (0x23 ^ 0x11 ^ (0xC8 ^ 0x9D));
        ContainerChest.lIlIllllIIIIIl[6] = "   ".length();
        ContainerChest.lIlIllllIIIIIl[7] = (0x1 ^ 0x5C) + (124 + 5 - 87 + 88) - (119 + 3 - 74 + 96) + (0x73 ^ 0x21);
        ContainerChest.lIlIllllIIIIIl[8] = " ".length();
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer lllllllllllllIIIIlIlIlIlIIlIIlII, final int lllllllllllllIIIIlIlIlIlIIlIIIlI) {
        ItemStack lllllllllllllIIIIlIlIlIlIIlIIIIl = null;
        final Slot lllllllllllllIIIIlIlIlIlIIlIIIII = this.inventorySlots.get(lllllllllllllIIIIlIlIlIlIIlIIIlI);
        if (llllIlIIIlIlIlI(lllllllllllllIIIIlIlIlIlIIlIIIII) && llllIlIIIlIlIll(lllllllllllllIIIIlIlIlIlIIlIIIII.getHasStack() ? 1 : 0)) {
            final ItemStack lllllllllllllIIIIlIlIlIlIIIlllll = lllllllllllllIIIIlIlIlIlIIlIIIII.getStack();
            lllllllllllllIIIIlIlIlIlIIlIIIIl = lllllllllllllIIIIlIlIlIlIIIlllll.copy();
            if (llllIlIIIlIllII(lllllllllllllIIIIlIlIlIlIIlIIIlI, this.numRows * ContainerChest.lIlIllllIIIIIl[0])) {
                if (llllIlIIIlIllIl(this.mergeItemStack(lllllllllllllIIIIlIlIlIlIIIlllll, this.numRows * ContainerChest.lIlIllllIIIIIl[0], this.inventorySlots.size(), (boolean)(ContainerChest.lIlIllllIIIIIl[8] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llllIlIIIlIllIl(this.mergeItemStack(lllllllllllllIIIIlIlIlIlIIIlllll, ContainerChest.lIlIllllIIIIIl[3], this.numRows * ContainerChest.lIlIllllIIIIIl[0], (boolean)(ContainerChest.lIlIllllIIIIIl[3] != 0)) ? 1 : 0)) {
                return null;
            }
            if (llllIlIIIlIllIl(lllllllllllllIIIIlIlIlIlIIIlllll.stackSize)) {
                lllllllllllllIIIIlIlIlIlIIlIIIII.putStack(null);
                "".length();
                if ("   ".length() > (0x35 ^ 0x6F ^ (0xB ^ 0x55))) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIIlIlIlIlIIlIIIII.onSlotChanged();
            }
        }
        return lllllllllllllIIIIlIlIlIlIIlIIIIl;
    }
    
    @Override
    public void onContainerClosed(final EntityPlayer lllllllllllllIIIIlIlIlIlIIIlIlII) {
        super.onContainerClosed(lllllllllllllIIIIlIlIlIlIIIlIlII);
        this.lowerChestInventory.closeInventory(lllllllllllllIIIIlIlIlIlIIIlIlII);
    }
    
    private static boolean llllIlIIIlIlIll(final int lllllllllllllIIIIlIlIlIlIIIIIlIl) {
        return lllllllllllllIIIIlIlIlIlIIIIIlIl != 0;
    }
    
    private static boolean llllIlIIIlIlIlI(final Object lllllllllllllIIIIlIlIlIlIIIIIlll) {
        return lllllllllllllIIIIlIlIlIlIIIIIlll != null;
    }
    
    private static boolean llllIlIIIlIlIIl(final int lllllllllllllIIIIlIlIlIlIIIIlllI, final int lllllllllllllIIIIlIlIlIlIIIIllIl) {
        return lllllllllllllIIIIlIlIlIlIIIIlllI >= lllllllllllllIIIIlIlIlIlIIIIllIl;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer lllllllllllllIIIIlIlIlIlIIllIllI) {
        return this.lowerChestInventory.isUseableByPlayer(lllllllllllllIIIIlIlIlIlIIllIllI);
    }
    
    private static boolean llllIlIIIlIllII(final int lllllllllllllIIIIlIlIlIlIIIIlIlI, final int lllllllllllllIIIIlIlIlIlIIIIlIIl) {
        return lllllllllllllIIIIlIlIlIlIIIIlIlI < lllllllllllllIIIIlIlIlIlIIIIlIIl;
    }
    
    static {
        llllIlIIIlIlIII();
    }
}
