// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerHopper extends Container
{
    private static final /* synthetic */ int[] lIIIllIllIlIIl;
    private final /* synthetic */ IInventory hopperInventory;
    
    private static void llIIIlIlIIlIlIl() {
        (lIIIllIllIlIIl = new int[10])[0] = (0x1F ^ 0x2C);
        ContainerHopper.lIIIllIllIlIIl[1] = ((151 + 122 - 272 + 249 ^ 115 + 36 - 49 + 52) & (168 + 68 - 16 + 27 ^ 39 + 81 + 25 + 6 ^ -" ".length()));
        ContainerHopper.lIIIllIllIlIIl[2] = (0x30 ^ 0x1C);
        ContainerHopper.lIIIllIllIlIIl[3] = (0x26 ^ 0x34);
        ContainerHopper.lIIIllIllIlIIl[4] = (0x81 ^ 0x94 ^ " ".length());
        ContainerHopper.lIIIllIllIlIIl[5] = (0x4F ^ 0x5F ^ (0x3B ^ 0x22));
        ContainerHopper.lIIIllIllIlIIl[6] = (0xD4 ^ 0xC3 ^ (0x49 ^ 0x56));
        ContainerHopper.lIIIllIllIlIIl[7] = "   ".length();
        ContainerHopper.lIIIllIllIlIIl[8] = (146 + 67 - 88 + 61 ^ 94 + 2 - 43 + 75);
        ContainerHopper.lIIIllIllIlIIl[9] = " ".length();
    }
    
    static {
        llIIIlIlIIlIlIl();
    }
    
    private static boolean llIIIlIlIIllIII(final int lllllllllllllIIlllllllIIIIlIIlII) {
        return lllllllllllllIIlllllllIIIIlIIlII != 0;
    }
    
    private static boolean llIIIlIlIIllIlI(final int lllllllllllllIIlllllllIIIIlIIIlI) {
        return lllllllllllllIIlllllllIIIIlIIIlI == 0;
    }
    
    private static boolean llIIIlIlIIlIlll(final Object lllllllllllllIIlllllllIIIIlIIllI) {
        return lllllllllllllIIlllllllIIIIlIIllI != null;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer lllllllllllllIIlllllllIIIlIIIllI) {
        return this.hopperInventory.isUseableByPlayer(lllllllllllllIIlllllllIIIlIIIllI);
    }
    
    private static boolean llIIIlIlIIllIIl(final int lllllllllllllIIlllllllIIIIlIlIIl, final int lllllllllllllIIlllllllIIIIlIlIII) {
        return lllllllllllllIIlllllllIIIIlIlIIl < lllllllllllllIIlllllllIIIIlIlIII;
    }
    
    @Override
    public void onContainerClosed(final EntityPlayer lllllllllllllIIlllllllIIIIllIIlI) {
        super.onContainerClosed(lllllllllllllIIlllllllIIIIllIIlI);
        this.hopperInventory.closeInventory(lllllllllllllIIlllllllIIIIllIIlI);
    }
    
    public ContainerHopper(final InventoryPlayer lllllllllllllIIlllllllIIIlIllIlI, final IInventory lllllllllllllIIlllllllIIIlIllIIl, final EntityPlayer lllllllllllllIIlllllllIIIlIllIII) {
        this.hopperInventory = lllllllllllllIIlllllllIIIlIllIIl;
        lllllllllllllIIlllllllIIIlIllIIl.openInventory(lllllllllllllIIlllllllIIIlIllIII);
        final int lllllllllllllIIlllllllIIIlIlIlll = ContainerHopper.lIIIllIllIlIIl[0];
        int lllllllllllllIIlllllllIIIlIlIllI = ContainerHopper.lIIIllIllIlIIl[1];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!llIIIlIlIIlIllI(lllllllllllllIIlllllllIIIlIlIllI, lllllllllllllIIlllllllIIIlIllIIl.getSizeInventory())) {
            this.addSlotToContainer(new Slot(lllllllllllllIIlllllllIIIlIllIIl, lllllllllllllIIlllllllIIIlIlIllI, ContainerHopper.lIIIllIllIlIIl[2] + lllllllllllllIIlllllllIIIlIlIllI * ContainerHopper.lIIIllIllIlIIl[3], ContainerHopper.lIIIllIllIlIIl[4]));
            "".length();
            ++lllllllllllllIIlllllllIIIlIlIllI;
        }
        int lllllllllllllIIlllllllIIIlIlIlIl = ContainerHopper.lIIIllIllIlIIl[1];
        "".length();
        if ("  ".length() < "  ".length()) {
            throw null;
        }
        while (!llIIIlIlIIlIllI(lllllllllllllIIlllllllIIIlIlIlIl, ContainerHopper.lIIIllIllIlIIl[7])) {
            int lllllllllllllIIlllllllIIIlIlIlII = ContainerHopper.lIIIllIllIlIIl[1];
            "".length();
            if ("   ".length() <= 0) {
                throw null;
            }
            while (!llIIIlIlIIlIllI(lllllllllllllIIlllllllIIIlIlIlII, ContainerHopper.lIIIllIllIlIIl[5])) {
                this.addSlotToContainer(new Slot(lllllllllllllIIlllllllIIIlIllIlI, lllllllllllllIIlllllllIIIlIlIlII + lllllllllllllIIlllllllIIIlIlIlIl * ContainerHopper.lIIIllIllIlIIl[5] + ContainerHopper.lIIIllIllIlIIl[5], ContainerHopper.lIIIllIllIlIIl[6] + lllllllllllllIIlllllllIIIlIlIlII * ContainerHopper.lIIIllIllIlIIl[3], lllllllllllllIIlllllllIIIlIlIlIl * ContainerHopper.lIIIllIllIlIIl[3] + lllllllllllllIIlllllllIIIlIlIlll));
                "".length();
                ++lllllllllllllIIlllllllIIIlIlIlII;
            }
            ++lllllllllllllIIlllllllIIIlIlIlIl;
        }
        int lllllllllllllIIlllllllIIIlIlIIll = ContainerHopper.lIIIllIllIlIIl[1];
        "".length();
        if (" ".length() == 0) {
            throw null;
        }
        while (!llIIIlIlIIlIllI(lllllllllllllIIlllllllIIIlIlIIll, ContainerHopper.lIIIllIllIlIIl[5])) {
            this.addSlotToContainer(new Slot(lllllllllllllIIlllllllIIIlIllIlI, lllllllllllllIIlllllllIIIlIlIIll, ContainerHopper.lIIIllIllIlIIl[6] + lllllllllllllIIlllllllIIIlIlIIll * ContainerHopper.lIIIllIllIlIIl[3], ContainerHopper.lIIIllIllIlIIl[8] + lllllllllllllIIlllllllIIIlIlIlll));
            "".length();
            ++lllllllllllllIIlllllllIIIlIlIIll;
        }
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer lllllllllllllIIlllllllIIIIllllll, final int lllllllllllllIIlllllllIIIIlllIIl) {
        ItemStack lllllllllllllIIlllllllIIIIllllIl = null;
        final Slot lllllllllllllIIlllllllIIIIllllII = this.inventorySlots.get(lllllllllllllIIlllllllIIIIlllIIl);
        if (llIIIlIlIIlIlll(lllllllllllllIIlllllllIIIIllllII) && llIIIlIlIIllIII(lllllllllllllIIlllllllIIIIllllII.getHasStack() ? 1 : 0)) {
            final ItemStack lllllllllllllIIlllllllIIIIlllIll = lllllllllllllIIlllllllIIIIllllII.getStack();
            lllllllllllllIIlllllllIIIIllllIl = lllllllllllllIIlllllllIIIIlllIll.copy();
            if (llIIIlIlIIllIIl(lllllllllllllIIlllllllIIIIlllIIl, this.hopperInventory.getSizeInventory())) {
                if (llIIIlIlIIllIlI(this.mergeItemStack(lllllllllllllIIlllllllIIIIlllIll, this.hopperInventory.getSizeInventory(), this.inventorySlots.size(), (boolean)(ContainerHopper.lIIIllIllIlIIl[9] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIIIlIlIIllIlI(this.mergeItemStack(lllllllllllllIIlllllllIIIIlllIll, ContainerHopper.lIIIllIllIlIIl[1], this.hopperInventory.getSizeInventory(), (boolean)(ContainerHopper.lIIIllIllIlIIl[1] != 0)) ? 1 : 0)) {
                return null;
            }
            if (llIIIlIlIIllIlI(lllllllllllllIIlllllllIIIIlllIll.stackSize)) {
                lllllllllllllIIlllllllIIIIllllII.putStack(null);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return null;
                }
            }
            else {
                lllllllllllllIIlllllllIIIIllllII.onSlotChanged();
            }
        }
        return lllllllllllllIIlllllllIIIIllllIl;
    }
    
    private static boolean llIIIlIlIIlIllI(final int lllllllllllllIIlllllllIIIIlIllIl, final int lllllllllllllIIlllllllIIIIlIllII) {
        return lllllllllllllIIlllllllIIIIlIllIl >= lllllllllllllIIlllllllIIIIlIllII;
    }
}
