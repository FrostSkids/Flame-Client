// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;

public class ContainerFurnace extends Container
{
    private /* synthetic */ int field_178155_i;
    private /* synthetic */ int field_178152_f;
    private /* synthetic */ int field_178153_g;
    private final /* synthetic */ IInventory tileFurnace;
    private static final /* synthetic */ int[] lIIIlIllllIIlI;
    private /* synthetic */ int field_178154_h;
    
    private static boolean llIIIIlIIIllIII(final int lllllllllllllIlIIIIlIIlIllllIIIl, final int lllllllllllllIlIIIIlIIlIllllIIII) {
        return lllllllllllllIlIIIIlIIlIllllIIIl < lllllllllllllIlIIIIlIIlIllllIIII;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer lllllllllllllIlIIIIlIIllIIIlIIII) {
        return this.tileFurnace.isUseableByPlayer(lllllllllllllIlIIIIlIIllIIIlIIII);
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer lllllllllllllIlIIIIlIIllIIIIIIII, final int lllllllllllllIlIIIIlIIllIIIIIlIl) {
        ItemStack lllllllllllllIlIIIIlIIllIIIIIlII = null;
        final Slot lllllllllllllIlIIIIlIIllIIIIIIll = this.inventorySlots.get(lllllllllllllIlIIIIlIIllIIIIIlIl);
        if (llIIIIlIIIlIlII(lllllllllllllIlIIIIlIIllIIIIIIll) && llIIIIlIIIlIlIl(lllllllllllllIlIIIIlIIllIIIIIIll.getHasStack() ? 1 : 0)) {
            final ItemStack lllllllllllllIlIIIIlIIllIIIIIIlI = lllllllllllllIlIIIIlIIllIIIIIIll.getStack();
            lllllllllllllIlIIIIlIIllIIIIIlII = lllllllllllllIlIIIIlIIllIIIIIIlI.copy();
            if (llIIIIlIIIlIllI(lllllllllllllIlIIIIlIIllIIIIIlIl, ContainerFurnace.lIIIlIllllIIlI[5])) {
                if (llIIIIlIIIlIlll(this.mergeItemStack(lllllllllllllIlIIIIlIIllIIIIIIlI, ContainerFurnace.lIIIlIllllIIlI[12], ContainerFurnace.lIIIlIllllIIlI[14], (boolean)(ContainerFurnace.lIIIlIllllIIlI[3] != 0)) ? 1 : 0)) {
                    return null;
                }
                lllllllllllllIlIIIIlIIllIIIIIIll.onSlotChange(lllllllllllllIlIIIIlIIllIIIIIIlI, lllllllllllllIlIIIIlIIllIIIIIlII);
                "".length();
                if (-" ".length() > " ".length()) {
                    return null;
                }
            }
            else if (llIIIIlIIIlIIll(lllllllllllllIlIIIIlIIllIIIIIlIl, ContainerFurnace.lIIIlIllllIIlI[3]) && llIIIIlIIIlIlIl(lllllllllllllIlIIIIlIIllIIIIIlIl)) {
                if (llIIIIlIIIlIlII(FurnaceRecipes.instance().getSmeltingResult(lllllllllllllIlIIIIlIIllIIIIIIlI))) {
                    if (llIIIIlIIIlIlll(this.mergeItemStack(lllllllllllllIlIIIIlIIllIIIIIIlI, ContainerFurnace.lIIIlIllllIIlI[0], ContainerFurnace.lIIIlIllllIIlI[3], (boolean)(ContainerFurnace.lIIIlIllllIIlI[0] != 0)) ? 1 : 0)) {
                        return null;
                    }
                }
                else if (llIIIIlIIIlIlIl(TileEntityFurnace.isItemFuel(lllllllllllllIlIIIIlIIllIIIIIIlI) ? 1 : 0)) {
                    if (llIIIIlIIIlIlll(this.mergeItemStack(lllllllllllllIlIIIIlIIllIIIIIIlI, ContainerFurnace.lIIIlIllllIIlI[3], ContainerFurnace.lIIIlIllllIIlI[5], (boolean)(ContainerFurnace.lIIIlIllllIIlI[0] != 0)) ? 1 : 0)) {
                        return null;
                    }
                }
                else if (llIIIIlIIIlIIlI(lllllllllllllIlIIIIlIIllIIIIIlIl, ContainerFurnace.lIIIlIllllIIlI[12]) && llIIIIlIIIllIII(lllllllllllllIlIIIIlIIllIIIIIlIl, ContainerFurnace.lIIIlIllllIIlI[15])) {
                    if (llIIIIlIIIlIlll(this.mergeItemStack(lllllllllllllIlIIIIlIIllIIIIIIlI, ContainerFurnace.lIIIlIllllIIlI[15], ContainerFurnace.lIIIlIllllIIlI[14], (boolean)(ContainerFurnace.lIIIlIllllIIlI[0] != 0)) ? 1 : 0)) {
                        return null;
                    }
                }
                else if (llIIIIlIIIlIIlI(lllllllllllllIlIIIIlIIllIIIIIlIl, ContainerFurnace.lIIIlIllllIIlI[15]) && llIIIIlIIIllIII(lllllllllllllIlIIIIlIIllIIIIIlIl, ContainerFurnace.lIIIlIllllIIlI[14]) && llIIIIlIIIlIlll(this.mergeItemStack(lllllllllllllIlIIIIlIIllIIIIIIlI, ContainerFurnace.lIIIlIllllIIlI[12], ContainerFurnace.lIIIlIllllIIlI[15], (boolean)(ContainerFurnace.lIIIlIllllIIlI[0] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIIIIlIIIlIlll(this.mergeItemStack(lllllllllllllIlIIIIlIIllIIIIIIlI, ContainerFurnace.lIIIlIllllIIlI[12], ContainerFurnace.lIIIlIllllIIlI[14], (boolean)(ContainerFurnace.lIIIlIllllIIlI[0] != 0)) ? 1 : 0)) {
                return null;
            }
            if (llIIIIlIIIlIlll(lllllllllllllIlIIIIlIIllIIIIIIlI.stackSize)) {
                lllllllllllllIlIIIIlIIllIIIIIIll.putStack(null);
                "".length();
                if (" ".length() == (0x1D ^ 0x19)) {
                    return null;
                }
            }
            else {
                lllllllllllllIlIIIIlIIllIIIIIIll.onSlotChanged();
            }
            if (llIIIIlIIIlIllI(lllllllllllllIlIIIIlIIllIIIIIIlI.stackSize, lllllllllllllIlIIIIlIIllIIIIIlII.stackSize)) {
                return null;
            }
            lllllllllllllIlIIIIlIIllIIIIIIll.onPickupFromSlot(lllllllllllllIlIIIIlIIllIIIIIIII, lllllllllllllIlIIIIlIIllIIIIIIlI);
        }
        return lllllllllllllIlIIIIlIIllIIIIIlII;
    }
    
    private static void llIIIIlIIIlIIIl() {
        (lIIIlIllllIIlI = new int[16])[0] = ((0x56 ^ 0xA) & ~(0xE3 ^ 0xBF));
        ContainerFurnace.lIIIlIllllIIlI[1] = (0x91 ^ 0x8A ^ (0xBD ^ 0x9E));
        ContainerFurnace.lIIIlIllllIIlI[2] = (0x41 ^ 0x50);
        ContainerFurnace.lIIIlIllllIIlI[3] = " ".length();
        ContainerFurnace.lIIIlIllllIIlI[4] = (0x54 ^ 0x61);
        ContainerFurnace.lIIIlIllllIIlI[5] = "  ".length();
        ContainerFurnace.lIIIlIllllIIlI[6] = (0xE7 ^ 0x93);
        ContainerFurnace.lIIIlIllllIIlI[7] = (0x4B ^ 0x68);
        ContainerFurnace.lIIIlIllllIIlI[8] = (0x92 ^ 0x9B);
        ContainerFurnace.lIIIlIllllIIlI[9] = (0xA4 ^ 0xAC);
        ContainerFurnace.lIIIlIllllIIlI[10] = (0x46 ^ 0x54);
        ContainerFurnace.lIIIlIllllIIlI[11] = (0xE4 ^ 0xB0);
        ContainerFurnace.lIIIlIllllIIlI[12] = "   ".length();
        ContainerFurnace.lIIIlIllllIIlI[13] = 96 + 123 - 83 + 6;
        ContainerFurnace.lIIIlIllllIIlI[14] = (0x80 ^ 0xA7);
        ContainerFurnace.lIIIlIllllIIlI[15] = (0x3F ^ 0x21);
    }
    
    private static boolean llIIIIlIIIlIlII(final Object lllllllllllllIlIIIIlIIlIlllIlllI) {
        return lllllllllllllIlIIIIlIIlIlllIlllI != null;
    }
    
    private static boolean llIIIIlIIIlIlll(final int lllllllllllllIlIIIIlIIlIlllIlIlI) {
        return lllllllllllllIlIIIIlIIlIlllIlIlI == 0;
    }
    
    public ContainerFurnace(final InventoryPlayer lllllllllllllIlIIIIlIIllIIllIlIl, final IInventory lllllllllllllIlIIIIlIIllIIlIlllI) {
        this.tileFurnace = lllllllllllllIlIIIIlIIllIIlIlllI;
        this.addSlotToContainer(new Slot(lllllllllllllIlIIIIlIIllIIlIlllI, ContainerFurnace.lIIIlIllllIIlI[0], ContainerFurnace.lIIIlIllllIIlI[1], ContainerFurnace.lIIIlIllllIIlI[2]));
        "".length();
        this.addSlotToContainer(new SlotFurnaceFuel(lllllllllllllIlIIIIlIIllIIlIlllI, ContainerFurnace.lIIIlIllllIIlI[3], ContainerFurnace.lIIIlIllllIIlI[1], ContainerFurnace.lIIIlIllllIIlI[4]));
        "".length();
        this.addSlotToContainer(new SlotFurnaceOutput(lllllllllllllIlIIIIlIIllIIllIlIl.player, lllllllllllllIlIIIIlIIllIIlIlllI, ContainerFurnace.lIIIlIllllIIlI[5], ContainerFurnace.lIIIlIllllIIlI[6], ContainerFurnace.lIIIlIllllIIlI[7]));
        "".length();
        int lllllllllllllIlIIIIlIIllIIllIIll = ContainerFurnace.lIIIlIllllIIlI[0];
        "".length();
        if (-" ".length() > ((0x87 ^ 0x9A ^ (0xD9 ^ 0x87)) & (0xB7 ^ 0x88 ^ (0xF3 ^ 0x8F) ^ -" ".length()))) {
            throw null;
        }
        while (!llIIIIlIIIlIIlI(lllllllllllllIlIIIIlIIllIIllIIll, ContainerFurnace.lIIIlIllllIIlI[12])) {
            int lllllllllllllIlIIIIlIIllIIllIIlI = ContainerFurnace.lIIIlIllllIIlI[0];
            "".length();
            if ("  ".length() <= " ".length()) {
                throw null;
            }
            while (!llIIIIlIIIlIIlI(lllllllllllllIlIIIIlIIllIIllIIlI, ContainerFurnace.lIIIlIllllIIlI[8])) {
                this.addSlotToContainer(new Slot(lllllllllllllIlIIIIlIIllIIllIlIl, lllllllllllllIlIIIIlIIllIIllIIlI + lllllllllllllIlIIIIlIIllIIllIIll * ContainerFurnace.lIIIlIllllIIlI[8] + ContainerFurnace.lIIIlIllllIIlI[8], ContainerFurnace.lIIIlIllllIIlI[9] + lllllllllllllIlIIIIlIIllIIllIIlI * ContainerFurnace.lIIIlIllllIIlI[10], ContainerFurnace.lIIIlIllllIIlI[11] + lllllllllllllIlIIIIlIIllIIllIIll * ContainerFurnace.lIIIlIllllIIlI[10]));
                "".length();
                ++lllllllllllllIlIIIIlIIllIIllIIlI;
            }
            ++lllllllllllllIlIIIIlIIllIIllIIll;
        }
        int lllllllllllllIlIIIIlIIllIIllIIIl = ContainerFurnace.lIIIlIllllIIlI[0];
        "".length();
        if ("  ".length() <= ((33 + 44 + 30 + 32 ^ 66 + 118 - 71 + 40) & (0xC5 ^ 0xC3 ^ (0x34 ^ 0x20) ^ -" ".length()))) {
            throw null;
        }
        while (!llIIIIlIIIlIIlI(lllllllllllllIlIIIIlIIllIIllIIIl, ContainerFurnace.lIIIlIllllIIlI[8])) {
            this.addSlotToContainer(new Slot(lllllllllllllIlIIIIlIIllIIllIlIl, lllllllllllllIlIIIIlIIllIIllIIIl, ContainerFurnace.lIIIlIllllIIlI[9] + lllllllllllllIlIIIIlIIllIIllIIIl * ContainerFurnace.lIIIlIllllIIlI[10], ContainerFurnace.lIIIlIllllIIlI[13]));
            "".length();
            ++lllllllllllllIlIIIIlIIllIIllIIIl;
        }
    }
    
    private static boolean llIIIIlIIIlIlIl(final int lllllllllllllIlIIIIlIIlIlllIllII) {
        return lllllllllllllIlIIIIlIIlIlllIllII != 0;
    }
    
    @Override
    public void updateProgressBar(final int lllllllllllllIlIIIIlIIllIIIlIlIl, final int lllllllllllllIlIIIIlIIllIIIlIlll) {
        this.tileFurnace.setField(lllllllllllllIlIIIIlIIllIIIlIlIl, lllllllllllllIlIIIIlIIllIIIlIlll);
    }
    
    private static boolean llIIIIlIIIlIIll(final int lllllllllllllIlIIIIlIIlIlllIIlll, final int lllllllllllllIlIIIIlIIlIlllIIllI) {
        return lllllllllllllIlIIIIlIIlIlllIIlll != lllllllllllllIlIIIIlIIlIlllIIllI;
    }
    
    private static boolean llIIIIlIIIlIIlI(final int lllllllllllllIlIIIIlIIlIllllIlIl, final int lllllllllllllIlIIIIlIIlIllllIlII) {
        return lllllllllllllIlIIIIlIIlIllllIlIl >= lllllllllllllIlIIIIlIIlIllllIlII;
    }
    
    static {
        llIIIIlIIIlIIIl();
    }
    
    @Override
    public void onCraftGuiOpened(final ICrafting lllllllllllllIlIIIIlIIllIIlIlIII) {
        super.onCraftGuiOpened(lllllllllllllIlIIIIlIIllIIlIlIII);
        lllllllllllllIlIIIIlIIllIIlIlIII.func_175173_a(this, this.tileFurnace);
    }
    
    private static boolean llIIIIlIIIlIllI(final int lllllllllllllIlIIIIlIIlIlllllIIl, final int lllllllllllllIlIIIIlIIlIlllllIII) {
        return lllllllllllllIlIIIIlIIlIlllllIIl == lllllllllllllIlIIIIlIIlIlllllIII;
    }
    
    @Override
    public void detectAndSendChanges() {
        super.detectAndSendChanges();
        int lllllllllllllIlIIIIlIIllIIlIIIIl = ContainerFurnace.lIIIlIllllIIlI[0];
        "".length();
        if (-(0x86 ^ 0x82) >= 0) {
            return;
        }
        while (!llIIIIlIIIlIIlI(lllllllllllllIlIIIIlIIllIIlIIIIl, this.crafters.size())) {
            final ICrafting lllllllllllllIlIIIIlIIllIIlIIIII = this.crafters.get(lllllllllllllIlIIIIlIIllIIlIIIIl);
            if (llIIIIlIIIlIIll(this.field_178152_f, this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[5]))) {
                lllllllllllllIlIIIIlIIllIIlIIIII.sendProgressBarUpdate(this, ContainerFurnace.lIIIlIllllIIlI[5], this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[5]));
            }
            if (llIIIIlIIIlIIll(this.field_178154_h, this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[0]))) {
                lllllllllllllIlIIIIlIIllIIlIIIII.sendProgressBarUpdate(this, ContainerFurnace.lIIIlIllllIIlI[0], this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[0]));
            }
            if (llIIIIlIIIlIIll(this.field_178155_i, this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[3]))) {
                lllllllllllllIlIIIIlIIllIIlIIIII.sendProgressBarUpdate(this, ContainerFurnace.lIIIlIllllIIlI[3], this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[3]));
            }
            if (llIIIIlIIIlIIll(this.field_178153_g, this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[12]))) {
                lllllllllllllIlIIIIlIIllIIlIIIII.sendProgressBarUpdate(this, ContainerFurnace.lIIIlIllllIIlI[12], this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[12]));
            }
            ++lllllllllllllIlIIIIlIIllIIlIIIIl;
        }
        this.field_178152_f = this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[5]);
        this.field_178154_h = this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[0]);
        this.field_178155_i = this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[3]);
        this.field_178153_g = this.tileFurnace.getField(ContainerFurnace.lIIIlIllllIIlI[12]);
    }
}
