// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.entity.Entity;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.passive.EntityHorse;

public class ContainerHorseInventory extends Container
{
    private /* synthetic */ IInventory horseInventory;
    private static final /* synthetic */ int[] llIIIIIlIIIIII;
    private /* synthetic */ EntityHorse theHorse;
    
    private static int lIIIIlllIIIlllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIIlllIIIllllI(final Object llllllllllllIlllIllllIlIllIIllIl) {
        return llllllllllllIlllIllllIlIllIIllIl != null;
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer llllllllllllIlllIllllIlIlllIlIlI, final int llllllllllllIlllIllllIlIlllIlIIl) {
        ItemStack llllllllllllIlllIllllIlIlllIlIII = null;
        final Slot llllllllllllIlllIllllIlIlllIIlll = this.inventorySlots.get(llllllllllllIlllIllllIlIlllIlIIl);
        if (lIIIIlllIIIllllI(llllllllllllIlllIllllIlIlllIIlll) && lIIIIlllIIIllIlI(llllllllllllIlllIllllIlIlllIIlll.getHasStack() ? 1 : 0)) {
            final ItemStack llllllllllllIlllIllllIlIlllIIllI = llllllllllllIlllIllllIlIlllIIlll.getStack();
            llllllllllllIlllIllllIlIlllIlIII = llllllllllllIlllIllllIlIlllIIllI.copy();
            if (lIIIIlllIIIlllll(llllllllllllIlllIllllIlIlllIlIIl, this.horseInventory.getSizeInventory())) {
                if (lIIIIlllIIlIIIII(this.mergeItemStack(llllllllllllIlllIllllIlIlllIIllI, this.horseInventory.getSizeInventory(), this.inventorySlots.size(), (boolean)(ContainerHorseInventory.llIIIIIlIIIIII[5] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (lIIIIlllIIIllIlI(this.getSlot(ContainerHorseInventory.llIIIIIlIIIIII[5]).isItemValid(llllllllllllIlllIllllIlIlllIIllI) ? 1 : 0) && lIIIIlllIIlIIIII(this.getSlot(ContainerHorseInventory.llIIIIIlIIIIII[5]).getHasStack() ? 1 : 0)) {
                if (lIIIIlllIIlIIIII(this.mergeItemStack(llllllllllllIlllIllllIlIlllIIllI, ContainerHorseInventory.llIIIIIlIIIIII[5], ContainerHorseInventory.llIIIIIlIIIIII[7], (boolean)(ContainerHorseInventory.llIIIIIlIIIIII[3] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (lIIIIlllIIIllIlI(this.getSlot(ContainerHorseInventory.llIIIIIlIIIIII[3]).isItemValid(llllllllllllIlllIllllIlIlllIIllI) ? 1 : 0)) {
                if (lIIIIlllIIlIIIII(this.mergeItemStack(llllllllllllIlllIllllIlIlllIIllI, ContainerHorseInventory.llIIIIIlIIIIII[3], ContainerHorseInventory.llIIIIIlIIIIII[5], (boolean)(ContainerHorseInventory.llIIIIIlIIIIII[3] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (!lIIIIlllIIlIIIIl(this.horseInventory.getSizeInventory(), ContainerHorseInventory.llIIIIIlIIIIII[7]) || lIIIIlllIIlIIIII(this.mergeItemStack(llllllllllllIlllIllllIlIlllIIllI, ContainerHorseInventory.llIIIIIlIIIIII[7], this.horseInventory.getSizeInventory(), (boolean)(ContainerHorseInventory.llIIIIIlIIIIII[3] != 0)) ? 1 : 0)) {
                return null;
            }
            if (lIIIIlllIIlIIIII(llllllllllllIlllIllllIlIlllIIllI.stackSize)) {
                llllllllllllIlllIllllIlIlllIIlll.putStack(null);
                "".length();
                if (((23 + 56 + 52 + 9 ^ 19 + 105 - 34 + 72) & (0x47 ^ 0x17 ^ (0x7 ^ 0x79) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                llllllllllllIlllIllllIlIlllIIlll.onSlotChanged();
            }
        }
        return llllllllllllIlllIllllIlIlllIlIII;
    }
    
    private static boolean lIIIIlllIIIlllll(final int llllllllllllIlllIllllIlIllIlIlII, final int llllllllllllIlllIllllIlIllIlIIll) {
        return llllllllllllIlllIllllIlIllIlIlII < llllllllllllIlllIllllIlIllIlIIll;
    }
    
    private static boolean lIIIIlllIIlIIIIl(final int llllllllllllIlllIllllIlIllIlIIII, final int llllllllllllIlllIllllIlIllIIllll) {
        return llllllllllllIlllIllllIlIllIlIIII > llllllllllllIlllIllllIlIllIIllll;
    }
    
    public ContainerHorseInventory(final IInventory llllllllllllIlllIllllIlIlllllllI, final IInventory llllllllllllIlllIllllIlIllllllIl, final EntityHorse llllllllllllIlllIllllIlIllllllII, final EntityPlayer llllllllllllIlllIllllIlIlllllIll) {
        this.horseInventory = llllllllllllIlllIllllIlIllllllIl;
        this.theHorse = llllllllllllIlllIllllIlIllllllII;
        final int llllllllllllIlllIllllIllIIIIIllI = ContainerHorseInventory.llIIIIIlIIIIII[0];
        llllllllllllIlllIllllIlIllllllIl.openInventory(llllllllllllIlllIllllIlIlllllIll);
        final int llllllllllllIlllIllllIllIIIIIlIl = (llllllllllllIlllIllllIllIIIIIllI - ContainerHorseInventory.llIIIIIlIIIIII[1]) * ContainerHorseInventory.llIIIIIlIIIIII[2];
        this.addSlotToContainer(new Slot(llllllllllllIlllIllllIlIllllllIl, ContainerHorseInventory.llIIIIIlIIIIII[3], ContainerHorseInventory.llIIIIIlIIIIII[4], ContainerHorseInventory.llIIIIIlIIIIII[2]) {
            private static final /* synthetic */ int[] llIlIlIllIIlll;
            
            @Override
            public boolean isItemValid(final ItemStack llllllllllllIllIlIlIIIlIllIIlIlI) {
                if (lIIlIlIIlIIlIIll(super.isItemValid(llllllllllllIllIlIlIIIlIllIIlIlI) ? 1 : 0) && lIIlIlIIlIIlIlII(llllllllllllIllIlIlIIIlIllIIlIlI.getItem(), Items.saddle) && lIIlIlIIlIIlIlIl(this.getHasStack() ? 1 : 0)) {
                    return ContainerHorseInventory$1.llIlIlIllIIlll[0] != 0;
                }
                return ContainerHorseInventory$1.llIlIlIllIIlll[1] != 0;
            }
            
            static {
                lIIlIlIIlIIlIIlI();
            }
            
            private static boolean lIIlIlIIlIIlIlII(final Object llllllllllllIllIlIlIIIlIllIIIlll, final Object llllllllllllIllIlIlIIIlIllIIIllI) {
                return llllllllllllIllIlIlIIIlIllIIIlll == llllllllllllIllIlIlIIIlIllIIIllI;
            }
            
            private static boolean lIIlIlIIlIIlIlIl(final int llllllllllllIllIlIlIIIlIllIIIIlI) {
                return llllllllllllIllIlIlIIIlIllIIIIlI == 0;
            }
            
            private static void lIIlIlIIlIIlIIlI() {
                (llIlIlIllIIlll = new int[2])[0] = " ".length();
                ContainerHorseInventory$1.llIlIlIllIIlll[1] = ((13 + 71 - 60 + 107 ^ 72 + 62 - 129 + 157) & (0x16 ^ 0x35 ^ "  ".length() ^ -" ".length()));
            }
            
            private static boolean lIIlIlIIlIIlIIll(final int llllllllllllIllIlIlIIIlIllIIIlII) {
                return llllllllllllIllIlIlIIIlIllIIIlII != 0;
            }
        });
        "".length();
        this.addSlotToContainer(new Slot(llllllllllllIlllIllllIlIllllllIl, ContainerHorseInventory.llIIIIIlIIIIII[5], ContainerHorseInventory.llIIIIIlIIIIII[4], ContainerHorseInventory.llIIIIIlIIIIII[6]) {
            private static final /* synthetic */ int[] lIIlIIllIIllIl;
            
            private static void llIIllIlllllIlI() {
                (lIIlIIllIIllIl = new int[2])[0] = " ".length();
                ContainerHorseInventory$2.lIIlIIllIIllIl[1] = ((114 + 23 - 27 + 105 ^ 111 + 15 - 109 + 111) & (0x71 ^ 0x2B ^ (0x64 ^ 0x69) ^ -" ".length()));
            }
            
            static {
                llIIllIlllllIlI();
            }
            
            @Override
            public boolean isItemValid(final ItemStack lllllllllllllIIllIllIlIIlIIIlIII) {
                if (llIIllIlllllIll(super.isItemValid(lllllllllllllIIllIllIlIIlIIIlIII) ? 1 : 0) && llIIllIlllllIll(llllllllllllIlllIllllIlIllllllII.canWearArmor() ? 1 : 0) && llIIllIlllllIll(EntityHorse.isArmorItem(lllllllllllllIIllIllIlIIlIIIlIII.getItem()) ? 1 : 0)) {
                    return ContainerHorseInventory$2.lIIlIIllIIllIl[0] != 0;
                }
                return ContainerHorseInventory$2.lIIlIIllIIllIl[1] != 0;
            }
            
            @Override
            public boolean canBeHovered() {
                return llllllllllllIlllIllllIlIllllllII.canWearArmor();
            }
            
            private static boolean llIIllIlllllIll(final int lllllllllllllIIllIllIlIIlIIIIIIl) {
                return lllllllllllllIIllIllIlIIlIIIIIIl != 0;
            }
        });
        "".length();
        if (lIIIIlllIIIllIlI(llllllllllllIlllIllllIlIllllllII.isChested() ? 1 : 0)) {
            int llllllllllllIlllIllllIllIIIIIlII = ContainerHorseInventory.llIIIIIlIIIIII[3];
            "".length();
            if (-"  ".length() >= 0) {
                throw null;
            }
            while (!lIIIIlllIIIllIll(llllllllllllIlllIllllIllIIIIIlII, llllllllllllIlllIllllIllIIIIIllI)) {
                int llllllllllllIlllIllllIllIIIIIIll = ContainerHorseInventory.llIIIIIlIIIIII[3];
                "".length();
                if (null != null) {
                    throw null;
                }
                while (!lIIIIlllIIIllIll(llllllllllllIlllIllllIllIIIIIIll, ContainerHorseInventory.llIIIIIlIIIIII[8])) {
                    this.addSlotToContainer(new Slot(llllllllllllIlllIllllIlIllllllIl, ContainerHorseInventory.llIIIIIlIIIIII[7] + llllllllllllIlllIllllIllIIIIIIll + llllllllllllIlllIllllIllIIIIIlII * ContainerHorseInventory.llIIIIIlIIIIII[8], ContainerHorseInventory.llIIIIIlIIIIII[9] + llllllllllllIlllIllllIllIIIIIIll * ContainerHorseInventory.llIIIIIlIIIIII[2], ContainerHorseInventory.llIIIIIlIIIIII[2] + llllllllllllIlllIllllIllIIIIIlII * ContainerHorseInventory.llIIIIIlIIIIII[2]));
                    "".length();
                    ++llllllllllllIlllIllllIllIIIIIIll;
                }
                ++llllllllllllIlllIllllIllIIIIIlII;
            }
        }
        int llllllllllllIlllIllllIllIIIIIIlI = ContainerHorseInventory.llIIIIIlIIIIII[3];
        "".length();
        if (((169 + 237 - 168 + 17 ^ 93 + 66 - 119 + 148) & (0xF ^ 0x11 ^ (0x1A ^ 0x47) ^ -" ".length())) > "   ".length()) {
            throw null;
        }
        while (!lIIIIlllIIIllIll(llllllllllllIlllIllllIllIIIIIIlI, ContainerHorseInventory.llIIIIIlIIIIII[0])) {
            int llllllllllllIlllIllllIllIIIIIIIl = ContainerHorseInventory.llIIIIIlIIIIII[3];
            "".length();
            if (null != null) {
                throw null;
            }
            while (!lIIIIlllIIIllIll(llllllllllllIlllIllllIllIIIIIIIl, ContainerHorseInventory.llIIIIIlIIIIII[10])) {
                this.addSlotToContainer(new Slot(llllllllllllIlllIllllIlIlllllllI, llllllllllllIlllIllllIllIIIIIIIl + llllllllllllIlllIllllIllIIIIIIlI * ContainerHorseInventory.llIIIIIlIIIIII[10] + ContainerHorseInventory.llIIIIIlIIIIII[10], ContainerHorseInventory.llIIIIIlIIIIII[4] + llllllllllllIlllIllllIllIIIIIIIl * ContainerHorseInventory.llIIIIIlIIIIII[2], ContainerHorseInventory.llIIIIIlIIIIII[11] + llllllllllllIlllIllllIllIIIIIIlI * ContainerHorseInventory.llIIIIIlIIIIII[2] + llllllllllllIlllIllllIllIIIIIlIl));
                "".length();
                ++llllllllllllIlllIllllIllIIIIIIIl;
            }
            ++llllllllllllIlllIllllIllIIIIIIlI;
        }
        int llllllllllllIlllIllllIllIIIIIIII = ContainerHorseInventory.llIIIIIlIIIIII[3];
        "".length();
        if (" ".length() != " ".length()) {
            throw null;
        }
        while (!lIIIIlllIIIllIll(llllllllllllIlllIllllIllIIIIIIII, ContainerHorseInventory.llIIIIIlIIIIII[10])) {
            this.addSlotToContainer(new Slot(llllllllllllIlllIllllIlIlllllllI, llllllllllllIlllIllllIllIIIIIIII, ContainerHorseInventory.llIIIIIlIIIIII[4] + llllllllllllIlllIllllIllIIIIIIII * ContainerHorseInventory.llIIIIIlIIIIII[2], ContainerHorseInventory.llIIIIIlIIIIII[12] + llllllllllllIlllIllllIllIIIIIlIl));
            "".length();
            ++llllllllllllIlllIllllIllIIIIIIII;
        }
    }
    
    private static boolean lIIIIlllIIIllIlI(final int llllllllllllIlllIllllIlIllIIlIll) {
        return llllllllllllIlllIllllIlIllIIlIll != 0;
    }
    
    @Override
    public void onContainerClosed(final EntityPlayer llllllllllllIlllIllllIlIllIlllIl) {
        super.onContainerClosed(llllllllllllIlllIllllIlIllIlllIl);
        this.horseInventory.closeInventory(llllllllllllIlllIllllIlIllIlllIl);
    }
    
    private static boolean lIIIIlllIIIlllIl(final int llllllllllllIlllIllllIlIllIIIlll) {
        return llllllllllllIlllIllllIlIllIIIlll < 0;
    }
    
    private static boolean lIIIIlllIIIllIll(final int llllllllllllIlllIllllIlIllIllIII, final int llllllllllllIlllIllllIlIllIlIlll) {
        return llllllllllllIlllIllllIlIllIllIII >= llllllllllllIlllIllllIlIllIlIlll;
    }
    
    static {
        lIIIIlllIIIllIIl();
    }
    
    private static void lIIIIlllIIIllIIl() {
        (llIIIIIlIIIIII = new int[13])[0] = "   ".length();
        ContainerHorseInventory.llIIIIIlIIIIII[1] = (0x96 ^ 0x92);
        ContainerHorseInventory.llIIIIIlIIIIII[2] = (4 + 121 - 32 + 50 ^ 106 + 113 - 171 + 109);
        ContainerHorseInventory.llIIIIIlIIIIII[3] = ((0x22 ^ 0x76 ^ (0x4 ^ 0x58)) & (82 + 34 + 2 + 25 ^ 42 + 127 - 87 + 53 ^ -" ".length()));
        ContainerHorseInventory.llIIIIIlIIIIII[4] = (170 + 1 - 62 + 92 ^ 20 + 44 + 117 + 12);
        ContainerHorseInventory.llIIIIIlIIIIII[5] = " ".length();
        ContainerHorseInventory.llIIIIIlIIIIII[6] = (0x44 ^ 0x60);
        ContainerHorseInventory.llIIIIIlIIIIII[7] = "  ".length();
        ContainerHorseInventory.llIIIIIlIIIIII[8] = (0xE ^ 0x20 ^ (0x51 ^ 0x7A));
        ContainerHorseInventory.llIIIIIlIIIIII[9] = (208 + 185 - 351 + 189 ^ 101 + 26 - 28 + 84);
        ContainerHorseInventory.llIIIIIlIIIIII[10] = (154 + 120 - 119 + 27 ^ 22 + 96 + 9 + 64);
        ContainerHorseInventory.llIIIIIlIIIIII[11] = (0xB1 ^ 0x9C ^ (0xCA ^ 0x81));
        ContainerHorseInventory.llIIIIIlIIIIII[12] = 112 + 28 - 94 + 114;
    }
    
    private static boolean lIIIIlllIIlIIIII(final int llllllllllllIlllIllllIlIllIIlIIl) {
        return llllllllllllIlllIllllIlIllIIlIIl == 0;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer llllllllllllIlllIllllIlIllllIIIl) {
        if (lIIIIlllIIIllIlI(this.horseInventory.isUseableByPlayer(llllllllllllIlllIllllIlIllllIIIl) ? 1 : 0) && lIIIIlllIIIllIlI(this.theHorse.isEntityAlive() ? 1 : 0) && lIIIIlllIIIlllIl(lIIIIlllIIIlllII(this.theHorse.getDistanceToEntity(llllllllllllIlllIllllIlIllllIIIl), 8.0f))) {
            return ContainerHorseInventory.llIIIIIlIIIIII[5] != 0;
        }
        return ContainerHorseInventory.llIIIIIlIIIIII[3] != 0;
    }
}
