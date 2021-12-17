// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerDispenser extends Container
{
    private static final /* synthetic */ int[] lIllIlIIllIIII;
    private /* synthetic */ IInventory dispenserInventory;
    
    private static boolean llllllIIllIlIIl(final int lllllllllllllIIIIIIIIIllIIIllllI) {
        return lllllllllllllIIIIIIIIIllIIIllllI != 0;
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer lllllllllllllIIIIIIIIIllIIllIIlI, final int lllllllllllllIIIIIIIIIllIIllIIIl) {
        ItemStack lllllllllllllIIIIIIIIIllIIllIllI = null;
        final Slot lllllllllllllIIIIIIIIIllIIllIlIl = this.inventorySlots.get(lllllllllllllIIIIIIIIIllIIllIIIl);
        if (llllllIIllIlIII(lllllllllllllIIIIIIIIIllIIllIlIl) && llllllIIllIlIIl(lllllllllllllIIIIIIIIIllIIllIlIl.getHasStack() ? 1 : 0)) {
            final ItemStack lllllllllllllIIIIIIIIIllIIllIlII = lllllllllllllIIIIIIIIIllIIllIlIl.getStack();
            lllllllllllllIIIIIIIIIllIIllIllI = lllllllllllllIIIIIIIIIllIIllIlII.copy();
            if (llllllIIllIlIlI(lllllllllllllIIIIIIIIIllIIllIIIl, ContainerDispenser.lIllIlIIllIIII[5])) {
                if (llllllIIllIlIll(this.mergeItemStack(lllllllllllllIIIIIIIIIllIIllIlII, ContainerDispenser.lIllIlIIllIIII[5], ContainerDispenser.lIllIlIIllIIII[9], (boolean)(ContainerDispenser.lIllIlIIllIIII[10] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llllllIIllIlIll(this.mergeItemStack(lllllllllllllIIIIIIIIIllIIllIlII, ContainerDispenser.lIllIlIIllIIII[0], ContainerDispenser.lIllIlIIllIIII[5], (boolean)(ContainerDispenser.lIllIlIIllIIII[0] != 0)) ? 1 : 0)) {
                return null;
            }
            if (llllllIIllIlIll(lllllllllllllIIIIIIIIIllIIllIlII.stackSize)) {
                lllllllllllllIIIIIIIIIllIIllIlIl.putStack(null);
                "".length();
                if (((0x41 ^ 0x69 ^ (0xC2 ^ 0xB3)) & (108 + 89 - 41 + 50 ^ 61 + 35 + 51 + 4 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                lllllllllllllIIIIIIIIIllIIllIlIl.onSlotChanged();
            }
            if (llllllIIllIllII(lllllllllllllIIIIIIIIIllIIllIlII.stackSize, lllllllllllllIIIIIIIIIllIIllIllI.stackSize)) {
                return null;
            }
            lllllllllllllIIIIIIIIIllIIllIlIl.onPickupFromSlot(lllllllllllllIIIIIIIIIllIIllIIlI, lllllllllllllIIIIIIIIIllIIllIlII);
        }
        return lllllllllllllIIIIIIIIIllIIllIllI;
    }
    
    private static boolean llllllIIllIlIll(final int lllllllllllllIIIIIIIIIllIIIlllII) {
        return lllllllllllllIIIIIIIIIllIIIlllII == 0;
    }
    
    private static boolean llllllIIllIllII(final int lllllllllllllIIIIIIIIIllIIlIlIll, final int lllllllllllllIIIIIIIIIllIIlIlIlI) {
        return lllllllllllllIIIIIIIIIllIIlIlIll == lllllllllllllIIIIIIIIIllIIlIlIlI;
    }
    
    public ContainerDispenser(final IInventory lllllllllllllIIIIIIIIIllIlIlIIIl, final IInventory lllllllllllllIIIIIIIIIllIlIIlIII) {
        this.dispenserInventory = lllllllllllllIIIIIIIIIllIlIIlIII;
        int lllllllllllllIIIIIIIIIllIlIIllll = ContainerDispenser.lIllIlIIllIIII[0];
        "".length();
        if (" ".length() <= -" ".length()) {
            throw null;
        }
        while (!llllllIIllIIlll(lllllllllllllIIIIIIIIIllIlIIllll, ContainerDispenser.lIllIlIIllIIII[1])) {
            int lllllllllllllIIIIIIIIIllIlIIlllI = ContainerDispenser.lIllIlIIllIIII[0];
            "".length();
            if (-" ".length() >= 0) {
                throw null;
            }
            while (!llllllIIllIIlll(lllllllllllllIIIIIIIIIllIlIIlllI, ContainerDispenser.lIllIlIIllIIII[1])) {
                this.addSlotToContainer(new Slot(lllllllllllllIIIIIIIIIllIlIIlIII, lllllllllllllIIIIIIIIIllIlIIlllI + lllllllllllllIIIIIIIIIllIlIIllll * ContainerDispenser.lIllIlIIllIIII[1], ContainerDispenser.lIllIlIIllIIII[2] + lllllllllllllIIIIIIIIIllIlIIlllI * ContainerDispenser.lIllIlIIllIIII[3], ContainerDispenser.lIllIlIIllIIII[4] + lllllllllllllIIIIIIIIIllIlIIllll * ContainerDispenser.lIllIlIIllIIII[3]));
                "".length();
                ++lllllllllllllIIIIIIIIIllIlIIlllI;
            }
            ++lllllllllllllIIIIIIIIIllIlIIllll;
        }
        int lllllllllllllIIIIIIIIIllIlIIllIl = ContainerDispenser.lIllIlIIllIIII[0];
        "".length();
        if (((0xF3 ^ 0xC0 ^ (0x19 ^ 0x1F)) & (6 + 105 - 43 + 62 ^ 6 + 88 + 4 + 85 ^ -" ".length())) != 0x0) {
            throw null;
        }
        while (!llllllIIllIIlll(lllllllllllllIIIIIIIIIllIlIIllIl, ContainerDispenser.lIllIlIIllIIII[1])) {
            int lllllllllllllIIIIIIIIIllIlIIllII = ContainerDispenser.lIllIlIIllIIII[0];
            "".length();
            if (-" ".length() >= " ".length()) {
                throw null;
            }
            while (!llllllIIllIIlll(lllllllllllllIIIIIIIIIllIlIIllII, ContainerDispenser.lIllIlIIllIIII[5])) {
                this.addSlotToContainer(new Slot(lllllllllllllIIIIIIIIIllIlIlIIIl, lllllllllllllIIIIIIIIIllIlIIllII + lllllllllllllIIIIIIIIIllIlIIllIl * ContainerDispenser.lIllIlIIllIIII[5] + ContainerDispenser.lIllIlIIllIIII[5], ContainerDispenser.lIllIlIIllIIII[6] + lllllllllllllIIIIIIIIIllIlIIllII * ContainerDispenser.lIllIlIIllIIII[3], ContainerDispenser.lIllIlIIllIIII[7] + lllllllllllllIIIIIIIIIllIlIIllIl * ContainerDispenser.lIllIlIIllIIII[3]));
                "".length();
                ++lllllllllllllIIIIIIIIIllIlIIllII;
            }
            ++lllllllllllllIIIIIIIIIllIlIIllIl;
        }
        int lllllllllllllIIIIIIIIIllIlIIlIll = ContainerDispenser.lIllIlIIllIIII[0];
        "".length();
        if ("  ".length() >= "   ".length()) {
            throw null;
        }
        while (!llllllIIllIIlll(lllllllllllllIIIIIIIIIllIlIIlIll, ContainerDispenser.lIllIlIIllIIII[5])) {
            this.addSlotToContainer(new Slot(lllllllllllllIIIIIIIIIllIlIlIIIl, lllllllllllllIIIIIIIIIllIlIIlIll, ContainerDispenser.lIllIlIIllIIII[6] + lllllllllllllIIIIIIIIIllIlIIlIll * ContainerDispenser.lIllIlIIllIIII[3], ContainerDispenser.lIllIlIIllIIII[8]));
            "".length();
            ++lllllllllllllIIIIIIIIIllIlIIlIll;
        }
    }
    
    private static void llllllIIllIIllI() {
        (lIllIlIIllIIII = new int[11])[0] = ((0x89 ^ 0x8E) & ~(0x37 ^ 0x30));
        ContainerDispenser.lIllIlIIllIIII[1] = "   ".length();
        ContainerDispenser.lIllIlIIllIIII[2] = (0x62 ^ 0x7C ^ (0x75 ^ 0x55));
        ContainerDispenser.lIllIlIIllIIII[3] = (0x69 ^ 0x79 ^ "  ".length());
        ContainerDispenser.lIllIlIIllIIII[4] = (0xBA ^ 0xAB);
        ContainerDispenser.lIllIlIIllIIII[5] = (0xB8 ^ 0xB1);
        ContainerDispenser.lIllIlIIllIIII[6] = (0x59 ^ 0x51);
        ContainerDispenser.lIllIlIIllIIII[7] = (92 + 123 + 1 + 10 ^ 65 + 40 - 48 + 125);
        ContainerDispenser.lIllIlIIllIIII[8] = (0x6D ^ 0x72) + (0x5E ^ 0x43) - -(0x3A ^ 0xB) + (0x37 ^ 0x16);
        ContainerDispenser.lIllIlIIllIIII[9] = (0x35 ^ 0x18);
        ContainerDispenser.lIllIlIIllIIII[10] = " ".length();
    }
    
    private static boolean llllllIIllIIlll(final int lllllllllllllIIIIIIIIIllIIlIIlll, final int lllllllllllllIIIIIIIIIllIIlIIllI) {
        return lllllllllllllIIIIIIIIIllIIlIIlll >= lllllllllllllIIIIIIIIIllIIlIIllI;
    }
    
    static {
        llllllIIllIIllI();
    }
    
    private static boolean llllllIIllIlIlI(final int lllllllllllllIIIIIIIIIllIIlIIIll, final int lllllllllllllIIIIIIIIIllIIlIIIlI) {
        return lllllllllllllIIIIIIIIIllIIlIIIll < lllllllllllllIIIIIIIIIllIIlIIIlI;
    }
    
    private static boolean llllllIIllIlIII(final Object lllllllllllllIIIIIIIIIllIIlIIIII) {
        return lllllllllllllIIIIIIIIIllIIlIIIII != null;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer lllllllllllllIIIIIIIIIllIlIIIIII) {
        return this.dispenserInventory.isUseableByPlayer(lllllllllllllIIIIIIIIIllIlIIIIII);
    }
}
