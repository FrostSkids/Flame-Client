// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerBeacon extends Container
{
    private final /* synthetic */ BeaconSlot beaconSlot;
    private static final /* synthetic */ int[] lllIIlIIlIlllI;
    private /* synthetic */ IInventory tileBeacon;
    
    private static boolean lIIlllllIIllllIl(final Object llllllllllllIlIllllIllIlllIlIIIl) {
        return llllllllllllIlIllllIllIlllIlIIIl != null;
    }
    
    private static void lIIlllllIIlllIll() {
        (lllIIlIIlIlllI = new int[12])[0] = ((0x23 ^ 0x3E) & ~(0xDB ^ 0xC6));
        ContainerBeacon.lllIIlIIlIlllI[1] = 55 + 135 - 157 + 103;
        ContainerBeacon.lllIIlIIlIlllI[2] = (217 + 248 - 360 + 144 ^ 6 + 40 + 14 + 91);
        ContainerBeacon.lllIIlIIlIlllI[3] = (0x92 ^ 0xB6);
        ContainerBeacon.lllIIlIIlIlllI[4] = 42 + 132 - 70 + 33;
        ContainerBeacon.lllIIlIIlIlllI[5] = (0x15 ^ 0x1C);
        ContainerBeacon.lllIIlIIlIlllI[6] = (165 + 127 - 170 + 49 ^ 20 + 138 - 59 + 86);
        ContainerBeacon.lllIIlIIlIlllI[7] = "   ".length();
        ContainerBeacon.lllIIlIIlIlllI[8] = (0x74 ^ 0x4E);
        ContainerBeacon.lllIIlIIlIlllI[9] = " ".length();
        ContainerBeacon.lllIIlIIlIlllI[10] = (0xC ^ 0x29);
        ContainerBeacon.lllIIlIIlIlllI[11] = (0xDC ^ 0x8F ^ (0xE9 ^ 0xA6));
    }
    
    private static boolean lIIlllllIIllllll(final int llllllllllllIlIllllIllIlllIIllll) {
        return llllllllllllIlIllllIllIlllIIllll != 0;
    }
    
    private static boolean lIIlllllIIllllII(final int llllllllllllIlIllllIllIlllIllIII, final int llllllllllllIlIllllIllIlllIlIlll) {
        return llllllllllllIlIllllIllIlllIllIII >= llllllllllllIlIllllIllIlllIlIlll;
    }
    
    @Override
    public void updateProgressBar(final int llllllllllllIlIllllIlllIIIIIIlll, final int llllllllllllIlIllllIlllIIIIIIllI) {
        this.tileBeacon.setField(llllllllllllIlIllllIlllIIIIIIlll, llllllllllllIlIllllIlllIIIIIIllI);
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer llllllllllllIlIllllIllIllllIIIll, final int llllllllllllIlIllllIllIllllIIIlI) {
        ItemStack llllllllllllIlIllllIllIllllIIlll = null;
        final Slot llllllllllllIlIllllIllIllllIIllI = this.inventorySlots.get(llllllllllllIlIllllIllIllllIIIlI);
        if (lIIlllllIIllllIl(llllllllllllIlIllllIllIllllIIllI) && lIIlllllIIllllll(llllllllllllIlIllllIllIllllIIllI.getHasStack() ? 1 : 0)) {
            final ItemStack llllllllllllIlIllllIllIllllIIlIl = llllllllllllIlIllllIllIllllIIllI.getStack();
            llllllllllllIlIllllIllIllllIIlll = llllllllllllIlIllllIllIllllIIlIl.copy();
            if (lIIlllllIIlllllI(llllllllllllIlIllllIllIllllIIIlI)) {
                if (lIIlllllIIlllllI(this.mergeItemStack(llllllllllllIlIllllIllIllllIIlIl, ContainerBeacon.lllIIlIIlIlllI[9], ContainerBeacon.lllIIlIIlIlllI[10], (boolean)(ContainerBeacon.lllIIlIIlIlllI[9] != 0)) ? 1 : 0)) {
                    return null;
                }
                llllllllllllIlIllllIllIllllIIllI.onSlotChange(llllllllllllIlIllllIllIllllIIlIl, llllllllllllIlIllllIllIllllIIlll);
                "".length();
                if (-" ".length() >= "  ".length()) {
                    return null;
                }
            }
            else if (lIIlllllIIlllllI(this.beaconSlot.getHasStack() ? 1 : 0) && lIIlllllIIllllll(this.beaconSlot.isItemValid(llllllllllllIlIllllIllIllllIIlIl) ? 1 : 0) && lIIlllllIlIIIIII(llllllllllllIlIllllIllIllllIIlIl.stackSize, ContainerBeacon.lllIIlIIlIlllI[9])) {
                if (lIIlllllIIlllllI(this.mergeItemStack(llllllllllllIlIllllIllIllllIIlIl, ContainerBeacon.lllIIlIIlIlllI[0], ContainerBeacon.lllIIlIIlIlllI[9], (boolean)(ContainerBeacon.lllIIlIIlIlllI[0] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (lIIlllllIIllllII(llllllllllllIlIllllIllIllllIIIlI, ContainerBeacon.lllIIlIIlIlllI[9]) && lIIlllllIlIIIIIl(llllllllllllIlIllllIllIllllIIIlI, ContainerBeacon.lllIIlIIlIlllI[11])) {
                if (lIIlllllIIlllllI(this.mergeItemStack(llllllllllllIlIllllIllIllllIIlIl, ContainerBeacon.lllIIlIIlIlllI[11], ContainerBeacon.lllIIlIIlIlllI[10], (boolean)(ContainerBeacon.lllIIlIIlIlllI[0] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (lIIlllllIIllllII(llllllllllllIlIllllIllIllllIIIlI, ContainerBeacon.lllIIlIIlIlllI[11]) && lIIlllllIlIIIIIl(llllllllllllIlIllllIllIllllIIIlI, ContainerBeacon.lllIIlIIlIlllI[10])) {
                if (lIIlllllIIlllllI(this.mergeItemStack(llllllllllllIlIllllIllIllllIIlIl, ContainerBeacon.lllIIlIIlIlllI[9], ContainerBeacon.lllIIlIIlIlllI[11], (boolean)(ContainerBeacon.lllIIlIIlIlllI[0] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (lIIlllllIIlllllI(this.mergeItemStack(llllllllllllIlIllllIllIllllIIlIl, ContainerBeacon.lllIIlIIlIlllI[9], ContainerBeacon.lllIIlIIlIlllI[10], (boolean)(ContainerBeacon.lllIIlIIlIlllI[0] != 0)) ? 1 : 0)) {
                return null;
            }
            if (lIIlllllIIlllllI(llllllllllllIlIllllIllIllllIIlIl.stackSize)) {
                llllllllllllIlIllllIllIllllIIllI.putStack(null);
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            else {
                llllllllllllIlIllllIllIllllIIllI.onSlotChanged();
            }
            if (lIIlllllIlIIIIII(llllllllllllIlIllllIllIllllIIlIl.stackSize, llllllllllllIlIllllIllIllllIIlll.stackSize)) {
                return null;
            }
            llllllllllllIlIllllIllIllllIIllI.onPickupFromSlot(llllllllllllIlIllllIllIllllIIIll, llllllllllllIlIllllIllIllllIIlIl);
        }
        return llllllllllllIlIllllIllIllllIIlll;
    }
    
    public ContainerBeacon(final IInventory llllllllllllIlIllllIlllIIIIlllll, final IInventory llllllllllllIlIllllIlllIIIIlIllI) {
        this.tileBeacon = llllllllllllIlIllllIlllIIIIlIllI;
        final BeaconSlot beaconSlot = new BeaconSlot(llllllllllllIlIllllIlllIIIIlIllI, ContainerBeacon.lllIIlIIlIlllI[0], ContainerBeacon.lllIIlIIlIlllI[1], ContainerBeacon.lllIIlIIlIlllI[2]);
        this.beaconSlot = beaconSlot;
        this.addSlotToContainer(beaconSlot);
        "".length();
        final int llllllllllllIlIllllIlllIIIIlllIl = ContainerBeacon.lllIIlIIlIlllI[3];
        final int llllllllllllIlIllllIlllIIIIlllII = ContainerBeacon.lllIIlIIlIlllI[4];
        int llllllllllllIlIllllIlllIIIIllIll = ContainerBeacon.lllIIlIIlIlllI[0];
        "".length();
        if (-"  ".length() > 0) {
            throw null;
        }
        while (!lIIlllllIIllllII(llllllllllllIlIllllIlllIIIIllIll, ContainerBeacon.lllIIlIIlIlllI[7])) {
            int llllllllllllIlIllllIlllIIIIllIlI = ContainerBeacon.lllIIlIIlIlllI[0];
            "".length();
            if (-"  ".length() > 0) {
                throw null;
            }
            while (!lIIlllllIIllllII(llllllllllllIlIllllIlllIIIIllIlI, ContainerBeacon.lllIIlIIlIlllI[5])) {
                this.addSlotToContainer(new Slot(llllllllllllIlIllllIlllIIIIlllll, llllllllllllIlIllllIlllIIIIllIlI + llllllllllllIlIllllIlllIIIIllIll * ContainerBeacon.lllIIlIIlIlllI[5] + ContainerBeacon.lllIIlIIlIlllI[5], llllllllllllIlIllllIlllIIIIlllIl + llllllllllllIlIllllIlllIIIIllIlI * ContainerBeacon.lllIIlIIlIlllI[6], llllllllllllIlIllllIlllIIIIlllII + llllllllllllIlIllllIlllIIIIllIll * ContainerBeacon.lllIIlIIlIlllI[6]));
                "".length();
                ++llllllllllllIlIllllIlllIIIIllIlI;
            }
            ++llllllllllllIlIllllIlllIIIIllIll;
        }
        int llllllllllllIlIllllIlllIIIIllIIl = ContainerBeacon.lllIIlIIlIlllI[0];
        "".length();
        if (" ".length() > "   ".length()) {
            throw null;
        }
        while (!lIIlllllIIllllII(llllllllllllIlIllllIlllIIIIllIIl, ContainerBeacon.lllIIlIIlIlllI[5])) {
            this.addSlotToContainer(new Slot(llllllllllllIlIllllIlllIIIIlllll, llllllllllllIlIllllIlllIIIIllIIl, llllllllllllIlIllllIlllIIIIlllIl + llllllllllllIlIllllIlllIIIIllIIl * ContainerBeacon.lllIIlIIlIlllI[6], ContainerBeacon.lllIIlIIlIlllI[8] + llllllllllllIlIllllIlllIIIIlllII));
            "".length();
            ++llllllllllllIlIllllIlllIIIIllIIl;
        }
    }
    
    @Override
    public void onCraftGuiOpened(final ICrafting llllllllllllIlIllllIlllIIIIIlllI) {
        super.onCraftGuiOpened(llllllllllllIlIllllIlllIIIIIlllI);
        llllllllllllIlIllllIlllIIIIIlllI.func_175173_a(this, this.tileBeacon);
    }
    
    public IInventory func_180611_e() {
        return this.tileBeacon;
    }
    
    private static boolean lIIlllllIlIIIIIl(final int llllllllllllIlIllllIllIlllIlIlII, final int llllllllllllIlIllllIllIlllIlIIll) {
        return llllllllllllIlIllllIllIlllIlIlII < llllllllllllIlIllllIllIlllIlIIll;
    }
    
    static {
        lIIlllllIIlllIll();
    }
    
    private static boolean lIIlllllIlIIIIII(final int llllllllllllIlIllllIllIlllIlllII, final int llllllllllllIlIllllIllIlllIllIll) {
        return llllllllllllIlIllllIllIlllIlllII == llllllllllllIlIllllIllIlllIllIll;
    }
    
    private static boolean lIIlllllIIlllllI(final int llllllllllllIlIllllIllIlllIIllIl) {
        return llllllllllllIlIllllIllIlllIIllIl == 0;
    }
    
    @Override
    public void onContainerClosed(final EntityPlayer llllllllllllIlIllllIllIllllllIII) {
        super.onContainerClosed(llllllllllllIlIllllIllIllllllIII);
        if (lIIlllllIIllllIl(llllllllllllIlIllllIllIllllllIII) && lIIlllllIIlllllI(llllllllllllIlIllllIllIllllllIII.worldObj.isRemote ? 1 : 0)) {
            final ItemStack llllllllllllIlIllllIllIllllllIlI = this.beaconSlot.decrStackSize(this.beaconSlot.getSlotStackLimit());
            if (lIIlllllIIllllIl(llllllllllllIlIllllIllIllllllIlI)) {
                llllllllllllIlIllllIllIllllllIII.dropPlayerItemWithRandomChoice(llllllllllllIlIllllIllIllllllIlI, (boolean)(ContainerBeacon.lllIIlIIlIlllI[0] != 0));
                "".length();
            }
        }
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer llllllllllllIlIllllIllIlllllIIll) {
        return this.tileBeacon.isUseableByPlayer(llllllllllllIlIllllIllIlllllIIll);
    }
    
    class BeaconSlot extends Slot
    {
        private static final /* synthetic */ int[] lIlIllllIllIll;
        
        private static boolean llllIlIIlllIlII(final Object lllllllllllllIIIIlIlIIIIIIIlIIlI, final Object lllllllllllllIIIIlIlIIIIIIIlIIIl) {
            return lllllllllllllIIIIlIlIIIIIIIlIIlI != lllllllllllllIIIIlIlIIIIIIIlIIIl;
        }
        
        static {
            llllIlIIlllIIlI();
        }
        
        @Override
        public boolean isItemValid(final ItemStack lllllllllllllIIIIlIlIIIIIIIlIlll) {
            int n;
            if (llllIlIIlllIIll(lllllllllllllIIIIlIlIIIIIIIlIlll)) {
                n = BeaconSlot.lIlIllllIllIll[0];
                "".length();
                if (" ".length() < -" ".length()) {
                    return ((114 + 11 + 50 + 66 ^ 114 + 103 - 129 + 56) & (0x62 ^ 0x4F ^ (0x5E ^ 0x12) ^ -" ".length())) != 0x0;
                }
            }
            else if (llllIlIIlllIlII(lllllllllllllIIIIlIlIIIIIIIlIlll.getItem(), Items.emerald) && llllIlIIlllIlII(lllllllllllllIIIIlIlIIIIIIIlIlll.getItem(), Items.diamond) && llllIlIIlllIlII(lllllllllllllIIIIlIlIIIIIIIlIlll.getItem(), Items.gold_ingot) && llllIlIIlllIlII(lllllllllllllIIIIlIlIIIIIIIlIlll.getItem(), Items.iron_ingot)) {
                n = BeaconSlot.lIlIllllIllIll[0];
                "".length();
                if (null != null) {
                    return ((0x66 ^ 0x3F ^ (0x0 ^ 0x47)) & (0x9E ^ 0xB2 ^ (0x77 ^ 0x45) ^ -" ".length())) != 0x0;
                }
            }
            else {
                n = BeaconSlot.lIlIllllIllIll[1];
            }
            return n != 0;
        }
        
        private static void llllIlIIlllIIlI() {
            (lIlIllllIllIll = new int[2])[0] = ((0xFC ^ 0xA0) & ~(0x6B ^ 0x37));
            BeaconSlot.lIlIllllIllIll[1] = " ".length();
        }
        
        public BeaconSlot(final IInventory lllllllllllllIIIIlIlIIIIIIlIIIll, final int lllllllllllllIIIIlIlIIIIIIlIIIlI, final int lllllllllllllIIIIlIlIIIIIIlIIIIl, final int lllllllllllllIIIIlIlIIIIIIlIIIII) {
            super(lllllllllllllIIIIlIlIIIIIIlIIIll, lllllllllllllIIIIlIlIIIIIIlIIIlI, lllllllllllllIIIIlIlIIIIIIlIIIIl, lllllllllllllIIIIlIlIIIIIIlIIIII);
        }
        
        private static boolean llllIlIIlllIIll(final Object lllllllllllllIIIIlIlIIIIIIIIllll) {
            return lllllllllllllIIIIlIlIIIIIIIIllll == null;
        }
        
        @Override
        public int getSlotStackLimit() {
            return BeaconSlot.lIlIllllIllIll[1];
        }
    }
}
