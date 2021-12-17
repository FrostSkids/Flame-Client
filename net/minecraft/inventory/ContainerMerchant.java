// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.IMerchant;
import net.minecraft.world.World;

public class ContainerMerchant extends Container
{
    private final /* synthetic */ World theWorld;
    private /* synthetic */ IMerchant theMerchant;
    private static final /* synthetic */ int[] llIIIIlIIllIll;
    private /* synthetic */ InventoryMerchant merchantInventory;
    
    private static boolean lIIIIlllllIlIlIl(final int llllllllllllIlllIlllIIIIIIIIllIl, final int llllllllllllIlllIlllIIIIIIIIllII) {
        return llllllllllllIlllIlllIIIIIIIIllIl != llllllllllllIlllIlllIIIIIIIIllII;
    }
    
    @Override
    public void onCraftGuiOpened(final ICrafting llllllllllllIlllIlllIIIIIlIllIIl) {
        super.onCraftGuiOpened(llllllllllllIlllIlllIIIIIlIllIIl);
    }
    
    private static boolean lIIIIlllllIlIIlI(final int llllllllllllIlllIlllIIIIIIIlIIlI) {
        return llllllllllllIlllIlllIIIIIIIlIIlI != 0;
    }
    
    private static boolean lIIIIlllllIIllll(final int llllllllllllIlllIlllIIIIIIIlllll, final int llllllllllllIlllIlllIIIIIIIllllI) {
        return llllllllllllIlllIlllIIIIIIIlllll >= llllllllllllIlllIlllIIIIIIIllllI;
    }
    
    @Override
    public void onContainerClosed(final EntityPlayer llllllllllllIlllIlllIIIIIIlIIlll) {
        super.onContainerClosed(llllllllllllIlllIlllIIIIIIlIIlll);
        this.theMerchant.setCustomer(null);
        super.onContainerClosed(llllllllllllIlllIlllIIIIIIlIIlll);
        if (lIIIIlllllIlIlII(this.theWorld.isRemote ? 1 : 0)) {
            ItemStack llllllllllllIlllIlllIIIIIIlIlIIl = this.merchantInventory.removeStackFromSlot(ContainerMerchant.llIIIIlIIllIll[0]);
            if (lIIIIlllllIlIIIl(llllllllllllIlllIlllIIIIIIlIlIIl)) {
                llllllllllllIlllIlllIIIIIIlIIlll.dropPlayerItemWithRandomChoice(llllllllllllIlllIlllIIIIIIlIlIIl, (boolean)(ContainerMerchant.llIIIIlIIllIll[0] != 0));
                "".length();
            }
            llllllllllllIlllIlllIIIIIIlIlIIl = this.merchantInventory.removeStackFromSlot(ContainerMerchant.llIIIIlIIllIll[3]);
            if (lIIIIlllllIlIIIl(llllllllllllIlllIlllIIIIIIlIlIIl)) {
                llllllllllllIlllIlllIIIIIIlIIlll.dropPlayerItemWithRandomChoice(llllllllllllIlllIlllIIIIIIlIlIIl, (boolean)(ContainerMerchant.llIIIIlIIllIll[0] != 0));
                "".length();
            }
        }
    }
    
    private static boolean lIIIIlllllIlIIll(final int llllllllllllIlllIlllIIIIIIlIIIll, final int llllllllllllIlllIlllIIIIIIlIIIlI) {
        return llllllllllllIlllIlllIIIIIIlIIIll == llllllllllllIlllIlllIIIIIIlIIIlI;
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer llllllllllllIlllIlllIIIIIIlllIIl, final int llllllllllllIlllIlllIIIIIIllIIlI) {
        ItemStack llllllllllllIlllIlllIIIIIIllIlll = null;
        final Slot llllllllllllIlllIlllIIIIIIllIllI = this.inventorySlots.get(llllllllllllIlllIlllIIIIIIllIIlI);
        if (lIIIIlllllIlIIIl(llllllllllllIlllIlllIIIIIIllIllI) && lIIIIlllllIlIIlI(llllllllllllIlllIlllIIIIIIllIllI.getHasStack() ? 1 : 0)) {
            final ItemStack llllllllllllIlllIlllIIIIIIllIlIl = llllllllllllIlllIlllIIIIIIllIllI.getStack();
            llllllllllllIlllIlllIIIIIIllIlll = llllllllllllIlllIlllIIIIIIllIlIl.copy();
            if (lIIIIlllllIlIIll(llllllllllllIlllIlllIIIIIIllIIlI, ContainerMerchant.llIIIIlIIllIll[5])) {
                if (lIIIIlllllIlIlII(this.mergeItemStack(llllllllllllIlllIlllIIIIIIllIlIl, ContainerMerchant.llIIIIlIIllIll[11], ContainerMerchant.llIIIIlIIllIll[13], (boolean)(ContainerMerchant.llIIIIlIIllIll[3] != 0)) ? 1 : 0)) {
                    return null;
                }
                llllllllllllIlllIlllIIIIIIllIllI.onSlotChange(llllllllllllIlllIlllIIIIIIllIlIl, llllllllllllIlllIlllIIIIIIllIlll);
                "".length();
                if ((0x99 ^ 0x9C) == 0x0) {
                    return null;
                }
            }
            else if (lIIIIlllllIlIIlI(llllllllllllIlllIlllIIIIIIllIIlI) && lIIIIlllllIlIlIl(llllllllllllIlllIlllIIIIIIllIIlI, ContainerMerchant.llIIIIlIIllIll[3])) {
                if (lIIIIlllllIIllll(llllllllllllIlllIlllIIIIIIllIIlI, ContainerMerchant.llIIIIlIIllIll[11]) && lIIIIlllllIlIllI(llllllllllllIlllIlllIIIIIIllIIlI, ContainerMerchant.llIIIIlIIllIll[14])) {
                    if (lIIIIlllllIlIlII(this.mergeItemStack(llllllllllllIlllIlllIIIIIIllIlIl, ContainerMerchant.llIIIIlIIllIll[14], ContainerMerchant.llIIIIlIIllIll[13], (boolean)(ContainerMerchant.llIIIIlIIllIll[0] != 0)) ? 1 : 0)) {
                        return null;
                    }
                }
                else if (lIIIIlllllIIllll(llllllllllllIlllIlllIIIIIIllIIlI, ContainerMerchant.llIIIIlIIllIll[14]) && lIIIIlllllIlIllI(llllllllllllIlllIlllIIIIIIllIIlI, ContainerMerchant.llIIIIlIIllIll[13]) && lIIIIlllllIlIlII(this.mergeItemStack(llllllllllllIlllIlllIIIIIIllIlIl, ContainerMerchant.llIIIIlIIllIll[11], ContainerMerchant.llIIIIlIIllIll[14], (boolean)(ContainerMerchant.llIIIIlIIllIll[0] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (lIIIIlllllIlIlII(this.mergeItemStack(llllllllllllIlllIlllIIIIIIllIlIl, ContainerMerchant.llIIIIlIIllIll[11], ContainerMerchant.llIIIIlIIllIll[13], (boolean)(ContainerMerchant.llIIIIlIIllIll[0] != 0)) ? 1 : 0)) {
                return null;
            }
            if (lIIIIlllllIlIlII(llllllllllllIlllIlllIIIIIIllIlIl.stackSize)) {
                llllllllllllIlllIlllIIIIIIllIllI.putStack(null);
                "".length();
                if (-" ".length() > -" ".length()) {
                    return null;
                }
            }
            else {
                llllllllllllIlllIlllIIIIIIllIllI.onSlotChanged();
            }
            if (lIIIIlllllIlIIll(llllllllllllIlllIlllIIIIIIllIlIl.stackSize, llllllllllllIlllIlllIIIIIIllIlll.stackSize)) {
                return null;
            }
            llllllllllllIlllIlllIIIIIIllIllI.onPickupFromSlot(llllllllllllIlllIlllIIIIIIlllIIl, llllllllllllIlllIlllIIIIIIllIlIl);
        }
        return llllllllllllIlllIlllIIIIIIllIlll;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer llllllllllllIlllIlllIIIIIlIIIIIl) {
        if (lIIIIlllllIlIIII(this.theMerchant.getCustomer(), llllllllllllIlllIlllIIIIIlIIIIIl)) {
            return ContainerMerchant.llIIIIlIIllIll[3] != 0;
        }
        return ContainerMerchant.llIIIIlIIllIll[0] != 0;
    }
    
    @Override
    public void onCraftMatrixChanged(final IInventory llllllllllllIlllIlllIIIIIlIlIIlI) {
        this.merchantInventory.resetRecipeAndSlots();
        super.onCraftMatrixChanged(llllllllllllIlllIlllIIIIIlIlIIlI);
    }
    
    static {
        lIIIIlllllIIlllI();
    }
    
    private static boolean lIIIIlllllIlIllI(final int llllllllllllIlllIlllIIIIIIIllIll, final int llllllllllllIlllIlllIIIIIIIllIlI) {
        return llllllllllllIlllIlllIIIIIIIllIll < llllllllllllIlllIlllIIIIIIIllIlI;
    }
    
    private static boolean lIIIIlllllIlIlII(final int llllllllllllIlllIlllIIIIIIIlIIII) {
        return llllllllllllIlllIlllIIIIIIIlIIII == 0;
    }
    
    private static boolean lIIIIlllllIlIIII(final Object llllllllllllIlllIlllIIIIIIIlIlll, final Object llllllllllllIlllIlllIIIIIIIlIllI) {
        return llllllllllllIlllIlllIIIIIIIlIlll == llllllllllllIlllIlllIIIIIIIlIllI;
    }
    
    public ContainerMerchant(final InventoryPlayer llllllllllllIlllIlllIIIIIllIIllI, final IMerchant llllllllllllIlllIlllIIIIIllIIlIl, final World llllllllllllIlllIlllIIIIIllIIlII) {
        this.theMerchant = llllllllllllIlllIlllIIIIIllIIlIl;
        this.theWorld = llllllllllllIlllIlllIIIIIllIIlII;
        this.merchantInventory = new InventoryMerchant(llllllllllllIlllIlllIIIIIllIIllI.player, llllllllllllIlllIlllIIIIIllIIlIl);
        this.addSlotToContainer(new Slot(this.merchantInventory, ContainerMerchant.llIIIIlIIllIll[0], ContainerMerchant.llIIIIlIIllIll[1], ContainerMerchant.llIIIIlIIllIll[2]));
        "".length();
        this.addSlotToContainer(new Slot(this.merchantInventory, ContainerMerchant.llIIIIlIIllIll[3], ContainerMerchant.llIIIIlIIllIll[4], ContainerMerchant.llIIIIlIIllIll[2]));
        "".length();
        this.addSlotToContainer(new SlotMerchantResult(llllllllllllIlllIlllIIIIIllIIllI.player, llllllllllllIlllIlllIIIIIllIIlIl, this.merchantInventory, ContainerMerchant.llIIIIlIIllIll[5], ContainerMerchant.llIIIIlIIllIll[6], ContainerMerchant.llIIIIlIIllIll[2]));
        "".length();
        int llllllllllllIlllIlllIIIIIllIlIlI = ContainerMerchant.llIIIIlIIllIll[0];
        "".length();
        if (" ".length() != " ".length()) {
            throw null;
        }
        while (!lIIIIlllllIIllll(llllllllllllIlllIlllIIIIIllIlIlI, ContainerMerchant.llIIIIlIIllIll[11])) {
            int llllllllllllIlllIlllIIIIIllIlIIl = ContainerMerchant.llIIIIlIIllIll[0];
            "".length();
            if ((0xC2 ^ 0xC6) == 0x0) {
                throw null;
            }
            while (!lIIIIlllllIIllll(llllllllllllIlllIlllIIIIIllIlIIl, ContainerMerchant.llIIIIlIIllIll[7])) {
                this.addSlotToContainer(new Slot(llllllllllllIlllIlllIIIIIllIIllI, llllllllllllIlllIlllIIIIIllIlIIl + llllllllllllIlllIlllIIIIIllIlIlI * ContainerMerchant.llIIIIlIIllIll[7] + ContainerMerchant.llIIIIlIIllIll[7], ContainerMerchant.llIIIIlIIllIll[8] + llllllllllllIlllIlllIIIIIllIlIIl * ContainerMerchant.llIIIIlIIllIll[9], ContainerMerchant.llIIIIlIIllIll[10] + llllllllllllIlllIlllIIIIIllIlIlI * ContainerMerchant.llIIIIlIIllIll[9]));
                "".length();
                ++llllllllllllIlllIlllIIIIIllIlIIl;
            }
            ++llllllllllllIlllIlllIIIIIllIlIlI;
        }
        int llllllllllllIlllIlllIIIIIllIlIII = ContainerMerchant.llIIIIlIIllIll[0];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!lIIIIlllllIIllll(llllllllllllIlllIlllIIIIIllIlIII, ContainerMerchant.llIIIIlIIllIll[7])) {
            this.addSlotToContainer(new Slot(llllllllllllIlllIlllIIIIIllIIllI, llllllllllllIlllIlllIIIIIllIlIII, ContainerMerchant.llIIIIlIIllIll[8] + llllllllllllIlllIlllIIIIIllIlIII * ContainerMerchant.llIIIIlIIllIll[9], ContainerMerchant.llIIIIlIIllIll[12]));
            "".length();
            ++llllllllllllIlllIlllIIIIIllIlIII;
        }
    }
    
    private static void lIIIIlllllIIlllI() {
        (llIIIIlIIllIll = new int[15])[0] = ((0x1B ^ 0x34 ^ (0xD9 ^ 0xBA)) & (0x11 ^ 0x5 ^ (0x71 ^ 0x29) ^ -" ".length()));
        ContainerMerchant.llIIIIlIIllIll[1] = (0x59 ^ 0x7D);
        ContainerMerchant.llIIIIlIIllIll[2] = (46 + 55 + 37 + 11 ^ 85 + 2 + 43 + 30);
        ContainerMerchant.llIIIIlIIllIll[3] = " ".length();
        ContainerMerchant.llIIIIlIIllIll[4] = (116 + 37 - 56 + 44 ^ 109 + 104 - 197 + 163);
        ContainerMerchant.llIIIIlIIllIll[5] = "  ".length();
        ContainerMerchant.llIIIIlIIllIll[6] = (0x56 ^ 0x61 ^ (0x13 ^ 0x5C));
        ContainerMerchant.llIIIIlIIllIll[7] = (0x28 ^ 0x21);
        ContainerMerchant.llIIIIlIIllIll[8] = (0x40 ^ 0x48);
        ContainerMerchant.llIIIIlIIllIll[9] = (0x7D ^ 0x6F);
        ContainerMerchant.llIIIIlIIllIll[10] = (0x14 ^ 0x40);
        ContainerMerchant.llIIIIlIIllIll[11] = "   ".length();
        ContainerMerchant.llIIIIlIIllIll[12] = (0x73 ^ 0x9) + (0x40 ^ 0x52) - (0x6F ^ 0x77) + (0x5B ^ 0x41);
        ContainerMerchant.llIIIIlIIllIll[13] = (0xB ^ 0x67 ^ (0x5 ^ 0x4E));
        ContainerMerchant.llIIIIlIIllIll[14] = (0x44 ^ 0x5A);
    }
    
    public void setCurrentRecipeIndex(final int llllllllllllIlllIlllIIIIIlIIlIlI) {
        this.merchantInventory.setCurrentRecipeIndex(llllllllllllIlllIlllIIIIIlIIlIlI);
    }
    
    public InventoryMerchant getMerchantInventory() {
        return this.merchantInventory;
    }
    
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
    }
    
    private static boolean lIIIIlllllIlIIIl(final Object llllllllllllIlllIlllIIIIIIIlIlII) {
        return llllllllllllIlllIlllIIIIIIIlIlII != null;
    }
    
    @Override
    public void updateProgressBar(final int llllllllllllIlllIlllIIIIIlIIlIII, final int llllllllllllIlllIlllIIIIIlIIIlll) {
    }
}
