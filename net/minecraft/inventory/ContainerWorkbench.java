// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ContainerWorkbench extends Container
{
    private static final /* synthetic */ int[] lIIlIIllIIIIlI;
    public /* synthetic */ InventoryCrafting craftMatrix;
    private /* synthetic */ World worldObj;
    private /* synthetic */ BlockPos pos;
    public /* synthetic */ IInventory craftResult;
    
    public ContainerWorkbench(final InventoryPlayer lllllllllllllIIllIllIllIIllIIlIl, final World lllllllllllllIIllIllIllIIlIllIll, final BlockPos lllllllllllllIIllIllIllIIllIIIll) {
        this.craftMatrix = new InventoryCrafting(this, ContainerWorkbench.lIIlIIllIIIIlI[0], ContainerWorkbench.lIIlIIllIIIIlI[0]);
        this.craftResult = new InventoryCraftResult();
        this.worldObj = lllllllllllllIIllIllIllIIlIllIll;
        this.pos = lllllllllllllIIllIllIllIIllIIIll;
        this.addSlotToContainer(new SlotCrafting(lllllllllllllIIllIllIllIIllIIlIl.player, this.craftMatrix, this.craftResult, ContainerWorkbench.lIIlIIllIIIIlI[1], ContainerWorkbench.lIIlIIllIIIIlI[2], ContainerWorkbench.lIIlIIllIIIIlI[3]));
        "".length();
        int lllllllllllllIIllIllIllIIllIIIlI = ContainerWorkbench.lIIlIIllIIIIlI[1];
        "".length();
        if ("  ".length() <= ((0x6D ^ 0x5A) & ~(0x2 ^ 0x35))) {
            throw null;
        }
        while (!llIIllIllIlllIl(lllllllllllllIIllIllIllIIllIIIlI, ContainerWorkbench.lIIlIIllIIIIlI[0])) {
            int lllllllllllllIIllIllIllIIllIIIIl = ContainerWorkbench.lIIlIIllIIIIlI[1];
            "".length();
            if (((0x30 ^ 0x16 ^ ((0x8A ^ 0x8E) & ~(0x66 ^ 0x62))) & (0x73 ^ 0x77 ^ (0xB8 ^ 0x9A) ^ -" ".length())) == -" ".length()) {
                throw null;
            }
            while (!llIIllIllIlllIl(lllllllllllllIIllIllIllIIllIIIIl, ContainerWorkbench.lIIlIIllIIIIlI[0])) {
                this.addSlotToContainer(new Slot(this.craftMatrix, lllllllllllllIIllIllIllIIllIIIIl + lllllllllllllIIllIllIllIIllIIIlI * ContainerWorkbench.lIIlIIllIIIIlI[0], ContainerWorkbench.lIIlIIllIIIIlI[4] + lllllllllllllIIllIllIllIIllIIIIl * ContainerWorkbench.lIIlIIllIIIIlI[5], ContainerWorkbench.lIIlIIllIIIIlI[6] + lllllllllllllIIllIllIllIIllIIIlI * ContainerWorkbench.lIIlIIllIIIIlI[5]));
                "".length();
                ++lllllllllllllIIllIllIllIIllIIIIl;
            }
            ++lllllllllllllIIllIllIllIIllIIIlI;
        }
        int lllllllllllllIIllIllIllIIllIIIII = ContainerWorkbench.lIIlIIllIIIIlI[1];
        "".length();
        if (" ".length() == ((123 + 124 - 226 + 122 ^ 28 + 21 + 60 + 59) & (0xA4 ^ 0x95 ^ (0x94 ^ 0x82) ^ -" ".length()))) {
            throw null;
        }
        while (!llIIllIllIlllIl(lllllllllllllIIllIllIllIIllIIIII, ContainerWorkbench.lIIlIIllIIIIlI[0])) {
            int lllllllllllllIIllIllIllIIlIlllll = ContainerWorkbench.lIIlIIllIIIIlI[1];
            "".length();
            if ((142 + 90 - 134 + 52 ^ 64 + 103 - 33 + 12) <= -" ".length()) {
                throw null;
            }
            while (!llIIllIllIlllIl(lllllllllllllIIllIllIllIIlIlllll, ContainerWorkbench.lIIlIIllIIIIlI[7])) {
                this.addSlotToContainer(new Slot(lllllllllllllIIllIllIllIIllIIlIl, lllllllllllllIIllIllIllIIlIlllll + lllllllllllllIIllIllIllIIllIIIII * ContainerWorkbench.lIIlIIllIIIIlI[7] + ContainerWorkbench.lIIlIIllIIIIlI[7], ContainerWorkbench.lIIlIIllIIIIlI[8] + lllllllllllllIIllIllIllIIlIlllll * ContainerWorkbench.lIIlIIllIIIIlI[5], ContainerWorkbench.lIIlIIllIIIIlI[9] + lllllllllllllIIllIllIllIIllIIIII * ContainerWorkbench.lIIlIIllIIIIlI[5]));
                "".length();
                ++lllllllllllllIIllIllIllIIlIlllll;
            }
            ++lllllllllllllIIllIllIllIIllIIIII;
        }
        int lllllllllllllIIllIllIllIIlIllllI = ContainerWorkbench.lIIlIIllIIIIlI[1];
        "".length();
        if (null != null) {
            throw null;
        }
        while (!llIIllIllIlllIl(lllllllllllllIIllIllIllIIlIllllI, ContainerWorkbench.lIIlIIllIIIIlI[7])) {
            this.addSlotToContainer(new Slot(lllllllllllllIIllIllIllIIllIIlIl, lllllllllllllIIllIllIllIIlIllllI, ContainerWorkbench.lIIlIIllIIIIlI[8] + lllllllllllllIIllIllIllIIlIllllI * ContainerWorkbench.lIIlIIllIIIIlI[5], ContainerWorkbench.lIIlIIllIIIIlI[10]));
            "".length();
            ++lllllllllllllIIllIllIllIIlIllllI;
        }
        this.onCraftMatrixChanged(this.craftMatrix);
    }
    
    @Override
    public boolean canMergeSlot(final ItemStack lllllllllllllIIllIllIllIIIlIlIII, final Slot lllllllllllllIIllIllIllIIIlIIlll) {
        if (llIIllIlllIIIIl(lllllllllllllIIllIllIllIIIlIIlll.inventory, this.craftResult) && llIIllIlllIIIll(super.canMergeSlot(lllllllllllllIIllIllIllIIIlIlIII, lllllllllllllIIllIllIllIIIlIIlll) ? 1 : 0)) {
            return ContainerWorkbench.lIIlIIllIIIIlI[11] != 0;
        }
        return ContainerWorkbench.lIIlIIllIIIIlI[1] != 0;
    }
    
    private static int llIIllIlllIIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean llIIllIlllIIIll(final int lllllllllllllIIllIllIllIIIIlIIll) {
        return lllllllllllllIIllIllIllIIIIlIIll != 0;
    }
    
    @Override
    public void onCraftMatrixChanged(final IInventory lllllllllllllIIllIllIllIIlIlIlIl) {
        this.craftResult.setInventorySlotContents(ContainerWorkbench.lIIlIIllIIIIlI[1], CraftingManager.getInstance().findMatchingRecipe(this.craftMatrix, this.worldObj));
    }
    
    private static boolean llIIllIlllIIIlI(final int lllllllllllllIIllIllIllIIIIIllll) {
        return lllllllllllllIIllIllIllIIIIIllll <= 0;
    }
    
    private static boolean llIIllIlllIIIIl(final Object lllllllllllllIIllIllIllIIIIllIII, final Object lllllllllllllIIllIllIllIIIIlIlll) {
        return lllllllllllllIIllIllIllIIIIllIII != lllllllllllllIIllIllIllIIIIlIlll;
    }
    
    private static boolean llIIllIlllIIlIl(final int lllllllllllllIIllIllIllIIIlIIlII, final int lllllllllllllIIllIllIllIIIlIIIll) {
        return lllllllllllllIIllIllIllIIIlIIlII == lllllllllllllIIllIllIllIIIlIIIll;
    }
    
    private static boolean llIIllIllIlllll(final Object lllllllllllllIIllIllIllIIIIlIlIl) {
        return lllllllllllllIIllIllIllIIIIlIlIl != null;
    }
    
    @Override
    public void onContainerClosed(final EntityPlayer lllllllllllllIIllIllIllIIlIIlIlI) {
        super.onContainerClosed(lllllllllllllIIllIllIllIIlIIlIlI);
        if (llIIllIllIllllI(this.worldObj.isRemote ? 1 : 0)) {
            int lllllllllllllIIllIllIllIIlIIllIl = ContainerWorkbench.lIIlIIllIIIIlI[1];
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
            while (!llIIllIllIlllIl(lllllllllllllIIllIllIllIIlIIllIl, ContainerWorkbench.lIIlIIllIIIIlI[7])) {
                final ItemStack lllllllllllllIIllIllIllIIlIIllII = this.craftMatrix.removeStackFromSlot(lllllllllllllIIllIllIllIIlIIllIl);
                if (llIIllIllIlllll(lllllllllllllIIllIllIllIIlIIllII)) {
                    lllllllllllllIIllIllIllIIlIIlIlI.dropPlayerItemWithRandomChoice(lllllllllllllIIllIllIllIIlIIllII, (boolean)(ContainerWorkbench.lIIlIIllIIIIlI[1] != 0));
                    "".length();
                }
                ++lllllllllllllIIllIllIllIIlIIllIl;
            }
        }
    }
    
    @Override
    public ItemStack transferStackInSlot(final EntityPlayer lllllllllllllIIllIllIllIIIlllIlI, final int lllllllllllllIIllIllIllIIIllIIll) {
        ItemStack lllllllllllllIIllIllIllIIIlllIII = null;
        final Slot lllllllllllllIIllIllIllIIIllIlll = this.inventorySlots.get(lllllllllllllIIllIllIllIIIllIIll);
        if (llIIllIllIlllll(lllllllllllllIIllIllIllIIIllIlll) && llIIllIlllIIIll(lllllllllllllIIllIllIllIIIllIlll.getHasStack() ? 1 : 0)) {
            final ItemStack lllllllllllllIIllIllIllIIIllIllI = lllllllllllllIIllIllIllIIIllIlll.getStack();
            lllllllllllllIIllIllIllIIIlllIII = lllllllllllllIIllIllIllIIIllIllI.copy();
            if (llIIllIllIllllI(lllllllllllllIIllIllIllIIIllIIll)) {
                if (llIIllIllIllllI(this.mergeItemStack(lllllllllllllIIllIllIllIIIllIllI, ContainerWorkbench.lIIlIIllIIIIlI[12], ContainerWorkbench.lIIlIIllIIIIlI[13], (boolean)(ContainerWorkbench.lIIlIIllIIIIlI[11] != 0)) ? 1 : 0)) {
                    return null;
                }
                lllllllllllllIIllIllIllIIIllIlll.onSlotChange(lllllllllllllIIllIllIllIIIllIllI, lllllllllllllIIllIllIllIIIlllIII);
                "".length();
                if (-"   ".length() > 0) {
                    return null;
                }
            }
            else if (llIIllIllIlllIl(lllllllllllllIIllIllIllIIIllIIll, ContainerWorkbench.lIIlIIllIIIIlI[12]) && llIIllIlllIIlII(lllllllllllllIIllIllIllIIIllIIll, ContainerWorkbench.lIIlIIllIIIIlI[14])) {
                if (llIIllIllIllllI(this.mergeItemStack(lllllllllllllIIllIllIllIIIllIllI, ContainerWorkbench.lIIlIIllIIIIlI[14], ContainerWorkbench.lIIlIIllIIIIlI[13], (boolean)(ContainerWorkbench.lIIlIIllIIIIlI[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIIllIllIlllIl(lllllllllllllIIllIllIllIIIllIIll, ContainerWorkbench.lIIlIIllIIIIlI[14]) && llIIllIlllIIlII(lllllllllllllIIllIllIllIIIllIIll, ContainerWorkbench.lIIlIIllIIIIlI[13])) {
                if (llIIllIllIllllI(this.mergeItemStack(lllllllllllllIIllIllIllIIIllIllI, ContainerWorkbench.lIIlIIllIIIIlI[12], ContainerWorkbench.lIIlIIllIIIIlI[14], (boolean)(ContainerWorkbench.lIIlIIllIIIIlI[1] != 0)) ? 1 : 0)) {
                    return null;
                }
            }
            else if (llIIllIllIllllI(this.mergeItemStack(lllllllllllllIIllIllIllIIIllIllI, ContainerWorkbench.lIIlIIllIIIIlI[12], ContainerWorkbench.lIIlIIllIIIIlI[13], (boolean)(ContainerWorkbench.lIIlIIllIIIIlI[1] != 0)) ? 1 : 0)) {
                return null;
            }
            if (llIIllIllIllllI(lllllllllllllIIllIllIllIIIllIllI.stackSize)) {
                lllllllllllllIIllIllIllIIIllIlll.putStack(null);
                "".length();
                if (" ".length() != " ".length()) {
                    return null;
                }
            }
            else {
                lllllllllllllIIllIllIllIIIllIlll.onSlotChanged();
            }
            if (llIIllIlllIIlIl(lllllllllllllIIllIllIllIIIllIllI.stackSize, lllllllllllllIIllIllIllIIIlllIII.stackSize)) {
                return null;
            }
            lllllllllllllIIllIllIllIIIllIlll.onPickupFromSlot(lllllllllllllIIllIllIllIIIlllIlI, lllllllllllllIIllIllIllIIIllIllI);
        }
        return lllllllllllllIIllIllIllIIIlllIII;
    }
    
    private static boolean llIIllIlllIIlII(final int lllllllllllllIIllIllIllIIIIlllII, final int lllllllllllllIIllIllIllIIIIllIll) {
        return lllllllllllllIIllIllIllIIIIlllII < lllllllllllllIIllIllIllIIIIllIll;
    }
    
    private static boolean llIIllIllIllllI(final int lllllllllllllIIllIllIllIIIIlIIIl) {
        return lllllllllllllIIllIllIllIIIIlIIIl == 0;
    }
    
    @Override
    public boolean canInteractWith(final EntityPlayer lllllllllllllIIllIllIllIIlIIIlII) {
        int n;
        if (llIIllIlllIIIIl(this.worldObj.getBlockState(this.pos).getBlock(), Blocks.crafting_table)) {
            n = ContainerWorkbench.lIIlIIllIIIIlI[1];
            "".length();
            if (-" ".length() >= ((0x67 ^ 0x3E) & ~(0x1B ^ 0x42))) {
                return ((0xB4 ^ 0xB8) & ~(0x27 ^ 0x2B)) != 0x0;
            }
        }
        else if (llIIllIlllIIIlI(llIIllIlllIIIII(lllllllllllllIIllIllIllIIlIIIlII.getDistanceSq(this.pos.getX() + 0.5, this.pos.getY() + 0.5, this.pos.getZ() + 0.5), 64.0))) {
            n = ContainerWorkbench.lIIlIIllIIIIlI[11];
            "".length();
            if (-"   ".length() > 0) {
                return ((0x0 ^ 0x25 ^ (0xA ^ 0x6)) & (157 + 93 - 216 + 131 ^ 30 + 18 - 9 + 101 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ContainerWorkbench.lIIlIIllIIIIlI[1];
        }
        return n != 0;
    }
    
    static {
        llIIllIllIlllII();
    }
    
    private static boolean llIIllIllIlllIl(final int lllllllllllllIIllIllIllIIIlIIIII, final int lllllllllllllIIllIllIllIIIIlllll) {
        return lllllllllllllIIllIllIllIIIlIIIII >= lllllllllllllIIllIllIllIIIIlllll;
    }
    
    private static void llIIllIllIlllII() {
        (lIIlIIllIIIIlI = new int[15])[0] = "   ".length();
        ContainerWorkbench.lIIlIIllIIIIlI[1] = ((0xAF ^ 0xC0 ^ (0x71 ^ 0x2B)) & (0x19 ^ 0x64 ^ (0x68 ^ 0x20) ^ -" ".length()));
        ContainerWorkbench.lIIlIIllIIIIlI[2] = (0x20 ^ 0x46 ^ (0x95 ^ 0x8F));
        ContainerWorkbench.lIIlIIllIIIIlI[3] = (0x2C ^ 0xF);
        ContainerWorkbench.lIIlIIllIIIIlI[4] = (0xB ^ 0x1C ^ (0xB7 ^ 0xBE));
        ContainerWorkbench.lIIlIIllIIIIlI[5] = (0x1C ^ 0xE);
        ContainerWorkbench.lIIlIIllIIIIlI[6] = (0x1C ^ 0x28 ^ (0x62 ^ 0x47));
        ContainerWorkbench.lIIlIIllIIIIlI[7] = (0xBF ^ 0xB6);
        ContainerWorkbench.lIIlIIllIIIIlI[8] = (0xE4 ^ 0xAE ^ (0x65 ^ 0x27));
        ContainerWorkbench.lIIlIIllIIIIlI[9] = (0xF4 ^ 0xA0);
        ContainerWorkbench.lIIlIIllIIIIlI[10] = 47 + 4 - 25 + 116;
        ContainerWorkbench.lIIlIIllIIIIlI[11] = " ".length();
        ContainerWorkbench.lIIlIIllIIIIlI[12] = (0xB0 ^ 0xBA);
        ContainerWorkbench.lIIlIIllIIIIlI[13] = (66 + 18 + 23 + 36 ^ 102 + 88 - 59 + 30);
        ContainerWorkbench.lIIlIIllIIIIlI[14] = (0x1 ^ 0x76 ^ (0x3C ^ 0x6E));
    }
}
